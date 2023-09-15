import java.util.*;
import com.systemj.ClockDomain;
import com.systemj.Signal;
import com.systemj.input_Channel;
import com.systemj.output_Channel;

public class SmokeSensor extends ClockDomain{
  public SmokeSensor(String name){super(name);}
  Vector currsigs = new Vector();
  private boolean df = false;
  private char [] active;
  private char [] paused;
  private char [] suspended;
  public Signal smokeOnOff = new Signal("smokeOnOff", Signal.INPUT);
  public Signal getSmokeDetection = new Signal("getSmokeDetection", Signal.OUTPUT);
  public Signal fireAlarm = new Signal("fireAlarm", Signal.OUTPUT);
  private long __start_thread_19;//sysj\controller.sysj line: 288, column: 4
  private int S3207 = 1;
  private int S3111 = 1;
  
  private int[] ends = new int[20];
  private int[] tdone = new int[20];
  
  public void runClockDomain(){
    for(int i=0;i<ends.length;i++){
      ends[i] = 0;
      tdone[i] = 0;
    }
    
    RUN: while(true){
      switch(S3207){
        case 0 : 
          S3207=0;
          break RUN;
        
        case 1 : 
          S3207=2;
          S3207=2;
          S3111=0;
          getSmokeDetection.setPresent();//sysj\controller.sysj line: 290, column: 6
          currsigs.addElement(getSmokeDetection);
          active[19]=1;
          ends[19]=1;
          break RUN;
        
        case 2 : 
          switch(S3111){
            case 0 : 
              if(smokeOnOff.getprestatus()){//sysj\controller.sysj line: 289, column: 11
                fireAlarm.setPresent();//sysj\controller.sysj line: 293, column: 5
                currsigs.addElement(fireAlarm);
                System.out.println("SMOKE IN THE BUILDING");//sysj\controller.sysj line: 294, column: 5
                S3111=1;
                __start_thread_19 = com.systemj.Timer.getMs();//sysj\controller.sysj line: 288, column: 4
                if(com.systemj.Timer.getMs() - __start_thread_19 >= (5) * 1000){//sysj\controller.sysj line: 288, column: 4
                  ends[19]=2;
                  ;//sysj\controller.sysj line: 288, column: 4
                  S3111=2;
                  active[19]=1;
                  ends[19]=1;
                  break RUN;
                }
                else {
                  active[19]=1;
                  ends[19]=1;
                  break RUN;
                }
              }
              else {
                getSmokeDetection.setPresent();//sysj\controller.sysj line: 290, column: 6
                currsigs.addElement(getSmokeDetection);
                active[19]=1;
                ends[19]=1;
                break RUN;
              }
            
            case 1 : 
              if(com.systemj.Timer.getMs() - __start_thread_19 >= (5) * 1000){//sysj\controller.sysj line: 288, column: 4
                ends[19]=2;
                ;//sysj\controller.sysj line: 288, column: 4
                S3111=2;
                active[19]=1;
                ends[19]=1;
                break RUN;
              }
              else {
                active[19]=1;
                ends[19]=1;
                break RUN;
              }
            
            case 2 : 
              S3111=2;
              S3111=0;
              getSmokeDetection.setPresent();//sysj\controller.sysj line: 290, column: 6
              currsigs.addElement(getSmokeDetection);
              active[19]=1;
              ends[19]=1;
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
    while(active[19] != 0){
      int index = 19;
      if(paused[index]==1 || suspended[index]==1 || active[index] == 0){
        for(int h=1;h<paused.length;++h){
          paused[h]=0;
        }
      }
      if(paused[19]!=0 || suspended[19]!=0 || active[19]!=1);
      else{
        if(!df){
          smokeOnOff.gethook();
          df = true;
        }
        runClockDomain();
      }
      smokeOnOff.setpreclear();
      getSmokeDetection.setpreclear();
      fireAlarm.setpreclear();
      int dummyint = 0;
      for(int qw=0;qw<currsigs.size();++qw){
        dummyint = ((Signal)currsigs.elementAt(qw)).getStatus() ? ((Signal)currsigs.elementAt(qw)).setprepresent() : ((Signal)currsigs.elementAt(qw)).setpreclear();
        ((Signal)currsigs.elementAt(qw)).setpreval(((Signal)currsigs.elementAt(qw)).getValue());
      }
      currsigs.removeAllElements();
      dummyint = smokeOnOff.getStatus() ? smokeOnOff.setprepresent() : smokeOnOff.setpreclear();
      smokeOnOff.setpreval(smokeOnOff.getValue());
      smokeOnOff.setClear();
      getSmokeDetection.sethook();
      getSmokeDetection.setClear();
      fireAlarm.sethook();
      fireAlarm.setClear();
      if(paused[19]!=0 || suspended[19]!=0 || active[19]!=1);
      else{
        smokeOnOff.gethook();
      }
      runFinisher();
      if(active[19] == 0){
      	this.terminated = true;
      }
      if(!threaded) break;
    }
  }
}
