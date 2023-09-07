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
  private int S137 = 1;
  private int S29 = 1;
  private int S24 = 1;
  private int S49 = 1;
  private int S54 = 1;
  private int S144 = 1;
  private int S139 = 1;
  private int S540 = 1;
  private int S340 = 1;
  private int S274 = 1;
  private int S279 = 1;
  private int S303 = 1;
  private int S286 = 1;
  private int S281 = 1;
  private int S347 = 1;
  private int S342 = 1;
  private int S414 = 1;
  private int S409 = 1;
  
  private int[] ends = new int[23];
  private int[] tdone = new int[23];
  
  public void thread118489(int [] tdone, int [] ends){
        S303=1;
    S286=0;
    if(!conveyorStatus_o.isPartnerPresent() || conveyorStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 44, column: 10
      conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 44, column: 10
      S286=1;
      active[6]=1;
      ends[6]=1;
      tdone[6]=1;
    }
    else {
      S281=0;
      if(conveyorStatus_o.isACK()){//sysj\controller.sysj line: 44, column: 10
        conveyorStatus_o.setVal("busy");//sysj\controller.sysj line: 44, column: 10
        S281=1;
        if(!conveyorStatus_o.isACK()){//sysj\controller.sysj line: 44, column: 10
          conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 44, column: 10
          ends[6]=2;
          ;//sysj\controller.sysj line: 44, column: 10
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

  public void thread118488(int [] tdone, int [] ends){
        S279=1;
    motorPos5On.setPresent();//sysj\controller.sysj line: 43, column: 38
    currsigs.addElement(motorPos5On);
    active[5]=1;
    ends[5]=1;
    tdone[5]=1;
  }

  public void thread118487(int [] tdone, int [] ends){
        S274=1;
    motConveyorOnOff.setPresent();//sysj\controller.sysj line: 43, column: 7
    currsigs.addElement(motConveyorOnOff);
    active[4]=1;
    ends[4]=1;
    tdone[4]=1;
  }

  public void thread118485(int [] tdone, int [] ends){
        S54=1;
    motorPos1On.setPresent();//sysj\controller.sysj line: 30, column: 38
    currsigs.addElement(motorPos1On);
    active[3]=1;
    ends[3]=1;
    tdone[3]=1;
  }

  public void thread118484(int [] tdone, int [] ends){
        S49=1;
    motConveyorOnOff.setPresent();//sysj\controller.sysj line: 30, column: 7
    currsigs.addElement(motConveyorOnOff);
    active[2]=1;
    ends[2]=1;
    tdone[2]=1;
  }

  public void thread118482(int [] tdone, int [] ends){
        switch(S303){
      case 0 : 
        active[6]=0;
        ends[6]=0;
        tdone[6]=1;
        break;
      
      case 1 : 
        switch(S286){
          case 0 : 
            if(!conveyorStatus_o.isPartnerPresent() || conveyorStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 44, column: 10
              conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 44, column: 10
              S286=1;
              active[6]=1;
              ends[6]=1;
              tdone[6]=1;
            }
            else {
              switch(S281){
                case 0 : 
                  if(conveyorStatus_o.isACK()){//sysj\controller.sysj line: 44, column: 10
                    conveyorStatus_o.setVal("busy");//sysj\controller.sysj line: 44, column: 10
                    S281=1;
                    if(!conveyorStatus_o.isACK()){//sysj\controller.sysj line: 44, column: 10
                      conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 44, column: 10
                      ends[6]=2;
                      ;//sysj\controller.sysj line: 44, column: 10
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
                  if(!conveyorStatus_o.isACK()){//sysj\controller.sysj line: 44, column: 10
                    conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 44, column: 10
                    ends[6]=2;
                    ;//sysj\controller.sysj line: 44, column: 10
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
            if(!conveyorStatus_o.isPartnerPresent() || conveyorStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 44, column: 10
              conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 44, column: 10
              S286=1;
              active[6]=1;
              ends[6]=1;
              tdone[6]=1;
            }
            else {
              S281=0;
              if(conveyorStatus_o.isACK()){//sysj\controller.sysj line: 44, column: 10
                conveyorStatus_o.setVal("busy");//sysj\controller.sysj line: 44, column: 10
                S281=1;
                if(!conveyorStatus_o.isACK()){//sysj\controller.sysj line: 44, column: 10
                  conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 44, column: 10
                  ends[6]=2;
                  ;//sysj\controller.sysj line: 44, column: 10
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

  public void thread118481(int [] tdone, int [] ends){
        switch(S279){
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

  public void thread118480(int [] tdone, int [] ends){
        switch(S274){
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

  public void thread118478(int [] tdone, int [] ends){
        switch(S54){
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

  public void thread118477(int [] tdone, int [] ends){
        switch(S49){
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

  public void thread118475(int [] tdone, int [] ends){
        S54=1;
    motorPos1On.setPresent();//sysj\controller.sysj line: 30, column: 38
    currsigs.addElement(motorPos1On);
    active[3]=1;
    ends[3]=1;
    tdone[3]=1;
  }

  public void thread118474(int [] tdone, int [] ends){
        S49=1;
    motConveyorOnOff.setPresent();//sysj\controller.sysj line: 30, column: 7
    currsigs.addElement(motConveyorOnOff);
    active[2]=1;
    ends[2]=1;
    tdone[2]=1;
  }

  public void thread118472(int [] tdone, int [] ends){
        S54=1;
    motorPos1On.setPresent();//sysj\controller.sysj line: 30, column: 38
    currsigs.addElement(motorPos1On);
    active[3]=1;
    ends[3]=1;
    tdone[3]=1;
  }

  public void thread118471(int [] tdone, int [] ends){
        S49=1;
    motConveyorOnOff.setPresent();//sysj\controller.sysj line: 30, column: 7
    currsigs.addElement(motConveyorOnOff);
    active[2]=1;
    ends[2]=1;
    tdone[2]=1;
  }

  public void thread118469(int [] tdone, int [] ends){
        S54=1;
    motorPos1On.setPresent();//sysj\controller.sysj line: 30, column: 38
    currsigs.addElement(motorPos1On);
    active[3]=1;
    ends[3]=1;
    tdone[3]=1;
  }

  public void thread118468(int [] tdone, int [] ends){
        S49=1;
    motConveyorOnOff.setPresent();//sysj\controller.sysj line: 30, column: 7
    currsigs.addElement(motConveyorOnOff);
    active[2]=1;
    ends[2]=1;
    tdone[2]=1;
  }

  public void thread118466(int [] tdone, int [] ends){
        S303=1;
    S286=0;
    if(!conveyorStatus_o.isPartnerPresent() || conveyorStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 44, column: 10
      conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 44, column: 10
      S286=1;
      active[6]=1;
      ends[6]=1;
      tdone[6]=1;
    }
    else {
      S281=0;
      if(conveyorStatus_o.isACK()){//sysj\controller.sysj line: 44, column: 10
        conveyorStatus_o.setVal("busy");//sysj\controller.sysj line: 44, column: 10
        S281=1;
        if(!conveyorStatus_o.isACK()){//sysj\controller.sysj line: 44, column: 10
          conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 44, column: 10
          ends[6]=2;
          ;//sysj\controller.sysj line: 44, column: 10
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

  public void thread118465(int [] tdone, int [] ends){
        S279=1;
    motorPos5On.setPresent();//sysj\controller.sysj line: 43, column: 38
    currsigs.addElement(motorPos5On);
    active[5]=1;
    ends[5]=1;
    tdone[5]=1;
  }

  public void thread118464(int [] tdone, int [] ends){
        S274=1;
    motConveyorOnOff.setPresent();//sysj\controller.sysj line: 43, column: 7
    currsigs.addElement(motConveyorOnOff);
    active[4]=1;
    ends[4]=1;
    tdone[4]=1;
  }

  public void thread118462(int [] tdone, int [] ends){
        S54=1;
    motorPos1On.setPresent();//sysj\controller.sysj line: 30, column: 38
    currsigs.addElement(motorPos1On);
    active[3]=1;
    ends[3]=1;
    tdone[3]=1;
  }

  public void thread118461(int [] tdone, int [] ends){
        S49=1;
    motConveyorOnOff.setPresent();//sysj\controller.sysj line: 30, column: 7
    currsigs.addElement(motConveyorOnOff);
    active[2]=1;
    ends[2]=1;
    tdone[2]=1;
  }

  public void thread118459(int [] tdone, int [] ends){
        S303=1;
    S286=0;
    if(!conveyorStatus_o.isPartnerPresent() || conveyorStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 44, column: 10
      conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 44, column: 10
      S286=1;
      active[6]=1;
      ends[6]=1;
      tdone[6]=1;
    }
    else {
      S281=0;
      if(conveyorStatus_o.isACK()){//sysj\controller.sysj line: 44, column: 10
        conveyorStatus_o.setVal("busy");//sysj\controller.sysj line: 44, column: 10
        S281=1;
        if(!conveyorStatus_o.isACK()){//sysj\controller.sysj line: 44, column: 10
          conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 44, column: 10
          ends[6]=2;
          ;//sysj\controller.sysj line: 44, column: 10
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

  public void thread118458(int [] tdone, int [] ends){
        S279=1;
    motorPos5On.setPresent();//sysj\controller.sysj line: 43, column: 38
    currsigs.addElement(motorPos5On);
    active[5]=1;
    ends[5]=1;
    tdone[5]=1;
  }

  public void thread118457(int [] tdone, int [] ends){
        S274=1;
    motConveyorOnOff.setPresent();//sysj\controller.sysj line: 43, column: 7
    currsigs.addElement(motConveyorOnOff);
    active[4]=1;
    ends[4]=1;
    tdone[4]=1;
  }

  public void thread118455(int [] tdone, int [] ends){
        S54=1;
    motorPos1On.setPresent();//sysj\controller.sysj line: 30, column: 38
    currsigs.addElement(motorPos1On);
    active[3]=1;
    ends[3]=1;
    tdone[3]=1;
  }

  public void thread118454(int [] tdone, int [] ends){
        S49=1;
    motConveyorOnOff.setPresent();//sysj\controller.sysj line: 30, column: 7
    currsigs.addElement(motConveyorOnOff);
    active[2]=1;
    ends[2]=1;
    tdone[2]=1;
  }

  public void thread118452(int [] tdone, int [] ends){
        S303=1;
    S286=0;
    if(!conveyorStatus_o.isPartnerPresent() || conveyorStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 44, column: 10
      conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 44, column: 10
      S286=1;
      active[6]=1;
      ends[6]=1;
      tdone[6]=1;
    }
    else {
      S281=0;
      if(conveyorStatus_o.isACK()){//sysj\controller.sysj line: 44, column: 10
        conveyorStatus_o.setVal("busy");//sysj\controller.sysj line: 44, column: 10
        S281=1;
        if(!conveyorStatus_o.isACK()){//sysj\controller.sysj line: 44, column: 10
          conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 44, column: 10
          ends[6]=2;
          ;//sysj\controller.sysj line: 44, column: 10
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

  public void thread118451(int [] tdone, int [] ends){
        S279=1;
    motorPos5On.setPresent();//sysj\controller.sysj line: 43, column: 38
    currsigs.addElement(motorPos5On);
    active[5]=1;
    ends[5]=1;
    tdone[5]=1;
  }

  public void thread118450(int [] tdone, int [] ends){
        S274=1;
    motConveyorOnOff.setPresent();//sysj\controller.sysj line: 43, column: 7
    currsigs.addElement(motConveyorOnOff);
    active[4]=1;
    ends[4]=1;
    tdone[4]=1;
  }

  public void thread118448(int [] tdone, int [] ends){
        S54=1;
    motorPos1On.setPresent();//sysj\controller.sysj line: 30, column: 38
    currsigs.addElement(motorPos1On);
    active[3]=1;
    ends[3]=1;
    tdone[3]=1;
  }

  public void thread118447(int [] tdone, int [] ends){
        S49=1;
    motConveyorOnOff.setPresent();//sysj\controller.sysj line: 30, column: 7
    currsigs.addElement(motConveyorOnOff);
    active[2]=1;
    ends[2]=1;
    tdone[2]=1;
  }

  public void thread118445(int [] tdone, int [] ends){
        S303=1;
    S286=0;
    if(!conveyorStatus_o.isPartnerPresent() || conveyorStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 44, column: 10
      conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 44, column: 10
      S286=1;
      active[6]=1;
      ends[6]=1;
      tdone[6]=1;
    }
    else {
      S281=0;
      if(conveyorStatus_o.isACK()){//sysj\controller.sysj line: 44, column: 10
        conveyorStatus_o.setVal("busy");//sysj\controller.sysj line: 44, column: 10
        S281=1;
        if(!conveyorStatus_o.isACK()){//sysj\controller.sysj line: 44, column: 10
          conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 44, column: 10
          ends[6]=2;
          ;//sysj\controller.sysj line: 44, column: 10
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

  public void thread118444(int [] tdone, int [] ends){
        S279=1;
    motorPos5On.setPresent();//sysj\controller.sysj line: 43, column: 38
    currsigs.addElement(motorPos5On);
    active[5]=1;
    ends[5]=1;
    tdone[5]=1;
  }

  public void thread118443(int [] tdone, int [] ends){
        S274=1;
    motConveyorOnOff.setPresent();//sysj\controller.sysj line: 43, column: 7
    currsigs.addElement(motConveyorOnOff);
    active[4]=1;
    ends[4]=1;
    tdone[4]=1;
  }

  public void thread118441(int [] tdone, int [] ends){
        S54=1;
    motorPos1On.setPresent();//sysj\controller.sysj line: 30, column: 38
    currsigs.addElement(motorPos1On);
    active[3]=1;
    ends[3]=1;
    tdone[3]=1;
  }

  public void thread118440(int [] tdone, int [] ends){
        S49=1;
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
                  S137=0;
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
                        S137=1;
                        if(!bottleAtPos1.getprestatus()){//sysj\controller.sysj line: 26, column: 12
                          System.out.println("Motor is on");//sysj\controller.sysj line: 29, column: 6
                          thread118440(tdone,ends);
                          thread118441(tdone,ends);
                          int biggest118442 = 0;
                          if(ends[2]>=biggest118442){
                            biggest118442=ends[2];
                          }
                          if(ends[3]>=biggest118442){
                            biggest118442=ends[3];
                          }
                          if(biggest118442 == 1){
                            active[1]=1;
                            ends[1]=1;
                            break RUN;
                          }
                        }
                        else {
                          System.out.println("Motor is off");//sysj\controller.sysj line: 34, column: 4
                          S137=2;
                          S144=0;
                          if(!conveyorStatus_o.isPartnerPresent() || conveyorStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 35, column: 4
                            conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 35, column: 4
                            S144=1;
                            active[1]=1;
                            ends[1]=1;
                            break RUN;
                          }
                          else {
                            S139=0;
                            if(conveyorStatus_o.isACK()){//sysj\controller.sysj line: 35, column: 4
                              conveyorStatus_o.setVal("done");//sysj\controller.sysj line: 35, column: 4
                              S139=1;
                              if(!conveyorStatus_o.isACK()){//sysj\controller.sysj line: 35, column: 4
                                conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 35, column: 4
                                ends[1]=2;
                                ;//sysj\controller.sysj line: 35, column: 4
                                S137=3;
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
                  S540=0;
                  if(bottleAtPos5.getprestatus()){//sysj\controller.sysj line: 40, column: 12
                    System.out.println("Bottle at position 5 is going to be moved");//sysj\controller.sysj line: 41, column: 5
                    S340=0;
                    thread118443(tdone,ends);
                    thread118444(tdone,ends);
                    thread118445(tdone,ends);
                    int biggest118446 = 0;
                    if(ends[4]>=biggest118446){
                      biggest118446=ends[4];
                    }
                    if(ends[5]>=biggest118446){
                      biggest118446=ends[5];
                    }
                    if(ends[6]>=biggest118446){
                      biggest118446=ends[6];
                    }
                    if(biggest118446 == 1){
                      active[1]=1;
                      ends[1]=1;
                      break RUN;
                    }
                  }
                  else {
                    S540=1;
                    S414=0;
                    if(!conveyorStatus_o.isPartnerPresent() || conveyorStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 52, column: 4
                      conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 52, column: 4
                      S414=1;
                      active[1]=1;
                      ends[1]=1;
                      break RUN;
                    }
                    else {
                      S409=0;
                      if(conveyorStatus_o.isACK()){//sysj\controller.sysj line: 52, column: 4
                        conveyorStatus_o.setVal("idle");//sysj\controller.sysj line: 52, column: 4
                        S409=1;
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
                              S541=0;
                              S137=0;
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
                                    S137=1;
                                    if(!bottleAtPos1.getprestatus()){//sysj\controller.sysj line: 26, column: 12
                                      System.out.println("Motor is on");//sysj\controller.sysj line: 29, column: 6
                                      thread118447(tdone,ends);
                                      thread118448(tdone,ends);
                                      int biggest118449 = 0;
                                      if(ends[2]>=biggest118449){
                                        biggest118449=ends[2];
                                      }
                                      if(ends[3]>=biggest118449){
                                        biggest118449=ends[3];
                                      }
                                      if(biggest118449 == 1){
                                        active[1]=1;
                                        ends[1]=1;
                                        break RUN;
                                      }
                                    }
                                    else {
                                      System.out.println("Motor is off");//sysj\controller.sysj line: 34, column: 4
                                      S137=2;
                                      S144=0;
                                      if(!conveyorStatus_o.isPartnerPresent() || conveyorStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 35, column: 4
                                        conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 35, column: 4
                                        S144=1;
                                        active[1]=1;
                                        ends[1]=1;
                                        break RUN;
                                      }
                                      else {
                                        S139=0;
                                        if(conveyorStatus_o.isACK()){//sysj\controller.sysj line: 35, column: 4
                                          conveyorStatus_o.setVal("done");//sysj\controller.sysj line: 35, column: 4
                                          S139=1;
                                          if(!conveyorStatus_o.isACK()){//sysj\controller.sysj line: 35, column: 4
                                            conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 35, column: 4
                                            ends[1]=2;
                                            ;//sysj\controller.sysj line: 35, column: 4
                                            S137=3;
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
                              S540=0;
                              if(bottleAtPos5.getprestatus()){//sysj\controller.sysj line: 40, column: 12
                                System.out.println("Bottle at position 5 is going to be moved");//sysj\controller.sysj line: 41, column: 5
                                S340=0;
                                thread118450(tdone,ends);
                                thread118451(tdone,ends);
                                thread118452(tdone,ends);
                                int biggest118453 = 0;
                                if(ends[4]>=biggest118453){
                                  biggest118453=ends[4];
                                }
                                if(ends[5]>=biggest118453){
                                  biggest118453=ends[5];
                                }
                                if(ends[6]>=biggest118453){
                                  biggest118453=ends[6];
                                }
                                if(biggest118453 == 1){
                                  active[1]=1;
                                  ends[1]=1;
                                  break RUN;
                                }
                              }
                              else {
                                S540=1;
                                S414=0;
                                if(!conveyorStatus_o.isPartnerPresent() || conveyorStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 52, column: 4
                                  conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 52, column: 4
                                  S414=1;
                                  active[1]=1;
                                  ends[1]=1;
                                  break RUN;
                                }
                                else {
                                  S409=0;
                                  if(conveyorStatus_o.isACK()){//sysj\controller.sysj line: 52, column: 4
                                    conveyorStatus_o.setVal("idle");//sysj\controller.sysj line: 52, column: 4
                                    S409=1;
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
                            S541=0;
                            S137=0;
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
                                  S137=1;
                                  if(!bottleAtPos1.getprestatus()){//sysj\controller.sysj line: 26, column: 12
                                    System.out.println("Motor is on");//sysj\controller.sysj line: 29, column: 6
                                    thread118454(tdone,ends);
                                    thread118455(tdone,ends);
                                    int biggest118456 = 0;
                                    if(ends[2]>=biggest118456){
                                      biggest118456=ends[2];
                                    }
                                    if(ends[3]>=biggest118456){
                                      biggest118456=ends[3];
                                    }
                                    if(biggest118456 == 1){
                                      active[1]=1;
                                      ends[1]=1;
                                      break RUN;
                                    }
                                  }
                                  else {
                                    System.out.println("Motor is off");//sysj\controller.sysj line: 34, column: 4
                                    S137=2;
                                    S144=0;
                                    if(!conveyorStatus_o.isPartnerPresent() || conveyorStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 35, column: 4
                                      conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 35, column: 4
                                      S144=1;
                                      active[1]=1;
                                      ends[1]=1;
                                      break RUN;
                                    }
                                    else {
                                      S139=0;
                                      if(conveyorStatus_o.isACK()){//sysj\controller.sysj line: 35, column: 4
                                        conveyorStatus_o.setVal("done");//sysj\controller.sysj line: 35, column: 4
                                        S139=1;
                                        if(!conveyorStatus_o.isACK()){//sysj\controller.sysj line: 35, column: 4
                                          conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 35, column: 4
                                          ends[1]=2;
                                          ;//sysj\controller.sysj line: 35, column: 4
                                          S137=3;
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
                            S540=0;
                            if(bottleAtPos5.getprestatus()){//sysj\controller.sysj line: 40, column: 12
                              System.out.println("Bottle at position 5 is going to be moved");//sysj\controller.sysj line: 41, column: 5
                              S340=0;
                              thread118457(tdone,ends);
                              thread118458(tdone,ends);
                              thread118459(tdone,ends);
                              int biggest118460 = 0;
                              if(ends[4]>=biggest118460){
                                biggest118460=ends[4];
                              }
                              if(ends[5]>=biggest118460){
                                biggest118460=ends[5];
                              }
                              if(ends[6]>=biggest118460){
                                biggest118460=ends[6];
                              }
                              if(biggest118460 == 1){
                                active[1]=1;
                                ends[1]=1;
                                break RUN;
                              }
                            }
                            else {
                              S540=1;
                              S414=0;
                              if(!conveyorStatus_o.isPartnerPresent() || conveyorStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 52, column: 4
                                conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 52, column: 4
                                S414=1;
                                active[1]=1;
                                ends[1]=1;
                                break RUN;
                              }
                              else {
                                S409=0;
                                if(conveyorStatus_o.isACK()){//sysj\controller.sysj line: 52, column: 4
                                  conveyorStatus_o.setVal("idle");//sysj\controller.sysj line: 52, column: 4
                                  S409=1;
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
                          S541=0;
                          S137=0;
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
                                S137=1;
                                if(!bottleAtPos1.getprestatus()){//sysj\controller.sysj line: 26, column: 12
                                  System.out.println("Motor is on");//sysj\controller.sysj line: 29, column: 6
                                  thread118461(tdone,ends);
                                  thread118462(tdone,ends);
                                  int biggest118463 = 0;
                                  if(ends[2]>=biggest118463){
                                    biggest118463=ends[2];
                                  }
                                  if(ends[3]>=biggest118463){
                                    biggest118463=ends[3];
                                  }
                                  if(biggest118463 == 1){
                                    active[1]=1;
                                    ends[1]=1;
                                    break RUN;
                                  }
                                }
                                else {
                                  System.out.println("Motor is off");//sysj\controller.sysj line: 34, column: 4
                                  S137=2;
                                  S144=0;
                                  if(!conveyorStatus_o.isPartnerPresent() || conveyorStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 35, column: 4
                                    conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 35, column: 4
                                    S144=1;
                                    active[1]=1;
                                    ends[1]=1;
                                    break RUN;
                                  }
                                  else {
                                    S139=0;
                                    if(conveyorStatus_o.isACK()){//sysj\controller.sysj line: 35, column: 4
                                      conveyorStatus_o.setVal("done");//sysj\controller.sysj line: 35, column: 4
                                      S139=1;
                                      if(!conveyorStatus_o.isACK()){//sysj\controller.sysj line: 35, column: 4
                                        conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 35, column: 4
                                        ends[1]=2;
                                        ;//sysj\controller.sysj line: 35, column: 4
                                        S137=3;
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
                          S540=0;
                          if(bottleAtPos5.getprestatus()){//sysj\controller.sysj line: 40, column: 12
                            System.out.println("Bottle at position 5 is going to be moved");//sysj\controller.sysj line: 41, column: 5
                            S340=0;
                            thread118464(tdone,ends);
                            thread118465(tdone,ends);
                            thread118466(tdone,ends);
                            int biggest118467 = 0;
                            if(ends[4]>=biggest118467){
                              biggest118467=ends[4];
                            }
                            if(ends[5]>=biggest118467){
                              biggest118467=ends[5];
                            }
                            if(ends[6]>=biggest118467){
                              biggest118467=ends[6];
                            }
                            if(biggest118467 == 1){
                              active[1]=1;
                              ends[1]=1;
                              break RUN;
                            }
                          }
                          else {
                            S540=1;
                            S414=0;
                            if(!conveyorStatus_o.isPartnerPresent() || conveyorStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 52, column: 4
                              conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 52, column: 4
                              S414=1;
                              active[1]=1;
                              ends[1]=1;
                              break RUN;
                            }
                            else {
                              S409=0;
                              if(conveyorStatus_o.isACK()){//sysj\controller.sysj line: 52, column: 4
                                conveyorStatus_o.setVal("idle");//sysj\controller.sysj line: 52, column: 4
                                S409=1;
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
              switch(S541){
                case 0 : 
                  switch(S137){
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
                                    S137=1;
                                    if(!bottleAtPos1.getprestatus()){//sysj\controller.sysj line: 26, column: 12
                                      System.out.println("Motor is on");//sysj\controller.sysj line: 29, column: 6
                                      thread118468(tdone,ends);
                                      thread118469(tdone,ends);
                                      int biggest118470 = 0;
                                      if(ends[2]>=biggest118470){
                                        biggest118470=ends[2];
                                      }
                                      if(ends[3]>=biggest118470){
                                        biggest118470=ends[3];
                                      }
                                      if(biggest118470 == 1){
                                        active[1]=1;
                                        ends[1]=1;
                                        break RUN;
                                      }
                                    }
                                    else {
                                      System.out.println("Motor is off");//sysj\controller.sysj line: 34, column: 4
                                      S137=2;
                                      S144=0;
                                      if(!conveyorStatus_o.isPartnerPresent() || conveyorStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 35, column: 4
                                        conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 35, column: 4
                                        S144=1;
                                        active[1]=1;
                                        ends[1]=1;
                                        break RUN;
                                      }
                                      else {
                                        S139=0;
                                        if(conveyorStatus_o.isACK()){//sysj\controller.sysj line: 35, column: 4
                                          conveyorStatus_o.setVal("done");//sysj\controller.sysj line: 35, column: 4
                                          S139=1;
                                          if(!conveyorStatus_o.isACK()){//sysj\controller.sysj line: 35, column: 4
                                            conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 35, column: 4
                                            ends[1]=2;
                                            ;//sysj\controller.sysj line: 35, column: 4
                                            S137=3;
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
                                  S137=1;
                                  if(!bottleAtPos1.getprestatus()){//sysj\controller.sysj line: 26, column: 12
                                    System.out.println("Motor is on");//sysj\controller.sysj line: 29, column: 6
                                    thread118471(tdone,ends);
                                    thread118472(tdone,ends);
                                    int biggest118473 = 0;
                                    if(ends[2]>=biggest118473){
                                      biggest118473=ends[2];
                                    }
                                    if(ends[3]>=biggest118473){
                                      biggest118473=ends[3];
                                    }
                                    if(biggest118473 == 1){
                                      active[1]=1;
                                      ends[1]=1;
                                      break RUN;
                                    }
                                  }
                                  else {
                                    System.out.println("Motor is off");//sysj\controller.sysj line: 34, column: 4
                                    S137=2;
                                    S144=0;
                                    if(!conveyorStatus_o.isPartnerPresent() || conveyorStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 35, column: 4
                                      conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 35, column: 4
                                      S144=1;
                                      active[1]=1;
                                      ends[1]=1;
                                      break RUN;
                                    }
                                    else {
                                      S139=0;
                                      if(conveyorStatus_o.isACK()){//sysj\controller.sysj line: 35, column: 4
                                        conveyorStatus_o.setVal("done");//sysj\controller.sysj line: 35, column: 4
                                        S139=1;
                                        if(!conveyorStatus_o.isACK()){//sysj\controller.sysj line: 35, column: 4
                                          conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 35, column: 4
                                          ends[1]=2;
                                          ;//sysj\controller.sysj line: 35, column: 4
                                          S137=3;
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
                                S137=1;
                                if(!bottleAtPos1.getprestatus()){//sysj\controller.sysj line: 26, column: 12
                                  System.out.println("Motor is on");//sysj\controller.sysj line: 29, column: 6
                                  thread118474(tdone,ends);
                                  thread118475(tdone,ends);
                                  int biggest118476 = 0;
                                  if(ends[2]>=biggest118476){
                                    biggest118476=ends[2];
                                  }
                                  if(ends[3]>=biggest118476){
                                    biggest118476=ends[3];
                                  }
                                  if(biggest118476 == 1){
                                    active[1]=1;
                                    ends[1]=1;
                                    break RUN;
                                  }
                                }
                                else {
                                  System.out.println("Motor is off");//sysj\controller.sysj line: 34, column: 4
                                  S137=2;
                                  S144=0;
                                  if(!conveyorStatus_o.isPartnerPresent() || conveyorStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 35, column: 4
                                    conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 35, column: 4
                                    S144=1;
                                    active[1]=1;
                                    ends[1]=1;
                                    break RUN;
                                  }
                                  else {
                                    S139=0;
                                    if(conveyorStatus_o.isACK()){//sysj\controller.sysj line: 35, column: 4
                                      conveyorStatus_o.setVal("done");//sysj\controller.sysj line: 35, column: 4
                                      S139=1;
                                      if(!conveyorStatus_o.isACK()){//sysj\controller.sysj line: 35, column: 4
                                        conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 35, column: 4
                                        ends[1]=2;
                                        ;//sysj\controller.sysj line: 35, column: 4
                                        S137=3;
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
                      if(bottleAtPos1.getprestatus()){//sysj\controller.sysj line: 28, column: 11
                        System.out.println("Motor is off");//sysj\controller.sysj line: 34, column: 4
                        S137=2;
                        S144=0;
                        if(!conveyorStatus_o.isPartnerPresent() || conveyorStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 35, column: 4
                          conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 35, column: 4
                          S144=1;
                          active[1]=1;
                          ends[1]=1;
                          break RUN;
                        }
                        else {
                          S139=0;
                          if(conveyorStatus_o.isACK()){//sysj\controller.sysj line: 35, column: 4
                            conveyorStatus_o.setVal("done");//sysj\controller.sysj line: 35, column: 4
                            S139=1;
                            if(!conveyorStatus_o.isACK()){//sysj\controller.sysj line: 35, column: 4
                              conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 35, column: 4
                              ends[1]=2;
                              ;//sysj\controller.sysj line: 35, column: 4
                              S137=3;
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
                        thread118477(tdone,ends);
                        thread118478(tdone,ends);
                        int biggest118479 = 0;
                        if(ends[2]>=biggest118479){
                          biggest118479=ends[2];
                        }
                        if(ends[3]>=biggest118479){
                          biggest118479=ends[3];
                        }
                        if(biggest118479 == 1){
                          active[1]=1;
                          ends[1]=1;
                          break RUN;
                        }
                        //FINXME code
                        if(biggest118479 == 0){
                          System.out.println("Motor is off");//sysj\controller.sysj line: 34, column: 4
                          S137=2;
                          S144=0;
                          if(!conveyorStatus_o.isPartnerPresent() || conveyorStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 35, column: 4
                            conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 35, column: 4
                            S144=1;
                            active[1]=1;
                            ends[1]=1;
                            break RUN;
                          }
                          else {
                            S139=0;
                            if(conveyorStatus_o.isACK()){//sysj\controller.sysj line: 35, column: 4
                              conveyorStatus_o.setVal("done");//sysj\controller.sysj line: 35, column: 4
                              S139=1;
                              if(!conveyorStatus_o.isACK()){//sysj\controller.sysj line: 35, column: 4
                                conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 35, column: 4
                                ends[1]=2;
                                ;//sysj\controller.sysj line: 35, column: 4
                                S137=3;
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
                          if(!conveyorStatus_o.isPartnerPresent() || conveyorStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 35, column: 4
                            conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 35, column: 4
                            S144=1;
                            active[1]=1;
                            ends[1]=1;
                            break RUN;
                          }
                          else {
                            switch(S139){
                              case 0 : 
                                if(conveyorStatus_o.isACK()){//sysj\controller.sysj line: 35, column: 4
                                  conveyorStatus_o.setVal("done");//sysj\controller.sysj line: 35, column: 4
                                  S139=1;
                                  if(!conveyorStatus_o.isACK()){//sysj\controller.sysj line: 35, column: 4
                                    conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 35, column: 4
                                    ends[1]=2;
                                    ;//sysj\controller.sysj line: 35, column: 4
                                    S137=3;
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
                                  S137=3;
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
                          if(!conveyorStatus_o.isPartnerPresent() || conveyorStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 35, column: 4
                            conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 35, column: 4
                            S144=1;
                            active[1]=1;
                            ends[1]=1;
                            break RUN;
                          }
                          else {
                            S139=0;
                            if(conveyorStatus_o.isACK()){//sysj\controller.sysj line: 35, column: 4
                              conveyorStatus_o.setVal("done");//sysj\controller.sysj line: 35, column: 4
                              S139=1;
                              if(!conveyorStatus_o.isACK()){//sysj\controller.sysj line: 35, column: 4
                                conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 35, column: 4
                                ends[1]=2;
                                ;//sysj\controller.sysj line: 35, column: 4
                                S137=3;
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
                      S137=3;
                      S22=2;
                      active[1]=1;
                      ends[1]=1;
                      break RUN;
                    
                  }
                  break;
                
                case 1 : 
                  switch(S540){
                    case 0 : 
                      switch(S340){
                        case 0 : 
                          if(bottleLeftPos5.getprestatus()){//sysj\controller.sysj line: 42, column: 11
                            conveyorStatus_o.setPreempted();
                            System.out.println("bottle at pos 5 has moved away");//sysj\controller.sysj line: 46, column: 5
                            S340=1;
                            S347=0;
                            if(!conveyorStatus_o.isPartnerPresent() || conveyorStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 47, column: 5
                              conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 47, column: 5
                              S347=1;
                              active[1]=1;
                              ends[1]=1;
                              break RUN;
                            }
                            else {
                              S342=0;
                              if(conveyorStatus_o.isACK()){//sysj\controller.sysj line: 47, column: 5
                                conveyorStatus_o.setVal("done");//sysj\controller.sysj line: 47, column: 5
                                S342=1;
                                if(!conveyorStatus_o.isACK()){//sysj\controller.sysj line: 47, column: 5
                                  conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 47, column: 5
                                  ends[1]=2;
                                  ;//sysj\controller.sysj line: 47, column: 5
                                  S540=1;
                                  S414=0;
                                  if(!conveyorStatus_o.isPartnerPresent() || conveyorStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 52, column: 4
                                    conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 52, column: 4
                                    S414=1;
                                    active[1]=1;
                                    ends[1]=1;
                                    break RUN;
                                  }
                                  else {
                                    S409=0;
                                    if(conveyorStatus_o.isACK()){//sysj\controller.sysj line: 52, column: 4
                                      conveyorStatus_o.setVal("idle");//sysj\controller.sysj line: 52, column: 4
                                      S409=1;
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
                            thread118480(tdone,ends);
                            thread118481(tdone,ends);
                            thread118482(tdone,ends);
                            int biggest118483 = 0;
                            if(ends[4]>=biggest118483){
                              biggest118483=ends[4];
                            }
                            if(ends[5]>=biggest118483){
                              biggest118483=ends[5];
                            }
                            if(ends[6]>=biggest118483){
                              biggest118483=ends[6];
                            }
                            if(biggest118483 == 1){
                              active[1]=1;
                              ends[1]=1;
                              break RUN;
                            }
                            //FINXME code
                            if(biggest118483 == 0){
                              System.out.println("bottle at pos 5 has moved away");//sysj\controller.sysj line: 46, column: 5
                              S340=1;
                              S347=0;
                              if(!conveyorStatus_o.isPartnerPresent() || conveyorStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 47, column: 5
                                conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 47, column: 5
                                S347=1;
                                active[1]=1;
                                ends[1]=1;
                                break RUN;
                              }
                              else {
                                S342=0;
                                if(conveyorStatus_o.isACK()){//sysj\controller.sysj line: 47, column: 5
                                  conveyorStatus_o.setVal("done");//sysj\controller.sysj line: 47, column: 5
                                  S342=1;
                                  if(!conveyorStatus_o.isACK()){//sysj\controller.sysj line: 47, column: 5
                                    conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 47, column: 5
                                    ends[1]=2;
                                    ;//sysj\controller.sysj line: 47, column: 5
                                    S540=1;
                                    S414=0;
                                    if(!conveyorStatus_o.isPartnerPresent() || conveyorStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 52, column: 4
                                      conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 52, column: 4
                                      S414=1;
                                      active[1]=1;
                                      ends[1]=1;
                                      break RUN;
                                    }
                                    else {
                                      S409=0;
                                      if(conveyorStatus_o.isACK()){//sysj\controller.sysj line: 52, column: 4
                                        conveyorStatus_o.setVal("idle");//sysj\controller.sysj line: 52, column: 4
                                        S409=1;
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
                          switch(S347){
                            case 0 : 
                              if(!conveyorStatus_o.isPartnerPresent() || conveyorStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 47, column: 5
                                conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 47, column: 5
                                S347=1;
                                active[1]=1;
                                ends[1]=1;
                                break RUN;
                              }
                              else {
                                switch(S342){
                                  case 0 : 
                                    if(conveyorStatus_o.isACK()){//sysj\controller.sysj line: 47, column: 5
                                      conveyorStatus_o.setVal("done");//sysj\controller.sysj line: 47, column: 5
                                      S342=1;
                                      if(!conveyorStatus_o.isACK()){//sysj\controller.sysj line: 47, column: 5
                                        conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 47, column: 5
                                        ends[1]=2;
                                        ;//sysj\controller.sysj line: 47, column: 5
                                        S540=1;
                                        S414=0;
                                        if(!conveyorStatus_o.isPartnerPresent() || conveyorStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 52, column: 4
                                          conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 52, column: 4
                                          S414=1;
                                          active[1]=1;
                                          ends[1]=1;
                                          break RUN;
                                        }
                                        else {
                                          S409=0;
                                          if(conveyorStatus_o.isACK()){//sysj\controller.sysj line: 52, column: 4
                                            conveyorStatus_o.setVal("idle");//sysj\controller.sysj line: 52, column: 4
                                            S409=1;
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
                                      S540=1;
                                      S414=0;
                                      if(!conveyorStatus_o.isPartnerPresent() || conveyorStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 52, column: 4
                                        conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 52, column: 4
                                        S414=1;
                                        active[1]=1;
                                        ends[1]=1;
                                        break RUN;
                                      }
                                      else {
                                        S409=0;
                                        if(conveyorStatus_o.isACK()){//sysj\controller.sysj line: 52, column: 4
                                          conveyorStatus_o.setVal("idle");//sysj\controller.sysj line: 52, column: 4
                                          S409=1;
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
                              S347=1;
                              S347=0;
                              if(!conveyorStatus_o.isPartnerPresent() || conveyorStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 47, column: 5
                                conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 47, column: 5
                                S347=1;
                                active[1]=1;
                                ends[1]=1;
                                break RUN;
                              }
                              else {
                                S342=0;
                                if(conveyorStatus_o.isACK()){//sysj\controller.sysj line: 47, column: 5
                                  conveyorStatus_o.setVal("done");//sysj\controller.sysj line: 47, column: 5
                                  S342=1;
                                  if(!conveyorStatus_o.isACK()){//sysj\controller.sysj line: 47, column: 5
                                    conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 47, column: 5
                                    ends[1]=2;
                                    ;//sysj\controller.sysj line: 47, column: 5
                                    S540=1;
                                    S414=0;
                                    if(!conveyorStatus_o.isPartnerPresent() || conveyorStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 52, column: 4
                                      conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 52, column: 4
                                      S414=1;
                                      active[1]=1;
                                      ends[1]=1;
                                      break RUN;
                                    }
                                    else {
                                      S409=0;
                                      if(conveyorStatus_o.isACK()){//sysj\controller.sysj line: 52, column: 4
                                        conveyorStatus_o.setVal("idle");//sysj\controller.sysj line: 52, column: 4
                                        S409=1;
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
                      switch(S414){
                        case 0 : 
                          if(!conveyorStatus_o.isPartnerPresent() || conveyorStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 52, column: 4
                            conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 52, column: 4
                            S414=1;
                            active[1]=1;
                            ends[1]=1;
                            break RUN;
                          }
                          else {
                            switch(S409){
                              case 0 : 
                                if(conveyorStatus_o.isACK()){//sysj\controller.sysj line: 52, column: 4
                                  conveyorStatus_o.setVal("idle");//sysj\controller.sysj line: 52, column: 4
                                  S409=1;
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
                          S414=1;
                          S414=0;
                          if(!conveyorStatus_o.isPartnerPresent() || conveyorStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 52, column: 4
                            conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 52, column: 4
                            S414=1;
                            active[1]=1;
                            ends[1]=1;
                            break RUN;
                          }
                          else {
                            S409=0;
                            if(conveyorStatus_o.isACK()){//sysj\controller.sysj line: 52, column: 4
                              conveyorStatus_o.setVal("idle");//sysj\controller.sysj line: 52, column: 4
                              S409=1;
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
                      S541=0;
                      S137=0;
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
                            S137=1;
                            if(!bottleAtPos1.getprestatus()){//sysj\controller.sysj line: 26, column: 12
                              System.out.println("Motor is on");//sysj\controller.sysj line: 29, column: 6
                              thread118484(tdone,ends);
                              thread118485(tdone,ends);
                              int biggest118486 = 0;
                              if(ends[2]>=biggest118486){
                                biggest118486=ends[2];
                              }
                              if(ends[3]>=biggest118486){
                                biggest118486=ends[3];
                              }
                              if(biggest118486 == 1){
                                active[1]=1;
                                ends[1]=1;
                                break RUN;
                              }
                            }
                            else {
                              System.out.println("Motor is off");//sysj\controller.sysj line: 34, column: 4
                              S137=2;
                              S144=0;
                              if(!conveyorStatus_o.isPartnerPresent() || conveyorStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 35, column: 4
                                conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 35, column: 4
                                S144=1;
                                active[1]=1;
                                ends[1]=1;
                                break RUN;
                              }
                              else {
                                S139=0;
                                if(conveyorStatus_o.isACK()){//sysj\controller.sysj line: 35, column: 4
                                  conveyorStatus_o.setVal("done");//sysj\controller.sysj line: 35, column: 4
                                  S139=1;
                                  if(!conveyorStatus_o.isACK()){//sysj\controller.sysj line: 35, column: 4
                                    conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 35, column: 4
                                    ends[1]=2;
                                    ;//sysj\controller.sysj line: 35, column: 4
                                    S137=3;
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
                      S540=0;
                      if(bottleAtPos5.getprestatus()){//sysj\controller.sysj line: 40, column: 12
                        System.out.println("Bottle at position 5 is going to be moved");//sysj\controller.sysj line: 41, column: 5
                        S340=0;
                        thread118487(tdone,ends);
                        thread118488(tdone,ends);
                        thread118489(tdone,ends);
                        int biggest118490 = 0;
                        if(ends[4]>=biggest118490){
                          biggest118490=ends[4];
                        }
                        if(ends[5]>=biggest118490){
                          biggest118490=ends[5];
                        }
                        if(ends[6]>=biggest118490){
                          biggest118490=ends[6];
                        }
                        if(biggest118490 == 1){
                          active[1]=1;
                          ends[1]=1;
                          break RUN;
                        }
                      }
                      else {
                        S540=1;
                        S414=0;
                        if(!conveyorStatus_o.isPartnerPresent() || conveyorStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 52, column: 4
                          conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 52, column: 4
                          S414=1;
                          active[1]=1;
                          ends[1]=1;
                          break RUN;
                        }
                        else {
                          S409=0;
                          if(conveyorStatus_o.isACK()){//sysj\controller.sysj line: 52, column: 4
                            conveyorStatus_o.setVal("idle");//sysj\controller.sysj line: 52, column: 4
                            S409=1;
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
