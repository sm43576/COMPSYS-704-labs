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
  private int zone1Temp_thread_2;//sysj\plant.sysj line: 11, column: 3
  private int S2662 = 1;
  private int S2600 = 1;
  private int S2568 = 1;
  private int S2611 = 1;
  private int S2603 = 1;
  
  private int[] ends = new int[4];
  private int[] tdone = new int[4];
  
  public void thread2668(int [] tdone, int [] ends){
        switch(S2611){
      case 0 : 
        active[3]=0;
        ends[3]=0;
        tdone[3]=1;
        break;
      
      case 1 : 
        switch(S2603){
          case 0 : 
            S2603=1;
            active[3]=1;
            ends[3]=1;
            tdone[3]=1;
            break;
          
          case 1 : 
            S2603=1;
            S2603=0;
            if(window1.getprestatus()){//sysj\plant.sysj line: 27, column: 12
              System.out.println("windowOpen");//sysj\plant.sysj line: 28, column: 5
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            else {
              S2603=1;
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread2667(int [] tdone, int [] ends){
        switch(S2600){
      case 0 : 
        active[2]=0;
        ends[2]=0;
        tdone[2]=1;
        break;
      
      case 1 : 
        switch(S2568){
          case 0 : 
            getTemp1R.setPresent();//sysj\plant.sysj line: 14, column: 5
            currsigs.addElement(getTemp1R);
            getTemp1R.setValue(zone1Temp_thread_2);//sysj\plant.sysj line: 14, column: 5
            active[2]=1;
            ends[2]=1;
            tdone[2]=1;
            break;
          
          case 1 : 
            S2568=1;
            S2568=2;
            active[2]=1;
            ends[2]=1;
            tdone[2]=1;
            break;
          
          case 2 : 
            S2568=2;
            S2568=0;
            if(getTemp1.getprestatus()){//sysj\plant.sysj line: 13, column: 12
              getTemp1R.setPresent();//sysj\plant.sysj line: 14, column: 5
              currsigs.addElement(getTemp1R);
              getTemp1R.setValue(zone1Temp_thread_2);//sysj\plant.sysj line: 14, column: 5
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            else {
              S2568=1;
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread2665(int [] tdone, int [] ends){
        S2611=1;
    S2603=0;
    if(window1.getprestatus()){//sysj\plant.sysj line: 27, column: 12
      System.out.println("windowOpen");//sysj\plant.sysj line: 28, column: 5
      active[3]=1;
      ends[3]=1;
      tdone[3]=1;
    }
    else {
      S2603=1;
      active[3]=1;
      ends[3]=1;
      tdone[3]=1;
    }
  }

  public void thread2664(int [] tdone, int [] ends){
        S2600=1;
    zone1Temp_thread_2 = 32;//sysj\plant.sysj line: 11, column: 3
    S2568=0;
    if(getTemp1.getprestatus()){//sysj\plant.sysj line: 13, column: 12
      getTemp1R.setPresent();//sysj\plant.sysj line: 14, column: 5
      currsigs.addElement(getTemp1R);
      getTemp1R.setValue(zone1Temp_thread_2);//sysj\plant.sysj line: 14, column: 5
      active[2]=1;
      ends[2]=1;
      tdone[2]=1;
    }
    else {
      S2568=1;
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
      switch(S2662){
        case 0 : 
          S2662=0;
          break RUN;
        
        case 1 : 
          S2662=2;
          S2662=2;
          ;//sysj\plant.sysj line: 9, column: 1
          thread2664(tdone,ends);
          thread2665(tdone,ends);
          int biggest2666 = 0;
          if(ends[2]>=biggest2666){
            biggest2666=ends[2];
          }
          if(ends[3]>=biggest2666){
            biggest2666=ends[3];
          }
          if(biggest2666 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
        
        case 2 : 
          thread2667(tdone,ends);
          thread2668(tdone,ends);
          int biggest2669 = 0;
          if(ends[2]>=biggest2669){
            biggest2669=ends[2];
          }
          if(ends[3]>=biggest2669){
            biggest2669=ends[3];
          }
          if(biggest2669 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
          //FINXME code
          if(biggest2669 == 0){
            S2662=0;
            active[1]=0;
            ends[1]=0;
            S2662=0;
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
