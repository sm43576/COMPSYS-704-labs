import java.util.*;
import com.systemj.ClockDomain;
import com.systemj.Signal;
import com.systemj.input_Channel;
import com.systemj.output_Channel;

public class Plant extends ClockDomain{
  public Plant(String name){super(name);}
  Vector currsigs = new Vector();
  private boolean df = false;
  private char [] active;
  private char [] paused;
  private char [] suspended;
  public Signal getTemp1 = new Signal("getTemp1", Signal.INPUT);
  public Signal window1 = new Signal("window1", Signal.INPUT);
  public Signal getHumid4 = new Signal("getHumid4", Signal.INPUT);
  public Signal airconHumid4 = new Signal("airconHumid4", Signal.INPUT);
  public Signal openedWindow1 = new Signal("openedWindow1", Signal.OUTPUT);
  public Signal getTemp1R = new Signal("getTemp1R", Signal.OUTPUT);
  public Signal getHumid4R = new Signal("getHumid4R", Signal.OUTPUT);
  private int zone1Temp_thread_2;//sysj\plant.sysj line: 14, column: 3
  private int zone4Humid_thread_4;//sysj\plant.sysj line: 40, column: 3
  private int S2865 = 1;
  private int S2815 = 1;
  private int S2768 = 1;
  private int S2823 = 1;
  private int S2817 = 1;
  private int S2855 = 1;
  private int S2828 = 1;
  private int S2863 = 1;
  
  private int[] ends = new int[6];
  private int[] tdone = new int[6];
  
  public void thread2875(int [] tdone, int [] ends){
        switch(S2863){
      case 0 : 
        active[5]=0;
        ends[5]=0;
        tdone[5]=1;
        break;
      
      case 1 : 
        if(airconHumid4.getprestatus()){//sysj\plant.sysj line: 52, column: 12
          System.out.println("aircon On");//sysj\plant.sysj line: 53, column: 5
          active[5]=1;
          ends[5]=1;
          tdone[5]=1;
        }
        else {
          active[5]=1;
          ends[5]=1;
          tdone[5]=1;
        }
        break;
      
    }
  }

  public void thread2874(int [] tdone, int [] ends){
        switch(S2855){
      case 0 : 
        active[4]=0;
        ends[4]=0;
        tdone[4]=1;
        break;
      
      case 1 : 
        switch(S2828){
          case 0 : 
            getHumid4R.setPresent();//sysj\plant.sysj line: 44, column: 5
            currsigs.addElement(getHumid4R);
            getHumid4R.setValue(zone4Humid_thread_4);//sysj\plant.sysj line: 44, column: 5
            active[4]=1;
            ends[4]=1;
            tdone[4]=1;
            break;
          
          case 1 : 
            S2828=1;
            S2828=0;
            if(getHumid4.getprestatus()){//sysj\plant.sysj line: 42, column: 12
              getHumid4R.setPresent();//sysj\plant.sysj line: 44, column: 5
              currsigs.addElement(getHumid4R);
              getHumid4R.setValue(zone4Humid_thread_4);//sysj\plant.sysj line: 44, column: 5
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            else {
              S2828=1;
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread2873(int [] tdone, int [] ends){
        switch(S2823){
      case 0 : 
        active[3]=0;
        ends[3]=0;
        tdone[3]=1;
        break;
      
      case 1 : 
        switch(S2817){
          case 0 : 
            S2817=1;
            active[3]=1;
            ends[3]=1;
            tdone[3]=1;
            break;
          
          case 1 : 
            S2817=1;
            S2817=0;
            if(window1.getprestatus()){//sysj\plant.sysj line: 30, column: 12
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            else {
              S2817=1;
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread2872(int [] tdone, int [] ends){
        switch(S2815){
      case 0 : 
        active[2]=0;
        ends[2]=0;
        tdone[2]=1;
        break;
      
      case 1 : 
        switch(S2768){
          case 0 : 
            getTemp1R.setPresent();//sysj\plant.sysj line: 18, column: 5
            currsigs.addElement(getTemp1R);
            getTemp1R.setValue(zone1Temp_thread_2);//sysj\plant.sysj line: 18, column: 5
            active[2]=1;
            ends[2]=1;
            tdone[2]=1;
            break;
          
          case 1 : 
            S2768=1;
            S2768=2;
            active[2]=1;
            ends[2]=1;
            tdone[2]=1;
            break;
          
          case 2 : 
            S2768=2;
            S2768=0;
            if(getTemp1.getprestatus()){//sysj\plant.sysj line: 16, column: 12
              System.out.println("Sent Temp");//sysj\plant.sysj line: 17, column: 5
              getTemp1R.setPresent();//sysj\plant.sysj line: 18, column: 5
              currsigs.addElement(getTemp1R);
              getTemp1R.setValue(zone1Temp_thread_2);//sysj\plant.sysj line: 18, column: 5
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            else {
              S2768=1;
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread2870(int [] tdone, int [] ends){
        S2863=1;
    if(airconHumid4.getprestatus()){//sysj\plant.sysj line: 52, column: 12
      System.out.println("aircon On");//sysj\plant.sysj line: 53, column: 5
      active[5]=1;
      ends[5]=1;
      tdone[5]=1;
    }
    else {
      active[5]=1;
      ends[5]=1;
      tdone[5]=1;
    }
  }

  public void thread2869(int [] tdone, int [] ends){
        S2855=1;
    zone4Humid_thread_4 = 28;//sysj\plant.sysj line: 40, column: 3
    S2828=0;
    if(getHumid4.getprestatus()){//sysj\plant.sysj line: 42, column: 12
      getHumid4R.setPresent();//sysj\plant.sysj line: 44, column: 5
      currsigs.addElement(getHumid4R);
      getHumid4R.setValue(zone4Humid_thread_4);//sysj\plant.sysj line: 44, column: 5
      active[4]=1;
      ends[4]=1;
      tdone[4]=1;
    }
    else {
      S2828=1;
      active[4]=1;
      ends[4]=1;
      tdone[4]=1;
    }
  }

  public void thread2868(int [] tdone, int [] ends){
        S2823=1;
    S2817=0;
    if(window1.getprestatus()){//sysj\plant.sysj line: 30, column: 12
      active[3]=1;
      ends[3]=1;
      tdone[3]=1;
    }
    else {
      S2817=1;
      active[3]=1;
      ends[3]=1;
      tdone[3]=1;
    }
  }

  public void thread2867(int [] tdone, int [] ends){
        S2815=1;
    zone1Temp_thread_2 = 32;//sysj\plant.sysj line: 14, column: 3
    S2768=0;
    if(getTemp1.getprestatus()){//sysj\plant.sysj line: 16, column: 12
      System.out.println("Sent Temp");//sysj\plant.sysj line: 17, column: 5
      getTemp1R.setPresent();//sysj\plant.sysj line: 18, column: 5
      currsigs.addElement(getTemp1R);
      getTemp1R.setValue(zone1Temp_thread_2);//sysj\plant.sysj line: 18, column: 5
      active[2]=1;
      ends[2]=1;
      tdone[2]=1;
    }
    else {
      S2768=1;
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
      switch(S2865){
        case 0 : 
          S2865=0;
          break RUN;
        
        case 1 : 
          S2865=2;
          S2865=2;
          thread2867(tdone,ends);
          thread2868(tdone,ends);
          thread2869(tdone,ends);
          thread2870(tdone,ends);
          int biggest2871 = 0;
          if(ends[2]>=biggest2871){
            biggest2871=ends[2];
          }
          if(ends[3]>=biggest2871){
            biggest2871=ends[3];
          }
          if(ends[4]>=biggest2871){
            biggest2871=ends[4];
          }
          if(ends[5]>=biggest2871){
            biggest2871=ends[5];
          }
          if(biggest2871 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
        
        case 2 : 
          thread2872(tdone,ends);
          thread2873(tdone,ends);
          thread2874(tdone,ends);
          thread2875(tdone,ends);
          int biggest2876 = 0;
          if(ends[2]>=biggest2876){
            biggest2876=ends[2];
          }
          if(ends[3]>=biggest2876){
            biggest2876=ends[3];
          }
          if(ends[4]>=biggest2876){
            biggest2876=ends[4];
          }
          if(ends[5]>=biggest2876){
            biggest2876=ends[5];
          }
          if(biggest2876 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
          //FINXME code
          if(biggest2876 == 0){
            S2865=0;
            active[1]=0;
            ends[1]=0;
            S2865=0;
            break RUN;
          }
        
      }
    }
  }

  public void init(){
    char [] active1 = {1, 1, 1, 1, 1, 1};
    char [] paused1 = {0, 0, 0, 0, 0, 0};
    char [] suspended1 = {0, 0, 0, 0, 0, 0};
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
          getHumid4.gethook();
          airconHumid4.gethook();
          df = true;
        }
        runClockDomain();
      }
      getTemp1.setpreclear();
      window1.setpreclear();
      getHumid4.setpreclear();
      airconHumid4.setpreclear();
      openedWindow1.setpreclear();
      getTemp1R.setpreclear();
      getHumid4R.setpreclear();
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
      dummyint = getHumid4.getStatus() ? getHumid4.setprepresent() : getHumid4.setpreclear();
      getHumid4.setpreval(getHumid4.getValue());
      getHumid4.setClear();
      dummyint = airconHumid4.getStatus() ? airconHumid4.setprepresent() : airconHumid4.setpreclear();
      airconHumid4.setpreval(airconHumid4.getValue());
      airconHumid4.setClear();
      openedWindow1.sethook();
      openedWindow1.setClear();
      getTemp1R.sethook();
      getTemp1R.setClear();
      getHumid4R.sethook();
      getHumid4R.setClear();
      if(paused[1]!=0 || suspended[1]!=0 || active[1]!=1);
      else{
        getTemp1.gethook();
        window1.gethook();
        getHumid4.gethook();
        airconHumid4.gethook();
      }
      runFinisher();
      if(active[1] == 0){
      	this.terminated = true;
      }
      if(!threaded) break;
    }
  }
}
