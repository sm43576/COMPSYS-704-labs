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
  private int S369 = 1;
  private int S187 = 1;
  private int S83 = 1;
  private int S216 = 1;
  private int S195 = 1;
  private int S189 = 1;
  private int S203 = 1;
  private int S214 = 1;
  
  private int[] ends = new int[7];
  private int[] tdone = new int[7];
  
  public void thread382(int [] tdone, int [] ends){
        switch(S214){
      case 0 : 
        active[6]=0;
        ends[6]=0;
        tdone[6]=1;
        break;
      
      case 1 : 
        if(motConveyorOnOff.getprestatus()){//sysj\plant.sysj line: 139, column: 12
          System.out.println("emitting motor on E");//sysj\plant.sysj line: 140, column: 5
          motConveyorOnOffE.setPresent();//sysj\plant.sysj line: 141, column: 5
          currsigs.addElement(motConveyorOnOffE);
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

  public void thread381(int [] tdone, int [] ends){
        switch(S203){
      case 0 : 
        active[5]=0;
        ends[5]=0;
        tdone[5]=1;
        break;
      
      case 1 : 
        if(bottleAtPos5.getprestatus()){//sysj\plant.sysj line: 136, column: 25
          bottleAtPos5E.setPresent();//sysj\plant.sysj line: 136, column: 39
          currsigs.addElement(bottleAtPos5E);
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

  public void thread380(int [] tdone, int [] ends){
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
            if(bottleAtPos1.getprestatus()){//sysj\plant.sysj line: 134, column: 24
              bottleAtPos1E.setPresent();//sysj\plant.sysj line: 134, column: 38
              currsigs.addElement(bottleAtPos1E);
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
            if(bottleAtPos1.getprestatus()){//sysj\plant.sysj line: 134, column: 24
              bottleAtPos1E.setPresent();//sysj\plant.sysj line: 134, column: 38
              currsigs.addElement(bottleAtPos1E);
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

  public void thread379(int [] tdone, int [] ends){
        switch(S216){
      case 0 : 
        active[3]=0;
        ends[3]=0;
        tdone[3]=1;
        break;
      
      case 1 : 
        thread380(tdone,ends);
        thread381(tdone,ends);
        thread382(tdone,ends);
        int biggest383 = 0;
        if(ends[4]>=biggest383){
          biggest383=ends[4];
        }
        if(ends[5]>=biggest383){
          biggest383=ends[5];
        }
        if(ends[6]>=biggest383){
          biggest383=ends[6];
        }
        if(biggest383 == 1){
          active[3]=1;
          ends[3]=1;
          tdone[3]=1;
        }
        //FINXME code
        if(biggest383 == 0){
          S216=0;
          active[3]=0;
          ends[3]=0;
          tdone[3]=1;
        }
        break;
      
    }
  }

  public void thread378(int [] tdone, int [] ends){
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
              System.out.println("sustaining bottle at pos 5");//sysj\plant.sysj line: 27, column: 5
              bottleAtPos5.setPresent();//sysj\plant.sysj line: 28, column: 5
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
              System.out.println("ew");//sysj\plant.sysj line: 30, column: 4
              S83=2;
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            else {
              bottleAtPos5.setPresent();//sysj\plant.sysj line: 28, column: 5
              currsigs.addElement(bottleAtPos5);
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
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
            if(enable.getprestatus()){//sysj\plant.sysj line: 32, column: 10
              System.out.println("ewewwhfsdhvfyujg");//sysj\plant.sysj line: 33, column: 4
              System.out.println("copium");//sysj\plant.sysj line: 36, column: 4
              S83=4;
              System.out.println("sustaining bottle at pos 1");//sysj\plant.sysj line: 40, column: 6
              bottleAtPos1.setPresent();//sysj\plant.sysj line: 41, column: 6
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
            if(!enable.getprestatus()){//sysj\plant.sysj line: 38, column: 10
              System.out.println("im outtt");//sysj\plant.sysj line: 46, column: 4
              S83=5;
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            else {
              if(motConveyorOnOff.getprestatus()){//sysj\plant.sysj line: 39, column: 11
                System.out.println("im outtt");//sysj\plant.sysj line: 46, column: 4
                S83=5;
                active[2]=1;
                ends[2]=1;
                tdone[2]=1;
              }
              else {
                bottleAtPos1.setPresent();//sysj\plant.sysj line: 41, column: 6
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
            if(!enable.getprestatus()){//sysj\plant.sysj line: 48, column: 10
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

  public void thread375(int [] tdone, int [] ends){
        S214=1;
    if(motConveyorOnOff.getprestatus()){//sysj\plant.sysj line: 139, column: 12
      System.out.println("emitting motor on E");//sysj\plant.sysj line: 140, column: 5
      motConveyorOnOffE.setPresent();//sysj\plant.sysj line: 141, column: 5
      currsigs.addElement(motConveyorOnOffE);
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

  public void thread374(int [] tdone, int [] ends){
        S203=1;
    if(bottleAtPos5.getprestatus()){//sysj\plant.sysj line: 136, column: 25
      bottleAtPos5E.setPresent();//sysj\plant.sysj line: 136, column: 39
      currsigs.addElement(bottleAtPos5E);
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

  public void thread373(int [] tdone, int [] ends){
        S195=1;
    S189=0;
    if(bottleAtPos1.getprestatus()){//sysj\plant.sysj line: 134, column: 24
      bottleAtPos1E.setPresent();//sysj\plant.sysj line: 134, column: 38
      currsigs.addElement(bottleAtPos1E);
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

  public void thread372(int [] tdone, int [] ends){
        S216=1;
    thread373(tdone,ends);
    thread374(tdone,ends);
    thread375(tdone,ends);
    int biggest376 = 0;
    if(ends[4]>=biggest376){
      biggest376=ends[4];
    }
    if(ends[5]>=biggest376){
      biggest376=ends[5];
    }
    if(ends[6]>=biggest376){
      biggest376=ends[6];
    }
    if(biggest376 == 1){
      active[3]=1;
      ends[3]=1;
      tdone[3]=1;
    }
  }

  public void thread371(int [] tdone, int [] ends){
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
      switch(S369){
        case 0 : 
          S369=0;
          break RUN;
        
        case 1 : 
          S369=2;
          S369=2;
          new Thread(new GUI()).start();//sysj\plant.sysj line: 18, column: 2
          thread371(tdone,ends);
          thread372(tdone,ends);
          int biggest377 = 0;
          if(ends[2]>=biggest377){
            biggest377=ends[2];
          }
          if(ends[3]>=biggest377){
            biggest377=ends[3];
          }
          if(biggest377 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
        
        case 2 : 
          thread378(tdone,ends);
          thread379(tdone,ends);
          int biggest384 = 0;
          if(ends[2]>=biggest384){
            biggest384=ends[2];
          }
          if(ends[3]>=biggest384){
            biggest384=ends[3];
          }
          if(biggest384 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
          //FINXME code
          if(biggest384 == 0){
            S369=0;
            active[1]=0;
            ends[1]=0;
            S369=0;
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
