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
  private boolean request_thread_13;//sysj\controller.sysj line: 195, column: 3
  private int S110963 = 1;
  private int S97547 = 1;
  private int S97531 = 1;
  private int S97526 = 1;
  private int S98661 = 1;
  private int S97662 = 1;
  private int S97554 = 1;
  private int S97549 = 1;
  private int S97576 = 1;
  private int S97571 = 1;
  private int S97668 = 1;
  private int S97674 = 1;
  private int S97690 = 1;
  private int S97689 = 1;
  private int S97677 = 1;
  private int S97680 = 1;
  private int S97703 = 1;
  private int S97700 = 1;
  private int S98425 = 1;
  private int S98420 = 1;
  private int S98645 = 1;
  private int S98640 = 1;
  
  private int[] ends = new int[23];
  private int[] tdone = new int[23];
  
  public void thread113585(int [] tdone, int [] ends){
        S97703=1;
    S97700=0;
    active[19]=1;
    ends[19]=1;
    tdone[19]=1;
  }

  public void thread113583(int [] tdone, int [] ends){
        S97680=1;
    active[18]=1;
    ends[18]=1;
    tdone[18]=1;
  }

  public void thread113582(int [] tdone, int [] ends){
        S97677=1;
    active[17]=1;
    ends[17]=1;
    tdone[17]=1;
  }

  public void thread113581(int [] tdone, int [] ends){
        S97690=1;
    S97689=0;
    thread113582(tdone,ends);
    thread113583(tdone,ends);
    int biggest113584 = 0;
    if(ends[17]>=biggest113584){
      biggest113584=ends[17];
    }
    if(ends[18]>=biggest113584){
      biggest113584=ends[18];
    }
    if(biggest113584 == 1){
      active[16]=1;
      ends[16]=1;
      tdone[16]=1;
    }
  }

  public void thread113580(int [] tdone, int [] ends){
        S97674=1;
    cylPos5ZAxisExtend.setPresent();//sysj\controller.sysj line: 214, column: 7
    currsigs.addElement(cylPos5ZAxisExtend);
    active[15]=1;
    ends[15]=1;
    tdone[15]=1;
  }

  public void thread113579(int [] tdone, int [] ends){
        S97668=1;
    cylClampBottleExtend.setPresent();//sysj\controller.sysj line: 208, column: 7
    currsigs.addElement(cylClampBottleExtend);
    active[14]=1;
    ends[14]=1;
    tdone[14]=1;
  }

  public void thread113577(int [] tdone, int [] ends){
        S97703=1;
    S97700=0;
    active[19]=1;
    ends[19]=1;
    tdone[19]=1;
  }

  public void thread113575(int [] tdone, int [] ends){
        S97680=1;
    active[18]=1;
    ends[18]=1;
    tdone[18]=1;
  }

  public void thread113574(int [] tdone, int [] ends){
        S97677=1;
    active[17]=1;
    ends[17]=1;
    tdone[17]=1;
  }

  public void thread113573(int [] tdone, int [] ends){
        S97690=1;
    S97689=0;
    thread113574(tdone,ends);
    thread113575(tdone,ends);
    int biggest113576 = 0;
    if(ends[17]>=biggest113576){
      biggest113576=ends[17];
    }
    if(ends[18]>=biggest113576){
      biggest113576=ends[18];
    }
    if(biggest113576 == 1){
      active[16]=1;
      ends[16]=1;
      tdone[16]=1;
    }
  }

  public void thread113572(int [] tdone, int [] ends){
        S97674=1;
    cylPos5ZAxisExtend.setPresent();//sysj\controller.sysj line: 214, column: 7
    currsigs.addElement(cylPos5ZAxisExtend);
    active[15]=1;
    ends[15]=1;
    tdone[15]=1;
  }

  public void thread113571(int [] tdone, int [] ends){
        S97668=1;
    cylClampBottleExtend.setPresent();//sysj\controller.sysj line: 208, column: 7
    currsigs.addElement(cylClampBottleExtend);
    active[14]=1;
    ends[14]=1;
    tdone[14]=1;
  }

  public void thread113569(int [] tdone, int [] ends){
        switch(S97703){
      case 0 : 
        active[19]=0;
        ends[19]=0;
        tdone[19]=1;
        break;
      
      case 1 : 
        switch(S97700){
          case 0 : 
            if(gripperGrippedCap.getprestatus()){//sysj\controller.sysj line: 227, column: 12
              S97700=1;
              gripperTurnExtend.setPresent();//sysj\controller.sysj line: 230, column: 7
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
            if(gripperTurnFinalPos.getprestatus()){//sysj\controller.sysj line: 229, column: 13
              releaseCap_13.setPresent();//sysj\controller.sysj line: 232, column: 6
              currsigs.addElement(releaseCap_13);
              untwistGripper_13.setPresent();//sysj\controller.sysj line: 235, column: 7
              currsigs.addElement(untwistGripper_13);
              raiseGripper_13.setPresent();//sysj\controller.sysj line: 238, column: 6
              currsigs.addElement(raiseGripper_13);
              unclampBottle_13.setPresent();//sysj\controller.sysj line: 239, column: 6
              currsigs.addElement(unclampBottle_13);
              S97703=0;
              active[19]=0;
              ends[19]=0;
              tdone[19]=1;
            }
            else {
              gripperTurnExtend.setPresent();//sysj\controller.sysj line: 230, column: 7
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

  public void thread113567(int [] tdone, int [] ends){
        switch(S97680){
      case 0 : 
        active[18]=0;
        ends[18]=0;
        tdone[18]=1;
        break;
      
      case 1 : 
        if(cylClampedBottle.getprestatus()){//sysj\controller.sysj line: 220, column: 46
          S97680=0;
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

  public void thread113566(int [] tdone, int [] ends){
        switch(S97677){
      case 0 : 
        active[17]=0;
        ends[17]=0;
        tdone[17]=1;
        break;
      
      case 1 : 
        if(gripperZAxisLowered.getprestatus()){//sysj\controller.sysj line: 220, column: 13
          S97677=0;
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

  public void thread113565(int [] tdone, int [] ends){
        switch(S97690){
      case 0 : 
        active[16]=0;
        ends[16]=0;
        tdone[16]=1;
        break;
      
      case 1 : 
        switch(S97689){
          case 0 : 
            thread113566(tdone,ends);
            thread113567(tdone,ends);
            int biggest113568 = 0;
            if(ends[17]>=biggest113568){
              biggest113568=ends[17];
            }
            if(ends[18]>=biggest113568){
              biggest113568=ends[18];
            }
            if(biggest113568 == 1){
              active[16]=1;
              ends[16]=1;
              tdone[16]=1;
            }
            //FINXME code
            if(biggest113568 == 0){
              S97689=1;
              capGripperPos5Extend.setPresent();//sysj\controller.sysj line: 222, column: 7
              currsigs.addElement(capGripperPos5Extend);
              active[16]=1;
              ends[16]=1;
              tdone[16]=1;
            }
            break;
          
          case 1 : 
            if(releaseCap_13.getprestatus()){//sysj\controller.sysj line: 221, column: 12
              S97690=0;
              active[16]=0;
              ends[16]=0;
              tdone[16]=1;
            }
            else {
              capGripperPos5Extend.setPresent();//sysj\controller.sysj line: 222, column: 7
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

  public void thread113564(int [] tdone, int [] ends){
        switch(S97674){
      case 0 : 
        active[15]=0;
        ends[15]=0;
        tdone[15]=1;
        break;
      
      case 1 : 
        if(raiseGripper_13.getprestatus()){//sysj\controller.sysj line: 213, column: 12
          S97674=0;
          active[15]=0;
          ends[15]=0;
          tdone[15]=1;
        }
        else {
          cylPos5ZAxisExtend.setPresent();//sysj\controller.sysj line: 214, column: 7
          currsigs.addElement(cylPos5ZAxisExtend);
          active[15]=1;
          ends[15]=1;
          tdone[15]=1;
        }
        break;
      
    }
  }

  public void thread113563(int [] tdone, int [] ends){
        switch(S97668){
      case 0 : 
        active[14]=0;
        ends[14]=0;
        tdone[14]=1;
        break;
      
      case 1 : 
        if(unclampBottle_13.getprestatus()){//sysj\controller.sysj line: 207, column: 13
          S97668=0;
          active[14]=0;
          ends[14]=0;
          tdone[14]=1;
        }
        else {
          cylClampBottleExtend.setPresent();//sysj\controller.sysj line: 208, column: 7
          currsigs.addElement(cylClampBottleExtend);
          active[14]=1;
          ends[14]=1;
          tdone[14]=1;
        }
        break;
      
    }
  }

  public void thread113561(int [] tdone, int [] ends){
        S97703=1;
    S97700=0;
    active[19]=1;
    ends[19]=1;
    tdone[19]=1;
  }

  public void thread113559(int [] tdone, int [] ends){
        S97680=1;
    active[18]=1;
    ends[18]=1;
    tdone[18]=1;
  }

  public void thread113558(int [] tdone, int [] ends){
        S97677=1;
    active[17]=1;
    ends[17]=1;
    tdone[17]=1;
  }

  public void thread113557(int [] tdone, int [] ends){
        S97690=1;
    S97689=0;
    thread113558(tdone,ends);
    thread113559(tdone,ends);
    int biggest113560 = 0;
    if(ends[17]>=biggest113560){
      biggest113560=ends[17];
    }
    if(ends[18]>=biggest113560){
      biggest113560=ends[18];
    }
    if(biggest113560 == 1){
      active[16]=1;
      ends[16]=1;
      tdone[16]=1;
    }
  }

  public void thread113556(int [] tdone, int [] ends){
        S97674=1;
    cylPos5ZAxisExtend.setPresent();//sysj\controller.sysj line: 214, column: 7
    currsigs.addElement(cylPos5ZAxisExtend);
    active[15]=1;
    ends[15]=1;
    tdone[15]=1;
  }

  public void thread113555(int [] tdone, int [] ends){
        S97668=1;
    cylClampBottleExtend.setPresent();//sysj\controller.sysj line: 208, column: 7
    currsigs.addElement(cylClampBottleExtend);
    active[14]=1;
    ends[14]=1;
    tdone[14]=1;
  }

  public void thread113553(int [] tdone, int [] ends){
        S97703=1;
    S97700=0;
    active[19]=1;
    ends[19]=1;
    tdone[19]=1;
  }

  public void thread113551(int [] tdone, int [] ends){
        S97680=1;
    active[18]=1;
    ends[18]=1;
    tdone[18]=1;
  }

  public void thread113550(int [] tdone, int [] ends){
        S97677=1;
    active[17]=1;
    ends[17]=1;
    tdone[17]=1;
  }

  public void thread113549(int [] tdone, int [] ends){
        S97690=1;
    S97689=0;
    thread113550(tdone,ends);
    thread113551(tdone,ends);
    int biggest113552 = 0;
    if(ends[17]>=biggest113552){
      biggest113552=ends[17];
    }
    if(ends[18]>=biggest113552){
      biggest113552=ends[18];
    }
    if(biggest113552 == 1){
      active[16]=1;
      ends[16]=1;
      tdone[16]=1;
    }
  }

  public void thread113548(int [] tdone, int [] ends){
        S97674=1;
    cylPos5ZAxisExtend.setPresent();//sysj\controller.sysj line: 214, column: 7
    currsigs.addElement(cylPos5ZAxisExtend);
    active[15]=1;
    ends[15]=1;
    tdone[15]=1;
  }

  public void thread113547(int [] tdone, int [] ends){
        S97668=1;
    cylClampBottleExtend.setPresent();//sysj\controller.sysj line: 208, column: 7
    currsigs.addElement(cylClampBottleExtend);
    active[14]=1;
    ends[14]=1;
    tdone[14]=1;
  }

  public void thread113545(int [] tdone, int [] ends){
        S97703=1;
    S97700=0;
    active[19]=1;
    ends[19]=1;
    tdone[19]=1;
  }

  public void thread113543(int [] tdone, int [] ends){
        S97680=1;
    active[18]=1;
    ends[18]=1;
    tdone[18]=1;
  }

  public void thread113542(int [] tdone, int [] ends){
        S97677=1;
    active[17]=1;
    ends[17]=1;
    tdone[17]=1;
  }

  public void thread113541(int [] tdone, int [] ends){
        S97690=1;
    S97689=0;
    thread113542(tdone,ends);
    thread113543(tdone,ends);
    int biggest113544 = 0;
    if(ends[17]>=biggest113544){
      biggest113544=ends[17];
    }
    if(ends[18]>=biggest113544){
      biggest113544=ends[18];
    }
    if(biggest113544 == 1){
      active[16]=1;
      ends[16]=1;
      tdone[16]=1;
    }
  }

  public void thread113540(int [] tdone, int [] ends){
        S97674=1;
    cylPos5ZAxisExtend.setPresent();//sysj\controller.sysj line: 214, column: 7
    currsigs.addElement(cylPos5ZAxisExtend);
    active[15]=1;
    ends[15]=1;
    tdone[15]=1;
  }

  public void thread113539(int [] tdone, int [] ends){
        S97668=1;
    cylClampBottleExtend.setPresent();//sysj\controller.sysj line: 208, column: 7
    currsigs.addElement(cylClampBottleExtend);
    active[14]=1;
    ends[14]=1;
    tdone[14]=1;
  }

  public void thread113537(int [] tdone, int [] ends){
        S97703=1;
    S97700=0;
    active[19]=1;
    ends[19]=1;
    tdone[19]=1;
  }

  public void thread113535(int [] tdone, int [] ends){
        S97680=1;
    active[18]=1;
    ends[18]=1;
    tdone[18]=1;
  }

  public void thread113534(int [] tdone, int [] ends){
        S97677=1;
    active[17]=1;
    ends[17]=1;
    tdone[17]=1;
  }

  public void thread113533(int [] tdone, int [] ends){
        S97690=1;
    S97689=0;
    thread113534(tdone,ends);
    thread113535(tdone,ends);
    int biggest113536 = 0;
    if(ends[17]>=biggest113536){
      biggest113536=ends[17];
    }
    if(ends[18]>=biggest113536){
      biggest113536=ends[18];
    }
    if(biggest113536 == 1){
      active[16]=1;
      ends[16]=1;
      tdone[16]=1;
    }
  }

  public void thread113532(int [] tdone, int [] ends){
        S97674=1;
    cylPos5ZAxisExtend.setPresent();//sysj\controller.sysj line: 214, column: 7
    currsigs.addElement(cylPos5ZAxisExtend);
    active[15]=1;
    ends[15]=1;
    tdone[15]=1;
  }

  public void thread113531(int [] tdone, int [] ends){
        S97668=1;
    cylClampBottleExtend.setPresent();//sysj\controller.sysj line: 208, column: 7
    currsigs.addElement(cylClampBottleExtend);
    active[14]=1;
    ends[14]=1;
    tdone[14]=1;
  }

  public void thread113529(int [] tdone, int [] ends){
        S97703=1;
    S97700=0;
    active[19]=1;
    ends[19]=1;
    tdone[19]=1;
  }

  public void thread113527(int [] tdone, int [] ends){
        S97680=1;
    active[18]=1;
    ends[18]=1;
    tdone[18]=1;
  }

  public void thread113526(int [] tdone, int [] ends){
        S97677=1;
    active[17]=1;
    ends[17]=1;
    tdone[17]=1;
  }

  public void thread113525(int [] tdone, int [] ends){
        S97690=1;
    S97689=0;
    thread113526(tdone,ends);
    thread113527(tdone,ends);
    int biggest113528 = 0;
    if(ends[17]>=biggest113528){
      biggest113528=ends[17];
    }
    if(ends[18]>=biggest113528){
      biggest113528=ends[18];
    }
    if(biggest113528 == 1){
      active[16]=1;
      ends[16]=1;
      tdone[16]=1;
    }
  }

  public void thread113524(int [] tdone, int [] ends){
        S97674=1;
    cylPos5ZAxisExtend.setPresent();//sysj\controller.sysj line: 214, column: 7
    currsigs.addElement(cylPos5ZAxisExtend);
    active[15]=1;
    ends[15]=1;
    tdone[15]=1;
  }

  public void thread113523(int [] tdone, int [] ends){
        S97668=1;
    cylClampBottleExtend.setPresent();//sysj\controller.sysj line: 208, column: 7
    currsigs.addElement(cylClampBottleExtend);
    active[14]=1;
    ends[14]=1;
    tdone[14]=1;
  }

  public void thread113521(int [] tdone, int [] ends){
        S97703=1;
    S97700=0;
    active[19]=1;
    ends[19]=1;
    tdone[19]=1;
  }

  public void thread113519(int [] tdone, int [] ends){
        S97680=1;
    active[18]=1;
    ends[18]=1;
    tdone[18]=1;
  }

  public void thread113518(int [] tdone, int [] ends){
        S97677=1;
    active[17]=1;
    ends[17]=1;
    tdone[17]=1;
  }

  public void thread113517(int [] tdone, int [] ends){
        S97690=1;
    S97689=0;
    thread113518(tdone,ends);
    thread113519(tdone,ends);
    int biggest113520 = 0;
    if(ends[17]>=biggest113520){
      biggest113520=ends[17];
    }
    if(ends[18]>=biggest113520){
      biggest113520=ends[18];
    }
    if(biggest113520 == 1){
      active[16]=1;
      ends[16]=1;
      tdone[16]=1;
    }
  }

  public void thread113516(int [] tdone, int [] ends){
        S97674=1;
    cylPos5ZAxisExtend.setPresent();//sysj\controller.sysj line: 214, column: 7
    currsigs.addElement(cylPos5ZAxisExtend);
    active[15]=1;
    ends[15]=1;
    tdone[15]=1;
  }

  public void thread113515(int [] tdone, int [] ends){
        S97668=1;
    cylClampBottleExtend.setPresent();//sysj\controller.sysj line: 208, column: 7
    currsigs.addElement(cylClampBottleExtend);
    active[14]=1;
    ends[14]=1;
    tdone[14]=1;
  }

  public void thread113513(int [] tdone, int [] ends){
        S97703=1;
    S97700=0;
    active[19]=1;
    ends[19]=1;
    tdone[19]=1;
  }

  public void thread113511(int [] tdone, int [] ends){
        S97680=1;
    active[18]=1;
    ends[18]=1;
    tdone[18]=1;
  }

  public void thread113510(int [] tdone, int [] ends){
        S97677=1;
    active[17]=1;
    ends[17]=1;
    tdone[17]=1;
  }

  public void thread113509(int [] tdone, int [] ends){
        S97690=1;
    S97689=0;
    thread113510(tdone,ends);
    thread113511(tdone,ends);
    int biggest113512 = 0;
    if(ends[17]>=biggest113512){
      biggest113512=ends[17];
    }
    if(ends[18]>=biggest113512){
      biggest113512=ends[18];
    }
    if(biggest113512 == 1){
      active[16]=1;
      ends[16]=1;
      tdone[16]=1;
    }
  }

  public void thread113508(int [] tdone, int [] ends){
        S97674=1;
    cylPos5ZAxisExtend.setPresent();//sysj\controller.sysj line: 214, column: 7
    currsigs.addElement(cylPos5ZAxisExtend);
    active[15]=1;
    ends[15]=1;
    tdone[15]=1;
  }

  public void thread113507(int [] tdone, int [] ends){
        S97668=1;
    cylClampBottleExtend.setPresent();//sysj\controller.sysj line: 208, column: 7
    currsigs.addElement(cylClampBottleExtend);
    active[14]=1;
    ends[14]=1;
    tdone[14]=1;
  }

  public void thread113505(int [] tdone, int [] ends){
        S97703=1;
    S97700=0;
    active[19]=1;
    ends[19]=1;
    tdone[19]=1;
  }

  public void thread113503(int [] tdone, int [] ends){
        S97680=1;
    active[18]=1;
    ends[18]=1;
    tdone[18]=1;
  }

  public void thread113502(int [] tdone, int [] ends){
        S97677=1;
    active[17]=1;
    ends[17]=1;
    tdone[17]=1;
  }

  public void thread113501(int [] tdone, int [] ends){
        S97690=1;
    S97689=0;
    thread113502(tdone,ends);
    thread113503(tdone,ends);
    int biggest113504 = 0;
    if(ends[17]>=biggest113504){
      biggest113504=ends[17];
    }
    if(ends[18]>=biggest113504){
      biggest113504=ends[18];
    }
    if(biggest113504 == 1){
      active[16]=1;
      ends[16]=1;
      tdone[16]=1;
    }
  }

  public void thread113500(int [] tdone, int [] ends){
        S97674=1;
    cylPos5ZAxisExtend.setPresent();//sysj\controller.sysj line: 214, column: 7
    currsigs.addElement(cylPos5ZAxisExtend);
    active[15]=1;
    ends[15]=1;
    tdone[15]=1;
  }

  public void thread113499(int [] tdone, int [] ends){
        S97668=1;
    cylClampBottleExtend.setPresent();//sysj\controller.sysj line: 208, column: 7
    currsigs.addElement(cylClampBottleExtend);
    active[14]=1;
    ends[14]=1;
    tdone[14]=1;
  }

  public void thread113497(int [] tdone, int [] ends){
        S97703=1;
    S97700=0;
    active[19]=1;
    ends[19]=1;
    tdone[19]=1;
  }

  public void thread113495(int [] tdone, int [] ends){
        S97680=1;
    active[18]=1;
    ends[18]=1;
    tdone[18]=1;
  }

  public void thread113494(int [] tdone, int [] ends){
        S97677=1;
    active[17]=1;
    ends[17]=1;
    tdone[17]=1;
  }

  public void thread113493(int [] tdone, int [] ends){
        S97690=1;
    S97689=0;
    thread113494(tdone,ends);
    thread113495(tdone,ends);
    int biggest113496 = 0;
    if(ends[17]>=biggest113496){
      biggest113496=ends[17];
    }
    if(ends[18]>=biggest113496){
      biggest113496=ends[18];
    }
    if(biggest113496 == 1){
      active[16]=1;
      ends[16]=1;
      tdone[16]=1;
    }
  }

  public void thread113492(int [] tdone, int [] ends){
        S97674=1;
    cylPos5ZAxisExtend.setPresent();//sysj\controller.sysj line: 214, column: 7
    currsigs.addElement(cylPos5ZAxisExtend);
    active[15]=1;
    ends[15]=1;
    tdone[15]=1;
  }

  public void thread113491(int [] tdone, int [] ends){
        S97668=1;
    cylClampBottleExtend.setPresent();//sysj\controller.sysj line: 208, column: 7
    currsigs.addElement(cylClampBottleExtend);
    active[14]=1;
    ends[14]=1;
    tdone[14]=1;
  }

  public void thread113489(int [] tdone, int [] ends){
        S97703=1;
    S97700=0;
    active[19]=1;
    ends[19]=1;
    tdone[19]=1;
  }

  public void thread113487(int [] tdone, int [] ends){
        S97680=1;
    active[18]=1;
    ends[18]=1;
    tdone[18]=1;
  }

  public void thread113486(int [] tdone, int [] ends){
        S97677=1;
    active[17]=1;
    ends[17]=1;
    tdone[17]=1;
  }

  public void thread113485(int [] tdone, int [] ends){
        S97690=1;
    S97689=0;
    thread113486(tdone,ends);
    thread113487(tdone,ends);
    int biggest113488 = 0;
    if(ends[17]>=biggest113488){
      biggest113488=ends[17];
    }
    if(ends[18]>=biggest113488){
      biggest113488=ends[18];
    }
    if(biggest113488 == 1){
      active[16]=1;
      ends[16]=1;
      tdone[16]=1;
    }
  }

  public void thread113484(int [] tdone, int [] ends){
        S97674=1;
    cylPos5ZAxisExtend.setPresent();//sysj\controller.sysj line: 214, column: 7
    currsigs.addElement(cylPos5ZAxisExtend);
    active[15]=1;
    ends[15]=1;
    tdone[15]=1;
  }

  public void thread113483(int [] tdone, int [] ends){
        S97668=1;
    cylClampBottleExtend.setPresent();//sysj\controller.sysj line: 208, column: 7
    currsigs.addElement(cylClampBottleExtend);
    active[14]=1;
    ends[14]=1;
    tdone[14]=1;
  }

  public void thread113481(int [] tdone, int [] ends){
        S97703=1;
    S97700=0;
    active[19]=1;
    ends[19]=1;
    tdone[19]=1;
  }

  public void thread113479(int [] tdone, int [] ends){
        S97680=1;
    active[18]=1;
    ends[18]=1;
    tdone[18]=1;
  }

  public void thread113478(int [] tdone, int [] ends){
        S97677=1;
    active[17]=1;
    ends[17]=1;
    tdone[17]=1;
  }

  public void thread113477(int [] tdone, int [] ends){
        S97690=1;
    S97689=0;
    thread113478(tdone,ends);
    thread113479(tdone,ends);
    int biggest113480 = 0;
    if(ends[17]>=biggest113480){
      biggest113480=ends[17];
    }
    if(ends[18]>=biggest113480){
      biggest113480=ends[18];
    }
    if(biggest113480 == 1){
      active[16]=1;
      ends[16]=1;
      tdone[16]=1;
    }
  }

  public void thread113476(int [] tdone, int [] ends){
        S97674=1;
    cylPos5ZAxisExtend.setPresent();//sysj\controller.sysj line: 214, column: 7
    currsigs.addElement(cylPos5ZAxisExtend);
    active[15]=1;
    ends[15]=1;
    tdone[15]=1;
  }

  public void thread113475(int [] tdone, int [] ends){
        S97668=1;
    cylClampBottleExtend.setPresent();//sysj\controller.sysj line: 208, column: 7
    currsigs.addElement(cylClampBottleExtend);
    active[14]=1;
    ends[14]=1;
    tdone[14]=1;
  }

  public void thread113473(int [] tdone, int [] ends){
        S97703=1;
    S97700=0;
    active[19]=1;
    ends[19]=1;
    tdone[19]=1;
  }

  public void thread113471(int [] tdone, int [] ends){
        S97680=1;
    active[18]=1;
    ends[18]=1;
    tdone[18]=1;
  }

  public void thread113470(int [] tdone, int [] ends){
        S97677=1;
    active[17]=1;
    ends[17]=1;
    tdone[17]=1;
  }

  public void thread113469(int [] tdone, int [] ends){
        S97690=1;
    S97689=0;
    thread113470(tdone,ends);
    thread113471(tdone,ends);
    int biggest113472 = 0;
    if(ends[17]>=biggest113472){
      biggest113472=ends[17];
    }
    if(ends[18]>=biggest113472){
      biggest113472=ends[18];
    }
    if(biggest113472 == 1){
      active[16]=1;
      ends[16]=1;
      tdone[16]=1;
    }
  }

  public void thread113468(int [] tdone, int [] ends){
        S97674=1;
    cylPos5ZAxisExtend.setPresent();//sysj\controller.sysj line: 214, column: 7
    currsigs.addElement(cylPos5ZAxisExtend);
    active[15]=1;
    ends[15]=1;
    tdone[15]=1;
  }

  public void thread113467(int [] tdone, int [] ends){
        S97668=1;
    cylClampBottleExtend.setPresent();//sysj\controller.sysj line: 208, column: 7
    currsigs.addElement(cylClampBottleExtend);
    active[14]=1;
    ends[14]=1;
    tdone[14]=1;
  }

  public void thread113465(int [] tdone, int [] ends){
        S97703=1;
    S97700=0;
    active[19]=1;
    ends[19]=1;
    tdone[19]=1;
  }

  public void thread113463(int [] tdone, int [] ends){
        S97680=1;
    active[18]=1;
    ends[18]=1;
    tdone[18]=1;
  }

  public void thread113462(int [] tdone, int [] ends){
        S97677=1;
    active[17]=1;
    ends[17]=1;
    tdone[17]=1;
  }

  public void thread113461(int [] tdone, int [] ends){
        S97690=1;
    S97689=0;
    thread113462(tdone,ends);
    thread113463(tdone,ends);
    int biggest113464 = 0;
    if(ends[17]>=biggest113464){
      biggest113464=ends[17];
    }
    if(ends[18]>=biggest113464){
      biggest113464=ends[18];
    }
    if(biggest113464 == 1){
      active[16]=1;
      ends[16]=1;
      tdone[16]=1;
    }
  }

  public void thread113460(int [] tdone, int [] ends){
        S97674=1;
    cylPos5ZAxisExtend.setPresent();//sysj\controller.sysj line: 214, column: 7
    currsigs.addElement(cylPos5ZAxisExtend);
    active[15]=1;
    ends[15]=1;
    tdone[15]=1;
  }

  public void thread113459(int [] tdone, int [] ends){
        S97668=1;
    cylClampBottleExtend.setPresent();//sysj\controller.sysj line: 208, column: 7
    currsigs.addElement(cylClampBottleExtend);
    active[14]=1;
    ends[14]=1;
    tdone[14]=1;
  }

  public void thread113457(int [] tdone, int [] ends){
        S97703=1;
    S97700=0;
    active[19]=1;
    ends[19]=1;
    tdone[19]=1;
  }

  public void thread113455(int [] tdone, int [] ends){
        S97680=1;
    active[18]=1;
    ends[18]=1;
    tdone[18]=1;
  }

  public void thread113454(int [] tdone, int [] ends){
        S97677=1;
    active[17]=1;
    ends[17]=1;
    tdone[17]=1;
  }

  public void thread113453(int [] tdone, int [] ends){
        S97690=1;
    S97689=0;
    thread113454(tdone,ends);
    thread113455(tdone,ends);
    int biggest113456 = 0;
    if(ends[17]>=biggest113456){
      biggest113456=ends[17];
    }
    if(ends[18]>=biggest113456){
      biggest113456=ends[18];
    }
    if(biggest113456 == 1){
      active[16]=1;
      ends[16]=1;
      tdone[16]=1;
    }
  }

  public void thread113452(int [] tdone, int [] ends){
        S97674=1;
    cylPos5ZAxisExtend.setPresent();//sysj\controller.sysj line: 214, column: 7
    currsigs.addElement(cylPos5ZAxisExtend);
    active[15]=1;
    ends[15]=1;
    tdone[15]=1;
  }

  public void thread113451(int [] tdone, int [] ends){
        S97668=1;
    cylClampBottleExtend.setPresent();//sysj\controller.sysj line: 208, column: 7
    currsigs.addElement(cylClampBottleExtend);
    active[14]=1;
    ends[14]=1;
    tdone[14]=1;
  }

  public void thread113449(int [] tdone, int [] ends){
        S97703=1;
    S97700=0;
    active[19]=1;
    ends[19]=1;
    tdone[19]=1;
  }

  public void thread113447(int [] tdone, int [] ends){
        S97680=1;
    active[18]=1;
    ends[18]=1;
    tdone[18]=1;
  }

  public void thread113446(int [] tdone, int [] ends){
        S97677=1;
    active[17]=1;
    ends[17]=1;
    tdone[17]=1;
  }

  public void thread113445(int [] tdone, int [] ends){
        S97690=1;
    S97689=0;
    thread113446(tdone,ends);
    thread113447(tdone,ends);
    int biggest113448 = 0;
    if(ends[17]>=biggest113448){
      biggest113448=ends[17];
    }
    if(ends[18]>=biggest113448){
      biggest113448=ends[18];
    }
    if(biggest113448 == 1){
      active[16]=1;
      ends[16]=1;
      tdone[16]=1;
    }
  }

  public void thread113444(int [] tdone, int [] ends){
        S97674=1;
    cylPos5ZAxisExtend.setPresent();//sysj\controller.sysj line: 214, column: 7
    currsigs.addElement(cylPos5ZAxisExtend);
    active[15]=1;
    ends[15]=1;
    tdone[15]=1;
  }

  public void thread113443(int [] tdone, int [] ends){
        S97668=1;
    cylClampBottleExtend.setPresent();//sysj\controller.sysj line: 208, column: 7
    currsigs.addElement(cylClampBottleExtend);
    active[14]=1;
    ends[14]=1;
    tdone[14]=1;
  }

  public void thread113441(int [] tdone, int [] ends){
        S97703=1;
    S97700=0;
    active[19]=1;
    ends[19]=1;
    tdone[19]=1;
  }

  public void thread113439(int [] tdone, int [] ends){
        S97680=1;
    active[18]=1;
    ends[18]=1;
    tdone[18]=1;
  }

  public void thread113438(int [] tdone, int [] ends){
        S97677=1;
    active[17]=1;
    ends[17]=1;
    tdone[17]=1;
  }

  public void thread113437(int [] tdone, int [] ends){
        S97690=1;
    S97689=0;
    thread113438(tdone,ends);
    thread113439(tdone,ends);
    int biggest113440 = 0;
    if(ends[17]>=biggest113440){
      biggest113440=ends[17];
    }
    if(ends[18]>=biggest113440){
      biggest113440=ends[18];
    }
    if(biggest113440 == 1){
      active[16]=1;
      ends[16]=1;
      tdone[16]=1;
    }
  }

  public void thread113436(int [] tdone, int [] ends){
        S97674=1;
    cylPos5ZAxisExtend.setPresent();//sysj\controller.sysj line: 214, column: 7
    currsigs.addElement(cylPos5ZAxisExtend);
    active[15]=1;
    ends[15]=1;
    tdone[15]=1;
  }

  public void thread113435(int [] tdone, int [] ends){
        S97668=1;
    cylClampBottleExtend.setPresent();//sysj\controller.sysj line: 208, column: 7
    currsigs.addElement(cylClampBottleExtend);
    active[14]=1;
    ends[14]=1;
    tdone[14]=1;
  }

  public void thread113433(int [] tdone, int [] ends){
        S97703=1;
    S97700=0;
    active[19]=1;
    ends[19]=1;
    tdone[19]=1;
  }

  public void thread113431(int [] tdone, int [] ends){
        S97680=1;
    active[18]=1;
    ends[18]=1;
    tdone[18]=1;
  }

  public void thread113430(int [] tdone, int [] ends){
        S97677=1;
    active[17]=1;
    ends[17]=1;
    tdone[17]=1;
  }

  public void thread113429(int [] tdone, int [] ends){
        S97690=1;
    S97689=0;
    thread113430(tdone,ends);
    thread113431(tdone,ends);
    int biggest113432 = 0;
    if(ends[17]>=biggest113432){
      biggest113432=ends[17];
    }
    if(ends[18]>=biggest113432){
      biggest113432=ends[18];
    }
    if(biggest113432 == 1){
      active[16]=1;
      ends[16]=1;
      tdone[16]=1;
    }
  }

  public void thread113428(int [] tdone, int [] ends){
        S97674=1;
    cylPos5ZAxisExtend.setPresent();//sysj\controller.sysj line: 214, column: 7
    currsigs.addElement(cylPos5ZAxisExtend);
    active[15]=1;
    ends[15]=1;
    tdone[15]=1;
  }

  public void thread113427(int [] tdone, int [] ends){
        S97668=1;
    cylClampBottleExtend.setPresent();//sysj\controller.sysj line: 208, column: 7
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
      switch(S110963){
        case 0 : 
          S110963=0;
          break RUN;
        
        case 1 : 
          S110963=2;
          S110963=2;
          releaseCap_13.setClear();//sysj\controller.sysj line: 191, column: 2
          untwistGripper_13.setClear();//sysj\controller.sysj line: 191, column: 2
          raiseGripper_13.setClear();//sysj\controller.sysj line: 191, column: 2
          unclampBottle_13.setClear();//sysj\controller.sysj line: 191, column: 2
          S97547=0;
          S97531=0;
          if(!capperReq_in.isPartnerPresent() || capperReq_in.isPartnerPreempted()){//sysj\controller.sysj line: 194, column: 3
            capperReq_in.setACK(false);//sysj\controller.sysj line: 194, column: 3
            S97531=1;
            active[13]=1;
            ends[13]=1;
            break RUN;
          }
          else {
            S97526=0;
            if(!capperReq_in.isREQ()){//sysj\controller.sysj line: 194, column: 3
              capperReq_in.setACK(true);//sysj\controller.sysj line: 194, column: 3
              S97526=1;
              if(capperReq_in.isREQ()){//sysj\controller.sysj line: 194, column: 3
                capperReq_in.setACK(false);//sysj\controller.sysj line: 194, column: 3
                ends[13]=2;
                ;//sysj\controller.sysj line: 194, column: 3
                request_thread_13 = (boolean)(capperReq_in.getVal() == null ? false : ((Boolean)capperReq_in.getVal()).booleanValue());//sysj\controller.sysj line: 195, column: 3
                S97547=1;
                if(request_thread_13){//sysj\controller.sysj line: 197, column: 3
                  S98661=0;
                  S97662=0;
                  S97554=0;
                  if(!capperStatus_o.isPartnerPresent() || capperStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 198, column: 4
                    capperStatus_o.setREQ(false);//sysj\controller.sysj line: 198, column: 4
                    S97554=1;
                    active[13]=1;
                    ends[13]=1;
                    break RUN;
                  }
                  else {
                    S97549=0;
                    if(capperStatus_o.isACK()){//sysj\controller.sysj line: 198, column: 4
                      capperStatus_o.setVal("busy");//sysj\controller.sysj line: 198, column: 4
                      S97549=1;
                      if(!capperStatus_o.isACK()){//sysj\controller.sysj line: 198, column: 4
                        capperStatus_o.setREQ(false);//sysj\controller.sysj line: 198, column: 4
                        ends[13]=2;
                        ;//sysj\controller.sysj line: 198, column: 4
                        S97662=1;
                        if(!bottleAtPos4.getprestatus()){//sysj\controller.sysj line: 200, column: 13
                          S97576=0;
                          if(!capperStatus_o.isPartnerPresent() || capperStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 201, column: 5
                            capperStatus_o.setREQ(false);//sysj\controller.sysj line: 201, column: 5
                            S97576=1;
                            active[13]=1;
                            ends[13]=1;
                            break RUN;
                          }
                          else {
                            S97571=0;
                            if(capperStatus_o.isACK()){//sysj\controller.sysj line: 201, column: 5
                              capperStatus_o.setVal("idle");//sysj\controller.sysj line: 201, column: 5
                              S97571=1;
                              if(!capperStatus_o.isACK()){//sysj\controller.sysj line: 201, column: 5
                                capperStatus_o.setREQ(false);//sysj\controller.sysj line: 201, column: 5
                                ends[13]=2;
                                ;//sysj\controller.sysj line: 201, column: 5
                                S97662=2;
                                if(bottleAtPos4.getprestatus()){//sysj\controller.sysj line: 204, column: 12
                                  System.out.println("Capper doing work...");//sysj\controller.sysj line: 205, column: 5
                                  thread113427(tdone,ends);
                                  thread113428(tdone,ends);
                                  thread113429(tdone,ends);
                                  thread113433(tdone,ends);
                                  int biggest113434 = 0;
                                  if(ends[14]>=biggest113434){
                                    biggest113434=ends[14];
                                  }
                                  if(ends[15]>=biggest113434){
                                    biggest113434=ends[15];
                                  }
                                  if(ends[16]>=biggest113434){
                                    biggest113434=ends[16];
                                  }
                                  if(ends[19]>=biggest113434){
                                    biggest113434=ends[19];
                                  }
                                  if(biggest113434 == 1){
                                    active[13]=1;
                                    ends[13]=1;
                                    break RUN;
                                  }
                                }
                                else {
                                  S97662=3;
                                  S98425=0;
                                  if(!capperStatus_o.isPartnerPresent() || capperStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 242, column: 4
                                    capperStatus_o.setREQ(false);//sysj\controller.sysj line: 242, column: 4
                                    S98425=1;
                                    active[13]=1;
                                    ends[13]=1;
                                    break RUN;
                                  }
                                  else {
                                    S98420=0;
                                    if(capperStatus_o.isACK()){//sysj\controller.sysj line: 242, column: 4
                                      capperStatus_o.setVal("done");//sysj\controller.sysj line: 242, column: 4
                                      S98420=1;
                                      if(!capperStatus_o.isACK()){//sysj\controller.sysj line: 242, column: 4
                                        capperStatus_o.setREQ(false);//sysj\controller.sysj line: 242, column: 4
                                        ends[13]=2;
                                        ;//sysj\controller.sysj line: 242, column: 4
                                        S97547=2;
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
                          S97662=2;
                          if(bottleAtPos4.getprestatus()){//sysj\controller.sysj line: 204, column: 12
                            System.out.println("Capper doing work...");//sysj\controller.sysj line: 205, column: 5
                            thread113435(tdone,ends);
                            thread113436(tdone,ends);
                            thread113437(tdone,ends);
                            thread113441(tdone,ends);
                            int biggest113442 = 0;
                            if(ends[14]>=biggest113442){
                              biggest113442=ends[14];
                            }
                            if(ends[15]>=biggest113442){
                              biggest113442=ends[15];
                            }
                            if(ends[16]>=biggest113442){
                              biggest113442=ends[16];
                            }
                            if(ends[19]>=biggest113442){
                              biggest113442=ends[19];
                            }
                            if(biggest113442 == 1){
                              active[13]=1;
                              ends[13]=1;
                              break RUN;
                            }
                          }
                          else {
                            S97662=3;
                            S98425=0;
                            if(!capperStatus_o.isPartnerPresent() || capperStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 242, column: 4
                              capperStatus_o.setREQ(false);//sysj\controller.sysj line: 242, column: 4
                              S98425=1;
                              active[13]=1;
                              ends[13]=1;
                              break RUN;
                            }
                            else {
                              S98420=0;
                              if(capperStatus_o.isACK()){//sysj\controller.sysj line: 242, column: 4
                                capperStatus_o.setVal("done");//sysj\controller.sysj line: 242, column: 4
                                S98420=1;
                                if(!capperStatus_o.isACK()){//sysj\controller.sysj line: 242, column: 4
                                  capperStatus_o.setREQ(false);//sysj\controller.sysj line: 242, column: 4
                                  ends[13]=2;
                                  ;//sysj\controller.sysj line: 242, column: 4
                                  S97547=2;
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
                  S98661=1;
                  S98645=0;
                  if(!capperStatus_o.isPartnerPresent() || capperStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 244, column: 4
                    capperStatus_o.setREQ(false);//sysj\controller.sysj line: 244, column: 4
                    S98645=1;
                    active[13]=1;
                    ends[13]=1;
                    break RUN;
                  }
                  else {
                    S98640=0;
                    if(capperStatus_o.isACK()){//sysj\controller.sysj line: 244, column: 4
                      capperStatus_o.setVal("idle");//sysj\controller.sysj line: 244, column: 4
                      S98640=1;
                      if(!capperStatus_o.isACK()){//sysj\controller.sysj line: 244, column: 4
                        capperStatus_o.setREQ(false);//sysj\controller.sysj line: 244, column: 4
                        ends[13]=2;
                        ;//sysj\controller.sysj line: 244, column: 4
                        S97547=2;
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
          releaseCap_13.setClear();//sysj\controller.sysj line: 191, column: 2
          untwistGripper_13.setClear();//sysj\controller.sysj line: 191, column: 2
          raiseGripper_13.setClear();//sysj\controller.sysj line: 191, column: 2
          unclampBottle_13.setClear();//sysj\controller.sysj line: 191, column: 2
          switch(S97547){
            case 0 : 
              switch(S97531){
                case 0 : 
                  if(!capperReq_in.isPartnerPresent() || capperReq_in.isPartnerPreempted()){//sysj\controller.sysj line: 194, column: 3
                    capperReq_in.setACK(false);//sysj\controller.sysj line: 194, column: 3
                    S97531=1;
                    active[13]=1;
                    ends[13]=1;
                    break RUN;
                  }
                  else {
                    switch(S97526){
                      case 0 : 
                        if(!capperReq_in.isREQ()){//sysj\controller.sysj line: 194, column: 3
                          capperReq_in.setACK(true);//sysj\controller.sysj line: 194, column: 3
                          S97526=1;
                          if(capperReq_in.isREQ()){//sysj\controller.sysj line: 194, column: 3
                            capperReq_in.setACK(false);//sysj\controller.sysj line: 194, column: 3
                            ends[13]=2;
                            ;//sysj\controller.sysj line: 194, column: 3
                            request_thread_13 = (boolean)(capperReq_in.getVal() == null ? false : ((Boolean)capperReq_in.getVal()).booleanValue());//sysj\controller.sysj line: 195, column: 3
                            S97547=1;
                            if(request_thread_13){//sysj\controller.sysj line: 197, column: 3
                              S98661=0;
                              S97662=0;
                              S97554=0;
                              if(!capperStatus_o.isPartnerPresent() || capperStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 198, column: 4
                                capperStatus_o.setREQ(false);//sysj\controller.sysj line: 198, column: 4
                                S97554=1;
                                active[13]=1;
                                ends[13]=1;
                                break RUN;
                              }
                              else {
                                S97549=0;
                                if(capperStatus_o.isACK()){//sysj\controller.sysj line: 198, column: 4
                                  capperStatus_o.setVal("busy");//sysj\controller.sysj line: 198, column: 4
                                  S97549=1;
                                  if(!capperStatus_o.isACK()){//sysj\controller.sysj line: 198, column: 4
                                    capperStatus_o.setREQ(false);//sysj\controller.sysj line: 198, column: 4
                                    ends[13]=2;
                                    ;//sysj\controller.sysj line: 198, column: 4
                                    S97662=1;
                                    if(!bottleAtPos4.getprestatus()){//sysj\controller.sysj line: 200, column: 13
                                      S97576=0;
                                      if(!capperStatus_o.isPartnerPresent() || capperStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 201, column: 5
                                        capperStatus_o.setREQ(false);//sysj\controller.sysj line: 201, column: 5
                                        S97576=1;
                                        active[13]=1;
                                        ends[13]=1;
                                        break RUN;
                                      }
                                      else {
                                        S97571=0;
                                        if(capperStatus_o.isACK()){//sysj\controller.sysj line: 201, column: 5
                                          capperStatus_o.setVal("idle");//sysj\controller.sysj line: 201, column: 5
                                          S97571=1;
                                          if(!capperStatus_o.isACK()){//sysj\controller.sysj line: 201, column: 5
                                            capperStatus_o.setREQ(false);//sysj\controller.sysj line: 201, column: 5
                                            ends[13]=2;
                                            ;//sysj\controller.sysj line: 201, column: 5
                                            S97662=2;
                                            if(bottleAtPos4.getprestatus()){//sysj\controller.sysj line: 204, column: 12
                                              System.out.println("Capper doing work...");//sysj\controller.sysj line: 205, column: 5
                                              thread113443(tdone,ends);
                                              thread113444(tdone,ends);
                                              thread113445(tdone,ends);
                                              thread113449(tdone,ends);
                                              int biggest113450 = 0;
                                              if(ends[14]>=biggest113450){
                                                biggest113450=ends[14];
                                              }
                                              if(ends[15]>=biggest113450){
                                                biggest113450=ends[15];
                                              }
                                              if(ends[16]>=biggest113450){
                                                biggest113450=ends[16];
                                              }
                                              if(ends[19]>=biggest113450){
                                                biggest113450=ends[19];
                                              }
                                              if(biggest113450 == 1){
                                                active[13]=1;
                                                ends[13]=1;
                                                break RUN;
                                              }
                                            }
                                            else {
                                              S97662=3;
                                              S98425=0;
                                              if(!capperStatus_o.isPartnerPresent() || capperStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 242, column: 4
                                                capperStatus_o.setREQ(false);//sysj\controller.sysj line: 242, column: 4
                                                S98425=1;
                                                active[13]=1;
                                                ends[13]=1;
                                                break RUN;
                                              }
                                              else {
                                                S98420=0;
                                                if(capperStatus_o.isACK()){//sysj\controller.sysj line: 242, column: 4
                                                  capperStatus_o.setVal("done");//sysj\controller.sysj line: 242, column: 4
                                                  S98420=1;
                                                  if(!capperStatus_o.isACK()){//sysj\controller.sysj line: 242, column: 4
                                                    capperStatus_o.setREQ(false);//sysj\controller.sysj line: 242, column: 4
                                                    ends[13]=2;
                                                    ;//sysj\controller.sysj line: 242, column: 4
                                                    S97547=2;
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
                                      S97662=2;
                                      if(bottleAtPos4.getprestatus()){//sysj\controller.sysj line: 204, column: 12
                                        System.out.println("Capper doing work...");//sysj\controller.sysj line: 205, column: 5
                                        thread113451(tdone,ends);
                                        thread113452(tdone,ends);
                                        thread113453(tdone,ends);
                                        thread113457(tdone,ends);
                                        int biggest113458 = 0;
                                        if(ends[14]>=biggest113458){
                                          biggest113458=ends[14];
                                        }
                                        if(ends[15]>=biggest113458){
                                          biggest113458=ends[15];
                                        }
                                        if(ends[16]>=biggest113458){
                                          biggest113458=ends[16];
                                        }
                                        if(ends[19]>=biggest113458){
                                          biggest113458=ends[19];
                                        }
                                        if(biggest113458 == 1){
                                          active[13]=1;
                                          ends[13]=1;
                                          break RUN;
                                        }
                                      }
                                      else {
                                        S97662=3;
                                        S98425=0;
                                        if(!capperStatus_o.isPartnerPresent() || capperStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 242, column: 4
                                          capperStatus_o.setREQ(false);//sysj\controller.sysj line: 242, column: 4
                                          S98425=1;
                                          active[13]=1;
                                          ends[13]=1;
                                          break RUN;
                                        }
                                        else {
                                          S98420=0;
                                          if(capperStatus_o.isACK()){//sysj\controller.sysj line: 242, column: 4
                                            capperStatus_o.setVal("done");//sysj\controller.sysj line: 242, column: 4
                                            S98420=1;
                                            if(!capperStatus_o.isACK()){//sysj\controller.sysj line: 242, column: 4
                                              capperStatus_o.setREQ(false);//sysj\controller.sysj line: 242, column: 4
                                              ends[13]=2;
                                              ;//sysj\controller.sysj line: 242, column: 4
                                              S97547=2;
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
                              S98661=1;
                              S98645=0;
                              if(!capperStatus_o.isPartnerPresent() || capperStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 244, column: 4
                                capperStatus_o.setREQ(false);//sysj\controller.sysj line: 244, column: 4
                                S98645=1;
                                active[13]=1;
                                ends[13]=1;
                                break RUN;
                              }
                              else {
                                S98640=0;
                                if(capperStatus_o.isACK()){//sysj\controller.sysj line: 244, column: 4
                                  capperStatus_o.setVal("idle");//sysj\controller.sysj line: 244, column: 4
                                  S98640=1;
                                  if(!capperStatus_o.isACK()){//sysj\controller.sysj line: 244, column: 4
                                    capperStatus_o.setREQ(false);//sysj\controller.sysj line: 244, column: 4
                                    ends[13]=2;
                                    ;//sysj\controller.sysj line: 244, column: 4
                                    S97547=2;
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
                        if(capperReq_in.isREQ()){//sysj\controller.sysj line: 194, column: 3
                          capperReq_in.setACK(false);//sysj\controller.sysj line: 194, column: 3
                          ends[13]=2;
                          ;//sysj\controller.sysj line: 194, column: 3
                          request_thread_13 = (boolean)(capperReq_in.getVal() == null ? false : ((Boolean)capperReq_in.getVal()).booleanValue());//sysj\controller.sysj line: 195, column: 3
                          S97547=1;
                          if(request_thread_13){//sysj\controller.sysj line: 197, column: 3
                            S98661=0;
                            S97662=0;
                            S97554=0;
                            if(!capperStatus_o.isPartnerPresent() || capperStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 198, column: 4
                              capperStatus_o.setREQ(false);//sysj\controller.sysj line: 198, column: 4
                              S97554=1;
                              active[13]=1;
                              ends[13]=1;
                              break RUN;
                            }
                            else {
                              S97549=0;
                              if(capperStatus_o.isACK()){//sysj\controller.sysj line: 198, column: 4
                                capperStatus_o.setVal("busy");//sysj\controller.sysj line: 198, column: 4
                                S97549=1;
                                if(!capperStatus_o.isACK()){//sysj\controller.sysj line: 198, column: 4
                                  capperStatus_o.setREQ(false);//sysj\controller.sysj line: 198, column: 4
                                  ends[13]=2;
                                  ;//sysj\controller.sysj line: 198, column: 4
                                  S97662=1;
                                  if(!bottleAtPos4.getprestatus()){//sysj\controller.sysj line: 200, column: 13
                                    S97576=0;
                                    if(!capperStatus_o.isPartnerPresent() || capperStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 201, column: 5
                                      capperStatus_o.setREQ(false);//sysj\controller.sysj line: 201, column: 5
                                      S97576=1;
                                      active[13]=1;
                                      ends[13]=1;
                                      break RUN;
                                    }
                                    else {
                                      S97571=0;
                                      if(capperStatus_o.isACK()){//sysj\controller.sysj line: 201, column: 5
                                        capperStatus_o.setVal("idle");//sysj\controller.sysj line: 201, column: 5
                                        S97571=1;
                                        if(!capperStatus_o.isACK()){//sysj\controller.sysj line: 201, column: 5
                                          capperStatus_o.setREQ(false);//sysj\controller.sysj line: 201, column: 5
                                          ends[13]=2;
                                          ;//sysj\controller.sysj line: 201, column: 5
                                          S97662=2;
                                          if(bottleAtPos4.getprestatus()){//sysj\controller.sysj line: 204, column: 12
                                            System.out.println("Capper doing work...");//sysj\controller.sysj line: 205, column: 5
                                            thread113459(tdone,ends);
                                            thread113460(tdone,ends);
                                            thread113461(tdone,ends);
                                            thread113465(tdone,ends);
                                            int biggest113466 = 0;
                                            if(ends[14]>=biggest113466){
                                              biggest113466=ends[14];
                                            }
                                            if(ends[15]>=biggest113466){
                                              biggest113466=ends[15];
                                            }
                                            if(ends[16]>=biggest113466){
                                              biggest113466=ends[16];
                                            }
                                            if(ends[19]>=biggest113466){
                                              biggest113466=ends[19];
                                            }
                                            if(biggest113466 == 1){
                                              active[13]=1;
                                              ends[13]=1;
                                              break RUN;
                                            }
                                          }
                                          else {
                                            S97662=3;
                                            S98425=0;
                                            if(!capperStatus_o.isPartnerPresent() || capperStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 242, column: 4
                                              capperStatus_o.setREQ(false);//sysj\controller.sysj line: 242, column: 4
                                              S98425=1;
                                              active[13]=1;
                                              ends[13]=1;
                                              break RUN;
                                            }
                                            else {
                                              S98420=0;
                                              if(capperStatus_o.isACK()){//sysj\controller.sysj line: 242, column: 4
                                                capperStatus_o.setVal("done");//sysj\controller.sysj line: 242, column: 4
                                                S98420=1;
                                                if(!capperStatus_o.isACK()){//sysj\controller.sysj line: 242, column: 4
                                                  capperStatus_o.setREQ(false);//sysj\controller.sysj line: 242, column: 4
                                                  ends[13]=2;
                                                  ;//sysj\controller.sysj line: 242, column: 4
                                                  S97547=2;
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
                                    S97662=2;
                                    if(bottleAtPos4.getprestatus()){//sysj\controller.sysj line: 204, column: 12
                                      System.out.println("Capper doing work...");//sysj\controller.sysj line: 205, column: 5
                                      thread113467(tdone,ends);
                                      thread113468(tdone,ends);
                                      thread113469(tdone,ends);
                                      thread113473(tdone,ends);
                                      int biggest113474 = 0;
                                      if(ends[14]>=biggest113474){
                                        biggest113474=ends[14];
                                      }
                                      if(ends[15]>=biggest113474){
                                        biggest113474=ends[15];
                                      }
                                      if(ends[16]>=biggest113474){
                                        biggest113474=ends[16];
                                      }
                                      if(ends[19]>=biggest113474){
                                        biggest113474=ends[19];
                                      }
                                      if(biggest113474 == 1){
                                        active[13]=1;
                                        ends[13]=1;
                                        break RUN;
                                      }
                                    }
                                    else {
                                      S97662=3;
                                      S98425=0;
                                      if(!capperStatus_o.isPartnerPresent() || capperStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 242, column: 4
                                        capperStatus_o.setREQ(false);//sysj\controller.sysj line: 242, column: 4
                                        S98425=1;
                                        active[13]=1;
                                        ends[13]=1;
                                        break RUN;
                                      }
                                      else {
                                        S98420=0;
                                        if(capperStatus_o.isACK()){//sysj\controller.sysj line: 242, column: 4
                                          capperStatus_o.setVal("done");//sysj\controller.sysj line: 242, column: 4
                                          S98420=1;
                                          if(!capperStatus_o.isACK()){//sysj\controller.sysj line: 242, column: 4
                                            capperStatus_o.setREQ(false);//sysj\controller.sysj line: 242, column: 4
                                            ends[13]=2;
                                            ;//sysj\controller.sysj line: 242, column: 4
                                            S97547=2;
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
                            S98661=1;
                            S98645=0;
                            if(!capperStatus_o.isPartnerPresent() || capperStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 244, column: 4
                              capperStatus_o.setREQ(false);//sysj\controller.sysj line: 244, column: 4
                              S98645=1;
                              active[13]=1;
                              ends[13]=1;
                              break RUN;
                            }
                            else {
                              S98640=0;
                              if(capperStatus_o.isACK()){//sysj\controller.sysj line: 244, column: 4
                                capperStatus_o.setVal("idle");//sysj\controller.sysj line: 244, column: 4
                                S98640=1;
                                if(!capperStatus_o.isACK()){//sysj\controller.sysj line: 244, column: 4
                                  capperStatus_o.setREQ(false);//sysj\controller.sysj line: 244, column: 4
                                  ends[13]=2;
                                  ;//sysj\controller.sysj line: 244, column: 4
                                  S97547=2;
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
                  S97531=1;
                  S97531=0;
                  if(!capperReq_in.isPartnerPresent() || capperReq_in.isPartnerPreempted()){//sysj\controller.sysj line: 194, column: 3
                    capperReq_in.setACK(false);//sysj\controller.sysj line: 194, column: 3
                    S97531=1;
                    active[13]=1;
                    ends[13]=1;
                    break RUN;
                  }
                  else {
                    S97526=0;
                    if(!capperReq_in.isREQ()){//sysj\controller.sysj line: 194, column: 3
                      capperReq_in.setACK(true);//sysj\controller.sysj line: 194, column: 3
                      S97526=1;
                      if(capperReq_in.isREQ()){//sysj\controller.sysj line: 194, column: 3
                        capperReq_in.setACK(false);//sysj\controller.sysj line: 194, column: 3
                        ends[13]=2;
                        ;//sysj\controller.sysj line: 194, column: 3
                        request_thread_13 = (boolean)(capperReq_in.getVal() == null ? false : ((Boolean)capperReq_in.getVal()).booleanValue());//sysj\controller.sysj line: 195, column: 3
                        S97547=1;
                        if(request_thread_13){//sysj\controller.sysj line: 197, column: 3
                          S98661=0;
                          S97662=0;
                          S97554=0;
                          if(!capperStatus_o.isPartnerPresent() || capperStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 198, column: 4
                            capperStatus_o.setREQ(false);//sysj\controller.sysj line: 198, column: 4
                            S97554=1;
                            active[13]=1;
                            ends[13]=1;
                            break RUN;
                          }
                          else {
                            S97549=0;
                            if(capperStatus_o.isACK()){//sysj\controller.sysj line: 198, column: 4
                              capperStatus_o.setVal("busy");//sysj\controller.sysj line: 198, column: 4
                              S97549=1;
                              if(!capperStatus_o.isACK()){//sysj\controller.sysj line: 198, column: 4
                                capperStatus_o.setREQ(false);//sysj\controller.sysj line: 198, column: 4
                                ends[13]=2;
                                ;//sysj\controller.sysj line: 198, column: 4
                                S97662=1;
                                if(!bottleAtPos4.getprestatus()){//sysj\controller.sysj line: 200, column: 13
                                  S97576=0;
                                  if(!capperStatus_o.isPartnerPresent() || capperStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 201, column: 5
                                    capperStatus_o.setREQ(false);//sysj\controller.sysj line: 201, column: 5
                                    S97576=1;
                                    active[13]=1;
                                    ends[13]=1;
                                    break RUN;
                                  }
                                  else {
                                    S97571=0;
                                    if(capperStatus_o.isACK()){//sysj\controller.sysj line: 201, column: 5
                                      capperStatus_o.setVal("idle");//sysj\controller.sysj line: 201, column: 5
                                      S97571=1;
                                      if(!capperStatus_o.isACK()){//sysj\controller.sysj line: 201, column: 5
                                        capperStatus_o.setREQ(false);//sysj\controller.sysj line: 201, column: 5
                                        ends[13]=2;
                                        ;//sysj\controller.sysj line: 201, column: 5
                                        S97662=2;
                                        if(bottleAtPos4.getprestatus()){//sysj\controller.sysj line: 204, column: 12
                                          System.out.println("Capper doing work...");//sysj\controller.sysj line: 205, column: 5
                                          thread113475(tdone,ends);
                                          thread113476(tdone,ends);
                                          thread113477(tdone,ends);
                                          thread113481(tdone,ends);
                                          int biggest113482 = 0;
                                          if(ends[14]>=biggest113482){
                                            biggest113482=ends[14];
                                          }
                                          if(ends[15]>=biggest113482){
                                            biggest113482=ends[15];
                                          }
                                          if(ends[16]>=biggest113482){
                                            biggest113482=ends[16];
                                          }
                                          if(ends[19]>=biggest113482){
                                            biggest113482=ends[19];
                                          }
                                          if(biggest113482 == 1){
                                            active[13]=1;
                                            ends[13]=1;
                                            break RUN;
                                          }
                                        }
                                        else {
                                          S97662=3;
                                          S98425=0;
                                          if(!capperStatus_o.isPartnerPresent() || capperStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 242, column: 4
                                            capperStatus_o.setREQ(false);//sysj\controller.sysj line: 242, column: 4
                                            S98425=1;
                                            active[13]=1;
                                            ends[13]=1;
                                            break RUN;
                                          }
                                          else {
                                            S98420=0;
                                            if(capperStatus_o.isACK()){//sysj\controller.sysj line: 242, column: 4
                                              capperStatus_o.setVal("done");//sysj\controller.sysj line: 242, column: 4
                                              S98420=1;
                                              if(!capperStatus_o.isACK()){//sysj\controller.sysj line: 242, column: 4
                                                capperStatus_o.setREQ(false);//sysj\controller.sysj line: 242, column: 4
                                                ends[13]=2;
                                                ;//sysj\controller.sysj line: 242, column: 4
                                                S97547=2;
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
                                  S97662=2;
                                  if(bottleAtPos4.getprestatus()){//sysj\controller.sysj line: 204, column: 12
                                    System.out.println("Capper doing work...");//sysj\controller.sysj line: 205, column: 5
                                    thread113483(tdone,ends);
                                    thread113484(tdone,ends);
                                    thread113485(tdone,ends);
                                    thread113489(tdone,ends);
                                    int biggest113490 = 0;
                                    if(ends[14]>=biggest113490){
                                      biggest113490=ends[14];
                                    }
                                    if(ends[15]>=biggest113490){
                                      biggest113490=ends[15];
                                    }
                                    if(ends[16]>=biggest113490){
                                      biggest113490=ends[16];
                                    }
                                    if(ends[19]>=biggest113490){
                                      biggest113490=ends[19];
                                    }
                                    if(biggest113490 == 1){
                                      active[13]=1;
                                      ends[13]=1;
                                      break RUN;
                                    }
                                  }
                                  else {
                                    S97662=3;
                                    S98425=0;
                                    if(!capperStatus_o.isPartnerPresent() || capperStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 242, column: 4
                                      capperStatus_o.setREQ(false);//sysj\controller.sysj line: 242, column: 4
                                      S98425=1;
                                      active[13]=1;
                                      ends[13]=1;
                                      break RUN;
                                    }
                                    else {
                                      S98420=0;
                                      if(capperStatus_o.isACK()){//sysj\controller.sysj line: 242, column: 4
                                        capperStatus_o.setVal("done");//sysj\controller.sysj line: 242, column: 4
                                        S98420=1;
                                        if(!capperStatus_o.isACK()){//sysj\controller.sysj line: 242, column: 4
                                          capperStatus_o.setREQ(false);//sysj\controller.sysj line: 242, column: 4
                                          ends[13]=2;
                                          ;//sysj\controller.sysj line: 242, column: 4
                                          S97547=2;
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
                          S98661=1;
                          S98645=0;
                          if(!capperStatus_o.isPartnerPresent() || capperStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 244, column: 4
                            capperStatus_o.setREQ(false);//sysj\controller.sysj line: 244, column: 4
                            S98645=1;
                            active[13]=1;
                            ends[13]=1;
                            break RUN;
                          }
                          else {
                            S98640=0;
                            if(capperStatus_o.isACK()){//sysj\controller.sysj line: 244, column: 4
                              capperStatus_o.setVal("idle");//sysj\controller.sysj line: 244, column: 4
                              S98640=1;
                              if(!capperStatus_o.isACK()){//sysj\controller.sysj line: 244, column: 4
                                capperStatus_o.setREQ(false);//sysj\controller.sysj line: 244, column: 4
                                ends[13]=2;
                                ;//sysj\controller.sysj line: 244, column: 4
                                S97547=2;
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
              switch(S98661){
                case 0 : 
                  switch(S97662){
                    case 0 : 
                      switch(S97554){
                        case 0 : 
                          if(!capperStatus_o.isPartnerPresent() || capperStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 198, column: 4
                            capperStatus_o.setREQ(false);//sysj\controller.sysj line: 198, column: 4
                            S97554=1;
                            active[13]=1;
                            ends[13]=1;
                            break RUN;
                          }
                          else {
                            switch(S97549){
                              case 0 : 
                                if(capperStatus_o.isACK()){//sysj\controller.sysj line: 198, column: 4
                                  capperStatus_o.setVal("busy");//sysj\controller.sysj line: 198, column: 4
                                  S97549=1;
                                  if(!capperStatus_o.isACK()){//sysj\controller.sysj line: 198, column: 4
                                    capperStatus_o.setREQ(false);//sysj\controller.sysj line: 198, column: 4
                                    ends[13]=2;
                                    ;//sysj\controller.sysj line: 198, column: 4
                                    S97662=1;
                                    if(!bottleAtPos4.getprestatus()){//sysj\controller.sysj line: 200, column: 13
                                      S97576=0;
                                      if(!capperStatus_o.isPartnerPresent() || capperStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 201, column: 5
                                        capperStatus_o.setREQ(false);//sysj\controller.sysj line: 201, column: 5
                                        S97576=1;
                                        active[13]=1;
                                        ends[13]=1;
                                        break RUN;
                                      }
                                      else {
                                        S97571=0;
                                        if(capperStatus_o.isACK()){//sysj\controller.sysj line: 201, column: 5
                                          capperStatus_o.setVal("idle");//sysj\controller.sysj line: 201, column: 5
                                          S97571=1;
                                          if(!capperStatus_o.isACK()){//sysj\controller.sysj line: 201, column: 5
                                            capperStatus_o.setREQ(false);//sysj\controller.sysj line: 201, column: 5
                                            ends[13]=2;
                                            ;//sysj\controller.sysj line: 201, column: 5
                                            S97662=2;
                                            if(bottleAtPos4.getprestatus()){//sysj\controller.sysj line: 204, column: 12
                                              System.out.println("Capper doing work...");//sysj\controller.sysj line: 205, column: 5
                                              thread113491(tdone,ends);
                                              thread113492(tdone,ends);
                                              thread113493(tdone,ends);
                                              thread113497(tdone,ends);
                                              int biggest113498 = 0;
                                              if(ends[14]>=biggest113498){
                                                biggest113498=ends[14];
                                              }
                                              if(ends[15]>=biggest113498){
                                                biggest113498=ends[15];
                                              }
                                              if(ends[16]>=biggest113498){
                                                biggest113498=ends[16];
                                              }
                                              if(ends[19]>=biggest113498){
                                                biggest113498=ends[19];
                                              }
                                              if(biggest113498 == 1){
                                                active[13]=1;
                                                ends[13]=1;
                                                break RUN;
                                              }
                                            }
                                            else {
                                              S97662=3;
                                              S98425=0;
                                              if(!capperStatus_o.isPartnerPresent() || capperStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 242, column: 4
                                                capperStatus_o.setREQ(false);//sysj\controller.sysj line: 242, column: 4
                                                S98425=1;
                                                active[13]=1;
                                                ends[13]=1;
                                                break RUN;
                                              }
                                              else {
                                                S98420=0;
                                                if(capperStatus_o.isACK()){//sysj\controller.sysj line: 242, column: 4
                                                  capperStatus_o.setVal("done");//sysj\controller.sysj line: 242, column: 4
                                                  S98420=1;
                                                  if(!capperStatus_o.isACK()){//sysj\controller.sysj line: 242, column: 4
                                                    capperStatus_o.setREQ(false);//sysj\controller.sysj line: 242, column: 4
                                                    ends[13]=2;
                                                    ;//sysj\controller.sysj line: 242, column: 4
                                                    S97547=2;
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
                                      S97662=2;
                                      if(bottleAtPos4.getprestatus()){//sysj\controller.sysj line: 204, column: 12
                                        System.out.println("Capper doing work...");//sysj\controller.sysj line: 205, column: 5
                                        thread113499(tdone,ends);
                                        thread113500(tdone,ends);
                                        thread113501(tdone,ends);
                                        thread113505(tdone,ends);
                                        int biggest113506 = 0;
                                        if(ends[14]>=biggest113506){
                                          biggest113506=ends[14];
                                        }
                                        if(ends[15]>=biggest113506){
                                          biggest113506=ends[15];
                                        }
                                        if(ends[16]>=biggest113506){
                                          biggest113506=ends[16];
                                        }
                                        if(ends[19]>=biggest113506){
                                          biggest113506=ends[19];
                                        }
                                        if(biggest113506 == 1){
                                          active[13]=1;
                                          ends[13]=1;
                                          break RUN;
                                        }
                                      }
                                      else {
                                        S97662=3;
                                        S98425=0;
                                        if(!capperStatus_o.isPartnerPresent() || capperStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 242, column: 4
                                          capperStatus_o.setREQ(false);//sysj\controller.sysj line: 242, column: 4
                                          S98425=1;
                                          active[13]=1;
                                          ends[13]=1;
                                          break RUN;
                                        }
                                        else {
                                          S98420=0;
                                          if(capperStatus_o.isACK()){//sysj\controller.sysj line: 242, column: 4
                                            capperStatus_o.setVal("done");//sysj\controller.sysj line: 242, column: 4
                                            S98420=1;
                                            if(!capperStatus_o.isACK()){//sysj\controller.sysj line: 242, column: 4
                                              capperStatus_o.setREQ(false);//sysj\controller.sysj line: 242, column: 4
                                              ends[13]=2;
                                              ;//sysj\controller.sysj line: 242, column: 4
                                              S97547=2;
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
                                if(!capperStatus_o.isACK()){//sysj\controller.sysj line: 198, column: 4
                                  capperStatus_o.setREQ(false);//sysj\controller.sysj line: 198, column: 4
                                  ends[13]=2;
                                  ;//sysj\controller.sysj line: 198, column: 4
                                  S97662=1;
                                  if(!bottleAtPos4.getprestatus()){//sysj\controller.sysj line: 200, column: 13
                                    S97576=0;
                                    if(!capperStatus_o.isPartnerPresent() || capperStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 201, column: 5
                                      capperStatus_o.setREQ(false);//sysj\controller.sysj line: 201, column: 5
                                      S97576=1;
                                      active[13]=1;
                                      ends[13]=1;
                                      break RUN;
                                    }
                                    else {
                                      S97571=0;
                                      if(capperStatus_o.isACK()){//sysj\controller.sysj line: 201, column: 5
                                        capperStatus_o.setVal("idle");//sysj\controller.sysj line: 201, column: 5
                                        S97571=1;
                                        if(!capperStatus_o.isACK()){//sysj\controller.sysj line: 201, column: 5
                                          capperStatus_o.setREQ(false);//sysj\controller.sysj line: 201, column: 5
                                          ends[13]=2;
                                          ;//sysj\controller.sysj line: 201, column: 5
                                          S97662=2;
                                          if(bottleAtPos4.getprestatus()){//sysj\controller.sysj line: 204, column: 12
                                            System.out.println("Capper doing work...");//sysj\controller.sysj line: 205, column: 5
                                            thread113507(tdone,ends);
                                            thread113508(tdone,ends);
                                            thread113509(tdone,ends);
                                            thread113513(tdone,ends);
                                            int biggest113514 = 0;
                                            if(ends[14]>=biggest113514){
                                              biggest113514=ends[14];
                                            }
                                            if(ends[15]>=biggest113514){
                                              biggest113514=ends[15];
                                            }
                                            if(ends[16]>=biggest113514){
                                              biggest113514=ends[16];
                                            }
                                            if(ends[19]>=biggest113514){
                                              biggest113514=ends[19];
                                            }
                                            if(biggest113514 == 1){
                                              active[13]=1;
                                              ends[13]=1;
                                              break RUN;
                                            }
                                          }
                                          else {
                                            S97662=3;
                                            S98425=0;
                                            if(!capperStatus_o.isPartnerPresent() || capperStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 242, column: 4
                                              capperStatus_o.setREQ(false);//sysj\controller.sysj line: 242, column: 4
                                              S98425=1;
                                              active[13]=1;
                                              ends[13]=1;
                                              break RUN;
                                            }
                                            else {
                                              S98420=0;
                                              if(capperStatus_o.isACK()){//sysj\controller.sysj line: 242, column: 4
                                                capperStatus_o.setVal("done");//sysj\controller.sysj line: 242, column: 4
                                                S98420=1;
                                                if(!capperStatus_o.isACK()){//sysj\controller.sysj line: 242, column: 4
                                                  capperStatus_o.setREQ(false);//sysj\controller.sysj line: 242, column: 4
                                                  ends[13]=2;
                                                  ;//sysj\controller.sysj line: 242, column: 4
                                                  S97547=2;
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
                                    S97662=2;
                                    if(bottleAtPos4.getprestatus()){//sysj\controller.sysj line: 204, column: 12
                                      System.out.println("Capper doing work...");//sysj\controller.sysj line: 205, column: 5
                                      thread113515(tdone,ends);
                                      thread113516(tdone,ends);
                                      thread113517(tdone,ends);
                                      thread113521(tdone,ends);
                                      int biggest113522 = 0;
                                      if(ends[14]>=biggest113522){
                                        biggest113522=ends[14];
                                      }
                                      if(ends[15]>=biggest113522){
                                        biggest113522=ends[15];
                                      }
                                      if(ends[16]>=biggest113522){
                                        biggest113522=ends[16];
                                      }
                                      if(ends[19]>=biggest113522){
                                        biggest113522=ends[19];
                                      }
                                      if(biggest113522 == 1){
                                        active[13]=1;
                                        ends[13]=1;
                                        break RUN;
                                      }
                                    }
                                    else {
                                      S97662=3;
                                      S98425=0;
                                      if(!capperStatus_o.isPartnerPresent() || capperStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 242, column: 4
                                        capperStatus_o.setREQ(false);//sysj\controller.sysj line: 242, column: 4
                                        S98425=1;
                                        active[13]=1;
                                        ends[13]=1;
                                        break RUN;
                                      }
                                      else {
                                        S98420=0;
                                        if(capperStatus_o.isACK()){//sysj\controller.sysj line: 242, column: 4
                                          capperStatus_o.setVal("done");//sysj\controller.sysj line: 242, column: 4
                                          S98420=1;
                                          if(!capperStatus_o.isACK()){//sysj\controller.sysj line: 242, column: 4
                                            capperStatus_o.setREQ(false);//sysj\controller.sysj line: 242, column: 4
                                            ends[13]=2;
                                            ;//sysj\controller.sysj line: 242, column: 4
                                            S97547=2;
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
                          S97554=1;
                          S97554=0;
                          if(!capperStatus_o.isPartnerPresent() || capperStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 198, column: 4
                            capperStatus_o.setREQ(false);//sysj\controller.sysj line: 198, column: 4
                            S97554=1;
                            active[13]=1;
                            ends[13]=1;
                            break RUN;
                          }
                          else {
                            S97549=0;
                            if(capperStatus_o.isACK()){//sysj\controller.sysj line: 198, column: 4
                              capperStatus_o.setVal("busy");//sysj\controller.sysj line: 198, column: 4
                              S97549=1;
                              if(!capperStatus_o.isACK()){//sysj\controller.sysj line: 198, column: 4
                                capperStatus_o.setREQ(false);//sysj\controller.sysj line: 198, column: 4
                                ends[13]=2;
                                ;//sysj\controller.sysj line: 198, column: 4
                                S97662=1;
                                if(!bottleAtPos4.getprestatus()){//sysj\controller.sysj line: 200, column: 13
                                  S97576=0;
                                  if(!capperStatus_o.isPartnerPresent() || capperStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 201, column: 5
                                    capperStatus_o.setREQ(false);//sysj\controller.sysj line: 201, column: 5
                                    S97576=1;
                                    active[13]=1;
                                    ends[13]=1;
                                    break RUN;
                                  }
                                  else {
                                    S97571=0;
                                    if(capperStatus_o.isACK()){//sysj\controller.sysj line: 201, column: 5
                                      capperStatus_o.setVal("idle");//sysj\controller.sysj line: 201, column: 5
                                      S97571=1;
                                      if(!capperStatus_o.isACK()){//sysj\controller.sysj line: 201, column: 5
                                        capperStatus_o.setREQ(false);//sysj\controller.sysj line: 201, column: 5
                                        ends[13]=2;
                                        ;//sysj\controller.sysj line: 201, column: 5
                                        S97662=2;
                                        if(bottleAtPos4.getprestatus()){//sysj\controller.sysj line: 204, column: 12
                                          System.out.println("Capper doing work...");//sysj\controller.sysj line: 205, column: 5
                                          thread113523(tdone,ends);
                                          thread113524(tdone,ends);
                                          thread113525(tdone,ends);
                                          thread113529(tdone,ends);
                                          int biggest113530 = 0;
                                          if(ends[14]>=biggest113530){
                                            biggest113530=ends[14];
                                          }
                                          if(ends[15]>=biggest113530){
                                            biggest113530=ends[15];
                                          }
                                          if(ends[16]>=biggest113530){
                                            biggest113530=ends[16];
                                          }
                                          if(ends[19]>=biggest113530){
                                            biggest113530=ends[19];
                                          }
                                          if(biggest113530 == 1){
                                            active[13]=1;
                                            ends[13]=1;
                                            break RUN;
                                          }
                                        }
                                        else {
                                          S97662=3;
                                          S98425=0;
                                          if(!capperStatus_o.isPartnerPresent() || capperStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 242, column: 4
                                            capperStatus_o.setREQ(false);//sysj\controller.sysj line: 242, column: 4
                                            S98425=1;
                                            active[13]=1;
                                            ends[13]=1;
                                            break RUN;
                                          }
                                          else {
                                            S98420=0;
                                            if(capperStatus_o.isACK()){//sysj\controller.sysj line: 242, column: 4
                                              capperStatus_o.setVal("done");//sysj\controller.sysj line: 242, column: 4
                                              S98420=1;
                                              if(!capperStatus_o.isACK()){//sysj\controller.sysj line: 242, column: 4
                                                capperStatus_o.setREQ(false);//sysj\controller.sysj line: 242, column: 4
                                                ends[13]=2;
                                                ;//sysj\controller.sysj line: 242, column: 4
                                                S97547=2;
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
                                  S97662=2;
                                  if(bottleAtPos4.getprestatus()){//sysj\controller.sysj line: 204, column: 12
                                    System.out.println("Capper doing work...");//sysj\controller.sysj line: 205, column: 5
                                    thread113531(tdone,ends);
                                    thread113532(tdone,ends);
                                    thread113533(tdone,ends);
                                    thread113537(tdone,ends);
                                    int biggest113538 = 0;
                                    if(ends[14]>=biggest113538){
                                      biggest113538=ends[14];
                                    }
                                    if(ends[15]>=biggest113538){
                                      biggest113538=ends[15];
                                    }
                                    if(ends[16]>=biggest113538){
                                      biggest113538=ends[16];
                                    }
                                    if(ends[19]>=biggest113538){
                                      biggest113538=ends[19];
                                    }
                                    if(biggest113538 == 1){
                                      active[13]=1;
                                      ends[13]=1;
                                      break RUN;
                                    }
                                  }
                                  else {
                                    S97662=3;
                                    S98425=0;
                                    if(!capperStatus_o.isPartnerPresent() || capperStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 242, column: 4
                                      capperStatus_o.setREQ(false);//sysj\controller.sysj line: 242, column: 4
                                      S98425=1;
                                      active[13]=1;
                                      ends[13]=1;
                                      break RUN;
                                    }
                                    else {
                                      S98420=0;
                                      if(capperStatus_o.isACK()){//sysj\controller.sysj line: 242, column: 4
                                        capperStatus_o.setVal("done");//sysj\controller.sysj line: 242, column: 4
                                        S98420=1;
                                        if(!capperStatus_o.isACK()){//sysj\controller.sysj line: 242, column: 4
                                          capperStatus_o.setREQ(false);//sysj\controller.sysj line: 242, column: 4
                                          ends[13]=2;
                                          ;//sysj\controller.sysj line: 242, column: 4
                                          S97547=2;
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
                      switch(S97576){
                        case 0 : 
                          if(!capperStatus_o.isPartnerPresent() || capperStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 201, column: 5
                            capperStatus_o.setREQ(false);//sysj\controller.sysj line: 201, column: 5
                            S97576=1;
                            active[13]=1;
                            ends[13]=1;
                            break RUN;
                          }
                          else {
                            switch(S97571){
                              case 0 : 
                                if(capperStatus_o.isACK()){//sysj\controller.sysj line: 201, column: 5
                                  capperStatus_o.setVal("idle");//sysj\controller.sysj line: 201, column: 5
                                  S97571=1;
                                  if(!capperStatus_o.isACK()){//sysj\controller.sysj line: 201, column: 5
                                    capperStatus_o.setREQ(false);//sysj\controller.sysj line: 201, column: 5
                                    ends[13]=2;
                                    ;//sysj\controller.sysj line: 201, column: 5
                                    S97662=2;
                                    if(bottleAtPos4.getprestatus()){//sysj\controller.sysj line: 204, column: 12
                                      System.out.println("Capper doing work...");//sysj\controller.sysj line: 205, column: 5
                                      thread113539(tdone,ends);
                                      thread113540(tdone,ends);
                                      thread113541(tdone,ends);
                                      thread113545(tdone,ends);
                                      int biggest113546 = 0;
                                      if(ends[14]>=biggest113546){
                                        biggest113546=ends[14];
                                      }
                                      if(ends[15]>=biggest113546){
                                        biggest113546=ends[15];
                                      }
                                      if(ends[16]>=biggest113546){
                                        biggest113546=ends[16];
                                      }
                                      if(ends[19]>=biggest113546){
                                        biggest113546=ends[19];
                                      }
                                      if(biggest113546 == 1){
                                        active[13]=1;
                                        ends[13]=1;
                                        break RUN;
                                      }
                                    }
                                    else {
                                      S97662=3;
                                      S98425=0;
                                      if(!capperStatus_o.isPartnerPresent() || capperStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 242, column: 4
                                        capperStatus_o.setREQ(false);//sysj\controller.sysj line: 242, column: 4
                                        S98425=1;
                                        active[13]=1;
                                        ends[13]=1;
                                        break RUN;
                                      }
                                      else {
                                        S98420=0;
                                        if(capperStatus_o.isACK()){//sysj\controller.sysj line: 242, column: 4
                                          capperStatus_o.setVal("done");//sysj\controller.sysj line: 242, column: 4
                                          S98420=1;
                                          if(!capperStatus_o.isACK()){//sysj\controller.sysj line: 242, column: 4
                                            capperStatus_o.setREQ(false);//sysj\controller.sysj line: 242, column: 4
                                            ends[13]=2;
                                            ;//sysj\controller.sysj line: 242, column: 4
                                            S97547=2;
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
                                if(!capperStatus_o.isACK()){//sysj\controller.sysj line: 201, column: 5
                                  capperStatus_o.setREQ(false);//sysj\controller.sysj line: 201, column: 5
                                  ends[13]=2;
                                  ;//sysj\controller.sysj line: 201, column: 5
                                  S97662=2;
                                  if(bottleAtPos4.getprestatus()){//sysj\controller.sysj line: 204, column: 12
                                    System.out.println("Capper doing work...");//sysj\controller.sysj line: 205, column: 5
                                    thread113547(tdone,ends);
                                    thread113548(tdone,ends);
                                    thread113549(tdone,ends);
                                    thread113553(tdone,ends);
                                    int biggest113554 = 0;
                                    if(ends[14]>=biggest113554){
                                      biggest113554=ends[14];
                                    }
                                    if(ends[15]>=biggest113554){
                                      biggest113554=ends[15];
                                    }
                                    if(ends[16]>=biggest113554){
                                      biggest113554=ends[16];
                                    }
                                    if(ends[19]>=biggest113554){
                                      biggest113554=ends[19];
                                    }
                                    if(biggest113554 == 1){
                                      active[13]=1;
                                      ends[13]=1;
                                      break RUN;
                                    }
                                  }
                                  else {
                                    S97662=3;
                                    S98425=0;
                                    if(!capperStatus_o.isPartnerPresent() || capperStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 242, column: 4
                                      capperStatus_o.setREQ(false);//sysj\controller.sysj line: 242, column: 4
                                      S98425=1;
                                      active[13]=1;
                                      ends[13]=1;
                                      break RUN;
                                    }
                                    else {
                                      S98420=0;
                                      if(capperStatus_o.isACK()){//sysj\controller.sysj line: 242, column: 4
                                        capperStatus_o.setVal("done");//sysj\controller.sysj line: 242, column: 4
                                        S98420=1;
                                        if(!capperStatus_o.isACK()){//sysj\controller.sysj line: 242, column: 4
                                          capperStatus_o.setREQ(false);//sysj\controller.sysj line: 242, column: 4
                                          ends[13]=2;
                                          ;//sysj\controller.sysj line: 242, column: 4
                                          S97547=2;
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
                          S97576=1;
                          S97576=0;
                          if(!capperStatus_o.isPartnerPresent() || capperStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 201, column: 5
                            capperStatus_o.setREQ(false);//sysj\controller.sysj line: 201, column: 5
                            S97576=1;
                            active[13]=1;
                            ends[13]=1;
                            break RUN;
                          }
                          else {
                            S97571=0;
                            if(capperStatus_o.isACK()){//sysj\controller.sysj line: 201, column: 5
                              capperStatus_o.setVal("idle");//sysj\controller.sysj line: 201, column: 5
                              S97571=1;
                              if(!capperStatus_o.isACK()){//sysj\controller.sysj line: 201, column: 5
                                capperStatus_o.setREQ(false);//sysj\controller.sysj line: 201, column: 5
                                ends[13]=2;
                                ;//sysj\controller.sysj line: 201, column: 5
                                S97662=2;
                                if(bottleAtPos4.getprestatus()){//sysj\controller.sysj line: 204, column: 12
                                  System.out.println("Capper doing work...");//sysj\controller.sysj line: 205, column: 5
                                  thread113555(tdone,ends);
                                  thread113556(tdone,ends);
                                  thread113557(tdone,ends);
                                  thread113561(tdone,ends);
                                  int biggest113562 = 0;
                                  if(ends[14]>=biggest113562){
                                    biggest113562=ends[14];
                                  }
                                  if(ends[15]>=biggest113562){
                                    biggest113562=ends[15];
                                  }
                                  if(ends[16]>=biggest113562){
                                    biggest113562=ends[16];
                                  }
                                  if(ends[19]>=biggest113562){
                                    biggest113562=ends[19];
                                  }
                                  if(biggest113562 == 1){
                                    active[13]=1;
                                    ends[13]=1;
                                    break RUN;
                                  }
                                }
                                else {
                                  S97662=3;
                                  S98425=0;
                                  if(!capperStatus_o.isPartnerPresent() || capperStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 242, column: 4
                                    capperStatus_o.setREQ(false);//sysj\controller.sysj line: 242, column: 4
                                    S98425=1;
                                    active[13]=1;
                                    ends[13]=1;
                                    break RUN;
                                  }
                                  else {
                                    S98420=0;
                                    if(capperStatus_o.isACK()){//sysj\controller.sysj line: 242, column: 4
                                      capperStatus_o.setVal("done");//sysj\controller.sysj line: 242, column: 4
                                      S98420=1;
                                      if(!capperStatus_o.isACK()){//sysj\controller.sysj line: 242, column: 4
                                        capperStatus_o.setREQ(false);//sysj\controller.sysj line: 242, column: 4
                                        ends[13]=2;
                                        ;//sysj\controller.sysj line: 242, column: 4
                                        S97547=2;
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
                      thread113563(tdone,ends);
                      thread113564(tdone,ends);
                      thread113565(tdone,ends);
                      thread113569(tdone,ends);
                      int biggest113570 = 0;
                      if(ends[14]>=biggest113570){
                        biggest113570=ends[14];
                      }
                      if(ends[15]>=biggest113570){
                        biggest113570=ends[15];
                      }
                      if(ends[16]>=biggest113570){
                        biggest113570=ends[16];
                      }
                      if(ends[19]>=biggest113570){
                        biggest113570=ends[19];
                      }
                      if(biggest113570 == 1){
                        active[13]=1;
                        ends[13]=1;
                        break RUN;
                      }
                      //FINXME code
                      if(biggest113570 == 0){
                        S97662=3;
                        S98425=0;
                        if(!capperStatus_o.isPartnerPresent() || capperStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 242, column: 4
                          capperStatus_o.setREQ(false);//sysj\controller.sysj line: 242, column: 4
                          S98425=1;
                          active[13]=1;
                          ends[13]=1;
                          break RUN;
                        }
                        else {
                          S98420=0;
                          if(capperStatus_o.isACK()){//sysj\controller.sysj line: 242, column: 4
                            capperStatus_o.setVal("done");//sysj\controller.sysj line: 242, column: 4
                            S98420=1;
                            if(!capperStatus_o.isACK()){//sysj\controller.sysj line: 242, column: 4
                              capperStatus_o.setREQ(false);//sysj\controller.sysj line: 242, column: 4
                              ends[13]=2;
                              ;//sysj\controller.sysj line: 242, column: 4
                              S97547=2;
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
                    
                    case 3 : 
                      switch(S98425){
                        case 0 : 
                          if(!capperStatus_o.isPartnerPresent() || capperStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 242, column: 4
                            capperStatus_o.setREQ(false);//sysj\controller.sysj line: 242, column: 4
                            S98425=1;
                            active[13]=1;
                            ends[13]=1;
                            break RUN;
                          }
                          else {
                            switch(S98420){
                              case 0 : 
                                if(capperStatus_o.isACK()){//sysj\controller.sysj line: 242, column: 4
                                  capperStatus_o.setVal("done");//sysj\controller.sysj line: 242, column: 4
                                  S98420=1;
                                  if(!capperStatus_o.isACK()){//sysj\controller.sysj line: 242, column: 4
                                    capperStatus_o.setREQ(false);//sysj\controller.sysj line: 242, column: 4
                                    ends[13]=2;
                                    ;//sysj\controller.sysj line: 242, column: 4
                                    S97547=2;
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
                                if(!capperStatus_o.isACK()){//sysj\controller.sysj line: 242, column: 4
                                  capperStatus_o.setREQ(false);//sysj\controller.sysj line: 242, column: 4
                                  ends[13]=2;
                                  ;//sysj\controller.sysj line: 242, column: 4
                                  S97547=2;
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
                          S98425=1;
                          S98425=0;
                          if(!capperStatus_o.isPartnerPresent() || capperStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 242, column: 4
                            capperStatus_o.setREQ(false);//sysj\controller.sysj line: 242, column: 4
                            S98425=1;
                            active[13]=1;
                            ends[13]=1;
                            break RUN;
                          }
                          else {
                            S98420=0;
                            if(capperStatus_o.isACK()){//sysj\controller.sysj line: 242, column: 4
                              capperStatus_o.setVal("done");//sysj\controller.sysj line: 242, column: 4
                              S98420=1;
                              if(!capperStatus_o.isACK()){//sysj\controller.sysj line: 242, column: 4
                                capperStatus_o.setREQ(false);//sysj\controller.sysj line: 242, column: 4
                                ends[13]=2;
                                ;//sysj\controller.sysj line: 242, column: 4
                                S97547=2;
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
                    
                  }
                  break;
                
                case 1 : 
                  switch(S98645){
                    case 0 : 
                      if(!capperStatus_o.isPartnerPresent() || capperStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 244, column: 4
                        capperStatus_o.setREQ(false);//sysj\controller.sysj line: 244, column: 4
                        S98645=1;
                        active[13]=1;
                        ends[13]=1;
                        break RUN;
                      }
                      else {
                        switch(S98640){
                          case 0 : 
                            if(capperStatus_o.isACK()){//sysj\controller.sysj line: 244, column: 4
                              capperStatus_o.setVal("idle");//sysj\controller.sysj line: 244, column: 4
                              S98640=1;
                              if(!capperStatus_o.isACK()){//sysj\controller.sysj line: 244, column: 4
                                capperStatus_o.setREQ(false);//sysj\controller.sysj line: 244, column: 4
                                ends[13]=2;
                                ;//sysj\controller.sysj line: 244, column: 4
                                S97547=2;
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
                            if(!capperStatus_o.isACK()){//sysj\controller.sysj line: 244, column: 4
                              capperStatus_o.setREQ(false);//sysj\controller.sysj line: 244, column: 4
                              ends[13]=2;
                              ;//sysj\controller.sysj line: 244, column: 4
                              S97547=2;
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
                      S98645=1;
                      S98645=0;
                      if(!capperStatus_o.isPartnerPresent() || capperStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 244, column: 4
                        capperStatus_o.setREQ(false);//sysj\controller.sysj line: 244, column: 4
                        S98645=1;
                        active[13]=1;
                        ends[13]=1;
                        break RUN;
                      }
                      else {
                        S98640=0;
                        if(capperStatus_o.isACK()){//sysj\controller.sysj line: 244, column: 4
                          capperStatus_o.setVal("idle");//sysj\controller.sysj line: 244, column: 4
                          S98640=1;
                          if(!capperStatus_o.isACK()){//sysj\controller.sysj line: 244, column: 4
                            capperStatus_o.setREQ(false);//sysj\controller.sysj line: 244, column: 4
                            ends[13]=2;
                            ;//sysj\controller.sysj line: 244, column: 4
                            S97547=2;
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
                
              }
              break;
            
            case 2 : 
              S97547=2;
              S97547=0;
              S97531=0;
              if(!capperReq_in.isPartnerPresent() || capperReq_in.isPartnerPreempted()){//sysj\controller.sysj line: 194, column: 3
                capperReq_in.setACK(false);//sysj\controller.sysj line: 194, column: 3
                S97531=1;
                active[13]=1;
                ends[13]=1;
                break RUN;
              }
              else {
                S97526=0;
                if(!capperReq_in.isREQ()){//sysj\controller.sysj line: 194, column: 3
                  capperReq_in.setACK(true);//sysj\controller.sysj line: 194, column: 3
                  S97526=1;
                  if(capperReq_in.isREQ()){//sysj\controller.sysj line: 194, column: 3
                    capperReq_in.setACK(false);//sysj\controller.sysj line: 194, column: 3
                    ends[13]=2;
                    ;//sysj\controller.sysj line: 194, column: 3
                    request_thread_13 = (boolean)(capperReq_in.getVal() == null ? false : ((Boolean)capperReq_in.getVal()).booleanValue());//sysj\controller.sysj line: 195, column: 3
                    S97547=1;
                    if(request_thread_13){//sysj\controller.sysj line: 197, column: 3
                      S98661=0;
                      S97662=0;
                      S97554=0;
                      if(!capperStatus_o.isPartnerPresent() || capperStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 198, column: 4
                        capperStatus_o.setREQ(false);//sysj\controller.sysj line: 198, column: 4
                        S97554=1;
                        active[13]=1;
                        ends[13]=1;
                        break RUN;
                      }
                      else {
                        S97549=0;
                        if(capperStatus_o.isACK()){//sysj\controller.sysj line: 198, column: 4
                          capperStatus_o.setVal("busy");//sysj\controller.sysj line: 198, column: 4
                          S97549=1;
                          if(!capperStatus_o.isACK()){//sysj\controller.sysj line: 198, column: 4
                            capperStatus_o.setREQ(false);//sysj\controller.sysj line: 198, column: 4
                            ends[13]=2;
                            ;//sysj\controller.sysj line: 198, column: 4
                            S97662=1;
                            if(!bottleAtPos4.getprestatus()){//sysj\controller.sysj line: 200, column: 13
                              S97576=0;
                              if(!capperStatus_o.isPartnerPresent() || capperStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 201, column: 5
                                capperStatus_o.setREQ(false);//sysj\controller.sysj line: 201, column: 5
                                S97576=1;
                                active[13]=1;
                                ends[13]=1;
                                break RUN;
                              }
                              else {
                                S97571=0;
                                if(capperStatus_o.isACK()){//sysj\controller.sysj line: 201, column: 5
                                  capperStatus_o.setVal("idle");//sysj\controller.sysj line: 201, column: 5
                                  S97571=1;
                                  if(!capperStatus_o.isACK()){//sysj\controller.sysj line: 201, column: 5
                                    capperStatus_o.setREQ(false);//sysj\controller.sysj line: 201, column: 5
                                    ends[13]=2;
                                    ;//sysj\controller.sysj line: 201, column: 5
                                    S97662=2;
                                    if(bottleAtPos4.getprestatus()){//sysj\controller.sysj line: 204, column: 12
                                      System.out.println("Capper doing work...");//sysj\controller.sysj line: 205, column: 5
                                      thread113571(tdone,ends);
                                      thread113572(tdone,ends);
                                      thread113573(tdone,ends);
                                      thread113577(tdone,ends);
                                      int biggest113578 = 0;
                                      if(ends[14]>=biggest113578){
                                        biggest113578=ends[14];
                                      }
                                      if(ends[15]>=biggest113578){
                                        biggest113578=ends[15];
                                      }
                                      if(ends[16]>=biggest113578){
                                        biggest113578=ends[16];
                                      }
                                      if(ends[19]>=biggest113578){
                                        biggest113578=ends[19];
                                      }
                                      if(biggest113578 == 1){
                                        active[13]=1;
                                        ends[13]=1;
                                        break RUN;
                                      }
                                    }
                                    else {
                                      S97662=3;
                                      S98425=0;
                                      if(!capperStatus_o.isPartnerPresent() || capperStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 242, column: 4
                                        capperStatus_o.setREQ(false);//sysj\controller.sysj line: 242, column: 4
                                        S98425=1;
                                        active[13]=1;
                                        ends[13]=1;
                                        break RUN;
                                      }
                                      else {
                                        S98420=0;
                                        if(capperStatus_o.isACK()){//sysj\controller.sysj line: 242, column: 4
                                          capperStatus_o.setVal("done");//sysj\controller.sysj line: 242, column: 4
                                          S98420=1;
                                          if(!capperStatus_o.isACK()){//sysj\controller.sysj line: 242, column: 4
                                            capperStatus_o.setREQ(false);//sysj\controller.sysj line: 242, column: 4
                                            ends[13]=2;
                                            ;//sysj\controller.sysj line: 242, column: 4
                                            S97547=2;
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
                              S97662=2;
                              if(bottleAtPos4.getprestatus()){//sysj\controller.sysj line: 204, column: 12
                                System.out.println("Capper doing work...");//sysj\controller.sysj line: 205, column: 5
                                thread113579(tdone,ends);
                                thread113580(tdone,ends);
                                thread113581(tdone,ends);
                                thread113585(tdone,ends);
                                int biggest113586 = 0;
                                if(ends[14]>=biggest113586){
                                  biggest113586=ends[14];
                                }
                                if(ends[15]>=biggest113586){
                                  biggest113586=ends[15];
                                }
                                if(ends[16]>=biggest113586){
                                  biggest113586=ends[16];
                                }
                                if(ends[19]>=biggest113586){
                                  biggest113586=ends[19];
                                }
                                if(biggest113586 == 1){
                                  active[13]=1;
                                  ends[13]=1;
                                  break RUN;
                                }
                              }
                              else {
                                S97662=3;
                                S98425=0;
                                if(!capperStatus_o.isPartnerPresent() || capperStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 242, column: 4
                                  capperStatus_o.setREQ(false);//sysj\controller.sysj line: 242, column: 4
                                  S98425=1;
                                  active[13]=1;
                                  ends[13]=1;
                                  break RUN;
                                }
                                else {
                                  S98420=0;
                                  if(capperStatus_o.isACK()){//sysj\controller.sysj line: 242, column: 4
                                    capperStatus_o.setVal("done");//sysj\controller.sysj line: 242, column: 4
                                    S98420=1;
                                    if(!capperStatus_o.isACK()){//sysj\controller.sysj line: 242, column: 4
                                      capperStatus_o.setREQ(false);//sysj\controller.sysj line: 242, column: 4
                                      ends[13]=2;
                                      ;//sysj\controller.sysj line: 242, column: 4
                                      S97547=2;
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
                      S98661=1;
                      S98645=0;
                      if(!capperStatus_o.isPartnerPresent() || capperStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 244, column: 4
                        capperStatus_o.setREQ(false);//sysj\controller.sysj line: 244, column: 4
                        S98645=1;
                        active[13]=1;
                        ends[13]=1;
                        break RUN;
                      }
                      else {
                        S98640=0;
                        if(capperStatus_o.isACK()){//sysj\controller.sysj line: 244, column: 4
                          capperStatus_o.setVal("idle");//sysj\controller.sysj line: 244, column: 4
                          S98640=1;
                          if(!capperStatus_o.isACK()){//sysj\controller.sysj line: 244, column: 4
                            capperStatus_o.setREQ(false);//sysj\controller.sysj line: 244, column: 4
                            ends[13]=2;
                            ;//sysj\controller.sysj line: 244, column: 4
                            S97547=2;
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
