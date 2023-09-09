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
  private int S31127 = 1;
  private int S30803 = 1;
  private int S30787 = 1;
  private int S30782 = 1;
  private int S30810 = 1;
  private int S30805 = 1;
  
  private int[] ends = new int[20];
  private int[] tdone = new int[20];
  
  public void runClockDomain(){
    for(int i=0;i<ends.length;i++){
      ends[i] = 0;
      tdone[i] = 0;
    }
    
    RUN: while(true){
      switch(S31127){
        case 0 : 
          S31127=0;
          break RUN;
        
        case 1 : 
          S31127=2;
          S31127=2;
          vacOff_19.setClear();//sysj\controller.sysj line: 226, column: 2
          S30803=0;
          S30787=0;
          if(!capLoaderReq_in.isPartnerPresent() || capLoaderReq_in.isPartnerPreempted()){//sysj\controller.sysj line: 228, column: 4
            capLoaderReq_in.setACK(false);//sysj\controller.sysj line: 228, column: 4
            S30787=1;
            active[19]=1;
            ends[19]=1;
            break RUN;
          }
          else {
            S30782=0;
            if(!capLoaderReq_in.isREQ()){//sysj\controller.sysj line: 228, column: 4
              capLoaderReq_in.setACK(true);//sysj\controller.sysj line: 228, column: 4
              S30782=1;
              if(capLoaderReq_in.isREQ()){//sysj\controller.sysj line: 228, column: 4
                capLoaderReq_in.setACK(false);//sysj\controller.sysj line: 228, column: 4
                ends[19]=2;
                ;//sysj\controller.sysj line: 228, column: 4
                request_thread_19 = (capLoaderReq_in.getVal() == null ? null : ((Boolean)capLoaderReq_in.getVal()));//sysj\controller.sysj line: 229, column: 4
                S30803=1;
                if(request_thread_19){//sysj\controller.sysj line: 230, column: 4
                  S30810=0;
                  if(!capLoaderStatus_o.isPartnerPresent() || capLoaderStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 231, column: 5
                    capLoaderStatus_o.setREQ(false);//sysj\controller.sysj line: 231, column: 5
                    S30810=1;
                    active[19]=1;
                    ends[19]=1;
                    break RUN;
                  }
                  else {
                    S30805=0;
                    if(capLoaderStatus_o.isACK()){//sysj\controller.sysj line: 231, column: 5
                      capLoaderStatus_o.setVal("done");//sysj\controller.sysj line: 231, column: 5
                      S30805=1;
                      if(!capLoaderStatus_o.isACK()){//sysj\controller.sysj line: 231, column: 5
                        capLoaderStatus_o.setREQ(false);//sysj\controller.sysj line: 231, column: 5
                        ends[19]=2;
                        ;//sysj\controller.sysj line: 231, column: 5
                        S30803=2;
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
                else {
                  S30803=2;
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
          switch(S30803){
            case 0 : 
              switch(S30787){
                case 0 : 
                  if(!capLoaderReq_in.isPartnerPresent() || capLoaderReq_in.isPartnerPreempted()){//sysj\controller.sysj line: 228, column: 4
                    capLoaderReq_in.setACK(false);//sysj\controller.sysj line: 228, column: 4
                    S30787=1;
                    active[19]=1;
                    ends[19]=1;
                    break RUN;
                  }
                  else {
                    switch(S30782){
                      case 0 : 
                        if(!capLoaderReq_in.isREQ()){//sysj\controller.sysj line: 228, column: 4
                          capLoaderReq_in.setACK(true);//sysj\controller.sysj line: 228, column: 4
                          S30782=1;
                          if(capLoaderReq_in.isREQ()){//sysj\controller.sysj line: 228, column: 4
                            capLoaderReq_in.setACK(false);//sysj\controller.sysj line: 228, column: 4
                            ends[19]=2;
                            ;//sysj\controller.sysj line: 228, column: 4
                            request_thread_19 = (capLoaderReq_in.getVal() == null ? null : ((Boolean)capLoaderReq_in.getVal()));//sysj\controller.sysj line: 229, column: 4
                            S30803=1;
                            if(request_thread_19){//sysj\controller.sysj line: 230, column: 4
                              S30810=0;
                              if(!capLoaderStatus_o.isPartnerPresent() || capLoaderStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 231, column: 5
                                capLoaderStatus_o.setREQ(false);//sysj\controller.sysj line: 231, column: 5
                                S30810=1;
                                active[19]=1;
                                ends[19]=1;
                                break RUN;
                              }
                              else {
                                S30805=0;
                                if(capLoaderStatus_o.isACK()){//sysj\controller.sysj line: 231, column: 5
                                  capLoaderStatus_o.setVal("done");//sysj\controller.sysj line: 231, column: 5
                                  S30805=1;
                                  if(!capLoaderStatus_o.isACK()){//sysj\controller.sysj line: 231, column: 5
                                    capLoaderStatus_o.setREQ(false);//sysj\controller.sysj line: 231, column: 5
                                    ends[19]=2;
                                    ;//sysj\controller.sysj line: 231, column: 5
                                    S30803=2;
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
                            else {
                              S30803=2;
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
                          S30803=1;
                          if(request_thread_19){//sysj\controller.sysj line: 230, column: 4
                            S30810=0;
                            if(!capLoaderStatus_o.isPartnerPresent() || capLoaderStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 231, column: 5
                              capLoaderStatus_o.setREQ(false);//sysj\controller.sysj line: 231, column: 5
                              S30810=1;
                              active[19]=1;
                              ends[19]=1;
                              break RUN;
                            }
                            else {
                              S30805=0;
                              if(capLoaderStatus_o.isACK()){//sysj\controller.sysj line: 231, column: 5
                                capLoaderStatus_o.setVal("done");//sysj\controller.sysj line: 231, column: 5
                                S30805=1;
                                if(!capLoaderStatus_o.isACK()){//sysj\controller.sysj line: 231, column: 5
                                  capLoaderStatus_o.setREQ(false);//sysj\controller.sysj line: 231, column: 5
                                  ends[19]=2;
                                  ;//sysj\controller.sysj line: 231, column: 5
                                  S30803=2;
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
                          else {
                            S30803=2;
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
                  S30787=1;
                  S30787=0;
                  if(!capLoaderReq_in.isPartnerPresent() || capLoaderReq_in.isPartnerPreempted()){//sysj\controller.sysj line: 228, column: 4
                    capLoaderReq_in.setACK(false);//sysj\controller.sysj line: 228, column: 4
                    S30787=1;
                    active[19]=1;
                    ends[19]=1;
                    break RUN;
                  }
                  else {
                    S30782=0;
                    if(!capLoaderReq_in.isREQ()){//sysj\controller.sysj line: 228, column: 4
                      capLoaderReq_in.setACK(true);//sysj\controller.sysj line: 228, column: 4
                      S30782=1;
                      if(capLoaderReq_in.isREQ()){//sysj\controller.sysj line: 228, column: 4
                        capLoaderReq_in.setACK(false);//sysj\controller.sysj line: 228, column: 4
                        ends[19]=2;
                        ;//sysj\controller.sysj line: 228, column: 4
                        request_thread_19 = (capLoaderReq_in.getVal() == null ? null : ((Boolean)capLoaderReq_in.getVal()));//sysj\controller.sysj line: 229, column: 4
                        S30803=1;
                        if(request_thread_19){//sysj\controller.sysj line: 230, column: 4
                          S30810=0;
                          if(!capLoaderStatus_o.isPartnerPresent() || capLoaderStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 231, column: 5
                            capLoaderStatus_o.setREQ(false);//sysj\controller.sysj line: 231, column: 5
                            S30810=1;
                            active[19]=1;
                            ends[19]=1;
                            break RUN;
                          }
                          else {
                            S30805=0;
                            if(capLoaderStatus_o.isACK()){//sysj\controller.sysj line: 231, column: 5
                              capLoaderStatus_o.setVal("done");//sysj\controller.sysj line: 231, column: 5
                              S30805=1;
                              if(!capLoaderStatus_o.isACK()){//sysj\controller.sysj line: 231, column: 5
                                capLoaderStatus_o.setREQ(false);//sysj\controller.sysj line: 231, column: 5
                                ends[19]=2;
                                ;//sysj\controller.sysj line: 231, column: 5
                                S30803=2;
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
                        else {
                          S30803=2;
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
              switch(S30810){
                case 0 : 
                  if(!capLoaderStatus_o.isPartnerPresent() || capLoaderStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 231, column: 5
                    capLoaderStatus_o.setREQ(false);//sysj\controller.sysj line: 231, column: 5
                    S30810=1;
                    active[19]=1;
                    ends[19]=1;
                    break RUN;
                  }
                  else {
                    switch(S30805){
                      case 0 : 
                        if(capLoaderStatus_o.isACK()){//sysj\controller.sysj line: 231, column: 5
                          capLoaderStatus_o.setVal("done");//sysj\controller.sysj line: 231, column: 5
                          S30805=1;
                          if(!capLoaderStatus_o.isACK()){//sysj\controller.sysj line: 231, column: 5
                            capLoaderStatus_o.setREQ(false);//sysj\controller.sysj line: 231, column: 5
                            ends[19]=2;
                            ;//sysj\controller.sysj line: 231, column: 5
                            S30803=2;
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
                        if(!capLoaderStatus_o.isACK()){//sysj\controller.sysj line: 231, column: 5
                          capLoaderStatus_o.setREQ(false);//sysj\controller.sysj line: 231, column: 5
                          ends[19]=2;
                          ;//sysj\controller.sysj line: 231, column: 5
                          S30803=2;
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
                  S30810=1;
                  S30810=0;
                  if(!capLoaderStatus_o.isPartnerPresent() || capLoaderStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 231, column: 5
                    capLoaderStatus_o.setREQ(false);//sysj\controller.sysj line: 231, column: 5
                    S30810=1;
                    active[19]=1;
                    ends[19]=1;
                    break RUN;
                  }
                  else {
                    S30805=0;
                    if(capLoaderStatus_o.isACK()){//sysj\controller.sysj line: 231, column: 5
                      capLoaderStatus_o.setVal("done");//sysj\controller.sysj line: 231, column: 5
                      S30805=1;
                      if(!capLoaderStatus_o.isACK()){//sysj\controller.sysj line: 231, column: 5
                        capLoaderStatus_o.setREQ(false);//sysj\controller.sysj line: 231, column: 5
                        ends[19]=2;
                        ;//sysj\controller.sysj line: 231, column: 5
                        S30803=2;
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
            
            case 2 : 
              S30803=2;
              S30803=0;
              S30787=0;
              if(!capLoaderReq_in.isPartnerPresent() || capLoaderReq_in.isPartnerPreempted()){//sysj\controller.sysj line: 228, column: 4
                capLoaderReq_in.setACK(false);//sysj\controller.sysj line: 228, column: 4
                S30787=1;
                active[19]=1;
                ends[19]=1;
                break RUN;
              }
              else {
                S30782=0;
                if(!capLoaderReq_in.isREQ()){//sysj\controller.sysj line: 228, column: 4
                  capLoaderReq_in.setACK(true);//sysj\controller.sysj line: 228, column: 4
                  S30782=1;
                  if(capLoaderReq_in.isREQ()){//sysj\controller.sysj line: 228, column: 4
                    capLoaderReq_in.setACK(false);//sysj\controller.sysj line: 228, column: 4
                    ends[19]=2;
                    ;//sysj\controller.sysj line: 228, column: 4
                    request_thread_19 = (capLoaderReq_in.getVal() == null ? null : ((Boolean)capLoaderReq_in.getVal()));//sysj\controller.sysj line: 229, column: 4
                    S30803=1;
                    if(request_thread_19){//sysj\controller.sysj line: 230, column: 4
                      S30810=0;
                      if(!capLoaderStatus_o.isPartnerPresent() || capLoaderStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 231, column: 5
                        capLoaderStatus_o.setREQ(false);//sysj\controller.sysj line: 231, column: 5
                        S30810=1;
                        active[19]=1;
                        ends[19]=1;
                        break RUN;
                      }
                      else {
                        S30805=0;
                        if(capLoaderStatus_o.isACK()){//sysj\controller.sysj line: 231, column: 5
                          capLoaderStatus_o.setVal("done");//sysj\controller.sysj line: 231, column: 5
                          S30805=1;
                          if(!capLoaderStatus_o.isACK()){//sysj\controller.sysj line: 231, column: 5
                            capLoaderStatus_o.setREQ(false);//sysj\controller.sysj line: 231, column: 5
                            ends[19]=2;
                            ;//sysj\controller.sysj line: 231, column: 5
                            S30803=2;
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
                    else {
                      S30803=2;
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
    char [] active1 = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
    char [] paused1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    char [] suspended1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
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
