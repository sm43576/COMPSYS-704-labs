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
  private Boolean request_thread_7;//sysj\controller.sysj line: 69, column: 9
  private int S9135 = 1;
  private int S7447 = 1;
  private int S7409 = 1;
  private int S7404 = 1;
  private int S7580 = 1;
  private int S7470 = 1;
  private int S7454 = 1;
  private int S7449 = 1;
  private int S7497 = 1;
  private int S7492 = 1;
  private int S7541 = 1;
  private int S7536 = 1;
  
  private int[] ends = new int[23];
  private int[] tdone = new int[23];
  
  public void runClockDomain(){
    for(int i=0;i<ends.length;i++){
      ends[i] = 0;
      tdone[i] = 0;
    }
    
    RUN: while(true){
      switch(S9135){
        case 0 : 
          S9135=0;
          break RUN;
        
        case 1 : 
          S9135=2;
          S9135=2;
          System.out.println("HELLLLLLLLO");//sysj\controller.sysj line: 67, column: 9
          S7447=0;
          S7409=0;
          if(!allOperationsFinished_in.isPartnerPresent() || allOperationsFinished_in.isPartnerPreempted()){//sysj\controller.sysj line: 68, column: 9
            allOperationsFinished_in.setACK(false);//sysj\controller.sysj line: 68, column: 9
            S7409=1;
            active[7]=1;
            ends[7]=1;
            break RUN;
          }
          else {
            S7404=0;
            if(!allOperationsFinished_in.isREQ()){//sysj\controller.sysj line: 68, column: 9
              allOperationsFinished_in.setACK(true);//sysj\controller.sysj line: 68, column: 9
              S7404=1;
              if(allOperationsFinished_in.isREQ()){//sysj\controller.sysj line: 68, column: 9
                allOperationsFinished_in.setACK(false);//sysj\controller.sysj line: 68, column: 9
                ends[7]=2;
                ;//sysj\controller.sysj line: 68, column: 9
                request_thread_7 = (allOperationsFinished_in.getVal() == null ? null : ((Boolean)allOperationsFinished_in.getVal()));//sysj\controller.sysj line: 69, column: 9
                S7447=1;
                if(request_thread_7){//sysj\controller.sysj line: 72, column: 9
                  S7580=0;
                  S7470=0;
                  S7454=0;
                  if(!rotaryStatus_o.isPartnerPresent() || rotaryStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 73, column: 10
                    rotaryStatus_o.setREQ(false);//sysj\controller.sysj line: 73, column: 10
                    S7454=1;
                    active[7]=1;
                    ends[7]=1;
                    break RUN;
                  }
                  else {
                    S7449=0;
                    if(rotaryStatus_o.isACK()){//sysj\controller.sysj line: 73, column: 10
                      rotaryStatus_o.setVal("busy");//sysj\controller.sysj line: 73, column: 10
                      S7449=1;
                      if(!rotaryStatus_o.isACK()){//sysj\controller.sysj line: 73, column: 10
                        rotaryStatus_o.setREQ(false);//sysj\controller.sysj line: 73, column: 10
                        ends[7]=2;
                        ;//sysj\controller.sysj line: 73, column: 10
                        System.out.println("RECIEVED orchestrator task");//sysj\controller.sysj line: 74, column: 10
                        S7470=1;
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
                  S7580=1;
                  System.out.println("rotary - idle");//sysj\controller.sysj line: 85, column: 10
                  S7541=0;
                  if(!rotaryStatus_o.isPartnerPresent() || rotaryStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 86, column: 10
                    rotaryStatus_o.setREQ(false);//sysj\controller.sysj line: 86, column: 10
                    S7541=1;
                    active[7]=1;
                    ends[7]=1;
                    break RUN;
                  }
                  else {
                    S7536=0;
                    if(rotaryStatus_o.isACK()){//sysj\controller.sysj line: 86, column: 10
                      rotaryStatus_o.setVal("idle");//sysj\controller.sysj line: 86, column: 10
                      S7536=1;
                      if(!rotaryStatus_o.isACK()){//sysj\controller.sysj line: 86, column: 10
                        rotaryStatus_o.setREQ(false);//sysj\controller.sysj line: 86, column: 10
                        ends[7]=2;
                        ;//sysj\controller.sysj line: 86, column: 10
                        S7447=2;
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
          switch(S7447){
            case 0 : 
              switch(S7409){
                case 0 : 
                  if(!allOperationsFinished_in.isPartnerPresent() || allOperationsFinished_in.isPartnerPreempted()){//sysj\controller.sysj line: 68, column: 9
                    allOperationsFinished_in.setACK(false);//sysj\controller.sysj line: 68, column: 9
                    S7409=1;
                    active[7]=1;
                    ends[7]=1;
                    break RUN;
                  }
                  else {
                    switch(S7404){
                      case 0 : 
                        if(!allOperationsFinished_in.isREQ()){//sysj\controller.sysj line: 68, column: 9
                          allOperationsFinished_in.setACK(true);//sysj\controller.sysj line: 68, column: 9
                          S7404=1;
                          if(allOperationsFinished_in.isREQ()){//sysj\controller.sysj line: 68, column: 9
                            allOperationsFinished_in.setACK(false);//sysj\controller.sysj line: 68, column: 9
                            ends[7]=2;
                            ;//sysj\controller.sysj line: 68, column: 9
                            request_thread_7 = (allOperationsFinished_in.getVal() == null ? null : ((Boolean)allOperationsFinished_in.getVal()));//sysj\controller.sysj line: 69, column: 9
                            S7447=1;
                            if(request_thread_7){//sysj\controller.sysj line: 72, column: 9
                              S7580=0;
                              S7470=0;
                              S7454=0;
                              if(!rotaryStatus_o.isPartnerPresent() || rotaryStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 73, column: 10
                                rotaryStatus_o.setREQ(false);//sysj\controller.sysj line: 73, column: 10
                                S7454=1;
                                active[7]=1;
                                ends[7]=1;
                                break RUN;
                              }
                              else {
                                S7449=0;
                                if(rotaryStatus_o.isACK()){//sysj\controller.sysj line: 73, column: 10
                                  rotaryStatus_o.setVal("busy");//sysj\controller.sysj line: 73, column: 10
                                  S7449=1;
                                  if(!rotaryStatus_o.isACK()){//sysj\controller.sysj line: 73, column: 10
                                    rotaryStatus_o.setREQ(false);//sysj\controller.sysj line: 73, column: 10
                                    ends[7]=2;
                                    ;//sysj\controller.sysj line: 73, column: 10
                                    System.out.println("RECIEVED orchestrator task");//sysj\controller.sysj line: 74, column: 10
                                    S7470=1;
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
                              S7580=1;
                              System.out.println("rotary - idle");//sysj\controller.sysj line: 85, column: 10
                              S7541=0;
                              if(!rotaryStatus_o.isPartnerPresent() || rotaryStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 86, column: 10
                                rotaryStatus_o.setREQ(false);//sysj\controller.sysj line: 86, column: 10
                                S7541=1;
                                active[7]=1;
                                ends[7]=1;
                                break RUN;
                              }
                              else {
                                S7536=0;
                                if(rotaryStatus_o.isACK()){//sysj\controller.sysj line: 86, column: 10
                                  rotaryStatus_o.setVal("idle");//sysj\controller.sysj line: 86, column: 10
                                  S7536=1;
                                  if(!rotaryStatus_o.isACK()){//sysj\controller.sysj line: 86, column: 10
                                    rotaryStatus_o.setREQ(false);//sysj\controller.sysj line: 86, column: 10
                                    ends[7]=2;
                                    ;//sysj\controller.sysj line: 86, column: 10
                                    S7447=2;
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
                        if(allOperationsFinished_in.isREQ()){//sysj\controller.sysj line: 68, column: 9
                          allOperationsFinished_in.setACK(false);//sysj\controller.sysj line: 68, column: 9
                          ends[7]=2;
                          ;//sysj\controller.sysj line: 68, column: 9
                          request_thread_7 = (allOperationsFinished_in.getVal() == null ? null : ((Boolean)allOperationsFinished_in.getVal()));//sysj\controller.sysj line: 69, column: 9
                          S7447=1;
                          if(request_thread_7){//sysj\controller.sysj line: 72, column: 9
                            S7580=0;
                            S7470=0;
                            S7454=0;
                            if(!rotaryStatus_o.isPartnerPresent() || rotaryStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 73, column: 10
                              rotaryStatus_o.setREQ(false);//sysj\controller.sysj line: 73, column: 10
                              S7454=1;
                              active[7]=1;
                              ends[7]=1;
                              break RUN;
                            }
                            else {
                              S7449=0;
                              if(rotaryStatus_o.isACK()){//sysj\controller.sysj line: 73, column: 10
                                rotaryStatus_o.setVal("busy");//sysj\controller.sysj line: 73, column: 10
                                S7449=1;
                                if(!rotaryStatus_o.isACK()){//sysj\controller.sysj line: 73, column: 10
                                  rotaryStatus_o.setREQ(false);//sysj\controller.sysj line: 73, column: 10
                                  ends[7]=2;
                                  ;//sysj\controller.sysj line: 73, column: 10
                                  System.out.println("RECIEVED orchestrator task");//sysj\controller.sysj line: 74, column: 10
                                  S7470=1;
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
                            S7580=1;
                            System.out.println("rotary - idle");//sysj\controller.sysj line: 85, column: 10
                            S7541=0;
                            if(!rotaryStatus_o.isPartnerPresent() || rotaryStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 86, column: 10
                              rotaryStatus_o.setREQ(false);//sysj\controller.sysj line: 86, column: 10
                              S7541=1;
                              active[7]=1;
                              ends[7]=1;
                              break RUN;
                            }
                            else {
                              S7536=0;
                              if(rotaryStatus_o.isACK()){//sysj\controller.sysj line: 86, column: 10
                                rotaryStatus_o.setVal("idle");//sysj\controller.sysj line: 86, column: 10
                                S7536=1;
                                if(!rotaryStatus_o.isACK()){//sysj\controller.sysj line: 86, column: 10
                                  rotaryStatus_o.setREQ(false);//sysj\controller.sysj line: 86, column: 10
                                  ends[7]=2;
                                  ;//sysj\controller.sysj line: 86, column: 10
                                  S7447=2;
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
                  S7409=1;
                  S7409=0;
                  if(!allOperationsFinished_in.isPartnerPresent() || allOperationsFinished_in.isPartnerPreempted()){//sysj\controller.sysj line: 68, column: 9
                    allOperationsFinished_in.setACK(false);//sysj\controller.sysj line: 68, column: 9
                    S7409=1;
                    active[7]=1;
                    ends[7]=1;
                    break RUN;
                  }
                  else {
                    S7404=0;
                    if(!allOperationsFinished_in.isREQ()){//sysj\controller.sysj line: 68, column: 9
                      allOperationsFinished_in.setACK(true);//sysj\controller.sysj line: 68, column: 9
                      S7404=1;
                      if(allOperationsFinished_in.isREQ()){//sysj\controller.sysj line: 68, column: 9
                        allOperationsFinished_in.setACK(false);//sysj\controller.sysj line: 68, column: 9
                        ends[7]=2;
                        ;//sysj\controller.sysj line: 68, column: 9
                        request_thread_7 = (allOperationsFinished_in.getVal() == null ? null : ((Boolean)allOperationsFinished_in.getVal()));//sysj\controller.sysj line: 69, column: 9
                        S7447=1;
                        if(request_thread_7){//sysj\controller.sysj line: 72, column: 9
                          S7580=0;
                          S7470=0;
                          S7454=0;
                          if(!rotaryStatus_o.isPartnerPresent() || rotaryStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 73, column: 10
                            rotaryStatus_o.setREQ(false);//sysj\controller.sysj line: 73, column: 10
                            S7454=1;
                            active[7]=1;
                            ends[7]=1;
                            break RUN;
                          }
                          else {
                            S7449=0;
                            if(rotaryStatus_o.isACK()){//sysj\controller.sysj line: 73, column: 10
                              rotaryStatus_o.setVal("busy");//sysj\controller.sysj line: 73, column: 10
                              S7449=1;
                              if(!rotaryStatus_o.isACK()){//sysj\controller.sysj line: 73, column: 10
                                rotaryStatus_o.setREQ(false);//sysj\controller.sysj line: 73, column: 10
                                ends[7]=2;
                                ;//sysj\controller.sysj line: 73, column: 10
                                System.out.println("RECIEVED orchestrator task");//sysj\controller.sysj line: 74, column: 10
                                S7470=1;
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
                          S7580=1;
                          System.out.println("rotary - idle");//sysj\controller.sysj line: 85, column: 10
                          S7541=0;
                          if(!rotaryStatus_o.isPartnerPresent() || rotaryStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 86, column: 10
                            rotaryStatus_o.setREQ(false);//sysj\controller.sysj line: 86, column: 10
                            S7541=1;
                            active[7]=1;
                            ends[7]=1;
                            break RUN;
                          }
                          else {
                            S7536=0;
                            if(rotaryStatus_o.isACK()){//sysj\controller.sysj line: 86, column: 10
                              rotaryStatus_o.setVal("idle");//sysj\controller.sysj line: 86, column: 10
                              S7536=1;
                              if(!rotaryStatus_o.isACK()){//sysj\controller.sysj line: 86, column: 10
                                rotaryStatus_o.setREQ(false);//sysj\controller.sysj line: 86, column: 10
                                ends[7]=2;
                                ;//sysj\controller.sysj line: 86, column: 10
                                S7447=2;
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
              switch(S7580){
                case 0 : 
                  switch(S7470){
                    case 0 : 
                      switch(S7454){
                        case 0 : 
                          if(!rotaryStatus_o.isPartnerPresent() || rotaryStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 73, column: 10
                            rotaryStatus_o.setREQ(false);//sysj\controller.sysj line: 73, column: 10
                            S7454=1;
                            active[7]=1;
                            ends[7]=1;
                            break RUN;
                          }
                          else {
                            switch(S7449){
                              case 0 : 
                                if(rotaryStatus_o.isACK()){//sysj\controller.sysj line: 73, column: 10
                                  rotaryStatus_o.setVal("busy");//sysj\controller.sysj line: 73, column: 10
                                  S7449=1;
                                  if(!rotaryStatus_o.isACK()){//sysj\controller.sysj line: 73, column: 10
                                    rotaryStatus_o.setREQ(false);//sysj\controller.sysj line: 73, column: 10
                                    ends[7]=2;
                                    ;//sysj\controller.sysj line: 73, column: 10
                                    System.out.println("RECIEVED orchestrator task");//sysj\controller.sysj line: 74, column: 10
                                    S7470=1;
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
                                if(!rotaryStatus_o.isACK()){//sysj\controller.sysj line: 73, column: 10
                                  rotaryStatus_o.setREQ(false);//sysj\controller.sysj line: 73, column: 10
                                  ends[7]=2;
                                  ;//sysj\controller.sysj line: 73, column: 10
                                  System.out.println("RECIEVED orchestrator task");//sysj\controller.sysj line: 74, column: 10
                                  S7470=1;
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
                          S7454=1;
                          S7454=0;
                          if(!rotaryStatus_o.isPartnerPresent() || rotaryStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 73, column: 10
                            rotaryStatus_o.setREQ(false);//sysj\controller.sysj line: 73, column: 10
                            S7454=1;
                            active[7]=1;
                            ends[7]=1;
                            break RUN;
                          }
                          else {
                            S7449=0;
                            if(rotaryStatus_o.isACK()){//sysj\controller.sysj line: 73, column: 10
                              rotaryStatus_o.setVal("busy");//sysj\controller.sysj line: 73, column: 10
                              S7449=1;
                              if(!rotaryStatus_o.isACK()){//sysj\controller.sysj line: 73, column: 10
                                rotaryStatus_o.setREQ(false);//sysj\controller.sysj line: 73, column: 10
                                ends[7]=2;
                                ;//sysj\controller.sysj line: 73, column: 10
                                System.out.println("RECIEVED orchestrator task");//sysj\controller.sysj line: 74, column: 10
                                S7470=1;
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
                      if(RTbottleAtPos1.getprestatus()){//sysj\controller.sysj line: 75, column: 16
                        S7470=2;
                        System.out.println("emitting rotary trigger");//sysj\controller.sysj line: 79, column: 17
                        rotaryTableTrigger.setPresent();//sysj\controller.sysj line: 80, column: 17
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
                      if(tableAlignedWithSensor.getprestatus()){//sysj\controller.sysj line: 78, column: 19
                        System.out.println("rotary - done");//sysj\controller.sysj line: 82, column: 13
                        S7470=3;
                        S7497=0;
                        if(!rotaryStatus_o.isPartnerPresent() || rotaryStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 83, column: 13
                          rotaryStatus_o.setREQ(false);//sysj\controller.sysj line: 83, column: 13
                          S7497=1;
                          active[7]=1;
                          ends[7]=1;
                          break RUN;
                        }
                        else {
                          S7492=0;
                          if(rotaryStatus_o.isACK()){//sysj\controller.sysj line: 83, column: 13
                            rotaryStatus_o.setVal("done");//sysj\controller.sysj line: 83, column: 13
                            S7492=1;
                            if(!rotaryStatus_o.isACK()){//sysj\controller.sysj line: 83, column: 13
                              rotaryStatus_o.setREQ(false);//sysj\controller.sysj line: 83, column: 13
                              ends[7]=2;
                              ;//sysj\controller.sysj line: 83, column: 13
                              S7447=2;
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
                        rotaryTableTrigger.setPresent();//sysj\controller.sysj line: 80, column: 17
                        currsigs.addElement(rotaryTableTrigger);
                        active[7]=1;
                        ends[7]=1;
                        break RUN;
                      }
                    
                    case 3 : 
                      switch(S7497){
                        case 0 : 
                          if(!rotaryStatus_o.isPartnerPresent() || rotaryStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 83, column: 13
                            rotaryStatus_o.setREQ(false);//sysj\controller.sysj line: 83, column: 13
                            S7497=1;
                            active[7]=1;
                            ends[7]=1;
                            break RUN;
                          }
                          else {
                            switch(S7492){
                              case 0 : 
                                if(rotaryStatus_o.isACK()){//sysj\controller.sysj line: 83, column: 13
                                  rotaryStatus_o.setVal("done");//sysj\controller.sysj line: 83, column: 13
                                  S7492=1;
                                  if(!rotaryStatus_o.isACK()){//sysj\controller.sysj line: 83, column: 13
                                    rotaryStatus_o.setREQ(false);//sysj\controller.sysj line: 83, column: 13
                                    ends[7]=2;
                                    ;//sysj\controller.sysj line: 83, column: 13
                                    S7447=2;
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
                                if(!rotaryStatus_o.isACK()){//sysj\controller.sysj line: 83, column: 13
                                  rotaryStatus_o.setREQ(false);//sysj\controller.sysj line: 83, column: 13
                                  ends[7]=2;
                                  ;//sysj\controller.sysj line: 83, column: 13
                                  S7447=2;
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
                          S7497=1;
                          S7497=0;
                          if(!rotaryStatus_o.isPartnerPresent() || rotaryStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 83, column: 13
                            rotaryStatus_o.setREQ(false);//sysj\controller.sysj line: 83, column: 13
                            S7497=1;
                            active[7]=1;
                            ends[7]=1;
                            break RUN;
                          }
                          else {
                            S7492=0;
                            if(rotaryStatus_o.isACK()){//sysj\controller.sysj line: 83, column: 13
                              rotaryStatus_o.setVal("done");//sysj\controller.sysj line: 83, column: 13
                              S7492=1;
                              if(!rotaryStatus_o.isACK()){//sysj\controller.sysj line: 83, column: 13
                                rotaryStatus_o.setREQ(false);//sysj\controller.sysj line: 83, column: 13
                                ends[7]=2;
                                ;//sysj\controller.sysj line: 83, column: 13
                                S7447=2;
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
                  switch(S7541){
                    case 0 : 
                      if(!rotaryStatus_o.isPartnerPresent() || rotaryStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 86, column: 10
                        rotaryStatus_o.setREQ(false);//sysj\controller.sysj line: 86, column: 10
                        S7541=1;
                        active[7]=1;
                        ends[7]=1;
                        break RUN;
                      }
                      else {
                        switch(S7536){
                          case 0 : 
                            if(rotaryStatus_o.isACK()){//sysj\controller.sysj line: 86, column: 10
                              rotaryStatus_o.setVal("idle");//sysj\controller.sysj line: 86, column: 10
                              S7536=1;
                              if(!rotaryStatus_o.isACK()){//sysj\controller.sysj line: 86, column: 10
                                rotaryStatus_o.setREQ(false);//sysj\controller.sysj line: 86, column: 10
                                ends[7]=2;
                                ;//sysj\controller.sysj line: 86, column: 10
                                S7447=2;
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
                            if(!rotaryStatus_o.isACK()){//sysj\controller.sysj line: 86, column: 10
                              rotaryStatus_o.setREQ(false);//sysj\controller.sysj line: 86, column: 10
                              ends[7]=2;
                              ;//sysj\controller.sysj line: 86, column: 10
                              S7447=2;
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
                      S7541=1;
                      S7541=0;
                      if(!rotaryStatus_o.isPartnerPresent() || rotaryStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 86, column: 10
                        rotaryStatus_o.setREQ(false);//sysj\controller.sysj line: 86, column: 10
                        S7541=1;
                        active[7]=1;
                        ends[7]=1;
                        break RUN;
                      }
                      else {
                        S7536=0;
                        if(rotaryStatus_o.isACK()){//sysj\controller.sysj line: 86, column: 10
                          rotaryStatus_o.setVal("idle");//sysj\controller.sysj line: 86, column: 10
                          S7536=1;
                          if(!rotaryStatus_o.isACK()){//sysj\controller.sysj line: 86, column: 10
                            rotaryStatus_o.setREQ(false);//sysj\controller.sysj line: 86, column: 10
                            ends[7]=2;
                            ;//sysj\controller.sysj line: 86, column: 10
                            S7447=2;
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
              S7447=2;
              System.out.println("out - next loop");//sysj\controller.sysj line: 89, column: 9
              System.out.println("HELLLLLLLLO");//sysj\controller.sysj line: 67, column: 9
              S7447=0;
              S7409=0;
              if(!allOperationsFinished_in.isPartnerPresent() || allOperationsFinished_in.isPartnerPreempted()){//sysj\controller.sysj line: 68, column: 9
                allOperationsFinished_in.setACK(false);//sysj\controller.sysj line: 68, column: 9
                S7409=1;
                active[7]=1;
                ends[7]=1;
                break RUN;
              }
              else {
                S7404=0;
                if(!allOperationsFinished_in.isREQ()){//sysj\controller.sysj line: 68, column: 9
                  allOperationsFinished_in.setACK(true);//sysj\controller.sysj line: 68, column: 9
                  S7404=1;
                  if(allOperationsFinished_in.isREQ()){//sysj\controller.sysj line: 68, column: 9
                    allOperationsFinished_in.setACK(false);//sysj\controller.sysj line: 68, column: 9
                    ends[7]=2;
                    ;//sysj\controller.sysj line: 68, column: 9
                    request_thread_7 = (allOperationsFinished_in.getVal() == null ? null : ((Boolean)allOperationsFinished_in.getVal()));//sysj\controller.sysj line: 69, column: 9
                    S7447=1;
                    if(request_thread_7){//sysj\controller.sysj line: 72, column: 9
                      S7580=0;
                      S7470=0;
                      S7454=0;
                      if(!rotaryStatus_o.isPartnerPresent() || rotaryStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 73, column: 10
                        rotaryStatus_o.setREQ(false);//sysj\controller.sysj line: 73, column: 10
                        S7454=1;
                        active[7]=1;
                        ends[7]=1;
                        break RUN;
                      }
                      else {
                        S7449=0;
                        if(rotaryStatus_o.isACK()){//sysj\controller.sysj line: 73, column: 10
                          rotaryStatus_o.setVal("busy");//sysj\controller.sysj line: 73, column: 10
                          S7449=1;
                          if(!rotaryStatus_o.isACK()){//sysj\controller.sysj line: 73, column: 10
                            rotaryStatus_o.setREQ(false);//sysj\controller.sysj line: 73, column: 10
                            ends[7]=2;
                            ;//sysj\controller.sysj line: 73, column: 10
                            System.out.println("RECIEVED orchestrator task");//sysj\controller.sysj line: 74, column: 10
                            S7470=1;
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
                      S7580=1;
                      System.out.println("rotary - idle");//sysj\controller.sysj line: 85, column: 10
                      S7541=0;
                      if(!rotaryStatus_o.isPartnerPresent() || rotaryStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 86, column: 10
                        rotaryStatus_o.setREQ(false);//sysj\controller.sysj line: 86, column: 10
                        S7541=1;
                        active[7]=1;
                        ends[7]=1;
                        break RUN;
                      }
                      else {
                        S7536=0;
                        if(rotaryStatus_o.isACK()){//sysj\controller.sysj line: 86, column: 10
                          rotaryStatus_o.setVal("idle");//sysj\controller.sysj line: 86, column: 10
                          S7536=1;
                          if(!rotaryStatus_o.isACK()){//sysj\controller.sysj line: 86, column: 10
                            rotaryStatus_o.setREQ(false);//sysj\controller.sysj line: 86, column: 10
                            ends[7]=2;
                            ;//sysj\controller.sysj line: 86, column: 10
                            S7447=2;
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
