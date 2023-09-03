import java.util.*;
import com.systemj.ClockDomain;
import com.systemj.Signal;
import com.systemj.input_Channel;
import com.systemj.output_Channel;

public class Controller extends ClockDomain{
  public Controller(String name){super(name);}
  Vector currsigs = new Vector();
  private boolean df = false;
  private char [] active;
  private char [] paused;
  private char [] suspended;
  public Signal bottleAtPos1 = new Signal("bottleAtPos1", Signal.INPUT);
  public Signal bottleAtPos5 = new Signal("bottleAtPos5", Signal.INPUT);
  public Signal motConveyorOnOff = new Signal("motConveyorOnOff", Signal.OUTPUT);
  public input_Channel conveyorReq_in = new input_Channel();
  public output_Channel conveyorStatus_o = new output_Channel();
  private Boolean req_thread_1;//sysj\controller.sysj line: 15, column: 3
  private int S1858 = 1;
  private int S22 = 1;
  private int S6 = 1;
  private int S1 = 1;
  private int S171 = 1;
  private int S45 = 1;
  private int S29 = 1;
  private int S24 = 1;
  private int S66 = 1;
  private int S61 = 1;
  private int S132 = 1;
  private int S127 = 1;
  
  private int[] ends = new int[8];
  private int[] tdone = new int[8];
  
  public void runClockDomain(){
    for(int i=0;i<ends.length;i++){
      ends[i] = 0;
      tdone[i] = 0;
    }
    
    RUN: while(true){
      switch(S1858){
        case 0 : 
          S1858=0;
          break RUN;
        
        case 1 : 
          S1858=2;
          S1858=2;
          S22=0;
          S6=0;
          if(!conveyorReq_in.isPartnerPresent() || conveyorReq_in.isPartnerPreempted()){//sysj\controller.sysj line: 13, column: 3
            conveyorReq_in.setACK(false);//sysj\controller.sysj line: 13, column: 3
            S6=1;
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
          else {
            S1=0;
            if(!conveyorReq_in.isREQ()){//sysj\controller.sysj line: 13, column: 3
              conveyorReq_in.setACK(true);//sysj\controller.sysj line: 13, column: 3
              S1=1;
              if(conveyorReq_in.isREQ()){//sysj\controller.sysj line: 13, column: 3
                conveyorReq_in.setACK(false);//sysj\controller.sysj line: 13, column: 3
                ends[1]=2;
                ;//sysj\controller.sysj line: 13, column: 3
                req_thread_1 = (Boolean)(conveyorReq_in.getVal() == null ? null : ((Boolean)conveyorReq_in.getVal()));//sysj\controller.sysj line: 15, column: 3
                System.out.println("received?");//sysj\controller.sysj line: 16, column: 3
                System.out.println(req_thread_1);//sysj\controller.sysj line: 17, column: 3
                S22=1;
                if(req_thread_1){//sysj\controller.sysj line: 19, column: 3
                  S171=0;
                  S45=0;
                  S29=0;
                  if(!conveyorStatus_o.isPartnerPresent() || conveyorStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 20, column: 4
                    conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 20, column: 4
                    S29=1;
                    active[1]=1;
                    ends[1]=1;
                    break RUN;
                  }
                  else {
                    S24=0;
                    if(conveyorStatus_o.isACK()){//sysj\controller.sysj line: 20, column: 4
                      conveyorStatus_o.setVal("busy");//sysj\controller.sysj line: 20, column: 4
                      S24=1;
                      if(!conveyorStatus_o.isACK()){//sysj\controller.sysj line: 20, column: 4
                        conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 20, column: 4
                        ends[1]=2;
                        ;//sysj\controller.sysj line: 20, column: 4
                        System.out.println("conveyor busy");//sysj\controller.sysj line: 22, column: 4
                        S45=1;
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
                  S171=1;
                  System.out.println("conveyor idling");//sysj\controller.sysj line: 40, column: 4
                  S132=0;
                  if(!conveyorStatus_o.isPartnerPresent() || conveyorStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 41, column: 4
                    conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 41, column: 4
                    S132=1;
                    active[1]=1;
                    ends[1]=1;
                    break RUN;
                  }
                  else {
                    S127=0;
                    if(conveyorStatus_o.isACK()){//sysj\controller.sysj line: 41, column: 4
                      conveyorStatus_o.setVal("idle");//sysj\controller.sysj line: 41, column: 4
                      S127=1;
                      if(!conveyorStatus_o.isACK()){//sysj\controller.sysj line: 41, column: 4
                        conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 41, column: 4
                        ends[1]=2;
                        ;//sysj\controller.sysj line: 41, column: 4
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
              else {
                active[1]=1;
                ends[1]=1;
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
                  if(!conveyorReq_in.isPartnerPresent() || conveyorReq_in.isPartnerPreempted()){//sysj\controller.sysj line: 13, column: 3
                    conveyorReq_in.setACK(false);//sysj\controller.sysj line: 13, column: 3
                    S6=1;
                    active[1]=1;
                    ends[1]=1;
                    break RUN;
                  }
                  else {
                    switch(S1){
                      case 0 : 
                        if(!conveyorReq_in.isREQ()){//sysj\controller.sysj line: 13, column: 3
                          conveyorReq_in.setACK(true);//sysj\controller.sysj line: 13, column: 3
                          S1=1;
                          if(conveyorReq_in.isREQ()){//sysj\controller.sysj line: 13, column: 3
                            conveyorReq_in.setACK(false);//sysj\controller.sysj line: 13, column: 3
                            ends[1]=2;
                            ;//sysj\controller.sysj line: 13, column: 3
                            req_thread_1 = (Boolean)(conveyorReq_in.getVal() == null ? null : ((Boolean)conveyorReq_in.getVal()));//sysj\controller.sysj line: 15, column: 3
                            System.out.println("received?");//sysj\controller.sysj line: 16, column: 3
                            System.out.println(req_thread_1);//sysj\controller.sysj line: 17, column: 3
                            S22=1;
                            if(req_thread_1){//sysj\controller.sysj line: 19, column: 3
                              S171=0;
                              S45=0;
                              S29=0;
                              if(!conveyorStatus_o.isPartnerPresent() || conveyorStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 20, column: 4
                                conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 20, column: 4
                                S29=1;
                                active[1]=1;
                                ends[1]=1;
                                break RUN;
                              }
                              else {
                                S24=0;
                                if(conveyorStatus_o.isACK()){//sysj\controller.sysj line: 20, column: 4
                                  conveyorStatus_o.setVal("busy");//sysj\controller.sysj line: 20, column: 4
                                  S24=1;
                                  if(!conveyorStatus_o.isACK()){//sysj\controller.sysj line: 20, column: 4
                                    conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 20, column: 4
                                    ends[1]=2;
                                    ;//sysj\controller.sysj line: 20, column: 4
                                    System.out.println("conveyor busy");//sysj\controller.sysj line: 22, column: 4
                                    S45=1;
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
                              S171=1;
                              System.out.println("conveyor idling");//sysj\controller.sysj line: 40, column: 4
                              S132=0;
                              if(!conveyorStatus_o.isPartnerPresent() || conveyorStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 41, column: 4
                                conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 41, column: 4
                                S132=1;
                                active[1]=1;
                                ends[1]=1;
                                break RUN;
                              }
                              else {
                                S127=0;
                                if(conveyorStatus_o.isACK()){//sysj\controller.sysj line: 41, column: 4
                                  conveyorStatus_o.setVal("idle");//sysj\controller.sysj line: 41, column: 4
                                  S127=1;
                                  if(!conveyorStatus_o.isACK()){//sysj\controller.sysj line: 41, column: 4
                                    conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 41, column: 4
                                    ends[1]=2;
                                    ;//sysj\controller.sysj line: 41, column: 4
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
                          else {
                            active[1]=1;
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
                        if(conveyorReq_in.isREQ()){//sysj\controller.sysj line: 13, column: 3
                          conveyorReq_in.setACK(false);//sysj\controller.sysj line: 13, column: 3
                          ends[1]=2;
                          ;//sysj\controller.sysj line: 13, column: 3
                          req_thread_1 = (Boolean)(conveyorReq_in.getVal() == null ? null : ((Boolean)conveyorReq_in.getVal()));//sysj\controller.sysj line: 15, column: 3
                          System.out.println("received?");//sysj\controller.sysj line: 16, column: 3
                          System.out.println(req_thread_1);//sysj\controller.sysj line: 17, column: 3
                          S22=1;
                          if(req_thread_1){//sysj\controller.sysj line: 19, column: 3
                            S171=0;
                            S45=0;
                            S29=0;
                            if(!conveyorStatus_o.isPartnerPresent() || conveyorStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 20, column: 4
                              conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 20, column: 4
                              S29=1;
                              active[1]=1;
                              ends[1]=1;
                              break RUN;
                            }
                            else {
                              S24=0;
                              if(conveyorStatus_o.isACK()){//sysj\controller.sysj line: 20, column: 4
                                conveyorStatus_o.setVal("busy");//sysj\controller.sysj line: 20, column: 4
                                S24=1;
                                if(!conveyorStatus_o.isACK()){//sysj\controller.sysj line: 20, column: 4
                                  conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 20, column: 4
                                  ends[1]=2;
                                  ;//sysj\controller.sysj line: 20, column: 4
                                  System.out.println("conveyor busy");//sysj\controller.sysj line: 22, column: 4
                                  S45=1;
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
                            S171=1;
                            System.out.println("conveyor idling");//sysj\controller.sysj line: 40, column: 4
                            S132=0;
                            if(!conveyorStatus_o.isPartnerPresent() || conveyorStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 41, column: 4
                              conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 41, column: 4
                              S132=1;
                              active[1]=1;
                              ends[1]=1;
                              break RUN;
                            }
                            else {
                              S127=0;
                              if(conveyorStatus_o.isACK()){//sysj\controller.sysj line: 41, column: 4
                                conveyorStatus_o.setVal("idle");//sysj\controller.sysj line: 41, column: 4
                                S127=1;
                                if(!conveyorStatus_o.isACK()){//sysj\controller.sysj line: 41, column: 4
                                  conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 41, column: 4
                                  ends[1]=2;
                                  ;//sysj\controller.sysj line: 41, column: 4
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
                  if(!conveyorReq_in.isPartnerPresent() || conveyorReq_in.isPartnerPreempted()){//sysj\controller.sysj line: 13, column: 3
                    conveyorReq_in.setACK(false);//sysj\controller.sysj line: 13, column: 3
                    S6=1;
                    active[1]=1;
                    ends[1]=1;
                    break RUN;
                  }
                  else {
                    S1=0;
                    if(!conveyorReq_in.isREQ()){//sysj\controller.sysj line: 13, column: 3
                      conveyorReq_in.setACK(true);//sysj\controller.sysj line: 13, column: 3
                      S1=1;
                      if(conveyorReq_in.isREQ()){//sysj\controller.sysj line: 13, column: 3
                        conveyorReq_in.setACK(false);//sysj\controller.sysj line: 13, column: 3
                        ends[1]=2;
                        ;//sysj\controller.sysj line: 13, column: 3
                        req_thread_1 = (Boolean)(conveyorReq_in.getVal() == null ? null : ((Boolean)conveyorReq_in.getVal()));//sysj\controller.sysj line: 15, column: 3
                        System.out.println("received?");//sysj\controller.sysj line: 16, column: 3
                        System.out.println(req_thread_1);//sysj\controller.sysj line: 17, column: 3
                        S22=1;
                        if(req_thread_1){//sysj\controller.sysj line: 19, column: 3
                          S171=0;
                          S45=0;
                          S29=0;
                          if(!conveyorStatus_o.isPartnerPresent() || conveyorStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 20, column: 4
                            conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 20, column: 4
                            S29=1;
                            active[1]=1;
                            ends[1]=1;
                            break RUN;
                          }
                          else {
                            S24=0;
                            if(conveyorStatus_o.isACK()){//sysj\controller.sysj line: 20, column: 4
                              conveyorStatus_o.setVal("busy");//sysj\controller.sysj line: 20, column: 4
                              S24=1;
                              if(!conveyorStatus_o.isACK()){//sysj\controller.sysj line: 20, column: 4
                                conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 20, column: 4
                                ends[1]=2;
                                ;//sysj\controller.sysj line: 20, column: 4
                                System.out.println("conveyor busy");//sysj\controller.sysj line: 22, column: 4
                                S45=1;
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
                          S171=1;
                          System.out.println("conveyor idling");//sysj\controller.sysj line: 40, column: 4
                          S132=0;
                          if(!conveyorStatus_o.isPartnerPresent() || conveyorStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 41, column: 4
                            conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 41, column: 4
                            S132=1;
                            active[1]=1;
                            ends[1]=1;
                            break RUN;
                          }
                          else {
                            S127=0;
                            if(conveyorStatus_o.isACK()){//sysj\controller.sysj line: 41, column: 4
                              conveyorStatus_o.setVal("idle");//sysj\controller.sysj line: 41, column: 4
                              S127=1;
                              if(!conveyorStatus_o.isACK()){//sysj\controller.sysj line: 41, column: 4
                                conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 41, column: 4
                                ends[1]=2;
                                ;//sysj\controller.sysj line: 41, column: 4
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
                      else {
                        active[1]=1;
                        ends[1]=1;
                        break RUN;
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
              switch(S171){
                case 0 : 
                  switch(S45){
                    case 0 : 
                      switch(S29){
                        case 0 : 
                          if(!conveyorStatus_o.isPartnerPresent() || conveyorStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 20, column: 4
                            conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 20, column: 4
                            S29=1;
                            active[1]=1;
                            ends[1]=1;
                            break RUN;
                          }
                          else {
                            switch(S24){
                              case 0 : 
                                if(conveyorStatus_o.isACK()){//sysj\controller.sysj line: 20, column: 4
                                  conveyorStatus_o.setVal("busy");//sysj\controller.sysj line: 20, column: 4
                                  S24=1;
                                  if(!conveyorStatus_o.isACK()){//sysj\controller.sysj line: 20, column: 4
                                    conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 20, column: 4
                                    ends[1]=2;
                                    ;//sysj\controller.sysj line: 20, column: 4
                                    System.out.println("conveyor busy");//sysj\controller.sysj line: 22, column: 4
                                    S45=1;
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
                                if(!conveyorStatus_o.isACK()){//sysj\controller.sysj line: 20, column: 4
                                  conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 20, column: 4
                                  ends[1]=2;
                                  ;//sysj\controller.sysj line: 20, column: 4
                                  System.out.println("conveyor busy");//sysj\controller.sysj line: 22, column: 4
                                  S45=1;
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
                          S29=1;
                          S29=0;
                          if(!conveyorStatus_o.isPartnerPresent() || conveyorStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 20, column: 4
                            conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 20, column: 4
                            S29=1;
                            active[1]=1;
                            ends[1]=1;
                            break RUN;
                          }
                          else {
                            S24=0;
                            if(conveyorStatus_o.isACK()){//sysj\controller.sysj line: 20, column: 4
                              conveyorStatus_o.setVal("busy");//sysj\controller.sysj line: 20, column: 4
                              S24=1;
                              if(!conveyorStatus_o.isACK()){//sysj\controller.sysj line: 20, column: 4
                                conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 20, column: 4
                                ends[1]=2;
                                ;//sysj\controller.sysj line: 20, column: 4
                                System.out.println("conveyor busy");//sysj\controller.sysj line: 22, column: 4
                                S45=1;
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
                    
                    case 1 : 
                      if(bottleAtPos5.getprestatus()){//sysj\controller.sysj line: 23, column: 10
                        S45=2;
                        active[1]=1;
                        ends[1]=1;
                        break RUN;
                      }
                      else {
                        active[1]=1;
                        ends[1]=1;
                        break RUN;
                      }
                    
                    case 2 : 
                      S45=2;
                      S45=3;
                      if(!bottleAtPos1.getprestatus()){//sysj\controller.sysj line: 28, column: 13
                        motConveyorOnOff.setPresent();//sysj\controller.sysj line: 30, column: 6
                        currsigs.addElement(motConveyorOnOff);
                        active[1]=1;
                        ends[1]=1;
                        break RUN;
                      }
                      else {
                        System.out.println("Motor is off");//sysj\controller.sysj line: 35, column: 4
                        S45=4;
                        S66=0;
                        if(!conveyorStatus_o.isPartnerPresent() || conveyorStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 36, column: 4
                          conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 36, column: 4
                          S66=1;
                          active[1]=1;
                          ends[1]=1;
                          break RUN;
                        }
                        else {
                          S61=0;
                          if(conveyorStatus_o.isACK()){//sysj\controller.sysj line: 36, column: 4
                            conveyorStatus_o.setVal("done");//sysj\controller.sysj line: 36, column: 4
                            S61=1;
                            if(!conveyorStatus_o.isACK()){//sysj\controller.sysj line: 36, column: 4
                              conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 36, column: 4
                              ends[1]=2;
                              ;//sysj\controller.sysj line: 36, column: 4
                              System.out.println("conveyor done");//sysj\controller.sysj line: 37, column: 4
                              S45=5;
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
                    
                    case 3 : 
                      if(bottleAtPos1.getprestatus() && !bottleAtPos5.getprestatus()){//sysj\controller.sysj line: 27, column: 10
                        System.out.println("Motor is off");//sysj\controller.sysj line: 35, column: 4
                        S45=4;
                        S66=0;
                        if(!conveyorStatus_o.isPartnerPresent() || conveyorStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 36, column: 4
                          conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 36, column: 4
                          S66=1;
                          active[1]=1;
                          ends[1]=1;
                          break RUN;
                        }
                        else {
                          S61=0;
                          if(conveyorStatus_o.isACK()){//sysj\controller.sysj line: 36, column: 4
                            conveyorStatus_o.setVal("done");//sysj\controller.sysj line: 36, column: 4
                            S61=1;
                            if(!conveyorStatus_o.isACK()){//sysj\controller.sysj line: 36, column: 4
                              conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 36, column: 4
                              ends[1]=2;
                              ;//sysj\controller.sysj line: 36, column: 4
                              System.out.println("conveyor done");//sysj\controller.sysj line: 37, column: 4
                              S45=5;
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
                        motConveyorOnOff.setPresent();//sysj\controller.sysj line: 30, column: 6
                        currsigs.addElement(motConveyorOnOff);
                        active[1]=1;
                        ends[1]=1;
                        break RUN;
                      }
                    
                    case 4 : 
                      switch(S66){
                        case 0 : 
                          if(!conveyorStatus_o.isPartnerPresent() || conveyorStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 36, column: 4
                            conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 36, column: 4
                            S66=1;
                            active[1]=1;
                            ends[1]=1;
                            break RUN;
                          }
                          else {
                            switch(S61){
                              case 0 : 
                                if(conveyorStatus_o.isACK()){//sysj\controller.sysj line: 36, column: 4
                                  conveyorStatus_o.setVal("done");//sysj\controller.sysj line: 36, column: 4
                                  S61=1;
                                  if(!conveyorStatus_o.isACK()){//sysj\controller.sysj line: 36, column: 4
                                    conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 36, column: 4
                                    ends[1]=2;
                                    ;//sysj\controller.sysj line: 36, column: 4
                                    System.out.println("conveyor done");//sysj\controller.sysj line: 37, column: 4
                                    S45=5;
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
                                  S45=5;
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
                          S66=1;
                          S66=0;
                          if(!conveyorStatus_o.isPartnerPresent() || conveyorStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 36, column: 4
                            conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 36, column: 4
                            S66=1;
                            active[1]=1;
                            ends[1]=1;
                            break RUN;
                          }
                          else {
                            S61=0;
                            if(conveyorStatus_o.isACK()){//sysj\controller.sysj line: 36, column: 4
                              conveyorStatus_o.setVal("done");//sysj\controller.sysj line: 36, column: 4
                              S61=1;
                              if(!conveyorStatus_o.isACK()){//sysj\controller.sysj line: 36, column: 4
                                conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 36, column: 4
                                ends[1]=2;
                                ;//sysj\controller.sysj line: 36, column: 4
                                System.out.println("conveyor done");//sysj\controller.sysj line: 37, column: 4
                                S45=5;
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
                    
                    case 5 : 
                      S45=5;
                      S22=2;
                      active[1]=1;
                      ends[1]=1;
                      break RUN;
                    
                  }
                  break;
                
                case 1 : 
                  switch(S132){
                    case 0 : 
                      if(!conveyorStatus_o.isPartnerPresent() || conveyorStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 41, column: 4
                        conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 41, column: 4
                        S132=1;
                        active[1]=1;
                        ends[1]=1;
                        break RUN;
                      }
                      else {
                        switch(S127){
                          case 0 : 
                            if(conveyorStatus_o.isACK()){//sysj\controller.sysj line: 41, column: 4
                              conveyorStatus_o.setVal("idle");//sysj\controller.sysj line: 41, column: 4
                              S127=1;
                              if(!conveyorStatus_o.isACK()){//sysj\controller.sysj line: 41, column: 4
                                conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 41, column: 4
                                ends[1]=2;
                                ;//sysj\controller.sysj line: 41, column: 4
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
                            if(!conveyorStatus_o.isACK()){//sysj\controller.sysj line: 41, column: 4
                              conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 41, column: 4
                              ends[1]=2;
                              ;//sysj\controller.sysj line: 41, column: 4
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
                      S132=1;
                      S132=0;
                      if(!conveyorStatus_o.isPartnerPresent() || conveyorStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 41, column: 4
                        conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 41, column: 4
                        S132=1;
                        active[1]=1;
                        ends[1]=1;
                        break RUN;
                      }
                      else {
                        S127=0;
                        if(conveyorStatus_o.isACK()){//sysj\controller.sysj line: 41, column: 4
                          conveyorStatus_o.setVal("idle");//sysj\controller.sysj line: 41, column: 4
                          S127=1;
                          if(!conveyorStatus_o.isACK()){//sysj\controller.sysj line: 41, column: 4
                            conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 41, column: 4
                            ends[1]=2;
                            ;//sysj\controller.sysj line: 41, column: 4
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
            
            case 2 : 
              S22=2;
              S22=0;
              S6=0;
              if(!conveyorReq_in.isPartnerPresent() || conveyorReq_in.isPartnerPreempted()){//sysj\controller.sysj line: 13, column: 3
                conveyorReq_in.setACK(false);//sysj\controller.sysj line: 13, column: 3
                S6=1;
                active[1]=1;
                ends[1]=1;
                break RUN;
              }
              else {
                S1=0;
                if(!conveyorReq_in.isREQ()){//sysj\controller.sysj line: 13, column: 3
                  conveyorReq_in.setACK(true);//sysj\controller.sysj line: 13, column: 3
                  S1=1;
                  if(conveyorReq_in.isREQ()){//sysj\controller.sysj line: 13, column: 3
                    conveyorReq_in.setACK(false);//sysj\controller.sysj line: 13, column: 3
                    ends[1]=2;
                    ;//sysj\controller.sysj line: 13, column: 3
                    req_thread_1 = (Boolean)(conveyorReq_in.getVal() == null ? null : ((Boolean)conveyorReq_in.getVal()));//sysj\controller.sysj line: 15, column: 3
                    System.out.println("received?");//sysj\controller.sysj line: 16, column: 3
                    System.out.println(req_thread_1);//sysj\controller.sysj line: 17, column: 3
                    S22=1;
                    if(req_thread_1){//sysj\controller.sysj line: 19, column: 3
                      S171=0;
                      S45=0;
                      S29=0;
                      if(!conveyorStatus_o.isPartnerPresent() || conveyorStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 20, column: 4
                        conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 20, column: 4
                        S29=1;
                        active[1]=1;
                        ends[1]=1;
                        break RUN;
                      }
                      else {
                        S24=0;
                        if(conveyorStatus_o.isACK()){//sysj\controller.sysj line: 20, column: 4
                          conveyorStatus_o.setVal("busy");//sysj\controller.sysj line: 20, column: 4
                          S24=1;
                          if(!conveyorStatus_o.isACK()){//sysj\controller.sysj line: 20, column: 4
                            conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 20, column: 4
                            ends[1]=2;
                            ;//sysj\controller.sysj line: 20, column: 4
                            System.out.println("conveyor busy");//sysj\controller.sysj line: 22, column: 4
                            S45=1;
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
                      S171=1;
                      System.out.println("conveyor idling");//sysj\controller.sysj line: 40, column: 4
                      S132=0;
                      if(!conveyorStatus_o.isPartnerPresent() || conveyorStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 41, column: 4
                        conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 41, column: 4
                        S132=1;
                        active[1]=1;
                        ends[1]=1;
                        break RUN;
                      }
                      else {
                        S127=0;
                        if(conveyorStatus_o.isACK()){//sysj\controller.sysj line: 41, column: 4
                          conveyorStatus_o.setVal("idle");//sysj\controller.sysj line: 41, column: 4
                          S127=1;
                          if(!conveyorStatus_o.isACK()){//sysj\controller.sysj line: 41, column: 4
                            conveyorStatus_o.setREQ(false);//sysj\controller.sysj line: 41, column: 4
                            ends[1]=2;
                            ;//sysj\controller.sysj line: 41, column: 4
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
                  else {
                    active[1]=1;
                    ends[1]=1;
                    break RUN;
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
    char [] active1 = {1, 1, 1, 1, 1, 1, 1, 1};
    char [] paused1 = {0, 0, 0, 0, 0, 0, 0, 0};
    char [] suspended1 = {0, 0, 0, 0, 0, 0, 0, 0};
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
          bottleAtPos5.gethook();
          df = true;
        }
        runClockDomain();
      }
      bottleAtPos1.setpreclear();
      bottleAtPos5.setpreclear();
      motConveyorOnOff.setpreclear();
      int dummyint = 0;
      for(int qw=0;qw<currsigs.size();++qw){
        dummyint = ((Signal)currsigs.elementAt(qw)).getStatus() ? ((Signal)currsigs.elementAt(qw)).setprepresent() : ((Signal)currsigs.elementAt(qw)).setpreclear();
        ((Signal)currsigs.elementAt(qw)).setpreval(((Signal)currsigs.elementAt(qw)).getValue());
      }
      currsigs.removeAllElements();
      dummyint = bottleAtPos1.getStatus() ? bottleAtPos1.setprepresent() : bottleAtPos1.setpreclear();
      bottleAtPos1.setpreval(bottleAtPos1.getValue());
      bottleAtPos1.setClear();
      dummyint = bottleAtPos5.getStatus() ? bottleAtPos5.setprepresent() : bottleAtPos5.setpreclear();
      bottleAtPos5.setpreval(bottleAtPos5.getValue());
      bottleAtPos5.setClear();
      motConveyorOnOff.sethook();
      motConveyorOnOff.setClear();
      conveyorReq_in.sethook();
      conveyorStatus_o.sethook();
      if(paused[1]!=0 || suspended[1]!=0 || active[1]!=1);
      else{
        conveyorReq_in.gethook();
        conveyorStatus_o.gethook();
        bottleAtPos1.gethook();
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
