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
  private int S111239 = 1;
  private int S97823 = 1;
  private int S97807 = 1;
  private int S97802 = 1;
  private int S98937 = 1;
  private int S97938 = 1;
  private int S97830 = 1;
  private int S97825 = 1;
  private int S97852 = 1;
  private int S97847 = 1;
  private int S97944 = 1;
  private int S97950 = 1;
  private int S97966 = 1;
  private int S97965 = 1;
  private int S97953 = 1;
  private int S97956 = 1;
  private int S97979 = 1;
  private int S97976 = 1;
  private int S98701 = 1;
  private int S98696 = 1;
  private int S98921 = 1;
  private int S98916 = 1;
  
  private int[] ends = new int[23];
  private int[] tdone = new int[23];
  
  public void thread118661(int [] tdone, int [] ends){
        S97979=1;
    S97976=0;
    active[19]=1;
    ends[19]=1;
    tdone[19]=1;
  }

  public void thread118659(int [] tdone, int [] ends){
        S97956=1;
    active[18]=1;
    ends[18]=1;
    tdone[18]=1;
  }

  public void thread118658(int [] tdone, int [] ends){
        S97953=1;
    active[17]=1;
    ends[17]=1;
    tdone[17]=1;
  }

  public void thread118657(int [] tdone, int [] ends){
        S97966=1;
    S97965=0;
    thread118658(tdone,ends);
    thread118659(tdone,ends);
    int biggest118660 = 0;
    if(ends[17]>=biggest118660){
      biggest118660=ends[17];
    }
    if(ends[18]>=biggest118660){
      biggest118660=ends[18];
    }
    if(biggest118660 == 1){
      active[16]=1;
      ends[16]=1;
      tdone[16]=1;
    }
  }

  public void thread118656(int [] tdone, int [] ends){
        S97950=1;
    cylPos5ZAxisExtend.setPresent();//sysj\controller.sysj line: 214, column: 7
    currsigs.addElement(cylPos5ZAxisExtend);
    active[15]=1;
    ends[15]=1;
    tdone[15]=1;
  }

  public void thread118655(int [] tdone, int [] ends){
        S97944=1;
    cylClampBottleExtend.setPresent();//sysj\controller.sysj line: 208, column: 7
    currsigs.addElement(cylClampBottleExtend);
    active[14]=1;
    ends[14]=1;
    tdone[14]=1;
  }

  public void thread118653(int [] tdone, int [] ends){
        S97979=1;
    S97976=0;
    active[19]=1;
    ends[19]=1;
    tdone[19]=1;
  }

  public void thread118651(int [] tdone, int [] ends){
        S97956=1;
    active[18]=1;
    ends[18]=1;
    tdone[18]=1;
  }

  public void thread118650(int [] tdone, int [] ends){
        S97953=1;
    active[17]=1;
    ends[17]=1;
    tdone[17]=1;
  }

  public void thread118649(int [] tdone, int [] ends){
        S97966=1;
    S97965=0;
    thread118650(tdone,ends);
    thread118651(tdone,ends);
    int biggest118652 = 0;
    if(ends[17]>=biggest118652){
      biggest118652=ends[17];
    }
    if(ends[18]>=biggest118652){
      biggest118652=ends[18];
    }
    if(biggest118652 == 1){
      active[16]=1;
      ends[16]=1;
      tdone[16]=1;
    }
  }

  public void thread118648(int [] tdone, int [] ends){
        S97950=1;
    cylPos5ZAxisExtend.setPresent();//sysj\controller.sysj line: 214, column: 7
    currsigs.addElement(cylPos5ZAxisExtend);
    active[15]=1;
    ends[15]=1;
    tdone[15]=1;
  }

  public void thread118647(int [] tdone, int [] ends){
        S97944=1;
    cylClampBottleExtend.setPresent();//sysj\controller.sysj line: 208, column: 7
    currsigs.addElement(cylClampBottleExtend);
    active[14]=1;
    ends[14]=1;
    tdone[14]=1;
  }

  public void thread118645(int [] tdone, int [] ends){
        switch(S97979){
      case 0 : 
        active[19]=0;
        ends[19]=0;
        tdone[19]=1;
        break;
      
      case 1 : 
        switch(S97976){
          case 0 : 
            if(gripperGrippedCap.getprestatus()){//sysj\controller.sysj line: 227, column: 12
              S97976=1;
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
              S97979=0;
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

  public void thread118643(int [] tdone, int [] ends){
        switch(S97956){
      case 0 : 
        active[18]=0;
        ends[18]=0;
        tdone[18]=1;
        break;
      
      case 1 : 
        if(cylClampedBottle.getprestatus()){//sysj\controller.sysj line: 220, column: 46
          S97956=0;
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

  public void thread118642(int [] tdone, int [] ends){
        switch(S97953){
      case 0 : 
        active[17]=0;
        ends[17]=0;
        tdone[17]=1;
        break;
      
      case 1 : 
        if(gripperZAxisLowered.getprestatus()){//sysj\controller.sysj line: 220, column: 13
          S97953=0;
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

  public void thread118641(int [] tdone, int [] ends){
        switch(S97966){
      case 0 : 
        active[16]=0;
        ends[16]=0;
        tdone[16]=1;
        break;
      
      case 1 : 
        switch(S97965){
          case 0 : 
            thread118642(tdone,ends);
            thread118643(tdone,ends);
            int biggest118644 = 0;
            if(ends[17]>=biggest118644){
              biggest118644=ends[17];
            }
            if(ends[18]>=biggest118644){
              biggest118644=ends[18];
            }
            if(biggest118644 == 1){
              active[16]=1;
              ends[16]=1;
              tdone[16]=1;
            }
            //FINXME code
            if(biggest118644 == 0){
              S97965=1;
              capGripperPos5Extend.setPresent();//sysj\controller.sysj line: 222, column: 7
              currsigs.addElement(capGripperPos5Extend);
              active[16]=1;
              ends[16]=1;
              tdone[16]=1;
            }
            break;
          
          case 1 : 
            if(releaseCap_13.getprestatus()){//sysj\controller.sysj line: 221, column: 12
              S97966=0;
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

  public void thread118640(int [] tdone, int [] ends){
        switch(S97950){
      case 0 : 
        active[15]=0;
        ends[15]=0;
        tdone[15]=1;
        break;
      
      case 1 : 
        if(raiseGripper_13.getprestatus()){//sysj\controller.sysj line: 213, column: 12
          S97950=0;
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

  public void thread118639(int [] tdone, int [] ends){
        switch(S97944){
      case 0 : 
        active[14]=0;
        ends[14]=0;
        tdone[14]=1;
        break;
      
      case 1 : 
        if(unclampBottle_13.getprestatus()){//sysj\controller.sysj line: 207, column: 13
          S97944=0;
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

  public void thread118637(int [] tdone, int [] ends){
        S97979=1;
    S97976=0;
    active[19]=1;
    ends[19]=1;
    tdone[19]=1;
  }

  public void thread118635(int [] tdone, int [] ends){
        S97956=1;
    active[18]=1;
    ends[18]=1;
    tdone[18]=1;
  }

  public void thread118634(int [] tdone, int [] ends){
        S97953=1;
    active[17]=1;
    ends[17]=1;
    tdone[17]=1;
  }

  public void thread118633(int [] tdone, int [] ends){
        S97966=1;
    S97965=0;
    thread118634(tdone,ends);
    thread118635(tdone,ends);
    int biggest118636 = 0;
    if(ends[17]>=biggest118636){
      biggest118636=ends[17];
    }
    if(ends[18]>=biggest118636){
      biggest118636=ends[18];
    }
    if(biggest118636 == 1){
      active[16]=1;
      ends[16]=1;
      tdone[16]=1;
    }
  }

  public void thread118632(int [] tdone, int [] ends){
        S97950=1;
    cylPos5ZAxisExtend.setPresent();//sysj\controller.sysj line: 214, column: 7
    currsigs.addElement(cylPos5ZAxisExtend);
    active[15]=1;
    ends[15]=1;
    tdone[15]=1;
  }

  public void thread118631(int [] tdone, int [] ends){
        S97944=1;
    cylClampBottleExtend.setPresent();//sysj\controller.sysj line: 208, column: 7
    currsigs.addElement(cylClampBottleExtend);
    active[14]=1;
    ends[14]=1;
    tdone[14]=1;
  }

  public void thread118629(int [] tdone, int [] ends){
        S97979=1;
    S97976=0;
    active[19]=1;
    ends[19]=1;
    tdone[19]=1;
  }

  public void thread118627(int [] tdone, int [] ends){
        S97956=1;
    active[18]=1;
    ends[18]=1;
    tdone[18]=1;
  }

  public void thread118626(int [] tdone, int [] ends){
        S97953=1;
    active[17]=1;
    ends[17]=1;
    tdone[17]=1;
  }

  public void thread118625(int [] tdone, int [] ends){
        S97966=1;
    S97965=0;
    thread118626(tdone,ends);
    thread118627(tdone,ends);
    int biggest118628 = 0;
    if(ends[17]>=biggest118628){
      biggest118628=ends[17];
    }
    if(ends[18]>=biggest118628){
      biggest118628=ends[18];
    }
    if(biggest118628 == 1){
      active[16]=1;
      ends[16]=1;
      tdone[16]=1;
    }
  }

  public void thread118624(int [] tdone, int [] ends){
        S97950=1;
    cylPos5ZAxisExtend.setPresent();//sysj\controller.sysj line: 214, column: 7
    currsigs.addElement(cylPos5ZAxisExtend);
    active[15]=1;
    ends[15]=1;
    tdone[15]=1;
  }

  public void thread118623(int [] tdone, int [] ends){
        S97944=1;
    cylClampBottleExtend.setPresent();//sysj\controller.sysj line: 208, column: 7
    currsigs.addElement(cylClampBottleExtend);
    active[14]=1;
    ends[14]=1;
    tdone[14]=1;
  }

  public void thread118621(int [] tdone, int [] ends){
        S97979=1;
    S97976=0;
    active[19]=1;
    ends[19]=1;
    tdone[19]=1;
  }

  public void thread118619(int [] tdone, int [] ends){
        S97956=1;
    active[18]=1;
    ends[18]=1;
    tdone[18]=1;
  }

  public void thread118618(int [] tdone, int [] ends){
        S97953=1;
    active[17]=1;
    ends[17]=1;
    tdone[17]=1;
  }

  public void thread118617(int [] tdone, int [] ends){
        S97966=1;
    S97965=0;
    thread118618(tdone,ends);
    thread118619(tdone,ends);
    int biggest118620 = 0;
    if(ends[17]>=biggest118620){
      biggest118620=ends[17];
    }
    if(ends[18]>=biggest118620){
      biggest118620=ends[18];
    }
    if(biggest118620 == 1){
      active[16]=1;
      ends[16]=1;
      tdone[16]=1;
    }
  }

  public void thread118616(int [] tdone, int [] ends){
        S97950=1;
    cylPos5ZAxisExtend.setPresent();//sysj\controller.sysj line: 214, column: 7
    currsigs.addElement(cylPos5ZAxisExtend);
    active[15]=1;
    ends[15]=1;
    tdone[15]=1;
  }

  public void thread118615(int [] tdone, int [] ends){
        S97944=1;
    cylClampBottleExtend.setPresent();//sysj\controller.sysj line: 208, column: 7
    currsigs.addElement(cylClampBottleExtend);
    active[14]=1;
    ends[14]=1;
    tdone[14]=1;
  }

  public void thread118613(int [] tdone, int [] ends){
        S97979=1;
    S97976=0;
    active[19]=1;
    ends[19]=1;
    tdone[19]=1;
  }

  public void thread118611(int [] tdone, int [] ends){
        S97956=1;
    active[18]=1;
    ends[18]=1;
    tdone[18]=1;
  }

  public void thread118610(int [] tdone, int [] ends){
        S97953=1;
    active[17]=1;
    ends[17]=1;
    tdone[17]=1;
  }

  public void thread118609(int [] tdone, int [] ends){
        S97966=1;
    S97965=0;
    thread118610(tdone,ends);
    thread118611(tdone,ends);
    int biggest118612 = 0;
    if(ends[17]>=biggest118612){
      biggest118612=ends[17];
    }
    if(ends[18]>=biggest118612){
      biggest118612=ends[18];
    }
    if(biggest118612 == 1){
      active[16]=1;
      ends[16]=1;
      tdone[16]=1;
    }
  }

  public void thread118608(int [] tdone, int [] ends){
        S97950=1;
    cylPos5ZAxisExtend.setPresent();//sysj\controller.sysj line: 214, column: 7
    currsigs.addElement(cylPos5ZAxisExtend);
    active[15]=1;
    ends[15]=1;
    tdone[15]=1;
  }

  public void thread118607(int [] tdone, int [] ends){
        S97944=1;
    cylClampBottleExtend.setPresent();//sysj\controller.sysj line: 208, column: 7
    currsigs.addElement(cylClampBottleExtend);
    active[14]=1;
    ends[14]=1;
    tdone[14]=1;
  }

  public void thread118605(int [] tdone, int [] ends){
        S97979=1;
    S97976=0;
    active[19]=1;
    ends[19]=1;
    tdone[19]=1;
  }

  public void thread118603(int [] tdone, int [] ends){
        S97956=1;
    active[18]=1;
    ends[18]=1;
    tdone[18]=1;
  }

  public void thread118602(int [] tdone, int [] ends){
        S97953=1;
    active[17]=1;
    ends[17]=1;
    tdone[17]=1;
  }

  public void thread118601(int [] tdone, int [] ends){
        S97966=1;
    S97965=0;
    thread118602(tdone,ends);
    thread118603(tdone,ends);
    int biggest118604 = 0;
    if(ends[17]>=biggest118604){
      biggest118604=ends[17];
    }
    if(ends[18]>=biggest118604){
      biggest118604=ends[18];
    }
    if(biggest118604 == 1){
      active[16]=1;
      ends[16]=1;
      tdone[16]=1;
    }
  }

  public void thread118600(int [] tdone, int [] ends){
        S97950=1;
    cylPos5ZAxisExtend.setPresent();//sysj\controller.sysj line: 214, column: 7
    currsigs.addElement(cylPos5ZAxisExtend);
    active[15]=1;
    ends[15]=1;
    tdone[15]=1;
  }

  public void thread118599(int [] tdone, int [] ends){
        S97944=1;
    cylClampBottleExtend.setPresent();//sysj\controller.sysj line: 208, column: 7
    currsigs.addElement(cylClampBottleExtend);
    active[14]=1;
    ends[14]=1;
    tdone[14]=1;
  }

  public void thread118597(int [] tdone, int [] ends){
        S97979=1;
    S97976=0;
    active[19]=1;
    ends[19]=1;
    tdone[19]=1;
  }

  public void thread118595(int [] tdone, int [] ends){
        S97956=1;
    active[18]=1;
    ends[18]=1;
    tdone[18]=1;
  }

  public void thread118594(int [] tdone, int [] ends){
        S97953=1;
    active[17]=1;
    ends[17]=1;
    tdone[17]=1;
  }

  public void thread118593(int [] tdone, int [] ends){
        S97966=1;
    S97965=0;
    thread118594(tdone,ends);
    thread118595(tdone,ends);
    int biggest118596 = 0;
    if(ends[17]>=biggest118596){
      biggest118596=ends[17];
    }
    if(ends[18]>=biggest118596){
      biggest118596=ends[18];
    }
    if(biggest118596 == 1){
      active[16]=1;
      ends[16]=1;
      tdone[16]=1;
    }
  }

  public void thread118592(int [] tdone, int [] ends){
        S97950=1;
    cylPos5ZAxisExtend.setPresent();//sysj\controller.sysj line: 214, column: 7
    currsigs.addElement(cylPos5ZAxisExtend);
    active[15]=1;
    ends[15]=1;
    tdone[15]=1;
  }

  public void thread118591(int [] tdone, int [] ends){
        S97944=1;
    cylClampBottleExtend.setPresent();//sysj\controller.sysj line: 208, column: 7
    currsigs.addElement(cylClampBottleExtend);
    active[14]=1;
    ends[14]=1;
    tdone[14]=1;
  }

  public void thread118589(int [] tdone, int [] ends){
        S97979=1;
    S97976=0;
    active[19]=1;
    ends[19]=1;
    tdone[19]=1;
  }

  public void thread118587(int [] tdone, int [] ends){
        S97956=1;
    active[18]=1;
    ends[18]=1;
    tdone[18]=1;
  }

  public void thread118586(int [] tdone, int [] ends){
        S97953=1;
    active[17]=1;
    ends[17]=1;
    tdone[17]=1;
  }

  public void thread118585(int [] tdone, int [] ends){
        S97966=1;
    S97965=0;
    thread118586(tdone,ends);
    thread118587(tdone,ends);
    int biggest118588 = 0;
    if(ends[17]>=biggest118588){
      biggest118588=ends[17];
    }
    if(ends[18]>=biggest118588){
      biggest118588=ends[18];
    }
    if(biggest118588 == 1){
      active[16]=1;
      ends[16]=1;
      tdone[16]=1;
    }
  }

  public void thread118584(int [] tdone, int [] ends){
        S97950=1;
    cylPos5ZAxisExtend.setPresent();//sysj\controller.sysj line: 214, column: 7
    currsigs.addElement(cylPos5ZAxisExtend);
    active[15]=1;
    ends[15]=1;
    tdone[15]=1;
  }

  public void thread118583(int [] tdone, int [] ends){
        S97944=1;
    cylClampBottleExtend.setPresent();//sysj\controller.sysj line: 208, column: 7
    currsigs.addElement(cylClampBottleExtend);
    active[14]=1;
    ends[14]=1;
    tdone[14]=1;
  }

  public void thread118581(int [] tdone, int [] ends){
        S97979=1;
    S97976=0;
    active[19]=1;
    ends[19]=1;
    tdone[19]=1;
  }

  public void thread118579(int [] tdone, int [] ends){
        S97956=1;
    active[18]=1;
    ends[18]=1;
    tdone[18]=1;
  }

  public void thread118578(int [] tdone, int [] ends){
        S97953=1;
    active[17]=1;
    ends[17]=1;
    tdone[17]=1;
  }

  public void thread118577(int [] tdone, int [] ends){
        S97966=1;
    S97965=0;
    thread118578(tdone,ends);
    thread118579(tdone,ends);
    int biggest118580 = 0;
    if(ends[17]>=biggest118580){
      biggest118580=ends[17];
    }
    if(ends[18]>=biggest118580){
      biggest118580=ends[18];
    }
    if(biggest118580 == 1){
      active[16]=1;
      ends[16]=1;
      tdone[16]=1;
    }
  }

  public void thread118576(int [] tdone, int [] ends){
        S97950=1;
    cylPos5ZAxisExtend.setPresent();//sysj\controller.sysj line: 214, column: 7
    currsigs.addElement(cylPos5ZAxisExtend);
    active[15]=1;
    ends[15]=1;
    tdone[15]=1;
  }

  public void thread118575(int [] tdone, int [] ends){
        S97944=1;
    cylClampBottleExtend.setPresent();//sysj\controller.sysj line: 208, column: 7
    currsigs.addElement(cylClampBottleExtend);
    active[14]=1;
    ends[14]=1;
    tdone[14]=1;
  }

  public void thread118573(int [] tdone, int [] ends){
        S97979=1;
    S97976=0;
    active[19]=1;
    ends[19]=1;
    tdone[19]=1;
  }

  public void thread118571(int [] tdone, int [] ends){
        S97956=1;
    active[18]=1;
    ends[18]=1;
    tdone[18]=1;
  }

  public void thread118570(int [] tdone, int [] ends){
        S97953=1;
    active[17]=1;
    ends[17]=1;
    tdone[17]=1;
  }

  public void thread118569(int [] tdone, int [] ends){
        S97966=1;
    S97965=0;
    thread118570(tdone,ends);
    thread118571(tdone,ends);
    int biggest118572 = 0;
    if(ends[17]>=biggest118572){
      biggest118572=ends[17];
    }
    if(ends[18]>=biggest118572){
      biggest118572=ends[18];
    }
    if(biggest118572 == 1){
      active[16]=1;
      ends[16]=1;
      tdone[16]=1;
    }
  }

  public void thread118568(int [] tdone, int [] ends){
        S97950=1;
    cylPos5ZAxisExtend.setPresent();//sysj\controller.sysj line: 214, column: 7
    currsigs.addElement(cylPos5ZAxisExtend);
    active[15]=1;
    ends[15]=1;
    tdone[15]=1;
  }

  public void thread118567(int [] tdone, int [] ends){
        S97944=1;
    cylClampBottleExtend.setPresent();//sysj\controller.sysj line: 208, column: 7
    currsigs.addElement(cylClampBottleExtend);
    active[14]=1;
    ends[14]=1;
    tdone[14]=1;
  }

  public void thread118565(int [] tdone, int [] ends){
        S97979=1;
    S97976=0;
    active[19]=1;
    ends[19]=1;
    tdone[19]=1;
  }

  public void thread118563(int [] tdone, int [] ends){
        S97956=1;
    active[18]=1;
    ends[18]=1;
    tdone[18]=1;
  }

  public void thread118562(int [] tdone, int [] ends){
        S97953=1;
    active[17]=1;
    ends[17]=1;
    tdone[17]=1;
  }

  public void thread118561(int [] tdone, int [] ends){
        S97966=1;
    S97965=0;
    thread118562(tdone,ends);
    thread118563(tdone,ends);
    int biggest118564 = 0;
    if(ends[17]>=biggest118564){
      biggest118564=ends[17];
    }
    if(ends[18]>=biggest118564){
      biggest118564=ends[18];
    }
    if(biggest118564 == 1){
      active[16]=1;
      ends[16]=1;
      tdone[16]=1;
    }
  }

  public void thread118560(int [] tdone, int [] ends){
        S97950=1;
    cylPos5ZAxisExtend.setPresent();//sysj\controller.sysj line: 214, column: 7
    currsigs.addElement(cylPos5ZAxisExtend);
    active[15]=1;
    ends[15]=1;
    tdone[15]=1;
  }

  public void thread118559(int [] tdone, int [] ends){
        S97944=1;
    cylClampBottleExtend.setPresent();//sysj\controller.sysj line: 208, column: 7
    currsigs.addElement(cylClampBottleExtend);
    active[14]=1;
    ends[14]=1;
    tdone[14]=1;
  }

  public void thread118557(int [] tdone, int [] ends){
        S97979=1;
    S97976=0;
    active[19]=1;
    ends[19]=1;
    tdone[19]=1;
  }

  public void thread118555(int [] tdone, int [] ends){
        S97956=1;
    active[18]=1;
    ends[18]=1;
    tdone[18]=1;
  }

  public void thread118554(int [] tdone, int [] ends){
        S97953=1;
    active[17]=1;
    ends[17]=1;
    tdone[17]=1;
  }

  public void thread118553(int [] tdone, int [] ends){
        S97966=1;
    S97965=0;
    thread118554(tdone,ends);
    thread118555(tdone,ends);
    int biggest118556 = 0;
    if(ends[17]>=biggest118556){
      biggest118556=ends[17];
    }
    if(ends[18]>=biggest118556){
      biggest118556=ends[18];
    }
    if(biggest118556 == 1){
      active[16]=1;
      ends[16]=1;
      tdone[16]=1;
    }
  }

  public void thread118552(int [] tdone, int [] ends){
        S97950=1;
    cylPos5ZAxisExtend.setPresent();//sysj\controller.sysj line: 214, column: 7
    currsigs.addElement(cylPos5ZAxisExtend);
    active[15]=1;
    ends[15]=1;
    tdone[15]=1;
  }

  public void thread118551(int [] tdone, int [] ends){
        S97944=1;
    cylClampBottleExtend.setPresent();//sysj\controller.sysj line: 208, column: 7
    currsigs.addElement(cylClampBottleExtend);
    active[14]=1;
    ends[14]=1;
    tdone[14]=1;
  }

  public void thread118549(int [] tdone, int [] ends){
        S97979=1;
    S97976=0;
    active[19]=1;
    ends[19]=1;
    tdone[19]=1;
  }

  public void thread118547(int [] tdone, int [] ends){
        S97956=1;
    active[18]=1;
    ends[18]=1;
    tdone[18]=1;
  }

  public void thread118546(int [] tdone, int [] ends){
        S97953=1;
    active[17]=1;
    ends[17]=1;
    tdone[17]=1;
  }

  public void thread118545(int [] tdone, int [] ends){
        S97966=1;
    S97965=0;
    thread118546(tdone,ends);
    thread118547(tdone,ends);
    int biggest118548 = 0;
    if(ends[17]>=biggest118548){
      biggest118548=ends[17];
    }
    if(ends[18]>=biggest118548){
      biggest118548=ends[18];
    }
    if(biggest118548 == 1){
      active[16]=1;
      ends[16]=1;
      tdone[16]=1;
    }
  }

  public void thread118544(int [] tdone, int [] ends){
        S97950=1;
    cylPos5ZAxisExtend.setPresent();//sysj\controller.sysj line: 214, column: 7
    currsigs.addElement(cylPos5ZAxisExtend);
    active[15]=1;
    ends[15]=1;
    tdone[15]=1;
  }

  public void thread118543(int [] tdone, int [] ends){
        S97944=1;
    cylClampBottleExtend.setPresent();//sysj\controller.sysj line: 208, column: 7
    currsigs.addElement(cylClampBottleExtend);
    active[14]=1;
    ends[14]=1;
    tdone[14]=1;
  }

  public void thread118541(int [] tdone, int [] ends){
        S97979=1;
    S97976=0;
    active[19]=1;
    ends[19]=1;
    tdone[19]=1;
  }

  public void thread118539(int [] tdone, int [] ends){
        S97956=1;
    active[18]=1;
    ends[18]=1;
    tdone[18]=1;
  }

  public void thread118538(int [] tdone, int [] ends){
        S97953=1;
    active[17]=1;
    ends[17]=1;
    tdone[17]=1;
  }

  public void thread118537(int [] tdone, int [] ends){
        S97966=1;
    S97965=0;
    thread118538(tdone,ends);
    thread118539(tdone,ends);
    int biggest118540 = 0;
    if(ends[17]>=biggest118540){
      biggest118540=ends[17];
    }
    if(ends[18]>=biggest118540){
      biggest118540=ends[18];
    }
    if(biggest118540 == 1){
      active[16]=1;
      ends[16]=1;
      tdone[16]=1;
    }
  }

  public void thread118536(int [] tdone, int [] ends){
        S97950=1;
    cylPos5ZAxisExtend.setPresent();//sysj\controller.sysj line: 214, column: 7
    currsigs.addElement(cylPos5ZAxisExtend);
    active[15]=1;
    ends[15]=1;
    tdone[15]=1;
  }

  public void thread118535(int [] tdone, int [] ends){
        S97944=1;
    cylClampBottleExtend.setPresent();//sysj\controller.sysj line: 208, column: 7
    currsigs.addElement(cylClampBottleExtend);
    active[14]=1;
    ends[14]=1;
    tdone[14]=1;
  }

  public void thread118533(int [] tdone, int [] ends){
        S97979=1;
    S97976=0;
    active[19]=1;
    ends[19]=1;
    tdone[19]=1;
  }

  public void thread118531(int [] tdone, int [] ends){
        S97956=1;
    active[18]=1;
    ends[18]=1;
    tdone[18]=1;
  }

  public void thread118530(int [] tdone, int [] ends){
        S97953=1;
    active[17]=1;
    ends[17]=1;
    tdone[17]=1;
  }

  public void thread118529(int [] tdone, int [] ends){
        S97966=1;
    S97965=0;
    thread118530(tdone,ends);
    thread118531(tdone,ends);
    int biggest118532 = 0;
    if(ends[17]>=biggest118532){
      biggest118532=ends[17];
    }
    if(ends[18]>=biggest118532){
      biggest118532=ends[18];
    }
    if(biggest118532 == 1){
      active[16]=1;
      ends[16]=1;
      tdone[16]=1;
    }
  }

  public void thread118528(int [] tdone, int [] ends){
        S97950=1;
    cylPos5ZAxisExtend.setPresent();//sysj\controller.sysj line: 214, column: 7
    currsigs.addElement(cylPos5ZAxisExtend);
    active[15]=1;
    ends[15]=1;
    tdone[15]=1;
  }

  public void thread118527(int [] tdone, int [] ends){
        S97944=1;
    cylClampBottleExtend.setPresent();//sysj\controller.sysj line: 208, column: 7
    currsigs.addElement(cylClampBottleExtend);
    active[14]=1;
    ends[14]=1;
    tdone[14]=1;
  }

  public void thread118525(int [] tdone, int [] ends){
        S97979=1;
    S97976=0;
    active[19]=1;
    ends[19]=1;
    tdone[19]=1;
  }

  public void thread118523(int [] tdone, int [] ends){
        S97956=1;
    active[18]=1;
    ends[18]=1;
    tdone[18]=1;
  }

  public void thread118522(int [] tdone, int [] ends){
        S97953=1;
    active[17]=1;
    ends[17]=1;
    tdone[17]=1;
  }

  public void thread118521(int [] tdone, int [] ends){
        S97966=1;
    S97965=0;
    thread118522(tdone,ends);
    thread118523(tdone,ends);
    int biggest118524 = 0;
    if(ends[17]>=biggest118524){
      biggest118524=ends[17];
    }
    if(ends[18]>=biggest118524){
      biggest118524=ends[18];
    }
    if(biggest118524 == 1){
      active[16]=1;
      ends[16]=1;
      tdone[16]=1;
    }
  }

  public void thread118520(int [] tdone, int [] ends){
        S97950=1;
    cylPos5ZAxisExtend.setPresent();//sysj\controller.sysj line: 214, column: 7
    currsigs.addElement(cylPos5ZAxisExtend);
    active[15]=1;
    ends[15]=1;
    tdone[15]=1;
  }

  public void thread118519(int [] tdone, int [] ends){
        S97944=1;
    cylClampBottleExtend.setPresent();//sysj\controller.sysj line: 208, column: 7
    currsigs.addElement(cylClampBottleExtend);
    active[14]=1;
    ends[14]=1;
    tdone[14]=1;
  }

  public void thread118517(int [] tdone, int [] ends){
        S97979=1;
    S97976=0;
    active[19]=1;
    ends[19]=1;
    tdone[19]=1;
  }

  public void thread118515(int [] tdone, int [] ends){
        S97956=1;
    active[18]=1;
    ends[18]=1;
    tdone[18]=1;
  }

  public void thread118514(int [] tdone, int [] ends){
        S97953=1;
    active[17]=1;
    ends[17]=1;
    tdone[17]=1;
  }

  public void thread118513(int [] tdone, int [] ends){
        S97966=1;
    S97965=0;
    thread118514(tdone,ends);
    thread118515(tdone,ends);
    int biggest118516 = 0;
    if(ends[17]>=biggest118516){
      biggest118516=ends[17];
    }
    if(ends[18]>=biggest118516){
      biggest118516=ends[18];
    }
    if(biggest118516 == 1){
      active[16]=1;
      ends[16]=1;
      tdone[16]=1;
    }
  }

  public void thread118512(int [] tdone, int [] ends){
        S97950=1;
    cylPos5ZAxisExtend.setPresent();//sysj\controller.sysj line: 214, column: 7
    currsigs.addElement(cylPos5ZAxisExtend);
    active[15]=1;
    ends[15]=1;
    tdone[15]=1;
  }

  public void thread118511(int [] tdone, int [] ends){
        S97944=1;
    cylClampBottleExtend.setPresent();//sysj\controller.sysj line: 208, column: 7
    currsigs.addElement(cylClampBottleExtend);
    active[14]=1;
    ends[14]=1;
    tdone[14]=1;
  }

  public void thread118509(int [] tdone, int [] ends){
        S97979=1;
    S97976=0;
    active[19]=1;
    ends[19]=1;
    tdone[19]=1;
  }

  public void thread118507(int [] tdone, int [] ends){
        S97956=1;
    active[18]=1;
    ends[18]=1;
    tdone[18]=1;
  }

  public void thread118506(int [] tdone, int [] ends){
        S97953=1;
    active[17]=1;
    ends[17]=1;
    tdone[17]=1;
  }

  public void thread118505(int [] tdone, int [] ends){
        S97966=1;
    S97965=0;
    thread118506(tdone,ends);
    thread118507(tdone,ends);
    int biggest118508 = 0;
    if(ends[17]>=biggest118508){
      biggest118508=ends[17];
    }
    if(ends[18]>=biggest118508){
      biggest118508=ends[18];
    }
    if(biggest118508 == 1){
      active[16]=1;
      ends[16]=1;
      tdone[16]=1;
    }
  }

  public void thread118504(int [] tdone, int [] ends){
        S97950=1;
    cylPos5ZAxisExtend.setPresent();//sysj\controller.sysj line: 214, column: 7
    currsigs.addElement(cylPos5ZAxisExtend);
    active[15]=1;
    ends[15]=1;
    tdone[15]=1;
  }

  public void thread118503(int [] tdone, int [] ends){
        S97944=1;
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
      switch(S111239){
        case 0 : 
          S111239=0;
          break RUN;
        
        case 1 : 
          S111239=2;
          S111239=2;
          releaseCap_13.setClear();//sysj\controller.sysj line: 191, column: 2
          untwistGripper_13.setClear();//sysj\controller.sysj line: 191, column: 2
          raiseGripper_13.setClear();//sysj\controller.sysj line: 191, column: 2
          unclampBottle_13.setClear();//sysj\controller.sysj line: 191, column: 2
          S97823=0;
          S97807=0;
          if(!capperReq_in.isPartnerPresent() || capperReq_in.isPartnerPreempted()){//sysj\controller.sysj line: 194, column: 3
            capperReq_in.setACK(false);//sysj\controller.sysj line: 194, column: 3
            S97807=1;
            active[13]=1;
            ends[13]=1;
            break RUN;
          }
          else {
            S97802=0;
            if(!capperReq_in.isREQ()){//sysj\controller.sysj line: 194, column: 3
              capperReq_in.setACK(true);//sysj\controller.sysj line: 194, column: 3
              S97802=1;
              if(capperReq_in.isREQ()){//sysj\controller.sysj line: 194, column: 3
                capperReq_in.setACK(false);//sysj\controller.sysj line: 194, column: 3
                ends[13]=2;
                ;//sysj\controller.sysj line: 194, column: 3
                request_thread_13 = (boolean)(capperReq_in.getVal() == null ? false : ((Boolean)capperReq_in.getVal()).booleanValue());//sysj\controller.sysj line: 195, column: 3
                S97823=1;
                if(request_thread_13){//sysj\controller.sysj line: 197, column: 3
                  S98937=0;
                  S97938=0;
                  S97830=0;
                  if(!capperStatus_o.isPartnerPresent() || capperStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 198, column: 4
                    capperStatus_o.setREQ(false);//sysj\controller.sysj line: 198, column: 4
                    S97830=1;
                    active[13]=1;
                    ends[13]=1;
                    break RUN;
                  }
                  else {
                    S97825=0;
                    if(capperStatus_o.isACK()){//sysj\controller.sysj line: 198, column: 4
                      capperStatus_o.setVal("busy");//sysj\controller.sysj line: 198, column: 4
                      S97825=1;
                      if(!capperStatus_o.isACK()){//sysj\controller.sysj line: 198, column: 4
                        capperStatus_o.setREQ(false);//sysj\controller.sysj line: 198, column: 4
                        ends[13]=2;
                        ;//sysj\controller.sysj line: 198, column: 4
                        S97938=1;
                        if(!bottleAtPos4.getprestatus()){//sysj\controller.sysj line: 200, column: 13
                          S97852=0;
                          if(!capperStatus_o.isPartnerPresent() || capperStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 201, column: 5
                            capperStatus_o.setREQ(false);//sysj\controller.sysj line: 201, column: 5
                            S97852=1;
                            active[13]=1;
                            ends[13]=1;
                            break RUN;
                          }
                          else {
                            S97847=0;
                            if(capperStatus_o.isACK()){//sysj\controller.sysj line: 201, column: 5
                              capperStatus_o.setVal("idle");//sysj\controller.sysj line: 201, column: 5
                              S97847=1;
                              if(!capperStatus_o.isACK()){//sysj\controller.sysj line: 201, column: 5
                                capperStatus_o.setREQ(false);//sysj\controller.sysj line: 201, column: 5
                                ends[13]=2;
                                ;//sysj\controller.sysj line: 201, column: 5
                                S97938=2;
                                if(bottleAtPos4.getprestatus()){//sysj\controller.sysj line: 204, column: 12
                                  System.out.println("Capper doing work...");//sysj\controller.sysj line: 205, column: 5
                                  thread118503(tdone,ends);
                                  thread118504(tdone,ends);
                                  thread118505(tdone,ends);
                                  thread118509(tdone,ends);
                                  int biggest118510 = 0;
                                  if(ends[14]>=biggest118510){
                                    biggest118510=ends[14];
                                  }
                                  if(ends[15]>=biggest118510){
                                    biggest118510=ends[15];
                                  }
                                  if(ends[16]>=biggest118510){
                                    biggest118510=ends[16];
                                  }
                                  if(ends[19]>=biggest118510){
                                    biggest118510=ends[19];
                                  }
                                  if(biggest118510 == 1){
                                    active[13]=1;
                                    ends[13]=1;
                                    break RUN;
                                  }
                                }
                                else {
                                  S97938=3;
                                  S98701=0;
                                  if(!capperStatus_o.isPartnerPresent() || capperStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 242, column: 4
                                    capperStatus_o.setREQ(false);//sysj\controller.sysj line: 242, column: 4
                                    S98701=1;
                                    active[13]=1;
                                    ends[13]=1;
                                    break RUN;
                                  }
                                  else {
                                    S98696=0;
                                    if(capperStatus_o.isACK()){//sysj\controller.sysj line: 242, column: 4
                                      capperStatus_o.setVal("done");//sysj\controller.sysj line: 242, column: 4
                                      S98696=1;
                                      if(!capperStatus_o.isACK()){//sysj\controller.sysj line: 242, column: 4
                                        capperStatus_o.setREQ(false);//sysj\controller.sysj line: 242, column: 4
                                        ends[13]=2;
                                        ;//sysj\controller.sysj line: 242, column: 4
                                        S97823=2;
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
                          S97938=2;
                          if(bottleAtPos4.getprestatus()){//sysj\controller.sysj line: 204, column: 12
                            System.out.println("Capper doing work...");//sysj\controller.sysj line: 205, column: 5
                            thread118511(tdone,ends);
                            thread118512(tdone,ends);
                            thread118513(tdone,ends);
                            thread118517(tdone,ends);
                            int biggest118518 = 0;
                            if(ends[14]>=biggest118518){
                              biggest118518=ends[14];
                            }
                            if(ends[15]>=biggest118518){
                              biggest118518=ends[15];
                            }
                            if(ends[16]>=biggest118518){
                              biggest118518=ends[16];
                            }
                            if(ends[19]>=biggest118518){
                              biggest118518=ends[19];
                            }
                            if(biggest118518 == 1){
                              active[13]=1;
                              ends[13]=1;
                              break RUN;
                            }
                          }
                          else {
                            S97938=3;
                            S98701=0;
                            if(!capperStatus_o.isPartnerPresent() || capperStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 242, column: 4
                              capperStatus_o.setREQ(false);//sysj\controller.sysj line: 242, column: 4
                              S98701=1;
                              active[13]=1;
                              ends[13]=1;
                              break RUN;
                            }
                            else {
                              S98696=0;
                              if(capperStatus_o.isACK()){//sysj\controller.sysj line: 242, column: 4
                                capperStatus_o.setVal("done");//sysj\controller.sysj line: 242, column: 4
                                S98696=1;
                                if(!capperStatus_o.isACK()){//sysj\controller.sysj line: 242, column: 4
                                  capperStatus_o.setREQ(false);//sysj\controller.sysj line: 242, column: 4
                                  ends[13]=2;
                                  ;//sysj\controller.sysj line: 242, column: 4
                                  S97823=2;
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
                  S98937=1;
                  S98921=0;
                  if(!capperStatus_o.isPartnerPresent() || capperStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 244, column: 4
                    capperStatus_o.setREQ(false);//sysj\controller.sysj line: 244, column: 4
                    S98921=1;
                    active[13]=1;
                    ends[13]=1;
                    break RUN;
                  }
                  else {
                    S98916=0;
                    if(capperStatus_o.isACK()){//sysj\controller.sysj line: 244, column: 4
                      capperStatus_o.setVal("idle");//sysj\controller.sysj line: 244, column: 4
                      S98916=1;
                      if(!capperStatus_o.isACK()){//sysj\controller.sysj line: 244, column: 4
                        capperStatus_o.setREQ(false);//sysj\controller.sysj line: 244, column: 4
                        ends[13]=2;
                        ;//sysj\controller.sysj line: 244, column: 4
                        S97823=2;
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
          switch(S97823){
            case 0 : 
              switch(S97807){
                case 0 : 
                  if(!capperReq_in.isPartnerPresent() || capperReq_in.isPartnerPreempted()){//sysj\controller.sysj line: 194, column: 3
                    capperReq_in.setACK(false);//sysj\controller.sysj line: 194, column: 3
                    S97807=1;
                    active[13]=1;
                    ends[13]=1;
                    break RUN;
                  }
                  else {
                    switch(S97802){
                      case 0 : 
                        if(!capperReq_in.isREQ()){//sysj\controller.sysj line: 194, column: 3
                          capperReq_in.setACK(true);//sysj\controller.sysj line: 194, column: 3
                          S97802=1;
                          if(capperReq_in.isREQ()){//sysj\controller.sysj line: 194, column: 3
                            capperReq_in.setACK(false);//sysj\controller.sysj line: 194, column: 3
                            ends[13]=2;
                            ;//sysj\controller.sysj line: 194, column: 3
                            request_thread_13 = (boolean)(capperReq_in.getVal() == null ? false : ((Boolean)capperReq_in.getVal()).booleanValue());//sysj\controller.sysj line: 195, column: 3
                            S97823=1;
                            if(request_thread_13){//sysj\controller.sysj line: 197, column: 3
                              S98937=0;
                              S97938=0;
                              S97830=0;
                              if(!capperStatus_o.isPartnerPresent() || capperStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 198, column: 4
                                capperStatus_o.setREQ(false);//sysj\controller.sysj line: 198, column: 4
                                S97830=1;
                                active[13]=1;
                                ends[13]=1;
                                break RUN;
                              }
                              else {
                                S97825=0;
                                if(capperStatus_o.isACK()){//sysj\controller.sysj line: 198, column: 4
                                  capperStatus_o.setVal("busy");//sysj\controller.sysj line: 198, column: 4
                                  S97825=1;
                                  if(!capperStatus_o.isACK()){//sysj\controller.sysj line: 198, column: 4
                                    capperStatus_o.setREQ(false);//sysj\controller.sysj line: 198, column: 4
                                    ends[13]=2;
                                    ;//sysj\controller.sysj line: 198, column: 4
                                    S97938=1;
                                    if(!bottleAtPos4.getprestatus()){//sysj\controller.sysj line: 200, column: 13
                                      S97852=0;
                                      if(!capperStatus_o.isPartnerPresent() || capperStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 201, column: 5
                                        capperStatus_o.setREQ(false);//sysj\controller.sysj line: 201, column: 5
                                        S97852=1;
                                        active[13]=1;
                                        ends[13]=1;
                                        break RUN;
                                      }
                                      else {
                                        S97847=0;
                                        if(capperStatus_o.isACK()){//sysj\controller.sysj line: 201, column: 5
                                          capperStatus_o.setVal("idle");//sysj\controller.sysj line: 201, column: 5
                                          S97847=1;
                                          if(!capperStatus_o.isACK()){//sysj\controller.sysj line: 201, column: 5
                                            capperStatus_o.setREQ(false);//sysj\controller.sysj line: 201, column: 5
                                            ends[13]=2;
                                            ;//sysj\controller.sysj line: 201, column: 5
                                            S97938=2;
                                            if(bottleAtPos4.getprestatus()){//sysj\controller.sysj line: 204, column: 12
                                              System.out.println("Capper doing work...");//sysj\controller.sysj line: 205, column: 5
                                              thread118519(tdone,ends);
                                              thread118520(tdone,ends);
                                              thread118521(tdone,ends);
                                              thread118525(tdone,ends);
                                              int biggest118526 = 0;
                                              if(ends[14]>=biggest118526){
                                                biggest118526=ends[14];
                                              }
                                              if(ends[15]>=biggest118526){
                                                biggest118526=ends[15];
                                              }
                                              if(ends[16]>=biggest118526){
                                                biggest118526=ends[16];
                                              }
                                              if(ends[19]>=biggest118526){
                                                biggest118526=ends[19];
                                              }
                                              if(biggest118526 == 1){
                                                active[13]=1;
                                                ends[13]=1;
                                                break RUN;
                                              }
                                            }
                                            else {
                                              S97938=3;
                                              S98701=0;
                                              if(!capperStatus_o.isPartnerPresent() || capperStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 242, column: 4
                                                capperStatus_o.setREQ(false);//sysj\controller.sysj line: 242, column: 4
                                                S98701=1;
                                                active[13]=1;
                                                ends[13]=1;
                                                break RUN;
                                              }
                                              else {
                                                S98696=0;
                                                if(capperStatus_o.isACK()){//sysj\controller.sysj line: 242, column: 4
                                                  capperStatus_o.setVal("done");//sysj\controller.sysj line: 242, column: 4
                                                  S98696=1;
                                                  if(!capperStatus_o.isACK()){//sysj\controller.sysj line: 242, column: 4
                                                    capperStatus_o.setREQ(false);//sysj\controller.sysj line: 242, column: 4
                                                    ends[13]=2;
                                                    ;//sysj\controller.sysj line: 242, column: 4
                                                    S97823=2;
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
                                      S97938=2;
                                      if(bottleAtPos4.getprestatus()){//sysj\controller.sysj line: 204, column: 12
                                        System.out.println("Capper doing work...");//sysj\controller.sysj line: 205, column: 5
                                        thread118527(tdone,ends);
                                        thread118528(tdone,ends);
                                        thread118529(tdone,ends);
                                        thread118533(tdone,ends);
                                        int biggest118534 = 0;
                                        if(ends[14]>=biggest118534){
                                          biggest118534=ends[14];
                                        }
                                        if(ends[15]>=biggest118534){
                                          biggest118534=ends[15];
                                        }
                                        if(ends[16]>=biggest118534){
                                          biggest118534=ends[16];
                                        }
                                        if(ends[19]>=biggest118534){
                                          biggest118534=ends[19];
                                        }
                                        if(biggest118534 == 1){
                                          active[13]=1;
                                          ends[13]=1;
                                          break RUN;
                                        }
                                      }
                                      else {
                                        S97938=3;
                                        S98701=0;
                                        if(!capperStatus_o.isPartnerPresent() || capperStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 242, column: 4
                                          capperStatus_o.setREQ(false);//sysj\controller.sysj line: 242, column: 4
                                          S98701=1;
                                          active[13]=1;
                                          ends[13]=1;
                                          break RUN;
                                        }
                                        else {
                                          S98696=0;
                                          if(capperStatus_o.isACK()){//sysj\controller.sysj line: 242, column: 4
                                            capperStatus_o.setVal("done");//sysj\controller.sysj line: 242, column: 4
                                            S98696=1;
                                            if(!capperStatus_o.isACK()){//sysj\controller.sysj line: 242, column: 4
                                              capperStatus_o.setREQ(false);//sysj\controller.sysj line: 242, column: 4
                                              ends[13]=2;
                                              ;//sysj\controller.sysj line: 242, column: 4
                                              S97823=2;
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
                              S98937=1;
                              S98921=0;
                              if(!capperStatus_o.isPartnerPresent() || capperStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 244, column: 4
                                capperStatus_o.setREQ(false);//sysj\controller.sysj line: 244, column: 4
                                S98921=1;
                                active[13]=1;
                                ends[13]=1;
                                break RUN;
                              }
                              else {
                                S98916=0;
                                if(capperStatus_o.isACK()){//sysj\controller.sysj line: 244, column: 4
                                  capperStatus_o.setVal("idle");//sysj\controller.sysj line: 244, column: 4
                                  S98916=1;
                                  if(!capperStatus_o.isACK()){//sysj\controller.sysj line: 244, column: 4
                                    capperStatus_o.setREQ(false);//sysj\controller.sysj line: 244, column: 4
                                    ends[13]=2;
                                    ;//sysj\controller.sysj line: 244, column: 4
                                    S97823=2;
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
                          S97823=1;
                          if(request_thread_13){//sysj\controller.sysj line: 197, column: 3
                            S98937=0;
                            S97938=0;
                            S97830=0;
                            if(!capperStatus_o.isPartnerPresent() || capperStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 198, column: 4
                              capperStatus_o.setREQ(false);//sysj\controller.sysj line: 198, column: 4
                              S97830=1;
                              active[13]=1;
                              ends[13]=1;
                              break RUN;
                            }
                            else {
                              S97825=0;
                              if(capperStatus_o.isACK()){//sysj\controller.sysj line: 198, column: 4
                                capperStatus_o.setVal("busy");//sysj\controller.sysj line: 198, column: 4
                                S97825=1;
                                if(!capperStatus_o.isACK()){//sysj\controller.sysj line: 198, column: 4
                                  capperStatus_o.setREQ(false);//sysj\controller.sysj line: 198, column: 4
                                  ends[13]=2;
                                  ;//sysj\controller.sysj line: 198, column: 4
                                  S97938=1;
                                  if(!bottleAtPos4.getprestatus()){//sysj\controller.sysj line: 200, column: 13
                                    S97852=0;
                                    if(!capperStatus_o.isPartnerPresent() || capperStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 201, column: 5
                                      capperStatus_o.setREQ(false);//sysj\controller.sysj line: 201, column: 5
                                      S97852=1;
                                      active[13]=1;
                                      ends[13]=1;
                                      break RUN;
                                    }
                                    else {
                                      S97847=0;
                                      if(capperStatus_o.isACK()){//sysj\controller.sysj line: 201, column: 5
                                        capperStatus_o.setVal("idle");//sysj\controller.sysj line: 201, column: 5
                                        S97847=1;
                                        if(!capperStatus_o.isACK()){//sysj\controller.sysj line: 201, column: 5
                                          capperStatus_o.setREQ(false);//sysj\controller.sysj line: 201, column: 5
                                          ends[13]=2;
                                          ;//sysj\controller.sysj line: 201, column: 5
                                          S97938=2;
                                          if(bottleAtPos4.getprestatus()){//sysj\controller.sysj line: 204, column: 12
                                            System.out.println("Capper doing work...");//sysj\controller.sysj line: 205, column: 5
                                            thread118535(tdone,ends);
                                            thread118536(tdone,ends);
                                            thread118537(tdone,ends);
                                            thread118541(tdone,ends);
                                            int biggest118542 = 0;
                                            if(ends[14]>=biggest118542){
                                              biggest118542=ends[14];
                                            }
                                            if(ends[15]>=biggest118542){
                                              biggest118542=ends[15];
                                            }
                                            if(ends[16]>=biggest118542){
                                              biggest118542=ends[16];
                                            }
                                            if(ends[19]>=biggest118542){
                                              biggest118542=ends[19];
                                            }
                                            if(biggest118542 == 1){
                                              active[13]=1;
                                              ends[13]=1;
                                              break RUN;
                                            }
                                          }
                                          else {
                                            S97938=3;
                                            S98701=0;
                                            if(!capperStatus_o.isPartnerPresent() || capperStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 242, column: 4
                                              capperStatus_o.setREQ(false);//sysj\controller.sysj line: 242, column: 4
                                              S98701=1;
                                              active[13]=1;
                                              ends[13]=1;
                                              break RUN;
                                            }
                                            else {
                                              S98696=0;
                                              if(capperStatus_o.isACK()){//sysj\controller.sysj line: 242, column: 4
                                                capperStatus_o.setVal("done");//sysj\controller.sysj line: 242, column: 4
                                                S98696=1;
                                                if(!capperStatus_o.isACK()){//sysj\controller.sysj line: 242, column: 4
                                                  capperStatus_o.setREQ(false);//sysj\controller.sysj line: 242, column: 4
                                                  ends[13]=2;
                                                  ;//sysj\controller.sysj line: 242, column: 4
                                                  S97823=2;
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
                                    S97938=2;
                                    if(bottleAtPos4.getprestatus()){//sysj\controller.sysj line: 204, column: 12
                                      System.out.println("Capper doing work...");//sysj\controller.sysj line: 205, column: 5
                                      thread118543(tdone,ends);
                                      thread118544(tdone,ends);
                                      thread118545(tdone,ends);
                                      thread118549(tdone,ends);
                                      int biggest118550 = 0;
                                      if(ends[14]>=biggest118550){
                                        biggest118550=ends[14];
                                      }
                                      if(ends[15]>=biggest118550){
                                        biggest118550=ends[15];
                                      }
                                      if(ends[16]>=biggest118550){
                                        biggest118550=ends[16];
                                      }
                                      if(ends[19]>=biggest118550){
                                        biggest118550=ends[19];
                                      }
                                      if(biggest118550 == 1){
                                        active[13]=1;
                                        ends[13]=1;
                                        break RUN;
                                      }
                                    }
                                    else {
                                      S97938=3;
                                      S98701=0;
                                      if(!capperStatus_o.isPartnerPresent() || capperStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 242, column: 4
                                        capperStatus_o.setREQ(false);//sysj\controller.sysj line: 242, column: 4
                                        S98701=1;
                                        active[13]=1;
                                        ends[13]=1;
                                        break RUN;
                                      }
                                      else {
                                        S98696=0;
                                        if(capperStatus_o.isACK()){//sysj\controller.sysj line: 242, column: 4
                                          capperStatus_o.setVal("done");//sysj\controller.sysj line: 242, column: 4
                                          S98696=1;
                                          if(!capperStatus_o.isACK()){//sysj\controller.sysj line: 242, column: 4
                                            capperStatus_o.setREQ(false);//sysj\controller.sysj line: 242, column: 4
                                            ends[13]=2;
                                            ;//sysj\controller.sysj line: 242, column: 4
                                            S97823=2;
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
                            S98937=1;
                            S98921=0;
                            if(!capperStatus_o.isPartnerPresent() || capperStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 244, column: 4
                              capperStatus_o.setREQ(false);//sysj\controller.sysj line: 244, column: 4
                              S98921=1;
                              active[13]=1;
                              ends[13]=1;
                              break RUN;
                            }
                            else {
                              S98916=0;
                              if(capperStatus_o.isACK()){//sysj\controller.sysj line: 244, column: 4
                                capperStatus_o.setVal("idle");//sysj\controller.sysj line: 244, column: 4
                                S98916=1;
                                if(!capperStatus_o.isACK()){//sysj\controller.sysj line: 244, column: 4
                                  capperStatus_o.setREQ(false);//sysj\controller.sysj line: 244, column: 4
                                  ends[13]=2;
                                  ;//sysj\controller.sysj line: 244, column: 4
                                  S97823=2;
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
                  S97807=1;
                  S97807=0;
                  if(!capperReq_in.isPartnerPresent() || capperReq_in.isPartnerPreempted()){//sysj\controller.sysj line: 194, column: 3
                    capperReq_in.setACK(false);//sysj\controller.sysj line: 194, column: 3
                    S97807=1;
                    active[13]=1;
                    ends[13]=1;
                    break RUN;
                  }
                  else {
                    S97802=0;
                    if(!capperReq_in.isREQ()){//sysj\controller.sysj line: 194, column: 3
                      capperReq_in.setACK(true);//sysj\controller.sysj line: 194, column: 3
                      S97802=1;
                      if(capperReq_in.isREQ()){//sysj\controller.sysj line: 194, column: 3
                        capperReq_in.setACK(false);//sysj\controller.sysj line: 194, column: 3
                        ends[13]=2;
                        ;//sysj\controller.sysj line: 194, column: 3
                        request_thread_13 = (boolean)(capperReq_in.getVal() == null ? false : ((Boolean)capperReq_in.getVal()).booleanValue());//sysj\controller.sysj line: 195, column: 3
                        S97823=1;
                        if(request_thread_13){//sysj\controller.sysj line: 197, column: 3
                          S98937=0;
                          S97938=0;
                          S97830=0;
                          if(!capperStatus_o.isPartnerPresent() || capperStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 198, column: 4
                            capperStatus_o.setREQ(false);//sysj\controller.sysj line: 198, column: 4
                            S97830=1;
                            active[13]=1;
                            ends[13]=1;
                            break RUN;
                          }
                          else {
                            S97825=0;
                            if(capperStatus_o.isACK()){//sysj\controller.sysj line: 198, column: 4
                              capperStatus_o.setVal("busy");//sysj\controller.sysj line: 198, column: 4
                              S97825=1;
                              if(!capperStatus_o.isACK()){//sysj\controller.sysj line: 198, column: 4
                                capperStatus_o.setREQ(false);//sysj\controller.sysj line: 198, column: 4
                                ends[13]=2;
                                ;//sysj\controller.sysj line: 198, column: 4
                                S97938=1;
                                if(!bottleAtPos4.getprestatus()){//sysj\controller.sysj line: 200, column: 13
                                  S97852=0;
                                  if(!capperStatus_o.isPartnerPresent() || capperStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 201, column: 5
                                    capperStatus_o.setREQ(false);//sysj\controller.sysj line: 201, column: 5
                                    S97852=1;
                                    active[13]=1;
                                    ends[13]=1;
                                    break RUN;
                                  }
                                  else {
                                    S97847=0;
                                    if(capperStatus_o.isACK()){//sysj\controller.sysj line: 201, column: 5
                                      capperStatus_o.setVal("idle");//sysj\controller.sysj line: 201, column: 5
                                      S97847=1;
                                      if(!capperStatus_o.isACK()){//sysj\controller.sysj line: 201, column: 5
                                        capperStatus_o.setREQ(false);//sysj\controller.sysj line: 201, column: 5
                                        ends[13]=2;
                                        ;//sysj\controller.sysj line: 201, column: 5
                                        S97938=2;
                                        if(bottleAtPos4.getprestatus()){//sysj\controller.sysj line: 204, column: 12
                                          System.out.println("Capper doing work...");//sysj\controller.sysj line: 205, column: 5
                                          thread118551(tdone,ends);
                                          thread118552(tdone,ends);
                                          thread118553(tdone,ends);
                                          thread118557(tdone,ends);
                                          int biggest118558 = 0;
                                          if(ends[14]>=biggest118558){
                                            biggest118558=ends[14];
                                          }
                                          if(ends[15]>=biggest118558){
                                            biggest118558=ends[15];
                                          }
                                          if(ends[16]>=biggest118558){
                                            biggest118558=ends[16];
                                          }
                                          if(ends[19]>=biggest118558){
                                            biggest118558=ends[19];
                                          }
                                          if(biggest118558 == 1){
                                            active[13]=1;
                                            ends[13]=1;
                                            break RUN;
                                          }
                                        }
                                        else {
                                          S97938=3;
                                          S98701=0;
                                          if(!capperStatus_o.isPartnerPresent() || capperStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 242, column: 4
                                            capperStatus_o.setREQ(false);//sysj\controller.sysj line: 242, column: 4
                                            S98701=1;
                                            active[13]=1;
                                            ends[13]=1;
                                            break RUN;
                                          }
                                          else {
                                            S98696=0;
                                            if(capperStatus_o.isACK()){//sysj\controller.sysj line: 242, column: 4
                                              capperStatus_o.setVal("done");//sysj\controller.sysj line: 242, column: 4
                                              S98696=1;
                                              if(!capperStatus_o.isACK()){//sysj\controller.sysj line: 242, column: 4
                                                capperStatus_o.setREQ(false);//sysj\controller.sysj line: 242, column: 4
                                                ends[13]=2;
                                                ;//sysj\controller.sysj line: 242, column: 4
                                                S97823=2;
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
                                  S97938=2;
                                  if(bottleAtPos4.getprestatus()){//sysj\controller.sysj line: 204, column: 12
                                    System.out.println("Capper doing work...");//sysj\controller.sysj line: 205, column: 5
                                    thread118559(tdone,ends);
                                    thread118560(tdone,ends);
                                    thread118561(tdone,ends);
                                    thread118565(tdone,ends);
                                    int biggest118566 = 0;
                                    if(ends[14]>=biggest118566){
                                      biggest118566=ends[14];
                                    }
                                    if(ends[15]>=biggest118566){
                                      biggest118566=ends[15];
                                    }
                                    if(ends[16]>=biggest118566){
                                      biggest118566=ends[16];
                                    }
                                    if(ends[19]>=biggest118566){
                                      biggest118566=ends[19];
                                    }
                                    if(biggest118566 == 1){
                                      active[13]=1;
                                      ends[13]=1;
                                      break RUN;
                                    }
                                  }
                                  else {
                                    S97938=3;
                                    S98701=0;
                                    if(!capperStatus_o.isPartnerPresent() || capperStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 242, column: 4
                                      capperStatus_o.setREQ(false);//sysj\controller.sysj line: 242, column: 4
                                      S98701=1;
                                      active[13]=1;
                                      ends[13]=1;
                                      break RUN;
                                    }
                                    else {
                                      S98696=0;
                                      if(capperStatus_o.isACK()){//sysj\controller.sysj line: 242, column: 4
                                        capperStatus_o.setVal("done");//sysj\controller.sysj line: 242, column: 4
                                        S98696=1;
                                        if(!capperStatus_o.isACK()){//sysj\controller.sysj line: 242, column: 4
                                          capperStatus_o.setREQ(false);//sysj\controller.sysj line: 242, column: 4
                                          ends[13]=2;
                                          ;//sysj\controller.sysj line: 242, column: 4
                                          S97823=2;
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
                          S98937=1;
                          S98921=0;
                          if(!capperStatus_o.isPartnerPresent() || capperStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 244, column: 4
                            capperStatus_o.setREQ(false);//sysj\controller.sysj line: 244, column: 4
                            S98921=1;
                            active[13]=1;
                            ends[13]=1;
                            break RUN;
                          }
                          else {
                            S98916=0;
                            if(capperStatus_o.isACK()){//sysj\controller.sysj line: 244, column: 4
                              capperStatus_o.setVal("idle");//sysj\controller.sysj line: 244, column: 4
                              S98916=1;
                              if(!capperStatus_o.isACK()){//sysj\controller.sysj line: 244, column: 4
                                capperStatus_o.setREQ(false);//sysj\controller.sysj line: 244, column: 4
                                ends[13]=2;
                                ;//sysj\controller.sysj line: 244, column: 4
                                S97823=2;
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
              switch(S98937){
                case 0 : 
                  switch(S97938){
                    case 0 : 
                      switch(S97830){
                        case 0 : 
                          if(!capperStatus_o.isPartnerPresent() || capperStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 198, column: 4
                            capperStatus_o.setREQ(false);//sysj\controller.sysj line: 198, column: 4
                            S97830=1;
                            active[13]=1;
                            ends[13]=1;
                            break RUN;
                          }
                          else {
                            switch(S97825){
                              case 0 : 
                                if(capperStatus_o.isACK()){//sysj\controller.sysj line: 198, column: 4
                                  capperStatus_o.setVal("busy");//sysj\controller.sysj line: 198, column: 4
                                  S97825=1;
                                  if(!capperStatus_o.isACK()){//sysj\controller.sysj line: 198, column: 4
                                    capperStatus_o.setREQ(false);//sysj\controller.sysj line: 198, column: 4
                                    ends[13]=2;
                                    ;//sysj\controller.sysj line: 198, column: 4
                                    S97938=1;
                                    if(!bottleAtPos4.getprestatus()){//sysj\controller.sysj line: 200, column: 13
                                      S97852=0;
                                      if(!capperStatus_o.isPartnerPresent() || capperStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 201, column: 5
                                        capperStatus_o.setREQ(false);//sysj\controller.sysj line: 201, column: 5
                                        S97852=1;
                                        active[13]=1;
                                        ends[13]=1;
                                        break RUN;
                                      }
                                      else {
                                        S97847=0;
                                        if(capperStatus_o.isACK()){//sysj\controller.sysj line: 201, column: 5
                                          capperStatus_o.setVal("idle");//sysj\controller.sysj line: 201, column: 5
                                          S97847=1;
                                          if(!capperStatus_o.isACK()){//sysj\controller.sysj line: 201, column: 5
                                            capperStatus_o.setREQ(false);//sysj\controller.sysj line: 201, column: 5
                                            ends[13]=2;
                                            ;//sysj\controller.sysj line: 201, column: 5
                                            S97938=2;
                                            if(bottleAtPos4.getprestatus()){//sysj\controller.sysj line: 204, column: 12
                                              System.out.println("Capper doing work...");//sysj\controller.sysj line: 205, column: 5
                                              thread118567(tdone,ends);
                                              thread118568(tdone,ends);
                                              thread118569(tdone,ends);
                                              thread118573(tdone,ends);
                                              int biggest118574 = 0;
                                              if(ends[14]>=biggest118574){
                                                biggest118574=ends[14];
                                              }
                                              if(ends[15]>=biggest118574){
                                                biggest118574=ends[15];
                                              }
                                              if(ends[16]>=biggest118574){
                                                biggest118574=ends[16];
                                              }
                                              if(ends[19]>=biggest118574){
                                                biggest118574=ends[19];
                                              }
                                              if(biggest118574 == 1){
                                                active[13]=1;
                                                ends[13]=1;
                                                break RUN;
                                              }
                                            }
                                            else {
                                              S97938=3;
                                              S98701=0;
                                              if(!capperStatus_o.isPartnerPresent() || capperStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 242, column: 4
                                                capperStatus_o.setREQ(false);//sysj\controller.sysj line: 242, column: 4
                                                S98701=1;
                                                active[13]=1;
                                                ends[13]=1;
                                                break RUN;
                                              }
                                              else {
                                                S98696=0;
                                                if(capperStatus_o.isACK()){//sysj\controller.sysj line: 242, column: 4
                                                  capperStatus_o.setVal("done");//sysj\controller.sysj line: 242, column: 4
                                                  S98696=1;
                                                  if(!capperStatus_o.isACK()){//sysj\controller.sysj line: 242, column: 4
                                                    capperStatus_o.setREQ(false);//sysj\controller.sysj line: 242, column: 4
                                                    ends[13]=2;
                                                    ;//sysj\controller.sysj line: 242, column: 4
                                                    S97823=2;
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
                                      S97938=2;
                                      if(bottleAtPos4.getprestatus()){//sysj\controller.sysj line: 204, column: 12
                                        System.out.println("Capper doing work...");//sysj\controller.sysj line: 205, column: 5
                                        thread118575(tdone,ends);
                                        thread118576(tdone,ends);
                                        thread118577(tdone,ends);
                                        thread118581(tdone,ends);
                                        int biggest118582 = 0;
                                        if(ends[14]>=biggest118582){
                                          biggest118582=ends[14];
                                        }
                                        if(ends[15]>=biggest118582){
                                          biggest118582=ends[15];
                                        }
                                        if(ends[16]>=biggest118582){
                                          biggest118582=ends[16];
                                        }
                                        if(ends[19]>=biggest118582){
                                          biggest118582=ends[19];
                                        }
                                        if(biggest118582 == 1){
                                          active[13]=1;
                                          ends[13]=1;
                                          break RUN;
                                        }
                                      }
                                      else {
                                        S97938=3;
                                        S98701=0;
                                        if(!capperStatus_o.isPartnerPresent() || capperStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 242, column: 4
                                          capperStatus_o.setREQ(false);//sysj\controller.sysj line: 242, column: 4
                                          S98701=1;
                                          active[13]=1;
                                          ends[13]=1;
                                          break RUN;
                                        }
                                        else {
                                          S98696=0;
                                          if(capperStatus_o.isACK()){//sysj\controller.sysj line: 242, column: 4
                                            capperStatus_o.setVal("done");//sysj\controller.sysj line: 242, column: 4
                                            S98696=1;
                                            if(!capperStatus_o.isACK()){//sysj\controller.sysj line: 242, column: 4
                                              capperStatus_o.setREQ(false);//sysj\controller.sysj line: 242, column: 4
                                              ends[13]=2;
                                              ;//sysj\controller.sysj line: 242, column: 4
                                              S97823=2;
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
                                  S97938=1;
                                  if(!bottleAtPos4.getprestatus()){//sysj\controller.sysj line: 200, column: 13
                                    S97852=0;
                                    if(!capperStatus_o.isPartnerPresent() || capperStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 201, column: 5
                                      capperStatus_o.setREQ(false);//sysj\controller.sysj line: 201, column: 5
                                      S97852=1;
                                      active[13]=1;
                                      ends[13]=1;
                                      break RUN;
                                    }
                                    else {
                                      S97847=0;
                                      if(capperStatus_o.isACK()){//sysj\controller.sysj line: 201, column: 5
                                        capperStatus_o.setVal("idle");//sysj\controller.sysj line: 201, column: 5
                                        S97847=1;
                                        if(!capperStatus_o.isACK()){//sysj\controller.sysj line: 201, column: 5
                                          capperStatus_o.setREQ(false);//sysj\controller.sysj line: 201, column: 5
                                          ends[13]=2;
                                          ;//sysj\controller.sysj line: 201, column: 5
                                          S97938=2;
                                          if(bottleAtPos4.getprestatus()){//sysj\controller.sysj line: 204, column: 12
                                            System.out.println("Capper doing work...");//sysj\controller.sysj line: 205, column: 5
                                            thread118583(tdone,ends);
                                            thread118584(tdone,ends);
                                            thread118585(tdone,ends);
                                            thread118589(tdone,ends);
                                            int biggest118590 = 0;
                                            if(ends[14]>=biggest118590){
                                              biggest118590=ends[14];
                                            }
                                            if(ends[15]>=biggest118590){
                                              biggest118590=ends[15];
                                            }
                                            if(ends[16]>=biggest118590){
                                              biggest118590=ends[16];
                                            }
                                            if(ends[19]>=biggest118590){
                                              biggest118590=ends[19];
                                            }
                                            if(biggest118590 == 1){
                                              active[13]=1;
                                              ends[13]=1;
                                              break RUN;
                                            }
                                          }
                                          else {
                                            S97938=3;
                                            S98701=0;
                                            if(!capperStatus_o.isPartnerPresent() || capperStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 242, column: 4
                                              capperStatus_o.setREQ(false);//sysj\controller.sysj line: 242, column: 4
                                              S98701=1;
                                              active[13]=1;
                                              ends[13]=1;
                                              break RUN;
                                            }
                                            else {
                                              S98696=0;
                                              if(capperStatus_o.isACK()){//sysj\controller.sysj line: 242, column: 4
                                                capperStatus_o.setVal("done");//sysj\controller.sysj line: 242, column: 4
                                                S98696=1;
                                                if(!capperStatus_o.isACK()){//sysj\controller.sysj line: 242, column: 4
                                                  capperStatus_o.setREQ(false);//sysj\controller.sysj line: 242, column: 4
                                                  ends[13]=2;
                                                  ;//sysj\controller.sysj line: 242, column: 4
                                                  S97823=2;
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
                                    S97938=2;
                                    if(bottleAtPos4.getprestatus()){//sysj\controller.sysj line: 204, column: 12
                                      System.out.println("Capper doing work...");//sysj\controller.sysj line: 205, column: 5
                                      thread118591(tdone,ends);
                                      thread118592(tdone,ends);
                                      thread118593(tdone,ends);
                                      thread118597(tdone,ends);
                                      int biggest118598 = 0;
                                      if(ends[14]>=biggest118598){
                                        biggest118598=ends[14];
                                      }
                                      if(ends[15]>=biggest118598){
                                        biggest118598=ends[15];
                                      }
                                      if(ends[16]>=biggest118598){
                                        biggest118598=ends[16];
                                      }
                                      if(ends[19]>=biggest118598){
                                        biggest118598=ends[19];
                                      }
                                      if(biggest118598 == 1){
                                        active[13]=1;
                                        ends[13]=1;
                                        break RUN;
                                      }
                                    }
                                    else {
                                      S97938=3;
                                      S98701=0;
                                      if(!capperStatus_o.isPartnerPresent() || capperStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 242, column: 4
                                        capperStatus_o.setREQ(false);//sysj\controller.sysj line: 242, column: 4
                                        S98701=1;
                                        active[13]=1;
                                        ends[13]=1;
                                        break RUN;
                                      }
                                      else {
                                        S98696=0;
                                        if(capperStatus_o.isACK()){//sysj\controller.sysj line: 242, column: 4
                                          capperStatus_o.setVal("done");//sysj\controller.sysj line: 242, column: 4
                                          S98696=1;
                                          if(!capperStatus_o.isACK()){//sysj\controller.sysj line: 242, column: 4
                                            capperStatus_o.setREQ(false);//sysj\controller.sysj line: 242, column: 4
                                            ends[13]=2;
                                            ;//sysj\controller.sysj line: 242, column: 4
                                            S97823=2;
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
                          S97830=1;
                          S97830=0;
                          if(!capperStatus_o.isPartnerPresent() || capperStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 198, column: 4
                            capperStatus_o.setREQ(false);//sysj\controller.sysj line: 198, column: 4
                            S97830=1;
                            active[13]=1;
                            ends[13]=1;
                            break RUN;
                          }
                          else {
                            S97825=0;
                            if(capperStatus_o.isACK()){//sysj\controller.sysj line: 198, column: 4
                              capperStatus_o.setVal("busy");//sysj\controller.sysj line: 198, column: 4
                              S97825=1;
                              if(!capperStatus_o.isACK()){//sysj\controller.sysj line: 198, column: 4
                                capperStatus_o.setREQ(false);//sysj\controller.sysj line: 198, column: 4
                                ends[13]=2;
                                ;//sysj\controller.sysj line: 198, column: 4
                                S97938=1;
                                if(!bottleAtPos4.getprestatus()){//sysj\controller.sysj line: 200, column: 13
                                  S97852=0;
                                  if(!capperStatus_o.isPartnerPresent() || capperStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 201, column: 5
                                    capperStatus_o.setREQ(false);//sysj\controller.sysj line: 201, column: 5
                                    S97852=1;
                                    active[13]=1;
                                    ends[13]=1;
                                    break RUN;
                                  }
                                  else {
                                    S97847=0;
                                    if(capperStatus_o.isACK()){//sysj\controller.sysj line: 201, column: 5
                                      capperStatus_o.setVal("idle");//sysj\controller.sysj line: 201, column: 5
                                      S97847=1;
                                      if(!capperStatus_o.isACK()){//sysj\controller.sysj line: 201, column: 5
                                        capperStatus_o.setREQ(false);//sysj\controller.sysj line: 201, column: 5
                                        ends[13]=2;
                                        ;//sysj\controller.sysj line: 201, column: 5
                                        S97938=2;
                                        if(bottleAtPos4.getprestatus()){//sysj\controller.sysj line: 204, column: 12
                                          System.out.println("Capper doing work...");//sysj\controller.sysj line: 205, column: 5
                                          thread118599(tdone,ends);
                                          thread118600(tdone,ends);
                                          thread118601(tdone,ends);
                                          thread118605(tdone,ends);
                                          int biggest118606 = 0;
                                          if(ends[14]>=biggest118606){
                                            biggest118606=ends[14];
                                          }
                                          if(ends[15]>=biggest118606){
                                            biggest118606=ends[15];
                                          }
                                          if(ends[16]>=biggest118606){
                                            biggest118606=ends[16];
                                          }
                                          if(ends[19]>=biggest118606){
                                            biggest118606=ends[19];
                                          }
                                          if(biggest118606 == 1){
                                            active[13]=1;
                                            ends[13]=1;
                                            break RUN;
                                          }
                                        }
                                        else {
                                          S97938=3;
                                          S98701=0;
                                          if(!capperStatus_o.isPartnerPresent() || capperStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 242, column: 4
                                            capperStatus_o.setREQ(false);//sysj\controller.sysj line: 242, column: 4
                                            S98701=1;
                                            active[13]=1;
                                            ends[13]=1;
                                            break RUN;
                                          }
                                          else {
                                            S98696=0;
                                            if(capperStatus_o.isACK()){//sysj\controller.sysj line: 242, column: 4
                                              capperStatus_o.setVal("done");//sysj\controller.sysj line: 242, column: 4
                                              S98696=1;
                                              if(!capperStatus_o.isACK()){//sysj\controller.sysj line: 242, column: 4
                                                capperStatus_o.setREQ(false);//sysj\controller.sysj line: 242, column: 4
                                                ends[13]=2;
                                                ;//sysj\controller.sysj line: 242, column: 4
                                                S97823=2;
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
                                  S97938=2;
                                  if(bottleAtPos4.getprestatus()){//sysj\controller.sysj line: 204, column: 12
                                    System.out.println("Capper doing work...");//sysj\controller.sysj line: 205, column: 5
                                    thread118607(tdone,ends);
                                    thread118608(tdone,ends);
                                    thread118609(tdone,ends);
                                    thread118613(tdone,ends);
                                    int biggest118614 = 0;
                                    if(ends[14]>=biggest118614){
                                      biggest118614=ends[14];
                                    }
                                    if(ends[15]>=biggest118614){
                                      biggest118614=ends[15];
                                    }
                                    if(ends[16]>=biggest118614){
                                      biggest118614=ends[16];
                                    }
                                    if(ends[19]>=biggest118614){
                                      biggest118614=ends[19];
                                    }
                                    if(biggest118614 == 1){
                                      active[13]=1;
                                      ends[13]=1;
                                      break RUN;
                                    }
                                  }
                                  else {
                                    S97938=3;
                                    S98701=0;
                                    if(!capperStatus_o.isPartnerPresent() || capperStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 242, column: 4
                                      capperStatus_o.setREQ(false);//sysj\controller.sysj line: 242, column: 4
                                      S98701=1;
                                      active[13]=1;
                                      ends[13]=1;
                                      break RUN;
                                    }
                                    else {
                                      S98696=0;
                                      if(capperStatus_o.isACK()){//sysj\controller.sysj line: 242, column: 4
                                        capperStatus_o.setVal("done");//sysj\controller.sysj line: 242, column: 4
                                        S98696=1;
                                        if(!capperStatus_o.isACK()){//sysj\controller.sysj line: 242, column: 4
                                          capperStatus_o.setREQ(false);//sysj\controller.sysj line: 242, column: 4
                                          ends[13]=2;
                                          ;//sysj\controller.sysj line: 242, column: 4
                                          S97823=2;
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
                      switch(S97852){
                        case 0 : 
                          if(!capperStatus_o.isPartnerPresent() || capperStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 201, column: 5
                            capperStatus_o.setREQ(false);//sysj\controller.sysj line: 201, column: 5
                            S97852=1;
                            active[13]=1;
                            ends[13]=1;
                            break RUN;
                          }
                          else {
                            switch(S97847){
                              case 0 : 
                                if(capperStatus_o.isACK()){//sysj\controller.sysj line: 201, column: 5
                                  capperStatus_o.setVal("idle");//sysj\controller.sysj line: 201, column: 5
                                  S97847=1;
                                  if(!capperStatus_o.isACK()){//sysj\controller.sysj line: 201, column: 5
                                    capperStatus_o.setREQ(false);//sysj\controller.sysj line: 201, column: 5
                                    ends[13]=2;
                                    ;//sysj\controller.sysj line: 201, column: 5
                                    S97938=2;
                                    if(bottleAtPos4.getprestatus()){//sysj\controller.sysj line: 204, column: 12
                                      System.out.println("Capper doing work...");//sysj\controller.sysj line: 205, column: 5
                                      thread118615(tdone,ends);
                                      thread118616(tdone,ends);
                                      thread118617(tdone,ends);
                                      thread118621(tdone,ends);
                                      int biggest118622 = 0;
                                      if(ends[14]>=biggest118622){
                                        biggest118622=ends[14];
                                      }
                                      if(ends[15]>=biggest118622){
                                        biggest118622=ends[15];
                                      }
                                      if(ends[16]>=biggest118622){
                                        biggest118622=ends[16];
                                      }
                                      if(ends[19]>=biggest118622){
                                        biggest118622=ends[19];
                                      }
                                      if(biggest118622 == 1){
                                        active[13]=1;
                                        ends[13]=1;
                                        break RUN;
                                      }
                                    }
                                    else {
                                      S97938=3;
                                      S98701=0;
                                      if(!capperStatus_o.isPartnerPresent() || capperStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 242, column: 4
                                        capperStatus_o.setREQ(false);//sysj\controller.sysj line: 242, column: 4
                                        S98701=1;
                                        active[13]=1;
                                        ends[13]=1;
                                        break RUN;
                                      }
                                      else {
                                        S98696=0;
                                        if(capperStatus_o.isACK()){//sysj\controller.sysj line: 242, column: 4
                                          capperStatus_o.setVal("done");//sysj\controller.sysj line: 242, column: 4
                                          S98696=1;
                                          if(!capperStatus_o.isACK()){//sysj\controller.sysj line: 242, column: 4
                                            capperStatus_o.setREQ(false);//sysj\controller.sysj line: 242, column: 4
                                            ends[13]=2;
                                            ;//sysj\controller.sysj line: 242, column: 4
                                            S97823=2;
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
                                  S97938=2;
                                  if(bottleAtPos4.getprestatus()){//sysj\controller.sysj line: 204, column: 12
                                    System.out.println("Capper doing work...");//sysj\controller.sysj line: 205, column: 5
                                    thread118623(tdone,ends);
                                    thread118624(tdone,ends);
                                    thread118625(tdone,ends);
                                    thread118629(tdone,ends);
                                    int biggest118630 = 0;
                                    if(ends[14]>=biggest118630){
                                      biggest118630=ends[14];
                                    }
                                    if(ends[15]>=biggest118630){
                                      biggest118630=ends[15];
                                    }
                                    if(ends[16]>=biggest118630){
                                      biggest118630=ends[16];
                                    }
                                    if(ends[19]>=biggest118630){
                                      biggest118630=ends[19];
                                    }
                                    if(biggest118630 == 1){
                                      active[13]=1;
                                      ends[13]=1;
                                      break RUN;
                                    }
                                  }
                                  else {
                                    S97938=3;
                                    S98701=0;
                                    if(!capperStatus_o.isPartnerPresent() || capperStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 242, column: 4
                                      capperStatus_o.setREQ(false);//sysj\controller.sysj line: 242, column: 4
                                      S98701=1;
                                      active[13]=1;
                                      ends[13]=1;
                                      break RUN;
                                    }
                                    else {
                                      S98696=0;
                                      if(capperStatus_o.isACK()){//sysj\controller.sysj line: 242, column: 4
                                        capperStatus_o.setVal("done");//sysj\controller.sysj line: 242, column: 4
                                        S98696=1;
                                        if(!capperStatus_o.isACK()){//sysj\controller.sysj line: 242, column: 4
                                          capperStatus_o.setREQ(false);//sysj\controller.sysj line: 242, column: 4
                                          ends[13]=2;
                                          ;//sysj\controller.sysj line: 242, column: 4
                                          S97823=2;
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
                          S97852=1;
                          S97852=0;
                          if(!capperStatus_o.isPartnerPresent() || capperStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 201, column: 5
                            capperStatus_o.setREQ(false);//sysj\controller.sysj line: 201, column: 5
                            S97852=1;
                            active[13]=1;
                            ends[13]=1;
                            break RUN;
                          }
                          else {
                            S97847=0;
                            if(capperStatus_o.isACK()){//sysj\controller.sysj line: 201, column: 5
                              capperStatus_o.setVal("idle");//sysj\controller.sysj line: 201, column: 5
                              S97847=1;
                              if(!capperStatus_o.isACK()){//sysj\controller.sysj line: 201, column: 5
                                capperStatus_o.setREQ(false);//sysj\controller.sysj line: 201, column: 5
                                ends[13]=2;
                                ;//sysj\controller.sysj line: 201, column: 5
                                S97938=2;
                                if(bottleAtPos4.getprestatus()){//sysj\controller.sysj line: 204, column: 12
                                  System.out.println("Capper doing work...");//sysj\controller.sysj line: 205, column: 5
                                  thread118631(tdone,ends);
                                  thread118632(tdone,ends);
                                  thread118633(tdone,ends);
                                  thread118637(tdone,ends);
                                  int biggest118638 = 0;
                                  if(ends[14]>=biggest118638){
                                    biggest118638=ends[14];
                                  }
                                  if(ends[15]>=biggest118638){
                                    biggest118638=ends[15];
                                  }
                                  if(ends[16]>=biggest118638){
                                    biggest118638=ends[16];
                                  }
                                  if(ends[19]>=biggest118638){
                                    biggest118638=ends[19];
                                  }
                                  if(biggest118638 == 1){
                                    active[13]=1;
                                    ends[13]=1;
                                    break RUN;
                                  }
                                }
                                else {
                                  S97938=3;
                                  S98701=0;
                                  if(!capperStatus_o.isPartnerPresent() || capperStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 242, column: 4
                                    capperStatus_o.setREQ(false);//sysj\controller.sysj line: 242, column: 4
                                    S98701=1;
                                    active[13]=1;
                                    ends[13]=1;
                                    break RUN;
                                  }
                                  else {
                                    S98696=0;
                                    if(capperStatus_o.isACK()){//sysj\controller.sysj line: 242, column: 4
                                      capperStatus_o.setVal("done");//sysj\controller.sysj line: 242, column: 4
                                      S98696=1;
                                      if(!capperStatus_o.isACK()){//sysj\controller.sysj line: 242, column: 4
                                        capperStatus_o.setREQ(false);//sysj\controller.sysj line: 242, column: 4
                                        ends[13]=2;
                                        ;//sysj\controller.sysj line: 242, column: 4
                                        S97823=2;
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
                      thread118639(tdone,ends);
                      thread118640(tdone,ends);
                      thread118641(tdone,ends);
                      thread118645(tdone,ends);
                      int biggest118646 = 0;
                      if(ends[14]>=biggest118646){
                        biggest118646=ends[14];
                      }
                      if(ends[15]>=biggest118646){
                        biggest118646=ends[15];
                      }
                      if(ends[16]>=biggest118646){
                        biggest118646=ends[16];
                      }
                      if(ends[19]>=biggest118646){
                        biggest118646=ends[19];
                      }
                      if(biggest118646 == 1){
                        active[13]=1;
                        ends[13]=1;
                        break RUN;
                      }
                      //FINXME code
                      if(biggest118646 == 0){
                        S97938=3;
                        S98701=0;
                        if(!capperStatus_o.isPartnerPresent() || capperStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 242, column: 4
                          capperStatus_o.setREQ(false);//sysj\controller.sysj line: 242, column: 4
                          S98701=1;
                          active[13]=1;
                          ends[13]=1;
                          break RUN;
                        }
                        else {
                          S98696=0;
                          if(capperStatus_o.isACK()){//sysj\controller.sysj line: 242, column: 4
                            capperStatus_o.setVal("done");//sysj\controller.sysj line: 242, column: 4
                            S98696=1;
                            if(!capperStatus_o.isACK()){//sysj\controller.sysj line: 242, column: 4
                              capperStatus_o.setREQ(false);//sysj\controller.sysj line: 242, column: 4
                              ends[13]=2;
                              ;//sysj\controller.sysj line: 242, column: 4
                              S97823=2;
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
                      switch(S98701){
                        case 0 : 
                          if(!capperStatus_o.isPartnerPresent() || capperStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 242, column: 4
                            capperStatus_o.setREQ(false);//sysj\controller.sysj line: 242, column: 4
                            S98701=1;
                            active[13]=1;
                            ends[13]=1;
                            break RUN;
                          }
                          else {
                            switch(S98696){
                              case 0 : 
                                if(capperStatus_o.isACK()){//sysj\controller.sysj line: 242, column: 4
                                  capperStatus_o.setVal("done");//sysj\controller.sysj line: 242, column: 4
                                  S98696=1;
                                  if(!capperStatus_o.isACK()){//sysj\controller.sysj line: 242, column: 4
                                    capperStatus_o.setREQ(false);//sysj\controller.sysj line: 242, column: 4
                                    ends[13]=2;
                                    ;//sysj\controller.sysj line: 242, column: 4
                                    S97823=2;
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
                                  S97823=2;
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
                          S98701=1;
                          S98701=0;
                          if(!capperStatus_o.isPartnerPresent() || capperStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 242, column: 4
                            capperStatus_o.setREQ(false);//sysj\controller.sysj line: 242, column: 4
                            S98701=1;
                            active[13]=1;
                            ends[13]=1;
                            break RUN;
                          }
                          else {
                            S98696=0;
                            if(capperStatus_o.isACK()){//sysj\controller.sysj line: 242, column: 4
                              capperStatus_o.setVal("done");//sysj\controller.sysj line: 242, column: 4
                              S98696=1;
                              if(!capperStatus_o.isACK()){//sysj\controller.sysj line: 242, column: 4
                                capperStatus_o.setREQ(false);//sysj\controller.sysj line: 242, column: 4
                                ends[13]=2;
                                ;//sysj\controller.sysj line: 242, column: 4
                                S97823=2;
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
                  switch(S98921){
                    case 0 : 
                      if(!capperStatus_o.isPartnerPresent() || capperStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 244, column: 4
                        capperStatus_o.setREQ(false);//sysj\controller.sysj line: 244, column: 4
                        S98921=1;
                        active[13]=1;
                        ends[13]=1;
                        break RUN;
                      }
                      else {
                        switch(S98916){
                          case 0 : 
                            if(capperStatus_o.isACK()){//sysj\controller.sysj line: 244, column: 4
                              capperStatus_o.setVal("idle");//sysj\controller.sysj line: 244, column: 4
                              S98916=1;
                              if(!capperStatus_o.isACK()){//sysj\controller.sysj line: 244, column: 4
                                capperStatus_o.setREQ(false);//sysj\controller.sysj line: 244, column: 4
                                ends[13]=2;
                                ;//sysj\controller.sysj line: 244, column: 4
                                S97823=2;
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
                              S97823=2;
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
                      S98921=1;
                      S98921=0;
                      if(!capperStatus_o.isPartnerPresent() || capperStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 244, column: 4
                        capperStatus_o.setREQ(false);//sysj\controller.sysj line: 244, column: 4
                        S98921=1;
                        active[13]=1;
                        ends[13]=1;
                        break RUN;
                      }
                      else {
                        S98916=0;
                        if(capperStatus_o.isACK()){//sysj\controller.sysj line: 244, column: 4
                          capperStatus_o.setVal("idle");//sysj\controller.sysj line: 244, column: 4
                          S98916=1;
                          if(!capperStatus_o.isACK()){//sysj\controller.sysj line: 244, column: 4
                            capperStatus_o.setREQ(false);//sysj\controller.sysj line: 244, column: 4
                            ends[13]=2;
                            ;//sysj\controller.sysj line: 244, column: 4
                            S97823=2;
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
              S97823=2;
              S97823=0;
              S97807=0;
              if(!capperReq_in.isPartnerPresent() || capperReq_in.isPartnerPreempted()){//sysj\controller.sysj line: 194, column: 3
                capperReq_in.setACK(false);//sysj\controller.sysj line: 194, column: 3
                S97807=1;
                active[13]=1;
                ends[13]=1;
                break RUN;
              }
              else {
                S97802=0;
                if(!capperReq_in.isREQ()){//sysj\controller.sysj line: 194, column: 3
                  capperReq_in.setACK(true);//sysj\controller.sysj line: 194, column: 3
                  S97802=1;
                  if(capperReq_in.isREQ()){//sysj\controller.sysj line: 194, column: 3
                    capperReq_in.setACK(false);//sysj\controller.sysj line: 194, column: 3
                    ends[13]=2;
                    ;//sysj\controller.sysj line: 194, column: 3
                    request_thread_13 = (boolean)(capperReq_in.getVal() == null ? false : ((Boolean)capperReq_in.getVal()).booleanValue());//sysj\controller.sysj line: 195, column: 3
                    S97823=1;
                    if(request_thread_13){//sysj\controller.sysj line: 197, column: 3
                      S98937=0;
                      S97938=0;
                      S97830=0;
                      if(!capperStatus_o.isPartnerPresent() || capperStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 198, column: 4
                        capperStatus_o.setREQ(false);//sysj\controller.sysj line: 198, column: 4
                        S97830=1;
                        active[13]=1;
                        ends[13]=1;
                        break RUN;
                      }
                      else {
                        S97825=0;
                        if(capperStatus_o.isACK()){//sysj\controller.sysj line: 198, column: 4
                          capperStatus_o.setVal("busy");//sysj\controller.sysj line: 198, column: 4
                          S97825=1;
                          if(!capperStatus_o.isACK()){//sysj\controller.sysj line: 198, column: 4
                            capperStatus_o.setREQ(false);//sysj\controller.sysj line: 198, column: 4
                            ends[13]=2;
                            ;//sysj\controller.sysj line: 198, column: 4
                            S97938=1;
                            if(!bottleAtPos4.getprestatus()){//sysj\controller.sysj line: 200, column: 13
                              S97852=0;
                              if(!capperStatus_o.isPartnerPresent() || capperStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 201, column: 5
                                capperStatus_o.setREQ(false);//sysj\controller.sysj line: 201, column: 5
                                S97852=1;
                                active[13]=1;
                                ends[13]=1;
                                break RUN;
                              }
                              else {
                                S97847=0;
                                if(capperStatus_o.isACK()){//sysj\controller.sysj line: 201, column: 5
                                  capperStatus_o.setVal("idle");//sysj\controller.sysj line: 201, column: 5
                                  S97847=1;
                                  if(!capperStatus_o.isACK()){//sysj\controller.sysj line: 201, column: 5
                                    capperStatus_o.setREQ(false);//sysj\controller.sysj line: 201, column: 5
                                    ends[13]=2;
                                    ;//sysj\controller.sysj line: 201, column: 5
                                    S97938=2;
                                    if(bottleAtPos4.getprestatus()){//sysj\controller.sysj line: 204, column: 12
                                      System.out.println("Capper doing work...");//sysj\controller.sysj line: 205, column: 5
                                      thread118647(tdone,ends);
                                      thread118648(tdone,ends);
                                      thread118649(tdone,ends);
                                      thread118653(tdone,ends);
                                      int biggest118654 = 0;
                                      if(ends[14]>=biggest118654){
                                        biggest118654=ends[14];
                                      }
                                      if(ends[15]>=biggest118654){
                                        biggest118654=ends[15];
                                      }
                                      if(ends[16]>=biggest118654){
                                        biggest118654=ends[16];
                                      }
                                      if(ends[19]>=biggest118654){
                                        biggest118654=ends[19];
                                      }
                                      if(biggest118654 == 1){
                                        active[13]=1;
                                        ends[13]=1;
                                        break RUN;
                                      }
                                    }
                                    else {
                                      S97938=3;
                                      S98701=0;
                                      if(!capperStatus_o.isPartnerPresent() || capperStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 242, column: 4
                                        capperStatus_o.setREQ(false);//sysj\controller.sysj line: 242, column: 4
                                        S98701=1;
                                        active[13]=1;
                                        ends[13]=1;
                                        break RUN;
                                      }
                                      else {
                                        S98696=0;
                                        if(capperStatus_o.isACK()){//sysj\controller.sysj line: 242, column: 4
                                          capperStatus_o.setVal("done");//sysj\controller.sysj line: 242, column: 4
                                          S98696=1;
                                          if(!capperStatus_o.isACK()){//sysj\controller.sysj line: 242, column: 4
                                            capperStatus_o.setREQ(false);//sysj\controller.sysj line: 242, column: 4
                                            ends[13]=2;
                                            ;//sysj\controller.sysj line: 242, column: 4
                                            S97823=2;
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
                              S97938=2;
                              if(bottleAtPos4.getprestatus()){//sysj\controller.sysj line: 204, column: 12
                                System.out.println("Capper doing work...");//sysj\controller.sysj line: 205, column: 5
                                thread118655(tdone,ends);
                                thread118656(tdone,ends);
                                thread118657(tdone,ends);
                                thread118661(tdone,ends);
                                int biggest118662 = 0;
                                if(ends[14]>=biggest118662){
                                  biggest118662=ends[14];
                                }
                                if(ends[15]>=biggest118662){
                                  biggest118662=ends[15];
                                }
                                if(ends[16]>=biggest118662){
                                  biggest118662=ends[16];
                                }
                                if(ends[19]>=biggest118662){
                                  biggest118662=ends[19];
                                }
                                if(biggest118662 == 1){
                                  active[13]=1;
                                  ends[13]=1;
                                  break RUN;
                                }
                              }
                              else {
                                S97938=3;
                                S98701=0;
                                if(!capperStatus_o.isPartnerPresent() || capperStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 242, column: 4
                                  capperStatus_o.setREQ(false);//sysj\controller.sysj line: 242, column: 4
                                  S98701=1;
                                  active[13]=1;
                                  ends[13]=1;
                                  break RUN;
                                }
                                else {
                                  S98696=0;
                                  if(capperStatus_o.isACK()){//sysj\controller.sysj line: 242, column: 4
                                    capperStatus_o.setVal("done");//sysj\controller.sysj line: 242, column: 4
                                    S98696=1;
                                    if(!capperStatus_o.isACK()){//sysj\controller.sysj line: 242, column: 4
                                      capperStatus_o.setREQ(false);//sysj\controller.sysj line: 242, column: 4
                                      ends[13]=2;
                                      ;//sysj\controller.sysj line: 242, column: 4
                                      S97823=2;
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
                      S98937=1;
                      S98921=0;
                      if(!capperStatus_o.isPartnerPresent() || capperStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 244, column: 4
                        capperStatus_o.setREQ(false);//sysj\controller.sysj line: 244, column: 4
                        S98921=1;
                        active[13]=1;
                        ends[13]=1;
                        break RUN;
                      }
                      else {
                        S98916=0;
                        if(capperStatus_o.isACK()){//sysj\controller.sysj line: 244, column: 4
                          capperStatus_o.setVal("idle");//sysj\controller.sysj line: 244, column: 4
                          S98916=1;
                          if(!capperStatus_o.isACK()){//sysj\controller.sysj line: 244, column: 4
                            capperStatus_o.setREQ(false);//sysj\controller.sysj line: 244, column: 4
                            ends[13]=2;
                            ;//sysj\controller.sysj line: 244, column: 4
                            S97823=2;
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
