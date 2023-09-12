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
  public Signal magEmpty = new Signal("magEmpty", Signal.INPUT);
  public Signal pusherExtend = new Signal("pusherExtend", Signal.OUTPUT);
  public Signal vacOn = new Signal("vacOn", Signal.OUTPUT);
  public Signal armSource = new Signal("armSource", Signal.OUTPUT);
  public Signal armDest = new Signal("armDest", Signal.OUTPUT);
  public Signal magReq = new Signal("magReq", Signal.OUTPUT);
  public input_Channel capLoaderReq_in = new input_Channel();
  public output_Channel capLoaderStatus_o = new output_Channel();
  private Signal vacOff_19;
  private Boolean request_thread_19;//sysj\controller.sysj line: 233, column: 4
  private int S40463 = 1;
  private int S32975 = 1;
  private int S32959 = 1;
  private int S32954 = 1;
  private int S33594 = 1;
  private int S32982 = 1;
  private int S32977 = 1;
  private int S33019 = 1;
  private int S33044 = 1;
  private int S33055 = 1;
  private int S33054 = 1;
  private int S33079 = 1;
  private int S33074 = 1;
  
  private int[] ends = new int[22];
  private int[] tdone = new int[22];
  
  public void thread40638(int [] tdone, int [] ends){
        switch(S33055){
      case 0 : 
        active[21]=0;
        ends[21]=0;
        tdone[21]=1;
        break;
      
      case 1 : 
        switch(S33054){
          case 0 : 
            if(WPgripped.getprestatus()){//sysj\controller.sysj line: 273, column: 13
              S33054=1;
              armDest.setPresent();//sysj\controller.sysj line: 275, column: 8
              currsigs.addElement(armDest);
              active[21]=1;
              ends[21]=1;
              tdone[21]=1;
            }
            else {
              active[21]=1;
              ends[21]=1;
              tdone[21]=1;
            }
            break;
          
          case 1 : 
            if(armAtDest.getprestatus()){//sysj\controller.sysj line: 274, column: 14
              vacOff_19.setPresent();//sysj\controller.sysj line: 277, column: 7
              currsigs.addElement(vacOff_19);
              S33055=0;
              active[21]=0;
              ends[21]=0;
              tdone[21]=1;
            }
            else {
              armDest.setPresent();//sysj\controller.sysj line: 275, column: 8
              currsigs.addElement(armDest);
              active[21]=1;
              ends[21]=1;
              tdone[21]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread40637(int [] tdone, int [] ends){
        switch(S33044){
      case 0 : 
        active[20]=0;
        ends[20]=0;
        tdone[20]=1;
        break;
      
      case 1 : 
        if(vacOff_19.getprestatus()){//sysj\controller.sysj line: 267, column: 13
          S33044=0;
          active[20]=0;
          ends[20]=0;
          tdone[20]=1;
        }
        else {
          vacOn.setPresent();//sysj\controller.sysj line: 268, column: 8
          currsigs.addElement(vacOn);
          active[20]=1;
          ends[20]=1;
          tdone[20]=1;
        }
        break;
      
    }
  }

  public void thread40635(int [] tdone, int [] ends){
        S33055=1;
    S33054=0;
    active[21]=1;
    ends[21]=1;
    tdone[21]=1;
  }

  public void thread40634(int [] tdone, int [] ends){
        S33044=1;
    vacOn.setPresent();//sysj\controller.sysj line: 268, column: 8
    currsigs.addElement(vacOn);
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
      switch(S40463){
        case 0 : 
          S40463=0;
          break RUN;
        
        case 1 : 
          S40463=2;
          S40463=2;
          vacOff_19.setClear();//sysj\controller.sysj line: 230, column: 2
          S32975=0;
          S32959=0;
          if(!capLoaderReq_in.isPartnerPresent() || capLoaderReq_in.isPartnerPreempted()){//sysj\controller.sysj line: 232, column: 4
            capLoaderReq_in.setACK(false);//sysj\controller.sysj line: 232, column: 4
            S32959=1;
            active[19]=1;
            ends[19]=1;
            break RUN;
          }
          else {
            S32954=0;
            if(!capLoaderReq_in.isREQ()){//sysj\controller.sysj line: 232, column: 4
              capLoaderReq_in.setACK(true);//sysj\controller.sysj line: 232, column: 4
              S32954=1;
              if(capLoaderReq_in.isREQ()){//sysj\controller.sysj line: 232, column: 4
                capLoaderReq_in.setACK(false);//sysj\controller.sysj line: 232, column: 4
                ends[19]=2;
                ;//sysj\controller.sysj line: 232, column: 4
                request_thread_19 = (capLoaderReq_in.getVal() == null ? null : ((Boolean)capLoaderReq_in.getVal()));//sysj\controller.sysj line: 233, column: 4
                S32975=1;
                if(request_thread_19){//sysj\controller.sysj line: 234, column: 4
                  S33594=0;
                  if(!bottleAtPos3.getprestatus()){//sysj\controller.sysj line: 237, column: 14
                    S32982=0;
                    if(!capLoaderStatus_o.isPartnerPresent() || capLoaderStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 238, column: 6
                      capLoaderStatus_o.setREQ(false);//sysj\controller.sysj line: 238, column: 6
                      S32982=1;
                      active[19]=1;
                      ends[19]=1;
                      break RUN;
                    }
                    else {
                      S32977=0;
                      if(capLoaderStatus_o.isACK()){//sysj\controller.sysj line: 238, column: 6
                        capLoaderStatus_o.setVal("idle");//sysj\controller.sysj line: 238, column: 6
                        S32977=1;
                        if(!capLoaderStatus_o.isACK()){//sysj\controller.sysj line: 238, column: 6
                          capLoaderStatus_o.setREQ(false);//sysj\controller.sysj line: 238, column: 6
                          ends[19]=2;
                          ;//sysj\controller.sysj line: 238, column: 6
                          S33594=1;
                          if(bottleAtPos3.getprestatus()){//sysj\controller.sysj line: 242, column: 14
                            System.out.println("Caploader Controller - bottle is at pos 3");//sysj\controller.sysj line: 243, column: 6
                            S33019=0;
                            if(magEmpty.getprestatus()){//sysj\controller.sysj line: 247, column: 14
                              System.out.println("Mag empty");//sysj\controller.sysj line: 248, column: 7
                              magReq.setPresent();//sysj\controller.sysj line: 250, column: 8
                              currsigs.addElement(magReq);
                              active[19]=1;
                              ends[19]=1;
                              break RUN;
                            }
                            else {
                              S33019=1;
                              active[19]=1;
                              ends[19]=1;
                              break RUN;
                            }
                          }
                          else {
                            S32975=2;
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
                    S33594=1;
                    if(bottleAtPos3.getprestatus()){//sysj\controller.sysj line: 242, column: 14
                      System.out.println("Caploader Controller - bottle is at pos 3");//sysj\controller.sysj line: 243, column: 6
                      S33019=0;
                      if(magEmpty.getprestatus()){//sysj\controller.sysj line: 247, column: 14
                        System.out.println("Mag empty");//sysj\controller.sysj line: 248, column: 7
                        magReq.setPresent();//sysj\controller.sysj line: 250, column: 8
                        currsigs.addElement(magReq);
                        active[19]=1;
                        ends[19]=1;
                        break RUN;
                      }
                      else {
                        S33019=1;
                        active[19]=1;
                        ends[19]=1;
                        break RUN;
                      }
                    }
                    else {
                      S32975=2;
                      active[19]=1;
                      ends[19]=1;
                      break RUN;
                    }
                  }
                }
                else {
                  S32975=2;
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
          vacOff_19.setClear();//sysj\controller.sysj line: 230, column: 2
          switch(S32975){
            case 0 : 
              switch(S32959){
                case 0 : 
                  if(!capLoaderReq_in.isPartnerPresent() || capLoaderReq_in.isPartnerPreempted()){//sysj\controller.sysj line: 232, column: 4
                    capLoaderReq_in.setACK(false);//sysj\controller.sysj line: 232, column: 4
                    S32959=1;
                    active[19]=1;
                    ends[19]=1;
                    break RUN;
                  }
                  else {
                    switch(S32954){
                      case 0 : 
                        if(!capLoaderReq_in.isREQ()){//sysj\controller.sysj line: 232, column: 4
                          capLoaderReq_in.setACK(true);//sysj\controller.sysj line: 232, column: 4
                          S32954=1;
                          if(capLoaderReq_in.isREQ()){//sysj\controller.sysj line: 232, column: 4
                            capLoaderReq_in.setACK(false);//sysj\controller.sysj line: 232, column: 4
                            ends[19]=2;
                            ;//sysj\controller.sysj line: 232, column: 4
                            request_thread_19 = (capLoaderReq_in.getVal() == null ? null : ((Boolean)capLoaderReq_in.getVal()));//sysj\controller.sysj line: 233, column: 4
                            S32975=1;
                            if(request_thread_19){//sysj\controller.sysj line: 234, column: 4
                              S33594=0;
                              if(!bottleAtPos3.getprestatus()){//sysj\controller.sysj line: 237, column: 14
                                S32982=0;
                                if(!capLoaderStatus_o.isPartnerPresent() || capLoaderStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 238, column: 6
                                  capLoaderStatus_o.setREQ(false);//sysj\controller.sysj line: 238, column: 6
                                  S32982=1;
                                  active[19]=1;
                                  ends[19]=1;
                                  break RUN;
                                }
                                else {
                                  S32977=0;
                                  if(capLoaderStatus_o.isACK()){//sysj\controller.sysj line: 238, column: 6
                                    capLoaderStatus_o.setVal("idle");//sysj\controller.sysj line: 238, column: 6
                                    S32977=1;
                                    if(!capLoaderStatus_o.isACK()){//sysj\controller.sysj line: 238, column: 6
                                      capLoaderStatus_o.setREQ(false);//sysj\controller.sysj line: 238, column: 6
                                      ends[19]=2;
                                      ;//sysj\controller.sysj line: 238, column: 6
                                      S33594=1;
                                      if(bottleAtPos3.getprestatus()){//sysj\controller.sysj line: 242, column: 14
                                        System.out.println("Caploader Controller - bottle is at pos 3");//sysj\controller.sysj line: 243, column: 6
                                        S33019=0;
                                        if(magEmpty.getprestatus()){//sysj\controller.sysj line: 247, column: 14
                                          System.out.println("Mag empty");//sysj\controller.sysj line: 248, column: 7
                                          magReq.setPresent();//sysj\controller.sysj line: 250, column: 8
                                          currsigs.addElement(magReq);
                                          active[19]=1;
                                          ends[19]=1;
                                          break RUN;
                                        }
                                        else {
                                          S33019=1;
                                          active[19]=1;
                                          ends[19]=1;
                                          break RUN;
                                        }
                                      }
                                      else {
                                        S32975=2;
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
                                S33594=1;
                                if(bottleAtPos3.getprestatus()){//sysj\controller.sysj line: 242, column: 14
                                  System.out.println("Caploader Controller - bottle is at pos 3");//sysj\controller.sysj line: 243, column: 6
                                  S33019=0;
                                  if(magEmpty.getprestatus()){//sysj\controller.sysj line: 247, column: 14
                                    System.out.println("Mag empty");//sysj\controller.sysj line: 248, column: 7
                                    magReq.setPresent();//sysj\controller.sysj line: 250, column: 8
                                    currsigs.addElement(magReq);
                                    active[19]=1;
                                    ends[19]=1;
                                    break RUN;
                                  }
                                  else {
                                    S33019=1;
                                    active[19]=1;
                                    ends[19]=1;
                                    break RUN;
                                  }
                                }
                                else {
                                  S32975=2;
                                  active[19]=1;
                                  ends[19]=1;
                                  break RUN;
                                }
                              }
                            }
                            else {
                              S32975=2;
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
                        if(capLoaderReq_in.isREQ()){//sysj\controller.sysj line: 232, column: 4
                          capLoaderReq_in.setACK(false);//sysj\controller.sysj line: 232, column: 4
                          ends[19]=2;
                          ;//sysj\controller.sysj line: 232, column: 4
                          request_thread_19 = (capLoaderReq_in.getVal() == null ? null : ((Boolean)capLoaderReq_in.getVal()));//sysj\controller.sysj line: 233, column: 4
                          S32975=1;
                          if(request_thread_19){//sysj\controller.sysj line: 234, column: 4
                            S33594=0;
                            if(!bottleAtPos3.getprestatus()){//sysj\controller.sysj line: 237, column: 14
                              S32982=0;
                              if(!capLoaderStatus_o.isPartnerPresent() || capLoaderStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 238, column: 6
                                capLoaderStatus_o.setREQ(false);//sysj\controller.sysj line: 238, column: 6
                                S32982=1;
                                active[19]=1;
                                ends[19]=1;
                                break RUN;
                              }
                              else {
                                S32977=0;
                                if(capLoaderStatus_o.isACK()){//sysj\controller.sysj line: 238, column: 6
                                  capLoaderStatus_o.setVal("idle");//sysj\controller.sysj line: 238, column: 6
                                  S32977=1;
                                  if(!capLoaderStatus_o.isACK()){//sysj\controller.sysj line: 238, column: 6
                                    capLoaderStatus_o.setREQ(false);//sysj\controller.sysj line: 238, column: 6
                                    ends[19]=2;
                                    ;//sysj\controller.sysj line: 238, column: 6
                                    S33594=1;
                                    if(bottleAtPos3.getprestatus()){//sysj\controller.sysj line: 242, column: 14
                                      System.out.println("Caploader Controller - bottle is at pos 3");//sysj\controller.sysj line: 243, column: 6
                                      S33019=0;
                                      if(magEmpty.getprestatus()){//sysj\controller.sysj line: 247, column: 14
                                        System.out.println("Mag empty");//sysj\controller.sysj line: 248, column: 7
                                        magReq.setPresent();//sysj\controller.sysj line: 250, column: 8
                                        currsigs.addElement(magReq);
                                        active[19]=1;
                                        ends[19]=1;
                                        break RUN;
                                      }
                                      else {
                                        S33019=1;
                                        active[19]=1;
                                        ends[19]=1;
                                        break RUN;
                                      }
                                    }
                                    else {
                                      S32975=2;
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
                              S33594=1;
                              if(bottleAtPos3.getprestatus()){//sysj\controller.sysj line: 242, column: 14
                                System.out.println("Caploader Controller - bottle is at pos 3");//sysj\controller.sysj line: 243, column: 6
                                S33019=0;
                                if(magEmpty.getprestatus()){//sysj\controller.sysj line: 247, column: 14
                                  System.out.println("Mag empty");//sysj\controller.sysj line: 248, column: 7
                                  magReq.setPresent();//sysj\controller.sysj line: 250, column: 8
                                  currsigs.addElement(magReq);
                                  active[19]=1;
                                  ends[19]=1;
                                  break RUN;
                                }
                                else {
                                  S33019=1;
                                  active[19]=1;
                                  ends[19]=1;
                                  break RUN;
                                }
                              }
                              else {
                                S32975=2;
                                active[19]=1;
                                ends[19]=1;
                                break RUN;
                              }
                            }
                          }
                          else {
                            S32975=2;
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
                  S32959=1;
                  S32959=0;
                  if(!capLoaderReq_in.isPartnerPresent() || capLoaderReq_in.isPartnerPreempted()){//sysj\controller.sysj line: 232, column: 4
                    capLoaderReq_in.setACK(false);//sysj\controller.sysj line: 232, column: 4
                    S32959=1;
                    active[19]=1;
                    ends[19]=1;
                    break RUN;
                  }
                  else {
                    S32954=0;
                    if(!capLoaderReq_in.isREQ()){//sysj\controller.sysj line: 232, column: 4
                      capLoaderReq_in.setACK(true);//sysj\controller.sysj line: 232, column: 4
                      S32954=1;
                      if(capLoaderReq_in.isREQ()){//sysj\controller.sysj line: 232, column: 4
                        capLoaderReq_in.setACK(false);//sysj\controller.sysj line: 232, column: 4
                        ends[19]=2;
                        ;//sysj\controller.sysj line: 232, column: 4
                        request_thread_19 = (capLoaderReq_in.getVal() == null ? null : ((Boolean)capLoaderReq_in.getVal()));//sysj\controller.sysj line: 233, column: 4
                        S32975=1;
                        if(request_thread_19){//sysj\controller.sysj line: 234, column: 4
                          S33594=0;
                          if(!bottleAtPos3.getprestatus()){//sysj\controller.sysj line: 237, column: 14
                            S32982=0;
                            if(!capLoaderStatus_o.isPartnerPresent() || capLoaderStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 238, column: 6
                              capLoaderStatus_o.setREQ(false);//sysj\controller.sysj line: 238, column: 6
                              S32982=1;
                              active[19]=1;
                              ends[19]=1;
                              break RUN;
                            }
                            else {
                              S32977=0;
                              if(capLoaderStatus_o.isACK()){//sysj\controller.sysj line: 238, column: 6
                                capLoaderStatus_o.setVal("idle");//sysj\controller.sysj line: 238, column: 6
                                S32977=1;
                                if(!capLoaderStatus_o.isACK()){//sysj\controller.sysj line: 238, column: 6
                                  capLoaderStatus_o.setREQ(false);//sysj\controller.sysj line: 238, column: 6
                                  ends[19]=2;
                                  ;//sysj\controller.sysj line: 238, column: 6
                                  S33594=1;
                                  if(bottleAtPos3.getprestatus()){//sysj\controller.sysj line: 242, column: 14
                                    System.out.println("Caploader Controller - bottle is at pos 3");//sysj\controller.sysj line: 243, column: 6
                                    S33019=0;
                                    if(magEmpty.getprestatus()){//sysj\controller.sysj line: 247, column: 14
                                      System.out.println("Mag empty");//sysj\controller.sysj line: 248, column: 7
                                      magReq.setPresent();//sysj\controller.sysj line: 250, column: 8
                                      currsigs.addElement(magReq);
                                      active[19]=1;
                                      ends[19]=1;
                                      break RUN;
                                    }
                                    else {
                                      S33019=1;
                                      active[19]=1;
                                      ends[19]=1;
                                      break RUN;
                                    }
                                  }
                                  else {
                                    S32975=2;
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
                            S33594=1;
                            if(bottleAtPos3.getprestatus()){//sysj\controller.sysj line: 242, column: 14
                              System.out.println("Caploader Controller - bottle is at pos 3");//sysj\controller.sysj line: 243, column: 6
                              S33019=0;
                              if(magEmpty.getprestatus()){//sysj\controller.sysj line: 247, column: 14
                                System.out.println("Mag empty");//sysj\controller.sysj line: 248, column: 7
                                magReq.setPresent();//sysj\controller.sysj line: 250, column: 8
                                currsigs.addElement(magReq);
                                active[19]=1;
                                ends[19]=1;
                                break RUN;
                              }
                              else {
                                S33019=1;
                                active[19]=1;
                                ends[19]=1;
                                break RUN;
                              }
                            }
                            else {
                              S32975=2;
                              active[19]=1;
                              ends[19]=1;
                              break RUN;
                            }
                          }
                        }
                        else {
                          S32975=2;
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
              switch(S33594){
                case 0 : 
                  switch(S32982){
                    case 0 : 
                      if(!capLoaderStatus_o.isPartnerPresent() || capLoaderStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 238, column: 6
                        capLoaderStatus_o.setREQ(false);//sysj\controller.sysj line: 238, column: 6
                        S32982=1;
                        active[19]=1;
                        ends[19]=1;
                        break RUN;
                      }
                      else {
                        switch(S32977){
                          case 0 : 
                            if(capLoaderStatus_o.isACK()){//sysj\controller.sysj line: 238, column: 6
                              capLoaderStatus_o.setVal("idle");//sysj\controller.sysj line: 238, column: 6
                              S32977=1;
                              if(!capLoaderStatus_o.isACK()){//sysj\controller.sysj line: 238, column: 6
                                capLoaderStatus_o.setREQ(false);//sysj\controller.sysj line: 238, column: 6
                                ends[19]=2;
                                ;//sysj\controller.sysj line: 238, column: 6
                                S33594=1;
                                if(bottleAtPos3.getprestatus()){//sysj\controller.sysj line: 242, column: 14
                                  System.out.println("Caploader Controller - bottle is at pos 3");//sysj\controller.sysj line: 243, column: 6
                                  S33019=0;
                                  if(magEmpty.getprestatus()){//sysj\controller.sysj line: 247, column: 14
                                    System.out.println("Mag empty");//sysj\controller.sysj line: 248, column: 7
                                    magReq.setPresent();//sysj\controller.sysj line: 250, column: 8
                                    currsigs.addElement(magReq);
                                    active[19]=1;
                                    ends[19]=1;
                                    break RUN;
                                  }
                                  else {
                                    S33019=1;
                                    active[19]=1;
                                    ends[19]=1;
                                    break RUN;
                                  }
                                }
                                else {
                                  S32975=2;
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
                            if(!capLoaderStatus_o.isACK()){//sysj\controller.sysj line: 238, column: 6
                              capLoaderStatus_o.setREQ(false);//sysj\controller.sysj line: 238, column: 6
                              ends[19]=2;
                              ;//sysj\controller.sysj line: 238, column: 6
                              S33594=1;
                              if(bottleAtPos3.getprestatus()){//sysj\controller.sysj line: 242, column: 14
                                System.out.println("Caploader Controller - bottle is at pos 3");//sysj\controller.sysj line: 243, column: 6
                                S33019=0;
                                if(magEmpty.getprestatus()){//sysj\controller.sysj line: 247, column: 14
                                  System.out.println("Mag empty");//sysj\controller.sysj line: 248, column: 7
                                  magReq.setPresent();//sysj\controller.sysj line: 250, column: 8
                                  currsigs.addElement(magReq);
                                  active[19]=1;
                                  ends[19]=1;
                                  break RUN;
                                }
                                else {
                                  S33019=1;
                                  active[19]=1;
                                  ends[19]=1;
                                  break RUN;
                                }
                              }
                              else {
                                S32975=2;
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
                      S32982=1;
                      S32982=0;
                      if(!capLoaderStatus_o.isPartnerPresent() || capLoaderStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 238, column: 6
                        capLoaderStatus_o.setREQ(false);//sysj\controller.sysj line: 238, column: 6
                        S32982=1;
                        active[19]=1;
                        ends[19]=1;
                        break RUN;
                      }
                      else {
                        S32977=0;
                        if(capLoaderStatus_o.isACK()){//sysj\controller.sysj line: 238, column: 6
                          capLoaderStatus_o.setVal("idle");//sysj\controller.sysj line: 238, column: 6
                          S32977=1;
                          if(!capLoaderStatus_o.isACK()){//sysj\controller.sysj line: 238, column: 6
                            capLoaderStatus_o.setREQ(false);//sysj\controller.sysj line: 238, column: 6
                            ends[19]=2;
                            ;//sysj\controller.sysj line: 238, column: 6
                            S33594=1;
                            if(bottleAtPos3.getprestatus()){//sysj\controller.sysj line: 242, column: 14
                              System.out.println("Caploader Controller - bottle is at pos 3");//sysj\controller.sysj line: 243, column: 6
                              S33019=0;
                              if(magEmpty.getprestatus()){//sysj\controller.sysj line: 247, column: 14
                                System.out.println("Mag empty");//sysj\controller.sysj line: 248, column: 7
                                magReq.setPresent();//sysj\controller.sysj line: 250, column: 8
                                currsigs.addElement(magReq);
                                active[19]=1;
                                ends[19]=1;
                                break RUN;
                              }
                              else {
                                S33019=1;
                                active[19]=1;
                                ends[19]=1;
                                break RUN;
                              }
                            }
                            else {
                              S32975=2;
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
                  switch(S33019){
                    case 0 : 
                      if(!magEmpty.getprestatus()){//sysj\controller.sysj line: 249, column: 13
                        S33019=1;
                        active[19]=1;
                        ends[19]=1;
                        break RUN;
                      }
                      else {
                        magReq.setPresent();//sysj\controller.sysj line: 250, column: 8
                        currsigs.addElement(magReq);
                        active[19]=1;
                        ends[19]=1;
                        break RUN;
                      }
                    
                    case 1 : 
                      if(pusherRetracted.getprestatus()){//sysj\controller.sysj line: 254, column: 12
                        S33019=2;
                        pusherExtend.setPresent();//sysj\controller.sysj line: 256, column: 7
                        currsigs.addElement(pusherExtend);
                        active[19]=1;
                        ends[19]=1;
                        break RUN;
                      }
                      else {
                        active[19]=1;
                        ends[19]=1;
                        break RUN;
                      }
                    
                    case 2 : 
                      if(pusherExtended.getprestatus()){//sysj\controller.sysj line: 255, column: 12
                        System.out.println("pusher ok");//sysj\controller.sysj line: 259, column: 6
                        S33019=3;
                        armSource.setPresent();//sysj\controller.sysj line: 263, column: 7
                        currsigs.addElement(armSource);
                        active[19]=1;
                        ends[19]=1;
                        break RUN;
                      }
                      else {
                        pusherExtend.setPresent();//sysj\controller.sysj line: 256, column: 7
                        currsigs.addElement(pusherExtend);
                        active[19]=1;
                        ends[19]=1;
                        break RUN;
                      }
                    
                    case 3 : 
                      if(armAtSource.getprestatus()){//sysj\controller.sysj line: 262, column: 12
                        S33019=4;
                        thread40634(tdone,ends);
                        thread40635(tdone,ends);
                        int biggest40636 = 0;
                        if(ends[20]>=biggest40636){
                          biggest40636=ends[20];
                        }
                        if(ends[21]>=biggest40636){
                          biggest40636=ends[21];
                        }
                        if(biggest40636 == 1){
                          active[19]=1;
                          ends[19]=1;
                          break RUN;
                        }
                      }
                      else {
                        armSource.setPresent();//sysj\controller.sysj line: 263, column: 7
                        currsigs.addElement(armSource);
                        active[19]=1;
                        ends[19]=1;
                        break RUN;
                      }
                    
                    case 4 : 
                      thread40637(tdone,ends);
                      thread40638(tdone,ends);
                      int biggest40639 = 0;
                      if(ends[20]>=biggest40639){
                        biggest40639=ends[20];
                      }
                      if(ends[21]>=biggest40639){
                        biggest40639=ends[21];
                      }
                      if(biggest40639 == 1){
                        active[19]=1;
                        ends[19]=1;
                        break RUN;
                      }
                      //FINXME code
                      if(biggest40639 == 0){
                        S33019=5;
                        S33079=0;
                        if(!capLoaderStatus_o.isPartnerPresent() || capLoaderStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 279, column: 6
                          capLoaderStatus_o.setREQ(false);//sysj\controller.sysj line: 279, column: 6
                          S33079=1;
                          active[19]=1;
                          ends[19]=1;
                          break RUN;
                        }
                        else {
                          S33074=0;
                          if(capLoaderStatus_o.isACK()){//sysj\controller.sysj line: 279, column: 6
                            capLoaderStatus_o.setVal("done");//sysj\controller.sysj line: 279, column: 6
                            S33074=1;
                            if(!capLoaderStatus_o.isACK()){//sysj\controller.sysj line: 279, column: 6
                              capLoaderStatus_o.setREQ(false);//sysj\controller.sysj line: 279, column: 6
                              ends[19]=2;
                              ;//sysj\controller.sysj line: 279, column: 6
                              S32975=2;
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
                    
                    case 5 : 
                      switch(S33079){
                        case 0 : 
                          if(!capLoaderStatus_o.isPartnerPresent() || capLoaderStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 279, column: 6
                            capLoaderStatus_o.setREQ(false);//sysj\controller.sysj line: 279, column: 6
                            S33079=1;
                            active[19]=1;
                            ends[19]=1;
                            break RUN;
                          }
                          else {
                            switch(S33074){
                              case 0 : 
                                if(capLoaderStatus_o.isACK()){//sysj\controller.sysj line: 279, column: 6
                                  capLoaderStatus_o.setVal("done");//sysj\controller.sysj line: 279, column: 6
                                  S33074=1;
                                  if(!capLoaderStatus_o.isACK()){//sysj\controller.sysj line: 279, column: 6
                                    capLoaderStatus_o.setREQ(false);//sysj\controller.sysj line: 279, column: 6
                                    ends[19]=2;
                                    ;//sysj\controller.sysj line: 279, column: 6
                                    S32975=2;
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
                                if(!capLoaderStatus_o.isACK()){//sysj\controller.sysj line: 279, column: 6
                                  capLoaderStatus_o.setREQ(false);//sysj\controller.sysj line: 279, column: 6
                                  ends[19]=2;
                                  ;//sysj\controller.sysj line: 279, column: 6
                                  S32975=2;
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
                          S33079=1;
                          S33079=0;
                          if(!capLoaderStatus_o.isPartnerPresent() || capLoaderStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 279, column: 6
                            capLoaderStatus_o.setREQ(false);//sysj\controller.sysj line: 279, column: 6
                            S33079=1;
                            active[19]=1;
                            ends[19]=1;
                            break RUN;
                          }
                          else {
                            S33074=0;
                            if(capLoaderStatus_o.isACK()){//sysj\controller.sysj line: 279, column: 6
                              capLoaderStatus_o.setVal("done");//sysj\controller.sysj line: 279, column: 6
                              S33074=1;
                              if(!capLoaderStatus_o.isACK()){//sysj\controller.sysj line: 279, column: 6
                                capLoaderStatus_o.setREQ(false);//sysj\controller.sysj line: 279, column: 6
                                ends[19]=2;
                                ;//sysj\controller.sysj line: 279, column: 6
                                S32975=2;
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
              S32975=2;
              S32975=0;
              S32959=0;
              if(!capLoaderReq_in.isPartnerPresent() || capLoaderReq_in.isPartnerPreempted()){//sysj\controller.sysj line: 232, column: 4
                capLoaderReq_in.setACK(false);//sysj\controller.sysj line: 232, column: 4
                S32959=1;
                active[19]=1;
                ends[19]=1;
                break RUN;
              }
              else {
                S32954=0;
                if(!capLoaderReq_in.isREQ()){//sysj\controller.sysj line: 232, column: 4
                  capLoaderReq_in.setACK(true);//sysj\controller.sysj line: 232, column: 4
                  S32954=1;
                  if(capLoaderReq_in.isREQ()){//sysj\controller.sysj line: 232, column: 4
                    capLoaderReq_in.setACK(false);//sysj\controller.sysj line: 232, column: 4
                    ends[19]=2;
                    ;//sysj\controller.sysj line: 232, column: 4
                    request_thread_19 = (capLoaderReq_in.getVal() == null ? null : ((Boolean)capLoaderReq_in.getVal()));//sysj\controller.sysj line: 233, column: 4
                    S32975=1;
                    if(request_thread_19){//sysj\controller.sysj line: 234, column: 4
                      S33594=0;
                      if(!bottleAtPos3.getprestatus()){//sysj\controller.sysj line: 237, column: 14
                        S32982=0;
                        if(!capLoaderStatus_o.isPartnerPresent() || capLoaderStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 238, column: 6
                          capLoaderStatus_o.setREQ(false);//sysj\controller.sysj line: 238, column: 6
                          S32982=1;
                          active[19]=1;
                          ends[19]=1;
                          break RUN;
                        }
                        else {
                          S32977=0;
                          if(capLoaderStatus_o.isACK()){//sysj\controller.sysj line: 238, column: 6
                            capLoaderStatus_o.setVal("idle");//sysj\controller.sysj line: 238, column: 6
                            S32977=1;
                            if(!capLoaderStatus_o.isACK()){//sysj\controller.sysj line: 238, column: 6
                              capLoaderStatus_o.setREQ(false);//sysj\controller.sysj line: 238, column: 6
                              ends[19]=2;
                              ;//sysj\controller.sysj line: 238, column: 6
                              S33594=1;
                              if(bottleAtPos3.getprestatus()){//sysj\controller.sysj line: 242, column: 14
                                System.out.println("Caploader Controller - bottle is at pos 3");//sysj\controller.sysj line: 243, column: 6
                                S33019=0;
                                if(magEmpty.getprestatus()){//sysj\controller.sysj line: 247, column: 14
                                  System.out.println("Mag empty");//sysj\controller.sysj line: 248, column: 7
                                  magReq.setPresent();//sysj\controller.sysj line: 250, column: 8
                                  currsigs.addElement(magReq);
                                  active[19]=1;
                                  ends[19]=1;
                                  break RUN;
                                }
                                else {
                                  S33019=1;
                                  active[19]=1;
                                  ends[19]=1;
                                  break RUN;
                                }
                              }
                              else {
                                S32975=2;
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
                        S33594=1;
                        if(bottleAtPos3.getprestatus()){//sysj\controller.sysj line: 242, column: 14
                          System.out.println("Caploader Controller - bottle is at pos 3");//sysj\controller.sysj line: 243, column: 6
                          S33019=0;
                          if(magEmpty.getprestatus()){//sysj\controller.sysj line: 247, column: 14
                            System.out.println("Mag empty");//sysj\controller.sysj line: 248, column: 7
                            magReq.setPresent();//sysj\controller.sysj line: 250, column: 8
                            currsigs.addElement(magReq);
                            active[19]=1;
                            ends[19]=1;
                            break RUN;
                          }
                          else {
                            S33019=1;
                            active[19]=1;
                            ends[19]=1;
                            break RUN;
                          }
                        }
                        else {
                          S32975=2;
                          active[19]=1;
                          ends[19]=1;
                          break RUN;
                        }
                      }
                    }
                    else {
                      S32975=2;
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
    vacOff_19 = new Signal();
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
          magEmpty.gethook();
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
      magEmpty.setpreclear();
      pusherExtend.setpreclear();
      vacOn.setpreclear();
      armSource.setpreclear();
      armDest.setpreclear();
      magReq.setpreclear();
      vacOff_19.setpreclear();
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
      dummyint = magEmpty.getStatus() ? magEmpty.setprepresent() : magEmpty.setpreclear();
      magEmpty.setpreval(magEmpty.getValue());
      magEmpty.setClear();
      pusherExtend.sethook();
      pusherExtend.setClear();
      vacOn.sethook();
      vacOn.setClear();
      armSource.sethook();
      armSource.setClear();
      armDest.sethook();
      armDest.setClear();
      magReq.sethook();
      magReq.setClear();
      vacOff_19.setClear();
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
        magEmpty.gethook();
      }
      runFinisher();
      if(active[19] == 0){
      	this.terminated = true;
      }
      if(!threaded) break;
    }
  }
}
