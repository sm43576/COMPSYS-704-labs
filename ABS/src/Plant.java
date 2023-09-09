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
  private Signal canister_1;
  private Signal percent_1;
  private int capcount_thread_15;//sysj\plant.sysj line: 240, column: 3
  private int S44482 = 1;
  private int S42809 = 1;
  private int S42755 = 1;
  private int S42741 = 1;
  private int S42753 = 1;
  private int S42817 = 1;
  private int S42811 = 1;
  private int S42967 = 1;
  private int S42827 = 1;
  private int S42821 = 1;
  private int S42835 = 1;
  private int S42829 = 1;
  private int S42855 = 1;
  private int S42841 = 1;
  private int S42965 = 1;
  private int S42891 = 1;
  private int S43008 = 1;
  private int S42980 = 1;
  private int S43049 = 1;
  private int S43021 = 1;
  private int S43093 = 1;
  private int S43063 = 1;
  private int S43161 = 1;
  private int S43115 = 1;
  private int S43097 = 1;
  private int S43223 = 1;
  private int S43255 = 1;
  private int S43233 = 1;
  private int S43296 = 1;
  private int S43268 = 1;
  private int S43328 = 1;
  private int S43306 = 1;
  private int S43393 = 1;
  private int S43349 = 1;
  private int S43425 = 1;
  private int S43403 = 1;
  private int S43484 = 1;
  private int S43444 = 1;
  private int S43430 = 1;
  private int S43516 = 1;
  private int S43494 = 1;
  private int S43545 = 1;
  private int S43525 = 1;
  private int S43574 = 1;
  private int S43554 = 1;
  private int S43603 = 1;
  private int S43583 = 1;
  
  private int[] ends = new int[26];
  private int[] tdone = new int[26];
  
  public void thread44539(int [] tdone, int [] ends){
        switch(S43603){
      case 0 : 
        active[25]=0;
        ends[25]=0;
        tdone[25]=1;
        break;
      
      case 1 : 
        switch(S43583){
          case 0 : 
            bottleAtPos2.setPresent();//sysj\plant.sysj line: 383, column: 82
            currsigs.addElement(bottleAtPos2);
            active[25]=1;
            ends[25]=1;
            tdone[25]=1;
            break;
          
          case 1 : 
            S43583=1;
            S43583=0;
            if(moveToPos2.getprestatus()){//sysj\plant.sysj line: 383, column: 24
              System.out.println("bottle is now at pos 2");//sysj\plant.sysj line: 383, column: 36
              bottleAtPos2.setPresent();//sysj\plant.sysj line: 383, column: 82
              currsigs.addElement(bottleAtPos2);
              active[25]=1;
              ends[25]=1;
              tdone[25]=1;
            }
            else {
              S43583=1;
              active[25]=1;
              ends[25]=1;
              tdone[25]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread44538(int [] tdone, int [] ends){
        switch(S43574){
      case 0 : 
        active[24]=0;
        ends[24]=0;
        tdone[24]=1;
        break;
      
      case 1 : 
        switch(S43554){
          case 0 : 
            bottleAtPos3.setPresent();//sysj\plant.sysj line: 381, column: 82
            currsigs.addElement(bottleAtPos3);
            active[24]=1;
            ends[24]=1;
            tdone[24]=1;
            break;
          
          case 1 : 
            S43554=1;
            S43554=0;
            if(moveToPos3.getprestatus()){//sysj\plant.sysj line: 381, column: 24
              System.out.println("bottle is now at pos 3");//sysj\plant.sysj line: 381, column: 36
              bottleAtPos3.setPresent();//sysj\plant.sysj line: 381, column: 82
              currsigs.addElement(bottleAtPos3);
              active[24]=1;
              ends[24]=1;
              tdone[24]=1;
            }
            else {
              S43554=1;
              active[24]=1;
              ends[24]=1;
              tdone[24]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread44537(int [] tdone, int [] ends){
        switch(S43545){
      case 0 : 
        active[23]=0;
        ends[23]=0;
        tdone[23]=1;
        break;
      
      case 1 : 
        switch(S43525){
          case 0 : 
            bottleAtPos4.setPresent();//sysj\plant.sysj line: 379, column: 82
            currsigs.addElement(bottleAtPos4);
            active[23]=1;
            ends[23]=1;
            tdone[23]=1;
            break;
          
          case 1 : 
            S43525=1;
            S43525=0;
            if(moveToPos4.getprestatus()){//sysj\plant.sysj line: 379, column: 24
              System.out.println("bottle is now at pos 4");//sysj\plant.sysj line: 379, column: 36
              bottleAtPos4.setPresent();//sysj\plant.sysj line: 379, column: 82
              currsigs.addElement(bottleAtPos4);
              active[23]=1;
              ends[23]=1;
              tdone[23]=1;
            }
            else {
              S43525=1;
              active[23]=1;
              ends[23]=1;
              tdone[23]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread44536(int [] tdone, int [] ends){
        switch(S43516){
      case 0 : 
        active[22]=0;
        ends[22]=0;
        tdone[22]=1;
        break;
      
      case 1 : 
        switch(S43494){
          case 0 : 
            if(bottleLeftPos5.getprestatus()){//sysj\plant.sysj line: 369, column: 10
              S43494=1;
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
            S43494=1;
            S43494=0;
            if(moveToPos5.getprestatus()){//sysj\plant.sysj line: 370, column: 13
              System.out.println("bottle is now at pos 5");//sysj\plant.sysj line: 371, column: 6
              bottleAtPos5.setPresent();//sysj\plant.sysj line: 372, column: 6
              currsigs.addElement(bottleAtPos5);
              active[22]=1;
              ends[22]=1;
              tdone[22]=1;
            }
            else {
              S43494=1;
              active[22]=1;
              ends[22]=1;
              tdone[22]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread44535(int [] tdone, int [] ends){
        switch(S43484){
      case 0 : 
        active[21]=0;
        ends[21]=0;
        tdone[21]=1;
        break;
      
      case 1 : 
        switch(S43444){
          case 0 : 
            switch(S43430){
              case 0 : 
                S43430=0;
                if(bottleAtPos3.getprestatus()){//sysj\plant.sysj line: 337, column: 13
                  System.out.println("moving bottle at pos 3 to pos 4");//sysj\plant.sysj line: 338, column: 6
                  moveToPos4.setPresent();//sysj\plant.sysj line: 339, column: 6
                  currsigs.addElement(moveToPos4);
                  S43430=1;
                  active[21]=1;
                  ends[21]=1;
                  tdone[21]=1;
                }
                else {
                  S43430=1;
                  active[21]=1;
                  ends[21]=1;
                  tdone[21]=1;
                }
                break;
              
              case 1 : 
                S43430=1;
                if(bottleAtPos2.getprestatus()){//sysj\plant.sysj line: 344, column: 13
                  System.out.println("moving bottle at pos 2 to pos 3");//sysj\plant.sysj line: 345, column: 6
                  moveToPos3.setPresent();//sysj\plant.sysj line: 346, column: 6
                  currsigs.addElement(moveToPos3);
                  S43430=2;
                  active[21]=1;
                  ends[21]=1;
                  tdone[21]=1;
                }
                else {
                  S43430=2;
                  active[21]=1;
                  ends[21]=1;
                  tdone[21]=1;
                }
                break;
              
              case 2 : 
                S43430=2;
                if(bottleAtPos1.getprestatus()){//sysj\plant.sysj line: 350, column: 13
                  System.out.println("moving bottle at pos 1 to pos 2");//sysj\plant.sysj line: 351, column: 6
                  moveToPos2.setPresent();//sysj\plant.sysj line: 352, column: 6
                  currsigs.addElement(moveToPos2);
                  S43430=3;
                  active[21]=1;
                  ends[21]=1;
                  tdone[21]=1;
                }
                else {
                  S43430=3;
                  active[21]=1;
                  ends[21]=1;
                  tdone[21]=1;
                }
                break;
              
              case 3 : 
                S43430=3;
                System.out.println("Table has been aligned");//sysj\plant.sysj line: 356, column: 5
                tableAlignedWithSensor.setPresent();//sysj\plant.sysj line: 357, column: 5
                currsigs.addElement(tableAlignedWithSensor);
                S43430=4;
                active[21]=1;
                ends[21]=1;
                tdone[21]=1;
                break;
              
              case 4 : 
                S43430=4;
                S43444=1;
                active[21]=1;
                ends[21]=1;
                tdone[21]=1;
                break;
              
            }
            break;
          
          case 1 : 
            S43444=1;
            S43444=0;
            if(rotaryTableTrigger.getprestatus()){//sysj\plant.sysj line: 324, column: 12
              System.out.println("table triggered now moving");//sysj\plant.sysj line: 327, column: 5
              if(bottleAtPos4.getprestatus()){//sysj\plant.sysj line: 330, column: 13
                System.out.println("moving bottle at pos 4 to pos 5");//sysj\plant.sysj line: 331, column: 6
                moveToPos5.setPresent();//sysj\plant.sysj line: 332, column: 6
                currsigs.addElement(moveToPos5);
                S43430=0;
                active[21]=1;
                ends[21]=1;
                tdone[21]=1;
              }
              else {
                S43430=0;
                active[21]=1;
                ends[21]=1;
                tdone[21]=1;
              }
            }
            else {
              S43444=1;
              active[21]=1;
              ends[21]=1;
              tdone[21]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread44534(int [] tdone, int [] ends){
        switch(S43425){
      case 0 : 
        active[20]=0;
        ends[20]=0;
        tdone[20]=1;
        break;
      
      case 1 : 
        switch(S43403){
          case 0 : 
            if(cylClampBottleExtend.getprestatus()){//sysj\plant.sysj line: 313, column: 11
              S43403=1;
              cylClampedBottle.setPresent();//sysj\plant.sysj line: 315, column: 6
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
            if(!cylClampBottleExtend.getprestatus()){//sysj\plant.sysj line: 314, column: 12
              S43403=2;
              active[20]=1;
              ends[20]=1;
              tdone[20]=1;
            }
            else {
              cylClampedBottle.setPresent();//sysj\plant.sysj line: 315, column: 6
              currsigs.addElement(cylClampedBottle);
              active[20]=1;
              ends[20]=1;
              tdone[20]=1;
            }
            break;
          
          case 2 : 
            S43403=2;
            S43403=0;
            active[20]=1;
            ends[20]=1;
            tdone[20]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread44533(int [] tdone, int [] ends){
        switch(S43393){
      case 0 : 
        active[19]=0;
        ends[19]=0;
        tdone[19]=1;
        break;
      
      case 1 : 
        switch(S43349){
          case 0 : 
            if(gripperTurnRetract.getprestatus()){//sysj\plant.sysj line: 297, column: 13
              S43349=1;
              if(gripperTurnRetract.getprestatus() && !gripperTurnExtend.getprestatus()){//sysj\plant.sysj line: 301, column: 13
                gripperTurnHomePos.setPresent();//sysj\plant.sysj line: 303, column: 7
                currsigs.addElement(gripperTurnHomePos);
                active[19]=1;
                ends[19]=1;
                tdone[19]=1;
              }
              else {
                S43349=2;
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
            if(gripperTurnExtend.getprestatus()){//sysj\plant.sysj line: 302, column: 13
              S43349=2;
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
            S43349=2;
            S43349=0;
            if(gripperTurnExtend.getprestatus() && !gripperTurnRetract.getprestatus()){//sysj\plant.sysj line: 296, column: 13
              gripperTurnFinalPos.setPresent();//sysj\plant.sysj line: 298, column: 7
              currsigs.addElement(gripperTurnFinalPos);
              active[19]=1;
              ends[19]=1;
              tdone[19]=1;
            }
            else {
              S43349=1;
              if(gripperTurnRetract.getprestatus() && !gripperTurnExtend.getprestatus()){//sysj\plant.sysj line: 301, column: 13
                gripperTurnHomePos.setPresent();//sysj\plant.sysj line: 303, column: 7
                currsigs.addElement(gripperTurnHomePos);
                active[19]=1;
                ends[19]=1;
                tdone[19]=1;
              }
              else {
                S43349=2;
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

  public void thread44532(int [] tdone, int [] ends){
        switch(S43328){
      case 0 : 
        active[18]=0;
        ends[18]=0;
        tdone[18]=1;
        break;
      
      case 1 : 
        switch(S43306){
          case 0 : 
            if(capGripperPos5Extend.getprestatus()){//sysj\plant.sysj line: 285, column: 11
              S43306=1;
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
          
          case 1 : 
            if(!capGripperPos5Extend.getprestatus()){//sysj\plant.sysj line: 286, column: 12
              S43306=2;
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
          
          case 2 : 
            S43306=2;
            S43306=0;
            active[18]=1;
            ends[18]=1;
            tdone[18]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread44531(int [] tdone, int [] ends){
        switch(S43296){
      case 0 : 
        active[17]=0;
        ends[17]=0;
        tdone[17]=1;
        break;
      
      case 1 : 
        switch(S43268){
          case 0 : 
            if(cylPos5ZAxisExtend.getprestatus()){//sysj\plant.sysj line: 272, column: 11
              S43268=1;
              gripperZAxisLowered.setPresent();//sysj\plant.sysj line: 276, column: 6
              currsigs.addElement(gripperZAxisLowered);
              active[17]=1;
              ends[17]=1;
              tdone[17]=1;
            }
            else {
              gripperZAxisLifted.setPresent();//sysj\plant.sysj line: 273, column: 6
              currsigs.addElement(gripperZAxisLifted);
              active[17]=1;
              ends[17]=1;
              tdone[17]=1;
            }
            break;
          
          case 1 : 
            if(!cylPos5ZAxisExtend.getprestatus()){//sysj\plant.sysj line: 275, column: 12
              S43268=2;
              active[17]=1;
              ends[17]=1;
              tdone[17]=1;
            }
            else {
              gripperZAxisLowered.setPresent();//sysj\plant.sysj line: 276, column: 6
              currsigs.addElement(gripperZAxisLowered);
              active[17]=1;
              ends[17]=1;
              tdone[17]=1;
            }
            break;
          
          case 2 : 
            S43268=2;
            S43268=0;
            gripperZAxisLifted.setPresent();//sysj\plant.sysj line: 273, column: 6
            currsigs.addElement(gripperZAxisLifted);
            active[17]=1;
            ends[17]=1;
            tdone[17]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread44530(int [] tdone, int [] ends){
        switch(S43255){
      case 0 : 
        active[16]=0;
        ends[16]=0;
        tdone[16]=1;
        break;
      
      case 1 : 
        switch(S43233){
          case 0 : 
            if(moveToPos4.getprestatus()){//sysj\plant.sysj line: 261, column: 11
              S43233=1;
              bottleAtPos4.setPresent();//sysj\plant.sysj line: 263, column: 6
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
            if(moveToPos5.getprestatus()){//sysj\plant.sysj line: 262, column: 12
              S43233=2;
              active[16]=1;
              ends[16]=1;
              tdone[16]=1;
            }
            else {
              bottleAtPos4.setPresent();//sysj\plant.sysj line: 263, column: 6
              currsigs.addElement(bottleAtPos4);
              active[16]=1;
              ends[16]=1;
              tdone[16]=1;
            }
            break;
          
          case 2 : 
            S43233=2;
            S43233=0;
            active[16]=1;
            ends[16]=1;
            tdone[16]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread44529(int [] tdone, int [] ends){
        switch(S43223){
      case 0 : 
        active[15]=0;
        ends[15]=0;
        tdone[15]=1;
        break;
      
      case 1 : 
        if(capDec_1.getprestatus()){//sysj\plant.sysj line: 242, column: 12
          if(capcount_thread_15 > 0) {//sysj\plant.sysj line: 243, column: 5
            capcount_thread_15 = capcount_thread_15 - 1;//sysj\plant.sysj line: 244, column: 6
          }
          if(refill.getprestatus()){//sysj\plant.sysj line: 246, column: 12
            capcount_thread_15 = 5;//sysj\plant.sysj line: 247, column: 5
            if(capcount_thread_15 == 0){//sysj\plant.sysj line: 250, column: 8
              empty.setPresent();//sysj\plant.sysj line: 251, column: 6
              currsigs.addElement(empty);
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
            if(capcount_thread_15 == 0){//sysj\plant.sysj line: 250, column: 8
              empty.setPresent();//sysj\plant.sysj line: 251, column: 6
              currsigs.addElement(empty);
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
          if(refill.getprestatus()){//sysj\plant.sysj line: 246, column: 12
            capcount_thread_15 = 5;//sysj\plant.sysj line: 247, column: 5
            if(capcount_thread_15 == 0){//sysj\plant.sysj line: 250, column: 8
              empty.setPresent();//sysj\plant.sysj line: 251, column: 6
              currsigs.addElement(empty);
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
            if(capcount_thread_15 == 0){//sysj\plant.sysj line: 250, column: 8
              empty.setPresent();//sysj\plant.sysj line: 251, column: 6
              currsigs.addElement(empty);
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

  public void thread44528(int [] tdone, int [] ends){
        switch(S43161){
      case 0 : 
        active[14]=0;
        ends[14]=0;
        tdone[14]=1;
        break;
      
      case 1 : 
        switch(S43115){
          case 0 : 
            if(empty.getprestatus()){//sysj\plant.sysj line: 225, column: 10
              S43115=1;
              active[14]=1;
              ends[14]=1;
              tdone[14]=1;
            }
            else {
              switch(S43097){
                case 0 : 
                  if(pusherRetracted.getprestatus()){//sysj\plant.sysj line: 227, column: 13
                    S43097=1;
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
                  if(pusherExtended.getprestatus()){//sysj\plant.sysj line: 228, column: 13
                    capPos_1.setPresent();//sysj\plant.sysj line: 230, column: 7
                    currsigs.addElement(capPos_1);
                    capPos_1.setValue(1);//sysj\plant.sysj line: 230, column: 7
                    S43097=2;
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
                  if(pusherRetracted.getprestatus()){//sysj\plant.sysj line: 231, column: 13
                    capDec_1.setPresent();//sysj\plant.sysj line: 232, column: 7
                    currsigs.addElement(capDec_1);
                    S43097=0;
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
                
              }
            }
            break;
          
          case 1 : 
            if(refill.getprestatus()){//sysj\plant.sysj line: 235, column: 10
              S43115=0;
              S43097=0;
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
          
        }
        break;
      
    }
  }

  public void thread44527(int [] tdone, int [] ends){
        switch(S43093){
      case 0 : 
        active[13]=0;
        ends[13]=0;
        tdone[13]=1;
        break;
      
      case 1 : 
        switch(S43063){
          case 0 : 
            if(!vacOn.getprestatus()){//sysj\plant.sysj line: 205, column: 12
              if(armAtSource.getprestatus()){//sysj\plant.sysj line: 208, column: 14
                capPos_1.setPresent();//sysj\plant.sysj line: 209, column: 7
                currsigs.addElement(capPos_1);
                capPos_1.setValue(1);//sysj\plant.sysj line: 209, column: 7
                S43063=1;
                active[13]=1;
                ends[13]=1;
                tdone[13]=1;
              }
              else {
                S43063=1;
                active[13]=1;
                ends[13]=1;
                tdone[13]=1;
              }
            }
            else {
              WPgripped.setPresent();//sysj\plant.sysj line: 206, column: 7
              currsigs.addElement(WPgripped);
              active[13]=1;
              ends[13]=1;
              tdone[13]=1;
            }
            break;
          
          case 1 : 
            S43063=1;
            S43063=0;
            if(vacOn.getprestatus() && armAtSource.getprestatus()){//sysj\plant.sysj line: 202, column: 12
              if((Integer)(capPos_1.getpreval() == null ? 0 : ((Integer)capPos_1.getpreval()).intValue()) == 1){//sysj\plant.sysj line: 203, column: 8
                capPos_1.setPresent();//sysj\plant.sysj line: 204, column: 6
                currsigs.addElement(capPos_1);
                capPos_1.setValue(0);//sysj\plant.sysj line: 204, column: 6
                WPgripped.setPresent();//sysj\plant.sysj line: 206, column: 7
                currsigs.addElement(WPgripped);
                active[13]=1;
                ends[13]=1;
                tdone[13]=1;
              }
              else {
                S43063=1;
                active[13]=1;
                ends[13]=1;
                tdone[13]=1;
              }
            }
            else {
              S43063=1;
              active[13]=1;
              ends[13]=1;
              tdone[13]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread44526(int [] tdone, int [] ends){
        switch(S43049){
      case 0 : 
        active[12]=0;
        ends[12]=0;
        tdone[12]=1;
        break;
      
      case 1 : 
        switch(S43021){
          case 0 : 
            if(pusherExtend.getprestatus()){//sysj\plant.sysj line: 191, column: 10
              S43021=1;
              pusherExtended.setPresent();//sysj\plant.sysj line: 195, column: 5
              currsigs.addElement(pusherExtended);
              active[12]=1;
              ends[12]=1;
              tdone[12]=1;
            }
            else {
              pusherRetracted.setPresent();//sysj\plant.sysj line: 192, column: 5
              currsigs.addElement(pusherRetracted);
              active[12]=1;
              ends[12]=1;
              tdone[12]=1;
            }
            break;
          
          case 1 : 
            if(!pusherExtend.getprestatus()){//sysj\plant.sysj line: 194, column: 10
              S43021=0;
              pusherRetracted.setPresent();//sysj\plant.sysj line: 192, column: 5
              currsigs.addElement(pusherRetracted);
              active[12]=1;
              ends[12]=1;
              tdone[12]=1;
            }
            else {
              pusherExtended.setPresent();//sysj\plant.sysj line: 195, column: 5
              currsigs.addElement(pusherExtended);
              active[12]=1;
              ends[12]=1;
              tdone[12]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread44525(int [] tdone, int [] ends){
        switch(S43008){
      case 0 : 
        active[11]=0;
        ends[11]=0;
        tdone[11]=1;
        break;
      
      case 1 : 
        switch(S42980){
          case 0 : 
            if(armSource.getprestatus()){//sysj\plant.sysj line: 180, column: 10
              S42980=1;
              armAtSource.setPresent();//sysj\plant.sysj line: 184, column: 5
              currsigs.addElement(armAtSource);
              active[11]=1;
              ends[11]=1;
              tdone[11]=1;
            }
            else {
              armAtDest.setPresent();//sysj\plant.sysj line: 181, column: 5
              currsigs.addElement(armAtDest);
              active[11]=1;
              ends[11]=1;
              tdone[11]=1;
            }
            break;
          
          case 1 : 
            if(armDest.getprestatus()){//sysj\plant.sysj line: 183, column: 10
              S42980=0;
              armAtDest.setPresent();//sysj\plant.sysj line: 181, column: 5
              currsigs.addElement(armAtDest);
              active[11]=1;
              ends[11]=1;
              tdone[11]=1;
            }
            else {
              armAtSource.setPresent();//sysj\plant.sysj line: 184, column: 5
              currsigs.addElement(armAtSource);
              active[11]=1;
              ends[11]=1;
              tdone[11]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread44523(int [] tdone, int [] ends){
        switch(S42965){
      case 0 : 
        active[10]=0;
        ends[10]=0;
        tdone[10]=1;
        break;
      
      case 1 : 
        switch(S42891){
          case 0 : 
            if(dosUnitValveRetract.getprestatus()){//sysj\plant.sysj line: 157, column: 13
              S42891=1;
              if(dosUnitValveRetract.getprestatus() && !dosUnitValveExtend.getprestatus()){//sysj\plant.sysj line: 161, column: 13
                System.out.println("FillerPlant: Filling with canister " + (canister_1.getpreval() == null ? 0 : ((Integer)canister_1.getpreval()).intValue()) + " Percent: " + (percent_1.getpreval() == null ? 0 : ((Integer)percent_1.getpreval()).intValue()));//sysj\plant.sysj line: 162, column: 6
                dosUnitFilled.setPresent();//sysj\plant.sysj line: 164, column: 7
                currsigs.addElement(dosUnitFilled);
                active[10]=1;
                ends[10]=1;
                tdone[10]=1;
              }
              else {
                S42891=2;
                active[10]=1;
                ends[10]=1;
                tdone[10]=1;
              }
            }
            else {
              dosUnitEvac.setPresent();//sysj\plant.sysj line: 158, column: 7
              currsigs.addElement(dosUnitEvac);
              active[10]=1;
              ends[10]=1;
              tdone[10]=1;
            }
            break;
          
          case 1 : 
            if(dosUnitValveExtend.getprestatus()){//sysj\plant.sysj line: 163, column: 13
              S42891=2;
              active[10]=1;
              ends[10]=1;
              tdone[10]=1;
            }
            else {
              dosUnitFilled.setPresent();//sysj\plant.sysj line: 164, column: 7
              currsigs.addElement(dosUnitFilled);
              active[10]=1;
              ends[10]=1;
              tdone[10]=1;
            }
            break;
          
          case 2 : 
            S42891=2;
            S42891=0;
            if(dosUnitValveExtend.getprestatus() && !dosUnitValveRetract.getprestatus()){//sysj\plant.sysj line: 156, column: 13
              dosUnitEvac.setPresent();//sysj\plant.sysj line: 158, column: 7
              currsigs.addElement(dosUnitEvac);
              active[10]=1;
              ends[10]=1;
              tdone[10]=1;
            }
            else {
              S42891=1;
              if(dosUnitValveRetract.getprestatus() && !dosUnitValveExtend.getprestatus()){//sysj\plant.sysj line: 161, column: 13
                System.out.println("FillerPlant: Filling with canister " + (canister_1.getpreval() == null ? 0 : ((Integer)canister_1.getpreval()).intValue()) + " Percent: " + (percent_1.getpreval() == null ? 0 : ((Integer)percent_1.getpreval()).intValue()));//sysj\plant.sysj line: 162, column: 6
                dosUnitFilled.setPresent();//sysj\plant.sysj line: 164, column: 7
                currsigs.addElement(dosUnitFilled);
                active[10]=1;
                ends[10]=1;
                tdone[10]=1;
              }
              else {
                S42891=2;
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

  public void thread44522(int [] tdone, int [] ends){
        switch(S42855){
      case 0 : 
        active[9]=0;
        ends[9]=0;
        tdone[9]=1;
        break;
      
      case 1 : 
        switch(S42841){
          case 0 : 
            if(!valveInjectorOnOff.getprestatus()){//sysj\plant.sysj line: 145, column: 12
              S42841=1;
              active[9]=1;
              ends[9]=1;
              tdone[9]=1;
            }
            else {
              valveInjectorActive.setPresent();//sysj\plant.sysj line: 146, column: 7
              currsigs.addElement(valveInjectorActive);
              active[9]=1;
              ends[9]=1;
              tdone[9]=1;
            }
            break;
          
          case 1 : 
            S42841=1;
            S42841=0;
            if(valveInjectorOnOff.getprestatus()){//sysj\plant.sysj line: 144, column: 13
              valveInjectorActive.setPresent();//sysj\plant.sysj line: 146, column: 7
              currsigs.addElement(valveInjectorActive);
              active[9]=1;
              ends[9]=1;
              tdone[9]=1;
            }
            else {
              S42841=1;
              active[9]=1;
              ends[9]=1;
              tdone[9]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread44521(int [] tdone, int [] ends){
        switch(S42835){
      case 0 : 
        active[8]=0;
        ends[8]=0;
        tdone[8]=1;
        break;
      
      case 1 : 
        switch(S42829){
          case 0 : 
            if(selectPercentage.getprestatus()){//sysj\plant.sysj line: 135, column: 11
              percent_1.setPresent();//sysj\plant.sysj line: 136, column: 5
              currsigs.addElement(percent_1);
              percent_1.setValue((selectPercentage.getpreval() == null ? null : ((Integer)selectPercentage.getpreval())));//sysj\plant.sysj line: 136, column: 5
              selectedPercentage.setPresent();//sysj\plant.sysj line: 137, column: 5
              currsigs.addElement(selectedPercentage);
              selectedPercentage.setValue((selectPercentage.getpreval() == null ? null : ((Integer)selectPercentage.getpreval())));//sysj\plant.sysj line: 137, column: 5
              S42829=1;
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
            S42829=1;
            S42829=0;
            active[8]=1;
            ends[8]=1;
            tdone[8]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread44520(int [] tdone, int [] ends){
        switch(S42827){
      case 0 : 
        active[7]=0;
        ends[7]=0;
        tdone[7]=1;
        break;
      
      case 1 : 
        switch(S42821){
          case 0 : 
            if(selectCanister.getprestatus()){//sysj\plant.sysj line: 125, column: 11
              canister_1.setPresent();//sysj\plant.sysj line: 126, column: 5
              currsigs.addElement(canister_1);
              canister_1.setValue((selectCanister.getpreval() == null ? null : ((Integer)selectCanister.getpreval())));//sysj\plant.sysj line: 126, column: 5
              selectedCanister.setPresent();//sysj\plant.sysj line: 127, column: 5
              currsigs.addElement(selectedCanister);
              selectedCanister.setValue((selectCanister.getpreval() == null ? null : ((Integer)selectCanister.getpreval())));//sysj\plant.sysj line: 127, column: 5
              S42821=1;
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
            S42821=1;
            S42821=0;
            active[7]=1;
            ends[7]=1;
            tdone[7]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread44519(int [] tdone, int [] ends){
        switch(S42967){
      case 0 : 
        active[6]=0;
        ends[6]=0;
        tdone[6]=1;
        break;
      
      case 1 : 
        canister_1.setClear();//sysj\plant.sysj line: 120, column: 3
        percent_1.setClear();//sysj\plant.sysj line: 121, column: 3
        thread44520(tdone,ends);
        thread44521(tdone,ends);
        thread44522(tdone,ends);
        thread44523(tdone,ends);
        int biggest44524 = 0;
        if(ends[7]>=biggest44524){
          biggest44524=ends[7];
        }
        if(ends[8]>=biggest44524){
          biggest44524=ends[8];
        }
        if(ends[9]>=biggest44524){
          biggest44524=ends[9];
        }
        if(ends[10]>=biggest44524){
          biggest44524=ends[10];
        }
        if(biggest44524 == 1){
          active[6]=1;
          ends[6]=1;
          tdone[6]=1;
        }
        //FINXME code
        if(biggest44524 == 0){
          S42967=0;
          active[6]=0;
          ends[6]=0;
          tdone[6]=1;
        }
        break;
      
    }
  }

  public void thread44518(int [] tdone, int [] ends){
        switch(S42817){
      case 0 : 
        active[5]=0;
        ends[5]=0;
        tdone[5]=1;
        break;
      
      case 1 : 
        switch(S42811){
          case 0 : 
            S42811=0;
            if(bottleAtPos1.getprestatus()){//sysj\plant.sysj line: 107, column: 12
              RTbottleAtPos1.setPresent();//sysj\plant.sysj line: 109, column: 5
              currsigs.addElement(RTbottleAtPos1);
              S42811=1;
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            else {
              S42811=1;
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            break;
          
          case 1 : 
            S42811=1;
            S42811=0;
            if(bottleAtPos1.getprestatus()){//sysj\plant.sysj line: 107, column: 12
              RTbottleAtPos1.setPresent();//sysj\plant.sysj line: 109, column: 5
              currsigs.addElement(RTbottleAtPos1);
              S42811=1;
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            else {
              S42811=1;
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread44516(int [] tdone, int [] ends){
        S42753=1;
    if(motorPos5On.getprestatus()){//sysj\plant.sysj line: 90, column: 14
      System.out.println("Conveyor Plant - moving bottle to leave 5");//sysj\plant.sysj line: 91, column: 7
      bottleLeftPos5.setPresent();//sysj\plant.sysj line: 93, column: 8
      currsigs.addElement(bottleLeftPos5);
      active[4]=1;
      ends[4]=1;
      tdone[4]=1;
    }
    else {
      S42753=0;
      active[4]=0;
      ends[4]=0;
      tdone[4]=1;
    }
  }

  public void thread44515(int [] tdone, int [] ends){
        S42741=1;
    if(motorPos1On.getprestatus()){//sysj\plant.sysj line: 81, column: 14
      System.out.println("Conveyor plant - moving bottle to 1");//sysj\plant.sysj line: 82, column: 7
      bottleAtPos1.setPresent();//sysj\plant.sysj line: 84, column: 8
      currsigs.addElement(bottleAtPos1);
      active[3]=1;
      ends[3]=1;
      tdone[3]=1;
    }
    else {
      S42741=0;
      active[3]=0;
      ends[3]=0;
      tdone[3]=1;
    }
  }

  public void thread44513(int [] tdone, int [] ends){
        switch(S42753){
      case 0 : 
        active[4]=0;
        ends[4]=0;
        tdone[4]=1;
        break;
      
      case 1 : 
        if(!motorPos5On.getprestatus() && !motConveyorOnOff.getprestatus()){//sysj\plant.sysj line: 92, column: 13
          S42753=0;
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

  public void thread44512(int [] tdone, int [] ends){
        switch(S42741){
      case 0 : 
        active[3]=0;
        ends[3]=0;
        tdone[3]=1;
        break;
      
      case 1 : 
        if(moveToPos2.getprestatus()){//sysj\plant.sysj line: 83, column: 13
          S42741=0;
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

  public void thread44511(int [] tdone, int [] ends){
        switch(S42809){
      case 0 : 
        active[2]=0;
        ends[2]=0;
        tdone[2]=1;
        break;
      
      case 1 : 
        switch(S42755){
          case 0 : 
            thread44512(tdone,ends);
            thread44513(tdone,ends);
            int biggest44514 = 0;
            if(ends[3]>=biggest44514){
              biggest44514=ends[3];
            }
            if(ends[4]>=biggest44514){
              biggest44514=ends[4];
            }
            if(biggest44514 == 1){
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            //FINXME code
            if(biggest44514 == 0){
              S42755=1;
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            break;
          
          case 1 : 
            S42755=1;
            S42755=0;
            if(motConveyorOnOff.getprestatus()){//sysj\plant.sysj line: 79, column: 12
              thread44515(tdone,ends);
              thread44516(tdone,ends);
              int biggest44517 = 0;
              if(ends[3]>=biggest44517){
                biggest44517=ends[3];
              }
              if(ends[4]>=biggest44517){
                biggest44517=ends[4];
              }
              if(biggest44517 == 1){
                active[2]=1;
                ends[2]=1;
                tdone[2]=1;
              }
              //FINXME code
              if(biggest44517 == 0){
                S42755=1;
                active[2]=1;
                ends[2]=1;
                tdone[2]=1;
              }
            }
            else {
              S42755=1;
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread44509(int [] tdone, int [] ends){
        S43603=1;
    S43583=0;
    if(moveToPos2.getprestatus()){//sysj\plant.sysj line: 383, column: 24
      System.out.println("bottle is now at pos 2");//sysj\plant.sysj line: 383, column: 36
      bottleAtPos2.setPresent();//sysj\plant.sysj line: 383, column: 82
      currsigs.addElement(bottleAtPos2);
      active[25]=1;
      ends[25]=1;
      tdone[25]=1;
    }
    else {
      S43583=1;
      active[25]=1;
      ends[25]=1;
      tdone[25]=1;
    }
  }

  public void thread44508(int [] tdone, int [] ends){
        S43574=1;
    S43554=0;
    if(moveToPos3.getprestatus()){//sysj\plant.sysj line: 381, column: 24
      System.out.println("bottle is now at pos 3");//sysj\plant.sysj line: 381, column: 36
      bottleAtPos3.setPresent();//sysj\plant.sysj line: 381, column: 82
      currsigs.addElement(bottleAtPos3);
      active[24]=1;
      ends[24]=1;
      tdone[24]=1;
    }
    else {
      S43554=1;
      active[24]=1;
      ends[24]=1;
      tdone[24]=1;
    }
  }

  public void thread44507(int [] tdone, int [] ends){
        S43545=1;
    S43525=0;
    if(moveToPos4.getprestatus()){//sysj\plant.sysj line: 379, column: 24
      System.out.println("bottle is now at pos 4");//sysj\plant.sysj line: 379, column: 36
      bottleAtPos4.setPresent();//sysj\plant.sysj line: 379, column: 82
      currsigs.addElement(bottleAtPos4);
      active[23]=1;
      ends[23]=1;
      tdone[23]=1;
    }
    else {
      S43525=1;
      active[23]=1;
      ends[23]=1;
      tdone[23]=1;
    }
  }

  public void thread44506(int [] tdone, int [] ends){
        S43516=1;
    S43494=0;
    if(moveToPos5.getprestatus()){//sysj\plant.sysj line: 370, column: 13
      System.out.println("bottle is now at pos 5");//sysj\plant.sysj line: 371, column: 6
      bottleAtPos5.setPresent();//sysj\plant.sysj line: 372, column: 6
      currsigs.addElement(bottleAtPos5);
      active[22]=1;
      ends[22]=1;
      tdone[22]=1;
    }
    else {
      S43494=1;
      active[22]=1;
      ends[22]=1;
      tdone[22]=1;
    }
  }

  public void thread44505(int [] tdone, int [] ends){
        S43484=1;
    S43444=0;
    if(rotaryTableTrigger.getprestatus()){//sysj\plant.sysj line: 324, column: 12
      System.out.println("table triggered now moving");//sysj\plant.sysj line: 327, column: 5
      if(bottleAtPos4.getprestatus()){//sysj\plant.sysj line: 330, column: 13
        System.out.println("moving bottle at pos 4 to pos 5");//sysj\plant.sysj line: 331, column: 6
        moveToPos5.setPresent();//sysj\plant.sysj line: 332, column: 6
        currsigs.addElement(moveToPos5);
        S43430=0;
        active[21]=1;
        ends[21]=1;
        tdone[21]=1;
      }
      else {
        S43430=0;
        active[21]=1;
        ends[21]=1;
        tdone[21]=1;
      }
    }
    else {
      S43444=1;
      active[21]=1;
      ends[21]=1;
      tdone[21]=1;
    }
  }

  public void thread44504(int [] tdone, int [] ends){
        S43425=1;
    S43403=0;
    active[20]=1;
    ends[20]=1;
    tdone[20]=1;
  }

  public void thread44503(int [] tdone, int [] ends){
        S43393=1;
    S43349=0;
    if(gripperTurnExtend.getprestatus() && !gripperTurnRetract.getprestatus()){//sysj\plant.sysj line: 296, column: 13
      gripperTurnFinalPos.setPresent();//sysj\plant.sysj line: 298, column: 7
      currsigs.addElement(gripperTurnFinalPos);
      active[19]=1;
      ends[19]=1;
      tdone[19]=1;
    }
    else {
      S43349=1;
      if(gripperTurnRetract.getprestatus() && !gripperTurnExtend.getprestatus()){//sysj\plant.sysj line: 301, column: 13
        gripperTurnHomePos.setPresent();//sysj\plant.sysj line: 303, column: 7
        currsigs.addElement(gripperTurnHomePos);
        active[19]=1;
        ends[19]=1;
        tdone[19]=1;
      }
      else {
        S43349=2;
        active[19]=1;
        ends[19]=1;
        tdone[19]=1;
      }
    }
  }

  public void thread44502(int [] tdone, int [] ends){
        S43328=1;
    S43306=0;
    active[18]=1;
    ends[18]=1;
    tdone[18]=1;
  }

  public void thread44501(int [] tdone, int [] ends){
        S43296=1;
    S43268=0;
    gripperZAxisLifted.setPresent();//sysj\plant.sysj line: 273, column: 6
    currsigs.addElement(gripperZAxisLifted);
    active[17]=1;
    ends[17]=1;
    tdone[17]=1;
  }

  public void thread44500(int [] tdone, int [] ends){
        S43255=1;
    S43233=0;
    active[16]=1;
    ends[16]=1;
    tdone[16]=1;
  }

  public void thread44499(int [] tdone, int [] ends){
        S43223=1;
    capcount_thread_15 = 5;//sysj\plant.sysj line: 240, column: 3
    if(capDec_1.getprestatus()){//sysj\plant.sysj line: 242, column: 12
      if(capcount_thread_15 > 0) {//sysj\plant.sysj line: 243, column: 5
        capcount_thread_15 = capcount_thread_15 - 1;//sysj\plant.sysj line: 244, column: 6
      }
      if(refill.getprestatus()){//sysj\plant.sysj line: 246, column: 12
        capcount_thread_15 = 5;//sysj\plant.sysj line: 247, column: 5
        if(capcount_thread_15 == 0){//sysj\plant.sysj line: 250, column: 8
          empty.setPresent();//sysj\plant.sysj line: 251, column: 6
          currsigs.addElement(empty);
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
        if(capcount_thread_15 == 0){//sysj\plant.sysj line: 250, column: 8
          empty.setPresent();//sysj\plant.sysj line: 251, column: 6
          currsigs.addElement(empty);
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
      if(refill.getprestatus()){//sysj\plant.sysj line: 246, column: 12
        capcount_thread_15 = 5;//sysj\plant.sysj line: 247, column: 5
        if(capcount_thread_15 == 0){//sysj\plant.sysj line: 250, column: 8
          empty.setPresent();//sysj\plant.sysj line: 251, column: 6
          currsigs.addElement(empty);
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
        if(capcount_thread_15 == 0){//sysj\plant.sysj line: 250, column: 8
          empty.setPresent();//sysj\plant.sysj line: 251, column: 6
          currsigs.addElement(empty);
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

  public void thread44498(int [] tdone, int [] ends){
        S43161=1;
    S43115=0;
    S43097=0;
    active[14]=1;
    ends[14]=1;
    tdone[14]=1;
  }

  public void thread44497(int [] tdone, int [] ends){
        S43093=1;
    S43063=0;
    if(vacOn.getprestatus() && armAtSource.getprestatus()){//sysj\plant.sysj line: 202, column: 12
      if((Integer)(capPos_1.getpreval() == null ? 0 : ((Integer)capPos_1.getpreval()).intValue()) == 1){//sysj\plant.sysj line: 203, column: 8
        capPos_1.setPresent();//sysj\plant.sysj line: 204, column: 6
        currsigs.addElement(capPos_1);
        capPos_1.setValue(0);//sysj\plant.sysj line: 204, column: 6
        WPgripped.setPresent();//sysj\plant.sysj line: 206, column: 7
        currsigs.addElement(WPgripped);
        active[13]=1;
        ends[13]=1;
        tdone[13]=1;
      }
      else {
        S43063=1;
        active[13]=1;
        ends[13]=1;
        tdone[13]=1;
      }
    }
    else {
      S43063=1;
      active[13]=1;
      ends[13]=1;
      tdone[13]=1;
    }
  }

  public void thread44496(int [] tdone, int [] ends){
        S43049=1;
    S43021=0;
    pusherRetracted.setPresent();//sysj\plant.sysj line: 192, column: 5
    currsigs.addElement(pusherRetracted);
    active[12]=1;
    ends[12]=1;
    tdone[12]=1;
  }

  public void thread44495(int [] tdone, int [] ends){
        S43008=1;
    S42980=0;
    armAtDest.setPresent();//sysj\plant.sysj line: 181, column: 5
    currsigs.addElement(armAtDest);
    active[11]=1;
    ends[11]=1;
    tdone[11]=1;
  }

  public void thread44493(int [] tdone, int [] ends){
        S42965=1;
    S42891=0;
    if(dosUnitValveExtend.getprestatus() && !dosUnitValveRetract.getprestatus()){//sysj\plant.sysj line: 156, column: 13
      dosUnitEvac.setPresent();//sysj\plant.sysj line: 158, column: 7
      currsigs.addElement(dosUnitEvac);
      active[10]=1;
      ends[10]=1;
      tdone[10]=1;
    }
    else {
      S42891=1;
      if(dosUnitValveRetract.getprestatus() && !dosUnitValveExtend.getprestatus()){//sysj\plant.sysj line: 161, column: 13
        System.out.println("FillerPlant: Filling with canister " + (canister_1.getpreval() == null ? 0 : ((Integer)canister_1.getpreval()).intValue()) + " Percent: " + (percent_1.getpreval() == null ? 0 : ((Integer)percent_1.getpreval()).intValue()));//sysj\plant.sysj line: 162, column: 6
        dosUnitFilled.setPresent();//sysj\plant.sysj line: 164, column: 7
        currsigs.addElement(dosUnitFilled);
        active[10]=1;
        ends[10]=1;
        tdone[10]=1;
      }
      else {
        S42891=2;
        active[10]=1;
        ends[10]=1;
        tdone[10]=1;
      }
    }
  }

  public void thread44492(int [] tdone, int [] ends){
        S42855=1;
    S42841=0;
    if(valveInjectorOnOff.getprestatus()){//sysj\plant.sysj line: 144, column: 13
      valveInjectorActive.setPresent();//sysj\plant.sysj line: 146, column: 7
      currsigs.addElement(valveInjectorActive);
      active[9]=1;
      ends[9]=1;
      tdone[9]=1;
    }
    else {
      S42841=1;
      active[9]=1;
      ends[9]=1;
      tdone[9]=1;
    }
  }

  public void thread44491(int [] tdone, int [] ends){
        S42835=1;
    S42829=0;
    active[8]=1;
    ends[8]=1;
    tdone[8]=1;
  }

  public void thread44490(int [] tdone, int [] ends){
        S42827=1;
    S42821=0;
    active[7]=1;
    ends[7]=1;
    tdone[7]=1;
  }

  public void thread44489(int [] tdone, int [] ends){
        S42967=1;
    canister_1.setClear();//sysj\plant.sysj line: 120, column: 3
    percent_1.setClear();//sysj\plant.sysj line: 121, column: 3
    thread44490(tdone,ends);
    thread44491(tdone,ends);
    thread44492(tdone,ends);
    thread44493(tdone,ends);
    int biggest44494 = 0;
    if(ends[7]>=biggest44494){
      biggest44494=ends[7];
    }
    if(ends[8]>=biggest44494){
      biggest44494=ends[8];
    }
    if(ends[9]>=biggest44494){
      biggest44494=ends[9];
    }
    if(ends[10]>=biggest44494){
      biggest44494=ends[10];
    }
    if(biggest44494 == 1){
      active[6]=1;
      ends[6]=1;
      tdone[6]=1;
    }
  }

  public void thread44488(int [] tdone, int [] ends){
        S42817=1;
    S42811=0;
    if(bottleAtPos1.getprestatus()){//sysj\plant.sysj line: 107, column: 12
      RTbottleAtPos1.setPresent();//sysj\plant.sysj line: 109, column: 5
      currsigs.addElement(RTbottleAtPos1);
      S42811=1;
      active[5]=1;
      ends[5]=1;
      tdone[5]=1;
    }
    else {
      S42811=1;
      active[5]=1;
      ends[5]=1;
      tdone[5]=1;
    }
  }

  public void thread44486(int [] tdone, int [] ends){
        S42753=1;
    if(motorPos5On.getprestatus()){//sysj\plant.sysj line: 90, column: 14
      System.out.println("Conveyor Plant - moving bottle to leave 5");//sysj\plant.sysj line: 91, column: 7
      bottleLeftPos5.setPresent();//sysj\plant.sysj line: 93, column: 8
      currsigs.addElement(bottleLeftPos5);
      active[4]=1;
      ends[4]=1;
      tdone[4]=1;
    }
    else {
      S42753=0;
      active[4]=0;
      ends[4]=0;
      tdone[4]=1;
    }
  }

  public void thread44485(int [] tdone, int [] ends){
        S42741=1;
    if(motorPos1On.getprestatus()){//sysj\plant.sysj line: 81, column: 14
      System.out.println("Conveyor plant - moving bottle to 1");//sysj\plant.sysj line: 82, column: 7
      bottleAtPos1.setPresent();//sysj\plant.sysj line: 84, column: 8
      currsigs.addElement(bottleAtPos1);
      active[3]=1;
      ends[3]=1;
      tdone[3]=1;
    }
    else {
      S42741=0;
      active[3]=0;
      ends[3]=0;
      tdone[3]=1;
    }
  }

  public void thread44484(int [] tdone, int [] ends){
        S42809=1;
    S42755=0;
    if(motConveyorOnOff.getprestatus()){//sysj\plant.sysj line: 79, column: 12
      thread44485(tdone,ends);
      thread44486(tdone,ends);
      int biggest44487 = 0;
      if(ends[3]>=biggest44487){
        biggest44487=ends[3];
      }
      if(ends[4]>=biggest44487){
        biggest44487=ends[4];
      }
      if(biggest44487 == 1){
        active[2]=1;
        ends[2]=1;
        tdone[2]=1;
      }
      //FINXME code
      if(biggest44487 == 0){
        S42755=1;
        active[2]=1;
        ends[2]=1;
        tdone[2]=1;
      }
    }
    else {
      S42755=1;
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
      switch(S44482){
        case 0 : 
          S44482=0;
          break RUN;
        
        case 1 : 
          S44482=2;
          S44482=2;
          capDec_1.setClear();//sysj\plant.sysj line: 70, column: 2
          capPos_1.setClear();//sysj\plant.sysj line: 71, column: 2
          capPos_1.setPresent();//sysj\plant.sysj line: 72, column: 2
          currsigs.addElement(capPos_1);
          capPos_1.setValue(0);//sysj\plant.sysj line: 72, column: 2
          disablePos5_1.setClear();//sysj\plant.sysj line: 73, column: 2
          thread44484(tdone,ends);
          thread44488(tdone,ends);
          thread44489(tdone,ends);
          thread44495(tdone,ends);
          thread44496(tdone,ends);
          thread44497(tdone,ends);
          thread44498(tdone,ends);
          thread44499(tdone,ends);
          thread44500(tdone,ends);
          thread44501(tdone,ends);
          thread44502(tdone,ends);
          thread44503(tdone,ends);
          thread44504(tdone,ends);
          thread44505(tdone,ends);
          thread44506(tdone,ends);
          thread44507(tdone,ends);
          thread44508(tdone,ends);
          thread44509(tdone,ends);
          int biggest44510 = 0;
          if(ends[2]>=biggest44510){
            biggest44510=ends[2];
          }
          if(ends[5]>=biggest44510){
            biggest44510=ends[5];
          }
          if(ends[6]>=biggest44510){
            biggest44510=ends[6];
          }
          if(ends[11]>=biggest44510){
            biggest44510=ends[11];
          }
          if(ends[12]>=biggest44510){
            biggest44510=ends[12];
          }
          if(ends[13]>=biggest44510){
            biggest44510=ends[13];
          }
          if(ends[14]>=biggest44510){
            biggest44510=ends[14];
          }
          if(ends[15]>=biggest44510){
            biggest44510=ends[15];
          }
          if(ends[16]>=biggest44510){
            biggest44510=ends[16];
          }
          if(ends[17]>=biggest44510){
            biggest44510=ends[17];
          }
          if(ends[18]>=biggest44510){
            biggest44510=ends[18];
          }
          if(ends[19]>=biggest44510){
            biggest44510=ends[19];
          }
          if(ends[20]>=biggest44510){
            biggest44510=ends[20];
          }
          if(ends[21]>=biggest44510){
            biggest44510=ends[21];
          }
          if(ends[22]>=biggest44510){
            biggest44510=ends[22];
          }
          if(ends[23]>=biggest44510){
            biggest44510=ends[23];
          }
          if(ends[24]>=biggest44510){
            biggest44510=ends[24];
          }
          if(ends[25]>=biggest44510){
            biggest44510=ends[25];
          }
          if(biggest44510 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
        
        case 2 : 
          capDec_1.setClear();//sysj\plant.sysj line: 70, column: 2
          capPos_1.setClear();//sysj\plant.sysj line: 71, column: 2
          disablePos5_1.setClear();//sysj\plant.sysj line: 73, column: 2
          thread44511(tdone,ends);
          thread44518(tdone,ends);
          thread44519(tdone,ends);
          thread44525(tdone,ends);
          thread44526(tdone,ends);
          thread44527(tdone,ends);
          thread44528(tdone,ends);
          thread44529(tdone,ends);
          thread44530(tdone,ends);
          thread44531(tdone,ends);
          thread44532(tdone,ends);
          thread44533(tdone,ends);
          thread44534(tdone,ends);
          thread44535(tdone,ends);
          thread44536(tdone,ends);
          thread44537(tdone,ends);
          thread44538(tdone,ends);
          thread44539(tdone,ends);
          int biggest44540 = 0;
          if(ends[2]>=biggest44540){
            biggest44540=ends[2];
          }
          if(ends[5]>=biggest44540){
            biggest44540=ends[5];
          }
          if(ends[6]>=biggest44540){
            biggest44540=ends[6];
          }
          if(ends[11]>=biggest44540){
            biggest44540=ends[11];
          }
          if(ends[12]>=biggest44540){
            biggest44540=ends[12];
          }
          if(ends[13]>=biggest44540){
            biggest44540=ends[13];
          }
          if(ends[14]>=biggest44540){
            biggest44540=ends[14];
          }
          if(ends[15]>=biggest44540){
            biggest44540=ends[15];
          }
          if(ends[16]>=biggest44540){
            biggest44540=ends[16];
          }
          if(ends[17]>=biggest44540){
            biggest44540=ends[17];
          }
          if(ends[18]>=biggest44540){
            biggest44540=ends[18];
          }
          if(ends[19]>=biggest44540){
            biggest44540=ends[19];
          }
          if(ends[20]>=biggest44540){
            biggest44540=ends[20];
          }
          if(ends[21]>=biggest44540){
            biggest44540=ends[21];
          }
          if(ends[22]>=biggest44540){
            biggest44540=ends[22];
          }
          if(ends[23]>=biggest44540){
            biggest44540=ends[23];
          }
          if(ends[24]>=biggest44540){
            biggest44540=ends[24];
          }
          if(ends[25]>=biggest44540){
            biggest44540=ends[25];
          }
          if(biggest44540 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
          //FINXME code
          if(biggest44540 == 0){
            S44482=0;
            active[1]=0;
            ends[1]=0;
            S44482=0;
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
