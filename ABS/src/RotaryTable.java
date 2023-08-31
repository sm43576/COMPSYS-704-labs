import java.util.*;
import com.systemj.ClockDomain;
import com.systemj.Signal;
import com.systemj.input_Channel;
import com.systemj.output_Channel;

public class RotaryTable extends ClockDomain{
  public RotaryTable(String name){super(name);}
  Vector currsigs = new Vector();
  private boolean df = false;
  private char [] active;
  private char [] paused;
  private char [] suspended;
  public Signal tableAlignedWithSensor = new Signal("tableAlignedWithSensor", Signal.INPUT);
  public Signal bottleAtPos5 = new Signal("bottleAtPos5", Signal.INPUT);
  public Signal capOnBottleAtPos1 = new Signal("capOnBottleAtPos1", Signal.INPUT);
  public Signal bottleAtPos1_RT = new Signal("bottleAtPos1_RT", Signal.INPUT);
  public Signal doneAtPos2 = new Signal("doneAtPos2", Signal.INPUT);
  public Signal doneAtPos4 = new Signal("doneAtPos4", Signal.INPUT);
  public Signal doneAtPos3 = new Signal("doneAtPos3", Signal.INPUT);
  public Signal bottleAtPos2_RT = new Signal("bottleAtPos2_RT", Signal.INPUT);
  public Signal bottleAtPos3_RT = new Signal("bottleAtPos3_RT", Signal.INPUT);
  public Signal bottleAtPos4_RT = new Signal("bottleAtPos4_RT", Signal.INPUT);
  public Signal rotaryTableTrigger = new Signal("rotaryTableTrigger", Signal.OUTPUT);
  private int S195 = 1;
  private int S67 = 1;
  
  private int[] ends = new int[4];
  private int[] tdone = new int[4];
  
  public void runClockDomain(){
    for(int i=0;i<ends.length;i++){
      ends[i] = 0;
      tdone[i] = 0;
    }
    
    RUN: while(true){
      switch(S195){
        case 0 : 
          S195=0;
          break RUN;
        
        case 1 : 
          S195=2;
          S195=2;
          S67=0;
          active[2]=1;
          ends[2]=1;
          break RUN;
        
        case 2 : 
          switch(S67){
            case 0 : 
              S67=0;
              S67=1;
              active[2]=1;
              ends[2]=1;
              break RUN;
            
            case 1 : 
              if(bottleAtPos1_RT.getprestatus()){//sysj\controller.sysj line: 37, column: 9
                S67=2;
                active[2]=1;
                ends[2]=1;
                break RUN;
              }
              else {
                active[2]=1;
                ends[2]=1;
                break RUN;
              }
            
            case 2 : 
              if(!capOnBottleAtPos1.getprestatus()){//sysj\controller.sysj line: 38, column: 9
                S67=3;
                rotaryTableTrigger.setPresent();//sysj\controller.sysj line: 40, column: 4
                currsigs.addElement(rotaryTableTrigger);
                active[2]=1;
                ends[2]=1;
                break RUN;
              }
              else {
                active[2]=1;
                ends[2]=1;
                break RUN;
              }
            
            case 3 : 
              if(bottleAtPos2_RT.getprestatus()){//sysj\controller.sysj line: 39, column: 9
                S67=4;
                active[2]=1;
                ends[2]=1;
                break RUN;
              }
              else {
                rotaryTableTrigger.setPresent();//sysj\controller.sysj line: 40, column: 4
                currsigs.addElement(rotaryTableTrigger);
                active[2]=1;
                ends[2]=1;
                break RUN;
              }
            
            case 4 : 
              if(doneAtPos2.getprestatus()){//sysj\controller.sysj line: 42, column: 9
                S67=5;
                rotaryTableTrigger.setPresent();//sysj\controller.sysj line: 44, column: 4
                currsigs.addElement(rotaryTableTrigger);
                active[2]=1;
                ends[2]=1;
                break RUN;
              }
              else {
                active[2]=1;
                ends[2]=1;
                break RUN;
              }
            
            case 5 : 
              if(bottleAtPos3_RT.getprestatus()){//sysj\controller.sysj line: 43, column: 9
                S67=6;
                active[2]=1;
                ends[2]=1;
                break RUN;
              }
              else {
                rotaryTableTrigger.setPresent();//sysj\controller.sysj line: 44, column: 4
                currsigs.addElement(rotaryTableTrigger);
                active[2]=1;
                ends[2]=1;
                break RUN;
              }
            
            case 6 : 
              if(doneAtPos3.getprestatus()){//sysj\controller.sysj line: 46, column: 9
                S67=7;
                rotaryTableTrigger.setPresent();//sysj\controller.sysj line: 48, column: 4
                currsigs.addElement(rotaryTableTrigger);
                active[2]=1;
                ends[2]=1;
                break RUN;
              }
              else {
                active[2]=1;
                ends[2]=1;
                break RUN;
              }
            
            case 7 : 
              if(bottleAtPos4_RT.getprestatus()){//sysj\controller.sysj line: 47, column: 9
                S67=8;
                active[2]=1;
                ends[2]=1;
                break RUN;
              }
              else {
                rotaryTableTrigger.setPresent();//sysj\controller.sysj line: 48, column: 4
                currsigs.addElement(rotaryTableTrigger);
                active[2]=1;
                ends[2]=1;
                break RUN;
              }
            
            case 8 : 
              if(doneAtPos4.getprestatus()){//sysj\controller.sysj line: 50, column: 9
                S67=9;
                rotaryTableTrigger.setPresent();//sysj\controller.sysj line: 52, column: 4
                currsigs.addElement(rotaryTableTrigger);
                active[2]=1;
                ends[2]=1;
                break RUN;
              }
              else {
                active[2]=1;
                ends[2]=1;
                break RUN;
              }
            
            case 9 : 
              if(bottleAtPos5.getprestatus()){//sysj\controller.sysj line: 51, column: 9
                S67=0;
                active[2]=1;
                ends[2]=1;
                break RUN;
              }
              else {
                rotaryTableTrigger.setPresent();//sysj\controller.sysj line: 52, column: 4
                currsigs.addElement(rotaryTableTrigger);
                active[2]=1;
                ends[2]=1;
                break RUN;
              }
            
          }
        
      }
    }
  }

  public void init(){
    char [] active1 = {1, 1, 1, 1};
    char [] paused1 = {0, 0, 0, 0};
    char [] suspended1 = {0, 0, 0, 0};
    paused = paused1;
    active = active1;
    suspended = suspended1;
    // Now instantiate all the local signals ONLY
    // --------------------------------------------------
  }
  
  public void run(){
    while(active[2] != 0){
      int index = 2;
      if(paused[index]==1 || suspended[index]==1 || active[index] == 0){
        for(int h=1;h<paused.length;++h){
          paused[h]=0;
        }
      }
      if(paused[2]!=0 || suspended[2]!=0 || active[2]!=1);
      else{
        if(!df){
          tableAlignedWithSensor.gethook();
          bottleAtPos5.gethook();
          capOnBottleAtPos1.gethook();
          bottleAtPos1_RT.gethook();
          doneAtPos2.gethook();
          doneAtPos4.gethook();
          doneAtPos3.gethook();
          bottleAtPos2_RT.gethook();
          bottleAtPos3_RT.gethook();
          bottleAtPos4_RT.gethook();
          df = true;
        }
        runClockDomain();
      }
      tableAlignedWithSensor.setpreclear();
      bottleAtPos5.setpreclear();
      capOnBottleAtPos1.setpreclear();
      bottleAtPos1_RT.setpreclear();
      doneAtPos2.setpreclear();
      doneAtPos4.setpreclear();
      doneAtPos3.setpreclear();
      bottleAtPos2_RT.setpreclear();
      bottleAtPos3_RT.setpreclear();
      bottleAtPos4_RT.setpreclear();
      rotaryTableTrigger.setpreclear();
      int dummyint = 0;
      for(int qw=0;qw<currsigs.size();++qw){
        dummyint = ((Signal)currsigs.elementAt(qw)).getStatus() ? ((Signal)currsigs.elementAt(qw)).setprepresent() : ((Signal)currsigs.elementAt(qw)).setpreclear();
        ((Signal)currsigs.elementAt(qw)).setpreval(((Signal)currsigs.elementAt(qw)).getValue());
      }
      currsigs.removeAllElements();
      dummyint = tableAlignedWithSensor.getStatus() ? tableAlignedWithSensor.setprepresent() : tableAlignedWithSensor.setpreclear();
      tableAlignedWithSensor.setpreval(tableAlignedWithSensor.getValue());
      tableAlignedWithSensor.setClear();
      dummyint = bottleAtPos5.getStatus() ? bottleAtPos5.setprepresent() : bottleAtPos5.setpreclear();
      bottleAtPos5.setpreval(bottleAtPos5.getValue());
      bottleAtPos5.setClear();
      dummyint = capOnBottleAtPos1.getStatus() ? capOnBottleAtPos1.setprepresent() : capOnBottleAtPos1.setpreclear();
      capOnBottleAtPos1.setpreval(capOnBottleAtPos1.getValue());
      capOnBottleAtPos1.setClear();
      dummyint = bottleAtPos1_RT.getStatus() ? bottleAtPos1_RT.setprepresent() : bottleAtPos1_RT.setpreclear();
      bottleAtPos1_RT.setpreval(bottleAtPos1_RT.getValue());
      bottleAtPos1_RT.setClear();
      dummyint = doneAtPos2.getStatus() ? doneAtPos2.setprepresent() : doneAtPos2.setpreclear();
      doneAtPos2.setpreval(doneAtPos2.getValue());
      doneAtPos2.setClear();
      dummyint = doneAtPos4.getStatus() ? doneAtPos4.setprepresent() : doneAtPos4.setpreclear();
      doneAtPos4.setpreval(doneAtPos4.getValue());
      doneAtPos4.setClear();
      dummyint = doneAtPos3.getStatus() ? doneAtPos3.setprepresent() : doneAtPos3.setpreclear();
      doneAtPos3.setpreval(doneAtPos3.getValue());
      doneAtPos3.setClear();
      dummyint = bottleAtPos2_RT.getStatus() ? bottleAtPos2_RT.setprepresent() : bottleAtPos2_RT.setpreclear();
      bottleAtPos2_RT.setpreval(bottleAtPos2_RT.getValue());
      bottleAtPos2_RT.setClear();
      dummyint = bottleAtPos3_RT.getStatus() ? bottleAtPos3_RT.setprepresent() : bottleAtPos3_RT.setpreclear();
      bottleAtPos3_RT.setpreval(bottleAtPos3_RT.getValue());
      bottleAtPos3_RT.setClear();
      dummyint = bottleAtPos4_RT.getStatus() ? bottleAtPos4_RT.setprepresent() : bottleAtPos4_RT.setpreclear();
      bottleAtPos4_RT.setpreval(bottleAtPos4_RT.getValue());
      bottleAtPos4_RT.setClear();
      rotaryTableTrigger.sethook();
      rotaryTableTrigger.setClear();
      if(paused[2]!=0 || suspended[2]!=0 || active[2]!=1);
      else{
        tableAlignedWithSensor.gethook();
        bottleAtPos5.gethook();
        capOnBottleAtPos1.gethook();
        bottleAtPos1_RT.gethook();
        doneAtPos2.gethook();
        doneAtPos4.gethook();
        doneAtPos3.gethook();
        bottleAtPos2_RT.gethook();
        bottleAtPos3_RT.gethook();
        bottleAtPos4_RT.gethook();
      }
      runFinisher();
      if(active[2] == 0){
      	this.terminated = true;
      }
      if(!threaded) break;
    }
  }
}
