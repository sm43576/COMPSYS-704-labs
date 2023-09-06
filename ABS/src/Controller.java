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
  private int S8410 = 1;
  private int S22 = 1;
  private int S6 = 1;
  private int S1 = 1;
  private int S717 = 1;
  private int S45 = 1;
  private int S29 = 1;
  private int S24 = 1;
  private int S50 = 1;
  private int S55 = 1;
  private int S144 = 1;
  private int S139 = 1;
  private int S276 = 1;
  private int S271 = 1;
  private int S584 = 1;
  private int S516 = 1;
  private int S450 = 1;
  private int S455 = 1;
  private int S479 = 1;
  private int S462 = 1;
  private int S457 = 1;
  private int S523 = 1;
  private int S518 = 1;
  private int S591 = 1;
  private int S586 = 1;
  
  private int[] ends = new int[23];
  private int[] tdone = new int[23];
  
  public void thread115513(int [] tdone, int [] ends){
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

  public void thread115512(int [] tdone, int [] ends){
        S455=1;
    motorPos5On.setPresent();//sysj\controller.sysj line: 43, column: 38
    currsigs.addElement(motorPos5On);
    active[5]=1;
    ends[5]=1;
    tdone[5]=1;
  }

  public void thread115511(int [] tdone, int [] ends){
        S450=1;
    motConveyorOnOff.setPresent();//sysj\controller.sysj line: 43, column: 7
    currsigs.addElement(motConveyorOnOff);
    active[4]=1;
    ends[4]=1;
    tdone[4]=1;
  }

  public void thread115509(int [] tdone, int [] ends){
        S55=1;
    motorPos1On.setPresent();//sysj\controller.sysj line: 29, column: 38
    currsigs.addElement(motorPos1On);
    active[3]=1;
    ends[3]=1;
    tdone[3]=1;
  }

  public void thread115508(int [] tdone, int [] ends){
        S50=1;
    motConveyorOnOff.setPresent();//sysj\controller.sysj line: 29, column: 7
    currsigs.addElement(motConveyorOnOff);
    active[2]=1;
    ends[2]=1;
    tdone[2]=1;
  }

  public void thread115506(int [] tdone, int [] ends){
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

  public void thread115505(int [] tdone, int [] ends){
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

  public void thread115504(int [] tdone, int [] ends){
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

  public void thread115502(int [] tdone, int [] ends){
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

  public void thread115501(int [] tdone, int [] ends){
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

  public void thread115499(int [] tdone, int [] ends){
        S55=1;
    motorPos1On.setPresent();//sysj\controller.sysj line: 29, column: 38
    currsigs.addElement(motorPos1On);
    active[3]=1;
    ends[3]=1;
    tdone[3]=1;
  }

  public void thread115498(int [] tdone, int [] ends){
        S50=1;
    motConveyorOnOff.setPresent();//sysj\controller.sysj line: 29, column: 7
    currsigs.addElement(motConveyorOnOff);
    active[2]=1;
    ends[2]=1;
    tdone[2]=1;
  }

  public void thread115496(int [] tdone, int [] ends){
        S55=1;
    motorPos1On.setPresent();//sysj\controller.sysj line: 29, column: 38
    currsigs.addElement(motorPos1On);
    active[3]=1;
    ends[3]=1;
    tdone[3]=1;
  }

  public void thread115495(int [] tdone, int [] ends){
        S50=1;
    motConveyorOnOff.setPresent();//sysj\controller.sysj line: 29, column: 7
    currsigs.addElement(motConveyorOnOff);
    active[2]=1;
    ends[2]=1;
    tdone[2]=1;
  }

  public void thread115493(int [] tdone, int [] ends){
        S55=1;
    motorPos1On.setPresent();//sysj\controller.sysj line: 29, column: 38
    currsigs.addElement(motorPos1On);
    active[3]=1;
    ends[3]=1;
    tdone[3]=1;
  }

  public void thread115492(int [] tdone, int [] ends){
        S50=1;
    motConveyorOnOff.setPresent();//sysj\controller.sysj line: 29, column: 7
    currsigs.addElement(motConveyorOnOff);
    active[2]=1;
    ends[2]=1;
    tdone[2]=1;
  }

  public void thread115490(int [] tdone, int [] ends){
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

  public void thread115489(int [] tdone, int [] ends){
        S455=1;
    motorPos5On.setPresent();//sysj\controller.sysj line: 43, column: 38
    currsigs.addElement(motorPos5On);
    active[5]=1;
    ends[5]=1;
    tdone[5]=1;
  }

  public void thread115488(int [] tdone, int [] ends){
        S450=1;
    motConveyorOnOff.setPresent();//sysj\controller.sysj line: 43, column: 7
    currsigs.addElement(motConveyorOnOff);
    active[4]=1;
    ends[4]=1;
    tdone[4]=1;
  }

  public void thread115486(int [] tdone, int [] ends){
        S55=1;
    motorPos1On.setPresent();//sysj\controller.sysj line: 29, column: 38
    currsigs.addElement(motorPos1On);
    active[3]=1;
    ends[3]=1;
    tdone[3]=1;
  }

  public void thread115485(int [] tdone, int [] ends){
        S50=1;
    motConveyorOnOff.setPresent();//sysj\controller.sysj line: 29, column: 7
    currsigs.addElement(motConveyorOnOff);
    active[2]=1;
    ends[2]=1;
    tdone[2]=1;
  }

  public void thread115483(int [] tdone, int [] ends){
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

  public void thread115482(int [] tdone, int [] ends){
        S455=1;
    motorPos5On.setPresent();//sysj\controller.sysj line: 43, column: 38
    currsigs.addElement(motorPos5On);
    active[5]=1;
    ends[5]=1;
    tdone[5]=1;
  }

  public void thread115481(int [] tdone, int [] ends){
        S450=1;
    motConveyorOnOff.setPresent();//sysj\controller.sysj line: 43, column: 7
    currsigs.addElement(motConveyorOnOff);
    active[4]=1;
    ends[4]=1;
    tdone[4]=1;
  }

  public void thread115479(int [] tdone, int [] ends){
        S55=1;
    motorPos1On.setPresent();//sysj\controller.sysj line: 29, column: 38
    currsigs.addElement(motorPos1On);
    active[3]=1;
    ends[3]=1;
    tdone[3]=1;
  }

  public void thread115478(int [] tdone, int [] ends){
        S50=1;
    motConveyorOnOff.setPresent();//sysj\controller.sysj line: 29, column: 7
    currsigs.addElement(motConveyorOnOff);
    active[2]=1;
    ends[2]=1;
    tdone[2]=1;
  }

  public void thread115476(int [] tdone, int [] ends){
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

  public void thread115475(int [] tdone, int [] ends){
        S455=1;
    motorPos5On.setPresent();//sysj\controller.sysj line: 43, column: 38
    currsigs.addElement(motorPos5On);
    active[5]=1;
    ends[5]=1;
    tdone[5]=1;
  }

  public void thread115474(int [] tdone, int [] ends){
        S450=1;
    motConveyorOnOff.setPresent();//sysj\controller.sysj line: 43, column: 7
    currsigs.addElement(motConveyorOnOff);
    active[4]=1;
    ends[4]=1;
    tdone[4]=1;
  }

  public void thread115472(int [] tdone, int [] ends){
        S55=1;
    motorPos1On.setPresent();//sysj\controller.sysj line: 29, column: 38
    currsigs.addElement(motorPos1On);
    active[3]=1;
    ends[3]=1;
    tdone[3]=1;
  }

  public void thread115471(int [] tdone, int [] ends){
        S50=1;
    motConveyorOnOff.setPresent();//sysj\controller.sysj line: 29, column: 7
    currsigs.addElement(motConveyorOnOff);
    active[2]=1;
    ends[2]=1;
    tdone[2]=1;
  }

  public void thread115469(int [] tdone, int [] ends){
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

  public void thread115468(int [] tdone, int [] ends){
        S455=1;
    motorPos5On.setPresent();//sysj\controller.sysj line: 43, column: 38
    currsigs.addElement(motorPos5On);
    active[5]=1;
    ends[5]=1;
    tdone[5]=1;
  }

  public void thread115467(int [] tdone, int [] ends){
        S450=1;
    motConveyorOnOff.setPresent();//sysj\controller.sysj line: 43, column: 7
    currsigs.addElement(motConveyorOnOff);
    active[4]=1;
    ends[4]=1;
    tdone[4]=1;
  }

  public void thread115465(int [] tdone, int [] ends){
        S55=1;
    motorPos1On.setPresent();//sysj\controller.sysj line: 29, column: 38
    currsigs.addElement(motorPos1On);
    active[3]=1;
    ends[3]=1;
    tdone[3]=1;
  }

  public void thread115464(int [] tdone, int [] ends){
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
      switch(S8410){
        case 0 : 
          S8410=0;
          break RUN;
        
        case 1 : 
          S8410=2;
          S8410=2;
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
                  S717=0;
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
                          thread115464(tdone,ends);
                          thread115465(tdone,ends);
                          int biggest115466 = 0;
                          if(ends[2]>=biggest115466){
                            biggest115466=ends[2];
                          }
                          if(ends[3]>=biggest115466){
                            biggest115466=ends[3];
                          }
                          if(biggest115466 == 1){
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
                  S717=1;
                  S584=0;
                  if(bottleAtPos5.getprestatus()){//sysj\controller.sysj line: 40, column: 12
                    System.out.println("Bottle at position 5 is going to be moved");//sysj\controller.sysj line: 41, column: 5
                    S516=0;
                    thread115467(tdone,ends);
                    thread115468(tdone,ends);
                    thread115469(tdone,ends);
                    int biggest115470 = 0;
                    if(ends[4]>=biggest115470){
                      biggest115470=ends[4];
                    }
                    if(ends[5]>=biggest115470){
                      biggest115470=ends[5];
                    }
                    if(ends[6]>=biggest115470){
                      biggest115470=ends[6];
                    }
                    if(biggest115470 == 1){
                      active[1]=1;
                      ends[1]=1;
                      break RUN;
                    }
                  }
                  else {
                    System.out.println("conveyor idling");//sysj\controller.sysj line: 51, column: 4
                    S584=1;
                    S591=0;
                    if(!conveyorStatus_o.isPartnerPresent() || conveyorStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 52, column: 4
                      conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 52, column: 4
                      S591=1;
                      active[1]=1;
                      ends[1]=1;
                      break RUN;
                    }
                    else {
                      S586=0;
                      if(conveyorStatus_o.isACK()){//sysj\controller.sysj line: 52, column: 4
                        conveyorStatus_o.setVal("idle");//sysj\controller.sysj line: 52, column: 4
                        S586=1;
                        if(!conveyorStatus_o.isACK()){//sysj\controller.sysj line: 52, column: 4
                          conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 52, column: 4
                          ends[1]=2;
                          ;//sysj\controller.sysj line: 52, column: 4
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
                              S717=0;
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
                                      thread115471(tdone,ends);
                                      thread115472(tdone,ends);
                                      int biggest115473 = 0;
                                      if(ends[2]>=biggest115473){
                                        biggest115473=ends[2];
                                      }
                                      if(ends[3]>=biggest115473){
                                        biggest115473=ends[3];
                                      }
                                      if(biggest115473 == 1){
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
                              S717=1;
                              S584=0;
                              if(bottleAtPos5.getprestatus()){//sysj\controller.sysj line: 40, column: 12
                                System.out.println("Bottle at position 5 is going to be moved");//sysj\controller.sysj line: 41, column: 5
                                S516=0;
                                thread115474(tdone,ends);
                                thread115475(tdone,ends);
                                thread115476(tdone,ends);
                                int biggest115477 = 0;
                                if(ends[4]>=biggest115477){
                                  biggest115477=ends[4];
                                }
                                if(ends[5]>=biggest115477){
                                  biggest115477=ends[5];
                                }
                                if(ends[6]>=biggest115477){
                                  biggest115477=ends[6];
                                }
                                if(biggest115477 == 1){
                                  active[1]=1;
                                  ends[1]=1;
                                  break RUN;
                                }
                              }
                              else {
                                System.out.println("conveyor idling");//sysj\controller.sysj line: 51, column: 4
                                S584=1;
                                S591=0;
                                if(!conveyorStatus_o.isPartnerPresent() || conveyorStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 52, column: 4
                                  conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 52, column: 4
                                  S591=1;
                                  active[1]=1;
                                  ends[1]=1;
                                  break RUN;
                                }
                                else {
                                  S586=0;
                                  if(conveyorStatus_o.isACK()){//sysj\controller.sysj line: 52, column: 4
                                    conveyorStatus_o.setVal("idle");//sysj\controller.sysj line: 52, column: 4
                                    S586=1;
                                    if(!conveyorStatus_o.isACK()){//sysj\controller.sysj line: 52, column: 4
                                      conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 52, column: 4
                                      ends[1]=2;
                                      ;//sysj\controller.sysj line: 52, column: 4
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
                            S717=0;
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
                                    thread115478(tdone,ends);
                                    thread115479(tdone,ends);
                                    int biggest115480 = 0;
                                    if(ends[2]>=biggest115480){
                                      biggest115480=ends[2];
                                    }
                                    if(ends[3]>=biggest115480){
                                      biggest115480=ends[3];
                                    }
                                    if(biggest115480 == 1){
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
                            S717=1;
                            S584=0;
                            if(bottleAtPos5.getprestatus()){//sysj\controller.sysj line: 40, column: 12
                              System.out.println("Bottle at position 5 is going to be moved");//sysj\controller.sysj line: 41, column: 5
                              S516=0;
                              thread115481(tdone,ends);
                              thread115482(tdone,ends);
                              thread115483(tdone,ends);
                              int biggest115484 = 0;
                              if(ends[4]>=biggest115484){
                                biggest115484=ends[4];
                              }
                              if(ends[5]>=biggest115484){
                                biggest115484=ends[5];
                              }
                              if(ends[6]>=biggest115484){
                                biggest115484=ends[6];
                              }
                              if(biggest115484 == 1){
                                active[1]=1;
                                ends[1]=1;
                                break RUN;
                              }
                            }
                            else {
                              System.out.println("conveyor idling");//sysj\controller.sysj line: 51, column: 4
                              S584=1;
                              S591=0;
                              if(!conveyorStatus_o.isPartnerPresent() || conveyorStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 52, column: 4
                                conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 52, column: 4
                                S591=1;
                                active[1]=1;
                                ends[1]=1;
                                break RUN;
                              }
                              else {
                                S586=0;
                                if(conveyorStatus_o.isACK()){//sysj\controller.sysj line: 52, column: 4
                                  conveyorStatus_o.setVal("idle");//sysj\controller.sysj line: 52, column: 4
                                  S586=1;
                                  if(!conveyorStatus_o.isACK()){//sysj\controller.sysj line: 52, column: 4
                                    conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 52, column: 4
                                    ends[1]=2;
                                    ;//sysj\controller.sysj line: 52, column: 4
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
                          S717=0;
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
                                  thread115485(tdone,ends);
                                  thread115486(tdone,ends);
                                  int biggest115487 = 0;
                                  if(ends[2]>=biggest115487){
                                    biggest115487=ends[2];
                                  }
                                  if(ends[3]>=biggest115487){
                                    biggest115487=ends[3];
                                  }
                                  if(biggest115487 == 1){
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
                          S717=1;
                          S584=0;
                          if(bottleAtPos5.getprestatus()){//sysj\controller.sysj line: 40, column: 12
                            System.out.println("Bottle at position 5 is going to be moved");//sysj\controller.sysj line: 41, column: 5
                            S516=0;
                            thread115488(tdone,ends);
                            thread115489(tdone,ends);
                            thread115490(tdone,ends);
                            int biggest115491 = 0;
                            if(ends[4]>=biggest115491){
                              biggest115491=ends[4];
                            }
                            if(ends[5]>=biggest115491){
                              biggest115491=ends[5];
                            }
                            if(ends[6]>=biggest115491){
                              biggest115491=ends[6];
                            }
                            if(biggest115491 == 1){
                              active[1]=1;
                              ends[1]=1;
                              break RUN;
                            }
                          }
                          else {
                            System.out.println("conveyor idling");//sysj\controller.sysj line: 51, column: 4
                            S584=1;
                            S591=0;
                            if(!conveyorStatus_o.isPartnerPresent() || conveyorStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 52, column: 4
                              conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 52, column: 4
                              S591=1;
                              active[1]=1;
                              ends[1]=1;
                              break RUN;
                            }
                            else {
                              S586=0;
                              if(conveyorStatus_o.isACK()){//sysj\controller.sysj line: 52, column: 4
                                conveyorStatus_o.setVal("idle");//sysj\controller.sysj line: 52, column: 4
                                S586=1;
                                if(!conveyorStatus_o.isACK()){//sysj\controller.sysj line: 52, column: 4
                                  conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 52, column: 4
                                  ends[1]=2;
                                  ;//sysj\controller.sysj line: 52, column: 4
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
              switch(S717){
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
                                      thread115492(tdone,ends);
                                      thread115493(tdone,ends);
                                      int biggest115494 = 0;
                                      if(ends[2]>=biggest115494){
                                        biggest115494=ends[2];
                                      }
                                      if(ends[3]>=biggest115494){
                                        biggest115494=ends[3];
                                      }
                                      if(biggest115494 == 1){
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
                                    thread115495(tdone,ends);
                                    thread115496(tdone,ends);
                                    int biggest115497 = 0;
                                    if(ends[2]>=biggest115497){
                                      biggest115497=ends[2];
                                    }
                                    if(ends[3]>=biggest115497){
                                      biggest115497=ends[3];
                                    }
                                    if(biggest115497 == 1){
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
                                  thread115498(tdone,ends);
                                  thread115499(tdone,ends);
                                  int biggest115500 = 0;
                                  if(ends[2]>=biggest115500){
                                    biggest115500=ends[2];
                                  }
                                  if(ends[3]>=biggest115500){
                                    biggest115500=ends[3];
                                  }
                                  if(biggest115500 == 1){
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
                        thread115501(tdone,ends);
                        thread115502(tdone,ends);
                        int biggest115503 = 0;
                        if(ends[2]>=biggest115503){
                          biggest115503=ends[2];
                        }
                        if(ends[3]>=biggest115503){
                          biggest115503=ends[3];
                        }
                        if(biggest115503 == 1){
                          active[1]=1;
                          ends[1]=1;
                          break RUN;
                        }
                        //FINXME code
                        if(biggest115503 == 0){
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
                  switch(S584){
                    case 0 : 
                      switch(S516){
                        case 0 : 
                          if(bottleLeftPos5.getprestatus()){//sysj\controller.sysj line: 42, column: 11
                            conveyorStatus_o.setPreempted();
                            System.out.println("bottle at pos 5 has moved away");//sysj\controller.sysj line: 46, column: 5
                            S516=1;
                            S523=0;
                            if(!conveyorStatus_o.isPartnerPresent() || conveyorStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 47, column: 5
                              conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 47, column: 5
                              S523=1;
                              active[1]=1;
                              ends[1]=1;
                              break RUN;
                            }
                            else {
                              S518=0;
                              if(conveyorStatus_o.isACK()){//sysj\controller.sysj line: 47, column: 5
                                conveyorStatus_o.setVal("done");//sysj\controller.sysj line: 47, column: 5
                                S518=1;
                                if(!conveyorStatus_o.isACK()){//sysj\controller.sysj line: 47, column: 5
                                  conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 47, column: 5
                                  ends[1]=2;
                                  ;//sysj\controller.sysj line: 47, column: 5
                                  System.out.println("conveyor idling");//sysj\controller.sysj line: 51, column: 4
                                  S584=1;
                                  S591=0;
                                  if(!conveyorStatus_o.isPartnerPresent() || conveyorStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 52, column: 4
                                    conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 52, column: 4
                                    S591=1;
                                    active[1]=1;
                                    ends[1]=1;
                                    break RUN;
                                  }
                                  else {
                                    S586=0;
                                    if(conveyorStatus_o.isACK()){//sysj\controller.sysj line: 52, column: 4
                                      conveyorStatus_o.setVal("idle");//sysj\controller.sysj line: 52, column: 4
                                      S586=1;
                                      if(!conveyorStatus_o.isACK()){//sysj\controller.sysj line: 52, column: 4
                                        conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 52, column: 4
                                        ends[1]=2;
                                        ;//sysj\controller.sysj line: 52, column: 4
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
                            thread115504(tdone,ends);
                            thread115505(tdone,ends);
                            thread115506(tdone,ends);
                            int biggest115507 = 0;
                            if(ends[4]>=biggest115507){
                              biggest115507=ends[4];
                            }
                            if(ends[5]>=biggest115507){
                              biggest115507=ends[5];
                            }
                            if(ends[6]>=biggest115507){
                              biggest115507=ends[6];
                            }
                            if(biggest115507 == 1){
                              active[1]=1;
                              ends[1]=1;
                              break RUN;
                            }
                            //FINXME code
                            if(biggest115507 == 0){
                              System.out.println("bottle at pos 5 has moved away");//sysj\controller.sysj line: 46, column: 5
                              S516=1;
                              S523=0;
                              if(!conveyorStatus_o.isPartnerPresent() || conveyorStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 47, column: 5
                                conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 47, column: 5
                                S523=1;
                                active[1]=1;
                                ends[1]=1;
                                break RUN;
                              }
                              else {
                                S518=0;
                                if(conveyorStatus_o.isACK()){//sysj\controller.sysj line: 47, column: 5
                                  conveyorStatus_o.setVal("done");//sysj\controller.sysj line: 47, column: 5
                                  S518=1;
                                  if(!conveyorStatus_o.isACK()){//sysj\controller.sysj line: 47, column: 5
                                    conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 47, column: 5
                                    ends[1]=2;
                                    ;//sysj\controller.sysj line: 47, column: 5
                                    System.out.println("conveyor idling");//sysj\controller.sysj line: 51, column: 4
                                    S584=1;
                                    S591=0;
                                    if(!conveyorStatus_o.isPartnerPresent() || conveyorStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 52, column: 4
                                      conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 52, column: 4
                                      S591=1;
                                      active[1]=1;
                                      ends[1]=1;
                                      break RUN;
                                    }
                                    else {
                                      S586=0;
                                      if(conveyorStatus_o.isACK()){//sysj\controller.sysj line: 52, column: 4
                                        conveyorStatus_o.setVal("idle");//sysj\controller.sysj line: 52, column: 4
                                        S586=1;
                                        if(!conveyorStatus_o.isACK()){//sysj\controller.sysj line: 52, column: 4
                                          conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 52, column: 4
                                          ends[1]=2;
                                          ;//sysj\controller.sysj line: 52, column: 4
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
                          switch(S523){
                            case 0 : 
                              if(!conveyorStatus_o.isPartnerPresent() || conveyorStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 47, column: 5
                                conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 47, column: 5
                                S523=1;
                                active[1]=1;
                                ends[1]=1;
                                break RUN;
                              }
                              else {
                                switch(S518){
                                  case 0 : 
                                    if(conveyorStatus_o.isACK()){//sysj\controller.sysj line: 47, column: 5
                                      conveyorStatus_o.setVal("done");//sysj\controller.sysj line: 47, column: 5
                                      S518=1;
                                      if(!conveyorStatus_o.isACK()){//sysj\controller.sysj line: 47, column: 5
                                        conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 47, column: 5
                                        ends[1]=2;
                                        ;//sysj\controller.sysj line: 47, column: 5
                                        System.out.println("conveyor idling");//sysj\controller.sysj line: 51, column: 4
                                        S584=1;
                                        S591=0;
                                        if(!conveyorStatus_o.isPartnerPresent() || conveyorStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 52, column: 4
                                          conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 52, column: 4
                                          S591=1;
                                          active[1]=1;
                                          ends[1]=1;
                                          break RUN;
                                        }
                                        else {
                                          S586=0;
                                          if(conveyorStatus_o.isACK()){//sysj\controller.sysj line: 52, column: 4
                                            conveyorStatus_o.setVal("idle");//sysj\controller.sysj line: 52, column: 4
                                            S586=1;
                                            if(!conveyorStatus_o.isACK()){//sysj\controller.sysj line: 52, column: 4
                                              conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 52, column: 4
                                              ends[1]=2;
                                              ;//sysj\controller.sysj line: 52, column: 4
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
                                    if(!conveyorStatus_o.isACK()){//sysj\controller.sysj line: 47, column: 5
                                      conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 47, column: 5
                                      ends[1]=2;
                                      ;//sysj\controller.sysj line: 47, column: 5
                                      System.out.println("conveyor idling");//sysj\controller.sysj line: 51, column: 4
                                      S584=1;
                                      S591=0;
                                      if(!conveyorStatus_o.isPartnerPresent() || conveyorStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 52, column: 4
                                        conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 52, column: 4
                                        S591=1;
                                        active[1]=1;
                                        ends[1]=1;
                                        break RUN;
                                      }
                                      else {
                                        S586=0;
                                        if(conveyorStatus_o.isACK()){//sysj\controller.sysj line: 52, column: 4
                                          conveyorStatus_o.setVal("idle");//sysj\controller.sysj line: 52, column: 4
                                          S586=1;
                                          if(!conveyorStatus_o.isACK()){//sysj\controller.sysj line: 52, column: 4
                                            conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 52, column: 4
                                            ends[1]=2;
                                            ;//sysj\controller.sysj line: 52, column: 4
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
                              S523=1;
                              S523=0;
                              if(!conveyorStatus_o.isPartnerPresent() || conveyorStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 47, column: 5
                                conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 47, column: 5
                                S523=1;
                                active[1]=1;
                                ends[1]=1;
                                break RUN;
                              }
                              else {
                                S518=0;
                                if(conveyorStatus_o.isACK()){//sysj\controller.sysj line: 47, column: 5
                                  conveyorStatus_o.setVal("done");//sysj\controller.sysj line: 47, column: 5
                                  S518=1;
                                  if(!conveyorStatus_o.isACK()){//sysj\controller.sysj line: 47, column: 5
                                    conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 47, column: 5
                                    ends[1]=2;
                                    ;//sysj\controller.sysj line: 47, column: 5
                                    System.out.println("conveyor idling");//sysj\controller.sysj line: 51, column: 4
                                    S584=1;
                                    S591=0;
                                    if(!conveyorStatus_o.isPartnerPresent() || conveyorStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 52, column: 4
                                      conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 52, column: 4
                                      S591=1;
                                      active[1]=1;
                                      ends[1]=1;
                                      break RUN;
                                    }
                                    else {
                                      S586=0;
                                      if(conveyorStatus_o.isACK()){//sysj\controller.sysj line: 52, column: 4
                                        conveyorStatus_o.setVal("idle");//sysj\controller.sysj line: 52, column: 4
                                        S586=1;
                                        if(!conveyorStatus_o.isACK()){//sysj\controller.sysj line: 52, column: 4
                                          conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 52, column: 4
                                          ends[1]=2;
                                          ;//sysj\controller.sysj line: 52, column: 4
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
                      switch(S591){
                        case 0 : 
                          if(!conveyorStatus_o.isPartnerPresent() || conveyorStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 52, column: 4
                            conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 52, column: 4
                            S591=1;
                            active[1]=1;
                            ends[1]=1;
                            break RUN;
                          }
                          else {
                            switch(S586){
                              case 0 : 
                                if(conveyorStatus_o.isACK()){//sysj\controller.sysj line: 52, column: 4
                                  conveyorStatus_o.setVal("idle");//sysj\controller.sysj line: 52, column: 4
                                  S586=1;
                                  if(!conveyorStatus_o.isACK()){//sysj\controller.sysj line: 52, column: 4
                                    conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 52, column: 4
                                    ends[1]=2;
                                    ;//sysj\controller.sysj line: 52, column: 4
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
                                if(!conveyorStatus_o.isACK()){//sysj\controller.sysj line: 52, column: 4
                                  conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 52, column: 4
                                  ends[1]=2;
                                  ;//sysj\controller.sysj line: 52, column: 4
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
                          S591=1;
                          S591=0;
                          if(!conveyorStatus_o.isPartnerPresent() || conveyorStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 52, column: 4
                            conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 52, column: 4
                            S591=1;
                            active[1]=1;
                            ends[1]=1;
                            break RUN;
                          }
                          else {
                            S586=0;
                            if(conveyorStatus_o.isACK()){//sysj\controller.sysj line: 52, column: 4
                              conveyorStatus_o.setVal("idle");//sysj\controller.sysj line: 52, column: 4
                              S586=1;
                              if(!conveyorStatus_o.isACK()){//sysj\controller.sysj line: 52, column: 4
                                conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 52, column: 4
                                ends[1]=2;
                                ;//sysj\controller.sysj line: 52, column: 4
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
                      S717=0;
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
                              thread115508(tdone,ends);
                              thread115509(tdone,ends);
                              int biggest115510 = 0;
                              if(ends[2]>=biggest115510){
                                biggest115510=ends[2];
                              }
                              if(ends[3]>=biggest115510){
                                biggest115510=ends[3];
                              }
                              if(biggest115510 == 1){
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
                      S717=1;
                      S584=0;
                      if(bottleAtPos5.getprestatus()){//sysj\controller.sysj line: 40, column: 12
                        System.out.println("Bottle at position 5 is going to be moved");//sysj\controller.sysj line: 41, column: 5
                        S516=0;
                        thread115511(tdone,ends);
                        thread115512(tdone,ends);
                        thread115513(tdone,ends);
                        int biggest115514 = 0;
                        if(ends[4]>=biggest115514){
                          biggest115514=ends[4];
                        }
                        if(ends[5]>=biggest115514){
                          biggest115514=ends[5];
                        }
                        if(ends[6]>=biggest115514){
                          biggest115514=ends[6];
                        }
                        if(biggest115514 == 1){
                          active[1]=1;
                          ends[1]=1;
                          break RUN;
                        }
                      }
                      else {
                        System.out.println("conveyor idling");//sysj\controller.sysj line: 51, column: 4
                        S584=1;
                        S591=0;
                        if(!conveyorStatus_o.isPartnerPresent() || conveyorStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 52, column: 4
                          conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 52, column: 4
                          S591=1;
                          active[1]=1;
                          ends[1]=1;
                          break RUN;
                        }
                        else {
                          S586=0;
                          if(conveyorStatus_o.isACK()){//sysj\controller.sysj line: 52, column: 4
                            conveyorStatus_o.setVal("idle");//sysj\controller.sysj line: 52, column: 4
                            S586=1;
                            if(!conveyorStatus_o.isACK()){//sysj\controller.sysj line: 52, column: 4
                              conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 52, column: 4
                              ends[1]=2;
                              ;//sysj\controller.sysj line: 52, column: 4
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
