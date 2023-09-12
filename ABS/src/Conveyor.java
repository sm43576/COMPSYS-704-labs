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
  
  public void thread40504(int [] tdone, int [] ends){
        S81=1;
    motorPos1On.setPresent();//sysj\controller.sysj line: 30, column: 38
    currsigs.addElement(motorPos1On);
    active[5]=1;
    ends[5]=1;
    tdone[5]=1;
  }

  public void thread40503(int [] tdone, int [] ends){
        S76=1;
    motConveyorOnOff.setPresent();//sysj\controller.sysj line: 30, column: 7
    currsigs.addElement(motConveyorOnOff);
    active[4]=1;
    ends[4]=1;
    tdone[4]=1;
  }

  public void thread40501(int [] tdone, int [] ends){
        S32=1;
    motorPos5On.setPresent();//sysj\controller.sysj line: 20, column: 38
    currsigs.addElement(motorPos5On);
    active[3]=1;
    ends[3]=1;
    tdone[3]=1;
  }

  public void thread40500(int [] tdone, int [] ends){
        S27=1;
    motConveyorOnOff.setPresent();//sysj\controller.sysj line: 20, column: 7
    currsigs.addElement(motConveyorOnOff);
    active[2]=1;
    ends[2]=1;
    tdone[2]=1;
  }

  public void thread40498(int [] tdone, int [] ends){
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

  public void thread40497(int [] tdone, int [] ends){
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

  public void thread40495(int [] tdone, int [] ends){
        S81=1;
    motorPos1On.setPresent();//sysj\controller.sysj line: 30, column: 38
    currsigs.addElement(motorPos1On);
    active[5]=1;
    ends[5]=1;
    tdone[5]=1;
  }

  public void thread40494(int [] tdone, int [] ends){
        S76=1;
    motConveyorOnOff.setPresent();//sysj\controller.sysj line: 30, column: 7
    currsigs.addElement(motConveyorOnOff);
    active[4]=1;
    ends[4]=1;
    tdone[4]=1;
  }

  public void thread40492(int [] tdone, int [] ends){
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

  public void thread40491(int [] tdone, int [] ends){
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

  public void thread40489(int [] tdone, int [] ends){
        S81=1;
    motorPos1On.setPresent();//sysj\controller.sysj line: 30, column: 38
    currsigs.addElement(motorPos1On);
    active[5]=1;
    ends[5]=1;
    tdone[5]=1;
  }

  public void thread40488(int [] tdone, int [] ends){
        S76=1;
    motConveyorOnOff.setPresent();//sysj\controller.sysj line: 30, column: 7
    currsigs.addElement(motConveyorOnOff);
    active[4]=1;
    ends[4]=1;
    tdone[4]=1;
  }

  public void thread40486(int [] tdone, int [] ends){
        S81=1;
    motorPos1On.setPresent();//sysj\controller.sysj line: 30, column: 38
    currsigs.addElement(motorPos1On);
    active[5]=1;
    ends[5]=1;
    tdone[5]=1;
  }

  public void thread40485(int [] tdone, int [] ends){
        S76=1;
    motConveyorOnOff.setPresent();//sysj\controller.sysj line: 30, column: 7
    currsigs.addElement(motConveyorOnOff);
    active[4]=1;
    ends[4]=1;
    tdone[4]=1;
  }

  public void thread40483(int [] tdone, int [] ends){
        S32=1;
    motorPos5On.setPresent();//sysj\controller.sysj line: 20, column: 38
    currsigs.addElement(motorPos5On);
    active[3]=1;
    ends[3]=1;
    tdone[3]=1;
  }

  public void thread40482(int [] tdone, int [] ends){
        S27=1;
    motConveyorOnOff.setPresent();//sysj\controller.sysj line: 20, column: 7
    currsigs.addElement(motConveyorOnOff);
    active[2]=1;
    ends[2]=1;
    tdone[2]=1;
  }

  public void thread40480(int [] tdone, int [] ends){
        S81=1;
    motorPos1On.setPresent();//sysj\controller.sysj line: 30, column: 38
    currsigs.addElement(motorPos1On);
    active[5]=1;
    ends[5]=1;
    tdone[5]=1;
  }

  public void thread40479(int [] tdone, int [] ends){
        S76=1;
    motConveyorOnOff.setPresent();//sysj\controller.sysj line: 30, column: 7
    currsigs.addElement(motConveyorOnOff);
    active[4]=1;
    ends[4]=1;
    tdone[4]=1;
  }

  public void thread40477(int [] tdone, int [] ends){
        S32=1;
    motorPos5On.setPresent();//sysj\controller.sysj line: 20, column: 38
    currsigs.addElement(motorPos5On);
    active[3]=1;
    ends[3]=1;
    tdone[3]=1;
  }

  public void thread40476(int [] tdone, int [] ends){
        S27=1;
    motConveyorOnOff.setPresent();//sysj\controller.sysj line: 20, column: 7
    currsigs.addElement(motConveyorOnOff);
    active[2]=1;
    ends[2]=1;
    tdone[2]=1;
  }

  public void thread40474(int [] tdone, int [] ends){
        S81=1;
    motorPos1On.setPresent();//sysj\controller.sysj line: 30, column: 38
    currsigs.addElement(motorPos1On);
    active[5]=1;
    ends[5]=1;
    tdone[5]=1;
  }

  public void thread40473(int [] tdone, int [] ends){
        S76=1;
    motConveyorOnOff.setPresent();//sysj\controller.sysj line: 30, column: 7
    currsigs.addElement(motConveyorOnOff);
    active[4]=1;
    ends[4]=1;
    tdone[4]=1;
  }

  public void thread40471(int [] tdone, int [] ends){
        S32=1;
    motorPos5On.setPresent();//sysj\controller.sysj line: 20, column: 38
    currsigs.addElement(motorPos5On);
    active[3]=1;
    ends[3]=1;
    tdone[3]=1;
  }

  public void thread40470(int [] tdone, int [] ends){
        S27=1;
    motConveyorOnOff.setPresent();//sysj\controller.sysj line: 20, column: 7
    currsigs.addElement(motConveyorOnOff);
    active[2]=1;
    ends[2]=1;
    tdone[2]=1;
  }

  public void thread40468(int [] tdone, int [] ends){
        S81=1;
    motorPos1On.setPresent();//sysj\controller.sysj line: 30, column: 38
    currsigs.addElement(motorPos1On);
    active[5]=1;
    ends[5]=1;
    tdone[5]=1;
  }

  public void thread40467(int [] tdone, int [] ends){
        S76=1;
    motConveyorOnOff.setPresent();//sysj\controller.sysj line: 30, column: 7
    currsigs.addElement(motConveyorOnOff);
    active[4]=1;
    ends[4]=1;
    tdone[4]=1;
  }

  public void thread40465(int [] tdone, int [] ends){
        S32=1;
    motorPos5On.setPresent();//sysj\controller.sysj line: 20, column: 38
    currsigs.addElement(motorPos5On);
    active[3]=1;
    ends[3]=1;
    tdone[3]=1;
  }

  public void thread40464(int [] tdone, int [] ends){
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
                    thread40464(tdone,ends);
                    thread40465(tdone,ends);
                    int biggest40466 = 0;
                    if(ends[2]>=biggest40466){
                      biggest40466=ends[2];
                    }
                    if(ends[3]>=biggest40466){
                      biggest40466=ends[3];
                    }
                    if(biggest40466 == 1){
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
                      thread40467(tdone,ends);
                      thread40468(tdone,ends);
                      int biggest40469 = 0;
                      if(ends[4]>=biggest40469){
                        biggest40469=ends[4];
                      }
                      if(ends[5]>=biggest40469){
                        biggest40469=ends[5];
                      }
                      if(biggest40469 == 1){
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
                                thread40470(tdone,ends);
                                thread40471(tdone,ends);
                                int biggest40472 = 0;
                                if(ends[2]>=biggest40472){
                                  biggest40472=ends[2];
                                }
                                if(ends[3]>=biggest40472){
                                  biggest40472=ends[3];
                                }
                                if(biggest40472 == 1){
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
                                  thread40473(tdone,ends);
                                  thread40474(tdone,ends);
                                  int biggest40475 = 0;
                                  if(ends[4]>=biggest40475){
                                    biggest40475=ends[4];
                                  }
                                  if(ends[5]>=biggest40475){
                                    biggest40475=ends[5];
                                  }
                                  if(biggest40475 == 1){
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
                              thread40476(tdone,ends);
                              thread40477(tdone,ends);
                              int biggest40478 = 0;
                              if(ends[2]>=biggest40478){
                                biggest40478=ends[2];
                              }
                              if(ends[3]>=biggest40478){
                                biggest40478=ends[3];
                              }
                              if(biggest40478 == 1){
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
                                thread40479(tdone,ends);
                                thread40480(tdone,ends);
                                int biggest40481 = 0;
                                if(ends[4]>=biggest40481){
                                  biggest40481=ends[4];
                                }
                                if(ends[5]>=biggest40481){
                                  biggest40481=ends[5];
                                }
                                if(biggest40481 == 1){
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
                            thread40482(tdone,ends);
                            thread40483(tdone,ends);
                            int biggest40484 = 0;
                            if(ends[2]>=biggest40484){
                              biggest40484=ends[2];
                            }
                            if(ends[3]>=biggest40484){
                              biggest40484=ends[3];
                            }
                            if(biggest40484 == 1){
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
                              thread40485(tdone,ends);
                              thread40486(tdone,ends);
                              int biggest40487 = 0;
                              if(ends[4]>=biggest40487){
                                biggest40487=ends[4];
                              }
                              if(ends[5]>=biggest40487){
                                biggest40487=ends[5];
                              }
                              if(biggest40487 == 1){
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
                      thread40488(tdone,ends);
                      thread40489(tdone,ends);
                      int biggest40490 = 0;
                      if(ends[4]>=biggest40490){
                        biggest40490=ends[4];
                      }
                      if(ends[5]>=biggest40490){
                        biggest40490=ends[5];
                      }
                      if(biggest40490 == 1){
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
                    thread40491(tdone,ends);
                    thread40492(tdone,ends);
                    int biggest40493 = 0;
                    if(ends[2]>=biggest40493){
                      biggest40493=ends[2];
                    }
                    if(ends[3]>=biggest40493){
                      biggest40493=ends[3];
                    }
                    if(biggest40493 == 1){
                      active[1]=1;
                      ends[1]=1;
                      break RUN;
                    }
                    //FINXME code
                    if(biggest40493 == 0){
                      System.out.println("ConveyorController: Moved bottle 5.");//sysj\controller.sysj line: 22, column: 5
                      S71=1;
                      if(!bottleAtPos1.getprestatus() && !bottleAtPos5.getprestatus() && !bottleLeftPos5.getprestatus()){//sysj\controller.sysj line: 26, column: 12
                        System.out.println("ConveyorController: No bottle at pos 1 or pos 5.");//sysj\controller.sysj line: 27, column: 5
                        System.out.println("ConveyorController: Motor is on");//sysj\controller.sysj line: 29, column: 6
                        thread40494(tdone,ends);
                        thread40495(tdone,ends);
                        int biggest40496 = 0;
                        if(ends[4]>=biggest40496){
                          biggest40496=ends[4];
                        }
                        if(ends[5]>=biggest40496){
                          biggest40496=ends[5];
                        }
                        if(biggest40496 == 1){
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
                    thread40497(tdone,ends);
                    thread40498(tdone,ends);
                    int biggest40499 = 0;
                    if(ends[4]>=biggest40499){
                      biggest40499=ends[4];
                    }
                    if(ends[5]>=biggest40499){
                      biggest40499=ends[5];
                    }
                    if(biggest40499 == 1){
                      active[1]=1;
                      ends[1]=1;
                      break RUN;
                    }
                    //FINXME code
                    if(biggest40499 == 0){
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
                        thread40500(tdone,ends);
                        thread40501(tdone,ends);
                        int biggest40502 = 0;
                        if(ends[2]>=biggest40502){
                          biggest40502=ends[2];
                        }
                        if(ends[3]>=biggest40502){
                          biggest40502=ends[3];
                        }
                        if(biggest40502 == 1){
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
                          thread40503(tdone,ends);
                          thread40504(tdone,ends);
                          int biggest40505 = 0;
                          if(ends[4]>=biggest40505){
                            biggest40505=ends[4];
                          }
                          if(ends[5]>=biggest40505){
                            biggest40505=ends[5];
                          }
                          if(biggest40505 == 1){
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
