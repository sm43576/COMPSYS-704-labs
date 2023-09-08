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
  private Boolean request_thread_19;//sysj\controller.sysj line: 239, column: 4
  private int S77854 = 1;
  private int S71866 = 1;
  private int S71850 = 1;
  private int S71845 = 1;
  private int S72360 = 1;
  private int S71873 = 1;
  private int S71868 = 1;
  private int S71900 = 1;
  private int S71921 = 1;
  private int S71926 = 1;
  private int S71945 = 1;
  private int S71940 = 1;
  
  private int[] ends = new int[22];
  private int[] tdone = new int[22];
  
  public void thread78026(int [] tdone, int [] ends){
        switch(S71926){
      case 0 : 
        active[21]=0;
        ends[21]=0;
        tdone[21]=1;
        break;
      
      case 1 : 
        vacOn.setPresent();//sysj\controller.sysj line: 272, column: 30
        currsigs.addElement(vacOn);
        active[21]=1;
        ends[21]=1;
        tdone[21]=1;
        break;
      
    }
  }

  public void thread78025(int [] tdone, int [] ends){
        switch(S71921){
      case 0 : 
        active[20]=0;
        ends[20]=0;
        tdone[20]=1;
        break;
      
      case 1 : 
        armDest.setPresent();//sysj\controller.sysj line: 272, column: 8
        currsigs.addElement(armDest);
        active[20]=1;
        ends[20]=1;
        tdone[20]=1;
        break;
      
    }
  }

  public void thread78023(int [] tdone, int [] ends){
        S71926=1;
    vacOn.setPresent();//sysj\controller.sysj line: 272, column: 30
    currsigs.addElement(vacOn);
    active[21]=1;
    ends[21]=1;
    tdone[21]=1;
  }

  public void thread78022(int [] tdone, int [] ends){
        S71921=1;
    armDest.setPresent();//sysj\controller.sysj line: 272, column: 8
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
      switch(S77854){
        case 0 : 
          S77854=0;
          break RUN;
        
        case 1 : 
          S77854=2;
          S77854=2;
          S71866=0;
          S71850=0;
          if(!capLoaderReq_in.isPartnerPresent() || capLoaderReq_in.isPartnerPreempted()){//sysj\controller.sysj line: 238, column: 4
            capLoaderReq_in.setACK(false);//sysj\controller.sysj line: 238, column: 4
            S71850=1;
            active[19]=1;
            ends[19]=1;
            break RUN;
          }
          else {
            S71845=0;
            if(!capLoaderReq_in.isREQ()){//sysj\controller.sysj line: 238, column: 4
              capLoaderReq_in.setACK(true);//sysj\controller.sysj line: 238, column: 4
              S71845=1;
              if(capLoaderReq_in.isREQ()){//sysj\controller.sysj line: 238, column: 4
                capLoaderReq_in.setACK(false);//sysj\controller.sysj line: 238, column: 4
                ends[19]=2;
                ;//sysj\controller.sysj line: 238, column: 4
                request_thread_19 = (capLoaderReq_in.getVal() == null ? null : ((Boolean)capLoaderReq_in.getVal()));//sysj\controller.sysj line: 239, column: 4
                S71866=1;
                if(request_thread_19){//sysj\controller.sysj line: 240, column: 4
                  S72360=0;
                  if(!bottleAtPos3.getprestatus()){//sysj\controller.sysj line: 242, column: 14
                    S71873=0;
                    if(!capLoaderStatus_o.isPartnerPresent() || capLoaderStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 243, column: 6
                      capLoaderStatus_o.setREQ(false);//sysj\controller.sysj line: 243, column: 6
                      S71873=1;
                      active[19]=1;
                      ends[19]=1;
                      break RUN;
                    }
                    else {
                      S71868=0;
                      if(capLoaderStatus_o.isACK()){//sysj\controller.sysj line: 243, column: 6
                        capLoaderStatus_o.setVal("idle");//sysj\controller.sysj line: 243, column: 6
                        S71868=1;
                        if(!capLoaderStatus_o.isACK()){//sysj\controller.sysj line: 243, column: 6
                          capLoaderStatus_o.setREQ(false);//sysj\controller.sysj line: 243, column: 6
                          ends[19]=2;
                          ;//sysj\controller.sysj line: 243, column: 6
                          S72360=1;
                          if(bottleAtPos3.getprestatus()){//sysj\controller.sysj line: 247, column: 14
                            System.out.println("Caploader Controller - bottle is at pos 3");//sysj\controller.sysj line: 248, column: 6
                            S71900=0;
                            if(pusherRetracted.getprestatus()){//sysj\controller.sysj line: 251, column: 14
                              pusherExtend.setPresent();//sysj\controller.sysj line: 253, column: 8
                              currsigs.addElement(pusherExtend);
                              active[19]=1;
                              ends[19]=1;
                              break RUN;
                            }
                            else {
                              S71900=1;
                              active[19]=1;
                              ends[19]=1;
                              break RUN;
                            }
                          }
                          else {
                            S71866=2;
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
                    S72360=1;
                    if(bottleAtPos3.getprestatus()){//sysj\controller.sysj line: 247, column: 14
                      System.out.println("Caploader Controller - bottle is at pos 3");//sysj\controller.sysj line: 248, column: 6
                      S71900=0;
                      if(pusherRetracted.getprestatus()){//sysj\controller.sysj line: 251, column: 14
                        pusherExtend.setPresent();//sysj\controller.sysj line: 253, column: 8
                        currsigs.addElement(pusherExtend);
                        active[19]=1;
                        ends[19]=1;
                        break RUN;
                      }
                      else {
                        S71900=1;
                        active[19]=1;
                        ends[19]=1;
                        break RUN;
                      }
                    }
                    else {
                      S71866=2;
                      active[19]=1;
                      ends[19]=1;
                      break RUN;
                    }
                  }
                }
                else {
                  S71866=2;
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
          switch(S71866){
            case 0 : 
              switch(S71850){
                case 0 : 
                  if(!capLoaderReq_in.isPartnerPresent() || capLoaderReq_in.isPartnerPreempted()){//sysj\controller.sysj line: 238, column: 4
                    capLoaderReq_in.setACK(false);//sysj\controller.sysj line: 238, column: 4
                    S71850=1;
                    active[19]=1;
                    ends[19]=1;
                    break RUN;
                  }
                  else {
                    switch(S71845){
                      case 0 : 
                        if(!capLoaderReq_in.isREQ()){//sysj\controller.sysj line: 238, column: 4
                          capLoaderReq_in.setACK(true);//sysj\controller.sysj line: 238, column: 4
                          S71845=1;
                          if(capLoaderReq_in.isREQ()){//sysj\controller.sysj line: 238, column: 4
                            capLoaderReq_in.setACK(false);//sysj\controller.sysj line: 238, column: 4
                            ends[19]=2;
                            ;//sysj\controller.sysj line: 238, column: 4
                            request_thread_19 = (capLoaderReq_in.getVal() == null ? null : ((Boolean)capLoaderReq_in.getVal()));//sysj\controller.sysj line: 239, column: 4
                            S71866=1;
                            if(request_thread_19){//sysj\controller.sysj line: 240, column: 4
                              S72360=0;
                              if(!bottleAtPos3.getprestatus()){//sysj\controller.sysj line: 242, column: 14
                                S71873=0;
                                if(!capLoaderStatus_o.isPartnerPresent() || capLoaderStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 243, column: 6
                                  capLoaderStatus_o.setREQ(false);//sysj\controller.sysj line: 243, column: 6
                                  S71873=1;
                                  active[19]=1;
                                  ends[19]=1;
                                  break RUN;
                                }
                                else {
                                  S71868=0;
                                  if(capLoaderStatus_o.isACK()){//sysj\controller.sysj line: 243, column: 6
                                    capLoaderStatus_o.setVal("idle");//sysj\controller.sysj line: 243, column: 6
                                    S71868=1;
                                    if(!capLoaderStatus_o.isACK()){//sysj\controller.sysj line: 243, column: 6
                                      capLoaderStatus_o.setREQ(false);//sysj\controller.sysj line: 243, column: 6
                                      ends[19]=2;
                                      ;//sysj\controller.sysj line: 243, column: 6
                                      S72360=1;
                                      if(bottleAtPos3.getprestatus()){//sysj\controller.sysj line: 247, column: 14
                                        System.out.println("Caploader Controller - bottle is at pos 3");//sysj\controller.sysj line: 248, column: 6
                                        S71900=0;
                                        if(pusherRetracted.getprestatus()){//sysj\controller.sysj line: 251, column: 14
                                          pusherExtend.setPresent();//sysj\controller.sysj line: 253, column: 8
                                          currsigs.addElement(pusherExtend);
                                          active[19]=1;
                                          ends[19]=1;
                                          break RUN;
                                        }
                                        else {
                                          S71900=1;
                                          active[19]=1;
                                          ends[19]=1;
                                          break RUN;
                                        }
                                      }
                                      else {
                                        S71866=2;
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
                                S72360=1;
                                if(bottleAtPos3.getprestatus()){//sysj\controller.sysj line: 247, column: 14
                                  System.out.println("Caploader Controller - bottle is at pos 3");//sysj\controller.sysj line: 248, column: 6
                                  S71900=0;
                                  if(pusherRetracted.getprestatus()){//sysj\controller.sysj line: 251, column: 14
                                    pusherExtend.setPresent();//sysj\controller.sysj line: 253, column: 8
                                    currsigs.addElement(pusherExtend);
                                    active[19]=1;
                                    ends[19]=1;
                                    break RUN;
                                  }
                                  else {
                                    S71900=1;
                                    active[19]=1;
                                    ends[19]=1;
                                    break RUN;
                                  }
                                }
                                else {
                                  S71866=2;
                                  active[19]=1;
                                  ends[19]=1;
                                  break RUN;
                                }
                              }
                            }
                            else {
                              S71866=2;
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
                        if(capLoaderReq_in.isREQ()){//sysj\controller.sysj line: 238, column: 4
                          capLoaderReq_in.setACK(false);//sysj\controller.sysj line: 238, column: 4
                          ends[19]=2;
                          ;//sysj\controller.sysj line: 238, column: 4
                          request_thread_19 = (capLoaderReq_in.getVal() == null ? null : ((Boolean)capLoaderReq_in.getVal()));//sysj\controller.sysj line: 239, column: 4
                          S71866=1;
                          if(request_thread_19){//sysj\controller.sysj line: 240, column: 4
                            S72360=0;
                            if(!bottleAtPos3.getprestatus()){//sysj\controller.sysj line: 242, column: 14
                              S71873=0;
                              if(!capLoaderStatus_o.isPartnerPresent() || capLoaderStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 243, column: 6
                                capLoaderStatus_o.setREQ(false);//sysj\controller.sysj line: 243, column: 6
                                S71873=1;
                                active[19]=1;
                                ends[19]=1;
                                break RUN;
                              }
                              else {
                                S71868=0;
                                if(capLoaderStatus_o.isACK()){//sysj\controller.sysj line: 243, column: 6
                                  capLoaderStatus_o.setVal("idle");//sysj\controller.sysj line: 243, column: 6
                                  S71868=1;
                                  if(!capLoaderStatus_o.isACK()){//sysj\controller.sysj line: 243, column: 6
                                    capLoaderStatus_o.setREQ(false);//sysj\controller.sysj line: 243, column: 6
                                    ends[19]=2;
                                    ;//sysj\controller.sysj line: 243, column: 6
                                    S72360=1;
                                    if(bottleAtPos3.getprestatus()){//sysj\controller.sysj line: 247, column: 14
                                      System.out.println("Caploader Controller - bottle is at pos 3");//sysj\controller.sysj line: 248, column: 6
                                      S71900=0;
                                      if(pusherRetracted.getprestatus()){//sysj\controller.sysj line: 251, column: 14
                                        pusherExtend.setPresent();//sysj\controller.sysj line: 253, column: 8
                                        currsigs.addElement(pusherExtend);
                                        active[19]=1;
                                        ends[19]=1;
                                        break RUN;
                                      }
                                      else {
                                        S71900=1;
                                        active[19]=1;
                                        ends[19]=1;
                                        break RUN;
                                      }
                                    }
                                    else {
                                      S71866=2;
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
                              S72360=1;
                              if(bottleAtPos3.getprestatus()){//sysj\controller.sysj line: 247, column: 14
                                System.out.println("Caploader Controller - bottle is at pos 3");//sysj\controller.sysj line: 248, column: 6
                                S71900=0;
                                if(pusherRetracted.getprestatus()){//sysj\controller.sysj line: 251, column: 14
                                  pusherExtend.setPresent();//sysj\controller.sysj line: 253, column: 8
                                  currsigs.addElement(pusherExtend);
                                  active[19]=1;
                                  ends[19]=1;
                                  break RUN;
                                }
                                else {
                                  S71900=1;
                                  active[19]=1;
                                  ends[19]=1;
                                  break RUN;
                                }
                              }
                              else {
                                S71866=2;
                                active[19]=1;
                                ends[19]=1;
                                break RUN;
                              }
                            }
                          }
                          else {
                            S71866=2;
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
                  S71850=1;
                  S71850=0;
                  if(!capLoaderReq_in.isPartnerPresent() || capLoaderReq_in.isPartnerPreempted()){//sysj\controller.sysj line: 238, column: 4
                    capLoaderReq_in.setACK(false);//sysj\controller.sysj line: 238, column: 4
                    S71850=1;
                    active[19]=1;
                    ends[19]=1;
                    break RUN;
                  }
                  else {
                    S71845=0;
                    if(!capLoaderReq_in.isREQ()){//sysj\controller.sysj line: 238, column: 4
                      capLoaderReq_in.setACK(true);//sysj\controller.sysj line: 238, column: 4
                      S71845=1;
                      if(capLoaderReq_in.isREQ()){//sysj\controller.sysj line: 238, column: 4
                        capLoaderReq_in.setACK(false);//sysj\controller.sysj line: 238, column: 4
                        ends[19]=2;
                        ;//sysj\controller.sysj line: 238, column: 4
                        request_thread_19 = (capLoaderReq_in.getVal() == null ? null : ((Boolean)capLoaderReq_in.getVal()));//sysj\controller.sysj line: 239, column: 4
                        S71866=1;
                        if(request_thread_19){//sysj\controller.sysj line: 240, column: 4
                          S72360=0;
                          if(!bottleAtPos3.getprestatus()){//sysj\controller.sysj line: 242, column: 14
                            S71873=0;
                            if(!capLoaderStatus_o.isPartnerPresent() || capLoaderStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 243, column: 6
                              capLoaderStatus_o.setREQ(false);//sysj\controller.sysj line: 243, column: 6
                              S71873=1;
                              active[19]=1;
                              ends[19]=1;
                              break RUN;
                            }
                            else {
                              S71868=0;
                              if(capLoaderStatus_o.isACK()){//sysj\controller.sysj line: 243, column: 6
                                capLoaderStatus_o.setVal("idle");//sysj\controller.sysj line: 243, column: 6
                                S71868=1;
                                if(!capLoaderStatus_o.isACK()){//sysj\controller.sysj line: 243, column: 6
                                  capLoaderStatus_o.setREQ(false);//sysj\controller.sysj line: 243, column: 6
                                  ends[19]=2;
                                  ;//sysj\controller.sysj line: 243, column: 6
                                  S72360=1;
                                  if(bottleAtPos3.getprestatus()){//sysj\controller.sysj line: 247, column: 14
                                    System.out.println("Caploader Controller - bottle is at pos 3");//sysj\controller.sysj line: 248, column: 6
                                    S71900=0;
                                    if(pusherRetracted.getprestatus()){//sysj\controller.sysj line: 251, column: 14
                                      pusherExtend.setPresent();//sysj\controller.sysj line: 253, column: 8
                                      currsigs.addElement(pusherExtend);
                                      active[19]=1;
                                      ends[19]=1;
                                      break RUN;
                                    }
                                    else {
                                      S71900=1;
                                      active[19]=1;
                                      ends[19]=1;
                                      break RUN;
                                    }
                                  }
                                  else {
                                    S71866=2;
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
                            S72360=1;
                            if(bottleAtPos3.getprestatus()){//sysj\controller.sysj line: 247, column: 14
                              System.out.println("Caploader Controller - bottle is at pos 3");//sysj\controller.sysj line: 248, column: 6
                              S71900=0;
                              if(pusherRetracted.getprestatus()){//sysj\controller.sysj line: 251, column: 14
                                pusherExtend.setPresent();//sysj\controller.sysj line: 253, column: 8
                                currsigs.addElement(pusherExtend);
                                active[19]=1;
                                ends[19]=1;
                                break RUN;
                              }
                              else {
                                S71900=1;
                                active[19]=1;
                                ends[19]=1;
                                break RUN;
                              }
                            }
                            else {
                              S71866=2;
                              active[19]=1;
                              ends[19]=1;
                              break RUN;
                            }
                          }
                        }
                        else {
                          S71866=2;
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
              switch(S72360){
                case 0 : 
                  switch(S71873){
                    case 0 : 
                      if(!capLoaderStatus_o.isPartnerPresent() || capLoaderStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 243, column: 6
                        capLoaderStatus_o.setREQ(false);//sysj\controller.sysj line: 243, column: 6
                        S71873=1;
                        active[19]=1;
                        ends[19]=1;
                        break RUN;
                      }
                      else {
                        switch(S71868){
                          case 0 : 
                            if(capLoaderStatus_o.isACK()){//sysj\controller.sysj line: 243, column: 6
                              capLoaderStatus_o.setVal("idle");//sysj\controller.sysj line: 243, column: 6
                              S71868=1;
                              if(!capLoaderStatus_o.isACK()){//sysj\controller.sysj line: 243, column: 6
                                capLoaderStatus_o.setREQ(false);//sysj\controller.sysj line: 243, column: 6
                                ends[19]=2;
                                ;//sysj\controller.sysj line: 243, column: 6
                                S72360=1;
                                if(bottleAtPos3.getprestatus()){//sysj\controller.sysj line: 247, column: 14
                                  System.out.println("Caploader Controller - bottle is at pos 3");//sysj\controller.sysj line: 248, column: 6
                                  S71900=0;
                                  if(pusherRetracted.getprestatus()){//sysj\controller.sysj line: 251, column: 14
                                    pusherExtend.setPresent();//sysj\controller.sysj line: 253, column: 8
                                    currsigs.addElement(pusherExtend);
                                    active[19]=1;
                                    ends[19]=1;
                                    break RUN;
                                  }
                                  else {
                                    S71900=1;
                                    active[19]=1;
                                    ends[19]=1;
                                    break RUN;
                                  }
                                }
                                else {
                                  S71866=2;
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
                            if(!capLoaderStatus_o.isACK()){//sysj\controller.sysj line: 243, column: 6
                              capLoaderStatus_o.setREQ(false);//sysj\controller.sysj line: 243, column: 6
                              ends[19]=2;
                              ;//sysj\controller.sysj line: 243, column: 6
                              S72360=1;
                              if(bottleAtPos3.getprestatus()){//sysj\controller.sysj line: 247, column: 14
                                System.out.println("Caploader Controller - bottle is at pos 3");//sysj\controller.sysj line: 248, column: 6
                                S71900=0;
                                if(pusherRetracted.getprestatus()){//sysj\controller.sysj line: 251, column: 14
                                  pusherExtend.setPresent();//sysj\controller.sysj line: 253, column: 8
                                  currsigs.addElement(pusherExtend);
                                  active[19]=1;
                                  ends[19]=1;
                                  break RUN;
                                }
                                else {
                                  S71900=1;
                                  active[19]=1;
                                  ends[19]=1;
                                  break RUN;
                                }
                              }
                              else {
                                S71866=2;
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
                      S71873=1;
                      S71873=0;
                      if(!capLoaderStatus_o.isPartnerPresent() || capLoaderStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 243, column: 6
                        capLoaderStatus_o.setREQ(false);//sysj\controller.sysj line: 243, column: 6
                        S71873=1;
                        active[19]=1;
                        ends[19]=1;
                        break RUN;
                      }
                      else {
                        S71868=0;
                        if(capLoaderStatus_o.isACK()){//sysj\controller.sysj line: 243, column: 6
                          capLoaderStatus_o.setVal("idle");//sysj\controller.sysj line: 243, column: 6
                          S71868=1;
                          if(!capLoaderStatus_o.isACK()){//sysj\controller.sysj line: 243, column: 6
                            capLoaderStatus_o.setREQ(false);//sysj\controller.sysj line: 243, column: 6
                            ends[19]=2;
                            ;//sysj\controller.sysj line: 243, column: 6
                            S72360=1;
                            if(bottleAtPos3.getprestatus()){//sysj\controller.sysj line: 247, column: 14
                              System.out.println("Caploader Controller - bottle is at pos 3");//sysj\controller.sysj line: 248, column: 6
                              S71900=0;
                              if(pusherRetracted.getprestatus()){//sysj\controller.sysj line: 251, column: 14
                                pusherExtend.setPresent();//sysj\controller.sysj line: 253, column: 8
                                currsigs.addElement(pusherExtend);
                                active[19]=1;
                                ends[19]=1;
                                break RUN;
                              }
                              else {
                                S71900=1;
                                active[19]=1;
                                ends[19]=1;
                                break RUN;
                              }
                            }
                            else {
                              S71866=2;
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
                  switch(S71900){
                    case 0 : 
                      if(pusherExtended.getprestatus()){//sysj\controller.sysj line: 252, column: 13
                        S71900=1;
                        active[19]=1;
                        ends[19]=1;
                        break RUN;
                      }
                      else {
                        pusherExtend.setPresent();//sysj\controller.sysj line: 253, column: 8
                        currsigs.addElement(pusherExtend);
                        active[19]=1;
                        ends[19]=1;
                        break RUN;
                      }
                    
                    case 1 : 
                      S71900=1;
                      S71900=2;
                      armSource.setPresent();//sysj\controller.sysj line: 260, column: 7
                      currsigs.addElement(armSource);
                      active[19]=1;
                      ends[19]=1;
                      break RUN;
                    
                    case 2 : 
                      if(armAtSource.getprestatus()){//sysj\controller.sysj line: 259, column: 12
                        S71900=3;
                        active[19]=1;
                        ends[19]=1;
                        break RUN;
                      }
                      else {
                        armSource.setPresent();//sysj\controller.sysj line: 260, column: 7
                        currsigs.addElement(armSource);
                        active[19]=1;
                        ends[19]=1;
                        break RUN;
                      }
                    
                    case 3 : 
                      S71900=3;
                      S71900=4;
                      vacOn.setPresent();//sysj\controller.sysj line: 266, column: 7
                      currsigs.addElement(vacOn);
                      active[19]=1;
                      ends[19]=1;
                      break RUN;
                    
                    case 4 : 
                      if(WPgripped.getprestatus()){//sysj\controller.sysj line: 265, column: 12
                        S71900=5;
                        active[19]=1;
                        ends[19]=1;
                        break RUN;
                      }
                      else {
                        vacOn.setPresent();//sysj\controller.sysj line: 266, column: 7
                        currsigs.addElement(vacOn);
                        active[19]=1;
                        ends[19]=1;
                        break RUN;
                      }
                    
                    case 5 : 
                      S71900=5;
                      S71900=6;
                      thread78022(tdone,ends);
                      thread78023(tdone,ends);
                      int biggest78024 = 0;
                      if(ends[20]>=biggest78024){
                        biggest78024=ends[20];
                      }
                      if(ends[21]>=biggest78024){
                        biggest78024=ends[21];
                      }
                      if(biggest78024 == 1){
                        active[19]=1;
                        ends[19]=1;
                        break RUN;
                      }
                    
                    case 6 : 
                      if(armAtDest.getprestatus()){//sysj\controller.sysj line: 271, column: 13
                        S71900=7;
                        active[19]=1;
                        ends[19]=1;
                        break RUN;
                      }
                      else {
                        thread78025(tdone,ends);
                        thread78026(tdone,ends);
                        int biggest78027 = 0;
                        if(ends[20]>=biggest78027){
                          biggest78027=ends[20];
                        }
                        if(ends[21]>=biggest78027){
                          biggest78027=ends[21];
                        }
                        if(biggest78027 == 1){
                          active[19]=1;
                          ends[19]=1;
                          break RUN;
                        }
                        //FINXME code
                        if(biggest78027 == 0){
                          S71900=7;
                          active[19]=1;
                          ends[19]=1;
                          break RUN;
                        }
                      }
                    
                    case 7 : 
                      S71900=7;
                      S71900=8;
                      S71945=0;
                      if(!capLoaderStatus_o.isPartnerPresent() || capLoaderStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 275, column: 6
                        capLoaderStatus_o.setREQ(false);//sysj\controller.sysj line: 275, column: 6
                        S71945=1;
                        active[19]=1;
                        ends[19]=1;
                        break RUN;
                      }
                      else {
                        S71940=0;
                        if(capLoaderStatus_o.isACK()){//sysj\controller.sysj line: 275, column: 6
                          capLoaderStatus_o.setVal("done");//sysj\controller.sysj line: 275, column: 6
                          S71940=1;
                          if(!capLoaderStatus_o.isACK()){//sysj\controller.sysj line: 275, column: 6
                            capLoaderStatus_o.setREQ(false);//sysj\controller.sysj line: 275, column: 6
                            ends[19]=2;
                            ;//sysj\controller.sysj line: 275, column: 6
                            S71866=2;
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
                      switch(S71945){
                        case 0 : 
                          if(!capLoaderStatus_o.isPartnerPresent() || capLoaderStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 275, column: 6
                            capLoaderStatus_o.setREQ(false);//sysj\controller.sysj line: 275, column: 6
                            S71945=1;
                            active[19]=1;
                            ends[19]=1;
                            break RUN;
                          }
                          else {
                            switch(S71940){
                              case 0 : 
                                if(capLoaderStatus_o.isACK()){//sysj\controller.sysj line: 275, column: 6
                                  capLoaderStatus_o.setVal("done");//sysj\controller.sysj line: 275, column: 6
                                  S71940=1;
                                  if(!capLoaderStatus_o.isACK()){//sysj\controller.sysj line: 275, column: 6
                                    capLoaderStatus_o.setREQ(false);//sysj\controller.sysj line: 275, column: 6
                                    ends[19]=2;
                                    ;//sysj\controller.sysj line: 275, column: 6
                                    S71866=2;
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
                                if(!capLoaderStatus_o.isACK()){//sysj\controller.sysj line: 275, column: 6
                                  capLoaderStatus_o.setREQ(false);//sysj\controller.sysj line: 275, column: 6
                                  ends[19]=2;
                                  ;//sysj\controller.sysj line: 275, column: 6
                                  S71866=2;
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
                          S71945=1;
                          S71945=0;
                          if(!capLoaderStatus_o.isPartnerPresent() || capLoaderStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 275, column: 6
                            capLoaderStatus_o.setREQ(false);//sysj\controller.sysj line: 275, column: 6
                            S71945=1;
                            active[19]=1;
                            ends[19]=1;
                            break RUN;
                          }
                          else {
                            S71940=0;
                            if(capLoaderStatus_o.isACK()){//sysj\controller.sysj line: 275, column: 6
                              capLoaderStatus_o.setVal("done");//sysj\controller.sysj line: 275, column: 6
                              S71940=1;
                              if(!capLoaderStatus_o.isACK()){//sysj\controller.sysj line: 275, column: 6
                                capLoaderStatus_o.setREQ(false);//sysj\controller.sysj line: 275, column: 6
                                ends[19]=2;
                                ;//sysj\controller.sysj line: 275, column: 6
                                S71866=2;
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
              S71866=2;
              S71866=0;
              S71850=0;
              if(!capLoaderReq_in.isPartnerPresent() || capLoaderReq_in.isPartnerPreempted()){//sysj\controller.sysj line: 238, column: 4
                capLoaderReq_in.setACK(false);//sysj\controller.sysj line: 238, column: 4
                S71850=1;
                active[19]=1;
                ends[19]=1;
                break RUN;
              }
              else {
                S71845=0;
                if(!capLoaderReq_in.isREQ()){//sysj\controller.sysj line: 238, column: 4
                  capLoaderReq_in.setACK(true);//sysj\controller.sysj line: 238, column: 4
                  S71845=1;
                  if(capLoaderReq_in.isREQ()){//sysj\controller.sysj line: 238, column: 4
                    capLoaderReq_in.setACK(false);//sysj\controller.sysj line: 238, column: 4
                    ends[19]=2;
                    ;//sysj\controller.sysj line: 238, column: 4
                    request_thread_19 = (capLoaderReq_in.getVal() == null ? null : ((Boolean)capLoaderReq_in.getVal()));//sysj\controller.sysj line: 239, column: 4
                    S71866=1;
                    if(request_thread_19){//sysj\controller.sysj line: 240, column: 4
                      S72360=0;
                      if(!bottleAtPos3.getprestatus()){//sysj\controller.sysj line: 242, column: 14
                        S71873=0;
                        if(!capLoaderStatus_o.isPartnerPresent() || capLoaderStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 243, column: 6
                          capLoaderStatus_o.setREQ(false);//sysj\controller.sysj line: 243, column: 6
                          S71873=1;
                          active[19]=1;
                          ends[19]=1;
                          break RUN;
                        }
                        else {
                          S71868=0;
                          if(capLoaderStatus_o.isACK()){//sysj\controller.sysj line: 243, column: 6
                            capLoaderStatus_o.setVal("idle");//sysj\controller.sysj line: 243, column: 6
                            S71868=1;
                            if(!capLoaderStatus_o.isACK()){//sysj\controller.sysj line: 243, column: 6
                              capLoaderStatus_o.setREQ(false);//sysj\controller.sysj line: 243, column: 6
                              ends[19]=2;
                              ;//sysj\controller.sysj line: 243, column: 6
                              S72360=1;
                              if(bottleAtPos3.getprestatus()){//sysj\controller.sysj line: 247, column: 14
                                System.out.println("Caploader Controller - bottle is at pos 3");//sysj\controller.sysj line: 248, column: 6
                                S71900=0;
                                if(pusherRetracted.getprestatus()){//sysj\controller.sysj line: 251, column: 14
                                  pusherExtend.setPresent();//sysj\controller.sysj line: 253, column: 8
                                  currsigs.addElement(pusherExtend);
                                  active[19]=1;
                                  ends[19]=1;
                                  break RUN;
                                }
                                else {
                                  S71900=1;
                                  active[19]=1;
                                  ends[19]=1;
                                  break RUN;
                                }
                              }
                              else {
                                S71866=2;
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
                        S72360=1;
                        if(bottleAtPos3.getprestatus()){//sysj\controller.sysj line: 247, column: 14
                          System.out.println("Caploader Controller - bottle is at pos 3");//sysj\controller.sysj line: 248, column: 6
                          S71900=0;
                          if(pusherRetracted.getprestatus()){//sysj\controller.sysj line: 251, column: 14
                            pusherExtend.setPresent();//sysj\controller.sysj line: 253, column: 8
                            currsigs.addElement(pusherExtend);
                            active[19]=1;
                            ends[19]=1;
                            break RUN;
                          }
                          else {
                            S71900=1;
                            active[19]=1;
                            ends[19]=1;
                            break RUN;
                          }
                        }
                        else {
                          S71866=2;
                          active[19]=1;
                          ends[19]=1;
                          break RUN;
                        }
                      }
                    }
                    else {
                      S71866=2;
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
