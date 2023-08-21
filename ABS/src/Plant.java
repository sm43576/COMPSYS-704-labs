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
  public Signal bottleAtPos5E = new Signal("bottleAtPos5E", Signal.OUTPUT);
  public Signal motConveyorOnOffE = new Signal("motConveyorOnOffE", Signal.OUTPUT);
  private int S411 = 1;
  private int S211 = 1;
  private int S83 = 1;
  private int S73 = 1;
  private int S237 = 1;
  private int S219 = 1;
  private int S213 = 1;
  private int S227 = 1;
  private int S235 = 1;
  
  private int[] ends = new int[7];
  private int[] tdone = new int[7];
  
  public void thread424(int [] tdone, int [] ends){
        switch(S235){
      case 0 : 
        active[6]=0;
        ends[6]=0;
        tdone[6]=1;
        break;
      
      case 1 : 
        if(bottleAtPos5.getprestatus()){//sysj\plant.sysj line: 147, column: 25
          bottleAtPos5E.setPresent();//sysj\plant.sysj line: 147, column: 39
          currsigs.addElement(bottleAtPos5E);
          active[6]=1;
          ends[6]=1;
          tdone[6]=1;
        }
        else {
          active[6]=1;
          ends[6]=1;
          tdone[6]=1;
        }
        break;
      
    }
  }

  public void thread423(int [] tdone, int [] ends){
        switch(S227){
      case 0 : 
        active[5]=0;
        ends[5]=0;
        tdone[5]=1;
        break;
      
      case 1 : 
        if(bottleAtPos1.getprestatus()){//sysj\plant.sysj line: 145, column: 24
          bottleAtPos1E.setPresent();//sysj\plant.sysj line: 145, column: 38
          currsigs.addElement(bottleAtPos1E);
          active[5]=1;
          ends[5]=1;
          tdone[5]=1;
        }
        else {
          active[5]=1;
          ends[5]=1;
          tdone[5]=1;
        }
        break;
      
    }
  }

  public void thread422(int [] tdone, int [] ends){
        switch(S219){
      case 0 : 
        active[4]=0;
        ends[4]=0;
        tdone[4]=1;
        break;
      
      case 1 : 
        switch(S213){
          case 0 : 
            S213=0;
            if(motConveyorOnOff.getprestatus()){//sysj\plant.sysj line: 143, column: 25
              motConveyorOnOffE.setPresent();//sysj\plant.sysj line: 143, column: 43
              currsigs.addElement(motConveyorOnOffE);
              S213=1;
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            else {
              S213=1;
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            break;
          
          case 1 : 
            S213=1;
            S213=0;
            if(motConveyorOnOff.getprestatus()){//sysj\plant.sysj line: 143, column: 25
              motConveyorOnOffE.setPresent();//sysj\plant.sysj line: 143, column: 43
              currsigs.addElement(motConveyorOnOffE);
              S213=1;
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            else {
              S213=1;
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread421(int [] tdone, int [] ends){
        switch(S237){
      case 0 : 
        active[3]=0;
        ends[3]=0;
        tdone[3]=1;
        break;
      
      case 1 : 
        thread422(tdone,ends);
        thread423(tdone,ends);
        thread424(tdone,ends);
        int biggest425 = 0;
        if(ends[4]>=biggest425){
          biggest425=ends[4];
        }
        if(ends[5]>=biggest425){
          biggest425=ends[5];
        }
        if(ends[6]>=biggest425){
          biggest425=ends[6];
        }
        if(biggest425 == 1){
          active[3]=1;
          ends[3]=1;
          tdone[3]=1;
        }
        //FINXME code
        if(biggest425 == 0){
          S237=0;
          active[3]=0;
          ends[3]=0;
          tdone[3]=1;
        }
        break;
      
    }
  }

  public void thread420(int [] tdone, int [] ends){
        switch(S211){
      case 0 : 
        active[2]=0;
        ends[2]=0;
        tdone[2]=1;
        break;
      
      case 1 : 
        switch(S83){
          case 0 : 
            if(enable.getprestatus()){//sysj\plant.sysj line: 25, column: 10
              S83=1;
              System.out.println("sustaining bottle at pos 5");//sysj\plant.sysj line: 30, column: 5
              S73=0;
              bottleAtPos5.setPresent();//sysj\plant.sysj line: 31, column: 5
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
            if(!enable.getprestatus()){//sysj\plant.sysj line: 28, column: 10
              S83=2;
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            else {
              switch(S73){
                case 0 : 
                  bottleAtPos5.setPresent();//sysj\plant.sysj line: 31, column: 5
                  currsigs.addElement(bottleAtPos5);
                  active[2]=1;
                  ends[2]=1;
                  tdone[2]=1;
                  break;
                
                case 1 : 
                  S73=1;
                  S83=2;
                  active[2]=1;
                  ends[2]=1;
                  tdone[2]=1;
                  break;
                
              }
            }
            break;
          
          case 2 : 
            S83=2;
            S83=3;
            active[2]=1;
            ends[2]=1;
            tdone[2]=1;
            break;
          
          case 3 : 
            if(enable.getprestatus()){//sysj\plant.sysj line: 39, column: 10
              S83=4;
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
          
          case 4 : 
            S83=4;
            S83=5;
            System.out.println("sustaining bottle at pos 1");//sysj\plant.sysj line: 44, column: 6
            bottleAtPos1.setPresent();//sysj\plant.sysj line: 45, column: 6
            currsigs.addElement(bottleAtPos1);
            active[2]=1;
            ends[2]=1;
            tdone[2]=1;
            break;
          
          case 5 : 
            if(motConveyorOnOff.getprestatus()){//sysj\plant.sysj line: 43, column: 10
              S83=6;
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            else {
              bottleAtPos1.setPresent();//sysj\plant.sysj line: 45, column: 6
              currsigs.addElement(bottleAtPos1);
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            break;
          
          case 6 : 
            if(!enable.getprestatus()){//sysj\plant.sysj line: 48, column: 10
              S83=7;
              bottleAtPos1.setPresent();//sysj\plant.sysj line: 51, column: 5
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
          
          case 7 : 
            if(enable.getprestatus()){//sysj\plant.sysj line: 50, column: 10
              S83=8;
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            else {
              bottleAtPos1.setPresent();//sysj\plant.sysj line: 51, column: 5
              currsigs.addElement(bottleAtPos1);
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            break;
          
          case 8 : 
            if(enable.getprestatus()){//sysj\plant.sysj line: 55, column: 10
              System.out.println("im outtt");//sysj\plant.sysj line: 56, column: 4
              S83=9;
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
          
          case 9 : 
            S83=9;
            S83=0;
            active[2]=1;
            ends[2]=1;
            tdone[2]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread417(int [] tdone, int [] ends){
        S235=1;
    if(bottleAtPos5.getprestatus()){//sysj\plant.sysj line: 147, column: 25
      bottleAtPos5E.setPresent();//sysj\plant.sysj line: 147, column: 39
      currsigs.addElement(bottleAtPos5E);
      active[6]=1;
      ends[6]=1;
      tdone[6]=1;
    }
    else {
      active[6]=1;
      ends[6]=1;
      tdone[6]=1;
    }
  }

  public void thread416(int [] tdone, int [] ends){
        S227=1;
    if(bottleAtPos1.getprestatus()){//sysj\plant.sysj line: 145, column: 24
      bottleAtPos1E.setPresent();//sysj\plant.sysj line: 145, column: 38
      currsigs.addElement(bottleAtPos1E);
      active[5]=1;
      ends[5]=1;
      tdone[5]=1;
    }
    else {
      active[5]=1;
      ends[5]=1;
      tdone[5]=1;
    }
  }

  public void thread415(int [] tdone, int [] ends){
        S219=1;
    S213=0;
    if(motConveyorOnOff.getprestatus()){//sysj\plant.sysj line: 143, column: 25
      motConveyorOnOffE.setPresent();//sysj\plant.sysj line: 143, column: 43
      currsigs.addElement(motConveyorOnOffE);
      S213=1;
      active[4]=1;
      ends[4]=1;
      tdone[4]=1;
    }
    else {
      S213=1;
      active[4]=1;
      ends[4]=1;
      tdone[4]=1;
    }
  }

  public void thread414(int [] tdone, int [] ends){
        S237=1;
    thread415(tdone,ends);
    thread416(tdone,ends);
    thread417(tdone,ends);
    int biggest418 = 0;
    if(ends[4]>=biggest418){
      biggest418=ends[4];
    }
    if(ends[5]>=biggest418){
      biggest418=ends[5];
    }
    if(ends[6]>=biggest418){
      biggest418=ends[6];
    }
    if(biggest418 == 1){
      active[3]=1;
      ends[3]=1;
      tdone[3]=1;
    }
  }

  public void thread413(int [] tdone, int [] ends){
        S211=1;
    S83=0;
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
      switch(S411){
        case 0 : 
          S411=0;
          break RUN;
        
        case 1 : 
          S411=2;
          S411=2;
          new Thread(new GUI()).start();//sysj\plant.sysj line: 18, column: 2
          thread413(tdone,ends);
          thread414(tdone,ends);
          int biggest419 = 0;
          if(ends[2]>=biggest419){
            biggest419=ends[2];
          }
          if(ends[3]>=biggest419){
            biggest419=ends[3];
          }
          if(biggest419 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
        
        case 2 : 
          thread420(tdone,ends);
          thread421(tdone,ends);
          int biggest426 = 0;
          if(ends[2]>=biggest426){
            biggest426=ends[2];
          }
          if(ends[3]>=biggest426){
            biggest426=ends[3];
          }
          if(biggest426 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
          //FINXME code
          if(biggest426 == 0){
            S411=0;
            active[1]=0;
            ends[1]=0;
            S411=0;
            break RUN;
          }
        
      }
    }
  }

  public void init(){
    char [] active1 = {1, 1, 1, 1, 1, 1, 1};
    char [] paused1 = {0, 0, 0, 0, 0, 0, 0};
    char [] suspended1 = {0, 0, 0, 0, 0, 0, 0};
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
      bottleAtPos5E.setpreclear();
      motConveyorOnOffE.setpreclear();
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
      bottleAtPos5E.sethook();
      bottleAtPos5E.setClear();
      motConveyorOnOffE.sethook();
      motConveyorOnOffE.setClear();
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
