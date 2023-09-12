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
  private int capcount_thread_15;//sysj\plant.sysj line: 238, column: 3
  private long __start_thread_2;//sysj\plant.sysj line: 78, column: 29
  private long __start_thread_7;//sysj\plant.sysj line: 124, column: 4
  private long __start_thread_12;//sysj\plant.sysj line: 197, column: 3
  private long __start_thread_18;//sysj\plant.sysj line: 283, column: 4
  private int S54645 = 1;
  private int S51451 = 1;
  private int S51223 = 1;
  private int S51221 = 1;
  private int S51112 = 1;
  private int S51136 = 1;
  private int S51148 = 1;
  private int S51459 = 1;
  private int S51693 = 1;
  private int S51553 = 1;
  private int S51491 = 1;
  private int S51561 = 1;
  private int S51555 = 1;
  private int S51581 = 1;
  private int S51567 = 1;
  private int S51691 = 1;
  private int S51617 = 1;
  private int S51758 = 1;
  private int S51714 = 1;
  private int S51907 = 1;
  private int S51791 = 1;
  private int S51927 = 1;
  private int S51913 = 1;
  private int S51995 = 1;
  private int S51949 = 1;
  private int S51931 = 1;
  private int S52057 = 1;
  private int S52089 = 1;
  private int S52067 = 1;
  private int S52166 = 1;
  private int S52098 = 1;
  private int S52306 = 1;
  private int S52196 = 1;
  private int S52371 = 1;
  private int S52327 = 1;
  private int S52427 = 1;
  private int S52389 = 1;
  private int S52756 = 1;
  private int S52536 = 1;
  private int S52788 = 1;
  private int S52766 = 1;
  private int S52817 = 1;
  private int S52797 = 1;
  private int S52846 = 1;
  private int S52826 = 1;
  private int S52875 = 1;
  private int S52855 = 1;
  
  private int[] ends = new int[26];
  private int[] tdone = new int[26];
  
  public void thread54708(int [] tdone, int [] ends){
        switch(S52875){
      case 0 : 
        active[25]=0;
        ends[25]=0;
        tdone[25]=1;
        break;
      
      case 1 : 
        switch(S52855){
          case 0 : 
            bottleAtPos2.setPresent();//sysj\plant.sysj line: 383, column: 82
            currsigs.addElement(bottleAtPos2);
            active[25]=1;
            ends[25]=1;
            tdone[25]=1;
            break;
          
          case 1 : 
            S52855=1;
            S52855=0;
            if(moveToPos2.getprestatus()){//sysj\plant.sysj line: 383, column: 24
              System.out.println("bottle is now at pos 2");//sysj\plant.sysj line: 383, column: 36
              bottleAtPos2.setPresent();//sysj\plant.sysj line: 383, column: 82
              currsigs.addElement(bottleAtPos2);
              active[25]=1;
              ends[25]=1;
              tdone[25]=1;
            }
            else {
              S52855=1;
              active[25]=1;
              ends[25]=1;
              tdone[25]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread54707(int [] tdone, int [] ends){
        switch(S52846){
      case 0 : 
        active[24]=0;
        ends[24]=0;
        tdone[24]=1;
        break;
      
      case 1 : 
        switch(S52826){
          case 0 : 
            bottleAtPos3.setPresent();//sysj\plant.sysj line: 381, column: 82
            currsigs.addElement(bottleAtPos3);
            active[24]=1;
            ends[24]=1;
            tdone[24]=1;
            break;
          
          case 1 : 
            S52826=1;
            S52826=0;
            if(moveToPos3.getprestatus()){//sysj\plant.sysj line: 381, column: 24
              System.out.println("bottle is now at pos 3");//sysj\plant.sysj line: 381, column: 36
              bottleAtPos3.setPresent();//sysj\plant.sysj line: 381, column: 82
              currsigs.addElement(bottleAtPos3);
              active[24]=1;
              ends[24]=1;
              tdone[24]=1;
            }
            else {
              S52826=1;
              active[24]=1;
              ends[24]=1;
              tdone[24]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread54706(int [] tdone, int [] ends){
        switch(S52817){
      case 0 : 
        active[23]=0;
        ends[23]=0;
        tdone[23]=1;
        break;
      
      case 1 : 
        switch(S52797){
          case 0 : 
            bottleAtPos4.setPresent();//sysj\plant.sysj line: 379, column: 82
            currsigs.addElement(bottleAtPos4);
            active[23]=1;
            ends[23]=1;
            tdone[23]=1;
            break;
          
          case 1 : 
            S52797=1;
            S52797=0;
            if(moveToPos4.getprestatus()){//sysj\plant.sysj line: 379, column: 24
              System.out.println("bottle is now at pos 4");//sysj\plant.sysj line: 379, column: 36
              bottleAtPos4.setPresent();//sysj\plant.sysj line: 379, column: 82
              currsigs.addElement(bottleAtPos4);
              active[23]=1;
              ends[23]=1;
              tdone[23]=1;
            }
            else {
              S52797=1;
              active[23]=1;
              ends[23]=1;
              tdone[23]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread54705(int [] tdone, int [] ends){
        switch(S52788){
      case 0 : 
        active[22]=0;
        ends[22]=0;
        tdone[22]=1;
        break;
      
      case 1 : 
        switch(S52766){
          case 0 : 
            if(bottleLeftPos5.getprestatus()){//sysj\plant.sysj line: 369, column: 10
              S52766=1;
              active[22]=1;
              ends[22]=1;
              tdone[22]=1;
            }
            else {
              bottleAtPos5.setPresent();//sysj\plant.sysj line: 372, column: 6
              currsigs.addElement(bottleAtPos5);
              active[22]=1;
              ends[22]=1;
              tdone[22]=1;
            }
            break;
          
          case 1 : 
            S52766=1;
            S52766=0;
            if(moveToPos5.getprestatus()){//sysj\plant.sysj line: 370, column: 13
              System.out.println("bottle is now at pos 5");//sysj\plant.sysj line: 371, column: 6
              bottleAtPos5.setPresent();//sysj\plant.sysj line: 372, column: 6
              currsigs.addElement(bottleAtPos5);
              active[22]=1;
              ends[22]=1;
              tdone[22]=1;
            }
            else {
              S52766=1;
              active[22]=1;
              ends[22]=1;
              tdone[22]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread54704(int [] tdone, int [] ends){
        switch(S52756){
      case 0 : 
        active[21]=0;
        ends[21]=0;
        tdone[21]=1;
        break;
      
      case 1 : 
        switch(S52536){
          case 0 : 
            if(!rotaryTableTrigger.getprestatus()){//sysj\plant.sysj line: 357, column: 11
              S52536=1;
              active[21]=1;
              ends[21]=1;
              tdone[21]=1;
            }
            else {
              tableAlignedWithSensor.setPresent();//sysj\plant.sysj line: 358, column: 6
              currsigs.addElement(tableAlignedWithSensor);
              active[21]=1;
              ends[21]=1;
              tdone[21]=1;
            }
            break;
          
          case 1 : 
            S52536=1;
            S52536=0;
            if(rotaryTableTrigger.getprestatus()){//sysj\plant.sysj line: 326, column: 12
              System.out.println("table triggered now moving");//sysj\plant.sysj line: 330, column: 5
              if(bottleAtPos4.getprestatus()){//sysj\plant.sysj line: 333, column: 13
                System.out.println("moving bottle at pos 4 to pos 5");//sysj\plant.sysj line: 334, column: 6
                moveToPos5.setPresent();//sysj\plant.sysj line: 335, column: 6
                currsigs.addElement(moveToPos5);
                if(bottleAtPos3.getprestatus()){//sysj\plant.sysj line: 339, column: 13
                  System.out.println("moving bottle at pos 3 to pos 4");//sysj\plant.sysj line: 340, column: 6
                  moveToPos4.setPresent();//sysj\plant.sysj line: 341, column: 6
                  currsigs.addElement(moveToPos4);
                  if(bottleAtPos2.getprestatus()){//sysj\plant.sysj line: 345, column: 13
                    System.out.println("moving bottle at pos 2 to pos 3");//sysj\plant.sysj line: 346, column: 6
                    moveToPos3.setPresent();//sysj\plant.sysj line: 347, column: 6
                    currsigs.addElement(moveToPos3);
                    if(bottleAtPos1.getprestatus()){//sysj\plant.sysj line: 350, column: 13
                      System.out.println("moving bottle at pos 1 to pos 2");//sysj\plant.sysj line: 351, column: 6
                      moveToPos2.setPresent();//sysj\plant.sysj line: 352, column: 6
                      currsigs.addElement(moveToPos2);
                      System.out.println("Table has been aligned");//sysj\plant.sysj line: 355, column: 5
                      tableAlignedWithSensor.setPresent();//sysj\plant.sysj line: 358, column: 6
                      currsigs.addElement(tableAlignedWithSensor);
                      active[21]=1;
                      ends[21]=1;
                      tdone[21]=1;
                    }
                    else {
                      System.out.println("Table has been aligned");//sysj\plant.sysj line: 355, column: 5
                      tableAlignedWithSensor.setPresent();//sysj\plant.sysj line: 358, column: 6
                      currsigs.addElement(tableAlignedWithSensor);
                      active[21]=1;
                      ends[21]=1;
                      tdone[21]=1;
                    }
                  }
                  else {
                    if(bottleAtPos1.getprestatus()){//sysj\plant.sysj line: 350, column: 13
                      System.out.println("moving bottle at pos 1 to pos 2");//sysj\plant.sysj line: 351, column: 6
                      moveToPos2.setPresent();//sysj\plant.sysj line: 352, column: 6
                      currsigs.addElement(moveToPos2);
                      System.out.println("Table has been aligned");//sysj\plant.sysj line: 355, column: 5
                      tableAlignedWithSensor.setPresent();//sysj\plant.sysj line: 358, column: 6
                      currsigs.addElement(tableAlignedWithSensor);
                      active[21]=1;
                      ends[21]=1;
                      tdone[21]=1;
                    }
                    else {
                      System.out.println("Table has been aligned");//sysj\plant.sysj line: 355, column: 5
                      tableAlignedWithSensor.setPresent();//sysj\plant.sysj line: 358, column: 6
                      currsigs.addElement(tableAlignedWithSensor);
                      active[21]=1;
                      ends[21]=1;
                      tdone[21]=1;
                    }
                  }
                }
                else {
                  if(bottleAtPos2.getprestatus()){//sysj\plant.sysj line: 345, column: 13
                    System.out.println("moving bottle at pos 2 to pos 3");//sysj\plant.sysj line: 346, column: 6
                    moveToPos3.setPresent();//sysj\plant.sysj line: 347, column: 6
                    currsigs.addElement(moveToPos3);
                    if(bottleAtPos1.getprestatus()){//sysj\plant.sysj line: 350, column: 13
                      System.out.println("moving bottle at pos 1 to pos 2");//sysj\plant.sysj line: 351, column: 6
                      moveToPos2.setPresent();//sysj\plant.sysj line: 352, column: 6
                      currsigs.addElement(moveToPos2);
                      System.out.println("Table has been aligned");//sysj\plant.sysj line: 355, column: 5
                      tableAlignedWithSensor.setPresent();//sysj\plant.sysj line: 358, column: 6
                      currsigs.addElement(tableAlignedWithSensor);
                      active[21]=1;
                      ends[21]=1;
                      tdone[21]=1;
                    }
                    else {
                      System.out.println("Table has been aligned");//sysj\plant.sysj line: 355, column: 5
                      tableAlignedWithSensor.setPresent();//sysj\plant.sysj line: 358, column: 6
                      currsigs.addElement(tableAlignedWithSensor);
                      active[21]=1;
                      ends[21]=1;
                      tdone[21]=1;
                    }
                  }
                  else {
                    if(bottleAtPos1.getprestatus()){//sysj\plant.sysj line: 350, column: 13
                      System.out.println("moving bottle at pos 1 to pos 2");//sysj\plant.sysj line: 351, column: 6
                      moveToPos2.setPresent();//sysj\plant.sysj line: 352, column: 6
                      currsigs.addElement(moveToPos2);
                      System.out.println("Table has been aligned");//sysj\plant.sysj line: 355, column: 5
                      tableAlignedWithSensor.setPresent();//sysj\plant.sysj line: 358, column: 6
                      currsigs.addElement(tableAlignedWithSensor);
                      active[21]=1;
                      ends[21]=1;
                      tdone[21]=1;
                    }
                    else {
                      System.out.println("Table has been aligned");//sysj\plant.sysj line: 355, column: 5
                      tableAlignedWithSensor.setPresent();//sysj\plant.sysj line: 358, column: 6
                      currsigs.addElement(tableAlignedWithSensor);
                      active[21]=1;
                      ends[21]=1;
                      tdone[21]=1;
                    }
                  }
                }
              }
              else {
                if(bottleAtPos3.getprestatus()){//sysj\plant.sysj line: 339, column: 13
                  System.out.println("moving bottle at pos 3 to pos 4");//sysj\plant.sysj line: 340, column: 6
                  moveToPos4.setPresent();//sysj\plant.sysj line: 341, column: 6
                  currsigs.addElement(moveToPos4);
                  if(bottleAtPos2.getprestatus()){//sysj\plant.sysj line: 345, column: 13
                    System.out.println("moving bottle at pos 2 to pos 3");//sysj\plant.sysj line: 346, column: 6
                    moveToPos3.setPresent();//sysj\plant.sysj line: 347, column: 6
                    currsigs.addElement(moveToPos3);
                    if(bottleAtPos1.getprestatus()){//sysj\plant.sysj line: 350, column: 13
                      System.out.println("moving bottle at pos 1 to pos 2");//sysj\plant.sysj line: 351, column: 6
                      moveToPos2.setPresent();//sysj\plant.sysj line: 352, column: 6
                      currsigs.addElement(moveToPos2);
                      System.out.println("Table has been aligned");//sysj\plant.sysj line: 355, column: 5
                      tableAlignedWithSensor.setPresent();//sysj\plant.sysj line: 358, column: 6
                      currsigs.addElement(tableAlignedWithSensor);
                      active[21]=1;
                      ends[21]=1;
                      tdone[21]=1;
                    }
                    else {
                      System.out.println("Table has been aligned");//sysj\plant.sysj line: 355, column: 5
                      tableAlignedWithSensor.setPresent();//sysj\plant.sysj line: 358, column: 6
                      currsigs.addElement(tableAlignedWithSensor);
                      active[21]=1;
                      ends[21]=1;
                      tdone[21]=1;
                    }
                  }
                  else {
                    if(bottleAtPos1.getprestatus()){//sysj\plant.sysj line: 350, column: 13
                      System.out.println("moving bottle at pos 1 to pos 2");//sysj\plant.sysj line: 351, column: 6
                      moveToPos2.setPresent();//sysj\plant.sysj line: 352, column: 6
                      currsigs.addElement(moveToPos2);
                      System.out.println("Table has been aligned");//sysj\plant.sysj line: 355, column: 5
                      tableAlignedWithSensor.setPresent();//sysj\plant.sysj line: 358, column: 6
                      currsigs.addElement(tableAlignedWithSensor);
                      active[21]=1;
                      ends[21]=1;
                      tdone[21]=1;
                    }
                    else {
                      System.out.println("Table has been aligned");//sysj\plant.sysj line: 355, column: 5
                      tableAlignedWithSensor.setPresent();//sysj\plant.sysj line: 358, column: 6
                      currsigs.addElement(tableAlignedWithSensor);
                      active[21]=1;
                      ends[21]=1;
                      tdone[21]=1;
                    }
                  }
                }
                else {
                  if(bottleAtPos2.getprestatus()){//sysj\plant.sysj line: 345, column: 13
                    System.out.println("moving bottle at pos 2 to pos 3");//sysj\plant.sysj line: 346, column: 6
                    moveToPos3.setPresent();//sysj\plant.sysj line: 347, column: 6
                    currsigs.addElement(moveToPos3);
                    if(bottleAtPos1.getprestatus()){//sysj\plant.sysj line: 350, column: 13
                      System.out.println("moving bottle at pos 1 to pos 2");//sysj\plant.sysj line: 351, column: 6
                      moveToPos2.setPresent();//sysj\plant.sysj line: 352, column: 6
                      currsigs.addElement(moveToPos2);
                      System.out.println("Table has been aligned");//sysj\plant.sysj line: 355, column: 5
                      tableAlignedWithSensor.setPresent();//sysj\plant.sysj line: 358, column: 6
                      currsigs.addElement(tableAlignedWithSensor);
                      active[21]=1;
                      ends[21]=1;
                      tdone[21]=1;
                    }
                    else {
                      System.out.println("Table has been aligned");//sysj\plant.sysj line: 355, column: 5
                      tableAlignedWithSensor.setPresent();//sysj\plant.sysj line: 358, column: 6
                      currsigs.addElement(tableAlignedWithSensor);
                      active[21]=1;
                      ends[21]=1;
                      tdone[21]=1;
                    }
                  }
                  else {
                    if(bottleAtPos1.getprestatus()){//sysj\plant.sysj line: 350, column: 13
                      System.out.println("moving bottle at pos 1 to pos 2");//sysj\plant.sysj line: 351, column: 6
                      moveToPos2.setPresent();//sysj\plant.sysj line: 352, column: 6
                      currsigs.addElement(moveToPos2);
                      System.out.println("Table has been aligned");//sysj\plant.sysj line: 355, column: 5
                      tableAlignedWithSensor.setPresent();//sysj\plant.sysj line: 358, column: 6
                      currsigs.addElement(tableAlignedWithSensor);
                      active[21]=1;
                      ends[21]=1;
                      tdone[21]=1;
                    }
                    else {
                      System.out.println("Table has been aligned");//sysj\plant.sysj line: 355, column: 5
                      tableAlignedWithSensor.setPresent();//sysj\plant.sysj line: 358, column: 6
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
              S52536=1;
              active[21]=1;
              ends[21]=1;
              tdone[21]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread54703(int [] tdone, int [] ends){
        switch(S52427){
      case 0 : 
        active[20]=0;
        ends[20]=0;
        tdone[20]=1;
        break;
      
      case 1 : 
        switch(S52389){
          case 0 : 
            if(cylClampBottleExtend.getprestatus()){//sysj\plant.sysj line: 313, column: 11
              S52389=1;
              System.out.println("ClampBottle");//sysj\plant.sysj line: 316, column: 6
              cylClampedBottle.setPresent();//sysj\plant.sysj line: 317, column: 6
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
            if(!cylClampBottleExtend.getprestatus()){//sysj\plant.sysj line: 315, column: 12
              S52389=2;
              active[20]=1;
              ends[20]=1;
              tdone[20]=1;
            }
            else {
              cylClampedBottle.setPresent();//sysj\plant.sysj line: 317, column: 6
              currsigs.addElement(cylClampedBottle);
              active[20]=1;
              ends[20]=1;
              tdone[20]=1;
            }
            break;
          
          case 2 : 
            S52389=2;
            S52389=0;
            active[20]=1;
            ends[20]=1;
            tdone[20]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread54702(int [] tdone, int [] ends){
        switch(S52371){
      case 0 : 
        active[19]=0;
        ends[19]=0;
        tdone[19]=1;
        break;
      
      case 1 : 
        switch(S52327){
          case 0 : 
            if(gripperTurnRetract.getprestatus()){//sysj\plant.sysj line: 297, column: 12
              S52327=1;
              if(gripperTurnRetract.getprestatus() && !gripperTurnExtend.getprestatus()){//sysj\plant.sysj line: 301, column: 13
                gripperTurnHomePos.setPresent();//sysj\plant.sysj line: 303, column: 7
                currsigs.addElement(gripperTurnHomePos);
                active[19]=1;
                ends[19]=1;
                tdone[19]=1;
              }
              else {
                S52327=2;
                active[19]=1;
                ends[19]=1;
                tdone[19]=1;
              }
            }
            else {
              gripperTurnFinalPos.setPresent();//sysj\plant.sysj line: 298, column: 7
              currsigs.addElement(gripperTurnFinalPos);
              active[19]=1;
              ends[19]=1;
              tdone[19]=1;
            }
            break;
          
          case 1 : 
            if(gripperTurnExtend.getprestatus()){//sysj\plant.sysj line: 302, column: 12
              S52327=2;
              active[19]=1;
              ends[19]=1;
              tdone[19]=1;
            }
            else {
              gripperTurnHomePos.setPresent();//sysj\plant.sysj line: 303, column: 7
              currsigs.addElement(gripperTurnHomePos);
              active[19]=1;
              ends[19]=1;
              tdone[19]=1;
            }
            break;
          
          case 2 : 
            S52327=2;
            S52327=0;
            if(gripperTurnExtend.getprestatus() && !gripperTurnRetract.getprestatus()){//sysj\plant.sysj line: 296, column: 13
              gripperTurnFinalPos.setPresent();//sysj\plant.sysj line: 298, column: 7
              currsigs.addElement(gripperTurnFinalPos);
              active[19]=1;
              ends[19]=1;
              tdone[19]=1;
            }
            else {
              S52327=1;
              if(gripperTurnRetract.getprestatus() && !gripperTurnExtend.getprestatus()){//sysj\plant.sysj line: 301, column: 13
                gripperTurnHomePos.setPresent();//sysj\plant.sysj line: 303, column: 7
                currsigs.addElement(gripperTurnHomePos);
                active[19]=1;
                ends[19]=1;
                tdone[19]=1;
              }
              else {
                S52327=2;
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

  public void thread54701(int [] tdone, int [] ends){
        switch(S52306){
      case 0 : 
        active[18]=0;
        ends[18]=0;
        tdone[18]=1;
        break;
      
      case 1 : 
        switch(S52196){
          case 0 : 
            if(capGripperPos5Extend.getprestatus()){//sysj\plant.sysj line: 284, column: 11
              S52196=1;
              __start_thread_18 = com.systemj.Timer.getMs();//sysj\plant.sysj line: 283, column: 4
              if(com.systemj.Timer.getMs() - __start_thread_18 >= (3) * 1000){//sysj\plant.sysj line: 283, column: 4
                ends[18]=2;
                ;//sysj\plant.sysj line: 283, column: 4
                S52196=2;
                gripperGrippedCap.setPresent();//sysj\plant.sysj line: 287, column: 6
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
            }
            else {
              active[18]=1;
              ends[18]=1;
              tdone[18]=1;
            }
            break;
          
          case 1 : 
            if(com.systemj.Timer.getMs() - __start_thread_18 >= (3) * 1000){//sysj\plant.sysj line: 283, column: 4
              ends[18]=2;
              ;//sysj\plant.sysj line: 283, column: 4
              S52196=2;
              gripperGrippedCap.setPresent();//sysj\plant.sysj line: 287, column: 6
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
          
          case 2 : 
            if(!capGripperPos5Extend.getprestatus()){//sysj\plant.sysj line: 286, column: 11
              S52196=3;
              active[18]=1;
              ends[18]=1;
              tdone[18]=1;
            }
            else {
              gripperGrippedCap.setPresent();//sysj\plant.sysj line: 287, column: 6
              currsigs.addElement(gripperGrippedCap);
              active[18]=1;
              ends[18]=1;
              tdone[18]=1;
            }
            break;
          
          case 3 : 
            S52196=3;
            S52196=0;
            active[18]=1;
            ends[18]=1;
            tdone[18]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread54700(int [] tdone, int [] ends){
        switch(S52166){
      case 0 : 
        active[17]=0;
        ends[17]=0;
        tdone[17]=1;
        break;
      
      case 1 : 
        switch(S52098){
          case 0 : 
            if(cylPos5ZAxisExtend.getprestatus()){//sysj\plant.sysj line: 268, column: 11
              System.out.println("Gipper Tranistion");//sysj\plant.sysj line: 272, column: 5
              S52098=1;
              System.out.println("gripper lowered");//sysj\plant.sysj line: 274, column: 6
              gripperZAxisLowered.setPresent();//sysj\plant.sysj line: 275, column: 6
              currsigs.addElement(gripperZAxisLowered);
              active[17]=1;
              ends[17]=1;
              tdone[17]=1;
            }
            else {
              gripperZAxisLifted.setPresent();//sysj\plant.sysj line: 270, column: 6
              currsigs.addElement(gripperZAxisLifted);
              active[17]=1;
              ends[17]=1;
              tdone[17]=1;
            }
            break;
          
          case 1 : 
            if(!cylPos5ZAxisExtend.getprestatus()){//sysj\plant.sysj line: 273, column: 11
              S52098=2;
              active[17]=1;
              ends[17]=1;
              tdone[17]=1;
            }
            else {
              gripperZAxisLowered.setPresent();//sysj\plant.sysj line: 275, column: 6
              currsigs.addElement(gripperZAxisLowered);
              active[17]=1;
              ends[17]=1;
              tdone[17]=1;
            }
            break;
          
          case 2 : 
            S52098=2;
            S52098=0;
            System.out.println("Gripper Extended");//sysj\plant.sysj line: 269, column: 6
            gripperZAxisLifted.setPresent();//sysj\plant.sysj line: 270, column: 6
            currsigs.addElement(gripperZAxisLifted);
            active[17]=1;
            ends[17]=1;
            tdone[17]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread54699(int [] tdone, int [] ends){
        switch(S52089){
      case 0 : 
        active[16]=0;
        ends[16]=0;
        tdone[16]=1;
        break;
      
      case 1 : 
        switch(S52067){
          case 0 : 
            if(moveToPos4.getprestatus()){//sysj\plant.sysj line: 257, column: 11
              S52067=1;
              bottleAtPos4.setPresent();//sysj\plant.sysj line: 259, column: 6
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
            if(moveToPos5.getprestatus()){//sysj\plant.sysj line: 258, column: 11
              S52067=2;
              active[16]=1;
              ends[16]=1;
              tdone[16]=1;
            }
            else {
              bottleAtPos4.setPresent();//sysj\plant.sysj line: 259, column: 6
              currsigs.addElement(bottleAtPos4);
              active[16]=1;
              ends[16]=1;
              tdone[16]=1;
            }
            break;
          
          case 2 : 
            S52067=2;
            S52067=0;
            active[16]=1;
            ends[16]=1;
            tdone[16]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread54698(int [] tdone, int [] ends){
        switch(S52057){
      case 0 : 
        active[15]=0;
        ends[15]=0;
        tdone[15]=1;
        break;
      
      case 1 : 
        if(capDec_1.getprestatus()){//sysj\plant.sysj line: 241, column: 12
          if(capcount_thread_15 > 0) {//sysj\plant.sysj line: 242, column: 5
            capcount_thread_15 = capcount_thread_15 - 1;//sysj\plant.sysj line: 243, column: 6
          }
          if(magReq.getprestatus()){//sysj\plant.sysj line: 245, column: 12
            capcount_thread_15 = 5;//sysj\plant.sysj line: 246, column: 5
            if(capcount_thread_15 == 0){//sysj\plant.sysj line: 248, column: 7
              magEmpty.setPresent();//sysj\plant.sysj line: 248, column: 22
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
            if(capcount_thread_15 == 0){//sysj\plant.sysj line: 248, column: 7
              magEmpty.setPresent();//sysj\plant.sysj line: 248, column: 22
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
          if(magReq.getprestatus()){//sysj\plant.sysj line: 245, column: 12
            capcount_thread_15 = 5;//sysj\plant.sysj line: 246, column: 5
            if(capcount_thread_15 == 0){//sysj\plant.sysj line: 248, column: 7
              magEmpty.setPresent();//sysj\plant.sysj line: 248, column: 22
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
            if(capcount_thread_15 == 0){//sysj\plant.sysj line: 248, column: 7
              magEmpty.setPresent();//sysj\plant.sysj line: 248, column: 22
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

  public void thread54697(int [] tdone, int [] ends){
        switch(S51995){
      case 0 : 
        active[14]=0;
        ends[14]=0;
        tdone[14]=1;
        break;
      
      case 1 : 
        switch(S51949){
          case 0 : 
            if(magEmpty.getprestatus()){//sysj\plant.sysj line: 223, column: 10
              S51949=1;
              active[14]=1;
              ends[14]=1;
              tdone[14]=1;
            }
            else {
              switch(S51931){
                case 0 : 
                  if(pusherRetracted.getprestatus()){//sysj\plant.sysj line: 225, column: 13
                    S51931=1;
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
                  if(pusherExtended.getprestatus()){//sysj\plant.sysj line: 226, column: 13
                    S51931=2;
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
                  if(pusherRetracted.getprestatus()){//sysj\plant.sysj line: 227, column: 13
                    capDec_1.setPresent();//sysj\plant.sysj line: 228, column: 7
                    currsigs.addElement(capDec_1);
                    S51931=3;
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
                  S51931=3;
                  S51931=0;
                  active[14]=1;
                  ends[14]=1;
                  tdone[14]=1;
                  break;
                
              }
            }
            break;
          
          case 1 : 
            if(magReq.getprestatus()){//sysj\plant.sysj line: 232, column: 10
              S51949=2;
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
            S51949=2;
            S51949=0;
            S51931=0;
            active[14]=1;
            ends[14]=1;
            tdone[14]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread54696(int [] tdone, int [] ends){
        switch(S51927){
      case 0 : 
        active[13]=0;
        ends[13]=0;
        tdone[13]=1;
        break;
      
      case 1 : 
        switch(S51913){
          case 0 : 
            if(magEmpty.getprestatus() || !vacOn.getprestatus()){//sysj\plant.sysj line: 213, column: 11
              S51913=1;
              active[13]=1;
              ends[13]=1;
              tdone[13]=1;
            }
            else {
              WPgripped.setPresent();//sysj\plant.sysj line: 214, column: 6
              currsigs.addElement(WPgripped);
              active[13]=1;
              ends[13]=1;
              tdone[13]=1;
            }
            break;
          
          case 1 : 
            S51913=1;
            S51913=0;
            if(vacOn.getprestatus() && armAtSource.getprestatus()){//sysj\plant.sysj line: 212, column: 12
              WPgripped.setPresent();//sysj\plant.sysj line: 214, column: 6
              currsigs.addElement(WPgripped);
              active[13]=1;
              ends[13]=1;
              tdone[13]=1;
            }
            else {
              S51913=1;
              active[13]=1;
              ends[13]=1;
              tdone[13]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread54695(int [] tdone, int [] ends){
        switch(S51907){
      case 0 : 
        active[12]=0;
        ends[12]=0;
        tdone[12]=1;
        break;
      
      case 1 : 
        switch(S51791){
          case 0 : 
            if(pusherExtend.getprestatus()){//sysj\plant.sysj line: 198, column: 10
              S51791=1;
              __start_thread_12 = com.systemj.Timer.getMs();//sysj\plant.sysj line: 197, column: 3
              if(com.systemj.Timer.getMs() - __start_thread_12 >= (3) * 1000){//sysj\plant.sysj line: 197, column: 3
                ends[12]=2;
                ;//sysj\plant.sysj line: 197, column: 3
                S51791=2;
                pusherExtended.setPresent();//sysj\plant.sysj line: 204, column: 5
                currsigs.addElement(pusherExtended);
                active[12]=1;
                ends[12]=1;
                tdone[12]=1;
              }
              else {
                active[12]=1;
                ends[12]=1;
                tdone[12]=1;
              }
            }
            else {
              pusherRetracted.setPresent();//sysj\plant.sysj line: 199, column: 5
              currsigs.addElement(pusherRetracted);
              active[12]=1;
              ends[12]=1;
              tdone[12]=1;
            }
            break;
          
          case 1 : 
            if(com.systemj.Timer.getMs() - __start_thread_12 >= (3) * 1000){//sysj\plant.sysj line: 197, column: 3
              ends[12]=2;
              ;//sysj\plant.sysj line: 197, column: 3
              S51791=2;
              pusherExtended.setPresent();//sysj\plant.sysj line: 204, column: 5
              currsigs.addElement(pusherExtended);
              active[12]=1;
              ends[12]=1;
              tdone[12]=1;
            }
            else {
              active[12]=1;
              ends[12]=1;
              tdone[12]=1;
            }
            break;
          
          case 2 : 
            if(!pusherExtend.getprestatus()){//sysj\plant.sysj line: 203, column: 10
              S51791=3;
              active[12]=1;
              ends[12]=1;
              tdone[12]=1;
            }
            else {
              pusherExtended.setPresent();//sysj\plant.sysj line: 204, column: 5
              currsigs.addElement(pusherExtended);
              active[12]=1;
              ends[12]=1;
              tdone[12]=1;
            }
            break;
          
          case 3 : 
            S51791=3;
            S51791=0;
            pusherRetracted.setPresent();//sysj\plant.sysj line: 199, column: 5
            currsigs.addElement(pusherRetracted);
            active[12]=1;
            ends[12]=1;
            tdone[12]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread54694(int [] tdone, int [] ends){
        switch(S51758){
      case 0 : 
        active[11]=0;
        ends[11]=0;
        tdone[11]=1;
        break;
      
      case 1 : 
        switch(S51714){
          case 0 : 
            if(armDest.getprestatus()){//sysj\plant.sysj line: 183, column: 12
              S51714=1;
              if(armDest.getprestatus() && !armSource.getprestatus()){//sysj\plant.sysj line: 187, column: 12
                armAtDest.setPresent();//sysj\plant.sysj line: 189, column: 6
                currsigs.addElement(armAtDest);
                active[11]=1;
                ends[11]=1;
                tdone[11]=1;
              }
              else {
                S51714=2;
                active[11]=1;
                ends[11]=1;
                tdone[11]=1;
              }
            }
            else {
              armAtSource.setPresent();//sysj\plant.sysj line: 184, column: 6
              currsigs.addElement(armAtSource);
              active[11]=1;
              ends[11]=1;
              tdone[11]=1;
            }
            break;
          
          case 1 : 
            if(armSource.getprestatus()){//sysj\plant.sysj line: 188, column: 12
              S51714=2;
              active[11]=1;
              ends[11]=1;
              tdone[11]=1;
            }
            else {
              armAtDest.setPresent();//sysj\plant.sysj line: 189, column: 6
              currsigs.addElement(armAtDest);
              active[11]=1;
              ends[11]=1;
              tdone[11]=1;
            }
            break;
          
          case 2 : 
            S51714=2;
            S51714=0;
            if(armSource.getprestatus() && !armDest.getprestatus()){//sysj\plant.sysj line: 182, column: 12
              armAtSource.setPresent();//sysj\plant.sysj line: 184, column: 6
              currsigs.addElement(armAtSource);
              active[11]=1;
              ends[11]=1;
              tdone[11]=1;
            }
            else {
              S51714=1;
              if(armDest.getprestatus() && !armSource.getprestatus()){//sysj\plant.sysj line: 187, column: 12
                armAtDest.setPresent();//sysj\plant.sysj line: 189, column: 6
                currsigs.addElement(armAtDest);
                active[11]=1;
                ends[11]=1;
                tdone[11]=1;
              }
              else {
                S51714=2;
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

  public void thread54692(int [] tdone, int [] ends){
        switch(S51691){
      case 0 : 
        active[10]=0;
        ends[10]=0;
        tdone[10]=1;
        break;
      
      case 1 : 
        switch(S51617){
          case 0 : 
            if(dosUnitValveRetract.getprestatus()){//sysj\plant.sysj line: 159, column: 13
              S51617=1;
              if(dosUnitValveRetract.getprestatus() && !dosUnitValveExtend.getprestatus()){//sysj\plant.sysj line: 163, column: 13
                System.out.println("FillerPlant: Filling with canister " + (canister_1.getpreval() == null ? 0 : ((Integer)canister_1.getpreval()).intValue()) + " Percent: " + (percent_1.getpreval() == null ? 0 : ((Integer)percent_1.getpreval()).intValue()));//sysj\plant.sysj line: 164, column: 6
                dosUnitFilled.setPresent();//sysj\plant.sysj line: 166, column: 7
                currsigs.addElement(dosUnitFilled);
                active[10]=1;
                ends[10]=1;
                tdone[10]=1;
              }
              else {
                S51617=2;
                active[10]=1;
                ends[10]=1;
                tdone[10]=1;
              }
            }
            else {
              dosUnitEvac.setPresent();//sysj\plant.sysj line: 160, column: 7
              currsigs.addElement(dosUnitEvac);
              active[10]=1;
              ends[10]=1;
              tdone[10]=1;
            }
            break;
          
          case 1 : 
            if(dosUnitValveExtend.getprestatus()){//sysj\plant.sysj line: 165, column: 13
              S51617=2;
              active[10]=1;
              ends[10]=1;
              tdone[10]=1;
            }
            else {
              dosUnitFilled.setPresent();//sysj\plant.sysj line: 166, column: 7
              currsigs.addElement(dosUnitFilled);
              active[10]=1;
              ends[10]=1;
              tdone[10]=1;
            }
            break;
          
          case 2 : 
            S51617=2;
            S51617=0;
            if(dosUnitValveExtend.getprestatus() && !dosUnitValveRetract.getprestatus()){//sysj\plant.sysj line: 158, column: 13
              dosUnitEvac.setPresent();//sysj\plant.sysj line: 160, column: 7
              currsigs.addElement(dosUnitEvac);
              active[10]=1;
              ends[10]=1;
              tdone[10]=1;
            }
            else {
              S51617=1;
              if(dosUnitValveRetract.getprestatus() && !dosUnitValveExtend.getprestatus()){//sysj\plant.sysj line: 163, column: 13
                System.out.println("FillerPlant: Filling with canister " + (canister_1.getpreval() == null ? 0 : ((Integer)canister_1.getpreval()).intValue()) + " Percent: " + (percent_1.getpreval() == null ? 0 : ((Integer)percent_1.getpreval()).intValue()));//sysj\plant.sysj line: 164, column: 6
                dosUnitFilled.setPresent();//sysj\plant.sysj line: 166, column: 7
                currsigs.addElement(dosUnitFilled);
                active[10]=1;
                ends[10]=1;
                tdone[10]=1;
              }
              else {
                S51617=2;
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

  public void thread54691(int [] tdone, int [] ends){
        switch(S51581){
      case 0 : 
        active[9]=0;
        ends[9]=0;
        tdone[9]=1;
        break;
      
      case 1 : 
        switch(S51567){
          case 0 : 
            if(!valveInjectorOnOff.getprestatus()){//sysj\plant.sysj line: 147, column: 12
              S51567=1;
              active[9]=1;
              ends[9]=1;
              tdone[9]=1;
            }
            else {
              valveInjectorActive.setPresent();//sysj\plant.sysj line: 148, column: 7
              currsigs.addElement(valveInjectorActive);
              active[9]=1;
              ends[9]=1;
              tdone[9]=1;
            }
            break;
          
          case 1 : 
            S51567=1;
            S51567=0;
            if(valveInjectorOnOff.getprestatus()){//sysj\plant.sysj line: 146, column: 13
              valveInjectorActive.setPresent();//sysj\plant.sysj line: 148, column: 7
              currsigs.addElement(valveInjectorActive);
              active[9]=1;
              ends[9]=1;
              tdone[9]=1;
            }
            else {
              S51567=1;
              active[9]=1;
              ends[9]=1;
              tdone[9]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread54690(int [] tdone, int [] ends){
        switch(S51561){
      case 0 : 
        active[8]=0;
        ends[8]=0;
        tdone[8]=1;
        break;
      
      case 1 : 
        switch(S51555){
          case 0 : 
            if(selectPercentage.getprestatus()){//sysj\plant.sysj line: 137, column: 11
              percent_1.setPresent();//sysj\plant.sysj line: 138, column: 5
              currsigs.addElement(percent_1);
              percent_1.setValue((selectPercentage.getpreval() == null ? null : ((Integer)selectPercentage.getpreval())));//sysj\plant.sysj line: 138, column: 5
              selectedPercentage.setPresent();//sysj\plant.sysj line: 139, column: 5
              currsigs.addElement(selectedPercentage);
              selectedPercentage.setValue((selectPercentage.getpreval() == null ? null : ((Integer)selectPercentage.getpreval())));//sysj\plant.sysj line: 139, column: 5
              S51555=1;
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
            S51555=1;
            S51555=0;
            active[8]=1;
            ends[8]=1;
            tdone[8]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread54689(int [] tdone, int [] ends){
        switch(S51553){
      case 0 : 
        active[7]=0;
        ends[7]=0;
        tdone[7]=1;
        break;
      
      case 1 : 
        switch(S51491){
          case 0 : 
            if(selectCanister.getprestatus()){//sysj\plant.sysj line: 126, column: 11
              S51491=1;
              __start_thread_7 = com.systemj.Timer.getMs();//sysj\plant.sysj line: 124, column: 4
              if(com.systemj.Timer.getMs() - __start_thread_7 >= (1) * 1000){//sysj\plant.sysj line: 124, column: 4
                ends[7]=2;
                ;//sysj\plant.sysj line: 124, column: 4
                canister_1.setPresent();//sysj\plant.sysj line: 128, column: 5
                currsigs.addElement(canister_1);
                canister_1.setValue((selectCanister.getpreval() == null ? null : ((Integer)selectCanister.getpreval())));//sysj\plant.sysj line: 128, column: 5
                selectedCanister.setPresent();//sysj\plant.sysj line: 129, column: 5
                currsigs.addElement(selectedCanister);
                selectedCanister.setValue((selectCanister.getpreval() == null ? null : ((Integer)selectCanister.getpreval())));//sysj\plant.sysj line: 129, column: 5
                S51491=2;
                active[7]=1;
                ends[7]=1;
                tdone[7]=1;
              }
              else {
                active[7]=1;
                ends[7]=1;
                tdone[7]=1;
              }
            }
            else {
              active[7]=1;
              ends[7]=1;
              tdone[7]=1;
            }
            break;
          
          case 1 : 
            if(com.systemj.Timer.getMs() - __start_thread_7 >= (1) * 1000){//sysj\plant.sysj line: 124, column: 4
              ends[7]=2;
              ;//sysj\plant.sysj line: 124, column: 4
              canister_1.setPresent();//sysj\plant.sysj line: 128, column: 5
              currsigs.addElement(canister_1);
              canister_1.setValue((selectCanister.getpreval() == null ? null : ((Integer)selectCanister.getpreval())));//sysj\plant.sysj line: 128, column: 5
              selectedCanister.setPresent();//sysj\plant.sysj line: 129, column: 5
              currsigs.addElement(selectedCanister);
              selectedCanister.setValue((selectCanister.getpreval() == null ? null : ((Integer)selectCanister.getpreval())));//sysj\plant.sysj line: 129, column: 5
              S51491=2;
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
          
          case 2 : 
            S51491=2;
            S51491=0;
            active[7]=1;
            ends[7]=1;
            tdone[7]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread54688(int [] tdone, int [] ends){
        switch(S51693){
      case 0 : 
        active[6]=0;
        ends[6]=0;
        tdone[6]=1;
        break;
      
      case 1 : 
        canister_1.setClear();//sysj\plant.sysj line: 121, column: 3
        percent_1.setClear();//sysj\plant.sysj line: 122, column: 3
        thread54689(tdone,ends);
        thread54690(tdone,ends);
        thread54691(tdone,ends);
        thread54692(tdone,ends);
        int biggest54693 = 0;
        if(ends[7]>=biggest54693){
          biggest54693=ends[7];
        }
        if(ends[8]>=biggest54693){
          biggest54693=ends[8];
        }
        if(ends[9]>=biggest54693){
          biggest54693=ends[9];
        }
        if(ends[10]>=biggest54693){
          biggest54693=ends[10];
        }
        if(biggest54693 == 1){
          active[6]=1;
          ends[6]=1;
          tdone[6]=1;
        }
        //FINXME code
        if(biggest54693 == 0){
          S51693=0;
          active[6]=0;
          ends[6]=0;
          tdone[6]=1;
        }
        break;
      
    }
  }

  public void thread54687(int [] tdone, int [] ends){
        switch(S51459){
      case 0 : 
        active[5]=0;
        ends[5]=0;
        tdone[5]=1;
        break;
      
      case 1 : 
        if(bottleAtPos1.getprestatus()){//sysj\plant.sysj line: 108, column: 12
          RTbottleAtPos1.setPresent();//sysj\plant.sysj line: 110, column: 5
          currsigs.addElement(RTbottleAtPos1);
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

  public void thread54685(int [] tdone, int [] ends){
        S51148=1;
    if(motorPos5On.getprestatus()){//sysj\plant.sysj line: 90, column: 14
      System.out.println("Conveyor Plant - moving bottle to leave 5");//sysj\plant.sysj line: 91, column: 7
      bottleLeftPos5.setPresent();//sysj\plant.sysj line: 93, column: 8
      currsigs.addElement(bottleLeftPos5);
      active[4]=1;
      ends[4]=1;
      tdone[4]=1;
    }
    else {
      S51148=0;
      active[4]=0;
      ends[4]=0;
      tdone[4]=1;
    }
  }

  public void thread54684(int [] tdone, int [] ends){
        S51136=1;
    if(motorPos1On.getprestatus()){//sysj\plant.sysj line: 81, column: 14
      System.out.println("Conveyor plant - moving bottle to 1");//sysj\plant.sysj line: 82, column: 7
      bottleAtPos1.setPresent();//sysj\plant.sysj line: 84, column: 8
      currsigs.addElement(bottleAtPos1);
      active[3]=1;
      ends[3]=1;
      tdone[3]=1;
    }
    else {
      S51136=0;
      active[3]=0;
      ends[3]=0;
      tdone[3]=1;
    }
  }

  public void thread54682(int [] tdone, int [] ends){
        switch(S51148){
      case 0 : 
        active[4]=0;
        ends[4]=0;
        tdone[4]=1;
        break;
      
      case 1 : 
        if(!motorPos5On.getprestatus() && !motConveyorOnOff.getprestatus()){//sysj\plant.sysj line: 92, column: 13
          S51148=0;
          active[4]=0;
          ends[4]=0;
          tdone[4]=1;
        }
        else {
          bottleLeftPos5.setPresent();//sysj\plant.sysj line: 93, column: 8
          currsigs.addElement(bottleLeftPos5);
          active[4]=1;
          ends[4]=1;
          tdone[4]=1;
        }
        break;
      
    }
  }

  public void thread54681(int [] tdone, int [] ends){
        switch(S51136){
      case 0 : 
        active[3]=0;
        ends[3]=0;
        tdone[3]=1;
        break;
      
      case 1 : 
        if(moveToPos2.getprestatus()){//sysj\plant.sysj line: 83, column: 13
          S51136=0;
          active[3]=0;
          ends[3]=0;
          tdone[3]=1;
        }
        else {
          bottleAtPos1.setPresent();//sysj\plant.sysj line: 84, column: 8
          currsigs.addElement(bottleAtPos1);
          active[3]=1;
          ends[3]=1;
          tdone[3]=1;
        }
        break;
      
    }
  }

  public void thread54679(int [] tdone, int [] ends){
        S51148=1;
    if(motorPos5On.getprestatus()){//sysj\plant.sysj line: 90, column: 14
      System.out.println("Conveyor Plant - moving bottle to leave 5");//sysj\plant.sysj line: 91, column: 7
      bottleLeftPos5.setPresent();//sysj\plant.sysj line: 93, column: 8
      currsigs.addElement(bottleLeftPos5);
      active[4]=1;
      ends[4]=1;
      tdone[4]=1;
    }
    else {
      S51148=0;
      active[4]=0;
      ends[4]=0;
      tdone[4]=1;
    }
  }

  public void thread54678(int [] tdone, int [] ends){
        S51136=1;
    if(motorPos1On.getprestatus()){//sysj\plant.sysj line: 81, column: 14
      System.out.println("Conveyor plant - moving bottle to 1");//sysj\plant.sysj line: 82, column: 7
      bottleAtPos1.setPresent();//sysj\plant.sysj line: 84, column: 8
      currsigs.addElement(bottleAtPos1);
      active[3]=1;
      ends[3]=1;
      tdone[3]=1;
    }
    else {
      S51136=0;
      active[3]=0;
      ends[3]=0;
      tdone[3]=1;
    }
  }

  public void thread54676(int [] tdone, int [] ends){
        S51148=1;
    if(motorPos5On.getprestatus()){//sysj\plant.sysj line: 90, column: 14
      System.out.println("Conveyor Plant - moving bottle to leave 5");//sysj\plant.sysj line: 91, column: 7
      bottleLeftPos5.setPresent();//sysj\plant.sysj line: 93, column: 8
      currsigs.addElement(bottleLeftPos5);
      active[4]=1;
      ends[4]=1;
      tdone[4]=1;
    }
    else {
      S51148=0;
      active[4]=0;
      ends[4]=0;
      tdone[4]=1;
    }
  }

  public void thread54675(int [] tdone, int [] ends){
        S51136=1;
    if(motorPos1On.getprestatus()){//sysj\plant.sysj line: 81, column: 14
      System.out.println("Conveyor plant - moving bottle to 1");//sysj\plant.sysj line: 82, column: 7
      bottleAtPos1.setPresent();//sysj\plant.sysj line: 84, column: 8
      currsigs.addElement(bottleAtPos1);
      active[3]=1;
      ends[3]=1;
      tdone[3]=1;
    }
    else {
      S51136=0;
      active[3]=0;
      ends[3]=0;
      tdone[3]=1;
    }
  }

  public void thread54674(int [] tdone, int [] ends){
        switch(S51451){
      case 0 : 
        active[2]=0;
        ends[2]=0;
        tdone[2]=1;
        break;
      
      case 1 : 
        switch(S51223){
          case 0 : 
            switch(S51221){
              case 0 : 
                switch(S51112){
                  case 0 : 
                    S51112=0;
                    if(com.systemj.Timer.getMs() - __start_thread_2 >= (3) * 1000){//sysj\plant.sysj line: 78, column: 29
                      ends[2]=2;
                      ;//sysj\plant.sysj line: 78, column: 29
                      S51221=1;
                      thread54675(tdone,ends);
                      thread54676(tdone,ends);
                      int biggest54677 = 0;
                      if(ends[3]>=biggest54677){
                        biggest54677=ends[3];
                      }
                      if(ends[4]>=biggest54677){
                        biggest54677=ends[4];
                      }
                      if(biggest54677 == 1){
                        active[2]=1;
                        ends[2]=1;
                        tdone[2]=1;
                      }
                      //FINXME code
                      if(biggest54677 == 0){
                        S51223=1;
                        active[2]=1;
                        ends[2]=1;
                        tdone[2]=1;
                      }
                    }
                    else {
                      S51112=1;
                      active[2]=1;
                      ends[2]=1;
                      tdone[2]=1;
                    }
                    break;
                  
                  case 1 : 
                    S51112=1;
                    S51112=0;
                    if(com.systemj.Timer.getMs() - __start_thread_2 >= (3) * 1000){//sysj\plant.sysj line: 78, column: 29
                      ends[2]=2;
                      ;//sysj\plant.sysj line: 78, column: 29
                      S51221=1;
                      thread54678(tdone,ends);
                      thread54679(tdone,ends);
                      int biggest54680 = 0;
                      if(ends[3]>=biggest54680){
                        biggest54680=ends[3];
                      }
                      if(ends[4]>=biggest54680){
                        biggest54680=ends[4];
                      }
                      if(biggest54680 == 1){
                        active[2]=1;
                        ends[2]=1;
                        tdone[2]=1;
                      }
                      //FINXME code
                      if(biggest54680 == 0){
                        S51223=1;
                        active[2]=1;
                        ends[2]=1;
                        tdone[2]=1;
                      }
                    }
                    else {
                      S51112=1;
                      active[2]=1;
                      ends[2]=1;
                      tdone[2]=1;
                    }
                    break;
                  
                }
                break;
              
              case 1 : 
                thread54681(tdone,ends);
                thread54682(tdone,ends);
                int biggest54683 = 0;
                if(ends[3]>=biggest54683){
                  biggest54683=ends[3];
                }
                if(ends[4]>=biggest54683){
                  biggest54683=ends[4];
                }
                if(biggest54683 == 1){
                  active[2]=1;
                  ends[2]=1;
                  tdone[2]=1;
                }
                //FINXME code
                if(biggest54683 == 0){
                  S51223=1;
                  active[2]=1;
                  ends[2]=1;
                  tdone[2]=1;
                }
                break;
              
            }
            break;
          
          case 1 : 
            S51223=1;
            S51223=0;
            if(motConveyorOnOff.getprestatus()){//sysj\plant.sysj line: 78, column: 12
              S51221=0;
              __start_thread_2 = com.systemj.Timer.getMs();//sysj\plant.sysj line: 78, column: 29
              S51112=0;
              if(com.systemj.Timer.getMs() - __start_thread_2 >= (3) * 1000){//sysj\plant.sysj line: 78, column: 29
                ends[2]=2;
                ;//sysj\plant.sysj line: 78, column: 29
                S51221=1;
                thread54684(tdone,ends);
                thread54685(tdone,ends);
                int biggest54686 = 0;
                if(ends[3]>=biggest54686){
                  biggest54686=ends[3];
                }
                if(ends[4]>=biggest54686){
                  biggest54686=ends[4];
                }
                if(biggest54686 == 1){
                  active[2]=1;
                  ends[2]=1;
                  tdone[2]=1;
                }
                //FINXME code
                if(biggest54686 == 0){
                  S51223=1;
                  active[2]=1;
                  ends[2]=1;
                  tdone[2]=1;
                }
              }
              else {
                S51112=1;
                active[2]=1;
                ends[2]=1;
                tdone[2]=1;
              }
            }
            else {
              S51223=1;
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread54672(int [] tdone, int [] ends){
        S52875=1;
    S52855=0;
    if(moveToPos2.getprestatus()){//sysj\plant.sysj line: 383, column: 24
      System.out.println("bottle is now at pos 2");//sysj\plant.sysj line: 383, column: 36
      bottleAtPos2.setPresent();//sysj\plant.sysj line: 383, column: 82
      currsigs.addElement(bottleAtPos2);
      active[25]=1;
      ends[25]=1;
      tdone[25]=1;
    }
    else {
      S52855=1;
      active[25]=1;
      ends[25]=1;
      tdone[25]=1;
    }
  }

  public void thread54671(int [] tdone, int [] ends){
        S52846=1;
    S52826=0;
    if(moveToPos3.getprestatus()){//sysj\plant.sysj line: 381, column: 24
      System.out.println("bottle is now at pos 3");//sysj\plant.sysj line: 381, column: 36
      bottleAtPos3.setPresent();//sysj\plant.sysj line: 381, column: 82
      currsigs.addElement(bottleAtPos3);
      active[24]=1;
      ends[24]=1;
      tdone[24]=1;
    }
    else {
      S52826=1;
      active[24]=1;
      ends[24]=1;
      tdone[24]=1;
    }
  }

  public void thread54670(int [] tdone, int [] ends){
        S52817=1;
    S52797=0;
    if(moveToPos4.getprestatus()){//sysj\plant.sysj line: 379, column: 24
      System.out.println("bottle is now at pos 4");//sysj\plant.sysj line: 379, column: 36
      bottleAtPos4.setPresent();//sysj\plant.sysj line: 379, column: 82
      currsigs.addElement(bottleAtPos4);
      active[23]=1;
      ends[23]=1;
      tdone[23]=1;
    }
    else {
      S52797=1;
      active[23]=1;
      ends[23]=1;
      tdone[23]=1;
    }
  }

  public void thread54669(int [] tdone, int [] ends){
        S52788=1;
    S52766=0;
    if(moveToPos5.getprestatus()){//sysj\plant.sysj line: 370, column: 13
      System.out.println("bottle is now at pos 5");//sysj\plant.sysj line: 371, column: 6
      bottleAtPos5.setPresent();//sysj\plant.sysj line: 372, column: 6
      currsigs.addElement(bottleAtPos5);
      active[22]=1;
      ends[22]=1;
      tdone[22]=1;
    }
    else {
      S52766=1;
      active[22]=1;
      ends[22]=1;
      tdone[22]=1;
    }
  }

  public void thread54668(int [] tdone, int [] ends){
        S52756=1;
    S52536=0;
    if(rotaryTableTrigger.getprestatus()){//sysj\plant.sysj line: 326, column: 12
      System.out.println("table triggered now moving");//sysj\plant.sysj line: 330, column: 5
      if(bottleAtPos4.getprestatus()){//sysj\plant.sysj line: 333, column: 13
        System.out.println("moving bottle at pos 4 to pos 5");//sysj\plant.sysj line: 334, column: 6
        moveToPos5.setPresent();//sysj\plant.sysj line: 335, column: 6
        currsigs.addElement(moveToPos5);
        if(bottleAtPos3.getprestatus()){//sysj\plant.sysj line: 339, column: 13
          System.out.println("moving bottle at pos 3 to pos 4");//sysj\plant.sysj line: 340, column: 6
          moveToPos4.setPresent();//sysj\plant.sysj line: 341, column: 6
          currsigs.addElement(moveToPos4);
          if(bottleAtPos2.getprestatus()){//sysj\plant.sysj line: 345, column: 13
            System.out.println("moving bottle at pos 2 to pos 3");//sysj\plant.sysj line: 346, column: 6
            moveToPos3.setPresent();//sysj\plant.sysj line: 347, column: 6
            currsigs.addElement(moveToPos3);
            if(bottleAtPos1.getprestatus()){//sysj\plant.sysj line: 350, column: 13
              System.out.println("moving bottle at pos 1 to pos 2");//sysj\plant.sysj line: 351, column: 6
              moveToPos2.setPresent();//sysj\plant.sysj line: 352, column: 6
              currsigs.addElement(moveToPos2);
              System.out.println("Table has been aligned");//sysj\plant.sysj line: 355, column: 5
              tableAlignedWithSensor.setPresent();//sysj\plant.sysj line: 358, column: 6
              currsigs.addElement(tableAlignedWithSensor);
              active[21]=1;
              ends[21]=1;
              tdone[21]=1;
            }
            else {
              System.out.println("Table has been aligned");//sysj\plant.sysj line: 355, column: 5
              tableAlignedWithSensor.setPresent();//sysj\plant.sysj line: 358, column: 6
              currsigs.addElement(tableAlignedWithSensor);
              active[21]=1;
              ends[21]=1;
              tdone[21]=1;
            }
          }
          else {
            if(bottleAtPos1.getprestatus()){//sysj\plant.sysj line: 350, column: 13
              System.out.println("moving bottle at pos 1 to pos 2");//sysj\plant.sysj line: 351, column: 6
              moveToPos2.setPresent();//sysj\plant.sysj line: 352, column: 6
              currsigs.addElement(moveToPos2);
              System.out.println("Table has been aligned");//sysj\plant.sysj line: 355, column: 5
              tableAlignedWithSensor.setPresent();//sysj\plant.sysj line: 358, column: 6
              currsigs.addElement(tableAlignedWithSensor);
              active[21]=1;
              ends[21]=1;
              tdone[21]=1;
            }
            else {
              System.out.println("Table has been aligned");//sysj\plant.sysj line: 355, column: 5
              tableAlignedWithSensor.setPresent();//sysj\plant.sysj line: 358, column: 6
              currsigs.addElement(tableAlignedWithSensor);
              active[21]=1;
              ends[21]=1;
              tdone[21]=1;
            }
          }
        }
        else {
          if(bottleAtPos2.getprestatus()){//sysj\plant.sysj line: 345, column: 13
            System.out.println("moving bottle at pos 2 to pos 3");//sysj\plant.sysj line: 346, column: 6
            moveToPos3.setPresent();//sysj\plant.sysj line: 347, column: 6
            currsigs.addElement(moveToPos3);
            if(bottleAtPos1.getprestatus()){//sysj\plant.sysj line: 350, column: 13
              System.out.println("moving bottle at pos 1 to pos 2");//sysj\plant.sysj line: 351, column: 6
              moveToPos2.setPresent();//sysj\plant.sysj line: 352, column: 6
              currsigs.addElement(moveToPos2);
              System.out.println("Table has been aligned");//sysj\plant.sysj line: 355, column: 5
              tableAlignedWithSensor.setPresent();//sysj\plant.sysj line: 358, column: 6
              currsigs.addElement(tableAlignedWithSensor);
              active[21]=1;
              ends[21]=1;
              tdone[21]=1;
            }
            else {
              System.out.println("Table has been aligned");//sysj\plant.sysj line: 355, column: 5
              tableAlignedWithSensor.setPresent();//sysj\plant.sysj line: 358, column: 6
              currsigs.addElement(tableAlignedWithSensor);
              active[21]=1;
              ends[21]=1;
              tdone[21]=1;
            }
          }
          else {
            if(bottleAtPos1.getprestatus()){//sysj\plant.sysj line: 350, column: 13
              System.out.println("moving bottle at pos 1 to pos 2");//sysj\plant.sysj line: 351, column: 6
              moveToPos2.setPresent();//sysj\plant.sysj line: 352, column: 6
              currsigs.addElement(moveToPos2);
              System.out.println("Table has been aligned");//sysj\plant.sysj line: 355, column: 5
              tableAlignedWithSensor.setPresent();//sysj\plant.sysj line: 358, column: 6
              currsigs.addElement(tableAlignedWithSensor);
              active[21]=1;
              ends[21]=1;
              tdone[21]=1;
            }
            else {
              System.out.println("Table has been aligned");//sysj\plant.sysj line: 355, column: 5
              tableAlignedWithSensor.setPresent();//sysj\plant.sysj line: 358, column: 6
              currsigs.addElement(tableAlignedWithSensor);
              active[21]=1;
              ends[21]=1;
              tdone[21]=1;
            }
          }
        }
      }
      else {
        if(bottleAtPos3.getprestatus()){//sysj\plant.sysj line: 339, column: 13
          System.out.println("moving bottle at pos 3 to pos 4");//sysj\plant.sysj line: 340, column: 6
          moveToPos4.setPresent();//sysj\plant.sysj line: 341, column: 6
          currsigs.addElement(moveToPos4);
          if(bottleAtPos2.getprestatus()){//sysj\plant.sysj line: 345, column: 13
            System.out.println("moving bottle at pos 2 to pos 3");//sysj\plant.sysj line: 346, column: 6
            moveToPos3.setPresent();//sysj\plant.sysj line: 347, column: 6
            currsigs.addElement(moveToPos3);
            if(bottleAtPos1.getprestatus()){//sysj\plant.sysj line: 350, column: 13
              System.out.println("moving bottle at pos 1 to pos 2");//sysj\plant.sysj line: 351, column: 6
              moveToPos2.setPresent();//sysj\plant.sysj line: 352, column: 6
              currsigs.addElement(moveToPos2);
              System.out.println("Table has been aligned");//sysj\plant.sysj line: 355, column: 5
              tableAlignedWithSensor.setPresent();//sysj\plant.sysj line: 358, column: 6
              currsigs.addElement(tableAlignedWithSensor);
              active[21]=1;
              ends[21]=1;
              tdone[21]=1;
            }
            else {
              System.out.println("Table has been aligned");//sysj\plant.sysj line: 355, column: 5
              tableAlignedWithSensor.setPresent();//sysj\plant.sysj line: 358, column: 6
              currsigs.addElement(tableAlignedWithSensor);
              active[21]=1;
              ends[21]=1;
              tdone[21]=1;
            }
          }
          else {
            if(bottleAtPos1.getprestatus()){//sysj\plant.sysj line: 350, column: 13
              System.out.println("moving bottle at pos 1 to pos 2");//sysj\plant.sysj line: 351, column: 6
              moveToPos2.setPresent();//sysj\plant.sysj line: 352, column: 6
              currsigs.addElement(moveToPos2);
              System.out.println("Table has been aligned");//sysj\plant.sysj line: 355, column: 5
              tableAlignedWithSensor.setPresent();//sysj\plant.sysj line: 358, column: 6
              currsigs.addElement(tableAlignedWithSensor);
              active[21]=1;
              ends[21]=1;
              tdone[21]=1;
            }
            else {
              System.out.println("Table has been aligned");//sysj\plant.sysj line: 355, column: 5
              tableAlignedWithSensor.setPresent();//sysj\plant.sysj line: 358, column: 6
              currsigs.addElement(tableAlignedWithSensor);
              active[21]=1;
              ends[21]=1;
              tdone[21]=1;
            }
          }
        }
        else {
          if(bottleAtPos2.getprestatus()){//sysj\plant.sysj line: 345, column: 13
            System.out.println("moving bottle at pos 2 to pos 3");//sysj\plant.sysj line: 346, column: 6
            moveToPos3.setPresent();//sysj\plant.sysj line: 347, column: 6
            currsigs.addElement(moveToPos3);
            if(bottleAtPos1.getprestatus()){//sysj\plant.sysj line: 350, column: 13
              System.out.println("moving bottle at pos 1 to pos 2");//sysj\plant.sysj line: 351, column: 6
              moveToPos2.setPresent();//sysj\plant.sysj line: 352, column: 6
              currsigs.addElement(moveToPos2);
              System.out.println("Table has been aligned");//sysj\plant.sysj line: 355, column: 5
              tableAlignedWithSensor.setPresent();//sysj\plant.sysj line: 358, column: 6
              currsigs.addElement(tableAlignedWithSensor);
              active[21]=1;
              ends[21]=1;
              tdone[21]=1;
            }
            else {
              System.out.println("Table has been aligned");//sysj\plant.sysj line: 355, column: 5
              tableAlignedWithSensor.setPresent();//sysj\plant.sysj line: 358, column: 6
              currsigs.addElement(tableAlignedWithSensor);
              active[21]=1;
              ends[21]=1;
              tdone[21]=1;
            }
          }
          else {
            if(bottleAtPos1.getprestatus()){//sysj\plant.sysj line: 350, column: 13
              System.out.println("moving bottle at pos 1 to pos 2");//sysj\plant.sysj line: 351, column: 6
              moveToPos2.setPresent();//sysj\plant.sysj line: 352, column: 6
              currsigs.addElement(moveToPos2);
              System.out.println("Table has been aligned");//sysj\plant.sysj line: 355, column: 5
              tableAlignedWithSensor.setPresent();//sysj\plant.sysj line: 358, column: 6
              currsigs.addElement(tableAlignedWithSensor);
              active[21]=1;
              ends[21]=1;
              tdone[21]=1;
            }
            else {
              System.out.println("Table has been aligned");//sysj\plant.sysj line: 355, column: 5
              tableAlignedWithSensor.setPresent();//sysj\plant.sysj line: 358, column: 6
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
      S52536=1;
      active[21]=1;
      ends[21]=1;
      tdone[21]=1;
    }
  }

  public void thread54667(int [] tdone, int [] ends){
        S52427=1;
    S52389=0;
    active[20]=1;
    ends[20]=1;
    tdone[20]=1;
  }

  public void thread54666(int [] tdone, int [] ends){
        S52371=1;
    S52327=0;
    if(gripperTurnExtend.getprestatus() && !gripperTurnRetract.getprestatus()){//sysj\plant.sysj line: 296, column: 13
      gripperTurnFinalPos.setPresent();//sysj\plant.sysj line: 298, column: 7
      currsigs.addElement(gripperTurnFinalPos);
      active[19]=1;
      ends[19]=1;
      tdone[19]=1;
    }
    else {
      S52327=1;
      if(gripperTurnRetract.getprestatus() && !gripperTurnExtend.getprestatus()){//sysj\plant.sysj line: 301, column: 13
        gripperTurnHomePos.setPresent();//sysj\plant.sysj line: 303, column: 7
        currsigs.addElement(gripperTurnHomePos);
        active[19]=1;
        ends[19]=1;
        tdone[19]=1;
      }
      else {
        S52327=2;
        active[19]=1;
        ends[19]=1;
        tdone[19]=1;
      }
    }
  }

  public void thread54665(int [] tdone, int [] ends){
        S52306=1;
    S52196=0;
    active[18]=1;
    ends[18]=1;
    tdone[18]=1;
  }

  public void thread54664(int [] tdone, int [] ends){
        S52166=1;
    S52098=0;
    System.out.println("Gripper Extended");//sysj\plant.sysj line: 269, column: 6
    gripperZAxisLifted.setPresent();//sysj\plant.sysj line: 270, column: 6
    currsigs.addElement(gripperZAxisLifted);
    active[17]=1;
    ends[17]=1;
    tdone[17]=1;
  }

  public void thread54663(int [] tdone, int [] ends){
        S52089=1;
    S52067=0;
    active[16]=1;
    ends[16]=1;
    tdone[16]=1;
  }

  public void thread54662(int [] tdone, int [] ends){
        S52057=1;
    capcount_thread_15 = 5;//sysj\plant.sysj line: 238, column: 3
    if(capDec_1.getprestatus()){//sysj\plant.sysj line: 241, column: 12
      if(capcount_thread_15 > 0) {//sysj\plant.sysj line: 242, column: 5
        capcount_thread_15 = capcount_thread_15 - 1;//sysj\plant.sysj line: 243, column: 6
      }
      if(magReq.getprestatus()){//sysj\plant.sysj line: 245, column: 12
        capcount_thread_15 = 5;//sysj\plant.sysj line: 246, column: 5
        if(capcount_thread_15 == 0){//sysj\plant.sysj line: 248, column: 7
          magEmpty.setPresent();//sysj\plant.sysj line: 248, column: 22
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
        if(capcount_thread_15 == 0){//sysj\plant.sysj line: 248, column: 7
          magEmpty.setPresent();//sysj\plant.sysj line: 248, column: 22
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
      if(magReq.getprestatus()){//sysj\plant.sysj line: 245, column: 12
        capcount_thread_15 = 5;//sysj\plant.sysj line: 246, column: 5
        if(capcount_thread_15 == 0){//sysj\plant.sysj line: 248, column: 7
          magEmpty.setPresent();//sysj\plant.sysj line: 248, column: 22
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
        if(capcount_thread_15 == 0){//sysj\plant.sysj line: 248, column: 7
          magEmpty.setPresent();//sysj\plant.sysj line: 248, column: 22
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

  public void thread54661(int [] tdone, int [] ends){
        S51995=1;
    S51949=0;
    S51931=0;
    active[14]=1;
    ends[14]=1;
    tdone[14]=1;
  }

  public void thread54660(int [] tdone, int [] ends){
        S51927=1;
    S51913=0;
    if(vacOn.getprestatus() && armAtSource.getprestatus()){//sysj\plant.sysj line: 212, column: 12
      WPgripped.setPresent();//sysj\plant.sysj line: 214, column: 6
      currsigs.addElement(WPgripped);
      active[13]=1;
      ends[13]=1;
      tdone[13]=1;
    }
    else {
      S51913=1;
      active[13]=1;
      ends[13]=1;
      tdone[13]=1;
    }
  }

  public void thread54659(int [] tdone, int [] ends){
        S51907=1;
    S51791=0;
    pusherRetracted.setPresent();//sysj\plant.sysj line: 199, column: 5
    currsigs.addElement(pusherRetracted);
    active[12]=1;
    ends[12]=1;
    tdone[12]=1;
  }

  public void thread54658(int [] tdone, int [] ends){
        S51758=1;
    S51714=0;
    if(armSource.getprestatus() && !armDest.getprestatus()){//sysj\plant.sysj line: 182, column: 12
      armAtSource.setPresent();//sysj\plant.sysj line: 184, column: 6
      currsigs.addElement(armAtSource);
      active[11]=1;
      ends[11]=1;
      tdone[11]=1;
    }
    else {
      S51714=1;
      if(armDest.getprestatus() && !armSource.getprestatus()){//sysj\plant.sysj line: 187, column: 12
        armAtDest.setPresent();//sysj\plant.sysj line: 189, column: 6
        currsigs.addElement(armAtDest);
        active[11]=1;
        ends[11]=1;
        tdone[11]=1;
      }
      else {
        S51714=2;
        active[11]=1;
        ends[11]=1;
        tdone[11]=1;
      }
    }
  }

  public void thread54656(int [] tdone, int [] ends){
        S51691=1;
    S51617=0;
    if(dosUnitValveExtend.getprestatus() && !dosUnitValveRetract.getprestatus()){//sysj\plant.sysj line: 158, column: 13
      dosUnitEvac.setPresent();//sysj\plant.sysj line: 160, column: 7
      currsigs.addElement(dosUnitEvac);
      active[10]=1;
      ends[10]=1;
      tdone[10]=1;
    }
    else {
      S51617=1;
      if(dosUnitValveRetract.getprestatus() && !dosUnitValveExtend.getprestatus()){//sysj\plant.sysj line: 163, column: 13
        System.out.println("FillerPlant: Filling with canister " + (canister_1.getpreval() == null ? 0 : ((Integer)canister_1.getpreval()).intValue()) + " Percent: " + (percent_1.getpreval() == null ? 0 : ((Integer)percent_1.getpreval()).intValue()));//sysj\plant.sysj line: 164, column: 6
        dosUnitFilled.setPresent();//sysj\plant.sysj line: 166, column: 7
        currsigs.addElement(dosUnitFilled);
        active[10]=1;
        ends[10]=1;
        tdone[10]=1;
      }
      else {
        S51617=2;
        active[10]=1;
        ends[10]=1;
        tdone[10]=1;
      }
    }
  }

  public void thread54655(int [] tdone, int [] ends){
        S51581=1;
    S51567=0;
    if(valveInjectorOnOff.getprestatus()){//sysj\plant.sysj line: 146, column: 13
      valveInjectorActive.setPresent();//sysj\plant.sysj line: 148, column: 7
      currsigs.addElement(valveInjectorActive);
      active[9]=1;
      ends[9]=1;
      tdone[9]=1;
    }
    else {
      S51567=1;
      active[9]=1;
      ends[9]=1;
      tdone[9]=1;
    }
  }

  public void thread54654(int [] tdone, int [] ends){
        S51561=1;
    S51555=0;
    active[8]=1;
    ends[8]=1;
    tdone[8]=1;
  }

  public void thread54653(int [] tdone, int [] ends){
        S51553=1;
    S51491=0;
    active[7]=1;
    ends[7]=1;
    tdone[7]=1;
  }

  public void thread54652(int [] tdone, int [] ends){
        S51693=1;
    canister_1.setClear();//sysj\plant.sysj line: 121, column: 3
    percent_1.setClear();//sysj\plant.sysj line: 122, column: 3
    thread54653(tdone,ends);
    thread54654(tdone,ends);
    thread54655(tdone,ends);
    thread54656(tdone,ends);
    int biggest54657 = 0;
    if(ends[7]>=biggest54657){
      biggest54657=ends[7];
    }
    if(ends[8]>=biggest54657){
      biggest54657=ends[8];
    }
    if(ends[9]>=biggest54657){
      biggest54657=ends[9];
    }
    if(ends[10]>=biggest54657){
      biggest54657=ends[10];
    }
    if(biggest54657 == 1){
      active[6]=1;
      ends[6]=1;
      tdone[6]=1;
    }
  }

  public void thread54651(int [] tdone, int [] ends){
        S51459=1;
    if(bottleAtPos1.getprestatus()){//sysj\plant.sysj line: 108, column: 12
      RTbottleAtPos1.setPresent();//sysj\plant.sysj line: 110, column: 5
      currsigs.addElement(RTbottleAtPos1);
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

  public void thread54649(int [] tdone, int [] ends){
        S51148=1;
    if(motorPos5On.getprestatus()){//sysj\plant.sysj line: 90, column: 14
      System.out.println("Conveyor Plant - moving bottle to leave 5");//sysj\plant.sysj line: 91, column: 7
      bottleLeftPos5.setPresent();//sysj\plant.sysj line: 93, column: 8
      currsigs.addElement(bottleLeftPos5);
      active[4]=1;
      ends[4]=1;
      tdone[4]=1;
    }
    else {
      S51148=0;
      active[4]=0;
      ends[4]=0;
      tdone[4]=1;
    }
  }

  public void thread54648(int [] tdone, int [] ends){
        S51136=1;
    if(motorPos1On.getprestatus()){//sysj\plant.sysj line: 81, column: 14
      System.out.println("Conveyor plant - moving bottle to 1");//sysj\plant.sysj line: 82, column: 7
      bottleAtPos1.setPresent();//sysj\plant.sysj line: 84, column: 8
      currsigs.addElement(bottleAtPos1);
      active[3]=1;
      ends[3]=1;
      tdone[3]=1;
    }
    else {
      S51136=0;
      active[3]=0;
      ends[3]=0;
      tdone[3]=1;
    }
  }

  public void thread54647(int [] tdone, int [] ends){
        S51451=1;
    S51223=0;
    if(motConveyorOnOff.getprestatus()){//sysj\plant.sysj line: 78, column: 12
      S51221=0;
      __start_thread_2 = com.systemj.Timer.getMs();//sysj\plant.sysj line: 78, column: 29
      S51112=0;
      if(com.systemj.Timer.getMs() - __start_thread_2 >= (3) * 1000){//sysj\plant.sysj line: 78, column: 29
        ends[2]=2;
        ;//sysj\plant.sysj line: 78, column: 29
        S51221=1;
        thread54648(tdone,ends);
        thread54649(tdone,ends);
        int biggest54650 = 0;
        if(ends[3]>=biggest54650){
          biggest54650=ends[3];
        }
        if(ends[4]>=biggest54650){
          biggest54650=ends[4];
        }
        if(biggest54650 == 1){
          active[2]=1;
          ends[2]=1;
          tdone[2]=1;
        }
        //FINXME code
        if(biggest54650 == 0){
          S51223=1;
          active[2]=1;
          ends[2]=1;
          tdone[2]=1;
        }
      }
      else {
        S51112=1;
        active[2]=1;
        ends[2]=1;
        tdone[2]=1;
      }
    }
    else {
      S51223=1;
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
      switch(S54645){
        case 0 : 
          S54645=0;
          break RUN;
        
        case 1 : 
          S54645=2;
          S54645=2;
          capDec_1.setClear();//sysj\plant.sysj line: 69, column: 2
          capPos_1.setClear();//sysj\plant.sysj line: 70, column: 2
          capPos_1.setPresent();//sysj\plant.sysj line: 71, column: 2
          currsigs.addElement(capPos_1);
          capPos_1.setValue(0);//sysj\plant.sysj line: 71, column: 2
          disablePos5_1.setClear();//sysj\plant.sysj line: 72, column: 2
          thread54647(tdone,ends);
          thread54651(tdone,ends);
          thread54652(tdone,ends);
          thread54658(tdone,ends);
          thread54659(tdone,ends);
          thread54660(tdone,ends);
          thread54661(tdone,ends);
          thread54662(tdone,ends);
          thread54663(tdone,ends);
          thread54664(tdone,ends);
          thread54665(tdone,ends);
          thread54666(tdone,ends);
          thread54667(tdone,ends);
          thread54668(tdone,ends);
          thread54669(tdone,ends);
          thread54670(tdone,ends);
          thread54671(tdone,ends);
          thread54672(tdone,ends);
          int biggest54673 = 0;
          if(ends[2]>=biggest54673){
            biggest54673=ends[2];
          }
          if(ends[5]>=biggest54673){
            biggest54673=ends[5];
          }
          if(ends[6]>=biggest54673){
            biggest54673=ends[6];
          }
          if(ends[11]>=biggest54673){
            biggest54673=ends[11];
          }
          if(ends[12]>=biggest54673){
            biggest54673=ends[12];
          }
          if(ends[13]>=biggest54673){
            biggest54673=ends[13];
          }
          if(ends[14]>=biggest54673){
            biggest54673=ends[14];
          }
          if(ends[15]>=biggest54673){
            biggest54673=ends[15];
          }
          if(ends[16]>=biggest54673){
            biggest54673=ends[16];
          }
          if(ends[17]>=biggest54673){
            biggest54673=ends[17];
          }
          if(ends[18]>=biggest54673){
            biggest54673=ends[18];
          }
          if(ends[19]>=biggest54673){
            biggest54673=ends[19];
          }
          if(ends[20]>=biggest54673){
            biggest54673=ends[20];
          }
          if(ends[21]>=biggest54673){
            biggest54673=ends[21];
          }
          if(ends[22]>=biggest54673){
            biggest54673=ends[22];
          }
          if(ends[23]>=biggest54673){
            biggest54673=ends[23];
          }
          if(ends[24]>=biggest54673){
            biggest54673=ends[24];
          }
          if(ends[25]>=biggest54673){
            biggest54673=ends[25];
          }
          if(biggest54673 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
        
        case 2 : 
          capDec_1.setClear();//sysj\plant.sysj line: 69, column: 2
          capPos_1.setClear();//sysj\plant.sysj line: 70, column: 2
          disablePos5_1.setClear();//sysj\plant.sysj line: 72, column: 2
          thread54674(tdone,ends);
          thread54687(tdone,ends);
          thread54688(tdone,ends);
          thread54694(tdone,ends);
          thread54695(tdone,ends);
          thread54696(tdone,ends);
          thread54697(tdone,ends);
          thread54698(tdone,ends);
          thread54699(tdone,ends);
          thread54700(tdone,ends);
          thread54701(tdone,ends);
          thread54702(tdone,ends);
          thread54703(tdone,ends);
          thread54704(tdone,ends);
          thread54705(tdone,ends);
          thread54706(tdone,ends);
          thread54707(tdone,ends);
          thread54708(tdone,ends);
          int biggest54709 = 0;
          if(ends[2]>=biggest54709){
            biggest54709=ends[2];
          }
          if(ends[5]>=biggest54709){
            biggest54709=ends[5];
          }
          if(ends[6]>=biggest54709){
            biggest54709=ends[6];
          }
          if(ends[11]>=biggest54709){
            biggest54709=ends[11];
          }
          if(ends[12]>=biggest54709){
            biggest54709=ends[12];
          }
          if(ends[13]>=biggest54709){
            biggest54709=ends[13];
          }
          if(ends[14]>=biggest54709){
            biggest54709=ends[14];
          }
          if(ends[15]>=biggest54709){
            biggest54709=ends[15];
          }
          if(ends[16]>=biggest54709){
            biggest54709=ends[16];
          }
          if(ends[17]>=biggest54709){
            biggest54709=ends[17];
          }
          if(ends[18]>=biggest54709){
            biggest54709=ends[18];
          }
          if(ends[19]>=biggest54709){
            biggest54709=ends[19];
          }
          if(ends[20]>=biggest54709){
            biggest54709=ends[20];
          }
          if(ends[21]>=biggest54709){
            biggest54709=ends[21];
          }
          if(ends[22]>=biggest54709){
            biggest54709=ends[22];
          }
          if(ends[23]>=biggest54709){
            biggest54709=ends[23];
          }
          if(ends[24]>=biggest54709){
            biggest54709=ends[24];
          }
          if(ends[25]>=biggest54709){
            biggest54709=ends[25];
          }
          if(biggest54709 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
          //FINXME code
          if(biggest54709 == 0){
            S54645=0;
            active[1]=0;
            ends[1]=0;
            S54645=0;
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
