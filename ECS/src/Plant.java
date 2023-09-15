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
  public Signal getSmokeDetection = new Signal("getSmokeDetection", Signal.INPUT);
  public Signal fireAlarm = new Signal("fireAlarm", Signal.INPUT);
  public Signal getTemp1R = new Signal("getTemp1R", Signal.OUTPUT);
  public Signal getTemp4R = new Signal("getTemp4R", Signal.OUTPUT);
  public Signal getTemp7R = new Signal("getTemp7R", Signal.OUTPUT);
  public Signal getHumid4R = new Signal("getHumid4R", Signal.OUTPUT);
  public Signal smokeOnOff = new Signal("smokeOnOff", Signal.OUTPUT);
  private int zone1Temp_thread_2;//sysj\plant.sysj line: 22, column: 3
  private int zone4Temp_thread_4;//sysj\plant.sysj line: 49, column: 3
  private int zone7Temp_thread_6;//sysj\plant.sysj line: 72, column: 3
  private int zone4Humid_thread_8;//sysj\plant.sysj line: 94, column: 3
  private long __start_thread_3;//sysj\plant.sysj line: 38, column: 20
  private int S3539 = 1;
  private int S3276 = 1;
  private int S3249 = 1;
  private int S3371 = 1;
  private int S3307 = 1;
  private int S3305 = 1;
  private int S3278 = 1;
  private int S3427 = 1;
  private int S3380 = 1;
  private int S3438 = 1;
  private int S3430 = 1;
  private int S3470 = 1;
  private int S3443 = 1;
  private int S3481 = 1;
  private int S3473 = 1;
  private int S3513 = 1;
  private int S3486 = 1;
  private int S3521 = 1;
  private int S3529 = 1;
  private int S3537 = 1;
  
  private int[] ends = new int[12];
  private int[] tdone = new int[12];
  
  public void thread3561(int [] tdone, int [] ends){
        switch(S3537){
      case 0 : 
        active[11]=0;
        ends[11]=0;
        tdone[11]=1;
        break;
      
      case 1 : 
        if(fireAlarm.getprestatus()){//sysj\plant.sysj line: 125, column: 12
          System.out.println("Fire alarms on");//sysj\plant.sysj line: 126, column: 5
          active[11]=1;
          ends[11]=1;
          tdone[11]=1;
        }
        else {
          active[11]=1;
          ends[11]=1;
          tdone[11]=1;
        }
        break;
      
    }
  }

  public void thread3560(int [] tdone, int [] ends){
        switch(S3529){
      case 0 : 
        active[10]=0;
        ends[10]=0;
        tdone[10]=1;
        break;
      
      case 1 : 
        if(getSmokeDetection.getprestatus()){//sysj\plant.sysj line: 115, column: 12
          smokeOnOff.setPresent();//sysj\plant.sysj line: 117, column: 5
          currsigs.addElement(smokeOnOff);
          active[10]=1;
          ends[10]=1;
          tdone[10]=1;
        }
        else {
          active[10]=1;
          ends[10]=1;
          tdone[10]=1;
        }
        break;
      
    }
  }

  public void thread3559(int [] tdone, int [] ends){
        switch(S3521){
      case 0 : 
        active[9]=0;
        ends[9]=0;
        tdone[9]=1;
        break;
      
      case 1 : 
        if(airconHumid4.getprestatus()){//sysj\plant.sysj line: 106, column: 12
          System.out.println("aircon On");//sysj\plant.sysj line: 107, column: 5
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

  public void thread3558(int [] tdone, int [] ends){
        switch(S3513){
      case 0 : 
        active[8]=0;
        ends[8]=0;
        tdone[8]=1;
        break;
      
      case 1 : 
        switch(S3486){
          case 0 : 
            getHumid4R.setPresent();//sysj\plant.sysj line: 98, column: 5
            currsigs.addElement(getHumid4R);
            getHumid4R.setValue(zone4Humid_thread_8);//sysj\plant.sysj line: 98, column: 5
            active[8]=1;
            ends[8]=1;
            tdone[8]=1;
            break;
          
          case 1 : 
            S3486=1;
            S3486=0;
            if(getHumid4.getprestatus()){//sysj\plant.sysj line: 96, column: 12
              getHumid4R.setPresent();//sysj\plant.sysj line: 98, column: 5
              currsigs.addElement(getHumid4R);
              getHumid4R.setValue(zone4Humid_thread_8);//sysj\plant.sysj line: 98, column: 5
              active[8]=1;
              ends[8]=1;
              tdone[8]=1;
            }
            else {
              S3486=1;
              active[8]=1;
              ends[8]=1;
              tdone[8]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread3557(int [] tdone, int [] ends){
        switch(S3481){
      case 0 : 
        active[7]=0;
        ends[7]=0;
        tdone[7]=1;
        break;
      
      case 1 : 
        switch(S3473){
          case 0 : 
            S3473=1;
            active[7]=1;
            ends[7]=1;
            tdone[7]=1;
            break;
          
          case 1 : 
            S3473=1;
            S3473=0;
            if(heater7.getprestatus()){//sysj\plant.sysj line: 84, column: 12
              System.out.println("heater in zone7 on");//sysj\plant.sysj line: 85, column: 5
              active[7]=1;
              ends[7]=1;
              tdone[7]=1;
            }
            else {
              S3473=1;
              active[7]=1;
              ends[7]=1;
              tdone[7]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread3556(int [] tdone, int [] ends){
        switch(S3470){
      case 0 : 
        active[6]=0;
        ends[6]=0;
        tdone[6]=1;
        break;
      
      case 1 : 
        switch(S3443){
          case 0 : 
            getTemp7R.setPresent();//sysj\plant.sysj line: 76, column: 5
            currsigs.addElement(getTemp7R);
            getTemp7R.setValue(zone7Temp_thread_6);//sysj\plant.sysj line: 76, column: 5
            active[6]=1;
            ends[6]=1;
            tdone[6]=1;
            break;
          
          case 1 : 
            S3443=1;
            S3443=0;
            if(getTemp7.getprestatus()){//sysj\plant.sysj line: 74, column: 12
              getTemp7R.setPresent();//sysj\plant.sysj line: 76, column: 5
              currsigs.addElement(getTemp7R);
              getTemp7R.setValue(zone7Temp_thread_6);//sysj\plant.sysj line: 76, column: 5
              active[6]=1;
              ends[6]=1;
              tdone[6]=1;
            }
            else {
              S3443=1;
              active[6]=1;
              ends[6]=1;
              tdone[6]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread3555(int [] tdone, int [] ends){
        switch(S3438){
      case 0 : 
        active[5]=0;
        ends[5]=0;
        tdone[5]=1;
        break;
      
      case 1 : 
        switch(S3430){
          case 0 : 
            S3430=1;
            active[5]=1;
            ends[5]=1;
            tdone[5]=1;
            break;
          
          case 1 : 
            S3430=1;
            S3430=0;
            if(airconTemp4.getprestatus()){//sysj\plant.sysj line: 63, column: 12
              System.out.println("airconT in zone 4 Activated");//sysj\plant.sysj line: 64, column: 5
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            else {
              S3430=1;
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread3554(int [] tdone, int [] ends){
        switch(S3427){
      case 0 : 
        active[4]=0;
        ends[4]=0;
        tdone[4]=1;
        break;
      
      case 1 : 
        switch(S3380){
          case 0 : 
            getTemp4R.setPresent();//sysj\plant.sysj line: 53, column: 5
            currsigs.addElement(getTemp4R);
            getTemp4R.setValue(zone4Temp_thread_4);//sysj\plant.sysj line: 53, column: 5
            active[4]=1;
            ends[4]=1;
            tdone[4]=1;
            break;
          
          case 1 : 
            S3380=1;
            S3380=0;
            if(getTemp4.getprestatus()){//sysj\plant.sysj line: 51, column: 12
              System.out.println("Sent Temp4");//sysj\plant.sysj line: 52, column: 5
              getTemp4R.setPresent();//sysj\plant.sysj line: 53, column: 5
              currsigs.addElement(getTemp4R);
              getTemp4R.setValue(zone4Temp_thread_4);//sysj\plant.sysj line: 53, column: 5
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            else {
              S3380=1;
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread3553(int [] tdone, int [] ends){
        switch(S3371){
      case 0 : 
        active[3]=0;
        ends[3]=0;
        tdone[3]=1;
        break;
      
      case 1 : 
        switch(S3307){
          case 0 : 
            switch(S3305){
              case 0 : 
                switch(S3278){
                  case 0 : 
                    S3278=0;
                    if(com.systemj.Timer.getMs() - __start_thread_3 >= (4) * 1000){//sysj\plant.sysj line: 38, column: 20
                      ends[3]=2;
                      ;//sysj\plant.sysj line: 38, column: 20
                      S3305=1;
                      active[3]=1;
                      ends[3]=1;
                      tdone[3]=1;
                    }
                    else {
                      S3278=1;
                      active[3]=1;
                      ends[3]=1;
                      tdone[3]=1;
                    }
                    break;
                  
                  case 1 : 
                    S3278=1;
                    S3278=0;
                    if(com.systemj.Timer.getMs() - __start_thread_3 >= (4) * 1000){//sysj\plant.sysj line: 38, column: 20
                      ends[3]=2;
                      ;//sysj\plant.sysj line: 38, column: 20
                      S3305=1;
                      active[3]=1;
                      ends[3]=1;
                      tdone[3]=1;
                    }
                    else {
                      S3278=1;
                      active[3]=1;
                      ends[3]=1;
                      tdone[3]=1;
                    }
                    break;
                  
                }
                break;
              
              case 1 : 
                S3305=1;
                S3307=1;
                active[3]=1;
                ends[3]=1;
                tdone[3]=1;
                break;
              
            }
            break;
          
          case 1 : 
            S3307=1;
            S3307=0;
            if(window1.getprestatus()){//sysj\plant.sysj line: 38, column: 12
              System.out.println("windowOpen");//sysj\plant.sysj line: 39, column: 5
              S3305=0;
              __start_thread_3 = com.systemj.Timer.getMs();//sysj\plant.sysj line: 38, column: 20
              S3278=0;
              if(com.systemj.Timer.getMs() - __start_thread_3 >= (4) * 1000){//sysj\plant.sysj line: 38, column: 20
                ends[3]=2;
                ;//sysj\plant.sysj line: 38, column: 20
                S3305=1;
                active[3]=1;
                ends[3]=1;
                tdone[3]=1;
              }
              else {
                S3278=1;
                active[3]=1;
                ends[3]=1;
                tdone[3]=1;
              }
            }
            else {
              S3307=1;
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread3552(int [] tdone, int [] ends){
        switch(S3276){
      case 0 : 
        active[2]=0;
        ends[2]=0;
        tdone[2]=1;
        break;
      
      case 1 : 
        switch(S3249){
          case 0 : 
            getTemp1R.setPresent();//sysj\plant.sysj line: 26, column: 5
            currsigs.addElement(getTemp1R);
            getTemp1R.setValue(zone1Temp_thread_2);//sysj\plant.sysj line: 26, column: 5
            active[2]=1;
            ends[2]=1;
            tdone[2]=1;
            break;
          
          case 1 : 
            S3249=1;
            S3249=2;
            active[2]=1;
            ends[2]=1;
            tdone[2]=1;
            break;
          
          case 2 : 
            S3249=2;
            S3249=0;
            if(getTemp1.getprestatus()){//sysj\plant.sysj line: 24, column: 12
              getTemp1R.setPresent();//sysj\plant.sysj line: 26, column: 5
              currsigs.addElement(getTemp1R);
              getTemp1R.setValue(zone1Temp_thread_2);//sysj\plant.sysj line: 26, column: 5
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            else {
              S3249=1;
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread3550(int [] tdone, int [] ends){
        S3537=1;
    if(fireAlarm.getprestatus()){//sysj\plant.sysj line: 125, column: 12
      System.out.println("Fire alarms on");//sysj\plant.sysj line: 126, column: 5
      active[11]=1;
      ends[11]=1;
      tdone[11]=1;
    }
    else {
      active[11]=1;
      ends[11]=1;
      tdone[11]=1;
    }
  }

  public void thread3549(int [] tdone, int [] ends){
        S3529=1;
    if(getSmokeDetection.getprestatus()){//sysj\plant.sysj line: 115, column: 12
      smokeOnOff.setPresent();//sysj\plant.sysj line: 117, column: 5
      currsigs.addElement(smokeOnOff);
      active[10]=1;
      ends[10]=1;
      tdone[10]=1;
    }
    else {
      active[10]=1;
      ends[10]=1;
      tdone[10]=1;
    }
  }

  public void thread3548(int [] tdone, int [] ends){
        S3521=1;
    if(airconHumid4.getprestatus()){//sysj\plant.sysj line: 106, column: 12
      System.out.println("aircon On");//sysj\plant.sysj line: 107, column: 5
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

  public void thread3547(int [] tdone, int [] ends){
        S3513=1;
    zone4Humid_thread_8 = 28;//sysj\plant.sysj line: 94, column: 3
    S3486=0;
    if(getHumid4.getprestatus()){//sysj\plant.sysj line: 96, column: 12
      getHumid4R.setPresent();//sysj\plant.sysj line: 98, column: 5
      currsigs.addElement(getHumid4R);
      getHumid4R.setValue(zone4Humid_thread_8);//sysj\plant.sysj line: 98, column: 5
      active[8]=1;
      ends[8]=1;
      tdone[8]=1;
    }
    else {
      S3486=1;
      active[8]=1;
      ends[8]=1;
      tdone[8]=1;
    }
  }

  public void thread3546(int [] tdone, int [] ends){
        S3481=1;
    S3473=0;
    if(heater7.getprestatus()){//sysj\plant.sysj line: 84, column: 12
      System.out.println("heater in zone7 on");//sysj\plant.sysj line: 85, column: 5
      active[7]=1;
      ends[7]=1;
      tdone[7]=1;
    }
    else {
      S3473=1;
      active[7]=1;
      ends[7]=1;
      tdone[7]=1;
    }
  }

  public void thread3545(int [] tdone, int [] ends){
        S3470=1;
    zone7Temp_thread_6 = 16;//sysj\plant.sysj line: 72, column: 3
    S3443=0;
    if(getTemp7.getprestatus()){//sysj\plant.sysj line: 74, column: 12
      getTemp7R.setPresent();//sysj\plant.sysj line: 76, column: 5
      currsigs.addElement(getTemp7R);
      getTemp7R.setValue(zone7Temp_thread_6);//sysj\plant.sysj line: 76, column: 5
      active[6]=1;
      ends[6]=1;
      tdone[6]=1;
    }
    else {
      S3443=1;
      active[6]=1;
      ends[6]=1;
      tdone[6]=1;
    }
  }

  public void thread3544(int [] tdone, int [] ends){
        S3438=1;
    S3430=0;
    if(airconTemp4.getprestatus()){//sysj\plant.sysj line: 63, column: 12
      System.out.println("airconT in zone 4 Activated");//sysj\plant.sysj line: 64, column: 5
      active[5]=1;
      ends[5]=1;
      tdone[5]=1;
    }
    else {
      S3430=1;
      active[5]=1;
      ends[5]=1;
      tdone[5]=1;
    }
  }

  public void thread3543(int [] tdone, int [] ends){
        S3427=1;
    zone4Temp_thread_4 = 45;//sysj\plant.sysj line: 49, column: 3
    S3380=0;
    if(getTemp4.getprestatus()){//sysj\plant.sysj line: 51, column: 12
      System.out.println("Sent Temp4");//sysj\plant.sysj line: 52, column: 5
      getTemp4R.setPresent();//sysj\plant.sysj line: 53, column: 5
      currsigs.addElement(getTemp4R);
      getTemp4R.setValue(zone4Temp_thread_4);//sysj\plant.sysj line: 53, column: 5
      active[4]=1;
      ends[4]=1;
      tdone[4]=1;
    }
    else {
      S3380=1;
      active[4]=1;
      ends[4]=1;
      tdone[4]=1;
    }
  }

  public void thread3542(int [] tdone, int [] ends){
        S3371=1;
    S3307=0;
    if(window1.getprestatus()){//sysj\plant.sysj line: 38, column: 12
      System.out.println("windowOpen");//sysj\plant.sysj line: 39, column: 5
      S3305=0;
      __start_thread_3 = com.systemj.Timer.getMs();//sysj\plant.sysj line: 38, column: 20
      S3278=0;
      if(com.systemj.Timer.getMs() - __start_thread_3 >= (4) * 1000){//sysj\plant.sysj line: 38, column: 20
        ends[3]=2;
        ;//sysj\plant.sysj line: 38, column: 20
        S3305=1;
        active[3]=1;
        ends[3]=1;
        tdone[3]=1;
      }
      else {
        S3278=1;
        active[3]=1;
        ends[3]=1;
        tdone[3]=1;
      }
    }
    else {
      S3307=1;
      active[3]=1;
      ends[3]=1;
      tdone[3]=1;
    }
  }

  public void thread3541(int [] tdone, int [] ends){
        S3276=1;
    zone1Temp_thread_2 = 32;//sysj\plant.sysj line: 22, column: 3
    S3249=0;
    if(getTemp1.getprestatus()){//sysj\plant.sysj line: 24, column: 12
      getTemp1R.setPresent();//sysj\plant.sysj line: 26, column: 5
      currsigs.addElement(getTemp1R);
      getTemp1R.setValue(zone1Temp_thread_2);//sysj\plant.sysj line: 26, column: 5
      active[2]=1;
      ends[2]=1;
      tdone[2]=1;
    }
    else {
      S3249=1;
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
      switch(S3539){
        case 0 : 
          S3539=0;
          break RUN;
        
        case 1 : 
          S3539=2;
          S3539=2;
          thread3541(tdone,ends);
          thread3542(tdone,ends);
          thread3543(tdone,ends);
          thread3544(tdone,ends);
          thread3545(tdone,ends);
          thread3546(tdone,ends);
          thread3547(tdone,ends);
          thread3548(tdone,ends);
          thread3549(tdone,ends);
          thread3550(tdone,ends);
          int biggest3551 = 0;
          if(ends[2]>=biggest3551){
            biggest3551=ends[2];
          }
          if(ends[3]>=biggest3551){
            biggest3551=ends[3];
          }
          if(ends[4]>=biggest3551){
            biggest3551=ends[4];
          }
          if(ends[5]>=biggest3551){
            biggest3551=ends[5];
          }
          if(ends[6]>=biggest3551){
            biggest3551=ends[6];
          }
          if(ends[7]>=biggest3551){
            biggest3551=ends[7];
          }
          if(ends[8]>=biggest3551){
            biggest3551=ends[8];
          }
          if(ends[9]>=biggest3551){
            biggest3551=ends[9];
          }
          if(ends[10]>=biggest3551){
            biggest3551=ends[10];
          }
          if(ends[11]>=biggest3551){
            biggest3551=ends[11];
          }
          if(biggest3551 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
        
        case 2 : 
          thread3552(tdone,ends);
          thread3553(tdone,ends);
          thread3554(tdone,ends);
          thread3555(tdone,ends);
          thread3556(tdone,ends);
          thread3557(tdone,ends);
          thread3558(tdone,ends);
          thread3559(tdone,ends);
          thread3560(tdone,ends);
          thread3561(tdone,ends);
          int biggest3562 = 0;
          if(ends[2]>=biggest3562){
            biggest3562=ends[2];
          }
          if(ends[3]>=biggest3562){
            biggest3562=ends[3];
          }
          if(ends[4]>=biggest3562){
            biggest3562=ends[4];
          }
          if(ends[5]>=biggest3562){
            biggest3562=ends[5];
          }
          if(ends[6]>=biggest3562){
            biggest3562=ends[6];
          }
          if(ends[7]>=biggest3562){
            biggest3562=ends[7];
          }
          if(ends[8]>=biggest3562){
            biggest3562=ends[8];
          }
          if(ends[9]>=biggest3562){
            biggest3562=ends[9];
          }
          if(ends[10]>=biggest3562){
            biggest3562=ends[10];
          }
          if(ends[11]>=biggest3562){
            biggest3562=ends[11];
          }
          if(biggest3562 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
          //FINXME code
          if(biggest3562 == 0){
            S3539=0;
            active[1]=0;
            ends[1]=0;
            S3539=0;
            break RUN;
          }
        
      }
    }
  }

  public void init(){
    char [] active1 = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
    char [] paused1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    char [] suspended1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
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
          getSmokeDetection.gethook();
          fireAlarm.gethook();
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
      getSmokeDetection.setpreclear();
      fireAlarm.setpreclear();
      getTemp1R.setpreclear();
      getTemp4R.setpreclear();
      getTemp7R.setpreclear();
      getHumid4R.setpreclear();
      smokeOnOff.setpreclear();
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
      dummyint = getSmokeDetection.getStatus() ? getSmokeDetection.setprepresent() : getSmokeDetection.setpreclear();
      getSmokeDetection.setpreval(getSmokeDetection.getValue());
      getSmokeDetection.setClear();
      dummyint = fireAlarm.getStatus() ? fireAlarm.setprepresent() : fireAlarm.setpreclear();
      fireAlarm.setpreval(fireAlarm.getValue());
      fireAlarm.setClear();
      getTemp1R.sethook();
      getTemp1R.setClear();
      getTemp4R.sethook();
      getTemp4R.setClear();
      getTemp7R.sethook();
      getTemp7R.setClear();
      getHumid4R.sethook();
      getHumid4R.setClear();
      smokeOnOff.sethook();
      smokeOnOff.setClear();
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
        getSmokeDetection.gethook();
        fireAlarm.gethook();
      }
      runFinisher();
      if(active[1] == 0){
      	this.terminated = true;
      }
      if(!threaded) break;
    }
  }
}
