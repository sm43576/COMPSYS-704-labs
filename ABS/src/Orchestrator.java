import java.util.*;
import com.systemj.ClockDomain;
import com.systemj.Signal;
import com.systemj.input_Channel;
import com.systemj.output_Channel;

public class Orchestrator extends ClockDomain{
  public Orchestrator(String name){super(name);}
  Vector currsigs = new Vector();
  private boolean df = false;
  private char [] active;
  private char [] paused;
  private char [] suspended;
  public input_Channel conveyorStatus_in = new input_Channel();
  public input_Channel rotaryStatus_in = new input_Channel();
  public input_Channel order_in = new input_Channel();
  public output_Channel conveyorReq_o = new output_Channel();
  public output_Channel allOperationsFinished_o = new output_Channel();
  public output_Channel doneOrder_o = new output_Channel();
  private int[] liquidPercent_thread_1;//sysj/orchestrator.sysj line: 10, column: 2
  private int quantity_thread_1;//sysj/orchestrator.sysj line: 11, column: 2
  private int bottlePlaced_thread_1;//sysj/orchestrator.sysj line: 14, column: 2
  private String conveyStat_thread_1;//sysj/orchestrator.sysj line: 27, column: 6
  private int S11611 = 1;
  private int S1935 = 1;
  private int S45 = 1;
  private int S7 = 1;
  private int S2 = 1;
  private int S68 = 1;
  private int S52 = 1;
  private int S47 = 1;
  
  private int[] ends = new int[2];
  private int[] tdone = new int[2];
  
  public void runClockDomain(){
    for(int i=0;i<ends.length;i++){
      ends[i] = 0;
      tdone[i] = 0;
    }
    
    RUN: while(true){
      switch(S11611){
        case 0 : 
          S11611=0;
          break RUN;
        
        case 1 : 
          S11611=2;
          S11611=2;
          liquidPercent_thread_1 = new int[] = { 10, 10, 20, 60 } ;//sysj/orchestrator.sysj line: 10, column: 2
          quantity_thread_1 = 5;//sysj/orchestrator.sysj line: 11, column: 2
                    bottlePlaced_thread_1 = quantity_thread_1;//sysj/orchestrator.sysj line: 19, column: 4
          S1935=0;
          if(bottlePlaced_thread_1 <= 0){//sysj/orchestrator.sysj line: 20, column: 10
            System.out.println("sending conveyor req?");//sysj/orchestrator.sysj line: 21, column: 5
            S45=0;
            S7=0;
            if(!conveyorReq_o.isPartnerPresent() || conveyorReq_o.isPartnerPreempted()){//sysj/orchestrator.sysj line: 22, column: 5
              conveyorReq_o.setREQ(false);//sysj/orchestrator.sysj line: 22, column: 5
              S7=1;
              active[1]=1;
              ends[1]=1;
              break RUN;
            }
            else {
              S2=0;
              if(conveyorReq_o.isACK()){//sysj/orchestrator.sysj line: 22, column: 5
                conveyorReq_o.setVal(true);//sysj/orchestrator.sysj line: 22, column: 5
                S2=1;
                if(!conveyorReq_o.isACK()){//sysj/orchestrator.sysj line: 22, column: 5
                  conveyorReq_o.setREQ(false);//sysj/orchestrator.sysj line: 22, column: 5
                  ends[1]=2;
                  ;//sysj/orchestrator.sysj line: 22, column: 5
                  bottlePlaced_thread_1 = bottlePlaced_thread_1 - 1;//sysj/orchestrator.sysj line: 23, column: 5
                  S45=1;
                  S68=0;
                  S52=0;
                  if(!conveyorStatus_in.isPartnerPresent() || conveyorStatus_in.isPartnerPreempted()){//sysj/orchestrator.sysj line: 26, column: 6
                    conveyorStatus_in.setACK(false);//sysj/orchestrator.sysj line: 26, column: 6
                    S52=1;
                    active[1]=1;
                    ends[1]=1;
                    break RUN;
                  }
                  else {
                    S47=0;
                    if(!conveyorStatus_in.isREQ()){//sysj/orchestrator.sysj line: 26, column: 6
                      conveyorStatus_in.setACK(true);//sysj/orchestrator.sysj line: 26, column: 6
                      S47=1;
                      if(conveyorStatus_in.isREQ()){//sysj/orchestrator.sysj line: 26, column: 6
                        conveyorStatus_in.setACK(false);//sysj/orchestrator.sysj line: 26, column: 6
                        ends[1]=2;
                        ;//sysj/orchestrator.sysj line: 26, column: 6
                        conveyStat_thread_1 = (conveyorStatus_in.getVal() == null ? null : ((String)conveyorStatus_in.getVal()));//sysj/orchestrator.sysj line: 27, column: 6
                        if(conveyStat_thread_1 == "done") {//sysj/orchestrator.sysj line: 28, column: 31
                          break ;//sysj/orchestrator.sysj line: 29, column: 7
                        }
                        S68=1;
                        active[1]=1;
                        ends[1]=1;
                        break RUN;
                      }
                      else {
                        active[1]=1;
                        ends[1]=1;
                        break RUN;
                      }
                    }
                    else {
                      active[1]=1;
                      ends[1]=1;
                      break RUN;
                    }
                  }
                }
                else {
                  active[1]=1;
                  ends[1]=1;
                  break RUN;
                }
              }
              else {
                active[1]=1;
                ends[1]=1;
                break RUN;
              }
            }
          }
          else {
            conveyorStatus_in.setPreempted();//sysj/orchestrator.sysj line: 20, column: 4
            conveyorReq_o.setPreempted();//sysj/orchestrator.sysj line: 20, column: 4
            ends[1]=2;
            ;//sysj/orchestrator.sysj line: 20, column: 4
            System.out.println("Done order");//sysj/orchestrator.sysj line: 37, column: 4
            S1935=1;
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
        
        case 2 : 
          switch(S1935){
            case 0 : 
              switch(S45){
                case 0 : 
                  switch(S7){
                    case 0 : 
                      if(!conveyorReq_o.isPartnerPresent() || conveyorReq_o.isPartnerPreempted()){//sysj/orchestrator.sysj line: 22, column: 5
                        conveyorReq_o.setREQ(false);//sysj/orchestrator.sysj line: 22, column: 5
                        S7=1;
                        active[1]=1;
                        ends[1]=1;
                        break RUN;
                      }
                      else {
                        switch(S2){
                          case 0 : 
                            if(conveyorReq_o.isACK()){//sysj/orchestrator.sysj line: 22, column: 5
                              conveyorReq_o.setVal(true);//sysj/orchestrator.sysj line: 22, column: 5
                              S2=1;
                              if(!conveyorReq_o.isACK()){//sysj/orchestrator.sysj line: 22, column: 5
                                conveyorReq_o.setREQ(false);//sysj/orchestrator.sysj line: 22, column: 5
                                ends[1]=2;
                                ;//sysj/orchestrator.sysj line: 22, column: 5
                                bottlePlaced_thread_1 = bottlePlaced_thread_1 - 1;//sysj/orchestrator.sysj line: 23, column: 5
                                S45=1;
                                S68=0;
                                S52=0;
                                if(!conveyorStatus_in.isPartnerPresent() || conveyorStatus_in.isPartnerPreempted()){//sysj/orchestrator.sysj line: 26, column: 6
                                  conveyorStatus_in.setACK(false);//sysj/orchestrator.sysj line: 26, column: 6
                                  S52=1;
                                  active[1]=1;
                                  ends[1]=1;
                                  break RUN;
                                }
                                else {
                                  S47=0;
                                  if(!conveyorStatus_in.isREQ()){//sysj/orchestrator.sysj line: 26, column: 6
                                    conveyorStatus_in.setACK(true);//sysj/orchestrator.sysj line: 26, column: 6
                                    S47=1;
                                    if(conveyorStatus_in.isREQ()){//sysj/orchestrator.sysj line: 26, column: 6
                                      conveyorStatus_in.setACK(false);//sysj/orchestrator.sysj line: 26, column: 6
                                      ends[1]=2;
                                      ;//sysj/orchestrator.sysj line: 26, column: 6
                                      conveyStat_thread_1 = (conveyorStatus_in.getVal() == null ? null : ((String)conveyorStatus_in.getVal()));//sysj/orchestrator.sysj line: 27, column: 6
                                      if(conveyStat_thread_1 == "done") {//sysj/orchestrator.sysj line: 28, column: 31
                                        break ;//sysj/orchestrator.sysj line: 29, column: 7
                                      }
                                      S68=1;
                                      active[1]=1;
                                      ends[1]=1;
                                      break RUN;
                                    }
                                    else {
                                      active[1]=1;
                                      ends[1]=1;
                                      break RUN;
                                    }
                                  }
                                  else {
                                    active[1]=1;
                                    ends[1]=1;
                                    break RUN;
                                  }
                                }
                              }
                              else {
                                active[1]=1;
                                ends[1]=1;
                                break RUN;
                              }
                            }
                            else {
                              active[1]=1;
                              ends[1]=1;
                              break RUN;
                            }
                          
                          case 1 : 
                            if(!conveyorReq_o.isACK()){//sysj/orchestrator.sysj line: 22, column: 5
                              conveyorReq_o.setREQ(false);//sysj/orchestrator.sysj line: 22, column: 5
                              ends[1]=2;
                              ;//sysj/orchestrator.sysj line: 22, column: 5
                              bottlePlaced_thread_1 = bottlePlaced_thread_1 - 1;//sysj/orchestrator.sysj line: 23, column: 5
                              S45=1;
                              S68=0;
                              S52=0;
                              if(!conveyorStatus_in.isPartnerPresent() || conveyorStatus_in.isPartnerPreempted()){//sysj/orchestrator.sysj line: 26, column: 6
                                conveyorStatus_in.setACK(false);//sysj/orchestrator.sysj line: 26, column: 6
                                S52=1;
                                active[1]=1;
                                ends[1]=1;
                                break RUN;
                              }
                              else {
                                S47=0;
                                if(!conveyorStatus_in.isREQ()){//sysj/orchestrator.sysj line: 26, column: 6
                                  conveyorStatus_in.setACK(true);//sysj/orchestrator.sysj line: 26, column: 6
                                  S47=1;
                                  if(conveyorStatus_in.isREQ()){//sysj/orchestrator.sysj line: 26, column: 6
                                    conveyorStatus_in.setACK(false);//sysj/orchestrator.sysj line: 26, column: 6
                                    ends[1]=2;
                                    ;//sysj/orchestrator.sysj line: 26, column: 6
                                    conveyStat_thread_1 = (conveyorStatus_in.getVal() == null ? null : ((String)conveyorStatus_in.getVal()));//sysj/orchestrator.sysj line: 27, column: 6
                                    if(conveyStat_thread_1 == "done") {//sysj/orchestrator.sysj line: 28, column: 31
                                      break ;//sysj/orchestrator.sysj line: 29, column: 7
                                    }
                                    S68=1;
                                    active[1]=1;
                                    ends[1]=1;
                                    break RUN;
                                  }
                                  else {
                                    active[1]=1;
                                    ends[1]=1;
                                    break RUN;
                                  }
                                }
                                else {
                                  active[1]=1;
                                  ends[1]=1;
                                  break RUN;
                                }
                              }
                            }
                            else {
                              active[1]=1;
                              ends[1]=1;
                              break RUN;
                            }
                          
                        }
                      }
                      break;
                    
                    case 1 : 
                      S7=1;
                      S7=0;
                      if(!conveyorReq_o.isPartnerPresent() || conveyorReq_o.isPartnerPreempted()){//sysj/orchestrator.sysj line: 22, column: 5
                        conveyorReq_o.setREQ(false);//sysj/orchestrator.sysj line: 22, column: 5
                        S7=1;
                        active[1]=1;
                        ends[1]=1;
                        break RUN;
                      }
                      else {
                        S2=0;
                        if(conveyorReq_o.isACK()){//sysj/orchestrator.sysj line: 22, column: 5
                          conveyorReq_o.setVal(true);//sysj/orchestrator.sysj line: 22, column: 5
                          S2=1;
                          if(!conveyorReq_o.isACK()){//sysj/orchestrator.sysj line: 22, column: 5
                            conveyorReq_o.setREQ(false);//sysj/orchestrator.sysj line: 22, column: 5
                            ends[1]=2;
                            ;//sysj/orchestrator.sysj line: 22, column: 5
                            bottlePlaced_thread_1 = bottlePlaced_thread_1 - 1;//sysj/orchestrator.sysj line: 23, column: 5
                            S45=1;
                            S68=0;
                            S52=0;
                            if(!conveyorStatus_in.isPartnerPresent() || conveyorStatus_in.isPartnerPreempted()){//sysj/orchestrator.sysj line: 26, column: 6
                              conveyorStatus_in.setACK(false);//sysj/orchestrator.sysj line: 26, column: 6
                              S52=1;
                              active[1]=1;
                              ends[1]=1;
                              break RUN;
                            }
                            else {
                              S47=0;
                              if(!conveyorStatus_in.isREQ()){//sysj/orchestrator.sysj line: 26, column: 6
                                conveyorStatus_in.setACK(true);//sysj/orchestrator.sysj line: 26, column: 6
                                S47=1;
                                if(conveyorStatus_in.isREQ()){//sysj/orchestrator.sysj line: 26, column: 6
                                  conveyorStatus_in.setACK(false);//sysj/orchestrator.sysj line: 26, column: 6
                                  ends[1]=2;
                                  ;//sysj/orchestrator.sysj line: 26, column: 6
                                  conveyStat_thread_1 = (conveyorStatus_in.getVal() == null ? null : ((String)conveyorStatus_in.getVal()));//sysj/orchestrator.sysj line: 27, column: 6
                                  if(conveyStat_thread_1 == "done") {//sysj/orchestrator.sysj line: 28, column: 31
                                    break ;//sysj/orchestrator.sysj line: 29, column: 7
                                  }
                                  S68=1;
                                  active[1]=1;
                                  ends[1]=1;
                                  break RUN;
                                }
                                else {
                                  active[1]=1;
                                  ends[1]=1;
                                  break RUN;
                                }
                              }
                              else {
                                active[1]=1;
                                ends[1]=1;
                                break RUN;
                              }
                            }
                          }
                          else {
                            active[1]=1;
                            ends[1]=1;
                            break RUN;
                          }
                        }
                        else {
                          active[1]=1;
                          ends[1]=1;
                          break RUN;
                        }
                      }
                    
                  }
                  break;
                
                case 1 : 
                  switch(S68){
                    case 0 : 
                      switch(S52){
                        case 0 : 
                          if(!conveyorStatus_in.isPartnerPresent() || conveyorStatus_in.isPartnerPreempted()){//sysj/orchestrator.sysj line: 26, column: 6
                            conveyorStatus_in.setACK(false);//sysj/orchestrator.sysj line: 26, column: 6
                            S52=1;
                            active[1]=1;
                            ends[1]=1;
                            break RUN;
                          }
                          else {
                            switch(S47){
                              case 0 : 
                                if(!conveyorStatus_in.isREQ()){//sysj/orchestrator.sysj line: 26, column: 6
                                  conveyorStatus_in.setACK(true);//sysj/orchestrator.sysj line: 26, column: 6
                                  S47=1;
                                  if(conveyorStatus_in.isREQ()){//sysj/orchestrator.sysj line: 26, column: 6
                                    conveyorStatus_in.setACK(false);//sysj/orchestrator.sysj line: 26, column: 6
                                    ends[1]=2;
                                    ;//sysj/orchestrator.sysj line: 26, column: 6
                                    conveyStat_thread_1 = (conveyorStatus_in.getVal() == null ? null : ((String)conveyorStatus_in.getVal()));//sysj/orchestrator.sysj line: 27, column: 6
                                    if(conveyStat_thread_1 == "done") {//sysj/orchestrator.sysj line: 28, column: 31
                                      break ;//sysj/orchestrator.sysj line: 29, column: 7
                                    }
                                    S68=1;
                                    active[1]=1;
                                    ends[1]=1;
                                    break RUN;
                                  }
                                  else {
                                    active[1]=1;
                                    ends[1]=1;
                                    break RUN;
                                  }
                                }
                                else {
                                  active[1]=1;
                                  ends[1]=1;
                                  break RUN;
                                }
                              
                              case 1 : 
                                if(conveyorStatus_in.isREQ()){//sysj/orchestrator.sysj line: 26, column: 6
                                  conveyorStatus_in.setACK(false);//sysj/orchestrator.sysj line: 26, column: 6
                                  ends[1]=2;
                                  ;//sysj/orchestrator.sysj line: 26, column: 6
                                  conveyStat_thread_1 = (conveyorStatus_in.getVal() == null ? null : ((String)conveyorStatus_in.getVal()));//sysj/orchestrator.sysj line: 27, column: 6
                                  if(conveyStat_thread_1 == "done") {//sysj/orchestrator.sysj line: 28, column: 31
                                    break ;//sysj/orchestrator.sysj line: 29, column: 7
                                  }
                                  S68=1;
                                  active[1]=1;
                                  ends[1]=1;
                                  break RUN;
                                }
                                else {
                                  active[1]=1;
                                  ends[1]=1;
                                  break RUN;
                                }
                              
                            }
                          }
                          break;
                        
                        case 1 : 
                          S52=1;
                          S52=0;
                          if(!conveyorStatus_in.isPartnerPresent() || conveyorStatus_in.isPartnerPreempted()){//sysj/orchestrator.sysj line: 26, column: 6
                            conveyorStatus_in.setACK(false);//sysj/orchestrator.sysj line: 26, column: 6
                            S52=1;
                            active[1]=1;
                            ends[1]=1;
                            break RUN;
                          }
                          else {
                            S47=0;
                            if(!conveyorStatus_in.isREQ()){//sysj/orchestrator.sysj line: 26, column: 6
                              conveyorStatus_in.setACK(true);//sysj/orchestrator.sysj line: 26, column: 6
                              S47=1;
                              if(conveyorStatus_in.isREQ()){//sysj/orchestrator.sysj line: 26, column: 6
                                conveyorStatus_in.setACK(false);//sysj/orchestrator.sysj line: 26, column: 6
                                ends[1]=2;
                                ;//sysj/orchestrator.sysj line: 26, column: 6
                                conveyStat_thread_1 = (conveyorStatus_in.getVal() == null ? null : ((String)conveyorStatus_in.getVal()));//sysj/orchestrator.sysj line: 27, column: 6
                                if(conveyStat_thread_1 == "done") {//sysj/orchestrator.sysj line: 28, column: 31
                                  break ;//sysj/orchestrator.sysj line: 29, column: 7
                                }
                                S68=1;
                                active[1]=1;
                                ends[1]=1;
                                break RUN;
                              }
                              else {
                                active[1]=1;
                                ends[1]=1;
                                break RUN;
                              }
                            }
                            else {
                              active[1]=1;
                              ends[1]=1;
                              break RUN;
                            }
                          }
                        
                      }
                      break;
                    
                    case 1 : 
                      S68=1;
                      S68=0;
                      S52=0;
                      if(!conveyorStatus_in.isPartnerPresent() || conveyorStatus_in.isPartnerPreempted()){//sysj/orchestrator.sysj line: 26, column: 6
                        conveyorStatus_in.setACK(false);//sysj/orchestrator.sysj line: 26, column: 6
                        S52=1;
                        active[1]=1;
                        ends[1]=1;
                        break RUN;
                      }
                      else {
                        S47=0;
                        if(!conveyorStatus_in.isREQ()){//sysj/orchestrator.sysj line: 26, column: 6
                          conveyorStatus_in.setACK(true);//sysj/orchestrator.sysj line: 26, column: 6
                          S47=1;
                          if(conveyorStatus_in.isREQ()){//sysj/orchestrator.sysj line: 26, column: 6
                            conveyorStatus_in.setACK(false);//sysj/orchestrator.sysj line: 26, column: 6
                            ends[1]=2;
                            ;//sysj/orchestrator.sysj line: 26, column: 6
                            conveyStat_thread_1 = (conveyorStatus_in.getVal() == null ? null : ((String)conveyorStatus_in.getVal()));//sysj/orchestrator.sysj line: 27, column: 6
                            if(conveyStat_thread_1 == "done") {//sysj/orchestrator.sysj line: 28, column: 31
                              break ;//sysj/orchestrator.sysj line: 29, column: 7
                            }
                            S68=1;
                            active[1]=1;
                            ends[1]=1;
                            break RUN;
                          }
                          else {
                            active[1]=1;
                            ends[1]=1;
                            break RUN;
                          }
                        }
                        else {
                          active[1]=1;
                          ends[1]=1;
                          break RUN;
                        }
                      }
                    
                  }
                  break;
                
                case 2 : 
                  S45=2;
                  if(bottlePlaced_thread_1 <= 0){//sysj/orchestrator.sysj line: 20, column: 10
                    System.out.println("sending conveyor req?");//sysj/orchestrator.sysj line: 21, column: 5
                    S45=0;
                    S7=0;
                    if(!conveyorReq_o.isPartnerPresent() || conveyorReq_o.isPartnerPreempted()){//sysj/orchestrator.sysj line: 22, column: 5
                      conveyorReq_o.setREQ(false);//sysj/orchestrator.sysj line: 22, column: 5
                      S7=1;
                      active[1]=1;
                      ends[1]=1;
                      break RUN;
                    }
                    else {
                      S2=0;
                      if(conveyorReq_o.isACK()){//sysj/orchestrator.sysj line: 22, column: 5
                        conveyorReq_o.setVal(true);//sysj/orchestrator.sysj line: 22, column: 5
                        S2=1;
                        if(!conveyorReq_o.isACK()){//sysj/orchestrator.sysj line: 22, column: 5
                          conveyorReq_o.setREQ(false);//sysj/orchestrator.sysj line: 22, column: 5
                          ends[1]=2;
                          ;//sysj/orchestrator.sysj line: 22, column: 5
                          bottlePlaced_thread_1 = bottlePlaced_thread_1 - 1;//sysj/orchestrator.sysj line: 23, column: 5
                          S45=1;
                          S68=0;
                          S52=0;
                          if(!conveyorStatus_in.isPartnerPresent() || conveyorStatus_in.isPartnerPreempted()){//sysj/orchestrator.sysj line: 26, column: 6
                            conveyorStatus_in.setACK(false);//sysj/orchestrator.sysj line: 26, column: 6
                            S52=1;
                            active[1]=1;
                            ends[1]=1;
                            break RUN;
                          }
                          else {
                            S47=0;
                            if(!conveyorStatus_in.isREQ()){//sysj/orchestrator.sysj line: 26, column: 6
                              conveyorStatus_in.setACK(true);//sysj/orchestrator.sysj line: 26, column: 6
                              S47=1;
                              if(conveyorStatus_in.isREQ()){//sysj/orchestrator.sysj line: 26, column: 6
                                conveyorStatus_in.setACK(false);//sysj/orchestrator.sysj line: 26, column: 6
                                ends[1]=2;
                                ;//sysj/orchestrator.sysj line: 26, column: 6
                                conveyStat_thread_1 = (conveyorStatus_in.getVal() == null ? null : ((String)conveyorStatus_in.getVal()));//sysj/orchestrator.sysj line: 27, column: 6
                                if(conveyStat_thread_1 == "done") {//sysj/orchestrator.sysj line: 28, column: 31
                                  break ;//sysj/orchestrator.sysj line: 29, column: 7
                                }
                                S68=1;
                                active[1]=1;
                                ends[1]=1;
                                break RUN;
                              }
                              else {
                                active[1]=1;
                                ends[1]=1;
                                break RUN;
                              }
                            }
                            else {
                              active[1]=1;
                              ends[1]=1;
                              break RUN;
                            }
                          }
                        }
                        else {
                          active[1]=1;
                          ends[1]=1;
                          break RUN;
                        }
                      }
                      else {
                        active[1]=1;
                        ends[1]=1;
                        break RUN;
                      }
                    }
                  }
                  else {
                    conveyorStatus_in.setPreempted();//sysj/orchestrator.sysj line: 20, column: 4
                    conveyorReq_o.setPreempted();//sysj/orchestrator.sysj line: 20, column: 4
                    ends[1]=2;
                    ;//sysj/orchestrator.sysj line: 20, column: 4
                    System.out.println("Done order");//sysj/orchestrator.sysj line: 37, column: 4
                    S1935=1;
                    active[1]=1;
                    ends[1]=1;
                    break RUN;
                  }
                
              }
              break;
            
            case 1 : 
              S1935=1;
              bottlePlaced_thread_1 = quantity_thread_1;//sysj/orchestrator.sysj line: 19, column: 4
              S1935=0;
              if(bottlePlaced_thread_1 <= 0){//sysj/orchestrator.sysj line: 20, column: 10
                System.out.println("sending conveyor req?");//sysj/orchestrator.sysj line: 21, column: 5
                S45=0;
                S7=0;
                if(!conveyorReq_o.isPartnerPresent() || conveyorReq_o.isPartnerPreempted()){//sysj/orchestrator.sysj line: 22, column: 5
                  conveyorReq_o.setREQ(false);//sysj/orchestrator.sysj line: 22, column: 5
                  S7=1;
                  active[1]=1;
                  ends[1]=1;
                  break RUN;
                }
                else {
                  S2=0;
                  if(conveyorReq_o.isACK()){//sysj/orchestrator.sysj line: 22, column: 5
                    conveyorReq_o.setVal(true);//sysj/orchestrator.sysj line: 22, column: 5
                    S2=1;
                    if(!conveyorReq_o.isACK()){//sysj/orchestrator.sysj line: 22, column: 5
                      conveyorReq_o.setREQ(false);//sysj/orchestrator.sysj line: 22, column: 5
                      ends[1]=2;
                      ;//sysj/orchestrator.sysj line: 22, column: 5
                      bottlePlaced_thread_1 = bottlePlaced_thread_1 - 1;//sysj/orchestrator.sysj line: 23, column: 5
                      S45=1;
                      S68=0;
                      S52=0;
                      if(!conveyorStatus_in.isPartnerPresent() || conveyorStatus_in.isPartnerPreempted()){//sysj/orchestrator.sysj line: 26, column: 6
                        conveyorStatus_in.setACK(false);//sysj/orchestrator.sysj line: 26, column: 6
                        S52=1;
                        active[1]=1;
                        ends[1]=1;
                        break RUN;
                      }
                      else {
                        S47=0;
                        if(!conveyorStatus_in.isREQ()){//sysj/orchestrator.sysj line: 26, column: 6
                          conveyorStatus_in.setACK(true);//sysj/orchestrator.sysj line: 26, column: 6
                          S47=1;
                          if(conveyorStatus_in.isREQ()){//sysj/orchestrator.sysj line: 26, column: 6
                            conveyorStatus_in.setACK(false);//sysj/orchestrator.sysj line: 26, column: 6
                            ends[1]=2;
                            ;//sysj/orchestrator.sysj line: 26, column: 6
                            conveyStat_thread_1 = (conveyorStatus_in.getVal() == null ? null : ((String)conveyorStatus_in.getVal()));//sysj/orchestrator.sysj line: 27, column: 6
                            if(conveyStat_thread_1 == "done") {//sysj/orchestrator.sysj line: 28, column: 31
                              break ;//sysj/orchestrator.sysj line: 29, column: 7
                            }
                            S68=1;
                            active[1]=1;
                            ends[1]=1;
                            break RUN;
                          }
                          else {
                            active[1]=1;
                            ends[1]=1;
                            break RUN;
                          }
                        }
                        else {
                          active[1]=1;
                          ends[1]=1;
                          break RUN;
                        }
                      }
                    }
                    else {
                      active[1]=1;
                      ends[1]=1;
                      break RUN;
                    }
                  }
                  else {
                    active[1]=1;
                    ends[1]=1;
                    break RUN;
                  }
                }
              }
              else {
                conveyorStatus_in.setPreempted();//sysj/orchestrator.sysj line: 20, column: 4
                conveyorReq_o.setPreempted();//sysj/orchestrator.sysj line: 20, column: 4
                ends[1]=2;
                ;//sysj/orchestrator.sysj line: 20, column: 4
                System.out.println("Done order");//sysj/orchestrator.sysj line: 37, column: 4
                S1935=1;
                active[1]=1;
                ends[1]=1;
                break RUN;
              }
            
          }
        
      }
    }
  }

  public void init(){
    char [] active1 = {1, 1};
    char [] paused1 = {0, 0};
    char [] suspended1 = {0, 0};
    paused = paused1;
    active = active1;
    suspended = suspended1;
    // Now instantiate all the local signals ONLY
    // --------------------------------------------------
  }
  
  public void run(){
    while(active[1] != 0){
      int index = 1;
      if(paused[index]==1 || suspended[index]==1 || active[index] == 0){
        for(int h=1;h<paused.length;++h){
          paused[h]=0;
        }
      }
      if(paused[1]!=0 || suspended[1]!=0 || active[1]!=1);
      else{
        if(!df){
          conveyorStatus_in.gethook();
          rotaryStatus_in.gethook();
          order_in.gethook();
          conveyorReq_o.gethook();
          allOperationsFinished_o.gethook();
          doneOrder_o.gethook();
          df = true;
        }
        runClockDomain();
      }
      int dummyint = 0;
      for(int qw=0;qw<currsigs.size();++qw){
        dummyint = ((Signal)currsigs.elementAt(qw)).getStatus() ? ((Signal)currsigs.elementAt(qw)).setprepresent() : ((Signal)currsigs.elementAt(qw)).setpreclear();
        ((Signal)currsigs.elementAt(qw)).setpreval(((Signal)currsigs.elementAt(qw)).getValue());
      }
      currsigs.removeAllElements();
      conveyorStatus_in.sethook();
      rotaryStatus_in.sethook();
      order_in.sethook();
      conveyorReq_o.sethook();
      allOperationsFinished_o.sethook();
      doneOrder_o.sethook();
      if(paused[1]!=0 || suspended[1]!=0 || active[1]!=1);
      else{
        conveyorStatus_in.gethook();
        rotaryStatus_in.gethook();
        order_in.gethook();
        conveyorReq_o.gethook();
        allOperationsFinished_o.gethook();
        doneOrder_o.gethook();
      }
      runFinisher();
      if(active[1] == 0){
      	this.terminated = true;
      }
      if(!threaded) break;
    }
  }
}
