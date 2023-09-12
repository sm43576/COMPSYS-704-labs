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
  
  public void thread39544(int [] tdone, int [] ends){
        S81=1;
    motorPos1On.setPresent();//sysj\controller.sysj line: 30, column: 38
    currsigs.addElement(motorPos1On);
    active[5]=1;
    ends[5]=1;
    tdone[5]=1;
  }

  public void thread39543(int [] tdone, int [] ends){
        S76=1;
    motConveyorOnOff.setPresent();//sysj\controller.sysj line: 30, column: 7
    currsigs.addElement(motConveyorOnOff);
    active[4]=1;
    ends[4]=1;
    tdone[4]=1;
  }

  public void thread39541(int [] tdone, int [] ends){
        S32=1;
    motorPos5On.setPresent();//sysj\controller.sysj line: 20, column: 38
    currsigs.addElement(motorPos5On);
    active[3]=1;
    ends[3]=1;
    tdone[3]=1;
  }

  public void thread39540(int [] tdone, int [] ends){
        S27=1;
    motConveyorOnOff.setPresent();//sysj\controller.sysj line: 20, column: 7
    currsigs.addElement(motConveyorOnOff);
    active[2]=1;
    ends[2]=1;
    tdone[2]=1;
  }

  public void thread39538(int [] tdone, int [] ends){
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

  public void thread39537(int [] tdone, int [] ends){
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

  public void thread39535(int [] tdone, int [] ends){
        S81=1;
    motorPos1On.setPresent();//sysj\controller.sysj line: 30, column: 38
    currsigs.addElement(motorPos1On);
    active[5]=1;
    ends[5]=1;
    tdone[5]=1;
  }

  public void thread39534(int [] tdone, int [] ends){
        S76=1;
    motConveyorOnOff.setPresent();//sysj\controller.sysj line: 30, column: 7
    currsigs.addElement(motConveyorOnOff);
    active[4]=1;
    ends[4]=1;
    tdone[4]=1;
  }

  public void thread39532(int [] tdone, int [] ends){
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

  public void thread39531(int [] tdone, int [] ends){
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

  public void thread39529(int [] tdone, int [] ends){
        S81=1;
    motorPos1On.setPresent();//sysj\controller.sysj line: 30, column: 38
    currsigs.addElement(motorPos1On);
    active[5]=1;
    ends[5]=1;
    tdone[5]=1;
  }

  public void thread39528(int [] tdone, int [] ends){
        S76=1;
    motConveyorOnOff.setPresent();//sysj\controller.sysj line: 30, column: 7
    currsigs.addElement(motConveyorOnOff);
    active[4]=1;
    ends[4]=1;
    tdone[4]=1;
  }

  public void thread39526(int [] tdone, int [] ends){
        S81=1;
    motorPos1On.setPresent();//sysj\controller.sysj line: 30, column: 38
    currsigs.addElement(motorPos1On);
    active[5]=1;
    ends[5]=1;
    tdone[5]=1;
  }

  public void thread39525(int [] tdone, int [] ends){
        S76=1;
    motConveyorOnOff.setPresent();//sysj\controller.sysj line: 30, column: 7
    currsigs.addElement(motConveyorOnOff);
    active[4]=1;
    ends[4]=1;
    tdone[4]=1;
  }

  public void thread39523(int [] tdone, int [] ends){
        S32=1;
    motorPos5On.setPresent();//sysj\controller.sysj line: 20, column: 38
    currsigs.addElement(motorPos5On);
    active[3]=1;
    ends[3]=1;
    tdone[3]=1;
  }

  public void thread39522(int [] tdone, int [] ends){
        S27=1;
    motConveyorOnOff.setPresent();//sysj\controller.sysj line: 20, column: 7
    currsigs.addElement(motConveyorOnOff);
    active[2]=1;
    ends[2]=1;
    tdone[2]=1;
  }

  public void thread39520(int [] tdone, int [] ends){
        S81=1;
    motorPos1On.setPresent();//sysj\controller.sysj line: 30, column: 38
    currsigs.addElement(motorPos1On);
    active[5]=1;
    ends[5]=1;
    tdone[5]=1;
  }

  public void thread39519(int [] tdone, int [] ends){
        S76=1;
    motConveyorOnOff.setPresent();//sysj\controller.sysj line: 30, column: 7
    currsigs.addElement(motConveyorOnOff);
    active[4]=1;
    ends[4]=1;
    tdone[4]=1;
  }

  public void thread39517(int [] tdone, int [] ends){
        S32=1;
    motorPos5On.setPresent();//sysj\controller.sysj line: 20, column: 38
    currsigs.addElement(motorPos5On);
    active[3]=1;
    ends[3]=1;
    tdone[3]=1;
  }

  public void thread39516(int [] tdone, int [] ends){
        S27=1;
    motConveyorOnOff.setPresent();//sysj\controller.sysj line: 20, column: 7
    currsigs.addElement(motConveyorOnOff);
    active[2]=1;
    ends[2]=1;
    tdone[2]=1;
  }

  public void thread39514(int [] tdone, int [] ends){
        S81=1;
    motorPos1On.setPresent();//sysj\controller.sysj line: 30, column: 38
    currsigs.addElement(motorPos1On);
    active[5]=1;
    ends[5]=1;
    tdone[5]=1;
  }

  public void thread39513(int [] tdone, int [] ends){
        S76=1;
    motConveyorOnOff.setPresent();//sysj\controller.sysj line: 30, column: 7
    currsigs.addElement(motConveyorOnOff);
    active[4]=1;
    ends[4]=1;
    tdone[4]=1;
  }

  public void thread39511(int [] tdone, int [] ends){
        S32=1;
    motorPos5On.setPresent();//sysj\controller.sysj line: 20, column: 38
    currsigs.addElement(motorPos5On);
    active[3]=1;
    ends[3]=1;
    tdone[3]=1;
  }

  public void thread39510(int [] tdone, int [] ends){
        S27=1;
    motConveyorOnOff.setPresent();//sysj\controller.sysj line: 20, column: 7
    currsigs.addElement(motConveyorOnOff);
    active[2]=1;
    ends[2]=1;
    tdone[2]=1;
  }

  public void thread39508(int [] tdone, int [] ends){
        S81=1;
    motorPos1On.setPresent();//sysj\controller.sysj line: 30, column: 38
    currsigs.addElement(motorPos1On);
    active[5]=1;
    ends[5]=1;
    tdone[5]=1;
  }

  public void thread39507(int [] tdone, int [] ends){
        S76=1;
    motConveyorOnOff.setPresent();//sysj\controller.sysj line: 30, column: 7
    currsigs.addElement(motConveyorOnOff);
    active[4]=1;
    ends[4]=1;
    tdone[4]=1;
  }

  public void thread39505(int [] tdone, int [] ends){
        S32=1;
    motorPos5On.setPresent();//sysj\controller.sysj line: 20, column: 38
    currsigs.addElement(motorPos5On);
    active[3]=1;
    ends[3]=1;
    tdone[3]=1;
  }

  public void thread39504(int [] tdone, int [] ends){
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
                    thread39504(tdone,ends);
                    thread39505(tdone,ends);
                    int biggest39506 = 0;
                    if(ends[2]>=biggest39506){
                      biggest39506=ends[2];
                    }
                    if(ends[3]>=biggest39506){
                      biggest39506=ends[3];
                    }
                    if(biggest39506 == 1){
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
                      thread39507(tdone,ends);
                      thread39508(tdone,ends);
                      int biggest39509 = 0;
                      if(ends[4]>=biggest39509){
                        biggest39509=ends[4];
                      }
                      if(ends[5]>=biggest39509){
                        biggest39509=ends[5];
                      }
                      if(biggest39509 == 1){
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
                                thread39510(tdone,ends);
                                thread39511(tdone,ends);
                                int biggest39512 = 0;
                                if(ends[2]>=biggest39512){
                                  biggest39512=ends[2];
                                }
                                if(ends[3]>=biggest39512){
                                  biggest39512=ends[3];
                                }
                                if(biggest39512 == 1){
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
                                  thread39513(tdone,ends);
                                  thread39514(tdone,ends);
                                  int biggest39515 = 0;
                                  if(ends[4]>=biggest39515){
                                    biggest39515=ends[4];
                                  }
                                  if(ends[5]>=biggest39515){
                                    biggest39515=ends[5];
                                  }
                                  if(biggest39515 == 1){
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
                              thread39516(tdone,ends);
                              thread39517(tdone,ends);
                              int biggest39518 = 0;
                              if(ends[2]>=biggest39518){
                                biggest39518=ends[2];
                              }
                              if(ends[3]>=biggest39518){
                                biggest39518=ends[3];
                              }
                              if(biggest39518 == 1){
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
                                thread39519(tdone,ends);
                                thread39520(tdone,ends);
                                int biggest39521 = 0;
                                if(ends[4]>=biggest39521){
                                  biggest39521=ends[4];
                                }
                                if(ends[5]>=biggest39521){
                                  biggest39521=ends[5];
                                }
                                if(biggest39521 == 1){
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
                            thread39522(tdone,ends);
                            thread39523(tdone,ends);
                            int biggest39524 = 0;
                            if(ends[2]>=biggest39524){
                              biggest39524=ends[2];
                            }
                            if(ends[3]>=biggest39524){
                              biggest39524=ends[3];
                            }
                            if(biggest39524 == 1){
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
                              thread39525(tdone,ends);
                              thread39526(tdone,ends);
                              int biggest39527 = 0;
                              if(ends[4]>=biggest39527){
                                biggest39527=ends[4];
                              }
                              if(ends[5]>=biggest39527){
                                biggest39527=ends[5];
                              }
                              if(biggest39527 == 1){
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
                      thread39528(tdone,ends);
                      thread39529(tdone,ends);
                      int biggest39530 = 0;
                      if(ends[4]>=biggest39530){
                        biggest39530=ends[4];
                      }
                      if(ends[5]>=biggest39530){
                        biggest39530=ends[5];
                      }
                      if(biggest39530 == 1){
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
                    thread39531(tdone,ends);
                    thread39532(tdone,ends);
                    int biggest39533 = 0;
                    if(ends[2]>=biggest39533){
                      biggest39533=ends[2];
                    }
                    if(ends[3]>=biggest39533){
                      biggest39533=ends[3];
                    }
                    if(biggest39533 == 1){
                      active[1]=1;
                      ends[1]=1;
                      break RUN;
                    }
                    //FINXME code
                    if(biggest39533 == 0){
                      System.out.println("ConveyorController: Moved bottle 5.");//sysj\controller.sysj line: 22, column: 5
                      S71=1;
                      if(!bottleAtPos1.getprestatus() && !bottleAtPos5.getprestatus() && !bottleLeftPos5.getprestatus()){//sysj\controller.sysj line: 26, column: 12
                        System.out.println("ConveyorController: No bottle at pos 1 or pos 5.");//sysj\controller.sysj line: 27, column: 5
                        System.out.println("ConveyorController: Motor is on");//sysj\controller.sysj line: 29, column: 6
                        thread39534(tdone,ends);
                        thread39535(tdone,ends);
                        int biggest39536 = 0;
                        if(ends[4]>=biggest39536){
                          biggest39536=ends[4];
                        }
                        if(ends[5]>=biggest39536){
                          biggest39536=ends[5];
                        }
                        if(biggest39536 == 1){
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
                    thread39537(tdone,ends);
                    thread39538(tdone,ends);
                    int biggest39539 = 0;
                    if(ends[4]>=biggest39539){
                      biggest39539=ends[4];
                    }
                    if(ends[5]>=biggest39539){
                      biggest39539=ends[5];
                    }
                    if(biggest39539 == 1){
                      active[1]=1;
                      ends[1]=1;
                      break RUN;
                    }
                    //FINXME code
                    if(biggest39539 == 0){
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
                        thread39540(tdone,ends);
                        thread39541(tdone,ends);
                        int biggest39542 = 0;
                        if(ends[2]>=biggest39542){
                          biggest39542=ends[2];
                        }
                        if(ends[3]>=biggest39542){
                          biggest39542=ends[3];
                        }
                        if(biggest39542 == 1){
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
                          thread39543(tdone,ends);
                          thread39544(tdone,ends);
                          int biggest39545 = 0;
                          if(ends[4]>=biggest39545){
                            biggest39545=ends[4];
                          }
                          if(ends[5]>=biggest39545){
                            biggest39545=ends[5];
                          }
                          if(biggest39545 == 1){
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
