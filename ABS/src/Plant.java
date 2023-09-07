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
  public Signal dosUnitFilled = new Signal("dosUnitFilled", Signal.OUTPUT);
  public Signal selectedCanister = new Signal("selectedCanister", Signal.OUTPUT);
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
  private int capcount_thread_13;//sysj\plant.sysj line: 223, column: 3
  private int canister_thread_6;//sysj\plant.sysj line: 123, column: 3
  private int received_thread_7;//sysj\plant.sysj line: 133, column: 3
  private int S138313 = 1;
  private int S136908 = 1;
  private int S136854 = 1;
  private int S136840 = 1;
  private int S136852 = 1;
  private int S136916 = 1;
  private int S136910 = 1;
  private int S136919 = 1;
  private int S136924 = 1;
  private int S136921 = 1;
  private int S136932 = 1;
  private int S136929 = 1;
  private int S136973 = 1;
  private int S136945 = 1;
  private int S137014 = 1;
  private int S136986 = 1;
  private int S137058 = 1;
  private int S137028 = 1;
  private int S137126 = 1;
  private int S137080 = 1;
  private int S137062 = 1;
  private int S137188 = 1;
  private int S137220 = 1;
  private int S137198 = 1;
  private int S137261 = 1;
  private int S137233 = 1;
  private int S137293 = 1;
  private int S137271 = 1;
  private int S137358 = 1;
  private int S137314 = 1;
  private int S137390 = 1;
  private int S137368 = 1;
  private int S137449 = 1;
  private int S137409 = 1;
  private int S137395 = 1;
  private int S137481 = 1;
  private int S137459 = 1;
  private int S137510 = 1;
  private int S137490 = 1;
  private int S137539 = 1;
  private int S137519 = 1;
  private int S137568 = 1;
  private int S137548 = 1;
  
  private int[] ends = new int[24];
  private int[] tdone = new int[24];
  
  public void thread138364(int [] tdone, int [] ends){
        switch(S137568){
      case 0 : 
        active[23]=0;
        ends[23]=0;
        tdone[23]=1;
        break;
      
      case 1 : 
        switch(S137548){
          case 0 : 
            bottleAtPos2.setPresent();//sysj\plant.sysj line: 366, column: 82
            currsigs.addElement(bottleAtPos2);
            active[23]=1;
            ends[23]=1;
            tdone[23]=1;
            break;
          
          case 1 : 
            S137548=1;
            S137548=0;
            if(moveToPos2.getprestatus()){//sysj\plant.sysj line: 366, column: 24
              System.out.println("bottle is now at pos 2");//sysj\plant.sysj line: 366, column: 36
              bottleAtPos2.setPresent();//sysj\plant.sysj line: 366, column: 82
              currsigs.addElement(bottleAtPos2);
              active[23]=1;
              ends[23]=1;
              tdone[23]=1;
            }
            else {
              S137548=1;
              active[23]=1;
              ends[23]=1;
              tdone[23]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread138363(int [] tdone, int [] ends){
        switch(S137539){
      case 0 : 
        active[22]=0;
        ends[22]=0;
        tdone[22]=1;
        break;
      
      case 1 : 
        switch(S137519){
          case 0 : 
            bottleAtPos3.setPresent();//sysj\plant.sysj line: 364, column: 82
            currsigs.addElement(bottleAtPos3);
            active[22]=1;
            ends[22]=1;
            tdone[22]=1;
            break;
          
          case 1 : 
            S137519=1;
            S137519=0;
            if(moveToPos3.getprestatus()){//sysj\plant.sysj line: 364, column: 24
              System.out.println("bottle is now at pos 3");//sysj\plant.sysj line: 364, column: 36
              bottleAtPos3.setPresent();//sysj\plant.sysj line: 364, column: 82
              currsigs.addElement(bottleAtPos3);
              active[22]=1;
              ends[22]=1;
              tdone[22]=1;
            }
            else {
              S137519=1;
              active[22]=1;
              ends[22]=1;
              tdone[22]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread138362(int [] tdone, int [] ends){
        switch(S137510){
      case 0 : 
        active[21]=0;
        ends[21]=0;
        tdone[21]=1;
        break;
      
      case 1 : 
        switch(S137490){
          case 0 : 
            bottleAtPos4.setPresent();//sysj\plant.sysj line: 362, column: 82
            currsigs.addElement(bottleAtPos4);
            active[21]=1;
            ends[21]=1;
            tdone[21]=1;
            break;
          
          case 1 : 
            S137490=1;
            S137490=0;
            if(moveToPos4.getprestatus()){//sysj\plant.sysj line: 362, column: 24
              System.out.println("bottle is now at pos 4");//sysj\plant.sysj line: 362, column: 36
              bottleAtPos4.setPresent();//sysj\plant.sysj line: 362, column: 82
              currsigs.addElement(bottleAtPos4);
              active[21]=1;
              ends[21]=1;
              tdone[21]=1;
            }
            else {
              S137490=1;
              active[21]=1;
              ends[21]=1;
              tdone[21]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread138361(int [] tdone, int [] ends){
        switch(S137481){
      case 0 : 
        active[20]=0;
        ends[20]=0;
        tdone[20]=1;
        break;
      
      case 1 : 
        switch(S137459){
          case 0 : 
            if(bottleLeftPos5.getprestatus()){//sysj\plant.sysj line: 352, column: 10
              S137459=1;
              active[20]=1;
              ends[20]=1;
              tdone[20]=1;
            }
            else {
              bottleAtPos5.setPresent();//sysj\plant.sysj line: 355, column: 6
              currsigs.addElement(bottleAtPos5);
              active[20]=1;
              ends[20]=1;
              tdone[20]=1;
            }
            break;
          
          case 1 : 
            S137459=1;
            S137459=0;
            if(moveToPos5.getprestatus()){//sysj\plant.sysj line: 353, column: 13
              System.out.println("bottle is now at pos 5");//sysj\plant.sysj line: 354, column: 6
              bottleAtPos5.setPresent();//sysj\plant.sysj line: 355, column: 6
              currsigs.addElement(bottleAtPos5);
              active[20]=1;
              ends[20]=1;
              tdone[20]=1;
            }
            else {
              S137459=1;
              active[20]=1;
              ends[20]=1;
              tdone[20]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread138360(int [] tdone, int [] ends){
        switch(S137449){
      case 0 : 
        active[19]=0;
        ends[19]=0;
        tdone[19]=1;
        break;
      
      case 1 : 
        switch(S137409){
          case 0 : 
            switch(S137395){
              case 0 : 
                S137395=0;
                if(bottleAtPos3.getprestatus()){//sysj\plant.sysj line: 320, column: 13
                  System.out.println("moving bottle at pos 3 to pos 4");//sysj\plant.sysj line: 321, column: 6
                  moveToPos4.setPresent();//sysj\plant.sysj line: 322, column: 6
                  currsigs.addElement(moveToPos4);
                  S137395=1;
                  active[19]=1;
                  ends[19]=1;
                  tdone[19]=1;
                }
                else {
                  S137395=1;
                  active[19]=1;
                  ends[19]=1;
                  tdone[19]=1;
                }
                break;
              
              case 1 : 
                S137395=1;
                if(bottleAtPos2.getprestatus()){//sysj\plant.sysj line: 327, column: 13
                  System.out.println("moving bottle at pos 2 to pos 3");//sysj\plant.sysj line: 328, column: 6
                  moveToPos3.setPresent();//sysj\plant.sysj line: 329, column: 6
                  currsigs.addElement(moveToPos3);
                  S137395=2;
                  active[19]=1;
                  ends[19]=1;
                  tdone[19]=1;
                }
                else {
                  S137395=2;
                  active[19]=1;
                  ends[19]=1;
                  tdone[19]=1;
                }
                break;
              
              case 2 : 
                S137395=2;
                if(bottleAtPos1.getprestatus()){//sysj\plant.sysj line: 333, column: 13
                  System.out.println("moving bottle at pos 1 to pos 2");//sysj\plant.sysj line: 334, column: 6
                  moveToPos2.setPresent();//sysj\plant.sysj line: 335, column: 6
                  currsigs.addElement(moveToPos2);
                  S137395=3;
                  active[19]=1;
                  ends[19]=1;
                  tdone[19]=1;
                }
                else {
                  S137395=3;
                  active[19]=1;
                  ends[19]=1;
                  tdone[19]=1;
                }
                break;
              
              case 3 : 
                S137395=3;
                System.out.println("Table has been aligned");//sysj\plant.sysj line: 339, column: 5
                tableAlignedWithSensor.setPresent();//sysj\plant.sysj line: 340, column: 5
                currsigs.addElement(tableAlignedWithSensor);
                S137395=4;
                active[19]=1;
                ends[19]=1;
                tdone[19]=1;
                break;
              
              case 4 : 
                S137395=4;
                S137409=1;
                active[19]=1;
                ends[19]=1;
                tdone[19]=1;
                break;
              
            }
            break;
          
          case 1 : 
            S137409=1;
            S137409=0;
            if(rotaryTableTrigger.getprestatus()){//sysj\plant.sysj line: 307, column: 12
              System.out.println("table triggered now moving");//sysj\plant.sysj line: 310, column: 5
              if(bottleAtPos4.getprestatus()){//sysj\plant.sysj line: 313, column: 13
                System.out.println("moving bottle at pos 4 to pos 5");//sysj\plant.sysj line: 314, column: 6
                moveToPos5.setPresent();//sysj\plant.sysj line: 315, column: 6
                currsigs.addElement(moveToPos5);
                S137395=0;
                active[19]=1;
                ends[19]=1;
                tdone[19]=1;
              }
              else {
                S137395=0;
                active[19]=1;
                ends[19]=1;
                tdone[19]=1;
              }
            }
            else {
              S137409=1;
              active[19]=1;
              ends[19]=1;
              tdone[19]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread138359(int [] tdone, int [] ends){
        switch(S137390){
      case 0 : 
        active[18]=0;
        ends[18]=0;
        tdone[18]=1;
        break;
      
      case 1 : 
        switch(S137368){
          case 0 : 
            if(cylClampBottleExtend.getprestatus()){//sysj\plant.sysj line: 296, column: 11
              S137368=1;
              cylClampedBottle.setPresent();//sysj\plant.sysj line: 298, column: 6
              currsigs.addElement(cylClampedBottle);
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
            if(!cylClampBottleExtend.getprestatus()){//sysj\plant.sysj line: 297, column: 12
              S137368=2;
              active[18]=1;
              ends[18]=1;
              tdone[18]=1;
            }
            else {
              cylClampedBottle.setPresent();//sysj\plant.sysj line: 298, column: 6
              currsigs.addElement(cylClampedBottle);
              active[18]=1;
              ends[18]=1;
              tdone[18]=1;
            }
            break;
          
          case 2 : 
            S137368=2;
            S137368=0;
            active[18]=1;
            ends[18]=1;
            tdone[18]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread138358(int [] tdone, int [] ends){
        switch(S137358){
      case 0 : 
        active[17]=0;
        ends[17]=0;
        tdone[17]=1;
        break;
      
      case 1 : 
        switch(S137314){
          case 0 : 
            if(gripperTurnRetract.getprestatus()){//sysj\plant.sysj line: 280, column: 13
              S137314=1;
              if(gripperTurnRetract.getprestatus() && !gripperTurnExtend.getprestatus()){//sysj\plant.sysj line: 284, column: 13
                gripperTurnHomePos.setPresent();//sysj\plant.sysj line: 286, column: 7
                currsigs.addElement(gripperTurnHomePos);
                active[17]=1;
                ends[17]=1;
                tdone[17]=1;
              }
              else {
                S137314=2;
                active[17]=1;
                ends[17]=1;
                tdone[17]=1;
              }
            }
            else {
              gripperTurnFinalPos.setPresent();//sysj\plant.sysj line: 281, column: 7
              currsigs.addElement(gripperTurnFinalPos);
              active[17]=1;
              ends[17]=1;
              tdone[17]=1;
            }
            break;
          
          case 1 : 
            if(gripperTurnExtend.getprestatus()){//sysj\plant.sysj line: 285, column: 13
              S137314=2;
              active[17]=1;
              ends[17]=1;
              tdone[17]=1;
            }
            else {
              gripperTurnHomePos.setPresent();//sysj\plant.sysj line: 286, column: 7
              currsigs.addElement(gripperTurnHomePos);
              active[17]=1;
              ends[17]=1;
              tdone[17]=1;
            }
            break;
          
          case 2 : 
            S137314=2;
            S137314=0;
            if(gripperTurnExtend.getprestatus() && !gripperTurnRetract.getprestatus()){//sysj\plant.sysj line: 279, column: 13
              gripperTurnFinalPos.setPresent();//sysj\plant.sysj line: 281, column: 7
              currsigs.addElement(gripperTurnFinalPos);
              active[17]=1;
              ends[17]=1;
              tdone[17]=1;
            }
            else {
              S137314=1;
              if(gripperTurnRetract.getprestatus() && !gripperTurnExtend.getprestatus()){//sysj\plant.sysj line: 284, column: 13
                gripperTurnHomePos.setPresent();//sysj\plant.sysj line: 286, column: 7
                currsigs.addElement(gripperTurnHomePos);
                active[17]=1;
                ends[17]=1;
                tdone[17]=1;
              }
              else {
                S137314=2;
                active[17]=1;
                ends[17]=1;
                tdone[17]=1;
              }
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread138357(int [] tdone, int [] ends){
        switch(S137293){
      case 0 : 
        active[16]=0;
        ends[16]=0;
        tdone[16]=1;
        break;
      
      case 1 : 
        switch(S137271){
          case 0 : 
            if(capGripperPos5Extend.getprestatus()){//sysj\plant.sysj line: 268, column: 11
              S137271=1;
              gripperGrippedCap.setPresent();//sysj\plant.sysj line: 270, column: 6
              currsigs.addElement(gripperGrippedCap);
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
            if(!capGripperPos5Extend.getprestatus()){//sysj\plant.sysj line: 269, column: 12
              S137271=2;
              active[16]=1;
              ends[16]=1;
              tdone[16]=1;
            }
            else {
              gripperGrippedCap.setPresent();//sysj\plant.sysj line: 270, column: 6
              currsigs.addElement(gripperGrippedCap);
              active[16]=1;
              ends[16]=1;
              tdone[16]=1;
            }
            break;
          
          case 2 : 
            S137271=2;
            S137271=0;
            active[16]=1;
            ends[16]=1;
            tdone[16]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread138356(int [] tdone, int [] ends){
        switch(S137261){
      case 0 : 
        active[15]=0;
        ends[15]=0;
        tdone[15]=1;
        break;
      
      case 1 : 
        switch(S137233){
          case 0 : 
            if(cylPos5ZAxisExtend.getprestatus()){//sysj\plant.sysj line: 255, column: 11
              S137233=1;
              gripperZAxisLowered.setPresent();//sysj\plant.sysj line: 259, column: 6
              currsigs.addElement(gripperZAxisLowered);
              active[15]=1;
              ends[15]=1;
              tdone[15]=1;
            }
            else {
              gripperZAxisLifted.setPresent();//sysj\plant.sysj line: 256, column: 6
              currsigs.addElement(gripperZAxisLifted);
              active[15]=1;
              ends[15]=1;
              tdone[15]=1;
            }
            break;
          
          case 1 : 
            if(!cylPos5ZAxisExtend.getprestatus()){//sysj\plant.sysj line: 258, column: 12
              S137233=2;
              active[15]=1;
              ends[15]=1;
              tdone[15]=1;
            }
            else {
              gripperZAxisLowered.setPresent();//sysj\plant.sysj line: 259, column: 6
              currsigs.addElement(gripperZAxisLowered);
              active[15]=1;
              ends[15]=1;
              tdone[15]=1;
            }
            break;
          
          case 2 : 
            S137233=2;
            S137233=0;
            gripperZAxisLifted.setPresent();//sysj\plant.sysj line: 256, column: 6
            currsigs.addElement(gripperZAxisLifted);
            active[15]=1;
            ends[15]=1;
            tdone[15]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread138355(int [] tdone, int [] ends){
        switch(S137220){
      case 0 : 
        active[14]=0;
        ends[14]=0;
        tdone[14]=1;
        break;
      
      case 1 : 
        switch(S137198){
          case 0 : 
            if(moveToPos4.getprestatus()){//sysj\plant.sysj line: 244, column: 11
              S137198=1;
              bottleAtPos4.setPresent();//sysj\plant.sysj line: 246, column: 6
              currsigs.addElement(bottleAtPos4);
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
            if(moveToPos5.getprestatus()){//sysj\plant.sysj line: 245, column: 12
              S137198=2;
              active[14]=1;
              ends[14]=1;
              tdone[14]=1;
            }
            else {
              bottleAtPos4.setPresent();//sysj\plant.sysj line: 246, column: 6
              currsigs.addElement(bottleAtPos4);
              active[14]=1;
              ends[14]=1;
              tdone[14]=1;
            }
            break;
          
          case 2 : 
            S137198=2;
            S137198=0;
            active[14]=1;
            ends[14]=1;
            tdone[14]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread138354(int [] tdone, int [] ends){
        switch(S137188){
      case 0 : 
        active[13]=0;
        ends[13]=0;
        tdone[13]=1;
        break;
      
      case 1 : 
        if(capDec_1.getprestatus()){//sysj\plant.sysj line: 225, column: 12
          if(capcount_thread_13 > 0) {//sysj\plant.sysj line: 226, column: 5
            capcount_thread_13 = capcount_thread_13 - 1;//sysj\plant.sysj line: 227, column: 6
          }
          if(refill.getprestatus()){//sysj\plant.sysj line: 229, column: 12
            capcount_thread_13 = 5;//sysj\plant.sysj line: 230, column: 5
            if(capcount_thread_13 == 0){//sysj\plant.sysj line: 233, column: 8
              empty.setPresent();//sysj\plant.sysj line: 234, column: 6
              currsigs.addElement(empty);
              active[13]=1;
              ends[13]=1;
              tdone[13]=1;
            }
            else {
              active[13]=1;
              ends[13]=1;
              tdone[13]=1;
            }
          }
          else {
            if(capcount_thread_13 == 0){//sysj\plant.sysj line: 233, column: 8
              empty.setPresent();//sysj\plant.sysj line: 234, column: 6
              currsigs.addElement(empty);
              active[13]=1;
              ends[13]=1;
              tdone[13]=1;
            }
            else {
              active[13]=1;
              ends[13]=1;
              tdone[13]=1;
            }
          }
        }
        else {
          if(refill.getprestatus()){//sysj\plant.sysj line: 229, column: 12
            capcount_thread_13 = 5;//sysj\plant.sysj line: 230, column: 5
            if(capcount_thread_13 == 0){//sysj\plant.sysj line: 233, column: 8
              empty.setPresent();//sysj\plant.sysj line: 234, column: 6
              currsigs.addElement(empty);
              active[13]=1;
              ends[13]=1;
              tdone[13]=1;
            }
            else {
              active[13]=1;
              ends[13]=1;
              tdone[13]=1;
            }
          }
          else {
            if(capcount_thread_13 == 0){//sysj\plant.sysj line: 233, column: 8
              empty.setPresent();//sysj\plant.sysj line: 234, column: 6
              currsigs.addElement(empty);
              active[13]=1;
              ends[13]=1;
              tdone[13]=1;
            }
            else {
              active[13]=1;
              ends[13]=1;
              tdone[13]=1;
            }
          }
        }
        break;
      
    }
  }

  public void thread138353(int [] tdone, int [] ends){
        switch(S137126){
      case 0 : 
        active[12]=0;
        ends[12]=0;
        tdone[12]=1;
        break;
      
      case 1 : 
        switch(S137080){
          case 0 : 
            if(empty.getprestatus()){//sysj\plant.sysj line: 208, column: 10
              S137080=1;
              active[12]=1;
              ends[12]=1;
              tdone[12]=1;
            }
            else {
              switch(S137062){
                case 0 : 
                  if(pusherRetracted.getprestatus()){//sysj\plant.sysj line: 210, column: 13
                    S137062=1;
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
                
                case 1 : 
                  if(pusherExtended.getprestatus()){//sysj\plant.sysj line: 211, column: 13
                    capPos_1.setPresent();//sysj\plant.sysj line: 213, column: 7
                    currsigs.addElement(capPos_1);
                    capPos_1.setValue(1);//sysj\plant.sysj line: 213, column: 7
                    S137062=2;
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
                  if(pusherRetracted.getprestatus()){//sysj\plant.sysj line: 214, column: 13
                    capDec_1.setPresent();//sysj\plant.sysj line: 215, column: 7
                    currsigs.addElement(capDec_1);
                    S137062=0;
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
                
              }
            }
            break;
          
          case 1 : 
            if(refill.getprestatus()){//sysj\plant.sysj line: 218, column: 10
              S137080=0;
              S137062=0;
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
          
        }
        break;
      
    }
  }

  public void thread138352(int [] tdone, int [] ends){
        switch(S137058){
      case 0 : 
        active[11]=0;
        ends[11]=0;
        tdone[11]=1;
        break;
      
      case 1 : 
        switch(S137028){
          case 0 : 
            if(!vacOn.getprestatus()){//sysj\plant.sysj line: 188, column: 12
              if(armAtSource.getprestatus()){//sysj\plant.sysj line: 191, column: 14
                capPos_1.setPresent();//sysj\plant.sysj line: 192, column: 7
                currsigs.addElement(capPos_1);
                capPos_1.setValue(1);//sysj\plant.sysj line: 192, column: 7
                S137028=1;
                active[11]=1;
                ends[11]=1;
                tdone[11]=1;
              }
              else {
                S137028=1;
                active[11]=1;
                ends[11]=1;
                tdone[11]=1;
              }
            }
            else {
              WPgripped.setPresent();//sysj\plant.sysj line: 189, column: 7
              currsigs.addElement(WPgripped);
              active[11]=1;
              ends[11]=1;
              tdone[11]=1;
            }
            break;
          
          case 1 : 
            S137028=1;
            S137028=0;
            if(vacOn.getprestatus() && armAtSource.getprestatus()){//sysj\plant.sysj line: 185, column: 12
              if((Integer)(capPos_1.getpreval() == null ? 0 : ((Integer)capPos_1.getpreval()).intValue()) == 1){//sysj\plant.sysj line: 186, column: 8
                capPos_1.setPresent();//sysj\plant.sysj line: 187, column: 6
                currsigs.addElement(capPos_1);
                capPos_1.setValue(0);//sysj\plant.sysj line: 187, column: 6
                WPgripped.setPresent();//sysj\plant.sysj line: 189, column: 7
                currsigs.addElement(WPgripped);
                active[11]=1;
                ends[11]=1;
                tdone[11]=1;
              }
              else {
                S137028=1;
                active[11]=1;
                ends[11]=1;
                tdone[11]=1;
              }
            }
            else {
              S137028=1;
              active[11]=1;
              ends[11]=1;
              tdone[11]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread138351(int [] tdone, int [] ends){
        switch(S137014){
      case 0 : 
        active[10]=0;
        ends[10]=0;
        tdone[10]=1;
        break;
      
      case 1 : 
        switch(S136986){
          case 0 : 
            if(pusherExtend.getprestatus()){//sysj\plant.sysj line: 174, column: 10
              S136986=1;
              pusherExtended.setPresent();//sysj\plant.sysj line: 178, column: 5
              currsigs.addElement(pusherExtended);
              active[10]=1;
              ends[10]=1;
              tdone[10]=1;
            }
            else {
              pusherRetracted.setPresent();//sysj\plant.sysj line: 175, column: 5
              currsigs.addElement(pusherRetracted);
              active[10]=1;
              ends[10]=1;
              tdone[10]=1;
            }
            break;
          
          case 1 : 
            if(!pusherExtend.getprestatus()){//sysj\plant.sysj line: 177, column: 10
              S136986=0;
              pusherRetracted.setPresent();//sysj\plant.sysj line: 175, column: 5
              currsigs.addElement(pusherRetracted);
              active[10]=1;
              ends[10]=1;
              tdone[10]=1;
            }
            else {
              pusherExtended.setPresent();//sysj\plant.sysj line: 178, column: 5
              currsigs.addElement(pusherExtended);
              active[10]=1;
              ends[10]=1;
              tdone[10]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread138350(int [] tdone, int [] ends){
        switch(S136973){
      case 0 : 
        active[9]=0;
        ends[9]=0;
        tdone[9]=1;
        break;
      
      case 1 : 
        switch(S136945){
          case 0 : 
            if(armSource.getprestatus()){//sysj\plant.sysj line: 163, column: 10
              S136945=1;
              armAtSource.setPresent();//sysj\plant.sysj line: 167, column: 5
              currsigs.addElement(armAtSource);
              active[9]=1;
              ends[9]=1;
              tdone[9]=1;
            }
            else {
              armAtDest.setPresent();//sysj\plant.sysj line: 164, column: 5
              currsigs.addElement(armAtDest);
              active[9]=1;
              ends[9]=1;
              tdone[9]=1;
            }
            break;
          
          case 1 : 
            if(armDest.getprestatus()){//sysj\plant.sysj line: 166, column: 10
              S136945=0;
              armAtDest.setPresent();//sysj\plant.sysj line: 164, column: 5
              currsigs.addElement(armAtDest);
              active[9]=1;
              ends[9]=1;
              tdone[9]=1;
            }
            else {
              armAtSource.setPresent();//sysj\plant.sysj line: 167, column: 5
              currsigs.addElement(armAtSource);
              active[9]=1;
              ends[9]=1;
              tdone[9]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread138349(int [] tdone, int [] ends){
        switch(S136932){
      case 0 : 
        active[8]=0;
        ends[8]=0;
        tdone[8]=1;
        break;
      
      case 1 : 
        switch(S136929){
          case 0 : 
            if(dosUnitValveRetract.getprestatus()){//sysj\plant.sysj line: 145, column: 9
              System.out.println("Canister at top");//sysj\plant.sysj line: 148, column: 3
              S136929=1;
              active[8]=1;
              ends[8]=1;
              tdone[8]=1;
            }
            else {
              dosUnitEvac.setPresent();//sysj\plant.sysj line: 146, column: 4
              currsigs.addElement(dosUnitEvac);
              active[8]=1;
              ends[8]=1;
              tdone[8]=1;
            }
            break;
          
          case 1 : 
            if(dosUnitValveExtend.getprestatus()){//sysj\plant.sysj line: 150, column: 9
              System.out.println("Canister at bottom");//sysj\plant.sysj line: 151, column: 3
              S136929=2;
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
          
          case 2 : 
            S136929=2;
            S136932=0;
            active[8]=0;
            ends[8]=0;
            tdone[8]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread138348(int [] tdone, int [] ends){
        switch(S136924){
      case 0 : 
        active[7]=0;
        ends[7]=0;
        tdone[7]=1;
        break;
      
      case 1 : 
        switch(S136921){
          case 0 : 
            if(receivedPercentage.getprestatus()){//sysj\plant.sysj line: 131, column: 9
              System.out.println("received");//sysj\plant.sysj line: 132, column: 3
              received_thread_7 = (int)(receivedPercentage.getpreval() == null ? null : ((Integer)receivedPercentage.getpreval()));//sysj\plant.sysj line: 133, column: 3
              System.out.println("filled");//sysj\plant.sysj line: 134, column: 3
              S136921=1;
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
            if(valveInletOnOff.getprestatus()){//sysj\plant.sysj line: 137, column: 9
              dosUnitFilled.setPresent();//sysj\plant.sysj line: 138, column: 3
              currsigs.addElement(dosUnitFilled);
              S136924=0;
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
        break;
      
    }
  }

  public void thread138347(int [] tdone, int [] ends){
        switch(S136919){
      case 0 : 
        active[6]=0;
        ends[6]=0;
        tdone[6]=1;
        break;
      
      case 1 : 
        if(selectCanister.getprestatus()){//sysj\plant.sysj line: 122, column: 9
          canister_thread_6 = (selectCanister.getpreval() == null ? null : ((Integer)selectCanister.getpreval()));//sysj\plant.sysj line: 123, column: 3
          System.out.println("canister number received");//sysj\plant.sysj line: 124, column: 3
          selectedCanister.setPresent();//sysj\plant.sysj line: 125, column: 3
          currsigs.addElement(selectedCanister);
          selectedCanister.setValue(canister_thread_6);//sysj\plant.sysj line: 125, column: 3
          S136919=0;
          active[6]=0;
          ends[6]=0;
          tdone[6]=1;
        }
        else {
          active[6]=1;
          ends[6]=1;
          tdone[6]=1;
        }
        break;
      
    }
  }

  public void thread138346(int [] tdone, int [] ends){
        switch(S136916){
      case 0 : 
        active[5]=0;
        ends[5]=0;
        tdone[5]=1;
        break;
      
      case 1 : 
        switch(S136910){
          case 0 : 
            S136910=0;
            if(bottleAtPos1.getprestatus()){//sysj\plant.sysj line: 109, column: 12
              RTbottleAtPos1.setPresent();//sysj\plant.sysj line: 111, column: 5
              currsigs.addElement(RTbottleAtPos1);
              S136910=1;
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            else {
              S136910=1;
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            break;
          
          case 1 : 
            S136910=1;
            S136910=0;
            if(bottleAtPos1.getprestatus()){//sysj\plant.sysj line: 109, column: 12
              RTbottleAtPos1.setPresent();//sysj\plant.sysj line: 111, column: 5
              currsigs.addElement(RTbottleAtPos1);
              S136910=1;
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            else {
              S136910=1;
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread138344(int [] tdone, int [] ends){
        S136852=1;
    if(motorPos5On.getprestatus()){//sysj\plant.sysj line: 92, column: 14
      System.out.println("Conveyor Plant - moving bottle to leave 5");//sysj\plant.sysj line: 93, column: 7
      bottleLeftPos5.setPresent();//sysj\plant.sysj line: 95, column: 8
      currsigs.addElement(bottleLeftPos5);
      active[4]=1;
      ends[4]=1;
      tdone[4]=1;
    }
    else {
      S136852=0;
      active[4]=0;
      ends[4]=0;
      tdone[4]=1;
    }
  }

  public void thread138343(int [] tdone, int [] ends){
        S136840=1;
    if(motorPos1On.getprestatus()){//sysj\plant.sysj line: 83, column: 14
      System.out.println("Conveyor plant - moving bottle to 1");//sysj\plant.sysj line: 84, column: 7
      bottleAtPos1.setPresent();//sysj\plant.sysj line: 86, column: 8
      currsigs.addElement(bottleAtPos1);
      active[3]=1;
      ends[3]=1;
      tdone[3]=1;
    }
    else {
      S136840=0;
      active[3]=0;
      ends[3]=0;
      tdone[3]=1;
    }
  }

  public void thread138341(int [] tdone, int [] ends){
        switch(S136852){
      case 0 : 
        active[4]=0;
        ends[4]=0;
        tdone[4]=1;
        break;
      
      case 1 : 
        if(!motorPos5On.getprestatus() && !motConveyorOnOff.getprestatus()){//sysj\plant.sysj line: 94, column: 13
          S136852=0;
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

  public void thread138340(int [] tdone, int [] ends){
        switch(S136840){
      case 0 : 
        active[3]=0;
        ends[3]=0;
        tdone[3]=1;
        break;
      
      case 1 : 
        if(moveToPos2.getprestatus()){//sysj\plant.sysj line: 85, column: 13
          S136840=0;
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

  public void thread138339(int [] tdone, int [] ends){
        switch(S136908){
      case 0 : 
        active[2]=0;
        ends[2]=0;
        tdone[2]=1;
        break;
      
      case 1 : 
        switch(S136854){
          case 0 : 
            thread138340(tdone,ends);
            thread138341(tdone,ends);
            int biggest138342 = 0;
            if(ends[3]>=biggest138342){
              biggest138342=ends[3];
            }
            if(ends[4]>=biggest138342){
              biggest138342=ends[4];
            }
            if(biggest138342 == 1){
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            //FINXME code
            if(biggest138342 == 0){
              S136854=1;
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            break;
          
          case 1 : 
            S136854=1;
            S136854=0;
            if(motConveyorOnOff.getprestatus()){//sysj\plant.sysj line: 81, column: 12
              thread138343(tdone,ends);
              thread138344(tdone,ends);
              int biggest138345 = 0;
              if(ends[3]>=biggest138345){
                biggest138345=ends[3];
              }
              if(ends[4]>=biggest138345){
                biggest138345=ends[4];
              }
              if(biggest138345 == 1){
                active[2]=1;
                ends[2]=1;
                tdone[2]=1;
              }
              //FINXME code
              if(biggest138345 == 0){
                S136854=1;
                active[2]=1;
                ends[2]=1;
                tdone[2]=1;
              }
            }
            else {
              S136854=1;
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread138337(int [] tdone, int [] ends){
        S137568=1;
    S137548=0;
    if(moveToPos2.getprestatus()){//sysj\plant.sysj line: 366, column: 24
      System.out.println("bottle is now at pos 2");//sysj\plant.sysj line: 366, column: 36
      bottleAtPos2.setPresent();//sysj\plant.sysj line: 366, column: 82
      currsigs.addElement(bottleAtPos2);
      active[23]=1;
      ends[23]=1;
      tdone[23]=1;
    }
    else {
      S137548=1;
      active[23]=1;
      ends[23]=1;
      tdone[23]=1;
    }
  }

  public void thread138336(int [] tdone, int [] ends){
        S137539=1;
    S137519=0;
    if(moveToPos3.getprestatus()){//sysj\plant.sysj line: 364, column: 24
      System.out.println("bottle is now at pos 3");//sysj\plant.sysj line: 364, column: 36
      bottleAtPos3.setPresent();//sysj\plant.sysj line: 364, column: 82
      currsigs.addElement(bottleAtPos3);
      active[22]=1;
      ends[22]=1;
      tdone[22]=1;
    }
    else {
      S137519=1;
      active[22]=1;
      ends[22]=1;
      tdone[22]=1;
    }
  }

  public void thread138335(int [] tdone, int [] ends){
        S137510=1;
    S137490=0;
    if(moveToPos4.getprestatus()){//sysj\plant.sysj line: 362, column: 24
      System.out.println("bottle is now at pos 4");//sysj\plant.sysj line: 362, column: 36
      bottleAtPos4.setPresent();//sysj\plant.sysj line: 362, column: 82
      currsigs.addElement(bottleAtPos4);
      active[21]=1;
      ends[21]=1;
      tdone[21]=1;
    }
    else {
      S137490=1;
      active[21]=1;
      ends[21]=1;
      tdone[21]=1;
    }
  }

  public void thread138334(int [] tdone, int [] ends){
        S137481=1;
    S137459=0;
    if(moveToPos5.getprestatus()){//sysj\plant.sysj line: 353, column: 13
      System.out.println("bottle is now at pos 5");//sysj\plant.sysj line: 354, column: 6
      bottleAtPos5.setPresent();//sysj\plant.sysj line: 355, column: 6
      currsigs.addElement(bottleAtPos5);
      active[20]=1;
      ends[20]=1;
      tdone[20]=1;
    }
    else {
      S137459=1;
      active[20]=1;
      ends[20]=1;
      tdone[20]=1;
    }
  }

  public void thread138333(int [] tdone, int [] ends){
        S137449=1;
    S137409=0;
    if(rotaryTableTrigger.getprestatus()){//sysj\plant.sysj line: 307, column: 12
      System.out.println("table triggered now moving");//sysj\plant.sysj line: 310, column: 5
      if(bottleAtPos4.getprestatus()){//sysj\plant.sysj line: 313, column: 13
        System.out.println("moving bottle at pos 4 to pos 5");//sysj\plant.sysj line: 314, column: 6
        moveToPos5.setPresent();//sysj\plant.sysj line: 315, column: 6
        currsigs.addElement(moveToPos5);
        S137395=0;
        active[19]=1;
        ends[19]=1;
        tdone[19]=1;
      }
      else {
        S137395=0;
        active[19]=1;
        ends[19]=1;
        tdone[19]=1;
      }
    }
    else {
      S137409=1;
      active[19]=1;
      ends[19]=1;
      tdone[19]=1;
    }
  }

  public void thread138332(int [] tdone, int [] ends){
        S137390=1;
    S137368=0;
    active[18]=1;
    ends[18]=1;
    tdone[18]=1;
  }

  public void thread138331(int [] tdone, int [] ends){
        S137358=1;
    S137314=0;
    if(gripperTurnExtend.getprestatus() && !gripperTurnRetract.getprestatus()){//sysj\plant.sysj line: 279, column: 13
      gripperTurnFinalPos.setPresent();//sysj\plant.sysj line: 281, column: 7
      currsigs.addElement(gripperTurnFinalPos);
      active[17]=1;
      ends[17]=1;
      tdone[17]=1;
    }
    else {
      S137314=1;
      if(gripperTurnRetract.getprestatus() && !gripperTurnExtend.getprestatus()){//sysj\plant.sysj line: 284, column: 13
        gripperTurnHomePos.setPresent();//sysj\plant.sysj line: 286, column: 7
        currsigs.addElement(gripperTurnHomePos);
        active[17]=1;
        ends[17]=1;
        tdone[17]=1;
      }
      else {
        S137314=2;
        active[17]=1;
        ends[17]=1;
        tdone[17]=1;
      }
    }
  }

  public void thread138330(int [] tdone, int [] ends){
        S137293=1;
    S137271=0;
    active[16]=1;
    ends[16]=1;
    tdone[16]=1;
  }

  public void thread138329(int [] tdone, int [] ends){
        S137261=1;
    S137233=0;
    gripperZAxisLifted.setPresent();//sysj\plant.sysj line: 256, column: 6
    currsigs.addElement(gripperZAxisLifted);
    active[15]=1;
    ends[15]=1;
    tdone[15]=1;
  }

  public void thread138328(int [] tdone, int [] ends){
        S137220=1;
    S137198=0;
    active[14]=1;
    ends[14]=1;
    tdone[14]=1;
  }

  public void thread138327(int [] tdone, int [] ends){
        S137188=1;
    capcount_thread_13 = 5;//sysj\plant.sysj line: 223, column: 3
    if(capDec_1.getprestatus()){//sysj\plant.sysj line: 225, column: 12
      if(capcount_thread_13 > 0) {//sysj\plant.sysj line: 226, column: 5
        capcount_thread_13 = capcount_thread_13 - 1;//sysj\plant.sysj line: 227, column: 6
      }
      if(refill.getprestatus()){//sysj\plant.sysj line: 229, column: 12
        capcount_thread_13 = 5;//sysj\plant.sysj line: 230, column: 5
        if(capcount_thread_13 == 0){//sysj\plant.sysj line: 233, column: 8
          empty.setPresent();//sysj\plant.sysj line: 234, column: 6
          currsigs.addElement(empty);
          active[13]=1;
          ends[13]=1;
          tdone[13]=1;
        }
        else {
          active[13]=1;
          ends[13]=1;
          tdone[13]=1;
        }
      }
      else {
        if(capcount_thread_13 == 0){//sysj\plant.sysj line: 233, column: 8
          empty.setPresent();//sysj\plant.sysj line: 234, column: 6
          currsigs.addElement(empty);
          active[13]=1;
          ends[13]=1;
          tdone[13]=1;
        }
        else {
          active[13]=1;
          ends[13]=1;
          tdone[13]=1;
        }
      }
    }
    else {
      if(refill.getprestatus()){//sysj\plant.sysj line: 229, column: 12
        capcount_thread_13 = 5;//sysj\plant.sysj line: 230, column: 5
        if(capcount_thread_13 == 0){//sysj\plant.sysj line: 233, column: 8
          empty.setPresent();//sysj\plant.sysj line: 234, column: 6
          currsigs.addElement(empty);
          active[13]=1;
          ends[13]=1;
          tdone[13]=1;
        }
        else {
          active[13]=1;
          ends[13]=1;
          tdone[13]=1;
        }
      }
      else {
        if(capcount_thread_13 == 0){//sysj\plant.sysj line: 233, column: 8
          empty.setPresent();//sysj\plant.sysj line: 234, column: 6
          currsigs.addElement(empty);
          active[13]=1;
          ends[13]=1;
          tdone[13]=1;
        }
        else {
          active[13]=1;
          ends[13]=1;
          tdone[13]=1;
        }
      }
    }
  }

  public void thread138326(int [] tdone, int [] ends){
        S137126=1;
    S137080=0;
    S137062=0;
    active[12]=1;
    ends[12]=1;
    tdone[12]=1;
  }

  public void thread138325(int [] tdone, int [] ends){
        S137058=1;
    S137028=0;
    if(vacOn.getprestatus() && armAtSource.getprestatus()){//sysj\plant.sysj line: 185, column: 12
      if((Integer)(capPos_1.getpreval() == null ? 0 : ((Integer)capPos_1.getpreval()).intValue()) == 1){//sysj\plant.sysj line: 186, column: 8
        capPos_1.setPresent();//sysj\plant.sysj line: 187, column: 6
        currsigs.addElement(capPos_1);
        capPos_1.setValue(0);//sysj\plant.sysj line: 187, column: 6
        WPgripped.setPresent();//sysj\plant.sysj line: 189, column: 7
        currsigs.addElement(WPgripped);
        active[11]=1;
        ends[11]=1;
        tdone[11]=1;
      }
      else {
        S137028=1;
        active[11]=1;
        ends[11]=1;
        tdone[11]=1;
      }
    }
    else {
      S137028=1;
      active[11]=1;
      ends[11]=1;
      tdone[11]=1;
    }
  }

  public void thread138324(int [] tdone, int [] ends){
        S137014=1;
    S136986=0;
    pusherRetracted.setPresent();//sysj\plant.sysj line: 175, column: 5
    currsigs.addElement(pusherRetracted);
    active[10]=1;
    ends[10]=1;
    tdone[10]=1;
  }

  public void thread138323(int [] tdone, int [] ends){
        S136973=1;
    S136945=0;
    armAtDest.setPresent();//sysj\plant.sysj line: 164, column: 5
    currsigs.addElement(armAtDest);
    active[9]=1;
    ends[9]=1;
    tdone[9]=1;
  }

  public void thread138322(int [] tdone, int [] ends){
        S136932=1;
    S136929=0;
    dosUnitEvac.setPresent();//sysj\plant.sysj line: 146, column: 4
    currsigs.addElement(dosUnitEvac);
    active[8]=1;
    ends[8]=1;
    tdone[8]=1;
  }

  public void thread138321(int [] tdone, int [] ends){
        S136924=1;
    S136921=0;
    active[7]=1;
    ends[7]=1;
    tdone[7]=1;
  }

  public void thread138320(int [] tdone, int [] ends){
        S136919=1;
    active[6]=1;
    ends[6]=1;
    tdone[6]=1;
  }

  public void thread138319(int [] tdone, int [] ends){
        S136916=1;
    S136910=0;
    if(bottleAtPos1.getprestatus()){//sysj\plant.sysj line: 109, column: 12
      RTbottleAtPos1.setPresent();//sysj\plant.sysj line: 111, column: 5
      currsigs.addElement(RTbottleAtPos1);
      S136910=1;
      active[5]=1;
      ends[5]=1;
      tdone[5]=1;
    }
    else {
      S136910=1;
      active[5]=1;
      ends[5]=1;
      tdone[5]=1;
    }
  }

  public void thread138317(int [] tdone, int [] ends){
        S136852=1;
    if(motorPos5On.getprestatus()){//sysj\plant.sysj line: 92, column: 14
      System.out.println("Conveyor Plant - moving bottle to leave 5");//sysj\plant.sysj line: 93, column: 7
      bottleLeftPos5.setPresent();//sysj\plant.sysj line: 95, column: 8
      currsigs.addElement(bottleLeftPos5);
      active[4]=1;
      ends[4]=1;
      tdone[4]=1;
    }
    else {
      S136852=0;
      active[4]=0;
      ends[4]=0;
      tdone[4]=1;
    }
  }

  public void thread138316(int [] tdone, int [] ends){
        S136840=1;
    if(motorPos1On.getprestatus()){//sysj\plant.sysj line: 83, column: 14
      System.out.println("Conveyor plant - moving bottle to 1");//sysj\plant.sysj line: 84, column: 7
      bottleAtPos1.setPresent();//sysj\plant.sysj line: 86, column: 8
      currsigs.addElement(bottleAtPos1);
      active[3]=1;
      ends[3]=1;
      tdone[3]=1;
    }
    else {
      S136840=0;
      active[3]=0;
      ends[3]=0;
      tdone[3]=1;
    }
  }

  public void thread138315(int [] tdone, int [] ends){
        S136908=1;
    S136854=0;
    if(motConveyorOnOff.getprestatus()){//sysj\plant.sysj line: 81, column: 12
      thread138316(tdone,ends);
      thread138317(tdone,ends);
      int biggest138318 = 0;
      if(ends[3]>=biggest138318){
        biggest138318=ends[3];
      }
      if(ends[4]>=biggest138318){
        biggest138318=ends[4];
      }
      if(biggest138318 == 1){
        active[2]=1;
        ends[2]=1;
        tdone[2]=1;
      }
      //FINXME code
      if(biggest138318 == 0){
        S136854=1;
        active[2]=1;
        ends[2]=1;
        tdone[2]=1;
      }
    }
    else {
      S136854=1;
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
      switch(S138313){
        case 0 : 
          S138313=0;
          break RUN;
        
        case 1 : 
          S138313=2;
          S138313=2;
          capDec_1.setClear();//sysj\plant.sysj line: 72, column: 2
          capPos_1.setClear();//sysj\plant.sysj line: 73, column: 2
          capPos_1.setPresent();//sysj\plant.sysj line: 74, column: 2
          currsigs.addElement(capPos_1);
          capPos_1.setValue(0);//sysj\plant.sysj line: 74, column: 2
          disablePos5_1.setClear();//sysj\plant.sysj line: 75, column: 2
          thread138315(tdone,ends);
          thread138319(tdone,ends);
          thread138320(tdone,ends);
          thread138321(tdone,ends);
          thread138322(tdone,ends);
          thread138323(tdone,ends);
          thread138324(tdone,ends);
          thread138325(tdone,ends);
          thread138326(tdone,ends);
          thread138327(tdone,ends);
          thread138328(tdone,ends);
          thread138329(tdone,ends);
          thread138330(tdone,ends);
          thread138331(tdone,ends);
          thread138332(tdone,ends);
          thread138333(tdone,ends);
          thread138334(tdone,ends);
          thread138335(tdone,ends);
          thread138336(tdone,ends);
          thread138337(tdone,ends);
          int biggest138338 = 0;
          if(ends[2]>=biggest138338){
            biggest138338=ends[2];
          }
          if(ends[5]>=biggest138338){
            biggest138338=ends[5];
          }
          if(ends[6]>=biggest138338){
            biggest138338=ends[6];
          }
          if(ends[7]>=biggest138338){
            biggest138338=ends[7];
          }
          if(ends[8]>=biggest138338){
            biggest138338=ends[8];
          }
          if(ends[9]>=biggest138338){
            biggest138338=ends[9];
          }
          if(ends[10]>=biggest138338){
            biggest138338=ends[10];
          }
          if(ends[11]>=biggest138338){
            biggest138338=ends[11];
          }
          if(ends[12]>=biggest138338){
            biggest138338=ends[12];
          }
          if(ends[13]>=biggest138338){
            biggest138338=ends[13];
          }
          if(ends[14]>=biggest138338){
            biggest138338=ends[14];
          }
          if(ends[15]>=biggest138338){
            biggest138338=ends[15];
          }
          if(ends[16]>=biggest138338){
            biggest138338=ends[16];
          }
          if(ends[17]>=biggest138338){
            biggest138338=ends[17];
          }
          if(ends[18]>=biggest138338){
            biggest138338=ends[18];
          }
          if(ends[19]>=biggest138338){
            biggest138338=ends[19];
          }
          if(ends[20]>=biggest138338){
            biggest138338=ends[20];
          }
          if(ends[21]>=biggest138338){
            biggest138338=ends[21];
          }
          if(ends[22]>=biggest138338){
            biggest138338=ends[22];
          }
          if(ends[23]>=biggest138338){
            biggest138338=ends[23];
          }
          if(biggest138338 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
        
        case 2 : 
          capDec_1.setClear();//sysj\plant.sysj line: 72, column: 2
          capPos_1.setClear();//sysj\plant.sysj line: 73, column: 2
          disablePos5_1.setClear();//sysj\plant.sysj line: 75, column: 2
          thread138339(tdone,ends);
          thread138346(tdone,ends);
          thread138347(tdone,ends);
          thread138348(tdone,ends);
          thread138349(tdone,ends);
          thread138350(tdone,ends);
          thread138351(tdone,ends);
          thread138352(tdone,ends);
          thread138353(tdone,ends);
          thread138354(tdone,ends);
          thread138355(tdone,ends);
          thread138356(tdone,ends);
          thread138357(tdone,ends);
          thread138358(tdone,ends);
          thread138359(tdone,ends);
          thread138360(tdone,ends);
          thread138361(tdone,ends);
          thread138362(tdone,ends);
          thread138363(tdone,ends);
          thread138364(tdone,ends);
          int biggest138365 = 0;
          if(ends[2]>=biggest138365){
            biggest138365=ends[2];
          }
          if(ends[5]>=biggest138365){
            biggest138365=ends[5];
          }
          if(ends[6]>=biggest138365){
            biggest138365=ends[6];
          }
          if(ends[7]>=biggest138365){
            biggest138365=ends[7];
          }
          if(ends[8]>=biggest138365){
            biggest138365=ends[8];
          }
          if(ends[9]>=biggest138365){
            biggest138365=ends[9];
          }
          if(ends[10]>=biggest138365){
            biggest138365=ends[10];
          }
          if(ends[11]>=biggest138365){
            biggest138365=ends[11];
          }
          if(ends[12]>=biggest138365){
            biggest138365=ends[12];
          }
          if(ends[13]>=biggest138365){
            biggest138365=ends[13];
          }
          if(ends[14]>=biggest138365){
            biggest138365=ends[14];
          }
          if(ends[15]>=biggest138365){
            biggest138365=ends[15];
          }
          if(ends[16]>=biggest138365){
            biggest138365=ends[16];
          }
          if(ends[17]>=biggest138365){
            biggest138365=ends[17];
          }
          if(ends[18]>=biggest138365){
            biggest138365=ends[18];
          }
          if(ends[19]>=biggest138365){
            biggest138365=ends[19];
          }
          if(ends[20]>=biggest138365){
            biggest138365=ends[20];
          }
          if(ends[21]>=biggest138365){
            biggest138365=ends[21];
          }
          if(ends[22]>=biggest138365){
            biggest138365=ends[22];
          }
          if(ends[23]>=biggest138365){
            biggest138365=ends[23];
          }
          if(biggest138365 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
          //FINXME code
          if(biggest138365 == 0){
            S138313=0;
            active[1]=0;
            ends[1]=0;
            S138313=0;
            break RUN;
          }
        
      }
    }
  }

  public void init(){
    char [] active1 = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
    char [] paused1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    char [] suspended1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
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
      dosUnitFilled.setpreclear();
      selectedCanister.setpreclear();
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
      dosUnitFilled.sethook();
      dosUnitFilled.setClear();
      selectedCanister.sethook();
      selectedCanister.setClear();
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
