import java.util.*;
import com.systemj.ClockDomain;
import com.systemj.Signal;
import com.systemj.input_Channel;
import com.systemj.output_Channel;

public class CD extends ClockDomain{
  public CD(String name){super(name);}
  Vector currsigs = new Vector();
  private boolean df = false;
  private char [] active;
  private char [] paused;
  private char [] suspended;
  private Signal A_1;
  private int S7 = 1;
  private int S3 = 1;
  
  private int[] ends = new int[4];
  private int[] tdone = new int[4];
  
  public void thread13(int [] tdone, int [] ends){
        active[3]=0;
    ends[3]=0;
    tdone[3]=1;
  }

  public void thread12(int [] tdone, int [] ends){
        switch(S3){
      case 0 : 
        active[2]=0;
        ends[2]=0;
        tdone[2]=1;
        break;
      
      case 1 : 
        if(A_1.getprestatus()){//sysj/Exercise1.sysj line: 4, column: 9
          System.out.println("Got a");//sysj/Exercise1.sysj line: 5, column: 3
          S3=0;
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

  public void thread10(int [] tdone, int [] ends){
        A_1.setPresent();//sysj/Exercise1.sysj line: 9, column: 3
    currsigs.addElement(A_1);
    System.out.println("Emitted A_1");
    active[3]=0;
    ends[3]=0;
    tdone[3]=1;
  }

  public void thread9(int [] tdone, int [] ends){
        S3=1;
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
      switch(S7){
        case 0 : 
          S7=0;
          break RUN;
        
        case 1 : 
          S7=2;
          S7=2;
          A_1.setClear();//sysj/Exercise1.sysj line: 2, column: 2
          thread9(tdone,ends);
          thread10(tdone,ends);
          int biggest11 = 0;
          if(ends[2]>=biggest11){
            biggest11=ends[2];
          }
          if(ends[3]>=biggest11){
            biggest11=ends[3];
          }
          if(biggest11 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
        
        case 2 : 
          A_1.setClear();//sysj/Exercise1.sysj line: 2, column: 2
          thread12(tdone,ends);
          thread13(tdone,ends);
          int biggest14 = 0;
          if(ends[2]>=biggest14){
            biggest14=ends[2];
          }
          if(ends[3]>=biggest14){
            biggest14=ends[3];
          }
          if(biggest14 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
          //FINXME code
          if(biggest14 == 0){
            S7=0;
            active[1]=0;
            ends[1]=0;
            S7=0;
            break RUN;
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
    A_1 = new Signal();
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
          df = true;
        }
        runClockDomain();
      }
      A_1.setpreclear();
      int dummyint = 0;
      for(int qw=0;qw<currsigs.size();++qw){
        dummyint = ((Signal)currsigs.elementAt(qw)).getStatus() ? ((Signal)currsigs.elementAt(qw)).setprepresent() : ((Signal)currsigs.elementAt(qw)).setpreclear();
        ((Signal)currsigs.elementAt(qw)).setpreval(((Signal)currsigs.elementAt(qw)).getValue());
      }
      currsigs.removeAllElements();
      A_1.setClear();
      if(paused[1]!=0 || suspended[1]!=0 || active[1]!=1);
      else{
      }
      runFinisher();
      if(active[1] == 0){
      	this.terminated = true;
      }
      if(!threaded) break;
    }
  }
}
