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
  public Signal capOnBottleAtPos1 = new Signal("capOnBottleAtPos1", Signal.INPUT);
  public Signal RTbottleAtPos1 = new Signal("RTbottleAtPos1", Signal.INPUT);
  public Signal rotaryTableTrigger = new Signal("rotaryTableTrigger", Signal.OUTPUT);
  private Signal allOperationsFinished_2;
  private int S94 = 1;
  private int S68 = 1;
  
  private int[] ends = new int[3];
  private int[] tdone = new int[3];
  
  public void runClockDomain(){
    for(int i=0;i<ends.length;i++){
      ends[i] = 0;
      tdone[i] = 0;
    }
    
    RUN: while(true){
      switch(S94){
        case 0 : 
          S94=0;
          break RUN;
        
        case 1 : 
          S94=2;
          S94=2;
          allOperationsFinished_2.setClear();//sysj\controller.sysj line: 35, column: 2
          System.out.println("HELLLLLLLLO");//sysj\controller.sysj line: 37, column: 3
          S68=0;
          active[2]=1;
          ends[2]=1;
          break RUN;
        
        case 2 : 
          allOperationsFinished_2.setClear();//sysj\controller.sysj line: 35, column: 2
          switch(S68){
            case 0 : 
              if(RTbottleAtPos1.getprestatus()){//sysj\controller.sysj line: 38, column: 9
                System.out.println("A bottle is at position 1");//sysj\controller.sysj line: 39, column: 3
                S68=1;
                active[2]=1;
                ends[2]=1;
                break RUN;
              }
              else {
                active[2]=1;
                ends[2]=1;
                break RUN;
              }
            
            case 1 : 
              S68=1;
              S68=2;
              active[2]=1;
              ends[2]=1;
              break RUN;
            
            case 2 : 
              if(!capOnBottleAtPos1.getprestatus()){//sysj\controller.sysj line: 43, column: 9
                System.out.println("A cap bottle is NOT on the bottle at pos 1");//sysj\controller.sysj line: 44, column: 3
                S68=3;
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
              S68=3;
              System.out.println("emitting rotary trigger");//sysj\controller.sysj line: 54, column: 4
              rotaryTableTrigger.setPresent();//sysj\controller.sysj line: 55, column: 4
              currsigs.addElement(rotaryTableTrigger);
              S68=4;
              active[2]=1;
              ends[2]=1;
              break RUN;
            
            case 4 : 
              S68=4;
              System.out.println("out - next loop");//sysj\controller.sysj line: 59, column: 3
              System.out.println("HELLLLLLLLO");//sysj\controller.sysj line: 37, column: 3
              S68=0;
              active[2]=1;
              ends[2]=1;
              break RUN;
            
          }
        
      }
    }
  }

  public void init(){
    char [] active1 = {1, 1, 1};
    char [] paused1 = {0, 0, 0};
    char [] suspended1 = {0, 0, 0};
    paused = paused1;
    active = active1;
    suspended = suspended1;
    // Now instantiate all the local signals ONLY
    allOperationsFinished_2 = new Signal();
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
          capOnBottleAtPos1.gethook();
          RTbottleAtPos1.gethook();
          df = true;
        }
        runClockDomain();
      }
      tableAlignedWithSensor.setpreclear();
      capOnBottleAtPos1.setpreclear();
      RTbottleAtPos1.setpreclear();
      rotaryTableTrigger.setpreclear();
      allOperationsFinished_2.setpreclear();
      int dummyint = 0;
      for(int qw=0;qw<currsigs.size();++qw){
        dummyint = ((Signal)currsigs.elementAt(qw)).getStatus() ? ((Signal)currsigs.elementAt(qw)).setprepresent() : ((Signal)currsigs.elementAt(qw)).setpreclear();
        ((Signal)currsigs.elementAt(qw)).setpreval(((Signal)currsigs.elementAt(qw)).getValue());
      }
      currsigs.removeAllElements();
      dummyint = tableAlignedWithSensor.getStatus() ? tableAlignedWithSensor.setprepresent() : tableAlignedWithSensor.setpreclear();
      tableAlignedWithSensor.setpreval(tableAlignedWithSensor.getValue());
      tableAlignedWithSensor.setClear();
      dummyint = capOnBottleAtPos1.getStatus() ? capOnBottleAtPos1.setprepresent() : capOnBottleAtPos1.setpreclear();
      capOnBottleAtPos1.setpreval(capOnBottleAtPos1.getValue());
      capOnBottleAtPos1.setClear();
      dummyint = RTbottleAtPos1.getStatus() ? RTbottleAtPos1.setprepresent() : RTbottleAtPos1.setpreclear();
      RTbottleAtPos1.setpreval(RTbottleAtPos1.getValue());
      RTbottleAtPos1.setClear();
      rotaryTableTrigger.sethook();
      rotaryTableTrigger.setClear();
      allOperationsFinished_2.setClear();
      if(paused[2]!=0 || suspended[2]!=0 || active[2]!=1);
      else{
        tableAlignedWithSensor.gethook();
        capOnBottleAtPos1.gethook();
        RTbottleAtPos1.gethook();
      }
      runFinisher();
      if(active[2] == 0){
      	this.terminated = true;
      }
      if(!threaded) break;
    }
  }
}
