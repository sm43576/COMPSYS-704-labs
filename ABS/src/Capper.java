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
  private boolean request_thread_13;//sysj\controller.sysj line: 192, column: 3
  private int S100499 = 1;
  private int S93401 = 1;
  private int S93385 = 1;
  private int S93380 = 1;
  private int S93516 = 1;
  private int S93408 = 1;
  private int S93403 = 1;
  private int S93430 = 1;
  private int S93425 = 1;
  private int S93522 = 1;
  private int S93528 = 1;
  private int S93544 = 1;
  private int S93543 = 1;
  private int S93531 = 1;
  private int S93534 = 1;
  private int S93557 = 1;
  private int S93554 = 1;
  private int S95384 = 1;
  private int S95379 = 1;
  
  private int[] ends = new int[23];
  private int[] tdone = new int[23];
  
  public void thread104825(int [] tdone, int [] ends){
        S93557=1;
    S93554=0;
    active[19]=1;
    ends[19]=1;
    tdone[19]=1;
  }

  public void thread104823(int [] tdone, int [] ends){
        S93534=1;
    active[18]=1;
    ends[18]=1;
    tdone[18]=1;
  }

  public void thread104822(int [] tdone, int [] ends){
        S93531=1;
    active[17]=1;
    ends[17]=1;
    tdone[17]=1;
  }

  public void thread104821(int [] tdone, int [] ends){
        S93544=1;
    S93543=0;
    thread104822(tdone,ends);
    thread104823(tdone,ends);
    int biggest104824 = 0;
    if(ends[17]>=biggest104824){
      biggest104824=ends[17];
    }
    if(ends[18]>=biggest104824){
      biggest104824=ends[18];
    }
    if(biggest104824 == 1){
      active[16]=1;
      ends[16]=1;
      tdone[16]=1;
    }
  }

  public void thread104820(int [] tdone, int [] ends){
        S93528=1;
    cylPos5ZAxisExtend.setPresent();//sysj\controller.sysj line: 211, column: 7
    currsigs.addElement(cylPos5ZAxisExtend);
    active[15]=1;
    ends[15]=1;
    tdone[15]=1;
  }

  public void thread104819(int [] tdone, int [] ends){
        S93522=1;
    cylClampBottleExtend.setPresent();//sysj\controller.sysj line: 205, column: 7
    currsigs.addElement(cylClampBottleExtend);
    active[14]=1;
    ends[14]=1;
    tdone[14]=1;
  }

  public void thread104817(int [] tdone, int [] ends){
        S93557=1;
    S93554=0;
    active[19]=1;
    ends[19]=1;
    tdone[19]=1;
  }

  public void thread104815(int [] tdone, int [] ends){
        S93534=1;
    active[18]=1;
    ends[18]=1;
    tdone[18]=1;
  }

  public void thread104814(int [] tdone, int [] ends){
        S93531=1;
    active[17]=1;
    ends[17]=1;
    tdone[17]=1;
  }

  public void thread104813(int [] tdone, int [] ends){
        S93544=1;
    S93543=0;
    thread104814(tdone,ends);
    thread104815(tdone,ends);
    int biggest104816 = 0;
    if(ends[17]>=biggest104816){
      biggest104816=ends[17];
    }
    if(ends[18]>=biggest104816){
      biggest104816=ends[18];
    }
    if(biggest104816 == 1){
      active[16]=1;
      ends[16]=1;
      tdone[16]=1;
    }
  }

  public void thread104812(int [] tdone, int [] ends){
        S93528=1;
    cylPos5ZAxisExtend.setPresent();//sysj\controller.sysj line: 211, column: 7
    currsigs.addElement(cylPos5ZAxisExtend);
    active[15]=1;
    ends[15]=1;
    tdone[15]=1;
  }

  public void thread104811(int [] tdone, int [] ends){
        S93522=1;
    cylClampBottleExtend.setPresent();//sysj\controller.sysj line: 205, column: 7
    currsigs.addElement(cylClampBottleExtend);
    active[14]=1;
    ends[14]=1;
    tdone[14]=1;
  }

  public void thread104809(int [] tdone, int [] ends){
        switch(S93557){
      case 0 : 
        active[19]=0;
        ends[19]=0;
        tdone[19]=1;
        break;
      
      case 1 : 
        switch(S93554){
          case 0 : 
            if(gripperGrippedCap.getprestatus()){//sysj\controller.sysj line: 224, column: 12
              S93554=1;
              gripperTurnExtend.setPresent();//sysj\controller.sysj line: 227, column: 7
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
            if(gripperTurnFinalPos.getprestatus()){//sysj\controller.sysj line: 226, column: 13
              releaseCap_13.setPresent();//sysj\controller.sysj line: 229, column: 6
              currsigs.addElement(releaseCap_13);
              untwistGripper_13.setPresent();//sysj\controller.sysj line: 232, column: 7
              currsigs.addElement(untwistGripper_13);
              raiseGripper_13.setPresent();//sysj\controller.sysj line: 235, column: 6
              currsigs.addElement(raiseGripper_13);
              unclampBottle_13.setPresent();//sysj\controller.sysj line: 236, column: 6
              currsigs.addElement(unclampBottle_13);
              S93557=0;
              active[19]=0;
              ends[19]=0;
              tdone[19]=1;
            }
            else {
              gripperTurnExtend.setPresent();//sysj\controller.sysj line: 227, column: 7
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

  public void thread104807(int [] tdone, int [] ends){
        switch(S93534){
      case 0 : 
        active[18]=0;
        ends[18]=0;
        tdone[18]=1;
        break;
      
      case 1 : 
        if(cylClampedBottle.getprestatus()){//sysj\controller.sysj line: 217, column: 46
          S93534=0;
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

  public void thread104806(int [] tdone, int [] ends){
        switch(S93531){
      case 0 : 
        active[17]=0;
        ends[17]=0;
        tdone[17]=1;
        break;
      
      case 1 : 
        if(gripperZAxisLowered.getprestatus()){//sysj\controller.sysj line: 217, column: 13
          S93531=0;
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

  public void thread104805(int [] tdone, int [] ends){
        switch(S93544){
      case 0 : 
        active[16]=0;
        ends[16]=0;
        tdone[16]=1;
        break;
      
      case 1 : 
        switch(S93543){
          case 0 : 
            thread104806(tdone,ends);
            thread104807(tdone,ends);
            int biggest104808 = 0;
            if(ends[17]>=biggest104808){
              biggest104808=ends[17];
            }
            if(ends[18]>=biggest104808){
              biggest104808=ends[18];
            }
            if(biggest104808 == 1){
              active[16]=1;
              ends[16]=1;
              tdone[16]=1;
            }
            //FINXME code
            if(biggest104808 == 0){
              S93543=1;
              capGripperPos5Extend.setPresent();//sysj\controller.sysj line: 219, column: 7
              currsigs.addElement(capGripperPos5Extend);
              active[16]=1;
              ends[16]=1;
              tdone[16]=1;
            }
            break;
          
          case 1 : 
            if(releaseCap_13.getprestatus()){//sysj\controller.sysj line: 218, column: 12
              S93544=0;
              active[16]=0;
              ends[16]=0;
              tdone[16]=1;
            }
            else {
              capGripperPos5Extend.setPresent();//sysj\controller.sysj line: 219, column: 7
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

  public void thread104804(int [] tdone, int [] ends){
        switch(S93528){
      case 0 : 
        active[15]=0;
        ends[15]=0;
        tdone[15]=1;
        break;
      
      case 1 : 
        if(raiseGripper_13.getprestatus()){//sysj\controller.sysj line: 210, column: 12
          S93528=0;
          active[15]=0;
          ends[15]=0;
          tdone[15]=1;
        }
        else {
          cylPos5ZAxisExtend.setPresent();//sysj\controller.sysj line: 211, column: 7
          currsigs.addElement(cylPos5ZAxisExtend);
          active[15]=1;
          ends[15]=1;
          tdone[15]=1;
        }
        break;
      
    }
  }

  public void thread104803(int [] tdone, int [] ends){
        switch(S93522){
      case 0 : 
        active[14]=0;
        ends[14]=0;
        tdone[14]=1;
        break;
      
      case 1 : 
        if(unclampBottle_13.getprestatus()){//sysj\controller.sysj line: 204, column: 13
          S93522=0;
          active[14]=0;
          ends[14]=0;
          tdone[14]=1;
        }
        else {
          cylClampBottleExtend.setPresent();//sysj\controller.sysj line: 205, column: 7
          currsigs.addElement(cylClampBottleExtend);
          active[14]=1;
          ends[14]=1;
          tdone[14]=1;
        }
        break;
      
    }
  }

  public void thread104801(int [] tdone, int [] ends){
        S93557=1;
    S93554=0;
    active[19]=1;
    ends[19]=1;
    tdone[19]=1;
  }

  public void thread104799(int [] tdone, int [] ends){
        S93534=1;
    active[18]=1;
    ends[18]=1;
    tdone[18]=1;
  }

  public void thread104798(int [] tdone, int [] ends){
        S93531=1;
    active[17]=1;
    ends[17]=1;
    tdone[17]=1;
  }

  public void thread104797(int [] tdone, int [] ends){
        S93544=1;
    S93543=0;
    thread104798(tdone,ends);
    thread104799(tdone,ends);
    int biggest104800 = 0;
    if(ends[17]>=biggest104800){
      biggest104800=ends[17];
    }
    if(ends[18]>=biggest104800){
      biggest104800=ends[18];
    }
    if(biggest104800 == 1){
      active[16]=1;
      ends[16]=1;
      tdone[16]=1;
    }
  }

  public void thread104796(int [] tdone, int [] ends){
        S93528=1;
    cylPos5ZAxisExtend.setPresent();//sysj\controller.sysj line: 211, column: 7
    currsigs.addElement(cylPos5ZAxisExtend);
    active[15]=1;
    ends[15]=1;
    tdone[15]=1;
  }

  public void thread104795(int [] tdone, int [] ends){
        S93522=1;
    cylClampBottleExtend.setPresent();//sysj\controller.sysj line: 205, column: 7
    currsigs.addElement(cylClampBottleExtend);
    active[14]=1;
    ends[14]=1;
    tdone[14]=1;
  }

  public void thread104793(int [] tdone, int [] ends){
        S93557=1;
    S93554=0;
    active[19]=1;
    ends[19]=1;
    tdone[19]=1;
  }

  public void thread104791(int [] tdone, int [] ends){
        S93534=1;
    active[18]=1;
    ends[18]=1;
    tdone[18]=1;
  }

  public void thread104790(int [] tdone, int [] ends){
        S93531=1;
    active[17]=1;
    ends[17]=1;
    tdone[17]=1;
  }

  public void thread104789(int [] tdone, int [] ends){
        S93544=1;
    S93543=0;
    thread104790(tdone,ends);
    thread104791(tdone,ends);
    int biggest104792 = 0;
    if(ends[17]>=biggest104792){
      biggest104792=ends[17];
    }
    if(ends[18]>=biggest104792){
      biggest104792=ends[18];
    }
    if(biggest104792 == 1){
      active[16]=1;
      ends[16]=1;
      tdone[16]=1;
    }
  }

  public void thread104788(int [] tdone, int [] ends){
        S93528=1;
    cylPos5ZAxisExtend.setPresent();//sysj\controller.sysj line: 211, column: 7
    currsigs.addElement(cylPos5ZAxisExtend);
    active[15]=1;
    ends[15]=1;
    tdone[15]=1;
  }

  public void thread104787(int [] tdone, int [] ends){
        S93522=1;
    cylClampBottleExtend.setPresent();//sysj\controller.sysj line: 205, column: 7
    currsigs.addElement(cylClampBottleExtend);
    active[14]=1;
    ends[14]=1;
    tdone[14]=1;
  }

  public void thread104785(int [] tdone, int [] ends){
        S93557=1;
    S93554=0;
    active[19]=1;
    ends[19]=1;
    tdone[19]=1;
  }

  public void thread104783(int [] tdone, int [] ends){
        S93534=1;
    active[18]=1;
    ends[18]=1;
    tdone[18]=1;
  }

  public void thread104782(int [] tdone, int [] ends){
        S93531=1;
    active[17]=1;
    ends[17]=1;
    tdone[17]=1;
  }

  public void thread104781(int [] tdone, int [] ends){
        S93544=1;
    S93543=0;
    thread104782(tdone,ends);
    thread104783(tdone,ends);
    int biggest104784 = 0;
    if(ends[17]>=biggest104784){
      biggest104784=ends[17];
    }
    if(ends[18]>=biggest104784){
      biggest104784=ends[18];
    }
    if(biggest104784 == 1){
      active[16]=1;
      ends[16]=1;
      tdone[16]=1;
    }
  }

  public void thread104780(int [] tdone, int [] ends){
        S93528=1;
    cylPos5ZAxisExtend.setPresent();//sysj\controller.sysj line: 211, column: 7
    currsigs.addElement(cylPos5ZAxisExtend);
    active[15]=1;
    ends[15]=1;
    tdone[15]=1;
  }

  public void thread104779(int [] tdone, int [] ends){
        S93522=1;
    cylClampBottleExtend.setPresent();//sysj\controller.sysj line: 205, column: 7
    currsigs.addElement(cylClampBottleExtend);
    active[14]=1;
    ends[14]=1;
    tdone[14]=1;
  }

  public void thread104777(int [] tdone, int [] ends){
        S93557=1;
    S93554=0;
    active[19]=1;
    ends[19]=1;
    tdone[19]=1;
  }

  public void thread104775(int [] tdone, int [] ends){
        S93534=1;
    active[18]=1;
    ends[18]=1;
    tdone[18]=1;
  }

  public void thread104774(int [] tdone, int [] ends){
        S93531=1;
    active[17]=1;
    ends[17]=1;
    tdone[17]=1;
  }

  public void thread104773(int [] tdone, int [] ends){
        S93544=1;
    S93543=0;
    thread104774(tdone,ends);
    thread104775(tdone,ends);
    int biggest104776 = 0;
    if(ends[17]>=biggest104776){
      biggest104776=ends[17];
    }
    if(ends[18]>=biggest104776){
      biggest104776=ends[18];
    }
    if(biggest104776 == 1){
      active[16]=1;
      ends[16]=1;
      tdone[16]=1;
    }
  }

  public void thread104772(int [] tdone, int [] ends){
        S93528=1;
    cylPos5ZAxisExtend.setPresent();//sysj\controller.sysj line: 211, column: 7
    currsigs.addElement(cylPos5ZAxisExtend);
    active[15]=1;
    ends[15]=1;
    tdone[15]=1;
  }

  public void thread104771(int [] tdone, int [] ends){
        S93522=1;
    cylClampBottleExtend.setPresent();//sysj\controller.sysj line: 205, column: 7
    currsigs.addElement(cylClampBottleExtend);
    active[14]=1;
    ends[14]=1;
    tdone[14]=1;
  }

  public void thread104769(int [] tdone, int [] ends){
        S93557=1;
    S93554=0;
    active[19]=1;
    ends[19]=1;
    tdone[19]=1;
  }

  public void thread104767(int [] tdone, int [] ends){
        S93534=1;
    active[18]=1;
    ends[18]=1;
    tdone[18]=1;
  }

  public void thread104766(int [] tdone, int [] ends){
        S93531=1;
    active[17]=1;
    ends[17]=1;
    tdone[17]=1;
  }

  public void thread104765(int [] tdone, int [] ends){
        S93544=1;
    S93543=0;
    thread104766(tdone,ends);
    thread104767(tdone,ends);
    int biggest104768 = 0;
    if(ends[17]>=biggest104768){
      biggest104768=ends[17];
    }
    if(ends[18]>=biggest104768){
      biggest104768=ends[18];
    }
    if(biggest104768 == 1){
      active[16]=1;
      ends[16]=1;
      tdone[16]=1;
    }
  }

  public void thread104764(int [] tdone, int [] ends){
        S93528=1;
    cylPos5ZAxisExtend.setPresent();//sysj\controller.sysj line: 211, column: 7
    currsigs.addElement(cylPos5ZAxisExtend);
    active[15]=1;
    ends[15]=1;
    tdone[15]=1;
  }

  public void thread104763(int [] tdone, int [] ends){
        S93522=1;
    cylClampBottleExtend.setPresent();//sysj\controller.sysj line: 205, column: 7
    currsigs.addElement(cylClampBottleExtend);
    active[14]=1;
    ends[14]=1;
    tdone[14]=1;
  }

  public void thread104761(int [] tdone, int [] ends){
        S93557=1;
    S93554=0;
    active[19]=1;
    ends[19]=1;
    tdone[19]=1;
  }

  public void thread104759(int [] tdone, int [] ends){
        S93534=1;
    active[18]=1;
    ends[18]=1;
    tdone[18]=1;
  }

  public void thread104758(int [] tdone, int [] ends){
        S93531=1;
    active[17]=1;
    ends[17]=1;
    tdone[17]=1;
  }

  public void thread104757(int [] tdone, int [] ends){
        S93544=1;
    S93543=0;
    thread104758(tdone,ends);
    thread104759(tdone,ends);
    int biggest104760 = 0;
    if(ends[17]>=biggest104760){
      biggest104760=ends[17];
    }
    if(ends[18]>=biggest104760){
      biggest104760=ends[18];
    }
    if(biggest104760 == 1){
      active[16]=1;
      ends[16]=1;
      tdone[16]=1;
    }
  }

  public void thread104756(int [] tdone, int [] ends){
        S93528=1;
    cylPos5ZAxisExtend.setPresent();//sysj\controller.sysj line: 211, column: 7
    currsigs.addElement(cylPos5ZAxisExtend);
    active[15]=1;
    ends[15]=1;
    tdone[15]=1;
  }

  public void thread104755(int [] tdone, int [] ends){
        S93522=1;
    cylClampBottleExtend.setPresent();//sysj\controller.sysj line: 205, column: 7
    currsigs.addElement(cylClampBottleExtend);
    active[14]=1;
    ends[14]=1;
    tdone[14]=1;
  }

  public void thread104753(int [] tdone, int [] ends){
        S93557=1;
    S93554=0;
    active[19]=1;
    ends[19]=1;
    tdone[19]=1;
  }

  public void thread104751(int [] tdone, int [] ends){
        S93534=1;
    active[18]=1;
    ends[18]=1;
    tdone[18]=1;
  }

  public void thread104750(int [] tdone, int [] ends){
        S93531=1;
    active[17]=1;
    ends[17]=1;
    tdone[17]=1;
  }

  public void thread104749(int [] tdone, int [] ends){
        S93544=1;
    S93543=0;
    thread104750(tdone,ends);
    thread104751(tdone,ends);
    int biggest104752 = 0;
    if(ends[17]>=biggest104752){
      biggest104752=ends[17];
    }
    if(ends[18]>=biggest104752){
      biggest104752=ends[18];
    }
    if(biggest104752 == 1){
      active[16]=1;
      ends[16]=1;
      tdone[16]=1;
    }
  }

  public void thread104748(int [] tdone, int [] ends){
        S93528=1;
    cylPos5ZAxisExtend.setPresent();//sysj\controller.sysj line: 211, column: 7
    currsigs.addElement(cylPos5ZAxisExtend);
    active[15]=1;
    ends[15]=1;
    tdone[15]=1;
  }

  public void thread104747(int [] tdone, int [] ends){
        S93522=1;
    cylClampBottleExtend.setPresent();//sysj\controller.sysj line: 205, column: 7
    currsigs.addElement(cylClampBottleExtend);
    active[14]=1;
    ends[14]=1;
    tdone[14]=1;
  }

  public void thread104745(int [] tdone, int [] ends){
        S93557=1;
    S93554=0;
    active[19]=1;
    ends[19]=1;
    tdone[19]=1;
  }

  public void thread104743(int [] tdone, int [] ends){
        S93534=1;
    active[18]=1;
    ends[18]=1;
    tdone[18]=1;
  }

  public void thread104742(int [] tdone, int [] ends){
        S93531=1;
    active[17]=1;
    ends[17]=1;
    tdone[17]=1;
  }

  public void thread104741(int [] tdone, int [] ends){
        S93544=1;
    S93543=0;
    thread104742(tdone,ends);
    thread104743(tdone,ends);
    int biggest104744 = 0;
    if(ends[17]>=biggest104744){
      biggest104744=ends[17];
    }
    if(ends[18]>=biggest104744){
      biggest104744=ends[18];
    }
    if(biggest104744 == 1){
      active[16]=1;
      ends[16]=1;
      tdone[16]=1;
    }
  }

  public void thread104740(int [] tdone, int [] ends){
        S93528=1;
    cylPos5ZAxisExtend.setPresent();//sysj\controller.sysj line: 211, column: 7
    currsigs.addElement(cylPos5ZAxisExtend);
    active[15]=1;
    ends[15]=1;
    tdone[15]=1;
  }

  public void thread104739(int [] tdone, int [] ends){
        S93522=1;
    cylClampBottleExtend.setPresent();//sysj\controller.sysj line: 205, column: 7
    currsigs.addElement(cylClampBottleExtend);
    active[14]=1;
    ends[14]=1;
    tdone[14]=1;
  }

  public void thread104737(int [] tdone, int [] ends){
        S93557=1;
    S93554=0;
    active[19]=1;
    ends[19]=1;
    tdone[19]=1;
  }

  public void thread104735(int [] tdone, int [] ends){
        S93534=1;
    active[18]=1;
    ends[18]=1;
    tdone[18]=1;
  }

  public void thread104734(int [] tdone, int [] ends){
        S93531=1;
    active[17]=1;
    ends[17]=1;
    tdone[17]=1;
  }

  public void thread104733(int [] tdone, int [] ends){
        S93544=1;
    S93543=0;
    thread104734(tdone,ends);
    thread104735(tdone,ends);
    int biggest104736 = 0;
    if(ends[17]>=biggest104736){
      biggest104736=ends[17];
    }
    if(ends[18]>=biggest104736){
      biggest104736=ends[18];
    }
    if(biggest104736 == 1){
      active[16]=1;
      ends[16]=1;
      tdone[16]=1;
    }
  }

  public void thread104732(int [] tdone, int [] ends){
        S93528=1;
    cylPos5ZAxisExtend.setPresent();//sysj\controller.sysj line: 211, column: 7
    currsigs.addElement(cylPos5ZAxisExtend);
    active[15]=1;
    ends[15]=1;
    tdone[15]=1;
  }

  public void thread104731(int [] tdone, int [] ends){
        S93522=1;
    cylClampBottleExtend.setPresent();//sysj\controller.sysj line: 205, column: 7
    currsigs.addElement(cylClampBottleExtend);
    active[14]=1;
    ends[14]=1;
    tdone[14]=1;
  }

  public void thread104729(int [] tdone, int [] ends){
        S93557=1;
    S93554=0;
    active[19]=1;
    ends[19]=1;
    tdone[19]=1;
  }

  public void thread104727(int [] tdone, int [] ends){
        S93534=1;
    active[18]=1;
    ends[18]=1;
    tdone[18]=1;
  }

  public void thread104726(int [] tdone, int [] ends){
        S93531=1;
    active[17]=1;
    ends[17]=1;
    tdone[17]=1;
  }

  public void thread104725(int [] tdone, int [] ends){
        S93544=1;
    S93543=0;
    thread104726(tdone,ends);
    thread104727(tdone,ends);
    int biggest104728 = 0;
    if(ends[17]>=biggest104728){
      biggest104728=ends[17];
    }
    if(ends[18]>=biggest104728){
      biggest104728=ends[18];
    }
    if(biggest104728 == 1){
      active[16]=1;
      ends[16]=1;
      tdone[16]=1;
    }
  }

  public void thread104724(int [] tdone, int [] ends){
        S93528=1;
    cylPos5ZAxisExtend.setPresent();//sysj\controller.sysj line: 211, column: 7
    currsigs.addElement(cylPos5ZAxisExtend);
    active[15]=1;
    ends[15]=1;
    tdone[15]=1;
  }

  public void thread104723(int [] tdone, int [] ends){
        S93522=1;
    cylClampBottleExtend.setPresent();//sysj\controller.sysj line: 205, column: 7
    currsigs.addElement(cylClampBottleExtend);
    active[14]=1;
    ends[14]=1;
    tdone[14]=1;
  }

  public void thread104721(int [] tdone, int [] ends){
        S93557=1;
    S93554=0;
    active[19]=1;
    ends[19]=1;
    tdone[19]=1;
  }

  public void thread104719(int [] tdone, int [] ends){
        S93534=1;
    active[18]=1;
    ends[18]=1;
    tdone[18]=1;
  }

  public void thread104718(int [] tdone, int [] ends){
        S93531=1;
    active[17]=1;
    ends[17]=1;
    tdone[17]=1;
  }

  public void thread104717(int [] tdone, int [] ends){
        S93544=1;
    S93543=0;
    thread104718(tdone,ends);
    thread104719(tdone,ends);
    int biggest104720 = 0;
    if(ends[17]>=biggest104720){
      biggest104720=ends[17];
    }
    if(ends[18]>=biggest104720){
      biggest104720=ends[18];
    }
    if(biggest104720 == 1){
      active[16]=1;
      ends[16]=1;
      tdone[16]=1;
    }
  }

  public void thread104716(int [] tdone, int [] ends){
        S93528=1;
    cylPos5ZAxisExtend.setPresent();//sysj\controller.sysj line: 211, column: 7
    currsigs.addElement(cylPos5ZAxisExtend);
    active[15]=1;
    ends[15]=1;
    tdone[15]=1;
  }

  public void thread104715(int [] tdone, int [] ends){
        S93522=1;
    cylClampBottleExtend.setPresent();//sysj\controller.sysj line: 205, column: 7
    currsigs.addElement(cylClampBottleExtend);
    active[14]=1;
    ends[14]=1;
    tdone[14]=1;
  }

  public void thread104713(int [] tdone, int [] ends){
        S93557=1;
    S93554=0;
    active[19]=1;
    ends[19]=1;
    tdone[19]=1;
  }

  public void thread104711(int [] tdone, int [] ends){
        S93534=1;
    active[18]=1;
    ends[18]=1;
    tdone[18]=1;
  }

  public void thread104710(int [] tdone, int [] ends){
        S93531=1;
    active[17]=1;
    ends[17]=1;
    tdone[17]=1;
  }

  public void thread104709(int [] tdone, int [] ends){
        S93544=1;
    S93543=0;
    thread104710(tdone,ends);
    thread104711(tdone,ends);
    int biggest104712 = 0;
    if(ends[17]>=biggest104712){
      biggest104712=ends[17];
    }
    if(ends[18]>=biggest104712){
      biggest104712=ends[18];
    }
    if(biggest104712 == 1){
      active[16]=1;
      ends[16]=1;
      tdone[16]=1;
    }
  }

  public void thread104708(int [] tdone, int [] ends){
        S93528=1;
    cylPos5ZAxisExtend.setPresent();//sysj\controller.sysj line: 211, column: 7
    currsigs.addElement(cylPos5ZAxisExtend);
    active[15]=1;
    ends[15]=1;
    tdone[15]=1;
  }

  public void thread104707(int [] tdone, int [] ends){
        S93522=1;
    cylClampBottleExtend.setPresent();//sysj\controller.sysj line: 205, column: 7
    currsigs.addElement(cylClampBottleExtend);
    active[14]=1;
    ends[14]=1;
    tdone[14]=1;
  }

  public void thread104705(int [] tdone, int [] ends){
        S93557=1;
    S93554=0;
    active[19]=1;
    ends[19]=1;
    tdone[19]=1;
  }

  public void thread104703(int [] tdone, int [] ends){
        S93534=1;
    active[18]=1;
    ends[18]=1;
    tdone[18]=1;
  }

  public void thread104702(int [] tdone, int [] ends){
        S93531=1;
    active[17]=1;
    ends[17]=1;
    tdone[17]=1;
  }

  public void thread104701(int [] tdone, int [] ends){
        S93544=1;
    S93543=0;
    thread104702(tdone,ends);
    thread104703(tdone,ends);
    int biggest104704 = 0;
    if(ends[17]>=biggest104704){
      biggest104704=ends[17];
    }
    if(ends[18]>=biggest104704){
      biggest104704=ends[18];
    }
    if(biggest104704 == 1){
      active[16]=1;
      ends[16]=1;
      tdone[16]=1;
    }
  }

  public void thread104700(int [] tdone, int [] ends){
        S93528=1;
    cylPos5ZAxisExtend.setPresent();//sysj\controller.sysj line: 211, column: 7
    currsigs.addElement(cylPos5ZAxisExtend);
    active[15]=1;
    ends[15]=1;
    tdone[15]=1;
  }

  public void thread104699(int [] tdone, int [] ends){
        S93522=1;
    cylClampBottleExtend.setPresent();//sysj\controller.sysj line: 205, column: 7
    currsigs.addElement(cylClampBottleExtend);
    active[14]=1;
    ends[14]=1;
    tdone[14]=1;
  }

  public void thread104697(int [] tdone, int [] ends){
        S93557=1;
    S93554=0;
    active[19]=1;
    ends[19]=1;
    tdone[19]=1;
  }

  public void thread104695(int [] tdone, int [] ends){
        S93534=1;
    active[18]=1;
    ends[18]=1;
    tdone[18]=1;
  }

  public void thread104694(int [] tdone, int [] ends){
        S93531=1;
    active[17]=1;
    ends[17]=1;
    tdone[17]=1;
  }

  public void thread104693(int [] tdone, int [] ends){
        S93544=1;
    S93543=0;
    thread104694(tdone,ends);
    thread104695(tdone,ends);
    int biggest104696 = 0;
    if(ends[17]>=biggest104696){
      biggest104696=ends[17];
    }
    if(ends[18]>=biggest104696){
      biggest104696=ends[18];
    }
    if(biggest104696 == 1){
      active[16]=1;
      ends[16]=1;
      tdone[16]=1;
    }
  }

  public void thread104692(int [] tdone, int [] ends){
        S93528=1;
    cylPos5ZAxisExtend.setPresent();//sysj\controller.sysj line: 211, column: 7
    currsigs.addElement(cylPos5ZAxisExtend);
    active[15]=1;
    ends[15]=1;
    tdone[15]=1;
  }

  public void thread104691(int [] tdone, int [] ends){
        S93522=1;
    cylClampBottleExtend.setPresent();//sysj\controller.sysj line: 205, column: 7
    currsigs.addElement(cylClampBottleExtend);
    active[14]=1;
    ends[14]=1;
    tdone[14]=1;
  }

  public void thread104689(int [] tdone, int [] ends){
        S93557=1;
    S93554=0;
    active[19]=1;
    ends[19]=1;
    tdone[19]=1;
  }

  public void thread104687(int [] tdone, int [] ends){
        S93534=1;
    active[18]=1;
    ends[18]=1;
    tdone[18]=1;
  }

  public void thread104686(int [] tdone, int [] ends){
        S93531=1;
    active[17]=1;
    ends[17]=1;
    tdone[17]=1;
  }

  public void thread104685(int [] tdone, int [] ends){
        S93544=1;
    S93543=0;
    thread104686(tdone,ends);
    thread104687(tdone,ends);
    int biggest104688 = 0;
    if(ends[17]>=biggest104688){
      biggest104688=ends[17];
    }
    if(ends[18]>=biggest104688){
      biggest104688=ends[18];
    }
    if(biggest104688 == 1){
      active[16]=1;
      ends[16]=1;
      tdone[16]=1;
    }
  }

  public void thread104684(int [] tdone, int [] ends){
        S93528=1;
    cylPos5ZAxisExtend.setPresent();//sysj\controller.sysj line: 211, column: 7
    currsigs.addElement(cylPos5ZAxisExtend);
    active[15]=1;
    ends[15]=1;
    tdone[15]=1;
  }

  public void thread104683(int [] tdone, int [] ends){
        S93522=1;
    cylClampBottleExtend.setPresent();//sysj\controller.sysj line: 205, column: 7
    currsigs.addElement(cylClampBottleExtend);
    active[14]=1;
    ends[14]=1;
    tdone[14]=1;
  }

  public void thread104681(int [] tdone, int [] ends){
        S93557=1;
    S93554=0;
    active[19]=1;
    ends[19]=1;
    tdone[19]=1;
  }

  public void thread104679(int [] tdone, int [] ends){
        S93534=1;
    active[18]=1;
    ends[18]=1;
    tdone[18]=1;
  }

  public void thread104678(int [] tdone, int [] ends){
        S93531=1;
    active[17]=1;
    ends[17]=1;
    tdone[17]=1;
  }

  public void thread104677(int [] tdone, int [] ends){
        S93544=1;
    S93543=0;
    thread104678(tdone,ends);
    thread104679(tdone,ends);
    int biggest104680 = 0;
    if(ends[17]>=biggest104680){
      biggest104680=ends[17];
    }
    if(ends[18]>=biggest104680){
      biggest104680=ends[18];
    }
    if(biggest104680 == 1){
      active[16]=1;
      ends[16]=1;
      tdone[16]=1;
    }
  }

  public void thread104676(int [] tdone, int [] ends){
        S93528=1;
    cylPos5ZAxisExtend.setPresent();//sysj\controller.sysj line: 211, column: 7
    currsigs.addElement(cylPos5ZAxisExtend);
    active[15]=1;
    ends[15]=1;
    tdone[15]=1;
  }

  public void thread104675(int [] tdone, int [] ends){
        S93522=1;
    cylClampBottleExtend.setPresent();//sysj\controller.sysj line: 205, column: 7
    currsigs.addElement(cylClampBottleExtend);
    active[14]=1;
    ends[14]=1;
    tdone[14]=1;
  }

  public void thread104673(int [] tdone, int [] ends){
        S93557=1;
    S93554=0;
    active[19]=1;
    ends[19]=1;
    tdone[19]=1;
  }

  public void thread104671(int [] tdone, int [] ends){
        S93534=1;
    active[18]=1;
    ends[18]=1;
    tdone[18]=1;
  }

  public void thread104670(int [] tdone, int [] ends){
        S93531=1;
    active[17]=1;
    ends[17]=1;
    tdone[17]=1;
  }

  public void thread104669(int [] tdone, int [] ends){
        S93544=1;
    S93543=0;
    thread104670(tdone,ends);
    thread104671(tdone,ends);
    int biggest104672 = 0;
    if(ends[17]>=biggest104672){
      biggest104672=ends[17];
    }
    if(ends[18]>=biggest104672){
      biggest104672=ends[18];
    }
    if(biggest104672 == 1){
      active[16]=1;
      ends[16]=1;
      tdone[16]=1;
    }
  }

  public void thread104668(int [] tdone, int [] ends){
        S93528=1;
    cylPos5ZAxisExtend.setPresent();//sysj\controller.sysj line: 211, column: 7
    currsigs.addElement(cylPos5ZAxisExtend);
    active[15]=1;
    ends[15]=1;
    tdone[15]=1;
  }

  public void thread104667(int [] tdone, int [] ends){
        S93522=1;
    cylClampBottleExtend.setPresent();//sysj\controller.sysj line: 205, column: 7
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
      switch(S100499){
        case 0 : 
          S100499=0;
          break RUN;
        
        case 1 : 
          S100499=2;
          S100499=2;
          releaseCap_13.setClear();//sysj\controller.sysj line: 188, column: 2
          untwistGripper_13.setClear();//sysj\controller.sysj line: 188, column: 2
          raiseGripper_13.setClear();//sysj\controller.sysj line: 188, column: 2
          unclampBottle_13.setClear();//sysj\controller.sysj line: 188, column: 2
          S93401=0;
          S93385=0;
          if(!capperReq_in.isPartnerPresent() || capperReq_in.isPartnerPreempted()){//sysj\controller.sysj line: 191, column: 3
            capperReq_in.setACK(false);//sysj\controller.sysj line: 191, column: 3
            S93385=1;
            active[13]=1;
            ends[13]=1;
            break RUN;
          }
          else {
            S93380=0;
            if(!capperReq_in.isREQ()){//sysj\controller.sysj line: 191, column: 3
              capperReq_in.setACK(true);//sysj\controller.sysj line: 191, column: 3
              S93380=1;
              if(capperReq_in.isREQ()){//sysj\controller.sysj line: 191, column: 3
                capperReq_in.setACK(false);//sysj\controller.sysj line: 191, column: 3
                ends[13]=2;
                ;//sysj\controller.sysj line: 191, column: 3
                request_thread_13 = (boolean)(capperReq_in.getVal() == null ? false : ((Boolean)capperReq_in.getVal()).booleanValue());//sysj\controller.sysj line: 192, column: 3
                S93401=1;
                if(request_thread_13){//sysj\controller.sysj line: 194, column: 3
                  S93516=0;
                  S93408=0;
                  if(!capperStatus_o.isPartnerPresent() || capperStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 195, column: 4
                    capperStatus_o.setREQ(false);//sysj\controller.sysj line: 195, column: 4
                    S93408=1;
                    active[13]=1;
                    ends[13]=1;
                    break RUN;
                  }
                  else {
                    S93403=0;
                    if(capperStatus_o.isACK()){//sysj\controller.sysj line: 195, column: 4
                      capperStatus_o.setVal("busy");//sysj\controller.sysj line: 195, column: 4
                      S93403=1;
                      if(!capperStatus_o.isACK()){//sysj\controller.sysj line: 195, column: 4
                        capperStatus_o.setREQ(false);//sysj\controller.sysj line: 195, column: 4
                        ends[13]=2;
                        ;//sysj\controller.sysj line: 195, column: 4
                        S93516=1;
                        if(!bottleAtPos4.getprestatus()){//sysj\controller.sysj line: 197, column: 13
                          S93430=0;
                          if(!capperStatus_o.isPartnerPresent() || capperStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 198, column: 5
                            capperStatus_o.setREQ(false);//sysj\controller.sysj line: 198, column: 5
                            S93430=1;
                            active[13]=1;
                            ends[13]=1;
                            break RUN;
                          }
                          else {
                            S93425=0;
                            if(capperStatus_o.isACK()){//sysj\controller.sysj line: 198, column: 5
                              capperStatus_o.setVal("idle");//sysj\controller.sysj line: 198, column: 5
                              S93425=1;
                              if(!capperStatus_o.isACK()){//sysj\controller.sysj line: 198, column: 5
                                capperStatus_o.setREQ(false);//sysj\controller.sysj line: 198, column: 5
                                ends[13]=2;
                                ;//sysj\controller.sysj line: 198, column: 5
                                S93516=2;
                                if(bottleAtPos4.getprestatus()){//sysj\controller.sysj line: 201, column: 12
                                  thread104667(tdone,ends);
                                  thread104668(tdone,ends);
                                  thread104669(tdone,ends);
                                  thread104673(tdone,ends);
                                  int biggest104674 = 0;
                                  if(ends[14]>=biggest104674){
                                    biggest104674=ends[14];
                                  }
                                  if(ends[15]>=biggest104674){
                                    biggest104674=ends[15];
                                  }
                                  if(ends[16]>=biggest104674){
                                    biggest104674=ends[16];
                                  }
                                  if(ends[19]>=biggest104674){
                                    biggest104674=ends[19];
                                  }
                                  if(biggest104674 == 1){
                                    active[13]=1;
                                    ends[13]=1;
                                    break RUN;
                                  }
                                }
                                else {
                                  S93401=2;
                                  S95384=0;
                                  if(!capperStatus_o.isPartnerPresent() || capperStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 240, column: 3
                                    capperStatus_o.setREQ(false);//sysj\controller.sysj line: 240, column: 3
                                    S95384=1;
                                    active[13]=1;
                                    ends[13]=1;
                                    break RUN;
                                  }
                                  else {
                                    S95379=0;
                                    if(capperStatus_o.isACK()){//sysj\controller.sysj line: 240, column: 3
                                      capperStatus_o.setVal("done");//sysj\controller.sysj line: 240, column: 3
                                      S95379=1;
                                      if(!capperStatus_o.isACK()){//sysj\controller.sysj line: 240, column: 3
                                        capperStatus_o.setREQ(false);//sysj\controller.sysj line: 240, column: 3
                                        ends[13]=2;
                                        ;//sysj\controller.sysj line: 240, column: 3
                                        S93401=3;
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
                          S93516=2;
                          if(bottleAtPos4.getprestatus()){//sysj\controller.sysj line: 201, column: 12
                            thread104675(tdone,ends);
                            thread104676(tdone,ends);
                            thread104677(tdone,ends);
                            thread104681(tdone,ends);
                            int biggest104682 = 0;
                            if(ends[14]>=biggest104682){
                              biggest104682=ends[14];
                            }
                            if(ends[15]>=biggest104682){
                              biggest104682=ends[15];
                            }
                            if(ends[16]>=biggest104682){
                              biggest104682=ends[16];
                            }
                            if(ends[19]>=biggest104682){
                              biggest104682=ends[19];
                            }
                            if(biggest104682 == 1){
                              active[13]=1;
                              ends[13]=1;
                              break RUN;
                            }
                          }
                          else {
                            S93401=2;
                            S95384=0;
                            if(!capperStatus_o.isPartnerPresent() || capperStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 240, column: 3
                              capperStatus_o.setREQ(false);//sysj\controller.sysj line: 240, column: 3
                              S95384=1;
                              active[13]=1;
                              ends[13]=1;
                              break RUN;
                            }
                            else {
                              S95379=0;
                              if(capperStatus_o.isACK()){//sysj\controller.sysj line: 240, column: 3
                                capperStatus_o.setVal("done");//sysj\controller.sysj line: 240, column: 3
                                S95379=1;
                                if(!capperStatus_o.isACK()){//sysj\controller.sysj line: 240, column: 3
                                  capperStatus_o.setREQ(false);//sysj\controller.sysj line: 240, column: 3
                                  ends[13]=2;
                                  ;//sysj\controller.sysj line: 240, column: 3
                                  S93401=3;
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
                  S93401=2;
                  S95384=0;
                  if(!capperStatus_o.isPartnerPresent() || capperStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 240, column: 3
                    capperStatus_o.setREQ(false);//sysj\controller.sysj line: 240, column: 3
                    S95384=1;
                    active[13]=1;
                    ends[13]=1;
                    break RUN;
                  }
                  else {
                    S95379=0;
                    if(capperStatus_o.isACK()){//sysj\controller.sysj line: 240, column: 3
                      capperStatus_o.setVal("done");//sysj\controller.sysj line: 240, column: 3
                      S95379=1;
                      if(!capperStatus_o.isACK()){//sysj\controller.sysj line: 240, column: 3
                        capperStatus_o.setREQ(false);//sysj\controller.sysj line: 240, column: 3
                        ends[13]=2;
                        ;//sysj\controller.sysj line: 240, column: 3
                        S93401=3;
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
          releaseCap_13.setClear();//sysj\controller.sysj line: 188, column: 2
          untwistGripper_13.setClear();//sysj\controller.sysj line: 188, column: 2
          raiseGripper_13.setClear();//sysj\controller.sysj line: 188, column: 2
          unclampBottle_13.setClear();//sysj\controller.sysj line: 188, column: 2
          switch(S93401){
            case 0 : 
              switch(S93385){
                case 0 : 
                  if(!capperReq_in.isPartnerPresent() || capperReq_in.isPartnerPreempted()){//sysj\controller.sysj line: 191, column: 3
                    capperReq_in.setACK(false);//sysj\controller.sysj line: 191, column: 3
                    S93385=1;
                    active[13]=1;
                    ends[13]=1;
                    break RUN;
                  }
                  else {
                    switch(S93380){
                      case 0 : 
                        if(!capperReq_in.isREQ()){//sysj\controller.sysj line: 191, column: 3
                          capperReq_in.setACK(true);//sysj\controller.sysj line: 191, column: 3
                          S93380=1;
                          if(capperReq_in.isREQ()){//sysj\controller.sysj line: 191, column: 3
                            capperReq_in.setACK(false);//sysj\controller.sysj line: 191, column: 3
                            ends[13]=2;
                            ;//sysj\controller.sysj line: 191, column: 3
                            request_thread_13 = (boolean)(capperReq_in.getVal() == null ? false : ((Boolean)capperReq_in.getVal()).booleanValue());//sysj\controller.sysj line: 192, column: 3
                            S93401=1;
                            if(request_thread_13){//sysj\controller.sysj line: 194, column: 3
                              S93516=0;
                              S93408=0;
                              if(!capperStatus_o.isPartnerPresent() || capperStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 195, column: 4
                                capperStatus_o.setREQ(false);//sysj\controller.sysj line: 195, column: 4
                                S93408=1;
                                active[13]=1;
                                ends[13]=1;
                                break RUN;
                              }
                              else {
                                S93403=0;
                                if(capperStatus_o.isACK()){//sysj\controller.sysj line: 195, column: 4
                                  capperStatus_o.setVal("busy");//sysj\controller.sysj line: 195, column: 4
                                  S93403=1;
                                  if(!capperStatus_o.isACK()){//sysj\controller.sysj line: 195, column: 4
                                    capperStatus_o.setREQ(false);//sysj\controller.sysj line: 195, column: 4
                                    ends[13]=2;
                                    ;//sysj\controller.sysj line: 195, column: 4
                                    S93516=1;
                                    if(!bottleAtPos4.getprestatus()){//sysj\controller.sysj line: 197, column: 13
                                      S93430=0;
                                      if(!capperStatus_o.isPartnerPresent() || capperStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 198, column: 5
                                        capperStatus_o.setREQ(false);//sysj\controller.sysj line: 198, column: 5
                                        S93430=1;
                                        active[13]=1;
                                        ends[13]=1;
                                        break RUN;
                                      }
                                      else {
                                        S93425=0;
                                        if(capperStatus_o.isACK()){//sysj\controller.sysj line: 198, column: 5
                                          capperStatus_o.setVal("idle");//sysj\controller.sysj line: 198, column: 5
                                          S93425=1;
                                          if(!capperStatus_o.isACK()){//sysj\controller.sysj line: 198, column: 5
                                            capperStatus_o.setREQ(false);//sysj\controller.sysj line: 198, column: 5
                                            ends[13]=2;
                                            ;//sysj\controller.sysj line: 198, column: 5
                                            S93516=2;
                                            if(bottleAtPos4.getprestatus()){//sysj\controller.sysj line: 201, column: 12
                                              thread104683(tdone,ends);
                                              thread104684(tdone,ends);
                                              thread104685(tdone,ends);
                                              thread104689(tdone,ends);
                                              int biggest104690 = 0;
                                              if(ends[14]>=biggest104690){
                                                biggest104690=ends[14];
                                              }
                                              if(ends[15]>=biggest104690){
                                                biggest104690=ends[15];
                                              }
                                              if(ends[16]>=biggest104690){
                                                biggest104690=ends[16];
                                              }
                                              if(ends[19]>=biggest104690){
                                                biggest104690=ends[19];
                                              }
                                              if(biggest104690 == 1){
                                                active[13]=1;
                                                ends[13]=1;
                                                break RUN;
                                              }
                                            }
                                            else {
                                              S93401=2;
                                              S95384=0;
                                              if(!capperStatus_o.isPartnerPresent() || capperStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 240, column: 3
                                                capperStatus_o.setREQ(false);//sysj\controller.sysj line: 240, column: 3
                                                S95384=1;
                                                active[13]=1;
                                                ends[13]=1;
                                                break RUN;
                                              }
                                              else {
                                                S95379=0;
                                                if(capperStatus_o.isACK()){//sysj\controller.sysj line: 240, column: 3
                                                  capperStatus_o.setVal("done");//sysj\controller.sysj line: 240, column: 3
                                                  S95379=1;
                                                  if(!capperStatus_o.isACK()){//sysj\controller.sysj line: 240, column: 3
                                                    capperStatus_o.setREQ(false);//sysj\controller.sysj line: 240, column: 3
                                                    ends[13]=2;
                                                    ;//sysj\controller.sysj line: 240, column: 3
                                                    S93401=3;
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
                                      S93516=2;
                                      if(bottleAtPos4.getprestatus()){//sysj\controller.sysj line: 201, column: 12
                                        thread104691(tdone,ends);
                                        thread104692(tdone,ends);
                                        thread104693(tdone,ends);
                                        thread104697(tdone,ends);
                                        int biggest104698 = 0;
                                        if(ends[14]>=biggest104698){
                                          biggest104698=ends[14];
                                        }
                                        if(ends[15]>=biggest104698){
                                          biggest104698=ends[15];
                                        }
                                        if(ends[16]>=biggest104698){
                                          biggest104698=ends[16];
                                        }
                                        if(ends[19]>=biggest104698){
                                          biggest104698=ends[19];
                                        }
                                        if(biggest104698 == 1){
                                          active[13]=1;
                                          ends[13]=1;
                                          break RUN;
                                        }
                                      }
                                      else {
                                        S93401=2;
                                        S95384=0;
                                        if(!capperStatus_o.isPartnerPresent() || capperStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 240, column: 3
                                          capperStatus_o.setREQ(false);//sysj\controller.sysj line: 240, column: 3
                                          S95384=1;
                                          active[13]=1;
                                          ends[13]=1;
                                          break RUN;
                                        }
                                        else {
                                          S95379=0;
                                          if(capperStatus_o.isACK()){//sysj\controller.sysj line: 240, column: 3
                                            capperStatus_o.setVal("done");//sysj\controller.sysj line: 240, column: 3
                                            S95379=1;
                                            if(!capperStatus_o.isACK()){//sysj\controller.sysj line: 240, column: 3
                                              capperStatus_o.setREQ(false);//sysj\controller.sysj line: 240, column: 3
                                              ends[13]=2;
                                              ;//sysj\controller.sysj line: 240, column: 3
                                              S93401=3;
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
                              S93401=2;
                              S95384=0;
                              if(!capperStatus_o.isPartnerPresent() || capperStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 240, column: 3
                                capperStatus_o.setREQ(false);//sysj\controller.sysj line: 240, column: 3
                                S95384=1;
                                active[13]=1;
                                ends[13]=1;
                                break RUN;
                              }
                              else {
                                S95379=0;
                                if(capperStatus_o.isACK()){//sysj\controller.sysj line: 240, column: 3
                                  capperStatus_o.setVal("done");//sysj\controller.sysj line: 240, column: 3
                                  S95379=1;
                                  if(!capperStatus_o.isACK()){//sysj\controller.sysj line: 240, column: 3
                                    capperStatus_o.setREQ(false);//sysj\controller.sysj line: 240, column: 3
                                    ends[13]=2;
                                    ;//sysj\controller.sysj line: 240, column: 3
                                    S93401=3;
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
                        if(capperReq_in.isREQ()){//sysj\controller.sysj line: 191, column: 3
                          capperReq_in.setACK(false);//sysj\controller.sysj line: 191, column: 3
                          ends[13]=2;
                          ;//sysj\controller.sysj line: 191, column: 3
                          request_thread_13 = (boolean)(capperReq_in.getVal() == null ? false : ((Boolean)capperReq_in.getVal()).booleanValue());//sysj\controller.sysj line: 192, column: 3
                          S93401=1;
                          if(request_thread_13){//sysj\controller.sysj line: 194, column: 3
                            S93516=0;
                            S93408=0;
                            if(!capperStatus_o.isPartnerPresent() || capperStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 195, column: 4
                              capperStatus_o.setREQ(false);//sysj\controller.sysj line: 195, column: 4
                              S93408=1;
                              active[13]=1;
                              ends[13]=1;
                              break RUN;
                            }
                            else {
                              S93403=0;
                              if(capperStatus_o.isACK()){//sysj\controller.sysj line: 195, column: 4
                                capperStatus_o.setVal("busy");//sysj\controller.sysj line: 195, column: 4
                                S93403=1;
                                if(!capperStatus_o.isACK()){//sysj\controller.sysj line: 195, column: 4
                                  capperStatus_o.setREQ(false);//sysj\controller.sysj line: 195, column: 4
                                  ends[13]=2;
                                  ;//sysj\controller.sysj line: 195, column: 4
                                  S93516=1;
                                  if(!bottleAtPos4.getprestatus()){//sysj\controller.sysj line: 197, column: 13
                                    S93430=0;
                                    if(!capperStatus_o.isPartnerPresent() || capperStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 198, column: 5
                                      capperStatus_o.setREQ(false);//sysj\controller.sysj line: 198, column: 5
                                      S93430=1;
                                      active[13]=1;
                                      ends[13]=1;
                                      break RUN;
                                    }
                                    else {
                                      S93425=0;
                                      if(capperStatus_o.isACK()){//sysj\controller.sysj line: 198, column: 5
                                        capperStatus_o.setVal("idle");//sysj\controller.sysj line: 198, column: 5
                                        S93425=1;
                                        if(!capperStatus_o.isACK()){//sysj\controller.sysj line: 198, column: 5
                                          capperStatus_o.setREQ(false);//sysj\controller.sysj line: 198, column: 5
                                          ends[13]=2;
                                          ;//sysj\controller.sysj line: 198, column: 5
                                          S93516=2;
                                          if(bottleAtPos4.getprestatus()){//sysj\controller.sysj line: 201, column: 12
                                            thread104699(tdone,ends);
                                            thread104700(tdone,ends);
                                            thread104701(tdone,ends);
                                            thread104705(tdone,ends);
                                            int biggest104706 = 0;
                                            if(ends[14]>=biggest104706){
                                              biggest104706=ends[14];
                                            }
                                            if(ends[15]>=biggest104706){
                                              biggest104706=ends[15];
                                            }
                                            if(ends[16]>=biggest104706){
                                              biggest104706=ends[16];
                                            }
                                            if(ends[19]>=biggest104706){
                                              biggest104706=ends[19];
                                            }
                                            if(biggest104706 == 1){
                                              active[13]=1;
                                              ends[13]=1;
                                              break RUN;
                                            }
                                          }
                                          else {
                                            S93401=2;
                                            S95384=0;
                                            if(!capperStatus_o.isPartnerPresent() || capperStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 240, column: 3
                                              capperStatus_o.setREQ(false);//sysj\controller.sysj line: 240, column: 3
                                              S95384=1;
                                              active[13]=1;
                                              ends[13]=1;
                                              break RUN;
                                            }
                                            else {
                                              S95379=0;
                                              if(capperStatus_o.isACK()){//sysj\controller.sysj line: 240, column: 3
                                                capperStatus_o.setVal("done");//sysj\controller.sysj line: 240, column: 3
                                                S95379=1;
                                                if(!capperStatus_o.isACK()){//sysj\controller.sysj line: 240, column: 3
                                                  capperStatus_o.setREQ(false);//sysj\controller.sysj line: 240, column: 3
                                                  ends[13]=2;
                                                  ;//sysj\controller.sysj line: 240, column: 3
                                                  S93401=3;
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
                                    S93516=2;
                                    if(bottleAtPos4.getprestatus()){//sysj\controller.sysj line: 201, column: 12
                                      thread104707(tdone,ends);
                                      thread104708(tdone,ends);
                                      thread104709(tdone,ends);
                                      thread104713(tdone,ends);
                                      int biggest104714 = 0;
                                      if(ends[14]>=biggest104714){
                                        biggest104714=ends[14];
                                      }
                                      if(ends[15]>=biggest104714){
                                        biggest104714=ends[15];
                                      }
                                      if(ends[16]>=biggest104714){
                                        biggest104714=ends[16];
                                      }
                                      if(ends[19]>=biggest104714){
                                        biggest104714=ends[19];
                                      }
                                      if(biggest104714 == 1){
                                        active[13]=1;
                                        ends[13]=1;
                                        break RUN;
                                      }
                                    }
                                    else {
                                      S93401=2;
                                      S95384=0;
                                      if(!capperStatus_o.isPartnerPresent() || capperStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 240, column: 3
                                        capperStatus_o.setREQ(false);//sysj\controller.sysj line: 240, column: 3
                                        S95384=1;
                                        active[13]=1;
                                        ends[13]=1;
                                        break RUN;
                                      }
                                      else {
                                        S95379=0;
                                        if(capperStatus_o.isACK()){//sysj\controller.sysj line: 240, column: 3
                                          capperStatus_o.setVal("done");//sysj\controller.sysj line: 240, column: 3
                                          S95379=1;
                                          if(!capperStatus_o.isACK()){//sysj\controller.sysj line: 240, column: 3
                                            capperStatus_o.setREQ(false);//sysj\controller.sysj line: 240, column: 3
                                            ends[13]=2;
                                            ;//sysj\controller.sysj line: 240, column: 3
                                            S93401=3;
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
                            S93401=2;
                            S95384=0;
                            if(!capperStatus_o.isPartnerPresent() || capperStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 240, column: 3
                              capperStatus_o.setREQ(false);//sysj\controller.sysj line: 240, column: 3
                              S95384=1;
                              active[13]=1;
                              ends[13]=1;
                              break RUN;
                            }
                            else {
                              S95379=0;
                              if(capperStatus_o.isACK()){//sysj\controller.sysj line: 240, column: 3
                                capperStatus_o.setVal("done");//sysj\controller.sysj line: 240, column: 3
                                S95379=1;
                                if(!capperStatus_o.isACK()){//sysj\controller.sysj line: 240, column: 3
                                  capperStatus_o.setREQ(false);//sysj\controller.sysj line: 240, column: 3
                                  ends[13]=2;
                                  ;//sysj\controller.sysj line: 240, column: 3
                                  S93401=3;
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
                  S93385=1;
                  S93385=0;
                  if(!capperReq_in.isPartnerPresent() || capperReq_in.isPartnerPreempted()){//sysj\controller.sysj line: 191, column: 3
                    capperReq_in.setACK(false);//sysj\controller.sysj line: 191, column: 3
                    S93385=1;
                    active[13]=1;
                    ends[13]=1;
                    break RUN;
                  }
                  else {
                    S93380=0;
                    if(!capperReq_in.isREQ()){//sysj\controller.sysj line: 191, column: 3
                      capperReq_in.setACK(true);//sysj\controller.sysj line: 191, column: 3
                      S93380=1;
                      if(capperReq_in.isREQ()){//sysj\controller.sysj line: 191, column: 3
                        capperReq_in.setACK(false);//sysj\controller.sysj line: 191, column: 3
                        ends[13]=2;
                        ;//sysj\controller.sysj line: 191, column: 3
                        request_thread_13 = (boolean)(capperReq_in.getVal() == null ? false : ((Boolean)capperReq_in.getVal()).booleanValue());//sysj\controller.sysj line: 192, column: 3
                        S93401=1;
                        if(request_thread_13){//sysj\controller.sysj line: 194, column: 3
                          S93516=0;
                          S93408=0;
                          if(!capperStatus_o.isPartnerPresent() || capperStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 195, column: 4
                            capperStatus_o.setREQ(false);//sysj\controller.sysj line: 195, column: 4
                            S93408=1;
                            active[13]=1;
                            ends[13]=1;
                            break RUN;
                          }
                          else {
                            S93403=0;
                            if(capperStatus_o.isACK()){//sysj\controller.sysj line: 195, column: 4
                              capperStatus_o.setVal("busy");//sysj\controller.sysj line: 195, column: 4
                              S93403=1;
                              if(!capperStatus_o.isACK()){//sysj\controller.sysj line: 195, column: 4
                                capperStatus_o.setREQ(false);//sysj\controller.sysj line: 195, column: 4
                                ends[13]=2;
                                ;//sysj\controller.sysj line: 195, column: 4
                                S93516=1;
                                if(!bottleAtPos4.getprestatus()){//sysj\controller.sysj line: 197, column: 13
                                  S93430=0;
                                  if(!capperStatus_o.isPartnerPresent() || capperStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 198, column: 5
                                    capperStatus_o.setREQ(false);//sysj\controller.sysj line: 198, column: 5
                                    S93430=1;
                                    active[13]=1;
                                    ends[13]=1;
                                    break RUN;
                                  }
                                  else {
                                    S93425=0;
                                    if(capperStatus_o.isACK()){//sysj\controller.sysj line: 198, column: 5
                                      capperStatus_o.setVal("idle");//sysj\controller.sysj line: 198, column: 5
                                      S93425=1;
                                      if(!capperStatus_o.isACK()){//sysj\controller.sysj line: 198, column: 5
                                        capperStatus_o.setREQ(false);//sysj\controller.sysj line: 198, column: 5
                                        ends[13]=2;
                                        ;//sysj\controller.sysj line: 198, column: 5
                                        S93516=2;
                                        if(bottleAtPos4.getprestatus()){//sysj\controller.sysj line: 201, column: 12
                                          thread104715(tdone,ends);
                                          thread104716(tdone,ends);
                                          thread104717(tdone,ends);
                                          thread104721(tdone,ends);
                                          int biggest104722 = 0;
                                          if(ends[14]>=biggest104722){
                                            biggest104722=ends[14];
                                          }
                                          if(ends[15]>=biggest104722){
                                            biggest104722=ends[15];
                                          }
                                          if(ends[16]>=biggest104722){
                                            biggest104722=ends[16];
                                          }
                                          if(ends[19]>=biggest104722){
                                            biggest104722=ends[19];
                                          }
                                          if(biggest104722 == 1){
                                            active[13]=1;
                                            ends[13]=1;
                                            break RUN;
                                          }
                                        }
                                        else {
                                          S93401=2;
                                          S95384=0;
                                          if(!capperStatus_o.isPartnerPresent() || capperStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 240, column: 3
                                            capperStatus_o.setREQ(false);//sysj\controller.sysj line: 240, column: 3
                                            S95384=1;
                                            active[13]=1;
                                            ends[13]=1;
                                            break RUN;
                                          }
                                          else {
                                            S95379=0;
                                            if(capperStatus_o.isACK()){//sysj\controller.sysj line: 240, column: 3
                                              capperStatus_o.setVal("done");//sysj\controller.sysj line: 240, column: 3
                                              S95379=1;
                                              if(!capperStatus_o.isACK()){//sysj\controller.sysj line: 240, column: 3
                                                capperStatus_o.setREQ(false);//sysj\controller.sysj line: 240, column: 3
                                                ends[13]=2;
                                                ;//sysj\controller.sysj line: 240, column: 3
                                                S93401=3;
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
                                  S93516=2;
                                  if(bottleAtPos4.getprestatus()){//sysj\controller.sysj line: 201, column: 12
                                    thread104723(tdone,ends);
                                    thread104724(tdone,ends);
                                    thread104725(tdone,ends);
                                    thread104729(tdone,ends);
                                    int biggest104730 = 0;
                                    if(ends[14]>=biggest104730){
                                      biggest104730=ends[14];
                                    }
                                    if(ends[15]>=biggest104730){
                                      biggest104730=ends[15];
                                    }
                                    if(ends[16]>=biggest104730){
                                      biggest104730=ends[16];
                                    }
                                    if(ends[19]>=biggest104730){
                                      biggest104730=ends[19];
                                    }
                                    if(biggest104730 == 1){
                                      active[13]=1;
                                      ends[13]=1;
                                      break RUN;
                                    }
                                  }
                                  else {
                                    S93401=2;
                                    S95384=0;
                                    if(!capperStatus_o.isPartnerPresent() || capperStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 240, column: 3
                                      capperStatus_o.setREQ(false);//sysj\controller.sysj line: 240, column: 3
                                      S95384=1;
                                      active[13]=1;
                                      ends[13]=1;
                                      break RUN;
                                    }
                                    else {
                                      S95379=0;
                                      if(capperStatus_o.isACK()){//sysj\controller.sysj line: 240, column: 3
                                        capperStatus_o.setVal("done");//sysj\controller.sysj line: 240, column: 3
                                        S95379=1;
                                        if(!capperStatus_o.isACK()){//sysj\controller.sysj line: 240, column: 3
                                          capperStatus_o.setREQ(false);//sysj\controller.sysj line: 240, column: 3
                                          ends[13]=2;
                                          ;//sysj\controller.sysj line: 240, column: 3
                                          S93401=3;
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
                          S93401=2;
                          S95384=0;
                          if(!capperStatus_o.isPartnerPresent() || capperStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 240, column: 3
                            capperStatus_o.setREQ(false);//sysj\controller.sysj line: 240, column: 3
                            S95384=1;
                            active[13]=1;
                            ends[13]=1;
                            break RUN;
                          }
                          else {
                            S95379=0;
                            if(capperStatus_o.isACK()){//sysj\controller.sysj line: 240, column: 3
                              capperStatus_o.setVal("done");//sysj\controller.sysj line: 240, column: 3
                              S95379=1;
                              if(!capperStatus_o.isACK()){//sysj\controller.sysj line: 240, column: 3
                                capperStatus_o.setREQ(false);//sysj\controller.sysj line: 240, column: 3
                                ends[13]=2;
                                ;//sysj\controller.sysj line: 240, column: 3
                                S93401=3;
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
              switch(S93516){
                case 0 : 
                  switch(S93408){
                    case 0 : 
                      if(!capperStatus_o.isPartnerPresent() || capperStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 195, column: 4
                        capperStatus_o.setREQ(false);//sysj\controller.sysj line: 195, column: 4
                        S93408=1;
                        active[13]=1;
                        ends[13]=1;
                        break RUN;
                      }
                      else {
                        switch(S93403){
                          case 0 : 
                            if(capperStatus_o.isACK()){//sysj\controller.sysj line: 195, column: 4
                              capperStatus_o.setVal("busy");//sysj\controller.sysj line: 195, column: 4
                              S93403=1;
                              if(!capperStatus_o.isACK()){//sysj\controller.sysj line: 195, column: 4
                                capperStatus_o.setREQ(false);//sysj\controller.sysj line: 195, column: 4
                                ends[13]=2;
                                ;//sysj\controller.sysj line: 195, column: 4
                                S93516=1;
                                if(!bottleAtPos4.getprestatus()){//sysj\controller.sysj line: 197, column: 13
                                  S93430=0;
                                  if(!capperStatus_o.isPartnerPresent() || capperStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 198, column: 5
                                    capperStatus_o.setREQ(false);//sysj\controller.sysj line: 198, column: 5
                                    S93430=1;
                                    active[13]=1;
                                    ends[13]=1;
                                    break RUN;
                                  }
                                  else {
                                    S93425=0;
                                    if(capperStatus_o.isACK()){//sysj\controller.sysj line: 198, column: 5
                                      capperStatus_o.setVal("idle");//sysj\controller.sysj line: 198, column: 5
                                      S93425=1;
                                      if(!capperStatus_o.isACK()){//sysj\controller.sysj line: 198, column: 5
                                        capperStatus_o.setREQ(false);//sysj\controller.sysj line: 198, column: 5
                                        ends[13]=2;
                                        ;//sysj\controller.sysj line: 198, column: 5
                                        S93516=2;
                                        if(bottleAtPos4.getprestatus()){//sysj\controller.sysj line: 201, column: 12
                                          thread104731(tdone,ends);
                                          thread104732(tdone,ends);
                                          thread104733(tdone,ends);
                                          thread104737(tdone,ends);
                                          int biggest104738 = 0;
                                          if(ends[14]>=biggest104738){
                                            biggest104738=ends[14];
                                          }
                                          if(ends[15]>=biggest104738){
                                            biggest104738=ends[15];
                                          }
                                          if(ends[16]>=biggest104738){
                                            biggest104738=ends[16];
                                          }
                                          if(ends[19]>=biggest104738){
                                            biggest104738=ends[19];
                                          }
                                          if(biggest104738 == 1){
                                            active[13]=1;
                                            ends[13]=1;
                                            break RUN;
                                          }
                                        }
                                        else {
                                          S93401=2;
                                          S95384=0;
                                          if(!capperStatus_o.isPartnerPresent() || capperStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 240, column: 3
                                            capperStatus_o.setREQ(false);//sysj\controller.sysj line: 240, column: 3
                                            S95384=1;
                                            active[13]=1;
                                            ends[13]=1;
                                            break RUN;
                                          }
                                          else {
                                            S95379=0;
                                            if(capperStatus_o.isACK()){//sysj\controller.sysj line: 240, column: 3
                                              capperStatus_o.setVal("done");//sysj\controller.sysj line: 240, column: 3
                                              S95379=1;
                                              if(!capperStatus_o.isACK()){//sysj\controller.sysj line: 240, column: 3
                                                capperStatus_o.setREQ(false);//sysj\controller.sysj line: 240, column: 3
                                                ends[13]=2;
                                                ;//sysj\controller.sysj line: 240, column: 3
                                                S93401=3;
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
                                  S93516=2;
                                  if(bottleAtPos4.getprestatus()){//sysj\controller.sysj line: 201, column: 12
                                    thread104739(tdone,ends);
                                    thread104740(tdone,ends);
                                    thread104741(tdone,ends);
                                    thread104745(tdone,ends);
                                    int biggest104746 = 0;
                                    if(ends[14]>=biggest104746){
                                      biggest104746=ends[14];
                                    }
                                    if(ends[15]>=biggest104746){
                                      biggest104746=ends[15];
                                    }
                                    if(ends[16]>=biggest104746){
                                      biggest104746=ends[16];
                                    }
                                    if(ends[19]>=biggest104746){
                                      biggest104746=ends[19];
                                    }
                                    if(biggest104746 == 1){
                                      active[13]=1;
                                      ends[13]=1;
                                      break RUN;
                                    }
                                  }
                                  else {
                                    S93401=2;
                                    S95384=0;
                                    if(!capperStatus_o.isPartnerPresent() || capperStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 240, column: 3
                                      capperStatus_o.setREQ(false);//sysj\controller.sysj line: 240, column: 3
                                      S95384=1;
                                      active[13]=1;
                                      ends[13]=1;
                                      break RUN;
                                    }
                                    else {
                                      S95379=0;
                                      if(capperStatus_o.isACK()){//sysj\controller.sysj line: 240, column: 3
                                        capperStatus_o.setVal("done");//sysj\controller.sysj line: 240, column: 3
                                        S95379=1;
                                        if(!capperStatus_o.isACK()){//sysj\controller.sysj line: 240, column: 3
                                          capperStatus_o.setREQ(false);//sysj\controller.sysj line: 240, column: 3
                                          ends[13]=2;
                                          ;//sysj\controller.sysj line: 240, column: 3
                                          S93401=3;
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
                            if(!capperStatus_o.isACK()){//sysj\controller.sysj line: 195, column: 4
                              capperStatus_o.setREQ(false);//sysj\controller.sysj line: 195, column: 4
                              ends[13]=2;
                              ;//sysj\controller.sysj line: 195, column: 4
                              S93516=1;
                              if(!bottleAtPos4.getprestatus()){//sysj\controller.sysj line: 197, column: 13
                                S93430=0;
                                if(!capperStatus_o.isPartnerPresent() || capperStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 198, column: 5
                                  capperStatus_o.setREQ(false);//sysj\controller.sysj line: 198, column: 5
                                  S93430=1;
                                  active[13]=1;
                                  ends[13]=1;
                                  break RUN;
                                }
                                else {
                                  S93425=0;
                                  if(capperStatus_o.isACK()){//sysj\controller.sysj line: 198, column: 5
                                    capperStatus_o.setVal("idle");//sysj\controller.sysj line: 198, column: 5
                                    S93425=1;
                                    if(!capperStatus_o.isACK()){//sysj\controller.sysj line: 198, column: 5
                                      capperStatus_o.setREQ(false);//sysj\controller.sysj line: 198, column: 5
                                      ends[13]=2;
                                      ;//sysj\controller.sysj line: 198, column: 5
                                      S93516=2;
                                      if(bottleAtPos4.getprestatus()){//sysj\controller.sysj line: 201, column: 12
                                        thread104747(tdone,ends);
                                        thread104748(tdone,ends);
                                        thread104749(tdone,ends);
                                        thread104753(tdone,ends);
                                        int biggest104754 = 0;
                                        if(ends[14]>=biggest104754){
                                          biggest104754=ends[14];
                                        }
                                        if(ends[15]>=biggest104754){
                                          biggest104754=ends[15];
                                        }
                                        if(ends[16]>=biggest104754){
                                          biggest104754=ends[16];
                                        }
                                        if(ends[19]>=biggest104754){
                                          biggest104754=ends[19];
                                        }
                                        if(biggest104754 == 1){
                                          active[13]=1;
                                          ends[13]=1;
                                          break RUN;
                                        }
                                      }
                                      else {
                                        S93401=2;
                                        S95384=0;
                                        if(!capperStatus_o.isPartnerPresent() || capperStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 240, column: 3
                                          capperStatus_o.setREQ(false);//sysj\controller.sysj line: 240, column: 3
                                          S95384=1;
                                          active[13]=1;
                                          ends[13]=1;
                                          break RUN;
                                        }
                                        else {
                                          S95379=0;
                                          if(capperStatus_o.isACK()){//sysj\controller.sysj line: 240, column: 3
                                            capperStatus_o.setVal("done");//sysj\controller.sysj line: 240, column: 3
                                            S95379=1;
                                            if(!capperStatus_o.isACK()){//sysj\controller.sysj line: 240, column: 3
                                              capperStatus_o.setREQ(false);//sysj\controller.sysj line: 240, column: 3
                                              ends[13]=2;
                                              ;//sysj\controller.sysj line: 240, column: 3
                                              S93401=3;
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
                                S93516=2;
                                if(bottleAtPos4.getprestatus()){//sysj\controller.sysj line: 201, column: 12
                                  thread104755(tdone,ends);
                                  thread104756(tdone,ends);
                                  thread104757(tdone,ends);
                                  thread104761(tdone,ends);
                                  int biggest104762 = 0;
                                  if(ends[14]>=biggest104762){
                                    biggest104762=ends[14];
                                  }
                                  if(ends[15]>=biggest104762){
                                    biggest104762=ends[15];
                                  }
                                  if(ends[16]>=biggest104762){
                                    biggest104762=ends[16];
                                  }
                                  if(ends[19]>=biggest104762){
                                    biggest104762=ends[19];
                                  }
                                  if(biggest104762 == 1){
                                    active[13]=1;
                                    ends[13]=1;
                                    break RUN;
                                  }
                                }
                                else {
                                  S93401=2;
                                  S95384=0;
                                  if(!capperStatus_o.isPartnerPresent() || capperStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 240, column: 3
                                    capperStatus_o.setREQ(false);//sysj\controller.sysj line: 240, column: 3
                                    S95384=1;
                                    active[13]=1;
                                    ends[13]=1;
                                    break RUN;
                                  }
                                  else {
                                    S95379=0;
                                    if(capperStatus_o.isACK()){//sysj\controller.sysj line: 240, column: 3
                                      capperStatus_o.setVal("done");//sysj\controller.sysj line: 240, column: 3
                                      S95379=1;
                                      if(!capperStatus_o.isACK()){//sysj\controller.sysj line: 240, column: 3
                                        capperStatus_o.setREQ(false);//sysj\controller.sysj line: 240, column: 3
                                        ends[13]=2;
                                        ;//sysj\controller.sysj line: 240, column: 3
                                        S93401=3;
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
                      S93408=1;
                      S93408=0;
                      if(!capperStatus_o.isPartnerPresent() || capperStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 195, column: 4
                        capperStatus_o.setREQ(false);//sysj\controller.sysj line: 195, column: 4
                        S93408=1;
                        active[13]=1;
                        ends[13]=1;
                        break RUN;
                      }
                      else {
                        S93403=0;
                        if(capperStatus_o.isACK()){//sysj\controller.sysj line: 195, column: 4
                          capperStatus_o.setVal("busy");//sysj\controller.sysj line: 195, column: 4
                          S93403=1;
                          if(!capperStatus_o.isACK()){//sysj\controller.sysj line: 195, column: 4
                            capperStatus_o.setREQ(false);//sysj\controller.sysj line: 195, column: 4
                            ends[13]=2;
                            ;//sysj\controller.sysj line: 195, column: 4
                            S93516=1;
                            if(!bottleAtPos4.getprestatus()){//sysj\controller.sysj line: 197, column: 13
                              S93430=0;
                              if(!capperStatus_o.isPartnerPresent() || capperStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 198, column: 5
                                capperStatus_o.setREQ(false);//sysj\controller.sysj line: 198, column: 5
                                S93430=1;
                                active[13]=1;
                                ends[13]=1;
                                break RUN;
                              }
                              else {
                                S93425=0;
                                if(capperStatus_o.isACK()){//sysj\controller.sysj line: 198, column: 5
                                  capperStatus_o.setVal("idle");//sysj\controller.sysj line: 198, column: 5
                                  S93425=1;
                                  if(!capperStatus_o.isACK()){//sysj\controller.sysj line: 198, column: 5
                                    capperStatus_o.setREQ(false);//sysj\controller.sysj line: 198, column: 5
                                    ends[13]=2;
                                    ;//sysj\controller.sysj line: 198, column: 5
                                    S93516=2;
                                    if(bottleAtPos4.getprestatus()){//sysj\controller.sysj line: 201, column: 12
                                      thread104763(tdone,ends);
                                      thread104764(tdone,ends);
                                      thread104765(tdone,ends);
                                      thread104769(tdone,ends);
                                      int biggest104770 = 0;
                                      if(ends[14]>=biggest104770){
                                        biggest104770=ends[14];
                                      }
                                      if(ends[15]>=biggest104770){
                                        biggest104770=ends[15];
                                      }
                                      if(ends[16]>=biggest104770){
                                        biggest104770=ends[16];
                                      }
                                      if(ends[19]>=biggest104770){
                                        biggest104770=ends[19];
                                      }
                                      if(biggest104770 == 1){
                                        active[13]=1;
                                        ends[13]=1;
                                        break RUN;
                                      }
                                    }
                                    else {
                                      S93401=2;
                                      S95384=0;
                                      if(!capperStatus_o.isPartnerPresent() || capperStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 240, column: 3
                                        capperStatus_o.setREQ(false);//sysj\controller.sysj line: 240, column: 3
                                        S95384=1;
                                        active[13]=1;
                                        ends[13]=1;
                                        break RUN;
                                      }
                                      else {
                                        S95379=0;
                                        if(capperStatus_o.isACK()){//sysj\controller.sysj line: 240, column: 3
                                          capperStatus_o.setVal("done");//sysj\controller.sysj line: 240, column: 3
                                          S95379=1;
                                          if(!capperStatus_o.isACK()){//sysj\controller.sysj line: 240, column: 3
                                            capperStatus_o.setREQ(false);//sysj\controller.sysj line: 240, column: 3
                                            ends[13]=2;
                                            ;//sysj\controller.sysj line: 240, column: 3
                                            S93401=3;
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
                              S93516=2;
                              if(bottleAtPos4.getprestatus()){//sysj\controller.sysj line: 201, column: 12
                                thread104771(tdone,ends);
                                thread104772(tdone,ends);
                                thread104773(tdone,ends);
                                thread104777(tdone,ends);
                                int biggest104778 = 0;
                                if(ends[14]>=biggest104778){
                                  biggest104778=ends[14];
                                }
                                if(ends[15]>=biggest104778){
                                  biggest104778=ends[15];
                                }
                                if(ends[16]>=biggest104778){
                                  biggest104778=ends[16];
                                }
                                if(ends[19]>=biggest104778){
                                  biggest104778=ends[19];
                                }
                                if(biggest104778 == 1){
                                  active[13]=1;
                                  ends[13]=1;
                                  break RUN;
                                }
                              }
                              else {
                                S93401=2;
                                S95384=0;
                                if(!capperStatus_o.isPartnerPresent() || capperStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 240, column: 3
                                  capperStatus_o.setREQ(false);//sysj\controller.sysj line: 240, column: 3
                                  S95384=1;
                                  active[13]=1;
                                  ends[13]=1;
                                  break RUN;
                                }
                                else {
                                  S95379=0;
                                  if(capperStatus_o.isACK()){//sysj\controller.sysj line: 240, column: 3
                                    capperStatus_o.setVal("done");//sysj\controller.sysj line: 240, column: 3
                                    S95379=1;
                                    if(!capperStatus_o.isACK()){//sysj\controller.sysj line: 240, column: 3
                                      capperStatus_o.setREQ(false);//sysj\controller.sysj line: 240, column: 3
                                      ends[13]=2;
                                      ;//sysj\controller.sysj line: 240, column: 3
                                      S93401=3;
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
                  switch(S93430){
                    case 0 : 
                      if(!capperStatus_o.isPartnerPresent() || capperStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 198, column: 5
                        capperStatus_o.setREQ(false);//sysj\controller.sysj line: 198, column: 5
                        S93430=1;
                        active[13]=1;
                        ends[13]=1;
                        break RUN;
                      }
                      else {
                        switch(S93425){
                          case 0 : 
                            if(capperStatus_o.isACK()){//sysj\controller.sysj line: 198, column: 5
                              capperStatus_o.setVal("idle");//sysj\controller.sysj line: 198, column: 5
                              S93425=1;
                              if(!capperStatus_o.isACK()){//sysj\controller.sysj line: 198, column: 5
                                capperStatus_o.setREQ(false);//sysj\controller.sysj line: 198, column: 5
                                ends[13]=2;
                                ;//sysj\controller.sysj line: 198, column: 5
                                S93516=2;
                                if(bottleAtPos4.getprestatus()){//sysj\controller.sysj line: 201, column: 12
                                  thread104779(tdone,ends);
                                  thread104780(tdone,ends);
                                  thread104781(tdone,ends);
                                  thread104785(tdone,ends);
                                  int biggest104786 = 0;
                                  if(ends[14]>=biggest104786){
                                    biggest104786=ends[14];
                                  }
                                  if(ends[15]>=biggest104786){
                                    biggest104786=ends[15];
                                  }
                                  if(ends[16]>=biggest104786){
                                    biggest104786=ends[16];
                                  }
                                  if(ends[19]>=biggest104786){
                                    biggest104786=ends[19];
                                  }
                                  if(biggest104786 == 1){
                                    active[13]=1;
                                    ends[13]=1;
                                    break RUN;
                                  }
                                }
                                else {
                                  S93401=2;
                                  S95384=0;
                                  if(!capperStatus_o.isPartnerPresent() || capperStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 240, column: 3
                                    capperStatus_o.setREQ(false);//sysj\controller.sysj line: 240, column: 3
                                    S95384=1;
                                    active[13]=1;
                                    ends[13]=1;
                                    break RUN;
                                  }
                                  else {
                                    S95379=0;
                                    if(capperStatus_o.isACK()){//sysj\controller.sysj line: 240, column: 3
                                      capperStatus_o.setVal("done");//sysj\controller.sysj line: 240, column: 3
                                      S95379=1;
                                      if(!capperStatus_o.isACK()){//sysj\controller.sysj line: 240, column: 3
                                        capperStatus_o.setREQ(false);//sysj\controller.sysj line: 240, column: 3
                                        ends[13]=2;
                                        ;//sysj\controller.sysj line: 240, column: 3
                                        S93401=3;
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
                            if(!capperStatus_o.isACK()){//sysj\controller.sysj line: 198, column: 5
                              capperStatus_o.setREQ(false);//sysj\controller.sysj line: 198, column: 5
                              ends[13]=2;
                              ;//sysj\controller.sysj line: 198, column: 5
                              S93516=2;
                              if(bottleAtPos4.getprestatus()){//sysj\controller.sysj line: 201, column: 12
                                thread104787(tdone,ends);
                                thread104788(tdone,ends);
                                thread104789(tdone,ends);
                                thread104793(tdone,ends);
                                int biggest104794 = 0;
                                if(ends[14]>=biggest104794){
                                  biggest104794=ends[14];
                                }
                                if(ends[15]>=biggest104794){
                                  biggest104794=ends[15];
                                }
                                if(ends[16]>=biggest104794){
                                  biggest104794=ends[16];
                                }
                                if(ends[19]>=biggest104794){
                                  biggest104794=ends[19];
                                }
                                if(biggest104794 == 1){
                                  active[13]=1;
                                  ends[13]=1;
                                  break RUN;
                                }
                              }
                              else {
                                S93401=2;
                                S95384=0;
                                if(!capperStatus_o.isPartnerPresent() || capperStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 240, column: 3
                                  capperStatus_o.setREQ(false);//sysj\controller.sysj line: 240, column: 3
                                  S95384=1;
                                  active[13]=1;
                                  ends[13]=1;
                                  break RUN;
                                }
                                else {
                                  S95379=0;
                                  if(capperStatus_o.isACK()){//sysj\controller.sysj line: 240, column: 3
                                    capperStatus_o.setVal("done");//sysj\controller.sysj line: 240, column: 3
                                    S95379=1;
                                    if(!capperStatus_o.isACK()){//sysj\controller.sysj line: 240, column: 3
                                      capperStatus_o.setREQ(false);//sysj\controller.sysj line: 240, column: 3
                                      ends[13]=2;
                                      ;//sysj\controller.sysj line: 240, column: 3
                                      S93401=3;
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
                      S93430=1;
                      S93430=0;
                      if(!capperStatus_o.isPartnerPresent() || capperStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 198, column: 5
                        capperStatus_o.setREQ(false);//sysj\controller.sysj line: 198, column: 5
                        S93430=1;
                        active[13]=1;
                        ends[13]=1;
                        break RUN;
                      }
                      else {
                        S93425=0;
                        if(capperStatus_o.isACK()){//sysj\controller.sysj line: 198, column: 5
                          capperStatus_o.setVal("idle");//sysj\controller.sysj line: 198, column: 5
                          S93425=1;
                          if(!capperStatus_o.isACK()){//sysj\controller.sysj line: 198, column: 5
                            capperStatus_o.setREQ(false);//sysj\controller.sysj line: 198, column: 5
                            ends[13]=2;
                            ;//sysj\controller.sysj line: 198, column: 5
                            S93516=2;
                            if(bottleAtPos4.getprestatus()){//sysj\controller.sysj line: 201, column: 12
                              thread104795(tdone,ends);
                              thread104796(tdone,ends);
                              thread104797(tdone,ends);
                              thread104801(tdone,ends);
                              int biggest104802 = 0;
                              if(ends[14]>=biggest104802){
                                biggest104802=ends[14];
                              }
                              if(ends[15]>=biggest104802){
                                biggest104802=ends[15];
                              }
                              if(ends[16]>=biggest104802){
                                biggest104802=ends[16];
                              }
                              if(ends[19]>=biggest104802){
                                biggest104802=ends[19];
                              }
                              if(biggest104802 == 1){
                                active[13]=1;
                                ends[13]=1;
                                break RUN;
                              }
                            }
                            else {
                              S93401=2;
                              S95384=0;
                              if(!capperStatus_o.isPartnerPresent() || capperStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 240, column: 3
                                capperStatus_o.setREQ(false);//sysj\controller.sysj line: 240, column: 3
                                S95384=1;
                                active[13]=1;
                                ends[13]=1;
                                break RUN;
                              }
                              else {
                                S95379=0;
                                if(capperStatus_o.isACK()){//sysj\controller.sysj line: 240, column: 3
                                  capperStatus_o.setVal("done");//sysj\controller.sysj line: 240, column: 3
                                  S95379=1;
                                  if(!capperStatus_o.isACK()){//sysj\controller.sysj line: 240, column: 3
                                    capperStatus_o.setREQ(false);//sysj\controller.sysj line: 240, column: 3
                                    ends[13]=2;
                                    ;//sysj\controller.sysj line: 240, column: 3
                                    S93401=3;
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
                  thread104803(tdone,ends);
                  thread104804(tdone,ends);
                  thread104805(tdone,ends);
                  thread104809(tdone,ends);
                  int biggest104810 = 0;
                  if(ends[14]>=biggest104810){
                    biggest104810=ends[14];
                  }
                  if(ends[15]>=biggest104810){
                    biggest104810=ends[15];
                  }
                  if(ends[16]>=biggest104810){
                    biggest104810=ends[16];
                  }
                  if(ends[19]>=biggest104810){
                    biggest104810=ends[19];
                  }
                  if(biggest104810 == 1){
                    active[13]=1;
                    ends[13]=1;
                    break RUN;
                  }
                  //FINXME code
                  if(biggest104810 == 0){
                    S93401=2;
                    S95384=0;
                    if(!capperStatus_o.isPartnerPresent() || capperStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 240, column: 3
                      capperStatus_o.setREQ(false);//sysj\controller.sysj line: 240, column: 3
                      S95384=1;
                      active[13]=1;
                      ends[13]=1;
                      break RUN;
                    }
                    else {
                      S95379=0;
                      if(capperStatus_o.isACK()){//sysj\controller.sysj line: 240, column: 3
                        capperStatus_o.setVal("done");//sysj\controller.sysj line: 240, column: 3
                        S95379=1;
                        if(!capperStatus_o.isACK()){//sysj\controller.sysj line: 240, column: 3
                          capperStatus_o.setREQ(false);//sysj\controller.sysj line: 240, column: 3
                          ends[13]=2;
                          ;//sysj\controller.sysj line: 240, column: 3
                          S93401=3;
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
              switch(S95384){
                case 0 : 
                  if(!capperStatus_o.isPartnerPresent() || capperStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 240, column: 3
                    capperStatus_o.setREQ(false);//sysj\controller.sysj line: 240, column: 3
                    S95384=1;
                    active[13]=1;
                    ends[13]=1;
                    break RUN;
                  }
                  else {
                    switch(S95379){
                      case 0 : 
                        if(capperStatus_o.isACK()){//sysj\controller.sysj line: 240, column: 3
                          capperStatus_o.setVal("done");//sysj\controller.sysj line: 240, column: 3
                          S95379=1;
                          if(!capperStatus_o.isACK()){//sysj\controller.sysj line: 240, column: 3
                            capperStatus_o.setREQ(false);//sysj\controller.sysj line: 240, column: 3
                            ends[13]=2;
                            ;//sysj\controller.sysj line: 240, column: 3
                            S93401=3;
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
                        if(!capperStatus_o.isACK()){//sysj\controller.sysj line: 240, column: 3
                          capperStatus_o.setREQ(false);//sysj\controller.sysj line: 240, column: 3
                          ends[13]=2;
                          ;//sysj\controller.sysj line: 240, column: 3
                          S93401=3;
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
                  S95384=1;
                  S95384=0;
                  if(!capperStatus_o.isPartnerPresent() || capperStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 240, column: 3
                    capperStatus_o.setREQ(false);//sysj\controller.sysj line: 240, column: 3
                    S95384=1;
                    active[13]=1;
                    ends[13]=1;
                    break RUN;
                  }
                  else {
                    S95379=0;
                    if(capperStatus_o.isACK()){//sysj\controller.sysj line: 240, column: 3
                      capperStatus_o.setVal("done");//sysj\controller.sysj line: 240, column: 3
                      S95379=1;
                      if(!capperStatus_o.isACK()){//sysj\controller.sysj line: 240, column: 3
                        capperStatus_o.setREQ(false);//sysj\controller.sysj line: 240, column: 3
                        ends[13]=2;
                        ;//sysj\controller.sysj line: 240, column: 3
                        S93401=3;
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
              S93401=3;
              S93401=0;
              S93385=0;
              if(!capperReq_in.isPartnerPresent() || capperReq_in.isPartnerPreempted()){//sysj\controller.sysj line: 191, column: 3
                capperReq_in.setACK(false);//sysj\controller.sysj line: 191, column: 3
                S93385=1;
                active[13]=1;
                ends[13]=1;
                break RUN;
              }
              else {
                S93380=0;
                if(!capperReq_in.isREQ()){//sysj\controller.sysj line: 191, column: 3
                  capperReq_in.setACK(true);//sysj\controller.sysj line: 191, column: 3
                  S93380=1;
                  if(capperReq_in.isREQ()){//sysj\controller.sysj line: 191, column: 3
                    capperReq_in.setACK(false);//sysj\controller.sysj line: 191, column: 3
                    ends[13]=2;
                    ;//sysj\controller.sysj line: 191, column: 3
                    request_thread_13 = (boolean)(capperReq_in.getVal() == null ? false : ((Boolean)capperReq_in.getVal()).booleanValue());//sysj\controller.sysj line: 192, column: 3
                    S93401=1;
                    if(request_thread_13){//sysj\controller.sysj line: 194, column: 3
                      S93516=0;
                      S93408=0;
                      if(!capperStatus_o.isPartnerPresent() || capperStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 195, column: 4
                        capperStatus_o.setREQ(false);//sysj\controller.sysj line: 195, column: 4
                        S93408=1;
                        active[13]=1;
                        ends[13]=1;
                        break RUN;
                      }
                      else {
                        S93403=0;
                        if(capperStatus_o.isACK()){//sysj\controller.sysj line: 195, column: 4
                          capperStatus_o.setVal("busy");//sysj\controller.sysj line: 195, column: 4
                          S93403=1;
                          if(!capperStatus_o.isACK()){//sysj\controller.sysj line: 195, column: 4
                            capperStatus_o.setREQ(false);//sysj\controller.sysj line: 195, column: 4
                            ends[13]=2;
                            ;//sysj\controller.sysj line: 195, column: 4
                            S93516=1;
                            if(!bottleAtPos4.getprestatus()){//sysj\controller.sysj line: 197, column: 13
                              S93430=0;
                              if(!capperStatus_o.isPartnerPresent() || capperStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 198, column: 5
                                capperStatus_o.setREQ(false);//sysj\controller.sysj line: 198, column: 5
                                S93430=1;
                                active[13]=1;
                                ends[13]=1;
                                break RUN;
                              }
                              else {
                                S93425=0;
                                if(capperStatus_o.isACK()){//sysj\controller.sysj line: 198, column: 5
                                  capperStatus_o.setVal("idle");//sysj\controller.sysj line: 198, column: 5
                                  S93425=1;
                                  if(!capperStatus_o.isACK()){//sysj\controller.sysj line: 198, column: 5
                                    capperStatus_o.setREQ(false);//sysj\controller.sysj line: 198, column: 5
                                    ends[13]=2;
                                    ;//sysj\controller.sysj line: 198, column: 5
                                    S93516=2;
                                    if(bottleAtPos4.getprestatus()){//sysj\controller.sysj line: 201, column: 12
                                      thread104811(tdone,ends);
                                      thread104812(tdone,ends);
                                      thread104813(tdone,ends);
                                      thread104817(tdone,ends);
                                      int biggest104818 = 0;
                                      if(ends[14]>=biggest104818){
                                        biggest104818=ends[14];
                                      }
                                      if(ends[15]>=biggest104818){
                                        biggest104818=ends[15];
                                      }
                                      if(ends[16]>=biggest104818){
                                        biggest104818=ends[16];
                                      }
                                      if(ends[19]>=biggest104818){
                                        biggest104818=ends[19];
                                      }
                                      if(biggest104818 == 1){
                                        active[13]=1;
                                        ends[13]=1;
                                        break RUN;
                                      }
                                    }
                                    else {
                                      S93401=2;
                                      S95384=0;
                                      if(!capperStatus_o.isPartnerPresent() || capperStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 240, column: 3
                                        capperStatus_o.setREQ(false);//sysj\controller.sysj line: 240, column: 3
                                        S95384=1;
                                        active[13]=1;
                                        ends[13]=1;
                                        break RUN;
                                      }
                                      else {
                                        S95379=0;
                                        if(capperStatus_o.isACK()){//sysj\controller.sysj line: 240, column: 3
                                          capperStatus_o.setVal("done");//sysj\controller.sysj line: 240, column: 3
                                          S95379=1;
                                          if(!capperStatus_o.isACK()){//sysj\controller.sysj line: 240, column: 3
                                            capperStatus_o.setREQ(false);//sysj\controller.sysj line: 240, column: 3
                                            ends[13]=2;
                                            ;//sysj\controller.sysj line: 240, column: 3
                                            S93401=3;
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
                              S93516=2;
                              if(bottleAtPos4.getprestatus()){//sysj\controller.sysj line: 201, column: 12
                                thread104819(tdone,ends);
                                thread104820(tdone,ends);
                                thread104821(tdone,ends);
                                thread104825(tdone,ends);
                                int biggest104826 = 0;
                                if(ends[14]>=biggest104826){
                                  biggest104826=ends[14];
                                }
                                if(ends[15]>=biggest104826){
                                  biggest104826=ends[15];
                                }
                                if(ends[16]>=biggest104826){
                                  biggest104826=ends[16];
                                }
                                if(ends[19]>=biggest104826){
                                  biggest104826=ends[19];
                                }
                                if(biggest104826 == 1){
                                  active[13]=1;
                                  ends[13]=1;
                                  break RUN;
                                }
                              }
                              else {
                                S93401=2;
                                S95384=0;
                                if(!capperStatus_o.isPartnerPresent() || capperStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 240, column: 3
                                  capperStatus_o.setREQ(false);//sysj\controller.sysj line: 240, column: 3
                                  S95384=1;
                                  active[13]=1;
                                  ends[13]=1;
                                  break RUN;
                                }
                                else {
                                  S95379=0;
                                  if(capperStatus_o.isACK()){//sysj\controller.sysj line: 240, column: 3
                                    capperStatus_o.setVal("done");//sysj\controller.sysj line: 240, column: 3
                                    S95379=1;
                                    if(!capperStatus_o.isACK()){//sysj\controller.sysj line: 240, column: 3
                                      capperStatus_o.setREQ(false);//sysj\controller.sysj line: 240, column: 3
                                      ends[13]=2;
                                      ;//sysj\controller.sysj line: 240, column: 3
                                      S93401=3;
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
                      S93401=2;
                      S95384=0;
                      if(!capperStatus_o.isPartnerPresent() || capperStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 240, column: 3
                        capperStatus_o.setREQ(false);//sysj\controller.sysj line: 240, column: 3
                        S95384=1;
                        active[13]=1;
                        ends[13]=1;
                        break RUN;
                      }
                      else {
                        S95379=0;
                        if(capperStatus_o.isACK()){//sysj\controller.sysj line: 240, column: 3
                          capperStatus_o.setVal("done");//sysj\controller.sysj line: 240, column: 3
                          S95379=1;
                          if(!capperStatus_o.isACK()){//sysj\controller.sysj line: 240, column: 3
                            capperStatus_o.setREQ(false);//sysj\controller.sysj line: 240, column: 3
                            ends[13]=2;
                            ;//sysj\controller.sysj line: 240, column: 3
                            S93401=3;
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
