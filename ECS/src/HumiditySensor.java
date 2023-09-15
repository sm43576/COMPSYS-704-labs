import java.util.*;
import com.systemj.ClockDomain;
import com.systemj.Signal;
import com.systemj.input_Channel;
import com.systemj.output_Channel;

public class HumiditySensor extends ClockDomain{
  public HumiditySensor(String name){super(name);}
  Vector currsigs = new Vector();
  private boolean df = false;
  private char [] active;
  private char [] paused;
  private char [] suspended;
  public Signal getHumid4R = new Signal("getHumid4R", Signal.INPUT);
  public Signal getHumid4 = new Signal("getHumid4", Signal.OUTPUT);
  public Signal airconHumid4 = new Signal("airconHumid4", Signal.OUTPUT);
  public Signal zone4Humid = new Signal("zone4Humid", Signal.OUTPUT);
  private long __start_thread_17;//sysj\controller.sysj line: 258, column: 3
  private int S3106 = 1;
  private int S3102 = 1;
  private int S2924 = 1;
  private int S3104 = 1;
  
  private int[] ends = new int[20];
  private int[] tdone = new int[20];
  
  public void thread3243(int [] tdone, int [] ends){
        switch(S3104){
      case 0 : 
        active[18]=0;
        ends[18]=0;
        tdone[18]=1;
        break;
      
      case 1 : 
        active[18]=1;
        ends[18]=1;
        tdone[18]=1;
        break;
      
    }
  }

  public void thread3242(int [] tdone, int [] ends){
        switch(S3102){
      case 0 : 
        active[17]=0;
        ends[17]=0;
        tdone[17]=1;
        break;
      
      case 1 : 
        switch(S2924){
          case 0 : 
            if(getHumid4R.getprestatus()){//sysj\controller.sysj line: 259, column: 10
              if((getHumid4R.getpreval() == null ? null : ((Integer)getHumid4R.getpreval())) > 60){//sysj\controller.sysj line: 264, column: 7
                airconHumid4.setPresent();//sysj\controller.sysj line: 265, column: 5
                currsigs.addElement(airconHumid4);
                System.out.println((getHumid4R.getpreval() == null ? null : ((Integer)getHumid4R.getpreval())));//sysj\controller.sysj line: 270, column: 3
                zone4Humid.setPresent();//sysj\controller.sysj line: 271, column: 3
                currsigs.addElement(zone4Humid);
                zone4Humid.setValue((getHumid4R.getpreval() == null ? null : ((Integer)getHumid4R.getpreval())));//sysj\controller.sysj line: 271, column: 3
                S2924=1;
                active[17]=1;
                ends[17]=1;
                tdone[17]=1;
              }
              else {
                if((getHumid4R.getpreval() == null ? null : ((Integer)getHumid4R.getpreval())) < 40){//sysj\controller.sysj line: 267, column: 15
                  airconHumid4.setPresent();//sysj\controller.sysj line: 268, column: 5
                  currsigs.addElement(airconHumid4);
                  System.out.println((getHumid4R.getpreval() == null ? null : ((Integer)getHumid4R.getpreval())));//sysj\controller.sysj line: 270, column: 3
                  zone4Humid.setPresent();//sysj\controller.sysj line: 271, column: 3
                  currsigs.addElement(zone4Humid);
                  zone4Humid.setValue((getHumid4R.getpreval() == null ? null : ((Integer)getHumid4R.getpreval())));//sysj\controller.sysj line: 271, column: 3
                  S2924=1;
                  active[17]=1;
                  ends[17]=1;
                  tdone[17]=1;
                }
                else {
                  System.out.println((getHumid4R.getpreval() == null ? null : ((Integer)getHumid4R.getpreval())));//sysj\controller.sysj line: 270, column: 3
                  zone4Humid.setPresent();//sysj\controller.sysj line: 271, column: 3
                  currsigs.addElement(zone4Humid);
                  zone4Humid.setValue((getHumid4R.getpreval() == null ? null : ((Integer)getHumid4R.getpreval())));//sysj\controller.sysj line: 271, column: 3
                  S2924=1;
                  active[17]=1;
                  ends[17]=1;
                  tdone[17]=1;
                }
              }
            }
            else {
              getHumid4.setPresent();//sysj\controller.sysj line: 261, column: 5
              currsigs.addElement(getHumid4);
              active[17]=1;
              ends[17]=1;
              tdone[17]=1;
            }
            break;
          
          case 1 : 
            S2924=1;
            S2924=2;
            __start_thread_17 = com.systemj.Timer.getMs();//sysj\controller.sysj line: 258, column: 3
            if(com.systemj.Timer.getMs() - __start_thread_17 >= (5) * 1000){//sysj\controller.sysj line: 258, column: 3
              ends[17]=2;
              ;//sysj\controller.sysj line: 258, column: 3
              S2924=0;
              getHumid4.setPresent();//sysj\controller.sysj line: 261, column: 5
              currsigs.addElement(getHumid4);
              active[17]=1;
              ends[17]=1;
              tdone[17]=1;
            }
            else {
              active[17]=1;
              ends[17]=1;
              tdone[17]=1;
            }
            break;
          
          case 2 : 
            if(com.systemj.Timer.getMs() - __start_thread_17 >= (5) * 1000){//sysj\controller.sysj line: 258, column: 3
              ends[17]=2;
              ;//sysj\controller.sysj line: 258, column: 3
              S2924=0;
              getHumid4.setPresent();//sysj\controller.sysj line: 261, column: 5
              currsigs.addElement(getHumid4);
              active[17]=1;
              ends[17]=1;
              tdone[17]=1;
            }
            else {
              active[17]=1;
              ends[17]=1;
              tdone[17]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread3240(int [] tdone, int [] ends){
        S3104=1;
    active[18]=1;
    ends[18]=1;
    tdone[18]=1;
  }

  public void thread3239(int [] tdone, int [] ends){
        S3102=1;
    S2924=0;
    getHumid4.setPresent();//sysj\controller.sysj line: 261, column: 5
    currsigs.addElement(getHumid4);
    active[17]=1;
    ends[17]=1;
    tdone[17]=1;
  }

  public void runClockDomain(){
    for(int i=0;i<ends.length;i++){
      ends[i] = 0;
      tdone[i] = 0;
    }
    
    RUN: while(true){
      switch(S3106){
        case 0 : 
          S3106=0;
          break RUN;
        
        case 1 : 
          S3106=2;
          S3106=2;
          thread3239(tdone,ends);
          thread3240(tdone,ends);
          int biggest3241 = 0;
          if(ends[17]>=biggest3241){
            biggest3241=ends[17];
          }
          if(ends[18]>=biggest3241){
            biggest3241=ends[18];
          }
          if(biggest3241 == 1){
            active[16]=1;
            ends[16]=1;
            break RUN;
          }
        
        case 2 : 
          thread3242(tdone,ends);
          thread3243(tdone,ends);
          int biggest3244 = 0;
          if(ends[17]>=biggest3244){
            biggest3244=ends[17];
          }
          if(ends[18]>=biggest3244){
            biggest3244=ends[18];
          }
          if(biggest3244 == 1){
            active[16]=1;
            ends[16]=1;
            break RUN;
          }
          //FINXME code
          if(biggest3244 == 0){
            S3106=0;
            active[16]=0;
            ends[16]=0;
            S3106=0;
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
    while(active[16] != 0){
      int index = 16;
      if(paused[index]==1 || suspended[index]==1 || active[index] == 0){
        for(int h=1;h<paused.length;++h){
          paused[h]=0;
        }
      }
      if(paused[16]!=0 || suspended[16]!=0 || active[16]!=1);
      else{
        if(!df){
          getHumid4R.gethook();
          df = true;
        }
        runClockDomain();
      }
      getHumid4R.setpreclear();
      getHumid4.setpreclear();
      airconHumid4.setpreclear();
      zone4Humid.setpreclear();
      int dummyint = 0;
      for(int qw=0;qw<currsigs.size();++qw){
        dummyint = ((Signal)currsigs.elementAt(qw)).getStatus() ? ((Signal)currsigs.elementAt(qw)).setprepresent() : ((Signal)currsigs.elementAt(qw)).setpreclear();
        ((Signal)currsigs.elementAt(qw)).setpreval(((Signal)currsigs.elementAt(qw)).getValue());
      }
      currsigs.removeAllElements();
      dummyint = getHumid4R.getStatus() ? getHumid4R.setprepresent() : getHumid4R.setpreclear();
      getHumid4R.setpreval(getHumid4R.getValue());
      getHumid4R.setClear();
      getHumid4.sethook();
      getHumid4.setClear();
      airconHumid4.sethook();
      airconHumid4.setClear();
      zone4Humid.sethook();
      zone4Humid.setClear();
      if(paused[16]!=0 || suspended[16]!=0 || active[16]!=1);
      else{
        getHumid4R.gethook();
      }
      runFinisher();
      if(active[16] == 0){
      	this.terminated = true;
      }
      if(!threaded) break;
    }
  }
}
