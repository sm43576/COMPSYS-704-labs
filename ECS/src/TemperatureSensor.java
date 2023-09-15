import java.util.*;
import com.systemj.ClockDomain;
import com.systemj.Signal;
import com.systemj.input_Channel;
import com.systemj.output_Channel;

public class TemperatureSensor extends ClockDomain{
  public TemperatureSensor(String name){super(name);}
  Vector currsigs = new Vector();
  private boolean df = false;
  private char [] active;
  private char [] paused;
  private char [] suspended;
  public Signal getTemp1R = new Signal("getTemp1R", Signal.INPUT);
  public Signal getTemp4R = new Signal("getTemp4R", Signal.INPUT);
  public Signal getTemp7R = new Signal("getTemp7R", Signal.INPUT);
  public Signal getTemp1 = new Signal("getTemp1", Signal.OUTPUT);
  public Signal window1 = new Signal("window1", Signal.OUTPUT);
  public Signal getTemp4 = new Signal("getTemp4", Signal.OUTPUT);
  public Signal airconTemp4 = new Signal("airconTemp4", Signal.OUTPUT);
  public Signal getTemp7 = new Signal("getTemp7", Signal.OUTPUT);
  public Signal heater7 = new Signal("heater7", Signal.OUTPUT);
  public Signal zone1Temp = new Signal("zone1Temp", Signal.OUTPUT);
  public Signal zone2Temp = new Signal("zone2Temp", Signal.OUTPUT);
  public Signal zone3Temp = new Signal("zone3Temp", Signal.OUTPUT);
  public Signal zone4Temp = new Signal("zone4Temp", Signal.OUTPUT);
  public Signal zone5Temp = new Signal("zone5Temp", Signal.OUTPUT);
  public Signal zone6Temp = new Signal("zone6Temp", Signal.OUTPUT);
  public Signal zone7Temp = new Signal("zone7Temp", Signal.OUTPUT);
  private long __start_thread_13;//sysj\controller.sysj line: 187, column: 3
  private long __start_thread_14;//sysj\controller.sysj line: 206, column: 3
  private long __start_thread_15;//sysj\controller.sysj line: 226, column: 3
  private int S2915 = 1;
  private int S2529 = 1;
  private int S2347 = 1;
  private int S2736 = 1;
  private int S2538 = 1;
  private int S2913 = 1;
  private int S2741 = 1;
  
  private int[] ends = new int[20];
  private int[] tdone = new int[20];
  
  public void thread3237(int [] tdone, int [] ends){
        switch(S2913){
      case 0 : 
        active[15]=0;
        ends[15]=0;
        tdone[15]=1;
        break;
      
      case 1 : 
        switch(S2741){
          case 0 : 
            if(getTemp7R.getprestatus()){//sysj\controller.sysj line: 227, column: 10
              S2741=1;
              active[15]=1;
              ends[15]=1;
              tdone[15]=1;
            }
            else {
              getTemp7.setPresent();//sysj\controller.sysj line: 228, column: 5
              currsigs.addElement(getTemp7);
              active[15]=1;
              ends[15]=1;
              tdone[15]=1;
            }
            break;
          
          case 1 : 
            S2741=1;
            System.out.println("gottemp7");//sysj\controller.sysj line: 231, column: 4
            if((getTemp7R.getpreval() == null ? null : ((Integer)getTemp7R.getpreval())) < 20){//sysj\controller.sysj line: 233, column: 7
              heater7.setPresent();//sysj\controller.sysj line: 234, column: 5
              currsigs.addElement(heater7);
              System.out.println((getTemp7R.getpreval() == null ? null : ((Integer)getTemp7R.getpreval())));//sysj\controller.sysj line: 236, column: 3
              zone7Temp.setPresent();//sysj\controller.sysj line: 237, column: 3
              currsigs.addElement(zone7Temp);
              zone7Temp.setValue((getTemp7R.getpreval() == null ? null : ((Integer)getTemp7R.getpreval())));//sysj\controller.sysj line: 237, column: 3
              S2741=2;
              active[15]=1;
              ends[15]=1;
              tdone[15]=1;
            }
            else {
              System.out.println((getTemp7R.getpreval() == null ? null : ((Integer)getTemp7R.getpreval())));//sysj\controller.sysj line: 236, column: 3
              zone7Temp.setPresent();//sysj\controller.sysj line: 237, column: 3
              currsigs.addElement(zone7Temp);
              zone7Temp.setValue((getTemp7R.getpreval() == null ? null : ((Integer)getTemp7R.getpreval())));//sysj\controller.sysj line: 237, column: 3
              S2741=2;
              active[15]=1;
              ends[15]=1;
              tdone[15]=1;
            }
            break;
          
          case 2 : 
            S2741=2;
            S2741=3;
            __start_thread_15 = com.systemj.Timer.getMs();//sysj\controller.sysj line: 226, column: 3
            if(com.systemj.Timer.getMs() - __start_thread_15 >= (5) * 1000){//sysj\controller.sysj line: 226, column: 3
              ends[15]=2;
              ;//sysj\controller.sysj line: 226, column: 3
              S2741=0;
              getTemp7.setPresent();//sysj\controller.sysj line: 228, column: 5
              currsigs.addElement(getTemp7);
              active[15]=1;
              ends[15]=1;
              tdone[15]=1;
            }
            else {
              active[15]=1;
              ends[15]=1;
              tdone[15]=1;
            }
            break;
          
          case 3 : 
            if(com.systemj.Timer.getMs() - __start_thread_15 >= (5) * 1000){//sysj\controller.sysj line: 226, column: 3
              ends[15]=2;
              ;//sysj\controller.sysj line: 226, column: 3
              S2741=0;
              getTemp7.setPresent();//sysj\controller.sysj line: 228, column: 5
              currsigs.addElement(getTemp7);
              active[15]=1;
              ends[15]=1;
              tdone[15]=1;
            }
            else {
              active[15]=1;
              ends[15]=1;
              tdone[15]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread3236(int [] tdone, int [] ends){
        switch(S2736){
      case 0 : 
        active[14]=0;
        ends[14]=0;
        tdone[14]=1;
        break;
      
      case 1 : 
        switch(S2538){
          case 0 : 
            if(getTemp4R.getprestatus()){//sysj\controller.sysj line: 207, column: 10
              S2538=1;
              active[14]=1;
              ends[14]=1;
              tdone[14]=1;
            }
            else {
              getTemp4.setPresent();//sysj\controller.sysj line: 209, column: 5
              currsigs.addElement(getTemp4);
              active[14]=1;
              ends[14]=1;
              tdone[14]=1;
            }
            break;
          
          case 1 : 
            S2538=1;
            System.out.println("gottemp4");//sysj\controller.sysj line: 212, column: 3
            if((getTemp4R.getpreval() == null ? null : ((Integer)getTemp4R.getpreval())) > 28){//sysj\controller.sysj line: 213, column: 7
              airconTemp4.setPresent();//sysj\controller.sysj line: 214, column: 5
              currsigs.addElement(airconTemp4);
              System.out.println((getTemp4R.getpreval() == null ? null : ((Integer)getTemp4R.getpreval())));//sysj\controller.sysj line: 219, column: 3
              zone4Temp.setPresent();//sysj\controller.sysj line: 220, column: 3
              currsigs.addElement(zone4Temp);
              zone4Temp.setValue((getTemp4R.getpreval() == null ? null : ((Integer)getTemp4R.getpreval())));//sysj\controller.sysj line: 220, column: 3
              S2538=2;
              active[14]=1;
              ends[14]=1;
              tdone[14]=1;
            }
            else {
              if((getTemp4R.getpreval() == null ? null : ((Integer)getTemp4R.getpreval())) < 20){//sysj\controller.sysj line: 216, column: 15
                airconTemp4.setPresent();//sysj\controller.sysj line: 217, column: 5
                currsigs.addElement(airconTemp4);
                System.out.println((getTemp4R.getpreval() == null ? null : ((Integer)getTemp4R.getpreval())));//sysj\controller.sysj line: 219, column: 3
                zone4Temp.setPresent();//sysj\controller.sysj line: 220, column: 3
                currsigs.addElement(zone4Temp);
                zone4Temp.setValue((getTemp4R.getpreval() == null ? null : ((Integer)getTemp4R.getpreval())));//sysj\controller.sysj line: 220, column: 3
                S2538=2;
                active[14]=1;
                ends[14]=1;
                tdone[14]=1;
              }
              else {
                System.out.println((getTemp4R.getpreval() == null ? null : ((Integer)getTemp4R.getpreval())));//sysj\controller.sysj line: 219, column: 3
                zone4Temp.setPresent();//sysj\controller.sysj line: 220, column: 3
                currsigs.addElement(zone4Temp);
                zone4Temp.setValue((getTemp4R.getpreval() == null ? null : ((Integer)getTemp4R.getpreval())));//sysj\controller.sysj line: 220, column: 3
                S2538=2;
                active[14]=1;
                ends[14]=1;
                tdone[14]=1;
              }
            }
            break;
          
          case 2 : 
            S2538=2;
            S2538=3;
            __start_thread_14 = com.systemj.Timer.getMs();//sysj\controller.sysj line: 206, column: 3
            if(com.systemj.Timer.getMs() - __start_thread_14 >= (5) * 1000){//sysj\controller.sysj line: 206, column: 3
              ends[14]=2;
              ;//sysj\controller.sysj line: 206, column: 3
              S2538=0;
              System.out.println("sustain getTEmp4");//sysj\controller.sysj line: 208, column: 5
              getTemp4.setPresent();//sysj\controller.sysj line: 209, column: 5
              currsigs.addElement(getTemp4);
              active[14]=1;
              ends[14]=1;
              tdone[14]=1;
            }
            else {
              active[14]=1;
              ends[14]=1;
              tdone[14]=1;
            }
            break;
          
          case 3 : 
            if(com.systemj.Timer.getMs() - __start_thread_14 >= (5) * 1000){//sysj\controller.sysj line: 206, column: 3
              ends[14]=2;
              ;//sysj\controller.sysj line: 206, column: 3
              S2538=0;
              System.out.println("sustain getTEmp4");//sysj\controller.sysj line: 208, column: 5
              getTemp4.setPresent();//sysj\controller.sysj line: 209, column: 5
              currsigs.addElement(getTemp4);
              active[14]=1;
              ends[14]=1;
              tdone[14]=1;
            }
            else {
              active[14]=1;
              ends[14]=1;
              tdone[14]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread3235(int [] tdone, int [] ends){
        switch(S2529){
      case 0 : 
        active[13]=0;
        ends[13]=0;
        tdone[13]=1;
        break;
      
      case 1 : 
        switch(S2347){
          case 0 : 
            if(getTemp1R.getprestatus()){//sysj\controller.sysj line: 188, column: 10
              S2347=1;
              active[13]=1;
              ends[13]=1;
              tdone[13]=1;
            }
            else {
              getTemp1.setPresent();//sysj\controller.sysj line: 189, column: 5
              currsigs.addElement(getTemp1);
              active[13]=1;
              ends[13]=1;
              tdone[13]=1;
            }
            break;
          
          case 1 : 
            S2347=1;
            if((getTemp1R.getpreval() == null ? null : ((Integer)getTemp1R.getpreval())) > 28){//sysj\controller.sysj line: 193, column: 7
              window1.setPresent();//sysj\controller.sysj line: 194, column: 5
              currsigs.addElement(window1);
              zone1Temp.setPresent();//sysj\controller.sysj line: 200, column: 3
              currsigs.addElement(zone1Temp);
              zone1Temp.setValue((getTemp1R.getpreval() == null ? null : ((Integer)getTemp1R.getpreval())));//sysj\controller.sysj line: 200, column: 3
              S2347=2;
              active[13]=1;
              ends[13]=1;
              tdone[13]=1;
            }
            else {
              if((getTemp1R.getpreval() == null ? null : ((Integer)getTemp1R.getpreval())) < 20){//sysj\controller.sysj line: 196, column: 15
                window1.setPresent();//sysj\controller.sysj line: 197, column: 5
                currsigs.addElement(window1);
                zone1Temp.setPresent();//sysj\controller.sysj line: 200, column: 3
                currsigs.addElement(zone1Temp);
                zone1Temp.setValue((getTemp1R.getpreval() == null ? null : ((Integer)getTemp1R.getpreval())));//sysj\controller.sysj line: 200, column: 3
                S2347=2;
                active[13]=1;
                ends[13]=1;
                tdone[13]=1;
              }
              else {
                zone1Temp.setPresent();//sysj\controller.sysj line: 200, column: 3
                currsigs.addElement(zone1Temp);
                zone1Temp.setValue((getTemp1R.getpreval() == null ? null : ((Integer)getTemp1R.getpreval())));//sysj\controller.sysj line: 200, column: 3
                S2347=2;
                active[13]=1;
                ends[13]=1;
                tdone[13]=1;
              }
            }
            break;
          
          case 2 : 
            S2347=2;
            S2347=3;
            __start_thread_13 = com.systemj.Timer.getMs();//sysj\controller.sysj line: 187, column: 3
            if(com.systemj.Timer.getMs() - __start_thread_13 >= (5) * 1000){//sysj\controller.sysj line: 187, column: 3
              ends[13]=2;
              ;//sysj\controller.sysj line: 187, column: 3
              S2347=0;
              getTemp1.setPresent();//sysj\controller.sysj line: 189, column: 5
              currsigs.addElement(getTemp1);
              active[13]=1;
              ends[13]=1;
              tdone[13]=1;
            }
            else {
              active[13]=1;
              ends[13]=1;
              tdone[13]=1;
            }
            break;
          
          case 3 : 
            if(com.systemj.Timer.getMs() - __start_thread_13 >= (5) * 1000){//sysj\controller.sysj line: 187, column: 3
              ends[13]=2;
              ;//sysj\controller.sysj line: 187, column: 3
              S2347=0;
              getTemp1.setPresent();//sysj\controller.sysj line: 189, column: 5
              currsigs.addElement(getTemp1);
              active[13]=1;
              ends[13]=1;
              tdone[13]=1;
            }
            else {
              active[13]=1;
              ends[13]=1;
              tdone[13]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread3233(int [] tdone, int [] ends){
        S2913=1;
    S2741=0;
    getTemp7.setPresent();//sysj\controller.sysj line: 228, column: 5
    currsigs.addElement(getTemp7);
    active[15]=1;
    ends[15]=1;
    tdone[15]=1;
  }

  public void thread3232(int [] tdone, int [] ends){
        S2736=1;
    S2538=0;
    System.out.println("sustain getTEmp4");//sysj\controller.sysj line: 208, column: 5
    getTemp4.setPresent();//sysj\controller.sysj line: 209, column: 5
    currsigs.addElement(getTemp4);
    active[14]=1;
    ends[14]=1;
    tdone[14]=1;
  }

  public void thread3231(int [] tdone, int [] ends){
        S2529=1;
    S2347=0;
    getTemp1.setPresent();//sysj\controller.sysj line: 189, column: 5
    currsigs.addElement(getTemp1);
    active[13]=1;
    ends[13]=1;
    tdone[13]=1;
  }

  public void runClockDomain(){
    for(int i=0;i<ends.length;i++){
      ends[i] = 0;
      tdone[i] = 0;
    }
    
    RUN: while(true){
      switch(S2915){
        case 0 : 
          S2915=0;
          break RUN;
        
        case 1 : 
          S2915=2;
          S2915=2;
          thread3231(tdone,ends);
          thread3232(tdone,ends);
          thread3233(tdone,ends);
          int biggest3234 = 0;
          if(ends[13]>=biggest3234){
            biggest3234=ends[13];
          }
          if(ends[14]>=biggest3234){
            biggest3234=ends[14];
          }
          if(ends[15]>=biggest3234){
            biggest3234=ends[15];
          }
          if(biggest3234 == 1){
            active[12]=1;
            ends[12]=1;
            break RUN;
          }
        
        case 2 : 
          thread3235(tdone,ends);
          thread3236(tdone,ends);
          thread3237(tdone,ends);
          int biggest3238 = 0;
          if(ends[13]>=biggest3238){
            biggest3238=ends[13];
          }
          if(ends[14]>=biggest3238){
            biggest3238=ends[14];
          }
          if(ends[15]>=biggest3238){
            biggest3238=ends[15];
          }
          if(biggest3238 == 1){
            active[12]=1;
            ends[12]=1;
            break RUN;
          }
          //FINXME code
          if(biggest3238 == 0){
            S2915=0;
            active[12]=0;
            ends[12]=0;
            S2915=0;
            break RUN;
          }
        
      }
    }
  }

  public void init(){
    char [] active1 = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
    char [] paused1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    char [] suspended1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    paused = paused1;
    active = active1;
    suspended = suspended1;
    // Now instantiate all the local signals ONLY
    // --------------------------------------------------
  }
  
  public void run(){
    while(active[12] != 0){
      int index = 12;
      if(paused[index]==1 || suspended[index]==1 || active[index] == 0){
        for(int h=1;h<paused.length;++h){
          paused[h]=0;
        }
      }
      if(paused[12]!=0 || suspended[12]!=0 || active[12]!=1);
      else{
        if(!df){
          getTemp1R.gethook();
          getTemp4R.gethook();
          getTemp7R.gethook();
          df = true;
        }
        runClockDomain();
      }
      getTemp1R.setpreclear();
      getTemp4R.setpreclear();
      getTemp7R.setpreclear();
      getTemp1.setpreclear();
      window1.setpreclear();
      getTemp4.setpreclear();
      airconTemp4.setpreclear();
      getTemp7.setpreclear();
      heater7.setpreclear();
      zone1Temp.setpreclear();
      zone2Temp.setpreclear();
      zone3Temp.setpreclear();
      zone4Temp.setpreclear();
      zone5Temp.setpreclear();
      zone6Temp.setpreclear();
      zone7Temp.setpreclear();
      int dummyint = 0;
      for(int qw=0;qw<currsigs.size();++qw){
        dummyint = ((Signal)currsigs.elementAt(qw)).getStatus() ? ((Signal)currsigs.elementAt(qw)).setprepresent() : ((Signal)currsigs.elementAt(qw)).setpreclear();
        ((Signal)currsigs.elementAt(qw)).setpreval(((Signal)currsigs.elementAt(qw)).getValue());
      }
      currsigs.removeAllElements();
      dummyint = getTemp1R.getStatus() ? getTemp1R.setprepresent() : getTemp1R.setpreclear();
      getTemp1R.setpreval(getTemp1R.getValue());
      getTemp1R.setClear();
      dummyint = getTemp4R.getStatus() ? getTemp4R.setprepresent() : getTemp4R.setpreclear();
      getTemp4R.setpreval(getTemp4R.getValue());
      getTemp4R.setClear();
      dummyint = getTemp7R.getStatus() ? getTemp7R.setprepresent() : getTemp7R.setpreclear();
      getTemp7R.setpreval(getTemp7R.getValue());
      getTemp7R.setClear();
      getTemp1.sethook();
      getTemp1.setClear();
      window1.sethook();
      window1.setClear();
      getTemp4.sethook();
      getTemp4.setClear();
      airconTemp4.sethook();
      airconTemp4.setClear();
      getTemp7.sethook();
      getTemp7.setClear();
      heater7.sethook();
      heater7.setClear();
      zone1Temp.sethook();
      zone1Temp.setClear();
      zone2Temp.sethook();
      zone2Temp.setClear();
      zone3Temp.sethook();
      zone3Temp.setClear();
      zone4Temp.sethook();
      zone4Temp.setClear();
      zone5Temp.sethook();
      zone5Temp.setClear();
      zone6Temp.sethook();
      zone6Temp.setClear();
      zone7Temp.sethook();
      zone7Temp.setClear();
      if(paused[12]!=0 || suspended[12]!=0 || active[12]!=1);
      else{
        getTemp1R.gethook();
        getTemp4R.gethook();
        getTemp7R.gethook();
      }
      runFinisher();
      if(active[12] == 0){
      	this.terminated = true;
      }
      if(!threaded) break;
    }
  }
}
