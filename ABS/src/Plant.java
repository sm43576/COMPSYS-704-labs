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
  public Signal valveInjectorOnOff = new Signal("valveInjectorOnOff", Signal.INPUT);
  public Signal valveInletOnOff = new Signal("valveInletOnOff", Signal.INPUT);
  public Signal dosUnitValveRetract = new Signal("dosUnitValveRetract", Signal.INPUT);
  public Signal dosUnitValveExtend = new Signal("dosUnitValveExtend", Signal.INPUT);
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
  public Signal bottleAtPos1E = new Signal("bottleAtPos1E", Signal.OUTPUT);
  public Signal bottleAtPos5E = new Signal("bottleAtPos5E", Signal.OUTPUT);
  public Signal motConveyorOnOffE = new Signal("motConveyorOnOffE", Signal.OUTPUT);
  public Signal fillerReq = new Signal("fillerReq", Signal.OUTPUT);
  public Signal selectCanister = new Signal("selectCanister", Signal.OUTPUT);
  public Signal percentLiquid = new Signal("percentLiquid", Signal.OUTPUT);
  public Signal bottleAtPos2 = new Signal("bottleAtPos2", Signal.OUTPUT);
  public Signal dosUnitEvac = new Signal("dosUnitEvac", Signal.OUTPUT);
  public Signal dosUnitFilled = new Signal("dosUnitFilled", Signal.OUTPUT);
  public Signal currentlySelectedCanister = new Signal("currentlySelectedCanister", Signal.OUTPUT);
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
  public Signal cylClampedBottle = new Signal("cylClampedBottle", Signal.OUTPUT);
  public Signal tableAlignedWithSensor = new Signal("tableAlignedWithSensor", Signal.OUTPUT);
  public Signal capOnBottleAtPos1 = new Signal("capOnBottleAtPos1", Signal.OUTPUT);
  public Signal bottleAtPos3 = new Signal("bottleAtPos3", Signal.OUTPUT);
  public Signal moveToPos5 = new Signal("moveToPos5", Signal.OUTPUT);
  public Signal moveToPos4 = new Signal("moveToPos4", Signal.OUTPUT);
  public Signal moveToPos3 = new Signal("moveToPos3", Signal.OUTPUT);
  public Signal moveToPos2 = new Signal("moveToPos2", Signal.OUTPUT);
  private Signal capDec_1;
  private Signal capPos_1;
  private int capcount_thread_17;//sysj\plant.sysj line: 256, column: 3
  private Integer numCutOff_thread_19;//sysj\plant.sysj line: 391, column: 5
  private Integer randNum_thread_19;//sysj\plant.sysj line: 394, column: 7
  private int S6488 = 1;
  private int S3329 = 1;
  private int S2496 = 1;
  private int S2426 = 1;
  private int S2516 = 1;
  private int S2502 = 1;
  private int S2500 = 1;
  private int S2875 = 1;
  private int S2633 = 1;
  private int S2622 = 1;
  private int S2602 = 1;
  private int S2558 = 1;
  private int S2522 = 1;
  private int S2527 = 1;
  private int S2532 = 1;
  private int S2537 = 1;
  private int S2607 = 1;
  private int S2606 = 1;
  private int S2630 = 1;
  private int S2627 = 1;
  private int S3382 = 1;
  private int S3336 = 1;
  private int S3435 = 1;
  private int S3389 = 1;
  private int S3479 = 1;
  private int S3449 = 1;
  private int S3547 = 1;
  private int S3501 = 1;
  private int S3483 = 1;
  private int S3609 = 1;
  private int S3713 = 1;
  private int S3643 = 1;
  private int S3615 = 1;
  private int S3865 = 1;
  private int S3734 = 1;
  private int S3891 = 1;
  private int S3873 = 1;
  private int S3881 = 1;
  private int S3889 = 1;
  
  private int[] ends = new int[24];
  private int[] tdone = new int[24];
  
  public void thread6546(int [] tdone, int [] ends){
        switch(S3889){
      case 0 : 
        active[23]=0;
        ends[23]=0;
        tdone[23]=1;
        break;
      
      case 1 : 
        if(bottleAtPos5.getprestatus()){//sysj\plant.sysj line: 421, column: 25
          bottleAtPos5E.setPresent();//sysj\plant.sysj line: 421, column: 39
          currsigs.addElement(bottleAtPos5E);
          active[23]=1;
          ends[23]=1;
          tdone[23]=1;
        }
        else {
          active[23]=1;
          ends[23]=1;
          tdone[23]=1;
        }
        break;
      
    }
  }

  public void thread6545(int [] tdone, int [] ends){
        switch(S3881){
      case 0 : 
        active[22]=0;
        ends[22]=0;
        tdone[22]=1;
        break;
      
      case 1 : 
        if(bottleAtPos1.getprestatus()){//sysj\plant.sysj line: 419, column: 24
          bottleAtPos1E.setPresent();//sysj\plant.sysj line: 419, column: 38
          currsigs.addElement(bottleAtPos1E);
          active[22]=1;
          ends[22]=1;
          tdone[22]=1;
        }
        else {
          active[22]=1;
          ends[22]=1;
          tdone[22]=1;
        }
        break;
      
    }
  }

  public void thread6544(int [] tdone, int [] ends){
        switch(S3873){
      case 0 : 
        active[21]=0;
        ends[21]=0;
        tdone[21]=1;
        break;
      
      case 1 : 
        if(motConveyorOnOff.getprestatus()){//sysj\plant.sysj line: 417, column: 25
          motConveyorOnOffE.setPresent();//sysj\plant.sysj line: 417, column: 43
          currsigs.addElement(motConveyorOnOffE);
          active[21]=1;
          ends[21]=1;
          tdone[21]=1;
        }
        else {
          active[21]=1;
          ends[21]=1;
          tdone[21]=1;
        }
        break;
      
    }
  }

  public void thread6543(int [] tdone, int [] ends){
        switch(S3891){
      case 0 : 
        active[20]=0;
        ends[20]=0;
        tdone[20]=1;
        break;
      
      case 1 : 
        thread6544(tdone,ends);
        thread6545(tdone,ends);
        thread6546(tdone,ends);
        int biggest6547 = 0;
        if(ends[21]>=biggest6547){
          biggest6547=ends[21];
        }
        if(ends[22]>=biggest6547){
          biggest6547=ends[22];
        }
        if(ends[23]>=biggest6547){
          biggest6547=ends[23];
        }
        if(biggest6547 == 1){
          active[20]=1;
          ends[20]=1;
          tdone[20]=1;
        }
        //FINXME code
        if(biggest6547 == 0){
          S3891=0;
          active[20]=0;
          ends[20]=0;
          tdone[20]=1;
        }
        break;
      
    }
  }

  public void thread6542(int [] tdone, int [] ends){
        switch(S3865){
      case 0 : 
        active[19]=0;
        ends[19]=0;
        tdone[19]=1;
        break;
      
      case 1 : 
        switch(S3734){
          case 0 : 
            if(removeBottle.getprestatus()){//sysj\plant.sysj line: 397, column: 14
              S3734=1;
              active[19]=1;
              ends[19]=1;
              tdone[19]=1;
            }
            else {
              capOnBottleAtPos1.setPresent();//sysj\plant.sysj line: 399, column: 9
              currsigs.addElement(capOnBottleAtPos1);
              active[19]=1;
              ends[19]=1;
              tdone[19]=1;
            }
            break;
          
          case 1 : 
            S3734=1;
            S3734=2;
            active[19]=1;
            ends[19]=1;
            tdone[19]=1;
            break;
          
          case 2 : 
            if(enable.getprestatus()){//sysj\plant.sysj line: 404, column: 12
              S3734=3;
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
          
          case 3 : 
            if(!enable.getprestatus()){//sysj\plant.sysj line: 405, column: 12
              S3734=0;
              if(bottleAtPos1.getprestatus() && enable.getprestatus()){//sysj\plant.sysj line: 393, column: 14
                randNum_thread_19 = (int)(Math.random() * 100);//sysj\plant.sysj line: 394, column: 7
                System.out.println("Random Number is " + String.valueOf(randNum_thread_19));//sysj\plant.sysj line: 395, column: 7
                if(randNum_thread_19 > numCutOff_thread_19){//sysj\plant.sysj line: 396, column: 10
                  System.out.println("remove the bottle plz");//sysj\plant.sysj line: 398, column: 9
                  capOnBottleAtPos1.setPresent();//sysj\plant.sysj line: 399, column: 9
                  currsigs.addElement(capOnBottleAtPos1);
                  active[19]=1;
                  ends[19]=1;
                  tdone[19]=1;
                }
                else {
                  S3734=1;
                  active[19]=1;
                  ends[19]=1;
                  tdone[19]=1;
                }
              }
              else {
                S3734=1;
                active[19]=1;
                ends[19]=1;
                tdone[19]=1;
              }
            }
            else {
              active[19]=1;
              ends[19]=1;
              tdone[19]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread6541(int [] tdone, int [] ends){
        switch(S3713){
      case 0 : 
        active[18]=0;
        ends[18]=0;
        tdone[18]=1;
        break;
      
      case 1 : 
        switch(S3643){
          case 0 : 
            switch(S3615){
              case 0 : 
                if(!enable.getprestatus()){//sysj\plant.sysj line: 349, column: 12
                  if(bottleAtPos4.getprestatus()){//sysj\plant.sysj line: 351, column: 14
                    System.out.println("moving bottle at pos 4 to pos 5");//sysj\plant.sysj line: 352, column: 7
                    moveToPos5.setPresent();//sysj\plant.sysj line: 353, column: 7
                    currsigs.addElement(moveToPos5);
                    S3615=1;
                    active[18]=1;
                    ends[18]=1;
                    tdone[18]=1;
                  }
                  else {
                    S3615=1;
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
                if(enable.getprestatus()){//sysj\plant.sysj line: 355, column: 12
                  if(bottleAtPos3.getprestatus()){//sysj\plant.sysj line: 357, column: 14
                    System.out.println("moving bottle at pos 3 to pos 4");//sysj\plant.sysj line: 358, column: 7
                    moveToPos4.setPresent();//sysj\plant.sysj line: 359, column: 7
                    currsigs.addElement(moveToPos4);
                    S3615=2;
                    active[18]=1;
                    ends[18]=1;
                    tdone[18]=1;
                  }
                  else {
                    S3615=2;
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
              
              case 2 : 
                if(!enable.getprestatus()){//sysj\plant.sysj line: 361, column: 12
                  if(bottleAtPos2.getprestatus()){//sysj\plant.sysj line: 364, column: 14
                    System.out.println("moving bottle at pos 2 to pos 3");//sysj\plant.sysj line: 365, column: 7
                    moveToPos3.setPresent();//sysj\plant.sysj line: 366, column: 7
                    currsigs.addElement(moveToPos3);
                    S3615=3;
                    active[18]=1;
                    ends[18]=1;
                    tdone[18]=1;
                  }
                  else {
                    S3615=3;
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
              
              case 3 : 
                if(enable.getprestatus()){//sysj\plant.sysj line: 368, column: 12
                  if(bottleAtPos1.getprestatus()){//sysj\plant.sysj line: 370, column: 14
                    System.out.println("moving bottle at pos 1 to pos 2");//sysj\plant.sysj line: 371, column: 7
                    moveToPos2.setPresent();//sysj\plant.sysj line: 372, column: 7
                    currsigs.addElement(moveToPos2);
                    S3615=4;
                    active[18]=1;
                    ends[18]=1;
                    tdone[18]=1;
                  }
                  else {
                    S3615=4;
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
              
              case 4 : 
                if(enable.getprestatus()){//sysj\plant.sysj line: 374, column: 12
                  S3615=5;
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
              
              case 5 : 
                if(!enable.getprestatus()){//sysj\plant.sysj line: 375, column: 12
                  System.out.println("Table has been aligned");//sysj\plant.sysj line: 377, column: 6
                  tableAlignedWithSensor.setPresent();//sysj\plant.sysj line: 378, column: 6
                  currsigs.addElement(tableAlignedWithSensor);
                  S3615=6;
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
              
              case 6 : 
                S3615=6;
                S3643=1;
                active[18]=1;
                ends[18]=1;
                tdone[18]=1;
                break;
              
            }
            break;
          
          case 1 : 
            S3643=1;
            S3643=0;
            if(rotaryTableTrigger.getprestatus() && enable.getprestatus()){//sysj\plant.sysj line: 345, column: 13
              S3615=0;
              active[18]=1;
              ends[18]=1;
              tdone[18]=1;
            }
            else {
              S3643=1;
              active[18]=1;
              ends[18]=1;
              tdone[18]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread6540(int [] tdone, int [] ends){
        switch(S3609){
      case 0 : 
        active[17]=0;
        ends[17]=0;
        tdone[17]=1;
        break;
      
      case 1 : 
        if(capDec_1.getprestatus()){//sysj\plant.sysj line: 258, column: 12
          if(capcount_thread_17 > 0) {//sysj\plant.sysj line: 259, column: 5
            capcount_thread_17 = capcount_thread_17 - 1;//sysj\plant.sysj line: 260, column: 6
          }
          if(refill.getprestatus()){//sysj\plant.sysj line: 262, column: 12
            capcount_thread_17 = 5;//sysj\plant.sysj line: 263, column: 5
            if(capcount_thread_17 == 0){//sysj\plant.sysj line: 266, column: 8
              empty.setPresent();//sysj\plant.sysj line: 267, column: 6
              currsigs.addElement(empty);
              active[17]=1;
              ends[17]=1;
              tdone[17]=1;
            }
            else {
              active[17]=1;
              ends[17]=1;
              tdone[17]=1;
            }
          }
          else {
            if(capcount_thread_17 == 0){//sysj\plant.sysj line: 266, column: 8
              empty.setPresent();//sysj\plant.sysj line: 267, column: 6
              currsigs.addElement(empty);
              active[17]=1;
              ends[17]=1;
              tdone[17]=1;
            }
            else {
              active[17]=1;
              ends[17]=1;
              tdone[17]=1;
            }
          }
        }
        else {
          if(refill.getprestatus()){//sysj\plant.sysj line: 262, column: 12
            capcount_thread_17 = 5;//sysj\plant.sysj line: 263, column: 5
            if(capcount_thread_17 == 0){//sysj\plant.sysj line: 266, column: 8
              empty.setPresent();//sysj\plant.sysj line: 267, column: 6
              currsigs.addElement(empty);
              active[17]=1;
              ends[17]=1;
              tdone[17]=1;
            }
            else {
              active[17]=1;
              ends[17]=1;
              tdone[17]=1;
            }
          }
          else {
            if(capcount_thread_17 == 0){//sysj\plant.sysj line: 266, column: 8
              empty.setPresent();//sysj\plant.sysj line: 267, column: 6
              currsigs.addElement(empty);
              active[17]=1;
              ends[17]=1;
              tdone[17]=1;
            }
            else {
              active[17]=1;
              ends[17]=1;
              tdone[17]=1;
            }
          }
        }
        break;
      
    }
  }

  public void thread6539(int [] tdone, int [] ends){
        switch(S3547){
      case 0 : 
        active[16]=0;
        ends[16]=0;
        tdone[16]=1;
        break;
      
      case 1 : 
        switch(S3501){
          case 0 : 
            if(empty.getprestatus()){//sysj\plant.sysj line: 241, column: 10
              S3501=1;
              active[16]=1;
              ends[16]=1;
              tdone[16]=1;
            }
            else {
              switch(S3483){
                case 0 : 
                  if(pusherRetracted.getprestatus()){//sysj\plant.sysj line: 243, column: 13
                    S3483=1;
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
                  if(pusherExtended.getprestatus()){//sysj\plant.sysj line: 244, column: 13
                    capPos_1.setPresent();//sysj\plant.sysj line: 246, column: 7
                    currsigs.addElement(capPos_1);
                    capPos_1.setValue(1);//sysj\plant.sysj line: 246, column: 7
                    S3483=2;
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
                
                case 2 : 
                  if(pusherRetracted.getprestatus()){//sysj\plant.sysj line: 247, column: 13
                    capDec_1.setPresent();//sysj\plant.sysj line: 248, column: 7
                    currsigs.addElement(capDec_1);
                    S3483=0;
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
                
              }
            }
            break;
          
          case 1 : 
            if(refill.getprestatus()){//sysj\plant.sysj line: 251, column: 10
              S3501=0;
              S3483=0;
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
          
        }
        break;
      
    }
  }

  public void thread6538(int [] tdone, int [] ends){
        switch(S3479){
      case 0 : 
        active[15]=0;
        ends[15]=0;
        tdone[15]=1;
        break;
      
      case 1 : 
        switch(S3449){
          case 0 : 
            if(!vacOn.getprestatus()){//sysj\plant.sysj line: 221, column: 12
              if(armAtSource.getprestatus()){//sysj\plant.sysj line: 224, column: 14
                capPos_1.setPresent();//sysj\plant.sysj line: 225, column: 7
                currsigs.addElement(capPos_1);
                capPos_1.setValue(1);//sysj\plant.sysj line: 225, column: 7
                S3449=1;
                active[15]=1;
                ends[15]=1;
                tdone[15]=1;
              }
              else {
                S3449=1;
                active[15]=1;
                ends[15]=1;
                tdone[15]=1;
              }
            }
            else {
              WPgripped.setPresent();//sysj\plant.sysj line: 222, column: 7
              currsigs.addElement(WPgripped);
              active[15]=1;
              ends[15]=1;
              tdone[15]=1;
            }
            break;
          
          case 1 : 
            S3449=1;
            S3449=0;
            if(vacOn.getprestatus() && armAtSource.getprestatus()){//sysj\plant.sysj line: 218, column: 12
              if((Integer)(capPos_1.getpreval() == null ? 0 : ((Integer)capPos_1.getpreval()).intValue()) == 1){//sysj\plant.sysj line: 219, column: 8
                capPos_1.setPresent();//sysj\plant.sysj line: 220, column: 6
                currsigs.addElement(capPos_1);
                capPos_1.setValue(0);//sysj\plant.sysj line: 220, column: 6
                WPgripped.setPresent();//sysj\plant.sysj line: 222, column: 7
                currsigs.addElement(WPgripped);
                active[15]=1;
                ends[15]=1;
                tdone[15]=1;
              }
              else {
                S3449=1;
                active[15]=1;
                ends[15]=1;
                tdone[15]=1;
              }
            }
            else {
              S3449=1;
              active[15]=1;
              ends[15]=1;
              tdone[15]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread6537(int [] tdone, int [] ends){
        switch(S3435){
      case 0 : 
        active[14]=0;
        ends[14]=0;
        tdone[14]=1;
        break;
      
      case 1 : 
        switch(S3389){
          case 0 : 
            if(pusherExtend.getprestatus() && enable.getprestatus()){//sysj\plant.sysj line: 205, column: 10
              S3389=1;
              active[14]=1;
              ends[14]=1;
              tdone[14]=1;
            }
            else {
              pusherRetracted.setPresent();//sysj\plant.sysj line: 206, column: 5
              currsigs.addElement(pusherRetracted);
              active[14]=1;
              ends[14]=1;
              tdone[14]=1;
            }
            break;
          
          case 1 : 
            if(!enable.getprestatus()){//sysj\plant.sysj line: 208, column: 10
              S3389=2;
              pusherExtended.setPresent();//sysj\plant.sysj line: 210, column: 5
              currsigs.addElement(pusherExtended);
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
            if(!pusherExtend.getprestatus() && enable.getprestatus()){//sysj\plant.sysj line: 209, column: 10
              S3389=3;
              active[14]=1;
              ends[14]=1;
              tdone[14]=1;
            }
            else {
              pusherExtended.setPresent();//sysj\plant.sysj line: 210, column: 5
              currsigs.addElement(pusherExtended);
              active[14]=1;
              ends[14]=1;
              tdone[14]=1;
            }
            break;
          
          case 3 : 
            if(!enable.getprestatus()){//sysj\plant.sysj line: 212, column: 10
              S3389=0;
              pusherRetracted.setPresent();//sysj\plant.sysj line: 206, column: 5
              currsigs.addElement(pusherRetracted);
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

  public void thread6536(int [] tdone, int [] ends){
        switch(S3382){
      case 0 : 
        active[13]=0;
        ends[13]=0;
        tdone[13]=1;
        break;
      
      case 1 : 
        switch(S3336){
          case 0 : 
            if(armSource.getprestatus() && enable.getprestatus()){//sysj\plant.sysj line: 192, column: 10
              S3336=1;
              active[13]=1;
              ends[13]=1;
              tdone[13]=1;
            }
            else {
              armAtDest.setPresent();//sysj\plant.sysj line: 193, column: 5
              currsigs.addElement(armAtDest);
              active[13]=1;
              ends[13]=1;
              tdone[13]=1;
            }
            break;
          
          case 1 : 
            if(!enable.getprestatus()){//sysj\plant.sysj line: 195, column: 10
              S3336=2;
              armAtSource.setPresent();//sysj\plant.sysj line: 197, column: 5
              currsigs.addElement(armAtSource);
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
            if(armDest.getprestatus() && enable.getprestatus()){//sysj\plant.sysj line: 196, column: 10
              S3336=3;
              active[13]=1;
              ends[13]=1;
              tdone[13]=1;
            }
            else {
              armAtSource.setPresent();//sysj\plant.sysj line: 197, column: 5
              currsigs.addElement(armAtSource);
              active[13]=1;
              ends[13]=1;
              tdone[13]=1;
            }
            break;
          
          case 3 : 
            if(!enable.getprestatus()){//sysj\plant.sysj line: 199, column: 10
              S3336=0;
              armAtDest.setPresent();//sysj\plant.sysj line: 193, column: 5
              currsigs.addElement(armAtDest);
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

  public void thread6533(int [] tdone, int [] ends){
        S3889=1;
    if(bottleAtPos5.getprestatus()){//sysj\plant.sysj line: 421, column: 25
      bottleAtPos5E.setPresent();//sysj\plant.sysj line: 421, column: 39
      currsigs.addElement(bottleAtPos5E);
      active[23]=1;
      ends[23]=1;
      tdone[23]=1;
    }
    else {
      active[23]=1;
      ends[23]=1;
      tdone[23]=1;
    }
  }

  public void thread6532(int [] tdone, int [] ends){
        S3881=1;
    if(bottleAtPos1.getprestatus()){//sysj\plant.sysj line: 419, column: 24
      bottleAtPos1E.setPresent();//sysj\plant.sysj line: 419, column: 38
      currsigs.addElement(bottleAtPos1E);
      active[22]=1;
      ends[22]=1;
      tdone[22]=1;
    }
    else {
      active[22]=1;
      ends[22]=1;
      tdone[22]=1;
    }
  }

  public void thread6531(int [] tdone, int [] ends){
        S3873=1;
    if(motConveyorOnOff.getprestatus()){//sysj\plant.sysj line: 417, column: 25
      motConveyorOnOffE.setPresent();//sysj\plant.sysj line: 417, column: 43
      currsigs.addElement(motConveyorOnOffE);
      active[21]=1;
      ends[21]=1;
      tdone[21]=1;
    }
    else {
      active[21]=1;
      ends[21]=1;
      tdone[21]=1;
    }
  }

  public void thread6530(int [] tdone, int [] ends){
        S3891=1;
    thread6531(tdone,ends);
    thread6532(tdone,ends);
    thread6533(tdone,ends);
    int biggest6534 = 0;
    if(ends[21]>=biggest6534){
      biggest6534=ends[21];
    }
    if(ends[22]>=biggest6534){
      biggest6534=ends[22];
    }
    if(ends[23]>=biggest6534){
      biggest6534=ends[23];
    }
    if(biggest6534 == 1){
      active[20]=1;
      ends[20]=1;
      tdone[20]=1;
    }
  }

  public void thread6529(int [] tdone, int [] ends){
        S3865=1;
    numCutOff_thread_19 = 80;//sysj\plant.sysj line: 391, column: 5
    S3734=0;
    if(bottleAtPos1.getprestatus() && enable.getprestatus()){//sysj\plant.sysj line: 393, column: 14
      randNum_thread_19 = (int)(Math.random() * 100);//sysj\plant.sysj line: 394, column: 7
      System.out.println("Random Number is " + String.valueOf(randNum_thread_19));//sysj\plant.sysj line: 395, column: 7
      if(randNum_thread_19 > numCutOff_thread_19){//sysj\plant.sysj line: 396, column: 10
        System.out.println("remove the bottle plz");//sysj\plant.sysj line: 398, column: 9
        capOnBottleAtPos1.setPresent();//sysj\plant.sysj line: 399, column: 9
        currsigs.addElement(capOnBottleAtPos1);
        active[19]=1;
        ends[19]=1;
        tdone[19]=1;
      }
      else {
        S3734=1;
        active[19]=1;
        ends[19]=1;
        tdone[19]=1;
      }
    }
    else {
      S3734=1;
      active[19]=1;
      ends[19]=1;
      tdone[19]=1;
    }
  }

  public void thread6528(int [] tdone, int [] ends){
        S3713=1;
    S3643=0;
    if(rotaryTableTrigger.getprestatus() && enable.getprestatus()){//sysj\plant.sysj line: 345, column: 13
      S3615=0;
      active[18]=1;
      ends[18]=1;
      tdone[18]=1;
    }
    else {
      S3643=1;
      active[18]=1;
      ends[18]=1;
      tdone[18]=1;
    }
  }

  public void thread6527(int [] tdone, int [] ends){
        S3609=1;
    capcount_thread_17 = 5;//sysj\plant.sysj line: 256, column: 3
    if(capDec_1.getprestatus()){//sysj\plant.sysj line: 258, column: 12
      if(capcount_thread_17 > 0) {//sysj\plant.sysj line: 259, column: 5
        capcount_thread_17 = capcount_thread_17 - 1;//sysj\plant.sysj line: 260, column: 6
      }
      if(refill.getprestatus()){//sysj\plant.sysj line: 262, column: 12
        capcount_thread_17 = 5;//sysj\plant.sysj line: 263, column: 5
        if(capcount_thread_17 == 0){//sysj\plant.sysj line: 266, column: 8
          empty.setPresent();//sysj\plant.sysj line: 267, column: 6
          currsigs.addElement(empty);
          active[17]=1;
          ends[17]=1;
          tdone[17]=1;
        }
        else {
          active[17]=1;
          ends[17]=1;
          tdone[17]=1;
        }
      }
      else {
        if(capcount_thread_17 == 0){//sysj\plant.sysj line: 266, column: 8
          empty.setPresent();//sysj\plant.sysj line: 267, column: 6
          currsigs.addElement(empty);
          active[17]=1;
          ends[17]=1;
          tdone[17]=1;
        }
        else {
          active[17]=1;
          ends[17]=1;
          tdone[17]=1;
        }
      }
    }
    else {
      if(refill.getprestatus()){//sysj\plant.sysj line: 262, column: 12
        capcount_thread_17 = 5;//sysj\plant.sysj line: 263, column: 5
        if(capcount_thread_17 == 0){//sysj\plant.sysj line: 266, column: 8
          empty.setPresent();//sysj\plant.sysj line: 267, column: 6
          currsigs.addElement(empty);
          active[17]=1;
          ends[17]=1;
          tdone[17]=1;
        }
        else {
          active[17]=1;
          ends[17]=1;
          tdone[17]=1;
        }
      }
      else {
        if(capcount_thread_17 == 0){//sysj\plant.sysj line: 266, column: 8
          empty.setPresent();//sysj\plant.sysj line: 267, column: 6
          currsigs.addElement(empty);
          active[17]=1;
          ends[17]=1;
          tdone[17]=1;
        }
        else {
          active[17]=1;
          ends[17]=1;
          tdone[17]=1;
        }
      }
    }
  }

  public void thread6526(int [] tdone, int [] ends){
        S3547=1;
    S3501=0;
    S3483=0;
    active[16]=1;
    ends[16]=1;
    tdone[16]=1;
  }

  public void thread6525(int [] tdone, int [] ends){
        S3479=1;
    S3449=0;
    if(vacOn.getprestatus() && armAtSource.getprestatus()){//sysj\plant.sysj line: 218, column: 12
      if((Integer)(capPos_1.getpreval() == null ? 0 : ((Integer)capPos_1.getpreval()).intValue()) == 1){//sysj\plant.sysj line: 219, column: 8
        capPos_1.setPresent();//sysj\plant.sysj line: 220, column: 6
        currsigs.addElement(capPos_1);
        capPos_1.setValue(0);//sysj\plant.sysj line: 220, column: 6
        WPgripped.setPresent();//sysj\plant.sysj line: 222, column: 7
        currsigs.addElement(WPgripped);
        active[15]=1;
        ends[15]=1;
        tdone[15]=1;
      }
      else {
        S3449=1;
        active[15]=1;
        ends[15]=1;
        tdone[15]=1;
      }
    }
    else {
      S3449=1;
      active[15]=1;
      ends[15]=1;
      tdone[15]=1;
    }
  }

  public void thread6524(int [] tdone, int [] ends){
        S3435=1;
    S3389=0;
    pusherRetracted.setPresent();//sysj\plant.sysj line: 206, column: 5
    currsigs.addElement(pusherRetracted);
    active[14]=1;
    ends[14]=1;
    tdone[14]=1;
  }

  public void thread6523(int [] tdone, int [] ends){
        S3382=1;
    S3336=0;
    armAtDest.setPresent();//sysj\plant.sysj line: 193, column: 5
    currsigs.addElement(armAtDest);
    active[13]=1;
    ends[13]=1;
    tdone[13]=1;
  }

  public void thread6520(int [] tdone, int [] ends){
        S2630=1;
    S2627=0;
    dosUnitEvac.setPresent();//sysj\plant.sysj line: 168, column: 8
    currsigs.addElement(dosUnitEvac);
    active[12]=1;
    ends[12]=1;
    tdone[12]=1;
  }

  public void thread6519(int [] tdone, int [] ends){
        S2622=1;
    S2602=0;
    active[5]=1;
    ends[5]=1;
    tdone[5]=1;
  }

  public void thread6517(int [] tdone, int [] ends){
        switch(S2630){
      case 0 : 
        active[12]=0;
        ends[12]=0;
        tdone[12]=1;
        break;
      
      case 1 : 
        switch(S2627){
          case 0 : 
            if(dosUnitValveRetract.getprestatus()){//sysj\plant.sysj line: 167, column: 13
              System.out.println("Canister at top");//sysj\plant.sysj line: 170, column: 7
              S2627=1;
              active[12]=1;
              ends[12]=1;
              tdone[12]=1;
            }
            else {
              dosUnitEvac.setPresent();//sysj\plant.sysj line: 168, column: 8
              currsigs.addElement(dosUnitEvac);
              active[12]=1;
              ends[12]=1;
              tdone[12]=1;
            }
            break;
          
          case 1 : 
            if(dosUnitValveExtend.getprestatus()){//sysj\plant.sysj line: 172, column: 13
              System.out.println("Canister at bottom");//sysj\plant.sysj line: 173, column: 7
              S2627=2;
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
            S2627=2;
            S2630=0;
            active[12]=0;
            ends[12]=0;
            tdone[12]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread6515(int [] tdone, int [] ends){
        active[11]=0;
    ends[11]=0;
    tdone[11]=1;
  }

  public void thread6514(int [] tdone, int [] ends){
        switch(S2607){
      case 0 : 
        active[10]=0;
        ends[10]=0;
        tdone[10]=1;
        break;
      
      case 1 : 
        switch(S2606){
        }
        break;
      
    }
  }

  public void thread6512(int [] tdone, int [] ends){
        currentlySelectedCanister.setPresent();//sysj\plant.sysj line: 149, column: 36
    currsigs.addElement(currentlySelectedCanister);
    currentlySelectedCanister.setValue(2);//sysj\plant.sysj line: 149, column: 36
    active[11]=0;
    ends[11]=0;
    tdone[11]=1;
  }

  public void thread6511(int [] tdone, int [] ends){
        S2607=1;
    selectCanister.setPresent();//sysj\plant.sysj line: 149, column: 7
    currsigs.addElement(selectCanister);
    selectCanister.setValue(2);//sysj\plant.sysj line: 149, column: 7
    S2607=0;
    active[10]=0;
    ends[10]=0;
    tdone[10]=1;
  }

  public void thread6509(int [] tdone, int [] ends){
        switch(S2537){
      case 0 : 
        active[9]=0;
        ends[9]=0;
        tdone[9]=1;
        break;
      
      case 1 : 
        bottleAtPos2.setPresent();//sysj\plant.sysj line: 143, column: 8
        currsigs.addElement(bottleAtPos2);
        active[9]=1;
        ends[9]=1;
        tdone[9]=1;
        break;
      
    }
  }

  public void thread6508(int [] tdone, int [] ends){
        switch(S2532){
      case 0 : 
        active[8]=0;
        ends[8]=0;
        tdone[8]=1;
        break;
      
      case 1 : 
        percentLiquid.setPresent();//sysj\plant.sysj line: 142, column: 8
        currsigs.addElement(percentLiquid);
        active[8]=1;
        ends[8]=1;
        tdone[8]=1;
        break;
      
    }
  }

  public void thread6507(int [] tdone, int [] ends){
        switch(S2527){
      case 0 : 
        active[7]=0;
        ends[7]=0;
        tdone[7]=1;
        break;
      
      case 1 : 
        selectCanister.setPresent();//sysj\plant.sysj line: 141, column: 8
        currsigs.addElement(selectCanister);
        active[7]=1;
        ends[7]=1;
        tdone[7]=1;
        break;
      
    }
  }

  public void thread6506(int [] tdone, int [] ends){
        switch(S2522){
      case 0 : 
        active[6]=0;
        ends[6]=0;
        tdone[6]=1;
        break;
      
      case 1 : 
        fillerReq.setPresent();//sysj\plant.sysj line: 140, column: 8
        currsigs.addElement(fillerReq);
        active[6]=1;
        ends[6]=1;
        tdone[6]=1;
        break;
      
    }
  }

  public void thread6504(int [] tdone, int [] ends){
        S2537=1;
    bottleAtPos2.setPresent();//sysj\plant.sysj line: 143, column: 8
    currsigs.addElement(bottleAtPos2);
    active[9]=1;
    ends[9]=1;
    tdone[9]=1;
  }

  public void thread6503(int [] tdone, int [] ends){
        S2532=1;
    percentLiquid.setPresent();//sysj\plant.sysj line: 142, column: 8
    currsigs.addElement(percentLiquid);
    active[8]=1;
    ends[8]=1;
    tdone[8]=1;
  }

  public void thread6502(int [] tdone, int [] ends){
        S2527=1;
    selectCanister.setPresent();//sysj\plant.sysj line: 141, column: 8
    currsigs.addElement(selectCanister);
    active[7]=1;
    ends[7]=1;
    tdone[7]=1;
  }

  public void thread6501(int [] tdone, int [] ends){
        S2522=1;
    fillerReq.setPresent();//sysj\plant.sysj line: 140, column: 8
    currsigs.addElement(fillerReq);
    active[6]=1;
    ends[6]=1;
    tdone[6]=1;
  }

  public void thread6500(int [] tdone, int [] ends){
        switch(S2622){
      case 0 : 
        active[5]=0;
        ends[5]=0;
        tdone[5]=1;
        break;
      
      case 1 : 
        switch(S2602){
          case 0 : 
            if(enable.getprestatus()){//sysj\plant.sysj line: 134, column: 12
              S2602=1;
              System.out.println("bottle at pos2");//sysj\plant.sysj line: 138, column: 7
              S2558=0;
              thread6501(tdone,ends);
              thread6502(tdone,ends);
              thread6503(tdone,ends);
              thread6504(tdone,ends);
              int biggest6505 = 0;
              if(ends[6]>=biggest6505){
                biggest6505=ends[6];
              }
              if(ends[7]>=biggest6505){
                biggest6505=ends[7];
              }
              if(ends[8]>=biggest6505){
                biggest6505=ends[8];
              }
              if(ends[9]>=biggest6505){
                biggest6505=ends[9];
              }
              if(biggest6505 == 1){
                active[5]=1;
                ends[5]=1;
                tdone[5]=1;
              }
            }
            else {
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            break;
          
          case 1 : 
            if(!enable.getprestatus()){//sysj\plant.sysj line: 136, column: 12
              S2602=2;
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            else {
              switch(S2558){
                case 0 : 
                  thread6506(tdone,ends);
                  thread6507(tdone,ends);
                  thread6508(tdone,ends);
                  thread6509(tdone,ends);
                  int biggest6510 = 0;
                  if(ends[6]>=biggest6510){
                    biggest6510=ends[6];
                  }
                  if(ends[7]>=biggest6510){
                    biggest6510=ends[7];
                  }
                  if(ends[8]>=biggest6510){
                    biggest6510=ends[8];
                  }
                  if(ends[9]>=biggest6510){
                    biggest6510=ends[9];
                  }
                  if(biggest6510 == 1){
                    active[5]=1;
                    ends[5]=1;
                    tdone[5]=1;
                  }
                  //FINXME code
                  if(biggest6510 == 0){
                    S2558=1;
                    active[5]=1;
                    ends[5]=1;
                    tdone[5]=1;
                  }
                  break;
                
                case 1 : 
                  S2558=1;
                  S2602=2;
                  active[5]=1;
                  ends[5]=1;
                  tdone[5]=1;
                  break;
                
              }
            }
            break;
          
          case 2 : 
            if(enable.getprestatus()){//sysj\plant.sysj line: 147, column: 12
              S2602=3;
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
          
          case 3 : 
            S2602=3;
            S2602=4;
            thread6511(tdone,ends);
            thread6512(tdone,ends);
            int biggest6513 = 0;
            if(ends[10]>=biggest6513){
              biggest6513=ends[10];
            }
            if(ends[11]>=biggest6513){
              biggest6513=ends[11];
            }
            //FINXME code
            if(biggest6513 == 0){
              System.out.println("Canister selection");//sysj\plant.sysj line: 150, column: 6
              S2602=5;
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            break;
          
          case 4 : 
            thread6514(tdone,ends);
            thread6515(tdone,ends);
            int biggest6516 = 0;
            if(ends[10]>=biggest6516){
              biggest6516=ends[10];
            }
            if(ends[11]>=biggest6516){
              biggest6516=ends[11];
            }
            //FINXME code
            if(biggest6516 == 0){
              System.out.println("Canister selection");//sysj\plant.sysj line: 150, column: 6
              S2602=5;
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            break;
          
          case 5 : 
            if(enable.getprestatus()){//sysj\plant.sysj line: 152, column: 12
              if(valveInletOnOff.getprestatus()){//sysj\plant.sysj line: 153, column: 14
                dosUnitFilled.setPresent();//sysj\plant.sysj line: 154, column: 7
                currsigs.addElement(dosUnitFilled);
                System.out.println("Bottle plant filled");//sysj\plant.sysj line: 156, column: 6
                S2602=6;
                active[5]=1;
                ends[5]=1;
                tdone[5]=1;
              }
              else {
                System.out.println("Bottle plant filled");//sysj\plant.sysj line: 156, column: 6
                S2602=6;
                active[5]=1;
                ends[5]=1;
                tdone[5]=1;
              }
            }
            else {
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            break;
          
          case 6 : 
            if(enable.getprestatus()){//sysj\plant.sysj line: 157, column: 12
              S2602=7;
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
          
          case 7 : 
            S2602=7;
            S2622=0;
            active[5]=0;
            ends[5]=0;
            tdone[5]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread6499(int [] tdone, int [] ends){
        switch(S2875){
      case 0 : 
        active[4]=0;
        ends[4]=0;
        tdone[4]=1;
        break;
      
      case 1 : 
        switch(S2633){
          case 0 : 
            thread6500(tdone,ends);
            thread6517(tdone,ends);
            int biggest6518 = 0;
            if(ends[5]>=biggest6518){
              biggest6518=ends[5];
            }
            if(ends[12]>=biggest6518){
              biggest6518=ends[12];
            }
            if(biggest6518 == 1){
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            //FINXME code
            if(biggest6518 == 0){
              S2633=1;
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            break;
          
          case 1 : 
            if(enable.getprestatus()){//sysj\plant.sysj line: 178, column: 12
              S2633=2;
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            else {
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            break;
          
          case 2 : 
            if(enable.getprestatus()){//sysj\plant.sysj line: 179, column: 12
              S2633=0;
              thread6519(tdone,ends);
              thread6520(tdone,ends);
              int biggest6521 = 0;
              if(ends[5]>=biggest6521){
                biggest6521=ends[5];
              }
              if(ends[12]>=biggest6521){
                biggest6521=ends[12];
              }
              if(biggest6521 == 1){
                active[4]=1;
                ends[4]=1;
                tdone[4]=1;
              }
            }
            else {
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread6498(int [] tdone, int [] ends){
        switch(S2516){
      case 0 : 
        active[3]=0;
        ends[3]=0;
        tdone[3]=1;
        break;
      
      case 1 : 
        switch(S2502){
          case 0 : 
            switch(S2500){
              case 0 : 
                if(!enable.getprestatus()){//sysj\plant.sysj line: 118, column: 11
                  S2500=1;
                  active[3]=1;
                  ends[3]=1;
                  tdone[3]=1;
                }
                else {
                  active[3]=1;
                  ends[3]=1;
                  tdone[3]=1;
                }
                break;
              
              case 1 : 
                if(enable.getprestatus()){//sysj\plant.sysj line: 119, column: 11
                  RTbottleAtPos1.setPresent();//sysj\plant.sysj line: 120, column: 5
                  currsigs.addElement(RTbottleAtPos1);
                  S2502=1;
                  active[3]=1;
                  ends[3]=1;
                  tdone[3]=1;
                }
                else {
                  active[3]=1;
                  ends[3]=1;
                  tdone[3]=1;
                }
                break;
              
            }
            break;
          
          case 1 : 
            S2502=1;
            S2502=0;
            if(bottleAtPos1.getprestatus() && enable.getprestatus()){//sysj\plant.sysj line: 117, column: 12
              S2500=0;
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            else {
              S2502=1;
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread6497(int [] tdone, int [] ends){
        switch(S2496){
      case 0 : 
        active[2]=0;
        ends[2]=0;
        tdone[2]=1;
        break;
      
      case 1 : 
        switch(S2426){
          case 0 : 
            if(enable.getprestatus()){//sysj\plant.sysj line: 81, column: 10
              S2426=1;
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            else {
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            break;
          
          case 1 : 
            if(enable.getprestatus()){//sysj\plant.sysj line: 92, column: 10
              S2426=2;
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            else {
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            break;
          
          case 2 : 
            S2426=2;
            S2426=3;
            bottleAtPos1.setPresent();//sysj\plant.sysj line: 98, column: 6
            currsigs.addElement(bottleAtPos1);
            active[2]=1;
            ends[2]=1;
            tdone[2]=1;
            break;
          
          case 3 : 
            if(valveInjectorOnOff.getprestatus()){//sysj\plant.sysj line: 96, column: 10
              S2426=4;
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            else {
              bottleAtPos1.setPresent();//sysj\plant.sysj line: 98, column: 6
              currsigs.addElement(bottleAtPos1);
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            break;
          
          case 4 : 
            if(!enable.getprestatus()){//sysj\plant.sysj line: 101, column: 10
              S2426=5;
              bottleAtPos1.setPresent();//sysj\plant.sysj line: 104, column: 5
              currsigs.addElement(bottleAtPos1);
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            else {
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            break;
          
          case 5 : 
            if(enable.getprestatus()){//sysj\plant.sysj line: 103, column: 10
              S2426=6;
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            else {
              bottleAtPos1.setPresent();//sysj\plant.sysj line: 104, column: 5
              currsigs.addElement(bottleAtPos1);
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            break;
          
          case 6 : 
            if(enable.getprestatus()){//sysj\plant.sysj line: 108, column: 10
              S2426=7;
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            else {
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            break;
          
          case 7 : 
            S2426=7;
            S2426=0;
            active[2]=1;
            ends[2]=1;
            tdone[2]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread6494(int [] tdone, int [] ends){
        S2630=1;
    S2627=0;
    dosUnitEvac.setPresent();//sysj\plant.sysj line: 168, column: 8
    currsigs.addElement(dosUnitEvac);
    active[12]=1;
    ends[12]=1;
    tdone[12]=1;
  }

  public void thread6493(int [] tdone, int [] ends){
        S2622=1;
    S2602=0;
    active[5]=1;
    ends[5]=1;
    tdone[5]=1;
  }

  public void thread6492(int [] tdone, int [] ends){
        S2875=1;
    S2633=0;
    thread6493(tdone,ends);
    thread6494(tdone,ends);
    int biggest6495 = 0;
    if(ends[5]>=biggest6495){
      biggest6495=ends[5];
    }
    if(ends[12]>=biggest6495){
      biggest6495=ends[12];
    }
    if(biggest6495 == 1){
      active[4]=1;
      ends[4]=1;
      tdone[4]=1;
    }
  }

  public void thread6491(int [] tdone, int [] ends){
        S2516=1;
    S2502=0;
    if(bottleAtPos1.getprestatus() && enable.getprestatus()){//sysj\plant.sysj line: 117, column: 12
      S2500=0;
      active[3]=1;
      ends[3]=1;
      tdone[3]=1;
    }
    else {
      S2502=1;
      active[3]=1;
      ends[3]=1;
      tdone[3]=1;
    }
  }

  public void thread6490(int [] tdone, int [] ends){
        S2496=1;
    S2426=0;
    active[2]=1;
    ends[2]=1;
    tdone[2]=1;
  }

  public void runClockDomain(){
    for(int i=0;i<ends.length;i++){
      ends[i] = 0;
      tdone[i] = 0;
    }
    
    RUN: while(true){
      switch(S6488){
        case 0 : 
          S6488=0;
          break RUN;
        
        case 1 : 
          S6488=2;
          S6488=2;
          new Thread(new GUI()).start();//sysj\plant.sysj line: 70, column: 2
          capDec_1.setClear();//sysj\plant.sysj line: 72, column: 2
          capPos_1.setClear();//sysj\plant.sysj line: 73, column: 2
          capPos_1.setPresent();//sysj\plant.sysj line: 74, column: 2
          currsigs.addElement(capPos_1);
          capPos_1.setValue(0);//sysj\plant.sysj line: 74, column: 2
          S3329=0;
          thread6490(tdone,ends);
          thread6491(tdone,ends);
          thread6492(tdone,ends);
          int biggest6496 = 0;
          if(ends[2]>=biggest6496){
            biggest6496=ends[2];
          }
          if(ends[3]>=biggest6496){
            biggest6496=ends[3];
          }
          if(ends[4]>=biggest6496){
            biggest6496=ends[4];
          }
          if(biggest6496 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
        
        case 2 : 
          capDec_1.setClear();//sysj\plant.sysj line: 72, column: 2
          capPos_1.setClear();//sysj\plant.sysj line: 73, column: 2
          switch(S3329){
            case 0 : 
              thread6497(tdone,ends);
              thread6498(tdone,ends);
              thread6499(tdone,ends);
              int biggest6522 = 0;
              if(ends[2]>=biggest6522){
                biggest6522=ends[2];
              }
              if(ends[3]>=biggest6522){
                biggest6522=ends[3];
              }
              if(ends[4]>=biggest6522){
                biggest6522=ends[4];
              }
              if(biggest6522 == 1){
                active[1]=1;
                ends[1]=1;
                break RUN;
              }
              //FINXME code
              if(biggest6522 == 0){
                S3329=1;
                thread6523(tdone,ends);
                thread6524(tdone,ends);
                thread6525(tdone,ends);
                thread6526(tdone,ends);
                thread6527(tdone,ends);
                thread6528(tdone,ends);
                thread6529(tdone,ends);
                thread6530(tdone,ends);
                int biggest6535 = 0;
                if(ends[13]>=biggest6535){
                  biggest6535=ends[13];
                }
                if(ends[14]>=biggest6535){
                  biggest6535=ends[14];
                }
                if(ends[15]>=biggest6535){
                  biggest6535=ends[15];
                }
                if(ends[16]>=biggest6535){
                  biggest6535=ends[16];
                }
                if(ends[17]>=biggest6535){
                  biggest6535=ends[17];
                }
                if(ends[18]>=biggest6535){
                  biggest6535=ends[18];
                }
                if(ends[19]>=biggest6535){
                  biggest6535=ends[19];
                }
                if(ends[20]>=biggest6535){
                  biggest6535=ends[20];
                }
                if(biggest6535 == 1){
                  active[1]=1;
                  ends[1]=1;
                  break RUN;
                }
              }
            
            case 1 : 
              thread6536(tdone,ends);
              thread6537(tdone,ends);
              thread6538(tdone,ends);
              thread6539(tdone,ends);
              thread6540(tdone,ends);
              thread6541(tdone,ends);
              thread6542(tdone,ends);
              thread6543(tdone,ends);
              int biggest6548 = 0;
              if(ends[13]>=biggest6548){
                biggest6548=ends[13];
              }
              if(ends[14]>=biggest6548){
                biggest6548=ends[14];
              }
              if(ends[15]>=biggest6548){
                biggest6548=ends[15];
              }
              if(ends[16]>=biggest6548){
                biggest6548=ends[16];
              }
              if(ends[17]>=biggest6548){
                biggest6548=ends[17];
              }
              if(ends[18]>=biggest6548){
                biggest6548=ends[18];
              }
              if(ends[19]>=biggest6548){
                biggest6548=ends[19];
              }
              if(ends[20]>=biggest6548){
                biggest6548=ends[20];
              }
              if(biggest6548 == 1){
                active[1]=1;
                ends[1]=1;
                break RUN;
              }
              //FINXME code
              if(biggest6548 == 0){
                S6488=0;
                active[1]=0;
                ends[1]=0;
                S6488=0;
                break RUN;
              }
            
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
          valveInjectorOnOff.gethook();
          valveInletOnOff.gethook();
          dosUnitValveRetract.gethook();
          dosUnitValveExtend.gethook();
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
      valveInjectorOnOff.setpreclear();
      valveInletOnOff.setpreclear();
      dosUnitValveRetract.setpreclear();
      dosUnitValveExtend.setpreclear();
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
      bottleAtPos1E.setpreclear();
      bottleAtPos5E.setpreclear();
      motConveyorOnOffE.setpreclear();
      fillerReq.setpreclear();
      selectCanister.setpreclear();
      percentLiquid.setpreclear();
      bottleAtPos2.setpreclear();
      dosUnitEvac.setpreclear();
      dosUnitFilled.setpreclear();
      currentlySelectedCanister.setpreclear();
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
      cylClampedBottle.setpreclear();
      tableAlignedWithSensor.setpreclear();
      capOnBottleAtPos1.setpreclear();
      bottleAtPos3.setpreclear();
      moveToPos5.setpreclear();
      moveToPos4.setpreclear();
      moveToPos3.setpreclear();
      moveToPos2.setpreclear();
      capDec_1.setpreclear();
      capPos_1.setpreclear();
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
      bottleAtPos1E.sethook();
      bottleAtPos1E.setClear();
      bottleAtPos5E.sethook();
      bottleAtPos5E.setClear();
      motConveyorOnOffE.sethook();
      motConveyorOnOffE.setClear();
      fillerReq.sethook();
      fillerReq.setClear();
      selectCanister.sethook();
      selectCanister.setClear();
      percentLiquid.sethook();
      percentLiquid.setClear();
      bottleAtPos2.sethook();
      bottleAtPos2.setClear();
      dosUnitEvac.sethook();
      dosUnitEvac.setClear();
      dosUnitFilled.sethook();
      dosUnitFilled.setClear();
      currentlySelectedCanister.sethook();
      currentlySelectedCanister.setClear();
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
      cylClampedBottle.sethook();
      cylClampedBottle.setClear();
      tableAlignedWithSensor.sethook();
      tableAlignedWithSensor.setClear();
      capOnBottleAtPos1.sethook();
      capOnBottleAtPos1.setClear();
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
      if(paused[1]!=0 || suspended[1]!=0 || active[1]!=1);
      else{
        enable.gethook();
        refill.gethook();
        removeBottle.gethook();
        motConveyorOnOff.gethook();
        valveInjectorOnOff.gethook();
        valveInletOnOff.gethook();
        dosUnitValveRetract.gethook();
        dosUnitValveExtend.gethook();
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
