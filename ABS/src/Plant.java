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
  public Signal tableAlignedWithSensor = new Signal("tableAlignedWithSensor", Signal.OUTPUT);
  public Signal capOnBottleAtPos1 = new Signal("capOnBottleAtPos1", Signal.OUTPUT);
  public Signal bottleAtPos4 = new Signal("bottleAtPos4", Signal.OUTPUT);
  public Signal bottleAtPos3 = new Signal("bottleAtPos3", Signal.OUTPUT);
  public Signal moveToPos5 = new Signal("moveToPos5", Signal.OUTPUT);
  public Signal moveToPos4 = new Signal("moveToPos4", Signal.OUTPUT);
  public Signal moveToPos3 = new Signal("moveToPos3", Signal.OUTPUT);
  public Signal moveToPos2 = new Signal("moveToPos2", Signal.OUTPUT);
  private Integer numCutOff_thread_13;//sysj\plant.sysj line: 365, column: 5
  private Integer randNum_thread_13;//sysj\plant.sysj line: 368, column: 7
  private int S1664 = 1;
  private int S273 = 1;
  private int S178 = 1;
  private int S171 = 1;
  private int S632 = 1;
  private int S390 = 1;
  private int S379 = 1;
  private int S359 = 1;
  private int S315 = 1;
  private int S279 = 1;
  private int S284 = 1;
  private int S289 = 1;
  private int S294 = 1;
  private int S364 = 1;
  private int S363 = 1;
  private int S387 = 1;
  private int S384 = 1;
  private int S736 = 1;
  private int S666 = 1;
  private int S638 = 1;
  private int S888 = 1;
  private int S757 = 1;
  private int S914 = 1;
  private int S896 = 1;
  private int S904 = 1;
  private int S912 = 1;
  
  private int[] ends = new int[18];
  private int[] tdone = new int[18];
  
  public void thread1708(int [] tdone, int [] ends){
        switch(S912){
      case 0 : 
        active[17]=0;
        ends[17]=0;
        tdone[17]=1;
        break;
      
      case 1 : 
        if(bottleAtPos5.getprestatus()){//sysj\plant.sysj line: 395, column: 25
          bottleAtPos5E.setPresent();//sysj\plant.sysj line: 395, column: 39
          currsigs.addElement(bottleAtPos5E);
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
      
    }
  }

  public void thread1707(int [] tdone, int [] ends){
        switch(S904){
      case 0 : 
        active[16]=0;
        ends[16]=0;
        tdone[16]=1;
        break;
      
      case 1 : 
        if(bottleAtPos1.getprestatus()){//sysj\plant.sysj line: 393, column: 24
          bottleAtPos1E.setPresent();//sysj\plant.sysj line: 393, column: 38
          currsigs.addElement(bottleAtPos1E);
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

  public void thread1706(int [] tdone, int [] ends){
        switch(S896){
      case 0 : 
        active[15]=0;
        ends[15]=0;
        tdone[15]=1;
        break;
      
      case 1 : 
        if(motConveyorOnOff.getprestatus()){//sysj\plant.sysj line: 391, column: 25
          motConveyorOnOffE.setPresent();//sysj\plant.sysj line: 391, column: 43
          currsigs.addElement(motConveyorOnOffE);
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
      
    }
  }

  public void thread1705(int [] tdone, int [] ends){
        switch(S914){
      case 0 : 
        active[14]=0;
        ends[14]=0;
        tdone[14]=1;
        break;
      
      case 1 : 
        thread1706(tdone,ends);
        thread1707(tdone,ends);
        thread1708(tdone,ends);
        int biggest1709 = 0;
        if(ends[15]>=biggest1709){
          biggest1709=ends[15];
        }
        if(ends[16]>=biggest1709){
          biggest1709=ends[16];
        }
        if(ends[17]>=biggest1709){
          biggest1709=ends[17];
        }
        if(biggest1709 == 1){
          active[14]=1;
          ends[14]=1;
          tdone[14]=1;
        }
        //FINXME code
        if(biggest1709 == 0){
          S914=0;
          active[14]=0;
          ends[14]=0;
          tdone[14]=1;
        }
        break;
      
    }
  }

  public void thread1704(int [] tdone, int [] ends){
        switch(S888){
      case 0 : 
        active[13]=0;
        ends[13]=0;
        tdone[13]=1;
        break;
      
      case 1 : 
        switch(S757){
          case 0 : 
            if(removeBottle.getprestatus()){//sysj\plant.sysj line: 371, column: 14
              S757=1;
              active[13]=1;
              ends[13]=1;
              tdone[13]=1;
            }
            else {
              capOnBottleAtPos1.setPresent();//sysj\plant.sysj line: 373, column: 9
              currsigs.addElement(capOnBottleAtPos1);
              active[13]=1;
              ends[13]=1;
              tdone[13]=1;
            }
            break;
          
          case 1 : 
            S757=1;
            S757=2;
            active[13]=1;
            ends[13]=1;
            tdone[13]=1;
            break;
          
          case 2 : 
            if(enable.getprestatus()){//sysj\plant.sysj line: 378, column: 12
              S757=3;
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
          
          case 3 : 
            if(!enable.getprestatus()){//sysj\plant.sysj line: 379, column: 12
              S757=0;
              if(bottleAtPos1.getprestatus() && enable.getprestatus()){//sysj\plant.sysj line: 367, column: 14
                randNum_thread_13 = (int)(Math.random() * 100);//sysj\plant.sysj line: 368, column: 7
                System.out.println("Random Number is " + String.valueOf(randNum_thread_13));//sysj\plant.sysj line: 369, column: 7
                if(randNum_thread_13 > numCutOff_thread_13){//sysj\plant.sysj line: 370, column: 10
                  System.out.println("remove the bottle plz");//sysj\plant.sysj line: 372, column: 9
                  capOnBottleAtPos1.setPresent();//sysj\plant.sysj line: 373, column: 9
                  currsigs.addElement(capOnBottleAtPos1);
                  active[13]=1;
                  ends[13]=1;
                  tdone[13]=1;
                }
                else {
                  S757=1;
                  active[13]=1;
                  ends[13]=1;
                  tdone[13]=1;
                }
              }
              else {
                S757=1;
                active[13]=1;
                ends[13]=1;
                tdone[13]=1;
              }
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

  public void thread1703(int [] tdone, int [] ends){
        switch(S736){
      case 0 : 
        active[12]=0;
        ends[12]=0;
        tdone[12]=1;
        break;
      
      case 1 : 
        switch(S666){
          case 0 : 
            switch(S638){
              case 0 : 
                if(!enable.getprestatus()){//sysj\plant.sysj line: 323, column: 12
                  if(bottleAtPos4.getprestatus()){//sysj\plant.sysj line: 325, column: 14
                    System.out.println("moving bottle at pos 4 to pos 5");//sysj\plant.sysj line: 326, column: 7
                    moveToPos5.setPresent();//sysj\plant.sysj line: 327, column: 7
                    currsigs.addElement(moveToPos5);
                    S638=1;
                    active[12]=1;
                    ends[12]=1;
                    tdone[12]=1;
                  }
                  else {
                    S638=1;
                    active[12]=1;
                    ends[12]=1;
                    tdone[12]=1;
                  }
                }
                else {
                  active[12]=1;
                  ends[12]=1;
                  tdone[12]=1;
                }
                break;
              
              case 1 : 
                if(enable.getprestatus()){//sysj\plant.sysj line: 329, column: 12
                  if(bottleAtPos3.getprestatus()){//sysj\plant.sysj line: 331, column: 14
                    System.out.println("moving bottle at pos 3 to pos 4");//sysj\plant.sysj line: 332, column: 7
                    moveToPos4.setPresent();//sysj\plant.sysj line: 333, column: 7
                    currsigs.addElement(moveToPos4);
                    S638=2;
                    active[12]=1;
                    ends[12]=1;
                    tdone[12]=1;
                  }
                  else {
                    S638=2;
                    active[12]=1;
                    ends[12]=1;
                    tdone[12]=1;
                  }
                }
                else {
                  active[12]=1;
                  ends[12]=1;
                  tdone[12]=1;
                }
                break;
              
              case 2 : 
                if(!enable.getprestatus()){//sysj\plant.sysj line: 335, column: 12
                  if(bottleAtPos2.getprestatus()){//sysj\plant.sysj line: 338, column: 14
                    System.out.println("moving bottle at pos 2 to pos 3");//sysj\plant.sysj line: 339, column: 7
                    moveToPos3.setPresent();//sysj\plant.sysj line: 340, column: 7
                    currsigs.addElement(moveToPos3);
                    S638=3;
                    active[12]=1;
                    ends[12]=1;
                    tdone[12]=1;
                  }
                  else {
                    S638=3;
                    active[12]=1;
                    ends[12]=1;
                    tdone[12]=1;
                  }
                }
                else {
                  active[12]=1;
                  ends[12]=1;
                  tdone[12]=1;
                }
                break;
              
              case 3 : 
                if(enable.getprestatus()){//sysj\plant.sysj line: 342, column: 12
                  if(bottleAtPos1.getprestatus()){//sysj\plant.sysj line: 344, column: 14
                    System.out.println("moving bottle at pos 1 to pos 2");//sysj\plant.sysj line: 345, column: 7
                    moveToPos2.setPresent();//sysj\plant.sysj line: 346, column: 7
                    currsigs.addElement(moveToPos2);
                    S638=4;
                    active[12]=1;
                    ends[12]=1;
                    tdone[12]=1;
                  }
                  else {
                    S638=4;
                    active[12]=1;
                    ends[12]=1;
                    tdone[12]=1;
                  }
                }
                else {
                  active[12]=1;
                  ends[12]=1;
                  tdone[12]=1;
                }
                break;
              
              case 4 : 
                if(enable.getprestatus()){//sysj\plant.sysj line: 348, column: 12
                  S638=5;
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
              
              case 5 : 
                if(!enable.getprestatus()){//sysj\plant.sysj line: 349, column: 12
                  System.out.println("Table has been aligned");//sysj\plant.sysj line: 351, column: 6
                  tableAlignedWithSensor.setPresent();//sysj\plant.sysj line: 352, column: 6
                  currsigs.addElement(tableAlignedWithSensor);
                  S638=6;
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
              
              case 6 : 
                S638=6;
                S666=1;
                active[12]=1;
                ends[12]=1;
                tdone[12]=1;
                break;
              
            }
            break;
          
          case 1 : 
            S666=1;
            S666=0;
            if(rotaryTableTrigger.getprestatus() && enable.getprestatus()){//sysj\plant.sysj line: 319, column: 13
              S638=0;
              active[12]=1;
              ends[12]=1;
              tdone[12]=1;
            }
            else {
              S666=1;
              active[12]=1;
              ends[12]=1;
              tdone[12]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread1701(int [] tdone, int [] ends){
        S387=1;
    S384=0;
    dosUnitEvac.setPresent();//sysj\plant.sysj line: 143, column: 8
    currsigs.addElement(dosUnitEvac);
    active[11]=1;
    ends[11]=1;
    tdone[11]=1;
  }

  public void thread1700(int [] tdone, int [] ends){
        S379=1;
    S359=0;
    active[4]=1;
    ends[4]=1;
    tdone[4]=1;
  }

  public void thread1698(int [] tdone, int [] ends){
        switch(S387){
      case 0 : 
        active[11]=0;
        ends[11]=0;
        tdone[11]=1;
        break;
      
      case 1 : 
        switch(S384){
          case 0 : 
            if(dosUnitValveRetract.getprestatus()){//sysj\plant.sysj line: 142, column: 13
              System.out.println("Canister at top");//sysj\plant.sysj line: 145, column: 7
              S384=1;
              active[11]=1;
              ends[11]=1;
              tdone[11]=1;
            }
            else {
              dosUnitEvac.setPresent();//sysj\plant.sysj line: 143, column: 8
              currsigs.addElement(dosUnitEvac);
              active[11]=1;
              ends[11]=1;
              tdone[11]=1;
            }
            break;
          
          case 1 : 
            if(dosUnitValveExtend.getprestatus()){//sysj\plant.sysj line: 147, column: 13
              System.out.println("Canister at bottom");//sysj\plant.sysj line: 148, column: 7
              S384=2;
              active[11]=1;
              ends[11]=1;
              tdone[11]=1;
            }
            else {
              active[11]=1;
              ends[11]=1;
              tdone[11]=1;
            }
            break;
          
          case 2 : 
            S384=2;
            S387=0;
            active[11]=0;
            ends[11]=0;
            tdone[11]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread1696(int [] tdone, int [] ends){
        active[10]=0;
    ends[10]=0;
    tdone[10]=1;
  }

  public void thread1695(int [] tdone, int [] ends){
        switch(S364){
      case 0 : 
        active[9]=0;
        ends[9]=0;
        tdone[9]=1;
        break;
      
      case 1 : 
        switch(S363){
        }
        break;
      
    }
  }

  public void thread1693(int [] tdone, int [] ends){
        currentlySelectedCanister.setPresent();//sysj\plant.sysj line: 124, column: 36
    currsigs.addElement(currentlySelectedCanister);
    currentlySelectedCanister.setValue(2);//sysj\plant.sysj line: 124, column: 36
    active[10]=0;
    ends[10]=0;
    tdone[10]=1;
  }

  public void thread1692(int [] tdone, int [] ends){
        S364=1;
    selectCanister.setPresent();//sysj\plant.sysj line: 124, column: 7
    currsigs.addElement(selectCanister);
    selectCanister.setValue(2);//sysj\plant.sysj line: 124, column: 7
    S364=0;
    active[9]=0;
    ends[9]=0;
    tdone[9]=1;
  }

  public void thread1690(int [] tdone, int [] ends){
        switch(S294){
      case 0 : 
        active[8]=0;
        ends[8]=0;
        tdone[8]=1;
        break;
      
      case 1 : 
        bottleAtPos2.setPresent();//sysj\plant.sysj line: 118, column: 8
        currsigs.addElement(bottleAtPos2);
        active[8]=1;
        ends[8]=1;
        tdone[8]=1;
        break;
      
    }
  }

  public void thread1689(int [] tdone, int [] ends){
        switch(S289){
      case 0 : 
        active[7]=0;
        ends[7]=0;
        tdone[7]=1;
        break;
      
      case 1 : 
        percentLiquid.setPresent();//sysj\plant.sysj line: 117, column: 8
        currsigs.addElement(percentLiquid);
        active[7]=1;
        ends[7]=1;
        tdone[7]=1;
        break;
      
    }
  }

  public void thread1688(int [] tdone, int [] ends){
        switch(S284){
      case 0 : 
        active[6]=0;
        ends[6]=0;
        tdone[6]=1;
        break;
      
      case 1 : 
        selectCanister.setPresent();//sysj\plant.sysj line: 116, column: 8
        currsigs.addElement(selectCanister);
        active[6]=1;
        ends[6]=1;
        tdone[6]=1;
        break;
      
    }
  }

  public void thread1687(int [] tdone, int [] ends){
        switch(S279){
      case 0 : 
        active[5]=0;
        ends[5]=0;
        tdone[5]=1;
        break;
      
      case 1 : 
        fillerReq.setPresent();//sysj\plant.sysj line: 115, column: 8
        currsigs.addElement(fillerReq);
        active[5]=1;
        ends[5]=1;
        tdone[5]=1;
        break;
      
    }
  }

  public void thread1685(int [] tdone, int [] ends){
        S294=1;
    bottleAtPos2.setPresent();//sysj\plant.sysj line: 118, column: 8
    currsigs.addElement(bottleAtPos2);
    active[8]=1;
    ends[8]=1;
    tdone[8]=1;
  }

  public void thread1684(int [] tdone, int [] ends){
        S289=1;
    percentLiquid.setPresent();//sysj\plant.sysj line: 117, column: 8
    currsigs.addElement(percentLiquid);
    active[7]=1;
    ends[7]=1;
    tdone[7]=1;
  }

  public void thread1683(int [] tdone, int [] ends){
        S284=1;
    selectCanister.setPresent();//sysj\plant.sysj line: 116, column: 8
    currsigs.addElement(selectCanister);
    active[6]=1;
    ends[6]=1;
    tdone[6]=1;
  }

  public void thread1682(int [] tdone, int [] ends){
        S279=1;
    fillerReq.setPresent();//sysj\plant.sysj line: 115, column: 8
    currsigs.addElement(fillerReq);
    active[5]=1;
    ends[5]=1;
    tdone[5]=1;
  }

  public void thread1681(int [] tdone, int [] ends){
        switch(S379){
      case 0 : 
        active[4]=0;
        ends[4]=0;
        tdone[4]=1;
        break;
      
      case 1 : 
        switch(S359){
          case 0 : 
            if(enable.getprestatus()){//sysj\plant.sysj line: 109, column: 12
              S359=1;
              System.out.println("bottle at pos2");//sysj\plant.sysj line: 113, column: 7
              S315=0;
              thread1682(tdone,ends);
              thread1683(tdone,ends);
              thread1684(tdone,ends);
              thread1685(tdone,ends);
              int biggest1686 = 0;
              if(ends[5]>=biggest1686){
                biggest1686=ends[5];
              }
              if(ends[6]>=biggest1686){
                biggest1686=ends[6];
              }
              if(ends[7]>=biggest1686){
                biggest1686=ends[7];
              }
              if(ends[8]>=biggest1686){
                biggest1686=ends[8];
              }
              if(biggest1686 == 1){
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
          
          case 1 : 
            if(!enable.getprestatus()){//sysj\plant.sysj line: 111, column: 12
              S359=2;
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            else {
              switch(S315){
                case 0 : 
                  thread1687(tdone,ends);
                  thread1688(tdone,ends);
                  thread1689(tdone,ends);
                  thread1690(tdone,ends);
                  int biggest1691 = 0;
                  if(ends[5]>=biggest1691){
                    biggest1691=ends[5];
                  }
                  if(ends[6]>=biggest1691){
                    biggest1691=ends[6];
                  }
                  if(ends[7]>=biggest1691){
                    biggest1691=ends[7];
                  }
                  if(ends[8]>=biggest1691){
                    biggest1691=ends[8];
                  }
                  if(biggest1691 == 1){
                    active[4]=1;
                    ends[4]=1;
                    tdone[4]=1;
                  }
                  //FINXME code
                  if(biggest1691 == 0){
                    S315=1;
                    active[4]=1;
                    ends[4]=1;
                    tdone[4]=1;
                  }
                  break;
                
                case 1 : 
                  S315=1;
                  S359=2;
                  active[4]=1;
                  ends[4]=1;
                  tdone[4]=1;
                  break;
                
              }
            }
            break;
          
          case 2 : 
            if(enable.getprestatus()){//sysj\plant.sysj line: 122, column: 12
              S359=3;
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
          
          case 3 : 
            S359=3;
            S359=4;
            thread1692(tdone,ends);
            thread1693(tdone,ends);
            int biggest1694 = 0;
            if(ends[9]>=biggest1694){
              biggest1694=ends[9];
            }
            if(ends[10]>=biggest1694){
              biggest1694=ends[10];
            }
            //FINXME code
            if(biggest1694 == 0){
              System.out.println("Canister selection");//sysj\plant.sysj line: 125, column: 6
              S359=5;
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            break;
          
          case 4 : 
            thread1695(tdone,ends);
            thread1696(tdone,ends);
            int biggest1697 = 0;
            if(ends[9]>=biggest1697){
              biggest1697=ends[9];
            }
            if(ends[10]>=biggest1697){
              biggest1697=ends[10];
            }
            //FINXME code
            if(biggest1697 == 0){
              System.out.println("Canister selection");//sysj\plant.sysj line: 125, column: 6
              S359=5;
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            break;
          
          case 5 : 
            if(enable.getprestatus()){//sysj\plant.sysj line: 127, column: 12
              if(valveInletOnOff.getprestatus()){//sysj\plant.sysj line: 128, column: 14
                dosUnitFilled.setPresent();//sysj\plant.sysj line: 129, column: 7
                currsigs.addElement(dosUnitFilled);
                System.out.println("Bottle plant filled");//sysj\plant.sysj line: 131, column: 6
                S359=6;
                active[4]=1;
                ends[4]=1;
                tdone[4]=1;
              }
              else {
                System.out.println("Bottle plant filled");//sysj\plant.sysj line: 131, column: 6
                S359=6;
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
          
          case 6 : 
            if(enable.getprestatus()){//sysj\plant.sysj line: 132, column: 12
              S359=7;
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
          
          case 7 : 
            S359=7;
            S379=0;
            active[4]=0;
            ends[4]=0;
            tdone[4]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread1680(int [] tdone, int [] ends){
        switch(S632){
      case 0 : 
        active[3]=0;
        ends[3]=0;
        tdone[3]=1;
        break;
      
      case 1 : 
        switch(S390){
          case 0 : 
            thread1681(tdone,ends);
            thread1698(tdone,ends);
            int biggest1699 = 0;
            if(ends[4]>=biggest1699){
              biggest1699=ends[4];
            }
            if(ends[11]>=biggest1699){
              biggest1699=ends[11];
            }
            if(biggest1699 == 1){
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            //FINXME code
            if(biggest1699 == 0){
              S390=1;
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            break;
          
          case 1 : 
            if(enable.getprestatus()){//sysj\plant.sysj line: 153, column: 12
              S390=2;
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
          
          case 2 : 
            if(enable.getprestatus()){//sysj\plant.sysj line: 154, column: 12
              S390=0;
              thread1700(tdone,ends);
              thread1701(tdone,ends);
              int biggest1702 = 0;
              if(ends[4]>=biggest1702){
                biggest1702=ends[4];
              }
              if(ends[11]>=biggest1702){
                biggest1702=ends[11];
              }
              if(biggest1702 == 1){
                active[3]=1;
                ends[3]=1;
                tdone[3]=1;
              }
            }
            else {
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread1679(int [] tdone, int [] ends){
        switch(S273){
      case 0 : 
        active[2]=0;
        ends[2]=0;
        tdone[2]=1;
        break;
      
      case 1 : 
        switch(S178){
          case 0 : 
            if(enable.getprestatus()){//sysj\plant.sysj line: 69, column: 10
              S178=1;
              S171=0;
              bottleAtPos5.setPresent();//sysj\plant.sysj line: 74, column: 5
              currsigs.addElement(bottleAtPos5);
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
            if(!enable.getprestatus()){//sysj\plant.sysj line: 71, column: 10
              S178=2;
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            else {
              switch(S171){
                case 0 : 
                  bottleAtPos5.setPresent();//sysj\plant.sysj line: 74, column: 5
                  currsigs.addElement(bottleAtPos5);
                  active[2]=1;
                  ends[2]=1;
                  tdone[2]=1;
                  break;
                
                case 1 : 
                  S171=1;
                  S178=2;
                  active[2]=1;
                  ends[2]=1;
                  tdone[2]=1;
                  break;
                
              }
            }
            break;
          
          case 2 : 
            if(enable.getprestatus()){//sysj\plant.sysj line: 80, column: 10
              S178=3;
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
          
          case 3 : 
            S178=3;
            S178=4;
            bottleAtPos1.setPresent();//sysj\plant.sysj line: 86, column: 6
            currsigs.addElement(bottleAtPos1);
            active[2]=1;
            ends[2]=1;
            tdone[2]=1;
            break;
          
          case 4 : 
            if(valveInjectorOnOff.getprestatus()){//sysj\plant.sysj line: 84, column: 10
              S178=5;
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            else {
              bottleAtPos1.setPresent();//sysj\plant.sysj line: 86, column: 6
              currsigs.addElement(bottleAtPos1);
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            break;
          
          case 5 : 
            if(!enable.getprestatus()){//sysj\plant.sysj line: 89, column: 10
              S178=6;
              bottleAtPos1.setPresent();//sysj\plant.sysj line: 92, column: 5
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
          
          case 6 : 
            if(enable.getprestatus()){//sysj\plant.sysj line: 91, column: 10
              S178=7;
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            else {
              bottleAtPos1.setPresent();//sysj\plant.sysj line: 92, column: 5
              currsigs.addElement(bottleAtPos1);
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            break;
          
          case 7 : 
            if(enable.getprestatus()){//sysj\plant.sysj line: 96, column: 10
              S178=8;
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
          
          case 8 : 
            S178=8;
            S178=0;
            active[2]=1;
            ends[2]=1;
            tdone[2]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread1676(int [] tdone, int [] ends){
        S912=1;
    if(bottleAtPos5.getprestatus()){//sysj\plant.sysj line: 395, column: 25
      bottleAtPos5E.setPresent();//sysj\plant.sysj line: 395, column: 39
      currsigs.addElement(bottleAtPos5E);
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

  public void thread1675(int [] tdone, int [] ends){
        S904=1;
    if(bottleAtPos1.getprestatus()){//sysj\plant.sysj line: 393, column: 24
      bottleAtPos1E.setPresent();//sysj\plant.sysj line: 393, column: 38
      currsigs.addElement(bottleAtPos1E);
      active[16]=1;
      ends[16]=1;
      tdone[16]=1;
    }
    else {
      active[16]=1;
      ends[16]=1;
      tdone[16]=1;
    }
  }

  public void thread1674(int [] tdone, int [] ends){
        S896=1;
    if(motConveyorOnOff.getprestatus()){//sysj\plant.sysj line: 391, column: 25
      motConveyorOnOffE.setPresent();//sysj\plant.sysj line: 391, column: 43
      currsigs.addElement(motConveyorOnOffE);
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

  public void thread1673(int [] tdone, int [] ends){
        S914=1;
    thread1674(tdone,ends);
    thread1675(tdone,ends);
    thread1676(tdone,ends);
    int biggest1677 = 0;
    if(ends[15]>=biggest1677){
      biggest1677=ends[15];
    }
    if(ends[16]>=biggest1677){
      biggest1677=ends[16];
    }
    if(ends[17]>=biggest1677){
      biggest1677=ends[17];
    }
    if(biggest1677 == 1){
      active[14]=1;
      ends[14]=1;
      tdone[14]=1;
    }
  }

  public void thread1672(int [] tdone, int [] ends){
        S888=1;
    numCutOff_thread_13 = 80;//sysj\plant.sysj line: 365, column: 5
    S757=0;
    if(bottleAtPos1.getprestatus() && enable.getprestatus()){//sysj\plant.sysj line: 367, column: 14
      randNum_thread_13 = (int)(Math.random() * 100);//sysj\plant.sysj line: 368, column: 7
      System.out.println("Random Number is " + String.valueOf(randNum_thread_13));//sysj\plant.sysj line: 369, column: 7
      if(randNum_thread_13 > numCutOff_thread_13){//sysj\plant.sysj line: 370, column: 10
        System.out.println("remove the bottle plz");//sysj\plant.sysj line: 372, column: 9
        capOnBottleAtPos1.setPresent();//sysj\plant.sysj line: 373, column: 9
        currsigs.addElement(capOnBottleAtPos1);
        active[13]=1;
        ends[13]=1;
        tdone[13]=1;
      }
      else {
        S757=1;
        active[13]=1;
        ends[13]=1;
        tdone[13]=1;
      }
    }
    else {
      S757=1;
      active[13]=1;
      ends[13]=1;
      tdone[13]=1;
    }
  }

  public void thread1671(int [] tdone, int [] ends){
        S736=1;
    S666=0;
    if(rotaryTableTrigger.getprestatus() && enable.getprestatus()){//sysj\plant.sysj line: 319, column: 13
      S638=0;
      active[12]=1;
      ends[12]=1;
      tdone[12]=1;
    }
    else {
      S666=1;
      active[12]=1;
      ends[12]=1;
      tdone[12]=1;
    }
  }

  public void thread1669(int [] tdone, int [] ends){
        S387=1;
    S384=0;
    dosUnitEvac.setPresent();//sysj\plant.sysj line: 143, column: 8
    currsigs.addElement(dosUnitEvac);
    active[11]=1;
    ends[11]=1;
    tdone[11]=1;
  }

  public void thread1668(int [] tdone, int [] ends){
        S379=1;
    S359=0;
    active[4]=1;
    ends[4]=1;
    tdone[4]=1;
  }

  public void thread1667(int [] tdone, int [] ends){
        S632=1;
    S390=0;
    thread1668(tdone,ends);
    thread1669(tdone,ends);
    int biggest1670 = 0;
    if(ends[4]>=biggest1670){
      biggest1670=ends[4];
    }
    if(ends[11]>=biggest1670){
      biggest1670=ends[11];
    }
    if(biggest1670 == 1){
      active[3]=1;
      ends[3]=1;
      tdone[3]=1;
    }
  }

  public void thread1666(int [] tdone, int [] ends){
        S273=1;
    S178=0;
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
      switch(S1664){
        case 0 : 
          S1664=0;
          break RUN;
        
        case 1 : 
          S1664=2;
          S1664=2;
          new Thread(new GUI()).start();//sysj\plant.sysj line: 59, column: 2
          thread1666(tdone,ends);
          thread1667(tdone,ends);
          thread1671(tdone,ends);
          thread1672(tdone,ends);
          thread1673(tdone,ends);
          int biggest1678 = 0;
          if(ends[2]>=biggest1678){
            biggest1678=ends[2];
          }
          if(ends[3]>=biggest1678){
            biggest1678=ends[3];
          }
          if(ends[12]>=biggest1678){
            biggest1678=ends[12];
          }
          if(ends[13]>=biggest1678){
            biggest1678=ends[13];
          }
          if(ends[14]>=biggest1678){
            biggest1678=ends[14];
          }
          if(biggest1678 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
        
        case 2 : 
          thread1679(tdone,ends);
          thread1680(tdone,ends);
          thread1703(tdone,ends);
          thread1704(tdone,ends);
          thread1705(tdone,ends);
          int biggest1710 = 0;
          if(ends[2]>=biggest1710){
            biggest1710=ends[2];
          }
          if(ends[3]>=biggest1710){
            biggest1710=ends[3];
          }
          if(ends[12]>=biggest1710){
            biggest1710=ends[12];
          }
          if(ends[13]>=biggest1710){
            biggest1710=ends[13];
          }
          if(ends[14]>=biggest1710){
            biggest1710=ends[14];
          }
          if(biggest1710 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
          //FINXME code
          if(biggest1710 == 0){
            S1664=0;
            active[1]=0;
            ends[1]=0;
            S1664=0;
            break RUN;
          }
        
      }
    }
  }

  public void init(){
    char [] active1 = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
    char [] paused1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    char [] suspended1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    paused = paused1;
    active = active1;
    suspended = suspended1;
    // Now instantiate all the local signals ONLY
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
      tableAlignedWithSensor.setpreclear();
      capOnBottleAtPos1.setpreclear();
      bottleAtPos4.setpreclear();
      bottleAtPos3.setpreclear();
      moveToPos5.setpreclear();
      moveToPos4.setpreclear();
      moveToPos3.setpreclear();
      moveToPos2.setpreclear();
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
      tableAlignedWithSensor.sethook();
      tableAlignedWithSensor.setClear();
      capOnBottleAtPos1.sethook();
      capOnBottleAtPos1.setClear();
      bottleAtPos4.sethook();
      bottleAtPos4.setClear();
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
