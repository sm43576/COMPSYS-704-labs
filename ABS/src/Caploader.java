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
  private Boolean request_thread_19;//sysj\controller.sysj line: 230, column: 4
  private int S36790 = 1;
  private int S30802 = 1;
  private int S30786 = 1;
  private int S30781 = 1;
  private int S31296 = 1;
  private int S30809 = 1;
  private int S30804 = 1;
  private int S30836 = 1;
  private int S30857 = 1;
  private int S30862 = 1;
  private int S30881 = 1;
  private int S30876 = 1;
  
  private int[] ends = new int[22];
  private int[] tdone = new int[22];
  
  public void thread36965(int [] tdone, int [] ends){
        switch(S30862){
      case 0 : 
        active[21]=0;
        ends[21]=0;
        tdone[21]=1;
        break;
      
      case 1 : 
        vacOn.setPresent();//sysj\controller.sysj line: 263, column: 30
        currsigs.addElement(vacOn);
        active[21]=1;
        ends[21]=1;
        tdone[21]=1;
        break;
      
    }
  }

  public void thread36964(int [] tdone, int [] ends){
        switch(S30857){
      case 0 : 
        active[20]=0;
        ends[20]=0;
        tdone[20]=1;
        break;
      
      case 1 : 
        armDest.setPresent();//sysj\controller.sysj line: 263, column: 8
        currsigs.addElement(armDest);
        active[20]=1;
        ends[20]=1;
        tdone[20]=1;
        break;
      
    }
  }

  public void thread36962(int [] tdone, int [] ends){
        S30862=1;
    vacOn.setPresent();//sysj\controller.sysj line: 263, column: 30
    currsigs.addElement(vacOn);
    active[21]=1;
    ends[21]=1;
    tdone[21]=1;
  }

  public void thread36961(int [] tdone, int [] ends){
        S30857=1;
    armDest.setPresent();//sysj\controller.sysj line: 263, column: 8
    currsigs.addElement(armDest);
    active[20]=1;
    ends[20]=1;
    tdone[20]=1;
  }

  public void runClockDomain(){
    for(int i=0;i<ends.length;i++){
      ends[i] = 0;
      tdone[i] = 0;
    }
    
    RUN: while(true){
      switch(S36790){
        case 0 : 
          S36790=0;
          break RUN;
        
        case 1 : 
          S36790=2;
          S36790=2;
          S30802=0;
          S30786=0;
          if(!capLoaderReq_in.isPartnerPresent() || capLoaderReq_in.isPartnerPreempted()){//sysj\controller.sysj line: 229, column: 4
            capLoaderReq_in.setACK(false);//sysj\controller.sysj line: 229, column: 4
            S30786=1;
            active[19]=1;
            ends[19]=1;
            break RUN;
          }
          else {
            S30781=0;
            if(!capLoaderReq_in.isREQ()){//sysj\controller.sysj line: 229, column: 4
              capLoaderReq_in.setACK(true);//sysj\controller.sysj line: 229, column: 4
              S30781=1;
              if(capLoaderReq_in.isREQ()){//sysj\controller.sysj line: 229, column: 4
                capLoaderReq_in.setACK(false);//sysj\controller.sysj line: 229, column: 4
                ends[19]=2;
                ;//sysj\controller.sysj line: 229, column: 4
                request_thread_19 = (capLoaderReq_in.getVal() == null ? null : ((Boolean)capLoaderReq_in.getVal()));//sysj\controller.sysj line: 230, column: 4
                S30802=1;
                if(request_thread_19){//sysj\controller.sysj line: 231, column: 4
                  S31296=0;
                  if(!bottleAtPos3.getprestatus()){//sysj\controller.sysj line: 233, column: 14
                    S30809=0;
                    if(!capLoaderStatus_o.isPartnerPresent() || capLoaderStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 234, column: 6
                      capLoaderStatus_o.setREQ(false);//sysj\controller.sysj line: 234, column: 6
                      S30809=1;
                      active[19]=1;
                      ends[19]=1;
                      break RUN;
                    }
                    else {
                      S30804=0;
                      if(capLoaderStatus_o.isACK()){//sysj\controller.sysj line: 234, column: 6
                        capLoaderStatus_o.setVal("idle");//sysj\controller.sysj line: 234, column: 6
                        S30804=1;
                        if(!capLoaderStatus_o.isACK()){//sysj\controller.sysj line: 234, column: 6
                          capLoaderStatus_o.setREQ(false);//sysj\controller.sysj line: 234, column: 6
                          ends[19]=2;
                          ;//sysj\controller.sysj line: 234, column: 6
                          S31296=1;
                          if(bottleAtPos3.getprestatus()){//sysj\controller.sysj line: 238, column: 14
                            System.out.println("Caploader Controller - bottle is at pos 3");//sysj\controller.sysj line: 239, column: 6
                            S30836=0;
                            if(pusherRetracted.getprestatus()){//sysj\controller.sysj line: 242, column: 14
                              pusherExtend.setPresent();//sysj\controller.sysj line: 244, column: 8
                              currsigs.addElement(pusherExtend);
                              active[19]=1;
                              ends[19]=1;
                              break RUN;
                            }
                            else {
                              S30836=1;
                              active[19]=1;
                              ends[19]=1;
                              break RUN;
                            }
                          }
                          else {
                            S30802=2;
                            active[19]=1;
                            ends[19]=1;
                            break RUN;
                          }
                        }
                        else {
                          active[19]=1;
                          ends[19]=1;
                          break RUN;
                        }
                      }
                      else {
                        active[19]=1;
                        ends[19]=1;
                        break RUN;
                      }
                    }
                  }
                  else {
                    S31296=1;
                    if(bottleAtPos3.getprestatus()){//sysj\controller.sysj line: 238, column: 14
                      System.out.println("Caploader Controller - bottle is at pos 3");//sysj\controller.sysj line: 239, column: 6
                      S30836=0;
                      if(pusherRetracted.getprestatus()){//sysj\controller.sysj line: 242, column: 14
                        pusherExtend.setPresent();//sysj\controller.sysj line: 244, column: 8
                        currsigs.addElement(pusherExtend);
                        active[19]=1;
                        ends[19]=1;
                        break RUN;
                      }
                      else {
                        S30836=1;
                        active[19]=1;
                        ends[19]=1;
                        break RUN;
                      }
                    }
                    else {
                      S30802=2;
                      active[19]=1;
                      ends[19]=1;
                      break RUN;
                    }
                  }
                }
                else {
                  S30802=2;
                  active[19]=1;
                  ends[19]=1;
                  break RUN;
                }
              }
              else {
                active[19]=1;
                ends[19]=1;
                break RUN;
              }
            }
            else {
              active[19]=1;
              ends[19]=1;
              break RUN;
            }
          }
        
        case 2 : 
          switch(S30802){
            case 0 : 
              switch(S30786){
                case 0 : 
                  if(!capLoaderReq_in.isPartnerPresent() || capLoaderReq_in.isPartnerPreempted()){//sysj\controller.sysj line: 229, column: 4
                    capLoaderReq_in.setACK(false);//sysj\controller.sysj line: 229, column: 4
                    S30786=1;
                    active[19]=1;
                    ends[19]=1;
                    break RUN;
                  }
                  else {
                    switch(S30781){
                      case 0 : 
                        if(!capLoaderReq_in.isREQ()){//sysj\controller.sysj line: 229, column: 4
                          capLoaderReq_in.setACK(true);//sysj\controller.sysj line: 229, column: 4
                          S30781=1;
                          if(capLoaderReq_in.isREQ()){//sysj\controller.sysj line: 229, column: 4
                            capLoaderReq_in.setACK(false);//sysj\controller.sysj line: 229, column: 4
                            ends[19]=2;
                            ;//sysj\controller.sysj line: 229, column: 4
                            request_thread_19 = (capLoaderReq_in.getVal() == null ? null : ((Boolean)capLoaderReq_in.getVal()));//sysj\controller.sysj line: 230, column: 4
                            S30802=1;
                            if(request_thread_19){//sysj\controller.sysj line: 231, column: 4
                              S31296=0;
                              if(!bottleAtPos3.getprestatus()){//sysj\controller.sysj line: 233, column: 14
                                S30809=0;
                                if(!capLoaderStatus_o.isPartnerPresent() || capLoaderStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 234, column: 6
                                  capLoaderStatus_o.setREQ(false);//sysj\controller.sysj line: 234, column: 6
                                  S30809=1;
                                  active[19]=1;
                                  ends[19]=1;
                                  break RUN;
                                }
                                else {
                                  S30804=0;
                                  if(capLoaderStatus_o.isACK()){//sysj\controller.sysj line: 234, column: 6
                                    capLoaderStatus_o.setVal("idle");//sysj\controller.sysj line: 234, column: 6
                                    S30804=1;
                                    if(!capLoaderStatus_o.isACK()){//sysj\controller.sysj line: 234, column: 6
                                      capLoaderStatus_o.setREQ(false);//sysj\controller.sysj line: 234, column: 6
                                      ends[19]=2;
                                      ;//sysj\controller.sysj line: 234, column: 6
                                      S31296=1;
                                      if(bottleAtPos3.getprestatus()){//sysj\controller.sysj line: 238, column: 14
                                        System.out.println("Caploader Controller - bottle is at pos 3");//sysj\controller.sysj line: 239, column: 6
                                        S30836=0;
                                        if(pusherRetracted.getprestatus()){//sysj\controller.sysj line: 242, column: 14
                                          pusherExtend.setPresent();//sysj\controller.sysj line: 244, column: 8
                                          currsigs.addElement(pusherExtend);
                                          active[19]=1;
                                          ends[19]=1;
                                          break RUN;
                                        }
                                        else {
                                          S30836=1;
                                          active[19]=1;
                                          ends[19]=1;
                                          break RUN;
                                        }
                                      }
                                      else {
                                        S30802=2;
                                        active[19]=1;
                                        ends[19]=1;
                                        break RUN;
                                      }
                                    }
                                    else {
                                      active[19]=1;
                                      ends[19]=1;
                                      break RUN;
                                    }
                                  }
                                  else {
                                    active[19]=1;
                                    ends[19]=1;
                                    break RUN;
                                  }
                                }
                              }
                              else {
                                S31296=1;
                                if(bottleAtPos3.getprestatus()){//sysj\controller.sysj line: 238, column: 14
                                  System.out.println("Caploader Controller - bottle is at pos 3");//sysj\controller.sysj line: 239, column: 6
                                  S30836=0;
                                  if(pusherRetracted.getprestatus()){//sysj\controller.sysj line: 242, column: 14
                                    pusherExtend.setPresent();//sysj\controller.sysj line: 244, column: 8
                                    currsigs.addElement(pusherExtend);
                                    active[19]=1;
                                    ends[19]=1;
                                    break RUN;
                                  }
                                  else {
                                    S30836=1;
                                    active[19]=1;
                                    ends[19]=1;
                                    break RUN;
                                  }
                                }
                                else {
                                  S30802=2;
                                  active[19]=1;
                                  ends[19]=1;
                                  break RUN;
                                }
                              }
                            }
                            else {
                              S30802=2;
                              active[19]=1;
                              ends[19]=1;
                              break RUN;
                            }
                          }
                          else {
                            active[19]=1;
                            ends[19]=1;
                            break RUN;
                          }
                        }
                        else {
                          active[19]=1;
                          ends[19]=1;
                          break RUN;
                        }
                      
                      case 1 : 
                        if(capLoaderReq_in.isREQ()){//sysj\controller.sysj line: 229, column: 4
                          capLoaderReq_in.setACK(false);//sysj\controller.sysj line: 229, column: 4
                          ends[19]=2;
                          ;//sysj\controller.sysj line: 229, column: 4
                          request_thread_19 = (capLoaderReq_in.getVal() == null ? null : ((Boolean)capLoaderReq_in.getVal()));//sysj\controller.sysj line: 230, column: 4
                          S30802=1;
                          if(request_thread_19){//sysj\controller.sysj line: 231, column: 4
                            S31296=0;
                            if(!bottleAtPos3.getprestatus()){//sysj\controller.sysj line: 233, column: 14
                              S30809=0;
                              if(!capLoaderStatus_o.isPartnerPresent() || capLoaderStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 234, column: 6
                                capLoaderStatus_o.setREQ(false);//sysj\controller.sysj line: 234, column: 6
                                S30809=1;
                                active[19]=1;
                                ends[19]=1;
                                break RUN;
                              }
                              else {
                                S30804=0;
                                if(capLoaderStatus_o.isACK()){//sysj\controller.sysj line: 234, column: 6
                                  capLoaderStatus_o.setVal("idle");//sysj\controller.sysj line: 234, column: 6
                                  S30804=1;
                                  if(!capLoaderStatus_o.isACK()){//sysj\controller.sysj line: 234, column: 6
                                    capLoaderStatus_o.setREQ(false);//sysj\controller.sysj line: 234, column: 6
                                    ends[19]=2;
                                    ;//sysj\controller.sysj line: 234, column: 6
                                    S31296=1;
                                    if(bottleAtPos3.getprestatus()){//sysj\controller.sysj line: 238, column: 14
                                      System.out.println("Caploader Controller - bottle is at pos 3");//sysj\controller.sysj line: 239, column: 6
                                      S30836=0;
                                      if(pusherRetracted.getprestatus()){//sysj\controller.sysj line: 242, column: 14
                                        pusherExtend.setPresent();//sysj\controller.sysj line: 244, column: 8
                                        currsigs.addElement(pusherExtend);
                                        active[19]=1;
                                        ends[19]=1;
                                        break RUN;
                                      }
                                      else {
                                        S30836=1;
                                        active[19]=1;
                                        ends[19]=1;
                                        break RUN;
                                      }
                                    }
                                    else {
                                      S30802=2;
                                      active[19]=1;
                                      ends[19]=1;
                                      break RUN;
                                    }
                                  }
                                  else {
                                    active[19]=1;
                                    ends[19]=1;
                                    break RUN;
                                  }
                                }
                                else {
                                  active[19]=1;
                                  ends[19]=1;
                                  break RUN;
                                }
                              }
                            }
                            else {
                              S31296=1;
                              if(bottleAtPos3.getprestatus()){//sysj\controller.sysj line: 238, column: 14
                                System.out.println("Caploader Controller - bottle is at pos 3");//sysj\controller.sysj line: 239, column: 6
                                S30836=0;
                                if(pusherRetracted.getprestatus()){//sysj\controller.sysj line: 242, column: 14
                                  pusherExtend.setPresent();//sysj\controller.sysj line: 244, column: 8
                                  currsigs.addElement(pusherExtend);
                                  active[19]=1;
                                  ends[19]=1;
                                  break RUN;
                                }
                                else {
                                  S30836=1;
                                  active[19]=1;
                                  ends[19]=1;
                                  break RUN;
                                }
                              }
                              else {
                                S30802=2;
                                active[19]=1;
                                ends[19]=1;
                                break RUN;
                              }
                            }
                          }
                          else {
                            S30802=2;
                            active[19]=1;
                            ends[19]=1;
                            break RUN;
                          }
                        }
                        else {
                          active[19]=1;
                          ends[19]=1;
                          break RUN;
                        }
                      
                    }
                  }
                  break;
                
                case 1 : 
                  S30786=1;
                  S30786=0;
                  if(!capLoaderReq_in.isPartnerPresent() || capLoaderReq_in.isPartnerPreempted()){//sysj\controller.sysj line: 229, column: 4
                    capLoaderReq_in.setACK(false);//sysj\controller.sysj line: 229, column: 4
                    S30786=1;
                    active[19]=1;
                    ends[19]=1;
                    break RUN;
                  }
                  else {
                    S30781=0;
                    if(!capLoaderReq_in.isREQ()){//sysj\controller.sysj line: 229, column: 4
                      capLoaderReq_in.setACK(true);//sysj\controller.sysj line: 229, column: 4
                      S30781=1;
                      if(capLoaderReq_in.isREQ()){//sysj\controller.sysj line: 229, column: 4
                        capLoaderReq_in.setACK(false);//sysj\controller.sysj line: 229, column: 4
                        ends[19]=2;
                        ;//sysj\controller.sysj line: 229, column: 4
                        request_thread_19 = (capLoaderReq_in.getVal() == null ? null : ((Boolean)capLoaderReq_in.getVal()));//sysj\controller.sysj line: 230, column: 4
                        S30802=1;
                        if(request_thread_19){//sysj\controller.sysj line: 231, column: 4
                          S31296=0;
                          if(!bottleAtPos3.getprestatus()){//sysj\controller.sysj line: 233, column: 14
                            S30809=0;
                            if(!capLoaderStatus_o.isPartnerPresent() || capLoaderStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 234, column: 6
                              capLoaderStatus_o.setREQ(false);//sysj\controller.sysj line: 234, column: 6
                              S30809=1;
                              active[19]=1;
                              ends[19]=1;
                              break RUN;
                            }
                            else {
                              S30804=0;
                              if(capLoaderStatus_o.isACK()){//sysj\controller.sysj line: 234, column: 6
                                capLoaderStatus_o.setVal("idle");//sysj\controller.sysj line: 234, column: 6
                                S30804=1;
                                if(!capLoaderStatus_o.isACK()){//sysj\controller.sysj line: 234, column: 6
                                  capLoaderStatus_o.setREQ(false);//sysj\controller.sysj line: 234, column: 6
                                  ends[19]=2;
                                  ;//sysj\controller.sysj line: 234, column: 6
                                  S31296=1;
                                  if(bottleAtPos3.getprestatus()){//sysj\controller.sysj line: 238, column: 14
                                    System.out.println("Caploader Controller - bottle is at pos 3");//sysj\controller.sysj line: 239, column: 6
                                    S30836=0;
                                    if(pusherRetracted.getprestatus()){//sysj\controller.sysj line: 242, column: 14
                                      pusherExtend.setPresent();//sysj\controller.sysj line: 244, column: 8
                                      currsigs.addElement(pusherExtend);
                                      active[19]=1;
                                      ends[19]=1;
                                      break RUN;
                                    }
                                    else {
                                      S30836=1;
                                      active[19]=1;
                                      ends[19]=1;
                                      break RUN;
                                    }
                                  }
                                  else {
                                    S30802=2;
                                    active[19]=1;
                                    ends[19]=1;
                                    break RUN;
                                  }
                                }
                                else {
                                  active[19]=1;
                                  ends[19]=1;
                                  break RUN;
                                }
                              }
                              else {
                                active[19]=1;
                                ends[19]=1;
                                break RUN;
                              }
                            }
                          }
                          else {
                            S31296=1;
                            if(bottleAtPos3.getprestatus()){//sysj\controller.sysj line: 238, column: 14
                              System.out.println("Caploader Controller - bottle is at pos 3");//sysj\controller.sysj line: 239, column: 6
                              S30836=0;
                              if(pusherRetracted.getprestatus()){//sysj\controller.sysj line: 242, column: 14
                                pusherExtend.setPresent();//sysj\controller.sysj line: 244, column: 8
                                currsigs.addElement(pusherExtend);
                                active[19]=1;
                                ends[19]=1;
                                break RUN;
                              }
                              else {
                                S30836=1;
                                active[19]=1;
                                ends[19]=1;
                                break RUN;
                              }
                            }
                            else {
                              S30802=2;
                              active[19]=1;
                              ends[19]=1;
                              break RUN;
                            }
                          }
                        }
                        else {
                          S30802=2;
                          active[19]=1;
                          ends[19]=1;
                          break RUN;
                        }
                      }
                      else {
                        active[19]=1;
                        ends[19]=1;
                        break RUN;
                      }
                    }
                    else {
                      active[19]=1;
                      ends[19]=1;
                      break RUN;
                    }
                  }
                
              }
              break;
            
            case 1 : 
              switch(S31296){
                case 0 : 
                  switch(S30809){
                    case 0 : 
                      if(!capLoaderStatus_o.isPartnerPresent() || capLoaderStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 234, column: 6
                        capLoaderStatus_o.setREQ(false);//sysj\controller.sysj line: 234, column: 6
                        S30809=1;
                        active[19]=1;
                        ends[19]=1;
                        break RUN;
                      }
                      else {
                        switch(S30804){
                          case 0 : 
                            if(capLoaderStatus_o.isACK()){//sysj\controller.sysj line: 234, column: 6
                              capLoaderStatus_o.setVal("idle");//sysj\controller.sysj line: 234, column: 6
                              S30804=1;
                              if(!capLoaderStatus_o.isACK()){//sysj\controller.sysj line: 234, column: 6
                                capLoaderStatus_o.setREQ(false);//sysj\controller.sysj line: 234, column: 6
                                ends[19]=2;
                                ;//sysj\controller.sysj line: 234, column: 6
                                S31296=1;
                                if(bottleAtPos3.getprestatus()){//sysj\controller.sysj line: 238, column: 14
                                  System.out.println("Caploader Controller - bottle is at pos 3");//sysj\controller.sysj line: 239, column: 6
                                  S30836=0;
                                  if(pusherRetracted.getprestatus()){//sysj\controller.sysj line: 242, column: 14
                                    pusherExtend.setPresent();//sysj\controller.sysj line: 244, column: 8
                                    currsigs.addElement(pusherExtend);
                                    active[19]=1;
                                    ends[19]=1;
                                    break RUN;
                                  }
                                  else {
                                    S30836=1;
                                    active[19]=1;
                                    ends[19]=1;
                                    break RUN;
                                  }
                                }
                                else {
                                  S30802=2;
                                  active[19]=1;
                                  ends[19]=1;
                                  break RUN;
                                }
                              }
                              else {
                                active[19]=1;
                                ends[19]=1;
                                break RUN;
                              }
                            }
                            else {
                              active[19]=1;
                              ends[19]=1;
                              break RUN;
                            }
                          
                          case 1 : 
                            if(!capLoaderStatus_o.isACK()){//sysj\controller.sysj line: 234, column: 6
                              capLoaderStatus_o.setREQ(false);//sysj\controller.sysj line: 234, column: 6
                              ends[19]=2;
                              ;//sysj\controller.sysj line: 234, column: 6
                              S31296=1;
                              if(bottleAtPos3.getprestatus()){//sysj\controller.sysj line: 238, column: 14
                                System.out.println("Caploader Controller - bottle is at pos 3");//sysj\controller.sysj line: 239, column: 6
                                S30836=0;
                                if(pusherRetracted.getprestatus()){//sysj\controller.sysj line: 242, column: 14
                                  pusherExtend.setPresent();//sysj\controller.sysj line: 244, column: 8
                                  currsigs.addElement(pusherExtend);
                                  active[19]=1;
                                  ends[19]=1;
                                  break RUN;
                                }
                                else {
                                  S30836=1;
                                  active[19]=1;
                                  ends[19]=1;
                                  break RUN;
                                }
                              }
                              else {
                                S30802=2;
                                active[19]=1;
                                ends[19]=1;
                                break RUN;
                              }
                            }
                            else {
                              active[19]=1;
                              ends[19]=1;
                              break RUN;
                            }
                          
                        }
                      }
                      break;
                    
                    case 1 : 
                      S30809=1;
                      S30809=0;
                      if(!capLoaderStatus_o.isPartnerPresent() || capLoaderStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 234, column: 6
                        capLoaderStatus_o.setREQ(false);//sysj\controller.sysj line: 234, column: 6
                        S30809=1;
                        active[19]=1;
                        ends[19]=1;
                        break RUN;
                      }
                      else {
                        S30804=0;
                        if(capLoaderStatus_o.isACK()){//sysj\controller.sysj line: 234, column: 6
                          capLoaderStatus_o.setVal("idle");//sysj\controller.sysj line: 234, column: 6
                          S30804=1;
                          if(!capLoaderStatus_o.isACK()){//sysj\controller.sysj line: 234, column: 6
                            capLoaderStatus_o.setREQ(false);//sysj\controller.sysj line: 234, column: 6
                            ends[19]=2;
                            ;//sysj\controller.sysj line: 234, column: 6
                            S31296=1;
                            if(bottleAtPos3.getprestatus()){//sysj\controller.sysj line: 238, column: 14
                              System.out.println("Caploader Controller - bottle is at pos 3");//sysj\controller.sysj line: 239, column: 6
                              S30836=0;
                              if(pusherRetracted.getprestatus()){//sysj\controller.sysj line: 242, column: 14
                                pusherExtend.setPresent();//sysj\controller.sysj line: 244, column: 8
                                currsigs.addElement(pusherExtend);
                                active[19]=1;
                                ends[19]=1;
                                break RUN;
                              }
                              else {
                                S30836=1;
                                active[19]=1;
                                ends[19]=1;
                                break RUN;
                              }
                            }
                            else {
                              S30802=2;
                              active[19]=1;
                              ends[19]=1;
                              break RUN;
                            }
                          }
                          else {
                            active[19]=1;
                            ends[19]=1;
                            break RUN;
                          }
                        }
                        else {
                          active[19]=1;
                          ends[19]=1;
                          break RUN;
                        }
                      }
                    
                  }
                  break;
                
                case 1 : 
                  switch(S30836){
                    case 0 : 
                      if(pusherExtended.getprestatus()){//sysj\controller.sysj line: 243, column: 13
                        S30836=1;
                        active[19]=1;
                        ends[19]=1;
                        break RUN;
                      }
                      else {
                        pusherExtend.setPresent();//sysj\controller.sysj line: 244, column: 8
                        currsigs.addElement(pusherExtend);
                        active[19]=1;
                        ends[19]=1;
                        break RUN;
                      }
                    
                    case 1 : 
                      S30836=1;
                      S30836=2;
                      armSource.setPresent();//sysj\controller.sysj line: 251, column: 7
                      currsigs.addElement(armSource);
                      active[19]=1;
                      ends[19]=1;
                      break RUN;
                    
                    case 2 : 
                      if(armAtSource.getprestatus()){//sysj\controller.sysj line: 250, column: 12
                        S30836=3;
                        active[19]=1;
                        ends[19]=1;
                        break RUN;
                      }
                      else {
                        armSource.setPresent();//sysj\controller.sysj line: 251, column: 7
                        currsigs.addElement(armSource);
                        active[19]=1;
                        ends[19]=1;
                        break RUN;
                      }
                    
                    case 3 : 
                      S30836=3;
                      S30836=4;
                      vacOn.setPresent();//sysj\controller.sysj line: 257, column: 7
                      currsigs.addElement(vacOn);
                      active[19]=1;
                      ends[19]=1;
                      break RUN;
                    
                    case 4 : 
                      if(WPgripped.getprestatus()){//sysj\controller.sysj line: 256, column: 12
                        S30836=5;
                        active[19]=1;
                        ends[19]=1;
                        break RUN;
                      }
                      else {
                        vacOn.setPresent();//sysj\controller.sysj line: 257, column: 7
                        currsigs.addElement(vacOn);
                        active[19]=1;
                        ends[19]=1;
                        break RUN;
                      }
                    
                    case 5 : 
                      S30836=5;
                      S30836=6;
                      thread36961(tdone,ends);
                      thread36962(tdone,ends);
                      int biggest36963 = 0;
                      if(ends[20]>=biggest36963){
                        biggest36963=ends[20];
                      }
                      if(ends[21]>=biggest36963){
                        biggest36963=ends[21];
                      }
                      if(biggest36963 == 1){
                        active[19]=1;
                        ends[19]=1;
                        break RUN;
                      }
                    
                    case 6 : 
                      if(armAtDest.getprestatus()){//sysj\controller.sysj line: 262, column: 13
                        S30836=7;
                        active[19]=1;
                        ends[19]=1;
                        break RUN;
                      }
                      else {
                        thread36964(tdone,ends);
                        thread36965(tdone,ends);
                        int biggest36966 = 0;
                        if(ends[20]>=biggest36966){
                          biggest36966=ends[20];
                        }
                        if(ends[21]>=biggest36966){
                          biggest36966=ends[21];
                        }
                        if(biggest36966 == 1){
                          active[19]=1;
                          ends[19]=1;
                          break RUN;
                        }
                        //FINXME code
                        if(biggest36966 == 0){
                          S30836=7;
                          active[19]=1;
                          ends[19]=1;
                          break RUN;
                        }
                      }
                    
                    case 7 : 
                      S30836=7;
                      S30836=8;
                      S30881=0;
                      if(!capLoaderStatus_o.isPartnerPresent() || capLoaderStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 266, column: 6
                        capLoaderStatus_o.setREQ(false);//sysj\controller.sysj line: 266, column: 6
                        S30881=1;
                        active[19]=1;
                        ends[19]=1;
                        break RUN;
                      }
                      else {
                        S30876=0;
                        if(capLoaderStatus_o.isACK()){//sysj\controller.sysj line: 266, column: 6
                          capLoaderStatus_o.setVal("done");//sysj\controller.sysj line: 266, column: 6
                          S30876=1;
                          if(!capLoaderStatus_o.isACK()){//sysj\controller.sysj line: 266, column: 6
                            capLoaderStatus_o.setREQ(false);//sysj\controller.sysj line: 266, column: 6
                            ends[19]=2;
                            ;//sysj\controller.sysj line: 266, column: 6
                            S30802=2;
                            active[19]=1;
                            ends[19]=1;
                            break RUN;
                          }
                          else {
                            active[19]=1;
                            ends[19]=1;
                            break RUN;
                          }
                        }
                        else {
                          active[19]=1;
                          ends[19]=1;
                          break RUN;
                        }
                      }
                    
                    case 8 : 
                      switch(S30881){
                        case 0 : 
                          if(!capLoaderStatus_o.isPartnerPresent() || capLoaderStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 266, column: 6
                            capLoaderStatus_o.setREQ(false);//sysj\controller.sysj line: 266, column: 6
                            S30881=1;
                            active[19]=1;
                            ends[19]=1;
                            break RUN;
                          }
                          else {
                            switch(S30876){
                              case 0 : 
                                if(capLoaderStatus_o.isACK()){//sysj\controller.sysj line: 266, column: 6
                                  capLoaderStatus_o.setVal("done");//sysj\controller.sysj line: 266, column: 6
                                  S30876=1;
                                  if(!capLoaderStatus_o.isACK()){//sysj\controller.sysj line: 266, column: 6
                                    capLoaderStatus_o.setREQ(false);//sysj\controller.sysj line: 266, column: 6
                                    ends[19]=2;
                                    ;//sysj\controller.sysj line: 266, column: 6
                                    S30802=2;
                                    active[19]=1;
                                    ends[19]=1;
                                    break RUN;
                                  }
                                  else {
                                    active[19]=1;
                                    ends[19]=1;
                                    break RUN;
                                  }
                                }
                                else {
                                  active[19]=1;
                                  ends[19]=1;
                                  break RUN;
                                }
                              
                              case 1 : 
                                if(!capLoaderStatus_o.isACK()){//sysj\controller.sysj line: 266, column: 6
                                  capLoaderStatus_o.setREQ(false);//sysj\controller.sysj line: 266, column: 6
                                  ends[19]=2;
                                  ;//sysj\controller.sysj line: 266, column: 6
                                  S30802=2;
                                  active[19]=1;
                                  ends[19]=1;
                                  break RUN;
                                }
                                else {
                                  active[19]=1;
                                  ends[19]=1;
                                  break RUN;
                                }
                              
                            }
                          }
                          break;
                        
                        case 1 : 
                          S30881=1;
                          S30881=0;
                          if(!capLoaderStatus_o.isPartnerPresent() || capLoaderStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 266, column: 6
                            capLoaderStatus_o.setREQ(false);//sysj\controller.sysj line: 266, column: 6
                            S30881=1;
                            active[19]=1;
                            ends[19]=1;
                            break RUN;
                          }
                          else {
                            S30876=0;
                            if(capLoaderStatus_o.isACK()){//sysj\controller.sysj line: 266, column: 6
                              capLoaderStatus_o.setVal("done");//sysj\controller.sysj line: 266, column: 6
                              S30876=1;
                              if(!capLoaderStatus_o.isACK()){//sysj\controller.sysj line: 266, column: 6
                                capLoaderStatus_o.setREQ(false);//sysj\controller.sysj line: 266, column: 6
                                ends[19]=2;
                                ;//sysj\controller.sysj line: 266, column: 6
                                S30802=2;
                                active[19]=1;
                                ends[19]=1;
                                break RUN;
                              }
                              else {
                                active[19]=1;
                                ends[19]=1;
                                break RUN;
                              }
                            }
                            else {
                              active[19]=1;
                              ends[19]=1;
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
              S30802=2;
              S30802=0;
              S30786=0;
              if(!capLoaderReq_in.isPartnerPresent() || capLoaderReq_in.isPartnerPreempted()){//sysj\controller.sysj line: 229, column: 4
                capLoaderReq_in.setACK(false);//sysj\controller.sysj line: 229, column: 4
                S30786=1;
                active[19]=1;
                ends[19]=1;
                break RUN;
              }
              else {
                S30781=0;
                if(!capLoaderReq_in.isREQ()){//sysj\controller.sysj line: 229, column: 4
                  capLoaderReq_in.setACK(true);//sysj\controller.sysj line: 229, column: 4
                  S30781=1;
                  if(capLoaderReq_in.isREQ()){//sysj\controller.sysj line: 229, column: 4
                    capLoaderReq_in.setACK(false);//sysj\controller.sysj line: 229, column: 4
                    ends[19]=2;
                    ;//sysj\controller.sysj line: 229, column: 4
                    request_thread_19 = (capLoaderReq_in.getVal() == null ? null : ((Boolean)capLoaderReq_in.getVal()));//sysj\controller.sysj line: 230, column: 4
                    S30802=1;
                    if(request_thread_19){//sysj\controller.sysj line: 231, column: 4
                      S31296=0;
                      if(!bottleAtPos3.getprestatus()){//sysj\controller.sysj line: 233, column: 14
                        S30809=0;
                        if(!capLoaderStatus_o.isPartnerPresent() || capLoaderStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 234, column: 6
                          capLoaderStatus_o.setREQ(false);//sysj\controller.sysj line: 234, column: 6
                          S30809=1;
                          active[19]=1;
                          ends[19]=1;
                          break RUN;
                        }
                        else {
                          S30804=0;
                          if(capLoaderStatus_o.isACK()){//sysj\controller.sysj line: 234, column: 6
                            capLoaderStatus_o.setVal("idle");//sysj\controller.sysj line: 234, column: 6
                            S30804=1;
                            if(!capLoaderStatus_o.isACK()){//sysj\controller.sysj line: 234, column: 6
                              capLoaderStatus_o.setREQ(false);//sysj\controller.sysj line: 234, column: 6
                              ends[19]=2;
                              ;//sysj\controller.sysj line: 234, column: 6
                              S31296=1;
                              if(bottleAtPos3.getprestatus()){//sysj\controller.sysj line: 238, column: 14
                                System.out.println("Caploader Controller - bottle is at pos 3");//sysj\controller.sysj line: 239, column: 6
                                S30836=0;
                                if(pusherRetracted.getprestatus()){//sysj\controller.sysj line: 242, column: 14
                                  pusherExtend.setPresent();//sysj\controller.sysj line: 244, column: 8
                                  currsigs.addElement(pusherExtend);
                                  active[19]=1;
                                  ends[19]=1;
                                  break RUN;
                                }
                                else {
                                  S30836=1;
                                  active[19]=1;
                                  ends[19]=1;
                                  break RUN;
                                }
                              }
                              else {
                                S30802=2;
                                active[19]=1;
                                ends[19]=1;
                                break RUN;
                              }
                            }
                            else {
                              active[19]=1;
                              ends[19]=1;
                              break RUN;
                            }
                          }
                          else {
                            active[19]=1;
                            ends[19]=1;
                            break RUN;
                          }
                        }
                      }
                      else {
                        S31296=1;
                        if(bottleAtPos3.getprestatus()){//sysj\controller.sysj line: 238, column: 14
                          System.out.println("Caploader Controller - bottle is at pos 3");//sysj\controller.sysj line: 239, column: 6
                          S30836=0;
                          if(pusherRetracted.getprestatus()){//sysj\controller.sysj line: 242, column: 14
                            pusherExtend.setPresent();//sysj\controller.sysj line: 244, column: 8
                            currsigs.addElement(pusherExtend);
                            active[19]=1;
                            ends[19]=1;
                            break RUN;
                          }
                          else {
                            S30836=1;
                            active[19]=1;
                            ends[19]=1;
                            break RUN;
                          }
                        }
                        else {
                          S30802=2;
                          active[19]=1;
                          ends[19]=1;
                          break RUN;
                        }
                      }
                    }
                    else {
                      S30802=2;
                      active[19]=1;
                      ends[19]=1;
                      break RUN;
                    }
                  }
                  else {
                    active[19]=1;
                    ends[19]=1;
                    break RUN;
                  }
                }
                else {
                  active[19]=1;
                  ends[19]=1;
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
    while(active[19] != 0){
      int index = 19;
      if(paused[index]==1 || suspended[index]==1 || active[index] == 0){
        for(int h=1;h<paused.length;++h){
          paused[h]=0;
        }
      }
      if(paused[19]!=0 || suspended[19]!=0 || active[19]!=1);
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
      if(paused[19]!=0 || suspended[19]!=0 || active[19]!=1);
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
      if(active[19] == 0){
      	this.terminated = true;
      }
      if(!threaded) break;
    }
  }
}
