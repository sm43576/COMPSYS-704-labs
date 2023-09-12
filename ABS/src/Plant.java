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
  private long __start_thread_21;//sysj\plant.sysj line: 326, column: 31
  private int S55881 = 1;
  private int S51475 = 1;
  private int S51247 = 1;
  private int S51245 = 1;
  private int S51136 = 1;
  private int S51160 = 1;
  private int S51172 = 1;
  private int S51483 = 1;
  private int S51717 = 1;
  private int S51577 = 1;
  private int S51515 = 1;
  private int S51585 = 1;
  private int S51579 = 1;
  private int S51605 = 1;
  private int S51591 = 1;
  private int S51715 = 1;
  private int S51641 = 1;
  private int S51782 = 1;
  private int S51738 = 1;
  private int S51931 = 1;
  private int S51815 = 1;
  private int S51951 = 1;
  private int S51937 = 1;
  private int S52019 = 1;
  private int S51973 = 1;
  private int S51955 = 1;
  private int S52081 = 1;
  private int S52113 = 1;
  private int S52091 = 1;
  private int S52190 = 1;
  private int S52122 = 1;
  private int S52330 = 1;
  private int S52220 = 1;
  private int S52395 = 1;
  private int S52351 = 1;
  private int S52451 = 1;
  private int S52413 = 1;
  private int S53386 = 1;
  private int S52762 = 1;
  private int S52466 = 1;
  private int S53418 = 1;
  private int S53396 = 1;
  private int S53447 = 1;
  private int S53427 = 1;
  private int S53476 = 1;
  private int S53456 = 1;
  private int S53505 = 1;
  private int S53485 = 1;
  
  private int[] ends = new int[26];
  private int[] tdone = new int[26];
  
  public void thread55944(int [] tdone, int [] ends){
        switch(S53505){
      case 0 : 
        active[25]=0;
        ends[25]=0;
        tdone[25]=1;
        break;
      
      case 1 : 
        switch(S53485){
          case 0 : 
            bottleAtPos2.setPresent();//sysj\plant.sysj line: 383, column: 83
            currsigs.addElement(bottleAtPos2);
            active[25]=1;
            ends[25]=1;
            tdone[25]=1;
            break;
          
          case 1 : 
            S53485=1;
            S53485=0;
            if(moveToPos2.getprestatus()){//sysj\plant.sysj line: 383, column: 24
              System.out.println("bottle is now at pos 2");//sysj\plant.sysj line: 383, column: 36
              bottleAtPos2.setPresent();//sysj\plant.sysj line: 383, column: 83
              currsigs.addElement(bottleAtPos2);
              active[25]=1;
              ends[25]=1;
              tdone[25]=1;
            }
            else {
              S53485=1;
              active[25]=1;
              ends[25]=1;
              tdone[25]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread55943(int [] tdone, int [] ends){
        switch(S53476){
      case 0 : 
        active[24]=0;
        ends[24]=0;
        tdone[24]=1;
        break;
      
      case 1 : 
        switch(S53456){
          case 0 : 
            bottleAtPos3.setPresent();//sysj\plant.sysj line: 381, column: 83
            currsigs.addElement(bottleAtPos3);
            active[24]=1;
            ends[24]=1;
            tdone[24]=1;
            break;
          
          case 1 : 
            S53456=1;
            S53456=0;
            if(moveToPos3.getprestatus()){//sysj\plant.sysj line: 381, column: 24
              System.out.println("bottle is now at pos 3");//sysj\plant.sysj line: 381, column: 36
              bottleAtPos3.setPresent();//sysj\plant.sysj line: 381, column: 83
              currsigs.addElement(bottleAtPos3);
              active[24]=1;
              ends[24]=1;
              tdone[24]=1;
            }
            else {
              S53456=1;
              active[24]=1;
              ends[24]=1;
              tdone[24]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread55942(int [] tdone, int [] ends){
        switch(S53447){
      case 0 : 
        active[23]=0;
        ends[23]=0;
        tdone[23]=1;
        break;
      
      case 1 : 
        switch(S53427){
          case 0 : 
            bottleAtPos4.setPresent();//sysj\plant.sysj line: 379, column: 82
            currsigs.addElement(bottleAtPos4);
            active[23]=1;
            ends[23]=1;
            tdone[23]=1;
            break;
          
          case 1 : 
            S53427=1;
            S53427=0;
            if(moveToPos4.getprestatus()){//sysj\plant.sysj line: 379, column: 24
              System.out.println("bottle is now at pos 4");//sysj\plant.sysj line: 379, column: 36
              bottleAtPos4.setPresent();//sysj\plant.sysj line: 379, column: 82
              currsigs.addElement(bottleAtPos4);
              active[23]=1;
              ends[23]=1;
              tdone[23]=1;
            }
            else {
              S53427=1;
              active[23]=1;
              ends[23]=1;
              tdone[23]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread55941(int [] tdone, int [] ends){
        switch(S53418){
      case 0 : 
        active[22]=0;
        ends[22]=0;
        tdone[22]=1;
        break;
      
      case 1 : 
        switch(S53396){
          case 0 : 
            if(bottleLeftPos5.getprestatus()){//sysj\plant.sysj line: 369, column: 10
              S53396=1;
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
            S53396=1;
            S53396=0;
            if(moveToPos5.getprestatus()){//sysj\plant.sysj line: 370, column: 13
              System.out.println("bottle is now at pos 5");//sysj\plant.sysj line: 371, column: 6
              bottleAtPos5.setPresent();//sysj\plant.sysj line: 372, column: 6
              currsigs.addElement(bottleAtPos5);
              active[22]=1;
              ends[22]=1;
              tdone[22]=1;
            }
            else {
              S53396=1;
              active[22]=1;
              ends[22]=1;
              tdone[22]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread55940(int [] tdone, int [] ends){
        switch(S53386){
      case 0 : 
        active[21]=0;
        ends[21]=0;
        tdone[21]=1;
        break;
      
      case 1 : 
        switch(S52762){
          case 0 : 
            switch(S52466){
              case 0 : 
                if(com.systemj.Timer.getMs() - __start_thread_21 >= 100){//sysj\plant.sysj line: 326, column: 31
                  ends[21]=2;
                  ;//sysj\plant.sysj line: 326, column: 31
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
                          S52466=1;
                          tableAlignedWithSensor.setPresent();//sysj\plant.sysj line: 358, column: 6
                          currsigs.addElement(tableAlignedWithSensor);
                          active[21]=1;
                          ends[21]=1;
                          tdone[21]=1;
                        }
                        else {
                          System.out.println("Table has been aligned");//sysj\plant.sysj line: 355, column: 5
                          S52466=1;
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
                          S52466=1;
                          tableAlignedWithSensor.setPresent();//sysj\plant.sysj line: 358, column: 6
                          currsigs.addElement(tableAlignedWithSensor);
                          active[21]=1;
                          ends[21]=1;
                          tdone[21]=1;
                        }
                        else {
                          System.out.println("Table has been aligned");//sysj\plant.sysj line: 355, column: 5
                          S52466=1;
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
                          S52466=1;
                          tableAlignedWithSensor.setPresent();//sysj\plant.sysj line: 358, column: 6
                          currsigs.addElement(tableAlignedWithSensor);
                          active[21]=1;
                          ends[21]=1;
                          tdone[21]=1;
                        }
                        else {
                          System.out.println("Table has been aligned");//sysj\plant.sysj line: 355, column: 5
                          S52466=1;
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
                          S52466=1;
                          tableAlignedWithSensor.setPresent();//sysj\plant.sysj line: 358, column: 6
                          currsigs.addElement(tableAlignedWithSensor);
                          active[21]=1;
                          ends[21]=1;
                          tdone[21]=1;
                        }
                        else {
                          System.out.println("Table has been aligned");//sysj\plant.sysj line: 355, column: 5
                          S52466=1;
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
                          S52466=1;
                          tableAlignedWithSensor.setPresent();//sysj\plant.sysj line: 358, column: 6
                          currsigs.addElement(tableAlignedWithSensor);
                          active[21]=1;
                          ends[21]=1;
                          tdone[21]=1;
                        }
                        else {
                          System.out.println("Table has been aligned");//sysj\plant.sysj line: 355, column: 5
                          S52466=1;
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
                          S52466=1;
                          tableAlignedWithSensor.setPresent();//sysj\plant.sysj line: 358, column: 6
                          currsigs.addElement(tableAlignedWithSensor);
                          active[21]=1;
                          ends[21]=1;
                          tdone[21]=1;
                        }
                        else {
                          System.out.println("Table has been aligned");//sysj\plant.sysj line: 355, column: 5
                          S52466=1;
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
                          S52466=1;
                          tableAlignedWithSensor.setPresent();//sysj\plant.sysj line: 358, column: 6
                          currsigs.addElement(tableAlignedWithSensor);
                          active[21]=1;
                          ends[21]=1;
                          tdone[21]=1;
                        }
                        else {
                          System.out.println("Table has been aligned");//sysj\plant.sysj line: 355, column: 5
                          S52466=1;
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
                          S52466=1;
                          tableAlignedWithSensor.setPresent();//sysj\plant.sysj line: 358, column: 6
                          currsigs.addElement(tableAlignedWithSensor);
                          active[21]=1;
                          ends[21]=1;
                          tdone[21]=1;
                        }
                        else {
                          System.out.println("Table has been aligned");//sysj\plant.sysj line: 355, column: 5
                          S52466=1;
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
                  active[21]=1;
                  ends[21]=1;
                  tdone[21]=1;
                }
                break;
              
              case 1 : 
                if(!rotaryTableTrigger.getprestatus()){//sysj\plant.sysj line: 357, column: 11
                  S52762=1;
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
              
            }
            break;
          
          case 1 : 
            S52762=1;
            S52762=0;
            if(rotaryTableTrigger.getprestatus()){//sysj\plant.sysj line: 326, column: 12
              S52466=0;
              __start_thread_21 = com.systemj.Timer.getMs();//sysj\plant.sysj line: 326, column: 31
              if(com.systemj.Timer.getMs() - __start_thread_21 >= 100){//sysj\plant.sysj line: 326, column: 31
                ends[21]=2;
                ;//sysj\plant.sysj line: 326, column: 31
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
                        S52466=1;
                        tableAlignedWithSensor.setPresent();//sysj\plant.sysj line: 358, column: 6
                        currsigs.addElement(tableAlignedWithSensor);
                        active[21]=1;
                        ends[21]=1;
                        tdone[21]=1;
                      }
                      else {
                        System.out.println("Table has been aligned");//sysj\plant.sysj line: 355, column: 5
                        S52466=1;
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
                        S52466=1;
                        tableAlignedWithSensor.setPresent();//sysj\plant.sysj line: 358, column: 6
                        currsigs.addElement(tableAlignedWithSensor);
                        active[21]=1;
                        ends[21]=1;
                        tdone[21]=1;
                      }
                      else {
                        System.out.println("Table has been aligned");//sysj\plant.sysj line: 355, column: 5
                        S52466=1;
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
                        S52466=1;
                        tableAlignedWithSensor.setPresent();//sysj\plant.sysj line: 358, column: 6
                        currsigs.addElement(tableAlignedWithSensor);
                        active[21]=1;
                        ends[21]=1;
                        tdone[21]=1;
                      }
                      else {
                        System.out.println("Table has been aligned");//sysj\plant.sysj line: 355, column: 5
                        S52466=1;
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
                        S52466=1;
                        tableAlignedWithSensor.setPresent();//sysj\plant.sysj line: 358, column: 6
                        currsigs.addElement(tableAlignedWithSensor);
                        active[21]=1;
                        ends[21]=1;
                        tdone[21]=1;
                      }
                      else {
                        System.out.println("Table has been aligned");//sysj\plant.sysj line: 355, column: 5
                        S52466=1;
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
                        S52466=1;
                        tableAlignedWithSensor.setPresent();//sysj\plant.sysj line: 358, column: 6
                        currsigs.addElement(tableAlignedWithSensor);
                        active[21]=1;
                        ends[21]=1;
                        tdone[21]=1;
                      }
                      else {
                        System.out.println("Table has been aligned");//sysj\plant.sysj line: 355, column: 5
                        S52466=1;
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
                        S52466=1;
                        tableAlignedWithSensor.setPresent();//sysj\plant.sysj line: 358, column: 6
                        currsigs.addElement(tableAlignedWithSensor);
                        active[21]=1;
                        ends[21]=1;
                        tdone[21]=1;
                      }
                      else {
                        System.out.println("Table has been aligned");//sysj\plant.sysj line: 355, column: 5
                        S52466=1;
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
                        S52466=1;
                        tableAlignedWithSensor.setPresent();//sysj\plant.sysj line: 358, column: 6
                        currsigs.addElement(tableAlignedWithSensor);
                        active[21]=1;
                        ends[21]=1;
                        tdone[21]=1;
                      }
                      else {
                        System.out.println("Table has been aligned");//sysj\plant.sysj line: 355, column: 5
                        S52466=1;
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
                        S52466=1;
                        tableAlignedWithSensor.setPresent();//sysj\plant.sysj line: 358, column: 6
                        currsigs.addElement(tableAlignedWithSensor);
                        active[21]=1;
                        ends[21]=1;
                        tdone[21]=1;
                      }
                      else {
                        System.out.println("Table has been aligned");//sysj\plant.sysj line: 355, column: 5
                        S52466=1;
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
                active[21]=1;
                ends[21]=1;
                tdone[21]=1;
              }
            }
            else {
              S52762=1;
              active[21]=1;
              ends[21]=1;
              tdone[21]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread55939(int [] tdone, int [] ends){
        switch(S52451){
      case 0 : 
        active[20]=0;
        ends[20]=0;
        tdone[20]=1;
        break;
      
      case 1 : 
        switch(S52413){
          case 0 : 
            if(cylClampBottleExtend.getprestatus()){//sysj\plant.sysj line: 313, column: 11
              S52413=1;
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
              S52413=2;
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
            S52413=2;
            S52413=0;
            active[20]=1;
            ends[20]=1;
            tdone[20]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread55938(int [] tdone, int [] ends){
        switch(S52395){
      case 0 : 
        active[19]=0;
        ends[19]=0;
        tdone[19]=1;
        break;
      
      case 1 : 
        switch(S52351){
          case 0 : 
            if(gripperTurnRetract.getprestatus()){//sysj\plant.sysj line: 297, column: 12
              S52351=1;
              if(gripperTurnRetract.getprestatus() && !gripperTurnExtend.getprestatus()){//sysj\plant.sysj line: 301, column: 13
                gripperTurnHomePos.setPresent();//sysj\plant.sysj line: 303, column: 7
                currsigs.addElement(gripperTurnHomePos);
                active[19]=1;
                ends[19]=1;
                tdone[19]=1;
              }
              else {
                S52351=2;
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
              S52351=2;
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
            S52351=2;
            S52351=0;
            if(gripperTurnExtend.getprestatus() && !gripperTurnRetract.getprestatus()){//sysj\plant.sysj line: 296, column: 13
              gripperTurnFinalPos.setPresent();//sysj\plant.sysj line: 298, column: 7
              currsigs.addElement(gripperTurnFinalPos);
              active[19]=1;
              ends[19]=1;
              tdone[19]=1;
            }
            else {
              S52351=1;
              if(gripperTurnRetract.getprestatus() && !gripperTurnExtend.getprestatus()){//sysj\plant.sysj line: 301, column: 13
                gripperTurnHomePos.setPresent();//sysj\plant.sysj line: 303, column: 7
                currsigs.addElement(gripperTurnHomePos);
                active[19]=1;
                ends[19]=1;
                tdone[19]=1;
              }
              else {
                S52351=2;
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

  public void thread55937(int [] tdone, int [] ends){
        switch(S52330){
      case 0 : 
        active[18]=0;
        ends[18]=0;
        tdone[18]=1;
        break;
      
      case 1 : 
        switch(S52220){
          case 0 : 
            if(capGripperPos5Extend.getprestatus()){//sysj\plant.sysj line: 284, column: 11
              S52220=1;
              __start_thread_18 = com.systemj.Timer.getMs();//sysj\plant.sysj line: 283, column: 4
              if(com.systemj.Timer.getMs() - __start_thread_18 >= (3) * 1000){//sysj\plant.sysj line: 283, column: 4
                ends[18]=2;
                ;//sysj\plant.sysj line: 283, column: 4
                S52220=2;
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
              S52220=2;
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
              S52220=3;
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
            S52220=3;
            S52220=0;
            active[18]=1;
            ends[18]=1;
            tdone[18]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread55936(int [] tdone, int [] ends){
        switch(S52190){
      case 0 : 
        active[17]=0;
        ends[17]=0;
        tdone[17]=1;
        break;
      
      case 1 : 
        switch(S52122){
          case 0 : 
            if(cylPos5ZAxisExtend.getprestatus()){//sysj\plant.sysj line: 268, column: 11
              System.out.println("Gipper Tranistion");//sysj\plant.sysj line: 272, column: 5
              S52122=1;
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
              S52122=2;
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
            S52122=2;
            S52122=0;
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

  public void thread55935(int [] tdone, int [] ends){
        switch(S52113){
      case 0 : 
        active[16]=0;
        ends[16]=0;
        tdone[16]=1;
        break;
      
      case 1 : 
        switch(S52091){
          case 0 : 
            if(moveToPos4.getprestatus()){//sysj\plant.sysj line: 257, column: 11
              S52091=1;
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
              S52091=2;
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
            S52091=2;
            S52091=0;
            active[16]=1;
            ends[16]=1;
            tdone[16]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread55934(int [] tdone, int [] ends){
        switch(S52081){
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

  public void thread55933(int [] tdone, int [] ends){
        switch(S52019){
      case 0 : 
        active[14]=0;
        ends[14]=0;
        tdone[14]=1;
        break;
      
      case 1 : 
        switch(S51973){
          case 0 : 
            if(magEmpty.getprestatus()){//sysj\plant.sysj line: 223, column: 10
              S51973=1;
              active[14]=1;
              ends[14]=1;
              tdone[14]=1;
            }
            else {
              switch(S51955){
                case 0 : 
                  if(pusherRetracted.getprestatus()){//sysj\plant.sysj line: 225, column: 13
                    S51955=1;
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
                    S51955=2;
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
                    S51955=3;
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
                  S51955=3;
                  S51955=0;
                  active[14]=1;
                  ends[14]=1;
                  tdone[14]=1;
                  break;
                
              }
            }
            break;
          
          case 1 : 
            if(magReq.getprestatus()){//sysj\plant.sysj line: 232, column: 10
              S51973=2;
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
            S51973=2;
            S51973=0;
            S51955=0;
            active[14]=1;
            ends[14]=1;
            tdone[14]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread55932(int [] tdone, int [] ends){
        switch(S51951){
      case 0 : 
        active[13]=0;
        ends[13]=0;
        tdone[13]=1;
        break;
      
      case 1 : 
        switch(S51937){
          case 0 : 
            if(magEmpty.getprestatus() || !vacOn.getprestatus()){//sysj\plant.sysj line: 213, column: 11
              S51937=1;
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
            S51937=1;
            S51937=0;
            if(vacOn.getprestatus() && armAtSource.getprestatus()){//sysj\plant.sysj line: 212, column: 12
              WPgripped.setPresent();//sysj\plant.sysj line: 214, column: 6
              currsigs.addElement(WPgripped);
              active[13]=1;
              ends[13]=1;
              tdone[13]=1;
            }
            else {
              S51937=1;
              active[13]=1;
              ends[13]=1;
              tdone[13]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread55931(int [] tdone, int [] ends){
        switch(S51931){
      case 0 : 
        active[12]=0;
        ends[12]=0;
        tdone[12]=1;
        break;
      
      case 1 : 
        switch(S51815){
          case 0 : 
            if(pusherExtend.getprestatus()){//sysj\plant.sysj line: 198, column: 10
              S51815=1;
              __start_thread_12 = com.systemj.Timer.getMs();//sysj\plant.sysj line: 197, column: 3
              if(com.systemj.Timer.getMs() - __start_thread_12 >= (3) * 1000){//sysj\plant.sysj line: 197, column: 3
                ends[12]=2;
                ;//sysj\plant.sysj line: 197, column: 3
                S51815=2;
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
              S51815=2;
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
              S51815=3;
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
            S51815=3;
            S51815=0;
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

  public void thread55930(int [] tdone, int [] ends){
        switch(S51782){
      case 0 : 
        active[11]=0;
        ends[11]=0;
        tdone[11]=1;
        break;
      
      case 1 : 
        switch(S51738){
          case 0 : 
            if(armDest.getprestatus()){//sysj\plant.sysj line: 183, column: 12
              S51738=1;
              if(armDest.getprestatus() && !armSource.getprestatus()){//sysj\plant.sysj line: 187, column: 12
                armAtDest.setPresent();//sysj\plant.sysj line: 189, column: 6
                currsigs.addElement(armAtDest);
                active[11]=1;
                ends[11]=1;
                tdone[11]=1;
              }
              else {
                S51738=2;
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
              S51738=2;
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
            S51738=2;
            S51738=0;
            if(armSource.getprestatus() && !armDest.getprestatus()){//sysj\plant.sysj line: 182, column: 12
              armAtSource.setPresent();//sysj\plant.sysj line: 184, column: 6
              currsigs.addElement(armAtSource);
              active[11]=1;
              ends[11]=1;
              tdone[11]=1;
            }
            else {
              S51738=1;
              if(armDest.getprestatus() && !armSource.getprestatus()){//sysj\plant.sysj line: 187, column: 12
                armAtDest.setPresent();//sysj\plant.sysj line: 189, column: 6
                currsigs.addElement(armAtDest);
                active[11]=1;
                ends[11]=1;
                tdone[11]=1;
              }
              else {
                S51738=2;
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

  public void thread55928(int [] tdone, int [] ends){
        switch(S51715){
      case 0 : 
        active[10]=0;
        ends[10]=0;
        tdone[10]=1;
        break;
      
      case 1 : 
        switch(S51641){
          case 0 : 
            if(dosUnitValveRetract.getprestatus()){//sysj\plant.sysj line: 159, column: 13
              S51641=1;
              if(dosUnitValveRetract.getprestatus() && !dosUnitValveExtend.getprestatus()){//sysj\plant.sysj line: 163, column: 13
                System.out.println("FillerPlant: Filling with canister " + (canister_1.getpreval() == null ? 0 : ((Integer)canister_1.getpreval()).intValue()) + " Percent: " + (percent_1.getpreval() == null ? 0 : ((Integer)percent_1.getpreval()).intValue()));//sysj\plant.sysj line: 164, column: 6
                dosUnitFilled.setPresent();//sysj\plant.sysj line: 166, column: 7
                currsigs.addElement(dosUnitFilled);
                active[10]=1;
                ends[10]=1;
                tdone[10]=1;
              }
              else {
                S51641=2;
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
              S51641=2;
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
            S51641=2;
            S51641=0;
            if(dosUnitValveExtend.getprestatus() && !dosUnitValveRetract.getprestatus()){//sysj\plant.sysj line: 158, column: 13
              dosUnitEvac.setPresent();//sysj\plant.sysj line: 160, column: 7
              currsigs.addElement(dosUnitEvac);
              active[10]=1;
              ends[10]=1;
              tdone[10]=1;
            }
            else {
              S51641=1;
              if(dosUnitValveRetract.getprestatus() && !dosUnitValveExtend.getprestatus()){//sysj\plant.sysj line: 163, column: 13
                System.out.println("FillerPlant: Filling with canister " + (canister_1.getpreval() == null ? 0 : ((Integer)canister_1.getpreval()).intValue()) + " Percent: " + (percent_1.getpreval() == null ? 0 : ((Integer)percent_1.getpreval()).intValue()));//sysj\plant.sysj line: 164, column: 6
                dosUnitFilled.setPresent();//sysj\plant.sysj line: 166, column: 7
                currsigs.addElement(dosUnitFilled);
                active[10]=1;
                ends[10]=1;
                tdone[10]=1;
              }
              else {
                S51641=2;
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

  public void thread55927(int [] tdone, int [] ends){
        switch(S51605){
      case 0 : 
        active[9]=0;
        ends[9]=0;
        tdone[9]=1;
        break;
      
      case 1 : 
        switch(S51591){
          case 0 : 
            if(!valveInjectorOnOff.getprestatus()){//sysj\plant.sysj line: 147, column: 12
              S51591=1;
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
            S51591=1;
            S51591=0;
            if(valveInjectorOnOff.getprestatus()){//sysj\plant.sysj line: 146, column: 13
              valveInjectorActive.setPresent();//sysj\plant.sysj line: 148, column: 7
              currsigs.addElement(valveInjectorActive);
              active[9]=1;
              ends[9]=1;
              tdone[9]=1;
            }
            else {
              S51591=1;
              active[9]=1;
              ends[9]=1;
              tdone[9]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread55926(int [] tdone, int [] ends){
        switch(S51585){
      case 0 : 
        active[8]=0;
        ends[8]=0;
        tdone[8]=1;
        break;
      
      case 1 : 
        switch(S51579){
          case 0 : 
            if(selectPercentage.getprestatus()){//sysj\plant.sysj line: 137, column: 11
              percent_1.setPresent();//sysj\plant.sysj line: 138, column: 5
              currsigs.addElement(percent_1);
              percent_1.setValue((selectPercentage.getpreval() == null ? null : ((Integer)selectPercentage.getpreval())));//sysj\plant.sysj line: 138, column: 5
              selectedPercentage.setPresent();//sysj\plant.sysj line: 139, column: 5
              currsigs.addElement(selectedPercentage);
              selectedPercentage.setValue((selectPercentage.getpreval() == null ? null : ((Integer)selectPercentage.getpreval())));//sysj\plant.sysj line: 139, column: 5
              S51579=1;
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
            S51579=1;
            S51579=0;
            active[8]=1;
            ends[8]=1;
            tdone[8]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread55925(int [] tdone, int [] ends){
        switch(S51577){
      case 0 : 
        active[7]=0;
        ends[7]=0;
        tdone[7]=1;
        break;
      
      case 1 : 
        switch(S51515){
          case 0 : 
            if(selectCanister.getprestatus()){//sysj\plant.sysj line: 126, column: 11
              S51515=1;
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
                S51515=2;
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
              S51515=2;
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
            S51515=2;
            S51515=0;
            active[7]=1;
            ends[7]=1;
            tdone[7]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread55924(int [] tdone, int [] ends){
        switch(S51717){
      case 0 : 
        active[6]=0;
        ends[6]=0;
        tdone[6]=1;
        break;
      
      case 1 : 
        canister_1.setClear();//sysj\plant.sysj line: 121, column: 3
        percent_1.setClear();//sysj\plant.sysj line: 122, column: 3
        thread55925(tdone,ends);
        thread55926(tdone,ends);
        thread55927(tdone,ends);
        thread55928(tdone,ends);
        int biggest55929 = 0;
        if(ends[7]>=biggest55929){
          biggest55929=ends[7];
        }
        if(ends[8]>=biggest55929){
          biggest55929=ends[8];
        }
        if(ends[9]>=biggest55929){
          biggest55929=ends[9];
        }
        if(ends[10]>=biggest55929){
          biggest55929=ends[10];
        }
        if(biggest55929 == 1){
          active[6]=1;
          ends[6]=1;
          tdone[6]=1;
        }
        //FINXME code
        if(biggest55929 == 0){
          S51717=0;
          active[6]=0;
          ends[6]=0;
          tdone[6]=1;
        }
        break;
      
    }
  }

  public void thread55923(int [] tdone, int [] ends){
        switch(S51483){
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

  public void thread55921(int [] tdone, int [] ends){
        S51172=1;
    if(motorPos5On.getprestatus()){//sysj\plant.sysj line: 90, column: 14
      System.out.println("Conveyor Plant - moving bottle to leave 5");//sysj\plant.sysj line: 91, column: 7
      bottleLeftPos5.setPresent();//sysj\plant.sysj line: 93, column: 8
      currsigs.addElement(bottleLeftPos5);
      active[4]=1;
      ends[4]=1;
      tdone[4]=1;
    }
    else {
      S51172=0;
      active[4]=0;
      ends[4]=0;
      tdone[4]=1;
    }
  }

  public void thread55920(int [] tdone, int [] ends){
        S51160=1;
    if(motorPos1On.getprestatus()){//sysj\plant.sysj line: 81, column: 14
      System.out.println("Conveyor plant - moving bottle to 1");//sysj\plant.sysj line: 82, column: 7
      bottleAtPos1.setPresent();//sysj\plant.sysj line: 84, column: 8
      currsigs.addElement(bottleAtPos1);
      active[3]=1;
      ends[3]=1;
      tdone[3]=1;
    }
    else {
      S51160=0;
      active[3]=0;
      ends[3]=0;
      tdone[3]=1;
    }
  }

  public void thread55918(int [] tdone, int [] ends){
        switch(S51172){
      case 0 : 
        active[4]=0;
        ends[4]=0;
        tdone[4]=1;
        break;
      
      case 1 : 
        if(!motorPos5On.getprestatus() && !motConveyorOnOff.getprestatus()){//sysj\plant.sysj line: 92, column: 13
          S51172=0;
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

  public void thread55917(int [] tdone, int [] ends){
        switch(S51160){
      case 0 : 
        active[3]=0;
        ends[3]=0;
        tdone[3]=1;
        break;
      
      case 1 : 
        if(moveToPos2.getprestatus()){//sysj\plant.sysj line: 83, column: 13
          S51160=0;
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

  public void thread55915(int [] tdone, int [] ends){
        S51172=1;
    if(motorPos5On.getprestatus()){//sysj\plant.sysj line: 90, column: 14
      System.out.println("Conveyor Plant - moving bottle to leave 5");//sysj\plant.sysj line: 91, column: 7
      bottleLeftPos5.setPresent();//sysj\plant.sysj line: 93, column: 8
      currsigs.addElement(bottleLeftPos5);
      active[4]=1;
      ends[4]=1;
      tdone[4]=1;
    }
    else {
      S51172=0;
      active[4]=0;
      ends[4]=0;
      tdone[4]=1;
    }
  }

  public void thread55914(int [] tdone, int [] ends){
        S51160=1;
    if(motorPos1On.getprestatus()){//sysj\plant.sysj line: 81, column: 14
      System.out.println("Conveyor plant - moving bottle to 1");//sysj\plant.sysj line: 82, column: 7
      bottleAtPos1.setPresent();//sysj\plant.sysj line: 84, column: 8
      currsigs.addElement(bottleAtPos1);
      active[3]=1;
      ends[3]=1;
      tdone[3]=1;
    }
    else {
      S51160=0;
      active[3]=0;
      ends[3]=0;
      tdone[3]=1;
    }
  }

  public void thread55912(int [] tdone, int [] ends){
        S51172=1;
    if(motorPos5On.getprestatus()){//sysj\plant.sysj line: 90, column: 14
      System.out.println("Conveyor Plant - moving bottle to leave 5");//sysj\plant.sysj line: 91, column: 7
      bottleLeftPos5.setPresent();//sysj\plant.sysj line: 93, column: 8
      currsigs.addElement(bottleLeftPos5);
      active[4]=1;
      ends[4]=1;
      tdone[4]=1;
    }
    else {
      S51172=0;
      active[4]=0;
      ends[4]=0;
      tdone[4]=1;
    }
  }

  public void thread55911(int [] tdone, int [] ends){
        S51160=1;
    if(motorPos1On.getprestatus()){//sysj\plant.sysj line: 81, column: 14
      System.out.println("Conveyor plant - moving bottle to 1");//sysj\plant.sysj line: 82, column: 7
      bottleAtPos1.setPresent();//sysj\plant.sysj line: 84, column: 8
      currsigs.addElement(bottleAtPos1);
      active[3]=1;
      ends[3]=1;
      tdone[3]=1;
    }
    else {
      S51160=0;
      active[3]=0;
      ends[3]=0;
      tdone[3]=1;
    }
  }

  public void thread55910(int [] tdone, int [] ends){
        switch(S51475){
      case 0 : 
        active[2]=0;
        ends[2]=0;
        tdone[2]=1;
        break;
      
      case 1 : 
        switch(S51247){
          case 0 : 
            switch(S51245){
              case 0 : 
                switch(S51136){
                  case 0 : 
                    S51136=0;
                    if(com.systemj.Timer.getMs() - __start_thread_2 >= (3) * 1000){//sysj\plant.sysj line: 78, column: 29
                      ends[2]=2;
                      ;//sysj\plant.sysj line: 78, column: 29
                      S51245=1;
                      thread55911(tdone,ends);
                      thread55912(tdone,ends);
                      int biggest55913 = 0;
                      if(ends[3]>=biggest55913){
                        biggest55913=ends[3];
                      }
                      if(ends[4]>=biggest55913){
                        biggest55913=ends[4];
                      }
                      if(biggest55913 == 1){
                        active[2]=1;
                        ends[2]=1;
                        tdone[2]=1;
                      }
                      //FINXME code
                      if(biggest55913 == 0){
                        S51247=1;
                        active[2]=1;
                        ends[2]=1;
                        tdone[2]=1;
                      }
                    }
                    else {
                      S51136=1;
                      active[2]=1;
                      ends[2]=1;
                      tdone[2]=1;
                    }
                    break;
                  
                  case 1 : 
                    S51136=1;
                    S51136=0;
                    if(com.systemj.Timer.getMs() - __start_thread_2 >= (3) * 1000){//sysj\plant.sysj line: 78, column: 29
                      ends[2]=2;
                      ;//sysj\plant.sysj line: 78, column: 29
                      S51245=1;
                      thread55914(tdone,ends);
                      thread55915(tdone,ends);
                      int biggest55916 = 0;
                      if(ends[3]>=biggest55916){
                        biggest55916=ends[3];
                      }
                      if(ends[4]>=biggest55916){
                        biggest55916=ends[4];
                      }
                      if(biggest55916 == 1){
                        active[2]=1;
                        ends[2]=1;
                        tdone[2]=1;
                      }
                      //FINXME code
                      if(biggest55916 == 0){
                        S51247=1;
                        active[2]=1;
                        ends[2]=1;
                        tdone[2]=1;
                      }
                    }
                    else {
                      S51136=1;
                      active[2]=1;
                      ends[2]=1;
                      tdone[2]=1;
                    }
                    break;
                  
                }
                break;
              
              case 1 : 
                thread55917(tdone,ends);
                thread55918(tdone,ends);
                int biggest55919 = 0;
                if(ends[3]>=biggest55919){
                  biggest55919=ends[3];
                }
                if(ends[4]>=biggest55919){
                  biggest55919=ends[4];
                }
                if(biggest55919 == 1){
                  active[2]=1;
                  ends[2]=1;
                  tdone[2]=1;
                }
                //FINXME code
                if(biggest55919 == 0){
                  S51247=1;
                  active[2]=1;
                  ends[2]=1;
                  tdone[2]=1;
                }
                break;
              
            }
            break;
          
          case 1 : 
            S51247=1;
            S51247=0;
            if(motConveyorOnOff.getprestatus()){//sysj\plant.sysj line: 78, column: 12
              S51245=0;
              __start_thread_2 = com.systemj.Timer.getMs();//sysj\plant.sysj line: 78, column: 29
              S51136=0;
              if(com.systemj.Timer.getMs() - __start_thread_2 >= (3) * 1000){//sysj\plant.sysj line: 78, column: 29
                ends[2]=2;
                ;//sysj\plant.sysj line: 78, column: 29
                S51245=1;
                thread55920(tdone,ends);
                thread55921(tdone,ends);
                int biggest55922 = 0;
                if(ends[3]>=biggest55922){
                  biggest55922=ends[3];
                }
                if(ends[4]>=biggest55922){
                  biggest55922=ends[4];
                }
                if(biggest55922 == 1){
                  active[2]=1;
                  ends[2]=1;
                  tdone[2]=1;
                }
                //FINXME code
                if(biggest55922 == 0){
                  S51247=1;
                  active[2]=1;
                  ends[2]=1;
                  tdone[2]=1;
                }
              }
              else {
                S51136=1;
                active[2]=1;
                ends[2]=1;
                tdone[2]=1;
              }
            }
            else {
              S51247=1;
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread55908(int [] tdone, int [] ends){
        S53505=1;
    S53485=0;
    if(moveToPos2.getprestatus()){//sysj\plant.sysj line: 383, column: 24
      System.out.println("bottle is now at pos 2");//sysj\plant.sysj line: 383, column: 36
      bottleAtPos2.setPresent();//sysj\plant.sysj line: 383, column: 83
      currsigs.addElement(bottleAtPos2);
      active[25]=1;
      ends[25]=1;
      tdone[25]=1;
    }
    else {
      S53485=1;
      active[25]=1;
      ends[25]=1;
      tdone[25]=1;
    }
  }

  public void thread55907(int [] tdone, int [] ends){
        S53476=1;
    S53456=0;
    if(moveToPos3.getprestatus()){//sysj\plant.sysj line: 381, column: 24
      System.out.println("bottle is now at pos 3");//sysj\plant.sysj line: 381, column: 36
      bottleAtPos3.setPresent();//sysj\plant.sysj line: 381, column: 83
      currsigs.addElement(bottleAtPos3);
      active[24]=1;
      ends[24]=1;
      tdone[24]=1;
    }
    else {
      S53456=1;
      active[24]=1;
      ends[24]=1;
      tdone[24]=1;
    }
  }

  public void thread55906(int [] tdone, int [] ends){
        S53447=1;
    S53427=0;
    if(moveToPos4.getprestatus()){//sysj\plant.sysj line: 379, column: 24
      System.out.println("bottle is now at pos 4");//sysj\plant.sysj line: 379, column: 36
      bottleAtPos4.setPresent();//sysj\plant.sysj line: 379, column: 82
      currsigs.addElement(bottleAtPos4);
      active[23]=1;
      ends[23]=1;
      tdone[23]=1;
    }
    else {
      S53427=1;
      active[23]=1;
      ends[23]=1;
      tdone[23]=1;
    }
  }

  public void thread55905(int [] tdone, int [] ends){
        S53418=1;
    S53396=0;
    if(moveToPos5.getprestatus()){//sysj\plant.sysj line: 370, column: 13
      System.out.println("bottle is now at pos 5");//sysj\plant.sysj line: 371, column: 6
      bottleAtPos5.setPresent();//sysj\plant.sysj line: 372, column: 6
      currsigs.addElement(bottleAtPos5);
      active[22]=1;
      ends[22]=1;
      tdone[22]=1;
    }
    else {
      S53396=1;
      active[22]=1;
      ends[22]=1;
      tdone[22]=1;
    }
  }

  public void thread55904(int [] tdone, int [] ends){
        S53386=1;
    S52762=0;
    if(rotaryTableTrigger.getprestatus()){//sysj\plant.sysj line: 326, column: 12
      S52466=0;
      __start_thread_21 = com.systemj.Timer.getMs();//sysj\plant.sysj line: 326, column: 31
      if(com.systemj.Timer.getMs() - __start_thread_21 >= 100){//sysj\plant.sysj line: 326, column: 31
        ends[21]=2;
        ;//sysj\plant.sysj line: 326, column: 31
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
                S52466=1;
                tableAlignedWithSensor.setPresent();//sysj\plant.sysj line: 358, column: 6
                currsigs.addElement(tableAlignedWithSensor);
                active[21]=1;
                ends[21]=1;
                tdone[21]=1;
              }
              else {
                System.out.println("Table has been aligned");//sysj\plant.sysj line: 355, column: 5
                S52466=1;
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
                S52466=1;
                tableAlignedWithSensor.setPresent();//sysj\plant.sysj line: 358, column: 6
                currsigs.addElement(tableAlignedWithSensor);
                active[21]=1;
                ends[21]=1;
                tdone[21]=1;
              }
              else {
                System.out.println("Table has been aligned");//sysj\plant.sysj line: 355, column: 5
                S52466=1;
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
                S52466=1;
                tableAlignedWithSensor.setPresent();//sysj\plant.sysj line: 358, column: 6
                currsigs.addElement(tableAlignedWithSensor);
                active[21]=1;
                ends[21]=1;
                tdone[21]=1;
              }
              else {
                System.out.println("Table has been aligned");//sysj\plant.sysj line: 355, column: 5
                S52466=1;
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
                S52466=1;
                tableAlignedWithSensor.setPresent();//sysj\plant.sysj line: 358, column: 6
                currsigs.addElement(tableAlignedWithSensor);
                active[21]=1;
                ends[21]=1;
                tdone[21]=1;
              }
              else {
                System.out.println("Table has been aligned");//sysj\plant.sysj line: 355, column: 5
                S52466=1;
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
                S52466=1;
                tableAlignedWithSensor.setPresent();//sysj\plant.sysj line: 358, column: 6
                currsigs.addElement(tableAlignedWithSensor);
                active[21]=1;
                ends[21]=1;
                tdone[21]=1;
              }
              else {
                System.out.println("Table has been aligned");//sysj\plant.sysj line: 355, column: 5
                S52466=1;
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
                S52466=1;
                tableAlignedWithSensor.setPresent();//sysj\plant.sysj line: 358, column: 6
                currsigs.addElement(tableAlignedWithSensor);
                active[21]=1;
                ends[21]=1;
                tdone[21]=1;
              }
              else {
                System.out.println("Table has been aligned");//sysj\plant.sysj line: 355, column: 5
                S52466=1;
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
                S52466=1;
                tableAlignedWithSensor.setPresent();//sysj\plant.sysj line: 358, column: 6
                currsigs.addElement(tableAlignedWithSensor);
                active[21]=1;
                ends[21]=1;
                tdone[21]=1;
              }
              else {
                System.out.println("Table has been aligned");//sysj\plant.sysj line: 355, column: 5
                S52466=1;
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
                S52466=1;
                tableAlignedWithSensor.setPresent();//sysj\plant.sysj line: 358, column: 6
                currsigs.addElement(tableAlignedWithSensor);
                active[21]=1;
                ends[21]=1;
                tdone[21]=1;
              }
              else {
                System.out.println("Table has been aligned");//sysj\plant.sysj line: 355, column: 5
                S52466=1;
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
        active[21]=1;
        ends[21]=1;
        tdone[21]=1;
      }
    }
    else {
      S52762=1;
      active[21]=1;
      ends[21]=1;
      tdone[21]=1;
    }
  }

  public void thread55903(int [] tdone, int [] ends){
        S52451=1;
    S52413=0;
    active[20]=1;
    ends[20]=1;
    tdone[20]=1;
  }

  public void thread55902(int [] tdone, int [] ends){
        S52395=1;
    S52351=0;
    if(gripperTurnExtend.getprestatus() && !gripperTurnRetract.getprestatus()){//sysj\plant.sysj line: 296, column: 13
      gripperTurnFinalPos.setPresent();//sysj\plant.sysj line: 298, column: 7
      currsigs.addElement(gripperTurnFinalPos);
      active[19]=1;
      ends[19]=1;
      tdone[19]=1;
    }
    else {
      S52351=1;
      if(gripperTurnRetract.getprestatus() && !gripperTurnExtend.getprestatus()){//sysj\plant.sysj line: 301, column: 13
        gripperTurnHomePos.setPresent();//sysj\plant.sysj line: 303, column: 7
        currsigs.addElement(gripperTurnHomePos);
        active[19]=1;
        ends[19]=1;
        tdone[19]=1;
      }
      else {
        S52351=2;
        active[19]=1;
        ends[19]=1;
        tdone[19]=1;
      }
    }
  }

  public void thread55901(int [] tdone, int [] ends){
        S52330=1;
    S52220=0;
    active[18]=1;
    ends[18]=1;
    tdone[18]=1;
  }

  public void thread55900(int [] tdone, int [] ends){
        S52190=1;
    S52122=0;
    System.out.println("Gripper Extended");//sysj\plant.sysj line: 269, column: 6
    gripperZAxisLifted.setPresent();//sysj\plant.sysj line: 270, column: 6
    currsigs.addElement(gripperZAxisLifted);
    active[17]=1;
    ends[17]=1;
    tdone[17]=1;
  }

  public void thread55899(int [] tdone, int [] ends){
        S52113=1;
    S52091=0;
    active[16]=1;
    ends[16]=1;
    tdone[16]=1;
  }

  public void thread55898(int [] tdone, int [] ends){
        S52081=1;
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

  public void thread55897(int [] tdone, int [] ends){
        S52019=1;
    S51973=0;
    S51955=0;
    active[14]=1;
    ends[14]=1;
    tdone[14]=1;
  }

  public void thread55896(int [] tdone, int [] ends){
        S51951=1;
    S51937=0;
    if(vacOn.getprestatus() && armAtSource.getprestatus()){//sysj\plant.sysj line: 212, column: 12
      WPgripped.setPresent();//sysj\plant.sysj line: 214, column: 6
      currsigs.addElement(WPgripped);
      active[13]=1;
      ends[13]=1;
      tdone[13]=1;
    }
    else {
      S51937=1;
      active[13]=1;
      ends[13]=1;
      tdone[13]=1;
    }
  }

  public void thread55895(int [] tdone, int [] ends){
        S51931=1;
    S51815=0;
    pusherRetracted.setPresent();//sysj\plant.sysj line: 199, column: 5
    currsigs.addElement(pusherRetracted);
    active[12]=1;
    ends[12]=1;
    tdone[12]=1;
  }

  public void thread55894(int [] tdone, int [] ends){
        S51782=1;
    S51738=0;
    if(armSource.getprestatus() && !armDest.getprestatus()){//sysj\plant.sysj line: 182, column: 12
      armAtSource.setPresent();//sysj\plant.sysj line: 184, column: 6
      currsigs.addElement(armAtSource);
      active[11]=1;
      ends[11]=1;
      tdone[11]=1;
    }
    else {
      S51738=1;
      if(armDest.getprestatus() && !armSource.getprestatus()){//sysj\plant.sysj line: 187, column: 12
        armAtDest.setPresent();//sysj\plant.sysj line: 189, column: 6
        currsigs.addElement(armAtDest);
        active[11]=1;
        ends[11]=1;
        tdone[11]=1;
      }
      else {
        S51738=2;
        active[11]=1;
        ends[11]=1;
        tdone[11]=1;
      }
    }
  }

  public void thread55892(int [] tdone, int [] ends){
        S51715=1;
    S51641=0;
    if(dosUnitValveExtend.getprestatus() && !dosUnitValveRetract.getprestatus()){//sysj\plant.sysj line: 158, column: 13
      dosUnitEvac.setPresent();//sysj\plant.sysj line: 160, column: 7
      currsigs.addElement(dosUnitEvac);
      active[10]=1;
      ends[10]=1;
      tdone[10]=1;
    }
    else {
      S51641=1;
      if(dosUnitValveRetract.getprestatus() && !dosUnitValveExtend.getprestatus()){//sysj\plant.sysj line: 163, column: 13
        System.out.println("FillerPlant: Filling with canister " + (canister_1.getpreval() == null ? 0 : ((Integer)canister_1.getpreval()).intValue()) + " Percent: " + (percent_1.getpreval() == null ? 0 : ((Integer)percent_1.getpreval()).intValue()));//sysj\plant.sysj line: 164, column: 6
        dosUnitFilled.setPresent();//sysj\plant.sysj line: 166, column: 7
        currsigs.addElement(dosUnitFilled);
        active[10]=1;
        ends[10]=1;
        tdone[10]=1;
      }
      else {
        S51641=2;
        active[10]=1;
        ends[10]=1;
        tdone[10]=1;
      }
    }
  }

  public void thread55891(int [] tdone, int [] ends){
        S51605=1;
    S51591=0;
    if(valveInjectorOnOff.getprestatus()){//sysj\plant.sysj line: 146, column: 13
      valveInjectorActive.setPresent();//sysj\plant.sysj line: 148, column: 7
      currsigs.addElement(valveInjectorActive);
      active[9]=1;
      ends[9]=1;
      tdone[9]=1;
    }
    else {
      S51591=1;
      active[9]=1;
      ends[9]=1;
      tdone[9]=1;
    }
  }

  public void thread55890(int [] tdone, int [] ends){
        S51585=1;
    S51579=0;
    active[8]=1;
    ends[8]=1;
    tdone[8]=1;
  }

  public void thread55889(int [] tdone, int [] ends){
        S51577=1;
    S51515=0;
    active[7]=1;
    ends[7]=1;
    tdone[7]=1;
  }

  public void thread55888(int [] tdone, int [] ends){
        S51717=1;
    canister_1.setClear();//sysj\plant.sysj line: 121, column: 3
    percent_1.setClear();//sysj\plant.sysj line: 122, column: 3
    thread55889(tdone,ends);
    thread55890(tdone,ends);
    thread55891(tdone,ends);
    thread55892(tdone,ends);
    int biggest55893 = 0;
    if(ends[7]>=biggest55893){
      biggest55893=ends[7];
    }
    if(ends[8]>=biggest55893){
      biggest55893=ends[8];
    }
    if(ends[9]>=biggest55893){
      biggest55893=ends[9];
    }
    if(ends[10]>=biggest55893){
      biggest55893=ends[10];
    }
    if(biggest55893 == 1){
      active[6]=1;
      ends[6]=1;
      tdone[6]=1;
    }
  }

  public void thread55887(int [] tdone, int [] ends){
        S51483=1;
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

  public void thread55885(int [] tdone, int [] ends){
        S51172=1;
    if(motorPos5On.getprestatus()){//sysj\plant.sysj line: 90, column: 14
      System.out.println("Conveyor Plant - moving bottle to leave 5");//sysj\plant.sysj line: 91, column: 7
      bottleLeftPos5.setPresent();//sysj\plant.sysj line: 93, column: 8
      currsigs.addElement(bottleLeftPos5);
      active[4]=1;
      ends[4]=1;
      tdone[4]=1;
    }
    else {
      S51172=0;
      active[4]=0;
      ends[4]=0;
      tdone[4]=1;
    }
  }

  public void thread55884(int [] tdone, int [] ends){
        S51160=1;
    if(motorPos1On.getprestatus()){//sysj\plant.sysj line: 81, column: 14
      System.out.println("Conveyor plant - moving bottle to 1");//sysj\plant.sysj line: 82, column: 7
      bottleAtPos1.setPresent();//sysj\plant.sysj line: 84, column: 8
      currsigs.addElement(bottleAtPos1);
      active[3]=1;
      ends[3]=1;
      tdone[3]=1;
    }
    else {
      S51160=0;
      active[3]=0;
      ends[3]=0;
      tdone[3]=1;
    }
  }

  public void thread55883(int [] tdone, int [] ends){
        S51475=1;
    S51247=0;
    if(motConveyorOnOff.getprestatus()){//sysj\plant.sysj line: 78, column: 12
      S51245=0;
      __start_thread_2 = com.systemj.Timer.getMs();//sysj\plant.sysj line: 78, column: 29
      S51136=0;
      if(com.systemj.Timer.getMs() - __start_thread_2 >= (3) * 1000){//sysj\plant.sysj line: 78, column: 29
        ends[2]=2;
        ;//sysj\plant.sysj line: 78, column: 29
        S51245=1;
        thread55884(tdone,ends);
        thread55885(tdone,ends);
        int biggest55886 = 0;
        if(ends[3]>=biggest55886){
          biggest55886=ends[3];
        }
        if(ends[4]>=biggest55886){
          biggest55886=ends[4];
        }
        if(biggest55886 == 1){
          active[2]=1;
          ends[2]=1;
          tdone[2]=1;
        }
        //FINXME code
        if(biggest55886 == 0){
          S51247=1;
          active[2]=1;
          ends[2]=1;
          tdone[2]=1;
        }
      }
      else {
        S51136=1;
        active[2]=1;
        ends[2]=1;
        tdone[2]=1;
      }
    }
    else {
      S51247=1;
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
      switch(S55881){
        case 0 : 
          S55881=0;
          break RUN;
        
        case 1 : 
          S55881=2;
          S55881=2;
          capDec_1.setClear();//sysj\plant.sysj line: 69, column: 2
          capPos_1.setClear();//sysj\plant.sysj line: 70, column: 2
          capPos_1.setPresent();//sysj\plant.sysj line: 71, column: 2
          currsigs.addElement(capPos_1);
          capPos_1.setValue(0);//sysj\plant.sysj line: 71, column: 2
          disablePos5_1.setClear();//sysj\plant.sysj line: 72, column: 2
          thread55883(tdone,ends);
          thread55887(tdone,ends);
          thread55888(tdone,ends);
          thread55894(tdone,ends);
          thread55895(tdone,ends);
          thread55896(tdone,ends);
          thread55897(tdone,ends);
          thread55898(tdone,ends);
          thread55899(tdone,ends);
          thread55900(tdone,ends);
          thread55901(tdone,ends);
          thread55902(tdone,ends);
          thread55903(tdone,ends);
          thread55904(tdone,ends);
          thread55905(tdone,ends);
          thread55906(tdone,ends);
          thread55907(tdone,ends);
          thread55908(tdone,ends);
          int biggest55909 = 0;
          if(ends[2]>=biggest55909){
            biggest55909=ends[2];
          }
          if(ends[5]>=biggest55909){
            biggest55909=ends[5];
          }
          if(ends[6]>=biggest55909){
            biggest55909=ends[6];
          }
          if(ends[11]>=biggest55909){
            biggest55909=ends[11];
          }
          if(ends[12]>=biggest55909){
            biggest55909=ends[12];
          }
          if(ends[13]>=biggest55909){
            biggest55909=ends[13];
          }
          if(ends[14]>=biggest55909){
            biggest55909=ends[14];
          }
          if(ends[15]>=biggest55909){
            biggest55909=ends[15];
          }
          if(ends[16]>=biggest55909){
            biggest55909=ends[16];
          }
          if(ends[17]>=biggest55909){
            biggest55909=ends[17];
          }
          if(ends[18]>=biggest55909){
            biggest55909=ends[18];
          }
          if(ends[19]>=biggest55909){
            biggest55909=ends[19];
          }
          if(ends[20]>=biggest55909){
            biggest55909=ends[20];
          }
          if(ends[21]>=biggest55909){
            biggest55909=ends[21];
          }
          if(ends[22]>=biggest55909){
            biggest55909=ends[22];
          }
          if(ends[23]>=biggest55909){
            biggest55909=ends[23];
          }
          if(ends[24]>=biggest55909){
            biggest55909=ends[24];
          }
          if(ends[25]>=biggest55909){
            biggest55909=ends[25];
          }
          if(biggest55909 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
        
        case 2 : 
          capDec_1.setClear();//sysj\plant.sysj line: 69, column: 2
          capPos_1.setClear();//sysj\plant.sysj line: 70, column: 2
          disablePos5_1.setClear();//sysj\plant.sysj line: 72, column: 2
          thread55910(tdone,ends);
          thread55923(tdone,ends);
          thread55924(tdone,ends);
          thread55930(tdone,ends);
          thread55931(tdone,ends);
          thread55932(tdone,ends);
          thread55933(tdone,ends);
          thread55934(tdone,ends);
          thread55935(tdone,ends);
          thread55936(tdone,ends);
          thread55937(tdone,ends);
          thread55938(tdone,ends);
          thread55939(tdone,ends);
          thread55940(tdone,ends);
          thread55941(tdone,ends);
          thread55942(tdone,ends);
          thread55943(tdone,ends);
          thread55944(tdone,ends);
          int biggest55945 = 0;
          if(ends[2]>=biggest55945){
            biggest55945=ends[2];
          }
          if(ends[5]>=biggest55945){
            biggest55945=ends[5];
          }
          if(ends[6]>=biggest55945){
            biggest55945=ends[6];
          }
          if(ends[11]>=biggest55945){
            biggest55945=ends[11];
          }
          if(ends[12]>=biggest55945){
            biggest55945=ends[12];
          }
          if(ends[13]>=biggest55945){
            biggest55945=ends[13];
          }
          if(ends[14]>=biggest55945){
            biggest55945=ends[14];
          }
          if(ends[15]>=biggest55945){
            biggest55945=ends[15];
          }
          if(ends[16]>=biggest55945){
            biggest55945=ends[16];
          }
          if(ends[17]>=biggest55945){
            biggest55945=ends[17];
          }
          if(ends[18]>=biggest55945){
            biggest55945=ends[18];
          }
          if(ends[19]>=biggest55945){
            biggest55945=ends[19];
          }
          if(ends[20]>=biggest55945){
            biggest55945=ends[20];
          }
          if(ends[21]>=biggest55945){
            biggest55945=ends[21];
          }
          if(ends[22]>=biggest55945){
            biggest55945=ends[22];
          }
          if(ends[23]>=biggest55945){
            biggest55945=ends[23];
          }
          if(ends[24]>=biggest55945){
            biggest55945=ends[24];
          }
          if(ends[25]>=biggest55945){
            biggest55945=ends[25];
          }
          if(biggest55945 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
          //FINXME code
          if(biggest55945 == 0){
            S55881=0;
            active[1]=0;
            ends[1]=0;
            S55881=0;
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
