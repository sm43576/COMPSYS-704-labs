import java.util.*;
import com.systemj.ClockDomain;
import com.systemj.Signal;
import com.systemj.input_Channel;
import com.systemj.output_Channel;
import run.GUI;//sysj\plant.sysj line: 1, column: 1

public class Plant extends ClockDomain{
  public Plant(String name){super(name);}
  Vector currsigs = new Vector();
  private boolean df = false;
  private char [] active;
  private char [] paused;
  private char [] suspended;
  public Signal pusherExtend = new Signal("pusherExtend", Signal.INPUT);
  public Signal vacOn = new Signal("vacOn", Signal.INPUT);
  public Signal armSource = new Signal("armSource", Signal.INPUT);
  public Signal armDest = new Signal("armDest", Signal.INPUT);
  public Signal enable = new Signal("enable", Signal.INPUT);
  public Signal refill = new Signal("refill", Signal.INPUT);
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
  private int capcount_thread_6;//sysj\plant.sysj line: 82, column: 3
  private int S1840 = 1;
  private int S567 = 1;
  private int S521 = 1;
  private int S620 = 1;
  private int S574 = 1;
  private int S664 = 1;
  private int S634 = 1;
  private int S629 = 1;
  private int S732 = 1;
  private int S686 = 1;
  private int S668 = 1;
  private int S794 = 1;
  private int S844 = 1;
  private int S802 = 1;
  private int S810 = 1;
  private int S818 = 1;
  private int S826 = 1;
  private int S834 = 1;
  private int S842 = 1;
  
  private int[] ends = new int[14];
  private int[] tdone = new int[14];
  
  public void thread1867(int [] tdone, int [] ends){
        switch(S842){
      case 0 : 
        active[13]=0;
        ends[13]=0;
        tdone[13]=1;
        break;
      
      case 1 : 
        if(empty.getprestatus()){//sysj\plant.sysj line: 110, column: 24
          emptyE.setPresent();//sysj\plant.sysj line: 110, column: 31
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

  public void thread1866(int [] tdone, int [] ends){
        switch(S834){
      case 0 : 
        active[12]=0;
        ends[12]=0;
        tdone[12]=1;
        break;
      
      case 1 : 
        if(armAtDest.getprestatus()){//sysj\plant.sysj line: 108, column: 24
          armAtDestE.setPresent();//sysj\plant.sysj line: 108, column: 35
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

  public void thread1865(int [] tdone, int [] ends){
        switch(S826){
      case 0 : 
        active[11]=0;
        ends[11]=0;
        tdone[11]=1;
        break;
      
      case 1 : 
        if(armAtSource.getprestatus()){//sysj\plant.sysj line: 106, column: 24
          armAtSourceE.setPresent();//sysj\plant.sysj line: 106, column: 37
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

  public void thread1864(int [] tdone, int [] ends){
        switch(S818){
      case 0 : 
        active[10]=0;
        ends[10]=0;
        tdone[10]=1;
        break;
      
      case 1 : 
        if(WPgripped.getprestatus()){//sysj\plant.sysj line: 104, column: 24
          WPgrippedE.setPresent();//sysj\plant.sysj line: 104, column: 35
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

  public void thread1863(int [] tdone, int [] ends){
        switch(S810){
      case 0 : 
        active[9]=0;
        ends[9]=0;
        tdone[9]=1;
        break;
      
      case 1 : 
        if(pusherExtended.getprestatus()){//sysj\plant.sysj line: 102, column: 24
          pusherExtendedE.setPresent();//sysj\plant.sysj line: 102, column: 40
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

  public void thread1862(int [] tdone, int [] ends){
        switch(S802){
      case 0 : 
        active[8]=0;
        ends[8]=0;
        tdone[8]=1;
        break;
      
      case 1 : 
        if(pusherRetracted.getprestatus()){//sysj\plant.sysj line: 100, column: 24
          pusherRetractedE.setPresent();//sysj\plant.sysj line: 100, column: 41
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

  public void thread1861(int [] tdone, int [] ends){
        switch(S844){
      case 0 : 
        active[7]=0;
        ends[7]=0;
        tdone[7]=1;
        break;
      
      case 1 : 
        thread1862(tdone,ends);
        thread1863(tdone,ends);
        thread1864(tdone,ends);
        thread1865(tdone,ends);
        thread1866(tdone,ends);
        thread1867(tdone,ends);
        int biggest1868 = 0;
        if(ends[8]>=biggest1868){
          biggest1868=ends[8];
        }
        if(ends[9]>=biggest1868){
          biggest1868=ends[9];
        }
        if(ends[10]>=biggest1868){
          biggest1868=ends[10];
        }
        if(ends[11]>=biggest1868){
          biggest1868=ends[11];
        }
        if(ends[12]>=biggest1868){
          biggest1868=ends[12];
        }
        if(ends[13]>=biggest1868){
          biggest1868=ends[13];
        }
        if(biggest1868 == 1){
          active[7]=1;
          ends[7]=1;
          tdone[7]=1;
        }
        //FINXME code
        if(biggest1868 == 0){
          S844=0;
          active[7]=0;
          ends[7]=0;
          tdone[7]=1;
        }
        break;
      
    }
  }

  public void thread1860(int [] tdone, int [] ends){
        switch(S794){
      case 0 : 
        active[6]=0;
        ends[6]=0;
        tdone[6]=1;
        break;
      
      case 1 : 
        if(capDec_1.getprestatus()){//sysj\plant.sysj line: 84, column: 12
          if(capcount_thread_6 > 0) {//sysj\plant.sysj line: 85, column: 5
            capcount_thread_6 = capcount_thread_6 - 1;//sysj\plant.sysj line: 86, column: 6
          }
          if(refill.getprestatus()){//sysj\plant.sysj line: 88, column: 12
            capcount_thread_6 = 5;//sysj\plant.sysj line: 89, column: 5
            if(capcount_thread_6 == 0){//sysj\plant.sysj line: 92, column: 8
              empty.setPresent();//sysj\plant.sysj line: 93, column: 6
              currsigs.addElement(empty);
              active[6]=1;
              ends[6]=1;
              tdone[6]=1;
            }
            else {
              active[6]=1;
              ends[6]=1;
              tdone[6]=1;
            }
          }
          else {
            if(capcount_thread_6 == 0){//sysj\plant.sysj line: 92, column: 8
              empty.setPresent();//sysj\plant.sysj line: 93, column: 6
              currsigs.addElement(empty);
              active[6]=1;
              ends[6]=1;
              tdone[6]=1;
            }
            else {
              active[6]=1;
              ends[6]=1;
              tdone[6]=1;
            }
          }
        }
        else {
          if(refill.getprestatus()){//sysj\plant.sysj line: 88, column: 12
            capcount_thread_6 = 5;//sysj\plant.sysj line: 89, column: 5
            if(capcount_thread_6 == 0){//sysj\plant.sysj line: 92, column: 8
              empty.setPresent();//sysj\plant.sysj line: 93, column: 6
              currsigs.addElement(empty);
              active[6]=1;
              ends[6]=1;
              tdone[6]=1;
            }
            else {
              active[6]=1;
              ends[6]=1;
              tdone[6]=1;
            }
          }
          else {
            if(capcount_thread_6 == 0){//sysj\plant.sysj line: 92, column: 8
              empty.setPresent();//sysj\plant.sysj line: 93, column: 6
              currsigs.addElement(empty);
              active[6]=1;
              ends[6]=1;
              tdone[6]=1;
            }
            else {
              active[6]=1;
              ends[6]=1;
              tdone[6]=1;
            }
          }
        }
        break;
      
    }
  }

  public void thread1859(int [] tdone, int [] ends){
        switch(S732){
      case 0 : 
        active[5]=0;
        ends[5]=0;
        tdone[5]=1;
        break;
      
      case 1 : 
        switch(S686){
          case 0 : 
            if(empty.getprestatus()){//sysj\plant.sysj line: 67, column: 10
              S686=1;
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            else {
              switch(S668){
                case 0 : 
                  if(pusherRetracted.getprestatus()){//sysj\plant.sysj line: 69, column: 13
                    S668=1;
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
                  if(pusherExtended.getprestatus()){//sysj\plant.sysj line: 70, column: 13
                    capPos_1.setPresent();//sysj\plant.sysj line: 72, column: 7
                    currsigs.addElement(capPos_1);
                    capPos_1.setValue(1);//sysj\plant.sysj line: 72, column: 7
                    S668=2;
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
                  if(pusherRetracted.getprestatus()){//sysj\plant.sysj line: 73, column: 13
                    capDec_1.setPresent();//sysj\plant.sysj line: 74, column: 7
                    currsigs.addElement(capDec_1);
                    S668=0;
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
            if(refill.getprestatus()){//sysj\plant.sysj line: 77, column: 10
              S686=0;
              S668=0;
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

  public void thread1858(int [] tdone, int [] ends){
        switch(S664){
      case 0 : 
        active[4]=0;
        ends[4]=0;
        tdone[4]=1;
        break;
      
      case 1 : 
        switch(S634){
          case 0 : 
            switch(S629){
              case 0 : 
                if(!vacOn.getprestatus()){//sysj\plant.sysj line: 47, column: 12
                  S629=1;
                  if(armAtSource.getprestatus()){//sysj\plant.sysj line: 50, column: 14
                    capPos_1.setPresent();//sysj\plant.sysj line: 51, column: 7
                    currsigs.addElement(capPos_1);
                    capPos_1.setValue(1);//sysj\plant.sysj line: 51, column: 7
                    S634=1;
                    active[4]=1;
                    ends[4]=1;
                    tdone[4]=1;
                  }
                  else {
                    S634=1;
                    active[4]=1;
                    ends[4]=1;
                    tdone[4]=1;
                  }
                }
                else {
                  WPgripped.setPresent();//sysj\plant.sysj line: 48, column: 7
                  currsigs.addElement(WPgripped);
                  active[4]=1;
                  ends[4]=1;
                  tdone[4]=1;
                }
                break;
              
              case 1 : 
                S634=0;
                if(vacOn.getprestatus() && armAtSource.getprestatus()){//sysj\plant.sysj line: 44, column: 12
                  if((Integer)(capPos_1.getpreval() == null ? 0 : ((Integer)capPos_1.getpreval()).intValue()) == 1){//sysj\plant.sysj line: 45, column: 8
                    capPos_1.setPresent();//sysj\plant.sysj line: 46, column: 6
                    currsigs.addElement(capPos_1);
                    capPos_1.setValue(0);//sysj\plant.sysj line: 46, column: 6
                    S629=0;
                    WPgripped.setPresent();//sysj\plant.sysj line: 48, column: 7
                    currsigs.addElement(WPgripped);
                    active[4]=1;
                    ends[4]=1;
                    tdone[4]=1;
                  }
                  else {
                    S634=1;
                    active[4]=1;
                    ends[4]=1;
                    tdone[4]=1;
                  }
                }
                else {
                  S634=1;
                  active[4]=1;
                  ends[4]=1;
                  tdone[4]=1;
                }
                break;
              
            }
            break;
          
          case 1 : 
            S634=1;
            S634=0;
            if(vacOn.getprestatus() && armAtSource.getprestatus()){//sysj\plant.sysj line: 44, column: 12
              if((Integer)(capPos_1.getpreval() == null ? 0 : ((Integer)capPos_1.getpreval()).intValue()) == 1){//sysj\plant.sysj line: 45, column: 8
                capPos_1.setPresent();//sysj\plant.sysj line: 46, column: 6
                currsigs.addElement(capPos_1);
                capPos_1.setValue(0);//sysj\plant.sysj line: 46, column: 6
                S629=0;
                WPgripped.setPresent();//sysj\plant.sysj line: 48, column: 7
                currsigs.addElement(WPgripped);
                active[4]=1;
                ends[4]=1;
                tdone[4]=1;
              }
              else {
                S634=1;
                active[4]=1;
                ends[4]=1;
                tdone[4]=1;
              }
            }
            else {
              S634=1;
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread1857(int [] tdone, int [] ends){
        switch(S620){
      case 0 : 
        active[3]=0;
        ends[3]=0;
        tdone[3]=1;
        break;
      
      case 1 : 
        switch(S574){
          case 0 : 
            if(pusherExtend.getprestatus() && enable.getprestatus()){//sysj\plant.sysj line: 31, column: 10
              S574=1;
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            else {
              pusherRetracted.setPresent();//sysj\plant.sysj line: 32, column: 5
              currsigs.addElement(pusherRetracted);
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            break;
          
          case 1 : 
            if(!enable.getprestatus()){//sysj\plant.sysj line: 34, column: 10
              S574=2;
              pusherExtended.setPresent();//sysj\plant.sysj line: 36, column: 5
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
            if(!pusherExtend.getprestatus() && enable.getprestatus()){//sysj\plant.sysj line: 35, column: 10
              S574=3;
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            else {
              pusherExtended.setPresent();//sysj\plant.sysj line: 36, column: 5
              currsigs.addElement(pusherExtended);
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            break;
          
          case 3 : 
            if(!enable.getprestatus()){//sysj\plant.sysj line: 38, column: 10
              S574=0;
              pusherRetracted.setPresent();//sysj\plant.sysj line: 32, column: 5
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

  public void thread1856(int [] tdone, int [] ends){
        switch(S567){
      case 0 : 
        active[2]=0;
        ends[2]=0;
        tdone[2]=1;
        break;
      
      case 1 : 
        switch(S521){
          case 0 : 
            if(armSource.getprestatus() && enable.getprestatus()){//sysj\plant.sysj line: 18, column: 10
              S521=1;
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            else {
              armAtDest.setPresent();//sysj\plant.sysj line: 19, column: 5
              currsigs.addElement(armAtDest);
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            break;
          
          case 1 : 
            if(!enable.getprestatus()){//sysj\plant.sysj line: 21, column: 10
              S521=2;
              armAtSource.setPresent();//sysj\plant.sysj line: 23, column: 5
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
            if(armDest.getprestatus() && enable.getprestatus()){//sysj\plant.sysj line: 22, column: 10
              S521=3;
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            else {
              armAtSource.setPresent();//sysj\plant.sysj line: 23, column: 5
              currsigs.addElement(armAtSource);
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            break;
          
          case 3 : 
            if(!enable.getprestatus()){//sysj\plant.sysj line: 25, column: 10
              S521=0;
              armAtDest.setPresent();//sysj\plant.sysj line: 19, column: 5
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

  public void thread1853(int [] tdone, int [] ends){
        S842=1;
    if(empty.getprestatus()){//sysj\plant.sysj line: 110, column: 24
      emptyE.setPresent();//sysj\plant.sysj line: 110, column: 31
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

  public void thread1852(int [] tdone, int [] ends){
        S834=1;
    if(armAtDest.getprestatus()){//sysj\plant.sysj line: 108, column: 24
      armAtDestE.setPresent();//sysj\plant.sysj line: 108, column: 35
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

  public void thread1851(int [] tdone, int [] ends){
        S826=1;
    if(armAtSource.getprestatus()){//sysj\plant.sysj line: 106, column: 24
      armAtSourceE.setPresent();//sysj\plant.sysj line: 106, column: 37
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

  public void thread1850(int [] tdone, int [] ends){
        S818=1;
    if(WPgripped.getprestatus()){//sysj\plant.sysj line: 104, column: 24
      WPgrippedE.setPresent();//sysj\plant.sysj line: 104, column: 35
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

  public void thread1849(int [] tdone, int [] ends){
        S810=1;
    if(pusherExtended.getprestatus()){//sysj\plant.sysj line: 102, column: 24
      pusherExtendedE.setPresent();//sysj\plant.sysj line: 102, column: 40
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

  public void thread1848(int [] tdone, int [] ends){
        S802=1;
    if(pusherRetracted.getprestatus()){//sysj\plant.sysj line: 100, column: 24
      pusherRetractedE.setPresent();//sysj\plant.sysj line: 100, column: 41
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

  public void thread1847(int [] tdone, int [] ends){
        S844=1;
    thread1848(tdone,ends);
    thread1849(tdone,ends);
    thread1850(tdone,ends);
    thread1851(tdone,ends);
    thread1852(tdone,ends);
    thread1853(tdone,ends);
    int biggest1854 = 0;
    if(ends[8]>=biggest1854){
      biggest1854=ends[8];
    }
    if(ends[9]>=biggest1854){
      biggest1854=ends[9];
    }
    if(ends[10]>=biggest1854){
      biggest1854=ends[10];
    }
    if(ends[11]>=biggest1854){
      biggest1854=ends[11];
    }
    if(ends[12]>=biggest1854){
      biggest1854=ends[12];
    }
    if(ends[13]>=biggest1854){
      biggest1854=ends[13];
    }
    if(biggest1854 == 1){
      active[7]=1;
      ends[7]=1;
      tdone[7]=1;
    }
  }

  public void thread1846(int [] tdone, int [] ends){
        S794=1;
    capcount_thread_6 = 5;//sysj\plant.sysj line: 82, column: 3
    if(capDec_1.getprestatus()){//sysj\plant.sysj line: 84, column: 12
      if(capcount_thread_6 > 0) {//sysj\plant.sysj line: 85, column: 5
        capcount_thread_6 = capcount_thread_6 - 1;//sysj\plant.sysj line: 86, column: 6
      }
      if(refill.getprestatus()){//sysj\plant.sysj line: 88, column: 12
        capcount_thread_6 = 5;//sysj\plant.sysj line: 89, column: 5
        if(capcount_thread_6 == 0){//sysj\plant.sysj line: 92, column: 8
          empty.setPresent();//sysj\plant.sysj line: 93, column: 6
          currsigs.addElement(empty);
          active[6]=1;
          ends[6]=1;
          tdone[6]=1;
        }
        else {
          active[6]=1;
          ends[6]=1;
          tdone[6]=1;
        }
      }
      else {
        if(capcount_thread_6 == 0){//sysj\plant.sysj line: 92, column: 8
          empty.setPresent();//sysj\plant.sysj line: 93, column: 6
          currsigs.addElement(empty);
          active[6]=1;
          ends[6]=1;
          tdone[6]=1;
        }
        else {
          active[6]=1;
          ends[6]=1;
          tdone[6]=1;
        }
      }
    }
    else {
      if(refill.getprestatus()){//sysj\plant.sysj line: 88, column: 12
        capcount_thread_6 = 5;//sysj\plant.sysj line: 89, column: 5
        if(capcount_thread_6 == 0){//sysj\plant.sysj line: 92, column: 8
          empty.setPresent();//sysj\plant.sysj line: 93, column: 6
          currsigs.addElement(empty);
          active[6]=1;
          ends[6]=1;
          tdone[6]=1;
        }
        else {
          active[6]=1;
          ends[6]=1;
          tdone[6]=1;
        }
      }
      else {
        if(capcount_thread_6 == 0){//sysj\plant.sysj line: 92, column: 8
          empty.setPresent();//sysj\plant.sysj line: 93, column: 6
          currsigs.addElement(empty);
          active[6]=1;
          ends[6]=1;
          tdone[6]=1;
        }
        else {
          active[6]=1;
          ends[6]=1;
          tdone[6]=1;
        }
      }
    }
  }

  public void thread1845(int [] tdone, int [] ends){
        S732=1;
    S686=0;
    S668=0;
    active[5]=1;
    ends[5]=1;
    tdone[5]=1;
  }

  public void thread1844(int [] tdone, int [] ends){
        S664=1;
    S634=0;
    if(vacOn.getprestatus() && armAtSource.getprestatus()){//sysj\plant.sysj line: 44, column: 12
      if((Integer)(capPos_1.getpreval() == null ? 0 : ((Integer)capPos_1.getpreval()).intValue()) == 1){//sysj\plant.sysj line: 45, column: 8
        capPos_1.setPresent();//sysj\plant.sysj line: 46, column: 6
        currsigs.addElement(capPos_1);
        capPos_1.setValue(0);//sysj\plant.sysj line: 46, column: 6
        S629=0;
        WPgripped.setPresent();//sysj\plant.sysj line: 48, column: 7
        currsigs.addElement(WPgripped);
        active[4]=1;
        ends[4]=1;
        tdone[4]=1;
      }
      else {
        S634=1;
        active[4]=1;
        ends[4]=1;
        tdone[4]=1;
      }
    }
    else {
      S634=1;
      active[4]=1;
      ends[4]=1;
      tdone[4]=1;
    }
  }

  public void thread1843(int [] tdone, int [] ends){
        S620=1;
    S574=0;
    pusherRetracted.setPresent();//sysj\plant.sysj line: 32, column: 5
    currsigs.addElement(pusherRetracted);
    active[3]=1;
    ends[3]=1;
    tdone[3]=1;
  }

  public void thread1842(int [] tdone, int [] ends){
        S567=1;
    S521=0;
    armAtDest.setPresent();//sysj\plant.sysj line: 19, column: 5
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
      switch(S1840){
        case 0 : 
          S1840=0;
          break RUN;
        
        case 1 : 
          S1840=2;
          S1840=2;
          new Thread(new GUI()).start();//sysj\plant.sysj line: 11, column: 2
          capDec_1.setClear();//sysj\plant.sysj line: 13, column: 2
          capPos_1.setClear();//sysj\plant.sysj line: 14, column: 2
          capPos_1.setPresent();//sysj\plant.sysj line: 15, column: 2
          currsigs.addElement(capPos_1);
          capPos_1.setValue(0);//sysj\plant.sysj line: 15, column: 2
          thread1842(tdone,ends);
          thread1843(tdone,ends);
          thread1844(tdone,ends);
          thread1845(tdone,ends);
          thread1846(tdone,ends);
          thread1847(tdone,ends);
          int biggest1855 = 0;
          if(ends[2]>=biggest1855){
            biggest1855=ends[2];
          }
          if(ends[3]>=biggest1855){
            biggest1855=ends[3];
          }
          if(ends[4]>=biggest1855){
            biggest1855=ends[4];
          }
          if(ends[5]>=biggest1855){
            biggest1855=ends[5];
          }
          if(ends[6]>=biggest1855){
            biggest1855=ends[6];
          }
          if(ends[7]>=biggest1855){
            biggest1855=ends[7];
          }
          if(biggest1855 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
        
        case 2 : 
          capDec_1.setClear();//sysj\plant.sysj line: 13, column: 2
          capPos_1.setClear();//sysj\plant.sysj line: 14, column: 2
          thread1856(tdone,ends);
          thread1857(tdone,ends);
          thread1858(tdone,ends);
          thread1859(tdone,ends);
          thread1860(tdone,ends);
          thread1861(tdone,ends);
          int biggest1869 = 0;
          if(ends[2]>=biggest1869){
            biggest1869=ends[2];
          }
          if(ends[3]>=biggest1869){
            biggest1869=ends[3];
          }
          if(ends[4]>=biggest1869){
            biggest1869=ends[4];
          }
          if(ends[5]>=biggest1869){
            biggest1869=ends[5];
          }
          if(ends[6]>=biggest1869){
            biggest1869=ends[6];
          }
          if(ends[7]>=biggest1869){
            biggest1869=ends[7];
          }
          if(biggest1869 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
          //FINXME code
          if(biggest1869 == 0){
            S1840=0;
            active[1]=0;
            ends[1]=0;
            S1840=0;
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
      pusherExtend.setpreclear();
      vacOn.setpreclear();
      armSource.setpreclear();
      armDest.setpreclear();
      enable.setpreclear();
      refill.setpreclear();
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
