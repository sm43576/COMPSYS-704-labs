import java.util.*;
import com.systemj.ClockDomain;
import com.systemj.Signal;
import com.systemj.input_Channel;
import com.systemj.output_Channel;
import run.GUI;//sysj\plant.sysj line: 1, column: 2

public class PlantCD extends ClockDomain{
  public PlantCD(String name){super(name);}
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
  private int S1202 = 1;
  private int S73 = 1;
  private int S17 = 1;
  private int S126 = 1;
  private int S80 = 1;
  private int S170 = 1;
  private int S140 = 1;
  private int S135 = 1;
  private int S238 = 1;
  private int S192 = 1;
  private int S174 = 1;
  private int S255 = 1;
  private int S305 = 1;
  private int S263 = 1;
  private int S271 = 1;
  private int S279 = 1;
  private int S287 = 1;
  private int S295 = 1;
  private int S303 = 1;
  
  private int[] ends = new int[14];
  private int[] tdone = new int[14];
  
  public void thread1229(int [] tdone, int [] ends){
        switch(S303){
      case 0 : 
        active[13]=0;
        ends[13]=0;
        tdone[13]=1;
        break;
      
      case 1 : 
        if(empty.getprestatus()){//sysj\plant.sysj line: 129, column: 24
          emptyE.setPresent();//sysj\plant.sysj line: 129, column: 31
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

  public void thread1228(int [] tdone, int [] ends){
        switch(S295){
      case 0 : 
        active[12]=0;
        ends[12]=0;
        tdone[12]=1;
        break;
      
      case 1 : 
        if(armAtDest.getprestatus()){//sysj\plant.sysj line: 127, column: 24
          armAtDestE.setPresent();//sysj\plant.sysj line: 127, column: 35
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

  public void thread1227(int [] tdone, int [] ends){
        switch(S287){
      case 0 : 
        active[11]=0;
        ends[11]=0;
        tdone[11]=1;
        break;
      
      case 1 : 
        if(armAtSource.getprestatus()){//sysj\plant.sysj line: 125, column: 24
          armAtSourceE.setPresent();//sysj\plant.sysj line: 125, column: 37
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

  public void thread1226(int [] tdone, int [] ends){
        switch(S279){
      case 0 : 
        active[10]=0;
        ends[10]=0;
        tdone[10]=1;
        break;
      
      case 1 : 
        if(WPgripped.getprestatus()){//sysj\plant.sysj line: 123, column: 24
          WPgrippedE.setPresent();//sysj\plant.sysj line: 123, column: 35
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

  public void thread1225(int [] tdone, int [] ends){
        switch(S271){
      case 0 : 
        active[9]=0;
        ends[9]=0;
        tdone[9]=1;
        break;
      
      case 1 : 
        if(pusherExtended.getprestatus()){//sysj\plant.sysj line: 121, column: 24
          pusherExtendedE.setPresent();//sysj\plant.sysj line: 121, column: 40
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

  public void thread1224(int [] tdone, int [] ends){
        switch(S263){
      case 0 : 
        active[8]=0;
        ends[8]=0;
        tdone[8]=1;
        break;
      
      case 1 : 
        if(pusherRetracted.getprestatus()){//sysj\plant.sysj line: 119, column: 24
          pusherRetractedE.setPresent();//sysj\plant.sysj line: 119, column: 41
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

  public void thread1223(int [] tdone, int [] ends){
        switch(S305){
      case 0 : 
        active[7]=0;
        ends[7]=0;
        tdone[7]=1;
        break;
      
      case 1 : 
        thread1224(tdone,ends);
        thread1225(tdone,ends);
        thread1226(tdone,ends);
        thread1227(tdone,ends);
        thread1228(tdone,ends);
        thread1229(tdone,ends);
        int biggest1230 = 0;
        if(ends[8]>=biggest1230){
          biggest1230=ends[8];
        }
        if(ends[9]>=biggest1230){
          biggest1230=ends[9];
        }
        if(ends[10]>=biggest1230){
          biggest1230=ends[10];
        }
        if(ends[11]>=biggest1230){
          biggest1230=ends[11];
        }
        if(ends[12]>=biggest1230){
          biggest1230=ends[12];
        }
        if(ends[13]>=biggest1230){
          biggest1230=ends[13];
        }
        if(biggest1230 == 1){
          active[7]=1;
          ends[7]=1;
          tdone[7]=1;
        }
        //FINXME code
        if(biggest1230 == 0){
          S305=0;
          active[7]=0;
          ends[7]=0;
          tdone[7]=1;
        }
        break;
      
    }
  }

  public void thread1222(int [] tdone, int [] ends){
        switch(S255){
      case 0 : 
        active[6]=0;
        ends[6]=0;
        tdone[6]=1;
        break;
      
      case 1 : 
        if(c1.getprestatus()){//sysj\plant.sysj line: 105, column: 12
          System.out.println("q");//sysj\plant.sysj line: 106, column: 5
          if(c2.getprestatus()){//sysj\plant.sysj line: 108, column: 12
            System.out.println("1");//sysj\plant.sysj line: 109, column: 5
            System.out.println("2");//sysj\plant.sysj line: 112, column: 5
            active[6]=1;
            ends[6]=1;
            tdone[6]=1;
          }
          else {
            System.out.println("2");//sysj\plant.sysj line: 112, column: 5
            active[6]=1;
            ends[6]=1;
            tdone[6]=1;
          }
        }
        else {
          if(c2.getprestatus()){//sysj\plant.sysj line: 108, column: 12
            System.out.println("1");//sysj\plant.sysj line: 109, column: 5
            System.out.println("2");//sysj\plant.sysj line: 112, column: 5
            active[6]=1;
            ends[6]=1;
            tdone[6]=1;
          }
          else {
            System.out.println("2");//sysj\plant.sysj line: 112, column: 5
            active[6]=1;
            ends[6]=1;
            tdone[6]=1;
          }
        }
        break;
      
    }
  }

  public void thread1221(int [] tdone, int [] ends){
        switch(S238){
      case 0 : 
        active[5]=0;
        ends[5]=0;
        tdone[5]=1;
        break;
      
      case 1 : 
        switch(S192){
          case 0 : 
            if(empty.getprestatus()){//sysj\plant.sysj line: 88, column: 10
              S192=1;
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            else {
              switch(S174){
                case 0 : 
                  if(pusherRetracted.getprestatus()){//sysj\plant.sysj line: 90, column: 13
                    S174=1;
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
                  if(pusherExtended.getprestatus()){//sysj\plant.sysj line: 91, column: 13
                    capPos_1.setPresent();//sysj\plant.sysj line: 93, column: 7
                    currsigs.addElement(capPos_1);
                    capPos_1.setValue(1);//sysj\plant.sysj line: 93, column: 7
                    S174=2;
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
                  if(pusherRetracted.getprestatus()){//sysj\plant.sysj line: 94, column: 13
                    capDec_1.setPresent();//sysj\plant.sysj line: 95, column: 7
                    currsigs.addElement(capDec_1);
                    S174=0;
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
            if(refill.getprestatus()){//sysj\plant.sysj line: 98, column: 10
              S192=0;
              S174=0;
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

  public void thread1220(int [] tdone, int [] ends){
        switch(S170){
      case 0 : 
        active[4]=0;
        ends[4]=0;
        tdone[4]=1;
        break;
      
      case 1 : 
        switch(S140){
          case 0 : 
            switch(S135){
              case 0 : 
                if(!vacOn.getprestatus()){//sysj\plant.sysj line: 68, column: 12
                  S135=1;
                  if(armAtSource.getprestatus()){//sysj\plant.sysj line: 71, column: 14
                    capPos_1.setPresent();//sysj\plant.sysj line: 72, column: 7
                    currsigs.addElement(capPos_1);
                    capPos_1.setValue(1);//sysj\plant.sysj line: 72, column: 7
                    S140=1;
                    active[4]=1;
                    ends[4]=1;
                    tdone[4]=1;
                  }
                  else {
                    S140=1;
                    active[4]=1;
                    ends[4]=1;
                    tdone[4]=1;
                  }
                }
                else {
                  WPgripped.setPresent();//sysj\plant.sysj line: 69, column: 7
                  currsigs.addElement(WPgripped);
                  active[4]=1;
                  ends[4]=1;
                  tdone[4]=1;
                }
                break;
              
              case 1 : 
                S140=0;
                if(vacOn.getprestatus() && armAtSource.getprestatus()){//sysj\plant.sysj line: 65, column: 12
                  if((Integer)(capPos_1.getpreval() == null ? 0 : ((Integer)capPos_1.getpreval()).intValue()) == 1){//sysj\plant.sysj line: 66, column: 8
                    capPos_1.setPresent();//sysj\plant.sysj line: 67, column: 6
                    currsigs.addElement(capPos_1);
                    capPos_1.setValue(0);//sysj\plant.sysj line: 67, column: 6
                    S135=0;
                    WPgripped.setPresent();//sysj\plant.sysj line: 69, column: 7
                    currsigs.addElement(WPgripped);
                    active[4]=1;
                    ends[4]=1;
                    tdone[4]=1;
                  }
                  else {
                    S140=1;
                    active[4]=1;
                    ends[4]=1;
                    tdone[4]=1;
                  }
                }
                else {
                  S140=1;
                  active[4]=1;
                  ends[4]=1;
                  tdone[4]=1;
                }
                break;
              
            }
            break;
          
          case 1 : 
            S140=1;
            S140=0;
            if(vacOn.getprestatus() && armAtSource.getprestatus()){//sysj\plant.sysj line: 65, column: 12
              if((Integer)(capPos_1.getpreval() == null ? 0 : ((Integer)capPos_1.getpreval()).intValue()) == 1){//sysj\plant.sysj line: 66, column: 8
                capPos_1.setPresent();//sysj\plant.sysj line: 67, column: 6
                currsigs.addElement(capPos_1);
                capPos_1.setValue(0);//sysj\plant.sysj line: 67, column: 6
                S135=0;
                WPgripped.setPresent();//sysj\plant.sysj line: 69, column: 7
                currsigs.addElement(WPgripped);
                active[4]=1;
                ends[4]=1;
                tdone[4]=1;
              }
              else {
                S140=1;
                active[4]=1;
                ends[4]=1;
                tdone[4]=1;
              }
            }
            else {
              S140=1;
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread1219(int [] tdone, int [] ends){
        switch(S126){
      case 0 : 
        active[3]=0;
        ends[3]=0;
        tdone[3]=1;
        break;
      
      case 1 : 
        switch(S80){
          case 0 : 
            if(pusherExtend.getprestatus() && enable.getprestatus()){//sysj\plant.sysj line: 52, column: 10
              S80=1;
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            else {
              pusherRetracted.setPresent();//sysj\plant.sysj line: 53, column: 5
              currsigs.addElement(pusherRetracted);
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            break;
          
          case 1 : 
            if(!enable.getprestatus()){//sysj\plant.sysj line: 55, column: 10
              S80=2;
              pusherExtended.setPresent();//sysj\plant.sysj line: 57, column: 5
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
            if(!pusherExtend.getprestatus() && enable.getprestatus()){//sysj\plant.sysj line: 56, column: 10
              S80=3;
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            else {
              pusherExtended.setPresent();//sysj\plant.sysj line: 57, column: 5
              currsigs.addElement(pusherExtended);
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            break;
          
          case 3 : 
            if(!enable.getprestatus()){//sysj\plant.sysj line: 59, column: 10
              S80=0;
              pusherRetracted.setPresent();//sysj\plant.sysj line: 53, column: 5
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

  public void thread1218(int [] tdone, int [] ends){
        switch(S73){
      case 0 : 
        active[2]=0;
        ends[2]=0;
        tdone[2]=1;
        break;
      
      case 1 : 
        switch(S17){
          case 0 : 
            if(armSource.getprestatus() && enable.getprestatus()){//sysj\plant.sysj line: 39, column: 10
              S17=1;
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            else {
              armAtDest.setPresent();//sysj\plant.sysj line: 40, column: 5
              currsigs.addElement(armAtDest);
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            break;
          
          case 1 : 
            if(!enable.getprestatus()){//sysj\plant.sysj line: 42, column: 10
              S17=2;
              armAtSource.setPresent();//sysj\plant.sysj line: 44, column: 5
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
            if(armDest.getprestatus() && enable.getprestatus()){//sysj\plant.sysj line: 43, column: 10
              S17=3;
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            else {
              armAtSource.setPresent();//sysj\plant.sysj line: 44, column: 5
              currsigs.addElement(armAtSource);
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            break;
          
          case 3 : 
            if(!enable.getprestatus()){//sysj\plant.sysj line: 46, column: 10
              System.out.println("CapLoaddaaa");//sysj\plant.sysj line: 38, column: 4
              S17=0;
              armAtDest.setPresent();//sysj\plant.sysj line: 40, column: 5
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

  public void thread1215(int [] tdone, int [] ends){
        S303=1;
    if(empty.getprestatus()){//sysj\plant.sysj line: 129, column: 24
      emptyE.setPresent();//sysj\plant.sysj line: 129, column: 31
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

  public void thread1214(int [] tdone, int [] ends){
        S295=1;
    if(armAtDest.getprestatus()){//sysj\plant.sysj line: 127, column: 24
      armAtDestE.setPresent();//sysj\plant.sysj line: 127, column: 35
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

  public void thread1213(int [] tdone, int [] ends){
        S287=1;
    if(armAtSource.getprestatus()){//sysj\plant.sysj line: 125, column: 24
      armAtSourceE.setPresent();//sysj\plant.sysj line: 125, column: 37
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

  public void thread1212(int [] tdone, int [] ends){
        S279=1;
    if(WPgripped.getprestatus()){//sysj\plant.sysj line: 123, column: 24
      WPgrippedE.setPresent();//sysj\plant.sysj line: 123, column: 35
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

  public void thread1211(int [] tdone, int [] ends){
        S271=1;
    if(pusherExtended.getprestatus()){//sysj\plant.sysj line: 121, column: 24
      pusherExtendedE.setPresent();//sysj\plant.sysj line: 121, column: 40
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

  public void thread1210(int [] tdone, int [] ends){
        S263=1;
    if(pusherRetracted.getprestatus()){//sysj\plant.sysj line: 119, column: 24
      pusherRetractedE.setPresent();//sysj\plant.sysj line: 119, column: 41
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

  public void thread1209(int [] tdone, int [] ends){
        S305=1;
    thread1210(tdone,ends);
    thread1211(tdone,ends);
    thread1212(tdone,ends);
    thread1213(tdone,ends);
    thread1214(tdone,ends);
    thread1215(tdone,ends);
    int biggest1216 = 0;
    if(ends[8]>=biggest1216){
      biggest1216=ends[8];
    }
    if(ends[9]>=biggest1216){
      biggest1216=ends[9];
    }
    if(ends[10]>=biggest1216){
      biggest1216=ends[10];
    }
    if(ends[11]>=biggest1216){
      biggest1216=ends[11];
    }
    if(ends[12]>=biggest1216){
      biggest1216=ends[12];
    }
    if(ends[13]>=biggest1216){
      biggest1216=ends[13];
    }
    if(biggest1216 == 1){
      active[7]=1;
      ends[7]=1;
      tdone[7]=1;
    }
  }

  public void thread1208(int [] tdone, int [] ends){
        S255=1;
    if(c1.getprestatus()){//sysj\plant.sysj line: 105, column: 12
      System.out.println("q");//sysj\plant.sysj line: 106, column: 5
      if(c2.getprestatus()){//sysj\plant.sysj line: 108, column: 12
        System.out.println("1");//sysj\plant.sysj line: 109, column: 5
        System.out.println("2");//sysj\plant.sysj line: 112, column: 5
        active[6]=1;
        ends[6]=1;
        tdone[6]=1;
      }
      else {
        System.out.println("2");//sysj\plant.sysj line: 112, column: 5
        active[6]=1;
        ends[6]=1;
        tdone[6]=1;
      }
    }
    else {
      if(c2.getprestatus()){//sysj\plant.sysj line: 108, column: 12
        System.out.println("1");//sysj\plant.sysj line: 109, column: 5
        System.out.println("2");//sysj\plant.sysj line: 112, column: 5
        active[6]=1;
        ends[6]=1;
        tdone[6]=1;
      }
      else {
        System.out.println("2");//sysj\plant.sysj line: 112, column: 5
        active[6]=1;
        ends[6]=1;
        tdone[6]=1;
      }
    }
  }

  public void thread1207(int [] tdone, int [] ends){
        S238=1;
    S192=0;
    S174=0;
    active[5]=1;
    ends[5]=1;
    tdone[5]=1;
  }

  public void thread1206(int [] tdone, int [] ends){
        S170=1;
    S140=0;
    if(vacOn.getprestatus() && armAtSource.getprestatus()){//sysj\plant.sysj line: 65, column: 12
      if((Integer)(capPos_1.getpreval() == null ? 0 : ((Integer)capPos_1.getpreval()).intValue()) == 1){//sysj\plant.sysj line: 66, column: 8
        capPos_1.setPresent();//sysj\plant.sysj line: 67, column: 6
        currsigs.addElement(capPos_1);
        capPos_1.setValue(0);//sysj\plant.sysj line: 67, column: 6
        S135=0;
        WPgripped.setPresent();//sysj\plant.sysj line: 69, column: 7
        currsigs.addElement(WPgripped);
        active[4]=1;
        ends[4]=1;
        tdone[4]=1;
      }
      else {
        S140=1;
        active[4]=1;
        ends[4]=1;
        tdone[4]=1;
      }
    }
    else {
      S140=1;
      active[4]=1;
      ends[4]=1;
      tdone[4]=1;
    }
  }

  public void thread1205(int [] tdone, int [] ends){
        S126=1;
    S80=0;
    pusherRetracted.setPresent();//sysj\plant.sysj line: 53, column: 5
    currsigs.addElement(pusherRetracted);
    active[3]=1;
    ends[3]=1;
    tdone[3]=1;
  }

  public void thread1204(int [] tdone, int [] ends){
        S73=1;
    System.out.println("CapLoaddaaa");//sysj\plant.sysj line: 38, column: 4
    S17=0;
    armAtDest.setPresent();//sysj\plant.sysj line: 40, column: 5
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
      switch(S1202){
        case 0 : 
          S1202=0;
          break RUN;
        
        case 1 : 
          S1202=2;
          S1202=2;
          new Thread(new GUI()).start();//sysj\plant.sysj line: 31, column: 2
          capDec_1.setClear();//sysj\plant.sysj line: 33, column: 2
          capPos_1.setClear();//sysj\plant.sysj line: 34, column: 2
          capPos_1.setPresent();//sysj\plant.sysj line: 35, column: 2
          currsigs.addElement(capPos_1);
          capPos_1.setValue(0);//sysj\plant.sysj line: 35, column: 2
          thread1204(tdone,ends);
          thread1205(tdone,ends);
          thread1206(tdone,ends);
          thread1207(tdone,ends);
          thread1208(tdone,ends);
          thread1209(tdone,ends);
          int biggest1217 = 0;
          if(ends[2]>=biggest1217){
            biggest1217=ends[2];
          }
          if(ends[3]>=biggest1217){
            biggest1217=ends[3];
          }
          if(ends[4]>=biggest1217){
            biggest1217=ends[4];
          }
          if(ends[5]>=biggest1217){
            biggest1217=ends[5];
          }
          if(ends[6]>=biggest1217){
            biggest1217=ends[6];
          }
          if(ends[7]>=biggest1217){
            biggest1217=ends[7];
          }
          if(biggest1217 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
        
        case 2 : 
          capDec_1.setClear();//sysj\plant.sysj line: 33, column: 2
          capPos_1.setClear();//sysj\plant.sysj line: 34, column: 2
          thread1218(tdone,ends);
          thread1219(tdone,ends);
          thread1220(tdone,ends);
          thread1221(tdone,ends);
          thread1222(tdone,ends);
          thread1223(tdone,ends);
          int biggest1231 = 0;
          if(ends[2]>=biggest1231){
            biggest1231=ends[2];
          }
          if(ends[3]>=biggest1231){
            biggest1231=ends[3];
          }
          if(ends[4]>=biggest1231){
            biggest1231=ends[4];
          }
          if(ends[5]>=biggest1231){
            biggest1231=ends[5];
          }
          if(ends[6]>=biggest1231){
            biggest1231=ends[6];
          }
          if(ends[7]>=biggest1231){
            biggest1231=ends[7];
          }
          if(biggest1231 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
          //FINXME code
          if(biggest1231 == 0){
            S1202=0;
            active[1]=0;
            ends[1]=0;
            S1202=0;
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
