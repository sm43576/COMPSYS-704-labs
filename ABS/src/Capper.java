import java.util.*;
import com.systemj.ClockDomain;
import com.systemj.Signal;
import com.systemj.input_Channel;
import com.systemj.output_Channel;
import java.util.ArrayList;//sysj\controller.sysj line: 1, column: 1

public class Capper extends ClockDomain{
  public Capper(String name){super(name);}
  Vector currsigs = new Vector();
  private boolean df = false;
  private char [] active;
  private char [] paused;
  private char [] suspended;
  public Signal bottleAtPos4 = new Signal("bottleAtPos4", Signal.INPUT);
  public Signal gripperZAxisLowered = new Signal("gripperZAxisLowered", Signal.INPUT);
  public Signal gripperZAxisLifted = new Signal("gripperZAxisLifted", Signal.INPUT);
  public Signal gripperTurnHomePos = new Signal("gripperTurnHomePos", Signal.INPUT);
  public Signal gripperTurnFinalPos = new Signal("gripperTurnFinalPos", Signal.INPUT);
  public Signal cylClampedBottle = new Signal("cylClampedBottle", Signal.INPUT);
  public Signal gripperGrippedCap = new Signal("gripperGrippedCap", Signal.INPUT);
  public Signal cylPos5ZAxisExtend = new Signal("cylPos5ZAxisExtend", Signal.OUTPUT);
  public Signal gripperTurnRetract = new Signal("gripperTurnRetract", Signal.OUTPUT);
  public Signal gripperTurnExtend = new Signal("gripperTurnExtend", Signal.OUTPUT);
  public Signal capGripperPos5Extend = new Signal("capGripperPos5Extend", Signal.OUTPUT);
  public Signal cylClampBottleExtend = new Signal("cylClampBottleExtend", Signal.OUTPUT);
  public input_Channel capperReq_in = new input_Channel();
  public output_Channel capperStatus_o = new output_Channel();
  private Signal releaseCap_12;
  private Signal raiseGripper_12;
  private Signal unclampBottle_12;
  private boolean request_thread_12;//sysj\controller.sysj line: 164, column: 3
  private int S31990 = 1;
  private int S22414 = 1;
  private int S22398 = 1;
  private int S22393 = 1;
  private int S22507 = 1;
  private int S22421 = 1;
  private int S22416 = 1;
  private int S22602 = 1;
  private int S22513 = 1;
  private int S22519 = 1;
  private int S22535 = 1;
  private int S22534 = 1;
  private int S22522 = 1;
  private int S22525 = 1;
  private int S22554 = 1;
  private int S22545 = 1;
  private int S22609 = 1;
  private int S22604 = 1;
  
  private int[] ends = new int[22];
  private int[] tdone = new int[22];
  
  public void thread39671(int [] tdone, int [] ends){
        S22554=1;
    S22545=0;
    active[18]=1;
    ends[18]=1;
    tdone[18]=1;
  }

  public void thread39669(int [] tdone, int [] ends){
        S22525=1;
    active[17]=1;
    ends[17]=1;
    tdone[17]=1;
  }

  public void thread39668(int [] tdone, int [] ends){
        S22522=1;
    active[16]=1;
    ends[16]=1;
    tdone[16]=1;
  }

  public void thread39667(int [] tdone, int [] ends){
        S22535=1;
    S22534=0;
    thread39668(tdone,ends);
    thread39669(tdone,ends);
    int biggest39670 = 0;
    if(ends[16]>=biggest39670){
      biggest39670=ends[16];
    }
    if(ends[17]>=biggest39670){
      biggest39670=ends[17];
    }
    if(biggest39670 == 1){
      active[15]=1;
      ends[15]=1;
      tdone[15]=1;
    }
  }

  public void thread39666(int [] tdone, int [] ends){
        S22519=1;
    cylPos5ZAxisExtend.setPresent();//sysj\controller.sysj line: 186, column: 7
    currsigs.addElement(cylPos5ZAxisExtend);
    active[14]=1;
    ends[14]=1;
    tdone[14]=1;
  }

  public void thread39665(int [] tdone, int [] ends){
        S22513=1;
    cylClampBottleExtend.setPresent();//sysj\controller.sysj line: 179, column: 7
    currsigs.addElement(cylClampBottleExtend);
    active[13]=1;
    ends[13]=1;
    tdone[13]=1;
  }

  public void thread39663(int [] tdone, int [] ends){
        S22554=1;
    S22545=0;
    active[18]=1;
    ends[18]=1;
    tdone[18]=1;
  }

  public void thread39661(int [] tdone, int [] ends){
        S22525=1;
    active[17]=1;
    ends[17]=1;
    tdone[17]=1;
  }

  public void thread39660(int [] tdone, int [] ends){
        S22522=1;
    active[16]=1;
    ends[16]=1;
    tdone[16]=1;
  }

  public void thread39659(int [] tdone, int [] ends){
        S22535=1;
    S22534=0;
    thread39660(tdone,ends);
    thread39661(tdone,ends);
    int biggest39662 = 0;
    if(ends[16]>=biggest39662){
      biggest39662=ends[16];
    }
    if(ends[17]>=biggest39662){
      biggest39662=ends[17];
    }
    if(biggest39662 == 1){
      active[15]=1;
      ends[15]=1;
      tdone[15]=1;
    }
  }

  public void thread39658(int [] tdone, int [] ends){
        S22519=1;
    cylPos5ZAxisExtend.setPresent();//sysj\controller.sysj line: 186, column: 7
    currsigs.addElement(cylPos5ZAxisExtend);
    active[14]=1;
    ends[14]=1;
    tdone[14]=1;
  }

  public void thread39657(int [] tdone, int [] ends){
        S22513=1;
    cylClampBottleExtend.setPresent();//sysj\controller.sysj line: 179, column: 7
    currsigs.addElement(cylClampBottleExtend);
    active[13]=1;
    ends[13]=1;
    tdone[13]=1;
  }

  public void thread39655(int [] tdone, int [] ends){
        switch(S22554){
      case 0 : 
        active[18]=0;
        ends[18]=0;
        tdone[18]=1;
        break;
      
      case 1 : 
        switch(S22545){
          case 0 : 
            if(gripperGrippedCap.getprestatus()){//sysj\controller.sysj line: 200, column: 12
              S22545=1;
              gripperTurnExtend.setPresent();//sysj\controller.sysj line: 203, column: 7
              currsigs.addElement(gripperTurnExtend);
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
            if(gripperTurnFinalPos.getprestatus()){//sysj\controller.sysj line: 202, column: 12
              releaseCap_12.setPresent();//sysj\controller.sysj line: 205, column: 6
              currsigs.addElement(releaseCap_12);
              S22545=2;
              gripperTurnRetract.setPresent();//sysj\controller.sysj line: 208, column: 7
              currsigs.addElement(gripperTurnRetract);
              active[18]=1;
              ends[18]=1;
              tdone[18]=1;
            }
            else {
              gripperTurnExtend.setPresent();//sysj\controller.sysj line: 203, column: 7
              currsigs.addElement(gripperTurnExtend);
              active[18]=1;
              ends[18]=1;
              tdone[18]=1;
            }
            break;
          
          case 2 : 
            if(gripperTurnHomePos.getprestatus()){//sysj\controller.sysj line: 207, column: 12
              raiseGripper_12.setPresent();//sysj\controller.sysj line: 211, column: 6
              currsigs.addElement(raiseGripper_12);
              unclampBottle_12.setPresent();//sysj\controller.sysj line: 212, column: 6
              currsigs.addElement(unclampBottle_12);
              S22554=0;
              active[18]=0;
              ends[18]=0;
              tdone[18]=1;
            }
            else {
              gripperTurnRetract.setPresent();//sysj\controller.sysj line: 208, column: 7
              currsigs.addElement(gripperTurnRetract);
              active[18]=1;
              ends[18]=1;
              tdone[18]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread39653(int [] tdone, int [] ends){
        switch(S22525){
      case 0 : 
        active[17]=0;
        ends[17]=0;
        tdone[17]=1;
        break;
      
      case 1 : 
        if(cylClampedBottle.getprestatus()){//sysj\controller.sysj line: 192, column: 46
          S22525=0;
          active[17]=0;
          ends[17]=0;
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

  public void thread39652(int [] tdone, int [] ends){
        switch(S22522){
      case 0 : 
        active[16]=0;
        ends[16]=0;
        tdone[16]=1;
        break;
      
      case 1 : 
        if(gripperZAxisLowered.getprestatus()){//sysj\controller.sysj line: 192, column: 13
          S22522=0;
          active[16]=0;
          ends[16]=0;
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

  public void thread39651(int [] tdone, int [] ends){
        switch(S22535){
      case 0 : 
        active[15]=0;
        ends[15]=0;
        tdone[15]=1;
        break;
      
      case 1 : 
        switch(S22534){
          case 0 : 
            thread39652(tdone,ends);
            thread39653(tdone,ends);
            int biggest39654 = 0;
            if(ends[16]>=biggest39654){
              biggest39654=ends[16];
            }
            if(ends[17]>=biggest39654){
              biggest39654=ends[17];
            }
            if(biggest39654 == 1){
              active[15]=1;
              ends[15]=1;
              tdone[15]=1;
            }
            //FINXME code
            if(biggest39654 == 0){
              S22534=1;
              capGripperPos5Extend.setPresent();//sysj\controller.sysj line: 195, column: 7
              currsigs.addElement(capGripperPos5Extend);
              active[15]=1;
              ends[15]=1;
              tdone[15]=1;
            }
            break;
          
          case 1 : 
            if(releaseCap_12.getprestatus()){//sysj\controller.sysj line: 194, column: 12
              S22535=0;
              active[15]=0;
              ends[15]=0;
              tdone[15]=1;
            }
            else {
              capGripperPos5Extend.setPresent();//sysj\controller.sysj line: 195, column: 7
              currsigs.addElement(capGripperPos5Extend);
              active[15]=1;
              ends[15]=1;
              tdone[15]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread39650(int [] tdone, int [] ends){
        switch(S22519){
      case 0 : 
        active[14]=0;
        ends[14]=0;
        tdone[14]=1;
        break;
      
      case 1 : 
        if(raiseGripper_12.getprestatus()){//sysj\controller.sysj line: 184, column: 12
          S22519=0;
          active[14]=0;
          ends[14]=0;
          tdone[14]=1;
        }
        else {
          cylPos5ZAxisExtend.setPresent();//sysj\controller.sysj line: 186, column: 7
          currsigs.addElement(cylPos5ZAxisExtend);
          active[14]=1;
          ends[14]=1;
          tdone[14]=1;
        }
        break;
      
    }
  }

  public void thread39649(int [] tdone, int [] ends){
        switch(S22513){
      case 0 : 
        active[13]=0;
        ends[13]=0;
        tdone[13]=1;
        break;
      
      case 1 : 
        if(unclampBottle_12.getprestatus()){//sysj\controller.sysj line: 177, column: 12
          S22513=0;
          active[13]=0;
          ends[13]=0;
          tdone[13]=1;
        }
        else {
          cylClampBottleExtend.setPresent();//sysj\controller.sysj line: 179, column: 7
          currsigs.addElement(cylClampBottleExtend);
          active[13]=1;
          ends[13]=1;
          tdone[13]=1;
        }
        break;
      
    }
  }

  public void thread39647(int [] tdone, int [] ends){
        S22554=1;
    S22545=0;
    active[18]=1;
    ends[18]=1;
    tdone[18]=1;
  }

  public void thread39645(int [] tdone, int [] ends){
        S22525=1;
    active[17]=1;
    ends[17]=1;
    tdone[17]=1;
  }

  public void thread39644(int [] tdone, int [] ends){
        S22522=1;
    active[16]=1;
    ends[16]=1;
    tdone[16]=1;
  }

  public void thread39643(int [] tdone, int [] ends){
        S22535=1;
    S22534=0;
    thread39644(tdone,ends);
    thread39645(tdone,ends);
    int biggest39646 = 0;
    if(ends[16]>=biggest39646){
      biggest39646=ends[16];
    }
    if(ends[17]>=biggest39646){
      biggest39646=ends[17];
    }
    if(biggest39646 == 1){
      active[15]=1;
      ends[15]=1;
      tdone[15]=1;
    }
  }

  public void thread39642(int [] tdone, int [] ends){
        S22519=1;
    cylPos5ZAxisExtend.setPresent();//sysj\controller.sysj line: 186, column: 7
    currsigs.addElement(cylPos5ZAxisExtend);
    active[14]=1;
    ends[14]=1;
    tdone[14]=1;
  }

  public void thread39641(int [] tdone, int [] ends){
        S22513=1;
    cylClampBottleExtend.setPresent();//sysj\controller.sysj line: 179, column: 7
    currsigs.addElement(cylClampBottleExtend);
    active[13]=1;
    ends[13]=1;
    tdone[13]=1;
  }

  public void thread39639(int [] tdone, int [] ends){
        S22554=1;
    S22545=0;
    active[18]=1;
    ends[18]=1;
    tdone[18]=1;
  }

  public void thread39637(int [] tdone, int [] ends){
        S22525=1;
    active[17]=1;
    ends[17]=1;
    tdone[17]=1;
  }

  public void thread39636(int [] tdone, int [] ends){
        S22522=1;
    active[16]=1;
    ends[16]=1;
    tdone[16]=1;
  }

  public void thread39635(int [] tdone, int [] ends){
        S22535=1;
    S22534=0;
    thread39636(tdone,ends);
    thread39637(tdone,ends);
    int biggest39638 = 0;
    if(ends[16]>=biggest39638){
      biggest39638=ends[16];
    }
    if(ends[17]>=biggest39638){
      biggest39638=ends[17];
    }
    if(biggest39638 == 1){
      active[15]=1;
      ends[15]=1;
      tdone[15]=1;
    }
  }

  public void thread39634(int [] tdone, int [] ends){
        S22519=1;
    cylPos5ZAxisExtend.setPresent();//sysj\controller.sysj line: 186, column: 7
    currsigs.addElement(cylPos5ZAxisExtend);
    active[14]=1;
    ends[14]=1;
    tdone[14]=1;
  }

  public void thread39633(int [] tdone, int [] ends){
        S22513=1;
    cylClampBottleExtend.setPresent();//sysj\controller.sysj line: 179, column: 7
    currsigs.addElement(cylClampBottleExtend);
    active[13]=1;
    ends[13]=1;
    tdone[13]=1;
  }

  public void thread39631(int [] tdone, int [] ends){
        S22554=1;
    S22545=0;
    active[18]=1;
    ends[18]=1;
    tdone[18]=1;
  }

  public void thread39629(int [] tdone, int [] ends){
        S22525=1;
    active[17]=1;
    ends[17]=1;
    tdone[17]=1;
  }

  public void thread39628(int [] tdone, int [] ends){
        S22522=1;
    active[16]=1;
    ends[16]=1;
    tdone[16]=1;
  }

  public void thread39627(int [] tdone, int [] ends){
        S22535=1;
    S22534=0;
    thread39628(tdone,ends);
    thread39629(tdone,ends);
    int biggest39630 = 0;
    if(ends[16]>=biggest39630){
      biggest39630=ends[16];
    }
    if(ends[17]>=biggest39630){
      biggest39630=ends[17];
    }
    if(biggest39630 == 1){
      active[15]=1;
      ends[15]=1;
      tdone[15]=1;
    }
  }

  public void thread39626(int [] tdone, int [] ends){
        S22519=1;
    cylPos5ZAxisExtend.setPresent();//sysj\controller.sysj line: 186, column: 7
    currsigs.addElement(cylPos5ZAxisExtend);
    active[14]=1;
    ends[14]=1;
    tdone[14]=1;
  }

  public void thread39625(int [] tdone, int [] ends){
        S22513=1;
    cylClampBottleExtend.setPresent();//sysj\controller.sysj line: 179, column: 7
    currsigs.addElement(cylClampBottleExtend);
    active[13]=1;
    ends[13]=1;
    tdone[13]=1;
  }

  public void thread39623(int [] tdone, int [] ends){
        S22554=1;
    S22545=0;
    active[18]=1;
    ends[18]=1;
    tdone[18]=1;
  }

  public void thread39621(int [] tdone, int [] ends){
        S22525=1;
    active[17]=1;
    ends[17]=1;
    tdone[17]=1;
  }

  public void thread39620(int [] tdone, int [] ends){
        S22522=1;
    active[16]=1;
    ends[16]=1;
    tdone[16]=1;
  }

  public void thread39619(int [] tdone, int [] ends){
        S22535=1;
    S22534=0;
    thread39620(tdone,ends);
    thread39621(tdone,ends);
    int biggest39622 = 0;
    if(ends[16]>=biggest39622){
      biggest39622=ends[16];
    }
    if(ends[17]>=biggest39622){
      biggest39622=ends[17];
    }
    if(biggest39622 == 1){
      active[15]=1;
      ends[15]=1;
      tdone[15]=1;
    }
  }

  public void thread39618(int [] tdone, int [] ends){
        S22519=1;
    cylPos5ZAxisExtend.setPresent();//sysj\controller.sysj line: 186, column: 7
    currsigs.addElement(cylPos5ZAxisExtend);
    active[14]=1;
    ends[14]=1;
    tdone[14]=1;
  }

  public void thread39617(int [] tdone, int [] ends){
        S22513=1;
    cylClampBottleExtend.setPresent();//sysj\controller.sysj line: 179, column: 7
    currsigs.addElement(cylClampBottleExtend);
    active[13]=1;
    ends[13]=1;
    tdone[13]=1;
  }

  public void thread39615(int [] tdone, int [] ends){
        S22554=1;
    S22545=0;
    active[18]=1;
    ends[18]=1;
    tdone[18]=1;
  }

  public void thread39613(int [] tdone, int [] ends){
        S22525=1;
    active[17]=1;
    ends[17]=1;
    tdone[17]=1;
  }

  public void thread39612(int [] tdone, int [] ends){
        S22522=1;
    active[16]=1;
    ends[16]=1;
    tdone[16]=1;
  }

  public void thread39611(int [] tdone, int [] ends){
        S22535=1;
    S22534=0;
    thread39612(tdone,ends);
    thread39613(tdone,ends);
    int biggest39614 = 0;
    if(ends[16]>=biggest39614){
      biggest39614=ends[16];
    }
    if(ends[17]>=biggest39614){
      biggest39614=ends[17];
    }
    if(biggest39614 == 1){
      active[15]=1;
      ends[15]=1;
      tdone[15]=1;
    }
  }

  public void thread39610(int [] tdone, int [] ends){
        S22519=1;
    cylPos5ZAxisExtend.setPresent();//sysj\controller.sysj line: 186, column: 7
    currsigs.addElement(cylPos5ZAxisExtend);
    active[14]=1;
    ends[14]=1;
    tdone[14]=1;
  }

  public void thread39609(int [] tdone, int [] ends){
        S22513=1;
    cylClampBottleExtend.setPresent();//sysj\controller.sysj line: 179, column: 7
    currsigs.addElement(cylClampBottleExtend);
    active[13]=1;
    ends[13]=1;
    tdone[13]=1;
  }

  public void thread39607(int [] tdone, int [] ends){
        S22554=1;
    S22545=0;
    active[18]=1;
    ends[18]=1;
    tdone[18]=1;
  }

  public void thread39605(int [] tdone, int [] ends){
        S22525=1;
    active[17]=1;
    ends[17]=1;
    tdone[17]=1;
  }

  public void thread39604(int [] tdone, int [] ends){
        S22522=1;
    active[16]=1;
    ends[16]=1;
    tdone[16]=1;
  }

  public void thread39603(int [] tdone, int [] ends){
        S22535=1;
    S22534=0;
    thread39604(tdone,ends);
    thread39605(tdone,ends);
    int biggest39606 = 0;
    if(ends[16]>=biggest39606){
      biggest39606=ends[16];
    }
    if(ends[17]>=biggest39606){
      biggest39606=ends[17];
    }
    if(biggest39606 == 1){
      active[15]=1;
      ends[15]=1;
      tdone[15]=1;
    }
  }

  public void thread39602(int [] tdone, int [] ends){
        S22519=1;
    cylPos5ZAxisExtend.setPresent();//sysj\controller.sysj line: 186, column: 7
    currsigs.addElement(cylPos5ZAxisExtend);
    active[14]=1;
    ends[14]=1;
    tdone[14]=1;
  }

  public void thread39601(int [] tdone, int [] ends){
        S22513=1;
    cylClampBottleExtend.setPresent();//sysj\controller.sysj line: 179, column: 7
    currsigs.addElement(cylClampBottleExtend);
    active[13]=1;
    ends[13]=1;
    tdone[13]=1;
  }

  public void thread39599(int [] tdone, int [] ends){
        S22554=1;
    S22545=0;
    active[18]=1;
    ends[18]=1;
    tdone[18]=1;
  }

  public void thread39597(int [] tdone, int [] ends){
        S22525=1;
    active[17]=1;
    ends[17]=1;
    tdone[17]=1;
  }

  public void thread39596(int [] tdone, int [] ends){
        S22522=1;
    active[16]=1;
    ends[16]=1;
    tdone[16]=1;
  }

  public void thread39595(int [] tdone, int [] ends){
        S22535=1;
    S22534=0;
    thread39596(tdone,ends);
    thread39597(tdone,ends);
    int biggest39598 = 0;
    if(ends[16]>=biggest39598){
      biggest39598=ends[16];
    }
    if(ends[17]>=biggest39598){
      biggest39598=ends[17];
    }
    if(biggest39598 == 1){
      active[15]=1;
      ends[15]=1;
      tdone[15]=1;
    }
  }

  public void thread39594(int [] tdone, int [] ends){
        S22519=1;
    cylPos5ZAxisExtend.setPresent();//sysj\controller.sysj line: 186, column: 7
    currsigs.addElement(cylPos5ZAxisExtend);
    active[14]=1;
    ends[14]=1;
    tdone[14]=1;
  }

  public void thread39593(int [] tdone, int [] ends){
        S22513=1;
    cylClampBottleExtend.setPresent();//sysj\controller.sysj line: 179, column: 7
    currsigs.addElement(cylClampBottleExtend);
    active[13]=1;
    ends[13]=1;
    tdone[13]=1;
  }

  public void thread39591(int [] tdone, int [] ends){
        S22554=1;
    S22545=0;
    active[18]=1;
    ends[18]=1;
    tdone[18]=1;
  }

  public void thread39589(int [] tdone, int [] ends){
        S22525=1;
    active[17]=1;
    ends[17]=1;
    tdone[17]=1;
  }

  public void thread39588(int [] tdone, int [] ends){
        S22522=1;
    active[16]=1;
    ends[16]=1;
    tdone[16]=1;
  }

  public void thread39587(int [] tdone, int [] ends){
        S22535=1;
    S22534=0;
    thread39588(tdone,ends);
    thread39589(tdone,ends);
    int biggest39590 = 0;
    if(ends[16]>=biggest39590){
      biggest39590=ends[16];
    }
    if(ends[17]>=biggest39590){
      biggest39590=ends[17];
    }
    if(biggest39590 == 1){
      active[15]=1;
      ends[15]=1;
      tdone[15]=1;
    }
  }

  public void thread39586(int [] tdone, int [] ends){
        S22519=1;
    cylPos5ZAxisExtend.setPresent();//sysj\controller.sysj line: 186, column: 7
    currsigs.addElement(cylPos5ZAxisExtend);
    active[14]=1;
    ends[14]=1;
    tdone[14]=1;
  }

  public void thread39585(int [] tdone, int [] ends){
        S22513=1;
    cylClampBottleExtend.setPresent();//sysj\controller.sysj line: 179, column: 7
    currsigs.addElement(cylClampBottleExtend);
    active[13]=1;
    ends[13]=1;
    tdone[13]=1;
  }

  public void thread39583(int [] tdone, int [] ends){
        S22554=1;
    S22545=0;
    active[18]=1;
    ends[18]=1;
    tdone[18]=1;
  }

  public void thread39581(int [] tdone, int [] ends){
        S22525=1;
    active[17]=1;
    ends[17]=1;
    tdone[17]=1;
  }

  public void thread39580(int [] tdone, int [] ends){
        S22522=1;
    active[16]=1;
    ends[16]=1;
    tdone[16]=1;
  }

  public void thread39579(int [] tdone, int [] ends){
        S22535=1;
    S22534=0;
    thread39580(tdone,ends);
    thread39581(tdone,ends);
    int biggest39582 = 0;
    if(ends[16]>=biggest39582){
      biggest39582=ends[16];
    }
    if(ends[17]>=biggest39582){
      biggest39582=ends[17];
    }
    if(biggest39582 == 1){
      active[15]=1;
      ends[15]=1;
      tdone[15]=1;
    }
  }

  public void thread39578(int [] tdone, int [] ends){
        S22519=1;
    cylPos5ZAxisExtend.setPresent();//sysj\controller.sysj line: 186, column: 7
    currsigs.addElement(cylPos5ZAxisExtend);
    active[14]=1;
    ends[14]=1;
    tdone[14]=1;
  }

  public void thread39577(int [] tdone, int [] ends){
        S22513=1;
    cylClampBottleExtend.setPresent();//sysj\controller.sysj line: 179, column: 7
    currsigs.addElement(cylClampBottleExtend);
    active[13]=1;
    ends[13]=1;
    tdone[13]=1;
  }

  public void thread39575(int [] tdone, int [] ends){
        S22554=1;
    S22545=0;
    active[18]=1;
    ends[18]=1;
    tdone[18]=1;
  }

  public void thread39573(int [] tdone, int [] ends){
        S22525=1;
    active[17]=1;
    ends[17]=1;
    tdone[17]=1;
  }

  public void thread39572(int [] tdone, int [] ends){
        S22522=1;
    active[16]=1;
    ends[16]=1;
    tdone[16]=1;
  }

  public void thread39571(int [] tdone, int [] ends){
        S22535=1;
    S22534=0;
    thread39572(tdone,ends);
    thread39573(tdone,ends);
    int biggest39574 = 0;
    if(ends[16]>=biggest39574){
      biggest39574=ends[16];
    }
    if(ends[17]>=biggest39574){
      biggest39574=ends[17];
    }
    if(biggest39574 == 1){
      active[15]=1;
      ends[15]=1;
      tdone[15]=1;
    }
  }

  public void thread39570(int [] tdone, int [] ends){
        S22519=1;
    cylPos5ZAxisExtend.setPresent();//sysj\controller.sysj line: 186, column: 7
    currsigs.addElement(cylPos5ZAxisExtend);
    active[14]=1;
    ends[14]=1;
    tdone[14]=1;
  }

  public void thread39569(int [] tdone, int [] ends){
        S22513=1;
    cylClampBottleExtend.setPresent();//sysj\controller.sysj line: 179, column: 7
    currsigs.addElement(cylClampBottleExtend);
    active[13]=1;
    ends[13]=1;
    tdone[13]=1;
  }

  public void thread39567(int [] tdone, int [] ends){
        S22554=1;
    S22545=0;
    active[18]=1;
    ends[18]=1;
    tdone[18]=1;
  }

  public void thread39565(int [] tdone, int [] ends){
        S22525=1;
    active[17]=1;
    ends[17]=1;
    tdone[17]=1;
  }

  public void thread39564(int [] tdone, int [] ends){
        S22522=1;
    active[16]=1;
    ends[16]=1;
    tdone[16]=1;
  }

  public void thread39563(int [] tdone, int [] ends){
        S22535=1;
    S22534=0;
    thread39564(tdone,ends);
    thread39565(tdone,ends);
    int biggest39566 = 0;
    if(ends[16]>=biggest39566){
      biggest39566=ends[16];
    }
    if(ends[17]>=biggest39566){
      biggest39566=ends[17];
    }
    if(biggest39566 == 1){
      active[15]=1;
      ends[15]=1;
      tdone[15]=1;
    }
  }

  public void thread39562(int [] tdone, int [] ends){
        S22519=1;
    cylPos5ZAxisExtend.setPresent();//sysj\controller.sysj line: 186, column: 7
    currsigs.addElement(cylPos5ZAxisExtend);
    active[14]=1;
    ends[14]=1;
    tdone[14]=1;
  }

  public void thread39561(int [] tdone, int [] ends){
        S22513=1;
    cylClampBottleExtend.setPresent();//sysj\controller.sysj line: 179, column: 7
    currsigs.addElement(cylClampBottleExtend);
    active[13]=1;
    ends[13]=1;
    tdone[13]=1;
  }

  public void runClockDomain(){
    for(int i=0;i<ends.length;i++){
      ends[i] = 0;
      tdone[i] = 0;
    }
    
    RUN: while(true){
      switch(S31990){
        case 0 : 
          S31990=0;
          break RUN;
        
        case 1 : 
          S31990=2;
          S31990=2;
          releaseCap_12.setClear();//sysj\controller.sysj line: 160, column: 2
          raiseGripper_12.setClear();//sysj\controller.sysj line: 160, column: 2
          unclampBottle_12.setClear();//sysj\controller.sysj line: 160, column: 2
          S22414=0;
          S22398=0;
          if(!capperReq_in.isPartnerPresent() || capperReq_in.isPartnerPreempted()){//sysj\controller.sysj line: 163, column: 3
            capperReq_in.setACK(false);//sysj\controller.sysj line: 163, column: 3
            S22398=1;
            active[12]=1;
            ends[12]=1;
            break RUN;
          }
          else {
            S22393=0;
            if(!capperReq_in.isREQ()){//sysj\controller.sysj line: 163, column: 3
              capperReq_in.setACK(true);//sysj\controller.sysj line: 163, column: 3
              S22393=1;
              if(capperReq_in.isREQ()){//sysj\controller.sysj line: 163, column: 3
                capperReq_in.setACK(false);//sysj\controller.sysj line: 163, column: 3
                ends[12]=2;
                ;//sysj\controller.sysj line: 163, column: 3
                request_thread_12 = (boolean)(capperReq_in.getVal() == null ? false : ((Boolean)capperReq_in.getVal()).booleanValue());//sysj\controller.sysj line: 164, column: 3
                S22414=1;
                if(request_thread_12){//sysj\controller.sysj line: 166, column: 3
                  System.out.println("CapperController: Received request");//sysj\controller.sysj line: 167, column: 4
                  S22507=0;
                  if(!bottleAtPos4.getprestatus()){//sysj\controller.sysj line: 169, column: 12
                    System.out.println("capperidle");//sysj\controller.sysj line: 170, column: 5
                    S22421=0;
                    if(!capperStatus_o.isPartnerPresent() || capperStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 171, column: 5
                      capperStatus_o.setREQ(false);//sysj\controller.sysj line: 171, column: 5
                      S22421=1;
                      active[12]=1;
                      ends[12]=1;
                      break RUN;
                    }
                    else {
                      S22416=0;
                      if(capperStatus_o.isACK()){//sysj\controller.sysj line: 171, column: 5
                        capperStatus_o.setVal("idle");//sysj\controller.sysj line: 171, column: 5
                        S22416=1;
                        if(!capperStatus_o.isACK()){//sysj\controller.sysj line: 171, column: 5
                          capperStatus_o.setREQ(false);//sysj\controller.sysj line: 171, column: 5
                          ends[12]=2;
                          ;//sysj\controller.sysj line: 171, column: 5
                          S22507=1;
                          if(bottleAtPos4.getprestatus()){//sysj\controller.sysj line: 174, column: 12
                            System.out.println("CapperController: Capper doing work...");//sysj\controller.sysj line: 175, column: 5
                            S22602=0;
                            thread39561(tdone,ends);
                            thread39562(tdone,ends);
                            thread39563(tdone,ends);
                            thread39567(tdone,ends);
                            int biggest39568 = 0;
                            if(ends[13]>=biggest39568){
                              biggest39568=ends[13];
                            }
                            if(ends[14]>=biggest39568){
                              biggest39568=ends[14];
                            }
                            if(ends[15]>=biggest39568){
                              biggest39568=ends[15];
                            }
                            if(ends[18]>=biggest39568){
                              biggest39568=ends[18];
                            }
                            if(biggest39568 == 1){
                              active[12]=1;
                              ends[12]=1;
                              break RUN;
                            }
                          }
                          else {
                            S22414=2;
                            active[12]=1;
                            ends[12]=1;
                            break RUN;
                          }
                        }
                        else {
                          active[12]=1;
                          ends[12]=1;
                          break RUN;
                        }
                      }
                      else {
                        active[12]=1;
                        ends[12]=1;
                        break RUN;
                      }
                    }
                  }
                  else {
                    S22507=1;
                    if(bottleAtPos4.getprestatus()){//sysj\controller.sysj line: 174, column: 12
                      System.out.println("CapperController: Capper doing work...");//sysj\controller.sysj line: 175, column: 5
                      S22602=0;
                      thread39569(tdone,ends);
                      thread39570(tdone,ends);
                      thread39571(tdone,ends);
                      thread39575(tdone,ends);
                      int biggest39576 = 0;
                      if(ends[13]>=biggest39576){
                        biggest39576=ends[13];
                      }
                      if(ends[14]>=biggest39576){
                        biggest39576=ends[14];
                      }
                      if(ends[15]>=biggest39576){
                        biggest39576=ends[15];
                      }
                      if(ends[18]>=biggest39576){
                        biggest39576=ends[18];
                      }
                      if(biggest39576 == 1){
                        active[12]=1;
                        ends[12]=1;
                        break RUN;
                      }
                    }
                    else {
                      S22414=2;
                      active[12]=1;
                      ends[12]=1;
                      break RUN;
                    }
                  }
                }
                else {
                  S22414=2;
                  active[12]=1;
                  ends[12]=1;
                  break RUN;
                }
              }
              else {
                active[12]=1;
                ends[12]=1;
                break RUN;
              }
            }
            else {
              active[12]=1;
              ends[12]=1;
              break RUN;
            }
          }
        
        case 2 : 
          releaseCap_12.setClear();//sysj\controller.sysj line: 160, column: 2
          raiseGripper_12.setClear();//sysj\controller.sysj line: 160, column: 2
          unclampBottle_12.setClear();//sysj\controller.sysj line: 160, column: 2
          switch(S22414){
            case 0 : 
              switch(S22398){
                case 0 : 
                  if(!capperReq_in.isPartnerPresent() || capperReq_in.isPartnerPreempted()){//sysj\controller.sysj line: 163, column: 3
                    capperReq_in.setACK(false);//sysj\controller.sysj line: 163, column: 3
                    S22398=1;
                    active[12]=1;
                    ends[12]=1;
                    break RUN;
                  }
                  else {
                    switch(S22393){
                      case 0 : 
                        if(!capperReq_in.isREQ()){//sysj\controller.sysj line: 163, column: 3
                          capperReq_in.setACK(true);//sysj\controller.sysj line: 163, column: 3
                          S22393=1;
                          if(capperReq_in.isREQ()){//sysj\controller.sysj line: 163, column: 3
                            capperReq_in.setACK(false);//sysj\controller.sysj line: 163, column: 3
                            ends[12]=2;
                            ;//sysj\controller.sysj line: 163, column: 3
                            request_thread_12 = (boolean)(capperReq_in.getVal() == null ? false : ((Boolean)capperReq_in.getVal()).booleanValue());//sysj\controller.sysj line: 164, column: 3
                            S22414=1;
                            if(request_thread_12){//sysj\controller.sysj line: 166, column: 3
                              System.out.println("CapperController: Received request");//sysj\controller.sysj line: 167, column: 4
                              S22507=0;
                              if(!bottleAtPos4.getprestatus()){//sysj\controller.sysj line: 169, column: 12
                                System.out.println("capperidle");//sysj\controller.sysj line: 170, column: 5
                                S22421=0;
                                if(!capperStatus_o.isPartnerPresent() || capperStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 171, column: 5
                                  capperStatus_o.setREQ(false);//sysj\controller.sysj line: 171, column: 5
                                  S22421=1;
                                  active[12]=1;
                                  ends[12]=1;
                                  break RUN;
                                }
                                else {
                                  S22416=0;
                                  if(capperStatus_o.isACK()){//sysj\controller.sysj line: 171, column: 5
                                    capperStatus_o.setVal("idle");//sysj\controller.sysj line: 171, column: 5
                                    S22416=1;
                                    if(!capperStatus_o.isACK()){//sysj\controller.sysj line: 171, column: 5
                                      capperStatus_o.setREQ(false);//sysj\controller.sysj line: 171, column: 5
                                      ends[12]=2;
                                      ;//sysj\controller.sysj line: 171, column: 5
                                      S22507=1;
                                      if(bottleAtPos4.getprestatus()){//sysj\controller.sysj line: 174, column: 12
                                        System.out.println("CapperController: Capper doing work...");//sysj\controller.sysj line: 175, column: 5
                                        S22602=0;
                                        thread39577(tdone,ends);
                                        thread39578(tdone,ends);
                                        thread39579(tdone,ends);
                                        thread39583(tdone,ends);
                                        int biggest39584 = 0;
                                        if(ends[13]>=biggest39584){
                                          biggest39584=ends[13];
                                        }
                                        if(ends[14]>=biggest39584){
                                          biggest39584=ends[14];
                                        }
                                        if(ends[15]>=biggest39584){
                                          biggest39584=ends[15];
                                        }
                                        if(ends[18]>=biggest39584){
                                          biggest39584=ends[18];
                                        }
                                        if(biggest39584 == 1){
                                          active[12]=1;
                                          ends[12]=1;
                                          break RUN;
                                        }
                                      }
                                      else {
                                        S22414=2;
                                        active[12]=1;
                                        ends[12]=1;
                                        break RUN;
                                      }
                                    }
                                    else {
                                      active[12]=1;
                                      ends[12]=1;
                                      break RUN;
                                    }
                                  }
                                  else {
                                    active[12]=1;
                                    ends[12]=1;
                                    break RUN;
                                  }
                                }
                              }
                              else {
                                S22507=1;
                                if(bottleAtPos4.getprestatus()){//sysj\controller.sysj line: 174, column: 12
                                  System.out.println("CapperController: Capper doing work...");//sysj\controller.sysj line: 175, column: 5
                                  S22602=0;
                                  thread39585(tdone,ends);
                                  thread39586(tdone,ends);
                                  thread39587(tdone,ends);
                                  thread39591(tdone,ends);
                                  int biggest39592 = 0;
                                  if(ends[13]>=biggest39592){
                                    biggest39592=ends[13];
                                  }
                                  if(ends[14]>=biggest39592){
                                    biggest39592=ends[14];
                                  }
                                  if(ends[15]>=biggest39592){
                                    biggest39592=ends[15];
                                  }
                                  if(ends[18]>=biggest39592){
                                    biggest39592=ends[18];
                                  }
                                  if(biggest39592 == 1){
                                    active[12]=1;
                                    ends[12]=1;
                                    break RUN;
                                  }
                                }
                                else {
                                  S22414=2;
                                  active[12]=1;
                                  ends[12]=1;
                                  break RUN;
                                }
                              }
                            }
                            else {
                              S22414=2;
                              active[12]=1;
                              ends[12]=1;
                              break RUN;
                            }
                          }
                          else {
                            active[12]=1;
                            ends[12]=1;
                            break RUN;
                          }
                        }
                        else {
                          active[12]=1;
                          ends[12]=1;
                          break RUN;
                        }
                      
                      case 1 : 
                        if(capperReq_in.isREQ()){//sysj\controller.sysj line: 163, column: 3
                          capperReq_in.setACK(false);//sysj\controller.sysj line: 163, column: 3
                          ends[12]=2;
                          ;//sysj\controller.sysj line: 163, column: 3
                          request_thread_12 = (boolean)(capperReq_in.getVal() == null ? false : ((Boolean)capperReq_in.getVal()).booleanValue());//sysj\controller.sysj line: 164, column: 3
                          S22414=1;
                          if(request_thread_12){//sysj\controller.sysj line: 166, column: 3
                            System.out.println("CapperController: Received request");//sysj\controller.sysj line: 167, column: 4
                            S22507=0;
                            if(!bottleAtPos4.getprestatus()){//sysj\controller.sysj line: 169, column: 12
                              System.out.println("capperidle");//sysj\controller.sysj line: 170, column: 5
                              S22421=0;
                              if(!capperStatus_o.isPartnerPresent() || capperStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 171, column: 5
                                capperStatus_o.setREQ(false);//sysj\controller.sysj line: 171, column: 5
                                S22421=1;
                                active[12]=1;
                                ends[12]=1;
                                break RUN;
                              }
                              else {
                                S22416=0;
                                if(capperStatus_o.isACK()){//sysj\controller.sysj line: 171, column: 5
                                  capperStatus_o.setVal("idle");//sysj\controller.sysj line: 171, column: 5
                                  S22416=1;
                                  if(!capperStatus_o.isACK()){//sysj\controller.sysj line: 171, column: 5
                                    capperStatus_o.setREQ(false);//sysj\controller.sysj line: 171, column: 5
                                    ends[12]=2;
                                    ;//sysj\controller.sysj line: 171, column: 5
                                    S22507=1;
                                    if(bottleAtPos4.getprestatus()){//sysj\controller.sysj line: 174, column: 12
                                      System.out.println("CapperController: Capper doing work...");//sysj\controller.sysj line: 175, column: 5
                                      S22602=0;
                                      thread39593(tdone,ends);
                                      thread39594(tdone,ends);
                                      thread39595(tdone,ends);
                                      thread39599(tdone,ends);
                                      int biggest39600 = 0;
                                      if(ends[13]>=biggest39600){
                                        biggest39600=ends[13];
                                      }
                                      if(ends[14]>=biggest39600){
                                        biggest39600=ends[14];
                                      }
                                      if(ends[15]>=biggest39600){
                                        biggest39600=ends[15];
                                      }
                                      if(ends[18]>=biggest39600){
                                        biggest39600=ends[18];
                                      }
                                      if(biggest39600 == 1){
                                        active[12]=1;
                                        ends[12]=1;
                                        break RUN;
                                      }
                                    }
                                    else {
                                      S22414=2;
                                      active[12]=1;
                                      ends[12]=1;
                                      break RUN;
                                    }
                                  }
                                  else {
                                    active[12]=1;
                                    ends[12]=1;
                                    break RUN;
                                  }
                                }
                                else {
                                  active[12]=1;
                                  ends[12]=1;
                                  break RUN;
                                }
                              }
                            }
                            else {
                              S22507=1;
                              if(bottleAtPos4.getprestatus()){//sysj\controller.sysj line: 174, column: 12
                                System.out.println("CapperController: Capper doing work...");//sysj\controller.sysj line: 175, column: 5
                                S22602=0;
                                thread39601(tdone,ends);
                                thread39602(tdone,ends);
                                thread39603(tdone,ends);
                                thread39607(tdone,ends);
                                int biggest39608 = 0;
                                if(ends[13]>=biggest39608){
                                  biggest39608=ends[13];
                                }
                                if(ends[14]>=biggest39608){
                                  biggest39608=ends[14];
                                }
                                if(ends[15]>=biggest39608){
                                  biggest39608=ends[15];
                                }
                                if(ends[18]>=biggest39608){
                                  biggest39608=ends[18];
                                }
                                if(biggest39608 == 1){
                                  active[12]=1;
                                  ends[12]=1;
                                  break RUN;
                                }
                              }
                              else {
                                S22414=2;
                                active[12]=1;
                                ends[12]=1;
                                break RUN;
                              }
                            }
                          }
                          else {
                            S22414=2;
                            active[12]=1;
                            ends[12]=1;
                            break RUN;
                          }
                        }
                        else {
                          active[12]=1;
                          ends[12]=1;
                          break RUN;
                        }
                      
                    }
                  }
                  break;
                
                case 1 : 
                  S22398=1;
                  S22398=0;
                  if(!capperReq_in.isPartnerPresent() || capperReq_in.isPartnerPreempted()){//sysj\controller.sysj line: 163, column: 3
                    capperReq_in.setACK(false);//sysj\controller.sysj line: 163, column: 3
                    S22398=1;
                    active[12]=1;
                    ends[12]=1;
                    break RUN;
                  }
                  else {
                    S22393=0;
                    if(!capperReq_in.isREQ()){//sysj\controller.sysj line: 163, column: 3
                      capperReq_in.setACK(true);//sysj\controller.sysj line: 163, column: 3
                      S22393=1;
                      if(capperReq_in.isREQ()){//sysj\controller.sysj line: 163, column: 3
                        capperReq_in.setACK(false);//sysj\controller.sysj line: 163, column: 3
                        ends[12]=2;
                        ;//sysj\controller.sysj line: 163, column: 3
                        request_thread_12 = (boolean)(capperReq_in.getVal() == null ? false : ((Boolean)capperReq_in.getVal()).booleanValue());//sysj\controller.sysj line: 164, column: 3
                        S22414=1;
                        if(request_thread_12){//sysj\controller.sysj line: 166, column: 3
                          System.out.println("CapperController: Received request");//sysj\controller.sysj line: 167, column: 4
                          S22507=0;
                          if(!bottleAtPos4.getprestatus()){//sysj\controller.sysj line: 169, column: 12
                            System.out.println("capperidle");//sysj\controller.sysj line: 170, column: 5
                            S22421=0;
                            if(!capperStatus_o.isPartnerPresent() || capperStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 171, column: 5
                              capperStatus_o.setREQ(false);//sysj\controller.sysj line: 171, column: 5
                              S22421=1;
                              active[12]=1;
                              ends[12]=1;
                              break RUN;
                            }
                            else {
                              S22416=0;
                              if(capperStatus_o.isACK()){//sysj\controller.sysj line: 171, column: 5
                                capperStatus_o.setVal("idle");//sysj\controller.sysj line: 171, column: 5
                                S22416=1;
                                if(!capperStatus_o.isACK()){//sysj\controller.sysj line: 171, column: 5
                                  capperStatus_o.setREQ(false);//sysj\controller.sysj line: 171, column: 5
                                  ends[12]=2;
                                  ;//sysj\controller.sysj line: 171, column: 5
                                  S22507=1;
                                  if(bottleAtPos4.getprestatus()){//sysj\controller.sysj line: 174, column: 12
                                    System.out.println("CapperController: Capper doing work...");//sysj\controller.sysj line: 175, column: 5
                                    S22602=0;
                                    thread39609(tdone,ends);
                                    thread39610(tdone,ends);
                                    thread39611(tdone,ends);
                                    thread39615(tdone,ends);
                                    int biggest39616 = 0;
                                    if(ends[13]>=biggest39616){
                                      biggest39616=ends[13];
                                    }
                                    if(ends[14]>=biggest39616){
                                      biggest39616=ends[14];
                                    }
                                    if(ends[15]>=biggest39616){
                                      biggest39616=ends[15];
                                    }
                                    if(ends[18]>=biggest39616){
                                      biggest39616=ends[18];
                                    }
                                    if(biggest39616 == 1){
                                      active[12]=1;
                                      ends[12]=1;
                                      break RUN;
                                    }
                                  }
                                  else {
                                    S22414=2;
                                    active[12]=1;
                                    ends[12]=1;
                                    break RUN;
                                  }
                                }
                                else {
                                  active[12]=1;
                                  ends[12]=1;
                                  break RUN;
                                }
                              }
                              else {
                                active[12]=1;
                                ends[12]=1;
                                break RUN;
                              }
                            }
                          }
                          else {
                            S22507=1;
                            if(bottleAtPos4.getprestatus()){//sysj\controller.sysj line: 174, column: 12
                              System.out.println("CapperController: Capper doing work...");//sysj\controller.sysj line: 175, column: 5
                              S22602=0;
                              thread39617(tdone,ends);
                              thread39618(tdone,ends);
                              thread39619(tdone,ends);
                              thread39623(tdone,ends);
                              int biggest39624 = 0;
                              if(ends[13]>=biggest39624){
                                biggest39624=ends[13];
                              }
                              if(ends[14]>=biggest39624){
                                biggest39624=ends[14];
                              }
                              if(ends[15]>=biggest39624){
                                biggest39624=ends[15];
                              }
                              if(ends[18]>=biggest39624){
                                biggest39624=ends[18];
                              }
                              if(biggest39624 == 1){
                                active[12]=1;
                                ends[12]=1;
                                break RUN;
                              }
                            }
                            else {
                              S22414=2;
                              active[12]=1;
                              ends[12]=1;
                              break RUN;
                            }
                          }
                        }
                        else {
                          S22414=2;
                          active[12]=1;
                          ends[12]=1;
                          break RUN;
                        }
                      }
                      else {
                        active[12]=1;
                        ends[12]=1;
                        break RUN;
                      }
                    }
                    else {
                      active[12]=1;
                      ends[12]=1;
                      break RUN;
                    }
                  }
                
              }
              break;
            
            case 1 : 
              switch(S22507){
                case 0 : 
                  switch(S22421){
                    case 0 : 
                      if(!capperStatus_o.isPartnerPresent() || capperStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 171, column: 5
                        capperStatus_o.setREQ(false);//sysj\controller.sysj line: 171, column: 5
                        S22421=1;
                        active[12]=1;
                        ends[12]=1;
                        break RUN;
                      }
                      else {
                        switch(S22416){
                          case 0 : 
                            if(capperStatus_o.isACK()){//sysj\controller.sysj line: 171, column: 5
                              capperStatus_o.setVal("idle");//sysj\controller.sysj line: 171, column: 5
                              S22416=1;
                              if(!capperStatus_o.isACK()){//sysj\controller.sysj line: 171, column: 5
                                capperStatus_o.setREQ(false);//sysj\controller.sysj line: 171, column: 5
                                ends[12]=2;
                                ;//sysj\controller.sysj line: 171, column: 5
                                S22507=1;
                                if(bottleAtPos4.getprestatus()){//sysj\controller.sysj line: 174, column: 12
                                  System.out.println("CapperController: Capper doing work...");//sysj\controller.sysj line: 175, column: 5
                                  S22602=0;
                                  thread39625(tdone,ends);
                                  thread39626(tdone,ends);
                                  thread39627(tdone,ends);
                                  thread39631(tdone,ends);
                                  int biggest39632 = 0;
                                  if(ends[13]>=biggest39632){
                                    biggest39632=ends[13];
                                  }
                                  if(ends[14]>=biggest39632){
                                    biggest39632=ends[14];
                                  }
                                  if(ends[15]>=biggest39632){
                                    biggest39632=ends[15];
                                  }
                                  if(ends[18]>=biggest39632){
                                    biggest39632=ends[18];
                                  }
                                  if(biggest39632 == 1){
                                    active[12]=1;
                                    ends[12]=1;
                                    break RUN;
                                  }
                                }
                                else {
                                  S22414=2;
                                  active[12]=1;
                                  ends[12]=1;
                                  break RUN;
                                }
                              }
                              else {
                                active[12]=1;
                                ends[12]=1;
                                break RUN;
                              }
                            }
                            else {
                              active[12]=1;
                              ends[12]=1;
                              break RUN;
                            }
                          
                          case 1 : 
                            if(!capperStatus_o.isACK()){//sysj\controller.sysj line: 171, column: 5
                              capperStatus_o.setREQ(false);//sysj\controller.sysj line: 171, column: 5
                              ends[12]=2;
                              ;//sysj\controller.sysj line: 171, column: 5
                              S22507=1;
                              if(bottleAtPos4.getprestatus()){//sysj\controller.sysj line: 174, column: 12
                                System.out.println("CapperController: Capper doing work...");//sysj\controller.sysj line: 175, column: 5
                                S22602=0;
                                thread39633(tdone,ends);
                                thread39634(tdone,ends);
                                thread39635(tdone,ends);
                                thread39639(tdone,ends);
                                int biggest39640 = 0;
                                if(ends[13]>=biggest39640){
                                  biggest39640=ends[13];
                                }
                                if(ends[14]>=biggest39640){
                                  biggest39640=ends[14];
                                }
                                if(ends[15]>=biggest39640){
                                  biggest39640=ends[15];
                                }
                                if(ends[18]>=biggest39640){
                                  biggest39640=ends[18];
                                }
                                if(biggest39640 == 1){
                                  active[12]=1;
                                  ends[12]=1;
                                  break RUN;
                                }
                              }
                              else {
                                S22414=2;
                                active[12]=1;
                                ends[12]=1;
                                break RUN;
                              }
                            }
                            else {
                              active[12]=1;
                              ends[12]=1;
                              break RUN;
                            }
                          
                        }
                      }
                      break;
                    
                    case 1 : 
                      S22421=1;
                      S22421=0;
                      if(!capperStatus_o.isPartnerPresent() || capperStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 171, column: 5
                        capperStatus_o.setREQ(false);//sysj\controller.sysj line: 171, column: 5
                        S22421=1;
                        active[12]=1;
                        ends[12]=1;
                        break RUN;
                      }
                      else {
                        S22416=0;
                        if(capperStatus_o.isACK()){//sysj\controller.sysj line: 171, column: 5
                          capperStatus_o.setVal("idle");//sysj\controller.sysj line: 171, column: 5
                          S22416=1;
                          if(!capperStatus_o.isACK()){//sysj\controller.sysj line: 171, column: 5
                            capperStatus_o.setREQ(false);//sysj\controller.sysj line: 171, column: 5
                            ends[12]=2;
                            ;//sysj\controller.sysj line: 171, column: 5
                            S22507=1;
                            if(bottleAtPos4.getprestatus()){//sysj\controller.sysj line: 174, column: 12
                              System.out.println("CapperController: Capper doing work...");//sysj\controller.sysj line: 175, column: 5
                              S22602=0;
                              thread39641(tdone,ends);
                              thread39642(tdone,ends);
                              thread39643(tdone,ends);
                              thread39647(tdone,ends);
                              int biggest39648 = 0;
                              if(ends[13]>=biggest39648){
                                biggest39648=ends[13];
                              }
                              if(ends[14]>=biggest39648){
                                biggest39648=ends[14];
                              }
                              if(ends[15]>=biggest39648){
                                biggest39648=ends[15];
                              }
                              if(ends[18]>=biggest39648){
                                biggest39648=ends[18];
                              }
                              if(biggest39648 == 1){
                                active[12]=1;
                                ends[12]=1;
                                break RUN;
                              }
                            }
                            else {
                              S22414=2;
                              active[12]=1;
                              ends[12]=1;
                              break RUN;
                            }
                          }
                          else {
                            active[12]=1;
                            ends[12]=1;
                            break RUN;
                          }
                        }
                        else {
                          active[12]=1;
                          ends[12]=1;
                          break RUN;
                        }
                      }
                    
                  }
                  break;
                
                case 1 : 
                  switch(S22602){
                    case 0 : 
                      thread39649(tdone,ends);
                      thread39650(tdone,ends);
                      thread39651(tdone,ends);
                      thread39655(tdone,ends);
                      int biggest39656 = 0;
                      if(ends[13]>=biggest39656){
                        biggest39656=ends[13];
                      }
                      if(ends[14]>=biggest39656){
                        biggest39656=ends[14];
                      }
                      if(ends[15]>=biggest39656){
                        biggest39656=ends[15];
                      }
                      if(ends[18]>=biggest39656){
                        biggest39656=ends[18];
                      }
                      if(biggest39656 == 1){
                        active[12]=1;
                        ends[12]=1;
                        break RUN;
                      }
                      //FINXME code
                      if(biggest39656 == 0){
                        S22602=1;
                        S22609=0;
                        if(!capperStatus_o.isPartnerPresent() || capperStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 214, column: 5
                          capperStatus_o.setREQ(false);//sysj\controller.sysj line: 214, column: 5
                          S22609=1;
                          active[12]=1;
                          ends[12]=1;
                          break RUN;
                        }
                        else {
                          S22604=0;
                          if(capperStatus_o.isACK()){//sysj\controller.sysj line: 214, column: 5
                            capperStatus_o.setVal("done");//sysj\controller.sysj line: 214, column: 5
                            S22604=1;
                            if(!capperStatus_o.isACK()){//sysj\controller.sysj line: 214, column: 5
                              capperStatus_o.setREQ(false);//sysj\controller.sysj line: 214, column: 5
                              ends[12]=2;
                              ;//sysj\controller.sysj line: 214, column: 5
                              S22414=2;
                              active[12]=1;
                              ends[12]=1;
                              break RUN;
                            }
                            else {
                              active[12]=1;
                              ends[12]=1;
                              break RUN;
                            }
                          }
                          else {
                            active[12]=1;
                            ends[12]=1;
                            break RUN;
                          }
                        }
                      }
                    
                    case 1 : 
                      switch(S22609){
                        case 0 : 
                          if(!capperStatus_o.isPartnerPresent() || capperStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 214, column: 5
                            capperStatus_o.setREQ(false);//sysj\controller.sysj line: 214, column: 5
                            S22609=1;
                            active[12]=1;
                            ends[12]=1;
                            break RUN;
                          }
                          else {
                            switch(S22604){
                              case 0 : 
                                if(capperStatus_o.isACK()){//sysj\controller.sysj line: 214, column: 5
                                  capperStatus_o.setVal("done");//sysj\controller.sysj line: 214, column: 5
                                  S22604=1;
                                  if(!capperStatus_o.isACK()){//sysj\controller.sysj line: 214, column: 5
                                    capperStatus_o.setREQ(false);//sysj\controller.sysj line: 214, column: 5
                                    ends[12]=2;
                                    ;//sysj\controller.sysj line: 214, column: 5
                                    S22414=2;
                                    active[12]=1;
                                    ends[12]=1;
                                    break RUN;
                                  }
                                  else {
                                    active[12]=1;
                                    ends[12]=1;
                                    break RUN;
                                  }
                                }
                                else {
                                  active[12]=1;
                                  ends[12]=1;
                                  break RUN;
                                }
                              
                              case 1 : 
                                if(!capperStatus_o.isACK()){//sysj\controller.sysj line: 214, column: 5
                                  capperStatus_o.setREQ(false);//sysj\controller.sysj line: 214, column: 5
                                  ends[12]=2;
                                  ;//sysj\controller.sysj line: 214, column: 5
                                  S22414=2;
                                  active[12]=1;
                                  ends[12]=1;
                                  break RUN;
                                }
                                else {
                                  active[12]=1;
                                  ends[12]=1;
                                  break RUN;
                                }
                              
                            }
                          }
                          break;
                        
                        case 1 : 
                          S22609=1;
                          S22609=0;
                          if(!capperStatus_o.isPartnerPresent() || capperStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 214, column: 5
                            capperStatus_o.setREQ(false);//sysj\controller.sysj line: 214, column: 5
                            S22609=1;
                            active[12]=1;
                            ends[12]=1;
                            break RUN;
                          }
                          else {
                            S22604=0;
                            if(capperStatus_o.isACK()){//sysj\controller.sysj line: 214, column: 5
                              capperStatus_o.setVal("done");//sysj\controller.sysj line: 214, column: 5
                              S22604=1;
                              if(!capperStatus_o.isACK()){//sysj\controller.sysj line: 214, column: 5
                                capperStatus_o.setREQ(false);//sysj\controller.sysj line: 214, column: 5
                                ends[12]=2;
                                ;//sysj\controller.sysj line: 214, column: 5
                                S22414=2;
                                active[12]=1;
                                ends[12]=1;
                                break RUN;
                              }
                              else {
                                active[12]=1;
                                ends[12]=1;
                                break RUN;
                              }
                            }
                            else {
                              active[12]=1;
                              ends[12]=1;
                              break RUN;
                            }
                          }
                        
                      }
                      break;
                    
                  }
                  break;
                
              }
              break;
            
            case 2 : 
              S22414=2;
              S22414=0;
              S22398=0;
              if(!capperReq_in.isPartnerPresent() || capperReq_in.isPartnerPreempted()){//sysj\controller.sysj line: 163, column: 3
                capperReq_in.setACK(false);//sysj\controller.sysj line: 163, column: 3
                S22398=1;
                active[12]=1;
                ends[12]=1;
                break RUN;
              }
              else {
                S22393=0;
                if(!capperReq_in.isREQ()){//sysj\controller.sysj line: 163, column: 3
                  capperReq_in.setACK(true);//sysj\controller.sysj line: 163, column: 3
                  S22393=1;
                  if(capperReq_in.isREQ()){//sysj\controller.sysj line: 163, column: 3
                    capperReq_in.setACK(false);//sysj\controller.sysj line: 163, column: 3
                    ends[12]=2;
                    ;//sysj\controller.sysj line: 163, column: 3
                    request_thread_12 = (boolean)(capperReq_in.getVal() == null ? false : ((Boolean)capperReq_in.getVal()).booleanValue());//sysj\controller.sysj line: 164, column: 3
                    S22414=1;
                    if(request_thread_12){//sysj\controller.sysj line: 166, column: 3
                      System.out.println("CapperController: Received request");//sysj\controller.sysj line: 167, column: 4
                      S22507=0;
                      if(!bottleAtPos4.getprestatus()){//sysj\controller.sysj line: 169, column: 12
                        System.out.println("capperidle");//sysj\controller.sysj line: 170, column: 5
                        S22421=0;
                        if(!capperStatus_o.isPartnerPresent() || capperStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 171, column: 5
                          capperStatus_o.setREQ(false);//sysj\controller.sysj line: 171, column: 5
                          S22421=1;
                          active[12]=1;
                          ends[12]=1;
                          break RUN;
                        }
                        else {
                          S22416=0;
                          if(capperStatus_o.isACK()){//sysj\controller.sysj line: 171, column: 5
                            capperStatus_o.setVal("idle");//sysj\controller.sysj line: 171, column: 5
                            S22416=1;
                            if(!capperStatus_o.isACK()){//sysj\controller.sysj line: 171, column: 5
                              capperStatus_o.setREQ(false);//sysj\controller.sysj line: 171, column: 5
                              ends[12]=2;
                              ;//sysj\controller.sysj line: 171, column: 5
                              S22507=1;
                              if(bottleAtPos4.getprestatus()){//sysj\controller.sysj line: 174, column: 12
                                System.out.println("CapperController: Capper doing work...");//sysj\controller.sysj line: 175, column: 5
                                S22602=0;
                                thread39657(tdone,ends);
                                thread39658(tdone,ends);
                                thread39659(tdone,ends);
                                thread39663(tdone,ends);
                                int biggest39664 = 0;
                                if(ends[13]>=biggest39664){
                                  biggest39664=ends[13];
                                }
                                if(ends[14]>=biggest39664){
                                  biggest39664=ends[14];
                                }
                                if(ends[15]>=biggest39664){
                                  biggest39664=ends[15];
                                }
                                if(ends[18]>=biggest39664){
                                  biggest39664=ends[18];
                                }
                                if(biggest39664 == 1){
                                  active[12]=1;
                                  ends[12]=1;
                                  break RUN;
                                }
                              }
                              else {
                                S22414=2;
                                active[12]=1;
                                ends[12]=1;
                                break RUN;
                              }
                            }
                            else {
                              active[12]=1;
                              ends[12]=1;
                              break RUN;
                            }
                          }
                          else {
                            active[12]=1;
                            ends[12]=1;
                            break RUN;
                          }
                        }
                      }
                      else {
                        S22507=1;
                        if(bottleAtPos4.getprestatus()){//sysj\controller.sysj line: 174, column: 12
                          System.out.println("CapperController: Capper doing work...");//sysj\controller.sysj line: 175, column: 5
                          S22602=0;
                          thread39665(tdone,ends);
                          thread39666(tdone,ends);
                          thread39667(tdone,ends);
                          thread39671(tdone,ends);
                          int biggest39672 = 0;
                          if(ends[13]>=biggest39672){
                            biggest39672=ends[13];
                          }
                          if(ends[14]>=biggest39672){
                            biggest39672=ends[14];
                          }
                          if(ends[15]>=biggest39672){
                            biggest39672=ends[15];
                          }
                          if(ends[18]>=biggest39672){
                            biggest39672=ends[18];
                          }
                          if(biggest39672 == 1){
                            active[12]=1;
                            ends[12]=1;
                            break RUN;
                          }
                        }
                        else {
                          S22414=2;
                          active[12]=1;
                          ends[12]=1;
                          break RUN;
                        }
                      }
                    }
                    else {
                      S22414=2;
                      active[12]=1;
                      ends[12]=1;
                      break RUN;
                    }
                  }
                  else {
                    active[12]=1;
                    ends[12]=1;
                    break RUN;
                  }
                }
                else {
                  active[12]=1;
                  ends[12]=1;
                  break RUN;
                }
              }
            
          }
        
      }
    }
  }

  public void init(){
    char [] active1 = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
    char [] paused1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    char [] suspended1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    paused = paused1;
    active = active1;
    suspended = suspended1;
    // Now instantiate all the local signals ONLY
    releaseCap_12 = new Signal();
    raiseGripper_12 = new Signal();
    unclampBottle_12 = new Signal();
    // --------------------------------------------------
  }
  
  public void run(){
    while(active[12] != 0){
      int index = 12;
      if(paused[index]==1 || suspended[index]==1 || active[index] == 0){
        for(int h=1;h<paused.length;++h){
          paused[h]=0;
        }
      }
      if(paused[12]!=0 || suspended[12]!=0 || active[12]!=1);
      else{
        if(!df){
          capperReq_in.gethook();
          capperStatus_o.gethook();
          bottleAtPos4.gethook();
          gripperZAxisLowered.gethook();
          gripperZAxisLifted.gethook();
          gripperTurnHomePos.gethook();
          gripperTurnFinalPos.gethook();
          cylClampedBottle.gethook();
          gripperGrippedCap.gethook();
          df = true;
        }
        runClockDomain();
      }
      bottleAtPos4.setpreclear();
      gripperZAxisLowered.setpreclear();
      gripperZAxisLifted.setpreclear();
      gripperTurnHomePos.setpreclear();
      gripperTurnFinalPos.setpreclear();
      cylClampedBottle.setpreclear();
      gripperGrippedCap.setpreclear();
      cylPos5ZAxisExtend.setpreclear();
      gripperTurnRetract.setpreclear();
      gripperTurnExtend.setpreclear();
      capGripperPos5Extend.setpreclear();
      cylClampBottleExtend.setpreclear();
      releaseCap_12.setpreclear();
      raiseGripper_12.setpreclear();
      unclampBottle_12.setpreclear();
      int dummyint = 0;
      for(int qw=0;qw<currsigs.size();++qw){
        dummyint = ((Signal)currsigs.elementAt(qw)).getStatus() ? ((Signal)currsigs.elementAt(qw)).setprepresent() : ((Signal)currsigs.elementAt(qw)).setpreclear();
        ((Signal)currsigs.elementAt(qw)).setpreval(((Signal)currsigs.elementAt(qw)).getValue());
      }
      currsigs.removeAllElements();
      dummyint = bottleAtPos4.getStatus() ? bottleAtPos4.setprepresent() : bottleAtPos4.setpreclear();
      bottleAtPos4.setpreval(bottleAtPos4.getValue());
      bottleAtPos4.setClear();
      dummyint = gripperZAxisLowered.getStatus() ? gripperZAxisLowered.setprepresent() : gripperZAxisLowered.setpreclear();
      gripperZAxisLowered.setpreval(gripperZAxisLowered.getValue());
      gripperZAxisLowered.setClear();
      dummyint = gripperZAxisLifted.getStatus() ? gripperZAxisLifted.setprepresent() : gripperZAxisLifted.setpreclear();
      gripperZAxisLifted.setpreval(gripperZAxisLifted.getValue());
      gripperZAxisLifted.setClear();
      dummyint = gripperTurnHomePos.getStatus() ? gripperTurnHomePos.setprepresent() : gripperTurnHomePos.setpreclear();
      gripperTurnHomePos.setpreval(gripperTurnHomePos.getValue());
      gripperTurnHomePos.setClear();
      dummyint = gripperTurnFinalPos.getStatus() ? gripperTurnFinalPos.setprepresent() : gripperTurnFinalPos.setpreclear();
      gripperTurnFinalPos.setpreval(gripperTurnFinalPos.getValue());
      gripperTurnFinalPos.setClear();
      dummyint = cylClampedBottle.getStatus() ? cylClampedBottle.setprepresent() : cylClampedBottle.setpreclear();
      cylClampedBottle.setpreval(cylClampedBottle.getValue());
      cylClampedBottle.setClear();
      dummyint = gripperGrippedCap.getStatus() ? gripperGrippedCap.setprepresent() : gripperGrippedCap.setpreclear();
      gripperGrippedCap.setpreval(gripperGrippedCap.getValue());
      gripperGrippedCap.setClear();
      cylPos5ZAxisExtend.sethook();
      cylPos5ZAxisExtend.setClear();
      gripperTurnRetract.sethook();
      gripperTurnRetract.setClear();
      gripperTurnExtend.sethook();
      gripperTurnExtend.setClear();
      capGripperPos5Extend.sethook();
      capGripperPos5Extend.setClear();
      cylClampBottleExtend.sethook();
      cylClampBottleExtend.setClear();
      releaseCap_12.setClear();
      raiseGripper_12.setClear();
      unclampBottle_12.setClear();
      capperReq_in.sethook();
      capperStatus_o.sethook();
      if(paused[12]!=0 || suspended[12]!=0 || active[12]!=1);
      else{
        capperReq_in.gethook();
        capperStatus_o.gethook();
        bottleAtPos4.gethook();
        gripperZAxisLowered.gethook();
        gripperZAxisLifted.gethook();
        gripperTurnHomePos.gethook();
        gripperTurnFinalPos.gethook();
        cylClampedBottle.gethook();
        gripperGrippedCap.gethook();
      }
      runFinisher();
      if(active[12] == 0){
      	this.terminated = true;
      }
      if(!threaded) break;
    }
  }
}
