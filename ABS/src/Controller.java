import java.util.*;
import com.systemj.ClockDomain;
import com.systemj.Signal;
import com.systemj.input_Channel;
import com.systemj.output_Channel;

public class Controller extends ClockDomain{
  public Controller(String name){super(name);}
  Vector currsigs = new Vector();
  private boolean df = false;
  private char [] active;
  private char [] paused;
  private char [] suspended;
  public Signal bottleAtPos1 = new Signal("bottleAtPos1", Signal.INPUT);
  public Signal bottleLeftPos5 = new Signal("bottleLeftPos5", Signal.INPUT);
  public Signal motConveyorOnOff = new Signal("motConveyorOnOff", Signal.OUTPUT);
  private int S64 = 1;
  private int S2 = 1;
  
  private int[] ends = new int[2];
  private int[] tdone = new int[2];
  
  public void runClockDomain(){
    for(int i=0;i<ends.length;i++){
      ends[i] = 0;
      tdone[i] = 0;
    }
    
    RUN: while(true){
      switch(S64){
        case 0 : 
          S64=0;
          break RUN;
        
        case 1 : 
          S64=2;
          S64=2;
          System.out.println("Hello World!");//sysj\controller.sysj line: 23, column: 3
          S2=0;
          active[1]=1;
          ends[1]=1;
          break RUN;
        
        case 2 : 
          switch(S2){
            case 0 : 
              if(!bottleLeftPos5.getprestatus()){//sysj\controller.sysj line: 25, column: 9
                System.out.println("owo?");//sysj\controller.sysj line: 26, column: 3
                S2=1;
                if(!bottleAtPos1.getprestatus()){//sysj\controller.sysj line: 29, column: 12
                  System.out.println("Motor is on");//sysj\controller.sysj line: 30, column: 5
                  motConveyorOnOff.setPresent();//sysj\controller.sysj line: 31, column: 5
                  currsigs.addElement(motConveyorOnOff);
                  active[1]=1;
                  ends[1]=1;
                  break RUN;
                }
                else {
                  System.out.println("Motor is off");//sysj\controller.sysj line: 35, column: 3
                  S2=2;
                  active[1]=1;
                  ends[1]=1;
                  break RUN;
                }
              }
              else {
                active[1]=1;
                ends[1]=1;
                break RUN;
              }
            
            case 1 : 
              if(bottleAtPos1.getprestatus() && bottleLeftPos5.getprestatus()){//sysj\controller.sysj line: 28, column: 9
                System.out.println("Motor is off");//sysj\controller.sysj line: 35, column: 3
                S2=2;
                active[1]=1;
                ends[1]=1;
                break RUN;
              }
              else {
                motConveyorOnOff.setPresent();//sysj\controller.sysj line: 31, column: 5
                currsigs.addElement(motConveyorOnOff);
                active[1]=1;
                ends[1]=1;
                break RUN;
              }
            
            case 2 : 
              S2=2;
              System.out.println("Hello World!");//sysj\controller.sysj line: 23, column: 3
              S2=0;
              active[1]=1;
              ends[1]=1;
              break RUN;
            
          }
        
      }
    }
  }

  public void init(){
    char [] active1 = {1, 1};
    char [] paused1 = {0, 0};
    char [] suspended1 = {0, 0};
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
          bottleAtPos1.gethook();
          bottleLeftPos5.gethook();
          df = true;
        }
        runClockDomain();
      }
      bottleAtPos1.setpreclear();
      bottleLeftPos5.setpreclear();
      motConveyorOnOff.setpreclear();
      int dummyint = 0;
      for(int qw=0;qw<currsigs.size();++qw){
        dummyint = ((Signal)currsigs.elementAt(qw)).getStatus() ? ((Signal)currsigs.elementAt(qw)).setprepresent() : ((Signal)currsigs.elementAt(qw)).setpreclear();
        ((Signal)currsigs.elementAt(qw)).setpreval(((Signal)currsigs.elementAt(qw)).getValue());
      }
      currsigs.removeAllElements();
      dummyint = bottleAtPos1.getStatus() ? bottleAtPos1.setprepresent() : bottleAtPos1.setpreclear();
      bottleAtPos1.setpreval(bottleAtPos1.getValue());
      bottleAtPos1.setClear();
      dummyint = bottleLeftPos5.getStatus() ? bottleLeftPos5.setprepresent() : bottleLeftPos5.setpreclear();
      bottleLeftPos5.setpreval(bottleLeftPos5.getValue());
      bottleLeftPos5.setClear();
      motConveyorOnOff.sethook();
      motConveyorOnOff.setClear();
      if(paused[1]!=0 || suspended[1]!=0 || active[1]!=1);
      else{
        bottleAtPos1.gethook();
        bottleLeftPos5.gethook();
      }
      runFinisher();
      if(active[1] == 0){
      	this.terminated = true;
      }
      if(!threaded) break;
    }
  }
}
