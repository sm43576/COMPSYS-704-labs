import java.util.*;
import com.systemj.ClockDomain;
import com.systemj.Signal;
import com.systemj.input_Channel;
import com.systemj.output_Channel;

public class Temperature extends ClockDomain{
  public Temperature(String name){super(name);}
  Vector currsigs = new Vector();
  private boolean df = false;
  private char [] active;
  private char [] paused;
  private char [] suspended;
  public Signal zone1Temp = new Signal("zone1Temp", Signal.OUTPUT);
  public Signal zone2Temp = new Signal("zone2Temp", Signal.OUTPUT);
  public Signal zone3Temp = new Signal("zone3Temp", Signal.OUTPUT);
  public Signal zone4Temp = new Signal("zone4Temp", Signal.OUTPUT);
  public Signal zone5Temp = new Signal("zone5Temp", Signal.OUTPUT);
  public Signal zone6Temp = new Signal("zone6Temp", Signal.OUTPUT);
  public Signal zone7Temp = new Signal("zone7Temp", Signal.OUTPUT);
  public input_Channel zone1T_in = new input_Channel();
  public input_Channel zone2T_in = new input_Channel();
  public input_Channel zone3T_in = new input_Channel();
  public input_Channel zone4T_in = new input_Channel();
  public input_Channel zone5T_in = new input_Channel();
  public input_Channel zone6T_in = new input_Channel();
  public input_Channel zone7T_in = new input_Channel();
  private int temperature_thread_12;//sysj\controller.sysj line: 173, column: 2
  private int S2374 = 1;
  
  private int[] ends = new int[13];
  private int[] tdone = new int[13];
  
  public void runClockDomain(){
    for(int i=0;i<ends.length;i++){
      ends[i] = 0;
      tdone[i] = 0;
    }
    
    RUN: while(true){
      switch(S2374){
        case 0 : 
          S2374=0;
          break RUN;
        
        case 1 : 
          S2374=2;
          S2374=2;
          temperature_thread_12 = 22;//sysj\controller.sysj line: 173, column: 2
          if(temperature_thread_12 < 25){//sysj\controller.sysj line: 176, column: 6
            zone1Temp.setPresent();//sysj\controller.sysj line: 177, column: 5
            currsigs.addElement(zone1Temp);
            zone1Temp.setValue(temperature_thread_12 + 1);//sysj\controller.sysj line: 177, column: 5
            temperature_thread_12 = temperature_thread_12 + 1;//sysj\controller.sysj line: 178, column: 5
            active[12]=1;
            ends[12]=1;
            break RUN;
          }
          else {
            if(temperature_thread_12 > 25){//sysj\controller.sysj line: 180, column: 11
              zone1Temp.setPresent();//sysj\controller.sysj line: 181, column: 4
              currsigs.addElement(zone1Temp);
              zone1Temp.setValue(temperature_thread_12 - 1);//sysj\controller.sysj line: 181, column: 4
              temperature_thread_12 = temperature_thread_12 - 1;//sysj\controller.sysj line: 182, column: 4
              active[12]=1;
              ends[12]=1;
              break RUN;
            }
            else {
              active[12]=1;
              ends[12]=1;
              break RUN;
            }
          }
        
        case 2 : 
          if(temperature_thread_12 < 25){//sysj\controller.sysj line: 176, column: 6
            zone1Temp.setPresent();//sysj\controller.sysj line: 177, column: 5
            currsigs.addElement(zone1Temp);
            zone1Temp.setValue(temperature_thread_12 + 1);//sysj\controller.sysj line: 177, column: 5
            temperature_thread_12 = temperature_thread_12 + 1;//sysj\controller.sysj line: 178, column: 5
            active[12]=1;
            ends[12]=1;
            break RUN;
          }
          else {
            if(temperature_thread_12 > 25){//sysj\controller.sysj line: 180, column: 11
              zone1Temp.setPresent();//sysj\controller.sysj line: 181, column: 4
              currsigs.addElement(zone1Temp);
              zone1Temp.setValue(temperature_thread_12 - 1);//sysj\controller.sysj line: 181, column: 4
              temperature_thread_12 = temperature_thread_12 - 1;//sysj\controller.sysj line: 182, column: 4
              active[12]=1;
              ends[12]=1;
              break RUN;
            }
            else {
              active[12]=1;
              ends[12]=1;
              break RUN;
            }
          }
        
      }
    }
  }

  public void init(){
    char [] active1 = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
    char [] paused1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    char [] suspended1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
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
          zone1T_in.gethook();
          zone2T_in.gethook();
          zone3T_in.gethook();
          zone4T_in.gethook();
          zone5T_in.gethook();
          zone6T_in.gethook();
          zone7T_in.gethook();
          df = true;
        }
        runClockDomain();
      }
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
      zone1T_in.sethook();
      zone2T_in.sethook();
      zone3T_in.sethook();
      zone4T_in.sethook();
      zone5T_in.sethook();
      zone6T_in.sethook();
      zone7T_in.sethook();
      if(paused[12]!=0 || suspended[12]!=0 || active[12]!=1);
      else{
        zone1T_in.gethook();
        zone2T_in.gethook();
        zone3T_in.gethook();
        zone4T_in.gethook();
        zone5T_in.gethook();
        zone6T_in.gethook();
        zone7T_in.gethook();
      }
      runFinisher();
      if(active[12] == 0){
      	this.terminated = true;
      }
      if(!threaded) break;
    }
  }
}
