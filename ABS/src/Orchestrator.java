import java.util.*;
import com.systemj.ClockDomain;
import com.systemj.Signal;
import com.systemj.input_Channel;
import com.systemj.output_Channel;
import java.util.ArrayList;//sysj\orchestrator.sysj line: 1, column: 1

public class Orchestrator extends ClockDomain{
  public Orchestrator(String name){super(name);}
  Vector currsigs = new Vector();
  private boolean df = false;
  private char [] active;
  private char [] paused;
  private char [] suspended;
  public input_Channel conveyorStatus_in = new input_Channel();
  public input_Channel capperStatus_in = new input_Channel();
  public input_Channel capLoaderStatus_in = new input_Channel();
  public input_Channel fillerStatus_in = new input_Channel();
  public input_Channel rotaryStatus_in = new input_Channel();
  public input_Channel order_in = new input_Channel();
  public output_Channel conveyorReq_o = new output_Channel();
  public output_Channel allOperationsFinished_o = new output_Channel();
  public output_Channel fillerReq_o = new output_Channel();
  public output_Channel capperReq_o = new output_Channel();
  public output_Channel capLoaderReq_o = new output_Channel();
  public output_Channel doneOrder_o = new output_Channel();
  public output_Channel percentLiquid_o = new output_Channel();
  private Signal getNextBottle_1;
  private int quantity_thread_2;//sysj\orchestrator.sysj line: 20, column: 3
  private int bottlePlaced_thread_2;//sysj\orchestrator.sysj line: 21, column: 3
  private ArrayList liquidPercent_thread_2;//sysj\orchestrator.sysj line: 22, column: 3
  private String rotaryStat_thread_3;//sysj\orchestrator.sysj line: 50, column: 4
  private String conveyStat_thread_4;//sysj\orchestrator.sysj line: 71, column: 4
  private String fillerStat_thread_4;//sysj\orchestrator.sysj line: 72, column: 4
  private String screwerStat_thread_4;//sysj\orchestrator.sysj line: 73, column: 4
  private String loaderStat_thread_4;//sysj\orchestrator.sysj line: 74, column: 4
  private int S111603 = 1;
  private int S106653 = 1;
  private int S105137 = 1;
  private int S104879 = 1;
  private int S104841 = 1;
  private int S104836 = 1;
  private int S109652 = 1;
  private int S106676 = 1;
  private int S106660 = 1;
  private int S106655 = 1;
  private int S106787 = 1;
  private int S106683 = 1;
  private int S106678 = 1;
  private int S106705 = 1;
  private int S106700 = 1;
  private int S106794 = 1;
  private int S106789 = 1;
  private int S111601 = 1;
  private int S109763 = 1;
  private int S109659 = 1;
  private int S109654 = 1;
  private int S109681 = 1;
  private int S109676 = 1;
  private int S109770 = 1;
  private int S109765 = 1;
  private int S109902 = 1;
  private int S109897 = 1;
  private int S110078 = 1;
  private int S110073 = 1;
  
  private int[] ends = new int[5];
  private int[] tdone = new int[5];
  
  public void thread111611(int [] tdone, int [] ends){
        switch(S111601){
      case 0 : 
        active[4]=0;
        ends[4]=0;
        tdone[4]=1;
        break;
      
      case 1 : 
        switch(S109763){
          case 0 : 
            switch(S109659){
              case 0 : 
                if(!conveyorStatus_in.isPartnerPresent() || conveyorStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 66, column: 4
                  conveyorStatus_in.setACK(false);//sysj\orchestrator.sysj line: 66, column: 4
                  S109659=1;
                  active[4]=1;
                  ends[4]=1;
                  tdone[4]=1;
                }
                else {
                  switch(S109654){
                    case 0 : 
                      if(!conveyorStatus_in.isREQ()){//sysj\orchestrator.sysj line: 66, column: 4
                        conveyorStatus_in.setACK(true);//sysj\orchestrator.sysj line: 66, column: 4
                        S109654=1;
                        if(conveyorStatus_in.isREQ()){//sysj\orchestrator.sysj line: 66, column: 4
                          conveyorStatus_in.setACK(false);//sysj\orchestrator.sysj line: 66, column: 4
                          ends[4]=2;
                          ;//sysj\orchestrator.sysj line: 66, column: 4
                          S109763=1;
                          S109681=0;
                          if(!fillerStatus_in.isPartnerPresent() || fillerStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 67, column: 4
                            fillerStatus_in.setACK(false);//sysj\orchestrator.sysj line: 67, column: 4
                            S109681=1;
                            active[4]=1;
                            ends[4]=1;
                            tdone[4]=1;
                          }
                          else {
                            S109676=0;
                            if(!fillerStatus_in.isREQ()){//sysj\orchestrator.sysj line: 67, column: 4
                              fillerStatus_in.setACK(true);//sysj\orchestrator.sysj line: 67, column: 4
                              S109676=1;
                              if(fillerStatus_in.isREQ()){//sysj\orchestrator.sysj line: 67, column: 4
                                fillerStatus_in.setACK(false);//sysj\orchestrator.sysj line: 67, column: 4
                                ends[4]=2;
                                ;//sysj\orchestrator.sysj line: 67, column: 4
                                S109763=2;
                                S109770=0;
                                if(!capLoaderStatus_in.isPartnerPresent() || capLoaderStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 68, column: 4
                                  capLoaderStatus_in.setACK(false);//sysj\orchestrator.sysj line: 68, column: 4
                                  S109770=1;
                                  active[4]=1;
                                  ends[4]=1;
                                  tdone[4]=1;
                                }
                                else {
                                  S109765=0;
                                  if(!capLoaderStatus_in.isREQ()){//sysj\orchestrator.sysj line: 68, column: 4
                                    capLoaderStatus_in.setACK(true);//sysj\orchestrator.sysj line: 68, column: 4
                                    S109765=1;
                                    if(capLoaderStatus_in.isREQ()){//sysj\orchestrator.sysj line: 68, column: 4
                                      capLoaderStatus_in.setACK(false);//sysj\orchestrator.sysj line: 68, column: 4
                                      ends[4]=2;
                                      ;//sysj\orchestrator.sysj line: 68, column: 4
                                      S109763=3;
                                      S109902=0;
                                      if(!capperStatus_in.isPartnerPresent() || capperStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 69, column: 4
                                        capperStatus_in.setACK(false);//sysj\orchestrator.sysj line: 69, column: 4
                                        S109902=1;
                                        active[4]=1;
                                        ends[4]=1;
                                        tdone[4]=1;
                                      }
                                      else {
                                        S109897=0;
                                        if(!capperStatus_in.isREQ()){//sysj\orchestrator.sysj line: 69, column: 4
                                          capperStatus_in.setACK(true);//sysj\orchestrator.sysj line: 69, column: 4
                                          S109897=1;
                                          if(capperStatus_in.isREQ()){//sysj\orchestrator.sysj line: 69, column: 4
                                            capperStatus_in.setACK(false);//sysj\orchestrator.sysj line: 69, column: 4
                                            ends[4]=2;
                                            ;//sysj\orchestrator.sysj line: 69, column: 4
                                            conveyStat_thread_4 = (conveyorStatus_in.getVal() == null ? null : ((String)conveyorStatus_in.getVal()));//sysj\orchestrator.sysj line: 71, column: 4
                                            fillerStat_thread_4 = (fillerStatus_in.getVal() == null ? null : ((String)fillerStatus_in.getVal()));//sysj\orchestrator.sysj line: 72, column: 4
                                            screwerStat_thread_4 = (capLoaderStatus_in.getVal() == null ? null : ((String)capLoaderStatus_in.getVal()));//sysj\orchestrator.sysj line: 73, column: 4
                                            loaderStat_thread_4 = (capperStatus_in.getVal() == null ? null : ((String)capperStatus_in.getVal()));//sysj\orchestrator.sysj line: 74, column: 4
                                            S109763=4;
                                            if((conveyStat_thread_4 == "done" || conveyStat_thread_4 == "idle") && (fillerStat_thread_4 == "done" || fillerStat_thread_4 == "idle") && (screwerStat_thread_4 == "done" || screwerStat_thread_4 == "idle") && (loaderStat_thread_4 == "done" || loaderStat_thread_4 == "idle")){//sysj\orchestrator.sysj line: 77, column: 7
                                              S110078=0;
                                              if(!allOperationsFinished_o.isPartnerPresent() || allOperationsFinished_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 82, column: 5
                                                allOperationsFinished_o.setREQ(false);//sysj\orchestrator.sysj line: 82, column: 5
                                                S110078=1;
                                                active[4]=1;
                                                ends[4]=1;
                                                tdone[4]=1;
                                              }
                                              else {
                                                S110073=0;
                                                if(allOperationsFinished_o.isACK()){//sysj\orchestrator.sysj line: 82, column: 5
                                                  allOperationsFinished_o.setVal(true);//sysj\orchestrator.sysj line: 82, column: 5
                                                  S110073=1;
                                                  if(!allOperationsFinished_o.isACK()){//sysj\orchestrator.sysj line: 82, column: 5
                                                    allOperationsFinished_o.setREQ(false);//sysj\orchestrator.sysj line: 82, column: 5
                                                    ends[4]=2;
                                                    ;//sysj\orchestrator.sysj line: 82, column: 5
                                                    S109763=5;
                                                    active[4]=1;
                                                    ends[4]=1;
                                                    tdone[4]=1;
                                                  }
                                                  else {
                                                    active[4]=1;
                                                    ends[4]=1;
                                                    tdone[4]=1;
                                                  }
                                                }
                                                else {
                                                  active[4]=1;
                                                  ends[4]=1;
                                                  tdone[4]=1;
                                                }
                                              }
                                            }
                                            else {
                                              S109763=5;
                                              active[4]=1;
                                              ends[4]=1;
                                              tdone[4]=1;
                                            }
                                          }
                                          else {
                                            active[4]=1;
                                            ends[4]=1;
                                            tdone[4]=1;
                                          }
                                        }
                                        else {
                                          active[4]=1;
                                          ends[4]=1;
                                          tdone[4]=1;
                                        }
                                      }
                                    }
                                    else {
                                      active[4]=1;
                                      ends[4]=1;
                                      tdone[4]=1;
                                    }
                                  }
                                  else {
                                    active[4]=1;
                                    ends[4]=1;
                                    tdone[4]=1;
                                  }
                                }
                              }
                              else {
                                active[4]=1;
                                ends[4]=1;
                                tdone[4]=1;
                              }
                            }
                            else {
                              active[4]=1;
                              ends[4]=1;
                              tdone[4]=1;
                            }
                          }
                        }
                        else {
                          active[4]=1;
                          ends[4]=1;
                          tdone[4]=1;
                        }
                      }
                      else {
                        active[4]=1;
                        ends[4]=1;
                        tdone[4]=1;
                      }
                      break;
                    
                    case 1 : 
                      if(conveyorStatus_in.isREQ()){//sysj\orchestrator.sysj line: 66, column: 4
                        conveyorStatus_in.setACK(false);//sysj\orchestrator.sysj line: 66, column: 4
                        ends[4]=2;
                        ;//sysj\orchestrator.sysj line: 66, column: 4
                        S109763=1;
                        S109681=0;
                        if(!fillerStatus_in.isPartnerPresent() || fillerStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 67, column: 4
                          fillerStatus_in.setACK(false);//sysj\orchestrator.sysj line: 67, column: 4
                          S109681=1;
                          active[4]=1;
                          ends[4]=1;
                          tdone[4]=1;
                        }
                        else {
                          S109676=0;
                          if(!fillerStatus_in.isREQ()){//sysj\orchestrator.sysj line: 67, column: 4
                            fillerStatus_in.setACK(true);//sysj\orchestrator.sysj line: 67, column: 4
                            S109676=1;
                            if(fillerStatus_in.isREQ()){//sysj\orchestrator.sysj line: 67, column: 4
                              fillerStatus_in.setACK(false);//sysj\orchestrator.sysj line: 67, column: 4
                              ends[4]=2;
                              ;//sysj\orchestrator.sysj line: 67, column: 4
                              S109763=2;
                              S109770=0;
                              if(!capLoaderStatus_in.isPartnerPresent() || capLoaderStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 68, column: 4
                                capLoaderStatus_in.setACK(false);//sysj\orchestrator.sysj line: 68, column: 4
                                S109770=1;
                                active[4]=1;
                                ends[4]=1;
                                tdone[4]=1;
                              }
                              else {
                                S109765=0;
                                if(!capLoaderStatus_in.isREQ()){//sysj\orchestrator.sysj line: 68, column: 4
                                  capLoaderStatus_in.setACK(true);//sysj\orchestrator.sysj line: 68, column: 4
                                  S109765=1;
                                  if(capLoaderStatus_in.isREQ()){//sysj\orchestrator.sysj line: 68, column: 4
                                    capLoaderStatus_in.setACK(false);//sysj\orchestrator.sysj line: 68, column: 4
                                    ends[4]=2;
                                    ;//sysj\orchestrator.sysj line: 68, column: 4
                                    S109763=3;
                                    S109902=0;
                                    if(!capperStatus_in.isPartnerPresent() || capperStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 69, column: 4
                                      capperStatus_in.setACK(false);//sysj\orchestrator.sysj line: 69, column: 4
                                      S109902=1;
                                      active[4]=1;
                                      ends[4]=1;
                                      tdone[4]=1;
                                    }
                                    else {
                                      S109897=0;
                                      if(!capperStatus_in.isREQ()){//sysj\orchestrator.sysj line: 69, column: 4
                                        capperStatus_in.setACK(true);//sysj\orchestrator.sysj line: 69, column: 4
                                        S109897=1;
                                        if(capperStatus_in.isREQ()){//sysj\orchestrator.sysj line: 69, column: 4
                                          capperStatus_in.setACK(false);//sysj\orchestrator.sysj line: 69, column: 4
                                          ends[4]=2;
                                          ;//sysj\orchestrator.sysj line: 69, column: 4
                                          conveyStat_thread_4 = (conveyorStatus_in.getVal() == null ? null : ((String)conveyorStatus_in.getVal()));//sysj\orchestrator.sysj line: 71, column: 4
                                          fillerStat_thread_4 = (fillerStatus_in.getVal() == null ? null : ((String)fillerStatus_in.getVal()));//sysj\orchestrator.sysj line: 72, column: 4
                                          screwerStat_thread_4 = (capLoaderStatus_in.getVal() == null ? null : ((String)capLoaderStatus_in.getVal()));//sysj\orchestrator.sysj line: 73, column: 4
                                          loaderStat_thread_4 = (capperStatus_in.getVal() == null ? null : ((String)capperStatus_in.getVal()));//sysj\orchestrator.sysj line: 74, column: 4
                                          S109763=4;
                                          if((conveyStat_thread_4 == "done" || conveyStat_thread_4 == "idle") && (fillerStat_thread_4 == "done" || fillerStat_thread_4 == "idle") && (screwerStat_thread_4 == "done" || screwerStat_thread_4 == "idle") && (loaderStat_thread_4 == "done" || loaderStat_thread_4 == "idle")){//sysj\orchestrator.sysj line: 77, column: 7
                                            S110078=0;
                                            if(!allOperationsFinished_o.isPartnerPresent() || allOperationsFinished_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 82, column: 5
                                              allOperationsFinished_o.setREQ(false);//sysj\orchestrator.sysj line: 82, column: 5
                                              S110078=1;
                                              active[4]=1;
                                              ends[4]=1;
                                              tdone[4]=1;
                                            }
                                            else {
                                              S110073=0;
                                              if(allOperationsFinished_o.isACK()){//sysj\orchestrator.sysj line: 82, column: 5
                                                allOperationsFinished_o.setVal(true);//sysj\orchestrator.sysj line: 82, column: 5
                                                S110073=1;
                                                if(!allOperationsFinished_o.isACK()){//sysj\orchestrator.sysj line: 82, column: 5
                                                  allOperationsFinished_o.setREQ(false);//sysj\orchestrator.sysj line: 82, column: 5
                                                  ends[4]=2;
                                                  ;//sysj\orchestrator.sysj line: 82, column: 5
                                                  S109763=5;
                                                  active[4]=1;
                                                  ends[4]=1;
                                                  tdone[4]=1;
                                                }
                                                else {
                                                  active[4]=1;
                                                  ends[4]=1;
                                                  tdone[4]=1;
                                                }
                                              }
                                              else {
                                                active[4]=1;
                                                ends[4]=1;
                                                tdone[4]=1;
                                              }
                                            }
                                          }
                                          else {
                                            S109763=5;
                                            active[4]=1;
                                            ends[4]=1;
                                            tdone[4]=1;
                                          }
                                        }
                                        else {
                                          active[4]=1;
                                          ends[4]=1;
                                          tdone[4]=1;
                                        }
                                      }
                                      else {
                                        active[4]=1;
                                        ends[4]=1;
                                        tdone[4]=1;
                                      }
                                    }
                                  }
                                  else {
                                    active[4]=1;
                                    ends[4]=1;
                                    tdone[4]=1;
                                  }
                                }
                                else {
                                  active[4]=1;
                                  ends[4]=1;
                                  tdone[4]=1;
                                }
                              }
                            }
                            else {
                              active[4]=1;
                              ends[4]=1;
                              tdone[4]=1;
                            }
                          }
                          else {
                            active[4]=1;
                            ends[4]=1;
                            tdone[4]=1;
                          }
                        }
                      }
                      else {
                        active[4]=1;
                        ends[4]=1;
                        tdone[4]=1;
                      }
                      break;
                    
                  }
                }
                break;
              
              case 1 : 
                S109659=1;
                S109659=0;
                if(!conveyorStatus_in.isPartnerPresent() || conveyorStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 66, column: 4
                  conveyorStatus_in.setACK(false);//sysj\orchestrator.sysj line: 66, column: 4
                  S109659=1;
                  active[4]=1;
                  ends[4]=1;
                  tdone[4]=1;
                }
                else {
                  S109654=0;
                  if(!conveyorStatus_in.isREQ()){//sysj\orchestrator.sysj line: 66, column: 4
                    conveyorStatus_in.setACK(true);//sysj\orchestrator.sysj line: 66, column: 4
                    S109654=1;
                    if(conveyorStatus_in.isREQ()){//sysj\orchestrator.sysj line: 66, column: 4
                      conveyorStatus_in.setACK(false);//sysj\orchestrator.sysj line: 66, column: 4
                      ends[4]=2;
                      ;//sysj\orchestrator.sysj line: 66, column: 4
                      S109763=1;
                      S109681=0;
                      if(!fillerStatus_in.isPartnerPresent() || fillerStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 67, column: 4
                        fillerStatus_in.setACK(false);//sysj\orchestrator.sysj line: 67, column: 4
                        S109681=1;
                        active[4]=1;
                        ends[4]=1;
                        tdone[4]=1;
                      }
                      else {
                        S109676=0;
                        if(!fillerStatus_in.isREQ()){//sysj\orchestrator.sysj line: 67, column: 4
                          fillerStatus_in.setACK(true);//sysj\orchestrator.sysj line: 67, column: 4
                          S109676=1;
                          if(fillerStatus_in.isREQ()){//sysj\orchestrator.sysj line: 67, column: 4
                            fillerStatus_in.setACK(false);//sysj\orchestrator.sysj line: 67, column: 4
                            ends[4]=2;
                            ;//sysj\orchestrator.sysj line: 67, column: 4
                            S109763=2;
                            S109770=0;
                            if(!capLoaderStatus_in.isPartnerPresent() || capLoaderStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 68, column: 4
                              capLoaderStatus_in.setACK(false);//sysj\orchestrator.sysj line: 68, column: 4
                              S109770=1;
                              active[4]=1;
                              ends[4]=1;
                              tdone[4]=1;
                            }
                            else {
                              S109765=0;
                              if(!capLoaderStatus_in.isREQ()){//sysj\orchestrator.sysj line: 68, column: 4
                                capLoaderStatus_in.setACK(true);//sysj\orchestrator.sysj line: 68, column: 4
                                S109765=1;
                                if(capLoaderStatus_in.isREQ()){//sysj\orchestrator.sysj line: 68, column: 4
                                  capLoaderStatus_in.setACK(false);//sysj\orchestrator.sysj line: 68, column: 4
                                  ends[4]=2;
                                  ;//sysj\orchestrator.sysj line: 68, column: 4
                                  S109763=3;
                                  S109902=0;
                                  if(!capperStatus_in.isPartnerPresent() || capperStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 69, column: 4
                                    capperStatus_in.setACK(false);//sysj\orchestrator.sysj line: 69, column: 4
                                    S109902=1;
                                    active[4]=1;
                                    ends[4]=1;
                                    tdone[4]=1;
                                  }
                                  else {
                                    S109897=0;
                                    if(!capperStatus_in.isREQ()){//sysj\orchestrator.sysj line: 69, column: 4
                                      capperStatus_in.setACK(true);//sysj\orchestrator.sysj line: 69, column: 4
                                      S109897=1;
                                      if(capperStatus_in.isREQ()){//sysj\orchestrator.sysj line: 69, column: 4
                                        capperStatus_in.setACK(false);//sysj\orchestrator.sysj line: 69, column: 4
                                        ends[4]=2;
                                        ;//sysj\orchestrator.sysj line: 69, column: 4
                                        conveyStat_thread_4 = (conveyorStatus_in.getVal() == null ? null : ((String)conveyorStatus_in.getVal()));//sysj\orchestrator.sysj line: 71, column: 4
                                        fillerStat_thread_4 = (fillerStatus_in.getVal() == null ? null : ((String)fillerStatus_in.getVal()));//sysj\orchestrator.sysj line: 72, column: 4
                                        screwerStat_thread_4 = (capLoaderStatus_in.getVal() == null ? null : ((String)capLoaderStatus_in.getVal()));//sysj\orchestrator.sysj line: 73, column: 4
                                        loaderStat_thread_4 = (capperStatus_in.getVal() == null ? null : ((String)capperStatus_in.getVal()));//sysj\orchestrator.sysj line: 74, column: 4
                                        S109763=4;
                                        if((conveyStat_thread_4 == "done" || conveyStat_thread_4 == "idle") && (fillerStat_thread_4 == "done" || fillerStat_thread_4 == "idle") && (screwerStat_thread_4 == "done" || screwerStat_thread_4 == "idle") && (loaderStat_thread_4 == "done" || loaderStat_thread_4 == "idle")){//sysj\orchestrator.sysj line: 77, column: 7
                                          S110078=0;
                                          if(!allOperationsFinished_o.isPartnerPresent() || allOperationsFinished_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 82, column: 5
                                            allOperationsFinished_o.setREQ(false);//sysj\orchestrator.sysj line: 82, column: 5
                                            S110078=1;
                                            active[4]=1;
                                            ends[4]=1;
                                            tdone[4]=1;
                                          }
                                          else {
                                            S110073=0;
                                            if(allOperationsFinished_o.isACK()){//sysj\orchestrator.sysj line: 82, column: 5
                                              allOperationsFinished_o.setVal(true);//sysj\orchestrator.sysj line: 82, column: 5
                                              S110073=1;
                                              if(!allOperationsFinished_o.isACK()){//sysj\orchestrator.sysj line: 82, column: 5
                                                allOperationsFinished_o.setREQ(false);//sysj\orchestrator.sysj line: 82, column: 5
                                                ends[4]=2;
                                                ;//sysj\orchestrator.sysj line: 82, column: 5
                                                S109763=5;
                                                active[4]=1;
                                                ends[4]=1;
                                                tdone[4]=1;
                                              }
                                              else {
                                                active[4]=1;
                                                ends[4]=1;
                                                tdone[4]=1;
                                              }
                                            }
                                            else {
                                              active[4]=1;
                                              ends[4]=1;
                                              tdone[4]=1;
                                            }
                                          }
                                        }
                                        else {
                                          S109763=5;
                                          active[4]=1;
                                          ends[4]=1;
                                          tdone[4]=1;
                                        }
                                      }
                                      else {
                                        active[4]=1;
                                        ends[4]=1;
                                        tdone[4]=1;
                                      }
                                    }
                                    else {
                                      active[4]=1;
                                      ends[4]=1;
                                      tdone[4]=1;
                                    }
                                  }
                                }
                                else {
                                  active[4]=1;
                                  ends[4]=1;
                                  tdone[4]=1;
                                }
                              }
                              else {
                                active[4]=1;
                                ends[4]=1;
                                tdone[4]=1;
                              }
                            }
                          }
                          else {
                            active[4]=1;
                            ends[4]=1;
                            tdone[4]=1;
                          }
                        }
                        else {
                          active[4]=1;
                          ends[4]=1;
                          tdone[4]=1;
                        }
                      }
                    }
                    else {
                      active[4]=1;
                      ends[4]=1;
                      tdone[4]=1;
                    }
                  }
                  else {
                    active[4]=1;
                    ends[4]=1;
                    tdone[4]=1;
                  }
                }
                break;
              
            }
            break;
          
          case 1 : 
            switch(S109681){
              case 0 : 
                if(!fillerStatus_in.isPartnerPresent() || fillerStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 67, column: 4
                  fillerStatus_in.setACK(false);//sysj\orchestrator.sysj line: 67, column: 4
                  S109681=1;
                  active[4]=1;
                  ends[4]=1;
                  tdone[4]=1;
                }
                else {
                  switch(S109676){
                    case 0 : 
                      if(!fillerStatus_in.isREQ()){//sysj\orchestrator.sysj line: 67, column: 4
                        fillerStatus_in.setACK(true);//sysj\orchestrator.sysj line: 67, column: 4
                        S109676=1;
                        if(fillerStatus_in.isREQ()){//sysj\orchestrator.sysj line: 67, column: 4
                          fillerStatus_in.setACK(false);//sysj\orchestrator.sysj line: 67, column: 4
                          ends[4]=2;
                          ;//sysj\orchestrator.sysj line: 67, column: 4
                          S109763=2;
                          S109770=0;
                          if(!capLoaderStatus_in.isPartnerPresent() || capLoaderStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 68, column: 4
                            capLoaderStatus_in.setACK(false);//sysj\orchestrator.sysj line: 68, column: 4
                            S109770=1;
                            active[4]=1;
                            ends[4]=1;
                            tdone[4]=1;
                          }
                          else {
                            S109765=0;
                            if(!capLoaderStatus_in.isREQ()){//sysj\orchestrator.sysj line: 68, column: 4
                              capLoaderStatus_in.setACK(true);//sysj\orchestrator.sysj line: 68, column: 4
                              S109765=1;
                              if(capLoaderStatus_in.isREQ()){//sysj\orchestrator.sysj line: 68, column: 4
                                capLoaderStatus_in.setACK(false);//sysj\orchestrator.sysj line: 68, column: 4
                                ends[4]=2;
                                ;//sysj\orchestrator.sysj line: 68, column: 4
                                S109763=3;
                                S109902=0;
                                if(!capperStatus_in.isPartnerPresent() || capperStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 69, column: 4
                                  capperStatus_in.setACK(false);//sysj\orchestrator.sysj line: 69, column: 4
                                  S109902=1;
                                  active[4]=1;
                                  ends[4]=1;
                                  tdone[4]=1;
                                }
                                else {
                                  S109897=0;
                                  if(!capperStatus_in.isREQ()){//sysj\orchestrator.sysj line: 69, column: 4
                                    capperStatus_in.setACK(true);//sysj\orchestrator.sysj line: 69, column: 4
                                    S109897=1;
                                    if(capperStatus_in.isREQ()){//sysj\orchestrator.sysj line: 69, column: 4
                                      capperStatus_in.setACK(false);//sysj\orchestrator.sysj line: 69, column: 4
                                      ends[4]=2;
                                      ;//sysj\orchestrator.sysj line: 69, column: 4
                                      conveyStat_thread_4 = (conveyorStatus_in.getVal() == null ? null : ((String)conveyorStatus_in.getVal()));//sysj\orchestrator.sysj line: 71, column: 4
                                      fillerStat_thread_4 = (fillerStatus_in.getVal() == null ? null : ((String)fillerStatus_in.getVal()));//sysj\orchestrator.sysj line: 72, column: 4
                                      screwerStat_thread_4 = (capLoaderStatus_in.getVal() == null ? null : ((String)capLoaderStatus_in.getVal()));//sysj\orchestrator.sysj line: 73, column: 4
                                      loaderStat_thread_4 = (capperStatus_in.getVal() == null ? null : ((String)capperStatus_in.getVal()));//sysj\orchestrator.sysj line: 74, column: 4
                                      S109763=4;
                                      if((conveyStat_thread_4 == "done" || conveyStat_thread_4 == "idle") && (fillerStat_thread_4 == "done" || fillerStat_thread_4 == "idle") && (screwerStat_thread_4 == "done" || screwerStat_thread_4 == "idle") && (loaderStat_thread_4 == "done" || loaderStat_thread_4 == "idle")){//sysj\orchestrator.sysj line: 77, column: 7
                                        S110078=0;
                                        if(!allOperationsFinished_o.isPartnerPresent() || allOperationsFinished_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 82, column: 5
                                          allOperationsFinished_o.setREQ(false);//sysj\orchestrator.sysj line: 82, column: 5
                                          S110078=1;
                                          active[4]=1;
                                          ends[4]=1;
                                          tdone[4]=1;
                                        }
                                        else {
                                          S110073=0;
                                          if(allOperationsFinished_o.isACK()){//sysj\orchestrator.sysj line: 82, column: 5
                                            allOperationsFinished_o.setVal(true);//sysj\orchestrator.sysj line: 82, column: 5
                                            S110073=1;
                                            if(!allOperationsFinished_o.isACK()){//sysj\orchestrator.sysj line: 82, column: 5
                                              allOperationsFinished_o.setREQ(false);//sysj\orchestrator.sysj line: 82, column: 5
                                              ends[4]=2;
                                              ;//sysj\orchestrator.sysj line: 82, column: 5
                                              S109763=5;
                                              active[4]=1;
                                              ends[4]=1;
                                              tdone[4]=1;
                                            }
                                            else {
                                              active[4]=1;
                                              ends[4]=1;
                                              tdone[4]=1;
                                            }
                                          }
                                          else {
                                            active[4]=1;
                                            ends[4]=1;
                                            tdone[4]=1;
                                          }
                                        }
                                      }
                                      else {
                                        S109763=5;
                                        active[4]=1;
                                        ends[4]=1;
                                        tdone[4]=1;
                                      }
                                    }
                                    else {
                                      active[4]=1;
                                      ends[4]=1;
                                      tdone[4]=1;
                                    }
                                  }
                                  else {
                                    active[4]=1;
                                    ends[4]=1;
                                    tdone[4]=1;
                                  }
                                }
                              }
                              else {
                                active[4]=1;
                                ends[4]=1;
                                tdone[4]=1;
                              }
                            }
                            else {
                              active[4]=1;
                              ends[4]=1;
                              tdone[4]=1;
                            }
                          }
                        }
                        else {
                          active[4]=1;
                          ends[4]=1;
                          tdone[4]=1;
                        }
                      }
                      else {
                        active[4]=1;
                        ends[4]=1;
                        tdone[4]=1;
                      }
                      break;
                    
                    case 1 : 
                      if(fillerStatus_in.isREQ()){//sysj\orchestrator.sysj line: 67, column: 4
                        fillerStatus_in.setACK(false);//sysj\orchestrator.sysj line: 67, column: 4
                        ends[4]=2;
                        ;//sysj\orchestrator.sysj line: 67, column: 4
                        S109763=2;
                        S109770=0;
                        if(!capLoaderStatus_in.isPartnerPresent() || capLoaderStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 68, column: 4
                          capLoaderStatus_in.setACK(false);//sysj\orchestrator.sysj line: 68, column: 4
                          S109770=1;
                          active[4]=1;
                          ends[4]=1;
                          tdone[4]=1;
                        }
                        else {
                          S109765=0;
                          if(!capLoaderStatus_in.isREQ()){//sysj\orchestrator.sysj line: 68, column: 4
                            capLoaderStatus_in.setACK(true);//sysj\orchestrator.sysj line: 68, column: 4
                            S109765=1;
                            if(capLoaderStatus_in.isREQ()){//sysj\orchestrator.sysj line: 68, column: 4
                              capLoaderStatus_in.setACK(false);//sysj\orchestrator.sysj line: 68, column: 4
                              ends[4]=2;
                              ;//sysj\orchestrator.sysj line: 68, column: 4
                              S109763=3;
                              S109902=0;
                              if(!capperStatus_in.isPartnerPresent() || capperStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 69, column: 4
                                capperStatus_in.setACK(false);//sysj\orchestrator.sysj line: 69, column: 4
                                S109902=1;
                                active[4]=1;
                                ends[4]=1;
                                tdone[4]=1;
                              }
                              else {
                                S109897=0;
                                if(!capperStatus_in.isREQ()){//sysj\orchestrator.sysj line: 69, column: 4
                                  capperStatus_in.setACK(true);//sysj\orchestrator.sysj line: 69, column: 4
                                  S109897=1;
                                  if(capperStatus_in.isREQ()){//sysj\orchestrator.sysj line: 69, column: 4
                                    capperStatus_in.setACK(false);//sysj\orchestrator.sysj line: 69, column: 4
                                    ends[4]=2;
                                    ;//sysj\orchestrator.sysj line: 69, column: 4
                                    conveyStat_thread_4 = (conveyorStatus_in.getVal() == null ? null : ((String)conveyorStatus_in.getVal()));//sysj\orchestrator.sysj line: 71, column: 4
                                    fillerStat_thread_4 = (fillerStatus_in.getVal() == null ? null : ((String)fillerStatus_in.getVal()));//sysj\orchestrator.sysj line: 72, column: 4
                                    screwerStat_thread_4 = (capLoaderStatus_in.getVal() == null ? null : ((String)capLoaderStatus_in.getVal()));//sysj\orchestrator.sysj line: 73, column: 4
                                    loaderStat_thread_4 = (capperStatus_in.getVal() == null ? null : ((String)capperStatus_in.getVal()));//sysj\orchestrator.sysj line: 74, column: 4
                                    S109763=4;
                                    if((conveyStat_thread_4 == "done" || conveyStat_thread_4 == "idle") && (fillerStat_thread_4 == "done" || fillerStat_thread_4 == "idle") && (screwerStat_thread_4 == "done" || screwerStat_thread_4 == "idle") && (loaderStat_thread_4 == "done" || loaderStat_thread_4 == "idle")){//sysj\orchestrator.sysj line: 77, column: 7
                                      S110078=0;
                                      if(!allOperationsFinished_o.isPartnerPresent() || allOperationsFinished_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 82, column: 5
                                        allOperationsFinished_o.setREQ(false);//sysj\orchestrator.sysj line: 82, column: 5
                                        S110078=1;
                                        active[4]=1;
                                        ends[4]=1;
                                        tdone[4]=1;
                                      }
                                      else {
                                        S110073=0;
                                        if(allOperationsFinished_o.isACK()){//sysj\orchestrator.sysj line: 82, column: 5
                                          allOperationsFinished_o.setVal(true);//sysj\orchestrator.sysj line: 82, column: 5
                                          S110073=1;
                                          if(!allOperationsFinished_o.isACK()){//sysj\orchestrator.sysj line: 82, column: 5
                                            allOperationsFinished_o.setREQ(false);//sysj\orchestrator.sysj line: 82, column: 5
                                            ends[4]=2;
                                            ;//sysj\orchestrator.sysj line: 82, column: 5
                                            S109763=5;
                                            active[4]=1;
                                            ends[4]=1;
                                            tdone[4]=1;
                                          }
                                          else {
                                            active[4]=1;
                                            ends[4]=1;
                                            tdone[4]=1;
                                          }
                                        }
                                        else {
                                          active[4]=1;
                                          ends[4]=1;
                                          tdone[4]=1;
                                        }
                                      }
                                    }
                                    else {
                                      S109763=5;
                                      active[4]=1;
                                      ends[4]=1;
                                      tdone[4]=1;
                                    }
                                  }
                                  else {
                                    active[4]=1;
                                    ends[4]=1;
                                    tdone[4]=1;
                                  }
                                }
                                else {
                                  active[4]=1;
                                  ends[4]=1;
                                  tdone[4]=1;
                                }
                              }
                            }
                            else {
                              active[4]=1;
                              ends[4]=1;
                              tdone[4]=1;
                            }
                          }
                          else {
                            active[4]=1;
                            ends[4]=1;
                            tdone[4]=1;
                          }
                        }
                      }
                      else {
                        active[4]=1;
                        ends[4]=1;
                        tdone[4]=1;
                      }
                      break;
                    
                  }
                }
                break;
              
              case 1 : 
                S109681=1;
                S109681=0;
                if(!fillerStatus_in.isPartnerPresent() || fillerStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 67, column: 4
                  fillerStatus_in.setACK(false);//sysj\orchestrator.sysj line: 67, column: 4
                  S109681=1;
                  active[4]=1;
                  ends[4]=1;
                  tdone[4]=1;
                }
                else {
                  S109676=0;
                  if(!fillerStatus_in.isREQ()){//sysj\orchestrator.sysj line: 67, column: 4
                    fillerStatus_in.setACK(true);//sysj\orchestrator.sysj line: 67, column: 4
                    S109676=1;
                    if(fillerStatus_in.isREQ()){//sysj\orchestrator.sysj line: 67, column: 4
                      fillerStatus_in.setACK(false);//sysj\orchestrator.sysj line: 67, column: 4
                      ends[4]=2;
                      ;//sysj\orchestrator.sysj line: 67, column: 4
                      S109763=2;
                      S109770=0;
                      if(!capLoaderStatus_in.isPartnerPresent() || capLoaderStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 68, column: 4
                        capLoaderStatus_in.setACK(false);//sysj\orchestrator.sysj line: 68, column: 4
                        S109770=1;
                        active[4]=1;
                        ends[4]=1;
                        tdone[4]=1;
                      }
                      else {
                        S109765=0;
                        if(!capLoaderStatus_in.isREQ()){//sysj\orchestrator.sysj line: 68, column: 4
                          capLoaderStatus_in.setACK(true);//sysj\orchestrator.sysj line: 68, column: 4
                          S109765=1;
                          if(capLoaderStatus_in.isREQ()){//sysj\orchestrator.sysj line: 68, column: 4
                            capLoaderStatus_in.setACK(false);//sysj\orchestrator.sysj line: 68, column: 4
                            ends[4]=2;
                            ;//sysj\orchestrator.sysj line: 68, column: 4
                            S109763=3;
                            S109902=0;
                            if(!capperStatus_in.isPartnerPresent() || capperStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 69, column: 4
                              capperStatus_in.setACK(false);//sysj\orchestrator.sysj line: 69, column: 4
                              S109902=1;
                              active[4]=1;
                              ends[4]=1;
                              tdone[4]=1;
                            }
                            else {
                              S109897=0;
                              if(!capperStatus_in.isREQ()){//sysj\orchestrator.sysj line: 69, column: 4
                                capperStatus_in.setACK(true);//sysj\orchestrator.sysj line: 69, column: 4
                                S109897=1;
                                if(capperStatus_in.isREQ()){//sysj\orchestrator.sysj line: 69, column: 4
                                  capperStatus_in.setACK(false);//sysj\orchestrator.sysj line: 69, column: 4
                                  ends[4]=2;
                                  ;//sysj\orchestrator.sysj line: 69, column: 4
                                  conveyStat_thread_4 = (conveyorStatus_in.getVal() == null ? null : ((String)conveyorStatus_in.getVal()));//sysj\orchestrator.sysj line: 71, column: 4
                                  fillerStat_thread_4 = (fillerStatus_in.getVal() == null ? null : ((String)fillerStatus_in.getVal()));//sysj\orchestrator.sysj line: 72, column: 4
                                  screwerStat_thread_4 = (capLoaderStatus_in.getVal() == null ? null : ((String)capLoaderStatus_in.getVal()));//sysj\orchestrator.sysj line: 73, column: 4
                                  loaderStat_thread_4 = (capperStatus_in.getVal() == null ? null : ((String)capperStatus_in.getVal()));//sysj\orchestrator.sysj line: 74, column: 4
                                  S109763=4;
                                  if((conveyStat_thread_4 == "done" || conveyStat_thread_4 == "idle") && (fillerStat_thread_4 == "done" || fillerStat_thread_4 == "idle") && (screwerStat_thread_4 == "done" || screwerStat_thread_4 == "idle") && (loaderStat_thread_4 == "done" || loaderStat_thread_4 == "idle")){//sysj\orchestrator.sysj line: 77, column: 7
                                    S110078=0;
                                    if(!allOperationsFinished_o.isPartnerPresent() || allOperationsFinished_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 82, column: 5
                                      allOperationsFinished_o.setREQ(false);//sysj\orchestrator.sysj line: 82, column: 5
                                      S110078=1;
                                      active[4]=1;
                                      ends[4]=1;
                                      tdone[4]=1;
                                    }
                                    else {
                                      S110073=0;
                                      if(allOperationsFinished_o.isACK()){//sysj\orchestrator.sysj line: 82, column: 5
                                        allOperationsFinished_o.setVal(true);//sysj\orchestrator.sysj line: 82, column: 5
                                        S110073=1;
                                        if(!allOperationsFinished_o.isACK()){//sysj\orchestrator.sysj line: 82, column: 5
                                          allOperationsFinished_o.setREQ(false);//sysj\orchestrator.sysj line: 82, column: 5
                                          ends[4]=2;
                                          ;//sysj\orchestrator.sysj line: 82, column: 5
                                          S109763=5;
                                          active[4]=1;
                                          ends[4]=1;
                                          tdone[4]=1;
                                        }
                                        else {
                                          active[4]=1;
                                          ends[4]=1;
                                          tdone[4]=1;
                                        }
                                      }
                                      else {
                                        active[4]=1;
                                        ends[4]=1;
                                        tdone[4]=1;
                                      }
                                    }
                                  }
                                  else {
                                    S109763=5;
                                    active[4]=1;
                                    ends[4]=1;
                                    tdone[4]=1;
                                  }
                                }
                                else {
                                  active[4]=1;
                                  ends[4]=1;
                                  tdone[4]=1;
                                }
                              }
                              else {
                                active[4]=1;
                                ends[4]=1;
                                tdone[4]=1;
                              }
                            }
                          }
                          else {
                            active[4]=1;
                            ends[4]=1;
                            tdone[4]=1;
                          }
                        }
                        else {
                          active[4]=1;
                          ends[4]=1;
                          tdone[4]=1;
                        }
                      }
                    }
                    else {
                      active[4]=1;
                      ends[4]=1;
                      tdone[4]=1;
                    }
                  }
                  else {
                    active[4]=1;
                    ends[4]=1;
                    tdone[4]=1;
                  }
                }
                break;
              
            }
            break;
          
          case 2 : 
            switch(S109770){
              case 0 : 
                if(!capLoaderStatus_in.isPartnerPresent() || capLoaderStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 68, column: 4
                  capLoaderStatus_in.setACK(false);//sysj\orchestrator.sysj line: 68, column: 4
                  S109770=1;
                  active[4]=1;
                  ends[4]=1;
                  tdone[4]=1;
                }
                else {
                  switch(S109765){
                    case 0 : 
                      if(!capLoaderStatus_in.isREQ()){//sysj\orchestrator.sysj line: 68, column: 4
                        capLoaderStatus_in.setACK(true);//sysj\orchestrator.sysj line: 68, column: 4
                        S109765=1;
                        if(capLoaderStatus_in.isREQ()){//sysj\orchestrator.sysj line: 68, column: 4
                          capLoaderStatus_in.setACK(false);//sysj\orchestrator.sysj line: 68, column: 4
                          ends[4]=2;
                          ;//sysj\orchestrator.sysj line: 68, column: 4
                          S109763=3;
                          S109902=0;
                          if(!capperStatus_in.isPartnerPresent() || capperStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 69, column: 4
                            capperStatus_in.setACK(false);//sysj\orchestrator.sysj line: 69, column: 4
                            S109902=1;
                            active[4]=1;
                            ends[4]=1;
                            tdone[4]=1;
                          }
                          else {
                            S109897=0;
                            if(!capperStatus_in.isREQ()){//sysj\orchestrator.sysj line: 69, column: 4
                              capperStatus_in.setACK(true);//sysj\orchestrator.sysj line: 69, column: 4
                              S109897=1;
                              if(capperStatus_in.isREQ()){//sysj\orchestrator.sysj line: 69, column: 4
                                capperStatus_in.setACK(false);//sysj\orchestrator.sysj line: 69, column: 4
                                ends[4]=2;
                                ;//sysj\orchestrator.sysj line: 69, column: 4
                                conveyStat_thread_4 = (conveyorStatus_in.getVal() == null ? null : ((String)conveyorStatus_in.getVal()));//sysj\orchestrator.sysj line: 71, column: 4
                                fillerStat_thread_4 = (fillerStatus_in.getVal() == null ? null : ((String)fillerStatus_in.getVal()));//sysj\orchestrator.sysj line: 72, column: 4
                                screwerStat_thread_4 = (capLoaderStatus_in.getVal() == null ? null : ((String)capLoaderStatus_in.getVal()));//sysj\orchestrator.sysj line: 73, column: 4
                                loaderStat_thread_4 = (capperStatus_in.getVal() == null ? null : ((String)capperStatus_in.getVal()));//sysj\orchestrator.sysj line: 74, column: 4
                                S109763=4;
                                if((conveyStat_thread_4 == "done" || conveyStat_thread_4 == "idle") && (fillerStat_thread_4 == "done" || fillerStat_thread_4 == "idle") && (screwerStat_thread_4 == "done" || screwerStat_thread_4 == "idle") && (loaderStat_thread_4 == "done" || loaderStat_thread_4 == "idle")){//sysj\orchestrator.sysj line: 77, column: 7
                                  S110078=0;
                                  if(!allOperationsFinished_o.isPartnerPresent() || allOperationsFinished_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 82, column: 5
                                    allOperationsFinished_o.setREQ(false);//sysj\orchestrator.sysj line: 82, column: 5
                                    S110078=1;
                                    active[4]=1;
                                    ends[4]=1;
                                    tdone[4]=1;
                                  }
                                  else {
                                    S110073=0;
                                    if(allOperationsFinished_o.isACK()){//sysj\orchestrator.sysj line: 82, column: 5
                                      allOperationsFinished_o.setVal(true);//sysj\orchestrator.sysj line: 82, column: 5
                                      S110073=1;
                                      if(!allOperationsFinished_o.isACK()){//sysj\orchestrator.sysj line: 82, column: 5
                                        allOperationsFinished_o.setREQ(false);//sysj\orchestrator.sysj line: 82, column: 5
                                        ends[4]=2;
                                        ;//sysj\orchestrator.sysj line: 82, column: 5
                                        S109763=5;
                                        active[4]=1;
                                        ends[4]=1;
                                        tdone[4]=1;
                                      }
                                      else {
                                        active[4]=1;
                                        ends[4]=1;
                                        tdone[4]=1;
                                      }
                                    }
                                    else {
                                      active[4]=1;
                                      ends[4]=1;
                                      tdone[4]=1;
                                    }
                                  }
                                }
                                else {
                                  S109763=5;
                                  active[4]=1;
                                  ends[4]=1;
                                  tdone[4]=1;
                                }
                              }
                              else {
                                active[4]=1;
                                ends[4]=1;
                                tdone[4]=1;
                              }
                            }
                            else {
                              active[4]=1;
                              ends[4]=1;
                              tdone[4]=1;
                            }
                          }
                        }
                        else {
                          active[4]=1;
                          ends[4]=1;
                          tdone[4]=1;
                        }
                      }
                      else {
                        active[4]=1;
                        ends[4]=1;
                        tdone[4]=1;
                      }
                      break;
                    
                    case 1 : 
                      if(capLoaderStatus_in.isREQ()){//sysj\orchestrator.sysj line: 68, column: 4
                        capLoaderStatus_in.setACK(false);//sysj\orchestrator.sysj line: 68, column: 4
                        ends[4]=2;
                        ;//sysj\orchestrator.sysj line: 68, column: 4
                        S109763=3;
                        S109902=0;
                        if(!capperStatus_in.isPartnerPresent() || capperStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 69, column: 4
                          capperStatus_in.setACK(false);//sysj\orchestrator.sysj line: 69, column: 4
                          S109902=1;
                          active[4]=1;
                          ends[4]=1;
                          tdone[4]=1;
                        }
                        else {
                          S109897=0;
                          if(!capperStatus_in.isREQ()){//sysj\orchestrator.sysj line: 69, column: 4
                            capperStatus_in.setACK(true);//sysj\orchestrator.sysj line: 69, column: 4
                            S109897=1;
                            if(capperStatus_in.isREQ()){//sysj\orchestrator.sysj line: 69, column: 4
                              capperStatus_in.setACK(false);//sysj\orchestrator.sysj line: 69, column: 4
                              ends[4]=2;
                              ;//sysj\orchestrator.sysj line: 69, column: 4
                              conveyStat_thread_4 = (conveyorStatus_in.getVal() == null ? null : ((String)conveyorStatus_in.getVal()));//sysj\orchestrator.sysj line: 71, column: 4
                              fillerStat_thread_4 = (fillerStatus_in.getVal() == null ? null : ((String)fillerStatus_in.getVal()));//sysj\orchestrator.sysj line: 72, column: 4
                              screwerStat_thread_4 = (capLoaderStatus_in.getVal() == null ? null : ((String)capLoaderStatus_in.getVal()));//sysj\orchestrator.sysj line: 73, column: 4
                              loaderStat_thread_4 = (capperStatus_in.getVal() == null ? null : ((String)capperStatus_in.getVal()));//sysj\orchestrator.sysj line: 74, column: 4
                              S109763=4;
                              if((conveyStat_thread_4 == "done" || conveyStat_thread_4 == "idle") && (fillerStat_thread_4 == "done" || fillerStat_thread_4 == "idle") && (screwerStat_thread_4 == "done" || screwerStat_thread_4 == "idle") && (loaderStat_thread_4 == "done" || loaderStat_thread_4 == "idle")){//sysj\orchestrator.sysj line: 77, column: 7
                                S110078=0;
                                if(!allOperationsFinished_o.isPartnerPresent() || allOperationsFinished_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 82, column: 5
                                  allOperationsFinished_o.setREQ(false);//sysj\orchestrator.sysj line: 82, column: 5
                                  S110078=1;
                                  active[4]=1;
                                  ends[4]=1;
                                  tdone[4]=1;
                                }
                                else {
                                  S110073=0;
                                  if(allOperationsFinished_o.isACK()){//sysj\orchestrator.sysj line: 82, column: 5
                                    allOperationsFinished_o.setVal(true);//sysj\orchestrator.sysj line: 82, column: 5
                                    S110073=1;
                                    if(!allOperationsFinished_o.isACK()){//sysj\orchestrator.sysj line: 82, column: 5
                                      allOperationsFinished_o.setREQ(false);//sysj\orchestrator.sysj line: 82, column: 5
                                      ends[4]=2;
                                      ;//sysj\orchestrator.sysj line: 82, column: 5
                                      S109763=5;
                                      active[4]=1;
                                      ends[4]=1;
                                      tdone[4]=1;
                                    }
                                    else {
                                      active[4]=1;
                                      ends[4]=1;
                                      tdone[4]=1;
                                    }
                                  }
                                  else {
                                    active[4]=1;
                                    ends[4]=1;
                                    tdone[4]=1;
                                  }
                                }
                              }
                              else {
                                S109763=5;
                                active[4]=1;
                                ends[4]=1;
                                tdone[4]=1;
                              }
                            }
                            else {
                              active[4]=1;
                              ends[4]=1;
                              tdone[4]=1;
                            }
                          }
                          else {
                            active[4]=1;
                            ends[4]=1;
                            tdone[4]=1;
                          }
                        }
                      }
                      else {
                        active[4]=1;
                        ends[4]=1;
                        tdone[4]=1;
                      }
                      break;
                    
                  }
                }
                break;
              
              case 1 : 
                S109770=1;
                S109770=0;
                if(!capLoaderStatus_in.isPartnerPresent() || capLoaderStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 68, column: 4
                  capLoaderStatus_in.setACK(false);//sysj\orchestrator.sysj line: 68, column: 4
                  S109770=1;
                  active[4]=1;
                  ends[4]=1;
                  tdone[4]=1;
                }
                else {
                  S109765=0;
                  if(!capLoaderStatus_in.isREQ()){//sysj\orchestrator.sysj line: 68, column: 4
                    capLoaderStatus_in.setACK(true);//sysj\orchestrator.sysj line: 68, column: 4
                    S109765=1;
                    if(capLoaderStatus_in.isREQ()){//sysj\orchestrator.sysj line: 68, column: 4
                      capLoaderStatus_in.setACK(false);//sysj\orchestrator.sysj line: 68, column: 4
                      ends[4]=2;
                      ;//sysj\orchestrator.sysj line: 68, column: 4
                      S109763=3;
                      S109902=0;
                      if(!capperStatus_in.isPartnerPresent() || capperStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 69, column: 4
                        capperStatus_in.setACK(false);//sysj\orchestrator.sysj line: 69, column: 4
                        S109902=1;
                        active[4]=1;
                        ends[4]=1;
                        tdone[4]=1;
                      }
                      else {
                        S109897=0;
                        if(!capperStatus_in.isREQ()){//sysj\orchestrator.sysj line: 69, column: 4
                          capperStatus_in.setACK(true);//sysj\orchestrator.sysj line: 69, column: 4
                          S109897=1;
                          if(capperStatus_in.isREQ()){//sysj\orchestrator.sysj line: 69, column: 4
                            capperStatus_in.setACK(false);//sysj\orchestrator.sysj line: 69, column: 4
                            ends[4]=2;
                            ;//sysj\orchestrator.sysj line: 69, column: 4
                            conveyStat_thread_4 = (conveyorStatus_in.getVal() == null ? null : ((String)conveyorStatus_in.getVal()));//sysj\orchestrator.sysj line: 71, column: 4
                            fillerStat_thread_4 = (fillerStatus_in.getVal() == null ? null : ((String)fillerStatus_in.getVal()));//sysj\orchestrator.sysj line: 72, column: 4
                            screwerStat_thread_4 = (capLoaderStatus_in.getVal() == null ? null : ((String)capLoaderStatus_in.getVal()));//sysj\orchestrator.sysj line: 73, column: 4
                            loaderStat_thread_4 = (capperStatus_in.getVal() == null ? null : ((String)capperStatus_in.getVal()));//sysj\orchestrator.sysj line: 74, column: 4
                            S109763=4;
                            if((conveyStat_thread_4 == "done" || conveyStat_thread_4 == "idle") && (fillerStat_thread_4 == "done" || fillerStat_thread_4 == "idle") && (screwerStat_thread_4 == "done" || screwerStat_thread_4 == "idle") && (loaderStat_thread_4 == "done" || loaderStat_thread_4 == "idle")){//sysj\orchestrator.sysj line: 77, column: 7
                              S110078=0;
                              if(!allOperationsFinished_o.isPartnerPresent() || allOperationsFinished_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 82, column: 5
                                allOperationsFinished_o.setREQ(false);//sysj\orchestrator.sysj line: 82, column: 5
                                S110078=1;
                                active[4]=1;
                                ends[4]=1;
                                tdone[4]=1;
                              }
                              else {
                                S110073=0;
                                if(allOperationsFinished_o.isACK()){//sysj\orchestrator.sysj line: 82, column: 5
                                  allOperationsFinished_o.setVal(true);//sysj\orchestrator.sysj line: 82, column: 5
                                  S110073=1;
                                  if(!allOperationsFinished_o.isACK()){//sysj\orchestrator.sysj line: 82, column: 5
                                    allOperationsFinished_o.setREQ(false);//sysj\orchestrator.sysj line: 82, column: 5
                                    ends[4]=2;
                                    ;//sysj\orchestrator.sysj line: 82, column: 5
                                    S109763=5;
                                    active[4]=1;
                                    ends[4]=1;
                                    tdone[4]=1;
                                  }
                                  else {
                                    active[4]=1;
                                    ends[4]=1;
                                    tdone[4]=1;
                                  }
                                }
                                else {
                                  active[4]=1;
                                  ends[4]=1;
                                  tdone[4]=1;
                                }
                              }
                            }
                            else {
                              S109763=5;
                              active[4]=1;
                              ends[4]=1;
                              tdone[4]=1;
                            }
                          }
                          else {
                            active[4]=1;
                            ends[4]=1;
                            tdone[4]=1;
                          }
                        }
                        else {
                          active[4]=1;
                          ends[4]=1;
                          tdone[4]=1;
                        }
                      }
                    }
                    else {
                      active[4]=1;
                      ends[4]=1;
                      tdone[4]=1;
                    }
                  }
                  else {
                    active[4]=1;
                    ends[4]=1;
                    tdone[4]=1;
                  }
                }
                break;
              
            }
            break;
          
          case 3 : 
            switch(S109902){
              case 0 : 
                if(!capperStatus_in.isPartnerPresent() || capperStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 69, column: 4
                  capperStatus_in.setACK(false);//sysj\orchestrator.sysj line: 69, column: 4
                  S109902=1;
                  active[4]=1;
                  ends[4]=1;
                  tdone[4]=1;
                }
                else {
                  switch(S109897){
                    case 0 : 
                      if(!capperStatus_in.isREQ()){//sysj\orchestrator.sysj line: 69, column: 4
                        capperStatus_in.setACK(true);//sysj\orchestrator.sysj line: 69, column: 4
                        S109897=1;
                        if(capperStatus_in.isREQ()){//sysj\orchestrator.sysj line: 69, column: 4
                          capperStatus_in.setACK(false);//sysj\orchestrator.sysj line: 69, column: 4
                          ends[4]=2;
                          ;//sysj\orchestrator.sysj line: 69, column: 4
                          conveyStat_thread_4 = (conveyorStatus_in.getVal() == null ? null : ((String)conveyorStatus_in.getVal()));//sysj\orchestrator.sysj line: 71, column: 4
                          fillerStat_thread_4 = (fillerStatus_in.getVal() == null ? null : ((String)fillerStatus_in.getVal()));//sysj\orchestrator.sysj line: 72, column: 4
                          screwerStat_thread_4 = (capLoaderStatus_in.getVal() == null ? null : ((String)capLoaderStatus_in.getVal()));//sysj\orchestrator.sysj line: 73, column: 4
                          loaderStat_thread_4 = (capperStatus_in.getVal() == null ? null : ((String)capperStatus_in.getVal()));//sysj\orchestrator.sysj line: 74, column: 4
                          S109763=4;
                          if((conveyStat_thread_4 == "done" || conveyStat_thread_4 == "idle") && (fillerStat_thread_4 == "done" || fillerStat_thread_4 == "idle") && (screwerStat_thread_4 == "done" || screwerStat_thread_4 == "idle") && (loaderStat_thread_4 == "done" || loaderStat_thread_4 == "idle")){//sysj\orchestrator.sysj line: 77, column: 7
                            S110078=0;
                            if(!allOperationsFinished_o.isPartnerPresent() || allOperationsFinished_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 82, column: 5
                              allOperationsFinished_o.setREQ(false);//sysj\orchestrator.sysj line: 82, column: 5
                              S110078=1;
                              active[4]=1;
                              ends[4]=1;
                              tdone[4]=1;
                            }
                            else {
                              S110073=0;
                              if(allOperationsFinished_o.isACK()){//sysj\orchestrator.sysj line: 82, column: 5
                                allOperationsFinished_o.setVal(true);//sysj\orchestrator.sysj line: 82, column: 5
                                S110073=1;
                                if(!allOperationsFinished_o.isACK()){//sysj\orchestrator.sysj line: 82, column: 5
                                  allOperationsFinished_o.setREQ(false);//sysj\orchestrator.sysj line: 82, column: 5
                                  ends[4]=2;
                                  ;//sysj\orchestrator.sysj line: 82, column: 5
                                  S109763=5;
                                  active[4]=1;
                                  ends[4]=1;
                                  tdone[4]=1;
                                }
                                else {
                                  active[4]=1;
                                  ends[4]=1;
                                  tdone[4]=1;
                                }
                              }
                              else {
                                active[4]=1;
                                ends[4]=1;
                                tdone[4]=1;
                              }
                            }
                          }
                          else {
                            S109763=5;
                            active[4]=1;
                            ends[4]=1;
                            tdone[4]=1;
                          }
                        }
                        else {
                          active[4]=1;
                          ends[4]=1;
                          tdone[4]=1;
                        }
                      }
                      else {
                        active[4]=1;
                        ends[4]=1;
                        tdone[4]=1;
                      }
                      break;
                    
                    case 1 : 
                      if(capperStatus_in.isREQ()){//sysj\orchestrator.sysj line: 69, column: 4
                        capperStatus_in.setACK(false);//sysj\orchestrator.sysj line: 69, column: 4
                        ends[4]=2;
                        ;//sysj\orchestrator.sysj line: 69, column: 4
                        conveyStat_thread_4 = (conveyorStatus_in.getVal() == null ? null : ((String)conveyorStatus_in.getVal()));//sysj\orchestrator.sysj line: 71, column: 4
                        fillerStat_thread_4 = (fillerStatus_in.getVal() == null ? null : ((String)fillerStatus_in.getVal()));//sysj\orchestrator.sysj line: 72, column: 4
                        screwerStat_thread_4 = (capLoaderStatus_in.getVal() == null ? null : ((String)capLoaderStatus_in.getVal()));//sysj\orchestrator.sysj line: 73, column: 4
                        loaderStat_thread_4 = (capperStatus_in.getVal() == null ? null : ((String)capperStatus_in.getVal()));//sysj\orchestrator.sysj line: 74, column: 4
                        S109763=4;
                        if((conveyStat_thread_4 == "done" || conveyStat_thread_4 == "idle") && (fillerStat_thread_4 == "done" || fillerStat_thread_4 == "idle") && (screwerStat_thread_4 == "done" || screwerStat_thread_4 == "idle") && (loaderStat_thread_4 == "done" || loaderStat_thread_4 == "idle")){//sysj\orchestrator.sysj line: 77, column: 7
                          S110078=0;
                          if(!allOperationsFinished_o.isPartnerPresent() || allOperationsFinished_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 82, column: 5
                            allOperationsFinished_o.setREQ(false);//sysj\orchestrator.sysj line: 82, column: 5
                            S110078=1;
                            active[4]=1;
                            ends[4]=1;
                            tdone[4]=1;
                          }
                          else {
                            S110073=0;
                            if(allOperationsFinished_o.isACK()){//sysj\orchestrator.sysj line: 82, column: 5
                              allOperationsFinished_o.setVal(true);//sysj\orchestrator.sysj line: 82, column: 5
                              S110073=1;
                              if(!allOperationsFinished_o.isACK()){//sysj\orchestrator.sysj line: 82, column: 5
                                allOperationsFinished_o.setREQ(false);//sysj\orchestrator.sysj line: 82, column: 5
                                ends[4]=2;
                                ;//sysj\orchestrator.sysj line: 82, column: 5
                                S109763=5;
                                active[4]=1;
                                ends[4]=1;
                                tdone[4]=1;
                              }
                              else {
                                active[4]=1;
                                ends[4]=1;
                                tdone[4]=1;
                              }
                            }
                            else {
                              active[4]=1;
                              ends[4]=1;
                              tdone[4]=1;
                            }
                          }
                        }
                        else {
                          S109763=5;
                          active[4]=1;
                          ends[4]=1;
                          tdone[4]=1;
                        }
                      }
                      else {
                        active[4]=1;
                        ends[4]=1;
                        tdone[4]=1;
                      }
                      break;
                    
                  }
                }
                break;
              
              case 1 : 
                S109902=1;
                S109902=0;
                if(!capperStatus_in.isPartnerPresent() || capperStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 69, column: 4
                  capperStatus_in.setACK(false);//sysj\orchestrator.sysj line: 69, column: 4
                  S109902=1;
                  active[4]=1;
                  ends[4]=1;
                  tdone[4]=1;
                }
                else {
                  S109897=0;
                  if(!capperStatus_in.isREQ()){//sysj\orchestrator.sysj line: 69, column: 4
                    capperStatus_in.setACK(true);//sysj\orchestrator.sysj line: 69, column: 4
                    S109897=1;
                    if(capperStatus_in.isREQ()){//sysj\orchestrator.sysj line: 69, column: 4
                      capperStatus_in.setACK(false);//sysj\orchestrator.sysj line: 69, column: 4
                      ends[4]=2;
                      ;//sysj\orchestrator.sysj line: 69, column: 4
                      conveyStat_thread_4 = (conveyorStatus_in.getVal() == null ? null : ((String)conveyorStatus_in.getVal()));//sysj\orchestrator.sysj line: 71, column: 4
                      fillerStat_thread_4 = (fillerStatus_in.getVal() == null ? null : ((String)fillerStatus_in.getVal()));//sysj\orchestrator.sysj line: 72, column: 4
                      screwerStat_thread_4 = (capLoaderStatus_in.getVal() == null ? null : ((String)capLoaderStatus_in.getVal()));//sysj\orchestrator.sysj line: 73, column: 4
                      loaderStat_thread_4 = (capperStatus_in.getVal() == null ? null : ((String)capperStatus_in.getVal()));//sysj\orchestrator.sysj line: 74, column: 4
                      S109763=4;
                      if((conveyStat_thread_4 == "done" || conveyStat_thread_4 == "idle") && (fillerStat_thread_4 == "done" || fillerStat_thread_4 == "idle") && (screwerStat_thread_4 == "done" || screwerStat_thread_4 == "idle") && (loaderStat_thread_4 == "done" || loaderStat_thread_4 == "idle")){//sysj\orchestrator.sysj line: 77, column: 7
                        S110078=0;
                        if(!allOperationsFinished_o.isPartnerPresent() || allOperationsFinished_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 82, column: 5
                          allOperationsFinished_o.setREQ(false);//sysj\orchestrator.sysj line: 82, column: 5
                          S110078=1;
                          active[4]=1;
                          ends[4]=1;
                          tdone[4]=1;
                        }
                        else {
                          S110073=0;
                          if(allOperationsFinished_o.isACK()){//sysj\orchestrator.sysj line: 82, column: 5
                            allOperationsFinished_o.setVal(true);//sysj\orchestrator.sysj line: 82, column: 5
                            S110073=1;
                            if(!allOperationsFinished_o.isACK()){//sysj\orchestrator.sysj line: 82, column: 5
                              allOperationsFinished_o.setREQ(false);//sysj\orchestrator.sysj line: 82, column: 5
                              ends[4]=2;
                              ;//sysj\orchestrator.sysj line: 82, column: 5
                              S109763=5;
                              active[4]=1;
                              ends[4]=1;
                              tdone[4]=1;
                            }
                            else {
                              active[4]=1;
                              ends[4]=1;
                              tdone[4]=1;
                            }
                          }
                          else {
                            active[4]=1;
                            ends[4]=1;
                            tdone[4]=1;
                          }
                        }
                      }
                      else {
                        S109763=5;
                        active[4]=1;
                        ends[4]=1;
                        tdone[4]=1;
                      }
                    }
                    else {
                      active[4]=1;
                      ends[4]=1;
                      tdone[4]=1;
                    }
                  }
                  else {
                    active[4]=1;
                    ends[4]=1;
                    tdone[4]=1;
                  }
                }
                break;
              
            }
            break;
          
          case 4 : 
            switch(S110078){
              case 0 : 
                if(!allOperationsFinished_o.isPartnerPresent() || allOperationsFinished_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 82, column: 5
                  allOperationsFinished_o.setREQ(false);//sysj\orchestrator.sysj line: 82, column: 5
                  S110078=1;
                  active[4]=1;
                  ends[4]=1;
                  tdone[4]=1;
                }
                else {
                  switch(S110073){
                    case 0 : 
                      if(allOperationsFinished_o.isACK()){//sysj\orchestrator.sysj line: 82, column: 5
                        allOperationsFinished_o.setVal(true);//sysj\orchestrator.sysj line: 82, column: 5
                        S110073=1;
                        if(!allOperationsFinished_o.isACK()){//sysj\orchestrator.sysj line: 82, column: 5
                          allOperationsFinished_o.setREQ(false);//sysj\orchestrator.sysj line: 82, column: 5
                          ends[4]=2;
                          ;//sysj\orchestrator.sysj line: 82, column: 5
                          S109763=5;
                          active[4]=1;
                          ends[4]=1;
                          tdone[4]=1;
                        }
                        else {
                          active[4]=1;
                          ends[4]=1;
                          tdone[4]=1;
                        }
                      }
                      else {
                        active[4]=1;
                        ends[4]=1;
                        tdone[4]=1;
                      }
                      break;
                    
                    case 1 : 
                      if(!allOperationsFinished_o.isACK()){//sysj\orchestrator.sysj line: 82, column: 5
                        allOperationsFinished_o.setREQ(false);//sysj\orchestrator.sysj line: 82, column: 5
                        ends[4]=2;
                        ;//sysj\orchestrator.sysj line: 82, column: 5
                        S109763=5;
                        active[4]=1;
                        ends[4]=1;
                        tdone[4]=1;
                      }
                      else {
                        active[4]=1;
                        ends[4]=1;
                        tdone[4]=1;
                      }
                      break;
                    
                  }
                }
                break;
              
              case 1 : 
                S110078=1;
                S110078=0;
                if(!allOperationsFinished_o.isPartnerPresent() || allOperationsFinished_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 82, column: 5
                  allOperationsFinished_o.setREQ(false);//sysj\orchestrator.sysj line: 82, column: 5
                  S110078=1;
                  active[4]=1;
                  ends[4]=1;
                  tdone[4]=1;
                }
                else {
                  S110073=0;
                  if(allOperationsFinished_o.isACK()){//sysj\orchestrator.sysj line: 82, column: 5
                    allOperationsFinished_o.setVal(true);//sysj\orchestrator.sysj line: 82, column: 5
                    S110073=1;
                    if(!allOperationsFinished_o.isACK()){//sysj\orchestrator.sysj line: 82, column: 5
                      allOperationsFinished_o.setREQ(false);//sysj\orchestrator.sysj line: 82, column: 5
                      ends[4]=2;
                      ;//sysj\orchestrator.sysj line: 82, column: 5
                      S109763=5;
                      active[4]=1;
                      ends[4]=1;
                      tdone[4]=1;
                    }
                    else {
                      active[4]=1;
                      ends[4]=1;
                      tdone[4]=1;
                    }
                  }
                  else {
                    active[4]=1;
                    ends[4]=1;
                    tdone[4]=1;
                  }
                }
                break;
              
            }
            break;
          
          case 5 : 
            S109763=5;
            S109763=0;
            S109659=0;
            if(!conveyorStatus_in.isPartnerPresent() || conveyorStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 66, column: 4
              conveyorStatus_in.setACK(false);//sysj\orchestrator.sysj line: 66, column: 4
              S109659=1;
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            else {
              S109654=0;
              if(!conveyorStatus_in.isREQ()){//sysj\orchestrator.sysj line: 66, column: 4
                conveyorStatus_in.setACK(true);//sysj\orchestrator.sysj line: 66, column: 4
                S109654=1;
                if(conveyorStatus_in.isREQ()){//sysj\orchestrator.sysj line: 66, column: 4
                  conveyorStatus_in.setACK(false);//sysj\orchestrator.sysj line: 66, column: 4
                  ends[4]=2;
                  ;//sysj\orchestrator.sysj line: 66, column: 4
                  S109763=1;
                  S109681=0;
                  if(!fillerStatus_in.isPartnerPresent() || fillerStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 67, column: 4
                    fillerStatus_in.setACK(false);//sysj\orchestrator.sysj line: 67, column: 4
                    S109681=1;
                    active[4]=1;
                    ends[4]=1;
                    tdone[4]=1;
                  }
                  else {
                    S109676=0;
                    if(!fillerStatus_in.isREQ()){//sysj\orchestrator.sysj line: 67, column: 4
                      fillerStatus_in.setACK(true);//sysj\orchestrator.sysj line: 67, column: 4
                      S109676=1;
                      if(fillerStatus_in.isREQ()){//sysj\orchestrator.sysj line: 67, column: 4
                        fillerStatus_in.setACK(false);//sysj\orchestrator.sysj line: 67, column: 4
                        ends[4]=2;
                        ;//sysj\orchestrator.sysj line: 67, column: 4
                        S109763=2;
                        S109770=0;
                        if(!capLoaderStatus_in.isPartnerPresent() || capLoaderStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 68, column: 4
                          capLoaderStatus_in.setACK(false);//sysj\orchestrator.sysj line: 68, column: 4
                          S109770=1;
                          active[4]=1;
                          ends[4]=1;
                          tdone[4]=1;
                        }
                        else {
                          S109765=0;
                          if(!capLoaderStatus_in.isREQ()){//sysj\orchestrator.sysj line: 68, column: 4
                            capLoaderStatus_in.setACK(true);//sysj\orchestrator.sysj line: 68, column: 4
                            S109765=1;
                            if(capLoaderStatus_in.isREQ()){//sysj\orchestrator.sysj line: 68, column: 4
                              capLoaderStatus_in.setACK(false);//sysj\orchestrator.sysj line: 68, column: 4
                              ends[4]=2;
                              ;//sysj\orchestrator.sysj line: 68, column: 4
                              S109763=3;
                              S109902=0;
                              if(!capperStatus_in.isPartnerPresent() || capperStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 69, column: 4
                                capperStatus_in.setACK(false);//sysj\orchestrator.sysj line: 69, column: 4
                                S109902=1;
                                active[4]=1;
                                ends[4]=1;
                                tdone[4]=1;
                              }
                              else {
                                S109897=0;
                                if(!capperStatus_in.isREQ()){//sysj\orchestrator.sysj line: 69, column: 4
                                  capperStatus_in.setACK(true);//sysj\orchestrator.sysj line: 69, column: 4
                                  S109897=1;
                                  if(capperStatus_in.isREQ()){//sysj\orchestrator.sysj line: 69, column: 4
                                    capperStatus_in.setACK(false);//sysj\orchestrator.sysj line: 69, column: 4
                                    ends[4]=2;
                                    ;//sysj\orchestrator.sysj line: 69, column: 4
                                    conveyStat_thread_4 = (conveyorStatus_in.getVal() == null ? null : ((String)conveyorStatus_in.getVal()));//sysj\orchestrator.sysj line: 71, column: 4
                                    fillerStat_thread_4 = (fillerStatus_in.getVal() == null ? null : ((String)fillerStatus_in.getVal()));//sysj\orchestrator.sysj line: 72, column: 4
                                    screwerStat_thread_4 = (capLoaderStatus_in.getVal() == null ? null : ((String)capLoaderStatus_in.getVal()));//sysj\orchestrator.sysj line: 73, column: 4
                                    loaderStat_thread_4 = (capperStatus_in.getVal() == null ? null : ((String)capperStatus_in.getVal()));//sysj\orchestrator.sysj line: 74, column: 4
                                    S109763=4;
                                    if((conveyStat_thread_4 == "done" || conveyStat_thread_4 == "idle") && (fillerStat_thread_4 == "done" || fillerStat_thread_4 == "idle") && (screwerStat_thread_4 == "done" || screwerStat_thread_4 == "idle") && (loaderStat_thread_4 == "done" || loaderStat_thread_4 == "idle")){//sysj\orchestrator.sysj line: 77, column: 7
                                      S110078=0;
                                      if(!allOperationsFinished_o.isPartnerPresent() || allOperationsFinished_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 82, column: 5
                                        allOperationsFinished_o.setREQ(false);//sysj\orchestrator.sysj line: 82, column: 5
                                        S110078=1;
                                        active[4]=1;
                                        ends[4]=1;
                                        tdone[4]=1;
                                      }
                                      else {
                                        S110073=0;
                                        if(allOperationsFinished_o.isACK()){//sysj\orchestrator.sysj line: 82, column: 5
                                          allOperationsFinished_o.setVal(true);//sysj\orchestrator.sysj line: 82, column: 5
                                          S110073=1;
                                          if(!allOperationsFinished_o.isACK()){//sysj\orchestrator.sysj line: 82, column: 5
                                            allOperationsFinished_o.setREQ(false);//sysj\orchestrator.sysj line: 82, column: 5
                                            ends[4]=2;
                                            ;//sysj\orchestrator.sysj line: 82, column: 5
                                            S109763=5;
                                            active[4]=1;
                                            ends[4]=1;
                                            tdone[4]=1;
                                          }
                                          else {
                                            active[4]=1;
                                            ends[4]=1;
                                            tdone[4]=1;
                                          }
                                        }
                                        else {
                                          active[4]=1;
                                          ends[4]=1;
                                          tdone[4]=1;
                                        }
                                      }
                                    }
                                    else {
                                      S109763=5;
                                      active[4]=1;
                                      ends[4]=1;
                                      tdone[4]=1;
                                    }
                                  }
                                  else {
                                    active[4]=1;
                                    ends[4]=1;
                                    tdone[4]=1;
                                  }
                                }
                                else {
                                  active[4]=1;
                                  ends[4]=1;
                                  tdone[4]=1;
                                }
                              }
                            }
                            else {
                              active[4]=1;
                              ends[4]=1;
                              tdone[4]=1;
                            }
                          }
                          else {
                            active[4]=1;
                            ends[4]=1;
                            tdone[4]=1;
                          }
                        }
                      }
                      else {
                        active[4]=1;
                        ends[4]=1;
                        tdone[4]=1;
                      }
                    }
                    else {
                      active[4]=1;
                      ends[4]=1;
                      tdone[4]=1;
                    }
                  }
                }
                else {
                  active[4]=1;
                  ends[4]=1;
                  tdone[4]=1;
                }
              }
              else {
                active[4]=1;
                ends[4]=1;
                tdone[4]=1;
              }
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread111610(int [] tdone, int [] ends){
        switch(S109652){
      case 0 : 
        active[3]=0;
        ends[3]=0;
        tdone[3]=1;
        break;
      
      case 1 : 
        switch(S106676){
          case 0 : 
            switch(S106660){
              case 0 : 
                if(!rotaryStatus_in.isPartnerPresent() || rotaryStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 49, column: 4
                  rotaryStatus_in.setACK(false);//sysj\orchestrator.sysj line: 49, column: 4
                  S106660=1;
                  active[3]=1;
                  ends[3]=1;
                  tdone[3]=1;
                }
                else {
                  switch(S106655){
                    case 0 : 
                      if(!rotaryStatus_in.isREQ()){//sysj\orchestrator.sysj line: 49, column: 4
                        rotaryStatus_in.setACK(true);//sysj\orchestrator.sysj line: 49, column: 4
                        S106655=1;
                        if(rotaryStatus_in.isREQ()){//sysj\orchestrator.sysj line: 49, column: 4
                          rotaryStatus_in.setACK(false);//sysj\orchestrator.sysj line: 49, column: 4
                          ends[3]=2;
                          ;//sysj\orchestrator.sysj line: 49, column: 4
                          rotaryStat_thread_3 = (rotaryStatus_in.getVal() == null ? null : ((String)rotaryStatus_in.getVal()));//sysj\orchestrator.sysj line: 50, column: 4
                          S106676=1;
                          if(rotaryStat_thread_3 == "done"){//sysj\orchestrator.sysj line: 53, column: 7
                            S106787=0;
                            S106683=0;
                            if(!fillerReq_o.isPartnerPresent() || fillerReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 54, column: 5
                              fillerReq_o.setREQ(false);//sysj\orchestrator.sysj line: 54, column: 5
                              S106683=1;
                              active[3]=1;
                              ends[3]=1;
                              tdone[3]=1;
                            }
                            else {
                              S106678=0;
                              if(fillerReq_o.isACK()){//sysj\orchestrator.sysj line: 54, column: 5
                                fillerReq_o.setVal(true);//sysj\orchestrator.sysj line: 54, column: 5
                                S106678=1;
                                if(!fillerReq_o.isACK()){//sysj\orchestrator.sysj line: 54, column: 5
                                  fillerReq_o.setREQ(false);//sysj\orchestrator.sysj line: 54, column: 5
                                  ends[3]=2;
                                  ;//sysj\orchestrator.sysj line: 54, column: 5
                                  S106787=1;
                                  S106705=0;
                                  if(!capLoaderReq_o.isPartnerPresent() || capLoaderReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 55, column: 5
                                    capLoaderReq_o.setREQ(false);//sysj\orchestrator.sysj line: 55, column: 5
                                    S106705=1;
                                    active[3]=1;
                                    ends[3]=1;
                                    tdone[3]=1;
                                  }
                                  else {
                                    S106700=0;
                                    if(capLoaderReq_o.isACK()){//sysj\orchestrator.sysj line: 55, column: 5
                                      capLoaderReq_o.setVal(true);//sysj\orchestrator.sysj line: 55, column: 5
                                      S106700=1;
                                      if(!capLoaderReq_o.isACK()){//sysj\orchestrator.sysj line: 55, column: 5
                                        capLoaderReq_o.setREQ(false);//sysj\orchestrator.sysj line: 55, column: 5
                                        ends[3]=2;
                                        ;//sysj\orchestrator.sysj line: 55, column: 5
                                        S106787=2;
                                        S106794=0;
                                        if(!capperReq_o.isPartnerPresent() || capperReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 56, column: 5
                                          capperReq_o.setREQ(false);//sysj\orchestrator.sysj line: 56, column: 5
                                          S106794=1;
                                          active[3]=1;
                                          ends[3]=1;
                                          tdone[3]=1;
                                        }
                                        else {
                                          S106789=0;
                                          if(capperReq_o.isACK()){//sysj\orchestrator.sysj line: 56, column: 5
                                            capperReq_o.setVal(true);//sysj\orchestrator.sysj line: 56, column: 5
                                            S106789=1;
                                            if(!capperReq_o.isACK()){//sysj\orchestrator.sysj line: 56, column: 5
                                              capperReq_o.setREQ(false);//sysj\orchestrator.sysj line: 56, column: 5
                                              ends[3]=2;
                                              ;//sysj\orchestrator.sysj line: 56, column: 5
                                              getNextBottle_1.setPresent();//sysj\orchestrator.sysj line: 57, column: 5
                                              currsigs.addElement(getNextBottle_1);
                                              S106676=2;
                                              active[3]=1;
                                              ends[3]=1;
                                              tdone[3]=1;
                                            }
                                            else {
                                              active[3]=1;
                                              ends[3]=1;
                                              tdone[3]=1;
                                            }
                                          }
                                          else {
                                            active[3]=1;
                                            ends[3]=1;
                                            tdone[3]=1;
                                          }
                                        }
                                      }
                                      else {
                                        active[3]=1;
                                        ends[3]=1;
                                        tdone[3]=1;
                                      }
                                    }
                                    else {
                                      active[3]=1;
                                      ends[3]=1;
                                      tdone[3]=1;
                                    }
                                  }
                                }
                                else {
                                  active[3]=1;
                                  ends[3]=1;
                                  tdone[3]=1;
                                }
                              }
                              else {
                                active[3]=1;
                                ends[3]=1;
                                tdone[3]=1;
                              }
                            }
                          }
                          else {
                            S106676=2;
                            active[3]=1;
                            ends[3]=1;
                            tdone[3]=1;
                          }
                        }
                        else {
                          active[3]=1;
                          ends[3]=1;
                          tdone[3]=1;
                        }
                      }
                      else {
                        active[3]=1;
                        ends[3]=1;
                        tdone[3]=1;
                      }
                      break;
                    
                    case 1 : 
                      if(rotaryStatus_in.isREQ()){//sysj\orchestrator.sysj line: 49, column: 4
                        rotaryStatus_in.setACK(false);//sysj\orchestrator.sysj line: 49, column: 4
                        ends[3]=2;
                        ;//sysj\orchestrator.sysj line: 49, column: 4
                        rotaryStat_thread_3 = (rotaryStatus_in.getVal() == null ? null : ((String)rotaryStatus_in.getVal()));//sysj\orchestrator.sysj line: 50, column: 4
                        S106676=1;
                        if(rotaryStat_thread_3 == "done"){//sysj\orchestrator.sysj line: 53, column: 7
                          S106787=0;
                          S106683=0;
                          if(!fillerReq_o.isPartnerPresent() || fillerReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 54, column: 5
                            fillerReq_o.setREQ(false);//sysj\orchestrator.sysj line: 54, column: 5
                            S106683=1;
                            active[3]=1;
                            ends[3]=1;
                            tdone[3]=1;
                          }
                          else {
                            S106678=0;
                            if(fillerReq_o.isACK()){//sysj\orchestrator.sysj line: 54, column: 5
                              fillerReq_o.setVal(true);//sysj\orchestrator.sysj line: 54, column: 5
                              S106678=1;
                              if(!fillerReq_o.isACK()){//sysj\orchestrator.sysj line: 54, column: 5
                                fillerReq_o.setREQ(false);//sysj\orchestrator.sysj line: 54, column: 5
                                ends[3]=2;
                                ;//sysj\orchestrator.sysj line: 54, column: 5
                                S106787=1;
                                S106705=0;
                                if(!capLoaderReq_o.isPartnerPresent() || capLoaderReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 55, column: 5
                                  capLoaderReq_o.setREQ(false);//sysj\orchestrator.sysj line: 55, column: 5
                                  S106705=1;
                                  active[3]=1;
                                  ends[3]=1;
                                  tdone[3]=1;
                                }
                                else {
                                  S106700=0;
                                  if(capLoaderReq_o.isACK()){//sysj\orchestrator.sysj line: 55, column: 5
                                    capLoaderReq_o.setVal(true);//sysj\orchestrator.sysj line: 55, column: 5
                                    S106700=1;
                                    if(!capLoaderReq_o.isACK()){//sysj\orchestrator.sysj line: 55, column: 5
                                      capLoaderReq_o.setREQ(false);//sysj\orchestrator.sysj line: 55, column: 5
                                      ends[3]=2;
                                      ;//sysj\orchestrator.sysj line: 55, column: 5
                                      S106787=2;
                                      S106794=0;
                                      if(!capperReq_o.isPartnerPresent() || capperReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 56, column: 5
                                        capperReq_o.setREQ(false);//sysj\orchestrator.sysj line: 56, column: 5
                                        S106794=1;
                                        active[3]=1;
                                        ends[3]=1;
                                        tdone[3]=1;
                                      }
                                      else {
                                        S106789=0;
                                        if(capperReq_o.isACK()){//sysj\orchestrator.sysj line: 56, column: 5
                                          capperReq_o.setVal(true);//sysj\orchestrator.sysj line: 56, column: 5
                                          S106789=1;
                                          if(!capperReq_o.isACK()){//sysj\orchestrator.sysj line: 56, column: 5
                                            capperReq_o.setREQ(false);//sysj\orchestrator.sysj line: 56, column: 5
                                            ends[3]=2;
                                            ;//sysj\orchestrator.sysj line: 56, column: 5
                                            getNextBottle_1.setPresent();//sysj\orchestrator.sysj line: 57, column: 5
                                            currsigs.addElement(getNextBottle_1);
                                            S106676=2;
                                            active[3]=1;
                                            ends[3]=1;
                                            tdone[3]=1;
                                          }
                                          else {
                                            active[3]=1;
                                            ends[3]=1;
                                            tdone[3]=1;
                                          }
                                        }
                                        else {
                                          active[3]=1;
                                          ends[3]=1;
                                          tdone[3]=1;
                                        }
                                      }
                                    }
                                    else {
                                      active[3]=1;
                                      ends[3]=1;
                                      tdone[3]=1;
                                    }
                                  }
                                  else {
                                    active[3]=1;
                                    ends[3]=1;
                                    tdone[3]=1;
                                  }
                                }
                              }
                              else {
                                active[3]=1;
                                ends[3]=1;
                                tdone[3]=1;
                              }
                            }
                            else {
                              active[3]=1;
                              ends[3]=1;
                              tdone[3]=1;
                            }
                          }
                        }
                        else {
                          S106676=2;
                          active[3]=1;
                          ends[3]=1;
                          tdone[3]=1;
                        }
                      }
                      else {
                        active[3]=1;
                        ends[3]=1;
                        tdone[3]=1;
                      }
                      break;
                    
                  }
                }
                break;
              
              case 1 : 
                S106660=1;
                S106660=0;
                if(!rotaryStatus_in.isPartnerPresent() || rotaryStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 49, column: 4
                  rotaryStatus_in.setACK(false);//sysj\orchestrator.sysj line: 49, column: 4
                  S106660=1;
                  active[3]=1;
                  ends[3]=1;
                  tdone[3]=1;
                }
                else {
                  S106655=0;
                  if(!rotaryStatus_in.isREQ()){//sysj\orchestrator.sysj line: 49, column: 4
                    rotaryStatus_in.setACK(true);//sysj\orchestrator.sysj line: 49, column: 4
                    S106655=1;
                    if(rotaryStatus_in.isREQ()){//sysj\orchestrator.sysj line: 49, column: 4
                      rotaryStatus_in.setACK(false);//sysj\orchestrator.sysj line: 49, column: 4
                      ends[3]=2;
                      ;//sysj\orchestrator.sysj line: 49, column: 4
                      rotaryStat_thread_3 = (rotaryStatus_in.getVal() == null ? null : ((String)rotaryStatus_in.getVal()));//sysj\orchestrator.sysj line: 50, column: 4
                      S106676=1;
                      if(rotaryStat_thread_3 == "done"){//sysj\orchestrator.sysj line: 53, column: 7
                        S106787=0;
                        S106683=0;
                        if(!fillerReq_o.isPartnerPresent() || fillerReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 54, column: 5
                          fillerReq_o.setREQ(false);//sysj\orchestrator.sysj line: 54, column: 5
                          S106683=1;
                          active[3]=1;
                          ends[3]=1;
                          tdone[3]=1;
                        }
                        else {
                          S106678=0;
                          if(fillerReq_o.isACK()){//sysj\orchestrator.sysj line: 54, column: 5
                            fillerReq_o.setVal(true);//sysj\orchestrator.sysj line: 54, column: 5
                            S106678=1;
                            if(!fillerReq_o.isACK()){//sysj\orchestrator.sysj line: 54, column: 5
                              fillerReq_o.setREQ(false);//sysj\orchestrator.sysj line: 54, column: 5
                              ends[3]=2;
                              ;//sysj\orchestrator.sysj line: 54, column: 5
                              S106787=1;
                              S106705=0;
                              if(!capLoaderReq_o.isPartnerPresent() || capLoaderReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 55, column: 5
                                capLoaderReq_o.setREQ(false);//sysj\orchestrator.sysj line: 55, column: 5
                                S106705=1;
                                active[3]=1;
                                ends[3]=1;
                                tdone[3]=1;
                              }
                              else {
                                S106700=0;
                                if(capLoaderReq_o.isACK()){//sysj\orchestrator.sysj line: 55, column: 5
                                  capLoaderReq_o.setVal(true);//sysj\orchestrator.sysj line: 55, column: 5
                                  S106700=1;
                                  if(!capLoaderReq_o.isACK()){//sysj\orchestrator.sysj line: 55, column: 5
                                    capLoaderReq_o.setREQ(false);//sysj\orchestrator.sysj line: 55, column: 5
                                    ends[3]=2;
                                    ;//sysj\orchestrator.sysj line: 55, column: 5
                                    S106787=2;
                                    S106794=0;
                                    if(!capperReq_o.isPartnerPresent() || capperReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 56, column: 5
                                      capperReq_o.setREQ(false);//sysj\orchestrator.sysj line: 56, column: 5
                                      S106794=1;
                                      active[3]=1;
                                      ends[3]=1;
                                      tdone[3]=1;
                                    }
                                    else {
                                      S106789=0;
                                      if(capperReq_o.isACK()){//sysj\orchestrator.sysj line: 56, column: 5
                                        capperReq_o.setVal(true);//sysj\orchestrator.sysj line: 56, column: 5
                                        S106789=1;
                                        if(!capperReq_o.isACK()){//sysj\orchestrator.sysj line: 56, column: 5
                                          capperReq_o.setREQ(false);//sysj\orchestrator.sysj line: 56, column: 5
                                          ends[3]=2;
                                          ;//sysj\orchestrator.sysj line: 56, column: 5
                                          getNextBottle_1.setPresent();//sysj\orchestrator.sysj line: 57, column: 5
                                          currsigs.addElement(getNextBottle_1);
                                          S106676=2;
                                          active[3]=1;
                                          ends[3]=1;
                                          tdone[3]=1;
                                        }
                                        else {
                                          active[3]=1;
                                          ends[3]=1;
                                          tdone[3]=1;
                                        }
                                      }
                                      else {
                                        active[3]=1;
                                        ends[3]=1;
                                        tdone[3]=1;
                                      }
                                    }
                                  }
                                  else {
                                    active[3]=1;
                                    ends[3]=1;
                                    tdone[3]=1;
                                  }
                                }
                                else {
                                  active[3]=1;
                                  ends[3]=1;
                                  tdone[3]=1;
                                }
                              }
                            }
                            else {
                              active[3]=1;
                              ends[3]=1;
                              tdone[3]=1;
                            }
                          }
                          else {
                            active[3]=1;
                            ends[3]=1;
                            tdone[3]=1;
                          }
                        }
                      }
                      else {
                        S106676=2;
                        active[3]=1;
                        ends[3]=1;
                        tdone[3]=1;
                      }
                    }
                    else {
                      active[3]=1;
                      ends[3]=1;
                      tdone[3]=1;
                    }
                  }
                  else {
                    active[3]=1;
                    ends[3]=1;
                    tdone[3]=1;
                  }
                }
                break;
              
            }
            break;
          
          case 1 : 
            switch(S106787){
              case 0 : 
                switch(S106683){
                  case 0 : 
                    if(!fillerReq_o.isPartnerPresent() || fillerReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 54, column: 5
                      fillerReq_o.setREQ(false);//sysj\orchestrator.sysj line: 54, column: 5
                      S106683=1;
                      active[3]=1;
                      ends[3]=1;
                      tdone[3]=1;
                    }
                    else {
                      switch(S106678){
                        case 0 : 
                          if(fillerReq_o.isACK()){//sysj\orchestrator.sysj line: 54, column: 5
                            fillerReq_o.setVal(true);//sysj\orchestrator.sysj line: 54, column: 5
                            S106678=1;
                            if(!fillerReq_o.isACK()){//sysj\orchestrator.sysj line: 54, column: 5
                              fillerReq_o.setREQ(false);//sysj\orchestrator.sysj line: 54, column: 5
                              ends[3]=2;
                              ;//sysj\orchestrator.sysj line: 54, column: 5
                              S106787=1;
                              S106705=0;
                              if(!capLoaderReq_o.isPartnerPresent() || capLoaderReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 55, column: 5
                                capLoaderReq_o.setREQ(false);//sysj\orchestrator.sysj line: 55, column: 5
                                S106705=1;
                                active[3]=1;
                                ends[3]=1;
                                tdone[3]=1;
                              }
                              else {
                                S106700=0;
                                if(capLoaderReq_o.isACK()){//sysj\orchestrator.sysj line: 55, column: 5
                                  capLoaderReq_o.setVal(true);//sysj\orchestrator.sysj line: 55, column: 5
                                  S106700=1;
                                  if(!capLoaderReq_o.isACK()){//sysj\orchestrator.sysj line: 55, column: 5
                                    capLoaderReq_o.setREQ(false);//sysj\orchestrator.sysj line: 55, column: 5
                                    ends[3]=2;
                                    ;//sysj\orchestrator.sysj line: 55, column: 5
                                    S106787=2;
                                    S106794=0;
                                    if(!capperReq_o.isPartnerPresent() || capperReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 56, column: 5
                                      capperReq_o.setREQ(false);//sysj\orchestrator.sysj line: 56, column: 5
                                      S106794=1;
                                      active[3]=1;
                                      ends[3]=1;
                                      tdone[3]=1;
                                    }
                                    else {
                                      S106789=0;
                                      if(capperReq_o.isACK()){//sysj\orchestrator.sysj line: 56, column: 5
                                        capperReq_o.setVal(true);//sysj\orchestrator.sysj line: 56, column: 5
                                        S106789=1;
                                        if(!capperReq_o.isACK()){//sysj\orchestrator.sysj line: 56, column: 5
                                          capperReq_o.setREQ(false);//sysj\orchestrator.sysj line: 56, column: 5
                                          ends[3]=2;
                                          ;//sysj\orchestrator.sysj line: 56, column: 5
                                          getNextBottle_1.setPresent();//sysj\orchestrator.sysj line: 57, column: 5
                                          currsigs.addElement(getNextBottle_1);
                                          S106676=2;
                                          active[3]=1;
                                          ends[3]=1;
                                          tdone[3]=1;
                                        }
                                        else {
                                          active[3]=1;
                                          ends[3]=1;
                                          tdone[3]=1;
                                        }
                                      }
                                      else {
                                        active[3]=1;
                                        ends[3]=1;
                                        tdone[3]=1;
                                      }
                                    }
                                  }
                                  else {
                                    active[3]=1;
                                    ends[3]=1;
                                    tdone[3]=1;
                                  }
                                }
                                else {
                                  active[3]=1;
                                  ends[3]=1;
                                  tdone[3]=1;
                                }
                              }
                            }
                            else {
                              active[3]=1;
                              ends[3]=1;
                              tdone[3]=1;
                            }
                          }
                          else {
                            active[3]=1;
                            ends[3]=1;
                            tdone[3]=1;
                          }
                          break;
                        
                        case 1 : 
                          if(!fillerReq_o.isACK()){//sysj\orchestrator.sysj line: 54, column: 5
                            fillerReq_o.setREQ(false);//sysj\orchestrator.sysj line: 54, column: 5
                            ends[3]=2;
                            ;//sysj\orchestrator.sysj line: 54, column: 5
                            S106787=1;
                            S106705=0;
                            if(!capLoaderReq_o.isPartnerPresent() || capLoaderReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 55, column: 5
                              capLoaderReq_o.setREQ(false);//sysj\orchestrator.sysj line: 55, column: 5
                              S106705=1;
                              active[3]=1;
                              ends[3]=1;
                              tdone[3]=1;
                            }
                            else {
                              S106700=0;
                              if(capLoaderReq_o.isACK()){//sysj\orchestrator.sysj line: 55, column: 5
                                capLoaderReq_o.setVal(true);//sysj\orchestrator.sysj line: 55, column: 5
                                S106700=1;
                                if(!capLoaderReq_o.isACK()){//sysj\orchestrator.sysj line: 55, column: 5
                                  capLoaderReq_o.setREQ(false);//sysj\orchestrator.sysj line: 55, column: 5
                                  ends[3]=2;
                                  ;//sysj\orchestrator.sysj line: 55, column: 5
                                  S106787=2;
                                  S106794=0;
                                  if(!capperReq_o.isPartnerPresent() || capperReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 56, column: 5
                                    capperReq_o.setREQ(false);//sysj\orchestrator.sysj line: 56, column: 5
                                    S106794=1;
                                    active[3]=1;
                                    ends[3]=1;
                                    tdone[3]=1;
                                  }
                                  else {
                                    S106789=0;
                                    if(capperReq_o.isACK()){//sysj\orchestrator.sysj line: 56, column: 5
                                      capperReq_o.setVal(true);//sysj\orchestrator.sysj line: 56, column: 5
                                      S106789=1;
                                      if(!capperReq_o.isACK()){//sysj\orchestrator.sysj line: 56, column: 5
                                        capperReq_o.setREQ(false);//sysj\orchestrator.sysj line: 56, column: 5
                                        ends[3]=2;
                                        ;//sysj\orchestrator.sysj line: 56, column: 5
                                        getNextBottle_1.setPresent();//sysj\orchestrator.sysj line: 57, column: 5
                                        currsigs.addElement(getNextBottle_1);
                                        S106676=2;
                                        active[3]=1;
                                        ends[3]=1;
                                        tdone[3]=1;
                                      }
                                      else {
                                        active[3]=1;
                                        ends[3]=1;
                                        tdone[3]=1;
                                      }
                                    }
                                    else {
                                      active[3]=1;
                                      ends[3]=1;
                                      tdone[3]=1;
                                    }
                                  }
                                }
                                else {
                                  active[3]=1;
                                  ends[3]=1;
                                  tdone[3]=1;
                                }
                              }
                              else {
                                active[3]=1;
                                ends[3]=1;
                                tdone[3]=1;
                              }
                            }
                          }
                          else {
                            active[3]=1;
                            ends[3]=1;
                            tdone[3]=1;
                          }
                          break;
                        
                      }
                    }
                    break;
                  
                  case 1 : 
                    S106683=1;
                    S106683=0;
                    if(!fillerReq_o.isPartnerPresent() || fillerReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 54, column: 5
                      fillerReq_o.setREQ(false);//sysj\orchestrator.sysj line: 54, column: 5
                      S106683=1;
                      active[3]=1;
                      ends[3]=1;
                      tdone[3]=1;
                    }
                    else {
                      S106678=0;
                      if(fillerReq_o.isACK()){//sysj\orchestrator.sysj line: 54, column: 5
                        fillerReq_o.setVal(true);//sysj\orchestrator.sysj line: 54, column: 5
                        S106678=1;
                        if(!fillerReq_o.isACK()){//sysj\orchestrator.sysj line: 54, column: 5
                          fillerReq_o.setREQ(false);//sysj\orchestrator.sysj line: 54, column: 5
                          ends[3]=2;
                          ;//sysj\orchestrator.sysj line: 54, column: 5
                          S106787=1;
                          S106705=0;
                          if(!capLoaderReq_o.isPartnerPresent() || capLoaderReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 55, column: 5
                            capLoaderReq_o.setREQ(false);//sysj\orchestrator.sysj line: 55, column: 5
                            S106705=1;
                            active[3]=1;
                            ends[3]=1;
                            tdone[3]=1;
                          }
                          else {
                            S106700=0;
                            if(capLoaderReq_o.isACK()){//sysj\orchestrator.sysj line: 55, column: 5
                              capLoaderReq_o.setVal(true);//sysj\orchestrator.sysj line: 55, column: 5
                              S106700=1;
                              if(!capLoaderReq_o.isACK()){//sysj\orchestrator.sysj line: 55, column: 5
                                capLoaderReq_o.setREQ(false);//sysj\orchestrator.sysj line: 55, column: 5
                                ends[3]=2;
                                ;//sysj\orchestrator.sysj line: 55, column: 5
                                S106787=2;
                                S106794=0;
                                if(!capperReq_o.isPartnerPresent() || capperReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 56, column: 5
                                  capperReq_o.setREQ(false);//sysj\orchestrator.sysj line: 56, column: 5
                                  S106794=1;
                                  active[3]=1;
                                  ends[3]=1;
                                  tdone[3]=1;
                                }
                                else {
                                  S106789=0;
                                  if(capperReq_o.isACK()){//sysj\orchestrator.sysj line: 56, column: 5
                                    capperReq_o.setVal(true);//sysj\orchestrator.sysj line: 56, column: 5
                                    S106789=1;
                                    if(!capperReq_o.isACK()){//sysj\orchestrator.sysj line: 56, column: 5
                                      capperReq_o.setREQ(false);//sysj\orchestrator.sysj line: 56, column: 5
                                      ends[3]=2;
                                      ;//sysj\orchestrator.sysj line: 56, column: 5
                                      getNextBottle_1.setPresent();//sysj\orchestrator.sysj line: 57, column: 5
                                      currsigs.addElement(getNextBottle_1);
                                      S106676=2;
                                      active[3]=1;
                                      ends[3]=1;
                                      tdone[3]=1;
                                    }
                                    else {
                                      active[3]=1;
                                      ends[3]=1;
                                      tdone[3]=1;
                                    }
                                  }
                                  else {
                                    active[3]=1;
                                    ends[3]=1;
                                    tdone[3]=1;
                                  }
                                }
                              }
                              else {
                                active[3]=1;
                                ends[3]=1;
                                tdone[3]=1;
                              }
                            }
                            else {
                              active[3]=1;
                              ends[3]=1;
                              tdone[3]=1;
                            }
                          }
                        }
                        else {
                          active[3]=1;
                          ends[3]=1;
                          tdone[3]=1;
                        }
                      }
                      else {
                        active[3]=1;
                        ends[3]=1;
                        tdone[3]=1;
                      }
                    }
                    break;
                  
                }
                break;
              
              case 1 : 
                switch(S106705){
                  case 0 : 
                    if(!capLoaderReq_o.isPartnerPresent() || capLoaderReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 55, column: 5
                      capLoaderReq_o.setREQ(false);//sysj\orchestrator.sysj line: 55, column: 5
                      S106705=1;
                      active[3]=1;
                      ends[3]=1;
                      tdone[3]=1;
                    }
                    else {
                      switch(S106700){
                        case 0 : 
                          if(capLoaderReq_o.isACK()){//sysj\orchestrator.sysj line: 55, column: 5
                            capLoaderReq_o.setVal(true);//sysj\orchestrator.sysj line: 55, column: 5
                            S106700=1;
                            if(!capLoaderReq_o.isACK()){//sysj\orchestrator.sysj line: 55, column: 5
                              capLoaderReq_o.setREQ(false);//sysj\orchestrator.sysj line: 55, column: 5
                              ends[3]=2;
                              ;//sysj\orchestrator.sysj line: 55, column: 5
                              S106787=2;
                              S106794=0;
                              if(!capperReq_o.isPartnerPresent() || capperReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 56, column: 5
                                capperReq_o.setREQ(false);//sysj\orchestrator.sysj line: 56, column: 5
                                S106794=1;
                                active[3]=1;
                                ends[3]=1;
                                tdone[3]=1;
                              }
                              else {
                                S106789=0;
                                if(capperReq_o.isACK()){//sysj\orchestrator.sysj line: 56, column: 5
                                  capperReq_o.setVal(true);//sysj\orchestrator.sysj line: 56, column: 5
                                  S106789=1;
                                  if(!capperReq_o.isACK()){//sysj\orchestrator.sysj line: 56, column: 5
                                    capperReq_o.setREQ(false);//sysj\orchestrator.sysj line: 56, column: 5
                                    ends[3]=2;
                                    ;//sysj\orchestrator.sysj line: 56, column: 5
                                    getNextBottle_1.setPresent();//sysj\orchestrator.sysj line: 57, column: 5
                                    currsigs.addElement(getNextBottle_1);
                                    S106676=2;
                                    active[3]=1;
                                    ends[3]=1;
                                    tdone[3]=1;
                                  }
                                  else {
                                    active[3]=1;
                                    ends[3]=1;
                                    tdone[3]=1;
                                  }
                                }
                                else {
                                  active[3]=1;
                                  ends[3]=1;
                                  tdone[3]=1;
                                }
                              }
                            }
                            else {
                              active[3]=1;
                              ends[3]=1;
                              tdone[3]=1;
                            }
                          }
                          else {
                            active[3]=1;
                            ends[3]=1;
                            tdone[3]=1;
                          }
                          break;
                        
                        case 1 : 
                          if(!capLoaderReq_o.isACK()){//sysj\orchestrator.sysj line: 55, column: 5
                            capLoaderReq_o.setREQ(false);//sysj\orchestrator.sysj line: 55, column: 5
                            ends[3]=2;
                            ;//sysj\orchestrator.sysj line: 55, column: 5
                            S106787=2;
                            S106794=0;
                            if(!capperReq_o.isPartnerPresent() || capperReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 56, column: 5
                              capperReq_o.setREQ(false);//sysj\orchestrator.sysj line: 56, column: 5
                              S106794=1;
                              active[3]=1;
                              ends[3]=1;
                              tdone[3]=1;
                            }
                            else {
                              S106789=0;
                              if(capperReq_o.isACK()){//sysj\orchestrator.sysj line: 56, column: 5
                                capperReq_o.setVal(true);//sysj\orchestrator.sysj line: 56, column: 5
                                S106789=1;
                                if(!capperReq_o.isACK()){//sysj\orchestrator.sysj line: 56, column: 5
                                  capperReq_o.setREQ(false);//sysj\orchestrator.sysj line: 56, column: 5
                                  ends[3]=2;
                                  ;//sysj\orchestrator.sysj line: 56, column: 5
                                  getNextBottle_1.setPresent();//sysj\orchestrator.sysj line: 57, column: 5
                                  currsigs.addElement(getNextBottle_1);
                                  S106676=2;
                                  active[3]=1;
                                  ends[3]=1;
                                  tdone[3]=1;
                                }
                                else {
                                  active[3]=1;
                                  ends[3]=1;
                                  tdone[3]=1;
                                }
                              }
                              else {
                                active[3]=1;
                                ends[3]=1;
                                tdone[3]=1;
                              }
                            }
                          }
                          else {
                            active[3]=1;
                            ends[3]=1;
                            tdone[3]=1;
                          }
                          break;
                        
                      }
                    }
                    break;
                  
                  case 1 : 
                    S106705=1;
                    S106705=0;
                    if(!capLoaderReq_o.isPartnerPresent() || capLoaderReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 55, column: 5
                      capLoaderReq_o.setREQ(false);//sysj\orchestrator.sysj line: 55, column: 5
                      S106705=1;
                      active[3]=1;
                      ends[3]=1;
                      tdone[3]=1;
                    }
                    else {
                      S106700=0;
                      if(capLoaderReq_o.isACK()){//sysj\orchestrator.sysj line: 55, column: 5
                        capLoaderReq_o.setVal(true);//sysj\orchestrator.sysj line: 55, column: 5
                        S106700=1;
                        if(!capLoaderReq_o.isACK()){//sysj\orchestrator.sysj line: 55, column: 5
                          capLoaderReq_o.setREQ(false);//sysj\orchestrator.sysj line: 55, column: 5
                          ends[3]=2;
                          ;//sysj\orchestrator.sysj line: 55, column: 5
                          S106787=2;
                          S106794=0;
                          if(!capperReq_o.isPartnerPresent() || capperReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 56, column: 5
                            capperReq_o.setREQ(false);//sysj\orchestrator.sysj line: 56, column: 5
                            S106794=1;
                            active[3]=1;
                            ends[3]=1;
                            tdone[3]=1;
                          }
                          else {
                            S106789=0;
                            if(capperReq_o.isACK()){//sysj\orchestrator.sysj line: 56, column: 5
                              capperReq_o.setVal(true);//sysj\orchestrator.sysj line: 56, column: 5
                              S106789=1;
                              if(!capperReq_o.isACK()){//sysj\orchestrator.sysj line: 56, column: 5
                                capperReq_o.setREQ(false);//sysj\orchestrator.sysj line: 56, column: 5
                                ends[3]=2;
                                ;//sysj\orchestrator.sysj line: 56, column: 5
                                getNextBottle_1.setPresent();//sysj\orchestrator.sysj line: 57, column: 5
                                currsigs.addElement(getNextBottle_1);
                                S106676=2;
                                active[3]=1;
                                ends[3]=1;
                                tdone[3]=1;
                              }
                              else {
                                active[3]=1;
                                ends[3]=1;
                                tdone[3]=1;
                              }
                            }
                            else {
                              active[3]=1;
                              ends[3]=1;
                              tdone[3]=1;
                            }
                          }
                        }
                        else {
                          active[3]=1;
                          ends[3]=1;
                          tdone[3]=1;
                        }
                      }
                      else {
                        active[3]=1;
                        ends[3]=1;
                        tdone[3]=1;
                      }
                    }
                    break;
                  
                }
                break;
              
              case 2 : 
                switch(S106794){
                  case 0 : 
                    if(!capperReq_o.isPartnerPresent() || capperReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 56, column: 5
                      capperReq_o.setREQ(false);//sysj\orchestrator.sysj line: 56, column: 5
                      S106794=1;
                      active[3]=1;
                      ends[3]=1;
                      tdone[3]=1;
                    }
                    else {
                      switch(S106789){
                        case 0 : 
                          if(capperReq_o.isACK()){//sysj\orchestrator.sysj line: 56, column: 5
                            capperReq_o.setVal(true);//sysj\orchestrator.sysj line: 56, column: 5
                            S106789=1;
                            if(!capperReq_o.isACK()){//sysj\orchestrator.sysj line: 56, column: 5
                              capperReq_o.setREQ(false);//sysj\orchestrator.sysj line: 56, column: 5
                              ends[3]=2;
                              ;//sysj\orchestrator.sysj line: 56, column: 5
                              getNextBottle_1.setPresent();//sysj\orchestrator.sysj line: 57, column: 5
                              currsigs.addElement(getNextBottle_1);
                              S106676=2;
                              active[3]=1;
                              ends[3]=1;
                              tdone[3]=1;
                            }
                            else {
                              active[3]=1;
                              ends[3]=1;
                              tdone[3]=1;
                            }
                          }
                          else {
                            active[3]=1;
                            ends[3]=1;
                            tdone[3]=1;
                          }
                          break;
                        
                        case 1 : 
                          if(!capperReq_o.isACK()){//sysj\orchestrator.sysj line: 56, column: 5
                            capperReq_o.setREQ(false);//sysj\orchestrator.sysj line: 56, column: 5
                            ends[3]=2;
                            ;//sysj\orchestrator.sysj line: 56, column: 5
                            getNextBottle_1.setPresent();//sysj\orchestrator.sysj line: 57, column: 5
                            currsigs.addElement(getNextBottle_1);
                            S106676=2;
                            active[3]=1;
                            ends[3]=1;
                            tdone[3]=1;
                          }
                          else {
                            active[3]=1;
                            ends[3]=1;
                            tdone[3]=1;
                          }
                          break;
                        
                      }
                    }
                    break;
                  
                  case 1 : 
                    S106794=1;
                    S106794=0;
                    if(!capperReq_o.isPartnerPresent() || capperReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 56, column: 5
                      capperReq_o.setREQ(false);//sysj\orchestrator.sysj line: 56, column: 5
                      S106794=1;
                      active[3]=1;
                      ends[3]=1;
                      tdone[3]=1;
                    }
                    else {
                      S106789=0;
                      if(capperReq_o.isACK()){//sysj\orchestrator.sysj line: 56, column: 5
                        capperReq_o.setVal(true);//sysj\orchestrator.sysj line: 56, column: 5
                        S106789=1;
                        if(!capperReq_o.isACK()){//sysj\orchestrator.sysj line: 56, column: 5
                          capperReq_o.setREQ(false);//sysj\orchestrator.sysj line: 56, column: 5
                          ends[3]=2;
                          ;//sysj\orchestrator.sysj line: 56, column: 5
                          getNextBottle_1.setPresent();//sysj\orchestrator.sysj line: 57, column: 5
                          currsigs.addElement(getNextBottle_1);
                          S106676=2;
                          active[3]=1;
                          ends[3]=1;
                          tdone[3]=1;
                        }
                        else {
                          active[3]=1;
                          ends[3]=1;
                          tdone[3]=1;
                        }
                      }
                      else {
                        active[3]=1;
                        ends[3]=1;
                        tdone[3]=1;
                      }
                    }
                    break;
                  
                }
                break;
              
            }
            break;
          
          case 2 : 
            S106676=2;
            S106676=0;
            S106660=0;
            if(!rotaryStatus_in.isPartnerPresent() || rotaryStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 49, column: 4
              rotaryStatus_in.setACK(false);//sysj\orchestrator.sysj line: 49, column: 4
              S106660=1;
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            else {
              S106655=0;
              if(!rotaryStatus_in.isREQ()){//sysj\orchestrator.sysj line: 49, column: 4
                rotaryStatus_in.setACK(true);//sysj\orchestrator.sysj line: 49, column: 4
                S106655=1;
                if(rotaryStatus_in.isREQ()){//sysj\orchestrator.sysj line: 49, column: 4
                  rotaryStatus_in.setACK(false);//sysj\orchestrator.sysj line: 49, column: 4
                  ends[3]=2;
                  ;//sysj\orchestrator.sysj line: 49, column: 4
                  rotaryStat_thread_3 = (rotaryStatus_in.getVal() == null ? null : ((String)rotaryStatus_in.getVal()));//sysj\orchestrator.sysj line: 50, column: 4
                  S106676=1;
                  if(rotaryStat_thread_3 == "done"){//sysj\orchestrator.sysj line: 53, column: 7
                    S106787=0;
                    S106683=0;
                    if(!fillerReq_o.isPartnerPresent() || fillerReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 54, column: 5
                      fillerReq_o.setREQ(false);//sysj\orchestrator.sysj line: 54, column: 5
                      S106683=1;
                      active[3]=1;
                      ends[3]=1;
                      tdone[3]=1;
                    }
                    else {
                      S106678=0;
                      if(fillerReq_o.isACK()){//sysj\orchestrator.sysj line: 54, column: 5
                        fillerReq_o.setVal(true);//sysj\orchestrator.sysj line: 54, column: 5
                        S106678=1;
                        if(!fillerReq_o.isACK()){//sysj\orchestrator.sysj line: 54, column: 5
                          fillerReq_o.setREQ(false);//sysj\orchestrator.sysj line: 54, column: 5
                          ends[3]=2;
                          ;//sysj\orchestrator.sysj line: 54, column: 5
                          S106787=1;
                          S106705=0;
                          if(!capLoaderReq_o.isPartnerPresent() || capLoaderReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 55, column: 5
                            capLoaderReq_o.setREQ(false);//sysj\orchestrator.sysj line: 55, column: 5
                            S106705=1;
                            active[3]=1;
                            ends[3]=1;
                            tdone[3]=1;
                          }
                          else {
                            S106700=0;
                            if(capLoaderReq_o.isACK()){//sysj\orchestrator.sysj line: 55, column: 5
                              capLoaderReq_o.setVal(true);//sysj\orchestrator.sysj line: 55, column: 5
                              S106700=1;
                              if(!capLoaderReq_o.isACK()){//sysj\orchestrator.sysj line: 55, column: 5
                                capLoaderReq_o.setREQ(false);//sysj\orchestrator.sysj line: 55, column: 5
                                ends[3]=2;
                                ;//sysj\orchestrator.sysj line: 55, column: 5
                                S106787=2;
                                S106794=0;
                                if(!capperReq_o.isPartnerPresent() || capperReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 56, column: 5
                                  capperReq_o.setREQ(false);//sysj\orchestrator.sysj line: 56, column: 5
                                  S106794=1;
                                  active[3]=1;
                                  ends[3]=1;
                                  tdone[3]=1;
                                }
                                else {
                                  S106789=0;
                                  if(capperReq_o.isACK()){//sysj\orchestrator.sysj line: 56, column: 5
                                    capperReq_o.setVal(true);//sysj\orchestrator.sysj line: 56, column: 5
                                    S106789=1;
                                    if(!capperReq_o.isACK()){//sysj\orchestrator.sysj line: 56, column: 5
                                      capperReq_o.setREQ(false);//sysj\orchestrator.sysj line: 56, column: 5
                                      ends[3]=2;
                                      ;//sysj\orchestrator.sysj line: 56, column: 5
                                      getNextBottle_1.setPresent();//sysj\orchestrator.sysj line: 57, column: 5
                                      currsigs.addElement(getNextBottle_1);
                                      S106676=2;
                                      active[3]=1;
                                      ends[3]=1;
                                      tdone[3]=1;
                                    }
                                    else {
                                      active[3]=1;
                                      ends[3]=1;
                                      tdone[3]=1;
                                    }
                                  }
                                  else {
                                    active[3]=1;
                                    ends[3]=1;
                                    tdone[3]=1;
                                  }
                                }
                              }
                              else {
                                active[3]=1;
                                ends[3]=1;
                                tdone[3]=1;
                              }
                            }
                            else {
                              active[3]=1;
                              ends[3]=1;
                              tdone[3]=1;
                            }
                          }
                        }
                        else {
                          active[3]=1;
                          ends[3]=1;
                          tdone[3]=1;
                        }
                      }
                      else {
                        active[3]=1;
                        ends[3]=1;
                        tdone[3]=1;
                      }
                    }
                  }
                  else {
                    S106676=2;
                    active[3]=1;
                    ends[3]=1;
                    tdone[3]=1;
                  }
                }
                else {
                  active[3]=1;
                  ends[3]=1;
                  tdone[3]=1;
                }
              }
              else {
                active[3]=1;
                ends[3]=1;
                tdone[3]=1;
              }
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread111609(int [] tdone, int [] ends){
        switch(S106653){
      case 0 : 
        active[2]=0;
        ends[2]=0;
        tdone[2]=1;
        break;
      
      case 1 : 
        switch(S105137){
          case 0 : 
            switch(S104879){
              case 0 : 
                switch(S104841){
                  case 0 : 
                    if(!conveyorReq_o.isPartnerPresent() || conveyorReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 32, column: 5
                      conveyorReq_o.setREQ(false);//sysj\orchestrator.sysj line: 32, column: 5
                      S104841=1;
                      active[2]=1;
                      ends[2]=1;
                      tdone[2]=1;
                    }
                    else {
                      switch(S104836){
                        case 0 : 
                          if(conveyorReq_o.isACK()){//sysj\orchestrator.sysj line: 32, column: 5
                            conveyorReq_o.setVal(true);//sysj\orchestrator.sysj line: 32, column: 5
                            S104836=1;
                            if(!conveyorReq_o.isACK()){//sysj\orchestrator.sysj line: 32, column: 5
                              conveyorReq_o.setREQ(false);//sysj\orchestrator.sysj line: 32, column: 5
                              ends[2]=2;
                              ;//sysj\orchestrator.sysj line: 32, column: 5
                              bottlePlaced_thread_2 = bottlePlaced_thread_2 - 1;//sysj\orchestrator.sysj line: 33, column: 5
                              System.out.println(liquidPercent_thread_2.get(3));//sysj\orchestrator.sysj line: 34, column: 5
                              S104879=1;
                              active[2]=1;
                              ends[2]=1;
                              tdone[2]=1;
                            }
                            else {
                              active[2]=1;
                              ends[2]=1;
                              tdone[2]=1;
                            }
                          }
                          else {
                            active[2]=1;
                            ends[2]=1;
                            tdone[2]=1;
                          }
                          break;
                        
                        case 1 : 
                          if(!conveyorReq_o.isACK()){//sysj\orchestrator.sysj line: 32, column: 5
                            conveyorReq_o.setREQ(false);//sysj\orchestrator.sysj line: 32, column: 5
                            ends[2]=2;
                            ;//sysj\orchestrator.sysj line: 32, column: 5
                            bottlePlaced_thread_2 = bottlePlaced_thread_2 - 1;//sysj\orchestrator.sysj line: 33, column: 5
                            System.out.println(liquidPercent_thread_2.get(3));//sysj\orchestrator.sysj line: 34, column: 5
                            S104879=1;
                            active[2]=1;
                            ends[2]=1;
                            tdone[2]=1;
                          }
                          else {
                            active[2]=1;
                            ends[2]=1;
                            tdone[2]=1;
                          }
                          break;
                        
                      }
                    }
                    break;
                  
                  case 1 : 
                    S104841=1;
                    S104841=0;
                    if(!conveyorReq_o.isPartnerPresent() || conveyorReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 32, column: 5
                      conveyorReq_o.setREQ(false);//sysj\orchestrator.sysj line: 32, column: 5
                      S104841=1;
                      active[2]=1;
                      ends[2]=1;
                      tdone[2]=1;
                    }
                    else {
                      S104836=0;
                      if(conveyorReq_o.isACK()){//sysj\orchestrator.sysj line: 32, column: 5
                        conveyorReq_o.setVal(true);//sysj\orchestrator.sysj line: 32, column: 5
                        S104836=1;
                        if(!conveyorReq_o.isACK()){//sysj\orchestrator.sysj line: 32, column: 5
                          conveyorReq_o.setREQ(false);//sysj\orchestrator.sysj line: 32, column: 5
                          ends[2]=2;
                          ;//sysj\orchestrator.sysj line: 32, column: 5
                          bottlePlaced_thread_2 = bottlePlaced_thread_2 - 1;//sysj\orchestrator.sysj line: 33, column: 5
                          System.out.println(liquidPercent_thread_2.get(3));//sysj\orchestrator.sysj line: 34, column: 5
                          S104879=1;
                          active[2]=1;
                          ends[2]=1;
                          tdone[2]=1;
                        }
                        else {
                          active[2]=1;
                          ends[2]=1;
                          tdone[2]=1;
                        }
                      }
                      else {
                        active[2]=1;
                        ends[2]=1;
                        tdone[2]=1;
                      }
                    }
                    break;
                  
                }
                break;
              
              case 1 : 
                if(getNextBottle_1.getprestatus()){//sysj\orchestrator.sysj line: 35, column: 11
                  S104879=2;
                  active[2]=1;
                  ends[2]=1;
                  tdone[2]=1;
                }
                else {
                  active[2]=1;
                  ends[2]=1;
                  tdone[2]=1;
                }
                break;
              
              case 2 : 
                S104879=2;
                if(bottlePlaced_thread_2 <= 0){//sysj\orchestrator.sysj line: 30, column: 10
                  System.out.println("sending conveyor req?");//sysj\orchestrator.sysj line: 31, column: 5
                  S104879=0;
                  S104841=0;
                  if(!conveyorReq_o.isPartnerPresent() || conveyorReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 32, column: 5
                    conveyorReq_o.setREQ(false);//sysj\orchestrator.sysj line: 32, column: 5
                    S104841=1;
                    active[2]=1;
                    ends[2]=1;
                    tdone[2]=1;
                  }
                  else {
                    S104836=0;
                    if(conveyorReq_o.isACK()){//sysj\orchestrator.sysj line: 32, column: 5
                      conveyorReq_o.setVal(true);//sysj\orchestrator.sysj line: 32, column: 5
                      S104836=1;
                      if(!conveyorReq_o.isACK()){//sysj\orchestrator.sysj line: 32, column: 5
                        conveyorReq_o.setREQ(false);//sysj\orchestrator.sysj line: 32, column: 5
                        ends[2]=2;
                        ;//sysj\orchestrator.sysj line: 32, column: 5
                        bottlePlaced_thread_2 = bottlePlaced_thread_2 - 1;//sysj\orchestrator.sysj line: 33, column: 5
                        System.out.println(liquidPercent_thread_2.get(3));//sysj\orchestrator.sysj line: 34, column: 5
                        S104879=1;
                        active[2]=1;
                        ends[2]=1;
                        tdone[2]=1;
                      }
                      else {
                        active[2]=1;
                        ends[2]=1;
                        tdone[2]=1;
                      }
                    }
                    else {
                      active[2]=1;
                      ends[2]=1;
                      tdone[2]=1;
                    }
                  }
                }
                else {
                  conveyorReq_o.setPreempted();//sysj\orchestrator.sysj line: 30, column: 4
                  ends[2]=2;
                  ;//sysj\orchestrator.sysj line: 30, column: 4
                  System.out.println("Done order");//sysj\orchestrator.sysj line: 40, column: 4
                  S105137=1;
                  active[2]=1;
                  ends[2]=1;
                  tdone[2]=1;
                }
                break;
              
            }
            break;
          
          case 1 : 
            S105137=1;
            bottlePlaced_thread_2 = quantity_thread_2;//sysj\orchestrator.sysj line: 29, column: 4
            S105137=0;
            if(bottlePlaced_thread_2 <= 0){//sysj\orchestrator.sysj line: 30, column: 10
              System.out.println("sending conveyor req?");//sysj\orchestrator.sysj line: 31, column: 5
              S104879=0;
              S104841=0;
              if(!conveyorReq_o.isPartnerPresent() || conveyorReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 32, column: 5
                conveyorReq_o.setREQ(false);//sysj\orchestrator.sysj line: 32, column: 5
                S104841=1;
                active[2]=1;
                ends[2]=1;
                tdone[2]=1;
              }
              else {
                S104836=0;
                if(conveyorReq_o.isACK()){//sysj\orchestrator.sysj line: 32, column: 5
                  conveyorReq_o.setVal(true);//sysj\orchestrator.sysj line: 32, column: 5
                  S104836=1;
                  if(!conveyorReq_o.isACK()){//sysj\orchestrator.sysj line: 32, column: 5
                    conveyorReq_o.setREQ(false);//sysj\orchestrator.sysj line: 32, column: 5
                    ends[2]=2;
                    ;//sysj\orchestrator.sysj line: 32, column: 5
                    bottlePlaced_thread_2 = bottlePlaced_thread_2 - 1;//sysj\orchestrator.sysj line: 33, column: 5
                    System.out.println(liquidPercent_thread_2.get(3));//sysj\orchestrator.sysj line: 34, column: 5
                    S104879=1;
                    active[2]=1;
                    ends[2]=1;
                    tdone[2]=1;
                  }
                  else {
                    active[2]=1;
                    ends[2]=1;
                    tdone[2]=1;
                  }
                }
                else {
                  active[2]=1;
                  ends[2]=1;
                  tdone[2]=1;
                }
              }
            }
            else {
              conveyorReq_o.setPreempted();//sysj\orchestrator.sysj line: 30, column: 4
              ends[2]=2;
              ;//sysj\orchestrator.sysj line: 30, column: 4
              System.out.println("Done order");//sysj\orchestrator.sysj line: 40, column: 4
              S105137=1;
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread111607(int [] tdone, int [] ends){
        S111601=1;
    S109763=0;
    S109659=0;
    if(!conveyorStatus_in.isPartnerPresent() || conveyorStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 66, column: 4
      conveyorStatus_in.setACK(false);//sysj\orchestrator.sysj line: 66, column: 4
      S109659=1;
      active[4]=1;
      ends[4]=1;
      tdone[4]=1;
    }
    else {
      S109654=0;
      if(!conveyorStatus_in.isREQ()){//sysj\orchestrator.sysj line: 66, column: 4
        conveyorStatus_in.setACK(true);//sysj\orchestrator.sysj line: 66, column: 4
        S109654=1;
        if(conveyorStatus_in.isREQ()){//sysj\orchestrator.sysj line: 66, column: 4
          conveyorStatus_in.setACK(false);//sysj\orchestrator.sysj line: 66, column: 4
          ends[4]=2;
          ;//sysj\orchestrator.sysj line: 66, column: 4
          S109763=1;
          S109681=0;
          if(!fillerStatus_in.isPartnerPresent() || fillerStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 67, column: 4
            fillerStatus_in.setACK(false);//sysj\orchestrator.sysj line: 67, column: 4
            S109681=1;
            active[4]=1;
            ends[4]=1;
            tdone[4]=1;
          }
          else {
            S109676=0;
            if(!fillerStatus_in.isREQ()){//sysj\orchestrator.sysj line: 67, column: 4
              fillerStatus_in.setACK(true);//sysj\orchestrator.sysj line: 67, column: 4
              S109676=1;
              if(fillerStatus_in.isREQ()){//sysj\orchestrator.sysj line: 67, column: 4
                fillerStatus_in.setACK(false);//sysj\orchestrator.sysj line: 67, column: 4
                ends[4]=2;
                ;//sysj\orchestrator.sysj line: 67, column: 4
                S109763=2;
                S109770=0;
                if(!capLoaderStatus_in.isPartnerPresent() || capLoaderStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 68, column: 4
                  capLoaderStatus_in.setACK(false);//sysj\orchestrator.sysj line: 68, column: 4
                  S109770=1;
                  active[4]=1;
                  ends[4]=1;
                  tdone[4]=1;
                }
                else {
                  S109765=0;
                  if(!capLoaderStatus_in.isREQ()){//sysj\orchestrator.sysj line: 68, column: 4
                    capLoaderStatus_in.setACK(true);//sysj\orchestrator.sysj line: 68, column: 4
                    S109765=1;
                    if(capLoaderStatus_in.isREQ()){//sysj\orchestrator.sysj line: 68, column: 4
                      capLoaderStatus_in.setACK(false);//sysj\orchestrator.sysj line: 68, column: 4
                      ends[4]=2;
                      ;//sysj\orchestrator.sysj line: 68, column: 4
                      S109763=3;
                      S109902=0;
                      if(!capperStatus_in.isPartnerPresent() || capperStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 69, column: 4
                        capperStatus_in.setACK(false);//sysj\orchestrator.sysj line: 69, column: 4
                        S109902=1;
                        active[4]=1;
                        ends[4]=1;
                        tdone[4]=1;
                      }
                      else {
                        S109897=0;
                        if(!capperStatus_in.isREQ()){//sysj\orchestrator.sysj line: 69, column: 4
                          capperStatus_in.setACK(true);//sysj\orchestrator.sysj line: 69, column: 4
                          S109897=1;
                          if(capperStatus_in.isREQ()){//sysj\orchestrator.sysj line: 69, column: 4
                            capperStatus_in.setACK(false);//sysj\orchestrator.sysj line: 69, column: 4
                            ends[4]=2;
                            ;//sysj\orchestrator.sysj line: 69, column: 4
                            conveyStat_thread_4 = (conveyorStatus_in.getVal() == null ? null : ((String)conveyorStatus_in.getVal()));//sysj\orchestrator.sysj line: 71, column: 4
                            fillerStat_thread_4 = (fillerStatus_in.getVal() == null ? null : ((String)fillerStatus_in.getVal()));//sysj\orchestrator.sysj line: 72, column: 4
                            screwerStat_thread_4 = (capLoaderStatus_in.getVal() == null ? null : ((String)capLoaderStatus_in.getVal()));//sysj\orchestrator.sysj line: 73, column: 4
                            loaderStat_thread_4 = (capperStatus_in.getVal() == null ? null : ((String)capperStatus_in.getVal()));//sysj\orchestrator.sysj line: 74, column: 4
                            S109763=4;
                            if((conveyStat_thread_4 == "done" || conveyStat_thread_4 == "idle") && (fillerStat_thread_4 == "done" || fillerStat_thread_4 == "idle") && (screwerStat_thread_4 == "done" || screwerStat_thread_4 == "idle") && (loaderStat_thread_4 == "done" || loaderStat_thread_4 == "idle")){//sysj\orchestrator.sysj line: 77, column: 7
                              S110078=0;
                              if(!allOperationsFinished_o.isPartnerPresent() || allOperationsFinished_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 82, column: 5
                                allOperationsFinished_o.setREQ(false);//sysj\orchestrator.sysj line: 82, column: 5
                                S110078=1;
                                active[4]=1;
                                ends[4]=1;
                                tdone[4]=1;
                              }
                              else {
                                S110073=0;
                                if(allOperationsFinished_o.isACK()){//sysj\orchestrator.sysj line: 82, column: 5
                                  allOperationsFinished_o.setVal(true);//sysj\orchestrator.sysj line: 82, column: 5
                                  S110073=1;
                                  if(!allOperationsFinished_o.isACK()){//sysj\orchestrator.sysj line: 82, column: 5
                                    allOperationsFinished_o.setREQ(false);//sysj\orchestrator.sysj line: 82, column: 5
                                    ends[4]=2;
                                    ;//sysj\orchestrator.sysj line: 82, column: 5
                                    S109763=5;
                                    active[4]=1;
                                    ends[4]=1;
                                    tdone[4]=1;
                                  }
                                  else {
                                    active[4]=1;
                                    ends[4]=1;
                                    tdone[4]=1;
                                  }
                                }
                                else {
                                  active[4]=1;
                                  ends[4]=1;
                                  tdone[4]=1;
                                }
                              }
                            }
                            else {
                              S109763=5;
                              active[4]=1;
                              ends[4]=1;
                              tdone[4]=1;
                            }
                          }
                          else {
                            active[4]=1;
                            ends[4]=1;
                            tdone[4]=1;
                          }
                        }
                        else {
                          active[4]=1;
                          ends[4]=1;
                          tdone[4]=1;
                        }
                      }
                    }
                    else {
                      active[4]=1;
                      ends[4]=1;
                      tdone[4]=1;
                    }
                  }
                  else {
                    active[4]=1;
                    ends[4]=1;
                    tdone[4]=1;
                  }
                }
              }
              else {
                active[4]=1;
                ends[4]=1;
                tdone[4]=1;
              }
            }
            else {
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
          }
        }
        else {
          active[4]=1;
          ends[4]=1;
          tdone[4]=1;
        }
      }
      else {
        active[4]=1;
        ends[4]=1;
        tdone[4]=1;
      }
    }
  }

  public void thread111606(int [] tdone, int [] ends){
        S109652=1;
    S106676=0;
    S106660=0;
    if(!rotaryStatus_in.isPartnerPresent() || rotaryStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 49, column: 4
      rotaryStatus_in.setACK(false);//sysj\orchestrator.sysj line: 49, column: 4
      S106660=1;
      active[3]=1;
      ends[3]=1;
      tdone[3]=1;
    }
    else {
      S106655=0;
      if(!rotaryStatus_in.isREQ()){//sysj\orchestrator.sysj line: 49, column: 4
        rotaryStatus_in.setACK(true);//sysj\orchestrator.sysj line: 49, column: 4
        S106655=1;
        if(rotaryStatus_in.isREQ()){//sysj\orchestrator.sysj line: 49, column: 4
          rotaryStatus_in.setACK(false);//sysj\orchestrator.sysj line: 49, column: 4
          ends[3]=2;
          ;//sysj\orchestrator.sysj line: 49, column: 4
          rotaryStat_thread_3 = (rotaryStatus_in.getVal() == null ? null : ((String)rotaryStatus_in.getVal()));//sysj\orchestrator.sysj line: 50, column: 4
          S106676=1;
          if(rotaryStat_thread_3 == "done"){//sysj\orchestrator.sysj line: 53, column: 7
            S106787=0;
            S106683=0;
            if(!fillerReq_o.isPartnerPresent() || fillerReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 54, column: 5
              fillerReq_o.setREQ(false);//sysj\orchestrator.sysj line: 54, column: 5
              S106683=1;
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            else {
              S106678=0;
              if(fillerReq_o.isACK()){//sysj\orchestrator.sysj line: 54, column: 5
                fillerReq_o.setVal(true);//sysj\orchestrator.sysj line: 54, column: 5
                S106678=1;
                if(!fillerReq_o.isACK()){//sysj\orchestrator.sysj line: 54, column: 5
                  fillerReq_o.setREQ(false);//sysj\orchestrator.sysj line: 54, column: 5
                  ends[3]=2;
                  ;//sysj\orchestrator.sysj line: 54, column: 5
                  S106787=1;
                  S106705=0;
                  if(!capLoaderReq_o.isPartnerPresent() || capLoaderReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 55, column: 5
                    capLoaderReq_o.setREQ(false);//sysj\orchestrator.sysj line: 55, column: 5
                    S106705=1;
                    active[3]=1;
                    ends[3]=1;
                    tdone[3]=1;
                  }
                  else {
                    S106700=0;
                    if(capLoaderReq_o.isACK()){//sysj\orchestrator.sysj line: 55, column: 5
                      capLoaderReq_o.setVal(true);//sysj\orchestrator.sysj line: 55, column: 5
                      S106700=1;
                      if(!capLoaderReq_o.isACK()){//sysj\orchestrator.sysj line: 55, column: 5
                        capLoaderReq_o.setREQ(false);//sysj\orchestrator.sysj line: 55, column: 5
                        ends[3]=2;
                        ;//sysj\orchestrator.sysj line: 55, column: 5
                        S106787=2;
                        S106794=0;
                        if(!capperReq_o.isPartnerPresent() || capperReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 56, column: 5
                          capperReq_o.setREQ(false);//sysj\orchestrator.sysj line: 56, column: 5
                          S106794=1;
                          active[3]=1;
                          ends[3]=1;
                          tdone[3]=1;
                        }
                        else {
                          S106789=0;
                          if(capperReq_o.isACK()){//sysj\orchestrator.sysj line: 56, column: 5
                            capperReq_o.setVal(true);//sysj\orchestrator.sysj line: 56, column: 5
                            S106789=1;
                            if(!capperReq_o.isACK()){//sysj\orchestrator.sysj line: 56, column: 5
                              capperReq_o.setREQ(false);//sysj\orchestrator.sysj line: 56, column: 5
                              ends[3]=2;
                              ;//sysj\orchestrator.sysj line: 56, column: 5
                              getNextBottle_1.setPresent();//sysj\orchestrator.sysj line: 57, column: 5
                              currsigs.addElement(getNextBottle_1);
                              S106676=2;
                              active[3]=1;
                              ends[3]=1;
                              tdone[3]=1;
                            }
                            else {
                              active[3]=1;
                              ends[3]=1;
                              tdone[3]=1;
                            }
                          }
                          else {
                            active[3]=1;
                            ends[3]=1;
                            tdone[3]=1;
                          }
                        }
                      }
                      else {
                        active[3]=1;
                        ends[3]=1;
                        tdone[3]=1;
                      }
                    }
                    else {
                      active[3]=1;
                      ends[3]=1;
                      tdone[3]=1;
                    }
                  }
                }
                else {
                  active[3]=1;
                  ends[3]=1;
                  tdone[3]=1;
                }
              }
              else {
                active[3]=1;
                ends[3]=1;
                tdone[3]=1;
              }
            }
          }
          else {
            S106676=2;
            active[3]=1;
            ends[3]=1;
            tdone[3]=1;
          }
        }
        else {
          active[3]=1;
          ends[3]=1;
          tdone[3]=1;
        }
      }
      else {
        active[3]=1;
        ends[3]=1;
        tdone[3]=1;
      }
    }
  }

  public void thread111605(int [] tdone, int [] ends){
        S106653=1;
    quantity_thread_2 = 5;//sysj\orchestrator.sysj line: 20, column: 3
    bottlePlaced_thread_2 = 0;//sysj\orchestrator.sysj line: 21, column: 3
    liquidPercent_thread_2 = new ArrayList();//sysj\orchestrator.sysj line: 22, column: 3
    liquidPercent_thread_2.add(10);//sysj\orchestrator.sysj line: 23, column: 3
    liquidPercent_thread_2.add(10);//sysj\orchestrator.sysj line: 24, column: 3
    liquidPercent_thread_2.add(20);//sysj\orchestrator.sysj line: 25, column: 3
    liquidPercent_thread_2.add(60);//sysj\orchestrator.sysj line: 26, column: 3
    bottlePlaced_thread_2 = quantity_thread_2;//sysj\orchestrator.sysj line: 29, column: 4
    S105137=0;
    if(bottlePlaced_thread_2 <= 0){//sysj\orchestrator.sysj line: 30, column: 10
      System.out.println("sending conveyor req?");//sysj\orchestrator.sysj line: 31, column: 5
      S104879=0;
      S104841=0;
      if(!conveyorReq_o.isPartnerPresent() || conveyorReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 32, column: 5
        conveyorReq_o.setREQ(false);//sysj\orchestrator.sysj line: 32, column: 5
        S104841=1;
        active[2]=1;
        ends[2]=1;
        tdone[2]=1;
      }
      else {
        S104836=0;
        if(conveyorReq_o.isACK()){//sysj\orchestrator.sysj line: 32, column: 5
          conveyorReq_o.setVal(true);//sysj\orchestrator.sysj line: 32, column: 5
          S104836=1;
          if(!conveyorReq_o.isACK()){//sysj\orchestrator.sysj line: 32, column: 5
            conveyorReq_o.setREQ(false);//sysj\orchestrator.sysj line: 32, column: 5
            ends[2]=2;
            ;//sysj\orchestrator.sysj line: 32, column: 5
            bottlePlaced_thread_2 = bottlePlaced_thread_2 - 1;//sysj\orchestrator.sysj line: 33, column: 5
            System.out.println(liquidPercent_thread_2.get(3));//sysj\orchestrator.sysj line: 34, column: 5
            S104879=1;
            active[2]=1;
            ends[2]=1;
            tdone[2]=1;
          }
          else {
            active[2]=1;
            ends[2]=1;
            tdone[2]=1;
          }
        }
        else {
          active[2]=1;
          ends[2]=1;
          tdone[2]=1;
        }
      }
    }
    else {
      conveyorReq_o.setPreempted();//sysj\orchestrator.sysj line: 30, column: 4
      ends[2]=2;
      ;//sysj\orchestrator.sysj line: 30, column: 4
      System.out.println("Done order");//sysj\orchestrator.sysj line: 40, column: 4
      S105137=1;
      active[2]=1;
      ends[2]=1;
      tdone[2]=1;
    }
  }

  public void runClockDomain(){
    for(int i=0;i<ends.length;i++){
      ends[i] = 0;
      tdone[i] = 0;
    }
    
    RUN: while(true){
      switch(S111603){
        case 0 : 
          S111603=0;
          break RUN;
        
        case 1 : 
          S111603=2;
          S111603=2;
          getNextBottle_1.setClear();//sysj\orchestrator.sysj line: 16, column: 2
          thread111605(tdone,ends);
          thread111606(tdone,ends);
          thread111607(tdone,ends);
          int biggest111608 = 0;
          if(ends[2]>=biggest111608){
            biggest111608=ends[2];
          }
          if(ends[3]>=biggest111608){
            biggest111608=ends[3];
          }
          if(ends[4]>=biggest111608){
            biggest111608=ends[4];
          }
          if(biggest111608 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
        
        case 2 : 
          getNextBottle_1.setClear();//sysj\orchestrator.sysj line: 16, column: 2
          thread111609(tdone,ends);
          thread111610(tdone,ends);
          thread111611(tdone,ends);
          int biggest111612 = 0;
          if(ends[2]>=biggest111612){
            biggest111612=ends[2];
          }
          if(ends[3]>=biggest111612){
            biggest111612=ends[3];
          }
          if(ends[4]>=biggest111612){
            biggest111612=ends[4];
          }
          if(biggest111612 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
          //FINXME code
          if(biggest111612 == 0){
            S111603=0;
            active[1]=0;
            ends[1]=0;
            S111603=0;
            break RUN;
          }
        
      }
    }
  }

  public void init(){
    char [] active1 = {1, 1, 1, 1, 1};
    char [] paused1 = {0, 0, 0, 0, 0};
    char [] suspended1 = {0, 0, 0, 0, 0};
    paused = paused1;
    active = active1;
    suspended = suspended1;
    // Now instantiate all the local signals ONLY
    getNextBottle_1 = new Signal();
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
          capperStatus_in.gethook();
          capLoaderStatus_in.gethook();
          fillerStatus_in.gethook();
          rotaryStatus_in.gethook();
          order_in.gethook();
          conveyorReq_o.gethook();
          allOperationsFinished_o.gethook();
          fillerReq_o.gethook();
          capperReq_o.gethook();
          capLoaderReq_o.gethook();
          doneOrder_o.gethook();
          percentLiquid_o.gethook();
          df = true;
        }
        runClockDomain();
      }
      getNextBottle_1.setpreclear();
      int dummyint = 0;
      for(int qw=0;qw<currsigs.size();++qw){
        dummyint = ((Signal)currsigs.elementAt(qw)).getStatus() ? ((Signal)currsigs.elementAt(qw)).setprepresent() : ((Signal)currsigs.elementAt(qw)).setpreclear();
        ((Signal)currsigs.elementAt(qw)).setpreval(((Signal)currsigs.elementAt(qw)).getValue());
      }
      currsigs.removeAllElements();
      getNextBottle_1.setClear();
      conveyorStatus_in.sethook();
      capperStatus_in.sethook();
      capLoaderStatus_in.sethook();
      fillerStatus_in.sethook();
      rotaryStatus_in.sethook();
      order_in.sethook();
      conveyorReq_o.sethook();
      allOperationsFinished_o.sethook();
      fillerReq_o.sethook();
      capperReq_o.sethook();
      capLoaderReq_o.sethook();
      doneOrder_o.sethook();
      percentLiquid_o.sethook();
      if(paused[1]!=0 || suspended[1]!=0 || active[1]!=1);
      else{
        conveyorStatus_in.gethook();
        capperStatus_in.gethook();
        capLoaderStatus_in.gethook();
        fillerStatus_in.gethook();
        rotaryStatus_in.gethook();
        order_in.gethook();
        conveyorReq_o.gethook();
        allOperationsFinished_o.gethook();
        fillerReq_o.gethook();
        capperReq_o.gethook();
        capLoaderReq_o.gethook();
        doneOrder_o.gethook();
        percentLiquid_o.gethook();
      }
      runFinisher();
      if(active[1] == 0){
      	this.terminated = true;
      }
      if(!threaded) break;
    }
  }
}
