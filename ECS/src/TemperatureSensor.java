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
  public Signal getTemp1 = new Signal("getTemp1", Signal.OUTPUT);
  public Signal window1 = new Signal("window1", Signal.OUTPUT);
  public Signal zone1Temp = new Signal("zone1Temp", Signal.OUTPUT);
  public Signal zone2Temp = new Signal("zone2Temp", Signal.OUTPUT);
  public Signal zone3Temp = new Signal("zone3Temp", Signal.OUTPUT);
  public Signal zone4Temp = new Signal("zone4Temp", Signal.OUTPUT);
  public Signal zone5Temp = new Signal("zone5Temp", Signal.OUTPUT);
  public Signal zone6Temp = new Signal("zone6Temp", Signal.OUTPUT);
  public Signal zone7Temp = new Signal("zone7Temp", Signal.OUTPUT);
  private long __start_thread_13;//sysj\controller.sysj line: 177, column: 3
  private int S2533 = 1;
  private int S2529 = 1;
  private int S2347 = 1;
  private int S2531 = 1;
  
  private int[] ends = new int[18];
  private int[] tdone = new int[18];
  
  public void thread2752(int [] tdone, int [] ends){
        switch(S2531){
      case 0 : 
        active[14]=0;
        ends[14]=0;
        tdone[14]=1;
        break;
      
      case 1 : 
        active[14]=1;
        ends[14]=1;
        tdone[14]=1;
        break;
      
    }
  }

  public void thread2751(int [] tdone, int [] ends){
        switch(S2529){
      case 0 : 
        active[13]=0;
        ends[13]=0;
        tdone[13]=1;
        break;
      
      case 1 : 
        switch(S2347){
          case 0 : 
            if(getTemp1R.getprestatus()){//sysj\controller.sysj line: 178, column: 10
              S2347=1;
              active[13]=1;
              ends[13]=1;
              tdone[13]=1;
            }
            else {
              getTemp1.setPresent();//sysj\controller.sysj line: 179, column: 5
              currsigs.addElement(getTemp1);
              active[13]=1;
              ends[13]=1;
              tdone[13]=1;
            }
            break;
          
          case 1 : 
            S2347=1;
            if((getTemp1R.getpreval() == null ? null : ((Integer)getTemp1R.getpreval())) > 28){//sysj\controller.sysj line: 183, column: 7
              window1.setPresent();//sysj\controller.sysj line: 184, column: 5
              currsigs.addElement(window1);
              zone1Temp.setPresent();//sysj\controller.sysj line: 190, column: 3
              currsigs.addElement(zone1Temp);
              zone1Temp.setValue((getTemp1R.getpreval() == null ? null : ((Integer)getTemp1R.getpreval())));//sysj\controller.sysj line: 190, column: 3
              S2347=2;
              active[13]=1;
              ends[13]=1;
              tdone[13]=1;
            }
            else {
              if((getTemp1R.getpreval() == null ? null : ((Integer)getTemp1R.getpreval())) < 20){//sysj\controller.sysj line: 186, column: 15
                window1.setPresent();//sysj\controller.sysj line: 187, column: 5
                currsigs.addElement(window1);
                zone1Temp.setPresent();//sysj\controller.sysj line: 190, column: 3
                currsigs.addElement(zone1Temp);
                zone1Temp.setValue((getTemp1R.getpreval() == null ? null : ((Integer)getTemp1R.getpreval())));//sysj\controller.sysj line: 190, column: 3
                S2347=2;
                active[13]=1;
                ends[13]=1;
                tdone[13]=1;
              }
              else {
                zone1Temp.setPresent();//sysj\controller.sysj line: 190, column: 3
                currsigs.addElement(zone1Temp);
                zone1Temp.setValue((getTemp1R.getpreval() == null ? null : ((Integer)getTemp1R.getpreval())));//sysj\controller.sysj line: 190, column: 3
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
            __start_thread_13 = com.systemj.Timer.getMs();//sysj\controller.sysj line: 177, column: 3
            if(com.systemj.Timer.getMs() - __start_thread_13 >= (5) * 1000){//sysj\controller.sysj line: 177, column: 3
              ends[13]=2;
              ;//sysj\controller.sysj line: 177, column: 3
              S2347=0;
              getTemp1.setPresent();//sysj\controller.sysj line: 179, column: 5
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
            if(com.systemj.Timer.getMs() - __start_thread_13 >= (5) * 1000){//sysj\controller.sysj line: 177, column: 3
              ends[13]=2;
              ;//sysj\controller.sysj line: 177, column: 3
              S2347=0;
              getTemp1.setPresent();//sysj\controller.sysj line: 179, column: 5
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

  public void thread2749(int [] tdone, int [] ends){
        S2531=1;
    active[14]=1;
    ends[14]=1;
    tdone[14]=1;
  }

  public void thread2748(int [] tdone, int [] ends){
        S2529=1;
    S2347=0;
    getTemp1.setPresent();//sysj\controller.sysj line: 179, column: 5
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
      switch(S2533){
        case 0 : 
          S2533=0;
          break RUN;
        
        case 1 : 
          S2533=2;
          S2533=2;
          thread2748(tdone,ends);
          thread2749(tdone,ends);
          int biggest2750 = 0;
          if(ends[13]>=biggest2750){
            biggest2750=ends[13];
          }
          if(ends[14]>=biggest2750){
            biggest2750=ends[14];
          }
          if(biggest2750 == 1){
            active[12]=1;
            ends[12]=1;
            break RUN;
          }
        
        case 2 : 
          thread2751(tdone,ends);
          thread2752(tdone,ends);
          int biggest2753 = 0;
          if(ends[13]>=biggest2753){
            biggest2753=ends[13];
          }
          if(ends[14]>=biggest2753){
            biggest2753=ends[14];
          }
          if(biggest2753 == 1){
            active[12]=1;
            ends[12]=1;
            break RUN;
          }
          //FINXME code
          if(biggest2753 == 0){
            S2533=0;
            active[12]=0;
            ends[12]=0;
            S2533=0;
            break RUN;
          }
        
      }
    }
  }

  public void init(){
    char [] active1 = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
    char [] paused1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    char [] suspended1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
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
          df = true;
        }
        runClockDomain();
      }
      getTemp1R.setpreclear();
      getTemp1.setpreclear();
      window1.setpreclear();
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
      getTemp1.sethook();
      getTemp1.setClear();
      window1.sethook();
      window1.setClear();
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
      }
      runFinisher();
      if(active[12] == 0){
      	this.terminated = true;
      }
      if(!threaded) break;
    }
  }
}
