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
  public Signal motConveyorOnOff = new Signal("motConveyorOnOff", Signal.INPUT);
  public Signal c1 = new Signal("c1", Signal.INPUT);
  public Signal c2 = new Signal("c2", Signal.INPUT);
  public Signal c3 = new Signal("c3", Signal.INPUT);
  public Signal pusherExtend = new Signal("pusherExtend", Signal.INPUT);
  public Signal vacOn = new Signal("vacOn", Signal.INPUT);
  public Signal armSource = new Signal("armSource", Signal.INPUT);
  public Signal armDest = new Signal("armDest", Signal.INPUT);
  public Signal enable = new Signal("enable", Signal.INPUT);
  public Signal refill = new Signal("refill", Signal.INPUT);
  public Signal bottleAtPos1 = new Signal("bottleAtPos1", Signal.OUTPUT);
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
  private Signal capDec_1;
  private Signal capPos_1;
  private int S1153 = 1;
  private int S60 = 1;
  private int S14 = 1;
  private int S113 = 1;
  private int S67 = 1;
  private int S157 = 1;
  private int S127 = 1;
  private int S122 = 1;
  private int S225 = 1;
  private int S179 = 1;
  private int S161 = 1;
  private int S242 = 1;
  private int S292 = 1;
  private int S250 = 1;
  private int S258 = 1;
  private int S266 = 1;
  private int S274 = 1;
  private int S282 = 1;
  private int S290 = 1;
  
  private int[] ends = new int[14];
  private int[] tdone = new int[14];
  
  public void thread1180(int [] tdone, int [] ends){
        switch(S290){
      case 0 : 
        active[13]=0;
        ends[13]=0;
        tdone[13]=1;
        break;
      
      case 1 : 
        if(empty.getprestatus()){//sysj\plant.sysj line: 114, column: 24
          emptyE.setPresent();//sysj\plant.sysj line: 114, column: 31
          currsigs.addElement(emptyE);
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

  public void thread1179(int [] tdone, int [] ends){
        switch(S282){
      case 0 : 
        active[12]=0;
        ends[12]=0;
        tdone[12]=1;
        break;
      
      case 1 : 
        if(armAtDest.getprestatus()){//sysj\plant.sysj line: 112, column: 24
          armAtDestE.setPresent();//sysj\plant.sysj line: 112, column: 35
          currsigs.addElement(armAtDestE);
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

  public void thread1178(int [] tdone, int [] ends){
        switch(S274){
      case 0 : 
        active[11]=0;
        ends[11]=0;
        tdone[11]=1;
        break;
      
      case 1 : 
        if(armAtSource.getprestatus()){//sysj\plant.sysj line: 110, column: 24
          armAtSourceE.setPresent();//sysj\plant.sysj line: 110, column: 37
          currsigs.addElement(armAtSourceE);
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

  public void thread1177(int [] tdone, int [] ends){
        switch(S266){
      case 0 : 
        active[10]=0;
        ends[10]=0;
        tdone[10]=1;
        break;
      
      case 1 : 
        if(WPgripped.getprestatus()){//sysj\plant.sysj line: 108, column: 24
          WPgrippedE.setPresent();//sysj\plant.sysj line: 108, column: 35
          currsigs.addElement(WPgrippedE);
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

  public void thread1176(int [] tdone, int [] ends){
        switch(S258){
      case 0 : 
        active[9]=0;
        ends[9]=0;
        tdone[9]=1;
        break;
      
      case 1 : 
        if(pusherExtended.getprestatus()){//sysj\plant.sysj line: 106, column: 24
          pusherExtendedE.setPresent();//sysj\plant.sysj line: 106, column: 40
          currsigs.addElement(pusherExtendedE);
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

  public void thread1175(int [] tdone, int [] ends){
        switch(S250){
      case 0 : 
        active[8]=0;
        ends[8]=0;
        tdone[8]=1;
        break;
      
      case 1 : 
        if(pusherRetracted.getprestatus()){//sysj\plant.sysj line: 104, column: 24
          pusherRetractedE.setPresent();//sysj\plant.sysj line: 104, column: 41
          currsigs.addElement(pusherRetractedE);
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
      
    }
  }

  public void thread1174(int [] tdone, int [] ends){
        switch(S292){
      case 0 : 
        active[7]=0;
        ends[7]=0;
        tdone[7]=1;
        break;
      
      case 1 : 
        thread1175(tdone,ends);
        thread1176(tdone,ends);
        thread1177(tdone,ends);
        thread1178(tdone,ends);
        thread1179(tdone,ends);
        thread1180(tdone,ends);
        int biggest1181 = 0;
        if(ends[8]>=biggest1181){
          biggest1181=ends[8];
        }
        if(ends[9]>=biggest1181){
          biggest1181=ends[9];
        }
        if(ends[10]>=biggest1181){
          biggest1181=ends[10];
        }
        if(ends[11]>=biggest1181){
          biggest1181=ends[11];
        }
        if(ends[12]>=biggest1181){
          biggest1181=ends[12];
        }
        if(ends[13]>=biggest1181){
          biggest1181=ends[13];
        }
        if(biggest1181 == 1){
          active[7]=1;
          ends[7]=1;
          tdone[7]=1;
        }
        //FINXME code
        if(biggest1181 == 0){
          S292=0;
          active[7]=0;
          ends[7]=0;
          tdone[7]=1;
        }
        break;
      
    }
  }

  public void thread1173(int [] tdone, int [] ends){
        switch(S242){
      case 0 : 
        active[6]=0;
        ends[6]=0;
        tdone[6]=1;
        break;
      
      case 1 : 
        if(c1.getprestatus()){//sysj\plant.sysj line: 90, column: 12
          System.out.println("q");//sysj\plant.sysj line: 91, column: 5
          if(c2.getprestatus()){//sysj\plant.sysj line: 93, column: 12
            System.out.println("1");//sysj\plant.sysj line: 94, column: 5
            System.out.println("2");//sysj\plant.sysj line: 97, column: 5
            active[6]=1;
            ends[6]=1;
            tdone[6]=1;
          }
          else {
            System.out.println("2");//sysj\plant.sysj line: 97, column: 5
            active[6]=1;
            ends[6]=1;
            tdone[6]=1;
          }
        }
        else {
          if(c2.getprestatus()){//sysj\plant.sysj line: 93, column: 12
            System.out.println("1");//sysj\plant.sysj line: 94, column: 5
            System.out.println("2");//sysj\plant.sysj line: 97, column: 5
            active[6]=1;
            ends[6]=1;
            tdone[6]=1;
          }
          else {
            System.out.println("2");//sysj\plant.sysj line: 97, column: 5
            active[6]=1;
            ends[6]=1;
            tdone[6]=1;
          }
        }
        break;
      
    }
  }

  public void thread1172(int [] tdone, int [] ends){
        switch(S225){
      case 0 : 
        active[5]=0;
        ends[5]=0;
        tdone[5]=1;
        break;
      
      case 1 : 
        switch(S179){
          case 0 : 
            if(empty.getprestatus()){//sysj\plant.sysj line: 73, column: 10
              S179=1;
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            else {
              switch(S161){
                case 0 : 
                  if(pusherRetracted.getprestatus()){//sysj\plant.sysj line: 75, column: 13
                    S161=1;
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
                
                case 1 : 
                  if(pusherExtended.getprestatus()){//sysj\plant.sysj line: 76, column: 13
                    capPos_1.setPresent();//sysj\plant.sysj line: 78, column: 7
                    currsigs.addElement(capPos_1);
                    capPos_1.setValue(1);//sysj\plant.sysj line: 78, column: 7
                    S161=2;
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
                
                case 2 : 
                  if(pusherRetracted.getprestatus()){//sysj\plant.sysj line: 79, column: 13
                    capDec_1.setPresent();//sysj\plant.sysj line: 80, column: 7
                    currsigs.addElement(capDec_1);
                    S161=0;
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
            break;
          
          case 1 : 
            if(refill.getprestatus()){//sysj\plant.sysj line: 83, column: 10
              S179=0;
              S161=0;
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
        break;
      
    }
  }

  public void thread1171(int [] tdone, int [] ends){
        switch(S157){
      case 0 : 
        active[4]=0;
        ends[4]=0;
        tdone[4]=1;
        break;
      
      case 1 : 
        switch(S127){
          case 0 : 
            switch(S122){
              case 0 : 
                if(!vacOn.getprestatus()){//sysj\plant.sysj line: 53, column: 12
                  S122=1;
                  if(armAtSource.getprestatus()){//sysj\plant.sysj line: 56, column: 14
                    capPos_1.setPresent();//sysj\plant.sysj line: 57, column: 7
                    currsigs.addElement(capPos_1);
                    capPos_1.setValue(1);//sysj\plant.sysj line: 57, column: 7
                    S127=1;
                    active[4]=1;
                    ends[4]=1;
                    tdone[4]=1;
                  }
                  else {
                    S127=1;
                    active[4]=1;
                    ends[4]=1;
                    tdone[4]=1;
                  }
                }
                else {
                  WPgripped.setPresent();//sysj\plant.sysj line: 54, column: 7
                  currsigs.addElement(WPgripped);
                  active[4]=1;
                  ends[4]=1;
                  tdone[4]=1;
                }
                break;
              
              case 1 : 
                S127=0;
                if(vacOn.getprestatus() && armAtSource.getprestatus()){//sysj\plant.sysj line: 50, column: 12
                  if((Integer)(capPos_1.getpreval() == null ? 0 : ((Integer)capPos_1.getpreval()).intValue()) == 1){//sysj\plant.sysj line: 51, column: 8
                    capPos_1.setPresent();//sysj\plant.sysj line: 52, column: 6
                    currsigs.addElement(capPos_1);
                    capPos_1.setValue(0);//sysj\plant.sysj line: 52, column: 6
                    S122=0;
                    WPgripped.setPresent();//sysj\plant.sysj line: 54, column: 7
                    currsigs.addElement(WPgripped);
                    active[4]=1;
                    ends[4]=1;
                    tdone[4]=1;
                  }
                  else {
                    S127=1;
                    active[4]=1;
                    ends[4]=1;
                    tdone[4]=1;
                  }
                }
                else {
                  S127=1;
                  active[4]=1;
                  ends[4]=1;
                  tdone[4]=1;
                }
                break;
              
            }
            break;
          
          case 1 : 
            S127=1;
            S127=0;
            if(vacOn.getprestatus() && armAtSource.getprestatus()){//sysj\plant.sysj line: 50, column: 12
              if((Integer)(capPos_1.getpreval() == null ? 0 : ((Integer)capPos_1.getpreval()).intValue()) == 1){//sysj\plant.sysj line: 51, column: 8
                capPos_1.setPresent();//sysj\plant.sysj line: 52, column: 6
                currsigs.addElement(capPos_1);
                capPos_1.setValue(0);//sysj\plant.sysj line: 52, column: 6
                S122=0;
                WPgripped.setPresent();//sysj\plant.sysj line: 54, column: 7
                currsigs.addElement(WPgripped);
                active[4]=1;
                ends[4]=1;
                tdone[4]=1;
              }
              else {
                S127=1;
                active[4]=1;
                ends[4]=1;
                tdone[4]=1;
              }
            }
            else {
              S127=1;
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread1170(int [] tdone, int [] ends){
        switch(S113){
      case 0 : 
        active[3]=0;
        ends[3]=0;
        tdone[3]=1;
        break;
      
      case 1 : 
        switch(S67){
          case 0 : 
            if(pusherExtend.getprestatus() && enable.getprestatus()){//sysj\plant.sysj line: 37, column: 10
              S67=1;
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            else {
              pusherRetracted.setPresent();//sysj\plant.sysj line: 38, column: 5
              currsigs.addElement(pusherRetracted);
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            break;
          
          case 1 : 
            if(!enable.getprestatus()){//sysj\plant.sysj line: 40, column: 10
              S67=2;
              pusherExtended.setPresent();//sysj\plant.sysj line: 42, column: 5
              currsigs.addElement(pusherExtended);
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
            if(!pusherExtend.getprestatus() && enable.getprestatus()){//sysj\plant.sysj line: 41, column: 10
              S67=3;
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            else {
              pusherExtended.setPresent();//sysj\plant.sysj line: 42, column: 5
              currsigs.addElement(pusherExtended);
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            break;
          
          case 3 : 
            if(!enable.getprestatus()){//sysj\plant.sysj line: 44, column: 10
              S67=0;
              pusherRetracted.setPresent();//sysj\plant.sysj line: 38, column: 5
              currsigs.addElement(pusherRetracted);
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
      
    }
  }

  public void thread1169(int [] tdone, int [] ends){
        switch(S60){
      case 0 : 
        active[2]=0;
        ends[2]=0;
        tdone[2]=1;
        break;
      
      case 1 : 
        switch(S14){
          case 0 : 
            if(armSource.getprestatus() && enable.getprestatus()){//sysj\plant.sysj line: 24, column: 10
              S14=1;
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            else {
              armAtDest.setPresent();//sysj\plant.sysj line: 25, column: 5
              currsigs.addElement(armAtDest);
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            break;
          
          case 1 : 
            if(!enable.getprestatus()){//sysj\plant.sysj line: 27, column: 10
              S14=2;
              armAtSource.setPresent();//sysj\plant.sysj line: 29, column: 5
              currsigs.addElement(armAtSource);
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
            if(armDest.getprestatus() && enable.getprestatus()){//sysj\plant.sysj line: 28, column: 10
              S14=3;
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            else {
              armAtSource.setPresent();//sysj\plant.sysj line: 29, column: 5
              currsigs.addElement(armAtSource);
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            break;
          
          case 3 : 
            if(!enable.getprestatus()){//sysj\plant.sysj line: 31, column: 10
              S14=0;
              armAtDest.setPresent();//sysj\plant.sysj line: 25, column: 5
              currsigs.addElement(armAtDest);
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
          
        }
        break;
      
    }
  }

  public void thread1166(int [] tdone, int [] ends){
        S290=1;
    if(empty.getprestatus()){//sysj\plant.sysj line: 114, column: 24
      emptyE.setPresent();//sysj\plant.sysj line: 114, column: 31
      currsigs.addElement(emptyE);
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

  public void thread1165(int [] tdone, int [] ends){
        S282=1;
    if(armAtDest.getprestatus()){//sysj\plant.sysj line: 112, column: 24
      armAtDestE.setPresent();//sysj\plant.sysj line: 112, column: 35
      currsigs.addElement(armAtDestE);
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

  public void thread1164(int [] tdone, int [] ends){
        S274=1;
    if(armAtSource.getprestatus()){//sysj\plant.sysj line: 110, column: 24
      armAtSourceE.setPresent();//sysj\plant.sysj line: 110, column: 37
      currsigs.addElement(armAtSourceE);
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

  public void thread1163(int [] tdone, int [] ends){
        S266=1;
    if(WPgripped.getprestatus()){//sysj\plant.sysj line: 108, column: 24
      WPgrippedE.setPresent();//sysj\plant.sysj line: 108, column: 35
      currsigs.addElement(WPgrippedE);
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

  public void thread1162(int [] tdone, int [] ends){
        S258=1;
    if(pusherExtended.getprestatus()){//sysj\plant.sysj line: 106, column: 24
      pusherExtendedE.setPresent();//sysj\plant.sysj line: 106, column: 40
      currsigs.addElement(pusherExtendedE);
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

  public void thread1161(int [] tdone, int [] ends){
        S250=1;
    if(pusherRetracted.getprestatus()){//sysj\plant.sysj line: 104, column: 24
      pusherRetractedE.setPresent();//sysj\plant.sysj line: 104, column: 41
      currsigs.addElement(pusherRetractedE);
      active[8]=1;
      ends[8]=1;
      tdone[8]=1;
    }
    else {
      active[8]=1;
      ends[8]=1;
      tdone[8]=1;
    }
  }

  public void thread1160(int [] tdone, int [] ends){
        S292=1;
    thread1161(tdone,ends);
    thread1162(tdone,ends);
    thread1163(tdone,ends);
    thread1164(tdone,ends);
    thread1165(tdone,ends);
    thread1166(tdone,ends);
    int biggest1167 = 0;
    if(ends[8]>=biggest1167){
      biggest1167=ends[8];
    }
    if(ends[9]>=biggest1167){
      biggest1167=ends[9];
    }
    if(ends[10]>=biggest1167){
      biggest1167=ends[10];
    }
    if(ends[11]>=biggest1167){
      biggest1167=ends[11];
    }
    if(ends[12]>=biggest1167){
      biggest1167=ends[12];
    }
    if(ends[13]>=biggest1167){
      biggest1167=ends[13];
    }
    if(biggest1167 == 1){
      active[7]=1;
      ends[7]=1;
      tdone[7]=1;
    }
  }

  public void thread1159(int [] tdone, int [] ends){
        S242=1;
    if(c1.getprestatus()){//sysj\plant.sysj line: 90, column: 12
      System.out.println("q");//sysj\plant.sysj line: 91, column: 5
      if(c2.getprestatus()){//sysj\plant.sysj line: 93, column: 12
        System.out.println("1");//sysj\plant.sysj line: 94, column: 5
        System.out.println("2");//sysj\plant.sysj line: 97, column: 5
        active[6]=1;
        ends[6]=1;
        tdone[6]=1;
      }
      else {
        System.out.println("2");//sysj\plant.sysj line: 97, column: 5
        active[6]=1;
        ends[6]=1;
        tdone[6]=1;
      }
    }
    else {
      if(c2.getprestatus()){//sysj\plant.sysj line: 93, column: 12
        System.out.println("1");//sysj\plant.sysj line: 94, column: 5
        System.out.println("2");//sysj\plant.sysj line: 97, column: 5
        active[6]=1;
        ends[6]=1;
        tdone[6]=1;
      }
      else {
        System.out.println("2");//sysj\plant.sysj line: 97, column: 5
        active[6]=1;
        ends[6]=1;
        tdone[6]=1;
      }
    }
  }

  public void thread1158(int [] tdone, int [] ends){
        S225=1;
    S179=0;
    S161=0;
    active[5]=1;
    ends[5]=1;
    tdone[5]=1;
  }

  public void thread1157(int [] tdone, int [] ends){
        S157=1;
    S127=0;
    if(vacOn.getprestatus() && armAtSource.getprestatus()){//sysj\plant.sysj line: 50, column: 12
      if((Integer)(capPos_1.getpreval() == null ? 0 : ((Integer)capPos_1.getpreval()).intValue()) == 1){//sysj\plant.sysj line: 51, column: 8
        capPos_1.setPresent();//sysj\plant.sysj line: 52, column: 6
        currsigs.addElement(capPos_1);
        capPos_1.setValue(0);//sysj\plant.sysj line: 52, column: 6
        S122=0;
        WPgripped.setPresent();//sysj\plant.sysj line: 54, column: 7
        currsigs.addElement(WPgripped);
        active[4]=1;
        ends[4]=1;
        tdone[4]=1;
      }
      else {
        S127=1;
        active[4]=1;
        ends[4]=1;
        tdone[4]=1;
      }
    }
    else {
      S127=1;
      active[4]=1;
      ends[4]=1;
      tdone[4]=1;
    }
  }

  public void thread1156(int [] tdone, int [] ends){
        S113=1;
    S67=0;
    pusherRetracted.setPresent();//sysj\plant.sysj line: 38, column: 5
    currsigs.addElement(pusherRetracted);
    active[3]=1;
    ends[3]=1;
    tdone[3]=1;
  }

  public void thread1155(int [] tdone, int [] ends){
        S60=1;
    S14=0;
    armAtDest.setPresent();//sysj\plant.sysj line: 25, column: 5
    currsigs.addElement(armAtDest);
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
      switch(S1153){
        case 0 : 
          S1153=0;
          break RUN;
        
        case 1 : 
          S1153=2;
          S1153=2;
          new Thread(new GUI()).start();//sysj\plant.sysj line: 17, column: 2
          capDec_1.setClear();//sysj\plant.sysj line: 19, column: 2
          capPos_1.setClear();//sysj\plant.sysj line: 20, column: 2
          capPos_1.setPresent();//sysj\plant.sysj line: 21, column: 2
          currsigs.addElement(capPos_1);
          capPos_1.setValue(0);//sysj\plant.sysj line: 21, column: 2
          thread1155(tdone,ends);
          thread1156(tdone,ends);
          thread1157(tdone,ends);
          thread1158(tdone,ends);
          thread1159(tdone,ends);
          thread1160(tdone,ends);
          int biggest1168 = 0;
          if(ends[2]>=biggest1168){
            biggest1168=ends[2];
          }
          if(ends[3]>=biggest1168){
            biggest1168=ends[3];
          }
          if(ends[4]>=biggest1168){
            biggest1168=ends[4];
          }
          if(ends[5]>=biggest1168){
            biggest1168=ends[5];
          }
          if(ends[6]>=biggest1168){
            biggest1168=ends[6];
          }
          if(ends[7]>=biggest1168){
            biggest1168=ends[7];
          }
          if(biggest1168 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
        
        case 2 : 
          capDec_1.setClear();//sysj\plant.sysj line: 19, column: 2
          capPos_1.setClear();//sysj\plant.sysj line: 20, column: 2
          thread1169(tdone,ends);
          thread1170(tdone,ends);
          thread1171(tdone,ends);
          thread1172(tdone,ends);
          thread1173(tdone,ends);
          thread1174(tdone,ends);
          int biggest1182 = 0;
          if(ends[2]>=biggest1182){
            biggest1182=ends[2];
          }
          if(ends[3]>=biggest1182){
            biggest1182=ends[3];
          }
          if(ends[4]>=biggest1182){
            biggest1182=ends[4];
          }
          if(ends[5]>=biggest1182){
            biggest1182=ends[5];
          }
          if(ends[6]>=biggest1182){
            biggest1182=ends[6];
          }
          if(ends[7]>=biggest1182){
            biggest1182=ends[7];
          }
          if(biggest1182 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
          //FINXME code
          if(biggest1182 == 0){
            S1153=0;
            active[1]=0;
            ends[1]=0;
            S1153=0;
            break RUN;
          }
        
      }
    }
  }

  public void init(){
    char [] active1 = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
    char [] paused1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    char [] suspended1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
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
          motConveyorOnOff.gethook();
          c1.gethook();
          c2.gethook();
          c3.gethook();
          pusherExtend.gethook();
          vacOn.gethook();
          armSource.gethook();
          armDest.gethook();
          enable.gethook();
          refill.gethook();
          df = true;
        }
        runClockDomain();
      }
      motConveyorOnOff.setpreclear();
      c1.setpreclear();
      c2.setpreclear();
      c3.setpreclear();
      pusherExtend.setpreclear();
      vacOn.setpreclear();
      armSource.setpreclear();
      armDest.setpreclear();
      enable.setpreclear();
      refill.setpreclear();
      bottleAtPos1.setpreclear();
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
      capDec_1.setpreclear();
      capPos_1.setpreclear();
      int dummyint = 0;
      for(int qw=0;qw<currsigs.size();++qw){
        dummyint = ((Signal)currsigs.elementAt(qw)).getStatus() ? ((Signal)currsigs.elementAt(qw)).setprepresent() : ((Signal)currsigs.elementAt(qw)).setpreclear();
        ((Signal)currsigs.elementAt(qw)).setpreval(((Signal)currsigs.elementAt(qw)).getValue());
      }
      currsigs.removeAllElements();
      dummyint = motConveyorOnOff.getStatus() ? motConveyorOnOff.setprepresent() : motConveyorOnOff.setpreclear();
      motConveyorOnOff.setpreval(motConveyorOnOff.getValue());
      motConveyorOnOff.setClear();
      dummyint = c1.getStatus() ? c1.setprepresent() : c1.setpreclear();
      c1.setpreval(c1.getValue());
      c1.setClear();
      dummyint = c2.getStatus() ? c2.setprepresent() : c2.setpreclear();
      c2.setpreval(c2.getValue());
      c2.setClear();
      dummyint = c3.getStatus() ? c3.setprepresent() : c3.setpreclear();
      c3.setpreval(c3.getValue());
      c3.setClear();
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
      dummyint = enable.getStatus() ? enable.setprepresent() : enable.setpreclear();
      enable.setpreval(enable.getValue());
      enable.setClear();
      dummyint = refill.getStatus() ? refill.setprepresent() : refill.setpreclear();
      refill.setpreval(refill.getValue());
      refill.setClear();
      bottleAtPos1.sethook();
      bottleAtPos1.setClear();
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
      capDec_1.setClear();
      capPos_1.setClear();
      if(paused[1]!=0 || suspended[1]!=0 || active[1]!=1);
      else{
        motConveyorOnOff.gethook();
        c1.gethook();
        c2.gethook();
        c3.gethook();
        pusherExtend.gethook();
        vacOn.gethook();
        armSource.gethook();
        armDest.gethook();
        enable.gethook();
        refill.gethook();
      }
      runFinisher();
      if(active[1] == 0){
      	this.terminated = true;
      }
      if(!threaded) break;
    }
  }
}
