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
  private boolean request_thread_13;//sysj\controller.sysj line: 193, column: 3
  private int S108983 = 1;
  private int S97349 = 1;
  private int S97333 = 1;
  private int S97328 = 1;
  private int S97464 = 1;
  private int S97356 = 1;
  private int S97351 = 1;
  private int S97378 = 1;
  private int S97373 = 1;
  private int S97470 = 1;
  private int S97476 = 1;
  private int S97492 = 1;
  private int S97491 = 1;
  private int S97479 = 1;
  private int S97482 = 1;
  private int S97505 = 1;
  private int S97502 = 1;
  private int S100844 = 1;
  private int S100839 = 1;
  
  private int[] ends = new int[23];
  private int[] tdone = new int[23];
  
  public void thread113573(int [] tdone, int [] ends){
        S97505=1;
    S97502=0;
    active[19]=1;
    ends[19]=1;
    tdone[19]=1;
  }

  public void thread113571(int [] tdone, int [] ends){
        S97482=1;
    active[18]=1;
    ends[18]=1;
    tdone[18]=1;
  }

  public void thread113570(int [] tdone, int [] ends){
        S97479=1;
    active[17]=1;
    ends[17]=1;
    tdone[17]=1;
  }

  public void thread113569(int [] tdone, int [] ends){
        S97492=1;
    S97491=0;
    thread113570(tdone,ends);
    thread113571(tdone,ends);
    int biggest113572 = 0;
    if(ends[17]>=biggest113572){
      biggest113572=ends[17];
    }
    if(ends[18]>=biggest113572){
      biggest113572=ends[18];
    }
    if(biggest113572 == 1){
      active[16]=1;
      ends[16]=1;
      tdone[16]=1;
    }
  }

  public void thread113568(int [] tdone, int [] ends){
        S97476=1;
    cylPos5ZAxisExtend.setPresent();//sysj\controller.sysj line: 212, column: 7
    currsigs.addElement(cylPos5ZAxisExtend);
    active[15]=1;
    ends[15]=1;
    tdone[15]=1;
  }

  public void thread113567(int [] tdone, int [] ends){
        S97470=1;
    cylClampBottleExtend.setPresent();//sysj\controller.sysj line: 206, column: 7
    currsigs.addElement(cylClampBottleExtend);
    active[14]=1;
    ends[14]=1;
    tdone[14]=1;
  }

  public void thread113565(int [] tdone, int [] ends){
        S97505=1;
    S97502=0;
    active[19]=1;
    ends[19]=1;
    tdone[19]=1;
  }

  public void thread113563(int [] tdone, int [] ends){
        S97482=1;
    active[18]=1;
    ends[18]=1;
    tdone[18]=1;
  }

  public void thread113562(int [] tdone, int [] ends){
        S97479=1;
    active[17]=1;
    ends[17]=1;
    tdone[17]=1;
  }

  public void thread113561(int [] tdone, int [] ends){
        S97492=1;
    S97491=0;
    thread113562(tdone,ends);
    thread113563(tdone,ends);
    int biggest113564 = 0;
    if(ends[17]>=biggest113564){
      biggest113564=ends[17];
    }
    if(ends[18]>=biggest113564){
      biggest113564=ends[18];
    }
    if(biggest113564 == 1){
      active[16]=1;
      ends[16]=1;
      tdone[16]=1;
    }
  }

  public void thread113560(int [] tdone, int [] ends){
        S97476=1;
    cylPos5ZAxisExtend.setPresent();//sysj\controller.sysj line: 212, column: 7
    currsigs.addElement(cylPos5ZAxisExtend);
    active[15]=1;
    ends[15]=1;
    tdone[15]=1;
  }

  public void thread113559(int [] tdone, int [] ends){
        S97470=1;
    cylClampBottleExtend.setPresent();//sysj\controller.sysj line: 206, column: 7
    currsigs.addElement(cylClampBottleExtend);
    active[14]=1;
    ends[14]=1;
    tdone[14]=1;
  }

  public void thread113557(int [] tdone, int [] ends){
        switch(S97505){
      case 0 : 
        active[19]=0;
        ends[19]=0;
        tdone[19]=1;
        break;
      
      case 1 : 
        switch(S97502){
          case 0 : 
            if(gripperGrippedCap.getprestatus()){//sysj\controller.sysj line: 225, column: 12
              S97502=1;
              gripperTurnExtend.setPresent();//sysj\controller.sysj line: 228, column: 7
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
            if(gripperTurnFinalPos.getprestatus()){//sysj\controller.sysj line: 227, column: 13
              releaseCap_13.setPresent();//sysj\controller.sysj line: 230, column: 6
              currsigs.addElement(releaseCap_13);
              untwistGripper_13.setPresent();//sysj\controller.sysj line: 233, column: 7
              currsigs.addElement(untwistGripper_13);
              raiseGripper_13.setPresent();//sysj\controller.sysj line: 236, column: 6
              currsigs.addElement(raiseGripper_13);
              unclampBottle_13.setPresent();//sysj\controller.sysj line: 237, column: 6
              currsigs.addElement(unclampBottle_13);
              S97505=0;
              active[19]=0;
              ends[19]=0;
              tdone[19]=1;
            }
            else {
              gripperTurnExtend.setPresent();//sysj\controller.sysj line: 228, column: 7
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

  public void thread113555(int [] tdone, int [] ends){
        switch(S97482){
      case 0 : 
        active[18]=0;
        ends[18]=0;
        tdone[18]=1;
        break;
      
      case 1 : 
        if(cylClampedBottle.getprestatus()){//sysj\controller.sysj line: 218, column: 46
          S97482=0;
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

  public void thread113554(int [] tdone, int [] ends){
        switch(S97479){
      case 0 : 
        active[17]=0;
        ends[17]=0;
        tdone[17]=1;
        break;
      
      case 1 : 
        if(gripperZAxisLowered.getprestatus()){//sysj\controller.sysj line: 218, column: 13
          S97479=0;
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

  public void thread113553(int [] tdone, int [] ends){
        switch(S97492){
      case 0 : 
        active[16]=0;
        ends[16]=0;
        tdone[16]=1;
        break;
      
      case 1 : 
        switch(S97491){
          case 0 : 
            thread113554(tdone,ends);
            thread113555(tdone,ends);
            int biggest113556 = 0;
            if(ends[17]>=biggest113556){
              biggest113556=ends[17];
            }
            if(ends[18]>=biggest113556){
              biggest113556=ends[18];
            }
            if(biggest113556 == 1){
              active[16]=1;
              ends[16]=1;
              tdone[16]=1;
            }
            //FINXME code
            if(biggest113556 == 0){
              S97491=1;
              capGripperPos5Extend.setPresent();//sysj\controller.sysj line: 220, column: 7
              currsigs.addElement(capGripperPos5Extend);
              active[16]=1;
              ends[16]=1;
              tdone[16]=1;
            }
            break;
          
          case 1 : 
            if(releaseCap_13.getprestatus()){//sysj\controller.sysj line: 219, column: 12
              S97492=0;
              active[16]=0;
              ends[16]=0;
              tdone[16]=1;
            }
            else {
              capGripperPos5Extend.setPresent();//sysj\controller.sysj line: 220, column: 7
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

  public void thread113552(int [] tdone, int [] ends){
        switch(S97476){
      case 0 : 
        active[15]=0;
        ends[15]=0;
        tdone[15]=1;
        break;
      
      case 1 : 
        if(raiseGripper_13.getprestatus()){//sysj\controller.sysj line: 211, column: 12
          S97476=0;
          active[15]=0;
          ends[15]=0;
          tdone[15]=1;
        }
        else {
          cylPos5ZAxisExtend.setPresent();//sysj\controller.sysj line: 212, column: 7
          currsigs.addElement(cylPos5ZAxisExtend);
          active[15]=1;
          ends[15]=1;
          tdone[15]=1;
        }
        break;
      
    }
  }

  public void thread113551(int [] tdone, int [] ends){
        switch(S97470){
      case 0 : 
        active[14]=0;
        ends[14]=0;
        tdone[14]=1;
        break;
      
      case 1 : 
        if(unclampBottle_13.getprestatus()){//sysj\controller.sysj line: 205, column: 13
          S97470=0;
          active[14]=0;
          ends[14]=0;
          tdone[14]=1;
        }
        else {
          cylClampBottleExtend.setPresent();//sysj\controller.sysj line: 206, column: 7
          currsigs.addElement(cylClampBottleExtend);
          active[14]=1;
          ends[14]=1;
          tdone[14]=1;
        }
        break;
      
    }
  }

  public void thread113549(int [] tdone, int [] ends){
        S97505=1;
    S97502=0;
    active[19]=1;
    ends[19]=1;
    tdone[19]=1;
  }

  public void thread113547(int [] tdone, int [] ends){
        S97482=1;
    active[18]=1;
    ends[18]=1;
    tdone[18]=1;
  }

  public void thread113546(int [] tdone, int [] ends){
        S97479=1;
    active[17]=1;
    ends[17]=1;
    tdone[17]=1;
  }

  public void thread113545(int [] tdone, int [] ends){
        S97492=1;
    S97491=0;
    thread113546(tdone,ends);
    thread113547(tdone,ends);
    int biggest113548 = 0;
    if(ends[17]>=biggest113548){
      biggest113548=ends[17];
    }
    if(ends[18]>=biggest113548){
      biggest113548=ends[18];
    }
    if(biggest113548 == 1){
      active[16]=1;
      ends[16]=1;
      tdone[16]=1;
    }
  }

  public void thread113544(int [] tdone, int [] ends){
        S97476=1;
    cylPos5ZAxisExtend.setPresent();//sysj\controller.sysj line: 212, column: 7
    currsigs.addElement(cylPos5ZAxisExtend);
    active[15]=1;
    ends[15]=1;
    tdone[15]=1;
  }

  public void thread113543(int [] tdone, int [] ends){
        S97470=1;
    cylClampBottleExtend.setPresent();//sysj\controller.sysj line: 206, column: 7
    currsigs.addElement(cylClampBottleExtend);
    active[14]=1;
    ends[14]=1;
    tdone[14]=1;
  }

  public void thread113541(int [] tdone, int [] ends){
        S97505=1;
    S97502=0;
    active[19]=1;
    ends[19]=1;
    tdone[19]=1;
  }

  public void thread113539(int [] tdone, int [] ends){
        S97482=1;
    active[18]=1;
    ends[18]=1;
    tdone[18]=1;
  }

  public void thread113538(int [] tdone, int [] ends){
        S97479=1;
    active[17]=1;
    ends[17]=1;
    tdone[17]=1;
  }

  public void thread113537(int [] tdone, int [] ends){
        S97492=1;
    S97491=0;
    thread113538(tdone,ends);
    thread113539(tdone,ends);
    int biggest113540 = 0;
    if(ends[17]>=biggest113540){
      biggest113540=ends[17];
    }
    if(ends[18]>=biggest113540){
      biggest113540=ends[18];
    }
    if(biggest113540 == 1){
      active[16]=1;
      ends[16]=1;
      tdone[16]=1;
    }
  }

  public void thread113536(int [] tdone, int [] ends){
        S97476=1;
    cylPos5ZAxisExtend.setPresent();//sysj\controller.sysj line: 212, column: 7
    currsigs.addElement(cylPos5ZAxisExtend);
    active[15]=1;
    ends[15]=1;
    tdone[15]=1;
  }

  public void thread113535(int [] tdone, int [] ends){
        S97470=1;
    cylClampBottleExtend.setPresent();//sysj\controller.sysj line: 206, column: 7
    currsigs.addElement(cylClampBottleExtend);
    active[14]=1;
    ends[14]=1;
    tdone[14]=1;
  }

  public void thread113533(int [] tdone, int [] ends){
        S97505=1;
    S97502=0;
    active[19]=1;
    ends[19]=1;
    tdone[19]=1;
  }

  public void thread113531(int [] tdone, int [] ends){
        S97482=1;
    active[18]=1;
    ends[18]=1;
    tdone[18]=1;
  }

  public void thread113530(int [] tdone, int [] ends){
        S97479=1;
    active[17]=1;
    ends[17]=1;
    tdone[17]=1;
  }

  public void thread113529(int [] tdone, int [] ends){
        S97492=1;
    S97491=0;
    thread113530(tdone,ends);
    thread113531(tdone,ends);
    int biggest113532 = 0;
    if(ends[17]>=biggest113532){
      biggest113532=ends[17];
    }
    if(ends[18]>=biggest113532){
      biggest113532=ends[18];
    }
    if(biggest113532 == 1){
      active[16]=1;
      ends[16]=1;
      tdone[16]=1;
    }
  }

  public void thread113528(int [] tdone, int [] ends){
        S97476=1;
    cylPos5ZAxisExtend.setPresent();//sysj\controller.sysj line: 212, column: 7
    currsigs.addElement(cylPos5ZAxisExtend);
    active[15]=1;
    ends[15]=1;
    tdone[15]=1;
  }

  public void thread113527(int [] tdone, int [] ends){
        S97470=1;
    cylClampBottleExtend.setPresent();//sysj\controller.sysj line: 206, column: 7
    currsigs.addElement(cylClampBottleExtend);
    active[14]=1;
    ends[14]=1;
    tdone[14]=1;
  }

  public void thread113525(int [] tdone, int [] ends){
        S97505=1;
    S97502=0;
    active[19]=1;
    ends[19]=1;
    tdone[19]=1;
  }

  public void thread113523(int [] tdone, int [] ends){
        S97482=1;
    active[18]=1;
    ends[18]=1;
    tdone[18]=1;
  }

  public void thread113522(int [] tdone, int [] ends){
        S97479=1;
    active[17]=1;
    ends[17]=1;
    tdone[17]=1;
  }

  public void thread113521(int [] tdone, int [] ends){
        S97492=1;
    S97491=0;
    thread113522(tdone,ends);
    thread113523(tdone,ends);
    int biggest113524 = 0;
    if(ends[17]>=biggest113524){
      biggest113524=ends[17];
    }
    if(ends[18]>=biggest113524){
      biggest113524=ends[18];
    }
    if(biggest113524 == 1){
      active[16]=1;
      ends[16]=1;
      tdone[16]=1;
    }
  }

  public void thread113520(int [] tdone, int [] ends){
        S97476=1;
    cylPos5ZAxisExtend.setPresent();//sysj\controller.sysj line: 212, column: 7
    currsigs.addElement(cylPos5ZAxisExtend);
    active[15]=1;
    ends[15]=1;
    tdone[15]=1;
  }

  public void thread113519(int [] tdone, int [] ends){
        S97470=1;
    cylClampBottleExtend.setPresent();//sysj\controller.sysj line: 206, column: 7
    currsigs.addElement(cylClampBottleExtend);
    active[14]=1;
    ends[14]=1;
    tdone[14]=1;
  }

  public void thread113517(int [] tdone, int [] ends){
        S97505=1;
    S97502=0;
    active[19]=1;
    ends[19]=1;
    tdone[19]=1;
  }

  public void thread113515(int [] tdone, int [] ends){
        S97482=1;
    active[18]=1;
    ends[18]=1;
    tdone[18]=1;
  }

  public void thread113514(int [] tdone, int [] ends){
        S97479=1;
    active[17]=1;
    ends[17]=1;
    tdone[17]=1;
  }

  public void thread113513(int [] tdone, int [] ends){
        S97492=1;
    S97491=0;
    thread113514(tdone,ends);
    thread113515(tdone,ends);
    int biggest113516 = 0;
    if(ends[17]>=biggest113516){
      biggest113516=ends[17];
    }
    if(ends[18]>=biggest113516){
      biggest113516=ends[18];
    }
    if(biggest113516 == 1){
      active[16]=1;
      ends[16]=1;
      tdone[16]=1;
    }
  }

  public void thread113512(int [] tdone, int [] ends){
        S97476=1;
    cylPos5ZAxisExtend.setPresent();//sysj\controller.sysj line: 212, column: 7
    currsigs.addElement(cylPos5ZAxisExtend);
    active[15]=1;
    ends[15]=1;
    tdone[15]=1;
  }

  public void thread113511(int [] tdone, int [] ends){
        S97470=1;
    cylClampBottleExtend.setPresent();//sysj\controller.sysj line: 206, column: 7
    currsigs.addElement(cylClampBottleExtend);
    active[14]=1;
    ends[14]=1;
    tdone[14]=1;
  }

  public void thread113509(int [] tdone, int [] ends){
        S97505=1;
    S97502=0;
    active[19]=1;
    ends[19]=1;
    tdone[19]=1;
  }

  public void thread113507(int [] tdone, int [] ends){
        S97482=1;
    active[18]=1;
    ends[18]=1;
    tdone[18]=1;
  }

  public void thread113506(int [] tdone, int [] ends){
        S97479=1;
    active[17]=1;
    ends[17]=1;
    tdone[17]=1;
  }

  public void thread113505(int [] tdone, int [] ends){
        S97492=1;
    S97491=0;
    thread113506(tdone,ends);
    thread113507(tdone,ends);
    int biggest113508 = 0;
    if(ends[17]>=biggest113508){
      biggest113508=ends[17];
    }
    if(ends[18]>=biggest113508){
      biggest113508=ends[18];
    }
    if(biggest113508 == 1){
      active[16]=1;
      ends[16]=1;
      tdone[16]=1;
    }
  }

  public void thread113504(int [] tdone, int [] ends){
        S97476=1;
    cylPos5ZAxisExtend.setPresent();//sysj\controller.sysj line: 212, column: 7
    currsigs.addElement(cylPos5ZAxisExtend);
    active[15]=1;
    ends[15]=1;
    tdone[15]=1;
  }

  public void thread113503(int [] tdone, int [] ends){
        S97470=1;
    cylClampBottleExtend.setPresent();//sysj\controller.sysj line: 206, column: 7
    currsigs.addElement(cylClampBottleExtend);
    active[14]=1;
    ends[14]=1;
    tdone[14]=1;
  }

  public void thread113501(int [] tdone, int [] ends){
        S97505=1;
    S97502=0;
    active[19]=1;
    ends[19]=1;
    tdone[19]=1;
  }

  public void thread113499(int [] tdone, int [] ends){
        S97482=1;
    active[18]=1;
    ends[18]=1;
    tdone[18]=1;
  }

  public void thread113498(int [] tdone, int [] ends){
        S97479=1;
    active[17]=1;
    ends[17]=1;
    tdone[17]=1;
  }

  public void thread113497(int [] tdone, int [] ends){
        S97492=1;
    S97491=0;
    thread113498(tdone,ends);
    thread113499(tdone,ends);
    int biggest113500 = 0;
    if(ends[17]>=biggest113500){
      biggest113500=ends[17];
    }
    if(ends[18]>=biggest113500){
      biggest113500=ends[18];
    }
    if(biggest113500 == 1){
      active[16]=1;
      ends[16]=1;
      tdone[16]=1;
    }
  }

  public void thread113496(int [] tdone, int [] ends){
        S97476=1;
    cylPos5ZAxisExtend.setPresent();//sysj\controller.sysj line: 212, column: 7
    currsigs.addElement(cylPos5ZAxisExtend);
    active[15]=1;
    ends[15]=1;
    tdone[15]=1;
  }

  public void thread113495(int [] tdone, int [] ends){
        S97470=1;
    cylClampBottleExtend.setPresent();//sysj\controller.sysj line: 206, column: 7
    currsigs.addElement(cylClampBottleExtend);
    active[14]=1;
    ends[14]=1;
    tdone[14]=1;
  }

  public void thread113493(int [] tdone, int [] ends){
        S97505=1;
    S97502=0;
    active[19]=1;
    ends[19]=1;
    tdone[19]=1;
  }

  public void thread113491(int [] tdone, int [] ends){
        S97482=1;
    active[18]=1;
    ends[18]=1;
    tdone[18]=1;
  }

  public void thread113490(int [] tdone, int [] ends){
        S97479=1;
    active[17]=1;
    ends[17]=1;
    tdone[17]=1;
  }

  public void thread113489(int [] tdone, int [] ends){
        S97492=1;
    S97491=0;
    thread113490(tdone,ends);
    thread113491(tdone,ends);
    int biggest113492 = 0;
    if(ends[17]>=biggest113492){
      biggest113492=ends[17];
    }
    if(ends[18]>=biggest113492){
      biggest113492=ends[18];
    }
    if(biggest113492 == 1){
      active[16]=1;
      ends[16]=1;
      tdone[16]=1;
    }
  }

  public void thread113488(int [] tdone, int [] ends){
        S97476=1;
    cylPos5ZAxisExtend.setPresent();//sysj\controller.sysj line: 212, column: 7
    currsigs.addElement(cylPos5ZAxisExtend);
    active[15]=1;
    ends[15]=1;
    tdone[15]=1;
  }

  public void thread113487(int [] tdone, int [] ends){
        S97470=1;
    cylClampBottleExtend.setPresent();//sysj\controller.sysj line: 206, column: 7
    currsigs.addElement(cylClampBottleExtend);
    active[14]=1;
    ends[14]=1;
    tdone[14]=1;
  }

  public void thread113485(int [] tdone, int [] ends){
        S97505=1;
    S97502=0;
    active[19]=1;
    ends[19]=1;
    tdone[19]=1;
  }

  public void thread113483(int [] tdone, int [] ends){
        S97482=1;
    active[18]=1;
    ends[18]=1;
    tdone[18]=1;
  }

  public void thread113482(int [] tdone, int [] ends){
        S97479=1;
    active[17]=1;
    ends[17]=1;
    tdone[17]=1;
  }

  public void thread113481(int [] tdone, int [] ends){
        S97492=1;
    S97491=0;
    thread113482(tdone,ends);
    thread113483(tdone,ends);
    int biggest113484 = 0;
    if(ends[17]>=biggest113484){
      biggest113484=ends[17];
    }
    if(ends[18]>=biggest113484){
      biggest113484=ends[18];
    }
    if(biggest113484 == 1){
      active[16]=1;
      ends[16]=1;
      tdone[16]=1;
    }
  }

  public void thread113480(int [] tdone, int [] ends){
        S97476=1;
    cylPos5ZAxisExtend.setPresent();//sysj\controller.sysj line: 212, column: 7
    currsigs.addElement(cylPos5ZAxisExtend);
    active[15]=1;
    ends[15]=1;
    tdone[15]=1;
  }

  public void thread113479(int [] tdone, int [] ends){
        S97470=1;
    cylClampBottleExtend.setPresent();//sysj\controller.sysj line: 206, column: 7
    currsigs.addElement(cylClampBottleExtend);
    active[14]=1;
    ends[14]=1;
    tdone[14]=1;
  }

  public void thread113477(int [] tdone, int [] ends){
        S97505=1;
    S97502=0;
    active[19]=1;
    ends[19]=1;
    tdone[19]=1;
  }

  public void thread113475(int [] tdone, int [] ends){
        S97482=1;
    active[18]=1;
    ends[18]=1;
    tdone[18]=1;
  }

  public void thread113474(int [] tdone, int [] ends){
        S97479=1;
    active[17]=1;
    ends[17]=1;
    tdone[17]=1;
  }

  public void thread113473(int [] tdone, int [] ends){
        S97492=1;
    S97491=0;
    thread113474(tdone,ends);
    thread113475(tdone,ends);
    int biggest113476 = 0;
    if(ends[17]>=biggest113476){
      biggest113476=ends[17];
    }
    if(ends[18]>=biggest113476){
      biggest113476=ends[18];
    }
    if(biggest113476 == 1){
      active[16]=1;
      ends[16]=1;
      tdone[16]=1;
    }
  }

  public void thread113472(int [] tdone, int [] ends){
        S97476=1;
    cylPos5ZAxisExtend.setPresent();//sysj\controller.sysj line: 212, column: 7
    currsigs.addElement(cylPos5ZAxisExtend);
    active[15]=1;
    ends[15]=1;
    tdone[15]=1;
  }

  public void thread113471(int [] tdone, int [] ends){
        S97470=1;
    cylClampBottleExtend.setPresent();//sysj\controller.sysj line: 206, column: 7
    currsigs.addElement(cylClampBottleExtend);
    active[14]=1;
    ends[14]=1;
    tdone[14]=1;
  }

  public void thread113469(int [] tdone, int [] ends){
        S97505=1;
    S97502=0;
    active[19]=1;
    ends[19]=1;
    tdone[19]=1;
  }

  public void thread113467(int [] tdone, int [] ends){
        S97482=1;
    active[18]=1;
    ends[18]=1;
    tdone[18]=1;
  }

  public void thread113466(int [] tdone, int [] ends){
        S97479=1;
    active[17]=1;
    ends[17]=1;
    tdone[17]=1;
  }

  public void thread113465(int [] tdone, int [] ends){
        S97492=1;
    S97491=0;
    thread113466(tdone,ends);
    thread113467(tdone,ends);
    int biggest113468 = 0;
    if(ends[17]>=biggest113468){
      biggest113468=ends[17];
    }
    if(ends[18]>=biggest113468){
      biggest113468=ends[18];
    }
    if(biggest113468 == 1){
      active[16]=1;
      ends[16]=1;
      tdone[16]=1;
    }
  }

  public void thread113464(int [] tdone, int [] ends){
        S97476=1;
    cylPos5ZAxisExtend.setPresent();//sysj\controller.sysj line: 212, column: 7
    currsigs.addElement(cylPos5ZAxisExtend);
    active[15]=1;
    ends[15]=1;
    tdone[15]=1;
  }

  public void thread113463(int [] tdone, int [] ends){
        S97470=1;
    cylClampBottleExtend.setPresent();//sysj\controller.sysj line: 206, column: 7
    currsigs.addElement(cylClampBottleExtend);
    active[14]=1;
    ends[14]=1;
    tdone[14]=1;
  }

  public void thread113461(int [] tdone, int [] ends){
        S97505=1;
    S97502=0;
    active[19]=1;
    ends[19]=1;
    tdone[19]=1;
  }

  public void thread113459(int [] tdone, int [] ends){
        S97482=1;
    active[18]=1;
    ends[18]=1;
    tdone[18]=1;
  }

  public void thread113458(int [] tdone, int [] ends){
        S97479=1;
    active[17]=1;
    ends[17]=1;
    tdone[17]=1;
  }

  public void thread113457(int [] tdone, int [] ends){
        S97492=1;
    S97491=0;
    thread113458(tdone,ends);
    thread113459(tdone,ends);
    int biggest113460 = 0;
    if(ends[17]>=biggest113460){
      biggest113460=ends[17];
    }
    if(ends[18]>=biggest113460){
      biggest113460=ends[18];
    }
    if(biggest113460 == 1){
      active[16]=1;
      ends[16]=1;
      tdone[16]=1;
    }
  }

  public void thread113456(int [] tdone, int [] ends){
        S97476=1;
    cylPos5ZAxisExtend.setPresent();//sysj\controller.sysj line: 212, column: 7
    currsigs.addElement(cylPos5ZAxisExtend);
    active[15]=1;
    ends[15]=1;
    tdone[15]=1;
  }

  public void thread113455(int [] tdone, int [] ends){
        S97470=1;
    cylClampBottleExtend.setPresent();//sysj\controller.sysj line: 206, column: 7
    currsigs.addElement(cylClampBottleExtend);
    active[14]=1;
    ends[14]=1;
    tdone[14]=1;
  }

  public void thread113453(int [] tdone, int [] ends){
        S97505=1;
    S97502=0;
    active[19]=1;
    ends[19]=1;
    tdone[19]=1;
  }

  public void thread113451(int [] tdone, int [] ends){
        S97482=1;
    active[18]=1;
    ends[18]=1;
    tdone[18]=1;
  }

  public void thread113450(int [] tdone, int [] ends){
        S97479=1;
    active[17]=1;
    ends[17]=1;
    tdone[17]=1;
  }

  public void thread113449(int [] tdone, int [] ends){
        S97492=1;
    S97491=0;
    thread113450(tdone,ends);
    thread113451(tdone,ends);
    int biggest113452 = 0;
    if(ends[17]>=biggest113452){
      biggest113452=ends[17];
    }
    if(ends[18]>=biggest113452){
      biggest113452=ends[18];
    }
    if(biggest113452 == 1){
      active[16]=1;
      ends[16]=1;
      tdone[16]=1;
    }
  }

  public void thread113448(int [] tdone, int [] ends){
        S97476=1;
    cylPos5ZAxisExtend.setPresent();//sysj\controller.sysj line: 212, column: 7
    currsigs.addElement(cylPos5ZAxisExtend);
    active[15]=1;
    ends[15]=1;
    tdone[15]=1;
  }

  public void thread113447(int [] tdone, int [] ends){
        S97470=1;
    cylClampBottleExtend.setPresent();//sysj\controller.sysj line: 206, column: 7
    currsigs.addElement(cylClampBottleExtend);
    active[14]=1;
    ends[14]=1;
    tdone[14]=1;
  }

  public void thread113445(int [] tdone, int [] ends){
        S97505=1;
    S97502=0;
    active[19]=1;
    ends[19]=1;
    tdone[19]=1;
  }

  public void thread113443(int [] tdone, int [] ends){
        S97482=1;
    active[18]=1;
    ends[18]=1;
    tdone[18]=1;
  }

  public void thread113442(int [] tdone, int [] ends){
        S97479=1;
    active[17]=1;
    ends[17]=1;
    tdone[17]=1;
  }

  public void thread113441(int [] tdone, int [] ends){
        S97492=1;
    S97491=0;
    thread113442(tdone,ends);
    thread113443(tdone,ends);
    int biggest113444 = 0;
    if(ends[17]>=biggest113444){
      biggest113444=ends[17];
    }
    if(ends[18]>=biggest113444){
      biggest113444=ends[18];
    }
    if(biggest113444 == 1){
      active[16]=1;
      ends[16]=1;
      tdone[16]=1;
    }
  }

  public void thread113440(int [] tdone, int [] ends){
        S97476=1;
    cylPos5ZAxisExtend.setPresent();//sysj\controller.sysj line: 212, column: 7
    currsigs.addElement(cylPos5ZAxisExtend);
    active[15]=1;
    ends[15]=1;
    tdone[15]=1;
  }

  public void thread113439(int [] tdone, int [] ends){
        S97470=1;
    cylClampBottleExtend.setPresent();//sysj\controller.sysj line: 206, column: 7
    currsigs.addElement(cylClampBottleExtend);
    active[14]=1;
    ends[14]=1;
    tdone[14]=1;
  }

  public void thread113437(int [] tdone, int [] ends){
        S97505=1;
    S97502=0;
    active[19]=1;
    ends[19]=1;
    tdone[19]=1;
  }

  public void thread113435(int [] tdone, int [] ends){
        S97482=1;
    active[18]=1;
    ends[18]=1;
    tdone[18]=1;
  }

  public void thread113434(int [] tdone, int [] ends){
        S97479=1;
    active[17]=1;
    ends[17]=1;
    tdone[17]=1;
  }

  public void thread113433(int [] tdone, int [] ends){
        S97492=1;
    S97491=0;
    thread113434(tdone,ends);
    thread113435(tdone,ends);
    int biggest113436 = 0;
    if(ends[17]>=biggest113436){
      biggest113436=ends[17];
    }
    if(ends[18]>=biggest113436){
      biggest113436=ends[18];
    }
    if(biggest113436 == 1){
      active[16]=1;
      ends[16]=1;
      tdone[16]=1;
    }
  }

  public void thread113432(int [] tdone, int [] ends){
        S97476=1;
    cylPos5ZAxisExtend.setPresent();//sysj\controller.sysj line: 212, column: 7
    currsigs.addElement(cylPos5ZAxisExtend);
    active[15]=1;
    ends[15]=1;
    tdone[15]=1;
  }

  public void thread113431(int [] tdone, int [] ends){
        S97470=1;
    cylClampBottleExtend.setPresent();//sysj\controller.sysj line: 206, column: 7
    currsigs.addElement(cylClampBottleExtend);
    active[14]=1;
    ends[14]=1;
    tdone[14]=1;
  }

  public void thread113429(int [] tdone, int [] ends){
        S97505=1;
    S97502=0;
    active[19]=1;
    ends[19]=1;
    tdone[19]=1;
  }

  public void thread113427(int [] tdone, int [] ends){
        S97482=1;
    active[18]=1;
    ends[18]=1;
    tdone[18]=1;
  }

  public void thread113426(int [] tdone, int [] ends){
        S97479=1;
    active[17]=1;
    ends[17]=1;
    tdone[17]=1;
  }

  public void thread113425(int [] tdone, int [] ends){
        S97492=1;
    S97491=0;
    thread113426(tdone,ends);
    thread113427(tdone,ends);
    int biggest113428 = 0;
    if(ends[17]>=biggest113428){
      biggest113428=ends[17];
    }
    if(ends[18]>=biggest113428){
      biggest113428=ends[18];
    }
    if(biggest113428 == 1){
      active[16]=1;
      ends[16]=1;
      tdone[16]=1;
    }
  }

  public void thread113424(int [] tdone, int [] ends){
        S97476=1;
    cylPos5ZAxisExtend.setPresent();//sysj\controller.sysj line: 212, column: 7
    currsigs.addElement(cylPos5ZAxisExtend);
    active[15]=1;
    ends[15]=1;
    tdone[15]=1;
  }

  public void thread113423(int [] tdone, int [] ends){
        S97470=1;
    cylClampBottleExtend.setPresent();//sysj\controller.sysj line: 206, column: 7
    currsigs.addElement(cylClampBottleExtend);
    active[14]=1;
    ends[14]=1;
    tdone[14]=1;
  }

  public void thread113421(int [] tdone, int [] ends){
        S97505=1;
    S97502=0;
    active[19]=1;
    ends[19]=1;
    tdone[19]=1;
  }

  public void thread113419(int [] tdone, int [] ends){
        S97482=1;
    active[18]=1;
    ends[18]=1;
    tdone[18]=1;
  }

  public void thread113418(int [] tdone, int [] ends){
        S97479=1;
    active[17]=1;
    ends[17]=1;
    tdone[17]=1;
  }

  public void thread113417(int [] tdone, int [] ends){
        S97492=1;
    S97491=0;
    thread113418(tdone,ends);
    thread113419(tdone,ends);
    int biggest113420 = 0;
    if(ends[17]>=biggest113420){
      biggest113420=ends[17];
    }
    if(ends[18]>=biggest113420){
      biggest113420=ends[18];
    }
    if(biggest113420 == 1){
      active[16]=1;
      ends[16]=1;
      tdone[16]=1;
    }
  }

  public void thread113416(int [] tdone, int [] ends){
        S97476=1;
    cylPos5ZAxisExtend.setPresent();//sysj\controller.sysj line: 212, column: 7
    currsigs.addElement(cylPos5ZAxisExtend);
    active[15]=1;
    ends[15]=1;
    tdone[15]=1;
  }

  public void thread113415(int [] tdone, int [] ends){
        S97470=1;
    cylClampBottleExtend.setPresent();//sysj\controller.sysj line: 206, column: 7
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
      switch(S108983){
        case 0 : 
          S108983=0;
          break RUN;
        
        case 1 : 
          S108983=2;
          S108983=2;
          releaseCap_13.setClear();//sysj\controller.sysj line: 189, column: 2
          untwistGripper_13.setClear();//sysj\controller.sysj line: 189, column: 2
          raiseGripper_13.setClear();//sysj\controller.sysj line: 189, column: 2
          unclampBottle_13.setClear();//sysj\controller.sysj line: 189, column: 2
          S97349=0;
          S97333=0;
          if(!capperReq_in.isPartnerPresent() || capperReq_in.isPartnerPreempted()){//sysj\controller.sysj line: 192, column: 3
            capperReq_in.setACK(false);//sysj\controller.sysj line: 192, column: 3
            S97333=1;
            active[13]=1;
            ends[13]=1;
            break RUN;
          }
          else {
            S97328=0;
            if(!capperReq_in.isREQ()){//sysj\controller.sysj line: 192, column: 3
              capperReq_in.setACK(true);//sysj\controller.sysj line: 192, column: 3
              S97328=1;
              if(capperReq_in.isREQ()){//sysj\controller.sysj line: 192, column: 3
                capperReq_in.setACK(false);//sysj\controller.sysj line: 192, column: 3
                ends[13]=2;
                ;//sysj\controller.sysj line: 192, column: 3
                request_thread_13 = (boolean)(capperReq_in.getVal() == null ? false : ((Boolean)capperReq_in.getVal()).booleanValue());//sysj\controller.sysj line: 193, column: 3
                S97349=1;
                if(request_thread_13){//sysj\controller.sysj line: 195, column: 3
                  S97464=0;
                  S97356=0;
                  if(!capperStatus_o.isPartnerPresent() || capperStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 196, column: 4
                    capperStatus_o.setREQ(false);//sysj\controller.sysj line: 196, column: 4
                    S97356=1;
                    active[13]=1;
                    ends[13]=1;
                    break RUN;
                  }
                  else {
                    S97351=0;
                    if(capperStatus_o.isACK()){//sysj\controller.sysj line: 196, column: 4
                      capperStatus_o.setVal("busy");//sysj\controller.sysj line: 196, column: 4
                      S97351=1;
                      if(!capperStatus_o.isACK()){//sysj\controller.sysj line: 196, column: 4
                        capperStatus_o.setREQ(false);//sysj\controller.sysj line: 196, column: 4
                        ends[13]=2;
                        ;//sysj\controller.sysj line: 196, column: 4
                        S97464=1;
                        if(!bottleAtPos4.getprestatus()){//sysj\controller.sysj line: 198, column: 13
                          S97378=0;
                          if(!capperStatus_o.isPartnerPresent() || capperStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 199, column: 5
                            capperStatus_o.setREQ(false);//sysj\controller.sysj line: 199, column: 5
                            S97378=1;
                            active[13]=1;
                            ends[13]=1;
                            break RUN;
                          }
                          else {
                            S97373=0;
                            if(capperStatus_o.isACK()){//sysj\controller.sysj line: 199, column: 5
                              capperStatus_o.setVal("idle");//sysj\controller.sysj line: 199, column: 5
                              S97373=1;
                              if(!capperStatus_o.isACK()){//sysj\controller.sysj line: 199, column: 5
                                capperStatus_o.setREQ(false);//sysj\controller.sysj line: 199, column: 5
                                ends[13]=2;
                                ;//sysj\controller.sysj line: 199, column: 5
                                S97464=2;
                                if(bottleAtPos4.getprestatus()){//sysj\controller.sysj line: 202, column: 12
                                  System.out.println("Capper doing work...");//sysj\controller.sysj line: 203, column: 5
                                  thread113415(tdone,ends);
                                  thread113416(tdone,ends);
                                  thread113417(tdone,ends);
                                  thread113421(tdone,ends);
                                  int biggest113422 = 0;
                                  if(ends[14]>=biggest113422){
                                    biggest113422=ends[14];
                                  }
                                  if(ends[15]>=biggest113422){
                                    biggest113422=ends[15];
                                  }
                                  if(ends[16]>=biggest113422){
                                    biggest113422=ends[16];
                                  }
                                  if(ends[19]>=biggest113422){
                                    biggest113422=ends[19];
                                  }
                                  if(biggest113422 == 1){
                                    active[13]=1;
                                    ends[13]=1;
                                    break RUN;
                                  }
                                }
                                else {
                                  S97349=2;
                                  S100844=0;
                                  if(!capperStatus_o.isPartnerPresent() || capperStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 241, column: 3
                                    capperStatus_o.setREQ(false);//sysj\controller.sysj line: 241, column: 3
                                    S100844=1;
                                    active[13]=1;
                                    ends[13]=1;
                                    break RUN;
                                  }
                                  else {
                                    S100839=0;
                                    if(capperStatus_o.isACK()){//sysj\controller.sysj line: 241, column: 3
                                      capperStatus_o.setVal("done");//sysj\controller.sysj line: 241, column: 3
                                      S100839=1;
                                      if(!capperStatus_o.isACK()){//sysj\controller.sysj line: 241, column: 3
                                        capperStatus_o.setREQ(false);//sysj\controller.sysj line: 241, column: 3
                                        ends[13]=2;
                                        ;//sysj\controller.sysj line: 241, column: 3
                                        S97349=3;
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
                          S97464=2;
                          if(bottleAtPos4.getprestatus()){//sysj\controller.sysj line: 202, column: 12
                            System.out.println("Capper doing work...");//sysj\controller.sysj line: 203, column: 5
                            thread113423(tdone,ends);
                            thread113424(tdone,ends);
                            thread113425(tdone,ends);
                            thread113429(tdone,ends);
                            int biggest113430 = 0;
                            if(ends[14]>=biggest113430){
                              biggest113430=ends[14];
                            }
                            if(ends[15]>=biggest113430){
                              biggest113430=ends[15];
                            }
                            if(ends[16]>=biggest113430){
                              biggest113430=ends[16];
                            }
                            if(ends[19]>=biggest113430){
                              biggest113430=ends[19];
                            }
                            if(biggest113430 == 1){
                              active[13]=1;
                              ends[13]=1;
                              break RUN;
                            }
                          }
                          else {
                            S97349=2;
                            S100844=0;
                            if(!capperStatus_o.isPartnerPresent() || capperStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 241, column: 3
                              capperStatus_o.setREQ(false);//sysj\controller.sysj line: 241, column: 3
                              S100844=1;
                              active[13]=1;
                              ends[13]=1;
                              break RUN;
                            }
                            else {
                              S100839=0;
                              if(capperStatus_o.isACK()){//sysj\controller.sysj line: 241, column: 3
                                capperStatus_o.setVal("done");//sysj\controller.sysj line: 241, column: 3
                                S100839=1;
                                if(!capperStatus_o.isACK()){//sysj\controller.sysj line: 241, column: 3
                                  capperStatus_o.setREQ(false);//sysj\controller.sysj line: 241, column: 3
                                  ends[13]=2;
                                  ;//sysj\controller.sysj line: 241, column: 3
                                  S97349=3;
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
                  S97349=2;
                  S100844=0;
                  if(!capperStatus_o.isPartnerPresent() || capperStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 241, column: 3
                    capperStatus_o.setREQ(false);//sysj\controller.sysj line: 241, column: 3
                    S100844=1;
                    active[13]=1;
                    ends[13]=1;
                    break RUN;
                  }
                  else {
                    S100839=0;
                    if(capperStatus_o.isACK()){//sysj\controller.sysj line: 241, column: 3
                      capperStatus_o.setVal("done");//sysj\controller.sysj line: 241, column: 3
                      S100839=1;
                      if(!capperStatus_o.isACK()){//sysj\controller.sysj line: 241, column: 3
                        capperStatus_o.setREQ(false);//sysj\controller.sysj line: 241, column: 3
                        ends[13]=2;
                        ;//sysj\controller.sysj line: 241, column: 3
                        S97349=3;
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
          releaseCap_13.setClear();//sysj\controller.sysj line: 189, column: 2
          untwistGripper_13.setClear();//sysj\controller.sysj line: 189, column: 2
          raiseGripper_13.setClear();//sysj\controller.sysj line: 189, column: 2
          unclampBottle_13.setClear();//sysj\controller.sysj line: 189, column: 2
          switch(S97349){
            case 0 : 
              switch(S97333){
                case 0 : 
                  if(!capperReq_in.isPartnerPresent() || capperReq_in.isPartnerPreempted()){//sysj\controller.sysj line: 192, column: 3
                    capperReq_in.setACK(false);//sysj\controller.sysj line: 192, column: 3
                    S97333=1;
                    active[13]=1;
                    ends[13]=1;
                    break RUN;
                  }
                  else {
                    switch(S97328){
                      case 0 : 
                        if(!capperReq_in.isREQ()){//sysj\controller.sysj line: 192, column: 3
                          capperReq_in.setACK(true);//sysj\controller.sysj line: 192, column: 3
                          S97328=1;
                          if(capperReq_in.isREQ()){//sysj\controller.sysj line: 192, column: 3
                            capperReq_in.setACK(false);//sysj\controller.sysj line: 192, column: 3
                            ends[13]=2;
                            ;//sysj\controller.sysj line: 192, column: 3
                            request_thread_13 = (boolean)(capperReq_in.getVal() == null ? false : ((Boolean)capperReq_in.getVal()).booleanValue());//sysj\controller.sysj line: 193, column: 3
                            S97349=1;
                            if(request_thread_13){//sysj\controller.sysj line: 195, column: 3
                              S97464=0;
                              S97356=0;
                              if(!capperStatus_o.isPartnerPresent() || capperStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 196, column: 4
                                capperStatus_o.setREQ(false);//sysj\controller.sysj line: 196, column: 4
                                S97356=1;
                                active[13]=1;
                                ends[13]=1;
                                break RUN;
                              }
                              else {
                                S97351=0;
                                if(capperStatus_o.isACK()){//sysj\controller.sysj line: 196, column: 4
                                  capperStatus_o.setVal("busy");//sysj\controller.sysj line: 196, column: 4
                                  S97351=1;
                                  if(!capperStatus_o.isACK()){//sysj\controller.sysj line: 196, column: 4
                                    capperStatus_o.setREQ(false);//sysj\controller.sysj line: 196, column: 4
                                    ends[13]=2;
                                    ;//sysj\controller.sysj line: 196, column: 4
                                    S97464=1;
                                    if(!bottleAtPos4.getprestatus()){//sysj\controller.sysj line: 198, column: 13
                                      S97378=0;
                                      if(!capperStatus_o.isPartnerPresent() || capperStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 199, column: 5
                                        capperStatus_o.setREQ(false);//sysj\controller.sysj line: 199, column: 5
                                        S97378=1;
                                        active[13]=1;
                                        ends[13]=1;
                                        break RUN;
                                      }
                                      else {
                                        S97373=0;
                                        if(capperStatus_o.isACK()){//sysj\controller.sysj line: 199, column: 5
                                          capperStatus_o.setVal("idle");//sysj\controller.sysj line: 199, column: 5
                                          S97373=1;
                                          if(!capperStatus_o.isACK()){//sysj\controller.sysj line: 199, column: 5
                                            capperStatus_o.setREQ(false);//sysj\controller.sysj line: 199, column: 5
                                            ends[13]=2;
                                            ;//sysj\controller.sysj line: 199, column: 5
                                            S97464=2;
                                            if(bottleAtPos4.getprestatus()){//sysj\controller.sysj line: 202, column: 12
                                              System.out.println("Capper doing work...");//sysj\controller.sysj line: 203, column: 5
                                              thread113431(tdone,ends);
                                              thread113432(tdone,ends);
                                              thread113433(tdone,ends);
                                              thread113437(tdone,ends);
                                              int biggest113438 = 0;
                                              if(ends[14]>=biggest113438){
                                                biggest113438=ends[14];
                                              }
                                              if(ends[15]>=biggest113438){
                                                biggest113438=ends[15];
                                              }
                                              if(ends[16]>=biggest113438){
                                                biggest113438=ends[16];
                                              }
                                              if(ends[19]>=biggest113438){
                                                biggest113438=ends[19];
                                              }
                                              if(biggest113438 == 1){
                                                active[13]=1;
                                                ends[13]=1;
                                                break RUN;
                                              }
                                            }
                                            else {
                                              S97349=2;
                                              S100844=0;
                                              if(!capperStatus_o.isPartnerPresent() || capperStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 241, column: 3
                                                capperStatus_o.setREQ(false);//sysj\controller.sysj line: 241, column: 3
                                                S100844=1;
                                                active[13]=1;
                                                ends[13]=1;
                                                break RUN;
                                              }
                                              else {
                                                S100839=0;
                                                if(capperStatus_o.isACK()){//sysj\controller.sysj line: 241, column: 3
                                                  capperStatus_o.setVal("done");//sysj\controller.sysj line: 241, column: 3
                                                  S100839=1;
                                                  if(!capperStatus_o.isACK()){//sysj\controller.sysj line: 241, column: 3
                                                    capperStatus_o.setREQ(false);//sysj\controller.sysj line: 241, column: 3
                                                    ends[13]=2;
                                                    ;//sysj\controller.sysj line: 241, column: 3
                                                    S97349=3;
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
                                      S97464=2;
                                      if(bottleAtPos4.getprestatus()){//sysj\controller.sysj line: 202, column: 12
                                        System.out.println("Capper doing work...");//sysj\controller.sysj line: 203, column: 5
                                        thread113439(tdone,ends);
                                        thread113440(tdone,ends);
                                        thread113441(tdone,ends);
                                        thread113445(tdone,ends);
                                        int biggest113446 = 0;
                                        if(ends[14]>=biggest113446){
                                          biggest113446=ends[14];
                                        }
                                        if(ends[15]>=biggest113446){
                                          biggest113446=ends[15];
                                        }
                                        if(ends[16]>=biggest113446){
                                          biggest113446=ends[16];
                                        }
                                        if(ends[19]>=biggest113446){
                                          biggest113446=ends[19];
                                        }
                                        if(biggest113446 == 1){
                                          active[13]=1;
                                          ends[13]=1;
                                          break RUN;
                                        }
                                      }
                                      else {
                                        S97349=2;
                                        S100844=0;
                                        if(!capperStatus_o.isPartnerPresent() || capperStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 241, column: 3
                                          capperStatus_o.setREQ(false);//sysj\controller.sysj line: 241, column: 3
                                          S100844=1;
                                          active[13]=1;
                                          ends[13]=1;
                                          break RUN;
                                        }
                                        else {
                                          S100839=0;
                                          if(capperStatus_o.isACK()){//sysj\controller.sysj line: 241, column: 3
                                            capperStatus_o.setVal("done");//sysj\controller.sysj line: 241, column: 3
                                            S100839=1;
                                            if(!capperStatus_o.isACK()){//sysj\controller.sysj line: 241, column: 3
                                              capperStatus_o.setREQ(false);//sysj\controller.sysj line: 241, column: 3
                                              ends[13]=2;
                                              ;//sysj\controller.sysj line: 241, column: 3
                                              S97349=3;
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
                              S97349=2;
                              S100844=0;
                              if(!capperStatus_o.isPartnerPresent() || capperStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 241, column: 3
                                capperStatus_o.setREQ(false);//sysj\controller.sysj line: 241, column: 3
                                S100844=1;
                                active[13]=1;
                                ends[13]=1;
                                break RUN;
                              }
                              else {
                                S100839=0;
                                if(capperStatus_o.isACK()){//sysj\controller.sysj line: 241, column: 3
                                  capperStatus_o.setVal("done");//sysj\controller.sysj line: 241, column: 3
                                  S100839=1;
                                  if(!capperStatus_o.isACK()){//sysj\controller.sysj line: 241, column: 3
                                    capperStatus_o.setREQ(false);//sysj\controller.sysj line: 241, column: 3
                                    ends[13]=2;
                                    ;//sysj\controller.sysj line: 241, column: 3
                                    S97349=3;
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
                        if(capperReq_in.isREQ()){//sysj\controller.sysj line: 192, column: 3
                          capperReq_in.setACK(false);//sysj\controller.sysj line: 192, column: 3
                          ends[13]=2;
                          ;//sysj\controller.sysj line: 192, column: 3
                          request_thread_13 = (boolean)(capperReq_in.getVal() == null ? false : ((Boolean)capperReq_in.getVal()).booleanValue());//sysj\controller.sysj line: 193, column: 3
                          S97349=1;
                          if(request_thread_13){//sysj\controller.sysj line: 195, column: 3
                            S97464=0;
                            S97356=0;
                            if(!capperStatus_o.isPartnerPresent() || capperStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 196, column: 4
                              capperStatus_o.setREQ(false);//sysj\controller.sysj line: 196, column: 4
                              S97356=1;
                              active[13]=1;
                              ends[13]=1;
                              break RUN;
                            }
                            else {
                              S97351=0;
                              if(capperStatus_o.isACK()){//sysj\controller.sysj line: 196, column: 4
                                capperStatus_o.setVal("busy");//sysj\controller.sysj line: 196, column: 4
                                S97351=1;
                                if(!capperStatus_o.isACK()){//sysj\controller.sysj line: 196, column: 4
                                  capperStatus_o.setREQ(false);//sysj\controller.sysj line: 196, column: 4
                                  ends[13]=2;
                                  ;//sysj\controller.sysj line: 196, column: 4
                                  S97464=1;
                                  if(!bottleAtPos4.getprestatus()){//sysj\controller.sysj line: 198, column: 13
                                    S97378=0;
                                    if(!capperStatus_o.isPartnerPresent() || capperStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 199, column: 5
                                      capperStatus_o.setREQ(false);//sysj\controller.sysj line: 199, column: 5
                                      S97378=1;
                                      active[13]=1;
                                      ends[13]=1;
                                      break RUN;
                                    }
                                    else {
                                      S97373=0;
                                      if(capperStatus_o.isACK()){//sysj\controller.sysj line: 199, column: 5
                                        capperStatus_o.setVal("idle");//sysj\controller.sysj line: 199, column: 5
                                        S97373=1;
                                        if(!capperStatus_o.isACK()){//sysj\controller.sysj line: 199, column: 5
                                          capperStatus_o.setREQ(false);//sysj\controller.sysj line: 199, column: 5
                                          ends[13]=2;
                                          ;//sysj\controller.sysj line: 199, column: 5
                                          S97464=2;
                                          if(bottleAtPos4.getprestatus()){//sysj\controller.sysj line: 202, column: 12
                                            System.out.println("Capper doing work...");//sysj\controller.sysj line: 203, column: 5
                                            thread113447(tdone,ends);
                                            thread113448(tdone,ends);
                                            thread113449(tdone,ends);
                                            thread113453(tdone,ends);
                                            int biggest113454 = 0;
                                            if(ends[14]>=biggest113454){
                                              biggest113454=ends[14];
                                            }
                                            if(ends[15]>=biggest113454){
                                              biggest113454=ends[15];
                                            }
                                            if(ends[16]>=biggest113454){
                                              biggest113454=ends[16];
                                            }
                                            if(ends[19]>=biggest113454){
                                              biggest113454=ends[19];
                                            }
                                            if(biggest113454 == 1){
                                              active[13]=1;
                                              ends[13]=1;
                                              break RUN;
                                            }
                                          }
                                          else {
                                            S97349=2;
                                            S100844=0;
                                            if(!capperStatus_o.isPartnerPresent() || capperStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 241, column: 3
                                              capperStatus_o.setREQ(false);//sysj\controller.sysj line: 241, column: 3
                                              S100844=1;
                                              active[13]=1;
                                              ends[13]=1;
                                              break RUN;
                                            }
                                            else {
                                              S100839=0;
                                              if(capperStatus_o.isACK()){//sysj\controller.sysj line: 241, column: 3
                                                capperStatus_o.setVal("done");//sysj\controller.sysj line: 241, column: 3
                                                S100839=1;
                                                if(!capperStatus_o.isACK()){//sysj\controller.sysj line: 241, column: 3
                                                  capperStatus_o.setREQ(false);//sysj\controller.sysj line: 241, column: 3
                                                  ends[13]=2;
                                                  ;//sysj\controller.sysj line: 241, column: 3
                                                  S97349=3;
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
                                    S97464=2;
                                    if(bottleAtPos4.getprestatus()){//sysj\controller.sysj line: 202, column: 12
                                      System.out.println("Capper doing work...");//sysj\controller.sysj line: 203, column: 5
                                      thread113455(tdone,ends);
                                      thread113456(tdone,ends);
                                      thread113457(tdone,ends);
                                      thread113461(tdone,ends);
                                      int biggest113462 = 0;
                                      if(ends[14]>=biggest113462){
                                        biggest113462=ends[14];
                                      }
                                      if(ends[15]>=biggest113462){
                                        biggest113462=ends[15];
                                      }
                                      if(ends[16]>=biggest113462){
                                        biggest113462=ends[16];
                                      }
                                      if(ends[19]>=biggest113462){
                                        biggest113462=ends[19];
                                      }
                                      if(biggest113462 == 1){
                                        active[13]=1;
                                        ends[13]=1;
                                        break RUN;
                                      }
                                    }
                                    else {
                                      S97349=2;
                                      S100844=0;
                                      if(!capperStatus_o.isPartnerPresent() || capperStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 241, column: 3
                                        capperStatus_o.setREQ(false);//sysj\controller.sysj line: 241, column: 3
                                        S100844=1;
                                        active[13]=1;
                                        ends[13]=1;
                                        break RUN;
                                      }
                                      else {
                                        S100839=0;
                                        if(capperStatus_o.isACK()){//sysj\controller.sysj line: 241, column: 3
                                          capperStatus_o.setVal("done");//sysj\controller.sysj line: 241, column: 3
                                          S100839=1;
                                          if(!capperStatus_o.isACK()){//sysj\controller.sysj line: 241, column: 3
                                            capperStatus_o.setREQ(false);//sysj\controller.sysj line: 241, column: 3
                                            ends[13]=2;
                                            ;//sysj\controller.sysj line: 241, column: 3
                                            S97349=3;
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
                            S97349=2;
                            S100844=0;
                            if(!capperStatus_o.isPartnerPresent() || capperStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 241, column: 3
                              capperStatus_o.setREQ(false);//sysj\controller.sysj line: 241, column: 3
                              S100844=1;
                              active[13]=1;
                              ends[13]=1;
                              break RUN;
                            }
                            else {
                              S100839=0;
                              if(capperStatus_o.isACK()){//sysj\controller.sysj line: 241, column: 3
                                capperStatus_o.setVal("done");//sysj\controller.sysj line: 241, column: 3
                                S100839=1;
                                if(!capperStatus_o.isACK()){//sysj\controller.sysj line: 241, column: 3
                                  capperStatus_o.setREQ(false);//sysj\controller.sysj line: 241, column: 3
                                  ends[13]=2;
                                  ;//sysj\controller.sysj line: 241, column: 3
                                  S97349=3;
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
                  S97333=1;
                  S97333=0;
                  if(!capperReq_in.isPartnerPresent() || capperReq_in.isPartnerPreempted()){//sysj\controller.sysj line: 192, column: 3
                    capperReq_in.setACK(false);//sysj\controller.sysj line: 192, column: 3
                    S97333=1;
                    active[13]=1;
                    ends[13]=1;
                    break RUN;
                  }
                  else {
                    S97328=0;
                    if(!capperReq_in.isREQ()){//sysj\controller.sysj line: 192, column: 3
                      capperReq_in.setACK(true);//sysj\controller.sysj line: 192, column: 3
                      S97328=1;
                      if(capperReq_in.isREQ()){//sysj\controller.sysj line: 192, column: 3
                        capperReq_in.setACK(false);//sysj\controller.sysj line: 192, column: 3
                        ends[13]=2;
                        ;//sysj\controller.sysj line: 192, column: 3
                        request_thread_13 = (boolean)(capperReq_in.getVal() == null ? false : ((Boolean)capperReq_in.getVal()).booleanValue());//sysj\controller.sysj line: 193, column: 3
                        S97349=1;
                        if(request_thread_13){//sysj\controller.sysj line: 195, column: 3
                          S97464=0;
                          S97356=0;
                          if(!capperStatus_o.isPartnerPresent() || capperStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 196, column: 4
                            capperStatus_o.setREQ(false);//sysj\controller.sysj line: 196, column: 4
                            S97356=1;
                            active[13]=1;
                            ends[13]=1;
                            break RUN;
                          }
                          else {
                            S97351=0;
                            if(capperStatus_o.isACK()){//sysj\controller.sysj line: 196, column: 4
                              capperStatus_o.setVal("busy");//sysj\controller.sysj line: 196, column: 4
                              S97351=1;
                              if(!capperStatus_o.isACK()){//sysj\controller.sysj line: 196, column: 4
                                capperStatus_o.setREQ(false);//sysj\controller.sysj line: 196, column: 4
                                ends[13]=2;
                                ;//sysj\controller.sysj line: 196, column: 4
                                S97464=1;
                                if(!bottleAtPos4.getprestatus()){//sysj\controller.sysj line: 198, column: 13
                                  S97378=0;
                                  if(!capperStatus_o.isPartnerPresent() || capperStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 199, column: 5
                                    capperStatus_o.setREQ(false);//sysj\controller.sysj line: 199, column: 5
                                    S97378=1;
                                    active[13]=1;
                                    ends[13]=1;
                                    break RUN;
                                  }
                                  else {
                                    S97373=0;
                                    if(capperStatus_o.isACK()){//sysj\controller.sysj line: 199, column: 5
                                      capperStatus_o.setVal("idle");//sysj\controller.sysj line: 199, column: 5
                                      S97373=1;
                                      if(!capperStatus_o.isACK()){//sysj\controller.sysj line: 199, column: 5
                                        capperStatus_o.setREQ(false);//sysj\controller.sysj line: 199, column: 5
                                        ends[13]=2;
                                        ;//sysj\controller.sysj line: 199, column: 5
                                        S97464=2;
                                        if(bottleAtPos4.getprestatus()){//sysj\controller.sysj line: 202, column: 12
                                          System.out.println("Capper doing work...");//sysj\controller.sysj line: 203, column: 5
                                          thread113463(tdone,ends);
                                          thread113464(tdone,ends);
                                          thread113465(tdone,ends);
                                          thread113469(tdone,ends);
                                          int biggest113470 = 0;
                                          if(ends[14]>=biggest113470){
                                            biggest113470=ends[14];
                                          }
                                          if(ends[15]>=biggest113470){
                                            biggest113470=ends[15];
                                          }
                                          if(ends[16]>=biggest113470){
                                            biggest113470=ends[16];
                                          }
                                          if(ends[19]>=biggest113470){
                                            biggest113470=ends[19];
                                          }
                                          if(biggest113470 == 1){
                                            active[13]=1;
                                            ends[13]=1;
                                            break RUN;
                                          }
                                        }
                                        else {
                                          S97349=2;
                                          S100844=0;
                                          if(!capperStatus_o.isPartnerPresent() || capperStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 241, column: 3
                                            capperStatus_o.setREQ(false);//sysj\controller.sysj line: 241, column: 3
                                            S100844=1;
                                            active[13]=1;
                                            ends[13]=1;
                                            break RUN;
                                          }
                                          else {
                                            S100839=0;
                                            if(capperStatus_o.isACK()){//sysj\controller.sysj line: 241, column: 3
                                              capperStatus_o.setVal("done");//sysj\controller.sysj line: 241, column: 3
                                              S100839=1;
                                              if(!capperStatus_o.isACK()){//sysj\controller.sysj line: 241, column: 3
                                                capperStatus_o.setREQ(false);//sysj\controller.sysj line: 241, column: 3
                                                ends[13]=2;
                                                ;//sysj\controller.sysj line: 241, column: 3
                                                S97349=3;
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
                                  S97464=2;
                                  if(bottleAtPos4.getprestatus()){//sysj\controller.sysj line: 202, column: 12
                                    System.out.println("Capper doing work...");//sysj\controller.sysj line: 203, column: 5
                                    thread113471(tdone,ends);
                                    thread113472(tdone,ends);
                                    thread113473(tdone,ends);
                                    thread113477(tdone,ends);
                                    int biggest113478 = 0;
                                    if(ends[14]>=biggest113478){
                                      biggest113478=ends[14];
                                    }
                                    if(ends[15]>=biggest113478){
                                      biggest113478=ends[15];
                                    }
                                    if(ends[16]>=biggest113478){
                                      biggest113478=ends[16];
                                    }
                                    if(ends[19]>=biggest113478){
                                      biggest113478=ends[19];
                                    }
                                    if(biggest113478 == 1){
                                      active[13]=1;
                                      ends[13]=1;
                                      break RUN;
                                    }
                                  }
                                  else {
                                    S97349=2;
                                    S100844=0;
                                    if(!capperStatus_o.isPartnerPresent() || capperStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 241, column: 3
                                      capperStatus_o.setREQ(false);//sysj\controller.sysj line: 241, column: 3
                                      S100844=1;
                                      active[13]=1;
                                      ends[13]=1;
                                      break RUN;
                                    }
                                    else {
                                      S100839=0;
                                      if(capperStatus_o.isACK()){//sysj\controller.sysj line: 241, column: 3
                                        capperStatus_o.setVal("done");//sysj\controller.sysj line: 241, column: 3
                                        S100839=1;
                                        if(!capperStatus_o.isACK()){//sysj\controller.sysj line: 241, column: 3
                                          capperStatus_o.setREQ(false);//sysj\controller.sysj line: 241, column: 3
                                          ends[13]=2;
                                          ;//sysj\controller.sysj line: 241, column: 3
                                          S97349=3;
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
                          S97349=2;
                          S100844=0;
                          if(!capperStatus_o.isPartnerPresent() || capperStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 241, column: 3
                            capperStatus_o.setREQ(false);//sysj\controller.sysj line: 241, column: 3
                            S100844=1;
                            active[13]=1;
                            ends[13]=1;
                            break RUN;
                          }
                          else {
                            S100839=0;
                            if(capperStatus_o.isACK()){//sysj\controller.sysj line: 241, column: 3
                              capperStatus_o.setVal("done");//sysj\controller.sysj line: 241, column: 3
                              S100839=1;
                              if(!capperStatus_o.isACK()){//sysj\controller.sysj line: 241, column: 3
                                capperStatus_o.setREQ(false);//sysj\controller.sysj line: 241, column: 3
                                ends[13]=2;
                                ;//sysj\controller.sysj line: 241, column: 3
                                S97349=3;
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
              switch(S97464){
                case 0 : 
                  switch(S97356){
                    case 0 : 
                      if(!capperStatus_o.isPartnerPresent() || capperStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 196, column: 4
                        capperStatus_o.setREQ(false);//sysj\controller.sysj line: 196, column: 4
                        S97356=1;
                        active[13]=1;
                        ends[13]=1;
                        break RUN;
                      }
                      else {
                        switch(S97351){
                          case 0 : 
                            if(capperStatus_o.isACK()){//sysj\controller.sysj line: 196, column: 4
                              capperStatus_o.setVal("busy");//sysj\controller.sysj line: 196, column: 4
                              S97351=1;
                              if(!capperStatus_o.isACK()){//sysj\controller.sysj line: 196, column: 4
                                capperStatus_o.setREQ(false);//sysj\controller.sysj line: 196, column: 4
                                ends[13]=2;
                                ;//sysj\controller.sysj line: 196, column: 4
                                S97464=1;
                                if(!bottleAtPos4.getprestatus()){//sysj\controller.sysj line: 198, column: 13
                                  S97378=0;
                                  if(!capperStatus_o.isPartnerPresent() || capperStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 199, column: 5
                                    capperStatus_o.setREQ(false);//sysj\controller.sysj line: 199, column: 5
                                    S97378=1;
                                    active[13]=1;
                                    ends[13]=1;
                                    break RUN;
                                  }
                                  else {
                                    S97373=0;
                                    if(capperStatus_o.isACK()){//sysj\controller.sysj line: 199, column: 5
                                      capperStatus_o.setVal("idle");//sysj\controller.sysj line: 199, column: 5
                                      S97373=1;
                                      if(!capperStatus_o.isACK()){//sysj\controller.sysj line: 199, column: 5
                                        capperStatus_o.setREQ(false);//sysj\controller.sysj line: 199, column: 5
                                        ends[13]=2;
                                        ;//sysj\controller.sysj line: 199, column: 5
                                        S97464=2;
                                        if(bottleAtPos4.getprestatus()){//sysj\controller.sysj line: 202, column: 12
                                          System.out.println("Capper doing work...");//sysj\controller.sysj line: 203, column: 5
                                          thread113479(tdone,ends);
                                          thread113480(tdone,ends);
                                          thread113481(tdone,ends);
                                          thread113485(tdone,ends);
                                          int biggest113486 = 0;
                                          if(ends[14]>=biggest113486){
                                            biggest113486=ends[14];
                                          }
                                          if(ends[15]>=biggest113486){
                                            biggest113486=ends[15];
                                          }
                                          if(ends[16]>=biggest113486){
                                            biggest113486=ends[16];
                                          }
                                          if(ends[19]>=biggest113486){
                                            biggest113486=ends[19];
                                          }
                                          if(biggest113486 == 1){
                                            active[13]=1;
                                            ends[13]=1;
                                            break RUN;
                                          }
                                        }
                                        else {
                                          S97349=2;
                                          S100844=0;
                                          if(!capperStatus_o.isPartnerPresent() || capperStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 241, column: 3
                                            capperStatus_o.setREQ(false);//sysj\controller.sysj line: 241, column: 3
                                            S100844=1;
                                            active[13]=1;
                                            ends[13]=1;
                                            break RUN;
                                          }
                                          else {
                                            S100839=0;
                                            if(capperStatus_o.isACK()){//sysj\controller.sysj line: 241, column: 3
                                              capperStatus_o.setVal("done");//sysj\controller.sysj line: 241, column: 3
                                              S100839=1;
                                              if(!capperStatus_o.isACK()){//sysj\controller.sysj line: 241, column: 3
                                                capperStatus_o.setREQ(false);//sysj\controller.sysj line: 241, column: 3
                                                ends[13]=2;
                                                ;//sysj\controller.sysj line: 241, column: 3
                                                S97349=3;
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
                                  S97464=2;
                                  if(bottleAtPos4.getprestatus()){//sysj\controller.sysj line: 202, column: 12
                                    System.out.println("Capper doing work...");//sysj\controller.sysj line: 203, column: 5
                                    thread113487(tdone,ends);
                                    thread113488(tdone,ends);
                                    thread113489(tdone,ends);
                                    thread113493(tdone,ends);
                                    int biggest113494 = 0;
                                    if(ends[14]>=biggest113494){
                                      biggest113494=ends[14];
                                    }
                                    if(ends[15]>=biggest113494){
                                      biggest113494=ends[15];
                                    }
                                    if(ends[16]>=biggest113494){
                                      biggest113494=ends[16];
                                    }
                                    if(ends[19]>=biggest113494){
                                      biggest113494=ends[19];
                                    }
                                    if(biggest113494 == 1){
                                      active[13]=1;
                                      ends[13]=1;
                                      break RUN;
                                    }
                                  }
                                  else {
                                    S97349=2;
                                    S100844=0;
                                    if(!capperStatus_o.isPartnerPresent() || capperStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 241, column: 3
                                      capperStatus_o.setREQ(false);//sysj\controller.sysj line: 241, column: 3
                                      S100844=1;
                                      active[13]=1;
                                      ends[13]=1;
                                      break RUN;
                                    }
                                    else {
                                      S100839=0;
                                      if(capperStatus_o.isACK()){//sysj\controller.sysj line: 241, column: 3
                                        capperStatus_o.setVal("done");//sysj\controller.sysj line: 241, column: 3
                                        S100839=1;
                                        if(!capperStatus_o.isACK()){//sysj\controller.sysj line: 241, column: 3
                                          capperStatus_o.setREQ(false);//sysj\controller.sysj line: 241, column: 3
                                          ends[13]=2;
                                          ;//sysj\controller.sysj line: 241, column: 3
                                          S97349=3;
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
                            if(!capperStatus_o.isACK()){//sysj\controller.sysj line: 196, column: 4
                              capperStatus_o.setREQ(false);//sysj\controller.sysj line: 196, column: 4
                              ends[13]=2;
                              ;//sysj\controller.sysj line: 196, column: 4
                              S97464=1;
                              if(!bottleAtPos4.getprestatus()){//sysj\controller.sysj line: 198, column: 13
                                S97378=0;
                                if(!capperStatus_o.isPartnerPresent() || capperStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 199, column: 5
                                  capperStatus_o.setREQ(false);//sysj\controller.sysj line: 199, column: 5
                                  S97378=1;
                                  active[13]=1;
                                  ends[13]=1;
                                  break RUN;
                                }
                                else {
                                  S97373=0;
                                  if(capperStatus_o.isACK()){//sysj\controller.sysj line: 199, column: 5
                                    capperStatus_o.setVal("idle");//sysj\controller.sysj line: 199, column: 5
                                    S97373=1;
                                    if(!capperStatus_o.isACK()){//sysj\controller.sysj line: 199, column: 5
                                      capperStatus_o.setREQ(false);//sysj\controller.sysj line: 199, column: 5
                                      ends[13]=2;
                                      ;//sysj\controller.sysj line: 199, column: 5
                                      S97464=2;
                                      if(bottleAtPos4.getprestatus()){//sysj\controller.sysj line: 202, column: 12
                                        System.out.println("Capper doing work...");//sysj\controller.sysj line: 203, column: 5
                                        thread113495(tdone,ends);
                                        thread113496(tdone,ends);
                                        thread113497(tdone,ends);
                                        thread113501(tdone,ends);
                                        int biggest113502 = 0;
                                        if(ends[14]>=biggest113502){
                                          biggest113502=ends[14];
                                        }
                                        if(ends[15]>=biggest113502){
                                          biggest113502=ends[15];
                                        }
                                        if(ends[16]>=biggest113502){
                                          biggest113502=ends[16];
                                        }
                                        if(ends[19]>=biggest113502){
                                          biggest113502=ends[19];
                                        }
                                        if(biggest113502 == 1){
                                          active[13]=1;
                                          ends[13]=1;
                                          break RUN;
                                        }
                                      }
                                      else {
                                        S97349=2;
                                        S100844=0;
                                        if(!capperStatus_o.isPartnerPresent() || capperStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 241, column: 3
                                          capperStatus_o.setREQ(false);//sysj\controller.sysj line: 241, column: 3
                                          S100844=1;
                                          active[13]=1;
                                          ends[13]=1;
                                          break RUN;
                                        }
                                        else {
                                          S100839=0;
                                          if(capperStatus_o.isACK()){//sysj\controller.sysj line: 241, column: 3
                                            capperStatus_o.setVal("done");//sysj\controller.sysj line: 241, column: 3
                                            S100839=1;
                                            if(!capperStatus_o.isACK()){//sysj\controller.sysj line: 241, column: 3
                                              capperStatus_o.setREQ(false);//sysj\controller.sysj line: 241, column: 3
                                              ends[13]=2;
                                              ;//sysj\controller.sysj line: 241, column: 3
                                              S97349=3;
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
                                S97464=2;
                                if(bottleAtPos4.getprestatus()){//sysj\controller.sysj line: 202, column: 12
                                  System.out.println("Capper doing work...");//sysj\controller.sysj line: 203, column: 5
                                  thread113503(tdone,ends);
                                  thread113504(tdone,ends);
                                  thread113505(tdone,ends);
                                  thread113509(tdone,ends);
                                  int biggest113510 = 0;
                                  if(ends[14]>=biggest113510){
                                    biggest113510=ends[14];
                                  }
                                  if(ends[15]>=biggest113510){
                                    biggest113510=ends[15];
                                  }
                                  if(ends[16]>=biggest113510){
                                    biggest113510=ends[16];
                                  }
                                  if(ends[19]>=biggest113510){
                                    biggest113510=ends[19];
                                  }
                                  if(biggest113510 == 1){
                                    active[13]=1;
                                    ends[13]=1;
                                    break RUN;
                                  }
                                }
                                else {
                                  S97349=2;
                                  S100844=0;
                                  if(!capperStatus_o.isPartnerPresent() || capperStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 241, column: 3
                                    capperStatus_o.setREQ(false);//sysj\controller.sysj line: 241, column: 3
                                    S100844=1;
                                    active[13]=1;
                                    ends[13]=1;
                                    break RUN;
                                  }
                                  else {
                                    S100839=0;
                                    if(capperStatus_o.isACK()){//sysj\controller.sysj line: 241, column: 3
                                      capperStatus_o.setVal("done");//sysj\controller.sysj line: 241, column: 3
                                      S100839=1;
                                      if(!capperStatus_o.isACK()){//sysj\controller.sysj line: 241, column: 3
                                        capperStatus_o.setREQ(false);//sysj\controller.sysj line: 241, column: 3
                                        ends[13]=2;
                                        ;//sysj\controller.sysj line: 241, column: 3
                                        S97349=3;
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
                      S97356=1;
                      S97356=0;
                      if(!capperStatus_o.isPartnerPresent() || capperStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 196, column: 4
                        capperStatus_o.setREQ(false);//sysj\controller.sysj line: 196, column: 4
                        S97356=1;
                        active[13]=1;
                        ends[13]=1;
                        break RUN;
                      }
                      else {
                        S97351=0;
                        if(capperStatus_o.isACK()){//sysj\controller.sysj line: 196, column: 4
                          capperStatus_o.setVal("busy");//sysj\controller.sysj line: 196, column: 4
                          S97351=1;
                          if(!capperStatus_o.isACK()){//sysj\controller.sysj line: 196, column: 4
                            capperStatus_o.setREQ(false);//sysj\controller.sysj line: 196, column: 4
                            ends[13]=2;
                            ;//sysj\controller.sysj line: 196, column: 4
                            S97464=1;
                            if(!bottleAtPos4.getprestatus()){//sysj\controller.sysj line: 198, column: 13
                              S97378=0;
                              if(!capperStatus_o.isPartnerPresent() || capperStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 199, column: 5
                                capperStatus_o.setREQ(false);//sysj\controller.sysj line: 199, column: 5
                                S97378=1;
                                active[13]=1;
                                ends[13]=1;
                                break RUN;
                              }
                              else {
                                S97373=0;
                                if(capperStatus_o.isACK()){//sysj\controller.sysj line: 199, column: 5
                                  capperStatus_o.setVal("idle");//sysj\controller.sysj line: 199, column: 5
                                  S97373=1;
                                  if(!capperStatus_o.isACK()){//sysj\controller.sysj line: 199, column: 5
                                    capperStatus_o.setREQ(false);//sysj\controller.sysj line: 199, column: 5
                                    ends[13]=2;
                                    ;//sysj\controller.sysj line: 199, column: 5
                                    S97464=2;
                                    if(bottleAtPos4.getprestatus()){//sysj\controller.sysj line: 202, column: 12
                                      System.out.println("Capper doing work...");//sysj\controller.sysj line: 203, column: 5
                                      thread113511(tdone,ends);
                                      thread113512(tdone,ends);
                                      thread113513(tdone,ends);
                                      thread113517(tdone,ends);
                                      int biggest113518 = 0;
                                      if(ends[14]>=biggest113518){
                                        biggest113518=ends[14];
                                      }
                                      if(ends[15]>=biggest113518){
                                        biggest113518=ends[15];
                                      }
                                      if(ends[16]>=biggest113518){
                                        biggest113518=ends[16];
                                      }
                                      if(ends[19]>=biggest113518){
                                        biggest113518=ends[19];
                                      }
                                      if(biggest113518 == 1){
                                        active[13]=1;
                                        ends[13]=1;
                                        break RUN;
                                      }
                                    }
                                    else {
                                      S97349=2;
                                      S100844=0;
                                      if(!capperStatus_o.isPartnerPresent() || capperStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 241, column: 3
                                        capperStatus_o.setREQ(false);//sysj\controller.sysj line: 241, column: 3
                                        S100844=1;
                                        active[13]=1;
                                        ends[13]=1;
                                        break RUN;
                                      }
                                      else {
                                        S100839=0;
                                        if(capperStatus_o.isACK()){//sysj\controller.sysj line: 241, column: 3
                                          capperStatus_o.setVal("done");//sysj\controller.sysj line: 241, column: 3
                                          S100839=1;
                                          if(!capperStatus_o.isACK()){//sysj\controller.sysj line: 241, column: 3
                                            capperStatus_o.setREQ(false);//sysj\controller.sysj line: 241, column: 3
                                            ends[13]=2;
                                            ;//sysj\controller.sysj line: 241, column: 3
                                            S97349=3;
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
                              S97464=2;
                              if(bottleAtPos4.getprestatus()){//sysj\controller.sysj line: 202, column: 12
                                System.out.println("Capper doing work...");//sysj\controller.sysj line: 203, column: 5
                                thread113519(tdone,ends);
                                thread113520(tdone,ends);
                                thread113521(tdone,ends);
                                thread113525(tdone,ends);
                                int biggest113526 = 0;
                                if(ends[14]>=biggest113526){
                                  biggest113526=ends[14];
                                }
                                if(ends[15]>=biggest113526){
                                  biggest113526=ends[15];
                                }
                                if(ends[16]>=biggest113526){
                                  biggest113526=ends[16];
                                }
                                if(ends[19]>=biggest113526){
                                  biggest113526=ends[19];
                                }
                                if(biggest113526 == 1){
                                  active[13]=1;
                                  ends[13]=1;
                                  break RUN;
                                }
                              }
                              else {
                                S97349=2;
                                S100844=0;
                                if(!capperStatus_o.isPartnerPresent() || capperStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 241, column: 3
                                  capperStatus_o.setREQ(false);//sysj\controller.sysj line: 241, column: 3
                                  S100844=1;
                                  active[13]=1;
                                  ends[13]=1;
                                  break RUN;
                                }
                                else {
                                  S100839=0;
                                  if(capperStatus_o.isACK()){//sysj\controller.sysj line: 241, column: 3
                                    capperStatus_o.setVal("done");//sysj\controller.sysj line: 241, column: 3
                                    S100839=1;
                                    if(!capperStatus_o.isACK()){//sysj\controller.sysj line: 241, column: 3
                                      capperStatus_o.setREQ(false);//sysj\controller.sysj line: 241, column: 3
                                      ends[13]=2;
                                      ;//sysj\controller.sysj line: 241, column: 3
                                      S97349=3;
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
                  switch(S97378){
                    case 0 : 
                      if(!capperStatus_o.isPartnerPresent() || capperStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 199, column: 5
                        capperStatus_o.setREQ(false);//sysj\controller.sysj line: 199, column: 5
                        S97378=1;
                        active[13]=1;
                        ends[13]=1;
                        break RUN;
                      }
                      else {
                        switch(S97373){
                          case 0 : 
                            if(capperStatus_o.isACK()){//sysj\controller.sysj line: 199, column: 5
                              capperStatus_o.setVal("idle");//sysj\controller.sysj line: 199, column: 5
                              S97373=1;
                              if(!capperStatus_o.isACK()){//sysj\controller.sysj line: 199, column: 5
                                capperStatus_o.setREQ(false);//sysj\controller.sysj line: 199, column: 5
                                ends[13]=2;
                                ;//sysj\controller.sysj line: 199, column: 5
                                S97464=2;
                                if(bottleAtPos4.getprestatus()){//sysj\controller.sysj line: 202, column: 12
                                  System.out.println("Capper doing work...");//sysj\controller.sysj line: 203, column: 5
                                  thread113527(tdone,ends);
                                  thread113528(tdone,ends);
                                  thread113529(tdone,ends);
                                  thread113533(tdone,ends);
                                  int biggest113534 = 0;
                                  if(ends[14]>=biggest113534){
                                    biggest113534=ends[14];
                                  }
                                  if(ends[15]>=biggest113534){
                                    biggest113534=ends[15];
                                  }
                                  if(ends[16]>=biggest113534){
                                    biggest113534=ends[16];
                                  }
                                  if(ends[19]>=biggest113534){
                                    biggest113534=ends[19];
                                  }
                                  if(biggest113534 == 1){
                                    active[13]=1;
                                    ends[13]=1;
                                    break RUN;
                                  }
                                }
                                else {
                                  S97349=2;
                                  S100844=0;
                                  if(!capperStatus_o.isPartnerPresent() || capperStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 241, column: 3
                                    capperStatus_o.setREQ(false);//sysj\controller.sysj line: 241, column: 3
                                    S100844=1;
                                    active[13]=1;
                                    ends[13]=1;
                                    break RUN;
                                  }
                                  else {
                                    S100839=0;
                                    if(capperStatus_o.isACK()){//sysj\controller.sysj line: 241, column: 3
                                      capperStatus_o.setVal("done");//sysj\controller.sysj line: 241, column: 3
                                      S100839=1;
                                      if(!capperStatus_o.isACK()){//sysj\controller.sysj line: 241, column: 3
                                        capperStatus_o.setREQ(false);//sysj\controller.sysj line: 241, column: 3
                                        ends[13]=2;
                                        ;//sysj\controller.sysj line: 241, column: 3
                                        S97349=3;
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
                            if(!capperStatus_o.isACK()){//sysj\controller.sysj line: 199, column: 5
                              capperStatus_o.setREQ(false);//sysj\controller.sysj line: 199, column: 5
                              ends[13]=2;
                              ;//sysj\controller.sysj line: 199, column: 5
                              S97464=2;
                              if(bottleAtPos4.getprestatus()){//sysj\controller.sysj line: 202, column: 12
                                System.out.println("Capper doing work...");//sysj\controller.sysj line: 203, column: 5
                                thread113535(tdone,ends);
                                thread113536(tdone,ends);
                                thread113537(tdone,ends);
                                thread113541(tdone,ends);
                                int biggest113542 = 0;
                                if(ends[14]>=biggest113542){
                                  biggest113542=ends[14];
                                }
                                if(ends[15]>=biggest113542){
                                  biggest113542=ends[15];
                                }
                                if(ends[16]>=biggest113542){
                                  biggest113542=ends[16];
                                }
                                if(ends[19]>=biggest113542){
                                  biggest113542=ends[19];
                                }
                                if(biggest113542 == 1){
                                  active[13]=1;
                                  ends[13]=1;
                                  break RUN;
                                }
                              }
                              else {
                                S97349=2;
                                S100844=0;
                                if(!capperStatus_o.isPartnerPresent() || capperStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 241, column: 3
                                  capperStatus_o.setREQ(false);//sysj\controller.sysj line: 241, column: 3
                                  S100844=1;
                                  active[13]=1;
                                  ends[13]=1;
                                  break RUN;
                                }
                                else {
                                  S100839=0;
                                  if(capperStatus_o.isACK()){//sysj\controller.sysj line: 241, column: 3
                                    capperStatus_o.setVal("done");//sysj\controller.sysj line: 241, column: 3
                                    S100839=1;
                                    if(!capperStatus_o.isACK()){//sysj\controller.sysj line: 241, column: 3
                                      capperStatus_o.setREQ(false);//sysj\controller.sysj line: 241, column: 3
                                      ends[13]=2;
                                      ;//sysj\controller.sysj line: 241, column: 3
                                      S97349=3;
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
                      S97378=1;
                      S97378=0;
                      if(!capperStatus_o.isPartnerPresent() || capperStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 199, column: 5
                        capperStatus_o.setREQ(false);//sysj\controller.sysj line: 199, column: 5
                        S97378=1;
                        active[13]=1;
                        ends[13]=1;
                        break RUN;
                      }
                      else {
                        S97373=0;
                        if(capperStatus_o.isACK()){//sysj\controller.sysj line: 199, column: 5
                          capperStatus_o.setVal("idle");//sysj\controller.sysj line: 199, column: 5
                          S97373=1;
                          if(!capperStatus_o.isACK()){//sysj\controller.sysj line: 199, column: 5
                            capperStatus_o.setREQ(false);//sysj\controller.sysj line: 199, column: 5
                            ends[13]=2;
                            ;//sysj\controller.sysj line: 199, column: 5
                            S97464=2;
                            if(bottleAtPos4.getprestatus()){//sysj\controller.sysj line: 202, column: 12
                              System.out.println("Capper doing work...");//sysj\controller.sysj line: 203, column: 5
                              thread113543(tdone,ends);
                              thread113544(tdone,ends);
                              thread113545(tdone,ends);
                              thread113549(tdone,ends);
                              int biggest113550 = 0;
                              if(ends[14]>=biggest113550){
                                biggest113550=ends[14];
                              }
                              if(ends[15]>=biggest113550){
                                biggest113550=ends[15];
                              }
                              if(ends[16]>=biggest113550){
                                biggest113550=ends[16];
                              }
                              if(ends[19]>=biggest113550){
                                biggest113550=ends[19];
                              }
                              if(biggest113550 == 1){
                                active[13]=1;
                                ends[13]=1;
                                break RUN;
                              }
                            }
                            else {
                              S97349=2;
                              S100844=0;
                              if(!capperStatus_o.isPartnerPresent() || capperStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 241, column: 3
                                capperStatus_o.setREQ(false);//sysj\controller.sysj line: 241, column: 3
                                S100844=1;
                                active[13]=1;
                                ends[13]=1;
                                break RUN;
                              }
                              else {
                                S100839=0;
                                if(capperStatus_o.isACK()){//sysj\controller.sysj line: 241, column: 3
                                  capperStatus_o.setVal("done");//sysj\controller.sysj line: 241, column: 3
                                  S100839=1;
                                  if(!capperStatus_o.isACK()){//sysj\controller.sysj line: 241, column: 3
                                    capperStatus_o.setREQ(false);//sysj\controller.sysj line: 241, column: 3
                                    ends[13]=2;
                                    ;//sysj\controller.sysj line: 241, column: 3
                                    S97349=3;
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
                  thread113551(tdone,ends);
                  thread113552(tdone,ends);
                  thread113553(tdone,ends);
                  thread113557(tdone,ends);
                  int biggest113558 = 0;
                  if(ends[14]>=biggest113558){
                    biggest113558=ends[14];
                  }
                  if(ends[15]>=biggest113558){
                    biggest113558=ends[15];
                  }
                  if(ends[16]>=biggest113558){
                    biggest113558=ends[16];
                  }
                  if(ends[19]>=biggest113558){
                    biggest113558=ends[19];
                  }
                  if(biggest113558 == 1){
                    active[13]=1;
                    ends[13]=1;
                    break RUN;
                  }
                  //FINXME code
                  if(biggest113558 == 0){
                    S97349=2;
                    S100844=0;
                    if(!capperStatus_o.isPartnerPresent() || capperStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 241, column: 3
                      capperStatus_o.setREQ(false);//sysj\controller.sysj line: 241, column: 3
                      S100844=1;
                      active[13]=1;
                      ends[13]=1;
                      break RUN;
                    }
                    else {
                      S100839=0;
                      if(capperStatus_o.isACK()){//sysj\controller.sysj line: 241, column: 3
                        capperStatus_o.setVal("done");//sysj\controller.sysj line: 241, column: 3
                        S100839=1;
                        if(!capperStatus_o.isACK()){//sysj\controller.sysj line: 241, column: 3
                          capperStatus_o.setREQ(false);//sysj\controller.sysj line: 241, column: 3
                          ends[13]=2;
                          ;//sysj\controller.sysj line: 241, column: 3
                          S97349=3;
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
              switch(S100844){
                case 0 : 
                  if(!capperStatus_o.isPartnerPresent() || capperStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 241, column: 3
                    capperStatus_o.setREQ(false);//sysj\controller.sysj line: 241, column: 3
                    S100844=1;
                    active[13]=1;
                    ends[13]=1;
                    break RUN;
                  }
                  else {
                    switch(S100839){
                      case 0 : 
                        if(capperStatus_o.isACK()){//sysj\controller.sysj line: 241, column: 3
                          capperStatus_o.setVal("done");//sysj\controller.sysj line: 241, column: 3
                          S100839=1;
                          if(!capperStatus_o.isACK()){//sysj\controller.sysj line: 241, column: 3
                            capperStatus_o.setREQ(false);//sysj\controller.sysj line: 241, column: 3
                            ends[13]=2;
                            ;//sysj\controller.sysj line: 241, column: 3
                            S97349=3;
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
                        if(!capperStatus_o.isACK()){//sysj\controller.sysj line: 241, column: 3
                          capperStatus_o.setREQ(false);//sysj\controller.sysj line: 241, column: 3
                          ends[13]=2;
                          ;//sysj\controller.sysj line: 241, column: 3
                          S97349=3;
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
                  S100844=1;
                  S100844=0;
                  if(!capperStatus_o.isPartnerPresent() || capperStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 241, column: 3
                    capperStatus_o.setREQ(false);//sysj\controller.sysj line: 241, column: 3
                    S100844=1;
                    active[13]=1;
                    ends[13]=1;
                    break RUN;
                  }
                  else {
                    S100839=0;
                    if(capperStatus_o.isACK()){//sysj\controller.sysj line: 241, column: 3
                      capperStatus_o.setVal("done");//sysj\controller.sysj line: 241, column: 3
                      S100839=1;
                      if(!capperStatus_o.isACK()){//sysj\controller.sysj line: 241, column: 3
                        capperStatus_o.setREQ(false);//sysj\controller.sysj line: 241, column: 3
                        ends[13]=2;
                        ;//sysj\controller.sysj line: 241, column: 3
                        S97349=3;
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
              S97349=3;
              S97349=0;
              S97333=0;
              if(!capperReq_in.isPartnerPresent() || capperReq_in.isPartnerPreempted()){//sysj\controller.sysj line: 192, column: 3
                capperReq_in.setACK(false);//sysj\controller.sysj line: 192, column: 3
                S97333=1;
                active[13]=1;
                ends[13]=1;
                break RUN;
              }
              else {
                S97328=0;
                if(!capperReq_in.isREQ()){//sysj\controller.sysj line: 192, column: 3
                  capperReq_in.setACK(true);//sysj\controller.sysj line: 192, column: 3
                  S97328=1;
                  if(capperReq_in.isREQ()){//sysj\controller.sysj line: 192, column: 3
                    capperReq_in.setACK(false);//sysj\controller.sysj line: 192, column: 3
                    ends[13]=2;
                    ;//sysj\controller.sysj line: 192, column: 3
                    request_thread_13 = (boolean)(capperReq_in.getVal() == null ? false : ((Boolean)capperReq_in.getVal()).booleanValue());//sysj\controller.sysj line: 193, column: 3
                    S97349=1;
                    if(request_thread_13){//sysj\controller.sysj line: 195, column: 3
                      S97464=0;
                      S97356=0;
                      if(!capperStatus_o.isPartnerPresent() || capperStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 196, column: 4
                        capperStatus_o.setREQ(false);//sysj\controller.sysj line: 196, column: 4
                        S97356=1;
                        active[13]=1;
                        ends[13]=1;
                        break RUN;
                      }
                      else {
                        S97351=0;
                        if(capperStatus_o.isACK()){//sysj\controller.sysj line: 196, column: 4
                          capperStatus_o.setVal("busy");//sysj\controller.sysj line: 196, column: 4
                          S97351=1;
                          if(!capperStatus_o.isACK()){//sysj\controller.sysj line: 196, column: 4
                            capperStatus_o.setREQ(false);//sysj\controller.sysj line: 196, column: 4
                            ends[13]=2;
                            ;//sysj\controller.sysj line: 196, column: 4
                            S97464=1;
                            if(!bottleAtPos4.getprestatus()){//sysj\controller.sysj line: 198, column: 13
                              S97378=0;
                              if(!capperStatus_o.isPartnerPresent() || capperStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 199, column: 5
                                capperStatus_o.setREQ(false);//sysj\controller.sysj line: 199, column: 5
                                S97378=1;
                                active[13]=1;
                                ends[13]=1;
                                break RUN;
                              }
                              else {
                                S97373=0;
                                if(capperStatus_o.isACK()){//sysj\controller.sysj line: 199, column: 5
                                  capperStatus_o.setVal("idle");//sysj\controller.sysj line: 199, column: 5
                                  S97373=1;
                                  if(!capperStatus_o.isACK()){//sysj\controller.sysj line: 199, column: 5
                                    capperStatus_o.setREQ(false);//sysj\controller.sysj line: 199, column: 5
                                    ends[13]=2;
                                    ;//sysj\controller.sysj line: 199, column: 5
                                    S97464=2;
                                    if(bottleAtPos4.getprestatus()){//sysj\controller.sysj line: 202, column: 12
                                      System.out.println("Capper doing work...");//sysj\controller.sysj line: 203, column: 5
                                      thread113559(tdone,ends);
                                      thread113560(tdone,ends);
                                      thread113561(tdone,ends);
                                      thread113565(tdone,ends);
                                      int biggest113566 = 0;
                                      if(ends[14]>=biggest113566){
                                        biggest113566=ends[14];
                                      }
                                      if(ends[15]>=biggest113566){
                                        biggest113566=ends[15];
                                      }
                                      if(ends[16]>=biggest113566){
                                        biggest113566=ends[16];
                                      }
                                      if(ends[19]>=biggest113566){
                                        biggest113566=ends[19];
                                      }
                                      if(biggest113566 == 1){
                                        active[13]=1;
                                        ends[13]=1;
                                        break RUN;
                                      }
                                    }
                                    else {
                                      S97349=2;
                                      S100844=0;
                                      if(!capperStatus_o.isPartnerPresent() || capperStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 241, column: 3
                                        capperStatus_o.setREQ(false);//sysj\controller.sysj line: 241, column: 3
                                        S100844=1;
                                        active[13]=1;
                                        ends[13]=1;
                                        break RUN;
                                      }
                                      else {
                                        S100839=0;
                                        if(capperStatus_o.isACK()){//sysj\controller.sysj line: 241, column: 3
                                          capperStatus_o.setVal("done");//sysj\controller.sysj line: 241, column: 3
                                          S100839=1;
                                          if(!capperStatus_o.isACK()){//sysj\controller.sysj line: 241, column: 3
                                            capperStatus_o.setREQ(false);//sysj\controller.sysj line: 241, column: 3
                                            ends[13]=2;
                                            ;//sysj\controller.sysj line: 241, column: 3
                                            S97349=3;
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
                              S97464=2;
                              if(bottleAtPos4.getprestatus()){//sysj\controller.sysj line: 202, column: 12
                                System.out.println("Capper doing work...");//sysj\controller.sysj line: 203, column: 5
                                thread113567(tdone,ends);
                                thread113568(tdone,ends);
                                thread113569(tdone,ends);
                                thread113573(tdone,ends);
                                int biggest113574 = 0;
                                if(ends[14]>=biggest113574){
                                  biggest113574=ends[14];
                                }
                                if(ends[15]>=biggest113574){
                                  biggest113574=ends[15];
                                }
                                if(ends[16]>=biggest113574){
                                  biggest113574=ends[16];
                                }
                                if(ends[19]>=biggest113574){
                                  biggest113574=ends[19];
                                }
                                if(biggest113574 == 1){
                                  active[13]=1;
                                  ends[13]=1;
                                  break RUN;
                                }
                              }
                              else {
                                S97349=2;
                                S100844=0;
                                if(!capperStatus_o.isPartnerPresent() || capperStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 241, column: 3
                                  capperStatus_o.setREQ(false);//sysj\controller.sysj line: 241, column: 3
                                  S100844=1;
                                  active[13]=1;
                                  ends[13]=1;
                                  break RUN;
                                }
                                else {
                                  S100839=0;
                                  if(capperStatus_o.isACK()){//sysj\controller.sysj line: 241, column: 3
                                    capperStatus_o.setVal("done");//sysj\controller.sysj line: 241, column: 3
                                    S100839=1;
                                    if(!capperStatus_o.isACK()){//sysj\controller.sysj line: 241, column: 3
                                      capperStatus_o.setREQ(false);//sysj\controller.sysj line: 241, column: 3
                                      ends[13]=2;
                                      ;//sysj\controller.sysj line: 241, column: 3
                                      S97349=3;
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
                      S97349=2;
                      S100844=0;
                      if(!capperStatus_o.isPartnerPresent() || capperStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 241, column: 3
                        capperStatus_o.setREQ(false);//sysj\controller.sysj line: 241, column: 3
                        S100844=1;
                        active[13]=1;
                        ends[13]=1;
                        break RUN;
                      }
                      else {
                        S100839=0;
                        if(capperStatus_o.isACK()){//sysj\controller.sysj line: 241, column: 3
                          capperStatus_o.setVal("done");//sysj\controller.sysj line: 241, column: 3
                          S100839=1;
                          if(!capperStatus_o.isACK()){//sysj\controller.sysj line: 241, column: 3
                            capperStatus_o.setREQ(false);//sysj\controller.sysj line: 241, column: 3
                            ends[13]=2;
                            ;//sysj\controller.sysj line: 241, column: 3
                            S97349=3;
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
