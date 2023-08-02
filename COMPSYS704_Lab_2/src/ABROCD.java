import java.util.*;
import com.systemj.ClockDomain;
import com.systemj.Signal;
import com.systemj.input_Channel;
import com.systemj.output_Channel;

public class ABROCD extends ClockDomain{
  public ABROCD(String name){super(name);}
  Vector currsigs = new Vector();
  private boolean df = false;
  private char [] active;
  private char [] paused;
  private char [] suspended;
  public Signal A = new Signal("A", Signal.INPUT);
  public Signal B = new Signal("B", Signal.INPUT);
  public Signal R = new Signal("R", Signal.INPUT);
  public Signal O = new Signal("O", Signal.OUTPUT);
  private int S25 = 1;
  private int S6 = 1;
  private int S2 = 1;
  private int S5 = 1;
  
  private int[] ends = new int[4];
  private int[] tdone = new int[4];
  
  public void thread34(int [] tdone, int [] ends){
        switch(S5){
      case 0 : 
        active[3]=0;
        ends[3]=0;
        tdone[3]=1;
        break;
      
      case 1 : 
        if(B.getprestatus()){//sysj/Exercise3.sysj line: 7, column: 24
          S5=0;
          active[3]=0;
          ends[3]=0;
          tdone[3]=1;
        }
        else {
          active[3]=1;
          ends[3]=1;
          tdone[3]=1;
        }
        break;
      
    }
  }

  public void thread33(int [] tdone, int [] ends){
        switch(S2){
      case 0 : 
        active[2]=0;
        ends[2]=0;
        tdone[2]=1;
        break;
      
      case 1 : 
        if(A.getprestatus()){//sysj/Exercise3.sysj line: 7, column: 11
          S2=0;
          active[2]=0;
          ends[2]=0;
          tdone[2]=1;
        }
        else {
          active[2]=1;
          ends[2]=1;
          tdone[2]=1;
        }
        break;
      
    }
  }

  public void thread31(int [] tdone, int [] ends){
        S5=1;
    active[3]=1;
    ends[3]=1;
    tdone[3]=1;
  }

  public void thread30(int [] tdone, int [] ends){
        S2=1;
    active[2]=1;
    ends[2]=1;
    tdone[2]=1;
  }

  public void thread28(int [] tdone, int [] ends){
        S5=1;
    active[3]=1;
    ends[3]=1;
    tdone[3]=1;
  }

  public void thread27(int [] tdone, int [] ends){
        S2=1;
    active[2]=1;
    ends[2]=1;
    tdone[2]=1;
  }

  public void runClockDomain(){
    for(int i=0;i<ends.length;i++){
      ends[i] = 0;
      tdone[i] = 0;
    }
    
    RUN: while(true){
      switch(S25){
        case 0 : 
          S25=0;
          break RUN;
        
        case 1 : 
          S25=2;
          S25=2;
          S6=0;
          thread27(tdone,ends);
          thread28(tdone,ends);
          int biggest29 = 0;
          if(ends[2]>=biggest29){
            biggest29=ends[2];
          }
          if(ends[3]>=biggest29){
            biggest29=ends[3];
          }
          if(biggest29 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
        
        case 2 : 
          if(R.getprestatus()){//sysj/Exercise3.sysj line: 6, column: 9
            S6=0;
            thread30(tdone,ends);
            thread31(tdone,ends);
            int biggest32 = 0;
            if(ends[2]>=biggest32){
              biggest32=ends[2];
            }
            if(ends[3]>=biggest32){
              biggest32=ends[3];
            }
            if(biggest32 == 1){
              active[1]=1;
              ends[1]=1;
              break RUN;
            }
          }
          else {
            switch(S6){
              case 0 : 
                thread33(tdone,ends);
                thread34(tdone,ends);
                int biggest35 = 0;
                if(ends[2]>=biggest35){
                  biggest35=ends[2];
                }
                if(ends[3]>=biggest35){
                  biggest35=ends[3];
                }
                if(biggest35 == 1){
                  active[1]=1;
                  ends[1]=1;
                  break RUN;
                }
                //FINXME code
                if(biggest35 == 0){
                  O.setPresent();//sysj/Exercise3.sysj line: 8, column: 4
                  currsigs.addElement(O);
                  System.out.println("Emitted O");
                  S6=1;
                  active[1]=1;
                  ends[1]=1;
                  break RUN;
                }
              
              case 1 : 
                active[1]=1;
                ends[1]=1;
                break RUN;
              
            }
          }
        
      }
    }
  }

  public void init(){
    char [] active1 = {1, 1, 1, 1};
    char [] paused1 = {0, 0, 0, 0};
    char [] suspended1 = {0, 0, 0, 0};
    paused = paused1;
    active = active1;
    suspended = suspended1;
    // Now instantiate all the local signals ONLY
    // --------------------------------------------------
  }
  
  public void run(){
    while(active[1] != 0){
      int index = 1;
      if(paused[index]==1 || suspended[index]==1 || active[index] == 0){
        for(int h=1;h<paused.length;++h){
          paused[h]=0;
        }
      }
      if(paused[1]!=0 || suspended[1]!=0 || active[1]!=1);
      else{
        if(!df){
          A.gethook();
          B.gethook();
          R.gethook();
          df = true;
        }
        runClockDomain();
      }
      A.setpreclear();
      B.setpreclear();
      R.setpreclear();
      O.setpreclear();
      int dummyint = 0;
      for(int qw=0;qw<currsigs.size();++qw){
        dummyint = ((Signal)currsigs.elementAt(qw)).getStatus() ? ((Signal)currsigs.elementAt(qw)).setprepresent() : ((Signal)currsigs.elementAt(qw)).setpreclear();
        ((Signal)currsigs.elementAt(qw)).setpreval(((Signal)currsigs.elementAt(qw)).getValue());
      }
      currsigs.removeAllElements();
      dummyint = A.getStatus() ? A.setprepresent() : A.setpreclear();
      A.setpreval(A.getValue());
      A.setClear();
      dummyint = B.getStatus() ? B.setprepresent() : B.setpreclear();
      B.setpreval(B.getValue());
      B.setClear();
      dummyint = R.getStatus() ? R.setprepresent() : R.setpreclear();
      R.setpreval(R.getValue());
      R.setClear();
      O.sethook();
      O.setClear();
      if(paused[1]!=0 || suspended[1]!=0 || active[1]!=1);
      else{
        A.gethook();
        B.gethook();
        R.gethook();
      }
      runFinisher();
      if(active[1] == 0){
      	this.terminated = true;
      }
      if(!threaded) break;
    }
  }
}
