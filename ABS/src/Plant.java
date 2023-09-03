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
  private int S4522 = 1;
  private int S1363 = 1;
  private int S530 = 1;
  private int S460 = 1;
  private int S550 = 1;
  private int S536 = 1;
  private int S534 = 1;
  private int S909 = 1;
  private int S667 = 1;
  private int S656 = 1;
  private int S636 = 1;
  private int S592 = 1;
  private int S556 = 1;
  private int S561 = 1;
  private int S566 = 1;
  private int S571 = 1;
  private int S641 = 1;
  private int S640 = 1;
  private int S664 = 1;
  private int S661 = 1;
  private int S1416 = 1;
  private int S1370 = 1;
  private int S1469 = 1;
  private int S1423 = 1;
  private int S1513 = 1;
  private int S1483 = 1;
  private int S1581 = 1;
  private int S1535 = 1;
  private int S1517 = 1;
  private int S1643 = 1;
  private int S1747 = 1;
  private int S1677 = 1;
  private int S1649 = 1;
  private int S1899 = 1;
  private int S1768 = 1;
  private int S1925 = 1;
  private int S1907 = 1;
  private int S1915 = 1;
  private int S1923 = 1;
  
  private int[] ends = new int[24];
  private int[] tdone = new int[24];
  
  public void thread4580(int [] tdone, int [] ends){
        switch(S1923){
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

  public void thread4579(int [] tdone, int [] ends){
        switch(S1915){
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

  public void thread4578(int [] tdone, int [] ends){
        switch(S1907){
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

  public void thread4577(int [] tdone, int [] ends){
        switch(S1925){
      case 0 : 
        active[20]=0;
        ends[20]=0;
        tdone[20]=1;
        break;
      
      case 1 : 
        thread4578(tdone,ends);
        thread4579(tdone,ends);
        thread4580(tdone,ends);
        int biggest4581 = 0;
        if(ends[21]>=biggest4581){
          biggest4581=ends[21];
        }
        if(ends[22]>=biggest4581){
          biggest4581=ends[22];
        }
        if(ends[23]>=biggest4581){
          biggest4581=ends[23];
        }
        if(biggest4581 == 1){
          active[20]=1;
          ends[20]=1;
          tdone[20]=1;
        }
        //FINXME code
        if(biggest4581 == 0){
          S1925=0;
          active[20]=0;
          ends[20]=0;
          tdone[20]=1;
        }
        break;
      
    }
  }

  public void thread4576(int [] tdone, int [] ends){
        switch(S1899){
      case 0 : 
        active[19]=0;
        ends[19]=0;
        tdone[19]=1;
        break;
      
      case 1 : 
        switch(S1768){
          case 0 : 
            if(removeBottle.getprestatus()){//sysj\plant.sysj line: 397, column: 14
              S1768=1;
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
            S1768=1;
            S1768=2;
            active[19]=1;
            ends[19]=1;
            tdone[19]=1;
            break;
          
          case 2 : 
            if(enable.getprestatus()){//sysj\plant.sysj line: 404, column: 12
              S1768=3;
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
              S1768=0;
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
                  S1768=1;
                  active[19]=1;
                  ends[19]=1;
                  tdone[19]=1;
                }
              }
              else {
                S1768=1;
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

  public void thread4575(int [] tdone, int [] ends){
        switch(S1747){
      case 0 : 
        active[18]=0;
        ends[18]=0;
        tdone[18]=1;
        break;
      
      case 1 : 
        switch(S1677){
          case 0 : 
            switch(S1649){
              case 0 : 
                if(!enable.getprestatus()){//sysj\plant.sysj line: 349, column: 12
                  if(bottleAtPos4.getprestatus()){//sysj\plant.sysj line: 351, column: 14
                    System.out.println("moving bottle at pos 4 to pos 5");//sysj\plant.sysj line: 352, column: 7
                    moveToPos5.setPresent();//sysj\plant.sysj line: 353, column: 7
                    currsigs.addElement(moveToPos5);
                    S1649=1;
                    active[18]=1;
                    ends[18]=1;
                    tdone[18]=1;
                  }
                  else {
                    S1649=1;
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
                    S1649=2;
                    active[18]=1;
                    ends[18]=1;
                    tdone[18]=1;
                  }
                  else {
                    S1649=2;
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
                    S1649=3;
                    active[18]=1;
                    ends[18]=1;
                    tdone[18]=1;
                  }
                  else {
                    S1649=3;
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
                    S1649=4;
                    active[18]=1;
                    ends[18]=1;
                    tdone[18]=1;
                  }
                  else {
                    S1649=4;
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
                  S1649=5;
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
                  S1649=6;
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
                S1649=6;
                S1677=1;
                active[18]=1;
                ends[18]=1;
                tdone[18]=1;
                break;
              
            }
            break;
          
          case 1 : 
            S1677=1;
            S1677=0;
            if(rotaryTableTrigger.getprestatus() && enable.getprestatus()){//sysj\plant.sysj line: 345, column: 13
              S1649=0;
              active[18]=1;
              ends[18]=1;
              tdone[18]=1;
            }
            else {
              S1677=1;
              active[18]=1;
              ends[18]=1;
              tdone[18]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread4574(int [] tdone, int [] ends){
        switch(S1643){
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

  public void thread4573(int [] tdone, int [] ends){
        switch(S1581){
      case 0 : 
        active[16]=0;
        ends[16]=0;
        tdone[16]=1;
        break;
      
      case 1 : 
        switch(S1535){
          case 0 : 
            if(empty.getprestatus()){//sysj\plant.sysj line: 241, column: 10
              S1535=1;
              active[16]=1;
              ends[16]=1;
              tdone[16]=1;
            }
            else {
              switch(S1517){
                case 0 : 
                  if(pusherRetracted.getprestatus()){//sysj\plant.sysj line: 243, column: 13
                    S1517=1;
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
                    S1517=2;
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
                    S1517=0;
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
              S1535=0;
              S1517=0;
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

  public void thread4572(int [] tdone, int [] ends){
        switch(S1513){
      case 0 : 
        active[15]=0;
        ends[15]=0;
        tdone[15]=1;
        break;
      
      case 1 : 
        switch(S1483){
          case 0 : 
            if(!vacOn.getprestatus()){//sysj\plant.sysj line: 221, column: 12
              if(armAtSource.getprestatus()){//sysj\plant.sysj line: 224, column: 14
                capPos_1.setPresent();//sysj\plant.sysj line: 225, column: 7
                currsigs.addElement(capPos_1);
                capPos_1.setValue(1);//sysj\plant.sysj line: 225, column: 7
                S1483=1;
                active[15]=1;
                ends[15]=1;
                tdone[15]=1;
              }
              else {
                S1483=1;
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
            S1483=1;
            S1483=0;
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
                S1483=1;
                active[15]=1;
                ends[15]=1;
                tdone[15]=1;
              }
            }
            else {
              S1483=1;
              active[15]=1;
              ends[15]=1;
              tdone[15]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread4571(int [] tdone, int [] ends){
        switch(S1469){
      case 0 : 
        active[14]=0;
        ends[14]=0;
        tdone[14]=1;
        break;
      
      case 1 : 
        switch(S1423){
          case 0 : 
            if(pusherExtend.getprestatus() && enable.getprestatus()){//sysj\plant.sysj line: 205, column: 10
              S1423=1;
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
              S1423=2;
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
              S1423=3;
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
              S1423=0;
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

  public void thread4570(int [] tdone, int [] ends){
        switch(S1416){
      case 0 : 
        active[13]=0;
        ends[13]=0;
        tdone[13]=1;
        break;
      
      case 1 : 
        switch(S1370){
          case 0 : 
            if(armSource.getprestatus() && enable.getprestatus()){//sysj\plant.sysj line: 192, column: 10
              S1370=1;
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
              S1370=2;
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
              S1370=3;
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
              S1370=0;
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

  public void thread4567(int [] tdone, int [] ends){
        S1923=1;
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

  public void thread4566(int [] tdone, int [] ends){
        S1915=1;
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

  public void thread4565(int [] tdone, int [] ends){
        S1907=1;
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

  public void thread4564(int [] tdone, int [] ends){
        S1925=1;
    thread4565(tdone,ends);
    thread4566(tdone,ends);
    thread4567(tdone,ends);
    int biggest4568 = 0;
    if(ends[21]>=biggest4568){
      biggest4568=ends[21];
    }
    if(ends[22]>=biggest4568){
      biggest4568=ends[22];
    }
    if(ends[23]>=biggest4568){
      biggest4568=ends[23];
    }
    if(biggest4568 == 1){
      active[20]=1;
      ends[20]=1;
      tdone[20]=1;
    }
  }

  public void thread4563(int [] tdone, int [] ends){
        S1899=1;
    numCutOff_thread_19 = 80;//sysj\plant.sysj line: 391, column: 5
    S1768=0;
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
        S1768=1;
        active[19]=1;
        ends[19]=1;
        tdone[19]=1;
      }
    }
    else {
      S1768=1;
      active[19]=1;
      ends[19]=1;
      tdone[19]=1;
    }
  }

  public void thread4562(int [] tdone, int [] ends){
        S1747=1;
    S1677=0;
    if(rotaryTableTrigger.getprestatus() && enable.getprestatus()){//sysj\plant.sysj line: 345, column: 13
      S1649=0;
      active[18]=1;
      ends[18]=1;
      tdone[18]=1;
    }
    else {
      S1677=1;
      active[18]=1;
      ends[18]=1;
      tdone[18]=1;
    }
  }

  public void thread4561(int [] tdone, int [] ends){
        S1643=1;
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

  public void thread4560(int [] tdone, int [] ends){
        S1581=1;
    S1535=0;
    S1517=0;
    active[16]=1;
    ends[16]=1;
    tdone[16]=1;
  }

  public void thread4559(int [] tdone, int [] ends){
        S1513=1;
    S1483=0;
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
        S1483=1;
        active[15]=1;
        ends[15]=1;
        tdone[15]=1;
      }
    }
    else {
      S1483=1;
      active[15]=1;
      ends[15]=1;
      tdone[15]=1;
    }
  }

  public void thread4558(int [] tdone, int [] ends){
        S1469=1;
    S1423=0;
    pusherRetracted.setPresent();//sysj\plant.sysj line: 206, column: 5
    currsigs.addElement(pusherRetracted);
    active[14]=1;
    ends[14]=1;
    tdone[14]=1;
  }

  public void thread4557(int [] tdone, int [] ends){
        S1416=1;
    S1370=0;
    armAtDest.setPresent();//sysj\plant.sysj line: 193, column: 5
    currsigs.addElement(armAtDest);
    active[13]=1;
    ends[13]=1;
    tdone[13]=1;
  }

  public void thread4554(int [] tdone, int [] ends){
        S664=1;
    S661=0;
    dosUnitEvac.setPresent();//sysj\plant.sysj line: 168, column: 8
    currsigs.addElement(dosUnitEvac);
    active[12]=1;
    ends[12]=1;
    tdone[12]=1;
  }

  public void thread4553(int [] tdone, int [] ends){
        S656=1;
    S636=0;
    active[5]=1;
    ends[5]=1;
    tdone[5]=1;
  }

  public void thread4551(int [] tdone, int [] ends){
        switch(S664){
      case 0 : 
        active[12]=0;
        ends[12]=0;
        tdone[12]=1;
        break;
      
      case 1 : 
        switch(S661){
          case 0 : 
            if(dosUnitValveRetract.getprestatus()){//sysj\plant.sysj line: 167, column: 13
              System.out.println("Canister at top");//sysj\plant.sysj line: 170, column: 7
              S661=1;
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
              S661=2;
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
            S661=2;
            S664=0;
            active[12]=0;
            ends[12]=0;
            tdone[12]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread4549(int [] tdone, int [] ends){
        active[11]=0;
    ends[11]=0;
    tdone[11]=1;
  }

  public void thread4548(int [] tdone, int [] ends){
        switch(S641){
      case 0 : 
        active[10]=0;
        ends[10]=0;
        tdone[10]=1;
        break;
      
      case 1 : 
        switch(S640){
        }
        break;
      
    }
  }

  public void thread4546(int [] tdone, int [] ends){
        currentlySelectedCanister.setPresent();//sysj\plant.sysj line: 149, column: 36
    currsigs.addElement(currentlySelectedCanister);
    currentlySelectedCanister.setValue(2);//sysj\plant.sysj line: 149, column: 36
    active[11]=0;
    ends[11]=0;
    tdone[11]=1;
  }

  public void thread4545(int [] tdone, int [] ends){
        S641=1;
    selectCanister.setPresent();//sysj\plant.sysj line: 149, column: 7
    currsigs.addElement(selectCanister);
    selectCanister.setValue(2);//sysj\plant.sysj line: 149, column: 7
    S641=0;
    active[10]=0;
    ends[10]=0;
    tdone[10]=1;
  }

  public void thread4543(int [] tdone, int [] ends){
        switch(S571){
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

  public void thread4542(int [] tdone, int [] ends){
        switch(S566){
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

  public void thread4541(int [] tdone, int [] ends){
        switch(S561){
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

  public void thread4540(int [] tdone, int [] ends){
        switch(S556){
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

  public void thread4538(int [] tdone, int [] ends){
        S571=1;
    bottleAtPos2.setPresent();//sysj\plant.sysj line: 143, column: 8
    currsigs.addElement(bottleAtPos2);
    active[9]=1;
    ends[9]=1;
    tdone[9]=1;
  }

  public void thread4537(int [] tdone, int [] ends){
        S566=1;
    percentLiquid.setPresent();//sysj\plant.sysj line: 142, column: 8
    currsigs.addElement(percentLiquid);
    active[8]=1;
    ends[8]=1;
    tdone[8]=1;
  }

  public void thread4536(int [] tdone, int [] ends){
        S561=1;
    selectCanister.setPresent();//sysj\plant.sysj line: 141, column: 8
    currsigs.addElement(selectCanister);
    active[7]=1;
    ends[7]=1;
    tdone[7]=1;
  }

  public void thread4535(int [] tdone, int [] ends){
        S556=1;
    fillerReq.setPresent();//sysj\plant.sysj line: 140, column: 8
    currsigs.addElement(fillerReq);
    active[6]=1;
    ends[6]=1;
    tdone[6]=1;
  }

  public void thread4534(int [] tdone, int [] ends){
        switch(S656){
      case 0 : 
        active[5]=0;
        ends[5]=0;
        tdone[5]=1;
        break;
      
      case 1 : 
        switch(S636){
          case 0 : 
            if(enable.getprestatus()){//sysj\plant.sysj line: 134, column: 12
              S636=1;
              System.out.println("bottle at pos2");//sysj\plant.sysj line: 138, column: 7
              S592=0;
              thread4535(tdone,ends);
              thread4536(tdone,ends);
              thread4537(tdone,ends);
              thread4538(tdone,ends);
              int biggest4539 = 0;
              if(ends[6]>=biggest4539){
                biggest4539=ends[6];
              }
              if(ends[7]>=biggest4539){
                biggest4539=ends[7];
              }
              if(ends[8]>=biggest4539){
                biggest4539=ends[8];
              }
              if(ends[9]>=biggest4539){
                biggest4539=ends[9];
              }
              if(biggest4539 == 1){
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
              S636=2;
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            else {
              switch(S592){
                case 0 : 
                  thread4540(tdone,ends);
                  thread4541(tdone,ends);
                  thread4542(tdone,ends);
                  thread4543(tdone,ends);
                  int biggest4544 = 0;
                  if(ends[6]>=biggest4544){
                    biggest4544=ends[6];
                  }
                  if(ends[7]>=biggest4544){
                    biggest4544=ends[7];
                  }
                  if(ends[8]>=biggest4544){
                    biggest4544=ends[8];
                  }
                  if(ends[9]>=biggest4544){
                    biggest4544=ends[9];
                  }
                  if(biggest4544 == 1){
                    active[5]=1;
                    ends[5]=1;
                    tdone[5]=1;
                  }
                  //FINXME code
                  if(biggest4544 == 0){
                    S592=1;
                    active[5]=1;
                    ends[5]=1;
                    tdone[5]=1;
                  }
                  break;
                
                case 1 : 
                  S592=1;
                  S636=2;
                  active[5]=1;
                  ends[5]=1;
                  tdone[5]=1;
                  break;
                
              }
            }
            break;
          
          case 2 : 
            if(enable.getprestatus()){//sysj\plant.sysj line: 147, column: 12
              S636=3;
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
            S636=3;
            S636=4;
            thread4545(tdone,ends);
            thread4546(tdone,ends);
            int biggest4547 = 0;
            if(ends[10]>=biggest4547){
              biggest4547=ends[10];
            }
            if(ends[11]>=biggest4547){
              biggest4547=ends[11];
            }
            //FINXME code
            if(biggest4547 == 0){
              System.out.println("Canister selection");//sysj\plant.sysj line: 150, column: 6
              S636=5;
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            break;
          
          case 4 : 
            thread4548(tdone,ends);
            thread4549(tdone,ends);
            int biggest4550 = 0;
            if(ends[10]>=biggest4550){
              biggest4550=ends[10];
            }
            if(ends[11]>=biggest4550){
              biggest4550=ends[11];
            }
            //FINXME code
            if(biggest4550 == 0){
              System.out.println("Canister selection");//sysj\plant.sysj line: 150, column: 6
              S636=5;
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
                S636=6;
                active[5]=1;
                ends[5]=1;
                tdone[5]=1;
              }
              else {
                System.out.println("Bottle plant filled");//sysj\plant.sysj line: 156, column: 6
                S636=6;
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
              S636=7;
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
            S636=7;
            S656=0;
            active[5]=0;
            ends[5]=0;
            tdone[5]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread4533(int [] tdone, int [] ends){
        switch(S909){
      case 0 : 
        active[4]=0;
        ends[4]=0;
        tdone[4]=1;
        break;
      
      case 1 : 
        switch(S667){
          case 0 : 
            thread4534(tdone,ends);
            thread4551(tdone,ends);
            int biggest4552 = 0;
            if(ends[5]>=biggest4552){
              biggest4552=ends[5];
            }
            if(ends[12]>=biggest4552){
              biggest4552=ends[12];
            }
            if(biggest4552 == 1){
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            //FINXME code
            if(biggest4552 == 0){
              S667=1;
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            break;
          
          case 1 : 
            if(enable.getprestatus()){//sysj\plant.sysj line: 178, column: 12
              S667=2;
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
              S667=0;
              thread4553(tdone,ends);
              thread4554(tdone,ends);
              int biggest4555 = 0;
              if(ends[5]>=biggest4555){
                biggest4555=ends[5];
              }
              if(ends[12]>=biggest4555){
                biggest4555=ends[12];
              }
              if(biggest4555 == 1){
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

  public void thread4532(int [] tdone, int [] ends){
        switch(S550){
      case 0 : 
        active[3]=0;
        ends[3]=0;
        tdone[3]=1;
        break;
      
      case 1 : 
        switch(S536){
          case 0 : 
            switch(S534){
              case 0 : 
                if(!enable.getprestatus()){//sysj\plant.sysj line: 118, column: 11
                  S534=1;
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
                  S536=1;
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
            S536=1;
            S536=0;
            if(bottleAtPos1.getprestatus() && enable.getprestatus()){//sysj\plant.sysj line: 117, column: 12
              S534=0;
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            else {
              S536=1;
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread4531(int [] tdone, int [] ends){
        switch(S530){
      case 0 : 
        active[2]=0;
        ends[2]=0;
        tdone[2]=1;
        break;
      
      case 1 : 
        switch(S460){
          case 0 : 
            if(enable.getprestatus()){//sysj\plant.sysj line: 81, column: 10
              S460=1;
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
              S460=2;
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
            S460=2;
            S460=3;
            bottleAtPos1.setPresent();//sysj\plant.sysj line: 98, column: 6
            currsigs.addElement(bottleAtPos1);
            active[2]=1;
            ends[2]=1;
            tdone[2]=1;
            break;
          
          case 3 : 
            if(valveInjectorOnOff.getprestatus()){//sysj\plant.sysj line: 96, column: 10
              S460=4;
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
              S460=5;
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
              S460=6;
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
              S460=7;
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
            S460=7;
            S460=0;
            active[2]=1;
            ends[2]=1;
            tdone[2]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread4528(int [] tdone, int [] ends){
        S664=1;
    S661=0;
    dosUnitEvac.setPresent();//sysj\plant.sysj line: 168, column: 8
    currsigs.addElement(dosUnitEvac);
    active[12]=1;
    ends[12]=1;
    tdone[12]=1;
  }

  public void thread4527(int [] tdone, int [] ends){
        S656=1;
    S636=0;
    active[5]=1;
    ends[5]=1;
    tdone[5]=1;
  }

  public void thread4526(int [] tdone, int [] ends){
        S909=1;
    S667=0;
    thread4527(tdone,ends);
    thread4528(tdone,ends);
    int biggest4529 = 0;
    if(ends[5]>=biggest4529){
      biggest4529=ends[5];
    }
    if(ends[12]>=biggest4529){
      biggest4529=ends[12];
    }
    if(biggest4529 == 1){
      active[4]=1;
      ends[4]=1;
      tdone[4]=1;
    }
  }

  public void thread4525(int [] tdone, int [] ends){
        S550=1;
    S536=0;
    if(bottleAtPos1.getprestatus() && enable.getprestatus()){//sysj\plant.sysj line: 117, column: 12
      S534=0;
      active[3]=1;
      ends[3]=1;
      tdone[3]=1;
    }
    else {
      S536=1;
      active[3]=1;
      ends[3]=1;
      tdone[3]=1;
    }
  }

  public void thread4524(int [] tdone, int [] ends){
        S530=1;
    S460=0;
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
      switch(S4522){
        case 0 : 
          S4522=0;
          break RUN;
        
        case 1 : 
          S4522=2;
          S4522=2;
          new Thread(new GUI()).start();//sysj\plant.sysj line: 70, column: 2
          capDec_1.setClear();//sysj\plant.sysj line: 72, column: 2
          capPos_1.setClear();//sysj\plant.sysj line: 73, column: 2
          capPos_1.setPresent();//sysj\plant.sysj line: 74, column: 2
          currsigs.addElement(capPos_1);
          capPos_1.setValue(0);//sysj\plant.sysj line: 74, column: 2
          S1363=0;
          thread4524(tdone,ends);
          thread4525(tdone,ends);
          thread4526(tdone,ends);
          int biggest4530 = 0;
          if(ends[2]>=biggest4530){
            biggest4530=ends[2];
          }
          if(ends[3]>=biggest4530){
            biggest4530=ends[3];
          }
          if(ends[4]>=biggest4530){
            biggest4530=ends[4];
          }
          if(biggest4530 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
        
        case 2 : 
          capDec_1.setClear();//sysj\plant.sysj line: 72, column: 2
          capPos_1.setClear();//sysj\plant.sysj line: 73, column: 2
          switch(S1363){
            case 0 : 
              thread4531(tdone,ends);
              thread4532(tdone,ends);
              thread4533(tdone,ends);
              int biggest4556 = 0;
              if(ends[2]>=biggest4556){
                biggest4556=ends[2];
              }
              if(ends[3]>=biggest4556){
                biggest4556=ends[3];
              }
              if(ends[4]>=biggest4556){
                biggest4556=ends[4];
              }
              if(biggest4556 == 1){
                active[1]=1;
                ends[1]=1;
                break RUN;
              }
              //FINXME code
              if(biggest4556 == 0){
                S1363=1;
                thread4557(tdone,ends);
                thread4558(tdone,ends);
                thread4559(tdone,ends);
                thread4560(tdone,ends);
                thread4561(tdone,ends);
                thread4562(tdone,ends);
                thread4563(tdone,ends);
                thread4564(tdone,ends);
                int biggest4569 = 0;
                if(ends[13]>=biggest4569){
                  biggest4569=ends[13];
                }
                if(ends[14]>=biggest4569){
                  biggest4569=ends[14];
                }
                if(ends[15]>=biggest4569){
                  biggest4569=ends[15];
                }
                if(ends[16]>=biggest4569){
                  biggest4569=ends[16];
                }
                if(ends[17]>=biggest4569){
                  biggest4569=ends[17];
                }
                if(ends[18]>=biggest4569){
                  biggest4569=ends[18];
                }
                if(ends[19]>=biggest4569){
                  biggest4569=ends[19];
                }
                if(ends[20]>=biggest4569){
                  biggest4569=ends[20];
                }
                if(biggest4569 == 1){
                  active[1]=1;
                  ends[1]=1;
                  break RUN;
                }
              }
            
            case 1 : 
              thread4570(tdone,ends);
              thread4571(tdone,ends);
              thread4572(tdone,ends);
              thread4573(tdone,ends);
              thread4574(tdone,ends);
              thread4575(tdone,ends);
              thread4576(tdone,ends);
              thread4577(tdone,ends);
              int biggest4582 = 0;
              if(ends[13]>=biggest4582){
                biggest4582=ends[13];
              }
              if(ends[14]>=biggest4582){
                biggest4582=ends[14];
              }
              if(ends[15]>=biggest4582){
                biggest4582=ends[15];
              }
              if(ends[16]>=biggest4582){
                biggest4582=ends[16];
              }
              if(ends[17]>=biggest4582){
                biggest4582=ends[17];
              }
              if(ends[18]>=biggest4582){
                biggest4582=ends[18];
              }
              if(ends[19]>=biggest4582){
                biggest4582=ends[19];
              }
              if(ends[20]>=biggest4582){
                biggest4582=ends[20];
              }
              if(biggest4582 == 1){
                active[1]=1;
                ends[1]=1;
                break RUN;
              }
              //FINXME code
              if(biggest4582 == 0){
                S4522=0;
                active[1]=0;
                ends[1]=0;
                S4522=0;
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
