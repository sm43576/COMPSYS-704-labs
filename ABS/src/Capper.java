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
  private boolean request_thread_12;//sysj\controller.sysj line: 173, column: 3
  private int S71843 = 1;
  private int S63539 = 1;
  private int S63523 = 1;
  private int S63518 = 1;
  private int S63586 = 1;
  private int S63546 = 1;
  private int S63541 = 1;
  private int S63669 = 1;
  private int S63592 = 1;
  private int S63598 = 1;
  private int S63614 = 1;
  private int S63613 = 1;
  private int S63601 = 1;
  private int S63604 = 1;
  private int S63627 = 1;
  private int S63624 = 1;
  private int S63676 = 1;
  private int S63671 = 1;
  
  private int[] ends = new int[22];
  private int[] tdone = new int[22];
  
  public void thread78020(int [] tdone, int [] ends){
        S63627=1;
    S63624=0;
    active[18]=1;
    ends[18]=1;
    tdone[18]=1;
  }

  public void thread78018(int [] tdone, int [] ends){
        S63604=1;
    active[17]=1;
    ends[17]=1;
    tdone[17]=1;
  }

  public void thread78017(int [] tdone, int [] ends){
        S63601=1;
    active[16]=1;
    ends[16]=1;
    tdone[16]=1;
  }

  public void thread78016(int [] tdone, int [] ends){
        S63614=1;
    S63613=0;
    thread78017(tdone,ends);
    thread78018(tdone,ends);
    int biggest78019 = 0;
    if(ends[16]>=biggest78019){
      biggest78019=ends[16];
    }
    if(ends[17]>=biggest78019){
      biggest78019=ends[17];
    }
    if(biggest78019 == 1){
      active[15]=1;
      ends[15]=1;
      tdone[15]=1;
    }
  }

  public void thread78015(int [] tdone, int [] ends){
        S63598=1;
    cylPos5ZAxisExtend.setPresent();//sysj\controller.sysj line: 192, column: 7
    currsigs.addElement(cylPos5ZAxisExtend);
    active[14]=1;
    ends[14]=1;
    tdone[14]=1;
  }

  public void thread78014(int [] tdone, int [] ends){
        S63592=1;
    cylClampBottleExtend.setPresent();//sysj\controller.sysj line: 186, column: 7
    currsigs.addElement(cylClampBottleExtend);
    active[13]=1;
    ends[13]=1;
    tdone[13]=1;
  }

  public void thread78012(int [] tdone, int [] ends){
        S63627=1;
    S63624=0;
    active[18]=1;
    ends[18]=1;
    tdone[18]=1;
  }

  public void thread78010(int [] tdone, int [] ends){
        S63604=1;
    active[17]=1;
    ends[17]=1;
    tdone[17]=1;
  }

  public void thread78009(int [] tdone, int [] ends){
        S63601=1;
    active[16]=1;
    ends[16]=1;
    tdone[16]=1;
  }

  public void thread78008(int [] tdone, int [] ends){
        S63614=1;
    S63613=0;
    thread78009(tdone,ends);
    thread78010(tdone,ends);
    int biggest78011 = 0;
    if(ends[16]>=biggest78011){
      biggest78011=ends[16];
    }
    if(ends[17]>=biggest78011){
      biggest78011=ends[17];
    }
    if(biggest78011 == 1){
      active[15]=1;
      ends[15]=1;
      tdone[15]=1;
    }
  }

  public void thread78007(int [] tdone, int [] ends){
        S63598=1;
    cylPos5ZAxisExtend.setPresent();//sysj\controller.sysj line: 192, column: 7
    currsigs.addElement(cylPos5ZAxisExtend);
    active[14]=1;
    ends[14]=1;
    tdone[14]=1;
  }

  public void thread78006(int [] tdone, int [] ends){
        S63592=1;
    cylClampBottleExtend.setPresent();//sysj\controller.sysj line: 186, column: 7
    currsigs.addElement(cylClampBottleExtend);
    active[13]=1;
    ends[13]=1;
    tdone[13]=1;
  }

  public void thread78004(int [] tdone, int [] ends){
        switch(S63627){
      case 0 : 
        active[18]=0;
        ends[18]=0;
        tdone[18]=1;
        break;
      
      case 1 : 
        switch(S63624){
          case 0 : 
            if(gripperGrippedCap.getprestatus()){//sysj\controller.sysj line: 205, column: 12
              S63624=1;
              gripperTurnExtend.setPresent();//sysj\controller.sysj line: 208, column: 7
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
            if(gripperTurnFinalPos.getprestatus()){//sysj\controller.sysj line: 207, column: 13
              releaseCap_12.setPresent();//sysj\controller.sysj line: 210, column: 6
              currsigs.addElement(releaseCap_12);
              untwistGripper_12.setPresent();//sysj\controller.sysj line: 213, column: 7
              currsigs.addElement(untwistGripper_12);
              raiseGripper_12.setPresent();//sysj\controller.sysj line: 216, column: 6
              currsigs.addElement(raiseGripper_12);
              unclampBottle_12.setPresent();//sysj\controller.sysj line: 217, column: 6
              currsigs.addElement(unclampBottle_12);
              S63627=0;
              active[18]=0;
              ends[18]=0;
              tdone[18]=1;
            }
            else {
              gripperTurnExtend.setPresent();//sysj\controller.sysj line: 208, column: 7
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

  public void thread78002(int [] tdone, int [] ends){
        switch(S63604){
      case 0 : 
        active[17]=0;
        ends[17]=0;
        tdone[17]=1;
        break;
      
      case 1 : 
        if(cylClampedBottle.getprestatus()){//sysj\controller.sysj line: 198, column: 46
          S63604=0;
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

  public void thread78001(int [] tdone, int [] ends){
        switch(S63601){
      case 0 : 
        active[16]=0;
        ends[16]=0;
        tdone[16]=1;
        break;
      
      case 1 : 
        if(gripperZAxisLowered.getprestatus()){//sysj\controller.sysj line: 198, column: 13
          S63601=0;
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

  public void thread78000(int [] tdone, int [] ends){
        switch(S63614){
      case 0 : 
        active[15]=0;
        ends[15]=0;
        tdone[15]=1;
        break;
      
      case 1 : 
        switch(S63613){
          case 0 : 
            thread78001(tdone,ends);
            thread78002(tdone,ends);
            int biggest78003 = 0;
            if(ends[16]>=biggest78003){
              biggest78003=ends[16];
            }
            if(ends[17]>=biggest78003){
              biggest78003=ends[17];
            }
            if(biggest78003 == 1){
              active[15]=1;
              ends[15]=1;
              tdone[15]=1;
            }
            //FINXME code
            if(biggest78003 == 0){
              S63613=1;
              capGripperPos5Extend.setPresent();//sysj\controller.sysj line: 200, column: 7
              currsigs.addElement(capGripperPos5Extend);
              active[15]=1;
              ends[15]=1;
              tdone[15]=1;
            }
            break;
          
          case 1 : 
            if(releaseCap_12.getprestatus()){//sysj\controller.sysj line: 199, column: 12
              S63614=0;
              active[15]=0;
              ends[15]=0;
              tdone[15]=1;
            }
            else {
              capGripperPos5Extend.setPresent();//sysj\controller.sysj line: 200, column: 7
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

  public void thread77999(int [] tdone, int [] ends){
        switch(S63598){
      case 0 : 
        active[14]=0;
        ends[14]=0;
        tdone[14]=1;
        break;
      
      case 1 : 
        if(raiseGripper_12.getprestatus()){//sysj\controller.sysj line: 191, column: 12
          S63598=0;
          active[14]=0;
          ends[14]=0;
          tdone[14]=1;
        }
        else {
          cylPos5ZAxisExtend.setPresent();//sysj\controller.sysj line: 192, column: 7
          currsigs.addElement(cylPos5ZAxisExtend);
          active[14]=1;
          ends[14]=1;
          tdone[14]=1;
        }
        break;
      
    }
  }

  public void thread77998(int [] tdone, int [] ends){
        switch(S63592){
      case 0 : 
        active[13]=0;
        ends[13]=0;
        tdone[13]=1;
        break;
      
      case 1 : 
        if(unclampBottle_12.getprestatus()){//sysj\controller.sysj line: 185, column: 13
          S63592=0;
          active[13]=0;
          ends[13]=0;
          tdone[13]=1;
        }
        else {
          cylClampBottleExtend.setPresent();//sysj\controller.sysj line: 186, column: 7
          currsigs.addElement(cylClampBottleExtend);
          active[13]=1;
          ends[13]=1;
          tdone[13]=1;
        }
        break;
      
    }
  }

  public void thread77996(int [] tdone, int [] ends){
        S63627=1;
    S63624=0;
    active[18]=1;
    ends[18]=1;
    tdone[18]=1;
  }

  public void thread77994(int [] tdone, int [] ends){
        S63604=1;
    active[17]=1;
    ends[17]=1;
    tdone[17]=1;
  }

  public void thread77993(int [] tdone, int [] ends){
        S63601=1;
    active[16]=1;
    ends[16]=1;
    tdone[16]=1;
  }

  public void thread77992(int [] tdone, int [] ends){
        S63614=1;
    S63613=0;
    thread77993(tdone,ends);
    thread77994(tdone,ends);
    int biggest77995 = 0;
    if(ends[16]>=biggest77995){
      biggest77995=ends[16];
    }
    if(ends[17]>=biggest77995){
      biggest77995=ends[17];
    }
    if(biggest77995 == 1){
      active[15]=1;
      ends[15]=1;
      tdone[15]=1;
    }
  }

  public void thread77991(int [] tdone, int [] ends){
        S63598=1;
    cylPos5ZAxisExtend.setPresent();//sysj\controller.sysj line: 192, column: 7
    currsigs.addElement(cylPos5ZAxisExtend);
    active[14]=1;
    ends[14]=1;
    tdone[14]=1;
  }

  public void thread77990(int [] tdone, int [] ends){
        S63592=1;
    cylClampBottleExtend.setPresent();//sysj\controller.sysj line: 186, column: 7
    currsigs.addElement(cylClampBottleExtend);
    active[13]=1;
    ends[13]=1;
    tdone[13]=1;
  }

  public void thread77988(int [] tdone, int [] ends){
        S63627=1;
    S63624=0;
    active[18]=1;
    ends[18]=1;
    tdone[18]=1;
  }

  public void thread77986(int [] tdone, int [] ends){
        S63604=1;
    active[17]=1;
    ends[17]=1;
    tdone[17]=1;
  }

  public void thread77985(int [] tdone, int [] ends){
        S63601=1;
    active[16]=1;
    ends[16]=1;
    tdone[16]=1;
  }

  public void thread77984(int [] tdone, int [] ends){
        S63614=1;
    S63613=0;
    thread77985(tdone,ends);
    thread77986(tdone,ends);
    int biggest77987 = 0;
    if(ends[16]>=biggest77987){
      biggest77987=ends[16];
    }
    if(ends[17]>=biggest77987){
      biggest77987=ends[17];
    }
    if(biggest77987 == 1){
      active[15]=1;
      ends[15]=1;
      tdone[15]=1;
    }
  }

  public void thread77983(int [] tdone, int [] ends){
        S63598=1;
    cylPos5ZAxisExtend.setPresent();//sysj\controller.sysj line: 192, column: 7
    currsigs.addElement(cylPos5ZAxisExtend);
    active[14]=1;
    ends[14]=1;
    tdone[14]=1;
  }

  public void thread77982(int [] tdone, int [] ends){
        S63592=1;
    cylClampBottleExtend.setPresent();//sysj\controller.sysj line: 186, column: 7
    currsigs.addElement(cylClampBottleExtend);
    active[13]=1;
    ends[13]=1;
    tdone[13]=1;
  }

  public void thread77980(int [] tdone, int [] ends){
        S63627=1;
    S63624=0;
    active[18]=1;
    ends[18]=1;
    tdone[18]=1;
  }

  public void thread77978(int [] tdone, int [] ends){
        S63604=1;
    active[17]=1;
    ends[17]=1;
    tdone[17]=1;
  }

  public void thread77977(int [] tdone, int [] ends){
        S63601=1;
    active[16]=1;
    ends[16]=1;
    tdone[16]=1;
  }

  public void thread77976(int [] tdone, int [] ends){
        S63614=1;
    S63613=0;
    thread77977(tdone,ends);
    thread77978(tdone,ends);
    int biggest77979 = 0;
    if(ends[16]>=biggest77979){
      biggest77979=ends[16];
    }
    if(ends[17]>=biggest77979){
      biggest77979=ends[17];
    }
    if(biggest77979 == 1){
      active[15]=1;
      ends[15]=1;
      tdone[15]=1;
    }
  }

  public void thread77975(int [] tdone, int [] ends){
        S63598=1;
    cylPos5ZAxisExtend.setPresent();//sysj\controller.sysj line: 192, column: 7
    currsigs.addElement(cylPos5ZAxisExtend);
    active[14]=1;
    ends[14]=1;
    tdone[14]=1;
  }

  public void thread77974(int [] tdone, int [] ends){
        S63592=1;
    cylClampBottleExtend.setPresent();//sysj\controller.sysj line: 186, column: 7
    currsigs.addElement(cylClampBottleExtend);
    active[13]=1;
    ends[13]=1;
    tdone[13]=1;
  }

  public void thread77972(int [] tdone, int [] ends){
        S63627=1;
    S63624=0;
    active[18]=1;
    ends[18]=1;
    tdone[18]=1;
  }

  public void thread77970(int [] tdone, int [] ends){
        S63604=1;
    active[17]=1;
    ends[17]=1;
    tdone[17]=1;
  }

  public void thread77969(int [] tdone, int [] ends){
        S63601=1;
    active[16]=1;
    ends[16]=1;
    tdone[16]=1;
  }

  public void thread77968(int [] tdone, int [] ends){
        S63614=1;
    S63613=0;
    thread77969(tdone,ends);
    thread77970(tdone,ends);
    int biggest77971 = 0;
    if(ends[16]>=biggest77971){
      biggest77971=ends[16];
    }
    if(ends[17]>=biggest77971){
      biggest77971=ends[17];
    }
    if(biggest77971 == 1){
      active[15]=1;
      ends[15]=1;
      tdone[15]=1;
    }
  }

  public void thread77967(int [] tdone, int [] ends){
        S63598=1;
    cylPos5ZAxisExtend.setPresent();//sysj\controller.sysj line: 192, column: 7
    currsigs.addElement(cylPos5ZAxisExtend);
    active[14]=1;
    ends[14]=1;
    tdone[14]=1;
  }

  public void thread77966(int [] tdone, int [] ends){
        S63592=1;
    cylClampBottleExtend.setPresent();//sysj\controller.sysj line: 186, column: 7
    currsigs.addElement(cylClampBottleExtend);
    active[13]=1;
    ends[13]=1;
    tdone[13]=1;
  }

  public void thread77964(int [] tdone, int [] ends){
        S63627=1;
    S63624=0;
    active[18]=1;
    ends[18]=1;
    tdone[18]=1;
  }

  public void thread77962(int [] tdone, int [] ends){
        S63604=1;
    active[17]=1;
    ends[17]=1;
    tdone[17]=1;
  }

  public void thread77961(int [] tdone, int [] ends){
        S63601=1;
    active[16]=1;
    ends[16]=1;
    tdone[16]=1;
  }

  public void thread77960(int [] tdone, int [] ends){
        S63614=1;
    S63613=0;
    thread77961(tdone,ends);
    thread77962(tdone,ends);
    int biggest77963 = 0;
    if(ends[16]>=biggest77963){
      biggest77963=ends[16];
    }
    if(ends[17]>=biggest77963){
      biggest77963=ends[17];
    }
    if(biggest77963 == 1){
      active[15]=1;
      ends[15]=1;
      tdone[15]=1;
    }
  }

  public void thread77959(int [] tdone, int [] ends){
        S63598=1;
    cylPos5ZAxisExtend.setPresent();//sysj\controller.sysj line: 192, column: 7
    currsigs.addElement(cylPos5ZAxisExtend);
    active[14]=1;
    ends[14]=1;
    tdone[14]=1;
  }

  public void thread77958(int [] tdone, int [] ends){
        S63592=1;
    cylClampBottleExtend.setPresent();//sysj\controller.sysj line: 186, column: 7
    currsigs.addElement(cylClampBottleExtend);
    active[13]=1;
    ends[13]=1;
    tdone[13]=1;
  }

  public void thread77956(int [] tdone, int [] ends){
        S63627=1;
    S63624=0;
    active[18]=1;
    ends[18]=1;
    tdone[18]=1;
  }

  public void thread77954(int [] tdone, int [] ends){
        S63604=1;
    active[17]=1;
    ends[17]=1;
    tdone[17]=1;
  }

  public void thread77953(int [] tdone, int [] ends){
        S63601=1;
    active[16]=1;
    ends[16]=1;
    tdone[16]=1;
  }

  public void thread77952(int [] tdone, int [] ends){
        S63614=1;
    S63613=0;
    thread77953(tdone,ends);
    thread77954(tdone,ends);
    int biggest77955 = 0;
    if(ends[16]>=biggest77955){
      biggest77955=ends[16];
    }
    if(ends[17]>=biggest77955){
      biggest77955=ends[17];
    }
    if(biggest77955 == 1){
      active[15]=1;
      ends[15]=1;
      tdone[15]=1;
    }
  }

  public void thread77951(int [] tdone, int [] ends){
        S63598=1;
    cylPos5ZAxisExtend.setPresent();//sysj\controller.sysj line: 192, column: 7
    currsigs.addElement(cylPos5ZAxisExtend);
    active[14]=1;
    ends[14]=1;
    tdone[14]=1;
  }

  public void thread77950(int [] tdone, int [] ends){
        S63592=1;
    cylClampBottleExtend.setPresent();//sysj\controller.sysj line: 186, column: 7
    currsigs.addElement(cylClampBottleExtend);
    active[13]=1;
    ends[13]=1;
    tdone[13]=1;
  }

  public void thread77948(int [] tdone, int [] ends){
        S63627=1;
    S63624=0;
    active[18]=1;
    ends[18]=1;
    tdone[18]=1;
  }

  public void thread77946(int [] tdone, int [] ends){
        S63604=1;
    active[17]=1;
    ends[17]=1;
    tdone[17]=1;
  }

  public void thread77945(int [] tdone, int [] ends){
        S63601=1;
    active[16]=1;
    ends[16]=1;
    tdone[16]=1;
  }

  public void thread77944(int [] tdone, int [] ends){
        S63614=1;
    S63613=0;
    thread77945(tdone,ends);
    thread77946(tdone,ends);
    int biggest77947 = 0;
    if(ends[16]>=biggest77947){
      biggest77947=ends[16];
    }
    if(ends[17]>=biggest77947){
      biggest77947=ends[17];
    }
    if(biggest77947 == 1){
      active[15]=1;
      ends[15]=1;
      tdone[15]=1;
    }
  }

  public void thread77943(int [] tdone, int [] ends){
        S63598=1;
    cylPos5ZAxisExtend.setPresent();//sysj\controller.sysj line: 192, column: 7
    currsigs.addElement(cylPos5ZAxisExtend);
    active[14]=1;
    ends[14]=1;
    tdone[14]=1;
  }

  public void thread77942(int [] tdone, int [] ends){
        S63592=1;
    cylClampBottleExtend.setPresent();//sysj\controller.sysj line: 186, column: 7
    currsigs.addElement(cylClampBottleExtend);
    active[13]=1;
    ends[13]=1;
    tdone[13]=1;
  }

  public void thread77940(int [] tdone, int [] ends){
        S63627=1;
    S63624=0;
    active[18]=1;
    ends[18]=1;
    tdone[18]=1;
  }

  public void thread77938(int [] tdone, int [] ends){
        S63604=1;
    active[17]=1;
    ends[17]=1;
    tdone[17]=1;
  }

  public void thread77937(int [] tdone, int [] ends){
        S63601=1;
    active[16]=1;
    ends[16]=1;
    tdone[16]=1;
  }

  public void thread77936(int [] tdone, int [] ends){
        S63614=1;
    S63613=0;
    thread77937(tdone,ends);
    thread77938(tdone,ends);
    int biggest77939 = 0;
    if(ends[16]>=biggest77939){
      biggest77939=ends[16];
    }
    if(ends[17]>=biggest77939){
      biggest77939=ends[17];
    }
    if(biggest77939 == 1){
      active[15]=1;
      ends[15]=1;
      tdone[15]=1;
    }
  }

  public void thread77935(int [] tdone, int [] ends){
        S63598=1;
    cylPos5ZAxisExtend.setPresent();//sysj\controller.sysj line: 192, column: 7
    currsigs.addElement(cylPos5ZAxisExtend);
    active[14]=1;
    ends[14]=1;
    tdone[14]=1;
  }

  public void thread77934(int [] tdone, int [] ends){
        S63592=1;
    cylClampBottleExtend.setPresent();//sysj\controller.sysj line: 186, column: 7
    currsigs.addElement(cylClampBottleExtend);
    active[13]=1;
    ends[13]=1;
    tdone[13]=1;
  }

  public void thread77932(int [] tdone, int [] ends){
        S63627=1;
    S63624=0;
    active[18]=1;
    ends[18]=1;
    tdone[18]=1;
  }

  public void thread77930(int [] tdone, int [] ends){
        S63604=1;
    active[17]=1;
    ends[17]=1;
    tdone[17]=1;
  }

  public void thread77929(int [] tdone, int [] ends){
        S63601=1;
    active[16]=1;
    ends[16]=1;
    tdone[16]=1;
  }

  public void thread77928(int [] tdone, int [] ends){
        S63614=1;
    S63613=0;
    thread77929(tdone,ends);
    thread77930(tdone,ends);
    int biggest77931 = 0;
    if(ends[16]>=biggest77931){
      biggest77931=ends[16];
    }
    if(ends[17]>=biggest77931){
      biggest77931=ends[17];
    }
    if(biggest77931 == 1){
      active[15]=1;
      ends[15]=1;
      tdone[15]=1;
    }
  }

  public void thread77927(int [] tdone, int [] ends){
        S63598=1;
    cylPos5ZAxisExtend.setPresent();//sysj\controller.sysj line: 192, column: 7
    currsigs.addElement(cylPos5ZAxisExtend);
    active[14]=1;
    ends[14]=1;
    tdone[14]=1;
  }

  public void thread77926(int [] tdone, int [] ends){
        S63592=1;
    cylClampBottleExtend.setPresent();//sysj\controller.sysj line: 186, column: 7
    currsigs.addElement(cylClampBottleExtend);
    active[13]=1;
    ends[13]=1;
    tdone[13]=1;
  }

  public void thread77924(int [] tdone, int [] ends){
        S63627=1;
    S63624=0;
    active[18]=1;
    ends[18]=1;
    tdone[18]=1;
  }

  public void thread77922(int [] tdone, int [] ends){
        S63604=1;
    active[17]=1;
    ends[17]=1;
    tdone[17]=1;
  }

  public void thread77921(int [] tdone, int [] ends){
        S63601=1;
    active[16]=1;
    ends[16]=1;
    tdone[16]=1;
  }

  public void thread77920(int [] tdone, int [] ends){
        S63614=1;
    S63613=0;
    thread77921(tdone,ends);
    thread77922(tdone,ends);
    int biggest77923 = 0;
    if(ends[16]>=biggest77923){
      biggest77923=ends[16];
    }
    if(ends[17]>=biggest77923){
      biggest77923=ends[17];
    }
    if(biggest77923 == 1){
      active[15]=1;
      ends[15]=1;
      tdone[15]=1;
    }
  }

  public void thread77919(int [] tdone, int [] ends){
        S63598=1;
    cylPos5ZAxisExtend.setPresent();//sysj\controller.sysj line: 192, column: 7
    currsigs.addElement(cylPos5ZAxisExtend);
    active[14]=1;
    ends[14]=1;
    tdone[14]=1;
  }

  public void thread77918(int [] tdone, int [] ends){
        S63592=1;
    cylClampBottleExtend.setPresent();//sysj\controller.sysj line: 186, column: 7
    currsigs.addElement(cylClampBottleExtend);
    active[13]=1;
    ends[13]=1;
    tdone[13]=1;
  }

  public void thread77916(int [] tdone, int [] ends){
        S63627=1;
    S63624=0;
    active[18]=1;
    ends[18]=1;
    tdone[18]=1;
  }

  public void thread77914(int [] tdone, int [] ends){
        S63604=1;
    active[17]=1;
    ends[17]=1;
    tdone[17]=1;
  }

  public void thread77913(int [] tdone, int [] ends){
        S63601=1;
    active[16]=1;
    ends[16]=1;
    tdone[16]=1;
  }

  public void thread77912(int [] tdone, int [] ends){
        S63614=1;
    S63613=0;
    thread77913(tdone,ends);
    thread77914(tdone,ends);
    int biggest77915 = 0;
    if(ends[16]>=biggest77915){
      biggest77915=ends[16];
    }
    if(ends[17]>=biggest77915){
      biggest77915=ends[17];
    }
    if(biggest77915 == 1){
      active[15]=1;
      ends[15]=1;
      tdone[15]=1;
    }
  }

  public void thread77911(int [] tdone, int [] ends){
        S63598=1;
    cylPos5ZAxisExtend.setPresent();//sysj\controller.sysj line: 192, column: 7
    currsigs.addElement(cylPos5ZAxisExtend);
    active[14]=1;
    ends[14]=1;
    tdone[14]=1;
  }

  public void thread77910(int [] tdone, int [] ends){
        S63592=1;
    cylClampBottleExtend.setPresent();//sysj\controller.sysj line: 186, column: 7
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
      switch(S71843){
        case 0 : 
          S71843=0;
          break RUN;
        
        case 1 : 
          S71843=2;
          S71843=2;
          releaseCap_12.setClear();//sysj\controller.sysj line: 169, column: 2
          untwistGripper_12.setClear();//sysj\controller.sysj line: 169, column: 2
          raiseGripper_12.setClear();//sysj\controller.sysj line: 169, column: 2
          unclampBottle_12.setClear();//sysj\controller.sysj line: 169, column: 2
          S63539=0;
          S63523=0;
          if(!capperReq_in.isPartnerPresent() || capperReq_in.isPartnerPreempted()){//sysj\controller.sysj line: 172, column: 3
            capperReq_in.setACK(false);//sysj\controller.sysj line: 172, column: 3
            S63523=1;
            active[12]=1;
            ends[12]=1;
            break RUN;
          }
          else {
            S63518=0;
            if(!capperReq_in.isREQ()){//sysj\controller.sysj line: 172, column: 3
              capperReq_in.setACK(true);//sysj\controller.sysj line: 172, column: 3
              S63518=1;
              if(capperReq_in.isREQ()){//sysj\controller.sysj line: 172, column: 3
                capperReq_in.setACK(false);//sysj\controller.sysj line: 172, column: 3
                ends[12]=2;
                ;//sysj\controller.sysj line: 172, column: 3
                request_thread_12 = (boolean)(capperReq_in.getVal() == null ? false : ((Boolean)capperReq_in.getVal()).booleanValue());//sysj\controller.sysj line: 173, column: 3
                S63539=1;
                if(request_thread_12){//sysj\controller.sysj line: 175, column: 3
                  System.out.println("CapperController: Received request");//sysj\controller.sysj line: 176, column: 4
                  S63586=0;
                  if(!bottleAtPos4.getprestatus()){//sysj\controller.sysj line: 178, column: 13
                    S63546=0;
                    if(!capperStatus_o.isPartnerPresent() || capperStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 179, column: 5
                      capperStatus_o.setREQ(false);//sysj\controller.sysj line: 179, column: 5
                      S63546=1;
                      active[12]=1;
                      ends[12]=1;
                      break RUN;
                    }
                    else {
                      S63541=0;
                      if(capperStatus_o.isACK()){//sysj\controller.sysj line: 179, column: 5
                        capperStatus_o.setVal("idle");//sysj\controller.sysj line: 179, column: 5
                        S63541=1;
                        if(!capperStatus_o.isACK()){//sysj\controller.sysj line: 179, column: 5
                          capperStatus_o.setREQ(false);//sysj\controller.sysj line: 179, column: 5
                          ends[12]=2;
                          ;//sysj\controller.sysj line: 179, column: 5
                          S63586=1;
                          if(bottleAtPos4.getprestatus()){//sysj\controller.sysj line: 182, column: 12
                            System.out.println("CapperController: Capper doing work...");//sysj\controller.sysj line: 183, column: 5
                            S63669=0;
                            thread77910(tdone,ends);
                            thread77911(tdone,ends);
                            thread77912(tdone,ends);
                            thread77916(tdone,ends);
                            int biggest77917 = 0;
                            if(ends[13]>=biggest77917){
                              biggest77917=ends[13];
                            }
                            if(ends[14]>=biggest77917){
                              biggest77917=ends[14];
                            }
                            if(ends[15]>=biggest77917){
                              biggest77917=ends[15];
                            }
                            if(ends[18]>=biggest77917){
                              biggest77917=ends[18];
                            }
                            if(biggest77917 == 1){
                              active[12]=1;
                              ends[12]=1;
                              break RUN;
                            }
                          }
                          else {
                            S63539=2;
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
                    S63586=1;
                    if(bottleAtPos4.getprestatus()){//sysj\controller.sysj line: 182, column: 12
                      System.out.println("CapperController: Capper doing work...");//sysj\controller.sysj line: 183, column: 5
                      S63669=0;
                      thread77918(tdone,ends);
                      thread77919(tdone,ends);
                      thread77920(tdone,ends);
                      thread77924(tdone,ends);
                      int biggest77925 = 0;
                      if(ends[13]>=biggest77925){
                        biggest77925=ends[13];
                      }
                      if(ends[14]>=biggest77925){
                        biggest77925=ends[14];
                      }
                      if(ends[15]>=biggest77925){
                        biggest77925=ends[15];
                      }
                      if(ends[18]>=biggest77925){
                        biggest77925=ends[18];
                      }
                      if(biggest77925 == 1){
                        active[12]=1;
                        ends[12]=1;
                        break RUN;
                      }
                    }
                    else {
                      S63539=2;
                      active[12]=1;
                      ends[12]=1;
                      break RUN;
                    }
                  }
                }
                else {
                  S63539=2;
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
          releaseCap_12.setClear();//sysj\controller.sysj line: 169, column: 2
          untwistGripper_12.setClear();//sysj\controller.sysj line: 169, column: 2
          raiseGripper_12.setClear();//sysj\controller.sysj line: 169, column: 2
          unclampBottle_12.setClear();//sysj\controller.sysj line: 169, column: 2
          switch(S63539){
            case 0 : 
              switch(S63523){
                case 0 : 
                  if(!capperReq_in.isPartnerPresent() || capperReq_in.isPartnerPreempted()){//sysj\controller.sysj line: 172, column: 3
                    capperReq_in.setACK(false);//sysj\controller.sysj line: 172, column: 3
                    S63523=1;
                    active[12]=1;
                    ends[12]=1;
                    break RUN;
                  }
                  else {
                    switch(S63518){
                      case 0 : 
                        if(!capperReq_in.isREQ()){//sysj\controller.sysj line: 172, column: 3
                          capperReq_in.setACK(true);//sysj\controller.sysj line: 172, column: 3
                          S63518=1;
                          if(capperReq_in.isREQ()){//sysj\controller.sysj line: 172, column: 3
                            capperReq_in.setACK(false);//sysj\controller.sysj line: 172, column: 3
                            ends[12]=2;
                            ;//sysj\controller.sysj line: 172, column: 3
                            request_thread_12 = (boolean)(capperReq_in.getVal() == null ? false : ((Boolean)capperReq_in.getVal()).booleanValue());//sysj\controller.sysj line: 173, column: 3
                            S63539=1;
                            if(request_thread_12){//sysj\controller.sysj line: 175, column: 3
                              System.out.println("CapperController: Received request");//sysj\controller.sysj line: 176, column: 4
                              S63586=0;
                              if(!bottleAtPos4.getprestatus()){//sysj\controller.sysj line: 178, column: 13
                                S63546=0;
                                if(!capperStatus_o.isPartnerPresent() || capperStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 179, column: 5
                                  capperStatus_o.setREQ(false);//sysj\controller.sysj line: 179, column: 5
                                  S63546=1;
                                  active[12]=1;
                                  ends[12]=1;
                                  break RUN;
                                }
                                else {
                                  S63541=0;
                                  if(capperStatus_o.isACK()){//sysj\controller.sysj line: 179, column: 5
                                    capperStatus_o.setVal("idle");//sysj\controller.sysj line: 179, column: 5
                                    S63541=1;
                                    if(!capperStatus_o.isACK()){//sysj\controller.sysj line: 179, column: 5
                                      capperStatus_o.setREQ(false);//sysj\controller.sysj line: 179, column: 5
                                      ends[12]=2;
                                      ;//sysj\controller.sysj line: 179, column: 5
                                      S63586=1;
                                      if(bottleAtPos4.getprestatus()){//sysj\controller.sysj line: 182, column: 12
                                        System.out.println("CapperController: Capper doing work...");//sysj\controller.sysj line: 183, column: 5
                                        S63669=0;
                                        thread77926(tdone,ends);
                                        thread77927(tdone,ends);
                                        thread77928(tdone,ends);
                                        thread77932(tdone,ends);
                                        int biggest77933 = 0;
                                        if(ends[13]>=biggest77933){
                                          biggest77933=ends[13];
                                        }
                                        if(ends[14]>=biggest77933){
                                          biggest77933=ends[14];
                                        }
                                        if(ends[15]>=biggest77933){
                                          biggest77933=ends[15];
                                        }
                                        if(ends[18]>=biggest77933){
                                          biggest77933=ends[18];
                                        }
                                        if(biggest77933 == 1){
                                          active[12]=1;
                                          ends[12]=1;
                                          break RUN;
                                        }
                                      }
                                      else {
                                        S63539=2;
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
                                S63586=1;
                                if(bottleAtPos4.getprestatus()){//sysj\controller.sysj line: 182, column: 12
                                  System.out.println("CapperController: Capper doing work...");//sysj\controller.sysj line: 183, column: 5
                                  S63669=0;
                                  thread77934(tdone,ends);
                                  thread77935(tdone,ends);
                                  thread77936(tdone,ends);
                                  thread77940(tdone,ends);
                                  int biggest77941 = 0;
                                  if(ends[13]>=biggest77941){
                                    biggest77941=ends[13];
                                  }
                                  if(ends[14]>=biggest77941){
                                    biggest77941=ends[14];
                                  }
                                  if(ends[15]>=biggest77941){
                                    biggest77941=ends[15];
                                  }
                                  if(ends[18]>=biggest77941){
                                    biggest77941=ends[18];
                                  }
                                  if(biggest77941 == 1){
                                    active[12]=1;
                                    ends[12]=1;
                                    break RUN;
                                  }
                                }
                                else {
                                  S63539=2;
                                  active[12]=1;
                                  ends[12]=1;
                                  break RUN;
                                }
                              }
                            }
                            else {
                              S63539=2;
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
                        if(capperReq_in.isREQ()){//sysj\controller.sysj line: 172, column: 3
                          capperReq_in.setACK(false);//sysj\controller.sysj line: 172, column: 3
                          ends[12]=2;
                          ;//sysj\controller.sysj line: 172, column: 3
                          request_thread_12 = (boolean)(capperReq_in.getVal() == null ? false : ((Boolean)capperReq_in.getVal()).booleanValue());//sysj\controller.sysj line: 173, column: 3
                          S63539=1;
                          if(request_thread_12){//sysj\controller.sysj line: 175, column: 3
                            System.out.println("CapperController: Received request");//sysj\controller.sysj line: 176, column: 4
                            S63586=0;
                            if(!bottleAtPos4.getprestatus()){//sysj\controller.sysj line: 178, column: 13
                              S63546=0;
                              if(!capperStatus_o.isPartnerPresent() || capperStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 179, column: 5
                                capperStatus_o.setREQ(false);//sysj\controller.sysj line: 179, column: 5
                                S63546=1;
                                active[12]=1;
                                ends[12]=1;
                                break RUN;
                              }
                              else {
                                S63541=0;
                                if(capperStatus_o.isACK()){//sysj\controller.sysj line: 179, column: 5
                                  capperStatus_o.setVal("idle");//sysj\controller.sysj line: 179, column: 5
                                  S63541=1;
                                  if(!capperStatus_o.isACK()){//sysj\controller.sysj line: 179, column: 5
                                    capperStatus_o.setREQ(false);//sysj\controller.sysj line: 179, column: 5
                                    ends[12]=2;
                                    ;//sysj\controller.sysj line: 179, column: 5
                                    S63586=1;
                                    if(bottleAtPos4.getprestatus()){//sysj\controller.sysj line: 182, column: 12
                                      System.out.println("CapperController: Capper doing work...");//sysj\controller.sysj line: 183, column: 5
                                      S63669=0;
                                      thread77942(tdone,ends);
                                      thread77943(tdone,ends);
                                      thread77944(tdone,ends);
                                      thread77948(tdone,ends);
                                      int biggest77949 = 0;
                                      if(ends[13]>=biggest77949){
                                        biggest77949=ends[13];
                                      }
                                      if(ends[14]>=biggest77949){
                                        biggest77949=ends[14];
                                      }
                                      if(ends[15]>=biggest77949){
                                        biggest77949=ends[15];
                                      }
                                      if(ends[18]>=biggest77949){
                                        biggest77949=ends[18];
                                      }
                                      if(biggest77949 == 1){
                                        active[12]=1;
                                        ends[12]=1;
                                        break RUN;
                                      }
                                    }
                                    else {
                                      S63539=2;
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
                              S63586=1;
                              if(bottleAtPos4.getprestatus()){//sysj\controller.sysj line: 182, column: 12
                                System.out.println("CapperController: Capper doing work...");//sysj\controller.sysj line: 183, column: 5
                                S63669=0;
                                thread77950(tdone,ends);
                                thread77951(tdone,ends);
                                thread77952(tdone,ends);
                                thread77956(tdone,ends);
                                int biggest77957 = 0;
                                if(ends[13]>=biggest77957){
                                  biggest77957=ends[13];
                                }
                                if(ends[14]>=biggest77957){
                                  biggest77957=ends[14];
                                }
                                if(ends[15]>=biggest77957){
                                  biggest77957=ends[15];
                                }
                                if(ends[18]>=biggest77957){
                                  biggest77957=ends[18];
                                }
                                if(biggest77957 == 1){
                                  active[12]=1;
                                  ends[12]=1;
                                  break RUN;
                                }
                              }
                              else {
                                S63539=2;
                                active[12]=1;
                                ends[12]=1;
                                break RUN;
                              }
                            }
                          }
                          else {
                            S63539=2;
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
                  S63523=1;
                  S63523=0;
                  if(!capperReq_in.isPartnerPresent() || capperReq_in.isPartnerPreempted()){//sysj\controller.sysj line: 172, column: 3
                    capperReq_in.setACK(false);//sysj\controller.sysj line: 172, column: 3
                    S63523=1;
                    active[12]=1;
                    ends[12]=1;
                    break RUN;
                  }
                  else {
                    S63518=0;
                    if(!capperReq_in.isREQ()){//sysj\controller.sysj line: 172, column: 3
                      capperReq_in.setACK(true);//sysj\controller.sysj line: 172, column: 3
                      S63518=1;
                      if(capperReq_in.isREQ()){//sysj\controller.sysj line: 172, column: 3
                        capperReq_in.setACK(false);//sysj\controller.sysj line: 172, column: 3
                        ends[12]=2;
                        ;//sysj\controller.sysj line: 172, column: 3
                        request_thread_12 = (boolean)(capperReq_in.getVal() == null ? false : ((Boolean)capperReq_in.getVal()).booleanValue());//sysj\controller.sysj line: 173, column: 3
                        S63539=1;
                        if(request_thread_12){//sysj\controller.sysj line: 175, column: 3
                          System.out.println("CapperController: Received request");//sysj\controller.sysj line: 176, column: 4
                          S63586=0;
                          if(!bottleAtPos4.getprestatus()){//sysj\controller.sysj line: 178, column: 13
                            S63546=0;
                            if(!capperStatus_o.isPartnerPresent() || capperStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 179, column: 5
                              capperStatus_o.setREQ(false);//sysj\controller.sysj line: 179, column: 5
                              S63546=1;
                              active[12]=1;
                              ends[12]=1;
                              break RUN;
                            }
                            else {
                              S63541=0;
                              if(capperStatus_o.isACK()){//sysj\controller.sysj line: 179, column: 5
                                capperStatus_o.setVal("idle");//sysj\controller.sysj line: 179, column: 5
                                S63541=1;
                                if(!capperStatus_o.isACK()){//sysj\controller.sysj line: 179, column: 5
                                  capperStatus_o.setREQ(false);//sysj\controller.sysj line: 179, column: 5
                                  ends[12]=2;
                                  ;//sysj\controller.sysj line: 179, column: 5
                                  S63586=1;
                                  if(bottleAtPos4.getprestatus()){//sysj\controller.sysj line: 182, column: 12
                                    System.out.println("CapperController: Capper doing work...");//sysj\controller.sysj line: 183, column: 5
                                    S63669=0;
                                    thread77958(tdone,ends);
                                    thread77959(tdone,ends);
                                    thread77960(tdone,ends);
                                    thread77964(tdone,ends);
                                    int biggest77965 = 0;
                                    if(ends[13]>=biggest77965){
                                      biggest77965=ends[13];
                                    }
                                    if(ends[14]>=biggest77965){
                                      biggest77965=ends[14];
                                    }
                                    if(ends[15]>=biggest77965){
                                      biggest77965=ends[15];
                                    }
                                    if(ends[18]>=biggest77965){
                                      biggest77965=ends[18];
                                    }
                                    if(biggest77965 == 1){
                                      active[12]=1;
                                      ends[12]=1;
                                      break RUN;
                                    }
                                  }
                                  else {
                                    S63539=2;
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
                            S63586=1;
                            if(bottleAtPos4.getprestatus()){//sysj\controller.sysj line: 182, column: 12
                              System.out.println("CapperController: Capper doing work...");//sysj\controller.sysj line: 183, column: 5
                              S63669=0;
                              thread77966(tdone,ends);
                              thread77967(tdone,ends);
                              thread77968(tdone,ends);
                              thread77972(tdone,ends);
                              int biggest77973 = 0;
                              if(ends[13]>=biggest77973){
                                biggest77973=ends[13];
                              }
                              if(ends[14]>=biggest77973){
                                biggest77973=ends[14];
                              }
                              if(ends[15]>=biggest77973){
                                biggest77973=ends[15];
                              }
                              if(ends[18]>=biggest77973){
                                biggest77973=ends[18];
                              }
                              if(biggest77973 == 1){
                                active[12]=1;
                                ends[12]=1;
                                break RUN;
                              }
                            }
                            else {
                              S63539=2;
                              active[12]=1;
                              ends[12]=1;
                              break RUN;
                            }
                          }
                        }
                        else {
                          S63539=2;
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
              switch(S63586){
                case 0 : 
                  switch(S63546){
                    case 0 : 
                      if(!capperStatus_o.isPartnerPresent() || capperStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 179, column: 5
                        capperStatus_o.setREQ(false);//sysj\controller.sysj line: 179, column: 5
                        S63546=1;
                        active[12]=1;
                        ends[12]=1;
                        break RUN;
                      }
                      else {
                        switch(S63541){
                          case 0 : 
                            if(capperStatus_o.isACK()){//sysj\controller.sysj line: 179, column: 5
                              capperStatus_o.setVal("idle");//sysj\controller.sysj line: 179, column: 5
                              S63541=1;
                              if(!capperStatus_o.isACK()){//sysj\controller.sysj line: 179, column: 5
                                capperStatus_o.setREQ(false);//sysj\controller.sysj line: 179, column: 5
                                ends[12]=2;
                                ;//sysj\controller.sysj line: 179, column: 5
                                S63586=1;
                                if(bottleAtPos4.getprestatus()){//sysj\controller.sysj line: 182, column: 12
                                  System.out.println("CapperController: Capper doing work...");//sysj\controller.sysj line: 183, column: 5
                                  S63669=0;
                                  thread77974(tdone,ends);
                                  thread77975(tdone,ends);
                                  thread77976(tdone,ends);
                                  thread77980(tdone,ends);
                                  int biggest77981 = 0;
                                  if(ends[13]>=biggest77981){
                                    biggest77981=ends[13];
                                  }
                                  if(ends[14]>=biggest77981){
                                    biggest77981=ends[14];
                                  }
                                  if(ends[15]>=biggest77981){
                                    biggest77981=ends[15];
                                  }
                                  if(ends[18]>=biggest77981){
                                    biggest77981=ends[18];
                                  }
                                  if(biggest77981 == 1){
                                    active[12]=1;
                                    ends[12]=1;
                                    break RUN;
                                  }
                                }
                                else {
                                  S63539=2;
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
                            if(!capperStatus_o.isACK()){//sysj\controller.sysj line: 179, column: 5
                              capperStatus_o.setREQ(false);//sysj\controller.sysj line: 179, column: 5
                              ends[12]=2;
                              ;//sysj\controller.sysj line: 179, column: 5
                              S63586=1;
                              if(bottleAtPos4.getprestatus()){//sysj\controller.sysj line: 182, column: 12
                                System.out.println("CapperController: Capper doing work...");//sysj\controller.sysj line: 183, column: 5
                                S63669=0;
                                thread77982(tdone,ends);
                                thread77983(tdone,ends);
                                thread77984(tdone,ends);
                                thread77988(tdone,ends);
                                int biggest77989 = 0;
                                if(ends[13]>=biggest77989){
                                  biggest77989=ends[13];
                                }
                                if(ends[14]>=biggest77989){
                                  biggest77989=ends[14];
                                }
                                if(ends[15]>=biggest77989){
                                  biggest77989=ends[15];
                                }
                                if(ends[18]>=biggest77989){
                                  biggest77989=ends[18];
                                }
                                if(biggest77989 == 1){
                                  active[12]=1;
                                  ends[12]=1;
                                  break RUN;
                                }
                              }
                              else {
                                S63539=2;
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
                      S63546=1;
                      S63546=0;
                      if(!capperStatus_o.isPartnerPresent() || capperStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 179, column: 5
                        capperStatus_o.setREQ(false);//sysj\controller.sysj line: 179, column: 5
                        S63546=1;
                        active[12]=1;
                        ends[12]=1;
                        break RUN;
                      }
                      else {
                        S63541=0;
                        if(capperStatus_o.isACK()){//sysj\controller.sysj line: 179, column: 5
                          capperStatus_o.setVal("idle");//sysj\controller.sysj line: 179, column: 5
                          S63541=1;
                          if(!capperStatus_o.isACK()){//sysj\controller.sysj line: 179, column: 5
                            capperStatus_o.setREQ(false);//sysj\controller.sysj line: 179, column: 5
                            ends[12]=2;
                            ;//sysj\controller.sysj line: 179, column: 5
                            S63586=1;
                            if(bottleAtPos4.getprestatus()){//sysj\controller.sysj line: 182, column: 12
                              System.out.println("CapperController: Capper doing work...");//sysj\controller.sysj line: 183, column: 5
                              S63669=0;
                              thread77990(tdone,ends);
                              thread77991(tdone,ends);
                              thread77992(tdone,ends);
                              thread77996(tdone,ends);
                              int biggest77997 = 0;
                              if(ends[13]>=biggest77997){
                                biggest77997=ends[13];
                              }
                              if(ends[14]>=biggest77997){
                                biggest77997=ends[14];
                              }
                              if(ends[15]>=biggest77997){
                                biggest77997=ends[15];
                              }
                              if(ends[18]>=biggest77997){
                                biggest77997=ends[18];
                              }
                              if(biggest77997 == 1){
                                active[12]=1;
                                ends[12]=1;
                                break RUN;
                              }
                            }
                            else {
                              S63539=2;
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
                  switch(S63669){
                    case 0 : 
                      thread77998(tdone,ends);
                      thread77999(tdone,ends);
                      thread78000(tdone,ends);
                      thread78004(tdone,ends);
                      int biggest78005 = 0;
                      if(ends[13]>=biggest78005){
                        biggest78005=ends[13];
                      }
                      if(ends[14]>=biggest78005){
                        biggest78005=ends[14];
                      }
                      if(ends[15]>=biggest78005){
                        biggest78005=ends[15];
                      }
                      if(ends[18]>=biggest78005){
                        biggest78005=ends[18];
                      }
                      if(biggest78005 == 1){
                        active[12]=1;
                        ends[12]=1;
                        break RUN;
                      }
                      //FINXME code
                      if(biggest78005 == 0){
                        S63669=1;
                        S63676=0;
                        if(!capperStatus_o.isPartnerPresent() || capperStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 219, column: 5
                          capperStatus_o.setREQ(false);//sysj\controller.sysj line: 219, column: 5
                          S63676=1;
                          active[12]=1;
                          ends[12]=1;
                          break RUN;
                        }
                        else {
                          S63671=0;
                          if(capperStatus_o.isACK()){//sysj\controller.sysj line: 219, column: 5
                            capperStatus_o.setVal("done");//sysj\controller.sysj line: 219, column: 5
                            S63671=1;
                            if(!capperStatus_o.isACK()){//sysj\controller.sysj line: 219, column: 5
                              capperStatus_o.setREQ(false);//sysj\controller.sysj line: 219, column: 5
                              ends[12]=2;
                              ;//sysj\controller.sysj line: 219, column: 5
                              S63539=2;
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
                      switch(S63676){
                        case 0 : 
                          if(!capperStatus_o.isPartnerPresent() || capperStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 219, column: 5
                            capperStatus_o.setREQ(false);//sysj\controller.sysj line: 219, column: 5
                            S63676=1;
                            active[12]=1;
                            ends[12]=1;
                            break RUN;
                          }
                          else {
                            switch(S63671){
                              case 0 : 
                                if(capperStatus_o.isACK()){//sysj\controller.sysj line: 219, column: 5
                                  capperStatus_o.setVal("done");//sysj\controller.sysj line: 219, column: 5
                                  S63671=1;
                                  if(!capperStatus_o.isACK()){//sysj\controller.sysj line: 219, column: 5
                                    capperStatus_o.setREQ(false);//sysj\controller.sysj line: 219, column: 5
                                    ends[12]=2;
                                    ;//sysj\controller.sysj line: 219, column: 5
                                    S63539=2;
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
                                if(!capperStatus_o.isACK()){//sysj\controller.sysj line: 219, column: 5
                                  capperStatus_o.setREQ(false);//sysj\controller.sysj line: 219, column: 5
                                  ends[12]=2;
                                  ;//sysj\controller.sysj line: 219, column: 5
                                  S63539=2;
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
                          S63676=1;
                          S63676=0;
                          if(!capperStatus_o.isPartnerPresent() || capperStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 219, column: 5
                            capperStatus_o.setREQ(false);//sysj\controller.sysj line: 219, column: 5
                            S63676=1;
                            active[12]=1;
                            ends[12]=1;
                            break RUN;
                          }
                          else {
                            S63671=0;
                            if(capperStatus_o.isACK()){//sysj\controller.sysj line: 219, column: 5
                              capperStatus_o.setVal("done");//sysj\controller.sysj line: 219, column: 5
                              S63671=1;
                              if(!capperStatus_o.isACK()){//sysj\controller.sysj line: 219, column: 5
                                capperStatus_o.setREQ(false);//sysj\controller.sysj line: 219, column: 5
                                ends[12]=2;
                                ;//sysj\controller.sysj line: 219, column: 5
                                S63539=2;
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
              S63539=2;
              S63539=0;
              S63523=0;
              if(!capperReq_in.isPartnerPresent() || capperReq_in.isPartnerPreempted()){//sysj\controller.sysj line: 172, column: 3
                capperReq_in.setACK(false);//sysj\controller.sysj line: 172, column: 3
                S63523=1;
                active[12]=1;
                ends[12]=1;
                break RUN;
              }
              else {
                S63518=0;
                if(!capperReq_in.isREQ()){//sysj\controller.sysj line: 172, column: 3
                  capperReq_in.setACK(true);//sysj\controller.sysj line: 172, column: 3
                  S63518=1;
                  if(capperReq_in.isREQ()){//sysj\controller.sysj line: 172, column: 3
                    capperReq_in.setACK(false);//sysj\controller.sysj line: 172, column: 3
                    ends[12]=2;
                    ;//sysj\controller.sysj line: 172, column: 3
                    request_thread_12 = (boolean)(capperReq_in.getVal() == null ? false : ((Boolean)capperReq_in.getVal()).booleanValue());//sysj\controller.sysj line: 173, column: 3
                    S63539=1;
                    if(request_thread_12){//sysj\controller.sysj line: 175, column: 3
                      System.out.println("CapperController: Received request");//sysj\controller.sysj line: 176, column: 4
                      S63586=0;
                      if(!bottleAtPos4.getprestatus()){//sysj\controller.sysj line: 178, column: 13
                        S63546=0;
                        if(!capperStatus_o.isPartnerPresent() || capperStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 179, column: 5
                          capperStatus_o.setREQ(false);//sysj\controller.sysj line: 179, column: 5
                          S63546=1;
                          active[12]=1;
                          ends[12]=1;
                          break RUN;
                        }
                        else {
                          S63541=0;
                          if(capperStatus_o.isACK()){//sysj\controller.sysj line: 179, column: 5
                            capperStatus_o.setVal("idle");//sysj\controller.sysj line: 179, column: 5
                            S63541=1;
                            if(!capperStatus_o.isACK()){//sysj\controller.sysj line: 179, column: 5
                              capperStatus_o.setREQ(false);//sysj\controller.sysj line: 179, column: 5
                              ends[12]=2;
                              ;//sysj\controller.sysj line: 179, column: 5
                              S63586=1;
                              if(bottleAtPos4.getprestatus()){//sysj\controller.sysj line: 182, column: 12
                                System.out.println("CapperController: Capper doing work...");//sysj\controller.sysj line: 183, column: 5
                                S63669=0;
                                thread78006(tdone,ends);
                                thread78007(tdone,ends);
                                thread78008(tdone,ends);
                                thread78012(tdone,ends);
                                int biggest78013 = 0;
                                if(ends[13]>=biggest78013){
                                  biggest78013=ends[13];
                                }
                                if(ends[14]>=biggest78013){
                                  biggest78013=ends[14];
                                }
                                if(ends[15]>=biggest78013){
                                  biggest78013=ends[15];
                                }
                                if(ends[18]>=biggest78013){
                                  biggest78013=ends[18];
                                }
                                if(biggest78013 == 1){
                                  active[12]=1;
                                  ends[12]=1;
                                  break RUN;
                                }
                              }
                              else {
                                S63539=2;
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
                        S63586=1;
                        if(bottleAtPos4.getprestatus()){//sysj\controller.sysj line: 182, column: 12
                          System.out.println("CapperController: Capper doing work...");//sysj\controller.sysj line: 183, column: 5
                          S63669=0;
                          thread78014(tdone,ends);
                          thread78015(tdone,ends);
                          thread78016(tdone,ends);
                          thread78020(tdone,ends);
                          int biggest78021 = 0;
                          if(ends[13]>=biggest78021){
                            biggest78021=ends[13];
                          }
                          if(ends[14]>=biggest78021){
                            biggest78021=ends[14];
                          }
                          if(ends[15]>=biggest78021){
                            biggest78021=ends[15];
                          }
                          if(ends[18]>=biggest78021){
                            biggest78021=ends[18];
                          }
                          if(biggest78021 == 1){
                            active[12]=1;
                            ends[12]=1;
                            break RUN;
                          }
                        }
                        else {
                          S63539=2;
                          active[12]=1;
                          ends[12]=1;
                          break RUN;
                        }
                      }
                    }
                    else {
                      S63539=2;
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
