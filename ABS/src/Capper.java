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
  private boolean request_thread_13;//sysj\controller.sysj line: 196, column: 3
  private int S112133 = 1;
  private int S98717 = 1;
  private int S98701 = 1;
  private int S98696 = 1;
  private int S99831 = 1;
  private int S98832 = 1;
  private int S98724 = 1;
  private int S98719 = 1;
  private int S98746 = 1;
  private int S98741 = 1;
  private int S98838 = 1;
  private int S98844 = 1;
  private int S98860 = 1;
  private int S98859 = 1;
  private int S98847 = 1;
  private int S98850 = 1;
  private int S98873 = 1;
  private int S98870 = 1;
  private int S99595 = 1;
  private int S99590 = 1;
  private int S99815 = 1;
  private int S99810 = 1;
  
  private int[] ends = new int[23];
  private int[] tdone = new int[23];
  
  public void thread116723(int [] tdone, int [] ends){
        S98873=1;
    S98870=0;
    active[19]=1;
    ends[19]=1;
    tdone[19]=1;
  }

  public void thread116721(int [] tdone, int [] ends){
        S98850=1;
    active[18]=1;
    ends[18]=1;
    tdone[18]=1;
  }

  public void thread116720(int [] tdone, int [] ends){
        S98847=1;
    active[17]=1;
    ends[17]=1;
    tdone[17]=1;
  }

  public void thread116719(int [] tdone, int [] ends){
        S98860=1;
    S98859=0;
    thread116720(tdone,ends);
    thread116721(tdone,ends);
    int biggest116722 = 0;
    if(ends[17]>=biggest116722){
      biggest116722=ends[17];
    }
    if(ends[18]>=biggest116722){
      biggest116722=ends[18];
    }
    if(biggest116722 == 1){
      active[16]=1;
      ends[16]=1;
      tdone[16]=1;
    }
  }

  public void thread116718(int [] tdone, int [] ends){
        S98844=1;
    cylPos5ZAxisExtend.setPresent();//sysj\controller.sysj line: 215, column: 7
    currsigs.addElement(cylPos5ZAxisExtend);
    active[15]=1;
    ends[15]=1;
    tdone[15]=1;
  }

  public void thread116717(int [] tdone, int [] ends){
        S98838=1;
    cylClampBottleExtend.setPresent();//sysj\controller.sysj line: 209, column: 7
    currsigs.addElement(cylClampBottleExtend);
    active[14]=1;
    ends[14]=1;
    tdone[14]=1;
  }

  public void thread116715(int [] tdone, int [] ends){
        S98873=1;
    S98870=0;
    active[19]=1;
    ends[19]=1;
    tdone[19]=1;
  }

  public void thread116713(int [] tdone, int [] ends){
        S98850=1;
    active[18]=1;
    ends[18]=1;
    tdone[18]=1;
  }

  public void thread116712(int [] tdone, int [] ends){
        S98847=1;
    active[17]=1;
    ends[17]=1;
    tdone[17]=1;
  }

  public void thread116711(int [] tdone, int [] ends){
        S98860=1;
    S98859=0;
    thread116712(tdone,ends);
    thread116713(tdone,ends);
    int biggest116714 = 0;
    if(ends[17]>=biggest116714){
      biggest116714=ends[17];
    }
    if(ends[18]>=biggest116714){
      biggest116714=ends[18];
    }
    if(biggest116714 == 1){
      active[16]=1;
      ends[16]=1;
      tdone[16]=1;
    }
  }

  public void thread116710(int [] tdone, int [] ends){
        S98844=1;
    cylPos5ZAxisExtend.setPresent();//sysj\controller.sysj line: 215, column: 7
    currsigs.addElement(cylPos5ZAxisExtend);
    active[15]=1;
    ends[15]=1;
    tdone[15]=1;
  }

  public void thread116709(int [] tdone, int [] ends){
        S98838=1;
    cylClampBottleExtend.setPresent();//sysj\controller.sysj line: 209, column: 7
    currsigs.addElement(cylClampBottleExtend);
    active[14]=1;
    ends[14]=1;
    tdone[14]=1;
  }

  public void thread116707(int [] tdone, int [] ends){
        switch(S98873){
      case 0 : 
        active[19]=0;
        ends[19]=0;
        tdone[19]=1;
        break;
      
      case 1 : 
        switch(S98870){
          case 0 : 
            if(gripperGrippedCap.getprestatus()){//sysj\controller.sysj line: 228, column: 12
              S98870=1;
              gripperTurnExtend.setPresent();//sysj\controller.sysj line: 231, column: 7
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
            if(gripperTurnFinalPos.getprestatus()){//sysj\controller.sysj line: 230, column: 13
              releaseCap_13.setPresent();//sysj\controller.sysj line: 233, column: 6
              currsigs.addElement(releaseCap_13);
              untwistGripper_13.setPresent();//sysj\controller.sysj line: 236, column: 7
              currsigs.addElement(untwistGripper_13);
              raiseGripper_13.setPresent();//sysj\controller.sysj line: 239, column: 6
              currsigs.addElement(raiseGripper_13);
              unclampBottle_13.setPresent();//sysj\controller.sysj line: 240, column: 6
              currsigs.addElement(unclampBottle_13);
              S98873=0;
              active[19]=0;
              ends[19]=0;
              tdone[19]=1;
            }
            else {
              gripperTurnExtend.setPresent();//sysj\controller.sysj line: 231, column: 7
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

  public void thread116705(int [] tdone, int [] ends){
        switch(S98850){
      case 0 : 
        active[18]=0;
        ends[18]=0;
        tdone[18]=1;
        break;
      
      case 1 : 
        if(cylClampedBottle.getprestatus()){//sysj\controller.sysj line: 221, column: 46
          S98850=0;
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

  public void thread116704(int [] tdone, int [] ends){
        switch(S98847){
      case 0 : 
        active[17]=0;
        ends[17]=0;
        tdone[17]=1;
        break;
      
      case 1 : 
        if(gripperZAxisLowered.getprestatus()){//sysj\controller.sysj line: 221, column: 13
          S98847=0;
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

  public void thread116703(int [] tdone, int [] ends){
        switch(S98860){
      case 0 : 
        active[16]=0;
        ends[16]=0;
        tdone[16]=1;
        break;
      
      case 1 : 
        switch(S98859){
          case 0 : 
            thread116704(tdone,ends);
            thread116705(tdone,ends);
            int biggest116706 = 0;
            if(ends[17]>=biggest116706){
              biggest116706=ends[17];
            }
            if(ends[18]>=biggest116706){
              biggest116706=ends[18];
            }
            if(biggest116706 == 1){
              active[16]=1;
              ends[16]=1;
              tdone[16]=1;
            }
            //FINXME code
            if(biggest116706 == 0){
              S98859=1;
              capGripperPos5Extend.setPresent();//sysj\controller.sysj line: 223, column: 7
              currsigs.addElement(capGripperPos5Extend);
              active[16]=1;
              ends[16]=1;
              tdone[16]=1;
            }
            break;
          
          case 1 : 
            if(releaseCap_13.getprestatus()){//sysj\controller.sysj line: 222, column: 12
              S98860=0;
              active[16]=0;
              ends[16]=0;
              tdone[16]=1;
            }
            else {
              capGripperPos5Extend.setPresent();//sysj\controller.sysj line: 223, column: 7
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

  public void thread116702(int [] tdone, int [] ends){
        switch(S98844){
      case 0 : 
        active[15]=0;
        ends[15]=0;
        tdone[15]=1;
        break;
      
      case 1 : 
        if(raiseGripper_13.getprestatus()){//sysj\controller.sysj line: 214, column: 12
          S98844=0;
          active[15]=0;
          ends[15]=0;
          tdone[15]=1;
        }
        else {
          cylPos5ZAxisExtend.setPresent();//sysj\controller.sysj line: 215, column: 7
          currsigs.addElement(cylPos5ZAxisExtend);
          active[15]=1;
          ends[15]=1;
          tdone[15]=1;
        }
        break;
      
    }
  }

  public void thread116701(int [] tdone, int [] ends){
        switch(S98838){
      case 0 : 
        active[14]=0;
        ends[14]=0;
        tdone[14]=1;
        break;
      
      case 1 : 
        if(unclampBottle_13.getprestatus()){//sysj\controller.sysj line: 208, column: 13
          S98838=0;
          active[14]=0;
          ends[14]=0;
          tdone[14]=1;
        }
        else {
          cylClampBottleExtend.setPresent();//sysj\controller.sysj line: 209, column: 7
          currsigs.addElement(cylClampBottleExtend);
          active[14]=1;
          ends[14]=1;
          tdone[14]=1;
        }
        break;
      
    }
  }

  public void thread116699(int [] tdone, int [] ends){
        S98873=1;
    S98870=0;
    active[19]=1;
    ends[19]=1;
    tdone[19]=1;
  }

  public void thread116697(int [] tdone, int [] ends){
        S98850=1;
    active[18]=1;
    ends[18]=1;
    tdone[18]=1;
  }

  public void thread116696(int [] tdone, int [] ends){
        S98847=1;
    active[17]=1;
    ends[17]=1;
    tdone[17]=1;
  }

  public void thread116695(int [] tdone, int [] ends){
        S98860=1;
    S98859=0;
    thread116696(tdone,ends);
    thread116697(tdone,ends);
    int biggest116698 = 0;
    if(ends[17]>=biggest116698){
      biggest116698=ends[17];
    }
    if(ends[18]>=biggest116698){
      biggest116698=ends[18];
    }
    if(biggest116698 == 1){
      active[16]=1;
      ends[16]=1;
      tdone[16]=1;
    }
  }

  public void thread116694(int [] tdone, int [] ends){
        S98844=1;
    cylPos5ZAxisExtend.setPresent();//sysj\controller.sysj line: 215, column: 7
    currsigs.addElement(cylPos5ZAxisExtend);
    active[15]=1;
    ends[15]=1;
    tdone[15]=1;
  }

  public void thread116693(int [] tdone, int [] ends){
        S98838=1;
    cylClampBottleExtend.setPresent();//sysj\controller.sysj line: 209, column: 7
    currsigs.addElement(cylClampBottleExtend);
    active[14]=1;
    ends[14]=1;
    tdone[14]=1;
  }

  public void thread116691(int [] tdone, int [] ends){
        S98873=1;
    S98870=0;
    active[19]=1;
    ends[19]=1;
    tdone[19]=1;
  }

  public void thread116689(int [] tdone, int [] ends){
        S98850=1;
    active[18]=1;
    ends[18]=1;
    tdone[18]=1;
  }

  public void thread116688(int [] tdone, int [] ends){
        S98847=1;
    active[17]=1;
    ends[17]=1;
    tdone[17]=1;
  }

  public void thread116687(int [] tdone, int [] ends){
        S98860=1;
    S98859=0;
    thread116688(tdone,ends);
    thread116689(tdone,ends);
    int biggest116690 = 0;
    if(ends[17]>=biggest116690){
      biggest116690=ends[17];
    }
    if(ends[18]>=biggest116690){
      biggest116690=ends[18];
    }
    if(biggest116690 == 1){
      active[16]=1;
      ends[16]=1;
      tdone[16]=1;
    }
  }

  public void thread116686(int [] tdone, int [] ends){
        S98844=1;
    cylPos5ZAxisExtend.setPresent();//sysj\controller.sysj line: 215, column: 7
    currsigs.addElement(cylPos5ZAxisExtend);
    active[15]=1;
    ends[15]=1;
    tdone[15]=1;
  }

  public void thread116685(int [] tdone, int [] ends){
        S98838=1;
    cylClampBottleExtend.setPresent();//sysj\controller.sysj line: 209, column: 7
    currsigs.addElement(cylClampBottleExtend);
    active[14]=1;
    ends[14]=1;
    tdone[14]=1;
  }

  public void thread116683(int [] tdone, int [] ends){
        S98873=1;
    S98870=0;
    active[19]=1;
    ends[19]=1;
    tdone[19]=1;
  }

  public void thread116681(int [] tdone, int [] ends){
        S98850=1;
    active[18]=1;
    ends[18]=1;
    tdone[18]=1;
  }

  public void thread116680(int [] tdone, int [] ends){
        S98847=1;
    active[17]=1;
    ends[17]=1;
    tdone[17]=1;
  }

  public void thread116679(int [] tdone, int [] ends){
        S98860=1;
    S98859=0;
    thread116680(tdone,ends);
    thread116681(tdone,ends);
    int biggest116682 = 0;
    if(ends[17]>=biggest116682){
      biggest116682=ends[17];
    }
    if(ends[18]>=biggest116682){
      biggest116682=ends[18];
    }
    if(biggest116682 == 1){
      active[16]=1;
      ends[16]=1;
      tdone[16]=1;
    }
  }

  public void thread116678(int [] tdone, int [] ends){
        S98844=1;
    cylPos5ZAxisExtend.setPresent();//sysj\controller.sysj line: 215, column: 7
    currsigs.addElement(cylPos5ZAxisExtend);
    active[15]=1;
    ends[15]=1;
    tdone[15]=1;
  }

  public void thread116677(int [] tdone, int [] ends){
        S98838=1;
    cylClampBottleExtend.setPresent();//sysj\controller.sysj line: 209, column: 7
    currsigs.addElement(cylClampBottleExtend);
    active[14]=1;
    ends[14]=1;
    tdone[14]=1;
  }

  public void thread116675(int [] tdone, int [] ends){
        S98873=1;
    S98870=0;
    active[19]=1;
    ends[19]=1;
    tdone[19]=1;
  }

  public void thread116673(int [] tdone, int [] ends){
        S98850=1;
    active[18]=1;
    ends[18]=1;
    tdone[18]=1;
  }

  public void thread116672(int [] tdone, int [] ends){
        S98847=1;
    active[17]=1;
    ends[17]=1;
    tdone[17]=1;
  }

  public void thread116671(int [] tdone, int [] ends){
        S98860=1;
    S98859=0;
    thread116672(tdone,ends);
    thread116673(tdone,ends);
    int biggest116674 = 0;
    if(ends[17]>=biggest116674){
      biggest116674=ends[17];
    }
    if(ends[18]>=biggest116674){
      biggest116674=ends[18];
    }
    if(biggest116674 == 1){
      active[16]=1;
      ends[16]=1;
      tdone[16]=1;
    }
  }

  public void thread116670(int [] tdone, int [] ends){
        S98844=1;
    cylPos5ZAxisExtend.setPresent();//sysj\controller.sysj line: 215, column: 7
    currsigs.addElement(cylPos5ZAxisExtend);
    active[15]=1;
    ends[15]=1;
    tdone[15]=1;
  }

  public void thread116669(int [] tdone, int [] ends){
        S98838=1;
    cylClampBottleExtend.setPresent();//sysj\controller.sysj line: 209, column: 7
    currsigs.addElement(cylClampBottleExtend);
    active[14]=1;
    ends[14]=1;
    tdone[14]=1;
  }

  public void thread116667(int [] tdone, int [] ends){
        S98873=1;
    S98870=0;
    active[19]=1;
    ends[19]=1;
    tdone[19]=1;
  }

  public void thread116665(int [] tdone, int [] ends){
        S98850=1;
    active[18]=1;
    ends[18]=1;
    tdone[18]=1;
  }

  public void thread116664(int [] tdone, int [] ends){
        S98847=1;
    active[17]=1;
    ends[17]=1;
    tdone[17]=1;
  }

  public void thread116663(int [] tdone, int [] ends){
        S98860=1;
    S98859=0;
    thread116664(tdone,ends);
    thread116665(tdone,ends);
    int biggest116666 = 0;
    if(ends[17]>=biggest116666){
      biggest116666=ends[17];
    }
    if(ends[18]>=biggest116666){
      biggest116666=ends[18];
    }
    if(biggest116666 == 1){
      active[16]=1;
      ends[16]=1;
      tdone[16]=1;
    }
  }

  public void thread116662(int [] tdone, int [] ends){
        S98844=1;
    cylPos5ZAxisExtend.setPresent();//sysj\controller.sysj line: 215, column: 7
    currsigs.addElement(cylPos5ZAxisExtend);
    active[15]=1;
    ends[15]=1;
    tdone[15]=1;
  }

  public void thread116661(int [] tdone, int [] ends){
        S98838=1;
    cylClampBottleExtend.setPresent();//sysj\controller.sysj line: 209, column: 7
    currsigs.addElement(cylClampBottleExtend);
    active[14]=1;
    ends[14]=1;
    tdone[14]=1;
  }

  public void thread116659(int [] tdone, int [] ends){
        S98873=1;
    S98870=0;
    active[19]=1;
    ends[19]=1;
    tdone[19]=1;
  }

  public void thread116657(int [] tdone, int [] ends){
        S98850=1;
    active[18]=1;
    ends[18]=1;
    tdone[18]=1;
  }

  public void thread116656(int [] tdone, int [] ends){
        S98847=1;
    active[17]=1;
    ends[17]=1;
    tdone[17]=1;
  }

  public void thread116655(int [] tdone, int [] ends){
        S98860=1;
    S98859=0;
    thread116656(tdone,ends);
    thread116657(tdone,ends);
    int biggest116658 = 0;
    if(ends[17]>=biggest116658){
      biggest116658=ends[17];
    }
    if(ends[18]>=biggest116658){
      biggest116658=ends[18];
    }
    if(biggest116658 == 1){
      active[16]=1;
      ends[16]=1;
      tdone[16]=1;
    }
  }

  public void thread116654(int [] tdone, int [] ends){
        S98844=1;
    cylPos5ZAxisExtend.setPresent();//sysj\controller.sysj line: 215, column: 7
    currsigs.addElement(cylPos5ZAxisExtend);
    active[15]=1;
    ends[15]=1;
    tdone[15]=1;
  }

  public void thread116653(int [] tdone, int [] ends){
        S98838=1;
    cylClampBottleExtend.setPresent();//sysj\controller.sysj line: 209, column: 7
    currsigs.addElement(cylClampBottleExtend);
    active[14]=1;
    ends[14]=1;
    tdone[14]=1;
  }

  public void thread116651(int [] tdone, int [] ends){
        S98873=1;
    S98870=0;
    active[19]=1;
    ends[19]=1;
    tdone[19]=1;
  }

  public void thread116649(int [] tdone, int [] ends){
        S98850=1;
    active[18]=1;
    ends[18]=1;
    tdone[18]=1;
  }

  public void thread116648(int [] tdone, int [] ends){
        S98847=1;
    active[17]=1;
    ends[17]=1;
    tdone[17]=1;
  }

  public void thread116647(int [] tdone, int [] ends){
        S98860=1;
    S98859=0;
    thread116648(tdone,ends);
    thread116649(tdone,ends);
    int biggest116650 = 0;
    if(ends[17]>=biggest116650){
      biggest116650=ends[17];
    }
    if(ends[18]>=biggest116650){
      biggest116650=ends[18];
    }
    if(biggest116650 == 1){
      active[16]=1;
      ends[16]=1;
      tdone[16]=1;
    }
  }

  public void thread116646(int [] tdone, int [] ends){
        S98844=1;
    cylPos5ZAxisExtend.setPresent();//sysj\controller.sysj line: 215, column: 7
    currsigs.addElement(cylPos5ZAxisExtend);
    active[15]=1;
    ends[15]=1;
    tdone[15]=1;
  }

  public void thread116645(int [] tdone, int [] ends){
        S98838=1;
    cylClampBottleExtend.setPresent();//sysj\controller.sysj line: 209, column: 7
    currsigs.addElement(cylClampBottleExtend);
    active[14]=1;
    ends[14]=1;
    tdone[14]=1;
  }

  public void thread116643(int [] tdone, int [] ends){
        S98873=1;
    S98870=0;
    active[19]=1;
    ends[19]=1;
    tdone[19]=1;
  }

  public void thread116641(int [] tdone, int [] ends){
        S98850=1;
    active[18]=1;
    ends[18]=1;
    tdone[18]=1;
  }

  public void thread116640(int [] tdone, int [] ends){
        S98847=1;
    active[17]=1;
    ends[17]=1;
    tdone[17]=1;
  }

  public void thread116639(int [] tdone, int [] ends){
        S98860=1;
    S98859=0;
    thread116640(tdone,ends);
    thread116641(tdone,ends);
    int biggest116642 = 0;
    if(ends[17]>=biggest116642){
      biggest116642=ends[17];
    }
    if(ends[18]>=biggest116642){
      biggest116642=ends[18];
    }
    if(biggest116642 == 1){
      active[16]=1;
      ends[16]=1;
      tdone[16]=1;
    }
  }

  public void thread116638(int [] tdone, int [] ends){
        S98844=1;
    cylPos5ZAxisExtend.setPresent();//sysj\controller.sysj line: 215, column: 7
    currsigs.addElement(cylPos5ZAxisExtend);
    active[15]=1;
    ends[15]=1;
    tdone[15]=1;
  }

  public void thread116637(int [] tdone, int [] ends){
        S98838=1;
    cylClampBottleExtend.setPresent();//sysj\controller.sysj line: 209, column: 7
    currsigs.addElement(cylClampBottleExtend);
    active[14]=1;
    ends[14]=1;
    tdone[14]=1;
  }

  public void thread116635(int [] tdone, int [] ends){
        S98873=1;
    S98870=0;
    active[19]=1;
    ends[19]=1;
    tdone[19]=1;
  }

  public void thread116633(int [] tdone, int [] ends){
        S98850=1;
    active[18]=1;
    ends[18]=1;
    tdone[18]=1;
  }

  public void thread116632(int [] tdone, int [] ends){
        S98847=1;
    active[17]=1;
    ends[17]=1;
    tdone[17]=1;
  }

  public void thread116631(int [] tdone, int [] ends){
        S98860=1;
    S98859=0;
    thread116632(tdone,ends);
    thread116633(tdone,ends);
    int biggest116634 = 0;
    if(ends[17]>=biggest116634){
      biggest116634=ends[17];
    }
    if(ends[18]>=biggest116634){
      biggest116634=ends[18];
    }
    if(biggest116634 == 1){
      active[16]=1;
      ends[16]=1;
      tdone[16]=1;
    }
  }

  public void thread116630(int [] tdone, int [] ends){
        S98844=1;
    cylPos5ZAxisExtend.setPresent();//sysj\controller.sysj line: 215, column: 7
    currsigs.addElement(cylPos5ZAxisExtend);
    active[15]=1;
    ends[15]=1;
    tdone[15]=1;
  }

  public void thread116629(int [] tdone, int [] ends){
        S98838=1;
    cylClampBottleExtend.setPresent();//sysj\controller.sysj line: 209, column: 7
    currsigs.addElement(cylClampBottleExtend);
    active[14]=1;
    ends[14]=1;
    tdone[14]=1;
  }

  public void thread116627(int [] tdone, int [] ends){
        S98873=1;
    S98870=0;
    active[19]=1;
    ends[19]=1;
    tdone[19]=1;
  }

  public void thread116625(int [] tdone, int [] ends){
        S98850=1;
    active[18]=1;
    ends[18]=1;
    tdone[18]=1;
  }

  public void thread116624(int [] tdone, int [] ends){
        S98847=1;
    active[17]=1;
    ends[17]=1;
    tdone[17]=1;
  }

  public void thread116623(int [] tdone, int [] ends){
        S98860=1;
    S98859=0;
    thread116624(tdone,ends);
    thread116625(tdone,ends);
    int biggest116626 = 0;
    if(ends[17]>=biggest116626){
      biggest116626=ends[17];
    }
    if(ends[18]>=biggest116626){
      biggest116626=ends[18];
    }
    if(biggest116626 == 1){
      active[16]=1;
      ends[16]=1;
      tdone[16]=1;
    }
  }

  public void thread116622(int [] tdone, int [] ends){
        S98844=1;
    cylPos5ZAxisExtend.setPresent();//sysj\controller.sysj line: 215, column: 7
    currsigs.addElement(cylPos5ZAxisExtend);
    active[15]=1;
    ends[15]=1;
    tdone[15]=1;
  }

  public void thread116621(int [] tdone, int [] ends){
        S98838=1;
    cylClampBottleExtend.setPresent();//sysj\controller.sysj line: 209, column: 7
    currsigs.addElement(cylClampBottleExtend);
    active[14]=1;
    ends[14]=1;
    tdone[14]=1;
  }

  public void thread116619(int [] tdone, int [] ends){
        S98873=1;
    S98870=0;
    active[19]=1;
    ends[19]=1;
    tdone[19]=1;
  }

  public void thread116617(int [] tdone, int [] ends){
        S98850=1;
    active[18]=1;
    ends[18]=1;
    tdone[18]=1;
  }

  public void thread116616(int [] tdone, int [] ends){
        S98847=1;
    active[17]=1;
    ends[17]=1;
    tdone[17]=1;
  }

  public void thread116615(int [] tdone, int [] ends){
        S98860=1;
    S98859=0;
    thread116616(tdone,ends);
    thread116617(tdone,ends);
    int biggest116618 = 0;
    if(ends[17]>=biggest116618){
      biggest116618=ends[17];
    }
    if(ends[18]>=biggest116618){
      biggest116618=ends[18];
    }
    if(biggest116618 == 1){
      active[16]=1;
      ends[16]=1;
      tdone[16]=1;
    }
  }

  public void thread116614(int [] tdone, int [] ends){
        S98844=1;
    cylPos5ZAxisExtend.setPresent();//sysj\controller.sysj line: 215, column: 7
    currsigs.addElement(cylPos5ZAxisExtend);
    active[15]=1;
    ends[15]=1;
    tdone[15]=1;
  }

  public void thread116613(int [] tdone, int [] ends){
        S98838=1;
    cylClampBottleExtend.setPresent();//sysj\controller.sysj line: 209, column: 7
    currsigs.addElement(cylClampBottleExtend);
    active[14]=1;
    ends[14]=1;
    tdone[14]=1;
  }

  public void thread116611(int [] tdone, int [] ends){
        S98873=1;
    S98870=0;
    active[19]=1;
    ends[19]=1;
    tdone[19]=1;
  }

  public void thread116609(int [] tdone, int [] ends){
        S98850=1;
    active[18]=1;
    ends[18]=1;
    tdone[18]=1;
  }

  public void thread116608(int [] tdone, int [] ends){
        S98847=1;
    active[17]=1;
    ends[17]=1;
    tdone[17]=1;
  }

  public void thread116607(int [] tdone, int [] ends){
        S98860=1;
    S98859=0;
    thread116608(tdone,ends);
    thread116609(tdone,ends);
    int biggest116610 = 0;
    if(ends[17]>=biggest116610){
      biggest116610=ends[17];
    }
    if(ends[18]>=biggest116610){
      biggest116610=ends[18];
    }
    if(biggest116610 == 1){
      active[16]=1;
      ends[16]=1;
      tdone[16]=1;
    }
  }

  public void thread116606(int [] tdone, int [] ends){
        S98844=1;
    cylPos5ZAxisExtend.setPresent();//sysj\controller.sysj line: 215, column: 7
    currsigs.addElement(cylPos5ZAxisExtend);
    active[15]=1;
    ends[15]=1;
    tdone[15]=1;
  }

  public void thread116605(int [] tdone, int [] ends){
        S98838=1;
    cylClampBottleExtend.setPresent();//sysj\controller.sysj line: 209, column: 7
    currsigs.addElement(cylClampBottleExtend);
    active[14]=1;
    ends[14]=1;
    tdone[14]=1;
  }

  public void thread116603(int [] tdone, int [] ends){
        S98873=1;
    S98870=0;
    active[19]=1;
    ends[19]=1;
    tdone[19]=1;
  }

  public void thread116601(int [] tdone, int [] ends){
        S98850=1;
    active[18]=1;
    ends[18]=1;
    tdone[18]=1;
  }

  public void thread116600(int [] tdone, int [] ends){
        S98847=1;
    active[17]=1;
    ends[17]=1;
    tdone[17]=1;
  }

  public void thread116599(int [] tdone, int [] ends){
        S98860=1;
    S98859=0;
    thread116600(tdone,ends);
    thread116601(tdone,ends);
    int biggest116602 = 0;
    if(ends[17]>=biggest116602){
      biggest116602=ends[17];
    }
    if(ends[18]>=biggest116602){
      biggest116602=ends[18];
    }
    if(biggest116602 == 1){
      active[16]=1;
      ends[16]=1;
      tdone[16]=1;
    }
  }

  public void thread116598(int [] tdone, int [] ends){
        S98844=1;
    cylPos5ZAxisExtend.setPresent();//sysj\controller.sysj line: 215, column: 7
    currsigs.addElement(cylPos5ZAxisExtend);
    active[15]=1;
    ends[15]=1;
    tdone[15]=1;
  }

  public void thread116597(int [] tdone, int [] ends){
        S98838=1;
    cylClampBottleExtend.setPresent();//sysj\controller.sysj line: 209, column: 7
    currsigs.addElement(cylClampBottleExtend);
    active[14]=1;
    ends[14]=1;
    tdone[14]=1;
  }

  public void thread116595(int [] tdone, int [] ends){
        S98873=1;
    S98870=0;
    active[19]=1;
    ends[19]=1;
    tdone[19]=1;
  }

  public void thread116593(int [] tdone, int [] ends){
        S98850=1;
    active[18]=1;
    ends[18]=1;
    tdone[18]=1;
  }

  public void thread116592(int [] tdone, int [] ends){
        S98847=1;
    active[17]=1;
    ends[17]=1;
    tdone[17]=1;
  }

  public void thread116591(int [] tdone, int [] ends){
        S98860=1;
    S98859=0;
    thread116592(tdone,ends);
    thread116593(tdone,ends);
    int biggest116594 = 0;
    if(ends[17]>=biggest116594){
      biggest116594=ends[17];
    }
    if(ends[18]>=biggest116594){
      biggest116594=ends[18];
    }
    if(biggest116594 == 1){
      active[16]=1;
      ends[16]=1;
      tdone[16]=1;
    }
  }

  public void thread116590(int [] tdone, int [] ends){
        S98844=1;
    cylPos5ZAxisExtend.setPresent();//sysj\controller.sysj line: 215, column: 7
    currsigs.addElement(cylPos5ZAxisExtend);
    active[15]=1;
    ends[15]=1;
    tdone[15]=1;
  }

  public void thread116589(int [] tdone, int [] ends){
        S98838=1;
    cylClampBottleExtend.setPresent();//sysj\controller.sysj line: 209, column: 7
    currsigs.addElement(cylClampBottleExtend);
    active[14]=1;
    ends[14]=1;
    tdone[14]=1;
  }

  public void thread116587(int [] tdone, int [] ends){
        S98873=1;
    S98870=0;
    active[19]=1;
    ends[19]=1;
    tdone[19]=1;
  }

  public void thread116585(int [] tdone, int [] ends){
        S98850=1;
    active[18]=1;
    ends[18]=1;
    tdone[18]=1;
  }

  public void thread116584(int [] tdone, int [] ends){
        S98847=1;
    active[17]=1;
    ends[17]=1;
    tdone[17]=1;
  }

  public void thread116583(int [] tdone, int [] ends){
        S98860=1;
    S98859=0;
    thread116584(tdone,ends);
    thread116585(tdone,ends);
    int biggest116586 = 0;
    if(ends[17]>=biggest116586){
      biggest116586=ends[17];
    }
    if(ends[18]>=biggest116586){
      biggest116586=ends[18];
    }
    if(biggest116586 == 1){
      active[16]=1;
      ends[16]=1;
      tdone[16]=1;
    }
  }

  public void thread116582(int [] tdone, int [] ends){
        S98844=1;
    cylPos5ZAxisExtend.setPresent();//sysj\controller.sysj line: 215, column: 7
    currsigs.addElement(cylPos5ZAxisExtend);
    active[15]=1;
    ends[15]=1;
    tdone[15]=1;
  }

  public void thread116581(int [] tdone, int [] ends){
        S98838=1;
    cylClampBottleExtend.setPresent();//sysj\controller.sysj line: 209, column: 7
    currsigs.addElement(cylClampBottleExtend);
    active[14]=1;
    ends[14]=1;
    tdone[14]=1;
  }

  public void thread116579(int [] tdone, int [] ends){
        S98873=1;
    S98870=0;
    active[19]=1;
    ends[19]=1;
    tdone[19]=1;
  }

  public void thread116577(int [] tdone, int [] ends){
        S98850=1;
    active[18]=1;
    ends[18]=1;
    tdone[18]=1;
  }

  public void thread116576(int [] tdone, int [] ends){
        S98847=1;
    active[17]=1;
    ends[17]=1;
    tdone[17]=1;
  }

  public void thread116575(int [] tdone, int [] ends){
        S98860=1;
    S98859=0;
    thread116576(tdone,ends);
    thread116577(tdone,ends);
    int biggest116578 = 0;
    if(ends[17]>=biggest116578){
      biggest116578=ends[17];
    }
    if(ends[18]>=biggest116578){
      biggest116578=ends[18];
    }
    if(biggest116578 == 1){
      active[16]=1;
      ends[16]=1;
      tdone[16]=1;
    }
  }

  public void thread116574(int [] tdone, int [] ends){
        S98844=1;
    cylPos5ZAxisExtend.setPresent();//sysj\controller.sysj line: 215, column: 7
    currsigs.addElement(cylPos5ZAxisExtend);
    active[15]=1;
    ends[15]=1;
    tdone[15]=1;
  }

  public void thread116573(int [] tdone, int [] ends){
        S98838=1;
    cylClampBottleExtend.setPresent();//sysj\controller.sysj line: 209, column: 7
    currsigs.addElement(cylClampBottleExtend);
    active[14]=1;
    ends[14]=1;
    tdone[14]=1;
  }

  public void thread116571(int [] tdone, int [] ends){
        S98873=1;
    S98870=0;
    active[19]=1;
    ends[19]=1;
    tdone[19]=1;
  }

  public void thread116569(int [] tdone, int [] ends){
        S98850=1;
    active[18]=1;
    ends[18]=1;
    tdone[18]=1;
  }

  public void thread116568(int [] tdone, int [] ends){
        S98847=1;
    active[17]=1;
    ends[17]=1;
    tdone[17]=1;
  }

  public void thread116567(int [] tdone, int [] ends){
        S98860=1;
    S98859=0;
    thread116568(tdone,ends);
    thread116569(tdone,ends);
    int biggest116570 = 0;
    if(ends[17]>=biggest116570){
      biggest116570=ends[17];
    }
    if(ends[18]>=biggest116570){
      biggest116570=ends[18];
    }
    if(biggest116570 == 1){
      active[16]=1;
      ends[16]=1;
      tdone[16]=1;
    }
  }

  public void thread116566(int [] tdone, int [] ends){
        S98844=1;
    cylPos5ZAxisExtend.setPresent();//sysj\controller.sysj line: 215, column: 7
    currsigs.addElement(cylPos5ZAxisExtend);
    active[15]=1;
    ends[15]=1;
    tdone[15]=1;
  }

  public void thread116565(int [] tdone, int [] ends){
        S98838=1;
    cylClampBottleExtend.setPresent();//sysj\controller.sysj line: 209, column: 7
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
      switch(S112133){
        case 0 : 
          S112133=0;
          break RUN;
        
        case 1 : 
          S112133=2;
          S112133=2;
          releaseCap_13.setClear();//sysj\controller.sysj line: 192, column: 2
          untwistGripper_13.setClear();//sysj\controller.sysj line: 192, column: 2
          raiseGripper_13.setClear();//sysj\controller.sysj line: 192, column: 2
          unclampBottle_13.setClear();//sysj\controller.sysj line: 192, column: 2
          S98717=0;
          S98701=0;
          if(!capperReq_in.isPartnerPresent() || capperReq_in.isPartnerPreempted()){//sysj\controller.sysj line: 195, column: 3
            capperReq_in.setACK(false);//sysj\controller.sysj line: 195, column: 3
            S98701=1;
            active[13]=1;
            ends[13]=1;
            break RUN;
          }
          else {
            S98696=0;
            if(!capperReq_in.isREQ()){//sysj\controller.sysj line: 195, column: 3
              capperReq_in.setACK(true);//sysj\controller.sysj line: 195, column: 3
              S98696=1;
              if(capperReq_in.isREQ()){//sysj\controller.sysj line: 195, column: 3
                capperReq_in.setACK(false);//sysj\controller.sysj line: 195, column: 3
                ends[13]=2;
                ;//sysj\controller.sysj line: 195, column: 3
                request_thread_13 = (boolean)(capperReq_in.getVal() == null ? false : ((Boolean)capperReq_in.getVal()).booleanValue());//sysj\controller.sysj line: 196, column: 3
                S98717=1;
                if(request_thread_13){//sysj\controller.sysj line: 198, column: 3
                  S99831=0;
                  S98832=0;
                  S98724=0;
                  if(!capperStatus_o.isPartnerPresent() || capperStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 199, column: 4
                    capperStatus_o.setREQ(false);//sysj\controller.sysj line: 199, column: 4
                    S98724=1;
                    active[13]=1;
                    ends[13]=1;
                    break RUN;
                  }
                  else {
                    S98719=0;
                    if(capperStatus_o.isACK()){//sysj\controller.sysj line: 199, column: 4
                      capperStatus_o.setVal("busy");//sysj\controller.sysj line: 199, column: 4
                      S98719=1;
                      if(!capperStatus_o.isACK()){//sysj\controller.sysj line: 199, column: 4
                        capperStatus_o.setREQ(false);//sysj\controller.sysj line: 199, column: 4
                        ends[13]=2;
                        ;//sysj\controller.sysj line: 199, column: 4
                        S98832=1;
                        if(!bottleAtPos4.getprestatus()){//sysj\controller.sysj line: 201, column: 13
                          S98746=0;
                          if(!capperStatus_o.isPartnerPresent() || capperStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 202, column: 5
                            capperStatus_o.setREQ(false);//sysj\controller.sysj line: 202, column: 5
                            S98746=1;
                            active[13]=1;
                            ends[13]=1;
                            break RUN;
                          }
                          else {
                            S98741=0;
                            if(capperStatus_o.isACK()){//sysj\controller.sysj line: 202, column: 5
                              capperStatus_o.setVal("idle");//sysj\controller.sysj line: 202, column: 5
                              S98741=1;
                              if(!capperStatus_o.isACK()){//sysj\controller.sysj line: 202, column: 5
                                capperStatus_o.setREQ(false);//sysj\controller.sysj line: 202, column: 5
                                ends[13]=2;
                                ;//sysj\controller.sysj line: 202, column: 5
                                S98832=2;
                                if(bottleAtPos4.getprestatus()){//sysj\controller.sysj line: 205, column: 12
                                  System.out.println("Capper doing work...");//sysj\controller.sysj line: 206, column: 5
                                  thread116565(tdone,ends);
                                  thread116566(tdone,ends);
                                  thread116567(tdone,ends);
                                  thread116571(tdone,ends);
                                  int biggest116572 = 0;
                                  if(ends[14]>=biggest116572){
                                    biggest116572=ends[14];
                                  }
                                  if(ends[15]>=biggest116572){
                                    biggest116572=ends[15];
                                  }
                                  if(ends[16]>=biggest116572){
                                    biggest116572=ends[16];
                                  }
                                  if(ends[19]>=biggest116572){
                                    biggest116572=ends[19];
                                  }
                                  if(biggest116572 == 1){
                                    active[13]=1;
                                    ends[13]=1;
                                    break RUN;
                                  }
                                }
                                else {
                                  S98832=3;
                                  S99595=0;
                                  if(!capperStatus_o.isPartnerPresent() || capperStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 243, column: 4
                                    capperStatus_o.setREQ(false);//sysj\controller.sysj line: 243, column: 4
                                    S99595=1;
                                    active[13]=1;
                                    ends[13]=1;
                                    break RUN;
                                  }
                                  else {
                                    S99590=0;
                                    if(capperStatus_o.isACK()){//sysj\controller.sysj line: 243, column: 4
                                      capperStatus_o.setVal("done");//sysj\controller.sysj line: 243, column: 4
                                      S99590=1;
                                      if(!capperStatus_o.isACK()){//sysj\controller.sysj line: 243, column: 4
                                        capperStatus_o.setREQ(false);//sysj\controller.sysj line: 243, column: 4
                                        ends[13]=2;
                                        ;//sysj\controller.sysj line: 243, column: 4
                                        S98717=2;
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
                          S98832=2;
                          if(bottleAtPos4.getprestatus()){//sysj\controller.sysj line: 205, column: 12
                            System.out.println("Capper doing work...");//sysj\controller.sysj line: 206, column: 5
                            thread116573(tdone,ends);
                            thread116574(tdone,ends);
                            thread116575(tdone,ends);
                            thread116579(tdone,ends);
                            int biggest116580 = 0;
                            if(ends[14]>=biggest116580){
                              biggest116580=ends[14];
                            }
                            if(ends[15]>=biggest116580){
                              biggest116580=ends[15];
                            }
                            if(ends[16]>=biggest116580){
                              biggest116580=ends[16];
                            }
                            if(ends[19]>=biggest116580){
                              biggest116580=ends[19];
                            }
                            if(biggest116580 == 1){
                              active[13]=1;
                              ends[13]=1;
                              break RUN;
                            }
                          }
                          else {
                            S98832=3;
                            S99595=0;
                            if(!capperStatus_o.isPartnerPresent() || capperStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 243, column: 4
                              capperStatus_o.setREQ(false);//sysj\controller.sysj line: 243, column: 4
                              S99595=1;
                              active[13]=1;
                              ends[13]=1;
                              break RUN;
                            }
                            else {
                              S99590=0;
                              if(capperStatus_o.isACK()){//sysj\controller.sysj line: 243, column: 4
                                capperStatus_o.setVal("done");//sysj\controller.sysj line: 243, column: 4
                                S99590=1;
                                if(!capperStatus_o.isACK()){//sysj\controller.sysj line: 243, column: 4
                                  capperStatus_o.setREQ(false);//sysj\controller.sysj line: 243, column: 4
                                  ends[13]=2;
                                  ;//sysj\controller.sysj line: 243, column: 4
                                  S98717=2;
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
                  S99831=1;
                  S99815=0;
                  if(!capperStatus_o.isPartnerPresent() || capperStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 245, column: 4
                    capperStatus_o.setREQ(false);//sysj\controller.sysj line: 245, column: 4
                    S99815=1;
                    active[13]=1;
                    ends[13]=1;
                    break RUN;
                  }
                  else {
                    S99810=0;
                    if(capperStatus_o.isACK()){//sysj\controller.sysj line: 245, column: 4
                      capperStatus_o.setVal("idle");//sysj\controller.sysj line: 245, column: 4
                      S99810=1;
                      if(!capperStatus_o.isACK()){//sysj\controller.sysj line: 245, column: 4
                        capperStatus_o.setREQ(false);//sysj\controller.sysj line: 245, column: 4
                        ends[13]=2;
                        ;//sysj\controller.sysj line: 245, column: 4
                        S98717=2;
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
          releaseCap_13.setClear();//sysj\controller.sysj line: 192, column: 2
          untwistGripper_13.setClear();//sysj\controller.sysj line: 192, column: 2
          raiseGripper_13.setClear();//sysj\controller.sysj line: 192, column: 2
          unclampBottle_13.setClear();//sysj\controller.sysj line: 192, column: 2
          switch(S98717){
            case 0 : 
              switch(S98701){
                case 0 : 
                  if(!capperReq_in.isPartnerPresent() || capperReq_in.isPartnerPreempted()){//sysj\controller.sysj line: 195, column: 3
                    capperReq_in.setACK(false);//sysj\controller.sysj line: 195, column: 3
                    S98701=1;
                    active[13]=1;
                    ends[13]=1;
                    break RUN;
                  }
                  else {
                    switch(S98696){
                      case 0 : 
                        if(!capperReq_in.isREQ()){//sysj\controller.sysj line: 195, column: 3
                          capperReq_in.setACK(true);//sysj\controller.sysj line: 195, column: 3
                          S98696=1;
                          if(capperReq_in.isREQ()){//sysj\controller.sysj line: 195, column: 3
                            capperReq_in.setACK(false);//sysj\controller.sysj line: 195, column: 3
                            ends[13]=2;
                            ;//sysj\controller.sysj line: 195, column: 3
                            request_thread_13 = (boolean)(capperReq_in.getVal() == null ? false : ((Boolean)capperReq_in.getVal()).booleanValue());//sysj\controller.sysj line: 196, column: 3
                            S98717=1;
                            if(request_thread_13){//sysj\controller.sysj line: 198, column: 3
                              S99831=0;
                              S98832=0;
                              S98724=0;
                              if(!capperStatus_o.isPartnerPresent() || capperStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 199, column: 4
                                capperStatus_o.setREQ(false);//sysj\controller.sysj line: 199, column: 4
                                S98724=1;
                                active[13]=1;
                                ends[13]=1;
                                break RUN;
                              }
                              else {
                                S98719=0;
                                if(capperStatus_o.isACK()){//sysj\controller.sysj line: 199, column: 4
                                  capperStatus_o.setVal("busy");//sysj\controller.sysj line: 199, column: 4
                                  S98719=1;
                                  if(!capperStatus_o.isACK()){//sysj\controller.sysj line: 199, column: 4
                                    capperStatus_o.setREQ(false);//sysj\controller.sysj line: 199, column: 4
                                    ends[13]=2;
                                    ;//sysj\controller.sysj line: 199, column: 4
                                    S98832=1;
                                    if(!bottleAtPos4.getprestatus()){//sysj\controller.sysj line: 201, column: 13
                                      S98746=0;
                                      if(!capperStatus_o.isPartnerPresent() || capperStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 202, column: 5
                                        capperStatus_o.setREQ(false);//sysj\controller.sysj line: 202, column: 5
                                        S98746=1;
                                        active[13]=1;
                                        ends[13]=1;
                                        break RUN;
                                      }
                                      else {
                                        S98741=0;
                                        if(capperStatus_o.isACK()){//sysj\controller.sysj line: 202, column: 5
                                          capperStatus_o.setVal("idle");//sysj\controller.sysj line: 202, column: 5
                                          S98741=1;
                                          if(!capperStatus_o.isACK()){//sysj\controller.sysj line: 202, column: 5
                                            capperStatus_o.setREQ(false);//sysj\controller.sysj line: 202, column: 5
                                            ends[13]=2;
                                            ;//sysj\controller.sysj line: 202, column: 5
                                            S98832=2;
                                            if(bottleAtPos4.getprestatus()){//sysj\controller.sysj line: 205, column: 12
                                              System.out.println("Capper doing work...");//sysj\controller.sysj line: 206, column: 5
                                              thread116581(tdone,ends);
                                              thread116582(tdone,ends);
                                              thread116583(tdone,ends);
                                              thread116587(tdone,ends);
                                              int biggest116588 = 0;
                                              if(ends[14]>=biggest116588){
                                                biggest116588=ends[14];
                                              }
                                              if(ends[15]>=biggest116588){
                                                biggest116588=ends[15];
                                              }
                                              if(ends[16]>=biggest116588){
                                                biggest116588=ends[16];
                                              }
                                              if(ends[19]>=biggest116588){
                                                biggest116588=ends[19];
                                              }
                                              if(biggest116588 == 1){
                                                active[13]=1;
                                                ends[13]=1;
                                                break RUN;
                                              }
                                            }
                                            else {
                                              S98832=3;
                                              S99595=0;
                                              if(!capperStatus_o.isPartnerPresent() || capperStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 243, column: 4
                                                capperStatus_o.setREQ(false);//sysj\controller.sysj line: 243, column: 4
                                                S99595=1;
                                                active[13]=1;
                                                ends[13]=1;
                                                break RUN;
                                              }
                                              else {
                                                S99590=0;
                                                if(capperStatus_o.isACK()){//sysj\controller.sysj line: 243, column: 4
                                                  capperStatus_o.setVal("done");//sysj\controller.sysj line: 243, column: 4
                                                  S99590=1;
                                                  if(!capperStatus_o.isACK()){//sysj\controller.sysj line: 243, column: 4
                                                    capperStatus_o.setREQ(false);//sysj\controller.sysj line: 243, column: 4
                                                    ends[13]=2;
                                                    ;//sysj\controller.sysj line: 243, column: 4
                                                    S98717=2;
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
                                      S98832=2;
                                      if(bottleAtPos4.getprestatus()){//sysj\controller.sysj line: 205, column: 12
                                        System.out.println("Capper doing work...");//sysj\controller.sysj line: 206, column: 5
                                        thread116589(tdone,ends);
                                        thread116590(tdone,ends);
                                        thread116591(tdone,ends);
                                        thread116595(tdone,ends);
                                        int biggest116596 = 0;
                                        if(ends[14]>=biggest116596){
                                          biggest116596=ends[14];
                                        }
                                        if(ends[15]>=biggest116596){
                                          biggest116596=ends[15];
                                        }
                                        if(ends[16]>=biggest116596){
                                          biggest116596=ends[16];
                                        }
                                        if(ends[19]>=biggest116596){
                                          biggest116596=ends[19];
                                        }
                                        if(biggest116596 == 1){
                                          active[13]=1;
                                          ends[13]=1;
                                          break RUN;
                                        }
                                      }
                                      else {
                                        S98832=3;
                                        S99595=0;
                                        if(!capperStatus_o.isPartnerPresent() || capperStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 243, column: 4
                                          capperStatus_o.setREQ(false);//sysj\controller.sysj line: 243, column: 4
                                          S99595=1;
                                          active[13]=1;
                                          ends[13]=1;
                                          break RUN;
                                        }
                                        else {
                                          S99590=0;
                                          if(capperStatus_o.isACK()){//sysj\controller.sysj line: 243, column: 4
                                            capperStatus_o.setVal("done");//sysj\controller.sysj line: 243, column: 4
                                            S99590=1;
                                            if(!capperStatus_o.isACK()){//sysj\controller.sysj line: 243, column: 4
                                              capperStatus_o.setREQ(false);//sysj\controller.sysj line: 243, column: 4
                                              ends[13]=2;
                                              ;//sysj\controller.sysj line: 243, column: 4
                                              S98717=2;
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
                              S99831=1;
                              S99815=0;
                              if(!capperStatus_o.isPartnerPresent() || capperStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 245, column: 4
                                capperStatus_o.setREQ(false);//sysj\controller.sysj line: 245, column: 4
                                S99815=1;
                                active[13]=1;
                                ends[13]=1;
                                break RUN;
                              }
                              else {
                                S99810=0;
                                if(capperStatus_o.isACK()){//sysj\controller.sysj line: 245, column: 4
                                  capperStatus_o.setVal("idle");//sysj\controller.sysj line: 245, column: 4
                                  S99810=1;
                                  if(!capperStatus_o.isACK()){//sysj\controller.sysj line: 245, column: 4
                                    capperStatus_o.setREQ(false);//sysj\controller.sysj line: 245, column: 4
                                    ends[13]=2;
                                    ;//sysj\controller.sysj line: 245, column: 4
                                    S98717=2;
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
                        if(capperReq_in.isREQ()){//sysj\controller.sysj line: 195, column: 3
                          capperReq_in.setACK(false);//sysj\controller.sysj line: 195, column: 3
                          ends[13]=2;
                          ;//sysj\controller.sysj line: 195, column: 3
                          request_thread_13 = (boolean)(capperReq_in.getVal() == null ? false : ((Boolean)capperReq_in.getVal()).booleanValue());//sysj\controller.sysj line: 196, column: 3
                          S98717=1;
                          if(request_thread_13){//sysj\controller.sysj line: 198, column: 3
                            S99831=0;
                            S98832=0;
                            S98724=0;
                            if(!capperStatus_o.isPartnerPresent() || capperStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 199, column: 4
                              capperStatus_o.setREQ(false);//sysj\controller.sysj line: 199, column: 4
                              S98724=1;
                              active[13]=1;
                              ends[13]=1;
                              break RUN;
                            }
                            else {
                              S98719=0;
                              if(capperStatus_o.isACK()){//sysj\controller.sysj line: 199, column: 4
                                capperStatus_o.setVal("busy");//sysj\controller.sysj line: 199, column: 4
                                S98719=1;
                                if(!capperStatus_o.isACK()){//sysj\controller.sysj line: 199, column: 4
                                  capperStatus_o.setREQ(false);//sysj\controller.sysj line: 199, column: 4
                                  ends[13]=2;
                                  ;//sysj\controller.sysj line: 199, column: 4
                                  S98832=1;
                                  if(!bottleAtPos4.getprestatus()){//sysj\controller.sysj line: 201, column: 13
                                    S98746=0;
                                    if(!capperStatus_o.isPartnerPresent() || capperStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 202, column: 5
                                      capperStatus_o.setREQ(false);//sysj\controller.sysj line: 202, column: 5
                                      S98746=1;
                                      active[13]=1;
                                      ends[13]=1;
                                      break RUN;
                                    }
                                    else {
                                      S98741=0;
                                      if(capperStatus_o.isACK()){//sysj\controller.sysj line: 202, column: 5
                                        capperStatus_o.setVal("idle");//sysj\controller.sysj line: 202, column: 5
                                        S98741=1;
                                        if(!capperStatus_o.isACK()){//sysj\controller.sysj line: 202, column: 5
                                          capperStatus_o.setREQ(false);//sysj\controller.sysj line: 202, column: 5
                                          ends[13]=2;
                                          ;//sysj\controller.sysj line: 202, column: 5
                                          S98832=2;
                                          if(bottleAtPos4.getprestatus()){//sysj\controller.sysj line: 205, column: 12
                                            System.out.println("Capper doing work...");//sysj\controller.sysj line: 206, column: 5
                                            thread116597(tdone,ends);
                                            thread116598(tdone,ends);
                                            thread116599(tdone,ends);
                                            thread116603(tdone,ends);
                                            int biggest116604 = 0;
                                            if(ends[14]>=biggest116604){
                                              biggest116604=ends[14];
                                            }
                                            if(ends[15]>=biggest116604){
                                              biggest116604=ends[15];
                                            }
                                            if(ends[16]>=biggest116604){
                                              biggest116604=ends[16];
                                            }
                                            if(ends[19]>=biggest116604){
                                              biggest116604=ends[19];
                                            }
                                            if(biggest116604 == 1){
                                              active[13]=1;
                                              ends[13]=1;
                                              break RUN;
                                            }
                                          }
                                          else {
                                            S98832=3;
                                            S99595=0;
                                            if(!capperStatus_o.isPartnerPresent() || capperStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 243, column: 4
                                              capperStatus_o.setREQ(false);//sysj\controller.sysj line: 243, column: 4
                                              S99595=1;
                                              active[13]=1;
                                              ends[13]=1;
                                              break RUN;
                                            }
                                            else {
                                              S99590=0;
                                              if(capperStatus_o.isACK()){//sysj\controller.sysj line: 243, column: 4
                                                capperStatus_o.setVal("done");//sysj\controller.sysj line: 243, column: 4
                                                S99590=1;
                                                if(!capperStatus_o.isACK()){//sysj\controller.sysj line: 243, column: 4
                                                  capperStatus_o.setREQ(false);//sysj\controller.sysj line: 243, column: 4
                                                  ends[13]=2;
                                                  ;//sysj\controller.sysj line: 243, column: 4
                                                  S98717=2;
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
                                    S98832=2;
                                    if(bottleAtPos4.getprestatus()){//sysj\controller.sysj line: 205, column: 12
                                      System.out.println("Capper doing work...");//sysj\controller.sysj line: 206, column: 5
                                      thread116605(tdone,ends);
                                      thread116606(tdone,ends);
                                      thread116607(tdone,ends);
                                      thread116611(tdone,ends);
                                      int biggest116612 = 0;
                                      if(ends[14]>=biggest116612){
                                        biggest116612=ends[14];
                                      }
                                      if(ends[15]>=biggest116612){
                                        biggest116612=ends[15];
                                      }
                                      if(ends[16]>=biggest116612){
                                        biggest116612=ends[16];
                                      }
                                      if(ends[19]>=biggest116612){
                                        biggest116612=ends[19];
                                      }
                                      if(biggest116612 == 1){
                                        active[13]=1;
                                        ends[13]=1;
                                        break RUN;
                                      }
                                    }
                                    else {
                                      S98832=3;
                                      S99595=0;
                                      if(!capperStatus_o.isPartnerPresent() || capperStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 243, column: 4
                                        capperStatus_o.setREQ(false);//sysj\controller.sysj line: 243, column: 4
                                        S99595=1;
                                        active[13]=1;
                                        ends[13]=1;
                                        break RUN;
                                      }
                                      else {
                                        S99590=0;
                                        if(capperStatus_o.isACK()){//sysj\controller.sysj line: 243, column: 4
                                          capperStatus_o.setVal("done");//sysj\controller.sysj line: 243, column: 4
                                          S99590=1;
                                          if(!capperStatus_o.isACK()){//sysj\controller.sysj line: 243, column: 4
                                            capperStatus_o.setREQ(false);//sysj\controller.sysj line: 243, column: 4
                                            ends[13]=2;
                                            ;//sysj\controller.sysj line: 243, column: 4
                                            S98717=2;
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
                            S99831=1;
                            S99815=0;
                            if(!capperStatus_o.isPartnerPresent() || capperStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 245, column: 4
                              capperStatus_o.setREQ(false);//sysj\controller.sysj line: 245, column: 4
                              S99815=1;
                              active[13]=1;
                              ends[13]=1;
                              break RUN;
                            }
                            else {
                              S99810=0;
                              if(capperStatus_o.isACK()){//sysj\controller.sysj line: 245, column: 4
                                capperStatus_o.setVal("idle");//sysj\controller.sysj line: 245, column: 4
                                S99810=1;
                                if(!capperStatus_o.isACK()){//sysj\controller.sysj line: 245, column: 4
                                  capperStatus_o.setREQ(false);//sysj\controller.sysj line: 245, column: 4
                                  ends[13]=2;
                                  ;//sysj\controller.sysj line: 245, column: 4
                                  S98717=2;
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
                  S98701=1;
                  S98701=0;
                  if(!capperReq_in.isPartnerPresent() || capperReq_in.isPartnerPreempted()){//sysj\controller.sysj line: 195, column: 3
                    capperReq_in.setACK(false);//sysj\controller.sysj line: 195, column: 3
                    S98701=1;
                    active[13]=1;
                    ends[13]=1;
                    break RUN;
                  }
                  else {
                    S98696=0;
                    if(!capperReq_in.isREQ()){//sysj\controller.sysj line: 195, column: 3
                      capperReq_in.setACK(true);//sysj\controller.sysj line: 195, column: 3
                      S98696=1;
                      if(capperReq_in.isREQ()){//sysj\controller.sysj line: 195, column: 3
                        capperReq_in.setACK(false);//sysj\controller.sysj line: 195, column: 3
                        ends[13]=2;
                        ;//sysj\controller.sysj line: 195, column: 3
                        request_thread_13 = (boolean)(capperReq_in.getVal() == null ? false : ((Boolean)capperReq_in.getVal()).booleanValue());//sysj\controller.sysj line: 196, column: 3
                        S98717=1;
                        if(request_thread_13){//sysj\controller.sysj line: 198, column: 3
                          S99831=0;
                          S98832=0;
                          S98724=0;
                          if(!capperStatus_o.isPartnerPresent() || capperStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 199, column: 4
                            capperStatus_o.setREQ(false);//sysj\controller.sysj line: 199, column: 4
                            S98724=1;
                            active[13]=1;
                            ends[13]=1;
                            break RUN;
                          }
                          else {
                            S98719=0;
                            if(capperStatus_o.isACK()){//sysj\controller.sysj line: 199, column: 4
                              capperStatus_o.setVal("busy");//sysj\controller.sysj line: 199, column: 4
                              S98719=1;
                              if(!capperStatus_o.isACK()){//sysj\controller.sysj line: 199, column: 4
                                capperStatus_o.setREQ(false);//sysj\controller.sysj line: 199, column: 4
                                ends[13]=2;
                                ;//sysj\controller.sysj line: 199, column: 4
                                S98832=1;
                                if(!bottleAtPos4.getprestatus()){//sysj\controller.sysj line: 201, column: 13
                                  S98746=0;
                                  if(!capperStatus_o.isPartnerPresent() || capperStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 202, column: 5
                                    capperStatus_o.setREQ(false);//sysj\controller.sysj line: 202, column: 5
                                    S98746=1;
                                    active[13]=1;
                                    ends[13]=1;
                                    break RUN;
                                  }
                                  else {
                                    S98741=0;
                                    if(capperStatus_o.isACK()){//sysj\controller.sysj line: 202, column: 5
                                      capperStatus_o.setVal("idle");//sysj\controller.sysj line: 202, column: 5
                                      S98741=1;
                                      if(!capperStatus_o.isACK()){//sysj\controller.sysj line: 202, column: 5
                                        capperStatus_o.setREQ(false);//sysj\controller.sysj line: 202, column: 5
                                        ends[13]=2;
                                        ;//sysj\controller.sysj line: 202, column: 5
                                        S98832=2;
                                        if(bottleAtPos4.getprestatus()){//sysj\controller.sysj line: 205, column: 12
                                          System.out.println("Capper doing work...");//sysj\controller.sysj line: 206, column: 5
                                          thread116613(tdone,ends);
                                          thread116614(tdone,ends);
                                          thread116615(tdone,ends);
                                          thread116619(tdone,ends);
                                          int biggest116620 = 0;
                                          if(ends[14]>=biggest116620){
                                            biggest116620=ends[14];
                                          }
                                          if(ends[15]>=biggest116620){
                                            biggest116620=ends[15];
                                          }
                                          if(ends[16]>=biggest116620){
                                            biggest116620=ends[16];
                                          }
                                          if(ends[19]>=biggest116620){
                                            biggest116620=ends[19];
                                          }
                                          if(biggest116620 == 1){
                                            active[13]=1;
                                            ends[13]=1;
                                            break RUN;
                                          }
                                        }
                                        else {
                                          S98832=3;
                                          S99595=0;
                                          if(!capperStatus_o.isPartnerPresent() || capperStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 243, column: 4
                                            capperStatus_o.setREQ(false);//sysj\controller.sysj line: 243, column: 4
                                            S99595=1;
                                            active[13]=1;
                                            ends[13]=1;
                                            break RUN;
                                          }
                                          else {
                                            S99590=0;
                                            if(capperStatus_o.isACK()){//sysj\controller.sysj line: 243, column: 4
                                              capperStatus_o.setVal("done");//sysj\controller.sysj line: 243, column: 4
                                              S99590=1;
                                              if(!capperStatus_o.isACK()){//sysj\controller.sysj line: 243, column: 4
                                                capperStatus_o.setREQ(false);//sysj\controller.sysj line: 243, column: 4
                                                ends[13]=2;
                                                ;//sysj\controller.sysj line: 243, column: 4
                                                S98717=2;
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
                                  S98832=2;
                                  if(bottleAtPos4.getprestatus()){//sysj\controller.sysj line: 205, column: 12
                                    System.out.println("Capper doing work...");//sysj\controller.sysj line: 206, column: 5
                                    thread116621(tdone,ends);
                                    thread116622(tdone,ends);
                                    thread116623(tdone,ends);
                                    thread116627(tdone,ends);
                                    int biggest116628 = 0;
                                    if(ends[14]>=biggest116628){
                                      biggest116628=ends[14];
                                    }
                                    if(ends[15]>=biggest116628){
                                      biggest116628=ends[15];
                                    }
                                    if(ends[16]>=biggest116628){
                                      biggest116628=ends[16];
                                    }
                                    if(ends[19]>=biggest116628){
                                      biggest116628=ends[19];
                                    }
                                    if(biggest116628 == 1){
                                      active[13]=1;
                                      ends[13]=1;
                                      break RUN;
                                    }
                                  }
                                  else {
                                    S98832=3;
                                    S99595=0;
                                    if(!capperStatus_o.isPartnerPresent() || capperStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 243, column: 4
                                      capperStatus_o.setREQ(false);//sysj\controller.sysj line: 243, column: 4
                                      S99595=1;
                                      active[13]=1;
                                      ends[13]=1;
                                      break RUN;
                                    }
                                    else {
                                      S99590=0;
                                      if(capperStatus_o.isACK()){//sysj\controller.sysj line: 243, column: 4
                                        capperStatus_o.setVal("done");//sysj\controller.sysj line: 243, column: 4
                                        S99590=1;
                                        if(!capperStatus_o.isACK()){//sysj\controller.sysj line: 243, column: 4
                                          capperStatus_o.setREQ(false);//sysj\controller.sysj line: 243, column: 4
                                          ends[13]=2;
                                          ;//sysj\controller.sysj line: 243, column: 4
                                          S98717=2;
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
                          S99831=1;
                          S99815=0;
                          if(!capperStatus_o.isPartnerPresent() || capperStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 245, column: 4
                            capperStatus_o.setREQ(false);//sysj\controller.sysj line: 245, column: 4
                            S99815=1;
                            active[13]=1;
                            ends[13]=1;
                            break RUN;
                          }
                          else {
                            S99810=0;
                            if(capperStatus_o.isACK()){//sysj\controller.sysj line: 245, column: 4
                              capperStatus_o.setVal("idle");//sysj\controller.sysj line: 245, column: 4
                              S99810=1;
                              if(!capperStatus_o.isACK()){//sysj\controller.sysj line: 245, column: 4
                                capperStatus_o.setREQ(false);//sysj\controller.sysj line: 245, column: 4
                                ends[13]=2;
                                ;//sysj\controller.sysj line: 245, column: 4
                                S98717=2;
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
              switch(S99831){
                case 0 : 
                  switch(S98832){
                    case 0 : 
                      switch(S98724){
                        case 0 : 
                          if(!capperStatus_o.isPartnerPresent() || capperStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 199, column: 4
                            capperStatus_o.setREQ(false);//sysj\controller.sysj line: 199, column: 4
                            S98724=1;
                            active[13]=1;
                            ends[13]=1;
                            break RUN;
                          }
                          else {
                            switch(S98719){
                              case 0 : 
                                if(capperStatus_o.isACK()){//sysj\controller.sysj line: 199, column: 4
                                  capperStatus_o.setVal("busy");//sysj\controller.sysj line: 199, column: 4
                                  S98719=1;
                                  if(!capperStatus_o.isACK()){//sysj\controller.sysj line: 199, column: 4
                                    capperStatus_o.setREQ(false);//sysj\controller.sysj line: 199, column: 4
                                    ends[13]=2;
                                    ;//sysj\controller.sysj line: 199, column: 4
                                    S98832=1;
                                    if(!bottleAtPos4.getprestatus()){//sysj\controller.sysj line: 201, column: 13
                                      S98746=0;
                                      if(!capperStatus_o.isPartnerPresent() || capperStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 202, column: 5
                                        capperStatus_o.setREQ(false);//sysj\controller.sysj line: 202, column: 5
                                        S98746=1;
                                        active[13]=1;
                                        ends[13]=1;
                                        break RUN;
                                      }
                                      else {
                                        S98741=0;
                                        if(capperStatus_o.isACK()){//sysj\controller.sysj line: 202, column: 5
                                          capperStatus_o.setVal("idle");//sysj\controller.sysj line: 202, column: 5
                                          S98741=1;
                                          if(!capperStatus_o.isACK()){//sysj\controller.sysj line: 202, column: 5
                                            capperStatus_o.setREQ(false);//sysj\controller.sysj line: 202, column: 5
                                            ends[13]=2;
                                            ;//sysj\controller.sysj line: 202, column: 5
                                            S98832=2;
                                            if(bottleAtPos4.getprestatus()){//sysj\controller.sysj line: 205, column: 12
                                              System.out.println("Capper doing work...");//sysj\controller.sysj line: 206, column: 5
                                              thread116629(tdone,ends);
                                              thread116630(tdone,ends);
                                              thread116631(tdone,ends);
                                              thread116635(tdone,ends);
                                              int biggest116636 = 0;
                                              if(ends[14]>=biggest116636){
                                                biggest116636=ends[14];
                                              }
                                              if(ends[15]>=biggest116636){
                                                biggest116636=ends[15];
                                              }
                                              if(ends[16]>=biggest116636){
                                                biggest116636=ends[16];
                                              }
                                              if(ends[19]>=biggest116636){
                                                biggest116636=ends[19];
                                              }
                                              if(biggest116636 == 1){
                                                active[13]=1;
                                                ends[13]=1;
                                                break RUN;
                                              }
                                            }
                                            else {
                                              S98832=3;
                                              S99595=0;
                                              if(!capperStatus_o.isPartnerPresent() || capperStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 243, column: 4
                                                capperStatus_o.setREQ(false);//sysj\controller.sysj line: 243, column: 4
                                                S99595=1;
                                                active[13]=1;
                                                ends[13]=1;
                                                break RUN;
                                              }
                                              else {
                                                S99590=0;
                                                if(capperStatus_o.isACK()){//sysj\controller.sysj line: 243, column: 4
                                                  capperStatus_o.setVal("done");//sysj\controller.sysj line: 243, column: 4
                                                  S99590=1;
                                                  if(!capperStatus_o.isACK()){//sysj\controller.sysj line: 243, column: 4
                                                    capperStatus_o.setREQ(false);//sysj\controller.sysj line: 243, column: 4
                                                    ends[13]=2;
                                                    ;//sysj\controller.sysj line: 243, column: 4
                                                    S98717=2;
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
                                      S98832=2;
                                      if(bottleAtPos4.getprestatus()){//sysj\controller.sysj line: 205, column: 12
                                        System.out.println("Capper doing work...");//sysj\controller.sysj line: 206, column: 5
                                        thread116637(tdone,ends);
                                        thread116638(tdone,ends);
                                        thread116639(tdone,ends);
                                        thread116643(tdone,ends);
                                        int biggest116644 = 0;
                                        if(ends[14]>=biggest116644){
                                          biggest116644=ends[14];
                                        }
                                        if(ends[15]>=biggest116644){
                                          biggest116644=ends[15];
                                        }
                                        if(ends[16]>=biggest116644){
                                          biggest116644=ends[16];
                                        }
                                        if(ends[19]>=biggest116644){
                                          biggest116644=ends[19];
                                        }
                                        if(biggest116644 == 1){
                                          active[13]=1;
                                          ends[13]=1;
                                          break RUN;
                                        }
                                      }
                                      else {
                                        S98832=3;
                                        S99595=0;
                                        if(!capperStatus_o.isPartnerPresent() || capperStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 243, column: 4
                                          capperStatus_o.setREQ(false);//sysj\controller.sysj line: 243, column: 4
                                          S99595=1;
                                          active[13]=1;
                                          ends[13]=1;
                                          break RUN;
                                        }
                                        else {
                                          S99590=0;
                                          if(capperStatus_o.isACK()){//sysj\controller.sysj line: 243, column: 4
                                            capperStatus_o.setVal("done");//sysj\controller.sysj line: 243, column: 4
                                            S99590=1;
                                            if(!capperStatus_o.isACK()){//sysj\controller.sysj line: 243, column: 4
                                              capperStatus_o.setREQ(false);//sysj\controller.sysj line: 243, column: 4
                                              ends[13]=2;
                                              ;//sysj\controller.sysj line: 243, column: 4
                                              S98717=2;
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
                                if(!capperStatus_o.isACK()){//sysj\controller.sysj line: 199, column: 4
                                  capperStatus_o.setREQ(false);//sysj\controller.sysj line: 199, column: 4
                                  ends[13]=2;
                                  ;//sysj\controller.sysj line: 199, column: 4
                                  S98832=1;
                                  if(!bottleAtPos4.getprestatus()){//sysj\controller.sysj line: 201, column: 13
                                    S98746=0;
                                    if(!capperStatus_o.isPartnerPresent() || capperStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 202, column: 5
                                      capperStatus_o.setREQ(false);//sysj\controller.sysj line: 202, column: 5
                                      S98746=1;
                                      active[13]=1;
                                      ends[13]=1;
                                      break RUN;
                                    }
                                    else {
                                      S98741=0;
                                      if(capperStatus_o.isACK()){//sysj\controller.sysj line: 202, column: 5
                                        capperStatus_o.setVal("idle");//sysj\controller.sysj line: 202, column: 5
                                        S98741=1;
                                        if(!capperStatus_o.isACK()){//sysj\controller.sysj line: 202, column: 5
                                          capperStatus_o.setREQ(false);//sysj\controller.sysj line: 202, column: 5
                                          ends[13]=2;
                                          ;//sysj\controller.sysj line: 202, column: 5
                                          S98832=2;
                                          if(bottleAtPos4.getprestatus()){//sysj\controller.sysj line: 205, column: 12
                                            System.out.println("Capper doing work...");//sysj\controller.sysj line: 206, column: 5
                                            thread116645(tdone,ends);
                                            thread116646(tdone,ends);
                                            thread116647(tdone,ends);
                                            thread116651(tdone,ends);
                                            int biggest116652 = 0;
                                            if(ends[14]>=biggest116652){
                                              biggest116652=ends[14];
                                            }
                                            if(ends[15]>=biggest116652){
                                              biggest116652=ends[15];
                                            }
                                            if(ends[16]>=biggest116652){
                                              biggest116652=ends[16];
                                            }
                                            if(ends[19]>=biggest116652){
                                              biggest116652=ends[19];
                                            }
                                            if(biggest116652 == 1){
                                              active[13]=1;
                                              ends[13]=1;
                                              break RUN;
                                            }
                                          }
                                          else {
                                            S98832=3;
                                            S99595=0;
                                            if(!capperStatus_o.isPartnerPresent() || capperStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 243, column: 4
                                              capperStatus_o.setREQ(false);//sysj\controller.sysj line: 243, column: 4
                                              S99595=1;
                                              active[13]=1;
                                              ends[13]=1;
                                              break RUN;
                                            }
                                            else {
                                              S99590=0;
                                              if(capperStatus_o.isACK()){//sysj\controller.sysj line: 243, column: 4
                                                capperStatus_o.setVal("done");//sysj\controller.sysj line: 243, column: 4
                                                S99590=1;
                                                if(!capperStatus_o.isACK()){//sysj\controller.sysj line: 243, column: 4
                                                  capperStatus_o.setREQ(false);//sysj\controller.sysj line: 243, column: 4
                                                  ends[13]=2;
                                                  ;//sysj\controller.sysj line: 243, column: 4
                                                  S98717=2;
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
                                    S98832=2;
                                    if(bottleAtPos4.getprestatus()){//sysj\controller.sysj line: 205, column: 12
                                      System.out.println("Capper doing work...");//sysj\controller.sysj line: 206, column: 5
                                      thread116653(tdone,ends);
                                      thread116654(tdone,ends);
                                      thread116655(tdone,ends);
                                      thread116659(tdone,ends);
                                      int biggest116660 = 0;
                                      if(ends[14]>=biggest116660){
                                        biggest116660=ends[14];
                                      }
                                      if(ends[15]>=biggest116660){
                                        biggest116660=ends[15];
                                      }
                                      if(ends[16]>=biggest116660){
                                        biggest116660=ends[16];
                                      }
                                      if(ends[19]>=biggest116660){
                                        biggest116660=ends[19];
                                      }
                                      if(biggest116660 == 1){
                                        active[13]=1;
                                        ends[13]=1;
                                        break RUN;
                                      }
                                    }
                                    else {
                                      S98832=3;
                                      S99595=0;
                                      if(!capperStatus_o.isPartnerPresent() || capperStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 243, column: 4
                                        capperStatus_o.setREQ(false);//sysj\controller.sysj line: 243, column: 4
                                        S99595=1;
                                        active[13]=1;
                                        ends[13]=1;
                                        break RUN;
                                      }
                                      else {
                                        S99590=0;
                                        if(capperStatus_o.isACK()){//sysj\controller.sysj line: 243, column: 4
                                          capperStatus_o.setVal("done");//sysj\controller.sysj line: 243, column: 4
                                          S99590=1;
                                          if(!capperStatus_o.isACK()){//sysj\controller.sysj line: 243, column: 4
                                            capperStatus_o.setREQ(false);//sysj\controller.sysj line: 243, column: 4
                                            ends[13]=2;
                                            ;//sysj\controller.sysj line: 243, column: 4
                                            S98717=2;
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
                          S98724=1;
                          S98724=0;
                          if(!capperStatus_o.isPartnerPresent() || capperStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 199, column: 4
                            capperStatus_o.setREQ(false);//sysj\controller.sysj line: 199, column: 4
                            S98724=1;
                            active[13]=1;
                            ends[13]=1;
                            break RUN;
                          }
                          else {
                            S98719=0;
                            if(capperStatus_o.isACK()){//sysj\controller.sysj line: 199, column: 4
                              capperStatus_o.setVal("busy");//sysj\controller.sysj line: 199, column: 4
                              S98719=1;
                              if(!capperStatus_o.isACK()){//sysj\controller.sysj line: 199, column: 4
                                capperStatus_o.setREQ(false);//sysj\controller.sysj line: 199, column: 4
                                ends[13]=2;
                                ;//sysj\controller.sysj line: 199, column: 4
                                S98832=1;
                                if(!bottleAtPos4.getprestatus()){//sysj\controller.sysj line: 201, column: 13
                                  S98746=0;
                                  if(!capperStatus_o.isPartnerPresent() || capperStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 202, column: 5
                                    capperStatus_o.setREQ(false);//sysj\controller.sysj line: 202, column: 5
                                    S98746=1;
                                    active[13]=1;
                                    ends[13]=1;
                                    break RUN;
                                  }
                                  else {
                                    S98741=0;
                                    if(capperStatus_o.isACK()){//sysj\controller.sysj line: 202, column: 5
                                      capperStatus_o.setVal("idle");//sysj\controller.sysj line: 202, column: 5
                                      S98741=1;
                                      if(!capperStatus_o.isACK()){//sysj\controller.sysj line: 202, column: 5
                                        capperStatus_o.setREQ(false);//sysj\controller.sysj line: 202, column: 5
                                        ends[13]=2;
                                        ;//sysj\controller.sysj line: 202, column: 5
                                        S98832=2;
                                        if(bottleAtPos4.getprestatus()){//sysj\controller.sysj line: 205, column: 12
                                          System.out.println("Capper doing work...");//sysj\controller.sysj line: 206, column: 5
                                          thread116661(tdone,ends);
                                          thread116662(tdone,ends);
                                          thread116663(tdone,ends);
                                          thread116667(tdone,ends);
                                          int biggest116668 = 0;
                                          if(ends[14]>=biggest116668){
                                            biggest116668=ends[14];
                                          }
                                          if(ends[15]>=biggest116668){
                                            biggest116668=ends[15];
                                          }
                                          if(ends[16]>=biggest116668){
                                            biggest116668=ends[16];
                                          }
                                          if(ends[19]>=biggest116668){
                                            biggest116668=ends[19];
                                          }
                                          if(biggest116668 == 1){
                                            active[13]=1;
                                            ends[13]=1;
                                            break RUN;
                                          }
                                        }
                                        else {
                                          S98832=3;
                                          S99595=0;
                                          if(!capperStatus_o.isPartnerPresent() || capperStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 243, column: 4
                                            capperStatus_o.setREQ(false);//sysj\controller.sysj line: 243, column: 4
                                            S99595=1;
                                            active[13]=1;
                                            ends[13]=1;
                                            break RUN;
                                          }
                                          else {
                                            S99590=0;
                                            if(capperStatus_o.isACK()){//sysj\controller.sysj line: 243, column: 4
                                              capperStatus_o.setVal("done");//sysj\controller.sysj line: 243, column: 4
                                              S99590=1;
                                              if(!capperStatus_o.isACK()){//sysj\controller.sysj line: 243, column: 4
                                                capperStatus_o.setREQ(false);//sysj\controller.sysj line: 243, column: 4
                                                ends[13]=2;
                                                ;//sysj\controller.sysj line: 243, column: 4
                                                S98717=2;
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
                                  S98832=2;
                                  if(bottleAtPos4.getprestatus()){//sysj\controller.sysj line: 205, column: 12
                                    System.out.println("Capper doing work...");//sysj\controller.sysj line: 206, column: 5
                                    thread116669(tdone,ends);
                                    thread116670(tdone,ends);
                                    thread116671(tdone,ends);
                                    thread116675(tdone,ends);
                                    int biggest116676 = 0;
                                    if(ends[14]>=biggest116676){
                                      biggest116676=ends[14];
                                    }
                                    if(ends[15]>=biggest116676){
                                      biggest116676=ends[15];
                                    }
                                    if(ends[16]>=biggest116676){
                                      biggest116676=ends[16];
                                    }
                                    if(ends[19]>=biggest116676){
                                      biggest116676=ends[19];
                                    }
                                    if(biggest116676 == 1){
                                      active[13]=1;
                                      ends[13]=1;
                                      break RUN;
                                    }
                                  }
                                  else {
                                    S98832=3;
                                    S99595=0;
                                    if(!capperStatus_o.isPartnerPresent() || capperStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 243, column: 4
                                      capperStatus_o.setREQ(false);//sysj\controller.sysj line: 243, column: 4
                                      S99595=1;
                                      active[13]=1;
                                      ends[13]=1;
                                      break RUN;
                                    }
                                    else {
                                      S99590=0;
                                      if(capperStatus_o.isACK()){//sysj\controller.sysj line: 243, column: 4
                                        capperStatus_o.setVal("done");//sysj\controller.sysj line: 243, column: 4
                                        S99590=1;
                                        if(!capperStatus_o.isACK()){//sysj\controller.sysj line: 243, column: 4
                                          capperStatus_o.setREQ(false);//sysj\controller.sysj line: 243, column: 4
                                          ends[13]=2;
                                          ;//sysj\controller.sysj line: 243, column: 4
                                          S98717=2;
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
                      switch(S98746){
                        case 0 : 
                          if(!capperStatus_o.isPartnerPresent() || capperStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 202, column: 5
                            capperStatus_o.setREQ(false);//sysj\controller.sysj line: 202, column: 5
                            S98746=1;
                            active[13]=1;
                            ends[13]=1;
                            break RUN;
                          }
                          else {
                            switch(S98741){
                              case 0 : 
                                if(capperStatus_o.isACK()){//sysj\controller.sysj line: 202, column: 5
                                  capperStatus_o.setVal("idle");//sysj\controller.sysj line: 202, column: 5
                                  S98741=1;
                                  if(!capperStatus_o.isACK()){//sysj\controller.sysj line: 202, column: 5
                                    capperStatus_o.setREQ(false);//sysj\controller.sysj line: 202, column: 5
                                    ends[13]=2;
                                    ;//sysj\controller.sysj line: 202, column: 5
                                    S98832=2;
                                    if(bottleAtPos4.getprestatus()){//sysj\controller.sysj line: 205, column: 12
                                      System.out.println("Capper doing work...");//sysj\controller.sysj line: 206, column: 5
                                      thread116677(tdone,ends);
                                      thread116678(tdone,ends);
                                      thread116679(tdone,ends);
                                      thread116683(tdone,ends);
                                      int biggest116684 = 0;
                                      if(ends[14]>=biggest116684){
                                        biggest116684=ends[14];
                                      }
                                      if(ends[15]>=biggest116684){
                                        biggest116684=ends[15];
                                      }
                                      if(ends[16]>=biggest116684){
                                        biggest116684=ends[16];
                                      }
                                      if(ends[19]>=biggest116684){
                                        biggest116684=ends[19];
                                      }
                                      if(biggest116684 == 1){
                                        active[13]=1;
                                        ends[13]=1;
                                        break RUN;
                                      }
                                    }
                                    else {
                                      S98832=3;
                                      S99595=0;
                                      if(!capperStatus_o.isPartnerPresent() || capperStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 243, column: 4
                                        capperStatus_o.setREQ(false);//sysj\controller.sysj line: 243, column: 4
                                        S99595=1;
                                        active[13]=1;
                                        ends[13]=1;
                                        break RUN;
                                      }
                                      else {
                                        S99590=0;
                                        if(capperStatus_o.isACK()){//sysj\controller.sysj line: 243, column: 4
                                          capperStatus_o.setVal("done");//sysj\controller.sysj line: 243, column: 4
                                          S99590=1;
                                          if(!capperStatus_o.isACK()){//sysj\controller.sysj line: 243, column: 4
                                            capperStatus_o.setREQ(false);//sysj\controller.sysj line: 243, column: 4
                                            ends[13]=2;
                                            ;//sysj\controller.sysj line: 243, column: 4
                                            S98717=2;
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
                                if(!capperStatus_o.isACK()){//sysj\controller.sysj line: 202, column: 5
                                  capperStatus_o.setREQ(false);//sysj\controller.sysj line: 202, column: 5
                                  ends[13]=2;
                                  ;//sysj\controller.sysj line: 202, column: 5
                                  S98832=2;
                                  if(bottleAtPos4.getprestatus()){//sysj\controller.sysj line: 205, column: 12
                                    System.out.println("Capper doing work...");//sysj\controller.sysj line: 206, column: 5
                                    thread116685(tdone,ends);
                                    thread116686(tdone,ends);
                                    thread116687(tdone,ends);
                                    thread116691(tdone,ends);
                                    int biggest116692 = 0;
                                    if(ends[14]>=biggest116692){
                                      biggest116692=ends[14];
                                    }
                                    if(ends[15]>=biggest116692){
                                      biggest116692=ends[15];
                                    }
                                    if(ends[16]>=biggest116692){
                                      biggest116692=ends[16];
                                    }
                                    if(ends[19]>=biggest116692){
                                      biggest116692=ends[19];
                                    }
                                    if(biggest116692 == 1){
                                      active[13]=1;
                                      ends[13]=1;
                                      break RUN;
                                    }
                                  }
                                  else {
                                    S98832=3;
                                    S99595=0;
                                    if(!capperStatus_o.isPartnerPresent() || capperStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 243, column: 4
                                      capperStatus_o.setREQ(false);//sysj\controller.sysj line: 243, column: 4
                                      S99595=1;
                                      active[13]=1;
                                      ends[13]=1;
                                      break RUN;
                                    }
                                    else {
                                      S99590=0;
                                      if(capperStatus_o.isACK()){//sysj\controller.sysj line: 243, column: 4
                                        capperStatus_o.setVal("done");//sysj\controller.sysj line: 243, column: 4
                                        S99590=1;
                                        if(!capperStatus_o.isACK()){//sysj\controller.sysj line: 243, column: 4
                                          capperStatus_o.setREQ(false);//sysj\controller.sysj line: 243, column: 4
                                          ends[13]=2;
                                          ;//sysj\controller.sysj line: 243, column: 4
                                          S98717=2;
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
                          S98746=1;
                          S98746=0;
                          if(!capperStatus_o.isPartnerPresent() || capperStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 202, column: 5
                            capperStatus_o.setREQ(false);//sysj\controller.sysj line: 202, column: 5
                            S98746=1;
                            active[13]=1;
                            ends[13]=1;
                            break RUN;
                          }
                          else {
                            S98741=0;
                            if(capperStatus_o.isACK()){//sysj\controller.sysj line: 202, column: 5
                              capperStatus_o.setVal("idle");//sysj\controller.sysj line: 202, column: 5
                              S98741=1;
                              if(!capperStatus_o.isACK()){//sysj\controller.sysj line: 202, column: 5
                                capperStatus_o.setREQ(false);//sysj\controller.sysj line: 202, column: 5
                                ends[13]=2;
                                ;//sysj\controller.sysj line: 202, column: 5
                                S98832=2;
                                if(bottleAtPos4.getprestatus()){//sysj\controller.sysj line: 205, column: 12
                                  System.out.println("Capper doing work...");//sysj\controller.sysj line: 206, column: 5
                                  thread116693(tdone,ends);
                                  thread116694(tdone,ends);
                                  thread116695(tdone,ends);
                                  thread116699(tdone,ends);
                                  int biggest116700 = 0;
                                  if(ends[14]>=biggest116700){
                                    biggest116700=ends[14];
                                  }
                                  if(ends[15]>=biggest116700){
                                    biggest116700=ends[15];
                                  }
                                  if(ends[16]>=biggest116700){
                                    biggest116700=ends[16];
                                  }
                                  if(ends[19]>=biggest116700){
                                    biggest116700=ends[19];
                                  }
                                  if(biggest116700 == 1){
                                    active[13]=1;
                                    ends[13]=1;
                                    break RUN;
                                  }
                                }
                                else {
                                  S98832=3;
                                  S99595=0;
                                  if(!capperStatus_o.isPartnerPresent() || capperStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 243, column: 4
                                    capperStatus_o.setREQ(false);//sysj\controller.sysj line: 243, column: 4
                                    S99595=1;
                                    active[13]=1;
                                    ends[13]=1;
                                    break RUN;
                                  }
                                  else {
                                    S99590=0;
                                    if(capperStatus_o.isACK()){//sysj\controller.sysj line: 243, column: 4
                                      capperStatus_o.setVal("done");//sysj\controller.sysj line: 243, column: 4
                                      S99590=1;
                                      if(!capperStatus_o.isACK()){//sysj\controller.sysj line: 243, column: 4
                                        capperStatus_o.setREQ(false);//sysj\controller.sysj line: 243, column: 4
                                        ends[13]=2;
                                        ;//sysj\controller.sysj line: 243, column: 4
                                        S98717=2;
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
                      thread116701(tdone,ends);
                      thread116702(tdone,ends);
                      thread116703(tdone,ends);
                      thread116707(tdone,ends);
                      int biggest116708 = 0;
                      if(ends[14]>=biggest116708){
                        biggest116708=ends[14];
                      }
                      if(ends[15]>=biggest116708){
                        biggest116708=ends[15];
                      }
                      if(ends[16]>=biggest116708){
                        biggest116708=ends[16];
                      }
                      if(ends[19]>=biggest116708){
                        biggest116708=ends[19];
                      }
                      if(biggest116708 == 1){
                        active[13]=1;
                        ends[13]=1;
                        break RUN;
                      }
                      //FINXME code
                      if(biggest116708 == 0){
                        S98832=3;
                        S99595=0;
                        if(!capperStatus_o.isPartnerPresent() || capperStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 243, column: 4
                          capperStatus_o.setREQ(false);//sysj\controller.sysj line: 243, column: 4
                          S99595=1;
                          active[13]=1;
                          ends[13]=1;
                          break RUN;
                        }
                        else {
                          S99590=0;
                          if(capperStatus_o.isACK()){//sysj\controller.sysj line: 243, column: 4
                            capperStatus_o.setVal("done");//sysj\controller.sysj line: 243, column: 4
                            S99590=1;
                            if(!capperStatus_o.isACK()){//sysj\controller.sysj line: 243, column: 4
                              capperStatus_o.setREQ(false);//sysj\controller.sysj line: 243, column: 4
                              ends[13]=2;
                              ;//sysj\controller.sysj line: 243, column: 4
                              S98717=2;
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
                      switch(S99595){
                        case 0 : 
                          if(!capperStatus_o.isPartnerPresent() || capperStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 243, column: 4
                            capperStatus_o.setREQ(false);//sysj\controller.sysj line: 243, column: 4
                            S99595=1;
                            active[13]=1;
                            ends[13]=1;
                            break RUN;
                          }
                          else {
                            switch(S99590){
                              case 0 : 
                                if(capperStatus_o.isACK()){//sysj\controller.sysj line: 243, column: 4
                                  capperStatus_o.setVal("done");//sysj\controller.sysj line: 243, column: 4
                                  S99590=1;
                                  if(!capperStatus_o.isACK()){//sysj\controller.sysj line: 243, column: 4
                                    capperStatus_o.setREQ(false);//sysj\controller.sysj line: 243, column: 4
                                    ends[13]=2;
                                    ;//sysj\controller.sysj line: 243, column: 4
                                    S98717=2;
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
                                if(!capperStatus_o.isACK()){//sysj\controller.sysj line: 243, column: 4
                                  capperStatus_o.setREQ(false);//sysj\controller.sysj line: 243, column: 4
                                  ends[13]=2;
                                  ;//sysj\controller.sysj line: 243, column: 4
                                  S98717=2;
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
                          S99595=1;
                          S99595=0;
                          if(!capperStatus_o.isPartnerPresent() || capperStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 243, column: 4
                            capperStatus_o.setREQ(false);//sysj\controller.sysj line: 243, column: 4
                            S99595=1;
                            active[13]=1;
                            ends[13]=1;
                            break RUN;
                          }
                          else {
                            S99590=0;
                            if(capperStatus_o.isACK()){//sysj\controller.sysj line: 243, column: 4
                              capperStatus_o.setVal("done");//sysj\controller.sysj line: 243, column: 4
                              S99590=1;
                              if(!capperStatus_o.isACK()){//sysj\controller.sysj line: 243, column: 4
                                capperStatus_o.setREQ(false);//sysj\controller.sysj line: 243, column: 4
                                ends[13]=2;
                                ;//sysj\controller.sysj line: 243, column: 4
                                S98717=2;
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
                  switch(S99815){
                    case 0 : 
                      if(!capperStatus_o.isPartnerPresent() || capperStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 245, column: 4
                        capperStatus_o.setREQ(false);//sysj\controller.sysj line: 245, column: 4
                        S99815=1;
                        active[13]=1;
                        ends[13]=1;
                        break RUN;
                      }
                      else {
                        switch(S99810){
                          case 0 : 
                            if(capperStatus_o.isACK()){//sysj\controller.sysj line: 245, column: 4
                              capperStatus_o.setVal("idle");//sysj\controller.sysj line: 245, column: 4
                              S99810=1;
                              if(!capperStatus_o.isACK()){//sysj\controller.sysj line: 245, column: 4
                                capperStatus_o.setREQ(false);//sysj\controller.sysj line: 245, column: 4
                                ends[13]=2;
                                ;//sysj\controller.sysj line: 245, column: 4
                                S98717=2;
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
                            if(!capperStatus_o.isACK()){//sysj\controller.sysj line: 245, column: 4
                              capperStatus_o.setREQ(false);//sysj\controller.sysj line: 245, column: 4
                              ends[13]=2;
                              ;//sysj\controller.sysj line: 245, column: 4
                              S98717=2;
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
                      S99815=1;
                      S99815=0;
                      if(!capperStatus_o.isPartnerPresent() || capperStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 245, column: 4
                        capperStatus_o.setREQ(false);//sysj\controller.sysj line: 245, column: 4
                        S99815=1;
                        active[13]=1;
                        ends[13]=1;
                        break RUN;
                      }
                      else {
                        S99810=0;
                        if(capperStatus_o.isACK()){//sysj\controller.sysj line: 245, column: 4
                          capperStatus_o.setVal("idle");//sysj\controller.sysj line: 245, column: 4
                          S99810=1;
                          if(!capperStatus_o.isACK()){//sysj\controller.sysj line: 245, column: 4
                            capperStatus_o.setREQ(false);//sysj\controller.sysj line: 245, column: 4
                            ends[13]=2;
                            ;//sysj\controller.sysj line: 245, column: 4
                            S98717=2;
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
              S98717=2;
              S98717=0;
              S98701=0;
              if(!capperReq_in.isPartnerPresent() || capperReq_in.isPartnerPreempted()){//sysj\controller.sysj line: 195, column: 3
                capperReq_in.setACK(false);//sysj\controller.sysj line: 195, column: 3
                S98701=1;
                active[13]=1;
                ends[13]=1;
                break RUN;
              }
              else {
                S98696=0;
                if(!capperReq_in.isREQ()){//sysj\controller.sysj line: 195, column: 3
                  capperReq_in.setACK(true);//sysj\controller.sysj line: 195, column: 3
                  S98696=1;
                  if(capperReq_in.isREQ()){//sysj\controller.sysj line: 195, column: 3
                    capperReq_in.setACK(false);//sysj\controller.sysj line: 195, column: 3
                    ends[13]=2;
                    ;//sysj\controller.sysj line: 195, column: 3
                    request_thread_13 = (boolean)(capperReq_in.getVal() == null ? false : ((Boolean)capperReq_in.getVal()).booleanValue());//sysj\controller.sysj line: 196, column: 3
                    S98717=1;
                    if(request_thread_13){//sysj\controller.sysj line: 198, column: 3
                      S99831=0;
                      S98832=0;
                      S98724=0;
                      if(!capperStatus_o.isPartnerPresent() || capperStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 199, column: 4
                        capperStatus_o.setREQ(false);//sysj\controller.sysj line: 199, column: 4
                        S98724=1;
                        active[13]=1;
                        ends[13]=1;
                        break RUN;
                      }
                      else {
                        S98719=0;
                        if(capperStatus_o.isACK()){//sysj\controller.sysj line: 199, column: 4
                          capperStatus_o.setVal("busy");//sysj\controller.sysj line: 199, column: 4
                          S98719=1;
                          if(!capperStatus_o.isACK()){//sysj\controller.sysj line: 199, column: 4
                            capperStatus_o.setREQ(false);//sysj\controller.sysj line: 199, column: 4
                            ends[13]=2;
                            ;//sysj\controller.sysj line: 199, column: 4
                            S98832=1;
                            if(!bottleAtPos4.getprestatus()){//sysj\controller.sysj line: 201, column: 13
                              S98746=0;
                              if(!capperStatus_o.isPartnerPresent() || capperStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 202, column: 5
                                capperStatus_o.setREQ(false);//sysj\controller.sysj line: 202, column: 5
                                S98746=1;
                                active[13]=1;
                                ends[13]=1;
                                break RUN;
                              }
                              else {
                                S98741=0;
                                if(capperStatus_o.isACK()){//sysj\controller.sysj line: 202, column: 5
                                  capperStatus_o.setVal("idle");//sysj\controller.sysj line: 202, column: 5
                                  S98741=1;
                                  if(!capperStatus_o.isACK()){//sysj\controller.sysj line: 202, column: 5
                                    capperStatus_o.setREQ(false);//sysj\controller.sysj line: 202, column: 5
                                    ends[13]=2;
                                    ;//sysj\controller.sysj line: 202, column: 5
                                    S98832=2;
                                    if(bottleAtPos4.getprestatus()){//sysj\controller.sysj line: 205, column: 12
                                      System.out.println("Capper doing work...");//sysj\controller.sysj line: 206, column: 5
                                      thread116709(tdone,ends);
                                      thread116710(tdone,ends);
                                      thread116711(tdone,ends);
                                      thread116715(tdone,ends);
                                      int biggest116716 = 0;
                                      if(ends[14]>=biggest116716){
                                        biggest116716=ends[14];
                                      }
                                      if(ends[15]>=biggest116716){
                                        biggest116716=ends[15];
                                      }
                                      if(ends[16]>=biggest116716){
                                        biggest116716=ends[16];
                                      }
                                      if(ends[19]>=biggest116716){
                                        biggest116716=ends[19];
                                      }
                                      if(biggest116716 == 1){
                                        active[13]=1;
                                        ends[13]=1;
                                        break RUN;
                                      }
                                    }
                                    else {
                                      S98832=3;
                                      S99595=0;
                                      if(!capperStatus_o.isPartnerPresent() || capperStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 243, column: 4
                                        capperStatus_o.setREQ(false);//sysj\controller.sysj line: 243, column: 4
                                        S99595=1;
                                        active[13]=1;
                                        ends[13]=1;
                                        break RUN;
                                      }
                                      else {
                                        S99590=0;
                                        if(capperStatus_o.isACK()){//sysj\controller.sysj line: 243, column: 4
                                          capperStatus_o.setVal("done");//sysj\controller.sysj line: 243, column: 4
                                          S99590=1;
                                          if(!capperStatus_o.isACK()){//sysj\controller.sysj line: 243, column: 4
                                            capperStatus_o.setREQ(false);//sysj\controller.sysj line: 243, column: 4
                                            ends[13]=2;
                                            ;//sysj\controller.sysj line: 243, column: 4
                                            S98717=2;
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
                              S98832=2;
                              if(bottleAtPos4.getprestatus()){//sysj\controller.sysj line: 205, column: 12
                                System.out.println("Capper doing work...");//sysj\controller.sysj line: 206, column: 5
                                thread116717(tdone,ends);
                                thread116718(tdone,ends);
                                thread116719(tdone,ends);
                                thread116723(tdone,ends);
                                int biggest116724 = 0;
                                if(ends[14]>=biggest116724){
                                  biggest116724=ends[14];
                                }
                                if(ends[15]>=biggest116724){
                                  biggest116724=ends[15];
                                }
                                if(ends[16]>=biggest116724){
                                  biggest116724=ends[16];
                                }
                                if(ends[19]>=biggest116724){
                                  biggest116724=ends[19];
                                }
                                if(biggest116724 == 1){
                                  active[13]=1;
                                  ends[13]=1;
                                  break RUN;
                                }
                              }
                              else {
                                S98832=3;
                                S99595=0;
                                if(!capperStatus_o.isPartnerPresent() || capperStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 243, column: 4
                                  capperStatus_o.setREQ(false);//sysj\controller.sysj line: 243, column: 4
                                  S99595=1;
                                  active[13]=1;
                                  ends[13]=1;
                                  break RUN;
                                }
                                else {
                                  S99590=0;
                                  if(capperStatus_o.isACK()){//sysj\controller.sysj line: 243, column: 4
                                    capperStatus_o.setVal("done");//sysj\controller.sysj line: 243, column: 4
                                    S99590=1;
                                    if(!capperStatus_o.isACK()){//sysj\controller.sysj line: 243, column: 4
                                      capperStatus_o.setREQ(false);//sysj\controller.sysj line: 243, column: 4
                                      ends[13]=2;
                                      ;//sysj\controller.sysj line: 243, column: 4
                                      S98717=2;
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
                      S99831=1;
                      S99815=0;
                      if(!capperStatus_o.isPartnerPresent() || capperStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 245, column: 4
                        capperStatus_o.setREQ(false);//sysj\controller.sysj line: 245, column: 4
                        S99815=1;
                        active[13]=1;
                        ends[13]=1;
                        break RUN;
                      }
                      else {
                        S99810=0;
                        if(capperStatus_o.isACK()){//sysj\controller.sysj line: 245, column: 4
                          capperStatus_o.setVal("idle");//sysj\controller.sysj line: 245, column: 4
                          S99810=1;
                          if(!capperStatus_o.isACK()){//sysj\controller.sysj line: 245, column: 4
                            capperStatus_o.setREQ(false);//sysj\controller.sysj line: 245, column: 4
                            ends[13]=2;
                            ;//sysj\controller.sysj line: 245, column: 4
                            S98717=2;
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
