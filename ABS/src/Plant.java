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
  private int S49965 = 1;
  private int S47752 = 1;
  private int S47698 = 1;
  private int S47684 = 1;
  private int S47696 = 1;
  private int S47760 = 1;
  private int S47754 = 1;
  private int S47910 = 1;
  private int S47770 = 1;
  private int S47764 = 1;
  private int S47778 = 1;
  private int S47772 = 1;
  private int S47798 = 1;
  private int S47784 = 1;
  private int S47908 = 1;
  private int S47834 = 1;
  private int S47975 = 1;
  private int S47931 = 1;
  private int S48016 = 1;
  private int S47980 = 1;
  private int S48036 = 1;
  private int S48022 = 1;
  private int S48104 = 1;
  private int S48058 = 1;
  private int S48040 = 1;
  private int S48166 = 1;
  private int S48198 = 1;
  private int S48176 = 1;
  private int S48239 = 1;
  private int S48211 = 1;
  private int S48271 = 1;
  private int S48249 = 1;
  private int S48336 = 1;
  private int S48292 = 1;
  private int S48368 = 1;
  private int S48346 = 1;
  private int S48697 = 1;
  private int S48477 = 1;
  private int S48729 = 1;
  private int S48707 = 1;
  private int S48758 = 1;
  private int S48738 = 1;
  private int S48787 = 1;
  private int S48767 = 1;
  private int S48816 = 1;
  private int S48796 = 1;
  
  private int[] ends = new int[26];
  private int[] tdone = new int[26];
  
  public void thread50022(int [] tdone, int [] ends){
        switch(S48816){
      case 0 : 
        active[25]=0;
        ends[25]=0;
        tdone[25]=1;
        break;
      
      case 1 : 
        switch(S48796){
          case 0 : 
            bottleAtPos2.setPresent();//sysj\plant.sysj line: 373, column: 82
            currsigs.addElement(bottleAtPos2);
            active[25]=1;
            ends[25]=1;
            tdone[25]=1;
            break;
          
          case 1 : 
            S48796=1;
            S48796=0;
            if(moveToPos2.getprestatus()){//sysj\plant.sysj line: 373, column: 24
              System.out.println("bottle is now at pos 2");//sysj\plant.sysj line: 373, column: 36
              bottleAtPos2.setPresent();//sysj\plant.sysj line: 373, column: 82
              currsigs.addElement(bottleAtPos2);
              active[25]=1;
              ends[25]=1;
              tdone[25]=1;
            }
            else {
              S48796=1;
              active[25]=1;
              ends[25]=1;
              tdone[25]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread50021(int [] tdone, int [] ends){
        switch(S48787){
      case 0 : 
        active[24]=0;
        ends[24]=0;
        tdone[24]=1;
        break;
      
      case 1 : 
        switch(S48767){
          case 0 : 
            bottleAtPos3.setPresent();//sysj\plant.sysj line: 371, column: 82
            currsigs.addElement(bottleAtPos3);
            active[24]=1;
            ends[24]=1;
            tdone[24]=1;
            break;
          
          case 1 : 
            S48767=1;
            S48767=0;
            if(moveToPos3.getprestatus()){//sysj\plant.sysj line: 371, column: 24
              System.out.println("bottle is now at pos 3");//sysj\plant.sysj line: 371, column: 36
              bottleAtPos3.setPresent();//sysj\plant.sysj line: 371, column: 82
              currsigs.addElement(bottleAtPos3);
              active[24]=1;
              ends[24]=1;
              tdone[24]=1;
            }
            else {
              S48767=1;
              active[24]=1;
              ends[24]=1;
              tdone[24]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread50020(int [] tdone, int [] ends){
        switch(S48758){
      case 0 : 
        active[23]=0;
        ends[23]=0;
        tdone[23]=1;
        break;
      
      case 1 : 
        switch(S48738){
          case 0 : 
            bottleAtPos4.setPresent();//sysj\plant.sysj line: 369, column: 82
            currsigs.addElement(bottleAtPos4);
            active[23]=1;
            ends[23]=1;
            tdone[23]=1;
            break;
          
          case 1 : 
            S48738=1;
            S48738=0;
            if(moveToPos4.getprestatus()){//sysj\plant.sysj line: 369, column: 24
              System.out.println("bottle is now at pos 4");//sysj\plant.sysj line: 369, column: 36
              bottleAtPos4.setPresent();//sysj\plant.sysj line: 369, column: 82
              currsigs.addElement(bottleAtPos4);
              active[23]=1;
              ends[23]=1;
              tdone[23]=1;
            }
            else {
              S48738=1;
              active[23]=1;
              ends[23]=1;
              tdone[23]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread50019(int [] tdone, int [] ends){
        switch(S48729){
      case 0 : 
        active[22]=0;
        ends[22]=0;
        tdone[22]=1;
        break;
      
      case 1 : 
        switch(S48707){
          case 0 : 
            if(bottleLeftPos5.getprestatus()){//sysj\plant.sysj line: 359, column: 10
              S48707=1;
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
            S48707=1;
            S48707=0;
            if(moveToPos5.getprestatus()){//sysj\plant.sysj line: 360, column: 13
              System.out.println("bottle is now at pos 5");//sysj\plant.sysj line: 361, column: 6
              bottleAtPos5.setPresent();//sysj\plant.sysj line: 362, column: 6
              currsigs.addElement(bottleAtPos5);
              active[22]=1;
              ends[22]=1;
              tdone[22]=1;
            }
            else {
              S48707=1;
              active[22]=1;
              ends[22]=1;
              tdone[22]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread50018(int [] tdone, int [] ends){
        switch(S48697){
      case 0 : 
        active[21]=0;
        ends[21]=0;
        tdone[21]=1;
        break;
      
      case 1 : 
        switch(S48477){
          case 0 : 
            if(!rotaryTableTrigger.getprestatus()){//sysj\plant.sysj line: 347, column: 11
              S48477=1;
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
            S48477=1;
            S48477=0;
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
              S48477=1;
              active[21]=1;
              ends[21]=1;
              tdone[21]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread50017(int [] tdone, int [] ends){
        switch(S48368){
      case 0 : 
        active[20]=0;
        ends[20]=0;
        tdone[20]=1;
        break;
      
      case 1 : 
        switch(S48346){
          case 0 : 
            if(cylClampBottleExtend.getprestatus()){//sysj\plant.sysj line: 305, column: 11
              S48346=1;
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
              S48346=2;
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
            S48346=2;
            S48346=0;
            active[20]=1;
            ends[20]=1;
            tdone[20]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread50016(int [] tdone, int [] ends){
        switch(S48336){
      case 0 : 
        active[19]=0;
        ends[19]=0;
        tdone[19]=1;
        break;
      
      case 1 : 
        switch(S48292){
          case 0 : 
            if(gripperTurnRetract.getprestatus()){//sysj\plant.sysj line: 289, column: 13
              S48292=1;
              if(gripperTurnRetract.getprestatus() && !gripperTurnExtend.getprestatus()){//sysj\plant.sysj line: 293, column: 13
                gripperTurnHomePos.setPresent();//sysj\plant.sysj line: 295, column: 7
                currsigs.addElement(gripperTurnHomePos);
                active[19]=1;
                ends[19]=1;
                tdone[19]=1;
              }
              else {
                S48292=2;
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
              S48292=2;
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
            S48292=2;
            S48292=0;
            if(gripperTurnExtend.getprestatus() && !gripperTurnRetract.getprestatus()){//sysj\plant.sysj line: 288, column: 13
              gripperTurnFinalPos.setPresent();//sysj\plant.sysj line: 290, column: 7
              currsigs.addElement(gripperTurnFinalPos);
              active[19]=1;
              ends[19]=1;
              tdone[19]=1;
            }
            else {
              S48292=1;
              if(gripperTurnRetract.getprestatus() && !gripperTurnExtend.getprestatus()){//sysj\plant.sysj line: 293, column: 13
                gripperTurnHomePos.setPresent();//sysj\plant.sysj line: 295, column: 7
                currsigs.addElement(gripperTurnHomePos);
                active[19]=1;
                ends[19]=1;
                tdone[19]=1;
              }
              else {
                S48292=2;
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

  public void thread50015(int [] tdone, int [] ends){
        switch(S48271){
      case 0 : 
        active[18]=0;
        ends[18]=0;
        tdone[18]=1;
        break;
      
      case 1 : 
        switch(S48249){
          case 0 : 
            if(capGripperPos5Extend.getprestatus()){//sysj\plant.sysj line: 277, column: 11
              S48249=1;
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
              S48249=2;
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
            S48249=2;
            S48249=0;
            active[18]=1;
            ends[18]=1;
            tdone[18]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread50014(int [] tdone, int [] ends){
        switch(S48239){
      case 0 : 
        active[17]=0;
        ends[17]=0;
        tdone[17]=1;
        break;
      
      case 1 : 
        switch(S48211){
          case 0 : 
            if(cylPos5ZAxisExtend.getprestatus()){//sysj\plant.sysj line: 264, column: 11
              S48211=1;
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
              S48211=2;
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
            S48211=2;
            S48211=0;
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

  public void thread50013(int [] tdone, int [] ends){
        switch(S48198){
      case 0 : 
        active[16]=0;
        ends[16]=0;
        tdone[16]=1;
        break;
      
      case 1 : 
        switch(S48176){
          case 0 : 
            if(moveToPos4.getprestatus()){//sysj\plant.sysj line: 253, column: 11
              S48176=1;
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
              S48176=2;
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
            S48176=2;
            S48176=0;
            active[16]=1;
            ends[16]=1;
            tdone[16]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread50012(int [] tdone, int [] ends){
        switch(S48166){
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

  public void thread50011(int [] tdone, int [] ends){
        switch(S48104){
      case 0 : 
        active[14]=0;
        ends[14]=0;
        tdone[14]=1;
        break;
      
      case 1 : 
        switch(S48058){
          case 0 : 
            if(magEmpty.getprestatus()){//sysj\plant.sysj line: 219, column: 10
              S48058=1;
              active[14]=1;
              ends[14]=1;
              tdone[14]=1;
            }
            else {
              switch(S48040){
                case 0 : 
                  if(pusherRetracted.getprestatus()){//sysj\plant.sysj line: 221, column: 13
                    S48040=1;
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
                    S48040=2;
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
                    S48040=3;
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
                  S48040=3;
                  S48040=0;
                  active[14]=1;
                  ends[14]=1;
                  tdone[14]=1;
                  break;
                
              }
            }
            break;
          
          case 1 : 
            if(magReq.getprestatus()){//sysj\plant.sysj line: 228, column: 10
              S48058=2;
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
            S48058=2;
            S48058=0;
            S48040=0;
            active[14]=1;
            ends[14]=1;
            tdone[14]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread50010(int [] tdone, int [] ends){
        switch(S48036){
      case 0 : 
        active[13]=0;
        ends[13]=0;
        tdone[13]=1;
        break;
      
      case 1 : 
        switch(S48022){
          case 0 : 
            if(magEmpty.getprestatus() || !vacOn.getprestatus()){//sysj\plant.sysj line: 209, column: 11
              S48022=1;
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
            S48022=1;
            S48022=0;
            if(vacOn.getprestatus() && armAtSource.getprestatus()){//sysj\plant.sysj line: 208, column: 12
              WPgripped.setPresent();//sysj\plant.sysj line: 210, column: 6
              currsigs.addElement(WPgripped);
              active[13]=1;
              ends[13]=1;
              tdone[13]=1;
            }
            else {
              S48022=1;
              active[13]=1;
              ends[13]=1;
              tdone[13]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread50009(int [] tdone, int [] ends){
        switch(S48016){
      case 0 : 
        active[12]=0;
        ends[12]=0;
        tdone[12]=1;
        break;
      
      case 1 : 
        switch(S47980){
          case 0 : 
            if(pusherExtend.getprestatus()){//sysj\plant.sysj line: 195, column: 10
              System.out.println("Aborted");//sysj\plant.sysj line: 198, column: 4
              S47980=1;
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
              S47980=2;
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
            S47980=2;
            S47980=0;
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

  public void thread50008(int [] tdone, int [] ends){
        switch(S47975){
      case 0 : 
        active[11]=0;
        ends[11]=0;
        tdone[11]=1;
        break;
      
      case 1 : 
        switch(S47931){
          case 0 : 
            if(armDest.getprestatus()){//sysj\plant.sysj line: 180, column: 12
              S47931=1;
              if(armDest.getprestatus() && !armSource.getprestatus()){//sysj\plant.sysj line: 184, column: 12
                armAtDest.setPresent();//sysj\plant.sysj line: 186, column: 6
                currsigs.addElement(armAtDest);
                active[11]=1;
                ends[11]=1;
                tdone[11]=1;
              }
              else {
                S47931=2;
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
              S47931=2;
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
            S47931=2;
            S47931=0;
            if(armSource.getprestatus() && !armDest.getprestatus()){//sysj\plant.sysj line: 179, column: 12
              armAtSource.setPresent();//sysj\plant.sysj line: 181, column: 6
              currsigs.addElement(armAtSource);
              active[11]=1;
              ends[11]=1;
              tdone[11]=1;
            }
            else {
              S47931=1;
              if(armDest.getprestatus() && !armSource.getprestatus()){//sysj\plant.sysj line: 184, column: 12
                armAtDest.setPresent();//sysj\plant.sysj line: 186, column: 6
                currsigs.addElement(armAtDest);
                active[11]=1;
                ends[11]=1;
                tdone[11]=1;
              }
              else {
                S47931=2;
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

  public void thread50006(int [] tdone, int [] ends){
        switch(S47908){
      case 0 : 
        active[10]=0;
        ends[10]=0;
        tdone[10]=1;
        break;
      
      case 1 : 
        switch(S47834){
          case 0 : 
            if(dosUnitValveRetract.getprestatus()){//sysj\plant.sysj line: 156, column: 13
              S47834=1;
              if(dosUnitValveRetract.getprestatus() && !dosUnitValveExtend.getprestatus()){//sysj\plant.sysj line: 160, column: 13
                System.out.println("FillerPlant: Filling with canister " + (canister_1.getpreval() == null ? 0 : ((Integer)canister_1.getpreval()).intValue()) + " Percent: " + (percent_1.getpreval() == null ? 0 : ((Integer)percent_1.getpreval()).intValue()));//sysj\plant.sysj line: 161, column: 6
                dosUnitFilled.setPresent();//sysj\plant.sysj line: 163, column: 7
                currsigs.addElement(dosUnitFilled);
                active[10]=1;
                ends[10]=1;
                tdone[10]=1;
              }
              else {
                S47834=2;
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
              S47834=2;
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
            S47834=2;
            S47834=0;
            if(dosUnitValveExtend.getprestatus() && !dosUnitValveRetract.getprestatus()){//sysj\plant.sysj line: 155, column: 13
              dosUnitEvac.setPresent();//sysj\plant.sysj line: 157, column: 7
              currsigs.addElement(dosUnitEvac);
              active[10]=1;
              ends[10]=1;
              tdone[10]=1;
            }
            else {
              S47834=1;
              if(dosUnitValveRetract.getprestatus() && !dosUnitValveExtend.getprestatus()){//sysj\plant.sysj line: 160, column: 13
                System.out.println("FillerPlant: Filling with canister " + (canister_1.getpreval() == null ? 0 : ((Integer)canister_1.getpreval()).intValue()) + " Percent: " + (percent_1.getpreval() == null ? 0 : ((Integer)percent_1.getpreval()).intValue()));//sysj\plant.sysj line: 161, column: 6
                dosUnitFilled.setPresent();//sysj\plant.sysj line: 163, column: 7
                currsigs.addElement(dosUnitFilled);
                active[10]=1;
                ends[10]=1;
                tdone[10]=1;
              }
              else {
                S47834=2;
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

  public void thread50005(int [] tdone, int [] ends){
        switch(S47798){
      case 0 : 
        active[9]=0;
        ends[9]=0;
        tdone[9]=1;
        break;
      
      case 1 : 
        switch(S47784){
          case 0 : 
            if(!valveInjectorOnOff.getprestatus()){//sysj\plant.sysj line: 144, column: 12
              S47784=1;
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
            S47784=1;
            S47784=0;
            if(valveInjectorOnOff.getprestatus()){//sysj\plant.sysj line: 143, column: 13
              valveInjectorActive.setPresent();//sysj\plant.sysj line: 145, column: 7
              currsigs.addElement(valveInjectorActive);
              active[9]=1;
              ends[9]=1;
              tdone[9]=1;
            }
            else {
              S47784=1;
              active[9]=1;
              ends[9]=1;
              tdone[9]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread50004(int [] tdone, int [] ends){
        switch(S47778){
      case 0 : 
        active[8]=0;
        ends[8]=0;
        tdone[8]=1;
        break;
      
      case 1 : 
        switch(S47772){
          case 0 : 
            if(selectPercentage.getprestatus()){//sysj\plant.sysj line: 134, column: 11
              percent_1.setPresent();//sysj\plant.sysj line: 135, column: 5
              currsigs.addElement(percent_1);
              percent_1.setValue((selectPercentage.getpreval() == null ? null : ((Integer)selectPercentage.getpreval())));//sysj\plant.sysj line: 135, column: 5
              selectedPercentage.setPresent();//sysj\plant.sysj line: 136, column: 5
              currsigs.addElement(selectedPercentage);
              selectedPercentage.setValue((selectPercentage.getpreval() == null ? null : ((Integer)selectPercentage.getpreval())));//sysj\plant.sysj line: 136, column: 5
              S47772=1;
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
            S47772=1;
            S47772=0;
            active[8]=1;
            ends[8]=1;
            tdone[8]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread50003(int [] tdone, int [] ends){
        switch(S47770){
      case 0 : 
        active[7]=0;
        ends[7]=0;
        tdone[7]=1;
        break;
      
      case 1 : 
        switch(S47764){
          case 0 : 
            if(selectCanister.getprestatus()){//sysj\plant.sysj line: 124, column: 11
              canister_1.setPresent();//sysj\plant.sysj line: 125, column: 5
              currsigs.addElement(canister_1);
              canister_1.setValue((selectCanister.getpreval() == null ? null : ((Integer)selectCanister.getpreval())));//sysj\plant.sysj line: 125, column: 5
              selectedCanister.setPresent();//sysj\plant.sysj line: 126, column: 5
              currsigs.addElement(selectedCanister);
              selectedCanister.setValue((selectCanister.getpreval() == null ? null : ((Integer)selectCanister.getpreval())));//sysj\plant.sysj line: 126, column: 5
              S47764=1;
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
            S47764=1;
            S47764=0;
            active[7]=1;
            ends[7]=1;
            tdone[7]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread50002(int [] tdone, int [] ends){
        switch(S47910){
      case 0 : 
        active[6]=0;
        ends[6]=0;
        tdone[6]=1;
        break;
      
      case 1 : 
        canister_1.setClear();//sysj\plant.sysj line: 119, column: 3
        percent_1.setClear();//sysj\plant.sysj line: 120, column: 3
        thread50003(tdone,ends);
        thread50004(tdone,ends);
        thread50005(tdone,ends);
        thread50006(tdone,ends);
        int biggest50007 = 0;
        if(ends[7]>=biggest50007){
          biggest50007=ends[7];
        }
        if(ends[8]>=biggest50007){
          biggest50007=ends[8];
        }
        if(ends[9]>=biggest50007){
          biggest50007=ends[9];
        }
        if(ends[10]>=biggest50007){
          biggest50007=ends[10];
        }
        if(biggest50007 == 1){
          active[6]=1;
          ends[6]=1;
          tdone[6]=1;
        }
        //FINXME code
        if(biggest50007 == 0){
          S47910=0;
          active[6]=0;
          ends[6]=0;
          tdone[6]=1;
        }
        break;
      
    }
  }

  public void thread50001(int [] tdone, int [] ends){
        switch(S47760){
      case 0 : 
        active[5]=0;
        ends[5]=0;
        tdone[5]=1;
        break;
      
      case 1 : 
        switch(S47754){
          case 0 : 
            S47754=0;
            if(bottleAtPos1.getprestatus()){//sysj\plant.sysj line: 106, column: 12
              RTbottleAtPos1.setPresent();//sysj\plant.sysj line: 108, column: 5
              currsigs.addElement(RTbottleAtPos1);
              S47754=1;
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            else {
              S47754=1;
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            break;
          
          case 1 : 
            S47754=1;
            S47754=0;
            if(bottleAtPos1.getprestatus()){//sysj\plant.sysj line: 106, column: 12
              RTbottleAtPos1.setPresent();//sysj\plant.sysj line: 108, column: 5
              currsigs.addElement(RTbottleAtPos1);
              S47754=1;
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            else {
              S47754=1;
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread49999(int [] tdone, int [] ends){
        S47696=1;
    if(motorPos5On.getprestatus()){//sysj\plant.sysj line: 89, column: 14
      System.out.println("Conveyor Plant - moving bottle to leave 5");//sysj\plant.sysj line: 90, column: 7
      bottleLeftPos5.setPresent();//sysj\plant.sysj line: 92, column: 8
      currsigs.addElement(bottleLeftPos5);
      active[4]=1;
      ends[4]=1;
      tdone[4]=1;
    }
    else {
      S47696=0;
      active[4]=0;
      ends[4]=0;
      tdone[4]=1;
    }
  }

  public void thread49998(int [] tdone, int [] ends){
        S47684=1;
    if(motorPos1On.getprestatus()){//sysj\plant.sysj line: 80, column: 14
      System.out.println("Conveyor plant - moving bottle to 1");//sysj\plant.sysj line: 81, column: 7
      bottleAtPos1.setPresent();//sysj\plant.sysj line: 83, column: 8
      currsigs.addElement(bottleAtPos1);
      active[3]=1;
      ends[3]=1;
      tdone[3]=1;
    }
    else {
      S47684=0;
      active[3]=0;
      ends[3]=0;
      tdone[3]=1;
    }
  }

  public void thread49996(int [] tdone, int [] ends){
        switch(S47696){
      case 0 : 
        active[4]=0;
        ends[4]=0;
        tdone[4]=1;
        break;
      
      case 1 : 
        if(!motorPos5On.getprestatus() && !motConveyorOnOff.getprestatus()){//sysj\plant.sysj line: 91, column: 13
          S47696=0;
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

  public void thread49995(int [] tdone, int [] ends){
        switch(S47684){
      case 0 : 
        active[3]=0;
        ends[3]=0;
        tdone[3]=1;
        break;
      
      case 1 : 
        if(moveToPos2.getprestatus()){//sysj\plant.sysj line: 82, column: 13
          S47684=0;
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

  public void thread49994(int [] tdone, int [] ends){
        switch(S47752){
      case 0 : 
        active[2]=0;
        ends[2]=0;
        tdone[2]=1;
        break;
      
      case 1 : 
        switch(S47698){
          case 0 : 
            thread49995(tdone,ends);
            thread49996(tdone,ends);
            int biggest49997 = 0;
            if(ends[3]>=biggest49997){
              biggest49997=ends[3];
            }
            if(ends[4]>=biggest49997){
              biggest49997=ends[4];
            }
            if(biggest49997 == 1){
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            //FINXME code
            if(biggest49997 == 0){
              S47698=1;
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            break;
          
          case 1 : 
            S47698=1;
            S47698=0;
            if(motConveyorOnOff.getprestatus()){//sysj\plant.sysj line: 78, column: 12
              thread49998(tdone,ends);
              thread49999(tdone,ends);
              int biggest50000 = 0;
              if(ends[3]>=biggest50000){
                biggest50000=ends[3];
              }
              if(ends[4]>=biggest50000){
                biggest50000=ends[4];
              }
              if(biggest50000 == 1){
                active[2]=1;
                ends[2]=1;
                tdone[2]=1;
              }
              //FINXME code
              if(biggest50000 == 0){
                S47698=1;
                active[2]=1;
                ends[2]=1;
                tdone[2]=1;
              }
            }
            else {
              S47698=1;
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread49992(int [] tdone, int [] ends){
        S48816=1;
    S48796=0;
    if(moveToPos2.getprestatus()){//sysj\plant.sysj line: 373, column: 24
      System.out.println("bottle is now at pos 2");//sysj\plant.sysj line: 373, column: 36
      bottleAtPos2.setPresent();//sysj\plant.sysj line: 373, column: 82
      currsigs.addElement(bottleAtPos2);
      active[25]=1;
      ends[25]=1;
      tdone[25]=1;
    }
    else {
      S48796=1;
      active[25]=1;
      ends[25]=1;
      tdone[25]=1;
    }
  }

  public void thread49991(int [] tdone, int [] ends){
        S48787=1;
    S48767=0;
    if(moveToPos3.getprestatus()){//sysj\plant.sysj line: 371, column: 24
      System.out.println("bottle is now at pos 3");//sysj\plant.sysj line: 371, column: 36
      bottleAtPos3.setPresent();//sysj\plant.sysj line: 371, column: 82
      currsigs.addElement(bottleAtPos3);
      active[24]=1;
      ends[24]=1;
      tdone[24]=1;
    }
    else {
      S48767=1;
      active[24]=1;
      ends[24]=1;
      tdone[24]=1;
    }
  }

  public void thread49990(int [] tdone, int [] ends){
        S48758=1;
    S48738=0;
    if(moveToPos4.getprestatus()){//sysj\plant.sysj line: 369, column: 24
      System.out.println("bottle is now at pos 4");//sysj\plant.sysj line: 369, column: 36
      bottleAtPos4.setPresent();//sysj\plant.sysj line: 369, column: 82
      currsigs.addElement(bottleAtPos4);
      active[23]=1;
      ends[23]=1;
      tdone[23]=1;
    }
    else {
      S48738=1;
      active[23]=1;
      ends[23]=1;
      tdone[23]=1;
    }
  }

  public void thread49989(int [] tdone, int [] ends){
        S48729=1;
    S48707=0;
    if(moveToPos5.getprestatus()){//sysj\plant.sysj line: 360, column: 13
      System.out.println("bottle is now at pos 5");//sysj\plant.sysj line: 361, column: 6
      bottleAtPos5.setPresent();//sysj\plant.sysj line: 362, column: 6
      currsigs.addElement(bottleAtPos5);
      active[22]=1;
      ends[22]=1;
      tdone[22]=1;
    }
    else {
      S48707=1;
      active[22]=1;
      ends[22]=1;
      tdone[22]=1;
    }
  }

  public void thread49988(int [] tdone, int [] ends){
        S48697=1;
    S48477=0;
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
      S48477=1;
      active[21]=1;
      ends[21]=1;
      tdone[21]=1;
    }
  }

  public void thread49987(int [] tdone, int [] ends){
        S48368=1;
    S48346=0;
    active[20]=1;
    ends[20]=1;
    tdone[20]=1;
  }

  public void thread49986(int [] tdone, int [] ends){
        S48336=1;
    S48292=0;
    if(gripperTurnExtend.getprestatus() && !gripperTurnRetract.getprestatus()){//sysj\plant.sysj line: 288, column: 13
      gripperTurnFinalPos.setPresent();//sysj\plant.sysj line: 290, column: 7
      currsigs.addElement(gripperTurnFinalPos);
      active[19]=1;
      ends[19]=1;
      tdone[19]=1;
    }
    else {
      S48292=1;
      if(gripperTurnRetract.getprestatus() && !gripperTurnExtend.getprestatus()){//sysj\plant.sysj line: 293, column: 13
        gripperTurnHomePos.setPresent();//sysj\plant.sysj line: 295, column: 7
        currsigs.addElement(gripperTurnHomePos);
        active[19]=1;
        ends[19]=1;
        tdone[19]=1;
      }
      else {
        S48292=2;
        active[19]=1;
        ends[19]=1;
        tdone[19]=1;
      }
    }
  }

  public void thread49985(int [] tdone, int [] ends){
        S48271=1;
    S48249=0;
    active[18]=1;
    ends[18]=1;
    tdone[18]=1;
  }

  public void thread49984(int [] tdone, int [] ends){
        S48239=1;
    S48211=0;
    gripperZAxisLifted.setPresent();//sysj\plant.sysj line: 265, column: 6
    currsigs.addElement(gripperZAxisLifted);
    active[17]=1;
    ends[17]=1;
    tdone[17]=1;
  }

  public void thread49983(int [] tdone, int [] ends){
        S48198=1;
    S48176=0;
    active[16]=1;
    ends[16]=1;
    tdone[16]=1;
  }

  public void thread49982(int [] tdone, int [] ends){
        S48166=1;
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

  public void thread49981(int [] tdone, int [] ends){
        S48104=1;
    S48058=0;
    S48040=0;
    active[14]=1;
    ends[14]=1;
    tdone[14]=1;
  }

  public void thread49980(int [] tdone, int [] ends){
        S48036=1;
    S48022=0;
    if(vacOn.getprestatus() && armAtSource.getprestatus()){//sysj\plant.sysj line: 208, column: 12
      WPgripped.setPresent();//sysj\plant.sysj line: 210, column: 6
      currsigs.addElement(WPgripped);
      active[13]=1;
      ends[13]=1;
      tdone[13]=1;
    }
    else {
      S48022=1;
      active[13]=1;
      ends[13]=1;
      tdone[13]=1;
    }
  }

  public void thread49979(int [] tdone, int [] ends){
        S48016=1;
    S47980=0;
    pusherRetracted.setPresent();//sysj\plant.sysj line: 196, column: 5
    currsigs.addElement(pusherRetracted);
    active[12]=1;
    ends[12]=1;
    tdone[12]=1;
  }

  public void thread49978(int [] tdone, int [] ends){
        S47975=1;
    S47931=0;
    if(armSource.getprestatus() && !armDest.getprestatus()){//sysj\plant.sysj line: 179, column: 12
      armAtSource.setPresent();//sysj\plant.sysj line: 181, column: 6
      currsigs.addElement(armAtSource);
      active[11]=1;
      ends[11]=1;
      tdone[11]=1;
    }
    else {
      S47931=1;
      if(armDest.getprestatus() && !armSource.getprestatus()){//sysj\plant.sysj line: 184, column: 12
        armAtDest.setPresent();//sysj\plant.sysj line: 186, column: 6
        currsigs.addElement(armAtDest);
        active[11]=1;
        ends[11]=1;
        tdone[11]=1;
      }
      else {
        S47931=2;
        active[11]=1;
        ends[11]=1;
        tdone[11]=1;
      }
    }
  }

  public void thread49976(int [] tdone, int [] ends){
        S47908=1;
    S47834=0;
    if(dosUnitValveExtend.getprestatus() && !dosUnitValveRetract.getprestatus()){//sysj\plant.sysj line: 155, column: 13
      dosUnitEvac.setPresent();//sysj\plant.sysj line: 157, column: 7
      currsigs.addElement(dosUnitEvac);
      active[10]=1;
      ends[10]=1;
      tdone[10]=1;
    }
    else {
      S47834=1;
      if(dosUnitValveRetract.getprestatus() && !dosUnitValveExtend.getprestatus()){//sysj\plant.sysj line: 160, column: 13
        System.out.println("FillerPlant: Filling with canister " + (canister_1.getpreval() == null ? 0 : ((Integer)canister_1.getpreval()).intValue()) + " Percent: " + (percent_1.getpreval() == null ? 0 : ((Integer)percent_1.getpreval()).intValue()));//sysj\plant.sysj line: 161, column: 6
        dosUnitFilled.setPresent();//sysj\plant.sysj line: 163, column: 7
        currsigs.addElement(dosUnitFilled);
        active[10]=1;
        ends[10]=1;
        tdone[10]=1;
      }
      else {
        S47834=2;
        active[10]=1;
        ends[10]=1;
        tdone[10]=1;
      }
    }
  }

  public void thread49975(int [] tdone, int [] ends){
        S47798=1;
    S47784=0;
    if(valveInjectorOnOff.getprestatus()){//sysj\plant.sysj line: 143, column: 13
      valveInjectorActive.setPresent();//sysj\plant.sysj line: 145, column: 7
      currsigs.addElement(valveInjectorActive);
      active[9]=1;
      ends[9]=1;
      tdone[9]=1;
    }
    else {
      S47784=1;
      active[9]=1;
      ends[9]=1;
      tdone[9]=1;
    }
  }

  public void thread49974(int [] tdone, int [] ends){
        S47778=1;
    S47772=0;
    active[8]=1;
    ends[8]=1;
    tdone[8]=1;
  }

  public void thread49973(int [] tdone, int [] ends){
        S47770=1;
    S47764=0;
    active[7]=1;
    ends[7]=1;
    tdone[7]=1;
  }

  public void thread49972(int [] tdone, int [] ends){
        S47910=1;
    canister_1.setClear();//sysj\plant.sysj line: 119, column: 3
    percent_1.setClear();//sysj\plant.sysj line: 120, column: 3
    thread49973(tdone,ends);
    thread49974(tdone,ends);
    thread49975(tdone,ends);
    thread49976(tdone,ends);
    int biggest49977 = 0;
    if(ends[7]>=biggest49977){
      biggest49977=ends[7];
    }
    if(ends[8]>=biggest49977){
      biggest49977=ends[8];
    }
    if(ends[9]>=biggest49977){
      biggest49977=ends[9];
    }
    if(ends[10]>=biggest49977){
      biggest49977=ends[10];
    }
    if(biggest49977 == 1){
      active[6]=1;
      ends[6]=1;
      tdone[6]=1;
    }
  }

  public void thread49971(int [] tdone, int [] ends){
        S47760=1;
    S47754=0;
    if(bottleAtPos1.getprestatus()){//sysj\plant.sysj line: 106, column: 12
      RTbottleAtPos1.setPresent();//sysj\plant.sysj line: 108, column: 5
      currsigs.addElement(RTbottleAtPos1);
      S47754=1;
      active[5]=1;
      ends[5]=1;
      tdone[5]=1;
    }
    else {
      S47754=1;
      active[5]=1;
      ends[5]=1;
      tdone[5]=1;
    }
  }

  public void thread49969(int [] tdone, int [] ends){
        S47696=1;
    if(motorPos5On.getprestatus()){//sysj\plant.sysj line: 89, column: 14
      System.out.println("Conveyor Plant - moving bottle to leave 5");//sysj\plant.sysj line: 90, column: 7
      bottleLeftPos5.setPresent();//sysj\plant.sysj line: 92, column: 8
      currsigs.addElement(bottleLeftPos5);
      active[4]=1;
      ends[4]=1;
      tdone[4]=1;
    }
    else {
      S47696=0;
      active[4]=0;
      ends[4]=0;
      tdone[4]=1;
    }
  }

  public void thread49968(int [] tdone, int [] ends){
        S47684=1;
    if(motorPos1On.getprestatus()){//sysj\plant.sysj line: 80, column: 14
      System.out.println("Conveyor plant - moving bottle to 1");//sysj\plant.sysj line: 81, column: 7
      bottleAtPos1.setPresent();//sysj\plant.sysj line: 83, column: 8
      currsigs.addElement(bottleAtPos1);
      active[3]=1;
      ends[3]=1;
      tdone[3]=1;
    }
    else {
      S47684=0;
      active[3]=0;
      ends[3]=0;
      tdone[3]=1;
    }
  }

  public void thread49967(int [] tdone, int [] ends){
        S47752=1;
    S47698=0;
    if(motConveyorOnOff.getprestatus()){//sysj\plant.sysj line: 78, column: 12
      thread49968(tdone,ends);
      thread49969(tdone,ends);
      int biggest49970 = 0;
      if(ends[3]>=biggest49970){
        biggest49970=ends[3];
      }
      if(ends[4]>=biggest49970){
        biggest49970=ends[4];
      }
      if(biggest49970 == 1){
        active[2]=1;
        ends[2]=1;
        tdone[2]=1;
      }
      //FINXME code
      if(biggest49970 == 0){
        S47698=1;
        active[2]=1;
        ends[2]=1;
        tdone[2]=1;
      }
    }
    else {
      S47698=1;
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
      switch(S49965){
        case 0 : 
          S49965=0;
          break RUN;
        
        case 1 : 
          S49965=2;
          S49965=2;
          capDec_1.setClear();//sysj\plant.sysj line: 69, column: 2
          capPos_1.setClear();//sysj\plant.sysj line: 70, column: 2
          capPos_1.setPresent();//sysj\plant.sysj line: 71, column: 2
          currsigs.addElement(capPos_1);
          capPos_1.setValue(0);//sysj\plant.sysj line: 71, column: 2
          disablePos5_1.setClear();//sysj\plant.sysj line: 72, column: 2
          thread49967(tdone,ends);
          thread49971(tdone,ends);
          thread49972(tdone,ends);
          thread49978(tdone,ends);
          thread49979(tdone,ends);
          thread49980(tdone,ends);
          thread49981(tdone,ends);
          thread49982(tdone,ends);
          thread49983(tdone,ends);
          thread49984(tdone,ends);
          thread49985(tdone,ends);
          thread49986(tdone,ends);
          thread49987(tdone,ends);
          thread49988(tdone,ends);
          thread49989(tdone,ends);
          thread49990(tdone,ends);
          thread49991(tdone,ends);
          thread49992(tdone,ends);
          int biggest49993 = 0;
          if(ends[2]>=biggest49993){
            biggest49993=ends[2];
          }
          if(ends[5]>=biggest49993){
            biggest49993=ends[5];
          }
          if(ends[6]>=biggest49993){
            biggest49993=ends[6];
          }
          if(ends[11]>=biggest49993){
            biggest49993=ends[11];
          }
          if(ends[12]>=biggest49993){
            biggest49993=ends[12];
          }
          if(ends[13]>=biggest49993){
            biggest49993=ends[13];
          }
          if(ends[14]>=biggest49993){
            biggest49993=ends[14];
          }
          if(ends[15]>=biggest49993){
            biggest49993=ends[15];
          }
          if(ends[16]>=biggest49993){
            biggest49993=ends[16];
          }
          if(ends[17]>=biggest49993){
            biggest49993=ends[17];
          }
          if(ends[18]>=biggest49993){
            biggest49993=ends[18];
          }
          if(ends[19]>=biggest49993){
            biggest49993=ends[19];
          }
          if(ends[20]>=biggest49993){
            biggest49993=ends[20];
          }
          if(ends[21]>=biggest49993){
            biggest49993=ends[21];
          }
          if(ends[22]>=biggest49993){
            biggest49993=ends[22];
          }
          if(ends[23]>=biggest49993){
            biggest49993=ends[23];
          }
          if(ends[24]>=biggest49993){
            biggest49993=ends[24];
          }
          if(ends[25]>=biggest49993){
            biggest49993=ends[25];
          }
          if(biggest49993 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
        
        case 2 : 
          capDec_1.setClear();//sysj\plant.sysj line: 69, column: 2
          capPos_1.setClear();//sysj\plant.sysj line: 70, column: 2
          disablePos5_1.setClear();//sysj\plant.sysj line: 72, column: 2
          thread49994(tdone,ends);
          thread50001(tdone,ends);
          thread50002(tdone,ends);
          thread50008(tdone,ends);
          thread50009(tdone,ends);
          thread50010(tdone,ends);
          thread50011(tdone,ends);
          thread50012(tdone,ends);
          thread50013(tdone,ends);
          thread50014(tdone,ends);
          thread50015(tdone,ends);
          thread50016(tdone,ends);
          thread50017(tdone,ends);
          thread50018(tdone,ends);
          thread50019(tdone,ends);
          thread50020(tdone,ends);
          thread50021(tdone,ends);
          thread50022(tdone,ends);
          int biggest50023 = 0;
          if(ends[2]>=biggest50023){
            biggest50023=ends[2];
          }
          if(ends[5]>=biggest50023){
            biggest50023=ends[5];
          }
          if(ends[6]>=biggest50023){
            biggest50023=ends[6];
          }
          if(ends[11]>=biggest50023){
            biggest50023=ends[11];
          }
          if(ends[12]>=biggest50023){
            biggest50023=ends[12];
          }
          if(ends[13]>=biggest50023){
            biggest50023=ends[13];
          }
          if(ends[14]>=biggest50023){
            biggest50023=ends[14];
          }
          if(ends[15]>=biggest50023){
            biggest50023=ends[15];
          }
          if(ends[16]>=biggest50023){
            biggest50023=ends[16];
          }
          if(ends[17]>=biggest50023){
            biggest50023=ends[17];
          }
          if(ends[18]>=biggest50023){
            biggest50023=ends[18];
          }
          if(ends[19]>=biggest50023){
            biggest50023=ends[19];
          }
          if(ends[20]>=biggest50023){
            biggest50023=ends[20];
          }
          if(ends[21]>=biggest50023){
            biggest50023=ends[21];
          }
          if(ends[22]>=biggest50023){
            biggest50023=ends[22];
          }
          if(ends[23]>=biggest50023){
            biggest50023=ends[23];
          }
          if(ends[24]>=biggest50023){
            biggest50023=ends[24];
          }
          if(ends[25]>=biggest50023){
            biggest50023=ends[25];
          }
          if(biggest50023 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
          //FINXME code
          if(biggest50023 == 0){
            S49965=0;
            active[1]=0;
            ends[1]=0;
            S49965=0;
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
