import java.util.*;
import com.systemj.ClockDomain;
import com.systemj.Signal;
import com.systemj.input_Channel;
import com.systemj.output_Channel;
import java.util.ArrayList;//sysj\controller.sysj line: 1, column: 1

public class Controller extends ClockDomain{
  public Controller(String name){super(name);}
  Vector currsigs = new Vector();
  private boolean df = false;
  private char [] active;
  private char [] paused;
  private char [] suspended;
  public Signal bottleAtPos1 = new Signal("bottleAtPos1", Signal.INPUT);
  public Signal bottleLeftPos5 = new Signal("bottleLeftPos5", Signal.INPUT);
  public Signal bottleAtPos5 = new Signal("bottleAtPos5", Signal.INPUT);
  public Signal motConveyorOnOff = new Signal("motConveyorOnOff", Signal.OUTPUT);
  public Signal motorPos1On = new Signal("motorPos1On", Signal.OUTPUT);
  public Signal motorPos5On = new Signal("motorPos5On", Signal.OUTPUT);
  public input_Channel conveyorReq_in = new input_Channel();
  public output_Channel conveyorStatus_o = new output_Channel();
  private Boolean req_thread_1;//sysj\controller.sysj line: 16, column: 3
  private int S7990 = 1;
  private int S22 = 1;
  private int S6 = 1;
  private int S1 = 1;
  private int S682 = 1;
  private int S45 = 1;
  private int S29 = 1;
  private int S24 = 1;
  private int S50 = 1;
  private int S55 = 1;
  private int S144 = 1;
  private int S139 = 1;
  private int S276 = 1;
  private int S271 = 1;
  private int S549 = 1;
  private int S547 = 1;
  private int S450 = 1;
  private int S455 = 1;
  private int S479 = 1;
  private int S462 = 1;
  private int S457 = 1;
  private int S487 = 1;
  private int S482 = 1;
  private int S556 = 1;
  private int S551 = 1;
  
  private int[] ends = new int[23];
  private int[] tdone = new int[23];
  
  public void thread104653(int [] tdone, int [] ends){
        S479=1;
    S462=0;
    if(!conveyorStatus_o.isPartnerPresent() || conveyorStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 44, column: 10
      conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 44, column: 10
      S462=1;
      active[6]=1;
      ends[6]=1;
      tdone[6]=1;
    }
    else {
      S457=0;
      if(conveyorStatus_o.isACK()){//sysj\controller.sysj line: 44, column: 10
        conveyorStatus_o.setVal("busy");//sysj\controller.sysj line: 44, column: 10
        S457=1;
        if(!conveyorStatus_o.isACK()){//sysj\controller.sysj line: 44, column: 10
          conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 44, column: 10
          ends[6]=2;
          ;//sysj\controller.sysj line: 44, column: 10
          S479=0;
          active[6]=0;
          ends[6]=0;
          tdone[6]=1;
        }
        else {
          active[6]=1;
          ends[6]=1;
          tdone[6]=1;
        }
      }
      else {
        active[6]=1;
        ends[6]=1;
        tdone[6]=1;
      }
    }
  }

  public void thread104652(int [] tdone, int [] ends){
        S455=1;
    motorPos5On.setPresent();//sysj\controller.sysj line: 43, column: 38
    currsigs.addElement(motorPos5On);
    active[5]=1;
    ends[5]=1;
    tdone[5]=1;
  }

  public void thread104651(int [] tdone, int [] ends){
        S450=1;
    motConveyorOnOff.setPresent();//sysj\controller.sysj line: 43, column: 7
    currsigs.addElement(motConveyorOnOff);
    active[4]=1;
    ends[4]=1;
    tdone[4]=1;
  }

  public void thread104649(int [] tdone, int [] ends){
        S55=1;
    motorPos1On.setPresent();//sysj\controller.sysj line: 29, column: 38
    currsigs.addElement(motorPos1On);
    active[3]=1;
    ends[3]=1;
    tdone[3]=1;
  }

  public void thread104648(int [] tdone, int [] ends){
        S50=1;
    motConveyorOnOff.setPresent();//sysj\controller.sysj line: 29, column: 7
    currsigs.addElement(motConveyorOnOff);
    active[2]=1;
    ends[2]=1;
    tdone[2]=1;
  }

  public void thread104646(int [] tdone, int [] ends){
        switch(S479){
      case 0 : 
        active[6]=0;
        ends[6]=0;
        tdone[6]=1;
        break;
      
      case 1 : 
        switch(S462){
          case 0 : 
            if(!conveyorStatus_o.isPartnerPresent() || conveyorStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 44, column: 10
              conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 44, column: 10
              S462=1;
              active[6]=1;
              ends[6]=1;
              tdone[6]=1;
            }
            else {
              switch(S457){
                case 0 : 
                  if(conveyorStatus_o.isACK()){//sysj\controller.sysj line: 44, column: 10
                    conveyorStatus_o.setVal("busy");//sysj\controller.sysj line: 44, column: 10
                    S457=1;
                    if(!conveyorStatus_o.isACK()){//sysj\controller.sysj line: 44, column: 10
                      conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 44, column: 10
                      ends[6]=2;
                      ;//sysj\controller.sysj line: 44, column: 10
                      S479=0;
                      active[6]=0;
                      ends[6]=0;
                      tdone[6]=1;
                    }
                    else {
                      active[6]=1;
                      ends[6]=1;
                      tdone[6]=1;
                    }
                  }
                  else {
                    active[6]=1;
                    ends[6]=1;
                    tdone[6]=1;
                  }
                  break;
                
                case 1 : 
                  if(!conveyorStatus_o.isACK()){//sysj\controller.sysj line: 44, column: 10
                    conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 44, column: 10
                    ends[6]=2;
                    ;//sysj\controller.sysj line: 44, column: 10
                    S479=0;
                    active[6]=0;
                    ends[6]=0;
                    tdone[6]=1;
                  }
                  else {
                    active[6]=1;
                    ends[6]=1;
                    tdone[6]=1;
                  }
                  break;
                
              }
            }
            break;
          
          case 1 : 
            S462=1;
            S462=0;
            if(!conveyorStatus_o.isPartnerPresent() || conveyorStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 44, column: 10
              conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 44, column: 10
              S462=1;
              active[6]=1;
              ends[6]=1;
              tdone[6]=1;
            }
            else {
              S457=0;
              if(conveyorStatus_o.isACK()){//sysj\controller.sysj line: 44, column: 10
                conveyorStatus_o.setVal("busy");//sysj\controller.sysj line: 44, column: 10
                S457=1;
                if(!conveyorStatus_o.isACK()){//sysj\controller.sysj line: 44, column: 10
                  conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 44, column: 10
                  ends[6]=2;
                  ;//sysj\controller.sysj line: 44, column: 10
                  S479=0;
                  active[6]=0;
                  ends[6]=0;
                  tdone[6]=1;
                }
                else {
                  active[6]=1;
                  ends[6]=1;
                  tdone[6]=1;
                }
              }
              else {
                active[6]=1;
                ends[6]=1;
                tdone[6]=1;
              }
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread104645(int [] tdone, int [] ends){
        switch(S455){
      case 0 : 
        active[5]=0;
        ends[5]=0;
        tdone[5]=1;
        break;
      
      case 1 : 
        motorPos5On.setPresent();//sysj\controller.sysj line: 43, column: 38
        currsigs.addElement(motorPos5On);
        active[5]=1;
        ends[5]=1;
        tdone[5]=1;
        break;
      
    }
  }

  public void thread104644(int [] tdone, int [] ends){
        switch(S450){
      case 0 : 
        active[4]=0;
        ends[4]=0;
        tdone[4]=1;
        break;
      
      case 1 : 
        motConveyorOnOff.setPresent();//sysj\controller.sysj line: 43, column: 7
        currsigs.addElement(motConveyorOnOff);
        active[4]=1;
        ends[4]=1;
        tdone[4]=1;
        break;
      
    }
  }

  public void thread104642(int [] tdone, int [] ends){
        switch(S55){
      case 0 : 
        active[3]=0;
        ends[3]=0;
        tdone[3]=1;
        break;
      
      case 1 : 
        motorPos1On.setPresent();//sysj\controller.sysj line: 29, column: 38
        currsigs.addElement(motorPos1On);
        active[3]=1;
        ends[3]=1;
        tdone[3]=1;
        break;
      
    }
  }

  public void thread104641(int [] tdone, int [] ends){
        switch(S50){
      case 0 : 
        active[2]=0;
        ends[2]=0;
        tdone[2]=1;
        break;
      
      case 1 : 
        motConveyorOnOff.setPresent();//sysj\controller.sysj line: 29, column: 7
        currsigs.addElement(motConveyorOnOff);
        active[2]=1;
        ends[2]=1;
        tdone[2]=1;
        break;
      
    }
  }

  public void thread104639(int [] tdone, int [] ends){
        S55=1;
    motorPos1On.setPresent();//sysj\controller.sysj line: 29, column: 38
    currsigs.addElement(motorPos1On);
    active[3]=1;
    ends[3]=1;
    tdone[3]=1;
  }

  public void thread104638(int [] tdone, int [] ends){
        S50=1;
    motConveyorOnOff.setPresent();//sysj\controller.sysj line: 29, column: 7
    currsigs.addElement(motConveyorOnOff);
    active[2]=1;
    ends[2]=1;
    tdone[2]=1;
  }

  public void thread104636(int [] tdone, int [] ends){
        S55=1;
    motorPos1On.setPresent();//sysj\controller.sysj line: 29, column: 38
    currsigs.addElement(motorPos1On);
    active[3]=1;
    ends[3]=1;
    tdone[3]=1;
  }

  public void thread104635(int [] tdone, int [] ends){
        S50=1;
    motConveyorOnOff.setPresent();//sysj\controller.sysj line: 29, column: 7
    currsigs.addElement(motConveyorOnOff);
    active[2]=1;
    ends[2]=1;
    tdone[2]=1;
  }

  public void thread104633(int [] tdone, int [] ends){
        S55=1;
    motorPos1On.setPresent();//sysj\controller.sysj line: 29, column: 38
    currsigs.addElement(motorPos1On);
    active[3]=1;
    ends[3]=1;
    tdone[3]=1;
  }

  public void thread104632(int [] tdone, int [] ends){
        S50=1;
    motConveyorOnOff.setPresent();//sysj\controller.sysj line: 29, column: 7
    currsigs.addElement(motConveyorOnOff);
    active[2]=1;
    ends[2]=1;
    tdone[2]=1;
  }

  public void thread104630(int [] tdone, int [] ends){
        S479=1;
    S462=0;
    if(!conveyorStatus_o.isPartnerPresent() || conveyorStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 44, column: 10
      conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 44, column: 10
      S462=1;
      active[6]=1;
      ends[6]=1;
      tdone[6]=1;
    }
    else {
      S457=0;
      if(conveyorStatus_o.isACK()){//sysj\controller.sysj line: 44, column: 10
        conveyorStatus_o.setVal("busy");//sysj\controller.sysj line: 44, column: 10
        S457=1;
        if(!conveyorStatus_o.isACK()){//sysj\controller.sysj line: 44, column: 10
          conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 44, column: 10
          ends[6]=2;
          ;//sysj\controller.sysj line: 44, column: 10
          S479=0;
          active[6]=0;
          ends[6]=0;
          tdone[6]=1;
        }
        else {
          active[6]=1;
          ends[6]=1;
          tdone[6]=1;
        }
      }
      else {
        active[6]=1;
        ends[6]=1;
        tdone[6]=1;
      }
    }
  }

  public void thread104629(int [] tdone, int [] ends){
        S455=1;
    motorPos5On.setPresent();//sysj\controller.sysj line: 43, column: 38
    currsigs.addElement(motorPos5On);
    active[5]=1;
    ends[5]=1;
    tdone[5]=1;
  }

  public void thread104628(int [] tdone, int [] ends){
        S450=1;
    motConveyorOnOff.setPresent();//sysj\controller.sysj line: 43, column: 7
    currsigs.addElement(motConveyorOnOff);
    active[4]=1;
    ends[4]=1;
    tdone[4]=1;
  }

  public void thread104626(int [] tdone, int [] ends){
        S55=1;
    motorPos1On.setPresent();//sysj\controller.sysj line: 29, column: 38
    currsigs.addElement(motorPos1On);
    active[3]=1;
    ends[3]=1;
    tdone[3]=1;
  }

  public void thread104625(int [] tdone, int [] ends){
        S50=1;
    motConveyorOnOff.setPresent();//sysj\controller.sysj line: 29, column: 7
    currsigs.addElement(motConveyorOnOff);
    active[2]=1;
    ends[2]=1;
    tdone[2]=1;
  }

  public void thread104623(int [] tdone, int [] ends){
        S479=1;
    S462=0;
    if(!conveyorStatus_o.isPartnerPresent() || conveyorStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 44, column: 10
      conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 44, column: 10
      S462=1;
      active[6]=1;
      ends[6]=1;
      tdone[6]=1;
    }
    else {
      S457=0;
      if(conveyorStatus_o.isACK()){//sysj\controller.sysj line: 44, column: 10
        conveyorStatus_o.setVal("busy");//sysj\controller.sysj line: 44, column: 10
        S457=1;
        if(!conveyorStatus_o.isACK()){//sysj\controller.sysj line: 44, column: 10
          conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 44, column: 10
          ends[6]=2;
          ;//sysj\controller.sysj line: 44, column: 10
          S479=0;
          active[6]=0;
          ends[6]=0;
          tdone[6]=1;
        }
        else {
          active[6]=1;
          ends[6]=1;
          tdone[6]=1;
        }
      }
      else {
        active[6]=1;
        ends[6]=1;
        tdone[6]=1;
      }
    }
  }

  public void thread104622(int [] tdone, int [] ends){
        S455=1;
    motorPos5On.setPresent();//sysj\controller.sysj line: 43, column: 38
    currsigs.addElement(motorPos5On);
    active[5]=1;
    ends[5]=1;
    tdone[5]=1;
  }

  public void thread104621(int [] tdone, int [] ends){
        S450=1;
    motConveyorOnOff.setPresent();//sysj\controller.sysj line: 43, column: 7
    currsigs.addElement(motConveyorOnOff);
    active[4]=1;
    ends[4]=1;
    tdone[4]=1;
  }

  public void thread104619(int [] tdone, int [] ends){
        S55=1;
    motorPos1On.setPresent();//sysj\controller.sysj line: 29, column: 38
    currsigs.addElement(motorPos1On);
    active[3]=1;
    ends[3]=1;
    tdone[3]=1;
  }

  public void thread104618(int [] tdone, int [] ends){
        S50=1;
    motConveyorOnOff.setPresent();//sysj\controller.sysj line: 29, column: 7
    currsigs.addElement(motConveyorOnOff);
    active[2]=1;
    ends[2]=1;
    tdone[2]=1;
  }

  public void thread104616(int [] tdone, int [] ends){
        S479=1;
    S462=0;
    if(!conveyorStatus_o.isPartnerPresent() || conveyorStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 44, column: 10
      conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 44, column: 10
      S462=1;
      active[6]=1;
      ends[6]=1;
      tdone[6]=1;
    }
    else {
      S457=0;
      if(conveyorStatus_o.isACK()){//sysj\controller.sysj line: 44, column: 10
        conveyorStatus_o.setVal("busy");//sysj\controller.sysj line: 44, column: 10
        S457=1;
        if(!conveyorStatus_o.isACK()){//sysj\controller.sysj line: 44, column: 10
          conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 44, column: 10
          ends[6]=2;
          ;//sysj\controller.sysj line: 44, column: 10
          S479=0;
          active[6]=0;
          ends[6]=0;
          tdone[6]=1;
        }
        else {
          active[6]=1;
          ends[6]=1;
          tdone[6]=1;
        }
      }
      else {
        active[6]=1;
        ends[6]=1;
        tdone[6]=1;
      }
    }
  }

  public void thread104615(int [] tdone, int [] ends){
        S455=1;
    motorPos5On.setPresent();//sysj\controller.sysj line: 43, column: 38
    currsigs.addElement(motorPos5On);
    active[5]=1;
    ends[5]=1;
    tdone[5]=1;
  }

  public void thread104614(int [] tdone, int [] ends){
        S450=1;
    motConveyorOnOff.setPresent();//sysj\controller.sysj line: 43, column: 7
    currsigs.addElement(motConveyorOnOff);
    active[4]=1;
    ends[4]=1;
    tdone[4]=1;
  }

  public void thread104612(int [] tdone, int [] ends){
        S55=1;
    motorPos1On.setPresent();//sysj\controller.sysj line: 29, column: 38
    currsigs.addElement(motorPos1On);
    active[3]=1;
    ends[3]=1;
    tdone[3]=1;
  }

  public void thread104611(int [] tdone, int [] ends){
        S50=1;
    motConveyorOnOff.setPresent();//sysj\controller.sysj line: 29, column: 7
    currsigs.addElement(motConveyorOnOff);
    active[2]=1;
    ends[2]=1;
    tdone[2]=1;
  }

  public void thread104609(int [] tdone, int [] ends){
        S479=1;
    S462=0;
    if(!conveyorStatus_o.isPartnerPresent() || conveyorStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 44, column: 10
      conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 44, column: 10
      S462=1;
      active[6]=1;
      ends[6]=1;
      tdone[6]=1;
    }
    else {
      S457=0;
      if(conveyorStatus_o.isACK()){//sysj\controller.sysj line: 44, column: 10
        conveyorStatus_o.setVal("busy");//sysj\controller.sysj line: 44, column: 10
        S457=1;
        if(!conveyorStatus_o.isACK()){//sysj\controller.sysj line: 44, column: 10
          conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 44, column: 10
          ends[6]=2;
          ;//sysj\controller.sysj line: 44, column: 10
          S479=0;
          active[6]=0;
          ends[6]=0;
          tdone[6]=1;
        }
        else {
          active[6]=1;
          ends[6]=1;
          tdone[6]=1;
        }
      }
      else {
        active[6]=1;
        ends[6]=1;
        tdone[6]=1;
      }
    }
  }

  public void thread104608(int [] tdone, int [] ends){
        S455=1;
    motorPos5On.setPresent();//sysj\controller.sysj line: 43, column: 38
    currsigs.addElement(motorPos5On);
    active[5]=1;
    ends[5]=1;
    tdone[5]=1;
  }

  public void thread104607(int [] tdone, int [] ends){
        S450=1;
    motConveyorOnOff.setPresent();//sysj\controller.sysj line: 43, column: 7
    currsigs.addElement(motConveyorOnOff);
    active[4]=1;
    ends[4]=1;
    tdone[4]=1;
  }

  public void thread104605(int [] tdone, int [] ends){
        S55=1;
    motorPos1On.setPresent();//sysj\controller.sysj line: 29, column: 38
    currsigs.addElement(motorPos1On);
    active[3]=1;
    ends[3]=1;
    tdone[3]=1;
  }

  public void thread104604(int [] tdone, int [] ends){
        S50=1;
    motConveyorOnOff.setPresent();//sysj\controller.sysj line: 29, column: 7
    currsigs.addElement(motConveyorOnOff);
    active[2]=1;
    ends[2]=1;
    tdone[2]=1;
  }

  public void runClockDomain(){
    for(int i=0;i<ends.length;i++){
      ends[i] = 0;
      tdone[i] = 0;
    }
    
    RUN: while(true){
      switch(S7990){
        case 0 : 
          S7990=0;
          break RUN;
        
        case 1 : 
          S7990=2;
          S7990=2;
          S22=0;
          S6=0;
          if(!conveyorReq_in.isPartnerPresent() || conveyorReq_in.isPartnerPreempted()){//sysj\controller.sysj line: 14, column: 3
            conveyorReq_in.setACK(false);//sysj\controller.sysj line: 14, column: 3
            S6=1;
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
          else {
            S1=0;
            if(!conveyorReq_in.isREQ()){//sysj\controller.sysj line: 14, column: 3
              conveyorReq_in.setACK(true);//sysj\controller.sysj line: 14, column: 3
              S1=1;
              if(conveyorReq_in.isREQ()){//sysj\controller.sysj line: 14, column: 3
                conveyorReq_in.setACK(false);//sysj\controller.sysj line: 14, column: 3
                ends[1]=2;
                ;//sysj\controller.sysj line: 14, column: 3
                req_thread_1 = (Boolean)(conveyorReq_in.getVal() == null ? null : ((Boolean)conveyorReq_in.getVal()));//sysj\controller.sysj line: 16, column: 3
                System.out.println("received?");//sysj\controller.sysj line: 17, column: 3
                System.out.println(req_thread_1);//sysj\controller.sysj line: 18, column: 3
                S22=1;
                if(req_thread_1){//sysj\controller.sysj line: 20, column: 3
                  S682=0;
                  S45=0;
                  S29=0;
                  if(!conveyorStatus_o.isPartnerPresent() || conveyorStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 21, column: 4
                    conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 21, column: 4
                    S29=1;
                    active[1]=1;
                    ends[1]=1;
                    break RUN;
                  }
                  else {
                    S24=0;
                    if(conveyorStatus_o.isACK()){//sysj\controller.sysj line: 21, column: 4
                      conveyorStatus_o.setVal("busy");//sysj\controller.sysj line: 21, column: 4
                      S24=1;
                      if(!conveyorStatus_o.isACK()){//sysj\controller.sysj line: 21, column: 4
                        conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 21, column: 4
                        ends[1]=2;
                        ;//sysj\controller.sysj line: 21, column: 4
                        System.out.println("conveyor busy");//sysj\controller.sysj line: 23, column: 4
                        S45=1;
                        if(!bottleAtPos1.getprestatus()){//sysj\controller.sysj line: 27, column: 13
                          System.out.println("Motor is on");//sysj\controller.sysj line: 28, column: 6
                          thread104604(tdone,ends);
                          thread104605(tdone,ends);
                          int biggest104606 = 0;
                          if(ends[2]>=biggest104606){
                            biggest104606=ends[2];
                          }
                          if(ends[3]>=biggest104606){
                            biggest104606=ends[3];
                          }
                          if(biggest104606 == 1){
                            active[1]=1;
                            ends[1]=1;
                            break RUN;
                          }
                        }
                        else {
                          S45=2;
                          S144=0;
                          if(!conveyorStatus_o.isPartnerPresent() || conveyorStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 33, column: 4
                            conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 33, column: 4
                            S144=1;
                            active[1]=1;
                            ends[1]=1;
                            break RUN;
                          }
                          else {
                            S139=0;
                            if(conveyorStatus_o.isACK()){//sysj\controller.sysj line: 33, column: 4
                              conveyorStatus_o.setVal("done");//sysj\controller.sysj line: 33, column: 4
                              S139=1;
                              if(!conveyorStatus_o.isACK()){//sysj\controller.sysj line: 33, column: 4
                                conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 33, column: 4
                                ends[1]=2;
                                ;//sysj\controller.sysj line: 33, column: 4
                                System.out.println("Motor is off");//sysj\controller.sysj line: 34, column: 4
                                S45=3;
                                S276=0;
                                if(!conveyorStatus_o.isPartnerPresent() || conveyorStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 35, column: 4
                                  conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 35, column: 4
                                  S276=1;
                                  active[1]=1;
                                  ends[1]=1;
                                  break RUN;
                                }
                                else {
                                  S271=0;
                                  if(conveyorStatus_o.isACK()){//sysj\controller.sysj line: 35, column: 4
                                    conveyorStatus_o.setVal("done");//sysj\controller.sysj line: 35, column: 4
                                    S271=1;
                                    if(!conveyorStatus_o.isACK()){//sysj\controller.sysj line: 35, column: 4
                                      conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 35, column: 4
                                      ends[1]=2;
                                      ;//sysj\controller.sysj line: 35, column: 4
                                      System.out.println("conveyor done");//sysj\controller.sysj line: 36, column: 4
                                      S45=4;
                                      active[1]=1;
                                      ends[1]=1;
                                      break RUN;
                                    }
                                    else {
                                      active[1]=1;
                                      ends[1]=1;
                                      break RUN;
                                    }
                                  }
                                  else {
                                    active[1]=1;
                                    ends[1]=1;
                                    break RUN;
                                  }
                                }
                              }
                              else {
                                active[1]=1;
                                ends[1]=1;
                                break RUN;
                              }
                            }
                            else {
                              active[1]=1;
                              ends[1]=1;
                              break RUN;
                            }
                          }
                        }
                      }
                      else {
                        active[1]=1;
                        ends[1]=1;
                        break RUN;
                      }
                    }
                    else {
                      active[1]=1;
                      ends[1]=1;
                      break RUN;
                    }
                  }
                }
                else {
                  S682=1;
                  S549=0;
                  if(bottleAtPos5.getprestatus()){//sysj\controller.sysj line: 41, column: 12
                    S547=0;
                    thread104607(tdone,ends);
                    thread104608(tdone,ends);
                    thread104609(tdone,ends);
                    int biggest104610 = 0;
                    if(ends[4]>=biggest104610){
                      biggest104610=ends[4];
                    }
                    if(ends[5]>=biggest104610){
                      biggest104610=ends[5];
                    }
                    if(ends[6]>=biggest104610){
                      biggest104610=ends[6];
                    }
                    if(biggest104610 == 1){
                      active[1]=1;
                      ends[1]=1;
                      break RUN;
                    }
                  }
                  else {
                    System.out.println("conveyor idling");//sysj\controller.sysj line: 50, column: 4
                    S549=1;
                    S556=0;
                    if(!conveyorStatus_o.isPartnerPresent() || conveyorStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 51, column: 4
                      conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 51, column: 4
                      S556=1;
                      active[1]=1;
                      ends[1]=1;
                      break RUN;
                    }
                    else {
                      S551=0;
                      if(conveyorStatus_o.isACK()){//sysj\controller.sysj line: 51, column: 4
                        conveyorStatus_o.setVal("idle");//sysj\controller.sysj line: 51, column: 4
                        S551=1;
                        if(!conveyorStatus_o.isACK()){//sysj\controller.sysj line: 51, column: 4
                          conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 51, column: 4
                          ends[1]=2;
                          ;//sysj\controller.sysj line: 51, column: 4
                          S22=2;
                          active[1]=1;
                          ends[1]=1;
                          break RUN;
                        }
                        else {
                          active[1]=1;
                          ends[1]=1;
                          break RUN;
                        }
                      }
                      else {
                        active[1]=1;
                        ends[1]=1;
                        break RUN;
                      }
                    }
                  }
                }
              }
              else {
                active[1]=1;
                ends[1]=1;
                break RUN;
              }
            }
            else {
              active[1]=1;
              ends[1]=1;
              break RUN;
            }
          }
        
        case 2 : 
          switch(S22){
            case 0 : 
              switch(S6){
                case 0 : 
                  if(!conveyorReq_in.isPartnerPresent() || conveyorReq_in.isPartnerPreempted()){//sysj\controller.sysj line: 14, column: 3
                    conveyorReq_in.setACK(false);//sysj\controller.sysj line: 14, column: 3
                    S6=1;
                    active[1]=1;
                    ends[1]=1;
                    break RUN;
                  }
                  else {
                    switch(S1){
                      case 0 : 
                        if(!conveyorReq_in.isREQ()){//sysj\controller.sysj line: 14, column: 3
                          conveyorReq_in.setACK(true);//sysj\controller.sysj line: 14, column: 3
                          S1=1;
                          if(conveyorReq_in.isREQ()){//sysj\controller.sysj line: 14, column: 3
                            conveyorReq_in.setACK(false);//sysj\controller.sysj line: 14, column: 3
                            ends[1]=2;
                            ;//sysj\controller.sysj line: 14, column: 3
                            req_thread_1 = (Boolean)(conveyorReq_in.getVal() == null ? null : ((Boolean)conveyorReq_in.getVal()));//sysj\controller.sysj line: 16, column: 3
                            System.out.println("received?");//sysj\controller.sysj line: 17, column: 3
                            System.out.println(req_thread_1);//sysj\controller.sysj line: 18, column: 3
                            S22=1;
                            if(req_thread_1){//sysj\controller.sysj line: 20, column: 3
                              S682=0;
                              S45=0;
                              S29=0;
                              if(!conveyorStatus_o.isPartnerPresent() || conveyorStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 21, column: 4
                                conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 21, column: 4
                                S29=1;
                                active[1]=1;
                                ends[1]=1;
                                break RUN;
                              }
                              else {
                                S24=0;
                                if(conveyorStatus_o.isACK()){//sysj\controller.sysj line: 21, column: 4
                                  conveyorStatus_o.setVal("busy");//sysj\controller.sysj line: 21, column: 4
                                  S24=1;
                                  if(!conveyorStatus_o.isACK()){//sysj\controller.sysj line: 21, column: 4
                                    conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 21, column: 4
                                    ends[1]=2;
                                    ;//sysj\controller.sysj line: 21, column: 4
                                    System.out.println("conveyor busy");//sysj\controller.sysj line: 23, column: 4
                                    S45=1;
                                    if(!bottleAtPos1.getprestatus()){//sysj\controller.sysj line: 27, column: 13
                                      System.out.println("Motor is on");//sysj\controller.sysj line: 28, column: 6
                                      thread104611(tdone,ends);
                                      thread104612(tdone,ends);
                                      int biggest104613 = 0;
                                      if(ends[2]>=biggest104613){
                                        biggest104613=ends[2];
                                      }
                                      if(ends[3]>=biggest104613){
                                        biggest104613=ends[3];
                                      }
                                      if(biggest104613 == 1){
                                        active[1]=1;
                                        ends[1]=1;
                                        break RUN;
                                      }
                                    }
                                    else {
                                      S45=2;
                                      S144=0;
                                      if(!conveyorStatus_o.isPartnerPresent() || conveyorStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 33, column: 4
                                        conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 33, column: 4
                                        S144=1;
                                        active[1]=1;
                                        ends[1]=1;
                                        break RUN;
                                      }
                                      else {
                                        S139=0;
                                        if(conveyorStatus_o.isACK()){//sysj\controller.sysj line: 33, column: 4
                                          conveyorStatus_o.setVal("done");//sysj\controller.sysj line: 33, column: 4
                                          S139=1;
                                          if(!conveyorStatus_o.isACK()){//sysj\controller.sysj line: 33, column: 4
                                            conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 33, column: 4
                                            ends[1]=2;
                                            ;//sysj\controller.sysj line: 33, column: 4
                                            System.out.println("Motor is off");//sysj\controller.sysj line: 34, column: 4
                                            S45=3;
                                            S276=0;
                                            if(!conveyorStatus_o.isPartnerPresent() || conveyorStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 35, column: 4
                                              conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 35, column: 4
                                              S276=1;
                                              active[1]=1;
                                              ends[1]=1;
                                              break RUN;
                                            }
                                            else {
                                              S271=0;
                                              if(conveyorStatus_o.isACK()){//sysj\controller.sysj line: 35, column: 4
                                                conveyorStatus_o.setVal("done");//sysj\controller.sysj line: 35, column: 4
                                                S271=1;
                                                if(!conveyorStatus_o.isACK()){//sysj\controller.sysj line: 35, column: 4
                                                  conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 35, column: 4
                                                  ends[1]=2;
                                                  ;//sysj\controller.sysj line: 35, column: 4
                                                  System.out.println("conveyor done");//sysj\controller.sysj line: 36, column: 4
                                                  S45=4;
                                                  active[1]=1;
                                                  ends[1]=1;
                                                  break RUN;
                                                }
                                                else {
                                                  active[1]=1;
                                                  ends[1]=1;
                                                  break RUN;
                                                }
                                              }
                                              else {
                                                active[1]=1;
                                                ends[1]=1;
                                                break RUN;
                                              }
                                            }
                                          }
                                          else {
                                            active[1]=1;
                                            ends[1]=1;
                                            break RUN;
                                          }
                                        }
                                        else {
                                          active[1]=1;
                                          ends[1]=1;
                                          break RUN;
                                        }
                                      }
                                    }
                                  }
                                  else {
                                    active[1]=1;
                                    ends[1]=1;
                                    break RUN;
                                  }
                                }
                                else {
                                  active[1]=1;
                                  ends[1]=1;
                                  break RUN;
                                }
                              }
                            }
                            else {
                              S682=1;
                              S549=0;
                              if(bottleAtPos5.getprestatus()){//sysj\controller.sysj line: 41, column: 12
                                S547=0;
                                thread104614(tdone,ends);
                                thread104615(tdone,ends);
                                thread104616(tdone,ends);
                                int biggest104617 = 0;
                                if(ends[4]>=biggest104617){
                                  biggest104617=ends[4];
                                }
                                if(ends[5]>=biggest104617){
                                  biggest104617=ends[5];
                                }
                                if(ends[6]>=biggest104617){
                                  biggest104617=ends[6];
                                }
                                if(biggest104617 == 1){
                                  active[1]=1;
                                  ends[1]=1;
                                  break RUN;
                                }
                              }
                              else {
                                System.out.println("conveyor idling");//sysj\controller.sysj line: 50, column: 4
                                S549=1;
                                S556=0;
                                if(!conveyorStatus_o.isPartnerPresent() || conveyorStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 51, column: 4
                                  conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 51, column: 4
                                  S556=1;
                                  active[1]=1;
                                  ends[1]=1;
                                  break RUN;
                                }
                                else {
                                  S551=0;
                                  if(conveyorStatus_o.isACK()){//sysj\controller.sysj line: 51, column: 4
                                    conveyorStatus_o.setVal("idle");//sysj\controller.sysj line: 51, column: 4
                                    S551=1;
                                    if(!conveyorStatus_o.isACK()){//sysj\controller.sysj line: 51, column: 4
                                      conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 51, column: 4
                                      ends[1]=2;
                                      ;//sysj\controller.sysj line: 51, column: 4
                                      S22=2;
                                      active[1]=1;
                                      ends[1]=1;
                                      break RUN;
                                    }
                                    else {
                                      active[1]=1;
                                      ends[1]=1;
                                      break RUN;
                                    }
                                  }
                                  else {
                                    active[1]=1;
                                    ends[1]=1;
                                    break RUN;
                                  }
                                }
                              }
                            }
                          }
                          else {
                            active[1]=1;
                            ends[1]=1;
                            break RUN;
                          }
                        }
                        else {
                          active[1]=1;
                          ends[1]=1;
                          break RUN;
                        }
                      
                      case 1 : 
                        if(conveyorReq_in.isREQ()){//sysj\controller.sysj line: 14, column: 3
                          conveyorReq_in.setACK(false);//sysj\controller.sysj line: 14, column: 3
                          ends[1]=2;
                          ;//sysj\controller.sysj line: 14, column: 3
                          req_thread_1 = (Boolean)(conveyorReq_in.getVal() == null ? null : ((Boolean)conveyorReq_in.getVal()));//sysj\controller.sysj line: 16, column: 3
                          System.out.println("received?");//sysj\controller.sysj line: 17, column: 3
                          System.out.println(req_thread_1);//sysj\controller.sysj line: 18, column: 3
                          S22=1;
                          if(req_thread_1){//sysj\controller.sysj line: 20, column: 3
                            S682=0;
                            S45=0;
                            S29=0;
                            if(!conveyorStatus_o.isPartnerPresent() || conveyorStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 21, column: 4
                              conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 21, column: 4
                              S29=1;
                              active[1]=1;
                              ends[1]=1;
                              break RUN;
                            }
                            else {
                              S24=0;
                              if(conveyorStatus_o.isACK()){//sysj\controller.sysj line: 21, column: 4
                                conveyorStatus_o.setVal("busy");//sysj\controller.sysj line: 21, column: 4
                                S24=1;
                                if(!conveyorStatus_o.isACK()){//sysj\controller.sysj line: 21, column: 4
                                  conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 21, column: 4
                                  ends[1]=2;
                                  ;//sysj\controller.sysj line: 21, column: 4
                                  System.out.println("conveyor busy");//sysj\controller.sysj line: 23, column: 4
                                  S45=1;
                                  if(!bottleAtPos1.getprestatus()){//sysj\controller.sysj line: 27, column: 13
                                    System.out.println("Motor is on");//sysj\controller.sysj line: 28, column: 6
                                    thread104618(tdone,ends);
                                    thread104619(tdone,ends);
                                    int biggest104620 = 0;
                                    if(ends[2]>=biggest104620){
                                      biggest104620=ends[2];
                                    }
                                    if(ends[3]>=biggest104620){
                                      biggest104620=ends[3];
                                    }
                                    if(biggest104620 == 1){
                                      active[1]=1;
                                      ends[1]=1;
                                      break RUN;
                                    }
                                  }
                                  else {
                                    S45=2;
                                    S144=0;
                                    if(!conveyorStatus_o.isPartnerPresent() || conveyorStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 33, column: 4
                                      conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 33, column: 4
                                      S144=1;
                                      active[1]=1;
                                      ends[1]=1;
                                      break RUN;
                                    }
                                    else {
                                      S139=0;
                                      if(conveyorStatus_o.isACK()){//sysj\controller.sysj line: 33, column: 4
                                        conveyorStatus_o.setVal("done");//sysj\controller.sysj line: 33, column: 4
                                        S139=1;
                                        if(!conveyorStatus_o.isACK()){//sysj\controller.sysj line: 33, column: 4
                                          conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 33, column: 4
                                          ends[1]=2;
                                          ;//sysj\controller.sysj line: 33, column: 4
                                          System.out.println("Motor is off");//sysj\controller.sysj line: 34, column: 4
                                          S45=3;
                                          S276=0;
                                          if(!conveyorStatus_o.isPartnerPresent() || conveyorStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 35, column: 4
                                            conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 35, column: 4
                                            S276=1;
                                            active[1]=1;
                                            ends[1]=1;
                                            break RUN;
                                          }
                                          else {
                                            S271=0;
                                            if(conveyorStatus_o.isACK()){//sysj\controller.sysj line: 35, column: 4
                                              conveyorStatus_o.setVal("done");//sysj\controller.sysj line: 35, column: 4
                                              S271=1;
                                              if(!conveyorStatus_o.isACK()){//sysj\controller.sysj line: 35, column: 4
                                                conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 35, column: 4
                                                ends[1]=2;
                                                ;//sysj\controller.sysj line: 35, column: 4
                                                System.out.println("conveyor done");//sysj\controller.sysj line: 36, column: 4
                                                S45=4;
                                                active[1]=1;
                                                ends[1]=1;
                                                break RUN;
                                              }
                                              else {
                                                active[1]=1;
                                                ends[1]=1;
                                                break RUN;
                                              }
                                            }
                                            else {
                                              active[1]=1;
                                              ends[1]=1;
                                              break RUN;
                                            }
                                          }
                                        }
                                        else {
                                          active[1]=1;
                                          ends[1]=1;
                                          break RUN;
                                        }
                                      }
                                      else {
                                        active[1]=1;
                                        ends[1]=1;
                                        break RUN;
                                      }
                                    }
                                  }
                                }
                                else {
                                  active[1]=1;
                                  ends[1]=1;
                                  break RUN;
                                }
                              }
                              else {
                                active[1]=1;
                                ends[1]=1;
                                break RUN;
                              }
                            }
                          }
                          else {
                            S682=1;
                            S549=0;
                            if(bottleAtPos5.getprestatus()){//sysj\controller.sysj line: 41, column: 12
                              S547=0;
                              thread104621(tdone,ends);
                              thread104622(tdone,ends);
                              thread104623(tdone,ends);
                              int biggest104624 = 0;
                              if(ends[4]>=biggest104624){
                                biggest104624=ends[4];
                              }
                              if(ends[5]>=biggest104624){
                                biggest104624=ends[5];
                              }
                              if(ends[6]>=biggest104624){
                                biggest104624=ends[6];
                              }
                              if(biggest104624 == 1){
                                active[1]=1;
                                ends[1]=1;
                                break RUN;
                              }
                            }
                            else {
                              System.out.println("conveyor idling");//sysj\controller.sysj line: 50, column: 4
                              S549=1;
                              S556=0;
                              if(!conveyorStatus_o.isPartnerPresent() || conveyorStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 51, column: 4
                                conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 51, column: 4
                                S556=1;
                                active[1]=1;
                                ends[1]=1;
                                break RUN;
                              }
                              else {
                                S551=0;
                                if(conveyorStatus_o.isACK()){//sysj\controller.sysj line: 51, column: 4
                                  conveyorStatus_o.setVal("idle");//sysj\controller.sysj line: 51, column: 4
                                  S551=1;
                                  if(!conveyorStatus_o.isACK()){//sysj\controller.sysj line: 51, column: 4
                                    conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 51, column: 4
                                    ends[1]=2;
                                    ;//sysj\controller.sysj line: 51, column: 4
                                    S22=2;
                                    active[1]=1;
                                    ends[1]=1;
                                    break RUN;
                                  }
                                  else {
                                    active[1]=1;
                                    ends[1]=1;
                                    break RUN;
                                  }
                                }
                                else {
                                  active[1]=1;
                                  ends[1]=1;
                                  break RUN;
                                }
                              }
                            }
                          }
                        }
                        else {
                          active[1]=1;
                          ends[1]=1;
                          break RUN;
                        }
                      
                    }
                  }
                  break;
                
                case 1 : 
                  S6=1;
                  S6=0;
                  if(!conveyorReq_in.isPartnerPresent() || conveyorReq_in.isPartnerPreempted()){//sysj\controller.sysj line: 14, column: 3
                    conveyorReq_in.setACK(false);//sysj\controller.sysj line: 14, column: 3
                    S6=1;
                    active[1]=1;
                    ends[1]=1;
                    break RUN;
                  }
                  else {
                    S1=0;
                    if(!conveyorReq_in.isREQ()){//sysj\controller.sysj line: 14, column: 3
                      conveyorReq_in.setACK(true);//sysj\controller.sysj line: 14, column: 3
                      S1=1;
                      if(conveyorReq_in.isREQ()){//sysj\controller.sysj line: 14, column: 3
                        conveyorReq_in.setACK(false);//sysj\controller.sysj line: 14, column: 3
                        ends[1]=2;
                        ;//sysj\controller.sysj line: 14, column: 3
                        req_thread_1 = (Boolean)(conveyorReq_in.getVal() == null ? null : ((Boolean)conveyorReq_in.getVal()));//sysj\controller.sysj line: 16, column: 3
                        System.out.println("received?");//sysj\controller.sysj line: 17, column: 3
                        System.out.println(req_thread_1);//sysj\controller.sysj line: 18, column: 3
                        S22=1;
                        if(req_thread_1){//sysj\controller.sysj line: 20, column: 3
                          S682=0;
                          S45=0;
                          S29=0;
                          if(!conveyorStatus_o.isPartnerPresent() || conveyorStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 21, column: 4
                            conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 21, column: 4
                            S29=1;
                            active[1]=1;
                            ends[1]=1;
                            break RUN;
                          }
                          else {
                            S24=0;
                            if(conveyorStatus_o.isACK()){//sysj\controller.sysj line: 21, column: 4
                              conveyorStatus_o.setVal("busy");//sysj\controller.sysj line: 21, column: 4
                              S24=1;
                              if(!conveyorStatus_o.isACK()){//sysj\controller.sysj line: 21, column: 4
                                conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 21, column: 4
                                ends[1]=2;
                                ;//sysj\controller.sysj line: 21, column: 4
                                System.out.println("conveyor busy");//sysj\controller.sysj line: 23, column: 4
                                S45=1;
                                if(!bottleAtPos1.getprestatus()){//sysj\controller.sysj line: 27, column: 13
                                  System.out.println("Motor is on");//sysj\controller.sysj line: 28, column: 6
                                  thread104625(tdone,ends);
                                  thread104626(tdone,ends);
                                  int biggest104627 = 0;
                                  if(ends[2]>=biggest104627){
                                    biggest104627=ends[2];
                                  }
                                  if(ends[3]>=biggest104627){
                                    biggest104627=ends[3];
                                  }
                                  if(biggest104627 == 1){
                                    active[1]=1;
                                    ends[1]=1;
                                    break RUN;
                                  }
                                }
                                else {
                                  S45=2;
                                  S144=0;
                                  if(!conveyorStatus_o.isPartnerPresent() || conveyorStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 33, column: 4
                                    conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 33, column: 4
                                    S144=1;
                                    active[1]=1;
                                    ends[1]=1;
                                    break RUN;
                                  }
                                  else {
                                    S139=0;
                                    if(conveyorStatus_o.isACK()){//sysj\controller.sysj line: 33, column: 4
                                      conveyorStatus_o.setVal("done");//sysj\controller.sysj line: 33, column: 4
                                      S139=1;
                                      if(!conveyorStatus_o.isACK()){//sysj\controller.sysj line: 33, column: 4
                                        conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 33, column: 4
                                        ends[1]=2;
                                        ;//sysj\controller.sysj line: 33, column: 4
                                        System.out.println("Motor is off");//sysj\controller.sysj line: 34, column: 4
                                        S45=3;
                                        S276=0;
                                        if(!conveyorStatus_o.isPartnerPresent() || conveyorStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 35, column: 4
                                          conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 35, column: 4
                                          S276=1;
                                          active[1]=1;
                                          ends[1]=1;
                                          break RUN;
                                        }
                                        else {
                                          S271=0;
                                          if(conveyorStatus_o.isACK()){//sysj\controller.sysj line: 35, column: 4
                                            conveyorStatus_o.setVal("done");//sysj\controller.sysj line: 35, column: 4
                                            S271=1;
                                            if(!conveyorStatus_o.isACK()){//sysj\controller.sysj line: 35, column: 4
                                              conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 35, column: 4
                                              ends[1]=2;
                                              ;//sysj\controller.sysj line: 35, column: 4
                                              System.out.println("conveyor done");//sysj\controller.sysj line: 36, column: 4
                                              S45=4;
                                              active[1]=1;
                                              ends[1]=1;
                                              break RUN;
                                            }
                                            else {
                                              active[1]=1;
                                              ends[1]=1;
                                              break RUN;
                                            }
                                          }
                                          else {
                                            active[1]=1;
                                            ends[1]=1;
                                            break RUN;
                                          }
                                        }
                                      }
                                      else {
                                        active[1]=1;
                                        ends[1]=1;
                                        break RUN;
                                      }
                                    }
                                    else {
                                      active[1]=1;
                                      ends[1]=1;
                                      break RUN;
                                    }
                                  }
                                }
                              }
                              else {
                                active[1]=1;
                                ends[1]=1;
                                break RUN;
                              }
                            }
                            else {
                              active[1]=1;
                              ends[1]=1;
                              break RUN;
                            }
                          }
                        }
                        else {
                          S682=1;
                          S549=0;
                          if(bottleAtPos5.getprestatus()){//sysj\controller.sysj line: 41, column: 12
                            S547=0;
                            thread104628(tdone,ends);
                            thread104629(tdone,ends);
                            thread104630(tdone,ends);
                            int biggest104631 = 0;
                            if(ends[4]>=biggest104631){
                              biggest104631=ends[4];
                            }
                            if(ends[5]>=biggest104631){
                              biggest104631=ends[5];
                            }
                            if(ends[6]>=biggest104631){
                              biggest104631=ends[6];
                            }
                            if(biggest104631 == 1){
                              active[1]=1;
                              ends[1]=1;
                              break RUN;
                            }
                          }
                          else {
                            System.out.println("conveyor idling");//sysj\controller.sysj line: 50, column: 4
                            S549=1;
                            S556=0;
                            if(!conveyorStatus_o.isPartnerPresent() || conveyorStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 51, column: 4
                              conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 51, column: 4
                              S556=1;
                              active[1]=1;
                              ends[1]=1;
                              break RUN;
                            }
                            else {
                              S551=0;
                              if(conveyorStatus_o.isACK()){//sysj\controller.sysj line: 51, column: 4
                                conveyorStatus_o.setVal("idle");//sysj\controller.sysj line: 51, column: 4
                                S551=1;
                                if(!conveyorStatus_o.isACK()){//sysj\controller.sysj line: 51, column: 4
                                  conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 51, column: 4
                                  ends[1]=2;
                                  ;//sysj\controller.sysj line: 51, column: 4
                                  S22=2;
                                  active[1]=1;
                                  ends[1]=1;
                                  break RUN;
                                }
                                else {
                                  active[1]=1;
                                  ends[1]=1;
                                  break RUN;
                                }
                              }
                              else {
                                active[1]=1;
                                ends[1]=1;
                                break RUN;
                              }
                            }
                          }
                        }
                      }
                      else {
                        active[1]=1;
                        ends[1]=1;
                        break RUN;
                      }
                    }
                    else {
                      active[1]=1;
                      ends[1]=1;
                      break RUN;
                    }
                  }
                
              }
              break;
            
            case 1 : 
              switch(S682){
                case 0 : 
                  switch(S45){
                    case 0 : 
                      switch(S29){
                        case 0 : 
                          if(!conveyorStatus_o.isPartnerPresent() || conveyorStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 21, column: 4
                            conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 21, column: 4
                            S29=1;
                            active[1]=1;
                            ends[1]=1;
                            break RUN;
                          }
                          else {
                            switch(S24){
                              case 0 : 
                                if(conveyorStatus_o.isACK()){//sysj\controller.sysj line: 21, column: 4
                                  conveyorStatus_o.setVal("busy");//sysj\controller.sysj line: 21, column: 4
                                  S24=1;
                                  if(!conveyorStatus_o.isACK()){//sysj\controller.sysj line: 21, column: 4
                                    conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 21, column: 4
                                    ends[1]=2;
                                    ;//sysj\controller.sysj line: 21, column: 4
                                    System.out.println("conveyor busy");//sysj\controller.sysj line: 23, column: 4
                                    S45=1;
                                    if(!bottleAtPos1.getprestatus()){//sysj\controller.sysj line: 27, column: 13
                                      System.out.println("Motor is on");//sysj\controller.sysj line: 28, column: 6
                                      thread104632(tdone,ends);
                                      thread104633(tdone,ends);
                                      int biggest104634 = 0;
                                      if(ends[2]>=biggest104634){
                                        biggest104634=ends[2];
                                      }
                                      if(ends[3]>=biggest104634){
                                        biggest104634=ends[3];
                                      }
                                      if(biggest104634 == 1){
                                        active[1]=1;
                                        ends[1]=1;
                                        break RUN;
                                      }
                                    }
                                    else {
                                      S45=2;
                                      S144=0;
                                      if(!conveyorStatus_o.isPartnerPresent() || conveyorStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 33, column: 4
                                        conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 33, column: 4
                                        S144=1;
                                        active[1]=1;
                                        ends[1]=1;
                                        break RUN;
                                      }
                                      else {
                                        S139=0;
                                        if(conveyorStatus_o.isACK()){//sysj\controller.sysj line: 33, column: 4
                                          conveyorStatus_o.setVal("done");//sysj\controller.sysj line: 33, column: 4
                                          S139=1;
                                          if(!conveyorStatus_o.isACK()){//sysj\controller.sysj line: 33, column: 4
                                            conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 33, column: 4
                                            ends[1]=2;
                                            ;//sysj\controller.sysj line: 33, column: 4
                                            System.out.println("Motor is off");//sysj\controller.sysj line: 34, column: 4
                                            S45=3;
                                            S276=0;
                                            if(!conveyorStatus_o.isPartnerPresent() || conveyorStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 35, column: 4
                                              conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 35, column: 4
                                              S276=1;
                                              active[1]=1;
                                              ends[1]=1;
                                              break RUN;
                                            }
                                            else {
                                              S271=0;
                                              if(conveyorStatus_o.isACK()){//sysj\controller.sysj line: 35, column: 4
                                                conveyorStatus_o.setVal("done");//sysj\controller.sysj line: 35, column: 4
                                                S271=1;
                                                if(!conveyorStatus_o.isACK()){//sysj\controller.sysj line: 35, column: 4
                                                  conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 35, column: 4
                                                  ends[1]=2;
                                                  ;//sysj\controller.sysj line: 35, column: 4
                                                  System.out.println("conveyor done");//sysj\controller.sysj line: 36, column: 4
                                                  S45=4;
                                                  active[1]=1;
                                                  ends[1]=1;
                                                  break RUN;
                                                }
                                                else {
                                                  active[1]=1;
                                                  ends[1]=1;
                                                  break RUN;
                                                }
                                              }
                                              else {
                                                active[1]=1;
                                                ends[1]=1;
                                                break RUN;
                                              }
                                            }
                                          }
                                          else {
                                            active[1]=1;
                                            ends[1]=1;
                                            break RUN;
                                          }
                                        }
                                        else {
                                          active[1]=1;
                                          ends[1]=1;
                                          break RUN;
                                        }
                                      }
                                    }
                                  }
                                  else {
                                    active[1]=1;
                                    ends[1]=1;
                                    break RUN;
                                  }
                                }
                                else {
                                  active[1]=1;
                                  ends[1]=1;
                                  break RUN;
                                }
                              
                              case 1 : 
                                if(!conveyorStatus_o.isACK()){//sysj\controller.sysj line: 21, column: 4
                                  conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 21, column: 4
                                  ends[1]=2;
                                  ;//sysj\controller.sysj line: 21, column: 4
                                  System.out.println("conveyor busy");//sysj\controller.sysj line: 23, column: 4
                                  S45=1;
                                  if(!bottleAtPos1.getprestatus()){//sysj\controller.sysj line: 27, column: 13
                                    System.out.println("Motor is on");//sysj\controller.sysj line: 28, column: 6
                                    thread104635(tdone,ends);
                                    thread104636(tdone,ends);
                                    int biggest104637 = 0;
                                    if(ends[2]>=biggest104637){
                                      biggest104637=ends[2];
                                    }
                                    if(ends[3]>=biggest104637){
                                      biggest104637=ends[3];
                                    }
                                    if(biggest104637 == 1){
                                      active[1]=1;
                                      ends[1]=1;
                                      break RUN;
                                    }
                                  }
                                  else {
                                    S45=2;
                                    S144=0;
                                    if(!conveyorStatus_o.isPartnerPresent() || conveyorStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 33, column: 4
                                      conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 33, column: 4
                                      S144=1;
                                      active[1]=1;
                                      ends[1]=1;
                                      break RUN;
                                    }
                                    else {
                                      S139=0;
                                      if(conveyorStatus_o.isACK()){//sysj\controller.sysj line: 33, column: 4
                                        conveyorStatus_o.setVal("done");//sysj\controller.sysj line: 33, column: 4
                                        S139=1;
                                        if(!conveyorStatus_o.isACK()){//sysj\controller.sysj line: 33, column: 4
                                          conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 33, column: 4
                                          ends[1]=2;
                                          ;//sysj\controller.sysj line: 33, column: 4
                                          System.out.println("Motor is off");//sysj\controller.sysj line: 34, column: 4
                                          S45=3;
                                          S276=0;
                                          if(!conveyorStatus_o.isPartnerPresent() || conveyorStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 35, column: 4
                                            conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 35, column: 4
                                            S276=1;
                                            active[1]=1;
                                            ends[1]=1;
                                            break RUN;
                                          }
                                          else {
                                            S271=0;
                                            if(conveyorStatus_o.isACK()){//sysj\controller.sysj line: 35, column: 4
                                              conveyorStatus_o.setVal("done");//sysj\controller.sysj line: 35, column: 4
                                              S271=1;
                                              if(!conveyorStatus_o.isACK()){//sysj\controller.sysj line: 35, column: 4
                                                conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 35, column: 4
                                                ends[1]=2;
                                                ;//sysj\controller.sysj line: 35, column: 4
                                                System.out.println("conveyor done");//sysj\controller.sysj line: 36, column: 4
                                                S45=4;
                                                active[1]=1;
                                                ends[1]=1;
                                                break RUN;
                                              }
                                              else {
                                                active[1]=1;
                                                ends[1]=1;
                                                break RUN;
                                              }
                                            }
                                            else {
                                              active[1]=1;
                                              ends[1]=1;
                                              break RUN;
                                            }
                                          }
                                        }
                                        else {
                                          active[1]=1;
                                          ends[1]=1;
                                          break RUN;
                                        }
                                      }
                                      else {
                                        active[1]=1;
                                        ends[1]=1;
                                        break RUN;
                                      }
                                    }
                                  }
                                }
                                else {
                                  active[1]=1;
                                  ends[1]=1;
                                  break RUN;
                                }
                              
                            }
                          }
                          break;
                        
                        case 1 : 
                          S29=1;
                          S29=0;
                          if(!conveyorStatus_o.isPartnerPresent() || conveyorStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 21, column: 4
                            conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 21, column: 4
                            S29=1;
                            active[1]=1;
                            ends[1]=1;
                            break RUN;
                          }
                          else {
                            S24=0;
                            if(conveyorStatus_o.isACK()){//sysj\controller.sysj line: 21, column: 4
                              conveyorStatus_o.setVal("busy");//sysj\controller.sysj line: 21, column: 4
                              S24=1;
                              if(!conveyorStatus_o.isACK()){//sysj\controller.sysj line: 21, column: 4
                                conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 21, column: 4
                                ends[1]=2;
                                ;//sysj\controller.sysj line: 21, column: 4
                                System.out.println("conveyor busy");//sysj\controller.sysj line: 23, column: 4
                                S45=1;
                                if(!bottleAtPos1.getprestatus()){//sysj\controller.sysj line: 27, column: 13
                                  System.out.println("Motor is on");//sysj\controller.sysj line: 28, column: 6
                                  thread104638(tdone,ends);
                                  thread104639(tdone,ends);
                                  int biggest104640 = 0;
                                  if(ends[2]>=biggest104640){
                                    biggest104640=ends[2];
                                  }
                                  if(ends[3]>=biggest104640){
                                    biggest104640=ends[3];
                                  }
                                  if(biggest104640 == 1){
                                    active[1]=1;
                                    ends[1]=1;
                                    break RUN;
                                  }
                                }
                                else {
                                  S45=2;
                                  S144=0;
                                  if(!conveyorStatus_o.isPartnerPresent() || conveyorStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 33, column: 4
                                    conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 33, column: 4
                                    S144=1;
                                    active[1]=1;
                                    ends[1]=1;
                                    break RUN;
                                  }
                                  else {
                                    S139=0;
                                    if(conveyorStatus_o.isACK()){//sysj\controller.sysj line: 33, column: 4
                                      conveyorStatus_o.setVal("done");//sysj\controller.sysj line: 33, column: 4
                                      S139=1;
                                      if(!conveyorStatus_o.isACK()){//sysj\controller.sysj line: 33, column: 4
                                        conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 33, column: 4
                                        ends[1]=2;
                                        ;//sysj\controller.sysj line: 33, column: 4
                                        System.out.println("Motor is off");//sysj\controller.sysj line: 34, column: 4
                                        S45=3;
                                        S276=0;
                                        if(!conveyorStatus_o.isPartnerPresent() || conveyorStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 35, column: 4
                                          conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 35, column: 4
                                          S276=1;
                                          active[1]=1;
                                          ends[1]=1;
                                          break RUN;
                                        }
                                        else {
                                          S271=0;
                                          if(conveyorStatus_o.isACK()){//sysj\controller.sysj line: 35, column: 4
                                            conveyorStatus_o.setVal("done");//sysj\controller.sysj line: 35, column: 4
                                            S271=1;
                                            if(!conveyorStatus_o.isACK()){//sysj\controller.sysj line: 35, column: 4
                                              conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 35, column: 4
                                              ends[1]=2;
                                              ;//sysj\controller.sysj line: 35, column: 4
                                              System.out.println("conveyor done");//sysj\controller.sysj line: 36, column: 4
                                              S45=4;
                                              active[1]=1;
                                              ends[1]=1;
                                              break RUN;
                                            }
                                            else {
                                              active[1]=1;
                                              ends[1]=1;
                                              break RUN;
                                            }
                                          }
                                          else {
                                            active[1]=1;
                                            ends[1]=1;
                                            break RUN;
                                          }
                                        }
                                      }
                                      else {
                                        active[1]=1;
                                        ends[1]=1;
                                        break RUN;
                                      }
                                    }
                                    else {
                                      active[1]=1;
                                      ends[1]=1;
                                      break RUN;
                                    }
                                  }
                                }
                              }
                              else {
                                active[1]=1;
                                ends[1]=1;
                                break RUN;
                              }
                            }
                            else {
                              active[1]=1;
                              ends[1]=1;
                              break RUN;
                            }
                          }
                        
                      }
                      break;
                    
                    case 1 : 
                      if(bottleAtPos1.getprestatus()){//sysj\controller.sysj line: 26, column: 10
                        S45=2;
                        S144=0;
                        if(!conveyorStatus_o.isPartnerPresent() || conveyorStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 33, column: 4
                          conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 33, column: 4
                          S144=1;
                          active[1]=1;
                          ends[1]=1;
                          break RUN;
                        }
                        else {
                          S139=0;
                          if(conveyorStatus_o.isACK()){//sysj\controller.sysj line: 33, column: 4
                            conveyorStatus_o.setVal("done");//sysj\controller.sysj line: 33, column: 4
                            S139=1;
                            if(!conveyorStatus_o.isACK()){//sysj\controller.sysj line: 33, column: 4
                              conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 33, column: 4
                              ends[1]=2;
                              ;//sysj\controller.sysj line: 33, column: 4
                              System.out.println("Motor is off");//sysj\controller.sysj line: 34, column: 4
                              S45=3;
                              S276=0;
                              if(!conveyorStatus_o.isPartnerPresent() || conveyorStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 35, column: 4
                                conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 35, column: 4
                                S276=1;
                                active[1]=1;
                                ends[1]=1;
                                break RUN;
                              }
                              else {
                                S271=0;
                                if(conveyorStatus_o.isACK()){//sysj\controller.sysj line: 35, column: 4
                                  conveyorStatus_o.setVal("done");//sysj\controller.sysj line: 35, column: 4
                                  S271=1;
                                  if(!conveyorStatus_o.isACK()){//sysj\controller.sysj line: 35, column: 4
                                    conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 35, column: 4
                                    ends[1]=2;
                                    ;//sysj\controller.sysj line: 35, column: 4
                                    System.out.println("conveyor done");//sysj\controller.sysj line: 36, column: 4
                                    S45=4;
                                    active[1]=1;
                                    ends[1]=1;
                                    break RUN;
                                  }
                                  else {
                                    active[1]=1;
                                    ends[1]=1;
                                    break RUN;
                                  }
                                }
                                else {
                                  active[1]=1;
                                  ends[1]=1;
                                  break RUN;
                                }
                              }
                            }
                            else {
                              active[1]=1;
                              ends[1]=1;
                              break RUN;
                            }
                          }
                          else {
                            active[1]=1;
                            ends[1]=1;
                            break RUN;
                          }
                        }
                      }
                      else {
                        thread104641(tdone,ends);
                        thread104642(tdone,ends);
                        int biggest104643 = 0;
                        if(ends[2]>=biggest104643){
                          biggest104643=ends[2];
                        }
                        if(ends[3]>=biggest104643){
                          biggest104643=ends[3];
                        }
                        if(biggest104643 == 1){
                          active[1]=1;
                          ends[1]=1;
                          break RUN;
                        }
                        //FINXME code
                        if(biggest104643 == 0){
                          S45=2;
                          S144=0;
                          if(!conveyorStatus_o.isPartnerPresent() || conveyorStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 33, column: 4
                            conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 33, column: 4
                            S144=1;
                            active[1]=1;
                            ends[1]=1;
                            break RUN;
                          }
                          else {
                            S139=0;
                            if(conveyorStatus_o.isACK()){//sysj\controller.sysj line: 33, column: 4
                              conveyorStatus_o.setVal("done");//sysj\controller.sysj line: 33, column: 4
                              S139=1;
                              if(!conveyorStatus_o.isACK()){//sysj\controller.sysj line: 33, column: 4
                                conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 33, column: 4
                                ends[1]=2;
                                ;//sysj\controller.sysj line: 33, column: 4
                                System.out.println("Motor is off");//sysj\controller.sysj line: 34, column: 4
                                S45=3;
                                S276=0;
                                if(!conveyorStatus_o.isPartnerPresent() || conveyorStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 35, column: 4
                                  conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 35, column: 4
                                  S276=1;
                                  active[1]=1;
                                  ends[1]=1;
                                  break RUN;
                                }
                                else {
                                  S271=0;
                                  if(conveyorStatus_o.isACK()){//sysj\controller.sysj line: 35, column: 4
                                    conveyorStatus_o.setVal("done");//sysj\controller.sysj line: 35, column: 4
                                    S271=1;
                                    if(!conveyorStatus_o.isACK()){//sysj\controller.sysj line: 35, column: 4
                                      conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 35, column: 4
                                      ends[1]=2;
                                      ;//sysj\controller.sysj line: 35, column: 4
                                      System.out.println("conveyor done");//sysj\controller.sysj line: 36, column: 4
                                      S45=4;
                                      active[1]=1;
                                      ends[1]=1;
                                      break RUN;
                                    }
                                    else {
                                      active[1]=1;
                                      ends[1]=1;
                                      break RUN;
                                    }
                                  }
                                  else {
                                    active[1]=1;
                                    ends[1]=1;
                                    break RUN;
                                  }
                                }
                              }
                              else {
                                active[1]=1;
                                ends[1]=1;
                                break RUN;
                              }
                            }
                            else {
                              active[1]=1;
                              ends[1]=1;
                              break RUN;
                            }
                          }
                        }
                      }
                    
                    case 2 : 
                      switch(S144){
                        case 0 : 
                          if(!conveyorStatus_o.isPartnerPresent() || conveyorStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 33, column: 4
                            conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 33, column: 4
                            S144=1;
                            active[1]=1;
                            ends[1]=1;
                            break RUN;
                          }
                          else {
                            switch(S139){
                              case 0 : 
                                if(conveyorStatus_o.isACK()){//sysj\controller.sysj line: 33, column: 4
                                  conveyorStatus_o.setVal("done");//sysj\controller.sysj line: 33, column: 4
                                  S139=1;
                                  if(!conveyorStatus_o.isACK()){//sysj\controller.sysj line: 33, column: 4
                                    conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 33, column: 4
                                    ends[1]=2;
                                    ;//sysj\controller.sysj line: 33, column: 4
                                    System.out.println("Motor is off");//sysj\controller.sysj line: 34, column: 4
                                    S45=3;
                                    S276=0;
                                    if(!conveyorStatus_o.isPartnerPresent() || conveyorStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 35, column: 4
                                      conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 35, column: 4
                                      S276=1;
                                      active[1]=1;
                                      ends[1]=1;
                                      break RUN;
                                    }
                                    else {
                                      S271=0;
                                      if(conveyorStatus_o.isACK()){//sysj\controller.sysj line: 35, column: 4
                                        conveyorStatus_o.setVal("done");//sysj\controller.sysj line: 35, column: 4
                                        S271=1;
                                        if(!conveyorStatus_o.isACK()){//sysj\controller.sysj line: 35, column: 4
                                          conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 35, column: 4
                                          ends[1]=2;
                                          ;//sysj\controller.sysj line: 35, column: 4
                                          System.out.println("conveyor done");//sysj\controller.sysj line: 36, column: 4
                                          S45=4;
                                          active[1]=1;
                                          ends[1]=1;
                                          break RUN;
                                        }
                                        else {
                                          active[1]=1;
                                          ends[1]=1;
                                          break RUN;
                                        }
                                      }
                                      else {
                                        active[1]=1;
                                        ends[1]=1;
                                        break RUN;
                                      }
                                    }
                                  }
                                  else {
                                    active[1]=1;
                                    ends[1]=1;
                                    break RUN;
                                  }
                                }
                                else {
                                  active[1]=1;
                                  ends[1]=1;
                                  break RUN;
                                }
                              
                              case 1 : 
                                if(!conveyorStatus_o.isACK()){//sysj\controller.sysj line: 33, column: 4
                                  conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 33, column: 4
                                  ends[1]=2;
                                  ;//sysj\controller.sysj line: 33, column: 4
                                  System.out.println("Motor is off");//sysj\controller.sysj line: 34, column: 4
                                  S45=3;
                                  S276=0;
                                  if(!conveyorStatus_o.isPartnerPresent() || conveyorStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 35, column: 4
                                    conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 35, column: 4
                                    S276=1;
                                    active[1]=1;
                                    ends[1]=1;
                                    break RUN;
                                  }
                                  else {
                                    S271=0;
                                    if(conveyorStatus_o.isACK()){//sysj\controller.sysj line: 35, column: 4
                                      conveyorStatus_o.setVal("done");//sysj\controller.sysj line: 35, column: 4
                                      S271=1;
                                      if(!conveyorStatus_o.isACK()){//sysj\controller.sysj line: 35, column: 4
                                        conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 35, column: 4
                                        ends[1]=2;
                                        ;//sysj\controller.sysj line: 35, column: 4
                                        System.out.println("conveyor done");//sysj\controller.sysj line: 36, column: 4
                                        S45=4;
                                        active[1]=1;
                                        ends[1]=1;
                                        break RUN;
                                      }
                                      else {
                                        active[1]=1;
                                        ends[1]=1;
                                        break RUN;
                                      }
                                    }
                                    else {
                                      active[1]=1;
                                      ends[1]=1;
                                      break RUN;
                                    }
                                  }
                                }
                                else {
                                  active[1]=1;
                                  ends[1]=1;
                                  break RUN;
                                }
                              
                            }
                          }
                          break;
                        
                        case 1 : 
                          S144=1;
                          S144=0;
                          if(!conveyorStatus_o.isPartnerPresent() || conveyorStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 33, column: 4
                            conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 33, column: 4
                            S144=1;
                            active[1]=1;
                            ends[1]=1;
                            break RUN;
                          }
                          else {
                            S139=0;
                            if(conveyorStatus_o.isACK()){//sysj\controller.sysj line: 33, column: 4
                              conveyorStatus_o.setVal("done");//sysj\controller.sysj line: 33, column: 4
                              S139=1;
                              if(!conveyorStatus_o.isACK()){//sysj\controller.sysj line: 33, column: 4
                                conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 33, column: 4
                                ends[1]=2;
                                ;//sysj\controller.sysj line: 33, column: 4
                                System.out.println("Motor is off");//sysj\controller.sysj line: 34, column: 4
                                S45=3;
                                S276=0;
                                if(!conveyorStatus_o.isPartnerPresent() || conveyorStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 35, column: 4
                                  conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 35, column: 4
                                  S276=1;
                                  active[1]=1;
                                  ends[1]=1;
                                  break RUN;
                                }
                                else {
                                  S271=0;
                                  if(conveyorStatus_o.isACK()){//sysj\controller.sysj line: 35, column: 4
                                    conveyorStatus_o.setVal("done");//sysj\controller.sysj line: 35, column: 4
                                    S271=1;
                                    if(!conveyorStatus_o.isACK()){//sysj\controller.sysj line: 35, column: 4
                                      conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 35, column: 4
                                      ends[1]=2;
                                      ;//sysj\controller.sysj line: 35, column: 4
                                      System.out.println("conveyor done");//sysj\controller.sysj line: 36, column: 4
                                      S45=4;
                                      active[1]=1;
                                      ends[1]=1;
                                      break RUN;
                                    }
                                    else {
                                      active[1]=1;
                                      ends[1]=1;
                                      break RUN;
                                    }
                                  }
                                  else {
                                    active[1]=1;
                                    ends[1]=1;
                                    break RUN;
                                  }
                                }
                              }
                              else {
                                active[1]=1;
                                ends[1]=1;
                                break RUN;
                              }
                            }
                            else {
                              active[1]=1;
                              ends[1]=1;
                              break RUN;
                            }
                          }
                        
                      }
                      break;
                    
                    case 3 : 
                      switch(S276){
                        case 0 : 
                          if(!conveyorStatus_o.isPartnerPresent() || conveyorStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 35, column: 4
                            conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 35, column: 4
                            S276=1;
                            active[1]=1;
                            ends[1]=1;
                            break RUN;
                          }
                          else {
                            switch(S271){
                              case 0 : 
                                if(conveyorStatus_o.isACK()){//sysj\controller.sysj line: 35, column: 4
                                  conveyorStatus_o.setVal("done");//sysj\controller.sysj line: 35, column: 4
                                  S271=1;
                                  if(!conveyorStatus_o.isACK()){//sysj\controller.sysj line: 35, column: 4
                                    conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 35, column: 4
                                    ends[1]=2;
                                    ;//sysj\controller.sysj line: 35, column: 4
                                    System.out.println("conveyor done");//sysj\controller.sysj line: 36, column: 4
                                    S45=4;
                                    active[1]=1;
                                    ends[1]=1;
                                    break RUN;
                                  }
                                  else {
                                    active[1]=1;
                                    ends[1]=1;
                                    break RUN;
                                  }
                                }
                                else {
                                  active[1]=1;
                                  ends[1]=1;
                                  break RUN;
                                }
                              
                              case 1 : 
                                if(!conveyorStatus_o.isACK()){//sysj\controller.sysj line: 35, column: 4
                                  conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 35, column: 4
                                  ends[1]=2;
                                  ;//sysj\controller.sysj line: 35, column: 4
                                  System.out.println("conveyor done");//sysj\controller.sysj line: 36, column: 4
                                  S45=4;
                                  active[1]=1;
                                  ends[1]=1;
                                  break RUN;
                                }
                                else {
                                  active[1]=1;
                                  ends[1]=1;
                                  break RUN;
                                }
                              
                            }
                          }
                          break;
                        
                        case 1 : 
                          S276=1;
                          S276=0;
                          if(!conveyorStatus_o.isPartnerPresent() || conveyorStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 35, column: 4
                            conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 35, column: 4
                            S276=1;
                            active[1]=1;
                            ends[1]=1;
                            break RUN;
                          }
                          else {
                            S271=0;
                            if(conveyorStatus_o.isACK()){//sysj\controller.sysj line: 35, column: 4
                              conveyorStatus_o.setVal("done");//sysj\controller.sysj line: 35, column: 4
                              S271=1;
                              if(!conveyorStatus_o.isACK()){//sysj\controller.sysj line: 35, column: 4
                                conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 35, column: 4
                                ends[1]=2;
                                ;//sysj\controller.sysj line: 35, column: 4
                                System.out.println("conveyor done");//sysj\controller.sysj line: 36, column: 4
                                S45=4;
                                active[1]=1;
                                ends[1]=1;
                                break RUN;
                              }
                              else {
                                active[1]=1;
                                ends[1]=1;
                                break RUN;
                              }
                            }
                            else {
                              active[1]=1;
                              ends[1]=1;
                              break RUN;
                            }
                          }
                        
                      }
                      break;
                    
                    case 4 : 
                      S45=4;
                      S22=2;
                      active[1]=1;
                      ends[1]=1;
                      break RUN;
                    
                  }
                  break;
                
                case 1 : 
                  switch(S549){
                    case 0 : 
                      switch(S547){
                        case 0 : 
                          if(bottleLeftPos5.getprestatus()){//sysj\controller.sysj line: 42, column: 11
                            conveyorStatus_o.setPreempted();
                            S547=1;
                            S487=0;
                            if(!conveyorStatus_o.isPartnerPresent() || conveyorStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 46, column: 5
                              conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 46, column: 5
                              S487=1;
                              active[1]=1;
                              ends[1]=1;
                              break RUN;
                            }
                            else {
                              S482=0;
                              if(conveyorStatus_o.isACK()){//sysj\controller.sysj line: 46, column: 5
                                conveyorStatus_o.setVal("done");//sysj\controller.sysj line: 46, column: 5
                                S482=1;
                                if(!conveyorStatus_o.isACK()){//sysj\controller.sysj line: 46, column: 5
                                  conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 46, column: 5
                                  ends[1]=2;
                                  ;//sysj\controller.sysj line: 46, column: 5
                                  System.out.println("conveyor idling");//sysj\controller.sysj line: 50, column: 4
                                  S549=1;
                                  S556=0;
                                  if(!conveyorStatus_o.isPartnerPresent() || conveyorStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 51, column: 4
                                    conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 51, column: 4
                                    S556=1;
                                    active[1]=1;
                                    ends[1]=1;
                                    break RUN;
                                  }
                                  else {
                                    S551=0;
                                    if(conveyorStatus_o.isACK()){//sysj\controller.sysj line: 51, column: 4
                                      conveyorStatus_o.setVal("idle");//sysj\controller.sysj line: 51, column: 4
                                      S551=1;
                                      if(!conveyorStatus_o.isACK()){//sysj\controller.sysj line: 51, column: 4
                                        conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 51, column: 4
                                        ends[1]=2;
                                        ;//sysj\controller.sysj line: 51, column: 4
                                        S22=2;
                                        active[1]=1;
                                        ends[1]=1;
                                        break RUN;
                                      }
                                      else {
                                        active[1]=1;
                                        ends[1]=1;
                                        break RUN;
                                      }
                                    }
                                    else {
                                      active[1]=1;
                                      ends[1]=1;
                                      break RUN;
                                    }
                                  }
                                }
                                else {
                                  active[1]=1;
                                  ends[1]=1;
                                  break RUN;
                                }
                              }
                              else {
                                active[1]=1;
                                ends[1]=1;
                                break RUN;
                              }
                            }
                          }
                          else {
                            thread104644(tdone,ends);
                            thread104645(tdone,ends);
                            thread104646(tdone,ends);
                            int biggest104647 = 0;
                            if(ends[4]>=biggest104647){
                              biggest104647=ends[4];
                            }
                            if(ends[5]>=biggest104647){
                              biggest104647=ends[5];
                            }
                            if(ends[6]>=biggest104647){
                              biggest104647=ends[6];
                            }
                            if(biggest104647 == 1){
                              active[1]=1;
                              ends[1]=1;
                              break RUN;
                            }
                            //FINXME code
                            if(biggest104647 == 0){
                              S547=1;
                              S487=0;
                              if(!conveyorStatus_o.isPartnerPresent() || conveyorStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 46, column: 5
                                conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 46, column: 5
                                S487=1;
                                active[1]=1;
                                ends[1]=1;
                                break RUN;
                              }
                              else {
                                S482=0;
                                if(conveyorStatus_o.isACK()){//sysj\controller.sysj line: 46, column: 5
                                  conveyorStatus_o.setVal("done");//sysj\controller.sysj line: 46, column: 5
                                  S482=1;
                                  if(!conveyorStatus_o.isACK()){//sysj\controller.sysj line: 46, column: 5
                                    conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 46, column: 5
                                    ends[1]=2;
                                    ;//sysj\controller.sysj line: 46, column: 5
                                    System.out.println("conveyor idling");//sysj\controller.sysj line: 50, column: 4
                                    S549=1;
                                    S556=0;
                                    if(!conveyorStatus_o.isPartnerPresent() || conveyorStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 51, column: 4
                                      conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 51, column: 4
                                      S556=1;
                                      active[1]=1;
                                      ends[1]=1;
                                      break RUN;
                                    }
                                    else {
                                      S551=0;
                                      if(conveyorStatus_o.isACK()){//sysj\controller.sysj line: 51, column: 4
                                        conveyorStatus_o.setVal("idle");//sysj\controller.sysj line: 51, column: 4
                                        S551=1;
                                        if(!conveyorStatus_o.isACK()){//sysj\controller.sysj line: 51, column: 4
                                          conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 51, column: 4
                                          ends[1]=2;
                                          ;//sysj\controller.sysj line: 51, column: 4
                                          S22=2;
                                          active[1]=1;
                                          ends[1]=1;
                                          break RUN;
                                        }
                                        else {
                                          active[1]=1;
                                          ends[1]=1;
                                          break RUN;
                                        }
                                      }
                                      else {
                                        active[1]=1;
                                        ends[1]=1;
                                        break RUN;
                                      }
                                    }
                                  }
                                  else {
                                    active[1]=1;
                                    ends[1]=1;
                                    break RUN;
                                  }
                                }
                                else {
                                  active[1]=1;
                                  ends[1]=1;
                                  break RUN;
                                }
                              }
                            }
                          }
                        
                        case 1 : 
                          switch(S487){
                            case 0 : 
                              if(!conveyorStatus_o.isPartnerPresent() || conveyorStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 46, column: 5
                                conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 46, column: 5
                                S487=1;
                                active[1]=1;
                                ends[1]=1;
                                break RUN;
                              }
                              else {
                                switch(S482){
                                  case 0 : 
                                    if(conveyorStatus_o.isACK()){//sysj\controller.sysj line: 46, column: 5
                                      conveyorStatus_o.setVal("done");//sysj\controller.sysj line: 46, column: 5
                                      S482=1;
                                      if(!conveyorStatus_o.isACK()){//sysj\controller.sysj line: 46, column: 5
                                        conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 46, column: 5
                                        ends[1]=2;
                                        ;//sysj\controller.sysj line: 46, column: 5
                                        System.out.println("conveyor idling");//sysj\controller.sysj line: 50, column: 4
                                        S549=1;
                                        S556=0;
                                        if(!conveyorStatus_o.isPartnerPresent() || conveyorStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 51, column: 4
                                          conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 51, column: 4
                                          S556=1;
                                          active[1]=1;
                                          ends[1]=1;
                                          break RUN;
                                        }
                                        else {
                                          S551=0;
                                          if(conveyorStatus_o.isACK()){//sysj\controller.sysj line: 51, column: 4
                                            conveyorStatus_o.setVal("idle");//sysj\controller.sysj line: 51, column: 4
                                            S551=1;
                                            if(!conveyorStatus_o.isACK()){//sysj\controller.sysj line: 51, column: 4
                                              conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 51, column: 4
                                              ends[1]=2;
                                              ;//sysj\controller.sysj line: 51, column: 4
                                              S22=2;
                                              active[1]=1;
                                              ends[1]=1;
                                              break RUN;
                                            }
                                            else {
                                              active[1]=1;
                                              ends[1]=1;
                                              break RUN;
                                            }
                                          }
                                          else {
                                            active[1]=1;
                                            ends[1]=1;
                                            break RUN;
                                          }
                                        }
                                      }
                                      else {
                                        active[1]=1;
                                        ends[1]=1;
                                        break RUN;
                                      }
                                    }
                                    else {
                                      active[1]=1;
                                      ends[1]=1;
                                      break RUN;
                                    }
                                  
                                  case 1 : 
                                    if(!conveyorStatus_o.isACK()){//sysj\controller.sysj line: 46, column: 5
                                      conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 46, column: 5
                                      ends[1]=2;
                                      ;//sysj\controller.sysj line: 46, column: 5
                                      System.out.println("conveyor idling");//sysj\controller.sysj line: 50, column: 4
                                      S549=1;
                                      S556=0;
                                      if(!conveyorStatus_o.isPartnerPresent() || conveyorStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 51, column: 4
                                        conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 51, column: 4
                                        S556=1;
                                        active[1]=1;
                                        ends[1]=1;
                                        break RUN;
                                      }
                                      else {
                                        S551=0;
                                        if(conveyorStatus_o.isACK()){//sysj\controller.sysj line: 51, column: 4
                                          conveyorStatus_o.setVal("idle");//sysj\controller.sysj line: 51, column: 4
                                          S551=1;
                                          if(!conveyorStatus_o.isACK()){//sysj\controller.sysj line: 51, column: 4
                                            conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 51, column: 4
                                            ends[1]=2;
                                            ;//sysj\controller.sysj line: 51, column: 4
                                            S22=2;
                                            active[1]=1;
                                            ends[1]=1;
                                            break RUN;
                                          }
                                          else {
                                            active[1]=1;
                                            ends[1]=1;
                                            break RUN;
                                          }
                                        }
                                        else {
                                          active[1]=1;
                                          ends[1]=1;
                                          break RUN;
                                        }
                                      }
                                    }
                                    else {
                                      active[1]=1;
                                      ends[1]=1;
                                      break RUN;
                                    }
                                  
                                }
                              }
                              break;
                            
                            case 1 : 
                              S487=1;
                              S487=0;
                              if(!conveyorStatus_o.isPartnerPresent() || conveyorStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 46, column: 5
                                conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 46, column: 5
                                S487=1;
                                active[1]=1;
                                ends[1]=1;
                                break RUN;
                              }
                              else {
                                S482=0;
                                if(conveyorStatus_o.isACK()){//sysj\controller.sysj line: 46, column: 5
                                  conveyorStatus_o.setVal("done");//sysj\controller.sysj line: 46, column: 5
                                  S482=1;
                                  if(!conveyorStatus_o.isACK()){//sysj\controller.sysj line: 46, column: 5
                                    conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 46, column: 5
                                    ends[1]=2;
                                    ;//sysj\controller.sysj line: 46, column: 5
                                    System.out.println("conveyor idling");//sysj\controller.sysj line: 50, column: 4
                                    S549=1;
                                    S556=0;
                                    if(!conveyorStatus_o.isPartnerPresent() || conveyorStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 51, column: 4
                                      conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 51, column: 4
                                      S556=1;
                                      active[1]=1;
                                      ends[1]=1;
                                      break RUN;
                                    }
                                    else {
                                      S551=0;
                                      if(conveyorStatus_o.isACK()){//sysj\controller.sysj line: 51, column: 4
                                        conveyorStatus_o.setVal("idle");//sysj\controller.sysj line: 51, column: 4
                                        S551=1;
                                        if(!conveyorStatus_o.isACK()){//sysj\controller.sysj line: 51, column: 4
                                          conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 51, column: 4
                                          ends[1]=2;
                                          ;//sysj\controller.sysj line: 51, column: 4
                                          S22=2;
                                          active[1]=1;
                                          ends[1]=1;
                                          break RUN;
                                        }
                                        else {
                                          active[1]=1;
                                          ends[1]=1;
                                          break RUN;
                                        }
                                      }
                                      else {
                                        active[1]=1;
                                        ends[1]=1;
                                        break RUN;
                                      }
                                    }
                                  }
                                  else {
                                    active[1]=1;
                                    ends[1]=1;
                                    break RUN;
                                  }
                                }
                                else {
                                  active[1]=1;
                                  ends[1]=1;
                                  break RUN;
                                }
                              }
                            
                          }
                          break;
                        
                      }
                      break;
                    
                    case 1 : 
                      switch(S556){
                        case 0 : 
                          if(!conveyorStatus_o.isPartnerPresent() || conveyorStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 51, column: 4
                            conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 51, column: 4
                            S556=1;
                            active[1]=1;
                            ends[1]=1;
                            break RUN;
                          }
                          else {
                            switch(S551){
                              case 0 : 
                                if(conveyorStatus_o.isACK()){//sysj\controller.sysj line: 51, column: 4
                                  conveyorStatus_o.setVal("idle");//sysj\controller.sysj line: 51, column: 4
                                  S551=1;
                                  if(!conveyorStatus_o.isACK()){//sysj\controller.sysj line: 51, column: 4
                                    conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 51, column: 4
                                    ends[1]=2;
                                    ;//sysj\controller.sysj line: 51, column: 4
                                    S22=2;
                                    active[1]=1;
                                    ends[1]=1;
                                    break RUN;
                                  }
                                  else {
                                    active[1]=1;
                                    ends[1]=1;
                                    break RUN;
                                  }
                                }
                                else {
                                  active[1]=1;
                                  ends[1]=1;
                                  break RUN;
                                }
                              
                              case 1 : 
                                if(!conveyorStatus_o.isACK()){//sysj\controller.sysj line: 51, column: 4
                                  conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 51, column: 4
                                  ends[1]=2;
                                  ;//sysj\controller.sysj line: 51, column: 4
                                  S22=2;
                                  active[1]=1;
                                  ends[1]=1;
                                  break RUN;
                                }
                                else {
                                  active[1]=1;
                                  ends[1]=1;
                                  break RUN;
                                }
                              
                            }
                          }
                          break;
                        
                        case 1 : 
                          S556=1;
                          S556=0;
                          if(!conveyorStatus_o.isPartnerPresent() || conveyorStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 51, column: 4
                            conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 51, column: 4
                            S556=1;
                            active[1]=1;
                            ends[1]=1;
                            break RUN;
                          }
                          else {
                            S551=0;
                            if(conveyorStatus_o.isACK()){//sysj\controller.sysj line: 51, column: 4
                              conveyorStatus_o.setVal("idle");//sysj\controller.sysj line: 51, column: 4
                              S551=1;
                              if(!conveyorStatus_o.isACK()){//sysj\controller.sysj line: 51, column: 4
                                conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 51, column: 4
                                ends[1]=2;
                                ;//sysj\controller.sysj line: 51, column: 4
                                S22=2;
                                active[1]=1;
                                ends[1]=1;
                                break RUN;
                              }
                              else {
                                active[1]=1;
                                ends[1]=1;
                                break RUN;
                              }
                            }
                            else {
                              active[1]=1;
                              ends[1]=1;
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
              S22=2;
              S22=0;
              S6=0;
              if(!conveyorReq_in.isPartnerPresent() || conveyorReq_in.isPartnerPreempted()){//sysj\controller.sysj line: 14, column: 3
                conveyorReq_in.setACK(false);//sysj\controller.sysj line: 14, column: 3
                S6=1;
                active[1]=1;
                ends[1]=1;
                break RUN;
              }
              else {
                S1=0;
                if(!conveyorReq_in.isREQ()){//sysj\controller.sysj line: 14, column: 3
                  conveyorReq_in.setACK(true);//sysj\controller.sysj line: 14, column: 3
                  S1=1;
                  if(conveyorReq_in.isREQ()){//sysj\controller.sysj line: 14, column: 3
                    conveyorReq_in.setACK(false);//sysj\controller.sysj line: 14, column: 3
                    ends[1]=2;
                    ;//sysj\controller.sysj line: 14, column: 3
                    req_thread_1 = (Boolean)(conveyorReq_in.getVal() == null ? null : ((Boolean)conveyorReq_in.getVal()));//sysj\controller.sysj line: 16, column: 3
                    System.out.println("received?");//sysj\controller.sysj line: 17, column: 3
                    System.out.println(req_thread_1);//sysj\controller.sysj line: 18, column: 3
                    S22=1;
                    if(req_thread_1){//sysj\controller.sysj line: 20, column: 3
                      S682=0;
                      S45=0;
                      S29=0;
                      if(!conveyorStatus_o.isPartnerPresent() || conveyorStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 21, column: 4
                        conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 21, column: 4
                        S29=1;
                        active[1]=1;
                        ends[1]=1;
                        break RUN;
                      }
                      else {
                        S24=0;
                        if(conveyorStatus_o.isACK()){//sysj\controller.sysj line: 21, column: 4
                          conveyorStatus_o.setVal("busy");//sysj\controller.sysj line: 21, column: 4
                          S24=1;
                          if(!conveyorStatus_o.isACK()){//sysj\controller.sysj line: 21, column: 4
                            conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 21, column: 4
                            ends[1]=2;
                            ;//sysj\controller.sysj line: 21, column: 4
                            System.out.println("conveyor busy");//sysj\controller.sysj line: 23, column: 4
                            S45=1;
                            if(!bottleAtPos1.getprestatus()){//sysj\controller.sysj line: 27, column: 13
                              System.out.println("Motor is on");//sysj\controller.sysj line: 28, column: 6
                              thread104648(tdone,ends);
                              thread104649(tdone,ends);
                              int biggest104650 = 0;
                              if(ends[2]>=biggest104650){
                                biggest104650=ends[2];
                              }
                              if(ends[3]>=biggest104650){
                                biggest104650=ends[3];
                              }
                              if(biggest104650 == 1){
                                active[1]=1;
                                ends[1]=1;
                                break RUN;
                              }
                            }
                            else {
                              S45=2;
                              S144=0;
                              if(!conveyorStatus_o.isPartnerPresent() || conveyorStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 33, column: 4
                                conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 33, column: 4
                                S144=1;
                                active[1]=1;
                                ends[1]=1;
                                break RUN;
                              }
                              else {
                                S139=0;
                                if(conveyorStatus_o.isACK()){//sysj\controller.sysj line: 33, column: 4
                                  conveyorStatus_o.setVal("done");//sysj\controller.sysj line: 33, column: 4
                                  S139=1;
                                  if(!conveyorStatus_o.isACK()){//sysj\controller.sysj line: 33, column: 4
                                    conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 33, column: 4
                                    ends[1]=2;
                                    ;//sysj\controller.sysj line: 33, column: 4
                                    System.out.println("Motor is off");//sysj\controller.sysj line: 34, column: 4
                                    S45=3;
                                    S276=0;
                                    if(!conveyorStatus_o.isPartnerPresent() || conveyorStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 35, column: 4
                                      conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 35, column: 4
                                      S276=1;
                                      active[1]=1;
                                      ends[1]=1;
                                      break RUN;
                                    }
                                    else {
                                      S271=0;
                                      if(conveyorStatus_o.isACK()){//sysj\controller.sysj line: 35, column: 4
                                        conveyorStatus_o.setVal("done");//sysj\controller.sysj line: 35, column: 4
                                        S271=1;
                                        if(!conveyorStatus_o.isACK()){//sysj\controller.sysj line: 35, column: 4
                                          conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 35, column: 4
                                          ends[1]=2;
                                          ;//sysj\controller.sysj line: 35, column: 4
                                          System.out.println("conveyor done");//sysj\controller.sysj line: 36, column: 4
                                          S45=4;
                                          active[1]=1;
                                          ends[1]=1;
                                          break RUN;
                                        }
                                        else {
                                          active[1]=1;
                                          ends[1]=1;
                                          break RUN;
                                        }
                                      }
                                      else {
                                        active[1]=1;
                                        ends[1]=1;
                                        break RUN;
                                      }
                                    }
                                  }
                                  else {
                                    active[1]=1;
                                    ends[1]=1;
                                    break RUN;
                                  }
                                }
                                else {
                                  active[1]=1;
                                  ends[1]=1;
                                  break RUN;
                                }
                              }
                            }
                          }
                          else {
                            active[1]=1;
                            ends[1]=1;
                            break RUN;
                          }
                        }
                        else {
                          active[1]=1;
                          ends[1]=1;
                          break RUN;
                        }
                      }
                    }
                    else {
                      S682=1;
                      S549=0;
                      if(bottleAtPos5.getprestatus()){//sysj\controller.sysj line: 41, column: 12
                        S547=0;
                        thread104651(tdone,ends);
                        thread104652(tdone,ends);
                        thread104653(tdone,ends);
                        int biggest104654 = 0;
                        if(ends[4]>=biggest104654){
                          biggest104654=ends[4];
                        }
                        if(ends[5]>=biggest104654){
                          biggest104654=ends[5];
                        }
                        if(ends[6]>=biggest104654){
                          biggest104654=ends[6];
                        }
                        if(biggest104654 == 1){
                          active[1]=1;
                          ends[1]=1;
                          break RUN;
                        }
                      }
                      else {
                        System.out.println("conveyor idling");//sysj\controller.sysj line: 50, column: 4
                        S549=1;
                        S556=0;
                        if(!conveyorStatus_o.isPartnerPresent() || conveyorStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 51, column: 4
                          conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 51, column: 4
                          S556=1;
                          active[1]=1;
                          ends[1]=1;
                          break RUN;
                        }
                        else {
                          S551=0;
                          if(conveyorStatus_o.isACK()){//sysj\controller.sysj line: 51, column: 4
                            conveyorStatus_o.setVal("idle");//sysj\controller.sysj line: 51, column: 4
                            S551=1;
                            if(!conveyorStatus_o.isACK()){//sysj\controller.sysj line: 51, column: 4
                              conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 51, column: 4
                              ends[1]=2;
                              ;//sysj\controller.sysj line: 51, column: 4
                              S22=2;
                              active[1]=1;
                              ends[1]=1;
                              break RUN;
                            }
                            else {
                              active[1]=1;
                              ends[1]=1;
                              break RUN;
                            }
                          }
                          else {
                            active[1]=1;
                            ends[1]=1;
                            break RUN;
                          }
                        }
                      }
                    }
                  }
                  else {
                    active[1]=1;
                    ends[1]=1;
                    break RUN;
                  }
                }
                else {
                  active[1]=1;
                  ends[1]=1;
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
    // --------------------------------------------------
  }
  
  public void run(){
    while(active[1] != 0){
      int index = 1;
      if(paused[index]==1 || suspended[index]==1 || active[index] == 0){
        for(int h=1;h<paused.length;++h){
          paused[h]=0;
        }
      }
      if(paused[1]!=0 || suspended[1]!=0 || active[1]!=1);
      else{
        if(!df){
          conveyorReq_in.gethook();
          conveyorStatus_o.gethook();
          bottleAtPos1.gethook();
          bottleLeftPos5.gethook();
          bottleAtPos5.gethook();
          df = true;
        }
        runClockDomain();
      }
      bottleAtPos1.setpreclear();
      bottleLeftPos5.setpreclear();
      bottleAtPos5.setpreclear();
      motConveyorOnOff.setpreclear();
      motorPos1On.setpreclear();
      motorPos5On.setpreclear();
      int dummyint = 0;
      for(int qw=0;qw<currsigs.size();++qw){
        dummyint = ((Signal)currsigs.elementAt(qw)).getStatus() ? ((Signal)currsigs.elementAt(qw)).setprepresent() : ((Signal)currsigs.elementAt(qw)).setpreclear();
        ((Signal)currsigs.elementAt(qw)).setpreval(((Signal)currsigs.elementAt(qw)).getValue());
      }
      currsigs.removeAllElements();
      dummyint = bottleAtPos1.getStatus() ? bottleAtPos1.setprepresent() : bottleAtPos1.setpreclear();
      bottleAtPos1.setpreval(bottleAtPos1.getValue());
      bottleAtPos1.setClear();
      dummyint = bottleLeftPos5.getStatus() ? bottleLeftPos5.setprepresent() : bottleLeftPos5.setpreclear();
      bottleLeftPos5.setpreval(bottleLeftPos5.getValue());
      bottleLeftPos5.setClear();
      dummyint = bottleAtPos5.getStatus() ? bottleAtPos5.setprepresent() : bottleAtPos5.setpreclear();
      bottleAtPos5.setpreval(bottleAtPos5.getValue());
      bottleAtPos5.setClear();
      motConveyorOnOff.sethook();
      motConveyorOnOff.setClear();
      motorPos1On.sethook();
      motorPos1On.setClear();
      motorPos5On.sethook();
      motorPos5On.setClear();
      conveyorReq_in.sethook();
      conveyorStatus_o.sethook();
      if(paused[1]!=0 || suspended[1]!=0 || active[1]!=1);
      else{
        conveyorReq_in.gethook();
        conveyorStatus_o.gethook();
        bottleAtPos1.gethook();
        bottleLeftPos5.gethook();
        bottleAtPos5.gethook();
      }
      runFinisher();
      if(active[1] == 0){
      	this.terminated = true;
      }
      if(!threaded) break;
    }
  }
}
