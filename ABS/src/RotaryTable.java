import java.util.*;
import com.systemj.ClockDomain;
import com.systemj.Signal;
import com.systemj.input_Channel;
import com.systemj.output_Channel;
import java.util.ArrayList;//sysj\controller.sysj line: 1, column: 1

public class RotaryTable extends ClockDomain{
  public RotaryTable(String name){super(name);}
  Vector currsigs = new Vector();
  private boolean df = false;
  private char [] active;
  private char [] paused;
  private char [] suspended;
  public Signal tableAlignedWithSensor = new Signal("tableAlignedWithSensor", Signal.INPUT);
  public Signal capOnBottleAtPos1 = new Signal("capOnBottleAtPos1", Signal.INPUT);
  public Signal RTbottleAtPos1 = new Signal("RTbottleAtPos1", Signal.INPUT);
  public Signal rotaryTableTrigger = new Signal("rotaryTableTrigger", Signal.OUTPUT);
  public input_Channel allOperationsFinished_in = new input_Channel();
  public output_Channel rotaryStatus_o = new output_Channel();
  private Boolean request_thread_7;//sysj\controller.sysj line: 68, column: 9
  private int S8031 = 1;
  private int S6343 = 1;
  private int S6305 = 1;
  private int S6300 = 1;
  private int S6476 = 1;
  private int S6366 = 1;
  private int S6350 = 1;
  private int S6345 = 1;
  private int S6393 = 1;
  private int S6388 = 1;
  private int S6437 = 1;
  private int S6432 = 1;
  
  private int[] ends = new int[23];
  private int[] tdone = new int[23];
  
  public void runClockDomain(){
    for(int i=0;i<ends.length;i++){
      ends[i] = 0;
      tdone[i] = 0;
    }
    
    RUN: while(true){
      switch(S8031){
        case 0 : 
          S8031=0;
          break RUN;
        
        case 1 : 
          S8031=2;
          S8031=2;
          System.out.println("HELLLLLLLLO");//sysj\controller.sysj line: 66, column: 9
          S6343=0;
          S6305=0;
          if(!allOperationsFinished_in.isPartnerPresent() || allOperationsFinished_in.isPartnerPreempted()){//sysj\controller.sysj line: 67, column: 9
            allOperationsFinished_in.setACK(false);//sysj\controller.sysj line: 67, column: 9
            S6305=1;
            active[7]=1;
            ends[7]=1;
            break RUN;
          }
          else {
            S6300=0;
            if(!allOperationsFinished_in.isREQ()){//sysj\controller.sysj line: 67, column: 9
              allOperationsFinished_in.setACK(true);//sysj\controller.sysj line: 67, column: 9
              S6300=1;
              if(allOperationsFinished_in.isREQ()){//sysj\controller.sysj line: 67, column: 9
                allOperationsFinished_in.setACK(false);//sysj\controller.sysj line: 67, column: 9
                ends[7]=2;
                ;//sysj\controller.sysj line: 67, column: 9
                request_thread_7 = (allOperationsFinished_in.getVal() == null ? null : ((Boolean)allOperationsFinished_in.getVal()));//sysj\controller.sysj line: 68, column: 9
                S6343=1;
                if(request_thread_7){//sysj\controller.sysj line: 71, column: 9
                  S6476=0;
                  S6366=0;
                  S6350=0;
                  if(!rotaryStatus_o.isPartnerPresent() || rotaryStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 72, column: 10
                    rotaryStatus_o.setREQ(false);//sysj\controller.sysj line: 72, column: 10
                    S6350=1;
                    active[7]=1;
                    ends[7]=1;
                    break RUN;
                  }
                  else {
                    S6345=0;
                    if(rotaryStatus_o.isACK()){//sysj\controller.sysj line: 72, column: 10
                      rotaryStatus_o.setVal("busy");//sysj\controller.sysj line: 72, column: 10
                      S6345=1;
                      if(!rotaryStatus_o.isACK()){//sysj\controller.sysj line: 72, column: 10
                        rotaryStatus_o.setREQ(false);//sysj\controller.sysj line: 72, column: 10
                        ends[7]=2;
                        ;//sysj\controller.sysj line: 72, column: 10
                        System.out.println("RECIEVED orchestrator task");//sysj\controller.sysj line: 73, column: 10
                        S6366=1;
                        active[7]=1;
                        ends[7]=1;
                        break RUN;
                      }
                      else {
                        active[7]=1;
                        ends[7]=1;
                        break RUN;
                      }
                    }
                    else {
                      active[7]=1;
                      ends[7]=1;
                      break RUN;
                    }
                  }
                }
                else {
                  S6476=1;
                  System.out.println("rotary - idle");//sysj\controller.sysj line: 84, column: 10
                  S6437=0;
                  if(!rotaryStatus_o.isPartnerPresent() || rotaryStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 85, column: 10
                    rotaryStatus_o.setREQ(false);//sysj\controller.sysj line: 85, column: 10
                    S6437=1;
                    active[7]=1;
                    ends[7]=1;
                    break RUN;
                  }
                  else {
                    S6432=0;
                    if(rotaryStatus_o.isACK()){//sysj\controller.sysj line: 85, column: 10
                      rotaryStatus_o.setVal("idle");//sysj\controller.sysj line: 85, column: 10
                      S6432=1;
                      if(!rotaryStatus_o.isACK()){//sysj\controller.sysj line: 85, column: 10
                        rotaryStatus_o.setREQ(false);//sysj\controller.sysj line: 85, column: 10
                        ends[7]=2;
                        ;//sysj\controller.sysj line: 85, column: 10
                        S6343=2;
                        active[7]=1;
                        ends[7]=1;
                        break RUN;
                      }
                      else {
                        active[7]=1;
                        ends[7]=1;
                        break RUN;
                      }
                    }
                    else {
                      active[7]=1;
                      ends[7]=1;
                      break RUN;
                    }
                  }
                }
              }
              else {
                active[7]=1;
                ends[7]=1;
                break RUN;
              }
            }
            else {
              active[7]=1;
              ends[7]=1;
              break RUN;
            }
          }
        
        case 2 : 
          switch(S6343){
            case 0 : 
              switch(S6305){
                case 0 : 
                  if(!allOperationsFinished_in.isPartnerPresent() || allOperationsFinished_in.isPartnerPreempted()){//sysj\controller.sysj line: 67, column: 9
                    allOperationsFinished_in.setACK(false);//sysj\controller.sysj line: 67, column: 9
                    S6305=1;
                    active[7]=1;
                    ends[7]=1;
                    break RUN;
                  }
                  else {
                    switch(S6300){
                      case 0 : 
                        if(!allOperationsFinished_in.isREQ()){//sysj\controller.sysj line: 67, column: 9
                          allOperationsFinished_in.setACK(true);//sysj\controller.sysj line: 67, column: 9
                          S6300=1;
                          if(allOperationsFinished_in.isREQ()){//sysj\controller.sysj line: 67, column: 9
                            allOperationsFinished_in.setACK(false);//sysj\controller.sysj line: 67, column: 9
                            ends[7]=2;
                            ;//sysj\controller.sysj line: 67, column: 9
                            request_thread_7 = (allOperationsFinished_in.getVal() == null ? null : ((Boolean)allOperationsFinished_in.getVal()));//sysj\controller.sysj line: 68, column: 9
                            S6343=1;
                            if(request_thread_7){//sysj\controller.sysj line: 71, column: 9
                              S6476=0;
                              S6366=0;
                              S6350=0;
                              if(!rotaryStatus_o.isPartnerPresent() || rotaryStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 72, column: 10
                                rotaryStatus_o.setREQ(false);//sysj\controller.sysj line: 72, column: 10
                                S6350=1;
                                active[7]=1;
                                ends[7]=1;
                                break RUN;
                              }
                              else {
                                S6345=0;
                                if(rotaryStatus_o.isACK()){//sysj\controller.sysj line: 72, column: 10
                                  rotaryStatus_o.setVal("busy");//sysj\controller.sysj line: 72, column: 10
                                  S6345=1;
                                  if(!rotaryStatus_o.isACK()){//sysj\controller.sysj line: 72, column: 10
                                    rotaryStatus_o.setREQ(false);//sysj\controller.sysj line: 72, column: 10
                                    ends[7]=2;
                                    ;//sysj\controller.sysj line: 72, column: 10
                                    System.out.println("RECIEVED orchestrator task");//sysj\controller.sysj line: 73, column: 10
                                    S6366=1;
                                    active[7]=1;
                                    ends[7]=1;
                                    break RUN;
                                  }
                                  else {
                                    active[7]=1;
                                    ends[7]=1;
                                    break RUN;
                                  }
                                }
                                else {
                                  active[7]=1;
                                  ends[7]=1;
                                  break RUN;
                                }
                              }
                            }
                            else {
                              S6476=1;
                              System.out.println("rotary - idle");//sysj\controller.sysj line: 84, column: 10
                              S6437=0;
                              if(!rotaryStatus_o.isPartnerPresent() || rotaryStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 85, column: 10
                                rotaryStatus_o.setREQ(false);//sysj\controller.sysj line: 85, column: 10
                                S6437=1;
                                active[7]=1;
                                ends[7]=1;
                                break RUN;
                              }
                              else {
                                S6432=0;
                                if(rotaryStatus_o.isACK()){//sysj\controller.sysj line: 85, column: 10
                                  rotaryStatus_o.setVal("idle");//sysj\controller.sysj line: 85, column: 10
                                  S6432=1;
                                  if(!rotaryStatus_o.isACK()){//sysj\controller.sysj line: 85, column: 10
                                    rotaryStatus_o.setREQ(false);//sysj\controller.sysj line: 85, column: 10
                                    ends[7]=2;
                                    ;//sysj\controller.sysj line: 85, column: 10
                                    S6343=2;
                                    active[7]=1;
                                    ends[7]=1;
                                    break RUN;
                                  }
                                  else {
                                    active[7]=1;
                                    ends[7]=1;
                                    break RUN;
                                  }
                                }
                                else {
                                  active[7]=1;
                                  ends[7]=1;
                                  break RUN;
                                }
                              }
                            }
                          }
                          else {
                            active[7]=1;
                            ends[7]=1;
                            break RUN;
                          }
                        }
                        else {
                          active[7]=1;
                          ends[7]=1;
                          break RUN;
                        }
                      
                      case 1 : 
                        if(allOperationsFinished_in.isREQ()){//sysj\controller.sysj line: 67, column: 9
                          allOperationsFinished_in.setACK(false);//sysj\controller.sysj line: 67, column: 9
                          ends[7]=2;
                          ;//sysj\controller.sysj line: 67, column: 9
                          request_thread_7 = (allOperationsFinished_in.getVal() == null ? null : ((Boolean)allOperationsFinished_in.getVal()));//sysj\controller.sysj line: 68, column: 9
                          S6343=1;
                          if(request_thread_7){//sysj\controller.sysj line: 71, column: 9
                            S6476=0;
                            S6366=0;
                            S6350=0;
                            if(!rotaryStatus_o.isPartnerPresent() || rotaryStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 72, column: 10
                              rotaryStatus_o.setREQ(false);//sysj\controller.sysj line: 72, column: 10
                              S6350=1;
                              active[7]=1;
                              ends[7]=1;
                              break RUN;
                            }
                            else {
                              S6345=0;
                              if(rotaryStatus_o.isACK()){//sysj\controller.sysj line: 72, column: 10
                                rotaryStatus_o.setVal("busy");//sysj\controller.sysj line: 72, column: 10
                                S6345=1;
                                if(!rotaryStatus_o.isACK()){//sysj\controller.sysj line: 72, column: 10
                                  rotaryStatus_o.setREQ(false);//sysj\controller.sysj line: 72, column: 10
                                  ends[7]=2;
                                  ;//sysj\controller.sysj line: 72, column: 10
                                  System.out.println("RECIEVED orchestrator task");//sysj\controller.sysj line: 73, column: 10
                                  S6366=1;
                                  active[7]=1;
                                  ends[7]=1;
                                  break RUN;
                                }
                                else {
                                  active[7]=1;
                                  ends[7]=1;
                                  break RUN;
                                }
                              }
                              else {
                                active[7]=1;
                                ends[7]=1;
                                break RUN;
                              }
                            }
                          }
                          else {
                            S6476=1;
                            System.out.println("rotary - idle");//sysj\controller.sysj line: 84, column: 10
                            S6437=0;
                            if(!rotaryStatus_o.isPartnerPresent() || rotaryStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 85, column: 10
                              rotaryStatus_o.setREQ(false);//sysj\controller.sysj line: 85, column: 10
                              S6437=1;
                              active[7]=1;
                              ends[7]=1;
                              break RUN;
                            }
                            else {
                              S6432=0;
                              if(rotaryStatus_o.isACK()){//sysj\controller.sysj line: 85, column: 10
                                rotaryStatus_o.setVal("idle");//sysj\controller.sysj line: 85, column: 10
                                S6432=1;
                                if(!rotaryStatus_o.isACK()){//sysj\controller.sysj line: 85, column: 10
                                  rotaryStatus_o.setREQ(false);//sysj\controller.sysj line: 85, column: 10
                                  ends[7]=2;
                                  ;//sysj\controller.sysj line: 85, column: 10
                                  S6343=2;
                                  active[7]=1;
                                  ends[7]=1;
                                  break RUN;
                                }
                                else {
                                  active[7]=1;
                                  ends[7]=1;
                                  break RUN;
                                }
                              }
                              else {
                                active[7]=1;
                                ends[7]=1;
                                break RUN;
                              }
                            }
                          }
                        }
                        else {
                          active[7]=1;
                          ends[7]=1;
                          break RUN;
                        }
                      
                    }
                  }
                  break;
                
                case 1 : 
                  S6305=1;
                  S6305=0;
                  if(!allOperationsFinished_in.isPartnerPresent() || allOperationsFinished_in.isPartnerPreempted()){//sysj\controller.sysj line: 67, column: 9
                    allOperationsFinished_in.setACK(false);//sysj\controller.sysj line: 67, column: 9
                    S6305=1;
                    active[7]=1;
                    ends[7]=1;
                    break RUN;
                  }
                  else {
                    S6300=0;
                    if(!allOperationsFinished_in.isREQ()){//sysj\controller.sysj line: 67, column: 9
                      allOperationsFinished_in.setACK(true);//sysj\controller.sysj line: 67, column: 9
                      S6300=1;
                      if(allOperationsFinished_in.isREQ()){//sysj\controller.sysj line: 67, column: 9
                        allOperationsFinished_in.setACK(false);//sysj\controller.sysj line: 67, column: 9
                        ends[7]=2;
                        ;//sysj\controller.sysj line: 67, column: 9
                        request_thread_7 = (allOperationsFinished_in.getVal() == null ? null : ((Boolean)allOperationsFinished_in.getVal()));//sysj\controller.sysj line: 68, column: 9
                        S6343=1;
                        if(request_thread_7){//sysj\controller.sysj line: 71, column: 9
                          S6476=0;
                          S6366=0;
                          S6350=0;
                          if(!rotaryStatus_o.isPartnerPresent() || rotaryStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 72, column: 10
                            rotaryStatus_o.setREQ(false);//sysj\controller.sysj line: 72, column: 10
                            S6350=1;
                            active[7]=1;
                            ends[7]=1;
                            break RUN;
                          }
                          else {
                            S6345=0;
                            if(rotaryStatus_o.isACK()){//sysj\controller.sysj line: 72, column: 10
                              rotaryStatus_o.setVal("busy");//sysj\controller.sysj line: 72, column: 10
                              S6345=1;
                              if(!rotaryStatus_o.isACK()){//sysj\controller.sysj line: 72, column: 10
                                rotaryStatus_o.setREQ(false);//sysj\controller.sysj line: 72, column: 10
                                ends[7]=2;
                                ;//sysj\controller.sysj line: 72, column: 10
                                System.out.println("RECIEVED orchestrator task");//sysj\controller.sysj line: 73, column: 10
                                S6366=1;
                                active[7]=1;
                                ends[7]=1;
                                break RUN;
                              }
                              else {
                                active[7]=1;
                                ends[7]=1;
                                break RUN;
                              }
                            }
                            else {
                              active[7]=1;
                              ends[7]=1;
                              break RUN;
                            }
                          }
                        }
                        else {
                          S6476=1;
                          System.out.println("rotary - idle");//sysj\controller.sysj line: 84, column: 10
                          S6437=0;
                          if(!rotaryStatus_o.isPartnerPresent() || rotaryStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 85, column: 10
                            rotaryStatus_o.setREQ(false);//sysj\controller.sysj line: 85, column: 10
                            S6437=1;
                            active[7]=1;
                            ends[7]=1;
                            break RUN;
                          }
                          else {
                            S6432=0;
                            if(rotaryStatus_o.isACK()){//sysj\controller.sysj line: 85, column: 10
                              rotaryStatus_o.setVal("idle");//sysj\controller.sysj line: 85, column: 10
                              S6432=1;
                              if(!rotaryStatus_o.isACK()){//sysj\controller.sysj line: 85, column: 10
                                rotaryStatus_o.setREQ(false);//sysj\controller.sysj line: 85, column: 10
                                ends[7]=2;
                                ;//sysj\controller.sysj line: 85, column: 10
                                S6343=2;
                                active[7]=1;
                                ends[7]=1;
                                break RUN;
                              }
                              else {
                                active[7]=1;
                                ends[7]=1;
                                break RUN;
                              }
                            }
                            else {
                              active[7]=1;
                              ends[7]=1;
                              break RUN;
                            }
                          }
                        }
                      }
                      else {
                        active[7]=1;
                        ends[7]=1;
                        break RUN;
                      }
                    }
                    else {
                      active[7]=1;
                      ends[7]=1;
                      break RUN;
                    }
                  }
                
              }
              break;
            
            case 1 : 
              switch(S6476){
                case 0 : 
                  switch(S6366){
                    case 0 : 
                      switch(S6350){
                        case 0 : 
                          if(!rotaryStatus_o.isPartnerPresent() || rotaryStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 72, column: 10
                            rotaryStatus_o.setREQ(false);//sysj\controller.sysj line: 72, column: 10
                            S6350=1;
                            active[7]=1;
                            ends[7]=1;
                            break RUN;
                          }
                          else {
                            switch(S6345){
                              case 0 : 
                                if(rotaryStatus_o.isACK()){//sysj\controller.sysj line: 72, column: 10
                                  rotaryStatus_o.setVal("busy");//sysj\controller.sysj line: 72, column: 10
                                  S6345=1;
                                  if(!rotaryStatus_o.isACK()){//sysj\controller.sysj line: 72, column: 10
                                    rotaryStatus_o.setREQ(false);//sysj\controller.sysj line: 72, column: 10
                                    ends[7]=2;
                                    ;//sysj\controller.sysj line: 72, column: 10
                                    System.out.println("RECIEVED orchestrator task");//sysj\controller.sysj line: 73, column: 10
                                    S6366=1;
                                    active[7]=1;
                                    ends[7]=1;
                                    break RUN;
                                  }
                                  else {
                                    active[7]=1;
                                    ends[7]=1;
                                    break RUN;
                                  }
                                }
                                else {
                                  active[7]=1;
                                  ends[7]=1;
                                  break RUN;
                                }
                              
                              case 1 : 
                                if(!rotaryStatus_o.isACK()){//sysj\controller.sysj line: 72, column: 10
                                  rotaryStatus_o.setREQ(false);//sysj\controller.sysj line: 72, column: 10
                                  ends[7]=2;
                                  ;//sysj\controller.sysj line: 72, column: 10
                                  System.out.println("RECIEVED orchestrator task");//sysj\controller.sysj line: 73, column: 10
                                  S6366=1;
                                  active[7]=1;
                                  ends[7]=1;
                                  break RUN;
                                }
                                else {
                                  active[7]=1;
                                  ends[7]=1;
                                  break RUN;
                                }
                              
                            }
                          }
                          break;
                        
                        case 1 : 
                          S6350=1;
                          S6350=0;
                          if(!rotaryStatus_o.isPartnerPresent() || rotaryStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 72, column: 10
                            rotaryStatus_o.setREQ(false);//sysj\controller.sysj line: 72, column: 10
                            S6350=1;
                            active[7]=1;
                            ends[7]=1;
                            break RUN;
                          }
                          else {
                            S6345=0;
                            if(rotaryStatus_o.isACK()){//sysj\controller.sysj line: 72, column: 10
                              rotaryStatus_o.setVal("busy");//sysj\controller.sysj line: 72, column: 10
                              S6345=1;
                              if(!rotaryStatus_o.isACK()){//sysj\controller.sysj line: 72, column: 10
                                rotaryStatus_o.setREQ(false);//sysj\controller.sysj line: 72, column: 10
                                ends[7]=2;
                                ;//sysj\controller.sysj line: 72, column: 10
                                System.out.println("RECIEVED orchestrator task");//sysj\controller.sysj line: 73, column: 10
                                S6366=1;
                                active[7]=1;
                                ends[7]=1;
                                break RUN;
                              }
                              else {
                                active[7]=1;
                                ends[7]=1;
                                break RUN;
                              }
                            }
                            else {
                              active[7]=1;
                              ends[7]=1;
                              break RUN;
                            }
                          }
                        
                      }
                      break;
                    
                    case 1 : 
                      if(RTbottleAtPos1.getprestatus()){//sysj\controller.sysj line: 74, column: 16
                        S6366=2;
                        System.out.println("emitting rotary trigger");//sysj\controller.sysj line: 78, column: 17
                        rotaryTableTrigger.setPresent();//sysj\controller.sysj line: 79, column: 17
                        currsigs.addElement(rotaryTableTrigger);
                        active[7]=1;
                        ends[7]=1;
                        break RUN;
                      }
                      else {
                        active[7]=1;
                        ends[7]=1;
                        break RUN;
                      }
                    
                    case 2 : 
                      if(tableAlignedWithSensor.getprestatus()){//sysj\controller.sysj line: 77, column: 19
                        System.out.println("rotary - done");//sysj\controller.sysj line: 81, column: 13
                        S6366=3;
                        S6393=0;
                        if(!rotaryStatus_o.isPartnerPresent() || rotaryStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 82, column: 13
                          rotaryStatus_o.setREQ(false);//sysj\controller.sysj line: 82, column: 13
                          S6393=1;
                          active[7]=1;
                          ends[7]=1;
                          break RUN;
                        }
                        else {
                          S6388=0;
                          if(rotaryStatus_o.isACK()){//sysj\controller.sysj line: 82, column: 13
                            rotaryStatus_o.setVal("done");//sysj\controller.sysj line: 82, column: 13
                            S6388=1;
                            if(!rotaryStatus_o.isACK()){//sysj\controller.sysj line: 82, column: 13
                              rotaryStatus_o.setREQ(false);//sysj\controller.sysj line: 82, column: 13
                              ends[7]=2;
                              ;//sysj\controller.sysj line: 82, column: 13
                              S6343=2;
                              active[7]=1;
                              ends[7]=1;
                              break RUN;
                            }
                            else {
                              active[7]=1;
                              ends[7]=1;
                              break RUN;
                            }
                          }
                          else {
                            active[7]=1;
                            ends[7]=1;
                            break RUN;
                          }
                        }
                      }
                      else {
                        rotaryTableTrigger.setPresent();//sysj\controller.sysj line: 79, column: 17
                        currsigs.addElement(rotaryTableTrigger);
                        active[7]=1;
                        ends[7]=1;
                        break RUN;
                      }
                    
                    case 3 : 
                      switch(S6393){
                        case 0 : 
                          if(!rotaryStatus_o.isPartnerPresent() || rotaryStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 82, column: 13
                            rotaryStatus_o.setREQ(false);//sysj\controller.sysj line: 82, column: 13
                            S6393=1;
                            active[7]=1;
                            ends[7]=1;
                            break RUN;
                          }
                          else {
                            switch(S6388){
                              case 0 : 
                                if(rotaryStatus_o.isACK()){//sysj\controller.sysj line: 82, column: 13
                                  rotaryStatus_o.setVal("done");//sysj\controller.sysj line: 82, column: 13
                                  S6388=1;
                                  if(!rotaryStatus_o.isACK()){//sysj\controller.sysj line: 82, column: 13
                                    rotaryStatus_o.setREQ(false);//sysj\controller.sysj line: 82, column: 13
                                    ends[7]=2;
                                    ;//sysj\controller.sysj line: 82, column: 13
                                    S6343=2;
                                    active[7]=1;
                                    ends[7]=1;
                                    break RUN;
                                  }
                                  else {
                                    active[7]=1;
                                    ends[7]=1;
                                    break RUN;
                                  }
                                }
                                else {
                                  active[7]=1;
                                  ends[7]=1;
                                  break RUN;
                                }
                              
                              case 1 : 
                                if(!rotaryStatus_o.isACK()){//sysj\controller.sysj line: 82, column: 13
                                  rotaryStatus_o.setREQ(false);//sysj\controller.sysj line: 82, column: 13
                                  ends[7]=2;
                                  ;//sysj\controller.sysj line: 82, column: 13
                                  S6343=2;
                                  active[7]=1;
                                  ends[7]=1;
                                  break RUN;
                                }
                                else {
                                  active[7]=1;
                                  ends[7]=1;
                                  break RUN;
                                }
                              
                            }
                          }
                          break;
                        
                        case 1 : 
                          S6393=1;
                          S6393=0;
                          if(!rotaryStatus_o.isPartnerPresent() || rotaryStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 82, column: 13
                            rotaryStatus_o.setREQ(false);//sysj\controller.sysj line: 82, column: 13
                            S6393=1;
                            active[7]=1;
                            ends[7]=1;
                            break RUN;
                          }
                          else {
                            S6388=0;
                            if(rotaryStatus_o.isACK()){//sysj\controller.sysj line: 82, column: 13
                              rotaryStatus_o.setVal("done");//sysj\controller.sysj line: 82, column: 13
                              S6388=1;
                              if(!rotaryStatus_o.isACK()){//sysj\controller.sysj line: 82, column: 13
                                rotaryStatus_o.setREQ(false);//sysj\controller.sysj line: 82, column: 13
                                ends[7]=2;
                                ;//sysj\controller.sysj line: 82, column: 13
                                S6343=2;
                                active[7]=1;
                                ends[7]=1;
                                break RUN;
                              }
                              else {
                                active[7]=1;
                                ends[7]=1;
                                break RUN;
                              }
                            }
                            else {
                              active[7]=1;
                              ends[7]=1;
                              break RUN;
                            }
                          }
                        
                      }
                      break;
                    
                  }
                  break;
                
                case 1 : 
                  switch(S6437){
                    case 0 : 
                      if(!rotaryStatus_o.isPartnerPresent() || rotaryStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 85, column: 10
                        rotaryStatus_o.setREQ(false);//sysj\controller.sysj line: 85, column: 10
                        S6437=1;
                        active[7]=1;
                        ends[7]=1;
                        break RUN;
                      }
                      else {
                        switch(S6432){
                          case 0 : 
                            if(rotaryStatus_o.isACK()){//sysj\controller.sysj line: 85, column: 10
                              rotaryStatus_o.setVal("idle");//sysj\controller.sysj line: 85, column: 10
                              S6432=1;
                              if(!rotaryStatus_o.isACK()){//sysj\controller.sysj line: 85, column: 10
                                rotaryStatus_o.setREQ(false);//sysj\controller.sysj line: 85, column: 10
                                ends[7]=2;
                                ;//sysj\controller.sysj line: 85, column: 10
                                S6343=2;
                                active[7]=1;
                                ends[7]=1;
                                break RUN;
                              }
                              else {
                                active[7]=1;
                                ends[7]=1;
                                break RUN;
                              }
                            }
                            else {
                              active[7]=1;
                              ends[7]=1;
                              break RUN;
                            }
                          
                          case 1 : 
                            if(!rotaryStatus_o.isACK()){//sysj\controller.sysj line: 85, column: 10
                              rotaryStatus_o.setREQ(false);//sysj\controller.sysj line: 85, column: 10
                              ends[7]=2;
                              ;//sysj\controller.sysj line: 85, column: 10
                              S6343=2;
                              active[7]=1;
                              ends[7]=1;
                              break RUN;
                            }
                            else {
                              active[7]=1;
                              ends[7]=1;
                              break RUN;
                            }
                          
                        }
                      }
                      break;
                    
                    case 1 : 
                      S6437=1;
                      S6437=0;
                      if(!rotaryStatus_o.isPartnerPresent() || rotaryStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 85, column: 10
                        rotaryStatus_o.setREQ(false);//sysj\controller.sysj line: 85, column: 10
                        S6437=1;
                        active[7]=1;
                        ends[7]=1;
                        break RUN;
                      }
                      else {
                        S6432=0;
                        if(rotaryStatus_o.isACK()){//sysj\controller.sysj line: 85, column: 10
                          rotaryStatus_o.setVal("idle");//sysj\controller.sysj line: 85, column: 10
                          S6432=1;
                          if(!rotaryStatus_o.isACK()){//sysj\controller.sysj line: 85, column: 10
                            rotaryStatus_o.setREQ(false);//sysj\controller.sysj line: 85, column: 10
                            ends[7]=2;
                            ;//sysj\controller.sysj line: 85, column: 10
                            S6343=2;
                            active[7]=1;
                            ends[7]=1;
                            break RUN;
                          }
                          else {
                            active[7]=1;
                            ends[7]=1;
                            break RUN;
                          }
                        }
                        else {
                          active[7]=1;
                          ends[7]=1;
                          break RUN;
                        }
                      }
                    
                  }
                  break;
                
              }
              break;
            
            case 2 : 
              S6343=2;
              System.out.println("out - next loop");//sysj\controller.sysj line: 88, column: 9
              System.out.println("HELLLLLLLLO");//sysj\controller.sysj line: 66, column: 9
              S6343=0;
              S6305=0;
              if(!allOperationsFinished_in.isPartnerPresent() || allOperationsFinished_in.isPartnerPreempted()){//sysj\controller.sysj line: 67, column: 9
                allOperationsFinished_in.setACK(false);//sysj\controller.sysj line: 67, column: 9
                S6305=1;
                active[7]=1;
                ends[7]=1;
                break RUN;
              }
              else {
                S6300=0;
                if(!allOperationsFinished_in.isREQ()){//sysj\controller.sysj line: 67, column: 9
                  allOperationsFinished_in.setACK(true);//sysj\controller.sysj line: 67, column: 9
                  S6300=1;
                  if(allOperationsFinished_in.isREQ()){//sysj\controller.sysj line: 67, column: 9
                    allOperationsFinished_in.setACK(false);//sysj\controller.sysj line: 67, column: 9
                    ends[7]=2;
                    ;//sysj\controller.sysj line: 67, column: 9
                    request_thread_7 = (allOperationsFinished_in.getVal() == null ? null : ((Boolean)allOperationsFinished_in.getVal()));//sysj\controller.sysj line: 68, column: 9
                    S6343=1;
                    if(request_thread_7){//sysj\controller.sysj line: 71, column: 9
                      S6476=0;
                      S6366=0;
                      S6350=0;
                      if(!rotaryStatus_o.isPartnerPresent() || rotaryStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 72, column: 10
                        rotaryStatus_o.setREQ(false);//sysj\controller.sysj line: 72, column: 10
                        S6350=1;
                        active[7]=1;
                        ends[7]=1;
                        break RUN;
                      }
                      else {
                        S6345=0;
                        if(rotaryStatus_o.isACK()){//sysj\controller.sysj line: 72, column: 10
                          rotaryStatus_o.setVal("busy");//sysj\controller.sysj line: 72, column: 10
                          S6345=1;
                          if(!rotaryStatus_o.isACK()){//sysj\controller.sysj line: 72, column: 10
                            rotaryStatus_o.setREQ(false);//sysj\controller.sysj line: 72, column: 10
                            ends[7]=2;
                            ;//sysj\controller.sysj line: 72, column: 10
                            System.out.println("RECIEVED orchestrator task");//sysj\controller.sysj line: 73, column: 10
                            S6366=1;
                            active[7]=1;
                            ends[7]=1;
                            break RUN;
                          }
                          else {
                            active[7]=1;
                            ends[7]=1;
                            break RUN;
                          }
                        }
                        else {
                          active[7]=1;
                          ends[7]=1;
                          break RUN;
                        }
                      }
                    }
                    else {
                      S6476=1;
                      System.out.println("rotary - idle");//sysj\controller.sysj line: 84, column: 10
                      S6437=0;
                      if(!rotaryStatus_o.isPartnerPresent() || rotaryStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 85, column: 10
                        rotaryStatus_o.setREQ(false);//sysj\controller.sysj line: 85, column: 10
                        S6437=1;
                        active[7]=1;
                        ends[7]=1;
                        break RUN;
                      }
                      else {
                        S6432=0;
                        if(rotaryStatus_o.isACK()){//sysj\controller.sysj line: 85, column: 10
                          rotaryStatus_o.setVal("idle");//sysj\controller.sysj line: 85, column: 10
                          S6432=1;
                          if(!rotaryStatus_o.isACK()){//sysj\controller.sysj line: 85, column: 10
                            rotaryStatus_o.setREQ(false);//sysj\controller.sysj line: 85, column: 10
                            ends[7]=2;
                            ;//sysj\controller.sysj line: 85, column: 10
                            S6343=2;
                            active[7]=1;
                            ends[7]=1;
                            break RUN;
                          }
                          else {
                            active[7]=1;
                            ends[7]=1;
                            break RUN;
                          }
                        }
                        else {
                          active[7]=1;
                          ends[7]=1;
                          break RUN;
                        }
                      }
                    }
                  }
                  else {
                    active[7]=1;
                    ends[7]=1;
                    break RUN;
                  }
                }
                else {
                  active[7]=1;
                  ends[7]=1;
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
    while(active[7] != 0){
      int index = 7;
      if(paused[index]==1 || suspended[index]==1 || active[index] == 0){
        for(int h=1;h<paused.length;++h){
          paused[h]=0;
        }
      }
      if(paused[7]!=0 || suspended[7]!=0 || active[7]!=1);
      else{
        if(!df){
          allOperationsFinished_in.gethook();
          rotaryStatus_o.gethook();
          tableAlignedWithSensor.gethook();
          capOnBottleAtPos1.gethook();
          RTbottleAtPos1.gethook();
          df = true;
        }
        runClockDomain();
      }
      tableAlignedWithSensor.setpreclear();
      capOnBottleAtPos1.setpreclear();
      RTbottleAtPos1.setpreclear();
      rotaryTableTrigger.setpreclear();
      int dummyint = 0;
      for(int qw=0;qw<currsigs.size();++qw){
        dummyint = ((Signal)currsigs.elementAt(qw)).getStatus() ? ((Signal)currsigs.elementAt(qw)).setprepresent() : ((Signal)currsigs.elementAt(qw)).setpreclear();
        ((Signal)currsigs.elementAt(qw)).setpreval(((Signal)currsigs.elementAt(qw)).getValue());
      }
      currsigs.removeAllElements();
      dummyint = tableAlignedWithSensor.getStatus() ? tableAlignedWithSensor.setprepresent() : tableAlignedWithSensor.setpreclear();
      tableAlignedWithSensor.setpreval(tableAlignedWithSensor.getValue());
      tableAlignedWithSensor.setClear();
      dummyint = capOnBottleAtPos1.getStatus() ? capOnBottleAtPos1.setprepresent() : capOnBottleAtPos1.setpreclear();
      capOnBottleAtPos1.setpreval(capOnBottleAtPos1.getValue());
      capOnBottleAtPos1.setClear();
      dummyint = RTbottleAtPos1.getStatus() ? RTbottleAtPos1.setprepresent() : RTbottleAtPos1.setpreclear();
      RTbottleAtPos1.setpreval(RTbottleAtPos1.getValue());
      RTbottleAtPos1.setClear();
      rotaryTableTrigger.sethook();
      rotaryTableTrigger.setClear();
      allOperationsFinished_in.sethook();
      rotaryStatus_o.sethook();
      if(paused[7]!=0 || suspended[7]!=0 || active[7]!=1);
      else{
        allOperationsFinished_in.gethook();
        rotaryStatus_o.gethook();
        tableAlignedWithSensor.gethook();
        capOnBottleAtPos1.gethook();
        RTbottleAtPos1.gethook();
      }
      runFinisher();
      if(active[7] == 0){
      	this.terminated = true;
      }
      if(!threaded) break;
    }
  }
}
