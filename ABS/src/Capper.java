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
  private Signal releaseCap_13;
  private Signal untwistGripper_13;
  private Signal raiseGripper_13;
  private Signal unclampBottle_13;
  private boolean request_thread_13;//sysj\controller.sysj line: 194, column: 3
  private int S111095 = 1;
  private int S99461 = 1;
  private int S99445 = 1;
  private int S99440 = 1;
  private int S99576 = 1;
  private int S99468 = 1;
  private int S99463 = 1;
  private int S99490 = 1;
  private int S99485 = 1;
  private int S99582 = 1;
  private int S99588 = 1;
  private int S99604 = 1;
  private int S99603 = 1;
  private int S99591 = 1;
  private int S99594 = 1;
  private int S99617 = 1;
  private int S99614 = 1;
  private int S102956 = 1;
  private int S102951 = 1;
  
  private int[] ends = new int[23];
  private int[] tdone = new int[23];
  
  public void thread115685(int [] tdone, int [] ends){
        S99617=1;
    S99614=0;
    active[19]=1;
    ends[19]=1;
    tdone[19]=1;
  }

  public void thread115683(int [] tdone, int [] ends){
        S99594=1;
    active[18]=1;
    ends[18]=1;
    tdone[18]=1;
  }

  public void thread115682(int [] tdone, int [] ends){
        S99591=1;
    active[17]=1;
    ends[17]=1;
    tdone[17]=1;
  }

  public void thread115681(int [] tdone, int [] ends){
        S99604=1;
    S99603=0;
    thread115682(tdone,ends);
    thread115683(tdone,ends);
    int biggest115684 = 0;
    if(ends[17]>=biggest115684){
      biggest115684=ends[17];
    }
    if(ends[18]>=biggest115684){
      biggest115684=ends[18];
    }
    if(biggest115684 == 1){
      active[16]=1;
      ends[16]=1;
      tdone[16]=1;
    }
  }

  public void thread115680(int [] tdone, int [] ends){
        S99588=1;
    cylPos5ZAxisExtend.setPresent();//sysj\controller.sysj line: 213, column: 7
    currsigs.addElement(cylPos5ZAxisExtend);
    active[15]=1;
    ends[15]=1;
    tdone[15]=1;
  }

  public void thread115679(int [] tdone, int [] ends){
        S99582=1;
    cylClampBottleExtend.setPresent();//sysj\controller.sysj line: 207, column: 7
    currsigs.addElement(cylClampBottleExtend);
    active[14]=1;
    ends[14]=1;
    tdone[14]=1;
  }

  public void thread115677(int [] tdone, int [] ends){
        S99617=1;
    S99614=0;
    active[19]=1;
    ends[19]=1;
    tdone[19]=1;
  }

  public void thread115675(int [] tdone, int [] ends){
        S99594=1;
    active[18]=1;
    ends[18]=1;
    tdone[18]=1;
  }

  public void thread115674(int [] tdone, int [] ends){
        S99591=1;
    active[17]=1;
    ends[17]=1;
    tdone[17]=1;
  }

  public void thread115673(int [] tdone, int [] ends){
        S99604=1;
    S99603=0;
    thread115674(tdone,ends);
    thread115675(tdone,ends);
    int biggest115676 = 0;
    if(ends[17]>=biggest115676){
      biggest115676=ends[17];
    }
    if(ends[18]>=biggest115676){
      biggest115676=ends[18];
    }
    if(biggest115676 == 1){
      active[16]=1;
      ends[16]=1;
      tdone[16]=1;
    }
  }

  public void thread115672(int [] tdone, int [] ends){
        S99588=1;
    cylPos5ZAxisExtend.setPresent();//sysj\controller.sysj line: 213, column: 7
    currsigs.addElement(cylPos5ZAxisExtend);
    active[15]=1;
    ends[15]=1;
    tdone[15]=1;
  }

  public void thread115671(int [] tdone, int [] ends){
        S99582=1;
    cylClampBottleExtend.setPresent();//sysj\controller.sysj line: 207, column: 7
    currsigs.addElement(cylClampBottleExtend);
    active[14]=1;
    ends[14]=1;
    tdone[14]=1;
  }

  public void thread115669(int [] tdone, int [] ends){
        switch(S99617){
      case 0 : 
        active[19]=0;
        ends[19]=0;
        tdone[19]=1;
        break;
      
      case 1 : 
        switch(S99614){
          case 0 : 
            if(gripperGrippedCap.getprestatus()){//sysj\controller.sysj line: 226, column: 12
              S99614=1;
              gripperTurnExtend.setPresent();//sysj\controller.sysj line: 229, column: 7
              currsigs.addElement(gripperTurnExtend);
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
          
          case 1 : 
            if(gripperTurnFinalPos.getprestatus()){//sysj\controller.sysj line: 228, column: 13
              releaseCap_13.setPresent();//sysj\controller.sysj line: 231, column: 6
              currsigs.addElement(releaseCap_13);
              untwistGripper_13.setPresent();//sysj\controller.sysj line: 234, column: 7
              currsigs.addElement(untwistGripper_13);
              raiseGripper_13.setPresent();//sysj\controller.sysj line: 237, column: 6
              currsigs.addElement(raiseGripper_13);
              unclampBottle_13.setPresent();//sysj\controller.sysj line: 238, column: 6
              currsigs.addElement(unclampBottle_13);
              S99617=0;
              active[19]=0;
              ends[19]=0;
              tdone[19]=1;
            }
            else {
              gripperTurnExtend.setPresent();//sysj\controller.sysj line: 229, column: 7
              currsigs.addElement(gripperTurnExtend);
              active[19]=1;
              ends[19]=1;
              tdone[19]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread115667(int [] tdone, int [] ends){
        switch(S99594){
      case 0 : 
        active[18]=0;
        ends[18]=0;
        tdone[18]=1;
        break;
      
      case 1 : 
        if(cylClampedBottle.getprestatus()){//sysj\controller.sysj line: 219, column: 46
          S99594=0;
          active[18]=0;
          ends[18]=0;
          tdone[18]=1;
        }
        else {
          active[18]=1;
          ends[18]=1;
          tdone[18]=1;
        }
        break;
      
    }
  }

  public void thread115666(int [] tdone, int [] ends){
        switch(S99591){
      case 0 : 
        active[17]=0;
        ends[17]=0;
        tdone[17]=1;
        break;
      
      case 1 : 
        if(gripperZAxisLowered.getprestatus()){//sysj\controller.sysj line: 219, column: 13
          S99591=0;
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

  public void thread115665(int [] tdone, int [] ends){
        switch(S99604){
      case 0 : 
        active[16]=0;
        ends[16]=0;
        tdone[16]=1;
        break;
      
      case 1 : 
        switch(S99603){
          case 0 : 
            thread115666(tdone,ends);
            thread115667(tdone,ends);
            int biggest115668 = 0;
            if(ends[17]>=biggest115668){
              biggest115668=ends[17];
            }
            if(ends[18]>=biggest115668){
              biggest115668=ends[18];
            }
            if(biggest115668 == 1){
              active[16]=1;
              ends[16]=1;
              tdone[16]=1;
            }
            //FINXME code
            if(biggest115668 == 0){
              S99603=1;
              capGripperPos5Extend.setPresent();//sysj\controller.sysj line: 221, column: 7
              currsigs.addElement(capGripperPos5Extend);
              active[16]=1;
              ends[16]=1;
              tdone[16]=1;
            }
            break;
          
          case 1 : 
            if(releaseCap_13.getprestatus()){//sysj\controller.sysj line: 220, column: 12
              S99604=0;
              active[16]=0;
              ends[16]=0;
              tdone[16]=1;
            }
            else {
              capGripperPos5Extend.setPresent();//sysj\controller.sysj line: 221, column: 7
              currsigs.addElement(capGripperPos5Extend);
              active[16]=1;
              ends[16]=1;
              tdone[16]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread115664(int [] tdone, int [] ends){
        switch(S99588){
      case 0 : 
        active[15]=0;
        ends[15]=0;
        tdone[15]=1;
        break;
      
      case 1 : 
        if(raiseGripper_13.getprestatus()){//sysj\controller.sysj line: 212, column: 12
          S99588=0;
          active[15]=0;
          ends[15]=0;
          tdone[15]=1;
        }
        else {
          cylPos5ZAxisExtend.setPresent();//sysj\controller.sysj line: 213, column: 7
          currsigs.addElement(cylPos5ZAxisExtend);
          active[15]=1;
          ends[15]=1;
          tdone[15]=1;
        }
        break;
      
    }
  }

  public void thread115663(int [] tdone, int [] ends){
        switch(S99582){
      case 0 : 
        active[14]=0;
        ends[14]=0;
        tdone[14]=1;
        break;
      
      case 1 : 
        if(unclampBottle_13.getprestatus()){//sysj\controller.sysj line: 206, column: 13
          S99582=0;
          active[14]=0;
          ends[14]=0;
          tdone[14]=1;
        }
        else {
          cylClampBottleExtend.setPresent();//sysj\controller.sysj line: 207, column: 7
          currsigs.addElement(cylClampBottleExtend);
          active[14]=1;
          ends[14]=1;
          tdone[14]=1;
        }
        break;
      
    }
  }

  public void thread115661(int [] tdone, int [] ends){
        S99617=1;
    S99614=0;
    active[19]=1;
    ends[19]=1;
    tdone[19]=1;
  }

  public void thread115659(int [] tdone, int [] ends){
        S99594=1;
    active[18]=1;
    ends[18]=1;
    tdone[18]=1;
  }

  public void thread115658(int [] tdone, int [] ends){
        S99591=1;
    active[17]=1;
    ends[17]=1;
    tdone[17]=1;
  }

  public void thread115657(int [] tdone, int [] ends){
        S99604=1;
    S99603=0;
    thread115658(tdone,ends);
    thread115659(tdone,ends);
    int biggest115660 = 0;
    if(ends[17]>=biggest115660){
      biggest115660=ends[17];
    }
    if(ends[18]>=biggest115660){
      biggest115660=ends[18];
    }
    if(biggest115660 == 1){
      active[16]=1;
      ends[16]=1;
      tdone[16]=1;
    }
  }

  public void thread115656(int [] tdone, int [] ends){
        S99588=1;
    cylPos5ZAxisExtend.setPresent();//sysj\controller.sysj line: 213, column: 7
    currsigs.addElement(cylPos5ZAxisExtend);
    active[15]=1;
    ends[15]=1;
    tdone[15]=1;
  }

  public void thread115655(int [] tdone, int [] ends){
        S99582=1;
    cylClampBottleExtend.setPresent();//sysj\controller.sysj line: 207, column: 7
    currsigs.addElement(cylClampBottleExtend);
    active[14]=1;
    ends[14]=1;
    tdone[14]=1;
  }

  public void thread115653(int [] tdone, int [] ends){
        S99617=1;
    S99614=0;
    active[19]=1;
    ends[19]=1;
    tdone[19]=1;
  }

  public void thread115651(int [] tdone, int [] ends){
        S99594=1;
    active[18]=1;
    ends[18]=1;
    tdone[18]=1;
  }

  public void thread115650(int [] tdone, int [] ends){
        S99591=1;
    active[17]=1;
    ends[17]=1;
    tdone[17]=1;
  }

  public void thread115649(int [] tdone, int [] ends){
        S99604=1;
    S99603=0;
    thread115650(tdone,ends);
    thread115651(tdone,ends);
    int biggest115652 = 0;
    if(ends[17]>=biggest115652){
      biggest115652=ends[17];
    }
    if(ends[18]>=biggest115652){
      biggest115652=ends[18];
    }
    if(biggest115652 == 1){
      active[16]=1;
      ends[16]=1;
      tdone[16]=1;
    }
  }

  public void thread115648(int [] tdone, int [] ends){
        S99588=1;
    cylPos5ZAxisExtend.setPresent();//sysj\controller.sysj line: 213, column: 7
    currsigs.addElement(cylPos5ZAxisExtend);
    active[15]=1;
    ends[15]=1;
    tdone[15]=1;
  }

  public void thread115647(int [] tdone, int [] ends){
        S99582=1;
    cylClampBottleExtend.setPresent();//sysj\controller.sysj line: 207, column: 7
    currsigs.addElement(cylClampBottleExtend);
    active[14]=1;
    ends[14]=1;
    tdone[14]=1;
  }

  public void thread115645(int [] tdone, int [] ends){
        S99617=1;
    S99614=0;
    active[19]=1;
    ends[19]=1;
    tdone[19]=1;
  }

  public void thread115643(int [] tdone, int [] ends){
        S99594=1;
    active[18]=1;
    ends[18]=1;
    tdone[18]=1;
  }

  public void thread115642(int [] tdone, int [] ends){
        S99591=1;
    active[17]=1;
    ends[17]=1;
    tdone[17]=1;
  }

  public void thread115641(int [] tdone, int [] ends){
        S99604=1;
    S99603=0;
    thread115642(tdone,ends);
    thread115643(tdone,ends);
    int biggest115644 = 0;
    if(ends[17]>=biggest115644){
      biggest115644=ends[17];
    }
    if(ends[18]>=biggest115644){
      biggest115644=ends[18];
    }
    if(biggest115644 == 1){
      active[16]=1;
      ends[16]=1;
      tdone[16]=1;
    }
  }

  public void thread115640(int [] tdone, int [] ends){
        S99588=1;
    cylPos5ZAxisExtend.setPresent();//sysj\controller.sysj line: 213, column: 7
    currsigs.addElement(cylPos5ZAxisExtend);
    active[15]=1;
    ends[15]=1;
    tdone[15]=1;
  }

  public void thread115639(int [] tdone, int [] ends){
        S99582=1;
    cylClampBottleExtend.setPresent();//sysj\controller.sysj line: 207, column: 7
    currsigs.addElement(cylClampBottleExtend);
    active[14]=1;
    ends[14]=1;
    tdone[14]=1;
  }

  public void thread115637(int [] tdone, int [] ends){
        S99617=1;
    S99614=0;
    active[19]=1;
    ends[19]=1;
    tdone[19]=1;
  }

  public void thread115635(int [] tdone, int [] ends){
        S99594=1;
    active[18]=1;
    ends[18]=1;
    tdone[18]=1;
  }

  public void thread115634(int [] tdone, int [] ends){
        S99591=1;
    active[17]=1;
    ends[17]=1;
    tdone[17]=1;
  }

  public void thread115633(int [] tdone, int [] ends){
        S99604=1;
    S99603=0;
    thread115634(tdone,ends);
    thread115635(tdone,ends);
    int biggest115636 = 0;
    if(ends[17]>=biggest115636){
      biggest115636=ends[17];
    }
    if(ends[18]>=biggest115636){
      biggest115636=ends[18];
    }
    if(biggest115636 == 1){
      active[16]=1;
      ends[16]=1;
      tdone[16]=1;
    }
  }

  public void thread115632(int [] tdone, int [] ends){
        S99588=1;
    cylPos5ZAxisExtend.setPresent();//sysj\controller.sysj line: 213, column: 7
    currsigs.addElement(cylPos5ZAxisExtend);
    active[15]=1;
    ends[15]=1;
    tdone[15]=1;
  }

  public void thread115631(int [] tdone, int [] ends){
        S99582=1;
    cylClampBottleExtend.setPresent();//sysj\controller.sysj line: 207, column: 7
    currsigs.addElement(cylClampBottleExtend);
    active[14]=1;
    ends[14]=1;
    tdone[14]=1;
  }

  public void thread115629(int [] tdone, int [] ends){
        S99617=1;
    S99614=0;
    active[19]=1;
    ends[19]=1;
    tdone[19]=1;
  }

  public void thread115627(int [] tdone, int [] ends){
        S99594=1;
    active[18]=1;
    ends[18]=1;
    tdone[18]=1;
  }

  public void thread115626(int [] tdone, int [] ends){
        S99591=1;
    active[17]=1;
    ends[17]=1;
    tdone[17]=1;
  }

  public void thread115625(int [] tdone, int [] ends){
        S99604=1;
    S99603=0;
    thread115626(tdone,ends);
    thread115627(tdone,ends);
    int biggest115628 = 0;
    if(ends[17]>=biggest115628){
      biggest115628=ends[17];
    }
    if(ends[18]>=biggest115628){
      biggest115628=ends[18];
    }
    if(biggest115628 == 1){
      active[16]=1;
      ends[16]=1;
      tdone[16]=1;
    }
  }

  public void thread115624(int [] tdone, int [] ends){
        S99588=1;
    cylPos5ZAxisExtend.setPresent();//sysj\controller.sysj line: 213, column: 7
    currsigs.addElement(cylPos5ZAxisExtend);
    active[15]=1;
    ends[15]=1;
    tdone[15]=1;
  }

  public void thread115623(int [] tdone, int [] ends){
        S99582=1;
    cylClampBottleExtend.setPresent();//sysj\controller.sysj line: 207, column: 7
    currsigs.addElement(cylClampBottleExtend);
    active[14]=1;
    ends[14]=1;
    tdone[14]=1;
  }

  public void thread115621(int [] tdone, int [] ends){
        S99617=1;
    S99614=0;
    active[19]=1;
    ends[19]=1;
    tdone[19]=1;
  }

  public void thread115619(int [] tdone, int [] ends){
        S99594=1;
    active[18]=1;
    ends[18]=1;
    tdone[18]=1;
  }

  public void thread115618(int [] tdone, int [] ends){
        S99591=1;
    active[17]=1;
    ends[17]=1;
    tdone[17]=1;
  }

  public void thread115617(int [] tdone, int [] ends){
        S99604=1;
    S99603=0;
    thread115618(tdone,ends);
    thread115619(tdone,ends);
    int biggest115620 = 0;
    if(ends[17]>=biggest115620){
      biggest115620=ends[17];
    }
    if(ends[18]>=biggest115620){
      biggest115620=ends[18];
    }
    if(biggest115620 == 1){
      active[16]=1;
      ends[16]=1;
      tdone[16]=1;
    }
  }

  public void thread115616(int [] tdone, int [] ends){
        S99588=1;
    cylPos5ZAxisExtend.setPresent();//sysj\controller.sysj line: 213, column: 7
    currsigs.addElement(cylPos5ZAxisExtend);
    active[15]=1;
    ends[15]=1;
    tdone[15]=1;
  }

  public void thread115615(int [] tdone, int [] ends){
        S99582=1;
    cylClampBottleExtend.setPresent();//sysj\controller.sysj line: 207, column: 7
    currsigs.addElement(cylClampBottleExtend);
    active[14]=1;
    ends[14]=1;
    tdone[14]=1;
  }

  public void thread115613(int [] tdone, int [] ends){
        S99617=1;
    S99614=0;
    active[19]=1;
    ends[19]=1;
    tdone[19]=1;
  }

  public void thread115611(int [] tdone, int [] ends){
        S99594=1;
    active[18]=1;
    ends[18]=1;
    tdone[18]=1;
  }

  public void thread115610(int [] tdone, int [] ends){
        S99591=1;
    active[17]=1;
    ends[17]=1;
    tdone[17]=1;
  }

  public void thread115609(int [] tdone, int [] ends){
        S99604=1;
    S99603=0;
    thread115610(tdone,ends);
    thread115611(tdone,ends);
    int biggest115612 = 0;
    if(ends[17]>=biggest115612){
      biggest115612=ends[17];
    }
    if(ends[18]>=biggest115612){
      biggest115612=ends[18];
    }
    if(biggest115612 == 1){
      active[16]=1;
      ends[16]=1;
      tdone[16]=1;
    }
  }

  public void thread115608(int [] tdone, int [] ends){
        S99588=1;
    cylPos5ZAxisExtend.setPresent();//sysj\controller.sysj line: 213, column: 7
    currsigs.addElement(cylPos5ZAxisExtend);
    active[15]=1;
    ends[15]=1;
    tdone[15]=1;
  }

  public void thread115607(int [] tdone, int [] ends){
        S99582=1;
    cylClampBottleExtend.setPresent();//sysj\controller.sysj line: 207, column: 7
    currsigs.addElement(cylClampBottleExtend);
    active[14]=1;
    ends[14]=1;
    tdone[14]=1;
  }

  public void thread115605(int [] tdone, int [] ends){
        S99617=1;
    S99614=0;
    active[19]=1;
    ends[19]=1;
    tdone[19]=1;
  }

  public void thread115603(int [] tdone, int [] ends){
        S99594=1;
    active[18]=1;
    ends[18]=1;
    tdone[18]=1;
  }

  public void thread115602(int [] tdone, int [] ends){
        S99591=1;
    active[17]=1;
    ends[17]=1;
    tdone[17]=1;
  }

  public void thread115601(int [] tdone, int [] ends){
        S99604=1;
    S99603=0;
    thread115602(tdone,ends);
    thread115603(tdone,ends);
    int biggest115604 = 0;
    if(ends[17]>=biggest115604){
      biggest115604=ends[17];
    }
    if(ends[18]>=biggest115604){
      biggest115604=ends[18];
    }
    if(biggest115604 == 1){
      active[16]=1;
      ends[16]=1;
      tdone[16]=1;
    }
  }

  public void thread115600(int [] tdone, int [] ends){
        S99588=1;
    cylPos5ZAxisExtend.setPresent();//sysj\controller.sysj line: 213, column: 7
    currsigs.addElement(cylPos5ZAxisExtend);
    active[15]=1;
    ends[15]=1;
    tdone[15]=1;
  }

  public void thread115599(int [] tdone, int [] ends){
        S99582=1;
    cylClampBottleExtend.setPresent();//sysj\controller.sysj line: 207, column: 7
    currsigs.addElement(cylClampBottleExtend);
    active[14]=1;
    ends[14]=1;
    tdone[14]=1;
  }

  public void thread115597(int [] tdone, int [] ends){
        S99617=1;
    S99614=0;
    active[19]=1;
    ends[19]=1;
    tdone[19]=1;
  }

  public void thread115595(int [] tdone, int [] ends){
        S99594=1;
    active[18]=1;
    ends[18]=1;
    tdone[18]=1;
  }

  public void thread115594(int [] tdone, int [] ends){
        S99591=1;
    active[17]=1;
    ends[17]=1;
    tdone[17]=1;
  }

  public void thread115593(int [] tdone, int [] ends){
        S99604=1;
    S99603=0;
    thread115594(tdone,ends);
    thread115595(tdone,ends);
    int biggest115596 = 0;
    if(ends[17]>=biggest115596){
      biggest115596=ends[17];
    }
    if(ends[18]>=biggest115596){
      biggest115596=ends[18];
    }
    if(biggest115596 == 1){
      active[16]=1;
      ends[16]=1;
      tdone[16]=1;
    }
  }

  public void thread115592(int [] tdone, int [] ends){
        S99588=1;
    cylPos5ZAxisExtend.setPresent();//sysj\controller.sysj line: 213, column: 7
    currsigs.addElement(cylPos5ZAxisExtend);
    active[15]=1;
    ends[15]=1;
    tdone[15]=1;
  }

  public void thread115591(int [] tdone, int [] ends){
        S99582=1;
    cylClampBottleExtend.setPresent();//sysj\controller.sysj line: 207, column: 7
    currsigs.addElement(cylClampBottleExtend);
    active[14]=1;
    ends[14]=1;
    tdone[14]=1;
  }

  public void thread115589(int [] tdone, int [] ends){
        S99617=1;
    S99614=0;
    active[19]=1;
    ends[19]=1;
    tdone[19]=1;
  }

  public void thread115587(int [] tdone, int [] ends){
        S99594=1;
    active[18]=1;
    ends[18]=1;
    tdone[18]=1;
  }

  public void thread115586(int [] tdone, int [] ends){
        S99591=1;
    active[17]=1;
    ends[17]=1;
    tdone[17]=1;
  }

  public void thread115585(int [] tdone, int [] ends){
        S99604=1;
    S99603=0;
    thread115586(tdone,ends);
    thread115587(tdone,ends);
    int biggest115588 = 0;
    if(ends[17]>=biggest115588){
      biggest115588=ends[17];
    }
    if(ends[18]>=biggest115588){
      biggest115588=ends[18];
    }
    if(biggest115588 == 1){
      active[16]=1;
      ends[16]=1;
      tdone[16]=1;
    }
  }

  public void thread115584(int [] tdone, int [] ends){
        S99588=1;
    cylPos5ZAxisExtend.setPresent();//sysj\controller.sysj line: 213, column: 7
    currsigs.addElement(cylPos5ZAxisExtend);
    active[15]=1;
    ends[15]=1;
    tdone[15]=1;
  }

  public void thread115583(int [] tdone, int [] ends){
        S99582=1;
    cylClampBottleExtend.setPresent();//sysj\controller.sysj line: 207, column: 7
    currsigs.addElement(cylClampBottleExtend);
    active[14]=1;
    ends[14]=1;
    tdone[14]=1;
  }

  public void thread115581(int [] tdone, int [] ends){
        S99617=1;
    S99614=0;
    active[19]=1;
    ends[19]=1;
    tdone[19]=1;
  }

  public void thread115579(int [] tdone, int [] ends){
        S99594=1;
    active[18]=1;
    ends[18]=1;
    tdone[18]=1;
  }

  public void thread115578(int [] tdone, int [] ends){
        S99591=1;
    active[17]=1;
    ends[17]=1;
    tdone[17]=1;
  }

  public void thread115577(int [] tdone, int [] ends){
        S99604=1;
    S99603=0;
    thread115578(tdone,ends);
    thread115579(tdone,ends);
    int biggest115580 = 0;
    if(ends[17]>=biggest115580){
      biggest115580=ends[17];
    }
    if(ends[18]>=biggest115580){
      biggest115580=ends[18];
    }
    if(biggest115580 == 1){
      active[16]=1;
      ends[16]=1;
      tdone[16]=1;
    }
  }

  public void thread115576(int [] tdone, int [] ends){
        S99588=1;
    cylPos5ZAxisExtend.setPresent();//sysj\controller.sysj line: 213, column: 7
    currsigs.addElement(cylPos5ZAxisExtend);
    active[15]=1;
    ends[15]=1;
    tdone[15]=1;
  }

  public void thread115575(int [] tdone, int [] ends){
        S99582=1;
    cylClampBottleExtend.setPresent();//sysj\controller.sysj line: 207, column: 7
    currsigs.addElement(cylClampBottleExtend);
    active[14]=1;
    ends[14]=1;
    tdone[14]=1;
  }

  public void thread115573(int [] tdone, int [] ends){
        S99617=1;
    S99614=0;
    active[19]=1;
    ends[19]=1;
    tdone[19]=1;
  }

  public void thread115571(int [] tdone, int [] ends){
        S99594=1;
    active[18]=1;
    ends[18]=1;
    tdone[18]=1;
  }

  public void thread115570(int [] tdone, int [] ends){
        S99591=1;
    active[17]=1;
    ends[17]=1;
    tdone[17]=1;
  }

  public void thread115569(int [] tdone, int [] ends){
        S99604=1;
    S99603=0;
    thread115570(tdone,ends);
    thread115571(tdone,ends);
    int biggest115572 = 0;
    if(ends[17]>=biggest115572){
      biggest115572=ends[17];
    }
    if(ends[18]>=biggest115572){
      biggest115572=ends[18];
    }
    if(biggest115572 == 1){
      active[16]=1;
      ends[16]=1;
      tdone[16]=1;
    }
  }

  public void thread115568(int [] tdone, int [] ends){
        S99588=1;
    cylPos5ZAxisExtend.setPresent();//sysj\controller.sysj line: 213, column: 7
    currsigs.addElement(cylPos5ZAxisExtend);
    active[15]=1;
    ends[15]=1;
    tdone[15]=1;
  }

  public void thread115567(int [] tdone, int [] ends){
        S99582=1;
    cylClampBottleExtend.setPresent();//sysj\controller.sysj line: 207, column: 7
    currsigs.addElement(cylClampBottleExtend);
    active[14]=1;
    ends[14]=1;
    tdone[14]=1;
  }

  public void thread115565(int [] tdone, int [] ends){
        S99617=1;
    S99614=0;
    active[19]=1;
    ends[19]=1;
    tdone[19]=1;
  }

  public void thread115563(int [] tdone, int [] ends){
        S99594=1;
    active[18]=1;
    ends[18]=1;
    tdone[18]=1;
  }

  public void thread115562(int [] tdone, int [] ends){
        S99591=1;
    active[17]=1;
    ends[17]=1;
    tdone[17]=1;
  }

  public void thread115561(int [] tdone, int [] ends){
        S99604=1;
    S99603=0;
    thread115562(tdone,ends);
    thread115563(tdone,ends);
    int biggest115564 = 0;
    if(ends[17]>=biggest115564){
      biggest115564=ends[17];
    }
    if(ends[18]>=biggest115564){
      biggest115564=ends[18];
    }
    if(biggest115564 == 1){
      active[16]=1;
      ends[16]=1;
      tdone[16]=1;
    }
  }

  public void thread115560(int [] tdone, int [] ends){
        S99588=1;
    cylPos5ZAxisExtend.setPresent();//sysj\controller.sysj line: 213, column: 7
    currsigs.addElement(cylPos5ZAxisExtend);
    active[15]=1;
    ends[15]=1;
    tdone[15]=1;
  }

  public void thread115559(int [] tdone, int [] ends){
        S99582=1;
    cylClampBottleExtend.setPresent();//sysj\controller.sysj line: 207, column: 7
    currsigs.addElement(cylClampBottleExtend);
    active[14]=1;
    ends[14]=1;
    tdone[14]=1;
  }

  public void thread115557(int [] tdone, int [] ends){
        S99617=1;
    S99614=0;
    active[19]=1;
    ends[19]=1;
    tdone[19]=1;
  }

  public void thread115555(int [] tdone, int [] ends){
        S99594=1;
    active[18]=1;
    ends[18]=1;
    tdone[18]=1;
  }

  public void thread115554(int [] tdone, int [] ends){
        S99591=1;
    active[17]=1;
    ends[17]=1;
    tdone[17]=1;
  }

  public void thread115553(int [] tdone, int [] ends){
        S99604=1;
    S99603=0;
    thread115554(tdone,ends);
    thread115555(tdone,ends);
    int biggest115556 = 0;
    if(ends[17]>=biggest115556){
      biggest115556=ends[17];
    }
    if(ends[18]>=biggest115556){
      biggest115556=ends[18];
    }
    if(biggest115556 == 1){
      active[16]=1;
      ends[16]=1;
      tdone[16]=1;
    }
  }

  public void thread115552(int [] tdone, int [] ends){
        S99588=1;
    cylPos5ZAxisExtend.setPresent();//sysj\controller.sysj line: 213, column: 7
    currsigs.addElement(cylPos5ZAxisExtend);
    active[15]=1;
    ends[15]=1;
    tdone[15]=1;
  }

  public void thread115551(int [] tdone, int [] ends){
        S99582=1;
    cylClampBottleExtend.setPresent();//sysj\controller.sysj line: 207, column: 7
    currsigs.addElement(cylClampBottleExtend);
    active[14]=1;
    ends[14]=1;
    tdone[14]=1;
  }

  public void thread115549(int [] tdone, int [] ends){
        S99617=1;
    S99614=0;
    active[19]=1;
    ends[19]=1;
    tdone[19]=1;
  }

  public void thread115547(int [] tdone, int [] ends){
        S99594=1;
    active[18]=1;
    ends[18]=1;
    tdone[18]=1;
  }

  public void thread115546(int [] tdone, int [] ends){
        S99591=1;
    active[17]=1;
    ends[17]=1;
    tdone[17]=1;
  }

  public void thread115545(int [] tdone, int [] ends){
        S99604=1;
    S99603=0;
    thread115546(tdone,ends);
    thread115547(tdone,ends);
    int biggest115548 = 0;
    if(ends[17]>=biggest115548){
      biggest115548=ends[17];
    }
    if(ends[18]>=biggest115548){
      biggest115548=ends[18];
    }
    if(biggest115548 == 1){
      active[16]=1;
      ends[16]=1;
      tdone[16]=1;
    }
  }

  public void thread115544(int [] tdone, int [] ends){
        S99588=1;
    cylPos5ZAxisExtend.setPresent();//sysj\controller.sysj line: 213, column: 7
    currsigs.addElement(cylPos5ZAxisExtend);
    active[15]=1;
    ends[15]=1;
    tdone[15]=1;
  }

  public void thread115543(int [] tdone, int [] ends){
        S99582=1;
    cylClampBottleExtend.setPresent();//sysj\controller.sysj line: 207, column: 7
    currsigs.addElement(cylClampBottleExtend);
    active[14]=1;
    ends[14]=1;
    tdone[14]=1;
  }

  public void thread115541(int [] tdone, int [] ends){
        S99617=1;
    S99614=0;
    active[19]=1;
    ends[19]=1;
    tdone[19]=1;
  }

  public void thread115539(int [] tdone, int [] ends){
        S99594=1;
    active[18]=1;
    ends[18]=1;
    tdone[18]=1;
  }

  public void thread115538(int [] tdone, int [] ends){
        S99591=1;
    active[17]=1;
    ends[17]=1;
    tdone[17]=1;
  }

  public void thread115537(int [] tdone, int [] ends){
        S99604=1;
    S99603=0;
    thread115538(tdone,ends);
    thread115539(tdone,ends);
    int biggest115540 = 0;
    if(ends[17]>=biggest115540){
      biggest115540=ends[17];
    }
    if(ends[18]>=biggest115540){
      biggest115540=ends[18];
    }
    if(biggest115540 == 1){
      active[16]=1;
      ends[16]=1;
      tdone[16]=1;
    }
  }

  public void thread115536(int [] tdone, int [] ends){
        S99588=1;
    cylPos5ZAxisExtend.setPresent();//sysj\controller.sysj line: 213, column: 7
    currsigs.addElement(cylPos5ZAxisExtend);
    active[15]=1;
    ends[15]=1;
    tdone[15]=1;
  }

  public void thread115535(int [] tdone, int [] ends){
        S99582=1;
    cylClampBottleExtend.setPresent();//sysj\controller.sysj line: 207, column: 7
    currsigs.addElement(cylClampBottleExtend);
    active[14]=1;
    ends[14]=1;
    tdone[14]=1;
  }

  public void thread115533(int [] tdone, int [] ends){
        S99617=1;
    S99614=0;
    active[19]=1;
    ends[19]=1;
    tdone[19]=1;
  }

  public void thread115531(int [] tdone, int [] ends){
        S99594=1;
    active[18]=1;
    ends[18]=1;
    tdone[18]=1;
  }

  public void thread115530(int [] tdone, int [] ends){
        S99591=1;
    active[17]=1;
    ends[17]=1;
    tdone[17]=1;
  }

  public void thread115529(int [] tdone, int [] ends){
        S99604=1;
    S99603=0;
    thread115530(tdone,ends);
    thread115531(tdone,ends);
    int biggest115532 = 0;
    if(ends[17]>=biggest115532){
      biggest115532=ends[17];
    }
    if(ends[18]>=biggest115532){
      biggest115532=ends[18];
    }
    if(biggest115532 == 1){
      active[16]=1;
      ends[16]=1;
      tdone[16]=1;
    }
  }

  public void thread115528(int [] tdone, int [] ends){
        S99588=1;
    cylPos5ZAxisExtend.setPresent();//sysj\controller.sysj line: 213, column: 7
    currsigs.addElement(cylPos5ZAxisExtend);
    active[15]=1;
    ends[15]=1;
    tdone[15]=1;
  }

  public void thread115527(int [] tdone, int [] ends){
        S99582=1;
    cylClampBottleExtend.setPresent();//sysj\controller.sysj line: 207, column: 7
    currsigs.addElement(cylClampBottleExtend);
    active[14]=1;
    ends[14]=1;
    tdone[14]=1;
  }

  public void runClockDomain(){
    for(int i=0;i<ends.length;i++){
      ends[i] = 0;
      tdone[i] = 0;
    }
    
    RUN: while(true){
      switch(S111095){
        case 0 : 
          S111095=0;
          break RUN;
        
        case 1 : 
          S111095=2;
          S111095=2;
          releaseCap_13.setClear();//sysj\controller.sysj line: 190, column: 2
          untwistGripper_13.setClear();//sysj\controller.sysj line: 190, column: 2
          raiseGripper_13.setClear();//sysj\controller.sysj line: 190, column: 2
          unclampBottle_13.setClear();//sysj\controller.sysj line: 190, column: 2
          S99461=0;
          S99445=0;
          if(!capperReq_in.isPartnerPresent() || capperReq_in.isPartnerPreempted()){//sysj\controller.sysj line: 193, column: 3
            capperReq_in.setACK(false);//sysj\controller.sysj line: 193, column: 3
            S99445=1;
            active[13]=1;
            ends[13]=1;
            break RUN;
          }
          else {
            S99440=0;
            if(!capperReq_in.isREQ()){//sysj\controller.sysj line: 193, column: 3
              capperReq_in.setACK(true);//sysj\controller.sysj line: 193, column: 3
              S99440=1;
              if(capperReq_in.isREQ()){//sysj\controller.sysj line: 193, column: 3
                capperReq_in.setACK(false);//sysj\controller.sysj line: 193, column: 3
                ends[13]=2;
                ;//sysj\controller.sysj line: 193, column: 3
                request_thread_13 = (boolean)(capperReq_in.getVal() == null ? false : ((Boolean)capperReq_in.getVal()).booleanValue());//sysj\controller.sysj line: 194, column: 3
                S99461=1;
                if(request_thread_13){//sysj\controller.sysj line: 196, column: 3
                  S99576=0;
                  S99468=0;
                  if(!capperStatus_o.isPartnerPresent() || capperStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 197, column: 4
                    capperStatus_o.setREQ(false);//sysj\controller.sysj line: 197, column: 4
                    S99468=1;
                    active[13]=1;
                    ends[13]=1;
                    break RUN;
                  }
                  else {
                    S99463=0;
                    if(capperStatus_o.isACK()){//sysj\controller.sysj line: 197, column: 4
                      capperStatus_o.setVal("busy");//sysj\controller.sysj line: 197, column: 4
                      S99463=1;
                      if(!capperStatus_o.isACK()){//sysj\controller.sysj line: 197, column: 4
                        capperStatus_o.setREQ(false);//sysj\controller.sysj line: 197, column: 4
                        ends[13]=2;
                        ;//sysj\controller.sysj line: 197, column: 4
                        S99576=1;
                        if(!bottleAtPos4.getprestatus()){//sysj\controller.sysj line: 199, column: 13
                          S99490=0;
                          if(!capperStatus_o.isPartnerPresent() || capperStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 200, column: 5
                            capperStatus_o.setREQ(false);//sysj\controller.sysj line: 200, column: 5
                            S99490=1;
                            active[13]=1;
                            ends[13]=1;
                            break RUN;
                          }
                          else {
                            S99485=0;
                            if(capperStatus_o.isACK()){//sysj\controller.sysj line: 200, column: 5
                              capperStatus_o.setVal("idle");//sysj\controller.sysj line: 200, column: 5
                              S99485=1;
                              if(!capperStatus_o.isACK()){//sysj\controller.sysj line: 200, column: 5
                                capperStatus_o.setREQ(false);//sysj\controller.sysj line: 200, column: 5
                                ends[13]=2;
                                ;//sysj\controller.sysj line: 200, column: 5
                                S99576=2;
                                if(bottleAtPos4.getprestatus()){//sysj\controller.sysj line: 203, column: 12
                                  System.out.println("Capper doing work...");//sysj\controller.sysj line: 204, column: 5
                                  thread115527(tdone,ends);
                                  thread115528(tdone,ends);
                                  thread115529(tdone,ends);
                                  thread115533(tdone,ends);
                                  int biggest115534 = 0;
                                  if(ends[14]>=biggest115534){
                                    biggest115534=ends[14];
                                  }
                                  if(ends[15]>=biggest115534){
                                    biggest115534=ends[15];
                                  }
                                  if(ends[16]>=biggest115534){
                                    biggest115534=ends[16];
                                  }
                                  if(ends[19]>=biggest115534){
                                    biggest115534=ends[19];
                                  }
                                  if(biggest115534 == 1){
                                    active[13]=1;
                                    ends[13]=1;
                                    break RUN;
                                  }
                                }
                                else {
                                  S99461=2;
                                  S102956=0;
                                  if(!capperStatus_o.isPartnerPresent() || capperStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 242, column: 3
                                    capperStatus_o.setREQ(false);//sysj\controller.sysj line: 242, column: 3
                                    S102956=1;
                                    active[13]=1;
                                    ends[13]=1;
                                    break RUN;
                                  }
                                  else {
                                    S102951=0;
                                    if(capperStatus_o.isACK()){//sysj\controller.sysj line: 242, column: 3
                                      capperStatus_o.setVal("done");//sysj\controller.sysj line: 242, column: 3
                                      S102951=1;
                                      if(!capperStatus_o.isACK()){//sysj\controller.sysj line: 242, column: 3
                                        capperStatus_o.setREQ(false);//sysj\controller.sysj line: 242, column: 3
                                        ends[13]=2;
                                        ;//sysj\controller.sysj line: 242, column: 3
                                        S99461=3;
                                        active[13]=1;
                                        ends[13]=1;
                                        break RUN;
                                      }
                                      else {
                                        active[13]=1;
                                        ends[13]=1;
                                        break RUN;
                                      }
                                    }
                                    else {
                                      active[13]=1;
                                      ends[13]=1;
                                      break RUN;
                                    }
                                  }
                                }
                              }
                              else {
                                active[13]=1;
                                ends[13]=1;
                                break RUN;
                              }
                            }
                            else {
                              active[13]=1;
                              ends[13]=1;
                              break RUN;
                            }
                          }
                        }
                        else {
                          S99576=2;
                          if(bottleAtPos4.getprestatus()){//sysj\controller.sysj line: 203, column: 12
                            System.out.println("Capper doing work...");//sysj\controller.sysj line: 204, column: 5
                            thread115535(tdone,ends);
                            thread115536(tdone,ends);
                            thread115537(tdone,ends);
                            thread115541(tdone,ends);
                            int biggest115542 = 0;
                            if(ends[14]>=biggest115542){
                              biggest115542=ends[14];
                            }
                            if(ends[15]>=biggest115542){
                              biggest115542=ends[15];
                            }
                            if(ends[16]>=biggest115542){
                              biggest115542=ends[16];
                            }
                            if(ends[19]>=biggest115542){
                              biggest115542=ends[19];
                            }
                            if(biggest115542 == 1){
                              active[13]=1;
                              ends[13]=1;
                              break RUN;
                            }
                          }
                          else {
                            S99461=2;
                            S102956=0;
                            if(!capperStatus_o.isPartnerPresent() || capperStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 242, column: 3
                              capperStatus_o.setREQ(false);//sysj\controller.sysj line: 242, column: 3
                              S102956=1;
                              active[13]=1;
                              ends[13]=1;
                              break RUN;
                            }
                            else {
                              S102951=0;
                              if(capperStatus_o.isACK()){//sysj\controller.sysj line: 242, column: 3
                                capperStatus_o.setVal("done");//sysj\controller.sysj line: 242, column: 3
                                S102951=1;
                                if(!capperStatus_o.isACK()){//sysj\controller.sysj line: 242, column: 3
                                  capperStatus_o.setREQ(false);//sysj\controller.sysj line: 242, column: 3
                                  ends[13]=2;
                                  ;//sysj\controller.sysj line: 242, column: 3
                                  S99461=3;
                                  active[13]=1;
                                  ends[13]=1;
                                  break RUN;
                                }
                                else {
                                  active[13]=1;
                                  ends[13]=1;
                                  break RUN;
                                }
                              }
                              else {
                                active[13]=1;
                                ends[13]=1;
                                break RUN;
                              }
                            }
                          }
                        }
                      }
                      else {
                        active[13]=1;
                        ends[13]=1;
                        break RUN;
                      }
                    }
                    else {
                      active[13]=1;
                      ends[13]=1;
                      break RUN;
                    }
                  }
                }
                else {
                  S99461=2;
                  S102956=0;
                  if(!capperStatus_o.isPartnerPresent() || capperStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 242, column: 3
                    capperStatus_o.setREQ(false);//sysj\controller.sysj line: 242, column: 3
                    S102956=1;
                    active[13]=1;
                    ends[13]=1;
                    break RUN;
                  }
                  else {
                    S102951=0;
                    if(capperStatus_o.isACK()){//sysj\controller.sysj line: 242, column: 3
                      capperStatus_o.setVal("done");//sysj\controller.sysj line: 242, column: 3
                      S102951=1;
                      if(!capperStatus_o.isACK()){//sysj\controller.sysj line: 242, column: 3
                        capperStatus_o.setREQ(false);//sysj\controller.sysj line: 242, column: 3
                        ends[13]=2;
                        ;//sysj\controller.sysj line: 242, column: 3
                        S99461=3;
                        active[13]=1;
                        ends[13]=1;
                        break RUN;
                      }
                      else {
                        active[13]=1;
                        ends[13]=1;
                        break RUN;
                      }
                    }
                    else {
                      active[13]=1;
                      ends[13]=1;
                      break RUN;
                    }
                  }
                }
              }
              else {
                active[13]=1;
                ends[13]=1;
                break RUN;
              }
            }
            else {
              active[13]=1;
              ends[13]=1;
              break RUN;
            }
          }
        
        case 2 : 
          releaseCap_13.setClear();//sysj\controller.sysj line: 190, column: 2
          untwistGripper_13.setClear();//sysj\controller.sysj line: 190, column: 2
          raiseGripper_13.setClear();//sysj\controller.sysj line: 190, column: 2
          unclampBottle_13.setClear();//sysj\controller.sysj line: 190, column: 2
          switch(S99461){
            case 0 : 
              switch(S99445){
                case 0 : 
                  if(!capperReq_in.isPartnerPresent() || capperReq_in.isPartnerPreempted()){//sysj\controller.sysj line: 193, column: 3
                    capperReq_in.setACK(false);//sysj\controller.sysj line: 193, column: 3
                    S99445=1;
                    active[13]=1;
                    ends[13]=1;
                    break RUN;
                  }
                  else {
                    switch(S99440){
                      case 0 : 
                        if(!capperReq_in.isREQ()){//sysj\controller.sysj line: 193, column: 3
                          capperReq_in.setACK(true);//sysj\controller.sysj line: 193, column: 3
                          S99440=1;
                          if(capperReq_in.isREQ()){//sysj\controller.sysj line: 193, column: 3
                            capperReq_in.setACK(false);//sysj\controller.sysj line: 193, column: 3
                            ends[13]=2;
                            ;//sysj\controller.sysj line: 193, column: 3
                            request_thread_13 = (boolean)(capperReq_in.getVal() == null ? false : ((Boolean)capperReq_in.getVal()).booleanValue());//sysj\controller.sysj line: 194, column: 3
                            S99461=1;
                            if(request_thread_13){//sysj\controller.sysj line: 196, column: 3
                              S99576=0;
                              S99468=0;
                              if(!capperStatus_o.isPartnerPresent() || capperStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 197, column: 4
                                capperStatus_o.setREQ(false);//sysj\controller.sysj line: 197, column: 4
                                S99468=1;
                                active[13]=1;
                                ends[13]=1;
                                break RUN;
                              }
                              else {
                                S99463=0;
                                if(capperStatus_o.isACK()){//sysj\controller.sysj line: 197, column: 4
                                  capperStatus_o.setVal("busy");//sysj\controller.sysj line: 197, column: 4
                                  S99463=1;
                                  if(!capperStatus_o.isACK()){//sysj\controller.sysj line: 197, column: 4
                                    capperStatus_o.setREQ(false);//sysj\controller.sysj line: 197, column: 4
                                    ends[13]=2;
                                    ;//sysj\controller.sysj line: 197, column: 4
                                    S99576=1;
                                    if(!bottleAtPos4.getprestatus()){//sysj\controller.sysj line: 199, column: 13
                                      S99490=0;
                                      if(!capperStatus_o.isPartnerPresent() || capperStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 200, column: 5
                                        capperStatus_o.setREQ(false);//sysj\controller.sysj line: 200, column: 5
                                        S99490=1;
                                        active[13]=1;
                                        ends[13]=1;
                                        break RUN;
                                      }
                                      else {
                                        S99485=0;
                                        if(capperStatus_o.isACK()){//sysj\controller.sysj line: 200, column: 5
                                          capperStatus_o.setVal("idle");//sysj\controller.sysj line: 200, column: 5
                                          S99485=1;
                                          if(!capperStatus_o.isACK()){//sysj\controller.sysj line: 200, column: 5
                                            capperStatus_o.setREQ(false);//sysj\controller.sysj line: 200, column: 5
                                            ends[13]=2;
                                            ;//sysj\controller.sysj line: 200, column: 5
                                            S99576=2;
                                            if(bottleAtPos4.getprestatus()){//sysj\controller.sysj line: 203, column: 12
                                              System.out.println("Capper doing work...");//sysj\controller.sysj line: 204, column: 5
                                              thread115543(tdone,ends);
                                              thread115544(tdone,ends);
                                              thread115545(tdone,ends);
                                              thread115549(tdone,ends);
                                              int biggest115550 = 0;
                                              if(ends[14]>=biggest115550){
                                                biggest115550=ends[14];
                                              }
                                              if(ends[15]>=biggest115550){
                                                biggest115550=ends[15];
                                              }
                                              if(ends[16]>=biggest115550){
                                                biggest115550=ends[16];
                                              }
                                              if(ends[19]>=biggest115550){
                                                biggest115550=ends[19];
                                              }
                                              if(biggest115550 == 1){
                                                active[13]=1;
                                                ends[13]=1;
                                                break RUN;
                                              }
                                            }
                                            else {
                                              S99461=2;
                                              S102956=0;
                                              if(!capperStatus_o.isPartnerPresent() || capperStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 242, column: 3
                                                capperStatus_o.setREQ(false);//sysj\controller.sysj line: 242, column: 3
                                                S102956=1;
                                                active[13]=1;
                                                ends[13]=1;
                                                break RUN;
                                              }
                                              else {
                                                S102951=0;
                                                if(capperStatus_o.isACK()){//sysj\controller.sysj line: 242, column: 3
                                                  capperStatus_o.setVal("done");//sysj\controller.sysj line: 242, column: 3
                                                  S102951=1;
                                                  if(!capperStatus_o.isACK()){//sysj\controller.sysj line: 242, column: 3
                                                    capperStatus_o.setREQ(false);//sysj\controller.sysj line: 242, column: 3
                                                    ends[13]=2;
                                                    ;//sysj\controller.sysj line: 242, column: 3
                                                    S99461=3;
                                                    active[13]=1;
                                                    ends[13]=1;
                                                    break RUN;
                                                  }
                                                  else {
                                                    active[13]=1;
                                                    ends[13]=1;
                                                    break RUN;
                                                  }
                                                }
                                                else {
                                                  active[13]=1;
                                                  ends[13]=1;
                                                  break RUN;
                                                }
                                              }
                                            }
                                          }
                                          else {
                                            active[13]=1;
                                            ends[13]=1;
                                            break RUN;
                                          }
                                        }
                                        else {
                                          active[13]=1;
                                          ends[13]=1;
                                          break RUN;
                                        }
                                      }
                                    }
                                    else {
                                      S99576=2;
                                      if(bottleAtPos4.getprestatus()){//sysj\controller.sysj line: 203, column: 12
                                        System.out.println("Capper doing work...");//sysj\controller.sysj line: 204, column: 5
                                        thread115551(tdone,ends);
                                        thread115552(tdone,ends);
                                        thread115553(tdone,ends);
                                        thread115557(tdone,ends);
                                        int biggest115558 = 0;
                                        if(ends[14]>=biggest115558){
                                          biggest115558=ends[14];
                                        }
                                        if(ends[15]>=biggest115558){
                                          biggest115558=ends[15];
                                        }
                                        if(ends[16]>=biggest115558){
                                          biggest115558=ends[16];
                                        }
                                        if(ends[19]>=biggest115558){
                                          biggest115558=ends[19];
                                        }
                                        if(biggest115558 == 1){
                                          active[13]=1;
                                          ends[13]=1;
                                          break RUN;
                                        }
                                      }
                                      else {
                                        S99461=2;
                                        S102956=0;
                                        if(!capperStatus_o.isPartnerPresent() || capperStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 242, column: 3
                                          capperStatus_o.setREQ(false);//sysj\controller.sysj line: 242, column: 3
                                          S102956=1;
                                          active[13]=1;
                                          ends[13]=1;
                                          break RUN;
                                        }
                                        else {
                                          S102951=0;
                                          if(capperStatus_o.isACK()){//sysj\controller.sysj line: 242, column: 3
                                            capperStatus_o.setVal("done");//sysj\controller.sysj line: 242, column: 3
                                            S102951=1;
                                            if(!capperStatus_o.isACK()){//sysj\controller.sysj line: 242, column: 3
                                              capperStatus_o.setREQ(false);//sysj\controller.sysj line: 242, column: 3
                                              ends[13]=2;
                                              ;//sysj\controller.sysj line: 242, column: 3
                                              S99461=3;
                                              active[13]=1;
                                              ends[13]=1;
                                              break RUN;
                                            }
                                            else {
                                              active[13]=1;
                                              ends[13]=1;
                                              break RUN;
                                            }
                                          }
                                          else {
                                            active[13]=1;
                                            ends[13]=1;
                                            break RUN;
                                          }
                                        }
                                      }
                                    }
                                  }
                                  else {
                                    active[13]=1;
                                    ends[13]=1;
                                    break RUN;
                                  }
                                }
                                else {
                                  active[13]=1;
                                  ends[13]=1;
                                  break RUN;
                                }
                              }
                            }
                            else {
                              S99461=2;
                              S102956=0;
                              if(!capperStatus_o.isPartnerPresent() || capperStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 242, column: 3
                                capperStatus_o.setREQ(false);//sysj\controller.sysj line: 242, column: 3
                                S102956=1;
                                active[13]=1;
                                ends[13]=1;
                                break RUN;
                              }
                              else {
                                S102951=0;
                                if(capperStatus_o.isACK()){//sysj\controller.sysj line: 242, column: 3
                                  capperStatus_o.setVal("done");//sysj\controller.sysj line: 242, column: 3
                                  S102951=1;
                                  if(!capperStatus_o.isACK()){//sysj\controller.sysj line: 242, column: 3
                                    capperStatus_o.setREQ(false);//sysj\controller.sysj line: 242, column: 3
                                    ends[13]=2;
                                    ;//sysj\controller.sysj line: 242, column: 3
                                    S99461=3;
                                    active[13]=1;
                                    ends[13]=1;
                                    break RUN;
                                  }
                                  else {
                                    active[13]=1;
                                    ends[13]=1;
                                    break RUN;
                                  }
                                }
                                else {
                                  active[13]=1;
                                  ends[13]=1;
                                  break RUN;
                                }
                              }
                            }
                          }
                          else {
                            active[13]=1;
                            ends[13]=1;
                            break RUN;
                          }
                        }
                        else {
                          active[13]=1;
                          ends[13]=1;
                          break RUN;
                        }
                      
                      case 1 : 
                        if(capperReq_in.isREQ()){//sysj\controller.sysj line: 193, column: 3
                          capperReq_in.setACK(false);//sysj\controller.sysj line: 193, column: 3
                          ends[13]=2;
                          ;//sysj\controller.sysj line: 193, column: 3
                          request_thread_13 = (boolean)(capperReq_in.getVal() == null ? false : ((Boolean)capperReq_in.getVal()).booleanValue());//sysj\controller.sysj line: 194, column: 3
                          S99461=1;
                          if(request_thread_13){//sysj\controller.sysj line: 196, column: 3
                            S99576=0;
                            S99468=0;
                            if(!capperStatus_o.isPartnerPresent() || capperStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 197, column: 4
                              capperStatus_o.setREQ(false);//sysj\controller.sysj line: 197, column: 4
                              S99468=1;
                              active[13]=1;
                              ends[13]=1;
                              break RUN;
                            }
                            else {
                              S99463=0;
                              if(capperStatus_o.isACK()){//sysj\controller.sysj line: 197, column: 4
                                capperStatus_o.setVal("busy");//sysj\controller.sysj line: 197, column: 4
                                S99463=1;
                                if(!capperStatus_o.isACK()){//sysj\controller.sysj line: 197, column: 4
                                  capperStatus_o.setREQ(false);//sysj\controller.sysj line: 197, column: 4
                                  ends[13]=2;
                                  ;//sysj\controller.sysj line: 197, column: 4
                                  S99576=1;
                                  if(!bottleAtPos4.getprestatus()){//sysj\controller.sysj line: 199, column: 13
                                    S99490=0;
                                    if(!capperStatus_o.isPartnerPresent() || capperStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 200, column: 5
                                      capperStatus_o.setREQ(false);//sysj\controller.sysj line: 200, column: 5
                                      S99490=1;
                                      active[13]=1;
                                      ends[13]=1;
                                      break RUN;
                                    }
                                    else {
                                      S99485=0;
                                      if(capperStatus_o.isACK()){//sysj\controller.sysj line: 200, column: 5
                                        capperStatus_o.setVal("idle");//sysj\controller.sysj line: 200, column: 5
                                        S99485=1;
                                        if(!capperStatus_o.isACK()){//sysj\controller.sysj line: 200, column: 5
                                          capperStatus_o.setREQ(false);//sysj\controller.sysj line: 200, column: 5
                                          ends[13]=2;
                                          ;//sysj\controller.sysj line: 200, column: 5
                                          S99576=2;
                                          if(bottleAtPos4.getprestatus()){//sysj\controller.sysj line: 203, column: 12
                                            System.out.println("Capper doing work...");//sysj\controller.sysj line: 204, column: 5
                                            thread115559(tdone,ends);
                                            thread115560(tdone,ends);
                                            thread115561(tdone,ends);
                                            thread115565(tdone,ends);
                                            int biggest115566 = 0;
                                            if(ends[14]>=biggest115566){
                                              biggest115566=ends[14];
                                            }
                                            if(ends[15]>=biggest115566){
                                              biggest115566=ends[15];
                                            }
                                            if(ends[16]>=biggest115566){
                                              biggest115566=ends[16];
                                            }
                                            if(ends[19]>=biggest115566){
                                              biggest115566=ends[19];
                                            }
                                            if(biggest115566 == 1){
                                              active[13]=1;
                                              ends[13]=1;
                                              break RUN;
                                            }
                                          }
                                          else {
                                            S99461=2;
                                            S102956=0;
                                            if(!capperStatus_o.isPartnerPresent() || capperStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 242, column: 3
                                              capperStatus_o.setREQ(false);//sysj\controller.sysj line: 242, column: 3
                                              S102956=1;
                                              active[13]=1;
                                              ends[13]=1;
                                              break RUN;
                                            }
                                            else {
                                              S102951=0;
                                              if(capperStatus_o.isACK()){//sysj\controller.sysj line: 242, column: 3
                                                capperStatus_o.setVal("done");//sysj\controller.sysj line: 242, column: 3
                                                S102951=1;
                                                if(!capperStatus_o.isACK()){//sysj\controller.sysj line: 242, column: 3
                                                  capperStatus_o.setREQ(false);//sysj\controller.sysj line: 242, column: 3
                                                  ends[13]=2;
                                                  ;//sysj\controller.sysj line: 242, column: 3
                                                  S99461=3;
                                                  active[13]=1;
                                                  ends[13]=1;
                                                  break RUN;
                                                }
                                                else {
                                                  active[13]=1;
                                                  ends[13]=1;
                                                  break RUN;
                                                }
                                              }
                                              else {
                                                active[13]=1;
                                                ends[13]=1;
                                                break RUN;
                                              }
                                            }
                                          }
                                        }
                                        else {
                                          active[13]=1;
                                          ends[13]=1;
                                          break RUN;
                                        }
                                      }
                                      else {
                                        active[13]=1;
                                        ends[13]=1;
                                        break RUN;
                                      }
                                    }
                                  }
                                  else {
                                    S99576=2;
                                    if(bottleAtPos4.getprestatus()){//sysj\controller.sysj line: 203, column: 12
                                      System.out.println("Capper doing work...");//sysj\controller.sysj line: 204, column: 5
                                      thread115567(tdone,ends);
                                      thread115568(tdone,ends);
                                      thread115569(tdone,ends);
                                      thread115573(tdone,ends);
                                      int biggest115574 = 0;
                                      if(ends[14]>=biggest115574){
                                        biggest115574=ends[14];
                                      }
                                      if(ends[15]>=biggest115574){
                                        biggest115574=ends[15];
                                      }
                                      if(ends[16]>=biggest115574){
                                        biggest115574=ends[16];
                                      }
                                      if(ends[19]>=biggest115574){
                                        biggest115574=ends[19];
                                      }
                                      if(biggest115574 == 1){
                                        active[13]=1;
                                        ends[13]=1;
                                        break RUN;
                                      }
                                    }
                                    else {
                                      S99461=2;
                                      S102956=0;
                                      if(!capperStatus_o.isPartnerPresent() || capperStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 242, column: 3
                                        capperStatus_o.setREQ(false);//sysj\controller.sysj line: 242, column: 3
                                        S102956=1;
                                        active[13]=1;
                                        ends[13]=1;
                                        break RUN;
                                      }
                                      else {
                                        S102951=0;
                                        if(capperStatus_o.isACK()){//sysj\controller.sysj line: 242, column: 3
                                          capperStatus_o.setVal("done");//sysj\controller.sysj line: 242, column: 3
                                          S102951=1;
                                          if(!capperStatus_o.isACK()){//sysj\controller.sysj line: 242, column: 3
                                            capperStatus_o.setREQ(false);//sysj\controller.sysj line: 242, column: 3
                                            ends[13]=2;
                                            ;//sysj\controller.sysj line: 242, column: 3
                                            S99461=3;
                                            active[13]=1;
                                            ends[13]=1;
                                            break RUN;
                                          }
                                          else {
                                            active[13]=1;
                                            ends[13]=1;
                                            break RUN;
                                          }
                                        }
                                        else {
                                          active[13]=1;
                                          ends[13]=1;
                                          break RUN;
                                        }
                                      }
                                    }
                                  }
                                }
                                else {
                                  active[13]=1;
                                  ends[13]=1;
                                  break RUN;
                                }
                              }
                              else {
                                active[13]=1;
                                ends[13]=1;
                                break RUN;
                              }
                            }
                          }
                          else {
                            S99461=2;
                            S102956=0;
                            if(!capperStatus_o.isPartnerPresent() || capperStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 242, column: 3
                              capperStatus_o.setREQ(false);//sysj\controller.sysj line: 242, column: 3
                              S102956=1;
                              active[13]=1;
                              ends[13]=1;
                              break RUN;
                            }
                            else {
                              S102951=0;
                              if(capperStatus_o.isACK()){//sysj\controller.sysj line: 242, column: 3
                                capperStatus_o.setVal("done");//sysj\controller.sysj line: 242, column: 3
                                S102951=1;
                                if(!capperStatus_o.isACK()){//sysj\controller.sysj line: 242, column: 3
                                  capperStatus_o.setREQ(false);//sysj\controller.sysj line: 242, column: 3
                                  ends[13]=2;
                                  ;//sysj\controller.sysj line: 242, column: 3
                                  S99461=3;
                                  active[13]=1;
                                  ends[13]=1;
                                  break RUN;
                                }
                                else {
                                  active[13]=1;
                                  ends[13]=1;
                                  break RUN;
                                }
                              }
                              else {
                                active[13]=1;
                                ends[13]=1;
                                break RUN;
                              }
                            }
                          }
                        }
                        else {
                          active[13]=1;
                          ends[13]=1;
                          break RUN;
                        }
                      
                    }
                  }
                  break;
                
                case 1 : 
                  S99445=1;
                  S99445=0;
                  if(!capperReq_in.isPartnerPresent() || capperReq_in.isPartnerPreempted()){//sysj\controller.sysj line: 193, column: 3
                    capperReq_in.setACK(false);//sysj\controller.sysj line: 193, column: 3
                    S99445=1;
                    active[13]=1;
                    ends[13]=1;
                    break RUN;
                  }
                  else {
                    S99440=0;
                    if(!capperReq_in.isREQ()){//sysj\controller.sysj line: 193, column: 3
                      capperReq_in.setACK(true);//sysj\controller.sysj line: 193, column: 3
                      S99440=1;
                      if(capperReq_in.isREQ()){//sysj\controller.sysj line: 193, column: 3
                        capperReq_in.setACK(false);//sysj\controller.sysj line: 193, column: 3
                        ends[13]=2;
                        ;//sysj\controller.sysj line: 193, column: 3
                        request_thread_13 = (boolean)(capperReq_in.getVal() == null ? false : ((Boolean)capperReq_in.getVal()).booleanValue());//sysj\controller.sysj line: 194, column: 3
                        S99461=1;
                        if(request_thread_13){//sysj\controller.sysj line: 196, column: 3
                          S99576=0;
                          S99468=0;
                          if(!capperStatus_o.isPartnerPresent() || capperStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 197, column: 4
                            capperStatus_o.setREQ(false);//sysj\controller.sysj line: 197, column: 4
                            S99468=1;
                            active[13]=1;
                            ends[13]=1;
                            break RUN;
                          }
                          else {
                            S99463=0;
                            if(capperStatus_o.isACK()){//sysj\controller.sysj line: 197, column: 4
                              capperStatus_o.setVal("busy");//sysj\controller.sysj line: 197, column: 4
                              S99463=1;
                              if(!capperStatus_o.isACK()){//sysj\controller.sysj line: 197, column: 4
                                capperStatus_o.setREQ(false);//sysj\controller.sysj line: 197, column: 4
                                ends[13]=2;
                                ;//sysj\controller.sysj line: 197, column: 4
                                S99576=1;
                                if(!bottleAtPos4.getprestatus()){//sysj\controller.sysj line: 199, column: 13
                                  S99490=0;
                                  if(!capperStatus_o.isPartnerPresent() || capperStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 200, column: 5
                                    capperStatus_o.setREQ(false);//sysj\controller.sysj line: 200, column: 5
                                    S99490=1;
                                    active[13]=1;
                                    ends[13]=1;
                                    break RUN;
                                  }
                                  else {
                                    S99485=0;
                                    if(capperStatus_o.isACK()){//sysj\controller.sysj line: 200, column: 5
                                      capperStatus_o.setVal("idle");//sysj\controller.sysj line: 200, column: 5
                                      S99485=1;
                                      if(!capperStatus_o.isACK()){//sysj\controller.sysj line: 200, column: 5
                                        capperStatus_o.setREQ(false);//sysj\controller.sysj line: 200, column: 5
                                        ends[13]=2;
                                        ;//sysj\controller.sysj line: 200, column: 5
                                        S99576=2;
                                        if(bottleAtPos4.getprestatus()){//sysj\controller.sysj line: 203, column: 12
                                          System.out.println("Capper doing work...");//sysj\controller.sysj line: 204, column: 5
                                          thread115575(tdone,ends);
                                          thread115576(tdone,ends);
                                          thread115577(tdone,ends);
                                          thread115581(tdone,ends);
                                          int biggest115582 = 0;
                                          if(ends[14]>=biggest115582){
                                            biggest115582=ends[14];
                                          }
                                          if(ends[15]>=biggest115582){
                                            biggest115582=ends[15];
                                          }
                                          if(ends[16]>=biggest115582){
                                            biggest115582=ends[16];
                                          }
                                          if(ends[19]>=biggest115582){
                                            biggest115582=ends[19];
                                          }
                                          if(biggest115582 == 1){
                                            active[13]=1;
                                            ends[13]=1;
                                            break RUN;
                                          }
                                        }
                                        else {
                                          S99461=2;
                                          S102956=0;
                                          if(!capperStatus_o.isPartnerPresent() || capperStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 242, column: 3
                                            capperStatus_o.setREQ(false);//sysj\controller.sysj line: 242, column: 3
                                            S102956=1;
                                            active[13]=1;
                                            ends[13]=1;
                                            break RUN;
                                          }
                                          else {
                                            S102951=0;
                                            if(capperStatus_o.isACK()){//sysj\controller.sysj line: 242, column: 3
                                              capperStatus_o.setVal("done");//sysj\controller.sysj line: 242, column: 3
                                              S102951=1;
                                              if(!capperStatus_o.isACK()){//sysj\controller.sysj line: 242, column: 3
                                                capperStatus_o.setREQ(false);//sysj\controller.sysj line: 242, column: 3
                                                ends[13]=2;
                                                ;//sysj\controller.sysj line: 242, column: 3
                                                S99461=3;
                                                active[13]=1;
                                                ends[13]=1;
                                                break RUN;
                                              }
                                              else {
                                                active[13]=1;
                                                ends[13]=1;
                                                break RUN;
                                              }
                                            }
                                            else {
                                              active[13]=1;
                                              ends[13]=1;
                                              break RUN;
                                            }
                                          }
                                        }
                                      }
                                      else {
                                        active[13]=1;
                                        ends[13]=1;
                                        break RUN;
                                      }
                                    }
                                    else {
                                      active[13]=1;
                                      ends[13]=1;
                                      break RUN;
                                    }
                                  }
                                }
                                else {
                                  S99576=2;
                                  if(bottleAtPos4.getprestatus()){//sysj\controller.sysj line: 203, column: 12
                                    System.out.println("Capper doing work...");//sysj\controller.sysj line: 204, column: 5
                                    thread115583(tdone,ends);
                                    thread115584(tdone,ends);
                                    thread115585(tdone,ends);
                                    thread115589(tdone,ends);
                                    int biggest115590 = 0;
                                    if(ends[14]>=biggest115590){
                                      biggest115590=ends[14];
                                    }
                                    if(ends[15]>=biggest115590){
                                      biggest115590=ends[15];
                                    }
                                    if(ends[16]>=biggest115590){
                                      biggest115590=ends[16];
                                    }
                                    if(ends[19]>=biggest115590){
                                      biggest115590=ends[19];
                                    }
                                    if(biggest115590 == 1){
                                      active[13]=1;
                                      ends[13]=1;
                                      break RUN;
                                    }
                                  }
                                  else {
                                    S99461=2;
                                    S102956=0;
                                    if(!capperStatus_o.isPartnerPresent() || capperStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 242, column: 3
                                      capperStatus_o.setREQ(false);//sysj\controller.sysj line: 242, column: 3
                                      S102956=1;
                                      active[13]=1;
                                      ends[13]=1;
                                      break RUN;
                                    }
                                    else {
                                      S102951=0;
                                      if(capperStatus_o.isACK()){//sysj\controller.sysj line: 242, column: 3
                                        capperStatus_o.setVal("done");//sysj\controller.sysj line: 242, column: 3
                                        S102951=1;
                                        if(!capperStatus_o.isACK()){//sysj\controller.sysj line: 242, column: 3
                                          capperStatus_o.setREQ(false);//sysj\controller.sysj line: 242, column: 3
                                          ends[13]=2;
                                          ;//sysj\controller.sysj line: 242, column: 3
                                          S99461=3;
                                          active[13]=1;
                                          ends[13]=1;
                                          break RUN;
                                        }
                                        else {
                                          active[13]=1;
                                          ends[13]=1;
                                          break RUN;
                                        }
                                      }
                                      else {
                                        active[13]=1;
                                        ends[13]=1;
                                        break RUN;
                                      }
                                    }
                                  }
                                }
                              }
                              else {
                                active[13]=1;
                                ends[13]=1;
                                break RUN;
                              }
                            }
                            else {
                              active[13]=1;
                              ends[13]=1;
                              break RUN;
                            }
                          }
                        }
                        else {
                          S99461=2;
                          S102956=0;
                          if(!capperStatus_o.isPartnerPresent() || capperStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 242, column: 3
                            capperStatus_o.setREQ(false);//sysj\controller.sysj line: 242, column: 3
                            S102956=1;
                            active[13]=1;
                            ends[13]=1;
                            break RUN;
                          }
                          else {
                            S102951=0;
                            if(capperStatus_o.isACK()){//sysj\controller.sysj line: 242, column: 3
                              capperStatus_o.setVal("done");//sysj\controller.sysj line: 242, column: 3
                              S102951=1;
                              if(!capperStatus_o.isACK()){//sysj\controller.sysj line: 242, column: 3
                                capperStatus_o.setREQ(false);//sysj\controller.sysj line: 242, column: 3
                                ends[13]=2;
                                ;//sysj\controller.sysj line: 242, column: 3
                                S99461=3;
                                active[13]=1;
                                ends[13]=1;
                                break RUN;
                              }
                              else {
                                active[13]=1;
                                ends[13]=1;
                                break RUN;
                              }
                            }
                            else {
                              active[13]=1;
                              ends[13]=1;
                              break RUN;
                            }
                          }
                        }
                      }
                      else {
                        active[13]=1;
                        ends[13]=1;
                        break RUN;
                      }
                    }
                    else {
                      active[13]=1;
                      ends[13]=1;
                      break RUN;
                    }
                  }
                
              }
              break;
            
            case 1 : 
              switch(S99576){
                case 0 : 
                  switch(S99468){
                    case 0 : 
                      if(!capperStatus_o.isPartnerPresent() || capperStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 197, column: 4
                        capperStatus_o.setREQ(false);//sysj\controller.sysj line: 197, column: 4
                        S99468=1;
                        active[13]=1;
                        ends[13]=1;
                        break RUN;
                      }
                      else {
                        switch(S99463){
                          case 0 : 
                            if(capperStatus_o.isACK()){//sysj\controller.sysj line: 197, column: 4
                              capperStatus_o.setVal("busy");//sysj\controller.sysj line: 197, column: 4
                              S99463=1;
                              if(!capperStatus_o.isACK()){//sysj\controller.sysj line: 197, column: 4
                                capperStatus_o.setREQ(false);//sysj\controller.sysj line: 197, column: 4
                                ends[13]=2;
                                ;//sysj\controller.sysj line: 197, column: 4
                                S99576=1;
                                if(!bottleAtPos4.getprestatus()){//sysj\controller.sysj line: 199, column: 13
                                  S99490=0;
                                  if(!capperStatus_o.isPartnerPresent() || capperStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 200, column: 5
                                    capperStatus_o.setREQ(false);//sysj\controller.sysj line: 200, column: 5
                                    S99490=1;
                                    active[13]=1;
                                    ends[13]=1;
                                    break RUN;
                                  }
                                  else {
                                    S99485=0;
                                    if(capperStatus_o.isACK()){//sysj\controller.sysj line: 200, column: 5
                                      capperStatus_o.setVal("idle");//sysj\controller.sysj line: 200, column: 5
                                      S99485=1;
                                      if(!capperStatus_o.isACK()){//sysj\controller.sysj line: 200, column: 5
                                        capperStatus_o.setREQ(false);//sysj\controller.sysj line: 200, column: 5
                                        ends[13]=2;
                                        ;//sysj\controller.sysj line: 200, column: 5
                                        S99576=2;
                                        if(bottleAtPos4.getprestatus()){//sysj\controller.sysj line: 203, column: 12
                                          System.out.println("Capper doing work...");//sysj\controller.sysj line: 204, column: 5
                                          thread115591(tdone,ends);
                                          thread115592(tdone,ends);
                                          thread115593(tdone,ends);
                                          thread115597(tdone,ends);
                                          int biggest115598 = 0;
                                          if(ends[14]>=biggest115598){
                                            biggest115598=ends[14];
                                          }
                                          if(ends[15]>=biggest115598){
                                            biggest115598=ends[15];
                                          }
                                          if(ends[16]>=biggest115598){
                                            biggest115598=ends[16];
                                          }
                                          if(ends[19]>=biggest115598){
                                            biggest115598=ends[19];
                                          }
                                          if(biggest115598 == 1){
                                            active[13]=1;
                                            ends[13]=1;
                                            break RUN;
                                          }
                                        }
                                        else {
                                          S99461=2;
                                          S102956=0;
                                          if(!capperStatus_o.isPartnerPresent() || capperStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 242, column: 3
                                            capperStatus_o.setREQ(false);//sysj\controller.sysj line: 242, column: 3
                                            S102956=1;
                                            active[13]=1;
                                            ends[13]=1;
                                            break RUN;
                                          }
                                          else {
                                            S102951=0;
                                            if(capperStatus_o.isACK()){//sysj\controller.sysj line: 242, column: 3
                                              capperStatus_o.setVal("done");//sysj\controller.sysj line: 242, column: 3
                                              S102951=1;
                                              if(!capperStatus_o.isACK()){//sysj\controller.sysj line: 242, column: 3
                                                capperStatus_o.setREQ(false);//sysj\controller.sysj line: 242, column: 3
                                                ends[13]=2;
                                                ;//sysj\controller.sysj line: 242, column: 3
                                                S99461=3;
                                                active[13]=1;
                                                ends[13]=1;
                                                break RUN;
                                              }
                                              else {
                                                active[13]=1;
                                                ends[13]=1;
                                                break RUN;
                                              }
                                            }
                                            else {
                                              active[13]=1;
                                              ends[13]=1;
                                              break RUN;
                                            }
                                          }
                                        }
                                      }
                                      else {
                                        active[13]=1;
                                        ends[13]=1;
                                        break RUN;
                                      }
                                    }
                                    else {
                                      active[13]=1;
                                      ends[13]=1;
                                      break RUN;
                                    }
                                  }
                                }
                                else {
                                  S99576=2;
                                  if(bottleAtPos4.getprestatus()){//sysj\controller.sysj line: 203, column: 12
                                    System.out.println("Capper doing work...");//sysj\controller.sysj line: 204, column: 5
                                    thread115599(tdone,ends);
                                    thread115600(tdone,ends);
                                    thread115601(tdone,ends);
                                    thread115605(tdone,ends);
                                    int biggest115606 = 0;
                                    if(ends[14]>=biggest115606){
                                      biggest115606=ends[14];
                                    }
                                    if(ends[15]>=biggest115606){
                                      biggest115606=ends[15];
                                    }
                                    if(ends[16]>=biggest115606){
                                      biggest115606=ends[16];
                                    }
                                    if(ends[19]>=biggest115606){
                                      biggest115606=ends[19];
                                    }
                                    if(biggest115606 == 1){
                                      active[13]=1;
                                      ends[13]=1;
                                      break RUN;
                                    }
                                  }
                                  else {
                                    S99461=2;
                                    S102956=0;
                                    if(!capperStatus_o.isPartnerPresent() || capperStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 242, column: 3
                                      capperStatus_o.setREQ(false);//sysj\controller.sysj line: 242, column: 3
                                      S102956=1;
                                      active[13]=1;
                                      ends[13]=1;
                                      break RUN;
                                    }
                                    else {
                                      S102951=0;
                                      if(capperStatus_o.isACK()){//sysj\controller.sysj line: 242, column: 3
                                        capperStatus_o.setVal("done");//sysj\controller.sysj line: 242, column: 3
                                        S102951=1;
                                        if(!capperStatus_o.isACK()){//sysj\controller.sysj line: 242, column: 3
                                          capperStatus_o.setREQ(false);//sysj\controller.sysj line: 242, column: 3
                                          ends[13]=2;
                                          ;//sysj\controller.sysj line: 242, column: 3
                                          S99461=3;
                                          active[13]=1;
                                          ends[13]=1;
                                          break RUN;
                                        }
                                        else {
                                          active[13]=1;
                                          ends[13]=1;
                                          break RUN;
                                        }
                                      }
                                      else {
                                        active[13]=1;
                                        ends[13]=1;
                                        break RUN;
                                      }
                                    }
                                  }
                                }
                              }
                              else {
                                active[13]=1;
                                ends[13]=1;
                                break RUN;
                              }
                            }
                            else {
                              active[13]=1;
                              ends[13]=1;
                              break RUN;
                            }
                          
                          case 1 : 
                            if(!capperStatus_o.isACK()){//sysj\controller.sysj line: 197, column: 4
                              capperStatus_o.setREQ(false);//sysj\controller.sysj line: 197, column: 4
                              ends[13]=2;
                              ;//sysj\controller.sysj line: 197, column: 4
                              S99576=1;
                              if(!bottleAtPos4.getprestatus()){//sysj\controller.sysj line: 199, column: 13
                                S99490=0;
                                if(!capperStatus_o.isPartnerPresent() || capperStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 200, column: 5
                                  capperStatus_o.setREQ(false);//sysj\controller.sysj line: 200, column: 5
                                  S99490=1;
                                  active[13]=1;
                                  ends[13]=1;
                                  break RUN;
                                }
                                else {
                                  S99485=0;
                                  if(capperStatus_o.isACK()){//sysj\controller.sysj line: 200, column: 5
                                    capperStatus_o.setVal("idle");//sysj\controller.sysj line: 200, column: 5
                                    S99485=1;
                                    if(!capperStatus_o.isACK()){//sysj\controller.sysj line: 200, column: 5
                                      capperStatus_o.setREQ(false);//sysj\controller.sysj line: 200, column: 5
                                      ends[13]=2;
                                      ;//sysj\controller.sysj line: 200, column: 5
                                      S99576=2;
                                      if(bottleAtPos4.getprestatus()){//sysj\controller.sysj line: 203, column: 12
                                        System.out.println("Capper doing work...");//sysj\controller.sysj line: 204, column: 5
                                        thread115607(tdone,ends);
                                        thread115608(tdone,ends);
                                        thread115609(tdone,ends);
                                        thread115613(tdone,ends);
                                        int biggest115614 = 0;
                                        if(ends[14]>=biggest115614){
                                          biggest115614=ends[14];
                                        }
                                        if(ends[15]>=biggest115614){
                                          biggest115614=ends[15];
                                        }
                                        if(ends[16]>=biggest115614){
                                          biggest115614=ends[16];
                                        }
                                        if(ends[19]>=biggest115614){
                                          biggest115614=ends[19];
                                        }
                                        if(biggest115614 == 1){
                                          active[13]=1;
                                          ends[13]=1;
                                          break RUN;
                                        }
                                      }
                                      else {
                                        S99461=2;
                                        S102956=0;
                                        if(!capperStatus_o.isPartnerPresent() || capperStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 242, column: 3
                                          capperStatus_o.setREQ(false);//sysj\controller.sysj line: 242, column: 3
                                          S102956=1;
                                          active[13]=1;
                                          ends[13]=1;
                                          break RUN;
                                        }
                                        else {
                                          S102951=0;
                                          if(capperStatus_o.isACK()){//sysj\controller.sysj line: 242, column: 3
                                            capperStatus_o.setVal("done");//sysj\controller.sysj line: 242, column: 3
                                            S102951=1;
                                            if(!capperStatus_o.isACK()){//sysj\controller.sysj line: 242, column: 3
                                              capperStatus_o.setREQ(false);//sysj\controller.sysj line: 242, column: 3
                                              ends[13]=2;
                                              ;//sysj\controller.sysj line: 242, column: 3
                                              S99461=3;
                                              active[13]=1;
                                              ends[13]=1;
                                              break RUN;
                                            }
                                            else {
                                              active[13]=1;
                                              ends[13]=1;
                                              break RUN;
                                            }
                                          }
                                          else {
                                            active[13]=1;
                                            ends[13]=1;
                                            break RUN;
                                          }
                                        }
                                      }
                                    }
                                    else {
                                      active[13]=1;
                                      ends[13]=1;
                                      break RUN;
                                    }
                                  }
                                  else {
                                    active[13]=1;
                                    ends[13]=1;
                                    break RUN;
                                  }
                                }
                              }
                              else {
                                S99576=2;
                                if(bottleAtPos4.getprestatus()){//sysj\controller.sysj line: 203, column: 12
                                  System.out.println("Capper doing work...");//sysj\controller.sysj line: 204, column: 5
                                  thread115615(tdone,ends);
                                  thread115616(tdone,ends);
                                  thread115617(tdone,ends);
                                  thread115621(tdone,ends);
                                  int biggest115622 = 0;
                                  if(ends[14]>=biggest115622){
                                    biggest115622=ends[14];
                                  }
                                  if(ends[15]>=biggest115622){
                                    biggest115622=ends[15];
                                  }
                                  if(ends[16]>=biggest115622){
                                    biggest115622=ends[16];
                                  }
                                  if(ends[19]>=biggest115622){
                                    biggest115622=ends[19];
                                  }
                                  if(biggest115622 == 1){
                                    active[13]=1;
                                    ends[13]=1;
                                    break RUN;
                                  }
                                }
                                else {
                                  S99461=2;
                                  S102956=0;
                                  if(!capperStatus_o.isPartnerPresent() || capperStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 242, column: 3
                                    capperStatus_o.setREQ(false);//sysj\controller.sysj line: 242, column: 3
                                    S102956=1;
                                    active[13]=1;
                                    ends[13]=1;
                                    break RUN;
                                  }
                                  else {
                                    S102951=0;
                                    if(capperStatus_o.isACK()){//sysj\controller.sysj line: 242, column: 3
                                      capperStatus_o.setVal("done");//sysj\controller.sysj line: 242, column: 3
                                      S102951=1;
                                      if(!capperStatus_o.isACK()){//sysj\controller.sysj line: 242, column: 3
                                        capperStatus_o.setREQ(false);//sysj\controller.sysj line: 242, column: 3
                                        ends[13]=2;
                                        ;//sysj\controller.sysj line: 242, column: 3
                                        S99461=3;
                                        active[13]=1;
                                        ends[13]=1;
                                        break RUN;
                                      }
                                      else {
                                        active[13]=1;
                                        ends[13]=1;
                                        break RUN;
                                      }
                                    }
                                    else {
                                      active[13]=1;
                                      ends[13]=1;
                                      break RUN;
                                    }
                                  }
                                }
                              }
                            }
                            else {
                              active[13]=1;
                              ends[13]=1;
                              break RUN;
                            }
                          
                        }
                      }
                      break;
                    
                    case 1 : 
                      S99468=1;
                      S99468=0;
                      if(!capperStatus_o.isPartnerPresent() || capperStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 197, column: 4
                        capperStatus_o.setREQ(false);//sysj\controller.sysj line: 197, column: 4
                        S99468=1;
                        active[13]=1;
                        ends[13]=1;
                        break RUN;
                      }
                      else {
                        S99463=0;
                        if(capperStatus_o.isACK()){//sysj\controller.sysj line: 197, column: 4
                          capperStatus_o.setVal("busy");//sysj\controller.sysj line: 197, column: 4
                          S99463=1;
                          if(!capperStatus_o.isACK()){//sysj\controller.sysj line: 197, column: 4
                            capperStatus_o.setREQ(false);//sysj\controller.sysj line: 197, column: 4
                            ends[13]=2;
                            ;//sysj\controller.sysj line: 197, column: 4
                            S99576=1;
                            if(!bottleAtPos4.getprestatus()){//sysj\controller.sysj line: 199, column: 13
                              S99490=0;
                              if(!capperStatus_o.isPartnerPresent() || capperStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 200, column: 5
                                capperStatus_o.setREQ(false);//sysj\controller.sysj line: 200, column: 5
                                S99490=1;
                                active[13]=1;
                                ends[13]=1;
                                break RUN;
                              }
                              else {
                                S99485=0;
                                if(capperStatus_o.isACK()){//sysj\controller.sysj line: 200, column: 5
                                  capperStatus_o.setVal("idle");//sysj\controller.sysj line: 200, column: 5
                                  S99485=1;
                                  if(!capperStatus_o.isACK()){//sysj\controller.sysj line: 200, column: 5
                                    capperStatus_o.setREQ(false);//sysj\controller.sysj line: 200, column: 5
                                    ends[13]=2;
                                    ;//sysj\controller.sysj line: 200, column: 5
                                    S99576=2;
                                    if(bottleAtPos4.getprestatus()){//sysj\controller.sysj line: 203, column: 12
                                      System.out.println("Capper doing work...");//sysj\controller.sysj line: 204, column: 5
                                      thread115623(tdone,ends);
                                      thread115624(tdone,ends);
                                      thread115625(tdone,ends);
                                      thread115629(tdone,ends);
                                      int biggest115630 = 0;
                                      if(ends[14]>=biggest115630){
                                        biggest115630=ends[14];
                                      }
                                      if(ends[15]>=biggest115630){
                                        biggest115630=ends[15];
                                      }
                                      if(ends[16]>=biggest115630){
                                        biggest115630=ends[16];
                                      }
                                      if(ends[19]>=biggest115630){
                                        biggest115630=ends[19];
                                      }
                                      if(biggest115630 == 1){
                                        active[13]=1;
                                        ends[13]=1;
                                        break RUN;
                                      }
                                    }
                                    else {
                                      S99461=2;
                                      S102956=0;
                                      if(!capperStatus_o.isPartnerPresent() || capperStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 242, column: 3
                                        capperStatus_o.setREQ(false);//sysj\controller.sysj line: 242, column: 3
                                        S102956=1;
                                        active[13]=1;
                                        ends[13]=1;
                                        break RUN;
                                      }
                                      else {
                                        S102951=0;
                                        if(capperStatus_o.isACK()){//sysj\controller.sysj line: 242, column: 3
                                          capperStatus_o.setVal("done");//sysj\controller.sysj line: 242, column: 3
                                          S102951=1;
                                          if(!capperStatus_o.isACK()){//sysj\controller.sysj line: 242, column: 3
                                            capperStatus_o.setREQ(false);//sysj\controller.sysj line: 242, column: 3
                                            ends[13]=2;
                                            ;//sysj\controller.sysj line: 242, column: 3
                                            S99461=3;
                                            active[13]=1;
                                            ends[13]=1;
                                            break RUN;
                                          }
                                          else {
                                            active[13]=1;
                                            ends[13]=1;
                                            break RUN;
                                          }
                                        }
                                        else {
                                          active[13]=1;
                                          ends[13]=1;
                                          break RUN;
                                        }
                                      }
                                    }
                                  }
                                  else {
                                    active[13]=1;
                                    ends[13]=1;
                                    break RUN;
                                  }
                                }
                                else {
                                  active[13]=1;
                                  ends[13]=1;
                                  break RUN;
                                }
                              }
                            }
                            else {
                              S99576=2;
                              if(bottleAtPos4.getprestatus()){//sysj\controller.sysj line: 203, column: 12
                                System.out.println("Capper doing work...");//sysj\controller.sysj line: 204, column: 5
                                thread115631(tdone,ends);
                                thread115632(tdone,ends);
                                thread115633(tdone,ends);
                                thread115637(tdone,ends);
                                int biggest115638 = 0;
                                if(ends[14]>=biggest115638){
                                  biggest115638=ends[14];
                                }
                                if(ends[15]>=biggest115638){
                                  biggest115638=ends[15];
                                }
                                if(ends[16]>=biggest115638){
                                  biggest115638=ends[16];
                                }
                                if(ends[19]>=biggest115638){
                                  biggest115638=ends[19];
                                }
                                if(biggest115638 == 1){
                                  active[13]=1;
                                  ends[13]=1;
                                  break RUN;
                                }
                              }
                              else {
                                S99461=2;
                                S102956=0;
                                if(!capperStatus_o.isPartnerPresent() || capperStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 242, column: 3
                                  capperStatus_o.setREQ(false);//sysj\controller.sysj line: 242, column: 3
                                  S102956=1;
                                  active[13]=1;
                                  ends[13]=1;
                                  break RUN;
                                }
                                else {
                                  S102951=0;
                                  if(capperStatus_o.isACK()){//sysj\controller.sysj line: 242, column: 3
                                    capperStatus_o.setVal("done");//sysj\controller.sysj line: 242, column: 3
                                    S102951=1;
                                    if(!capperStatus_o.isACK()){//sysj\controller.sysj line: 242, column: 3
                                      capperStatus_o.setREQ(false);//sysj\controller.sysj line: 242, column: 3
                                      ends[13]=2;
                                      ;//sysj\controller.sysj line: 242, column: 3
                                      S99461=3;
                                      active[13]=1;
                                      ends[13]=1;
                                      break RUN;
                                    }
                                    else {
                                      active[13]=1;
                                      ends[13]=1;
                                      break RUN;
                                    }
                                  }
                                  else {
                                    active[13]=1;
                                    ends[13]=1;
                                    break RUN;
                                  }
                                }
                              }
                            }
                          }
                          else {
                            active[13]=1;
                            ends[13]=1;
                            break RUN;
                          }
                        }
                        else {
                          active[13]=1;
                          ends[13]=1;
                          break RUN;
                        }
                      }
                    
                  }
                  break;
                
                case 1 : 
                  switch(S99490){
                    case 0 : 
                      if(!capperStatus_o.isPartnerPresent() || capperStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 200, column: 5
                        capperStatus_o.setREQ(false);//sysj\controller.sysj line: 200, column: 5
                        S99490=1;
                        active[13]=1;
                        ends[13]=1;
                        break RUN;
                      }
                      else {
                        switch(S99485){
                          case 0 : 
                            if(capperStatus_o.isACK()){//sysj\controller.sysj line: 200, column: 5
                              capperStatus_o.setVal("idle");//sysj\controller.sysj line: 200, column: 5
                              S99485=1;
                              if(!capperStatus_o.isACK()){//sysj\controller.sysj line: 200, column: 5
                                capperStatus_o.setREQ(false);//sysj\controller.sysj line: 200, column: 5
                                ends[13]=2;
                                ;//sysj\controller.sysj line: 200, column: 5
                                S99576=2;
                                if(bottleAtPos4.getprestatus()){//sysj\controller.sysj line: 203, column: 12
                                  System.out.println("Capper doing work...");//sysj\controller.sysj line: 204, column: 5
                                  thread115639(tdone,ends);
                                  thread115640(tdone,ends);
                                  thread115641(tdone,ends);
                                  thread115645(tdone,ends);
                                  int biggest115646 = 0;
                                  if(ends[14]>=biggest115646){
                                    biggest115646=ends[14];
                                  }
                                  if(ends[15]>=biggest115646){
                                    biggest115646=ends[15];
                                  }
                                  if(ends[16]>=biggest115646){
                                    biggest115646=ends[16];
                                  }
                                  if(ends[19]>=biggest115646){
                                    biggest115646=ends[19];
                                  }
                                  if(biggest115646 == 1){
                                    active[13]=1;
                                    ends[13]=1;
                                    break RUN;
                                  }
                                }
                                else {
                                  S99461=2;
                                  S102956=0;
                                  if(!capperStatus_o.isPartnerPresent() || capperStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 242, column: 3
                                    capperStatus_o.setREQ(false);//sysj\controller.sysj line: 242, column: 3
                                    S102956=1;
                                    active[13]=1;
                                    ends[13]=1;
                                    break RUN;
                                  }
                                  else {
                                    S102951=0;
                                    if(capperStatus_o.isACK()){//sysj\controller.sysj line: 242, column: 3
                                      capperStatus_o.setVal("done");//sysj\controller.sysj line: 242, column: 3
                                      S102951=1;
                                      if(!capperStatus_o.isACK()){//sysj\controller.sysj line: 242, column: 3
                                        capperStatus_o.setREQ(false);//sysj\controller.sysj line: 242, column: 3
                                        ends[13]=2;
                                        ;//sysj\controller.sysj line: 242, column: 3
                                        S99461=3;
                                        active[13]=1;
                                        ends[13]=1;
                                        break RUN;
                                      }
                                      else {
                                        active[13]=1;
                                        ends[13]=1;
                                        break RUN;
                                      }
                                    }
                                    else {
                                      active[13]=1;
                                      ends[13]=1;
                                      break RUN;
                                    }
                                  }
                                }
                              }
                              else {
                                active[13]=1;
                                ends[13]=1;
                                break RUN;
                              }
                            }
                            else {
                              active[13]=1;
                              ends[13]=1;
                              break RUN;
                            }
                          
                          case 1 : 
                            if(!capperStatus_o.isACK()){//sysj\controller.sysj line: 200, column: 5
                              capperStatus_o.setREQ(false);//sysj\controller.sysj line: 200, column: 5
                              ends[13]=2;
                              ;//sysj\controller.sysj line: 200, column: 5
                              S99576=2;
                              if(bottleAtPos4.getprestatus()){//sysj\controller.sysj line: 203, column: 12
                                System.out.println("Capper doing work...");//sysj\controller.sysj line: 204, column: 5
                                thread115647(tdone,ends);
                                thread115648(tdone,ends);
                                thread115649(tdone,ends);
                                thread115653(tdone,ends);
                                int biggest115654 = 0;
                                if(ends[14]>=biggest115654){
                                  biggest115654=ends[14];
                                }
                                if(ends[15]>=biggest115654){
                                  biggest115654=ends[15];
                                }
                                if(ends[16]>=biggest115654){
                                  biggest115654=ends[16];
                                }
                                if(ends[19]>=biggest115654){
                                  biggest115654=ends[19];
                                }
                                if(biggest115654 == 1){
                                  active[13]=1;
                                  ends[13]=1;
                                  break RUN;
                                }
                              }
                              else {
                                S99461=2;
                                S102956=0;
                                if(!capperStatus_o.isPartnerPresent() || capperStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 242, column: 3
                                  capperStatus_o.setREQ(false);//sysj\controller.sysj line: 242, column: 3
                                  S102956=1;
                                  active[13]=1;
                                  ends[13]=1;
                                  break RUN;
                                }
                                else {
                                  S102951=0;
                                  if(capperStatus_o.isACK()){//sysj\controller.sysj line: 242, column: 3
                                    capperStatus_o.setVal("done");//sysj\controller.sysj line: 242, column: 3
                                    S102951=1;
                                    if(!capperStatus_o.isACK()){//sysj\controller.sysj line: 242, column: 3
                                      capperStatus_o.setREQ(false);//sysj\controller.sysj line: 242, column: 3
                                      ends[13]=2;
                                      ;//sysj\controller.sysj line: 242, column: 3
                                      S99461=3;
                                      active[13]=1;
                                      ends[13]=1;
                                      break RUN;
                                    }
                                    else {
                                      active[13]=1;
                                      ends[13]=1;
                                      break RUN;
                                    }
                                  }
                                  else {
                                    active[13]=1;
                                    ends[13]=1;
                                    break RUN;
                                  }
                                }
                              }
                            }
                            else {
                              active[13]=1;
                              ends[13]=1;
                              break RUN;
                            }
                          
                        }
                      }
                      break;
                    
                    case 1 : 
                      S99490=1;
                      S99490=0;
                      if(!capperStatus_o.isPartnerPresent() || capperStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 200, column: 5
                        capperStatus_o.setREQ(false);//sysj\controller.sysj line: 200, column: 5
                        S99490=1;
                        active[13]=1;
                        ends[13]=1;
                        break RUN;
                      }
                      else {
                        S99485=0;
                        if(capperStatus_o.isACK()){//sysj\controller.sysj line: 200, column: 5
                          capperStatus_o.setVal("idle");//sysj\controller.sysj line: 200, column: 5
                          S99485=1;
                          if(!capperStatus_o.isACK()){//sysj\controller.sysj line: 200, column: 5
                            capperStatus_o.setREQ(false);//sysj\controller.sysj line: 200, column: 5
                            ends[13]=2;
                            ;//sysj\controller.sysj line: 200, column: 5
                            S99576=2;
                            if(bottleAtPos4.getprestatus()){//sysj\controller.sysj line: 203, column: 12
                              System.out.println("Capper doing work...");//sysj\controller.sysj line: 204, column: 5
                              thread115655(tdone,ends);
                              thread115656(tdone,ends);
                              thread115657(tdone,ends);
                              thread115661(tdone,ends);
                              int biggest115662 = 0;
                              if(ends[14]>=biggest115662){
                                biggest115662=ends[14];
                              }
                              if(ends[15]>=biggest115662){
                                biggest115662=ends[15];
                              }
                              if(ends[16]>=biggest115662){
                                biggest115662=ends[16];
                              }
                              if(ends[19]>=biggest115662){
                                biggest115662=ends[19];
                              }
                              if(biggest115662 == 1){
                                active[13]=1;
                                ends[13]=1;
                                break RUN;
                              }
                            }
                            else {
                              S99461=2;
                              S102956=0;
                              if(!capperStatus_o.isPartnerPresent() || capperStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 242, column: 3
                                capperStatus_o.setREQ(false);//sysj\controller.sysj line: 242, column: 3
                                S102956=1;
                                active[13]=1;
                                ends[13]=1;
                                break RUN;
                              }
                              else {
                                S102951=0;
                                if(capperStatus_o.isACK()){//sysj\controller.sysj line: 242, column: 3
                                  capperStatus_o.setVal("done");//sysj\controller.sysj line: 242, column: 3
                                  S102951=1;
                                  if(!capperStatus_o.isACK()){//sysj\controller.sysj line: 242, column: 3
                                    capperStatus_o.setREQ(false);//sysj\controller.sysj line: 242, column: 3
                                    ends[13]=2;
                                    ;//sysj\controller.sysj line: 242, column: 3
                                    S99461=3;
                                    active[13]=1;
                                    ends[13]=1;
                                    break RUN;
                                  }
                                  else {
                                    active[13]=1;
                                    ends[13]=1;
                                    break RUN;
                                  }
                                }
                                else {
                                  active[13]=1;
                                  ends[13]=1;
                                  break RUN;
                                }
                              }
                            }
                          }
                          else {
                            active[13]=1;
                            ends[13]=1;
                            break RUN;
                          }
                        }
                        else {
                          active[13]=1;
                          ends[13]=1;
                          break RUN;
                        }
                      }
                    
                  }
                  break;
                
                case 2 : 
                  thread115663(tdone,ends);
                  thread115664(tdone,ends);
                  thread115665(tdone,ends);
                  thread115669(tdone,ends);
                  int biggest115670 = 0;
                  if(ends[14]>=biggest115670){
                    biggest115670=ends[14];
                  }
                  if(ends[15]>=biggest115670){
                    biggest115670=ends[15];
                  }
                  if(ends[16]>=biggest115670){
                    biggest115670=ends[16];
                  }
                  if(ends[19]>=biggest115670){
                    biggest115670=ends[19];
                  }
                  if(biggest115670 == 1){
                    active[13]=1;
                    ends[13]=1;
                    break RUN;
                  }
                  //FINXME code
                  if(biggest115670 == 0){
                    S99461=2;
                    S102956=0;
                    if(!capperStatus_o.isPartnerPresent() || capperStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 242, column: 3
                      capperStatus_o.setREQ(false);//sysj\controller.sysj line: 242, column: 3
                      S102956=1;
                      active[13]=1;
                      ends[13]=1;
                      break RUN;
                    }
                    else {
                      S102951=0;
                      if(capperStatus_o.isACK()){//sysj\controller.sysj line: 242, column: 3
                        capperStatus_o.setVal("done");//sysj\controller.sysj line: 242, column: 3
                        S102951=1;
                        if(!capperStatus_o.isACK()){//sysj\controller.sysj line: 242, column: 3
                          capperStatus_o.setREQ(false);//sysj\controller.sysj line: 242, column: 3
                          ends[13]=2;
                          ;//sysj\controller.sysj line: 242, column: 3
                          S99461=3;
                          active[13]=1;
                          ends[13]=1;
                          break RUN;
                        }
                        else {
                          active[13]=1;
                          ends[13]=1;
                          break RUN;
                        }
                      }
                      else {
                        active[13]=1;
                        ends[13]=1;
                        break RUN;
                      }
                    }
                  }
                
              }
              break;
            
            case 2 : 
              switch(S102956){
                case 0 : 
                  if(!capperStatus_o.isPartnerPresent() || capperStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 242, column: 3
                    capperStatus_o.setREQ(false);//sysj\controller.sysj line: 242, column: 3
                    S102956=1;
                    active[13]=1;
                    ends[13]=1;
                    break RUN;
                  }
                  else {
                    switch(S102951){
                      case 0 : 
                        if(capperStatus_o.isACK()){//sysj\controller.sysj line: 242, column: 3
                          capperStatus_o.setVal("done");//sysj\controller.sysj line: 242, column: 3
                          S102951=1;
                          if(!capperStatus_o.isACK()){//sysj\controller.sysj line: 242, column: 3
                            capperStatus_o.setREQ(false);//sysj\controller.sysj line: 242, column: 3
                            ends[13]=2;
                            ;//sysj\controller.sysj line: 242, column: 3
                            S99461=3;
                            active[13]=1;
                            ends[13]=1;
                            break RUN;
                          }
                          else {
                            active[13]=1;
                            ends[13]=1;
                            break RUN;
                          }
                        }
                        else {
                          active[13]=1;
                          ends[13]=1;
                          break RUN;
                        }
                      
                      case 1 : 
                        if(!capperStatus_o.isACK()){//sysj\controller.sysj line: 242, column: 3
                          capperStatus_o.setREQ(false);//sysj\controller.sysj line: 242, column: 3
                          ends[13]=2;
                          ;//sysj\controller.sysj line: 242, column: 3
                          S99461=3;
                          active[13]=1;
                          ends[13]=1;
                          break RUN;
                        }
                        else {
                          active[13]=1;
                          ends[13]=1;
                          break RUN;
                        }
                      
                    }
                  }
                  break;
                
                case 1 : 
                  S102956=1;
                  S102956=0;
                  if(!capperStatus_o.isPartnerPresent() || capperStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 242, column: 3
                    capperStatus_o.setREQ(false);//sysj\controller.sysj line: 242, column: 3
                    S102956=1;
                    active[13]=1;
                    ends[13]=1;
                    break RUN;
                  }
                  else {
                    S102951=0;
                    if(capperStatus_o.isACK()){//sysj\controller.sysj line: 242, column: 3
                      capperStatus_o.setVal("done");//sysj\controller.sysj line: 242, column: 3
                      S102951=1;
                      if(!capperStatus_o.isACK()){//sysj\controller.sysj line: 242, column: 3
                        capperStatus_o.setREQ(false);//sysj\controller.sysj line: 242, column: 3
                        ends[13]=2;
                        ;//sysj\controller.sysj line: 242, column: 3
                        S99461=3;
                        active[13]=1;
                        ends[13]=1;
                        break RUN;
                      }
                      else {
                        active[13]=1;
                        ends[13]=1;
                        break RUN;
                      }
                    }
                    else {
                      active[13]=1;
                      ends[13]=1;
                      break RUN;
                    }
                  }
                
              }
              break;
            
            case 3 : 
              S99461=3;
              S99461=0;
              S99445=0;
              if(!capperReq_in.isPartnerPresent() || capperReq_in.isPartnerPreempted()){//sysj\controller.sysj line: 193, column: 3
                capperReq_in.setACK(false);//sysj\controller.sysj line: 193, column: 3
                S99445=1;
                active[13]=1;
                ends[13]=1;
                break RUN;
              }
              else {
                S99440=0;
                if(!capperReq_in.isREQ()){//sysj\controller.sysj line: 193, column: 3
                  capperReq_in.setACK(true);//sysj\controller.sysj line: 193, column: 3
                  S99440=1;
                  if(capperReq_in.isREQ()){//sysj\controller.sysj line: 193, column: 3
                    capperReq_in.setACK(false);//sysj\controller.sysj line: 193, column: 3
                    ends[13]=2;
                    ;//sysj\controller.sysj line: 193, column: 3
                    request_thread_13 = (boolean)(capperReq_in.getVal() == null ? false : ((Boolean)capperReq_in.getVal()).booleanValue());//sysj\controller.sysj line: 194, column: 3
                    S99461=1;
                    if(request_thread_13){//sysj\controller.sysj line: 196, column: 3
                      S99576=0;
                      S99468=0;
                      if(!capperStatus_o.isPartnerPresent() || capperStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 197, column: 4
                        capperStatus_o.setREQ(false);//sysj\controller.sysj line: 197, column: 4
                        S99468=1;
                        active[13]=1;
                        ends[13]=1;
                        break RUN;
                      }
                      else {
                        S99463=0;
                        if(capperStatus_o.isACK()){//sysj\controller.sysj line: 197, column: 4
                          capperStatus_o.setVal("busy");//sysj\controller.sysj line: 197, column: 4
                          S99463=1;
                          if(!capperStatus_o.isACK()){//sysj\controller.sysj line: 197, column: 4
                            capperStatus_o.setREQ(false);//sysj\controller.sysj line: 197, column: 4
                            ends[13]=2;
                            ;//sysj\controller.sysj line: 197, column: 4
                            S99576=1;
                            if(!bottleAtPos4.getprestatus()){//sysj\controller.sysj line: 199, column: 13
                              S99490=0;
                              if(!capperStatus_o.isPartnerPresent() || capperStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 200, column: 5
                                capperStatus_o.setREQ(false);//sysj\controller.sysj line: 200, column: 5
                                S99490=1;
                                active[13]=1;
                                ends[13]=1;
                                break RUN;
                              }
                              else {
                                S99485=0;
                                if(capperStatus_o.isACK()){//sysj\controller.sysj line: 200, column: 5
                                  capperStatus_o.setVal("idle");//sysj\controller.sysj line: 200, column: 5
                                  S99485=1;
                                  if(!capperStatus_o.isACK()){//sysj\controller.sysj line: 200, column: 5
                                    capperStatus_o.setREQ(false);//sysj\controller.sysj line: 200, column: 5
                                    ends[13]=2;
                                    ;//sysj\controller.sysj line: 200, column: 5
                                    S99576=2;
                                    if(bottleAtPos4.getprestatus()){//sysj\controller.sysj line: 203, column: 12
                                      System.out.println("Capper doing work...");//sysj\controller.sysj line: 204, column: 5
                                      thread115671(tdone,ends);
                                      thread115672(tdone,ends);
                                      thread115673(tdone,ends);
                                      thread115677(tdone,ends);
                                      int biggest115678 = 0;
                                      if(ends[14]>=biggest115678){
                                        biggest115678=ends[14];
                                      }
                                      if(ends[15]>=biggest115678){
                                        biggest115678=ends[15];
                                      }
                                      if(ends[16]>=biggest115678){
                                        biggest115678=ends[16];
                                      }
                                      if(ends[19]>=biggest115678){
                                        biggest115678=ends[19];
                                      }
                                      if(biggest115678 == 1){
                                        active[13]=1;
                                        ends[13]=1;
                                        break RUN;
                                      }
                                    }
                                    else {
                                      S99461=2;
                                      S102956=0;
                                      if(!capperStatus_o.isPartnerPresent() || capperStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 242, column: 3
                                        capperStatus_o.setREQ(false);//sysj\controller.sysj line: 242, column: 3
                                        S102956=1;
                                        active[13]=1;
                                        ends[13]=1;
                                        break RUN;
                                      }
                                      else {
                                        S102951=0;
                                        if(capperStatus_o.isACK()){//sysj\controller.sysj line: 242, column: 3
                                          capperStatus_o.setVal("done");//sysj\controller.sysj line: 242, column: 3
                                          S102951=1;
                                          if(!capperStatus_o.isACK()){//sysj\controller.sysj line: 242, column: 3
                                            capperStatus_o.setREQ(false);//sysj\controller.sysj line: 242, column: 3
                                            ends[13]=2;
                                            ;//sysj\controller.sysj line: 242, column: 3
                                            S99461=3;
                                            active[13]=1;
                                            ends[13]=1;
                                            break RUN;
                                          }
                                          else {
                                            active[13]=1;
                                            ends[13]=1;
                                            break RUN;
                                          }
                                        }
                                        else {
                                          active[13]=1;
                                          ends[13]=1;
                                          break RUN;
                                        }
                                      }
                                    }
                                  }
                                  else {
                                    active[13]=1;
                                    ends[13]=1;
                                    break RUN;
                                  }
                                }
                                else {
                                  active[13]=1;
                                  ends[13]=1;
                                  break RUN;
                                }
                              }
                            }
                            else {
                              S99576=2;
                              if(bottleAtPos4.getprestatus()){//sysj\controller.sysj line: 203, column: 12
                                System.out.println("Capper doing work...");//sysj\controller.sysj line: 204, column: 5
                                thread115679(tdone,ends);
                                thread115680(tdone,ends);
                                thread115681(tdone,ends);
                                thread115685(tdone,ends);
                                int biggest115686 = 0;
                                if(ends[14]>=biggest115686){
                                  biggest115686=ends[14];
                                }
                                if(ends[15]>=biggest115686){
                                  biggest115686=ends[15];
                                }
                                if(ends[16]>=biggest115686){
                                  biggest115686=ends[16];
                                }
                                if(ends[19]>=biggest115686){
                                  biggest115686=ends[19];
                                }
                                if(biggest115686 == 1){
                                  active[13]=1;
                                  ends[13]=1;
                                  break RUN;
                                }
                              }
                              else {
                                S99461=2;
                                S102956=0;
                                if(!capperStatus_o.isPartnerPresent() || capperStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 242, column: 3
                                  capperStatus_o.setREQ(false);//sysj\controller.sysj line: 242, column: 3
                                  S102956=1;
                                  active[13]=1;
                                  ends[13]=1;
                                  break RUN;
                                }
                                else {
                                  S102951=0;
                                  if(capperStatus_o.isACK()){//sysj\controller.sysj line: 242, column: 3
                                    capperStatus_o.setVal("done");//sysj\controller.sysj line: 242, column: 3
                                    S102951=1;
                                    if(!capperStatus_o.isACK()){//sysj\controller.sysj line: 242, column: 3
                                      capperStatus_o.setREQ(false);//sysj\controller.sysj line: 242, column: 3
                                      ends[13]=2;
                                      ;//sysj\controller.sysj line: 242, column: 3
                                      S99461=3;
                                      active[13]=1;
                                      ends[13]=1;
                                      break RUN;
                                    }
                                    else {
                                      active[13]=1;
                                      ends[13]=1;
                                      break RUN;
                                    }
                                  }
                                  else {
                                    active[13]=1;
                                    ends[13]=1;
                                    break RUN;
                                  }
                                }
                              }
                            }
                          }
                          else {
                            active[13]=1;
                            ends[13]=1;
                            break RUN;
                          }
                        }
                        else {
                          active[13]=1;
                          ends[13]=1;
                          break RUN;
                        }
                      }
                    }
                    else {
                      S99461=2;
                      S102956=0;
                      if(!capperStatus_o.isPartnerPresent() || capperStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 242, column: 3
                        capperStatus_o.setREQ(false);//sysj\controller.sysj line: 242, column: 3
                        S102956=1;
                        active[13]=1;
                        ends[13]=1;
                        break RUN;
                      }
                      else {
                        S102951=0;
                        if(capperStatus_o.isACK()){//sysj\controller.sysj line: 242, column: 3
                          capperStatus_o.setVal("done");//sysj\controller.sysj line: 242, column: 3
                          S102951=1;
                          if(!capperStatus_o.isACK()){//sysj\controller.sysj line: 242, column: 3
                            capperStatus_o.setREQ(false);//sysj\controller.sysj line: 242, column: 3
                            ends[13]=2;
                            ;//sysj\controller.sysj line: 242, column: 3
                            S99461=3;
                            active[13]=1;
                            ends[13]=1;
                            break RUN;
                          }
                          else {
                            active[13]=1;
                            ends[13]=1;
                            break RUN;
                          }
                        }
                        else {
                          active[13]=1;
                          ends[13]=1;
                          break RUN;
                        }
                      }
                    }
                  }
                  else {
                    active[13]=1;
                    ends[13]=1;
                    break RUN;
                  }
                }
                else {
                  active[13]=1;
                  ends[13]=1;
                  break RUN;
                }
              }
            
          }
        
      }
    }
  }

  public void init(){
    char [] active1 = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
    char [] paused1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    char [] suspended1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    paused = paused1;
    active = active1;
    suspended = suspended1;
    // Now instantiate all the local signals ONLY
    releaseCap_13 = new Signal();
    untwistGripper_13 = new Signal();
    raiseGripper_13 = new Signal();
    unclampBottle_13 = new Signal();
    // --------------------------------------------------
  }
  
  public void run(){
    while(active[13] != 0){
      int index = 13;
      if(paused[index]==1 || suspended[index]==1 || active[index] == 0){
        for(int h=1;h<paused.length;++h){
          paused[h]=0;
        }
      }
      if(paused[13]!=0 || suspended[13]!=0 || active[13]!=1);
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
      releaseCap_13.setpreclear();
      untwistGripper_13.setpreclear();
      raiseGripper_13.setpreclear();
      unclampBottle_13.setpreclear();
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
      releaseCap_13.setClear();
      untwistGripper_13.setClear();
      raiseGripper_13.setClear();
      unclampBottle_13.setClear();
      capperReq_in.sethook();
      capperStatus_o.sethook();
      if(paused[13]!=0 || suspended[13]!=0 || active[13]!=1);
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
      if(active[13] == 0){
      	this.terminated = true;
      }
      if(!threaded) break;
    }
  }
}
