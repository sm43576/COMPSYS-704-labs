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
  private int S30779 = 1;
  private int S22475 = 1;
  private int S22459 = 1;
  private int S22454 = 1;
  private int S22522 = 1;
  private int S22482 = 1;
  private int S22477 = 1;
  private int S22605 = 1;
  private int S22528 = 1;
  private int S22534 = 1;
  private int S22550 = 1;
  private int S22549 = 1;
  private int S22537 = 1;
  private int S22540 = 1;
  private int S22563 = 1;
  private int S22560 = 1;
  private int S22612 = 1;
  private int S22607 = 1;
  
  private int[] ends = new int[22];
  private int[] tdone = new int[22];
  
  public void thread36959(int [] tdone, int [] ends){
        S22563=1;
    S22560=0;
    active[18]=1;
    ends[18]=1;
    tdone[18]=1;
  }

  public void thread36957(int [] tdone, int [] ends){
        S22540=1;
    active[17]=1;
    ends[17]=1;
    tdone[17]=1;
  }

  public void thread36956(int [] tdone, int [] ends){
        S22537=1;
    active[16]=1;
    ends[16]=1;
    tdone[16]=1;
  }

  public void thread36955(int [] tdone, int [] ends){
        S22550=1;
    S22549=0;
    thread36956(tdone,ends);
    thread36957(tdone,ends);
    int biggest36958 = 0;
    if(ends[16]>=biggest36958){
      biggest36958=ends[16];
    }
    if(ends[17]>=biggest36958){
      biggest36958=ends[17];
    }
    if(biggest36958 == 1){
      active[15]=1;
      ends[15]=1;
      tdone[15]=1;
    }
  }

  public void thread36954(int [] tdone, int [] ends){
        S22534=1;
    cylPos5ZAxisExtend.setPresent();//sysj\controller.sysj line: 183, column: 7
    currsigs.addElement(cylPos5ZAxisExtend);
    active[14]=1;
    ends[14]=1;
    tdone[14]=1;
  }

  public void thread36953(int [] tdone, int [] ends){
        S22528=1;
    cylClampBottleExtend.setPresent();//sysj\controller.sysj line: 177, column: 7
    currsigs.addElement(cylClampBottleExtend);
    active[13]=1;
    ends[13]=1;
    tdone[13]=1;
  }

  public void thread36951(int [] tdone, int [] ends){
        S22563=1;
    S22560=0;
    active[18]=1;
    ends[18]=1;
    tdone[18]=1;
  }

  public void thread36949(int [] tdone, int [] ends){
        S22540=1;
    active[17]=1;
    ends[17]=1;
    tdone[17]=1;
  }

  public void thread36948(int [] tdone, int [] ends){
        S22537=1;
    active[16]=1;
    ends[16]=1;
    tdone[16]=1;
  }

  public void thread36947(int [] tdone, int [] ends){
        S22550=1;
    S22549=0;
    thread36948(tdone,ends);
    thread36949(tdone,ends);
    int biggest36950 = 0;
    if(ends[16]>=biggest36950){
      biggest36950=ends[16];
    }
    if(ends[17]>=biggest36950){
      biggest36950=ends[17];
    }
    if(biggest36950 == 1){
      active[15]=1;
      ends[15]=1;
      tdone[15]=1;
    }
  }

  public void thread36946(int [] tdone, int [] ends){
        S22534=1;
    cylPos5ZAxisExtend.setPresent();//sysj\controller.sysj line: 183, column: 7
    currsigs.addElement(cylPos5ZAxisExtend);
    active[14]=1;
    ends[14]=1;
    tdone[14]=1;
  }

  public void thread36945(int [] tdone, int [] ends){
        S22528=1;
    cylClampBottleExtend.setPresent();//sysj\controller.sysj line: 177, column: 7
    currsigs.addElement(cylClampBottleExtend);
    active[13]=1;
    ends[13]=1;
    tdone[13]=1;
  }

  public void thread36943(int [] tdone, int [] ends){
        switch(S22563){
      case 0 : 
        active[18]=0;
        ends[18]=0;
        tdone[18]=1;
        break;
      
      case 1 : 
        switch(S22560){
          case 0 : 
            if(gripperGrippedCap.getprestatus()){//sysj\controller.sysj line: 196, column: 12
              S22560=1;
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
              S22563=0;
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

  public void thread36941(int [] tdone, int [] ends){
        switch(S22540){
      case 0 : 
        active[17]=0;
        ends[17]=0;
        tdone[17]=1;
        break;
      
      case 1 : 
        if(cylClampedBottle.getprestatus()){//sysj\controller.sysj line: 189, column: 46
          S22540=0;
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

  public void thread36940(int [] tdone, int [] ends){
        switch(S22537){
      case 0 : 
        active[16]=0;
        ends[16]=0;
        tdone[16]=1;
        break;
      
      case 1 : 
        if(gripperZAxisLowered.getprestatus()){//sysj\controller.sysj line: 189, column: 13
          S22537=0;
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

  public void thread36939(int [] tdone, int [] ends){
        switch(S22550){
      case 0 : 
        active[15]=0;
        ends[15]=0;
        tdone[15]=1;
        break;
      
      case 1 : 
        switch(S22549){
          case 0 : 
            thread36940(tdone,ends);
            thread36941(tdone,ends);
            int biggest36942 = 0;
            if(ends[16]>=biggest36942){
              biggest36942=ends[16];
            }
            if(ends[17]>=biggest36942){
              biggest36942=ends[17];
            }
            if(biggest36942 == 1){
              active[15]=1;
              ends[15]=1;
              tdone[15]=1;
            }
            //FINXME code
            if(biggest36942 == 0){
              S22549=1;
              capGripperPos5Extend.setPresent();//sysj\controller.sysj line: 191, column: 7
              currsigs.addElement(capGripperPos5Extend);
              active[15]=1;
              ends[15]=1;
              tdone[15]=1;
            }
            break;
          
          case 1 : 
            if(releaseCap_12.getprestatus()){//sysj\controller.sysj line: 190, column: 12
              S22550=0;
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

  public void thread36938(int [] tdone, int [] ends){
        switch(S22534){
      case 0 : 
        active[14]=0;
        ends[14]=0;
        tdone[14]=1;
        break;
      
      case 1 : 
        if(raiseGripper_12.getprestatus()){//sysj\controller.sysj line: 182, column: 12
          S22534=0;
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

  public void thread36937(int [] tdone, int [] ends){
        switch(S22528){
      case 0 : 
        active[13]=0;
        ends[13]=0;
        tdone[13]=1;
        break;
      
      case 1 : 
        if(unclampBottle_12.getprestatus()){//sysj\controller.sysj line: 176, column: 13
          S22528=0;
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

  public void thread36935(int [] tdone, int [] ends){
        S22563=1;
    S22560=0;
    active[18]=1;
    ends[18]=1;
    tdone[18]=1;
  }

  public void thread36933(int [] tdone, int [] ends){
        S22540=1;
    active[17]=1;
    ends[17]=1;
    tdone[17]=1;
  }

  public void thread36932(int [] tdone, int [] ends){
        S22537=1;
    active[16]=1;
    ends[16]=1;
    tdone[16]=1;
  }

  public void thread36931(int [] tdone, int [] ends){
        S22550=1;
    S22549=0;
    thread36932(tdone,ends);
    thread36933(tdone,ends);
    int biggest36934 = 0;
    if(ends[16]>=biggest36934){
      biggest36934=ends[16];
    }
    if(ends[17]>=biggest36934){
      biggest36934=ends[17];
    }
    if(biggest36934 == 1){
      active[15]=1;
      ends[15]=1;
      tdone[15]=1;
    }
  }

  public void thread36930(int [] tdone, int [] ends){
        S22534=1;
    cylPos5ZAxisExtend.setPresent();//sysj\controller.sysj line: 183, column: 7
    currsigs.addElement(cylPos5ZAxisExtend);
    active[14]=1;
    ends[14]=1;
    tdone[14]=1;
  }

  public void thread36929(int [] tdone, int [] ends){
        S22528=1;
    cylClampBottleExtend.setPresent();//sysj\controller.sysj line: 177, column: 7
    currsigs.addElement(cylClampBottleExtend);
    active[13]=1;
    ends[13]=1;
    tdone[13]=1;
  }

  public void thread36927(int [] tdone, int [] ends){
        S22563=1;
    S22560=0;
    active[18]=1;
    ends[18]=1;
    tdone[18]=1;
  }

  public void thread36925(int [] tdone, int [] ends){
        S22540=1;
    active[17]=1;
    ends[17]=1;
    tdone[17]=1;
  }

  public void thread36924(int [] tdone, int [] ends){
        S22537=1;
    active[16]=1;
    ends[16]=1;
    tdone[16]=1;
  }

  public void thread36923(int [] tdone, int [] ends){
        S22550=1;
    S22549=0;
    thread36924(tdone,ends);
    thread36925(tdone,ends);
    int biggest36926 = 0;
    if(ends[16]>=biggest36926){
      biggest36926=ends[16];
    }
    if(ends[17]>=biggest36926){
      biggest36926=ends[17];
    }
    if(biggest36926 == 1){
      active[15]=1;
      ends[15]=1;
      tdone[15]=1;
    }
  }

  public void thread36922(int [] tdone, int [] ends){
        S22534=1;
    cylPos5ZAxisExtend.setPresent();//sysj\controller.sysj line: 183, column: 7
    currsigs.addElement(cylPos5ZAxisExtend);
    active[14]=1;
    ends[14]=1;
    tdone[14]=1;
  }

  public void thread36921(int [] tdone, int [] ends){
        S22528=1;
    cylClampBottleExtend.setPresent();//sysj\controller.sysj line: 177, column: 7
    currsigs.addElement(cylClampBottleExtend);
    active[13]=1;
    ends[13]=1;
    tdone[13]=1;
  }

  public void thread36919(int [] tdone, int [] ends){
        S22563=1;
    S22560=0;
    active[18]=1;
    ends[18]=1;
    tdone[18]=1;
  }

  public void thread36917(int [] tdone, int [] ends){
        S22540=1;
    active[17]=1;
    ends[17]=1;
    tdone[17]=1;
  }

  public void thread36916(int [] tdone, int [] ends){
        S22537=1;
    active[16]=1;
    ends[16]=1;
    tdone[16]=1;
  }

  public void thread36915(int [] tdone, int [] ends){
        S22550=1;
    S22549=0;
    thread36916(tdone,ends);
    thread36917(tdone,ends);
    int biggest36918 = 0;
    if(ends[16]>=biggest36918){
      biggest36918=ends[16];
    }
    if(ends[17]>=biggest36918){
      biggest36918=ends[17];
    }
    if(biggest36918 == 1){
      active[15]=1;
      ends[15]=1;
      tdone[15]=1;
    }
  }

  public void thread36914(int [] tdone, int [] ends){
        S22534=1;
    cylPos5ZAxisExtend.setPresent();//sysj\controller.sysj line: 183, column: 7
    currsigs.addElement(cylPos5ZAxisExtend);
    active[14]=1;
    ends[14]=1;
    tdone[14]=1;
  }

  public void thread36913(int [] tdone, int [] ends){
        S22528=1;
    cylClampBottleExtend.setPresent();//sysj\controller.sysj line: 177, column: 7
    currsigs.addElement(cylClampBottleExtend);
    active[13]=1;
    ends[13]=1;
    tdone[13]=1;
  }

  public void thread36911(int [] tdone, int [] ends){
        S22563=1;
    S22560=0;
    active[18]=1;
    ends[18]=1;
    tdone[18]=1;
  }

  public void thread36909(int [] tdone, int [] ends){
        S22540=1;
    active[17]=1;
    ends[17]=1;
    tdone[17]=1;
  }

  public void thread36908(int [] tdone, int [] ends){
        S22537=1;
    active[16]=1;
    ends[16]=1;
    tdone[16]=1;
  }

  public void thread36907(int [] tdone, int [] ends){
        S22550=1;
    S22549=0;
    thread36908(tdone,ends);
    thread36909(tdone,ends);
    int biggest36910 = 0;
    if(ends[16]>=biggest36910){
      biggest36910=ends[16];
    }
    if(ends[17]>=biggest36910){
      biggest36910=ends[17];
    }
    if(biggest36910 == 1){
      active[15]=1;
      ends[15]=1;
      tdone[15]=1;
    }
  }

  public void thread36906(int [] tdone, int [] ends){
        S22534=1;
    cylPos5ZAxisExtend.setPresent();//sysj\controller.sysj line: 183, column: 7
    currsigs.addElement(cylPos5ZAxisExtend);
    active[14]=1;
    ends[14]=1;
    tdone[14]=1;
  }

  public void thread36905(int [] tdone, int [] ends){
        S22528=1;
    cylClampBottleExtend.setPresent();//sysj\controller.sysj line: 177, column: 7
    currsigs.addElement(cylClampBottleExtend);
    active[13]=1;
    ends[13]=1;
    tdone[13]=1;
  }

  public void thread36903(int [] tdone, int [] ends){
        S22563=1;
    S22560=0;
    active[18]=1;
    ends[18]=1;
    tdone[18]=1;
  }

  public void thread36901(int [] tdone, int [] ends){
        S22540=1;
    active[17]=1;
    ends[17]=1;
    tdone[17]=1;
  }

  public void thread36900(int [] tdone, int [] ends){
        S22537=1;
    active[16]=1;
    ends[16]=1;
    tdone[16]=1;
  }

  public void thread36899(int [] tdone, int [] ends){
        S22550=1;
    S22549=0;
    thread36900(tdone,ends);
    thread36901(tdone,ends);
    int biggest36902 = 0;
    if(ends[16]>=biggest36902){
      biggest36902=ends[16];
    }
    if(ends[17]>=biggest36902){
      biggest36902=ends[17];
    }
    if(biggest36902 == 1){
      active[15]=1;
      ends[15]=1;
      tdone[15]=1;
    }
  }

  public void thread36898(int [] tdone, int [] ends){
        S22534=1;
    cylPos5ZAxisExtend.setPresent();//sysj\controller.sysj line: 183, column: 7
    currsigs.addElement(cylPos5ZAxisExtend);
    active[14]=1;
    ends[14]=1;
    tdone[14]=1;
  }

  public void thread36897(int [] tdone, int [] ends){
        S22528=1;
    cylClampBottleExtend.setPresent();//sysj\controller.sysj line: 177, column: 7
    currsigs.addElement(cylClampBottleExtend);
    active[13]=1;
    ends[13]=1;
    tdone[13]=1;
  }

  public void thread36895(int [] tdone, int [] ends){
        S22563=1;
    S22560=0;
    active[18]=1;
    ends[18]=1;
    tdone[18]=1;
  }

  public void thread36893(int [] tdone, int [] ends){
        S22540=1;
    active[17]=1;
    ends[17]=1;
    tdone[17]=1;
  }

  public void thread36892(int [] tdone, int [] ends){
        S22537=1;
    active[16]=1;
    ends[16]=1;
    tdone[16]=1;
  }

  public void thread36891(int [] tdone, int [] ends){
        S22550=1;
    S22549=0;
    thread36892(tdone,ends);
    thread36893(tdone,ends);
    int biggest36894 = 0;
    if(ends[16]>=biggest36894){
      biggest36894=ends[16];
    }
    if(ends[17]>=biggest36894){
      biggest36894=ends[17];
    }
    if(biggest36894 == 1){
      active[15]=1;
      ends[15]=1;
      tdone[15]=1;
    }
  }

  public void thread36890(int [] tdone, int [] ends){
        S22534=1;
    cylPos5ZAxisExtend.setPresent();//sysj\controller.sysj line: 183, column: 7
    currsigs.addElement(cylPos5ZAxisExtend);
    active[14]=1;
    ends[14]=1;
    tdone[14]=1;
  }

  public void thread36889(int [] tdone, int [] ends){
        S22528=1;
    cylClampBottleExtend.setPresent();//sysj\controller.sysj line: 177, column: 7
    currsigs.addElement(cylClampBottleExtend);
    active[13]=1;
    ends[13]=1;
    tdone[13]=1;
  }

  public void thread36887(int [] tdone, int [] ends){
        S22563=1;
    S22560=0;
    active[18]=1;
    ends[18]=1;
    tdone[18]=1;
  }

  public void thread36885(int [] tdone, int [] ends){
        S22540=1;
    active[17]=1;
    ends[17]=1;
    tdone[17]=1;
  }

  public void thread36884(int [] tdone, int [] ends){
        S22537=1;
    active[16]=1;
    ends[16]=1;
    tdone[16]=1;
  }

  public void thread36883(int [] tdone, int [] ends){
        S22550=1;
    S22549=0;
    thread36884(tdone,ends);
    thread36885(tdone,ends);
    int biggest36886 = 0;
    if(ends[16]>=biggest36886){
      biggest36886=ends[16];
    }
    if(ends[17]>=biggest36886){
      biggest36886=ends[17];
    }
    if(biggest36886 == 1){
      active[15]=1;
      ends[15]=1;
      tdone[15]=1;
    }
  }

  public void thread36882(int [] tdone, int [] ends){
        S22534=1;
    cylPos5ZAxisExtend.setPresent();//sysj\controller.sysj line: 183, column: 7
    currsigs.addElement(cylPos5ZAxisExtend);
    active[14]=1;
    ends[14]=1;
    tdone[14]=1;
  }

  public void thread36881(int [] tdone, int [] ends){
        S22528=1;
    cylClampBottleExtend.setPresent();//sysj\controller.sysj line: 177, column: 7
    currsigs.addElement(cylClampBottleExtend);
    active[13]=1;
    ends[13]=1;
    tdone[13]=1;
  }

  public void thread36879(int [] tdone, int [] ends){
        S22563=1;
    S22560=0;
    active[18]=1;
    ends[18]=1;
    tdone[18]=1;
  }

  public void thread36877(int [] tdone, int [] ends){
        S22540=1;
    active[17]=1;
    ends[17]=1;
    tdone[17]=1;
  }

  public void thread36876(int [] tdone, int [] ends){
        S22537=1;
    active[16]=1;
    ends[16]=1;
    tdone[16]=1;
  }

  public void thread36875(int [] tdone, int [] ends){
        S22550=1;
    S22549=0;
    thread36876(tdone,ends);
    thread36877(tdone,ends);
    int biggest36878 = 0;
    if(ends[16]>=biggest36878){
      biggest36878=ends[16];
    }
    if(ends[17]>=biggest36878){
      biggest36878=ends[17];
    }
    if(biggest36878 == 1){
      active[15]=1;
      ends[15]=1;
      tdone[15]=1;
    }
  }

  public void thread36874(int [] tdone, int [] ends){
        S22534=1;
    cylPos5ZAxisExtend.setPresent();//sysj\controller.sysj line: 183, column: 7
    currsigs.addElement(cylPos5ZAxisExtend);
    active[14]=1;
    ends[14]=1;
    tdone[14]=1;
  }

  public void thread36873(int [] tdone, int [] ends){
        S22528=1;
    cylClampBottleExtend.setPresent();//sysj\controller.sysj line: 177, column: 7
    currsigs.addElement(cylClampBottleExtend);
    active[13]=1;
    ends[13]=1;
    tdone[13]=1;
  }

  public void thread36871(int [] tdone, int [] ends){
        S22563=1;
    S22560=0;
    active[18]=1;
    ends[18]=1;
    tdone[18]=1;
  }

  public void thread36869(int [] tdone, int [] ends){
        S22540=1;
    active[17]=1;
    ends[17]=1;
    tdone[17]=1;
  }

  public void thread36868(int [] tdone, int [] ends){
        S22537=1;
    active[16]=1;
    ends[16]=1;
    tdone[16]=1;
  }

  public void thread36867(int [] tdone, int [] ends){
        S22550=1;
    S22549=0;
    thread36868(tdone,ends);
    thread36869(tdone,ends);
    int biggest36870 = 0;
    if(ends[16]>=biggest36870){
      biggest36870=ends[16];
    }
    if(ends[17]>=biggest36870){
      biggest36870=ends[17];
    }
    if(biggest36870 == 1){
      active[15]=1;
      ends[15]=1;
      tdone[15]=1;
    }
  }

  public void thread36866(int [] tdone, int [] ends){
        S22534=1;
    cylPos5ZAxisExtend.setPresent();//sysj\controller.sysj line: 183, column: 7
    currsigs.addElement(cylPos5ZAxisExtend);
    active[14]=1;
    ends[14]=1;
    tdone[14]=1;
  }

  public void thread36865(int [] tdone, int [] ends){
        S22528=1;
    cylClampBottleExtend.setPresent();//sysj\controller.sysj line: 177, column: 7
    currsigs.addElement(cylClampBottleExtend);
    active[13]=1;
    ends[13]=1;
    tdone[13]=1;
  }

  public void thread36863(int [] tdone, int [] ends){
        S22563=1;
    S22560=0;
    active[18]=1;
    ends[18]=1;
    tdone[18]=1;
  }

  public void thread36861(int [] tdone, int [] ends){
        S22540=1;
    active[17]=1;
    ends[17]=1;
    tdone[17]=1;
  }

  public void thread36860(int [] tdone, int [] ends){
        S22537=1;
    active[16]=1;
    ends[16]=1;
    tdone[16]=1;
  }

  public void thread36859(int [] tdone, int [] ends){
        S22550=1;
    S22549=0;
    thread36860(tdone,ends);
    thread36861(tdone,ends);
    int biggest36862 = 0;
    if(ends[16]>=biggest36862){
      biggest36862=ends[16];
    }
    if(ends[17]>=biggest36862){
      biggest36862=ends[17];
    }
    if(biggest36862 == 1){
      active[15]=1;
      ends[15]=1;
      tdone[15]=1;
    }
  }

  public void thread36858(int [] tdone, int [] ends){
        S22534=1;
    cylPos5ZAxisExtend.setPresent();//sysj\controller.sysj line: 183, column: 7
    currsigs.addElement(cylPos5ZAxisExtend);
    active[14]=1;
    ends[14]=1;
    tdone[14]=1;
  }

  public void thread36857(int [] tdone, int [] ends){
        S22528=1;
    cylClampBottleExtend.setPresent();//sysj\controller.sysj line: 177, column: 7
    currsigs.addElement(cylClampBottleExtend);
    active[13]=1;
    ends[13]=1;
    tdone[13]=1;
  }

  public void thread36855(int [] tdone, int [] ends){
        S22563=1;
    S22560=0;
    active[18]=1;
    ends[18]=1;
    tdone[18]=1;
  }

  public void thread36853(int [] tdone, int [] ends){
        S22540=1;
    active[17]=1;
    ends[17]=1;
    tdone[17]=1;
  }

  public void thread36852(int [] tdone, int [] ends){
        S22537=1;
    active[16]=1;
    ends[16]=1;
    tdone[16]=1;
  }

  public void thread36851(int [] tdone, int [] ends){
        S22550=1;
    S22549=0;
    thread36852(tdone,ends);
    thread36853(tdone,ends);
    int biggest36854 = 0;
    if(ends[16]>=biggest36854){
      biggest36854=ends[16];
    }
    if(ends[17]>=biggest36854){
      biggest36854=ends[17];
    }
    if(biggest36854 == 1){
      active[15]=1;
      ends[15]=1;
      tdone[15]=1;
    }
  }

  public void thread36850(int [] tdone, int [] ends){
        S22534=1;
    cylPos5ZAxisExtend.setPresent();//sysj\controller.sysj line: 183, column: 7
    currsigs.addElement(cylPos5ZAxisExtend);
    active[14]=1;
    ends[14]=1;
    tdone[14]=1;
  }

  public void thread36849(int [] tdone, int [] ends){
        S22528=1;
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
      switch(S30779){
        case 0 : 
          S30779=0;
          break RUN;
        
        case 1 : 
          S30779=2;
          S30779=2;
          releaseCap_12.setClear();//sysj\controller.sysj line: 160, column: 2
          untwistGripper_12.setClear();//sysj\controller.sysj line: 160, column: 2
          raiseGripper_12.setClear();//sysj\controller.sysj line: 160, column: 2
          unclampBottle_12.setClear();//sysj\controller.sysj line: 160, column: 2
          S22475=0;
          S22459=0;
          if(!capperReq_in.isPartnerPresent() || capperReq_in.isPartnerPreempted()){//sysj\controller.sysj line: 163, column: 3
            capperReq_in.setACK(false);//sysj\controller.sysj line: 163, column: 3
            S22459=1;
            active[12]=1;
            ends[12]=1;
            break RUN;
          }
          else {
            S22454=0;
            if(!capperReq_in.isREQ()){//sysj\controller.sysj line: 163, column: 3
              capperReq_in.setACK(true);//sysj\controller.sysj line: 163, column: 3
              S22454=1;
              if(capperReq_in.isREQ()){//sysj\controller.sysj line: 163, column: 3
                capperReq_in.setACK(false);//sysj\controller.sysj line: 163, column: 3
                ends[12]=2;
                ;//sysj\controller.sysj line: 163, column: 3
                request_thread_12 = (boolean)(capperReq_in.getVal() == null ? false : ((Boolean)capperReq_in.getVal()).booleanValue());//sysj\controller.sysj line: 164, column: 3
                S22475=1;
                if(request_thread_12){//sysj\controller.sysj line: 166, column: 3
                  System.out.println("CapperController: Received request");//sysj\controller.sysj line: 167, column: 4
                  S22522=0;
                  if(!bottleAtPos4.getprestatus()){//sysj\controller.sysj line: 169, column: 13
                    S22482=0;
                    if(!capperStatus_o.isPartnerPresent() || capperStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 170, column: 5
                      capperStatus_o.setREQ(false);//sysj\controller.sysj line: 170, column: 5
                      S22482=1;
                      active[12]=1;
                      ends[12]=1;
                      break RUN;
                    }
                    else {
                      S22477=0;
                      if(capperStatus_o.isACK()){//sysj\controller.sysj line: 170, column: 5
                        capperStatus_o.setVal("idle");//sysj\controller.sysj line: 170, column: 5
                        S22477=1;
                        if(!capperStatus_o.isACK()){//sysj\controller.sysj line: 170, column: 5
                          capperStatus_o.setREQ(false);//sysj\controller.sysj line: 170, column: 5
                          ends[12]=2;
                          ;//sysj\controller.sysj line: 170, column: 5
                          S22522=1;
                          if(bottleAtPos4.getprestatus()){//sysj\controller.sysj line: 173, column: 12
                            System.out.println("CapperController: Capper doing work...");//sysj\controller.sysj line: 174, column: 5
                            S22605=0;
                            thread36849(tdone,ends);
                            thread36850(tdone,ends);
                            thread36851(tdone,ends);
                            thread36855(tdone,ends);
                            int biggest36856 = 0;
                            if(ends[13]>=biggest36856){
                              biggest36856=ends[13];
                            }
                            if(ends[14]>=biggest36856){
                              biggest36856=ends[14];
                            }
                            if(ends[15]>=biggest36856){
                              biggest36856=ends[15];
                            }
                            if(ends[18]>=biggest36856){
                              biggest36856=ends[18];
                            }
                            if(biggest36856 == 1){
                              active[12]=1;
                              ends[12]=1;
                              break RUN;
                            }
                          }
                          else {
                            S22475=2;
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
                    S22522=1;
                    if(bottleAtPos4.getprestatus()){//sysj\controller.sysj line: 173, column: 12
                      System.out.println("CapperController: Capper doing work...");//sysj\controller.sysj line: 174, column: 5
                      S22605=0;
                      thread36857(tdone,ends);
                      thread36858(tdone,ends);
                      thread36859(tdone,ends);
                      thread36863(tdone,ends);
                      int biggest36864 = 0;
                      if(ends[13]>=biggest36864){
                        biggest36864=ends[13];
                      }
                      if(ends[14]>=biggest36864){
                        biggest36864=ends[14];
                      }
                      if(ends[15]>=biggest36864){
                        biggest36864=ends[15];
                      }
                      if(ends[18]>=biggest36864){
                        biggest36864=ends[18];
                      }
                      if(biggest36864 == 1){
                        active[12]=1;
                        ends[12]=1;
                        break RUN;
                      }
                    }
                    else {
                      S22475=2;
                      active[12]=1;
                      ends[12]=1;
                      break RUN;
                    }
                  }
                }
                else {
                  S22475=2;
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
          switch(S22475){
            case 0 : 
              switch(S22459){
                case 0 : 
                  if(!capperReq_in.isPartnerPresent() || capperReq_in.isPartnerPreempted()){//sysj\controller.sysj line: 163, column: 3
                    capperReq_in.setACK(false);//sysj\controller.sysj line: 163, column: 3
                    S22459=1;
                    active[12]=1;
                    ends[12]=1;
                    break RUN;
                  }
                  else {
                    switch(S22454){
                      case 0 : 
                        if(!capperReq_in.isREQ()){//sysj\controller.sysj line: 163, column: 3
                          capperReq_in.setACK(true);//sysj\controller.sysj line: 163, column: 3
                          S22454=1;
                          if(capperReq_in.isREQ()){//sysj\controller.sysj line: 163, column: 3
                            capperReq_in.setACK(false);//sysj\controller.sysj line: 163, column: 3
                            ends[12]=2;
                            ;//sysj\controller.sysj line: 163, column: 3
                            request_thread_12 = (boolean)(capperReq_in.getVal() == null ? false : ((Boolean)capperReq_in.getVal()).booleanValue());//sysj\controller.sysj line: 164, column: 3
                            S22475=1;
                            if(request_thread_12){//sysj\controller.sysj line: 166, column: 3
                              System.out.println("CapperController: Received request");//sysj\controller.sysj line: 167, column: 4
                              S22522=0;
                              if(!bottleAtPos4.getprestatus()){//sysj\controller.sysj line: 169, column: 13
                                S22482=0;
                                if(!capperStatus_o.isPartnerPresent() || capperStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 170, column: 5
                                  capperStatus_o.setREQ(false);//sysj\controller.sysj line: 170, column: 5
                                  S22482=1;
                                  active[12]=1;
                                  ends[12]=1;
                                  break RUN;
                                }
                                else {
                                  S22477=0;
                                  if(capperStatus_o.isACK()){//sysj\controller.sysj line: 170, column: 5
                                    capperStatus_o.setVal("idle");//sysj\controller.sysj line: 170, column: 5
                                    S22477=1;
                                    if(!capperStatus_o.isACK()){//sysj\controller.sysj line: 170, column: 5
                                      capperStatus_o.setREQ(false);//sysj\controller.sysj line: 170, column: 5
                                      ends[12]=2;
                                      ;//sysj\controller.sysj line: 170, column: 5
                                      S22522=1;
                                      if(bottleAtPos4.getprestatus()){//sysj\controller.sysj line: 173, column: 12
                                        System.out.println("CapperController: Capper doing work...");//sysj\controller.sysj line: 174, column: 5
                                        S22605=0;
                                        thread36865(tdone,ends);
                                        thread36866(tdone,ends);
                                        thread36867(tdone,ends);
                                        thread36871(tdone,ends);
                                        int biggest36872 = 0;
                                        if(ends[13]>=biggest36872){
                                          biggest36872=ends[13];
                                        }
                                        if(ends[14]>=biggest36872){
                                          biggest36872=ends[14];
                                        }
                                        if(ends[15]>=biggest36872){
                                          biggest36872=ends[15];
                                        }
                                        if(ends[18]>=biggest36872){
                                          biggest36872=ends[18];
                                        }
                                        if(biggest36872 == 1){
                                          active[12]=1;
                                          ends[12]=1;
                                          break RUN;
                                        }
                                      }
                                      else {
                                        S22475=2;
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
                                S22522=1;
                                if(bottleAtPos4.getprestatus()){//sysj\controller.sysj line: 173, column: 12
                                  System.out.println("CapperController: Capper doing work...");//sysj\controller.sysj line: 174, column: 5
                                  S22605=0;
                                  thread36873(tdone,ends);
                                  thread36874(tdone,ends);
                                  thread36875(tdone,ends);
                                  thread36879(tdone,ends);
                                  int biggest36880 = 0;
                                  if(ends[13]>=biggest36880){
                                    biggest36880=ends[13];
                                  }
                                  if(ends[14]>=biggest36880){
                                    biggest36880=ends[14];
                                  }
                                  if(ends[15]>=biggest36880){
                                    biggest36880=ends[15];
                                  }
                                  if(ends[18]>=biggest36880){
                                    biggest36880=ends[18];
                                  }
                                  if(biggest36880 == 1){
                                    active[12]=1;
                                    ends[12]=1;
                                    break RUN;
                                  }
                                }
                                else {
                                  S22475=2;
                                  active[12]=1;
                                  ends[12]=1;
                                  break RUN;
                                }
                              }
                            }
                            else {
                              S22475=2;
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
                          S22475=1;
                          if(request_thread_12){//sysj\controller.sysj line: 166, column: 3
                            System.out.println("CapperController: Received request");//sysj\controller.sysj line: 167, column: 4
                            S22522=0;
                            if(!bottleAtPos4.getprestatus()){//sysj\controller.sysj line: 169, column: 13
                              S22482=0;
                              if(!capperStatus_o.isPartnerPresent() || capperStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 170, column: 5
                                capperStatus_o.setREQ(false);//sysj\controller.sysj line: 170, column: 5
                                S22482=1;
                                active[12]=1;
                                ends[12]=1;
                                break RUN;
                              }
                              else {
                                S22477=0;
                                if(capperStatus_o.isACK()){//sysj\controller.sysj line: 170, column: 5
                                  capperStatus_o.setVal("idle");//sysj\controller.sysj line: 170, column: 5
                                  S22477=1;
                                  if(!capperStatus_o.isACK()){//sysj\controller.sysj line: 170, column: 5
                                    capperStatus_o.setREQ(false);//sysj\controller.sysj line: 170, column: 5
                                    ends[12]=2;
                                    ;//sysj\controller.sysj line: 170, column: 5
                                    S22522=1;
                                    if(bottleAtPos4.getprestatus()){//sysj\controller.sysj line: 173, column: 12
                                      System.out.println("CapperController: Capper doing work...");//sysj\controller.sysj line: 174, column: 5
                                      S22605=0;
                                      thread36881(tdone,ends);
                                      thread36882(tdone,ends);
                                      thread36883(tdone,ends);
                                      thread36887(tdone,ends);
                                      int biggest36888 = 0;
                                      if(ends[13]>=biggest36888){
                                        biggest36888=ends[13];
                                      }
                                      if(ends[14]>=biggest36888){
                                        biggest36888=ends[14];
                                      }
                                      if(ends[15]>=biggest36888){
                                        biggest36888=ends[15];
                                      }
                                      if(ends[18]>=biggest36888){
                                        biggest36888=ends[18];
                                      }
                                      if(biggest36888 == 1){
                                        active[12]=1;
                                        ends[12]=1;
                                        break RUN;
                                      }
                                    }
                                    else {
                                      S22475=2;
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
                              S22522=1;
                              if(bottleAtPos4.getprestatus()){//sysj\controller.sysj line: 173, column: 12
                                System.out.println("CapperController: Capper doing work...");//sysj\controller.sysj line: 174, column: 5
                                S22605=0;
                                thread36889(tdone,ends);
                                thread36890(tdone,ends);
                                thread36891(tdone,ends);
                                thread36895(tdone,ends);
                                int biggest36896 = 0;
                                if(ends[13]>=biggest36896){
                                  biggest36896=ends[13];
                                }
                                if(ends[14]>=biggest36896){
                                  biggest36896=ends[14];
                                }
                                if(ends[15]>=biggest36896){
                                  biggest36896=ends[15];
                                }
                                if(ends[18]>=biggest36896){
                                  biggest36896=ends[18];
                                }
                                if(biggest36896 == 1){
                                  active[12]=1;
                                  ends[12]=1;
                                  break RUN;
                                }
                              }
                              else {
                                S22475=2;
                                active[12]=1;
                                ends[12]=1;
                                break RUN;
                              }
                            }
                          }
                          else {
                            S22475=2;
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
                  S22459=1;
                  S22459=0;
                  if(!capperReq_in.isPartnerPresent() || capperReq_in.isPartnerPreempted()){//sysj\controller.sysj line: 163, column: 3
                    capperReq_in.setACK(false);//sysj\controller.sysj line: 163, column: 3
                    S22459=1;
                    active[12]=1;
                    ends[12]=1;
                    break RUN;
                  }
                  else {
                    S22454=0;
                    if(!capperReq_in.isREQ()){//sysj\controller.sysj line: 163, column: 3
                      capperReq_in.setACK(true);//sysj\controller.sysj line: 163, column: 3
                      S22454=1;
                      if(capperReq_in.isREQ()){//sysj\controller.sysj line: 163, column: 3
                        capperReq_in.setACK(false);//sysj\controller.sysj line: 163, column: 3
                        ends[12]=2;
                        ;//sysj\controller.sysj line: 163, column: 3
                        request_thread_12 = (boolean)(capperReq_in.getVal() == null ? false : ((Boolean)capperReq_in.getVal()).booleanValue());//sysj\controller.sysj line: 164, column: 3
                        S22475=1;
                        if(request_thread_12){//sysj\controller.sysj line: 166, column: 3
                          System.out.println("CapperController: Received request");//sysj\controller.sysj line: 167, column: 4
                          S22522=0;
                          if(!bottleAtPos4.getprestatus()){//sysj\controller.sysj line: 169, column: 13
                            S22482=0;
                            if(!capperStatus_o.isPartnerPresent() || capperStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 170, column: 5
                              capperStatus_o.setREQ(false);//sysj\controller.sysj line: 170, column: 5
                              S22482=1;
                              active[12]=1;
                              ends[12]=1;
                              break RUN;
                            }
                            else {
                              S22477=0;
                              if(capperStatus_o.isACK()){//sysj\controller.sysj line: 170, column: 5
                                capperStatus_o.setVal("idle");//sysj\controller.sysj line: 170, column: 5
                                S22477=1;
                                if(!capperStatus_o.isACK()){//sysj\controller.sysj line: 170, column: 5
                                  capperStatus_o.setREQ(false);//sysj\controller.sysj line: 170, column: 5
                                  ends[12]=2;
                                  ;//sysj\controller.sysj line: 170, column: 5
                                  S22522=1;
                                  if(bottleAtPos4.getprestatus()){//sysj\controller.sysj line: 173, column: 12
                                    System.out.println("CapperController: Capper doing work...");//sysj\controller.sysj line: 174, column: 5
                                    S22605=0;
                                    thread36897(tdone,ends);
                                    thread36898(tdone,ends);
                                    thread36899(tdone,ends);
                                    thread36903(tdone,ends);
                                    int biggest36904 = 0;
                                    if(ends[13]>=biggest36904){
                                      biggest36904=ends[13];
                                    }
                                    if(ends[14]>=biggest36904){
                                      biggest36904=ends[14];
                                    }
                                    if(ends[15]>=biggest36904){
                                      biggest36904=ends[15];
                                    }
                                    if(ends[18]>=biggest36904){
                                      biggest36904=ends[18];
                                    }
                                    if(biggest36904 == 1){
                                      active[12]=1;
                                      ends[12]=1;
                                      break RUN;
                                    }
                                  }
                                  else {
                                    S22475=2;
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
                            S22522=1;
                            if(bottleAtPos4.getprestatus()){//sysj\controller.sysj line: 173, column: 12
                              System.out.println("CapperController: Capper doing work...");//sysj\controller.sysj line: 174, column: 5
                              S22605=0;
                              thread36905(tdone,ends);
                              thread36906(tdone,ends);
                              thread36907(tdone,ends);
                              thread36911(tdone,ends);
                              int biggest36912 = 0;
                              if(ends[13]>=biggest36912){
                                biggest36912=ends[13];
                              }
                              if(ends[14]>=biggest36912){
                                biggest36912=ends[14];
                              }
                              if(ends[15]>=biggest36912){
                                biggest36912=ends[15];
                              }
                              if(ends[18]>=biggest36912){
                                biggest36912=ends[18];
                              }
                              if(biggest36912 == 1){
                                active[12]=1;
                                ends[12]=1;
                                break RUN;
                              }
                            }
                            else {
                              S22475=2;
                              active[12]=1;
                              ends[12]=1;
                              break RUN;
                            }
                          }
                        }
                        else {
                          S22475=2;
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
              switch(S22522){
                case 0 : 
                  switch(S22482){
                    case 0 : 
                      if(!capperStatus_o.isPartnerPresent() || capperStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 170, column: 5
                        capperStatus_o.setREQ(false);//sysj\controller.sysj line: 170, column: 5
                        S22482=1;
                        active[12]=1;
                        ends[12]=1;
                        break RUN;
                      }
                      else {
                        switch(S22477){
                          case 0 : 
                            if(capperStatus_o.isACK()){//sysj\controller.sysj line: 170, column: 5
                              capperStatus_o.setVal("idle");//sysj\controller.sysj line: 170, column: 5
                              S22477=1;
                              if(!capperStatus_o.isACK()){//sysj\controller.sysj line: 170, column: 5
                                capperStatus_o.setREQ(false);//sysj\controller.sysj line: 170, column: 5
                                ends[12]=2;
                                ;//sysj\controller.sysj line: 170, column: 5
                                S22522=1;
                                if(bottleAtPos4.getprestatus()){//sysj\controller.sysj line: 173, column: 12
                                  System.out.println("CapperController: Capper doing work...");//sysj\controller.sysj line: 174, column: 5
                                  S22605=0;
                                  thread36913(tdone,ends);
                                  thread36914(tdone,ends);
                                  thread36915(tdone,ends);
                                  thread36919(tdone,ends);
                                  int biggest36920 = 0;
                                  if(ends[13]>=biggest36920){
                                    biggest36920=ends[13];
                                  }
                                  if(ends[14]>=biggest36920){
                                    biggest36920=ends[14];
                                  }
                                  if(ends[15]>=biggest36920){
                                    biggest36920=ends[15];
                                  }
                                  if(ends[18]>=biggest36920){
                                    biggest36920=ends[18];
                                  }
                                  if(biggest36920 == 1){
                                    active[12]=1;
                                    ends[12]=1;
                                    break RUN;
                                  }
                                }
                                else {
                                  S22475=2;
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
                              S22522=1;
                              if(bottleAtPos4.getprestatus()){//sysj\controller.sysj line: 173, column: 12
                                System.out.println("CapperController: Capper doing work...");//sysj\controller.sysj line: 174, column: 5
                                S22605=0;
                                thread36921(tdone,ends);
                                thread36922(tdone,ends);
                                thread36923(tdone,ends);
                                thread36927(tdone,ends);
                                int biggest36928 = 0;
                                if(ends[13]>=biggest36928){
                                  biggest36928=ends[13];
                                }
                                if(ends[14]>=biggest36928){
                                  biggest36928=ends[14];
                                }
                                if(ends[15]>=biggest36928){
                                  biggest36928=ends[15];
                                }
                                if(ends[18]>=biggest36928){
                                  biggest36928=ends[18];
                                }
                                if(biggest36928 == 1){
                                  active[12]=1;
                                  ends[12]=1;
                                  break RUN;
                                }
                              }
                              else {
                                S22475=2;
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
                      S22482=1;
                      S22482=0;
                      if(!capperStatus_o.isPartnerPresent() || capperStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 170, column: 5
                        capperStatus_o.setREQ(false);//sysj\controller.sysj line: 170, column: 5
                        S22482=1;
                        active[12]=1;
                        ends[12]=1;
                        break RUN;
                      }
                      else {
                        S22477=0;
                        if(capperStatus_o.isACK()){//sysj\controller.sysj line: 170, column: 5
                          capperStatus_o.setVal("idle");//sysj\controller.sysj line: 170, column: 5
                          S22477=1;
                          if(!capperStatus_o.isACK()){//sysj\controller.sysj line: 170, column: 5
                            capperStatus_o.setREQ(false);//sysj\controller.sysj line: 170, column: 5
                            ends[12]=2;
                            ;//sysj\controller.sysj line: 170, column: 5
                            S22522=1;
                            if(bottleAtPos4.getprestatus()){//sysj\controller.sysj line: 173, column: 12
                              System.out.println("CapperController: Capper doing work...");//sysj\controller.sysj line: 174, column: 5
                              S22605=0;
                              thread36929(tdone,ends);
                              thread36930(tdone,ends);
                              thread36931(tdone,ends);
                              thread36935(tdone,ends);
                              int biggest36936 = 0;
                              if(ends[13]>=biggest36936){
                                biggest36936=ends[13];
                              }
                              if(ends[14]>=biggest36936){
                                biggest36936=ends[14];
                              }
                              if(ends[15]>=biggest36936){
                                biggest36936=ends[15];
                              }
                              if(ends[18]>=biggest36936){
                                biggest36936=ends[18];
                              }
                              if(biggest36936 == 1){
                                active[12]=1;
                                ends[12]=1;
                                break RUN;
                              }
                            }
                            else {
                              S22475=2;
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
                  switch(S22605){
                    case 0 : 
                      thread36937(tdone,ends);
                      thread36938(tdone,ends);
                      thread36939(tdone,ends);
                      thread36943(tdone,ends);
                      int biggest36944 = 0;
                      if(ends[13]>=biggest36944){
                        biggest36944=ends[13];
                      }
                      if(ends[14]>=biggest36944){
                        biggest36944=ends[14];
                      }
                      if(ends[15]>=biggest36944){
                        biggest36944=ends[15];
                      }
                      if(ends[18]>=biggest36944){
                        biggest36944=ends[18];
                      }
                      if(biggest36944 == 1){
                        active[12]=1;
                        ends[12]=1;
                        break RUN;
                      }
                      //FINXME code
                      if(biggest36944 == 0){
                        S22605=1;
                        S22612=0;
                        if(!capperStatus_o.isPartnerPresent() || capperStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 210, column: 5
                          capperStatus_o.setREQ(false);//sysj\controller.sysj line: 210, column: 5
                          S22612=1;
                          active[12]=1;
                          ends[12]=1;
                          break RUN;
                        }
                        else {
                          S22607=0;
                          if(capperStatus_o.isACK()){//sysj\controller.sysj line: 210, column: 5
                            capperStatus_o.setVal("done");//sysj\controller.sysj line: 210, column: 5
                            S22607=1;
                            if(!capperStatus_o.isACK()){//sysj\controller.sysj line: 210, column: 5
                              capperStatus_o.setREQ(false);//sysj\controller.sysj line: 210, column: 5
                              ends[12]=2;
                              ;//sysj\controller.sysj line: 210, column: 5
                              S22475=2;
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
                      switch(S22612){
                        case 0 : 
                          if(!capperStatus_o.isPartnerPresent() || capperStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 210, column: 5
                            capperStatus_o.setREQ(false);//sysj\controller.sysj line: 210, column: 5
                            S22612=1;
                            active[12]=1;
                            ends[12]=1;
                            break RUN;
                          }
                          else {
                            switch(S22607){
                              case 0 : 
                                if(capperStatus_o.isACK()){//sysj\controller.sysj line: 210, column: 5
                                  capperStatus_o.setVal("done");//sysj\controller.sysj line: 210, column: 5
                                  S22607=1;
                                  if(!capperStatus_o.isACK()){//sysj\controller.sysj line: 210, column: 5
                                    capperStatus_o.setREQ(false);//sysj\controller.sysj line: 210, column: 5
                                    ends[12]=2;
                                    ;//sysj\controller.sysj line: 210, column: 5
                                    S22475=2;
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
                                  S22475=2;
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
                          S22612=1;
                          S22612=0;
                          if(!capperStatus_o.isPartnerPresent() || capperStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 210, column: 5
                            capperStatus_o.setREQ(false);//sysj\controller.sysj line: 210, column: 5
                            S22612=1;
                            active[12]=1;
                            ends[12]=1;
                            break RUN;
                          }
                          else {
                            S22607=0;
                            if(capperStatus_o.isACK()){//sysj\controller.sysj line: 210, column: 5
                              capperStatus_o.setVal("done");//sysj\controller.sysj line: 210, column: 5
                              S22607=1;
                              if(!capperStatus_o.isACK()){//sysj\controller.sysj line: 210, column: 5
                                capperStatus_o.setREQ(false);//sysj\controller.sysj line: 210, column: 5
                                ends[12]=2;
                                ;//sysj\controller.sysj line: 210, column: 5
                                S22475=2;
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
              S22475=2;
              S22475=0;
              S22459=0;
              if(!capperReq_in.isPartnerPresent() || capperReq_in.isPartnerPreempted()){//sysj\controller.sysj line: 163, column: 3
                capperReq_in.setACK(false);//sysj\controller.sysj line: 163, column: 3
                S22459=1;
                active[12]=1;
                ends[12]=1;
                break RUN;
              }
              else {
                S22454=0;
                if(!capperReq_in.isREQ()){//sysj\controller.sysj line: 163, column: 3
                  capperReq_in.setACK(true);//sysj\controller.sysj line: 163, column: 3
                  S22454=1;
                  if(capperReq_in.isREQ()){//sysj\controller.sysj line: 163, column: 3
                    capperReq_in.setACK(false);//sysj\controller.sysj line: 163, column: 3
                    ends[12]=2;
                    ;//sysj\controller.sysj line: 163, column: 3
                    request_thread_12 = (boolean)(capperReq_in.getVal() == null ? false : ((Boolean)capperReq_in.getVal()).booleanValue());//sysj\controller.sysj line: 164, column: 3
                    S22475=1;
                    if(request_thread_12){//sysj\controller.sysj line: 166, column: 3
                      System.out.println("CapperController: Received request");//sysj\controller.sysj line: 167, column: 4
                      S22522=0;
                      if(!bottleAtPos4.getprestatus()){//sysj\controller.sysj line: 169, column: 13
                        S22482=0;
                        if(!capperStatus_o.isPartnerPresent() || capperStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 170, column: 5
                          capperStatus_o.setREQ(false);//sysj\controller.sysj line: 170, column: 5
                          S22482=1;
                          active[12]=1;
                          ends[12]=1;
                          break RUN;
                        }
                        else {
                          S22477=0;
                          if(capperStatus_o.isACK()){//sysj\controller.sysj line: 170, column: 5
                            capperStatus_o.setVal("idle");//sysj\controller.sysj line: 170, column: 5
                            S22477=1;
                            if(!capperStatus_o.isACK()){//sysj\controller.sysj line: 170, column: 5
                              capperStatus_o.setREQ(false);//sysj\controller.sysj line: 170, column: 5
                              ends[12]=2;
                              ;//sysj\controller.sysj line: 170, column: 5
                              S22522=1;
                              if(bottleAtPos4.getprestatus()){//sysj\controller.sysj line: 173, column: 12
                                System.out.println("CapperController: Capper doing work...");//sysj\controller.sysj line: 174, column: 5
                                S22605=0;
                                thread36945(tdone,ends);
                                thread36946(tdone,ends);
                                thread36947(tdone,ends);
                                thread36951(tdone,ends);
                                int biggest36952 = 0;
                                if(ends[13]>=biggest36952){
                                  biggest36952=ends[13];
                                }
                                if(ends[14]>=biggest36952){
                                  biggest36952=ends[14];
                                }
                                if(ends[15]>=biggest36952){
                                  biggest36952=ends[15];
                                }
                                if(ends[18]>=biggest36952){
                                  biggest36952=ends[18];
                                }
                                if(biggest36952 == 1){
                                  active[12]=1;
                                  ends[12]=1;
                                  break RUN;
                                }
                              }
                              else {
                                S22475=2;
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
                        S22522=1;
                        if(bottleAtPos4.getprestatus()){//sysj\controller.sysj line: 173, column: 12
                          System.out.println("CapperController: Capper doing work...");//sysj\controller.sysj line: 174, column: 5
                          S22605=0;
                          thread36953(tdone,ends);
                          thread36954(tdone,ends);
                          thread36955(tdone,ends);
                          thread36959(tdone,ends);
                          int biggest36960 = 0;
                          if(ends[13]>=biggest36960){
                            biggest36960=ends[13];
                          }
                          if(ends[14]>=biggest36960){
                            biggest36960=ends[14];
                          }
                          if(ends[15]>=biggest36960){
                            biggest36960=ends[15];
                          }
                          if(ends[18]>=biggest36960){
                            biggest36960=ends[18];
                          }
                          if(biggest36960 == 1){
                            active[12]=1;
                            ends[12]=1;
                            break RUN;
                          }
                        }
                        else {
                          S22475=2;
                          active[12]=1;
                          ends[12]=1;
                          break RUN;
                        }
                      }
                    }
                    else {
                      S22475=2;
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
