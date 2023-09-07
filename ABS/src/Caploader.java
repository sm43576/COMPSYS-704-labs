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
  private Boolean request_thread_20;//sysj\controller.sysj line: 263, column: 4
  private int S113362 = 1;
  private int S110986 = 1;
  private int S110970 = 1;
  private int S110965 = 1;
  private int S111180 = 1;
  private int S111157 = 1;
  private int S111031 = 1;
  private int S110993 = 1;
  private int S110988 = 1;
  private int S111072 = 1;
  private int S111077 = 1;
  private int S111097 = 1;
  private int S111092 = 1;
  private int S111164 = 1;
  private int S111159 = 1;
  
  private int[] ends = new int[23];
  private int[] tdone = new int[23];
  
  public void thread113591(int [] tdone, int [] ends){
        switch(S111077){
      case 0 : 
        active[22]=0;
        ends[22]=0;
        tdone[22]=1;
        break;
      
      case 1 : 
        vacOn.setPresent();//sysj\controller.sysj line: 292, column: 30
        currsigs.addElement(vacOn);
        active[22]=1;
        ends[22]=1;
        tdone[22]=1;
        break;
      
    }
  }

  public void thread113590(int [] tdone, int [] ends){
        switch(S111072){
      case 0 : 
        active[21]=0;
        ends[21]=0;
        tdone[21]=1;
        break;
      
      case 1 : 
        armDest.setPresent();//sysj\controller.sysj line: 292, column: 8
        currsigs.addElement(armDest);
        active[21]=1;
        ends[21]=1;
        tdone[21]=1;
        break;
      
    }
  }

  public void thread113588(int [] tdone, int [] ends){
        S111077=1;
    vacOn.setPresent();//sysj\controller.sysj line: 292, column: 30
    currsigs.addElement(vacOn);
    active[22]=1;
    ends[22]=1;
    tdone[22]=1;
  }

  public void thread113587(int [] tdone, int [] ends){
        S111072=1;
    armDest.setPresent();//sysj\controller.sysj line: 292, column: 8
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
      switch(S113362){
        case 0 : 
          S113362=0;
          break RUN;
        
        case 1 : 
          S113362=2;
          S113362=2;
          S110986=0;
          S110970=0;
          if(!capLoaderReq_in.isPartnerPresent() || capLoaderReq_in.isPartnerPreempted()){//sysj\controller.sysj line: 262, column: 4
            capLoaderReq_in.setACK(false);//sysj\controller.sysj line: 262, column: 4
            S110970=1;
            active[20]=1;
            ends[20]=1;
            break RUN;
          }
          else {
            S110965=0;
            if(!capLoaderReq_in.isREQ()){//sysj\controller.sysj line: 262, column: 4
              capLoaderReq_in.setACK(true);//sysj\controller.sysj line: 262, column: 4
              S110965=1;
              if(capLoaderReq_in.isREQ()){//sysj\controller.sysj line: 262, column: 4
                capLoaderReq_in.setACK(false);//sysj\controller.sysj line: 262, column: 4
                ends[20]=2;
                ;//sysj\controller.sysj line: 262, column: 4
                request_thread_20 = (capLoaderReq_in.getVal() == null ? null : ((Boolean)capLoaderReq_in.getVal()));//sysj\controller.sysj line: 263, column: 4
                S110986=1;
                if(request_thread_20){//sysj\controller.sysj line: 264, column: 4
                  S111180=0;
                  S111157=0;
                  if(bottleAtPos3.getprestatus()){//sysj\controller.sysj line: 266, column: 14
                    System.out.println("cap loader - bottle is at pos 3");//sysj\controller.sysj line: 267, column: 6
                    S111031=0;
                    S110993=0;
                    if(!capLoaderStatus_o.isPartnerPresent() || capLoaderStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 269, column: 6
                      capLoaderStatus_o.setREQ(false);//sysj\controller.sysj line: 269, column: 6
                      S110993=1;
                      active[20]=1;
                      ends[20]=1;
                      break RUN;
                    }
                    else {
                      S110988=0;
                      if(capLoaderStatus_o.isACK()){//sysj\controller.sysj line: 269, column: 6
                        capLoaderStatus_o.setVal("busy");//sysj\controller.sysj line: 269, column: 6
                        S110988=1;
                        if(!capLoaderStatus_o.isACK()){//sysj\controller.sysj line: 269, column: 6
                          capLoaderStatus_o.setREQ(false);//sysj\controller.sysj line: 269, column: 6
                          ends[20]=2;
                          ;//sysj\controller.sysj line: 269, column: 6
                          S111031=1;
                          if(pusherRetracted.getprestatus()){//sysj\controller.sysj line: 271, column: 14
                            pusherExtend.setPresent();//sysj\controller.sysj line: 273, column: 8
                            currsigs.addElement(pusherExtend);
                            active[20]=1;
                            ends[20]=1;
                            break RUN;
                          }
                          else {
                            S111031=2;
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
                    S111157=1;
                    S111097=0;
                    if(!capLoaderStatus_o.isPartnerPresent() || capLoaderStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 297, column: 5
                      capLoaderStatus_o.setREQ(false);//sysj\controller.sysj line: 297, column: 5
                      S111097=1;
                      active[20]=1;
                      ends[20]=1;
                      break RUN;
                    }
                    else {
                      S111092=0;
                      if(capLoaderStatus_o.isACK()){//sysj\controller.sysj line: 297, column: 5
                        capLoaderStatus_o.setVal("done");//sysj\controller.sysj line: 297, column: 5
                        S111092=1;
                        if(!capLoaderStatus_o.isACK()){//sysj\controller.sysj line: 297, column: 5
                          capLoaderStatus_o.setREQ(false);//sysj\controller.sysj line: 297, column: 5
                          ends[20]=2;
                          ;//sysj\controller.sysj line: 297, column: 5
                          S110986=2;
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
                  S111180=1;
                  S111164=0;
                  if(!capLoaderStatus_o.isPartnerPresent() || capLoaderStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 299, column: 5
                    capLoaderStatus_o.setREQ(false);//sysj\controller.sysj line: 299, column: 5
                    S111164=1;
                    active[20]=1;
                    ends[20]=1;
                    break RUN;
                  }
                  else {
                    S111159=0;
                    if(capLoaderStatus_o.isACK()){//sysj\controller.sysj line: 299, column: 5
                      capLoaderStatus_o.setVal("idle");//sysj\controller.sysj line: 299, column: 5
                      S111159=1;
                      if(!capLoaderStatus_o.isACK()){//sysj\controller.sysj line: 299, column: 5
                        capLoaderStatus_o.setREQ(false);//sysj\controller.sysj line: 299, column: 5
                        ends[20]=2;
                        ;//sysj\controller.sysj line: 299, column: 5
                        S110986=2;
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
          switch(S110986){
            case 0 : 
              switch(S110970){
                case 0 : 
                  if(!capLoaderReq_in.isPartnerPresent() || capLoaderReq_in.isPartnerPreempted()){//sysj\controller.sysj line: 262, column: 4
                    capLoaderReq_in.setACK(false);//sysj\controller.sysj line: 262, column: 4
                    S110970=1;
                    active[20]=1;
                    ends[20]=1;
                    break RUN;
                  }
                  else {
                    switch(S110965){
                      case 0 : 
                        if(!capLoaderReq_in.isREQ()){//sysj\controller.sysj line: 262, column: 4
                          capLoaderReq_in.setACK(true);//sysj\controller.sysj line: 262, column: 4
                          S110965=1;
                          if(capLoaderReq_in.isREQ()){//sysj\controller.sysj line: 262, column: 4
                            capLoaderReq_in.setACK(false);//sysj\controller.sysj line: 262, column: 4
                            ends[20]=2;
                            ;//sysj\controller.sysj line: 262, column: 4
                            request_thread_20 = (capLoaderReq_in.getVal() == null ? null : ((Boolean)capLoaderReq_in.getVal()));//sysj\controller.sysj line: 263, column: 4
                            S110986=1;
                            if(request_thread_20){//sysj\controller.sysj line: 264, column: 4
                              S111180=0;
                              S111157=0;
                              if(bottleAtPos3.getprestatus()){//sysj\controller.sysj line: 266, column: 14
                                System.out.println("cap loader - bottle is at pos 3");//sysj\controller.sysj line: 267, column: 6
                                S111031=0;
                                S110993=0;
                                if(!capLoaderStatus_o.isPartnerPresent() || capLoaderStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 269, column: 6
                                  capLoaderStatus_o.setREQ(false);//sysj\controller.sysj line: 269, column: 6
                                  S110993=1;
                                  active[20]=1;
                                  ends[20]=1;
                                  break RUN;
                                }
                                else {
                                  S110988=0;
                                  if(capLoaderStatus_o.isACK()){//sysj\controller.sysj line: 269, column: 6
                                    capLoaderStatus_o.setVal("busy");//sysj\controller.sysj line: 269, column: 6
                                    S110988=1;
                                    if(!capLoaderStatus_o.isACK()){//sysj\controller.sysj line: 269, column: 6
                                      capLoaderStatus_o.setREQ(false);//sysj\controller.sysj line: 269, column: 6
                                      ends[20]=2;
                                      ;//sysj\controller.sysj line: 269, column: 6
                                      S111031=1;
                                      if(pusherRetracted.getprestatus()){//sysj\controller.sysj line: 271, column: 14
                                        pusherExtend.setPresent();//sysj\controller.sysj line: 273, column: 8
                                        currsigs.addElement(pusherExtend);
                                        active[20]=1;
                                        ends[20]=1;
                                        break RUN;
                                      }
                                      else {
                                        S111031=2;
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
                                S111157=1;
                                S111097=0;
                                if(!capLoaderStatus_o.isPartnerPresent() || capLoaderStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 297, column: 5
                                  capLoaderStatus_o.setREQ(false);//sysj\controller.sysj line: 297, column: 5
                                  S111097=1;
                                  active[20]=1;
                                  ends[20]=1;
                                  break RUN;
                                }
                                else {
                                  S111092=0;
                                  if(capLoaderStatus_o.isACK()){//sysj\controller.sysj line: 297, column: 5
                                    capLoaderStatus_o.setVal("done");//sysj\controller.sysj line: 297, column: 5
                                    S111092=1;
                                    if(!capLoaderStatus_o.isACK()){//sysj\controller.sysj line: 297, column: 5
                                      capLoaderStatus_o.setREQ(false);//sysj\controller.sysj line: 297, column: 5
                                      ends[20]=2;
                                      ;//sysj\controller.sysj line: 297, column: 5
                                      S110986=2;
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
                              S111180=1;
                              S111164=0;
                              if(!capLoaderStatus_o.isPartnerPresent() || capLoaderStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 299, column: 5
                                capLoaderStatus_o.setREQ(false);//sysj\controller.sysj line: 299, column: 5
                                S111164=1;
                                active[20]=1;
                                ends[20]=1;
                                break RUN;
                              }
                              else {
                                S111159=0;
                                if(capLoaderStatus_o.isACK()){//sysj\controller.sysj line: 299, column: 5
                                  capLoaderStatus_o.setVal("idle");//sysj\controller.sysj line: 299, column: 5
                                  S111159=1;
                                  if(!capLoaderStatus_o.isACK()){//sysj\controller.sysj line: 299, column: 5
                                    capLoaderStatus_o.setREQ(false);//sysj\controller.sysj line: 299, column: 5
                                    ends[20]=2;
                                    ;//sysj\controller.sysj line: 299, column: 5
                                    S110986=2;
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
                        if(capLoaderReq_in.isREQ()){//sysj\controller.sysj line: 262, column: 4
                          capLoaderReq_in.setACK(false);//sysj\controller.sysj line: 262, column: 4
                          ends[20]=2;
                          ;//sysj\controller.sysj line: 262, column: 4
                          request_thread_20 = (capLoaderReq_in.getVal() == null ? null : ((Boolean)capLoaderReq_in.getVal()));//sysj\controller.sysj line: 263, column: 4
                          S110986=1;
                          if(request_thread_20){//sysj\controller.sysj line: 264, column: 4
                            S111180=0;
                            S111157=0;
                            if(bottleAtPos3.getprestatus()){//sysj\controller.sysj line: 266, column: 14
                              System.out.println("cap loader - bottle is at pos 3");//sysj\controller.sysj line: 267, column: 6
                              S111031=0;
                              S110993=0;
                              if(!capLoaderStatus_o.isPartnerPresent() || capLoaderStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 269, column: 6
                                capLoaderStatus_o.setREQ(false);//sysj\controller.sysj line: 269, column: 6
                                S110993=1;
                                active[20]=1;
                                ends[20]=1;
                                break RUN;
                              }
                              else {
                                S110988=0;
                                if(capLoaderStatus_o.isACK()){//sysj\controller.sysj line: 269, column: 6
                                  capLoaderStatus_o.setVal("busy");//sysj\controller.sysj line: 269, column: 6
                                  S110988=1;
                                  if(!capLoaderStatus_o.isACK()){//sysj\controller.sysj line: 269, column: 6
                                    capLoaderStatus_o.setREQ(false);//sysj\controller.sysj line: 269, column: 6
                                    ends[20]=2;
                                    ;//sysj\controller.sysj line: 269, column: 6
                                    S111031=1;
                                    if(pusherRetracted.getprestatus()){//sysj\controller.sysj line: 271, column: 14
                                      pusherExtend.setPresent();//sysj\controller.sysj line: 273, column: 8
                                      currsigs.addElement(pusherExtend);
                                      active[20]=1;
                                      ends[20]=1;
                                      break RUN;
                                    }
                                    else {
                                      S111031=2;
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
                              S111157=1;
                              S111097=0;
                              if(!capLoaderStatus_o.isPartnerPresent() || capLoaderStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 297, column: 5
                                capLoaderStatus_o.setREQ(false);//sysj\controller.sysj line: 297, column: 5
                                S111097=1;
                                active[20]=1;
                                ends[20]=1;
                                break RUN;
                              }
                              else {
                                S111092=0;
                                if(capLoaderStatus_o.isACK()){//sysj\controller.sysj line: 297, column: 5
                                  capLoaderStatus_o.setVal("done");//sysj\controller.sysj line: 297, column: 5
                                  S111092=1;
                                  if(!capLoaderStatus_o.isACK()){//sysj\controller.sysj line: 297, column: 5
                                    capLoaderStatus_o.setREQ(false);//sysj\controller.sysj line: 297, column: 5
                                    ends[20]=2;
                                    ;//sysj\controller.sysj line: 297, column: 5
                                    S110986=2;
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
                            S111180=1;
                            S111164=0;
                            if(!capLoaderStatus_o.isPartnerPresent() || capLoaderStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 299, column: 5
                              capLoaderStatus_o.setREQ(false);//sysj\controller.sysj line: 299, column: 5
                              S111164=1;
                              active[20]=1;
                              ends[20]=1;
                              break RUN;
                            }
                            else {
                              S111159=0;
                              if(capLoaderStatus_o.isACK()){//sysj\controller.sysj line: 299, column: 5
                                capLoaderStatus_o.setVal("idle");//sysj\controller.sysj line: 299, column: 5
                                S111159=1;
                                if(!capLoaderStatus_o.isACK()){//sysj\controller.sysj line: 299, column: 5
                                  capLoaderStatus_o.setREQ(false);//sysj\controller.sysj line: 299, column: 5
                                  ends[20]=2;
                                  ;//sysj\controller.sysj line: 299, column: 5
                                  S110986=2;
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
                  S110970=1;
                  S110970=0;
                  if(!capLoaderReq_in.isPartnerPresent() || capLoaderReq_in.isPartnerPreempted()){//sysj\controller.sysj line: 262, column: 4
                    capLoaderReq_in.setACK(false);//sysj\controller.sysj line: 262, column: 4
                    S110970=1;
                    active[20]=1;
                    ends[20]=1;
                    break RUN;
                  }
                  else {
                    S110965=0;
                    if(!capLoaderReq_in.isREQ()){//sysj\controller.sysj line: 262, column: 4
                      capLoaderReq_in.setACK(true);//sysj\controller.sysj line: 262, column: 4
                      S110965=1;
                      if(capLoaderReq_in.isREQ()){//sysj\controller.sysj line: 262, column: 4
                        capLoaderReq_in.setACK(false);//sysj\controller.sysj line: 262, column: 4
                        ends[20]=2;
                        ;//sysj\controller.sysj line: 262, column: 4
                        request_thread_20 = (capLoaderReq_in.getVal() == null ? null : ((Boolean)capLoaderReq_in.getVal()));//sysj\controller.sysj line: 263, column: 4
                        S110986=1;
                        if(request_thread_20){//sysj\controller.sysj line: 264, column: 4
                          S111180=0;
                          S111157=0;
                          if(bottleAtPos3.getprestatus()){//sysj\controller.sysj line: 266, column: 14
                            System.out.println("cap loader - bottle is at pos 3");//sysj\controller.sysj line: 267, column: 6
                            S111031=0;
                            S110993=0;
                            if(!capLoaderStatus_o.isPartnerPresent() || capLoaderStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 269, column: 6
                              capLoaderStatus_o.setREQ(false);//sysj\controller.sysj line: 269, column: 6
                              S110993=1;
                              active[20]=1;
                              ends[20]=1;
                              break RUN;
                            }
                            else {
                              S110988=0;
                              if(capLoaderStatus_o.isACK()){//sysj\controller.sysj line: 269, column: 6
                                capLoaderStatus_o.setVal("busy");//sysj\controller.sysj line: 269, column: 6
                                S110988=1;
                                if(!capLoaderStatus_o.isACK()){//sysj\controller.sysj line: 269, column: 6
                                  capLoaderStatus_o.setREQ(false);//sysj\controller.sysj line: 269, column: 6
                                  ends[20]=2;
                                  ;//sysj\controller.sysj line: 269, column: 6
                                  S111031=1;
                                  if(pusherRetracted.getprestatus()){//sysj\controller.sysj line: 271, column: 14
                                    pusherExtend.setPresent();//sysj\controller.sysj line: 273, column: 8
                                    currsigs.addElement(pusherExtend);
                                    active[20]=1;
                                    ends[20]=1;
                                    break RUN;
                                  }
                                  else {
                                    S111031=2;
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
                            S111157=1;
                            S111097=0;
                            if(!capLoaderStatus_o.isPartnerPresent() || capLoaderStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 297, column: 5
                              capLoaderStatus_o.setREQ(false);//sysj\controller.sysj line: 297, column: 5
                              S111097=1;
                              active[20]=1;
                              ends[20]=1;
                              break RUN;
                            }
                            else {
                              S111092=0;
                              if(capLoaderStatus_o.isACK()){//sysj\controller.sysj line: 297, column: 5
                                capLoaderStatus_o.setVal("done");//sysj\controller.sysj line: 297, column: 5
                                S111092=1;
                                if(!capLoaderStatus_o.isACK()){//sysj\controller.sysj line: 297, column: 5
                                  capLoaderStatus_o.setREQ(false);//sysj\controller.sysj line: 297, column: 5
                                  ends[20]=2;
                                  ;//sysj\controller.sysj line: 297, column: 5
                                  S110986=2;
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
                          S111180=1;
                          S111164=0;
                          if(!capLoaderStatus_o.isPartnerPresent() || capLoaderStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 299, column: 5
                            capLoaderStatus_o.setREQ(false);//sysj\controller.sysj line: 299, column: 5
                            S111164=1;
                            active[20]=1;
                            ends[20]=1;
                            break RUN;
                          }
                          else {
                            S111159=0;
                            if(capLoaderStatus_o.isACK()){//sysj\controller.sysj line: 299, column: 5
                              capLoaderStatus_o.setVal("idle");//sysj\controller.sysj line: 299, column: 5
                              S111159=1;
                              if(!capLoaderStatus_o.isACK()){//sysj\controller.sysj line: 299, column: 5
                                capLoaderStatus_o.setREQ(false);//sysj\controller.sysj line: 299, column: 5
                                ends[20]=2;
                                ;//sysj\controller.sysj line: 299, column: 5
                                S110986=2;
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
              switch(S111180){
                case 0 : 
                  switch(S111157){
                    case 0 : 
                      switch(S111031){
                        case 0 : 
                          switch(S110993){
                            case 0 : 
                              if(!capLoaderStatus_o.isPartnerPresent() || capLoaderStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 269, column: 6
                                capLoaderStatus_o.setREQ(false);//sysj\controller.sysj line: 269, column: 6
                                S110993=1;
                                active[20]=1;
                                ends[20]=1;
                                break RUN;
                              }
                              else {
                                switch(S110988){
                                  case 0 : 
                                    if(capLoaderStatus_o.isACK()){//sysj\controller.sysj line: 269, column: 6
                                      capLoaderStatus_o.setVal("busy");//sysj\controller.sysj line: 269, column: 6
                                      S110988=1;
                                      if(!capLoaderStatus_o.isACK()){//sysj\controller.sysj line: 269, column: 6
                                        capLoaderStatus_o.setREQ(false);//sysj\controller.sysj line: 269, column: 6
                                        ends[20]=2;
                                        ;//sysj\controller.sysj line: 269, column: 6
                                        S111031=1;
                                        if(pusherRetracted.getprestatus()){//sysj\controller.sysj line: 271, column: 14
                                          pusherExtend.setPresent();//sysj\controller.sysj line: 273, column: 8
                                          currsigs.addElement(pusherExtend);
                                          active[20]=1;
                                          ends[20]=1;
                                          break RUN;
                                        }
                                        else {
                                          S111031=2;
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
                                    if(!capLoaderStatus_o.isACK()){//sysj\controller.sysj line: 269, column: 6
                                      capLoaderStatus_o.setREQ(false);//sysj\controller.sysj line: 269, column: 6
                                      ends[20]=2;
                                      ;//sysj\controller.sysj line: 269, column: 6
                                      S111031=1;
                                      if(pusherRetracted.getprestatus()){//sysj\controller.sysj line: 271, column: 14
                                        pusherExtend.setPresent();//sysj\controller.sysj line: 273, column: 8
                                        currsigs.addElement(pusherExtend);
                                        active[20]=1;
                                        ends[20]=1;
                                        break RUN;
                                      }
                                      else {
                                        S111031=2;
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
                              S110993=1;
                              S110993=0;
                              if(!capLoaderStatus_o.isPartnerPresent() || capLoaderStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 269, column: 6
                                capLoaderStatus_o.setREQ(false);//sysj\controller.sysj line: 269, column: 6
                                S110993=1;
                                active[20]=1;
                                ends[20]=1;
                                break RUN;
                              }
                              else {
                                S110988=0;
                                if(capLoaderStatus_o.isACK()){//sysj\controller.sysj line: 269, column: 6
                                  capLoaderStatus_o.setVal("busy");//sysj\controller.sysj line: 269, column: 6
                                  S110988=1;
                                  if(!capLoaderStatus_o.isACK()){//sysj\controller.sysj line: 269, column: 6
                                    capLoaderStatus_o.setREQ(false);//sysj\controller.sysj line: 269, column: 6
                                    ends[20]=2;
                                    ;//sysj\controller.sysj line: 269, column: 6
                                    S111031=1;
                                    if(pusherRetracted.getprestatus()){//sysj\controller.sysj line: 271, column: 14
                                      pusherExtend.setPresent();//sysj\controller.sysj line: 273, column: 8
                                      currsigs.addElement(pusherExtend);
                                      active[20]=1;
                                      ends[20]=1;
                                      break RUN;
                                    }
                                    else {
                                      S111031=2;
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
                          if(pusherExtended.getprestatus()){//sysj\controller.sysj line: 272, column: 13
                            S111031=2;
                            active[20]=1;
                            ends[20]=1;
                            break RUN;
                          }
                          else {
                            pusherExtend.setPresent();//sysj\controller.sysj line: 273, column: 8
                            currsigs.addElement(pusherExtend);
                            active[20]=1;
                            ends[20]=1;
                            break RUN;
                          }
                        
                        case 2 : 
                          S111031=2;
                          S111031=3;
                          armSource.setPresent();//sysj\controller.sysj line: 280, column: 7
                          currsigs.addElement(armSource);
                          active[20]=1;
                          ends[20]=1;
                          break RUN;
                        
                        case 3 : 
                          if(armAtSource.getprestatus()){//sysj\controller.sysj line: 279, column: 12
                            S111031=4;
                            active[20]=1;
                            ends[20]=1;
                            break RUN;
                          }
                          else {
                            armSource.setPresent();//sysj\controller.sysj line: 280, column: 7
                            currsigs.addElement(armSource);
                            active[20]=1;
                            ends[20]=1;
                            break RUN;
                          }
                        
                        case 4 : 
                          S111031=4;
                          S111031=5;
                          vacOn.setPresent();//sysj\controller.sysj line: 286, column: 7
                          currsigs.addElement(vacOn);
                          active[20]=1;
                          ends[20]=1;
                          break RUN;
                        
                        case 5 : 
                          if(WPgripped.getprestatus()){//sysj\controller.sysj line: 285, column: 12
                            S111031=6;
                            active[20]=1;
                            ends[20]=1;
                            break RUN;
                          }
                          else {
                            vacOn.setPresent();//sysj\controller.sysj line: 286, column: 7
                            currsigs.addElement(vacOn);
                            active[20]=1;
                            ends[20]=1;
                            break RUN;
                          }
                        
                        case 6 : 
                          S111031=6;
                          S111031=7;
                          thread113587(tdone,ends);
                          thread113588(tdone,ends);
                          int biggest113589 = 0;
                          if(ends[21]>=biggest113589){
                            biggest113589=ends[21];
                          }
                          if(ends[22]>=biggest113589){
                            biggest113589=ends[22];
                          }
                          if(biggest113589 == 1){
                            active[20]=1;
                            ends[20]=1;
                            break RUN;
                          }
                        
                        case 7 : 
                          if(armAtDest.getprestatus()){//sysj\controller.sysj line: 291, column: 13
                            S111031=8;
                            active[20]=1;
                            ends[20]=1;
                            break RUN;
                          }
                          else {
                            thread113590(tdone,ends);
                            thread113591(tdone,ends);
                            int biggest113592 = 0;
                            if(ends[21]>=biggest113592){
                              biggest113592=ends[21];
                            }
                            if(ends[22]>=biggest113592){
                              biggest113592=ends[22];
                            }
                            if(biggest113592 == 1){
                              active[20]=1;
                              ends[20]=1;
                              break RUN;
                            }
                            //FINXME code
                            if(biggest113592 == 0){
                              S111031=8;
                              active[20]=1;
                              ends[20]=1;
                              break RUN;
                            }
                          }
                        
                        case 8 : 
                          S111031=8;
                          S111157=1;
                          S111097=0;
                          if(!capLoaderStatus_o.isPartnerPresent() || capLoaderStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 297, column: 5
                            capLoaderStatus_o.setREQ(false);//sysj\controller.sysj line: 297, column: 5
                            S111097=1;
                            active[20]=1;
                            ends[20]=1;
                            break RUN;
                          }
                          else {
                            S111092=0;
                            if(capLoaderStatus_o.isACK()){//sysj\controller.sysj line: 297, column: 5
                              capLoaderStatus_o.setVal("done");//sysj\controller.sysj line: 297, column: 5
                              S111092=1;
                              if(!capLoaderStatus_o.isACK()){//sysj\controller.sysj line: 297, column: 5
                                capLoaderStatus_o.setREQ(false);//sysj\controller.sysj line: 297, column: 5
                                ends[20]=2;
                                ;//sysj\controller.sysj line: 297, column: 5
                                S110986=2;
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
                      switch(S111097){
                        case 0 : 
                          if(!capLoaderStatus_o.isPartnerPresent() || capLoaderStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 297, column: 5
                            capLoaderStatus_o.setREQ(false);//sysj\controller.sysj line: 297, column: 5
                            S111097=1;
                            active[20]=1;
                            ends[20]=1;
                            break RUN;
                          }
                          else {
                            switch(S111092){
                              case 0 : 
                                if(capLoaderStatus_o.isACK()){//sysj\controller.sysj line: 297, column: 5
                                  capLoaderStatus_o.setVal("done");//sysj\controller.sysj line: 297, column: 5
                                  S111092=1;
                                  if(!capLoaderStatus_o.isACK()){//sysj\controller.sysj line: 297, column: 5
                                    capLoaderStatus_o.setREQ(false);//sysj\controller.sysj line: 297, column: 5
                                    ends[20]=2;
                                    ;//sysj\controller.sysj line: 297, column: 5
                                    S110986=2;
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
                                if(!capLoaderStatus_o.isACK()){//sysj\controller.sysj line: 297, column: 5
                                  capLoaderStatus_o.setREQ(false);//sysj\controller.sysj line: 297, column: 5
                                  ends[20]=2;
                                  ;//sysj\controller.sysj line: 297, column: 5
                                  S110986=2;
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
                          S111097=1;
                          S111097=0;
                          if(!capLoaderStatus_o.isPartnerPresent() || capLoaderStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 297, column: 5
                            capLoaderStatus_o.setREQ(false);//sysj\controller.sysj line: 297, column: 5
                            S111097=1;
                            active[20]=1;
                            ends[20]=1;
                            break RUN;
                          }
                          else {
                            S111092=0;
                            if(capLoaderStatus_o.isACK()){//sysj\controller.sysj line: 297, column: 5
                              capLoaderStatus_o.setVal("done");//sysj\controller.sysj line: 297, column: 5
                              S111092=1;
                              if(!capLoaderStatus_o.isACK()){//sysj\controller.sysj line: 297, column: 5
                                capLoaderStatus_o.setREQ(false);//sysj\controller.sysj line: 297, column: 5
                                ends[20]=2;
                                ;//sysj\controller.sysj line: 297, column: 5
                                S110986=2;
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
                  switch(S111164){
                    case 0 : 
                      if(!capLoaderStatus_o.isPartnerPresent() || capLoaderStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 299, column: 5
                        capLoaderStatus_o.setREQ(false);//sysj\controller.sysj line: 299, column: 5
                        S111164=1;
                        active[20]=1;
                        ends[20]=1;
                        break RUN;
                      }
                      else {
                        switch(S111159){
                          case 0 : 
                            if(capLoaderStatus_o.isACK()){//sysj\controller.sysj line: 299, column: 5
                              capLoaderStatus_o.setVal("idle");//sysj\controller.sysj line: 299, column: 5
                              S111159=1;
                              if(!capLoaderStatus_o.isACK()){//sysj\controller.sysj line: 299, column: 5
                                capLoaderStatus_o.setREQ(false);//sysj\controller.sysj line: 299, column: 5
                                ends[20]=2;
                                ;//sysj\controller.sysj line: 299, column: 5
                                S110986=2;
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
                            if(!capLoaderStatus_o.isACK()){//sysj\controller.sysj line: 299, column: 5
                              capLoaderStatus_o.setREQ(false);//sysj\controller.sysj line: 299, column: 5
                              ends[20]=2;
                              ;//sysj\controller.sysj line: 299, column: 5
                              S110986=2;
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
                      S111164=1;
                      S111164=0;
                      if(!capLoaderStatus_o.isPartnerPresent() || capLoaderStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 299, column: 5
                        capLoaderStatus_o.setREQ(false);//sysj\controller.sysj line: 299, column: 5
                        S111164=1;
                        active[20]=1;
                        ends[20]=1;
                        break RUN;
                      }
                      else {
                        S111159=0;
                        if(capLoaderStatus_o.isACK()){//sysj\controller.sysj line: 299, column: 5
                          capLoaderStatus_o.setVal("idle");//sysj\controller.sysj line: 299, column: 5
                          S111159=1;
                          if(!capLoaderStatus_o.isACK()){//sysj\controller.sysj line: 299, column: 5
                            capLoaderStatus_o.setREQ(false);//sysj\controller.sysj line: 299, column: 5
                            ends[20]=2;
                            ;//sysj\controller.sysj line: 299, column: 5
                            S110986=2;
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
              S110986=2;
              S110986=0;
              S110970=0;
              if(!capLoaderReq_in.isPartnerPresent() || capLoaderReq_in.isPartnerPreempted()){//sysj\controller.sysj line: 262, column: 4
                capLoaderReq_in.setACK(false);//sysj\controller.sysj line: 262, column: 4
                S110970=1;
                active[20]=1;
                ends[20]=1;
                break RUN;
              }
              else {
                S110965=0;
                if(!capLoaderReq_in.isREQ()){//sysj\controller.sysj line: 262, column: 4
                  capLoaderReq_in.setACK(true);//sysj\controller.sysj line: 262, column: 4
                  S110965=1;
                  if(capLoaderReq_in.isREQ()){//sysj\controller.sysj line: 262, column: 4
                    capLoaderReq_in.setACK(false);//sysj\controller.sysj line: 262, column: 4
                    ends[20]=2;
                    ;//sysj\controller.sysj line: 262, column: 4
                    request_thread_20 = (capLoaderReq_in.getVal() == null ? null : ((Boolean)capLoaderReq_in.getVal()));//sysj\controller.sysj line: 263, column: 4
                    S110986=1;
                    if(request_thread_20){//sysj\controller.sysj line: 264, column: 4
                      S111180=0;
                      S111157=0;
                      if(bottleAtPos3.getprestatus()){//sysj\controller.sysj line: 266, column: 14
                        System.out.println("cap loader - bottle is at pos 3");//sysj\controller.sysj line: 267, column: 6
                        S111031=0;
                        S110993=0;
                        if(!capLoaderStatus_o.isPartnerPresent() || capLoaderStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 269, column: 6
                          capLoaderStatus_o.setREQ(false);//sysj\controller.sysj line: 269, column: 6
                          S110993=1;
                          active[20]=1;
                          ends[20]=1;
                          break RUN;
                        }
                        else {
                          S110988=0;
                          if(capLoaderStatus_o.isACK()){//sysj\controller.sysj line: 269, column: 6
                            capLoaderStatus_o.setVal("busy");//sysj\controller.sysj line: 269, column: 6
                            S110988=1;
                            if(!capLoaderStatus_o.isACK()){//sysj\controller.sysj line: 269, column: 6
                              capLoaderStatus_o.setREQ(false);//sysj\controller.sysj line: 269, column: 6
                              ends[20]=2;
                              ;//sysj\controller.sysj line: 269, column: 6
                              S111031=1;
                              if(pusherRetracted.getprestatus()){//sysj\controller.sysj line: 271, column: 14
                                pusherExtend.setPresent();//sysj\controller.sysj line: 273, column: 8
                                currsigs.addElement(pusherExtend);
                                active[20]=1;
                                ends[20]=1;
                                break RUN;
                              }
                              else {
                                S111031=2;
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
                        S111157=1;
                        S111097=0;
                        if(!capLoaderStatus_o.isPartnerPresent() || capLoaderStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 297, column: 5
                          capLoaderStatus_o.setREQ(false);//sysj\controller.sysj line: 297, column: 5
                          S111097=1;
                          active[20]=1;
                          ends[20]=1;
                          break RUN;
                        }
                        else {
                          S111092=0;
                          if(capLoaderStatus_o.isACK()){//sysj\controller.sysj line: 297, column: 5
                            capLoaderStatus_o.setVal("done");//sysj\controller.sysj line: 297, column: 5
                            S111092=1;
                            if(!capLoaderStatus_o.isACK()){//sysj\controller.sysj line: 297, column: 5
                              capLoaderStatus_o.setREQ(false);//sysj\controller.sysj line: 297, column: 5
                              ends[20]=2;
                              ;//sysj\controller.sysj line: 297, column: 5
                              S110986=2;
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
                      S111180=1;
                      S111164=0;
                      if(!capLoaderStatus_o.isPartnerPresent() || capLoaderStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 299, column: 5
                        capLoaderStatus_o.setREQ(false);//sysj\controller.sysj line: 299, column: 5
                        S111164=1;
                        active[20]=1;
                        ends[20]=1;
                        break RUN;
                      }
                      else {
                        S111159=0;
                        if(capLoaderStatus_o.isACK()){//sysj\controller.sysj line: 299, column: 5
                          capLoaderStatus_o.setVal("idle");//sysj\controller.sysj line: 299, column: 5
                          S111159=1;
                          if(!capLoaderStatus_o.isACK()){//sysj\controller.sysj line: 299, column: 5
                            capLoaderStatus_o.setREQ(false);//sysj\controller.sysj line: 299, column: 5
                            ends[20]=2;
                            ;//sysj\controller.sysj line: 299, column: 5
                            S110986=2;
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
