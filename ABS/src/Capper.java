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
  private int S32950 = 1;
  private int S22414 = 1;
  private int S22398 = 1;
  private int S22393 = 1;
  private int S22507 = 1;
  private int S22421 = 1;
  private int S22416 = 1;
  private int S22618 = 1;
  private int S22517 = 1;
  private int S22527 = 1;
  private int S22543 = 1;
  private int S22534 = 1;
  private int S22530 = 1;
  private int S22533 = 1;
  private int S22562 = 1;
  private int S22545 = 1;
  private int S22625 = 1;
  private int S22620 = 1;
  
  private int[] ends = new int[22];
  private int[] tdone = new int[22];
  
  public void thread40631(int [] tdone, int [] ends){
        S22562=1;
    S22545=0;
    active[18]=1;
    ends[18]=1;
    tdone[18]=1;
  }

  public void thread40629(int [] tdone, int [] ends){
        S22533=1;
    active[17]=1;
    ends[17]=1;
    tdone[17]=1;
  }

  public void thread40628(int [] tdone, int [] ends){
        S22530=1;
    active[16]=1;
    ends[16]=1;
    tdone[16]=1;
  }

  public void thread40627(int [] tdone, int [] ends){
        S22543=1;
    S22534=0;
    thread40628(tdone,ends);
    thread40629(tdone,ends);
    int biggest40630 = 0;
    if(ends[16]>=biggest40630){
      biggest40630=ends[16];
    }
    if(ends[17]>=biggest40630){
      biggest40630=ends[17];
    }
    if(biggest40630 == 1){
      active[15]=1;
      ends[15]=1;
      tdone[15]=1;
    }
  }

  public void thread40626(int [] tdone, int [] ends){
        S22527=1;
    System.out.println("Capper2");//sysj\controller.sysj line: 185, column: 7
    cylPos5ZAxisExtend.setPresent();//sysj\controller.sysj line: 186, column: 7
    currsigs.addElement(cylPos5ZAxisExtend);
    active[14]=1;
    ends[14]=1;
    tdone[14]=1;
  }

  public void thread40625(int [] tdone, int [] ends){
        S22517=1;
    System.out.println("Capper1");//sysj\controller.sysj line: 178, column: 7
    cylClampBottleExtend.setPresent();//sysj\controller.sysj line: 179, column: 7
    currsigs.addElement(cylClampBottleExtend);
    active[13]=1;
    ends[13]=1;
    tdone[13]=1;
  }

  public void thread40623(int [] tdone, int [] ends){
        S22562=1;
    S22545=0;
    active[18]=1;
    ends[18]=1;
    tdone[18]=1;
  }

  public void thread40621(int [] tdone, int [] ends){
        S22533=1;
    active[17]=1;
    ends[17]=1;
    tdone[17]=1;
  }

  public void thread40620(int [] tdone, int [] ends){
        S22530=1;
    active[16]=1;
    ends[16]=1;
    tdone[16]=1;
  }

  public void thread40619(int [] tdone, int [] ends){
        S22543=1;
    S22534=0;
    thread40620(tdone,ends);
    thread40621(tdone,ends);
    int biggest40622 = 0;
    if(ends[16]>=biggest40622){
      biggest40622=ends[16];
    }
    if(ends[17]>=biggest40622){
      biggest40622=ends[17];
    }
    if(biggest40622 == 1){
      active[15]=1;
      ends[15]=1;
      tdone[15]=1;
    }
  }

  public void thread40618(int [] tdone, int [] ends){
        S22527=1;
    System.out.println("Capper2");//sysj\controller.sysj line: 185, column: 7
    cylPos5ZAxisExtend.setPresent();//sysj\controller.sysj line: 186, column: 7
    currsigs.addElement(cylPos5ZAxisExtend);
    active[14]=1;
    ends[14]=1;
    tdone[14]=1;
  }

  public void thread40617(int [] tdone, int [] ends){
        S22517=1;
    System.out.println("Capper1");//sysj\controller.sysj line: 178, column: 7
    cylClampBottleExtend.setPresent();//sysj\controller.sysj line: 179, column: 7
    currsigs.addElement(cylClampBottleExtend);
    active[13]=1;
    ends[13]=1;
    tdone[13]=1;
  }

  public void thread40615(int [] tdone, int [] ends){
        switch(S22562){
      case 0 : 
        active[18]=0;
        ends[18]=0;
        tdone[18]=1;
        break;
      
      case 1 : 
        switch(S22545){
          case 0 : 
            if(gripperGrippedCap.getprestatus()){//sysj\controller.sysj line: 200, column: 12
              System.out.println("Capper4");//sysj\controller.sysj line: 201, column: 6
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
              S22562=0;
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

  public void thread40613(int [] tdone, int [] ends){
        switch(S22533){
      case 0 : 
        active[17]=0;
        ends[17]=0;
        tdone[17]=1;
        break;
      
      case 1 : 
        if(cylClampedBottle.getprestatus()){//sysj\controller.sysj line: 192, column: 46
          S22533=0;
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

  public void thread40612(int [] tdone, int [] ends){
        switch(S22530){
      case 0 : 
        active[16]=0;
        ends[16]=0;
        tdone[16]=1;
        break;
      
      case 1 : 
        if(gripperZAxisLowered.getprestatus()){//sysj\controller.sysj line: 192, column: 13
          S22530=0;
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

  public void thread40611(int [] tdone, int [] ends){
        switch(S22543){
      case 0 : 
        active[15]=0;
        ends[15]=0;
        tdone[15]=1;
        break;
      
      case 1 : 
        switch(S22534){
          case 0 : 
            thread40612(tdone,ends);
            thread40613(tdone,ends);
            int biggest40614 = 0;
            if(ends[16]>=biggest40614){
              biggest40614=ends[16];
            }
            if(ends[17]>=biggest40614){
              biggest40614=ends[17];
            }
            if(biggest40614 == 1){
              active[15]=1;
              ends[15]=1;
              tdone[15]=1;
            }
            //FINXME code
            if(biggest40614 == 0){
              System.out.println("Capper3");//sysj\controller.sysj line: 193, column: 6
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
              S22543=0;
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

  public void thread40610(int [] tdone, int [] ends){
        switch(S22527){
      case 0 : 
        active[14]=0;
        ends[14]=0;
        tdone[14]=1;
        break;
      
      case 1 : 
        if(raiseGripper_12.getprestatus()){//sysj\controller.sysj line: 184, column: 12
          S22527=0;
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

  public void thread40609(int [] tdone, int [] ends){
        switch(S22517){
      case 0 : 
        active[13]=0;
        ends[13]=0;
        tdone[13]=1;
        break;
      
      case 1 : 
        if(unclampBottle_12.getprestatus()){//sysj\controller.sysj line: 177, column: 12
          S22517=0;
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

  public void thread40607(int [] tdone, int [] ends){
        S22562=1;
    S22545=0;
    active[18]=1;
    ends[18]=1;
    tdone[18]=1;
  }

  public void thread40605(int [] tdone, int [] ends){
        S22533=1;
    active[17]=1;
    ends[17]=1;
    tdone[17]=1;
  }

  public void thread40604(int [] tdone, int [] ends){
        S22530=1;
    active[16]=1;
    ends[16]=1;
    tdone[16]=1;
  }

  public void thread40603(int [] tdone, int [] ends){
        S22543=1;
    S22534=0;
    thread40604(tdone,ends);
    thread40605(tdone,ends);
    int biggest40606 = 0;
    if(ends[16]>=biggest40606){
      biggest40606=ends[16];
    }
    if(ends[17]>=biggest40606){
      biggest40606=ends[17];
    }
    if(biggest40606 == 1){
      active[15]=1;
      ends[15]=1;
      tdone[15]=1;
    }
  }

  public void thread40602(int [] tdone, int [] ends){
        S22527=1;
    System.out.println("Capper2");//sysj\controller.sysj line: 185, column: 7
    cylPos5ZAxisExtend.setPresent();//sysj\controller.sysj line: 186, column: 7
    currsigs.addElement(cylPos5ZAxisExtend);
    active[14]=1;
    ends[14]=1;
    tdone[14]=1;
  }

  public void thread40601(int [] tdone, int [] ends){
        S22517=1;
    System.out.println("Capper1");//sysj\controller.sysj line: 178, column: 7
    cylClampBottleExtend.setPresent();//sysj\controller.sysj line: 179, column: 7
    currsigs.addElement(cylClampBottleExtend);
    active[13]=1;
    ends[13]=1;
    tdone[13]=1;
  }

  public void thread40599(int [] tdone, int [] ends){
        S22562=1;
    S22545=0;
    active[18]=1;
    ends[18]=1;
    tdone[18]=1;
  }

  public void thread40597(int [] tdone, int [] ends){
        S22533=1;
    active[17]=1;
    ends[17]=1;
    tdone[17]=1;
  }

  public void thread40596(int [] tdone, int [] ends){
        S22530=1;
    active[16]=1;
    ends[16]=1;
    tdone[16]=1;
  }

  public void thread40595(int [] tdone, int [] ends){
        S22543=1;
    S22534=0;
    thread40596(tdone,ends);
    thread40597(tdone,ends);
    int biggest40598 = 0;
    if(ends[16]>=biggest40598){
      biggest40598=ends[16];
    }
    if(ends[17]>=biggest40598){
      biggest40598=ends[17];
    }
    if(biggest40598 == 1){
      active[15]=1;
      ends[15]=1;
      tdone[15]=1;
    }
  }

  public void thread40594(int [] tdone, int [] ends){
        S22527=1;
    System.out.println("Capper2");//sysj\controller.sysj line: 185, column: 7
    cylPos5ZAxisExtend.setPresent();//sysj\controller.sysj line: 186, column: 7
    currsigs.addElement(cylPos5ZAxisExtend);
    active[14]=1;
    ends[14]=1;
    tdone[14]=1;
  }

  public void thread40593(int [] tdone, int [] ends){
        S22517=1;
    System.out.println("Capper1");//sysj\controller.sysj line: 178, column: 7
    cylClampBottleExtend.setPresent();//sysj\controller.sysj line: 179, column: 7
    currsigs.addElement(cylClampBottleExtend);
    active[13]=1;
    ends[13]=1;
    tdone[13]=1;
  }

  public void thread40591(int [] tdone, int [] ends){
        S22562=1;
    S22545=0;
    active[18]=1;
    ends[18]=1;
    tdone[18]=1;
  }

  public void thread40589(int [] tdone, int [] ends){
        S22533=1;
    active[17]=1;
    ends[17]=1;
    tdone[17]=1;
  }

  public void thread40588(int [] tdone, int [] ends){
        S22530=1;
    active[16]=1;
    ends[16]=1;
    tdone[16]=1;
  }

  public void thread40587(int [] tdone, int [] ends){
        S22543=1;
    S22534=0;
    thread40588(tdone,ends);
    thread40589(tdone,ends);
    int biggest40590 = 0;
    if(ends[16]>=biggest40590){
      biggest40590=ends[16];
    }
    if(ends[17]>=biggest40590){
      biggest40590=ends[17];
    }
    if(biggest40590 == 1){
      active[15]=1;
      ends[15]=1;
      tdone[15]=1;
    }
  }

  public void thread40586(int [] tdone, int [] ends){
        S22527=1;
    System.out.println("Capper2");//sysj\controller.sysj line: 185, column: 7
    cylPos5ZAxisExtend.setPresent();//sysj\controller.sysj line: 186, column: 7
    currsigs.addElement(cylPos5ZAxisExtend);
    active[14]=1;
    ends[14]=1;
    tdone[14]=1;
  }

  public void thread40585(int [] tdone, int [] ends){
        S22517=1;
    System.out.println("Capper1");//sysj\controller.sysj line: 178, column: 7
    cylClampBottleExtend.setPresent();//sysj\controller.sysj line: 179, column: 7
    currsigs.addElement(cylClampBottleExtend);
    active[13]=1;
    ends[13]=1;
    tdone[13]=1;
  }

  public void thread40583(int [] tdone, int [] ends){
        S22562=1;
    S22545=0;
    active[18]=1;
    ends[18]=1;
    tdone[18]=1;
  }

  public void thread40581(int [] tdone, int [] ends){
        S22533=1;
    active[17]=1;
    ends[17]=1;
    tdone[17]=1;
  }

  public void thread40580(int [] tdone, int [] ends){
        S22530=1;
    active[16]=1;
    ends[16]=1;
    tdone[16]=1;
  }

  public void thread40579(int [] tdone, int [] ends){
        S22543=1;
    S22534=0;
    thread40580(tdone,ends);
    thread40581(tdone,ends);
    int biggest40582 = 0;
    if(ends[16]>=biggest40582){
      biggest40582=ends[16];
    }
    if(ends[17]>=biggest40582){
      biggest40582=ends[17];
    }
    if(biggest40582 == 1){
      active[15]=1;
      ends[15]=1;
      tdone[15]=1;
    }
  }

  public void thread40578(int [] tdone, int [] ends){
        S22527=1;
    System.out.println("Capper2");//sysj\controller.sysj line: 185, column: 7
    cylPos5ZAxisExtend.setPresent();//sysj\controller.sysj line: 186, column: 7
    currsigs.addElement(cylPos5ZAxisExtend);
    active[14]=1;
    ends[14]=1;
    tdone[14]=1;
  }

  public void thread40577(int [] tdone, int [] ends){
        S22517=1;
    System.out.println("Capper1");//sysj\controller.sysj line: 178, column: 7
    cylClampBottleExtend.setPresent();//sysj\controller.sysj line: 179, column: 7
    currsigs.addElement(cylClampBottleExtend);
    active[13]=1;
    ends[13]=1;
    tdone[13]=1;
  }

  public void thread40575(int [] tdone, int [] ends){
        S22562=1;
    S22545=0;
    active[18]=1;
    ends[18]=1;
    tdone[18]=1;
  }

  public void thread40573(int [] tdone, int [] ends){
        S22533=1;
    active[17]=1;
    ends[17]=1;
    tdone[17]=1;
  }

  public void thread40572(int [] tdone, int [] ends){
        S22530=1;
    active[16]=1;
    ends[16]=1;
    tdone[16]=1;
  }

  public void thread40571(int [] tdone, int [] ends){
        S22543=1;
    S22534=0;
    thread40572(tdone,ends);
    thread40573(tdone,ends);
    int biggest40574 = 0;
    if(ends[16]>=biggest40574){
      biggest40574=ends[16];
    }
    if(ends[17]>=biggest40574){
      biggest40574=ends[17];
    }
    if(biggest40574 == 1){
      active[15]=1;
      ends[15]=1;
      tdone[15]=1;
    }
  }

  public void thread40570(int [] tdone, int [] ends){
        S22527=1;
    System.out.println("Capper2");//sysj\controller.sysj line: 185, column: 7
    cylPos5ZAxisExtend.setPresent();//sysj\controller.sysj line: 186, column: 7
    currsigs.addElement(cylPos5ZAxisExtend);
    active[14]=1;
    ends[14]=1;
    tdone[14]=1;
  }

  public void thread40569(int [] tdone, int [] ends){
        S22517=1;
    System.out.println("Capper1");//sysj\controller.sysj line: 178, column: 7
    cylClampBottleExtend.setPresent();//sysj\controller.sysj line: 179, column: 7
    currsigs.addElement(cylClampBottleExtend);
    active[13]=1;
    ends[13]=1;
    tdone[13]=1;
  }

  public void thread40567(int [] tdone, int [] ends){
        S22562=1;
    S22545=0;
    active[18]=1;
    ends[18]=1;
    tdone[18]=1;
  }

  public void thread40565(int [] tdone, int [] ends){
        S22533=1;
    active[17]=1;
    ends[17]=1;
    tdone[17]=1;
  }

  public void thread40564(int [] tdone, int [] ends){
        S22530=1;
    active[16]=1;
    ends[16]=1;
    tdone[16]=1;
  }

  public void thread40563(int [] tdone, int [] ends){
        S22543=1;
    S22534=0;
    thread40564(tdone,ends);
    thread40565(tdone,ends);
    int biggest40566 = 0;
    if(ends[16]>=biggest40566){
      biggest40566=ends[16];
    }
    if(ends[17]>=biggest40566){
      biggest40566=ends[17];
    }
    if(biggest40566 == 1){
      active[15]=1;
      ends[15]=1;
      tdone[15]=1;
    }
  }

  public void thread40562(int [] tdone, int [] ends){
        S22527=1;
    System.out.println("Capper2");//sysj\controller.sysj line: 185, column: 7
    cylPos5ZAxisExtend.setPresent();//sysj\controller.sysj line: 186, column: 7
    currsigs.addElement(cylPos5ZAxisExtend);
    active[14]=1;
    ends[14]=1;
    tdone[14]=1;
  }

  public void thread40561(int [] tdone, int [] ends){
        S22517=1;
    System.out.println("Capper1");//sysj\controller.sysj line: 178, column: 7
    cylClampBottleExtend.setPresent();//sysj\controller.sysj line: 179, column: 7
    currsigs.addElement(cylClampBottleExtend);
    active[13]=1;
    ends[13]=1;
    tdone[13]=1;
  }

  public void thread40559(int [] tdone, int [] ends){
        S22562=1;
    S22545=0;
    active[18]=1;
    ends[18]=1;
    tdone[18]=1;
  }

  public void thread40557(int [] tdone, int [] ends){
        S22533=1;
    active[17]=1;
    ends[17]=1;
    tdone[17]=1;
  }

  public void thread40556(int [] tdone, int [] ends){
        S22530=1;
    active[16]=1;
    ends[16]=1;
    tdone[16]=1;
  }

  public void thread40555(int [] tdone, int [] ends){
        S22543=1;
    S22534=0;
    thread40556(tdone,ends);
    thread40557(tdone,ends);
    int biggest40558 = 0;
    if(ends[16]>=biggest40558){
      biggest40558=ends[16];
    }
    if(ends[17]>=biggest40558){
      biggest40558=ends[17];
    }
    if(biggest40558 == 1){
      active[15]=1;
      ends[15]=1;
      tdone[15]=1;
    }
  }

  public void thread40554(int [] tdone, int [] ends){
        S22527=1;
    System.out.println("Capper2");//sysj\controller.sysj line: 185, column: 7
    cylPos5ZAxisExtend.setPresent();//sysj\controller.sysj line: 186, column: 7
    currsigs.addElement(cylPos5ZAxisExtend);
    active[14]=1;
    ends[14]=1;
    tdone[14]=1;
  }

  public void thread40553(int [] tdone, int [] ends){
        S22517=1;
    System.out.println("Capper1");//sysj\controller.sysj line: 178, column: 7
    cylClampBottleExtend.setPresent();//sysj\controller.sysj line: 179, column: 7
    currsigs.addElement(cylClampBottleExtend);
    active[13]=1;
    ends[13]=1;
    tdone[13]=1;
  }

  public void thread40551(int [] tdone, int [] ends){
        S22562=1;
    S22545=0;
    active[18]=1;
    ends[18]=1;
    tdone[18]=1;
  }

  public void thread40549(int [] tdone, int [] ends){
        S22533=1;
    active[17]=1;
    ends[17]=1;
    tdone[17]=1;
  }

  public void thread40548(int [] tdone, int [] ends){
        S22530=1;
    active[16]=1;
    ends[16]=1;
    tdone[16]=1;
  }

  public void thread40547(int [] tdone, int [] ends){
        S22543=1;
    S22534=0;
    thread40548(tdone,ends);
    thread40549(tdone,ends);
    int biggest40550 = 0;
    if(ends[16]>=biggest40550){
      biggest40550=ends[16];
    }
    if(ends[17]>=biggest40550){
      biggest40550=ends[17];
    }
    if(biggest40550 == 1){
      active[15]=1;
      ends[15]=1;
      tdone[15]=1;
    }
  }

  public void thread40546(int [] tdone, int [] ends){
        S22527=1;
    System.out.println("Capper2");//sysj\controller.sysj line: 185, column: 7
    cylPos5ZAxisExtend.setPresent();//sysj\controller.sysj line: 186, column: 7
    currsigs.addElement(cylPos5ZAxisExtend);
    active[14]=1;
    ends[14]=1;
    tdone[14]=1;
  }

  public void thread40545(int [] tdone, int [] ends){
        S22517=1;
    System.out.println("Capper1");//sysj\controller.sysj line: 178, column: 7
    cylClampBottleExtend.setPresent();//sysj\controller.sysj line: 179, column: 7
    currsigs.addElement(cylClampBottleExtend);
    active[13]=1;
    ends[13]=1;
    tdone[13]=1;
  }

  public void thread40543(int [] tdone, int [] ends){
        S22562=1;
    S22545=0;
    active[18]=1;
    ends[18]=1;
    tdone[18]=1;
  }

  public void thread40541(int [] tdone, int [] ends){
        S22533=1;
    active[17]=1;
    ends[17]=1;
    tdone[17]=1;
  }

  public void thread40540(int [] tdone, int [] ends){
        S22530=1;
    active[16]=1;
    ends[16]=1;
    tdone[16]=1;
  }

  public void thread40539(int [] tdone, int [] ends){
        S22543=1;
    S22534=0;
    thread40540(tdone,ends);
    thread40541(tdone,ends);
    int biggest40542 = 0;
    if(ends[16]>=biggest40542){
      biggest40542=ends[16];
    }
    if(ends[17]>=biggest40542){
      biggest40542=ends[17];
    }
    if(biggest40542 == 1){
      active[15]=1;
      ends[15]=1;
      tdone[15]=1;
    }
  }

  public void thread40538(int [] tdone, int [] ends){
        S22527=1;
    System.out.println("Capper2");//sysj\controller.sysj line: 185, column: 7
    cylPos5ZAxisExtend.setPresent();//sysj\controller.sysj line: 186, column: 7
    currsigs.addElement(cylPos5ZAxisExtend);
    active[14]=1;
    ends[14]=1;
    tdone[14]=1;
  }

  public void thread40537(int [] tdone, int [] ends){
        S22517=1;
    System.out.println("Capper1");//sysj\controller.sysj line: 178, column: 7
    cylClampBottleExtend.setPresent();//sysj\controller.sysj line: 179, column: 7
    currsigs.addElement(cylClampBottleExtend);
    active[13]=1;
    ends[13]=1;
    tdone[13]=1;
  }

  public void thread40535(int [] tdone, int [] ends){
        S22562=1;
    S22545=0;
    active[18]=1;
    ends[18]=1;
    tdone[18]=1;
  }

  public void thread40533(int [] tdone, int [] ends){
        S22533=1;
    active[17]=1;
    ends[17]=1;
    tdone[17]=1;
  }

  public void thread40532(int [] tdone, int [] ends){
        S22530=1;
    active[16]=1;
    ends[16]=1;
    tdone[16]=1;
  }

  public void thread40531(int [] tdone, int [] ends){
        S22543=1;
    S22534=0;
    thread40532(tdone,ends);
    thread40533(tdone,ends);
    int biggest40534 = 0;
    if(ends[16]>=biggest40534){
      biggest40534=ends[16];
    }
    if(ends[17]>=biggest40534){
      biggest40534=ends[17];
    }
    if(biggest40534 == 1){
      active[15]=1;
      ends[15]=1;
      tdone[15]=1;
    }
  }

  public void thread40530(int [] tdone, int [] ends){
        S22527=1;
    System.out.println("Capper2");//sysj\controller.sysj line: 185, column: 7
    cylPos5ZAxisExtend.setPresent();//sysj\controller.sysj line: 186, column: 7
    currsigs.addElement(cylPos5ZAxisExtend);
    active[14]=1;
    ends[14]=1;
    tdone[14]=1;
  }

  public void thread40529(int [] tdone, int [] ends){
        S22517=1;
    System.out.println("Capper1");//sysj\controller.sysj line: 178, column: 7
    cylClampBottleExtend.setPresent();//sysj\controller.sysj line: 179, column: 7
    currsigs.addElement(cylClampBottleExtend);
    active[13]=1;
    ends[13]=1;
    tdone[13]=1;
  }

  public void thread40527(int [] tdone, int [] ends){
        S22562=1;
    S22545=0;
    active[18]=1;
    ends[18]=1;
    tdone[18]=1;
  }

  public void thread40525(int [] tdone, int [] ends){
        S22533=1;
    active[17]=1;
    ends[17]=1;
    tdone[17]=1;
  }

  public void thread40524(int [] tdone, int [] ends){
        S22530=1;
    active[16]=1;
    ends[16]=1;
    tdone[16]=1;
  }

  public void thread40523(int [] tdone, int [] ends){
        S22543=1;
    S22534=0;
    thread40524(tdone,ends);
    thread40525(tdone,ends);
    int biggest40526 = 0;
    if(ends[16]>=biggest40526){
      biggest40526=ends[16];
    }
    if(ends[17]>=biggest40526){
      biggest40526=ends[17];
    }
    if(biggest40526 == 1){
      active[15]=1;
      ends[15]=1;
      tdone[15]=1;
    }
  }

  public void thread40522(int [] tdone, int [] ends){
        S22527=1;
    System.out.println("Capper2");//sysj\controller.sysj line: 185, column: 7
    cylPos5ZAxisExtend.setPresent();//sysj\controller.sysj line: 186, column: 7
    currsigs.addElement(cylPos5ZAxisExtend);
    active[14]=1;
    ends[14]=1;
    tdone[14]=1;
  }

  public void thread40521(int [] tdone, int [] ends){
        S22517=1;
    System.out.println("Capper1");//sysj\controller.sysj line: 178, column: 7
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
      switch(S32950){
        case 0 : 
          S32950=0;
          break RUN;
        
        case 1 : 
          S32950=2;
          S32950=2;
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
                            S22618=0;
                            thread40521(tdone,ends);
                            thread40522(tdone,ends);
                            thread40523(tdone,ends);
                            thread40527(tdone,ends);
                            int biggest40528 = 0;
                            if(ends[13]>=biggest40528){
                              biggest40528=ends[13];
                            }
                            if(ends[14]>=biggest40528){
                              biggest40528=ends[14];
                            }
                            if(ends[15]>=biggest40528){
                              biggest40528=ends[15];
                            }
                            if(ends[18]>=biggest40528){
                              biggest40528=ends[18];
                            }
                            if(biggest40528 == 1){
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
                      S22618=0;
                      thread40529(tdone,ends);
                      thread40530(tdone,ends);
                      thread40531(tdone,ends);
                      thread40535(tdone,ends);
                      int biggest40536 = 0;
                      if(ends[13]>=biggest40536){
                        biggest40536=ends[13];
                      }
                      if(ends[14]>=biggest40536){
                        biggest40536=ends[14];
                      }
                      if(ends[15]>=biggest40536){
                        biggest40536=ends[15];
                      }
                      if(ends[18]>=biggest40536){
                        biggest40536=ends[18];
                      }
                      if(biggest40536 == 1){
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
                                        S22618=0;
                                        thread40537(tdone,ends);
                                        thread40538(tdone,ends);
                                        thread40539(tdone,ends);
                                        thread40543(tdone,ends);
                                        int biggest40544 = 0;
                                        if(ends[13]>=biggest40544){
                                          biggest40544=ends[13];
                                        }
                                        if(ends[14]>=biggest40544){
                                          biggest40544=ends[14];
                                        }
                                        if(ends[15]>=biggest40544){
                                          biggest40544=ends[15];
                                        }
                                        if(ends[18]>=biggest40544){
                                          biggest40544=ends[18];
                                        }
                                        if(biggest40544 == 1){
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
                                  S22618=0;
                                  thread40545(tdone,ends);
                                  thread40546(tdone,ends);
                                  thread40547(tdone,ends);
                                  thread40551(tdone,ends);
                                  int biggest40552 = 0;
                                  if(ends[13]>=biggest40552){
                                    biggest40552=ends[13];
                                  }
                                  if(ends[14]>=biggest40552){
                                    biggest40552=ends[14];
                                  }
                                  if(ends[15]>=biggest40552){
                                    biggest40552=ends[15];
                                  }
                                  if(ends[18]>=biggest40552){
                                    biggest40552=ends[18];
                                  }
                                  if(biggest40552 == 1){
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
                                      S22618=0;
                                      thread40553(tdone,ends);
                                      thread40554(tdone,ends);
                                      thread40555(tdone,ends);
                                      thread40559(tdone,ends);
                                      int biggest40560 = 0;
                                      if(ends[13]>=biggest40560){
                                        biggest40560=ends[13];
                                      }
                                      if(ends[14]>=biggest40560){
                                        biggest40560=ends[14];
                                      }
                                      if(ends[15]>=biggest40560){
                                        biggest40560=ends[15];
                                      }
                                      if(ends[18]>=biggest40560){
                                        biggest40560=ends[18];
                                      }
                                      if(biggest40560 == 1){
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
                                S22618=0;
                                thread40561(tdone,ends);
                                thread40562(tdone,ends);
                                thread40563(tdone,ends);
                                thread40567(tdone,ends);
                                int biggest40568 = 0;
                                if(ends[13]>=biggest40568){
                                  biggest40568=ends[13];
                                }
                                if(ends[14]>=biggest40568){
                                  biggest40568=ends[14];
                                }
                                if(ends[15]>=biggest40568){
                                  biggest40568=ends[15];
                                }
                                if(ends[18]>=biggest40568){
                                  biggest40568=ends[18];
                                }
                                if(biggest40568 == 1){
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
                                    S22618=0;
                                    thread40569(tdone,ends);
                                    thread40570(tdone,ends);
                                    thread40571(tdone,ends);
                                    thread40575(tdone,ends);
                                    int biggest40576 = 0;
                                    if(ends[13]>=biggest40576){
                                      biggest40576=ends[13];
                                    }
                                    if(ends[14]>=biggest40576){
                                      biggest40576=ends[14];
                                    }
                                    if(ends[15]>=biggest40576){
                                      biggest40576=ends[15];
                                    }
                                    if(ends[18]>=biggest40576){
                                      biggest40576=ends[18];
                                    }
                                    if(biggest40576 == 1){
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
                              S22618=0;
                              thread40577(tdone,ends);
                              thread40578(tdone,ends);
                              thread40579(tdone,ends);
                              thread40583(tdone,ends);
                              int biggest40584 = 0;
                              if(ends[13]>=biggest40584){
                                biggest40584=ends[13];
                              }
                              if(ends[14]>=biggest40584){
                                biggest40584=ends[14];
                              }
                              if(ends[15]>=biggest40584){
                                biggest40584=ends[15];
                              }
                              if(ends[18]>=biggest40584){
                                biggest40584=ends[18];
                              }
                              if(biggest40584 == 1){
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
                                  S22618=0;
                                  thread40585(tdone,ends);
                                  thread40586(tdone,ends);
                                  thread40587(tdone,ends);
                                  thread40591(tdone,ends);
                                  int biggest40592 = 0;
                                  if(ends[13]>=biggest40592){
                                    biggest40592=ends[13];
                                  }
                                  if(ends[14]>=biggest40592){
                                    biggest40592=ends[14];
                                  }
                                  if(ends[15]>=biggest40592){
                                    biggest40592=ends[15];
                                  }
                                  if(ends[18]>=biggest40592){
                                    biggest40592=ends[18];
                                  }
                                  if(biggest40592 == 1){
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
                                S22618=0;
                                thread40593(tdone,ends);
                                thread40594(tdone,ends);
                                thread40595(tdone,ends);
                                thread40599(tdone,ends);
                                int biggest40600 = 0;
                                if(ends[13]>=biggest40600){
                                  biggest40600=ends[13];
                                }
                                if(ends[14]>=biggest40600){
                                  biggest40600=ends[14];
                                }
                                if(ends[15]>=biggest40600){
                                  biggest40600=ends[15];
                                }
                                if(ends[18]>=biggest40600){
                                  biggest40600=ends[18];
                                }
                                if(biggest40600 == 1){
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
                              S22618=0;
                              thread40601(tdone,ends);
                              thread40602(tdone,ends);
                              thread40603(tdone,ends);
                              thread40607(tdone,ends);
                              int biggest40608 = 0;
                              if(ends[13]>=biggest40608){
                                biggest40608=ends[13];
                              }
                              if(ends[14]>=biggest40608){
                                biggest40608=ends[14];
                              }
                              if(ends[15]>=biggest40608){
                                biggest40608=ends[15];
                              }
                              if(ends[18]>=biggest40608){
                                biggest40608=ends[18];
                              }
                              if(biggest40608 == 1){
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
                  switch(S22618){
                    case 0 : 
                      thread40609(tdone,ends);
                      thread40610(tdone,ends);
                      thread40611(tdone,ends);
                      thread40615(tdone,ends);
                      int biggest40616 = 0;
                      if(ends[13]>=biggest40616){
                        biggest40616=ends[13];
                      }
                      if(ends[14]>=biggest40616){
                        biggest40616=ends[14];
                      }
                      if(ends[15]>=biggest40616){
                        biggest40616=ends[15];
                      }
                      if(ends[18]>=biggest40616){
                        biggest40616=ends[18];
                      }
                      if(biggest40616 == 1){
                        active[12]=1;
                        ends[12]=1;
                        break RUN;
                      }
                      //FINXME code
                      if(biggest40616 == 0){
                        S22618=1;
                        S22625=0;
                        if(!capperStatus_o.isPartnerPresent() || capperStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 214, column: 5
                          capperStatus_o.setREQ(false);//sysj\controller.sysj line: 214, column: 5
                          S22625=1;
                          active[12]=1;
                          ends[12]=1;
                          break RUN;
                        }
                        else {
                          S22620=0;
                          if(capperStatus_o.isACK()){//sysj\controller.sysj line: 214, column: 5
                            capperStatus_o.setVal("done");//sysj\controller.sysj line: 214, column: 5
                            S22620=1;
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
                      switch(S22625){
                        case 0 : 
                          if(!capperStatus_o.isPartnerPresent() || capperStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 214, column: 5
                            capperStatus_o.setREQ(false);//sysj\controller.sysj line: 214, column: 5
                            S22625=1;
                            active[12]=1;
                            ends[12]=1;
                            break RUN;
                          }
                          else {
                            switch(S22620){
                              case 0 : 
                                if(capperStatus_o.isACK()){//sysj\controller.sysj line: 214, column: 5
                                  capperStatus_o.setVal("done");//sysj\controller.sysj line: 214, column: 5
                                  S22620=1;
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
                          S22625=1;
                          S22625=0;
                          if(!capperStatus_o.isPartnerPresent() || capperStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 214, column: 5
                            capperStatus_o.setREQ(false);//sysj\controller.sysj line: 214, column: 5
                            S22625=1;
                            active[12]=1;
                            ends[12]=1;
                            break RUN;
                          }
                          else {
                            S22620=0;
                            if(capperStatus_o.isACK()){//sysj\controller.sysj line: 214, column: 5
                              capperStatus_o.setVal("done");//sysj\controller.sysj line: 214, column: 5
                              S22620=1;
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
                                S22618=0;
                                thread40617(tdone,ends);
                                thread40618(tdone,ends);
                                thread40619(tdone,ends);
                                thread40623(tdone,ends);
                                int biggest40624 = 0;
                                if(ends[13]>=biggest40624){
                                  biggest40624=ends[13];
                                }
                                if(ends[14]>=biggest40624){
                                  biggest40624=ends[14];
                                }
                                if(ends[15]>=biggest40624){
                                  biggest40624=ends[15];
                                }
                                if(ends[18]>=biggest40624){
                                  biggest40624=ends[18];
                                }
                                if(biggest40624 == 1){
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
                          S22618=0;
                          thread40625(tdone,ends);
                          thread40626(tdone,ends);
                          thread40627(tdone,ends);
                          thread40631(tdone,ends);
                          int biggest40632 = 0;
                          if(ends[13]>=biggest40632){
                            biggest40632=ends[13];
                          }
                          if(ends[14]>=biggest40632){
                            biggest40632=ends[14];
                          }
                          if(ends[15]>=biggest40632){
                            biggest40632=ends[15];
                          }
                          if(ends[18]>=biggest40632){
                            biggest40632=ends[18];
                          }
                          if(biggest40632 == 1){
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
