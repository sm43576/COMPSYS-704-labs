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
  private int S9514 = 1;
  private int S22 = 1;
  private int S6 = 1;
  private int S1 = 1;
  private int S809 = 1;
  private int S45 = 1;
  private int S29 = 1;
  private int S24 = 1;
  private int S50 = 1;
  private int S55 = 1;
  private int S236 = 1;
  private int S231 = 1;
  private int S368 = 1;
  private int S363 = 1;
  private int S676 = 1;
  private int S608 = 1;
  private int S542 = 1;
  private int S547 = 1;
  private int S571 = 1;
  private int S554 = 1;
  private int S549 = 1;
  private int S615 = 1;
  private int S610 = 1;
  private int S683 = 1;
  private int S678 = 1;
  
  private int[] ends = new int[23];
  private int[] tdone = new int[23];
  
  public void thread116617(int [] tdone, int [] ends){
        S571=1;
    S554=0;
    if(!conveyorStatus_o.isPartnerPresent() || conveyorStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 45, column: 10
      conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 45, column: 10
      S554=1;
      active[6]=1;
      ends[6]=1;
      tdone[6]=1;
    }
    else {
      S549=0;
      if(conveyorStatus_o.isACK()){//sysj\controller.sysj line: 45, column: 10
        conveyorStatus_o.setVal("busy");//sysj\controller.sysj line: 45, column: 10
        S549=1;
        if(!conveyorStatus_o.isACK()){//sysj\controller.sysj line: 45, column: 10
          conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 45, column: 10
          ends[6]=2;
          ;//sysj\controller.sysj line: 45, column: 10
          S571=0;
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

  public void thread116616(int [] tdone, int [] ends){
        S547=1;
    motorPos5On.setPresent();//sysj\controller.sysj line: 44, column: 38
    currsigs.addElement(motorPos5On);
    active[5]=1;
    ends[5]=1;
    tdone[5]=1;
  }

  public void thread116615(int [] tdone, int [] ends){
        S542=1;
    motConveyorOnOff.setPresent();//sysj\controller.sysj line: 44, column: 7
    currsigs.addElement(motConveyorOnOff);
    active[4]=1;
    ends[4]=1;
    tdone[4]=1;
  }

  public void thread116613(int [] tdone, int [] ends){
        S55=1;
    motorPos1On.setPresent();//sysj\controller.sysj line: 30, column: 38
    currsigs.addElement(motorPos1On);
    active[3]=1;
    ends[3]=1;
    tdone[3]=1;
  }

  public void thread116612(int [] tdone, int [] ends){
        S50=1;
    motConveyorOnOff.setPresent();//sysj\controller.sysj line: 30, column: 7
    currsigs.addElement(motConveyorOnOff);
    active[2]=1;
    ends[2]=1;
    tdone[2]=1;
  }

  public void thread116610(int [] tdone, int [] ends){
        switch(S571){
      case 0 : 
        active[6]=0;
        ends[6]=0;
        tdone[6]=1;
        break;
      
      case 1 : 
        switch(S554){
          case 0 : 
            if(!conveyorStatus_o.isPartnerPresent() || conveyorStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 45, column: 10
              conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 45, column: 10
              S554=1;
              active[6]=1;
              ends[6]=1;
              tdone[6]=1;
            }
            else {
              switch(S549){
                case 0 : 
                  if(conveyorStatus_o.isACK()){//sysj\controller.sysj line: 45, column: 10
                    conveyorStatus_o.setVal("busy");//sysj\controller.sysj line: 45, column: 10
                    S549=1;
                    if(!conveyorStatus_o.isACK()){//sysj\controller.sysj line: 45, column: 10
                      conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 45, column: 10
                      ends[6]=2;
                      ;//sysj\controller.sysj line: 45, column: 10
                      S571=0;
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
                  if(!conveyorStatus_o.isACK()){//sysj\controller.sysj line: 45, column: 10
                    conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 45, column: 10
                    ends[6]=2;
                    ;//sysj\controller.sysj line: 45, column: 10
                    S571=0;
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
            S554=1;
            S554=0;
            if(!conveyorStatus_o.isPartnerPresent() || conveyorStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 45, column: 10
              conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 45, column: 10
              S554=1;
              active[6]=1;
              ends[6]=1;
              tdone[6]=1;
            }
            else {
              S549=0;
              if(conveyorStatus_o.isACK()){//sysj\controller.sysj line: 45, column: 10
                conveyorStatus_o.setVal("busy");//sysj\controller.sysj line: 45, column: 10
                S549=1;
                if(!conveyorStatus_o.isACK()){//sysj\controller.sysj line: 45, column: 10
                  conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 45, column: 10
                  ends[6]=2;
                  ;//sysj\controller.sysj line: 45, column: 10
                  S571=0;
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

  public void thread116609(int [] tdone, int [] ends){
        switch(S547){
      case 0 : 
        active[5]=0;
        ends[5]=0;
        tdone[5]=1;
        break;
      
      case 1 : 
        motorPos5On.setPresent();//sysj\controller.sysj line: 44, column: 38
        currsigs.addElement(motorPos5On);
        active[5]=1;
        ends[5]=1;
        tdone[5]=1;
        break;
      
    }
  }

  public void thread116608(int [] tdone, int [] ends){
        switch(S542){
      case 0 : 
        active[4]=0;
        ends[4]=0;
        tdone[4]=1;
        break;
      
      case 1 : 
        motConveyorOnOff.setPresent();//sysj\controller.sysj line: 44, column: 7
        currsigs.addElement(motConveyorOnOff);
        active[4]=1;
        ends[4]=1;
        tdone[4]=1;
        break;
      
    }
  }

  public void thread116606(int [] tdone, int [] ends){
        switch(S55){
      case 0 : 
        active[3]=0;
        ends[3]=0;
        tdone[3]=1;
        break;
      
      case 1 : 
        motorPos1On.setPresent();//sysj\controller.sysj line: 30, column: 38
        currsigs.addElement(motorPos1On);
        active[3]=1;
        ends[3]=1;
        tdone[3]=1;
        break;
      
    }
  }

  public void thread116605(int [] tdone, int [] ends){
        switch(S50){
      case 0 : 
        active[2]=0;
        ends[2]=0;
        tdone[2]=1;
        break;
      
      case 1 : 
        motConveyorOnOff.setPresent();//sysj\controller.sysj line: 30, column: 7
        currsigs.addElement(motConveyorOnOff);
        active[2]=1;
        ends[2]=1;
        tdone[2]=1;
        break;
      
    }
  }

  public void thread116603(int [] tdone, int [] ends){
        S55=1;
    motorPos1On.setPresent();//sysj\controller.sysj line: 30, column: 38
    currsigs.addElement(motorPos1On);
    active[3]=1;
    ends[3]=1;
    tdone[3]=1;
  }

  public void thread116602(int [] tdone, int [] ends){
        S50=1;
    motConveyorOnOff.setPresent();//sysj\controller.sysj line: 30, column: 7
    currsigs.addElement(motConveyorOnOff);
    active[2]=1;
    ends[2]=1;
    tdone[2]=1;
  }

  public void thread116600(int [] tdone, int [] ends){
        S55=1;
    motorPos1On.setPresent();//sysj\controller.sysj line: 30, column: 38
    currsigs.addElement(motorPos1On);
    active[3]=1;
    ends[3]=1;
    tdone[3]=1;
  }

  public void thread116599(int [] tdone, int [] ends){
        S50=1;
    motConveyorOnOff.setPresent();//sysj\controller.sysj line: 30, column: 7
    currsigs.addElement(motConveyorOnOff);
    active[2]=1;
    ends[2]=1;
    tdone[2]=1;
  }

  public void thread116597(int [] tdone, int [] ends){
        S55=1;
    motorPos1On.setPresent();//sysj\controller.sysj line: 30, column: 38
    currsigs.addElement(motorPos1On);
    active[3]=1;
    ends[3]=1;
    tdone[3]=1;
  }

  public void thread116596(int [] tdone, int [] ends){
        S50=1;
    motConveyorOnOff.setPresent();//sysj\controller.sysj line: 30, column: 7
    currsigs.addElement(motConveyorOnOff);
    active[2]=1;
    ends[2]=1;
    tdone[2]=1;
  }

  public void thread116594(int [] tdone, int [] ends){
        S571=1;
    S554=0;
    if(!conveyorStatus_o.isPartnerPresent() || conveyorStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 45, column: 10
      conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 45, column: 10
      S554=1;
      active[6]=1;
      ends[6]=1;
      tdone[6]=1;
    }
    else {
      S549=0;
      if(conveyorStatus_o.isACK()){//sysj\controller.sysj line: 45, column: 10
        conveyorStatus_o.setVal("busy");//sysj\controller.sysj line: 45, column: 10
        S549=1;
        if(!conveyorStatus_o.isACK()){//sysj\controller.sysj line: 45, column: 10
          conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 45, column: 10
          ends[6]=2;
          ;//sysj\controller.sysj line: 45, column: 10
          S571=0;
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

  public void thread116593(int [] tdone, int [] ends){
        S547=1;
    motorPos5On.setPresent();//sysj\controller.sysj line: 44, column: 38
    currsigs.addElement(motorPos5On);
    active[5]=1;
    ends[5]=1;
    tdone[5]=1;
  }

  public void thread116592(int [] tdone, int [] ends){
        S542=1;
    motConveyorOnOff.setPresent();//sysj\controller.sysj line: 44, column: 7
    currsigs.addElement(motConveyorOnOff);
    active[4]=1;
    ends[4]=1;
    tdone[4]=1;
  }

  public void thread116590(int [] tdone, int [] ends){
        S55=1;
    motorPos1On.setPresent();//sysj\controller.sysj line: 30, column: 38
    currsigs.addElement(motorPos1On);
    active[3]=1;
    ends[3]=1;
    tdone[3]=1;
  }

  public void thread116589(int [] tdone, int [] ends){
        S50=1;
    motConveyorOnOff.setPresent();//sysj\controller.sysj line: 30, column: 7
    currsigs.addElement(motConveyorOnOff);
    active[2]=1;
    ends[2]=1;
    tdone[2]=1;
  }

  public void thread116587(int [] tdone, int [] ends){
        S571=1;
    S554=0;
    if(!conveyorStatus_o.isPartnerPresent() || conveyorStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 45, column: 10
      conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 45, column: 10
      S554=1;
      active[6]=1;
      ends[6]=1;
      tdone[6]=1;
    }
    else {
      S549=0;
      if(conveyorStatus_o.isACK()){//sysj\controller.sysj line: 45, column: 10
        conveyorStatus_o.setVal("busy");//sysj\controller.sysj line: 45, column: 10
        S549=1;
        if(!conveyorStatus_o.isACK()){//sysj\controller.sysj line: 45, column: 10
          conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 45, column: 10
          ends[6]=2;
          ;//sysj\controller.sysj line: 45, column: 10
          S571=0;
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

  public void thread116586(int [] tdone, int [] ends){
        S547=1;
    motorPos5On.setPresent();//sysj\controller.sysj line: 44, column: 38
    currsigs.addElement(motorPos5On);
    active[5]=1;
    ends[5]=1;
    tdone[5]=1;
  }

  public void thread116585(int [] tdone, int [] ends){
        S542=1;
    motConveyorOnOff.setPresent();//sysj\controller.sysj line: 44, column: 7
    currsigs.addElement(motConveyorOnOff);
    active[4]=1;
    ends[4]=1;
    tdone[4]=1;
  }

  public void thread116583(int [] tdone, int [] ends){
        S55=1;
    motorPos1On.setPresent();//sysj\controller.sysj line: 30, column: 38
    currsigs.addElement(motorPos1On);
    active[3]=1;
    ends[3]=1;
    tdone[3]=1;
  }

  public void thread116582(int [] tdone, int [] ends){
        S50=1;
    motConveyorOnOff.setPresent();//sysj\controller.sysj line: 30, column: 7
    currsigs.addElement(motConveyorOnOff);
    active[2]=1;
    ends[2]=1;
    tdone[2]=1;
  }

  public void thread116580(int [] tdone, int [] ends){
        S571=1;
    S554=0;
    if(!conveyorStatus_o.isPartnerPresent() || conveyorStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 45, column: 10
      conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 45, column: 10
      S554=1;
      active[6]=1;
      ends[6]=1;
      tdone[6]=1;
    }
    else {
      S549=0;
      if(conveyorStatus_o.isACK()){//sysj\controller.sysj line: 45, column: 10
        conveyorStatus_o.setVal("busy");//sysj\controller.sysj line: 45, column: 10
        S549=1;
        if(!conveyorStatus_o.isACK()){//sysj\controller.sysj line: 45, column: 10
          conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 45, column: 10
          ends[6]=2;
          ;//sysj\controller.sysj line: 45, column: 10
          S571=0;
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

  public void thread116579(int [] tdone, int [] ends){
        S547=1;
    motorPos5On.setPresent();//sysj\controller.sysj line: 44, column: 38
    currsigs.addElement(motorPos5On);
    active[5]=1;
    ends[5]=1;
    tdone[5]=1;
  }

  public void thread116578(int [] tdone, int [] ends){
        S542=1;
    motConveyorOnOff.setPresent();//sysj\controller.sysj line: 44, column: 7
    currsigs.addElement(motConveyorOnOff);
    active[4]=1;
    ends[4]=1;
    tdone[4]=1;
  }

  public void thread116576(int [] tdone, int [] ends){
        S55=1;
    motorPos1On.setPresent();//sysj\controller.sysj line: 30, column: 38
    currsigs.addElement(motorPos1On);
    active[3]=1;
    ends[3]=1;
    tdone[3]=1;
  }

  public void thread116575(int [] tdone, int [] ends){
        S50=1;
    motConveyorOnOff.setPresent();//sysj\controller.sysj line: 30, column: 7
    currsigs.addElement(motConveyorOnOff);
    active[2]=1;
    ends[2]=1;
    tdone[2]=1;
  }

  public void thread116573(int [] tdone, int [] ends){
        S571=1;
    S554=0;
    if(!conveyorStatus_o.isPartnerPresent() || conveyorStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 45, column: 10
      conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 45, column: 10
      S554=1;
      active[6]=1;
      ends[6]=1;
      tdone[6]=1;
    }
    else {
      S549=0;
      if(conveyorStatus_o.isACK()){//sysj\controller.sysj line: 45, column: 10
        conveyorStatus_o.setVal("busy");//sysj\controller.sysj line: 45, column: 10
        S549=1;
        if(!conveyorStatus_o.isACK()){//sysj\controller.sysj line: 45, column: 10
          conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 45, column: 10
          ends[6]=2;
          ;//sysj\controller.sysj line: 45, column: 10
          S571=0;
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

  public void thread116572(int [] tdone, int [] ends){
        S547=1;
    motorPos5On.setPresent();//sysj\controller.sysj line: 44, column: 38
    currsigs.addElement(motorPos5On);
    active[5]=1;
    ends[5]=1;
    tdone[5]=1;
  }

  public void thread116571(int [] tdone, int [] ends){
        S542=1;
    motConveyorOnOff.setPresent();//sysj\controller.sysj line: 44, column: 7
    currsigs.addElement(motConveyorOnOff);
    active[4]=1;
    ends[4]=1;
    tdone[4]=1;
  }

  public void thread116569(int [] tdone, int [] ends){
        S55=1;
    motorPos1On.setPresent();//sysj\controller.sysj line: 30, column: 38
    currsigs.addElement(motorPos1On);
    active[3]=1;
    ends[3]=1;
    tdone[3]=1;
  }

  public void thread116568(int [] tdone, int [] ends){
        S50=1;
    motConveyorOnOff.setPresent();//sysj\controller.sysj line: 30, column: 7
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
      switch(S9514){
        case 0 : 
          S9514=0;
          break RUN;
        
        case 1 : 
          S9514=2;
          S9514=2;
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
                  S809=0;
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
                        if(!bottleAtPos1.getprestatus()){//sysj\controller.sysj line: 26, column: 12
                          System.out.println("ono the bottle isn't at pos 1 what will we do");//sysj\controller.sysj line: 27, column: 5
                          System.out.println("Motor is on");//sysj\controller.sysj line: 29, column: 6
                          thread116568(tdone,ends);
                          thread116569(tdone,ends);
                          int biggest116570 = 0;
                          if(ends[2]>=biggest116570){
                            biggest116570=ends[2];
                          }
                          if(ends[3]>=biggest116570){
                            biggest116570=ends[3];
                          }
                          if(biggest116570 == 1){
                            active[1]=1;
                            ends[1]=1;
                            break RUN;
                          }
                        }
                        else {
                          S45=2;
                          S236=0;
                          if(!conveyorStatus_o.isPartnerPresent() || conveyorStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 34, column: 4
                            conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 34, column: 4
                            S236=1;
                            active[1]=1;
                            ends[1]=1;
                            break RUN;
                          }
                          else {
                            S231=0;
                            if(conveyorStatus_o.isACK()){//sysj\controller.sysj line: 34, column: 4
                              conveyorStatus_o.setVal("done");//sysj\controller.sysj line: 34, column: 4
                              S231=1;
                              if(!conveyorStatus_o.isACK()){//sysj\controller.sysj line: 34, column: 4
                                conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 34, column: 4
                                ends[1]=2;
                                ;//sysj\controller.sysj line: 34, column: 4
                                System.out.println("Motor is off");//sysj\controller.sysj line: 35, column: 4
                                S45=3;
                                S368=0;
                                if(!conveyorStatus_o.isPartnerPresent() || conveyorStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 36, column: 4
                                  conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 36, column: 4
                                  S368=1;
                                  active[1]=1;
                                  ends[1]=1;
                                  break RUN;
                                }
                                else {
                                  S363=0;
                                  if(conveyorStatus_o.isACK()){//sysj\controller.sysj line: 36, column: 4
                                    conveyorStatus_o.setVal("done");//sysj\controller.sysj line: 36, column: 4
                                    S363=1;
                                    if(!conveyorStatus_o.isACK()){//sysj\controller.sysj line: 36, column: 4
                                      conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 36, column: 4
                                      ends[1]=2;
                                      ;//sysj\controller.sysj line: 36, column: 4
                                      System.out.println("conveyor done");//sysj\controller.sysj line: 37, column: 4
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
                  S809=1;
                  S676=0;
                  if(bottleAtPos5.getprestatus()){//sysj\controller.sysj line: 41, column: 12
                    System.out.println("Bottle at position 5 is going to be moved");//sysj\controller.sysj line: 42, column: 5
                    S608=0;
                    thread116571(tdone,ends);
                    thread116572(tdone,ends);
                    thread116573(tdone,ends);
                    int biggest116574 = 0;
                    if(ends[4]>=biggest116574){
                      biggest116574=ends[4];
                    }
                    if(ends[5]>=biggest116574){
                      biggest116574=ends[5];
                    }
                    if(ends[6]>=biggest116574){
                      biggest116574=ends[6];
                    }
                    if(biggest116574 == 1){
                      active[1]=1;
                      ends[1]=1;
                      break RUN;
                    }
                  }
                  else {
                    System.out.println("conveyor idling");//sysj\controller.sysj line: 52, column: 4
                    S676=1;
                    S683=0;
                    if(!conveyorStatus_o.isPartnerPresent() || conveyorStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 53, column: 4
                      conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 53, column: 4
                      S683=1;
                      active[1]=1;
                      ends[1]=1;
                      break RUN;
                    }
                    else {
                      S678=0;
                      if(conveyorStatus_o.isACK()){//sysj\controller.sysj line: 53, column: 4
                        conveyorStatus_o.setVal("idle");//sysj\controller.sysj line: 53, column: 4
                        S678=1;
                        if(!conveyorStatus_o.isACK()){//sysj\controller.sysj line: 53, column: 4
                          conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 53, column: 4
                          ends[1]=2;
                          ;//sysj\controller.sysj line: 53, column: 4
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
                              S809=0;
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
                                    if(!bottleAtPos1.getprestatus()){//sysj\controller.sysj line: 26, column: 12
                                      System.out.println("ono the bottle isn't at pos 1 what will we do");//sysj\controller.sysj line: 27, column: 5
                                      System.out.println("Motor is on");//sysj\controller.sysj line: 29, column: 6
                                      thread116575(tdone,ends);
                                      thread116576(tdone,ends);
                                      int biggest116577 = 0;
                                      if(ends[2]>=biggest116577){
                                        biggest116577=ends[2];
                                      }
                                      if(ends[3]>=biggest116577){
                                        biggest116577=ends[3];
                                      }
                                      if(biggest116577 == 1){
                                        active[1]=1;
                                        ends[1]=1;
                                        break RUN;
                                      }
                                    }
                                    else {
                                      S45=2;
                                      S236=0;
                                      if(!conveyorStatus_o.isPartnerPresent() || conveyorStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 34, column: 4
                                        conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 34, column: 4
                                        S236=1;
                                        active[1]=1;
                                        ends[1]=1;
                                        break RUN;
                                      }
                                      else {
                                        S231=0;
                                        if(conveyorStatus_o.isACK()){//sysj\controller.sysj line: 34, column: 4
                                          conveyorStatus_o.setVal("done");//sysj\controller.sysj line: 34, column: 4
                                          S231=1;
                                          if(!conveyorStatus_o.isACK()){//sysj\controller.sysj line: 34, column: 4
                                            conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 34, column: 4
                                            ends[1]=2;
                                            ;//sysj\controller.sysj line: 34, column: 4
                                            System.out.println("Motor is off");//sysj\controller.sysj line: 35, column: 4
                                            S45=3;
                                            S368=0;
                                            if(!conveyorStatus_o.isPartnerPresent() || conveyorStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 36, column: 4
                                              conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 36, column: 4
                                              S368=1;
                                              active[1]=1;
                                              ends[1]=1;
                                              break RUN;
                                            }
                                            else {
                                              S363=0;
                                              if(conveyorStatus_o.isACK()){//sysj\controller.sysj line: 36, column: 4
                                                conveyorStatus_o.setVal("done");//sysj\controller.sysj line: 36, column: 4
                                                S363=1;
                                                if(!conveyorStatus_o.isACK()){//sysj\controller.sysj line: 36, column: 4
                                                  conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 36, column: 4
                                                  ends[1]=2;
                                                  ;//sysj\controller.sysj line: 36, column: 4
                                                  System.out.println("conveyor done");//sysj\controller.sysj line: 37, column: 4
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
                              S809=1;
                              S676=0;
                              if(bottleAtPos5.getprestatus()){//sysj\controller.sysj line: 41, column: 12
                                System.out.println("Bottle at position 5 is going to be moved");//sysj\controller.sysj line: 42, column: 5
                                S608=0;
                                thread116578(tdone,ends);
                                thread116579(tdone,ends);
                                thread116580(tdone,ends);
                                int biggest116581 = 0;
                                if(ends[4]>=biggest116581){
                                  biggest116581=ends[4];
                                }
                                if(ends[5]>=biggest116581){
                                  biggest116581=ends[5];
                                }
                                if(ends[6]>=biggest116581){
                                  biggest116581=ends[6];
                                }
                                if(biggest116581 == 1){
                                  active[1]=1;
                                  ends[1]=1;
                                  break RUN;
                                }
                              }
                              else {
                                System.out.println("conveyor idling");//sysj\controller.sysj line: 52, column: 4
                                S676=1;
                                S683=0;
                                if(!conveyorStatus_o.isPartnerPresent() || conveyorStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 53, column: 4
                                  conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 53, column: 4
                                  S683=1;
                                  active[1]=1;
                                  ends[1]=1;
                                  break RUN;
                                }
                                else {
                                  S678=0;
                                  if(conveyorStatus_o.isACK()){//sysj\controller.sysj line: 53, column: 4
                                    conveyorStatus_o.setVal("idle");//sysj\controller.sysj line: 53, column: 4
                                    S678=1;
                                    if(!conveyorStatus_o.isACK()){//sysj\controller.sysj line: 53, column: 4
                                      conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 53, column: 4
                                      ends[1]=2;
                                      ;//sysj\controller.sysj line: 53, column: 4
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
                            S809=0;
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
                                  if(!bottleAtPos1.getprestatus()){//sysj\controller.sysj line: 26, column: 12
                                    System.out.println("ono the bottle isn't at pos 1 what will we do");//sysj\controller.sysj line: 27, column: 5
                                    System.out.println("Motor is on");//sysj\controller.sysj line: 29, column: 6
                                    thread116582(tdone,ends);
                                    thread116583(tdone,ends);
                                    int biggest116584 = 0;
                                    if(ends[2]>=biggest116584){
                                      biggest116584=ends[2];
                                    }
                                    if(ends[3]>=biggest116584){
                                      biggest116584=ends[3];
                                    }
                                    if(biggest116584 == 1){
                                      active[1]=1;
                                      ends[1]=1;
                                      break RUN;
                                    }
                                  }
                                  else {
                                    S45=2;
                                    S236=0;
                                    if(!conveyorStatus_o.isPartnerPresent() || conveyorStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 34, column: 4
                                      conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 34, column: 4
                                      S236=1;
                                      active[1]=1;
                                      ends[1]=1;
                                      break RUN;
                                    }
                                    else {
                                      S231=0;
                                      if(conveyorStatus_o.isACK()){//sysj\controller.sysj line: 34, column: 4
                                        conveyorStatus_o.setVal("done");//sysj\controller.sysj line: 34, column: 4
                                        S231=1;
                                        if(!conveyorStatus_o.isACK()){//sysj\controller.sysj line: 34, column: 4
                                          conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 34, column: 4
                                          ends[1]=2;
                                          ;//sysj\controller.sysj line: 34, column: 4
                                          System.out.println("Motor is off");//sysj\controller.sysj line: 35, column: 4
                                          S45=3;
                                          S368=0;
                                          if(!conveyorStatus_o.isPartnerPresent() || conveyorStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 36, column: 4
                                            conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 36, column: 4
                                            S368=1;
                                            active[1]=1;
                                            ends[1]=1;
                                            break RUN;
                                          }
                                          else {
                                            S363=0;
                                            if(conveyorStatus_o.isACK()){//sysj\controller.sysj line: 36, column: 4
                                              conveyorStatus_o.setVal("done");//sysj\controller.sysj line: 36, column: 4
                                              S363=1;
                                              if(!conveyorStatus_o.isACK()){//sysj\controller.sysj line: 36, column: 4
                                                conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 36, column: 4
                                                ends[1]=2;
                                                ;//sysj\controller.sysj line: 36, column: 4
                                                System.out.println("conveyor done");//sysj\controller.sysj line: 37, column: 4
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
                            S809=1;
                            S676=0;
                            if(bottleAtPos5.getprestatus()){//sysj\controller.sysj line: 41, column: 12
                              System.out.println("Bottle at position 5 is going to be moved");//sysj\controller.sysj line: 42, column: 5
                              S608=0;
                              thread116585(tdone,ends);
                              thread116586(tdone,ends);
                              thread116587(tdone,ends);
                              int biggest116588 = 0;
                              if(ends[4]>=biggest116588){
                                biggest116588=ends[4];
                              }
                              if(ends[5]>=biggest116588){
                                biggest116588=ends[5];
                              }
                              if(ends[6]>=biggest116588){
                                biggest116588=ends[6];
                              }
                              if(biggest116588 == 1){
                                active[1]=1;
                                ends[1]=1;
                                break RUN;
                              }
                            }
                            else {
                              System.out.println("conveyor idling");//sysj\controller.sysj line: 52, column: 4
                              S676=1;
                              S683=0;
                              if(!conveyorStatus_o.isPartnerPresent() || conveyorStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 53, column: 4
                                conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 53, column: 4
                                S683=1;
                                active[1]=1;
                                ends[1]=1;
                                break RUN;
                              }
                              else {
                                S678=0;
                                if(conveyorStatus_o.isACK()){//sysj\controller.sysj line: 53, column: 4
                                  conveyorStatus_o.setVal("idle");//sysj\controller.sysj line: 53, column: 4
                                  S678=1;
                                  if(!conveyorStatus_o.isACK()){//sysj\controller.sysj line: 53, column: 4
                                    conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 53, column: 4
                                    ends[1]=2;
                                    ;//sysj\controller.sysj line: 53, column: 4
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
                          S809=0;
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
                                if(!bottleAtPos1.getprestatus()){//sysj\controller.sysj line: 26, column: 12
                                  System.out.println("ono the bottle isn't at pos 1 what will we do");//sysj\controller.sysj line: 27, column: 5
                                  System.out.println("Motor is on");//sysj\controller.sysj line: 29, column: 6
                                  thread116589(tdone,ends);
                                  thread116590(tdone,ends);
                                  int biggest116591 = 0;
                                  if(ends[2]>=biggest116591){
                                    biggest116591=ends[2];
                                  }
                                  if(ends[3]>=biggest116591){
                                    biggest116591=ends[3];
                                  }
                                  if(biggest116591 == 1){
                                    active[1]=1;
                                    ends[1]=1;
                                    break RUN;
                                  }
                                }
                                else {
                                  S45=2;
                                  S236=0;
                                  if(!conveyorStatus_o.isPartnerPresent() || conveyorStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 34, column: 4
                                    conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 34, column: 4
                                    S236=1;
                                    active[1]=1;
                                    ends[1]=1;
                                    break RUN;
                                  }
                                  else {
                                    S231=0;
                                    if(conveyorStatus_o.isACK()){//sysj\controller.sysj line: 34, column: 4
                                      conveyorStatus_o.setVal("done");//sysj\controller.sysj line: 34, column: 4
                                      S231=1;
                                      if(!conveyorStatus_o.isACK()){//sysj\controller.sysj line: 34, column: 4
                                        conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 34, column: 4
                                        ends[1]=2;
                                        ;//sysj\controller.sysj line: 34, column: 4
                                        System.out.println("Motor is off");//sysj\controller.sysj line: 35, column: 4
                                        S45=3;
                                        S368=0;
                                        if(!conveyorStatus_o.isPartnerPresent() || conveyorStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 36, column: 4
                                          conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 36, column: 4
                                          S368=1;
                                          active[1]=1;
                                          ends[1]=1;
                                          break RUN;
                                        }
                                        else {
                                          S363=0;
                                          if(conveyorStatus_o.isACK()){//sysj\controller.sysj line: 36, column: 4
                                            conveyorStatus_o.setVal("done");//sysj\controller.sysj line: 36, column: 4
                                            S363=1;
                                            if(!conveyorStatus_o.isACK()){//sysj\controller.sysj line: 36, column: 4
                                              conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 36, column: 4
                                              ends[1]=2;
                                              ;//sysj\controller.sysj line: 36, column: 4
                                              System.out.println("conveyor done");//sysj\controller.sysj line: 37, column: 4
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
                          S809=1;
                          S676=0;
                          if(bottleAtPos5.getprestatus()){//sysj\controller.sysj line: 41, column: 12
                            System.out.println("Bottle at position 5 is going to be moved");//sysj\controller.sysj line: 42, column: 5
                            S608=0;
                            thread116592(tdone,ends);
                            thread116593(tdone,ends);
                            thread116594(tdone,ends);
                            int biggest116595 = 0;
                            if(ends[4]>=biggest116595){
                              biggest116595=ends[4];
                            }
                            if(ends[5]>=biggest116595){
                              biggest116595=ends[5];
                            }
                            if(ends[6]>=biggest116595){
                              biggest116595=ends[6];
                            }
                            if(biggest116595 == 1){
                              active[1]=1;
                              ends[1]=1;
                              break RUN;
                            }
                          }
                          else {
                            System.out.println("conveyor idling");//sysj\controller.sysj line: 52, column: 4
                            S676=1;
                            S683=0;
                            if(!conveyorStatus_o.isPartnerPresent() || conveyorStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 53, column: 4
                              conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 53, column: 4
                              S683=1;
                              active[1]=1;
                              ends[1]=1;
                              break RUN;
                            }
                            else {
                              S678=0;
                              if(conveyorStatus_o.isACK()){//sysj\controller.sysj line: 53, column: 4
                                conveyorStatus_o.setVal("idle");//sysj\controller.sysj line: 53, column: 4
                                S678=1;
                                if(!conveyorStatus_o.isACK()){//sysj\controller.sysj line: 53, column: 4
                                  conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 53, column: 4
                                  ends[1]=2;
                                  ;//sysj\controller.sysj line: 53, column: 4
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
              switch(S809){
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
                                    if(!bottleAtPos1.getprestatus()){//sysj\controller.sysj line: 26, column: 12
                                      System.out.println("ono the bottle isn't at pos 1 what will we do");//sysj\controller.sysj line: 27, column: 5
                                      System.out.println("Motor is on");//sysj\controller.sysj line: 29, column: 6
                                      thread116596(tdone,ends);
                                      thread116597(tdone,ends);
                                      int biggest116598 = 0;
                                      if(ends[2]>=biggest116598){
                                        biggest116598=ends[2];
                                      }
                                      if(ends[3]>=biggest116598){
                                        biggest116598=ends[3];
                                      }
                                      if(biggest116598 == 1){
                                        active[1]=1;
                                        ends[1]=1;
                                        break RUN;
                                      }
                                    }
                                    else {
                                      S45=2;
                                      S236=0;
                                      if(!conveyorStatus_o.isPartnerPresent() || conveyorStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 34, column: 4
                                        conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 34, column: 4
                                        S236=1;
                                        active[1]=1;
                                        ends[1]=1;
                                        break RUN;
                                      }
                                      else {
                                        S231=0;
                                        if(conveyorStatus_o.isACK()){//sysj\controller.sysj line: 34, column: 4
                                          conveyorStatus_o.setVal("done");//sysj\controller.sysj line: 34, column: 4
                                          S231=1;
                                          if(!conveyorStatus_o.isACK()){//sysj\controller.sysj line: 34, column: 4
                                            conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 34, column: 4
                                            ends[1]=2;
                                            ;//sysj\controller.sysj line: 34, column: 4
                                            System.out.println("Motor is off");//sysj\controller.sysj line: 35, column: 4
                                            S45=3;
                                            S368=0;
                                            if(!conveyorStatus_o.isPartnerPresent() || conveyorStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 36, column: 4
                                              conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 36, column: 4
                                              S368=1;
                                              active[1]=1;
                                              ends[1]=1;
                                              break RUN;
                                            }
                                            else {
                                              S363=0;
                                              if(conveyorStatus_o.isACK()){//sysj\controller.sysj line: 36, column: 4
                                                conveyorStatus_o.setVal("done");//sysj\controller.sysj line: 36, column: 4
                                                S363=1;
                                                if(!conveyorStatus_o.isACK()){//sysj\controller.sysj line: 36, column: 4
                                                  conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 36, column: 4
                                                  ends[1]=2;
                                                  ;//sysj\controller.sysj line: 36, column: 4
                                                  System.out.println("conveyor done");//sysj\controller.sysj line: 37, column: 4
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
                                  if(!bottleAtPos1.getprestatus()){//sysj\controller.sysj line: 26, column: 12
                                    System.out.println("ono the bottle isn't at pos 1 what will we do");//sysj\controller.sysj line: 27, column: 5
                                    System.out.println("Motor is on");//sysj\controller.sysj line: 29, column: 6
                                    thread116599(tdone,ends);
                                    thread116600(tdone,ends);
                                    int biggest116601 = 0;
                                    if(ends[2]>=biggest116601){
                                      biggest116601=ends[2];
                                    }
                                    if(ends[3]>=biggest116601){
                                      biggest116601=ends[3];
                                    }
                                    if(biggest116601 == 1){
                                      active[1]=1;
                                      ends[1]=1;
                                      break RUN;
                                    }
                                  }
                                  else {
                                    S45=2;
                                    S236=0;
                                    if(!conveyorStatus_o.isPartnerPresent() || conveyorStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 34, column: 4
                                      conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 34, column: 4
                                      S236=1;
                                      active[1]=1;
                                      ends[1]=1;
                                      break RUN;
                                    }
                                    else {
                                      S231=0;
                                      if(conveyorStatus_o.isACK()){//sysj\controller.sysj line: 34, column: 4
                                        conveyorStatus_o.setVal("done");//sysj\controller.sysj line: 34, column: 4
                                        S231=1;
                                        if(!conveyorStatus_o.isACK()){//sysj\controller.sysj line: 34, column: 4
                                          conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 34, column: 4
                                          ends[1]=2;
                                          ;//sysj\controller.sysj line: 34, column: 4
                                          System.out.println("Motor is off");//sysj\controller.sysj line: 35, column: 4
                                          S45=3;
                                          S368=0;
                                          if(!conveyorStatus_o.isPartnerPresent() || conveyorStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 36, column: 4
                                            conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 36, column: 4
                                            S368=1;
                                            active[1]=1;
                                            ends[1]=1;
                                            break RUN;
                                          }
                                          else {
                                            S363=0;
                                            if(conveyorStatus_o.isACK()){//sysj\controller.sysj line: 36, column: 4
                                              conveyorStatus_o.setVal("done");//sysj\controller.sysj line: 36, column: 4
                                              S363=1;
                                              if(!conveyorStatus_o.isACK()){//sysj\controller.sysj line: 36, column: 4
                                                conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 36, column: 4
                                                ends[1]=2;
                                                ;//sysj\controller.sysj line: 36, column: 4
                                                System.out.println("conveyor done");//sysj\controller.sysj line: 37, column: 4
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
                                if(!bottleAtPos1.getprestatus()){//sysj\controller.sysj line: 26, column: 12
                                  System.out.println("ono the bottle isn't at pos 1 what will we do");//sysj\controller.sysj line: 27, column: 5
                                  System.out.println("Motor is on");//sysj\controller.sysj line: 29, column: 6
                                  thread116602(tdone,ends);
                                  thread116603(tdone,ends);
                                  int biggest116604 = 0;
                                  if(ends[2]>=biggest116604){
                                    biggest116604=ends[2];
                                  }
                                  if(ends[3]>=biggest116604){
                                    biggest116604=ends[3];
                                  }
                                  if(biggest116604 == 1){
                                    active[1]=1;
                                    ends[1]=1;
                                    break RUN;
                                  }
                                }
                                else {
                                  S45=2;
                                  S236=0;
                                  if(!conveyorStatus_o.isPartnerPresent() || conveyorStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 34, column: 4
                                    conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 34, column: 4
                                    S236=1;
                                    active[1]=1;
                                    ends[1]=1;
                                    break RUN;
                                  }
                                  else {
                                    S231=0;
                                    if(conveyorStatus_o.isACK()){//sysj\controller.sysj line: 34, column: 4
                                      conveyorStatus_o.setVal("done");//sysj\controller.sysj line: 34, column: 4
                                      S231=1;
                                      if(!conveyorStatus_o.isACK()){//sysj\controller.sysj line: 34, column: 4
                                        conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 34, column: 4
                                        ends[1]=2;
                                        ;//sysj\controller.sysj line: 34, column: 4
                                        System.out.println("Motor is off");//sysj\controller.sysj line: 35, column: 4
                                        S45=3;
                                        S368=0;
                                        if(!conveyorStatus_o.isPartnerPresent() || conveyorStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 36, column: 4
                                          conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 36, column: 4
                                          S368=1;
                                          active[1]=1;
                                          ends[1]=1;
                                          break RUN;
                                        }
                                        else {
                                          S363=0;
                                          if(conveyorStatus_o.isACK()){//sysj\controller.sysj line: 36, column: 4
                                            conveyorStatus_o.setVal("done");//sysj\controller.sysj line: 36, column: 4
                                            S363=1;
                                            if(!conveyorStatus_o.isACK()){//sysj\controller.sysj line: 36, column: 4
                                              conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 36, column: 4
                                              ends[1]=2;
                                              ;//sysj\controller.sysj line: 36, column: 4
                                              System.out.println("conveyor done");//sysj\controller.sysj line: 37, column: 4
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
                      if(bottleAtPos1.getprestatus()){//sysj\controller.sysj line: 28, column: 11
                        S45=2;
                        S236=0;
                        if(!conveyorStatus_o.isPartnerPresent() || conveyorStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 34, column: 4
                          conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 34, column: 4
                          S236=1;
                          active[1]=1;
                          ends[1]=1;
                          break RUN;
                        }
                        else {
                          S231=0;
                          if(conveyorStatus_o.isACK()){//sysj\controller.sysj line: 34, column: 4
                            conveyorStatus_o.setVal("done");//sysj\controller.sysj line: 34, column: 4
                            S231=1;
                            if(!conveyorStatus_o.isACK()){//sysj\controller.sysj line: 34, column: 4
                              conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 34, column: 4
                              ends[1]=2;
                              ;//sysj\controller.sysj line: 34, column: 4
                              System.out.println("Motor is off");//sysj\controller.sysj line: 35, column: 4
                              S45=3;
                              S368=0;
                              if(!conveyorStatus_o.isPartnerPresent() || conveyorStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 36, column: 4
                                conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 36, column: 4
                                S368=1;
                                active[1]=1;
                                ends[1]=1;
                                break RUN;
                              }
                              else {
                                S363=0;
                                if(conveyorStatus_o.isACK()){//sysj\controller.sysj line: 36, column: 4
                                  conveyorStatus_o.setVal("done");//sysj\controller.sysj line: 36, column: 4
                                  S363=1;
                                  if(!conveyorStatus_o.isACK()){//sysj\controller.sysj line: 36, column: 4
                                    conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 36, column: 4
                                    ends[1]=2;
                                    ;//sysj\controller.sysj line: 36, column: 4
                                    System.out.println("conveyor done");//sysj\controller.sysj line: 37, column: 4
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
                        thread116605(tdone,ends);
                        thread116606(tdone,ends);
                        int biggest116607 = 0;
                        if(ends[2]>=biggest116607){
                          biggest116607=ends[2];
                        }
                        if(ends[3]>=biggest116607){
                          biggest116607=ends[3];
                        }
                        if(biggest116607 == 1){
                          active[1]=1;
                          ends[1]=1;
                          break RUN;
                        }
                        //FINXME code
                        if(biggest116607 == 0){
                          S45=2;
                          S236=0;
                          if(!conveyorStatus_o.isPartnerPresent() || conveyorStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 34, column: 4
                            conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 34, column: 4
                            S236=1;
                            active[1]=1;
                            ends[1]=1;
                            break RUN;
                          }
                          else {
                            S231=0;
                            if(conveyorStatus_o.isACK()){//sysj\controller.sysj line: 34, column: 4
                              conveyorStatus_o.setVal("done");//sysj\controller.sysj line: 34, column: 4
                              S231=1;
                              if(!conveyorStatus_o.isACK()){//sysj\controller.sysj line: 34, column: 4
                                conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 34, column: 4
                                ends[1]=2;
                                ;//sysj\controller.sysj line: 34, column: 4
                                System.out.println("Motor is off");//sysj\controller.sysj line: 35, column: 4
                                S45=3;
                                S368=0;
                                if(!conveyorStatus_o.isPartnerPresent() || conveyorStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 36, column: 4
                                  conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 36, column: 4
                                  S368=1;
                                  active[1]=1;
                                  ends[1]=1;
                                  break RUN;
                                }
                                else {
                                  S363=0;
                                  if(conveyorStatus_o.isACK()){//sysj\controller.sysj line: 36, column: 4
                                    conveyorStatus_o.setVal("done");//sysj\controller.sysj line: 36, column: 4
                                    S363=1;
                                    if(!conveyorStatus_o.isACK()){//sysj\controller.sysj line: 36, column: 4
                                      conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 36, column: 4
                                      ends[1]=2;
                                      ;//sysj\controller.sysj line: 36, column: 4
                                      System.out.println("conveyor done");//sysj\controller.sysj line: 37, column: 4
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
                      switch(S236){
                        case 0 : 
                          if(!conveyorStatus_o.isPartnerPresent() || conveyorStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 34, column: 4
                            conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 34, column: 4
                            S236=1;
                            active[1]=1;
                            ends[1]=1;
                            break RUN;
                          }
                          else {
                            switch(S231){
                              case 0 : 
                                if(conveyorStatus_o.isACK()){//sysj\controller.sysj line: 34, column: 4
                                  conveyorStatus_o.setVal("done");//sysj\controller.sysj line: 34, column: 4
                                  S231=1;
                                  if(!conveyorStatus_o.isACK()){//sysj\controller.sysj line: 34, column: 4
                                    conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 34, column: 4
                                    ends[1]=2;
                                    ;//sysj\controller.sysj line: 34, column: 4
                                    System.out.println("Motor is off");//sysj\controller.sysj line: 35, column: 4
                                    S45=3;
                                    S368=0;
                                    if(!conveyorStatus_o.isPartnerPresent() || conveyorStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 36, column: 4
                                      conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 36, column: 4
                                      S368=1;
                                      active[1]=1;
                                      ends[1]=1;
                                      break RUN;
                                    }
                                    else {
                                      S363=0;
                                      if(conveyorStatus_o.isACK()){//sysj\controller.sysj line: 36, column: 4
                                        conveyorStatus_o.setVal("done");//sysj\controller.sysj line: 36, column: 4
                                        S363=1;
                                        if(!conveyorStatus_o.isACK()){//sysj\controller.sysj line: 36, column: 4
                                          conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 36, column: 4
                                          ends[1]=2;
                                          ;//sysj\controller.sysj line: 36, column: 4
                                          System.out.println("conveyor done");//sysj\controller.sysj line: 37, column: 4
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
                                if(!conveyorStatus_o.isACK()){//sysj\controller.sysj line: 34, column: 4
                                  conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 34, column: 4
                                  ends[1]=2;
                                  ;//sysj\controller.sysj line: 34, column: 4
                                  System.out.println("Motor is off");//sysj\controller.sysj line: 35, column: 4
                                  S45=3;
                                  S368=0;
                                  if(!conveyorStatus_o.isPartnerPresent() || conveyorStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 36, column: 4
                                    conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 36, column: 4
                                    S368=1;
                                    active[1]=1;
                                    ends[1]=1;
                                    break RUN;
                                  }
                                  else {
                                    S363=0;
                                    if(conveyorStatus_o.isACK()){//sysj\controller.sysj line: 36, column: 4
                                      conveyorStatus_o.setVal("done");//sysj\controller.sysj line: 36, column: 4
                                      S363=1;
                                      if(!conveyorStatus_o.isACK()){//sysj\controller.sysj line: 36, column: 4
                                        conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 36, column: 4
                                        ends[1]=2;
                                        ;//sysj\controller.sysj line: 36, column: 4
                                        System.out.println("conveyor done");//sysj\controller.sysj line: 37, column: 4
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
                          S236=1;
                          S236=0;
                          if(!conveyorStatus_o.isPartnerPresent() || conveyorStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 34, column: 4
                            conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 34, column: 4
                            S236=1;
                            active[1]=1;
                            ends[1]=1;
                            break RUN;
                          }
                          else {
                            S231=0;
                            if(conveyorStatus_o.isACK()){//sysj\controller.sysj line: 34, column: 4
                              conveyorStatus_o.setVal("done");//sysj\controller.sysj line: 34, column: 4
                              S231=1;
                              if(!conveyorStatus_o.isACK()){//sysj\controller.sysj line: 34, column: 4
                                conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 34, column: 4
                                ends[1]=2;
                                ;//sysj\controller.sysj line: 34, column: 4
                                System.out.println("Motor is off");//sysj\controller.sysj line: 35, column: 4
                                S45=3;
                                S368=0;
                                if(!conveyorStatus_o.isPartnerPresent() || conveyorStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 36, column: 4
                                  conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 36, column: 4
                                  S368=1;
                                  active[1]=1;
                                  ends[1]=1;
                                  break RUN;
                                }
                                else {
                                  S363=0;
                                  if(conveyorStatus_o.isACK()){//sysj\controller.sysj line: 36, column: 4
                                    conveyorStatus_o.setVal("done");//sysj\controller.sysj line: 36, column: 4
                                    S363=1;
                                    if(!conveyorStatus_o.isACK()){//sysj\controller.sysj line: 36, column: 4
                                      conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 36, column: 4
                                      ends[1]=2;
                                      ;//sysj\controller.sysj line: 36, column: 4
                                      System.out.println("conveyor done");//sysj\controller.sysj line: 37, column: 4
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
                      switch(S368){
                        case 0 : 
                          if(!conveyorStatus_o.isPartnerPresent() || conveyorStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 36, column: 4
                            conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 36, column: 4
                            S368=1;
                            active[1]=1;
                            ends[1]=1;
                            break RUN;
                          }
                          else {
                            switch(S363){
                              case 0 : 
                                if(conveyorStatus_o.isACK()){//sysj\controller.sysj line: 36, column: 4
                                  conveyorStatus_o.setVal("done");//sysj\controller.sysj line: 36, column: 4
                                  S363=1;
                                  if(!conveyorStatus_o.isACK()){//sysj\controller.sysj line: 36, column: 4
                                    conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 36, column: 4
                                    ends[1]=2;
                                    ;//sysj\controller.sysj line: 36, column: 4
                                    System.out.println("conveyor done");//sysj\controller.sysj line: 37, column: 4
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
                                if(!conveyorStatus_o.isACK()){//sysj\controller.sysj line: 36, column: 4
                                  conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 36, column: 4
                                  ends[1]=2;
                                  ;//sysj\controller.sysj line: 36, column: 4
                                  System.out.println("conveyor done");//sysj\controller.sysj line: 37, column: 4
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
                          S368=1;
                          S368=0;
                          if(!conveyorStatus_o.isPartnerPresent() || conveyorStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 36, column: 4
                            conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 36, column: 4
                            S368=1;
                            active[1]=1;
                            ends[1]=1;
                            break RUN;
                          }
                          else {
                            S363=0;
                            if(conveyorStatus_o.isACK()){//sysj\controller.sysj line: 36, column: 4
                              conveyorStatus_o.setVal("done");//sysj\controller.sysj line: 36, column: 4
                              S363=1;
                              if(!conveyorStatus_o.isACK()){//sysj\controller.sysj line: 36, column: 4
                                conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 36, column: 4
                                ends[1]=2;
                                ;//sysj\controller.sysj line: 36, column: 4
                                System.out.println("conveyor done");//sysj\controller.sysj line: 37, column: 4
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
                  switch(S676){
                    case 0 : 
                      switch(S608){
                        case 0 : 
                          if(bottleLeftPos5.getprestatus()){//sysj\controller.sysj line: 43, column: 11
                            conveyorStatus_o.setPreempted();
                            System.out.println("bottle at pos 5 has moved away");//sysj\controller.sysj line: 47, column: 5
                            S608=1;
                            S615=0;
                            if(!conveyorStatus_o.isPartnerPresent() || conveyorStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 48, column: 5
                              conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 48, column: 5
                              S615=1;
                              active[1]=1;
                              ends[1]=1;
                              break RUN;
                            }
                            else {
                              S610=0;
                              if(conveyorStatus_o.isACK()){//sysj\controller.sysj line: 48, column: 5
                                conveyorStatus_o.setVal("done");//sysj\controller.sysj line: 48, column: 5
                                S610=1;
                                if(!conveyorStatus_o.isACK()){//sysj\controller.sysj line: 48, column: 5
                                  conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 48, column: 5
                                  ends[1]=2;
                                  ;//sysj\controller.sysj line: 48, column: 5
                                  System.out.println("conveyor idling");//sysj\controller.sysj line: 52, column: 4
                                  S676=1;
                                  S683=0;
                                  if(!conveyorStatus_o.isPartnerPresent() || conveyorStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 53, column: 4
                                    conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 53, column: 4
                                    S683=1;
                                    active[1]=1;
                                    ends[1]=1;
                                    break RUN;
                                  }
                                  else {
                                    S678=0;
                                    if(conveyorStatus_o.isACK()){//sysj\controller.sysj line: 53, column: 4
                                      conveyorStatus_o.setVal("idle");//sysj\controller.sysj line: 53, column: 4
                                      S678=1;
                                      if(!conveyorStatus_o.isACK()){//sysj\controller.sysj line: 53, column: 4
                                        conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 53, column: 4
                                        ends[1]=2;
                                        ;//sysj\controller.sysj line: 53, column: 4
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
                            thread116608(tdone,ends);
                            thread116609(tdone,ends);
                            thread116610(tdone,ends);
                            int biggest116611 = 0;
                            if(ends[4]>=biggest116611){
                              biggest116611=ends[4];
                            }
                            if(ends[5]>=biggest116611){
                              biggest116611=ends[5];
                            }
                            if(ends[6]>=biggest116611){
                              biggest116611=ends[6];
                            }
                            if(biggest116611 == 1){
                              active[1]=1;
                              ends[1]=1;
                              break RUN;
                            }
                            //FINXME code
                            if(biggest116611 == 0){
                              System.out.println("bottle at pos 5 has moved away");//sysj\controller.sysj line: 47, column: 5
                              S608=1;
                              S615=0;
                              if(!conveyorStatus_o.isPartnerPresent() || conveyorStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 48, column: 5
                                conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 48, column: 5
                                S615=1;
                                active[1]=1;
                                ends[1]=1;
                                break RUN;
                              }
                              else {
                                S610=0;
                                if(conveyorStatus_o.isACK()){//sysj\controller.sysj line: 48, column: 5
                                  conveyorStatus_o.setVal("done");//sysj\controller.sysj line: 48, column: 5
                                  S610=1;
                                  if(!conveyorStatus_o.isACK()){//sysj\controller.sysj line: 48, column: 5
                                    conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 48, column: 5
                                    ends[1]=2;
                                    ;//sysj\controller.sysj line: 48, column: 5
                                    System.out.println("conveyor idling");//sysj\controller.sysj line: 52, column: 4
                                    S676=1;
                                    S683=0;
                                    if(!conveyorStatus_o.isPartnerPresent() || conveyorStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 53, column: 4
                                      conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 53, column: 4
                                      S683=1;
                                      active[1]=1;
                                      ends[1]=1;
                                      break RUN;
                                    }
                                    else {
                                      S678=0;
                                      if(conveyorStatus_o.isACK()){//sysj\controller.sysj line: 53, column: 4
                                        conveyorStatus_o.setVal("idle");//sysj\controller.sysj line: 53, column: 4
                                        S678=1;
                                        if(!conveyorStatus_o.isACK()){//sysj\controller.sysj line: 53, column: 4
                                          conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 53, column: 4
                                          ends[1]=2;
                                          ;//sysj\controller.sysj line: 53, column: 4
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
                          switch(S615){
                            case 0 : 
                              if(!conveyorStatus_o.isPartnerPresent() || conveyorStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 48, column: 5
                                conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 48, column: 5
                                S615=1;
                                active[1]=1;
                                ends[1]=1;
                                break RUN;
                              }
                              else {
                                switch(S610){
                                  case 0 : 
                                    if(conveyorStatus_o.isACK()){//sysj\controller.sysj line: 48, column: 5
                                      conveyorStatus_o.setVal("done");//sysj\controller.sysj line: 48, column: 5
                                      S610=1;
                                      if(!conveyorStatus_o.isACK()){//sysj\controller.sysj line: 48, column: 5
                                        conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 48, column: 5
                                        ends[1]=2;
                                        ;//sysj\controller.sysj line: 48, column: 5
                                        System.out.println("conveyor idling");//sysj\controller.sysj line: 52, column: 4
                                        S676=1;
                                        S683=0;
                                        if(!conveyorStatus_o.isPartnerPresent() || conveyorStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 53, column: 4
                                          conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 53, column: 4
                                          S683=1;
                                          active[1]=1;
                                          ends[1]=1;
                                          break RUN;
                                        }
                                        else {
                                          S678=0;
                                          if(conveyorStatus_o.isACK()){//sysj\controller.sysj line: 53, column: 4
                                            conveyorStatus_o.setVal("idle");//sysj\controller.sysj line: 53, column: 4
                                            S678=1;
                                            if(!conveyorStatus_o.isACK()){//sysj\controller.sysj line: 53, column: 4
                                              conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 53, column: 4
                                              ends[1]=2;
                                              ;//sysj\controller.sysj line: 53, column: 4
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
                                    if(!conveyorStatus_o.isACK()){//sysj\controller.sysj line: 48, column: 5
                                      conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 48, column: 5
                                      ends[1]=2;
                                      ;//sysj\controller.sysj line: 48, column: 5
                                      System.out.println("conveyor idling");//sysj\controller.sysj line: 52, column: 4
                                      S676=1;
                                      S683=0;
                                      if(!conveyorStatus_o.isPartnerPresent() || conveyorStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 53, column: 4
                                        conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 53, column: 4
                                        S683=1;
                                        active[1]=1;
                                        ends[1]=1;
                                        break RUN;
                                      }
                                      else {
                                        S678=0;
                                        if(conveyorStatus_o.isACK()){//sysj\controller.sysj line: 53, column: 4
                                          conveyorStatus_o.setVal("idle");//sysj\controller.sysj line: 53, column: 4
                                          S678=1;
                                          if(!conveyorStatus_o.isACK()){//sysj\controller.sysj line: 53, column: 4
                                            conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 53, column: 4
                                            ends[1]=2;
                                            ;//sysj\controller.sysj line: 53, column: 4
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
                              S615=1;
                              S615=0;
                              if(!conveyorStatus_o.isPartnerPresent() || conveyorStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 48, column: 5
                                conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 48, column: 5
                                S615=1;
                                active[1]=1;
                                ends[1]=1;
                                break RUN;
                              }
                              else {
                                S610=0;
                                if(conveyorStatus_o.isACK()){//sysj\controller.sysj line: 48, column: 5
                                  conveyorStatus_o.setVal("done");//sysj\controller.sysj line: 48, column: 5
                                  S610=1;
                                  if(!conveyorStatus_o.isACK()){//sysj\controller.sysj line: 48, column: 5
                                    conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 48, column: 5
                                    ends[1]=2;
                                    ;//sysj\controller.sysj line: 48, column: 5
                                    System.out.println("conveyor idling");//sysj\controller.sysj line: 52, column: 4
                                    S676=1;
                                    S683=0;
                                    if(!conveyorStatus_o.isPartnerPresent() || conveyorStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 53, column: 4
                                      conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 53, column: 4
                                      S683=1;
                                      active[1]=1;
                                      ends[1]=1;
                                      break RUN;
                                    }
                                    else {
                                      S678=0;
                                      if(conveyorStatus_o.isACK()){//sysj\controller.sysj line: 53, column: 4
                                        conveyorStatus_o.setVal("idle");//sysj\controller.sysj line: 53, column: 4
                                        S678=1;
                                        if(!conveyorStatus_o.isACK()){//sysj\controller.sysj line: 53, column: 4
                                          conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 53, column: 4
                                          ends[1]=2;
                                          ;//sysj\controller.sysj line: 53, column: 4
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
                      switch(S683){
                        case 0 : 
                          if(!conveyorStatus_o.isPartnerPresent() || conveyorStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 53, column: 4
                            conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 53, column: 4
                            S683=1;
                            active[1]=1;
                            ends[1]=1;
                            break RUN;
                          }
                          else {
                            switch(S678){
                              case 0 : 
                                if(conveyorStatus_o.isACK()){//sysj\controller.sysj line: 53, column: 4
                                  conveyorStatus_o.setVal("idle");//sysj\controller.sysj line: 53, column: 4
                                  S678=1;
                                  if(!conveyorStatus_o.isACK()){//sysj\controller.sysj line: 53, column: 4
                                    conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 53, column: 4
                                    ends[1]=2;
                                    ;//sysj\controller.sysj line: 53, column: 4
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
                                if(!conveyorStatus_o.isACK()){//sysj\controller.sysj line: 53, column: 4
                                  conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 53, column: 4
                                  ends[1]=2;
                                  ;//sysj\controller.sysj line: 53, column: 4
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
                          S683=1;
                          S683=0;
                          if(!conveyorStatus_o.isPartnerPresent() || conveyorStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 53, column: 4
                            conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 53, column: 4
                            S683=1;
                            active[1]=1;
                            ends[1]=1;
                            break RUN;
                          }
                          else {
                            S678=0;
                            if(conveyorStatus_o.isACK()){//sysj\controller.sysj line: 53, column: 4
                              conveyorStatus_o.setVal("idle");//sysj\controller.sysj line: 53, column: 4
                              S678=1;
                              if(!conveyorStatus_o.isACK()){//sysj\controller.sysj line: 53, column: 4
                                conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 53, column: 4
                                ends[1]=2;
                                ;//sysj\controller.sysj line: 53, column: 4
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
                      S809=0;
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
                            if(!bottleAtPos1.getprestatus()){//sysj\controller.sysj line: 26, column: 12
                              System.out.println("ono the bottle isn't at pos 1 what will we do");//sysj\controller.sysj line: 27, column: 5
                              System.out.println("Motor is on");//sysj\controller.sysj line: 29, column: 6
                              thread116612(tdone,ends);
                              thread116613(tdone,ends);
                              int biggest116614 = 0;
                              if(ends[2]>=biggest116614){
                                biggest116614=ends[2];
                              }
                              if(ends[3]>=biggest116614){
                                biggest116614=ends[3];
                              }
                              if(biggest116614 == 1){
                                active[1]=1;
                                ends[1]=1;
                                break RUN;
                              }
                            }
                            else {
                              S45=2;
                              S236=0;
                              if(!conveyorStatus_o.isPartnerPresent() || conveyorStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 34, column: 4
                                conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 34, column: 4
                                S236=1;
                                active[1]=1;
                                ends[1]=1;
                                break RUN;
                              }
                              else {
                                S231=0;
                                if(conveyorStatus_o.isACK()){//sysj\controller.sysj line: 34, column: 4
                                  conveyorStatus_o.setVal("done");//sysj\controller.sysj line: 34, column: 4
                                  S231=1;
                                  if(!conveyorStatus_o.isACK()){//sysj\controller.sysj line: 34, column: 4
                                    conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 34, column: 4
                                    ends[1]=2;
                                    ;//sysj\controller.sysj line: 34, column: 4
                                    System.out.println("Motor is off");//sysj\controller.sysj line: 35, column: 4
                                    S45=3;
                                    S368=0;
                                    if(!conveyorStatus_o.isPartnerPresent() || conveyorStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 36, column: 4
                                      conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 36, column: 4
                                      S368=1;
                                      active[1]=1;
                                      ends[1]=1;
                                      break RUN;
                                    }
                                    else {
                                      S363=0;
                                      if(conveyorStatus_o.isACK()){//sysj\controller.sysj line: 36, column: 4
                                        conveyorStatus_o.setVal("done");//sysj\controller.sysj line: 36, column: 4
                                        S363=1;
                                        if(!conveyorStatus_o.isACK()){//sysj\controller.sysj line: 36, column: 4
                                          conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 36, column: 4
                                          ends[1]=2;
                                          ;//sysj\controller.sysj line: 36, column: 4
                                          System.out.println("conveyor done");//sysj\controller.sysj line: 37, column: 4
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
                      S809=1;
                      S676=0;
                      if(bottleAtPos5.getprestatus()){//sysj\controller.sysj line: 41, column: 12
                        System.out.println("Bottle at position 5 is going to be moved");//sysj\controller.sysj line: 42, column: 5
                        S608=0;
                        thread116615(tdone,ends);
                        thread116616(tdone,ends);
                        thread116617(tdone,ends);
                        int biggest116618 = 0;
                        if(ends[4]>=biggest116618){
                          biggest116618=ends[4];
                        }
                        if(ends[5]>=biggest116618){
                          biggest116618=ends[5];
                        }
                        if(ends[6]>=biggest116618){
                          biggest116618=ends[6];
                        }
                        if(biggest116618 == 1){
                          active[1]=1;
                          ends[1]=1;
                          break RUN;
                        }
                      }
                      else {
                        System.out.println("conveyor idling");//sysj\controller.sysj line: 52, column: 4
                        S676=1;
                        S683=0;
                        if(!conveyorStatus_o.isPartnerPresent() || conveyorStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 53, column: 4
                          conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 53, column: 4
                          S683=1;
                          active[1]=1;
                          ends[1]=1;
                          break RUN;
                        }
                        else {
                          S678=0;
                          if(conveyorStatus_o.isACK()){//sysj\controller.sysj line: 53, column: 4
                            conveyorStatus_o.setVal("idle");//sysj\controller.sysj line: 53, column: 4
                            S678=1;
                            if(!conveyorStatus_o.isACK()){//sysj\controller.sysj line: 53, column: 4
                              conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 53, column: 4
                              ends[1]=2;
                              ;//sysj\controller.sysj line: 53, column: 4
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
