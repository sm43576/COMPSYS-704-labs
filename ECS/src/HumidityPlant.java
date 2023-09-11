import java.util.*;
import com.systemj.ClockDomain;
import com.systemj.Signal;
import com.systemj.input_Channel;
import com.systemj.output_Channel;

public class HumidityPlant extends ClockDomain{
  public HumidityPlant(String name){super(name);}
  Vector currsigs = new Vector();
  private boolean df = false;
  private char [] active;
  private char [] paused;
  private char [] suspended;
  public Signal getHumid4 = new Signal("getHumid4", Signal.INPUT);
  public Signal airconHumid4 = new Signal("airconHumid4", Signal.INPUT);
  public Signal getHumid4R = new Signal("getHumid4R", Signal.OUTPUT);
  private int zone4Humid_thread_5;//sysj\plant.sysj line: 45, column: 3
  private int S2878 = 1;
  private int S2865 = 1;
  private int S2833 = 1;
  private int S2876 = 1;
  private int S2868 = 1;
  
  private int[] ends = new int[7];
  private int[] tdone = new int[7];
  
  public void thread2890(int [] tdone, int [] ends){
        switch(S2876){
      case 0 : 
        active[6]=0;
        ends[6]=0;
        tdone[6]=1;
        break;
      
      case 1 : 
        switch(S2868){
          case 0 : 
            S2868=1;
            active[6]=1;
            ends[6]=1;
            tdone[6]=1;
            break;
          
          case 1 : 
            S2868=1;
            S2868=0;
            if(airconHumid4.getprestatus()){//sysj\plant.sysj line: 61, column: 12
              System.out.println("aircon On");//sysj\plant.sysj line: 62, column: 5
              active[6]=1;
              ends[6]=1;
              tdone[6]=1;
            }
            else {
              S2868=1;
              active[6]=1;
              ends[6]=1;
              tdone[6]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread2889(int [] tdone, int [] ends){
        switch(S2865){
      case 0 : 
        active[5]=0;
        ends[5]=0;
        tdone[5]=1;
        break;
      
      case 1 : 
        switch(S2833){
          case 0 : 
            getHumid4R.setPresent();//sysj\plant.sysj line: 48, column: 5
            currsigs.addElement(getHumid4R);
            getHumid4R.setValue(zone4Humid_thread_5);//sysj\plant.sysj line: 48, column: 5
            active[5]=1;
            ends[5]=1;
            tdone[5]=1;
            break;
          
          case 1 : 
            S2833=1;
            S2833=2;
            active[5]=1;
            ends[5]=1;
            tdone[5]=1;
            break;
          
          case 2 : 
            S2833=2;
            S2833=0;
            if(getHumid4.getprestatus()){//sysj\plant.sysj line: 47, column: 12
              getHumid4R.setPresent();//sysj\plant.sysj line: 48, column: 5
              currsigs.addElement(getHumid4R);
              getHumid4R.setValue(zone4Humid_thread_5);//sysj\plant.sysj line: 48, column: 5
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            else {
              S2833=1;
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread2887(int [] tdone, int [] ends){
        S2876=1;
    S2868=0;
    if(airconHumid4.getprestatus()){//sysj\plant.sysj line: 61, column: 12
      System.out.println("aircon On");//sysj\plant.sysj line: 62, column: 5
      active[6]=1;
      ends[6]=1;
      tdone[6]=1;
    }
    else {
      S2868=1;
      active[6]=1;
      ends[6]=1;
      tdone[6]=1;
    }
  }

  public void thread2886(int [] tdone, int [] ends){
        S2865=1;
    zone4Humid_thread_5 = 28;//sysj\plant.sysj line: 45, column: 3
    S2833=0;
    if(getHumid4.getprestatus()){//sysj\plant.sysj line: 47, column: 12
      getHumid4R.setPresent();//sysj\plant.sysj line: 48, column: 5
      currsigs.addElement(getHumid4R);
      getHumid4R.setValue(zone4Humid_thread_5);//sysj\plant.sysj line: 48, column: 5
      active[5]=1;
      ends[5]=1;
      tdone[5]=1;
    }
    else {
      S2833=1;
      active[5]=1;
      ends[5]=1;
      tdone[5]=1;
    }
  }

  public void runClockDomain(){
    for(int i=0;i<ends.length;i++){
      ends[i] = 0;
      tdone[i] = 0;
    }
    
    RUN: while(true){
      switch(S2878){
        case 0 : 
          S2878=0;
          break RUN;
        
        case 1 : 
          S2878=2;
          S2878=2;
          thread2886(tdone,ends);
          thread2887(tdone,ends);
          int biggest2888 = 0;
          if(ends[5]>=biggest2888){
            biggest2888=ends[5];
          }
          if(ends[6]>=biggest2888){
            biggest2888=ends[6];
          }
          if(biggest2888 == 1){
            active[4]=1;
            ends[4]=1;
            break RUN;
          }
        
        case 2 : 
          thread2889(tdone,ends);
          thread2890(tdone,ends);
          int biggest2891 = 0;
          if(ends[5]>=biggest2891){
            biggest2891=ends[5];
          }
          if(ends[6]>=biggest2891){
            biggest2891=ends[6];
          }
          if(biggest2891 == 1){
            active[4]=1;
            ends[4]=1;
            break RUN;
          }
          //FINXME code
          if(biggest2891 == 0){
            S2878=0;
            active[4]=0;
            ends[4]=0;
            S2878=0;
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
    while(active[4] != 0){
      int index = 4;
      if(paused[index]==1 || suspended[index]==1 || active[index] == 0){
        for(int h=1;h<paused.length;++h){
          paused[h]=0;
        }
      }
      if(paused[4]!=0 || suspended[4]!=0 || active[4]!=1);
      else{
        if(!df){
          getHumid4.gethook();
          airconHumid4.gethook();
          df = true;
        }
        runClockDomain();
      }
      getHumid4.setpreclear();
      airconHumid4.setpreclear();
      getHumid4R.setpreclear();
      int dummyint = 0;
      for(int qw=0;qw<currsigs.size();++qw){
        dummyint = ((Signal)currsigs.elementAt(qw)).getStatus() ? ((Signal)currsigs.elementAt(qw)).setprepresent() : ((Signal)currsigs.elementAt(qw)).setpreclear();
        ((Signal)currsigs.elementAt(qw)).setpreval(((Signal)currsigs.elementAt(qw)).getValue());
      }
      currsigs.removeAllElements();
      dummyint = getHumid4.getStatus() ? getHumid4.setprepresent() : getHumid4.setpreclear();
      getHumid4.setpreval(getHumid4.getValue());
      getHumid4.setClear();
      dummyint = airconHumid4.getStatus() ? airconHumid4.setprepresent() : airconHumid4.setpreclear();
      airconHumid4.setpreval(airconHumid4.getValue());
      airconHumid4.setClear();
      getHumid4R.sethook();
      getHumid4R.setClear();
      if(paused[4]!=0 || suspended[4]!=0 || active[4]!=1);
      else{
        getHumid4.gethook();
        airconHumid4.gethook();
      }
      runFinisher();
      if(active[4] == 0){
      	this.terminated = true;
      }
      if(!threaded) break;
    }
  }
}
