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
  private Boolean req_thread_1;//sysj\controller.sysj line: 14, column: 3
  private int S4462 = 1;
  private int S22 = 1;
  private int S6 = 1;
  private int S1 = 1;
  private int S71 = 1;
  private int S27 = 1;
  private int S32 = 1;
  private int S76 = 1;
  private int S81 = 1;
  private int S262 = 1;
  private int S257 = 1;
  
  private int[] ends = new int[22];
  private int[] tdone = new int[22];
  
  public void thread38273(int [] tdone, int [] ends){
        S81=1;
    motorPos1On.setPresent();//sysj\controller.sysj line: 30, column: 38
    currsigs.addElement(motorPos1On);
    active[5]=1;
    ends[5]=1;
    tdone[5]=1;
  }

  public void thread38272(int [] tdone, int [] ends){
        S76=1;
    motConveyorOnOff.setPresent();//sysj\controller.sysj line: 30, column: 7
    currsigs.addElement(motConveyorOnOff);
    active[4]=1;
    ends[4]=1;
    tdone[4]=1;
  }

  public void thread38270(int [] tdone, int [] ends){
        S32=1;
    motorPos5On.setPresent();//sysj\controller.sysj line: 20, column: 38
    currsigs.addElement(motorPos5On);
    active[3]=1;
    ends[3]=1;
    tdone[3]=1;
  }

  public void thread38269(int [] tdone, int [] ends){
        S27=1;
    motConveyorOnOff.setPresent();//sysj\controller.sysj line: 20, column: 7
    currsigs.addElement(motConveyorOnOff);
    active[2]=1;
    ends[2]=1;
    tdone[2]=1;
  }

  public void thread38267(int [] tdone, int [] ends){
        switch(S81){
      case 0 : 
        active[5]=0;
        ends[5]=0;
        tdone[5]=1;
        break;
      
      case 1 : 
        motorPos1On.setPresent();//sysj\controller.sysj line: 30, column: 38
        currsigs.addElement(motorPos1On);
        active[5]=1;
        ends[5]=1;
        tdone[5]=1;
        break;
      
    }
  }

  public void thread38266(int [] tdone, int [] ends){
        switch(S76){
      case 0 : 
        active[4]=0;
        ends[4]=0;
        tdone[4]=1;
        break;
      
      case 1 : 
        motConveyorOnOff.setPresent();//sysj\controller.sysj line: 30, column: 7
        currsigs.addElement(motConveyorOnOff);
        active[4]=1;
        ends[4]=1;
        tdone[4]=1;
        break;
      
    }
  }

  public void thread38264(int [] tdone, int [] ends){
        S81=1;
    motorPos1On.setPresent();//sysj\controller.sysj line: 30, column: 38
    currsigs.addElement(motorPos1On);
    active[5]=1;
    ends[5]=1;
    tdone[5]=1;
  }

  public void thread38263(int [] tdone, int [] ends){
        S76=1;
    motConveyorOnOff.setPresent();//sysj\controller.sysj line: 30, column: 7
    currsigs.addElement(motConveyorOnOff);
    active[4]=1;
    ends[4]=1;
    tdone[4]=1;
  }

  public void thread38261(int [] tdone, int [] ends){
        switch(S32){
      case 0 : 
        active[3]=0;
        ends[3]=0;
        tdone[3]=1;
        break;
      
      case 1 : 
        motorPos5On.setPresent();//sysj\controller.sysj line: 20, column: 38
        currsigs.addElement(motorPos5On);
        active[3]=1;
        ends[3]=1;
        tdone[3]=1;
        break;
      
    }
  }

  public void thread38260(int [] tdone, int [] ends){
        switch(S27){
      case 0 : 
        active[2]=0;
        ends[2]=0;
        tdone[2]=1;
        break;
      
      case 1 : 
        motConveyorOnOff.setPresent();//sysj\controller.sysj line: 20, column: 7
        currsigs.addElement(motConveyorOnOff);
        active[2]=1;
        ends[2]=1;
        tdone[2]=1;
        break;
      
    }
  }

  public void thread38258(int [] tdone, int [] ends){
        S81=1;
    motorPos1On.setPresent();//sysj\controller.sysj line: 30, column: 38
    currsigs.addElement(motorPos1On);
    active[5]=1;
    ends[5]=1;
    tdone[5]=1;
  }

  public void thread38257(int [] tdone, int [] ends){
        S76=1;
    motConveyorOnOff.setPresent();//sysj\controller.sysj line: 30, column: 7
    currsigs.addElement(motConveyorOnOff);
    active[4]=1;
    ends[4]=1;
    tdone[4]=1;
  }

  public void thread38255(int [] tdone, int [] ends){
        S81=1;
    motorPos1On.setPresent();//sysj\controller.sysj line: 30, column: 38
    currsigs.addElement(motorPos1On);
    active[5]=1;
    ends[5]=1;
    tdone[5]=1;
  }

  public void thread38254(int [] tdone, int [] ends){
        S76=1;
    motConveyorOnOff.setPresent();//sysj\controller.sysj line: 30, column: 7
    currsigs.addElement(motConveyorOnOff);
    active[4]=1;
    ends[4]=1;
    tdone[4]=1;
  }

  public void thread38252(int [] tdone, int [] ends){
        S32=1;
    motorPos5On.setPresent();//sysj\controller.sysj line: 20, column: 38
    currsigs.addElement(motorPos5On);
    active[3]=1;
    ends[3]=1;
    tdone[3]=1;
  }

  public void thread38251(int [] tdone, int [] ends){
        S27=1;
    motConveyorOnOff.setPresent();//sysj\controller.sysj line: 20, column: 7
    currsigs.addElement(motConveyorOnOff);
    active[2]=1;
    ends[2]=1;
    tdone[2]=1;
  }

  public void thread38249(int [] tdone, int [] ends){
        S81=1;
    motorPos1On.setPresent();//sysj\controller.sysj line: 30, column: 38
    currsigs.addElement(motorPos1On);
    active[5]=1;
    ends[5]=1;
    tdone[5]=1;
  }

  public void thread38248(int [] tdone, int [] ends){
        S76=1;
    motConveyorOnOff.setPresent();//sysj\controller.sysj line: 30, column: 7
    currsigs.addElement(motConveyorOnOff);
    active[4]=1;
    ends[4]=1;
    tdone[4]=1;
  }

  public void thread38246(int [] tdone, int [] ends){
        S32=1;
    motorPos5On.setPresent();//sysj\controller.sysj line: 20, column: 38
    currsigs.addElement(motorPos5On);
    active[3]=1;
    ends[3]=1;
    tdone[3]=1;
  }

  public void thread38245(int [] tdone, int [] ends){
        S27=1;
    motConveyorOnOff.setPresent();//sysj\controller.sysj line: 20, column: 7
    currsigs.addElement(motConveyorOnOff);
    active[2]=1;
    ends[2]=1;
    tdone[2]=1;
  }

  public void thread38243(int [] tdone, int [] ends){
        S81=1;
    motorPos1On.setPresent();//sysj\controller.sysj line: 30, column: 38
    currsigs.addElement(motorPos1On);
    active[5]=1;
    ends[5]=1;
    tdone[5]=1;
  }

  public void thread38242(int [] tdone, int [] ends){
        S76=1;
    motConveyorOnOff.setPresent();//sysj\controller.sysj line: 30, column: 7
    currsigs.addElement(motConveyorOnOff);
    active[4]=1;
    ends[4]=1;
    tdone[4]=1;
  }

  public void thread38240(int [] tdone, int [] ends){
        S32=1;
    motorPos5On.setPresent();//sysj\controller.sysj line: 20, column: 38
    currsigs.addElement(motorPos5On);
    active[3]=1;
    ends[3]=1;
    tdone[3]=1;
  }

  public void thread38239(int [] tdone, int [] ends){
        S27=1;
    motConveyorOnOff.setPresent();//sysj\controller.sysj line: 20, column: 7
    currsigs.addElement(motConveyorOnOff);
    active[2]=1;
    ends[2]=1;
    tdone[2]=1;
  }

  public void thread38237(int [] tdone, int [] ends){
        S81=1;
    motorPos1On.setPresent();//sysj\controller.sysj line: 30, column: 38
    currsigs.addElement(motorPos1On);
    active[5]=1;
    ends[5]=1;
    tdone[5]=1;
  }

  public void thread38236(int [] tdone, int [] ends){
        S76=1;
    motConveyorOnOff.setPresent();//sysj\controller.sysj line: 30, column: 7
    currsigs.addElement(motConveyorOnOff);
    active[4]=1;
    ends[4]=1;
    tdone[4]=1;
  }

  public void thread38234(int [] tdone, int [] ends){
        S32=1;
    motorPos5On.setPresent();//sysj\controller.sysj line: 20, column: 38
    currsigs.addElement(motorPos5On);
    active[3]=1;
    ends[3]=1;
    tdone[3]=1;
  }

  public void thread38233(int [] tdone, int [] ends){
        S27=1;
    motConveyorOnOff.setPresent();//sysj\controller.sysj line: 20, column: 7
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
      switch(S4462){
        case 0 : 
          S4462=0;
          break RUN;
        
        case 1 : 
          S4462=2;
          S4462=2;
          S22=0;
          S6=0;
          if(!conveyorReq_in.isPartnerPresent() || conveyorReq_in.isPartnerPreempted()){//sysj\controller.sysj line: 12, column: 3
            conveyorReq_in.setACK(false);//sysj\controller.sysj line: 12, column: 3
            S6=1;
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
          else {
            S1=0;
            if(!conveyorReq_in.isREQ()){//sysj\controller.sysj line: 12, column: 3
              conveyorReq_in.setACK(true);//sysj\controller.sysj line: 12, column: 3
              S1=1;
              if(conveyorReq_in.isREQ()){//sysj\controller.sysj line: 12, column: 3
                conveyorReq_in.setACK(false);//sysj\controller.sysj line: 12, column: 3
                ends[1]=2;
                ;//sysj\controller.sysj line: 12, column: 3
                req_thread_1 = (Boolean)(conveyorReq_in.getVal() == null ? null : ((Boolean)conveyorReq_in.getVal()));//sysj\controller.sysj line: 14, column: 3
                S22=1;
                if(req_thread_1){//sysj\controller.sysj line: 15, column: 3
                  System.out.println("ConveyorController: Request received from orch.");//sysj\controller.sysj line: 16, column: 4
                  S71=0;
                  if(bottleAtPos5.getprestatus()){//sysj\controller.sysj line: 17, column: 12
                    System.out.println("ConveyorController: Moving bottle 5...");//sysj\controller.sysj line: 18, column: 5
                    thread38233(tdone,ends);
                    thread38234(tdone,ends);
                    int biggest38235 = 0;
                    if(ends[2]>=biggest38235){
                      biggest38235=ends[2];
                    }
                    if(ends[3]>=biggest38235){
                      biggest38235=ends[3];
                    }
                    if(biggest38235 == 1){
                      active[1]=1;
                      ends[1]=1;
                      break RUN;
                    }
                  }
                  else {
                    S71=1;
                    if(!bottleAtPos1.getprestatus() && !bottleAtPos5.getprestatus() && !bottleLeftPos5.getprestatus()){//sysj\controller.sysj line: 26, column: 12
                      System.out.println("ConveyorController: No bottle at pos 1 or pos 5.");//sysj\controller.sysj line: 27, column: 5
                      System.out.println("ConveyorController: Motor is on");//sysj\controller.sysj line: 29, column: 6
                      thread38236(tdone,ends);
                      thread38237(tdone,ends);
                      int biggest38238 = 0;
                      if(ends[4]>=biggest38238){
                        biggest38238=ends[4];
                      }
                      if(ends[5]>=biggest38238){
                        biggest38238=ends[5];
                      }
                      if(biggest38238 == 1){
                        active[1]=1;
                        ends[1]=1;
                        break RUN;
                      }
                    }
                    else {
                      System.out.println("ConveyorController: Motor is off");//sysj\controller.sysj line: 34, column: 4
                      S71=2;
                      S262=0;
                      if(!conveyorStatus_o.isPartnerPresent() || conveyorStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 35, column: 4
                        conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 35, column: 4
                        S262=1;
                        active[1]=1;
                        ends[1]=1;
                        break RUN;
                      }
                      else {
                        S257=0;
                        if(conveyorStatus_o.isACK()){//sysj\controller.sysj line: 35, column: 4
                          conveyorStatus_o.setVal("done");//sysj\controller.sysj line: 35, column: 4
                          S257=1;
                          if(!conveyorStatus_o.isACK()){//sysj\controller.sysj line: 35, column: 4
                            conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 35, column: 4
                            ends[1]=2;
                            ;//sysj\controller.sysj line: 35, column: 4
                            S71=3;
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
                  S22=2;
                  active[1]=1;
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
                  if(!conveyorReq_in.isPartnerPresent() || conveyorReq_in.isPartnerPreempted()){//sysj\controller.sysj line: 12, column: 3
                    conveyorReq_in.setACK(false);//sysj\controller.sysj line: 12, column: 3
                    S6=1;
                    active[1]=1;
                    ends[1]=1;
                    break RUN;
                  }
                  else {
                    switch(S1){
                      case 0 : 
                        if(!conveyorReq_in.isREQ()){//sysj\controller.sysj line: 12, column: 3
                          conveyorReq_in.setACK(true);//sysj\controller.sysj line: 12, column: 3
                          S1=1;
                          if(conveyorReq_in.isREQ()){//sysj\controller.sysj line: 12, column: 3
                            conveyorReq_in.setACK(false);//sysj\controller.sysj line: 12, column: 3
                            ends[1]=2;
                            ;//sysj\controller.sysj line: 12, column: 3
                            req_thread_1 = (Boolean)(conveyorReq_in.getVal() == null ? null : ((Boolean)conveyorReq_in.getVal()));//sysj\controller.sysj line: 14, column: 3
                            S22=1;
                            if(req_thread_1){//sysj\controller.sysj line: 15, column: 3
                              System.out.println("ConveyorController: Request received from orch.");//sysj\controller.sysj line: 16, column: 4
                              S71=0;
                              if(bottleAtPos5.getprestatus()){//sysj\controller.sysj line: 17, column: 12
                                System.out.println("ConveyorController: Moving bottle 5...");//sysj\controller.sysj line: 18, column: 5
                                thread38239(tdone,ends);
                                thread38240(tdone,ends);
                                int biggest38241 = 0;
                                if(ends[2]>=biggest38241){
                                  biggest38241=ends[2];
                                }
                                if(ends[3]>=biggest38241){
                                  biggest38241=ends[3];
                                }
                                if(biggest38241 == 1){
                                  active[1]=1;
                                  ends[1]=1;
                                  break RUN;
                                }
                              }
                              else {
                                S71=1;
                                if(!bottleAtPos1.getprestatus() && !bottleAtPos5.getprestatus() && !bottleLeftPos5.getprestatus()){//sysj\controller.sysj line: 26, column: 12
                                  System.out.println("ConveyorController: No bottle at pos 1 or pos 5.");//sysj\controller.sysj line: 27, column: 5
                                  System.out.println("ConveyorController: Motor is on");//sysj\controller.sysj line: 29, column: 6
                                  thread38242(tdone,ends);
                                  thread38243(tdone,ends);
                                  int biggest38244 = 0;
                                  if(ends[4]>=biggest38244){
                                    biggest38244=ends[4];
                                  }
                                  if(ends[5]>=biggest38244){
                                    biggest38244=ends[5];
                                  }
                                  if(biggest38244 == 1){
                                    active[1]=1;
                                    ends[1]=1;
                                    break RUN;
                                  }
                                }
                                else {
                                  System.out.println("ConveyorController: Motor is off");//sysj\controller.sysj line: 34, column: 4
                                  S71=2;
                                  S262=0;
                                  if(!conveyorStatus_o.isPartnerPresent() || conveyorStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 35, column: 4
                                    conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 35, column: 4
                                    S262=1;
                                    active[1]=1;
                                    ends[1]=1;
                                    break RUN;
                                  }
                                  else {
                                    S257=0;
                                    if(conveyorStatus_o.isACK()){//sysj\controller.sysj line: 35, column: 4
                                      conveyorStatus_o.setVal("done");//sysj\controller.sysj line: 35, column: 4
                                      S257=1;
                                      if(!conveyorStatus_o.isACK()){//sysj\controller.sysj line: 35, column: 4
                                        conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 35, column: 4
                                        ends[1]=2;
                                        ;//sysj\controller.sysj line: 35, column: 4
                                        S71=3;
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
                              S22=2;
                              active[1]=1;
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
                        else {
                          active[1]=1;
                          ends[1]=1;
                          break RUN;
                        }
                      
                      case 1 : 
                        if(conveyorReq_in.isREQ()){//sysj\controller.sysj line: 12, column: 3
                          conveyorReq_in.setACK(false);//sysj\controller.sysj line: 12, column: 3
                          ends[1]=2;
                          ;//sysj\controller.sysj line: 12, column: 3
                          req_thread_1 = (Boolean)(conveyorReq_in.getVal() == null ? null : ((Boolean)conveyorReq_in.getVal()));//sysj\controller.sysj line: 14, column: 3
                          S22=1;
                          if(req_thread_1){//sysj\controller.sysj line: 15, column: 3
                            System.out.println("ConveyorController: Request received from orch.");//sysj\controller.sysj line: 16, column: 4
                            S71=0;
                            if(bottleAtPos5.getprestatus()){//sysj\controller.sysj line: 17, column: 12
                              System.out.println("ConveyorController: Moving bottle 5...");//sysj\controller.sysj line: 18, column: 5
                              thread38245(tdone,ends);
                              thread38246(tdone,ends);
                              int biggest38247 = 0;
                              if(ends[2]>=biggest38247){
                                biggest38247=ends[2];
                              }
                              if(ends[3]>=biggest38247){
                                biggest38247=ends[3];
                              }
                              if(biggest38247 == 1){
                                active[1]=1;
                                ends[1]=1;
                                break RUN;
                              }
                            }
                            else {
                              S71=1;
                              if(!bottleAtPos1.getprestatus() && !bottleAtPos5.getprestatus() && !bottleLeftPos5.getprestatus()){//sysj\controller.sysj line: 26, column: 12
                                System.out.println("ConveyorController: No bottle at pos 1 or pos 5.");//sysj\controller.sysj line: 27, column: 5
                                System.out.println("ConveyorController: Motor is on");//sysj\controller.sysj line: 29, column: 6
                                thread38248(tdone,ends);
                                thread38249(tdone,ends);
                                int biggest38250 = 0;
                                if(ends[4]>=biggest38250){
                                  biggest38250=ends[4];
                                }
                                if(ends[5]>=biggest38250){
                                  biggest38250=ends[5];
                                }
                                if(biggest38250 == 1){
                                  active[1]=1;
                                  ends[1]=1;
                                  break RUN;
                                }
                              }
                              else {
                                System.out.println("ConveyorController: Motor is off");//sysj\controller.sysj line: 34, column: 4
                                S71=2;
                                S262=0;
                                if(!conveyorStatus_o.isPartnerPresent() || conveyorStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 35, column: 4
                                  conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 35, column: 4
                                  S262=1;
                                  active[1]=1;
                                  ends[1]=1;
                                  break RUN;
                                }
                                else {
                                  S257=0;
                                  if(conveyorStatus_o.isACK()){//sysj\controller.sysj line: 35, column: 4
                                    conveyorStatus_o.setVal("done");//sysj\controller.sysj line: 35, column: 4
                                    S257=1;
                                    if(!conveyorStatus_o.isACK()){//sysj\controller.sysj line: 35, column: 4
                                      conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 35, column: 4
                                      ends[1]=2;
                                      ;//sysj\controller.sysj line: 35, column: 4
                                      S71=3;
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
                            S22=2;
                            active[1]=1;
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
                  S6=1;
                  S6=0;
                  if(!conveyorReq_in.isPartnerPresent() || conveyorReq_in.isPartnerPreempted()){//sysj\controller.sysj line: 12, column: 3
                    conveyorReq_in.setACK(false);//sysj\controller.sysj line: 12, column: 3
                    S6=1;
                    active[1]=1;
                    ends[1]=1;
                    break RUN;
                  }
                  else {
                    S1=0;
                    if(!conveyorReq_in.isREQ()){//sysj\controller.sysj line: 12, column: 3
                      conveyorReq_in.setACK(true);//sysj\controller.sysj line: 12, column: 3
                      S1=1;
                      if(conveyorReq_in.isREQ()){//sysj\controller.sysj line: 12, column: 3
                        conveyorReq_in.setACK(false);//sysj\controller.sysj line: 12, column: 3
                        ends[1]=2;
                        ;//sysj\controller.sysj line: 12, column: 3
                        req_thread_1 = (Boolean)(conveyorReq_in.getVal() == null ? null : ((Boolean)conveyorReq_in.getVal()));//sysj\controller.sysj line: 14, column: 3
                        S22=1;
                        if(req_thread_1){//sysj\controller.sysj line: 15, column: 3
                          System.out.println("ConveyorController: Request received from orch.");//sysj\controller.sysj line: 16, column: 4
                          S71=0;
                          if(bottleAtPos5.getprestatus()){//sysj\controller.sysj line: 17, column: 12
                            System.out.println("ConveyorController: Moving bottle 5...");//sysj\controller.sysj line: 18, column: 5
                            thread38251(tdone,ends);
                            thread38252(tdone,ends);
                            int biggest38253 = 0;
                            if(ends[2]>=biggest38253){
                              biggest38253=ends[2];
                            }
                            if(ends[3]>=biggest38253){
                              biggest38253=ends[3];
                            }
                            if(biggest38253 == 1){
                              active[1]=1;
                              ends[1]=1;
                              break RUN;
                            }
                          }
                          else {
                            S71=1;
                            if(!bottleAtPos1.getprestatus() && !bottleAtPos5.getprestatus() && !bottleLeftPos5.getprestatus()){//sysj\controller.sysj line: 26, column: 12
                              System.out.println("ConveyorController: No bottle at pos 1 or pos 5.");//sysj\controller.sysj line: 27, column: 5
                              System.out.println("ConveyorController: Motor is on");//sysj\controller.sysj line: 29, column: 6
                              thread38254(tdone,ends);
                              thread38255(tdone,ends);
                              int biggest38256 = 0;
                              if(ends[4]>=biggest38256){
                                biggest38256=ends[4];
                              }
                              if(ends[5]>=biggest38256){
                                biggest38256=ends[5];
                              }
                              if(biggest38256 == 1){
                                active[1]=1;
                                ends[1]=1;
                                break RUN;
                              }
                            }
                            else {
                              System.out.println("ConveyorController: Motor is off");//sysj\controller.sysj line: 34, column: 4
                              S71=2;
                              S262=0;
                              if(!conveyorStatus_o.isPartnerPresent() || conveyorStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 35, column: 4
                                conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 35, column: 4
                                S262=1;
                                active[1]=1;
                                ends[1]=1;
                                break RUN;
                              }
                              else {
                                S257=0;
                                if(conveyorStatus_o.isACK()){//sysj\controller.sysj line: 35, column: 4
                                  conveyorStatus_o.setVal("done");//sysj\controller.sysj line: 35, column: 4
                                  S257=1;
                                  if(!conveyorStatus_o.isACK()){//sysj\controller.sysj line: 35, column: 4
                                    conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 35, column: 4
                                    ends[1]=2;
                                    ;//sysj\controller.sysj line: 35, column: 4
                                    S71=3;
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
                          S22=2;
                          active[1]=1;
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
                    else {
                      active[1]=1;
                      ends[1]=1;
                      break RUN;
                    }
                  }
                
              }
              break;
            
            case 1 : 
              switch(S71){
                case 0 : 
                  if(bottleLeftPos5.getprestatus()){//sysj\controller.sysj line: 19, column: 11
                    System.out.println("ConveyorController: Moved bottle 5.");//sysj\controller.sysj line: 22, column: 5
                    S71=1;
                    if(!bottleAtPos1.getprestatus() && !bottleAtPos5.getprestatus() && !bottleLeftPos5.getprestatus()){//sysj\controller.sysj line: 26, column: 12
                      System.out.println("ConveyorController: No bottle at pos 1 or pos 5.");//sysj\controller.sysj line: 27, column: 5
                      System.out.println("ConveyorController: Motor is on");//sysj\controller.sysj line: 29, column: 6
                      thread38257(tdone,ends);
                      thread38258(tdone,ends);
                      int biggest38259 = 0;
                      if(ends[4]>=biggest38259){
                        biggest38259=ends[4];
                      }
                      if(ends[5]>=biggest38259){
                        biggest38259=ends[5];
                      }
                      if(biggest38259 == 1){
                        active[1]=1;
                        ends[1]=1;
                        break RUN;
                      }
                    }
                    else {
                      System.out.println("ConveyorController: Motor is off");//sysj\controller.sysj line: 34, column: 4
                      S71=2;
                      S262=0;
                      if(!conveyorStatus_o.isPartnerPresent() || conveyorStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 35, column: 4
                        conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 35, column: 4
                        S262=1;
                        active[1]=1;
                        ends[1]=1;
                        break RUN;
                      }
                      else {
                        S257=0;
                        if(conveyorStatus_o.isACK()){//sysj\controller.sysj line: 35, column: 4
                          conveyorStatus_o.setVal("done");//sysj\controller.sysj line: 35, column: 4
                          S257=1;
                          if(!conveyorStatus_o.isACK()){//sysj\controller.sysj line: 35, column: 4
                            conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 35, column: 4
                            ends[1]=2;
                            ;//sysj\controller.sysj line: 35, column: 4
                            S71=3;
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
                    thread38260(tdone,ends);
                    thread38261(tdone,ends);
                    int biggest38262 = 0;
                    if(ends[2]>=biggest38262){
                      biggest38262=ends[2];
                    }
                    if(ends[3]>=biggest38262){
                      biggest38262=ends[3];
                    }
                    if(biggest38262 == 1){
                      active[1]=1;
                      ends[1]=1;
                      break RUN;
                    }
                    //FINXME code
                    if(biggest38262 == 0){
                      System.out.println("ConveyorController: Moved bottle 5.");//sysj\controller.sysj line: 22, column: 5
                      S71=1;
                      if(!bottleAtPos1.getprestatus() && !bottleAtPos5.getprestatus() && !bottleLeftPos5.getprestatus()){//sysj\controller.sysj line: 26, column: 12
                        System.out.println("ConveyorController: No bottle at pos 1 or pos 5.");//sysj\controller.sysj line: 27, column: 5
                        System.out.println("ConveyorController: Motor is on");//sysj\controller.sysj line: 29, column: 6
                        thread38263(tdone,ends);
                        thread38264(tdone,ends);
                        int biggest38265 = 0;
                        if(ends[4]>=biggest38265){
                          biggest38265=ends[4];
                        }
                        if(ends[5]>=biggest38265){
                          biggest38265=ends[5];
                        }
                        if(biggest38265 == 1){
                          active[1]=1;
                          ends[1]=1;
                          break RUN;
                        }
                      }
                      else {
                        System.out.println("ConveyorController: Motor is off");//sysj\controller.sysj line: 34, column: 4
                        S71=2;
                        S262=0;
                        if(!conveyorStatus_o.isPartnerPresent() || conveyorStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 35, column: 4
                          conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 35, column: 4
                          S262=1;
                          active[1]=1;
                          ends[1]=1;
                          break RUN;
                        }
                        else {
                          S257=0;
                          if(conveyorStatus_o.isACK()){//sysj\controller.sysj line: 35, column: 4
                            conveyorStatus_o.setVal("done");//sysj\controller.sysj line: 35, column: 4
                            S257=1;
                            if(!conveyorStatus_o.isACK()){//sysj\controller.sysj line: 35, column: 4
                              conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 35, column: 4
                              ends[1]=2;
                              ;//sysj\controller.sysj line: 35, column: 4
                              S71=3;
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
                
                case 1 : 
                  if(bottleAtPos1.getprestatus()){//sysj\controller.sysj line: 28, column: 11
                    System.out.println("ConveyorController: Motor is off");//sysj\controller.sysj line: 34, column: 4
                    S71=2;
                    S262=0;
                    if(!conveyorStatus_o.isPartnerPresent() || conveyorStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 35, column: 4
                      conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 35, column: 4
                      S262=1;
                      active[1]=1;
                      ends[1]=1;
                      break RUN;
                    }
                    else {
                      S257=0;
                      if(conveyorStatus_o.isACK()){//sysj\controller.sysj line: 35, column: 4
                        conveyorStatus_o.setVal("done");//sysj\controller.sysj line: 35, column: 4
                        S257=1;
                        if(!conveyorStatus_o.isACK()){//sysj\controller.sysj line: 35, column: 4
                          conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 35, column: 4
                          ends[1]=2;
                          ;//sysj\controller.sysj line: 35, column: 4
                          S71=3;
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
                    thread38266(tdone,ends);
                    thread38267(tdone,ends);
                    int biggest38268 = 0;
                    if(ends[4]>=biggest38268){
                      biggest38268=ends[4];
                    }
                    if(ends[5]>=biggest38268){
                      biggest38268=ends[5];
                    }
                    if(biggest38268 == 1){
                      active[1]=1;
                      ends[1]=1;
                      break RUN;
                    }
                    //FINXME code
                    if(biggest38268 == 0){
                      System.out.println("ConveyorController: Motor is off");//sysj\controller.sysj line: 34, column: 4
                      S71=2;
                      S262=0;
                      if(!conveyorStatus_o.isPartnerPresent() || conveyorStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 35, column: 4
                        conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 35, column: 4
                        S262=1;
                        active[1]=1;
                        ends[1]=1;
                        break RUN;
                      }
                      else {
                        S257=0;
                        if(conveyorStatus_o.isACK()){//sysj\controller.sysj line: 35, column: 4
                          conveyorStatus_o.setVal("done");//sysj\controller.sysj line: 35, column: 4
                          S257=1;
                          if(!conveyorStatus_o.isACK()){//sysj\controller.sysj line: 35, column: 4
                            conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 35, column: 4
                            ends[1]=2;
                            ;//sysj\controller.sysj line: 35, column: 4
                            S71=3;
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
                  switch(S262){
                    case 0 : 
                      if(!conveyorStatus_o.isPartnerPresent() || conveyorStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 35, column: 4
                        conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 35, column: 4
                        S262=1;
                        active[1]=1;
                        ends[1]=1;
                        break RUN;
                      }
                      else {
                        switch(S257){
                          case 0 : 
                            if(conveyorStatus_o.isACK()){//sysj\controller.sysj line: 35, column: 4
                              conveyorStatus_o.setVal("done");//sysj\controller.sysj line: 35, column: 4
                              S257=1;
                              if(!conveyorStatus_o.isACK()){//sysj\controller.sysj line: 35, column: 4
                                conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 35, column: 4
                                ends[1]=2;
                                ;//sysj\controller.sysj line: 35, column: 4
                                S71=3;
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
                              S71=3;
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
                      S262=1;
                      S262=0;
                      if(!conveyorStatus_o.isPartnerPresent() || conveyorStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 35, column: 4
                        conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 35, column: 4
                        S262=1;
                        active[1]=1;
                        ends[1]=1;
                        break RUN;
                      }
                      else {
                        S257=0;
                        if(conveyorStatus_o.isACK()){//sysj\controller.sysj line: 35, column: 4
                          conveyorStatus_o.setVal("done");//sysj\controller.sysj line: 35, column: 4
                          S257=1;
                          if(!conveyorStatus_o.isACK()){//sysj\controller.sysj line: 35, column: 4
                            conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 35, column: 4
                            ends[1]=2;
                            ;//sysj\controller.sysj line: 35, column: 4
                            S71=3;
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
                  S71=3;
                  S22=2;
                  active[1]=1;
                  ends[1]=1;
                  break RUN;
                
              }
              break;
            
            case 2 : 
              S22=2;
              S22=0;
              S6=0;
              if(!conveyorReq_in.isPartnerPresent() || conveyorReq_in.isPartnerPreempted()){//sysj\controller.sysj line: 12, column: 3
                conveyorReq_in.setACK(false);//sysj\controller.sysj line: 12, column: 3
                S6=1;
                active[1]=1;
                ends[1]=1;
                break RUN;
              }
              else {
                S1=0;
                if(!conveyorReq_in.isREQ()){//sysj\controller.sysj line: 12, column: 3
                  conveyorReq_in.setACK(true);//sysj\controller.sysj line: 12, column: 3
                  S1=1;
                  if(conveyorReq_in.isREQ()){//sysj\controller.sysj line: 12, column: 3
                    conveyorReq_in.setACK(false);//sysj\controller.sysj line: 12, column: 3
                    ends[1]=2;
                    ;//sysj\controller.sysj line: 12, column: 3
                    req_thread_1 = (Boolean)(conveyorReq_in.getVal() == null ? null : ((Boolean)conveyorReq_in.getVal()));//sysj\controller.sysj line: 14, column: 3
                    S22=1;
                    if(req_thread_1){//sysj\controller.sysj line: 15, column: 3
                      System.out.println("ConveyorController: Request received from orch.");//sysj\controller.sysj line: 16, column: 4
                      S71=0;
                      if(bottleAtPos5.getprestatus()){//sysj\controller.sysj line: 17, column: 12
                        System.out.println("ConveyorController: Moving bottle 5...");//sysj\controller.sysj line: 18, column: 5
                        thread38269(tdone,ends);
                        thread38270(tdone,ends);
                        int biggest38271 = 0;
                        if(ends[2]>=biggest38271){
                          biggest38271=ends[2];
                        }
                        if(ends[3]>=biggest38271){
                          biggest38271=ends[3];
                        }
                        if(biggest38271 == 1){
                          active[1]=1;
                          ends[1]=1;
                          break RUN;
                        }
                      }
                      else {
                        S71=1;
                        if(!bottleAtPos1.getprestatus() && !bottleAtPos5.getprestatus() && !bottleLeftPos5.getprestatus()){//sysj\controller.sysj line: 26, column: 12
                          System.out.println("ConveyorController: No bottle at pos 1 or pos 5.");//sysj\controller.sysj line: 27, column: 5
                          System.out.println("ConveyorController: Motor is on");//sysj\controller.sysj line: 29, column: 6
                          thread38272(tdone,ends);
                          thread38273(tdone,ends);
                          int biggest38274 = 0;
                          if(ends[4]>=biggest38274){
                            biggest38274=ends[4];
                          }
                          if(ends[5]>=biggest38274){
                            biggest38274=ends[5];
                          }
                          if(biggest38274 == 1){
                            active[1]=1;
                            ends[1]=1;
                            break RUN;
                          }
                        }
                        else {
                          System.out.println("ConveyorController: Motor is off");//sysj\controller.sysj line: 34, column: 4
                          S71=2;
                          S262=0;
                          if(!conveyorStatus_o.isPartnerPresent() || conveyorStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 35, column: 4
                            conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 35, column: 4
                            S262=1;
                            active[1]=1;
                            ends[1]=1;
                            break RUN;
                          }
                          else {
                            S257=0;
                            if(conveyorStatus_o.isACK()){//sysj\controller.sysj line: 35, column: 4
                              conveyorStatus_o.setVal("done");//sysj\controller.sysj line: 35, column: 4
                              S257=1;
                              if(!conveyorStatus_o.isACK()){//sysj\controller.sysj line: 35, column: 4
                                conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 35, column: 4
                                ends[1]=2;
                                ;//sysj\controller.sysj line: 35, column: 4
                                S71=3;
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
                      S22=2;
                      active[1]=1;
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
    char [] active1 = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
    char [] paused1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    char [] suspended1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
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
