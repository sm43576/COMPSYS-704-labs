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
  private int S126858 = 1;
  private int S123497 = 1;
  private int S123451 = 1;
  private int S123439 = 1;
  private int S123449 = 1;
  private int S123505 = 1;
  private int S123499 = 1;
  private int S123561 = 1;
  private int S123508 = 1;
  private int S123515 = 1;
  private int S123510 = 1;
  private int S123523 = 1;
  private int S123520 = 1;
  private int S123602 = 1;
  private int S123574 = 1;
  private int S123643 = 1;
  private int S123615 = 1;
  private int S123687 = 1;
  private int S123657 = 1;
  private int S123755 = 1;
  private int S123709 = 1;
  private int S123691 = 1;
  private int S123817 = 1;
  private int S123849 = 1;
  private int S123827 = 1;
  private int S123890 = 1;
  private int S123862 = 1;
  private int S123922 = 1;
  private int S123900 = 1;
  private int S123987 = 1;
  private int S123943 = 1;
  private int S124019 = 1;
  private int S123997 = 1;
  private int S124138 = 1;
  private int S124058 = 1;
  private int S124170 = 1;
  private int S124148 = 1;
  private int S124199 = 1;
  private int S124179 = 1;
  private int S124228 = 1;
  private int S124208 = 1;
  private int S124257 = 1;
  private int S124237 = 1;
  private int S124283 = 1;
  private int S124265 = 1;
  private int S124273 = 1;
  private int S124281 = 1;
  
  private int[] ends = new int[29];
  private int[] tdone = new int[29];
  
  public void thread126926(int [] tdone, int [] ends){
        switch(S124281){
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

  public void thread126925(int [] tdone, int [] ends){
        switch(S124273){
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

  public void thread126924(int [] tdone, int [] ends){
        switch(S124265){
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

  public void thread126923(int [] tdone, int [] ends){
        switch(S124283){
      case 0 : 
        active[25]=0;
        ends[25]=0;
        tdone[25]=1;
        break;
      
      case 1 : 
        thread126924(tdone,ends);
        thread126925(tdone,ends);
        thread126926(tdone,ends);
        int biggest126927 = 0;
        if(ends[26]>=biggest126927){
          biggest126927=ends[26];
        }
        if(ends[27]>=biggest126927){
          biggest126927=ends[27];
        }
        if(ends[28]>=biggest126927){
          biggest126927=ends[28];
        }
        if(biggest126927 == 1){
          active[25]=1;
          ends[25]=1;
          tdone[25]=1;
        }
        //FINXME code
        if(biggest126927 == 0){
          S124283=0;
          active[25]=0;
          ends[25]=0;
          tdone[25]=1;
        }
        break;
      
    }
  }

  public void thread126922(int [] tdone, int [] ends){
        switch(S124257){
      case 0 : 
        active[24]=0;
        ends[24]=0;
        tdone[24]=1;
        break;
      
      case 1 : 
        switch(S124237){
          case 0 : 
            bottleAtPos2.setPresent();//sysj\plant.sysj line: 364, column: 82
            currsigs.addElement(bottleAtPos2);
            active[24]=1;
            ends[24]=1;
            tdone[24]=1;
            break;
          
          case 1 : 
            S124237=1;
            S124237=0;
            if(moveToPos2.getprestatus()){//sysj\plant.sysj line: 364, column: 24
              System.out.println("bottle is now at pos 2");//sysj\plant.sysj line: 364, column: 36
              bottleAtPos2.setPresent();//sysj\plant.sysj line: 364, column: 82
              currsigs.addElement(bottleAtPos2);
              active[24]=1;
              ends[24]=1;
              tdone[24]=1;
            }
            else {
              S124237=1;
              active[24]=1;
              ends[24]=1;
              tdone[24]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread126921(int [] tdone, int [] ends){
        switch(S124228){
      case 0 : 
        active[23]=0;
        ends[23]=0;
        tdone[23]=1;
        break;
      
      case 1 : 
        switch(S124208){
          case 0 : 
            bottleAtPos3.setPresent();//sysj\plant.sysj line: 362, column: 82
            currsigs.addElement(bottleAtPos3);
            active[23]=1;
            ends[23]=1;
            tdone[23]=1;
            break;
          
          case 1 : 
            S124208=1;
            S124208=0;
            if(moveToPos3.getprestatus()){//sysj\plant.sysj line: 362, column: 24
              System.out.println("bottle is now at pos 3");//sysj\plant.sysj line: 362, column: 36
              bottleAtPos3.setPresent();//sysj\plant.sysj line: 362, column: 82
              currsigs.addElement(bottleAtPos3);
              active[23]=1;
              ends[23]=1;
              tdone[23]=1;
            }
            else {
              S124208=1;
              active[23]=1;
              ends[23]=1;
              tdone[23]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread126920(int [] tdone, int [] ends){
        switch(S124199){
      case 0 : 
        active[22]=0;
        ends[22]=0;
        tdone[22]=1;
        break;
      
      case 1 : 
        switch(S124179){
          case 0 : 
            bottleAtPos4.setPresent();//sysj\plant.sysj line: 360, column: 82
            currsigs.addElement(bottleAtPos4);
            active[22]=1;
            ends[22]=1;
            tdone[22]=1;
            break;
          
          case 1 : 
            S124179=1;
            S124179=0;
            if(moveToPos4.getprestatus()){//sysj\plant.sysj line: 360, column: 24
              System.out.println("bottle is now at pos 4");//sysj\plant.sysj line: 360, column: 36
              bottleAtPos4.setPresent();//sysj\plant.sysj line: 360, column: 82
              currsigs.addElement(bottleAtPos4);
              active[22]=1;
              ends[22]=1;
              tdone[22]=1;
            }
            else {
              S124179=1;
              active[22]=1;
              ends[22]=1;
              tdone[22]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread126919(int [] tdone, int [] ends){
        switch(S124170){
      case 0 : 
        active[21]=0;
        ends[21]=0;
        tdone[21]=1;
        break;
      
      case 1 : 
        switch(S124148){
          case 0 : 
            if(bottleLeftPos5.getprestatus()){//sysj\plant.sysj line: 350, column: 10
              S124148=1;
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
            S124148=1;
            S124148=0;
            if(moveToPos5.getprestatus()){//sysj\plant.sysj line: 351, column: 13
              System.out.println("bottle is now at pos 5");//sysj\plant.sysj line: 352, column: 6
              bottleAtPos5.setPresent();//sysj\plant.sysj line: 353, column: 6
              currsigs.addElement(bottleAtPos5);
              active[21]=1;
              ends[21]=1;
              tdone[21]=1;
            }
            else {
              S124148=1;
              active[21]=1;
              ends[21]=1;
              tdone[21]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread126918(int [] tdone, int [] ends){
        switch(S124138){
      case 0 : 
        active[20]=0;
        ends[20]=0;
        tdone[20]=1;
        break;
      
      case 1 : 
        switch(S124058){
          case 0 : 
            S124058=1;
            active[20]=1;
            ends[20]=1;
            tdone[20]=1;
            break;
          
          case 1 : 
            S124058=1;
            S124058=0;
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
              S124058=1;
              active[20]=1;
              ends[20]=1;
              tdone[20]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread126917(int [] tdone, int [] ends){
        switch(S124019){
      case 0 : 
        active[19]=0;
        ends[19]=0;
        tdone[19]=1;
        break;
      
      case 1 : 
        switch(S123997){
          case 0 : 
            if(cylClampBottleExtend.getprestatus()){//sysj\plant.sysj line: 297, column: 11
              S123997=1;
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
              S123997=2;
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
            S123997=2;
            S123997=0;
            active[19]=1;
            ends[19]=1;
            tdone[19]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread126916(int [] tdone, int [] ends){
        switch(S123987){
      case 0 : 
        active[18]=0;
        ends[18]=0;
        tdone[18]=1;
        break;
      
      case 1 : 
        switch(S123943){
          case 0 : 
            if(gripperTurnRetract.getprestatus()){//sysj\plant.sysj line: 281, column: 13
              S123943=1;
              if(gripperTurnRetract.getprestatus() && !gripperTurnExtend.getprestatus()){//sysj\plant.sysj line: 285, column: 13
                gripperTurnHomePos.setPresent();//sysj\plant.sysj line: 287, column: 7
                currsigs.addElement(gripperTurnHomePos);
                active[18]=1;
                ends[18]=1;
                tdone[18]=1;
              }
              else {
                S123943=2;
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
              S123943=2;
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
            S123943=2;
            S123943=0;
            if(gripperTurnExtend.getprestatus() && !gripperTurnRetract.getprestatus()){//sysj\plant.sysj line: 280, column: 13
              gripperTurnFinalPos.setPresent();//sysj\plant.sysj line: 282, column: 7
              currsigs.addElement(gripperTurnFinalPos);
              active[18]=1;
              ends[18]=1;
              tdone[18]=1;
            }
            else {
              S123943=1;
              if(gripperTurnRetract.getprestatus() && !gripperTurnExtend.getprestatus()){//sysj\plant.sysj line: 285, column: 13
                gripperTurnHomePos.setPresent();//sysj\plant.sysj line: 287, column: 7
                currsigs.addElement(gripperTurnHomePos);
                active[18]=1;
                ends[18]=1;
                tdone[18]=1;
              }
              else {
                S123943=2;
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

  public void thread126915(int [] tdone, int [] ends){
        switch(S123922){
      case 0 : 
        active[17]=0;
        ends[17]=0;
        tdone[17]=1;
        break;
      
      case 1 : 
        switch(S123900){
          case 0 : 
            if(capGripperPos5Extend.getprestatus()){//sysj\plant.sysj line: 269, column: 11
              S123900=1;
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
              S123900=2;
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
            S123900=2;
            S123900=0;
            active[17]=1;
            ends[17]=1;
            tdone[17]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread126914(int [] tdone, int [] ends){
        switch(S123890){
      case 0 : 
        active[16]=0;
        ends[16]=0;
        tdone[16]=1;
        break;
      
      case 1 : 
        switch(S123862){
          case 0 : 
            if(cylPos5ZAxisExtend.getprestatus()){//sysj\plant.sysj line: 256, column: 11
              S123862=1;
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
              S123862=2;
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
            S123862=2;
            S123862=0;
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

  public void thread126913(int [] tdone, int [] ends){
        switch(S123849){
      case 0 : 
        active[15]=0;
        ends[15]=0;
        tdone[15]=1;
        break;
      
      case 1 : 
        switch(S123827){
          case 0 : 
            if(moveToPos4.getprestatus()){//sysj\plant.sysj line: 245, column: 11
              S123827=1;
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
              S123827=2;
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
            S123827=2;
            S123827=0;
            active[15]=1;
            ends[15]=1;
            tdone[15]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread126912(int [] tdone, int [] ends){
        switch(S123817){
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

  public void thread126911(int [] tdone, int [] ends){
        switch(S123755){
      case 0 : 
        active[13]=0;
        ends[13]=0;
        tdone[13]=1;
        break;
      
      case 1 : 
        switch(S123709){
          case 0 : 
            if(empty.getprestatus()){//sysj\plant.sysj line: 209, column: 10
              S123709=1;
              active[13]=1;
              ends[13]=1;
              tdone[13]=1;
            }
            else {
              switch(S123691){
                case 0 : 
                  if(pusherRetracted.getprestatus()){//sysj\plant.sysj line: 211, column: 13
                    S123691=1;
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
                    S123691=2;
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
                    S123691=0;
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
              S123709=0;
              S123691=0;
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

  public void thread126910(int [] tdone, int [] ends){
        switch(S123687){
      case 0 : 
        active[12]=0;
        ends[12]=0;
        tdone[12]=1;
        break;
      
      case 1 : 
        switch(S123657){
          case 0 : 
            if(!vacOn.getprestatus()){//sysj\plant.sysj line: 189, column: 12
              if(armAtSource.getprestatus()){//sysj\plant.sysj line: 192, column: 14
                capPos_1.setPresent();//sysj\plant.sysj line: 193, column: 7
                currsigs.addElement(capPos_1);
                capPos_1.setValue(1);//sysj\plant.sysj line: 193, column: 7
                S123657=1;
                active[12]=1;
                ends[12]=1;
                tdone[12]=1;
              }
              else {
                S123657=1;
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
            S123657=1;
            S123657=0;
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
                S123657=1;
                active[12]=1;
                ends[12]=1;
                tdone[12]=1;
              }
            }
            else {
              S123657=1;
              active[12]=1;
              ends[12]=1;
              tdone[12]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread126909(int [] tdone, int [] ends){
        switch(S123643){
      case 0 : 
        active[11]=0;
        ends[11]=0;
        tdone[11]=1;
        break;
      
      case 1 : 
        switch(S123615){
          case 0 : 
            if(pusherExtend.getprestatus()){//sysj\plant.sysj line: 175, column: 10
              S123615=1;
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
              S123615=0;
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

  public void thread126908(int [] tdone, int [] ends){
        switch(S123602){
      case 0 : 
        active[10]=0;
        ends[10]=0;
        tdone[10]=1;
        break;
      
      case 1 : 
        switch(S123574){
          case 0 : 
            if(armSource.getprestatus()){//sysj\plant.sysj line: 164, column: 10
              S123574=1;
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
              S123574=0;
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

  public void thread126906(int [] tdone, int [] ends){
        S123523=1;
    S123520=0;
    dosUnitEvac.setPresent();//sysj\plant.sysj line: 143, column: 7
    currsigs.addElement(dosUnitEvac);
    active[9]=1;
    ends[9]=1;
    tdone[9]=1;
  }

  public void thread126905(int [] tdone, int [] ends){
        S123515=1;
    S123510=0;
    active[8]=1;
    ends[8]=1;
    tdone[8]=1;
  }

  public void thread126904(int [] tdone, int [] ends){
        S123508=1;
    active[7]=1;
    ends[7]=1;
    tdone[7]=1;
  }

  public void thread126902(int [] tdone, int [] ends){
        switch(S123523){
      case 0 : 
        active[9]=0;
        ends[9]=0;
        tdone[9]=1;
        break;
      
      case 1 : 
        switch(S123520){
          case 0 : 
            if(dosUnitValveRetract.getprestatus()){//sysj\plant.sysj line: 142, column: 12
              System.out.println("Canister at top");//sysj\plant.sysj line: 145, column: 6
              S123520=1;
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
              S123520=2;
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
            S123520=2;
            S123523=0;
            active[9]=0;
            ends[9]=0;
            tdone[9]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread126901(int [] tdone, int [] ends){
        switch(S123515){
      case 0 : 
        active[8]=0;
        ends[8]=0;
        tdone[8]=1;
        break;
      
      case 1 : 
        switch(S123510){
          case 0 : 
            if(receivedPercentage.getprestatus()){//sysj\plant.sysj line: 131, column: 11
              System.out.println("filled");//sysj\plant.sysj line: 132, column: 5
              S123510=1;
              if(valveInletOnOff.getprestatus()){//sysj\plant.sysj line: 133, column: 13
                dosUnitFilled.setPresent();//sysj\plant.sysj line: 134, column: 6
                currsigs.addElement(dosUnitFilled);
                dosUnitFilled.setValue(receivedPercentage);//sysj\plant.sysj line: 134, column: 6
                active[8]=1;
                ends[8]=1;
                tdone[8]=1;
              }
              else {
                S123515=0;
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
            S123515=0;
            active[8]=0;
            ends[8]=0;
            tdone[8]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread126900(int [] tdone, int [] ends){
        switch(S123508){
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
          S123508=0;
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

  public void thread126899(int [] tdone, int [] ends){
        switch(S123561){
      case 0 : 
        active[6]=0;
        ends[6]=0;
        tdone[6]=1;
        break;
      
      case 1 : 
        thread126900(tdone,ends);
        thread126901(tdone,ends);
        thread126902(tdone,ends);
        int biggest126903 = 0;
        if(ends[7]>=biggest126903){
          biggest126903=ends[7];
        }
        if(ends[8]>=biggest126903){
          biggest126903=ends[8];
        }
        if(ends[9]>=biggest126903){
          biggest126903=ends[9];
        }
        if(biggest126903 == 1){
          active[6]=1;
          ends[6]=1;
          tdone[6]=1;
        }
        //FINXME code
        if(biggest126903 == 0){
          thread126904(tdone,ends);
          thread126905(tdone,ends);
          thread126906(tdone,ends);
          int biggest126907 = 0;
          if(ends[7]>=biggest126907){
            biggest126907=ends[7];
          }
          if(ends[8]>=biggest126907){
            biggest126907=ends[8];
          }
          if(ends[9]>=biggest126907){
            biggest126907=ends[9];
          }
          if(biggest126907 == 1){
            active[6]=1;
            ends[6]=1;
            tdone[6]=1;
          }
        }
        break;
      
    }
  }

  public void thread126898(int [] tdone, int [] ends){
        switch(S123505){
      case 0 : 
        active[5]=0;
        ends[5]=0;
        tdone[5]=1;
        break;
      
      case 1 : 
        switch(S123499){
          case 0 : 
            S123499=0;
            if(bottleAtPos1.getprestatus()){//sysj\plant.sysj line: 105, column: 12
              RTbottleAtPos1.setPresent();//sysj\plant.sysj line: 107, column: 5
              currsigs.addElement(RTbottleAtPos1);
              S123499=1;
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            else {
              S123499=1;
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            break;
          
          case 1 : 
            S123499=1;
            S123499=0;
            if(bottleAtPos1.getprestatus()){//sysj\plant.sysj line: 105, column: 12
              RTbottleAtPos1.setPresent();//sysj\plant.sysj line: 107, column: 5
              currsigs.addElement(RTbottleAtPos1);
              S123499=1;
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            else {
              S123499=1;
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread126896(int [] tdone, int [] ends){
        S123449=1;
    if(motorPos5On.getprestatus()){//sysj\plant.sysj line: 90, column: 14
      System.out.println("moving bottle to leave 5");//sysj\plant.sysj line: 91, column: 7
      bottleLeftPos5.setPresent();//sysj\plant.sysj line: 92, column: 7
      currsigs.addElement(bottleLeftPos5);
      active[4]=1;
      ends[4]=1;
      tdone[4]=1;
    }
    else {
      S123449=0;
      active[4]=0;
      ends[4]=0;
      tdone[4]=1;
    }
  }

  public void thread126895(int [] tdone, int [] ends){
        S123439=1;
    if(motorPos1On.getprestatus()){//sysj\plant.sysj line: 83, column: 14
      System.out.println("moving bottle to 1");//sysj\plant.sysj line: 84, column: 7
      bottleAtPos1.setPresent();//sysj\plant.sysj line: 85, column: 7
      currsigs.addElement(bottleAtPos1);
      active[3]=1;
      ends[3]=1;
      tdone[3]=1;
    }
    else {
      S123439=0;
      active[3]=0;
      ends[3]=0;
      tdone[3]=1;
    }
  }

  public void thread126893(int [] tdone, int [] ends){
        switch(S123449){
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

  public void thread126892(int [] tdone, int [] ends){
        switch(S123439){
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

  public void thread126891(int [] tdone, int [] ends){
        switch(S123497){
      case 0 : 
        active[2]=0;
        ends[2]=0;
        tdone[2]=1;
        break;
      
      case 1 : 
        switch(S123451){
          case 0 : 
            thread126892(tdone,ends);
            thread126893(tdone,ends);
            int biggest126894 = 0;
            if(ends[3]>=biggest126894){
              biggest126894=ends[3];
            }
            if(ends[4]>=biggest126894){
              biggest126894=ends[4];
            }
            if(biggest126894 == 1){
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            //FINXME code
            if(biggest126894 == 0){
              System.out.println("motor is off");//sysj\plant.sysj line: 96, column: 4
              S123451=1;
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            break;
          
          case 1 : 
            S123451=1;
            S123451=0;
            if(motConveyorOnOff.getprestatus()){//sysj\plant.sysj line: 81, column: 12
              thread126895(tdone,ends);
              thread126896(tdone,ends);
              int biggest126897 = 0;
              if(ends[3]>=biggest126897){
                biggest126897=ends[3];
              }
              if(ends[4]>=biggest126897){
                biggest126897=ends[4];
              }
              if(biggest126897 == 1){
                active[2]=1;
                ends[2]=1;
                tdone[2]=1;
              }
              //FINXME code
              if(biggest126897 == 0){
                System.out.println("motor is off");//sysj\plant.sysj line: 96, column: 4
                S123451=1;
                active[2]=1;
                ends[2]=1;
                tdone[2]=1;
              }
            }
            else {
              System.out.println("motor is off");//sysj\plant.sysj line: 96, column: 4
              S123451=1;
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread126888(int [] tdone, int [] ends){
        S124281=1;
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

  public void thread126887(int [] tdone, int [] ends){
        S124273=1;
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

  public void thread126886(int [] tdone, int [] ends){
        S124265=1;
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

  public void thread126885(int [] tdone, int [] ends){
        S124283=1;
    thread126886(tdone,ends);
    thread126887(tdone,ends);
    thread126888(tdone,ends);
    int biggest126889 = 0;
    if(ends[26]>=biggest126889){
      biggest126889=ends[26];
    }
    if(ends[27]>=biggest126889){
      biggest126889=ends[27];
    }
    if(ends[28]>=biggest126889){
      biggest126889=ends[28];
    }
    if(biggest126889 == 1){
      active[25]=1;
      ends[25]=1;
      tdone[25]=1;
    }
  }

  public void thread126884(int [] tdone, int [] ends){
        S124257=1;
    S124237=0;
    if(moveToPos2.getprestatus()){//sysj\plant.sysj line: 364, column: 24
      System.out.println("bottle is now at pos 2");//sysj\plant.sysj line: 364, column: 36
      bottleAtPos2.setPresent();//sysj\plant.sysj line: 364, column: 82
      currsigs.addElement(bottleAtPos2);
      active[24]=1;
      ends[24]=1;
      tdone[24]=1;
    }
    else {
      S124237=1;
      active[24]=1;
      ends[24]=1;
      tdone[24]=1;
    }
  }

  public void thread126883(int [] tdone, int [] ends){
        S124228=1;
    S124208=0;
    if(moveToPos3.getprestatus()){//sysj\plant.sysj line: 362, column: 24
      System.out.println("bottle is now at pos 3");//sysj\plant.sysj line: 362, column: 36
      bottleAtPos3.setPresent();//sysj\plant.sysj line: 362, column: 82
      currsigs.addElement(bottleAtPos3);
      active[23]=1;
      ends[23]=1;
      tdone[23]=1;
    }
    else {
      S124208=1;
      active[23]=1;
      ends[23]=1;
      tdone[23]=1;
    }
  }

  public void thread126882(int [] tdone, int [] ends){
        S124199=1;
    S124179=0;
    if(moveToPos4.getprestatus()){//sysj\plant.sysj line: 360, column: 24
      System.out.println("bottle is now at pos 4");//sysj\plant.sysj line: 360, column: 36
      bottleAtPos4.setPresent();//sysj\plant.sysj line: 360, column: 82
      currsigs.addElement(bottleAtPos4);
      active[22]=1;
      ends[22]=1;
      tdone[22]=1;
    }
    else {
      S124179=1;
      active[22]=1;
      ends[22]=1;
      tdone[22]=1;
    }
  }

  public void thread126881(int [] tdone, int [] ends){
        S124170=1;
    S124148=0;
    if(moveToPos5.getprestatus()){//sysj\plant.sysj line: 351, column: 13
      System.out.println("bottle is now at pos 5");//sysj\plant.sysj line: 352, column: 6
      bottleAtPos5.setPresent();//sysj\plant.sysj line: 353, column: 6
      currsigs.addElement(bottleAtPos5);
      active[21]=1;
      ends[21]=1;
      tdone[21]=1;
    }
    else {
      S124148=1;
      active[21]=1;
      ends[21]=1;
      tdone[21]=1;
    }
  }

  public void thread126880(int [] tdone, int [] ends){
        S124138=1;
    S124058=0;
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
      S124058=1;
      active[20]=1;
      ends[20]=1;
      tdone[20]=1;
    }
  }

  public void thread126879(int [] tdone, int [] ends){
        S124019=1;
    S123997=0;
    active[19]=1;
    ends[19]=1;
    tdone[19]=1;
  }

  public void thread126878(int [] tdone, int [] ends){
        S123987=1;
    S123943=0;
    if(gripperTurnExtend.getprestatus() && !gripperTurnRetract.getprestatus()){//sysj\plant.sysj line: 280, column: 13
      gripperTurnFinalPos.setPresent();//sysj\plant.sysj line: 282, column: 7
      currsigs.addElement(gripperTurnFinalPos);
      active[18]=1;
      ends[18]=1;
      tdone[18]=1;
    }
    else {
      S123943=1;
      if(gripperTurnRetract.getprestatus() && !gripperTurnExtend.getprestatus()){//sysj\plant.sysj line: 285, column: 13
        gripperTurnHomePos.setPresent();//sysj\plant.sysj line: 287, column: 7
        currsigs.addElement(gripperTurnHomePos);
        active[18]=1;
        ends[18]=1;
        tdone[18]=1;
      }
      else {
        S123943=2;
        active[18]=1;
        ends[18]=1;
        tdone[18]=1;
      }
    }
  }

  public void thread126877(int [] tdone, int [] ends){
        S123922=1;
    S123900=0;
    active[17]=1;
    ends[17]=1;
    tdone[17]=1;
  }

  public void thread126876(int [] tdone, int [] ends){
        S123890=1;
    S123862=0;
    gripperZAxisLifted.setPresent();//sysj\plant.sysj line: 257, column: 6
    currsigs.addElement(gripperZAxisLifted);
    active[16]=1;
    ends[16]=1;
    tdone[16]=1;
  }

  public void thread126875(int [] tdone, int [] ends){
        S123849=1;
    S123827=0;
    active[15]=1;
    ends[15]=1;
    tdone[15]=1;
  }

  public void thread126874(int [] tdone, int [] ends){
        S123817=1;
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

  public void thread126873(int [] tdone, int [] ends){
        S123755=1;
    S123709=0;
    S123691=0;
    active[13]=1;
    ends[13]=1;
    tdone[13]=1;
  }

  public void thread126872(int [] tdone, int [] ends){
        S123687=1;
    S123657=0;
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
        S123657=1;
        active[12]=1;
        ends[12]=1;
        tdone[12]=1;
      }
    }
    else {
      S123657=1;
      active[12]=1;
      ends[12]=1;
      tdone[12]=1;
    }
  }

  public void thread126871(int [] tdone, int [] ends){
        S123643=1;
    S123615=0;
    pusherRetracted.setPresent();//sysj\plant.sysj line: 176, column: 5
    currsigs.addElement(pusherRetracted);
    active[11]=1;
    ends[11]=1;
    tdone[11]=1;
  }

  public void thread126870(int [] tdone, int [] ends){
        S123602=1;
    S123574=0;
    armAtDest.setPresent();//sysj\plant.sysj line: 165, column: 5
    currsigs.addElement(armAtDest);
    active[10]=1;
    ends[10]=1;
    tdone[10]=1;
  }

  public void thread126868(int [] tdone, int [] ends){
        S123523=1;
    S123520=0;
    dosUnitEvac.setPresent();//sysj\plant.sysj line: 143, column: 7
    currsigs.addElement(dosUnitEvac);
    active[9]=1;
    ends[9]=1;
    tdone[9]=1;
  }

  public void thread126867(int [] tdone, int [] ends){
        S123515=1;
    S123510=0;
    active[8]=1;
    ends[8]=1;
    tdone[8]=1;
  }

  public void thread126866(int [] tdone, int [] ends){
        S123508=1;
    active[7]=1;
    ends[7]=1;
    tdone[7]=1;
  }

  public void thread126865(int [] tdone, int [] ends){
        S123561=1;
    thread126866(tdone,ends);
    thread126867(tdone,ends);
    thread126868(tdone,ends);
    int biggest126869 = 0;
    if(ends[7]>=biggest126869){
      biggest126869=ends[7];
    }
    if(ends[8]>=biggest126869){
      biggest126869=ends[8];
    }
    if(ends[9]>=biggest126869){
      biggest126869=ends[9];
    }
    if(biggest126869 == 1){
      active[6]=1;
      ends[6]=1;
      tdone[6]=1;
    }
  }

  public void thread126864(int [] tdone, int [] ends){
        S123505=1;
    S123499=0;
    if(bottleAtPos1.getprestatus()){//sysj\plant.sysj line: 105, column: 12
      RTbottleAtPos1.setPresent();//sysj\plant.sysj line: 107, column: 5
      currsigs.addElement(RTbottleAtPos1);
      S123499=1;
      active[5]=1;
      ends[5]=1;
      tdone[5]=1;
    }
    else {
      S123499=1;
      active[5]=1;
      ends[5]=1;
      tdone[5]=1;
    }
  }

  public void thread126862(int [] tdone, int [] ends){
        S123449=1;
    if(motorPos5On.getprestatus()){//sysj\plant.sysj line: 90, column: 14
      System.out.println("moving bottle to leave 5");//sysj\plant.sysj line: 91, column: 7
      bottleLeftPos5.setPresent();//sysj\plant.sysj line: 92, column: 7
      currsigs.addElement(bottleLeftPos5);
      active[4]=1;
      ends[4]=1;
      tdone[4]=1;
    }
    else {
      S123449=0;
      active[4]=0;
      ends[4]=0;
      tdone[4]=1;
    }
  }

  public void thread126861(int [] tdone, int [] ends){
        S123439=1;
    if(motorPos1On.getprestatus()){//sysj\plant.sysj line: 83, column: 14
      System.out.println("moving bottle to 1");//sysj\plant.sysj line: 84, column: 7
      bottleAtPos1.setPresent();//sysj\plant.sysj line: 85, column: 7
      currsigs.addElement(bottleAtPos1);
      active[3]=1;
      ends[3]=1;
      tdone[3]=1;
    }
    else {
      S123439=0;
      active[3]=0;
      ends[3]=0;
      tdone[3]=1;
    }
  }

  public void thread126860(int [] tdone, int [] ends){
        S123497=1;
    S123451=0;
    if(motConveyorOnOff.getprestatus()){//sysj\plant.sysj line: 81, column: 12
      thread126861(tdone,ends);
      thread126862(tdone,ends);
      int biggest126863 = 0;
      if(ends[3]>=biggest126863){
        biggest126863=ends[3];
      }
      if(ends[4]>=biggest126863){
        biggest126863=ends[4];
      }
      if(biggest126863 == 1){
        active[2]=1;
        ends[2]=1;
        tdone[2]=1;
      }
      //FINXME code
      if(biggest126863 == 0){
        System.out.println("motor is off");//sysj\plant.sysj line: 96, column: 4
        S123451=1;
        active[2]=1;
        ends[2]=1;
        tdone[2]=1;
      }
    }
    else {
      System.out.println("motor is off");//sysj\plant.sysj line: 96, column: 4
      S123451=1;
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
      switch(S126858){
        case 0 : 
          S126858=0;
          break RUN;
        
        case 1 : 
          S126858=2;
          S126858=2;
          new Thread(new GUI()).start();//sysj\plant.sysj line: 70, column: 2
          capDec_1.setClear();//sysj\plant.sysj line: 72, column: 2
          capPos_1.setClear();//sysj\plant.sysj line: 73, column: 2
          capPos_1.setPresent();//sysj\plant.sysj line: 74, column: 2
          currsigs.addElement(capPos_1);
          capPos_1.setValue(0);//sysj\plant.sysj line: 74, column: 2
          disablePos5_1.setClear();//sysj\plant.sysj line: 75, column: 2
          thread126860(tdone,ends);
          thread126864(tdone,ends);
          thread126865(tdone,ends);
          thread126870(tdone,ends);
          thread126871(tdone,ends);
          thread126872(tdone,ends);
          thread126873(tdone,ends);
          thread126874(tdone,ends);
          thread126875(tdone,ends);
          thread126876(tdone,ends);
          thread126877(tdone,ends);
          thread126878(tdone,ends);
          thread126879(tdone,ends);
          thread126880(tdone,ends);
          thread126881(tdone,ends);
          thread126882(tdone,ends);
          thread126883(tdone,ends);
          thread126884(tdone,ends);
          thread126885(tdone,ends);
          int biggest126890 = 0;
          if(ends[2]>=biggest126890){
            biggest126890=ends[2];
          }
          if(ends[5]>=biggest126890){
            biggest126890=ends[5];
          }
          if(ends[6]>=biggest126890){
            biggest126890=ends[6];
          }
          if(ends[10]>=biggest126890){
            biggest126890=ends[10];
          }
          if(ends[11]>=biggest126890){
            biggest126890=ends[11];
          }
          if(ends[12]>=biggest126890){
            biggest126890=ends[12];
          }
          if(ends[13]>=biggest126890){
            biggest126890=ends[13];
          }
          if(ends[14]>=biggest126890){
            biggest126890=ends[14];
          }
          if(ends[15]>=biggest126890){
            biggest126890=ends[15];
          }
          if(ends[16]>=biggest126890){
            biggest126890=ends[16];
          }
          if(ends[17]>=biggest126890){
            biggest126890=ends[17];
          }
          if(ends[18]>=biggest126890){
            biggest126890=ends[18];
          }
          if(ends[19]>=biggest126890){
            biggest126890=ends[19];
          }
          if(ends[20]>=biggest126890){
            biggest126890=ends[20];
          }
          if(ends[21]>=biggest126890){
            biggest126890=ends[21];
          }
          if(ends[22]>=biggest126890){
            biggest126890=ends[22];
          }
          if(ends[23]>=biggest126890){
            biggest126890=ends[23];
          }
          if(ends[24]>=biggest126890){
            biggest126890=ends[24];
          }
          if(ends[25]>=biggest126890){
            biggest126890=ends[25];
          }
          if(biggest126890 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
        
        case 2 : 
          capDec_1.setClear();//sysj\plant.sysj line: 72, column: 2
          capPos_1.setClear();//sysj\plant.sysj line: 73, column: 2
          disablePos5_1.setClear();//sysj\plant.sysj line: 75, column: 2
          thread126891(tdone,ends);
          thread126898(tdone,ends);
          thread126899(tdone,ends);
          thread126908(tdone,ends);
          thread126909(tdone,ends);
          thread126910(tdone,ends);
          thread126911(tdone,ends);
          thread126912(tdone,ends);
          thread126913(tdone,ends);
          thread126914(tdone,ends);
          thread126915(tdone,ends);
          thread126916(tdone,ends);
          thread126917(tdone,ends);
          thread126918(tdone,ends);
          thread126919(tdone,ends);
          thread126920(tdone,ends);
          thread126921(tdone,ends);
          thread126922(tdone,ends);
          thread126923(tdone,ends);
          int biggest126928 = 0;
          if(ends[2]>=biggest126928){
            biggest126928=ends[2];
          }
          if(ends[5]>=biggest126928){
            biggest126928=ends[5];
          }
          if(ends[6]>=biggest126928){
            biggest126928=ends[6];
          }
          if(ends[10]>=biggest126928){
            biggest126928=ends[10];
          }
          if(ends[11]>=biggest126928){
            biggest126928=ends[11];
          }
          if(ends[12]>=biggest126928){
            biggest126928=ends[12];
          }
          if(ends[13]>=biggest126928){
            biggest126928=ends[13];
          }
          if(ends[14]>=biggest126928){
            biggest126928=ends[14];
          }
          if(ends[15]>=biggest126928){
            biggest126928=ends[15];
          }
          if(ends[16]>=biggest126928){
            biggest126928=ends[16];
          }
          if(ends[17]>=biggest126928){
            biggest126928=ends[17];
          }
          if(ends[18]>=biggest126928){
            biggest126928=ends[18];
          }
          if(ends[19]>=biggest126928){
            biggest126928=ends[19];
          }
          if(ends[20]>=biggest126928){
            biggest126928=ends[20];
          }
          if(ends[21]>=biggest126928){
            biggest126928=ends[21];
          }
          if(ends[22]>=biggest126928){
            biggest126928=ends[22];
          }
          if(ends[23]>=biggest126928){
            biggest126928=ends[23];
          }
          if(ends[24]>=biggest126928){
            biggest126928=ends[24];
          }
          if(ends[25]>=biggest126928){
            biggest126928=ends[25];
          }
          if(biggest126928 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
          //FINXME code
          if(biggest126928 == 0){
            S126858=0;
            active[1]=0;
            ends[1]=0;
            S126858=0;
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
