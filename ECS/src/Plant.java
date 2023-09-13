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
  public Signal getTemp4 = new Signal("getTemp4", Signal.INPUT);
  public Signal airconTemp4 = new Signal("airconTemp4", Signal.INPUT);
  public Signal getTemp7 = new Signal("getTemp7", Signal.INPUT);
  public Signal heater7 = new Signal("heater7", Signal.INPUT);
  public Signal getHumid4 = new Signal("getHumid4", Signal.INPUT);
  public Signal airconHumid4 = new Signal("airconHumid4", Signal.INPUT);
  public Signal getTemp1R = new Signal("getTemp1R", Signal.OUTPUT);
  public Signal getTemp4R = new Signal("getTemp4R", Signal.OUTPUT);
  public Signal getTemp7R = new Signal("getTemp7R", Signal.OUTPUT);
  public Signal getHumid4R = new Signal("getHumid4R", Signal.OUTPUT);
  private int zone1Temp_thread_2;//sysj\plant.sysj line: 18, column: 3
  private int zone4Temp_thread_4;//sysj\plant.sysj line: 45, column: 3
  private int zone7Temp_thread_6;//sysj\plant.sysj line: 68, column: 3
  private int zone4Humid_thread_8;//sysj\plant.sysj line: 90, column: 3
  private long __start_thread_3;//sysj\plant.sysj line: 34, column: 20
  private int S3422 = 1;
  private int S3175 = 1;
  private int S3148 = 1;
  private int S3270 = 1;
  private int S3206 = 1;
  private int S3204 = 1;
  private int S3177 = 1;
  private int S3326 = 1;
  private int S3279 = 1;
  private int S3337 = 1;
  private int S3329 = 1;
  private int S3369 = 1;
  private int S3342 = 1;
  private int S3380 = 1;
  private int S3372 = 1;
  private int S3412 = 1;
  private int S3385 = 1;
  private int S3420 = 1;
  
  private int[] ends = new int[10];
  private int[] tdone = new int[10];
  
  public void thread3440(int [] tdone, int [] ends){
        switch(S3420){
      case 0 : 
        active[9]=0;
        ends[9]=0;
        tdone[9]=1;
        break;
      
      case 1 : 
        if(airconHumid4.getprestatus()){//sysj\plant.sysj line: 102, column: 12
          System.out.println("aircon On");//sysj\plant.sysj line: 103, column: 5
          active[9]=1;
          ends[9]=1;
          tdone[9]=1;
        }
        else {
          active[9]=1;
          ends[9]=1;
          tdone[9]=1;
        }
        break;
      
    }
  }

  public void thread3439(int [] tdone, int [] ends){
        switch(S3412){
      case 0 : 
        active[8]=0;
        ends[8]=0;
        tdone[8]=1;
        break;
      
      case 1 : 
        switch(S3385){
          case 0 : 
            getHumid4R.setPresent();//sysj\plant.sysj line: 94, column: 5
            currsigs.addElement(getHumid4R);
            getHumid4R.setValue(zone4Humid_thread_8);//sysj\plant.sysj line: 94, column: 5
            active[8]=1;
            ends[8]=1;
            tdone[8]=1;
            break;
          
          case 1 : 
            S3385=1;
            S3385=0;
            if(getHumid4.getprestatus()){//sysj\plant.sysj line: 92, column: 12
              getHumid4R.setPresent();//sysj\plant.sysj line: 94, column: 5
              currsigs.addElement(getHumid4R);
              getHumid4R.setValue(zone4Humid_thread_8);//sysj\plant.sysj line: 94, column: 5
              active[8]=1;
              ends[8]=1;
              tdone[8]=1;
            }
            else {
              S3385=1;
              active[8]=1;
              ends[8]=1;
              tdone[8]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread3438(int [] tdone, int [] ends){
        switch(S3380){
      case 0 : 
        active[7]=0;
        ends[7]=0;
        tdone[7]=1;
        break;
      
      case 1 : 
        switch(S3372){
          case 0 : 
            S3372=1;
            active[7]=1;
            ends[7]=1;
            tdone[7]=1;
            break;
          
          case 1 : 
            S3372=1;
            S3372=0;
            if(heater7.getprestatus()){//sysj\plant.sysj line: 80, column: 12
              System.out.println("heater in zone7 on");//sysj\plant.sysj line: 81, column: 5
              active[7]=1;
              ends[7]=1;
              tdone[7]=1;
            }
            else {
              S3372=1;
              active[7]=1;
              ends[7]=1;
              tdone[7]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread3437(int [] tdone, int [] ends){
        switch(S3369){
      case 0 : 
        active[6]=0;
        ends[6]=0;
        tdone[6]=1;
        break;
      
      case 1 : 
        switch(S3342){
          case 0 : 
            getTemp7R.setPresent();//sysj\plant.sysj line: 72, column: 5
            currsigs.addElement(getTemp7R);
            getTemp7R.setValue(zone7Temp_thread_6);//sysj\plant.sysj line: 72, column: 5
            active[6]=1;
            ends[6]=1;
            tdone[6]=1;
            break;
          
          case 1 : 
            S3342=1;
            S3342=0;
            if(getTemp7.getprestatus()){//sysj\plant.sysj line: 70, column: 12
              getTemp7R.setPresent();//sysj\plant.sysj line: 72, column: 5
              currsigs.addElement(getTemp7R);
              getTemp7R.setValue(zone7Temp_thread_6);//sysj\plant.sysj line: 72, column: 5
              active[6]=1;
              ends[6]=1;
              tdone[6]=1;
            }
            else {
              S3342=1;
              active[6]=1;
              ends[6]=1;
              tdone[6]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread3436(int [] tdone, int [] ends){
        switch(S3337){
      case 0 : 
        active[5]=0;
        ends[5]=0;
        tdone[5]=1;
        break;
      
      case 1 : 
        switch(S3329){
          case 0 : 
            S3329=1;
            active[5]=1;
            ends[5]=1;
            tdone[5]=1;
            break;
          
          case 1 : 
            S3329=1;
            S3329=0;
            if(airconTemp4.getprestatus()){//sysj\plant.sysj line: 59, column: 12
              System.out.println("airconT in zone 4 Activated");//sysj\plant.sysj line: 60, column: 5
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            else {
              S3329=1;
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread3435(int [] tdone, int [] ends){
        switch(S3326){
      case 0 : 
        active[4]=0;
        ends[4]=0;
        tdone[4]=1;
        break;
      
      case 1 : 
        switch(S3279){
          case 0 : 
            getTemp4R.setPresent();//sysj\plant.sysj line: 49, column: 5
            currsigs.addElement(getTemp4R);
            getTemp4R.setValue(zone4Temp_thread_4);//sysj\plant.sysj line: 49, column: 5
            active[4]=1;
            ends[4]=1;
            tdone[4]=1;
            break;
          
          case 1 : 
            S3279=1;
            S3279=0;
            if(getTemp4.getprestatus()){//sysj\plant.sysj line: 47, column: 12
              System.out.println("Sent Temp4");//sysj\plant.sysj line: 48, column: 5
              getTemp4R.setPresent();//sysj\plant.sysj line: 49, column: 5
              currsigs.addElement(getTemp4R);
              getTemp4R.setValue(zone4Temp_thread_4);//sysj\plant.sysj line: 49, column: 5
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            else {
              S3279=1;
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread3434(int [] tdone, int [] ends){
        switch(S3270){
      case 0 : 
        active[3]=0;
        ends[3]=0;
        tdone[3]=1;
        break;
      
      case 1 : 
        switch(S3206){
          case 0 : 
            switch(S3204){
              case 0 : 
                switch(S3177){
                  case 0 : 
                    S3177=0;
                    if(com.systemj.Timer.getMs() - __start_thread_3 >= (4) * 1000){//sysj\plant.sysj line: 34, column: 20
                      ends[3]=2;
                      ;//sysj\plant.sysj line: 34, column: 20
                      S3204=1;
                      active[3]=1;
                      ends[3]=1;
                      tdone[3]=1;
                    }
                    else {
                      S3177=1;
                      active[3]=1;
                      ends[3]=1;
                      tdone[3]=1;
                    }
                    break;
                  
                  case 1 : 
                    S3177=1;
                    S3177=0;
                    if(com.systemj.Timer.getMs() - __start_thread_3 >= (4) * 1000){//sysj\plant.sysj line: 34, column: 20
                      ends[3]=2;
                      ;//sysj\plant.sysj line: 34, column: 20
                      S3204=1;
                      active[3]=1;
                      ends[3]=1;
                      tdone[3]=1;
                    }
                    else {
                      S3177=1;
                      active[3]=1;
                      ends[3]=1;
                      tdone[3]=1;
                    }
                    break;
                  
                }
                break;
              
              case 1 : 
                S3204=1;
                S3206=1;
                active[3]=1;
                ends[3]=1;
                tdone[3]=1;
                break;
              
            }
            break;
          
          case 1 : 
            S3206=1;
            S3206=0;
            if(window1.getprestatus()){//sysj\plant.sysj line: 34, column: 12
              System.out.println("windowOpen");//sysj\plant.sysj line: 35, column: 5
              S3204=0;
              __start_thread_3 = com.systemj.Timer.getMs();//sysj\plant.sysj line: 34, column: 20
              S3177=0;
              if(com.systemj.Timer.getMs() - __start_thread_3 >= (4) * 1000){//sysj\plant.sysj line: 34, column: 20
                ends[3]=2;
                ;//sysj\plant.sysj line: 34, column: 20
                S3204=1;
                active[3]=1;
                ends[3]=1;
                tdone[3]=1;
              }
              else {
                S3177=1;
                active[3]=1;
                ends[3]=1;
                tdone[3]=1;
              }
            }
            else {
              S3206=1;
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread3433(int [] tdone, int [] ends){
        switch(S3175){
      case 0 : 
        active[2]=0;
        ends[2]=0;
        tdone[2]=1;
        break;
      
      case 1 : 
        switch(S3148){
          case 0 : 
            getTemp1R.setPresent();//sysj\plant.sysj line: 22, column: 5
            currsigs.addElement(getTemp1R);
            getTemp1R.setValue(zone1Temp_thread_2);//sysj\plant.sysj line: 22, column: 5
            active[2]=1;
            ends[2]=1;
            tdone[2]=1;
            break;
          
          case 1 : 
            S3148=1;
            S3148=2;
            active[2]=1;
            ends[2]=1;
            tdone[2]=1;
            break;
          
          case 2 : 
            S3148=2;
            S3148=0;
            if(getTemp1.getprestatus()){//sysj\plant.sysj line: 20, column: 12
              getTemp1R.setPresent();//sysj\plant.sysj line: 22, column: 5
              currsigs.addElement(getTemp1R);
              getTemp1R.setValue(zone1Temp_thread_2);//sysj\plant.sysj line: 22, column: 5
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            else {
              S3148=1;
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread3431(int [] tdone, int [] ends){
        S3420=1;
    if(airconHumid4.getprestatus()){//sysj\plant.sysj line: 102, column: 12
      System.out.println("aircon On");//sysj\plant.sysj line: 103, column: 5
      active[9]=1;
      ends[9]=1;
      tdone[9]=1;
    }
    else {
      active[9]=1;
      ends[9]=1;
      tdone[9]=1;
    }
  }

  public void thread3430(int [] tdone, int [] ends){
        S3412=1;
    zone4Humid_thread_8 = 28;//sysj\plant.sysj line: 90, column: 3
    S3385=0;
    if(getHumid4.getprestatus()){//sysj\plant.sysj line: 92, column: 12
      getHumid4R.setPresent();//sysj\plant.sysj line: 94, column: 5
      currsigs.addElement(getHumid4R);
      getHumid4R.setValue(zone4Humid_thread_8);//sysj\plant.sysj line: 94, column: 5
      active[8]=1;
      ends[8]=1;
      tdone[8]=1;
    }
    else {
      S3385=1;
      active[8]=1;
      ends[8]=1;
      tdone[8]=1;
    }
  }

  public void thread3429(int [] tdone, int [] ends){
        S3380=1;
    S3372=0;
    if(heater7.getprestatus()){//sysj\plant.sysj line: 80, column: 12
      System.out.println("heater in zone7 on");//sysj\plant.sysj line: 81, column: 5
      active[7]=1;
      ends[7]=1;
      tdone[7]=1;
    }
    else {
      S3372=1;
      active[7]=1;
      ends[7]=1;
      tdone[7]=1;
    }
  }

  public void thread3428(int [] tdone, int [] ends){
        S3369=1;
    zone7Temp_thread_6 = 16;//sysj\plant.sysj line: 68, column: 3
    S3342=0;
    if(getTemp7.getprestatus()){//sysj\plant.sysj line: 70, column: 12
      getTemp7R.setPresent();//sysj\plant.sysj line: 72, column: 5
      currsigs.addElement(getTemp7R);
      getTemp7R.setValue(zone7Temp_thread_6);//sysj\plant.sysj line: 72, column: 5
      active[6]=1;
      ends[6]=1;
      tdone[6]=1;
    }
    else {
      S3342=1;
      active[6]=1;
      ends[6]=1;
      tdone[6]=1;
    }
  }

  public void thread3427(int [] tdone, int [] ends){
        S3337=1;
    S3329=0;
    if(airconTemp4.getprestatus()){//sysj\plant.sysj line: 59, column: 12
      System.out.println("airconT in zone 4 Activated");//sysj\plant.sysj line: 60, column: 5
      active[5]=1;
      ends[5]=1;
      tdone[5]=1;
    }
    else {
      S3329=1;
      active[5]=1;
      ends[5]=1;
      tdone[5]=1;
    }
  }

  public void thread3426(int [] tdone, int [] ends){
        S3326=1;
    zone4Temp_thread_4 = 45;//sysj\plant.sysj line: 45, column: 3
    S3279=0;
    if(getTemp4.getprestatus()){//sysj\plant.sysj line: 47, column: 12
      System.out.println("Sent Temp4");//sysj\plant.sysj line: 48, column: 5
      getTemp4R.setPresent();//sysj\plant.sysj line: 49, column: 5
      currsigs.addElement(getTemp4R);
      getTemp4R.setValue(zone4Temp_thread_4);//sysj\plant.sysj line: 49, column: 5
      active[4]=1;
      ends[4]=1;
      tdone[4]=1;
    }
    else {
      S3279=1;
      active[4]=1;
      ends[4]=1;
      tdone[4]=1;
    }
  }

  public void thread3425(int [] tdone, int [] ends){
        S3270=1;
    S3206=0;
    if(window1.getprestatus()){//sysj\plant.sysj line: 34, column: 12
      System.out.println("windowOpen");//sysj\plant.sysj line: 35, column: 5
      S3204=0;
      __start_thread_3 = com.systemj.Timer.getMs();//sysj\plant.sysj line: 34, column: 20
      S3177=0;
      if(com.systemj.Timer.getMs() - __start_thread_3 >= (4) * 1000){//sysj\plant.sysj line: 34, column: 20
        ends[3]=2;
        ;//sysj\plant.sysj line: 34, column: 20
        S3204=1;
        active[3]=1;
        ends[3]=1;
        tdone[3]=1;
      }
      else {
        S3177=1;
        active[3]=1;
        ends[3]=1;
        tdone[3]=1;
      }
    }
    else {
      S3206=1;
      active[3]=1;
      ends[3]=1;
      tdone[3]=1;
    }
  }

  public void thread3424(int [] tdone, int [] ends){
        S3175=1;
    zone1Temp_thread_2 = 32;//sysj\plant.sysj line: 18, column: 3
    S3148=0;
    if(getTemp1.getprestatus()){//sysj\plant.sysj line: 20, column: 12
      getTemp1R.setPresent();//sysj\plant.sysj line: 22, column: 5
      currsigs.addElement(getTemp1R);
      getTemp1R.setValue(zone1Temp_thread_2);//sysj\plant.sysj line: 22, column: 5
      active[2]=1;
      ends[2]=1;
      tdone[2]=1;
    }
    else {
      S3148=1;
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
      switch(S3422){
        case 0 : 
          S3422=0;
          break RUN;
        
        case 1 : 
          S3422=2;
          S3422=2;
          thread3424(tdone,ends);
          thread3425(tdone,ends);
          thread3426(tdone,ends);
          thread3427(tdone,ends);
          thread3428(tdone,ends);
          thread3429(tdone,ends);
          thread3430(tdone,ends);
          thread3431(tdone,ends);
          int biggest3432 = 0;
          if(ends[2]>=biggest3432){
            biggest3432=ends[2];
          }
          if(ends[3]>=biggest3432){
            biggest3432=ends[3];
          }
          if(ends[4]>=biggest3432){
            biggest3432=ends[4];
          }
          if(ends[5]>=biggest3432){
            biggest3432=ends[5];
          }
          if(ends[6]>=biggest3432){
            biggest3432=ends[6];
          }
          if(ends[7]>=biggest3432){
            biggest3432=ends[7];
          }
          if(ends[8]>=biggest3432){
            biggest3432=ends[8];
          }
          if(ends[9]>=biggest3432){
            biggest3432=ends[9];
          }
          if(biggest3432 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
        
        case 2 : 
          thread3433(tdone,ends);
          thread3434(tdone,ends);
          thread3435(tdone,ends);
          thread3436(tdone,ends);
          thread3437(tdone,ends);
          thread3438(tdone,ends);
          thread3439(tdone,ends);
          thread3440(tdone,ends);
          int biggest3441 = 0;
          if(ends[2]>=biggest3441){
            biggest3441=ends[2];
          }
          if(ends[3]>=biggest3441){
            biggest3441=ends[3];
          }
          if(ends[4]>=biggest3441){
            biggest3441=ends[4];
          }
          if(ends[5]>=biggest3441){
            biggest3441=ends[5];
          }
          if(ends[6]>=biggest3441){
            biggest3441=ends[6];
          }
          if(ends[7]>=biggest3441){
            biggest3441=ends[7];
          }
          if(ends[8]>=biggest3441){
            biggest3441=ends[8];
          }
          if(ends[9]>=biggest3441){
            biggest3441=ends[9];
          }
          if(biggest3441 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
          //FINXME code
          if(biggest3441 == 0){
            S3422=0;
            active[1]=0;
            ends[1]=0;
            S3422=0;
            break RUN;
          }
        
      }
    }
  }

  public void init(){
    char [] active1 = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
    char [] paused1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    char [] suspended1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
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
          getTemp4.gethook();
          airconTemp4.gethook();
          getTemp7.gethook();
          heater7.gethook();
          getHumid4.gethook();
          airconHumid4.gethook();
          df = true;
        }
        runClockDomain();
      }
      getTemp1.setpreclear();
      window1.setpreclear();
      getTemp4.setpreclear();
      airconTemp4.setpreclear();
      getTemp7.setpreclear();
      heater7.setpreclear();
      getHumid4.setpreclear();
      airconHumid4.setpreclear();
      getTemp1R.setpreclear();
      getTemp4R.setpreclear();
      getTemp7R.setpreclear();
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
      dummyint = getTemp4.getStatus() ? getTemp4.setprepresent() : getTemp4.setpreclear();
      getTemp4.setpreval(getTemp4.getValue());
      getTemp4.setClear();
      dummyint = airconTemp4.getStatus() ? airconTemp4.setprepresent() : airconTemp4.setpreclear();
      airconTemp4.setpreval(airconTemp4.getValue());
      airconTemp4.setClear();
      dummyint = getTemp7.getStatus() ? getTemp7.setprepresent() : getTemp7.setpreclear();
      getTemp7.setpreval(getTemp7.getValue());
      getTemp7.setClear();
      dummyint = heater7.getStatus() ? heater7.setprepresent() : heater7.setpreclear();
      heater7.setpreval(heater7.getValue());
      heater7.setClear();
      dummyint = getHumid4.getStatus() ? getHumid4.setprepresent() : getHumid4.setpreclear();
      getHumid4.setpreval(getHumid4.getValue());
      getHumid4.setClear();
      dummyint = airconHumid4.getStatus() ? airconHumid4.setprepresent() : airconHumid4.setpreclear();
      airconHumid4.setpreval(airconHumid4.getValue());
      airconHumid4.setClear();
      getTemp1R.sethook();
      getTemp1R.setClear();
      getTemp4R.sethook();
      getTemp4R.setClear();
      getTemp7R.sethook();
      getTemp7R.setClear();
      getHumid4R.sethook();
      getHumid4R.setClear();
      if(paused[1]!=0 || suspended[1]!=0 || active[1]!=1);
      else{
        getTemp1.gethook();
        window1.gethook();
        getTemp4.gethook();
        airconTemp4.gethook();
        getTemp7.gethook();
        heater7.gethook();
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
