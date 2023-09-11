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
  private int capcount_thread_15;//sysj\plant.sysj line: 236, column: 3
  private long __start_thread_2;//sysj\plant.sysj line: 78, column: 29
  private int S52654 = 1;
  private int S50180 = 1;
  private int S49952 = 1;
  private int S49950 = 1;
  private int S49841 = 1;
  private int S49865 = 1;
  private int S49877 = 1;
  private int S50188 = 1;
  private int S50338 = 1;
  private int S50198 = 1;
  private int S50192 = 1;
  private int S50206 = 1;
  private int S50200 = 1;
  private int S50226 = 1;
  private int S50212 = 1;
  private int S50336 = 1;
  private int S50262 = 1;
  private int S50403 = 1;
  private int S50359 = 1;
  private int S50444 = 1;
  private int S50408 = 1;
  private int S50464 = 1;
  private int S50450 = 1;
  private int S50532 = 1;
  private int S50486 = 1;
  private int S50468 = 1;
  private int S50594 = 1;
  private int S50626 = 1;
  private int S50604 = 1;
  private int S50667 = 1;
  private int S50639 = 1;
  private int S50699 = 1;
  private int S50677 = 1;
  private int S50764 = 1;
  private int S50720 = 1;
  private int S50796 = 1;
  private int S50774 = 1;
  private int S51125 = 1;
  private int S50905 = 1;
  private int S51157 = 1;
  private int S51135 = 1;
  private int S51186 = 1;
  private int S51166 = 1;
  private int S51215 = 1;
  private int S51195 = 1;
  private int S51244 = 1;
  private int S51224 = 1;
  
  private int[] ends = new int[26];
  private int[] tdone = new int[26];
  
  public void thread52717(int [] tdone, int [] ends){
        switch(S51244){
      case 0 : 
        active[25]=0;
        ends[25]=0;
        tdone[25]=1;
        break;
      
      case 1 : 
        switch(S51224){
          case 0 : 
            bottleAtPos2.setPresent();//sysj\plant.sysj line: 375, column: 82
            currsigs.addElement(bottleAtPos2);
            active[25]=1;
            ends[25]=1;
            tdone[25]=1;
            break;
          
          case 1 : 
            S51224=1;
            S51224=0;
            if(moveToPos2.getprestatus()){//sysj\plant.sysj line: 375, column: 24
              System.out.println("bottle is now at pos 2");//sysj\plant.sysj line: 375, column: 36
              bottleAtPos2.setPresent();//sysj\plant.sysj line: 375, column: 82
              currsigs.addElement(bottleAtPos2);
              active[25]=1;
              ends[25]=1;
              tdone[25]=1;
            }
            else {
              S51224=1;
              active[25]=1;
              ends[25]=1;
              tdone[25]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread52716(int [] tdone, int [] ends){
        switch(S51215){
      case 0 : 
        active[24]=0;
        ends[24]=0;
        tdone[24]=1;
        break;
      
      case 1 : 
        switch(S51195){
          case 0 : 
            bottleAtPos3.setPresent();//sysj\plant.sysj line: 373, column: 82
            currsigs.addElement(bottleAtPos3);
            active[24]=1;
            ends[24]=1;
            tdone[24]=1;
            break;
          
          case 1 : 
            S51195=1;
            S51195=0;
            if(moveToPos3.getprestatus()){//sysj\plant.sysj line: 373, column: 24
              System.out.println("bottle is now at pos 3");//sysj\plant.sysj line: 373, column: 36
              bottleAtPos3.setPresent();//sysj\plant.sysj line: 373, column: 82
              currsigs.addElement(bottleAtPos3);
              active[24]=1;
              ends[24]=1;
              tdone[24]=1;
            }
            else {
              S51195=1;
              active[24]=1;
              ends[24]=1;
              tdone[24]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread52715(int [] tdone, int [] ends){
        switch(S51186){
      case 0 : 
        active[23]=0;
        ends[23]=0;
        tdone[23]=1;
        break;
      
      case 1 : 
        switch(S51166){
          case 0 : 
            bottleAtPos4.setPresent();//sysj\plant.sysj line: 371, column: 82
            currsigs.addElement(bottleAtPos4);
            active[23]=1;
            ends[23]=1;
            tdone[23]=1;
            break;
          
          case 1 : 
            S51166=1;
            S51166=0;
            if(moveToPos4.getprestatus()){//sysj\plant.sysj line: 371, column: 24
              System.out.println("bottle is now at pos 4");//sysj\plant.sysj line: 371, column: 36
              bottleAtPos4.setPresent();//sysj\plant.sysj line: 371, column: 82
              currsigs.addElement(bottleAtPos4);
              active[23]=1;
              ends[23]=1;
              tdone[23]=1;
            }
            else {
              S51166=1;
              active[23]=1;
              ends[23]=1;
              tdone[23]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread52714(int [] tdone, int [] ends){
        switch(S51157){
      case 0 : 
        active[22]=0;
        ends[22]=0;
        tdone[22]=1;
        break;
      
      case 1 : 
        switch(S51135){
          case 0 : 
            if(bottleLeftPos5.getprestatus()){//sysj\plant.sysj line: 361, column: 10
              S51135=1;
              active[22]=1;
              ends[22]=1;
              tdone[22]=1;
            }
            else {
              bottleAtPos5.setPresent();//sysj\plant.sysj line: 364, column: 6
              currsigs.addElement(bottleAtPos5);
              active[22]=1;
              ends[22]=1;
              tdone[22]=1;
            }
            break;
          
          case 1 : 
            S51135=1;
            S51135=0;
            if(moveToPos5.getprestatus()){//sysj\plant.sysj line: 362, column: 13
              System.out.println("bottle is now at pos 5");//sysj\plant.sysj line: 363, column: 6
              bottleAtPos5.setPresent();//sysj\plant.sysj line: 364, column: 6
              currsigs.addElement(bottleAtPos5);
              active[22]=1;
              ends[22]=1;
              tdone[22]=1;
            }
            else {
              S51135=1;
              active[22]=1;
              ends[22]=1;
              tdone[22]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread52713(int [] tdone, int [] ends){
        switch(S51125){
      case 0 : 
        active[21]=0;
        ends[21]=0;
        tdone[21]=1;
        break;
      
      case 1 : 
        switch(S50905){
          case 0 : 
            if(!rotaryTableTrigger.getprestatus()){//sysj\plant.sysj line: 349, column: 11
              S50905=1;
              active[21]=1;
              ends[21]=1;
              tdone[21]=1;
            }
            else {
              tableAlignedWithSensor.setPresent();//sysj\plant.sysj line: 350, column: 6
              currsigs.addElement(tableAlignedWithSensor);
              active[21]=1;
              ends[21]=1;
              tdone[21]=1;
            }
            break;
          
          case 1 : 
            S50905=1;
            S50905=0;
            if(rotaryTableTrigger.getprestatus()){//sysj\plant.sysj line: 318, column: 12
              System.out.println("table triggered now moving");//sysj\plant.sysj line: 322, column: 5
              if(bottleAtPos4.getprestatus()){//sysj\plant.sysj line: 325, column: 13
                System.out.println("moving bottle at pos 4 to pos 5");//sysj\plant.sysj line: 326, column: 6
                moveToPos5.setPresent();//sysj\plant.sysj line: 327, column: 6
                currsigs.addElement(moveToPos5);
                if(bottleAtPos3.getprestatus()){//sysj\plant.sysj line: 331, column: 13
                  System.out.println("moving bottle at pos 3 to pos 4");//sysj\plant.sysj line: 332, column: 6
                  moveToPos4.setPresent();//sysj\plant.sysj line: 333, column: 6
                  currsigs.addElement(moveToPos4);
                  if(bottleAtPos2.getprestatus()){//sysj\plant.sysj line: 337, column: 13
                    System.out.println("moving bottle at pos 2 to pos 3");//sysj\plant.sysj line: 338, column: 6
                    moveToPos3.setPresent();//sysj\plant.sysj line: 339, column: 6
                    currsigs.addElement(moveToPos3);
                    if(bottleAtPos1.getprestatus()){//sysj\plant.sysj line: 342, column: 13
                      System.out.println("moving bottle at pos 1 to pos 2");//sysj\plant.sysj line: 343, column: 6
                      moveToPos2.setPresent();//sysj\plant.sysj line: 344, column: 6
                      currsigs.addElement(moveToPos2);
                      System.out.println("Table has been aligned");//sysj\plant.sysj line: 347, column: 5
                      tableAlignedWithSensor.setPresent();//sysj\plant.sysj line: 350, column: 6
                      currsigs.addElement(tableAlignedWithSensor);
                      active[21]=1;
                      ends[21]=1;
                      tdone[21]=1;
                    }
                    else {
                      System.out.println("Table has been aligned");//sysj\plant.sysj line: 347, column: 5
                      tableAlignedWithSensor.setPresent();//sysj\plant.sysj line: 350, column: 6
                      currsigs.addElement(tableAlignedWithSensor);
                      active[21]=1;
                      ends[21]=1;
                      tdone[21]=1;
                    }
                  }
                  else {
                    if(bottleAtPos1.getprestatus()){//sysj\plant.sysj line: 342, column: 13
                      System.out.println("moving bottle at pos 1 to pos 2");//sysj\plant.sysj line: 343, column: 6
                      moveToPos2.setPresent();//sysj\plant.sysj line: 344, column: 6
                      currsigs.addElement(moveToPos2);
                      System.out.println("Table has been aligned");//sysj\plant.sysj line: 347, column: 5
                      tableAlignedWithSensor.setPresent();//sysj\plant.sysj line: 350, column: 6
                      currsigs.addElement(tableAlignedWithSensor);
                      active[21]=1;
                      ends[21]=1;
                      tdone[21]=1;
                    }
                    else {
                      System.out.println("Table has been aligned");//sysj\plant.sysj line: 347, column: 5
                      tableAlignedWithSensor.setPresent();//sysj\plant.sysj line: 350, column: 6
                      currsigs.addElement(tableAlignedWithSensor);
                      active[21]=1;
                      ends[21]=1;
                      tdone[21]=1;
                    }
                  }
                }
                else {
                  if(bottleAtPos2.getprestatus()){//sysj\plant.sysj line: 337, column: 13
                    System.out.println("moving bottle at pos 2 to pos 3");//sysj\plant.sysj line: 338, column: 6
                    moveToPos3.setPresent();//sysj\plant.sysj line: 339, column: 6
                    currsigs.addElement(moveToPos3);
                    if(bottleAtPos1.getprestatus()){//sysj\plant.sysj line: 342, column: 13
                      System.out.println("moving bottle at pos 1 to pos 2");//sysj\plant.sysj line: 343, column: 6
                      moveToPos2.setPresent();//sysj\plant.sysj line: 344, column: 6
                      currsigs.addElement(moveToPos2);
                      System.out.println("Table has been aligned");//sysj\plant.sysj line: 347, column: 5
                      tableAlignedWithSensor.setPresent();//sysj\plant.sysj line: 350, column: 6
                      currsigs.addElement(tableAlignedWithSensor);
                      active[21]=1;
                      ends[21]=1;
                      tdone[21]=1;
                    }
                    else {
                      System.out.println("Table has been aligned");//sysj\plant.sysj line: 347, column: 5
                      tableAlignedWithSensor.setPresent();//sysj\plant.sysj line: 350, column: 6
                      currsigs.addElement(tableAlignedWithSensor);
                      active[21]=1;
                      ends[21]=1;
                      tdone[21]=1;
                    }
                  }
                  else {
                    if(bottleAtPos1.getprestatus()){//sysj\plant.sysj line: 342, column: 13
                      System.out.println("moving bottle at pos 1 to pos 2");//sysj\plant.sysj line: 343, column: 6
                      moveToPos2.setPresent();//sysj\plant.sysj line: 344, column: 6
                      currsigs.addElement(moveToPos2);
                      System.out.println("Table has been aligned");//sysj\plant.sysj line: 347, column: 5
                      tableAlignedWithSensor.setPresent();//sysj\plant.sysj line: 350, column: 6
                      currsigs.addElement(tableAlignedWithSensor);
                      active[21]=1;
                      ends[21]=1;
                      tdone[21]=1;
                    }
                    else {
                      System.out.println("Table has been aligned");//sysj\plant.sysj line: 347, column: 5
                      tableAlignedWithSensor.setPresent();//sysj\plant.sysj line: 350, column: 6
                      currsigs.addElement(tableAlignedWithSensor);
                      active[21]=1;
                      ends[21]=1;
                      tdone[21]=1;
                    }
                  }
                }
              }
              else {
                if(bottleAtPos3.getprestatus()){//sysj\plant.sysj line: 331, column: 13
                  System.out.println("moving bottle at pos 3 to pos 4");//sysj\plant.sysj line: 332, column: 6
                  moveToPos4.setPresent();//sysj\plant.sysj line: 333, column: 6
                  currsigs.addElement(moveToPos4);
                  if(bottleAtPos2.getprestatus()){//sysj\plant.sysj line: 337, column: 13
                    System.out.println("moving bottle at pos 2 to pos 3");//sysj\plant.sysj line: 338, column: 6
                    moveToPos3.setPresent();//sysj\plant.sysj line: 339, column: 6
                    currsigs.addElement(moveToPos3);
                    if(bottleAtPos1.getprestatus()){//sysj\plant.sysj line: 342, column: 13
                      System.out.println("moving bottle at pos 1 to pos 2");//sysj\plant.sysj line: 343, column: 6
                      moveToPos2.setPresent();//sysj\plant.sysj line: 344, column: 6
                      currsigs.addElement(moveToPos2);
                      System.out.println("Table has been aligned");//sysj\plant.sysj line: 347, column: 5
                      tableAlignedWithSensor.setPresent();//sysj\plant.sysj line: 350, column: 6
                      currsigs.addElement(tableAlignedWithSensor);
                      active[21]=1;
                      ends[21]=1;
                      tdone[21]=1;
                    }
                    else {
                      System.out.println("Table has been aligned");//sysj\plant.sysj line: 347, column: 5
                      tableAlignedWithSensor.setPresent();//sysj\plant.sysj line: 350, column: 6
                      currsigs.addElement(tableAlignedWithSensor);
                      active[21]=1;
                      ends[21]=1;
                      tdone[21]=1;
                    }
                  }
                  else {
                    if(bottleAtPos1.getprestatus()){//sysj\plant.sysj line: 342, column: 13
                      System.out.println("moving bottle at pos 1 to pos 2");//sysj\plant.sysj line: 343, column: 6
                      moveToPos2.setPresent();//sysj\plant.sysj line: 344, column: 6
                      currsigs.addElement(moveToPos2);
                      System.out.println("Table has been aligned");//sysj\plant.sysj line: 347, column: 5
                      tableAlignedWithSensor.setPresent();//sysj\plant.sysj line: 350, column: 6
                      currsigs.addElement(tableAlignedWithSensor);
                      active[21]=1;
                      ends[21]=1;
                      tdone[21]=1;
                    }
                    else {
                      System.out.println("Table has been aligned");//sysj\plant.sysj line: 347, column: 5
                      tableAlignedWithSensor.setPresent();//sysj\plant.sysj line: 350, column: 6
                      currsigs.addElement(tableAlignedWithSensor);
                      active[21]=1;
                      ends[21]=1;
                      tdone[21]=1;
                    }
                  }
                }
                else {
                  if(bottleAtPos2.getprestatus()){//sysj\plant.sysj line: 337, column: 13
                    System.out.println("moving bottle at pos 2 to pos 3");//sysj\plant.sysj line: 338, column: 6
                    moveToPos3.setPresent();//sysj\plant.sysj line: 339, column: 6
                    currsigs.addElement(moveToPos3);
                    if(bottleAtPos1.getprestatus()){//sysj\plant.sysj line: 342, column: 13
                      System.out.println("moving bottle at pos 1 to pos 2");//sysj\plant.sysj line: 343, column: 6
                      moveToPos2.setPresent();//sysj\plant.sysj line: 344, column: 6
                      currsigs.addElement(moveToPos2);
                      System.out.println("Table has been aligned");//sysj\plant.sysj line: 347, column: 5
                      tableAlignedWithSensor.setPresent();//sysj\plant.sysj line: 350, column: 6
                      currsigs.addElement(tableAlignedWithSensor);
                      active[21]=1;
                      ends[21]=1;
                      tdone[21]=1;
                    }
                    else {
                      System.out.println("Table has been aligned");//sysj\plant.sysj line: 347, column: 5
                      tableAlignedWithSensor.setPresent();//sysj\plant.sysj line: 350, column: 6
                      currsigs.addElement(tableAlignedWithSensor);
                      active[21]=1;
                      ends[21]=1;
                      tdone[21]=1;
                    }
                  }
                  else {
                    if(bottleAtPos1.getprestatus()){//sysj\plant.sysj line: 342, column: 13
                      System.out.println("moving bottle at pos 1 to pos 2");//sysj\plant.sysj line: 343, column: 6
                      moveToPos2.setPresent();//sysj\plant.sysj line: 344, column: 6
                      currsigs.addElement(moveToPos2);
                      System.out.println("Table has been aligned");//sysj\plant.sysj line: 347, column: 5
                      tableAlignedWithSensor.setPresent();//sysj\plant.sysj line: 350, column: 6
                      currsigs.addElement(tableAlignedWithSensor);
                      active[21]=1;
                      ends[21]=1;
                      tdone[21]=1;
                    }
                    else {
                      System.out.println("Table has been aligned");//sysj\plant.sysj line: 347, column: 5
                      tableAlignedWithSensor.setPresent();//sysj\plant.sysj line: 350, column: 6
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
              S50905=1;
              active[21]=1;
              ends[21]=1;
              tdone[21]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread52712(int [] tdone, int [] ends){
        switch(S50796){
      case 0 : 
        active[20]=0;
        ends[20]=0;
        tdone[20]=1;
        break;
      
      case 1 : 
        switch(S50774){
          case 0 : 
            if(cylClampBottleExtend.getprestatus()){//sysj\plant.sysj line: 307, column: 11
              S50774=1;
              cylClampedBottle.setPresent();//sysj\plant.sysj line: 309, column: 6
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
            if(!cylClampBottleExtend.getprestatus()){//sysj\plant.sysj line: 308, column: 12
              S50774=2;
              active[20]=1;
              ends[20]=1;
              tdone[20]=1;
            }
            else {
              cylClampedBottle.setPresent();//sysj\plant.sysj line: 309, column: 6
              currsigs.addElement(cylClampedBottle);
              active[20]=1;
              ends[20]=1;
              tdone[20]=1;
            }
            break;
          
          case 2 : 
            S50774=2;
            S50774=0;
            active[20]=1;
            ends[20]=1;
            tdone[20]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread52711(int [] tdone, int [] ends){
        switch(S50764){
      case 0 : 
        active[19]=0;
        ends[19]=0;
        tdone[19]=1;
        break;
      
      case 1 : 
        switch(S50720){
          case 0 : 
            if(gripperTurnRetract.getprestatus()){//sysj\plant.sysj line: 291, column: 13
              S50720=1;
              if(gripperTurnRetract.getprestatus() && !gripperTurnExtend.getprestatus()){//sysj\plant.sysj line: 295, column: 13
                gripperTurnHomePos.setPresent();//sysj\plant.sysj line: 297, column: 7
                currsigs.addElement(gripperTurnHomePos);
                active[19]=1;
                ends[19]=1;
                tdone[19]=1;
              }
              else {
                S50720=2;
                active[19]=1;
                ends[19]=1;
                tdone[19]=1;
              }
            }
            else {
              gripperTurnFinalPos.setPresent();//sysj\plant.sysj line: 292, column: 7
              currsigs.addElement(gripperTurnFinalPos);
              active[19]=1;
              ends[19]=1;
              tdone[19]=1;
            }
            break;
          
          case 1 : 
            if(gripperTurnExtend.getprestatus()){//sysj\plant.sysj line: 296, column: 13
              S50720=2;
              active[19]=1;
              ends[19]=1;
              tdone[19]=1;
            }
            else {
              gripperTurnHomePos.setPresent();//sysj\plant.sysj line: 297, column: 7
              currsigs.addElement(gripperTurnHomePos);
              active[19]=1;
              ends[19]=1;
              tdone[19]=1;
            }
            break;
          
          case 2 : 
            S50720=2;
            S50720=0;
            if(gripperTurnExtend.getprestatus() && !gripperTurnRetract.getprestatus()){//sysj\plant.sysj line: 290, column: 13
              gripperTurnFinalPos.setPresent();//sysj\plant.sysj line: 292, column: 7
              currsigs.addElement(gripperTurnFinalPos);
              active[19]=1;
              ends[19]=1;
              tdone[19]=1;
            }
            else {
              S50720=1;
              if(gripperTurnRetract.getprestatus() && !gripperTurnExtend.getprestatus()){//sysj\plant.sysj line: 295, column: 13
                gripperTurnHomePos.setPresent();//sysj\plant.sysj line: 297, column: 7
                currsigs.addElement(gripperTurnHomePos);
                active[19]=1;
                ends[19]=1;
                tdone[19]=1;
              }
              else {
                S50720=2;
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

  public void thread52710(int [] tdone, int [] ends){
        switch(S50699){
      case 0 : 
        active[18]=0;
        ends[18]=0;
        tdone[18]=1;
        break;
      
      case 1 : 
        switch(S50677){
          case 0 : 
            if(capGripperPos5Extend.getprestatus()){//sysj\plant.sysj line: 279, column: 11
              S50677=1;
              gripperGrippedCap.setPresent();//sysj\plant.sysj line: 281, column: 6
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
            if(!capGripperPos5Extend.getprestatus()){//sysj\plant.sysj line: 280, column: 12
              S50677=2;
              active[18]=1;
              ends[18]=1;
              tdone[18]=1;
            }
            else {
              gripperGrippedCap.setPresent();//sysj\plant.sysj line: 281, column: 6
              currsigs.addElement(gripperGrippedCap);
              active[18]=1;
              ends[18]=1;
              tdone[18]=1;
            }
            break;
          
          case 2 : 
            S50677=2;
            S50677=0;
            active[18]=1;
            ends[18]=1;
            tdone[18]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread52709(int [] tdone, int [] ends){
        switch(S50667){
      case 0 : 
        active[17]=0;
        ends[17]=0;
        tdone[17]=1;
        break;
      
      case 1 : 
        switch(S50639){
          case 0 : 
            if(cylPos5ZAxisExtend.getprestatus()){//sysj\plant.sysj line: 266, column: 11
              S50639=1;
              gripperZAxisLowered.setPresent();//sysj\plant.sysj line: 270, column: 6
              currsigs.addElement(gripperZAxisLowered);
              active[17]=1;
              ends[17]=1;
              tdone[17]=1;
            }
            else {
              gripperZAxisLifted.setPresent();//sysj\plant.sysj line: 267, column: 6
              currsigs.addElement(gripperZAxisLifted);
              active[17]=1;
              ends[17]=1;
              tdone[17]=1;
            }
            break;
          
          case 1 : 
            if(!cylPos5ZAxisExtend.getprestatus()){//sysj\plant.sysj line: 269, column: 12
              S50639=2;
              active[17]=1;
              ends[17]=1;
              tdone[17]=1;
            }
            else {
              gripperZAxisLowered.setPresent();//sysj\plant.sysj line: 270, column: 6
              currsigs.addElement(gripperZAxisLowered);
              active[17]=1;
              ends[17]=1;
              tdone[17]=1;
            }
            break;
          
          case 2 : 
            S50639=2;
            S50639=0;
            gripperZAxisLifted.setPresent();//sysj\plant.sysj line: 267, column: 6
            currsigs.addElement(gripperZAxisLifted);
            active[17]=1;
            ends[17]=1;
            tdone[17]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread52708(int [] tdone, int [] ends){
        switch(S50626){
      case 0 : 
        active[16]=0;
        ends[16]=0;
        tdone[16]=1;
        break;
      
      case 1 : 
        switch(S50604){
          case 0 : 
            if(moveToPos4.getprestatus()){//sysj\plant.sysj line: 255, column: 11
              S50604=1;
              bottleAtPos4.setPresent();//sysj\plant.sysj line: 257, column: 6
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
            if(moveToPos5.getprestatus()){//sysj\plant.sysj line: 256, column: 12
              S50604=2;
              active[16]=1;
              ends[16]=1;
              tdone[16]=1;
            }
            else {
              bottleAtPos4.setPresent();//sysj\plant.sysj line: 257, column: 6
              currsigs.addElement(bottleAtPos4);
              active[16]=1;
              ends[16]=1;
              tdone[16]=1;
            }
            break;
          
          case 2 : 
            S50604=2;
            S50604=0;
            active[16]=1;
            ends[16]=1;
            tdone[16]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread52707(int [] tdone, int [] ends){
        switch(S50594){
      case 0 : 
        active[15]=0;
        ends[15]=0;
        tdone[15]=1;
        break;
      
      case 1 : 
        if(capDec_1.getprestatus()){//sysj\plant.sysj line: 239, column: 12
          if(capcount_thread_15 > 0) {//sysj\plant.sysj line: 240, column: 5
            capcount_thread_15 = capcount_thread_15 - 1;//sysj\plant.sysj line: 241, column: 6
          }
          if(magReq.getprestatus()){//sysj\plant.sysj line: 243, column: 12
            capcount_thread_15 = 5;//sysj\plant.sysj line: 244, column: 5
            if(capcount_thread_15 == 0){//sysj\plant.sysj line: 246, column: 7
              magEmpty.setPresent();//sysj\plant.sysj line: 246, column: 22
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
            if(capcount_thread_15 == 0){//sysj\plant.sysj line: 246, column: 7
              magEmpty.setPresent();//sysj\plant.sysj line: 246, column: 22
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
          if(magReq.getprestatus()){//sysj\plant.sysj line: 243, column: 12
            capcount_thread_15 = 5;//sysj\plant.sysj line: 244, column: 5
            if(capcount_thread_15 == 0){//sysj\plant.sysj line: 246, column: 7
              magEmpty.setPresent();//sysj\plant.sysj line: 246, column: 22
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
            if(capcount_thread_15 == 0){//sysj\plant.sysj line: 246, column: 7
              magEmpty.setPresent();//sysj\plant.sysj line: 246, column: 22
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

  public void thread52706(int [] tdone, int [] ends){
        switch(S50532){
      case 0 : 
        active[14]=0;
        ends[14]=0;
        tdone[14]=1;
        break;
      
      case 1 : 
        switch(S50486){
          case 0 : 
            if(magEmpty.getprestatus()){//sysj\plant.sysj line: 221, column: 10
              S50486=1;
              active[14]=1;
              ends[14]=1;
              tdone[14]=1;
            }
            else {
              switch(S50468){
                case 0 : 
                  if(pusherRetracted.getprestatus()){//sysj\plant.sysj line: 223, column: 13
                    S50468=1;
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
                  if(pusherExtended.getprestatus()){//sysj\plant.sysj line: 224, column: 13
                    S50468=2;
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
                  if(pusherRetracted.getprestatus()){//sysj\plant.sysj line: 225, column: 13
                    capDec_1.setPresent();//sysj\plant.sysj line: 226, column: 7
                    currsigs.addElement(capDec_1);
                    S50468=3;
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
                  S50468=3;
                  S50468=0;
                  active[14]=1;
                  ends[14]=1;
                  tdone[14]=1;
                  break;
                
              }
            }
            break;
          
          case 1 : 
            if(magReq.getprestatus()){//sysj\plant.sysj line: 230, column: 10
              S50486=2;
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
            S50486=2;
            S50486=0;
            S50468=0;
            active[14]=1;
            ends[14]=1;
            tdone[14]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread52705(int [] tdone, int [] ends){
        switch(S50464){
      case 0 : 
        active[13]=0;
        ends[13]=0;
        tdone[13]=1;
        break;
      
      case 1 : 
        switch(S50450){
          case 0 : 
            if(magEmpty.getprestatus() || !vacOn.getprestatus()){//sysj\plant.sysj line: 211, column: 11
              S50450=1;
              active[13]=1;
              ends[13]=1;
              tdone[13]=1;
            }
            else {
              WPgripped.setPresent();//sysj\plant.sysj line: 212, column: 6
              currsigs.addElement(WPgripped);
              active[13]=1;
              ends[13]=1;
              tdone[13]=1;
            }
            break;
          
          case 1 : 
            S50450=1;
            S50450=0;
            if(vacOn.getprestatus() && armAtSource.getprestatus()){//sysj\plant.sysj line: 210, column: 12
              WPgripped.setPresent();//sysj\plant.sysj line: 212, column: 6
              currsigs.addElement(WPgripped);
              active[13]=1;
              ends[13]=1;
              tdone[13]=1;
            }
            else {
              S50450=1;
              active[13]=1;
              ends[13]=1;
              tdone[13]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread52704(int [] tdone, int [] ends){
        switch(S50444){
      case 0 : 
        active[12]=0;
        ends[12]=0;
        tdone[12]=1;
        break;
      
      case 1 : 
        switch(S50408){
          case 0 : 
            if(pusherExtend.getprestatus()){//sysj\plant.sysj line: 197, column: 10
              System.out.println("Aborted");//sysj\plant.sysj line: 200, column: 4
              S50408=1;
              pusherExtended.setPresent();//sysj\plant.sysj line: 202, column: 5
              currsigs.addElement(pusherExtended);
              active[12]=1;
              ends[12]=1;
              tdone[12]=1;
            }
            else {
              pusherRetracted.setPresent();//sysj\plant.sysj line: 198, column: 5
              currsigs.addElement(pusherRetracted);
              active[12]=1;
              ends[12]=1;
              tdone[12]=1;
            }
            break;
          
          case 1 : 
            if(!pusherExtend.getprestatus()){//sysj\plant.sysj line: 201, column: 10
              S50408=2;
              active[12]=1;
              ends[12]=1;
              tdone[12]=1;
            }
            else {
              pusherExtended.setPresent();//sysj\plant.sysj line: 202, column: 5
              currsigs.addElement(pusherExtended);
              active[12]=1;
              ends[12]=1;
              tdone[12]=1;
            }
            break;
          
          case 2 : 
            S50408=2;
            S50408=0;
            pusherRetracted.setPresent();//sysj\plant.sysj line: 198, column: 5
            currsigs.addElement(pusherRetracted);
            active[12]=1;
            ends[12]=1;
            tdone[12]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread52703(int [] tdone, int [] ends){
        switch(S50403){
      case 0 : 
        active[11]=0;
        ends[11]=0;
        tdone[11]=1;
        break;
      
      case 1 : 
        switch(S50359){
          case 0 : 
            if(armDest.getprestatus()){//sysj\plant.sysj line: 182, column: 12
              S50359=1;
              if(armDest.getprestatus() && !armSource.getprestatus()){//sysj\plant.sysj line: 186, column: 12
                armAtDest.setPresent();//sysj\plant.sysj line: 188, column: 6
                currsigs.addElement(armAtDest);
                active[11]=1;
                ends[11]=1;
                tdone[11]=1;
              }
              else {
                S50359=2;
                active[11]=1;
                ends[11]=1;
                tdone[11]=1;
              }
            }
            else {
              armAtSource.setPresent();//sysj\plant.sysj line: 183, column: 6
              currsigs.addElement(armAtSource);
              active[11]=1;
              ends[11]=1;
              tdone[11]=1;
            }
            break;
          
          case 1 : 
            if(armSource.getprestatus()){//sysj\plant.sysj line: 187, column: 12
              S50359=2;
              active[11]=1;
              ends[11]=1;
              tdone[11]=1;
            }
            else {
              armAtDest.setPresent();//sysj\plant.sysj line: 188, column: 6
              currsigs.addElement(armAtDest);
              active[11]=1;
              ends[11]=1;
              tdone[11]=1;
            }
            break;
          
          case 2 : 
            S50359=2;
            S50359=0;
            if(armSource.getprestatus() && !armDest.getprestatus()){//sysj\plant.sysj line: 181, column: 12
              armAtSource.setPresent();//sysj\plant.sysj line: 183, column: 6
              currsigs.addElement(armAtSource);
              active[11]=1;
              ends[11]=1;
              tdone[11]=1;
            }
            else {
              S50359=1;
              if(armDest.getprestatus() && !armSource.getprestatus()){//sysj\plant.sysj line: 186, column: 12
                armAtDest.setPresent();//sysj\plant.sysj line: 188, column: 6
                currsigs.addElement(armAtDest);
                active[11]=1;
                ends[11]=1;
                tdone[11]=1;
              }
              else {
                S50359=2;
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

  public void thread52701(int [] tdone, int [] ends){
        switch(S50336){
      case 0 : 
        active[10]=0;
        ends[10]=0;
        tdone[10]=1;
        break;
      
      case 1 : 
        switch(S50262){
          case 0 : 
            if(dosUnitValveRetract.getprestatus()){//sysj\plant.sysj line: 158, column: 13
              S50262=1;
              if(dosUnitValveRetract.getprestatus() && !dosUnitValveExtend.getprestatus()){//sysj\plant.sysj line: 162, column: 13
                System.out.println("FillerPlant: Filling with canister " + (canister_1.getpreval() == null ? 0 : ((Integer)canister_1.getpreval()).intValue()) + " Percent: " + (percent_1.getpreval() == null ? 0 : ((Integer)percent_1.getpreval()).intValue()));//sysj\plant.sysj line: 163, column: 6
                dosUnitFilled.setPresent();//sysj\plant.sysj line: 165, column: 7
                currsigs.addElement(dosUnitFilled);
                active[10]=1;
                ends[10]=1;
                tdone[10]=1;
              }
              else {
                S50262=2;
                active[10]=1;
                ends[10]=1;
                tdone[10]=1;
              }
            }
            else {
              dosUnitEvac.setPresent();//sysj\plant.sysj line: 159, column: 7
              currsigs.addElement(dosUnitEvac);
              active[10]=1;
              ends[10]=1;
              tdone[10]=1;
            }
            break;
          
          case 1 : 
            if(dosUnitValveExtend.getprestatus()){//sysj\plant.sysj line: 164, column: 13
              S50262=2;
              active[10]=1;
              ends[10]=1;
              tdone[10]=1;
            }
            else {
              dosUnitFilled.setPresent();//sysj\plant.sysj line: 165, column: 7
              currsigs.addElement(dosUnitFilled);
              active[10]=1;
              ends[10]=1;
              tdone[10]=1;
            }
            break;
          
          case 2 : 
            S50262=2;
            S50262=0;
            if(dosUnitValveExtend.getprestatus() && !dosUnitValveRetract.getprestatus()){//sysj\plant.sysj line: 157, column: 13
              dosUnitEvac.setPresent();//sysj\plant.sysj line: 159, column: 7
              currsigs.addElement(dosUnitEvac);
              active[10]=1;
              ends[10]=1;
              tdone[10]=1;
            }
            else {
              S50262=1;
              if(dosUnitValveRetract.getprestatus() && !dosUnitValveExtend.getprestatus()){//sysj\plant.sysj line: 162, column: 13
                System.out.println("FillerPlant: Filling with canister " + (canister_1.getpreval() == null ? 0 : ((Integer)canister_1.getpreval()).intValue()) + " Percent: " + (percent_1.getpreval() == null ? 0 : ((Integer)percent_1.getpreval()).intValue()));//sysj\plant.sysj line: 163, column: 6
                dosUnitFilled.setPresent();//sysj\plant.sysj line: 165, column: 7
                currsigs.addElement(dosUnitFilled);
                active[10]=1;
                ends[10]=1;
                tdone[10]=1;
              }
              else {
                S50262=2;
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

  public void thread52700(int [] tdone, int [] ends){
        switch(S50226){
      case 0 : 
        active[9]=0;
        ends[9]=0;
        tdone[9]=1;
        break;
      
      case 1 : 
        switch(S50212){
          case 0 : 
            if(!valveInjectorOnOff.getprestatus()){//sysj\plant.sysj line: 146, column: 12
              S50212=1;
              active[9]=1;
              ends[9]=1;
              tdone[9]=1;
            }
            else {
              valveInjectorActive.setPresent();//sysj\plant.sysj line: 147, column: 7
              currsigs.addElement(valveInjectorActive);
              active[9]=1;
              ends[9]=1;
              tdone[9]=1;
            }
            break;
          
          case 1 : 
            S50212=1;
            S50212=0;
            if(valveInjectorOnOff.getprestatus()){//sysj\plant.sysj line: 145, column: 13
              valveInjectorActive.setPresent();//sysj\plant.sysj line: 147, column: 7
              currsigs.addElement(valveInjectorActive);
              active[9]=1;
              ends[9]=1;
              tdone[9]=1;
            }
            else {
              S50212=1;
              active[9]=1;
              ends[9]=1;
              tdone[9]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread52699(int [] tdone, int [] ends){
        switch(S50206){
      case 0 : 
        active[8]=0;
        ends[8]=0;
        tdone[8]=1;
        break;
      
      case 1 : 
        switch(S50200){
          case 0 : 
            if(selectPercentage.getprestatus()){//sysj\plant.sysj line: 136, column: 11
              percent_1.setPresent();//sysj\plant.sysj line: 137, column: 5
              currsigs.addElement(percent_1);
              percent_1.setValue((selectPercentage.getpreval() == null ? null : ((Integer)selectPercentage.getpreval())));//sysj\plant.sysj line: 137, column: 5
              selectedPercentage.setPresent();//sysj\plant.sysj line: 138, column: 5
              currsigs.addElement(selectedPercentage);
              selectedPercentage.setValue((selectPercentage.getpreval() == null ? null : ((Integer)selectPercentage.getpreval())));//sysj\plant.sysj line: 138, column: 5
              S50200=1;
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
            S50200=1;
            S50200=0;
            active[8]=1;
            ends[8]=1;
            tdone[8]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread52698(int [] tdone, int [] ends){
        switch(S50198){
      case 0 : 
        active[7]=0;
        ends[7]=0;
        tdone[7]=1;
        break;
      
      case 1 : 
        switch(S50192){
          case 0 : 
            if(selectCanister.getprestatus()){//sysj\plant.sysj line: 126, column: 11
              canister_1.setPresent();//sysj\plant.sysj line: 127, column: 5
              currsigs.addElement(canister_1);
              canister_1.setValue((selectCanister.getpreval() == null ? null : ((Integer)selectCanister.getpreval())));//sysj\plant.sysj line: 127, column: 5
              selectedCanister.setPresent();//sysj\plant.sysj line: 128, column: 5
              currsigs.addElement(selectedCanister);
              selectedCanister.setValue((selectCanister.getpreval() == null ? null : ((Integer)selectCanister.getpreval())));//sysj\plant.sysj line: 128, column: 5
              S50192=1;
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
            S50192=1;
            S50192=0;
            active[7]=1;
            ends[7]=1;
            tdone[7]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread52697(int [] tdone, int [] ends){
        switch(S50338){
      case 0 : 
        active[6]=0;
        ends[6]=0;
        tdone[6]=1;
        break;
      
      case 1 : 
        canister_1.setClear();//sysj\plant.sysj line: 121, column: 3
        percent_1.setClear();//sysj\plant.sysj line: 122, column: 3
        thread52698(tdone,ends);
        thread52699(tdone,ends);
        thread52700(tdone,ends);
        thread52701(tdone,ends);
        int biggest52702 = 0;
        if(ends[7]>=biggest52702){
          biggest52702=ends[7];
        }
        if(ends[8]>=biggest52702){
          biggest52702=ends[8];
        }
        if(ends[9]>=biggest52702){
          biggest52702=ends[9];
        }
        if(ends[10]>=biggest52702){
          biggest52702=ends[10];
        }
        if(biggest52702 == 1){
          active[6]=1;
          ends[6]=1;
          tdone[6]=1;
        }
        //FINXME code
        if(biggest52702 == 0){
          S50338=0;
          active[6]=0;
          ends[6]=0;
          tdone[6]=1;
        }
        break;
      
    }
  }

  public void thread52696(int [] tdone, int [] ends){
        switch(S50188){
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

  public void thread52694(int [] tdone, int [] ends){
        S49877=1;
    if(motorPos5On.getprestatus()){//sysj\plant.sysj line: 90, column: 14
      System.out.println("Conveyor Plant - moving bottle to leave 5");//sysj\plant.sysj line: 91, column: 7
      bottleLeftPos5.setPresent();//sysj\plant.sysj line: 93, column: 8
      currsigs.addElement(bottleLeftPos5);
      active[4]=1;
      ends[4]=1;
      tdone[4]=1;
    }
    else {
      S49877=0;
      active[4]=0;
      ends[4]=0;
      tdone[4]=1;
    }
  }

  public void thread52693(int [] tdone, int [] ends){
        S49865=1;
    if(motorPos1On.getprestatus()){//sysj\plant.sysj line: 81, column: 14
      System.out.println("Conveyor plant - moving bottle to 1");//sysj\plant.sysj line: 82, column: 7
      bottleAtPos1.setPresent();//sysj\plant.sysj line: 84, column: 8
      currsigs.addElement(bottleAtPos1);
      active[3]=1;
      ends[3]=1;
      tdone[3]=1;
    }
    else {
      S49865=0;
      active[3]=0;
      ends[3]=0;
      tdone[3]=1;
    }
  }

  public void thread52691(int [] tdone, int [] ends){
        switch(S49877){
      case 0 : 
        active[4]=0;
        ends[4]=0;
        tdone[4]=1;
        break;
      
      case 1 : 
        if(!motorPos5On.getprestatus() && !motConveyorOnOff.getprestatus()){//sysj\plant.sysj line: 92, column: 13
          S49877=0;
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

  public void thread52690(int [] tdone, int [] ends){
        switch(S49865){
      case 0 : 
        active[3]=0;
        ends[3]=0;
        tdone[3]=1;
        break;
      
      case 1 : 
        if(moveToPos2.getprestatus()){//sysj\plant.sysj line: 83, column: 13
          S49865=0;
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

  public void thread52688(int [] tdone, int [] ends){
        S49877=1;
    if(motorPos5On.getprestatus()){//sysj\plant.sysj line: 90, column: 14
      System.out.println("Conveyor Plant - moving bottle to leave 5");//sysj\plant.sysj line: 91, column: 7
      bottleLeftPos5.setPresent();//sysj\plant.sysj line: 93, column: 8
      currsigs.addElement(bottleLeftPos5);
      active[4]=1;
      ends[4]=1;
      tdone[4]=1;
    }
    else {
      S49877=0;
      active[4]=0;
      ends[4]=0;
      tdone[4]=1;
    }
  }

  public void thread52687(int [] tdone, int [] ends){
        S49865=1;
    if(motorPos1On.getprestatus()){//sysj\plant.sysj line: 81, column: 14
      System.out.println("Conveyor plant - moving bottle to 1");//sysj\plant.sysj line: 82, column: 7
      bottleAtPos1.setPresent();//sysj\plant.sysj line: 84, column: 8
      currsigs.addElement(bottleAtPos1);
      active[3]=1;
      ends[3]=1;
      tdone[3]=1;
    }
    else {
      S49865=0;
      active[3]=0;
      ends[3]=0;
      tdone[3]=1;
    }
  }

  public void thread52685(int [] tdone, int [] ends){
        S49877=1;
    if(motorPos5On.getprestatus()){//sysj\plant.sysj line: 90, column: 14
      System.out.println("Conveyor Plant - moving bottle to leave 5");//sysj\plant.sysj line: 91, column: 7
      bottleLeftPos5.setPresent();//sysj\plant.sysj line: 93, column: 8
      currsigs.addElement(bottleLeftPos5);
      active[4]=1;
      ends[4]=1;
      tdone[4]=1;
    }
    else {
      S49877=0;
      active[4]=0;
      ends[4]=0;
      tdone[4]=1;
    }
  }

  public void thread52684(int [] tdone, int [] ends){
        S49865=1;
    if(motorPos1On.getprestatus()){//sysj\plant.sysj line: 81, column: 14
      System.out.println("Conveyor plant - moving bottle to 1");//sysj\plant.sysj line: 82, column: 7
      bottleAtPos1.setPresent();//sysj\plant.sysj line: 84, column: 8
      currsigs.addElement(bottleAtPos1);
      active[3]=1;
      ends[3]=1;
      tdone[3]=1;
    }
    else {
      S49865=0;
      active[3]=0;
      ends[3]=0;
      tdone[3]=1;
    }
  }

  public void thread52683(int [] tdone, int [] ends){
        switch(S50180){
      case 0 : 
        active[2]=0;
        ends[2]=0;
        tdone[2]=1;
        break;
      
      case 1 : 
        switch(S49952){
          case 0 : 
            switch(S49950){
              case 0 : 
                switch(S49841){
                  case 0 : 
                    S49841=0;
                    if(com.systemj.Timer.getMs() - __start_thread_2 >= (3) * 1000){//sysj\plant.sysj line: 78, column: 29
                      ends[2]=2;
                      ;//sysj\plant.sysj line: 78, column: 29
                      S49950=1;
                      thread52684(tdone,ends);
                      thread52685(tdone,ends);
                      int biggest52686 = 0;
                      if(ends[3]>=biggest52686){
                        biggest52686=ends[3];
                      }
                      if(ends[4]>=biggest52686){
                        biggest52686=ends[4];
                      }
                      if(biggest52686 == 1){
                        active[2]=1;
                        ends[2]=1;
                        tdone[2]=1;
                      }
                      //FINXME code
                      if(biggest52686 == 0){
                        S49952=1;
                        active[2]=1;
                        ends[2]=1;
                        tdone[2]=1;
                      }
                    }
                    else {
                      S49841=1;
                      active[2]=1;
                      ends[2]=1;
                      tdone[2]=1;
                    }
                    break;
                  
                  case 1 : 
                    S49841=1;
                    S49841=0;
                    if(com.systemj.Timer.getMs() - __start_thread_2 >= (3) * 1000){//sysj\plant.sysj line: 78, column: 29
                      ends[2]=2;
                      ;//sysj\plant.sysj line: 78, column: 29
                      S49950=1;
                      thread52687(tdone,ends);
                      thread52688(tdone,ends);
                      int biggest52689 = 0;
                      if(ends[3]>=biggest52689){
                        biggest52689=ends[3];
                      }
                      if(ends[4]>=biggest52689){
                        biggest52689=ends[4];
                      }
                      if(biggest52689 == 1){
                        active[2]=1;
                        ends[2]=1;
                        tdone[2]=1;
                      }
                      //FINXME code
                      if(biggest52689 == 0){
                        S49952=1;
                        active[2]=1;
                        ends[2]=1;
                        tdone[2]=1;
                      }
                    }
                    else {
                      S49841=1;
                      active[2]=1;
                      ends[2]=1;
                      tdone[2]=1;
                    }
                    break;
                  
                }
                break;
              
              case 1 : 
                thread52690(tdone,ends);
                thread52691(tdone,ends);
                int biggest52692 = 0;
                if(ends[3]>=biggest52692){
                  biggest52692=ends[3];
                }
                if(ends[4]>=biggest52692){
                  biggest52692=ends[4];
                }
                if(biggest52692 == 1){
                  active[2]=1;
                  ends[2]=1;
                  tdone[2]=1;
                }
                //FINXME code
                if(biggest52692 == 0){
                  S49952=1;
                  active[2]=1;
                  ends[2]=1;
                  tdone[2]=1;
                }
                break;
              
            }
            break;
          
          case 1 : 
            S49952=1;
            S49952=0;
            if(motConveyorOnOff.getprestatus()){//sysj\plant.sysj line: 78, column: 12
              S49950=0;
              __start_thread_2 = com.systemj.Timer.getMs();//sysj\plant.sysj line: 78, column: 29
              S49841=0;
              if(com.systemj.Timer.getMs() - __start_thread_2 >= (3) * 1000){//sysj\plant.sysj line: 78, column: 29
                ends[2]=2;
                ;//sysj\plant.sysj line: 78, column: 29
                S49950=1;
                thread52693(tdone,ends);
                thread52694(tdone,ends);
                int biggest52695 = 0;
                if(ends[3]>=biggest52695){
                  biggest52695=ends[3];
                }
                if(ends[4]>=biggest52695){
                  biggest52695=ends[4];
                }
                if(biggest52695 == 1){
                  active[2]=1;
                  ends[2]=1;
                  tdone[2]=1;
                }
                //FINXME code
                if(biggest52695 == 0){
                  S49952=1;
                  active[2]=1;
                  ends[2]=1;
                  tdone[2]=1;
                }
              }
              else {
                S49841=1;
                active[2]=1;
                ends[2]=1;
                tdone[2]=1;
              }
            }
            else {
              S49952=1;
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread52681(int [] tdone, int [] ends){
        S51244=1;
    S51224=0;
    if(moveToPos2.getprestatus()){//sysj\plant.sysj line: 375, column: 24
      System.out.println("bottle is now at pos 2");//sysj\plant.sysj line: 375, column: 36
      bottleAtPos2.setPresent();//sysj\plant.sysj line: 375, column: 82
      currsigs.addElement(bottleAtPos2);
      active[25]=1;
      ends[25]=1;
      tdone[25]=1;
    }
    else {
      S51224=1;
      active[25]=1;
      ends[25]=1;
      tdone[25]=1;
    }
  }

  public void thread52680(int [] tdone, int [] ends){
        S51215=1;
    S51195=0;
    if(moveToPos3.getprestatus()){//sysj\plant.sysj line: 373, column: 24
      System.out.println("bottle is now at pos 3");//sysj\plant.sysj line: 373, column: 36
      bottleAtPos3.setPresent();//sysj\plant.sysj line: 373, column: 82
      currsigs.addElement(bottleAtPos3);
      active[24]=1;
      ends[24]=1;
      tdone[24]=1;
    }
    else {
      S51195=1;
      active[24]=1;
      ends[24]=1;
      tdone[24]=1;
    }
  }

  public void thread52679(int [] tdone, int [] ends){
        S51186=1;
    S51166=0;
    if(moveToPos4.getprestatus()){//sysj\plant.sysj line: 371, column: 24
      System.out.println("bottle is now at pos 4");//sysj\plant.sysj line: 371, column: 36
      bottleAtPos4.setPresent();//sysj\plant.sysj line: 371, column: 82
      currsigs.addElement(bottleAtPos4);
      active[23]=1;
      ends[23]=1;
      tdone[23]=1;
    }
    else {
      S51166=1;
      active[23]=1;
      ends[23]=1;
      tdone[23]=1;
    }
  }

  public void thread52678(int [] tdone, int [] ends){
        S51157=1;
    S51135=0;
    if(moveToPos5.getprestatus()){//sysj\plant.sysj line: 362, column: 13
      System.out.println("bottle is now at pos 5");//sysj\plant.sysj line: 363, column: 6
      bottleAtPos5.setPresent();//sysj\plant.sysj line: 364, column: 6
      currsigs.addElement(bottleAtPos5);
      active[22]=1;
      ends[22]=1;
      tdone[22]=1;
    }
    else {
      S51135=1;
      active[22]=1;
      ends[22]=1;
      tdone[22]=1;
    }
  }

  public void thread52677(int [] tdone, int [] ends){
        S51125=1;
    S50905=0;
    if(rotaryTableTrigger.getprestatus()){//sysj\plant.sysj line: 318, column: 12
      System.out.println("table triggered now moving");//sysj\plant.sysj line: 322, column: 5
      if(bottleAtPos4.getprestatus()){//sysj\plant.sysj line: 325, column: 13
        System.out.println("moving bottle at pos 4 to pos 5");//sysj\plant.sysj line: 326, column: 6
        moveToPos5.setPresent();//sysj\plant.sysj line: 327, column: 6
        currsigs.addElement(moveToPos5);
        if(bottleAtPos3.getprestatus()){//sysj\plant.sysj line: 331, column: 13
          System.out.println("moving bottle at pos 3 to pos 4");//sysj\plant.sysj line: 332, column: 6
          moveToPos4.setPresent();//sysj\plant.sysj line: 333, column: 6
          currsigs.addElement(moveToPos4);
          if(bottleAtPos2.getprestatus()){//sysj\plant.sysj line: 337, column: 13
            System.out.println("moving bottle at pos 2 to pos 3");//sysj\plant.sysj line: 338, column: 6
            moveToPos3.setPresent();//sysj\plant.sysj line: 339, column: 6
            currsigs.addElement(moveToPos3);
            if(bottleAtPos1.getprestatus()){//sysj\plant.sysj line: 342, column: 13
              System.out.println("moving bottle at pos 1 to pos 2");//sysj\plant.sysj line: 343, column: 6
              moveToPos2.setPresent();//sysj\plant.sysj line: 344, column: 6
              currsigs.addElement(moveToPos2);
              System.out.println("Table has been aligned");//sysj\plant.sysj line: 347, column: 5
              tableAlignedWithSensor.setPresent();//sysj\plant.sysj line: 350, column: 6
              currsigs.addElement(tableAlignedWithSensor);
              active[21]=1;
              ends[21]=1;
              tdone[21]=1;
            }
            else {
              System.out.println("Table has been aligned");//sysj\plant.sysj line: 347, column: 5
              tableAlignedWithSensor.setPresent();//sysj\plant.sysj line: 350, column: 6
              currsigs.addElement(tableAlignedWithSensor);
              active[21]=1;
              ends[21]=1;
              tdone[21]=1;
            }
          }
          else {
            if(bottleAtPos1.getprestatus()){//sysj\plant.sysj line: 342, column: 13
              System.out.println("moving bottle at pos 1 to pos 2");//sysj\plant.sysj line: 343, column: 6
              moveToPos2.setPresent();//sysj\plant.sysj line: 344, column: 6
              currsigs.addElement(moveToPos2);
              System.out.println("Table has been aligned");//sysj\plant.sysj line: 347, column: 5
              tableAlignedWithSensor.setPresent();//sysj\plant.sysj line: 350, column: 6
              currsigs.addElement(tableAlignedWithSensor);
              active[21]=1;
              ends[21]=1;
              tdone[21]=1;
            }
            else {
              System.out.println("Table has been aligned");//sysj\plant.sysj line: 347, column: 5
              tableAlignedWithSensor.setPresent();//sysj\plant.sysj line: 350, column: 6
              currsigs.addElement(tableAlignedWithSensor);
              active[21]=1;
              ends[21]=1;
              tdone[21]=1;
            }
          }
        }
        else {
          if(bottleAtPos2.getprestatus()){//sysj\plant.sysj line: 337, column: 13
            System.out.println("moving bottle at pos 2 to pos 3");//sysj\plant.sysj line: 338, column: 6
            moveToPos3.setPresent();//sysj\plant.sysj line: 339, column: 6
            currsigs.addElement(moveToPos3);
            if(bottleAtPos1.getprestatus()){//sysj\plant.sysj line: 342, column: 13
              System.out.println("moving bottle at pos 1 to pos 2");//sysj\plant.sysj line: 343, column: 6
              moveToPos2.setPresent();//sysj\plant.sysj line: 344, column: 6
              currsigs.addElement(moveToPos2);
              System.out.println("Table has been aligned");//sysj\plant.sysj line: 347, column: 5
              tableAlignedWithSensor.setPresent();//sysj\plant.sysj line: 350, column: 6
              currsigs.addElement(tableAlignedWithSensor);
              active[21]=1;
              ends[21]=1;
              tdone[21]=1;
            }
            else {
              System.out.println("Table has been aligned");//sysj\plant.sysj line: 347, column: 5
              tableAlignedWithSensor.setPresent();//sysj\plant.sysj line: 350, column: 6
              currsigs.addElement(tableAlignedWithSensor);
              active[21]=1;
              ends[21]=1;
              tdone[21]=1;
            }
          }
          else {
            if(bottleAtPos1.getprestatus()){//sysj\plant.sysj line: 342, column: 13
              System.out.println("moving bottle at pos 1 to pos 2");//sysj\plant.sysj line: 343, column: 6
              moveToPos2.setPresent();//sysj\plant.sysj line: 344, column: 6
              currsigs.addElement(moveToPos2);
              System.out.println("Table has been aligned");//sysj\plant.sysj line: 347, column: 5
              tableAlignedWithSensor.setPresent();//sysj\plant.sysj line: 350, column: 6
              currsigs.addElement(tableAlignedWithSensor);
              active[21]=1;
              ends[21]=1;
              tdone[21]=1;
            }
            else {
              System.out.println("Table has been aligned");//sysj\plant.sysj line: 347, column: 5
              tableAlignedWithSensor.setPresent();//sysj\plant.sysj line: 350, column: 6
              currsigs.addElement(tableAlignedWithSensor);
              active[21]=1;
              ends[21]=1;
              tdone[21]=1;
            }
          }
        }
      }
      else {
        if(bottleAtPos3.getprestatus()){//sysj\plant.sysj line: 331, column: 13
          System.out.println("moving bottle at pos 3 to pos 4");//sysj\plant.sysj line: 332, column: 6
          moveToPos4.setPresent();//sysj\plant.sysj line: 333, column: 6
          currsigs.addElement(moveToPos4);
          if(bottleAtPos2.getprestatus()){//sysj\plant.sysj line: 337, column: 13
            System.out.println("moving bottle at pos 2 to pos 3");//sysj\plant.sysj line: 338, column: 6
            moveToPos3.setPresent();//sysj\plant.sysj line: 339, column: 6
            currsigs.addElement(moveToPos3);
            if(bottleAtPos1.getprestatus()){//sysj\plant.sysj line: 342, column: 13
              System.out.println("moving bottle at pos 1 to pos 2");//sysj\plant.sysj line: 343, column: 6
              moveToPos2.setPresent();//sysj\plant.sysj line: 344, column: 6
              currsigs.addElement(moveToPos2);
              System.out.println("Table has been aligned");//sysj\plant.sysj line: 347, column: 5
              tableAlignedWithSensor.setPresent();//sysj\plant.sysj line: 350, column: 6
              currsigs.addElement(tableAlignedWithSensor);
              active[21]=1;
              ends[21]=1;
              tdone[21]=1;
            }
            else {
              System.out.println("Table has been aligned");//sysj\plant.sysj line: 347, column: 5
              tableAlignedWithSensor.setPresent();//sysj\plant.sysj line: 350, column: 6
              currsigs.addElement(tableAlignedWithSensor);
              active[21]=1;
              ends[21]=1;
              tdone[21]=1;
            }
          }
          else {
            if(bottleAtPos1.getprestatus()){//sysj\plant.sysj line: 342, column: 13
              System.out.println("moving bottle at pos 1 to pos 2");//sysj\plant.sysj line: 343, column: 6
              moveToPos2.setPresent();//sysj\plant.sysj line: 344, column: 6
              currsigs.addElement(moveToPos2);
              System.out.println("Table has been aligned");//sysj\plant.sysj line: 347, column: 5
              tableAlignedWithSensor.setPresent();//sysj\plant.sysj line: 350, column: 6
              currsigs.addElement(tableAlignedWithSensor);
              active[21]=1;
              ends[21]=1;
              tdone[21]=1;
            }
            else {
              System.out.println("Table has been aligned");//sysj\plant.sysj line: 347, column: 5
              tableAlignedWithSensor.setPresent();//sysj\plant.sysj line: 350, column: 6
              currsigs.addElement(tableAlignedWithSensor);
              active[21]=1;
              ends[21]=1;
              tdone[21]=1;
            }
          }
        }
        else {
          if(bottleAtPos2.getprestatus()){//sysj\plant.sysj line: 337, column: 13
            System.out.println("moving bottle at pos 2 to pos 3");//sysj\plant.sysj line: 338, column: 6
            moveToPos3.setPresent();//sysj\plant.sysj line: 339, column: 6
            currsigs.addElement(moveToPos3);
            if(bottleAtPos1.getprestatus()){//sysj\plant.sysj line: 342, column: 13
              System.out.println("moving bottle at pos 1 to pos 2");//sysj\plant.sysj line: 343, column: 6
              moveToPos2.setPresent();//sysj\plant.sysj line: 344, column: 6
              currsigs.addElement(moveToPos2);
              System.out.println("Table has been aligned");//sysj\plant.sysj line: 347, column: 5
              tableAlignedWithSensor.setPresent();//sysj\plant.sysj line: 350, column: 6
              currsigs.addElement(tableAlignedWithSensor);
              active[21]=1;
              ends[21]=1;
              tdone[21]=1;
            }
            else {
              System.out.println("Table has been aligned");//sysj\plant.sysj line: 347, column: 5
              tableAlignedWithSensor.setPresent();//sysj\plant.sysj line: 350, column: 6
              currsigs.addElement(tableAlignedWithSensor);
              active[21]=1;
              ends[21]=1;
              tdone[21]=1;
            }
          }
          else {
            if(bottleAtPos1.getprestatus()){//sysj\plant.sysj line: 342, column: 13
              System.out.println("moving bottle at pos 1 to pos 2");//sysj\plant.sysj line: 343, column: 6
              moveToPos2.setPresent();//sysj\plant.sysj line: 344, column: 6
              currsigs.addElement(moveToPos2);
              System.out.println("Table has been aligned");//sysj\plant.sysj line: 347, column: 5
              tableAlignedWithSensor.setPresent();//sysj\plant.sysj line: 350, column: 6
              currsigs.addElement(tableAlignedWithSensor);
              active[21]=1;
              ends[21]=1;
              tdone[21]=1;
            }
            else {
              System.out.println("Table has been aligned");//sysj\plant.sysj line: 347, column: 5
              tableAlignedWithSensor.setPresent();//sysj\plant.sysj line: 350, column: 6
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
      S50905=1;
      active[21]=1;
      ends[21]=1;
      tdone[21]=1;
    }
  }

  public void thread52676(int [] tdone, int [] ends){
        S50796=1;
    S50774=0;
    active[20]=1;
    ends[20]=1;
    tdone[20]=1;
  }

  public void thread52675(int [] tdone, int [] ends){
        S50764=1;
    S50720=0;
    if(gripperTurnExtend.getprestatus() && !gripperTurnRetract.getprestatus()){//sysj\plant.sysj line: 290, column: 13
      gripperTurnFinalPos.setPresent();//sysj\plant.sysj line: 292, column: 7
      currsigs.addElement(gripperTurnFinalPos);
      active[19]=1;
      ends[19]=1;
      tdone[19]=1;
    }
    else {
      S50720=1;
      if(gripperTurnRetract.getprestatus() && !gripperTurnExtend.getprestatus()){//sysj\plant.sysj line: 295, column: 13
        gripperTurnHomePos.setPresent();//sysj\plant.sysj line: 297, column: 7
        currsigs.addElement(gripperTurnHomePos);
        active[19]=1;
        ends[19]=1;
        tdone[19]=1;
      }
      else {
        S50720=2;
        active[19]=1;
        ends[19]=1;
        tdone[19]=1;
      }
    }
  }

  public void thread52674(int [] tdone, int [] ends){
        S50699=1;
    S50677=0;
    active[18]=1;
    ends[18]=1;
    tdone[18]=1;
  }

  public void thread52673(int [] tdone, int [] ends){
        S50667=1;
    S50639=0;
    gripperZAxisLifted.setPresent();//sysj\plant.sysj line: 267, column: 6
    currsigs.addElement(gripperZAxisLifted);
    active[17]=1;
    ends[17]=1;
    tdone[17]=1;
  }

  public void thread52672(int [] tdone, int [] ends){
        S50626=1;
    S50604=0;
    active[16]=1;
    ends[16]=1;
    tdone[16]=1;
  }

  public void thread52671(int [] tdone, int [] ends){
        S50594=1;
    capcount_thread_15 = 5;//sysj\plant.sysj line: 236, column: 3
    if(capDec_1.getprestatus()){//sysj\plant.sysj line: 239, column: 12
      if(capcount_thread_15 > 0) {//sysj\plant.sysj line: 240, column: 5
        capcount_thread_15 = capcount_thread_15 - 1;//sysj\plant.sysj line: 241, column: 6
      }
      if(magReq.getprestatus()){//sysj\plant.sysj line: 243, column: 12
        capcount_thread_15 = 5;//sysj\plant.sysj line: 244, column: 5
        if(capcount_thread_15 == 0){//sysj\plant.sysj line: 246, column: 7
          magEmpty.setPresent();//sysj\plant.sysj line: 246, column: 22
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
        if(capcount_thread_15 == 0){//sysj\plant.sysj line: 246, column: 7
          magEmpty.setPresent();//sysj\plant.sysj line: 246, column: 22
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
      if(magReq.getprestatus()){//sysj\plant.sysj line: 243, column: 12
        capcount_thread_15 = 5;//sysj\plant.sysj line: 244, column: 5
        if(capcount_thread_15 == 0){//sysj\plant.sysj line: 246, column: 7
          magEmpty.setPresent();//sysj\plant.sysj line: 246, column: 22
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
        if(capcount_thread_15 == 0){//sysj\plant.sysj line: 246, column: 7
          magEmpty.setPresent();//sysj\plant.sysj line: 246, column: 22
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

  public void thread52670(int [] tdone, int [] ends){
        S50532=1;
    S50486=0;
    S50468=0;
    active[14]=1;
    ends[14]=1;
    tdone[14]=1;
  }

  public void thread52669(int [] tdone, int [] ends){
        S50464=1;
    S50450=0;
    if(vacOn.getprestatus() && armAtSource.getprestatus()){//sysj\plant.sysj line: 210, column: 12
      WPgripped.setPresent();//sysj\plant.sysj line: 212, column: 6
      currsigs.addElement(WPgripped);
      active[13]=1;
      ends[13]=1;
      tdone[13]=1;
    }
    else {
      S50450=1;
      active[13]=1;
      ends[13]=1;
      tdone[13]=1;
    }
  }

  public void thread52668(int [] tdone, int [] ends){
        S50444=1;
    S50408=0;
    pusherRetracted.setPresent();//sysj\plant.sysj line: 198, column: 5
    currsigs.addElement(pusherRetracted);
    active[12]=1;
    ends[12]=1;
    tdone[12]=1;
  }

  public void thread52667(int [] tdone, int [] ends){
        S50403=1;
    S50359=0;
    if(armSource.getprestatus() && !armDest.getprestatus()){//sysj\plant.sysj line: 181, column: 12
      armAtSource.setPresent();//sysj\plant.sysj line: 183, column: 6
      currsigs.addElement(armAtSource);
      active[11]=1;
      ends[11]=1;
      tdone[11]=1;
    }
    else {
      S50359=1;
      if(armDest.getprestatus() && !armSource.getprestatus()){//sysj\plant.sysj line: 186, column: 12
        armAtDest.setPresent();//sysj\plant.sysj line: 188, column: 6
        currsigs.addElement(armAtDest);
        active[11]=1;
        ends[11]=1;
        tdone[11]=1;
      }
      else {
        S50359=2;
        active[11]=1;
        ends[11]=1;
        tdone[11]=1;
      }
    }
  }

  public void thread52665(int [] tdone, int [] ends){
        S50336=1;
    S50262=0;
    if(dosUnitValveExtend.getprestatus() && !dosUnitValveRetract.getprestatus()){//sysj\plant.sysj line: 157, column: 13
      dosUnitEvac.setPresent();//sysj\plant.sysj line: 159, column: 7
      currsigs.addElement(dosUnitEvac);
      active[10]=1;
      ends[10]=1;
      tdone[10]=1;
    }
    else {
      S50262=1;
      if(dosUnitValveRetract.getprestatus() && !dosUnitValveExtend.getprestatus()){//sysj\plant.sysj line: 162, column: 13
        System.out.println("FillerPlant: Filling with canister " + (canister_1.getpreval() == null ? 0 : ((Integer)canister_1.getpreval()).intValue()) + " Percent: " + (percent_1.getpreval() == null ? 0 : ((Integer)percent_1.getpreval()).intValue()));//sysj\plant.sysj line: 163, column: 6
        dosUnitFilled.setPresent();//sysj\plant.sysj line: 165, column: 7
        currsigs.addElement(dosUnitFilled);
        active[10]=1;
        ends[10]=1;
        tdone[10]=1;
      }
      else {
        S50262=2;
        active[10]=1;
        ends[10]=1;
        tdone[10]=1;
      }
    }
  }

  public void thread52664(int [] tdone, int [] ends){
        S50226=1;
    S50212=0;
    if(valveInjectorOnOff.getprestatus()){//sysj\plant.sysj line: 145, column: 13
      valveInjectorActive.setPresent();//sysj\plant.sysj line: 147, column: 7
      currsigs.addElement(valveInjectorActive);
      active[9]=1;
      ends[9]=1;
      tdone[9]=1;
    }
    else {
      S50212=1;
      active[9]=1;
      ends[9]=1;
      tdone[9]=1;
    }
  }

  public void thread52663(int [] tdone, int [] ends){
        S50206=1;
    S50200=0;
    active[8]=1;
    ends[8]=1;
    tdone[8]=1;
  }

  public void thread52662(int [] tdone, int [] ends){
        S50198=1;
    S50192=0;
    active[7]=1;
    ends[7]=1;
    tdone[7]=1;
  }

  public void thread52661(int [] tdone, int [] ends){
        S50338=1;
    canister_1.setClear();//sysj\plant.sysj line: 121, column: 3
    percent_1.setClear();//sysj\plant.sysj line: 122, column: 3
    thread52662(tdone,ends);
    thread52663(tdone,ends);
    thread52664(tdone,ends);
    thread52665(tdone,ends);
    int biggest52666 = 0;
    if(ends[7]>=biggest52666){
      biggest52666=ends[7];
    }
    if(ends[8]>=biggest52666){
      biggest52666=ends[8];
    }
    if(ends[9]>=biggest52666){
      biggest52666=ends[9];
    }
    if(ends[10]>=biggest52666){
      biggest52666=ends[10];
    }
    if(biggest52666 == 1){
      active[6]=1;
      ends[6]=1;
      tdone[6]=1;
    }
  }

  public void thread52660(int [] tdone, int [] ends){
        S50188=1;
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

  public void thread52658(int [] tdone, int [] ends){
        S49877=1;
    if(motorPos5On.getprestatus()){//sysj\plant.sysj line: 90, column: 14
      System.out.println("Conveyor Plant - moving bottle to leave 5");//sysj\plant.sysj line: 91, column: 7
      bottleLeftPos5.setPresent();//sysj\plant.sysj line: 93, column: 8
      currsigs.addElement(bottleLeftPos5);
      active[4]=1;
      ends[4]=1;
      tdone[4]=1;
    }
    else {
      S49877=0;
      active[4]=0;
      ends[4]=0;
      tdone[4]=1;
    }
  }

  public void thread52657(int [] tdone, int [] ends){
        S49865=1;
    if(motorPos1On.getprestatus()){//sysj\plant.sysj line: 81, column: 14
      System.out.println("Conveyor plant - moving bottle to 1");//sysj\plant.sysj line: 82, column: 7
      bottleAtPos1.setPresent();//sysj\plant.sysj line: 84, column: 8
      currsigs.addElement(bottleAtPos1);
      active[3]=1;
      ends[3]=1;
      tdone[3]=1;
    }
    else {
      S49865=0;
      active[3]=0;
      ends[3]=0;
      tdone[3]=1;
    }
  }

  public void thread52656(int [] tdone, int [] ends){
        S50180=1;
    S49952=0;
    if(motConveyorOnOff.getprestatus()){//sysj\plant.sysj line: 78, column: 12
      S49950=0;
      __start_thread_2 = com.systemj.Timer.getMs();//sysj\plant.sysj line: 78, column: 29
      S49841=0;
      if(com.systemj.Timer.getMs() - __start_thread_2 >= (3) * 1000){//sysj\plant.sysj line: 78, column: 29
        ends[2]=2;
        ;//sysj\plant.sysj line: 78, column: 29
        S49950=1;
        thread52657(tdone,ends);
        thread52658(tdone,ends);
        int biggest52659 = 0;
        if(ends[3]>=biggest52659){
          biggest52659=ends[3];
        }
        if(ends[4]>=biggest52659){
          biggest52659=ends[4];
        }
        if(biggest52659 == 1){
          active[2]=1;
          ends[2]=1;
          tdone[2]=1;
        }
        //FINXME code
        if(biggest52659 == 0){
          S49952=1;
          active[2]=1;
          ends[2]=1;
          tdone[2]=1;
        }
      }
      else {
        S49841=1;
        active[2]=1;
        ends[2]=1;
        tdone[2]=1;
      }
    }
    else {
      S49952=1;
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
      switch(S52654){
        case 0 : 
          S52654=0;
          break RUN;
        
        case 1 : 
          S52654=2;
          S52654=2;
          capDec_1.setClear();//sysj\plant.sysj line: 69, column: 2
          capPos_1.setClear();//sysj\plant.sysj line: 70, column: 2
          capPos_1.setPresent();//sysj\plant.sysj line: 71, column: 2
          currsigs.addElement(capPos_1);
          capPos_1.setValue(0);//sysj\plant.sysj line: 71, column: 2
          disablePos5_1.setClear();//sysj\plant.sysj line: 72, column: 2
          thread52656(tdone,ends);
          thread52660(tdone,ends);
          thread52661(tdone,ends);
          thread52667(tdone,ends);
          thread52668(tdone,ends);
          thread52669(tdone,ends);
          thread52670(tdone,ends);
          thread52671(tdone,ends);
          thread52672(tdone,ends);
          thread52673(tdone,ends);
          thread52674(tdone,ends);
          thread52675(tdone,ends);
          thread52676(tdone,ends);
          thread52677(tdone,ends);
          thread52678(tdone,ends);
          thread52679(tdone,ends);
          thread52680(tdone,ends);
          thread52681(tdone,ends);
          int biggest52682 = 0;
          if(ends[2]>=biggest52682){
            biggest52682=ends[2];
          }
          if(ends[5]>=biggest52682){
            biggest52682=ends[5];
          }
          if(ends[6]>=biggest52682){
            biggest52682=ends[6];
          }
          if(ends[11]>=biggest52682){
            biggest52682=ends[11];
          }
          if(ends[12]>=biggest52682){
            biggest52682=ends[12];
          }
          if(ends[13]>=biggest52682){
            biggest52682=ends[13];
          }
          if(ends[14]>=biggest52682){
            biggest52682=ends[14];
          }
          if(ends[15]>=biggest52682){
            biggest52682=ends[15];
          }
          if(ends[16]>=biggest52682){
            biggest52682=ends[16];
          }
          if(ends[17]>=biggest52682){
            biggest52682=ends[17];
          }
          if(ends[18]>=biggest52682){
            biggest52682=ends[18];
          }
          if(ends[19]>=biggest52682){
            biggest52682=ends[19];
          }
          if(ends[20]>=biggest52682){
            biggest52682=ends[20];
          }
          if(ends[21]>=biggest52682){
            biggest52682=ends[21];
          }
          if(ends[22]>=biggest52682){
            biggest52682=ends[22];
          }
          if(ends[23]>=biggest52682){
            biggest52682=ends[23];
          }
          if(ends[24]>=biggest52682){
            biggest52682=ends[24];
          }
          if(ends[25]>=biggest52682){
            biggest52682=ends[25];
          }
          if(biggest52682 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
        
        case 2 : 
          capDec_1.setClear();//sysj\plant.sysj line: 69, column: 2
          capPos_1.setClear();//sysj\plant.sysj line: 70, column: 2
          disablePos5_1.setClear();//sysj\plant.sysj line: 72, column: 2
          thread52683(tdone,ends);
          thread52696(tdone,ends);
          thread52697(tdone,ends);
          thread52703(tdone,ends);
          thread52704(tdone,ends);
          thread52705(tdone,ends);
          thread52706(tdone,ends);
          thread52707(tdone,ends);
          thread52708(tdone,ends);
          thread52709(tdone,ends);
          thread52710(tdone,ends);
          thread52711(tdone,ends);
          thread52712(tdone,ends);
          thread52713(tdone,ends);
          thread52714(tdone,ends);
          thread52715(tdone,ends);
          thread52716(tdone,ends);
          thread52717(tdone,ends);
          int biggest52718 = 0;
          if(ends[2]>=biggest52718){
            biggest52718=ends[2];
          }
          if(ends[5]>=biggest52718){
            biggest52718=ends[5];
          }
          if(ends[6]>=biggest52718){
            biggest52718=ends[6];
          }
          if(ends[11]>=biggest52718){
            biggest52718=ends[11];
          }
          if(ends[12]>=biggest52718){
            biggest52718=ends[12];
          }
          if(ends[13]>=biggest52718){
            biggest52718=ends[13];
          }
          if(ends[14]>=biggest52718){
            biggest52718=ends[14];
          }
          if(ends[15]>=biggest52718){
            biggest52718=ends[15];
          }
          if(ends[16]>=biggest52718){
            biggest52718=ends[16];
          }
          if(ends[17]>=biggest52718){
            biggest52718=ends[17];
          }
          if(ends[18]>=biggest52718){
            biggest52718=ends[18];
          }
          if(ends[19]>=biggest52718){
            biggest52718=ends[19];
          }
          if(ends[20]>=biggest52718){
            biggest52718=ends[20];
          }
          if(ends[21]>=biggest52718){
            biggest52718=ends[21];
          }
          if(ends[22]>=biggest52718){
            biggest52718=ends[22];
          }
          if(ends[23]>=biggest52718){
            biggest52718=ends[23];
          }
          if(ends[24]>=biggest52718){
            biggest52718=ends[24];
          }
          if(ends[25]>=biggest52718){
            biggest52718=ends[25];
          }
          if(biggest52718 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
          //FINXME code
          if(biggest52718 == 0){
            S52654=0;
            active[1]=0;
            ends[1]=0;
            S52654=0;
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
