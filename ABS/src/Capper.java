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
  private int S30719 = 1;
  private int S22415 = 1;
  private int S22399 = 1;
  private int S22394 = 1;
  private int S22462 = 1;
  private int S22422 = 1;
  private int S22417 = 1;
  private int S22545 = 1;
  private int S22468 = 1;
  private int S22474 = 1;
  private int S22490 = 1;
  private int S22489 = 1;
  private int S22477 = 1;
  private int S22480 = 1;
  private int S22503 = 1;
  private int S22500 = 1;
  private int S22552 = 1;
  private int S22547 = 1;
  
  private int[] ends = new int[20];
  private int[] tdone = new int[20];
  
  public void thread31236(int [] tdone, int [] ends){
        S22503=1;
    S22500=0;
    active[18]=1;
    ends[18]=1;
    tdone[18]=1;
  }

  public void thread31234(int [] tdone, int [] ends){
        S22480=1;
    active[17]=1;
    ends[17]=1;
    tdone[17]=1;
  }

  public void thread31233(int [] tdone, int [] ends){
        S22477=1;
    active[16]=1;
    ends[16]=1;
    tdone[16]=1;
  }

  public void thread31232(int [] tdone, int [] ends){
        S22490=1;
    S22489=0;
    thread31233(tdone,ends);
    thread31234(tdone,ends);
    int biggest31235 = 0;
    if(ends[16]>=biggest31235){
      biggest31235=ends[16];
    }
    if(ends[17]>=biggest31235){
      biggest31235=ends[17];
    }
    if(biggest31235 == 1){
      active[15]=1;
      ends[15]=1;
      tdone[15]=1;
    }
  }

  public void thread31231(int [] tdone, int [] ends){
        S22474=1;
    cylPos5ZAxisExtend.setPresent();//sysj\controller.sysj line: 183, column: 7
    currsigs.addElement(cylPos5ZAxisExtend);
    active[14]=1;
    ends[14]=1;
    tdone[14]=1;
  }

  public void thread31230(int [] tdone, int [] ends){
        S22468=1;
    cylClampBottleExtend.setPresent();//sysj\controller.sysj line: 177, column: 7
    currsigs.addElement(cylClampBottleExtend);
    active[13]=1;
    ends[13]=1;
    tdone[13]=1;
  }

  public void thread31228(int [] tdone, int [] ends){
        S22503=1;
    S22500=0;
    active[18]=1;
    ends[18]=1;
    tdone[18]=1;
  }

  public void thread31226(int [] tdone, int [] ends){
        S22480=1;
    active[17]=1;
    ends[17]=1;
    tdone[17]=1;
  }

  public void thread31225(int [] tdone, int [] ends){
        S22477=1;
    active[16]=1;
    ends[16]=1;
    tdone[16]=1;
  }

  public void thread31224(int [] tdone, int [] ends){
        S22490=1;
    S22489=0;
    thread31225(tdone,ends);
    thread31226(tdone,ends);
    int biggest31227 = 0;
    if(ends[16]>=biggest31227){
      biggest31227=ends[16];
    }
    if(ends[17]>=biggest31227){
      biggest31227=ends[17];
    }
    if(biggest31227 == 1){
      active[15]=1;
      ends[15]=1;
      tdone[15]=1;
    }
  }

  public void thread31223(int [] tdone, int [] ends){
        S22474=1;
    cylPos5ZAxisExtend.setPresent();//sysj\controller.sysj line: 183, column: 7
    currsigs.addElement(cylPos5ZAxisExtend);
    active[14]=1;
    ends[14]=1;
    tdone[14]=1;
  }

  public void thread31222(int [] tdone, int [] ends){
        S22468=1;
    cylClampBottleExtend.setPresent();//sysj\controller.sysj line: 177, column: 7
    currsigs.addElement(cylClampBottleExtend);
    active[13]=1;
    ends[13]=1;
    tdone[13]=1;
  }

  public void thread31220(int [] tdone, int [] ends){
        switch(S22503){
      case 0 : 
        active[18]=0;
        ends[18]=0;
        tdone[18]=1;
        break;
      
      case 1 : 
        switch(S22500){
          case 0 : 
            if(gripperGrippedCap.getprestatus()){//sysj\controller.sysj line: 196, column: 12
              S22500=1;
              gripperTurnExtend.setPresent();//sysj\controller.sysj line: 199, column: 7
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
            if(gripperTurnFinalPos.getprestatus()){//sysj\controller.sysj line: 198, column: 13
              releaseCap_12.setPresent();//sysj\controller.sysj line: 201, column: 6
              currsigs.addElement(releaseCap_12);
              untwistGripper_12.setPresent();//sysj\controller.sysj line: 204, column: 7
              currsigs.addElement(untwistGripper_12);
              raiseGripper_12.setPresent();//sysj\controller.sysj line: 207, column: 6
              currsigs.addElement(raiseGripper_12);
              unclampBottle_12.setPresent();//sysj\controller.sysj line: 208, column: 6
              currsigs.addElement(unclampBottle_12);
              S22503=0;
              active[18]=0;
              ends[18]=0;
              tdone[18]=1;
            }
            else {
              gripperTurnExtend.setPresent();//sysj\controller.sysj line: 199, column: 7
              currsigs.addElement(gripperTurnExtend);
              active[18]=1;
              ends[18]=1;
              tdone[18]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread31218(int [] tdone, int [] ends){
        switch(S22480){
      case 0 : 
        active[17]=0;
        ends[17]=0;
        tdone[17]=1;
        break;
      
      case 1 : 
        if(cylClampedBottle.getprestatus()){//sysj\controller.sysj line: 189, column: 46
          S22480=0;
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

  public void thread31217(int [] tdone, int [] ends){
        switch(S22477){
      case 0 : 
        active[16]=0;
        ends[16]=0;
        tdone[16]=1;
        break;
      
      case 1 : 
        if(gripperZAxisLowered.getprestatus()){//sysj\controller.sysj line: 189, column: 13
          S22477=0;
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

  public void thread31216(int [] tdone, int [] ends){
        switch(S22490){
      case 0 : 
        active[15]=0;
        ends[15]=0;
        tdone[15]=1;
        break;
      
      case 1 : 
        switch(S22489){
          case 0 : 
            thread31217(tdone,ends);
            thread31218(tdone,ends);
            int biggest31219 = 0;
            if(ends[16]>=biggest31219){
              biggest31219=ends[16];
            }
            if(ends[17]>=biggest31219){
              biggest31219=ends[17];
            }
            if(biggest31219 == 1){
              active[15]=1;
              ends[15]=1;
              tdone[15]=1;
            }
            //FINXME code
            if(biggest31219 == 0){
              S22489=1;
              capGripperPos5Extend.setPresent();//sysj\controller.sysj line: 191, column: 7
              currsigs.addElement(capGripperPos5Extend);
              active[15]=1;
              ends[15]=1;
              tdone[15]=1;
            }
            break;
          
          case 1 : 
            if(releaseCap_12.getprestatus()){//sysj\controller.sysj line: 190, column: 12
              S22490=0;
              active[15]=0;
              ends[15]=0;
              tdone[15]=1;
            }
            else {
              capGripperPos5Extend.setPresent();//sysj\controller.sysj line: 191, column: 7
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

  public void thread31215(int [] tdone, int [] ends){
        switch(S22474){
      case 0 : 
        active[14]=0;
        ends[14]=0;
        tdone[14]=1;
        break;
      
      case 1 : 
        if(raiseGripper_12.getprestatus()){//sysj\controller.sysj line: 182, column: 12
          S22474=0;
          active[14]=0;
          ends[14]=0;
          tdone[14]=1;
        }
        else {
          cylPos5ZAxisExtend.setPresent();//sysj\controller.sysj line: 183, column: 7
          currsigs.addElement(cylPos5ZAxisExtend);
          active[14]=1;
          ends[14]=1;
          tdone[14]=1;
        }
        break;
      
    }
  }

  public void thread31214(int [] tdone, int [] ends){
        switch(S22468){
      case 0 : 
        active[13]=0;
        ends[13]=0;
        tdone[13]=1;
        break;
      
      case 1 : 
        if(unclampBottle_12.getprestatus()){//sysj\controller.sysj line: 176, column: 13
          S22468=0;
          active[13]=0;
          ends[13]=0;
          tdone[13]=1;
        }
        else {
          cylClampBottleExtend.setPresent();//sysj\controller.sysj line: 177, column: 7
          currsigs.addElement(cylClampBottleExtend);
          active[13]=1;
          ends[13]=1;
          tdone[13]=1;
        }
        break;
      
    }
  }

  public void thread31212(int [] tdone, int [] ends){
        S22503=1;
    S22500=0;
    active[18]=1;
    ends[18]=1;
    tdone[18]=1;
  }

  public void thread31210(int [] tdone, int [] ends){
        S22480=1;
    active[17]=1;
    ends[17]=1;
    tdone[17]=1;
  }

  public void thread31209(int [] tdone, int [] ends){
        S22477=1;
    active[16]=1;
    ends[16]=1;
    tdone[16]=1;
  }

  public void thread31208(int [] tdone, int [] ends){
        S22490=1;
    S22489=0;
    thread31209(tdone,ends);
    thread31210(tdone,ends);
    int biggest31211 = 0;
    if(ends[16]>=biggest31211){
      biggest31211=ends[16];
    }
    if(ends[17]>=biggest31211){
      biggest31211=ends[17];
    }
    if(biggest31211 == 1){
      active[15]=1;
      ends[15]=1;
      tdone[15]=1;
    }
  }

  public void thread31207(int [] tdone, int [] ends){
        S22474=1;
    cylPos5ZAxisExtend.setPresent();//sysj\controller.sysj line: 183, column: 7
    currsigs.addElement(cylPos5ZAxisExtend);
    active[14]=1;
    ends[14]=1;
    tdone[14]=1;
  }

  public void thread31206(int [] tdone, int [] ends){
        S22468=1;
    cylClampBottleExtend.setPresent();//sysj\controller.sysj line: 177, column: 7
    currsigs.addElement(cylClampBottleExtend);
    active[13]=1;
    ends[13]=1;
    tdone[13]=1;
  }

  public void thread31204(int [] tdone, int [] ends){
        S22503=1;
    S22500=0;
    active[18]=1;
    ends[18]=1;
    tdone[18]=1;
  }

  public void thread31202(int [] tdone, int [] ends){
        S22480=1;
    active[17]=1;
    ends[17]=1;
    tdone[17]=1;
  }

  public void thread31201(int [] tdone, int [] ends){
        S22477=1;
    active[16]=1;
    ends[16]=1;
    tdone[16]=1;
  }

  public void thread31200(int [] tdone, int [] ends){
        S22490=1;
    S22489=0;
    thread31201(tdone,ends);
    thread31202(tdone,ends);
    int biggest31203 = 0;
    if(ends[16]>=biggest31203){
      biggest31203=ends[16];
    }
    if(ends[17]>=biggest31203){
      biggest31203=ends[17];
    }
    if(biggest31203 == 1){
      active[15]=1;
      ends[15]=1;
      tdone[15]=1;
    }
  }

  public void thread31199(int [] tdone, int [] ends){
        S22474=1;
    cylPos5ZAxisExtend.setPresent();//sysj\controller.sysj line: 183, column: 7
    currsigs.addElement(cylPos5ZAxisExtend);
    active[14]=1;
    ends[14]=1;
    tdone[14]=1;
  }

  public void thread31198(int [] tdone, int [] ends){
        S22468=1;
    cylClampBottleExtend.setPresent();//sysj\controller.sysj line: 177, column: 7
    currsigs.addElement(cylClampBottleExtend);
    active[13]=1;
    ends[13]=1;
    tdone[13]=1;
  }

  public void thread31196(int [] tdone, int [] ends){
        S22503=1;
    S22500=0;
    active[18]=1;
    ends[18]=1;
    tdone[18]=1;
  }

  public void thread31194(int [] tdone, int [] ends){
        S22480=1;
    active[17]=1;
    ends[17]=1;
    tdone[17]=1;
  }

  public void thread31193(int [] tdone, int [] ends){
        S22477=1;
    active[16]=1;
    ends[16]=1;
    tdone[16]=1;
  }

  public void thread31192(int [] tdone, int [] ends){
        S22490=1;
    S22489=0;
    thread31193(tdone,ends);
    thread31194(tdone,ends);
    int biggest31195 = 0;
    if(ends[16]>=biggest31195){
      biggest31195=ends[16];
    }
    if(ends[17]>=biggest31195){
      biggest31195=ends[17];
    }
    if(biggest31195 == 1){
      active[15]=1;
      ends[15]=1;
      tdone[15]=1;
    }
  }

  public void thread31191(int [] tdone, int [] ends){
        S22474=1;
    cylPos5ZAxisExtend.setPresent();//sysj\controller.sysj line: 183, column: 7
    currsigs.addElement(cylPos5ZAxisExtend);
    active[14]=1;
    ends[14]=1;
    tdone[14]=1;
  }

  public void thread31190(int [] tdone, int [] ends){
        S22468=1;
    cylClampBottleExtend.setPresent();//sysj\controller.sysj line: 177, column: 7
    currsigs.addElement(cylClampBottleExtend);
    active[13]=1;
    ends[13]=1;
    tdone[13]=1;
  }

  public void thread31188(int [] tdone, int [] ends){
        S22503=1;
    S22500=0;
    active[18]=1;
    ends[18]=1;
    tdone[18]=1;
  }

  public void thread31186(int [] tdone, int [] ends){
        S22480=1;
    active[17]=1;
    ends[17]=1;
    tdone[17]=1;
  }

  public void thread31185(int [] tdone, int [] ends){
        S22477=1;
    active[16]=1;
    ends[16]=1;
    tdone[16]=1;
  }

  public void thread31184(int [] tdone, int [] ends){
        S22490=1;
    S22489=0;
    thread31185(tdone,ends);
    thread31186(tdone,ends);
    int biggest31187 = 0;
    if(ends[16]>=biggest31187){
      biggest31187=ends[16];
    }
    if(ends[17]>=biggest31187){
      biggest31187=ends[17];
    }
    if(biggest31187 == 1){
      active[15]=1;
      ends[15]=1;
      tdone[15]=1;
    }
  }

  public void thread31183(int [] tdone, int [] ends){
        S22474=1;
    cylPos5ZAxisExtend.setPresent();//sysj\controller.sysj line: 183, column: 7
    currsigs.addElement(cylPos5ZAxisExtend);
    active[14]=1;
    ends[14]=1;
    tdone[14]=1;
  }

  public void thread31182(int [] tdone, int [] ends){
        S22468=1;
    cylClampBottleExtend.setPresent();//sysj\controller.sysj line: 177, column: 7
    currsigs.addElement(cylClampBottleExtend);
    active[13]=1;
    ends[13]=1;
    tdone[13]=1;
  }

  public void thread31180(int [] tdone, int [] ends){
        S22503=1;
    S22500=0;
    active[18]=1;
    ends[18]=1;
    tdone[18]=1;
  }

  public void thread31178(int [] tdone, int [] ends){
        S22480=1;
    active[17]=1;
    ends[17]=1;
    tdone[17]=1;
  }

  public void thread31177(int [] tdone, int [] ends){
        S22477=1;
    active[16]=1;
    ends[16]=1;
    tdone[16]=1;
  }

  public void thread31176(int [] tdone, int [] ends){
        S22490=1;
    S22489=0;
    thread31177(tdone,ends);
    thread31178(tdone,ends);
    int biggest31179 = 0;
    if(ends[16]>=biggest31179){
      biggest31179=ends[16];
    }
    if(ends[17]>=biggest31179){
      biggest31179=ends[17];
    }
    if(biggest31179 == 1){
      active[15]=1;
      ends[15]=1;
      tdone[15]=1;
    }
  }

  public void thread31175(int [] tdone, int [] ends){
        S22474=1;
    cylPos5ZAxisExtend.setPresent();//sysj\controller.sysj line: 183, column: 7
    currsigs.addElement(cylPos5ZAxisExtend);
    active[14]=1;
    ends[14]=1;
    tdone[14]=1;
  }

  public void thread31174(int [] tdone, int [] ends){
        S22468=1;
    cylClampBottleExtend.setPresent();//sysj\controller.sysj line: 177, column: 7
    currsigs.addElement(cylClampBottleExtend);
    active[13]=1;
    ends[13]=1;
    tdone[13]=1;
  }

  public void thread31172(int [] tdone, int [] ends){
        S22503=1;
    S22500=0;
    active[18]=1;
    ends[18]=1;
    tdone[18]=1;
  }

  public void thread31170(int [] tdone, int [] ends){
        S22480=1;
    active[17]=1;
    ends[17]=1;
    tdone[17]=1;
  }

  public void thread31169(int [] tdone, int [] ends){
        S22477=1;
    active[16]=1;
    ends[16]=1;
    tdone[16]=1;
  }

  public void thread31168(int [] tdone, int [] ends){
        S22490=1;
    S22489=0;
    thread31169(tdone,ends);
    thread31170(tdone,ends);
    int biggest31171 = 0;
    if(ends[16]>=biggest31171){
      biggest31171=ends[16];
    }
    if(ends[17]>=biggest31171){
      biggest31171=ends[17];
    }
    if(biggest31171 == 1){
      active[15]=1;
      ends[15]=1;
      tdone[15]=1;
    }
  }

  public void thread31167(int [] tdone, int [] ends){
        S22474=1;
    cylPos5ZAxisExtend.setPresent();//sysj\controller.sysj line: 183, column: 7
    currsigs.addElement(cylPos5ZAxisExtend);
    active[14]=1;
    ends[14]=1;
    tdone[14]=1;
  }

  public void thread31166(int [] tdone, int [] ends){
        S22468=1;
    cylClampBottleExtend.setPresent();//sysj\controller.sysj line: 177, column: 7
    currsigs.addElement(cylClampBottleExtend);
    active[13]=1;
    ends[13]=1;
    tdone[13]=1;
  }

  public void thread31164(int [] tdone, int [] ends){
        S22503=1;
    S22500=0;
    active[18]=1;
    ends[18]=1;
    tdone[18]=1;
  }

  public void thread31162(int [] tdone, int [] ends){
        S22480=1;
    active[17]=1;
    ends[17]=1;
    tdone[17]=1;
  }

  public void thread31161(int [] tdone, int [] ends){
        S22477=1;
    active[16]=1;
    ends[16]=1;
    tdone[16]=1;
  }

  public void thread31160(int [] tdone, int [] ends){
        S22490=1;
    S22489=0;
    thread31161(tdone,ends);
    thread31162(tdone,ends);
    int biggest31163 = 0;
    if(ends[16]>=biggest31163){
      biggest31163=ends[16];
    }
    if(ends[17]>=biggest31163){
      biggest31163=ends[17];
    }
    if(biggest31163 == 1){
      active[15]=1;
      ends[15]=1;
      tdone[15]=1;
    }
  }

  public void thread31159(int [] tdone, int [] ends){
        S22474=1;
    cylPos5ZAxisExtend.setPresent();//sysj\controller.sysj line: 183, column: 7
    currsigs.addElement(cylPos5ZAxisExtend);
    active[14]=1;
    ends[14]=1;
    tdone[14]=1;
  }

  public void thread31158(int [] tdone, int [] ends){
        S22468=1;
    cylClampBottleExtend.setPresent();//sysj\controller.sysj line: 177, column: 7
    currsigs.addElement(cylClampBottleExtend);
    active[13]=1;
    ends[13]=1;
    tdone[13]=1;
  }

  public void thread31156(int [] tdone, int [] ends){
        S22503=1;
    S22500=0;
    active[18]=1;
    ends[18]=1;
    tdone[18]=1;
  }

  public void thread31154(int [] tdone, int [] ends){
        S22480=1;
    active[17]=1;
    ends[17]=1;
    tdone[17]=1;
  }

  public void thread31153(int [] tdone, int [] ends){
        S22477=1;
    active[16]=1;
    ends[16]=1;
    tdone[16]=1;
  }

  public void thread31152(int [] tdone, int [] ends){
        S22490=1;
    S22489=0;
    thread31153(tdone,ends);
    thread31154(tdone,ends);
    int biggest31155 = 0;
    if(ends[16]>=biggest31155){
      biggest31155=ends[16];
    }
    if(ends[17]>=biggest31155){
      biggest31155=ends[17];
    }
    if(biggest31155 == 1){
      active[15]=1;
      ends[15]=1;
      tdone[15]=1;
    }
  }

  public void thread31151(int [] tdone, int [] ends){
        S22474=1;
    cylPos5ZAxisExtend.setPresent();//sysj\controller.sysj line: 183, column: 7
    currsigs.addElement(cylPos5ZAxisExtend);
    active[14]=1;
    ends[14]=1;
    tdone[14]=1;
  }

  public void thread31150(int [] tdone, int [] ends){
        S22468=1;
    cylClampBottleExtend.setPresent();//sysj\controller.sysj line: 177, column: 7
    currsigs.addElement(cylClampBottleExtend);
    active[13]=1;
    ends[13]=1;
    tdone[13]=1;
  }

  public void thread31148(int [] tdone, int [] ends){
        S22503=1;
    S22500=0;
    active[18]=1;
    ends[18]=1;
    tdone[18]=1;
  }

  public void thread31146(int [] tdone, int [] ends){
        S22480=1;
    active[17]=1;
    ends[17]=1;
    tdone[17]=1;
  }

  public void thread31145(int [] tdone, int [] ends){
        S22477=1;
    active[16]=1;
    ends[16]=1;
    tdone[16]=1;
  }

  public void thread31144(int [] tdone, int [] ends){
        S22490=1;
    S22489=0;
    thread31145(tdone,ends);
    thread31146(tdone,ends);
    int biggest31147 = 0;
    if(ends[16]>=biggest31147){
      biggest31147=ends[16];
    }
    if(ends[17]>=biggest31147){
      biggest31147=ends[17];
    }
    if(biggest31147 == 1){
      active[15]=1;
      ends[15]=1;
      tdone[15]=1;
    }
  }

  public void thread31143(int [] tdone, int [] ends){
        S22474=1;
    cylPos5ZAxisExtend.setPresent();//sysj\controller.sysj line: 183, column: 7
    currsigs.addElement(cylPos5ZAxisExtend);
    active[14]=1;
    ends[14]=1;
    tdone[14]=1;
  }

  public void thread31142(int [] tdone, int [] ends){
        S22468=1;
    cylClampBottleExtend.setPresent();//sysj\controller.sysj line: 177, column: 7
    currsigs.addElement(cylClampBottleExtend);
    active[13]=1;
    ends[13]=1;
    tdone[13]=1;
  }

  public void thread31140(int [] tdone, int [] ends){
        S22503=1;
    S22500=0;
    active[18]=1;
    ends[18]=1;
    tdone[18]=1;
  }

  public void thread31138(int [] tdone, int [] ends){
        S22480=1;
    active[17]=1;
    ends[17]=1;
    tdone[17]=1;
  }

  public void thread31137(int [] tdone, int [] ends){
        S22477=1;
    active[16]=1;
    ends[16]=1;
    tdone[16]=1;
  }

  public void thread31136(int [] tdone, int [] ends){
        S22490=1;
    S22489=0;
    thread31137(tdone,ends);
    thread31138(tdone,ends);
    int biggest31139 = 0;
    if(ends[16]>=biggest31139){
      biggest31139=ends[16];
    }
    if(ends[17]>=biggest31139){
      biggest31139=ends[17];
    }
    if(biggest31139 == 1){
      active[15]=1;
      ends[15]=1;
      tdone[15]=1;
    }
  }

  public void thread31135(int [] tdone, int [] ends){
        S22474=1;
    cylPos5ZAxisExtend.setPresent();//sysj\controller.sysj line: 183, column: 7
    currsigs.addElement(cylPos5ZAxisExtend);
    active[14]=1;
    ends[14]=1;
    tdone[14]=1;
  }

  public void thread31134(int [] tdone, int [] ends){
        S22468=1;
    cylClampBottleExtend.setPresent();//sysj\controller.sysj line: 177, column: 7
    currsigs.addElement(cylClampBottleExtend);
    active[13]=1;
    ends[13]=1;
    tdone[13]=1;
  }

  public void thread31132(int [] tdone, int [] ends){
        S22503=1;
    S22500=0;
    active[18]=1;
    ends[18]=1;
    tdone[18]=1;
  }

  public void thread31130(int [] tdone, int [] ends){
        S22480=1;
    active[17]=1;
    ends[17]=1;
    tdone[17]=1;
  }

  public void thread31129(int [] tdone, int [] ends){
        S22477=1;
    active[16]=1;
    ends[16]=1;
    tdone[16]=1;
  }

  public void thread31128(int [] tdone, int [] ends){
        S22490=1;
    S22489=0;
    thread31129(tdone,ends);
    thread31130(tdone,ends);
    int biggest31131 = 0;
    if(ends[16]>=biggest31131){
      biggest31131=ends[16];
    }
    if(ends[17]>=biggest31131){
      biggest31131=ends[17];
    }
    if(biggest31131 == 1){
      active[15]=1;
      ends[15]=1;
      tdone[15]=1;
    }
  }

  public void thread31127(int [] tdone, int [] ends){
        S22474=1;
    cylPos5ZAxisExtend.setPresent();//sysj\controller.sysj line: 183, column: 7
    currsigs.addElement(cylPos5ZAxisExtend);
    active[14]=1;
    ends[14]=1;
    tdone[14]=1;
  }

  public void thread31126(int [] tdone, int [] ends){
        S22468=1;
    cylClampBottleExtend.setPresent();//sysj\controller.sysj line: 177, column: 7
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
      switch(S30719){
        case 0 : 
          S30719=0;
          break RUN;
        
        case 1 : 
          S30719=2;
          S30719=2;
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
                  S22462=0;
                  if(!bottleAtPos4.getprestatus()){//sysj\controller.sysj line: 169, column: 13
                    S22422=0;
                    if(!capperStatus_o.isPartnerPresent() || capperStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 170, column: 5
                      capperStatus_o.setREQ(false);//sysj\controller.sysj line: 170, column: 5
                      S22422=1;
                      active[12]=1;
                      ends[12]=1;
                      break RUN;
                    }
                    else {
                      S22417=0;
                      if(capperStatus_o.isACK()){//sysj\controller.sysj line: 170, column: 5
                        capperStatus_o.setVal("idle");//sysj\controller.sysj line: 170, column: 5
                        S22417=1;
                        if(!capperStatus_o.isACK()){//sysj\controller.sysj line: 170, column: 5
                          capperStatus_o.setREQ(false);//sysj\controller.sysj line: 170, column: 5
                          ends[12]=2;
                          ;//sysj\controller.sysj line: 170, column: 5
                          S22462=1;
                          if(bottleAtPos4.getprestatus()){//sysj\controller.sysj line: 173, column: 12
                            System.out.println("CapperController: Capper doing work...");//sysj\controller.sysj line: 174, column: 5
                            S22545=0;
                            thread31126(tdone,ends);
                            thread31127(tdone,ends);
                            thread31128(tdone,ends);
                            thread31132(tdone,ends);
                            int biggest31133 = 0;
                            if(ends[13]>=biggest31133){
                              biggest31133=ends[13];
                            }
                            if(ends[14]>=biggest31133){
                              biggest31133=ends[14];
                            }
                            if(ends[15]>=biggest31133){
                              biggest31133=ends[15];
                            }
                            if(ends[18]>=biggest31133){
                              biggest31133=ends[18];
                            }
                            if(biggest31133 == 1){
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
                    S22462=1;
                    if(bottleAtPos4.getprestatus()){//sysj\controller.sysj line: 173, column: 12
                      System.out.println("CapperController: Capper doing work...");//sysj\controller.sysj line: 174, column: 5
                      S22545=0;
                      thread31134(tdone,ends);
                      thread31135(tdone,ends);
                      thread31136(tdone,ends);
                      thread31140(tdone,ends);
                      int biggest31141 = 0;
                      if(ends[13]>=biggest31141){
                        biggest31141=ends[13];
                      }
                      if(ends[14]>=biggest31141){
                        biggest31141=ends[14];
                      }
                      if(ends[15]>=biggest31141){
                        biggest31141=ends[15];
                      }
                      if(ends[18]>=biggest31141){
                        biggest31141=ends[18];
                      }
                      if(biggest31141 == 1){
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
                              S22462=0;
                              if(!bottleAtPos4.getprestatus()){//sysj\controller.sysj line: 169, column: 13
                                S22422=0;
                                if(!capperStatus_o.isPartnerPresent() || capperStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 170, column: 5
                                  capperStatus_o.setREQ(false);//sysj\controller.sysj line: 170, column: 5
                                  S22422=1;
                                  active[12]=1;
                                  ends[12]=1;
                                  break RUN;
                                }
                                else {
                                  S22417=0;
                                  if(capperStatus_o.isACK()){//sysj\controller.sysj line: 170, column: 5
                                    capperStatus_o.setVal("idle");//sysj\controller.sysj line: 170, column: 5
                                    S22417=1;
                                    if(!capperStatus_o.isACK()){//sysj\controller.sysj line: 170, column: 5
                                      capperStatus_o.setREQ(false);//sysj\controller.sysj line: 170, column: 5
                                      ends[12]=2;
                                      ;//sysj\controller.sysj line: 170, column: 5
                                      S22462=1;
                                      if(bottleAtPos4.getprestatus()){//sysj\controller.sysj line: 173, column: 12
                                        System.out.println("CapperController: Capper doing work...");//sysj\controller.sysj line: 174, column: 5
                                        S22545=0;
                                        thread31142(tdone,ends);
                                        thread31143(tdone,ends);
                                        thread31144(tdone,ends);
                                        thread31148(tdone,ends);
                                        int biggest31149 = 0;
                                        if(ends[13]>=biggest31149){
                                          biggest31149=ends[13];
                                        }
                                        if(ends[14]>=biggest31149){
                                          biggest31149=ends[14];
                                        }
                                        if(ends[15]>=biggest31149){
                                          biggest31149=ends[15];
                                        }
                                        if(ends[18]>=biggest31149){
                                          biggest31149=ends[18];
                                        }
                                        if(biggest31149 == 1){
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
                                S22462=1;
                                if(bottleAtPos4.getprestatus()){//sysj\controller.sysj line: 173, column: 12
                                  System.out.println("CapperController: Capper doing work...");//sysj\controller.sysj line: 174, column: 5
                                  S22545=0;
                                  thread31150(tdone,ends);
                                  thread31151(tdone,ends);
                                  thread31152(tdone,ends);
                                  thread31156(tdone,ends);
                                  int biggest31157 = 0;
                                  if(ends[13]>=biggest31157){
                                    biggest31157=ends[13];
                                  }
                                  if(ends[14]>=biggest31157){
                                    biggest31157=ends[14];
                                  }
                                  if(ends[15]>=biggest31157){
                                    biggest31157=ends[15];
                                  }
                                  if(ends[18]>=biggest31157){
                                    biggest31157=ends[18];
                                  }
                                  if(biggest31157 == 1){
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
                            S22462=0;
                            if(!bottleAtPos4.getprestatus()){//sysj\controller.sysj line: 169, column: 13
                              S22422=0;
                              if(!capperStatus_o.isPartnerPresent() || capperStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 170, column: 5
                                capperStatus_o.setREQ(false);//sysj\controller.sysj line: 170, column: 5
                                S22422=1;
                                active[12]=1;
                                ends[12]=1;
                                break RUN;
                              }
                              else {
                                S22417=0;
                                if(capperStatus_o.isACK()){//sysj\controller.sysj line: 170, column: 5
                                  capperStatus_o.setVal("idle");//sysj\controller.sysj line: 170, column: 5
                                  S22417=1;
                                  if(!capperStatus_o.isACK()){//sysj\controller.sysj line: 170, column: 5
                                    capperStatus_o.setREQ(false);//sysj\controller.sysj line: 170, column: 5
                                    ends[12]=2;
                                    ;//sysj\controller.sysj line: 170, column: 5
                                    S22462=1;
                                    if(bottleAtPos4.getprestatus()){//sysj\controller.sysj line: 173, column: 12
                                      System.out.println("CapperController: Capper doing work...");//sysj\controller.sysj line: 174, column: 5
                                      S22545=0;
                                      thread31158(tdone,ends);
                                      thread31159(tdone,ends);
                                      thread31160(tdone,ends);
                                      thread31164(tdone,ends);
                                      int biggest31165 = 0;
                                      if(ends[13]>=biggest31165){
                                        biggest31165=ends[13];
                                      }
                                      if(ends[14]>=biggest31165){
                                        biggest31165=ends[14];
                                      }
                                      if(ends[15]>=biggest31165){
                                        biggest31165=ends[15];
                                      }
                                      if(ends[18]>=biggest31165){
                                        biggest31165=ends[18];
                                      }
                                      if(biggest31165 == 1){
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
                              S22462=1;
                              if(bottleAtPos4.getprestatus()){//sysj\controller.sysj line: 173, column: 12
                                System.out.println("CapperController: Capper doing work...");//sysj\controller.sysj line: 174, column: 5
                                S22545=0;
                                thread31166(tdone,ends);
                                thread31167(tdone,ends);
                                thread31168(tdone,ends);
                                thread31172(tdone,ends);
                                int biggest31173 = 0;
                                if(ends[13]>=biggest31173){
                                  biggest31173=ends[13];
                                }
                                if(ends[14]>=biggest31173){
                                  biggest31173=ends[14];
                                }
                                if(ends[15]>=biggest31173){
                                  biggest31173=ends[15];
                                }
                                if(ends[18]>=biggest31173){
                                  biggest31173=ends[18];
                                }
                                if(biggest31173 == 1){
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
                          S22462=0;
                          if(!bottleAtPos4.getprestatus()){//sysj\controller.sysj line: 169, column: 13
                            S22422=0;
                            if(!capperStatus_o.isPartnerPresent() || capperStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 170, column: 5
                              capperStatus_o.setREQ(false);//sysj\controller.sysj line: 170, column: 5
                              S22422=1;
                              active[12]=1;
                              ends[12]=1;
                              break RUN;
                            }
                            else {
                              S22417=0;
                              if(capperStatus_o.isACK()){//sysj\controller.sysj line: 170, column: 5
                                capperStatus_o.setVal("idle");//sysj\controller.sysj line: 170, column: 5
                                S22417=1;
                                if(!capperStatus_o.isACK()){//sysj\controller.sysj line: 170, column: 5
                                  capperStatus_o.setREQ(false);//sysj\controller.sysj line: 170, column: 5
                                  ends[12]=2;
                                  ;//sysj\controller.sysj line: 170, column: 5
                                  S22462=1;
                                  if(bottleAtPos4.getprestatus()){//sysj\controller.sysj line: 173, column: 12
                                    System.out.println("CapperController: Capper doing work...");//sysj\controller.sysj line: 174, column: 5
                                    S22545=0;
                                    thread31174(tdone,ends);
                                    thread31175(tdone,ends);
                                    thread31176(tdone,ends);
                                    thread31180(tdone,ends);
                                    int biggest31181 = 0;
                                    if(ends[13]>=biggest31181){
                                      biggest31181=ends[13];
                                    }
                                    if(ends[14]>=biggest31181){
                                      biggest31181=ends[14];
                                    }
                                    if(ends[15]>=biggest31181){
                                      biggest31181=ends[15];
                                    }
                                    if(ends[18]>=biggest31181){
                                      biggest31181=ends[18];
                                    }
                                    if(biggest31181 == 1){
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
                            S22462=1;
                            if(bottleAtPos4.getprestatus()){//sysj\controller.sysj line: 173, column: 12
                              System.out.println("CapperController: Capper doing work...");//sysj\controller.sysj line: 174, column: 5
                              S22545=0;
                              thread31182(tdone,ends);
                              thread31183(tdone,ends);
                              thread31184(tdone,ends);
                              thread31188(tdone,ends);
                              int biggest31189 = 0;
                              if(ends[13]>=biggest31189){
                                biggest31189=ends[13];
                              }
                              if(ends[14]>=biggest31189){
                                biggest31189=ends[14];
                              }
                              if(ends[15]>=biggest31189){
                                biggest31189=ends[15];
                              }
                              if(ends[18]>=biggest31189){
                                biggest31189=ends[18];
                              }
                              if(biggest31189 == 1){
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
              switch(S22462){
                case 0 : 
                  switch(S22422){
                    case 0 : 
                      if(!capperStatus_o.isPartnerPresent() || capperStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 170, column: 5
                        capperStatus_o.setREQ(false);//sysj\controller.sysj line: 170, column: 5
                        S22422=1;
                        active[12]=1;
                        ends[12]=1;
                        break RUN;
                      }
                      else {
                        switch(S22417){
                          case 0 : 
                            if(capperStatus_o.isACK()){//sysj\controller.sysj line: 170, column: 5
                              capperStatus_o.setVal("idle");//sysj\controller.sysj line: 170, column: 5
                              S22417=1;
                              if(!capperStatus_o.isACK()){//sysj\controller.sysj line: 170, column: 5
                                capperStatus_o.setREQ(false);//sysj\controller.sysj line: 170, column: 5
                                ends[12]=2;
                                ;//sysj\controller.sysj line: 170, column: 5
                                S22462=1;
                                if(bottleAtPos4.getprestatus()){//sysj\controller.sysj line: 173, column: 12
                                  System.out.println("CapperController: Capper doing work...");//sysj\controller.sysj line: 174, column: 5
                                  S22545=0;
                                  thread31190(tdone,ends);
                                  thread31191(tdone,ends);
                                  thread31192(tdone,ends);
                                  thread31196(tdone,ends);
                                  int biggest31197 = 0;
                                  if(ends[13]>=biggest31197){
                                    biggest31197=ends[13];
                                  }
                                  if(ends[14]>=biggest31197){
                                    biggest31197=ends[14];
                                  }
                                  if(ends[15]>=biggest31197){
                                    biggest31197=ends[15];
                                  }
                                  if(ends[18]>=biggest31197){
                                    biggest31197=ends[18];
                                  }
                                  if(biggest31197 == 1){
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
                            if(!capperStatus_o.isACK()){//sysj\controller.sysj line: 170, column: 5
                              capperStatus_o.setREQ(false);//sysj\controller.sysj line: 170, column: 5
                              ends[12]=2;
                              ;//sysj\controller.sysj line: 170, column: 5
                              S22462=1;
                              if(bottleAtPos4.getprestatus()){//sysj\controller.sysj line: 173, column: 12
                                System.out.println("CapperController: Capper doing work...");//sysj\controller.sysj line: 174, column: 5
                                S22545=0;
                                thread31198(tdone,ends);
                                thread31199(tdone,ends);
                                thread31200(tdone,ends);
                                thread31204(tdone,ends);
                                int biggest31205 = 0;
                                if(ends[13]>=biggest31205){
                                  biggest31205=ends[13];
                                }
                                if(ends[14]>=biggest31205){
                                  biggest31205=ends[14];
                                }
                                if(ends[15]>=biggest31205){
                                  biggest31205=ends[15];
                                }
                                if(ends[18]>=biggest31205){
                                  biggest31205=ends[18];
                                }
                                if(biggest31205 == 1){
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
                      if(!capperStatus_o.isPartnerPresent() || capperStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 170, column: 5
                        capperStatus_o.setREQ(false);//sysj\controller.sysj line: 170, column: 5
                        S22422=1;
                        active[12]=1;
                        ends[12]=1;
                        break RUN;
                      }
                      else {
                        S22417=0;
                        if(capperStatus_o.isACK()){//sysj\controller.sysj line: 170, column: 5
                          capperStatus_o.setVal("idle");//sysj\controller.sysj line: 170, column: 5
                          S22417=1;
                          if(!capperStatus_o.isACK()){//sysj\controller.sysj line: 170, column: 5
                            capperStatus_o.setREQ(false);//sysj\controller.sysj line: 170, column: 5
                            ends[12]=2;
                            ;//sysj\controller.sysj line: 170, column: 5
                            S22462=1;
                            if(bottleAtPos4.getprestatus()){//sysj\controller.sysj line: 173, column: 12
                              System.out.println("CapperController: Capper doing work...");//sysj\controller.sysj line: 174, column: 5
                              S22545=0;
                              thread31206(tdone,ends);
                              thread31207(tdone,ends);
                              thread31208(tdone,ends);
                              thread31212(tdone,ends);
                              int biggest31213 = 0;
                              if(ends[13]>=biggest31213){
                                biggest31213=ends[13];
                              }
                              if(ends[14]>=biggest31213){
                                biggest31213=ends[14];
                              }
                              if(ends[15]>=biggest31213){
                                biggest31213=ends[15];
                              }
                              if(ends[18]>=biggest31213){
                                biggest31213=ends[18];
                              }
                              if(biggest31213 == 1){
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
                  switch(S22545){
                    case 0 : 
                      thread31214(tdone,ends);
                      thread31215(tdone,ends);
                      thread31216(tdone,ends);
                      thread31220(tdone,ends);
                      int biggest31221 = 0;
                      if(ends[13]>=biggest31221){
                        biggest31221=ends[13];
                      }
                      if(ends[14]>=biggest31221){
                        biggest31221=ends[14];
                      }
                      if(ends[15]>=biggest31221){
                        biggest31221=ends[15];
                      }
                      if(ends[18]>=biggest31221){
                        biggest31221=ends[18];
                      }
                      if(biggest31221 == 1){
                        active[12]=1;
                        ends[12]=1;
                        break RUN;
                      }
                      //FINXME code
                      if(biggest31221 == 0){
                        S22545=1;
                        S22552=0;
                        if(!capperStatus_o.isPartnerPresent() || capperStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 210, column: 5
                          capperStatus_o.setREQ(false);//sysj\controller.sysj line: 210, column: 5
                          S22552=1;
                          active[12]=1;
                          ends[12]=1;
                          break RUN;
                        }
                        else {
                          S22547=0;
                          if(capperStatus_o.isACK()){//sysj\controller.sysj line: 210, column: 5
                            capperStatus_o.setVal("done");//sysj\controller.sysj line: 210, column: 5
                            S22547=1;
                            if(!capperStatus_o.isACK()){//sysj\controller.sysj line: 210, column: 5
                              capperStatus_o.setREQ(false);//sysj\controller.sysj line: 210, column: 5
                              ends[12]=2;
                              ;//sysj\controller.sysj line: 210, column: 5
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
                      switch(S22552){
                        case 0 : 
                          if(!capperStatus_o.isPartnerPresent() || capperStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 210, column: 5
                            capperStatus_o.setREQ(false);//sysj\controller.sysj line: 210, column: 5
                            S22552=1;
                            active[12]=1;
                            ends[12]=1;
                            break RUN;
                          }
                          else {
                            switch(S22547){
                              case 0 : 
                                if(capperStatus_o.isACK()){//sysj\controller.sysj line: 210, column: 5
                                  capperStatus_o.setVal("done");//sysj\controller.sysj line: 210, column: 5
                                  S22547=1;
                                  if(!capperStatus_o.isACK()){//sysj\controller.sysj line: 210, column: 5
                                    capperStatus_o.setREQ(false);//sysj\controller.sysj line: 210, column: 5
                                    ends[12]=2;
                                    ;//sysj\controller.sysj line: 210, column: 5
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
                                if(!capperStatus_o.isACK()){//sysj\controller.sysj line: 210, column: 5
                                  capperStatus_o.setREQ(false);//sysj\controller.sysj line: 210, column: 5
                                  ends[12]=2;
                                  ;//sysj\controller.sysj line: 210, column: 5
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
                          S22552=1;
                          S22552=0;
                          if(!capperStatus_o.isPartnerPresent() || capperStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 210, column: 5
                            capperStatus_o.setREQ(false);//sysj\controller.sysj line: 210, column: 5
                            S22552=1;
                            active[12]=1;
                            ends[12]=1;
                            break RUN;
                          }
                          else {
                            S22547=0;
                            if(capperStatus_o.isACK()){//sysj\controller.sysj line: 210, column: 5
                              capperStatus_o.setVal("done");//sysj\controller.sysj line: 210, column: 5
                              S22547=1;
                              if(!capperStatus_o.isACK()){//sysj\controller.sysj line: 210, column: 5
                                capperStatus_o.setREQ(false);//sysj\controller.sysj line: 210, column: 5
                                ends[12]=2;
                                ;//sysj\controller.sysj line: 210, column: 5
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
                      S22462=0;
                      if(!bottleAtPos4.getprestatus()){//sysj\controller.sysj line: 169, column: 13
                        S22422=0;
                        if(!capperStatus_o.isPartnerPresent() || capperStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 170, column: 5
                          capperStatus_o.setREQ(false);//sysj\controller.sysj line: 170, column: 5
                          S22422=1;
                          active[12]=1;
                          ends[12]=1;
                          break RUN;
                        }
                        else {
                          S22417=0;
                          if(capperStatus_o.isACK()){//sysj\controller.sysj line: 170, column: 5
                            capperStatus_o.setVal("idle");//sysj\controller.sysj line: 170, column: 5
                            S22417=1;
                            if(!capperStatus_o.isACK()){//sysj\controller.sysj line: 170, column: 5
                              capperStatus_o.setREQ(false);//sysj\controller.sysj line: 170, column: 5
                              ends[12]=2;
                              ;//sysj\controller.sysj line: 170, column: 5
                              S22462=1;
                              if(bottleAtPos4.getprestatus()){//sysj\controller.sysj line: 173, column: 12
                                System.out.println("CapperController: Capper doing work...");//sysj\controller.sysj line: 174, column: 5
                                S22545=0;
                                thread31222(tdone,ends);
                                thread31223(tdone,ends);
                                thread31224(tdone,ends);
                                thread31228(tdone,ends);
                                int biggest31229 = 0;
                                if(ends[13]>=biggest31229){
                                  biggest31229=ends[13];
                                }
                                if(ends[14]>=biggest31229){
                                  biggest31229=ends[14];
                                }
                                if(ends[15]>=biggest31229){
                                  biggest31229=ends[15];
                                }
                                if(ends[18]>=biggest31229){
                                  biggest31229=ends[18];
                                }
                                if(biggest31229 == 1){
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
                        S22462=1;
                        if(bottleAtPos4.getprestatus()){//sysj\controller.sysj line: 173, column: 12
                          System.out.println("CapperController: Capper doing work...");//sysj\controller.sysj line: 174, column: 5
                          S22545=0;
                          thread31230(tdone,ends);
                          thread31231(tdone,ends);
                          thread31232(tdone,ends);
                          thread31236(tdone,ends);
                          int biggest31237 = 0;
                          if(ends[13]>=biggest31237){
                            biggest31237=ends[13];
                          }
                          if(ends[14]>=biggest31237){
                            biggest31237=ends[14];
                          }
                          if(ends[15]>=biggest31237){
                            biggest31237=ends[15];
                          }
                          if(ends[18]>=biggest31237){
                            biggest31237=ends[18];
                          }
                          if(biggest31237 == 1){
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
    char [] active1 = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
    char [] paused1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    char [] suspended1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
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
