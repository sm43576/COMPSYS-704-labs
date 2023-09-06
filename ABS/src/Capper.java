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
  private int S112199 = 1;
  private int S100565 = 1;
  private int S100549 = 1;
  private int S100544 = 1;
  private int S100680 = 1;
  private int S100572 = 1;
  private int S100567 = 1;
  private int S100594 = 1;
  private int S100589 = 1;
  private int S100686 = 1;
  private int S100692 = 1;
  private int S100708 = 1;
  private int S100707 = 1;
  private int S100695 = 1;
  private int S100698 = 1;
  private int S100721 = 1;
  private int S100718 = 1;
  private int S104060 = 1;
  private int S104055 = 1;
  
  private int[] ends = new int[23];
  private int[] tdone = new int[23];
  
  public void thread116789(int [] tdone, int [] ends){
        S100721=1;
    S100718=0;
    active[19]=1;
    ends[19]=1;
    tdone[19]=1;
  }

  public void thread116787(int [] tdone, int [] ends){
        S100698=1;
    active[18]=1;
    ends[18]=1;
    tdone[18]=1;
  }

  public void thread116786(int [] tdone, int [] ends){
        S100695=1;
    active[17]=1;
    ends[17]=1;
    tdone[17]=1;
  }

  public void thread116785(int [] tdone, int [] ends){
        S100708=1;
    S100707=0;
    thread116786(tdone,ends);
    thread116787(tdone,ends);
    int biggest116788 = 0;
    if(ends[17]>=biggest116788){
      biggest116788=ends[17];
    }
    if(ends[18]>=biggest116788){
      biggest116788=ends[18];
    }
    if(biggest116788 == 1){
      active[16]=1;
      ends[16]=1;
      tdone[16]=1;
    }
  }

  public void thread116784(int [] tdone, int [] ends){
        S100692=1;
    cylPos5ZAxisExtend.setPresent();//sysj\controller.sysj line: 214, column: 7
    currsigs.addElement(cylPos5ZAxisExtend);
    active[15]=1;
    ends[15]=1;
    tdone[15]=1;
  }

  public void thread116783(int [] tdone, int [] ends){
        S100686=1;
    cylClampBottleExtend.setPresent();//sysj\controller.sysj line: 208, column: 7
    currsigs.addElement(cylClampBottleExtend);
    active[14]=1;
    ends[14]=1;
    tdone[14]=1;
  }

  public void thread116781(int [] tdone, int [] ends){
        S100721=1;
    S100718=0;
    active[19]=1;
    ends[19]=1;
    tdone[19]=1;
  }

  public void thread116779(int [] tdone, int [] ends){
        S100698=1;
    active[18]=1;
    ends[18]=1;
    tdone[18]=1;
  }

  public void thread116778(int [] tdone, int [] ends){
        S100695=1;
    active[17]=1;
    ends[17]=1;
    tdone[17]=1;
  }

  public void thread116777(int [] tdone, int [] ends){
        S100708=1;
    S100707=0;
    thread116778(tdone,ends);
    thread116779(tdone,ends);
    int biggest116780 = 0;
    if(ends[17]>=biggest116780){
      biggest116780=ends[17];
    }
    if(ends[18]>=biggest116780){
      biggest116780=ends[18];
    }
    if(biggest116780 == 1){
      active[16]=1;
      ends[16]=1;
      tdone[16]=1;
    }
  }

  public void thread116776(int [] tdone, int [] ends){
        S100692=1;
    cylPos5ZAxisExtend.setPresent();//sysj\controller.sysj line: 214, column: 7
    currsigs.addElement(cylPos5ZAxisExtend);
    active[15]=1;
    ends[15]=1;
    tdone[15]=1;
  }

  public void thread116775(int [] tdone, int [] ends){
        S100686=1;
    cylClampBottleExtend.setPresent();//sysj\controller.sysj line: 208, column: 7
    currsigs.addElement(cylClampBottleExtend);
    active[14]=1;
    ends[14]=1;
    tdone[14]=1;
  }

  public void thread116773(int [] tdone, int [] ends){
        switch(S100721){
      case 0 : 
        active[19]=0;
        ends[19]=0;
        tdone[19]=1;
        break;
      
      case 1 : 
        switch(S100718){
          case 0 : 
            if(gripperGrippedCap.getprestatus()){//sysj\controller.sysj line: 227, column: 12
              S100718=1;
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
              S100721=0;
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

  public void thread116771(int [] tdone, int [] ends){
        switch(S100698){
      case 0 : 
        active[18]=0;
        ends[18]=0;
        tdone[18]=1;
        break;
      
      case 1 : 
        if(cylClampedBottle.getprestatus()){//sysj\controller.sysj line: 220, column: 46
          S100698=0;
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

  public void thread116770(int [] tdone, int [] ends){
        switch(S100695){
      case 0 : 
        active[17]=0;
        ends[17]=0;
        tdone[17]=1;
        break;
      
      case 1 : 
        if(gripperZAxisLowered.getprestatus()){//sysj\controller.sysj line: 220, column: 13
          S100695=0;
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

  public void thread116769(int [] tdone, int [] ends){
        switch(S100708){
      case 0 : 
        active[16]=0;
        ends[16]=0;
        tdone[16]=1;
        break;
      
      case 1 : 
        switch(S100707){
          case 0 : 
            thread116770(tdone,ends);
            thread116771(tdone,ends);
            int biggest116772 = 0;
            if(ends[17]>=biggest116772){
              biggest116772=ends[17];
            }
            if(ends[18]>=biggest116772){
              biggest116772=ends[18];
            }
            if(biggest116772 == 1){
              active[16]=1;
              ends[16]=1;
              tdone[16]=1;
            }
            //FINXME code
            if(biggest116772 == 0){
              S100707=1;
              capGripperPos5Extend.setPresent();//sysj\controller.sysj line: 222, column: 7
              currsigs.addElement(capGripperPos5Extend);
              active[16]=1;
              ends[16]=1;
              tdone[16]=1;
            }
            break;
          
          case 1 : 
            if(releaseCap_13.getprestatus()){//sysj\controller.sysj line: 221, column: 12
              S100708=0;
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

  public void thread116768(int [] tdone, int [] ends){
        switch(S100692){
      case 0 : 
        active[15]=0;
        ends[15]=0;
        tdone[15]=1;
        break;
      
      case 1 : 
        if(raiseGripper_13.getprestatus()){//sysj\controller.sysj line: 213, column: 12
          S100692=0;
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

  public void thread116767(int [] tdone, int [] ends){
        switch(S100686){
      case 0 : 
        active[14]=0;
        ends[14]=0;
        tdone[14]=1;
        break;
      
      case 1 : 
        if(unclampBottle_13.getprestatus()){//sysj\controller.sysj line: 207, column: 13
          S100686=0;
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

  public void thread116765(int [] tdone, int [] ends){
        S100721=1;
    S100718=0;
    active[19]=1;
    ends[19]=1;
    tdone[19]=1;
  }

  public void thread116763(int [] tdone, int [] ends){
        S100698=1;
    active[18]=1;
    ends[18]=1;
    tdone[18]=1;
  }

  public void thread116762(int [] tdone, int [] ends){
        S100695=1;
    active[17]=1;
    ends[17]=1;
    tdone[17]=1;
  }

  public void thread116761(int [] tdone, int [] ends){
        S100708=1;
    S100707=0;
    thread116762(tdone,ends);
    thread116763(tdone,ends);
    int biggest116764 = 0;
    if(ends[17]>=biggest116764){
      biggest116764=ends[17];
    }
    if(ends[18]>=biggest116764){
      biggest116764=ends[18];
    }
    if(biggest116764 == 1){
      active[16]=1;
      ends[16]=1;
      tdone[16]=1;
    }
  }

  public void thread116760(int [] tdone, int [] ends){
        S100692=1;
    cylPos5ZAxisExtend.setPresent();//sysj\controller.sysj line: 214, column: 7
    currsigs.addElement(cylPos5ZAxisExtend);
    active[15]=1;
    ends[15]=1;
    tdone[15]=1;
  }

  public void thread116759(int [] tdone, int [] ends){
        S100686=1;
    cylClampBottleExtend.setPresent();//sysj\controller.sysj line: 208, column: 7
    currsigs.addElement(cylClampBottleExtend);
    active[14]=1;
    ends[14]=1;
    tdone[14]=1;
  }

  public void thread116757(int [] tdone, int [] ends){
        S100721=1;
    S100718=0;
    active[19]=1;
    ends[19]=1;
    tdone[19]=1;
  }

  public void thread116755(int [] tdone, int [] ends){
        S100698=1;
    active[18]=1;
    ends[18]=1;
    tdone[18]=1;
  }

  public void thread116754(int [] tdone, int [] ends){
        S100695=1;
    active[17]=1;
    ends[17]=1;
    tdone[17]=1;
  }

  public void thread116753(int [] tdone, int [] ends){
        S100708=1;
    S100707=0;
    thread116754(tdone,ends);
    thread116755(tdone,ends);
    int biggest116756 = 0;
    if(ends[17]>=biggest116756){
      biggest116756=ends[17];
    }
    if(ends[18]>=biggest116756){
      biggest116756=ends[18];
    }
    if(biggest116756 == 1){
      active[16]=1;
      ends[16]=1;
      tdone[16]=1;
    }
  }

  public void thread116752(int [] tdone, int [] ends){
        S100692=1;
    cylPos5ZAxisExtend.setPresent();//sysj\controller.sysj line: 214, column: 7
    currsigs.addElement(cylPos5ZAxisExtend);
    active[15]=1;
    ends[15]=1;
    tdone[15]=1;
  }

  public void thread116751(int [] tdone, int [] ends){
        S100686=1;
    cylClampBottleExtend.setPresent();//sysj\controller.sysj line: 208, column: 7
    currsigs.addElement(cylClampBottleExtend);
    active[14]=1;
    ends[14]=1;
    tdone[14]=1;
  }

  public void thread116749(int [] tdone, int [] ends){
        S100721=1;
    S100718=0;
    active[19]=1;
    ends[19]=1;
    tdone[19]=1;
  }

  public void thread116747(int [] tdone, int [] ends){
        S100698=1;
    active[18]=1;
    ends[18]=1;
    tdone[18]=1;
  }

  public void thread116746(int [] tdone, int [] ends){
        S100695=1;
    active[17]=1;
    ends[17]=1;
    tdone[17]=1;
  }

  public void thread116745(int [] tdone, int [] ends){
        S100708=1;
    S100707=0;
    thread116746(tdone,ends);
    thread116747(tdone,ends);
    int biggest116748 = 0;
    if(ends[17]>=biggest116748){
      biggest116748=ends[17];
    }
    if(ends[18]>=biggest116748){
      biggest116748=ends[18];
    }
    if(biggest116748 == 1){
      active[16]=1;
      ends[16]=1;
      tdone[16]=1;
    }
  }

  public void thread116744(int [] tdone, int [] ends){
        S100692=1;
    cylPos5ZAxisExtend.setPresent();//sysj\controller.sysj line: 214, column: 7
    currsigs.addElement(cylPos5ZAxisExtend);
    active[15]=1;
    ends[15]=1;
    tdone[15]=1;
  }

  public void thread116743(int [] tdone, int [] ends){
        S100686=1;
    cylClampBottleExtend.setPresent();//sysj\controller.sysj line: 208, column: 7
    currsigs.addElement(cylClampBottleExtend);
    active[14]=1;
    ends[14]=1;
    tdone[14]=1;
  }

  public void thread116741(int [] tdone, int [] ends){
        S100721=1;
    S100718=0;
    active[19]=1;
    ends[19]=1;
    tdone[19]=1;
  }

  public void thread116739(int [] tdone, int [] ends){
        S100698=1;
    active[18]=1;
    ends[18]=1;
    tdone[18]=1;
  }

  public void thread116738(int [] tdone, int [] ends){
        S100695=1;
    active[17]=1;
    ends[17]=1;
    tdone[17]=1;
  }

  public void thread116737(int [] tdone, int [] ends){
        S100708=1;
    S100707=0;
    thread116738(tdone,ends);
    thread116739(tdone,ends);
    int biggest116740 = 0;
    if(ends[17]>=biggest116740){
      biggest116740=ends[17];
    }
    if(ends[18]>=biggest116740){
      biggest116740=ends[18];
    }
    if(biggest116740 == 1){
      active[16]=1;
      ends[16]=1;
      tdone[16]=1;
    }
  }

  public void thread116736(int [] tdone, int [] ends){
        S100692=1;
    cylPos5ZAxisExtend.setPresent();//sysj\controller.sysj line: 214, column: 7
    currsigs.addElement(cylPos5ZAxisExtend);
    active[15]=1;
    ends[15]=1;
    tdone[15]=1;
  }

  public void thread116735(int [] tdone, int [] ends){
        S100686=1;
    cylClampBottleExtend.setPresent();//sysj\controller.sysj line: 208, column: 7
    currsigs.addElement(cylClampBottleExtend);
    active[14]=1;
    ends[14]=1;
    tdone[14]=1;
  }

  public void thread116733(int [] tdone, int [] ends){
        S100721=1;
    S100718=0;
    active[19]=1;
    ends[19]=1;
    tdone[19]=1;
  }

  public void thread116731(int [] tdone, int [] ends){
        S100698=1;
    active[18]=1;
    ends[18]=1;
    tdone[18]=1;
  }

  public void thread116730(int [] tdone, int [] ends){
        S100695=1;
    active[17]=1;
    ends[17]=1;
    tdone[17]=1;
  }

  public void thread116729(int [] tdone, int [] ends){
        S100708=1;
    S100707=0;
    thread116730(tdone,ends);
    thread116731(tdone,ends);
    int biggest116732 = 0;
    if(ends[17]>=biggest116732){
      biggest116732=ends[17];
    }
    if(ends[18]>=biggest116732){
      biggest116732=ends[18];
    }
    if(biggest116732 == 1){
      active[16]=1;
      ends[16]=1;
      tdone[16]=1;
    }
  }

  public void thread116728(int [] tdone, int [] ends){
        S100692=1;
    cylPos5ZAxisExtend.setPresent();//sysj\controller.sysj line: 214, column: 7
    currsigs.addElement(cylPos5ZAxisExtend);
    active[15]=1;
    ends[15]=1;
    tdone[15]=1;
  }

  public void thread116727(int [] tdone, int [] ends){
        S100686=1;
    cylClampBottleExtend.setPresent();//sysj\controller.sysj line: 208, column: 7
    currsigs.addElement(cylClampBottleExtend);
    active[14]=1;
    ends[14]=1;
    tdone[14]=1;
  }

  public void thread116725(int [] tdone, int [] ends){
        S100721=1;
    S100718=0;
    active[19]=1;
    ends[19]=1;
    tdone[19]=1;
  }

  public void thread116723(int [] tdone, int [] ends){
        S100698=1;
    active[18]=1;
    ends[18]=1;
    tdone[18]=1;
  }

  public void thread116722(int [] tdone, int [] ends){
        S100695=1;
    active[17]=1;
    ends[17]=1;
    tdone[17]=1;
  }

  public void thread116721(int [] tdone, int [] ends){
        S100708=1;
    S100707=0;
    thread116722(tdone,ends);
    thread116723(tdone,ends);
    int biggest116724 = 0;
    if(ends[17]>=biggest116724){
      biggest116724=ends[17];
    }
    if(ends[18]>=biggest116724){
      biggest116724=ends[18];
    }
    if(biggest116724 == 1){
      active[16]=1;
      ends[16]=1;
      tdone[16]=1;
    }
  }

  public void thread116720(int [] tdone, int [] ends){
        S100692=1;
    cylPos5ZAxisExtend.setPresent();//sysj\controller.sysj line: 214, column: 7
    currsigs.addElement(cylPos5ZAxisExtend);
    active[15]=1;
    ends[15]=1;
    tdone[15]=1;
  }

  public void thread116719(int [] tdone, int [] ends){
        S100686=1;
    cylClampBottleExtend.setPresent();//sysj\controller.sysj line: 208, column: 7
    currsigs.addElement(cylClampBottleExtend);
    active[14]=1;
    ends[14]=1;
    tdone[14]=1;
  }

  public void thread116717(int [] tdone, int [] ends){
        S100721=1;
    S100718=0;
    active[19]=1;
    ends[19]=1;
    tdone[19]=1;
  }

  public void thread116715(int [] tdone, int [] ends){
        S100698=1;
    active[18]=1;
    ends[18]=1;
    tdone[18]=1;
  }

  public void thread116714(int [] tdone, int [] ends){
        S100695=1;
    active[17]=1;
    ends[17]=1;
    tdone[17]=1;
  }

  public void thread116713(int [] tdone, int [] ends){
        S100708=1;
    S100707=0;
    thread116714(tdone,ends);
    thread116715(tdone,ends);
    int biggest116716 = 0;
    if(ends[17]>=biggest116716){
      biggest116716=ends[17];
    }
    if(ends[18]>=biggest116716){
      biggest116716=ends[18];
    }
    if(biggest116716 == 1){
      active[16]=1;
      ends[16]=1;
      tdone[16]=1;
    }
  }

  public void thread116712(int [] tdone, int [] ends){
        S100692=1;
    cylPos5ZAxisExtend.setPresent();//sysj\controller.sysj line: 214, column: 7
    currsigs.addElement(cylPos5ZAxisExtend);
    active[15]=1;
    ends[15]=1;
    tdone[15]=1;
  }

  public void thread116711(int [] tdone, int [] ends){
        S100686=1;
    cylClampBottleExtend.setPresent();//sysj\controller.sysj line: 208, column: 7
    currsigs.addElement(cylClampBottleExtend);
    active[14]=1;
    ends[14]=1;
    tdone[14]=1;
  }

  public void thread116709(int [] tdone, int [] ends){
        S100721=1;
    S100718=0;
    active[19]=1;
    ends[19]=1;
    tdone[19]=1;
  }

  public void thread116707(int [] tdone, int [] ends){
        S100698=1;
    active[18]=1;
    ends[18]=1;
    tdone[18]=1;
  }

  public void thread116706(int [] tdone, int [] ends){
        S100695=1;
    active[17]=1;
    ends[17]=1;
    tdone[17]=1;
  }

  public void thread116705(int [] tdone, int [] ends){
        S100708=1;
    S100707=0;
    thread116706(tdone,ends);
    thread116707(tdone,ends);
    int biggest116708 = 0;
    if(ends[17]>=biggest116708){
      biggest116708=ends[17];
    }
    if(ends[18]>=biggest116708){
      biggest116708=ends[18];
    }
    if(biggest116708 == 1){
      active[16]=1;
      ends[16]=1;
      tdone[16]=1;
    }
  }

  public void thread116704(int [] tdone, int [] ends){
        S100692=1;
    cylPos5ZAxisExtend.setPresent();//sysj\controller.sysj line: 214, column: 7
    currsigs.addElement(cylPos5ZAxisExtend);
    active[15]=1;
    ends[15]=1;
    tdone[15]=1;
  }

  public void thread116703(int [] tdone, int [] ends){
        S100686=1;
    cylClampBottleExtend.setPresent();//sysj\controller.sysj line: 208, column: 7
    currsigs.addElement(cylClampBottleExtend);
    active[14]=1;
    ends[14]=1;
    tdone[14]=1;
  }

  public void thread116701(int [] tdone, int [] ends){
        S100721=1;
    S100718=0;
    active[19]=1;
    ends[19]=1;
    tdone[19]=1;
  }

  public void thread116699(int [] tdone, int [] ends){
        S100698=1;
    active[18]=1;
    ends[18]=1;
    tdone[18]=1;
  }

  public void thread116698(int [] tdone, int [] ends){
        S100695=1;
    active[17]=1;
    ends[17]=1;
    tdone[17]=1;
  }

  public void thread116697(int [] tdone, int [] ends){
        S100708=1;
    S100707=0;
    thread116698(tdone,ends);
    thread116699(tdone,ends);
    int biggest116700 = 0;
    if(ends[17]>=biggest116700){
      biggest116700=ends[17];
    }
    if(ends[18]>=biggest116700){
      biggest116700=ends[18];
    }
    if(biggest116700 == 1){
      active[16]=1;
      ends[16]=1;
      tdone[16]=1;
    }
  }

  public void thread116696(int [] tdone, int [] ends){
        S100692=1;
    cylPos5ZAxisExtend.setPresent();//sysj\controller.sysj line: 214, column: 7
    currsigs.addElement(cylPos5ZAxisExtend);
    active[15]=1;
    ends[15]=1;
    tdone[15]=1;
  }

  public void thread116695(int [] tdone, int [] ends){
        S100686=1;
    cylClampBottleExtend.setPresent();//sysj\controller.sysj line: 208, column: 7
    currsigs.addElement(cylClampBottleExtend);
    active[14]=1;
    ends[14]=1;
    tdone[14]=1;
  }

  public void thread116693(int [] tdone, int [] ends){
        S100721=1;
    S100718=0;
    active[19]=1;
    ends[19]=1;
    tdone[19]=1;
  }

  public void thread116691(int [] tdone, int [] ends){
        S100698=1;
    active[18]=1;
    ends[18]=1;
    tdone[18]=1;
  }

  public void thread116690(int [] tdone, int [] ends){
        S100695=1;
    active[17]=1;
    ends[17]=1;
    tdone[17]=1;
  }

  public void thread116689(int [] tdone, int [] ends){
        S100708=1;
    S100707=0;
    thread116690(tdone,ends);
    thread116691(tdone,ends);
    int biggest116692 = 0;
    if(ends[17]>=biggest116692){
      biggest116692=ends[17];
    }
    if(ends[18]>=biggest116692){
      biggest116692=ends[18];
    }
    if(biggest116692 == 1){
      active[16]=1;
      ends[16]=1;
      tdone[16]=1;
    }
  }

  public void thread116688(int [] tdone, int [] ends){
        S100692=1;
    cylPos5ZAxisExtend.setPresent();//sysj\controller.sysj line: 214, column: 7
    currsigs.addElement(cylPos5ZAxisExtend);
    active[15]=1;
    ends[15]=1;
    tdone[15]=1;
  }

  public void thread116687(int [] tdone, int [] ends){
        S100686=1;
    cylClampBottleExtend.setPresent();//sysj\controller.sysj line: 208, column: 7
    currsigs.addElement(cylClampBottleExtend);
    active[14]=1;
    ends[14]=1;
    tdone[14]=1;
  }

  public void thread116685(int [] tdone, int [] ends){
        S100721=1;
    S100718=0;
    active[19]=1;
    ends[19]=1;
    tdone[19]=1;
  }

  public void thread116683(int [] tdone, int [] ends){
        S100698=1;
    active[18]=1;
    ends[18]=1;
    tdone[18]=1;
  }

  public void thread116682(int [] tdone, int [] ends){
        S100695=1;
    active[17]=1;
    ends[17]=1;
    tdone[17]=1;
  }

  public void thread116681(int [] tdone, int [] ends){
        S100708=1;
    S100707=0;
    thread116682(tdone,ends);
    thread116683(tdone,ends);
    int biggest116684 = 0;
    if(ends[17]>=biggest116684){
      biggest116684=ends[17];
    }
    if(ends[18]>=biggest116684){
      biggest116684=ends[18];
    }
    if(biggest116684 == 1){
      active[16]=1;
      ends[16]=1;
      tdone[16]=1;
    }
  }

  public void thread116680(int [] tdone, int [] ends){
        S100692=1;
    cylPos5ZAxisExtend.setPresent();//sysj\controller.sysj line: 214, column: 7
    currsigs.addElement(cylPos5ZAxisExtend);
    active[15]=1;
    ends[15]=1;
    tdone[15]=1;
  }

  public void thread116679(int [] tdone, int [] ends){
        S100686=1;
    cylClampBottleExtend.setPresent();//sysj\controller.sysj line: 208, column: 7
    currsigs.addElement(cylClampBottleExtend);
    active[14]=1;
    ends[14]=1;
    tdone[14]=1;
  }

  public void thread116677(int [] tdone, int [] ends){
        S100721=1;
    S100718=0;
    active[19]=1;
    ends[19]=1;
    tdone[19]=1;
  }

  public void thread116675(int [] tdone, int [] ends){
        S100698=1;
    active[18]=1;
    ends[18]=1;
    tdone[18]=1;
  }

  public void thread116674(int [] tdone, int [] ends){
        S100695=1;
    active[17]=1;
    ends[17]=1;
    tdone[17]=1;
  }

  public void thread116673(int [] tdone, int [] ends){
        S100708=1;
    S100707=0;
    thread116674(tdone,ends);
    thread116675(tdone,ends);
    int biggest116676 = 0;
    if(ends[17]>=biggest116676){
      biggest116676=ends[17];
    }
    if(ends[18]>=biggest116676){
      biggest116676=ends[18];
    }
    if(biggest116676 == 1){
      active[16]=1;
      ends[16]=1;
      tdone[16]=1;
    }
  }

  public void thread116672(int [] tdone, int [] ends){
        S100692=1;
    cylPos5ZAxisExtend.setPresent();//sysj\controller.sysj line: 214, column: 7
    currsigs.addElement(cylPos5ZAxisExtend);
    active[15]=1;
    ends[15]=1;
    tdone[15]=1;
  }

  public void thread116671(int [] tdone, int [] ends){
        S100686=1;
    cylClampBottleExtend.setPresent();//sysj\controller.sysj line: 208, column: 7
    currsigs.addElement(cylClampBottleExtend);
    active[14]=1;
    ends[14]=1;
    tdone[14]=1;
  }

  public void thread116669(int [] tdone, int [] ends){
        S100721=1;
    S100718=0;
    active[19]=1;
    ends[19]=1;
    tdone[19]=1;
  }

  public void thread116667(int [] tdone, int [] ends){
        S100698=1;
    active[18]=1;
    ends[18]=1;
    tdone[18]=1;
  }

  public void thread116666(int [] tdone, int [] ends){
        S100695=1;
    active[17]=1;
    ends[17]=1;
    tdone[17]=1;
  }

  public void thread116665(int [] tdone, int [] ends){
        S100708=1;
    S100707=0;
    thread116666(tdone,ends);
    thread116667(tdone,ends);
    int biggest116668 = 0;
    if(ends[17]>=biggest116668){
      biggest116668=ends[17];
    }
    if(ends[18]>=biggest116668){
      biggest116668=ends[18];
    }
    if(biggest116668 == 1){
      active[16]=1;
      ends[16]=1;
      tdone[16]=1;
    }
  }

  public void thread116664(int [] tdone, int [] ends){
        S100692=1;
    cylPos5ZAxisExtend.setPresent();//sysj\controller.sysj line: 214, column: 7
    currsigs.addElement(cylPos5ZAxisExtend);
    active[15]=1;
    ends[15]=1;
    tdone[15]=1;
  }

  public void thread116663(int [] tdone, int [] ends){
        S100686=1;
    cylClampBottleExtend.setPresent();//sysj\controller.sysj line: 208, column: 7
    currsigs.addElement(cylClampBottleExtend);
    active[14]=1;
    ends[14]=1;
    tdone[14]=1;
  }

  public void thread116661(int [] tdone, int [] ends){
        S100721=1;
    S100718=0;
    active[19]=1;
    ends[19]=1;
    tdone[19]=1;
  }

  public void thread116659(int [] tdone, int [] ends){
        S100698=1;
    active[18]=1;
    ends[18]=1;
    tdone[18]=1;
  }

  public void thread116658(int [] tdone, int [] ends){
        S100695=1;
    active[17]=1;
    ends[17]=1;
    tdone[17]=1;
  }

  public void thread116657(int [] tdone, int [] ends){
        S100708=1;
    S100707=0;
    thread116658(tdone,ends);
    thread116659(tdone,ends);
    int biggest116660 = 0;
    if(ends[17]>=biggest116660){
      biggest116660=ends[17];
    }
    if(ends[18]>=biggest116660){
      biggest116660=ends[18];
    }
    if(biggest116660 == 1){
      active[16]=1;
      ends[16]=1;
      tdone[16]=1;
    }
  }

  public void thread116656(int [] tdone, int [] ends){
        S100692=1;
    cylPos5ZAxisExtend.setPresent();//sysj\controller.sysj line: 214, column: 7
    currsigs.addElement(cylPos5ZAxisExtend);
    active[15]=1;
    ends[15]=1;
    tdone[15]=1;
  }

  public void thread116655(int [] tdone, int [] ends){
        S100686=1;
    cylClampBottleExtend.setPresent();//sysj\controller.sysj line: 208, column: 7
    currsigs.addElement(cylClampBottleExtend);
    active[14]=1;
    ends[14]=1;
    tdone[14]=1;
  }

  public void thread116653(int [] tdone, int [] ends){
        S100721=1;
    S100718=0;
    active[19]=1;
    ends[19]=1;
    tdone[19]=1;
  }

  public void thread116651(int [] tdone, int [] ends){
        S100698=1;
    active[18]=1;
    ends[18]=1;
    tdone[18]=1;
  }

  public void thread116650(int [] tdone, int [] ends){
        S100695=1;
    active[17]=1;
    ends[17]=1;
    tdone[17]=1;
  }

  public void thread116649(int [] tdone, int [] ends){
        S100708=1;
    S100707=0;
    thread116650(tdone,ends);
    thread116651(tdone,ends);
    int biggest116652 = 0;
    if(ends[17]>=biggest116652){
      biggest116652=ends[17];
    }
    if(ends[18]>=biggest116652){
      biggest116652=ends[18];
    }
    if(biggest116652 == 1){
      active[16]=1;
      ends[16]=1;
      tdone[16]=1;
    }
  }

  public void thread116648(int [] tdone, int [] ends){
        S100692=1;
    cylPos5ZAxisExtend.setPresent();//sysj\controller.sysj line: 214, column: 7
    currsigs.addElement(cylPos5ZAxisExtend);
    active[15]=1;
    ends[15]=1;
    tdone[15]=1;
  }

  public void thread116647(int [] tdone, int [] ends){
        S100686=1;
    cylClampBottleExtend.setPresent();//sysj\controller.sysj line: 208, column: 7
    currsigs.addElement(cylClampBottleExtend);
    active[14]=1;
    ends[14]=1;
    tdone[14]=1;
  }

  public void thread116645(int [] tdone, int [] ends){
        S100721=1;
    S100718=0;
    active[19]=1;
    ends[19]=1;
    tdone[19]=1;
  }

  public void thread116643(int [] tdone, int [] ends){
        S100698=1;
    active[18]=1;
    ends[18]=1;
    tdone[18]=1;
  }

  public void thread116642(int [] tdone, int [] ends){
        S100695=1;
    active[17]=1;
    ends[17]=1;
    tdone[17]=1;
  }

  public void thread116641(int [] tdone, int [] ends){
        S100708=1;
    S100707=0;
    thread116642(tdone,ends);
    thread116643(tdone,ends);
    int biggest116644 = 0;
    if(ends[17]>=biggest116644){
      biggest116644=ends[17];
    }
    if(ends[18]>=biggest116644){
      biggest116644=ends[18];
    }
    if(biggest116644 == 1){
      active[16]=1;
      ends[16]=1;
      tdone[16]=1;
    }
  }

  public void thread116640(int [] tdone, int [] ends){
        S100692=1;
    cylPos5ZAxisExtend.setPresent();//sysj\controller.sysj line: 214, column: 7
    currsigs.addElement(cylPos5ZAxisExtend);
    active[15]=1;
    ends[15]=1;
    tdone[15]=1;
  }

  public void thread116639(int [] tdone, int [] ends){
        S100686=1;
    cylClampBottleExtend.setPresent();//sysj\controller.sysj line: 208, column: 7
    currsigs.addElement(cylClampBottleExtend);
    active[14]=1;
    ends[14]=1;
    tdone[14]=1;
  }

  public void thread116637(int [] tdone, int [] ends){
        S100721=1;
    S100718=0;
    active[19]=1;
    ends[19]=1;
    tdone[19]=1;
  }

  public void thread116635(int [] tdone, int [] ends){
        S100698=1;
    active[18]=1;
    ends[18]=1;
    tdone[18]=1;
  }

  public void thread116634(int [] tdone, int [] ends){
        S100695=1;
    active[17]=1;
    ends[17]=1;
    tdone[17]=1;
  }

  public void thread116633(int [] tdone, int [] ends){
        S100708=1;
    S100707=0;
    thread116634(tdone,ends);
    thread116635(tdone,ends);
    int biggest116636 = 0;
    if(ends[17]>=biggest116636){
      biggest116636=ends[17];
    }
    if(ends[18]>=biggest116636){
      biggest116636=ends[18];
    }
    if(biggest116636 == 1){
      active[16]=1;
      ends[16]=1;
      tdone[16]=1;
    }
  }

  public void thread116632(int [] tdone, int [] ends){
        S100692=1;
    cylPos5ZAxisExtend.setPresent();//sysj\controller.sysj line: 214, column: 7
    currsigs.addElement(cylPos5ZAxisExtend);
    active[15]=1;
    ends[15]=1;
    tdone[15]=1;
  }

  public void thread116631(int [] tdone, int [] ends){
        S100686=1;
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
      switch(S112199){
        case 0 : 
          S112199=0;
          break RUN;
        
        case 1 : 
          S112199=2;
          S112199=2;
          releaseCap_13.setClear();//sysj\controller.sysj line: 191, column: 2
          untwistGripper_13.setClear();//sysj\controller.sysj line: 191, column: 2
          raiseGripper_13.setClear();//sysj\controller.sysj line: 191, column: 2
          unclampBottle_13.setClear();//sysj\controller.sysj line: 191, column: 2
          S100565=0;
          S100549=0;
          if(!capperReq_in.isPartnerPresent() || capperReq_in.isPartnerPreempted()){//sysj\controller.sysj line: 194, column: 3
            capperReq_in.setACK(false);//sysj\controller.sysj line: 194, column: 3
            S100549=1;
            active[13]=1;
            ends[13]=1;
            break RUN;
          }
          else {
            S100544=0;
            if(!capperReq_in.isREQ()){//sysj\controller.sysj line: 194, column: 3
              capperReq_in.setACK(true);//sysj\controller.sysj line: 194, column: 3
              S100544=1;
              if(capperReq_in.isREQ()){//sysj\controller.sysj line: 194, column: 3
                capperReq_in.setACK(false);//sysj\controller.sysj line: 194, column: 3
                ends[13]=2;
                ;//sysj\controller.sysj line: 194, column: 3
                request_thread_13 = (boolean)(capperReq_in.getVal() == null ? false : ((Boolean)capperReq_in.getVal()).booleanValue());//sysj\controller.sysj line: 195, column: 3
                S100565=1;
                if(request_thread_13){//sysj\controller.sysj line: 197, column: 3
                  S100680=0;
                  S100572=0;
                  if(!capperStatus_o.isPartnerPresent() || capperStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 198, column: 4
                    capperStatus_o.setREQ(false);//sysj\controller.sysj line: 198, column: 4
                    S100572=1;
                    active[13]=1;
                    ends[13]=1;
                    break RUN;
                  }
                  else {
                    S100567=0;
                    if(capperStatus_o.isACK()){//sysj\controller.sysj line: 198, column: 4
                      capperStatus_o.setVal("busy");//sysj\controller.sysj line: 198, column: 4
                      S100567=1;
                      if(!capperStatus_o.isACK()){//sysj\controller.sysj line: 198, column: 4
                        capperStatus_o.setREQ(false);//sysj\controller.sysj line: 198, column: 4
                        ends[13]=2;
                        ;//sysj\controller.sysj line: 198, column: 4
                        S100680=1;
                        if(!bottleAtPos4.getprestatus()){//sysj\controller.sysj line: 200, column: 13
                          S100594=0;
                          if(!capperStatus_o.isPartnerPresent() || capperStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 201, column: 5
                            capperStatus_o.setREQ(false);//sysj\controller.sysj line: 201, column: 5
                            S100594=1;
                            active[13]=1;
                            ends[13]=1;
                            break RUN;
                          }
                          else {
                            S100589=0;
                            if(capperStatus_o.isACK()){//sysj\controller.sysj line: 201, column: 5
                              capperStatus_o.setVal("idle");//sysj\controller.sysj line: 201, column: 5
                              S100589=1;
                              if(!capperStatus_o.isACK()){//sysj\controller.sysj line: 201, column: 5
                                capperStatus_o.setREQ(false);//sysj\controller.sysj line: 201, column: 5
                                ends[13]=2;
                                ;//sysj\controller.sysj line: 201, column: 5
                                S100680=2;
                                if(bottleAtPos4.getprestatus()){//sysj\controller.sysj line: 204, column: 12
                                  System.out.println("Capper doing work...");//sysj\controller.sysj line: 205, column: 5
                                  thread116631(tdone,ends);
                                  thread116632(tdone,ends);
                                  thread116633(tdone,ends);
                                  thread116637(tdone,ends);
                                  int biggest116638 = 0;
                                  if(ends[14]>=biggest116638){
                                    biggest116638=ends[14];
                                  }
                                  if(ends[15]>=biggest116638){
                                    biggest116638=ends[15];
                                  }
                                  if(ends[16]>=biggest116638){
                                    biggest116638=ends[16];
                                  }
                                  if(ends[19]>=biggest116638){
                                    biggest116638=ends[19];
                                  }
                                  if(biggest116638 == 1){
                                    active[13]=1;
                                    ends[13]=1;
                                    break RUN;
                                  }
                                }
                                else {
                                  S100565=2;
                                  S104060=0;
                                  if(!capperStatus_o.isPartnerPresent() || capperStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 243, column: 3
                                    capperStatus_o.setREQ(false);//sysj\controller.sysj line: 243, column: 3
                                    S104060=1;
                                    active[13]=1;
                                    ends[13]=1;
                                    break RUN;
                                  }
                                  else {
                                    S104055=0;
                                    if(capperStatus_o.isACK()){//sysj\controller.sysj line: 243, column: 3
                                      capperStatus_o.setVal("done");//sysj\controller.sysj line: 243, column: 3
                                      S104055=1;
                                      if(!capperStatus_o.isACK()){//sysj\controller.sysj line: 243, column: 3
                                        capperStatus_o.setREQ(false);//sysj\controller.sysj line: 243, column: 3
                                        ends[13]=2;
                                        ;//sysj\controller.sysj line: 243, column: 3
                                        S100565=3;
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
                          S100680=2;
                          if(bottleAtPos4.getprestatus()){//sysj\controller.sysj line: 204, column: 12
                            System.out.println("Capper doing work...");//sysj\controller.sysj line: 205, column: 5
                            thread116639(tdone,ends);
                            thread116640(tdone,ends);
                            thread116641(tdone,ends);
                            thread116645(tdone,ends);
                            int biggest116646 = 0;
                            if(ends[14]>=biggest116646){
                              biggest116646=ends[14];
                            }
                            if(ends[15]>=biggest116646){
                              biggest116646=ends[15];
                            }
                            if(ends[16]>=biggest116646){
                              biggest116646=ends[16];
                            }
                            if(ends[19]>=biggest116646){
                              biggest116646=ends[19];
                            }
                            if(biggest116646 == 1){
                              active[13]=1;
                              ends[13]=1;
                              break RUN;
                            }
                          }
                          else {
                            S100565=2;
                            S104060=0;
                            if(!capperStatus_o.isPartnerPresent() || capperStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 243, column: 3
                              capperStatus_o.setREQ(false);//sysj\controller.sysj line: 243, column: 3
                              S104060=1;
                              active[13]=1;
                              ends[13]=1;
                              break RUN;
                            }
                            else {
                              S104055=0;
                              if(capperStatus_o.isACK()){//sysj\controller.sysj line: 243, column: 3
                                capperStatus_o.setVal("done");//sysj\controller.sysj line: 243, column: 3
                                S104055=1;
                                if(!capperStatus_o.isACK()){//sysj\controller.sysj line: 243, column: 3
                                  capperStatus_o.setREQ(false);//sysj\controller.sysj line: 243, column: 3
                                  ends[13]=2;
                                  ;//sysj\controller.sysj line: 243, column: 3
                                  S100565=3;
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
                  S100565=2;
                  S104060=0;
                  if(!capperStatus_o.isPartnerPresent() || capperStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 243, column: 3
                    capperStatus_o.setREQ(false);//sysj\controller.sysj line: 243, column: 3
                    S104060=1;
                    active[13]=1;
                    ends[13]=1;
                    break RUN;
                  }
                  else {
                    S104055=0;
                    if(capperStatus_o.isACK()){//sysj\controller.sysj line: 243, column: 3
                      capperStatus_o.setVal("done");//sysj\controller.sysj line: 243, column: 3
                      S104055=1;
                      if(!capperStatus_o.isACK()){//sysj\controller.sysj line: 243, column: 3
                        capperStatus_o.setREQ(false);//sysj\controller.sysj line: 243, column: 3
                        ends[13]=2;
                        ;//sysj\controller.sysj line: 243, column: 3
                        S100565=3;
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
          switch(S100565){
            case 0 : 
              switch(S100549){
                case 0 : 
                  if(!capperReq_in.isPartnerPresent() || capperReq_in.isPartnerPreempted()){//sysj\controller.sysj line: 194, column: 3
                    capperReq_in.setACK(false);//sysj\controller.sysj line: 194, column: 3
                    S100549=1;
                    active[13]=1;
                    ends[13]=1;
                    break RUN;
                  }
                  else {
                    switch(S100544){
                      case 0 : 
                        if(!capperReq_in.isREQ()){//sysj\controller.sysj line: 194, column: 3
                          capperReq_in.setACK(true);//sysj\controller.sysj line: 194, column: 3
                          S100544=1;
                          if(capperReq_in.isREQ()){//sysj\controller.sysj line: 194, column: 3
                            capperReq_in.setACK(false);//sysj\controller.sysj line: 194, column: 3
                            ends[13]=2;
                            ;//sysj\controller.sysj line: 194, column: 3
                            request_thread_13 = (boolean)(capperReq_in.getVal() == null ? false : ((Boolean)capperReq_in.getVal()).booleanValue());//sysj\controller.sysj line: 195, column: 3
                            S100565=1;
                            if(request_thread_13){//sysj\controller.sysj line: 197, column: 3
                              S100680=0;
                              S100572=0;
                              if(!capperStatus_o.isPartnerPresent() || capperStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 198, column: 4
                                capperStatus_o.setREQ(false);//sysj\controller.sysj line: 198, column: 4
                                S100572=1;
                                active[13]=1;
                                ends[13]=1;
                                break RUN;
                              }
                              else {
                                S100567=0;
                                if(capperStatus_o.isACK()){//sysj\controller.sysj line: 198, column: 4
                                  capperStatus_o.setVal("busy");//sysj\controller.sysj line: 198, column: 4
                                  S100567=1;
                                  if(!capperStatus_o.isACK()){//sysj\controller.sysj line: 198, column: 4
                                    capperStatus_o.setREQ(false);//sysj\controller.sysj line: 198, column: 4
                                    ends[13]=2;
                                    ;//sysj\controller.sysj line: 198, column: 4
                                    S100680=1;
                                    if(!bottleAtPos4.getprestatus()){//sysj\controller.sysj line: 200, column: 13
                                      S100594=0;
                                      if(!capperStatus_o.isPartnerPresent() || capperStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 201, column: 5
                                        capperStatus_o.setREQ(false);//sysj\controller.sysj line: 201, column: 5
                                        S100594=1;
                                        active[13]=1;
                                        ends[13]=1;
                                        break RUN;
                                      }
                                      else {
                                        S100589=0;
                                        if(capperStatus_o.isACK()){//sysj\controller.sysj line: 201, column: 5
                                          capperStatus_o.setVal("idle");//sysj\controller.sysj line: 201, column: 5
                                          S100589=1;
                                          if(!capperStatus_o.isACK()){//sysj\controller.sysj line: 201, column: 5
                                            capperStatus_o.setREQ(false);//sysj\controller.sysj line: 201, column: 5
                                            ends[13]=2;
                                            ;//sysj\controller.sysj line: 201, column: 5
                                            S100680=2;
                                            if(bottleAtPos4.getprestatus()){//sysj\controller.sysj line: 204, column: 12
                                              System.out.println("Capper doing work...");//sysj\controller.sysj line: 205, column: 5
                                              thread116647(tdone,ends);
                                              thread116648(tdone,ends);
                                              thread116649(tdone,ends);
                                              thread116653(tdone,ends);
                                              int biggest116654 = 0;
                                              if(ends[14]>=biggest116654){
                                                biggest116654=ends[14];
                                              }
                                              if(ends[15]>=biggest116654){
                                                biggest116654=ends[15];
                                              }
                                              if(ends[16]>=biggest116654){
                                                biggest116654=ends[16];
                                              }
                                              if(ends[19]>=biggest116654){
                                                biggest116654=ends[19];
                                              }
                                              if(biggest116654 == 1){
                                                active[13]=1;
                                                ends[13]=1;
                                                break RUN;
                                              }
                                            }
                                            else {
                                              S100565=2;
                                              S104060=0;
                                              if(!capperStatus_o.isPartnerPresent() || capperStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 243, column: 3
                                                capperStatus_o.setREQ(false);//sysj\controller.sysj line: 243, column: 3
                                                S104060=1;
                                                active[13]=1;
                                                ends[13]=1;
                                                break RUN;
                                              }
                                              else {
                                                S104055=0;
                                                if(capperStatus_o.isACK()){//sysj\controller.sysj line: 243, column: 3
                                                  capperStatus_o.setVal("done");//sysj\controller.sysj line: 243, column: 3
                                                  S104055=1;
                                                  if(!capperStatus_o.isACK()){//sysj\controller.sysj line: 243, column: 3
                                                    capperStatus_o.setREQ(false);//sysj\controller.sysj line: 243, column: 3
                                                    ends[13]=2;
                                                    ;//sysj\controller.sysj line: 243, column: 3
                                                    S100565=3;
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
                                      S100680=2;
                                      if(bottleAtPos4.getprestatus()){//sysj\controller.sysj line: 204, column: 12
                                        System.out.println("Capper doing work...");//sysj\controller.sysj line: 205, column: 5
                                        thread116655(tdone,ends);
                                        thread116656(tdone,ends);
                                        thread116657(tdone,ends);
                                        thread116661(tdone,ends);
                                        int biggest116662 = 0;
                                        if(ends[14]>=biggest116662){
                                          biggest116662=ends[14];
                                        }
                                        if(ends[15]>=biggest116662){
                                          biggest116662=ends[15];
                                        }
                                        if(ends[16]>=biggest116662){
                                          biggest116662=ends[16];
                                        }
                                        if(ends[19]>=biggest116662){
                                          biggest116662=ends[19];
                                        }
                                        if(biggest116662 == 1){
                                          active[13]=1;
                                          ends[13]=1;
                                          break RUN;
                                        }
                                      }
                                      else {
                                        S100565=2;
                                        S104060=0;
                                        if(!capperStatus_o.isPartnerPresent() || capperStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 243, column: 3
                                          capperStatus_o.setREQ(false);//sysj\controller.sysj line: 243, column: 3
                                          S104060=1;
                                          active[13]=1;
                                          ends[13]=1;
                                          break RUN;
                                        }
                                        else {
                                          S104055=0;
                                          if(capperStatus_o.isACK()){//sysj\controller.sysj line: 243, column: 3
                                            capperStatus_o.setVal("done");//sysj\controller.sysj line: 243, column: 3
                                            S104055=1;
                                            if(!capperStatus_o.isACK()){//sysj\controller.sysj line: 243, column: 3
                                              capperStatus_o.setREQ(false);//sysj\controller.sysj line: 243, column: 3
                                              ends[13]=2;
                                              ;//sysj\controller.sysj line: 243, column: 3
                                              S100565=3;
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
                              S100565=2;
                              S104060=0;
                              if(!capperStatus_o.isPartnerPresent() || capperStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 243, column: 3
                                capperStatus_o.setREQ(false);//sysj\controller.sysj line: 243, column: 3
                                S104060=1;
                                active[13]=1;
                                ends[13]=1;
                                break RUN;
                              }
                              else {
                                S104055=0;
                                if(capperStatus_o.isACK()){//sysj\controller.sysj line: 243, column: 3
                                  capperStatus_o.setVal("done");//sysj\controller.sysj line: 243, column: 3
                                  S104055=1;
                                  if(!capperStatus_o.isACK()){//sysj\controller.sysj line: 243, column: 3
                                    capperStatus_o.setREQ(false);//sysj\controller.sysj line: 243, column: 3
                                    ends[13]=2;
                                    ;//sysj\controller.sysj line: 243, column: 3
                                    S100565=3;
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
                          S100565=1;
                          if(request_thread_13){//sysj\controller.sysj line: 197, column: 3
                            S100680=0;
                            S100572=0;
                            if(!capperStatus_o.isPartnerPresent() || capperStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 198, column: 4
                              capperStatus_o.setREQ(false);//sysj\controller.sysj line: 198, column: 4
                              S100572=1;
                              active[13]=1;
                              ends[13]=1;
                              break RUN;
                            }
                            else {
                              S100567=0;
                              if(capperStatus_o.isACK()){//sysj\controller.sysj line: 198, column: 4
                                capperStatus_o.setVal("busy");//sysj\controller.sysj line: 198, column: 4
                                S100567=1;
                                if(!capperStatus_o.isACK()){//sysj\controller.sysj line: 198, column: 4
                                  capperStatus_o.setREQ(false);//sysj\controller.sysj line: 198, column: 4
                                  ends[13]=2;
                                  ;//sysj\controller.sysj line: 198, column: 4
                                  S100680=1;
                                  if(!bottleAtPos4.getprestatus()){//sysj\controller.sysj line: 200, column: 13
                                    S100594=0;
                                    if(!capperStatus_o.isPartnerPresent() || capperStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 201, column: 5
                                      capperStatus_o.setREQ(false);//sysj\controller.sysj line: 201, column: 5
                                      S100594=1;
                                      active[13]=1;
                                      ends[13]=1;
                                      break RUN;
                                    }
                                    else {
                                      S100589=0;
                                      if(capperStatus_o.isACK()){//sysj\controller.sysj line: 201, column: 5
                                        capperStatus_o.setVal("idle");//sysj\controller.sysj line: 201, column: 5
                                        S100589=1;
                                        if(!capperStatus_o.isACK()){//sysj\controller.sysj line: 201, column: 5
                                          capperStatus_o.setREQ(false);//sysj\controller.sysj line: 201, column: 5
                                          ends[13]=2;
                                          ;//sysj\controller.sysj line: 201, column: 5
                                          S100680=2;
                                          if(bottleAtPos4.getprestatus()){//sysj\controller.sysj line: 204, column: 12
                                            System.out.println("Capper doing work...");//sysj\controller.sysj line: 205, column: 5
                                            thread116663(tdone,ends);
                                            thread116664(tdone,ends);
                                            thread116665(tdone,ends);
                                            thread116669(tdone,ends);
                                            int biggest116670 = 0;
                                            if(ends[14]>=biggest116670){
                                              biggest116670=ends[14];
                                            }
                                            if(ends[15]>=biggest116670){
                                              biggest116670=ends[15];
                                            }
                                            if(ends[16]>=biggest116670){
                                              biggest116670=ends[16];
                                            }
                                            if(ends[19]>=biggest116670){
                                              biggest116670=ends[19];
                                            }
                                            if(biggest116670 == 1){
                                              active[13]=1;
                                              ends[13]=1;
                                              break RUN;
                                            }
                                          }
                                          else {
                                            S100565=2;
                                            S104060=0;
                                            if(!capperStatus_o.isPartnerPresent() || capperStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 243, column: 3
                                              capperStatus_o.setREQ(false);//sysj\controller.sysj line: 243, column: 3
                                              S104060=1;
                                              active[13]=1;
                                              ends[13]=1;
                                              break RUN;
                                            }
                                            else {
                                              S104055=0;
                                              if(capperStatus_o.isACK()){//sysj\controller.sysj line: 243, column: 3
                                                capperStatus_o.setVal("done");//sysj\controller.sysj line: 243, column: 3
                                                S104055=1;
                                                if(!capperStatus_o.isACK()){//sysj\controller.sysj line: 243, column: 3
                                                  capperStatus_o.setREQ(false);//sysj\controller.sysj line: 243, column: 3
                                                  ends[13]=2;
                                                  ;//sysj\controller.sysj line: 243, column: 3
                                                  S100565=3;
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
                                    S100680=2;
                                    if(bottleAtPos4.getprestatus()){//sysj\controller.sysj line: 204, column: 12
                                      System.out.println("Capper doing work...");//sysj\controller.sysj line: 205, column: 5
                                      thread116671(tdone,ends);
                                      thread116672(tdone,ends);
                                      thread116673(tdone,ends);
                                      thread116677(tdone,ends);
                                      int biggest116678 = 0;
                                      if(ends[14]>=biggest116678){
                                        biggest116678=ends[14];
                                      }
                                      if(ends[15]>=biggest116678){
                                        biggest116678=ends[15];
                                      }
                                      if(ends[16]>=biggest116678){
                                        biggest116678=ends[16];
                                      }
                                      if(ends[19]>=biggest116678){
                                        biggest116678=ends[19];
                                      }
                                      if(biggest116678 == 1){
                                        active[13]=1;
                                        ends[13]=1;
                                        break RUN;
                                      }
                                    }
                                    else {
                                      S100565=2;
                                      S104060=0;
                                      if(!capperStatus_o.isPartnerPresent() || capperStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 243, column: 3
                                        capperStatus_o.setREQ(false);//sysj\controller.sysj line: 243, column: 3
                                        S104060=1;
                                        active[13]=1;
                                        ends[13]=1;
                                        break RUN;
                                      }
                                      else {
                                        S104055=0;
                                        if(capperStatus_o.isACK()){//sysj\controller.sysj line: 243, column: 3
                                          capperStatus_o.setVal("done");//sysj\controller.sysj line: 243, column: 3
                                          S104055=1;
                                          if(!capperStatus_o.isACK()){//sysj\controller.sysj line: 243, column: 3
                                            capperStatus_o.setREQ(false);//sysj\controller.sysj line: 243, column: 3
                                            ends[13]=2;
                                            ;//sysj\controller.sysj line: 243, column: 3
                                            S100565=3;
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
                            S100565=2;
                            S104060=0;
                            if(!capperStatus_o.isPartnerPresent() || capperStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 243, column: 3
                              capperStatus_o.setREQ(false);//sysj\controller.sysj line: 243, column: 3
                              S104060=1;
                              active[13]=1;
                              ends[13]=1;
                              break RUN;
                            }
                            else {
                              S104055=0;
                              if(capperStatus_o.isACK()){//sysj\controller.sysj line: 243, column: 3
                                capperStatus_o.setVal("done");//sysj\controller.sysj line: 243, column: 3
                                S104055=1;
                                if(!capperStatus_o.isACK()){//sysj\controller.sysj line: 243, column: 3
                                  capperStatus_o.setREQ(false);//sysj\controller.sysj line: 243, column: 3
                                  ends[13]=2;
                                  ;//sysj\controller.sysj line: 243, column: 3
                                  S100565=3;
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
                  S100549=1;
                  S100549=0;
                  if(!capperReq_in.isPartnerPresent() || capperReq_in.isPartnerPreempted()){//sysj\controller.sysj line: 194, column: 3
                    capperReq_in.setACK(false);//sysj\controller.sysj line: 194, column: 3
                    S100549=1;
                    active[13]=1;
                    ends[13]=1;
                    break RUN;
                  }
                  else {
                    S100544=0;
                    if(!capperReq_in.isREQ()){//sysj\controller.sysj line: 194, column: 3
                      capperReq_in.setACK(true);//sysj\controller.sysj line: 194, column: 3
                      S100544=1;
                      if(capperReq_in.isREQ()){//sysj\controller.sysj line: 194, column: 3
                        capperReq_in.setACK(false);//sysj\controller.sysj line: 194, column: 3
                        ends[13]=2;
                        ;//sysj\controller.sysj line: 194, column: 3
                        request_thread_13 = (boolean)(capperReq_in.getVal() == null ? false : ((Boolean)capperReq_in.getVal()).booleanValue());//sysj\controller.sysj line: 195, column: 3
                        S100565=1;
                        if(request_thread_13){//sysj\controller.sysj line: 197, column: 3
                          S100680=0;
                          S100572=0;
                          if(!capperStatus_o.isPartnerPresent() || capperStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 198, column: 4
                            capperStatus_o.setREQ(false);//sysj\controller.sysj line: 198, column: 4
                            S100572=1;
                            active[13]=1;
                            ends[13]=1;
                            break RUN;
                          }
                          else {
                            S100567=0;
                            if(capperStatus_o.isACK()){//sysj\controller.sysj line: 198, column: 4
                              capperStatus_o.setVal("busy");//sysj\controller.sysj line: 198, column: 4
                              S100567=1;
                              if(!capperStatus_o.isACK()){//sysj\controller.sysj line: 198, column: 4
                                capperStatus_o.setREQ(false);//sysj\controller.sysj line: 198, column: 4
                                ends[13]=2;
                                ;//sysj\controller.sysj line: 198, column: 4
                                S100680=1;
                                if(!bottleAtPos4.getprestatus()){//sysj\controller.sysj line: 200, column: 13
                                  S100594=0;
                                  if(!capperStatus_o.isPartnerPresent() || capperStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 201, column: 5
                                    capperStatus_o.setREQ(false);//sysj\controller.sysj line: 201, column: 5
                                    S100594=1;
                                    active[13]=1;
                                    ends[13]=1;
                                    break RUN;
                                  }
                                  else {
                                    S100589=0;
                                    if(capperStatus_o.isACK()){//sysj\controller.sysj line: 201, column: 5
                                      capperStatus_o.setVal("idle");//sysj\controller.sysj line: 201, column: 5
                                      S100589=1;
                                      if(!capperStatus_o.isACK()){//sysj\controller.sysj line: 201, column: 5
                                        capperStatus_o.setREQ(false);//sysj\controller.sysj line: 201, column: 5
                                        ends[13]=2;
                                        ;//sysj\controller.sysj line: 201, column: 5
                                        S100680=2;
                                        if(bottleAtPos4.getprestatus()){//sysj\controller.sysj line: 204, column: 12
                                          System.out.println("Capper doing work...");//sysj\controller.sysj line: 205, column: 5
                                          thread116679(tdone,ends);
                                          thread116680(tdone,ends);
                                          thread116681(tdone,ends);
                                          thread116685(tdone,ends);
                                          int biggest116686 = 0;
                                          if(ends[14]>=biggest116686){
                                            biggest116686=ends[14];
                                          }
                                          if(ends[15]>=biggest116686){
                                            biggest116686=ends[15];
                                          }
                                          if(ends[16]>=biggest116686){
                                            biggest116686=ends[16];
                                          }
                                          if(ends[19]>=biggest116686){
                                            biggest116686=ends[19];
                                          }
                                          if(biggest116686 == 1){
                                            active[13]=1;
                                            ends[13]=1;
                                            break RUN;
                                          }
                                        }
                                        else {
                                          S100565=2;
                                          S104060=0;
                                          if(!capperStatus_o.isPartnerPresent() || capperStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 243, column: 3
                                            capperStatus_o.setREQ(false);//sysj\controller.sysj line: 243, column: 3
                                            S104060=1;
                                            active[13]=1;
                                            ends[13]=1;
                                            break RUN;
                                          }
                                          else {
                                            S104055=0;
                                            if(capperStatus_o.isACK()){//sysj\controller.sysj line: 243, column: 3
                                              capperStatus_o.setVal("done");//sysj\controller.sysj line: 243, column: 3
                                              S104055=1;
                                              if(!capperStatus_o.isACK()){//sysj\controller.sysj line: 243, column: 3
                                                capperStatus_o.setREQ(false);//sysj\controller.sysj line: 243, column: 3
                                                ends[13]=2;
                                                ;//sysj\controller.sysj line: 243, column: 3
                                                S100565=3;
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
                                  S100680=2;
                                  if(bottleAtPos4.getprestatus()){//sysj\controller.sysj line: 204, column: 12
                                    System.out.println("Capper doing work...");//sysj\controller.sysj line: 205, column: 5
                                    thread116687(tdone,ends);
                                    thread116688(tdone,ends);
                                    thread116689(tdone,ends);
                                    thread116693(tdone,ends);
                                    int biggest116694 = 0;
                                    if(ends[14]>=biggest116694){
                                      biggest116694=ends[14];
                                    }
                                    if(ends[15]>=biggest116694){
                                      biggest116694=ends[15];
                                    }
                                    if(ends[16]>=biggest116694){
                                      biggest116694=ends[16];
                                    }
                                    if(ends[19]>=biggest116694){
                                      biggest116694=ends[19];
                                    }
                                    if(biggest116694 == 1){
                                      active[13]=1;
                                      ends[13]=1;
                                      break RUN;
                                    }
                                  }
                                  else {
                                    S100565=2;
                                    S104060=0;
                                    if(!capperStatus_o.isPartnerPresent() || capperStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 243, column: 3
                                      capperStatus_o.setREQ(false);//sysj\controller.sysj line: 243, column: 3
                                      S104060=1;
                                      active[13]=1;
                                      ends[13]=1;
                                      break RUN;
                                    }
                                    else {
                                      S104055=0;
                                      if(capperStatus_o.isACK()){//sysj\controller.sysj line: 243, column: 3
                                        capperStatus_o.setVal("done");//sysj\controller.sysj line: 243, column: 3
                                        S104055=1;
                                        if(!capperStatus_o.isACK()){//sysj\controller.sysj line: 243, column: 3
                                          capperStatus_o.setREQ(false);//sysj\controller.sysj line: 243, column: 3
                                          ends[13]=2;
                                          ;//sysj\controller.sysj line: 243, column: 3
                                          S100565=3;
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
                          S100565=2;
                          S104060=0;
                          if(!capperStatus_o.isPartnerPresent() || capperStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 243, column: 3
                            capperStatus_o.setREQ(false);//sysj\controller.sysj line: 243, column: 3
                            S104060=1;
                            active[13]=1;
                            ends[13]=1;
                            break RUN;
                          }
                          else {
                            S104055=0;
                            if(capperStatus_o.isACK()){//sysj\controller.sysj line: 243, column: 3
                              capperStatus_o.setVal("done");//sysj\controller.sysj line: 243, column: 3
                              S104055=1;
                              if(!capperStatus_o.isACK()){//sysj\controller.sysj line: 243, column: 3
                                capperStatus_o.setREQ(false);//sysj\controller.sysj line: 243, column: 3
                                ends[13]=2;
                                ;//sysj\controller.sysj line: 243, column: 3
                                S100565=3;
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
              switch(S100680){
                case 0 : 
                  switch(S100572){
                    case 0 : 
                      if(!capperStatus_o.isPartnerPresent() || capperStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 198, column: 4
                        capperStatus_o.setREQ(false);//sysj\controller.sysj line: 198, column: 4
                        S100572=1;
                        active[13]=1;
                        ends[13]=1;
                        break RUN;
                      }
                      else {
                        switch(S100567){
                          case 0 : 
                            if(capperStatus_o.isACK()){//sysj\controller.sysj line: 198, column: 4
                              capperStatus_o.setVal("busy");//sysj\controller.sysj line: 198, column: 4
                              S100567=1;
                              if(!capperStatus_o.isACK()){//sysj\controller.sysj line: 198, column: 4
                                capperStatus_o.setREQ(false);//sysj\controller.sysj line: 198, column: 4
                                ends[13]=2;
                                ;//sysj\controller.sysj line: 198, column: 4
                                S100680=1;
                                if(!bottleAtPos4.getprestatus()){//sysj\controller.sysj line: 200, column: 13
                                  S100594=0;
                                  if(!capperStatus_o.isPartnerPresent() || capperStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 201, column: 5
                                    capperStatus_o.setREQ(false);//sysj\controller.sysj line: 201, column: 5
                                    S100594=1;
                                    active[13]=1;
                                    ends[13]=1;
                                    break RUN;
                                  }
                                  else {
                                    S100589=0;
                                    if(capperStatus_o.isACK()){//sysj\controller.sysj line: 201, column: 5
                                      capperStatus_o.setVal("idle");//sysj\controller.sysj line: 201, column: 5
                                      S100589=1;
                                      if(!capperStatus_o.isACK()){//sysj\controller.sysj line: 201, column: 5
                                        capperStatus_o.setREQ(false);//sysj\controller.sysj line: 201, column: 5
                                        ends[13]=2;
                                        ;//sysj\controller.sysj line: 201, column: 5
                                        S100680=2;
                                        if(bottleAtPos4.getprestatus()){//sysj\controller.sysj line: 204, column: 12
                                          System.out.println("Capper doing work...");//sysj\controller.sysj line: 205, column: 5
                                          thread116695(tdone,ends);
                                          thread116696(tdone,ends);
                                          thread116697(tdone,ends);
                                          thread116701(tdone,ends);
                                          int biggest116702 = 0;
                                          if(ends[14]>=biggest116702){
                                            biggest116702=ends[14];
                                          }
                                          if(ends[15]>=biggest116702){
                                            biggest116702=ends[15];
                                          }
                                          if(ends[16]>=biggest116702){
                                            biggest116702=ends[16];
                                          }
                                          if(ends[19]>=biggest116702){
                                            biggest116702=ends[19];
                                          }
                                          if(biggest116702 == 1){
                                            active[13]=1;
                                            ends[13]=1;
                                            break RUN;
                                          }
                                        }
                                        else {
                                          S100565=2;
                                          S104060=0;
                                          if(!capperStatus_o.isPartnerPresent() || capperStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 243, column: 3
                                            capperStatus_o.setREQ(false);//sysj\controller.sysj line: 243, column: 3
                                            S104060=1;
                                            active[13]=1;
                                            ends[13]=1;
                                            break RUN;
                                          }
                                          else {
                                            S104055=0;
                                            if(capperStatus_o.isACK()){//sysj\controller.sysj line: 243, column: 3
                                              capperStatus_o.setVal("done");//sysj\controller.sysj line: 243, column: 3
                                              S104055=1;
                                              if(!capperStatus_o.isACK()){//sysj\controller.sysj line: 243, column: 3
                                                capperStatus_o.setREQ(false);//sysj\controller.sysj line: 243, column: 3
                                                ends[13]=2;
                                                ;//sysj\controller.sysj line: 243, column: 3
                                                S100565=3;
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
                                  S100680=2;
                                  if(bottleAtPos4.getprestatus()){//sysj\controller.sysj line: 204, column: 12
                                    System.out.println("Capper doing work...");//sysj\controller.sysj line: 205, column: 5
                                    thread116703(tdone,ends);
                                    thread116704(tdone,ends);
                                    thread116705(tdone,ends);
                                    thread116709(tdone,ends);
                                    int biggest116710 = 0;
                                    if(ends[14]>=biggest116710){
                                      biggest116710=ends[14];
                                    }
                                    if(ends[15]>=biggest116710){
                                      biggest116710=ends[15];
                                    }
                                    if(ends[16]>=biggest116710){
                                      biggest116710=ends[16];
                                    }
                                    if(ends[19]>=biggest116710){
                                      biggest116710=ends[19];
                                    }
                                    if(biggest116710 == 1){
                                      active[13]=1;
                                      ends[13]=1;
                                      break RUN;
                                    }
                                  }
                                  else {
                                    S100565=2;
                                    S104060=0;
                                    if(!capperStatus_o.isPartnerPresent() || capperStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 243, column: 3
                                      capperStatus_o.setREQ(false);//sysj\controller.sysj line: 243, column: 3
                                      S104060=1;
                                      active[13]=1;
                                      ends[13]=1;
                                      break RUN;
                                    }
                                    else {
                                      S104055=0;
                                      if(capperStatus_o.isACK()){//sysj\controller.sysj line: 243, column: 3
                                        capperStatus_o.setVal("done");//sysj\controller.sysj line: 243, column: 3
                                        S104055=1;
                                        if(!capperStatus_o.isACK()){//sysj\controller.sysj line: 243, column: 3
                                          capperStatus_o.setREQ(false);//sysj\controller.sysj line: 243, column: 3
                                          ends[13]=2;
                                          ;//sysj\controller.sysj line: 243, column: 3
                                          S100565=3;
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
                              S100680=1;
                              if(!bottleAtPos4.getprestatus()){//sysj\controller.sysj line: 200, column: 13
                                S100594=0;
                                if(!capperStatus_o.isPartnerPresent() || capperStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 201, column: 5
                                  capperStatus_o.setREQ(false);//sysj\controller.sysj line: 201, column: 5
                                  S100594=1;
                                  active[13]=1;
                                  ends[13]=1;
                                  break RUN;
                                }
                                else {
                                  S100589=0;
                                  if(capperStatus_o.isACK()){//sysj\controller.sysj line: 201, column: 5
                                    capperStatus_o.setVal("idle");//sysj\controller.sysj line: 201, column: 5
                                    S100589=1;
                                    if(!capperStatus_o.isACK()){//sysj\controller.sysj line: 201, column: 5
                                      capperStatus_o.setREQ(false);//sysj\controller.sysj line: 201, column: 5
                                      ends[13]=2;
                                      ;//sysj\controller.sysj line: 201, column: 5
                                      S100680=2;
                                      if(bottleAtPos4.getprestatus()){//sysj\controller.sysj line: 204, column: 12
                                        System.out.println("Capper doing work...");//sysj\controller.sysj line: 205, column: 5
                                        thread116711(tdone,ends);
                                        thread116712(tdone,ends);
                                        thread116713(tdone,ends);
                                        thread116717(tdone,ends);
                                        int biggest116718 = 0;
                                        if(ends[14]>=biggest116718){
                                          biggest116718=ends[14];
                                        }
                                        if(ends[15]>=biggest116718){
                                          biggest116718=ends[15];
                                        }
                                        if(ends[16]>=biggest116718){
                                          biggest116718=ends[16];
                                        }
                                        if(ends[19]>=biggest116718){
                                          biggest116718=ends[19];
                                        }
                                        if(biggest116718 == 1){
                                          active[13]=1;
                                          ends[13]=1;
                                          break RUN;
                                        }
                                      }
                                      else {
                                        S100565=2;
                                        S104060=0;
                                        if(!capperStatus_o.isPartnerPresent() || capperStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 243, column: 3
                                          capperStatus_o.setREQ(false);//sysj\controller.sysj line: 243, column: 3
                                          S104060=1;
                                          active[13]=1;
                                          ends[13]=1;
                                          break RUN;
                                        }
                                        else {
                                          S104055=0;
                                          if(capperStatus_o.isACK()){//sysj\controller.sysj line: 243, column: 3
                                            capperStatus_o.setVal("done");//sysj\controller.sysj line: 243, column: 3
                                            S104055=1;
                                            if(!capperStatus_o.isACK()){//sysj\controller.sysj line: 243, column: 3
                                              capperStatus_o.setREQ(false);//sysj\controller.sysj line: 243, column: 3
                                              ends[13]=2;
                                              ;//sysj\controller.sysj line: 243, column: 3
                                              S100565=3;
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
                                S100680=2;
                                if(bottleAtPos4.getprestatus()){//sysj\controller.sysj line: 204, column: 12
                                  System.out.println("Capper doing work...");//sysj\controller.sysj line: 205, column: 5
                                  thread116719(tdone,ends);
                                  thread116720(tdone,ends);
                                  thread116721(tdone,ends);
                                  thread116725(tdone,ends);
                                  int biggest116726 = 0;
                                  if(ends[14]>=biggest116726){
                                    biggest116726=ends[14];
                                  }
                                  if(ends[15]>=biggest116726){
                                    biggest116726=ends[15];
                                  }
                                  if(ends[16]>=biggest116726){
                                    biggest116726=ends[16];
                                  }
                                  if(ends[19]>=biggest116726){
                                    biggest116726=ends[19];
                                  }
                                  if(biggest116726 == 1){
                                    active[13]=1;
                                    ends[13]=1;
                                    break RUN;
                                  }
                                }
                                else {
                                  S100565=2;
                                  S104060=0;
                                  if(!capperStatus_o.isPartnerPresent() || capperStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 243, column: 3
                                    capperStatus_o.setREQ(false);//sysj\controller.sysj line: 243, column: 3
                                    S104060=1;
                                    active[13]=1;
                                    ends[13]=1;
                                    break RUN;
                                  }
                                  else {
                                    S104055=0;
                                    if(capperStatus_o.isACK()){//sysj\controller.sysj line: 243, column: 3
                                      capperStatus_o.setVal("done");//sysj\controller.sysj line: 243, column: 3
                                      S104055=1;
                                      if(!capperStatus_o.isACK()){//sysj\controller.sysj line: 243, column: 3
                                        capperStatus_o.setREQ(false);//sysj\controller.sysj line: 243, column: 3
                                        ends[13]=2;
                                        ;//sysj\controller.sysj line: 243, column: 3
                                        S100565=3;
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
                      S100572=1;
                      S100572=0;
                      if(!capperStatus_o.isPartnerPresent() || capperStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 198, column: 4
                        capperStatus_o.setREQ(false);//sysj\controller.sysj line: 198, column: 4
                        S100572=1;
                        active[13]=1;
                        ends[13]=1;
                        break RUN;
                      }
                      else {
                        S100567=0;
                        if(capperStatus_o.isACK()){//sysj\controller.sysj line: 198, column: 4
                          capperStatus_o.setVal("busy");//sysj\controller.sysj line: 198, column: 4
                          S100567=1;
                          if(!capperStatus_o.isACK()){//sysj\controller.sysj line: 198, column: 4
                            capperStatus_o.setREQ(false);//sysj\controller.sysj line: 198, column: 4
                            ends[13]=2;
                            ;//sysj\controller.sysj line: 198, column: 4
                            S100680=1;
                            if(!bottleAtPos4.getprestatus()){//sysj\controller.sysj line: 200, column: 13
                              S100594=0;
                              if(!capperStatus_o.isPartnerPresent() || capperStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 201, column: 5
                                capperStatus_o.setREQ(false);//sysj\controller.sysj line: 201, column: 5
                                S100594=1;
                                active[13]=1;
                                ends[13]=1;
                                break RUN;
                              }
                              else {
                                S100589=0;
                                if(capperStatus_o.isACK()){//sysj\controller.sysj line: 201, column: 5
                                  capperStatus_o.setVal("idle");//sysj\controller.sysj line: 201, column: 5
                                  S100589=1;
                                  if(!capperStatus_o.isACK()){//sysj\controller.sysj line: 201, column: 5
                                    capperStatus_o.setREQ(false);//sysj\controller.sysj line: 201, column: 5
                                    ends[13]=2;
                                    ;//sysj\controller.sysj line: 201, column: 5
                                    S100680=2;
                                    if(bottleAtPos4.getprestatus()){//sysj\controller.sysj line: 204, column: 12
                                      System.out.println("Capper doing work...");//sysj\controller.sysj line: 205, column: 5
                                      thread116727(tdone,ends);
                                      thread116728(tdone,ends);
                                      thread116729(tdone,ends);
                                      thread116733(tdone,ends);
                                      int biggest116734 = 0;
                                      if(ends[14]>=biggest116734){
                                        biggest116734=ends[14];
                                      }
                                      if(ends[15]>=biggest116734){
                                        biggest116734=ends[15];
                                      }
                                      if(ends[16]>=biggest116734){
                                        biggest116734=ends[16];
                                      }
                                      if(ends[19]>=biggest116734){
                                        biggest116734=ends[19];
                                      }
                                      if(biggest116734 == 1){
                                        active[13]=1;
                                        ends[13]=1;
                                        break RUN;
                                      }
                                    }
                                    else {
                                      S100565=2;
                                      S104060=0;
                                      if(!capperStatus_o.isPartnerPresent() || capperStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 243, column: 3
                                        capperStatus_o.setREQ(false);//sysj\controller.sysj line: 243, column: 3
                                        S104060=1;
                                        active[13]=1;
                                        ends[13]=1;
                                        break RUN;
                                      }
                                      else {
                                        S104055=0;
                                        if(capperStatus_o.isACK()){//sysj\controller.sysj line: 243, column: 3
                                          capperStatus_o.setVal("done");//sysj\controller.sysj line: 243, column: 3
                                          S104055=1;
                                          if(!capperStatus_o.isACK()){//sysj\controller.sysj line: 243, column: 3
                                            capperStatus_o.setREQ(false);//sysj\controller.sysj line: 243, column: 3
                                            ends[13]=2;
                                            ;//sysj\controller.sysj line: 243, column: 3
                                            S100565=3;
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
                              S100680=2;
                              if(bottleAtPos4.getprestatus()){//sysj\controller.sysj line: 204, column: 12
                                System.out.println("Capper doing work...");//sysj\controller.sysj line: 205, column: 5
                                thread116735(tdone,ends);
                                thread116736(tdone,ends);
                                thread116737(tdone,ends);
                                thread116741(tdone,ends);
                                int biggest116742 = 0;
                                if(ends[14]>=biggest116742){
                                  biggest116742=ends[14];
                                }
                                if(ends[15]>=biggest116742){
                                  biggest116742=ends[15];
                                }
                                if(ends[16]>=biggest116742){
                                  biggest116742=ends[16];
                                }
                                if(ends[19]>=biggest116742){
                                  biggest116742=ends[19];
                                }
                                if(biggest116742 == 1){
                                  active[13]=1;
                                  ends[13]=1;
                                  break RUN;
                                }
                              }
                              else {
                                S100565=2;
                                S104060=0;
                                if(!capperStatus_o.isPartnerPresent() || capperStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 243, column: 3
                                  capperStatus_o.setREQ(false);//sysj\controller.sysj line: 243, column: 3
                                  S104060=1;
                                  active[13]=1;
                                  ends[13]=1;
                                  break RUN;
                                }
                                else {
                                  S104055=0;
                                  if(capperStatus_o.isACK()){//sysj\controller.sysj line: 243, column: 3
                                    capperStatus_o.setVal("done");//sysj\controller.sysj line: 243, column: 3
                                    S104055=1;
                                    if(!capperStatus_o.isACK()){//sysj\controller.sysj line: 243, column: 3
                                      capperStatus_o.setREQ(false);//sysj\controller.sysj line: 243, column: 3
                                      ends[13]=2;
                                      ;//sysj\controller.sysj line: 243, column: 3
                                      S100565=3;
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
                  switch(S100594){
                    case 0 : 
                      if(!capperStatus_o.isPartnerPresent() || capperStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 201, column: 5
                        capperStatus_o.setREQ(false);//sysj\controller.sysj line: 201, column: 5
                        S100594=1;
                        active[13]=1;
                        ends[13]=1;
                        break RUN;
                      }
                      else {
                        switch(S100589){
                          case 0 : 
                            if(capperStatus_o.isACK()){//sysj\controller.sysj line: 201, column: 5
                              capperStatus_o.setVal("idle");//sysj\controller.sysj line: 201, column: 5
                              S100589=1;
                              if(!capperStatus_o.isACK()){//sysj\controller.sysj line: 201, column: 5
                                capperStatus_o.setREQ(false);//sysj\controller.sysj line: 201, column: 5
                                ends[13]=2;
                                ;//sysj\controller.sysj line: 201, column: 5
                                S100680=2;
                                if(bottleAtPos4.getprestatus()){//sysj\controller.sysj line: 204, column: 12
                                  System.out.println("Capper doing work...");//sysj\controller.sysj line: 205, column: 5
                                  thread116743(tdone,ends);
                                  thread116744(tdone,ends);
                                  thread116745(tdone,ends);
                                  thread116749(tdone,ends);
                                  int biggest116750 = 0;
                                  if(ends[14]>=biggest116750){
                                    biggest116750=ends[14];
                                  }
                                  if(ends[15]>=biggest116750){
                                    biggest116750=ends[15];
                                  }
                                  if(ends[16]>=biggest116750){
                                    biggest116750=ends[16];
                                  }
                                  if(ends[19]>=biggest116750){
                                    biggest116750=ends[19];
                                  }
                                  if(biggest116750 == 1){
                                    active[13]=1;
                                    ends[13]=1;
                                    break RUN;
                                  }
                                }
                                else {
                                  S100565=2;
                                  S104060=0;
                                  if(!capperStatus_o.isPartnerPresent() || capperStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 243, column: 3
                                    capperStatus_o.setREQ(false);//sysj\controller.sysj line: 243, column: 3
                                    S104060=1;
                                    active[13]=1;
                                    ends[13]=1;
                                    break RUN;
                                  }
                                  else {
                                    S104055=0;
                                    if(capperStatus_o.isACK()){//sysj\controller.sysj line: 243, column: 3
                                      capperStatus_o.setVal("done");//sysj\controller.sysj line: 243, column: 3
                                      S104055=1;
                                      if(!capperStatus_o.isACK()){//sysj\controller.sysj line: 243, column: 3
                                        capperStatus_o.setREQ(false);//sysj\controller.sysj line: 243, column: 3
                                        ends[13]=2;
                                        ;//sysj\controller.sysj line: 243, column: 3
                                        S100565=3;
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
                              S100680=2;
                              if(bottleAtPos4.getprestatus()){//sysj\controller.sysj line: 204, column: 12
                                System.out.println("Capper doing work...");//sysj\controller.sysj line: 205, column: 5
                                thread116751(tdone,ends);
                                thread116752(tdone,ends);
                                thread116753(tdone,ends);
                                thread116757(tdone,ends);
                                int biggest116758 = 0;
                                if(ends[14]>=biggest116758){
                                  biggest116758=ends[14];
                                }
                                if(ends[15]>=biggest116758){
                                  biggest116758=ends[15];
                                }
                                if(ends[16]>=biggest116758){
                                  biggest116758=ends[16];
                                }
                                if(ends[19]>=biggest116758){
                                  biggest116758=ends[19];
                                }
                                if(biggest116758 == 1){
                                  active[13]=1;
                                  ends[13]=1;
                                  break RUN;
                                }
                              }
                              else {
                                S100565=2;
                                S104060=0;
                                if(!capperStatus_o.isPartnerPresent() || capperStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 243, column: 3
                                  capperStatus_o.setREQ(false);//sysj\controller.sysj line: 243, column: 3
                                  S104060=1;
                                  active[13]=1;
                                  ends[13]=1;
                                  break RUN;
                                }
                                else {
                                  S104055=0;
                                  if(capperStatus_o.isACK()){//sysj\controller.sysj line: 243, column: 3
                                    capperStatus_o.setVal("done");//sysj\controller.sysj line: 243, column: 3
                                    S104055=1;
                                    if(!capperStatus_o.isACK()){//sysj\controller.sysj line: 243, column: 3
                                      capperStatus_o.setREQ(false);//sysj\controller.sysj line: 243, column: 3
                                      ends[13]=2;
                                      ;//sysj\controller.sysj line: 243, column: 3
                                      S100565=3;
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
                      S100594=1;
                      S100594=0;
                      if(!capperStatus_o.isPartnerPresent() || capperStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 201, column: 5
                        capperStatus_o.setREQ(false);//sysj\controller.sysj line: 201, column: 5
                        S100594=1;
                        active[13]=1;
                        ends[13]=1;
                        break RUN;
                      }
                      else {
                        S100589=0;
                        if(capperStatus_o.isACK()){//sysj\controller.sysj line: 201, column: 5
                          capperStatus_o.setVal("idle");//sysj\controller.sysj line: 201, column: 5
                          S100589=1;
                          if(!capperStatus_o.isACK()){//sysj\controller.sysj line: 201, column: 5
                            capperStatus_o.setREQ(false);//sysj\controller.sysj line: 201, column: 5
                            ends[13]=2;
                            ;//sysj\controller.sysj line: 201, column: 5
                            S100680=2;
                            if(bottleAtPos4.getprestatus()){//sysj\controller.sysj line: 204, column: 12
                              System.out.println("Capper doing work...");//sysj\controller.sysj line: 205, column: 5
                              thread116759(tdone,ends);
                              thread116760(tdone,ends);
                              thread116761(tdone,ends);
                              thread116765(tdone,ends);
                              int biggest116766 = 0;
                              if(ends[14]>=biggest116766){
                                biggest116766=ends[14];
                              }
                              if(ends[15]>=biggest116766){
                                biggest116766=ends[15];
                              }
                              if(ends[16]>=biggest116766){
                                biggest116766=ends[16];
                              }
                              if(ends[19]>=biggest116766){
                                biggest116766=ends[19];
                              }
                              if(biggest116766 == 1){
                                active[13]=1;
                                ends[13]=1;
                                break RUN;
                              }
                            }
                            else {
                              S100565=2;
                              S104060=0;
                              if(!capperStatus_o.isPartnerPresent() || capperStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 243, column: 3
                                capperStatus_o.setREQ(false);//sysj\controller.sysj line: 243, column: 3
                                S104060=1;
                                active[13]=1;
                                ends[13]=1;
                                break RUN;
                              }
                              else {
                                S104055=0;
                                if(capperStatus_o.isACK()){//sysj\controller.sysj line: 243, column: 3
                                  capperStatus_o.setVal("done");//sysj\controller.sysj line: 243, column: 3
                                  S104055=1;
                                  if(!capperStatus_o.isACK()){//sysj\controller.sysj line: 243, column: 3
                                    capperStatus_o.setREQ(false);//sysj\controller.sysj line: 243, column: 3
                                    ends[13]=2;
                                    ;//sysj\controller.sysj line: 243, column: 3
                                    S100565=3;
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
                  thread116767(tdone,ends);
                  thread116768(tdone,ends);
                  thread116769(tdone,ends);
                  thread116773(tdone,ends);
                  int biggest116774 = 0;
                  if(ends[14]>=biggest116774){
                    biggest116774=ends[14];
                  }
                  if(ends[15]>=biggest116774){
                    biggest116774=ends[15];
                  }
                  if(ends[16]>=biggest116774){
                    biggest116774=ends[16];
                  }
                  if(ends[19]>=biggest116774){
                    biggest116774=ends[19];
                  }
                  if(biggest116774 == 1){
                    active[13]=1;
                    ends[13]=1;
                    break RUN;
                  }
                  //FINXME code
                  if(biggest116774 == 0){
                    S100565=2;
                    S104060=0;
                    if(!capperStatus_o.isPartnerPresent() || capperStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 243, column: 3
                      capperStatus_o.setREQ(false);//sysj\controller.sysj line: 243, column: 3
                      S104060=1;
                      active[13]=1;
                      ends[13]=1;
                      break RUN;
                    }
                    else {
                      S104055=0;
                      if(capperStatus_o.isACK()){//sysj\controller.sysj line: 243, column: 3
                        capperStatus_o.setVal("done");//sysj\controller.sysj line: 243, column: 3
                        S104055=1;
                        if(!capperStatus_o.isACK()){//sysj\controller.sysj line: 243, column: 3
                          capperStatus_o.setREQ(false);//sysj\controller.sysj line: 243, column: 3
                          ends[13]=2;
                          ;//sysj\controller.sysj line: 243, column: 3
                          S100565=3;
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
              break;
            
            case 2 : 
              switch(S104060){
                case 0 : 
                  if(!capperStatus_o.isPartnerPresent() || capperStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 243, column: 3
                    capperStatus_o.setREQ(false);//sysj\controller.sysj line: 243, column: 3
                    S104060=1;
                    active[13]=1;
                    ends[13]=1;
                    break RUN;
                  }
                  else {
                    switch(S104055){
                      case 0 : 
                        if(capperStatus_o.isACK()){//sysj\controller.sysj line: 243, column: 3
                          capperStatus_o.setVal("done");//sysj\controller.sysj line: 243, column: 3
                          S104055=1;
                          if(!capperStatus_o.isACK()){//sysj\controller.sysj line: 243, column: 3
                            capperStatus_o.setREQ(false);//sysj\controller.sysj line: 243, column: 3
                            ends[13]=2;
                            ;//sysj\controller.sysj line: 243, column: 3
                            S100565=3;
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
                        if(!capperStatus_o.isACK()){//sysj\controller.sysj line: 243, column: 3
                          capperStatus_o.setREQ(false);//sysj\controller.sysj line: 243, column: 3
                          ends[13]=2;
                          ;//sysj\controller.sysj line: 243, column: 3
                          S100565=3;
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
                  S104060=1;
                  S104060=0;
                  if(!capperStatus_o.isPartnerPresent() || capperStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 243, column: 3
                    capperStatus_o.setREQ(false);//sysj\controller.sysj line: 243, column: 3
                    S104060=1;
                    active[13]=1;
                    ends[13]=1;
                    break RUN;
                  }
                  else {
                    S104055=0;
                    if(capperStatus_o.isACK()){//sysj\controller.sysj line: 243, column: 3
                      capperStatus_o.setVal("done");//sysj\controller.sysj line: 243, column: 3
                      S104055=1;
                      if(!capperStatus_o.isACK()){//sysj\controller.sysj line: 243, column: 3
                        capperStatus_o.setREQ(false);//sysj\controller.sysj line: 243, column: 3
                        ends[13]=2;
                        ;//sysj\controller.sysj line: 243, column: 3
                        S100565=3;
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
            
            case 3 : 
              S100565=3;
              S100565=0;
              S100549=0;
              if(!capperReq_in.isPartnerPresent() || capperReq_in.isPartnerPreempted()){//sysj\controller.sysj line: 194, column: 3
                capperReq_in.setACK(false);//sysj\controller.sysj line: 194, column: 3
                S100549=1;
                active[13]=1;
                ends[13]=1;
                break RUN;
              }
              else {
                S100544=0;
                if(!capperReq_in.isREQ()){//sysj\controller.sysj line: 194, column: 3
                  capperReq_in.setACK(true);//sysj\controller.sysj line: 194, column: 3
                  S100544=1;
                  if(capperReq_in.isREQ()){//sysj\controller.sysj line: 194, column: 3
                    capperReq_in.setACK(false);//sysj\controller.sysj line: 194, column: 3
                    ends[13]=2;
                    ;//sysj\controller.sysj line: 194, column: 3
                    request_thread_13 = (boolean)(capperReq_in.getVal() == null ? false : ((Boolean)capperReq_in.getVal()).booleanValue());//sysj\controller.sysj line: 195, column: 3
                    S100565=1;
                    if(request_thread_13){//sysj\controller.sysj line: 197, column: 3
                      S100680=0;
                      S100572=0;
                      if(!capperStatus_o.isPartnerPresent() || capperStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 198, column: 4
                        capperStatus_o.setREQ(false);//sysj\controller.sysj line: 198, column: 4
                        S100572=1;
                        active[13]=1;
                        ends[13]=1;
                        break RUN;
                      }
                      else {
                        S100567=0;
                        if(capperStatus_o.isACK()){//sysj\controller.sysj line: 198, column: 4
                          capperStatus_o.setVal("busy");//sysj\controller.sysj line: 198, column: 4
                          S100567=1;
                          if(!capperStatus_o.isACK()){//sysj\controller.sysj line: 198, column: 4
                            capperStatus_o.setREQ(false);//sysj\controller.sysj line: 198, column: 4
                            ends[13]=2;
                            ;//sysj\controller.sysj line: 198, column: 4
                            S100680=1;
                            if(!bottleAtPos4.getprestatus()){//sysj\controller.sysj line: 200, column: 13
                              S100594=0;
                              if(!capperStatus_o.isPartnerPresent() || capperStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 201, column: 5
                                capperStatus_o.setREQ(false);//sysj\controller.sysj line: 201, column: 5
                                S100594=1;
                                active[13]=1;
                                ends[13]=1;
                                break RUN;
                              }
                              else {
                                S100589=0;
                                if(capperStatus_o.isACK()){//sysj\controller.sysj line: 201, column: 5
                                  capperStatus_o.setVal("idle");//sysj\controller.sysj line: 201, column: 5
                                  S100589=1;
                                  if(!capperStatus_o.isACK()){//sysj\controller.sysj line: 201, column: 5
                                    capperStatus_o.setREQ(false);//sysj\controller.sysj line: 201, column: 5
                                    ends[13]=2;
                                    ;//sysj\controller.sysj line: 201, column: 5
                                    S100680=2;
                                    if(bottleAtPos4.getprestatus()){//sysj\controller.sysj line: 204, column: 12
                                      System.out.println("Capper doing work...");//sysj\controller.sysj line: 205, column: 5
                                      thread116775(tdone,ends);
                                      thread116776(tdone,ends);
                                      thread116777(tdone,ends);
                                      thread116781(tdone,ends);
                                      int biggest116782 = 0;
                                      if(ends[14]>=biggest116782){
                                        biggest116782=ends[14];
                                      }
                                      if(ends[15]>=biggest116782){
                                        biggest116782=ends[15];
                                      }
                                      if(ends[16]>=biggest116782){
                                        biggest116782=ends[16];
                                      }
                                      if(ends[19]>=biggest116782){
                                        biggest116782=ends[19];
                                      }
                                      if(biggest116782 == 1){
                                        active[13]=1;
                                        ends[13]=1;
                                        break RUN;
                                      }
                                    }
                                    else {
                                      S100565=2;
                                      S104060=0;
                                      if(!capperStatus_o.isPartnerPresent() || capperStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 243, column: 3
                                        capperStatus_o.setREQ(false);//sysj\controller.sysj line: 243, column: 3
                                        S104060=1;
                                        active[13]=1;
                                        ends[13]=1;
                                        break RUN;
                                      }
                                      else {
                                        S104055=0;
                                        if(capperStatus_o.isACK()){//sysj\controller.sysj line: 243, column: 3
                                          capperStatus_o.setVal("done");//sysj\controller.sysj line: 243, column: 3
                                          S104055=1;
                                          if(!capperStatus_o.isACK()){//sysj\controller.sysj line: 243, column: 3
                                            capperStatus_o.setREQ(false);//sysj\controller.sysj line: 243, column: 3
                                            ends[13]=2;
                                            ;//sysj\controller.sysj line: 243, column: 3
                                            S100565=3;
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
                              S100680=2;
                              if(bottleAtPos4.getprestatus()){//sysj\controller.sysj line: 204, column: 12
                                System.out.println("Capper doing work...");//sysj\controller.sysj line: 205, column: 5
                                thread116783(tdone,ends);
                                thread116784(tdone,ends);
                                thread116785(tdone,ends);
                                thread116789(tdone,ends);
                                int biggest116790 = 0;
                                if(ends[14]>=biggest116790){
                                  biggest116790=ends[14];
                                }
                                if(ends[15]>=biggest116790){
                                  biggest116790=ends[15];
                                }
                                if(ends[16]>=biggest116790){
                                  biggest116790=ends[16];
                                }
                                if(ends[19]>=biggest116790){
                                  biggest116790=ends[19];
                                }
                                if(biggest116790 == 1){
                                  active[13]=1;
                                  ends[13]=1;
                                  break RUN;
                                }
                              }
                              else {
                                S100565=2;
                                S104060=0;
                                if(!capperStatus_o.isPartnerPresent() || capperStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 243, column: 3
                                  capperStatus_o.setREQ(false);//sysj\controller.sysj line: 243, column: 3
                                  S104060=1;
                                  active[13]=1;
                                  ends[13]=1;
                                  break RUN;
                                }
                                else {
                                  S104055=0;
                                  if(capperStatus_o.isACK()){//sysj\controller.sysj line: 243, column: 3
                                    capperStatus_o.setVal("done");//sysj\controller.sysj line: 243, column: 3
                                    S104055=1;
                                    if(!capperStatus_o.isACK()){//sysj\controller.sysj line: 243, column: 3
                                      capperStatus_o.setREQ(false);//sysj\controller.sysj line: 243, column: 3
                                      ends[13]=2;
                                      ;//sysj\controller.sysj line: 243, column: 3
                                      S100565=3;
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
                      S100565=2;
                      S104060=0;
                      if(!capperStatus_o.isPartnerPresent() || capperStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 243, column: 3
                        capperStatus_o.setREQ(false);//sysj\controller.sysj line: 243, column: 3
                        S104060=1;
                        active[13]=1;
                        ends[13]=1;
                        break RUN;
                      }
                      else {
                        S104055=0;
                        if(capperStatus_o.isACK()){//sysj\controller.sysj line: 243, column: 3
                          capperStatus_o.setVal("done");//sysj\controller.sysj line: 243, column: 3
                          S104055=1;
                          if(!capperStatus_o.isACK()){//sysj\controller.sysj line: 243, column: 3
                            capperStatus_o.setREQ(false);//sysj\controller.sysj line: 243, column: 3
                            ends[13]=2;
                            ;//sysj\controller.sysj line: 243, column: 3
                            S100565=3;
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
