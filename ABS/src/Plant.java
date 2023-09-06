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
  private int capcount_thread_14;//sysj\plant.sysj line: 228, column: 3
  private int canister_thread_7;//sysj\plant.sysj line: 126, column: 5
  private int S124794 = 1;
  private int S121397 = 1;
  private int S121343 = 1;
  private int S121329 = 1;
  private int S121341 = 1;
  private int S121405 = 1;
  private int S121399 = 1;
  private int S121461 = 1;
  private int S121408 = 1;
  private int S121415 = 1;
  private int S121410 = 1;
  private int S121423 = 1;
  private int S121420 = 1;
  private int S121502 = 1;
  private int S121474 = 1;
  private int S121543 = 1;
  private int S121515 = 1;
  private int S121587 = 1;
  private int S121557 = 1;
  private int S121655 = 1;
  private int S121609 = 1;
  private int S121591 = 1;
  private int S121717 = 1;
  private int S121749 = 1;
  private int S121727 = 1;
  private int S121790 = 1;
  private int S121762 = 1;
  private int S121822 = 1;
  private int S121800 = 1;
  private int S121887 = 1;
  private int S121843 = 1;
  private int S121919 = 1;
  private int S121897 = 1;
  private int S122038 = 1;
  private int S121958 = 1;
  private int S122070 = 1;
  private int S122048 = 1;
  private int S122099 = 1;
  private int S122079 = 1;
  private int S122128 = 1;
  private int S122108 = 1;
  private int S122157 = 1;
  private int S122137 = 1;
  private int S122183 = 1;
  private int S122165 = 1;
  private int S122173 = 1;
  private int S122181 = 1;
  
  private int[] ends = new int[29];
  private int[] tdone = new int[29];
  
  public void thread124862(int [] tdone, int [] ends){
        switch(S122181){
      case 0 : 
        active[28]=0;
        ends[28]=0;
        tdone[28]=1;
        break;
      
      case 1 : 
        if(bottleAtPos5.getprestatus()){//sysj\plant.sysj line: 380, column: 25
          bottleAtPos5E.setPresent();//sysj\plant.sysj line: 380, column: 39
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

  public void thread124861(int [] tdone, int [] ends){
        switch(S122173){
      case 0 : 
        active[27]=0;
        ends[27]=0;
        tdone[27]=1;
        break;
      
      case 1 : 
        if(bottleAtPos1.getprestatus()){//sysj\plant.sysj line: 378, column: 24
          bottleAtPos1E.setPresent();//sysj\plant.sysj line: 378, column: 38
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

  public void thread124860(int [] tdone, int [] ends){
        switch(S122165){
      case 0 : 
        active[26]=0;
        ends[26]=0;
        tdone[26]=1;
        break;
      
      case 1 : 
        if(motConveyorOnOff.getprestatus()){//sysj\plant.sysj line: 376, column: 25
          motConveyorOnOffE.setPresent();//sysj\plant.sysj line: 376, column: 43
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

  public void thread124859(int [] tdone, int [] ends){
        switch(S122183){
      case 0 : 
        active[25]=0;
        ends[25]=0;
        tdone[25]=1;
        break;
      
      case 1 : 
        thread124860(tdone,ends);
        thread124861(tdone,ends);
        thread124862(tdone,ends);
        int biggest124863 = 0;
        if(ends[26]>=biggest124863){
          biggest124863=ends[26];
        }
        if(ends[27]>=biggest124863){
          biggest124863=ends[27];
        }
        if(ends[28]>=biggest124863){
          biggest124863=ends[28];
        }
        if(biggest124863 == 1){
          active[25]=1;
          ends[25]=1;
          tdone[25]=1;
        }
        //FINXME code
        if(biggest124863 == 0){
          S122183=0;
          active[25]=0;
          ends[25]=0;
          tdone[25]=1;
        }
        break;
      
    }
  }

  public void thread124858(int [] tdone, int [] ends){
        switch(S122157){
      case 0 : 
        active[24]=0;
        ends[24]=0;
        tdone[24]=1;
        break;
      
      case 1 : 
        switch(S122137){
          case 0 : 
            bottleAtPos2.setPresent();//sysj\plant.sysj line: 368, column: 82
            currsigs.addElement(bottleAtPos2);
            active[24]=1;
            ends[24]=1;
            tdone[24]=1;
            break;
          
          case 1 : 
            S122137=1;
            S122137=0;
            if(moveToPos2.getprestatus()){//sysj\plant.sysj line: 368, column: 24
              System.out.println("bottle is now at pos 2");//sysj\plant.sysj line: 368, column: 36
              bottleAtPos2.setPresent();//sysj\plant.sysj line: 368, column: 82
              currsigs.addElement(bottleAtPos2);
              active[24]=1;
              ends[24]=1;
              tdone[24]=1;
            }
            else {
              S122137=1;
              active[24]=1;
              ends[24]=1;
              tdone[24]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread124857(int [] tdone, int [] ends){
        switch(S122128){
      case 0 : 
        active[23]=0;
        ends[23]=0;
        tdone[23]=1;
        break;
      
      case 1 : 
        switch(S122108){
          case 0 : 
            bottleAtPos3.setPresent();//sysj\plant.sysj line: 366, column: 82
            currsigs.addElement(bottleAtPos3);
            active[23]=1;
            ends[23]=1;
            tdone[23]=1;
            break;
          
          case 1 : 
            S122108=1;
            S122108=0;
            if(moveToPos3.getprestatus()){//sysj\plant.sysj line: 366, column: 24
              System.out.println("bottle is now at pos 3");//sysj\plant.sysj line: 366, column: 36
              bottleAtPos3.setPresent();//sysj\plant.sysj line: 366, column: 82
              currsigs.addElement(bottleAtPos3);
              active[23]=1;
              ends[23]=1;
              tdone[23]=1;
            }
            else {
              S122108=1;
              active[23]=1;
              ends[23]=1;
              tdone[23]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread124856(int [] tdone, int [] ends){
        switch(S122099){
      case 0 : 
        active[22]=0;
        ends[22]=0;
        tdone[22]=1;
        break;
      
      case 1 : 
        switch(S122079){
          case 0 : 
            bottleAtPos4.setPresent();//sysj\plant.sysj line: 364, column: 82
            currsigs.addElement(bottleAtPos4);
            active[22]=1;
            ends[22]=1;
            tdone[22]=1;
            break;
          
          case 1 : 
            S122079=1;
            S122079=0;
            if(moveToPos4.getprestatus()){//sysj\plant.sysj line: 364, column: 24
              System.out.println("bottle is now at pos 4");//sysj\plant.sysj line: 364, column: 36
              bottleAtPos4.setPresent();//sysj\plant.sysj line: 364, column: 82
              currsigs.addElement(bottleAtPos4);
              active[22]=1;
              ends[22]=1;
              tdone[22]=1;
            }
            else {
              S122079=1;
              active[22]=1;
              ends[22]=1;
              tdone[22]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread124855(int [] tdone, int [] ends){
        switch(S122070){
      case 0 : 
        active[21]=0;
        ends[21]=0;
        tdone[21]=1;
        break;
      
      case 1 : 
        switch(S122048){
          case 0 : 
            if(bottleLeftPos5.getprestatus()){//sysj\plant.sysj line: 354, column: 10
              S122048=1;
              active[21]=1;
              ends[21]=1;
              tdone[21]=1;
            }
            else {
              bottleAtPos5.setPresent();//sysj\plant.sysj line: 357, column: 6
              currsigs.addElement(bottleAtPos5);
              active[21]=1;
              ends[21]=1;
              tdone[21]=1;
            }
            break;
          
          case 1 : 
            S122048=1;
            S122048=0;
            if(moveToPos5.getprestatus()){//sysj\plant.sysj line: 355, column: 13
              System.out.println("bottle is now at pos 5");//sysj\plant.sysj line: 356, column: 6
              bottleAtPos5.setPresent();//sysj\plant.sysj line: 357, column: 6
              currsigs.addElement(bottleAtPos5);
              active[21]=1;
              ends[21]=1;
              tdone[21]=1;
            }
            else {
              S122048=1;
              active[21]=1;
              ends[21]=1;
              tdone[21]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread124854(int [] tdone, int [] ends){
        switch(S122038){
      case 0 : 
        active[20]=0;
        ends[20]=0;
        tdone[20]=1;
        break;
      
      case 1 : 
        switch(S121958){
          case 0 : 
            S121958=1;
            active[20]=1;
            ends[20]=1;
            tdone[20]=1;
            break;
          
          case 1 : 
            S121958=1;
            S121958=0;
            if(rotaryTableTrigger.getprestatus()){//sysj\plant.sysj line: 312, column: 12
              if(bottleAtPos4.getprestatus()){//sysj\plant.sysj line: 318, column: 13
                System.out.println("moving bottle at pos 4 to pos 5");//sysj\plant.sysj line: 319, column: 6
                moveToPos5.setPresent();//sysj\plant.sysj line: 320, column: 6
                currsigs.addElement(moveToPos5);
                if(bottleAtPos3.getprestatus()){//sysj\plant.sysj line: 324, column: 13
                  System.out.println("moving bottle at pos 3 to pos 4");//sysj\plant.sysj line: 325, column: 6
                  moveToPos4.setPresent();//sysj\plant.sysj line: 326, column: 6
                  currsigs.addElement(moveToPos4);
                  if(bottleAtPos2.getprestatus()){//sysj\plant.sysj line: 330, column: 13
                    System.out.println("moving bottle at pos 2 to pos 3");//sysj\plant.sysj line: 331, column: 6
                    moveToPos3.setPresent();//sysj\plant.sysj line: 332, column: 6
                    currsigs.addElement(moveToPos3);
                    if(bottleAtPos1.getprestatus()){//sysj\plant.sysj line: 335, column: 13
                      System.out.println("moving bottle at pos 1 to pos 2");//sysj\plant.sysj line: 336, column: 6
                      moveToPos2.setPresent();//sysj\plant.sysj line: 337, column: 6
                      currsigs.addElement(moveToPos2);
                      System.out.println("Table has been aligned");//sysj\plant.sysj line: 341, column: 5
                      tableAlignedWithSensor.setPresent();//sysj\plant.sysj line: 342, column: 5
                      currsigs.addElement(tableAlignedWithSensor);
                      active[20]=1;
                      ends[20]=1;
                      tdone[20]=1;
                    }
                    else {
                      System.out.println("Table has been aligned");//sysj\plant.sysj line: 341, column: 5
                      tableAlignedWithSensor.setPresent();//sysj\plant.sysj line: 342, column: 5
                      currsigs.addElement(tableAlignedWithSensor);
                      active[20]=1;
                      ends[20]=1;
                      tdone[20]=1;
                    }
                  }
                  else {
                    if(bottleAtPos1.getprestatus()){//sysj\plant.sysj line: 335, column: 13
                      System.out.println("moving bottle at pos 1 to pos 2");//sysj\plant.sysj line: 336, column: 6
                      moveToPos2.setPresent();//sysj\plant.sysj line: 337, column: 6
                      currsigs.addElement(moveToPos2);
                      System.out.println("Table has been aligned");//sysj\plant.sysj line: 341, column: 5
                      tableAlignedWithSensor.setPresent();//sysj\plant.sysj line: 342, column: 5
                      currsigs.addElement(tableAlignedWithSensor);
                      active[20]=1;
                      ends[20]=1;
                      tdone[20]=1;
                    }
                    else {
                      System.out.println("Table has been aligned");//sysj\plant.sysj line: 341, column: 5
                      tableAlignedWithSensor.setPresent();//sysj\plant.sysj line: 342, column: 5
                      currsigs.addElement(tableAlignedWithSensor);
                      active[20]=1;
                      ends[20]=1;
                      tdone[20]=1;
                    }
                  }
                }
                else {
                  if(bottleAtPos2.getprestatus()){//sysj\plant.sysj line: 330, column: 13
                    System.out.println("moving bottle at pos 2 to pos 3");//sysj\plant.sysj line: 331, column: 6
                    moveToPos3.setPresent();//sysj\plant.sysj line: 332, column: 6
                    currsigs.addElement(moveToPos3);
                    if(bottleAtPos1.getprestatus()){//sysj\plant.sysj line: 335, column: 13
                      System.out.println("moving bottle at pos 1 to pos 2");//sysj\plant.sysj line: 336, column: 6
                      moveToPos2.setPresent();//sysj\plant.sysj line: 337, column: 6
                      currsigs.addElement(moveToPos2);
                      System.out.println("Table has been aligned");//sysj\plant.sysj line: 341, column: 5
                      tableAlignedWithSensor.setPresent();//sysj\plant.sysj line: 342, column: 5
                      currsigs.addElement(tableAlignedWithSensor);
                      active[20]=1;
                      ends[20]=1;
                      tdone[20]=1;
                    }
                    else {
                      System.out.println("Table has been aligned");//sysj\plant.sysj line: 341, column: 5
                      tableAlignedWithSensor.setPresent();//sysj\plant.sysj line: 342, column: 5
                      currsigs.addElement(tableAlignedWithSensor);
                      active[20]=1;
                      ends[20]=1;
                      tdone[20]=1;
                    }
                  }
                  else {
                    if(bottleAtPos1.getprestatus()){//sysj\plant.sysj line: 335, column: 13
                      System.out.println("moving bottle at pos 1 to pos 2");//sysj\plant.sysj line: 336, column: 6
                      moveToPos2.setPresent();//sysj\plant.sysj line: 337, column: 6
                      currsigs.addElement(moveToPos2);
                      System.out.println("Table has been aligned");//sysj\plant.sysj line: 341, column: 5
                      tableAlignedWithSensor.setPresent();//sysj\plant.sysj line: 342, column: 5
                      currsigs.addElement(tableAlignedWithSensor);
                      active[20]=1;
                      ends[20]=1;
                      tdone[20]=1;
                    }
                    else {
                      System.out.println("Table has been aligned");//sysj\plant.sysj line: 341, column: 5
                      tableAlignedWithSensor.setPresent();//sysj\plant.sysj line: 342, column: 5
                      currsigs.addElement(tableAlignedWithSensor);
                      active[20]=1;
                      ends[20]=1;
                      tdone[20]=1;
                    }
                  }
                }
              }
              else {
                if(bottleAtPos3.getprestatus()){//sysj\plant.sysj line: 324, column: 13
                  System.out.println("moving bottle at pos 3 to pos 4");//sysj\plant.sysj line: 325, column: 6
                  moveToPos4.setPresent();//sysj\plant.sysj line: 326, column: 6
                  currsigs.addElement(moveToPos4);
                  if(bottleAtPos2.getprestatus()){//sysj\plant.sysj line: 330, column: 13
                    System.out.println("moving bottle at pos 2 to pos 3");//sysj\plant.sysj line: 331, column: 6
                    moveToPos3.setPresent();//sysj\plant.sysj line: 332, column: 6
                    currsigs.addElement(moveToPos3);
                    if(bottleAtPos1.getprestatus()){//sysj\plant.sysj line: 335, column: 13
                      System.out.println("moving bottle at pos 1 to pos 2");//sysj\plant.sysj line: 336, column: 6
                      moveToPos2.setPresent();//sysj\plant.sysj line: 337, column: 6
                      currsigs.addElement(moveToPos2);
                      System.out.println("Table has been aligned");//sysj\plant.sysj line: 341, column: 5
                      tableAlignedWithSensor.setPresent();//sysj\plant.sysj line: 342, column: 5
                      currsigs.addElement(tableAlignedWithSensor);
                      active[20]=1;
                      ends[20]=1;
                      tdone[20]=1;
                    }
                    else {
                      System.out.println("Table has been aligned");//sysj\plant.sysj line: 341, column: 5
                      tableAlignedWithSensor.setPresent();//sysj\plant.sysj line: 342, column: 5
                      currsigs.addElement(tableAlignedWithSensor);
                      active[20]=1;
                      ends[20]=1;
                      tdone[20]=1;
                    }
                  }
                  else {
                    if(bottleAtPos1.getprestatus()){//sysj\plant.sysj line: 335, column: 13
                      System.out.println("moving bottle at pos 1 to pos 2");//sysj\plant.sysj line: 336, column: 6
                      moveToPos2.setPresent();//sysj\plant.sysj line: 337, column: 6
                      currsigs.addElement(moveToPos2);
                      System.out.println("Table has been aligned");//sysj\plant.sysj line: 341, column: 5
                      tableAlignedWithSensor.setPresent();//sysj\plant.sysj line: 342, column: 5
                      currsigs.addElement(tableAlignedWithSensor);
                      active[20]=1;
                      ends[20]=1;
                      tdone[20]=1;
                    }
                    else {
                      System.out.println("Table has been aligned");//sysj\plant.sysj line: 341, column: 5
                      tableAlignedWithSensor.setPresent();//sysj\plant.sysj line: 342, column: 5
                      currsigs.addElement(tableAlignedWithSensor);
                      active[20]=1;
                      ends[20]=1;
                      tdone[20]=1;
                    }
                  }
                }
                else {
                  if(bottleAtPos2.getprestatus()){//sysj\plant.sysj line: 330, column: 13
                    System.out.println("moving bottle at pos 2 to pos 3");//sysj\plant.sysj line: 331, column: 6
                    moveToPos3.setPresent();//sysj\plant.sysj line: 332, column: 6
                    currsigs.addElement(moveToPos3);
                    if(bottleAtPos1.getprestatus()){//sysj\plant.sysj line: 335, column: 13
                      System.out.println("moving bottle at pos 1 to pos 2");//sysj\plant.sysj line: 336, column: 6
                      moveToPos2.setPresent();//sysj\plant.sysj line: 337, column: 6
                      currsigs.addElement(moveToPos2);
                      System.out.println("Table has been aligned");//sysj\plant.sysj line: 341, column: 5
                      tableAlignedWithSensor.setPresent();//sysj\plant.sysj line: 342, column: 5
                      currsigs.addElement(tableAlignedWithSensor);
                      active[20]=1;
                      ends[20]=1;
                      tdone[20]=1;
                    }
                    else {
                      System.out.println("Table has been aligned");//sysj\plant.sysj line: 341, column: 5
                      tableAlignedWithSensor.setPresent();//sysj\plant.sysj line: 342, column: 5
                      currsigs.addElement(tableAlignedWithSensor);
                      active[20]=1;
                      ends[20]=1;
                      tdone[20]=1;
                    }
                  }
                  else {
                    if(bottleAtPos1.getprestatus()){//sysj\plant.sysj line: 335, column: 13
                      System.out.println("moving bottle at pos 1 to pos 2");//sysj\plant.sysj line: 336, column: 6
                      moveToPos2.setPresent();//sysj\plant.sysj line: 337, column: 6
                      currsigs.addElement(moveToPos2);
                      System.out.println("Table has been aligned");//sysj\plant.sysj line: 341, column: 5
                      tableAlignedWithSensor.setPresent();//sysj\plant.sysj line: 342, column: 5
                      currsigs.addElement(tableAlignedWithSensor);
                      active[20]=1;
                      ends[20]=1;
                      tdone[20]=1;
                    }
                    else {
                      System.out.println("Table has been aligned");//sysj\plant.sysj line: 341, column: 5
                      tableAlignedWithSensor.setPresent();//sysj\plant.sysj line: 342, column: 5
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
              S121958=1;
              active[20]=1;
              ends[20]=1;
              tdone[20]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread124853(int [] tdone, int [] ends){
        switch(S121919){
      case 0 : 
        active[19]=0;
        ends[19]=0;
        tdone[19]=1;
        break;
      
      case 1 : 
        switch(S121897){
          case 0 : 
            if(cylClampBottleExtend.getprestatus()){//sysj\plant.sysj line: 301, column: 11
              S121897=1;
              cylClampedBottle.setPresent();//sysj\plant.sysj line: 303, column: 6
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
            if(!cylClampBottleExtend.getprestatus()){//sysj\plant.sysj line: 302, column: 12
              S121897=2;
              active[19]=1;
              ends[19]=1;
              tdone[19]=1;
            }
            else {
              cylClampedBottle.setPresent();//sysj\plant.sysj line: 303, column: 6
              currsigs.addElement(cylClampedBottle);
              active[19]=1;
              ends[19]=1;
              tdone[19]=1;
            }
            break;
          
          case 2 : 
            S121897=2;
            S121897=0;
            active[19]=1;
            ends[19]=1;
            tdone[19]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread124852(int [] tdone, int [] ends){
        switch(S121887){
      case 0 : 
        active[18]=0;
        ends[18]=0;
        tdone[18]=1;
        break;
      
      case 1 : 
        switch(S121843){
          case 0 : 
            if(gripperTurnRetract.getprestatus()){//sysj\plant.sysj line: 285, column: 13
              S121843=1;
              if(gripperTurnRetract.getprestatus() && !gripperTurnExtend.getprestatus()){//sysj\plant.sysj line: 289, column: 13
                gripperTurnHomePos.setPresent();//sysj\plant.sysj line: 291, column: 7
                currsigs.addElement(gripperTurnHomePos);
                active[18]=1;
                ends[18]=1;
                tdone[18]=1;
              }
              else {
                S121843=2;
                active[18]=1;
                ends[18]=1;
                tdone[18]=1;
              }
            }
            else {
              gripperTurnFinalPos.setPresent();//sysj\plant.sysj line: 286, column: 7
              currsigs.addElement(gripperTurnFinalPos);
              active[18]=1;
              ends[18]=1;
              tdone[18]=1;
            }
            break;
          
          case 1 : 
            if(gripperTurnExtend.getprestatus()){//sysj\plant.sysj line: 290, column: 13
              S121843=2;
              active[18]=1;
              ends[18]=1;
              tdone[18]=1;
            }
            else {
              gripperTurnHomePos.setPresent();//sysj\plant.sysj line: 291, column: 7
              currsigs.addElement(gripperTurnHomePos);
              active[18]=1;
              ends[18]=1;
              tdone[18]=1;
            }
            break;
          
          case 2 : 
            S121843=2;
            S121843=0;
            if(gripperTurnExtend.getprestatus() && !gripperTurnRetract.getprestatus()){//sysj\plant.sysj line: 284, column: 13
              gripperTurnFinalPos.setPresent();//sysj\plant.sysj line: 286, column: 7
              currsigs.addElement(gripperTurnFinalPos);
              active[18]=1;
              ends[18]=1;
              tdone[18]=1;
            }
            else {
              S121843=1;
              if(gripperTurnRetract.getprestatus() && !gripperTurnExtend.getprestatus()){//sysj\plant.sysj line: 289, column: 13
                gripperTurnHomePos.setPresent();//sysj\plant.sysj line: 291, column: 7
                currsigs.addElement(gripperTurnHomePos);
                active[18]=1;
                ends[18]=1;
                tdone[18]=1;
              }
              else {
                S121843=2;
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

  public void thread124851(int [] tdone, int [] ends){
        switch(S121822){
      case 0 : 
        active[17]=0;
        ends[17]=0;
        tdone[17]=1;
        break;
      
      case 1 : 
        switch(S121800){
          case 0 : 
            if(capGripperPos5Extend.getprestatus()){//sysj\plant.sysj line: 273, column: 11
              S121800=1;
              gripperGrippedCap.setPresent();//sysj\plant.sysj line: 275, column: 6
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
            if(!capGripperPos5Extend.getprestatus()){//sysj\plant.sysj line: 274, column: 12
              S121800=2;
              active[17]=1;
              ends[17]=1;
              tdone[17]=1;
            }
            else {
              gripperGrippedCap.setPresent();//sysj\plant.sysj line: 275, column: 6
              currsigs.addElement(gripperGrippedCap);
              active[17]=1;
              ends[17]=1;
              tdone[17]=1;
            }
            break;
          
          case 2 : 
            S121800=2;
            S121800=0;
            active[17]=1;
            ends[17]=1;
            tdone[17]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread124850(int [] tdone, int [] ends){
        switch(S121790){
      case 0 : 
        active[16]=0;
        ends[16]=0;
        tdone[16]=1;
        break;
      
      case 1 : 
        switch(S121762){
          case 0 : 
            if(cylPos5ZAxisExtend.getprestatus()){//sysj\plant.sysj line: 260, column: 11
              S121762=1;
              gripperZAxisLowered.setPresent();//sysj\plant.sysj line: 264, column: 6
              currsigs.addElement(gripperZAxisLowered);
              active[16]=1;
              ends[16]=1;
              tdone[16]=1;
            }
            else {
              gripperZAxisLifted.setPresent();//sysj\plant.sysj line: 261, column: 6
              currsigs.addElement(gripperZAxisLifted);
              active[16]=1;
              ends[16]=1;
              tdone[16]=1;
            }
            break;
          
          case 1 : 
            if(!cylPos5ZAxisExtend.getprestatus()){//sysj\plant.sysj line: 263, column: 12
              S121762=2;
              active[16]=1;
              ends[16]=1;
              tdone[16]=1;
            }
            else {
              gripperZAxisLowered.setPresent();//sysj\plant.sysj line: 264, column: 6
              currsigs.addElement(gripperZAxisLowered);
              active[16]=1;
              ends[16]=1;
              tdone[16]=1;
            }
            break;
          
          case 2 : 
            S121762=2;
            S121762=0;
            gripperZAxisLifted.setPresent();//sysj\plant.sysj line: 261, column: 6
            currsigs.addElement(gripperZAxisLifted);
            active[16]=1;
            ends[16]=1;
            tdone[16]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread124849(int [] tdone, int [] ends){
        switch(S121749){
      case 0 : 
        active[15]=0;
        ends[15]=0;
        tdone[15]=1;
        break;
      
      case 1 : 
        switch(S121727){
          case 0 : 
            if(moveToPos4.getprestatus()){//sysj\plant.sysj line: 249, column: 11
              S121727=1;
              bottleAtPos4.setPresent();//sysj\plant.sysj line: 251, column: 6
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
            if(moveToPos5.getprestatus()){//sysj\plant.sysj line: 250, column: 12
              S121727=2;
              active[15]=1;
              ends[15]=1;
              tdone[15]=1;
            }
            else {
              bottleAtPos4.setPresent();//sysj\plant.sysj line: 251, column: 6
              currsigs.addElement(bottleAtPos4);
              active[15]=1;
              ends[15]=1;
              tdone[15]=1;
            }
            break;
          
          case 2 : 
            S121727=2;
            S121727=0;
            active[15]=1;
            ends[15]=1;
            tdone[15]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread124848(int [] tdone, int [] ends){
        switch(S121717){
      case 0 : 
        active[14]=0;
        ends[14]=0;
        tdone[14]=1;
        break;
      
      case 1 : 
        if(capDec_1.getprestatus()){//sysj\plant.sysj line: 230, column: 12
          if(capcount_thread_14 > 0) {//sysj\plant.sysj line: 231, column: 5
            capcount_thread_14 = capcount_thread_14 - 1;//sysj\plant.sysj line: 232, column: 6
          }
          if(refill.getprestatus()){//sysj\plant.sysj line: 234, column: 12
            capcount_thread_14 = 5;//sysj\plant.sysj line: 235, column: 5
            if(capcount_thread_14 == 0){//sysj\plant.sysj line: 238, column: 8
              empty.setPresent();//sysj\plant.sysj line: 239, column: 6
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
            if(capcount_thread_14 == 0){//sysj\plant.sysj line: 238, column: 8
              empty.setPresent();//sysj\plant.sysj line: 239, column: 6
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
          if(refill.getprestatus()){//sysj\plant.sysj line: 234, column: 12
            capcount_thread_14 = 5;//sysj\plant.sysj line: 235, column: 5
            if(capcount_thread_14 == 0){//sysj\plant.sysj line: 238, column: 8
              empty.setPresent();//sysj\plant.sysj line: 239, column: 6
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
            if(capcount_thread_14 == 0){//sysj\plant.sysj line: 238, column: 8
              empty.setPresent();//sysj\plant.sysj line: 239, column: 6
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

  public void thread124847(int [] tdone, int [] ends){
        switch(S121655){
      case 0 : 
        active[13]=0;
        ends[13]=0;
        tdone[13]=1;
        break;
      
      case 1 : 
        switch(S121609){
          case 0 : 
            if(empty.getprestatus()){//sysj\plant.sysj line: 213, column: 10
              S121609=1;
              active[13]=1;
              ends[13]=1;
              tdone[13]=1;
            }
            else {
              switch(S121591){
                case 0 : 
                  if(pusherRetracted.getprestatus()){//sysj\plant.sysj line: 215, column: 13
                    S121591=1;
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
                  if(pusherExtended.getprestatus()){//sysj\plant.sysj line: 216, column: 13
                    capPos_1.setPresent();//sysj\plant.sysj line: 218, column: 7
                    currsigs.addElement(capPos_1);
                    capPos_1.setValue(1);//sysj\plant.sysj line: 218, column: 7
                    S121591=2;
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
                  if(pusherRetracted.getprestatus()){//sysj\plant.sysj line: 219, column: 13
                    capDec_1.setPresent();//sysj\plant.sysj line: 220, column: 7
                    currsigs.addElement(capDec_1);
                    S121591=0;
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
            if(refill.getprestatus()){//sysj\plant.sysj line: 223, column: 10
              S121609=0;
              S121591=0;
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

  public void thread124846(int [] tdone, int [] ends){
        switch(S121587){
      case 0 : 
        active[12]=0;
        ends[12]=0;
        tdone[12]=1;
        break;
      
      case 1 : 
        switch(S121557){
          case 0 : 
            if(!vacOn.getprestatus()){//sysj\plant.sysj line: 193, column: 12
              if(armAtSource.getprestatus()){//sysj\plant.sysj line: 196, column: 14
                capPos_1.setPresent();//sysj\plant.sysj line: 197, column: 7
                currsigs.addElement(capPos_1);
                capPos_1.setValue(1);//sysj\plant.sysj line: 197, column: 7
                S121557=1;
                active[12]=1;
                ends[12]=1;
                tdone[12]=1;
              }
              else {
                S121557=1;
                active[12]=1;
                ends[12]=1;
                tdone[12]=1;
              }
            }
            else {
              WPgripped.setPresent();//sysj\plant.sysj line: 194, column: 7
              currsigs.addElement(WPgripped);
              active[12]=1;
              ends[12]=1;
              tdone[12]=1;
            }
            break;
          
          case 1 : 
            S121557=1;
            S121557=0;
            if(vacOn.getprestatus() && armAtSource.getprestatus()){//sysj\plant.sysj line: 190, column: 12
              if((Integer)(capPos_1.getpreval() == null ? 0 : ((Integer)capPos_1.getpreval()).intValue()) == 1){//sysj\plant.sysj line: 191, column: 8
                capPos_1.setPresent();//sysj\plant.sysj line: 192, column: 6
                currsigs.addElement(capPos_1);
                capPos_1.setValue(0);//sysj\plant.sysj line: 192, column: 6
                WPgripped.setPresent();//sysj\plant.sysj line: 194, column: 7
                currsigs.addElement(WPgripped);
                active[12]=1;
                ends[12]=1;
                tdone[12]=1;
              }
              else {
                S121557=1;
                active[12]=1;
                ends[12]=1;
                tdone[12]=1;
              }
            }
            else {
              S121557=1;
              active[12]=1;
              ends[12]=1;
              tdone[12]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread124845(int [] tdone, int [] ends){
        switch(S121543){
      case 0 : 
        active[11]=0;
        ends[11]=0;
        tdone[11]=1;
        break;
      
      case 1 : 
        switch(S121515){
          case 0 : 
            if(pusherExtend.getprestatus()){//sysj\plant.sysj line: 179, column: 10
              S121515=1;
              pusherExtended.setPresent();//sysj\plant.sysj line: 183, column: 5
              currsigs.addElement(pusherExtended);
              active[11]=1;
              ends[11]=1;
              tdone[11]=1;
            }
            else {
              pusherRetracted.setPresent();//sysj\plant.sysj line: 180, column: 5
              currsigs.addElement(pusherRetracted);
              active[11]=1;
              ends[11]=1;
              tdone[11]=1;
            }
            break;
          
          case 1 : 
            if(!pusherExtend.getprestatus()){//sysj\plant.sysj line: 182, column: 10
              S121515=0;
              pusherRetracted.setPresent();//sysj\plant.sysj line: 180, column: 5
              currsigs.addElement(pusherRetracted);
              active[11]=1;
              ends[11]=1;
              tdone[11]=1;
            }
            else {
              pusherExtended.setPresent();//sysj\plant.sysj line: 183, column: 5
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

  public void thread124844(int [] tdone, int [] ends){
        switch(S121502){
      case 0 : 
        active[10]=0;
        ends[10]=0;
        tdone[10]=1;
        break;
      
      case 1 : 
        switch(S121474){
          case 0 : 
            if(armSource.getprestatus()){//sysj\plant.sysj line: 168, column: 10
              S121474=1;
              armAtSource.setPresent();//sysj\plant.sysj line: 172, column: 5
              currsigs.addElement(armAtSource);
              active[10]=1;
              ends[10]=1;
              tdone[10]=1;
            }
            else {
              armAtDest.setPresent();//sysj\plant.sysj line: 169, column: 5
              currsigs.addElement(armAtDest);
              active[10]=1;
              ends[10]=1;
              tdone[10]=1;
            }
            break;
          
          case 1 : 
            if(armDest.getprestatus()){//sysj\plant.sysj line: 171, column: 10
              S121474=0;
              armAtDest.setPresent();//sysj\plant.sysj line: 169, column: 5
              currsigs.addElement(armAtDest);
              active[10]=1;
              ends[10]=1;
              tdone[10]=1;
            }
            else {
              armAtSource.setPresent();//sysj\plant.sysj line: 172, column: 5
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

  public void thread124842(int [] tdone, int [] ends){
        S121423=1;
    S121420=0;
    dosUnitEvac.setPresent();//sysj\plant.sysj line: 147, column: 7
    currsigs.addElement(dosUnitEvac);
    active[9]=1;
    ends[9]=1;
    tdone[9]=1;
  }

  public void thread124841(int [] tdone, int [] ends){
        S121415=1;
    S121410=0;
    active[8]=1;
    ends[8]=1;
    tdone[8]=1;
  }

  public void thread124840(int [] tdone, int [] ends){
        S121408=1;
    active[7]=1;
    ends[7]=1;
    tdone[7]=1;
  }

  public void thread124838(int [] tdone, int [] ends){
        switch(S121423){
      case 0 : 
        active[9]=0;
        ends[9]=0;
        tdone[9]=1;
        break;
      
      case 1 : 
        switch(S121420){
          case 0 : 
            if(dosUnitValveRetract.getprestatus()){//sysj\plant.sysj line: 146, column: 12
              System.out.println("Canister at top");//sysj\plant.sysj line: 149, column: 6
              S121420=1;
              active[9]=1;
              ends[9]=1;
              tdone[9]=1;
            }
            else {
              dosUnitEvac.setPresent();//sysj\plant.sysj line: 147, column: 7
              currsigs.addElement(dosUnitEvac);
              active[9]=1;
              ends[9]=1;
              tdone[9]=1;
            }
            break;
          
          case 1 : 
            if(dosUnitValveExtend.getprestatus()){//sysj\plant.sysj line: 151, column: 12
              System.out.println("Canister at bottom");//sysj\plant.sysj line: 152, column: 6
              S121420=2;
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
            S121420=2;
            S121423=0;
            active[9]=0;
            ends[9]=0;
            tdone[9]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread124837(int [] tdone, int [] ends){
        switch(S121415){
      case 0 : 
        active[8]=0;
        ends[8]=0;
        tdone[8]=1;
        break;
      
      case 1 : 
        switch(S121410){
          case 0 : 
            if(receivedPercentage.getprestatus()){//sysj\plant.sysj line: 135, column: 11
              System.out.println("filled");//sysj\plant.sysj line: 136, column: 5
              S121410=1;
              if(valveInletOnOff.getprestatus()){//sysj\plant.sysj line: 137, column: 13
                dosUnitFilled.setPresent();//sysj\plant.sysj line: 138, column: 6
                currsigs.addElement(dosUnitFilled);
                dosUnitFilled.setValue(receivedPercentage);//sysj\plant.sysj line: 138, column: 6
                active[8]=1;
                ends[8]=1;
                tdone[8]=1;
              }
              else {
                S121415=0;
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
            S121415=0;
            active[8]=0;
            ends[8]=0;
            tdone[8]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread124836(int [] tdone, int [] ends){
        switch(S121408){
      case 0 : 
        active[7]=0;
        ends[7]=0;
        tdone[7]=1;
        break;
      
      case 1 : 
        if(selectCanister.getprestatus()){//sysj\plant.sysj line: 125, column: 11
          canister_thread_7 = (selectCanister.getpreval() == null ? null : ((Integer)selectCanister.getpreval()));//sysj\plant.sysj line: 126, column: 5
          System.out.println("canister number received");//sysj\plant.sysj line: 127, column: 5
          selectedCanister.setPresent();//sysj\plant.sysj line: 128, column: 5
          currsigs.addElement(selectedCanister);
          selectedCanister.setValue(canister_thread_7);//sysj\plant.sysj line: 128, column: 5
          S121408=0;
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

  public void thread124835(int [] tdone, int [] ends){
        switch(S121461){
      case 0 : 
        active[6]=0;
        ends[6]=0;
        tdone[6]=1;
        break;
      
      case 1 : 
        thread124836(tdone,ends);
        thread124837(tdone,ends);
        thread124838(tdone,ends);
        int biggest124839 = 0;
        if(ends[7]>=biggest124839){
          biggest124839=ends[7];
        }
        if(ends[8]>=biggest124839){
          biggest124839=ends[8];
        }
        if(ends[9]>=biggest124839){
          biggest124839=ends[9];
        }
        if(biggest124839 == 1){
          active[6]=1;
          ends[6]=1;
          tdone[6]=1;
        }
        //FINXME code
        if(biggest124839 == 0){
          thread124840(tdone,ends);
          thread124841(tdone,ends);
          thread124842(tdone,ends);
          int biggest124843 = 0;
          if(ends[7]>=biggest124843){
            biggest124843=ends[7];
          }
          if(ends[8]>=biggest124843){
            biggest124843=ends[8];
          }
          if(ends[9]>=biggest124843){
            biggest124843=ends[9];
          }
          if(biggest124843 == 1){
            active[6]=1;
            ends[6]=1;
            tdone[6]=1;
          }
        }
        break;
      
    }
  }

  public void thread124834(int [] tdone, int [] ends){
        switch(S121405){
      case 0 : 
        active[5]=0;
        ends[5]=0;
        tdone[5]=1;
        break;
      
      case 1 : 
        switch(S121399){
          case 0 : 
            S121399=0;
            if(bottleAtPos1.getprestatus()){//sysj\plant.sysj line: 109, column: 12
              RTbottleAtPos1.setPresent();//sysj\plant.sysj line: 111, column: 5
              currsigs.addElement(RTbottleAtPos1);
              S121399=1;
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            else {
              S121399=1;
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            break;
          
          case 1 : 
            S121399=1;
            S121399=0;
            if(bottleAtPos1.getprestatus()){//sysj\plant.sysj line: 109, column: 12
              RTbottleAtPos1.setPresent();//sysj\plant.sysj line: 111, column: 5
              currsigs.addElement(RTbottleAtPos1);
              S121399=1;
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            else {
              S121399=1;
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread124832(int [] tdone, int [] ends){
        S121341=1;
    if(motorPos5On.getprestatus()){//sysj\plant.sysj line: 92, column: 14
      System.out.println("moving bottle to leave 5");//sysj\plant.sysj line: 93, column: 7
      bottleAtPos5.setPresent();//sysj\plant.sysj line: 95, column: 8
      currsigs.addElement(bottleAtPos5);
      active[4]=1;
      ends[4]=1;
      tdone[4]=1;
    }
    else {
      S121341=0;
      active[4]=0;
      ends[4]=0;
      tdone[4]=1;
    }
  }

  public void thread124831(int [] tdone, int [] ends){
        S121329=1;
    if(motorPos1On.getprestatus()){//sysj\plant.sysj line: 83, column: 14
      System.out.println("moving bottle to 1");//sysj\plant.sysj line: 84, column: 7
      bottleAtPos1.setPresent();//sysj\plant.sysj line: 86, column: 8
      currsigs.addElement(bottleAtPos1);
      active[3]=1;
      ends[3]=1;
      tdone[3]=1;
    }
    else {
      S121329=0;
      active[3]=0;
      ends[3]=0;
      tdone[3]=1;
    }
  }

  public void thread124829(int [] tdone, int [] ends){
        switch(S121341){
      case 0 : 
        active[4]=0;
        ends[4]=0;
        tdone[4]=1;
        break;
      
      case 1 : 
        if(!motorPos5On.getprestatus() && !motConveyorOnOff.getprestatus()){//sysj\plant.sysj line: 94, column: 13
          S121341=0;
          active[4]=0;
          ends[4]=0;
          tdone[4]=1;
        }
        else {
          bottleAtPos5.setPresent();//sysj\plant.sysj line: 95, column: 8
          currsigs.addElement(bottleAtPos5);
          active[4]=1;
          ends[4]=1;
          tdone[4]=1;
        }
        break;
      
    }
  }

  public void thread124828(int [] tdone, int [] ends){
        switch(S121329){
      case 0 : 
        active[3]=0;
        ends[3]=0;
        tdone[3]=1;
        break;
      
      case 1 : 
        if(!motorPos1On.getprestatus() && !motConveyorOnOff.getprestatus()){//sysj\plant.sysj line: 85, column: 13
          S121329=0;
          active[3]=0;
          ends[3]=0;
          tdone[3]=1;
        }
        else {
          bottleAtPos1.setPresent();//sysj\plant.sysj line: 86, column: 8
          currsigs.addElement(bottleAtPos1);
          active[3]=1;
          ends[3]=1;
          tdone[3]=1;
        }
        break;
      
    }
  }

  public void thread124827(int [] tdone, int [] ends){
        switch(S121397){
      case 0 : 
        active[2]=0;
        ends[2]=0;
        tdone[2]=1;
        break;
      
      case 1 : 
        switch(S121343){
          case 0 : 
            thread124828(tdone,ends);
            thread124829(tdone,ends);
            int biggest124830 = 0;
            if(ends[3]>=biggest124830){
              biggest124830=ends[3];
            }
            if(ends[4]>=biggest124830){
              biggest124830=ends[4];
            }
            if(biggest124830 == 1){
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            //FINXME code
            if(biggest124830 == 0){
              System.out.println("motor is off");//sysj\plant.sysj line: 100, column: 4
              S121343=1;
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            break;
          
          case 1 : 
            S121343=1;
            S121343=0;
            if(motConveyorOnOff.getprestatus()){//sysj\plant.sysj line: 81, column: 12
              thread124831(tdone,ends);
              thread124832(tdone,ends);
              int biggest124833 = 0;
              if(ends[3]>=biggest124833){
                biggest124833=ends[3];
              }
              if(ends[4]>=biggest124833){
                biggest124833=ends[4];
              }
              if(biggest124833 == 1){
                active[2]=1;
                ends[2]=1;
                tdone[2]=1;
              }
              //FINXME code
              if(biggest124833 == 0){
                System.out.println("motor is off");//sysj\plant.sysj line: 100, column: 4
                S121343=1;
                active[2]=1;
                ends[2]=1;
                tdone[2]=1;
              }
            }
            else {
              System.out.println("motor is off");//sysj\plant.sysj line: 100, column: 4
              S121343=1;
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread124824(int [] tdone, int [] ends){
        S122181=1;
    if(bottleAtPos5.getprestatus()){//sysj\plant.sysj line: 380, column: 25
      bottleAtPos5E.setPresent();//sysj\plant.sysj line: 380, column: 39
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

  public void thread124823(int [] tdone, int [] ends){
        S122173=1;
    if(bottleAtPos1.getprestatus()){//sysj\plant.sysj line: 378, column: 24
      bottleAtPos1E.setPresent();//sysj\plant.sysj line: 378, column: 38
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

  public void thread124822(int [] tdone, int [] ends){
        S122165=1;
    if(motConveyorOnOff.getprestatus()){//sysj\plant.sysj line: 376, column: 25
      motConveyorOnOffE.setPresent();//sysj\plant.sysj line: 376, column: 43
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

  public void thread124821(int [] tdone, int [] ends){
        S122183=1;
    thread124822(tdone,ends);
    thread124823(tdone,ends);
    thread124824(tdone,ends);
    int biggest124825 = 0;
    if(ends[26]>=biggest124825){
      biggest124825=ends[26];
    }
    if(ends[27]>=biggest124825){
      biggest124825=ends[27];
    }
    if(ends[28]>=biggest124825){
      biggest124825=ends[28];
    }
    if(biggest124825 == 1){
      active[25]=1;
      ends[25]=1;
      tdone[25]=1;
    }
  }

  public void thread124820(int [] tdone, int [] ends){
        S122157=1;
    S122137=0;
    if(moveToPos2.getprestatus()){//sysj\plant.sysj line: 368, column: 24
      System.out.println("bottle is now at pos 2");//sysj\plant.sysj line: 368, column: 36
      bottleAtPos2.setPresent();//sysj\plant.sysj line: 368, column: 82
      currsigs.addElement(bottleAtPos2);
      active[24]=1;
      ends[24]=1;
      tdone[24]=1;
    }
    else {
      S122137=1;
      active[24]=1;
      ends[24]=1;
      tdone[24]=1;
    }
  }

  public void thread124819(int [] tdone, int [] ends){
        S122128=1;
    S122108=0;
    if(moveToPos3.getprestatus()){//sysj\plant.sysj line: 366, column: 24
      System.out.println("bottle is now at pos 3");//sysj\plant.sysj line: 366, column: 36
      bottleAtPos3.setPresent();//sysj\plant.sysj line: 366, column: 82
      currsigs.addElement(bottleAtPos3);
      active[23]=1;
      ends[23]=1;
      tdone[23]=1;
    }
    else {
      S122108=1;
      active[23]=1;
      ends[23]=1;
      tdone[23]=1;
    }
  }

  public void thread124818(int [] tdone, int [] ends){
        S122099=1;
    S122079=0;
    if(moveToPos4.getprestatus()){//sysj\plant.sysj line: 364, column: 24
      System.out.println("bottle is now at pos 4");//sysj\plant.sysj line: 364, column: 36
      bottleAtPos4.setPresent();//sysj\plant.sysj line: 364, column: 82
      currsigs.addElement(bottleAtPos4);
      active[22]=1;
      ends[22]=1;
      tdone[22]=1;
    }
    else {
      S122079=1;
      active[22]=1;
      ends[22]=1;
      tdone[22]=1;
    }
  }

  public void thread124817(int [] tdone, int [] ends){
        S122070=1;
    S122048=0;
    if(moveToPos5.getprestatus()){//sysj\plant.sysj line: 355, column: 13
      System.out.println("bottle is now at pos 5");//sysj\plant.sysj line: 356, column: 6
      bottleAtPos5.setPresent();//sysj\plant.sysj line: 357, column: 6
      currsigs.addElement(bottleAtPos5);
      active[21]=1;
      ends[21]=1;
      tdone[21]=1;
    }
    else {
      S122048=1;
      active[21]=1;
      ends[21]=1;
      tdone[21]=1;
    }
  }

  public void thread124816(int [] tdone, int [] ends){
        S122038=1;
    S121958=0;
    if(rotaryTableTrigger.getprestatus()){//sysj\plant.sysj line: 312, column: 12
      if(bottleAtPos4.getprestatus()){//sysj\plant.sysj line: 318, column: 13
        System.out.println("moving bottle at pos 4 to pos 5");//sysj\plant.sysj line: 319, column: 6
        moveToPos5.setPresent();//sysj\plant.sysj line: 320, column: 6
        currsigs.addElement(moveToPos5);
        if(bottleAtPos3.getprestatus()){//sysj\plant.sysj line: 324, column: 13
          System.out.println("moving bottle at pos 3 to pos 4");//sysj\plant.sysj line: 325, column: 6
          moveToPos4.setPresent();//sysj\plant.sysj line: 326, column: 6
          currsigs.addElement(moveToPos4);
          if(bottleAtPos2.getprestatus()){//sysj\plant.sysj line: 330, column: 13
            System.out.println("moving bottle at pos 2 to pos 3");//sysj\plant.sysj line: 331, column: 6
            moveToPos3.setPresent();//sysj\plant.sysj line: 332, column: 6
            currsigs.addElement(moveToPos3);
            if(bottleAtPos1.getprestatus()){//sysj\plant.sysj line: 335, column: 13
              System.out.println("moving bottle at pos 1 to pos 2");//sysj\plant.sysj line: 336, column: 6
              moveToPos2.setPresent();//sysj\plant.sysj line: 337, column: 6
              currsigs.addElement(moveToPos2);
              System.out.println("Table has been aligned");//sysj\plant.sysj line: 341, column: 5
              tableAlignedWithSensor.setPresent();//sysj\plant.sysj line: 342, column: 5
              currsigs.addElement(tableAlignedWithSensor);
              active[20]=1;
              ends[20]=1;
              tdone[20]=1;
            }
            else {
              System.out.println("Table has been aligned");//sysj\plant.sysj line: 341, column: 5
              tableAlignedWithSensor.setPresent();//sysj\plant.sysj line: 342, column: 5
              currsigs.addElement(tableAlignedWithSensor);
              active[20]=1;
              ends[20]=1;
              tdone[20]=1;
            }
          }
          else {
            if(bottleAtPos1.getprestatus()){//sysj\plant.sysj line: 335, column: 13
              System.out.println("moving bottle at pos 1 to pos 2");//sysj\plant.sysj line: 336, column: 6
              moveToPos2.setPresent();//sysj\plant.sysj line: 337, column: 6
              currsigs.addElement(moveToPos2);
              System.out.println("Table has been aligned");//sysj\plant.sysj line: 341, column: 5
              tableAlignedWithSensor.setPresent();//sysj\plant.sysj line: 342, column: 5
              currsigs.addElement(tableAlignedWithSensor);
              active[20]=1;
              ends[20]=1;
              tdone[20]=1;
            }
            else {
              System.out.println("Table has been aligned");//sysj\plant.sysj line: 341, column: 5
              tableAlignedWithSensor.setPresent();//sysj\plant.sysj line: 342, column: 5
              currsigs.addElement(tableAlignedWithSensor);
              active[20]=1;
              ends[20]=1;
              tdone[20]=1;
            }
          }
        }
        else {
          if(bottleAtPos2.getprestatus()){//sysj\plant.sysj line: 330, column: 13
            System.out.println("moving bottle at pos 2 to pos 3");//sysj\plant.sysj line: 331, column: 6
            moveToPos3.setPresent();//sysj\plant.sysj line: 332, column: 6
            currsigs.addElement(moveToPos3);
            if(bottleAtPos1.getprestatus()){//sysj\plant.sysj line: 335, column: 13
              System.out.println("moving bottle at pos 1 to pos 2");//sysj\plant.sysj line: 336, column: 6
              moveToPos2.setPresent();//sysj\plant.sysj line: 337, column: 6
              currsigs.addElement(moveToPos2);
              System.out.println("Table has been aligned");//sysj\plant.sysj line: 341, column: 5
              tableAlignedWithSensor.setPresent();//sysj\plant.sysj line: 342, column: 5
              currsigs.addElement(tableAlignedWithSensor);
              active[20]=1;
              ends[20]=1;
              tdone[20]=1;
            }
            else {
              System.out.println("Table has been aligned");//sysj\plant.sysj line: 341, column: 5
              tableAlignedWithSensor.setPresent();//sysj\plant.sysj line: 342, column: 5
              currsigs.addElement(tableAlignedWithSensor);
              active[20]=1;
              ends[20]=1;
              tdone[20]=1;
            }
          }
          else {
            if(bottleAtPos1.getprestatus()){//sysj\plant.sysj line: 335, column: 13
              System.out.println("moving bottle at pos 1 to pos 2");//sysj\plant.sysj line: 336, column: 6
              moveToPos2.setPresent();//sysj\plant.sysj line: 337, column: 6
              currsigs.addElement(moveToPos2);
              System.out.println("Table has been aligned");//sysj\plant.sysj line: 341, column: 5
              tableAlignedWithSensor.setPresent();//sysj\plant.sysj line: 342, column: 5
              currsigs.addElement(tableAlignedWithSensor);
              active[20]=1;
              ends[20]=1;
              tdone[20]=1;
            }
            else {
              System.out.println("Table has been aligned");//sysj\plant.sysj line: 341, column: 5
              tableAlignedWithSensor.setPresent();//sysj\plant.sysj line: 342, column: 5
              currsigs.addElement(tableAlignedWithSensor);
              active[20]=1;
              ends[20]=1;
              tdone[20]=1;
            }
          }
        }
      }
      else {
        if(bottleAtPos3.getprestatus()){//sysj\plant.sysj line: 324, column: 13
          System.out.println("moving bottle at pos 3 to pos 4");//sysj\plant.sysj line: 325, column: 6
          moveToPos4.setPresent();//sysj\plant.sysj line: 326, column: 6
          currsigs.addElement(moveToPos4);
          if(bottleAtPos2.getprestatus()){//sysj\plant.sysj line: 330, column: 13
            System.out.println("moving bottle at pos 2 to pos 3");//sysj\plant.sysj line: 331, column: 6
            moveToPos3.setPresent();//sysj\plant.sysj line: 332, column: 6
            currsigs.addElement(moveToPos3);
            if(bottleAtPos1.getprestatus()){//sysj\plant.sysj line: 335, column: 13
              System.out.println("moving bottle at pos 1 to pos 2");//sysj\plant.sysj line: 336, column: 6
              moveToPos2.setPresent();//sysj\plant.sysj line: 337, column: 6
              currsigs.addElement(moveToPos2);
              System.out.println("Table has been aligned");//sysj\plant.sysj line: 341, column: 5
              tableAlignedWithSensor.setPresent();//sysj\plant.sysj line: 342, column: 5
              currsigs.addElement(tableAlignedWithSensor);
              active[20]=1;
              ends[20]=1;
              tdone[20]=1;
            }
            else {
              System.out.println("Table has been aligned");//sysj\plant.sysj line: 341, column: 5
              tableAlignedWithSensor.setPresent();//sysj\plant.sysj line: 342, column: 5
              currsigs.addElement(tableAlignedWithSensor);
              active[20]=1;
              ends[20]=1;
              tdone[20]=1;
            }
          }
          else {
            if(bottleAtPos1.getprestatus()){//sysj\plant.sysj line: 335, column: 13
              System.out.println("moving bottle at pos 1 to pos 2");//sysj\plant.sysj line: 336, column: 6
              moveToPos2.setPresent();//sysj\plant.sysj line: 337, column: 6
              currsigs.addElement(moveToPos2);
              System.out.println("Table has been aligned");//sysj\plant.sysj line: 341, column: 5
              tableAlignedWithSensor.setPresent();//sysj\plant.sysj line: 342, column: 5
              currsigs.addElement(tableAlignedWithSensor);
              active[20]=1;
              ends[20]=1;
              tdone[20]=1;
            }
            else {
              System.out.println("Table has been aligned");//sysj\plant.sysj line: 341, column: 5
              tableAlignedWithSensor.setPresent();//sysj\plant.sysj line: 342, column: 5
              currsigs.addElement(tableAlignedWithSensor);
              active[20]=1;
              ends[20]=1;
              tdone[20]=1;
            }
          }
        }
        else {
          if(bottleAtPos2.getprestatus()){//sysj\plant.sysj line: 330, column: 13
            System.out.println("moving bottle at pos 2 to pos 3");//sysj\plant.sysj line: 331, column: 6
            moveToPos3.setPresent();//sysj\plant.sysj line: 332, column: 6
            currsigs.addElement(moveToPos3);
            if(bottleAtPos1.getprestatus()){//sysj\plant.sysj line: 335, column: 13
              System.out.println("moving bottle at pos 1 to pos 2");//sysj\plant.sysj line: 336, column: 6
              moveToPos2.setPresent();//sysj\plant.sysj line: 337, column: 6
              currsigs.addElement(moveToPos2);
              System.out.println("Table has been aligned");//sysj\plant.sysj line: 341, column: 5
              tableAlignedWithSensor.setPresent();//sysj\plant.sysj line: 342, column: 5
              currsigs.addElement(tableAlignedWithSensor);
              active[20]=1;
              ends[20]=1;
              tdone[20]=1;
            }
            else {
              System.out.println("Table has been aligned");//sysj\plant.sysj line: 341, column: 5
              tableAlignedWithSensor.setPresent();//sysj\plant.sysj line: 342, column: 5
              currsigs.addElement(tableAlignedWithSensor);
              active[20]=1;
              ends[20]=1;
              tdone[20]=1;
            }
          }
          else {
            if(bottleAtPos1.getprestatus()){//sysj\plant.sysj line: 335, column: 13
              System.out.println("moving bottle at pos 1 to pos 2");//sysj\plant.sysj line: 336, column: 6
              moveToPos2.setPresent();//sysj\plant.sysj line: 337, column: 6
              currsigs.addElement(moveToPos2);
              System.out.println("Table has been aligned");//sysj\plant.sysj line: 341, column: 5
              tableAlignedWithSensor.setPresent();//sysj\plant.sysj line: 342, column: 5
              currsigs.addElement(tableAlignedWithSensor);
              active[20]=1;
              ends[20]=1;
              tdone[20]=1;
            }
            else {
              System.out.println("Table has been aligned");//sysj\plant.sysj line: 341, column: 5
              tableAlignedWithSensor.setPresent();//sysj\plant.sysj line: 342, column: 5
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
      S121958=1;
      active[20]=1;
      ends[20]=1;
      tdone[20]=1;
    }
  }

  public void thread124815(int [] tdone, int [] ends){
        S121919=1;
    S121897=0;
    active[19]=1;
    ends[19]=1;
    tdone[19]=1;
  }

  public void thread124814(int [] tdone, int [] ends){
        S121887=1;
    S121843=0;
    if(gripperTurnExtend.getprestatus() && !gripperTurnRetract.getprestatus()){//sysj\plant.sysj line: 284, column: 13
      gripperTurnFinalPos.setPresent();//sysj\plant.sysj line: 286, column: 7
      currsigs.addElement(gripperTurnFinalPos);
      active[18]=1;
      ends[18]=1;
      tdone[18]=1;
    }
    else {
      S121843=1;
      if(gripperTurnRetract.getprestatus() && !gripperTurnExtend.getprestatus()){//sysj\plant.sysj line: 289, column: 13
        gripperTurnHomePos.setPresent();//sysj\plant.sysj line: 291, column: 7
        currsigs.addElement(gripperTurnHomePos);
        active[18]=1;
        ends[18]=1;
        tdone[18]=1;
      }
      else {
        S121843=2;
        active[18]=1;
        ends[18]=1;
        tdone[18]=1;
      }
    }
  }

  public void thread124813(int [] tdone, int [] ends){
        S121822=1;
    S121800=0;
    active[17]=1;
    ends[17]=1;
    tdone[17]=1;
  }

  public void thread124812(int [] tdone, int [] ends){
        S121790=1;
    S121762=0;
    gripperZAxisLifted.setPresent();//sysj\plant.sysj line: 261, column: 6
    currsigs.addElement(gripperZAxisLifted);
    active[16]=1;
    ends[16]=1;
    tdone[16]=1;
  }

  public void thread124811(int [] tdone, int [] ends){
        S121749=1;
    S121727=0;
    active[15]=1;
    ends[15]=1;
    tdone[15]=1;
  }

  public void thread124810(int [] tdone, int [] ends){
        S121717=1;
    capcount_thread_14 = 5;//sysj\plant.sysj line: 228, column: 3
    if(capDec_1.getprestatus()){//sysj\plant.sysj line: 230, column: 12
      if(capcount_thread_14 > 0) {//sysj\plant.sysj line: 231, column: 5
        capcount_thread_14 = capcount_thread_14 - 1;//sysj\plant.sysj line: 232, column: 6
      }
      if(refill.getprestatus()){//sysj\plant.sysj line: 234, column: 12
        capcount_thread_14 = 5;//sysj\plant.sysj line: 235, column: 5
        if(capcount_thread_14 == 0){//sysj\plant.sysj line: 238, column: 8
          empty.setPresent();//sysj\plant.sysj line: 239, column: 6
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
        if(capcount_thread_14 == 0){//sysj\plant.sysj line: 238, column: 8
          empty.setPresent();//sysj\plant.sysj line: 239, column: 6
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
      if(refill.getprestatus()){//sysj\plant.sysj line: 234, column: 12
        capcount_thread_14 = 5;//sysj\plant.sysj line: 235, column: 5
        if(capcount_thread_14 == 0){//sysj\plant.sysj line: 238, column: 8
          empty.setPresent();//sysj\plant.sysj line: 239, column: 6
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
        if(capcount_thread_14 == 0){//sysj\plant.sysj line: 238, column: 8
          empty.setPresent();//sysj\plant.sysj line: 239, column: 6
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

  public void thread124809(int [] tdone, int [] ends){
        S121655=1;
    S121609=0;
    S121591=0;
    active[13]=1;
    ends[13]=1;
    tdone[13]=1;
  }

  public void thread124808(int [] tdone, int [] ends){
        S121587=1;
    S121557=0;
    if(vacOn.getprestatus() && armAtSource.getprestatus()){//sysj\plant.sysj line: 190, column: 12
      if((Integer)(capPos_1.getpreval() == null ? 0 : ((Integer)capPos_1.getpreval()).intValue()) == 1){//sysj\plant.sysj line: 191, column: 8
        capPos_1.setPresent();//sysj\plant.sysj line: 192, column: 6
        currsigs.addElement(capPos_1);
        capPos_1.setValue(0);//sysj\plant.sysj line: 192, column: 6
        WPgripped.setPresent();//sysj\plant.sysj line: 194, column: 7
        currsigs.addElement(WPgripped);
        active[12]=1;
        ends[12]=1;
        tdone[12]=1;
      }
      else {
        S121557=1;
        active[12]=1;
        ends[12]=1;
        tdone[12]=1;
      }
    }
    else {
      S121557=1;
      active[12]=1;
      ends[12]=1;
      tdone[12]=1;
    }
  }

  public void thread124807(int [] tdone, int [] ends){
        S121543=1;
    S121515=0;
    pusherRetracted.setPresent();//sysj\plant.sysj line: 180, column: 5
    currsigs.addElement(pusherRetracted);
    active[11]=1;
    ends[11]=1;
    tdone[11]=1;
  }

  public void thread124806(int [] tdone, int [] ends){
        S121502=1;
    S121474=0;
    armAtDest.setPresent();//sysj\plant.sysj line: 169, column: 5
    currsigs.addElement(armAtDest);
    active[10]=1;
    ends[10]=1;
    tdone[10]=1;
  }

  public void thread124804(int [] tdone, int [] ends){
        S121423=1;
    S121420=0;
    dosUnitEvac.setPresent();//sysj\plant.sysj line: 147, column: 7
    currsigs.addElement(dosUnitEvac);
    active[9]=1;
    ends[9]=1;
    tdone[9]=1;
  }

  public void thread124803(int [] tdone, int [] ends){
        S121415=1;
    S121410=0;
    active[8]=1;
    ends[8]=1;
    tdone[8]=1;
  }

  public void thread124802(int [] tdone, int [] ends){
        S121408=1;
    active[7]=1;
    ends[7]=1;
    tdone[7]=1;
  }

  public void thread124801(int [] tdone, int [] ends){
        S121461=1;
    thread124802(tdone,ends);
    thread124803(tdone,ends);
    thread124804(tdone,ends);
    int biggest124805 = 0;
    if(ends[7]>=biggest124805){
      biggest124805=ends[7];
    }
    if(ends[8]>=biggest124805){
      biggest124805=ends[8];
    }
    if(ends[9]>=biggest124805){
      biggest124805=ends[9];
    }
    if(biggest124805 == 1){
      active[6]=1;
      ends[6]=1;
      tdone[6]=1;
    }
  }

  public void thread124800(int [] tdone, int [] ends){
        S121405=1;
    S121399=0;
    if(bottleAtPos1.getprestatus()){//sysj\plant.sysj line: 109, column: 12
      RTbottleAtPos1.setPresent();//sysj\plant.sysj line: 111, column: 5
      currsigs.addElement(RTbottleAtPos1);
      S121399=1;
      active[5]=1;
      ends[5]=1;
      tdone[5]=1;
    }
    else {
      S121399=1;
      active[5]=1;
      ends[5]=1;
      tdone[5]=1;
    }
  }

  public void thread124798(int [] tdone, int [] ends){
        S121341=1;
    if(motorPos5On.getprestatus()){//sysj\plant.sysj line: 92, column: 14
      System.out.println("moving bottle to leave 5");//sysj\plant.sysj line: 93, column: 7
      bottleAtPos5.setPresent();//sysj\plant.sysj line: 95, column: 8
      currsigs.addElement(bottleAtPos5);
      active[4]=1;
      ends[4]=1;
      tdone[4]=1;
    }
    else {
      S121341=0;
      active[4]=0;
      ends[4]=0;
      tdone[4]=1;
    }
  }

  public void thread124797(int [] tdone, int [] ends){
        S121329=1;
    if(motorPos1On.getprestatus()){//sysj\plant.sysj line: 83, column: 14
      System.out.println("moving bottle to 1");//sysj\plant.sysj line: 84, column: 7
      bottleAtPos1.setPresent();//sysj\plant.sysj line: 86, column: 8
      currsigs.addElement(bottleAtPos1);
      active[3]=1;
      ends[3]=1;
      tdone[3]=1;
    }
    else {
      S121329=0;
      active[3]=0;
      ends[3]=0;
      tdone[3]=1;
    }
  }

  public void thread124796(int [] tdone, int [] ends){
        S121397=1;
    S121343=0;
    if(motConveyorOnOff.getprestatus()){//sysj\plant.sysj line: 81, column: 12
      thread124797(tdone,ends);
      thread124798(tdone,ends);
      int biggest124799 = 0;
      if(ends[3]>=biggest124799){
        biggest124799=ends[3];
      }
      if(ends[4]>=biggest124799){
        biggest124799=ends[4];
      }
      if(biggest124799 == 1){
        active[2]=1;
        ends[2]=1;
        tdone[2]=1;
      }
      //FINXME code
      if(biggest124799 == 0){
        System.out.println("motor is off");//sysj\plant.sysj line: 100, column: 4
        S121343=1;
        active[2]=1;
        ends[2]=1;
        tdone[2]=1;
      }
    }
    else {
      System.out.println("motor is off");//sysj\plant.sysj line: 100, column: 4
      S121343=1;
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
      switch(S124794){
        case 0 : 
          S124794=0;
          break RUN;
        
        case 1 : 
          S124794=2;
          S124794=2;
          new Thread(new GUI()).start();//sysj\plant.sysj line: 70, column: 2
          capDec_1.setClear();//sysj\plant.sysj line: 72, column: 2
          capPos_1.setClear();//sysj\plant.sysj line: 73, column: 2
          capPos_1.setPresent();//sysj\plant.sysj line: 74, column: 2
          currsigs.addElement(capPos_1);
          capPos_1.setValue(0);//sysj\plant.sysj line: 74, column: 2
          disablePos5_1.setClear();//sysj\plant.sysj line: 75, column: 2
          thread124796(tdone,ends);
          thread124800(tdone,ends);
          thread124801(tdone,ends);
          thread124806(tdone,ends);
          thread124807(tdone,ends);
          thread124808(tdone,ends);
          thread124809(tdone,ends);
          thread124810(tdone,ends);
          thread124811(tdone,ends);
          thread124812(tdone,ends);
          thread124813(tdone,ends);
          thread124814(tdone,ends);
          thread124815(tdone,ends);
          thread124816(tdone,ends);
          thread124817(tdone,ends);
          thread124818(tdone,ends);
          thread124819(tdone,ends);
          thread124820(tdone,ends);
          thread124821(tdone,ends);
          int biggest124826 = 0;
          if(ends[2]>=biggest124826){
            biggest124826=ends[2];
          }
          if(ends[5]>=biggest124826){
            biggest124826=ends[5];
          }
          if(ends[6]>=biggest124826){
            biggest124826=ends[6];
          }
          if(ends[10]>=biggest124826){
            biggest124826=ends[10];
          }
          if(ends[11]>=biggest124826){
            biggest124826=ends[11];
          }
          if(ends[12]>=biggest124826){
            biggest124826=ends[12];
          }
          if(ends[13]>=biggest124826){
            biggest124826=ends[13];
          }
          if(ends[14]>=biggest124826){
            biggest124826=ends[14];
          }
          if(ends[15]>=biggest124826){
            biggest124826=ends[15];
          }
          if(ends[16]>=biggest124826){
            biggest124826=ends[16];
          }
          if(ends[17]>=biggest124826){
            biggest124826=ends[17];
          }
          if(ends[18]>=biggest124826){
            biggest124826=ends[18];
          }
          if(ends[19]>=biggest124826){
            biggest124826=ends[19];
          }
          if(ends[20]>=biggest124826){
            biggest124826=ends[20];
          }
          if(ends[21]>=biggest124826){
            biggest124826=ends[21];
          }
          if(ends[22]>=biggest124826){
            biggest124826=ends[22];
          }
          if(ends[23]>=biggest124826){
            biggest124826=ends[23];
          }
          if(ends[24]>=biggest124826){
            biggest124826=ends[24];
          }
          if(ends[25]>=biggest124826){
            biggest124826=ends[25];
          }
          if(biggest124826 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
        
        case 2 : 
          capDec_1.setClear();//sysj\plant.sysj line: 72, column: 2
          capPos_1.setClear();//sysj\plant.sysj line: 73, column: 2
          disablePos5_1.setClear();//sysj\plant.sysj line: 75, column: 2
          thread124827(tdone,ends);
          thread124834(tdone,ends);
          thread124835(tdone,ends);
          thread124844(tdone,ends);
          thread124845(tdone,ends);
          thread124846(tdone,ends);
          thread124847(tdone,ends);
          thread124848(tdone,ends);
          thread124849(tdone,ends);
          thread124850(tdone,ends);
          thread124851(tdone,ends);
          thread124852(tdone,ends);
          thread124853(tdone,ends);
          thread124854(tdone,ends);
          thread124855(tdone,ends);
          thread124856(tdone,ends);
          thread124857(tdone,ends);
          thread124858(tdone,ends);
          thread124859(tdone,ends);
          int biggest124864 = 0;
          if(ends[2]>=biggest124864){
            biggest124864=ends[2];
          }
          if(ends[5]>=biggest124864){
            biggest124864=ends[5];
          }
          if(ends[6]>=biggest124864){
            biggest124864=ends[6];
          }
          if(ends[10]>=biggest124864){
            biggest124864=ends[10];
          }
          if(ends[11]>=biggest124864){
            biggest124864=ends[11];
          }
          if(ends[12]>=biggest124864){
            biggest124864=ends[12];
          }
          if(ends[13]>=biggest124864){
            biggest124864=ends[13];
          }
          if(ends[14]>=biggest124864){
            biggest124864=ends[14];
          }
          if(ends[15]>=biggest124864){
            biggest124864=ends[15];
          }
          if(ends[16]>=biggest124864){
            biggest124864=ends[16];
          }
          if(ends[17]>=biggest124864){
            biggest124864=ends[17];
          }
          if(ends[18]>=biggest124864){
            biggest124864=ends[18];
          }
          if(ends[19]>=biggest124864){
            biggest124864=ends[19];
          }
          if(ends[20]>=biggest124864){
            biggest124864=ends[20];
          }
          if(ends[21]>=biggest124864){
            biggest124864=ends[21];
          }
          if(ends[22]>=biggest124864){
            biggest124864=ends[22];
          }
          if(ends[23]>=biggest124864){
            biggest124864=ends[23];
          }
          if(ends[24]>=biggest124864){
            biggest124864=ends[24];
          }
          if(ends[25]>=biggest124864){
            biggest124864=ends[25];
          }
          if(biggest124864 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
          //FINXME code
          if(biggest124864 == 0){
            S124794=0;
            active[1]=0;
            ends[1]=0;
            S124794=0;
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
