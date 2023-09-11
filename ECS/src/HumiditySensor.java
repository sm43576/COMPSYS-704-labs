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
  private long __start_thread_16;//sysj\controller.sysj line: 214, column: 3
  private int S2724 = 1;
  private int S2720 = 1;
  private int S2542 = 1;
  private int S2722 = 1;
  
  private int[] ends = new int[18];
  private int[] tdone = new int[18];
  
  public void thread2758(int [] tdone, int [] ends){
        switch(S2722){
      case 0 : 
        active[17]=0;
        ends[17]=0;
        tdone[17]=1;
        break;
      
      case 1 : 
        active[17]=1;
        ends[17]=1;
        tdone[17]=1;
        break;
      
    }
  }

  public void thread2757(int [] tdone, int [] ends){
        switch(S2720){
      case 0 : 
        active[16]=0;
        ends[16]=0;
        tdone[16]=1;
        break;
      
      case 1 : 
        switch(S2542){
          case 0 : 
            if(getHumid4R.getprestatus()){//sysj\controller.sysj line: 215, column: 10
              if((getHumid4R.getpreval() == null ? null : ((Integer)getHumid4R.getpreval())) > 60){//sysj\controller.sysj line: 221, column: 7
                airconHumid4.setPresent();//sysj\controller.sysj line: 222, column: 5
                currsigs.addElement(airconHumid4);
                System.out.println((getHumid4R.getpreval() == null ? null : ((Integer)getHumid4R.getpreval())));//sysj\controller.sysj line: 227, column: 3
                zone4Humid.setPresent();//sysj\controller.sysj line: 228, column: 3
                currsigs.addElement(zone4Humid);
                zone4Humid.setValue((getHumid4R.getpreval() == null ? null : ((Integer)getHumid4R.getpreval())));//sysj\controller.sysj line: 228, column: 3
                S2542=1;
                active[16]=1;
                ends[16]=1;
                tdone[16]=1;
              }
              else {
                if((getHumid4R.getpreval() == null ? null : ((Integer)getHumid4R.getpreval())) < 40){//sysj\controller.sysj line: 224, column: 15
                  airconHumid4.setPresent();//sysj\controller.sysj line: 225, column: 5
                  currsigs.addElement(airconHumid4);
                  System.out.println((getHumid4R.getpreval() == null ? null : ((Integer)getHumid4R.getpreval())));//sysj\controller.sysj line: 227, column: 3
                  zone4Humid.setPresent();//sysj\controller.sysj line: 228, column: 3
                  currsigs.addElement(zone4Humid);
                  zone4Humid.setValue((getHumid4R.getpreval() == null ? null : ((Integer)getHumid4R.getpreval())));//sysj\controller.sysj line: 228, column: 3
                  S2542=1;
                  active[16]=1;
                  ends[16]=1;
                  tdone[16]=1;
                }
                else {
                  System.out.println((getHumid4R.getpreval() == null ? null : ((Integer)getHumid4R.getpreval())));//sysj\controller.sysj line: 227, column: 3
                  zone4Humid.setPresent();//sysj\controller.sysj line: 228, column: 3
                  currsigs.addElement(zone4Humid);
                  zone4Humid.setValue((getHumid4R.getpreval() == null ? null : ((Integer)getHumid4R.getpreval())));//sysj\controller.sysj line: 228, column: 3
                  S2542=1;
                  active[16]=1;
                  ends[16]=1;
                  tdone[16]=1;
                }
              }
            }
            else {
              getHumid4.setPresent();//sysj\controller.sysj line: 217, column: 5
              currsigs.addElement(getHumid4);
              active[16]=1;
              ends[16]=1;
              tdone[16]=1;
            }
            break;
          
          case 1 : 
            S2542=1;
            S2542=2;
            __start_thread_16 = com.systemj.Timer.getMs();//sysj\controller.sysj line: 214, column: 3
            if(com.systemj.Timer.getMs() - __start_thread_16 >= (5) * 1000){//sysj\controller.sysj line: 214, column: 3
              ends[16]=2;
              ;//sysj\controller.sysj line: 214, column: 3
              S2542=0;
              getHumid4.setPresent();//sysj\controller.sysj line: 217, column: 5
              currsigs.addElement(getHumid4);
              active[16]=1;
              ends[16]=1;
              tdone[16]=1;
            }
            else {
              active[16]=1;
              ends[16]=1;
              tdone[16]=1;
            }
            break;
          
          case 2 : 
            if(com.systemj.Timer.getMs() - __start_thread_16 >= (5) * 1000){//sysj\controller.sysj line: 214, column: 3
              ends[16]=2;
              ;//sysj\controller.sysj line: 214, column: 3
              S2542=0;
              getHumid4.setPresent();//sysj\controller.sysj line: 217, column: 5
              currsigs.addElement(getHumid4);
              active[16]=1;
              ends[16]=1;
              tdone[16]=1;
            }
            else {
              active[16]=1;
              ends[16]=1;
              tdone[16]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread2755(int [] tdone, int [] ends){
        S2722=1;
    active[17]=1;
    ends[17]=1;
    tdone[17]=1;
  }

  public void thread2754(int [] tdone, int [] ends){
        S2720=1;
    S2542=0;
    getHumid4.setPresent();//sysj\controller.sysj line: 217, column: 5
    currsigs.addElement(getHumid4);
    active[16]=1;
    ends[16]=1;
    tdone[16]=1;
  }

  public void runClockDomain(){
    for(int i=0;i<ends.length;i++){
      ends[i] = 0;
      tdone[i] = 0;
    }
    
    RUN: while(true){
      switch(S2724){
        case 0 : 
          S2724=0;
          break RUN;
        
        case 1 : 
          S2724=2;
          S2724=2;
          thread2754(tdone,ends);
          thread2755(tdone,ends);
          int biggest2756 = 0;
          if(ends[16]>=biggest2756){
            biggest2756=ends[16];
          }
          if(ends[17]>=biggest2756){
            biggest2756=ends[17];
          }
          if(biggest2756 == 1){
            active[15]=1;
            ends[15]=1;
            break RUN;
          }
        
        case 2 : 
          thread2757(tdone,ends);
          thread2758(tdone,ends);
          int biggest2759 = 0;
          if(ends[16]>=biggest2759){
            biggest2759=ends[16];
          }
          if(ends[17]>=biggest2759){
            biggest2759=ends[17];
          }
          if(biggest2759 == 1){
            active[15]=1;
            ends[15]=1;
            break RUN;
          }
          //FINXME code
          if(biggest2759 == 0){
            S2724=0;
            active[15]=0;
            ends[15]=0;
            S2724=0;
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
    while(active[15] != 0){
      int index = 15;
      if(paused[index]==1 || suspended[index]==1 || active[index] == 0){
        for(int h=1;h<paused.length;++h){
          paused[h]=0;
        }
      }
      if(paused[15]!=0 || suspended[15]!=0 || active[15]!=1);
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
      if(paused[15]!=0 || suspended[15]!=0 || active[15]!=1);
      else{
        getHumid4R.gethook();
      }
      runFinisher();
      if(active[15] == 0){
      	this.terminated = true;
      }
      if(!threaded) break;
    }
  }
}
