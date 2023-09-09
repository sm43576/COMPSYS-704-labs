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
  
  private int[] ends = new int[20];
  private int[] tdone = new int[20];
  
  public void thread31296(int [] tdone, int [] ends){
        S22563=1;
    S22560=0;
    active[18]=1;
    ends[18]=1;
    tdone[18]=1;
  }

  public void thread31294(int [] tdone, int [] ends){
        S22540=1;
    active[17]=1;
    ends[17]=1;
    tdone[17]=1;
  }

  public void thread31293(int [] tdone, int [] ends){
        S22537=1;
    active[16]=1;
    ends[16]=1;
    tdone[16]=1;
  }

  public void thread31292(int [] tdone, int [] ends){
        S22550=1;
    S22549=0;
    thread31293(tdone,ends);
    thread31294(tdone,ends);
    int biggest31295 = 0;
    if(ends[16]>=biggest31295){
      biggest31295=ends[16];
    }
    if(ends[17]>=biggest31295){
      biggest31295=ends[17];
    }
    if(biggest31295 == 1){
      active[15]=1;
      ends[15]=1;
      tdone[15]=1;
    }
  }

  public void thread31291(int [] tdone, int [] ends){
        S22534=1;
    cylPos5ZAxisExtend.setPresent();//sysj\controller.sysj line: 183, column: 7
    currsigs.addElement(cylPos5ZAxisExtend);
    active[14]=1;
    ends[14]=1;
    tdone[14]=1;
  }

  public void thread31290(int [] tdone, int [] ends){
        S22528=1;
    cylClampBottleExtend.setPresent();//sysj\controller.sysj line: 177, column: 7
    currsigs.addElement(cylClampBottleExtend);
    active[13]=1;
    ends[13]=1;
    tdone[13]=1;
  }

  public void thread31288(int [] tdone, int [] ends){
        S22563=1;
    S22560=0;
    active[18]=1;
    ends[18]=1;
    tdone[18]=1;
  }

  public void thread31286(int [] tdone, int [] ends){
        S22540=1;
    active[17]=1;
    ends[17]=1;
    tdone[17]=1;
  }

  public void thread31285(int [] tdone, int [] ends){
        S22537=1;
    active[16]=1;
    ends[16]=1;
    tdone[16]=1;
  }

  public void thread31284(int [] tdone, int [] ends){
        S22550=1;
    S22549=0;
    thread31285(tdone,ends);
    thread31286(tdone,ends);
    int biggest31287 = 0;
    if(ends[16]>=biggest31287){
      biggest31287=ends[16];
    }
    if(ends[17]>=biggest31287){
      biggest31287=ends[17];
    }
    if(biggest31287 == 1){
      active[15]=1;
      ends[15]=1;
      tdone[15]=1;
    }
  }

  public void thread31283(int [] tdone, int [] ends){
        S22534=1;
    cylPos5ZAxisExtend.setPresent();//sysj\controller.sysj line: 183, column: 7
    currsigs.addElement(cylPos5ZAxisExtend);
    active[14]=1;
    ends[14]=1;
    tdone[14]=1;
  }

  public void thread31282(int [] tdone, int [] ends){
        S22528=1;
    cylClampBottleExtend.setPresent();//sysj\controller.sysj line: 177, column: 7
    currsigs.addElement(cylClampBottleExtend);
    active[13]=1;
    ends[13]=1;
    tdone[13]=1;
  }

  public void thread31280(int [] tdone, int [] ends){
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

  public void thread31278(int [] tdone, int [] ends){
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

  public void thread31277(int [] tdone, int [] ends){
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

  public void thread31276(int [] tdone, int [] ends){
        switch(S22550){
      case 0 : 
        active[15]=0;
        ends[15]=0;
        tdone[15]=1;
        break;
      
      case 1 : 
        switch(S22549){
          case 0 : 
            thread31277(tdone,ends);
            thread31278(tdone,ends);
            int biggest31279 = 0;
            if(ends[16]>=biggest31279){
              biggest31279=ends[16];
            }
            if(ends[17]>=biggest31279){
              biggest31279=ends[17];
            }
            if(biggest31279 == 1){
              active[15]=1;
              ends[15]=1;
              tdone[15]=1;
            }
            //FINXME code
            if(biggest31279 == 0){
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

  public void thread31275(int [] tdone, int [] ends){
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

  public void thread31274(int [] tdone, int [] ends){
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

  public void thread31272(int [] tdone, int [] ends){
        S22563=1;
    S22560=0;
    active[18]=1;
    ends[18]=1;
    tdone[18]=1;
  }

  public void thread31270(int [] tdone, int [] ends){
        S22540=1;
    active[17]=1;
    ends[17]=1;
    tdone[17]=1;
  }

  public void thread31269(int [] tdone, int [] ends){
        S22537=1;
    active[16]=1;
    ends[16]=1;
    tdone[16]=1;
  }

  public void thread31268(int [] tdone, int [] ends){
        S22550=1;
    S22549=0;
    thread31269(tdone,ends);
    thread31270(tdone,ends);
    int biggest31271 = 0;
    if(ends[16]>=biggest31271){
      biggest31271=ends[16];
    }
    if(ends[17]>=biggest31271){
      biggest31271=ends[17];
    }
    if(biggest31271 == 1){
      active[15]=1;
      ends[15]=1;
      tdone[15]=1;
    }
  }

  public void thread31267(int [] tdone, int [] ends){
        S22534=1;
    cylPos5ZAxisExtend.setPresent();//sysj\controller.sysj line: 183, column: 7
    currsigs.addElement(cylPos5ZAxisExtend);
    active[14]=1;
    ends[14]=1;
    tdone[14]=1;
  }

  public void thread31266(int [] tdone, int [] ends){
        S22528=1;
    cylClampBottleExtend.setPresent();//sysj\controller.sysj line: 177, column: 7
    currsigs.addElement(cylClampBottleExtend);
    active[13]=1;
    ends[13]=1;
    tdone[13]=1;
  }

  public void thread31264(int [] tdone, int [] ends){
        S22563=1;
    S22560=0;
    active[18]=1;
    ends[18]=1;
    tdone[18]=1;
  }

  public void thread31262(int [] tdone, int [] ends){
        S22540=1;
    active[17]=1;
    ends[17]=1;
    tdone[17]=1;
  }

  public void thread31261(int [] tdone, int [] ends){
        S22537=1;
    active[16]=1;
    ends[16]=1;
    tdone[16]=1;
  }

  public void thread31260(int [] tdone, int [] ends){
        S22550=1;
    S22549=0;
    thread31261(tdone,ends);
    thread31262(tdone,ends);
    int biggest31263 = 0;
    if(ends[16]>=biggest31263){
      biggest31263=ends[16];
    }
    if(ends[17]>=biggest31263){
      biggest31263=ends[17];
    }
    if(biggest31263 == 1){
      active[15]=1;
      ends[15]=1;
      tdone[15]=1;
    }
  }

  public void thread31259(int [] tdone, int [] ends){
        S22534=1;
    cylPos5ZAxisExtend.setPresent();//sysj\controller.sysj line: 183, column: 7
    currsigs.addElement(cylPos5ZAxisExtend);
    active[14]=1;
    ends[14]=1;
    tdone[14]=1;
  }

  public void thread31258(int [] tdone, int [] ends){
        S22528=1;
    cylClampBottleExtend.setPresent();//sysj\controller.sysj line: 177, column: 7
    currsigs.addElement(cylClampBottleExtend);
    active[13]=1;
    ends[13]=1;
    tdone[13]=1;
  }

  public void thread31256(int [] tdone, int [] ends){
        S22563=1;
    S22560=0;
    active[18]=1;
    ends[18]=1;
    tdone[18]=1;
  }

  public void thread31254(int [] tdone, int [] ends){
        S22540=1;
    active[17]=1;
    ends[17]=1;
    tdone[17]=1;
  }

  public void thread31253(int [] tdone, int [] ends){
        S22537=1;
    active[16]=1;
    ends[16]=1;
    tdone[16]=1;
  }

  public void thread31252(int [] tdone, int [] ends){
        S22550=1;
    S22549=0;
    thread31253(tdone,ends);
    thread31254(tdone,ends);
    int biggest31255 = 0;
    if(ends[16]>=biggest31255){
      biggest31255=ends[16];
    }
    if(ends[17]>=biggest31255){
      biggest31255=ends[17];
    }
    if(biggest31255 == 1){
      active[15]=1;
      ends[15]=1;
      tdone[15]=1;
    }
  }

  public void thread31251(int [] tdone, int [] ends){
        S22534=1;
    cylPos5ZAxisExtend.setPresent();//sysj\controller.sysj line: 183, column: 7
    currsigs.addElement(cylPos5ZAxisExtend);
    active[14]=1;
    ends[14]=1;
    tdone[14]=1;
  }

  public void thread31250(int [] tdone, int [] ends){
        S22528=1;
    cylClampBottleExtend.setPresent();//sysj\controller.sysj line: 177, column: 7
    currsigs.addElement(cylClampBottleExtend);
    active[13]=1;
    ends[13]=1;
    tdone[13]=1;
  }

  public void thread31248(int [] tdone, int [] ends){
        S22563=1;
    S22560=0;
    active[18]=1;
    ends[18]=1;
    tdone[18]=1;
  }

  public void thread31246(int [] tdone, int [] ends){
        S22540=1;
    active[17]=1;
    ends[17]=1;
    tdone[17]=1;
  }

  public void thread31245(int [] tdone, int [] ends){
        S22537=1;
    active[16]=1;
    ends[16]=1;
    tdone[16]=1;
  }

  public void thread31244(int [] tdone, int [] ends){
        S22550=1;
    S22549=0;
    thread31245(tdone,ends);
    thread31246(tdone,ends);
    int biggest31247 = 0;
    if(ends[16]>=biggest31247){
      biggest31247=ends[16];
    }
    if(ends[17]>=biggest31247){
      biggest31247=ends[17];
    }
    if(biggest31247 == 1){
      active[15]=1;
      ends[15]=1;
      tdone[15]=1;
    }
  }

  public void thread31243(int [] tdone, int [] ends){
        S22534=1;
    cylPos5ZAxisExtend.setPresent();//sysj\controller.sysj line: 183, column: 7
    currsigs.addElement(cylPos5ZAxisExtend);
    active[14]=1;
    ends[14]=1;
    tdone[14]=1;
  }

  public void thread31242(int [] tdone, int [] ends){
        S22528=1;
    cylClampBottleExtend.setPresent();//sysj\controller.sysj line: 177, column: 7
    currsigs.addElement(cylClampBottleExtend);
    active[13]=1;
    ends[13]=1;
    tdone[13]=1;
  }

  public void thread31240(int [] tdone, int [] ends){
        S22563=1;
    S22560=0;
    active[18]=1;
    ends[18]=1;
    tdone[18]=1;
  }

  public void thread31238(int [] tdone, int [] ends){
        S22540=1;
    active[17]=1;
    ends[17]=1;
    tdone[17]=1;
  }

  public void thread31237(int [] tdone, int [] ends){
        S22537=1;
    active[16]=1;
    ends[16]=1;
    tdone[16]=1;
  }

  public void thread31236(int [] tdone, int [] ends){
        S22550=1;
    S22549=0;
    thread31237(tdone,ends);
    thread31238(tdone,ends);
    int biggest31239 = 0;
    if(ends[16]>=biggest31239){
      biggest31239=ends[16];
    }
    if(ends[17]>=biggest31239){
      biggest31239=ends[17];
    }
    if(biggest31239 == 1){
      active[15]=1;
      ends[15]=1;
      tdone[15]=1;
    }
  }

  public void thread31235(int [] tdone, int [] ends){
        S22534=1;
    cylPos5ZAxisExtend.setPresent();//sysj\controller.sysj line: 183, column: 7
    currsigs.addElement(cylPos5ZAxisExtend);
    active[14]=1;
    ends[14]=1;
    tdone[14]=1;
  }

  public void thread31234(int [] tdone, int [] ends){
        S22528=1;
    cylClampBottleExtend.setPresent();//sysj\controller.sysj line: 177, column: 7
    currsigs.addElement(cylClampBottleExtend);
    active[13]=1;
    ends[13]=1;
    tdone[13]=1;
  }

  public void thread31232(int [] tdone, int [] ends){
        S22563=1;
    S22560=0;
    active[18]=1;
    ends[18]=1;
    tdone[18]=1;
  }

  public void thread31230(int [] tdone, int [] ends){
        S22540=1;
    active[17]=1;
    ends[17]=1;
    tdone[17]=1;
  }

  public void thread31229(int [] tdone, int [] ends){
        S22537=1;
    active[16]=1;
    ends[16]=1;
    tdone[16]=1;
  }

  public void thread31228(int [] tdone, int [] ends){
        S22550=1;
    S22549=0;
    thread31229(tdone,ends);
    thread31230(tdone,ends);
    int biggest31231 = 0;
    if(ends[16]>=biggest31231){
      biggest31231=ends[16];
    }
    if(ends[17]>=biggest31231){
      biggest31231=ends[17];
    }
    if(biggest31231 == 1){
      active[15]=1;
      ends[15]=1;
      tdone[15]=1;
    }
  }

  public void thread31227(int [] tdone, int [] ends){
        S22534=1;
    cylPos5ZAxisExtend.setPresent();//sysj\controller.sysj line: 183, column: 7
    currsigs.addElement(cylPos5ZAxisExtend);
    active[14]=1;
    ends[14]=1;
    tdone[14]=1;
  }

  public void thread31226(int [] tdone, int [] ends){
        S22528=1;
    cylClampBottleExtend.setPresent();//sysj\controller.sysj line: 177, column: 7
    currsigs.addElement(cylClampBottleExtend);
    active[13]=1;
    ends[13]=1;
    tdone[13]=1;
  }

  public void thread31224(int [] tdone, int [] ends){
        S22563=1;
    S22560=0;
    active[18]=1;
    ends[18]=1;
    tdone[18]=1;
  }

  public void thread31222(int [] tdone, int [] ends){
        S22540=1;
    active[17]=1;
    ends[17]=1;
    tdone[17]=1;
  }

  public void thread31221(int [] tdone, int [] ends){
        S22537=1;
    active[16]=1;
    ends[16]=1;
    tdone[16]=1;
  }

  public void thread31220(int [] tdone, int [] ends){
        S22550=1;
    S22549=0;
    thread31221(tdone,ends);
    thread31222(tdone,ends);
    int biggest31223 = 0;
    if(ends[16]>=biggest31223){
      biggest31223=ends[16];
    }
    if(ends[17]>=biggest31223){
      biggest31223=ends[17];
    }
    if(biggest31223 == 1){
      active[15]=1;
      ends[15]=1;
      tdone[15]=1;
    }
  }

  public void thread31219(int [] tdone, int [] ends){
        S22534=1;
    cylPos5ZAxisExtend.setPresent();//sysj\controller.sysj line: 183, column: 7
    currsigs.addElement(cylPos5ZAxisExtend);
    active[14]=1;
    ends[14]=1;
    tdone[14]=1;
  }

  public void thread31218(int [] tdone, int [] ends){
        S22528=1;
    cylClampBottleExtend.setPresent();//sysj\controller.sysj line: 177, column: 7
    currsigs.addElement(cylClampBottleExtend);
    active[13]=1;
    ends[13]=1;
    tdone[13]=1;
  }

  public void thread31216(int [] tdone, int [] ends){
        S22563=1;
    S22560=0;
    active[18]=1;
    ends[18]=1;
    tdone[18]=1;
  }

  public void thread31214(int [] tdone, int [] ends){
        S22540=1;
    active[17]=1;
    ends[17]=1;
    tdone[17]=1;
  }

  public void thread31213(int [] tdone, int [] ends){
        S22537=1;
    active[16]=1;
    ends[16]=1;
    tdone[16]=1;
  }

  public void thread31212(int [] tdone, int [] ends){
        S22550=1;
    S22549=0;
    thread31213(tdone,ends);
    thread31214(tdone,ends);
    int biggest31215 = 0;
    if(ends[16]>=biggest31215){
      biggest31215=ends[16];
    }
    if(ends[17]>=biggest31215){
      biggest31215=ends[17];
    }
    if(biggest31215 == 1){
      active[15]=1;
      ends[15]=1;
      tdone[15]=1;
    }
  }

  public void thread31211(int [] tdone, int [] ends){
        S22534=1;
    cylPos5ZAxisExtend.setPresent();//sysj\controller.sysj line: 183, column: 7
    currsigs.addElement(cylPos5ZAxisExtend);
    active[14]=1;
    ends[14]=1;
    tdone[14]=1;
  }

  public void thread31210(int [] tdone, int [] ends){
        S22528=1;
    cylClampBottleExtend.setPresent();//sysj\controller.sysj line: 177, column: 7
    currsigs.addElement(cylClampBottleExtend);
    active[13]=1;
    ends[13]=1;
    tdone[13]=1;
  }

  public void thread31208(int [] tdone, int [] ends){
        S22563=1;
    S22560=0;
    active[18]=1;
    ends[18]=1;
    tdone[18]=1;
  }

  public void thread31206(int [] tdone, int [] ends){
        S22540=1;
    active[17]=1;
    ends[17]=1;
    tdone[17]=1;
  }

  public void thread31205(int [] tdone, int [] ends){
        S22537=1;
    active[16]=1;
    ends[16]=1;
    tdone[16]=1;
  }

  public void thread31204(int [] tdone, int [] ends){
        S22550=1;
    S22549=0;
    thread31205(tdone,ends);
    thread31206(tdone,ends);
    int biggest31207 = 0;
    if(ends[16]>=biggest31207){
      biggest31207=ends[16];
    }
    if(ends[17]>=biggest31207){
      biggest31207=ends[17];
    }
    if(biggest31207 == 1){
      active[15]=1;
      ends[15]=1;
      tdone[15]=1;
    }
  }

  public void thread31203(int [] tdone, int [] ends){
        S22534=1;
    cylPos5ZAxisExtend.setPresent();//sysj\controller.sysj line: 183, column: 7
    currsigs.addElement(cylPos5ZAxisExtend);
    active[14]=1;
    ends[14]=1;
    tdone[14]=1;
  }

  public void thread31202(int [] tdone, int [] ends){
        S22528=1;
    cylClampBottleExtend.setPresent();//sysj\controller.sysj line: 177, column: 7
    currsigs.addElement(cylClampBottleExtend);
    active[13]=1;
    ends[13]=1;
    tdone[13]=1;
  }

  public void thread31200(int [] tdone, int [] ends){
        S22563=1;
    S22560=0;
    active[18]=1;
    ends[18]=1;
    tdone[18]=1;
  }

  public void thread31198(int [] tdone, int [] ends){
        S22540=1;
    active[17]=1;
    ends[17]=1;
    tdone[17]=1;
  }

  public void thread31197(int [] tdone, int [] ends){
        S22537=1;
    active[16]=1;
    ends[16]=1;
    tdone[16]=1;
  }

  public void thread31196(int [] tdone, int [] ends){
        S22550=1;
    S22549=0;
    thread31197(tdone,ends);
    thread31198(tdone,ends);
    int biggest31199 = 0;
    if(ends[16]>=biggest31199){
      biggest31199=ends[16];
    }
    if(ends[17]>=biggest31199){
      biggest31199=ends[17];
    }
    if(biggest31199 == 1){
      active[15]=1;
      ends[15]=1;
      tdone[15]=1;
    }
  }

  public void thread31195(int [] tdone, int [] ends){
        S22534=1;
    cylPos5ZAxisExtend.setPresent();//sysj\controller.sysj line: 183, column: 7
    currsigs.addElement(cylPos5ZAxisExtend);
    active[14]=1;
    ends[14]=1;
    tdone[14]=1;
  }

  public void thread31194(int [] tdone, int [] ends){
        S22528=1;
    cylClampBottleExtend.setPresent();//sysj\controller.sysj line: 177, column: 7
    currsigs.addElement(cylClampBottleExtend);
    active[13]=1;
    ends[13]=1;
    tdone[13]=1;
  }

  public void thread31192(int [] tdone, int [] ends){
        S22563=1;
    S22560=0;
    active[18]=1;
    ends[18]=1;
    tdone[18]=1;
  }

  public void thread31190(int [] tdone, int [] ends){
        S22540=1;
    active[17]=1;
    ends[17]=1;
    tdone[17]=1;
  }

  public void thread31189(int [] tdone, int [] ends){
        S22537=1;
    active[16]=1;
    ends[16]=1;
    tdone[16]=1;
  }

  public void thread31188(int [] tdone, int [] ends){
        S22550=1;
    S22549=0;
    thread31189(tdone,ends);
    thread31190(tdone,ends);
    int biggest31191 = 0;
    if(ends[16]>=biggest31191){
      biggest31191=ends[16];
    }
    if(ends[17]>=biggest31191){
      biggest31191=ends[17];
    }
    if(biggest31191 == 1){
      active[15]=1;
      ends[15]=1;
      tdone[15]=1;
    }
  }

  public void thread31187(int [] tdone, int [] ends){
        S22534=1;
    cylPos5ZAxisExtend.setPresent();//sysj\controller.sysj line: 183, column: 7
    currsigs.addElement(cylPos5ZAxisExtend);
    active[14]=1;
    ends[14]=1;
    tdone[14]=1;
  }

  public void thread31186(int [] tdone, int [] ends){
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
                            thread31186(tdone,ends);
                            thread31187(tdone,ends);
                            thread31188(tdone,ends);
                            thread31192(tdone,ends);
                            int biggest31193 = 0;
                            if(ends[13]>=biggest31193){
                              biggest31193=ends[13];
                            }
                            if(ends[14]>=biggest31193){
                              biggest31193=ends[14];
                            }
                            if(ends[15]>=biggest31193){
                              biggest31193=ends[15];
                            }
                            if(ends[18]>=biggest31193){
                              biggest31193=ends[18];
                            }
                            if(biggest31193 == 1){
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
                      thread31194(tdone,ends);
                      thread31195(tdone,ends);
                      thread31196(tdone,ends);
                      thread31200(tdone,ends);
                      int biggest31201 = 0;
                      if(ends[13]>=biggest31201){
                        biggest31201=ends[13];
                      }
                      if(ends[14]>=biggest31201){
                        biggest31201=ends[14];
                      }
                      if(ends[15]>=biggest31201){
                        biggest31201=ends[15];
                      }
                      if(ends[18]>=biggest31201){
                        biggest31201=ends[18];
                      }
                      if(biggest31201 == 1){
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
                                        thread31202(tdone,ends);
                                        thread31203(tdone,ends);
                                        thread31204(tdone,ends);
                                        thread31208(tdone,ends);
                                        int biggest31209 = 0;
                                        if(ends[13]>=biggest31209){
                                          biggest31209=ends[13];
                                        }
                                        if(ends[14]>=biggest31209){
                                          biggest31209=ends[14];
                                        }
                                        if(ends[15]>=biggest31209){
                                          biggest31209=ends[15];
                                        }
                                        if(ends[18]>=biggest31209){
                                          biggest31209=ends[18];
                                        }
                                        if(biggest31209 == 1){
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
                                  thread31210(tdone,ends);
                                  thread31211(tdone,ends);
                                  thread31212(tdone,ends);
                                  thread31216(tdone,ends);
                                  int biggest31217 = 0;
                                  if(ends[13]>=biggest31217){
                                    biggest31217=ends[13];
                                  }
                                  if(ends[14]>=biggest31217){
                                    biggest31217=ends[14];
                                  }
                                  if(ends[15]>=biggest31217){
                                    biggest31217=ends[15];
                                  }
                                  if(ends[18]>=biggest31217){
                                    biggest31217=ends[18];
                                  }
                                  if(biggest31217 == 1){
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
                                      thread31218(tdone,ends);
                                      thread31219(tdone,ends);
                                      thread31220(tdone,ends);
                                      thread31224(tdone,ends);
                                      int biggest31225 = 0;
                                      if(ends[13]>=biggest31225){
                                        biggest31225=ends[13];
                                      }
                                      if(ends[14]>=biggest31225){
                                        biggest31225=ends[14];
                                      }
                                      if(ends[15]>=biggest31225){
                                        biggest31225=ends[15];
                                      }
                                      if(ends[18]>=biggest31225){
                                        biggest31225=ends[18];
                                      }
                                      if(biggest31225 == 1){
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
                                thread31226(tdone,ends);
                                thread31227(tdone,ends);
                                thread31228(tdone,ends);
                                thread31232(tdone,ends);
                                int biggest31233 = 0;
                                if(ends[13]>=biggest31233){
                                  biggest31233=ends[13];
                                }
                                if(ends[14]>=biggest31233){
                                  biggest31233=ends[14];
                                }
                                if(ends[15]>=biggest31233){
                                  biggest31233=ends[15];
                                }
                                if(ends[18]>=biggest31233){
                                  biggest31233=ends[18];
                                }
                                if(biggest31233 == 1){
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
                                    thread31234(tdone,ends);
                                    thread31235(tdone,ends);
                                    thread31236(tdone,ends);
                                    thread31240(tdone,ends);
                                    int biggest31241 = 0;
                                    if(ends[13]>=biggest31241){
                                      biggest31241=ends[13];
                                    }
                                    if(ends[14]>=biggest31241){
                                      biggest31241=ends[14];
                                    }
                                    if(ends[15]>=biggest31241){
                                      biggest31241=ends[15];
                                    }
                                    if(ends[18]>=biggest31241){
                                      biggest31241=ends[18];
                                    }
                                    if(biggest31241 == 1){
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
                              thread31242(tdone,ends);
                              thread31243(tdone,ends);
                              thread31244(tdone,ends);
                              thread31248(tdone,ends);
                              int biggest31249 = 0;
                              if(ends[13]>=biggest31249){
                                biggest31249=ends[13];
                              }
                              if(ends[14]>=biggest31249){
                                biggest31249=ends[14];
                              }
                              if(ends[15]>=biggest31249){
                                biggest31249=ends[15];
                              }
                              if(ends[18]>=biggest31249){
                                biggest31249=ends[18];
                              }
                              if(biggest31249 == 1){
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
                                  thread31250(tdone,ends);
                                  thread31251(tdone,ends);
                                  thread31252(tdone,ends);
                                  thread31256(tdone,ends);
                                  int biggest31257 = 0;
                                  if(ends[13]>=biggest31257){
                                    biggest31257=ends[13];
                                  }
                                  if(ends[14]>=biggest31257){
                                    biggest31257=ends[14];
                                  }
                                  if(ends[15]>=biggest31257){
                                    biggest31257=ends[15];
                                  }
                                  if(ends[18]>=biggest31257){
                                    biggest31257=ends[18];
                                  }
                                  if(biggest31257 == 1){
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
                                thread31258(tdone,ends);
                                thread31259(tdone,ends);
                                thread31260(tdone,ends);
                                thread31264(tdone,ends);
                                int biggest31265 = 0;
                                if(ends[13]>=biggest31265){
                                  biggest31265=ends[13];
                                }
                                if(ends[14]>=biggest31265){
                                  biggest31265=ends[14];
                                }
                                if(ends[15]>=biggest31265){
                                  biggest31265=ends[15];
                                }
                                if(ends[18]>=biggest31265){
                                  biggest31265=ends[18];
                                }
                                if(biggest31265 == 1){
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
                              thread31266(tdone,ends);
                              thread31267(tdone,ends);
                              thread31268(tdone,ends);
                              thread31272(tdone,ends);
                              int biggest31273 = 0;
                              if(ends[13]>=biggest31273){
                                biggest31273=ends[13];
                              }
                              if(ends[14]>=biggest31273){
                                biggest31273=ends[14];
                              }
                              if(ends[15]>=biggest31273){
                                biggest31273=ends[15];
                              }
                              if(ends[18]>=biggest31273){
                                biggest31273=ends[18];
                              }
                              if(biggest31273 == 1){
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
                      thread31274(tdone,ends);
                      thread31275(tdone,ends);
                      thread31276(tdone,ends);
                      thread31280(tdone,ends);
                      int biggest31281 = 0;
                      if(ends[13]>=biggest31281){
                        biggest31281=ends[13];
                      }
                      if(ends[14]>=biggest31281){
                        biggest31281=ends[14];
                      }
                      if(ends[15]>=biggest31281){
                        biggest31281=ends[15];
                      }
                      if(ends[18]>=biggest31281){
                        biggest31281=ends[18];
                      }
                      if(biggest31281 == 1){
                        active[12]=1;
                        ends[12]=1;
                        break RUN;
                      }
                      //FINXME code
                      if(biggest31281 == 0){
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
                                thread31282(tdone,ends);
                                thread31283(tdone,ends);
                                thread31284(tdone,ends);
                                thread31288(tdone,ends);
                                int biggest31289 = 0;
                                if(ends[13]>=biggest31289){
                                  biggest31289=ends[13];
                                }
                                if(ends[14]>=biggest31289){
                                  biggest31289=ends[14];
                                }
                                if(ends[15]>=biggest31289){
                                  biggest31289=ends[15];
                                }
                                if(ends[18]>=biggest31289){
                                  biggest31289=ends[18];
                                }
                                if(biggest31289 == 1){
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
                          thread31290(tdone,ends);
                          thread31291(tdone,ends);
                          thread31292(tdone,ends);
                          thread31296(tdone,ends);
                          int biggest31297 = 0;
                          if(ends[13]>=biggest31297){
                            biggest31297=ends[13];
                          }
                          if(ends[14]>=biggest31297){
                            biggest31297=ends[14];
                          }
                          if(ends[15]>=biggest31297){
                            biggest31297=ends[15];
                          }
                          if(ends[18]>=biggest31297){
                            biggest31297=ends[18];
                          }
                          if(biggest31297 == 1){
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
