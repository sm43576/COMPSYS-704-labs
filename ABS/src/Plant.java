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
  public Signal enable = new Signal("enable", Signal.INPUT);
  public Signal refill = new Signal("refill", Signal.INPUT);
  public Signal removeBottle = new Signal("removeBottle", Signal.INPUT);
  public Signal motConveyorOnOff = new Signal("motConveyorOnOff", Signal.INPUT);
  public Signal motorPos1On = new Signal("motorPos1On", Signal.INPUT);
  public Signal motorPos5On = new Signal("motorPos5On", Signal.INPUT);
  public Signal valveInjectorOnOff = new Signal("valveInjectorOnOff", Signal.INPUT);
  public Signal valveInletOnOff = new Signal("valveInletOnOff", Signal.INPUT);
  public Signal dosUnitValveRetract = new Signal("dosUnitValveRetract", Signal.INPUT);
  public Signal dosUnitValveExtend = new Signal("dosUnitValveExtend", Signal.INPUT);
  public Signal selectCanister = new Signal("selectCanister", Signal.INPUT);
  public Signal receivedPercentage = new Signal("receivedPercentage", Signal.INPUT);
  public Signal pusherExtend = new Signal("pusherExtend", Signal.INPUT);
  public Signal vacOn = new Signal("vacOn", Signal.INPUT);
  public Signal armSource = new Signal("armSource", Signal.INPUT);
  public Signal armDest = new Signal("armDest", Signal.INPUT);
  public Signal cylPos5ZAxisExtend = new Signal("cylPos5ZAxisExtend", Signal.INPUT);
  public Signal gripperTurnRetract = new Signal("gripperTurnRetract", Signal.INPUT);
  public Signal gripperTurnExtend = new Signal("gripperTurnExtend", Signal.INPUT);
  public Signal capGripperPos5Extend = new Signal("capGripperPos5Extend", Signal.INPUT);
  public Signal cylClampBottleExtend = new Signal("cylClampBottleExtend", Signal.INPUT);
  public Signal rotaryTableTrigger = new Signal("rotaryTableTrigger", Signal.INPUT);
  public Signal bottleAtPos1 = new Signal("bottleAtPos1", Signal.OUTPUT);
  public Signal bottleAtPos5 = new Signal("bottleAtPos5", Signal.OUTPUT);
  public Signal RTbottleAtPos1 = new Signal("RTbottleAtPos1", Signal.OUTPUT);
  public Signal bottleLeftPos5 = new Signal("bottleLeftPos5", Signal.OUTPUT);
  public Signal bottleAtPos1E = new Signal("bottleAtPos1E", Signal.OUTPUT);
  public Signal bottleAtPos5E = new Signal("bottleAtPos5E", Signal.OUTPUT);
  public Signal motConveyorOnOffE = new Signal("motConveyorOnOffE", Signal.OUTPUT);
  public Signal dosUnitEvac = new Signal("dosUnitEvac", Signal.OUTPUT);
  public Signal selectedCanister = new Signal("selectedCanister", Signal.OUTPUT);
  public Signal dosUnitFilled = new Signal("dosUnitFilled", Signal.OUTPUT);
  public Signal pusherRetracted = new Signal("pusherRetracted", Signal.OUTPUT);
  public Signal pusherExtended = new Signal("pusherExtended", Signal.OUTPUT);
  public Signal WPgripped = new Signal("WPgripped", Signal.OUTPUT);
  public Signal armAtSource = new Signal("armAtSource", Signal.OUTPUT);
  public Signal armAtDest = new Signal("armAtDest", Signal.OUTPUT);
  public Signal empty = new Signal("empty", Signal.OUTPUT);
  public Signal pusherRetractedE = new Signal("pusherRetractedE", Signal.OUTPUT);
  public Signal pusherExtendedE = new Signal("pusherExtendedE", Signal.OUTPUT);
  public Signal WPgrippedE = new Signal("WPgrippedE", Signal.OUTPUT);
  public Signal armAtSourceE = new Signal("armAtSourceE", Signal.OUTPUT);
  public Signal armAtDestE = new Signal("armAtDestE", Signal.OUTPUT);
  public Signal emptyE = new Signal("emptyE", Signal.OUTPUT);
  public Signal bottleAtPos4 = new Signal("bottleAtPos4", Signal.OUTPUT);
  public Signal gripperZAxisLowered = new Signal("gripperZAxisLowered", Signal.OUTPUT);
  public Signal gripperZAxisLifted = new Signal("gripperZAxisLifted", Signal.OUTPUT);
  public Signal gripperTurnHomePos = new Signal("gripperTurnHomePos", Signal.OUTPUT);
  public Signal gripperTurnFinalPos = new Signal("gripperTurnFinalPos", Signal.OUTPUT);
  public Signal gripperGrippedCap = new Signal("gripperGrippedCap", Signal.OUTPUT);
  public Signal cylClampedBottle = new Signal("cylClampedBottle", Signal.OUTPUT);
  public Signal tableAlignedWithSensor = new Signal("tableAlignedWithSensor", Signal.OUTPUT);
  public Signal capOnBottleAtPos1 = new Signal("capOnBottleAtPos1", Signal.OUTPUT);
  public Signal bottleAtPos2 = new Signal("bottleAtPos2", Signal.OUTPUT);
  public Signal bottleAtPos3 = new Signal("bottleAtPos3", Signal.OUTPUT);
  public Signal moveToPos5 = new Signal("moveToPos5", Signal.OUTPUT);
  public Signal moveToPos4 = new Signal("moveToPos4", Signal.OUTPUT);
  public Signal moveToPos3 = new Signal("moveToPos3", Signal.OUTPUT);
  public Signal moveToPos2 = new Signal("moveToPos2", Signal.OUTPUT);
  private Signal capDec_1;
  private Signal capPos_1;
  private Signal disablePos5_1;
  private int capcount_thread_14;//sysj\plant.sysj line: 224, column: 3
  private int canister_thread_7;//sysj\plant.sysj line: 122, column: 5
  private int S127962 = 1;
  private int S124601 = 1;
  private int S124555 = 1;
  private int S124543 = 1;
  private int S124553 = 1;
  private int S124609 = 1;
  private int S124603 = 1;
  private int S124665 = 1;
  private int S124612 = 1;
  private int S124619 = 1;
  private int S124614 = 1;
  private int S124627 = 1;
  private int S124624 = 1;
  private int S124706 = 1;
  private int S124678 = 1;
  private int S124747 = 1;
  private int S124719 = 1;
  private int S124791 = 1;
  private int S124761 = 1;
  private int S124859 = 1;
  private int S124813 = 1;
  private int S124795 = 1;
  private int S124921 = 1;
  private int S124953 = 1;
  private int S124931 = 1;
  private int S124994 = 1;
  private int S124966 = 1;
  private int S125026 = 1;
  private int S125004 = 1;
  private int S125091 = 1;
  private int S125047 = 1;
  private int S125123 = 1;
  private int S125101 = 1;
  private int S125242 = 1;
  private int S125162 = 1;
  private int S125274 = 1;
  private int S125252 = 1;
  private int S125303 = 1;
  private int S125283 = 1;
  private int S125332 = 1;
  private int S125312 = 1;
  private int S125361 = 1;
  private int S125341 = 1;
  private int S125387 = 1;
  private int S125369 = 1;
  private int S125377 = 1;
  private int S125385 = 1;
  
  private int[] ends = new int[29];
  private int[] tdone = new int[29];
  
  public void thread128030(int [] tdone, int [] ends){
        switch(S125385){
      case 0 : 
        active[28]=0;
        ends[28]=0;
        tdone[28]=1;
        break;
      
      case 1 : 
        if(bottleAtPos5.getprestatus()){//sysj\plant.sysj line: 376, column: 25
          bottleAtPos5E.setPresent();//sysj\plant.sysj line: 376, column: 39
          currsigs.addElement(bottleAtPos5E);
          active[28]=1;
          ends[28]=1;
          tdone[28]=1;
        }
        else {
          active[28]=1;
          ends[28]=1;
          tdone[28]=1;
        }
        break;
      
    }
  }

  public void thread128029(int [] tdone, int [] ends){
        switch(S125377){
      case 0 : 
        active[27]=0;
        ends[27]=0;
        tdone[27]=1;
        break;
      
      case 1 : 
        if(bottleAtPos1.getprestatus()){//sysj\plant.sysj line: 374, column: 24
          bottleAtPos1E.setPresent();//sysj\plant.sysj line: 374, column: 38
          currsigs.addElement(bottleAtPos1E);
          active[27]=1;
          ends[27]=1;
          tdone[27]=1;
        }
        else {
          active[27]=1;
          ends[27]=1;
          tdone[27]=1;
        }
        break;
      
    }
  }

  public void thread128028(int [] tdone, int [] ends){
        switch(S125369){
      case 0 : 
        active[26]=0;
        ends[26]=0;
        tdone[26]=1;
        break;
      
      case 1 : 
        if(motConveyorOnOff.getprestatus()){//sysj\plant.sysj line: 372, column: 25
          motConveyorOnOffE.setPresent();//sysj\plant.sysj line: 372, column: 43
          currsigs.addElement(motConveyorOnOffE);
          active[26]=1;
          ends[26]=1;
          tdone[26]=1;
        }
        else {
          active[26]=1;
          ends[26]=1;
          tdone[26]=1;
        }
        break;
      
    }
  }

  public void thread128027(int [] tdone, int [] ends){
        switch(S125387){
      case 0 : 
        active[25]=0;
        ends[25]=0;
        tdone[25]=1;
        break;
      
      case 1 : 
        thread128028(tdone,ends);
        thread128029(tdone,ends);
        thread128030(tdone,ends);
        int biggest128031 = 0;
        if(ends[26]>=biggest128031){
          biggest128031=ends[26];
        }
        if(ends[27]>=biggest128031){
          biggest128031=ends[27];
        }
        if(ends[28]>=biggest128031){
          biggest128031=ends[28];
        }
        if(biggest128031 == 1){
          active[25]=1;
          ends[25]=1;
          tdone[25]=1;
        }
        //FINXME code
        if(biggest128031 == 0){
          S125387=0;
          active[25]=0;
          ends[25]=0;
          tdone[25]=1;
        }
        break;
      
    }
  }

  public void thread128026(int [] tdone, int [] ends){
        switch(S125361){
      case 0 : 
        active[24]=0;
        ends[24]=0;
        tdone[24]=1;
        break;
      
      case 1 : 
        switch(S125341){
          case 0 : 
            bottleAtPos2.setPresent();//sysj\plant.sysj line: 364, column: 82
            currsigs.addElement(bottleAtPos2);
            active[24]=1;
            ends[24]=1;
            tdone[24]=1;
            break;
          
          case 1 : 
            S125341=1;
            S125341=0;
            if(moveToPos2.getprestatus()){//sysj\plant.sysj line: 364, column: 24
              System.out.println("bottle is now at pos 2");//sysj\plant.sysj line: 364, column: 36
              bottleAtPos2.setPresent();//sysj\plant.sysj line: 364, column: 82
              currsigs.addElement(bottleAtPos2);
              active[24]=1;
              ends[24]=1;
              tdone[24]=1;
            }
            else {
              S125341=1;
              active[24]=1;
              ends[24]=1;
              tdone[24]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread128025(int [] tdone, int [] ends){
        switch(S125332){
      case 0 : 
        active[23]=0;
        ends[23]=0;
        tdone[23]=1;
        break;
      
      case 1 : 
        switch(S125312){
          case 0 : 
            bottleAtPos3.setPresent();//sysj\plant.sysj line: 362, column: 82
            currsigs.addElement(bottleAtPos3);
            active[23]=1;
            ends[23]=1;
            tdone[23]=1;
            break;
          
          case 1 : 
            S125312=1;
            S125312=0;
            if(moveToPos3.getprestatus()){//sysj\plant.sysj line: 362, column: 24
              System.out.println("bottle is now at pos 3");//sysj\plant.sysj line: 362, column: 36
              bottleAtPos3.setPresent();//sysj\plant.sysj line: 362, column: 82
              currsigs.addElement(bottleAtPos3);
              active[23]=1;
              ends[23]=1;
              tdone[23]=1;
            }
            else {
              S125312=1;
              active[23]=1;
              ends[23]=1;
              tdone[23]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread128024(int [] tdone, int [] ends){
        switch(S125303){
      case 0 : 
        active[22]=0;
        ends[22]=0;
        tdone[22]=1;
        break;
      
      case 1 : 
        switch(S125283){
          case 0 : 
            bottleAtPos4.setPresent();//sysj\plant.sysj line: 360, column: 82
            currsigs.addElement(bottleAtPos4);
            active[22]=1;
            ends[22]=1;
            tdone[22]=1;
            break;
          
          case 1 : 
            S125283=1;
            S125283=0;
            if(moveToPos4.getprestatus()){//sysj\plant.sysj line: 360, column: 24
              System.out.println("bottle is now at pos 4");//sysj\plant.sysj line: 360, column: 36
              bottleAtPos4.setPresent();//sysj\plant.sysj line: 360, column: 82
              currsigs.addElement(bottleAtPos4);
              active[22]=1;
              ends[22]=1;
              tdone[22]=1;
            }
            else {
              S125283=1;
              active[22]=1;
              ends[22]=1;
              tdone[22]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread128023(int [] tdone, int [] ends){
        switch(S125274){
      case 0 : 
        active[21]=0;
        ends[21]=0;
        tdone[21]=1;
        break;
      
      case 1 : 
        switch(S125252){
          case 0 : 
            if(bottleLeftPos5.getprestatus()){//sysj\plant.sysj line: 350, column: 10
              S125252=1;
              active[21]=1;
              ends[21]=1;
              tdone[21]=1;
            }
            else {
              bottleAtPos5.setPresent();//sysj\plant.sysj line: 353, column: 6
              currsigs.addElement(bottleAtPos5);
              active[21]=1;
              ends[21]=1;
              tdone[21]=1;
            }
            break;
          
          case 1 : 
            S125252=1;
            S125252=0;
            if(moveToPos5.getprestatus()){//sysj\plant.sysj line: 351, column: 13
              System.out.println("bottle is now at pos 5");//sysj\plant.sysj line: 352, column: 6
              bottleAtPos5.setPresent();//sysj\plant.sysj line: 353, column: 6
              currsigs.addElement(bottleAtPos5);
              active[21]=1;
              ends[21]=1;
              tdone[21]=1;
            }
            else {
              S125252=1;
              active[21]=1;
              ends[21]=1;
              tdone[21]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread128022(int [] tdone, int [] ends){
        switch(S125242){
      case 0 : 
        active[20]=0;
        ends[20]=0;
        tdone[20]=1;
        break;
      
      case 1 : 
        switch(S125162){
          case 0 : 
            S125162=1;
            active[20]=1;
            ends[20]=1;
            tdone[20]=1;
            break;
          
          case 1 : 
            S125162=1;
            S125162=0;
            if(rotaryTableTrigger.getprestatus()){//sysj\plant.sysj line: 308, column: 12
              if(bottleAtPos4.getprestatus()){//sysj\plant.sysj line: 314, column: 13
                System.out.println("moving bottle at pos 4 to pos 5");//sysj\plant.sysj line: 315, column: 6
                moveToPos5.setPresent();//sysj\plant.sysj line: 316, column: 6
                currsigs.addElement(moveToPos5);
                if(bottleAtPos3.getprestatus()){//sysj\plant.sysj line: 320, column: 13
                  System.out.println("moving bottle at pos 3 to pos 4");//sysj\plant.sysj line: 321, column: 6
                  moveToPos4.setPresent();//sysj\plant.sysj line: 322, column: 6
                  currsigs.addElement(moveToPos4);
                  if(bottleAtPos2.getprestatus()){//sysj\plant.sysj line: 326, column: 13
                    System.out.println("moving bottle at pos 2 to pos 3");//sysj\plant.sysj line: 327, column: 6
                    moveToPos3.setPresent();//sysj\plant.sysj line: 328, column: 6
                    currsigs.addElement(moveToPos3);
                    if(bottleAtPos1.getprestatus()){//sysj\plant.sysj line: 331, column: 13
                      System.out.println("moving bottle at pos 1 to pos 2");//sysj\plant.sysj line: 332, column: 6
                      moveToPos2.setPresent();//sysj\plant.sysj line: 333, column: 6
                      currsigs.addElement(moveToPos2);
                      System.out.println("Table has been aligned");//sysj\plant.sysj line: 337, column: 5
                      tableAlignedWithSensor.setPresent();//sysj\plant.sysj line: 338, column: 5
                      currsigs.addElement(tableAlignedWithSensor);
                      active[20]=1;
                      ends[20]=1;
                      tdone[20]=1;
                    }
                    else {
                      System.out.println("Table has been aligned");//sysj\plant.sysj line: 337, column: 5
                      tableAlignedWithSensor.setPresent();//sysj\plant.sysj line: 338, column: 5
                      currsigs.addElement(tableAlignedWithSensor);
                      active[20]=1;
                      ends[20]=1;
                      tdone[20]=1;
                    }
                  }
                  else {
                    if(bottleAtPos1.getprestatus()){//sysj\plant.sysj line: 331, column: 13
                      System.out.println("moving bottle at pos 1 to pos 2");//sysj\plant.sysj line: 332, column: 6
                      moveToPos2.setPresent();//sysj\plant.sysj line: 333, column: 6
                      currsigs.addElement(moveToPos2);
                      System.out.println("Table has been aligned");//sysj\plant.sysj line: 337, column: 5
                      tableAlignedWithSensor.setPresent();//sysj\plant.sysj line: 338, column: 5
                      currsigs.addElement(tableAlignedWithSensor);
                      active[20]=1;
                      ends[20]=1;
                      tdone[20]=1;
                    }
                    else {
                      System.out.println("Table has been aligned");//sysj\plant.sysj line: 337, column: 5
                      tableAlignedWithSensor.setPresent();//sysj\plant.sysj line: 338, column: 5
                      currsigs.addElement(tableAlignedWithSensor);
                      active[20]=1;
                      ends[20]=1;
                      tdone[20]=1;
                    }
                  }
                }
                else {
                  if(bottleAtPos2.getprestatus()){//sysj\plant.sysj line: 326, column: 13
                    System.out.println("moving bottle at pos 2 to pos 3");//sysj\plant.sysj line: 327, column: 6
                    moveToPos3.setPresent();//sysj\plant.sysj line: 328, column: 6
                    currsigs.addElement(moveToPos3);
                    if(bottleAtPos1.getprestatus()){//sysj\plant.sysj line: 331, column: 13
                      System.out.println("moving bottle at pos 1 to pos 2");//sysj\plant.sysj line: 332, column: 6
                      moveToPos2.setPresent();//sysj\plant.sysj line: 333, column: 6
                      currsigs.addElement(moveToPos2);
                      System.out.println("Table has been aligned");//sysj\plant.sysj line: 337, column: 5
                      tableAlignedWithSensor.setPresent();//sysj\plant.sysj line: 338, column: 5
                      currsigs.addElement(tableAlignedWithSensor);
                      active[20]=1;
                      ends[20]=1;
                      tdone[20]=1;
                    }
                    else {
                      System.out.println("Table has been aligned");//sysj\plant.sysj line: 337, column: 5
                      tableAlignedWithSensor.setPresent();//sysj\plant.sysj line: 338, column: 5
                      currsigs.addElement(tableAlignedWithSensor);
                      active[20]=1;
                      ends[20]=1;
                      tdone[20]=1;
                    }
                  }
                  else {
                    if(bottleAtPos1.getprestatus()){//sysj\plant.sysj line: 331, column: 13
                      System.out.println("moving bottle at pos 1 to pos 2");//sysj\plant.sysj line: 332, column: 6
                      moveToPos2.setPresent();//sysj\plant.sysj line: 333, column: 6
                      currsigs.addElement(moveToPos2);
                      System.out.println("Table has been aligned");//sysj\plant.sysj line: 337, column: 5
                      tableAlignedWithSensor.setPresent();//sysj\plant.sysj line: 338, column: 5
                      currsigs.addElement(tableAlignedWithSensor);
                      active[20]=1;
                      ends[20]=1;
                      tdone[20]=1;
                    }
                    else {
                      System.out.println("Table has been aligned");//sysj\plant.sysj line: 337, column: 5
                      tableAlignedWithSensor.setPresent();//sysj\plant.sysj line: 338, column: 5
                      currsigs.addElement(tableAlignedWithSensor);
                      active[20]=1;
                      ends[20]=1;
                      tdone[20]=1;
                    }
                  }
                }
              }
              else {
                if(bottleAtPos3.getprestatus()){//sysj\plant.sysj line: 320, column: 13
                  System.out.println("moving bottle at pos 3 to pos 4");//sysj\plant.sysj line: 321, column: 6
                  moveToPos4.setPresent();//sysj\plant.sysj line: 322, column: 6
                  currsigs.addElement(moveToPos4);
                  if(bottleAtPos2.getprestatus()){//sysj\plant.sysj line: 326, column: 13
                    System.out.println("moving bottle at pos 2 to pos 3");//sysj\plant.sysj line: 327, column: 6
                    moveToPos3.setPresent();//sysj\plant.sysj line: 328, column: 6
                    currsigs.addElement(moveToPos3);
                    if(bottleAtPos1.getprestatus()){//sysj\plant.sysj line: 331, column: 13
                      System.out.println("moving bottle at pos 1 to pos 2");//sysj\plant.sysj line: 332, column: 6
                      moveToPos2.setPresent();//sysj\plant.sysj line: 333, column: 6
                      currsigs.addElement(moveToPos2);
                      System.out.println("Table has been aligned");//sysj\plant.sysj line: 337, column: 5
                      tableAlignedWithSensor.setPresent();//sysj\plant.sysj line: 338, column: 5
                      currsigs.addElement(tableAlignedWithSensor);
                      active[20]=1;
                      ends[20]=1;
                      tdone[20]=1;
                    }
                    else {
                      System.out.println("Table has been aligned");//sysj\plant.sysj line: 337, column: 5
                      tableAlignedWithSensor.setPresent();//sysj\plant.sysj line: 338, column: 5
                      currsigs.addElement(tableAlignedWithSensor);
                      active[20]=1;
                      ends[20]=1;
                      tdone[20]=1;
                    }
                  }
                  else {
                    if(bottleAtPos1.getprestatus()){//sysj\plant.sysj line: 331, column: 13
                      System.out.println("moving bottle at pos 1 to pos 2");//sysj\plant.sysj line: 332, column: 6
                      moveToPos2.setPresent();//sysj\plant.sysj line: 333, column: 6
                      currsigs.addElement(moveToPos2);
                      System.out.println("Table has been aligned");//sysj\plant.sysj line: 337, column: 5
                      tableAlignedWithSensor.setPresent();//sysj\plant.sysj line: 338, column: 5
                      currsigs.addElement(tableAlignedWithSensor);
                      active[20]=1;
                      ends[20]=1;
                      tdone[20]=1;
                    }
                    else {
                      System.out.println("Table has been aligned");//sysj\plant.sysj line: 337, column: 5
                      tableAlignedWithSensor.setPresent();//sysj\plant.sysj line: 338, column: 5
                      currsigs.addElement(tableAlignedWithSensor);
                      active[20]=1;
                      ends[20]=1;
                      tdone[20]=1;
                    }
                  }
                }
                else {
                  if(bottleAtPos2.getprestatus()){//sysj\plant.sysj line: 326, column: 13
                    System.out.println("moving bottle at pos 2 to pos 3");//sysj\plant.sysj line: 327, column: 6
                    moveToPos3.setPresent();//sysj\plant.sysj line: 328, column: 6
                    currsigs.addElement(moveToPos3);
                    if(bottleAtPos1.getprestatus()){//sysj\plant.sysj line: 331, column: 13
                      System.out.println("moving bottle at pos 1 to pos 2");//sysj\plant.sysj line: 332, column: 6
                      moveToPos2.setPresent();//sysj\plant.sysj line: 333, column: 6
                      currsigs.addElement(moveToPos2);
                      System.out.println("Table has been aligned");//sysj\plant.sysj line: 337, column: 5
                      tableAlignedWithSensor.setPresent();//sysj\plant.sysj line: 338, column: 5
                      currsigs.addElement(tableAlignedWithSensor);
                      active[20]=1;
                      ends[20]=1;
                      tdone[20]=1;
                    }
                    else {
                      System.out.println("Table has been aligned");//sysj\plant.sysj line: 337, column: 5
                      tableAlignedWithSensor.setPresent();//sysj\plant.sysj line: 338, column: 5
                      currsigs.addElement(tableAlignedWithSensor);
                      active[20]=1;
                      ends[20]=1;
                      tdone[20]=1;
                    }
                  }
                  else {
                    if(bottleAtPos1.getprestatus()){//sysj\plant.sysj line: 331, column: 13
                      System.out.println("moving bottle at pos 1 to pos 2");//sysj\plant.sysj line: 332, column: 6
                      moveToPos2.setPresent();//sysj\plant.sysj line: 333, column: 6
                      currsigs.addElement(moveToPos2);
                      System.out.println("Table has been aligned");//sysj\plant.sysj line: 337, column: 5
                      tableAlignedWithSensor.setPresent();//sysj\plant.sysj line: 338, column: 5
                      currsigs.addElement(tableAlignedWithSensor);
                      active[20]=1;
                      ends[20]=1;
                      tdone[20]=1;
                    }
                    else {
                      System.out.println("Table has been aligned");//sysj\plant.sysj line: 337, column: 5
                      tableAlignedWithSensor.setPresent();//sysj\plant.sysj line: 338, column: 5
                      currsigs.addElement(tableAlignedWithSensor);
                      active[20]=1;
                      ends[20]=1;
                      tdone[20]=1;
                    }
                  }
                }
              }
            }
            else {
              S125162=1;
              active[20]=1;
              ends[20]=1;
              tdone[20]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread128021(int [] tdone, int [] ends){
        switch(S125123){
      case 0 : 
        active[19]=0;
        ends[19]=0;
        tdone[19]=1;
        break;
      
      case 1 : 
        switch(S125101){
          case 0 : 
            if(cylClampBottleExtend.getprestatus()){//sysj\plant.sysj line: 297, column: 11
              S125101=1;
              cylClampedBottle.setPresent();//sysj\plant.sysj line: 299, column: 6
              currsigs.addElement(cylClampedBottle);
              active[19]=1;
              ends[19]=1;
              tdone[19]=1;
            }
            else {
              active[19]=1;
              ends[19]=1;
              tdone[19]=1;
            }
            break;
          
          case 1 : 
            if(!cylClampBottleExtend.getprestatus()){//sysj\plant.sysj line: 298, column: 12
              S125101=2;
              active[19]=1;
              ends[19]=1;
              tdone[19]=1;
            }
            else {
              cylClampedBottle.setPresent();//sysj\plant.sysj line: 299, column: 6
              currsigs.addElement(cylClampedBottle);
              active[19]=1;
              ends[19]=1;
              tdone[19]=1;
            }
            break;
          
          case 2 : 
            S125101=2;
            S125101=0;
            active[19]=1;
            ends[19]=1;
            tdone[19]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread128020(int [] tdone, int [] ends){
        switch(S125091){
      case 0 : 
        active[18]=0;
        ends[18]=0;
        tdone[18]=1;
        break;
      
      case 1 : 
        switch(S125047){
          case 0 : 
            if(gripperTurnRetract.getprestatus()){//sysj\plant.sysj line: 281, column: 13
              S125047=1;
              if(gripperTurnRetract.getprestatus() && !gripperTurnExtend.getprestatus()){//sysj\plant.sysj line: 285, column: 13
                gripperTurnHomePos.setPresent();//sysj\plant.sysj line: 287, column: 7
                currsigs.addElement(gripperTurnHomePos);
                active[18]=1;
                ends[18]=1;
                tdone[18]=1;
              }
              else {
                S125047=2;
                active[18]=1;
                ends[18]=1;
                tdone[18]=1;
              }
            }
            else {
              gripperTurnFinalPos.setPresent();//sysj\plant.sysj line: 282, column: 7
              currsigs.addElement(gripperTurnFinalPos);
              active[18]=1;
              ends[18]=1;
              tdone[18]=1;
            }
            break;
          
          case 1 : 
            if(gripperTurnExtend.getprestatus()){//sysj\plant.sysj line: 286, column: 13
              S125047=2;
              active[18]=1;
              ends[18]=1;
              tdone[18]=1;
            }
            else {
              gripperTurnHomePos.setPresent();//sysj\plant.sysj line: 287, column: 7
              currsigs.addElement(gripperTurnHomePos);
              active[18]=1;
              ends[18]=1;
              tdone[18]=1;
            }
            break;
          
          case 2 : 
            S125047=2;
            S125047=0;
            if(gripperTurnExtend.getprestatus() && !gripperTurnRetract.getprestatus()){//sysj\plant.sysj line: 280, column: 13
              gripperTurnFinalPos.setPresent();//sysj\plant.sysj line: 282, column: 7
              currsigs.addElement(gripperTurnFinalPos);
              active[18]=1;
              ends[18]=1;
              tdone[18]=1;
            }
            else {
              S125047=1;
              if(gripperTurnRetract.getprestatus() && !gripperTurnExtend.getprestatus()){//sysj\plant.sysj line: 285, column: 13
                gripperTurnHomePos.setPresent();//sysj\plant.sysj line: 287, column: 7
                currsigs.addElement(gripperTurnHomePos);
                active[18]=1;
                ends[18]=1;
                tdone[18]=1;
              }
              else {
                S125047=2;
                active[18]=1;
                ends[18]=1;
                tdone[18]=1;
              }
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread128019(int [] tdone, int [] ends){
        switch(S125026){
      case 0 : 
        active[17]=0;
        ends[17]=0;
        tdone[17]=1;
        break;
      
      case 1 : 
        switch(S125004){
          case 0 : 
            if(capGripperPos5Extend.getprestatus()){//sysj\plant.sysj line: 269, column: 11
              S125004=1;
              gripperGrippedCap.setPresent();//sysj\plant.sysj line: 271, column: 6
              currsigs.addElement(gripperGrippedCap);
              active[17]=1;
              ends[17]=1;
              tdone[17]=1;
            }
            else {
              active[17]=1;
              ends[17]=1;
              tdone[17]=1;
            }
            break;
          
          case 1 : 
            if(!capGripperPos5Extend.getprestatus()){//sysj\plant.sysj line: 270, column: 12
              S125004=2;
              active[17]=1;
              ends[17]=1;
              tdone[17]=1;
            }
            else {
              gripperGrippedCap.setPresent();//sysj\plant.sysj line: 271, column: 6
              currsigs.addElement(gripperGrippedCap);
              active[17]=1;
              ends[17]=1;
              tdone[17]=1;
            }
            break;
          
          case 2 : 
            S125004=2;
            S125004=0;
            active[17]=1;
            ends[17]=1;
            tdone[17]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread128018(int [] tdone, int [] ends){
        switch(S124994){
      case 0 : 
        active[16]=0;
        ends[16]=0;
        tdone[16]=1;
        break;
      
      case 1 : 
        switch(S124966){
          case 0 : 
            if(cylPos5ZAxisExtend.getprestatus()){//sysj\plant.sysj line: 256, column: 11
              S124966=1;
              gripperZAxisLowered.setPresent();//sysj\plant.sysj line: 260, column: 6
              currsigs.addElement(gripperZAxisLowered);
              active[16]=1;
              ends[16]=1;
              tdone[16]=1;
            }
            else {
              gripperZAxisLifted.setPresent();//sysj\plant.sysj line: 257, column: 6
              currsigs.addElement(gripperZAxisLifted);
              active[16]=1;
              ends[16]=1;
              tdone[16]=1;
            }
            break;
          
          case 1 : 
            if(!cylPos5ZAxisExtend.getprestatus()){//sysj\plant.sysj line: 259, column: 12
              S124966=2;
              active[16]=1;
              ends[16]=1;
              tdone[16]=1;
            }
            else {
              gripperZAxisLowered.setPresent();//sysj\plant.sysj line: 260, column: 6
              currsigs.addElement(gripperZAxisLowered);
              active[16]=1;
              ends[16]=1;
              tdone[16]=1;
            }
            break;
          
          case 2 : 
            S124966=2;
            S124966=0;
            gripperZAxisLifted.setPresent();//sysj\plant.sysj line: 257, column: 6
            currsigs.addElement(gripperZAxisLifted);
            active[16]=1;
            ends[16]=1;
            tdone[16]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread128017(int [] tdone, int [] ends){
        switch(S124953){
      case 0 : 
        active[15]=0;
        ends[15]=0;
        tdone[15]=1;
        break;
      
      case 1 : 
        switch(S124931){
          case 0 : 
            if(moveToPos4.getprestatus()){//sysj\plant.sysj line: 245, column: 11
              S124931=1;
              bottleAtPos4.setPresent();//sysj\plant.sysj line: 247, column: 6
              currsigs.addElement(bottleAtPos4);
              active[15]=1;
              ends[15]=1;
              tdone[15]=1;
            }
            else {
              active[15]=1;
              ends[15]=1;
              tdone[15]=1;
            }
            break;
          
          case 1 : 
            if(moveToPos5.getprestatus()){//sysj\plant.sysj line: 246, column: 12
              S124931=2;
              active[15]=1;
              ends[15]=1;
              tdone[15]=1;
            }
            else {
              bottleAtPos4.setPresent();//sysj\plant.sysj line: 247, column: 6
              currsigs.addElement(bottleAtPos4);
              active[15]=1;
              ends[15]=1;
              tdone[15]=1;
            }
            break;
          
          case 2 : 
            S124931=2;
            S124931=0;
            active[15]=1;
            ends[15]=1;
            tdone[15]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread128016(int [] tdone, int [] ends){
        switch(S124921){
      case 0 : 
        active[14]=0;
        ends[14]=0;
        tdone[14]=1;
        break;
      
      case 1 : 
        if(capDec_1.getprestatus()){//sysj\plant.sysj line: 226, column: 12
          if(capcount_thread_14 > 0) {//sysj\plant.sysj line: 227, column: 5
            capcount_thread_14 = capcount_thread_14 - 1;//sysj\plant.sysj line: 228, column: 6
          }
          if(refill.getprestatus()){//sysj\plant.sysj line: 230, column: 12
            capcount_thread_14 = 5;//sysj\plant.sysj line: 231, column: 5
            if(capcount_thread_14 == 0){//sysj\plant.sysj line: 234, column: 8
              empty.setPresent();//sysj\plant.sysj line: 235, column: 6
              currsigs.addElement(empty);
              active[14]=1;
              ends[14]=1;
              tdone[14]=1;
            }
            else {
              active[14]=1;
              ends[14]=1;
              tdone[14]=1;
            }
          }
          else {
            if(capcount_thread_14 == 0){//sysj\plant.sysj line: 234, column: 8
              empty.setPresent();//sysj\plant.sysj line: 235, column: 6
              currsigs.addElement(empty);
              active[14]=1;
              ends[14]=1;
              tdone[14]=1;
            }
            else {
              active[14]=1;
              ends[14]=1;
              tdone[14]=1;
            }
          }
        }
        else {
          if(refill.getprestatus()){//sysj\plant.sysj line: 230, column: 12
            capcount_thread_14 = 5;//sysj\plant.sysj line: 231, column: 5
            if(capcount_thread_14 == 0){//sysj\plant.sysj line: 234, column: 8
              empty.setPresent();//sysj\plant.sysj line: 235, column: 6
              currsigs.addElement(empty);
              active[14]=1;
              ends[14]=1;
              tdone[14]=1;
            }
            else {
              active[14]=1;
              ends[14]=1;
              tdone[14]=1;
            }
          }
          else {
            if(capcount_thread_14 == 0){//sysj\plant.sysj line: 234, column: 8
              empty.setPresent();//sysj\plant.sysj line: 235, column: 6
              currsigs.addElement(empty);
              active[14]=1;
              ends[14]=1;
              tdone[14]=1;
            }
            else {
              active[14]=1;
              ends[14]=1;
              tdone[14]=1;
            }
          }
        }
        break;
      
    }
  }

  public void thread128015(int [] tdone, int [] ends){
        switch(S124859){
      case 0 : 
        active[13]=0;
        ends[13]=0;
        tdone[13]=1;
        break;
      
      case 1 : 
        switch(S124813){
          case 0 : 
            if(empty.getprestatus()){//sysj\plant.sysj line: 209, column: 10
              S124813=1;
              active[13]=1;
              ends[13]=1;
              tdone[13]=1;
            }
            else {
              switch(S124795){
                case 0 : 
                  if(pusherRetracted.getprestatus()){//sysj\plant.sysj line: 211, column: 13
                    S124795=1;
                    active[13]=1;
                    ends[13]=1;
                    tdone[13]=1;
                  }
                  else {
                    active[13]=1;
                    ends[13]=1;
                    tdone[13]=1;
                  }
                  break;
                
                case 1 : 
                  if(pusherExtended.getprestatus()){//sysj\plant.sysj line: 212, column: 13
                    capPos_1.setPresent();//sysj\plant.sysj line: 214, column: 7
                    currsigs.addElement(capPos_1);
                    capPos_1.setValue(1);//sysj\plant.sysj line: 214, column: 7
                    S124795=2;
                    active[13]=1;
                    ends[13]=1;
                    tdone[13]=1;
                  }
                  else {
                    active[13]=1;
                    ends[13]=1;
                    tdone[13]=1;
                  }
                  break;
                
                case 2 : 
                  if(pusherRetracted.getprestatus()){//sysj\plant.sysj line: 215, column: 13
                    capDec_1.setPresent();//sysj\plant.sysj line: 216, column: 7
                    currsigs.addElement(capDec_1);
                    S124795=0;
                    active[13]=1;
                    ends[13]=1;
                    tdone[13]=1;
                  }
                  else {
                    active[13]=1;
                    ends[13]=1;
                    tdone[13]=1;
                  }
                  break;
                
              }
            }
            break;
          
          case 1 : 
            if(refill.getprestatus()){//sysj\plant.sysj line: 219, column: 10
              S124813=0;
              S124795=0;
              active[13]=1;
              ends[13]=1;
              tdone[13]=1;
            }
            else {
              active[13]=1;
              ends[13]=1;
              tdone[13]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread128014(int [] tdone, int [] ends){
        switch(S124791){
      case 0 : 
        active[12]=0;
        ends[12]=0;
        tdone[12]=1;
        break;
      
      case 1 : 
        switch(S124761){
          case 0 : 
            if(!vacOn.getprestatus()){//sysj\plant.sysj line: 189, column: 12
              if(armAtSource.getprestatus()){//sysj\plant.sysj line: 192, column: 14
                capPos_1.setPresent();//sysj\plant.sysj line: 193, column: 7
                currsigs.addElement(capPos_1);
                capPos_1.setValue(1);//sysj\plant.sysj line: 193, column: 7
                S124761=1;
                active[12]=1;
                ends[12]=1;
                tdone[12]=1;
              }
              else {
                S124761=1;
                active[12]=1;
                ends[12]=1;
                tdone[12]=1;
              }
            }
            else {
              WPgripped.setPresent();//sysj\plant.sysj line: 190, column: 7
              currsigs.addElement(WPgripped);
              active[12]=1;
              ends[12]=1;
              tdone[12]=1;
            }
            break;
          
          case 1 : 
            S124761=1;
            S124761=0;
            if(vacOn.getprestatus() && armAtSource.getprestatus()){//sysj\plant.sysj line: 186, column: 12
              if((Integer)(capPos_1.getpreval() == null ? 0 : ((Integer)capPos_1.getpreval()).intValue()) == 1){//sysj\plant.sysj line: 187, column: 8
                capPos_1.setPresent();//sysj\plant.sysj line: 188, column: 6
                currsigs.addElement(capPos_1);
                capPos_1.setValue(0);//sysj\plant.sysj line: 188, column: 6
                WPgripped.setPresent();//sysj\plant.sysj line: 190, column: 7
                currsigs.addElement(WPgripped);
                active[12]=1;
                ends[12]=1;
                tdone[12]=1;
              }
              else {
                S124761=1;
                active[12]=1;
                ends[12]=1;
                tdone[12]=1;
              }
            }
            else {
              S124761=1;
              active[12]=1;
              ends[12]=1;
              tdone[12]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread128013(int [] tdone, int [] ends){
        switch(S124747){
      case 0 : 
        active[11]=0;
        ends[11]=0;
        tdone[11]=1;
        break;
      
      case 1 : 
        switch(S124719){
          case 0 : 
            if(pusherExtend.getprestatus()){//sysj\plant.sysj line: 175, column: 10
              S124719=1;
              pusherExtended.setPresent();//sysj\plant.sysj line: 179, column: 5
              currsigs.addElement(pusherExtended);
              active[11]=1;
              ends[11]=1;
              tdone[11]=1;
            }
            else {
              pusherRetracted.setPresent();//sysj\plant.sysj line: 176, column: 5
              currsigs.addElement(pusherRetracted);
              active[11]=1;
              ends[11]=1;
              tdone[11]=1;
            }
            break;
          
          case 1 : 
            if(!pusherExtend.getprestatus()){//sysj\plant.sysj line: 178, column: 10
              S124719=0;
              pusherRetracted.setPresent();//sysj\plant.sysj line: 176, column: 5
              currsigs.addElement(pusherRetracted);
              active[11]=1;
              ends[11]=1;
              tdone[11]=1;
            }
            else {
              pusherExtended.setPresent();//sysj\plant.sysj line: 179, column: 5
              currsigs.addElement(pusherExtended);
              active[11]=1;
              ends[11]=1;
              tdone[11]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread128012(int [] tdone, int [] ends){
        switch(S124706){
      case 0 : 
        active[10]=0;
        ends[10]=0;
        tdone[10]=1;
        break;
      
      case 1 : 
        switch(S124678){
          case 0 : 
            if(armSource.getprestatus()){//sysj\plant.sysj line: 164, column: 10
              S124678=1;
              armAtSource.setPresent();//sysj\plant.sysj line: 168, column: 5
              currsigs.addElement(armAtSource);
              active[10]=1;
              ends[10]=1;
              tdone[10]=1;
            }
            else {
              armAtDest.setPresent();//sysj\plant.sysj line: 165, column: 5
              currsigs.addElement(armAtDest);
              active[10]=1;
              ends[10]=1;
              tdone[10]=1;
            }
            break;
          
          case 1 : 
            if(armDest.getprestatus()){//sysj\plant.sysj line: 167, column: 10
              S124678=0;
              armAtDest.setPresent();//sysj\plant.sysj line: 165, column: 5
              currsigs.addElement(armAtDest);
              active[10]=1;
              ends[10]=1;
              tdone[10]=1;
            }
            else {
              armAtSource.setPresent();//sysj\plant.sysj line: 168, column: 5
              currsigs.addElement(armAtSource);
              active[10]=1;
              ends[10]=1;
              tdone[10]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread128010(int [] tdone, int [] ends){
        S124627=1;
    S124624=0;
    dosUnitEvac.setPresent();//sysj\plant.sysj line: 143, column: 7
    currsigs.addElement(dosUnitEvac);
    active[9]=1;
    ends[9]=1;
    tdone[9]=1;
  }

  public void thread128009(int [] tdone, int [] ends){
        S124619=1;
    S124614=0;
    active[8]=1;
    ends[8]=1;
    tdone[8]=1;
  }

  public void thread128008(int [] tdone, int [] ends){
        S124612=1;
    active[7]=1;
    ends[7]=1;
    tdone[7]=1;
  }

  public void thread128006(int [] tdone, int [] ends){
        switch(S124627){
      case 0 : 
        active[9]=0;
        ends[9]=0;
        tdone[9]=1;
        break;
      
      case 1 : 
        switch(S124624){
          case 0 : 
            if(dosUnitValveRetract.getprestatus()){//sysj\plant.sysj line: 142, column: 12
              System.out.println("Canister at top");//sysj\plant.sysj line: 145, column: 6
              S124624=1;
              active[9]=1;
              ends[9]=1;
              tdone[9]=1;
            }
            else {
              dosUnitEvac.setPresent();//sysj\plant.sysj line: 143, column: 7
              currsigs.addElement(dosUnitEvac);
              active[9]=1;
              ends[9]=1;
              tdone[9]=1;
            }
            break;
          
          case 1 : 
            if(dosUnitValveExtend.getprestatus()){//sysj\plant.sysj line: 147, column: 12
              System.out.println("Canister at bottom");//sysj\plant.sysj line: 148, column: 6
              S124624=2;
              active[9]=1;
              ends[9]=1;
              tdone[9]=1;
            }
            else {
              active[9]=1;
              ends[9]=1;
              tdone[9]=1;
            }
            break;
          
          case 2 : 
            S124624=2;
            S124627=0;
            active[9]=0;
            ends[9]=0;
            tdone[9]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread128005(int [] tdone, int [] ends){
        switch(S124619){
      case 0 : 
        active[8]=0;
        ends[8]=0;
        tdone[8]=1;
        break;
      
      case 1 : 
        switch(S124614){
          case 0 : 
            if(receivedPercentage.getprestatus()){//sysj\plant.sysj line: 131, column: 11
              System.out.println("filled");//sysj\plant.sysj line: 132, column: 5
              S124614=1;
              if(valveInletOnOff.getprestatus()){//sysj\plant.sysj line: 133, column: 13
                dosUnitFilled.setPresent();//sysj\plant.sysj line: 134, column: 6
                currsigs.addElement(dosUnitFilled);
                dosUnitFilled.setValue(receivedPercentage);//sysj\plant.sysj line: 134, column: 6
                active[8]=1;
                ends[8]=1;
                tdone[8]=1;
              }
              else {
                S124619=0;
                active[8]=0;
                ends[8]=0;
                tdone[8]=1;
              }
            }
            else {
              active[8]=1;
              ends[8]=1;
              tdone[8]=1;
            }
            break;
          
          case 1 : 
            S124619=0;
            active[8]=0;
            ends[8]=0;
            tdone[8]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread128004(int [] tdone, int [] ends){
        switch(S124612){
      case 0 : 
        active[7]=0;
        ends[7]=0;
        tdone[7]=1;
        break;
      
      case 1 : 
        if(selectCanister.getprestatus()){//sysj\plant.sysj line: 121, column: 11
          canister_thread_7 = (selectCanister.getpreval() == null ? null : ((Integer)selectCanister.getpreval()));//sysj\plant.sysj line: 122, column: 5
          System.out.println("canister number received");//sysj\plant.sysj line: 123, column: 5
          selectedCanister.setPresent();//sysj\plant.sysj line: 124, column: 5
          currsigs.addElement(selectedCanister);
          selectedCanister.setValue(canister_thread_7);//sysj\plant.sysj line: 124, column: 5
          S124612=0;
          active[7]=0;
          ends[7]=0;
          tdone[7]=1;
        }
        else {
          active[7]=1;
          ends[7]=1;
          tdone[7]=1;
        }
        break;
      
    }
  }

  public void thread128003(int [] tdone, int [] ends){
        switch(S124665){
      case 0 : 
        active[6]=0;
        ends[6]=0;
        tdone[6]=1;
        break;
      
      case 1 : 
        thread128004(tdone,ends);
        thread128005(tdone,ends);
        thread128006(tdone,ends);
        int biggest128007 = 0;
        if(ends[7]>=biggest128007){
          biggest128007=ends[7];
        }
        if(ends[8]>=biggest128007){
          biggest128007=ends[8];
        }
        if(ends[9]>=biggest128007){
          biggest128007=ends[9];
        }
        if(biggest128007 == 1){
          active[6]=1;
          ends[6]=1;
          tdone[6]=1;
        }
        //FINXME code
        if(biggest128007 == 0){
          thread128008(tdone,ends);
          thread128009(tdone,ends);
          thread128010(tdone,ends);
          int biggest128011 = 0;
          if(ends[7]>=biggest128011){
            biggest128011=ends[7];
          }
          if(ends[8]>=biggest128011){
            biggest128011=ends[8];
          }
          if(ends[9]>=biggest128011){
            biggest128011=ends[9];
          }
          if(biggest128011 == 1){
            active[6]=1;
            ends[6]=1;
            tdone[6]=1;
          }
        }
        break;
      
    }
  }

  public void thread128002(int [] tdone, int [] ends){
        switch(S124609){
      case 0 : 
        active[5]=0;
        ends[5]=0;
        tdone[5]=1;
        break;
      
      case 1 : 
        switch(S124603){
          case 0 : 
            S124603=0;
            if(bottleAtPos1.getprestatus()){//sysj\plant.sysj line: 105, column: 12
              RTbottleAtPos1.setPresent();//sysj\plant.sysj line: 107, column: 5
              currsigs.addElement(RTbottleAtPos1);
              S124603=1;
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            else {
              S124603=1;
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            break;
          
          case 1 : 
            S124603=1;
            S124603=0;
            if(bottleAtPos1.getprestatus()){//sysj\plant.sysj line: 105, column: 12
              RTbottleAtPos1.setPresent();//sysj\plant.sysj line: 107, column: 5
              currsigs.addElement(RTbottleAtPos1);
              S124603=1;
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            else {
              S124603=1;
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread128000(int [] tdone, int [] ends){
        S124553=1;
    if(motorPos5On.getprestatus()){//sysj\plant.sysj line: 90, column: 14
      System.out.println("moving bottle to leave 5");//sysj\plant.sysj line: 91, column: 7
      bottleLeftPos5.setPresent();//sysj\plant.sysj line: 92, column: 7
      currsigs.addElement(bottleLeftPos5);
      active[4]=1;
      ends[4]=1;
      tdone[4]=1;
    }
    else {
      S124553=0;
      active[4]=0;
      ends[4]=0;
      tdone[4]=1;
    }
  }

  public void thread127999(int [] tdone, int [] ends){
        S124543=1;
    if(motorPos1On.getprestatus()){//sysj\plant.sysj line: 83, column: 14
      System.out.println("moving bottle to 1");//sysj\plant.sysj line: 84, column: 7
      bottleAtPos1.setPresent();//sysj\plant.sysj line: 85, column: 7
      currsigs.addElement(bottleAtPos1);
      active[3]=1;
      ends[3]=1;
      tdone[3]=1;
    }
    else {
      S124543=0;
      active[3]=0;
      ends[3]=0;
      tdone[3]=1;
    }
  }

  public void thread127997(int [] tdone, int [] ends){
        switch(S124553){
      case 0 : 
        active[4]=0;
        ends[4]=0;
        tdone[4]=1;
        break;
      
      case 1 : 
        bottleLeftPos5.setPresent();//sysj\plant.sysj line: 92, column: 7
        currsigs.addElement(bottleLeftPos5);
        active[4]=1;
        ends[4]=1;
        tdone[4]=1;
        break;
      
    }
  }

  public void thread127996(int [] tdone, int [] ends){
        switch(S124543){
      case 0 : 
        active[3]=0;
        ends[3]=0;
        tdone[3]=1;
        break;
      
      case 1 : 
        bottleAtPos1.setPresent();//sysj\plant.sysj line: 85, column: 7
        currsigs.addElement(bottleAtPos1);
        active[3]=1;
        ends[3]=1;
        tdone[3]=1;
        break;
      
    }
  }

  public void thread127995(int [] tdone, int [] ends){
        switch(S124601){
      case 0 : 
        active[2]=0;
        ends[2]=0;
        tdone[2]=1;
        break;
      
      case 1 : 
        switch(S124555){
          case 0 : 
            thread127996(tdone,ends);
            thread127997(tdone,ends);
            int biggest127998 = 0;
            if(ends[3]>=biggest127998){
              biggest127998=ends[3];
            }
            if(ends[4]>=biggest127998){
              biggest127998=ends[4];
            }
            if(biggest127998 == 1){
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            //FINXME code
            if(biggest127998 == 0){
              System.out.println("motor is off");//sysj\plant.sysj line: 96, column: 4
              S124555=1;
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            break;
          
          case 1 : 
            S124555=1;
            S124555=0;
            if(motConveyorOnOff.getprestatus()){//sysj\plant.sysj line: 81, column: 12
              thread127999(tdone,ends);
              thread128000(tdone,ends);
              int biggest128001 = 0;
              if(ends[3]>=biggest128001){
                biggest128001=ends[3];
              }
              if(ends[4]>=biggest128001){
                biggest128001=ends[4];
              }
              if(biggest128001 == 1){
                active[2]=1;
                ends[2]=1;
                tdone[2]=1;
              }
              //FINXME code
              if(biggest128001 == 0){
                System.out.println("motor is off");//sysj\plant.sysj line: 96, column: 4
                S124555=1;
                active[2]=1;
                ends[2]=1;
                tdone[2]=1;
              }
            }
            else {
              System.out.println("motor is off");//sysj\plant.sysj line: 96, column: 4
              S124555=1;
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread127992(int [] tdone, int [] ends){
        S125385=1;
    if(bottleAtPos5.getprestatus()){//sysj\plant.sysj line: 376, column: 25
      bottleAtPos5E.setPresent();//sysj\plant.sysj line: 376, column: 39
      currsigs.addElement(bottleAtPos5E);
      active[28]=1;
      ends[28]=1;
      tdone[28]=1;
    }
    else {
      active[28]=1;
      ends[28]=1;
      tdone[28]=1;
    }
  }

  public void thread127991(int [] tdone, int [] ends){
        S125377=1;
    if(bottleAtPos1.getprestatus()){//sysj\plant.sysj line: 374, column: 24
      bottleAtPos1E.setPresent();//sysj\plant.sysj line: 374, column: 38
      currsigs.addElement(bottleAtPos1E);
      active[27]=1;
      ends[27]=1;
      tdone[27]=1;
    }
    else {
      active[27]=1;
      ends[27]=1;
      tdone[27]=1;
    }
  }

  public void thread127990(int [] tdone, int [] ends){
        S125369=1;
    if(motConveyorOnOff.getprestatus()){//sysj\plant.sysj line: 372, column: 25
      motConveyorOnOffE.setPresent();//sysj\plant.sysj line: 372, column: 43
      currsigs.addElement(motConveyorOnOffE);
      active[26]=1;
      ends[26]=1;
      tdone[26]=1;
    }
    else {
      active[26]=1;
      ends[26]=1;
      tdone[26]=1;
    }
  }

  public void thread127989(int [] tdone, int [] ends){
        S125387=1;
    thread127990(tdone,ends);
    thread127991(tdone,ends);
    thread127992(tdone,ends);
    int biggest127993 = 0;
    if(ends[26]>=biggest127993){
      biggest127993=ends[26];
    }
    if(ends[27]>=biggest127993){
      biggest127993=ends[27];
    }
    if(ends[28]>=biggest127993){
      biggest127993=ends[28];
    }
    if(biggest127993 == 1){
      active[25]=1;
      ends[25]=1;
      tdone[25]=1;
    }
  }

  public void thread127988(int [] tdone, int [] ends){
        S125361=1;
    S125341=0;
    if(moveToPos2.getprestatus()){//sysj\plant.sysj line: 364, column: 24
      System.out.println("bottle is now at pos 2");//sysj\plant.sysj line: 364, column: 36
      bottleAtPos2.setPresent();//sysj\plant.sysj line: 364, column: 82
      currsigs.addElement(bottleAtPos2);
      active[24]=1;
      ends[24]=1;
      tdone[24]=1;
    }
    else {
      S125341=1;
      active[24]=1;
      ends[24]=1;
      tdone[24]=1;
    }
  }

  public void thread127987(int [] tdone, int [] ends){
        S125332=1;
    S125312=0;
    if(moveToPos3.getprestatus()){//sysj\plant.sysj line: 362, column: 24
      System.out.println("bottle is now at pos 3");//sysj\plant.sysj line: 362, column: 36
      bottleAtPos3.setPresent();//sysj\plant.sysj line: 362, column: 82
      currsigs.addElement(bottleAtPos3);
      active[23]=1;
      ends[23]=1;
      tdone[23]=1;
    }
    else {
      S125312=1;
      active[23]=1;
      ends[23]=1;
      tdone[23]=1;
    }
  }

  public void thread127986(int [] tdone, int [] ends){
        S125303=1;
    S125283=0;
    if(moveToPos4.getprestatus()){//sysj\plant.sysj line: 360, column: 24
      System.out.println("bottle is now at pos 4");//sysj\plant.sysj line: 360, column: 36
      bottleAtPos4.setPresent();//sysj\plant.sysj line: 360, column: 82
      currsigs.addElement(bottleAtPos4);
      active[22]=1;
      ends[22]=1;
      tdone[22]=1;
    }
    else {
      S125283=1;
      active[22]=1;
      ends[22]=1;
      tdone[22]=1;
    }
  }

  public void thread127985(int [] tdone, int [] ends){
        S125274=1;
    S125252=0;
    if(moveToPos5.getprestatus()){//sysj\plant.sysj line: 351, column: 13
      System.out.println("bottle is now at pos 5");//sysj\plant.sysj line: 352, column: 6
      bottleAtPos5.setPresent();//sysj\plant.sysj line: 353, column: 6
      currsigs.addElement(bottleAtPos5);
      active[21]=1;
      ends[21]=1;
      tdone[21]=1;
    }
    else {
      S125252=1;
      active[21]=1;
      ends[21]=1;
      tdone[21]=1;
    }
  }

  public void thread127984(int [] tdone, int [] ends){
        S125242=1;
    S125162=0;
    if(rotaryTableTrigger.getprestatus()){//sysj\plant.sysj line: 308, column: 12
      if(bottleAtPos4.getprestatus()){//sysj\plant.sysj line: 314, column: 13
        System.out.println("moving bottle at pos 4 to pos 5");//sysj\plant.sysj line: 315, column: 6
        moveToPos5.setPresent();//sysj\plant.sysj line: 316, column: 6
        currsigs.addElement(moveToPos5);
        if(bottleAtPos3.getprestatus()){//sysj\plant.sysj line: 320, column: 13
          System.out.println("moving bottle at pos 3 to pos 4");//sysj\plant.sysj line: 321, column: 6
          moveToPos4.setPresent();//sysj\plant.sysj line: 322, column: 6
          currsigs.addElement(moveToPos4);
          if(bottleAtPos2.getprestatus()){//sysj\plant.sysj line: 326, column: 13
            System.out.println("moving bottle at pos 2 to pos 3");//sysj\plant.sysj line: 327, column: 6
            moveToPos3.setPresent();//sysj\plant.sysj line: 328, column: 6
            currsigs.addElement(moveToPos3);
            if(bottleAtPos1.getprestatus()){//sysj\plant.sysj line: 331, column: 13
              System.out.println("moving bottle at pos 1 to pos 2");//sysj\plant.sysj line: 332, column: 6
              moveToPos2.setPresent();//sysj\plant.sysj line: 333, column: 6
              currsigs.addElement(moveToPos2);
              System.out.println("Table has been aligned");//sysj\plant.sysj line: 337, column: 5
              tableAlignedWithSensor.setPresent();//sysj\plant.sysj line: 338, column: 5
              currsigs.addElement(tableAlignedWithSensor);
              active[20]=1;
              ends[20]=1;
              tdone[20]=1;
            }
            else {
              System.out.println("Table has been aligned");//sysj\plant.sysj line: 337, column: 5
              tableAlignedWithSensor.setPresent();//sysj\plant.sysj line: 338, column: 5
              currsigs.addElement(tableAlignedWithSensor);
              active[20]=1;
              ends[20]=1;
              tdone[20]=1;
            }
          }
          else {
            if(bottleAtPos1.getprestatus()){//sysj\plant.sysj line: 331, column: 13
              System.out.println("moving bottle at pos 1 to pos 2");//sysj\plant.sysj line: 332, column: 6
              moveToPos2.setPresent();//sysj\plant.sysj line: 333, column: 6
              currsigs.addElement(moveToPos2);
              System.out.println("Table has been aligned");//sysj\plant.sysj line: 337, column: 5
              tableAlignedWithSensor.setPresent();//sysj\plant.sysj line: 338, column: 5
              currsigs.addElement(tableAlignedWithSensor);
              active[20]=1;
              ends[20]=1;
              tdone[20]=1;
            }
            else {
              System.out.println("Table has been aligned");//sysj\plant.sysj line: 337, column: 5
              tableAlignedWithSensor.setPresent();//sysj\plant.sysj line: 338, column: 5
              currsigs.addElement(tableAlignedWithSensor);
              active[20]=1;
              ends[20]=1;
              tdone[20]=1;
            }
          }
        }
        else {
          if(bottleAtPos2.getprestatus()){//sysj\plant.sysj line: 326, column: 13
            System.out.println("moving bottle at pos 2 to pos 3");//sysj\plant.sysj line: 327, column: 6
            moveToPos3.setPresent();//sysj\plant.sysj line: 328, column: 6
            currsigs.addElement(moveToPos3);
            if(bottleAtPos1.getprestatus()){//sysj\plant.sysj line: 331, column: 13
              System.out.println("moving bottle at pos 1 to pos 2");//sysj\plant.sysj line: 332, column: 6
              moveToPos2.setPresent();//sysj\plant.sysj line: 333, column: 6
              currsigs.addElement(moveToPos2);
              System.out.println("Table has been aligned");//sysj\plant.sysj line: 337, column: 5
              tableAlignedWithSensor.setPresent();//sysj\plant.sysj line: 338, column: 5
              currsigs.addElement(tableAlignedWithSensor);
              active[20]=1;
              ends[20]=1;
              tdone[20]=1;
            }
            else {
              System.out.println("Table has been aligned");//sysj\plant.sysj line: 337, column: 5
              tableAlignedWithSensor.setPresent();//sysj\plant.sysj line: 338, column: 5
              currsigs.addElement(tableAlignedWithSensor);
              active[20]=1;
              ends[20]=1;
              tdone[20]=1;
            }
          }
          else {
            if(bottleAtPos1.getprestatus()){//sysj\plant.sysj line: 331, column: 13
              System.out.println("moving bottle at pos 1 to pos 2");//sysj\plant.sysj line: 332, column: 6
              moveToPos2.setPresent();//sysj\plant.sysj line: 333, column: 6
              currsigs.addElement(moveToPos2);
              System.out.println("Table has been aligned");//sysj\plant.sysj line: 337, column: 5
              tableAlignedWithSensor.setPresent();//sysj\plant.sysj line: 338, column: 5
              currsigs.addElement(tableAlignedWithSensor);
              active[20]=1;
              ends[20]=1;
              tdone[20]=1;
            }
            else {
              System.out.println("Table has been aligned");//sysj\plant.sysj line: 337, column: 5
              tableAlignedWithSensor.setPresent();//sysj\plant.sysj line: 338, column: 5
              currsigs.addElement(tableAlignedWithSensor);
              active[20]=1;
              ends[20]=1;
              tdone[20]=1;
            }
          }
        }
      }
      else {
        if(bottleAtPos3.getprestatus()){//sysj\plant.sysj line: 320, column: 13
          System.out.println("moving bottle at pos 3 to pos 4");//sysj\plant.sysj line: 321, column: 6
          moveToPos4.setPresent();//sysj\plant.sysj line: 322, column: 6
          currsigs.addElement(moveToPos4);
          if(bottleAtPos2.getprestatus()){//sysj\plant.sysj line: 326, column: 13
            System.out.println("moving bottle at pos 2 to pos 3");//sysj\plant.sysj line: 327, column: 6
            moveToPos3.setPresent();//sysj\plant.sysj line: 328, column: 6
            currsigs.addElement(moveToPos3);
            if(bottleAtPos1.getprestatus()){//sysj\plant.sysj line: 331, column: 13
              System.out.println("moving bottle at pos 1 to pos 2");//sysj\plant.sysj line: 332, column: 6
              moveToPos2.setPresent();//sysj\plant.sysj line: 333, column: 6
              currsigs.addElement(moveToPos2);
              System.out.println("Table has been aligned");//sysj\plant.sysj line: 337, column: 5
              tableAlignedWithSensor.setPresent();//sysj\plant.sysj line: 338, column: 5
              currsigs.addElement(tableAlignedWithSensor);
              active[20]=1;
              ends[20]=1;
              tdone[20]=1;
            }
            else {
              System.out.println("Table has been aligned");//sysj\plant.sysj line: 337, column: 5
              tableAlignedWithSensor.setPresent();//sysj\plant.sysj line: 338, column: 5
              currsigs.addElement(tableAlignedWithSensor);
              active[20]=1;
              ends[20]=1;
              tdone[20]=1;
            }
          }
          else {
            if(bottleAtPos1.getprestatus()){//sysj\plant.sysj line: 331, column: 13
              System.out.println("moving bottle at pos 1 to pos 2");//sysj\plant.sysj line: 332, column: 6
              moveToPos2.setPresent();//sysj\plant.sysj line: 333, column: 6
              currsigs.addElement(moveToPos2);
              System.out.println("Table has been aligned");//sysj\plant.sysj line: 337, column: 5
              tableAlignedWithSensor.setPresent();//sysj\plant.sysj line: 338, column: 5
              currsigs.addElement(tableAlignedWithSensor);
              active[20]=1;
              ends[20]=1;
              tdone[20]=1;
            }
            else {
              System.out.println("Table has been aligned");//sysj\plant.sysj line: 337, column: 5
              tableAlignedWithSensor.setPresent();//sysj\plant.sysj line: 338, column: 5
              currsigs.addElement(tableAlignedWithSensor);
              active[20]=1;
              ends[20]=1;
              tdone[20]=1;
            }
          }
        }
        else {
          if(bottleAtPos2.getprestatus()){//sysj\plant.sysj line: 326, column: 13
            System.out.println("moving bottle at pos 2 to pos 3");//sysj\plant.sysj line: 327, column: 6
            moveToPos3.setPresent();//sysj\plant.sysj line: 328, column: 6
            currsigs.addElement(moveToPos3);
            if(bottleAtPos1.getprestatus()){//sysj\plant.sysj line: 331, column: 13
              System.out.println("moving bottle at pos 1 to pos 2");//sysj\plant.sysj line: 332, column: 6
              moveToPos2.setPresent();//sysj\plant.sysj line: 333, column: 6
              currsigs.addElement(moveToPos2);
              System.out.println("Table has been aligned");//sysj\plant.sysj line: 337, column: 5
              tableAlignedWithSensor.setPresent();//sysj\plant.sysj line: 338, column: 5
              currsigs.addElement(tableAlignedWithSensor);
              active[20]=1;
              ends[20]=1;
              tdone[20]=1;
            }
            else {
              System.out.println("Table has been aligned");//sysj\plant.sysj line: 337, column: 5
              tableAlignedWithSensor.setPresent();//sysj\plant.sysj line: 338, column: 5
              currsigs.addElement(tableAlignedWithSensor);
              active[20]=1;
              ends[20]=1;
              tdone[20]=1;
            }
          }
          else {
            if(bottleAtPos1.getprestatus()){//sysj\plant.sysj line: 331, column: 13
              System.out.println("moving bottle at pos 1 to pos 2");//sysj\plant.sysj line: 332, column: 6
              moveToPos2.setPresent();//sysj\plant.sysj line: 333, column: 6
              currsigs.addElement(moveToPos2);
              System.out.println("Table has been aligned");//sysj\plant.sysj line: 337, column: 5
              tableAlignedWithSensor.setPresent();//sysj\plant.sysj line: 338, column: 5
              currsigs.addElement(tableAlignedWithSensor);
              active[20]=1;
              ends[20]=1;
              tdone[20]=1;
            }
            else {
              System.out.println("Table has been aligned");//sysj\plant.sysj line: 337, column: 5
              tableAlignedWithSensor.setPresent();//sysj\plant.sysj line: 338, column: 5
              currsigs.addElement(tableAlignedWithSensor);
              active[20]=1;
              ends[20]=1;
              tdone[20]=1;
            }
          }
        }
      }
    }
    else {
      S125162=1;
      active[20]=1;
      ends[20]=1;
      tdone[20]=1;
    }
  }

  public void thread127983(int [] tdone, int [] ends){
        S125123=1;
    S125101=0;
    active[19]=1;
    ends[19]=1;
    tdone[19]=1;
  }

  public void thread127982(int [] tdone, int [] ends){
        S125091=1;
    S125047=0;
    if(gripperTurnExtend.getprestatus() && !gripperTurnRetract.getprestatus()){//sysj\plant.sysj line: 280, column: 13
      gripperTurnFinalPos.setPresent();//sysj\plant.sysj line: 282, column: 7
      currsigs.addElement(gripperTurnFinalPos);
      active[18]=1;
      ends[18]=1;
      tdone[18]=1;
    }
    else {
      S125047=1;
      if(gripperTurnRetract.getprestatus() && !gripperTurnExtend.getprestatus()){//sysj\plant.sysj line: 285, column: 13
        gripperTurnHomePos.setPresent();//sysj\plant.sysj line: 287, column: 7
        currsigs.addElement(gripperTurnHomePos);
        active[18]=1;
        ends[18]=1;
        tdone[18]=1;
      }
      else {
        S125047=2;
        active[18]=1;
        ends[18]=1;
        tdone[18]=1;
      }
    }
  }

  public void thread127981(int [] tdone, int [] ends){
        S125026=1;
    S125004=0;
    active[17]=1;
    ends[17]=1;
    tdone[17]=1;
  }

  public void thread127980(int [] tdone, int [] ends){
        S124994=1;
    S124966=0;
    gripperZAxisLifted.setPresent();//sysj\plant.sysj line: 257, column: 6
    currsigs.addElement(gripperZAxisLifted);
    active[16]=1;
    ends[16]=1;
    tdone[16]=1;
  }

  public void thread127979(int [] tdone, int [] ends){
        S124953=1;
    S124931=0;
    active[15]=1;
    ends[15]=1;
    tdone[15]=1;
  }

  public void thread127978(int [] tdone, int [] ends){
        S124921=1;
    capcount_thread_14 = 5;//sysj\plant.sysj line: 224, column: 3
    if(capDec_1.getprestatus()){//sysj\plant.sysj line: 226, column: 12
      if(capcount_thread_14 > 0) {//sysj\plant.sysj line: 227, column: 5
        capcount_thread_14 = capcount_thread_14 - 1;//sysj\plant.sysj line: 228, column: 6
      }
      if(refill.getprestatus()){//sysj\plant.sysj line: 230, column: 12
        capcount_thread_14 = 5;//sysj\plant.sysj line: 231, column: 5
        if(capcount_thread_14 == 0){//sysj\plant.sysj line: 234, column: 8
          empty.setPresent();//sysj\plant.sysj line: 235, column: 6
          currsigs.addElement(empty);
          active[14]=1;
          ends[14]=1;
          tdone[14]=1;
        }
        else {
          active[14]=1;
          ends[14]=1;
          tdone[14]=1;
        }
      }
      else {
        if(capcount_thread_14 == 0){//sysj\plant.sysj line: 234, column: 8
          empty.setPresent();//sysj\plant.sysj line: 235, column: 6
          currsigs.addElement(empty);
          active[14]=1;
          ends[14]=1;
          tdone[14]=1;
        }
        else {
          active[14]=1;
          ends[14]=1;
          tdone[14]=1;
        }
      }
    }
    else {
      if(refill.getprestatus()){//sysj\plant.sysj line: 230, column: 12
        capcount_thread_14 = 5;//sysj\plant.sysj line: 231, column: 5
        if(capcount_thread_14 == 0){//sysj\plant.sysj line: 234, column: 8
          empty.setPresent();//sysj\plant.sysj line: 235, column: 6
          currsigs.addElement(empty);
          active[14]=1;
          ends[14]=1;
          tdone[14]=1;
        }
        else {
          active[14]=1;
          ends[14]=1;
          tdone[14]=1;
        }
      }
      else {
        if(capcount_thread_14 == 0){//sysj\plant.sysj line: 234, column: 8
          empty.setPresent();//sysj\plant.sysj line: 235, column: 6
          currsigs.addElement(empty);
          active[14]=1;
          ends[14]=1;
          tdone[14]=1;
        }
        else {
          active[14]=1;
          ends[14]=1;
          tdone[14]=1;
        }
      }
    }
  }

  public void thread127977(int [] tdone, int [] ends){
        S124859=1;
    S124813=0;
    S124795=0;
    active[13]=1;
    ends[13]=1;
    tdone[13]=1;
  }

  public void thread127976(int [] tdone, int [] ends){
        S124791=1;
    S124761=0;
    if(vacOn.getprestatus() && armAtSource.getprestatus()){//sysj\plant.sysj line: 186, column: 12
      if((Integer)(capPos_1.getpreval() == null ? 0 : ((Integer)capPos_1.getpreval()).intValue()) == 1){//sysj\plant.sysj line: 187, column: 8
        capPos_1.setPresent();//sysj\plant.sysj line: 188, column: 6
        currsigs.addElement(capPos_1);
        capPos_1.setValue(0);//sysj\plant.sysj line: 188, column: 6
        WPgripped.setPresent();//sysj\plant.sysj line: 190, column: 7
        currsigs.addElement(WPgripped);
        active[12]=1;
        ends[12]=1;
        tdone[12]=1;
      }
      else {
        S124761=1;
        active[12]=1;
        ends[12]=1;
        tdone[12]=1;
      }
    }
    else {
      S124761=1;
      active[12]=1;
      ends[12]=1;
      tdone[12]=1;
    }
  }

  public void thread127975(int [] tdone, int [] ends){
        S124747=1;
    S124719=0;
    pusherRetracted.setPresent();//sysj\plant.sysj line: 176, column: 5
    currsigs.addElement(pusherRetracted);
    active[11]=1;
    ends[11]=1;
    tdone[11]=1;
  }

  public void thread127974(int [] tdone, int [] ends){
        S124706=1;
    S124678=0;
    armAtDest.setPresent();//sysj\plant.sysj line: 165, column: 5
    currsigs.addElement(armAtDest);
    active[10]=1;
    ends[10]=1;
    tdone[10]=1;
  }

  public void thread127972(int [] tdone, int [] ends){
        S124627=1;
    S124624=0;
    dosUnitEvac.setPresent();//sysj\plant.sysj line: 143, column: 7
    currsigs.addElement(dosUnitEvac);
    active[9]=1;
    ends[9]=1;
    tdone[9]=1;
  }

  public void thread127971(int [] tdone, int [] ends){
        S124619=1;
    S124614=0;
    active[8]=1;
    ends[8]=1;
    tdone[8]=1;
  }

  public void thread127970(int [] tdone, int [] ends){
        S124612=1;
    active[7]=1;
    ends[7]=1;
    tdone[7]=1;
  }

  public void thread127969(int [] tdone, int [] ends){
        S124665=1;
    thread127970(tdone,ends);
    thread127971(tdone,ends);
    thread127972(tdone,ends);
    int biggest127973 = 0;
    if(ends[7]>=biggest127973){
      biggest127973=ends[7];
    }
    if(ends[8]>=biggest127973){
      biggest127973=ends[8];
    }
    if(ends[9]>=biggest127973){
      biggest127973=ends[9];
    }
    if(biggest127973 == 1){
      active[6]=1;
      ends[6]=1;
      tdone[6]=1;
    }
  }

  public void thread127968(int [] tdone, int [] ends){
        S124609=1;
    S124603=0;
    if(bottleAtPos1.getprestatus()){//sysj\plant.sysj line: 105, column: 12
      RTbottleAtPos1.setPresent();//sysj\plant.sysj line: 107, column: 5
      currsigs.addElement(RTbottleAtPos1);
      S124603=1;
      active[5]=1;
      ends[5]=1;
      tdone[5]=1;
    }
    else {
      S124603=1;
      active[5]=1;
      ends[5]=1;
      tdone[5]=1;
    }
  }

  public void thread127966(int [] tdone, int [] ends){
        S124553=1;
    if(motorPos5On.getprestatus()){//sysj\plant.sysj line: 90, column: 14
      System.out.println("moving bottle to leave 5");//sysj\plant.sysj line: 91, column: 7
      bottleLeftPos5.setPresent();//sysj\plant.sysj line: 92, column: 7
      currsigs.addElement(bottleLeftPos5);
      active[4]=1;
      ends[4]=1;
      tdone[4]=1;
    }
    else {
      S124553=0;
      active[4]=0;
      ends[4]=0;
      tdone[4]=1;
    }
  }

  public void thread127965(int [] tdone, int [] ends){
        S124543=1;
    if(motorPos1On.getprestatus()){//sysj\plant.sysj line: 83, column: 14
      System.out.println("moving bottle to 1");//sysj\plant.sysj line: 84, column: 7
      bottleAtPos1.setPresent();//sysj\plant.sysj line: 85, column: 7
      currsigs.addElement(bottleAtPos1);
      active[3]=1;
      ends[3]=1;
      tdone[3]=1;
    }
    else {
      S124543=0;
      active[3]=0;
      ends[3]=0;
      tdone[3]=1;
    }
  }

  public void thread127964(int [] tdone, int [] ends){
        S124601=1;
    S124555=0;
    if(motConveyorOnOff.getprestatus()){//sysj\plant.sysj line: 81, column: 12
      thread127965(tdone,ends);
      thread127966(tdone,ends);
      int biggest127967 = 0;
      if(ends[3]>=biggest127967){
        biggest127967=ends[3];
      }
      if(ends[4]>=biggest127967){
        biggest127967=ends[4];
      }
      if(biggest127967 == 1){
        active[2]=1;
        ends[2]=1;
        tdone[2]=1;
      }
      //FINXME code
      if(biggest127967 == 0){
        System.out.println("motor is off");//sysj\plant.sysj line: 96, column: 4
        S124555=1;
        active[2]=1;
        ends[2]=1;
        tdone[2]=1;
      }
    }
    else {
      System.out.println("motor is off");//sysj\plant.sysj line: 96, column: 4
      S124555=1;
      active[2]=1;
      ends[2]=1;
      tdone[2]=1;
    }
  }

  public void runClockDomain(){
    for(int i=0;i<ends.length;i++){
      ends[i] = 0;
      tdone[i] = 0;
    }
    
    RUN: while(true){
      switch(S127962){
        case 0 : 
          S127962=0;
          break RUN;
        
        case 1 : 
          S127962=2;
          S127962=2;
          new Thread(new GUI()).start();//sysj\plant.sysj line: 70, column: 2
          capDec_1.setClear();//sysj\plant.sysj line: 72, column: 2
          capPos_1.setClear();//sysj\plant.sysj line: 73, column: 2
          capPos_1.setPresent();//sysj\plant.sysj line: 74, column: 2
          currsigs.addElement(capPos_1);
          capPos_1.setValue(0);//sysj\plant.sysj line: 74, column: 2
          disablePos5_1.setClear();//sysj\plant.sysj line: 75, column: 2
          thread127964(tdone,ends);
          thread127968(tdone,ends);
          thread127969(tdone,ends);
          thread127974(tdone,ends);
          thread127975(tdone,ends);
          thread127976(tdone,ends);
          thread127977(tdone,ends);
          thread127978(tdone,ends);
          thread127979(tdone,ends);
          thread127980(tdone,ends);
          thread127981(tdone,ends);
          thread127982(tdone,ends);
          thread127983(tdone,ends);
          thread127984(tdone,ends);
          thread127985(tdone,ends);
          thread127986(tdone,ends);
          thread127987(tdone,ends);
          thread127988(tdone,ends);
          thread127989(tdone,ends);
          int biggest127994 = 0;
          if(ends[2]>=biggest127994){
            biggest127994=ends[2];
          }
          if(ends[5]>=biggest127994){
            biggest127994=ends[5];
          }
          if(ends[6]>=biggest127994){
            biggest127994=ends[6];
          }
          if(ends[10]>=biggest127994){
            biggest127994=ends[10];
          }
          if(ends[11]>=biggest127994){
            biggest127994=ends[11];
          }
          if(ends[12]>=biggest127994){
            biggest127994=ends[12];
          }
          if(ends[13]>=biggest127994){
            biggest127994=ends[13];
          }
          if(ends[14]>=biggest127994){
            biggest127994=ends[14];
          }
          if(ends[15]>=biggest127994){
            biggest127994=ends[15];
          }
          if(ends[16]>=biggest127994){
            biggest127994=ends[16];
          }
          if(ends[17]>=biggest127994){
            biggest127994=ends[17];
          }
          if(ends[18]>=biggest127994){
            biggest127994=ends[18];
          }
          if(ends[19]>=biggest127994){
            biggest127994=ends[19];
          }
          if(ends[20]>=biggest127994){
            biggest127994=ends[20];
          }
          if(ends[21]>=biggest127994){
            biggest127994=ends[21];
          }
          if(ends[22]>=biggest127994){
            biggest127994=ends[22];
          }
          if(ends[23]>=biggest127994){
            biggest127994=ends[23];
          }
          if(ends[24]>=biggest127994){
            biggest127994=ends[24];
          }
          if(ends[25]>=biggest127994){
            biggest127994=ends[25];
          }
          if(biggest127994 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
        
        case 2 : 
          capDec_1.setClear();//sysj\plant.sysj line: 72, column: 2
          capPos_1.setClear();//sysj\plant.sysj line: 73, column: 2
          disablePos5_1.setClear();//sysj\plant.sysj line: 75, column: 2
          thread127995(tdone,ends);
          thread128002(tdone,ends);
          thread128003(tdone,ends);
          thread128012(tdone,ends);
          thread128013(tdone,ends);
          thread128014(tdone,ends);
          thread128015(tdone,ends);
          thread128016(tdone,ends);
          thread128017(tdone,ends);
          thread128018(tdone,ends);
          thread128019(tdone,ends);
          thread128020(tdone,ends);
          thread128021(tdone,ends);
          thread128022(tdone,ends);
          thread128023(tdone,ends);
          thread128024(tdone,ends);
          thread128025(tdone,ends);
          thread128026(tdone,ends);
          thread128027(tdone,ends);
          int biggest128032 = 0;
          if(ends[2]>=biggest128032){
            biggest128032=ends[2];
          }
          if(ends[5]>=biggest128032){
            biggest128032=ends[5];
          }
          if(ends[6]>=biggest128032){
            biggest128032=ends[6];
          }
          if(ends[10]>=biggest128032){
            biggest128032=ends[10];
          }
          if(ends[11]>=biggest128032){
            biggest128032=ends[11];
          }
          if(ends[12]>=biggest128032){
            biggest128032=ends[12];
          }
          if(ends[13]>=biggest128032){
            biggest128032=ends[13];
          }
          if(ends[14]>=biggest128032){
            biggest128032=ends[14];
          }
          if(ends[15]>=biggest128032){
            biggest128032=ends[15];
          }
          if(ends[16]>=biggest128032){
            biggest128032=ends[16];
          }
          if(ends[17]>=biggest128032){
            biggest128032=ends[17];
          }
          if(ends[18]>=biggest128032){
            biggest128032=ends[18];
          }
          if(ends[19]>=biggest128032){
            biggest128032=ends[19];
          }
          if(ends[20]>=biggest128032){
            biggest128032=ends[20];
          }
          if(ends[21]>=biggest128032){
            biggest128032=ends[21];
          }
          if(ends[22]>=biggest128032){
            biggest128032=ends[22];
          }
          if(ends[23]>=biggest128032){
            biggest128032=ends[23];
          }
          if(ends[24]>=biggest128032){
            biggest128032=ends[24];
          }
          if(ends[25]>=biggest128032){
            biggest128032=ends[25];
          }
          if(biggest128032 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
          //FINXME code
          if(biggest128032 == 0){
            S127962=0;
            active[1]=0;
            ends[1]=0;
            S127962=0;
            break RUN;
          }
        
      }
    }
  }

  public void init(){
    char [] active1 = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
    char [] paused1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    char [] suspended1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    paused = paused1;
    active = active1;
    suspended = suspended1;
    // Now instantiate all the local signals ONLY
    capDec_1 = new Signal();
    capPos_1 = new Signal();
    disablePos5_1 = new Signal();
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
          enable.gethook();
          refill.gethook();
          removeBottle.gethook();
          motConveyorOnOff.gethook();
          motorPos1On.gethook();
          motorPos5On.gethook();
          valveInjectorOnOff.gethook();
          valveInletOnOff.gethook();
          dosUnitValveRetract.gethook();
          dosUnitValveExtend.gethook();
          selectCanister.gethook();
          receivedPercentage.gethook();
          pusherExtend.gethook();
          vacOn.gethook();
          armSource.gethook();
          armDest.gethook();
          cylPos5ZAxisExtend.gethook();
          gripperTurnRetract.gethook();
          gripperTurnExtend.gethook();
          capGripperPos5Extend.gethook();
          cylClampBottleExtend.gethook();
          rotaryTableTrigger.gethook();
          df = true;
        }
        runClockDomain();
      }
      enable.setpreclear();
      refill.setpreclear();
      removeBottle.setpreclear();
      motConveyorOnOff.setpreclear();
      motorPos1On.setpreclear();
      motorPos5On.setpreclear();
      valveInjectorOnOff.setpreclear();
      valveInletOnOff.setpreclear();
      dosUnitValveRetract.setpreclear();
      dosUnitValveExtend.setpreclear();
      selectCanister.setpreclear();
      receivedPercentage.setpreclear();
      pusherExtend.setpreclear();
      vacOn.setpreclear();
      armSource.setpreclear();
      armDest.setpreclear();
      cylPos5ZAxisExtend.setpreclear();
      gripperTurnRetract.setpreclear();
      gripperTurnExtend.setpreclear();
      capGripperPos5Extend.setpreclear();
      cylClampBottleExtend.setpreclear();
      rotaryTableTrigger.setpreclear();
      bottleAtPos1.setpreclear();
      bottleAtPos5.setpreclear();
      RTbottleAtPos1.setpreclear();
      bottleLeftPos5.setpreclear();
      bottleAtPos1E.setpreclear();
      bottleAtPos5E.setpreclear();
      motConveyorOnOffE.setpreclear();
      dosUnitEvac.setpreclear();
      selectedCanister.setpreclear();
      dosUnitFilled.setpreclear();
      pusherRetracted.setpreclear();
      pusherExtended.setpreclear();
      WPgripped.setpreclear();
      armAtSource.setpreclear();
      armAtDest.setpreclear();
      empty.setpreclear();
      pusherRetractedE.setpreclear();
      pusherExtendedE.setpreclear();
      WPgrippedE.setpreclear();
      armAtSourceE.setpreclear();
      armAtDestE.setpreclear();
      emptyE.setpreclear();
      bottleAtPos4.setpreclear();
      gripperZAxisLowered.setpreclear();
      gripperZAxisLifted.setpreclear();
      gripperTurnHomePos.setpreclear();
      gripperTurnFinalPos.setpreclear();
      gripperGrippedCap.setpreclear();
      cylClampedBottle.setpreclear();
      tableAlignedWithSensor.setpreclear();
      capOnBottleAtPos1.setpreclear();
      bottleAtPos2.setpreclear();
      bottleAtPos3.setpreclear();
      moveToPos5.setpreclear();
      moveToPos4.setpreclear();
      moveToPos3.setpreclear();
      moveToPos2.setpreclear();
      capDec_1.setpreclear();
      capPos_1.setpreclear();
      disablePos5_1.setpreclear();
      int dummyint = 0;
      for(int qw=0;qw<currsigs.size();++qw){
        dummyint = ((Signal)currsigs.elementAt(qw)).getStatus() ? ((Signal)currsigs.elementAt(qw)).setprepresent() : ((Signal)currsigs.elementAt(qw)).setpreclear();
        ((Signal)currsigs.elementAt(qw)).setpreval(((Signal)currsigs.elementAt(qw)).getValue());
      }
      currsigs.removeAllElements();
      dummyint = enable.getStatus() ? enable.setprepresent() : enable.setpreclear();
      enable.setpreval(enable.getValue());
      enable.setClear();
      dummyint = refill.getStatus() ? refill.setprepresent() : refill.setpreclear();
      refill.setpreval(refill.getValue());
      refill.setClear();
      dummyint = removeBottle.getStatus() ? removeBottle.setprepresent() : removeBottle.setpreclear();
      removeBottle.setpreval(removeBottle.getValue());
      removeBottle.setClear();
      dummyint = motConveyorOnOff.getStatus() ? motConveyorOnOff.setprepresent() : motConveyorOnOff.setpreclear();
      motConveyorOnOff.setpreval(motConveyorOnOff.getValue());
      motConveyorOnOff.setClear();
      dummyint = motorPos1On.getStatus() ? motorPos1On.setprepresent() : motorPos1On.setpreclear();
      motorPos1On.setpreval(motorPos1On.getValue());
      motorPos1On.setClear();
      dummyint = motorPos5On.getStatus() ? motorPos5On.setprepresent() : motorPos5On.setpreclear();
      motorPos5On.setpreval(motorPos5On.getValue());
      motorPos5On.setClear();
      dummyint = valveInjectorOnOff.getStatus() ? valveInjectorOnOff.setprepresent() : valveInjectorOnOff.setpreclear();
      valveInjectorOnOff.setpreval(valveInjectorOnOff.getValue());
      valveInjectorOnOff.setClear();
      dummyint = valveInletOnOff.getStatus() ? valveInletOnOff.setprepresent() : valveInletOnOff.setpreclear();
      valveInletOnOff.setpreval(valveInletOnOff.getValue());
      valveInletOnOff.setClear();
      dummyint = dosUnitValveRetract.getStatus() ? dosUnitValveRetract.setprepresent() : dosUnitValveRetract.setpreclear();
      dosUnitValveRetract.setpreval(dosUnitValveRetract.getValue());
      dosUnitValveRetract.setClear();
      dummyint = dosUnitValveExtend.getStatus() ? dosUnitValveExtend.setprepresent() : dosUnitValveExtend.setpreclear();
      dosUnitValveExtend.setpreval(dosUnitValveExtend.getValue());
      dosUnitValveExtend.setClear();
      dummyint = selectCanister.getStatus() ? selectCanister.setprepresent() : selectCanister.setpreclear();
      selectCanister.setpreval(selectCanister.getValue());
      selectCanister.setClear();
      dummyint = receivedPercentage.getStatus() ? receivedPercentage.setprepresent() : receivedPercentage.setpreclear();
      receivedPercentage.setpreval(receivedPercentage.getValue());
      receivedPercentage.setClear();
      dummyint = pusherExtend.getStatus() ? pusherExtend.setprepresent() : pusherExtend.setpreclear();
      pusherExtend.setpreval(pusherExtend.getValue());
      pusherExtend.setClear();
      dummyint = vacOn.getStatus() ? vacOn.setprepresent() : vacOn.setpreclear();
      vacOn.setpreval(vacOn.getValue());
      vacOn.setClear();
      dummyint = armSource.getStatus() ? armSource.setprepresent() : armSource.setpreclear();
      armSource.setpreval(armSource.getValue());
      armSource.setClear();
      dummyint = armDest.getStatus() ? armDest.setprepresent() : armDest.setpreclear();
      armDest.setpreval(armDest.getValue());
      armDest.setClear();
      dummyint = cylPos5ZAxisExtend.getStatus() ? cylPos5ZAxisExtend.setprepresent() : cylPos5ZAxisExtend.setpreclear();
      cylPos5ZAxisExtend.setpreval(cylPos5ZAxisExtend.getValue());
      cylPos5ZAxisExtend.setClear();
      dummyint = gripperTurnRetract.getStatus() ? gripperTurnRetract.setprepresent() : gripperTurnRetract.setpreclear();
      gripperTurnRetract.setpreval(gripperTurnRetract.getValue());
      gripperTurnRetract.setClear();
      dummyint = gripperTurnExtend.getStatus() ? gripperTurnExtend.setprepresent() : gripperTurnExtend.setpreclear();
      gripperTurnExtend.setpreval(gripperTurnExtend.getValue());
      gripperTurnExtend.setClear();
      dummyint = capGripperPos5Extend.getStatus() ? capGripperPos5Extend.setprepresent() : capGripperPos5Extend.setpreclear();
      capGripperPos5Extend.setpreval(capGripperPos5Extend.getValue());
      capGripperPos5Extend.setClear();
      dummyint = cylClampBottleExtend.getStatus() ? cylClampBottleExtend.setprepresent() : cylClampBottleExtend.setpreclear();
      cylClampBottleExtend.setpreval(cylClampBottleExtend.getValue());
      cylClampBottleExtend.setClear();
      dummyint = rotaryTableTrigger.getStatus() ? rotaryTableTrigger.setprepresent() : rotaryTableTrigger.setpreclear();
      rotaryTableTrigger.setpreval(rotaryTableTrigger.getValue());
      rotaryTableTrigger.setClear();
      bottleAtPos1.sethook();
      bottleAtPos1.setClear();
      bottleAtPos5.sethook();
      bottleAtPos5.setClear();
      RTbottleAtPos1.sethook();
      RTbottleAtPos1.setClear();
      bottleLeftPos5.sethook();
      bottleLeftPos5.setClear();
      bottleAtPos1E.sethook();
      bottleAtPos1E.setClear();
      bottleAtPos5E.sethook();
      bottleAtPos5E.setClear();
      motConveyorOnOffE.sethook();
      motConveyorOnOffE.setClear();
      dosUnitEvac.sethook();
      dosUnitEvac.setClear();
      selectedCanister.sethook();
      selectedCanister.setClear();
      dosUnitFilled.sethook();
      dosUnitFilled.setClear();
      pusherRetracted.sethook();
      pusherRetracted.setClear();
      pusherExtended.sethook();
      pusherExtended.setClear();
      WPgripped.sethook();
      WPgripped.setClear();
      armAtSource.sethook();
      armAtSource.setClear();
      armAtDest.sethook();
      armAtDest.setClear();
      empty.sethook();
      empty.setClear();
      pusherRetractedE.sethook();
      pusherRetractedE.setClear();
      pusherExtendedE.sethook();
      pusherExtendedE.setClear();
      WPgrippedE.sethook();
      WPgrippedE.setClear();
      armAtSourceE.sethook();
      armAtSourceE.setClear();
      armAtDestE.sethook();
      armAtDestE.setClear();
      emptyE.sethook();
      emptyE.setClear();
      bottleAtPos4.sethook();
      bottleAtPos4.setClear();
      gripperZAxisLowered.sethook();
      gripperZAxisLowered.setClear();
      gripperZAxisLifted.sethook();
      gripperZAxisLifted.setClear();
      gripperTurnHomePos.sethook();
      gripperTurnHomePos.setClear();
      gripperTurnFinalPos.sethook();
      gripperTurnFinalPos.setClear();
      gripperGrippedCap.sethook();
      gripperGrippedCap.setClear();
      cylClampedBottle.sethook();
      cylClampedBottle.setClear();
      tableAlignedWithSensor.sethook();
      tableAlignedWithSensor.setClear();
      capOnBottleAtPos1.sethook();
      capOnBottleAtPos1.setClear();
      bottleAtPos2.sethook();
      bottleAtPos2.setClear();
      bottleAtPos3.sethook();
      bottleAtPos3.setClear();
      moveToPos5.sethook();
      moveToPos5.setClear();
      moveToPos4.sethook();
      moveToPos4.setClear();
      moveToPos3.sethook();
      moveToPos3.setClear();
      moveToPos2.sethook();
      moveToPos2.setClear();
      capDec_1.setClear();
      capPos_1.setClear();
      disablePos5_1.setClear();
      if(paused[1]!=0 || suspended[1]!=0 || active[1]!=1);
      else{
        enable.gethook();
        refill.gethook();
        removeBottle.gethook();
        motConveyorOnOff.gethook();
        motorPos1On.gethook();
        motorPos5On.gethook();
        valveInjectorOnOff.gethook();
        valveInletOnOff.gethook();
        dosUnitValveRetract.gethook();
        dosUnitValveExtend.gethook();
        selectCanister.gethook();
        receivedPercentage.gethook();
        pusherExtend.gethook();
        vacOn.gethook();
        armSource.gethook();
        armDest.gethook();
        cylPos5ZAxisExtend.gethook();
        gripperTurnRetract.gethook();
        gripperTurnExtend.gethook();
        capGripperPos5Extend.gethook();
        cylClampBottleExtend.gethook();
        rotaryTableTrigger.gethook();
      }
      runFinisher();
      if(active[1] == 0){
      	this.terminated = true;
      }
      if(!threaded) break;
    }
  }
}
