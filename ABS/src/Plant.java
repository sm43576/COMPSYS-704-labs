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
  public Signal bottleLeftPos5 = new Signal("bottleLeftPos5", Signal.OUTPUT);
  public Signal bottleAtPos1E = new Signal("bottleAtPos1E", Signal.OUTPUT);
  public Signal bottleLeftPos5E = new Signal("bottleLeftPos5E", Signal.OUTPUT);
  private int S237 = 1;
  private int S142 = 1;
  private int S88 = 1;
  private int S72 = 1;
  private int S150 = 1;
  
  private int[] ends = new int[4];
  private int[] tdone = new int[4];
  
  public void thread243(int [] tdone, int [] ends){
        switch(S150){
      case 0 : 
        active[3]=0;
        ends[3]=0;
        tdone[3]=1;
        break;
      
      case 1 : 
        if(bottleAtPos1.getprestatus()){//sysj\plant.sysj line: 117, column: 24
          bottleAtPos1E.setPresent();//sysj\plant.sysj line: 117, column: 38
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

  public void thread242(int [] tdone, int [] ends){
        switch(S142){
      case 0 : 
        active[2]=0;
        ends[2]=0;
        tdone[2]=1;
        break;
      
      case 1 : 
        switch(S88){
          case 0 : 
            if(motConveyorOnOff.getprestatus() && enable.getprestatus()){//sysj\plant.sysj line: 25, column: 10
              S88=1;
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            else {
              switch(S72){
                case 0 : 
                  bottleAtPos1.setPresent();//sysj\plant.sysj line: 28, column: 5
                  currsigs.addElement(bottleAtPos1);
                  active[2]=1;
                  ends[2]=1;
                  tdone[2]=1;
                  break;
                
                case 1 : 
                  bottleLeftPos5.setPresent();//sysj\plant.sysj line: 29, column: 5
                  currsigs.addElement(bottleLeftPos5);
                  active[2]=1;
                  ends[2]=1;
                  tdone[2]=1;
                  break;
                
              }
            }
            break;
          
          case 1 : 
            if(!enable.getprestatus()){//sysj\plant.sysj line: 32, column: 10
              System.out.println("ew");//sysj\plant.sysj line: 24, column: 4
              S88=0;
              System.out.println("sustaining bottle at pos 1");//sysj\plant.sysj line: 27, column: 5
              S72=0;
              bottleAtPos1.setPresent();//sysj\plant.sysj line: 28, column: 5
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
          
        }
        break;
      
    }
  }

  public void thread240(int [] tdone, int [] ends){
        S150=1;
    if(bottleAtPos1.getprestatus()){//sysj\plant.sysj line: 117, column: 24
      bottleAtPos1E.setPresent();//sysj\plant.sysj line: 117, column: 38
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

  public void thread239(int [] tdone, int [] ends){
        S142=1;
    System.out.println("ew");//sysj\plant.sysj line: 24, column: 4
    S88=0;
    System.out.println("sustaining bottle at pos 1");//sysj\plant.sysj line: 27, column: 5
    S72=0;
    bottleAtPos1.setPresent();//sysj\plant.sysj line: 28, column: 5
    currsigs.addElement(bottleAtPos1);
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
      switch(S237){
        case 0 : 
          S237=0;
          break RUN;
        
        case 1 : 
          S237=2;
          S237=2;
          new Thread(new GUI()).start();//sysj\plant.sysj line: 18, column: 2
          thread239(tdone,ends);
          thread240(tdone,ends);
          int biggest241 = 0;
          if(ends[2]>=biggest241){
            biggest241=ends[2];
          }
          if(ends[3]>=biggest241){
            biggest241=ends[3];
          }
          if(biggest241 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
        
        case 2 : 
          thread242(tdone,ends);
          thread243(tdone,ends);
          int biggest244 = 0;
          if(ends[2]>=biggest244){
            biggest244=ends[2];
          }
          if(ends[3]>=biggest244){
            biggest244=ends[3];
          }
          if(biggest244 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
          //FINXME code
          if(biggest244 == 0){
            S237=0;
            active[1]=0;
            ends[1]=0;
            S237=0;
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
      bottleLeftPos5.setpreclear();
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
      bottleLeftPos5.sethook();
      bottleLeftPos5.setClear();
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
