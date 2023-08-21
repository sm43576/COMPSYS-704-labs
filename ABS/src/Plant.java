import java.util.*;
import com.systemj.ClockDomain;
import com.systemj.Signal;
import com.systemj.input_Channel;
import com.systemj.output_Channel;
import run.GUI;//sysj\plant.sysj line: 1, column: 2

public class Plant extends ClockDomain{
  public Plant(String name){super(name);}
  Vector currsigs = new Vector();
  private boolean df = false;
  private char [] active;
  private char [] paused;
  private char [] suspended;
  public Signal motConveyorOnOff = new Signal("motConveyorOnOff", Signal.INPUT);
  public Signal enable = new Signal("enable", Signal.INPUT);
  public Signal refill = new Signal("refill", Signal.INPUT);
  public Signal bottleAtPos1 = new Signal("bottleAtPos1", Signal.OUTPUT);
  public Signal bottleAtPos5 = new Signal("bottleAtPos5", Signal.OUTPUT);
  public Signal bottleAtPos1E = new Signal("bottleAtPos1E", Signal.OUTPUT);
  public Signal bottleLeftPos5E = new Signal("bottleLeftPos5E", Signal.OUTPUT);
  private int S279 = 1;
  private int S163 = 1;
  private int S75 = 1;
  private int S171 = 1;
  
  private int[] ends = new int[4];
  private int[] tdone = new int[4];
  
  public void thread285(int [] tdone, int [] ends){
        switch(S171){
      case 0 : 
        active[3]=0;
        ends[3]=0;
        tdone[3]=1;
        break;
      
      case 1 : 
        if(bottleAtPos1.getprestatus()){//sysj\plant.sysj line: 132, column: 24
          bottleAtPos1E.setPresent();//sysj\plant.sysj line: 132, column: 38
          currsigs.addElement(bottleAtPos1E);
          active[3]=1;
          ends[3]=1;
          tdone[3]=1;
        }
        else {
          active[3]=1;
          ends[3]=1;
          tdone[3]=1;
        }
        break;
      
    }
  }

  public void thread284(int [] tdone, int [] ends){
        switch(S163){
      case 0 : 
        active[2]=0;
        ends[2]=0;
        tdone[2]=1;
        break;
      
      case 1 : 
        switch(S75){
          case 0 : 
            if(enable.getprestatus()){//sysj\plant.sysj line: 24, column: 10
              S75=1;
              bottleAtPos5.setPresent();//sysj\plant.sysj line: 26, column: 5
              currsigs.addElement(bottleAtPos5);
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            else {
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            break;
          
          case 1 : 
            if(!enable.getprestatus()){//sysj\plant.sysj line: 25, column: 10
              System.out.println("ew");//sysj\plant.sysj line: 28, column: 4
              S75=2;
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            else {
              bottleAtPos5.setPresent();//sysj\plant.sysj line: 26, column: 5
              currsigs.addElement(bottleAtPos5);
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            break;
          
          case 2 : 
            if(enable.getprestatus()){//sysj\plant.sysj line: 30, column: 10
              System.out.println("ewewwhfsdhvfyujg");//sysj\plant.sysj line: 31, column: 4
              System.out.println("copium");//sysj\plant.sysj line: 34, column: 4
              S75=3;
              System.out.println("sustaining bottle at pos 1");//sysj\plant.sysj line: 38, column: 6
              bottleAtPos1.setPresent();//sysj\plant.sysj line: 39, column: 6
              currsigs.addElement(bottleAtPos1);
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            else {
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            break;
          
          case 3 : 
            if(!enable.getprestatus()){//sysj\plant.sysj line: 36, column: 10
              System.out.println("im outtt");//sysj\plant.sysj line: 44, column: 4
              S75=4;
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            else {
              if(motConveyorOnOff.getprestatus()){//sysj\plant.sysj line: 37, column: 11
                System.out.println("im outtt");//sysj\plant.sysj line: 44, column: 4
                S75=4;
                active[2]=1;
                ends[2]=1;
                tdone[2]=1;
              }
              else {
                bottleAtPos1.setPresent();//sysj\plant.sysj line: 39, column: 6
                currsigs.addElement(bottleAtPos1);
                active[2]=1;
                ends[2]=1;
                tdone[2]=1;
              }
            }
            break;
          
          case 4 : 
            S75=4;
            S75=5;
            active[2]=1;
            ends[2]=1;
            tdone[2]=1;
            break;
          
          case 5 : 
            if(!enable.getprestatus()){//sysj\plant.sysj line: 46, column: 10
              S75=0;
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            else {
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread282(int [] tdone, int [] ends){
        S171=1;
    if(bottleAtPos1.getprestatus()){//sysj\plant.sysj line: 132, column: 24
      bottleAtPos1E.setPresent();//sysj\plant.sysj line: 132, column: 38
      currsigs.addElement(bottleAtPos1E);
      active[3]=1;
      ends[3]=1;
      tdone[3]=1;
    }
    else {
      active[3]=1;
      ends[3]=1;
      tdone[3]=1;
    }
  }

  public void thread281(int [] tdone, int [] ends){
        S163=1;
    S75=0;
    active[2]=1;
    ends[2]=1;
    tdone[2]=1;
  }

  public void runClockDomain(){
    for(int i=0;i<ends.length;i++){
      ends[i] = 0;
      tdone[i] = 0;
    }
    
    RUN: while(true){
      switch(S279){
        case 0 : 
          S279=0;
          break RUN;
        
        case 1 : 
          S279=2;
          S279=2;
          new Thread(new GUI()).start();//sysj\plant.sysj line: 18, column: 2
          thread281(tdone,ends);
          thread282(tdone,ends);
          int biggest283 = 0;
          if(ends[2]>=biggest283){
            biggest283=ends[2];
          }
          if(ends[3]>=biggest283){
            biggest283=ends[3];
          }
          if(biggest283 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
        
        case 2 : 
          thread284(tdone,ends);
          thread285(tdone,ends);
          int biggest286 = 0;
          if(ends[2]>=biggest286){
            biggest286=ends[2];
          }
          if(ends[3]>=biggest286){
            biggest286=ends[3];
          }
          if(biggest286 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
          //FINXME code
          if(biggest286 == 0){
            S279=0;
            active[1]=0;
            ends[1]=0;
            S279=0;
            break RUN;
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
          motConveyorOnOff.gethook();
          enable.gethook();
          refill.gethook();
          df = true;
        }
        runClockDomain();
      }
      motConveyorOnOff.setpreclear();
      enable.setpreclear();
      refill.setpreclear();
      bottleAtPos1.setpreclear();
      bottleAtPos5.setpreclear();
      bottleAtPos1E.setpreclear();
      bottleLeftPos5E.setpreclear();
      int dummyint = 0;
      for(int qw=0;qw<currsigs.size();++qw){
        dummyint = ((Signal)currsigs.elementAt(qw)).getStatus() ? ((Signal)currsigs.elementAt(qw)).setprepresent() : ((Signal)currsigs.elementAt(qw)).setpreclear();
        ((Signal)currsigs.elementAt(qw)).setpreval(((Signal)currsigs.elementAt(qw)).getValue());
      }
      currsigs.removeAllElements();
      dummyint = motConveyorOnOff.getStatus() ? motConveyorOnOff.setprepresent() : motConveyorOnOff.setpreclear();
      motConveyorOnOff.setpreval(motConveyorOnOff.getValue());
      motConveyorOnOff.setClear();
      dummyint = enable.getStatus() ? enable.setprepresent() : enable.setpreclear();
      enable.setpreval(enable.getValue());
      enable.setClear();
      dummyint = refill.getStatus() ? refill.setprepresent() : refill.setpreclear();
      refill.setpreval(refill.getValue());
      refill.setClear();
      bottleAtPos1.sethook();
      bottleAtPos1.setClear();
      bottleAtPos5.sethook();
      bottleAtPos5.setClear();
      bottleAtPos1E.sethook();
      bottleAtPos1E.setClear();
      bottleLeftPos5E.sethook();
      bottleLeftPos5E.setClear();
      if(paused[1]!=0 || suspended[1]!=0 || active[1]!=1);
      else{
        motConveyorOnOff.gethook();
        enable.gethook();
        refill.gethook();
      }
      runFinisher();
      if(active[1] == 0){
      	this.terminated = true;
      }
      if(!threaded) break;
    }
  }
}
