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
  
  private int[] ends = new int[22];
  private int[] tdone = new int[22];
  
  public void thread38400(int [] tdone, int [] ends){
        S22503=1;
    S22500=0;
    active[18]=1;
    ends[18]=1;
    tdone[18]=1;
  }

  public void thread38398(int [] tdone, int [] ends){
        S22480=1;
    active[17]=1;
    ends[17]=1;
    tdone[17]=1;
  }

  public void thread38397(int [] tdone, int [] ends){
        S22477=1;
    active[16]=1;
    ends[16]=1;
    tdone[16]=1;
  }

  public void thread38396(int [] tdone, int [] ends){
        S22490=1;
    S22489=0;
    thread38397(tdone,ends);
    thread38398(tdone,ends);
    int biggest38399 = 0;
    if(ends[16]>=biggest38399){
      biggest38399=ends[16];
    }
    if(ends[17]>=biggest38399){
      biggest38399=ends[17];
    }
    if(biggest38399 == 1){
      active[15]=1;
      ends[15]=1;
      tdone[15]=1;
    }
  }

  public void thread38395(int [] tdone, int [] ends){
        S22474=1;
    cylPos5ZAxisExtend.setPresent();//sysj\controller.sysj line: 183, column: 7
    currsigs.addElement(cylPos5ZAxisExtend);
    active[14]=1;
    ends[14]=1;
    tdone[14]=1;
  }

  public void thread38394(int [] tdone, int [] ends){
        S22468=1;
    cylClampBottleExtend.setPresent();//sysj\controller.sysj line: 177, column: 7
    currsigs.addElement(cylClampBottleExtend);
    active[13]=1;
    ends[13]=1;
    tdone[13]=1;
  }

  public void thread38392(int [] tdone, int [] ends){
        S22503=1;
    S22500=0;
    active[18]=1;
    ends[18]=1;
    tdone[18]=1;
  }

  public void thread38390(int [] tdone, int [] ends){
        S22480=1;
    active[17]=1;
    ends[17]=1;
    tdone[17]=1;
  }

  public void thread38389(int [] tdone, int [] ends){
        S22477=1;
    active[16]=1;
    ends[16]=1;
    tdone[16]=1;
  }

  public void thread38388(int [] tdone, int [] ends){
        S22490=1;
    S22489=0;
    thread38389(tdone,ends);
    thread38390(tdone,ends);
    int biggest38391 = 0;
    if(ends[16]>=biggest38391){
      biggest38391=ends[16];
    }
    if(ends[17]>=biggest38391){
      biggest38391=ends[17];
    }
    if(biggest38391 == 1){
      active[15]=1;
      ends[15]=1;
      tdone[15]=1;
    }
  }

  public void thread38387(int [] tdone, int [] ends){
        S22474=1;
    cylPos5ZAxisExtend.setPresent();//sysj\controller.sysj line: 183, column: 7
    currsigs.addElement(cylPos5ZAxisExtend);
    active[14]=1;
    ends[14]=1;
    tdone[14]=1;
  }

  public void thread38386(int [] tdone, int [] ends){
        S22468=1;
    cylClampBottleExtend.setPresent();//sysj\controller.sysj line: 177, column: 7
    currsigs.addElement(cylClampBottleExtend);
    active[13]=1;
    ends[13]=1;
    tdone[13]=1;
  }

  public void thread38384(int [] tdone, int [] ends){
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

  public void thread38382(int [] tdone, int [] ends){
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

  public void thread38381(int [] tdone, int [] ends){
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

  public void thread38380(int [] tdone, int [] ends){
        switch(S22490){
      case 0 : 
        active[15]=0;
        ends[15]=0;
        tdone[15]=1;
        break;
      
      case 1 : 
        switch(S22489){
          case 0 : 
            thread38381(tdone,ends);
            thread38382(tdone,ends);
            int biggest38383 = 0;
            if(ends[16]>=biggest38383){
              biggest38383=ends[16];
            }
            if(ends[17]>=biggest38383){
              biggest38383=ends[17];
            }
            if(biggest38383 == 1){
              active[15]=1;
              ends[15]=1;
              tdone[15]=1;
            }
            //FINXME code
            if(biggest38383 == 0){
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

  public void thread38379(int [] tdone, int [] ends){
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

  public void thread38378(int [] tdone, int [] ends){
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

  public void thread38376(int [] tdone, int [] ends){
        S22503=1;
    S22500=0;
    active[18]=1;
    ends[18]=1;
    tdone[18]=1;
  }

  public void thread38374(int [] tdone, int [] ends){
        S22480=1;
    active[17]=1;
    ends[17]=1;
    tdone[17]=1;
  }

  public void thread38373(int [] tdone, int [] ends){
        S22477=1;
    active[16]=1;
    ends[16]=1;
    tdone[16]=1;
  }

  public void thread38372(int [] tdone, int [] ends){
        S22490=1;
    S22489=0;
    thread38373(tdone,ends);
    thread38374(tdone,ends);
    int biggest38375 = 0;
    if(ends[16]>=biggest38375){
      biggest38375=ends[16];
    }
    if(ends[17]>=biggest38375){
      biggest38375=ends[17];
    }
    if(biggest38375 == 1){
      active[15]=1;
      ends[15]=1;
      tdone[15]=1;
    }
  }

  public void thread38371(int [] tdone, int [] ends){
        S22474=1;
    cylPos5ZAxisExtend.setPresent();//sysj\controller.sysj line: 183, column: 7
    currsigs.addElement(cylPos5ZAxisExtend);
    active[14]=1;
    ends[14]=1;
    tdone[14]=1;
  }

  public void thread38370(int [] tdone, int [] ends){
        S22468=1;
    cylClampBottleExtend.setPresent();//sysj\controller.sysj line: 177, column: 7
    currsigs.addElement(cylClampBottleExtend);
    active[13]=1;
    ends[13]=1;
    tdone[13]=1;
  }

  public void thread38368(int [] tdone, int [] ends){
        S22503=1;
    S22500=0;
    active[18]=1;
    ends[18]=1;
    tdone[18]=1;
  }

  public void thread38366(int [] tdone, int [] ends){
        S22480=1;
    active[17]=1;
    ends[17]=1;
    tdone[17]=1;
  }

  public void thread38365(int [] tdone, int [] ends){
        S22477=1;
    active[16]=1;
    ends[16]=1;
    tdone[16]=1;
  }

  public void thread38364(int [] tdone, int [] ends){
        S22490=1;
    S22489=0;
    thread38365(tdone,ends);
    thread38366(tdone,ends);
    int biggest38367 = 0;
    if(ends[16]>=biggest38367){
      biggest38367=ends[16];
    }
    if(ends[17]>=biggest38367){
      biggest38367=ends[17];
    }
    if(biggest38367 == 1){
      active[15]=1;
      ends[15]=1;
      tdone[15]=1;
    }
  }

  public void thread38363(int [] tdone, int [] ends){
        S22474=1;
    cylPos5ZAxisExtend.setPresent();//sysj\controller.sysj line: 183, column: 7
    currsigs.addElement(cylPos5ZAxisExtend);
    active[14]=1;
    ends[14]=1;
    tdone[14]=1;
  }

  public void thread38362(int [] tdone, int [] ends){
        S22468=1;
    cylClampBottleExtend.setPresent();//sysj\controller.sysj line: 177, column: 7
    currsigs.addElement(cylClampBottleExtend);
    active[13]=1;
    ends[13]=1;
    tdone[13]=1;
  }

  public void thread38360(int [] tdone, int [] ends){
        S22503=1;
    S22500=0;
    active[18]=1;
    ends[18]=1;
    tdone[18]=1;
  }

  public void thread38358(int [] tdone, int [] ends){
        S22480=1;
    active[17]=1;
    ends[17]=1;
    tdone[17]=1;
  }

  public void thread38357(int [] tdone, int [] ends){
        S22477=1;
    active[16]=1;
    ends[16]=1;
    tdone[16]=1;
  }

  public void thread38356(int [] tdone, int [] ends){
        S22490=1;
    S22489=0;
    thread38357(tdone,ends);
    thread38358(tdone,ends);
    int biggest38359 = 0;
    if(ends[16]>=biggest38359){
      biggest38359=ends[16];
    }
    if(ends[17]>=biggest38359){
      biggest38359=ends[17];
    }
    if(biggest38359 == 1){
      active[15]=1;
      ends[15]=1;
      tdone[15]=1;
    }
  }

  public void thread38355(int [] tdone, int [] ends){
        S22474=1;
    cylPos5ZAxisExtend.setPresent();//sysj\controller.sysj line: 183, column: 7
    currsigs.addElement(cylPos5ZAxisExtend);
    active[14]=1;
    ends[14]=1;
    tdone[14]=1;
  }

  public void thread38354(int [] tdone, int [] ends){
        S22468=1;
    cylClampBottleExtend.setPresent();//sysj\controller.sysj line: 177, column: 7
    currsigs.addElement(cylClampBottleExtend);
    active[13]=1;
    ends[13]=1;
    tdone[13]=1;
  }

  public void thread38352(int [] tdone, int [] ends){
        S22503=1;
    S22500=0;
    active[18]=1;
    ends[18]=1;
    tdone[18]=1;
  }

  public void thread38350(int [] tdone, int [] ends){
        S22480=1;
    active[17]=1;
    ends[17]=1;
    tdone[17]=1;
  }

  public void thread38349(int [] tdone, int [] ends){
        S22477=1;
    active[16]=1;
    ends[16]=1;
    tdone[16]=1;
  }

  public void thread38348(int [] tdone, int [] ends){
        S22490=1;
    S22489=0;
    thread38349(tdone,ends);
    thread38350(tdone,ends);
    int biggest38351 = 0;
    if(ends[16]>=biggest38351){
      biggest38351=ends[16];
    }
    if(ends[17]>=biggest38351){
      biggest38351=ends[17];
    }
    if(biggest38351 == 1){
      active[15]=1;
      ends[15]=1;
      tdone[15]=1;
    }
  }

  public void thread38347(int [] tdone, int [] ends){
        S22474=1;
    cylPos5ZAxisExtend.setPresent();//sysj\controller.sysj line: 183, column: 7
    currsigs.addElement(cylPos5ZAxisExtend);
    active[14]=1;
    ends[14]=1;
    tdone[14]=1;
  }

  public void thread38346(int [] tdone, int [] ends){
        S22468=1;
    cylClampBottleExtend.setPresent();//sysj\controller.sysj line: 177, column: 7
    currsigs.addElement(cylClampBottleExtend);
    active[13]=1;
    ends[13]=1;
    tdone[13]=1;
  }

  public void thread38344(int [] tdone, int [] ends){
        S22503=1;
    S22500=0;
    active[18]=1;
    ends[18]=1;
    tdone[18]=1;
  }

  public void thread38342(int [] tdone, int [] ends){
        S22480=1;
    active[17]=1;
    ends[17]=1;
    tdone[17]=1;
  }

  public void thread38341(int [] tdone, int [] ends){
        S22477=1;
    active[16]=1;
    ends[16]=1;
    tdone[16]=1;
  }

  public void thread38340(int [] tdone, int [] ends){
        S22490=1;
    S22489=0;
    thread38341(tdone,ends);
    thread38342(tdone,ends);
    int biggest38343 = 0;
    if(ends[16]>=biggest38343){
      biggest38343=ends[16];
    }
    if(ends[17]>=biggest38343){
      biggest38343=ends[17];
    }
    if(biggest38343 == 1){
      active[15]=1;
      ends[15]=1;
      tdone[15]=1;
    }
  }

  public void thread38339(int [] tdone, int [] ends){
        S22474=1;
    cylPos5ZAxisExtend.setPresent();//sysj\controller.sysj line: 183, column: 7
    currsigs.addElement(cylPos5ZAxisExtend);
    active[14]=1;
    ends[14]=1;
    tdone[14]=1;
  }

  public void thread38338(int [] tdone, int [] ends){
        S22468=1;
    cylClampBottleExtend.setPresent();//sysj\controller.sysj line: 177, column: 7
    currsigs.addElement(cylClampBottleExtend);
    active[13]=1;
    ends[13]=1;
    tdone[13]=1;
  }

  public void thread38336(int [] tdone, int [] ends){
        S22503=1;
    S22500=0;
    active[18]=1;
    ends[18]=1;
    tdone[18]=1;
  }

  public void thread38334(int [] tdone, int [] ends){
        S22480=1;
    active[17]=1;
    ends[17]=1;
    tdone[17]=1;
  }

  public void thread38333(int [] tdone, int [] ends){
        S22477=1;
    active[16]=1;
    ends[16]=1;
    tdone[16]=1;
  }

  public void thread38332(int [] tdone, int [] ends){
        S22490=1;
    S22489=0;
    thread38333(tdone,ends);
    thread38334(tdone,ends);
    int biggest38335 = 0;
    if(ends[16]>=biggest38335){
      biggest38335=ends[16];
    }
    if(ends[17]>=biggest38335){
      biggest38335=ends[17];
    }
    if(biggest38335 == 1){
      active[15]=1;
      ends[15]=1;
      tdone[15]=1;
    }
  }

  public void thread38331(int [] tdone, int [] ends){
        S22474=1;
    cylPos5ZAxisExtend.setPresent();//sysj\controller.sysj line: 183, column: 7
    currsigs.addElement(cylPos5ZAxisExtend);
    active[14]=1;
    ends[14]=1;
    tdone[14]=1;
  }

  public void thread38330(int [] tdone, int [] ends){
        S22468=1;
    cylClampBottleExtend.setPresent();//sysj\controller.sysj line: 177, column: 7
    currsigs.addElement(cylClampBottleExtend);
    active[13]=1;
    ends[13]=1;
    tdone[13]=1;
  }

  public void thread38328(int [] tdone, int [] ends){
        S22503=1;
    S22500=0;
    active[18]=1;
    ends[18]=1;
    tdone[18]=1;
  }

  public void thread38326(int [] tdone, int [] ends){
        S22480=1;
    active[17]=1;
    ends[17]=1;
    tdone[17]=1;
  }

  public void thread38325(int [] tdone, int [] ends){
        S22477=1;
    active[16]=1;
    ends[16]=1;
    tdone[16]=1;
  }

  public void thread38324(int [] tdone, int [] ends){
        S22490=1;
    S22489=0;
    thread38325(tdone,ends);
    thread38326(tdone,ends);
    int biggest38327 = 0;
    if(ends[16]>=biggest38327){
      biggest38327=ends[16];
    }
    if(ends[17]>=biggest38327){
      biggest38327=ends[17];
    }
    if(biggest38327 == 1){
      active[15]=1;
      ends[15]=1;
      tdone[15]=1;
    }
  }

  public void thread38323(int [] tdone, int [] ends){
        S22474=1;
    cylPos5ZAxisExtend.setPresent();//sysj\controller.sysj line: 183, column: 7
    currsigs.addElement(cylPos5ZAxisExtend);
    active[14]=1;
    ends[14]=1;
    tdone[14]=1;
  }

  public void thread38322(int [] tdone, int [] ends){
        S22468=1;
    cylClampBottleExtend.setPresent();//sysj\controller.sysj line: 177, column: 7
    currsigs.addElement(cylClampBottleExtend);
    active[13]=1;
    ends[13]=1;
    tdone[13]=1;
  }

  public void thread38320(int [] tdone, int [] ends){
        S22503=1;
    S22500=0;
    active[18]=1;
    ends[18]=1;
    tdone[18]=1;
  }

  public void thread38318(int [] tdone, int [] ends){
        S22480=1;
    active[17]=1;
    ends[17]=1;
    tdone[17]=1;
  }

  public void thread38317(int [] tdone, int [] ends){
        S22477=1;
    active[16]=1;
    ends[16]=1;
    tdone[16]=1;
  }

  public void thread38316(int [] tdone, int [] ends){
        S22490=1;
    S22489=0;
    thread38317(tdone,ends);
    thread38318(tdone,ends);
    int biggest38319 = 0;
    if(ends[16]>=biggest38319){
      biggest38319=ends[16];
    }
    if(ends[17]>=biggest38319){
      biggest38319=ends[17];
    }
    if(biggest38319 == 1){
      active[15]=1;
      ends[15]=1;
      tdone[15]=1;
    }
  }

  public void thread38315(int [] tdone, int [] ends){
        S22474=1;
    cylPos5ZAxisExtend.setPresent();//sysj\controller.sysj line: 183, column: 7
    currsigs.addElement(cylPos5ZAxisExtend);
    active[14]=1;
    ends[14]=1;
    tdone[14]=1;
  }

  public void thread38314(int [] tdone, int [] ends){
        S22468=1;
    cylClampBottleExtend.setPresent();//sysj\controller.sysj line: 177, column: 7
    currsigs.addElement(cylClampBottleExtend);
    active[13]=1;
    ends[13]=1;
    tdone[13]=1;
  }

  public void thread38312(int [] tdone, int [] ends){
        S22503=1;
    S22500=0;
    active[18]=1;
    ends[18]=1;
    tdone[18]=1;
  }

  public void thread38310(int [] tdone, int [] ends){
        S22480=1;
    active[17]=1;
    ends[17]=1;
    tdone[17]=1;
  }

  public void thread38309(int [] tdone, int [] ends){
        S22477=1;
    active[16]=1;
    ends[16]=1;
    tdone[16]=1;
  }

  public void thread38308(int [] tdone, int [] ends){
        S22490=1;
    S22489=0;
    thread38309(tdone,ends);
    thread38310(tdone,ends);
    int biggest38311 = 0;
    if(ends[16]>=biggest38311){
      biggest38311=ends[16];
    }
    if(ends[17]>=biggest38311){
      biggest38311=ends[17];
    }
    if(biggest38311 == 1){
      active[15]=1;
      ends[15]=1;
      tdone[15]=1;
    }
  }

  public void thread38307(int [] tdone, int [] ends){
        S22474=1;
    cylPos5ZAxisExtend.setPresent();//sysj\controller.sysj line: 183, column: 7
    currsigs.addElement(cylPos5ZAxisExtend);
    active[14]=1;
    ends[14]=1;
    tdone[14]=1;
  }

  public void thread38306(int [] tdone, int [] ends){
        S22468=1;
    cylClampBottleExtend.setPresent();//sysj\controller.sysj line: 177, column: 7
    currsigs.addElement(cylClampBottleExtend);
    active[13]=1;
    ends[13]=1;
    tdone[13]=1;
  }

  public void thread38304(int [] tdone, int [] ends){
        S22503=1;
    S22500=0;
    active[18]=1;
    ends[18]=1;
    tdone[18]=1;
  }

  public void thread38302(int [] tdone, int [] ends){
        S22480=1;
    active[17]=1;
    ends[17]=1;
    tdone[17]=1;
  }

  public void thread38301(int [] tdone, int [] ends){
        S22477=1;
    active[16]=1;
    ends[16]=1;
    tdone[16]=1;
  }

  public void thread38300(int [] tdone, int [] ends){
        S22490=1;
    S22489=0;
    thread38301(tdone,ends);
    thread38302(tdone,ends);
    int biggest38303 = 0;
    if(ends[16]>=biggest38303){
      biggest38303=ends[16];
    }
    if(ends[17]>=biggest38303){
      biggest38303=ends[17];
    }
    if(biggest38303 == 1){
      active[15]=1;
      ends[15]=1;
      tdone[15]=1;
    }
  }

  public void thread38299(int [] tdone, int [] ends){
        S22474=1;
    cylPos5ZAxisExtend.setPresent();//sysj\controller.sysj line: 183, column: 7
    currsigs.addElement(cylPos5ZAxisExtend);
    active[14]=1;
    ends[14]=1;
    tdone[14]=1;
  }

  public void thread38298(int [] tdone, int [] ends){
        S22468=1;
    cylClampBottleExtend.setPresent();//sysj\controller.sysj line: 177, column: 7
    currsigs.addElement(cylClampBottleExtend);
    active[13]=1;
    ends[13]=1;
    tdone[13]=1;
  }

  public void thread38296(int [] tdone, int [] ends){
        S22503=1;
    S22500=0;
    active[18]=1;
    ends[18]=1;
    tdone[18]=1;
  }

  public void thread38294(int [] tdone, int [] ends){
        S22480=1;
    active[17]=1;
    ends[17]=1;
    tdone[17]=1;
  }

  public void thread38293(int [] tdone, int [] ends){
        S22477=1;
    active[16]=1;
    ends[16]=1;
    tdone[16]=1;
  }

  public void thread38292(int [] tdone, int [] ends){
        S22490=1;
    S22489=0;
    thread38293(tdone,ends);
    thread38294(tdone,ends);
    int biggest38295 = 0;
    if(ends[16]>=biggest38295){
      biggest38295=ends[16];
    }
    if(ends[17]>=biggest38295){
      biggest38295=ends[17];
    }
    if(biggest38295 == 1){
      active[15]=1;
      ends[15]=1;
      tdone[15]=1;
    }
  }

  public void thread38291(int [] tdone, int [] ends){
        S22474=1;
    cylPos5ZAxisExtend.setPresent();//sysj\controller.sysj line: 183, column: 7
    currsigs.addElement(cylPos5ZAxisExtend);
    active[14]=1;
    ends[14]=1;
    tdone[14]=1;
  }

  public void thread38290(int [] tdone, int [] ends){
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
                            thread38290(tdone,ends);
                            thread38291(tdone,ends);
                            thread38292(tdone,ends);
                            thread38296(tdone,ends);
                            int biggest38297 = 0;
                            if(ends[13]>=biggest38297){
                              biggest38297=ends[13];
                            }
                            if(ends[14]>=biggest38297){
                              biggest38297=ends[14];
                            }
                            if(ends[15]>=biggest38297){
                              biggest38297=ends[15];
                            }
                            if(ends[18]>=biggest38297){
                              biggest38297=ends[18];
                            }
                            if(biggest38297 == 1){
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
                      thread38298(tdone,ends);
                      thread38299(tdone,ends);
                      thread38300(tdone,ends);
                      thread38304(tdone,ends);
                      int biggest38305 = 0;
                      if(ends[13]>=biggest38305){
                        biggest38305=ends[13];
                      }
                      if(ends[14]>=biggest38305){
                        biggest38305=ends[14];
                      }
                      if(ends[15]>=biggest38305){
                        biggest38305=ends[15];
                      }
                      if(ends[18]>=biggest38305){
                        biggest38305=ends[18];
                      }
                      if(biggest38305 == 1){
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
                                        thread38306(tdone,ends);
                                        thread38307(tdone,ends);
                                        thread38308(tdone,ends);
                                        thread38312(tdone,ends);
                                        int biggest38313 = 0;
                                        if(ends[13]>=biggest38313){
                                          biggest38313=ends[13];
                                        }
                                        if(ends[14]>=biggest38313){
                                          biggest38313=ends[14];
                                        }
                                        if(ends[15]>=biggest38313){
                                          biggest38313=ends[15];
                                        }
                                        if(ends[18]>=biggest38313){
                                          biggest38313=ends[18];
                                        }
                                        if(biggest38313 == 1){
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
                                  thread38314(tdone,ends);
                                  thread38315(tdone,ends);
                                  thread38316(tdone,ends);
                                  thread38320(tdone,ends);
                                  int biggest38321 = 0;
                                  if(ends[13]>=biggest38321){
                                    biggest38321=ends[13];
                                  }
                                  if(ends[14]>=biggest38321){
                                    biggest38321=ends[14];
                                  }
                                  if(ends[15]>=biggest38321){
                                    biggest38321=ends[15];
                                  }
                                  if(ends[18]>=biggest38321){
                                    biggest38321=ends[18];
                                  }
                                  if(biggest38321 == 1){
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
                                      thread38322(tdone,ends);
                                      thread38323(tdone,ends);
                                      thread38324(tdone,ends);
                                      thread38328(tdone,ends);
                                      int biggest38329 = 0;
                                      if(ends[13]>=biggest38329){
                                        biggest38329=ends[13];
                                      }
                                      if(ends[14]>=biggest38329){
                                        biggest38329=ends[14];
                                      }
                                      if(ends[15]>=biggest38329){
                                        biggest38329=ends[15];
                                      }
                                      if(ends[18]>=biggest38329){
                                        biggest38329=ends[18];
                                      }
                                      if(biggest38329 == 1){
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
                                thread38330(tdone,ends);
                                thread38331(tdone,ends);
                                thread38332(tdone,ends);
                                thread38336(tdone,ends);
                                int biggest38337 = 0;
                                if(ends[13]>=biggest38337){
                                  biggest38337=ends[13];
                                }
                                if(ends[14]>=biggest38337){
                                  biggest38337=ends[14];
                                }
                                if(ends[15]>=biggest38337){
                                  biggest38337=ends[15];
                                }
                                if(ends[18]>=biggest38337){
                                  biggest38337=ends[18];
                                }
                                if(biggest38337 == 1){
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
                                    thread38338(tdone,ends);
                                    thread38339(tdone,ends);
                                    thread38340(tdone,ends);
                                    thread38344(tdone,ends);
                                    int biggest38345 = 0;
                                    if(ends[13]>=biggest38345){
                                      biggest38345=ends[13];
                                    }
                                    if(ends[14]>=biggest38345){
                                      biggest38345=ends[14];
                                    }
                                    if(ends[15]>=biggest38345){
                                      biggest38345=ends[15];
                                    }
                                    if(ends[18]>=biggest38345){
                                      biggest38345=ends[18];
                                    }
                                    if(biggest38345 == 1){
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
                              thread38346(tdone,ends);
                              thread38347(tdone,ends);
                              thread38348(tdone,ends);
                              thread38352(tdone,ends);
                              int biggest38353 = 0;
                              if(ends[13]>=biggest38353){
                                biggest38353=ends[13];
                              }
                              if(ends[14]>=biggest38353){
                                biggest38353=ends[14];
                              }
                              if(ends[15]>=biggest38353){
                                biggest38353=ends[15];
                              }
                              if(ends[18]>=biggest38353){
                                biggest38353=ends[18];
                              }
                              if(biggest38353 == 1){
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
                                  thread38354(tdone,ends);
                                  thread38355(tdone,ends);
                                  thread38356(tdone,ends);
                                  thread38360(tdone,ends);
                                  int biggest38361 = 0;
                                  if(ends[13]>=biggest38361){
                                    biggest38361=ends[13];
                                  }
                                  if(ends[14]>=biggest38361){
                                    biggest38361=ends[14];
                                  }
                                  if(ends[15]>=biggest38361){
                                    biggest38361=ends[15];
                                  }
                                  if(ends[18]>=biggest38361){
                                    biggest38361=ends[18];
                                  }
                                  if(biggest38361 == 1){
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
                                thread38362(tdone,ends);
                                thread38363(tdone,ends);
                                thread38364(tdone,ends);
                                thread38368(tdone,ends);
                                int biggest38369 = 0;
                                if(ends[13]>=biggest38369){
                                  biggest38369=ends[13];
                                }
                                if(ends[14]>=biggest38369){
                                  biggest38369=ends[14];
                                }
                                if(ends[15]>=biggest38369){
                                  biggest38369=ends[15];
                                }
                                if(ends[18]>=biggest38369){
                                  biggest38369=ends[18];
                                }
                                if(biggest38369 == 1){
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
                              thread38370(tdone,ends);
                              thread38371(tdone,ends);
                              thread38372(tdone,ends);
                              thread38376(tdone,ends);
                              int biggest38377 = 0;
                              if(ends[13]>=biggest38377){
                                biggest38377=ends[13];
                              }
                              if(ends[14]>=biggest38377){
                                biggest38377=ends[14];
                              }
                              if(ends[15]>=biggest38377){
                                biggest38377=ends[15];
                              }
                              if(ends[18]>=biggest38377){
                                biggest38377=ends[18];
                              }
                              if(biggest38377 == 1){
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
                      thread38378(tdone,ends);
                      thread38379(tdone,ends);
                      thread38380(tdone,ends);
                      thread38384(tdone,ends);
                      int biggest38385 = 0;
                      if(ends[13]>=biggest38385){
                        biggest38385=ends[13];
                      }
                      if(ends[14]>=biggest38385){
                        biggest38385=ends[14];
                      }
                      if(ends[15]>=biggest38385){
                        biggest38385=ends[15];
                      }
                      if(ends[18]>=biggest38385){
                        biggest38385=ends[18];
                      }
                      if(biggest38385 == 1){
                        active[12]=1;
                        ends[12]=1;
                        break RUN;
                      }
                      //FINXME code
                      if(biggest38385 == 0){
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
                                thread38386(tdone,ends);
                                thread38387(tdone,ends);
                                thread38388(tdone,ends);
                                thread38392(tdone,ends);
                                int biggest38393 = 0;
                                if(ends[13]>=biggest38393){
                                  biggest38393=ends[13];
                                }
                                if(ends[14]>=biggest38393){
                                  biggest38393=ends[14];
                                }
                                if(ends[15]>=biggest38393){
                                  biggest38393=ends[15];
                                }
                                if(ends[18]>=biggest38393){
                                  biggest38393=ends[18];
                                }
                                if(biggest38393 == 1){
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
                          thread38394(tdone,ends);
                          thread38395(tdone,ends);
                          thread38396(tdone,ends);
                          thread38400(tdone,ends);
                          int biggest38401 = 0;
                          if(ends[13]>=biggest38401){
                            biggest38401=ends[13];
                          }
                          if(ends[14]>=biggest38401){
                            biggest38401=ends[14];
                          }
                          if(ends[15]>=biggest38401){
                            biggest38401=ends[15];
                          }
                          if(ends[18]>=biggest38401){
                            biggest38401=ends[18];
                          }
                          if(biggest38401 == 1){
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
