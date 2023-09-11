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
  public Signal selectPercentage = new Signal("selectPercentage", Signal.INPUT);
  public Signal pusherExtend = new Signal("pusherExtend", Signal.INPUT);
  public Signal vacOn = new Signal("vacOn", Signal.INPUT);
  public Signal armSource = new Signal("armSource", Signal.INPUT);
  public Signal armDest = new Signal("armDest", Signal.INPUT);
  public Signal magReq = new Signal("magReq", Signal.INPUT);
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
  public Signal valveInjectorActive = new Signal("valveInjectorActive", Signal.OUTPUT);
  public Signal selectedCanister = new Signal("selectedCanister", Signal.OUTPUT);
  public Signal selectedPercentage = new Signal("selectedPercentage", Signal.OUTPUT);
  public Signal dosUnitFilled = new Signal("dosUnitFilled", Signal.OUTPUT);
  public Signal pusherRetracted = new Signal("pusherRetracted", Signal.OUTPUT);
  public Signal pusherExtended = new Signal("pusherExtended", Signal.OUTPUT);
  public Signal WPgripped = new Signal("WPgripped", Signal.OUTPUT);
  public Signal armAtSource = new Signal("armAtSource", Signal.OUTPUT);
  public Signal armAtDest = new Signal("armAtDest", Signal.OUTPUT);
  public Signal magEmpty = new Signal("magEmpty", Signal.OUTPUT);
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
  private Signal canister_1;
  private Signal percent_1;
  private int capcount_thread_15;//sysj\plant.sysj line: 234, column: 3
  private int S52132 = 1;
  private int S49919 = 1;
  private int S49865 = 1;
  private int S49851 = 1;
  private int S49863 = 1;
  private int S49927 = 1;
  private int S49921 = 1;
  private int S50077 = 1;
  private int S49937 = 1;
  private int S49931 = 1;
  private int S49945 = 1;
  private int S49939 = 1;
  private int S49965 = 1;
  private int S49951 = 1;
  private int S50075 = 1;
  private int S50001 = 1;
  private int S50142 = 1;
  private int S50098 = 1;
  private int S50183 = 1;
  private int S50147 = 1;
  private int S50203 = 1;
  private int S50189 = 1;
  private int S50271 = 1;
  private int S50225 = 1;
  private int S50207 = 1;
  private int S50333 = 1;
  private int S50365 = 1;
  private int S50343 = 1;
  private int S50406 = 1;
  private int S50378 = 1;
  private int S50438 = 1;
  private int S50416 = 1;
  private int S50503 = 1;
  private int S50459 = 1;
  private int S50535 = 1;
  private int S50513 = 1;
  private int S50864 = 1;
  private int S50644 = 1;
  private int S50896 = 1;
  private int S50874 = 1;
  private int S50925 = 1;
  private int S50905 = 1;
  private int S50954 = 1;
  private int S50934 = 1;
  private int S50983 = 1;
  private int S50963 = 1;
  
  private int[] ends = new int[26];
  private int[] tdone = new int[26];
  
  public void thread52189(int [] tdone, int [] ends){
        switch(S50983){
      case 0 : 
        active[25]=0;
        ends[25]=0;
        tdone[25]=1;
        break;
      
      case 1 : 
        switch(S50963){
          case 0 : 
            bottleAtPos2.setPresent();//sysj\plant.sysj line: 373, column: 82
            currsigs.addElement(bottleAtPos2);
            active[25]=1;
            ends[25]=1;
            tdone[25]=1;
            break;
          
          case 1 : 
            S50963=1;
            S50963=0;
            if(moveToPos2.getprestatus()){//sysj\plant.sysj line: 373, column: 24
              System.out.println("bottle is now at pos 2");//sysj\plant.sysj line: 373, column: 36
              bottleAtPos2.setPresent();//sysj\plant.sysj line: 373, column: 82
              currsigs.addElement(bottleAtPos2);
              active[25]=1;
              ends[25]=1;
              tdone[25]=1;
            }
            else {
              S50963=1;
              active[25]=1;
              ends[25]=1;
              tdone[25]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread52188(int [] tdone, int [] ends){
        switch(S50954){
      case 0 : 
        active[24]=0;
        ends[24]=0;
        tdone[24]=1;
        break;
      
      case 1 : 
        switch(S50934){
          case 0 : 
            bottleAtPos3.setPresent();//sysj\plant.sysj line: 371, column: 82
            currsigs.addElement(bottleAtPos3);
            active[24]=1;
            ends[24]=1;
            tdone[24]=1;
            break;
          
          case 1 : 
            S50934=1;
            S50934=0;
            if(moveToPos3.getprestatus()){//sysj\plant.sysj line: 371, column: 24
              System.out.println("bottle is now at pos 3");//sysj\plant.sysj line: 371, column: 36
              bottleAtPos3.setPresent();//sysj\plant.sysj line: 371, column: 82
              currsigs.addElement(bottleAtPos3);
              active[24]=1;
              ends[24]=1;
              tdone[24]=1;
            }
            else {
              S50934=1;
              active[24]=1;
              ends[24]=1;
              tdone[24]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread52187(int [] tdone, int [] ends){
        switch(S50925){
      case 0 : 
        active[23]=0;
        ends[23]=0;
        tdone[23]=1;
        break;
      
      case 1 : 
        switch(S50905){
          case 0 : 
            bottleAtPos4.setPresent();//sysj\plant.sysj line: 369, column: 82
            currsigs.addElement(bottleAtPos4);
            active[23]=1;
            ends[23]=1;
            tdone[23]=1;
            break;
          
          case 1 : 
            S50905=1;
            S50905=0;
            if(moveToPos4.getprestatus()){//sysj\plant.sysj line: 369, column: 24
              System.out.println("bottle is now at pos 4");//sysj\plant.sysj line: 369, column: 36
              bottleAtPos4.setPresent();//sysj\plant.sysj line: 369, column: 82
              currsigs.addElement(bottleAtPos4);
              active[23]=1;
              ends[23]=1;
              tdone[23]=1;
            }
            else {
              S50905=1;
              active[23]=1;
              ends[23]=1;
              tdone[23]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread52186(int [] tdone, int [] ends){
        switch(S50896){
      case 0 : 
        active[22]=0;
        ends[22]=0;
        tdone[22]=1;
        break;
      
      case 1 : 
        switch(S50874){
          case 0 : 
            if(bottleLeftPos5.getprestatus()){//sysj\plant.sysj line: 359, column: 10
              S50874=1;
              active[22]=1;
              ends[22]=1;
              tdone[22]=1;
            }
            else {
              bottleAtPos5.setPresent();//sysj\plant.sysj line: 362, column: 6
              currsigs.addElement(bottleAtPos5);
              active[22]=1;
              ends[22]=1;
              tdone[22]=1;
            }
            break;
          
          case 1 : 
            S50874=1;
            S50874=0;
            if(moveToPos5.getprestatus()){//sysj\plant.sysj line: 360, column: 13
              System.out.println("bottle is now at pos 5");//sysj\plant.sysj line: 361, column: 6
              bottleAtPos5.setPresent();//sysj\plant.sysj line: 362, column: 6
              currsigs.addElement(bottleAtPos5);
              active[22]=1;
              ends[22]=1;
              tdone[22]=1;
            }
            else {
              S50874=1;
              active[22]=1;
              ends[22]=1;
              tdone[22]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread52185(int [] tdone, int [] ends){
        switch(S50864){
      case 0 : 
        active[21]=0;
        ends[21]=0;
        tdone[21]=1;
        break;
      
      case 1 : 
        switch(S50644){
          case 0 : 
            if(!rotaryTableTrigger.getprestatus()){//sysj\plant.sysj line: 347, column: 11
              S50644=1;
              active[21]=1;
              ends[21]=1;
              tdone[21]=1;
            }
            else {
              tableAlignedWithSensor.setPresent();//sysj\plant.sysj line: 348, column: 6
              currsigs.addElement(tableAlignedWithSensor);
              active[21]=1;
              ends[21]=1;
              tdone[21]=1;
            }
            break;
          
          case 1 : 
            S50644=1;
            S50644=0;
            if(rotaryTableTrigger.getprestatus()){//sysj\plant.sysj line: 316, column: 12
              System.out.println("table triggered now moving");//sysj\plant.sysj line: 320, column: 5
              if(bottleAtPos4.getprestatus()){//sysj\plant.sysj line: 323, column: 13
                System.out.println("moving bottle at pos 4 to pos 5");//sysj\plant.sysj line: 324, column: 6
                moveToPos5.setPresent();//sysj\plant.sysj line: 325, column: 6
                currsigs.addElement(moveToPos5);
                if(bottleAtPos3.getprestatus()){//sysj\plant.sysj line: 329, column: 13
                  System.out.println("moving bottle at pos 3 to pos 4");//sysj\plant.sysj line: 330, column: 6
                  moveToPos4.setPresent();//sysj\plant.sysj line: 331, column: 6
                  currsigs.addElement(moveToPos4);
                  if(bottleAtPos2.getprestatus()){//sysj\plant.sysj line: 335, column: 13
                    System.out.println("moving bottle at pos 2 to pos 3");//sysj\plant.sysj line: 336, column: 6
                    moveToPos3.setPresent();//sysj\plant.sysj line: 337, column: 6
                    currsigs.addElement(moveToPos3);
                    if(bottleAtPos1.getprestatus()){//sysj\plant.sysj line: 340, column: 13
                      System.out.println("moving bottle at pos 1 to pos 2");//sysj\plant.sysj line: 341, column: 6
                      moveToPos2.setPresent();//sysj\plant.sysj line: 342, column: 6
                      currsigs.addElement(moveToPos2);
                      System.out.println("Table has been aligned");//sysj\plant.sysj line: 345, column: 5
                      tableAlignedWithSensor.setPresent();//sysj\plant.sysj line: 348, column: 6
                      currsigs.addElement(tableAlignedWithSensor);
                      active[21]=1;
                      ends[21]=1;
                      tdone[21]=1;
                    }
                    else {
                      System.out.println("Table has been aligned");//sysj\plant.sysj line: 345, column: 5
                      tableAlignedWithSensor.setPresent();//sysj\plant.sysj line: 348, column: 6
                      currsigs.addElement(tableAlignedWithSensor);
                      active[21]=1;
                      ends[21]=1;
                      tdone[21]=1;
                    }
                  }
                  else {
                    if(bottleAtPos1.getprestatus()){//sysj\plant.sysj line: 340, column: 13
                      System.out.println("moving bottle at pos 1 to pos 2");//sysj\plant.sysj line: 341, column: 6
                      moveToPos2.setPresent();//sysj\plant.sysj line: 342, column: 6
                      currsigs.addElement(moveToPos2);
                      System.out.println("Table has been aligned");//sysj\plant.sysj line: 345, column: 5
                      tableAlignedWithSensor.setPresent();//sysj\plant.sysj line: 348, column: 6
                      currsigs.addElement(tableAlignedWithSensor);
                      active[21]=1;
                      ends[21]=1;
                      tdone[21]=1;
                    }
                    else {
                      System.out.println("Table has been aligned");//sysj\plant.sysj line: 345, column: 5
                      tableAlignedWithSensor.setPresent();//sysj\plant.sysj line: 348, column: 6
                      currsigs.addElement(tableAlignedWithSensor);
                      active[21]=1;
                      ends[21]=1;
                      tdone[21]=1;
                    }
                  }
                }
                else {
                  if(bottleAtPos2.getprestatus()){//sysj\plant.sysj line: 335, column: 13
                    System.out.println("moving bottle at pos 2 to pos 3");//sysj\plant.sysj line: 336, column: 6
                    moveToPos3.setPresent();//sysj\plant.sysj line: 337, column: 6
                    currsigs.addElement(moveToPos3);
                    if(bottleAtPos1.getprestatus()){//sysj\plant.sysj line: 340, column: 13
                      System.out.println("moving bottle at pos 1 to pos 2");//sysj\plant.sysj line: 341, column: 6
                      moveToPos2.setPresent();//sysj\plant.sysj line: 342, column: 6
                      currsigs.addElement(moveToPos2);
                      System.out.println("Table has been aligned");//sysj\plant.sysj line: 345, column: 5
                      tableAlignedWithSensor.setPresent();//sysj\plant.sysj line: 348, column: 6
                      currsigs.addElement(tableAlignedWithSensor);
                      active[21]=1;
                      ends[21]=1;
                      tdone[21]=1;
                    }
                    else {
                      System.out.println("Table has been aligned");//sysj\plant.sysj line: 345, column: 5
                      tableAlignedWithSensor.setPresent();//sysj\plant.sysj line: 348, column: 6
                      currsigs.addElement(tableAlignedWithSensor);
                      active[21]=1;
                      ends[21]=1;
                      tdone[21]=1;
                    }
                  }
                  else {
                    if(bottleAtPos1.getprestatus()){//sysj\plant.sysj line: 340, column: 13
                      System.out.println("moving bottle at pos 1 to pos 2");//sysj\plant.sysj line: 341, column: 6
                      moveToPos2.setPresent();//sysj\plant.sysj line: 342, column: 6
                      currsigs.addElement(moveToPos2);
                      System.out.println("Table has been aligned");//sysj\plant.sysj line: 345, column: 5
                      tableAlignedWithSensor.setPresent();//sysj\plant.sysj line: 348, column: 6
                      currsigs.addElement(tableAlignedWithSensor);
                      active[21]=1;
                      ends[21]=1;
                      tdone[21]=1;
                    }
                    else {
                      System.out.println("Table has been aligned");//sysj\plant.sysj line: 345, column: 5
                      tableAlignedWithSensor.setPresent();//sysj\plant.sysj line: 348, column: 6
                      currsigs.addElement(tableAlignedWithSensor);
                      active[21]=1;
                      ends[21]=1;
                      tdone[21]=1;
                    }
                  }
                }
              }
              else {
                if(bottleAtPos3.getprestatus()){//sysj\plant.sysj line: 329, column: 13
                  System.out.println("moving bottle at pos 3 to pos 4");//sysj\plant.sysj line: 330, column: 6
                  moveToPos4.setPresent();//sysj\plant.sysj line: 331, column: 6
                  currsigs.addElement(moveToPos4);
                  if(bottleAtPos2.getprestatus()){//sysj\plant.sysj line: 335, column: 13
                    System.out.println("moving bottle at pos 2 to pos 3");//sysj\plant.sysj line: 336, column: 6
                    moveToPos3.setPresent();//sysj\plant.sysj line: 337, column: 6
                    currsigs.addElement(moveToPos3);
                    if(bottleAtPos1.getprestatus()){//sysj\plant.sysj line: 340, column: 13
                      System.out.println("moving bottle at pos 1 to pos 2");//sysj\plant.sysj line: 341, column: 6
                      moveToPos2.setPresent();//sysj\plant.sysj line: 342, column: 6
                      currsigs.addElement(moveToPos2);
                      System.out.println("Table has been aligned");//sysj\plant.sysj line: 345, column: 5
                      tableAlignedWithSensor.setPresent();//sysj\plant.sysj line: 348, column: 6
                      currsigs.addElement(tableAlignedWithSensor);
                      active[21]=1;
                      ends[21]=1;
                      tdone[21]=1;
                    }
                    else {
                      System.out.println("Table has been aligned");//sysj\plant.sysj line: 345, column: 5
                      tableAlignedWithSensor.setPresent();//sysj\plant.sysj line: 348, column: 6
                      currsigs.addElement(tableAlignedWithSensor);
                      active[21]=1;
                      ends[21]=1;
                      tdone[21]=1;
                    }
                  }
                  else {
                    if(bottleAtPos1.getprestatus()){//sysj\plant.sysj line: 340, column: 13
                      System.out.println("moving bottle at pos 1 to pos 2");//sysj\plant.sysj line: 341, column: 6
                      moveToPos2.setPresent();//sysj\plant.sysj line: 342, column: 6
                      currsigs.addElement(moveToPos2);
                      System.out.println("Table has been aligned");//sysj\plant.sysj line: 345, column: 5
                      tableAlignedWithSensor.setPresent();//sysj\plant.sysj line: 348, column: 6
                      currsigs.addElement(tableAlignedWithSensor);
                      active[21]=1;
                      ends[21]=1;
                      tdone[21]=1;
                    }
                    else {
                      System.out.println("Table has been aligned");//sysj\plant.sysj line: 345, column: 5
                      tableAlignedWithSensor.setPresent();//sysj\plant.sysj line: 348, column: 6
                      currsigs.addElement(tableAlignedWithSensor);
                      active[21]=1;
                      ends[21]=1;
                      tdone[21]=1;
                    }
                  }
                }
                else {
                  if(bottleAtPos2.getprestatus()){//sysj\plant.sysj line: 335, column: 13
                    System.out.println("moving bottle at pos 2 to pos 3");//sysj\plant.sysj line: 336, column: 6
                    moveToPos3.setPresent();//sysj\plant.sysj line: 337, column: 6
                    currsigs.addElement(moveToPos3);
                    if(bottleAtPos1.getprestatus()){//sysj\plant.sysj line: 340, column: 13
                      System.out.println("moving bottle at pos 1 to pos 2");//sysj\plant.sysj line: 341, column: 6
                      moveToPos2.setPresent();//sysj\plant.sysj line: 342, column: 6
                      currsigs.addElement(moveToPos2);
                      System.out.println("Table has been aligned");//sysj\plant.sysj line: 345, column: 5
                      tableAlignedWithSensor.setPresent();//sysj\plant.sysj line: 348, column: 6
                      currsigs.addElement(tableAlignedWithSensor);
                      active[21]=1;
                      ends[21]=1;
                      tdone[21]=1;
                    }
                    else {
                      System.out.println("Table has been aligned");//sysj\plant.sysj line: 345, column: 5
                      tableAlignedWithSensor.setPresent();//sysj\plant.sysj line: 348, column: 6
                      currsigs.addElement(tableAlignedWithSensor);
                      active[21]=1;
                      ends[21]=1;
                      tdone[21]=1;
                    }
                  }
                  else {
                    if(bottleAtPos1.getprestatus()){//sysj\plant.sysj line: 340, column: 13
                      System.out.println("moving bottle at pos 1 to pos 2");//sysj\plant.sysj line: 341, column: 6
                      moveToPos2.setPresent();//sysj\plant.sysj line: 342, column: 6
                      currsigs.addElement(moveToPos2);
                      System.out.println("Table has been aligned");//sysj\plant.sysj line: 345, column: 5
                      tableAlignedWithSensor.setPresent();//sysj\plant.sysj line: 348, column: 6
                      currsigs.addElement(tableAlignedWithSensor);
                      active[21]=1;
                      ends[21]=1;
                      tdone[21]=1;
                    }
                    else {
                      System.out.println("Table has been aligned");//sysj\plant.sysj line: 345, column: 5
                      tableAlignedWithSensor.setPresent();//sysj\plant.sysj line: 348, column: 6
                      currsigs.addElement(tableAlignedWithSensor);
                      active[21]=1;
                      ends[21]=1;
                      tdone[21]=1;
                    }
                  }
                }
              }
            }
            else {
              S50644=1;
              active[21]=1;
              ends[21]=1;
              tdone[21]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread52184(int [] tdone, int [] ends){
        switch(S50535){
      case 0 : 
        active[20]=0;
        ends[20]=0;
        tdone[20]=1;
        break;
      
      case 1 : 
        switch(S50513){
          case 0 : 
            if(cylClampBottleExtend.getprestatus()){//sysj\plant.sysj line: 305, column: 11
              S50513=1;
              cylClampedBottle.setPresent();//sysj\plant.sysj line: 307, column: 6
              currsigs.addElement(cylClampedBottle);
              active[20]=1;
              ends[20]=1;
              tdone[20]=1;
            }
            else {
              active[20]=1;
              ends[20]=1;
              tdone[20]=1;
            }
            break;
          
          case 1 : 
            if(!cylClampBottleExtend.getprestatus()){//sysj\plant.sysj line: 306, column: 12
              S50513=2;
              active[20]=1;
              ends[20]=1;
              tdone[20]=1;
            }
            else {
              cylClampedBottle.setPresent();//sysj\plant.sysj line: 307, column: 6
              currsigs.addElement(cylClampedBottle);
              active[20]=1;
              ends[20]=1;
              tdone[20]=1;
            }
            break;
          
          case 2 : 
            S50513=2;
            S50513=0;
            active[20]=1;
            ends[20]=1;
            tdone[20]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread52183(int [] tdone, int [] ends){
        switch(S50503){
      case 0 : 
        active[19]=0;
        ends[19]=0;
        tdone[19]=1;
        break;
      
      case 1 : 
        switch(S50459){
          case 0 : 
            if(gripperTurnRetract.getprestatus()){//sysj\plant.sysj line: 289, column: 13
              S50459=1;
              if(gripperTurnRetract.getprestatus() && !gripperTurnExtend.getprestatus()){//sysj\plant.sysj line: 293, column: 13
                gripperTurnHomePos.setPresent();//sysj\plant.sysj line: 295, column: 7
                currsigs.addElement(gripperTurnHomePos);
                active[19]=1;
                ends[19]=1;
                tdone[19]=1;
              }
              else {
                S50459=2;
                active[19]=1;
                ends[19]=1;
                tdone[19]=1;
              }
            }
            else {
              gripperTurnFinalPos.setPresent();//sysj\plant.sysj line: 290, column: 7
              currsigs.addElement(gripperTurnFinalPos);
              active[19]=1;
              ends[19]=1;
              tdone[19]=1;
            }
            break;
          
          case 1 : 
            if(gripperTurnExtend.getprestatus()){//sysj\plant.sysj line: 294, column: 13
              S50459=2;
              active[19]=1;
              ends[19]=1;
              tdone[19]=1;
            }
            else {
              gripperTurnHomePos.setPresent();//sysj\plant.sysj line: 295, column: 7
              currsigs.addElement(gripperTurnHomePos);
              active[19]=1;
              ends[19]=1;
              tdone[19]=1;
            }
            break;
          
          case 2 : 
            S50459=2;
            S50459=0;
            if(gripperTurnExtend.getprestatus() && !gripperTurnRetract.getprestatus()){//sysj\plant.sysj line: 288, column: 13
              gripperTurnFinalPos.setPresent();//sysj\plant.sysj line: 290, column: 7
              currsigs.addElement(gripperTurnFinalPos);
              active[19]=1;
              ends[19]=1;
              tdone[19]=1;
            }
            else {
              S50459=1;
              if(gripperTurnRetract.getprestatus() && !gripperTurnExtend.getprestatus()){//sysj\plant.sysj line: 293, column: 13
                gripperTurnHomePos.setPresent();//sysj\plant.sysj line: 295, column: 7
                currsigs.addElement(gripperTurnHomePos);
                active[19]=1;
                ends[19]=1;
                tdone[19]=1;
              }
              else {
                S50459=2;
                active[19]=1;
                ends[19]=1;
                tdone[19]=1;
              }
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread52182(int [] tdone, int [] ends){
        switch(S50438){
      case 0 : 
        active[18]=0;
        ends[18]=0;
        tdone[18]=1;
        break;
      
      case 1 : 
        switch(S50416){
          case 0 : 
            if(capGripperPos5Extend.getprestatus()){//sysj\plant.sysj line: 277, column: 11
              S50416=1;
              gripperGrippedCap.setPresent();//sysj\plant.sysj line: 279, column: 6
              currsigs.addElement(gripperGrippedCap);
              active[18]=1;
              ends[18]=1;
              tdone[18]=1;
            }
            else {
              active[18]=1;
              ends[18]=1;
              tdone[18]=1;
            }
            break;
          
          case 1 : 
            if(!capGripperPos5Extend.getprestatus()){//sysj\plant.sysj line: 278, column: 12
              S50416=2;
              active[18]=1;
              ends[18]=1;
              tdone[18]=1;
            }
            else {
              gripperGrippedCap.setPresent();//sysj\plant.sysj line: 279, column: 6
              currsigs.addElement(gripperGrippedCap);
              active[18]=1;
              ends[18]=1;
              tdone[18]=1;
            }
            break;
          
          case 2 : 
            S50416=2;
            S50416=0;
            active[18]=1;
            ends[18]=1;
            tdone[18]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread52181(int [] tdone, int [] ends){
        switch(S50406){
      case 0 : 
        active[17]=0;
        ends[17]=0;
        tdone[17]=1;
        break;
      
      case 1 : 
        switch(S50378){
          case 0 : 
            if(cylPos5ZAxisExtend.getprestatus()){//sysj\plant.sysj line: 264, column: 11
              S50378=1;
              gripperZAxisLowered.setPresent();//sysj\plant.sysj line: 268, column: 6
              currsigs.addElement(gripperZAxisLowered);
              active[17]=1;
              ends[17]=1;
              tdone[17]=1;
            }
            else {
              gripperZAxisLifted.setPresent();//sysj\plant.sysj line: 265, column: 6
              currsigs.addElement(gripperZAxisLifted);
              active[17]=1;
              ends[17]=1;
              tdone[17]=1;
            }
            break;
          
          case 1 : 
            if(!cylPos5ZAxisExtend.getprestatus()){//sysj\plant.sysj line: 267, column: 12
              S50378=2;
              active[17]=1;
              ends[17]=1;
              tdone[17]=1;
            }
            else {
              gripperZAxisLowered.setPresent();//sysj\plant.sysj line: 268, column: 6
              currsigs.addElement(gripperZAxisLowered);
              active[17]=1;
              ends[17]=1;
              tdone[17]=1;
            }
            break;
          
          case 2 : 
            S50378=2;
            S50378=0;
            gripperZAxisLifted.setPresent();//sysj\plant.sysj line: 265, column: 6
            currsigs.addElement(gripperZAxisLifted);
            active[17]=1;
            ends[17]=1;
            tdone[17]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread52180(int [] tdone, int [] ends){
        switch(S50365){
      case 0 : 
        active[16]=0;
        ends[16]=0;
        tdone[16]=1;
        break;
      
      case 1 : 
        switch(S50343){
          case 0 : 
            if(moveToPos4.getprestatus()){//sysj\plant.sysj line: 253, column: 11
              S50343=1;
              bottleAtPos4.setPresent();//sysj\plant.sysj line: 255, column: 6
              currsigs.addElement(bottleAtPos4);
              active[16]=1;
              ends[16]=1;
              tdone[16]=1;
            }
            else {
              active[16]=1;
              ends[16]=1;
              tdone[16]=1;
            }
            break;
          
          case 1 : 
            if(moveToPos5.getprestatus()){//sysj\plant.sysj line: 254, column: 12
              S50343=2;
              active[16]=1;
              ends[16]=1;
              tdone[16]=1;
            }
            else {
              bottleAtPos4.setPresent();//sysj\plant.sysj line: 255, column: 6
              currsigs.addElement(bottleAtPos4);
              active[16]=1;
              ends[16]=1;
              tdone[16]=1;
            }
            break;
          
          case 2 : 
            S50343=2;
            S50343=0;
            active[16]=1;
            ends[16]=1;
            tdone[16]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread52179(int [] tdone, int [] ends){
        switch(S50333){
      case 0 : 
        active[15]=0;
        ends[15]=0;
        tdone[15]=1;
        break;
      
      case 1 : 
        if(capDec_1.getprestatus()){//sysj\plant.sysj line: 237, column: 12
          if(capcount_thread_15 > 0) {//sysj\plant.sysj line: 238, column: 5
            capcount_thread_15 = capcount_thread_15 - 1;//sysj\plant.sysj line: 239, column: 6
          }
          if(magReq.getprestatus()){//sysj\plant.sysj line: 241, column: 12
            capcount_thread_15 = 5;//sysj\plant.sysj line: 242, column: 5
            if(capcount_thread_15 == 0){//sysj\plant.sysj line: 244, column: 7
              magEmpty.setPresent();//sysj\plant.sysj line: 244, column: 22
              currsigs.addElement(magEmpty);
              active[15]=1;
              ends[15]=1;
              tdone[15]=1;
            }
            else {
              active[15]=1;
              ends[15]=1;
              tdone[15]=1;
            }
          }
          else {
            if(capcount_thread_15 == 0){//sysj\plant.sysj line: 244, column: 7
              magEmpty.setPresent();//sysj\plant.sysj line: 244, column: 22
              currsigs.addElement(magEmpty);
              active[15]=1;
              ends[15]=1;
              tdone[15]=1;
            }
            else {
              active[15]=1;
              ends[15]=1;
              tdone[15]=1;
            }
          }
        }
        else {
          if(magReq.getprestatus()){//sysj\plant.sysj line: 241, column: 12
            capcount_thread_15 = 5;//sysj\plant.sysj line: 242, column: 5
            if(capcount_thread_15 == 0){//sysj\plant.sysj line: 244, column: 7
              magEmpty.setPresent();//sysj\plant.sysj line: 244, column: 22
              currsigs.addElement(magEmpty);
              active[15]=1;
              ends[15]=1;
              tdone[15]=1;
            }
            else {
              active[15]=1;
              ends[15]=1;
              tdone[15]=1;
            }
          }
          else {
            if(capcount_thread_15 == 0){//sysj\plant.sysj line: 244, column: 7
              magEmpty.setPresent();//sysj\plant.sysj line: 244, column: 22
              currsigs.addElement(magEmpty);
              active[15]=1;
              ends[15]=1;
              tdone[15]=1;
            }
            else {
              active[15]=1;
              ends[15]=1;
              tdone[15]=1;
            }
          }
        }
        break;
      
    }
  }

  public void thread52178(int [] tdone, int [] ends){
        switch(S50271){
      case 0 : 
        active[14]=0;
        ends[14]=0;
        tdone[14]=1;
        break;
      
      case 1 : 
        switch(S50225){
          case 0 : 
            if(magEmpty.getprestatus()){//sysj\plant.sysj line: 219, column: 10
              S50225=1;
              active[14]=1;
              ends[14]=1;
              tdone[14]=1;
            }
            else {
              switch(S50207){
                case 0 : 
                  if(pusherRetracted.getprestatus()){//sysj\plant.sysj line: 221, column: 13
                    S50207=1;
                    active[14]=1;
                    ends[14]=1;
                    tdone[14]=1;
                  }
                  else {
                    active[14]=1;
                    ends[14]=1;
                    tdone[14]=1;
                  }
                  break;
                
                case 1 : 
                  if(pusherExtended.getprestatus()){//sysj\plant.sysj line: 222, column: 13
                    S50207=2;
                    active[14]=1;
                    ends[14]=1;
                    tdone[14]=1;
                  }
                  else {
                    active[14]=1;
                    ends[14]=1;
                    tdone[14]=1;
                  }
                  break;
                
                case 2 : 
                  if(pusherRetracted.getprestatus()){//sysj\plant.sysj line: 223, column: 13
                    capDec_1.setPresent();//sysj\plant.sysj line: 224, column: 7
                    currsigs.addElement(capDec_1);
                    S50207=3;
                    active[14]=1;
                    ends[14]=1;
                    tdone[14]=1;
                  }
                  else {
                    active[14]=1;
                    ends[14]=1;
                    tdone[14]=1;
                  }
                  break;
                
                case 3 : 
                  S50207=3;
                  S50207=0;
                  active[14]=1;
                  ends[14]=1;
                  tdone[14]=1;
                  break;
                
              }
            }
            break;
          
          case 1 : 
            if(magReq.getprestatus()){//sysj\plant.sysj line: 228, column: 10
              S50225=2;
              active[14]=1;
              ends[14]=1;
              tdone[14]=1;
            }
            else {
              active[14]=1;
              ends[14]=1;
              tdone[14]=1;
            }
            break;
          
          case 2 : 
            S50225=2;
            S50225=0;
            S50207=0;
            active[14]=1;
            ends[14]=1;
            tdone[14]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread52177(int [] tdone, int [] ends){
        switch(S50203){
      case 0 : 
        active[13]=0;
        ends[13]=0;
        tdone[13]=1;
        break;
      
      case 1 : 
        switch(S50189){
          case 0 : 
            if(magEmpty.getprestatus() || !vacOn.getprestatus()){//sysj\plant.sysj line: 209, column: 11
              S50189=1;
              active[13]=1;
              ends[13]=1;
              tdone[13]=1;
            }
            else {
              WPgripped.setPresent();//sysj\plant.sysj line: 210, column: 6
              currsigs.addElement(WPgripped);
              active[13]=1;
              ends[13]=1;
              tdone[13]=1;
            }
            break;
          
          case 1 : 
            S50189=1;
            S50189=0;
            if(vacOn.getprestatus() && armAtSource.getprestatus()){//sysj\plant.sysj line: 208, column: 12
              WPgripped.setPresent();//sysj\plant.sysj line: 210, column: 6
              currsigs.addElement(WPgripped);
              active[13]=1;
              ends[13]=1;
              tdone[13]=1;
            }
            else {
              S50189=1;
              active[13]=1;
              ends[13]=1;
              tdone[13]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread52176(int [] tdone, int [] ends){
        switch(S50183){
      case 0 : 
        active[12]=0;
        ends[12]=0;
        tdone[12]=1;
        break;
      
      case 1 : 
        switch(S50147){
          case 0 : 
            if(pusherExtend.getprestatus()){//sysj\plant.sysj line: 195, column: 10
              System.out.println("Aborted");//sysj\plant.sysj line: 198, column: 4
              S50147=1;
              pusherExtended.setPresent();//sysj\plant.sysj line: 200, column: 5
              currsigs.addElement(pusherExtended);
              active[12]=1;
              ends[12]=1;
              tdone[12]=1;
            }
            else {
              pusherRetracted.setPresent();//sysj\plant.sysj line: 196, column: 5
              currsigs.addElement(pusherRetracted);
              active[12]=1;
              ends[12]=1;
              tdone[12]=1;
            }
            break;
          
          case 1 : 
            if(!pusherExtend.getprestatus()){//sysj\plant.sysj line: 199, column: 10
              S50147=2;
              active[12]=1;
              ends[12]=1;
              tdone[12]=1;
            }
            else {
              pusherExtended.setPresent();//sysj\plant.sysj line: 200, column: 5
              currsigs.addElement(pusherExtended);
              active[12]=1;
              ends[12]=1;
              tdone[12]=1;
            }
            break;
          
          case 2 : 
            S50147=2;
            S50147=0;
            pusherRetracted.setPresent();//sysj\plant.sysj line: 196, column: 5
            currsigs.addElement(pusherRetracted);
            active[12]=1;
            ends[12]=1;
            tdone[12]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread52175(int [] tdone, int [] ends){
        switch(S50142){
      case 0 : 
        active[11]=0;
        ends[11]=0;
        tdone[11]=1;
        break;
      
      case 1 : 
        switch(S50098){
          case 0 : 
            if(armDest.getprestatus()){//sysj\plant.sysj line: 180, column: 12
              S50098=1;
              if(armDest.getprestatus() && !armSource.getprestatus()){//sysj\plant.sysj line: 184, column: 12
                armAtDest.setPresent();//sysj\plant.sysj line: 186, column: 6
                currsigs.addElement(armAtDest);
                active[11]=1;
                ends[11]=1;
                tdone[11]=1;
              }
              else {
                S50098=2;
                active[11]=1;
                ends[11]=1;
                tdone[11]=1;
              }
            }
            else {
              armAtSource.setPresent();//sysj\plant.sysj line: 181, column: 6
              currsigs.addElement(armAtSource);
              active[11]=1;
              ends[11]=1;
              tdone[11]=1;
            }
            break;
          
          case 1 : 
            if(armSource.getprestatus()){//sysj\plant.sysj line: 185, column: 12
              S50098=2;
              active[11]=1;
              ends[11]=1;
              tdone[11]=1;
            }
            else {
              armAtDest.setPresent();//sysj\plant.sysj line: 186, column: 6
              currsigs.addElement(armAtDest);
              active[11]=1;
              ends[11]=1;
              tdone[11]=1;
            }
            break;
          
          case 2 : 
            S50098=2;
            S50098=0;
            if(armSource.getprestatus() && !armDest.getprestatus()){//sysj\plant.sysj line: 179, column: 12
              armAtSource.setPresent();//sysj\plant.sysj line: 181, column: 6
              currsigs.addElement(armAtSource);
              active[11]=1;
              ends[11]=1;
              tdone[11]=1;
            }
            else {
              S50098=1;
              if(armDest.getprestatus() && !armSource.getprestatus()){//sysj\plant.sysj line: 184, column: 12
                armAtDest.setPresent();//sysj\plant.sysj line: 186, column: 6
                currsigs.addElement(armAtDest);
                active[11]=1;
                ends[11]=1;
                tdone[11]=1;
              }
              else {
                S50098=2;
                active[11]=1;
                ends[11]=1;
                tdone[11]=1;
              }
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread52173(int [] tdone, int [] ends){
        switch(S50075){
      case 0 : 
        active[10]=0;
        ends[10]=0;
        tdone[10]=1;
        break;
      
      case 1 : 
        switch(S50001){
          case 0 : 
            if(dosUnitValveRetract.getprestatus()){//sysj\plant.sysj line: 156, column: 13
              S50001=1;
              if(dosUnitValveRetract.getprestatus() && !dosUnitValveExtend.getprestatus()){//sysj\plant.sysj line: 160, column: 13
                System.out.println("FillerPlant: Filling with canister " + (canister_1.getpreval() == null ? 0 : ((Integer)canister_1.getpreval()).intValue()) + " Percent: " + (percent_1.getpreval() == null ? 0 : ((Integer)percent_1.getpreval()).intValue()));//sysj\plant.sysj line: 161, column: 6
                dosUnitFilled.setPresent();//sysj\plant.sysj line: 163, column: 7
                currsigs.addElement(dosUnitFilled);
                active[10]=1;
                ends[10]=1;
                tdone[10]=1;
              }
              else {
                S50001=2;
                active[10]=1;
                ends[10]=1;
                tdone[10]=1;
              }
            }
            else {
              dosUnitEvac.setPresent();//sysj\plant.sysj line: 157, column: 7
              currsigs.addElement(dosUnitEvac);
              active[10]=1;
              ends[10]=1;
              tdone[10]=1;
            }
            break;
          
          case 1 : 
            if(dosUnitValveExtend.getprestatus()){//sysj\plant.sysj line: 162, column: 13
              S50001=2;
              active[10]=1;
              ends[10]=1;
              tdone[10]=1;
            }
            else {
              dosUnitFilled.setPresent();//sysj\plant.sysj line: 163, column: 7
              currsigs.addElement(dosUnitFilled);
              active[10]=1;
              ends[10]=1;
              tdone[10]=1;
            }
            break;
          
          case 2 : 
            S50001=2;
            S50001=0;
            if(dosUnitValveExtend.getprestatus() && !dosUnitValveRetract.getprestatus()){//sysj\plant.sysj line: 155, column: 13
              dosUnitEvac.setPresent();//sysj\plant.sysj line: 157, column: 7
              currsigs.addElement(dosUnitEvac);
              active[10]=1;
              ends[10]=1;
              tdone[10]=1;
            }
            else {
              S50001=1;
              if(dosUnitValveRetract.getprestatus() && !dosUnitValveExtend.getprestatus()){//sysj\plant.sysj line: 160, column: 13
                System.out.println("FillerPlant: Filling with canister " + (canister_1.getpreval() == null ? 0 : ((Integer)canister_1.getpreval()).intValue()) + " Percent: " + (percent_1.getpreval() == null ? 0 : ((Integer)percent_1.getpreval()).intValue()));//sysj\plant.sysj line: 161, column: 6
                dosUnitFilled.setPresent();//sysj\plant.sysj line: 163, column: 7
                currsigs.addElement(dosUnitFilled);
                active[10]=1;
                ends[10]=1;
                tdone[10]=1;
              }
              else {
                S50001=2;
                active[10]=1;
                ends[10]=1;
                tdone[10]=1;
              }
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread52172(int [] tdone, int [] ends){
        switch(S49965){
      case 0 : 
        active[9]=0;
        ends[9]=0;
        tdone[9]=1;
        break;
      
      case 1 : 
        switch(S49951){
          case 0 : 
            if(!valveInjectorOnOff.getprestatus()){//sysj\plant.sysj line: 144, column: 12
              S49951=1;
              active[9]=1;
              ends[9]=1;
              tdone[9]=1;
            }
            else {
              valveInjectorActive.setPresent();//sysj\plant.sysj line: 145, column: 7
              currsigs.addElement(valveInjectorActive);
              active[9]=1;
              ends[9]=1;
              tdone[9]=1;
            }
            break;
          
          case 1 : 
            S49951=1;
            S49951=0;
            if(valveInjectorOnOff.getprestatus()){//sysj\plant.sysj line: 143, column: 13
              valveInjectorActive.setPresent();//sysj\plant.sysj line: 145, column: 7
              currsigs.addElement(valveInjectorActive);
              active[9]=1;
              ends[9]=1;
              tdone[9]=1;
            }
            else {
              S49951=1;
              active[9]=1;
              ends[9]=1;
              tdone[9]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread52171(int [] tdone, int [] ends){
        switch(S49945){
      case 0 : 
        active[8]=0;
        ends[8]=0;
        tdone[8]=1;
        break;
      
      case 1 : 
        switch(S49939){
          case 0 : 
            if(selectPercentage.getprestatus()){//sysj\plant.sysj line: 134, column: 11
              percent_1.setPresent();//sysj\plant.sysj line: 135, column: 5
              currsigs.addElement(percent_1);
              percent_1.setValue((selectPercentage.getpreval() == null ? null : ((Integer)selectPercentage.getpreval())));//sysj\plant.sysj line: 135, column: 5
              selectedPercentage.setPresent();//sysj\plant.sysj line: 136, column: 5
              currsigs.addElement(selectedPercentage);
              selectedPercentage.setValue((selectPercentage.getpreval() == null ? null : ((Integer)selectPercentage.getpreval())));//sysj\plant.sysj line: 136, column: 5
              S49939=1;
              active[8]=1;
              ends[8]=1;
              tdone[8]=1;
            }
            else {
              active[8]=1;
              ends[8]=1;
              tdone[8]=1;
            }
            break;
          
          case 1 : 
            S49939=1;
            S49939=0;
            active[8]=1;
            ends[8]=1;
            tdone[8]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread52170(int [] tdone, int [] ends){
        switch(S49937){
      case 0 : 
        active[7]=0;
        ends[7]=0;
        tdone[7]=1;
        break;
      
      case 1 : 
        switch(S49931){
          case 0 : 
            if(selectCanister.getprestatus()){//sysj\plant.sysj line: 124, column: 11
              canister_1.setPresent();//sysj\plant.sysj line: 125, column: 5
              currsigs.addElement(canister_1);
              canister_1.setValue((selectCanister.getpreval() == null ? null : ((Integer)selectCanister.getpreval())));//sysj\plant.sysj line: 125, column: 5
              selectedCanister.setPresent();//sysj\plant.sysj line: 126, column: 5
              currsigs.addElement(selectedCanister);
              selectedCanister.setValue((selectCanister.getpreval() == null ? null : ((Integer)selectCanister.getpreval())));//sysj\plant.sysj line: 126, column: 5
              S49931=1;
              active[7]=1;
              ends[7]=1;
              tdone[7]=1;
            }
            else {
              active[7]=1;
              ends[7]=1;
              tdone[7]=1;
            }
            break;
          
          case 1 : 
            S49931=1;
            S49931=0;
            active[7]=1;
            ends[7]=1;
            tdone[7]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread52169(int [] tdone, int [] ends){
        switch(S50077){
      case 0 : 
        active[6]=0;
        ends[6]=0;
        tdone[6]=1;
        break;
      
      case 1 : 
        canister_1.setClear();//sysj\plant.sysj line: 119, column: 3
        percent_1.setClear();//sysj\plant.sysj line: 120, column: 3
        thread52170(tdone,ends);
        thread52171(tdone,ends);
        thread52172(tdone,ends);
        thread52173(tdone,ends);
        int biggest52174 = 0;
        if(ends[7]>=biggest52174){
          biggest52174=ends[7];
        }
        if(ends[8]>=biggest52174){
          biggest52174=ends[8];
        }
        if(ends[9]>=biggest52174){
          biggest52174=ends[9];
        }
        if(ends[10]>=biggest52174){
          biggest52174=ends[10];
        }
        if(biggest52174 == 1){
          active[6]=1;
          ends[6]=1;
          tdone[6]=1;
        }
        //FINXME code
        if(biggest52174 == 0){
          S50077=0;
          active[6]=0;
          ends[6]=0;
          tdone[6]=1;
        }
        break;
      
    }
  }

  public void thread52168(int [] tdone, int [] ends){
        switch(S49927){
      case 0 : 
        active[5]=0;
        ends[5]=0;
        tdone[5]=1;
        break;
      
      case 1 : 
        switch(S49921){
          case 0 : 
            S49921=0;
            if(bottleAtPos1.getprestatus()){//sysj\plant.sysj line: 106, column: 12
              RTbottleAtPos1.setPresent();//sysj\plant.sysj line: 108, column: 5
              currsigs.addElement(RTbottleAtPos1);
              S49921=1;
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            else {
              S49921=1;
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            break;
          
          case 1 : 
            S49921=1;
            S49921=0;
            if(bottleAtPos1.getprestatus()){//sysj\plant.sysj line: 106, column: 12
              RTbottleAtPos1.setPresent();//sysj\plant.sysj line: 108, column: 5
              currsigs.addElement(RTbottleAtPos1);
              S49921=1;
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            else {
              S49921=1;
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread52166(int [] tdone, int [] ends){
        S49863=1;
    if(motorPos5On.getprestatus()){//sysj\plant.sysj line: 89, column: 14
      System.out.println("Conveyor Plant - moving bottle to leave 5");//sysj\plant.sysj line: 90, column: 7
      bottleLeftPos5.setPresent();//sysj\plant.sysj line: 92, column: 8
      currsigs.addElement(bottleLeftPos5);
      active[4]=1;
      ends[4]=1;
      tdone[4]=1;
    }
    else {
      S49863=0;
      active[4]=0;
      ends[4]=0;
      tdone[4]=1;
    }
  }

  public void thread52165(int [] tdone, int [] ends){
        S49851=1;
    if(motorPos1On.getprestatus()){//sysj\plant.sysj line: 80, column: 14
      System.out.println("Conveyor plant - moving bottle to 1");//sysj\plant.sysj line: 81, column: 7
      bottleAtPos1.setPresent();//sysj\plant.sysj line: 83, column: 8
      currsigs.addElement(bottleAtPos1);
      active[3]=1;
      ends[3]=1;
      tdone[3]=1;
    }
    else {
      S49851=0;
      active[3]=0;
      ends[3]=0;
      tdone[3]=1;
    }
  }

  public void thread52163(int [] tdone, int [] ends){
        switch(S49863){
      case 0 : 
        active[4]=0;
        ends[4]=0;
        tdone[4]=1;
        break;
      
      case 1 : 
        if(!motorPos5On.getprestatus() && !motConveyorOnOff.getprestatus()){//sysj\plant.sysj line: 91, column: 13
          S49863=0;
          active[4]=0;
          ends[4]=0;
          tdone[4]=1;
        }
        else {
          bottleLeftPos5.setPresent();//sysj\plant.sysj line: 92, column: 8
          currsigs.addElement(bottleLeftPos5);
          active[4]=1;
          ends[4]=1;
          tdone[4]=1;
        }
        break;
      
    }
  }

  public void thread52162(int [] tdone, int [] ends){
        switch(S49851){
      case 0 : 
        active[3]=0;
        ends[3]=0;
        tdone[3]=1;
        break;
      
      case 1 : 
        if(moveToPos2.getprestatus()){//sysj\plant.sysj line: 82, column: 13
          S49851=0;
          active[3]=0;
          ends[3]=0;
          tdone[3]=1;
        }
        else {
          bottleAtPos1.setPresent();//sysj\plant.sysj line: 83, column: 8
          currsigs.addElement(bottleAtPos1);
          active[3]=1;
          ends[3]=1;
          tdone[3]=1;
        }
        break;
      
    }
  }

  public void thread52161(int [] tdone, int [] ends){
        switch(S49919){
      case 0 : 
        active[2]=0;
        ends[2]=0;
        tdone[2]=1;
        break;
      
      case 1 : 
        switch(S49865){
          case 0 : 
            thread52162(tdone,ends);
            thread52163(tdone,ends);
            int biggest52164 = 0;
            if(ends[3]>=biggest52164){
              biggest52164=ends[3];
            }
            if(ends[4]>=biggest52164){
              biggest52164=ends[4];
            }
            if(biggest52164 == 1){
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            //FINXME code
            if(biggest52164 == 0){
              S49865=1;
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            break;
          
          case 1 : 
            S49865=1;
            S49865=0;
            if(motConveyorOnOff.getprestatus()){//sysj\plant.sysj line: 78, column: 12
              thread52165(tdone,ends);
              thread52166(tdone,ends);
              int biggest52167 = 0;
              if(ends[3]>=biggest52167){
                biggest52167=ends[3];
              }
              if(ends[4]>=biggest52167){
                biggest52167=ends[4];
              }
              if(biggest52167 == 1){
                active[2]=1;
                ends[2]=1;
                tdone[2]=1;
              }
              //FINXME code
              if(biggest52167 == 0){
                S49865=1;
                active[2]=1;
                ends[2]=1;
                tdone[2]=1;
              }
            }
            else {
              S49865=1;
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread52159(int [] tdone, int [] ends){
        S50983=1;
    S50963=0;
    if(moveToPos2.getprestatus()){//sysj\plant.sysj line: 373, column: 24
      System.out.println("bottle is now at pos 2");//sysj\plant.sysj line: 373, column: 36
      bottleAtPos2.setPresent();//sysj\plant.sysj line: 373, column: 82
      currsigs.addElement(bottleAtPos2);
      active[25]=1;
      ends[25]=1;
      tdone[25]=1;
    }
    else {
      S50963=1;
      active[25]=1;
      ends[25]=1;
      tdone[25]=1;
    }
  }

  public void thread52158(int [] tdone, int [] ends){
        S50954=1;
    S50934=0;
    if(moveToPos3.getprestatus()){//sysj\plant.sysj line: 371, column: 24
      System.out.println("bottle is now at pos 3");//sysj\plant.sysj line: 371, column: 36
      bottleAtPos3.setPresent();//sysj\plant.sysj line: 371, column: 82
      currsigs.addElement(bottleAtPos3);
      active[24]=1;
      ends[24]=1;
      tdone[24]=1;
    }
    else {
      S50934=1;
      active[24]=1;
      ends[24]=1;
      tdone[24]=1;
    }
  }

  public void thread52157(int [] tdone, int [] ends){
        S50925=1;
    S50905=0;
    if(moveToPos4.getprestatus()){//sysj\plant.sysj line: 369, column: 24
      System.out.println("bottle is now at pos 4");//sysj\plant.sysj line: 369, column: 36
      bottleAtPos4.setPresent();//sysj\plant.sysj line: 369, column: 82
      currsigs.addElement(bottleAtPos4);
      active[23]=1;
      ends[23]=1;
      tdone[23]=1;
    }
    else {
      S50905=1;
      active[23]=1;
      ends[23]=1;
      tdone[23]=1;
    }
  }

  public void thread52156(int [] tdone, int [] ends){
        S50896=1;
    S50874=0;
    if(moveToPos5.getprestatus()){//sysj\plant.sysj line: 360, column: 13
      System.out.println("bottle is now at pos 5");//sysj\plant.sysj line: 361, column: 6
      bottleAtPos5.setPresent();//sysj\plant.sysj line: 362, column: 6
      currsigs.addElement(bottleAtPos5);
      active[22]=1;
      ends[22]=1;
      tdone[22]=1;
    }
    else {
      S50874=1;
      active[22]=1;
      ends[22]=1;
      tdone[22]=1;
    }
  }

  public void thread52155(int [] tdone, int [] ends){
        S50864=1;
    S50644=0;
    if(rotaryTableTrigger.getprestatus()){//sysj\plant.sysj line: 316, column: 12
      System.out.println("table triggered now moving");//sysj\plant.sysj line: 320, column: 5
      if(bottleAtPos4.getprestatus()){//sysj\plant.sysj line: 323, column: 13
        System.out.println("moving bottle at pos 4 to pos 5");//sysj\plant.sysj line: 324, column: 6
        moveToPos5.setPresent();//sysj\plant.sysj line: 325, column: 6
        currsigs.addElement(moveToPos5);
        if(bottleAtPos3.getprestatus()){//sysj\plant.sysj line: 329, column: 13
          System.out.println("moving bottle at pos 3 to pos 4");//sysj\plant.sysj line: 330, column: 6
          moveToPos4.setPresent();//sysj\plant.sysj line: 331, column: 6
          currsigs.addElement(moveToPos4);
          if(bottleAtPos2.getprestatus()){//sysj\plant.sysj line: 335, column: 13
            System.out.println("moving bottle at pos 2 to pos 3");//sysj\plant.sysj line: 336, column: 6
            moveToPos3.setPresent();//sysj\plant.sysj line: 337, column: 6
            currsigs.addElement(moveToPos3);
            if(bottleAtPos1.getprestatus()){//sysj\plant.sysj line: 340, column: 13
              System.out.println("moving bottle at pos 1 to pos 2");//sysj\plant.sysj line: 341, column: 6
              moveToPos2.setPresent();//sysj\plant.sysj line: 342, column: 6
              currsigs.addElement(moveToPos2);
              System.out.println("Table has been aligned");//sysj\plant.sysj line: 345, column: 5
              tableAlignedWithSensor.setPresent();//sysj\plant.sysj line: 348, column: 6
              currsigs.addElement(tableAlignedWithSensor);
              active[21]=1;
              ends[21]=1;
              tdone[21]=1;
            }
            else {
              System.out.println("Table has been aligned");//sysj\plant.sysj line: 345, column: 5
              tableAlignedWithSensor.setPresent();//sysj\plant.sysj line: 348, column: 6
              currsigs.addElement(tableAlignedWithSensor);
              active[21]=1;
              ends[21]=1;
              tdone[21]=1;
            }
          }
          else {
            if(bottleAtPos1.getprestatus()){//sysj\plant.sysj line: 340, column: 13
              System.out.println("moving bottle at pos 1 to pos 2");//sysj\plant.sysj line: 341, column: 6
              moveToPos2.setPresent();//sysj\plant.sysj line: 342, column: 6
              currsigs.addElement(moveToPos2);
              System.out.println("Table has been aligned");//sysj\plant.sysj line: 345, column: 5
              tableAlignedWithSensor.setPresent();//sysj\plant.sysj line: 348, column: 6
              currsigs.addElement(tableAlignedWithSensor);
              active[21]=1;
              ends[21]=1;
              tdone[21]=1;
            }
            else {
              System.out.println("Table has been aligned");//sysj\plant.sysj line: 345, column: 5
              tableAlignedWithSensor.setPresent();//sysj\plant.sysj line: 348, column: 6
              currsigs.addElement(tableAlignedWithSensor);
              active[21]=1;
              ends[21]=1;
              tdone[21]=1;
            }
          }
        }
        else {
          if(bottleAtPos2.getprestatus()){//sysj\plant.sysj line: 335, column: 13
            System.out.println("moving bottle at pos 2 to pos 3");//sysj\plant.sysj line: 336, column: 6
            moveToPos3.setPresent();//sysj\plant.sysj line: 337, column: 6
            currsigs.addElement(moveToPos3);
            if(bottleAtPos1.getprestatus()){//sysj\plant.sysj line: 340, column: 13
              System.out.println("moving bottle at pos 1 to pos 2");//sysj\plant.sysj line: 341, column: 6
              moveToPos2.setPresent();//sysj\plant.sysj line: 342, column: 6
              currsigs.addElement(moveToPos2);
              System.out.println("Table has been aligned");//sysj\plant.sysj line: 345, column: 5
              tableAlignedWithSensor.setPresent();//sysj\plant.sysj line: 348, column: 6
              currsigs.addElement(tableAlignedWithSensor);
              active[21]=1;
              ends[21]=1;
              tdone[21]=1;
            }
            else {
              System.out.println("Table has been aligned");//sysj\plant.sysj line: 345, column: 5
              tableAlignedWithSensor.setPresent();//sysj\plant.sysj line: 348, column: 6
              currsigs.addElement(tableAlignedWithSensor);
              active[21]=1;
              ends[21]=1;
              tdone[21]=1;
            }
          }
          else {
            if(bottleAtPos1.getprestatus()){//sysj\plant.sysj line: 340, column: 13
              System.out.println("moving bottle at pos 1 to pos 2");//sysj\plant.sysj line: 341, column: 6
              moveToPos2.setPresent();//sysj\plant.sysj line: 342, column: 6
              currsigs.addElement(moveToPos2);
              System.out.println("Table has been aligned");//sysj\plant.sysj line: 345, column: 5
              tableAlignedWithSensor.setPresent();//sysj\plant.sysj line: 348, column: 6
              currsigs.addElement(tableAlignedWithSensor);
              active[21]=1;
              ends[21]=1;
              tdone[21]=1;
            }
            else {
              System.out.println("Table has been aligned");//sysj\plant.sysj line: 345, column: 5
              tableAlignedWithSensor.setPresent();//sysj\plant.sysj line: 348, column: 6
              currsigs.addElement(tableAlignedWithSensor);
              active[21]=1;
              ends[21]=1;
              tdone[21]=1;
            }
          }
        }
      }
      else {
        if(bottleAtPos3.getprestatus()){//sysj\plant.sysj line: 329, column: 13
          System.out.println("moving bottle at pos 3 to pos 4");//sysj\plant.sysj line: 330, column: 6
          moveToPos4.setPresent();//sysj\plant.sysj line: 331, column: 6
          currsigs.addElement(moveToPos4);
          if(bottleAtPos2.getprestatus()){//sysj\plant.sysj line: 335, column: 13
            System.out.println("moving bottle at pos 2 to pos 3");//sysj\plant.sysj line: 336, column: 6
            moveToPos3.setPresent();//sysj\plant.sysj line: 337, column: 6
            currsigs.addElement(moveToPos3);
            if(bottleAtPos1.getprestatus()){//sysj\plant.sysj line: 340, column: 13
              System.out.println("moving bottle at pos 1 to pos 2");//sysj\plant.sysj line: 341, column: 6
              moveToPos2.setPresent();//sysj\plant.sysj line: 342, column: 6
              currsigs.addElement(moveToPos2);
              System.out.println("Table has been aligned");//sysj\plant.sysj line: 345, column: 5
              tableAlignedWithSensor.setPresent();//sysj\plant.sysj line: 348, column: 6
              currsigs.addElement(tableAlignedWithSensor);
              active[21]=1;
              ends[21]=1;
              tdone[21]=1;
            }
            else {
              System.out.println("Table has been aligned");//sysj\plant.sysj line: 345, column: 5
              tableAlignedWithSensor.setPresent();//sysj\plant.sysj line: 348, column: 6
              currsigs.addElement(tableAlignedWithSensor);
              active[21]=1;
              ends[21]=1;
              tdone[21]=1;
            }
          }
          else {
            if(bottleAtPos1.getprestatus()){//sysj\plant.sysj line: 340, column: 13
              System.out.println("moving bottle at pos 1 to pos 2");//sysj\plant.sysj line: 341, column: 6
              moveToPos2.setPresent();//sysj\plant.sysj line: 342, column: 6
              currsigs.addElement(moveToPos2);
              System.out.println("Table has been aligned");//sysj\plant.sysj line: 345, column: 5
              tableAlignedWithSensor.setPresent();//sysj\plant.sysj line: 348, column: 6
              currsigs.addElement(tableAlignedWithSensor);
              active[21]=1;
              ends[21]=1;
              tdone[21]=1;
            }
            else {
              System.out.println("Table has been aligned");//sysj\plant.sysj line: 345, column: 5
              tableAlignedWithSensor.setPresent();//sysj\plant.sysj line: 348, column: 6
              currsigs.addElement(tableAlignedWithSensor);
              active[21]=1;
              ends[21]=1;
              tdone[21]=1;
            }
          }
        }
        else {
          if(bottleAtPos2.getprestatus()){//sysj\plant.sysj line: 335, column: 13
            System.out.println("moving bottle at pos 2 to pos 3");//sysj\plant.sysj line: 336, column: 6
            moveToPos3.setPresent();//sysj\plant.sysj line: 337, column: 6
            currsigs.addElement(moveToPos3);
            if(bottleAtPos1.getprestatus()){//sysj\plant.sysj line: 340, column: 13
              System.out.println("moving bottle at pos 1 to pos 2");//sysj\plant.sysj line: 341, column: 6
              moveToPos2.setPresent();//sysj\plant.sysj line: 342, column: 6
              currsigs.addElement(moveToPos2);
              System.out.println("Table has been aligned");//sysj\plant.sysj line: 345, column: 5
              tableAlignedWithSensor.setPresent();//sysj\plant.sysj line: 348, column: 6
              currsigs.addElement(tableAlignedWithSensor);
              active[21]=1;
              ends[21]=1;
              tdone[21]=1;
            }
            else {
              System.out.println("Table has been aligned");//sysj\plant.sysj line: 345, column: 5
              tableAlignedWithSensor.setPresent();//sysj\plant.sysj line: 348, column: 6
              currsigs.addElement(tableAlignedWithSensor);
              active[21]=1;
              ends[21]=1;
              tdone[21]=1;
            }
          }
          else {
            if(bottleAtPos1.getprestatus()){//sysj\plant.sysj line: 340, column: 13
              System.out.println("moving bottle at pos 1 to pos 2");//sysj\plant.sysj line: 341, column: 6
              moveToPos2.setPresent();//sysj\plant.sysj line: 342, column: 6
              currsigs.addElement(moveToPos2);
              System.out.println("Table has been aligned");//sysj\plant.sysj line: 345, column: 5
              tableAlignedWithSensor.setPresent();//sysj\plant.sysj line: 348, column: 6
              currsigs.addElement(tableAlignedWithSensor);
              active[21]=1;
              ends[21]=1;
              tdone[21]=1;
            }
            else {
              System.out.println("Table has been aligned");//sysj\plant.sysj line: 345, column: 5
              tableAlignedWithSensor.setPresent();//sysj\plant.sysj line: 348, column: 6
              currsigs.addElement(tableAlignedWithSensor);
              active[21]=1;
              ends[21]=1;
              tdone[21]=1;
            }
          }
        }
      }
    }
    else {
      S50644=1;
      active[21]=1;
      ends[21]=1;
      tdone[21]=1;
    }
  }

  public void thread52154(int [] tdone, int [] ends){
        S50535=1;
    S50513=0;
    active[20]=1;
    ends[20]=1;
    tdone[20]=1;
  }

  public void thread52153(int [] tdone, int [] ends){
        S50503=1;
    S50459=0;
    if(gripperTurnExtend.getprestatus() && !gripperTurnRetract.getprestatus()){//sysj\plant.sysj line: 288, column: 13
      gripperTurnFinalPos.setPresent();//sysj\plant.sysj line: 290, column: 7
      currsigs.addElement(gripperTurnFinalPos);
      active[19]=1;
      ends[19]=1;
      tdone[19]=1;
    }
    else {
      S50459=1;
      if(gripperTurnRetract.getprestatus() && !gripperTurnExtend.getprestatus()){//sysj\plant.sysj line: 293, column: 13
        gripperTurnHomePos.setPresent();//sysj\plant.sysj line: 295, column: 7
        currsigs.addElement(gripperTurnHomePos);
        active[19]=1;
        ends[19]=1;
        tdone[19]=1;
      }
      else {
        S50459=2;
        active[19]=1;
        ends[19]=1;
        tdone[19]=1;
      }
    }
  }

  public void thread52152(int [] tdone, int [] ends){
        S50438=1;
    S50416=0;
    active[18]=1;
    ends[18]=1;
    tdone[18]=1;
  }

  public void thread52151(int [] tdone, int [] ends){
        S50406=1;
    S50378=0;
    gripperZAxisLifted.setPresent();//sysj\plant.sysj line: 265, column: 6
    currsigs.addElement(gripperZAxisLifted);
    active[17]=1;
    ends[17]=1;
    tdone[17]=1;
  }

  public void thread52150(int [] tdone, int [] ends){
        S50365=1;
    S50343=0;
    active[16]=1;
    ends[16]=1;
    tdone[16]=1;
  }

  public void thread52149(int [] tdone, int [] ends){
        S50333=1;
    capcount_thread_15 = 5;//sysj\plant.sysj line: 234, column: 3
    if(capDec_1.getprestatus()){//sysj\plant.sysj line: 237, column: 12
      if(capcount_thread_15 > 0) {//sysj\plant.sysj line: 238, column: 5
        capcount_thread_15 = capcount_thread_15 - 1;//sysj\plant.sysj line: 239, column: 6
      }
      if(magReq.getprestatus()){//sysj\plant.sysj line: 241, column: 12
        capcount_thread_15 = 5;//sysj\plant.sysj line: 242, column: 5
        if(capcount_thread_15 == 0){//sysj\plant.sysj line: 244, column: 7
          magEmpty.setPresent();//sysj\plant.sysj line: 244, column: 22
          currsigs.addElement(magEmpty);
          active[15]=1;
          ends[15]=1;
          tdone[15]=1;
        }
        else {
          active[15]=1;
          ends[15]=1;
          tdone[15]=1;
        }
      }
      else {
        if(capcount_thread_15 == 0){//sysj\plant.sysj line: 244, column: 7
          magEmpty.setPresent();//sysj\plant.sysj line: 244, column: 22
          currsigs.addElement(magEmpty);
          active[15]=1;
          ends[15]=1;
          tdone[15]=1;
        }
        else {
          active[15]=1;
          ends[15]=1;
          tdone[15]=1;
        }
      }
    }
    else {
      if(magReq.getprestatus()){//sysj\plant.sysj line: 241, column: 12
        capcount_thread_15 = 5;//sysj\plant.sysj line: 242, column: 5
        if(capcount_thread_15 == 0){//sysj\plant.sysj line: 244, column: 7
          magEmpty.setPresent();//sysj\plant.sysj line: 244, column: 22
          currsigs.addElement(magEmpty);
          active[15]=1;
          ends[15]=1;
          tdone[15]=1;
        }
        else {
          active[15]=1;
          ends[15]=1;
          tdone[15]=1;
        }
      }
      else {
        if(capcount_thread_15 == 0){//sysj\plant.sysj line: 244, column: 7
          magEmpty.setPresent();//sysj\plant.sysj line: 244, column: 22
          currsigs.addElement(magEmpty);
          active[15]=1;
          ends[15]=1;
          tdone[15]=1;
        }
        else {
          active[15]=1;
          ends[15]=1;
          tdone[15]=1;
        }
      }
    }
  }

  public void thread52148(int [] tdone, int [] ends){
        S50271=1;
    S50225=0;
    S50207=0;
    active[14]=1;
    ends[14]=1;
    tdone[14]=1;
  }

  public void thread52147(int [] tdone, int [] ends){
        S50203=1;
    S50189=0;
    if(vacOn.getprestatus() && armAtSource.getprestatus()){//sysj\plant.sysj line: 208, column: 12
      WPgripped.setPresent();//sysj\plant.sysj line: 210, column: 6
      currsigs.addElement(WPgripped);
      active[13]=1;
      ends[13]=1;
      tdone[13]=1;
    }
    else {
      S50189=1;
      active[13]=1;
      ends[13]=1;
      tdone[13]=1;
    }
  }

  public void thread52146(int [] tdone, int [] ends){
        S50183=1;
    S50147=0;
    pusherRetracted.setPresent();//sysj\plant.sysj line: 196, column: 5
    currsigs.addElement(pusherRetracted);
    active[12]=1;
    ends[12]=1;
    tdone[12]=1;
  }

  public void thread52145(int [] tdone, int [] ends){
        S50142=1;
    S50098=0;
    if(armSource.getprestatus() && !armDest.getprestatus()){//sysj\plant.sysj line: 179, column: 12
      armAtSource.setPresent();//sysj\plant.sysj line: 181, column: 6
      currsigs.addElement(armAtSource);
      active[11]=1;
      ends[11]=1;
      tdone[11]=1;
    }
    else {
      S50098=1;
      if(armDest.getprestatus() && !armSource.getprestatus()){//sysj\plant.sysj line: 184, column: 12
        armAtDest.setPresent();//sysj\plant.sysj line: 186, column: 6
        currsigs.addElement(armAtDest);
        active[11]=1;
        ends[11]=1;
        tdone[11]=1;
      }
      else {
        S50098=2;
        active[11]=1;
        ends[11]=1;
        tdone[11]=1;
      }
    }
  }

  public void thread52143(int [] tdone, int [] ends){
        S50075=1;
    S50001=0;
    if(dosUnitValveExtend.getprestatus() && !dosUnitValveRetract.getprestatus()){//sysj\plant.sysj line: 155, column: 13
      dosUnitEvac.setPresent();//sysj\plant.sysj line: 157, column: 7
      currsigs.addElement(dosUnitEvac);
      active[10]=1;
      ends[10]=1;
      tdone[10]=1;
    }
    else {
      S50001=1;
      if(dosUnitValveRetract.getprestatus() && !dosUnitValveExtend.getprestatus()){//sysj\plant.sysj line: 160, column: 13
        System.out.println("FillerPlant: Filling with canister " + (canister_1.getpreval() == null ? 0 : ((Integer)canister_1.getpreval()).intValue()) + " Percent: " + (percent_1.getpreval() == null ? 0 : ((Integer)percent_1.getpreval()).intValue()));//sysj\plant.sysj line: 161, column: 6
        dosUnitFilled.setPresent();//sysj\plant.sysj line: 163, column: 7
        currsigs.addElement(dosUnitFilled);
        active[10]=1;
        ends[10]=1;
        tdone[10]=1;
      }
      else {
        S50001=2;
        active[10]=1;
        ends[10]=1;
        tdone[10]=1;
      }
    }
  }

  public void thread52142(int [] tdone, int [] ends){
        S49965=1;
    S49951=0;
    if(valveInjectorOnOff.getprestatus()){//sysj\plant.sysj line: 143, column: 13
      valveInjectorActive.setPresent();//sysj\plant.sysj line: 145, column: 7
      currsigs.addElement(valveInjectorActive);
      active[9]=1;
      ends[9]=1;
      tdone[9]=1;
    }
    else {
      S49951=1;
      active[9]=1;
      ends[9]=1;
      tdone[9]=1;
    }
  }

  public void thread52141(int [] tdone, int [] ends){
        S49945=1;
    S49939=0;
    active[8]=1;
    ends[8]=1;
    tdone[8]=1;
  }

  public void thread52140(int [] tdone, int [] ends){
        S49937=1;
    S49931=0;
    active[7]=1;
    ends[7]=1;
    tdone[7]=1;
  }

  public void thread52139(int [] tdone, int [] ends){
        S50077=1;
    canister_1.setClear();//sysj\plant.sysj line: 119, column: 3
    percent_1.setClear();//sysj\plant.sysj line: 120, column: 3
    thread52140(tdone,ends);
    thread52141(tdone,ends);
    thread52142(tdone,ends);
    thread52143(tdone,ends);
    int biggest52144 = 0;
    if(ends[7]>=biggest52144){
      biggest52144=ends[7];
    }
    if(ends[8]>=biggest52144){
      biggest52144=ends[8];
    }
    if(ends[9]>=biggest52144){
      biggest52144=ends[9];
    }
    if(ends[10]>=biggest52144){
      biggest52144=ends[10];
    }
    if(biggest52144 == 1){
      active[6]=1;
      ends[6]=1;
      tdone[6]=1;
    }
  }

  public void thread52138(int [] tdone, int [] ends){
        S49927=1;
    S49921=0;
    if(bottleAtPos1.getprestatus()){//sysj\plant.sysj line: 106, column: 12
      RTbottleAtPos1.setPresent();//sysj\plant.sysj line: 108, column: 5
      currsigs.addElement(RTbottleAtPos1);
      S49921=1;
      active[5]=1;
      ends[5]=1;
      tdone[5]=1;
    }
    else {
      S49921=1;
      active[5]=1;
      ends[5]=1;
      tdone[5]=1;
    }
  }

  public void thread52136(int [] tdone, int [] ends){
        S49863=1;
    if(motorPos5On.getprestatus()){//sysj\plant.sysj line: 89, column: 14
      System.out.println("Conveyor Plant - moving bottle to leave 5");//sysj\plant.sysj line: 90, column: 7
      bottleLeftPos5.setPresent();//sysj\plant.sysj line: 92, column: 8
      currsigs.addElement(bottleLeftPos5);
      active[4]=1;
      ends[4]=1;
      tdone[4]=1;
    }
    else {
      S49863=0;
      active[4]=0;
      ends[4]=0;
      tdone[4]=1;
    }
  }

  public void thread52135(int [] tdone, int [] ends){
        S49851=1;
    if(motorPos1On.getprestatus()){//sysj\plant.sysj line: 80, column: 14
      System.out.println("Conveyor plant - moving bottle to 1");//sysj\plant.sysj line: 81, column: 7
      bottleAtPos1.setPresent();//sysj\plant.sysj line: 83, column: 8
      currsigs.addElement(bottleAtPos1);
      active[3]=1;
      ends[3]=1;
      tdone[3]=1;
    }
    else {
      S49851=0;
      active[3]=0;
      ends[3]=0;
      tdone[3]=1;
    }
  }

  public void thread52134(int [] tdone, int [] ends){
        S49919=1;
    S49865=0;
    if(motConveyorOnOff.getprestatus()){//sysj\plant.sysj line: 78, column: 12
      thread52135(tdone,ends);
      thread52136(tdone,ends);
      int biggest52137 = 0;
      if(ends[3]>=biggest52137){
        biggest52137=ends[3];
      }
      if(ends[4]>=biggest52137){
        biggest52137=ends[4];
      }
      if(biggest52137 == 1){
        active[2]=1;
        ends[2]=1;
        tdone[2]=1;
      }
      //FINXME code
      if(biggest52137 == 0){
        S49865=1;
        active[2]=1;
        ends[2]=1;
        tdone[2]=1;
      }
    }
    else {
      S49865=1;
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
      switch(S52132){
        case 0 : 
          S52132=0;
          break RUN;
        
        case 1 : 
          S52132=2;
          S52132=2;
          capDec_1.setClear();//sysj\plant.sysj line: 69, column: 2
          capPos_1.setClear();//sysj\plant.sysj line: 70, column: 2
          capPos_1.setPresent();//sysj\plant.sysj line: 71, column: 2
          currsigs.addElement(capPos_1);
          capPos_1.setValue(0);//sysj\plant.sysj line: 71, column: 2
          disablePos5_1.setClear();//sysj\plant.sysj line: 72, column: 2
          thread52134(tdone,ends);
          thread52138(tdone,ends);
          thread52139(tdone,ends);
          thread52145(tdone,ends);
          thread52146(tdone,ends);
          thread52147(tdone,ends);
          thread52148(tdone,ends);
          thread52149(tdone,ends);
          thread52150(tdone,ends);
          thread52151(tdone,ends);
          thread52152(tdone,ends);
          thread52153(tdone,ends);
          thread52154(tdone,ends);
          thread52155(tdone,ends);
          thread52156(tdone,ends);
          thread52157(tdone,ends);
          thread52158(tdone,ends);
          thread52159(tdone,ends);
          int biggest52160 = 0;
          if(ends[2]>=biggest52160){
            biggest52160=ends[2];
          }
          if(ends[5]>=biggest52160){
            biggest52160=ends[5];
          }
          if(ends[6]>=biggest52160){
            biggest52160=ends[6];
          }
          if(ends[11]>=biggest52160){
            biggest52160=ends[11];
          }
          if(ends[12]>=biggest52160){
            biggest52160=ends[12];
          }
          if(ends[13]>=biggest52160){
            biggest52160=ends[13];
          }
          if(ends[14]>=biggest52160){
            biggest52160=ends[14];
          }
          if(ends[15]>=biggest52160){
            biggest52160=ends[15];
          }
          if(ends[16]>=biggest52160){
            biggest52160=ends[16];
          }
          if(ends[17]>=biggest52160){
            biggest52160=ends[17];
          }
          if(ends[18]>=biggest52160){
            biggest52160=ends[18];
          }
          if(ends[19]>=biggest52160){
            biggest52160=ends[19];
          }
          if(ends[20]>=biggest52160){
            biggest52160=ends[20];
          }
          if(ends[21]>=biggest52160){
            biggest52160=ends[21];
          }
          if(ends[22]>=biggest52160){
            biggest52160=ends[22];
          }
          if(ends[23]>=biggest52160){
            biggest52160=ends[23];
          }
          if(ends[24]>=biggest52160){
            biggest52160=ends[24];
          }
          if(ends[25]>=biggest52160){
            biggest52160=ends[25];
          }
          if(biggest52160 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
        
        case 2 : 
          capDec_1.setClear();//sysj\plant.sysj line: 69, column: 2
          capPos_1.setClear();//sysj\plant.sysj line: 70, column: 2
          disablePos5_1.setClear();//sysj\plant.sysj line: 72, column: 2
          thread52161(tdone,ends);
          thread52168(tdone,ends);
          thread52169(tdone,ends);
          thread52175(tdone,ends);
          thread52176(tdone,ends);
          thread52177(tdone,ends);
          thread52178(tdone,ends);
          thread52179(tdone,ends);
          thread52180(tdone,ends);
          thread52181(tdone,ends);
          thread52182(tdone,ends);
          thread52183(tdone,ends);
          thread52184(tdone,ends);
          thread52185(tdone,ends);
          thread52186(tdone,ends);
          thread52187(tdone,ends);
          thread52188(tdone,ends);
          thread52189(tdone,ends);
          int biggest52190 = 0;
          if(ends[2]>=biggest52190){
            biggest52190=ends[2];
          }
          if(ends[5]>=biggest52190){
            biggest52190=ends[5];
          }
          if(ends[6]>=biggest52190){
            biggest52190=ends[6];
          }
          if(ends[11]>=biggest52190){
            biggest52190=ends[11];
          }
          if(ends[12]>=biggest52190){
            biggest52190=ends[12];
          }
          if(ends[13]>=biggest52190){
            biggest52190=ends[13];
          }
          if(ends[14]>=biggest52190){
            biggest52190=ends[14];
          }
          if(ends[15]>=biggest52190){
            biggest52190=ends[15];
          }
          if(ends[16]>=biggest52190){
            biggest52190=ends[16];
          }
          if(ends[17]>=biggest52190){
            biggest52190=ends[17];
          }
          if(ends[18]>=biggest52190){
            biggest52190=ends[18];
          }
          if(ends[19]>=biggest52190){
            biggest52190=ends[19];
          }
          if(ends[20]>=biggest52190){
            biggest52190=ends[20];
          }
          if(ends[21]>=biggest52190){
            biggest52190=ends[21];
          }
          if(ends[22]>=biggest52190){
            biggest52190=ends[22];
          }
          if(ends[23]>=biggest52190){
            biggest52190=ends[23];
          }
          if(ends[24]>=biggest52190){
            biggest52190=ends[24];
          }
          if(ends[25]>=biggest52190){
            biggest52190=ends[25];
          }
          if(biggest52190 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
          //FINXME code
          if(biggest52190 == 0){
            S52132=0;
            active[1]=0;
            ends[1]=0;
            S52132=0;
            break RUN;
          }
        
      }
    }
  }

  public void init(){
    char [] active1 = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
    char [] paused1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    char [] suspended1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    paused = paused1;
    active = active1;
    suspended = suspended1;
    // Now instantiate all the local signals ONLY
    capDec_1 = new Signal();
    capPos_1 = new Signal();
    disablePos5_1 = new Signal();
    canister_1 = new Signal();
    percent_1 = new Signal();
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
          selectPercentage.gethook();
          pusherExtend.gethook();
          vacOn.gethook();
          armSource.gethook();
          armDest.gethook();
          magReq.gethook();
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
      selectPercentage.setpreclear();
      pusherExtend.setpreclear();
      vacOn.setpreclear();
      armSource.setpreclear();
      armDest.setpreclear();
      magReq.setpreclear();
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
      valveInjectorActive.setpreclear();
      selectedCanister.setpreclear();
      selectedPercentage.setpreclear();
      dosUnitFilled.setpreclear();
      pusherRetracted.setpreclear();
      pusherExtended.setpreclear();
      WPgripped.setpreclear();
      armAtSource.setpreclear();
      armAtDest.setpreclear();
      magEmpty.setpreclear();
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
      canister_1.setpreclear();
      percent_1.setpreclear();
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
      dummyint = selectPercentage.getStatus() ? selectPercentage.setprepresent() : selectPercentage.setpreclear();
      selectPercentage.setpreval(selectPercentage.getValue());
      selectPercentage.setClear();
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
      dummyint = magReq.getStatus() ? magReq.setprepresent() : magReq.setpreclear();
      magReq.setpreval(magReq.getValue());
      magReq.setClear();
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
      valveInjectorActive.sethook();
      valveInjectorActive.setClear();
      selectedCanister.sethook();
      selectedCanister.setClear();
      selectedPercentage.sethook();
      selectedPercentage.setClear();
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
      magEmpty.sethook();
      magEmpty.setClear();
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
      canister_1.setClear();
      percent_1.setClear();
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
        selectPercentage.gethook();
        pusherExtend.gethook();
        vacOn.gethook();
        armSource.gethook();
        armDest.gethook();
        magReq.gethook();
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
