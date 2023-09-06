import java.util.*;
import com.systemj.ClockDomain;
import com.systemj.Signal;
import com.systemj.input_Channel;
import com.systemj.output_Channel;
import java.util.ArrayList;//sysj\controller.sysj line: 1, column: 1

public class Conveyor extends ClockDomain{
  public Conveyor(String name){super(name);}
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
  private int S6298 = 1;
  private int S22 = 1;
  private int S6 = 1;
  private int S1 = 1;
  private int S541 = 1;
  private int S45 = 1;
  private int S29 = 1;
  private int S24 = 1;
  private int S50 = 1;
  private int S55 = 1;
  private int S144 = 1;
  private int S139 = 1;
  private int S408 = 1;
  private int S340 = 1;
  private int S274 = 1;
  private int S279 = 1;
  private int S303 = 1;
  private int S286 = 1;
  private int S281 = 1;
  private int S347 = 1;
  private int S342 = 1;
  private int S415 = 1;
  private int S410 = 1;
  
  private int[] ends = new int[23];
  private int[] tdone = new int[23];
  
  public void thread113401(int [] tdone, int [] ends){
        S303=1;
    S286=0;
    if(!conveyorStatus_o.isPartnerPresent() || conveyorStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 43, column: 10
      conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 43, column: 10
      S286=1;
      active[6]=1;
      ends[6]=1;
      tdone[6]=1;
    }
    else {
      S281=0;
      if(conveyorStatus_o.isACK()){//sysj\controller.sysj line: 43, column: 10
        conveyorStatus_o.setVal("busy");//sysj\controller.sysj line: 43, column: 10
        S281=1;
        if(!conveyorStatus_o.isACK()){//sysj\controller.sysj line: 43, column: 10
          conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 43, column: 10
          ends[6]=2;
          ;//sysj\controller.sysj line: 43, column: 10
          S303=0;
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

  public void thread113400(int [] tdone, int [] ends){
        S279=1;
    motorPos5On.setPresent();//sysj\controller.sysj line: 42, column: 38
    currsigs.addElement(motorPos5On);
    active[5]=1;
    ends[5]=1;
    tdone[5]=1;
  }

  public void thread113399(int [] tdone, int [] ends){
        S274=1;
    motConveyorOnOff.setPresent();//sysj\controller.sysj line: 42, column: 7
    currsigs.addElement(motConveyorOnOff);
    active[4]=1;
    ends[4]=1;
    tdone[4]=1;
  }

  public void thread113397(int [] tdone, int [] ends){
        S55=1;
    motorPos1On.setPresent();//sysj\controller.sysj line: 29, column: 38
    currsigs.addElement(motorPos1On);
    active[3]=1;
    ends[3]=1;
    tdone[3]=1;
  }

  public void thread113396(int [] tdone, int [] ends){
        S50=1;
    motConveyorOnOff.setPresent();//sysj\controller.sysj line: 29, column: 7
    currsigs.addElement(motConveyorOnOff);
    active[2]=1;
    ends[2]=1;
    tdone[2]=1;
  }

  public void thread113394(int [] tdone, int [] ends){
        switch(S303){
      case 0 : 
        active[6]=0;
        ends[6]=0;
        tdone[6]=1;
        break;
      
      case 1 : 
        switch(S286){
          case 0 : 
            if(!conveyorStatus_o.isPartnerPresent() || conveyorStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 43, column: 10
              conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 43, column: 10
              S286=1;
              active[6]=1;
              ends[6]=1;
              tdone[6]=1;
            }
            else {
              switch(S281){
                case 0 : 
                  if(conveyorStatus_o.isACK()){//sysj\controller.sysj line: 43, column: 10
                    conveyorStatus_o.setVal("busy");//sysj\controller.sysj line: 43, column: 10
                    S281=1;
                    if(!conveyorStatus_o.isACK()){//sysj\controller.sysj line: 43, column: 10
                      conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 43, column: 10
                      ends[6]=2;
                      ;//sysj\controller.sysj line: 43, column: 10
                      S303=0;
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
                  if(!conveyorStatus_o.isACK()){//sysj\controller.sysj line: 43, column: 10
                    conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 43, column: 10
                    ends[6]=2;
                    ;//sysj\controller.sysj line: 43, column: 10
                    S303=0;
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
            S286=1;
            S286=0;
            if(!conveyorStatus_o.isPartnerPresent() || conveyorStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 43, column: 10
              conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 43, column: 10
              S286=1;
              active[6]=1;
              ends[6]=1;
              tdone[6]=1;
            }
            else {
              S281=0;
              if(conveyorStatus_o.isACK()){//sysj\controller.sysj line: 43, column: 10
                conveyorStatus_o.setVal("busy");//sysj\controller.sysj line: 43, column: 10
                S281=1;
                if(!conveyorStatus_o.isACK()){//sysj\controller.sysj line: 43, column: 10
                  conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 43, column: 10
                  ends[6]=2;
                  ;//sysj\controller.sysj line: 43, column: 10
                  S303=0;
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

  public void thread113393(int [] tdone, int [] ends){
        switch(S279){
      case 0 : 
        active[5]=0;
        ends[5]=0;
        tdone[5]=1;
        break;
      
      case 1 : 
        motorPos5On.setPresent();//sysj\controller.sysj line: 42, column: 38
        currsigs.addElement(motorPos5On);
        active[5]=1;
        ends[5]=1;
        tdone[5]=1;
        break;
      
    }
  }

  public void thread113392(int [] tdone, int [] ends){
        switch(S274){
      case 0 : 
        active[4]=0;
        ends[4]=0;
        tdone[4]=1;
        break;
      
      case 1 : 
        motConveyorOnOff.setPresent();//sysj\controller.sysj line: 42, column: 7
        currsigs.addElement(motConveyorOnOff);
        active[4]=1;
        ends[4]=1;
        tdone[4]=1;
        break;
      
    }
  }

  public void thread113390(int [] tdone, int [] ends){
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

  public void thread113389(int [] tdone, int [] ends){
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

  public void thread113387(int [] tdone, int [] ends){
        S55=1;
    motorPos1On.setPresent();//sysj\controller.sysj line: 29, column: 38
    currsigs.addElement(motorPos1On);
    active[3]=1;
    ends[3]=1;
    tdone[3]=1;
  }

  public void thread113386(int [] tdone, int [] ends){
        S50=1;
    motConveyorOnOff.setPresent();//sysj\controller.sysj line: 29, column: 7
    currsigs.addElement(motConveyorOnOff);
    active[2]=1;
    ends[2]=1;
    tdone[2]=1;
  }

  public void thread113384(int [] tdone, int [] ends){
        S55=1;
    motorPos1On.setPresent();//sysj\controller.sysj line: 29, column: 38
    currsigs.addElement(motorPos1On);
    active[3]=1;
    ends[3]=1;
    tdone[3]=1;
  }

  public void thread113383(int [] tdone, int [] ends){
        S50=1;
    motConveyorOnOff.setPresent();//sysj\controller.sysj line: 29, column: 7
    currsigs.addElement(motConveyorOnOff);
    active[2]=1;
    ends[2]=1;
    tdone[2]=1;
  }

  public void thread113381(int [] tdone, int [] ends){
        S55=1;
    motorPos1On.setPresent();//sysj\controller.sysj line: 29, column: 38
    currsigs.addElement(motorPos1On);
    active[3]=1;
    ends[3]=1;
    tdone[3]=1;
  }

  public void thread113380(int [] tdone, int [] ends){
        S50=1;
    motConveyorOnOff.setPresent();//sysj\controller.sysj line: 29, column: 7
    currsigs.addElement(motConveyorOnOff);
    active[2]=1;
    ends[2]=1;
    tdone[2]=1;
  }

  public void thread113378(int [] tdone, int [] ends){
        S303=1;
    S286=0;
    if(!conveyorStatus_o.isPartnerPresent() || conveyorStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 43, column: 10
      conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 43, column: 10
      S286=1;
      active[6]=1;
      ends[6]=1;
      tdone[6]=1;
    }
    else {
      S281=0;
      if(conveyorStatus_o.isACK()){//sysj\controller.sysj line: 43, column: 10
        conveyorStatus_o.setVal("busy");//sysj\controller.sysj line: 43, column: 10
        S281=1;
        if(!conveyorStatus_o.isACK()){//sysj\controller.sysj line: 43, column: 10
          conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 43, column: 10
          ends[6]=2;
          ;//sysj\controller.sysj line: 43, column: 10
          S303=0;
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

  public void thread113377(int [] tdone, int [] ends){
        S279=1;
    motorPos5On.setPresent();//sysj\controller.sysj line: 42, column: 38
    currsigs.addElement(motorPos5On);
    active[5]=1;
    ends[5]=1;
    tdone[5]=1;
  }

  public void thread113376(int [] tdone, int [] ends){
        S274=1;
    motConveyorOnOff.setPresent();//sysj\controller.sysj line: 42, column: 7
    currsigs.addElement(motConveyorOnOff);
    active[4]=1;
    ends[4]=1;
    tdone[4]=1;
  }

  public void thread113374(int [] tdone, int [] ends){
        S55=1;
    motorPos1On.setPresent();//sysj\controller.sysj line: 29, column: 38
    currsigs.addElement(motorPos1On);
    active[3]=1;
    ends[3]=1;
    tdone[3]=1;
  }

  public void thread113373(int [] tdone, int [] ends){
        S50=1;
    motConveyorOnOff.setPresent();//sysj\controller.sysj line: 29, column: 7
    currsigs.addElement(motConveyorOnOff);
    active[2]=1;
    ends[2]=1;
    tdone[2]=1;
  }

  public void thread113371(int [] tdone, int [] ends){
        S303=1;
    S286=0;
    if(!conveyorStatus_o.isPartnerPresent() || conveyorStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 43, column: 10
      conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 43, column: 10
      S286=1;
      active[6]=1;
      ends[6]=1;
      tdone[6]=1;
    }
    else {
      S281=0;
      if(conveyorStatus_o.isACK()){//sysj\controller.sysj line: 43, column: 10
        conveyorStatus_o.setVal("busy");//sysj\controller.sysj line: 43, column: 10
        S281=1;
        if(!conveyorStatus_o.isACK()){//sysj\controller.sysj line: 43, column: 10
          conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 43, column: 10
          ends[6]=2;
          ;//sysj\controller.sysj line: 43, column: 10
          S303=0;
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

  public void thread113370(int [] tdone, int [] ends){
        S279=1;
    motorPos5On.setPresent();//sysj\controller.sysj line: 42, column: 38
    currsigs.addElement(motorPos5On);
    active[5]=1;
    ends[5]=1;
    tdone[5]=1;
  }

  public void thread113369(int [] tdone, int [] ends){
        S274=1;
    motConveyorOnOff.setPresent();//sysj\controller.sysj line: 42, column: 7
    currsigs.addElement(motConveyorOnOff);
    active[4]=1;
    ends[4]=1;
    tdone[4]=1;
  }

  public void thread113367(int [] tdone, int [] ends){
        S55=1;
    motorPos1On.setPresent();//sysj\controller.sysj line: 29, column: 38
    currsigs.addElement(motorPos1On);
    active[3]=1;
    ends[3]=1;
    tdone[3]=1;
  }

  public void thread113366(int [] tdone, int [] ends){
        S50=1;
    motConveyorOnOff.setPresent();//sysj\controller.sysj line: 29, column: 7
    currsigs.addElement(motConveyorOnOff);
    active[2]=1;
    ends[2]=1;
    tdone[2]=1;
  }

  public void thread113364(int [] tdone, int [] ends){
        S303=1;
    S286=0;
    if(!conveyorStatus_o.isPartnerPresent() || conveyorStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 43, column: 10
      conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 43, column: 10
      S286=1;
      active[6]=1;
      ends[6]=1;
      tdone[6]=1;
    }
    else {
      S281=0;
      if(conveyorStatus_o.isACK()){//sysj\controller.sysj line: 43, column: 10
        conveyorStatus_o.setVal("busy");//sysj\controller.sysj line: 43, column: 10
        S281=1;
        if(!conveyorStatus_o.isACK()){//sysj\controller.sysj line: 43, column: 10
          conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 43, column: 10
          ends[6]=2;
          ;//sysj\controller.sysj line: 43, column: 10
          S303=0;
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

  public void thread113363(int [] tdone, int [] ends){
        S279=1;
    motorPos5On.setPresent();//sysj\controller.sysj line: 42, column: 38
    currsigs.addElement(motorPos5On);
    active[5]=1;
    ends[5]=1;
    tdone[5]=1;
  }

  public void thread113362(int [] tdone, int [] ends){
        S274=1;
    motConveyorOnOff.setPresent();//sysj\controller.sysj line: 42, column: 7
    currsigs.addElement(motConveyorOnOff);
    active[4]=1;
    ends[4]=1;
    tdone[4]=1;
  }

  public void thread113360(int [] tdone, int [] ends){
        S55=1;
    motorPos1On.setPresent();//sysj\controller.sysj line: 29, column: 38
    currsigs.addElement(motorPos1On);
    active[3]=1;
    ends[3]=1;
    tdone[3]=1;
  }

  public void thread113359(int [] tdone, int [] ends){
        S50=1;
    motConveyorOnOff.setPresent();//sysj\controller.sysj line: 29, column: 7
    currsigs.addElement(motConveyorOnOff);
    active[2]=1;
    ends[2]=1;
    tdone[2]=1;
  }

  public void thread113357(int [] tdone, int [] ends){
        S303=1;
    S286=0;
    if(!conveyorStatus_o.isPartnerPresent() || conveyorStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 43, column: 10
      conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 43, column: 10
      S286=1;
      active[6]=1;
      ends[6]=1;
      tdone[6]=1;
    }
    else {
      S281=0;
      if(conveyorStatus_o.isACK()){//sysj\controller.sysj line: 43, column: 10
        conveyorStatus_o.setVal("busy");//sysj\controller.sysj line: 43, column: 10
        S281=1;
        if(!conveyorStatus_o.isACK()){//sysj\controller.sysj line: 43, column: 10
          conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 43, column: 10
          ends[6]=2;
          ;//sysj\controller.sysj line: 43, column: 10
          S303=0;
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

  public void thread113356(int [] tdone, int [] ends){
        S279=1;
    motorPos5On.setPresent();//sysj\controller.sysj line: 42, column: 38
    currsigs.addElement(motorPos5On);
    active[5]=1;
    ends[5]=1;
    tdone[5]=1;
  }

  public void thread113355(int [] tdone, int [] ends){
        S274=1;
    motConveyorOnOff.setPresent();//sysj\controller.sysj line: 42, column: 7
    currsigs.addElement(motConveyorOnOff);
    active[4]=1;
    ends[4]=1;
    tdone[4]=1;
  }

  public void thread113353(int [] tdone, int [] ends){
        S55=1;
    motorPos1On.setPresent();//sysj\controller.sysj line: 29, column: 38
    currsigs.addElement(motorPos1On);
    active[3]=1;
    ends[3]=1;
    tdone[3]=1;
  }

  public void thread113352(int [] tdone, int [] ends){
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
      switch(S6298){
        case 0 : 
          S6298=0;
          break RUN;
        
        case 1 : 
          S6298=2;
          S6298=2;
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
                  S541=0;
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
                          thread113352(tdone,ends);
                          thread113353(tdone,ends);
                          int biggest113354 = 0;
                          if(ends[2]>=biggest113354){
                            biggest113354=ends[2];
                          }
                          if(ends[3]>=biggest113354){
                            biggest113354=ends[3];
                          }
                          if(biggest113354 == 1){
                            active[1]=1;
                            ends[1]=1;
                            break RUN;
                          }
                        }
                        else {
                          System.out.println("Motor is off");//sysj\controller.sysj line: 33, column: 4
                          S45=2;
                          S144=0;
                          if(!conveyorStatus_o.isPartnerPresent() || conveyorStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 34, column: 4
                            conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 34, column: 4
                            S144=1;
                            active[1]=1;
                            ends[1]=1;
                            break RUN;
                          }
                          else {
                            S139=0;
                            if(conveyorStatus_o.isACK()){//sysj\controller.sysj line: 34, column: 4
                              conveyorStatus_o.setVal("done");//sysj\controller.sysj line: 34, column: 4
                              S139=1;
                              if(!conveyorStatus_o.isACK()){//sysj\controller.sysj line: 34, column: 4
                                conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 34, column: 4
                                ends[1]=2;
                                ;//sysj\controller.sysj line: 34, column: 4
                                System.out.println("conveyor done");//sysj\controller.sysj line: 35, column: 4
                                S45=3;
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
                  S541=1;
                  S408=0;
                  if(bottleAtPos5.getprestatus()){//sysj\controller.sysj line: 39, column: 12
                    System.out.println("Bottle at position 5 is going to be moved");//sysj\controller.sysj line: 40, column: 5
                    S340=0;
                    thread113355(tdone,ends);
                    thread113356(tdone,ends);
                    thread113357(tdone,ends);
                    int biggest113358 = 0;
                    if(ends[4]>=biggest113358){
                      biggest113358=ends[4];
                    }
                    if(ends[5]>=biggest113358){
                      biggest113358=ends[5];
                    }
                    if(ends[6]>=biggest113358){
                      biggest113358=ends[6];
                    }
                    if(biggest113358 == 1){
                      active[1]=1;
                      ends[1]=1;
                      break RUN;
                    }
                  }
                  else {
                    System.out.println("conveyor idling");//sysj\controller.sysj line: 50, column: 4
                    S408=1;
                    S415=0;
                    if(!conveyorStatus_o.isPartnerPresent() || conveyorStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 51, column: 4
                      conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 51, column: 4
                      S415=1;
                      active[1]=1;
                      ends[1]=1;
                      break RUN;
                    }
                    else {
                      S410=0;
                      if(conveyorStatus_o.isACK()){//sysj\controller.sysj line: 51, column: 4
                        conveyorStatus_o.setVal("idle");//sysj\controller.sysj line: 51, column: 4
                        S410=1;
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
                              S541=0;
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
                                      thread113359(tdone,ends);
                                      thread113360(tdone,ends);
                                      int biggest113361 = 0;
                                      if(ends[2]>=biggest113361){
                                        biggest113361=ends[2];
                                      }
                                      if(ends[3]>=biggest113361){
                                        biggest113361=ends[3];
                                      }
                                      if(biggest113361 == 1){
                                        active[1]=1;
                                        ends[1]=1;
                                        break RUN;
                                      }
                                    }
                                    else {
                                      System.out.println("Motor is off");//sysj\controller.sysj line: 33, column: 4
                                      S45=2;
                                      S144=0;
                                      if(!conveyorStatus_o.isPartnerPresent() || conveyorStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 34, column: 4
                                        conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 34, column: 4
                                        S144=1;
                                        active[1]=1;
                                        ends[1]=1;
                                        break RUN;
                                      }
                                      else {
                                        S139=0;
                                        if(conveyorStatus_o.isACK()){//sysj\controller.sysj line: 34, column: 4
                                          conveyorStatus_o.setVal("done");//sysj\controller.sysj line: 34, column: 4
                                          S139=1;
                                          if(!conveyorStatus_o.isACK()){//sysj\controller.sysj line: 34, column: 4
                                            conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 34, column: 4
                                            ends[1]=2;
                                            ;//sysj\controller.sysj line: 34, column: 4
                                            System.out.println("conveyor done");//sysj\controller.sysj line: 35, column: 4
                                            S45=3;
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
                              S541=1;
                              S408=0;
                              if(bottleAtPos5.getprestatus()){//sysj\controller.sysj line: 39, column: 12
                                System.out.println("Bottle at position 5 is going to be moved");//sysj\controller.sysj line: 40, column: 5
                                S340=0;
                                thread113362(tdone,ends);
                                thread113363(tdone,ends);
                                thread113364(tdone,ends);
                                int biggest113365 = 0;
                                if(ends[4]>=biggest113365){
                                  biggest113365=ends[4];
                                }
                                if(ends[5]>=biggest113365){
                                  biggest113365=ends[5];
                                }
                                if(ends[6]>=biggest113365){
                                  biggest113365=ends[6];
                                }
                                if(biggest113365 == 1){
                                  active[1]=1;
                                  ends[1]=1;
                                  break RUN;
                                }
                              }
                              else {
                                System.out.println("conveyor idling");//sysj\controller.sysj line: 50, column: 4
                                S408=1;
                                S415=0;
                                if(!conveyorStatus_o.isPartnerPresent() || conveyorStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 51, column: 4
                                  conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 51, column: 4
                                  S415=1;
                                  active[1]=1;
                                  ends[1]=1;
                                  break RUN;
                                }
                                else {
                                  S410=0;
                                  if(conveyorStatus_o.isACK()){//sysj\controller.sysj line: 51, column: 4
                                    conveyorStatus_o.setVal("idle");//sysj\controller.sysj line: 51, column: 4
                                    S410=1;
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
                            S541=0;
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
                                    thread113366(tdone,ends);
                                    thread113367(tdone,ends);
                                    int biggest113368 = 0;
                                    if(ends[2]>=biggest113368){
                                      biggest113368=ends[2];
                                    }
                                    if(ends[3]>=biggest113368){
                                      biggest113368=ends[3];
                                    }
                                    if(biggest113368 == 1){
                                      active[1]=1;
                                      ends[1]=1;
                                      break RUN;
                                    }
                                  }
                                  else {
                                    System.out.println("Motor is off");//sysj\controller.sysj line: 33, column: 4
                                    S45=2;
                                    S144=0;
                                    if(!conveyorStatus_o.isPartnerPresent() || conveyorStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 34, column: 4
                                      conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 34, column: 4
                                      S144=1;
                                      active[1]=1;
                                      ends[1]=1;
                                      break RUN;
                                    }
                                    else {
                                      S139=0;
                                      if(conveyorStatus_o.isACK()){//sysj\controller.sysj line: 34, column: 4
                                        conveyorStatus_o.setVal("done");//sysj\controller.sysj line: 34, column: 4
                                        S139=1;
                                        if(!conveyorStatus_o.isACK()){//sysj\controller.sysj line: 34, column: 4
                                          conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 34, column: 4
                                          ends[1]=2;
                                          ;//sysj\controller.sysj line: 34, column: 4
                                          System.out.println("conveyor done");//sysj\controller.sysj line: 35, column: 4
                                          S45=3;
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
                            S541=1;
                            S408=0;
                            if(bottleAtPos5.getprestatus()){//sysj\controller.sysj line: 39, column: 12
                              System.out.println("Bottle at position 5 is going to be moved");//sysj\controller.sysj line: 40, column: 5
                              S340=0;
                              thread113369(tdone,ends);
                              thread113370(tdone,ends);
                              thread113371(tdone,ends);
                              int biggest113372 = 0;
                              if(ends[4]>=biggest113372){
                                biggest113372=ends[4];
                              }
                              if(ends[5]>=biggest113372){
                                biggest113372=ends[5];
                              }
                              if(ends[6]>=biggest113372){
                                biggest113372=ends[6];
                              }
                              if(biggest113372 == 1){
                                active[1]=1;
                                ends[1]=1;
                                break RUN;
                              }
                            }
                            else {
                              System.out.println("conveyor idling");//sysj\controller.sysj line: 50, column: 4
                              S408=1;
                              S415=0;
                              if(!conveyorStatus_o.isPartnerPresent() || conveyorStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 51, column: 4
                                conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 51, column: 4
                                S415=1;
                                active[1]=1;
                                ends[1]=1;
                                break RUN;
                              }
                              else {
                                S410=0;
                                if(conveyorStatus_o.isACK()){//sysj\controller.sysj line: 51, column: 4
                                  conveyorStatus_o.setVal("idle");//sysj\controller.sysj line: 51, column: 4
                                  S410=1;
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
                          S541=0;
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
                                  thread113373(tdone,ends);
                                  thread113374(tdone,ends);
                                  int biggest113375 = 0;
                                  if(ends[2]>=biggest113375){
                                    biggest113375=ends[2];
                                  }
                                  if(ends[3]>=biggest113375){
                                    biggest113375=ends[3];
                                  }
                                  if(biggest113375 == 1){
                                    active[1]=1;
                                    ends[1]=1;
                                    break RUN;
                                  }
                                }
                                else {
                                  System.out.println("Motor is off");//sysj\controller.sysj line: 33, column: 4
                                  S45=2;
                                  S144=0;
                                  if(!conveyorStatus_o.isPartnerPresent() || conveyorStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 34, column: 4
                                    conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 34, column: 4
                                    S144=1;
                                    active[1]=1;
                                    ends[1]=1;
                                    break RUN;
                                  }
                                  else {
                                    S139=0;
                                    if(conveyorStatus_o.isACK()){//sysj\controller.sysj line: 34, column: 4
                                      conveyorStatus_o.setVal("done");//sysj\controller.sysj line: 34, column: 4
                                      S139=1;
                                      if(!conveyorStatus_o.isACK()){//sysj\controller.sysj line: 34, column: 4
                                        conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 34, column: 4
                                        ends[1]=2;
                                        ;//sysj\controller.sysj line: 34, column: 4
                                        System.out.println("conveyor done");//sysj\controller.sysj line: 35, column: 4
                                        S45=3;
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
                          S541=1;
                          S408=0;
                          if(bottleAtPos5.getprestatus()){//sysj\controller.sysj line: 39, column: 12
                            System.out.println("Bottle at position 5 is going to be moved");//sysj\controller.sysj line: 40, column: 5
                            S340=0;
                            thread113376(tdone,ends);
                            thread113377(tdone,ends);
                            thread113378(tdone,ends);
                            int biggest113379 = 0;
                            if(ends[4]>=biggest113379){
                              biggest113379=ends[4];
                            }
                            if(ends[5]>=biggest113379){
                              biggest113379=ends[5];
                            }
                            if(ends[6]>=biggest113379){
                              biggest113379=ends[6];
                            }
                            if(biggest113379 == 1){
                              active[1]=1;
                              ends[1]=1;
                              break RUN;
                            }
                          }
                          else {
                            System.out.println("conveyor idling");//sysj\controller.sysj line: 50, column: 4
                            S408=1;
                            S415=0;
                            if(!conveyorStatus_o.isPartnerPresent() || conveyorStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 51, column: 4
                              conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 51, column: 4
                              S415=1;
                              active[1]=1;
                              ends[1]=1;
                              break RUN;
                            }
                            else {
                              S410=0;
                              if(conveyorStatus_o.isACK()){//sysj\controller.sysj line: 51, column: 4
                                conveyorStatus_o.setVal("idle");//sysj\controller.sysj line: 51, column: 4
                                S410=1;
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
              switch(S541){
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
                                      thread113380(tdone,ends);
                                      thread113381(tdone,ends);
                                      int biggest113382 = 0;
                                      if(ends[2]>=biggest113382){
                                        biggest113382=ends[2];
                                      }
                                      if(ends[3]>=biggest113382){
                                        biggest113382=ends[3];
                                      }
                                      if(biggest113382 == 1){
                                        active[1]=1;
                                        ends[1]=1;
                                        break RUN;
                                      }
                                    }
                                    else {
                                      System.out.println("Motor is off");//sysj\controller.sysj line: 33, column: 4
                                      S45=2;
                                      S144=0;
                                      if(!conveyorStatus_o.isPartnerPresent() || conveyorStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 34, column: 4
                                        conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 34, column: 4
                                        S144=1;
                                        active[1]=1;
                                        ends[1]=1;
                                        break RUN;
                                      }
                                      else {
                                        S139=0;
                                        if(conveyorStatus_o.isACK()){//sysj\controller.sysj line: 34, column: 4
                                          conveyorStatus_o.setVal("done");//sysj\controller.sysj line: 34, column: 4
                                          S139=1;
                                          if(!conveyorStatus_o.isACK()){//sysj\controller.sysj line: 34, column: 4
                                            conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 34, column: 4
                                            ends[1]=2;
                                            ;//sysj\controller.sysj line: 34, column: 4
                                            System.out.println("conveyor done");//sysj\controller.sysj line: 35, column: 4
                                            S45=3;
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
                                    thread113383(tdone,ends);
                                    thread113384(tdone,ends);
                                    int biggest113385 = 0;
                                    if(ends[2]>=biggest113385){
                                      biggest113385=ends[2];
                                    }
                                    if(ends[3]>=biggest113385){
                                      biggest113385=ends[3];
                                    }
                                    if(biggest113385 == 1){
                                      active[1]=1;
                                      ends[1]=1;
                                      break RUN;
                                    }
                                  }
                                  else {
                                    System.out.println("Motor is off");//sysj\controller.sysj line: 33, column: 4
                                    S45=2;
                                    S144=0;
                                    if(!conveyorStatus_o.isPartnerPresent() || conveyorStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 34, column: 4
                                      conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 34, column: 4
                                      S144=1;
                                      active[1]=1;
                                      ends[1]=1;
                                      break RUN;
                                    }
                                    else {
                                      S139=0;
                                      if(conveyorStatus_o.isACK()){//sysj\controller.sysj line: 34, column: 4
                                        conveyorStatus_o.setVal("done");//sysj\controller.sysj line: 34, column: 4
                                        S139=1;
                                        if(!conveyorStatus_o.isACK()){//sysj\controller.sysj line: 34, column: 4
                                          conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 34, column: 4
                                          ends[1]=2;
                                          ;//sysj\controller.sysj line: 34, column: 4
                                          System.out.println("conveyor done");//sysj\controller.sysj line: 35, column: 4
                                          S45=3;
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
                                  thread113386(tdone,ends);
                                  thread113387(tdone,ends);
                                  int biggest113388 = 0;
                                  if(ends[2]>=biggest113388){
                                    biggest113388=ends[2];
                                  }
                                  if(ends[3]>=biggest113388){
                                    biggest113388=ends[3];
                                  }
                                  if(biggest113388 == 1){
                                    active[1]=1;
                                    ends[1]=1;
                                    break RUN;
                                  }
                                }
                                else {
                                  System.out.println("Motor is off");//sysj\controller.sysj line: 33, column: 4
                                  S45=2;
                                  S144=0;
                                  if(!conveyorStatus_o.isPartnerPresent() || conveyorStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 34, column: 4
                                    conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 34, column: 4
                                    S144=1;
                                    active[1]=1;
                                    ends[1]=1;
                                    break RUN;
                                  }
                                  else {
                                    S139=0;
                                    if(conveyorStatus_o.isACK()){//sysj\controller.sysj line: 34, column: 4
                                      conveyorStatus_o.setVal("done");//sysj\controller.sysj line: 34, column: 4
                                      S139=1;
                                      if(!conveyorStatus_o.isACK()){//sysj\controller.sysj line: 34, column: 4
                                        conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 34, column: 4
                                        ends[1]=2;
                                        ;//sysj\controller.sysj line: 34, column: 4
                                        System.out.println("conveyor done");//sysj\controller.sysj line: 35, column: 4
                                        S45=3;
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
                        System.out.println("Motor is off");//sysj\controller.sysj line: 33, column: 4
                        S45=2;
                        S144=0;
                        if(!conveyorStatus_o.isPartnerPresent() || conveyorStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 34, column: 4
                          conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 34, column: 4
                          S144=1;
                          active[1]=1;
                          ends[1]=1;
                          break RUN;
                        }
                        else {
                          S139=0;
                          if(conveyorStatus_o.isACK()){//sysj\controller.sysj line: 34, column: 4
                            conveyorStatus_o.setVal("done");//sysj\controller.sysj line: 34, column: 4
                            S139=1;
                            if(!conveyorStatus_o.isACK()){//sysj\controller.sysj line: 34, column: 4
                              conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 34, column: 4
                              ends[1]=2;
                              ;//sysj\controller.sysj line: 34, column: 4
                              System.out.println("conveyor done");//sysj\controller.sysj line: 35, column: 4
                              S45=3;
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
                        thread113389(tdone,ends);
                        thread113390(tdone,ends);
                        int biggest113391 = 0;
                        if(ends[2]>=biggest113391){
                          biggest113391=ends[2];
                        }
                        if(ends[3]>=biggest113391){
                          biggest113391=ends[3];
                        }
                        if(biggest113391 == 1){
                          active[1]=1;
                          ends[1]=1;
                          break RUN;
                        }
                        //FINXME code
                        if(biggest113391 == 0){
                          System.out.println("Motor is off");//sysj\controller.sysj line: 33, column: 4
                          S45=2;
                          S144=0;
                          if(!conveyorStatus_o.isPartnerPresent() || conveyorStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 34, column: 4
                            conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 34, column: 4
                            S144=1;
                            active[1]=1;
                            ends[1]=1;
                            break RUN;
                          }
                          else {
                            S139=0;
                            if(conveyorStatus_o.isACK()){//sysj\controller.sysj line: 34, column: 4
                              conveyorStatus_o.setVal("done");//sysj\controller.sysj line: 34, column: 4
                              S139=1;
                              if(!conveyorStatus_o.isACK()){//sysj\controller.sysj line: 34, column: 4
                                conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 34, column: 4
                                ends[1]=2;
                                ;//sysj\controller.sysj line: 34, column: 4
                                System.out.println("conveyor done");//sysj\controller.sysj line: 35, column: 4
                                S45=3;
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
                    
                    case 2 : 
                      switch(S144){
                        case 0 : 
                          if(!conveyorStatus_o.isPartnerPresent() || conveyorStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 34, column: 4
                            conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 34, column: 4
                            S144=1;
                            active[1]=1;
                            ends[1]=1;
                            break RUN;
                          }
                          else {
                            switch(S139){
                              case 0 : 
                                if(conveyorStatus_o.isACK()){//sysj\controller.sysj line: 34, column: 4
                                  conveyorStatus_o.setVal("done");//sysj\controller.sysj line: 34, column: 4
                                  S139=1;
                                  if(!conveyorStatus_o.isACK()){//sysj\controller.sysj line: 34, column: 4
                                    conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 34, column: 4
                                    ends[1]=2;
                                    ;//sysj\controller.sysj line: 34, column: 4
                                    System.out.println("conveyor done");//sysj\controller.sysj line: 35, column: 4
                                    S45=3;
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
                                if(!conveyorStatus_o.isACK()){//sysj\controller.sysj line: 34, column: 4
                                  conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 34, column: 4
                                  ends[1]=2;
                                  ;//sysj\controller.sysj line: 34, column: 4
                                  System.out.println("conveyor done");//sysj\controller.sysj line: 35, column: 4
                                  S45=3;
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
                          S144=1;
                          S144=0;
                          if(!conveyorStatus_o.isPartnerPresent() || conveyorStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 34, column: 4
                            conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 34, column: 4
                            S144=1;
                            active[1]=1;
                            ends[1]=1;
                            break RUN;
                          }
                          else {
                            S139=0;
                            if(conveyorStatus_o.isACK()){//sysj\controller.sysj line: 34, column: 4
                              conveyorStatus_o.setVal("done");//sysj\controller.sysj line: 34, column: 4
                              S139=1;
                              if(!conveyorStatus_o.isACK()){//sysj\controller.sysj line: 34, column: 4
                                conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 34, column: 4
                                ends[1]=2;
                                ;//sysj\controller.sysj line: 34, column: 4
                                System.out.println("conveyor done");//sysj\controller.sysj line: 35, column: 4
                                S45=3;
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
                    
                    case 3 : 
                      S45=3;
                      S22=2;
                      active[1]=1;
                      ends[1]=1;
                      break RUN;
                    
                  }
                  break;
                
                case 1 : 
                  switch(S408){
                    case 0 : 
                      switch(S340){
                        case 0 : 
                          if(bottleLeftPos5.getprestatus()){//sysj\controller.sysj line: 41, column: 11
                            conveyorStatus_o.setPreempted();
                            System.out.println("bottle at pos 5 has moved away");//sysj\controller.sysj line: 45, column: 5
                            S340=1;
                            S347=0;
                            if(!conveyorStatus_o.isPartnerPresent() || conveyorStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 46, column: 5
                              conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 46, column: 5
                              S347=1;
                              active[1]=1;
                              ends[1]=1;
                              break RUN;
                            }
                            else {
                              S342=0;
                              if(conveyorStatus_o.isACK()){//sysj\controller.sysj line: 46, column: 5
                                conveyorStatus_o.setVal("done");//sysj\controller.sysj line: 46, column: 5
                                S342=1;
                                if(!conveyorStatus_o.isACK()){//sysj\controller.sysj line: 46, column: 5
                                  conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 46, column: 5
                                  ends[1]=2;
                                  ;//sysj\controller.sysj line: 46, column: 5
                                  System.out.println("conveyor idling");//sysj\controller.sysj line: 50, column: 4
                                  S408=1;
                                  S415=0;
                                  if(!conveyorStatus_o.isPartnerPresent() || conveyorStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 51, column: 4
                                    conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 51, column: 4
                                    S415=1;
                                    active[1]=1;
                                    ends[1]=1;
                                    break RUN;
                                  }
                                  else {
                                    S410=0;
                                    if(conveyorStatus_o.isACK()){//sysj\controller.sysj line: 51, column: 4
                                      conveyorStatus_o.setVal("idle");//sysj\controller.sysj line: 51, column: 4
                                      S410=1;
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
                            thread113392(tdone,ends);
                            thread113393(tdone,ends);
                            thread113394(tdone,ends);
                            int biggest113395 = 0;
                            if(ends[4]>=biggest113395){
                              biggest113395=ends[4];
                            }
                            if(ends[5]>=biggest113395){
                              biggest113395=ends[5];
                            }
                            if(ends[6]>=biggest113395){
                              biggest113395=ends[6];
                            }
                            if(biggest113395 == 1){
                              active[1]=1;
                              ends[1]=1;
                              break RUN;
                            }
                            //FINXME code
                            if(biggest113395 == 0){
                              System.out.println("bottle at pos 5 has moved away");//sysj\controller.sysj line: 45, column: 5
                              S340=1;
                              S347=0;
                              if(!conveyorStatus_o.isPartnerPresent() || conveyorStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 46, column: 5
                                conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 46, column: 5
                                S347=1;
                                active[1]=1;
                                ends[1]=1;
                                break RUN;
                              }
                              else {
                                S342=0;
                                if(conveyorStatus_o.isACK()){//sysj\controller.sysj line: 46, column: 5
                                  conveyorStatus_o.setVal("done");//sysj\controller.sysj line: 46, column: 5
                                  S342=1;
                                  if(!conveyorStatus_o.isACK()){//sysj\controller.sysj line: 46, column: 5
                                    conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 46, column: 5
                                    ends[1]=2;
                                    ;//sysj\controller.sysj line: 46, column: 5
                                    System.out.println("conveyor idling");//sysj\controller.sysj line: 50, column: 4
                                    S408=1;
                                    S415=0;
                                    if(!conveyorStatus_o.isPartnerPresent() || conveyorStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 51, column: 4
                                      conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 51, column: 4
                                      S415=1;
                                      active[1]=1;
                                      ends[1]=1;
                                      break RUN;
                                    }
                                    else {
                                      S410=0;
                                      if(conveyorStatus_o.isACK()){//sysj\controller.sysj line: 51, column: 4
                                        conveyorStatus_o.setVal("idle");//sysj\controller.sysj line: 51, column: 4
                                        S410=1;
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
                          switch(S347){
                            case 0 : 
                              if(!conveyorStatus_o.isPartnerPresent() || conveyorStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 46, column: 5
                                conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 46, column: 5
                                S347=1;
                                active[1]=1;
                                ends[1]=1;
                                break RUN;
                              }
                              else {
                                switch(S342){
                                  case 0 : 
                                    if(conveyorStatus_o.isACK()){//sysj\controller.sysj line: 46, column: 5
                                      conveyorStatus_o.setVal("done");//sysj\controller.sysj line: 46, column: 5
                                      S342=1;
                                      if(!conveyorStatus_o.isACK()){//sysj\controller.sysj line: 46, column: 5
                                        conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 46, column: 5
                                        ends[1]=2;
                                        ;//sysj\controller.sysj line: 46, column: 5
                                        System.out.println("conveyor idling");//sysj\controller.sysj line: 50, column: 4
                                        S408=1;
                                        S415=0;
                                        if(!conveyorStatus_o.isPartnerPresent() || conveyorStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 51, column: 4
                                          conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 51, column: 4
                                          S415=1;
                                          active[1]=1;
                                          ends[1]=1;
                                          break RUN;
                                        }
                                        else {
                                          S410=0;
                                          if(conveyorStatus_o.isACK()){//sysj\controller.sysj line: 51, column: 4
                                            conveyorStatus_o.setVal("idle");//sysj\controller.sysj line: 51, column: 4
                                            S410=1;
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
                                      S408=1;
                                      S415=0;
                                      if(!conveyorStatus_o.isPartnerPresent() || conveyorStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 51, column: 4
                                        conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 51, column: 4
                                        S415=1;
                                        active[1]=1;
                                        ends[1]=1;
                                        break RUN;
                                      }
                                      else {
                                        S410=0;
                                        if(conveyorStatus_o.isACK()){//sysj\controller.sysj line: 51, column: 4
                                          conveyorStatus_o.setVal("idle");//sysj\controller.sysj line: 51, column: 4
                                          S410=1;
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
                              S347=1;
                              S347=0;
                              if(!conveyorStatus_o.isPartnerPresent() || conveyorStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 46, column: 5
                                conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 46, column: 5
                                S347=1;
                                active[1]=1;
                                ends[1]=1;
                                break RUN;
                              }
                              else {
                                S342=0;
                                if(conveyorStatus_o.isACK()){//sysj\controller.sysj line: 46, column: 5
                                  conveyorStatus_o.setVal("done");//sysj\controller.sysj line: 46, column: 5
                                  S342=1;
                                  if(!conveyorStatus_o.isACK()){//sysj\controller.sysj line: 46, column: 5
                                    conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 46, column: 5
                                    ends[1]=2;
                                    ;//sysj\controller.sysj line: 46, column: 5
                                    System.out.println("conveyor idling");//sysj\controller.sysj line: 50, column: 4
                                    S408=1;
                                    S415=0;
                                    if(!conveyorStatus_o.isPartnerPresent() || conveyorStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 51, column: 4
                                      conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 51, column: 4
                                      S415=1;
                                      active[1]=1;
                                      ends[1]=1;
                                      break RUN;
                                    }
                                    else {
                                      S410=0;
                                      if(conveyorStatus_o.isACK()){//sysj\controller.sysj line: 51, column: 4
                                        conveyorStatus_o.setVal("idle");//sysj\controller.sysj line: 51, column: 4
                                        S410=1;
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
                      switch(S415){
                        case 0 : 
                          if(!conveyorStatus_o.isPartnerPresent() || conveyorStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 51, column: 4
                            conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 51, column: 4
                            S415=1;
                            active[1]=1;
                            ends[1]=1;
                            break RUN;
                          }
                          else {
                            switch(S410){
                              case 0 : 
                                if(conveyorStatus_o.isACK()){//sysj\controller.sysj line: 51, column: 4
                                  conveyorStatus_o.setVal("idle");//sysj\controller.sysj line: 51, column: 4
                                  S410=1;
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
                          S415=1;
                          S415=0;
                          if(!conveyorStatus_o.isPartnerPresent() || conveyorStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 51, column: 4
                            conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 51, column: 4
                            S415=1;
                            active[1]=1;
                            ends[1]=1;
                            break RUN;
                          }
                          else {
                            S410=0;
                            if(conveyorStatus_o.isACK()){//sysj\controller.sysj line: 51, column: 4
                              conveyorStatus_o.setVal("idle");//sysj\controller.sysj line: 51, column: 4
                              S410=1;
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
                      S541=0;
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
                              thread113396(tdone,ends);
                              thread113397(tdone,ends);
                              int biggest113398 = 0;
                              if(ends[2]>=biggest113398){
                                biggest113398=ends[2];
                              }
                              if(ends[3]>=biggest113398){
                                biggest113398=ends[3];
                              }
                              if(biggest113398 == 1){
                                active[1]=1;
                                ends[1]=1;
                                break RUN;
                              }
                            }
                            else {
                              System.out.println("Motor is off");//sysj\controller.sysj line: 33, column: 4
                              S45=2;
                              S144=0;
                              if(!conveyorStatus_o.isPartnerPresent() || conveyorStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 34, column: 4
                                conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 34, column: 4
                                S144=1;
                                active[1]=1;
                                ends[1]=1;
                                break RUN;
                              }
                              else {
                                S139=0;
                                if(conveyorStatus_o.isACK()){//sysj\controller.sysj line: 34, column: 4
                                  conveyorStatus_o.setVal("done");//sysj\controller.sysj line: 34, column: 4
                                  S139=1;
                                  if(!conveyorStatus_o.isACK()){//sysj\controller.sysj line: 34, column: 4
                                    conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 34, column: 4
                                    ends[1]=2;
                                    ;//sysj\controller.sysj line: 34, column: 4
                                    System.out.println("conveyor done");//sysj\controller.sysj line: 35, column: 4
                                    S45=3;
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
                      S541=1;
                      S408=0;
                      if(bottleAtPos5.getprestatus()){//sysj\controller.sysj line: 39, column: 12
                        System.out.println("Bottle at position 5 is going to be moved");//sysj\controller.sysj line: 40, column: 5
                        S340=0;
                        thread113399(tdone,ends);
                        thread113400(tdone,ends);
                        thread113401(tdone,ends);
                        int biggest113402 = 0;
                        if(ends[4]>=biggest113402){
                          biggest113402=ends[4];
                        }
                        if(ends[5]>=biggest113402){
                          biggest113402=ends[5];
                        }
                        if(ends[6]>=biggest113402){
                          biggest113402=ends[6];
                        }
                        if(biggest113402 == 1){
                          active[1]=1;
                          ends[1]=1;
                          break RUN;
                        }
                      }
                      else {
                        System.out.println("conveyor idling");//sysj\controller.sysj line: 50, column: 4
                        S408=1;
                        S415=0;
                        if(!conveyorStatus_o.isPartnerPresent() || conveyorStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 51, column: 4
                          conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 51, column: 4
                          S415=1;
                          active[1]=1;
                          ends[1]=1;
                          break RUN;
                        }
                        else {
                          S410=0;
                          if(conveyorStatus_o.isACK()){//sysj\controller.sysj line: 51, column: 4
                            conveyorStatus_o.setVal("idle");//sysj\controller.sysj line: 51, column: 4
                            S410=1;
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
