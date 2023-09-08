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
  private int S84965 = 1;
  private int S83480 = 1;
  private int S83426 = 1;
  private int S83412 = 1;
  private int S83424 = 1;
  private int S83488 = 1;
  private int S83482 = 1;
  private int S83544 = 1;
  private int S83491 = 1;
  private int S83498 = 1;
  private int S83493 = 1;
  private int S83506 = 1;
  private int S83503 = 1;
  private int S83585 = 1;
  private int S83557 = 1;
  private int S83626 = 1;
  private int S83598 = 1;
  private int S83670 = 1;
  private int S83640 = 1;
  private int S83738 = 1;
  private int S83692 = 1;
  private int S83674 = 1;
  private int S83800 = 1;
  private int S83832 = 1;
  private int S83810 = 1;
  private int S83873 = 1;
  private int S83845 = 1;
  private int S83905 = 1;
  private int S83883 = 1;
  private int S83970 = 1;
  private int S83926 = 1;
  private int S84002 = 1;
  private int S83980 = 1;
  private int S84061 = 1;
  private int S84021 = 1;
  private int S84007 = 1;
  private int S84093 = 1;
  private int S84071 = 1;
  private int S84122 = 1;
  private int S84102 = 1;
  private int S84151 = 1;
  private int S84131 = 1;
  private int S84180 = 1;
  private int S84160 = 1;
  
  private int[] ends = new int[25];
  private int[] tdone = new int[25];
  
  public void thread85024(int [] tdone, int [] ends){
        switch(S84180){
      case 0 : 
        active[24]=0;
        ends[24]=0;
        tdone[24]=1;
        break;
      
      case 1 : 
        switch(S84160){
          case 0 : 
            bottleAtPos2.setPresent();//sysj\plant.sysj line: 371, column: 82
            currsigs.addElement(bottleAtPos2);
            active[24]=1;
            ends[24]=1;
            tdone[24]=1;
            break;
          
          case 1 : 
            S84160=1;
            S84160=0;
            if(moveToPos2.getprestatus()){//sysj\plant.sysj line: 371, column: 24
              System.out.println("bottle is now at pos 2");//sysj\plant.sysj line: 371, column: 36
              bottleAtPos2.setPresent();//sysj\plant.sysj line: 371, column: 82
              currsigs.addElement(bottleAtPos2);
              active[24]=1;
              ends[24]=1;
              tdone[24]=1;
            }
            else {
              S84160=1;
              active[24]=1;
              ends[24]=1;
              tdone[24]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread85023(int [] tdone, int [] ends){
        switch(S84151){
      case 0 : 
        active[23]=0;
        ends[23]=0;
        tdone[23]=1;
        break;
      
      case 1 : 
        switch(S84131){
          case 0 : 
            bottleAtPos3.setPresent();//sysj\plant.sysj line: 369, column: 82
            currsigs.addElement(bottleAtPos3);
            active[23]=1;
            ends[23]=1;
            tdone[23]=1;
            break;
          
          case 1 : 
            S84131=1;
            S84131=0;
            if(moveToPos3.getprestatus()){//sysj\plant.sysj line: 369, column: 24
              System.out.println("bottle is now at pos 3");//sysj\plant.sysj line: 369, column: 36
              bottleAtPos3.setPresent();//sysj\plant.sysj line: 369, column: 82
              currsigs.addElement(bottleAtPos3);
              active[23]=1;
              ends[23]=1;
              tdone[23]=1;
            }
            else {
              S84131=1;
              active[23]=1;
              ends[23]=1;
              tdone[23]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread85022(int [] tdone, int [] ends){
        switch(S84122){
      case 0 : 
        active[22]=0;
        ends[22]=0;
        tdone[22]=1;
        break;
      
      case 1 : 
        switch(S84102){
          case 0 : 
            bottleAtPos4.setPresent();//sysj\plant.sysj line: 367, column: 82
            currsigs.addElement(bottleAtPos4);
            active[22]=1;
            ends[22]=1;
            tdone[22]=1;
            break;
          
          case 1 : 
            S84102=1;
            S84102=0;
            if(moveToPos4.getprestatus()){//sysj\plant.sysj line: 367, column: 24
              System.out.println("bottle is now at pos 4");//sysj\plant.sysj line: 367, column: 36
              bottleAtPos4.setPresent();//sysj\plant.sysj line: 367, column: 82
              currsigs.addElement(bottleAtPos4);
              active[22]=1;
              ends[22]=1;
              tdone[22]=1;
            }
            else {
              S84102=1;
              active[22]=1;
              ends[22]=1;
              tdone[22]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread85021(int [] tdone, int [] ends){
        switch(S84093){
      case 0 : 
        active[21]=0;
        ends[21]=0;
        tdone[21]=1;
        break;
      
      case 1 : 
        switch(S84071){
          case 0 : 
            if(bottleLeftPos5.getprestatus()){//sysj\plant.sysj line: 357, column: 10
              S84071=1;
              active[21]=1;
              ends[21]=1;
              tdone[21]=1;
            }
            else {
              bottleAtPos5.setPresent();//sysj\plant.sysj line: 360, column: 6
              currsigs.addElement(bottleAtPos5);
              active[21]=1;
              ends[21]=1;
              tdone[21]=1;
            }
            break;
          
          case 1 : 
            S84071=1;
            S84071=0;
            if(moveToPos5.getprestatus()){//sysj\plant.sysj line: 358, column: 13
              System.out.println("bottle is now at pos 5");//sysj\plant.sysj line: 359, column: 6
              bottleAtPos5.setPresent();//sysj\plant.sysj line: 360, column: 6
              currsigs.addElement(bottleAtPos5);
              active[21]=1;
              ends[21]=1;
              tdone[21]=1;
            }
            else {
              S84071=1;
              active[21]=1;
              ends[21]=1;
              tdone[21]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread85020(int [] tdone, int [] ends){
        switch(S84061){
      case 0 : 
        active[20]=0;
        ends[20]=0;
        tdone[20]=1;
        break;
      
      case 1 : 
        switch(S84021){
          case 0 : 
            switch(S84007){
              case 0 : 
                S84007=0;
                if(bottleAtPos3.getprestatus()){//sysj\plant.sysj line: 325, column: 13
                  System.out.println("moving bottle at pos 3 to pos 4");//sysj\plant.sysj line: 326, column: 6
                  moveToPos4.setPresent();//sysj\plant.sysj line: 327, column: 6
                  currsigs.addElement(moveToPos4);
                  S84007=1;
                  active[20]=1;
                  ends[20]=1;
                  tdone[20]=1;
                }
                else {
                  S84007=1;
                  active[20]=1;
                  ends[20]=1;
                  tdone[20]=1;
                }
                break;
              
              case 1 : 
                S84007=1;
                if(bottleAtPos2.getprestatus()){//sysj\plant.sysj line: 332, column: 13
                  System.out.println("moving bottle at pos 2 to pos 3");//sysj\plant.sysj line: 333, column: 6
                  moveToPos3.setPresent();//sysj\plant.sysj line: 334, column: 6
                  currsigs.addElement(moveToPos3);
                  S84007=2;
                  active[20]=1;
                  ends[20]=1;
                  tdone[20]=1;
                }
                else {
                  S84007=2;
                  active[20]=1;
                  ends[20]=1;
                  tdone[20]=1;
                }
                break;
              
              case 2 : 
                S84007=2;
                if(bottleAtPos1.getprestatus()){//sysj\plant.sysj line: 338, column: 13
                  System.out.println("moving bottle at pos 1 to pos 2");//sysj\plant.sysj line: 339, column: 6
                  moveToPos2.setPresent();//sysj\plant.sysj line: 340, column: 6
                  currsigs.addElement(moveToPos2);
                  S84007=3;
                  active[20]=1;
                  ends[20]=1;
                  tdone[20]=1;
                }
                else {
                  S84007=3;
                  active[20]=1;
                  ends[20]=1;
                  tdone[20]=1;
                }
                break;
              
              case 3 : 
                S84007=3;
                System.out.println("Table has been aligned");//sysj\plant.sysj line: 344, column: 5
                tableAlignedWithSensor.setPresent();//sysj\plant.sysj line: 345, column: 5
                currsigs.addElement(tableAlignedWithSensor);
                S84007=4;
                active[20]=1;
                ends[20]=1;
                tdone[20]=1;
                break;
              
              case 4 : 
                S84007=4;
                S84021=1;
                active[20]=1;
                ends[20]=1;
                tdone[20]=1;
                break;
              
            }
            break;
          
          case 1 : 
            S84021=1;
            S84021=0;
            if(rotaryTableTrigger.getprestatus()){//sysj\plant.sysj line: 312, column: 12
              System.out.println("table triggered now moving");//sysj\plant.sysj line: 315, column: 5
              if(bottleAtPos4.getprestatus()){//sysj\plant.sysj line: 318, column: 13
                System.out.println("moving bottle at pos 4 to pos 5");//sysj\plant.sysj line: 319, column: 6
                moveToPos5.setPresent();//sysj\plant.sysj line: 320, column: 6
                currsigs.addElement(moveToPos5);
                S84007=0;
                active[20]=1;
                ends[20]=1;
                tdone[20]=1;
              }
              else {
                S84007=0;
                active[20]=1;
                ends[20]=1;
                tdone[20]=1;
              }
            }
            else {
              S84021=1;
              active[20]=1;
              ends[20]=1;
              tdone[20]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread85019(int [] tdone, int [] ends){
        switch(S84002){
      case 0 : 
        active[19]=0;
        ends[19]=0;
        tdone[19]=1;
        break;
      
      case 1 : 
        switch(S83980){
          case 0 : 
            if(cylClampBottleExtend.getprestatus()){//sysj\plant.sysj line: 301, column: 11
              S83980=1;
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
              S83980=2;
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
            S83980=2;
            S83980=0;
            active[19]=1;
            ends[19]=1;
            tdone[19]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread85018(int [] tdone, int [] ends){
        switch(S83970){
      case 0 : 
        active[18]=0;
        ends[18]=0;
        tdone[18]=1;
        break;
      
      case 1 : 
        switch(S83926){
          case 0 : 
            if(gripperTurnRetract.getprestatus()){//sysj\plant.sysj line: 285, column: 13
              S83926=1;
              if(gripperTurnRetract.getprestatus() && !gripperTurnExtend.getprestatus()){//sysj\plant.sysj line: 289, column: 13
                gripperTurnHomePos.setPresent();//sysj\plant.sysj line: 291, column: 7
                currsigs.addElement(gripperTurnHomePos);
                active[18]=1;
                ends[18]=1;
                tdone[18]=1;
              }
              else {
                S83926=2;
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
              S83926=2;
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
            S83926=2;
            S83926=0;
            if(gripperTurnExtend.getprestatus() && !gripperTurnRetract.getprestatus()){//sysj\plant.sysj line: 284, column: 13
              gripperTurnFinalPos.setPresent();//sysj\plant.sysj line: 286, column: 7
              currsigs.addElement(gripperTurnFinalPos);
              active[18]=1;
              ends[18]=1;
              tdone[18]=1;
            }
            else {
              S83926=1;
              if(gripperTurnRetract.getprestatus() && !gripperTurnExtend.getprestatus()){//sysj\plant.sysj line: 289, column: 13
                gripperTurnHomePos.setPresent();//sysj\plant.sysj line: 291, column: 7
                currsigs.addElement(gripperTurnHomePos);
                active[18]=1;
                ends[18]=1;
                tdone[18]=1;
              }
              else {
                S83926=2;
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

  public void thread85017(int [] tdone, int [] ends){
        switch(S83905){
      case 0 : 
        active[17]=0;
        ends[17]=0;
        tdone[17]=1;
        break;
      
      case 1 : 
        switch(S83883){
          case 0 : 
            if(capGripperPos5Extend.getprestatus()){//sysj\plant.sysj line: 273, column: 11
              S83883=1;
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
              S83883=2;
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
            S83883=2;
            S83883=0;
            active[17]=1;
            ends[17]=1;
            tdone[17]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread85016(int [] tdone, int [] ends){
        switch(S83873){
      case 0 : 
        active[16]=0;
        ends[16]=0;
        tdone[16]=1;
        break;
      
      case 1 : 
        switch(S83845){
          case 0 : 
            if(cylPos5ZAxisExtend.getprestatus()){//sysj\plant.sysj line: 260, column: 11
              S83845=1;
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
              S83845=2;
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
            S83845=2;
            S83845=0;
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

  public void thread85015(int [] tdone, int [] ends){
        switch(S83832){
      case 0 : 
        active[15]=0;
        ends[15]=0;
        tdone[15]=1;
        break;
      
      case 1 : 
        switch(S83810){
          case 0 : 
            if(moveToPos4.getprestatus()){//sysj\plant.sysj line: 249, column: 11
              S83810=1;
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
              S83810=2;
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
            S83810=2;
            S83810=0;
            active[15]=1;
            ends[15]=1;
            tdone[15]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread85014(int [] tdone, int [] ends){
        switch(S83800){
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

  public void thread85013(int [] tdone, int [] ends){
        switch(S83738){
      case 0 : 
        active[13]=0;
        ends[13]=0;
        tdone[13]=1;
        break;
      
      case 1 : 
        switch(S83692){
          case 0 : 
            if(empty.getprestatus()){//sysj\plant.sysj line: 213, column: 10
              S83692=1;
              active[13]=1;
              ends[13]=1;
              tdone[13]=1;
            }
            else {
              switch(S83674){
                case 0 : 
                  if(pusherRetracted.getprestatus()){//sysj\plant.sysj line: 215, column: 13
                    S83674=1;
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
                    S83674=2;
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
                    S83674=0;
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
              S83692=0;
              S83674=0;
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

  public void thread85012(int [] tdone, int [] ends){
        switch(S83670){
      case 0 : 
        active[12]=0;
        ends[12]=0;
        tdone[12]=1;
        break;
      
      case 1 : 
        switch(S83640){
          case 0 : 
            if(!vacOn.getprestatus()){//sysj\plant.sysj line: 193, column: 12
              if(armAtSource.getprestatus()){//sysj\plant.sysj line: 196, column: 14
                capPos_1.setPresent();//sysj\plant.sysj line: 197, column: 7
                currsigs.addElement(capPos_1);
                capPos_1.setValue(1);//sysj\plant.sysj line: 197, column: 7
                S83640=1;
                active[12]=1;
                ends[12]=1;
                tdone[12]=1;
              }
              else {
                S83640=1;
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
            S83640=1;
            S83640=0;
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
                S83640=1;
                active[12]=1;
                ends[12]=1;
                tdone[12]=1;
              }
            }
            else {
              S83640=1;
              active[12]=1;
              ends[12]=1;
              tdone[12]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread85011(int [] tdone, int [] ends){
        switch(S83626){
      case 0 : 
        active[11]=0;
        ends[11]=0;
        tdone[11]=1;
        break;
      
      case 1 : 
        switch(S83598){
          case 0 : 
            if(pusherExtend.getprestatus()){//sysj\plant.sysj line: 179, column: 10
              S83598=1;
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
              S83598=0;
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

  public void thread85010(int [] tdone, int [] ends){
        switch(S83585){
      case 0 : 
        active[10]=0;
        ends[10]=0;
        tdone[10]=1;
        break;
      
      case 1 : 
        switch(S83557){
          case 0 : 
            if(armSource.getprestatus()){//sysj\plant.sysj line: 168, column: 10
              S83557=1;
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
              S83557=0;
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

  public void thread85008(int [] tdone, int [] ends){
        S83506=1;
    S83503=0;
    dosUnitEvac.setPresent();//sysj\plant.sysj line: 147, column: 7
    currsigs.addElement(dosUnitEvac);
    active[9]=1;
    ends[9]=1;
    tdone[9]=1;
  }

  public void thread85007(int [] tdone, int [] ends){
        S83498=1;
    S83493=0;
    active[8]=1;
    ends[8]=1;
    tdone[8]=1;
  }

  public void thread85006(int [] tdone, int [] ends){
        S83491=1;
    active[7]=1;
    ends[7]=1;
    tdone[7]=1;
  }

  public void thread85004(int [] tdone, int [] ends){
        switch(S83506){
      case 0 : 
        active[9]=0;
        ends[9]=0;
        tdone[9]=1;
        break;
      
      case 1 : 
        switch(S83503){
          case 0 : 
            if(dosUnitValveRetract.getprestatus()){//sysj\plant.sysj line: 146, column: 12
              System.out.println("Canister at top");//sysj\plant.sysj line: 149, column: 6
              S83503=1;
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
              S83503=2;
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
            S83503=2;
            S83506=0;
            active[9]=0;
            ends[9]=0;
            tdone[9]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread85003(int [] tdone, int [] ends){
        switch(S83498){
      case 0 : 
        active[8]=0;
        ends[8]=0;
        tdone[8]=1;
        break;
      
      case 1 : 
        switch(S83493){
          case 0 : 
            if(receivedPercentage.getprestatus()){//sysj\plant.sysj line: 135, column: 11
              System.out.println("filled");//sysj\plant.sysj line: 136, column: 5
              S83493=1;
              if(valveInletOnOff.getprestatus()){//sysj\plant.sysj line: 137, column: 13
                dosUnitFilled.setPresent();//sysj\plant.sysj line: 138, column: 6
                currsigs.addElement(dosUnitFilled);
                dosUnitFilled.setValue(receivedPercentage);//sysj\plant.sysj line: 138, column: 6
                active[8]=1;
                ends[8]=1;
                tdone[8]=1;
              }
              else {
                S83498=0;
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
            S83498=0;
            active[8]=0;
            ends[8]=0;
            tdone[8]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread85002(int [] tdone, int [] ends){
        switch(S83491){
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
          S83491=0;
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

  public void thread85001(int [] tdone, int [] ends){
        switch(S83544){
      case 0 : 
        active[6]=0;
        ends[6]=0;
        tdone[6]=1;
        break;
      
      case 1 : 
        thread85002(tdone,ends);
        thread85003(tdone,ends);
        thread85004(tdone,ends);
        int biggest85005 = 0;
        if(ends[7]>=biggest85005){
          biggest85005=ends[7];
        }
        if(ends[8]>=biggest85005){
          biggest85005=ends[8];
        }
        if(ends[9]>=biggest85005){
          biggest85005=ends[9];
        }
        if(biggest85005 == 1){
          active[6]=1;
          ends[6]=1;
          tdone[6]=1;
        }
        //FINXME code
        if(biggest85005 == 0){
          thread85006(tdone,ends);
          thread85007(tdone,ends);
          thread85008(tdone,ends);
          int biggest85009 = 0;
          if(ends[7]>=biggest85009){
            biggest85009=ends[7];
          }
          if(ends[8]>=biggest85009){
            biggest85009=ends[8];
          }
          if(ends[9]>=biggest85009){
            biggest85009=ends[9];
          }
          if(biggest85009 == 1){
            active[6]=1;
            ends[6]=1;
            tdone[6]=1;
          }
        }
        break;
      
    }
  }

  public void thread85000(int [] tdone, int [] ends){
        switch(S83488){
      case 0 : 
        active[5]=0;
        ends[5]=0;
        tdone[5]=1;
        break;
      
      case 1 : 
        switch(S83482){
          case 0 : 
            S83482=0;
            if(bottleAtPos1.getprestatus()){//sysj\plant.sysj line: 109, column: 12
              RTbottleAtPos1.setPresent();//sysj\plant.sysj line: 111, column: 5
              currsigs.addElement(RTbottleAtPos1);
              S83482=1;
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            else {
              S83482=1;
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            break;
          
          case 1 : 
            S83482=1;
            S83482=0;
            if(bottleAtPos1.getprestatus()){//sysj\plant.sysj line: 109, column: 12
              RTbottleAtPos1.setPresent();//sysj\plant.sysj line: 111, column: 5
              currsigs.addElement(RTbottleAtPos1);
              S83482=1;
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            else {
              S83482=1;
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread84998(int [] tdone, int [] ends){
        S83424=1;
    if(motorPos5On.getprestatus()){//sysj\plant.sysj line: 92, column: 14
      System.out.println("Conveyor Plant - moving bottle to leave 5");//sysj\plant.sysj line: 93, column: 7
      bottleLeftPos5.setPresent();//sysj\plant.sysj line: 95, column: 8
      currsigs.addElement(bottleLeftPos5);
      active[4]=1;
      ends[4]=1;
      tdone[4]=1;
    }
    else {
      S83424=0;
      active[4]=0;
      ends[4]=0;
      tdone[4]=1;
    }
  }

  public void thread84997(int [] tdone, int [] ends){
        S83412=1;
    if(motorPos1On.getprestatus()){//sysj\plant.sysj line: 83, column: 14
      System.out.println("Conveyor plant - moving bottle to 1");//sysj\plant.sysj line: 84, column: 7
      bottleAtPos1.setPresent();//sysj\plant.sysj line: 86, column: 8
      currsigs.addElement(bottleAtPos1);
      active[3]=1;
      ends[3]=1;
      tdone[3]=1;
    }
    else {
      S83412=0;
      active[3]=0;
      ends[3]=0;
      tdone[3]=1;
    }
  }

  public void thread84995(int [] tdone, int [] ends){
        switch(S83424){
      case 0 : 
        active[4]=0;
        ends[4]=0;
        tdone[4]=1;
        break;
      
      case 1 : 
        if(!motorPos5On.getprestatus() && !motConveyorOnOff.getprestatus()){//sysj\plant.sysj line: 94, column: 13
          S83424=0;
          active[4]=0;
          ends[4]=0;
          tdone[4]=1;
        }
        else {
          bottleLeftPos5.setPresent();//sysj\plant.sysj line: 95, column: 8
          currsigs.addElement(bottleLeftPos5);
          active[4]=1;
          ends[4]=1;
          tdone[4]=1;
        }
        break;
      
    }
  }

  public void thread84994(int [] tdone, int [] ends){
        switch(S83412){
      case 0 : 
        active[3]=0;
        ends[3]=0;
        tdone[3]=1;
        break;
      
      case 1 : 
        if(moveToPos2.getprestatus()){//sysj\plant.sysj line: 85, column: 13
          S83412=0;
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

  public void thread84993(int [] tdone, int [] ends){
        switch(S83480){
      case 0 : 
        active[2]=0;
        ends[2]=0;
        tdone[2]=1;
        break;
      
      case 1 : 
        switch(S83426){
          case 0 : 
            thread84994(tdone,ends);
            thread84995(tdone,ends);
            int biggest84996 = 0;
            if(ends[3]>=biggest84996){
              biggest84996=ends[3];
            }
            if(ends[4]>=biggest84996){
              biggest84996=ends[4];
            }
            if(biggest84996 == 1){
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            //FINXME code
            if(biggest84996 == 0){
              S83426=1;
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            break;
          
          case 1 : 
            S83426=1;
            S83426=0;
            if(motConveyorOnOff.getprestatus()){//sysj\plant.sysj line: 81, column: 12
              thread84997(tdone,ends);
              thread84998(tdone,ends);
              int biggest84999 = 0;
              if(ends[3]>=biggest84999){
                biggest84999=ends[3];
              }
              if(ends[4]>=biggest84999){
                biggest84999=ends[4];
              }
              if(biggest84999 == 1){
                active[2]=1;
                ends[2]=1;
                tdone[2]=1;
              }
              //FINXME code
              if(biggest84999 == 0){
                S83426=1;
                active[2]=1;
                ends[2]=1;
                tdone[2]=1;
              }
            }
            else {
              S83426=1;
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread84991(int [] tdone, int [] ends){
        S84180=1;
    S84160=0;
    if(moveToPos2.getprestatus()){//sysj\plant.sysj line: 371, column: 24
      System.out.println("bottle is now at pos 2");//sysj\plant.sysj line: 371, column: 36
      bottleAtPos2.setPresent();//sysj\plant.sysj line: 371, column: 82
      currsigs.addElement(bottleAtPos2);
      active[24]=1;
      ends[24]=1;
      tdone[24]=1;
    }
    else {
      S84160=1;
      active[24]=1;
      ends[24]=1;
      tdone[24]=1;
    }
  }

  public void thread84990(int [] tdone, int [] ends){
        S84151=1;
    S84131=0;
    if(moveToPos3.getprestatus()){//sysj\plant.sysj line: 369, column: 24
      System.out.println("bottle is now at pos 3");//sysj\plant.sysj line: 369, column: 36
      bottleAtPos3.setPresent();//sysj\plant.sysj line: 369, column: 82
      currsigs.addElement(bottleAtPos3);
      active[23]=1;
      ends[23]=1;
      tdone[23]=1;
    }
    else {
      S84131=1;
      active[23]=1;
      ends[23]=1;
      tdone[23]=1;
    }
  }

  public void thread84989(int [] tdone, int [] ends){
        S84122=1;
    S84102=0;
    if(moveToPos4.getprestatus()){//sysj\plant.sysj line: 367, column: 24
      System.out.println("bottle is now at pos 4");//sysj\plant.sysj line: 367, column: 36
      bottleAtPos4.setPresent();//sysj\plant.sysj line: 367, column: 82
      currsigs.addElement(bottleAtPos4);
      active[22]=1;
      ends[22]=1;
      tdone[22]=1;
    }
    else {
      S84102=1;
      active[22]=1;
      ends[22]=1;
      tdone[22]=1;
    }
  }

  public void thread84988(int [] tdone, int [] ends){
        S84093=1;
    S84071=0;
    if(moveToPos5.getprestatus()){//sysj\plant.sysj line: 358, column: 13
      System.out.println("bottle is now at pos 5");//sysj\plant.sysj line: 359, column: 6
      bottleAtPos5.setPresent();//sysj\plant.sysj line: 360, column: 6
      currsigs.addElement(bottleAtPos5);
      active[21]=1;
      ends[21]=1;
      tdone[21]=1;
    }
    else {
      S84071=1;
      active[21]=1;
      ends[21]=1;
      tdone[21]=1;
    }
  }

  public void thread84987(int [] tdone, int [] ends){
        S84061=1;
    S84021=0;
    if(rotaryTableTrigger.getprestatus()){//sysj\plant.sysj line: 312, column: 12
      System.out.println("table triggered now moving");//sysj\plant.sysj line: 315, column: 5
      if(bottleAtPos4.getprestatus()){//sysj\plant.sysj line: 318, column: 13
        System.out.println("moving bottle at pos 4 to pos 5");//sysj\plant.sysj line: 319, column: 6
        moveToPos5.setPresent();//sysj\plant.sysj line: 320, column: 6
        currsigs.addElement(moveToPos5);
        S84007=0;
        active[20]=1;
        ends[20]=1;
        tdone[20]=1;
      }
      else {
        S84007=0;
        active[20]=1;
        ends[20]=1;
        tdone[20]=1;
      }
    }
    else {
      S84021=1;
      active[20]=1;
      ends[20]=1;
      tdone[20]=1;
    }
  }

  public void thread84986(int [] tdone, int [] ends){
        S84002=1;
    S83980=0;
    active[19]=1;
    ends[19]=1;
    tdone[19]=1;
  }

  public void thread84985(int [] tdone, int [] ends){
        S83970=1;
    S83926=0;
    if(gripperTurnExtend.getprestatus() && !gripperTurnRetract.getprestatus()){//sysj\plant.sysj line: 284, column: 13
      gripperTurnFinalPos.setPresent();//sysj\plant.sysj line: 286, column: 7
      currsigs.addElement(gripperTurnFinalPos);
      active[18]=1;
      ends[18]=1;
      tdone[18]=1;
    }
    else {
      S83926=1;
      if(gripperTurnRetract.getprestatus() && !gripperTurnExtend.getprestatus()){//sysj\plant.sysj line: 289, column: 13
        gripperTurnHomePos.setPresent();//sysj\plant.sysj line: 291, column: 7
        currsigs.addElement(gripperTurnHomePos);
        active[18]=1;
        ends[18]=1;
        tdone[18]=1;
      }
      else {
        S83926=2;
        active[18]=1;
        ends[18]=1;
        tdone[18]=1;
      }
    }
  }

  public void thread84984(int [] tdone, int [] ends){
        S83905=1;
    S83883=0;
    active[17]=1;
    ends[17]=1;
    tdone[17]=1;
  }

  public void thread84983(int [] tdone, int [] ends){
        S83873=1;
    S83845=0;
    gripperZAxisLifted.setPresent();//sysj\plant.sysj line: 261, column: 6
    currsigs.addElement(gripperZAxisLifted);
    active[16]=1;
    ends[16]=1;
    tdone[16]=1;
  }

  public void thread84982(int [] tdone, int [] ends){
        S83832=1;
    S83810=0;
    active[15]=1;
    ends[15]=1;
    tdone[15]=1;
  }

  public void thread84981(int [] tdone, int [] ends){
        S83800=1;
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

  public void thread84980(int [] tdone, int [] ends){
        S83738=1;
    S83692=0;
    S83674=0;
    active[13]=1;
    ends[13]=1;
    tdone[13]=1;
  }

  public void thread84979(int [] tdone, int [] ends){
        S83670=1;
    S83640=0;
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
        S83640=1;
        active[12]=1;
        ends[12]=1;
        tdone[12]=1;
      }
    }
    else {
      S83640=1;
      active[12]=1;
      ends[12]=1;
      tdone[12]=1;
    }
  }

  public void thread84978(int [] tdone, int [] ends){
        S83626=1;
    S83598=0;
    pusherRetracted.setPresent();//sysj\plant.sysj line: 180, column: 5
    currsigs.addElement(pusherRetracted);
    active[11]=1;
    ends[11]=1;
    tdone[11]=1;
  }

  public void thread84977(int [] tdone, int [] ends){
        S83585=1;
    S83557=0;
    armAtDest.setPresent();//sysj\plant.sysj line: 169, column: 5
    currsigs.addElement(armAtDest);
    active[10]=1;
    ends[10]=1;
    tdone[10]=1;
  }

  public void thread84975(int [] tdone, int [] ends){
        S83506=1;
    S83503=0;
    dosUnitEvac.setPresent();//sysj\plant.sysj line: 147, column: 7
    currsigs.addElement(dosUnitEvac);
    active[9]=1;
    ends[9]=1;
    tdone[9]=1;
  }

  public void thread84974(int [] tdone, int [] ends){
        S83498=1;
    S83493=0;
    active[8]=1;
    ends[8]=1;
    tdone[8]=1;
  }

  public void thread84973(int [] tdone, int [] ends){
        S83491=1;
    active[7]=1;
    ends[7]=1;
    tdone[7]=1;
  }

  public void thread84972(int [] tdone, int [] ends){
        S83544=1;
    thread84973(tdone,ends);
    thread84974(tdone,ends);
    thread84975(tdone,ends);
    int biggest84976 = 0;
    if(ends[7]>=biggest84976){
      biggest84976=ends[7];
    }
    if(ends[8]>=biggest84976){
      biggest84976=ends[8];
    }
    if(ends[9]>=biggest84976){
      biggest84976=ends[9];
    }
    if(biggest84976 == 1){
      active[6]=1;
      ends[6]=1;
      tdone[6]=1;
    }
  }

  public void thread84971(int [] tdone, int [] ends){
        S83488=1;
    S83482=0;
    if(bottleAtPos1.getprestatus()){//sysj\plant.sysj line: 109, column: 12
      RTbottleAtPos1.setPresent();//sysj\plant.sysj line: 111, column: 5
      currsigs.addElement(RTbottleAtPos1);
      S83482=1;
      active[5]=1;
      ends[5]=1;
      tdone[5]=1;
    }
    else {
      S83482=1;
      active[5]=1;
      ends[5]=1;
      tdone[5]=1;
    }
  }

  public void thread84969(int [] tdone, int [] ends){
        S83424=1;
    if(motorPos5On.getprestatus()){//sysj\plant.sysj line: 92, column: 14
      System.out.println("Conveyor Plant - moving bottle to leave 5");//sysj\plant.sysj line: 93, column: 7
      bottleLeftPos5.setPresent();//sysj\plant.sysj line: 95, column: 8
      currsigs.addElement(bottleLeftPos5);
      active[4]=1;
      ends[4]=1;
      tdone[4]=1;
    }
    else {
      S83424=0;
      active[4]=0;
      ends[4]=0;
      tdone[4]=1;
    }
  }

  public void thread84968(int [] tdone, int [] ends){
        S83412=1;
    if(motorPos1On.getprestatus()){//sysj\plant.sysj line: 83, column: 14
      System.out.println("Conveyor plant - moving bottle to 1");//sysj\plant.sysj line: 84, column: 7
      bottleAtPos1.setPresent();//sysj\plant.sysj line: 86, column: 8
      currsigs.addElement(bottleAtPos1);
      active[3]=1;
      ends[3]=1;
      tdone[3]=1;
    }
    else {
      S83412=0;
      active[3]=0;
      ends[3]=0;
      tdone[3]=1;
    }
  }

  public void thread84967(int [] tdone, int [] ends){
        S83480=1;
    S83426=0;
    if(motConveyorOnOff.getprestatus()){//sysj\plant.sysj line: 81, column: 12
      thread84968(tdone,ends);
      thread84969(tdone,ends);
      int biggest84970 = 0;
      if(ends[3]>=biggest84970){
        biggest84970=ends[3];
      }
      if(ends[4]>=biggest84970){
        biggest84970=ends[4];
      }
      if(biggest84970 == 1){
        active[2]=1;
        ends[2]=1;
        tdone[2]=1;
      }
      //FINXME code
      if(biggest84970 == 0){
        S83426=1;
        active[2]=1;
        ends[2]=1;
        tdone[2]=1;
      }
    }
    else {
      S83426=1;
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
      switch(S84965){
        case 0 : 
          S84965=0;
          break RUN;
        
        case 1 : 
          S84965=2;
          S84965=2;
          capDec_1.setClear();//sysj\plant.sysj line: 72, column: 2
          capPos_1.setClear();//sysj\plant.sysj line: 73, column: 2
          capPos_1.setPresent();//sysj\plant.sysj line: 74, column: 2
          currsigs.addElement(capPos_1);
          capPos_1.setValue(0);//sysj\plant.sysj line: 74, column: 2
          disablePos5_1.setClear();//sysj\plant.sysj line: 75, column: 2
          thread84967(tdone,ends);
          thread84971(tdone,ends);
          thread84972(tdone,ends);
          thread84977(tdone,ends);
          thread84978(tdone,ends);
          thread84979(tdone,ends);
          thread84980(tdone,ends);
          thread84981(tdone,ends);
          thread84982(tdone,ends);
          thread84983(tdone,ends);
          thread84984(tdone,ends);
          thread84985(tdone,ends);
          thread84986(tdone,ends);
          thread84987(tdone,ends);
          thread84988(tdone,ends);
          thread84989(tdone,ends);
          thread84990(tdone,ends);
          thread84991(tdone,ends);
          int biggest84992 = 0;
          if(ends[2]>=biggest84992){
            biggest84992=ends[2];
          }
          if(ends[5]>=biggest84992){
            biggest84992=ends[5];
          }
          if(ends[6]>=biggest84992){
            biggest84992=ends[6];
          }
          if(ends[10]>=biggest84992){
            biggest84992=ends[10];
          }
          if(ends[11]>=biggest84992){
            biggest84992=ends[11];
          }
          if(ends[12]>=biggest84992){
            biggest84992=ends[12];
          }
          if(ends[13]>=biggest84992){
            biggest84992=ends[13];
          }
          if(ends[14]>=biggest84992){
            biggest84992=ends[14];
          }
          if(ends[15]>=biggest84992){
            biggest84992=ends[15];
          }
          if(ends[16]>=biggest84992){
            biggest84992=ends[16];
          }
          if(ends[17]>=biggest84992){
            biggest84992=ends[17];
          }
          if(ends[18]>=biggest84992){
            biggest84992=ends[18];
          }
          if(ends[19]>=biggest84992){
            biggest84992=ends[19];
          }
          if(ends[20]>=biggest84992){
            biggest84992=ends[20];
          }
          if(ends[21]>=biggest84992){
            biggest84992=ends[21];
          }
          if(ends[22]>=biggest84992){
            biggest84992=ends[22];
          }
          if(ends[23]>=biggest84992){
            biggest84992=ends[23];
          }
          if(ends[24]>=biggest84992){
            biggest84992=ends[24];
          }
          if(biggest84992 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
        
        case 2 : 
          capDec_1.setClear();//sysj\plant.sysj line: 72, column: 2
          capPos_1.setClear();//sysj\plant.sysj line: 73, column: 2
          disablePos5_1.setClear();//sysj\plant.sysj line: 75, column: 2
          thread84993(tdone,ends);
          thread85000(tdone,ends);
          thread85001(tdone,ends);
          thread85010(tdone,ends);
          thread85011(tdone,ends);
          thread85012(tdone,ends);
          thread85013(tdone,ends);
          thread85014(tdone,ends);
          thread85015(tdone,ends);
          thread85016(tdone,ends);
          thread85017(tdone,ends);
          thread85018(tdone,ends);
          thread85019(tdone,ends);
          thread85020(tdone,ends);
          thread85021(tdone,ends);
          thread85022(tdone,ends);
          thread85023(tdone,ends);
          thread85024(tdone,ends);
          int biggest85025 = 0;
          if(ends[2]>=biggest85025){
            biggest85025=ends[2];
          }
          if(ends[5]>=biggest85025){
            biggest85025=ends[5];
          }
          if(ends[6]>=biggest85025){
            biggest85025=ends[6];
          }
          if(ends[10]>=biggest85025){
            biggest85025=ends[10];
          }
          if(ends[11]>=biggest85025){
            biggest85025=ends[11];
          }
          if(ends[12]>=biggest85025){
            biggest85025=ends[12];
          }
          if(ends[13]>=biggest85025){
            biggest85025=ends[13];
          }
          if(ends[14]>=biggest85025){
            biggest85025=ends[14];
          }
          if(ends[15]>=biggest85025){
            biggest85025=ends[15];
          }
          if(ends[16]>=biggest85025){
            biggest85025=ends[16];
          }
          if(ends[17]>=biggest85025){
            biggest85025=ends[17];
          }
          if(ends[18]>=biggest85025){
            biggest85025=ends[18];
          }
          if(ends[19]>=biggest85025){
            biggest85025=ends[19];
          }
          if(ends[20]>=biggest85025){
            biggest85025=ends[20];
          }
          if(ends[21]>=biggest85025){
            biggest85025=ends[21];
          }
          if(ends[22]>=biggest85025){
            biggest85025=ends[22];
          }
          if(ends[23]>=biggest85025){
            biggest85025=ends[23];
          }
          if(ends[24]>=biggest85025){
            biggest85025=ends[24];
          }
          if(biggest85025 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
          //FINXME code
          if(biggest85025 == 0){
            S84965=0;
            active[1]=0;
            ends[1]=0;
            S84965=0;
            break RUN;
          }
        
      }
    }
  }

  public void init(){
    char [] active1 = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
    char [] paused1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    char [] suspended1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
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
