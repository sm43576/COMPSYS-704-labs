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
  private Boolean request_thread_19;//sysj\controller.sysj line: 229, column: 4
  private int S38231 = 1;
  private int S30743 = 1;
  private int S30727 = 1;
  private int S30722 = 1;
  private int S31362 = 1;
  private int S30750 = 1;
  private int S30745 = 1;
  private int S30787 = 1;
  private int S30812 = 1;
  private int S30823 = 1;
  private int S30822 = 1;
  private int S30847 = 1;
  private int S30842 = 1;
  
  private int[] ends = new int[22];
  private int[] tdone = new int[22];
  
  public void thread38406(int [] tdone, int [] ends){
        switch(S30823){
      case 0 : 
        active[21]=0;
        ends[21]=0;
        tdone[21]=1;
        break;
      
      case 1 : 
        switch(S30822){
          case 0 : 
            if(WPgripped.getprestatus()){//sysj\controller.sysj line: 269, column: 13
              S30822=1;
              armDest.setPresent();//sysj\controller.sysj line: 271, column: 8
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
            if(armAtDest.getprestatus()){//sysj\controller.sysj line: 270, column: 14
              vacOff_19.setPresent();//sysj\controller.sysj line: 273, column: 7
              currsigs.addElement(vacOff_19);
              S30823=0;
              active[21]=0;
              ends[21]=0;
              tdone[21]=1;
            }
            else {
              armDest.setPresent();//sysj\controller.sysj line: 271, column: 8
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

  public void thread38405(int [] tdone, int [] ends){
        switch(S30812){
      case 0 : 
        active[20]=0;
        ends[20]=0;
        tdone[20]=1;
        break;
      
      case 1 : 
        if(vacOff_19.getprestatus()){//sysj\controller.sysj line: 263, column: 13
          S30812=0;
          active[20]=0;
          ends[20]=0;
          tdone[20]=1;
        }
        else {
          vacOn.setPresent();//sysj\controller.sysj line: 264, column: 8
          currsigs.addElement(vacOn);
          active[20]=1;
          ends[20]=1;
          tdone[20]=1;
        }
        break;
      
    }
  }

  public void thread38403(int [] tdone, int [] ends){
        S30823=1;
    S30822=0;
    active[21]=1;
    ends[21]=1;
    tdone[21]=1;
  }

  public void thread38402(int [] tdone, int [] ends){
        S30812=1;
    vacOn.setPresent();//sysj\controller.sysj line: 264, column: 8
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
      switch(S38231){
        case 0 : 
          S38231=0;
          break RUN;
        
        case 1 : 
          S38231=2;
          S38231=2;
          vacOff_19.setClear();//sysj\controller.sysj line: 226, column: 2
          S30743=0;
          S30727=0;
          if(!capLoaderReq_in.isPartnerPresent() || capLoaderReq_in.isPartnerPreempted()){//sysj\controller.sysj line: 228, column: 4
            capLoaderReq_in.setACK(false);//sysj\controller.sysj line: 228, column: 4
            S30727=1;
            active[19]=1;
            ends[19]=1;
            break RUN;
          }
          else {
            S30722=0;
            if(!capLoaderReq_in.isREQ()){//sysj\controller.sysj line: 228, column: 4
              capLoaderReq_in.setACK(true);//sysj\controller.sysj line: 228, column: 4
              S30722=1;
              if(capLoaderReq_in.isREQ()){//sysj\controller.sysj line: 228, column: 4
                capLoaderReq_in.setACK(false);//sysj\controller.sysj line: 228, column: 4
                ends[19]=2;
                ;//sysj\controller.sysj line: 228, column: 4
                request_thread_19 = (capLoaderReq_in.getVal() == null ? null : ((Boolean)capLoaderReq_in.getVal()));//sysj\controller.sysj line: 229, column: 4
                S30743=1;
                if(request_thread_19){//sysj\controller.sysj line: 230, column: 4
                  S31362=0;
                  if(!bottleAtPos3.getprestatus()){//sysj\controller.sysj line: 233, column: 14
                    S30750=0;
                    if(!capLoaderStatus_o.isPartnerPresent() || capLoaderStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 234, column: 6
                      capLoaderStatus_o.setREQ(false);//sysj\controller.sysj line: 234, column: 6
                      S30750=1;
                      active[19]=1;
                      ends[19]=1;
                      break RUN;
                    }
                    else {
                      S30745=0;
                      if(capLoaderStatus_o.isACK()){//sysj\controller.sysj line: 234, column: 6
                        capLoaderStatus_o.setVal("idle");//sysj\controller.sysj line: 234, column: 6
                        S30745=1;
                        if(!capLoaderStatus_o.isACK()){//sysj\controller.sysj line: 234, column: 6
                          capLoaderStatus_o.setREQ(false);//sysj\controller.sysj line: 234, column: 6
                          ends[19]=2;
                          ;//sysj\controller.sysj line: 234, column: 6
                          S31362=1;
                          if(bottleAtPos3.getprestatus()){//sysj\controller.sysj line: 238, column: 14
                            System.out.println("Caploader Controller - bottle is at pos 3");//sysj\controller.sysj line: 239, column: 6
                            S30787=0;
                            if(magEmpty.getprestatus()){//sysj\controller.sysj line: 243, column: 14
                              System.out.println("Mag empty");//sysj\controller.sysj line: 244, column: 7
                              magReq.setPresent();//sysj\controller.sysj line: 246, column: 8
                              currsigs.addElement(magReq);
                              active[19]=1;
                              ends[19]=1;
                              break RUN;
                            }
                            else {
                              S30787=1;
                              active[19]=1;
                              ends[19]=1;
                              break RUN;
                            }
                          }
                          else {
                            S30743=2;
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
                    S31362=1;
                    if(bottleAtPos3.getprestatus()){//sysj\controller.sysj line: 238, column: 14
                      System.out.println("Caploader Controller - bottle is at pos 3");//sysj\controller.sysj line: 239, column: 6
                      S30787=0;
                      if(magEmpty.getprestatus()){//sysj\controller.sysj line: 243, column: 14
                        System.out.println("Mag empty");//sysj\controller.sysj line: 244, column: 7
                        magReq.setPresent();//sysj\controller.sysj line: 246, column: 8
                        currsigs.addElement(magReq);
                        active[19]=1;
                        ends[19]=1;
                        break RUN;
                      }
                      else {
                        S30787=1;
                        active[19]=1;
                        ends[19]=1;
                        break RUN;
                      }
                    }
                    else {
                      S30743=2;
                      active[19]=1;
                      ends[19]=1;
                      break RUN;
                    }
                  }
                }
                else {
                  S30743=2;
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
          vacOff_19.setClear();//sysj\controller.sysj line: 226, column: 2
          switch(S30743){
            case 0 : 
              switch(S30727){
                case 0 : 
                  if(!capLoaderReq_in.isPartnerPresent() || capLoaderReq_in.isPartnerPreempted()){//sysj\controller.sysj line: 228, column: 4
                    capLoaderReq_in.setACK(false);//sysj\controller.sysj line: 228, column: 4
                    S30727=1;
                    active[19]=1;
                    ends[19]=1;
                    break RUN;
                  }
                  else {
                    switch(S30722){
                      case 0 : 
                        if(!capLoaderReq_in.isREQ()){//sysj\controller.sysj line: 228, column: 4
                          capLoaderReq_in.setACK(true);//sysj\controller.sysj line: 228, column: 4
                          S30722=1;
                          if(capLoaderReq_in.isREQ()){//sysj\controller.sysj line: 228, column: 4
                            capLoaderReq_in.setACK(false);//sysj\controller.sysj line: 228, column: 4
                            ends[19]=2;
                            ;//sysj\controller.sysj line: 228, column: 4
                            request_thread_19 = (capLoaderReq_in.getVal() == null ? null : ((Boolean)capLoaderReq_in.getVal()));//sysj\controller.sysj line: 229, column: 4
                            S30743=1;
                            if(request_thread_19){//sysj\controller.sysj line: 230, column: 4
                              S31362=0;
                              if(!bottleAtPos3.getprestatus()){//sysj\controller.sysj line: 233, column: 14
                                S30750=0;
                                if(!capLoaderStatus_o.isPartnerPresent() || capLoaderStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 234, column: 6
                                  capLoaderStatus_o.setREQ(false);//sysj\controller.sysj line: 234, column: 6
                                  S30750=1;
                                  active[19]=1;
                                  ends[19]=1;
                                  break RUN;
                                }
                                else {
                                  S30745=0;
                                  if(capLoaderStatus_o.isACK()){//sysj\controller.sysj line: 234, column: 6
                                    capLoaderStatus_o.setVal("idle");//sysj\controller.sysj line: 234, column: 6
                                    S30745=1;
                                    if(!capLoaderStatus_o.isACK()){//sysj\controller.sysj line: 234, column: 6
                                      capLoaderStatus_o.setREQ(false);//sysj\controller.sysj line: 234, column: 6
                                      ends[19]=2;
                                      ;//sysj\controller.sysj line: 234, column: 6
                                      S31362=1;
                                      if(bottleAtPos3.getprestatus()){//sysj\controller.sysj line: 238, column: 14
                                        System.out.println("Caploader Controller - bottle is at pos 3");//sysj\controller.sysj line: 239, column: 6
                                        S30787=0;
                                        if(magEmpty.getprestatus()){//sysj\controller.sysj line: 243, column: 14
                                          System.out.println("Mag empty");//sysj\controller.sysj line: 244, column: 7
                                          magReq.setPresent();//sysj\controller.sysj line: 246, column: 8
                                          currsigs.addElement(magReq);
                                          active[19]=1;
                                          ends[19]=1;
                                          break RUN;
                                        }
                                        else {
                                          S30787=1;
                                          active[19]=1;
                                          ends[19]=1;
                                          break RUN;
                                        }
                                      }
                                      else {
                                        S30743=2;
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
                                S31362=1;
                                if(bottleAtPos3.getprestatus()){//sysj\controller.sysj line: 238, column: 14
                                  System.out.println("Caploader Controller - bottle is at pos 3");//sysj\controller.sysj line: 239, column: 6
                                  S30787=0;
                                  if(magEmpty.getprestatus()){//sysj\controller.sysj line: 243, column: 14
                                    System.out.println("Mag empty");//sysj\controller.sysj line: 244, column: 7
                                    magReq.setPresent();//sysj\controller.sysj line: 246, column: 8
                                    currsigs.addElement(magReq);
                                    active[19]=1;
                                    ends[19]=1;
                                    break RUN;
                                  }
                                  else {
                                    S30787=1;
                                    active[19]=1;
                                    ends[19]=1;
                                    break RUN;
                                  }
                                }
                                else {
                                  S30743=2;
                                  active[19]=1;
                                  ends[19]=1;
                                  break RUN;
                                }
                              }
                            }
                            else {
                              S30743=2;
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
                        if(capLoaderReq_in.isREQ()){//sysj\controller.sysj line: 228, column: 4
                          capLoaderReq_in.setACK(false);//sysj\controller.sysj line: 228, column: 4
                          ends[19]=2;
                          ;//sysj\controller.sysj line: 228, column: 4
                          request_thread_19 = (capLoaderReq_in.getVal() == null ? null : ((Boolean)capLoaderReq_in.getVal()));//sysj\controller.sysj line: 229, column: 4
                          S30743=1;
                          if(request_thread_19){//sysj\controller.sysj line: 230, column: 4
                            S31362=0;
                            if(!bottleAtPos3.getprestatus()){//sysj\controller.sysj line: 233, column: 14
                              S30750=0;
                              if(!capLoaderStatus_o.isPartnerPresent() || capLoaderStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 234, column: 6
                                capLoaderStatus_o.setREQ(false);//sysj\controller.sysj line: 234, column: 6
                                S30750=1;
                                active[19]=1;
                                ends[19]=1;
                                break RUN;
                              }
                              else {
                                S30745=0;
                                if(capLoaderStatus_o.isACK()){//sysj\controller.sysj line: 234, column: 6
                                  capLoaderStatus_o.setVal("idle");//sysj\controller.sysj line: 234, column: 6
                                  S30745=1;
                                  if(!capLoaderStatus_o.isACK()){//sysj\controller.sysj line: 234, column: 6
                                    capLoaderStatus_o.setREQ(false);//sysj\controller.sysj line: 234, column: 6
                                    ends[19]=2;
                                    ;//sysj\controller.sysj line: 234, column: 6
                                    S31362=1;
                                    if(bottleAtPos3.getprestatus()){//sysj\controller.sysj line: 238, column: 14
                                      System.out.println("Caploader Controller - bottle is at pos 3");//sysj\controller.sysj line: 239, column: 6
                                      S30787=0;
                                      if(magEmpty.getprestatus()){//sysj\controller.sysj line: 243, column: 14
                                        System.out.println("Mag empty");//sysj\controller.sysj line: 244, column: 7
                                        magReq.setPresent();//sysj\controller.sysj line: 246, column: 8
                                        currsigs.addElement(magReq);
                                        active[19]=1;
                                        ends[19]=1;
                                        break RUN;
                                      }
                                      else {
                                        S30787=1;
                                        active[19]=1;
                                        ends[19]=1;
                                        break RUN;
                                      }
                                    }
                                    else {
                                      S30743=2;
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
                              S31362=1;
                              if(bottleAtPos3.getprestatus()){//sysj\controller.sysj line: 238, column: 14
                                System.out.println("Caploader Controller - bottle is at pos 3");//sysj\controller.sysj line: 239, column: 6
                                S30787=0;
                                if(magEmpty.getprestatus()){//sysj\controller.sysj line: 243, column: 14
                                  System.out.println("Mag empty");//sysj\controller.sysj line: 244, column: 7
                                  magReq.setPresent();//sysj\controller.sysj line: 246, column: 8
                                  currsigs.addElement(magReq);
                                  active[19]=1;
                                  ends[19]=1;
                                  break RUN;
                                }
                                else {
                                  S30787=1;
                                  active[19]=1;
                                  ends[19]=1;
                                  break RUN;
                                }
                              }
                              else {
                                S30743=2;
                                active[19]=1;
                                ends[19]=1;
                                break RUN;
                              }
                            }
                          }
                          else {
                            S30743=2;
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
                  S30727=1;
                  S30727=0;
                  if(!capLoaderReq_in.isPartnerPresent() || capLoaderReq_in.isPartnerPreempted()){//sysj\controller.sysj line: 228, column: 4
                    capLoaderReq_in.setACK(false);//sysj\controller.sysj line: 228, column: 4
                    S30727=1;
                    active[19]=1;
                    ends[19]=1;
                    break RUN;
                  }
                  else {
                    S30722=0;
                    if(!capLoaderReq_in.isREQ()){//sysj\controller.sysj line: 228, column: 4
                      capLoaderReq_in.setACK(true);//sysj\controller.sysj line: 228, column: 4
                      S30722=1;
                      if(capLoaderReq_in.isREQ()){//sysj\controller.sysj line: 228, column: 4
                        capLoaderReq_in.setACK(false);//sysj\controller.sysj line: 228, column: 4
                        ends[19]=2;
                        ;//sysj\controller.sysj line: 228, column: 4
                        request_thread_19 = (capLoaderReq_in.getVal() == null ? null : ((Boolean)capLoaderReq_in.getVal()));//sysj\controller.sysj line: 229, column: 4
                        S30743=1;
                        if(request_thread_19){//sysj\controller.sysj line: 230, column: 4
                          S31362=0;
                          if(!bottleAtPos3.getprestatus()){//sysj\controller.sysj line: 233, column: 14
                            S30750=0;
                            if(!capLoaderStatus_o.isPartnerPresent() || capLoaderStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 234, column: 6
                              capLoaderStatus_o.setREQ(false);//sysj\controller.sysj line: 234, column: 6
                              S30750=1;
                              active[19]=1;
                              ends[19]=1;
                              break RUN;
                            }
                            else {
                              S30745=0;
                              if(capLoaderStatus_o.isACK()){//sysj\controller.sysj line: 234, column: 6
                                capLoaderStatus_o.setVal("idle");//sysj\controller.sysj line: 234, column: 6
                                S30745=1;
                                if(!capLoaderStatus_o.isACK()){//sysj\controller.sysj line: 234, column: 6
                                  capLoaderStatus_o.setREQ(false);//sysj\controller.sysj line: 234, column: 6
                                  ends[19]=2;
                                  ;//sysj\controller.sysj line: 234, column: 6
                                  S31362=1;
                                  if(bottleAtPos3.getprestatus()){//sysj\controller.sysj line: 238, column: 14
                                    System.out.println("Caploader Controller - bottle is at pos 3");//sysj\controller.sysj line: 239, column: 6
                                    S30787=0;
                                    if(magEmpty.getprestatus()){//sysj\controller.sysj line: 243, column: 14
                                      System.out.println("Mag empty");//sysj\controller.sysj line: 244, column: 7
                                      magReq.setPresent();//sysj\controller.sysj line: 246, column: 8
                                      currsigs.addElement(magReq);
                                      active[19]=1;
                                      ends[19]=1;
                                      break RUN;
                                    }
                                    else {
                                      S30787=1;
                                      active[19]=1;
                                      ends[19]=1;
                                      break RUN;
                                    }
                                  }
                                  else {
                                    S30743=2;
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
                            S31362=1;
                            if(bottleAtPos3.getprestatus()){//sysj\controller.sysj line: 238, column: 14
                              System.out.println("Caploader Controller - bottle is at pos 3");//sysj\controller.sysj line: 239, column: 6
                              S30787=0;
                              if(magEmpty.getprestatus()){//sysj\controller.sysj line: 243, column: 14
                                System.out.println("Mag empty");//sysj\controller.sysj line: 244, column: 7
                                magReq.setPresent();//sysj\controller.sysj line: 246, column: 8
                                currsigs.addElement(magReq);
                                active[19]=1;
                                ends[19]=1;
                                break RUN;
                              }
                              else {
                                S30787=1;
                                active[19]=1;
                                ends[19]=1;
                                break RUN;
                              }
                            }
                            else {
                              S30743=2;
                              active[19]=1;
                              ends[19]=1;
                              break RUN;
                            }
                          }
                        }
                        else {
                          S30743=2;
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
              switch(S31362){
                case 0 : 
                  switch(S30750){
                    case 0 : 
                      if(!capLoaderStatus_o.isPartnerPresent() || capLoaderStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 234, column: 6
                        capLoaderStatus_o.setREQ(false);//sysj\controller.sysj line: 234, column: 6
                        S30750=1;
                        active[19]=1;
                        ends[19]=1;
                        break RUN;
                      }
                      else {
                        switch(S30745){
                          case 0 : 
                            if(capLoaderStatus_o.isACK()){//sysj\controller.sysj line: 234, column: 6
                              capLoaderStatus_o.setVal("idle");//sysj\controller.sysj line: 234, column: 6
                              S30745=1;
                              if(!capLoaderStatus_o.isACK()){//sysj\controller.sysj line: 234, column: 6
                                capLoaderStatus_o.setREQ(false);//sysj\controller.sysj line: 234, column: 6
                                ends[19]=2;
                                ;//sysj\controller.sysj line: 234, column: 6
                                S31362=1;
                                if(bottleAtPos3.getprestatus()){//sysj\controller.sysj line: 238, column: 14
                                  System.out.println("Caploader Controller - bottle is at pos 3");//sysj\controller.sysj line: 239, column: 6
                                  S30787=0;
                                  if(magEmpty.getprestatus()){//sysj\controller.sysj line: 243, column: 14
                                    System.out.println("Mag empty");//sysj\controller.sysj line: 244, column: 7
                                    magReq.setPresent();//sysj\controller.sysj line: 246, column: 8
                                    currsigs.addElement(magReq);
                                    active[19]=1;
                                    ends[19]=1;
                                    break RUN;
                                  }
                                  else {
                                    S30787=1;
                                    active[19]=1;
                                    ends[19]=1;
                                    break RUN;
                                  }
                                }
                                else {
                                  S30743=2;
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
                              S31362=1;
                              if(bottleAtPos3.getprestatus()){//sysj\controller.sysj line: 238, column: 14
                                System.out.println("Caploader Controller - bottle is at pos 3");//sysj\controller.sysj line: 239, column: 6
                                S30787=0;
                                if(magEmpty.getprestatus()){//sysj\controller.sysj line: 243, column: 14
                                  System.out.println("Mag empty");//sysj\controller.sysj line: 244, column: 7
                                  magReq.setPresent();//sysj\controller.sysj line: 246, column: 8
                                  currsigs.addElement(magReq);
                                  active[19]=1;
                                  ends[19]=1;
                                  break RUN;
                                }
                                else {
                                  S30787=1;
                                  active[19]=1;
                                  ends[19]=1;
                                  break RUN;
                                }
                              }
                              else {
                                S30743=2;
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
                      S30750=1;
                      S30750=0;
                      if(!capLoaderStatus_o.isPartnerPresent() || capLoaderStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 234, column: 6
                        capLoaderStatus_o.setREQ(false);//sysj\controller.sysj line: 234, column: 6
                        S30750=1;
                        active[19]=1;
                        ends[19]=1;
                        break RUN;
                      }
                      else {
                        S30745=0;
                        if(capLoaderStatus_o.isACK()){//sysj\controller.sysj line: 234, column: 6
                          capLoaderStatus_o.setVal("idle");//sysj\controller.sysj line: 234, column: 6
                          S30745=1;
                          if(!capLoaderStatus_o.isACK()){//sysj\controller.sysj line: 234, column: 6
                            capLoaderStatus_o.setREQ(false);//sysj\controller.sysj line: 234, column: 6
                            ends[19]=2;
                            ;//sysj\controller.sysj line: 234, column: 6
                            S31362=1;
                            if(bottleAtPos3.getprestatus()){//sysj\controller.sysj line: 238, column: 14
                              System.out.println("Caploader Controller - bottle is at pos 3");//sysj\controller.sysj line: 239, column: 6
                              S30787=0;
                              if(magEmpty.getprestatus()){//sysj\controller.sysj line: 243, column: 14
                                System.out.println("Mag empty");//sysj\controller.sysj line: 244, column: 7
                                magReq.setPresent();//sysj\controller.sysj line: 246, column: 8
                                currsigs.addElement(magReq);
                                active[19]=1;
                                ends[19]=1;
                                break RUN;
                              }
                              else {
                                S30787=1;
                                active[19]=1;
                                ends[19]=1;
                                break RUN;
                              }
                            }
                            else {
                              S30743=2;
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
                  switch(S30787){
                    case 0 : 
                      if(!magEmpty.getprestatus()){//sysj\controller.sysj line: 245, column: 13
                        S30787=1;
                        active[19]=1;
                        ends[19]=1;
                        break RUN;
                      }
                      else {
                        magReq.setPresent();//sysj\controller.sysj line: 246, column: 8
                        currsigs.addElement(magReq);
                        active[19]=1;
                        ends[19]=1;
                        break RUN;
                      }
                    
                    case 1 : 
                      if(pusherRetracted.getprestatus()){//sysj\controller.sysj line: 250, column: 12
                        S30787=2;
                        pusherExtend.setPresent();//sysj\controller.sysj line: 252, column: 7
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
                      if(pusherExtended.getprestatus()){//sysj\controller.sysj line: 251, column: 12
                        System.out.println("pusher ok");//sysj\controller.sysj line: 255, column: 6
                        S30787=3;
                        armSource.setPresent();//sysj\controller.sysj line: 259, column: 7
                        currsigs.addElement(armSource);
                        active[19]=1;
                        ends[19]=1;
                        break RUN;
                      }
                      else {
                        pusherExtend.setPresent();//sysj\controller.sysj line: 252, column: 7
                        currsigs.addElement(pusherExtend);
                        active[19]=1;
                        ends[19]=1;
                        break RUN;
                      }
                    
                    case 3 : 
                      if(armAtSource.getprestatus()){//sysj\controller.sysj line: 258, column: 12
                        S30787=4;
                        thread38402(tdone,ends);
                        thread38403(tdone,ends);
                        int biggest38404 = 0;
                        if(ends[20]>=biggest38404){
                          biggest38404=ends[20];
                        }
                        if(ends[21]>=biggest38404){
                          biggest38404=ends[21];
                        }
                        if(biggest38404 == 1){
                          active[19]=1;
                          ends[19]=1;
                          break RUN;
                        }
                      }
                      else {
                        armSource.setPresent();//sysj\controller.sysj line: 259, column: 7
                        currsigs.addElement(armSource);
                        active[19]=1;
                        ends[19]=1;
                        break RUN;
                      }
                    
                    case 4 : 
                      thread38405(tdone,ends);
                      thread38406(tdone,ends);
                      int biggest38407 = 0;
                      if(ends[20]>=biggest38407){
                        biggest38407=ends[20];
                      }
                      if(ends[21]>=biggest38407){
                        biggest38407=ends[21];
                      }
                      if(biggest38407 == 1){
                        active[19]=1;
                        ends[19]=1;
                        break RUN;
                      }
                      //FINXME code
                      if(biggest38407 == 0){
                        S30787=5;
                        S30847=0;
                        if(!capLoaderStatus_o.isPartnerPresent() || capLoaderStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 275, column: 6
                          capLoaderStatus_o.setREQ(false);//sysj\controller.sysj line: 275, column: 6
                          S30847=1;
                          active[19]=1;
                          ends[19]=1;
                          break RUN;
                        }
                        else {
                          S30842=0;
                          if(capLoaderStatus_o.isACK()){//sysj\controller.sysj line: 275, column: 6
                            capLoaderStatus_o.setVal("done");//sysj\controller.sysj line: 275, column: 6
                            S30842=1;
                            if(!capLoaderStatus_o.isACK()){//sysj\controller.sysj line: 275, column: 6
                              capLoaderStatus_o.setREQ(false);//sysj\controller.sysj line: 275, column: 6
                              ends[19]=2;
                              ;//sysj\controller.sysj line: 275, column: 6
                              S30743=2;
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
                      switch(S30847){
                        case 0 : 
                          if(!capLoaderStatus_o.isPartnerPresent() || capLoaderStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 275, column: 6
                            capLoaderStatus_o.setREQ(false);//sysj\controller.sysj line: 275, column: 6
                            S30847=1;
                            active[19]=1;
                            ends[19]=1;
                            break RUN;
                          }
                          else {
                            switch(S30842){
                              case 0 : 
                                if(capLoaderStatus_o.isACK()){//sysj\controller.sysj line: 275, column: 6
                                  capLoaderStatus_o.setVal("done");//sysj\controller.sysj line: 275, column: 6
                                  S30842=1;
                                  if(!capLoaderStatus_o.isACK()){//sysj\controller.sysj line: 275, column: 6
                                    capLoaderStatus_o.setREQ(false);//sysj\controller.sysj line: 275, column: 6
                                    ends[19]=2;
                                    ;//sysj\controller.sysj line: 275, column: 6
                                    S30743=2;
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
                                  S30743=2;
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
                          S30847=1;
                          S30847=0;
                          if(!capLoaderStatus_o.isPartnerPresent() || capLoaderStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 275, column: 6
                            capLoaderStatus_o.setREQ(false);//sysj\controller.sysj line: 275, column: 6
                            S30847=1;
                            active[19]=1;
                            ends[19]=1;
                            break RUN;
                          }
                          else {
                            S30842=0;
                            if(capLoaderStatus_o.isACK()){//sysj\controller.sysj line: 275, column: 6
                              capLoaderStatus_o.setVal("done");//sysj\controller.sysj line: 275, column: 6
                              S30842=1;
                              if(!capLoaderStatus_o.isACK()){//sysj\controller.sysj line: 275, column: 6
                                capLoaderStatus_o.setREQ(false);//sysj\controller.sysj line: 275, column: 6
                                ends[19]=2;
                                ;//sysj\controller.sysj line: 275, column: 6
                                S30743=2;
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
              S30743=2;
              S30743=0;
              S30727=0;
              if(!capLoaderReq_in.isPartnerPresent() || capLoaderReq_in.isPartnerPreempted()){//sysj\controller.sysj line: 228, column: 4
                capLoaderReq_in.setACK(false);//sysj\controller.sysj line: 228, column: 4
                S30727=1;
                active[19]=1;
                ends[19]=1;
                break RUN;
              }
              else {
                S30722=0;
                if(!capLoaderReq_in.isREQ()){//sysj\controller.sysj line: 228, column: 4
                  capLoaderReq_in.setACK(true);//sysj\controller.sysj line: 228, column: 4
                  S30722=1;
                  if(capLoaderReq_in.isREQ()){//sysj\controller.sysj line: 228, column: 4
                    capLoaderReq_in.setACK(false);//sysj\controller.sysj line: 228, column: 4
                    ends[19]=2;
                    ;//sysj\controller.sysj line: 228, column: 4
                    request_thread_19 = (capLoaderReq_in.getVal() == null ? null : ((Boolean)capLoaderReq_in.getVal()));//sysj\controller.sysj line: 229, column: 4
                    S30743=1;
                    if(request_thread_19){//sysj\controller.sysj line: 230, column: 4
                      S31362=0;
                      if(!bottleAtPos3.getprestatus()){//sysj\controller.sysj line: 233, column: 14
                        S30750=0;
                        if(!capLoaderStatus_o.isPartnerPresent() || capLoaderStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 234, column: 6
                          capLoaderStatus_o.setREQ(false);//sysj\controller.sysj line: 234, column: 6
                          S30750=1;
                          active[19]=1;
                          ends[19]=1;
                          break RUN;
                        }
                        else {
                          S30745=0;
                          if(capLoaderStatus_o.isACK()){//sysj\controller.sysj line: 234, column: 6
                            capLoaderStatus_o.setVal("idle");//sysj\controller.sysj line: 234, column: 6
                            S30745=1;
                            if(!capLoaderStatus_o.isACK()){//sysj\controller.sysj line: 234, column: 6
                              capLoaderStatus_o.setREQ(false);//sysj\controller.sysj line: 234, column: 6
                              ends[19]=2;
                              ;//sysj\controller.sysj line: 234, column: 6
                              S31362=1;
                              if(bottleAtPos3.getprestatus()){//sysj\controller.sysj line: 238, column: 14
                                System.out.println("Caploader Controller - bottle is at pos 3");//sysj\controller.sysj line: 239, column: 6
                                S30787=0;
                                if(magEmpty.getprestatus()){//sysj\controller.sysj line: 243, column: 14
                                  System.out.println("Mag empty");//sysj\controller.sysj line: 244, column: 7
                                  magReq.setPresent();//sysj\controller.sysj line: 246, column: 8
                                  currsigs.addElement(magReq);
                                  active[19]=1;
                                  ends[19]=1;
                                  break RUN;
                                }
                                else {
                                  S30787=1;
                                  active[19]=1;
                                  ends[19]=1;
                                  break RUN;
                                }
                              }
                              else {
                                S30743=2;
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
                        S31362=1;
                        if(bottleAtPos3.getprestatus()){//sysj\controller.sysj line: 238, column: 14
                          System.out.println("Caploader Controller - bottle is at pos 3");//sysj\controller.sysj line: 239, column: 6
                          S30787=0;
                          if(magEmpty.getprestatus()){//sysj\controller.sysj line: 243, column: 14
                            System.out.println("Mag empty");//sysj\controller.sysj line: 244, column: 7
                            magReq.setPresent();//sysj\controller.sysj line: 246, column: 8
                            currsigs.addElement(magReq);
                            active[19]=1;
                            ends[19]=1;
                            break RUN;
                          }
                          else {
                            S30787=1;
                            active[19]=1;
                            ends[19]=1;
                            break RUN;
                          }
                        }
                        else {
                          S30743=2;
                          active[19]=1;
                          ends[19]=1;
                          break RUN;
                        }
                      }
                    }
                    else {
                      S30743=2;
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
