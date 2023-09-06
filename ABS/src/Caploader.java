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
  public Signal empty = new Signal("empty", Signal.INPUT);
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
  private Boolean request_thread_20;//sysj\controller.sysj line: 264, column: 4
  private int S116500 = 1;
  private int S112156 = 1;
  private int S112140 = 1;
  private int S112135 = 1;
  private int S112514 = 1;
  private int S112201 = 1;
  private int S112163 = 1;
  private int S112158 = 1;
  private int S112207 = 1;
  private int S112228 = 1;
  private int S112233 = 1;
  private int S112388 = 1;
  private int S112383 = 1;
  private int S112498 = 1;
  private int S112493 = 1;
  
  private int[] ends = new int[23];
  private int[] tdone = new int[23];
  
  public void thread116729(int [] tdone, int [] ends){
        switch(S112233){
      case 0 : 
        active[22]=0;
        ends[22]=0;
        tdone[22]=1;
        break;
      
      case 1 : 
        vacOn.setPresent();//sysj\controller.sysj line: 294, column: 30
        currsigs.addElement(vacOn);
        active[22]=1;
        ends[22]=1;
        tdone[22]=1;
        break;
      
    }
  }

  public void thread116728(int [] tdone, int [] ends){
        switch(S112228){
      case 0 : 
        active[21]=0;
        ends[21]=0;
        tdone[21]=1;
        break;
      
      case 1 : 
        armDest.setPresent();//sysj\controller.sysj line: 294, column: 8
        currsigs.addElement(armDest);
        active[21]=1;
        ends[21]=1;
        tdone[21]=1;
        break;
      
    }
  }

  public void thread116726(int [] tdone, int [] ends){
        S112233=1;
    vacOn.setPresent();//sysj\controller.sysj line: 294, column: 30
    currsigs.addElement(vacOn);
    active[22]=1;
    ends[22]=1;
    tdone[22]=1;
  }

  public void thread116725(int [] tdone, int [] ends){
        S112228=1;
    armDest.setPresent();//sysj\controller.sysj line: 294, column: 8
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
      switch(S116500){
        case 0 : 
          S116500=0;
          break RUN;
        
        case 1 : 
          S116500=2;
          S116500=2;
          S112156=0;
          S112140=0;
          if(!capLoaderReq_in.isPartnerPresent() || capLoaderReq_in.isPartnerPreempted()){//sysj\controller.sysj line: 263, column: 4
            capLoaderReq_in.setACK(false);//sysj\controller.sysj line: 263, column: 4
            S112140=1;
            active[20]=1;
            ends[20]=1;
            break RUN;
          }
          else {
            S112135=0;
            if(!capLoaderReq_in.isREQ()){//sysj\controller.sysj line: 263, column: 4
              capLoaderReq_in.setACK(true);//sysj\controller.sysj line: 263, column: 4
              S112135=1;
              if(capLoaderReq_in.isREQ()){//sysj\controller.sysj line: 263, column: 4
                capLoaderReq_in.setACK(false);//sysj\controller.sysj line: 263, column: 4
                ends[20]=2;
                ;//sysj\controller.sysj line: 263, column: 4
                request_thread_20 = (capLoaderReq_in.getVal() == null ? null : ((Boolean)capLoaderReq_in.getVal()));//sysj\controller.sysj line: 264, column: 4
                S112156=1;
                if(request_thread_20){//sysj\controller.sysj line: 265, column: 4
                  S112514=0;
                  System.out.println("caploader doing work..");//sysj\controller.sysj line: 266, column: 5
                  S112201=0;
                  S112163=0;
                  if(!capLoaderStatus_o.isPartnerPresent() || capLoaderStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 267, column: 5
                    capLoaderStatus_o.setREQ(false);//sysj\controller.sysj line: 267, column: 5
                    S112163=1;
                    active[20]=1;
                    ends[20]=1;
                    break RUN;
                  }
                  else {
                    S112158=0;
                    if(capLoaderStatus_o.isACK()){//sysj\controller.sysj line: 267, column: 5
                      capLoaderStatus_o.setVal("busy");//sysj\controller.sysj line: 267, column: 5
                      S112158=1;
                      if(!capLoaderStatus_o.isACK()){//sysj\controller.sysj line: 267, column: 5
                        capLoaderStatus_o.setREQ(false);//sysj\controller.sysj line: 267, column: 5
                        ends[20]=2;
                        ;//sysj\controller.sysj line: 267, column: 5
                        System.out.println("Automatic state");//sysj\controller.sysj line: 269, column: 5
                        S112201=1;
                        if(!empty.getprestatus()){//sysj\controller.sysj line: 270, column: 14
                          S112207=0;
                          if(pusherRetracted.getprestatus()){//sysj\controller.sysj line: 273, column: 14
                            pusherExtend.setPresent();//sysj\controller.sysj line: 275, column: 8
                            currsigs.addElement(pusherExtend);
                            active[20]=1;
                            ends[20]=1;
                            break RUN;
                          }
                          else {
                            S112207=1;
                            active[20]=1;
                            ends[20]=1;
                            break RUN;
                          }
                        }
                        else {
                          S112201=2;
                          S112388=0;
                          if(!capLoaderStatus_o.isPartnerPresent() || capLoaderStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 299, column: 5
                            capLoaderStatus_o.setREQ(false);//sysj\controller.sysj line: 299, column: 5
                            S112388=1;
                            active[20]=1;
                            ends[20]=1;
                            break RUN;
                          }
                          else {
                            S112383=0;
                            if(capLoaderStatus_o.isACK()){//sysj\controller.sysj line: 299, column: 5
                              capLoaderStatus_o.setVal("done");//sysj\controller.sysj line: 299, column: 5
                              S112383=1;
                              if(!capLoaderStatus_o.isACK()){//sysj\controller.sysj line: 299, column: 5
                                capLoaderStatus_o.setREQ(false);//sysj\controller.sysj line: 299, column: 5
                                ends[20]=2;
                                ;//sysj\controller.sysj line: 299, column: 5
                                S112156=2;
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
                else {
                  S112514=1;
                  S112498=0;
                  if(!capLoaderStatus_o.isPartnerPresent() || capLoaderStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 301, column: 5
                    capLoaderStatus_o.setREQ(false);//sysj\controller.sysj line: 301, column: 5
                    S112498=1;
                    active[20]=1;
                    ends[20]=1;
                    break RUN;
                  }
                  else {
                    S112493=0;
                    if(capLoaderStatus_o.isACK()){//sysj\controller.sysj line: 301, column: 5
                      capLoaderStatus_o.setVal("idle");//sysj\controller.sysj line: 301, column: 5
                      S112493=1;
                      if(!capLoaderStatus_o.isACK()){//sysj\controller.sysj line: 301, column: 5
                        capLoaderStatus_o.setREQ(false);//sysj\controller.sysj line: 301, column: 5
                        ends[20]=2;
                        ;//sysj\controller.sysj line: 301, column: 5
                        S112156=2;
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
          switch(S112156){
            case 0 : 
              switch(S112140){
                case 0 : 
                  if(!capLoaderReq_in.isPartnerPresent() || capLoaderReq_in.isPartnerPreempted()){//sysj\controller.sysj line: 263, column: 4
                    capLoaderReq_in.setACK(false);//sysj\controller.sysj line: 263, column: 4
                    S112140=1;
                    active[20]=1;
                    ends[20]=1;
                    break RUN;
                  }
                  else {
                    switch(S112135){
                      case 0 : 
                        if(!capLoaderReq_in.isREQ()){//sysj\controller.sysj line: 263, column: 4
                          capLoaderReq_in.setACK(true);//sysj\controller.sysj line: 263, column: 4
                          S112135=1;
                          if(capLoaderReq_in.isREQ()){//sysj\controller.sysj line: 263, column: 4
                            capLoaderReq_in.setACK(false);//sysj\controller.sysj line: 263, column: 4
                            ends[20]=2;
                            ;//sysj\controller.sysj line: 263, column: 4
                            request_thread_20 = (capLoaderReq_in.getVal() == null ? null : ((Boolean)capLoaderReq_in.getVal()));//sysj\controller.sysj line: 264, column: 4
                            S112156=1;
                            if(request_thread_20){//sysj\controller.sysj line: 265, column: 4
                              S112514=0;
                              System.out.println("caploader doing work..");//sysj\controller.sysj line: 266, column: 5
                              S112201=0;
                              S112163=0;
                              if(!capLoaderStatus_o.isPartnerPresent() || capLoaderStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 267, column: 5
                                capLoaderStatus_o.setREQ(false);//sysj\controller.sysj line: 267, column: 5
                                S112163=1;
                                active[20]=1;
                                ends[20]=1;
                                break RUN;
                              }
                              else {
                                S112158=0;
                                if(capLoaderStatus_o.isACK()){//sysj\controller.sysj line: 267, column: 5
                                  capLoaderStatus_o.setVal("busy");//sysj\controller.sysj line: 267, column: 5
                                  S112158=1;
                                  if(!capLoaderStatus_o.isACK()){//sysj\controller.sysj line: 267, column: 5
                                    capLoaderStatus_o.setREQ(false);//sysj\controller.sysj line: 267, column: 5
                                    ends[20]=2;
                                    ;//sysj\controller.sysj line: 267, column: 5
                                    System.out.println("Automatic state");//sysj\controller.sysj line: 269, column: 5
                                    S112201=1;
                                    if(!empty.getprestatus()){//sysj\controller.sysj line: 270, column: 14
                                      S112207=0;
                                      if(pusherRetracted.getprestatus()){//sysj\controller.sysj line: 273, column: 14
                                        pusherExtend.setPresent();//sysj\controller.sysj line: 275, column: 8
                                        currsigs.addElement(pusherExtend);
                                        active[20]=1;
                                        ends[20]=1;
                                        break RUN;
                                      }
                                      else {
                                        S112207=1;
                                        active[20]=1;
                                        ends[20]=1;
                                        break RUN;
                                      }
                                    }
                                    else {
                                      S112201=2;
                                      S112388=0;
                                      if(!capLoaderStatus_o.isPartnerPresent() || capLoaderStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 299, column: 5
                                        capLoaderStatus_o.setREQ(false);//sysj\controller.sysj line: 299, column: 5
                                        S112388=1;
                                        active[20]=1;
                                        ends[20]=1;
                                        break RUN;
                                      }
                                      else {
                                        S112383=0;
                                        if(capLoaderStatus_o.isACK()){//sysj\controller.sysj line: 299, column: 5
                                          capLoaderStatus_o.setVal("done");//sysj\controller.sysj line: 299, column: 5
                                          S112383=1;
                                          if(!capLoaderStatus_o.isACK()){//sysj\controller.sysj line: 299, column: 5
                                            capLoaderStatus_o.setREQ(false);//sysj\controller.sysj line: 299, column: 5
                                            ends[20]=2;
                                            ;//sysj\controller.sysj line: 299, column: 5
                                            S112156=2;
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
                            else {
                              S112514=1;
                              S112498=0;
                              if(!capLoaderStatus_o.isPartnerPresent() || capLoaderStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 301, column: 5
                                capLoaderStatus_o.setREQ(false);//sysj\controller.sysj line: 301, column: 5
                                S112498=1;
                                active[20]=1;
                                ends[20]=1;
                                break RUN;
                              }
                              else {
                                S112493=0;
                                if(capLoaderStatus_o.isACK()){//sysj\controller.sysj line: 301, column: 5
                                  capLoaderStatus_o.setVal("idle");//sysj\controller.sysj line: 301, column: 5
                                  S112493=1;
                                  if(!capLoaderStatus_o.isACK()){//sysj\controller.sysj line: 301, column: 5
                                    capLoaderStatus_o.setREQ(false);//sysj\controller.sysj line: 301, column: 5
                                    ends[20]=2;
                                    ;//sysj\controller.sysj line: 301, column: 5
                                    S112156=2;
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
                        if(capLoaderReq_in.isREQ()){//sysj\controller.sysj line: 263, column: 4
                          capLoaderReq_in.setACK(false);//sysj\controller.sysj line: 263, column: 4
                          ends[20]=2;
                          ;//sysj\controller.sysj line: 263, column: 4
                          request_thread_20 = (capLoaderReq_in.getVal() == null ? null : ((Boolean)capLoaderReq_in.getVal()));//sysj\controller.sysj line: 264, column: 4
                          S112156=1;
                          if(request_thread_20){//sysj\controller.sysj line: 265, column: 4
                            S112514=0;
                            System.out.println("caploader doing work..");//sysj\controller.sysj line: 266, column: 5
                            S112201=0;
                            S112163=0;
                            if(!capLoaderStatus_o.isPartnerPresent() || capLoaderStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 267, column: 5
                              capLoaderStatus_o.setREQ(false);//sysj\controller.sysj line: 267, column: 5
                              S112163=1;
                              active[20]=1;
                              ends[20]=1;
                              break RUN;
                            }
                            else {
                              S112158=0;
                              if(capLoaderStatus_o.isACK()){//sysj\controller.sysj line: 267, column: 5
                                capLoaderStatus_o.setVal("busy");//sysj\controller.sysj line: 267, column: 5
                                S112158=1;
                                if(!capLoaderStatus_o.isACK()){//sysj\controller.sysj line: 267, column: 5
                                  capLoaderStatus_o.setREQ(false);//sysj\controller.sysj line: 267, column: 5
                                  ends[20]=2;
                                  ;//sysj\controller.sysj line: 267, column: 5
                                  System.out.println("Automatic state");//sysj\controller.sysj line: 269, column: 5
                                  S112201=1;
                                  if(!empty.getprestatus()){//sysj\controller.sysj line: 270, column: 14
                                    S112207=0;
                                    if(pusherRetracted.getprestatus()){//sysj\controller.sysj line: 273, column: 14
                                      pusherExtend.setPresent();//sysj\controller.sysj line: 275, column: 8
                                      currsigs.addElement(pusherExtend);
                                      active[20]=1;
                                      ends[20]=1;
                                      break RUN;
                                    }
                                    else {
                                      S112207=1;
                                      active[20]=1;
                                      ends[20]=1;
                                      break RUN;
                                    }
                                  }
                                  else {
                                    S112201=2;
                                    S112388=0;
                                    if(!capLoaderStatus_o.isPartnerPresent() || capLoaderStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 299, column: 5
                                      capLoaderStatus_o.setREQ(false);//sysj\controller.sysj line: 299, column: 5
                                      S112388=1;
                                      active[20]=1;
                                      ends[20]=1;
                                      break RUN;
                                    }
                                    else {
                                      S112383=0;
                                      if(capLoaderStatus_o.isACK()){//sysj\controller.sysj line: 299, column: 5
                                        capLoaderStatus_o.setVal("done");//sysj\controller.sysj line: 299, column: 5
                                        S112383=1;
                                        if(!capLoaderStatus_o.isACK()){//sysj\controller.sysj line: 299, column: 5
                                          capLoaderStatus_o.setREQ(false);//sysj\controller.sysj line: 299, column: 5
                                          ends[20]=2;
                                          ;//sysj\controller.sysj line: 299, column: 5
                                          S112156=2;
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
                          else {
                            S112514=1;
                            S112498=0;
                            if(!capLoaderStatus_o.isPartnerPresent() || capLoaderStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 301, column: 5
                              capLoaderStatus_o.setREQ(false);//sysj\controller.sysj line: 301, column: 5
                              S112498=1;
                              active[20]=1;
                              ends[20]=1;
                              break RUN;
                            }
                            else {
                              S112493=0;
                              if(capLoaderStatus_o.isACK()){//sysj\controller.sysj line: 301, column: 5
                                capLoaderStatus_o.setVal("idle");//sysj\controller.sysj line: 301, column: 5
                                S112493=1;
                                if(!capLoaderStatus_o.isACK()){//sysj\controller.sysj line: 301, column: 5
                                  capLoaderStatus_o.setREQ(false);//sysj\controller.sysj line: 301, column: 5
                                  ends[20]=2;
                                  ;//sysj\controller.sysj line: 301, column: 5
                                  S112156=2;
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
                  S112140=1;
                  S112140=0;
                  if(!capLoaderReq_in.isPartnerPresent() || capLoaderReq_in.isPartnerPreempted()){//sysj\controller.sysj line: 263, column: 4
                    capLoaderReq_in.setACK(false);//sysj\controller.sysj line: 263, column: 4
                    S112140=1;
                    active[20]=1;
                    ends[20]=1;
                    break RUN;
                  }
                  else {
                    S112135=0;
                    if(!capLoaderReq_in.isREQ()){//sysj\controller.sysj line: 263, column: 4
                      capLoaderReq_in.setACK(true);//sysj\controller.sysj line: 263, column: 4
                      S112135=1;
                      if(capLoaderReq_in.isREQ()){//sysj\controller.sysj line: 263, column: 4
                        capLoaderReq_in.setACK(false);//sysj\controller.sysj line: 263, column: 4
                        ends[20]=2;
                        ;//sysj\controller.sysj line: 263, column: 4
                        request_thread_20 = (capLoaderReq_in.getVal() == null ? null : ((Boolean)capLoaderReq_in.getVal()));//sysj\controller.sysj line: 264, column: 4
                        S112156=1;
                        if(request_thread_20){//sysj\controller.sysj line: 265, column: 4
                          S112514=0;
                          System.out.println("caploader doing work..");//sysj\controller.sysj line: 266, column: 5
                          S112201=0;
                          S112163=0;
                          if(!capLoaderStatus_o.isPartnerPresent() || capLoaderStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 267, column: 5
                            capLoaderStatus_o.setREQ(false);//sysj\controller.sysj line: 267, column: 5
                            S112163=1;
                            active[20]=1;
                            ends[20]=1;
                            break RUN;
                          }
                          else {
                            S112158=0;
                            if(capLoaderStatus_o.isACK()){//sysj\controller.sysj line: 267, column: 5
                              capLoaderStatus_o.setVal("busy");//sysj\controller.sysj line: 267, column: 5
                              S112158=1;
                              if(!capLoaderStatus_o.isACK()){//sysj\controller.sysj line: 267, column: 5
                                capLoaderStatus_o.setREQ(false);//sysj\controller.sysj line: 267, column: 5
                                ends[20]=2;
                                ;//sysj\controller.sysj line: 267, column: 5
                                System.out.println("Automatic state");//sysj\controller.sysj line: 269, column: 5
                                S112201=1;
                                if(!empty.getprestatus()){//sysj\controller.sysj line: 270, column: 14
                                  S112207=0;
                                  if(pusherRetracted.getprestatus()){//sysj\controller.sysj line: 273, column: 14
                                    pusherExtend.setPresent();//sysj\controller.sysj line: 275, column: 8
                                    currsigs.addElement(pusherExtend);
                                    active[20]=1;
                                    ends[20]=1;
                                    break RUN;
                                  }
                                  else {
                                    S112207=1;
                                    active[20]=1;
                                    ends[20]=1;
                                    break RUN;
                                  }
                                }
                                else {
                                  S112201=2;
                                  S112388=0;
                                  if(!capLoaderStatus_o.isPartnerPresent() || capLoaderStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 299, column: 5
                                    capLoaderStatus_o.setREQ(false);//sysj\controller.sysj line: 299, column: 5
                                    S112388=1;
                                    active[20]=1;
                                    ends[20]=1;
                                    break RUN;
                                  }
                                  else {
                                    S112383=0;
                                    if(capLoaderStatus_o.isACK()){//sysj\controller.sysj line: 299, column: 5
                                      capLoaderStatus_o.setVal("done");//sysj\controller.sysj line: 299, column: 5
                                      S112383=1;
                                      if(!capLoaderStatus_o.isACK()){//sysj\controller.sysj line: 299, column: 5
                                        capLoaderStatus_o.setREQ(false);//sysj\controller.sysj line: 299, column: 5
                                        ends[20]=2;
                                        ;//sysj\controller.sysj line: 299, column: 5
                                        S112156=2;
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
                        else {
                          S112514=1;
                          S112498=0;
                          if(!capLoaderStatus_o.isPartnerPresent() || capLoaderStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 301, column: 5
                            capLoaderStatus_o.setREQ(false);//sysj\controller.sysj line: 301, column: 5
                            S112498=1;
                            active[20]=1;
                            ends[20]=1;
                            break RUN;
                          }
                          else {
                            S112493=0;
                            if(capLoaderStatus_o.isACK()){//sysj\controller.sysj line: 301, column: 5
                              capLoaderStatus_o.setVal("idle");//sysj\controller.sysj line: 301, column: 5
                              S112493=1;
                              if(!capLoaderStatus_o.isACK()){//sysj\controller.sysj line: 301, column: 5
                                capLoaderStatus_o.setREQ(false);//sysj\controller.sysj line: 301, column: 5
                                ends[20]=2;
                                ;//sysj\controller.sysj line: 301, column: 5
                                S112156=2;
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
              switch(S112514){
                case 0 : 
                  switch(S112201){
                    case 0 : 
                      switch(S112163){
                        case 0 : 
                          if(!capLoaderStatus_o.isPartnerPresent() || capLoaderStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 267, column: 5
                            capLoaderStatus_o.setREQ(false);//sysj\controller.sysj line: 267, column: 5
                            S112163=1;
                            active[20]=1;
                            ends[20]=1;
                            break RUN;
                          }
                          else {
                            switch(S112158){
                              case 0 : 
                                if(capLoaderStatus_o.isACK()){//sysj\controller.sysj line: 267, column: 5
                                  capLoaderStatus_o.setVal("busy");//sysj\controller.sysj line: 267, column: 5
                                  S112158=1;
                                  if(!capLoaderStatus_o.isACK()){//sysj\controller.sysj line: 267, column: 5
                                    capLoaderStatus_o.setREQ(false);//sysj\controller.sysj line: 267, column: 5
                                    ends[20]=2;
                                    ;//sysj\controller.sysj line: 267, column: 5
                                    System.out.println("Automatic state");//sysj\controller.sysj line: 269, column: 5
                                    S112201=1;
                                    if(!empty.getprestatus()){//sysj\controller.sysj line: 270, column: 14
                                      S112207=0;
                                      if(pusherRetracted.getprestatus()){//sysj\controller.sysj line: 273, column: 14
                                        pusherExtend.setPresent();//sysj\controller.sysj line: 275, column: 8
                                        currsigs.addElement(pusherExtend);
                                        active[20]=1;
                                        ends[20]=1;
                                        break RUN;
                                      }
                                      else {
                                        S112207=1;
                                        active[20]=1;
                                        ends[20]=1;
                                        break RUN;
                                      }
                                    }
                                    else {
                                      S112201=2;
                                      S112388=0;
                                      if(!capLoaderStatus_o.isPartnerPresent() || capLoaderStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 299, column: 5
                                        capLoaderStatus_o.setREQ(false);//sysj\controller.sysj line: 299, column: 5
                                        S112388=1;
                                        active[20]=1;
                                        ends[20]=1;
                                        break RUN;
                                      }
                                      else {
                                        S112383=0;
                                        if(capLoaderStatus_o.isACK()){//sysj\controller.sysj line: 299, column: 5
                                          capLoaderStatus_o.setVal("done");//sysj\controller.sysj line: 299, column: 5
                                          S112383=1;
                                          if(!capLoaderStatus_o.isACK()){//sysj\controller.sysj line: 299, column: 5
                                            capLoaderStatus_o.setREQ(false);//sysj\controller.sysj line: 299, column: 5
                                            ends[20]=2;
                                            ;//sysj\controller.sysj line: 299, column: 5
                                            S112156=2;
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
                                if(!capLoaderStatus_o.isACK()){//sysj\controller.sysj line: 267, column: 5
                                  capLoaderStatus_o.setREQ(false);//sysj\controller.sysj line: 267, column: 5
                                  ends[20]=2;
                                  ;//sysj\controller.sysj line: 267, column: 5
                                  System.out.println("Automatic state");//sysj\controller.sysj line: 269, column: 5
                                  S112201=1;
                                  if(!empty.getprestatus()){//sysj\controller.sysj line: 270, column: 14
                                    S112207=0;
                                    if(pusherRetracted.getprestatus()){//sysj\controller.sysj line: 273, column: 14
                                      pusherExtend.setPresent();//sysj\controller.sysj line: 275, column: 8
                                      currsigs.addElement(pusherExtend);
                                      active[20]=1;
                                      ends[20]=1;
                                      break RUN;
                                    }
                                    else {
                                      S112207=1;
                                      active[20]=1;
                                      ends[20]=1;
                                      break RUN;
                                    }
                                  }
                                  else {
                                    S112201=2;
                                    S112388=0;
                                    if(!capLoaderStatus_o.isPartnerPresent() || capLoaderStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 299, column: 5
                                      capLoaderStatus_o.setREQ(false);//sysj\controller.sysj line: 299, column: 5
                                      S112388=1;
                                      active[20]=1;
                                      ends[20]=1;
                                      break RUN;
                                    }
                                    else {
                                      S112383=0;
                                      if(capLoaderStatus_o.isACK()){//sysj\controller.sysj line: 299, column: 5
                                        capLoaderStatus_o.setVal("done");//sysj\controller.sysj line: 299, column: 5
                                        S112383=1;
                                        if(!capLoaderStatus_o.isACK()){//sysj\controller.sysj line: 299, column: 5
                                          capLoaderStatus_o.setREQ(false);//sysj\controller.sysj line: 299, column: 5
                                          ends[20]=2;
                                          ;//sysj\controller.sysj line: 299, column: 5
                                          S112156=2;
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
                          S112163=1;
                          S112163=0;
                          if(!capLoaderStatus_o.isPartnerPresent() || capLoaderStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 267, column: 5
                            capLoaderStatus_o.setREQ(false);//sysj\controller.sysj line: 267, column: 5
                            S112163=1;
                            active[20]=1;
                            ends[20]=1;
                            break RUN;
                          }
                          else {
                            S112158=0;
                            if(capLoaderStatus_o.isACK()){//sysj\controller.sysj line: 267, column: 5
                              capLoaderStatus_o.setVal("busy");//sysj\controller.sysj line: 267, column: 5
                              S112158=1;
                              if(!capLoaderStatus_o.isACK()){//sysj\controller.sysj line: 267, column: 5
                                capLoaderStatus_o.setREQ(false);//sysj\controller.sysj line: 267, column: 5
                                ends[20]=2;
                                ;//sysj\controller.sysj line: 267, column: 5
                                System.out.println("Automatic state");//sysj\controller.sysj line: 269, column: 5
                                S112201=1;
                                if(!empty.getprestatus()){//sysj\controller.sysj line: 270, column: 14
                                  S112207=0;
                                  if(pusherRetracted.getprestatus()){//sysj\controller.sysj line: 273, column: 14
                                    pusherExtend.setPresent();//sysj\controller.sysj line: 275, column: 8
                                    currsigs.addElement(pusherExtend);
                                    active[20]=1;
                                    ends[20]=1;
                                    break RUN;
                                  }
                                  else {
                                    S112207=1;
                                    active[20]=1;
                                    ends[20]=1;
                                    break RUN;
                                  }
                                }
                                else {
                                  S112201=2;
                                  S112388=0;
                                  if(!capLoaderStatus_o.isPartnerPresent() || capLoaderStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 299, column: 5
                                    capLoaderStatus_o.setREQ(false);//sysj\controller.sysj line: 299, column: 5
                                    S112388=1;
                                    active[20]=1;
                                    ends[20]=1;
                                    break RUN;
                                  }
                                  else {
                                    S112383=0;
                                    if(capLoaderStatus_o.isACK()){//sysj\controller.sysj line: 299, column: 5
                                      capLoaderStatus_o.setVal("done");//sysj\controller.sysj line: 299, column: 5
                                      S112383=1;
                                      if(!capLoaderStatus_o.isACK()){//sysj\controller.sysj line: 299, column: 5
                                        capLoaderStatus_o.setREQ(false);//sysj\controller.sysj line: 299, column: 5
                                        ends[20]=2;
                                        ;//sysj\controller.sysj line: 299, column: 5
                                        S112156=2;
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
                      switch(S112207){
                        case 0 : 
                          if(pusherExtended.getprestatus()){//sysj\controller.sysj line: 274, column: 13
                            S112207=1;
                            active[20]=1;
                            ends[20]=1;
                            break RUN;
                          }
                          else {
                            pusherExtend.setPresent();//sysj\controller.sysj line: 275, column: 8
                            currsigs.addElement(pusherExtend);
                            active[20]=1;
                            ends[20]=1;
                            break RUN;
                          }
                        
                        case 1 : 
                          S112207=1;
                          S112207=2;
                          armSource.setPresent();//sysj\controller.sysj line: 282, column: 7
                          currsigs.addElement(armSource);
                          active[20]=1;
                          ends[20]=1;
                          break RUN;
                        
                        case 2 : 
                          if(armAtSource.getprestatus()){//sysj\controller.sysj line: 281, column: 12
                            S112207=3;
                            active[20]=1;
                            ends[20]=1;
                            break RUN;
                          }
                          else {
                            armSource.setPresent();//sysj\controller.sysj line: 282, column: 7
                            currsigs.addElement(armSource);
                            active[20]=1;
                            ends[20]=1;
                            break RUN;
                          }
                        
                        case 3 : 
                          S112207=3;
                          S112207=4;
                          vacOn.setPresent();//sysj\controller.sysj line: 288, column: 7
                          currsigs.addElement(vacOn);
                          active[20]=1;
                          ends[20]=1;
                          break RUN;
                        
                        case 4 : 
                          if(WPgripped.getprestatus()){//sysj\controller.sysj line: 287, column: 12
                            S112207=5;
                            active[20]=1;
                            ends[20]=1;
                            break RUN;
                          }
                          else {
                            vacOn.setPresent();//sysj\controller.sysj line: 288, column: 7
                            currsigs.addElement(vacOn);
                            active[20]=1;
                            ends[20]=1;
                            break RUN;
                          }
                        
                        case 5 : 
                          S112207=5;
                          S112207=6;
                          thread116725(tdone,ends);
                          thread116726(tdone,ends);
                          int biggest116727 = 0;
                          if(ends[21]>=biggest116727){
                            biggest116727=ends[21];
                          }
                          if(ends[22]>=biggest116727){
                            biggest116727=ends[22];
                          }
                          if(biggest116727 == 1){
                            active[20]=1;
                            ends[20]=1;
                            break RUN;
                          }
                        
                        case 6 : 
                          if(armAtDest.getprestatus()){//sysj\controller.sysj line: 293, column: 13
                            S112207=7;
                            active[20]=1;
                            ends[20]=1;
                            break RUN;
                          }
                          else {
                            thread116728(tdone,ends);
                            thread116729(tdone,ends);
                            int biggest116730 = 0;
                            if(ends[21]>=biggest116730){
                              biggest116730=ends[21];
                            }
                            if(ends[22]>=biggest116730){
                              biggest116730=ends[22];
                            }
                            if(biggest116730 == 1){
                              active[20]=1;
                              ends[20]=1;
                              break RUN;
                            }
                            //FINXME code
                            if(biggest116730 == 0){
                              S112207=7;
                              active[20]=1;
                              ends[20]=1;
                              break RUN;
                            }
                          }
                        
                        case 7 : 
                          S112207=7;
                          S112201=2;
                          S112388=0;
                          if(!capLoaderStatus_o.isPartnerPresent() || capLoaderStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 299, column: 5
                            capLoaderStatus_o.setREQ(false);//sysj\controller.sysj line: 299, column: 5
                            S112388=1;
                            active[20]=1;
                            ends[20]=1;
                            break RUN;
                          }
                          else {
                            S112383=0;
                            if(capLoaderStatus_o.isACK()){//sysj\controller.sysj line: 299, column: 5
                              capLoaderStatus_o.setVal("done");//sysj\controller.sysj line: 299, column: 5
                              S112383=1;
                              if(!capLoaderStatus_o.isACK()){//sysj\controller.sysj line: 299, column: 5
                                capLoaderStatus_o.setREQ(false);//sysj\controller.sysj line: 299, column: 5
                                ends[20]=2;
                                ;//sysj\controller.sysj line: 299, column: 5
                                S112156=2;
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
                    
                    case 2 : 
                      switch(S112388){
                        case 0 : 
                          if(!capLoaderStatus_o.isPartnerPresent() || capLoaderStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 299, column: 5
                            capLoaderStatus_o.setREQ(false);//sysj\controller.sysj line: 299, column: 5
                            S112388=1;
                            active[20]=1;
                            ends[20]=1;
                            break RUN;
                          }
                          else {
                            switch(S112383){
                              case 0 : 
                                if(capLoaderStatus_o.isACK()){//sysj\controller.sysj line: 299, column: 5
                                  capLoaderStatus_o.setVal("done");//sysj\controller.sysj line: 299, column: 5
                                  S112383=1;
                                  if(!capLoaderStatus_o.isACK()){//sysj\controller.sysj line: 299, column: 5
                                    capLoaderStatus_o.setREQ(false);//sysj\controller.sysj line: 299, column: 5
                                    ends[20]=2;
                                    ;//sysj\controller.sysj line: 299, column: 5
                                    S112156=2;
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
                                  S112156=2;
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
                          S112388=1;
                          S112388=0;
                          if(!capLoaderStatus_o.isPartnerPresent() || capLoaderStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 299, column: 5
                            capLoaderStatus_o.setREQ(false);//sysj\controller.sysj line: 299, column: 5
                            S112388=1;
                            active[20]=1;
                            ends[20]=1;
                            break RUN;
                          }
                          else {
                            S112383=0;
                            if(capLoaderStatus_o.isACK()){//sysj\controller.sysj line: 299, column: 5
                              capLoaderStatus_o.setVal("done");//sysj\controller.sysj line: 299, column: 5
                              S112383=1;
                              if(!capLoaderStatus_o.isACK()){//sysj\controller.sysj line: 299, column: 5
                                capLoaderStatus_o.setREQ(false);//sysj\controller.sysj line: 299, column: 5
                                ends[20]=2;
                                ;//sysj\controller.sysj line: 299, column: 5
                                S112156=2;
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
                  switch(S112498){
                    case 0 : 
                      if(!capLoaderStatus_o.isPartnerPresent() || capLoaderStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 301, column: 5
                        capLoaderStatus_o.setREQ(false);//sysj\controller.sysj line: 301, column: 5
                        S112498=1;
                        active[20]=1;
                        ends[20]=1;
                        break RUN;
                      }
                      else {
                        switch(S112493){
                          case 0 : 
                            if(capLoaderStatus_o.isACK()){//sysj\controller.sysj line: 301, column: 5
                              capLoaderStatus_o.setVal("idle");//sysj\controller.sysj line: 301, column: 5
                              S112493=1;
                              if(!capLoaderStatus_o.isACK()){//sysj\controller.sysj line: 301, column: 5
                                capLoaderStatus_o.setREQ(false);//sysj\controller.sysj line: 301, column: 5
                                ends[20]=2;
                                ;//sysj\controller.sysj line: 301, column: 5
                                S112156=2;
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
                            if(!capLoaderStatus_o.isACK()){//sysj\controller.sysj line: 301, column: 5
                              capLoaderStatus_o.setREQ(false);//sysj\controller.sysj line: 301, column: 5
                              ends[20]=2;
                              ;//sysj\controller.sysj line: 301, column: 5
                              S112156=2;
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
                      S112498=1;
                      S112498=0;
                      if(!capLoaderStatus_o.isPartnerPresent() || capLoaderStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 301, column: 5
                        capLoaderStatus_o.setREQ(false);//sysj\controller.sysj line: 301, column: 5
                        S112498=1;
                        active[20]=1;
                        ends[20]=1;
                        break RUN;
                      }
                      else {
                        S112493=0;
                        if(capLoaderStatus_o.isACK()){//sysj\controller.sysj line: 301, column: 5
                          capLoaderStatus_o.setVal("idle");//sysj\controller.sysj line: 301, column: 5
                          S112493=1;
                          if(!capLoaderStatus_o.isACK()){//sysj\controller.sysj line: 301, column: 5
                            capLoaderStatus_o.setREQ(false);//sysj\controller.sysj line: 301, column: 5
                            ends[20]=2;
                            ;//sysj\controller.sysj line: 301, column: 5
                            S112156=2;
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
              S112156=2;
              S112156=0;
              S112140=0;
              if(!capLoaderReq_in.isPartnerPresent() || capLoaderReq_in.isPartnerPreempted()){//sysj\controller.sysj line: 263, column: 4
                capLoaderReq_in.setACK(false);//sysj\controller.sysj line: 263, column: 4
                S112140=1;
                active[20]=1;
                ends[20]=1;
                break RUN;
              }
              else {
                S112135=0;
                if(!capLoaderReq_in.isREQ()){//sysj\controller.sysj line: 263, column: 4
                  capLoaderReq_in.setACK(true);//sysj\controller.sysj line: 263, column: 4
                  S112135=1;
                  if(capLoaderReq_in.isREQ()){//sysj\controller.sysj line: 263, column: 4
                    capLoaderReq_in.setACK(false);//sysj\controller.sysj line: 263, column: 4
                    ends[20]=2;
                    ;//sysj\controller.sysj line: 263, column: 4
                    request_thread_20 = (capLoaderReq_in.getVal() == null ? null : ((Boolean)capLoaderReq_in.getVal()));//sysj\controller.sysj line: 264, column: 4
                    S112156=1;
                    if(request_thread_20){//sysj\controller.sysj line: 265, column: 4
                      S112514=0;
                      System.out.println("caploader doing work..");//sysj\controller.sysj line: 266, column: 5
                      S112201=0;
                      S112163=0;
                      if(!capLoaderStatus_o.isPartnerPresent() || capLoaderStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 267, column: 5
                        capLoaderStatus_o.setREQ(false);//sysj\controller.sysj line: 267, column: 5
                        S112163=1;
                        active[20]=1;
                        ends[20]=1;
                        break RUN;
                      }
                      else {
                        S112158=0;
                        if(capLoaderStatus_o.isACK()){//sysj\controller.sysj line: 267, column: 5
                          capLoaderStatus_o.setVal("busy");//sysj\controller.sysj line: 267, column: 5
                          S112158=1;
                          if(!capLoaderStatus_o.isACK()){//sysj\controller.sysj line: 267, column: 5
                            capLoaderStatus_o.setREQ(false);//sysj\controller.sysj line: 267, column: 5
                            ends[20]=2;
                            ;//sysj\controller.sysj line: 267, column: 5
                            System.out.println("Automatic state");//sysj\controller.sysj line: 269, column: 5
                            S112201=1;
                            if(!empty.getprestatus()){//sysj\controller.sysj line: 270, column: 14
                              S112207=0;
                              if(pusherRetracted.getprestatus()){//sysj\controller.sysj line: 273, column: 14
                                pusherExtend.setPresent();//sysj\controller.sysj line: 275, column: 8
                                currsigs.addElement(pusherExtend);
                                active[20]=1;
                                ends[20]=1;
                                break RUN;
                              }
                              else {
                                S112207=1;
                                active[20]=1;
                                ends[20]=1;
                                break RUN;
                              }
                            }
                            else {
                              S112201=2;
                              S112388=0;
                              if(!capLoaderStatus_o.isPartnerPresent() || capLoaderStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 299, column: 5
                                capLoaderStatus_o.setREQ(false);//sysj\controller.sysj line: 299, column: 5
                                S112388=1;
                                active[20]=1;
                                ends[20]=1;
                                break RUN;
                              }
                              else {
                                S112383=0;
                                if(capLoaderStatus_o.isACK()){//sysj\controller.sysj line: 299, column: 5
                                  capLoaderStatus_o.setVal("done");//sysj\controller.sysj line: 299, column: 5
                                  S112383=1;
                                  if(!capLoaderStatus_o.isACK()){//sysj\controller.sysj line: 299, column: 5
                                    capLoaderStatus_o.setREQ(false);//sysj\controller.sysj line: 299, column: 5
                                    ends[20]=2;
                                    ;//sysj\controller.sysj line: 299, column: 5
                                    S112156=2;
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
                    else {
                      S112514=1;
                      S112498=0;
                      if(!capLoaderStatus_o.isPartnerPresent() || capLoaderStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 301, column: 5
                        capLoaderStatus_o.setREQ(false);//sysj\controller.sysj line: 301, column: 5
                        S112498=1;
                        active[20]=1;
                        ends[20]=1;
                        break RUN;
                      }
                      else {
                        S112493=0;
                        if(capLoaderStatus_o.isACK()){//sysj\controller.sysj line: 301, column: 5
                          capLoaderStatus_o.setVal("idle");//sysj\controller.sysj line: 301, column: 5
                          S112493=1;
                          if(!capLoaderStatus_o.isACK()){//sysj\controller.sysj line: 301, column: 5
                            capLoaderStatus_o.setREQ(false);//sysj\controller.sysj line: 301, column: 5
                            ends[20]=2;
                            ;//sysj\controller.sysj line: 301, column: 5
                            S112156=2;
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
          empty.gethook();
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
      empty.setpreclear();
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
      dummyint = empty.getStatus() ? empty.setprepresent() : empty.setpreclear();
      empty.setpreval(empty.getValue());
      empty.setClear();
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
        empty.gethook();
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
