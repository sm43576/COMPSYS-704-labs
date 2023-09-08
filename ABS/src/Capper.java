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
  private boolean request_thread_12;//sysj\controller.sysj line: 168, column: 3
  private int S26729 = 1;
  private int S18425 = 1;
  private int S18409 = 1;
  private int S18404 = 1;
  private int S18472 = 1;
  private int S18432 = 1;
  private int S18427 = 1;
  private int S18555 = 1;
  private int S18478 = 1;
  private int S18484 = 1;
  private int S18500 = 1;
  private int S18499 = 1;
  private int S18487 = 1;
  private int S18490 = 1;
  private int S18513 = 1;
  private int S18510 = 1;
  private int S18562 = 1;
  private int S18557 = 1;
  
  private int[] ends = new int[22];
  private int[] tdone = new int[22];
  
  public void thread32906(int [] tdone, int [] ends){
        S18513=1;
    S18510=0;
    active[18]=1;
    ends[18]=1;
    tdone[18]=1;
  }

  public void thread32904(int [] tdone, int [] ends){
        S18490=1;
    active[17]=1;
    ends[17]=1;
    tdone[17]=1;
  }

  public void thread32903(int [] tdone, int [] ends){
        S18487=1;
    active[16]=1;
    ends[16]=1;
    tdone[16]=1;
  }

  public void thread32902(int [] tdone, int [] ends){
        S18500=1;
    S18499=0;
    thread32903(tdone,ends);
    thread32904(tdone,ends);
    int biggest32905 = 0;
    if(ends[16]>=biggest32905){
      biggest32905=ends[16];
    }
    if(ends[17]>=biggest32905){
      biggest32905=ends[17];
    }
    if(biggest32905 == 1){
      active[15]=1;
      ends[15]=1;
      tdone[15]=1;
    }
  }

  public void thread32901(int [] tdone, int [] ends){
        S18484=1;
    cylPos5ZAxisExtend.setPresent();//sysj\controller.sysj line: 187, column: 7
    currsigs.addElement(cylPos5ZAxisExtend);
    active[14]=1;
    ends[14]=1;
    tdone[14]=1;
  }

  public void thread32900(int [] tdone, int [] ends){
        S18478=1;
    cylClampBottleExtend.setPresent();//sysj\controller.sysj line: 181, column: 7
    currsigs.addElement(cylClampBottleExtend);
    active[13]=1;
    ends[13]=1;
    tdone[13]=1;
  }

  public void thread32898(int [] tdone, int [] ends){
        S18513=1;
    S18510=0;
    active[18]=1;
    ends[18]=1;
    tdone[18]=1;
  }

  public void thread32896(int [] tdone, int [] ends){
        S18490=1;
    active[17]=1;
    ends[17]=1;
    tdone[17]=1;
  }

  public void thread32895(int [] tdone, int [] ends){
        S18487=1;
    active[16]=1;
    ends[16]=1;
    tdone[16]=1;
  }

  public void thread32894(int [] tdone, int [] ends){
        S18500=1;
    S18499=0;
    thread32895(tdone,ends);
    thread32896(tdone,ends);
    int biggest32897 = 0;
    if(ends[16]>=biggest32897){
      biggest32897=ends[16];
    }
    if(ends[17]>=biggest32897){
      biggest32897=ends[17];
    }
    if(biggest32897 == 1){
      active[15]=1;
      ends[15]=1;
      tdone[15]=1;
    }
  }

  public void thread32893(int [] tdone, int [] ends){
        S18484=1;
    cylPos5ZAxisExtend.setPresent();//sysj\controller.sysj line: 187, column: 7
    currsigs.addElement(cylPos5ZAxisExtend);
    active[14]=1;
    ends[14]=1;
    tdone[14]=1;
  }

  public void thread32892(int [] tdone, int [] ends){
        S18478=1;
    cylClampBottleExtend.setPresent();//sysj\controller.sysj line: 181, column: 7
    currsigs.addElement(cylClampBottleExtend);
    active[13]=1;
    ends[13]=1;
    tdone[13]=1;
  }

  public void thread32890(int [] tdone, int [] ends){
        switch(S18513){
      case 0 : 
        active[18]=0;
        ends[18]=0;
        tdone[18]=1;
        break;
      
      case 1 : 
        switch(S18510){
          case 0 : 
            if(gripperGrippedCap.getprestatus()){//sysj\controller.sysj line: 200, column: 12
              S18510=1;
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
              untwistGripper_12.setPresent();//sysj\controller.sysj line: 208, column: 7
              currsigs.addElement(untwistGripper_12);
              raiseGripper_12.setPresent();//sysj\controller.sysj line: 211, column: 6
              currsigs.addElement(raiseGripper_12);
              unclampBottle_12.setPresent();//sysj\controller.sysj line: 212, column: 6
              currsigs.addElement(unclampBottle_12);
              S18513=0;
              active[18]=0;
              ends[18]=0;
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
          
        }
        break;
      
    }
  }

  public void thread32888(int [] tdone, int [] ends){
        switch(S18490){
      case 0 : 
        active[17]=0;
        ends[17]=0;
        tdone[17]=1;
        break;
      
      case 1 : 
        if(cylClampedBottle.getprestatus()){//sysj\controller.sysj line: 193, column: 46
          S18490=0;
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

  public void thread32887(int [] tdone, int [] ends){
        switch(S18487){
      case 0 : 
        active[16]=0;
        ends[16]=0;
        tdone[16]=1;
        break;
      
      case 1 : 
        if(gripperZAxisLowered.getprestatus()){//sysj\controller.sysj line: 193, column: 13
          S18487=0;
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

  public void thread32886(int [] tdone, int [] ends){
        switch(S18500){
      case 0 : 
        active[15]=0;
        ends[15]=0;
        tdone[15]=1;
        break;
      
      case 1 : 
        switch(S18499){
          case 0 : 
            thread32887(tdone,ends);
            thread32888(tdone,ends);
            int biggest32889 = 0;
            if(ends[16]>=biggest32889){
              biggest32889=ends[16];
            }
            if(ends[17]>=biggest32889){
              biggest32889=ends[17];
            }
            if(biggest32889 == 1){
              active[15]=1;
              ends[15]=1;
              tdone[15]=1;
            }
            //FINXME code
            if(biggest32889 == 0){
              S18499=1;
              capGripperPos5Extend.setPresent();//sysj\controller.sysj line: 195, column: 7
              currsigs.addElement(capGripperPos5Extend);
              active[15]=1;
              ends[15]=1;
              tdone[15]=1;
            }
            break;
          
          case 1 : 
            if(releaseCap_12.getprestatus()){//sysj\controller.sysj line: 194, column: 12
              S18500=0;
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

  public void thread32885(int [] tdone, int [] ends){
        switch(S18484){
      case 0 : 
        active[14]=0;
        ends[14]=0;
        tdone[14]=1;
        break;
      
      case 1 : 
        if(raiseGripper_12.getprestatus()){//sysj\controller.sysj line: 186, column: 12
          S18484=0;
          active[14]=0;
          ends[14]=0;
          tdone[14]=1;
        }
        else {
          cylPos5ZAxisExtend.setPresent();//sysj\controller.sysj line: 187, column: 7
          currsigs.addElement(cylPos5ZAxisExtend);
          active[14]=1;
          ends[14]=1;
          tdone[14]=1;
        }
        break;
      
    }
  }

  public void thread32884(int [] tdone, int [] ends){
        switch(S18478){
      case 0 : 
        active[13]=0;
        ends[13]=0;
        tdone[13]=1;
        break;
      
      case 1 : 
        if(unclampBottle_12.getprestatus()){//sysj\controller.sysj line: 180, column: 13
          S18478=0;
          active[13]=0;
          ends[13]=0;
          tdone[13]=1;
        }
        else {
          cylClampBottleExtend.setPresent();//sysj\controller.sysj line: 181, column: 7
          currsigs.addElement(cylClampBottleExtend);
          active[13]=1;
          ends[13]=1;
          tdone[13]=1;
        }
        break;
      
    }
  }

  public void thread32882(int [] tdone, int [] ends){
        S18513=1;
    S18510=0;
    active[18]=1;
    ends[18]=1;
    tdone[18]=1;
  }

  public void thread32880(int [] tdone, int [] ends){
        S18490=1;
    active[17]=1;
    ends[17]=1;
    tdone[17]=1;
  }

  public void thread32879(int [] tdone, int [] ends){
        S18487=1;
    active[16]=1;
    ends[16]=1;
    tdone[16]=1;
  }

  public void thread32878(int [] tdone, int [] ends){
        S18500=1;
    S18499=0;
    thread32879(tdone,ends);
    thread32880(tdone,ends);
    int biggest32881 = 0;
    if(ends[16]>=biggest32881){
      biggest32881=ends[16];
    }
    if(ends[17]>=biggest32881){
      biggest32881=ends[17];
    }
    if(biggest32881 == 1){
      active[15]=1;
      ends[15]=1;
      tdone[15]=1;
    }
  }

  public void thread32877(int [] tdone, int [] ends){
        S18484=1;
    cylPos5ZAxisExtend.setPresent();//sysj\controller.sysj line: 187, column: 7
    currsigs.addElement(cylPos5ZAxisExtend);
    active[14]=1;
    ends[14]=1;
    tdone[14]=1;
  }

  public void thread32876(int [] tdone, int [] ends){
        S18478=1;
    cylClampBottleExtend.setPresent();//sysj\controller.sysj line: 181, column: 7
    currsigs.addElement(cylClampBottleExtend);
    active[13]=1;
    ends[13]=1;
    tdone[13]=1;
  }

  public void thread32874(int [] tdone, int [] ends){
        S18513=1;
    S18510=0;
    active[18]=1;
    ends[18]=1;
    tdone[18]=1;
  }

  public void thread32872(int [] tdone, int [] ends){
        S18490=1;
    active[17]=1;
    ends[17]=1;
    tdone[17]=1;
  }

  public void thread32871(int [] tdone, int [] ends){
        S18487=1;
    active[16]=1;
    ends[16]=1;
    tdone[16]=1;
  }

  public void thread32870(int [] tdone, int [] ends){
        S18500=1;
    S18499=0;
    thread32871(tdone,ends);
    thread32872(tdone,ends);
    int biggest32873 = 0;
    if(ends[16]>=biggest32873){
      biggest32873=ends[16];
    }
    if(ends[17]>=biggest32873){
      biggest32873=ends[17];
    }
    if(biggest32873 == 1){
      active[15]=1;
      ends[15]=1;
      tdone[15]=1;
    }
  }

  public void thread32869(int [] tdone, int [] ends){
        S18484=1;
    cylPos5ZAxisExtend.setPresent();//sysj\controller.sysj line: 187, column: 7
    currsigs.addElement(cylPos5ZAxisExtend);
    active[14]=1;
    ends[14]=1;
    tdone[14]=1;
  }

  public void thread32868(int [] tdone, int [] ends){
        S18478=1;
    cylClampBottleExtend.setPresent();//sysj\controller.sysj line: 181, column: 7
    currsigs.addElement(cylClampBottleExtend);
    active[13]=1;
    ends[13]=1;
    tdone[13]=1;
  }

  public void thread32866(int [] tdone, int [] ends){
        S18513=1;
    S18510=0;
    active[18]=1;
    ends[18]=1;
    tdone[18]=1;
  }

  public void thread32864(int [] tdone, int [] ends){
        S18490=1;
    active[17]=1;
    ends[17]=1;
    tdone[17]=1;
  }

  public void thread32863(int [] tdone, int [] ends){
        S18487=1;
    active[16]=1;
    ends[16]=1;
    tdone[16]=1;
  }

  public void thread32862(int [] tdone, int [] ends){
        S18500=1;
    S18499=0;
    thread32863(tdone,ends);
    thread32864(tdone,ends);
    int biggest32865 = 0;
    if(ends[16]>=biggest32865){
      biggest32865=ends[16];
    }
    if(ends[17]>=biggest32865){
      biggest32865=ends[17];
    }
    if(biggest32865 == 1){
      active[15]=1;
      ends[15]=1;
      tdone[15]=1;
    }
  }

  public void thread32861(int [] tdone, int [] ends){
        S18484=1;
    cylPos5ZAxisExtend.setPresent();//sysj\controller.sysj line: 187, column: 7
    currsigs.addElement(cylPos5ZAxisExtend);
    active[14]=1;
    ends[14]=1;
    tdone[14]=1;
  }

  public void thread32860(int [] tdone, int [] ends){
        S18478=1;
    cylClampBottleExtend.setPresent();//sysj\controller.sysj line: 181, column: 7
    currsigs.addElement(cylClampBottleExtend);
    active[13]=1;
    ends[13]=1;
    tdone[13]=1;
  }

  public void thread32858(int [] tdone, int [] ends){
        S18513=1;
    S18510=0;
    active[18]=1;
    ends[18]=1;
    tdone[18]=1;
  }

  public void thread32856(int [] tdone, int [] ends){
        S18490=1;
    active[17]=1;
    ends[17]=1;
    tdone[17]=1;
  }

  public void thread32855(int [] tdone, int [] ends){
        S18487=1;
    active[16]=1;
    ends[16]=1;
    tdone[16]=1;
  }

  public void thread32854(int [] tdone, int [] ends){
        S18500=1;
    S18499=0;
    thread32855(tdone,ends);
    thread32856(tdone,ends);
    int biggest32857 = 0;
    if(ends[16]>=biggest32857){
      biggest32857=ends[16];
    }
    if(ends[17]>=biggest32857){
      biggest32857=ends[17];
    }
    if(biggest32857 == 1){
      active[15]=1;
      ends[15]=1;
      tdone[15]=1;
    }
  }

  public void thread32853(int [] tdone, int [] ends){
        S18484=1;
    cylPos5ZAxisExtend.setPresent();//sysj\controller.sysj line: 187, column: 7
    currsigs.addElement(cylPos5ZAxisExtend);
    active[14]=1;
    ends[14]=1;
    tdone[14]=1;
  }

  public void thread32852(int [] tdone, int [] ends){
        S18478=1;
    cylClampBottleExtend.setPresent();//sysj\controller.sysj line: 181, column: 7
    currsigs.addElement(cylClampBottleExtend);
    active[13]=1;
    ends[13]=1;
    tdone[13]=1;
  }

  public void thread32850(int [] tdone, int [] ends){
        S18513=1;
    S18510=0;
    active[18]=1;
    ends[18]=1;
    tdone[18]=1;
  }

  public void thread32848(int [] tdone, int [] ends){
        S18490=1;
    active[17]=1;
    ends[17]=1;
    tdone[17]=1;
  }

  public void thread32847(int [] tdone, int [] ends){
        S18487=1;
    active[16]=1;
    ends[16]=1;
    tdone[16]=1;
  }

  public void thread32846(int [] tdone, int [] ends){
        S18500=1;
    S18499=0;
    thread32847(tdone,ends);
    thread32848(tdone,ends);
    int biggest32849 = 0;
    if(ends[16]>=biggest32849){
      biggest32849=ends[16];
    }
    if(ends[17]>=biggest32849){
      biggest32849=ends[17];
    }
    if(biggest32849 == 1){
      active[15]=1;
      ends[15]=1;
      tdone[15]=1;
    }
  }

  public void thread32845(int [] tdone, int [] ends){
        S18484=1;
    cylPos5ZAxisExtend.setPresent();//sysj\controller.sysj line: 187, column: 7
    currsigs.addElement(cylPos5ZAxisExtend);
    active[14]=1;
    ends[14]=1;
    tdone[14]=1;
  }

  public void thread32844(int [] tdone, int [] ends){
        S18478=1;
    cylClampBottleExtend.setPresent();//sysj\controller.sysj line: 181, column: 7
    currsigs.addElement(cylClampBottleExtend);
    active[13]=1;
    ends[13]=1;
    tdone[13]=1;
  }

  public void thread32842(int [] tdone, int [] ends){
        S18513=1;
    S18510=0;
    active[18]=1;
    ends[18]=1;
    tdone[18]=1;
  }

  public void thread32840(int [] tdone, int [] ends){
        S18490=1;
    active[17]=1;
    ends[17]=1;
    tdone[17]=1;
  }

  public void thread32839(int [] tdone, int [] ends){
        S18487=1;
    active[16]=1;
    ends[16]=1;
    tdone[16]=1;
  }

  public void thread32838(int [] tdone, int [] ends){
        S18500=1;
    S18499=0;
    thread32839(tdone,ends);
    thread32840(tdone,ends);
    int biggest32841 = 0;
    if(ends[16]>=biggest32841){
      biggest32841=ends[16];
    }
    if(ends[17]>=biggest32841){
      biggest32841=ends[17];
    }
    if(biggest32841 == 1){
      active[15]=1;
      ends[15]=1;
      tdone[15]=1;
    }
  }

  public void thread32837(int [] tdone, int [] ends){
        S18484=1;
    cylPos5ZAxisExtend.setPresent();//sysj\controller.sysj line: 187, column: 7
    currsigs.addElement(cylPos5ZAxisExtend);
    active[14]=1;
    ends[14]=1;
    tdone[14]=1;
  }

  public void thread32836(int [] tdone, int [] ends){
        S18478=1;
    cylClampBottleExtend.setPresent();//sysj\controller.sysj line: 181, column: 7
    currsigs.addElement(cylClampBottleExtend);
    active[13]=1;
    ends[13]=1;
    tdone[13]=1;
  }

  public void thread32834(int [] tdone, int [] ends){
        S18513=1;
    S18510=0;
    active[18]=1;
    ends[18]=1;
    tdone[18]=1;
  }

  public void thread32832(int [] tdone, int [] ends){
        S18490=1;
    active[17]=1;
    ends[17]=1;
    tdone[17]=1;
  }

  public void thread32831(int [] tdone, int [] ends){
        S18487=1;
    active[16]=1;
    ends[16]=1;
    tdone[16]=1;
  }

  public void thread32830(int [] tdone, int [] ends){
        S18500=1;
    S18499=0;
    thread32831(tdone,ends);
    thread32832(tdone,ends);
    int biggest32833 = 0;
    if(ends[16]>=biggest32833){
      biggest32833=ends[16];
    }
    if(ends[17]>=biggest32833){
      biggest32833=ends[17];
    }
    if(biggest32833 == 1){
      active[15]=1;
      ends[15]=1;
      tdone[15]=1;
    }
  }

  public void thread32829(int [] tdone, int [] ends){
        S18484=1;
    cylPos5ZAxisExtend.setPresent();//sysj\controller.sysj line: 187, column: 7
    currsigs.addElement(cylPos5ZAxisExtend);
    active[14]=1;
    ends[14]=1;
    tdone[14]=1;
  }

  public void thread32828(int [] tdone, int [] ends){
        S18478=1;
    cylClampBottleExtend.setPresent();//sysj\controller.sysj line: 181, column: 7
    currsigs.addElement(cylClampBottleExtend);
    active[13]=1;
    ends[13]=1;
    tdone[13]=1;
  }

  public void thread32826(int [] tdone, int [] ends){
        S18513=1;
    S18510=0;
    active[18]=1;
    ends[18]=1;
    tdone[18]=1;
  }

  public void thread32824(int [] tdone, int [] ends){
        S18490=1;
    active[17]=1;
    ends[17]=1;
    tdone[17]=1;
  }

  public void thread32823(int [] tdone, int [] ends){
        S18487=1;
    active[16]=1;
    ends[16]=1;
    tdone[16]=1;
  }

  public void thread32822(int [] tdone, int [] ends){
        S18500=1;
    S18499=0;
    thread32823(tdone,ends);
    thread32824(tdone,ends);
    int biggest32825 = 0;
    if(ends[16]>=biggest32825){
      biggest32825=ends[16];
    }
    if(ends[17]>=biggest32825){
      biggest32825=ends[17];
    }
    if(biggest32825 == 1){
      active[15]=1;
      ends[15]=1;
      tdone[15]=1;
    }
  }

  public void thread32821(int [] tdone, int [] ends){
        S18484=1;
    cylPos5ZAxisExtend.setPresent();//sysj\controller.sysj line: 187, column: 7
    currsigs.addElement(cylPos5ZAxisExtend);
    active[14]=1;
    ends[14]=1;
    tdone[14]=1;
  }

  public void thread32820(int [] tdone, int [] ends){
        S18478=1;
    cylClampBottleExtend.setPresent();//sysj\controller.sysj line: 181, column: 7
    currsigs.addElement(cylClampBottleExtend);
    active[13]=1;
    ends[13]=1;
    tdone[13]=1;
  }

  public void thread32818(int [] tdone, int [] ends){
        S18513=1;
    S18510=0;
    active[18]=1;
    ends[18]=1;
    tdone[18]=1;
  }

  public void thread32816(int [] tdone, int [] ends){
        S18490=1;
    active[17]=1;
    ends[17]=1;
    tdone[17]=1;
  }

  public void thread32815(int [] tdone, int [] ends){
        S18487=1;
    active[16]=1;
    ends[16]=1;
    tdone[16]=1;
  }

  public void thread32814(int [] tdone, int [] ends){
        S18500=1;
    S18499=0;
    thread32815(tdone,ends);
    thread32816(tdone,ends);
    int biggest32817 = 0;
    if(ends[16]>=biggest32817){
      biggest32817=ends[16];
    }
    if(ends[17]>=biggest32817){
      biggest32817=ends[17];
    }
    if(biggest32817 == 1){
      active[15]=1;
      ends[15]=1;
      tdone[15]=1;
    }
  }

  public void thread32813(int [] tdone, int [] ends){
        S18484=1;
    cylPos5ZAxisExtend.setPresent();//sysj\controller.sysj line: 187, column: 7
    currsigs.addElement(cylPos5ZAxisExtend);
    active[14]=1;
    ends[14]=1;
    tdone[14]=1;
  }

  public void thread32812(int [] tdone, int [] ends){
        S18478=1;
    cylClampBottleExtend.setPresent();//sysj\controller.sysj line: 181, column: 7
    currsigs.addElement(cylClampBottleExtend);
    active[13]=1;
    ends[13]=1;
    tdone[13]=1;
  }

  public void thread32810(int [] tdone, int [] ends){
        S18513=1;
    S18510=0;
    active[18]=1;
    ends[18]=1;
    tdone[18]=1;
  }

  public void thread32808(int [] tdone, int [] ends){
        S18490=1;
    active[17]=1;
    ends[17]=1;
    tdone[17]=1;
  }

  public void thread32807(int [] tdone, int [] ends){
        S18487=1;
    active[16]=1;
    ends[16]=1;
    tdone[16]=1;
  }

  public void thread32806(int [] tdone, int [] ends){
        S18500=1;
    S18499=0;
    thread32807(tdone,ends);
    thread32808(tdone,ends);
    int biggest32809 = 0;
    if(ends[16]>=biggest32809){
      biggest32809=ends[16];
    }
    if(ends[17]>=biggest32809){
      biggest32809=ends[17];
    }
    if(biggest32809 == 1){
      active[15]=1;
      ends[15]=1;
      tdone[15]=1;
    }
  }

  public void thread32805(int [] tdone, int [] ends){
        S18484=1;
    cylPos5ZAxisExtend.setPresent();//sysj\controller.sysj line: 187, column: 7
    currsigs.addElement(cylPos5ZAxisExtend);
    active[14]=1;
    ends[14]=1;
    tdone[14]=1;
  }

  public void thread32804(int [] tdone, int [] ends){
        S18478=1;
    cylClampBottleExtend.setPresent();//sysj\controller.sysj line: 181, column: 7
    currsigs.addElement(cylClampBottleExtend);
    active[13]=1;
    ends[13]=1;
    tdone[13]=1;
  }

  public void thread32802(int [] tdone, int [] ends){
        S18513=1;
    S18510=0;
    active[18]=1;
    ends[18]=1;
    tdone[18]=1;
  }

  public void thread32800(int [] tdone, int [] ends){
        S18490=1;
    active[17]=1;
    ends[17]=1;
    tdone[17]=1;
  }

  public void thread32799(int [] tdone, int [] ends){
        S18487=1;
    active[16]=1;
    ends[16]=1;
    tdone[16]=1;
  }

  public void thread32798(int [] tdone, int [] ends){
        S18500=1;
    S18499=0;
    thread32799(tdone,ends);
    thread32800(tdone,ends);
    int biggest32801 = 0;
    if(ends[16]>=biggest32801){
      biggest32801=ends[16];
    }
    if(ends[17]>=biggest32801){
      biggest32801=ends[17];
    }
    if(biggest32801 == 1){
      active[15]=1;
      ends[15]=1;
      tdone[15]=1;
    }
  }

  public void thread32797(int [] tdone, int [] ends){
        S18484=1;
    cylPos5ZAxisExtend.setPresent();//sysj\controller.sysj line: 187, column: 7
    currsigs.addElement(cylPos5ZAxisExtend);
    active[14]=1;
    ends[14]=1;
    tdone[14]=1;
  }

  public void thread32796(int [] tdone, int [] ends){
        S18478=1;
    cylClampBottleExtend.setPresent();//sysj\controller.sysj line: 181, column: 7
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
      switch(S26729){
        case 0 : 
          S26729=0;
          break RUN;
        
        case 1 : 
          S26729=2;
          S26729=2;
          releaseCap_12.setClear();//sysj\controller.sysj line: 164, column: 2
          untwistGripper_12.setClear();//sysj\controller.sysj line: 164, column: 2
          raiseGripper_12.setClear();//sysj\controller.sysj line: 164, column: 2
          unclampBottle_12.setClear();//sysj\controller.sysj line: 164, column: 2
          S18425=0;
          S18409=0;
          if(!capperReq_in.isPartnerPresent() || capperReq_in.isPartnerPreempted()){//sysj\controller.sysj line: 167, column: 3
            capperReq_in.setACK(false);//sysj\controller.sysj line: 167, column: 3
            S18409=1;
            active[12]=1;
            ends[12]=1;
            break RUN;
          }
          else {
            S18404=0;
            if(!capperReq_in.isREQ()){//sysj\controller.sysj line: 167, column: 3
              capperReq_in.setACK(true);//sysj\controller.sysj line: 167, column: 3
              S18404=1;
              if(capperReq_in.isREQ()){//sysj\controller.sysj line: 167, column: 3
                capperReq_in.setACK(false);//sysj\controller.sysj line: 167, column: 3
                ends[12]=2;
                ;//sysj\controller.sysj line: 167, column: 3
                request_thread_12 = (boolean)(capperReq_in.getVal() == null ? false : ((Boolean)capperReq_in.getVal()).booleanValue());//sysj\controller.sysj line: 168, column: 3
                S18425=1;
                if(request_thread_12){//sysj\controller.sysj line: 170, column: 3
                  System.out.println("CapperController: Received request");//sysj\controller.sysj line: 171, column: 4
                  S18472=0;
                  if(!bottleAtPos4.getprestatus()){//sysj\controller.sysj line: 173, column: 13
                    S18432=0;
                    if(!capperStatus_o.isPartnerPresent() || capperStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 174, column: 5
                      capperStatus_o.setREQ(false);//sysj\controller.sysj line: 174, column: 5
                      S18432=1;
                      active[12]=1;
                      ends[12]=1;
                      break RUN;
                    }
                    else {
                      S18427=0;
                      if(capperStatus_o.isACK()){//sysj\controller.sysj line: 174, column: 5
                        capperStatus_o.setVal("idle");//sysj\controller.sysj line: 174, column: 5
                        S18427=1;
                        if(!capperStatus_o.isACK()){//sysj\controller.sysj line: 174, column: 5
                          capperStatus_o.setREQ(false);//sysj\controller.sysj line: 174, column: 5
                          ends[12]=2;
                          ;//sysj\controller.sysj line: 174, column: 5
                          S18472=1;
                          if(bottleAtPos4.getprestatus()){//sysj\controller.sysj line: 177, column: 12
                            System.out.println("CapperController: Capper doing work...");//sysj\controller.sysj line: 178, column: 5
                            S18555=0;
                            thread32796(tdone,ends);
                            thread32797(tdone,ends);
                            thread32798(tdone,ends);
                            thread32802(tdone,ends);
                            int biggest32803 = 0;
                            if(ends[13]>=biggest32803){
                              biggest32803=ends[13];
                            }
                            if(ends[14]>=biggest32803){
                              biggest32803=ends[14];
                            }
                            if(ends[15]>=biggest32803){
                              biggest32803=ends[15];
                            }
                            if(ends[18]>=biggest32803){
                              biggest32803=ends[18];
                            }
                            if(biggest32803 == 1){
                              active[12]=1;
                              ends[12]=1;
                              break RUN;
                            }
                          }
                          else {
                            S18425=2;
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
                    S18472=1;
                    if(bottleAtPos4.getprestatus()){//sysj\controller.sysj line: 177, column: 12
                      System.out.println("CapperController: Capper doing work...");//sysj\controller.sysj line: 178, column: 5
                      S18555=0;
                      thread32804(tdone,ends);
                      thread32805(tdone,ends);
                      thread32806(tdone,ends);
                      thread32810(tdone,ends);
                      int biggest32811 = 0;
                      if(ends[13]>=biggest32811){
                        biggest32811=ends[13];
                      }
                      if(ends[14]>=biggest32811){
                        biggest32811=ends[14];
                      }
                      if(ends[15]>=biggest32811){
                        biggest32811=ends[15];
                      }
                      if(ends[18]>=biggest32811){
                        biggest32811=ends[18];
                      }
                      if(biggest32811 == 1){
                        active[12]=1;
                        ends[12]=1;
                        break RUN;
                      }
                    }
                    else {
                      S18425=2;
                      active[12]=1;
                      ends[12]=1;
                      break RUN;
                    }
                  }
                }
                else {
                  S18425=2;
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
          releaseCap_12.setClear();//sysj\controller.sysj line: 164, column: 2
          untwistGripper_12.setClear();//sysj\controller.sysj line: 164, column: 2
          raiseGripper_12.setClear();//sysj\controller.sysj line: 164, column: 2
          unclampBottle_12.setClear();//sysj\controller.sysj line: 164, column: 2
          switch(S18425){
            case 0 : 
              switch(S18409){
                case 0 : 
                  if(!capperReq_in.isPartnerPresent() || capperReq_in.isPartnerPreempted()){//sysj\controller.sysj line: 167, column: 3
                    capperReq_in.setACK(false);//sysj\controller.sysj line: 167, column: 3
                    S18409=1;
                    active[12]=1;
                    ends[12]=1;
                    break RUN;
                  }
                  else {
                    switch(S18404){
                      case 0 : 
                        if(!capperReq_in.isREQ()){//sysj\controller.sysj line: 167, column: 3
                          capperReq_in.setACK(true);//sysj\controller.sysj line: 167, column: 3
                          S18404=1;
                          if(capperReq_in.isREQ()){//sysj\controller.sysj line: 167, column: 3
                            capperReq_in.setACK(false);//sysj\controller.sysj line: 167, column: 3
                            ends[12]=2;
                            ;//sysj\controller.sysj line: 167, column: 3
                            request_thread_12 = (boolean)(capperReq_in.getVal() == null ? false : ((Boolean)capperReq_in.getVal()).booleanValue());//sysj\controller.sysj line: 168, column: 3
                            S18425=1;
                            if(request_thread_12){//sysj\controller.sysj line: 170, column: 3
                              System.out.println("CapperController: Received request");//sysj\controller.sysj line: 171, column: 4
                              S18472=0;
                              if(!bottleAtPos4.getprestatus()){//sysj\controller.sysj line: 173, column: 13
                                S18432=0;
                                if(!capperStatus_o.isPartnerPresent() || capperStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 174, column: 5
                                  capperStatus_o.setREQ(false);//sysj\controller.sysj line: 174, column: 5
                                  S18432=1;
                                  active[12]=1;
                                  ends[12]=1;
                                  break RUN;
                                }
                                else {
                                  S18427=0;
                                  if(capperStatus_o.isACK()){//sysj\controller.sysj line: 174, column: 5
                                    capperStatus_o.setVal("idle");//sysj\controller.sysj line: 174, column: 5
                                    S18427=1;
                                    if(!capperStatus_o.isACK()){//sysj\controller.sysj line: 174, column: 5
                                      capperStatus_o.setREQ(false);//sysj\controller.sysj line: 174, column: 5
                                      ends[12]=2;
                                      ;//sysj\controller.sysj line: 174, column: 5
                                      S18472=1;
                                      if(bottleAtPos4.getprestatus()){//sysj\controller.sysj line: 177, column: 12
                                        System.out.println("CapperController: Capper doing work...");//sysj\controller.sysj line: 178, column: 5
                                        S18555=0;
                                        thread32812(tdone,ends);
                                        thread32813(tdone,ends);
                                        thread32814(tdone,ends);
                                        thread32818(tdone,ends);
                                        int biggest32819 = 0;
                                        if(ends[13]>=biggest32819){
                                          biggest32819=ends[13];
                                        }
                                        if(ends[14]>=biggest32819){
                                          biggest32819=ends[14];
                                        }
                                        if(ends[15]>=biggest32819){
                                          biggest32819=ends[15];
                                        }
                                        if(ends[18]>=biggest32819){
                                          biggest32819=ends[18];
                                        }
                                        if(biggest32819 == 1){
                                          active[12]=1;
                                          ends[12]=1;
                                          break RUN;
                                        }
                                      }
                                      else {
                                        S18425=2;
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
                                S18472=1;
                                if(bottleAtPos4.getprestatus()){//sysj\controller.sysj line: 177, column: 12
                                  System.out.println("CapperController: Capper doing work...");//sysj\controller.sysj line: 178, column: 5
                                  S18555=0;
                                  thread32820(tdone,ends);
                                  thread32821(tdone,ends);
                                  thread32822(tdone,ends);
                                  thread32826(tdone,ends);
                                  int biggest32827 = 0;
                                  if(ends[13]>=biggest32827){
                                    biggest32827=ends[13];
                                  }
                                  if(ends[14]>=biggest32827){
                                    biggest32827=ends[14];
                                  }
                                  if(ends[15]>=biggest32827){
                                    biggest32827=ends[15];
                                  }
                                  if(ends[18]>=biggest32827){
                                    biggest32827=ends[18];
                                  }
                                  if(biggest32827 == 1){
                                    active[12]=1;
                                    ends[12]=1;
                                    break RUN;
                                  }
                                }
                                else {
                                  S18425=2;
                                  active[12]=1;
                                  ends[12]=1;
                                  break RUN;
                                }
                              }
                            }
                            else {
                              S18425=2;
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
                        if(capperReq_in.isREQ()){//sysj\controller.sysj line: 167, column: 3
                          capperReq_in.setACK(false);//sysj\controller.sysj line: 167, column: 3
                          ends[12]=2;
                          ;//sysj\controller.sysj line: 167, column: 3
                          request_thread_12 = (boolean)(capperReq_in.getVal() == null ? false : ((Boolean)capperReq_in.getVal()).booleanValue());//sysj\controller.sysj line: 168, column: 3
                          S18425=1;
                          if(request_thread_12){//sysj\controller.sysj line: 170, column: 3
                            System.out.println("CapperController: Received request");//sysj\controller.sysj line: 171, column: 4
                            S18472=0;
                            if(!bottleAtPos4.getprestatus()){//sysj\controller.sysj line: 173, column: 13
                              S18432=0;
                              if(!capperStatus_o.isPartnerPresent() || capperStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 174, column: 5
                                capperStatus_o.setREQ(false);//sysj\controller.sysj line: 174, column: 5
                                S18432=1;
                                active[12]=1;
                                ends[12]=1;
                                break RUN;
                              }
                              else {
                                S18427=0;
                                if(capperStatus_o.isACK()){//sysj\controller.sysj line: 174, column: 5
                                  capperStatus_o.setVal("idle");//sysj\controller.sysj line: 174, column: 5
                                  S18427=1;
                                  if(!capperStatus_o.isACK()){//sysj\controller.sysj line: 174, column: 5
                                    capperStatus_o.setREQ(false);//sysj\controller.sysj line: 174, column: 5
                                    ends[12]=2;
                                    ;//sysj\controller.sysj line: 174, column: 5
                                    S18472=1;
                                    if(bottleAtPos4.getprestatus()){//sysj\controller.sysj line: 177, column: 12
                                      System.out.println("CapperController: Capper doing work...");//sysj\controller.sysj line: 178, column: 5
                                      S18555=0;
                                      thread32828(tdone,ends);
                                      thread32829(tdone,ends);
                                      thread32830(tdone,ends);
                                      thread32834(tdone,ends);
                                      int biggest32835 = 0;
                                      if(ends[13]>=biggest32835){
                                        biggest32835=ends[13];
                                      }
                                      if(ends[14]>=biggest32835){
                                        biggest32835=ends[14];
                                      }
                                      if(ends[15]>=biggest32835){
                                        biggest32835=ends[15];
                                      }
                                      if(ends[18]>=biggest32835){
                                        biggest32835=ends[18];
                                      }
                                      if(biggest32835 == 1){
                                        active[12]=1;
                                        ends[12]=1;
                                        break RUN;
                                      }
                                    }
                                    else {
                                      S18425=2;
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
                              S18472=1;
                              if(bottleAtPos4.getprestatus()){//sysj\controller.sysj line: 177, column: 12
                                System.out.println("CapperController: Capper doing work...");//sysj\controller.sysj line: 178, column: 5
                                S18555=0;
                                thread32836(tdone,ends);
                                thread32837(tdone,ends);
                                thread32838(tdone,ends);
                                thread32842(tdone,ends);
                                int biggest32843 = 0;
                                if(ends[13]>=biggest32843){
                                  biggest32843=ends[13];
                                }
                                if(ends[14]>=biggest32843){
                                  biggest32843=ends[14];
                                }
                                if(ends[15]>=biggest32843){
                                  biggest32843=ends[15];
                                }
                                if(ends[18]>=biggest32843){
                                  biggest32843=ends[18];
                                }
                                if(biggest32843 == 1){
                                  active[12]=1;
                                  ends[12]=1;
                                  break RUN;
                                }
                              }
                              else {
                                S18425=2;
                                active[12]=1;
                                ends[12]=1;
                                break RUN;
                              }
                            }
                          }
                          else {
                            S18425=2;
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
                  S18409=1;
                  S18409=0;
                  if(!capperReq_in.isPartnerPresent() || capperReq_in.isPartnerPreempted()){//sysj\controller.sysj line: 167, column: 3
                    capperReq_in.setACK(false);//sysj\controller.sysj line: 167, column: 3
                    S18409=1;
                    active[12]=1;
                    ends[12]=1;
                    break RUN;
                  }
                  else {
                    S18404=0;
                    if(!capperReq_in.isREQ()){//sysj\controller.sysj line: 167, column: 3
                      capperReq_in.setACK(true);//sysj\controller.sysj line: 167, column: 3
                      S18404=1;
                      if(capperReq_in.isREQ()){//sysj\controller.sysj line: 167, column: 3
                        capperReq_in.setACK(false);//sysj\controller.sysj line: 167, column: 3
                        ends[12]=2;
                        ;//sysj\controller.sysj line: 167, column: 3
                        request_thread_12 = (boolean)(capperReq_in.getVal() == null ? false : ((Boolean)capperReq_in.getVal()).booleanValue());//sysj\controller.sysj line: 168, column: 3
                        S18425=1;
                        if(request_thread_12){//sysj\controller.sysj line: 170, column: 3
                          System.out.println("CapperController: Received request");//sysj\controller.sysj line: 171, column: 4
                          S18472=0;
                          if(!bottleAtPos4.getprestatus()){//sysj\controller.sysj line: 173, column: 13
                            S18432=0;
                            if(!capperStatus_o.isPartnerPresent() || capperStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 174, column: 5
                              capperStatus_o.setREQ(false);//sysj\controller.sysj line: 174, column: 5
                              S18432=1;
                              active[12]=1;
                              ends[12]=1;
                              break RUN;
                            }
                            else {
                              S18427=0;
                              if(capperStatus_o.isACK()){//sysj\controller.sysj line: 174, column: 5
                                capperStatus_o.setVal("idle");//sysj\controller.sysj line: 174, column: 5
                                S18427=1;
                                if(!capperStatus_o.isACK()){//sysj\controller.sysj line: 174, column: 5
                                  capperStatus_o.setREQ(false);//sysj\controller.sysj line: 174, column: 5
                                  ends[12]=2;
                                  ;//sysj\controller.sysj line: 174, column: 5
                                  S18472=1;
                                  if(bottleAtPos4.getprestatus()){//sysj\controller.sysj line: 177, column: 12
                                    System.out.println("CapperController: Capper doing work...");//sysj\controller.sysj line: 178, column: 5
                                    S18555=0;
                                    thread32844(tdone,ends);
                                    thread32845(tdone,ends);
                                    thread32846(tdone,ends);
                                    thread32850(tdone,ends);
                                    int biggest32851 = 0;
                                    if(ends[13]>=biggest32851){
                                      biggest32851=ends[13];
                                    }
                                    if(ends[14]>=biggest32851){
                                      biggest32851=ends[14];
                                    }
                                    if(ends[15]>=biggest32851){
                                      biggest32851=ends[15];
                                    }
                                    if(ends[18]>=biggest32851){
                                      biggest32851=ends[18];
                                    }
                                    if(biggest32851 == 1){
                                      active[12]=1;
                                      ends[12]=1;
                                      break RUN;
                                    }
                                  }
                                  else {
                                    S18425=2;
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
                            S18472=1;
                            if(bottleAtPos4.getprestatus()){//sysj\controller.sysj line: 177, column: 12
                              System.out.println("CapperController: Capper doing work...");//sysj\controller.sysj line: 178, column: 5
                              S18555=0;
                              thread32852(tdone,ends);
                              thread32853(tdone,ends);
                              thread32854(tdone,ends);
                              thread32858(tdone,ends);
                              int biggest32859 = 0;
                              if(ends[13]>=biggest32859){
                                biggest32859=ends[13];
                              }
                              if(ends[14]>=biggest32859){
                                biggest32859=ends[14];
                              }
                              if(ends[15]>=biggest32859){
                                biggest32859=ends[15];
                              }
                              if(ends[18]>=biggest32859){
                                biggest32859=ends[18];
                              }
                              if(biggest32859 == 1){
                                active[12]=1;
                                ends[12]=1;
                                break RUN;
                              }
                            }
                            else {
                              S18425=2;
                              active[12]=1;
                              ends[12]=1;
                              break RUN;
                            }
                          }
                        }
                        else {
                          S18425=2;
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
              switch(S18472){
                case 0 : 
                  switch(S18432){
                    case 0 : 
                      if(!capperStatus_o.isPartnerPresent() || capperStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 174, column: 5
                        capperStatus_o.setREQ(false);//sysj\controller.sysj line: 174, column: 5
                        S18432=1;
                        active[12]=1;
                        ends[12]=1;
                        break RUN;
                      }
                      else {
                        switch(S18427){
                          case 0 : 
                            if(capperStatus_o.isACK()){//sysj\controller.sysj line: 174, column: 5
                              capperStatus_o.setVal("idle");//sysj\controller.sysj line: 174, column: 5
                              S18427=1;
                              if(!capperStatus_o.isACK()){//sysj\controller.sysj line: 174, column: 5
                                capperStatus_o.setREQ(false);//sysj\controller.sysj line: 174, column: 5
                                ends[12]=2;
                                ;//sysj\controller.sysj line: 174, column: 5
                                S18472=1;
                                if(bottleAtPos4.getprestatus()){//sysj\controller.sysj line: 177, column: 12
                                  System.out.println("CapperController: Capper doing work...");//sysj\controller.sysj line: 178, column: 5
                                  S18555=0;
                                  thread32860(tdone,ends);
                                  thread32861(tdone,ends);
                                  thread32862(tdone,ends);
                                  thread32866(tdone,ends);
                                  int biggest32867 = 0;
                                  if(ends[13]>=biggest32867){
                                    biggest32867=ends[13];
                                  }
                                  if(ends[14]>=biggest32867){
                                    biggest32867=ends[14];
                                  }
                                  if(ends[15]>=biggest32867){
                                    biggest32867=ends[15];
                                  }
                                  if(ends[18]>=biggest32867){
                                    biggest32867=ends[18];
                                  }
                                  if(biggest32867 == 1){
                                    active[12]=1;
                                    ends[12]=1;
                                    break RUN;
                                  }
                                }
                                else {
                                  S18425=2;
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
                            if(!capperStatus_o.isACK()){//sysj\controller.sysj line: 174, column: 5
                              capperStatus_o.setREQ(false);//sysj\controller.sysj line: 174, column: 5
                              ends[12]=2;
                              ;//sysj\controller.sysj line: 174, column: 5
                              S18472=1;
                              if(bottleAtPos4.getprestatus()){//sysj\controller.sysj line: 177, column: 12
                                System.out.println("CapperController: Capper doing work...");//sysj\controller.sysj line: 178, column: 5
                                S18555=0;
                                thread32868(tdone,ends);
                                thread32869(tdone,ends);
                                thread32870(tdone,ends);
                                thread32874(tdone,ends);
                                int biggest32875 = 0;
                                if(ends[13]>=biggest32875){
                                  biggest32875=ends[13];
                                }
                                if(ends[14]>=biggest32875){
                                  biggest32875=ends[14];
                                }
                                if(ends[15]>=biggest32875){
                                  biggest32875=ends[15];
                                }
                                if(ends[18]>=biggest32875){
                                  biggest32875=ends[18];
                                }
                                if(biggest32875 == 1){
                                  active[12]=1;
                                  ends[12]=1;
                                  break RUN;
                                }
                              }
                              else {
                                S18425=2;
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
                      S18432=1;
                      S18432=0;
                      if(!capperStatus_o.isPartnerPresent() || capperStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 174, column: 5
                        capperStatus_o.setREQ(false);//sysj\controller.sysj line: 174, column: 5
                        S18432=1;
                        active[12]=1;
                        ends[12]=1;
                        break RUN;
                      }
                      else {
                        S18427=0;
                        if(capperStatus_o.isACK()){//sysj\controller.sysj line: 174, column: 5
                          capperStatus_o.setVal("idle");//sysj\controller.sysj line: 174, column: 5
                          S18427=1;
                          if(!capperStatus_o.isACK()){//sysj\controller.sysj line: 174, column: 5
                            capperStatus_o.setREQ(false);//sysj\controller.sysj line: 174, column: 5
                            ends[12]=2;
                            ;//sysj\controller.sysj line: 174, column: 5
                            S18472=1;
                            if(bottleAtPos4.getprestatus()){//sysj\controller.sysj line: 177, column: 12
                              System.out.println("CapperController: Capper doing work...");//sysj\controller.sysj line: 178, column: 5
                              S18555=0;
                              thread32876(tdone,ends);
                              thread32877(tdone,ends);
                              thread32878(tdone,ends);
                              thread32882(tdone,ends);
                              int biggest32883 = 0;
                              if(ends[13]>=biggest32883){
                                biggest32883=ends[13];
                              }
                              if(ends[14]>=biggest32883){
                                biggest32883=ends[14];
                              }
                              if(ends[15]>=biggest32883){
                                biggest32883=ends[15];
                              }
                              if(ends[18]>=biggest32883){
                                biggest32883=ends[18];
                              }
                              if(biggest32883 == 1){
                                active[12]=1;
                                ends[12]=1;
                                break RUN;
                              }
                            }
                            else {
                              S18425=2;
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
                  switch(S18555){
                    case 0 : 
                      thread32884(tdone,ends);
                      thread32885(tdone,ends);
                      thread32886(tdone,ends);
                      thread32890(tdone,ends);
                      int biggest32891 = 0;
                      if(ends[13]>=biggest32891){
                        biggest32891=ends[13];
                      }
                      if(ends[14]>=biggest32891){
                        biggest32891=ends[14];
                      }
                      if(ends[15]>=biggest32891){
                        biggest32891=ends[15];
                      }
                      if(ends[18]>=biggest32891){
                        biggest32891=ends[18];
                      }
                      if(biggest32891 == 1){
                        active[12]=1;
                        ends[12]=1;
                        break RUN;
                      }
                      //FINXME code
                      if(biggest32891 == 0){
                        S18555=1;
                        S18562=0;
                        if(!capperStatus_o.isPartnerPresent() || capperStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 214, column: 5
                          capperStatus_o.setREQ(false);//sysj\controller.sysj line: 214, column: 5
                          S18562=1;
                          active[12]=1;
                          ends[12]=1;
                          break RUN;
                        }
                        else {
                          S18557=0;
                          if(capperStatus_o.isACK()){//sysj\controller.sysj line: 214, column: 5
                            capperStatus_o.setVal("done");//sysj\controller.sysj line: 214, column: 5
                            S18557=1;
                            if(!capperStatus_o.isACK()){//sysj\controller.sysj line: 214, column: 5
                              capperStatus_o.setREQ(false);//sysj\controller.sysj line: 214, column: 5
                              ends[12]=2;
                              ;//sysj\controller.sysj line: 214, column: 5
                              S18425=2;
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
                      switch(S18562){
                        case 0 : 
                          if(!capperStatus_o.isPartnerPresent() || capperStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 214, column: 5
                            capperStatus_o.setREQ(false);//sysj\controller.sysj line: 214, column: 5
                            S18562=1;
                            active[12]=1;
                            ends[12]=1;
                            break RUN;
                          }
                          else {
                            switch(S18557){
                              case 0 : 
                                if(capperStatus_o.isACK()){//sysj\controller.sysj line: 214, column: 5
                                  capperStatus_o.setVal("done");//sysj\controller.sysj line: 214, column: 5
                                  S18557=1;
                                  if(!capperStatus_o.isACK()){//sysj\controller.sysj line: 214, column: 5
                                    capperStatus_o.setREQ(false);//sysj\controller.sysj line: 214, column: 5
                                    ends[12]=2;
                                    ;//sysj\controller.sysj line: 214, column: 5
                                    S18425=2;
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
                                  S18425=2;
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
                          S18562=1;
                          S18562=0;
                          if(!capperStatus_o.isPartnerPresent() || capperStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 214, column: 5
                            capperStatus_o.setREQ(false);//sysj\controller.sysj line: 214, column: 5
                            S18562=1;
                            active[12]=1;
                            ends[12]=1;
                            break RUN;
                          }
                          else {
                            S18557=0;
                            if(capperStatus_o.isACK()){//sysj\controller.sysj line: 214, column: 5
                              capperStatus_o.setVal("done");//sysj\controller.sysj line: 214, column: 5
                              S18557=1;
                              if(!capperStatus_o.isACK()){//sysj\controller.sysj line: 214, column: 5
                                capperStatus_o.setREQ(false);//sysj\controller.sysj line: 214, column: 5
                                ends[12]=2;
                                ;//sysj\controller.sysj line: 214, column: 5
                                S18425=2;
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
              S18425=2;
              S18425=0;
              S18409=0;
              if(!capperReq_in.isPartnerPresent() || capperReq_in.isPartnerPreempted()){//sysj\controller.sysj line: 167, column: 3
                capperReq_in.setACK(false);//sysj\controller.sysj line: 167, column: 3
                S18409=1;
                active[12]=1;
                ends[12]=1;
                break RUN;
              }
              else {
                S18404=0;
                if(!capperReq_in.isREQ()){//sysj\controller.sysj line: 167, column: 3
                  capperReq_in.setACK(true);//sysj\controller.sysj line: 167, column: 3
                  S18404=1;
                  if(capperReq_in.isREQ()){//sysj\controller.sysj line: 167, column: 3
                    capperReq_in.setACK(false);//sysj\controller.sysj line: 167, column: 3
                    ends[12]=2;
                    ;//sysj\controller.sysj line: 167, column: 3
                    request_thread_12 = (boolean)(capperReq_in.getVal() == null ? false : ((Boolean)capperReq_in.getVal()).booleanValue());//sysj\controller.sysj line: 168, column: 3
                    S18425=1;
                    if(request_thread_12){//sysj\controller.sysj line: 170, column: 3
                      System.out.println("CapperController: Received request");//sysj\controller.sysj line: 171, column: 4
                      S18472=0;
                      if(!bottleAtPos4.getprestatus()){//sysj\controller.sysj line: 173, column: 13
                        S18432=0;
                        if(!capperStatus_o.isPartnerPresent() || capperStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 174, column: 5
                          capperStatus_o.setREQ(false);//sysj\controller.sysj line: 174, column: 5
                          S18432=1;
                          active[12]=1;
                          ends[12]=1;
                          break RUN;
                        }
                        else {
                          S18427=0;
                          if(capperStatus_o.isACK()){//sysj\controller.sysj line: 174, column: 5
                            capperStatus_o.setVal("idle");//sysj\controller.sysj line: 174, column: 5
                            S18427=1;
                            if(!capperStatus_o.isACK()){//sysj\controller.sysj line: 174, column: 5
                              capperStatus_o.setREQ(false);//sysj\controller.sysj line: 174, column: 5
                              ends[12]=2;
                              ;//sysj\controller.sysj line: 174, column: 5
                              S18472=1;
                              if(bottleAtPos4.getprestatus()){//sysj\controller.sysj line: 177, column: 12
                                System.out.println("CapperController: Capper doing work...");//sysj\controller.sysj line: 178, column: 5
                                S18555=0;
                                thread32892(tdone,ends);
                                thread32893(tdone,ends);
                                thread32894(tdone,ends);
                                thread32898(tdone,ends);
                                int biggest32899 = 0;
                                if(ends[13]>=biggest32899){
                                  biggest32899=ends[13];
                                }
                                if(ends[14]>=biggest32899){
                                  biggest32899=ends[14];
                                }
                                if(ends[15]>=biggest32899){
                                  biggest32899=ends[15];
                                }
                                if(ends[18]>=biggest32899){
                                  biggest32899=ends[18];
                                }
                                if(biggest32899 == 1){
                                  active[12]=1;
                                  ends[12]=1;
                                  break RUN;
                                }
                              }
                              else {
                                S18425=2;
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
                        S18472=1;
                        if(bottleAtPos4.getprestatus()){//sysj\controller.sysj line: 177, column: 12
                          System.out.println("CapperController: Capper doing work...");//sysj\controller.sysj line: 178, column: 5
                          S18555=0;
                          thread32900(tdone,ends);
                          thread32901(tdone,ends);
                          thread32902(tdone,ends);
                          thread32906(tdone,ends);
                          int biggest32907 = 0;
                          if(ends[13]>=biggest32907){
                            biggest32907=ends[13];
                          }
                          if(ends[14]>=biggest32907){
                            biggest32907=ends[14];
                          }
                          if(ends[15]>=biggest32907){
                            biggest32907=ends[15];
                          }
                          if(ends[18]>=biggest32907){
                            biggest32907=ends[18];
                          }
                          if(biggest32907 == 1){
                            active[12]=1;
                            ends[12]=1;
                            break RUN;
                          }
                        }
                        else {
                          S18425=2;
                          active[12]=1;
                          ends[12]=1;
                          break RUN;
                        }
                      }
                    }
                    else {
                      S18425=2;
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
