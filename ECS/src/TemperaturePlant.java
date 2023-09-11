import java.util.*;
import com.systemj.ClockDomain;
import com.systemj.Signal;
import com.systemj.input_Channel;
import com.systemj.output_Channel;

public class TemperaturePlant extends ClockDomain{
  public TemperaturePlant(String name){super(name);}
  Vector currsigs = new Vector();
  private boolean df = false;
  private char [] active;
  private char [] paused;
  private char [] suspended;
  public Signal getTemp1 = new Signal("getTemp1", Signal.INPUT);
  public Signal window1 = new Signal("window1", Signal.INPUT);
  public Signal openedWindow1 = new Signal("openedWindow1", Signal.OUTPUT);
  public Signal getTemp1R = new Signal("getTemp1R", Signal.OUTPUT);
  private int zone1Temp_thread_2;//sysj\plant.sysj line: 10, column: 3
  private int S2827 = 1;
  private int S2817 = 1;
  private int S2785 = 1;
  private int S2825 = 1;
  private int S2819 = 1;
  
  private int[] ends = new int[7];
  private int[] tdone = new int[7];
  
  public void thread2884(int [] tdone, int [] ends){
        switch(S2825){
      case 0 : 
        active[3]=0;
        ends[3]=0;
        tdone[3]=1;
        break;
      
      case 1 : 
        switch(S2819){
          case 0 : 
            S2819=1;
            active[3]=1;
            ends[3]=1;
            tdone[3]=1;
            break;
          
          case 1 : 
            S2819=1;
            S2819=0;
            if(window1.getprestatus()){//sysj\plant.sysj line: 26, column: 12
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            else {
              S2819=1;
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread2883(int [] tdone, int [] ends){
        switch(S2817){
      case 0 : 
        active[2]=0;
        ends[2]=0;
        tdone[2]=1;
        break;
      
      case 1 : 
        switch(S2785){
          case 0 : 
            getTemp1R.setPresent();//sysj\plant.sysj line: 13, column: 5
            currsigs.addElement(getTemp1R);
            getTemp1R.setValue(zone1Temp_thread_2);//sysj\plant.sysj line: 13, column: 5
            active[2]=1;
            ends[2]=1;
            tdone[2]=1;
            break;
          
          case 1 : 
            S2785=1;
            S2785=2;
            active[2]=1;
            ends[2]=1;
            tdone[2]=1;
            break;
          
          case 2 : 
            S2785=2;
            S2785=0;
            if(getTemp1.getprestatus()){//sysj\plant.sysj line: 12, column: 12
              getTemp1R.setPresent();//sysj\plant.sysj line: 13, column: 5
              currsigs.addElement(getTemp1R);
              getTemp1R.setValue(zone1Temp_thread_2);//sysj\plant.sysj line: 13, column: 5
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            else {
              S2785=1;
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread2881(int [] tdone, int [] ends){
        S2825=1;
    S2819=0;
    if(window1.getprestatus()){//sysj\plant.sysj line: 26, column: 12
      active[3]=1;
      ends[3]=1;
      tdone[3]=1;
    }
    else {
      S2819=1;
      active[3]=1;
      ends[3]=1;
      tdone[3]=1;
    }
  }

  public void thread2880(int [] tdone, int [] ends){
        S2817=1;
    zone1Temp_thread_2 = 32;//sysj\plant.sysj line: 10, column: 3
    S2785=0;
    if(getTemp1.getprestatus()){//sysj\plant.sysj line: 12, column: 12
      getTemp1R.setPresent();//sysj\plant.sysj line: 13, column: 5
      currsigs.addElement(getTemp1R);
      getTemp1R.setValue(zone1Temp_thread_2);//sysj\plant.sysj line: 13, column: 5
      active[2]=1;
      ends[2]=1;
      tdone[2]=1;
    }
    else {
      S2785=1;
      active[2]=1;
      ends[2]=1;
      tdone[2]=1;
    }
  }

  public void runClockDomain(){
    for(int i=0;i<ends.length;i++){
      ends[i] = 0;
      tdone[i] = 0;
    }
    
    RUN: while(true){
      switch(S2827){
        case 0 : 
          S2827=0;
          break RUN;
        
        case 1 : 
          S2827=2;
          S2827=2;
          thread2880(tdone,ends);
          thread2881(tdone,ends);
          int biggest2882 = 0;
          if(ends[2]>=biggest2882){
            biggest2882=ends[2];
          }
          if(ends[3]>=biggest2882){
            biggest2882=ends[3];
          }
          if(biggest2882 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
        
        case 2 : 
          thread2883(tdone,ends);
          thread2884(tdone,ends);
          int biggest2885 = 0;
          if(ends[2]>=biggest2885){
            biggest2885=ends[2];
          }
          if(ends[3]>=biggest2885){
            biggest2885=ends[3];
          }
          if(biggest2885 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
          //FINXME code
          if(biggest2885 == 0){
            S2827=0;
            active[1]=0;
            ends[1]=0;
            S2827=0;
            break RUN;
          }
        
      }
    }
  }

  public void init(){
    char [] active1 = {1, 1, 1, 1, 1, 1, 1};
    char [] paused1 = {0, 0, 0, 0, 0, 0, 0};
    char [] suspended1 = {0, 0, 0, 0, 0, 0, 0};
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
          getTemp1.gethook();
          window1.gethook();
          df = true;
        }
        runClockDomain();
      }
      getTemp1.setpreclear();
      window1.setpreclear();
      openedWindow1.setpreclear();
      getTemp1R.setpreclear();
      int dummyint = 0;
      for(int qw=0;qw<currsigs.size();++qw){
        dummyint = ((Signal)currsigs.elementAt(qw)).getStatus() ? ((Signal)currsigs.elementAt(qw)).setprepresent() : ((Signal)currsigs.elementAt(qw)).setpreclear();
        ((Signal)currsigs.elementAt(qw)).setpreval(((Signal)currsigs.elementAt(qw)).getValue());
      }
      currsigs.removeAllElements();
      dummyint = getTemp1.getStatus() ? getTemp1.setprepresent() : getTemp1.setpreclear();
      getTemp1.setpreval(getTemp1.getValue());
      getTemp1.setClear();
      dummyint = window1.getStatus() ? window1.setprepresent() : window1.setpreclear();
      window1.setpreval(window1.getValue());
      window1.setClear();
      openedWindow1.sethook();
      openedWindow1.setClear();
      getTemp1R.sethook();
      getTemp1R.setClear();
      if(paused[1]!=0 || suspended[1]!=0 || active[1]!=1);
      else{
        getTemp1.gethook();
        window1.gethook();
      }
      runFinisher();
      if(active[1] == 0){
      	this.terminated = true;
      }
      if(!threaded) break;
    }
  }
}
