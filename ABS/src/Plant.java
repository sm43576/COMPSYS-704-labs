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
  private int S363 = 1;
  private int S187 = 1;
  private int S83 = 1;
  private int S73 = 1;
  private int S213 = 1;
  private int S195 = 1;
  private int S189 = 1;
  private int S203 = 1;
  private int S211 = 1;
  
  private int[] ends = new int[7];
  private int[] tdone = new int[7];
  
  public void thread376(int [] tdone, int [] ends){
        switch(S211){
      case 0 : 
        active[6]=0;
        ends[6]=0;
        tdone[6]=1;
        break;
      
      case 1 : 
        if(bottleAtPos5.getprestatus()){//sysj\plant.sysj line: 139, column: 25
          bottleAtPos5E.setPresent();//sysj\plant.sysj line: 139, column: 39
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

  public void thread375(int [] tdone, int [] ends){
        switch(S203){
      case 0 : 
        active[5]=0;
        ends[5]=0;
        tdone[5]=1;
        break;
      
      case 1 : 
        if(bottleAtPos1.getprestatus()){//sysj\plant.sysj line: 137, column: 24
          bottleAtPos1E.setPresent();//sysj\plant.sysj line: 137, column: 38
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

  public void thread374(int [] tdone, int [] ends){
        switch(S195){
      case 0 : 
        active[4]=0;
        ends[4]=0;
        tdone[4]=1;
        break;
      
      case 1 : 
        switch(S189){
          case 0 : 
            S189=0;
            if(motConveyorOnOff.getprestatus()){//sysj\plant.sysj line: 135, column: 25
              motConveyorOnOffE.setPresent();//sysj\plant.sysj line: 135, column: 43
              currsigs.addElement(motConveyorOnOffE);
              S189=1;
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            else {
              S189=1;
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            break;
          
          case 1 : 
            S189=1;
            S189=0;
            if(motConveyorOnOff.getprestatus()){//sysj\plant.sysj line: 135, column: 25
              motConveyorOnOffE.setPresent();//sysj\plant.sysj line: 135, column: 43
              currsigs.addElement(motConveyorOnOffE);
              S189=1;
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            else {
              S189=1;
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread373(int [] tdone, int [] ends){
        switch(S213){
      case 0 : 
        active[3]=0;
        ends[3]=0;
        tdone[3]=1;
        break;
      
      case 1 : 
        thread374(tdone,ends);
        thread375(tdone,ends);
        thread376(tdone,ends);
        int biggest377 = 0;
        if(ends[4]>=biggest377){
          biggest377=ends[4];
        }
        if(ends[5]>=biggest377){
          biggest377=ends[5];
        }
        if(ends[6]>=biggest377){
          biggest377=ends[6];
        }
        if(biggest377 == 1){
          active[3]=1;
          ends[3]=1;
          tdone[3]=1;
        }
        //FINXME code
        if(biggest377 == 0){
          S213=0;
          active[3]=0;
          ends[3]=0;
          tdone[3]=1;
        }
        break;
      
    }
  }

  public void thread372(int [] tdone, int [] ends){
        switch(S187){
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
              System.out.println("sustaining bottle at pos 5");//sysj\plant.sysj line: 28, column: 5
              S73=0;
              bottleAtPos5.setPresent();//sysj\plant.sysj line: 29, column: 5
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
            if(!enable.getprestatus()){//sysj\plant.sysj line: 26, column: 10
              System.out.println("ew");//sysj\plant.sysj line: 32, column: 4
              S83=2;
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            else {
              switch(S73){
                case 0 : 
                  bottleAtPos5.setPresent();//sysj\plant.sysj line: 29, column: 5
                  currsigs.addElement(bottleAtPos5);
                  active[2]=1;
                  ends[2]=1;
                  tdone[2]=1;
                  break;
                
                case 1 : 
                  S73=1;
                  System.out.println("ew");//sysj\plant.sysj line: 32, column: 4
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
            if(enable.getprestatus()){//sysj\plant.sysj line: 34, column: 10
              System.out.println("ewewwhfsdhvfyujg");//sysj\plant.sysj line: 35, column: 4
              S83=4;
              System.out.println("sustaining bottle at pos 1");//sysj\plant.sysj line: 41, column: 6
              bottleAtPos1.setPresent();//sysj\plant.sysj line: 42, column: 6
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
          
          case 4 : 
            if(!enable.getprestatus()){//sysj\plant.sysj line: 39, column: 10
              System.out.println("im outtt");//sysj\plant.sysj line: 47, column: 4
              S83=5;
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            else {
              if(motConveyorOnOff.getprestatus()){//sysj\plant.sysj line: 40, column: 11
                System.out.println("im outtt");//sysj\plant.sysj line: 47, column: 4
                S83=5;
                active[2]=1;
                ends[2]=1;
                tdone[2]=1;
              }
              else {
                bottleAtPos1.setPresent();//sysj\plant.sysj line: 42, column: 6
                currsigs.addElement(bottleAtPos1);
                active[2]=1;
                ends[2]=1;
                tdone[2]=1;
              }
            }
            break;
          
          case 5 : 
            S83=5;
            S83=6;
            active[2]=1;
            ends[2]=1;
            tdone[2]=1;
            break;
          
          case 6 : 
            if(!enable.getprestatus()){//sysj\plant.sysj line: 49, column: 10
              S83=0;
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

  public void thread369(int [] tdone, int [] ends){
        S211=1;
    if(bottleAtPos5.getprestatus()){//sysj\plant.sysj line: 139, column: 25
      bottleAtPos5E.setPresent();//sysj\plant.sysj line: 139, column: 39
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

  public void thread368(int [] tdone, int [] ends){
        S203=1;
    if(bottleAtPos1.getprestatus()){//sysj\plant.sysj line: 137, column: 24
      bottleAtPos1E.setPresent();//sysj\plant.sysj line: 137, column: 38
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

  public void thread367(int [] tdone, int [] ends){
        S195=1;
    S189=0;
    if(motConveyorOnOff.getprestatus()){//sysj\plant.sysj line: 135, column: 25
      motConveyorOnOffE.setPresent();//sysj\plant.sysj line: 135, column: 43
      currsigs.addElement(motConveyorOnOffE);
      S189=1;
      active[4]=1;
      ends[4]=1;
      tdone[4]=1;
    }
    else {
      S189=1;
      active[4]=1;
      ends[4]=1;
      tdone[4]=1;
    }
  }

  public void thread366(int [] tdone, int [] ends){
        S213=1;
    thread367(tdone,ends);
    thread368(tdone,ends);
    thread369(tdone,ends);
    int biggest370 = 0;
    if(ends[4]>=biggest370){
      biggest370=ends[4];
    }
    if(ends[5]>=biggest370){
      biggest370=ends[5];
    }
    if(ends[6]>=biggest370){
      biggest370=ends[6];
    }
    if(biggest370 == 1){
      active[3]=1;
      ends[3]=1;
      tdone[3]=1;
    }
  }

  public void thread365(int [] tdone, int [] ends){
        S187=1;
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
      switch(S363){
        case 0 : 
          S363=0;
          break RUN;
        
        case 1 : 
          S363=2;
          S363=2;
          new Thread(new GUI()).start();//sysj\plant.sysj line: 18, column: 2
          thread365(tdone,ends);
          thread366(tdone,ends);
          int biggest371 = 0;
          if(ends[2]>=biggest371){
            biggest371=ends[2];
          }
          if(ends[3]>=biggest371){
            biggest371=ends[3];
          }
          if(biggest371 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
        
        case 2 : 
          thread372(tdone,ends);
          thread373(tdone,ends);
          int biggest378 = 0;
          if(ends[2]>=biggest378){
            biggest378=ends[2];
          }
          if(ends[3]>=biggest378){
            biggest378=ends[3];
          }
          if(biggest378 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
          //FINXME code
          if(biggest378 == 0){
            S363=0;
            active[1]=0;
            ends[1]=0;
            S363=0;
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
