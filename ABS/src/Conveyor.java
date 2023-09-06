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
  private int S7402 = 1;
  private int S22 = 1;
  private int S6 = 1;
  private int S1 = 1;
  private int S633 = 1;
  private int S45 = 1;
  private int S29 = 1;
  private int S24 = 1;
  private int S50 = 1;
  private int S55 = 1;
  private int S236 = 1;
  private int S231 = 1;
  private int S500 = 1;
  private int S432 = 1;
  private int S366 = 1;
  private int S371 = 1;
  private int S395 = 1;
  private int S378 = 1;
  private int S373 = 1;
  private int S439 = 1;
  private int S434 = 1;
  private int S507 = 1;
  private int S502 = 1;
  
  private int[] ends = new int[23];
  private int[] tdone = new int[23];
  
  public void thread116551(int [] tdone, int [] ends){
        S395=1;
    S378=0;
    if(!conveyorStatus_o.isPartnerPresent() || conveyorStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 44, column: 10
      conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 44, column: 10
      S378=1;
      active[6]=1;
      ends[6]=1;
      tdone[6]=1;
    }
    else {
      S373=0;
      if(conveyorStatus_o.isACK()){//sysj\controller.sysj line: 44, column: 10
        conveyorStatus_o.setVal("busy");//sysj\controller.sysj line: 44, column: 10
        S373=1;
        if(!conveyorStatus_o.isACK()){//sysj\controller.sysj line: 44, column: 10
          conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 44, column: 10
          ends[6]=2;
          ;//sysj\controller.sysj line: 44, column: 10
          S395=0;
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

  public void thread116550(int [] tdone, int [] ends){
        S371=1;
    motorPos5On.setPresent();//sysj\controller.sysj line: 43, column: 38
    currsigs.addElement(motorPos5On);
    active[5]=1;
    ends[5]=1;
    tdone[5]=1;
  }

  public void thread116549(int [] tdone, int [] ends){
        S366=1;
    motConveyorOnOff.setPresent();//sysj\controller.sysj line: 43, column: 7
    currsigs.addElement(motConveyorOnOff);
    active[4]=1;
    ends[4]=1;
    tdone[4]=1;
  }

  public void thread116547(int [] tdone, int [] ends){
        S55=1;
    motorPos1On.setPresent();//sysj\controller.sysj line: 30, column: 38
    currsigs.addElement(motorPos1On);
    active[3]=1;
    ends[3]=1;
    tdone[3]=1;
  }

  public void thread116546(int [] tdone, int [] ends){
        S50=1;
    motConveyorOnOff.setPresent();//sysj\controller.sysj line: 30, column: 7
    currsigs.addElement(motConveyorOnOff);
    active[2]=1;
    ends[2]=1;
    tdone[2]=1;
  }

  public void thread116544(int [] tdone, int [] ends){
        switch(S395){
      case 0 : 
        active[6]=0;
        ends[6]=0;
        tdone[6]=1;
        break;
      
      case 1 : 
        switch(S378){
          case 0 : 
            if(!conveyorStatus_o.isPartnerPresent() || conveyorStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 44, column: 10
              conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 44, column: 10
              S378=1;
              active[6]=1;
              ends[6]=1;
              tdone[6]=1;
            }
            else {
              switch(S373){
                case 0 : 
                  if(conveyorStatus_o.isACK()){//sysj\controller.sysj line: 44, column: 10
                    conveyorStatus_o.setVal("busy");//sysj\controller.sysj line: 44, column: 10
                    S373=1;
                    if(!conveyorStatus_o.isACK()){//sysj\controller.sysj line: 44, column: 10
                      conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 44, column: 10
                      ends[6]=2;
                      ;//sysj\controller.sysj line: 44, column: 10
                      S395=0;
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
                    S395=0;
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
            S378=1;
            S378=0;
            if(!conveyorStatus_o.isPartnerPresent() || conveyorStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 44, column: 10
              conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 44, column: 10
              S378=1;
              active[6]=1;
              ends[6]=1;
              tdone[6]=1;
            }
            else {
              S373=0;
              if(conveyorStatus_o.isACK()){//sysj\controller.sysj line: 44, column: 10
                conveyorStatus_o.setVal("busy");//sysj\controller.sysj line: 44, column: 10
                S373=1;
                if(!conveyorStatus_o.isACK()){//sysj\controller.sysj line: 44, column: 10
                  conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 44, column: 10
                  ends[6]=2;
                  ;//sysj\controller.sysj line: 44, column: 10
                  S395=0;
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

  public void thread116543(int [] tdone, int [] ends){
        switch(S371){
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

  public void thread116542(int [] tdone, int [] ends){
        switch(S366){
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

  public void thread116540(int [] tdone, int [] ends){
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

  public void thread116539(int [] tdone, int [] ends){
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

  public void thread116537(int [] tdone, int [] ends){
        S55=1;
    motorPos1On.setPresent();//sysj\controller.sysj line: 30, column: 38
    currsigs.addElement(motorPos1On);
    active[3]=1;
    ends[3]=1;
    tdone[3]=1;
  }

  public void thread116536(int [] tdone, int [] ends){
        S50=1;
    motConveyorOnOff.setPresent();//sysj\controller.sysj line: 30, column: 7
    currsigs.addElement(motConveyorOnOff);
    active[2]=1;
    ends[2]=1;
    tdone[2]=1;
  }

  public void thread116534(int [] tdone, int [] ends){
        S55=1;
    motorPos1On.setPresent();//sysj\controller.sysj line: 30, column: 38
    currsigs.addElement(motorPos1On);
    active[3]=1;
    ends[3]=1;
    tdone[3]=1;
  }

  public void thread116533(int [] tdone, int [] ends){
        S50=1;
    motConveyorOnOff.setPresent();//sysj\controller.sysj line: 30, column: 7
    currsigs.addElement(motConveyorOnOff);
    active[2]=1;
    ends[2]=1;
    tdone[2]=1;
  }

  public void thread116531(int [] tdone, int [] ends){
        S55=1;
    motorPos1On.setPresent();//sysj\controller.sysj line: 30, column: 38
    currsigs.addElement(motorPos1On);
    active[3]=1;
    ends[3]=1;
    tdone[3]=1;
  }

  public void thread116530(int [] tdone, int [] ends){
        S50=1;
    motConveyorOnOff.setPresent();//sysj\controller.sysj line: 30, column: 7
    currsigs.addElement(motConveyorOnOff);
    active[2]=1;
    ends[2]=1;
    tdone[2]=1;
  }

  public void thread116528(int [] tdone, int [] ends){
        S395=1;
    S378=0;
    if(!conveyorStatus_o.isPartnerPresent() || conveyorStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 44, column: 10
      conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 44, column: 10
      S378=1;
      active[6]=1;
      ends[6]=1;
      tdone[6]=1;
    }
    else {
      S373=0;
      if(conveyorStatus_o.isACK()){//sysj\controller.sysj line: 44, column: 10
        conveyorStatus_o.setVal("busy");//sysj\controller.sysj line: 44, column: 10
        S373=1;
        if(!conveyorStatus_o.isACK()){//sysj\controller.sysj line: 44, column: 10
          conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 44, column: 10
          ends[6]=2;
          ;//sysj\controller.sysj line: 44, column: 10
          S395=0;
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

  public void thread116527(int [] tdone, int [] ends){
        S371=1;
    motorPos5On.setPresent();//sysj\controller.sysj line: 43, column: 38
    currsigs.addElement(motorPos5On);
    active[5]=1;
    ends[5]=1;
    tdone[5]=1;
  }

  public void thread116526(int [] tdone, int [] ends){
        S366=1;
    motConveyorOnOff.setPresent();//sysj\controller.sysj line: 43, column: 7
    currsigs.addElement(motConveyorOnOff);
    active[4]=1;
    ends[4]=1;
    tdone[4]=1;
  }

  public void thread116524(int [] tdone, int [] ends){
        S55=1;
    motorPos1On.setPresent();//sysj\controller.sysj line: 30, column: 38
    currsigs.addElement(motorPos1On);
    active[3]=1;
    ends[3]=1;
    tdone[3]=1;
  }

  public void thread116523(int [] tdone, int [] ends){
        S50=1;
    motConveyorOnOff.setPresent();//sysj\controller.sysj line: 30, column: 7
    currsigs.addElement(motConveyorOnOff);
    active[2]=1;
    ends[2]=1;
    tdone[2]=1;
  }

  public void thread116521(int [] tdone, int [] ends){
        S395=1;
    S378=0;
    if(!conveyorStatus_o.isPartnerPresent() || conveyorStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 44, column: 10
      conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 44, column: 10
      S378=1;
      active[6]=1;
      ends[6]=1;
      tdone[6]=1;
    }
    else {
      S373=0;
      if(conveyorStatus_o.isACK()){//sysj\controller.sysj line: 44, column: 10
        conveyorStatus_o.setVal("busy");//sysj\controller.sysj line: 44, column: 10
        S373=1;
        if(!conveyorStatus_o.isACK()){//sysj\controller.sysj line: 44, column: 10
          conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 44, column: 10
          ends[6]=2;
          ;//sysj\controller.sysj line: 44, column: 10
          S395=0;
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

  public void thread116520(int [] tdone, int [] ends){
        S371=1;
    motorPos5On.setPresent();//sysj\controller.sysj line: 43, column: 38
    currsigs.addElement(motorPos5On);
    active[5]=1;
    ends[5]=1;
    tdone[5]=1;
  }

  public void thread116519(int [] tdone, int [] ends){
        S366=1;
    motConveyorOnOff.setPresent();//sysj\controller.sysj line: 43, column: 7
    currsigs.addElement(motConveyorOnOff);
    active[4]=1;
    ends[4]=1;
    tdone[4]=1;
  }

  public void thread116517(int [] tdone, int [] ends){
        S55=1;
    motorPos1On.setPresent();//sysj\controller.sysj line: 30, column: 38
    currsigs.addElement(motorPos1On);
    active[3]=1;
    ends[3]=1;
    tdone[3]=1;
  }

  public void thread116516(int [] tdone, int [] ends){
        S50=1;
    motConveyorOnOff.setPresent();//sysj\controller.sysj line: 30, column: 7
    currsigs.addElement(motConveyorOnOff);
    active[2]=1;
    ends[2]=1;
    tdone[2]=1;
  }

  public void thread116514(int [] tdone, int [] ends){
        S395=1;
    S378=0;
    if(!conveyorStatus_o.isPartnerPresent() || conveyorStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 44, column: 10
      conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 44, column: 10
      S378=1;
      active[6]=1;
      ends[6]=1;
      tdone[6]=1;
    }
    else {
      S373=0;
      if(conveyorStatus_o.isACK()){//sysj\controller.sysj line: 44, column: 10
        conveyorStatus_o.setVal("busy");//sysj\controller.sysj line: 44, column: 10
        S373=1;
        if(!conveyorStatus_o.isACK()){//sysj\controller.sysj line: 44, column: 10
          conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 44, column: 10
          ends[6]=2;
          ;//sysj\controller.sysj line: 44, column: 10
          S395=0;
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

  public void thread116513(int [] tdone, int [] ends){
        S371=1;
    motorPos5On.setPresent();//sysj\controller.sysj line: 43, column: 38
    currsigs.addElement(motorPos5On);
    active[5]=1;
    ends[5]=1;
    tdone[5]=1;
  }

  public void thread116512(int [] tdone, int [] ends){
        S366=1;
    motConveyorOnOff.setPresent();//sysj\controller.sysj line: 43, column: 7
    currsigs.addElement(motConveyorOnOff);
    active[4]=1;
    ends[4]=1;
    tdone[4]=1;
  }

  public void thread116510(int [] tdone, int [] ends){
        S55=1;
    motorPos1On.setPresent();//sysj\controller.sysj line: 30, column: 38
    currsigs.addElement(motorPos1On);
    active[3]=1;
    ends[3]=1;
    tdone[3]=1;
  }

  public void thread116509(int [] tdone, int [] ends){
        S50=1;
    motConveyorOnOff.setPresent();//sysj\controller.sysj line: 30, column: 7
    currsigs.addElement(motConveyorOnOff);
    active[2]=1;
    ends[2]=1;
    tdone[2]=1;
  }

  public void thread116507(int [] tdone, int [] ends){
        S395=1;
    S378=0;
    if(!conveyorStatus_o.isPartnerPresent() || conveyorStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 44, column: 10
      conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 44, column: 10
      S378=1;
      active[6]=1;
      ends[6]=1;
      tdone[6]=1;
    }
    else {
      S373=0;
      if(conveyorStatus_o.isACK()){//sysj\controller.sysj line: 44, column: 10
        conveyorStatus_o.setVal("busy");//sysj\controller.sysj line: 44, column: 10
        S373=1;
        if(!conveyorStatus_o.isACK()){//sysj\controller.sysj line: 44, column: 10
          conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 44, column: 10
          ends[6]=2;
          ;//sysj\controller.sysj line: 44, column: 10
          S395=0;
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

  public void thread116506(int [] tdone, int [] ends){
        S371=1;
    motorPos5On.setPresent();//sysj\controller.sysj line: 43, column: 38
    currsigs.addElement(motorPos5On);
    active[5]=1;
    ends[5]=1;
    tdone[5]=1;
  }

  public void thread116505(int [] tdone, int [] ends){
        S366=1;
    motConveyorOnOff.setPresent();//sysj\controller.sysj line: 43, column: 7
    currsigs.addElement(motConveyorOnOff);
    active[4]=1;
    ends[4]=1;
    tdone[4]=1;
  }

  public void thread116503(int [] tdone, int [] ends){
        S55=1;
    motorPos1On.setPresent();//sysj\controller.sysj line: 30, column: 38
    currsigs.addElement(motorPos1On);
    active[3]=1;
    ends[3]=1;
    tdone[3]=1;
  }

  public void thread116502(int [] tdone, int [] ends){
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
      switch(S7402){
        case 0 : 
          S7402=0;
          break RUN;
        
        case 1 : 
          S7402=2;
          S7402=2;
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
                  S633=0;
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
                          thread116502(tdone,ends);
                          thread116503(tdone,ends);
                          int biggest116504 = 0;
                          if(ends[2]>=biggest116504){
                            biggest116504=ends[2];
                          }
                          if(ends[3]>=biggest116504){
                            biggest116504=ends[3];
                          }
                          if(biggest116504 == 1){
                            active[1]=1;
                            ends[1]=1;
                            break RUN;
                          }
                        }
                        else {
                          System.out.println("Motor is off");//sysj\controller.sysj line: 34, column: 4
                          S45=2;
                          S236=0;
                          if(!conveyorStatus_o.isPartnerPresent() || conveyorStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 35, column: 4
                            conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 35, column: 4
                            S236=1;
                            active[1]=1;
                            ends[1]=1;
                            break RUN;
                          }
                          else {
                            S231=0;
                            if(conveyorStatus_o.isACK()){//sysj\controller.sysj line: 35, column: 4
                              conveyorStatus_o.setVal("done");//sysj\controller.sysj line: 35, column: 4
                              S231=1;
                              if(!conveyorStatus_o.isACK()){//sysj\controller.sysj line: 35, column: 4
                                conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 35, column: 4
                                ends[1]=2;
                                ;//sysj\controller.sysj line: 35, column: 4
                                System.out.println("conveyor done");//sysj\controller.sysj line: 36, column: 4
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
                  S633=1;
                  S500=0;
                  if(bottleAtPos5.getprestatus()){//sysj\controller.sysj line: 40, column: 12
                    System.out.println("Bottle at position 5 is going to be moved");//sysj\controller.sysj line: 41, column: 5
                    S432=0;
                    thread116505(tdone,ends);
                    thread116506(tdone,ends);
                    thread116507(tdone,ends);
                    int biggest116508 = 0;
                    if(ends[4]>=biggest116508){
                      biggest116508=ends[4];
                    }
                    if(ends[5]>=biggest116508){
                      biggest116508=ends[5];
                    }
                    if(ends[6]>=biggest116508){
                      biggest116508=ends[6];
                    }
                    if(biggest116508 == 1){
                      active[1]=1;
                      ends[1]=1;
                      break RUN;
                    }
                  }
                  else {
                    System.out.println("conveyor idling");//sysj\controller.sysj line: 51, column: 4
                    S500=1;
                    S507=0;
                    if(!conveyorStatus_o.isPartnerPresent() || conveyorStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 52, column: 4
                      conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 52, column: 4
                      S507=1;
                      active[1]=1;
                      ends[1]=1;
                      break RUN;
                    }
                    else {
                      S502=0;
                      if(conveyorStatus_o.isACK()){//sysj\controller.sysj line: 52, column: 4
                        conveyorStatus_o.setVal("idle");//sysj\controller.sysj line: 52, column: 4
                        S502=1;
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
                              S633=0;
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
                                      thread116509(tdone,ends);
                                      thread116510(tdone,ends);
                                      int biggest116511 = 0;
                                      if(ends[2]>=biggest116511){
                                        biggest116511=ends[2];
                                      }
                                      if(ends[3]>=biggest116511){
                                        biggest116511=ends[3];
                                      }
                                      if(biggest116511 == 1){
                                        active[1]=1;
                                        ends[1]=1;
                                        break RUN;
                                      }
                                    }
                                    else {
                                      System.out.println("Motor is off");//sysj\controller.sysj line: 34, column: 4
                                      S45=2;
                                      S236=0;
                                      if(!conveyorStatus_o.isPartnerPresent() || conveyorStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 35, column: 4
                                        conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 35, column: 4
                                        S236=1;
                                        active[1]=1;
                                        ends[1]=1;
                                        break RUN;
                                      }
                                      else {
                                        S231=0;
                                        if(conveyorStatus_o.isACK()){//sysj\controller.sysj line: 35, column: 4
                                          conveyorStatus_o.setVal("done");//sysj\controller.sysj line: 35, column: 4
                                          S231=1;
                                          if(!conveyorStatus_o.isACK()){//sysj\controller.sysj line: 35, column: 4
                                            conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 35, column: 4
                                            ends[1]=2;
                                            ;//sysj\controller.sysj line: 35, column: 4
                                            System.out.println("conveyor done");//sysj\controller.sysj line: 36, column: 4
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
                              S633=1;
                              S500=0;
                              if(bottleAtPos5.getprestatus()){//sysj\controller.sysj line: 40, column: 12
                                System.out.println("Bottle at position 5 is going to be moved");//sysj\controller.sysj line: 41, column: 5
                                S432=0;
                                thread116512(tdone,ends);
                                thread116513(tdone,ends);
                                thread116514(tdone,ends);
                                int biggest116515 = 0;
                                if(ends[4]>=biggest116515){
                                  biggest116515=ends[4];
                                }
                                if(ends[5]>=biggest116515){
                                  biggest116515=ends[5];
                                }
                                if(ends[6]>=biggest116515){
                                  biggest116515=ends[6];
                                }
                                if(biggest116515 == 1){
                                  active[1]=1;
                                  ends[1]=1;
                                  break RUN;
                                }
                              }
                              else {
                                System.out.println("conveyor idling");//sysj\controller.sysj line: 51, column: 4
                                S500=1;
                                S507=0;
                                if(!conveyorStatus_o.isPartnerPresent() || conveyorStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 52, column: 4
                                  conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 52, column: 4
                                  S507=1;
                                  active[1]=1;
                                  ends[1]=1;
                                  break RUN;
                                }
                                else {
                                  S502=0;
                                  if(conveyorStatus_o.isACK()){//sysj\controller.sysj line: 52, column: 4
                                    conveyorStatus_o.setVal("idle");//sysj\controller.sysj line: 52, column: 4
                                    S502=1;
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
                            S633=0;
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
                                    thread116516(tdone,ends);
                                    thread116517(tdone,ends);
                                    int biggest116518 = 0;
                                    if(ends[2]>=biggest116518){
                                      biggest116518=ends[2];
                                    }
                                    if(ends[3]>=biggest116518){
                                      biggest116518=ends[3];
                                    }
                                    if(biggest116518 == 1){
                                      active[1]=1;
                                      ends[1]=1;
                                      break RUN;
                                    }
                                  }
                                  else {
                                    System.out.println("Motor is off");//sysj\controller.sysj line: 34, column: 4
                                    S45=2;
                                    S236=0;
                                    if(!conveyorStatus_o.isPartnerPresent() || conveyorStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 35, column: 4
                                      conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 35, column: 4
                                      S236=1;
                                      active[1]=1;
                                      ends[1]=1;
                                      break RUN;
                                    }
                                    else {
                                      S231=0;
                                      if(conveyorStatus_o.isACK()){//sysj\controller.sysj line: 35, column: 4
                                        conveyorStatus_o.setVal("done");//sysj\controller.sysj line: 35, column: 4
                                        S231=1;
                                        if(!conveyorStatus_o.isACK()){//sysj\controller.sysj line: 35, column: 4
                                          conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 35, column: 4
                                          ends[1]=2;
                                          ;//sysj\controller.sysj line: 35, column: 4
                                          System.out.println("conveyor done");//sysj\controller.sysj line: 36, column: 4
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
                            S633=1;
                            S500=0;
                            if(bottleAtPos5.getprestatus()){//sysj\controller.sysj line: 40, column: 12
                              System.out.println("Bottle at position 5 is going to be moved");//sysj\controller.sysj line: 41, column: 5
                              S432=0;
                              thread116519(tdone,ends);
                              thread116520(tdone,ends);
                              thread116521(tdone,ends);
                              int biggest116522 = 0;
                              if(ends[4]>=biggest116522){
                                biggest116522=ends[4];
                              }
                              if(ends[5]>=biggest116522){
                                biggest116522=ends[5];
                              }
                              if(ends[6]>=biggest116522){
                                biggest116522=ends[6];
                              }
                              if(biggest116522 == 1){
                                active[1]=1;
                                ends[1]=1;
                                break RUN;
                              }
                            }
                            else {
                              System.out.println("conveyor idling");//sysj\controller.sysj line: 51, column: 4
                              S500=1;
                              S507=0;
                              if(!conveyorStatus_o.isPartnerPresent() || conveyorStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 52, column: 4
                                conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 52, column: 4
                                S507=1;
                                active[1]=1;
                                ends[1]=1;
                                break RUN;
                              }
                              else {
                                S502=0;
                                if(conveyorStatus_o.isACK()){//sysj\controller.sysj line: 52, column: 4
                                  conveyorStatus_o.setVal("idle");//sysj\controller.sysj line: 52, column: 4
                                  S502=1;
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
                          S633=0;
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
                                  thread116523(tdone,ends);
                                  thread116524(tdone,ends);
                                  int biggest116525 = 0;
                                  if(ends[2]>=biggest116525){
                                    biggest116525=ends[2];
                                  }
                                  if(ends[3]>=biggest116525){
                                    biggest116525=ends[3];
                                  }
                                  if(biggest116525 == 1){
                                    active[1]=1;
                                    ends[1]=1;
                                    break RUN;
                                  }
                                }
                                else {
                                  System.out.println("Motor is off");//sysj\controller.sysj line: 34, column: 4
                                  S45=2;
                                  S236=0;
                                  if(!conveyorStatus_o.isPartnerPresent() || conveyorStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 35, column: 4
                                    conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 35, column: 4
                                    S236=1;
                                    active[1]=1;
                                    ends[1]=1;
                                    break RUN;
                                  }
                                  else {
                                    S231=0;
                                    if(conveyorStatus_o.isACK()){//sysj\controller.sysj line: 35, column: 4
                                      conveyorStatus_o.setVal("done");//sysj\controller.sysj line: 35, column: 4
                                      S231=1;
                                      if(!conveyorStatus_o.isACK()){//sysj\controller.sysj line: 35, column: 4
                                        conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 35, column: 4
                                        ends[1]=2;
                                        ;//sysj\controller.sysj line: 35, column: 4
                                        System.out.println("conveyor done");//sysj\controller.sysj line: 36, column: 4
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
                          S633=1;
                          S500=0;
                          if(bottleAtPos5.getprestatus()){//sysj\controller.sysj line: 40, column: 12
                            System.out.println("Bottle at position 5 is going to be moved");//sysj\controller.sysj line: 41, column: 5
                            S432=0;
                            thread116526(tdone,ends);
                            thread116527(tdone,ends);
                            thread116528(tdone,ends);
                            int biggest116529 = 0;
                            if(ends[4]>=biggest116529){
                              biggest116529=ends[4];
                            }
                            if(ends[5]>=biggest116529){
                              biggest116529=ends[5];
                            }
                            if(ends[6]>=biggest116529){
                              biggest116529=ends[6];
                            }
                            if(biggest116529 == 1){
                              active[1]=1;
                              ends[1]=1;
                              break RUN;
                            }
                          }
                          else {
                            System.out.println("conveyor idling");//sysj\controller.sysj line: 51, column: 4
                            S500=1;
                            S507=0;
                            if(!conveyorStatus_o.isPartnerPresent() || conveyorStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 52, column: 4
                              conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 52, column: 4
                              S507=1;
                              active[1]=1;
                              ends[1]=1;
                              break RUN;
                            }
                            else {
                              S502=0;
                              if(conveyorStatus_o.isACK()){//sysj\controller.sysj line: 52, column: 4
                                conveyorStatus_o.setVal("idle");//sysj\controller.sysj line: 52, column: 4
                                S502=1;
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
              switch(S633){
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
                                      thread116530(tdone,ends);
                                      thread116531(tdone,ends);
                                      int biggest116532 = 0;
                                      if(ends[2]>=biggest116532){
                                        biggest116532=ends[2];
                                      }
                                      if(ends[3]>=biggest116532){
                                        biggest116532=ends[3];
                                      }
                                      if(biggest116532 == 1){
                                        active[1]=1;
                                        ends[1]=1;
                                        break RUN;
                                      }
                                    }
                                    else {
                                      System.out.println("Motor is off");//sysj\controller.sysj line: 34, column: 4
                                      S45=2;
                                      S236=0;
                                      if(!conveyorStatus_o.isPartnerPresent() || conveyorStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 35, column: 4
                                        conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 35, column: 4
                                        S236=1;
                                        active[1]=1;
                                        ends[1]=1;
                                        break RUN;
                                      }
                                      else {
                                        S231=0;
                                        if(conveyorStatus_o.isACK()){//sysj\controller.sysj line: 35, column: 4
                                          conveyorStatus_o.setVal("done");//sysj\controller.sysj line: 35, column: 4
                                          S231=1;
                                          if(!conveyorStatus_o.isACK()){//sysj\controller.sysj line: 35, column: 4
                                            conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 35, column: 4
                                            ends[1]=2;
                                            ;//sysj\controller.sysj line: 35, column: 4
                                            System.out.println("conveyor done");//sysj\controller.sysj line: 36, column: 4
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
                                  if(!bottleAtPos1.getprestatus()){//sysj\controller.sysj line: 26, column: 12
                                    System.out.println("ono the bottle isn't at pos 1 what will we do");//sysj\controller.sysj line: 27, column: 5
                                    System.out.println("Motor is on");//sysj\controller.sysj line: 29, column: 6
                                    thread116533(tdone,ends);
                                    thread116534(tdone,ends);
                                    int biggest116535 = 0;
                                    if(ends[2]>=biggest116535){
                                      biggest116535=ends[2];
                                    }
                                    if(ends[3]>=biggest116535){
                                      biggest116535=ends[3];
                                    }
                                    if(biggest116535 == 1){
                                      active[1]=1;
                                      ends[1]=1;
                                      break RUN;
                                    }
                                  }
                                  else {
                                    System.out.println("Motor is off");//sysj\controller.sysj line: 34, column: 4
                                    S45=2;
                                    S236=0;
                                    if(!conveyorStatus_o.isPartnerPresent() || conveyorStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 35, column: 4
                                      conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 35, column: 4
                                      S236=1;
                                      active[1]=1;
                                      ends[1]=1;
                                      break RUN;
                                    }
                                    else {
                                      S231=0;
                                      if(conveyorStatus_o.isACK()){//sysj\controller.sysj line: 35, column: 4
                                        conveyorStatus_o.setVal("done");//sysj\controller.sysj line: 35, column: 4
                                        S231=1;
                                        if(!conveyorStatus_o.isACK()){//sysj\controller.sysj line: 35, column: 4
                                          conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 35, column: 4
                                          ends[1]=2;
                                          ;//sysj\controller.sysj line: 35, column: 4
                                          System.out.println("conveyor done");//sysj\controller.sysj line: 36, column: 4
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
                                if(!bottleAtPos1.getprestatus()){//sysj\controller.sysj line: 26, column: 12
                                  System.out.println("ono the bottle isn't at pos 1 what will we do");//sysj\controller.sysj line: 27, column: 5
                                  System.out.println("Motor is on");//sysj\controller.sysj line: 29, column: 6
                                  thread116536(tdone,ends);
                                  thread116537(tdone,ends);
                                  int biggest116538 = 0;
                                  if(ends[2]>=biggest116538){
                                    biggest116538=ends[2];
                                  }
                                  if(ends[3]>=biggest116538){
                                    biggest116538=ends[3];
                                  }
                                  if(biggest116538 == 1){
                                    active[1]=1;
                                    ends[1]=1;
                                    break RUN;
                                  }
                                }
                                else {
                                  System.out.println("Motor is off");//sysj\controller.sysj line: 34, column: 4
                                  S45=2;
                                  S236=0;
                                  if(!conveyorStatus_o.isPartnerPresent() || conveyorStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 35, column: 4
                                    conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 35, column: 4
                                    S236=1;
                                    active[1]=1;
                                    ends[1]=1;
                                    break RUN;
                                  }
                                  else {
                                    S231=0;
                                    if(conveyorStatus_o.isACK()){//sysj\controller.sysj line: 35, column: 4
                                      conveyorStatus_o.setVal("done");//sysj\controller.sysj line: 35, column: 4
                                      S231=1;
                                      if(!conveyorStatus_o.isACK()){//sysj\controller.sysj line: 35, column: 4
                                        conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 35, column: 4
                                        ends[1]=2;
                                        ;//sysj\controller.sysj line: 35, column: 4
                                        System.out.println("conveyor done");//sysj\controller.sysj line: 36, column: 4
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
                      if(bottleAtPos1.getprestatus()){//sysj\controller.sysj line: 28, column: 11
                        System.out.println("Motor is off");//sysj\controller.sysj line: 34, column: 4
                        S45=2;
                        S236=0;
                        if(!conveyorStatus_o.isPartnerPresent() || conveyorStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 35, column: 4
                          conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 35, column: 4
                          S236=1;
                          active[1]=1;
                          ends[1]=1;
                          break RUN;
                        }
                        else {
                          S231=0;
                          if(conveyorStatus_o.isACK()){//sysj\controller.sysj line: 35, column: 4
                            conveyorStatus_o.setVal("done");//sysj\controller.sysj line: 35, column: 4
                            S231=1;
                            if(!conveyorStatus_o.isACK()){//sysj\controller.sysj line: 35, column: 4
                              conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 35, column: 4
                              ends[1]=2;
                              ;//sysj\controller.sysj line: 35, column: 4
                              System.out.println("conveyor done");//sysj\controller.sysj line: 36, column: 4
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
                        thread116539(tdone,ends);
                        thread116540(tdone,ends);
                        int biggest116541 = 0;
                        if(ends[2]>=biggest116541){
                          biggest116541=ends[2];
                        }
                        if(ends[3]>=biggest116541){
                          biggest116541=ends[3];
                        }
                        if(biggest116541 == 1){
                          active[1]=1;
                          ends[1]=1;
                          break RUN;
                        }
                        //FINXME code
                        if(biggest116541 == 0){
                          System.out.println("Motor is off");//sysj\controller.sysj line: 34, column: 4
                          S45=2;
                          S236=0;
                          if(!conveyorStatus_o.isPartnerPresent() || conveyorStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 35, column: 4
                            conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 35, column: 4
                            S236=1;
                            active[1]=1;
                            ends[1]=1;
                            break RUN;
                          }
                          else {
                            S231=0;
                            if(conveyorStatus_o.isACK()){//sysj\controller.sysj line: 35, column: 4
                              conveyorStatus_o.setVal("done");//sysj\controller.sysj line: 35, column: 4
                              S231=1;
                              if(!conveyorStatus_o.isACK()){//sysj\controller.sysj line: 35, column: 4
                                conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 35, column: 4
                                ends[1]=2;
                                ;//sysj\controller.sysj line: 35, column: 4
                                System.out.println("conveyor done");//sysj\controller.sysj line: 36, column: 4
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
                      switch(S236){
                        case 0 : 
                          if(!conveyorStatus_o.isPartnerPresent() || conveyorStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 35, column: 4
                            conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 35, column: 4
                            S236=1;
                            active[1]=1;
                            ends[1]=1;
                            break RUN;
                          }
                          else {
                            switch(S231){
                              case 0 : 
                                if(conveyorStatus_o.isACK()){//sysj\controller.sysj line: 35, column: 4
                                  conveyorStatus_o.setVal("done");//sysj\controller.sysj line: 35, column: 4
                                  S231=1;
                                  if(!conveyorStatus_o.isACK()){//sysj\controller.sysj line: 35, column: 4
                                    conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 35, column: 4
                                    ends[1]=2;
                                    ;//sysj\controller.sysj line: 35, column: 4
                                    System.out.println("conveyor done");//sysj\controller.sysj line: 36, column: 4
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
                                if(!conveyorStatus_o.isACK()){//sysj\controller.sysj line: 35, column: 4
                                  conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 35, column: 4
                                  ends[1]=2;
                                  ;//sysj\controller.sysj line: 35, column: 4
                                  System.out.println("conveyor done");//sysj\controller.sysj line: 36, column: 4
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
                          S236=1;
                          S236=0;
                          if(!conveyorStatus_o.isPartnerPresent() || conveyorStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 35, column: 4
                            conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 35, column: 4
                            S236=1;
                            active[1]=1;
                            ends[1]=1;
                            break RUN;
                          }
                          else {
                            S231=0;
                            if(conveyorStatus_o.isACK()){//sysj\controller.sysj line: 35, column: 4
                              conveyorStatus_o.setVal("done");//sysj\controller.sysj line: 35, column: 4
                              S231=1;
                              if(!conveyorStatus_o.isACK()){//sysj\controller.sysj line: 35, column: 4
                                conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 35, column: 4
                                ends[1]=2;
                                ;//sysj\controller.sysj line: 35, column: 4
                                System.out.println("conveyor done");//sysj\controller.sysj line: 36, column: 4
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
                  switch(S500){
                    case 0 : 
                      switch(S432){
                        case 0 : 
                          if(bottleLeftPos5.getprestatus()){//sysj\controller.sysj line: 42, column: 11
                            conveyorStatus_o.setPreempted();
                            System.out.println("bottle at pos 5 has moved away");//sysj\controller.sysj line: 46, column: 5
                            S432=1;
                            S439=0;
                            if(!conveyorStatus_o.isPartnerPresent() || conveyorStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 47, column: 5
                              conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 47, column: 5
                              S439=1;
                              active[1]=1;
                              ends[1]=1;
                              break RUN;
                            }
                            else {
                              S434=0;
                              if(conveyorStatus_o.isACK()){//sysj\controller.sysj line: 47, column: 5
                                conveyorStatus_o.setVal("done");//sysj\controller.sysj line: 47, column: 5
                                S434=1;
                                if(!conveyorStatus_o.isACK()){//sysj\controller.sysj line: 47, column: 5
                                  conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 47, column: 5
                                  ends[1]=2;
                                  ;//sysj\controller.sysj line: 47, column: 5
                                  System.out.println("conveyor idling");//sysj\controller.sysj line: 51, column: 4
                                  S500=1;
                                  S507=0;
                                  if(!conveyorStatus_o.isPartnerPresent() || conveyorStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 52, column: 4
                                    conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 52, column: 4
                                    S507=1;
                                    active[1]=1;
                                    ends[1]=1;
                                    break RUN;
                                  }
                                  else {
                                    S502=0;
                                    if(conveyorStatus_o.isACK()){//sysj\controller.sysj line: 52, column: 4
                                      conveyorStatus_o.setVal("idle");//sysj\controller.sysj line: 52, column: 4
                                      S502=1;
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
                            thread116542(tdone,ends);
                            thread116543(tdone,ends);
                            thread116544(tdone,ends);
                            int biggest116545 = 0;
                            if(ends[4]>=biggest116545){
                              biggest116545=ends[4];
                            }
                            if(ends[5]>=biggest116545){
                              biggest116545=ends[5];
                            }
                            if(ends[6]>=biggest116545){
                              biggest116545=ends[6];
                            }
                            if(biggest116545 == 1){
                              active[1]=1;
                              ends[1]=1;
                              break RUN;
                            }
                            //FINXME code
                            if(biggest116545 == 0){
                              System.out.println("bottle at pos 5 has moved away");//sysj\controller.sysj line: 46, column: 5
                              S432=1;
                              S439=0;
                              if(!conveyorStatus_o.isPartnerPresent() || conveyorStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 47, column: 5
                                conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 47, column: 5
                                S439=1;
                                active[1]=1;
                                ends[1]=1;
                                break RUN;
                              }
                              else {
                                S434=0;
                                if(conveyorStatus_o.isACK()){//sysj\controller.sysj line: 47, column: 5
                                  conveyorStatus_o.setVal("done");//sysj\controller.sysj line: 47, column: 5
                                  S434=1;
                                  if(!conveyorStatus_o.isACK()){//sysj\controller.sysj line: 47, column: 5
                                    conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 47, column: 5
                                    ends[1]=2;
                                    ;//sysj\controller.sysj line: 47, column: 5
                                    System.out.println("conveyor idling");//sysj\controller.sysj line: 51, column: 4
                                    S500=1;
                                    S507=0;
                                    if(!conveyorStatus_o.isPartnerPresent() || conveyorStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 52, column: 4
                                      conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 52, column: 4
                                      S507=1;
                                      active[1]=1;
                                      ends[1]=1;
                                      break RUN;
                                    }
                                    else {
                                      S502=0;
                                      if(conveyorStatus_o.isACK()){//sysj\controller.sysj line: 52, column: 4
                                        conveyorStatus_o.setVal("idle");//sysj\controller.sysj line: 52, column: 4
                                        S502=1;
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
                          switch(S439){
                            case 0 : 
                              if(!conveyorStatus_o.isPartnerPresent() || conveyorStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 47, column: 5
                                conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 47, column: 5
                                S439=1;
                                active[1]=1;
                                ends[1]=1;
                                break RUN;
                              }
                              else {
                                switch(S434){
                                  case 0 : 
                                    if(conveyorStatus_o.isACK()){//sysj\controller.sysj line: 47, column: 5
                                      conveyorStatus_o.setVal("done");//sysj\controller.sysj line: 47, column: 5
                                      S434=1;
                                      if(!conveyorStatus_o.isACK()){//sysj\controller.sysj line: 47, column: 5
                                        conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 47, column: 5
                                        ends[1]=2;
                                        ;//sysj\controller.sysj line: 47, column: 5
                                        System.out.println("conveyor idling");//sysj\controller.sysj line: 51, column: 4
                                        S500=1;
                                        S507=0;
                                        if(!conveyorStatus_o.isPartnerPresent() || conveyorStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 52, column: 4
                                          conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 52, column: 4
                                          S507=1;
                                          active[1]=1;
                                          ends[1]=1;
                                          break RUN;
                                        }
                                        else {
                                          S502=0;
                                          if(conveyorStatus_o.isACK()){//sysj\controller.sysj line: 52, column: 4
                                            conveyorStatus_o.setVal("idle");//sysj\controller.sysj line: 52, column: 4
                                            S502=1;
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
                                      S500=1;
                                      S507=0;
                                      if(!conveyorStatus_o.isPartnerPresent() || conveyorStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 52, column: 4
                                        conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 52, column: 4
                                        S507=1;
                                        active[1]=1;
                                        ends[1]=1;
                                        break RUN;
                                      }
                                      else {
                                        S502=0;
                                        if(conveyorStatus_o.isACK()){//sysj\controller.sysj line: 52, column: 4
                                          conveyorStatus_o.setVal("idle");//sysj\controller.sysj line: 52, column: 4
                                          S502=1;
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
                              S439=1;
                              S439=0;
                              if(!conveyorStatus_o.isPartnerPresent() || conveyorStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 47, column: 5
                                conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 47, column: 5
                                S439=1;
                                active[1]=1;
                                ends[1]=1;
                                break RUN;
                              }
                              else {
                                S434=0;
                                if(conveyorStatus_o.isACK()){//sysj\controller.sysj line: 47, column: 5
                                  conveyorStatus_o.setVal("done");//sysj\controller.sysj line: 47, column: 5
                                  S434=1;
                                  if(!conveyorStatus_o.isACK()){//sysj\controller.sysj line: 47, column: 5
                                    conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 47, column: 5
                                    ends[1]=2;
                                    ;//sysj\controller.sysj line: 47, column: 5
                                    System.out.println("conveyor idling");//sysj\controller.sysj line: 51, column: 4
                                    S500=1;
                                    S507=0;
                                    if(!conveyorStatus_o.isPartnerPresent() || conveyorStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 52, column: 4
                                      conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 52, column: 4
                                      S507=1;
                                      active[1]=1;
                                      ends[1]=1;
                                      break RUN;
                                    }
                                    else {
                                      S502=0;
                                      if(conveyorStatus_o.isACK()){//sysj\controller.sysj line: 52, column: 4
                                        conveyorStatus_o.setVal("idle");//sysj\controller.sysj line: 52, column: 4
                                        S502=1;
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
                      switch(S507){
                        case 0 : 
                          if(!conveyorStatus_o.isPartnerPresent() || conveyorStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 52, column: 4
                            conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 52, column: 4
                            S507=1;
                            active[1]=1;
                            ends[1]=1;
                            break RUN;
                          }
                          else {
                            switch(S502){
                              case 0 : 
                                if(conveyorStatus_o.isACK()){//sysj\controller.sysj line: 52, column: 4
                                  conveyorStatus_o.setVal("idle");//sysj\controller.sysj line: 52, column: 4
                                  S502=1;
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
                          S507=1;
                          S507=0;
                          if(!conveyorStatus_o.isPartnerPresent() || conveyorStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 52, column: 4
                            conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 52, column: 4
                            S507=1;
                            active[1]=1;
                            ends[1]=1;
                            break RUN;
                          }
                          else {
                            S502=0;
                            if(conveyorStatus_o.isACK()){//sysj\controller.sysj line: 52, column: 4
                              conveyorStatus_o.setVal("idle");//sysj\controller.sysj line: 52, column: 4
                              S502=1;
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
                      S633=0;
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
                              thread116546(tdone,ends);
                              thread116547(tdone,ends);
                              int biggest116548 = 0;
                              if(ends[2]>=biggest116548){
                                biggest116548=ends[2];
                              }
                              if(ends[3]>=biggest116548){
                                biggest116548=ends[3];
                              }
                              if(biggest116548 == 1){
                                active[1]=1;
                                ends[1]=1;
                                break RUN;
                              }
                            }
                            else {
                              System.out.println("Motor is off");//sysj\controller.sysj line: 34, column: 4
                              S45=2;
                              S236=0;
                              if(!conveyorStatus_o.isPartnerPresent() || conveyorStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 35, column: 4
                                conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 35, column: 4
                                S236=1;
                                active[1]=1;
                                ends[1]=1;
                                break RUN;
                              }
                              else {
                                S231=0;
                                if(conveyorStatus_o.isACK()){//sysj\controller.sysj line: 35, column: 4
                                  conveyorStatus_o.setVal("done");//sysj\controller.sysj line: 35, column: 4
                                  S231=1;
                                  if(!conveyorStatus_o.isACK()){//sysj\controller.sysj line: 35, column: 4
                                    conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 35, column: 4
                                    ends[1]=2;
                                    ;//sysj\controller.sysj line: 35, column: 4
                                    System.out.println("conveyor done");//sysj\controller.sysj line: 36, column: 4
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
                      S633=1;
                      S500=0;
                      if(bottleAtPos5.getprestatus()){//sysj\controller.sysj line: 40, column: 12
                        System.out.println("Bottle at position 5 is going to be moved");//sysj\controller.sysj line: 41, column: 5
                        S432=0;
                        thread116549(tdone,ends);
                        thread116550(tdone,ends);
                        thread116551(tdone,ends);
                        int biggest116552 = 0;
                        if(ends[4]>=biggest116552){
                          biggest116552=ends[4];
                        }
                        if(ends[5]>=biggest116552){
                          biggest116552=ends[5];
                        }
                        if(ends[6]>=biggest116552){
                          biggest116552=ends[6];
                        }
                        if(biggest116552 == 1){
                          active[1]=1;
                          ends[1]=1;
                          break RUN;
                        }
                      }
                      else {
                        System.out.println("conveyor idling");//sysj\controller.sysj line: 51, column: 4
                        S500=1;
                        S507=0;
                        if(!conveyorStatus_o.isPartnerPresent() || conveyorStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 52, column: 4
                          conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 52, column: 4
                          S507=1;
                          active[1]=1;
                          ends[1]=1;
                          break RUN;
                        }
                        else {
                          S502=0;
                          if(conveyorStatus_o.isACK()){//sysj\controller.sysj line: 52, column: 4
                            conveyorStatus_o.setVal("idle");//sysj\controller.sysj line: 52, column: 4
                            S502=1;
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
