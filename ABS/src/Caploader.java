import java.util.*;
import com.systemj.ClockDomain;
import com.systemj.Signal;
import com.systemj.input_Channel;
import com.systemj.output_Channel;
import java.util.ArrayList;//sysj\controller.sysj line: 1, column: 1

public class Caploader extends ClockDomain{
  public Caploader(String name){super(name);}
  Vector currsigs = new Vector();
  private boolean df = false;
  private char [] active;
  private char [] paused;
  private char [] suspended;
  public Signal pusherRetracted = new Signal("pusherRetracted", Signal.INPUT);
  public Signal pusherExtended = new Signal("pusherExtended", Signal.INPUT);
  public Signal WPgripped = new Signal("WPgripped", Signal.INPUT);
  public Signal armAtSource = new Signal("armAtSource", Signal.INPUT);
  public Signal armAtDest = new Signal("armAtDest", Signal.INPUT);
  public Signal bottleAtPos3 = new Signal("bottleAtPos3", Signal.INPUT);
  public Signal request = new Signal("request", Signal.INPUT);
  public Signal mode = new Signal("mode", Signal.INPUT);
  public Signal pusherExtendM = new Signal("pusherExtendM", Signal.INPUT);
  public Signal vacOnM = new Signal("vacOnM", Signal.INPUT);
  public Signal armSourceM = new Signal("armSourceM", Signal.INPUT);
  public Signal armDestM = new Signal("armDestM", Signal.INPUT);
  public Signal pusherExtend = new Signal("pusherExtend", Signal.OUTPUT);
  public Signal vacOn = new Signal("vacOn", Signal.OUTPUT);
  public Signal armSource = new Signal("armSource", Signal.OUTPUT);
  public Signal armDest = new Signal("armDest", Signal.OUTPUT);
  public input_Channel capLoaderReq_in = new input_Channel();
  public output_Channel capLoaderStatus_o = new output_Channel();
  private Boolean request_thread_20;//sysj\controller.sysj line: 266, column: 4
  private int S117682 = 1;
  private int S115306 = 1;
  private int S115290 = 1;
  private int S115285 = 1;
  private int S115500 = 1;
  private int S115477 = 1;
  private int S115351 = 1;
  private int S115313 = 1;
  private int S115308 = 1;
  private int S115392 = 1;
  private int S115397 = 1;
  private int S115417 = 1;
  private int S115412 = 1;
  private int S115484 = 1;
  private int S115479 = 1;
  
  private int[] ends = new int[23];
  private int[] tdone = new int[23];
  
  public void thread117911(int [] tdone, int [] ends){
        switch(S115397){
      case 0 : 
        active[22]=0;
        ends[22]=0;
        tdone[22]=1;
        break;
      
      case 1 : 
        vacOn.setPresent();//sysj\controller.sysj line: 295, column: 30
        currsigs.addElement(vacOn);
        active[22]=1;
        ends[22]=1;
        tdone[22]=1;
        break;
      
    }
  }

  public void thread117910(int [] tdone, int [] ends){
        switch(S115392){
      case 0 : 
        active[21]=0;
        ends[21]=0;
        tdone[21]=1;
        break;
      
      case 1 : 
        armDest.setPresent();//sysj\controller.sysj line: 295, column: 8
        currsigs.addElement(armDest);
        active[21]=1;
        ends[21]=1;
        tdone[21]=1;
        break;
      
    }
  }

  public void thread117908(int [] tdone, int [] ends){
        S115397=1;
    vacOn.setPresent();//sysj\controller.sysj line: 295, column: 30
    currsigs.addElement(vacOn);
    active[22]=1;
    ends[22]=1;
    tdone[22]=1;
  }

  public void thread117907(int [] tdone, int [] ends){
        S115392=1;
    armDest.setPresent();//sysj\controller.sysj line: 295, column: 8
    currsigs.addElement(armDest);
    active[21]=1;
    ends[21]=1;
    tdone[21]=1;
  }

  public void runClockDomain(){
    for(int i=0;i<ends.length;i++){
      ends[i] = 0;
      tdone[i] = 0;
    }
    
    RUN: while(true){
      switch(S117682){
        case 0 : 
          S117682=0;
          break RUN;
        
        case 1 : 
          S117682=2;
          S117682=2;
          S115306=0;
          S115290=0;
          if(!capLoaderReq_in.isPartnerPresent() || capLoaderReq_in.isPartnerPreempted()){//sysj\controller.sysj line: 265, column: 4
            capLoaderReq_in.setACK(false);//sysj\controller.sysj line: 265, column: 4
            S115290=1;
            active[20]=1;
            ends[20]=1;
            break RUN;
          }
          else {
            S115285=0;
            if(!capLoaderReq_in.isREQ()){//sysj\controller.sysj line: 265, column: 4
              capLoaderReq_in.setACK(true);//sysj\controller.sysj line: 265, column: 4
              S115285=1;
              if(capLoaderReq_in.isREQ()){//sysj\controller.sysj line: 265, column: 4
                capLoaderReq_in.setACK(false);//sysj\controller.sysj line: 265, column: 4
                ends[20]=2;
                ;//sysj\controller.sysj line: 265, column: 4
                request_thread_20 = (capLoaderReq_in.getVal() == null ? null : ((Boolean)capLoaderReq_in.getVal()));//sysj\controller.sysj line: 266, column: 4
                S115306=1;
                if(request_thread_20){//sysj\controller.sysj line: 267, column: 4
                  S115500=0;
                  S115477=0;
                  if(bottleAtPos3.getprestatus()){//sysj\controller.sysj line: 269, column: 14
                    System.out.println("cap loader - bottle is at pos 3");//sysj\controller.sysj line: 270, column: 6
                    S115351=0;
                    S115313=0;
                    if(!capLoaderStatus_o.isPartnerPresent() || capLoaderStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 272, column: 6
                      capLoaderStatus_o.setREQ(false);//sysj\controller.sysj line: 272, column: 6
                      S115313=1;
                      active[20]=1;
                      ends[20]=1;
                      break RUN;
                    }
                    else {
                      S115308=0;
                      if(capLoaderStatus_o.isACK()){//sysj\controller.sysj line: 272, column: 6
                        capLoaderStatus_o.setVal("busy");//sysj\controller.sysj line: 272, column: 6
                        S115308=1;
                        if(!capLoaderStatus_o.isACK()){//sysj\controller.sysj line: 272, column: 6
                          capLoaderStatus_o.setREQ(false);//sysj\controller.sysj line: 272, column: 6
                          ends[20]=2;
                          ;//sysj\controller.sysj line: 272, column: 6
                          S115351=1;
                          if(pusherRetracted.getprestatus()){//sysj\controller.sysj line: 274, column: 14
                            pusherExtend.setPresent();//sysj\controller.sysj line: 276, column: 8
                            currsigs.addElement(pusherExtend);
                            active[20]=1;
                            ends[20]=1;
                            break RUN;
                          }
                          else {
                            S115351=2;
                            active[20]=1;
                            ends[20]=1;
                            break RUN;
                          }
                        }
                        else {
                          active[20]=1;
                          ends[20]=1;
                          break RUN;
                        }
                      }
                      else {
                        active[20]=1;
                        ends[20]=1;
                        break RUN;
                      }
                    }
                  }
                  else {
                    S115477=1;
                    S115417=0;
                    if(!capLoaderStatus_o.isPartnerPresent() || capLoaderStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 300, column: 5
                      capLoaderStatus_o.setREQ(false);//sysj\controller.sysj line: 300, column: 5
                      S115417=1;
                      active[20]=1;
                      ends[20]=1;
                      break RUN;
                    }
                    else {
                      S115412=0;
                      if(capLoaderStatus_o.isACK()){//sysj\controller.sysj line: 300, column: 5
                        capLoaderStatus_o.setVal("done");//sysj\controller.sysj line: 300, column: 5
                        S115412=1;
                        if(!capLoaderStatus_o.isACK()){//sysj\controller.sysj line: 300, column: 5
                          capLoaderStatus_o.setREQ(false);//sysj\controller.sysj line: 300, column: 5
                          ends[20]=2;
                          ;//sysj\controller.sysj line: 300, column: 5
                          S115306=2;
                          active[20]=1;
                          ends[20]=1;
                          break RUN;
                        }
                        else {
                          active[20]=1;
                          ends[20]=1;
                          break RUN;
                        }
                      }
                      else {
                        active[20]=1;
                        ends[20]=1;
                        break RUN;
                      }
                    }
                  }
                }
                else {
                  S115500=1;
                  S115484=0;
                  if(!capLoaderStatus_o.isPartnerPresent() || capLoaderStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 302, column: 5
                    capLoaderStatus_o.setREQ(false);//sysj\controller.sysj line: 302, column: 5
                    S115484=1;
                    active[20]=1;
                    ends[20]=1;
                    break RUN;
                  }
                  else {
                    S115479=0;
                    if(capLoaderStatus_o.isACK()){//sysj\controller.sysj line: 302, column: 5
                      capLoaderStatus_o.setVal("idle");//sysj\controller.sysj line: 302, column: 5
                      S115479=1;
                      if(!capLoaderStatus_o.isACK()){//sysj\controller.sysj line: 302, column: 5
                        capLoaderStatus_o.setREQ(false);//sysj\controller.sysj line: 302, column: 5
                        ends[20]=2;
                        ;//sysj\controller.sysj line: 302, column: 5
                        S115306=2;
                        active[20]=1;
                        ends[20]=1;
                        break RUN;
                      }
                      else {
                        active[20]=1;
                        ends[20]=1;
                        break RUN;
                      }
                    }
                    else {
                      active[20]=1;
                      ends[20]=1;
                      break RUN;
                    }
                  }
                }
              }
              else {
                active[20]=1;
                ends[20]=1;
                break RUN;
              }
            }
            else {
              active[20]=1;
              ends[20]=1;
              break RUN;
            }
          }
        
        case 2 : 
          switch(S115306){
            case 0 : 
              switch(S115290){
                case 0 : 
                  if(!capLoaderReq_in.isPartnerPresent() || capLoaderReq_in.isPartnerPreempted()){//sysj\controller.sysj line: 265, column: 4
                    capLoaderReq_in.setACK(false);//sysj\controller.sysj line: 265, column: 4
                    S115290=1;
                    active[20]=1;
                    ends[20]=1;
                    break RUN;
                  }
                  else {
                    switch(S115285){
                      case 0 : 
                        if(!capLoaderReq_in.isREQ()){//sysj\controller.sysj line: 265, column: 4
                          capLoaderReq_in.setACK(true);//sysj\controller.sysj line: 265, column: 4
                          S115285=1;
                          if(capLoaderReq_in.isREQ()){//sysj\controller.sysj line: 265, column: 4
                            capLoaderReq_in.setACK(false);//sysj\controller.sysj line: 265, column: 4
                            ends[20]=2;
                            ;//sysj\controller.sysj line: 265, column: 4
                            request_thread_20 = (capLoaderReq_in.getVal() == null ? null : ((Boolean)capLoaderReq_in.getVal()));//sysj\controller.sysj line: 266, column: 4
                            S115306=1;
                            if(request_thread_20){//sysj\controller.sysj line: 267, column: 4
                              S115500=0;
                              S115477=0;
                              if(bottleAtPos3.getprestatus()){//sysj\controller.sysj line: 269, column: 14
                                System.out.println("cap loader - bottle is at pos 3");//sysj\controller.sysj line: 270, column: 6
                                S115351=0;
                                S115313=0;
                                if(!capLoaderStatus_o.isPartnerPresent() || capLoaderStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 272, column: 6
                                  capLoaderStatus_o.setREQ(false);//sysj\controller.sysj line: 272, column: 6
                                  S115313=1;
                                  active[20]=1;
                                  ends[20]=1;
                                  break RUN;
                                }
                                else {
                                  S115308=0;
                                  if(capLoaderStatus_o.isACK()){//sysj\controller.sysj line: 272, column: 6
                                    capLoaderStatus_o.setVal("busy");//sysj\controller.sysj line: 272, column: 6
                                    S115308=1;
                                    if(!capLoaderStatus_o.isACK()){//sysj\controller.sysj line: 272, column: 6
                                      capLoaderStatus_o.setREQ(false);//sysj\controller.sysj line: 272, column: 6
                                      ends[20]=2;
                                      ;//sysj\controller.sysj line: 272, column: 6
                                      S115351=1;
                                      if(pusherRetracted.getprestatus()){//sysj\controller.sysj line: 274, column: 14
                                        pusherExtend.setPresent();//sysj\controller.sysj line: 276, column: 8
                                        currsigs.addElement(pusherExtend);
                                        active[20]=1;
                                        ends[20]=1;
                                        break RUN;
                                      }
                                      else {
                                        S115351=2;
                                        active[20]=1;
                                        ends[20]=1;
                                        break RUN;
                                      }
                                    }
                                    else {
                                      active[20]=1;
                                      ends[20]=1;
                                      break RUN;
                                    }
                                  }
                                  else {
                                    active[20]=1;
                                    ends[20]=1;
                                    break RUN;
                                  }
                                }
                              }
                              else {
                                S115477=1;
                                S115417=0;
                                if(!capLoaderStatus_o.isPartnerPresent() || capLoaderStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 300, column: 5
                                  capLoaderStatus_o.setREQ(false);//sysj\controller.sysj line: 300, column: 5
                                  S115417=1;
                                  active[20]=1;
                                  ends[20]=1;
                                  break RUN;
                                }
                                else {
                                  S115412=0;
                                  if(capLoaderStatus_o.isACK()){//sysj\controller.sysj line: 300, column: 5
                                    capLoaderStatus_o.setVal("done");//sysj\controller.sysj line: 300, column: 5
                                    S115412=1;
                                    if(!capLoaderStatus_o.isACK()){//sysj\controller.sysj line: 300, column: 5
                                      capLoaderStatus_o.setREQ(false);//sysj\controller.sysj line: 300, column: 5
                                      ends[20]=2;
                                      ;//sysj\controller.sysj line: 300, column: 5
                                      S115306=2;
                                      active[20]=1;
                                      ends[20]=1;
                                      break RUN;
                                    }
                                    else {
                                      active[20]=1;
                                      ends[20]=1;
                                      break RUN;
                                    }
                                  }
                                  else {
                                    active[20]=1;
                                    ends[20]=1;
                                    break RUN;
                                  }
                                }
                              }
                            }
                            else {
                              S115500=1;
                              S115484=0;
                              if(!capLoaderStatus_o.isPartnerPresent() || capLoaderStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 302, column: 5
                                capLoaderStatus_o.setREQ(false);//sysj\controller.sysj line: 302, column: 5
                                S115484=1;
                                active[20]=1;
                                ends[20]=1;
                                break RUN;
                              }
                              else {
                                S115479=0;
                                if(capLoaderStatus_o.isACK()){//sysj\controller.sysj line: 302, column: 5
                                  capLoaderStatus_o.setVal("idle");//sysj\controller.sysj line: 302, column: 5
                                  S115479=1;
                                  if(!capLoaderStatus_o.isACK()){//sysj\controller.sysj line: 302, column: 5
                                    capLoaderStatus_o.setREQ(false);//sysj\controller.sysj line: 302, column: 5
                                    ends[20]=2;
                                    ;//sysj\controller.sysj line: 302, column: 5
                                    S115306=2;
                                    active[20]=1;
                                    ends[20]=1;
                                    break RUN;
                                  }
                                  else {
                                    active[20]=1;
                                    ends[20]=1;
                                    break RUN;
                                  }
                                }
                                else {
                                  active[20]=1;
                                  ends[20]=1;
                                  break RUN;
                                }
                              }
                            }
                          }
                          else {
                            active[20]=1;
                            ends[20]=1;
                            break RUN;
                          }
                        }
                        else {
                          active[20]=1;
                          ends[20]=1;
                          break RUN;
                        }
                      
                      case 1 : 
                        if(capLoaderReq_in.isREQ()){//sysj\controller.sysj line: 265, column: 4
                          capLoaderReq_in.setACK(false);//sysj\controller.sysj line: 265, column: 4
                          ends[20]=2;
                          ;//sysj\controller.sysj line: 265, column: 4
                          request_thread_20 = (capLoaderReq_in.getVal() == null ? null : ((Boolean)capLoaderReq_in.getVal()));//sysj\controller.sysj line: 266, column: 4
                          S115306=1;
                          if(request_thread_20){//sysj\controller.sysj line: 267, column: 4
                            S115500=0;
                            S115477=0;
                            if(bottleAtPos3.getprestatus()){//sysj\controller.sysj line: 269, column: 14
                              System.out.println("cap loader - bottle is at pos 3");//sysj\controller.sysj line: 270, column: 6
                              S115351=0;
                              S115313=0;
                              if(!capLoaderStatus_o.isPartnerPresent() || capLoaderStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 272, column: 6
                                capLoaderStatus_o.setREQ(false);//sysj\controller.sysj line: 272, column: 6
                                S115313=1;
                                active[20]=1;
                                ends[20]=1;
                                break RUN;
                              }
                              else {
                                S115308=0;
                                if(capLoaderStatus_o.isACK()){//sysj\controller.sysj line: 272, column: 6
                                  capLoaderStatus_o.setVal("busy");//sysj\controller.sysj line: 272, column: 6
                                  S115308=1;
                                  if(!capLoaderStatus_o.isACK()){//sysj\controller.sysj line: 272, column: 6
                                    capLoaderStatus_o.setREQ(false);//sysj\controller.sysj line: 272, column: 6
                                    ends[20]=2;
                                    ;//sysj\controller.sysj line: 272, column: 6
                                    S115351=1;
                                    if(pusherRetracted.getprestatus()){//sysj\controller.sysj line: 274, column: 14
                                      pusherExtend.setPresent();//sysj\controller.sysj line: 276, column: 8
                                      currsigs.addElement(pusherExtend);
                                      active[20]=1;
                                      ends[20]=1;
                                      break RUN;
                                    }
                                    else {
                                      S115351=2;
                                      active[20]=1;
                                      ends[20]=1;
                                      break RUN;
                                    }
                                  }
                                  else {
                                    active[20]=1;
                                    ends[20]=1;
                                    break RUN;
                                  }
                                }
                                else {
                                  active[20]=1;
                                  ends[20]=1;
                                  break RUN;
                                }
                              }
                            }
                            else {
                              S115477=1;
                              S115417=0;
                              if(!capLoaderStatus_o.isPartnerPresent() || capLoaderStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 300, column: 5
                                capLoaderStatus_o.setREQ(false);//sysj\controller.sysj line: 300, column: 5
                                S115417=1;
                                active[20]=1;
                                ends[20]=1;
                                break RUN;
                              }
                              else {
                                S115412=0;
                                if(capLoaderStatus_o.isACK()){//sysj\controller.sysj line: 300, column: 5
                                  capLoaderStatus_o.setVal("done");//sysj\controller.sysj line: 300, column: 5
                                  S115412=1;
                                  if(!capLoaderStatus_o.isACK()){//sysj\controller.sysj line: 300, column: 5
                                    capLoaderStatus_o.setREQ(false);//sysj\controller.sysj line: 300, column: 5
                                    ends[20]=2;
                                    ;//sysj\controller.sysj line: 300, column: 5
                                    S115306=2;
                                    active[20]=1;
                                    ends[20]=1;
                                    break RUN;
                                  }
                                  else {
                                    active[20]=1;
                                    ends[20]=1;
                                    break RUN;
                                  }
                                }
                                else {
                                  active[20]=1;
                                  ends[20]=1;
                                  break RUN;
                                }
                              }
                            }
                          }
                          else {
                            S115500=1;
                            S115484=0;
                            if(!capLoaderStatus_o.isPartnerPresent() || capLoaderStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 302, column: 5
                              capLoaderStatus_o.setREQ(false);//sysj\controller.sysj line: 302, column: 5
                              S115484=1;
                              active[20]=1;
                              ends[20]=1;
                              break RUN;
                            }
                            else {
                              S115479=0;
                              if(capLoaderStatus_o.isACK()){//sysj\controller.sysj line: 302, column: 5
                                capLoaderStatus_o.setVal("idle");//sysj\controller.sysj line: 302, column: 5
                                S115479=1;
                                if(!capLoaderStatus_o.isACK()){//sysj\controller.sysj line: 302, column: 5
                                  capLoaderStatus_o.setREQ(false);//sysj\controller.sysj line: 302, column: 5
                                  ends[20]=2;
                                  ;//sysj\controller.sysj line: 302, column: 5
                                  S115306=2;
                                  active[20]=1;
                                  ends[20]=1;
                                  break RUN;
                                }
                                else {
                                  active[20]=1;
                                  ends[20]=1;
                                  break RUN;
                                }
                              }
                              else {
                                active[20]=1;
                                ends[20]=1;
                                break RUN;
                              }
                            }
                          }
                        }
                        else {
                          active[20]=1;
                          ends[20]=1;
                          break RUN;
                        }
                      
                    }
                  }
                  break;
                
                case 1 : 
                  S115290=1;
                  S115290=0;
                  if(!capLoaderReq_in.isPartnerPresent() || capLoaderReq_in.isPartnerPreempted()){//sysj\controller.sysj line: 265, column: 4
                    capLoaderReq_in.setACK(false);//sysj\controller.sysj line: 265, column: 4
                    S115290=1;
                    active[20]=1;
                    ends[20]=1;
                    break RUN;
                  }
                  else {
                    S115285=0;
                    if(!capLoaderReq_in.isREQ()){//sysj\controller.sysj line: 265, column: 4
                      capLoaderReq_in.setACK(true);//sysj\controller.sysj line: 265, column: 4
                      S115285=1;
                      if(capLoaderReq_in.isREQ()){//sysj\controller.sysj line: 265, column: 4
                        capLoaderReq_in.setACK(false);//sysj\controller.sysj line: 265, column: 4
                        ends[20]=2;
                        ;//sysj\controller.sysj line: 265, column: 4
                        request_thread_20 = (capLoaderReq_in.getVal() == null ? null : ((Boolean)capLoaderReq_in.getVal()));//sysj\controller.sysj line: 266, column: 4
                        S115306=1;
                        if(request_thread_20){//sysj\controller.sysj line: 267, column: 4
                          S115500=0;
                          S115477=0;
                          if(bottleAtPos3.getprestatus()){//sysj\controller.sysj line: 269, column: 14
                            System.out.println("cap loader - bottle is at pos 3");//sysj\controller.sysj line: 270, column: 6
                            S115351=0;
                            S115313=0;
                            if(!capLoaderStatus_o.isPartnerPresent() || capLoaderStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 272, column: 6
                              capLoaderStatus_o.setREQ(false);//sysj\controller.sysj line: 272, column: 6
                              S115313=1;
                              active[20]=1;
                              ends[20]=1;
                              break RUN;
                            }
                            else {
                              S115308=0;
                              if(capLoaderStatus_o.isACK()){//sysj\controller.sysj line: 272, column: 6
                                capLoaderStatus_o.setVal("busy");//sysj\controller.sysj line: 272, column: 6
                                S115308=1;
                                if(!capLoaderStatus_o.isACK()){//sysj\controller.sysj line: 272, column: 6
                                  capLoaderStatus_o.setREQ(false);//sysj\controller.sysj line: 272, column: 6
                                  ends[20]=2;
                                  ;//sysj\controller.sysj line: 272, column: 6
                                  S115351=1;
                                  if(pusherRetracted.getprestatus()){//sysj\controller.sysj line: 274, column: 14
                                    pusherExtend.setPresent();//sysj\controller.sysj line: 276, column: 8
                                    currsigs.addElement(pusherExtend);
                                    active[20]=1;
                                    ends[20]=1;
                                    break RUN;
                                  }
                                  else {
                                    S115351=2;
                                    active[20]=1;
                                    ends[20]=1;
                                    break RUN;
                                  }
                                }
                                else {
                                  active[20]=1;
                                  ends[20]=1;
                                  break RUN;
                                }
                              }
                              else {
                                active[20]=1;
                                ends[20]=1;
                                break RUN;
                              }
                            }
                          }
                          else {
                            S115477=1;
                            S115417=0;
                            if(!capLoaderStatus_o.isPartnerPresent() || capLoaderStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 300, column: 5
                              capLoaderStatus_o.setREQ(false);//sysj\controller.sysj line: 300, column: 5
                              S115417=1;
                              active[20]=1;
                              ends[20]=1;
                              break RUN;
                            }
                            else {
                              S115412=0;
                              if(capLoaderStatus_o.isACK()){//sysj\controller.sysj line: 300, column: 5
                                capLoaderStatus_o.setVal("done");//sysj\controller.sysj line: 300, column: 5
                                S115412=1;
                                if(!capLoaderStatus_o.isACK()){//sysj\controller.sysj line: 300, column: 5
                                  capLoaderStatus_o.setREQ(false);//sysj\controller.sysj line: 300, column: 5
                                  ends[20]=2;
                                  ;//sysj\controller.sysj line: 300, column: 5
                                  S115306=2;
                                  active[20]=1;
                                  ends[20]=1;
                                  break RUN;
                                }
                                else {
                                  active[20]=1;
                                  ends[20]=1;
                                  break RUN;
                                }
                              }
                              else {
                                active[20]=1;
                                ends[20]=1;
                                break RUN;
                              }
                            }
                          }
                        }
                        else {
                          S115500=1;
                          S115484=0;
                          if(!capLoaderStatus_o.isPartnerPresent() || capLoaderStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 302, column: 5
                            capLoaderStatus_o.setREQ(false);//sysj\controller.sysj line: 302, column: 5
                            S115484=1;
                            active[20]=1;
                            ends[20]=1;
                            break RUN;
                          }
                          else {
                            S115479=0;
                            if(capLoaderStatus_o.isACK()){//sysj\controller.sysj line: 302, column: 5
                              capLoaderStatus_o.setVal("idle");//sysj\controller.sysj line: 302, column: 5
                              S115479=1;
                              if(!capLoaderStatus_o.isACK()){//sysj\controller.sysj line: 302, column: 5
                                capLoaderStatus_o.setREQ(false);//sysj\controller.sysj line: 302, column: 5
                                ends[20]=2;
                                ;//sysj\controller.sysj line: 302, column: 5
                                S115306=2;
                                active[20]=1;
                                ends[20]=1;
                                break RUN;
                              }
                              else {
                                active[20]=1;
                                ends[20]=1;
                                break RUN;
                              }
                            }
                            else {
                              active[20]=1;
                              ends[20]=1;
                              break RUN;
                            }
                          }
                        }
                      }
                      else {
                        active[20]=1;
                        ends[20]=1;
                        break RUN;
                      }
                    }
                    else {
                      active[20]=1;
                      ends[20]=1;
                      break RUN;
                    }
                  }
                
              }
              break;
            
            case 1 : 
              switch(S115500){
                case 0 : 
                  switch(S115477){
                    case 0 : 
                      switch(S115351){
                        case 0 : 
                          switch(S115313){
                            case 0 : 
                              if(!capLoaderStatus_o.isPartnerPresent() || capLoaderStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 272, column: 6
                                capLoaderStatus_o.setREQ(false);//sysj\controller.sysj line: 272, column: 6
                                S115313=1;
                                active[20]=1;
                                ends[20]=1;
                                break RUN;
                              }
                              else {
                                switch(S115308){
                                  case 0 : 
                                    if(capLoaderStatus_o.isACK()){//sysj\controller.sysj line: 272, column: 6
                                      capLoaderStatus_o.setVal("busy");//sysj\controller.sysj line: 272, column: 6
                                      S115308=1;
                                      if(!capLoaderStatus_o.isACK()){//sysj\controller.sysj line: 272, column: 6
                                        capLoaderStatus_o.setREQ(false);//sysj\controller.sysj line: 272, column: 6
                                        ends[20]=2;
                                        ;//sysj\controller.sysj line: 272, column: 6
                                        S115351=1;
                                        if(pusherRetracted.getprestatus()){//sysj\controller.sysj line: 274, column: 14
                                          pusherExtend.setPresent();//sysj\controller.sysj line: 276, column: 8
                                          currsigs.addElement(pusherExtend);
                                          active[20]=1;
                                          ends[20]=1;
                                          break RUN;
                                        }
                                        else {
                                          S115351=2;
                                          active[20]=1;
                                          ends[20]=1;
                                          break RUN;
                                        }
                                      }
                                      else {
                                        active[20]=1;
                                        ends[20]=1;
                                        break RUN;
                                      }
                                    }
                                    else {
                                      active[20]=1;
                                      ends[20]=1;
                                      break RUN;
                                    }
                                  
                                  case 1 : 
                                    if(!capLoaderStatus_o.isACK()){//sysj\controller.sysj line: 272, column: 6
                                      capLoaderStatus_o.setREQ(false);//sysj\controller.sysj line: 272, column: 6
                                      ends[20]=2;
                                      ;//sysj\controller.sysj line: 272, column: 6
                                      S115351=1;
                                      if(pusherRetracted.getprestatus()){//sysj\controller.sysj line: 274, column: 14
                                        pusherExtend.setPresent();//sysj\controller.sysj line: 276, column: 8
                                        currsigs.addElement(pusherExtend);
                                        active[20]=1;
                                        ends[20]=1;
                                        break RUN;
                                      }
                                      else {
                                        S115351=2;
                                        active[20]=1;
                                        ends[20]=1;
                                        break RUN;
                                      }
                                    }
                                    else {
                                      active[20]=1;
                                      ends[20]=1;
                                      break RUN;
                                    }
                                  
                                }
                              }
                              break;
                            
                            case 1 : 
                              S115313=1;
                              S115313=0;
                              if(!capLoaderStatus_o.isPartnerPresent() || capLoaderStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 272, column: 6
                                capLoaderStatus_o.setREQ(false);//sysj\controller.sysj line: 272, column: 6
                                S115313=1;
                                active[20]=1;
                                ends[20]=1;
                                break RUN;
                              }
                              else {
                                S115308=0;
                                if(capLoaderStatus_o.isACK()){//sysj\controller.sysj line: 272, column: 6
                                  capLoaderStatus_o.setVal("busy");//sysj\controller.sysj line: 272, column: 6
                                  S115308=1;
                                  if(!capLoaderStatus_o.isACK()){//sysj\controller.sysj line: 272, column: 6
                                    capLoaderStatus_o.setREQ(false);//sysj\controller.sysj line: 272, column: 6
                                    ends[20]=2;
                                    ;//sysj\controller.sysj line: 272, column: 6
                                    S115351=1;
                                    if(pusherRetracted.getprestatus()){//sysj\controller.sysj line: 274, column: 14
                                      pusherExtend.setPresent();//sysj\controller.sysj line: 276, column: 8
                                      currsigs.addElement(pusherExtend);
                                      active[20]=1;
                                      ends[20]=1;
                                      break RUN;
                                    }
                                    else {
                                      S115351=2;
                                      active[20]=1;
                                      ends[20]=1;
                                      break RUN;
                                    }
                                  }
                                  else {
                                    active[20]=1;
                                    ends[20]=1;
                                    break RUN;
                                  }
                                }
                                else {
                                  active[20]=1;
                                  ends[20]=1;
                                  break RUN;
                                }
                              }
                            
                          }
                          break;
                        
                        case 1 : 
                          if(pusherExtended.getprestatus()){//sysj\controller.sysj line: 275, column: 13
                            S115351=2;
                            active[20]=1;
                            ends[20]=1;
                            break RUN;
                          }
                          else {
                            pusherExtend.setPresent();//sysj\controller.sysj line: 276, column: 8
                            currsigs.addElement(pusherExtend);
                            active[20]=1;
                            ends[20]=1;
                            break RUN;
                          }
                        
                        case 2 : 
                          S115351=2;
                          S115351=3;
                          armSource.setPresent();//sysj\controller.sysj line: 283, column: 7
                          currsigs.addElement(armSource);
                          active[20]=1;
                          ends[20]=1;
                          break RUN;
                        
                        case 3 : 
                          if(armAtSource.getprestatus()){//sysj\controller.sysj line: 282, column: 12
                            S115351=4;
                            active[20]=1;
                            ends[20]=1;
                            break RUN;
                          }
                          else {
                            armSource.setPresent();//sysj\controller.sysj line: 283, column: 7
                            currsigs.addElement(armSource);
                            active[20]=1;
                            ends[20]=1;
                            break RUN;
                          }
                        
                        case 4 : 
                          S115351=4;
                          S115351=5;
                          vacOn.setPresent();//sysj\controller.sysj line: 289, column: 7
                          currsigs.addElement(vacOn);
                          active[20]=1;
                          ends[20]=1;
                          break RUN;
                        
                        case 5 : 
                          if(WPgripped.getprestatus()){//sysj\controller.sysj line: 288, column: 12
                            S115351=6;
                            active[20]=1;
                            ends[20]=1;
                            break RUN;
                          }
                          else {
                            vacOn.setPresent();//sysj\controller.sysj line: 289, column: 7
                            currsigs.addElement(vacOn);
                            active[20]=1;
                            ends[20]=1;
                            break RUN;
                          }
                        
                        case 6 : 
                          S115351=6;
                          S115351=7;
                          thread117907(tdone,ends);
                          thread117908(tdone,ends);
                          int biggest117909 = 0;
                          if(ends[21]>=biggest117909){
                            biggest117909=ends[21];
                          }
                          if(ends[22]>=biggest117909){
                            biggest117909=ends[22];
                          }
                          if(biggest117909 == 1){
                            active[20]=1;
                            ends[20]=1;
                            break RUN;
                          }
                        
                        case 7 : 
                          if(armAtDest.getprestatus()){//sysj\controller.sysj line: 294, column: 13
                            S115351=8;
                            active[20]=1;
                            ends[20]=1;
                            break RUN;
                          }
                          else {
                            thread117910(tdone,ends);
                            thread117911(tdone,ends);
                            int biggest117912 = 0;
                            if(ends[21]>=biggest117912){
                              biggest117912=ends[21];
                            }
                            if(ends[22]>=biggest117912){
                              biggest117912=ends[22];
                            }
                            if(biggest117912 == 1){
                              active[20]=1;
                              ends[20]=1;
                              break RUN;
                            }
                            //FINXME code
                            if(biggest117912 == 0){
                              S115351=8;
                              active[20]=1;
                              ends[20]=1;
                              break RUN;
                            }
                          }
                        
                        case 8 : 
                          S115351=8;
                          S115477=1;
                          S115417=0;
                          if(!capLoaderStatus_o.isPartnerPresent() || capLoaderStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 300, column: 5
                            capLoaderStatus_o.setREQ(false);//sysj\controller.sysj line: 300, column: 5
                            S115417=1;
                            active[20]=1;
                            ends[20]=1;
                            break RUN;
                          }
                          else {
                            S115412=0;
                            if(capLoaderStatus_o.isACK()){//sysj\controller.sysj line: 300, column: 5
                              capLoaderStatus_o.setVal("done");//sysj\controller.sysj line: 300, column: 5
                              S115412=1;
                              if(!capLoaderStatus_o.isACK()){//sysj\controller.sysj line: 300, column: 5
                                capLoaderStatus_o.setREQ(false);//sysj\controller.sysj line: 300, column: 5
                                ends[20]=2;
                                ;//sysj\controller.sysj line: 300, column: 5
                                S115306=2;
                                active[20]=1;
                                ends[20]=1;
                                break RUN;
                              }
                              else {
                                active[20]=1;
                                ends[20]=1;
                                break RUN;
                              }
                            }
                            else {
                              active[20]=1;
                              ends[20]=1;
                              break RUN;
                            }
                          }
                        
                      }
                      break;
                    
                    case 1 : 
                      switch(S115417){
                        case 0 : 
                          if(!capLoaderStatus_o.isPartnerPresent() || capLoaderStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 300, column: 5
                            capLoaderStatus_o.setREQ(false);//sysj\controller.sysj line: 300, column: 5
                            S115417=1;
                            active[20]=1;
                            ends[20]=1;
                            break RUN;
                          }
                          else {
                            switch(S115412){
                              case 0 : 
                                if(capLoaderStatus_o.isACK()){//sysj\controller.sysj line: 300, column: 5
                                  capLoaderStatus_o.setVal("done");//sysj\controller.sysj line: 300, column: 5
                                  S115412=1;
                                  if(!capLoaderStatus_o.isACK()){//sysj\controller.sysj line: 300, column: 5
                                    capLoaderStatus_o.setREQ(false);//sysj\controller.sysj line: 300, column: 5
                                    ends[20]=2;
                                    ;//sysj\controller.sysj line: 300, column: 5
                                    S115306=2;
                                    active[20]=1;
                                    ends[20]=1;
                                    break RUN;
                                  }
                                  else {
                                    active[20]=1;
                                    ends[20]=1;
                                    break RUN;
                                  }
                                }
                                else {
                                  active[20]=1;
                                  ends[20]=1;
                                  break RUN;
                                }
                              
                              case 1 : 
                                if(!capLoaderStatus_o.isACK()){//sysj\controller.sysj line: 300, column: 5
                                  capLoaderStatus_o.setREQ(false);//sysj\controller.sysj line: 300, column: 5
                                  ends[20]=2;
                                  ;//sysj\controller.sysj line: 300, column: 5
                                  S115306=2;
                                  active[20]=1;
                                  ends[20]=1;
                                  break RUN;
                                }
                                else {
                                  active[20]=1;
                                  ends[20]=1;
                                  break RUN;
                                }
                              
                            }
                          }
                          break;
                        
                        case 1 : 
                          S115417=1;
                          S115417=0;
                          if(!capLoaderStatus_o.isPartnerPresent() || capLoaderStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 300, column: 5
                            capLoaderStatus_o.setREQ(false);//sysj\controller.sysj line: 300, column: 5
                            S115417=1;
                            active[20]=1;
                            ends[20]=1;
                            break RUN;
                          }
                          else {
                            S115412=0;
                            if(capLoaderStatus_o.isACK()){//sysj\controller.sysj line: 300, column: 5
                              capLoaderStatus_o.setVal("done");//sysj\controller.sysj line: 300, column: 5
                              S115412=1;
                              if(!capLoaderStatus_o.isACK()){//sysj\controller.sysj line: 300, column: 5
                                capLoaderStatus_o.setREQ(false);//sysj\controller.sysj line: 300, column: 5
                                ends[20]=2;
                                ;//sysj\controller.sysj line: 300, column: 5
                                S115306=2;
                                active[20]=1;
                                ends[20]=1;
                                break RUN;
                              }
                              else {
                                active[20]=1;
                                ends[20]=1;
                                break RUN;
                              }
                            }
                            else {
                              active[20]=1;
                              ends[20]=1;
                              break RUN;
                            }
                          }
                        
                      }
                      break;
                    
                  }
                  break;
                
                case 1 : 
                  switch(S115484){
                    case 0 : 
                      if(!capLoaderStatus_o.isPartnerPresent() || capLoaderStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 302, column: 5
                        capLoaderStatus_o.setREQ(false);//sysj\controller.sysj line: 302, column: 5
                        S115484=1;
                        active[20]=1;
                        ends[20]=1;
                        break RUN;
                      }
                      else {
                        switch(S115479){
                          case 0 : 
                            if(capLoaderStatus_o.isACK()){//sysj\controller.sysj line: 302, column: 5
                              capLoaderStatus_o.setVal("idle");//sysj\controller.sysj line: 302, column: 5
                              S115479=1;
                              if(!capLoaderStatus_o.isACK()){//sysj\controller.sysj line: 302, column: 5
                                capLoaderStatus_o.setREQ(false);//sysj\controller.sysj line: 302, column: 5
                                ends[20]=2;
                                ;//sysj\controller.sysj line: 302, column: 5
                                S115306=2;
                                active[20]=1;
                                ends[20]=1;
                                break RUN;
                              }
                              else {
                                active[20]=1;
                                ends[20]=1;
                                break RUN;
                              }
                            }
                            else {
                              active[20]=1;
                              ends[20]=1;
                              break RUN;
                            }
                          
                          case 1 : 
                            if(!capLoaderStatus_o.isACK()){//sysj\controller.sysj line: 302, column: 5
                              capLoaderStatus_o.setREQ(false);//sysj\controller.sysj line: 302, column: 5
                              ends[20]=2;
                              ;//sysj\controller.sysj line: 302, column: 5
                              S115306=2;
                              active[20]=1;
                              ends[20]=1;
                              break RUN;
                            }
                            else {
                              active[20]=1;
                              ends[20]=1;
                              break RUN;
                            }
                          
                        }
                      }
                      break;
                    
                    case 1 : 
                      S115484=1;
                      S115484=0;
                      if(!capLoaderStatus_o.isPartnerPresent() || capLoaderStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 302, column: 5
                        capLoaderStatus_o.setREQ(false);//sysj\controller.sysj line: 302, column: 5
                        S115484=1;
                        active[20]=1;
                        ends[20]=1;
                        break RUN;
                      }
                      else {
                        S115479=0;
                        if(capLoaderStatus_o.isACK()){//sysj\controller.sysj line: 302, column: 5
                          capLoaderStatus_o.setVal("idle");//sysj\controller.sysj line: 302, column: 5
                          S115479=1;
                          if(!capLoaderStatus_o.isACK()){//sysj\controller.sysj line: 302, column: 5
                            capLoaderStatus_o.setREQ(false);//sysj\controller.sysj line: 302, column: 5
                            ends[20]=2;
                            ;//sysj\controller.sysj line: 302, column: 5
                            S115306=2;
                            active[20]=1;
                            ends[20]=1;
                            break RUN;
                          }
                          else {
                            active[20]=1;
                            ends[20]=1;
                            break RUN;
                          }
                        }
                        else {
                          active[20]=1;
                          ends[20]=1;
                          break RUN;
                        }
                      }
                    
                  }
                  break;
                
              }
              break;
            
            case 2 : 
              S115306=2;
              S115306=0;
              S115290=0;
              if(!capLoaderReq_in.isPartnerPresent() || capLoaderReq_in.isPartnerPreempted()){//sysj\controller.sysj line: 265, column: 4
                capLoaderReq_in.setACK(false);//sysj\controller.sysj line: 265, column: 4
                S115290=1;
                active[20]=1;
                ends[20]=1;
                break RUN;
              }
              else {
                S115285=0;
                if(!capLoaderReq_in.isREQ()){//sysj\controller.sysj line: 265, column: 4
                  capLoaderReq_in.setACK(true);//sysj\controller.sysj line: 265, column: 4
                  S115285=1;
                  if(capLoaderReq_in.isREQ()){//sysj\controller.sysj line: 265, column: 4
                    capLoaderReq_in.setACK(false);//sysj\controller.sysj line: 265, column: 4
                    ends[20]=2;
                    ;//sysj\controller.sysj line: 265, column: 4
                    request_thread_20 = (capLoaderReq_in.getVal() == null ? null : ((Boolean)capLoaderReq_in.getVal()));//sysj\controller.sysj line: 266, column: 4
                    S115306=1;
                    if(request_thread_20){//sysj\controller.sysj line: 267, column: 4
                      S115500=0;
                      S115477=0;
                      if(bottleAtPos3.getprestatus()){//sysj\controller.sysj line: 269, column: 14
                        System.out.println("cap loader - bottle is at pos 3");//sysj\controller.sysj line: 270, column: 6
                        S115351=0;
                        S115313=0;
                        if(!capLoaderStatus_o.isPartnerPresent() || capLoaderStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 272, column: 6
                          capLoaderStatus_o.setREQ(false);//sysj\controller.sysj line: 272, column: 6
                          S115313=1;
                          active[20]=1;
                          ends[20]=1;
                          break RUN;
                        }
                        else {
                          S115308=0;
                          if(capLoaderStatus_o.isACK()){//sysj\controller.sysj line: 272, column: 6
                            capLoaderStatus_o.setVal("busy");//sysj\controller.sysj line: 272, column: 6
                            S115308=1;
                            if(!capLoaderStatus_o.isACK()){//sysj\controller.sysj line: 272, column: 6
                              capLoaderStatus_o.setREQ(false);//sysj\controller.sysj line: 272, column: 6
                              ends[20]=2;
                              ;//sysj\controller.sysj line: 272, column: 6
                              S115351=1;
                              if(pusherRetracted.getprestatus()){//sysj\controller.sysj line: 274, column: 14
                                pusherExtend.setPresent();//sysj\controller.sysj line: 276, column: 8
                                currsigs.addElement(pusherExtend);
                                active[20]=1;
                                ends[20]=1;
                                break RUN;
                              }
                              else {
                                S115351=2;
                                active[20]=1;
                                ends[20]=1;
                                break RUN;
                              }
                            }
                            else {
                              active[20]=1;
                              ends[20]=1;
                              break RUN;
                            }
                          }
                          else {
                            active[20]=1;
                            ends[20]=1;
                            break RUN;
                          }
                        }
                      }
                      else {
                        S115477=1;
                        S115417=0;
                        if(!capLoaderStatus_o.isPartnerPresent() || capLoaderStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 300, column: 5
                          capLoaderStatus_o.setREQ(false);//sysj\controller.sysj line: 300, column: 5
                          S115417=1;
                          active[20]=1;
                          ends[20]=1;
                          break RUN;
                        }
                        else {
                          S115412=0;
                          if(capLoaderStatus_o.isACK()){//sysj\controller.sysj line: 300, column: 5
                            capLoaderStatus_o.setVal("done");//sysj\controller.sysj line: 300, column: 5
                            S115412=1;
                            if(!capLoaderStatus_o.isACK()){//sysj\controller.sysj line: 300, column: 5
                              capLoaderStatus_o.setREQ(false);//sysj\controller.sysj line: 300, column: 5
                              ends[20]=2;
                              ;//sysj\controller.sysj line: 300, column: 5
                              S115306=2;
                              active[20]=1;
                              ends[20]=1;
                              break RUN;
                            }
                            else {
                              active[20]=1;
                              ends[20]=1;
                              break RUN;
                            }
                          }
                          else {
                            active[20]=1;
                            ends[20]=1;
                            break RUN;
                          }
                        }
                      }
                    }
                    else {
                      S115500=1;
                      S115484=0;
                      if(!capLoaderStatus_o.isPartnerPresent() || capLoaderStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 302, column: 5
                        capLoaderStatus_o.setREQ(false);//sysj\controller.sysj line: 302, column: 5
                        S115484=1;
                        active[20]=1;
                        ends[20]=1;
                        break RUN;
                      }
                      else {
                        S115479=0;
                        if(capLoaderStatus_o.isACK()){//sysj\controller.sysj line: 302, column: 5
                          capLoaderStatus_o.setVal("idle");//sysj\controller.sysj line: 302, column: 5
                          S115479=1;
                          if(!capLoaderStatus_o.isACK()){//sysj\controller.sysj line: 302, column: 5
                            capLoaderStatus_o.setREQ(false);//sysj\controller.sysj line: 302, column: 5
                            ends[20]=2;
                            ;//sysj\controller.sysj line: 302, column: 5
                            S115306=2;
                            active[20]=1;
                            ends[20]=1;
                            break RUN;
                          }
                          else {
                            active[20]=1;
                            ends[20]=1;
                            break RUN;
                          }
                        }
                        else {
                          active[20]=1;
                          ends[20]=1;
                          break RUN;
                        }
                      }
                    }
                  }
                  else {
                    active[20]=1;
                    ends[20]=1;
                    break RUN;
                  }
                }
                else {
                  active[20]=1;
                  ends[20]=1;
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
    while(active[20] != 0){
      int index = 20;
      if(paused[index]==1 || suspended[index]==1 || active[index] == 0){
        for(int h=1;h<paused.length;++h){
          paused[h]=0;
        }
      }
      if(paused[20]!=0 || suspended[20]!=0 || active[20]!=1);
      else{
        if(!df){
          capLoaderReq_in.gethook();
          capLoaderStatus_o.gethook();
          pusherRetracted.gethook();
          pusherExtended.gethook();
          WPgripped.gethook();
          armAtSource.gethook();
          armAtDest.gethook();
          bottleAtPos3.gethook();
          request.gethook();
          mode.gethook();
          pusherExtendM.gethook();
          vacOnM.gethook();
          armSourceM.gethook();
          armDestM.gethook();
          df = true;
        }
        runClockDomain();
      }
      pusherRetracted.setpreclear();
      pusherExtended.setpreclear();
      WPgripped.setpreclear();
      armAtSource.setpreclear();
      armAtDest.setpreclear();
      bottleAtPos3.setpreclear();
      request.setpreclear();
      mode.setpreclear();
      pusherExtendM.setpreclear();
      vacOnM.setpreclear();
      armSourceM.setpreclear();
      armDestM.setpreclear();
      pusherExtend.setpreclear();
      vacOn.setpreclear();
      armSource.setpreclear();
      armDest.setpreclear();
      int dummyint = 0;
      for(int qw=0;qw<currsigs.size();++qw){
        dummyint = ((Signal)currsigs.elementAt(qw)).getStatus() ? ((Signal)currsigs.elementAt(qw)).setprepresent() : ((Signal)currsigs.elementAt(qw)).setpreclear();
        ((Signal)currsigs.elementAt(qw)).setpreval(((Signal)currsigs.elementAt(qw)).getValue());
      }
      currsigs.removeAllElements();
      dummyint = pusherRetracted.getStatus() ? pusherRetracted.setprepresent() : pusherRetracted.setpreclear();
      pusherRetracted.setpreval(pusherRetracted.getValue());
      pusherRetracted.setClear();
      dummyint = pusherExtended.getStatus() ? pusherExtended.setprepresent() : pusherExtended.setpreclear();
      pusherExtended.setpreval(pusherExtended.getValue());
      pusherExtended.setClear();
      dummyint = WPgripped.getStatus() ? WPgripped.setprepresent() : WPgripped.setpreclear();
      WPgripped.setpreval(WPgripped.getValue());
      WPgripped.setClear();
      dummyint = armAtSource.getStatus() ? armAtSource.setprepresent() : armAtSource.setpreclear();
      armAtSource.setpreval(armAtSource.getValue());
      armAtSource.setClear();
      dummyint = armAtDest.getStatus() ? armAtDest.setprepresent() : armAtDest.setpreclear();
      armAtDest.setpreval(armAtDest.getValue());
      armAtDest.setClear();
      dummyint = bottleAtPos3.getStatus() ? bottleAtPos3.setprepresent() : bottleAtPos3.setpreclear();
      bottleAtPos3.setpreval(bottleAtPos3.getValue());
      bottleAtPos3.setClear();
      dummyint = request.getStatus() ? request.setprepresent() : request.setpreclear();
      request.setpreval(request.getValue());
      request.setClear();
      dummyint = mode.getStatus() ? mode.setprepresent() : mode.setpreclear();
      mode.setpreval(mode.getValue());
      mode.setClear();
      dummyint = pusherExtendM.getStatus() ? pusherExtendM.setprepresent() : pusherExtendM.setpreclear();
      pusherExtendM.setpreval(pusherExtendM.getValue());
      pusherExtendM.setClear();
      dummyint = vacOnM.getStatus() ? vacOnM.setprepresent() : vacOnM.setpreclear();
      vacOnM.setpreval(vacOnM.getValue());
      vacOnM.setClear();
      dummyint = armSourceM.getStatus() ? armSourceM.setprepresent() : armSourceM.setpreclear();
      armSourceM.setpreval(armSourceM.getValue());
      armSourceM.setClear();
      dummyint = armDestM.getStatus() ? armDestM.setprepresent() : armDestM.setpreclear();
      armDestM.setpreval(armDestM.getValue());
      armDestM.setClear();
      pusherExtend.sethook();
      pusherExtend.setClear();
      vacOn.sethook();
      vacOn.setClear();
      armSource.sethook();
      armSource.setClear();
      armDest.sethook();
      armDest.setClear();
      capLoaderReq_in.sethook();
      capLoaderStatus_o.sethook();
      if(paused[20]!=0 || suspended[20]!=0 || active[20]!=1);
      else{
        capLoaderReq_in.gethook();
        capLoaderStatus_o.gethook();
        pusherRetracted.gethook();
        pusherExtended.gethook();
        WPgripped.gethook();
        armAtSource.gethook();
        armAtDest.gethook();
        bottleAtPos3.gethook();
        request.gethook();
        mode.gethook();
        pusherExtendM.gethook();
        vacOnM.gethook();
        armSourceM.gethook();
        armDestM.gethook();
      }
      runFinisher();
      if(active[20] == 0){
      	this.terminated = true;
      }
      if(!threaded) break;
    }
  }
}
