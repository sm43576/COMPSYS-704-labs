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
  private Signal untwistGripper_12;
  private Signal raiseGripper_12;
  private Signal unclampBottle_12;
  private boolean request_thread_12;//sysj\controller.sysj line: 164, column: 3
  private int S32951 = 1;
  private int S22415 = 1;
  private int S22399 = 1;
  private int S22394 = 1;
  private int S22508 = 1;
  private int S22422 = 1;
  private int S22417 = 1;
  private int S22619 = 1;
  private int S22518 = 1;
  private int S22528 = 1;
  private int S22544 = 1;
  private int S22535 = 1;
  private int S22531 = 1;
  private int S22534 = 1;
  private int S22563 = 1;
  private int S22546 = 1;
  private int S22626 = 1;
  private int S22621 = 1;
  
  private int[] ends = new int[22];
  private int[] tdone = new int[22];
  
  public void thread40632(int [] tdone, int [] ends){
        S22563=1;
    S22546=0;
    active[18]=1;
    ends[18]=1;
    tdone[18]=1;
  }

  public void thread40630(int [] tdone, int [] ends){
        S22534=1;
    active[17]=1;
    ends[17]=1;
    tdone[17]=1;
  }

  public void thread40629(int [] tdone, int [] ends){
        S22531=1;
    active[16]=1;
    ends[16]=1;
    tdone[16]=1;
  }

  public void thread40628(int [] tdone, int [] ends){
        S22544=1;
    S22535=0;
    thread40629(tdone,ends);
    thread40630(tdone,ends);
    int biggest40631 = 0;
    if(ends[16]>=biggest40631){
      biggest40631=ends[16];
    }
    if(ends[17]>=biggest40631){
      biggest40631=ends[17];
    }
    if(biggest40631 == 1){
      active[15]=1;
      ends[15]=1;
      tdone[15]=1;
    }
  }

  public void thread40627(int [] tdone, int [] ends){
        S22528=1;
    System.out.println("Capper2");//sysj\controller.sysj line: 185, column: 7
    cylPos5ZAxisExtend.setPresent();//sysj\controller.sysj line: 186, column: 7
    currsigs.addElement(cylPos5ZAxisExtend);
    active[14]=1;
    ends[14]=1;
    tdone[14]=1;
  }

  public void thread40626(int [] tdone, int [] ends){
        S22518=1;
    System.out.println("Capper1");//sysj\controller.sysj line: 178, column: 7
    cylClampBottleExtend.setPresent();//sysj\controller.sysj line: 179, column: 7
    currsigs.addElement(cylClampBottleExtend);
    active[13]=1;
    ends[13]=1;
    tdone[13]=1;
  }

  public void thread40624(int [] tdone, int [] ends){
        S22563=1;
    S22546=0;
    active[18]=1;
    ends[18]=1;
    tdone[18]=1;
  }

  public void thread40622(int [] tdone, int [] ends){
        S22534=1;
    active[17]=1;
    ends[17]=1;
    tdone[17]=1;
  }

  public void thread40621(int [] tdone, int [] ends){
        S22531=1;
    active[16]=1;
    ends[16]=1;
    tdone[16]=1;
  }

  public void thread40620(int [] tdone, int [] ends){
        S22544=1;
    S22535=0;
    thread40621(tdone,ends);
    thread40622(tdone,ends);
    int biggest40623 = 0;
    if(ends[16]>=biggest40623){
      biggest40623=ends[16];
    }
    if(ends[17]>=biggest40623){
      biggest40623=ends[17];
    }
    if(biggest40623 == 1){
      active[15]=1;
      ends[15]=1;
      tdone[15]=1;
    }
  }

  public void thread40619(int [] tdone, int [] ends){
        S22528=1;
    System.out.println("Capper2");//sysj\controller.sysj line: 185, column: 7
    cylPos5ZAxisExtend.setPresent();//sysj\controller.sysj line: 186, column: 7
    currsigs.addElement(cylPos5ZAxisExtend);
    active[14]=1;
    ends[14]=1;
    tdone[14]=1;
  }

  public void thread40618(int [] tdone, int [] ends){
        S22518=1;
    System.out.println("Capper1");//sysj\controller.sysj line: 178, column: 7
    cylClampBottleExtend.setPresent();//sysj\controller.sysj line: 179, column: 7
    currsigs.addElement(cylClampBottleExtend);
    active[13]=1;
    ends[13]=1;
    tdone[13]=1;
  }

  public void thread40616(int [] tdone, int [] ends){
        switch(S22563){
      case 0 : 
        active[18]=0;
        ends[18]=0;
        tdone[18]=1;
        break;
      
      case 1 : 
        switch(S22546){
          case 0 : 
            if(gripperGrippedCap.getprestatus()){//sysj\controller.sysj line: 200, column: 12
              System.out.println("Capper4");//sysj\controller.sysj line: 201, column: 6
              S22546=1;
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
            if(gripperTurnFinalPos.getprestatus()){//sysj\controller.sysj line: 202, column: 13
              releaseCap_12.setPresent();//sysj\controller.sysj line: 205, column: 6
              currsigs.addElement(releaseCap_12);
              S22546=2;
              untwistGripper_12.setPresent();//sysj\controller.sysj line: 208, column: 7
              currsigs.addElement(untwistGripper_12);
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
            if(gripperTurnHomePos.getprestatus()){//sysj\controller.sysj line: 207, column: 13
              raiseGripper_12.setPresent();//sysj\controller.sysj line: 211, column: 6
              currsigs.addElement(raiseGripper_12);
              unclampBottle_12.setPresent();//sysj\controller.sysj line: 212, column: 6
              currsigs.addElement(unclampBottle_12);
              S22563=0;
              active[18]=0;
              ends[18]=0;
              tdone[18]=1;
            }
            else {
              untwistGripper_12.setPresent();//sysj\controller.sysj line: 208, column: 7
              currsigs.addElement(untwistGripper_12);
              active[18]=1;
              ends[18]=1;
              tdone[18]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread40614(int [] tdone, int [] ends){
        switch(S22534){
      case 0 : 
        active[17]=0;
        ends[17]=0;
        tdone[17]=1;
        break;
      
      case 1 : 
        if(cylClampedBottle.getprestatus()){//sysj\controller.sysj line: 192, column: 46
          S22534=0;
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

  public void thread40613(int [] tdone, int [] ends){
        switch(S22531){
      case 0 : 
        active[16]=0;
        ends[16]=0;
        tdone[16]=1;
        break;
      
      case 1 : 
        if(gripperZAxisLowered.getprestatus()){//sysj\controller.sysj line: 192, column: 13
          S22531=0;
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

  public void thread40612(int [] tdone, int [] ends){
        switch(S22544){
      case 0 : 
        active[15]=0;
        ends[15]=0;
        tdone[15]=1;
        break;
      
      case 1 : 
        switch(S22535){
          case 0 : 
            thread40613(tdone,ends);
            thread40614(tdone,ends);
            int biggest40615 = 0;
            if(ends[16]>=biggest40615){
              biggest40615=ends[16];
            }
            if(ends[17]>=biggest40615){
              biggest40615=ends[17];
            }
            if(biggest40615 == 1){
              active[15]=1;
              ends[15]=1;
              tdone[15]=1;
            }
            //FINXME code
            if(biggest40615 == 0){
              System.out.println("Capper3");//sysj\controller.sysj line: 193, column: 6
              S22535=1;
              capGripperPos5Extend.setPresent();//sysj\controller.sysj line: 195, column: 7
              currsigs.addElement(capGripperPos5Extend);
              active[15]=1;
              ends[15]=1;
              tdone[15]=1;
            }
            break;
          
          case 1 : 
            if(releaseCap_12.getprestatus()){//sysj\controller.sysj line: 194, column: 12
              S22544=0;
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

  public void thread40611(int [] tdone, int [] ends){
        switch(S22528){
      case 0 : 
        active[14]=0;
        ends[14]=0;
        tdone[14]=1;
        break;
      
      case 1 : 
        if(raiseGripper_12.getprestatus()){//sysj\controller.sysj line: 184, column: 12
          S22528=0;
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

  public void thread40610(int [] tdone, int [] ends){
        switch(S22518){
      case 0 : 
        active[13]=0;
        ends[13]=0;
        tdone[13]=1;
        break;
      
      case 1 : 
        if(unclampBottle_12.getprestatus()){//sysj\controller.sysj line: 177, column: 12
          S22518=0;
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

  public void thread40608(int [] tdone, int [] ends){
        S22563=1;
    S22546=0;
    active[18]=1;
    ends[18]=1;
    tdone[18]=1;
  }

  public void thread40606(int [] tdone, int [] ends){
        S22534=1;
    active[17]=1;
    ends[17]=1;
    tdone[17]=1;
  }

  public void thread40605(int [] tdone, int [] ends){
        S22531=1;
    active[16]=1;
    ends[16]=1;
    tdone[16]=1;
  }

  public void thread40604(int [] tdone, int [] ends){
        S22544=1;
    S22535=0;
    thread40605(tdone,ends);
    thread40606(tdone,ends);
    int biggest40607 = 0;
    if(ends[16]>=biggest40607){
      biggest40607=ends[16];
    }
    if(ends[17]>=biggest40607){
      biggest40607=ends[17];
    }
    if(biggest40607 == 1){
      active[15]=1;
      ends[15]=1;
      tdone[15]=1;
    }
  }

  public void thread40603(int [] tdone, int [] ends){
        S22528=1;
    System.out.println("Capper2");//sysj\controller.sysj line: 185, column: 7
    cylPos5ZAxisExtend.setPresent();//sysj\controller.sysj line: 186, column: 7
    currsigs.addElement(cylPos5ZAxisExtend);
    active[14]=1;
    ends[14]=1;
    tdone[14]=1;
  }

  public void thread40602(int [] tdone, int [] ends){
        S22518=1;
    System.out.println("Capper1");//sysj\controller.sysj line: 178, column: 7
    cylClampBottleExtend.setPresent();//sysj\controller.sysj line: 179, column: 7
    currsigs.addElement(cylClampBottleExtend);
    active[13]=1;
    ends[13]=1;
    tdone[13]=1;
  }

  public void thread40600(int [] tdone, int [] ends){
        S22563=1;
    S22546=0;
    active[18]=1;
    ends[18]=1;
    tdone[18]=1;
  }

  public void thread40598(int [] tdone, int [] ends){
        S22534=1;
    active[17]=1;
    ends[17]=1;
    tdone[17]=1;
  }

  public void thread40597(int [] tdone, int [] ends){
        S22531=1;
    active[16]=1;
    ends[16]=1;
    tdone[16]=1;
  }

  public void thread40596(int [] tdone, int [] ends){
        S22544=1;
    S22535=0;
    thread40597(tdone,ends);
    thread40598(tdone,ends);
    int biggest40599 = 0;
    if(ends[16]>=biggest40599){
      biggest40599=ends[16];
    }
    if(ends[17]>=biggest40599){
      biggest40599=ends[17];
    }
    if(biggest40599 == 1){
      active[15]=1;
      ends[15]=1;
      tdone[15]=1;
    }
  }

  public void thread40595(int [] tdone, int [] ends){
        S22528=1;
    System.out.println("Capper2");//sysj\controller.sysj line: 185, column: 7
    cylPos5ZAxisExtend.setPresent();//sysj\controller.sysj line: 186, column: 7
    currsigs.addElement(cylPos5ZAxisExtend);
    active[14]=1;
    ends[14]=1;
    tdone[14]=1;
  }

  public void thread40594(int [] tdone, int [] ends){
        S22518=1;
    System.out.println("Capper1");//sysj\controller.sysj line: 178, column: 7
    cylClampBottleExtend.setPresent();//sysj\controller.sysj line: 179, column: 7
    currsigs.addElement(cylClampBottleExtend);
    active[13]=1;
    ends[13]=1;
    tdone[13]=1;
  }

  public void thread40592(int [] tdone, int [] ends){
        S22563=1;
    S22546=0;
    active[18]=1;
    ends[18]=1;
    tdone[18]=1;
  }

  public void thread40590(int [] tdone, int [] ends){
        S22534=1;
    active[17]=1;
    ends[17]=1;
    tdone[17]=1;
  }

  public void thread40589(int [] tdone, int [] ends){
        S22531=1;
    active[16]=1;
    ends[16]=1;
    tdone[16]=1;
  }

  public void thread40588(int [] tdone, int [] ends){
        S22544=1;
    S22535=0;
    thread40589(tdone,ends);
    thread40590(tdone,ends);
    int biggest40591 = 0;
    if(ends[16]>=biggest40591){
      biggest40591=ends[16];
    }
    if(ends[17]>=biggest40591){
      biggest40591=ends[17];
    }
    if(biggest40591 == 1){
      active[15]=1;
      ends[15]=1;
      tdone[15]=1;
    }
  }

  public void thread40587(int [] tdone, int [] ends){
        S22528=1;
    System.out.println("Capper2");//sysj\controller.sysj line: 185, column: 7
    cylPos5ZAxisExtend.setPresent();//sysj\controller.sysj line: 186, column: 7
    currsigs.addElement(cylPos5ZAxisExtend);
    active[14]=1;
    ends[14]=1;
    tdone[14]=1;
  }

  public void thread40586(int [] tdone, int [] ends){
        S22518=1;
    System.out.println("Capper1");//sysj\controller.sysj line: 178, column: 7
    cylClampBottleExtend.setPresent();//sysj\controller.sysj line: 179, column: 7
    currsigs.addElement(cylClampBottleExtend);
    active[13]=1;
    ends[13]=1;
    tdone[13]=1;
  }

  public void thread40584(int [] tdone, int [] ends){
        S22563=1;
    S22546=0;
    active[18]=1;
    ends[18]=1;
    tdone[18]=1;
  }

  public void thread40582(int [] tdone, int [] ends){
        S22534=1;
    active[17]=1;
    ends[17]=1;
    tdone[17]=1;
  }

  public void thread40581(int [] tdone, int [] ends){
        S22531=1;
    active[16]=1;
    ends[16]=1;
    tdone[16]=1;
  }

  public void thread40580(int [] tdone, int [] ends){
        S22544=1;
    S22535=0;
    thread40581(tdone,ends);
    thread40582(tdone,ends);
    int biggest40583 = 0;
    if(ends[16]>=biggest40583){
      biggest40583=ends[16];
    }
    if(ends[17]>=biggest40583){
      biggest40583=ends[17];
    }
    if(biggest40583 == 1){
      active[15]=1;
      ends[15]=1;
      tdone[15]=1;
    }
  }

  public void thread40579(int [] tdone, int [] ends){
        S22528=1;
    System.out.println("Capper2");//sysj\controller.sysj line: 185, column: 7
    cylPos5ZAxisExtend.setPresent();//sysj\controller.sysj line: 186, column: 7
    currsigs.addElement(cylPos5ZAxisExtend);
    active[14]=1;
    ends[14]=1;
    tdone[14]=1;
  }

  public void thread40578(int [] tdone, int [] ends){
        S22518=1;
    System.out.println("Capper1");//sysj\controller.sysj line: 178, column: 7
    cylClampBottleExtend.setPresent();//sysj\controller.sysj line: 179, column: 7
    currsigs.addElement(cylClampBottleExtend);
    active[13]=1;
    ends[13]=1;
    tdone[13]=1;
  }

  public void thread40576(int [] tdone, int [] ends){
        S22563=1;
    S22546=0;
    active[18]=1;
    ends[18]=1;
    tdone[18]=1;
  }

  public void thread40574(int [] tdone, int [] ends){
        S22534=1;
    active[17]=1;
    ends[17]=1;
    tdone[17]=1;
  }

  public void thread40573(int [] tdone, int [] ends){
        S22531=1;
    active[16]=1;
    ends[16]=1;
    tdone[16]=1;
  }

  public void thread40572(int [] tdone, int [] ends){
        S22544=1;
    S22535=0;
    thread40573(tdone,ends);
    thread40574(tdone,ends);
    int biggest40575 = 0;
    if(ends[16]>=biggest40575){
      biggest40575=ends[16];
    }
    if(ends[17]>=biggest40575){
      biggest40575=ends[17];
    }
    if(biggest40575 == 1){
      active[15]=1;
      ends[15]=1;
      tdone[15]=1;
    }
  }

  public void thread40571(int [] tdone, int [] ends){
        S22528=1;
    System.out.println("Capper2");//sysj\controller.sysj line: 185, column: 7
    cylPos5ZAxisExtend.setPresent();//sysj\controller.sysj line: 186, column: 7
    currsigs.addElement(cylPos5ZAxisExtend);
    active[14]=1;
    ends[14]=1;
    tdone[14]=1;
  }

  public void thread40570(int [] tdone, int [] ends){
        S22518=1;
    System.out.println("Capper1");//sysj\controller.sysj line: 178, column: 7
    cylClampBottleExtend.setPresent();//sysj\controller.sysj line: 179, column: 7
    currsigs.addElement(cylClampBottleExtend);
    active[13]=1;
    ends[13]=1;
    tdone[13]=1;
  }

  public void thread40568(int [] tdone, int [] ends){
        S22563=1;
    S22546=0;
    active[18]=1;
    ends[18]=1;
    tdone[18]=1;
  }

  public void thread40566(int [] tdone, int [] ends){
        S22534=1;
    active[17]=1;
    ends[17]=1;
    tdone[17]=1;
  }

  public void thread40565(int [] tdone, int [] ends){
        S22531=1;
    active[16]=1;
    ends[16]=1;
    tdone[16]=1;
  }

  public void thread40564(int [] tdone, int [] ends){
        S22544=1;
    S22535=0;
    thread40565(tdone,ends);
    thread40566(tdone,ends);
    int biggest40567 = 0;
    if(ends[16]>=biggest40567){
      biggest40567=ends[16];
    }
    if(ends[17]>=biggest40567){
      biggest40567=ends[17];
    }
    if(biggest40567 == 1){
      active[15]=1;
      ends[15]=1;
      tdone[15]=1;
    }
  }

  public void thread40563(int [] tdone, int [] ends){
        S22528=1;
    System.out.println("Capper2");//sysj\controller.sysj line: 185, column: 7
    cylPos5ZAxisExtend.setPresent();//sysj\controller.sysj line: 186, column: 7
    currsigs.addElement(cylPos5ZAxisExtend);
    active[14]=1;
    ends[14]=1;
    tdone[14]=1;
  }

  public void thread40562(int [] tdone, int [] ends){
        S22518=1;
    System.out.println("Capper1");//sysj\controller.sysj line: 178, column: 7
    cylClampBottleExtend.setPresent();//sysj\controller.sysj line: 179, column: 7
    currsigs.addElement(cylClampBottleExtend);
    active[13]=1;
    ends[13]=1;
    tdone[13]=1;
  }

  public void thread40560(int [] tdone, int [] ends){
        S22563=1;
    S22546=0;
    active[18]=1;
    ends[18]=1;
    tdone[18]=1;
  }

  public void thread40558(int [] tdone, int [] ends){
        S22534=1;
    active[17]=1;
    ends[17]=1;
    tdone[17]=1;
  }

  public void thread40557(int [] tdone, int [] ends){
        S22531=1;
    active[16]=1;
    ends[16]=1;
    tdone[16]=1;
  }

  public void thread40556(int [] tdone, int [] ends){
        S22544=1;
    S22535=0;
    thread40557(tdone,ends);
    thread40558(tdone,ends);
    int biggest40559 = 0;
    if(ends[16]>=biggest40559){
      biggest40559=ends[16];
    }
    if(ends[17]>=biggest40559){
      biggest40559=ends[17];
    }
    if(biggest40559 == 1){
      active[15]=1;
      ends[15]=1;
      tdone[15]=1;
    }
  }

  public void thread40555(int [] tdone, int [] ends){
        S22528=1;
    System.out.println("Capper2");//sysj\controller.sysj line: 185, column: 7
    cylPos5ZAxisExtend.setPresent();//sysj\controller.sysj line: 186, column: 7
    currsigs.addElement(cylPos5ZAxisExtend);
    active[14]=1;
    ends[14]=1;
    tdone[14]=1;
  }

  public void thread40554(int [] tdone, int [] ends){
        S22518=1;
    System.out.println("Capper1");//sysj\controller.sysj line: 178, column: 7
    cylClampBottleExtend.setPresent();//sysj\controller.sysj line: 179, column: 7
    currsigs.addElement(cylClampBottleExtend);
    active[13]=1;
    ends[13]=1;
    tdone[13]=1;
  }

  public void thread40552(int [] tdone, int [] ends){
        S22563=1;
    S22546=0;
    active[18]=1;
    ends[18]=1;
    tdone[18]=1;
  }

  public void thread40550(int [] tdone, int [] ends){
        S22534=1;
    active[17]=1;
    ends[17]=1;
    tdone[17]=1;
  }

  public void thread40549(int [] tdone, int [] ends){
        S22531=1;
    active[16]=1;
    ends[16]=1;
    tdone[16]=1;
  }

  public void thread40548(int [] tdone, int [] ends){
        S22544=1;
    S22535=0;
    thread40549(tdone,ends);
    thread40550(tdone,ends);
    int biggest40551 = 0;
    if(ends[16]>=biggest40551){
      biggest40551=ends[16];
    }
    if(ends[17]>=biggest40551){
      biggest40551=ends[17];
    }
    if(biggest40551 == 1){
      active[15]=1;
      ends[15]=1;
      tdone[15]=1;
    }
  }

  public void thread40547(int [] tdone, int [] ends){
        S22528=1;
    System.out.println("Capper2");//sysj\controller.sysj line: 185, column: 7
    cylPos5ZAxisExtend.setPresent();//sysj\controller.sysj line: 186, column: 7
    currsigs.addElement(cylPos5ZAxisExtend);
    active[14]=1;
    ends[14]=1;
    tdone[14]=1;
  }

  public void thread40546(int [] tdone, int [] ends){
        S22518=1;
    System.out.println("Capper1");//sysj\controller.sysj line: 178, column: 7
    cylClampBottleExtend.setPresent();//sysj\controller.sysj line: 179, column: 7
    currsigs.addElement(cylClampBottleExtend);
    active[13]=1;
    ends[13]=1;
    tdone[13]=1;
  }

  public void thread40544(int [] tdone, int [] ends){
        S22563=1;
    S22546=0;
    active[18]=1;
    ends[18]=1;
    tdone[18]=1;
  }

  public void thread40542(int [] tdone, int [] ends){
        S22534=1;
    active[17]=1;
    ends[17]=1;
    tdone[17]=1;
  }

  public void thread40541(int [] tdone, int [] ends){
        S22531=1;
    active[16]=1;
    ends[16]=1;
    tdone[16]=1;
  }

  public void thread40540(int [] tdone, int [] ends){
        S22544=1;
    S22535=0;
    thread40541(tdone,ends);
    thread40542(tdone,ends);
    int biggest40543 = 0;
    if(ends[16]>=biggest40543){
      biggest40543=ends[16];
    }
    if(ends[17]>=biggest40543){
      biggest40543=ends[17];
    }
    if(biggest40543 == 1){
      active[15]=1;
      ends[15]=1;
      tdone[15]=1;
    }
  }

  public void thread40539(int [] tdone, int [] ends){
        S22528=1;
    System.out.println("Capper2");//sysj\controller.sysj line: 185, column: 7
    cylPos5ZAxisExtend.setPresent();//sysj\controller.sysj line: 186, column: 7
    currsigs.addElement(cylPos5ZAxisExtend);
    active[14]=1;
    ends[14]=1;
    tdone[14]=1;
  }

  public void thread40538(int [] tdone, int [] ends){
        S22518=1;
    System.out.println("Capper1");//sysj\controller.sysj line: 178, column: 7
    cylClampBottleExtend.setPresent();//sysj\controller.sysj line: 179, column: 7
    currsigs.addElement(cylClampBottleExtend);
    active[13]=1;
    ends[13]=1;
    tdone[13]=1;
  }

  public void thread40536(int [] tdone, int [] ends){
        S22563=1;
    S22546=0;
    active[18]=1;
    ends[18]=1;
    tdone[18]=1;
  }

  public void thread40534(int [] tdone, int [] ends){
        S22534=1;
    active[17]=1;
    ends[17]=1;
    tdone[17]=1;
  }

  public void thread40533(int [] tdone, int [] ends){
        S22531=1;
    active[16]=1;
    ends[16]=1;
    tdone[16]=1;
  }

  public void thread40532(int [] tdone, int [] ends){
        S22544=1;
    S22535=0;
    thread40533(tdone,ends);
    thread40534(tdone,ends);
    int biggest40535 = 0;
    if(ends[16]>=biggest40535){
      biggest40535=ends[16];
    }
    if(ends[17]>=biggest40535){
      biggest40535=ends[17];
    }
    if(biggest40535 == 1){
      active[15]=1;
      ends[15]=1;
      tdone[15]=1;
    }
  }

  public void thread40531(int [] tdone, int [] ends){
        S22528=1;
    System.out.println("Capper2");//sysj\controller.sysj line: 185, column: 7
    cylPos5ZAxisExtend.setPresent();//sysj\controller.sysj line: 186, column: 7
    currsigs.addElement(cylPos5ZAxisExtend);
    active[14]=1;
    ends[14]=1;
    tdone[14]=1;
  }

  public void thread40530(int [] tdone, int [] ends){
        S22518=1;
    System.out.println("Capper1");//sysj\controller.sysj line: 178, column: 7
    cylClampBottleExtend.setPresent();//sysj\controller.sysj line: 179, column: 7
    currsigs.addElement(cylClampBottleExtend);
    active[13]=1;
    ends[13]=1;
    tdone[13]=1;
  }

  public void thread40528(int [] tdone, int [] ends){
        S22563=1;
    S22546=0;
    active[18]=1;
    ends[18]=1;
    tdone[18]=1;
  }

  public void thread40526(int [] tdone, int [] ends){
        S22534=1;
    active[17]=1;
    ends[17]=1;
    tdone[17]=1;
  }

  public void thread40525(int [] tdone, int [] ends){
        S22531=1;
    active[16]=1;
    ends[16]=1;
    tdone[16]=1;
  }

  public void thread40524(int [] tdone, int [] ends){
        S22544=1;
    S22535=0;
    thread40525(tdone,ends);
    thread40526(tdone,ends);
    int biggest40527 = 0;
    if(ends[16]>=biggest40527){
      biggest40527=ends[16];
    }
    if(ends[17]>=biggest40527){
      biggest40527=ends[17];
    }
    if(biggest40527 == 1){
      active[15]=1;
      ends[15]=1;
      tdone[15]=1;
    }
  }

  public void thread40523(int [] tdone, int [] ends){
        S22528=1;
    System.out.println("Capper2");//sysj\controller.sysj line: 185, column: 7
    cylPos5ZAxisExtend.setPresent();//sysj\controller.sysj line: 186, column: 7
    currsigs.addElement(cylPos5ZAxisExtend);
    active[14]=1;
    ends[14]=1;
    tdone[14]=1;
  }

  public void thread40522(int [] tdone, int [] ends){
        S22518=1;
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
      switch(S32951){
        case 0 : 
          S32951=0;
          break RUN;
        
        case 1 : 
          S32951=2;
          S32951=2;
          releaseCap_12.setClear();//sysj\controller.sysj line: 160, column: 2
          untwistGripper_12.setClear();//sysj\controller.sysj line: 160, column: 2
          raiseGripper_12.setClear();//sysj\controller.sysj line: 160, column: 2
          unclampBottle_12.setClear();//sysj\controller.sysj line: 160, column: 2
          S22415=0;
          S22399=0;
          if(!capperReq_in.isPartnerPresent() || capperReq_in.isPartnerPreempted()){//sysj\controller.sysj line: 163, column: 3
            capperReq_in.setACK(false);//sysj\controller.sysj line: 163, column: 3
            S22399=1;
            active[12]=1;
            ends[12]=1;
            break RUN;
          }
          else {
            S22394=0;
            if(!capperReq_in.isREQ()){//sysj\controller.sysj line: 163, column: 3
              capperReq_in.setACK(true);//sysj\controller.sysj line: 163, column: 3
              S22394=1;
              if(capperReq_in.isREQ()){//sysj\controller.sysj line: 163, column: 3
                capperReq_in.setACK(false);//sysj\controller.sysj line: 163, column: 3
                ends[12]=2;
                ;//sysj\controller.sysj line: 163, column: 3
                request_thread_12 = (boolean)(capperReq_in.getVal() == null ? false : ((Boolean)capperReq_in.getVal()).booleanValue());//sysj\controller.sysj line: 164, column: 3
                S22415=1;
                if(request_thread_12){//sysj\controller.sysj line: 166, column: 3
                  System.out.println("CapperController: Received request");//sysj\controller.sysj line: 167, column: 4
                  S22508=0;
                  if(!bottleAtPos4.getprestatus()){//sysj\controller.sysj line: 169, column: 12
                    System.out.println("capperidle");//sysj\controller.sysj line: 170, column: 5
                    S22422=0;
                    if(!capperStatus_o.isPartnerPresent() || capperStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 171, column: 5
                      capperStatus_o.setREQ(false);//sysj\controller.sysj line: 171, column: 5
                      S22422=1;
                      active[12]=1;
                      ends[12]=1;
                      break RUN;
                    }
                    else {
                      S22417=0;
                      if(capperStatus_o.isACK()){//sysj\controller.sysj line: 171, column: 5
                        capperStatus_o.setVal("idle");//sysj\controller.sysj line: 171, column: 5
                        S22417=1;
                        if(!capperStatus_o.isACK()){//sysj\controller.sysj line: 171, column: 5
                          capperStatus_o.setREQ(false);//sysj\controller.sysj line: 171, column: 5
                          ends[12]=2;
                          ;//sysj\controller.sysj line: 171, column: 5
                          S22508=1;
                          if(bottleAtPos4.getprestatus()){//sysj\controller.sysj line: 174, column: 12
                            System.out.println("CapperController: Capper doing work...");//sysj\controller.sysj line: 175, column: 5
                            S22619=0;
                            thread40522(tdone,ends);
                            thread40523(tdone,ends);
                            thread40524(tdone,ends);
                            thread40528(tdone,ends);
                            int biggest40529 = 0;
                            if(ends[13]>=biggest40529){
                              biggest40529=ends[13];
                            }
                            if(ends[14]>=biggest40529){
                              biggest40529=ends[14];
                            }
                            if(ends[15]>=biggest40529){
                              biggest40529=ends[15];
                            }
                            if(ends[18]>=biggest40529){
                              biggest40529=ends[18];
                            }
                            if(biggest40529 == 1){
                              active[12]=1;
                              ends[12]=1;
                              break RUN;
                            }
                          }
                          else {
                            S22415=2;
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
                    S22508=1;
                    if(bottleAtPos4.getprestatus()){//sysj\controller.sysj line: 174, column: 12
                      System.out.println("CapperController: Capper doing work...");//sysj\controller.sysj line: 175, column: 5
                      S22619=0;
                      thread40530(tdone,ends);
                      thread40531(tdone,ends);
                      thread40532(tdone,ends);
                      thread40536(tdone,ends);
                      int biggest40537 = 0;
                      if(ends[13]>=biggest40537){
                        biggest40537=ends[13];
                      }
                      if(ends[14]>=biggest40537){
                        biggest40537=ends[14];
                      }
                      if(ends[15]>=biggest40537){
                        biggest40537=ends[15];
                      }
                      if(ends[18]>=biggest40537){
                        biggest40537=ends[18];
                      }
                      if(biggest40537 == 1){
                        active[12]=1;
                        ends[12]=1;
                        break RUN;
                      }
                    }
                    else {
                      S22415=2;
                      active[12]=1;
                      ends[12]=1;
                      break RUN;
                    }
                  }
                }
                else {
                  S22415=2;
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
          untwistGripper_12.setClear();//sysj\controller.sysj line: 160, column: 2
          raiseGripper_12.setClear();//sysj\controller.sysj line: 160, column: 2
          unclampBottle_12.setClear();//sysj\controller.sysj line: 160, column: 2
          switch(S22415){
            case 0 : 
              switch(S22399){
                case 0 : 
                  if(!capperReq_in.isPartnerPresent() || capperReq_in.isPartnerPreempted()){//sysj\controller.sysj line: 163, column: 3
                    capperReq_in.setACK(false);//sysj\controller.sysj line: 163, column: 3
                    S22399=1;
                    active[12]=1;
                    ends[12]=1;
                    break RUN;
                  }
                  else {
                    switch(S22394){
                      case 0 : 
                        if(!capperReq_in.isREQ()){//sysj\controller.sysj line: 163, column: 3
                          capperReq_in.setACK(true);//sysj\controller.sysj line: 163, column: 3
                          S22394=1;
                          if(capperReq_in.isREQ()){//sysj\controller.sysj line: 163, column: 3
                            capperReq_in.setACK(false);//sysj\controller.sysj line: 163, column: 3
                            ends[12]=2;
                            ;//sysj\controller.sysj line: 163, column: 3
                            request_thread_12 = (boolean)(capperReq_in.getVal() == null ? false : ((Boolean)capperReq_in.getVal()).booleanValue());//sysj\controller.sysj line: 164, column: 3
                            S22415=1;
                            if(request_thread_12){//sysj\controller.sysj line: 166, column: 3
                              System.out.println("CapperController: Received request");//sysj\controller.sysj line: 167, column: 4
                              S22508=0;
                              if(!bottleAtPos4.getprestatus()){//sysj\controller.sysj line: 169, column: 12
                                System.out.println("capperidle");//sysj\controller.sysj line: 170, column: 5
                                S22422=0;
                                if(!capperStatus_o.isPartnerPresent() || capperStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 171, column: 5
                                  capperStatus_o.setREQ(false);//sysj\controller.sysj line: 171, column: 5
                                  S22422=1;
                                  active[12]=1;
                                  ends[12]=1;
                                  break RUN;
                                }
                                else {
                                  S22417=0;
                                  if(capperStatus_o.isACK()){//sysj\controller.sysj line: 171, column: 5
                                    capperStatus_o.setVal("idle");//sysj\controller.sysj line: 171, column: 5
                                    S22417=1;
                                    if(!capperStatus_o.isACK()){//sysj\controller.sysj line: 171, column: 5
                                      capperStatus_o.setREQ(false);//sysj\controller.sysj line: 171, column: 5
                                      ends[12]=2;
                                      ;//sysj\controller.sysj line: 171, column: 5
                                      S22508=1;
                                      if(bottleAtPos4.getprestatus()){//sysj\controller.sysj line: 174, column: 12
                                        System.out.println("CapperController: Capper doing work...");//sysj\controller.sysj line: 175, column: 5
                                        S22619=0;
                                        thread40538(tdone,ends);
                                        thread40539(tdone,ends);
                                        thread40540(tdone,ends);
                                        thread40544(tdone,ends);
                                        int biggest40545 = 0;
                                        if(ends[13]>=biggest40545){
                                          biggest40545=ends[13];
                                        }
                                        if(ends[14]>=biggest40545){
                                          biggest40545=ends[14];
                                        }
                                        if(ends[15]>=biggest40545){
                                          biggest40545=ends[15];
                                        }
                                        if(ends[18]>=biggest40545){
                                          biggest40545=ends[18];
                                        }
                                        if(biggest40545 == 1){
                                          active[12]=1;
                                          ends[12]=1;
                                          break RUN;
                                        }
                                      }
                                      else {
                                        S22415=2;
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
                                S22508=1;
                                if(bottleAtPos4.getprestatus()){//sysj\controller.sysj line: 174, column: 12
                                  System.out.println("CapperController: Capper doing work...");//sysj\controller.sysj line: 175, column: 5
                                  S22619=0;
                                  thread40546(tdone,ends);
                                  thread40547(tdone,ends);
                                  thread40548(tdone,ends);
                                  thread40552(tdone,ends);
                                  int biggest40553 = 0;
                                  if(ends[13]>=biggest40553){
                                    biggest40553=ends[13];
                                  }
                                  if(ends[14]>=biggest40553){
                                    biggest40553=ends[14];
                                  }
                                  if(ends[15]>=biggest40553){
                                    biggest40553=ends[15];
                                  }
                                  if(ends[18]>=biggest40553){
                                    biggest40553=ends[18];
                                  }
                                  if(biggest40553 == 1){
                                    active[12]=1;
                                    ends[12]=1;
                                    break RUN;
                                  }
                                }
                                else {
                                  S22415=2;
                                  active[12]=1;
                                  ends[12]=1;
                                  break RUN;
                                }
                              }
                            }
                            else {
                              S22415=2;
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
                          S22415=1;
                          if(request_thread_12){//sysj\controller.sysj line: 166, column: 3
                            System.out.println("CapperController: Received request");//sysj\controller.sysj line: 167, column: 4
                            S22508=0;
                            if(!bottleAtPos4.getprestatus()){//sysj\controller.sysj line: 169, column: 12
                              System.out.println("capperidle");//sysj\controller.sysj line: 170, column: 5
                              S22422=0;
                              if(!capperStatus_o.isPartnerPresent() || capperStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 171, column: 5
                                capperStatus_o.setREQ(false);//sysj\controller.sysj line: 171, column: 5
                                S22422=1;
                                active[12]=1;
                                ends[12]=1;
                                break RUN;
                              }
                              else {
                                S22417=0;
                                if(capperStatus_o.isACK()){//sysj\controller.sysj line: 171, column: 5
                                  capperStatus_o.setVal("idle");//sysj\controller.sysj line: 171, column: 5
                                  S22417=1;
                                  if(!capperStatus_o.isACK()){//sysj\controller.sysj line: 171, column: 5
                                    capperStatus_o.setREQ(false);//sysj\controller.sysj line: 171, column: 5
                                    ends[12]=2;
                                    ;//sysj\controller.sysj line: 171, column: 5
                                    S22508=1;
                                    if(bottleAtPos4.getprestatus()){//sysj\controller.sysj line: 174, column: 12
                                      System.out.println("CapperController: Capper doing work...");//sysj\controller.sysj line: 175, column: 5
                                      S22619=0;
                                      thread40554(tdone,ends);
                                      thread40555(tdone,ends);
                                      thread40556(tdone,ends);
                                      thread40560(tdone,ends);
                                      int biggest40561 = 0;
                                      if(ends[13]>=biggest40561){
                                        biggest40561=ends[13];
                                      }
                                      if(ends[14]>=biggest40561){
                                        biggest40561=ends[14];
                                      }
                                      if(ends[15]>=biggest40561){
                                        biggest40561=ends[15];
                                      }
                                      if(ends[18]>=biggest40561){
                                        biggest40561=ends[18];
                                      }
                                      if(biggest40561 == 1){
                                        active[12]=1;
                                        ends[12]=1;
                                        break RUN;
                                      }
                                    }
                                    else {
                                      S22415=2;
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
                              S22508=1;
                              if(bottleAtPos4.getprestatus()){//sysj\controller.sysj line: 174, column: 12
                                System.out.println("CapperController: Capper doing work...");//sysj\controller.sysj line: 175, column: 5
                                S22619=0;
                                thread40562(tdone,ends);
                                thread40563(tdone,ends);
                                thread40564(tdone,ends);
                                thread40568(tdone,ends);
                                int biggest40569 = 0;
                                if(ends[13]>=biggest40569){
                                  biggest40569=ends[13];
                                }
                                if(ends[14]>=biggest40569){
                                  biggest40569=ends[14];
                                }
                                if(ends[15]>=biggest40569){
                                  biggest40569=ends[15];
                                }
                                if(ends[18]>=biggest40569){
                                  biggest40569=ends[18];
                                }
                                if(biggest40569 == 1){
                                  active[12]=1;
                                  ends[12]=1;
                                  break RUN;
                                }
                              }
                              else {
                                S22415=2;
                                active[12]=1;
                                ends[12]=1;
                                break RUN;
                              }
                            }
                          }
                          else {
                            S22415=2;
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
                  S22399=1;
                  S22399=0;
                  if(!capperReq_in.isPartnerPresent() || capperReq_in.isPartnerPreempted()){//sysj\controller.sysj line: 163, column: 3
                    capperReq_in.setACK(false);//sysj\controller.sysj line: 163, column: 3
                    S22399=1;
                    active[12]=1;
                    ends[12]=1;
                    break RUN;
                  }
                  else {
                    S22394=0;
                    if(!capperReq_in.isREQ()){//sysj\controller.sysj line: 163, column: 3
                      capperReq_in.setACK(true);//sysj\controller.sysj line: 163, column: 3
                      S22394=1;
                      if(capperReq_in.isREQ()){//sysj\controller.sysj line: 163, column: 3
                        capperReq_in.setACK(false);//sysj\controller.sysj line: 163, column: 3
                        ends[12]=2;
                        ;//sysj\controller.sysj line: 163, column: 3
                        request_thread_12 = (boolean)(capperReq_in.getVal() == null ? false : ((Boolean)capperReq_in.getVal()).booleanValue());//sysj\controller.sysj line: 164, column: 3
                        S22415=1;
                        if(request_thread_12){//sysj\controller.sysj line: 166, column: 3
                          System.out.println("CapperController: Received request");//sysj\controller.sysj line: 167, column: 4
                          S22508=0;
                          if(!bottleAtPos4.getprestatus()){//sysj\controller.sysj line: 169, column: 12
                            System.out.println("capperidle");//sysj\controller.sysj line: 170, column: 5
                            S22422=0;
                            if(!capperStatus_o.isPartnerPresent() || capperStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 171, column: 5
                              capperStatus_o.setREQ(false);//sysj\controller.sysj line: 171, column: 5
                              S22422=1;
                              active[12]=1;
                              ends[12]=1;
                              break RUN;
                            }
                            else {
                              S22417=0;
                              if(capperStatus_o.isACK()){//sysj\controller.sysj line: 171, column: 5
                                capperStatus_o.setVal("idle");//sysj\controller.sysj line: 171, column: 5
                                S22417=1;
                                if(!capperStatus_o.isACK()){//sysj\controller.sysj line: 171, column: 5
                                  capperStatus_o.setREQ(false);//sysj\controller.sysj line: 171, column: 5
                                  ends[12]=2;
                                  ;//sysj\controller.sysj line: 171, column: 5
                                  S22508=1;
                                  if(bottleAtPos4.getprestatus()){//sysj\controller.sysj line: 174, column: 12
                                    System.out.println("CapperController: Capper doing work...");//sysj\controller.sysj line: 175, column: 5
                                    S22619=0;
                                    thread40570(tdone,ends);
                                    thread40571(tdone,ends);
                                    thread40572(tdone,ends);
                                    thread40576(tdone,ends);
                                    int biggest40577 = 0;
                                    if(ends[13]>=biggest40577){
                                      biggest40577=ends[13];
                                    }
                                    if(ends[14]>=biggest40577){
                                      biggest40577=ends[14];
                                    }
                                    if(ends[15]>=biggest40577){
                                      biggest40577=ends[15];
                                    }
                                    if(ends[18]>=biggest40577){
                                      biggest40577=ends[18];
                                    }
                                    if(biggest40577 == 1){
                                      active[12]=1;
                                      ends[12]=1;
                                      break RUN;
                                    }
                                  }
                                  else {
                                    S22415=2;
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
                            S22508=1;
                            if(bottleAtPos4.getprestatus()){//sysj\controller.sysj line: 174, column: 12
                              System.out.println("CapperController: Capper doing work...");//sysj\controller.sysj line: 175, column: 5
                              S22619=0;
                              thread40578(tdone,ends);
                              thread40579(tdone,ends);
                              thread40580(tdone,ends);
                              thread40584(tdone,ends);
                              int biggest40585 = 0;
                              if(ends[13]>=biggest40585){
                                biggest40585=ends[13];
                              }
                              if(ends[14]>=biggest40585){
                                biggest40585=ends[14];
                              }
                              if(ends[15]>=biggest40585){
                                biggest40585=ends[15];
                              }
                              if(ends[18]>=biggest40585){
                                biggest40585=ends[18];
                              }
                              if(biggest40585 == 1){
                                active[12]=1;
                                ends[12]=1;
                                break RUN;
                              }
                            }
                            else {
                              S22415=2;
                              active[12]=1;
                              ends[12]=1;
                              break RUN;
                            }
                          }
                        }
                        else {
                          S22415=2;
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
              switch(S22508){
                case 0 : 
                  switch(S22422){
                    case 0 : 
                      if(!capperStatus_o.isPartnerPresent() || capperStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 171, column: 5
                        capperStatus_o.setREQ(false);//sysj\controller.sysj line: 171, column: 5
                        S22422=1;
                        active[12]=1;
                        ends[12]=1;
                        break RUN;
                      }
                      else {
                        switch(S22417){
                          case 0 : 
                            if(capperStatus_o.isACK()){//sysj\controller.sysj line: 171, column: 5
                              capperStatus_o.setVal("idle");//sysj\controller.sysj line: 171, column: 5
                              S22417=1;
                              if(!capperStatus_o.isACK()){//sysj\controller.sysj line: 171, column: 5
                                capperStatus_o.setREQ(false);//sysj\controller.sysj line: 171, column: 5
                                ends[12]=2;
                                ;//sysj\controller.sysj line: 171, column: 5
                                S22508=1;
                                if(bottleAtPos4.getprestatus()){//sysj\controller.sysj line: 174, column: 12
                                  System.out.println("CapperController: Capper doing work...");//sysj\controller.sysj line: 175, column: 5
                                  S22619=0;
                                  thread40586(tdone,ends);
                                  thread40587(tdone,ends);
                                  thread40588(tdone,ends);
                                  thread40592(tdone,ends);
                                  int biggest40593 = 0;
                                  if(ends[13]>=biggest40593){
                                    biggest40593=ends[13];
                                  }
                                  if(ends[14]>=biggest40593){
                                    biggest40593=ends[14];
                                  }
                                  if(ends[15]>=biggest40593){
                                    biggest40593=ends[15];
                                  }
                                  if(ends[18]>=biggest40593){
                                    biggest40593=ends[18];
                                  }
                                  if(biggest40593 == 1){
                                    active[12]=1;
                                    ends[12]=1;
                                    break RUN;
                                  }
                                }
                                else {
                                  S22415=2;
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
                              S22508=1;
                              if(bottleAtPos4.getprestatus()){//sysj\controller.sysj line: 174, column: 12
                                System.out.println("CapperController: Capper doing work...");//sysj\controller.sysj line: 175, column: 5
                                S22619=0;
                                thread40594(tdone,ends);
                                thread40595(tdone,ends);
                                thread40596(tdone,ends);
                                thread40600(tdone,ends);
                                int biggest40601 = 0;
                                if(ends[13]>=biggest40601){
                                  biggest40601=ends[13];
                                }
                                if(ends[14]>=biggest40601){
                                  biggest40601=ends[14];
                                }
                                if(ends[15]>=biggest40601){
                                  biggest40601=ends[15];
                                }
                                if(ends[18]>=biggest40601){
                                  biggest40601=ends[18];
                                }
                                if(biggest40601 == 1){
                                  active[12]=1;
                                  ends[12]=1;
                                  break RUN;
                                }
                              }
                              else {
                                S22415=2;
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
                      S22422=1;
                      S22422=0;
                      if(!capperStatus_o.isPartnerPresent() || capperStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 171, column: 5
                        capperStatus_o.setREQ(false);//sysj\controller.sysj line: 171, column: 5
                        S22422=1;
                        active[12]=1;
                        ends[12]=1;
                        break RUN;
                      }
                      else {
                        S22417=0;
                        if(capperStatus_o.isACK()){//sysj\controller.sysj line: 171, column: 5
                          capperStatus_o.setVal("idle");//sysj\controller.sysj line: 171, column: 5
                          S22417=1;
                          if(!capperStatus_o.isACK()){//sysj\controller.sysj line: 171, column: 5
                            capperStatus_o.setREQ(false);//sysj\controller.sysj line: 171, column: 5
                            ends[12]=2;
                            ;//sysj\controller.sysj line: 171, column: 5
                            S22508=1;
                            if(bottleAtPos4.getprestatus()){//sysj\controller.sysj line: 174, column: 12
                              System.out.println("CapperController: Capper doing work...");//sysj\controller.sysj line: 175, column: 5
                              S22619=0;
                              thread40602(tdone,ends);
                              thread40603(tdone,ends);
                              thread40604(tdone,ends);
                              thread40608(tdone,ends);
                              int biggest40609 = 0;
                              if(ends[13]>=biggest40609){
                                biggest40609=ends[13];
                              }
                              if(ends[14]>=biggest40609){
                                biggest40609=ends[14];
                              }
                              if(ends[15]>=biggest40609){
                                biggest40609=ends[15];
                              }
                              if(ends[18]>=biggest40609){
                                biggest40609=ends[18];
                              }
                              if(biggest40609 == 1){
                                active[12]=1;
                                ends[12]=1;
                                break RUN;
                              }
                            }
                            else {
                              S22415=2;
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
                  switch(S22619){
                    case 0 : 
                      thread40610(tdone,ends);
                      thread40611(tdone,ends);
                      thread40612(tdone,ends);
                      thread40616(tdone,ends);
                      int biggest40617 = 0;
                      if(ends[13]>=biggest40617){
                        biggest40617=ends[13];
                      }
                      if(ends[14]>=biggest40617){
                        biggest40617=ends[14];
                      }
                      if(ends[15]>=biggest40617){
                        biggest40617=ends[15];
                      }
                      if(ends[18]>=biggest40617){
                        biggest40617=ends[18];
                      }
                      if(biggest40617 == 1){
                        active[12]=1;
                        ends[12]=1;
                        break RUN;
                      }
                      //FINXME code
                      if(biggest40617 == 0){
                        S22619=1;
                        S22626=0;
                        if(!capperStatus_o.isPartnerPresent() || capperStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 214, column: 5
                          capperStatus_o.setREQ(false);//sysj\controller.sysj line: 214, column: 5
                          S22626=1;
                          active[12]=1;
                          ends[12]=1;
                          break RUN;
                        }
                        else {
                          S22621=0;
                          if(capperStatus_o.isACK()){//sysj\controller.sysj line: 214, column: 5
                            capperStatus_o.setVal("done");//sysj\controller.sysj line: 214, column: 5
                            S22621=1;
                            if(!capperStatus_o.isACK()){//sysj\controller.sysj line: 214, column: 5
                              capperStatus_o.setREQ(false);//sysj\controller.sysj line: 214, column: 5
                              ends[12]=2;
                              ;//sysj\controller.sysj line: 214, column: 5
                              S22415=2;
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
                      switch(S22626){
                        case 0 : 
                          if(!capperStatus_o.isPartnerPresent() || capperStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 214, column: 5
                            capperStatus_o.setREQ(false);//sysj\controller.sysj line: 214, column: 5
                            S22626=1;
                            active[12]=1;
                            ends[12]=1;
                            break RUN;
                          }
                          else {
                            switch(S22621){
                              case 0 : 
                                if(capperStatus_o.isACK()){//sysj\controller.sysj line: 214, column: 5
                                  capperStatus_o.setVal("done");//sysj\controller.sysj line: 214, column: 5
                                  S22621=1;
                                  if(!capperStatus_o.isACK()){//sysj\controller.sysj line: 214, column: 5
                                    capperStatus_o.setREQ(false);//sysj\controller.sysj line: 214, column: 5
                                    ends[12]=2;
                                    ;//sysj\controller.sysj line: 214, column: 5
                                    S22415=2;
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
                                  S22415=2;
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
                          S22626=1;
                          S22626=0;
                          if(!capperStatus_o.isPartnerPresent() || capperStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 214, column: 5
                            capperStatus_o.setREQ(false);//sysj\controller.sysj line: 214, column: 5
                            S22626=1;
                            active[12]=1;
                            ends[12]=1;
                            break RUN;
                          }
                          else {
                            S22621=0;
                            if(capperStatus_o.isACK()){//sysj\controller.sysj line: 214, column: 5
                              capperStatus_o.setVal("done");//sysj\controller.sysj line: 214, column: 5
                              S22621=1;
                              if(!capperStatus_o.isACK()){//sysj\controller.sysj line: 214, column: 5
                                capperStatus_o.setREQ(false);//sysj\controller.sysj line: 214, column: 5
                                ends[12]=2;
                                ;//sysj\controller.sysj line: 214, column: 5
                                S22415=2;
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
              S22415=2;
              S22415=0;
              S22399=0;
              if(!capperReq_in.isPartnerPresent() || capperReq_in.isPartnerPreempted()){//sysj\controller.sysj line: 163, column: 3
                capperReq_in.setACK(false);//sysj\controller.sysj line: 163, column: 3
                S22399=1;
                active[12]=1;
                ends[12]=1;
                break RUN;
              }
              else {
                S22394=0;
                if(!capperReq_in.isREQ()){//sysj\controller.sysj line: 163, column: 3
                  capperReq_in.setACK(true);//sysj\controller.sysj line: 163, column: 3
                  S22394=1;
                  if(capperReq_in.isREQ()){//sysj\controller.sysj line: 163, column: 3
                    capperReq_in.setACK(false);//sysj\controller.sysj line: 163, column: 3
                    ends[12]=2;
                    ;//sysj\controller.sysj line: 163, column: 3
                    request_thread_12 = (boolean)(capperReq_in.getVal() == null ? false : ((Boolean)capperReq_in.getVal()).booleanValue());//sysj\controller.sysj line: 164, column: 3
                    S22415=1;
                    if(request_thread_12){//sysj\controller.sysj line: 166, column: 3
                      System.out.println("CapperController: Received request");//sysj\controller.sysj line: 167, column: 4
                      S22508=0;
                      if(!bottleAtPos4.getprestatus()){//sysj\controller.sysj line: 169, column: 12
                        System.out.println("capperidle");//sysj\controller.sysj line: 170, column: 5
                        S22422=0;
                        if(!capperStatus_o.isPartnerPresent() || capperStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 171, column: 5
                          capperStatus_o.setREQ(false);//sysj\controller.sysj line: 171, column: 5
                          S22422=1;
                          active[12]=1;
                          ends[12]=1;
                          break RUN;
                        }
                        else {
                          S22417=0;
                          if(capperStatus_o.isACK()){//sysj\controller.sysj line: 171, column: 5
                            capperStatus_o.setVal("idle");//sysj\controller.sysj line: 171, column: 5
                            S22417=1;
                            if(!capperStatus_o.isACK()){//sysj\controller.sysj line: 171, column: 5
                              capperStatus_o.setREQ(false);//sysj\controller.sysj line: 171, column: 5
                              ends[12]=2;
                              ;//sysj\controller.sysj line: 171, column: 5
                              S22508=1;
                              if(bottleAtPos4.getprestatus()){//sysj\controller.sysj line: 174, column: 12
                                System.out.println("CapperController: Capper doing work...");//sysj\controller.sysj line: 175, column: 5
                                S22619=0;
                                thread40618(tdone,ends);
                                thread40619(tdone,ends);
                                thread40620(tdone,ends);
                                thread40624(tdone,ends);
                                int biggest40625 = 0;
                                if(ends[13]>=biggest40625){
                                  biggest40625=ends[13];
                                }
                                if(ends[14]>=biggest40625){
                                  biggest40625=ends[14];
                                }
                                if(ends[15]>=biggest40625){
                                  biggest40625=ends[15];
                                }
                                if(ends[18]>=biggest40625){
                                  biggest40625=ends[18];
                                }
                                if(biggest40625 == 1){
                                  active[12]=1;
                                  ends[12]=1;
                                  break RUN;
                                }
                              }
                              else {
                                S22415=2;
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
                        S22508=1;
                        if(bottleAtPos4.getprestatus()){//sysj\controller.sysj line: 174, column: 12
                          System.out.println("CapperController: Capper doing work...");//sysj\controller.sysj line: 175, column: 5
                          S22619=0;
                          thread40626(tdone,ends);
                          thread40627(tdone,ends);
                          thread40628(tdone,ends);
                          thread40632(tdone,ends);
                          int biggest40633 = 0;
                          if(ends[13]>=biggest40633){
                            biggest40633=ends[13];
                          }
                          if(ends[14]>=biggest40633){
                            biggest40633=ends[14];
                          }
                          if(ends[15]>=biggest40633){
                            biggest40633=ends[15];
                          }
                          if(ends[18]>=biggest40633){
                            biggest40633=ends[18];
                          }
                          if(biggest40633 == 1){
                            active[12]=1;
                            ends[12]=1;
                            break RUN;
                          }
                        }
                        else {
                          S22415=2;
                          active[12]=1;
                          ends[12]=1;
                          break RUN;
                        }
                      }
                    }
                    else {
                      S22415=2;
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
    untwistGripper_12 = new Signal();
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
      untwistGripper_12.setpreclear();
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
      untwistGripper_12.setClear();
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
