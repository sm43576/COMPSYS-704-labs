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
  public Signal rotaryTableTrigger = new Signal("rotaryTableTrigger", Signal.INPUT);
  public Signal bottleAtPos1 = new Signal("bottleAtPos1", Signal.OUTPUT);
  public Signal bottleAtPos5 = new Signal("bottleAtPos5", Signal.OUTPUT);
  public Signal RTbottleAtPos1 = new Signal("RTbottleAtPos1", Signal.OUTPUT);
  public Signal bottleAtPos1E = new Signal("bottleAtPos1E", Signal.OUTPUT);
  public Signal bottleAtPos5E = new Signal("bottleAtPos5E", Signal.OUTPUT);
  public Signal motConveyorOnOffE = new Signal("motConveyorOnOffE", Signal.OUTPUT);
  public Signal tableAlignedWithSensor = new Signal("tableAlignedWithSensor", Signal.OUTPUT);
  public Signal capOnBottleAtPos1 = new Signal("capOnBottleAtPos1", Signal.OUTPUT);
  public Signal bottleAtPos4 = new Signal("bottleAtPos4", Signal.OUTPUT);
  public Signal bottleAtPos3 = new Signal("bottleAtPos3", Signal.OUTPUT);
  public Signal bottleAtPos2 = new Signal("bottleAtPos2", Signal.OUTPUT);
  public Signal moveToPos5 = new Signal("moveToPos5", Signal.OUTPUT);
  public Signal moveToPos4 = new Signal("moveToPos4", Signal.OUTPUT);
  public Signal moveToPos3 = new Signal("moveToPos3", Signal.OUTPUT);
  public Signal moveToPos2 = new Signal("moveToPos2", Signal.OUTPUT);
  private int bottlePos_thread_6;//sysj\plant.sysj line: 211, column: 3
  private Integer numCutOff_thread_7;//sysj\plant.sysj line: 268, column: 4
  private Integer randNum_thread_7;//sysj\plant.sysj line: 271, column: 6
  private int S1061 = 1;
  private int S169 = 1;
  private int S97 = 1;
  private int S189 = 1;
  private int S175 = 1;
  private int S173 = 1;
  private int S191 = 1;
  private int S193 = 1;
  private int S399 = 1;
  private int S227 = 1;
  private int S199 = 1;
  private int S551 = 1;
  private int S420 = 1;
  private int S577 = 1;
  private int S559 = 1;
  private int S567 = 1;
  private int S575 = 1;
  
  private int[] ends = new int[12];
  private int[] tdone = new int[12];
  
  public void thread1084(int [] tdone, int [] ends){
        switch(S575){
      case 0 : 
        active[11]=0;
        ends[11]=0;
        tdone[11]=1;
        break;
      
      case 1 : 
        if(bottleAtPos5.getprestatus()){//sysj\plant.sysj line: 300, column: 25
          bottleAtPos5E.setPresent();//sysj\plant.sysj line: 300, column: 39
          currsigs.addElement(bottleAtPos5E);
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
      
    }
  }

  public void thread1083(int [] tdone, int [] ends){
        switch(S567){
      case 0 : 
        active[10]=0;
        ends[10]=0;
        tdone[10]=1;
        break;
      
      case 1 : 
        if(bottleAtPos1.getprestatus()){//sysj\plant.sysj line: 298, column: 24
          bottleAtPos1E.setPresent();//sysj\plant.sysj line: 298, column: 38
          currsigs.addElement(bottleAtPos1E);
          active[10]=1;
          ends[10]=1;
          tdone[10]=1;
        }
        else {
          active[10]=1;
          ends[10]=1;
          tdone[10]=1;
        }
        break;
      
    }
  }

  public void thread1082(int [] tdone, int [] ends){
        switch(S559){
      case 0 : 
        active[9]=0;
        ends[9]=0;
        tdone[9]=1;
        break;
      
      case 1 : 
        if(motConveyorOnOff.getprestatus()){//sysj\plant.sysj line: 296, column: 25
          motConveyorOnOffE.setPresent();//sysj\plant.sysj line: 296, column: 43
          currsigs.addElement(motConveyorOnOffE);
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
      
    }
  }

  public void thread1081(int [] tdone, int [] ends){
        switch(S577){
      case 0 : 
        active[8]=0;
        ends[8]=0;
        tdone[8]=1;
        break;
      
      case 1 : 
        thread1082(tdone,ends);
        thread1083(tdone,ends);
        thread1084(tdone,ends);
        int biggest1085 = 0;
        if(ends[9]>=biggest1085){
          biggest1085=ends[9];
        }
        if(ends[10]>=biggest1085){
          biggest1085=ends[10];
        }
        if(ends[11]>=biggest1085){
          biggest1085=ends[11];
        }
        if(biggest1085 == 1){
          active[8]=1;
          ends[8]=1;
          tdone[8]=1;
        }
        //FINXME code
        if(biggest1085 == 0){
          S577=0;
          active[8]=0;
          ends[8]=0;
          tdone[8]=1;
        }
        break;
      
    }
  }

  public void thread1080(int [] tdone, int [] ends){
        switch(S551){
      case 0 : 
        active[7]=0;
        ends[7]=0;
        tdone[7]=1;
        break;
      
      case 1 : 
        switch(S420){
          case 0 : 
            if(removeBottle.getprestatus()){//sysj\plant.sysj line: 274, column: 13
              S420=1;
              active[7]=1;
              ends[7]=1;
              tdone[7]=1;
            }
            else {
              capOnBottleAtPos1.setPresent();//sysj\plant.sysj line: 276, column: 8
              currsigs.addElement(capOnBottleAtPos1);
              active[7]=1;
              ends[7]=1;
              tdone[7]=1;
            }
            break;
          
          case 1 : 
            S420=1;
            S420=2;
            active[7]=1;
            ends[7]=1;
            tdone[7]=1;
            break;
          
          case 2 : 
            if(enable.getprestatus()){//sysj\plant.sysj line: 281, column: 11
              S420=3;
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
          
          case 3 : 
            if(!enable.getprestatus()){//sysj\plant.sysj line: 282, column: 11
              S420=0;
              if(RTbottleAtPos1.getprestatus() && enable.getprestatus()){//sysj\plant.sysj line: 270, column: 13
                randNum_thread_7 = (int)(Math.random() * 100);//sysj\plant.sysj line: 271, column: 6
                System.out.println("Random Number is " + String.valueOf(randNum_thread_7));//sysj\plant.sysj line: 272, column: 6
                if(randNum_thread_7 > numCutOff_thread_7){//sysj\plant.sysj line: 273, column: 9
                  System.out.println("remove the bottle plz");//sysj\plant.sysj line: 275, column: 8
                  capOnBottleAtPos1.setPresent();//sysj\plant.sysj line: 276, column: 8
                  currsigs.addElement(capOnBottleAtPos1);
                  active[7]=1;
                  ends[7]=1;
                  tdone[7]=1;
                }
                else {
                  S420=1;
                  active[7]=1;
                  ends[7]=1;
                  tdone[7]=1;
                }
              }
              else {
                S420=1;
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
          
        }
        break;
      
    }
  }

  public void thread1079(int [] tdone, int [] ends){
        switch(S399){
      case 0 : 
        active[6]=0;
        ends[6]=0;
        tdone[6]=1;
        break;
      
      case 1 : 
        switch(S227){
          case 0 : 
            switch(S199){
              case 0 : 
                if(!enable.getprestatus()){//sysj\plant.sysj line: 217, column: 11
                  if(bottleAtPos4.getprestatus()){//sysj\plant.sysj line: 219, column: 13
                    System.out.println("moving bottle at pos 4 to pos 5");//sysj\plant.sysj line: 220, column: 6
                    moveToPos5.setPresent();//sysj\plant.sysj line: 221, column: 6
                    currsigs.addElement(moveToPos5);
                    System.out.println("bottle is now at pos 5");//sysj\plant.sysj line: 222, column: 6
                    bottleAtPos5.setPresent();//sysj\plant.sysj line: 223, column: 6
                    currsigs.addElement(bottleAtPos5);
                    S199=1;
                    active[6]=1;
                    ends[6]=1;
                    tdone[6]=1;
                  }
                  else {
                    S199=1;
                    active[6]=1;
                    ends[6]=1;
                    tdone[6]=1;
                  }
                }
                else {
                  active[6]=1;
                  ends[6]=1;
                  tdone[6]=1;
                }
                break;
              
              case 1 : 
                if(enable.getprestatus()){//sysj\plant.sysj line: 225, column: 11
                  if(bottleAtPos3.getprestatus()){//sysj\plant.sysj line: 227, column: 13
                    System.out.println("moving bottle at pos 3 to pos 4");//sysj\plant.sysj line: 228, column: 6
                    moveToPos4.setPresent();//sysj\plant.sysj line: 229, column: 6
                    currsigs.addElement(moveToPos4);
                    System.out.println("bottle is now at pos 4");//sysj\plant.sysj line: 230, column: 6
                    bottleAtPos4.setPresent();//sysj\plant.sysj line: 231, column: 6
                    currsigs.addElement(bottleAtPos4);
                    S199=2;
                    active[6]=1;
                    ends[6]=1;
                    tdone[6]=1;
                  }
                  else {
                    S199=2;
                    active[6]=1;
                    ends[6]=1;
                    tdone[6]=1;
                  }
                }
                else {
                  active[6]=1;
                  ends[6]=1;
                  tdone[6]=1;
                }
                break;
              
              case 2 : 
                if(!enable.getprestatus()){//sysj\plant.sysj line: 233, column: 11
                  if(bottleAtPos2.getprestatus()){//sysj\plant.sysj line: 236, column: 13
                    System.out.println("moving bottle at pos 2 to pos 3");//sysj\plant.sysj line: 237, column: 6
                    moveToPos3.setPresent();//sysj\plant.sysj line: 238, column: 6
                    currsigs.addElement(moveToPos3);
                    System.out.println("bottle is now at pos 3");//sysj\plant.sysj line: 239, column: 6
                    bottleAtPos3.setPresent();//sysj\plant.sysj line: 240, column: 6
                    currsigs.addElement(bottleAtPos3);
                    S199=3;
                    active[6]=1;
                    ends[6]=1;
                    tdone[6]=1;
                  }
                  else {
                    S199=3;
                    active[6]=1;
                    ends[6]=1;
                    tdone[6]=1;
                  }
                }
                else {
                  active[6]=1;
                  ends[6]=1;
                  tdone[6]=1;
                }
                break;
              
              case 3 : 
                if(enable.getprestatus()){//sysj\plant.sysj line: 242, column: 11
                  System.out.println("CHECK POS 1???");//sysj\plant.sysj line: 244, column: 5
                  if(bottleAtPos1.getprestatus()){//sysj\plant.sysj line: 245, column: 13
                    System.out.println("moving bottle at pos 1 to pos 2");//sysj\plant.sysj line: 246, column: 6
                    moveToPos2.setPresent();//sysj\plant.sysj line: 247, column: 6
                    currsigs.addElement(moveToPos2);
                    System.out.println("bottle is now at pos 2");//sysj\plant.sysj line: 248, column: 6
                    bottleAtPos2.setPresent();//sysj\plant.sysj line: 249, column: 6
                    currsigs.addElement(bottleAtPos2);
                    S199=4;
                    active[6]=1;
                    ends[6]=1;
                    tdone[6]=1;
                  }
                  else {
                    S199=4;
                    active[6]=1;
                    ends[6]=1;
                    tdone[6]=1;
                  }
                }
                else {
                  active[6]=1;
                  ends[6]=1;
                  tdone[6]=1;
                }
                break;
              
              case 4 : 
                if(enable.getprestatus()){//sysj\plant.sysj line: 251, column: 11
                  S199=5;
                  active[6]=1;
                  ends[6]=1;
                  tdone[6]=1;
                }
                else {
                  active[6]=1;
                  ends[6]=1;
                  tdone[6]=1;
                }
                break;
              
              case 5 : 
                if(!enable.getprestatus()){//sysj\plant.sysj line: 252, column: 11
                  System.out.println("Table has been aligned");//sysj\plant.sysj line: 254, column: 5
                  tableAlignedWithSensor.setPresent();//sysj\plant.sysj line: 255, column: 5
                  currsigs.addElement(tableAlignedWithSensor);
                  S199=6;
                  active[6]=1;
                  ends[6]=1;
                  tdone[6]=1;
                }
                else {
                  active[6]=1;
                  ends[6]=1;
                  tdone[6]=1;
                }
                break;
              
              case 6 : 
                S199=6;
                S227=1;
                active[6]=1;
                ends[6]=1;
                tdone[6]=1;
                break;
              
            }
            break;
          
          case 1 : 
            S227=1;
            S227=0;
            if(rotaryTableTrigger.getprestatus() && enable.getprestatus()){//sysj\plant.sysj line: 213, column: 12
              S199=0;
              active[6]=1;
              ends[6]=1;
              tdone[6]=1;
            }
            else {
              S227=1;
              active[6]=1;
              ends[6]=1;
              tdone[6]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread1078(int [] tdone, int [] ends){
        switch(S193){
      case 0 : 
        active[5]=0;
        ends[5]=0;
        tdone[5]=1;
        break;
      
      case 1 : 
        active[5]=1;
        ends[5]=1;
        tdone[5]=1;
        break;
      
    }
  }

  public void thread1077(int [] tdone, int [] ends){
        switch(S191){
      case 0 : 
        active[4]=0;
        ends[4]=0;
        tdone[4]=1;
        break;
      
      case 1 : 
        active[4]=1;
        ends[4]=1;
        tdone[4]=1;
        break;
      
    }
  }

  public void thread1076(int [] tdone, int [] ends){
        switch(S189){
      case 0 : 
        active[3]=0;
        ends[3]=0;
        tdone[3]=1;
        break;
      
      case 1 : 
        switch(S175){
          case 0 : 
            switch(S173){
              case 0 : 
                if(!enable.getprestatus()){//sysj\plant.sysj line: 97, column: 11
                  S173=1;
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
                if(enable.getprestatus()){//sysj\plant.sysj line: 98, column: 11
                  RTbottleAtPos1.setPresent();//sysj\plant.sysj line: 99, column: 5
                  currsigs.addElement(RTbottleAtPos1);
                  S175=1;
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
            S175=1;
            S175=0;
            if(bottleAtPos1.getprestatus() && enable.getprestatus()){//sysj\plant.sysj line: 96, column: 12
              S173=0;
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            else {
              S175=1;
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread1075(int [] tdone, int [] ends){
        switch(S169){
      case 0 : 
        active[2]=0;
        ends[2]=0;
        tdone[2]=1;
        break;
      
      case 1 : 
        switch(S97){
          case 0 : 
            if(enable.getprestatus()){//sysj\plant.sysj line: 58, column: 10
              S97=1;
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
            S97=1;
            S97=2;
            active[2]=1;
            ends[2]=1;
            tdone[2]=1;
            break;
          
          case 2 : 
            if(enable.getprestatus()){//sysj\plant.sysj line: 71, column: 10
              S97=3;
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
            S97=3;
            S97=4;
            System.out.println("sustaining bottle at pos 1");//sysj\plant.sysj line: 76, column: 6
            bottleAtPos1.setPresent();//sysj\plant.sysj line: 77, column: 6
            currsigs.addElement(bottleAtPos1);
            active[2]=1;
            ends[2]=1;
            tdone[2]=1;
            break;
          
          case 4 : 
            if(motConveyorOnOff.getprestatus()){//sysj\plant.sysj line: 75, column: 10
              S97=5;
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            else {
              bottleAtPos1.setPresent();//sysj\plant.sysj line: 77, column: 6
              currsigs.addElement(bottleAtPos1);
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            break;
          
          case 5 : 
            if(!enable.getprestatus()){//sysj\plant.sysj line: 80, column: 10
              S97=6;
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
            if(!enable.getprestatus()){//sysj\plant.sysj line: 87, column: 10
              System.out.println("im outtt");//sysj\plant.sysj line: 88, column: 4
              S97=7;
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
            S97=7;
            S97=0;
            active[2]=1;
            ends[2]=1;
            tdone[2]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread1072(int [] tdone, int [] ends){
        S575=1;
    if(bottleAtPos5.getprestatus()){//sysj\plant.sysj line: 300, column: 25
      bottleAtPos5E.setPresent();//sysj\plant.sysj line: 300, column: 39
      currsigs.addElement(bottleAtPos5E);
      active[11]=1;
      ends[11]=1;
      tdone[11]=1;
    }
    else {
      active[11]=1;
      ends[11]=1;
      tdone[11]=1;
    }
  }

  public void thread1071(int [] tdone, int [] ends){
        S567=1;
    if(bottleAtPos1.getprestatus()){//sysj\plant.sysj line: 298, column: 24
      bottleAtPos1E.setPresent();//sysj\plant.sysj line: 298, column: 38
      currsigs.addElement(bottleAtPos1E);
      active[10]=1;
      ends[10]=1;
      tdone[10]=1;
    }
    else {
      active[10]=1;
      ends[10]=1;
      tdone[10]=1;
    }
  }

  public void thread1070(int [] tdone, int [] ends){
        S559=1;
    if(motConveyorOnOff.getprestatus()){//sysj\plant.sysj line: 296, column: 25
      motConveyorOnOffE.setPresent();//sysj\plant.sysj line: 296, column: 43
      currsigs.addElement(motConveyorOnOffE);
      active[9]=1;
      ends[9]=1;
      tdone[9]=1;
    }
    else {
      active[9]=1;
      ends[9]=1;
      tdone[9]=1;
    }
  }

  public void thread1069(int [] tdone, int [] ends){
        S577=1;
    thread1070(tdone,ends);
    thread1071(tdone,ends);
    thread1072(tdone,ends);
    int biggest1073 = 0;
    if(ends[9]>=biggest1073){
      biggest1073=ends[9];
    }
    if(ends[10]>=biggest1073){
      biggest1073=ends[10];
    }
    if(ends[11]>=biggest1073){
      biggest1073=ends[11];
    }
    if(biggest1073 == 1){
      active[8]=1;
      ends[8]=1;
      tdone[8]=1;
    }
  }

  public void thread1068(int [] tdone, int [] ends){
        S551=1;
    numCutOff_thread_7 = 80;//sysj\plant.sysj line: 268, column: 4
    S420=0;
    if(RTbottleAtPos1.getprestatus() && enable.getprestatus()){//sysj\plant.sysj line: 270, column: 13
      randNum_thread_7 = (int)(Math.random() * 100);//sysj\plant.sysj line: 271, column: 6
      System.out.println("Random Number is " + String.valueOf(randNum_thread_7));//sysj\plant.sysj line: 272, column: 6
      if(randNum_thread_7 > numCutOff_thread_7){//sysj\plant.sysj line: 273, column: 9
        System.out.println("remove the bottle plz");//sysj\plant.sysj line: 275, column: 8
        capOnBottleAtPos1.setPresent();//sysj\plant.sysj line: 276, column: 8
        currsigs.addElement(capOnBottleAtPos1);
        active[7]=1;
        ends[7]=1;
        tdone[7]=1;
      }
      else {
        S420=1;
        active[7]=1;
        ends[7]=1;
        tdone[7]=1;
      }
    }
    else {
      S420=1;
      active[7]=1;
      ends[7]=1;
      tdone[7]=1;
    }
  }

  public void thread1067(int [] tdone, int [] ends){
        S399=1;
    bottlePos_thread_6 = 1;//sysj\plant.sysj line: 211, column: 3
    S227=0;
    if(rotaryTableTrigger.getprestatus() && enable.getprestatus()){//sysj\plant.sysj line: 213, column: 12
      S199=0;
      active[6]=1;
      ends[6]=1;
      tdone[6]=1;
    }
    else {
      S227=1;
      active[6]=1;
      ends[6]=1;
      tdone[6]=1;
    }
  }

  public void thread1066(int [] tdone, int [] ends){
        S193=1;
    active[5]=1;
    ends[5]=1;
    tdone[5]=1;
  }

  public void thread1065(int [] tdone, int [] ends){
        S191=1;
    active[4]=1;
    ends[4]=1;
    tdone[4]=1;
  }

  public void thread1064(int [] tdone, int [] ends){
        S189=1;
    S175=0;
    if(bottleAtPos1.getprestatus() && enable.getprestatus()){//sysj\plant.sysj line: 96, column: 12
      S173=0;
      active[3]=1;
      ends[3]=1;
      tdone[3]=1;
    }
    else {
      S175=1;
      active[3]=1;
      ends[3]=1;
      tdone[3]=1;
    }
  }

  public void thread1063(int [] tdone, int [] ends){
        S169=1;
    S97=0;
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
      switch(S1061){
        case 0 : 
          S1061=0;
          break RUN;
        
        case 1 : 
          S1061=2;
          S1061=2;
          new Thread(new GUI()).start();//sysj\plant.sysj line: 48, column: 2
          thread1063(tdone,ends);
          thread1064(tdone,ends);
          thread1065(tdone,ends);
          thread1066(tdone,ends);
          thread1067(tdone,ends);
          thread1068(tdone,ends);
          thread1069(tdone,ends);
          int biggest1074 = 0;
          if(ends[2]>=biggest1074){
            biggest1074=ends[2];
          }
          if(ends[3]>=biggest1074){
            biggest1074=ends[3];
          }
          if(ends[4]>=biggest1074){
            biggest1074=ends[4];
          }
          if(ends[5]>=biggest1074){
            biggest1074=ends[5];
          }
          if(ends[6]>=biggest1074){
            biggest1074=ends[6];
          }
          if(ends[7]>=biggest1074){
            biggest1074=ends[7];
          }
          if(ends[8]>=biggest1074){
            biggest1074=ends[8];
          }
          if(biggest1074 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
        
        case 2 : 
          thread1075(tdone,ends);
          thread1076(tdone,ends);
          thread1077(tdone,ends);
          thread1078(tdone,ends);
          thread1079(tdone,ends);
          thread1080(tdone,ends);
          thread1081(tdone,ends);
          int biggest1086 = 0;
          if(ends[2]>=biggest1086){
            biggest1086=ends[2];
          }
          if(ends[3]>=biggest1086){
            biggest1086=ends[3];
          }
          if(ends[4]>=biggest1086){
            biggest1086=ends[4];
          }
          if(ends[5]>=biggest1086){
            biggest1086=ends[5];
          }
          if(ends[6]>=biggest1086){
            biggest1086=ends[6];
          }
          if(ends[7]>=biggest1086){
            biggest1086=ends[7];
          }
          if(ends[8]>=biggest1086){
            biggest1086=ends[8];
          }
          if(biggest1086 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
          //FINXME code
          if(biggest1086 == 0){
            S1061=0;
            active[1]=0;
            ends[1]=0;
            S1061=0;
            break RUN;
          }
        
      }
    }
  }

  public void init(){
    char [] active1 = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
    char [] paused1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    char [] suspended1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
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
          rotaryTableTrigger.gethook();
          df = true;
        }
        runClockDomain();
      }
      enable.setpreclear();
      refill.setpreclear();
      removeBottle.setpreclear();
      motConveyorOnOff.setpreclear();
      rotaryTableTrigger.setpreclear();
      bottleAtPos1.setpreclear();
      bottleAtPos5.setpreclear();
      RTbottleAtPos1.setpreclear();
      bottleAtPos1E.setpreclear();
      bottleAtPos5E.setpreclear();
      motConveyorOnOffE.setpreclear();
      tableAlignedWithSensor.setpreclear();
      capOnBottleAtPos1.setpreclear();
      bottleAtPos4.setpreclear();
      bottleAtPos3.setpreclear();
      bottleAtPos2.setpreclear();
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
      tableAlignedWithSensor.sethook();
      tableAlignedWithSensor.setClear();
      capOnBottleAtPos1.sethook();
      capOnBottleAtPos1.setClear();
      bottleAtPos4.sethook();
      bottleAtPos4.setClear();
      bottleAtPos3.sethook();
      bottleAtPos3.setClear();
      bottleAtPos2.sethook();
      bottleAtPos2.setClear();
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
