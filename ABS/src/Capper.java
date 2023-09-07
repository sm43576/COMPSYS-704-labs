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
  private boolean request_thread_13;//sysj\controller.sysj line: 198, column: 3
  private int S115283 = 1;
  private int S101867 = 1;
  private int S101851 = 1;
  private int S101846 = 1;
  private int S102981 = 1;
  private int S101982 = 1;
  private int S101874 = 1;
  private int S101869 = 1;
  private int S101896 = 1;
  private int S101891 = 1;
  private int S101988 = 1;
  private int S101994 = 1;
  private int S102010 = 1;
  private int S102009 = 1;
  private int S101997 = 1;
  private int S102000 = 1;
  private int S102023 = 1;
  private int S102020 = 1;
  private int S102745 = 1;
  private int S102740 = 1;
  private int S102965 = 1;
  private int S102960 = 1;
  
  private int[] ends = new int[23];
  private int[] tdone = new int[23];
  
  public void thread117905(int [] tdone, int [] ends){
        S102023=1;
    S102020=0;
    active[19]=1;
    ends[19]=1;
    tdone[19]=1;
  }

  public void thread117903(int [] tdone, int [] ends){
        S102000=1;
    active[18]=1;
    ends[18]=1;
    tdone[18]=1;
  }

  public void thread117902(int [] tdone, int [] ends){
        S101997=1;
    active[17]=1;
    ends[17]=1;
    tdone[17]=1;
  }

  public void thread117901(int [] tdone, int [] ends){
        S102010=1;
    S102009=0;
    thread117902(tdone,ends);
    thread117903(tdone,ends);
    int biggest117904 = 0;
    if(ends[17]>=biggest117904){
      biggest117904=ends[17];
    }
    if(ends[18]>=biggest117904){
      biggest117904=ends[18];
    }
    if(biggest117904 == 1){
      active[16]=1;
      ends[16]=1;
      tdone[16]=1;
    }
  }

  public void thread117900(int [] tdone, int [] ends){
        S101994=1;
    cylPos5ZAxisExtend.setPresent();//sysj\controller.sysj line: 217, column: 7
    currsigs.addElement(cylPos5ZAxisExtend);
    active[15]=1;
    ends[15]=1;
    tdone[15]=1;
  }

  public void thread117899(int [] tdone, int [] ends){
        S101988=1;
    cylClampBottleExtend.setPresent();//sysj\controller.sysj line: 211, column: 7
    currsigs.addElement(cylClampBottleExtend);
    active[14]=1;
    ends[14]=1;
    tdone[14]=1;
  }

  public void thread117897(int [] tdone, int [] ends){
        S102023=1;
    S102020=0;
    active[19]=1;
    ends[19]=1;
    tdone[19]=1;
  }

  public void thread117895(int [] tdone, int [] ends){
        S102000=1;
    active[18]=1;
    ends[18]=1;
    tdone[18]=1;
  }

  public void thread117894(int [] tdone, int [] ends){
        S101997=1;
    active[17]=1;
    ends[17]=1;
    tdone[17]=1;
  }

  public void thread117893(int [] tdone, int [] ends){
        S102010=1;
    S102009=0;
    thread117894(tdone,ends);
    thread117895(tdone,ends);
    int biggest117896 = 0;
    if(ends[17]>=biggest117896){
      biggest117896=ends[17];
    }
    if(ends[18]>=biggest117896){
      biggest117896=ends[18];
    }
    if(biggest117896 == 1){
      active[16]=1;
      ends[16]=1;
      tdone[16]=1;
    }
  }

  public void thread117892(int [] tdone, int [] ends){
        S101994=1;
    cylPos5ZAxisExtend.setPresent();//sysj\controller.sysj line: 217, column: 7
    currsigs.addElement(cylPos5ZAxisExtend);
    active[15]=1;
    ends[15]=1;
    tdone[15]=1;
  }

  public void thread117891(int [] tdone, int [] ends){
        S101988=1;
    cylClampBottleExtend.setPresent();//sysj\controller.sysj line: 211, column: 7
    currsigs.addElement(cylClampBottleExtend);
    active[14]=1;
    ends[14]=1;
    tdone[14]=1;
  }

  public void thread117889(int [] tdone, int [] ends){
        switch(S102023){
      case 0 : 
        active[19]=0;
        ends[19]=0;
        tdone[19]=1;
        break;
      
      case 1 : 
        switch(S102020){
          case 0 : 
            if(gripperGrippedCap.getprestatus()){//sysj\controller.sysj line: 230, column: 12
              S102020=1;
              gripperTurnExtend.setPresent();//sysj\controller.sysj line: 233, column: 7
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
            if(gripperTurnFinalPos.getprestatus()){//sysj\controller.sysj line: 232, column: 13
              releaseCap_13.setPresent();//sysj\controller.sysj line: 235, column: 6
              currsigs.addElement(releaseCap_13);
              untwistGripper_13.setPresent();//sysj\controller.sysj line: 238, column: 7
              currsigs.addElement(untwistGripper_13);
              raiseGripper_13.setPresent();//sysj\controller.sysj line: 241, column: 6
              currsigs.addElement(raiseGripper_13);
              unclampBottle_13.setPresent();//sysj\controller.sysj line: 242, column: 6
              currsigs.addElement(unclampBottle_13);
              S102023=0;
              active[19]=0;
              ends[19]=0;
              tdone[19]=1;
            }
            else {
              gripperTurnExtend.setPresent();//sysj\controller.sysj line: 233, column: 7
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

  public void thread117887(int [] tdone, int [] ends){
        switch(S102000){
      case 0 : 
        active[18]=0;
        ends[18]=0;
        tdone[18]=1;
        break;
      
      case 1 : 
        if(cylClampedBottle.getprestatus()){//sysj\controller.sysj line: 223, column: 46
          S102000=0;
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

  public void thread117886(int [] tdone, int [] ends){
        switch(S101997){
      case 0 : 
        active[17]=0;
        ends[17]=0;
        tdone[17]=1;
        break;
      
      case 1 : 
        if(gripperZAxisLowered.getprestatus()){//sysj\controller.sysj line: 223, column: 13
          S101997=0;
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

  public void thread117885(int [] tdone, int [] ends){
        switch(S102010){
      case 0 : 
        active[16]=0;
        ends[16]=0;
        tdone[16]=1;
        break;
      
      case 1 : 
        switch(S102009){
          case 0 : 
            thread117886(tdone,ends);
            thread117887(tdone,ends);
            int biggest117888 = 0;
            if(ends[17]>=biggest117888){
              biggest117888=ends[17];
            }
            if(ends[18]>=biggest117888){
              biggest117888=ends[18];
            }
            if(biggest117888 == 1){
              active[16]=1;
              ends[16]=1;
              tdone[16]=1;
            }
            //FINXME code
            if(biggest117888 == 0){
              S102009=1;
              capGripperPos5Extend.setPresent();//sysj\controller.sysj line: 225, column: 7
              currsigs.addElement(capGripperPos5Extend);
              active[16]=1;
              ends[16]=1;
              tdone[16]=1;
            }
            break;
          
          case 1 : 
            if(releaseCap_13.getprestatus()){//sysj\controller.sysj line: 224, column: 12
              S102010=0;
              active[16]=0;
              ends[16]=0;
              tdone[16]=1;
            }
            else {
              capGripperPos5Extend.setPresent();//sysj\controller.sysj line: 225, column: 7
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

  public void thread117884(int [] tdone, int [] ends){
        switch(S101994){
      case 0 : 
        active[15]=0;
        ends[15]=0;
        tdone[15]=1;
        break;
      
      case 1 : 
        if(raiseGripper_13.getprestatus()){//sysj\controller.sysj line: 216, column: 12
          S101994=0;
          active[15]=0;
          ends[15]=0;
          tdone[15]=1;
        }
        else {
          cylPos5ZAxisExtend.setPresent();//sysj\controller.sysj line: 217, column: 7
          currsigs.addElement(cylPos5ZAxisExtend);
          active[15]=1;
          ends[15]=1;
          tdone[15]=1;
        }
        break;
      
    }
  }

  public void thread117883(int [] tdone, int [] ends){
        switch(S101988){
      case 0 : 
        active[14]=0;
        ends[14]=0;
        tdone[14]=1;
        break;
      
      case 1 : 
        if(unclampBottle_13.getprestatus()){//sysj\controller.sysj line: 210, column: 13
          S101988=0;
          active[14]=0;
          ends[14]=0;
          tdone[14]=1;
        }
        else {
          cylClampBottleExtend.setPresent();//sysj\controller.sysj line: 211, column: 7
          currsigs.addElement(cylClampBottleExtend);
          active[14]=1;
          ends[14]=1;
          tdone[14]=1;
        }
        break;
      
    }
  }

  public void thread117881(int [] tdone, int [] ends){
        S102023=1;
    S102020=0;
    active[19]=1;
    ends[19]=1;
    tdone[19]=1;
  }

  public void thread117879(int [] tdone, int [] ends){
        S102000=1;
    active[18]=1;
    ends[18]=1;
    tdone[18]=1;
  }

  public void thread117878(int [] tdone, int [] ends){
        S101997=1;
    active[17]=1;
    ends[17]=1;
    tdone[17]=1;
  }

  public void thread117877(int [] tdone, int [] ends){
        S102010=1;
    S102009=0;
    thread117878(tdone,ends);
    thread117879(tdone,ends);
    int biggest117880 = 0;
    if(ends[17]>=biggest117880){
      biggest117880=ends[17];
    }
    if(ends[18]>=biggest117880){
      biggest117880=ends[18];
    }
    if(biggest117880 == 1){
      active[16]=1;
      ends[16]=1;
      tdone[16]=1;
    }
  }

  public void thread117876(int [] tdone, int [] ends){
        S101994=1;
    cylPos5ZAxisExtend.setPresent();//sysj\controller.sysj line: 217, column: 7
    currsigs.addElement(cylPos5ZAxisExtend);
    active[15]=1;
    ends[15]=1;
    tdone[15]=1;
  }

  public void thread117875(int [] tdone, int [] ends){
        S101988=1;
    cylClampBottleExtend.setPresent();//sysj\controller.sysj line: 211, column: 7
    currsigs.addElement(cylClampBottleExtend);
    active[14]=1;
    ends[14]=1;
    tdone[14]=1;
  }

  public void thread117873(int [] tdone, int [] ends){
        S102023=1;
    S102020=0;
    active[19]=1;
    ends[19]=1;
    tdone[19]=1;
  }

  public void thread117871(int [] tdone, int [] ends){
        S102000=1;
    active[18]=1;
    ends[18]=1;
    tdone[18]=1;
  }

  public void thread117870(int [] tdone, int [] ends){
        S101997=1;
    active[17]=1;
    ends[17]=1;
    tdone[17]=1;
  }

  public void thread117869(int [] tdone, int [] ends){
        S102010=1;
    S102009=0;
    thread117870(tdone,ends);
    thread117871(tdone,ends);
    int biggest117872 = 0;
    if(ends[17]>=biggest117872){
      biggest117872=ends[17];
    }
    if(ends[18]>=biggest117872){
      biggest117872=ends[18];
    }
    if(biggest117872 == 1){
      active[16]=1;
      ends[16]=1;
      tdone[16]=1;
    }
  }

  public void thread117868(int [] tdone, int [] ends){
        S101994=1;
    cylPos5ZAxisExtend.setPresent();//sysj\controller.sysj line: 217, column: 7
    currsigs.addElement(cylPos5ZAxisExtend);
    active[15]=1;
    ends[15]=1;
    tdone[15]=1;
  }

  public void thread117867(int [] tdone, int [] ends){
        S101988=1;
    cylClampBottleExtend.setPresent();//sysj\controller.sysj line: 211, column: 7
    currsigs.addElement(cylClampBottleExtend);
    active[14]=1;
    ends[14]=1;
    tdone[14]=1;
  }

  public void thread117865(int [] tdone, int [] ends){
        S102023=1;
    S102020=0;
    active[19]=1;
    ends[19]=1;
    tdone[19]=1;
  }

  public void thread117863(int [] tdone, int [] ends){
        S102000=1;
    active[18]=1;
    ends[18]=1;
    tdone[18]=1;
  }

  public void thread117862(int [] tdone, int [] ends){
        S101997=1;
    active[17]=1;
    ends[17]=1;
    tdone[17]=1;
  }

  public void thread117861(int [] tdone, int [] ends){
        S102010=1;
    S102009=0;
    thread117862(tdone,ends);
    thread117863(tdone,ends);
    int biggest117864 = 0;
    if(ends[17]>=biggest117864){
      biggest117864=ends[17];
    }
    if(ends[18]>=biggest117864){
      biggest117864=ends[18];
    }
    if(biggest117864 == 1){
      active[16]=1;
      ends[16]=1;
      tdone[16]=1;
    }
  }

  public void thread117860(int [] tdone, int [] ends){
        S101994=1;
    cylPos5ZAxisExtend.setPresent();//sysj\controller.sysj line: 217, column: 7
    currsigs.addElement(cylPos5ZAxisExtend);
    active[15]=1;
    ends[15]=1;
    tdone[15]=1;
  }

  public void thread117859(int [] tdone, int [] ends){
        S101988=1;
    cylClampBottleExtend.setPresent();//sysj\controller.sysj line: 211, column: 7
    currsigs.addElement(cylClampBottleExtend);
    active[14]=1;
    ends[14]=1;
    tdone[14]=1;
  }

  public void thread117857(int [] tdone, int [] ends){
        S102023=1;
    S102020=0;
    active[19]=1;
    ends[19]=1;
    tdone[19]=1;
  }

  public void thread117855(int [] tdone, int [] ends){
        S102000=1;
    active[18]=1;
    ends[18]=1;
    tdone[18]=1;
  }

  public void thread117854(int [] tdone, int [] ends){
        S101997=1;
    active[17]=1;
    ends[17]=1;
    tdone[17]=1;
  }

  public void thread117853(int [] tdone, int [] ends){
        S102010=1;
    S102009=0;
    thread117854(tdone,ends);
    thread117855(tdone,ends);
    int biggest117856 = 0;
    if(ends[17]>=biggest117856){
      biggest117856=ends[17];
    }
    if(ends[18]>=biggest117856){
      biggest117856=ends[18];
    }
    if(biggest117856 == 1){
      active[16]=1;
      ends[16]=1;
      tdone[16]=1;
    }
  }

  public void thread117852(int [] tdone, int [] ends){
        S101994=1;
    cylPos5ZAxisExtend.setPresent();//sysj\controller.sysj line: 217, column: 7
    currsigs.addElement(cylPos5ZAxisExtend);
    active[15]=1;
    ends[15]=1;
    tdone[15]=1;
  }

  public void thread117851(int [] tdone, int [] ends){
        S101988=1;
    cylClampBottleExtend.setPresent();//sysj\controller.sysj line: 211, column: 7
    currsigs.addElement(cylClampBottleExtend);
    active[14]=1;
    ends[14]=1;
    tdone[14]=1;
  }

  public void thread117849(int [] tdone, int [] ends){
        S102023=1;
    S102020=0;
    active[19]=1;
    ends[19]=1;
    tdone[19]=1;
  }

  public void thread117847(int [] tdone, int [] ends){
        S102000=1;
    active[18]=1;
    ends[18]=1;
    tdone[18]=1;
  }

  public void thread117846(int [] tdone, int [] ends){
        S101997=1;
    active[17]=1;
    ends[17]=1;
    tdone[17]=1;
  }

  public void thread117845(int [] tdone, int [] ends){
        S102010=1;
    S102009=0;
    thread117846(tdone,ends);
    thread117847(tdone,ends);
    int biggest117848 = 0;
    if(ends[17]>=biggest117848){
      biggest117848=ends[17];
    }
    if(ends[18]>=biggest117848){
      biggest117848=ends[18];
    }
    if(biggest117848 == 1){
      active[16]=1;
      ends[16]=1;
      tdone[16]=1;
    }
  }

  public void thread117844(int [] tdone, int [] ends){
        S101994=1;
    cylPos5ZAxisExtend.setPresent();//sysj\controller.sysj line: 217, column: 7
    currsigs.addElement(cylPos5ZAxisExtend);
    active[15]=1;
    ends[15]=1;
    tdone[15]=1;
  }

  public void thread117843(int [] tdone, int [] ends){
        S101988=1;
    cylClampBottleExtend.setPresent();//sysj\controller.sysj line: 211, column: 7
    currsigs.addElement(cylClampBottleExtend);
    active[14]=1;
    ends[14]=1;
    tdone[14]=1;
  }

  public void thread117841(int [] tdone, int [] ends){
        S102023=1;
    S102020=0;
    active[19]=1;
    ends[19]=1;
    tdone[19]=1;
  }

  public void thread117839(int [] tdone, int [] ends){
        S102000=1;
    active[18]=1;
    ends[18]=1;
    tdone[18]=1;
  }

  public void thread117838(int [] tdone, int [] ends){
        S101997=1;
    active[17]=1;
    ends[17]=1;
    tdone[17]=1;
  }

  public void thread117837(int [] tdone, int [] ends){
        S102010=1;
    S102009=0;
    thread117838(tdone,ends);
    thread117839(tdone,ends);
    int biggest117840 = 0;
    if(ends[17]>=biggest117840){
      biggest117840=ends[17];
    }
    if(ends[18]>=biggest117840){
      biggest117840=ends[18];
    }
    if(biggest117840 == 1){
      active[16]=1;
      ends[16]=1;
      tdone[16]=1;
    }
  }

  public void thread117836(int [] tdone, int [] ends){
        S101994=1;
    cylPos5ZAxisExtend.setPresent();//sysj\controller.sysj line: 217, column: 7
    currsigs.addElement(cylPos5ZAxisExtend);
    active[15]=1;
    ends[15]=1;
    tdone[15]=1;
  }

  public void thread117835(int [] tdone, int [] ends){
        S101988=1;
    cylClampBottleExtend.setPresent();//sysj\controller.sysj line: 211, column: 7
    currsigs.addElement(cylClampBottleExtend);
    active[14]=1;
    ends[14]=1;
    tdone[14]=1;
  }

  public void thread117833(int [] tdone, int [] ends){
        S102023=1;
    S102020=0;
    active[19]=1;
    ends[19]=1;
    tdone[19]=1;
  }

  public void thread117831(int [] tdone, int [] ends){
        S102000=1;
    active[18]=1;
    ends[18]=1;
    tdone[18]=1;
  }

  public void thread117830(int [] tdone, int [] ends){
        S101997=1;
    active[17]=1;
    ends[17]=1;
    tdone[17]=1;
  }

  public void thread117829(int [] tdone, int [] ends){
        S102010=1;
    S102009=0;
    thread117830(tdone,ends);
    thread117831(tdone,ends);
    int biggest117832 = 0;
    if(ends[17]>=biggest117832){
      biggest117832=ends[17];
    }
    if(ends[18]>=biggest117832){
      biggest117832=ends[18];
    }
    if(biggest117832 == 1){
      active[16]=1;
      ends[16]=1;
      tdone[16]=1;
    }
  }

  public void thread117828(int [] tdone, int [] ends){
        S101994=1;
    cylPos5ZAxisExtend.setPresent();//sysj\controller.sysj line: 217, column: 7
    currsigs.addElement(cylPos5ZAxisExtend);
    active[15]=1;
    ends[15]=1;
    tdone[15]=1;
  }

  public void thread117827(int [] tdone, int [] ends){
        S101988=1;
    cylClampBottleExtend.setPresent();//sysj\controller.sysj line: 211, column: 7
    currsigs.addElement(cylClampBottleExtend);
    active[14]=1;
    ends[14]=1;
    tdone[14]=1;
  }

  public void thread117825(int [] tdone, int [] ends){
        S102023=1;
    S102020=0;
    active[19]=1;
    ends[19]=1;
    tdone[19]=1;
  }

  public void thread117823(int [] tdone, int [] ends){
        S102000=1;
    active[18]=1;
    ends[18]=1;
    tdone[18]=1;
  }

  public void thread117822(int [] tdone, int [] ends){
        S101997=1;
    active[17]=1;
    ends[17]=1;
    tdone[17]=1;
  }

  public void thread117821(int [] tdone, int [] ends){
        S102010=1;
    S102009=0;
    thread117822(tdone,ends);
    thread117823(tdone,ends);
    int biggest117824 = 0;
    if(ends[17]>=biggest117824){
      biggest117824=ends[17];
    }
    if(ends[18]>=biggest117824){
      biggest117824=ends[18];
    }
    if(biggest117824 == 1){
      active[16]=1;
      ends[16]=1;
      tdone[16]=1;
    }
  }

  public void thread117820(int [] tdone, int [] ends){
        S101994=1;
    cylPos5ZAxisExtend.setPresent();//sysj\controller.sysj line: 217, column: 7
    currsigs.addElement(cylPos5ZAxisExtend);
    active[15]=1;
    ends[15]=1;
    tdone[15]=1;
  }

  public void thread117819(int [] tdone, int [] ends){
        S101988=1;
    cylClampBottleExtend.setPresent();//sysj\controller.sysj line: 211, column: 7
    currsigs.addElement(cylClampBottleExtend);
    active[14]=1;
    ends[14]=1;
    tdone[14]=1;
  }

  public void thread117817(int [] tdone, int [] ends){
        S102023=1;
    S102020=0;
    active[19]=1;
    ends[19]=1;
    tdone[19]=1;
  }

  public void thread117815(int [] tdone, int [] ends){
        S102000=1;
    active[18]=1;
    ends[18]=1;
    tdone[18]=1;
  }

  public void thread117814(int [] tdone, int [] ends){
        S101997=1;
    active[17]=1;
    ends[17]=1;
    tdone[17]=1;
  }

  public void thread117813(int [] tdone, int [] ends){
        S102010=1;
    S102009=0;
    thread117814(tdone,ends);
    thread117815(tdone,ends);
    int biggest117816 = 0;
    if(ends[17]>=biggest117816){
      biggest117816=ends[17];
    }
    if(ends[18]>=biggest117816){
      biggest117816=ends[18];
    }
    if(biggest117816 == 1){
      active[16]=1;
      ends[16]=1;
      tdone[16]=1;
    }
  }

  public void thread117812(int [] tdone, int [] ends){
        S101994=1;
    cylPos5ZAxisExtend.setPresent();//sysj\controller.sysj line: 217, column: 7
    currsigs.addElement(cylPos5ZAxisExtend);
    active[15]=1;
    ends[15]=1;
    tdone[15]=1;
  }

  public void thread117811(int [] tdone, int [] ends){
        S101988=1;
    cylClampBottleExtend.setPresent();//sysj\controller.sysj line: 211, column: 7
    currsigs.addElement(cylClampBottleExtend);
    active[14]=1;
    ends[14]=1;
    tdone[14]=1;
  }

  public void thread117809(int [] tdone, int [] ends){
        S102023=1;
    S102020=0;
    active[19]=1;
    ends[19]=1;
    tdone[19]=1;
  }

  public void thread117807(int [] tdone, int [] ends){
        S102000=1;
    active[18]=1;
    ends[18]=1;
    tdone[18]=1;
  }

  public void thread117806(int [] tdone, int [] ends){
        S101997=1;
    active[17]=1;
    ends[17]=1;
    tdone[17]=1;
  }

  public void thread117805(int [] tdone, int [] ends){
        S102010=1;
    S102009=0;
    thread117806(tdone,ends);
    thread117807(tdone,ends);
    int biggest117808 = 0;
    if(ends[17]>=biggest117808){
      biggest117808=ends[17];
    }
    if(ends[18]>=biggest117808){
      biggest117808=ends[18];
    }
    if(biggest117808 == 1){
      active[16]=1;
      ends[16]=1;
      tdone[16]=1;
    }
  }

  public void thread117804(int [] tdone, int [] ends){
        S101994=1;
    cylPos5ZAxisExtend.setPresent();//sysj\controller.sysj line: 217, column: 7
    currsigs.addElement(cylPos5ZAxisExtend);
    active[15]=1;
    ends[15]=1;
    tdone[15]=1;
  }

  public void thread117803(int [] tdone, int [] ends){
        S101988=1;
    cylClampBottleExtend.setPresent();//sysj\controller.sysj line: 211, column: 7
    currsigs.addElement(cylClampBottleExtend);
    active[14]=1;
    ends[14]=1;
    tdone[14]=1;
  }

  public void thread117801(int [] tdone, int [] ends){
        S102023=1;
    S102020=0;
    active[19]=1;
    ends[19]=1;
    tdone[19]=1;
  }

  public void thread117799(int [] tdone, int [] ends){
        S102000=1;
    active[18]=1;
    ends[18]=1;
    tdone[18]=1;
  }

  public void thread117798(int [] tdone, int [] ends){
        S101997=1;
    active[17]=1;
    ends[17]=1;
    tdone[17]=1;
  }

  public void thread117797(int [] tdone, int [] ends){
        S102010=1;
    S102009=0;
    thread117798(tdone,ends);
    thread117799(tdone,ends);
    int biggest117800 = 0;
    if(ends[17]>=biggest117800){
      biggest117800=ends[17];
    }
    if(ends[18]>=biggest117800){
      biggest117800=ends[18];
    }
    if(biggest117800 == 1){
      active[16]=1;
      ends[16]=1;
      tdone[16]=1;
    }
  }

  public void thread117796(int [] tdone, int [] ends){
        S101994=1;
    cylPos5ZAxisExtend.setPresent();//sysj\controller.sysj line: 217, column: 7
    currsigs.addElement(cylPos5ZAxisExtend);
    active[15]=1;
    ends[15]=1;
    tdone[15]=1;
  }

  public void thread117795(int [] tdone, int [] ends){
        S101988=1;
    cylClampBottleExtend.setPresent();//sysj\controller.sysj line: 211, column: 7
    currsigs.addElement(cylClampBottleExtend);
    active[14]=1;
    ends[14]=1;
    tdone[14]=1;
  }

  public void thread117793(int [] tdone, int [] ends){
        S102023=1;
    S102020=0;
    active[19]=1;
    ends[19]=1;
    tdone[19]=1;
  }

  public void thread117791(int [] tdone, int [] ends){
        S102000=1;
    active[18]=1;
    ends[18]=1;
    tdone[18]=1;
  }

  public void thread117790(int [] tdone, int [] ends){
        S101997=1;
    active[17]=1;
    ends[17]=1;
    tdone[17]=1;
  }

  public void thread117789(int [] tdone, int [] ends){
        S102010=1;
    S102009=0;
    thread117790(tdone,ends);
    thread117791(tdone,ends);
    int biggest117792 = 0;
    if(ends[17]>=biggest117792){
      biggest117792=ends[17];
    }
    if(ends[18]>=biggest117792){
      biggest117792=ends[18];
    }
    if(biggest117792 == 1){
      active[16]=1;
      ends[16]=1;
      tdone[16]=1;
    }
  }

  public void thread117788(int [] tdone, int [] ends){
        S101994=1;
    cylPos5ZAxisExtend.setPresent();//sysj\controller.sysj line: 217, column: 7
    currsigs.addElement(cylPos5ZAxisExtend);
    active[15]=1;
    ends[15]=1;
    tdone[15]=1;
  }

  public void thread117787(int [] tdone, int [] ends){
        S101988=1;
    cylClampBottleExtend.setPresent();//sysj\controller.sysj line: 211, column: 7
    currsigs.addElement(cylClampBottleExtend);
    active[14]=1;
    ends[14]=1;
    tdone[14]=1;
  }

  public void thread117785(int [] tdone, int [] ends){
        S102023=1;
    S102020=0;
    active[19]=1;
    ends[19]=1;
    tdone[19]=1;
  }

  public void thread117783(int [] tdone, int [] ends){
        S102000=1;
    active[18]=1;
    ends[18]=1;
    tdone[18]=1;
  }

  public void thread117782(int [] tdone, int [] ends){
        S101997=1;
    active[17]=1;
    ends[17]=1;
    tdone[17]=1;
  }

  public void thread117781(int [] tdone, int [] ends){
        S102010=1;
    S102009=0;
    thread117782(tdone,ends);
    thread117783(tdone,ends);
    int biggest117784 = 0;
    if(ends[17]>=biggest117784){
      biggest117784=ends[17];
    }
    if(ends[18]>=biggest117784){
      biggest117784=ends[18];
    }
    if(biggest117784 == 1){
      active[16]=1;
      ends[16]=1;
      tdone[16]=1;
    }
  }

  public void thread117780(int [] tdone, int [] ends){
        S101994=1;
    cylPos5ZAxisExtend.setPresent();//sysj\controller.sysj line: 217, column: 7
    currsigs.addElement(cylPos5ZAxisExtend);
    active[15]=1;
    ends[15]=1;
    tdone[15]=1;
  }

  public void thread117779(int [] tdone, int [] ends){
        S101988=1;
    cylClampBottleExtend.setPresent();//sysj\controller.sysj line: 211, column: 7
    currsigs.addElement(cylClampBottleExtend);
    active[14]=1;
    ends[14]=1;
    tdone[14]=1;
  }

  public void thread117777(int [] tdone, int [] ends){
        S102023=1;
    S102020=0;
    active[19]=1;
    ends[19]=1;
    tdone[19]=1;
  }

  public void thread117775(int [] tdone, int [] ends){
        S102000=1;
    active[18]=1;
    ends[18]=1;
    tdone[18]=1;
  }

  public void thread117774(int [] tdone, int [] ends){
        S101997=1;
    active[17]=1;
    ends[17]=1;
    tdone[17]=1;
  }

  public void thread117773(int [] tdone, int [] ends){
        S102010=1;
    S102009=0;
    thread117774(tdone,ends);
    thread117775(tdone,ends);
    int biggest117776 = 0;
    if(ends[17]>=biggest117776){
      biggest117776=ends[17];
    }
    if(ends[18]>=biggest117776){
      biggest117776=ends[18];
    }
    if(biggest117776 == 1){
      active[16]=1;
      ends[16]=1;
      tdone[16]=1;
    }
  }

  public void thread117772(int [] tdone, int [] ends){
        S101994=1;
    cylPos5ZAxisExtend.setPresent();//sysj\controller.sysj line: 217, column: 7
    currsigs.addElement(cylPos5ZAxisExtend);
    active[15]=1;
    ends[15]=1;
    tdone[15]=1;
  }

  public void thread117771(int [] tdone, int [] ends){
        S101988=1;
    cylClampBottleExtend.setPresent();//sysj\controller.sysj line: 211, column: 7
    currsigs.addElement(cylClampBottleExtend);
    active[14]=1;
    ends[14]=1;
    tdone[14]=1;
  }

  public void thread117769(int [] tdone, int [] ends){
        S102023=1;
    S102020=0;
    active[19]=1;
    ends[19]=1;
    tdone[19]=1;
  }

  public void thread117767(int [] tdone, int [] ends){
        S102000=1;
    active[18]=1;
    ends[18]=1;
    tdone[18]=1;
  }

  public void thread117766(int [] tdone, int [] ends){
        S101997=1;
    active[17]=1;
    ends[17]=1;
    tdone[17]=1;
  }

  public void thread117765(int [] tdone, int [] ends){
        S102010=1;
    S102009=0;
    thread117766(tdone,ends);
    thread117767(tdone,ends);
    int biggest117768 = 0;
    if(ends[17]>=biggest117768){
      biggest117768=ends[17];
    }
    if(ends[18]>=biggest117768){
      biggest117768=ends[18];
    }
    if(biggest117768 == 1){
      active[16]=1;
      ends[16]=1;
      tdone[16]=1;
    }
  }

  public void thread117764(int [] tdone, int [] ends){
        S101994=1;
    cylPos5ZAxisExtend.setPresent();//sysj\controller.sysj line: 217, column: 7
    currsigs.addElement(cylPos5ZAxisExtend);
    active[15]=1;
    ends[15]=1;
    tdone[15]=1;
  }

  public void thread117763(int [] tdone, int [] ends){
        S101988=1;
    cylClampBottleExtend.setPresent();//sysj\controller.sysj line: 211, column: 7
    currsigs.addElement(cylClampBottleExtend);
    active[14]=1;
    ends[14]=1;
    tdone[14]=1;
  }

  public void thread117761(int [] tdone, int [] ends){
        S102023=1;
    S102020=0;
    active[19]=1;
    ends[19]=1;
    tdone[19]=1;
  }

  public void thread117759(int [] tdone, int [] ends){
        S102000=1;
    active[18]=1;
    ends[18]=1;
    tdone[18]=1;
  }

  public void thread117758(int [] tdone, int [] ends){
        S101997=1;
    active[17]=1;
    ends[17]=1;
    tdone[17]=1;
  }

  public void thread117757(int [] tdone, int [] ends){
        S102010=1;
    S102009=0;
    thread117758(tdone,ends);
    thread117759(tdone,ends);
    int biggest117760 = 0;
    if(ends[17]>=biggest117760){
      biggest117760=ends[17];
    }
    if(ends[18]>=biggest117760){
      biggest117760=ends[18];
    }
    if(biggest117760 == 1){
      active[16]=1;
      ends[16]=1;
      tdone[16]=1;
    }
  }

  public void thread117756(int [] tdone, int [] ends){
        S101994=1;
    cylPos5ZAxisExtend.setPresent();//sysj\controller.sysj line: 217, column: 7
    currsigs.addElement(cylPos5ZAxisExtend);
    active[15]=1;
    ends[15]=1;
    tdone[15]=1;
  }

  public void thread117755(int [] tdone, int [] ends){
        S101988=1;
    cylClampBottleExtend.setPresent();//sysj\controller.sysj line: 211, column: 7
    currsigs.addElement(cylClampBottleExtend);
    active[14]=1;
    ends[14]=1;
    tdone[14]=1;
  }

  public void thread117753(int [] tdone, int [] ends){
        S102023=1;
    S102020=0;
    active[19]=1;
    ends[19]=1;
    tdone[19]=1;
  }

  public void thread117751(int [] tdone, int [] ends){
        S102000=1;
    active[18]=1;
    ends[18]=1;
    tdone[18]=1;
  }

  public void thread117750(int [] tdone, int [] ends){
        S101997=1;
    active[17]=1;
    ends[17]=1;
    tdone[17]=1;
  }

  public void thread117749(int [] tdone, int [] ends){
        S102010=1;
    S102009=0;
    thread117750(tdone,ends);
    thread117751(tdone,ends);
    int biggest117752 = 0;
    if(ends[17]>=biggest117752){
      biggest117752=ends[17];
    }
    if(ends[18]>=biggest117752){
      biggest117752=ends[18];
    }
    if(biggest117752 == 1){
      active[16]=1;
      ends[16]=1;
      tdone[16]=1;
    }
  }

  public void thread117748(int [] tdone, int [] ends){
        S101994=1;
    cylPos5ZAxisExtend.setPresent();//sysj\controller.sysj line: 217, column: 7
    currsigs.addElement(cylPos5ZAxisExtend);
    active[15]=1;
    ends[15]=1;
    tdone[15]=1;
  }

  public void thread117747(int [] tdone, int [] ends){
        S101988=1;
    cylClampBottleExtend.setPresent();//sysj\controller.sysj line: 211, column: 7
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
      switch(S115283){
        case 0 : 
          S115283=0;
          break RUN;
        
        case 1 : 
          S115283=2;
          S115283=2;
          releaseCap_13.setClear();//sysj\controller.sysj line: 194, column: 2
          untwistGripper_13.setClear();//sysj\controller.sysj line: 194, column: 2
          raiseGripper_13.setClear();//sysj\controller.sysj line: 194, column: 2
          unclampBottle_13.setClear();//sysj\controller.sysj line: 194, column: 2
          S101867=0;
          S101851=0;
          if(!capperReq_in.isPartnerPresent() || capperReq_in.isPartnerPreempted()){//sysj\controller.sysj line: 197, column: 3
            capperReq_in.setACK(false);//sysj\controller.sysj line: 197, column: 3
            S101851=1;
            active[13]=1;
            ends[13]=1;
            break RUN;
          }
          else {
            S101846=0;
            if(!capperReq_in.isREQ()){//sysj\controller.sysj line: 197, column: 3
              capperReq_in.setACK(true);//sysj\controller.sysj line: 197, column: 3
              S101846=1;
              if(capperReq_in.isREQ()){//sysj\controller.sysj line: 197, column: 3
                capperReq_in.setACK(false);//sysj\controller.sysj line: 197, column: 3
                ends[13]=2;
                ;//sysj\controller.sysj line: 197, column: 3
                request_thread_13 = (boolean)(capperReq_in.getVal() == null ? false : ((Boolean)capperReq_in.getVal()).booleanValue());//sysj\controller.sysj line: 198, column: 3
                S101867=1;
                if(request_thread_13){//sysj\controller.sysj line: 200, column: 3
                  S102981=0;
                  S101982=0;
                  S101874=0;
                  if(!capperStatus_o.isPartnerPresent() || capperStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 201, column: 4
                    capperStatus_o.setREQ(false);//sysj\controller.sysj line: 201, column: 4
                    S101874=1;
                    active[13]=1;
                    ends[13]=1;
                    break RUN;
                  }
                  else {
                    S101869=0;
                    if(capperStatus_o.isACK()){//sysj\controller.sysj line: 201, column: 4
                      capperStatus_o.setVal("busy");//sysj\controller.sysj line: 201, column: 4
                      S101869=1;
                      if(!capperStatus_o.isACK()){//sysj\controller.sysj line: 201, column: 4
                        capperStatus_o.setREQ(false);//sysj\controller.sysj line: 201, column: 4
                        ends[13]=2;
                        ;//sysj\controller.sysj line: 201, column: 4
                        S101982=1;
                        if(!bottleAtPos4.getprestatus()){//sysj\controller.sysj line: 203, column: 13
                          S101896=0;
                          if(!capperStatus_o.isPartnerPresent() || capperStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 204, column: 5
                            capperStatus_o.setREQ(false);//sysj\controller.sysj line: 204, column: 5
                            S101896=1;
                            active[13]=1;
                            ends[13]=1;
                            break RUN;
                          }
                          else {
                            S101891=0;
                            if(capperStatus_o.isACK()){//sysj\controller.sysj line: 204, column: 5
                              capperStatus_o.setVal("idle");//sysj\controller.sysj line: 204, column: 5
                              S101891=1;
                              if(!capperStatus_o.isACK()){//sysj\controller.sysj line: 204, column: 5
                                capperStatus_o.setREQ(false);//sysj\controller.sysj line: 204, column: 5
                                ends[13]=2;
                                ;//sysj\controller.sysj line: 204, column: 5
                                S101982=2;
                                if(bottleAtPos4.getprestatus()){//sysj\controller.sysj line: 207, column: 12
                                  System.out.println("Capper doing work...");//sysj\controller.sysj line: 208, column: 5
                                  thread117747(tdone,ends);
                                  thread117748(tdone,ends);
                                  thread117749(tdone,ends);
                                  thread117753(tdone,ends);
                                  int biggest117754 = 0;
                                  if(ends[14]>=biggest117754){
                                    biggest117754=ends[14];
                                  }
                                  if(ends[15]>=biggest117754){
                                    biggest117754=ends[15];
                                  }
                                  if(ends[16]>=biggest117754){
                                    biggest117754=ends[16];
                                  }
                                  if(ends[19]>=biggest117754){
                                    biggest117754=ends[19];
                                  }
                                  if(biggest117754 == 1){
                                    active[13]=1;
                                    ends[13]=1;
                                    break RUN;
                                  }
                                }
                                else {
                                  S101982=3;
                                  S102745=0;
                                  if(!capperStatus_o.isPartnerPresent() || capperStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 245, column: 4
                                    capperStatus_o.setREQ(false);//sysj\controller.sysj line: 245, column: 4
                                    S102745=1;
                                    active[13]=1;
                                    ends[13]=1;
                                    break RUN;
                                  }
                                  else {
                                    S102740=0;
                                    if(capperStatus_o.isACK()){//sysj\controller.sysj line: 245, column: 4
                                      capperStatus_o.setVal("done");//sysj\controller.sysj line: 245, column: 4
                                      S102740=1;
                                      if(!capperStatus_o.isACK()){//sysj\controller.sysj line: 245, column: 4
                                        capperStatus_o.setREQ(false);//sysj\controller.sysj line: 245, column: 4
                                        ends[13]=2;
                                        ;//sysj\controller.sysj line: 245, column: 4
                                        S101867=2;
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
                          S101982=2;
                          if(bottleAtPos4.getprestatus()){//sysj\controller.sysj line: 207, column: 12
                            System.out.println("Capper doing work...");//sysj\controller.sysj line: 208, column: 5
                            thread117755(tdone,ends);
                            thread117756(tdone,ends);
                            thread117757(tdone,ends);
                            thread117761(tdone,ends);
                            int biggest117762 = 0;
                            if(ends[14]>=biggest117762){
                              biggest117762=ends[14];
                            }
                            if(ends[15]>=biggest117762){
                              biggest117762=ends[15];
                            }
                            if(ends[16]>=biggest117762){
                              biggest117762=ends[16];
                            }
                            if(ends[19]>=biggest117762){
                              biggest117762=ends[19];
                            }
                            if(biggest117762 == 1){
                              active[13]=1;
                              ends[13]=1;
                              break RUN;
                            }
                          }
                          else {
                            S101982=3;
                            S102745=0;
                            if(!capperStatus_o.isPartnerPresent() || capperStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 245, column: 4
                              capperStatus_o.setREQ(false);//sysj\controller.sysj line: 245, column: 4
                              S102745=1;
                              active[13]=1;
                              ends[13]=1;
                              break RUN;
                            }
                            else {
                              S102740=0;
                              if(capperStatus_o.isACK()){//sysj\controller.sysj line: 245, column: 4
                                capperStatus_o.setVal("done");//sysj\controller.sysj line: 245, column: 4
                                S102740=1;
                                if(!capperStatus_o.isACK()){//sysj\controller.sysj line: 245, column: 4
                                  capperStatus_o.setREQ(false);//sysj\controller.sysj line: 245, column: 4
                                  ends[13]=2;
                                  ;//sysj\controller.sysj line: 245, column: 4
                                  S101867=2;
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
                  S102981=1;
                  S102965=0;
                  if(!capperStatus_o.isPartnerPresent() || capperStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 247, column: 4
                    capperStatus_o.setREQ(false);//sysj\controller.sysj line: 247, column: 4
                    S102965=1;
                    active[13]=1;
                    ends[13]=1;
                    break RUN;
                  }
                  else {
                    S102960=0;
                    if(capperStatus_o.isACK()){//sysj\controller.sysj line: 247, column: 4
                      capperStatus_o.setVal("idle");//sysj\controller.sysj line: 247, column: 4
                      S102960=1;
                      if(!capperStatus_o.isACK()){//sysj\controller.sysj line: 247, column: 4
                        capperStatus_o.setREQ(false);//sysj\controller.sysj line: 247, column: 4
                        ends[13]=2;
                        ;//sysj\controller.sysj line: 247, column: 4
                        S101867=2;
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
          releaseCap_13.setClear();//sysj\controller.sysj line: 194, column: 2
          untwistGripper_13.setClear();//sysj\controller.sysj line: 194, column: 2
          raiseGripper_13.setClear();//sysj\controller.sysj line: 194, column: 2
          unclampBottle_13.setClear();//sysj\controller.sysj line: 194, column: 2
          switch(S101867){
            case 0 : 
              switch(S101851){
                case 0 : 
                  if(!capperReq_in.isPartnerPresent() || capperReq_in.isPartnerPreempted()){//sysj\controller.sysj line: 197, column: 3
                    capperReq_in.setACK(false);//sysj\controller.sysj line: 197, column: 3
                    S101851=1;
                    active[13]=1;
                    ends[13]=1;
                    break RUN;
                  }
                  else {
                    switch(S101846){
                      case 0 : 
                        if(!capperReq_in.isREQ()){//sysj\controller.sysj line: 197, column: 3
                          capperReq_in.setACK(true);//sysj\controller.sysj line: 197, column: 3
                          S101846=1;
                          if(capperReq_in.isREQ()){//sysj\controller.sysj line: 197, column: 3
                            capperReq_in.setACK(false);//sysj\controller.sysj line: 197, column: 3
                            ends[13]=2;
                            ;//sysj\controller.sysj line: 197, column: 3
                            request_thread_13 = (boolean)(capperReq_in.getVal() == null ? false : ((Boolean)capperReq_in.getVal()).booleanValue());//sysj\controller.sysj line: 198, column: 3
                            S101867=1;
                            if(request_thread_13){//sysj\controller.sysj line: 200, column: 3
                              S102981=0;
                              S101982=0;
                              S101874=0;
                              if(!capperStatus_o.isPartnerPresent() || capperStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 201, column: 4
                                capperStatus_o.setREQ(false);//sysj\controller.sysj line: 201, column: 4
                                S101874=1;
                                active[13]=1;
                                ends[13]=1;
                                break RUN;
                              }
                              else {
                                S101869=0;
                                if(capperStatus_o.isACK()){//sysj\controller.sysj line: 201, column: 4
                                  capperStatus_o.setVal("busy");//sysj\controller.sysj line: 201, column: 4
                                  S101869=1;
                                  if(!capperStatus_o.isACK()){//sysj\controller.sysj line: 201, column: 4
                                    capperStatus_o.setREQ(false);//sysj\controller.sysj line: 201, column: 4
                                    ends[13]=2;
                                    ;//sysj\controller.sysj line: 201, column: 4
                                    S101982=1;
                                    if(!bottleAtPos4.getprestatus()){//sysj\controller.sysj line: 203, column: 13
                                      S101896=0;
                                      if(!capperStatus_o.isPartnerPresent() || capperStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 204, column: 5
                                        capperStatus_o.setREQ(false);//sysj\controller.sysj line: 204, column: 5
                                        S101896=1;
                                        active[13]=1;
                                        ends[13]=1;
                                        break RUN;
                                      }
                                      else {
                                        S101891=0;
                                        if(capperStatus_o.isACK()){//sysj\controller.sysj line: 204, column: 5
                                          capperStatus_o.setVal("idle");//sysj\controller.sysj line: 204, column: 5
                                          S101891=1;
                                          if(!capperStatus_o.isACK()){//sysj\controller.sysj line: 204, column: 5
                                            capperStatus_o.setREQ(false);//sysj\controller.sysj line: 204, column: 5
                                            ends[13]=2;
                                            ;//sysj\controller.sysj line: 204, column: 5
                                            S101982=2;
                                            if(bottleAtPos4.getprestatus()){//sysj\controller.sysj line: 207, column: 12
                                              System.out.println("Capper doing work...");//sysj\controller.sysj line: 208, column: 5
                                              thread117763(tdone,ends);
                                              thread117764(tdone,ends);
                                              thread117765(tdone,ends);
                                              thread117769(tdone,ends);
                                              int biggest117770 = 0;
                                              if(ends[14]>=biggest117770){
                                                biggest117770=ends[14];
                                              }
                                              if(ends[15]>=biggest117770){
                                                biggest117770=ends[15];
                                              }
                                              if(ends[16]>=biggest117770){
                                                biggest117770=ends[16];
                                              }
                                              if(ends[19]>=biggest117770){
                                                biggest117770=ends[19];
                                              }
                                              if(biggest117770 == 1){
                                                active[13]=1;
                                                ends[13]=1;
                                                break RUN;
                                              }
                                            }
                                            else {
                                              S101982=3;
                                              S102745=0;
                                              if(!capperStatus_o.isPartnerPresent() || capperStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 245, column: 4
                                                capperStatus_o.setREQ(false);//sysj\controller.sysj line: 245, column: 4
                                                S102745=1;
                                                active[13]=1;
                                                ends[13]=1;
                                                break RUN;
                                              }
                                              else {
                                                S102740=0;
                                                if(capperStatus_o.isACK()){//sysj\controller.sysj line: 245, column: 4
                                                  capperStatus_o.setVal("done");//sysj\controller.sysj line: 245, column: 4
                                                  S102740=1;
                                                  if(!capperStatus_o.isACK()){//sysj\controller.sysj line: 245, column: 4
                                                    capperStatus_o.setREQ(false);//sysj\controller.sysj line: 245, column: 4
                                                    ends[13]=2;
                                                    ;//sysj\controller.sysj line: 245, column: 4
                                                    S101867=2;
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
                                      S101982=2;
                                      if(bottleAtPos4.getprestatus()){//sysj\controller.sysj line: 207, column: 12
                                        System.out.println("Capper doing work...");//sysj\controller.sysj line: 208, column: 5
                                        thread117771(tdone,ends);
                                        thread117772(tdone,ends);
                                        thread117773(tdone,ends);
                                        thread117777(tdone,ends);
                                        int biggest117778 = 0;
                                        if(ends[14]>=biggest117778){
                                          biggest117778=ends[14];
                                        }
                                        if(ends[15]>=biggest117778){
                                          biggest117778=ends[15];
                                        }
                                        if(ends[16]>=biggest117778){
                                          biggest117778=ends[16];
                                        }
                                        if(ends[19]>=biggest117778){
                                          biggest117778=ends[19];
                                        }
                                        if(biggest117778 == 1){
                                          active[13]=1;
                                          ends[13]=1;
                                          break RUN;
                                        }
                                      }
                                      else {
                                        S101982=3;
                                        S102745=0;
                                        if(!capperStatus_o.isPartnerPresent() || capperStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 245, column: 4
                                          capperStatus_o.setREQ(false);//sysj\controller.sysj line: 245, column: 4
                                          S102745=1;
                                          active[13]=1;
                                          ends[13]=1;
                                          break RUN;
                                        }
                                        else {
                                          S102740=0;
                                          if(capperStatus_o.isACK()){//sysj\controller.sysj line: 245, column: 4
                                            capperStatus_o.setVal("done");//sysj\controller.sysj line: 245, column: 4
                                            S102740=1;
                                            if(!capperStatus_o.isACK()){//sysj\controller.sysj line: 245, column: 4
                                              capperStatus_o.setREQ(false);//sysj\controller.sysj line: 245, column: 4
                                              ends[13]=2;
                                              ;//sysj\controller.sysj line: 245, column: 4
                                              S101867=2;
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
                              S102981=1;
                              S102965=0;
                              if(!capperStatus_o.isPartnerPresent() || capperStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 247, column: 4
                                capperStatus_o.setREQ(false);//sysj\controller.sysj line: 247, column: 4
                                S102965=1;
                                active[13]=1;
                                ends[13]=1;
                                break RUN;
                              }
                              else {
                                S102960=0;
                                if(capperStatus_o.isACK()){//sysj\controller.sysj line: 247, column: 4
                                  capperStatus_o.setVal("idle");//sysj\controller.sysj line: 247, column: 4
                                  S102960=1;
                                  if(!capperStatus_o.isACK()){//sysj\controller.sysj line: 247, column: 4
                                    capperStatus_o.setREQ(false);//sysj\controller.sysj line: 247, column: 4
                                    ends[13]=2;
                                    ;//sysj\controller.sysj line: 247, column: 4
                                    S101867=2;
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
                        if(capperReq_in.isREQ()){//sysj\controller.sysj line: 197, column: 3
                          capperReq_in.setACK(false);//sysj\controller.sysj line: 197, column: 3
                          ends[13]=2;
                          ;//sysj\controller.sysj line: 197, column: 3
                          request_thread_13 = (boolean)(capperReq_in.getVal() == null ? false : ((Boolean)capperReq_in.getVal()).booleanValue());//sysj\controller.sysj line: 198, column: 3
                          S101867=1;
                          if(request_thread_13){//sysj\controller.sysj line: 200, column: 3
                            S102981=0;
                            S101982=0;
                            S101874=0;
                            if(!capperStatus_o.isPartnerPresent() || capperStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 201, column: 4
                              capperStatus_o.setREQ(false);//sysj\controller.sysj line: 201, column: 4
                              S101874=1;
                              active[13]=1;
                              ends[13]=1;
                              break RUN;
                            }
                            else {
                              S101869=0;
                              if(capperStatus_o.isACK()){//sysj\controller.sysj line: 201, column: 4
                                capperStatus_o.setVal("busy");//sysj\controller.sysj line: 201, column: 4
                                S101869=1;
                                if(!capperStatus_o.isACK()){//sysj\controller.sysj line: 201, column: 4
                                  capperStatus_o.setREQ(false);//sysj\controller.sysj line: 201, column: 4
                                  ends[13]=2;
                                  ;//sysj\controller.sysj line: 201, column: 4
                                  S101982=1;
                                  if(!bottleAtPos4.getprestatus()){//sysj\controller.sysj line: 203, column: 13
                                    S101896=0;
                                    if(!capperStatus_o.isPartnerPresent() || capperStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 204, column: 5
                                      capperStatus_o.setREQ(false);//sysj\controller.sysj line: 204, column: 5
                                      S101896=1;
                                      active[13]=1;
                                      ends[13]=1;
                                      break RUN;
                                    }
                                    else {
                                      S101891=0;
                                      if(capperStatus_o.isACK()){//sysj\controller.sysj line: 204, column: 5
                                        capperStatus_o.setVal("idle");//sysj\controller.sysj line: 204, column: 5
                                        S101891=1;
                                        if(!capperStatus_o.isACK()){//sysj\controller.sysj line: 204, column: 5
                                          capperStatus_o.setREQ(false);//sysj\controller.sysj line: 204, column: 5
                                          ends[13]=2;
                                          ;//sysj\controller.sysj line: 204, column: 5
                                          S101982=2;
                                          if(bottleAtPos4.getprestatus()){//sysj\controller.sysj line: 207, column: 12
                                            System.out.println("Capper doing work...");//sysj\controller.sysj line: 208, column: 5
                                            thread117779(tdone,ends);
                                            thread117780(tdone,ends);
                                            thread117781(tdone,ends);
                                            thread117785(tdone,ends);
                                            int biggest117786 = 0;
                                            if(ends[14]>=biggest117786){
                                              biggest117786=ends[14];
                                            }
                                            if(ends[15]>=biggest117786){
                                              biggest117786=ends[15];
                                            }
                                            if(ends[16]>=biggest117786){
                                              biggest117786=ends[16];
                                            }
                                            if(ends[19]>=biggest117786){
                                              biggest117786=ends[19];
                                            }
                                            if(biggest117786 == 1){
                                              active[13]=1;
                                              ends[13]=1;
                                              break RUN;
                                            }
                                          }
                                          else {
                                            S101982=3;
                                            S102745=0;
                                            if(!capperStatus_o.isPartnerPresent() || capperStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 245, column: 4
                                              capperStatus_o.setREQ(false);//sysj\controller.sysj line: 245, column: 4
                                              S102745=1;
                                              active[13]=1;
                                              ends[13]=1;
                                              break RUN;
                                            }
                                            else {
                                              S102740=0;
                                              if(capperStatus_o.isACK()){//sysj\controller.sysj line: 245, column: 4
                                                capperStatus_o.setVal("done");//sysj\controller.sysj line: 245, column: 4
                                                S102740=1;
                                                if(!capperStatus_o.isACK()){//sysj\controller.sysj line: 245, column: 4
                                                  capperStatus_o.setREQ(false);//sysj\controller.sysj line: 245, column: 4
                                                  ends[13]=2;
                                                  ;//sysj\controller.sysj line: 245, column: 4
                                                  S101867=2;
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
                                    S101982=2;
                                    if(bottleAtPos4.getprestatus()){//sysj\controller.sysj line: 207, column: 12
                                      System.out.println("Capper doing work...");//sysj\controller.sysj line: 208, column: 5
                                      thread117787(tdone,ends);
                                      thread117788(tdone,ends);
                                      thread117789(tdone,ends);
                                      thread117793(tdone,ends);
                                      int biggest117794 = 0;
                                      if(ends[14]>=biggest117794){
                                        biggest117794=ends[14];
                                      }
                                      if(ends[15]>=biggest117794){
                                        biggest117794=ends[15];
                                      }
                                      if(ends[16]>=biggest117794){
                                        biggest117794=ends[16];
                                      }
                                      if(ends[19]>=biggest117794){
                                        biggest117794=ends[19];
                                      }
                                      if(biggest117794 == 1){
                                        active[13]=1;
                                        ends[13]=1;
                                        break RUN;
                                      }
                                    }
                                    else {
                                      S101982=3;
                                      S102745=0;
                                      if(!capperStatus_o.isPartnerPresent() || capperStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 245, column: 4
                                        capperStatus_o.setREQ(false);//sysj\controller.sysj line: 245, column: 4
                                        S102745=1;
                                        active[13]=1;
                                        ends[13]=1;
                                        break RUN;
                                      }
                                      else {
                                        S102740=0;
                                        if(capperStatus_o.isACK()){//sysj\controller.sysj line: 245, column: 4
                                          capperStatus_o.setVal("done");//sysj\controller.sysj line: 245, column: 4
                                          S102740=1;
                                          if(!capperStatus_o.isACK()){//sysj\controller.sysj line: 245, column: 4
                                            capperStatus_o.setREQ(false);//sysj\controller.sysj line: 245, column: 4
                                            ends[13]=2;
                                            ;//sysj\controller.sysj line: 245, column: 4
                                            S101867=2;
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
                            S102981=1;
                            S102965=0;
                            if(!capperStatus_o.isPartnerPresent() || capperStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 247, column: 4
                              capperStatus_o.setREQ(false);//sysj\controller.sysj line: 247, column: 4
                              S102965=1;
                              active[13]=1;
                              ends[13]=1;
                              break RUN;
                            }
                            else {
                              S102960=0;
                              if(capperStatus_o.isACK()){//sysj\controller.sysj line: 247, column: 4
                                capperStatus_o.setVal("idle");//sysj\controller.sysj line: 247, column: 4
                                S102960=1;
                                if(!capperStatus_o.isACK()){//sysj\controller.sysj line: 247, column: 4
                                  capperStatus_o.setREQ(false);//sysj\controller.sysj line: 247, column: 4
                                  ends[13]=2;
                                  ;//sysj\controller.sysj line: 247, column: 4
                                  S101867=2;
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
                  S101851=1;
                  S101851=0;
                  if(!capperReq_in.isPartnerPresent() || capperReq_in.isPartnerPreempted()){//sysj\controller.sysj line: 197, column: 3
                    capperReq_in.setACK(false);//sysj\controller.sysj line: 197, column: 3
                    S101851=1;
                    active[13]=1;
                    ends[13]=1;
                    break RUN;
                  }
                  else {
                    S101846=0;
                    if(!capperReq_in.isREQ()){//sysj\controller.sysj line: 197, column: 3
                      capperReq_in.setACK(true);//sysj\controller.sysj line: 197, column: 3
                      S101846=1;
                      if(capperReq_in.isREQ()){//sysj\controller.sysj line: 197, column: 3
                        capperReq_in.setACK(false);//sysj\controller.sysj line: 197, column: 3
                        ends[13]=2;
                        ;//sysj\controller.sysj line: 197, column: 3
                        request_thread_13 = (boolean)(capperReq_in.getVal() == null ? false : ((Boolean)capperReq_in.getVal()).booleanValue());//sysj\controller.sysj line: 198, column: 3
                        S101867=1;
                        if(request_thread_13){//sysj\controller.sysj line: 200, column: 3
                          S102981=0;
                          S101982=0;
                          S101874=0;
                          if(!capperStatus_o.isPartnerPresent() || capperStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 201, column: 4
                            capperStatus_o.setREQ(false);//sysj\controller.sysj line: 201, column: 4
                            S101874=1;
                            active[13]=1;
                            ends[13]=1;
                            break RUN;
                          }
                          else {
                            S101869=0;
                            if(capperStatus_o.isACK()){//sysj\controller.sysj line: 201, column: 4
                              capperStatus_o.setVal("busy");//sysj\controller.sysj line: 201, column: 4
                              S101869=1;
                              if(!capperStatus_o.isACK()){//sysj\controller.sysj line: 201, column: 4
                                capperStatus_o.setREQ(false);//sysj\controller.sysj line: 201, column: 4
                                ends[13]=2;
                                ;//sysj\controller.sysj line: 201, column: 4
                                S101982=1;
                                if(!bottleAtPos4.getprestatus()){//sysj\controller.sysj line: 203, column: 13
                                  S101896=0;
                                  if(!capperStatus_o.isPartnerPresent() || capperStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 204, column: 5
                                    capperStatus_o.setREQ(false);//sysj\controller.sysj line: 204, column: 5
                                    S101896=1;
                                    active[13]=1;
                                    ends[13]=1;
                                    break RUN;
                                  }
                                  else {
                                    S101891=0;
                                    if(capperStatus_o.isACK()){//sysj\controller.sysj line: 204, column: 5
                                      capperStatus_o.setVal("idle");//sysj\controller.sysj line: 204, column: 5
                                      S101891=1;
                                      if(!capperStatus_o.isACK()){//sysj\controller.sysj line: 204, column: 5
                                        capperStatus_o.setREQ(false);//sysj\controller.sysj line: 204, column: 5
                                        ends[13]=2;
                                        ;//sysj\controller.sysj line: 204, column: 5
                                        S101982=2;
                                        if(bottleAtPos4.getprestatus()){//sysj\controller.sysj line: 207, column: 12
                                          System.out.println("Capper doing work...");//sysj\controller.sysj line: 208, column: 5
                                          thread117795(tdone,ends);
                                          thread117796(tdone,ends);
                                          thread117797(tdone,ends);
                                          thread117801(tdone,ends);
                                          int biggest117802 = 0;
                                          if(ends[14]>=biggest117802){
                                            biggest117802=ends[14];
                                          }
                                          if(ends[15]>=biggest117802){
                                            biggest117802=ends[15];
                                          }
                                          if(ends[16]>=biggest117802){
                                            biggest117802=ends[16];
                                          }
                                          if(ends[19]>=biggest117802){
                                            biggest117802=ends[19];
                                          }
                                          if(biggest117802 == 1){
                                            active[13]=1;
                                            ends[13]=1;
                                            break RUN;
                                          }
                                        }
                                        else {
                                          S101982=3;
                                          S102745=0;
                                          if(!capperStatus_o.isPartnerPresent() || capperStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 245, column: 4
                                            capperStatus_o.setREQ(false);//sysj\controller.sysj line: 245, column: 4
                                            S102745=1;
                                            active[13]=1;
                                            ends[13]=1;
                                            break RUN;
                                          }
                                          else {
                                            S102740=0;
                                            if(capperStatus_o.isACK()){//sysj\controller.sysj line: 245, column: 4
                                              capperStatus_o.setVal("done");//sysj\controller.sysj line: 245, column: 4
                                              S102740=1;
                                              if(!capperStatus_o.isACK()){//sysj\controller.sysj line: 245, column: 4
                                                capperStatus_o.setREQ(false);//sysj\controller.sysj line: 245, column: 4
                                                ends[13]=2;
                                                ;//sysj\controller.sysj line: 245, column: 4
                                                S101867=2;
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
                                  S101982=2;
                                  if(bottleAtPos4.getprestatus()){//sysj\controller.sysj line: 207, column: 12
                                    System.out.println("Capper doing work...");//sysj\controller.sysj line: 208, column: 5
                                    thread117803(tdone,ends);
                                    thread117804(tdone,ends);
                                    thread117805(tdone,ends);
                                    thread117809(tdone,ends);
                                    int biggest117810 = 0;
                                    if(ends[14]>=biggest117810){
                                      biggest117810=ends[14];
                                    }
                                    if(ends[15]>=biggest117810){
                                      biggest117810=ends[15];
                                    }
                                    if(ends[16]>=biggest117810){
                                      biggest117810=ends[16];
                                    }
                                    if(ends[19]>=biggest117810){
                                      biggest117810=ends[19];
                                    }
                                    if(biggest117810 == 1){
                                      active[13]=1;
                                      ends[13]=1;
                                      break RUN;
                                    }
                                  }
                                  else {
                                    S101982=3;
                                    S102745=0;
                                    if(!capperStatus_o.isPartnerPresent() || capperStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 245, column: 4
                                      capperStatus_o.setREQ(false);//sysj\controller.sysj line: 245, column: 4
                                      S102745=1;
                                      active[13]=1;
                                      ends[13]=1;
                                      break RUN;
                                    }
                                    else {
                                      S102740=0;
                                      if(capperStatus_o.isACK()){//sysj\controller.sysj line: 245, column: 4
                                        capperStatus_o.setVal("done");//sysj\controller.sysj line: 245, column: 4
                                        S102740=1;
                                        if(!capperStatus_o.isACK()){//sysj\controller.sysj line: 245, column: 4
                                          capperStatus_o.setREQ(false);//sysj\controller.sysj line: 245, column: 4
                                          ends[13]=2;
                                          ;//sysj\controller.sysj line: 245, column: 4
                                          S101867=2;
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
                          S102981=1;
                          S102965=0;
                          if(!capperStatus_o.isPartnerPresent() || capperStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 247, column: 4
                            capperStatus_o.setREQ(false);//sysj\controller.sysj line: 247, column: 4
                            S102965=1;
                            active[13]=1;
                            ends[13]=1;
                            break RUN;
                          }
                          else {
                            S102960=0;
                            if(capperStatus_o.isACK()){//sysj\controller.sysj line: 247, column: 4
                              capperStatus_o.setVal("idle");//sysj\controller.sysj line: 247, column: 4
                              S102960=1;
                              if(!capperStatus_o.isACK()){//sysj\controller.sysj line: 247, column: 4
                                capperStatus_o.setREQ(false);//sysj\controller.sysj line: 247, column: 4
                                ends[13]=2;
                                ;//sysj\controller.sysj line: 247, column: 4
                                S101867=2;
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
              switch(S102981){
                case 0 : 
                  switch(S101982){
                    case 0 : 
                      switch(S101874){
                        case 0 : 
                          if(!capperStatus_o.isPartnerPresent() || capperStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 201, column: 4
                            capperStatus_o.setREQ(false);//sysj\controller.sysj line: 201, column: 4
                            S101874=1;
                            active[13]=1;
                            ends[13]=1;
                            break RUN;
                          }
                          else {
                            switch(S101869){
                              case 0 : 
                                if(capperStatus_o.isACK()){//sysj\controller.sysj line: 201, column: 4
                                  capperStatus_o.setVal("busy");//sysj\controller.sysj line: 201, column: 4
                                  S101869=1;
                                  if(!capperStatus_o.isACK()){//sysj\controller.sysj line: 201, column: 4
                                    capperStatus_o.setREQ(false);//sysj\controller.sysj line: 201, column: 4
                                    ends[13]=2;
                                    ;//sysj\controller.sysj line: 201, column: 4
                                    S101982=1;
                                    if(!bottleAtPos4.getprestatus()){//sysj\controller.sysj line: 203, column: 13
                                      S101896=0;
                                      if(!capperStatus_o.isPartnerPresent() || capperStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 204, column: 5
                                        capperStatus_o.setREQ(false);//sysj\controller.sysj line: 204, column: 5
                                        S101896=1;
                                        active[13]=1;
                                        ends[13]=1;
                                        break RUN;
                                      }
                                      else {
                                        S101891=0;
                                        if(capperStatus_o.isACK()){//sysj\controller.sysj line: 204, column: 5
                                          capperStatus_o.setVal("idle");//sysj\controller.sysj line: 204, column: 5
                                          S101891=1;
                                          if(!capperStatus_o.isACK()){//sysj\controller.sysj line: 204, column: 5
                                            capperStatus_o.setREQ(false);//sysj\controller.sysj line: 204, column: 5
                                            ends[13]=2;
                                            ;//sysj\controller.sysj line: 204, column: 5
                                            S101982=2;
                                            if(bottleAtPos4.getprestatus()){//sysj\controller.sysj line: 207, column: 12
                                              System.out.println("Capper doing work...");//sysj\controller.sysj line: 208, column: 5
                                              thread117811(tdone,ends);
                                              thread117812(tdone,ends);
                                              thread117813(tdone,ends);
                                              thread117817(tdone,ends);
                                              int biggest117818 = 0;
                                              if(ends[14]>=biggest117818){
                                                biggest117818=ends[14];
                                              }
                                              if(ends[15]>=biggest117818){
                                                biggest117818=ends[15];
                                              }
                                              if(ends[16]>=biggest117818){
                                                biggest117818=ends[16];
                                              }
                                              if(ends[19]>=biggest117818){
                                                biggest117818=ends[19];
                                              }
                                              if(biggest117818 == 1){
                                                active[13]=1;
                                                ends[13]=1;
                                                break RUN;
                                              }
                                            }
                                            else {
                                              S101982=3;
                                              S102745=0;
                                              if(!capperStatus_o.isPartnerPresent() || capperStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 245, column: 4
                                                capperStatus_o.setREQ(false);//sysj\controller.sysj line: 245, column: 4
                                                S102745=1;
                                                active[13]=1;
                                                ends[13]=1;
                                                break RUN;
                                              }
                                              else {
                                                S102740=0;
                                                if(capperStatus_o.isACK()){//sysj\controller.sysj line: 245, column: 4
                                                  capperStatus_o.setVal("done");//sysj\controller.sysj line: 245, column: 4
                                                  S102740=1;
                                                  if(!capperStatus_o.isACK()){//sysj\controller.sysj line: 245, column: 4
                                                    capperStatus_o.setREQ(false);//sysj\controller.sysj line: 245, column: 4
                                                    ends[13]=2;
                                                    ;//sysj\controller.sysj line: 245, column: 4
                                                    S101867=2;
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
                                      S101982=2;
                                      if(bottleAtPos4.getprestatus()){//sysj\controller.sysj line: 207, column: 12
                                        System.out.println("Capper doing work...");//sysj\controller.sysj line: 208, column: 5
                                        thread117819(tdone,ends);
                                        thread117820(tdone,ends);
                                        thread117821(tdone,ends);
                                        thread117825(tdone,ends);
                                        int biggest117826 = 0;
                                        if(ends[14]>=biggest117826){
                                          biggest117826=ends[14];
                                        }
                                        if(ends[15]>=biggest117826){
                                          biggest117826=ends[15];
                                        }
                                        if(ends[16]>=biggest117826){
                                          biggest117826=ends[16];
                                        }
                                        if(ends[19]>=biggest117826){
                                          biggest117826=ends[19];
                                        }
                                        if(biggest117826 == 1){
                                          active[13]=1;
                                          ends[13]=1;
                                          break RUN;
                                        }
                                      }
                                      else {
                                        S101982=3;
                                        S102745=0;
                                        if(!capperStatus_o.isPartnerPresent() || capperStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 245, column: 4
                                          capperStatus_o.setREQ(false);//sysj\controller.sysj line: 245, column: 4
                                          S102745=1;
                                          active[13]=1;
                                          ends[13]=1;
                                          break RUN;
                                        }
                                        else {
                                          S102740=0;
                                          if(capperStatus_o.isACK()){//sysj\controller.sysj line: 245, column: 4
                                            capperStatus_o.setVal("done");//sysj\controller.sysj line: 245, column: 4
                                            S102740=1;
                                            if(!capperStatus_o.isACK()){//sysj\controller.sysj line: 245, column: 4
                                              capperStatus_o.setREQ(false);//sysj\controller.sysj line: 245, column: 4
                                              ends[13]=2;
                                              ;//sysj\controller.sysj line: 245, column: 4
                                              S101867=2;
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
                                if(!capperStatus_o.isACK()){//sysj\controller.sysj line: 201, column: 4
                                  capperStatus_o.setREQ(false);//sysj\controller.sysj line: 201, column: 4
                                  ends[13]=2;
                                  ;//sysj\controller.sysj line: 201, column: 4
                                  S101982=1;
                                  if(!bottleAtPos4.getprestatus()){//sysj\controller.sysj line: 203, column: 13
                                    S101896=0;
                                    if(!capperStatus_o.isPartnerPresent() || capperStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 204, column: 5
                                      capperStatus_o.setREQ(false);//sysj\controller.sysj line: 204, column: 5
                                      S101896=1;
                                      active[13]=1;
                                      ends[13]=1;
                                      break RUN;
                                    }
                                    else {
                                      S101891=0;
                                      if(capperStatus_o.isACK()){//sysj\controller.sysj line: 204, column: 5
                                        capperStatus_o.setVal("idle");//sysj\controller.sysj line: 204, column: 5
                                        S101891=1;
                                        if(!capperStatus_o.isACK()){//sysj\controller.sysj line: 204, column: 5
                                          capperStatus_o.setREQ(false);//sysj\controller.sysj line: 204, column: 5
                                          ends[13]=2;
                                          ;//sysj\controller.sysj line: 204, column: 5
                                          S101982=2;
                                          if(bottleAtPos4.getprestatus()){//sysj\controller.sysj line: 207, column: 12
                                            System.out.println("Capper doing work...");//sysj\controller.sysj line: 208, column: 5
                                            thread117827(tdone,ends);
                                            thread117828(tdone,ends);
                                            thread117829(tdone,ends);
                                            thread117833(tdone,ends);
                                            int biggest117834 = 0;
                                            if(ends[14]>=biggest117834){
                                              biggest117834=ends[14];
                                            }
                                            if(ends[15]>=biggest117834){
                                              biggest117834=ends[15];
                                            }
                                            if(ends[16]>=biggest117834){
                                              biggest117834=ends[16];
                                            }
                                            if(ends[19]>=biggest117834){
                                              biggest117834=ends[19];
                                            }
                                            if(biggest117834 == 1){
                                              active[13]=1;
                                              ends[13]=1;
                                              break RUN;
                                            }
                                          }
                                          else {
                                            S101982=3;
                                            S102745=0;
                                            if(!capperStatus_o.isPartnerPresent() || capperStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 245, column: 4
                                              capperStatus_o.setREQ(false);//sysj\controller.sysj line: 245, column: 4
                                              S102745=1;
                                              active[13]=1;
                                              ends[13]=1;
                                              break RUN;
                                            }
                                            else {
                                              S102740=0;
                                              if(capperStatus_o.isACK()){//sysj\controller.sysj line: 245, column: 4
                                                capperStatus_o.setVal("done");//sysj\controller.sysj line: 245, column: 4
                                                S102740=1;
                                                if(!capperStatus_o.isACK()){//sysj\controller.sysj line: 245, column: 4
                                                  capperStatus_o.setREQ(false);//sysj\controller.sysj line: 245, column: 4
                                                  ends[13]=2;
                                                  ;//sysj\controller.sysj line: 245, column: 4
                                                  S101867=2;
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
                                    S101982=2;
                                    if(bottleAtPos4.getprestatus()){//sysj\controller.sysj line: 207, column: 12
                                      System.out.println("Capper doing work...");//sysj\controller.sysj line: 208, column: 5
                                      thread117835(tdone,ends);
                                      thread117836(tdone,ends);
                                      thread117837(tdone,ends);
                                      thread117841(tdone,ends);
                                      int biggest117842 = 0;
                                      if(ends[14]>=biggest117842){
                                        biggest117842=ends[14];
                                      }
                                      if(ends[15]>=biggest117842){
                                        biggest117842=ends[15];
                                      }
                                      if(ends[16]>=biggest117842){
                                        biggest117842=ends[16];
                                      }
                                      if(ends[19]>=biggest117842){
                                        biggest117842=ends[19];
                                      }
                                      if(biggest117842 == 1){
                                        active[13]=1;
                                        ends[13]=1;
                                        break RUN;
                                      }
                                    }
                                    else {
                                      S101982=3;
                                      S102745=0;
                                      if(!capperStatus_o.isPartnerPresent() || capperStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 245, column: 4
                                        capperStatus_o.setREQ(false);//sysj\controller.sysj line: 245, column: 4
                                        S102745=1;
                                        active[13]=1;
                                        ends[13]=1;
                                        break RUN;
                                      }
                                      else {
                                        S102740=0;
                                        if(capperStatus_o.isACK()){//sysj\controller.sysj line: 245, column: 4
                                          capperStatus_o.setVal("done");//sysj\controller.sysj line: 245, column: 4
                                          S102740=1;
                                          if(!capperStatus_o.isACK()){//sysj\controller.sysj line: 245, column: 4
                                            capperStatus_o.setREQ(false);//sysj\controller.sysj line: 245, column: 4
                                            ends[13]=2;
                                            ;//sysj\controller.sysj line: 245, column: 4
                                            S101867=2;
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
                          S101874=1;
                          S101874=0;
                          if(!capperStatus_o.isPartnerPresent() || capperStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 201, column: 4
                            capperStatus_o.setREQ(false);//sysj\controller.sysj line: 201, column: 4
                            S101874=1;
                            active[13]=1;
                            ends[13]=1;
                            break RUN;
                          }
                          else {
                            S101869=0;
                            if(capperStatus_o.isACK()){//sysj\controller.sysj line: 201, column: 4
                              capperStatus_o.setVal("busy");//sysj\controller.sysj line: 201, column: 4
                              S101869=1;
                              if(!capperStatus_o.isACK()){//sysj\controller.sysj line: 201, column: 4
                                capperStatus_o.setREQ(false);//sysj\controller.sysj line: 201, column: 4
                                ends[13]=2;
                                ;//sysj\controller.sysj line: 201, column: 4
                                S101982=1;
                                if(!bottleAtPos4.getprestatus()){//sysj\controller.sysj line: 203, column: 13
                                  S101896=0;
                                  if(!capperStatus_o.isPartnerPresent() || capperStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 204, column: 5
                                    capperStatus_o.setREQ(false);//sysj\controller.sysj line: 204, column: 5
                                    S101896=1;
                                    active[13]=1;
                                    ends[13]=1;
                                    break RUN;
                                  }
                                  else {
                                    S101891=0;
                                    if(capperStatus_o.isACK()){//sysj\controller.sysj line: 204, column: 5
                                      capperStatus_o.setVal("idle");//sysj\controller.sysj line: 204, column: 5
                                      S101891=1;
                                      if(!capperStatus_o.isACK()){//sysj\controller.sysj line: 204, column: 5
                                        capperStatus_o.setREQ(false);//sysj\controller.sysj line: 204, column: 5
                                        ends[13]=2;
                                        ;//sysj\controller.sysj line: 204, column: 5
                                        S101982=2;
                                        if(bottleAtPos4.getprestatus()){//sysj\controller.sysj line: 207, column: 12
                                          System.out.println("Capper doing work...");//sysj\controller.sysj line: 208, column: 5
                                          thread117843(tdone,ends);
                                          thread117844(tdone,ends);
                                          thread117845(tdone,ends);
                                          thread117849(tdone,ends);
                                          int biggest117850 = 0;
                                          if(ends[14]>=biggest117850){
                                            biggest117850=ends[14];
                                          }
                                          if(ends[15]>=biggest117850){
                                            biggest117850=ends[15];
                                          }
                                          if(ends[16]>=biggest117850){
                                            biggest117850=ends[16];
                                          }
                                          if(ends[19]>=biggest117850){
                                            biggest117850=ends[19];
                                          }
                                          if(biggest117850 == 1){
                                            active[13]=1;
                                            ends[13]=1;
                                            break RUN;
                                          }
                                        }
                                        else {
                                          S101982=3;
                                          S102745=0;
                                          if(!capperStatus_o.isPartnerPresent() || capperStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 245, column: 4
                                            capperStatus_o.setREQ(false);//sysj\controller.sysj line: 245, column: 4
                                            S102745=1;
                                            active[13]=1;
                                            ends[13]=1;
                                            break RUN;
                                          }
                                          else {
                                            S102740=0;
                                            if(capperStatus_o.isACK()){//sysj\controller.sysj line: 245, column: 4
                                              capperStatus_o.setVal("done");//sysj\controller.sysj line: 245, column: 4
                                              S102740=1;
                                              if(!capperStatus_o.isACK()){//sysj\controller.sysj line: 245, column: 4
                                                capperStatus_o.setREQ(false);//sysj\controller.sysj line: 245, column: 4
                                                ends[13]=2;
                                                ;//sysj\controller.sysj line: 245, column: 4
                                                S101867=2;
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
                                  S101982=2;
                                  if(bottleAtPos4.getprestatus()){//sysj\controller.sysj line: 207, column: 12
                                    System.out.println("Capper doing work...");//sysj\controller.sysj line: 208, column: 5
                                    thread117851(tdone,ends);
                                    thread117852(tdone,ends);
                                    thread117853(tdone,ends);
                                    thread117857(tdone,ends);
                                    int biggest117858 = 0;
                                    if(ends[14]>=biggest117858){
                                      biggest117858=ends[14];
                                    }
                                    if(ends[15]>=biggest117858){
                                      biggest117858=ends[15];
                                    }
                                    if(ends[16]>=biggest117858){
                                      biggest117858=ends[16];
                                    }
                                    if(ends[19]>=biggest117858){
                                      biggest117858=ends[19];
                                    }
                                    if(biggest117858 == 1){
                                      active[13]=1;
                                      ends[13]=1;
                                      break RUN;
                                    }
                                  }
                                  else {
                                    S101982=3;
                                    S102745=0;
                                    if(!capperStatus_o.isPartnerPresent() || capperStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 245, column: 4
                                      capperStatus_o.setREQ(false);//sysj\controller.sysj line: 245, column: 4
                                      S102745=1;
                                      active[13]=1;
                                      ends[13]=1;
                                      break RUN;
                                    }
                                    else {
                                      S102740=0;
                                      if(capperStatus_o.isACK()){//sysj\controller.sysj line: 245, column: 4
                                        capperStatus_o.setVal("done");//sysj\controller.sysj line: 245, column: 4
                                        S102740=1;
                                        if(!capperStatus_o.isACK()){//sysj\controller.sysj line: 245, column: 4
                                          capperStatus_o.setREQ(false);//sysj\controller.sysj line: 245, column: 4
                                          ends[13]=2;
                                          ;//sysj\controller.sysj line: 245, column: 4
                                          S101867=2;
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
                      switch(S101896){
                        case 0 : 
                          if(!capperStatus_o.isPartnerPresent() || capperStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 204, column: 5
                            capperStatus_o.setREQ(false);//sysj\controller.sysj line: 204, column: 5
                            S101896=1;
                            active[13]=1;
                            ends[13]=1;
                            break RUN;
                          }
                          else {
                            switch(S101891){
                              case 0 : 
                                if(capperStatus_o.isACK()){//sysj\controller.sysj line: 204, column: 5
                                  capperStatus_o.setVal("idle");//sysj\controller.sysj line: 204, column: 5
                                  S101891=1;
                                  if(!capperStatus_o.isACK()){//sysj\controller.sysj line: 204, column: 5
                                    capperStatus_o.setREQ(false);//sysj\controller.sysj line: 204, column: 5
                                    ends[13]=2;
                                    ;//sysj\controller.sysj line: 204, column: 5
                                    S101982=2;
                                    if(bottleAtPos4.getprestatus()){//sysj\controller.sysj line: 207, column: 12
                                      System.out.println("Capper doing work...");//sysj\controller.sysj line: 208, column: 5
                                      thread117859(tdone,ends);
                                      thread117860(tdone,ends);
                                      thread117861(tdone,ends);
                                      thread117865(tdone,ends);
                                      int biggest117866 = 0;
                                      if(ends[14]>=biggest117866){
                                        biggest117866=ends[14];
                                      }
                                      if(ends[15]>=biggest117866){
                                        biggest117866=ends[15];
                                      }
                                      if(ends[16]>=biggest117866){
                                        biggest117866=ends[16];
                                      }
                                      if(ends[19]>=biggest117866){
                                        biggest117866=ends[19];
                                      }
                                      if(biggest117866 == 1){
                                        active[13]=1;
                                        ends[13]=1;
                                        break RUN;
                                      }
                                    }
                                    else {
                                      S101982=3;
                                      S102745=0;
                                      if(!capperStatus_o.isPartnerPresent() || capperStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 245, column: 4
                                        capperStatus_o.setREQ(false);//sysj\controller.sysj line: 245, column: 4
                                        S102745=1;
                                        active[13]=1;
                                        ends[13]=1;
                                        break RUN;
                                      }
                                      else {
                                        S102740=0;
                                        if(capperStatus_o.isACK()){//sysj\controller.sysj line: 245, column: 4
                                          capperStatus_o.setVal("done");//sysj\controller.sysj line: 245, column: 4
                                          S102740=1;
                                          if(!capperStatus_o.isACK()){//sysj\controller.sysj line: 245, column: 4
                                            capperStatus_o.setREQ(false);//sysj\controller.sysj line: 245, column: 4
                                            ends[13]=2;
                                            ;//sysj\controller.sysj line: 245, column: 4
                                            S101867=2;
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
                                if(!capperStatus_o.isACK()){//sysj\controller.sysj line: 204, column: 5
                                  capperStatus_o.setREQ(false);//sysj\controller.sysj line: 204, column: 5
                                  ends[13]=2;
                                  ;//sysj\controller.sysj line: 204, column: 5
                                  S101982=2;
                                  if(bottleAtPos4.getprestatus()){//sysj\controller.sysj line: 207, column: 12
                                    System.out.println("Capper doing work...");//sysj\controller.sysj line: 208, column: 5
                                    thread117867(tdone,ends);
                                    thread117868(tdone,ends);
                                    thread117869(tdone,ends);
                                    thread117873(tdone,ends);
                                    int biggest117874 = 0;
                                    if(ends[14]>=biggest117874){
                                      biggest117874=ends[14];
                                    }
                                    if(ends[15]>=biggest117874){
                                      biggest117874=ends[15];
                                    }
                                    if(ends[16]>=biggest117874){
                                      biggest117874=ends[16];
                                    }
                                    if(ends[19]>=biggest117874){
                                      biggest117874=ends[19];
                                    }
                                    if(biggest117874 == 1){
                                      active[13]=1;
                                      ends[13]=1;
                                      break RUN;
                                    }
                                  }
                                  else {
                                    S101982=3;
                                    S102745=0;
                                    if(!capperStatus_o.isPartnerPresent() || capperStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 245, column: 4
                                      capperStatus_o.setREQ(false);//sysj\controller.sysj line: 245, column: 4
                                      S102745=1;
                                      active[13]=1;
                                      ends[13]=1;
                                      break RUN;
                                    }
                                    else {
                                      S102740=0;
                                      if(capperStatus_o.isACK()){//sysj\controller.sysj line: 245, column: 4
                                        capperStatus_o.setVal("done");//sysj\controller.sysj line: 245, column: 4
                                        S102740=1;
                                        if(!capperStatus_o.isACK()){//sysj\controller.sysj line: 245, column: 4
                                          capperStatus_o.setREQ(false);//sysj\controller.sysj line: 245, column: 4
                                          ends[13]=2;
                                          ;//sysj\controller.sysj line: 245, column: 4
                                          S101867=2;
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
                          S101896=1;
                          S101896=0;
                          if(!capperStatus_o.isPartnerPresent() || capperStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 204, column: 5
                            capperStatus_o.setREQ(false);//sysj\controller.sysj line: 204, column: 5
                            S101896=1;
                            active[13]=1;
                            ends[13]=1;
                            break RUN;
                          }
                          else {
                            S101891=0;
                            if(capperStatus_o.isACK()){//sysj\controller.sysj line: 204, column: 5
                              capperStatus_o.setVal("idle");//sysj\controller.sysj line: 204, column: 5
                              S101891=1;
                              if(!capperStatus_o.isACK()){//sysj\controller.sysj line: 204, column: 5
                                capperStatus_o.setREQ(false);//sysj\controller.sysj line: 204, column: 5
                                ends[13]=2;
                                ;//sysj\controller.sysj line: 204, column: 5
                                S101982=2;
                                if(bottleAtPos4.getprestatus()){//sysj\controller.sysj line: 207, column: 12
                                  System.out.println("Capper doing work...");//sysj\controller.sysj line: 208, column: 5
                                  thread117875(tdone,ends);
                                  thread117876(tdone,ends);
                                  thread117877(tdone,ends);
                                  thread117881(tdone,ends);
                                  int biggest117882 = 0;
                                  if(ends[14]>=biggest117882){
                                    biggest117882=ends[14];
                                  }
                                  if(ends[15]>=biggest117882){
                                    biggest117882=ends[15];
                                  }
                                  if(ends[16]>=biggest117882){
                                    biggest117882=ends[16];
                                  }
                                  if(ends[19]>=biggest117882){
                                    biggest117882=ends[19];
                                  }
                                  if(biggest117882 == 1){
                                    active[13]=1;
                                    ends[13]=1;
                                    break RUN;
                                  }
                                }
                                else {
                                  S101982=3;
                                  S102745=0;
                                  if(!capperStatus_o.isPartnerPresent() || capperStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 245, column: 4
                                    capperStatus_o.setREQ(false);//sysj\controller.sysj line: 245, column: 4
                                    S102745=1;
                                    active[13]=1;
                                    ends[13]=1;
                                    break RUN;
                                  }
                                  else {
                                    S102740=0;
                                    if(capperStatus_o.isACK()){//sysj\controller.sysj line: 245, column: 4
                                      capperStatus_o.setVal("done");//sysj\controller.sysj line: 245, column: 4
                                      S102740=1;
                                      if(!capperStatus_o.isACK()){//sysj\controller.sysj line: 245, column: 4
                                        capperStatus_o.setREQ(false);//sysj\controller.sysj line: 245, column: 4
                                        ends[13]=2;
                                        ;//sysj\controller.sysj line: 245, column: 4
                                        S101867=2;
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
                      thread117883(tdone,ends);
                      thread117884(tdone,ends);
                      thread117885(tdone,ends);
                      thread117889(tdone,ends);
                      int biggest117890 = 0;
                      if(ends[14]>=biggest117890){
                        biggest117890=ends[14];
                      }
                      if(ends[15]>=biggest117890){
                        biggest117890=ends[15];
                      }
                      if(ends[16]>=biggest117890){
                        biggest117890=ends[16];
                      }
                      if(ends[19]>=biggest117890){
                        biggest117890=ends[19];
                      }
                      if(biggest117890 == 1){
                        active[13]=1;
                        ends[13]=1;
                        break RUN;
                      }
                      //FINXME code
                      if(biggest117890 == 0){
                        S101982=3;
                        S102745=0;
                        if(!capperStatus_o.isPartnerPresent() || capperStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 245, column: 4
                          capperStatus_o.setREQ(false);//sysj\controller.sysj line: 245, column: 4
                          S102745=1;
                          active[13]=1;
                          ends[13]=1;
                          break RUN;
                        }
                        else {
                          S102740=0;
                          if(capperStatus_o.isACK()){//sysj\controller.sysj line: 245, column: 4
                            capperStatus_o.setVal("done");//sysj\controller.sysj line: 245, column: 4
                            S102740=1;
                            if(!capperStatus_o.isACK()){//sysj\controller.sysj line: 245, column: 4
                              capperStatus_o.setREQ(false);//sysj\controller.sysj line: 245, column: 4
                              ends[13]=2;
                              ;//sysj\controller.sysj line: 245, column: 4
                              S101867=2;
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
                      switch(S102745){
                        case 0 : 
                          if(!capperStatus_o.isPartnerPresent() || capperStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 245, column: 4
                            capperStatus_o.setREQ(false);//sysj\controller.sysj line: 245, column: 4
                            S102745=1;
                            active[13]=1;
                            ends[13]=1;
                            break RUN;
                          }
                          else {
                            switch(S102740){
                              case 0 : 
                                if(capperStatus_o.isACK()){//sysj\controller.sysj line: 245, column: 4
                                  capperStatus_o.setVal("done");//sysj\controller.sysj line: 245, column: 4
                                  S102740=1;
                                  if(!capperStatus_o.isACK()){//sysj\controller.sysj line: 245, column: 4
                                    capperStatus_o.setREQ(false);//sysj\controller.sysj line: 245, column: 4
                                    ends[13]=2;
                                    ;//sysj\controller.sysj line: 245, column: 4
                                    S101867=2;
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
                                  S101867=2;
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
                          S102745=1;
                          S102745=0;
                          if(!capperStatus_o.isPartnerPresent() || capperStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 245, column: 4
                            capperStatus_o.setREQ(false);//sysj\controller.sysj line: 245, column: 4
                            S102745=1;
                            active[13]=1;
                            ends[13]=1;
                            break RUN;
                          }
                          else {
                            S102740=0;
                            if(capperStatus_o.isACK()){//sysj\controller.sysj line: 245, column: 4
                              capperStatus_o.setVal("done");//sysj\controller.sysj line: 245, column: 4
                              S102740=1;
                              if(!capperStatus_o.isACK()){//sysj\controller.sysj line: 245, column: 4
                                capperStatus_o.setREQ(false);//sysj\controller.sysj line: 245, column: 4
                                ends[13]=2;
                                ;//sysj\controller.sysj line: 245, column: 4
                                S101867=2;
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
                  switch(S102965){
                    case 0 : 
                      if(!capperStatus_o.isPartnerPresent() || capperStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 247, column: 4
                        capperStatus_o.setREQ(false);//sysj\controller.sysj line: 247, column: 4
                        S102965=1;
                        active[13]=1;
                        ends[13]=1;
                        break RUN;
                      }
                      else {
                        switch(S102960){
                          case 0 : 
                            if(capperStatus_o.isACK()){//sysj\controller.sysj line: 247, column: 4
                              capperStatus_o.setVal("idle");//sysj\controller.sysj line: 247, column: 4
                              S102960=1;
                              if(!capperStatus_o.isACK()){//sysj\controller.sysj line: 247, column: 4
                                capperStatus_o.setREQ(false);//sysj\controller.sysj line: 247, column: 4
                                ends[13]=2;
                                ;//sysj\controller.sysj line: 247, column: 4
                                S101867=2;
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
                            if(!capperStatus_o.isACK()){//sysj\controller.sysj line: 247, column: 4
                              capperStatus_o.setREQ(false);//sysj\controller.sysj line: 247, column: 4
                              ends[13]=2;
                              ;//sysj\controller.sysj line: 247, column: 4
                              S101867=2;
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
                      S102965=1;
                      S102965=0;
                      if(!capperStatus_o.isPartnerPresent() || capperStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 247, column: 4
                        capperStatus_o.setREQ(false);//sysj\controller.sysj line: 247, column: 4
                        S102965=1;
                        active[13]=1;
                        ends[13]=1;
                        break RUN;
                      }
                      else {
                        S102960=0;
                        if(capperStatus_o.isACK()){//sysj\controller.sysj line: 247, column: 4
                          capperStatus_o.setVal("idle");//sysj\controller.sysj line: 247, column: 4
                          S102960=1;
                          if(!capperStatus_o.isACK()){//sysj\controller.sysj line: 247, column: 4
                            capperStatus_o.setREQ(false);//sysj\controller.sysj line: 247, column: 4
                            ends[13]=2;
                            ;//sysj\controller.sysj line: 247, column: 4
                            S101867=2;
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
              S101867=2;
              S101867=0;
              S101851=0;
              if(!capperReq_in.isPartnerPresent() || capperReq_in.isPartnerPreempted()){//sysj\controller.sysj line: 197, column: 3
                capperReq_in.setACK(false);//sysj\controller.sysj line: 197, column: 3
                S101851=1;
                active[13]=1;
                ends[13]=1;
                break RUN;
              }
              else {
                S101846=0;
                if(!capperReq_in.isREQ()){//sysj\controller.sysj line: 197, column: 3
                  capperReq_in.setACK(true);//sysj\controller.sysj line: 197, column: 3
                  S101846=1;
                  if(capperReq_in.isREQ()){//sysj\controller.sysj line: 197, column: 3
                    capperReq_in.setACK(false);//sysj\controller.sysj line: 197, column: 3
                    ends[13]=2;
                    ;//sysj\controller.sysj line: 197, column: 3
                    request_thread_13 = (boolean)(capperReq_in.getVal() == null ? false : ((Boolean)capperReq_in.getVal()).booleanValue());//sysj\controller.sysj line: 198, column: 3
                    S101867=1;
                    if(request_thread_13){//sysj\controller.sysj line: 200, column: 3
                      S102981=0;
                      S101982=0;
                      S101874=0;
                      if(!capperStatus_o.isPartnerPresent() || capperStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 201, column: 4
                        capperStatus_o.setREQ(false);//sysj\controller.sysj line: 201, column: 4
                        S101874=1;
                        active[13]=1;
                        ends[13]=1;
                        break RUN;
                      }
                      else {
                        S101869=0;
                        if(capperStatus_o.isACK()){//sysj\controller.sysj line: 201, column: 4
                          capperStatus_o.setVal("busy");//sysj\controller.sysj line: 201, column: 4
                          S101869=1;
                          if(!capperStatus_o.isACK()){//sysj\controller.sysj line: 201, column: 4
                            capperStatus_o.setREQ(false);//sysj\controller.sysj line: 201, column: 4
                            ends[13]=2;
                            ;//sysj\controller.sysj line: 201, column: 4
                            S101982=1;
                            if(!bottleAtPos4.getprestatus()){//sysj\controller.sysj line: 203, column: 13
                              S101896=0;
                              if(!capperStatus_o.isPartnerPresent() || capperStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 204, column: 5
                                capperStatus_o.setREQ(false);//sysj\controller.sysj line: 204, column: 5
                                S101896=1;
                                active[13]=1;
                                ends[13]=1;
                                break RUN;
                              }
                              else {
                                S101891=0;
                                if(capperStatus_o.isACK()){//sysj\controller.sysj line: 204, column: 5
                                  capperStatus_o.setVal("idle");//sysj\controller.sysj line: 204, column: 5
                                  S101891=1;
                                  if(!capperStatus_o.isACK()){//sysj\controller.sysj line: 204, column: 5
                                    capperStatus_o.setREQ(false);//sysj\controller.sysj line: 204, column: 5
                                    ends[13]=2;
                                    ;//sysj\controller.sysj line: 204, column: 5
                                    S101982=2;
                                    if(bottleAtPos4.getprestatus()){//sysj\controller.sysj line: 207, column: 12
                                      System.out.println("Capper doing work...");//sysj\controller.sysj line: 208, column: 5
                                      thread117891(tdone,ends);
                                      thread117892(tdone,ends);
                                      thread117893(tdone,ends);
                                      thread117897(tdone,ends);
                                      int biggest117898 = 0;
                                      if(ends[14]>=biggest117898){
                                        biggest117898=ends[14];
                                      }
                                      if(ends[15]>=biggest117898){
                                        biggest117898=ends[15];
                                      }
                                      if(ends[16]>=biggest117898){
                                        biggest117898=ends[16];
                                      }
                                      if(ends[19]>=biggest117898){
                                        biggest117898=ends[19];
                                      }
                                      if(biggest117898 == 1){
                                        active[13]=1;
                                        ends[13]=1;
                                        break RUN;
                                      }
                                    }
                                    else {
                                      S101982=3;
                                      S102745=0;
                                      if(!capperStatus_o.isPartnerPresent() || capperStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 245, column: 4
                                        capperStatus_o.setREQ(false);//sysj\controller.sysj line: 245, column: 4
                                        S102745=1;
                                        active[13]=1;
                                        ends[13]=1;
                                        break RUN;
                                      }
                                      else {
                                        S102740=0;
                                        if(capperStatus_o.isACK()){//sysj\controller.sysj line: 245, column: 4
                                          capperStatus_o.setVal("done");//sysj\controller.sysj line: 245, column: 4
                                          S102740=1;
                                          if(!capperStatus_o.isACK()){//sysj\controller.sysj line: 245, column: 4
                                            capperStatus_o.setREQ(false);//sysj\controller.sysj line: 245, column: 4
                                            ends[13]=2;
                                            ;//sysj\controller.sysj line: 245, column: 4
                                            S101867=2;
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
                              S101982=2;
                              if(bottleAtPos4.getprestatus()){//sysj\controller.sysj line: 207, column: 12
                                System.out.println("Capper doing work...");//sysj\controller.sysj line: 208, column: 5
                                thread117899(tdone,ends);
                                thread117900(tdone,ends);
                                thread117901(tdone,ends);
                                thread117905(tdone,ends);
                                int biggest117906 = 0;
                                if(ends[14]>=biggest117906){
                                  biggest117906=ends[14];
                                }
                                if(ends[15]>=biggest117906){
                                  biggest117906=ends[15];
                                }
                                if(ends[16]>=biggest117906){
                                  biggest117906=ends[16];
                                }
                                if(ends[19]>=biggest117906){
                                  biggest117906=ends[19];
                                }
                                if(biggest117906 == 1){
                                  active[13]=1;
                                  ends[13]=1;
                                  break RUN;
                                }
                              }
                              else {
                                S101982=3;
                                S102745=0;
                                if(!capperStatus_o.isPartnerPresent() || capperStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 245, column: 4
                                  capperStatus_o.setREQ(false);//sysj\controller.sysj line: 245, column: 4
                                  S102745=1;
                                  active[13]=1;
                                  ends[13]=1;
                                  break RUN;
                                }
                                else {
                                  S102740=0;
                                  if(capperStatus_o.isACK()){//sysj\controller.sysj line: 245, column: 4
                                    capperStatus_o.setVal("done");//sysj\controller.sysj line: 245, column: 4
                                    S102740=1;
                                    if(!capperStatus_o.isACK()){//sysj\controller.sysj line: 245, column: 4
                                      capperStatus_o.setREQ(false);//sysj\controller.sysj line: 245, column: 4
                                      ends[13]=2;
                                      ;//sysj\controller.sysj line: 245, column: 4
                                      S101867=2;
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
                      S102981=1;
                      S102965=0;
                      if(!capperStatus_o.isPartnerPresent() || capperStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 247, column: 4
                        capperStatus_o.setREQ(false);//sysj\controller.sysj line: 247, column: 4
                        S102965=1;
                        active[13]=1;
                        ends[13]=1;
                        break RUN;
                      }
                      else {
                        S102960=0;
                        if(capperStatus_o.isACK()){//sysj\controller.sysj line: 247, column: 4
                          capperStatus_o.setVal("idle");//sysj\controller.sysj line: 247, column: 4
                          S102960=1;
                          if(!capperStatus_o.isACK()){//sysj\controller.sysj line: 247, column: 4
                            capperStatus_o.setREQ(false);//sysj\controller.sysj line: 247, column: 4
                            ends[13]=2;
                            ;//sysj\controller.sysj line: 247, column: 4
                            S101867=2;
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
