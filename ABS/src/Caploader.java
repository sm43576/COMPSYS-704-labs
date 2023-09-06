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
  private Boolean request_thread_20;//sysj\controller.sysj line: 258, column: 4
  private int S104602 = 1;
  private int S100522 = 1;
  private int S100506 = 1;
  private int S100501 = 1;
  private int S100858 = 1;
  private int S100545 = 1;
  private int S100529 = 1;
  private int S100524 = 1;
  private int S100551 = 1;
  private int S100572 = 1;
  private int S100577 = 1;
  private int S100732 = 1;
  private int S100727 = 1;
  private int S100842 = 1;
  private int S100837 = 1;
  
  private int[] ends = new int[23];
  private int[] tdone = new int[23];
  
  public void thread104831(int [] tdone, int [] ends){
        switch(S100577){
      case 0 : 
        active[22]=0;
        ends[22]=0;
        tdone[22]=1;
        break;
      
      case 1 : 
        vacOn.setPresent();//sysj\controller.sysj line: 287, column: 30
        currsigs.addElement(vacOn);
        active[22]=1;
        ends[22]=1;
        tdone[22]=1;
        break;
      
    }
  }

  public void thread104830(int [] tdone, int [] ends){
        switch(S100572){
      case 0 : 
        active[21]=0;
        ends[21]=0;
        tdone[21]=1;
        break;
      
      case 1 : 
        armDest.setPresent();//sysj\controller.sysj line: 287, column: 8
        currsigs.addElement(armDest);
        active[21]=1;
        ends[21]=1;
        tdone[21]=1;
        break;
      
    }
  }

  public void thread104828(int [] tdone, int [] ends){
        S100577=1;
    vacOn.setPresent();//sysj\controller.sysj line: 287, column: 30
    currsigs.addElement(vacOn);
    active[22]=1;
    ends[22]=1;
    tdone[22]=1;
  }

  public void thread104827(int [] tdone, int [] ends){
        S100572=1;
    armDest.setPresent();//sysj\controller.sysj line: 287, column: 8
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
      switch(S104602){
        case 0 : 
          S104602=0;
          break RUN;
        
        case 1 : 
          S104602=2;
          S104602=2;
          S100522=0;
          S100506=0;
          if(!capLoaderReq_in.isPartnerPresent() || capLoaderReq_in.isPartnerPreempted()){//sysj\controller.sysj line: 257, column: 4
            capLoaderReq_in.setACK(false);//sysj\controller.sysj line: 257, column: 4
            S100506=1;
            active[20]=1;
            ends[20]=1;
            break RUN;
          }
          else {
            S100501=0;
            if(!capLoaderReq_in.isREQ()){//sysj\controller.sysj line: 257, column: 4
              capLoaderReq_in.setACK(true);//sysj\controller.sysj line: 257, column: 4
              S100501=1;
              if(capLoaderReq_in.isREQ()){//sysj\controller.sysj line: 257, column: 4
                capLoaderReq_in.setACK(false);//sysj\controller.sysj line: 257, column: 4
                ends[20]=2;
                ;//sysj\controller.sysj line: 257, column: 4
                request_thread_20 = (capLoaderReq_in.getVal() == null ? null : ((Boolean)capLoaderReq_in.getVal()));//sysj\controller.sysj line: 258, column: 4
                S100522=1;
                if(request_thread_20){//sysj\controller.sysj line: 259, column: 4
                  S100858=0;
                  S100545=0;
                  S100529=0;
                  if(!capLoaderStatus_o.isPartnerPresent() || capLoaderStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 260, column: 5
                    capLoaderStatus_o.setREQ(false);//sysj\controller.sysj line: 260, column: 5
                    S100529=1;
                    active[20]=1;
                    ends[20]=1;
                    break RUN;
                  }
                  else {
                    S100524=0;
                    if(capLoaderStatus_o.isACK()){//sysj\controller.sysj line: 260, column: 5
                      capLoaderStatus_o.setVal("busy");//sysj\controller.sysj line: 260, column: 5
                      S100524=1;
                      if(!capLoaderStatus_o.isACK()){//sysj\controller.sysj line: 260, column: 5
                        capLoaderStatus_o.setREQ(false);//sysj\controller.sysj line: 260, column: 5
                        ends[20]=2;
                        ;//sysj\controller.sysj line: 260, column: 5
                        System.out.println("Automatic state");//sysj\controller.sysj line: 262, column: 5
                        S100545=1;
                        if(!empty.getprestatus()){//sysj\controller.sysj line: 263, column: 14
                          S100551=0;
                          if(pusherRetracted.getprestatus()){//sysj\controller.sysj line: 266, column: 14
                            pusherExtend.setPresent();//sysj\controller.sysj line: 268, column: 8
                            currsigs.addElement(pusherExtend);
                            active[20]=1;
                            ends[20]=1;
                            break RUN;
                          }
                          else {
                            S100551=1;
                            active[20]=1;
                            ends[20]=1;
                            break RUN;
                          }
                        }
                        else {
                          S100545=2;
                          S100732=0;
                          if(!capLoaderStatus_o.isPartnerPresent() || capLoaderStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 292, column: 5
                            capLoaderStatus_o.setREQ(false);//sysj\controller.sysj line: 292, column: 5
                            S100732=1;
                            active[20]=1;
                            ends[20]=1;
                            break RUN;
                          }
                          else {
                            S100727=0;
                            if(capLoaderStatus_o.isACK()){//sysj\controller.sysj line: 292, column: 5
                              capLoaderStatus_o.setVal("done");//sysj\controller.sysj line: 292, column: 5
                              S100727=1;
                              if(!capLoaderStatus_o.isACK()){//sysj\controller.sysj line: 292, column: 5
                                capLoaderStatus_o.setREQ(false);//sysj\controller.sysj line: 292, column: 5
                                ends[20]=2;
                                ;//sysj\controller.sysj line: 292, column: 5
                                S100522=2;
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
                  S100858=1;
                  S100842=0;
                  if(!capLoaderStatus_o.isPartnerPresent() || capLoaderStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 294, column: 5
                    capLoaderStatus_o.setREQ(false);//sysj\controller.sysj line: 294, column: 5
                    S100842=1;
                    active[20]=1;
                    ends[20]=1;
                    break RUN;
                  }
                  else {
                    S100837=0;
                    if(capLoaderStatus_o.isACK()){//sysj\controller.sysj line: 294, column: 5
                      capLoaderStatus_o.setVal("idle");//sysj\controller.sysj line: 294, column: 5
                      S100837=1;
                      if(!capLoaderStatus_o.isACK()){//sysj\controller.sysj line: 294, column: 5
                        capLoaderStatus_o.setREQ(false);//sysj\controller.sysj line: 294, column: 5
                        ends[20]=2;
                        ;//sysj\controller.sysj line: 294, column: 5
                        S100522=2;
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
          switch(S100522){
            case 0 : 
              switch(S100506){
                case 0 : 
                  if(!capLoaderReq_in.isPartnerPresent() || capLoaderReq_in.isPartnerPreempted()){//sysj\controller.sysj line: 257, column: 4
                    capLoaderReq_in.setACK(false);//sysj\controller.sysj line: 257, column: 4
                    S100506=1;
                    active[20]=1;
                    ends[20]=1;
                    break RUN;
                  }
                  else {
                    switch(S100501){
                      case 0 : 
                        if(!capLoaderReq_in.isREQ()){//sysj\controller.sysj line: 257, column: 4
                          capLoaderReq_in.setACK(true);//sysj\controller.sysj line: 257, column: 4
                          S100501=1;
                          if(capLoaderReq_in.isREQ()){//sysj\controller.sysj line: 257, column: 4
                            capLoaderReq_in.setACK(false);//sysj\controller.sysj line: 257, column: 4
                            ends[20]=2;
                            ;//sysj\controller.sysj line: 257, column: 4
                            request_thread_20 = (capLoaderReq_in.getVal() == null ? null : ((Boolean)capLoaderReq_in.getVal()));//sysj\controller.sysj line: 258, column: 4
                            S100522=1;
                            if(request_thread_20){//sysj\controller.sysj line: 259, column: 4
                              S100858=0;
                              S100545=0;
                              S100529=0;
                              if(!capLoaderStatus_o.isPartnerPresent() || capLoaderStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 260, column: 5
                                capLoaderStatus_o.setREQ(false);//sysj\controller.sysj line: 260, column: 5
                                S100529=1;
                                active[20]=1;
                                ends[20]=1;
                                break RUN;
                              }
                              else {
                                S100524=0;
                                if(capLoaderStatus_o.isACK()){//sysj\controller.sysj line: 260, column: 5
                                  capLoaderStatus_o.setVal("busy");//sysj\controller.sysj line: 260, column: 5
                                  S100524=1;
                                  if(!capLoaderStatus_o.isACK()){//sysj\controller.sysj line: 260, column: 5
                                    capLoaderStatus_o.setREQ(false);//sysj\controller.sysj line: 260, column: 5
                                    ends[20]=2;
                                    ;//sysj\controller.sysj line: 260, column: 5
                                    System.out.println("Automatic state");//sysj\controller.sysj line: 262, column: 5
                                    S100545=1;
                                    if(!empty.getprestatus()){//sysj\controller.sysj line: 263, column: 14
                                      S100551=0;
                                      if(pusherRetracted.getprestatus()){//sysj\controller.sysj line: 266, column: 14
                                        pusherExtend.setPresent();//sysj\controller.sysj line: 268, column: 8
                                        currsigs.addElement(pusherExtend);
                                        active[20]=1;
                                        ends[20]=1;
                                        break RUN;
                                      }
                                      else {
                                        S100551=1;
                                        active[20]=1;
                                        ends[20]=1;
                                        break RUN;
                                      }
                                    }
                                    else {
                                      S100545=2;
                                      S100732=0;
                                      if(!capLoaderStatus_o.isPartnerPresent() || capLoaderStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 292, column: 5
                                        capLoaderStatus_o.setREQ(false);//sysj\controller.sysj line: 292, column: 5
                                        S100732=1;
                                        active[20]=1;
                                        ends[20]=1;
                                        break RUN;
                                      }
                                      else {
                                        S100727=0;
                                        if(capLoaderStatus_o.isACK()){//sysj\controller.sysj line: 292, column: 5
                                          capLoaderStatus_o.setVal("done");//sysj\controller.sysj line: 292, column: 5
                                          S100727=1;
                                          if(!capLoaderStatus_o.isACK()){//sysj\controller.sysj line: 292, column: 5
                                            capLoaderStatus_o.setREQ(false);//sysj\controller.sysj line: 292, column: 5
                                            ends[20]=2;
                                            ;//sysj\controller.sysj line: 292, column: 5
                                            S100522=2;
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
                              S100858=1;
                              S100842=0;
                              if(!capLoaderStatus_o.isPartnerPresent() || capLoaderStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 294, column: 5
                                capLoaderStatus_o.setREQ(false);//sysj\controller.sysj line: 294, column: 5
                                S100842=1;
                                active[20]=1;
                                ends[20]=1;
                                break RUN;
                              }
                              else {
                                S100837=0;
                                if(capLoaderStatus_o.isACK()){//sysj\controller.sysj line: 294, column: 5
                                  capLoaderStatus_o.setVal("idle");//sysj\controller.sysj line: 294, column: 5
                                  S100837=1;
                                  if(!capLoaderStatus_o.isACK()){//sysj\controller.sysj line: 294, column: 5
                                    capLoaderStatus_o.setREQ(false);//sysj\controller.sysj line: 294, column: 5
                                    ends[20]=2;
                                    ;//sysj\controller.sysj line: 294, column: 5
                                    S100522=2;
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
                        if(capLoaderReq_in.isREQ()){//sysj\controller.sysj line: 257, column: 4
                          capLoaderReq_in.setACK(false);//sysj\controller.sysj line: 257, column: 4
                          ends[20]=2;
                          ;//sysj\controller.sysj line: 257, column: 4
                          request_thread_20 = (capLoaderReq_in.getVal() == null ? null : ((Boolean)capLoaderReq_in.getVal()));//sysj\controller.sysj line: 258, column: 4
                          S100522=1;
                          if(request_thread_20){//sysj\controller.sysj line: 259, column: 4
                            S100858=0;
                            S100545=0;
                            S100529=0;
                            if(!capLoaderStatus_o.isPartnerPresent() || capLoaderStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 260, column: 5
                              capLoaderStatus_o.setREQ(false);//sysj\controller.sysj line: 260, column: 5
                              S100529=1;
                              active[20]=1;
                              ends[20]=1;
                              break RUN;
                            }
                            else {
                              S100524=0;
                              if(capLoaderStatus_o.isACK()){//sysj\controller.sysj line: 260, column: 5
                                capLoaderStatus_o.setVal("busy");//sysj\controller.sysj line: 260, column: 5
                                S100524=1;
                                if(!capLoaderStatus_o.isACK()){//sysj\controller.sysj line: 260, column: 5
                                  capLoaderStatus_o.setREQ(false);//sysj\controller.sysj line: 260, column: 5
                                  ends[20]=2;
                                  ;//sysj\controller.sysj line: 260, column: 5
                                  System.out.println("Automatic state");//sysj\controller.sysj line: 262, column: 5
                                  S100545=1;
                                  if(!empty.getprestatus()){//sysj\controller.sysj line: 263, column: 14
                                    S100551=0;
                                    if(pusherRetracted.getprestatus()){//sysj\controller.sysj line: 266, column: 14
                                      pusherExtend.setPresent();//sysj\controller.sysj line: 268, column: 8
                                      currsigs.addElement(pusherExtend);
                                      active[20]=1;
                                      ends[20]=1;
                                      break RUN;
                                    }
                                    else {
                                      S100551=1;
                                      active[20]=1;
                                      ends[20]=1;
                                      break RUN;
                                    }
                                  }
                                  else {
                                    S100545=2;
                                    S100732=0;
                                    if(!capLoaderStatus_o.isPartnerPresent() || capLoaderStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 292, column: 5
                                      capLoaderStatus_o.setREQ(false);//sysj\controller.sysj line: 292, column: 5
                                      S100732=1;
                                      active[20]=1;
                                      ends[20]=1;
                                      break RUN;
                                    }
                                    else {
                                      S100727=0;
                                      if(capLoaderStatus_o.isACK()){//sysj\controller.sysj line: 292, column: 5
                                        capLoaderStatus_o.setVal("done");//sysj\controller.sysj line: 292, column: 5
                                        S100727=1;
                                        if(!capLoaderStatus_o.isACK()){//sysj\controller.sysj line: 292, column: 5
                                          capLoaderStatus_o.setREQ(false);//sysj\controller.sysj line: 292, column: 5
                                          ends[20]=2;
                                          ;//sysj\controller.sysj line: 292, column: 5
                                          S100522=2;
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
                            S100858=1;
                            S100842=0;
                            if(!capLoaderStatus_o.isPartnerPresent() || capLoaderStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 294, column: 5
                              capLoaderStatus_o.setREQ(false);//sysj\controller.sysj line: 294, column: 5
                              S100842=1;
                              active[20]=1;
                              ends[20]=1;
                              break RUN;
                            }
                            else {
                              S100837=0;
                              if(capLoaderStatus_o.isACK()){//sysj\controller.sysj line: 294, column: 5
                                capLoaderStatus_o.setVal("idle");//sysj\controller.sysj line: 294, column: 5
                                S100837=1;
                                if(!capLoaderStatus_o.isACK()){//sysj\controller.sysj line: 294, column: 5
                                  capLoaderStatus_o.setREQ(false);//sysj\controller.sysj line: 294, column: 5
                                  ends[20]=2;
                                  ;//sysj\controller.sysj line: 294, column: 5
                                  S100522=2;
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
                  S100506=1;
                  S100506=0;
                  if(!capLoaderReq_in.isPartnerPresent() || capLoaderReq_in.isPartnerPreempted()){//sysj\controller.sysj line: 257, column: 4
                    capLoaderReq_in.setACK(false);//sysj\controller.sysj line: 257, column: 4
                    S100506=1;
                    active[20]=1;
                    ends[20]=1;
                    break RUN;
                  }
                  else {
                    S100501=0;
                    if(!capLoaderReq_in.isREQ()){//sysj\controller.sysj line: 257, column: 4
                      capLoaderReq_in.setACK(true);//sysj\controller.sysj line: 257, column: 4
                      S100501=1;
                      if(capLoaderReq_in.isREQ()){//sysj\controller.sysj line: 257, column: 4
                        capLoaderReq_in.setACK(false);//sysj\controller.sysj line: 257, column: 4
                        ends[20]=2;
                        ;//sysj\controller.sysj line: 257, column: 4
                        request_thread_20 = (capLoaderReq_in.getVal() == null ? null : ((Boolean)capLoaderReq_in.getVal()));//sysj\controller.sysj line: 258, column: 4
                        S100522=1;
                        if(request_thread_20){//sysj\controller.sysj line: 259, column: 4
                          S100858=0;
                          S100545=0;
                          S100529=0;
                          if(!capLoaderStatus_o.isPartnerPresent() || capLoaderStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 260, column: 5
                            capLoaderStatus_o.setREQ(false);//sysj\controller.sysj line: 260, column: 5
                            S100529=1;
                            active[20]=1;
                            ends[20]=1;
                            break RUN;
                          }
                          else {
                            S100524=0;
                            if(capLoaderStatus_o.isACK()){//sysj\controller.sysj line: 260, column: 5
                              capLoaderStatus_o.setVal("busy");//sysj\controller.sysj line: 260, column: 5
                              S100524=1;
                              if(!capLoaderStatus_o.isACK()){//sysj\controller.sysj line: 260, column: 5
                                capLoaderStatus_o.setREQ(false);//sysj\controller.sysj line: 260, column: 5
                                ends[20]=2;
                                ;//sysj\controller.sysj line: 260, column: 5
                                System.out.println("Automatic state");//sysj\controller.sysj line: 262, column: 5
                                S100545=1;
                                if(!empty.getprestatus()){//sysj\controller.sysj line: 263, column: 14
                                  S100551=0;
                                  if(pusherRetracted.getprestatus()){//sysj\controller.sysj line: 266, column: 14
                                    pusherExtend.setPresent();//sysj\controller.sysj line: 268, column: 8
                                    currsigs.addElement(pusherExtend);
                                    active[20]=1;
                                    ends[20]=1;
                                    break RUN;
                                  }
                                  else {
                                    S100551=1;
                                    active[20]=1;
                                    ends[20]=1;
                                    break RUN;
                                  }
                                }
                                else {
                                  S100545=2;
                                  S100732=0;
                                  if(!capLoaderStatus_o.isPartnerPresent() || capLoaderStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 292, column: 5
                                    capLoaderStatus_o.setREQ(false);//sysj\controller.sysj line: 292, column: 5
                                    S100732=1;
                                    active[20]=1;
                                    ends[20]=1;
                                    break RUN;
                                  }
                                  else {
                                    S100727=0;
                                    if(capLoaderStatus_o.isACK()){//sysj\controller.sysj line: 292, column: 5
                                      capLoaderStatus_o.setVal("done");//sysj\controller.sysj line: 292, column: 5
                                      S100727=1;
                                      if(!capLoaderStatus_o.isACK()){//sysj\controller.sysj line: 292, column: 5
                                        capLoaderStatus_o.setREQ(false);//sysj\controller.sysj line: 292, column: 5
                                        ends[20]=2;
                                        ;//sysj\controller.sysj line: 292, column: 5
                                        S100522=2;
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
                          S100858=1;
                          S100842=0;
                          if(!capLoaderStatus_o.isPartnerPresent() || capLoaderStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 294, column: 5
                            capLoaderStatus_o.setREQ(false);//sysj\controller.sysj line: 294, column: 5
                            S100842=1;
                            active[20]=1;
                            ends[20]=1;
                            break RUN;
                          }
                          else {
                            S100837=0;
                            if(capLoaderStatus_o.isACK()){//sysj\controller.sysj line: 294, column: 5
                              capLoaderStatus_o.setVal("idle");//sysj\controller.sysj line: 294, column: 5
                              S100837=1;
                              if(!capLoaderStatus_o.isACK()){//sysj\controller.sysj line: 294, column: 5
                                capLoaderStatus_o.setREQ(false);//sysj\controller.sysj line: 294, column: 5
                                ends[20]=2;
                                ;//sysj\controller.sysj line: 294, column: 5
                                S100522=2;
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
              switch(S100858){
                case 0 : 
                  switch(S100545){
                    case 0 : 
                      switch(S100529){
                        case 0 : 
                          if(!capLoaderStatus_o.isPartnerPresent() || capLoaderStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 260, column: 5
                            capLoaderStatus_o.setREQ(false);//sysj\controller.sysj line: 260, column: 5
                            S100529=1;
                            active[20]=1;
                            ends[20]=1;
                            break RUN;
                          }
                          else {
                            switch(S100524){
                              case 0 : 
                                if(capLoaderStatus_o.isACK()){//sysj\controller.sysj line: 260, column: 5
                                  capLoaderStatus_o.setVal("busy");//sysj\controller.sysj line: 260, column: 5
                                  S100524=1;
                                  if(!capLoaderStatus_o.isACK()){//sysj\controller.sysj line: 260, column: 5
                                    capLoaderStatus_o.setREQ(false);//sysj\controller.sysj line: 260, column: 5
                                    ends[20]=2;
                                    ;//sysj\controller.sysj line: 260, column: 5
                                    System.out.println("Automatic state");//sysj\controller.sysj line: 262, column: 5
                                    S100545=1;
                                    if(!empty.getprestatus()){//sysj\controller.sysj line: 263, column: 14
                                      S100551=0;
                                      if(pusherRetracted.getprestatus()){//sysj\controller.sysj line: 266, column: 14
                                        pusherExtend.setPresent();//sysj\controller.sysj line: 268, column: 8
                                        currsigs.addElement(pusherExtend);
                                        active[20]=1;
                                        ends[20]=1;
                                        break RUN;
                                      }
                                      else {
                                        S100551=1;
                                        active[20]=1;
                                        ends[20]=1;
                                        break RUN;
                                      }
                                    }
                                    else {
                                      S100545=2;
                                      S100732=0;
                                      if(!capLoaderStatus_o.isPartnerPresent() || capLoaderStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 292, column: 5
                                        capLoaderStatus_o.setREQ(false);//sysj\controller.sysj line: 292, column: 5
                                        S100732=1;
                                        active[20]=1;
                                        ends[20]=1;
                                        break RUN;
                                      }
                                      else {
                                        S100727=0;
                                        if(capLoaderStatus_o.isACK()){//sysj\controller.sysj line: 292, column: 5
                                          capLoaderStatus_o.setVal("done");//sysj\controller.sysj line: 292, column: 5
                                          S100727=1;
                                          if(!capLoaderStatus_o.isACK()){//sysj\controller.sysj line: 292, column: 5
                                            capLoaderStatus_o.setREQ(false);//sysj\controller.sysj line: 292, column: 5
                                            ends[20]=2;
                                            ;//sysj\controller.sysj line: 292, column: 5
                                            S100522=2;
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
                                if(!capLoaderStatus_o.isACK()){//sysj\controller.sysj line: 260, column: 5
                                  capLoaderStatus_o.setREQ(false);//sysj\controller.sysj line: 260, column: 5
                                  ends[20]=2;
                                  ;//sysj\controller.sysj line: 260, column: 5
                                  System.out.println("Automatic state");//sysj\controller.sysj line: 262, column: 5
                                  S100545=1;
                                  if(!empty.getprestatus()){//sysj\controller.sysj line: 263, column: 14
                                    S100551=0;
                                    if(pusherRetracted.getprestatus()){//sysj\controller.sysj line: 266, column: 14
                                      pusherExtend.setPresent();//sysj\controller.sysj line: 268, column: 8
                                      currsigs.addElement(pusherExtend);
                                      active[20]=1;
                                      ends[20]=1;
                                      break RUN;
                                    }
                                    else {
                                      S100551=1;
                                      active[20]=1;
                                      ends[20]=1;
                                      break RUN;
                                    }
                                  }
                                  else {
                                    S100545=2;
                                    S100732=0;
                                    if(!capLoaderStatus_o.isPartnerPresent() || capLoaderStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 292, column: 5
                                      capLoaderStatus_o.setREQ(false);//sysj\controller.sysj line: 292, column: 5
                                      S100732=1;
                                      active[20]=1;
                                      ends[20]=1;
                                      break RUN;
                                    }
                                    else {
                                      S100727=0;
                                      if(capLoaderStatus_o.isACK()){//sysj\controller.sysj line: 292, column: 5
                                        capLoaderStatus_o.setVal("done");//sysj\controller.sysj line: 292, column: 5
                                        S100727=1;
                                        if(!capLoaderStatus_o.isACK()){//sysj\controller.sysj line: 292, column: 5
                                          capLoaderStatus_o.setREQ(false);//sysj\controller.sysj line: 292, column: 5
                                          ends[20]=2;
                                          ;//sysj\controller.sysj line: 292, column: 5
                                          S100522=2;
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
                          S100529=1;
                          S100529=0;
                          if(!capLoaderStatus_o.isPartnerPresent() || capLoaderStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 260, column: 5
                            capLoaderStatus_o.setREQ(false);//sysj\controller.sysj line: 260, column: 5
                            S100529=1;
                            active[20]=1;
                            ends[20]=1;
                            break RUN;
                          }
                          else {
                            S100524=0;
                            if(capLoaderStatus_o.isACK()){//sysj\controller.sysj line: 260, column: 5
                              capLoaderStatus_o.setVal("busy");//sysj\controller.sysj line: 260, column: 5
                              S100524=1;
                              if(!capLoaderStatus_o.isACK()){//sysj\controller.sysj line: 260, column: 5
                                capLoaderStatus_o.setREQ(false);//sysj\controller.sysj line: 260, column: 5
                                ends[20]=2;
                                ;//sysj\controller.sysj line: 260, column: 5
                                System.out.println("Automatic state");//sysj\controller.sysj line: 262, column: 5
                                S100545=1;
                                if(!empty.getprestatus()){//sysj\controller.sysj line: 263, column: 14
                                  S100551=0;
                                  if(pusherRetracted.getprestatus()){//sysj\controller.sysj line: 266, column: 14
                                    pusherExtend.setPresent();//sysj\controller.sysj line: 268, column: 8
                                    currsigs.addElement(pusherExtend);
                                    active[20]=1;
                                    ends[20]=1;
                                    break RUN;
                                  }
                                  else {
                                    S100551=1;
                                    active[20]=1;
                                    ends[20]=1;
                                    break RUN;
                                  }
                                }
                                else {
                                  S100545=2;
                                  S100732=0;
                                  if(!capLoaderStatus_o.isPartnerPresent() || capLoaderStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 292, column: 5
                                    capLoaderStatus_o.setREQ(false);//sysj\controller.sysj line: 292, column: 5
                                    S100732=1;
                                    active[20]=1;
                                    ends[20]=1;
                                    break RUN;
                                  }
                                  else {
                                    S100727=0;
                                    if(capLoaderStatus_o.isACK()){//sysj\controller.sysj line: 292, column: 5
                                      capLoaderStatus_o.setVal("done");//sysj\controller.sysj line: 292, column: 5
                                      S100727=1;
                                      if(!capLoaderStatus_o.isACK()){//sysj\controller.sysj line: 292, column: 5
                                        capLoaderStatus_o.setREQ(false);//sysj\controller.sysj line: 292, column: 5
                                        ends[20]=2;
                                        ;//sysj\controller.sysj line: 292, column: 5
                                        S100522=2;
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
                      switch(S100551){
                        case 0 : 
                          if(pusherExtended.getprestatus()){//sysj\controller.sysj line: 267, column: 13
                            S100551=1;
                            active[20]=1;
                            ends[20]=1;
                            break RUN;
                          }
                          else {
                            pusherExtend.setPresent();//sysj\controller.sysj line: 268, column: 8
                            currsigs.addElement(pusherExtend);
                            active[20]=1;
                            ends[20]=1;
                            break RUN;
                          }
                        
                        case 1 : 
                          S100551=1;
                          S100551=2;
                          armSource.setPresent();//sysj\controller.sysj line: 275, column: 7
                          currsigs.addElement(armSource);
                          active[20]=1;
                          ends[20]=1;
                          break RUN;
                        
                        case 2 : 
                          if(armAtSource.getprestatus()){//sysj\controller.sysj line: 274, column: 12
                            S100551=3;
                            active[20]=1;
                            ends[20]=1;
                            break RUN;
                          }
                          else {
                            armSource.setPresent();//sysj\controller.sysj line: 275, column: 7
                            currsigs.addElement(armSource);
                            active[20]=1;
                            ends[20]=1;
                            break RUN;
                          }
                        
                        case 3 : 
                          S100551=3;
                          S100551=4;
                          vacOn.setPresent();//sysj\controller.sysj line: 281, column: 7
                          currsigs.addElement(vacOn);
                          active[20]=1;
                          ends[20]=1;
                          break RUN;
                        
                        case 4 : 
                          if(WPgripped.getprestatus()){//sysj\controller.sysj line: 280, column: 12
                            S100551=5;
                            active[20]=1;
                            ends[20]=1;
                            break RUN;
                          }
                          else {
                            vacOn.setPresent();//sysj\controller.sysj line: 281, column: 7
                            currsigs.addElement(vacOn);
                            active[20]=1;
                            ends[20]=1;
                            break RUN;
                          }
                        
                        case 5 : 
                          S100551=5;
                          S100551=6;
                          thread104827(tdone,ends);
                          thread104828(tdone,ends);
                          int biggest104829 = 0;
                          if(ends[21]>=biggest104829){
                            biggest104829=ends[21];
                          }
                          if(ends[22]>=biggest104829){
                            biggest104829=ends[22];
                          }
                          if(biggest104829 == 1){
                            active[20]=1;
                            ends[20]=1;
                            break RUN;
                          }
                        
                        case 6 : 
                          if(armAtDest.getprestatus()){//sysj\controller.sysj line: 286, column: 13
                            S100551=7;
                            active[20]=1;
                            ends[20]=1;
                            break RUN;
                          }
                          else {
                            thread104830(tdone,ends);
                            thread104831(tdone,ends);
                            int biggest104832 = 0;
                            if(ends[21]>=biggest104832){
                              biggest104832=ends[21];
                            }
                            if(ends[22]>=biggest104832){
                              biggest104832=ends[22];
                            }
                            if(biggest104832 == 1){
                              active[20]=1;
                              ends[20]=1;
                              break RUN;
                            }
                            //FINXME code
                            if(biggest104832 == 0){
                              S100551=7;
                              active[20]=1;
                              ends[20]=1;
                              break RUN;
                            }
                          }
                        
                        case 7 : 
                          S100551=7;
                          S100545=2;
                          S100732=0;
                          if(!capLoaderStatus_o.isPartnerPresent() || capLoaderStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 292, column: 5
                            capLoaderStatus_o.setREQ(false);//sysj\controller.sysj line: 292, column: 5
                            S100732=1;
                            active[20]=1;
                            ends[20]=1;
                            break RUN;
                          }
                          else {
                            S100727=0;
                            if(capLoaderStatus_o.isACK()){//sysj\controller.sysj line: 292, column: 5
                              capLoaderStatus_o.setVal("done");//sysj\controller.sysj line: 292, column: 5
                              S100727=1;
                              if(!capLoaderStatus_o.isACK()){//sysj\controller.sysj line: 292, column: 5
                                capLoaderStatus_o.setREQ(false);//sysj\controller.sysj line: 292, column: 5
                                ends[20]=2;
                                ;//sysj\controller.sysj line: 292, column: 5
                                S100522=2;
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
                      switch(S100732){
                        case 0 : 
                          if(!capLoaderStatus_o.isPartnerPresent() || capLoaderStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 292, column: 5
                            capLoaderStatus_o.setREQ(false);//sysj\controller.sysj line: 292, column: 5
                            S100732=1;
                            active[20]=1;
                            ends[20]=1;
                            break RUN;
                          }
                          else {
                            switch(S100727){
                              case 0 : 
                                if(capLoaderStatus_o.isACK()){//sysj\controller.sysj line: 292, column: 5
                                  capLoaderStatus_o.setVal("done");//sysj\controller.sysj line: 292, column: 5
                                  S100727=1;
                                  if(!capLoaderStatus_o.isACK()){//sysj\controller.sysj line: 292, column: 5
                                    capLoaderStatus_o.setREQ(false);//sysj\controller.sysj line: 292, column: 5
                                    ends[20]=2;
                                    ;//sysj\controller.sysj line: 292, column: 5
                                    S100522=2;
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
                                if(!capLoaderStatus_o.isACK()){//sysj\controller.sysj line: 292, column: 5
                                  capLoaderStatus_o.setREQ(false);//sysj\controller.sysj line: 292, column: 5
                                  ends[20]=2;
                                  ;//sysj\controller.sysj line: 292, column: 5
                                  S100522=2;
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
                          S100732=1;
                          S100732=0;
                          if(!capLoaderStatus_o.isPartnerPresent() || capLoaderStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 292, column: 5
                            capLoaderStatus_o.setREQ(false);//sysj\controller.sysj line: 292, column: 5
                            S100732=1;
                            active[20]=1;
                            ends[20]=1;
                            break RUN;
                          }
                          else {
                            S100727=0;
                            if(capLoaderStatus_o.isACK()){//sysj\controller.sysj line: 292, column: 5
                              capLoaderStatus_o.setVal("done");//sysj\controller.sysj line: 292, column: 5
                              S100727=1;
                              if(!capLoaderStatus_o.isACK()){//sysj\controller.sysj line: 292, column: 5
                                capLoaderStatus_o.setREQ(false);//sysj\controller.sysj line: 292, column: 5
                                ends[20]=2;
                                ;//sysj\controller.sysj line: 292, column: 5
                                S100522=2;
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
                  switch(S100842){
                    case 0 : 
                      if(!capLoaderStatus_o.isPartnerPresent() || capLoaderStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 294, column: 5
                        capLoaderStatus_o.setREQ(false);//sysj\controller.sysj line: 294, column: 5
                        S100842=1;
                        active[20]=1;
                        ends[20]=1;
                        break RUN;
                      }
                      else {
                        switch(S100837){
                          case 0 : 
                            if(capLoaderStatus_o.isACK()){//sysj\controller.sysj line: 294, column: 5
                              capLoaderStatus_o.setVal("idle");//sysj\controller.sysj line: 294, column: 5
                              S100837=1;
                              if(!capLoaderStatus_o.isACK()){//sysj\controller.sysj line: 294, column: 5
                                capLoaderStatus_o.setREQ(false);//sysj\controller.sysj line: 294, column: 5
                                ends[20]=2;
                                ;//sysj\controller.sysj line: 294, column: 5
                                S100522=2;
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
                            if(!capLoaderStatus_o.isACK()){//sysj\controller.sysj line: 294, column: 5
                              capLoaderStatus_o.setREQ(false);//sysj\controller.sysj line: 294, column: 5
                              ends[20]=2;
                              ;//sysj\controller.sysj line: 294, column: 5
                              S100522=2;
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
                      S100842=1;
                      S100842=0;
                      if(!capLoaderStatus_o.isPartnerPresent() || capLoaderStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 294, column: 5
                        capLoaderStatus_o.setREQ(false);//sysj\controller.sysj line: 294, column: 5
                        S100842=1;
                        active[20]=1;
                        ends[20]=1;
                        break RUN;
                      }
                      else {
                        S100837=0;
                        if(capLoaderStatus_o.isACK()){//sysj\controller.sysj line: 294, column: 5
                          capLoaderStatus_o.setVal("idle");//sysj\controller.sysj line: 294, column: 5
                          S100837=1;
                          if(!capLoaderStatus_o.isACK()){//sysj\controller.sysj line: 294, column: 5
                            capLoaderStatus_o.setREQ(false);//sysj\controller.sysj line: 294, column: 5
                            ends[20]=2;
                            ;//sysj\controller.sysj line: 294, column: 5
                            S100522=2;
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
              S100522=2;
              S100522=0;
              S100506=0;
              if(!capLoaderReq_in.isPartnerPresent() || capLoaderReq_in.isPartnerPreempted()){//sysj\controller.sysj line: 257, column: 4
                capLoaderReq_in.setACK(false);//sysj\controller.sysj line: 257, column: 4
                S100506=1;
                active[20]=1;
                ends[20]=1;
                break RUN;
              }
              else {
                S100501=0;
                if(!capLoaderReq_in.isREQ()){//sysj\controller.sysj line: 257, column: 4
                  capLoaderReq_in.setACK(true);//sysj\controller.sysj line: 257, column: 4
                  S100501=1;
                  if(capLoaderReq_in.isREQ()){//sysj\controller.sysj line: 257, column: 4
                    capLoaderReq_in.setACK(false);//sysj\controller.sysj line: 257, column: 4
                    ends[20]=2;
                    ;//sysj\controller.sysj line: 257, column: 4
                    request_thread_20 = (capLoaderReq_in.getVal() == null ? null : ((Boolean)capLoaderReq_in.getVal()));//sysj\controller.sysj line: 258, column: 4
                    S100522=1;
                    if(request_thread_20){//sysj\controller.sysj line: 259, column: 4
                      S100858=0;
                      S100545=0;
                      S100529=0;
                      if(!capLoaderStatus_o.isPartnerPresent() || capLoaderStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 260, column: 5
                        capLoaderStatus_o.setREQ(false);//sysj\controller.sysj line: 260, column: 5
                        S100529=1;
                        active[20]=1;
                        ends[20]=1;
                        break RUN;
                      }
                      else {
                        S100524=0;
                        if(capLoaderStatus_o.isACK()){//sysj\controller.sysj line: 260, column: 5
                          capLoaderStatus_o.setVal("busy");//sysj\controller.sysj line: 260, column: 5
                          S100524=1;
                          if(!capLoaderStatus_o.isACK()){//sysj\controller.sysj line: 260, column: 5
                            capLoaderStatus_o.setREQ(false);//sysj\controller.sysj line: 260, column: 5
                            ends[20]=2;
                            ;//sysj\controller.sysj line: 260, column: 5
                            System.out.println("Automatic state");//sysj\controller.sysj line: 262, column: 5
                            S100545=1;
                            if(!empty.getprestatus()){//sysj\controller.sysj line: 263, column: 14
                              S100551=0;
                              if(pusherRetracted.getprestatus()){//sysj\controller.sysj line: 266, column: 14
                                pusherExtend.setPresent();//sysj\controller.sysj line: 268, column: 8
                                currsigs.addElement(pusherExtend);
                                active[20]=1;
                                ends[20]=1;
                                break RUN;
                              }
                              else {
                                S100551=1;
                                active[20]=1;
                                ends[20]=1;
                                break RUN;
                              }
                            }
                            else {
                              S100545=2;
                              S100732=0;
                              if(!capLoaderStatus_o.isPartnerPresent() || capLoaderStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 292, column: 5
                                capLoaderStatus_o.setREQ(false);//sysj\controller.sysj line: 292, column: 5
                                S100732=1;
                                active[20]=1;
                                ends[20]=1;
                                break RUN;
                              }
                              else {
                                S100727=0;
                                if(capLoaderStatus_o.isACK()){//sysj\controller.sysj line: 292, column: 5
                                  capLoaderStatus_o.setVal("done");//sysj\controller.sysj line: 292, column: 5
                                  S100727=1;
                                  if(!capLoaderStatus_o.isACK()){//sysj\controller.sysj line: 292, column: 5
                                    capLoaderStatus_o.setREQ(false);//sysj\controller.sysj line: 292, column: 5
                                    ends[20]=2;
                                    ;//sysj\controller.sysj line: 292, column: 5
                                    S100522=2;
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
                      S100858=1;
                      S100842=0;
                      if(!capLoaderStatus_o.isPartnerPresent() || capLoaderStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 294, column: 5
                        capLoaderStatus_o.setREQ(false);//sysj\controller.sysj line: 294, column: 5
                        S100842=1;
                        active[20]=1;
                        ends[20]=1;
                        break RUN;
                      }
                      else {
                        S100837=0;
                        if(capLoaderStatus_o.isACK()){//sysj\controller.sysj line: 294, column: 5
                          capLoaderStatus_o.setVal("idle");//sysj\controller.sysj line: 294, column: 5
                          S100837=1;
                          if(!capLoaderStatus_o.isACK()){//sysj\controller.sysj line: 294, column: 5
                            capLoaderStatus_o.setREQ(false);//sysj\controller.sysj line: 294, column: 5
                            ends[20]=2;
                            ;//sysj\controller.sysj line: 294, column: 5
                            S100522=2;
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
