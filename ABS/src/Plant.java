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
  private int S55606 = 1;
  private int S52412 = 1;
  private int S52184 = 1;
  private int S52182 = 1;
  private int S52073 = 1;
  private int S52097 = 1;
  private int S52109 = 1;
  private int S52420 = 1;
  private int S52654 = 1;
  private int S52514 = 1;
  private int S52452 = 1;
  private int S52522 = 1;
  private int S52516 = 1;
  private int S52542 = 1;
  private int S52528 = 1;
  private int S52652 = 1;
  private int S52578 = 1;
  private int S52719 = 1;
  private int S52675 = 1;
  private int S52868 = 1;
  private int S52752 = 1;
  private int S52888 = 1;
  private int S52874 = 1;
  private int S52956 = 1;
  private int S52910 = 1;
  private int S52892 = 1;
  private int S53018 = 1;
  private int S53050 = 1;
  private int S53028 = 1;
  private int S53127 = 1;
  private int S53059 = 1;
  private int S53267 = 1;
  private int S53157 = 1;
  private int S53332 = 1;
  private int S53288 = 1;
  private int S53388 = 1;
  private int S53350 = 1;
  private int S53717 = 1;
  private int S53497 = 1;
  private int S53749 = 1;
  private int S53727 = 1;
  private int S53778 = 1;
  private int S53758 = 1;
  private int S53807 = 1;
  private int S53787 = 1;
  private int S53836 = 1;
  private int S53816 = 1;
  
  private int[] ends = new int[26];
  private int[] tdone = new int[26];
  
  public void thread55669(int [] tdone, int [] ends){
        switch(S53836){
      case 0 : 
        active[25]=0;
        ends[25]=0;
        tdone[25]=1;
        break;
      
      case 1 : 
        switch(S53816){
          case 0 : 
            bottleAtPos2.setPresent();//sysj\plant.sysj line: 383, column: 82
            currsigs.addElement(bottleAtPos2);
            active[25]=1;
            ends[25]=1;
            tdone[25]=1;
            break;
          
          case 1 : 
            S53816=1;
            S53816=0;
            if(moveToPos2.getprestatus()){//sysj\plant.sysj line: 383, column: 24
              System.out.println("bottle is now at pos 2");//sysj\plant.sysj line: 383, column: 36
              bottleAtPos2.setPresent();//sysj\plant.sysj line: 383, column: 82
              currsigs.addElement(bottleAtPos2);
              active[25]=1;
              ends[25]=1;
              tdone[25]=1;
            }
            else {
              S53816=1;
              active[25]=1;
              ends[25]=1;
              tdone[25]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread55668(int [] tdone, int [] ends){
        switch(S53807){
      case 0 : 
        active[24]=0;
        ends[24]=0;
        tdone[24]=1;
        break;
      
      case 1 : 
        switch(S53787){
          case 0 : 
            bottleAtPos3.setPresent();//sysj\plant.sysj line: 381, column: 82
            currsigs.addElement(bottleAtPos3);
            active[24]=1;
            ends[24]=1;
            tdone[24]=1;
            break;
          
          case 1 : 
            S53787=1;
            S53787=0;
            if(moveToPos3.getprestatus()){//sysj\plant.sysj line: 381, column: 24
              System.out.println("bottle is now at pos 3");//sysj\plant.sysj line: 381, column: 36
              bottleAtPos3.setPresent();//sysj\plant.sysj line: 381, column: 82
              currsigs.addElement(bottleAtPos3);
              active[24]=1;
              ends[24]=1;
              tdone[24]=1;
            }
            else {
              S53787=1;
              active[24]=1;
              ends[24]=1;
              tdone[24]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread55667(int [] tdone, int [] ends){
        switch(S53778){
      case 0 : 
        active[23]=0;
        ends[23]=0;
        tdone[23]=1;
        break;
      
      case 1 : 
        switch(S53758){
          case 0 : 
            bottleAtPos4.setPresent();//sysj\plant.sysj line: 379, column: 82
            currsigs.addElement(bottleAtPos4);
            active[23]=1;
            ends[23]=1;
            tdone[23]=1;
            break;
          
          case 1 : 
            S53758=1;
            S53758=0;
            if(moveToPos4.getprestatus()){//sysj\plant.sysj line: 379, column: 24
              System.out.println("bottle is now at pos 4");//sysj\plant.sysj line: 379, column: 36
              bottleAtPos4.setPresent();//sysj\plant.sysj line: 379, column: 82
              currsigs.addElement(bottleAtPos4);
              active[23]=1;
              ends[23]=1;
              tdone[23]=1;
            }
            else {
              S53758=1;
              active[23]=1;
              ends[23]=1;
              tdone[23]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread55666(int [] tdone, int [] ends){
        switch(S53749){
      case 0 : 
        active[22]=0;
        ends[22]=0;
        tdone[22]=1;
        break;
      
      case 1 : 
        switch(S53727){
          case 0 : 
            if(bottleLeftPos5.getprestatus()){//sysj\plant.sysj line: 369, column: 10
              S53727=1;
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
            S53727=1;
            S53727=0;
            if(moveToPos5.getprestatus()){//sysj\plant.sysj line: 370, column: 13
              System.out.println("bottle is now at pos 5");//sysj\plant.sysj line: 371, column: 6
              bottleAtPos5.setPresent();//sysj\plant.sysj line: 372, column: 6
              currsigs.addElement(bottleAtPos5);
              active[22]=1;
              ends[22]=1;
              tdone[22]=1;
            }
            else {
              S53727=1;
              active[22]=1;
              ends[22]=1;
              tdone[22]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread55665(int [] tdone, int [] ends){
        switch(S53717){
      case 0 : 
        active[21]=0;
        ends[21]=0;
        tdone[21]=1;
        break;
      
      case 1 : 
        switch(S53497){
          case 0 : 
            if(!rotaryTableTrigger.getprestatus()){//sysj\plant.sysj line: 357, column: 11
              S53497=1;
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
            S53497=1;
            S53497=0;
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
              S53497=1;
              active[21]=1;
              ends[21]=1;
              tdone[21]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread55664(int [] tdone, int [] ends){
        switch(S53388){
      case 0 : 
        active[20]=0;
        ends[20]=0;
        tdone[20]=1;
        break;
      
      case 1 : 
        switch(S53350){
          case 0 : 
            if(cylClampBottleExtend.getprestatus()){//sysj\plant.sysj line: 313, column: 11
              S53350=1;
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
              S53350=2;
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
            S53350=2;
            S53350=0;
            active[20]=1;
            ends[20]=1;
            tdone[20]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread55663(int [] tdone, int [] ends){
        switch(S53332){
      case 0 : 
        active[19]=0;
        ends[19]=0;
        tdone[19]=1;
        break;
      
      case 1 : 
        switch(S53288){
          case 0 : 
            if(gripperTurnRetract.getprestatus()){//sysj\plant.sysj line: 297, column: 12
              S53288=1;
              if(gripperTurnRetract.getprestatus() && !gripperTurnExtend.getprestatus()){//sysj\plant.sysj line: 301, column: 13
                gripperTurnHomePos.setPresent();//sysj\plant.sysj line: 303, column: 7
                currsigs.addElement(gripperTurnHomePos);
                active[19]=1;
                ends[19]=1;
                tdone[19]=1;
              }
              else {
                S53288=2;
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
              S53288=2;
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
            S53288=2;
            S53288=0;
            if(gripperTurnExtend.getprestatus() && !gripperTurnRetract.getprestatus()){//sysj\plant.sysj line: 296, column: 13
              gripperTurnFinalPos.setPresent();//sysj\plant.sysj line: 298, column: 7
              currsigs.addElement(gripperTurnFinalPos);
              active[19]=1;
              ends[19]=1;
              tdone[19]=1;
            }
            else {
              S53288=1;
              if(gripperTurnRetract.getprestatus() && !gripperTurnExtend.getprestatus()){//sysj\plant.sysj line: 301, column: 13
                gripperTurnHomePos.setPresent();//sysj\plant.sysj line: 303, column: 7
                currsigs.addElement(gripperTurnHomePos);
                active[19]=1;
                ends[19]=1;
                tdone[19]=1;
              }
              else {
                S53288=2;
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

  public void thread55662(int [] tdone, int [] ends){
        switch(S53267){
      case 0 : 
        active[18]=0;
        ends[18]=0;
        tdone[18]=1;
        break;
      
      case 1 : 
        switch(S53157){
          case 0 : 
            if(capGripperPos5Extend.getprestatus()){//sysj\plant.sysj line: 284, column: 11
              S53157=1;
              __start_thread_18 = com.systemj.Timer.getMs();//sysj\plant.sysj line: 283, column: 4
              if(com.systemj.Timer.getMs() - __start_thread_18 >= (3) * 1000){//sysj\plant.sysj line: 283, column: 4
                ends[18]=2;
                ;//sysj\plant.sysj line: 283, column: 4
                S53157=2;
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
              S53157=2;
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
              S53157=3;
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
            S53157=3;
            S53157=0;
            active[18]=1;
            ends[18]=1;
            tdone[18]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread55661(int [] tdone, int [] ends){
        switch(S53127){
      case 0 : 
        active[17]=0;
        ends[17]=0;
        tdone[17]=1;
        break;
      
      case 1 : 
        switch(S53059){
          case 0 : 
            if(cylPos5ZAxisExtend.getprestatus()){//sysj\plant.sysj line: 268, column: 11
              System.out.println("Gipper Tranistion");//sysj\plant.sysj line: 272, column: 5
              S53059=1;
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
              S53059=2;
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
            S53059=2;
            S53059=0;
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

  public void thread55660(int [] tdone, int [] ends){
        switch(S53050){
      case 0 : 
        active[16]=0;
        ends[16]=0;
        tdone[16]=1;
        break;
      
      case 1 : 
        switch(S53028){
          case 0 : 
            if(moveToPos4.getprestatus()){//sysj\plant.sysj line: 257, column: 11
              S53028=1;
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
              S53028=2;
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
            S53028=2;
            S53028=0;
            active[16]=1;
            ends[16]=1;
            tdone[16]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread55659(int [] tdone, int [] ends){
        switch(S53018){
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

  public void thread55658(int [] tdone, int [] ends){
        switch(S52956){
      case 0 : 
        active[14]=0;
        ends[14]=0;
        tdone[14]=1;
        break;
      
      case 1 : 
        switch(S52910){
          case 0 : 
            if(magEmpty.getprestatus()){//sysj\plant.sysj line: 223, column: 10
              S52910=1;
              active[14]=1;
              ends[14]=1;
              tdone[14]=1;
            }
            else {
              switch(S52892){
                case 0 : 
                  if(pusherRetracted.getprestatus()){//sysj\plant.sysj line: 225, column: 13
                    S52892=1;
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
                    S52892=2;
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
                    S52892=3;
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
                  S52892=3;
                  S52892=0;
                  active[14]=1;
                  ends[14]=1;
                  tdone[14]=1;
                  break;
                
              }
            }
            break;
          
          case 1 : 
            if(magReq.getprestatus()){//sysj\plant.sysj line: 232, column: 10
              S52910=2;
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
            S52910=2;
            S52910=0;
            S52892=0;
            active[14]=1;
            ends[14]=1;
            tdone[14]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread55657(int [] tdone, int [] ends){
        switch(S52888){
      case 0 : 
        active[13]=0;
        ends[13]=0;
        tdone[13]=1;
        break;
      
      case 1 : 
        switch(S52874){
          case 0 : 
            if(magEmpty.getprestatus() || !vacOn.getprestatus()){//sysj\plant.sysj line: 213, column: 11
              S52874=1;
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
            S52874=1;
            S52874=0;
            if(vacOn.getprestatus() && armAtSource.getprestatus()){//sysj\plant.sysj line: 212, column: 12
              WPgripped.setPresent();//sysj\plant.sysj line: 214, column: 6
              currsigs.addElement(WPgripped);
              active[13]=1;
              ends[13]=1;
              tdone[13]=1;
            }
            else {
              S52874=1;
              active[13]=1;
              ends[13]=1;
              tdone[13]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread55656(int [] tdone, int [] ends){
        switch(S52868){
      case 0 : 
        active[12]=0;
        ends[12]=0;
        tdone[12]=1;
        break;
      
      case 1 : 
        switch(S52752){
          case 0 : 
            if(pusherExtend.getprestatus()){//sysj\plant.sysj line: 198, column: 10
              S52752=1;
              __start_thread_12 = com.systemj.Timer.getMs();//sysj\plant.sysj line: 197, column: 3
              if(com.systemj.Timer.getMs() - __start_thread_12 >= (3) * 1000){//sysj\plant.sysj line: 197, column: 3
                ends[12]=2;
                ;//sysj\plant.sysj line: 197, column: 3
                S52752=2;
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
              S52752=2;
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
              S52752=3;
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
            S52752=3;
            S52752=0;
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

  public void thread55655(int [] tdone, int [] ends){
        switch(S52719){
      case 0 : 
        active[11]=0;
        ends[11]=0;
        tdone[11]=1;
        break;
      
      case 1 : 
        switch(S52675){
          case 0 : 
            if(armDest.getprestatus()){//sysj\plant.sysj line: 183, column: 12
              S52675=1;
              if(armDest.getprestatus() && !armSource.getprestatus()){//sysj\plant.sysj line: 187, column: 12
                armAtDest.setPresent();//sysj\plant.sysj line: 189, column: 6
                currsigs.addElement(armAtDest);
                active[11]=1;
                ends[11]=1;
                tdone[11]=1;
              }
              else {
                S52675=2;
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
              S52675=2;
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
            S52675=2;
            S52675=0;
            if(armSource.getprestatus() && !armDest.getprestatus()){//sysj\plant.sysj line: 182, column: 12
              armAtSource.setPresent();//sysj\plant.sysj line: 184, column: 6
              currsigs.addElement(armAtSource);
              active[11]=1;
              ends[11]=1;
              tdone[11]=1;
            }
            else {
              S52675=1;
              if(armDest.getprestatus() && !armSource.getprestatus()){//sysj\plant.sysj line: 187, column: 12
                armAtDest.setPresent();//sysj\plant.sysj line: 189, column: 6
                currsigs.addElement(armAtDest);
                active[11]=1;
                ends[11]=1;
                tdone[11]=1;
              }
              else {
                S52675=2;
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

  public void thread55653(int [] tdone, int [] ends){
        switch(S52652){
      case 0 : 
        active[10]=0;
        ends[10]=0;
        tdone[10]=1;
        break;
      
      case 1 : 
        switch(S52578){
          case 0 : 
            if(dosUnitValveRetract.getprestatus()){//sysj\plant.sysj line: 159, column: 13
              S52578=1;
              if(dosUnitValveRetract.getprestatus() && !dosUnitValveExtend.getprestatus()){//sysj\plant.sysj line: 163, column: 13
                System.out.println("FillerPlant: Filling with canister " + (canister_1.getpreval() == null ? 0 : ((Integer)canister_1.getpreval()).intValue()) + " Percent: " + (percent_1.getpreval() == null ? 0 : ((Integer)percent_1.getpreval()).intValue()));//sysj\plant.sysj line: 164, column: 6
                dosUnitFilled.setPresent();//sysj\plant.sysj line: 166, column: 7
                currsigs.addElement(dosUnitFilled);
                active[10]=1;
                ends[10]=1;
                tdone[10]=1;
              }
              else {
                S52578=2;
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
              S52578=2;
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
            S52578=2;
            S52578=0;
            if(dosUnitValveExtend.getprestatus() && !dosUnitValveRetract.getprestatus()){//sysj\plant.sysj line: 158, column: 13
              dosUnitEvac.setPresent();//sysj\plant.sysj line: 160, column: 7
              currsigs.addElement(dosUnitEvac);
              active[10]=1;
              ends[10]=1;
              tdone[10]=1;
            }
            else {
              S52578=1;
              if(dosUnitValveRetract.getprestatus() && !dosUnitValveExtend.getprestatus()){//sysj\plant.sysj line: 163, column: 13
                System.out.println("FillerPlant: Filling with canister " + (canister_1.getpreval() == null ? 0 : ((Integer)canister_1.getpreval()).intValue()) + " Percent: " + (percent_1.getpreval() == null ? 0 : ((Integer)percent_1.getpreval()).intValue()));//sysj\plant.sysj line: 164, column: 6
                dosUnitFilled.setPresent();//sysj\plant.sysj line: 166, column: 7
                currsigs.addElement(dosUnitFilled);
                active[10]=1;
                ends[10]=1;
                tdone[10]=1;
              }
              else {
                S52578=2;
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

  public void thread55652(int [] tdone, int [] ends){
        switch(S52542){
      case 0 : 
        active[9]=0;
        ends[9]=0;
        tdone[9]=1;
        break;
      
      case 1 : 
        switch(S52528){
          case 0 : 
            if(!valveInjectorOnOff.getprestatus()){//sysj\plant.sysj line: 147, column: 12
              S52528=1;
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
            S52528=1;
            S52528=0;
            if(valveInjectorOnOff.getprestatus()){//sysj\plant.sysj line: 146, column: 13
              valveInjectorActive.setPresent();//sysj\plant.sysj line: 148, column: 7
              currsigs.addElement(valveInjectorActive);
              active[9]=1;
              ends[9]=1;
              tdone[9]=1;
            }
            else {
              S52528=1;
              active[9]=1;
              ends[9]=1;
              tdone[9]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread55651(int [] tdone, int [] ends){
        switch(S52522){
      case 0 : 
        active[8]=0;
        ends[8]=0;
        tdone[8]=1;
        break;
      
      case 1 : 
        switch(S52516){
          case 0 : 
            if(selectPercentage.getprestatus()){//sysj\plant.sysj line: 137, column: 11
              percent_1.setPresent();//sysj\plant.sysj line: 138, column: 5
              currsigs.addElement(percent_1);
              percent_1.setValue((selectPercentage.getpreval() == null ? null : ((Integer)selectPercentage.getpreval())));//sysj\plant.sysj line: 138, column: 5
              selectedPercentage.setPresent();//sysj\plant.sysj line: 139, column: 5
              currsigs.addElement(selectedPercentage);
              selectedPercentage.setValue((selectPercentage.getpreval() == null ? null : ((Integer)selectPercentage.getpreval())));//sysj\plant.sysj line: 139, column: 5
              S52516=1;
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
            S52516=1;
            S52516=0;
            active[8]=1;
            ends[8]=1;
            tdone[8]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread55650(int [] tdone, int [] ends){
        switch(S52514){
      case 0 : 
        active[7]=0;
        ends[7]=0;
        tdone[7]=1;
        break;
      
      case 1 : 
        switch(S52452){
          case 0 : 
            if(selectCanister.getprestatus()){//sysj\plant.sysj line: 126, column: 11
              S52452=1;
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
                S52452=2;
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
              S52452=2;
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
            S52452=2;
            S52452=0;
            active[7]=1;
            ends[7]=1;
            tdone[7]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread55649(int [] tdone, int [] ends){
        switch(S52654){
      case 0 : 
        active[6]=0;
        ends[6]=0;
        tdone[6]=1;
        break;
      
      case 1 : 
        canister_1.setClear();//sysj\plant.sysj line: 121, column: 3
        percent_1.setClear();//sysj\plant.sysj line: 122, column: 3
        thread55650(tdone,ends);
        thread55651(tdone,ends);
        thread55652(tdone,ends);
        thread55653(tdone,ends);
        int biggest55654 = 0;
        if(ends[7]>=biggest55654){
          biggest55654=ends[7];
        }
        if(ends[8]>=biggest55654){
          biggest55654=ends[8];
        }
        if(ends[9]>=biggest55654){
          biggest55654=ends[9];
        }
        if(ends[10]>=biggest55654){
          biggest55654=ends[10];
        }
        if(biggest55654 == 1){
          active[6]=1;
          ends[6]=1;
          tdone[6]=1;
        }
        //FINXME code
        if(biggest55654 == 0){
          S52654=0;
          active[6]=0;
          ends[6]=0;
          tdone[6]=1;
        }
        break;
      
    }
  }

  public void thread55648(int [] tdone, int [] ends){
        switch(S52420){
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

  public void thread55646(int [] tdone, int [] ends){
        S52109=1;
    if(motorPos5On.getprestatus()){//sysj\plant.sysj line: 90, column: 14
      System.out.println("Conveyor Plant - moving bottle to leave 5");//sysj\plant.sysj line: 91, column: 7
      bottleLeftPos5.setPresent();//sysj\plant.sysj line: 93, column: 8
      currsigs.addElement(bottleLeftPos5);
      active[4]=1;
      ends[4]=1;
      tdone[4]=1;
    }
    else {
      S52109=0;
      active[4]=0;
      ends[4]=0;
      tdone[4]=1;
    }
  }

  public void thread55645(int [] tdone, int [] ends){
        S52097=1;
    if(motorPos1On.getprestatus()){//sysj\plant.sysj line: 81, column: 14
      System.out.println("Conveyor plant - moving bottle to 1");//sysj\plant.sysj line: 82, column: 7
      bottleAtPos1.setPresent();//sysj\plant.sysj line: 84, column: 8
      currsigs.addElement(bottleAtPos1);
      active[3]=1;
      ends[3]=1;
      tdone[3]=1;
    }
    else {
      S52097=0;
      active[3]=0;
      ends[3]=0;
      tdone[3]=1;
    }
  }

  public void thread55643(int [] tdone, int [] ends){
        switch(S52109){
      case 0 : 
        active[4]=0;
        ends[4]=0;
        tdone[4]=1;
        break;
      
      case 1 : 
        if(!motorPos5On.getprestatus() && !motConveyorOnOff.getprestatus()){//sysj\plant.sysj line: 92, column: 13
          S52109=0;
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

  public void thread55642(int [] tdone, int [] ends){
        switch(S52097){
      case 0 : 
        active[3]=0;
        ends[3]=0;
        tdone[3]=1;
        break;
      
      case 1 : 
        if(moveToPos2.getprestatus()){//sysj\plant.sysj line: 83, column: 13
          S52097=0;
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

  public void thread55640(int [] tdone, int [] ends){
        S52109=1;
    if(motorPos5On.getprestatus()){//sysj\plant.sysj line: 90, column: 14
      System.out.println("Conveyor Plant - moving bottle to leave 5");//sysj\plant.sysj line: 91, column: 7
      bottleLeftPos5.setPresent();//sysj\plant.sysj line: 93, column: 8
      currsigs.addElement(bottleLeftPos5);
      active[4]=1;
      ends[4]=1;
      tdone[4]=1;
    }
    else {
      S52109=0;
      active[4]=0;
      ends[4]=0;
      tdone[4]=1;
    }
  }

  public void thread55639(int [] tdone, int [] ends){
        S52097=1;
    if(motorPos1On.getprestatus()){//sysj\plant.sysj line: 81, column: 14
      System.out.println("Conveyor plant - moving bottle to 1");//sysj\plant.sysj line: 82, column: 7
      bottleAtPos1.setPresent();//sysj\plant.sysj line: 84, column: 8
      currsigs.addElement(bottleAtPos1);
      active[3]=1;
      ends[3]=1;
      tdone[3]=1;
    }
    else {
      S52097=0;
      active[3]=0;
      ends[3]=0;
      tdone[3]=1;
    }
  }

  public void thread55637(int [] tdone, int [] ends){
        S52109=1;
    if(motorPos5On.getprestatus()){//sysj\plant.sysj line: 90, column: 14
      System.out.println("Conveyor Plant - moving bottle to leave 5");//sysj\plant.sysj line: 91, column: 7
      bottleLeftPos5.setPresent();//sysj\plant.sysj line: 93, column: 8
      currsigs.addElement(bottleLeftPos5);
      active[4]=1;
      ends[4]=1;
      tdone[4]=1;
    }
    else {
      S52109=0;
      active[4]=0;
      ends[4]=0;
      tdone[4]=1;
    }
  }

  public void thread55636(int [] tdone, int [] ends){
        S52097=1;
    if(motorPos1On.getprestatus()){//sysj\plant.sysj line: 81, column: 14
      System.out.println("Conveyor plant - moving bottle to 1");//sysj\plant.sysj line: 82, column: 7
      bottleAtPos1.setPresent();//sysj\plant.sysj line: 84, column: 8
      currsigs.addElement(bottleAtPos1);
      active[3]=1;
      ends[3]=1;
      tdone[3]=1;
    }
    else {
      S52097=0;
      active[3]=0;
      ends[3]=0;
      tdone[3]=1;
    }
  }

  public void thread55635(int [] tdone, int [] ends){
        switch(S52412){
      case 0 : 
        active[2]=0;
        ends[2]=0;
        tdone[2]=1;
        break;
      
      case 1 : 
        switch(S52184){
          case 0 : 
            switch(S52182){
              case 0 : 
                switch(S52073){
                  case 0 : 
                    S52073=0;
                    if(com.systemj.Timer.getMs() - __start_thread_2 >= (3) * 1000){//sysj\plant.sysj line: 78, column: 29
                      ends[2]=2;
                      ;//sysj\plant.sysj line: 78, column: 29
                      S52182=1;
                      thread55636(tdone,ends);
                      thread55637(tdone,ends);
                      int biggest55638 = 0;
                      if(ends[3]>=biggest55638){
                        biggest55638=ends[3];
                      }
                      if(ends[4]>=biggest55638){
                        biggest55638=ends[4];
                      }
                      if(biggest55638 == 1){
                        active[2]=1;
                        ends[2]=1;
                        tdone[2]=1;
                      }
                      //FINXME code
                      if(biggest55638 == 0){
                        S52184=1;
                        active[2]=1;
                        ends[2]=1;
                        tdone[2]=1;
                      }
                    }
                    else {
                      S52073=1;
                      active[2]=1;
                      ends[2]=1;
                      tdone[2]=1;
                    }
                    break;
                  
                  case 1 : 
                    S52073=1;
                    S52073=0;
                    if(com.systemj.Timer.getMs() - __start_thread_2 >= (3) * 1000){//sysj\plant.sysj line: 78, column: 29
                      ends[2]=2;
                      ;//sysj\plant.sysj line: 78, column: 29
                      S52182=1;
                      thread55639(tdone,ends);
                      thread55640(tdone,ends);
                      int biggest55641 = 0;
                      if(ends[3]>=biggest55641){
                        biggest55641=ends[3];
                      }
                      if(ends[4]>=biggest55641){
                        biggest55641=ends[4];
                      }
                      if(biggest55641 == 1){
                        active[2]=1;
                        ends[2]=1;
                        tdone[2]=1;
                      }
                      //FINXME code
                      if(biggest55641 == 0){
                        S52184=1;
                        active[2]=1;
                        ends[2]=1;
                        tdone[2]=1;
                      }
                    }
                    else {
                      S52073=1;
                      active[2]=1;
                      ends[2]=1;
                      tdone[2]=1;
                    }
                    break;
                  
                }
                break;
              
              case 1 : 
                thread55642(tdone,ends);
                thread55643(tdone,ends);
                int biggest55644 = 0;
                if(ends[3]>=biggest55644){
                  biggest55644=ends[3];
                }
                if(ends[4]>=biggest55644){
                  biggest55644=ends[4];
                }
                if(biggest55644 == 1){
                  active[2]=1;
                  ends[2]=1;
                  tdone[2]=1;
                }
                //FINXME code
                if(biggest55644 == 0){
                  S52184=1;
                  active[2]=1;
                  ends[2]=1;
                  tdone[2]=1;
                }
                break;
              
            }
            break;
          
          case 1 : 
            S52184=1;
            S52184=0;
            if(motConveyorOnOff.getprestatus()){//sysj\plant.sysj line: 78, column: 12
              S52182=0;
              __start_thread_2 = com.systemj.Timer.getMs();//sysj\plant.sysj line: 78, column: 29
              S52073=0;
              if(com.systemj.Timer.getMs() - __start_thread_2 >= (3) * 1000){//sysj\plant.sysj line: 78, column: 29
                ends[2]=2;
                ;//sysj\plant.sysj line: 78, column: 29
                S52182=1;
                thread55645(tdone,ends);
                thread55646(tdone,ends);
                int biggest55647 = 0;
                if(ends[3]>=biggest55647){
                  biggest55647=ends[3];
                }
                if(ends[4]>=biggest55647){
                  biggest55647=ends[4];
                }
                if(biggest55647 == 1){
                  active[2]=1;
                  ends[2]=1;
                  tdone[2]=1;
                }
                //FINXME code
                if(biggest55647 == 0){
                  S52184=1;
                  active[2]=1;
                  ends[2]=1;
                  tdone[2]=1;
                }
              }
              else {
                S52073=1;
                active[2]=1;
                ends[2]=1;
                tdone[2]=1;
              }
            }
            else {
              S52184=1;
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread55633(int [] tdone, int [] ends){
        S53836=1;
    S53816=0;
    if(moveToPos2.getprestatus()){//sysj\plant.sysj line: 383, column: 24
      System.out.println("bottle is now at pos 2");//sysj\plant.sysj line: 383, column: 36
      bottleAtPos2.setPresent();//sysj\plant.sysj line: 383, column: 82
      currsigs.addElement(bottleAtPos2);
      active[25]=1;
      ends[25]=1;
      tdone[25]=1;
    }
    else {
      S53816=1;
      active[25]=1;
      ends[25]=1;
      tdone[25]=1;
    }
  }

  public void thread55632(int [] tdone, int [] ends){
        S53807=1;
    S53787=0;
    if(moveToPos3.getprestatus()){//sysj\plant.sysj line: 381, column: 24
      System.out.println("bottle is now at pos 3");//sysj\plant.sysj line: 381, column: 36
      bottleAtPos3.setPresent();//sysj\plant.sysj line: 381, column: 82
      currsigs.addElement(bottleAtPos3);
      active[24]=1;
      ends[24]=1;
      tdone[24]=1;
    }
    else {
      S53787=1;
      active[24]=1;
      ends[24]=1;
      tdone[24]=1;
    }
  }

  public void thread55631(int [] tdone, int [] ends){
        S53778=1;
    S53758=0;
    if(moveToPos4.getprestatus()){//sysj\plant.sysj line: 379, column: 24
      System.out.println("bottle is now at pos 4");//sysj\plant.sysj line: 379, column: 36
      bottleAtPos4.setPresent();//sysj\plant.sysj line: 379, column: 82
      currsigs.addElement(bottleAtPos4);
      active[23]=1;
      ends[23]=1;
      tdone[23]=1;
    }
    else {
      S53758=1;
      active[23]=1;
      ends[23]=1;
      tdone[23]=1;
    }
  }

  public void thread55630(int [] tdone, int [] ends){
        S53749=1;
    S53727=0;
    if(moveToPos5.getprestatus()){//sysj\plant.sysj line: 370, column: 13
      System.out.println("bottle is now at pos 5");//sysj\plant.sysj line: 371, column: 6
      bottleAtPos5.setPresent();//sysj\plant.sysj line: 372, column: 6
      currsigs.addElement(bottleAtPos5);
      active[22]=1;
      ends[22]=1;
      tdone[22]=1;
    }
    else {
      S53727=1;
      active[22]=1;
      ends[22]=1;
      tdone[22]=1;
    }
  }

  public void thread55629(int [] tdone, int [] ends){
        S53717=1;
    S53497=0;
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
      S53497=1;
      active[21]=1;
      ends[21]=1;
      tdone[21]=1;
    }
  }

  public void thread55628(int [] tdone, int [] ends){
        S53388=1;
    S53350=0;
    active[20]=1;
    ends[20]=1;
    tdone[20]=1;
  }

  public void thread55627(int [] tdone, int [] ends){
        S53332=1;
    S53288=0;
    if(gripperTurnExtend.getprestatus() && !gripperTurnRetract.getprestatus()){//sysj\plant.sysj line: 296, column: 13
      gripperTurnFinalPos.setPresent();//sysj\plant.sysj line: 298, column: 7
      currsigs.addElement(gripperTurnFinalPos);
      active[19]=1;
      ends[19]=1;
      tdone[19]=1;
    }
    else {
      S53288=1;
      if(gripperTurnRetract.getprestatus() && !gripperTurnExtend.getprestatus()){//sysj\plant.sysj line: 301, column: 13
        gripperTurnHomePos.setPresent();//sysj\plant.sysj line: 303, column: 7
        currsigs.addElement(gripperTurnHomePos);
        active[19]=1;
        ends[19]=1;
        tdone[19]=1;
      }
      else {
        S53288=2;
        active[19]=1;
        ends[19]=1;
        tdone[19]=1;
      }
    }
  }

  public void thread55626(int [] tdone, int [] ends){
        S53267=1;
    S53157=0;
    active[18]=1;
    ends[18]=1;
    tdone[18]=1;
  }

  public void thread55625(int [] tdone, int [] ends){
        S53127=1;
    S53059=0;
    System.out.println("Gripper Extended");//sysj\plant.sysj line: 269, column: 6
    gripperZAxisLifted.setPresent();//sysj\plant.sysj line: 270, column: 6
    currsigs.addElement(gripperZAxisLifted);
    active[17]=1;
    ends[17]=1;
    tdone[17]=1;
  }

  public void thread55624(int [] tdone, int [] ends){
        S53050=1;
    S53028=0;
    active[16]=1;
    ends[16]=1;
    tdone[16]=1;
  }

  public void thread55623(int [] tdone, int [] ends){
        S53018=1;
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

  public void thread55622(int [] tdone, int [] ends){
        S52956=1;
    S52910=0;
    S52892=0;
    active[14]=1;
    ends[14]=1;
    tdone[14]=1;
  }

  public void thread55621(int [] tdone, int [] ends){
        S52888=1;
    S52874=0;
    if(vacOn.getprestatus() && armAtSource.getprestatus()){//sysj\plant.sysj line: 212, column: 12
      WPgripped.setPresent();//sysj\plant.sysj line: 214, column: 6
      currsigs.addElement(WPgripped);
      active[13]=1;
      ends[13]=1;
      tdone[13]=1;
    }
    else {
      S52874=1;
      active[13]=1;
      ends[13]=1;
      tdone[13]=1;
    }
  }

  public void thread55620(int [] tdone, int [] ends){
        S52868=1;
    S52752=0;
    pusherRetracted.setPresent();//sysj\plant.sysj line: 199, column: 5
    currsigs.addElement(pusherRetracted);
    active[12]=1;
    ends[12]=1;
    tdone[12]=1;
  }

  public void thread55619(int [] tdone, int [] ends){
        S52719=1;
    S52675=0;
    if(armSource.getprestatus() && !armDest.getprestatus()){//sysj\plant.sysj line: 182, column: 12
      armAtSource.setPresent();//sysj\plant.sysj line: 184, column: 6
      currsigs.addElement(armAtSource);
      active[11]=1;
      ends[11]=1;
      tdone[11]=1;
    }
    else {
      S52675=1;
      if(armDest.getprestatus() && !armSource.getprestatus()){//sysj\plant.sysj line: 187, column: 12
        armAtDest.setPresent();//sysj\plant.sysj line: 189, column: 6
        currsigs.addElement(armAtDest);
        active[11]=1;
        ends[11]=1;
        tdone[11]=1;
      }
      else {
        S52675=2;
        active[11]=1;
        ends[11]=1;
        tdone[11]=1;
      }
    }
  }

  public void thread55617(int [] tdone, int [] ends){
        S52652=1;
    S52578=0;
    if(dosUnitValveExtend.getprestatus() && !dosUnitValveRetract.getprestatus()){//sysj\plant.sysj line: 158, column: 13
      dosUnitEvac.setPresent();//sysj\plant.sysj line: 160, column: 7
      currsigs.addElement(dosUnitEvac);
      active[10]=1;
      ends[10]=1;
      tdone[10]=1;
    }
    else {
      S52578=1;
      if(dosUnitValveRetract.getprestatus() && !dosUnitValveExtend.getprestatus()){//sysj\plant.sysj line: 163, column: 13
        System.out.println("FillerPlant: Filling with canister " + (canister_1.getpreval() == null ? 0 : ((Integer)canister_1.getpreval()).intValue()) + " Percent: " + (percent_1.getpreval() == null ? 0 : ((Integer)percent_1.getpreval()).intValue()));//sysj\plant.sysj line: 164, column: 6
        dosUnitFilled.setPresent();//sysj\plant.sysj line: 166, column: 7
        currsigs.addElement(dosUnitFilled);
        active[10]=1;
        ends[10]=1;
        tdone[10]=1;
      }
      else {
        S52578=2;
        active[10]=1;
        ends[10]=1;
        tdone[10]=1;
      }
    }
  }

  public void thread55616(int [] tdone, int [] ends){
        S52542=1;
    S52528=0;
    if(valveInjectorOnOff.getprestatus()){//sysj\plant.sysj line: 146, column: 13
      valveInjectorActive.setPresent();//sysj\plant.sysj line: 148, column: 7
      currsigs.addElement(valveInjectorActive);
      active[9]=1;
      ends[9]=1;
      tdone[9]=1;
    }
    else {
      S52528=1;
      active[9]=1;
      ends[9]=1;
      tdone[9]=1;
    }
  }

  public void thread55615(int [] tdone, int [] ends){
        S52522=1;
    S52516=0;
    active[8]=1;
    ends[8]=1;
    tdone[8]=1;
  }

  public void thread55614(int [] tdone, int [] ends){
        S52514=1;
    S52452=0;
    active[7]=1;
    ends[7]=1;
    tdone[7]=1;
  }

  public void thread55613(int [] tdone, int [] ends){
        S52654=1;
    canister_1.setClear();//sysj\plant.sysj line: 121, column: 3
    percent_1.setClear();//sysj\plant.sysj line: 122, column: 3
    thread55614(tdone,ends);
    thread55615(tdone,ends);
    thread55616(tdone,ends);
    thread55617(tdone,ends);
    int biggest55618 = 0;
    if(ends[7]>=biggest55618){
      biggest55618=ends[7];
    }
    if(ends[8]>=biggest55618){
      biggest55618=ends[8];
    }
    if(ends[9]>=biggest55618){
      biggest55618=ends[9];
    }
    if(ends[10]>=biggest55618){
      biggest55618=ends[10];
    }
    if(biggest55618 == 1){
      active[6]=1;
      ends[6]=1;
      tdone[6]=1;
    }
  }

  public void thread55612(int [] tdone, int [] ends){
        S52420=1;
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

  public void thread55610(int [] tdone, int [] ends){
        S52109=1;
    if(motorPos5On.getprestatus()){//sysj\plant.sysj line: 90, column: 14
      System.out.println("Conveyor Plant - moving bottle to leave 5");//sysj\plant.sysj line: 91, column: 7
      bottleLeftPos5.setPresent();//sysj\plant.sysj line: 93, column: 8
      currsigs.addElement(bottleLeftPos5);
      active[4]=1;
      ends[4]=1;
      tdone[4]=1;
    }
    else {
      S52109=0;
      active[4]=0;
      ends[4]=0;
      tdone[4]=1;
    }
  }

  public void thread55609(int [] tdone, int [] ends){
        S52097=1;
    if(motorPos1On.getprestatus()){//sysj\plant.sysj line: 81, column: 14
      System.out.println("Conveyor plant - moving bottle to 1");//sysj\plant.sysj line: 82, column: 7
      bottleAtPos1.setPresent();//sysj\plant.sysj line: 84, column: 8
      currsigs.addElement(bottleAtPos1);
      active[3]=1;
      ends[3]=1;
      tdone[3]=1;
    }
    else {
      S52097=0;
      active[3]=0;
      ends[3]=0;
      tdone[3]=1;
    }
  }

  public void thread55608(int [] tdone, int [] ends){
        S52412=1;
    S52184=0;
    if(motConveyorOnOff.getprestatus()){//sysj\plant.sysj line: 78, column: 12
      S52182=0;
      __start_thread_2 = com.systemj.Timer.getMs();//sysj\plant.sysj line: 78, column: 29
      S52073=0;
      if(com.systemj.Timer.getMs() - __start_thread_2 >= (3) * 1000){//sysj\plant.sysj line: 78, column: 29
        ends[2]=2;
        ;//sysj\plant.sysj line: 78, column: 29
        S52182=1;
        thread55609(tdone,ends);
        thread55610(tdone,ends);
        int biggest55611 = 0;
        if(ends[3]>=biggest55611){
          biggest55611=ends[3];
        }
        if(ends[4]>=biggest55611){
          biggest55611=ends[4];
        }
        if(biggest55611 == 1){
          active[2]=1;
          ends[2]=1;
          tdone[2]=1;
        }
        //FINXME code
        if(biggest55611 == 0){
          S52184=1;
          active[2]=1;
          ends[2]=1;
          tdone[2]=1;
        }
      }
      else {
        S52073=1;
        active[2]=1;
        ends[2]=1;
        tdone[2]=1;
      }
    }
    else {
      S52184=1;
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
      switch(S55606){
        case 0 : 
          S55606=0;
          break RUN;
        
        case 1 : 
          S55606=2;
          S55606=2;
          capDec_1.setClear();//sysj\plant.sysj line: 69, column: 2
          capPos_1.setClear();//sysj\plant.sysj line: 70, column: 2
          capPos_1.setPresent();//sysj\plant.sysj line: 71, column: 2
          currsigs.addElement(capPos_1);
          capPos_1.setValue(0);//sysj\plant.sysj line: 71, column: 2
          disablePos5_1.setClear();//sysj\plant.sysj line: 72, column: 2
          thread55608(tdone,ends);
          thread55612(tdone,ends);
          thread55613(tdone,ends);
          thread55619(tdone,ends);
          thread55620(tdone,ends);
          thread55621(tdone,ends);
          thread55622(tdone,ends);
          thread55623(tdone,ends);
          thread55624(tdone,ends);
          thread55625(tdone,ends);
          thread55626(tdone,ends);
          thread55627(tdone,ends);
          thread55628(tdone,ends);
          thread55629(tdone,ends);
          thread55630(tdone,ends);
          thread55631(tdone,ends);
          thread55632(tdone,ends);
          thread55633(tdone,ends);
          int biggest55634 = 0;
          if(ends[2]>=biggest55634){
            biggest55634=ends[2];
          }
          if(ends[5]>=biggest55634){
            biggest55634=ends[5];
          }
          if(ends[6]>=biggest55634){
            biggest55634=ends[6];
          }
          if(ends[11]>=biggest55634){
            biggest55634=ends[11];
          }
          if(ends[12]>=biggest55634){
            biggest55634=ends[12];
          }
          if(ends[13]>=biggest55634){
            biggest55634=ends[13];
          }
          if(ends[14]>=biggest55634){
            biggest55634=ends[14];
          }
          if(ends[15]>=biggest55634){
            biggest55634=ends[15];
          }
          if(ends[16]>=biggest55634){
            biggest55634=ends[16];
          }
          if(ends[17]>=biggest55634){
            biggest55634=ends[17];
          }
          if(ends[18]>=biggest55634){
            biggest55634=ends[18];
          }
          if(ends[19]>=biggest55634){
            biggest55634=ends[19];
          }
          if(ends[20]>=biggest55634){
            biggest55634=ends[20];
          }
          if(ends[21]>=biggest55634){
            biggest55634=ends[21];
          }
          if(ends[22]>=biggest55634){
            biggest55634=ends[22];
          }
          if(ends[23]>=biggest55634){
            biggest55634=ends[23];
          }
          if(ends[24]>=biggest55634){
            biggest55634=ends[24];
          }
          if(ends[25]>=biggest55634){
            biggest55634=ends[25];
          }
          if(biggest55634 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
        
        case 2 : 
          capDec_1.setClear();//sysj\plant.sysj line: 69, column: 2
          capPos_1.setClear();//sysj\plant.sysj line: 70, column: 2
          disablePos5_1.setClear();//sysj\plant.sysj line: 72, column: 2
          thread55635(tdone,ends);
          thread55648(tdone,ends);
          thread55649(tdone,ends);
          thread55655(tdone,ends);
          thread55656(tdone,ends);
          thread55657(tdone,ends);
          thread55658(tdone,ends);
          thread55659(tdone,ends);
          thread55660(tdone,ends);
          thread55661(tdone,ends);
          thread55662(tdone,ends);
          thread55663(tdone,ends);
          thread55664(tdone,ends);
          thread55665(tdone,ends);
          thread55666(tdone,ends);
          thread55667(tdone,ends);
          thread55668(tdone,ends);
          thread55669(tdone,ends);
          int biggest55670 = 0;
          if(ends[2]>=biggest55670){
            biggest55670=ends[2];
          }
          if(ends[5]>=biggest55670){
            biggest55670=ends[5];
          }
          if(ends[6]>=biggest55670){
            biggest55670=ends[6];
          }
          if(ends[11]>=biggest55670){
            biggest55670=ends[11];
          }
          if(ends[12]>=biggest55670){
            biggest55670=ends[12];
          }
          if(ends[13]>=biggest55670){
            biggest55670=ends[13];
          }
          if(ends[14]>=biggest55670){
            biggest55670=ends[14];
          }
          if(ends[15]>=biggest55670){
            biggest55670=ends[15];
          }
          if(ends[16]>=biggest55670){
            biggest55670=ends[16];
          }
          if(ends[17]>=biggest55670){
            biggest55670=ends[17];
          }
          if(ends[18]>=biggest55670){
            biggest55670=ends[18];
          }
          if(ends[19]>=biggest55670){
            biggest55670=ends[19];
          }
          if(ends[20]>=biggest55670){
            biggest55670=ends[20];
          }
          if(ends[21]>=biggest55670){
            biggest55670=ends[21];
          }
          if(ends[22]>=biggest55670){
            biggest55670=ends[22];
          }
          if(ends[23]>=biggest55670){
            biggest55670=ends[23];
          }
          if(ends[24]>=biggest55670){
            biggest55670=ends[24];
          }
          if(ends[25]>=biggest55670){
            biggest55670=ends[25];
          }
          if(biggest55670 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
          //FINXME code
          if(biggest55670 == 0){
            S55606=0;
            active[1]=0;
            ends[1]=0;
            S55606=0;
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
