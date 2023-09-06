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
  private Signal getNextBottle_1;
  private int[] liquidPercent_thread_1;//sysj/orchestrator.sysj line: 11, column: 2
  private int quantity_thread_1;//sysj/orchestrator.sysj line: 12, column: 2
  private int bottlePlaced_thread_1;//sysj/orchestrator.sysj line: 15, column: 2
  private String rotaryStat_thread_3;//sysj/orchestrator.sysj line: 41, column: 4
  private String coveyStat_thread_4;//sysj/orchestrator.sysj line: 62, column: 4
  private String fillerStat_thread_4;//sysj/orchestrator.sysj line: 63, column: 4
  private String screwerStat_thread_4;//sysj/orchestrator.sysj line: 64, column: 4
  private String loaderStat_thread_4;//sysj/orchestrator.sysj line: 65, column: 4
  private int S23441 = 1;
  private int S912 = 1;
  private int S304 = 1;
  private int S46 = 1;
  private int S8 = 1;
  private int S3 = 1;
  private int S3911 = 1;
  private int S935 = 1;
  private int S919 = 1;
  private int S914 = 1;
  private int S1046 = 1;
  private int S942 = 1;
  private int S937 = 1;
  private int S964 = 1;
  private int S959 = 1;
  private int S1053 = 1;
  private int S1048 = 1;
  private int S5860 = 1;
  private int S4022 = 1;
  private int S3918 = 1;
  private int S3913 = 1;
  private int S3940 = 1;
  private int S3935 = 1;
  private int S4029 = 1;
  private int S4024 = 1;
  private int S4161 = 1;
  private int S4156 = 1;
  private int S4337 = 1;
  private int S4332 = 1;
  
  private int[] ends = new int[5];
  private int[] tdone = new int[5];
  
  public void thread23449(int [] tdone, int [] ends){
        switch(S5860){
      case 0 : 
        active[4]=0;
        ends[4]=0;
        tdone[4]=1;
        break;
      
      case 1 : 
        switch(S4022){
          case 0 : 
            switch(S3918){
              case 0 : 
                if(!conveyorStatus_in.isPartnerPresent() || conveyorStatus_in.isPartnerPreempted()){//sysj/orchestrator.sysj line: 57, column: 4
                  conveyorStatus_in.setACK(false);//sysj/orchestrator.sysj line: 57, column: 4
                  S3918=1;
                  active[4]=1;
                  ends[4]=1;
                  tdone[4]=1;
                }
                else {
                  switch(S3913){
                    case 0 : 
                      if(!conveyorStatus_in.isREQ()){//sysj/orchestrator.sysj line: 57, column: 4
                        conveyorStatus_in.setACK(true);//sysj/orchestrator.sysj line: 57, column: 4
                        S3913=1;
                        if(conveyorStatus_in.isREQ()){//sysj/orchestrator.sysj line: 57, column: 4
                          conveyorStatus_in.setACK(false);//sysj/orchestrator.sysj line: 57, column: 4
                          ends[4]=2;
                          ;//sysj/orchestrator.sysj line: 57, column: 4
                          S4022=1;
                          S3940=0;
                          if(!fillerStatus_in.isPartnerPresent() || fillerStatus_in.isPartnerPreempted()){//sysj/orchestrator.sysj line: 58, column: 4
                            fillerStatus_in.setACK(false);//sysj/orchestrator.sysj line: 58, column: 4
                            S3940=1;
                            active[4]=1;
                            ends[4]=1;
                            tdone[4]=1;
                          }
                          else {
                            S3935=0;
                            if(!fillerStatus_in.isREQ()){//sysj/orchestrator.sysj line: 58, column: 4
                              fillerStatus_in.setACK(true);//sysj/orchestrator.sysj line: 58, column: 4
                              S3935=1;
                              if(fillerStatus_in.isREQ()){//sysj/orchestrator.sysj line: 58, column: 4
                                fillerStatus_in.setACK(false);//sysj/orchestrator.sysj line: 58, column: 4
                                ends[4]=2;
                                ;//sysj/orchestrator.sysj line: 58, column: 4
                                S4022=2;
                                S4029=0;
                                if(!capLoaderStatus_in.isPartnerPresent() || capLoaderStatus_in.isPartnerPreempted()){//sysj/orchestrator.sysj line: 59, column: 4
                                  capLoaderStatus_in.setACK(false);//sysj/orchestrator.sysj line: 59, column: 4
                                  S4029=1;
                                  active[4]=1;
                                  ends[4]=1;
                                  tdone[4]=1;
                                }
                                else {
                                  S4024=0;
                                  if(!capLoaderStatus_in.isREQ()){//sysj/orchestrator.sysj line: 59, column: 4
                                    capLoaderStatus_in.setACK(true);//sysj/orchestrator.sysj line: 59, column: 4
                                    S4024=1;
                                    if(capLoaderStatus_in.isREQ()){//sysj/orchestrator.sysj line: 59, column: 4
                                      capLoaderStatus_in.setACK(false);//sysj/orchestrator.sysj line: 59, column: 4
                                      ends[4]=2;
                                      ;//sysj/orchestrator.sysj line: 59, column: 4
                                      S4022=3;
                                      S4161=0;
                                      if(!capperStatus_in.isPartnerPresent() || capperStatus_in.isPartnerPreempted()){//sysj/orchestrator.sysj line: 60, column: 4
                                        capperStatus_in.setACK(false);//sysj/orchestrator.sysj line: 60, column: 4
                                        S4161=1;
                                        active[4]=1;
                                        ends[4]=1;
                                        tdone[4]=1;
                                      }
                                      else {
                                        S4156=0;
                                        if(!capperStatus_in.isREQ()){//sysj/orchestrator.sysj line: 60, column: 4
                                          capperStatus_in.setACK(true);//sysj/orchestrator.sysj line: 60, column: 4
                                          S4156=1;
                                          if(capperStatus_in.isREQ()){//sysj/orchestrator.sysj line: 60, column: 4
                                            capperStatus_in.setACK(false);//sysj/orchestrator.sysj line: 60, column: 4
                                            ends[4]=2;
                                            ;//sysj/orchestrator.sysj line: 60, column: 4
                                            coveyStat_thread_4 = (conveyorStatus_in.getVal() == null ? null : ((String)conveyorStatus_in.getVal()));//sysj/orchestrator.sysj line: 62, column: 4
                                            fillerStat_thread_4 = (fillerStatus_in.getVal() == null ? null : ((String)fillerStatus_in.getVal()));//sysj/orchestrator.sysj line: 63, column: 4
                                            screwerStat_thread_4 = (capLoaderStatus_in.getVal() == null ? null : ((String)capLoaderStatus_in.getVal()));//sysj/orchestrator.sysj line: 64, column: 4
                                            loaderStat_thread_4 = (capperStatus_in.getVal() == null ? null : ((String)capperStatus_in.getVal()));//sysj/orchestrator.sysj line: 65, column: 4
                                            S4022=4;
                                            if((conveyStat == "done" || conveyStat == "idle") && (fillerStat_thread_4 == "done" || fillerStat_thread_4 == "idle") && (screwerStat_thread_4 == "done" || screwerStat_thread_4 == "idle") && (loaderStat_thread_4 == "done" || loaderStat_thread_4 == "idle")){//sysj/orchestrator.sysj line: 68, column: 7
                                              S4337=0;
                                              if(!allOperationsFinished_o.isPartnerPresent() || allOperationsFinished_o.isPartnerPreempted()){//sysj/orchestrator.sysj line: 73, column: 5
                                                allOperationsFinished_o.setREQ(false);//sysj/orchestrator.sysj line: 73, column: 5
                                                S4337=1;
                                                active[4]=1;
                                                ends[4]=1;
                                                tdone[4]=1;
                                              }
                                              else {
                                                S4332=0;
                                                if(allOperationsFinished_o.isACK()){//sysj/orchestrator.sysj line: 73, column: 5
                                                  allOperationsFinished_o.setVal(true);//sysj/orchestrator.sysj line: 73, column: 5
                                                  S4332=1;
                                                  if(!allOperationsFinished_o.isACK()){//sysj/orchestrator.sysj line: 73, column: 5
                                                    allOperationsFinished_o.setREQ(false);//sysj/orchestrator.sysj line: 73, column: 5
                                                    ends[4]=2;
                                                    ;//sysj/orchestrator.sysj line: 73, column: 5
                                                    S4022=5;
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
                                              S4022=5;
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
                      if(conveyorStatus_in.isREQ()){//sysj/orchestrator.sysj line: 57, column: 4
                        conveyorStatus_in.setACK(false);//sysj/orchestrator.sysj line: 57, column: 4
                        ends[4]=2;
                        ;//sysj/orchestrator.sysj line: 57, column: 4
                        S4022=1;
                        S3940=0;
                        if(!fillerStatus_in.isPartnerPresent() || fillerStatus_in.isPartnerPreempted()){//sysj/orchestrator.sysj line: 58, column: 4
                          fillerStatus_in.setACK(false);//sysj/orchestrator.sysj line: 58, column: 4
                          S3940=1;
                          active[4]=1;
                          ends[4]=1;
                          tdone[4]=1;
                        }
                        else {
                          S3935=0;
                          if(!fillerStatus_in.isREQ()){//sysj/orchestrator.sysj line: 58, column: 4
                            fillerStatus_in.setACK(true);//sysj/orchestrator.sysj line: 58, column: 4
                            S3935=1;
                            if(fillerStatus_in.isREQ()){//sysj/orchestrator.sysj line: 58, column: 4
                              fillerStatus_in.setACK(false);//sysj/orchestrator.sysj line: 58, column: 4
                              ends[4]=2;
                              ;//sysj/orchestrator.sysj line: 58, column: 4
                              S4022=2;
                              S4029=0;
                              if(!capLoaderStatus_in.isPartnerPresent() || capLoaderStatus_in.isPartnerPreempted()){//sysj/orchestrator.sysj line: 59, column: 4
                                capLoaderStatus_in.setACK(false);//sysj/orchestrator.sysj line: 59, column: 4
                                S4029=1;
                                active[4]=1;
                                ends[4]=1;
                                tdone[4]=1;
                              }
                              else {
                                S4024=0;
                                if(!capLoaderStatus_in.isREQ()){//sysj/orchestrator.sysj line: 59, column: 4
                                  capLoaderStatus_in.setACK(true);//sysj/orchestrator.sysj line: 59, column: 4
                                  S4024=1;
                                  if(capLoaderStatus_in.isREQ()){//sysj/orchestrator.sysj line: 59, column: 4
                                    capLoaderStatus_in.setACK(false);//sysj/orchestrator.sysj line: 59, column: 4
                                    ends[4]=2;
                                    ;//sysj/orchestrator.sysj line: 59, column: 4
                                    S4022=3;
                                    S4161=0;
                                    if(!capperStatus_in.isPartnerPresent() || capperStatus_in.isPartnerPreempted()){//sysj/orchestrator.sysj line: 60, column: 4
                                      capperStatus_in.setACK(false);//sysj/orchestrator.sysj line: 60, column: 4
                                      S4161=1;
                                      active[4]=1;
                                      ends[4]=1;
                                      tdone[4]=1;
                                    }
                                    else {
                                      S4156=0;
                                      if(!capperStatus_in.isREQ()){//sysj/orchestrator.sysj line: 60, column: 4
                                        capperStatus_in.setACK(true);//sysj/orchestrator.sysj line: 60, column: 4
                                        S4156=1;
                                        if(capperStatus_in.isREQ()){//sysj/orchestrator.sysj line: 60, column: 4
                                          capperStatus_in.setACK(false);//sysj/orchestrator.sysj line: 60, column: 4
                                          ends[4]=2;
                                          ;//sysj/orchestrator.sysj line: 60, column: 4
                                          coveyStat_thread_4 = (conveyorStatus_in.getVal() == null ? null : ((String)conveyorStatus_in.getVal()));//sysj/orchestrator.sysj line: 62, column: 4
                                          fillerStat_thread_4 = (fillerStatus_in.getVal() == null ? null : ((String)fillerStatus_in.getVal()));//sysj/orchestrator.sysj line: 63, column: 4
                                          screwerStat_thread_4 = (capLoaderStatus_in.getVal() == null ? null : ((String)capLoaderStatus_in.getVal()));//sysj/orchestrator.sysj line: 64, column: 4
                                          loaderStat_thread_4 = (capperStatus_in.getVal() == null ? null : ((String)capperStatus_in.getVal()));//sysj/orchestrator.sysj line: 65, column: 4
                                          S4022=4;
                                          if((conveyStat == "done" || conveyStat == "idle") && (fillerStat_thread_4 == "done" || fillerStat_thread_4 == "idle") && (screwerStat_thread_4 == "done" || screwerStat_thread_4 == "idle") && (loaderStat_thread_4 == "done" || loaderStat_thread_4 == "idle")){//sysj/orchestrator.sysj line: 68, column: 7
                                            S4337=0;
                                            if(!allOperationsFinished_o.isPartnerPresent() || allOperationsFinished_o.isPartnerPreempted()){//sysj/orchestrator.sysj line: 73, column: 5
                                              allOperationsFinished_o.setREQ(false);//sysj/orchestrator.sysj line: 73, column: 5
                                              S4337=1;
                                              active[4]=1;
                                              ends[4]=1;
                                              tdone[4]=1;
                                            }
                                            else {
                                              S4332=0;
                                              if(allOperationsFinished_o.isACK()){//sysj/orchestrator.sysj line: 73, column: 5
                                                allOperationsFinished_o.setVal(true);//sysj/orchestrator.sysj line: 73, column: 5
                                                S4332=1;
                                                if(!allOperationsFinished_o.isACK()){//sysj/orchestrator.sysj line: 73, column: 5
                                                  allOperationsFinished_o.setREQ(false);//sysj/orchestrator.sysj line: 73, column: 5
                                                  ends[4]=2;
                                                  ;//sysj/orchestrator.sysj line: 73, column: 5
                                                  S4022=5;
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
                                            S4022=5;
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
                S3918=1;
                S3918=0;
                if(!conveyorStatus_in.isPartnerPresent() || conveyorStatus_in.isPartnerPreempted()){//sysj/orchestrator.sysj line: 57, column: 4
                  conveyorStatus_in.setACK(false);//sysj/orchestrator.sysj line: 57, column: 4
                  S3918=1;
                  active[4]=1;
                  ends[4]=1;
                  tdone[4]=1;
                }
                else {
                  S3913=0;
                  if(!conveyorStatus_in.isREQ()){//sysj/orchestrator.sysj line: 57, column: 4
                    conveyorStatus_in.setACK(true);//sysj/orchestrator.sysj line: 57, column: 4
                    S3913=1;
                    if(conveyorStatus_in.isREQ()){//sysj/orchestrator.sysj line: 57, column: 4
                      conveyorStatus_in.setACK(false);//sysj/orchestrator.sysj line: 57, column: 4
                      ends[4]=2;
                      ;//sysj/orchestrator.sysj line: 57, column: 4
                      S4022=1;
                      S3940=0;
                      if(!fillerStatus_in.isPartnerPresent() || fillerStatus_in.isPartnerPreempted()){//sysj/orchestrator.sysj line: 58, column: 4
                        fillerStatus_in.setACK(false);//sysj/orchestrator.sysj line: 58, column: 4
                        S3940=1;
                        active[4]=1;
                        ends[4]=1;
                        tdone[4]=1;
                      }
                      else {
                        S3935=0;
                        if(!fillerStatus_in.isREQ()){//sysj/orchestrator.sysj line: 58, column: 4
                          fillerStatus_in.setACK(true);//sysj/orchestrator.sysj line: 58, column: 4
                          S3935=1;
                          if(fillerStatus_in.isREQ()){//sysj/orchestrator.sysj line: 58, column: 4
                            fillerStatus_in.setACK(false);//sysj/orchestrator.sysj line: 58, column: 4
                            ends[4]=2;
                            ;//sysj/orchestrator.sysj line: 58, column: 4
                            S4022=2;
                            S4029=0;
                            if(!capLoaderStatus_in.isPartnerPresent() || capLoaderStatus_in.isPartnerPreempted()){//sysj/orchestrator.sysj line: 59, column: 4
                              capLoaderStatus_in.setACK(false);//sysj/orchestrator.sysj line: 59, column: 4
                              S4029=1;
                              active[4]=1;
                              ends[4]=1;
                              tdone[4]=1;
                            }
                            else {
                              S4024=0;
                              if(!capLoaderStatus_in.isREQ()){//sysj/orchestrator.sysj line: 59, column: 4
                                capLoaderStatus_in.setACK(true);//sysj/orchestrator.sysj line: 59, column: 4
                                S4024=1;
                                if(capLoaderStatus_in.isREQ()){//sysj/orchestrator.sysj line: 59, column: 4
                                  capLoaderStatus_in.setACK(false);//sysj/orchestrator.sysj line: 59, column: 4
                                  ends[4]=2;
                                  ;//sysj/orchestrator.sysj line: 59, column: 4
                                  S4022=3;
                                  S4161=0;
                                  if(!capperStatus_in.isPartnerPresent() || capperStatus_in.isPartnerPreempted()){//sysj/orchestrator.sysj line: 60, column: 4
                                    capperStatus_in.setACK(false);//sysj/orchestrator.sysj line: 60, column: 4
                                    S4161=1;
                                    active[4]=1;
                                    ends[4]=1;
                                    tdone[4]=1;
                                  }
                                  else {
                                    S4156=0;
                                    if(!capperStatus_in.isREQ()){//sysj/orchestrator.sysj line: 60, column: 4
                                      capperStatus_in.setACK(true);//sysj/orchestrator.sysj line: 60, column: 4
                                      S4156=1;
                                      if(capperStatus_in.isREQ()){//sysj/orchestrator.sysj line: 60, column: 4
                                        capperStatus_in.setACK(false);//sysj/orchestrator.sysj line: 60, column: 4
                                        ends[4]=2;
                                        ;//sysj/orchestrator.sysj line: 60, column: 4
                                        coveyStat_thread_4 = (conveyorStatus_in.getVal() == null ? null : ((String)conveyorStatus_in.getVal()));//sysj/orchestrator.sysj line: 62, column: 4
                                        fillerStat_thread_4 = (fillerStatus_in.getVal() == null ? null : ((String)fillerStatus_in.getVal()));//sysj/orchestrator.sysj line: 63, column: 4
                                        screwerStat_thread_4 = (capLoaderStatus_in.getVal() == null ? null : ((String)capLoaderStatus_in.getVal()));//sysj/orchestrator.sysj line: 64, column: 4
                                        loaderStat_thread_4 = (capperStatus_in.getVal() == null ? null : ((String)capperStatus_in.getVal()));//sysj/orchestrator.sysj line: 65, column: 4
                                        S4022=4;
                                        if((conveyStat == "done" || conveyStat == "idle") && (fillerStat_thread_4 == "done" || fillerStat_thread_4 == "idle") && (screwerStat_thread_4 == "done" || screwerStat_thread_4 == "idle") && (loaderStat_thread_4 == "done" || loaderStat_thread_4 == "idle")){//sysj/orchestrator.sysj line: 68, column: 7
                                          S4337=0;
                                          if(!allOperationsFinished_o.isPartnerPresent() || allOperationsFinished_o.isPartnerPreempted()){//sysj/orchestrator.sysj line: 73, column: 5
                                            allOperationsFinished_o.setREQ(false);//sysj/orchestrator.sysj line: 73, column: 5
                                            S4337=1;
                                            active[4]=1;
                                            ends[4]=1;
                                            tdone[4]=1;
                                          }
                                          else {
                                            S4332=0;
                                            if(allOperationsFinished_o.isACK()){//sysj/orchestrator.sysj line: 73, column: 5
                                              allOperationsFinished_o.setVal(true);//sysj/orchestrator.sysj line: 73, column: 5
                                              S4332=1;
                                              if(!allOperationsFinished_o.isACK()){//sysj/orchestrator.sysj line: 73, column: 5
                                                allOperationsFinished_o.setREQ(false);//sysj/orchestrator.sysj line: 73, column: 5
                                                ends[4]=2;
                                                ;//sysj/orchestrator.sysj line: 73, column: 5
                                                S4022=5;
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
                                          S4022=5;
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
            switch(S3940){
              case 0 : 
                if(!fillerStatus_in.isPartnerPresent() || fillerStatus_in.isPartnerPreempted()){//sysj/orchestrator.sysj line: 58, column: 4
                  fillerStatus_in.setACK(false);//sysj/orchestrator.sysj line: 58, column: 4
                  S3940=1;
                  active[4]=1;
                  ends[4]=1;
                  tdone[4]=1;
                }
                else {
                  switch(S3935){
                    case 0 : 
                      if(!fillerStatus_in.isREQ()){//sysj/orchestrator.sysj line: 58, column: 4
                        fillerStatus_in.setACK(true);//sysj/orchestrator.sysj line: 58, column: 4
                        S3935=1;
                        if(fillerStatus_in.isREQ()){//sysj/orchestrator.sysj line: 58, column: 4
                          fillerStatus_in.setACK(false);//sysj/orchestrator.sysj line: 58, column: 4
                          ends[4]=2;
                          ;//sysj/orchestrator.sysj line: 58, column: 4
                          S4022=2;
                          S4029=0;
                          if(!capLoaderStatus_in.isPartnerPresent() || capLoaderStatus_in.isPartnerPreempted()){//sysj/orchestrator.sysj line: 59, column: 4
                            capLoaderStatus_in.setACK(false);//sysj/orchestrator.sysj line: 59, column: 4
                            S4029=1;
                            active[4]=1;
                            ends[4]=1;
                            tdone[4]=1;
                          }
                          else {
                            S4024=0;
                            if(!capLoaderStatus_in.isREQ()){//sysj/orchestrator.sysj line: 59, column: 4
                              capLoaderStatus_in.setACK(true);//sysj/orchestrator.sysj line: 59, column: 4
                              S4024=1;
                              if(capLoaderStatus_in.isREQ()){//sysj/orchestrator.sysj line: 59, column: 4
                                capLoaderStatus_in.setACK(false);//sysj/orchestrator.sysj line: 59, column: 4
                                ends[4]=2;
                                ;//sysj/orchestrator.sysj line: 59, column: 4
                                S4022=3;
                                S4161=0;
                                if(!capperStatus_in.isPartnerPresent() || capperStatus_in.isPartnerPreempted()){//sysj/orchestrator.sysj line: 60, column: 4
                                  capperStatus_in.setACK(false);//sysj/orchestrator.sysj line: 60, column: 4
                                  S4161=1;
                                  active[4]=1;
                                  ends[4]=1;
                                  tdone[4]=1;
                                }
                                else {
                                  S4156=0;
                                  if(!capperStatus_in.isREQ()){//sysj/orchestrator.sysj line: 60, column: 4
                                    capperStatus_in.setACK(true);//sysj/orchestrator.sysj line: 60, column: 4
                                    S4156=1;
                                    if(capperStatus_in.isREQ()){//sysj/orchestrator.sysj line: 60, column: 4
                                      capperStatus_in.setACK(false);//sysj/orchestrator.sysj line: 60, column: 4
                                      ends[4]=2;
                                      ;//sysj/orchestrator.sysj line: 60, column: 4
                                      coveyStat_thread_4 = (conveyorStatus_in.getVal() == null ? null : ((String)conveyorStatus_in.getVal()));//sysj/orchestrator.sysj line: 62, column: 4
                                      fillerStat_thread_4 = (fillerStatus_in.getVal() == null ? null : ((String)fillerStatus_in.getVal()));//sysj/orchestrator.sysj line: 63, column: 4
                                      screwerStat_thread_4 = (capLoaderStatus_in.getVal() == null ? null : ((String)capLoaderStatus_in.getVal()));//sysj/orchestrator.sysj line: 64, column: 4
                                      loaderStat_thread_4 = (capperStatus_in.getVal() == null ? null : ((String)capperStatus_in.getVal()));//sysj/orchestrator.sysj line: 65, column: 4
                                      S4022=4;
                                      if((conveyStat == "done" || conveyStat == "idle") && (fillerStat_thread_4 == "done" || fillerStat_thread_4 == "idle") && (screwerStat_thread_4 == "done" || screwerStat_thread_4 == "idle") && (loaderStat_thread_4 == "done" || loaderStat_thread_4 == "idle")){//sysj/orchestrator.sysj line: 68, column: 7
                                        S4337=0;
                                        if(!allOperationsFinished_o.isPartnerPresent() || allOperationsFinished_o.isPartnerPreempted()){//sysj/orchestrator.sysj line: 73, column: 5
                                          allOperationsFinished_o.setREQ(false);//sysj/orchestrator.sysj line: 73, column: 5
                                          S4337=1;
                                          active[4]=1;
                                          ends[4]=1;
                                          tdone[4]=1;
                                        }
                                        else {
                                          S4332=0;
                                          if(allOperationsFinished_o.isACK()){//sysj/orchestrator.sysj line: 73, column: 5
                                            allOperationsFinished_o.setVal(true);//sysj/orchestrator.sysj line: 73, column: 5
                                            S4332=1;
                                            if(!allOperationsFinished_o.isACK()){//sysj/orchestrator.sysj line: 73, column: 5
                                              allOperationsFinished_o.setREQ(false);//sysj/orchestrator.sysj line: 73, column: 5
                                              ends[4]=2;
                                              ;//sysj/orchestrator.sysj line: 73, column: 5
                                              S4022=5;
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
                                        S4022=5;
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
                      if(fillerStatus_in.isREQ()){//sysj/orchestrator.sysj line: 58, column: 4
                        fillerStatus_in.setACK(false);//sysj/orchestrator.sysj line: 58, column: 4
                        ends[4]=2;
                        ;//sysj/orchestrator.sysj line: 58, column: 4
                        S4022=2;
                        S4029=0;
                        if(!capLoaderStatus_in.isPartnerPresent() || capLoaderStatus_in.isPartnerPreempted()){//sysj/orchestrator.sysj line: 59, column: 4
                          capLoaderStatus_in.setACK(false);//sysj/orchestrator.sysj line: 59, column: 4
                          S4029=1;
                          active[4]=1;
                          ends[4]=1;
                          tdone[4]=1;
                        }
                        else {
                          S4024=0;
                          if(!capLoaderStatus_in.isREQ()){//sysj/orchestrator.sysj line: 59, column: 4
                            capLoaderStatus_in.setACK(true);//sysj/orchestrator.sysj line: 59, column: 4
                            S4024=1;
                            if(capLoaderStatus_in.isREQ()){//sysj/orchestrator.sysj line: 59, column: 4
                              capLoaderStatus_in.setACK(false);//sysj/orchestrator.sysj line: 59, column: 4
                              ends[4]=2;
                              ;//sysj/orchestrator.sysj line: 59, column: 4
                              S4022=3;
                              S4161=0;
                              if(!capperStatus_in.isPartnerPresent() || capperStatus_in.isPartnerPreempted()){//sysj/orchestrator.sysj line: 60, column: 4
                                capperStatus_in.setACK(false);//sysj/orchestrator.sysj line: 60, column: 4
                                S4161=1;
                                active[4]=1;
                                ends[4]=1;
                                tdone[4]=1;
                              }
                              else {
                                S4156=0;
                                if(!capperStatus_in.isREQ()){//sysj/orchestrator.sysj line: 60, column: 4
                                  capperStatus_in.setACK(true);//sysj/orchestrator.sysj line: 60, column: 4
                                  S4156=1;
                                  if(capperStatus_in.isREQ()){//sysj/orchestrator.sysj line: 60, column: 4
                                    capperStatus_in.setACK(false);//sysj/orchestrator.sysj line: 60, column: 4
                                    ends[4]=2;
                                    ;//sysj/orchestrator.sysj line: 60, column: 4
                                    coveyStat_thread_4 = (conveyorStatus_in.getVal() == null ? null : ((String)conveyorStatus_in.getVal()));//sysj/orchestrator.sysj line: 62, column: 4
                                    fillerStat_thread_4 = (fillerStatus_in.getVal() == null ? null : ((String)fillerStatus_in.getVal()));//sysj/orchestrator.sysj line: 63, column: 4
                                    screwerStat_thread_4 = (capLoaderStatus_in.getVal() == null ? null : ((String)capLoaderStatus_in.getVal()));//sysj/orchestrator.sysj line: 64, column: 4
                                    loaderStat_thread_4 = (capperStatus_in.getVal() == null ? null : ((String)capperStatus_in.getVal()));//sysj/orchestrator.sysj line: 65, column: 4
                                    S4022=4;
                                    if((conveyStat == "done" || conveyStat == "idle") && (fillerStat_thread_4 == "done" || fillerStat_thread_4 == "idle") && (screwerStat_thread_4 == "done" || screwerStat_thread_4 == "idle") && (loaderStat_thread_4 == "done" || loaderStat_thread_4 == "idle")){//sysj/orchestrator.sysj line: 68, column: 7
                                      S4337=0;
                                      if(!allOperationsFinished_o.isPartnerPresent() || allOperationsFinished_o.isPartnerPreempted()){//sysj/orchestrator.sysj line: 73, column: 5
                                        allOperationsFinished_o.setREQ(false);//sysj/orchestrator.sysj line: 73, column: 5
                                        S4337=1;
                                        active[4]=1;
                                        ends[4]=1;
                                        tdone[4]=1;
                                      }
                                      else {
                                        S4332=0;
                                        if(allOperationsFinished_o.isACK()){//sysj/orchestrator.sysj line: 73, column: 5
                                          allOperationsFinished_o.setVal(true);//sysj/orchestrator.sysj line: 73, column: 5
                                          S4332=1;
                                          if(!allOperationsFinished_o.isACK()){//sysj/orchestrator.sysj line: 73, column: 5
                                            allOperationsFinished_o.setREQ(false);//sysj/orchestrator.sysj line: 73, column: 5
                                            ends[4]=2;
                                            ;//sysj/orchestrator.sysj line: 73, column: 5
                                            S4022=5;
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
                                      S4022=5;
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
                S3940=1;
                S3940=0;
                if(!fillerStatus_in.isPartnerPresent() || fillerStatus_in.isPartnerPreempted()){//sysj/orchestrator.sysj line: 58, column: 4
                  fillerStatus_in.setACK(false);//sysj/orchestrator.sysj line: 58, column: 4
                  S3940=1;
                  active[4]=1;
                  ends[4]=1;
                  tdone[4]=1;
                }
                else {
                  S3935=0;
                  if(!fillerStatus_in.isREQ()){//sysj/orchestrator.sysj line: 58, column: 4
                    fillerStatus_in.setACK(true);//sysj/orchestrator.sysj line: 58, column: 4
                    S3935=1;
                    if(fillerStatus_in.isREQ()){//sysj/orchestrator.sysj line: 58, column: 4
                      fillerStatus_in.setACK(false);//sysj/orchestrator.sysj line: 58, column: 4
                      ends[4]=2;
                      ;//sysj/orchestrator.sysj line: 58, column: 4
                      S4022=2;
                      S4029=0;
                      if(!capLoaderStatus_in.isPartnerPresent() || capLoaderStatus_in.isPartnerPreempted()){//sysj/orchestrator.sysj line: 59, column: 4
                        capLoaderStatus_in.setACK(false);//sysj/orchestrator.sysj line: 59, column: 4
                        S4029=1;
                        active[4]=1;
                        ends[4]=1;
                        tdone[4]=1;
                      }
                      else {
                        S4024=0;
                        if(!capLoaderStatus_in.isREQ()){//sysj/orchestrator.sysj line: 59, column: 4
                          capLoaderStatus_in.setACK(true);//sysj/orchestrator.sysj line: 59, column: 4
                          S4024=1;
                          if(capLoaderStatus_in.isREQ()){//sysj/orchestrator.sysj line: 59, column: 4
                            capLoaderStatus_in.setACK(false);//sysj/orchestrator.sysj line: 59, column: 4
                            ends[4]=2;
                            ;//sysj/orchestrator.sysj line: 59, column: 4
                            S4022=3;
                            S4161=0;
                            if(!capperStatus_in.isPartnerPresent() || capperStatus_in.isPartnerPreempted()){//sysj/orchestrator.sysj line: 60, column: 4
                              capperStatus_in.setACK(false);//sysj/orchestrator.sysj line: 60, column: 4
                              S4161=1;
                              active[4]=1;
                              ends[4]=1;
                              tdone[4]=1;
                            }
                            else {
                              S4156=0;
                              if(!capperStatus_in.isREQ()){//sysj/orchestrator.sysj line: 60, column: 4
                                capperStatus_in.setACK(true);//sysj/orchestrator.sysj line: 60, column: 4
                                S4156=1;
                                if(capperStatus_in.isREQ()){//sysj/orchestrator.sysj line: 60, column: 4
                                  capperStatus_in.setACK(false);//sysj/orchestrator.sysj line: 60, column: 4
                                  ends[4]=2;
                                  ;//sysj/orchestrator.sysj line: 60, column: 4
                                  coveyStat_thread_4 = (conveyorStatus_in.getVal() == null ? null : ((String)conveyorStatus_in.getVal()));//sysj/orchestrator.sysj line: 62, column: 4
                                  fillerStat_thread_4 = (fillerStatus_in.getVal() == null ? null : ((String)fillerStatus_in.getVal()));//sysj/orchestrator.sysj line: 63, column: 4
                                  screwerStat_thread_4 = (capLoaderStatus_in.getVal() == null ? null : ((String)capLoaderStatus_in.getVal()));//sysj/orchestrator.sysj line: 64, column: 4
                                  loaderStat_thread_4 = (capperStatus_in.getVal() == null ? null : ((String)capperStatus_in.getVal()));//sysj/orchestrator.sysj line: 65, column: 4
                                  S4022=4;
                                  if((conveyStat == "done" || conveyStat == "idle") && (fillerStat_thread_4 == "done" || fillerStat_thread_4 == "idle") && (screwerStat_thread_4 == "done" || screwerStat_thread_4 == "idle") && (loaderStat_thread_4 == "done" || loaderStat_thread_4 == "idle")){//sysj/orchestrator.sysj line: 68, column: 7
                                    S4337=0;
                                    if(!allOperationsFinished_o.isPartnerPresent() || allOperationsFinished_o.isPartnerPreempted()){//sysj/orchestrator.sysj line: 73, column: 5
                                      allOperationsFinished_o.setREQ(false);//sysj/orchestrator.sysj line: 73, column: 5
                                      S4337=1;
                                      active[4]=1;
                                      ends[4]=1;
                                      tdone[4]=1;
                                    }
                                    else {
                                      S4332=0;
                                      if(allOperationsFinished_o.isACK()){//sysj/orchestrator.sysj line: 73, column: 5
                                        allOperationsFinished_o.setVal(true);//sysj/orchestrator.sysj line: 73, column: 5
                                        S4332=1;
                                        if(!allOperationsFinished_o.isACK()){//sysj/orchestrator.sysj line: 73, column: 5
                                          allOperationsFinished_o.setREQ(false);//sysj/orchestrator.sysj line: 73, column: 5
                                          ends[4]=2;
                                          ;//sysj/orchestrator.sysj line: 73, column: 5
                                          S4022=5;
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
                                    S4022=5;
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
            switch(S4029){
              case 0 : 
                if(!capLoaderStatus_in.isPartnerPresent() || capLoaderStatus_in.isPartnerPreempted()){//sysj/orchestrator.sysj line: 59, column: 4
                  capLoaderStatus_in.setACK(false);//sysj/orchestrator.sysj line: 59, column: 4
                  S4029=1;
                  active[4]=1;
                  ends[4]=1;
                  tdone[4]=1;
                }
                else {
                  switch(S4024){
                    case 0 : 
                      if(!capLoaderStatus_in.isREQ()){//sysj/orchestrator.sysj line: 59, column: 4
                        capLoaderStatus_in.setACK(true);//sysj/orchestrator.sysj line: 59, column: 4
                        S4024=1;
                        if(capLoaderStatus_in.isREQ()){//sysj/orchestrator.sysj line: 59, column: 4
                          capLoaderStatus_in.setACK(false);//sysj/orchestrator.sysj line: 59, column: 4
                          ends[4]=2;
                          ;//sysj/orchestrator.sysj line: 59, column: 4
                          S4022=3;
                          S4161=0;
                          if(!capperStatus_in.isPartnerPresent() || capperStatus_in.isPartnerPreempted()){//sysj/orchestrator.sysj line: 60, column: 4
                            capperStatus_in.setACK(false);//sysj/orchestrator.sysj line: 60, column: 4
                            S4161=1;
                            active[4]=1;
                            ends[4]=1;
                            tdone[4]=1;
                          }
                          else {
                            S4156=0;
                            if(!capperStatus_in.isREQ()){//sysj/orchestrator.sysj line: 60, column: 4
                              capperStatus_in.setACK(true);//sysj/orchestrator.sysj line: 60, column: 4
                              S4156=1;
                              if(capperStatus_in.isREQ()){//sysj/orchestrator.sysj line: 60, column: 4
                                capperStatus_in.setACK(false);//sysj/orchestrator.sysj line: 60, column: 4
                                ends[4]=2;
                                ;//sysj/orchestrator.sysj line: 60, column: 4
                                coveyStat_thread_4 = (conveyorStatus_in.getVal() == null ? null : ((String)conveyorStatus_in.getVal()));//sysj/orchestrator.sysj line: 62, column: 4
                                fillerStat_thread_4 = (fillerStatus_in.getVal() == null ? null : ((String)fillerStatus_in.getVal()));//sysj/orchestrator.sysj line: 63, column: 4
                                screwerStat_thread_4 = (capLoaderStatus_in.getVal() == null ? null : ((String)capLoaderStatus_in.getVal()));//sysj/orchestrator.sysj line: 64, column: 4
                                loaderStat_thread_4 = (capperStatus_in.getVal() == null ? null : ((String)capperStatus_in.getVal()));//sysj/orchestrator.sysj line: 65, column: 4
                                S4022=4;
                                if((conveyStat == "done" || conveyStat == "idle") && (fillerStat_thread_4 == "done" || fillerStat_thread_4 == "idle") && (screwerStat_thread_4 == "done" || screwerStat_thread_4 == "idle") && (loaderStat_thread_4 == "done" || loaderStat_thread_4 == "idle")){//sysj/orchestrator.sysj line: 68, column: 7
                                  S4337=0;
                                  if(!allOperationsFinished_o.isPartnerPresent() || allOperationsFinished_o.isPartnerPreempted()){//sysj/orchestrator.sysj line: 73, column: 5
                                    allOperationsFinished_o.setREQ(false);//sysj/orchestrator.sysj line: 73, column: 5
                                    S4337=1;
                                    active[4]=1;
                                    ends[4]=1;
                                    tdone[4]=1;
                                  }
                                  else {
                                    S4332=0;
                                    if(allOperationsFinished_o.isACK()){//sysj/orchestrator.sysj line: 73, column: 5
                                      allOperationsFinished_o.setVal(true);//sysj/orchestrator.sysj line: 73, column: 5
                                      S4332=1;
                                      if(!allOperationsFinished_o.isACK()){//sysj/orchestrator.sysj line: 73, column: 5
                                        allOperationsFinished_o.setREQ(false);//sysj/orchestrator.sysj line: 73, column: 5
                                        ends[4]=2;
                                        ;//sysj/orchestrator.sysj line: 73, column: 5
                                        S4022=5;
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
                                  S4022=5;
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
                      if(capLoaderStatus_in.isREQ()){//sysj/orchestrator.sysj line: 59, column: 4
                        capLoaderStatus_in.setACK(false);//sysj/orchestrator.sysj line: 59, column: 4
                        ends[4]=2;
                        ;//sysj/orchestrator.sysj line: 59, column: 4
                        S4022=3;
                        S4161=0;
                        if(!capperStatus_in.isPartnerPresent() || capperStatus_in.isPartnerPreempted()){//sysj/orchestrator.sysj line: 60, column: 4
                          capperStatus_in.setACK(false);//sysj/orchestrator.sysj line: 60, column: 4
                          S4161=1;
                          active[4]=1;
                          ends[4]=1;
                          tdone[4]=1;
                        }
                        else {
                          S4156=0;
                          if(!capperStatus_in.isREQ()){//sysj/orchestrator.sysj line: 60, column: 4
                            capperStatus_in.setACK(true);//sysj/orchestrator.sysj line: 60, column: 4
                            S4156=1;
                            if(capperStatus_in.isREQ()){//sysj/orchestrator.sysj line: 60, column: 4
                              capperStatus_in.setACK(false);//sysj/orchestrator.sysj line: 60, column: 4
                              ends[4]=2;
                              ;//sysj/orchestrator.sysj line: 60, column: 4
                              coveyStat_thread_4 = (conveyorStatus_in.getVal() == null ? null : ((String)conveyorStatus_in.getVal()));//sysj/orchestrator.sysj line: 62, column: 4
                              fillerStat_thread_4 = (fillerStatus_in.getVal() == null ? null : ((String)fillerStatus_in.getVal()));//sysj/orchestrator.sysj line: 63, column: 4
                              screwerStat_thread_4 = (capLoaderStatus_in.getVal() == null ? null : ((String)capLoaderStatus_in.getVal()));//sysj/orchestrator.sysj line: 64, column: 4
                              loaderStat_thread_4 = (capperStatus_in.getVal() == null ? null : ((String)capperStatus_in.getVal()));//sysj/orchestrator.sysj line: 65, column: 4
                              S4022=4;
                              if((conveyStat == "done" || conveyStat == "idle") && (fillerStat_thread_4 == "done" || fillerStat_thread_4 == "idle") && (screwerStat_thread_4 == "done" || screwerStat_thread_4 == "idle") && (loaderStat_thread_4 == "done" || loaderStat_thread_4 == "idle")){//sysj/orchestrator.sysj line: 68, column: 7
                                S4337=0;
                                if(!allOperationsFinished_o.isPartnerPresent() || allOperationsFinished_o.isPartnerPreempted()){//sysj/orchestrator.sysj line: 73, column: 5
                                  allOperationsFinished_o.setREQ(false);//sysj/orchestrator.sysj line: 73, column: 5
                                  S4337=1;
                                  active[4]=1;
                                  ends[4]=1;
                                  tdone[4]=1;
                                }
                                else {
                                  S4332=0;
                                  if(allOperationsFinished_o.isACK()){//sysj/orchestrator.sysj line: 73, column: 5
                                    allOperationsFinished_o.setVal(true);//sysj/orchestrator.sysj line: 73, column: 5
                                    S4332=1;
                                    if(!allOperationsFinished_o.isACK()){//sysj/orchestrator.sysj line: 73, column: 5
                                      allOperationsFinished_o.setREQ(false);//sysj/orchestrator.sysj line: 73, column: 5
                                      ends[4]=2;
                                      ;//sysj/orchestrator.sysj line: 73, column: 5
                                      S4022=5;
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
                                S4022=5;
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
                S4029=1;
                S4029=0;
                if(!capLoaderStatus_in.isPartnerPresent() || capLoaderStatus_in.isPartnerPreempted()){//sysj/orchestrator.sysj line: 59, column: 4
                  capLoaderStatus_in.setACK(false);//sysj/orchestrator.sysj line: 59, column: 4
                  S4029=1;
                  active[4]=1;
                  ends[4]=1;
                  tdone[4]=1;
                }
                else {
                  S4024=0;
                  if(!capLoaderStatus_in.isREQ()){//sysj/orchestrator.sysj line: 59, column: 4
                    capLoaderStatus_in.setACK(true);//sysj/orchestrator.sysj line: 59, column: 4
                    S4024=1;
                    if(capLoaderStatus_in.isREQ()){//sysj/orchestrator.sysj line: 59, column: 4
                      capLoaderStatus_in.setACK(false);//sysj/orchestrator.sysj line: 59, column: 4
                      ends[4]=2;
                      ;//sysj/orchestrator.sysj line: 59, column: 4
                      S4022=3;
                      S4161=0;
                      if(!capperStatus_in.isPartnerPresent() || capperStatus_in.isPartnerPreempted()){//sysj/orchestrator.sysj line: 60, column: 4
                        capperStatus_in.setACK(false);//sysj/orchestrator.sysj line: 60, column: 4
                        S4161=1;
                        active[4]=1;
                        ends[4]=1;
                        tdone[4]=1;
                      }
                      else {
                        S4156=0;
                        if(!capperStatus_in.isREQ()){//sysj/orchestrator.sysj line: 60, column: 4
                          capperStatus_in.setACK(true);//sysj/orchestrator.sysj line: 60, column: 4
                          S4156=1;
                          if(capperStatus_in.isREQ()){//sysj/orchestrator.sysj line: 60, column: 4
                            capperStatus_in.setACK(false);//sysj/orchestrator.sysj line: 60, column: 4
                            ends[4]=2;
                            ;//sysj/orchestrator.sysj line: 60, column: 4
                            coveyStat_thread_4 = (conveyorStatus_in.getVal() == null ? null : ((String)conveyorStatus_in.getVal()));//sysj/orchestrator.sysj line: 62, column: 4
                            fillerStat_thread_4 = (fillerStatus_in.getVal() == null ? null : ((String)fillerStatus_in.getVal()));//sysj/orchestrator.sysj line: 63, column: 4
                            screwerStat_thread_4 = (capLoaderStatus_in.getVal() == null ? null : ((String)capLoaderStatus_in.getVal()));//sysj/orchestrator.sysj line: 64, column: 4
                            loaderStat_thread_4 = (capperStatus_in.getVal() == null ? null : ((String)capperStatus_in.getVal()));//sysj/orchestrator.sysj line: 65, column: 4
                            S4022=4;
                            if((conveyStat == "done" || conveyStat == "idle") && (fillerStat_thread_4 == "done" || fillerStat_thread_4 == "idle") && (screwerStat_thread_4 == "done" || screwerStat_thread_4 == "idle") && (loaderStat_thread_4 == "done" || loaderStat_thread_4 == "idle")){//sysj/orchestrator.sysj line: 68, column: 7
                              S4337=0;
                              if(!allOperationsFinished_o.isPartnerPresent() || allOperationsFinished_o.isPartnerPreempted()){//sysj/orchestrator.sysj line: 73, column: 5
                                allOperationsFinished_o.setREQ(false);//sysj/orchestrator.sysj line: 73, column: 5
                                S4337=1;
                                active[4]=1;
                                ends[4]=1;
                                tdone[4]=1;
                              }
                              else {
                                S4332=0;
                                if(allOperationsFinished_o.isACK()){//sysj/orchestrator.sysj line: 73, column: 5
                                  allOperationsFinished_o.setVal(true);//sysj/orchestrator.sysj line: 73, column: 5
                                  S4332=1;
                                  if(!allOperationsFinished_o.isACK()){//sysj/orchestrator.sysj line: 73, column: 5
                                    allOperationsFinished_o.setREQ(false);//sysj/orchestrator.sysj line: 73, column: 5
                                    ends[4]=2;
                                    ;//sysj/orchestrator.sysj line: 73, column: 5
                                    S4022=5;
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
                              S4022=5;
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
            switch(S4161){
              case 0 : 
                if(!capperStatus_in.isPartnerPresent() || capperStatus_in.isPartnerPreempted()){//sysj/orchestrator.sysj line: 60, column: 4
                  capperStatus_in.setACK(false);//sysj/orchestrator.sysj line: 60, column: 4
                  S4161=1;
                  active[4]=1;
                  ends[4]=1;
                  tdone[4]=1;
                }
                else {
                  switch(S4156){
                    case 0 : 
                      if(!capperStatus_in.isREQ()){//sysj/orchestrator.sysj line: 60, column: 4
                        capperStatus_in.setACK(true);//sysj/orchestrator.sysj line: 60, column: 4
                        S4156=1;
                        if(capperStatus_in.isREQ()){//sysj/orchestrator.sysj line: 60, column: 4
                          capperStatus_in.setACK(false);//sysj/orchestrator.sysj line: 60, column: 4
                          ends[4]=2;
                          ;//sysj/orchestrator.sysj line: 60, column: 4
                          coveyStat_thread_4 = (conveyorStatus_in.getVal() == null ? null : ((String)conveyorStatus_in.getVal()));//sysj/orchestrator.sysj line: 62, column: 4
                          fillerStat_thread_4 = (fillerStatus_in.getVal() == null ? null : ((String)fillerStatus_in.getVal()));//sysj/orchestrator.sysj line: 63, column: 4
                          screwerStat_thread_4 = (capLoaderStatus_in.getVal() == null ? null : ((String)capLoaderStatus_in.getVal()));//sysj/orchestrator.sysj line: 64, column: 4
                          loaderStat_thread_4 = (capperStatus_in.getVal() == null ? null : ((String)capperStatus_in.getVal()));//sysj/orchestrator.sysj line: 65, column: 4
                          S4022=4;
                          if((conveyStat == "done" || conveyStat == "idle") && (fillerStat_thread_4 == "done" || fillerStat_thread_4 == "idle") && (screwerStat_thread_4 == "done" || screwerStat_thread_4 == "idle") && (loaderStat_thread_4 == "done" || loaderStat_thread_4 == "idle")){//sysj/orchestrator.sysj line: 68, column: 7
                            S4337=0;
                            if(!allOperationsFinished_o.isPartnerPresent() || allOperationsFinished_o.isPartnerPreempted()){//sysj/orchestrator.sysj line: 73, column: 5
                              allOperationsFinished_o.setREQ(false);//sysj/orchestrator.sysj line: 73, column: 5
                              S4337=1;
                              active[4]=1;
                              ends[4]=1;
                              tdone[4]=1;
                            }
                            else {
                              S4332=0;
                              if(allOperationsFinished_o.isACK()){//sysj/orchestrator.sysj line: 73, column: 5
                                allOperationsFinished_o.setVal(true);//sysj/orchestrator.sysj line: 73, column: 5
                                S4332=1;
                                if(!allOperationsFinished_o.isACK()){//sysj/orchestrator.sysj line: 73, column: 5
                                  allOperationsFinished_o.setREQ(false);//sysj/orchestrator.sysj line: 73, column: 5
                                  ends[4]=2;
                                  ;//sysj/orchestrator.sysj line: 73, column: 5
                                  S4022=5;
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
                            S4022=5;
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
                      if(capperStatus_in.isREQ()){//sysj/orchestrator.sysj line: 60, column: 4
                        capperStatus_in.setACK(false);//sysj/orchestrator.sysj line: 60, column: 4
                        ends[4]=2;
                        ;//sysj/orchestrator.sysj line: 60, column: 4
                        coveyStat_thread_4 = (conveyorStatus_in.getVal() == null ? null : ((String)conveyorStatus_in.getVal()));//sysj/orchestrator.sysj line: 62, column: 4
                        fillerStat_thread_4 = (fillerStatus_in.getVal() == null ? null : ((String)fillerStatus_in.getVal()));//sysj/orchestrator.sysj line: 63, column: 4
                        screwerStat_thread_4 = (capLoaderStatus_in.getVal() == null ? null : ((String)capLoaderStatus_in.getVal()));//sysj/orchestrator.sysj line: 64, column: 4
                        loaderStat_thread_4 = (capperStatus_in.getVal() == null ? null : ((String)capperStatus_in.getVal()));//sysj/orchestrator.sysj line: 65, column: 4
                        S4022=4;
                        if((conveyStat == "done" || conveyStat == "idle") && (fillerStat_thread_4 == "done" || fillerStat_thread_4 == "idle") && (screwerStat_thread_4 == "done" || screwerStat_thread_4 == "idle") && (loaderStat_thread_4 == "done" || loaderStat_thread_4 == "idle")){//sysj/orchestrator.sysj line: 68, column: 7
                          S4337=0;
                          if(!allOperationsFinished_o.isPartnerPresent() || allOperationsFinished_o.isPartnerPreempted()){//sysj/orchestrator.sysj line: 73, column: 5
                            allOperationsFinished_o.setREQ(false);//sysj/orchestrator.sysj line: 73, column: 5
                            S4337=1;
                            active[4]=1;
                            ends[4]=1;
                            tdone[4]=1;
                          }
                          else {
                            S4332=0;
                            if(allOperationsFinished_o.isACK()){//sysj/orchestrator.sysj line: 73, column: 5
                              allOperationsFinished_o.setVal(true);//sysj/orchestrator.sysj line: 73, column: 5
                              S4332=1;
                              if(!allOperationsFinished_o.isACK()){//sysj/orchestrator.sysj line: 73, column: 5
                                allOperationsFinished_o.setREQ(false);//sysj/orchestrator.sysj line: 73, column: 5
                                ends[4]=2;
                                ;//sysj/orchestrator.sysj line: 73, column: 5
                                S4022=5;
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
                          S4022=5;
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
                S4161=1;
                S4161=0;
                if(!capperStatus_in.isPartnerPresent() || capperStatus_in.isPartnerPreempted()){//sysj/orchestrator.sysj line: 60, column: 4
                  capperStatus_in.setACK(false);//sysj/orchestrator.sysj line: 60, column: 4
                  S4161=1;
                  active[4]=1;
                  ends[4]=1;
                  tdone[4]=1;
                }
                else {
                  S4156=0;
                  if(!capperStatus_in.isREQ()){//sysj/orchestrator.sysj line: 60, column: 4
                    capperStatus_in.setACK(true);//sysj/orchestrator.sysj line: 60, column: 4
                    S4156=1;
                    if(capperStatus_in.isREQ()){//sysj/orchestrator.sysj line: 60, column: 4
                      capperStatus_in.setACK(false);//sysj/orchestrator.sysj line: 60, column: 4
                      ends[4]=2;
                      ;//sysj/orchestrator.sysj line: 60, column: 4
                      coveyStat_thread_4 = (conveyorStatus_in.getVal() == null ? null : ((String)conveyorStatus_in.getVal()));//sysj/orchestrator.sysj line: 62, column: 4
                      fillerStat_thread_4 = (fillerStatus_in.getVal() == null ? null : ((String)fillerStatus_in.getVal()));//sysj/orchestrator.sysj line: 63, column: 4
                      screwerStat_thread_4 = (capLoaderStatus_in.getVal() == null ? null : ((String)capLoaderStatus_in.getVal()));//sysj/orchestrator.sysj line: 64, column: 4
                      loaderStat_thread_4 = (capperStatus_in.getVal() == null ? null : ((String)capperStatus_in.getVal()));//sysj/orchestrator.sysj line: 65, column: 4
                      S4022=4;
                      if((conveyStat == "done" || conveyStat == "idle") && (fillerStat_thread_4 == "done" || fillerStat_thread_4 == "idle") && (screwerStat_thread_4 == "done" || screwerStat_thread_4 == "idle") && (loaderStat_thread_4 == "done" || loaderStat_thread_4 == "idle")){//sysj/orchestrator.sysj line: 68, column: 7
                        S4337=0;
                        if(!allOperationsFinished_o.isPartnerPresent() || allOperationsFinished_o.isPartnerPreempted()){//sysj/orchestrator.sysj line: 73, column: 5
                          allOperationsFinished_o.setREQ(false);//sysj/orchestrator.sysj line: 73, column: 5
                          S4337=1;
                          active[4]=1;
                          ends[4]=1;
                          tdone[4]=1;
                        }
                        else {
                          S4332=0;
                          if(allOperationsFinished_o.isACK()){//sysj/orchestrator.sysj line: 73, column: 5
                            allOperationsFinished_o.setVal(true);//sysj/orchestrator.sysj line: 73, column: 5
                            S4332=1;
                            if(!allOperationsFinished_o.isACK()){//sysj/orchestrator.sysj line: 73, column: 5
                              allOperationsFinished_o.setREQ(false);//sysj/orchestrator.sysj line: 73, column: 5
                              ends[4]=2;
                              ;//sysj/orchestrator.sysj line: 73, column: 5
                              S4022=5;
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
                        S4022=5;
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
            switch(S4337){
              case 0 : 
                if(!allOperationsFinished_o.isPartnerPresent() || allOperationsFinished_o.isPartnerPreempted()){//sysj/orchestrator.sysj line: 73, column: 5
                  allOperationsFinished_o.setREQ(false);//sysj/orchestrator.sysj line: 73, column: 5
                  S4337=1;
                  active[4]=1;
                  ends[4]=1;
                  tdone[4]=1;
                }
                else {
                  switch(S4332){
                    case 0 : 
                      if(allOperationsFinished_o.isACK()){//sysj/orchestrator.sysj line: 73, column: 5
                        allOperationsFinished_o.setVal(true);//sysj/orchestrator.sysj line: 73, column: 5
                        S4332=1;
                        if(!allOperationsFinished_o.isACK()){//sysj/orchestrator.sysj line: 73, column: 5
                          allOperationsFinished_o.setREQ(false);//sysj/orchestrator.sysj line: 73, column: 5
                          ends[4]=2;
                          ;//sysj/orchestrator.sysj line: 73, column: 5
                          S4022=5;
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
                      if(!allOperationsFinished_o.isACK()){//sysj/orchestrator.sysj line: 73, column: 5
                        allOperationsFinished_o.setREQ(false);//sysj/orchestrator.sysj line: 73, column: 5
                        ends[4]=2;
                        ;//sysj/orchestrator.sysj line: 73, column: 5
                        S4022=5;
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
                S4337=1;
                S4337=0;
                if(!allOperationsFinished_o.isPartnerPresent() || allOperationsFinished_o.isPartnerPreempted()){//sysj/orchestrator.sysj line: 73, column: 5
                  allOperationsFinished_o.setREQ(false);//sysj/orchestrator.sysj line: 73, column: 5
                  S4337=1;
                  active[4]=1;
                  ends[4]=1;
                  tdone[4]=1;
                }
                else {
                  S4332=0;
                  if(allOperationsFinished_o.isACK()){//sysj/orchestrator.sysj line: 73, column: 5
                    allOperationsFinished_o.setVal(true);//sysj/orchestrator.sysj line: 73, column: 5
                    S4332=1;
                    if(!allOperationsFinished_o.isACK()){//sysj/orchestrator.sysj line: 73, column: 5
                      allOperationsFinished_o.setREQ(false);//sysj/orchestrator.sysj line: 73, column: 5
                      ends[4]=2;
                      ;//sysj/orchestrator.sysj line: 73, column: 5
                      S4022=5;
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
            S4022=5;
            S4022=0;
            S3918=0;
            if(!conveyorStatus_in.isPartnerPresent() || conveyorStatus_in.isPartnerPreempted()){//sysj/orchestrator.sysj line: 57, column: 4
              conveyorStatus_in.setACK(false);//sysj/orchestrator.sysj line: 57, column: 4
              S3918=1;
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            else {
              S3913=0;
              if(!conveyorStatus_in.isREQ()){//sysj/orchestrator.sysj line: 57, column: 4
                conveyorStatus_in.setACK(true);//sysj/orchestrator.sysj line: 57, column: 4
                S3913=1;
                if(conveyorStatus_in.isREQ()){//sysj/orchestrator.sysj line: 57, column: 4
                  conveyorStatus_in.setACK(false);//sysj/orchestrator.sysj line: 57, column: 4
                  ends[4]=2;
                  ;//sysj/orchestrator.sysj line: 57, column: 4
                  S4022=1;
                  S3940=0;
                  if(!fillerStatus_in.isPartnerPresent() || fillerStatus_in.isPartnerPreempted()){//sysj/orchestrator.sysj line: 58, column: 4
                    fillerStatus_in.setACK(false);//sysj/orchestrator.sysj line: 58, column: 4
                    S3940=1;
                    active[4]=1;
                    ends[4]=1;
                    tdone[4]=1;
                  }
                  else {
                    S3935=0;
                    if(!fillerStatus_in.isREQ()){//sysj/orchestrator.sysj line: 58, column: 4
                      fillerStatus_in.setACK(true);//sysj/orchestrator.sysj line: 58, column: 4
                      S3935=1;
                      if(fillerStatus_in.isREQ()){//sysj/orchestrator.sysj line: 58, column: 4
                        fillerStatus_in.setACK(false);//sysj/orchestrator.sysj line: 58, column: 4
                        ends[4]=2;
                        ;//sysj/orchestrator.sysj line: 58, column: 4
                        S4022=2;
                        S4029=0;
                        if(!capLoaderStatus_in.isPartnerPresent() || capLoaderStatus_in.isPartnerPreempted()){//sysj/orchestrator.sysj line: 59, column: 4
                          capLoaderStatus_in.setACK(false);//sysj/orchestrator.sysj line: 59, column: 4
                          S4029=1;
                          active[4]=1;
                          ends[4]=1;
                          tdone[4]=1;
                        }
                        else {
                          S4024=0;
                          if(!capLoaderStatus_in.isREQ()){//sysj/orchestrator.sysj line: 59, column: 4
                            capLoaderStatus_in.setACK(true);//sysj/orchestrator.sysj line: 59, column: 4
                            S4024=1;
                            if(capLoaderStatus_in.isREQ()){//sysj/orchestrator.sysj line: 59, column: 4
                              capLoaderStatus_in.setACK(false);//sysj/orchestrator.sysj line: 59, column: 4
                              ends[4]=2;
                              ;//sysj/orchestrator.sysj line: 59, column: 4
                              S4022=3;
                              S4161=0;
                              if(!capperStatus_in.isPartnerPresent() || capperStatus_in.isPartnerPreempted()){//sysj/orchestrator.sysj line: 60, column: 4
                                capperStatus_in.setACK(false);//sysj/orchestrator.sysj line: 60, column: 4
                                S4161=1;
                                active[4]=1;
                                ends[4]=1;
                                tdone[4]=1;
                              }
                              else {
                                S4156=0;
                                if(!capperStatus_in.isREQ()){//sysj/orchestrator.sysj line: 60, column: 4
                                  capperStatus_in.setACK(true);//sysj/orchestrator.sysj line: 60, column: 4
                                  S4156=1;
                                  if(capperStatus_in.isREQ()){//sysj/orchestrator.sysj line: 60, column: 4
                                    capperStatus_in.setACK(false);//sysj/orchestrator.sysj line: 60, column: 4
                                    ends[4]=2;
                                    ;//sysj/orchestrator.sysj line: 60, column: 4
                                    coveyStat_thread_4 = (conveyorStatus_in.getVal() == null ? null : ((String)conveyorStatus_in.getVal()));//sysj/orchestrator.sysj line: 62, column: 4
                                    fillerStat_thread_4 = (fillerStatus_in.getVal() == null ? null : ((String)fillerStatus_in.getVal()));//sysj/orchestrator.sysj line: 63, column: 4
                                    screwerStat_thread_4 = (capLoaderStatus_in.getVal() == null ? null : ((String)capLoaderStatus_in.getVal()));//sysj/orchestrator.sysj line: 64, column: 4
                                    loaderStat_thread_4 = (capperStatus_in.getVal() == null ? null : ((String)capperStatus_in.getVal()));//sysj/orchestrator.sysj line: 65, column: 4
                                    S4022=4;
                                    if((conveyStat == "done" || conveyStat == "idle") && (fillerStat_thread_4 == "done" || fillerStat_thread_4 == "idle") && (screwerStat_thread_4 == "done" || screwerStat_thread_4 == "idle") && (loaderStat_thread_4 == "done" || loaderStat_thread_4 == "idle")){//sysj/orchestrator.sysj line: 68, column: 7
                                      S4337=0;
                                      if(!allOperationsFinished_o.isPartnerPresent() || allOperationsFinished_o.isPartnerPreempted()){//sysj/orchestrator.sysj line: 73, column: 5
                                        allOperationsFinished_o.setREQ(false);//sysj/orchestrator.sysj line: 73, column: 5
                                        S4337=1;
                                        active[4]=1;
                                        ends[4]=1;
                                        tdone[4]=1;
                                      }
                                      else {
                                        S4332=0;
                                        if(allOperationsFinished_o.isACK()){//sysj/orchestrator.sysj line: 73, column: 5
                                          allOperationsFinished_o.setVal(true);//sysj/orchestrator.sysj line: 73, column: 5
                                          S4332=1;
                                          if(!allOperationsFinished_o.isACK()){//sysj/orchestrator.sysj line: 73, column: 5
                                            allOperationsFinished_o.setREQ(false);//sysj/orchestrator.sysj line: 73, column: 5
                                            ends[4]=2;
                                            ;//sysj/orchestrator.sysj line: 73, column: 5
                                            S4022=5;
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
                                      S4022=5;
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

  public void thread23448(int [] tdone, int [] ends){
        switch(S3911){
      case 0 : 
        active[3]=0;
        ends[3]=0;
        tdone[3]=1;
        break;
      
      case 1 : 
        switch(S935){
          case 0 : 
            switch(S919){
              case 0 : 
                if(!rotaryStatus_in.isPartnerPresent() || rotaryStatus_in.isPartnerPreempted()){//sysj/orchestrator.sysj line: 40, column: 4
                  rotaryStatus_in.setACK(false);//sysj/orchestrator.sysj line: 40, column: 4
                  S919=1;
                  active[3]=1;
                  ends[3]=1;
                  tdone[3]=1;
                }
                else {
                  switch(S914){
                    case 0 : 
                      if(!rotaryStatus_in.isREQ()){//sysj/orchestrator.sysj line: 40, column: 4
                        rotaryStatus_in.setACK(true);//sysj/orchestrator.sysj line: 40, column: 4
                        S914=1;
                        if(rotaryStatus_in.isREQ()){//sysj/orchestrator.sysj line: 40, column: 4
                          rotaryStatus_in.setACK(false);//sysj/orchestrator.sysj line: 40, column: 4
                          ends[3]=2;
                          ;//sysj/orchestrator.sysj line: 40, column: 4
                          rotaryStat_thread_3 = (rotaryStatus_in.getVal() == null ? null : ((String)rotaryStatus_in.getVal()));//sysj/orchestrator.sysj line: 41, column: 4
                          S935=1;
                          if(rotaryStat_thread_3 == "done"){//sysj/orchestrator.sysj line: 44, column: 7
                            S1046=0;
                            S942=0;
                            if(!fillerReq_o.isPartnerPresent() || fillerReq_o.isPartnerPreempted()){//sysj/orchestrator.sysj line: 45, column: 5
                              fillerReq_o.setREQ(false);//sysj/orchestrator.sysj line: 45, column: 5
                              S942=1;
                              active[3]=1;
                              ends[3]=1;
                              tdone[3]=1;
                            }
                            else {
                              S937=0;
                              if(fillerReq_o.isACK()){//sysj/orchestrator.sysj line: 45, column: 5
                                fillerReq_o.setVal(true);//sysj/orchestrator.sysj line: 45, column: 5
                                S937=1;
                                if(!fillerReq_o.isACK()){//sysj/orchestrator.sysj line: 45, column: 5
                                  fillerReq_o.setREQ(false);//sysj/orchestrator.sysj line: 45, column: 5
                                  ends[3]=2;
                                  ;//sysj/orchestrator.sysj line: 45, column: 5
                                  S1046=1;
                                  S964=0;
                                  if(!capLoaderReq_o.isPartnerPresent() || capLoaderReq_o.isPartnerPreempted()){//sysj/orchestrator.sysj line: 46, column: 5
                                    capLoaderReq_o.setREQ(false);//sysj/orchestrator.sysj line: 46, column: 5
                                    S964=1;
                                    active[3]=1;
                                    ends[3]=1;
                                    tdone[3]=1;
                                  }
                                  else {
                                    S959=0;
                                    if(capLoaderReq_o.isACK()){//sysj/orchestrator.sysj line: 46, column: 5
                                      capLoaderReq_o.setVal(true);//sysj/orchestrator.sysj line: 46, column: 5
                                      S959=1;
                                      if(!capLoaderReq_o.isACK()){//sysj/orchestrator.sysj line: 46, column: 5
                                        capLoaderReq_o.setREQ(false);//sysj/orchestrator.sysj line: 46, column: 5
                                        ends[3]=2;
                                        ;//sysj/orchestrator.sysj line: 46, column: 5
                                        S1046=2;
                                        S1053=0;
                                        if(!capperReq_o.isPartnerPresent() || capperReq_o.isPartnerPreempted()){//sysj/orchestrator.sysj line: 47, column: 5
                                          capperReq_o.setREQ(false);//sysj/orchestrator.sysj line: 47, column: 5
                                          S1053=1;
                                          active[3]=1;
                                          ends[3]=1;
                                          tdone[3]=1;
                                        }
                                        else {
                                          S1048=0;
                                          if(capperReq_o.isACK()){//sysj/orchestrator.sysj line: 47, column: 5
                                            capperReq_o.setVal(true);//sysj/orchestrator.sysj line: 47, column: 5
                                            S1048=1;
                                            if(!capperReq_o.isACK()){//sysj/orchestrator.sysj line: 47, column: 5
                                              capperReq_o.setREQ(false);//sysj/orchestrator.sysj line: 47, column: 5
                                              ends[3]=2;
                                              ;//sysj/orchestrator.sysj line: 47, column: 5
                                              getNextBottle_1.setPresent();//sysj/orchestrator.sysj line: 48, column: 5
                                              currsigs.addElement(getNextBottle_1);
                                              S935=2;
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
                            S935=2;
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
                      if(rotaryStatus_in.isREQ()){//sysj/orchestrator.sysj line: 40, column: 4
                        rotaryStatus_in.setACK(false);//sysj/orchestrator.sysj line: 40, column: 4
                        ends[3]=2;
                        ;//sysj/orchestrator.sysj line: 40, column: 4
                        rotaryStat_thread_3 = (rotaryStatus_in.getVal() == null ? null : ((String)rotaryStatus_in.getVal()));//sysj/orchestrator.sysj line: 41, column: 4
                        S935=1;
                        if(rotaryStat_thread_3 == "done"){//sysj/orchestrator.sysj line: 44, column: 7
                          S1046=0;
                          S942=0;
                          if(!fillerReq_o.isPartnerPresent() || fillerReq_o.isPartnerPreempted()){//sysj/orchestrator.sysj line: 45, column: 5
                            fillerReq_o.setREQ(false);//sysj/orchestrator.sysj line: 45, column: 5
                            S942=1;
                            active[3]=1;
                            ends[3]=1;
                            tdone[3]=1;
                          }
                          else {
                            S937=0;
                            if(fillerReq_o.isACK()){//sysj/orchestrator.sysj line: 45, column: 5
                              fillerReq_o.setVal(true);//sysj/orchestrator.sysj line: 45, column: 5
                              S937=1;
                              if(!fillerReq_o.isACK()){//sysj/orchestrator.sysj line: 45, column: 5
                                fillerReq_o.setREQ(false);//sysj/orchestrator.sysj line: 45, column: 5
                                ends[3]=2;
                                ;//sysj/orchestrator.sysj line: 45, column: 5
                                S1046=1;
                                S964=0;
                                if(!capLoaderReq_o.isPartnerPresent() || capLoaderReq_o.isPartnerPreempted()){//sysj/orchestrator.sysj line: 46, column: 5
                                  capLoaderReq_o.setREQ(false);//sysj/orchestrator.sysj line: 46, column: 5
                                  S964=1;
                                  active[3]=1;
                                  ends[3]=1;
                                  tdone[3]=1;
                                }
                                else {
                                  S959=0;
                                  if(capLoaderReq_o.isACK()){//sysj/orchestrator.sysj line: 46, column: 5
                                    capLoaderReq_o.setVal(true);//sysj/orchestrator.sysj line: 46, column: 5
                                    S959=1;
                                    if(!capLoaderReq_o.isACK()){//sysj/orchestrator.sysj line: 46, column: 5
                                      capLoaderReq_o.setREQ(false);//sysj/orchestrator.sysj line: 46, column: 5
                                      ends[3]=2;
                                      ;//sysj/orchestrator.sysj line: 46, column: 5
                                      S1046=2;
                                      S1053=0;
                                      if(!capperReq_o.isPartnerPresent() || capperReq_o.isPartnerPreempted()){//sysj/orchestrator.sysj line: 47, column: 5
                                        capperReq_o.setREQ(false);//sysj/orchestrator.sysj line: 47, column: 5
                                        S1053=1;
                                        active[3]=1;
                                        ends[3]=1;
                                        tdone[3]=1;
                                      }
                                      else {
                                        S1048=0;
                                        if(capperReq_o.isACK()){//sysj/orchestrator.sysj line: 47, column: 5
                                          capperReq_o.setVal(true);//sysj/orchestrator.sysj line: 47, column: 5
                                          S1048=1;
                                          if(!capperReq_o.isACK()){//sysj/orchestrator.sysj line: 47, column: 5
                                            capperReq_o.setREQ(false);//sysj/orchestrator.sysj line: 47, column: 5
                                            ends[3]=2;
                                            ;//sysj/orchestrator.sysj line: 47, column: 5
                                            getNextBottle_1.setPresent();//sysj/orchestrator.sysj line: 48, column: 5
                                            currsigs.addElement(getNextBottle_1);
                                            S935=2;
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
                          S935=2;
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
                S919=1;
                S919=0;
                if(!rotaryStatus_in.isPartnerPresent() || rotaryStatus_in.isPartnerPreempted()){//sysj/orchestrator.sysj line: 40, column: 4
                  rotaryStatus_in.setACK(false);//sysj/orchestrator.sysj line: 40, column: 4
                  S919=1;
                  active[3]=1;
                  ends[3]=1;
                  tdone[3]=1;
                }
                else {
                  S914=0;
                  if(!rotaryStatus_in.isREQ()){//sysj/orchestrator.sysj line: 40, column: 4
                    rotaryStatus_in.setACK(true);//sysj/orchestrator.sysj line: 40, column: 4
                    S914=1;
                    if(rotaryStatus_in.isREQ()){//sysj/orchestrator.sysj line: 40, column: 4
                      rotaryStatus_in.setACK(false);//sysj/orchestrator.sysj line: 40, column: 4
                      ends[3]=2;
                      ;//sysj/orchestrator.sysj line: 40, column: 4
                      rotaryStat_thread_3 = (rotaryStatus_in.getVal() == null ? null : ((String)rotaryStatus_in.getVal()));//sysj/orchestrator.sysj line: 41, column: 4
                      S935=1;
                      if(rotaryStat_thread_3 == "done"){//sysj/orchestrator.sysj line: 44, column: 7
                        S1046=0;
                        S942=0;
                        if(!fillerReq_o.isPartnerPresent() || fillerReq_o.isPartnerPreempted()){//sysj/orchestrator.sysj line: 45, column: 5
                          fillerReq_o.setREQ(false);//sysj/orchestrator.sysj line: 45, column: 5
                          S942=1;
                          active[3]=1;
                          ends[3]=1;
                          tdone[3]=1;
                        }
                        else {
                          S937=0;
                          if(fillerReq_o.isACK()){//sysj/orchestrator.sysj line: 45, column: 5
                            fillerReq_o.setVal(true);//sysj/orchestrator.sysj line: 45, column: 5
                            S937=1;
                            if(!fillerReq_o.isACK()){//sysj/orchestrator.sysj line: 45, column: 5
                              fillerReq_o.setREQ(false);//sysj/orchestrator.sysj line: 45, column: 5
                              ends[3]=2;
                              ;//sysj/orchestrator.sysj line: 45, column: 5
                              S1046=1;
                              S964=0;
                              if(!capLoaderReq_o.isPartnerPresent() || capLoaderReq_o.isPartnerPreempted()){//sysj/orchestrator.sysj line: 46, column: 5
                                capLoaderReq_o.setREQ(false);//sysj/orchestrator.sysj line: 46, column: 5
                                S964=1;
                                active[3]=1;
                                ends[3]=1;
                                tdone[3]=1;
                              }
                              else {
                                S959=0;
                                if(capLoaderReq_o.isACK()){//sysj/orchestrator.sysj line: 46, column: 5
                                  capLoaderReq_o.setVal(true);//sysj/orchestrator.sysj line: 46, column: 5
                                  S959=1;
                                  if(!capLoaderReq_o.isACK()){//sysj/orchestrator.sysj line: 46, column: 5
                                    capLoaderReq_o.setREQ(false);//sysj/orchestrator.sysj line: 46, column: 5
                                    ends[3]=2;
                                    ;//sysj/orchestrator.sysj line: 46, column: 5
                                    S1046=2;
                                    S1053=0;
                                    if(!capperReq_o.isPartnerPresent() || capperReq_o.isPartnerPreempted()){//sysj/orchestrator.sysj line: 47, column: 5
                                      capperReq_o.setREQ(false);//sysj/orchestrator.sysj line: 47, column: 5
                                      S1053=1;
                                      active[3]=1;
                                      ends[3]=1;
                                      tdone[3]=1;
                                    }
                                    else {
                                      S1048=0;
                                      if(capperReq_o.isACK()){//sysj/orchestrator.sysj line: 47, column: 5
                                        capperReq_o.setVal(true);//sysj/orchestrator.sysj line: 47, column: 5
                                        S1048=1;
                                        if(!capperReq_o.isACK()){//sysj/orchestrator.sysj line: 47, column: 5
                                          capperReq_o.setREQ(false);//sysj/orchestrator.sysj line: 47, column: 5
                                          ends[3]=2;
                                          ;//sysj/orchestrator.sysj line: 47, column: 5
                                          getNextBottle_1.setPresent();//sysj/orchestrator.sysj line: 48, column: 5
                                          currsigs.addElement(getNextBottle_1);
                                          S935=2;
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
                        S935=2;
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
            switch(S1046){
              case 0 : 
                switch(S942){
                  case 0 : 
                    if(!fillerReq_o.isPartnerPresent() || fillerReq_o.isPartnerPreempted()){//sysj/orchestrator.sysj line: 45, column: 5
                      fillerReq_o.setREQ(false);//sysj/orchestrator.sysj line: 45, column: 5
                      S942=1;
                      active[3]=1;
                      ends[3]=1;
                      tdone[3]=1;
                    }
                    else {
                      switch(S937){
                        case 0 : 
                          if(fillerReq_o.isACK()){//sysj/orchestrator.sysj line: 45, column: 5
                            fillerReq_o.setVal(true);//sysj/orchestrator.sysj line: 45, column: 5
                            S937=1;
                            if(!fillerReq_o.isACK()){//sysj/orchestrator.sysj line: 45, column: 5
                              fillerReq_o.setREQ(false);//sysj/orchestrator.sysj line: 45, column: 5
                              ends[3]=2;
                              ;//sysj/orchestrator.sysj line: 45, column: 5
                              S1046=1;
                              S964=0;
                              if(!capLoaderReq_o.isPartnerPresent() || capLoaderReq_o.isPartnerPreempted()){//sysj/orchestrator.sysj line: 46, column: 5
                                capLoaderReq_o.setREQ(false);//sysj/orchestrator.sysj line: 46, column: 5
                                S964=1;
                                active[3]=1;
                                ends[3]=1;
                                tdone[3]=1;
                              }
                              else {
                                S959=0;
                                if(capLoaderReq_o.isACK()){//sysj/orchestrator.sysj line: 46, column: 5
                                  capLoaderReq_o.setVal(true);//sysj/orchestrator.sysj line: 46, column: 5
                                  S959=1;
                                  if(!capLoaderReq_o.isACK()){//sysj/orchestrator.sysj line: 46, column: 5
                                    capLoaderReq_o.setREQ(false);//sysj/orchestrator.sysj line: 46, column: 5
                                    ends[3]=2;
                                    ;//sysj/orchestrator.sysj line: 46, column: 5
                                    S1046=2;
                                    S1053=0;
                                    if(!capperReq_o.isPartnerPresent() || capperReq_o.isPartnerPreempted()){//sysj/orchestrator.sysj line: 47, column: 5
                                      capperReq_o.setREQ(false);//sysj/orchestrator.sysj line: 47, column: 5
                                      S1053=1;
                                      active[3]=1;
                                      ends[3]=1;
                                      tdone[3]=1;
                                    }
                                    else {
                                      S1048=0;
                                      if(capperReq_o.isACK()){//sysj/orchestrator.sysj line: 47, column: 5
                                        capperReq_o.setVal(true);//sysj/orchestrator.sysj line: 47, column: 5
                                        S1048=1;
                                        if(!capperReq_o.isACK()){//sysj/orchestrator.sysj line: 47, column: 5
                                          capperReq_o.setREQ(false);//sysj/orchestrator.sysj line: 47, column: 5
                                          ends[3]=2;
                                          ;//sysj/orchestrator.sysj line: 47, column: 5
                                          getNextBottle_1.setPresent();//sysj/orchestrator.sysj line: 48, column: 5
                                          currsigs.addElement(getNextBottle_1);
                                          S935=2;
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
                          if(!fillerReq_o.isACK()){//sysj/orchestrator.sysj line: 45, column: 5
                            fillerReq_o.setREQ(false);//sysj/orchestrator.sysj line: 45, column: 5
                            ends[3]=2;
                            ;//sysj/orchestrator.sysj line: 45, column: 5
                            S1046=1;
                            S964=0;
                            if(!capLoaderReq_o.isPartnerPresent() || capLoaderReq_o.isPartnerPreempted()){//sysj/orchestrator.sysj line: 46, column: 5
                              capLoaderReq_o.setREQ(false);//sysj/orchestrator.sysj line: 46, column: 5
                              S964=1;
                              active[3]=1;
                              ends[3]=1;
                              tdone[3]=1;
                            }
                            else {
                              S959=0;
                              if(capLoaderReq_o.isACK()){//sysj/orchestrator.sysj line: 46, column: 5
                                capLoaderReq_o.setVal(true);//sysj/orchestrator.sysj line: 46, column: 5
                                S959=1;
                                if(!capLoaderReq_o.isACK()){//sysj/orchestrator.sysj line: 46, column: 5
                                  capLoaderReq_o.setREQ(false);//sysj/orchestrator.sysj line: 46, column: 5
                                  ends[3]=2;
                                  ;//sysj/orchestrator.sysj line: 46, column: 5
                                  S1046=2;
                                  S1053=0;
                                  if(!capperReq_o.isPartnerPresent() || capperReq_o.isPartnerPreempted()){//sysj/orchestrator.sysj line: 47, column: 5
                                    capperReq_o.setREQ(false);//sysj/orchestrator.sysj line: 47, column: 5
                                    S1053=1;
                                    active[3]=1;
                                    ends[3]=1;
                                    tdone[3]=1;
                                  }
                                  else {
                                    S1048=0;
                                    if(capperReq_o.isACK()){//sysj/orchestrator.sysj line: 47, column: 5
                                      capperReq_o.setVal(true);//sysj/orchestrator.sysj line: 47, column: 5
                                      S1048=1;
                                      if(!capperReq_o.isACK()){//sysj/orchestrator.sysj line: 47, column: 5
                                        capperReq_o.setREQ(false);//sysj/orchestrator.sysj line: 47, column: 5
                                        ends[3]=2;
                                        ;//sysj/orchestrator.sysj line: 47, column: 5
                                        getNextBottle_1.setPresent();//sysj/orchestrator.sysj line: 48, column: 5
                                        currsigs.addElement(getNextBottle_1);
                                        S935=2;
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
                    S942=1;
                    S942=0;
                    if(!fillerReq_o.isPartnerPresent() || fillerReq_o.isPartnerPreempted()){//sysj/orchestrator.sysj line: 45, column: 5
                      fillerReq_o.setREQ(false);//sysj/orchestrator.sysj line: 45, column: 5
                      S942=1;
                      active[3]=1;
                      ends[3]=1;
                      tdone[3]=1;
                    }
                    else {
                      S937=0;
                      if(fillerReq_o.isACK()){//sysj/orchestrator.sysj line: 45, column: 5
                        fillerReq_o.setVal(true);//sysj/orchestrator.sysj line: 45, column: 5
                        S937=1;
                        if(!fillerReq_o.isACK()){//sysj/orchestrator.sysj line: 45, column: 5
                          fillerReq_o.setREQ(false);//sysj/orchestrator.sysj line: 45, column: 5
                          ends[3]=2;
                          ;//sysj/orchestrator.sysj line: 45, column: 5
                          S1046=1;
                          S964=0;
                          if(!capLoaderReq_o.isPartnerPresent() || capLoaderReq_o.isPartnerPreempted()){//sysj/orchestrator.sysj line: 46, column: 5
                            capLoaderReq_o.setREQ(false);//sysj/orchestrator.sysj line: 46, column: 5
                            S964=1;
                            active[3]=1;
                            ends[3]=1;
                            tdone[3]=1;
                          }
                          else {
                            S959=0;
                            if(capLoaderReq_o.isACK()){//sysj/orchestrator.sysj line: 46, column: 5
                              capLoaderReq_o.setVal(true);//sysj/orchestrator.sysj line: 46, column: 5
                              S959=1;
                              if(!capLoaderReq_o.isACK()){//sysj/orchestrator.sysj line: 46, column: 5
                                capLoaderReq_o.setREQ(false);//sysj/orchestrator.sysj line: 46, column: 5
                                ends[3]=2;
                                ;//sysj/orchestrator.sysj line: 46, column: 5
                                S1046=2;
                                S1053=0;
                                if(!capperReq_o.isPartnerPresent() || capperReq_o.isPartnerPreempted()){//sysj/orchestrator.sysj line: 47, column: 5
                                  capperReq_o.setREQ(false);//sysj/orchestrator.sysj line: 47, column: 5
                                  S1053=1;
                                  active[3]=1;
                                  ends[3]=1;
                                  tdone[3]=1;
                                }
                                else {
                                  S1048=0;
                                  if(capperReq_o.isACK()){//sysj/orchestrator.sysj line: 47, column: 5
                                    capperReq_o.setVal(true);//sysj/orchestrator.sysj line: 47, column: 5
                                    S1048=1;
                                    if(!capperReq_o.isACK()){//sysj/orchestrator.sysj line: 47, column: 5
                                      capperReq_o.setREQ(false);//sysj/orchestrator.sysj line: 47, column: 5
                                      ends[3]=2;
                                      ;//sysj/orchestrator.sysj line: 47, column: 5
                                      getNextBottle_1.setPresent();//sysj/orchestrator.sysj line: 48, column: 5
                                      currsigs.addElement(getNextBottle_1);
                                      S935=2;
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
                switch(S964){
                  case 0 : 
                    if(!capLoaderReq_o.isPartnerPresent() || capLoaderReq_o.isPartnerPreempted()){//sysj/orchestrator.sysj line: 46, column: 5
                      capLoaderReq_o.setREQ(false);//sysj/orchestrator.sysj line: 46, column: 5
                      S964=1;
                      active[3]=1;
                      ends[3]=1;
                      tdone[3]=1;
                    }
                    else {
                      switch(S959){
                        case 0 : 
                          if(capLoaderReq_o.isACK()){//sysj/orchestrator.sysj line: 46, column: 5
                            capLoaderReq_o.setVal(true);//sysj/orchestrator.sysj line: 46, column: 5
                            S959=1;
                            if(!capLoaderReq_o.isACK()){//sysj/orchestrator.sysj line: 46, column: 5
                              capLoaderReq_o.setREQ(false);//sysj/orchestrator.sysj line: 46, column: 5
                              ends[3]=2;
                              ;//sysj/orchestrator.sysj line: 46, column: 5
                              S1046=2;
                              S1053=0;
                              if(!capperReq_o.isPartnerPresent() || capperReq_o.isPartnerPreempted()){//sysj/orchestrator.sysj line: 47, column: 5
                                capperReq_o.setREQ(false);//sysj/orchestrator.sysj line: 47, column: 5
                                S1053=1;
                                active[3]=1;
                                ends[3]=1;
                                tdone[3]=1;
                              }
                              else {
                                S1048=0;
                                if(capperReq_o.isACK()){//sysj/orchestrator.sysj line: 47, column: 5
                                  capperReq_o.setVal(true);//sysj/orchestrator.sysj line: 47, column: 5
                                  S1048=1;
                                  if(!capperReq_o.isACK()){//sysj/orchestrator.sysj line: 47, column: 5
                                    capperReq_o.setREQ(false);//sysj/orchestrator.sysj line: 47, column: 5
                                    ends[3]=2;
                                    ;//sysj/orchestrator.sysj line: 47, column: 5
                                    getNextBottle_1.setPresent();//sysj/orchestrator.sysj line: 48, column: 5
                                    currsigs.addElement(getNextBottle_1);
                                    S935=2;
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
                          if(!capLoaderReq_o.isACK()){//sysj/orchestrator.sysj line: 46, column: 5
                            capLoaderReq_o.setREQ(false);//sysj/orchestrator.sysj line: 46, column: 5
                            ends[3]=2;
                            ;//sysj/orchestrator.sysj line: 46, column: 5
                            S1046=2;
                            S1053=0;
                            if(!capperReq_o.isPartnerPresent() || capperReq_o.isPartnerPreempted()){//sysj/orchestrator.sysj line: 47, column: 5
                              capperReq_o.setREQ(false);//sysj/orchestrator.sysj line: 47, column: 5
                              S1053=1;
                              active[3]=1;
                              ends[3]=1;
                              tdone[3]=1;
                            }
                            else {
                              S1048=0;
                              if(capperReq_o.isACK()){//sysj/orchestrator.sysj line: 47, column: 5
                                capperReq_o.setVal(true);//sysj/orchestrator.sysj line: 47, column: 5
                                S1048=1;
                                if(!capperReq_o.isACK()){//sysj/orchestrator.sysj line: 47, column: 5
                                  capperReq_o.setREQ(false);//sysj/orchestrator.sysj line: 47, column: 5
                                  ends[3]=2;
                                  ;//sysj/orchestrator.sysj line: 47, column: 5
                                  getNextBottle_1.setPresent();//sysj/orchestrator.sysj line: 48, column: 5
                                  currsigs.addElement(getNextBottle_1);
                                  S935=2;
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
                    S964=1;
                    S964=0;
                    if(!capLoaderReq_o.isPartnerPresent() || capLoaderReq_o.isPartnerPreempted()){//sysj/orchestrator.sysj line: 46, column: 5
                      capLoaderReq_o.setREQ(false);//sysj/orchestrator.sysj line: 46, column: 5
                      S964=1;
                      active[3]=1;
                      ends[3]=1;
                      tdone[3]=1;
                    }
                    else {
                      S959=0;
                      if(capLoaderReq_o.isACK()){//sysj/orchestrator.sysj line: 46, column: 5
                        capLoaderReq_o.setVal(true);//sysj/orchestrator.sysj line: 46, column: 5
                        S959=1;
                        if(!capLoaderReq_o.isACK()){//sysj/orchestrator.sysj line: 46, column: 5
                          capLoaderReq_o.setREQ(false);//sysj/orchestrator.sysj line: 46, column: 5
                          ends[3]=2;
                          ;//sysj/orchestrator.sysj line: 46, column: 5
                          S1046=2;
                          S1053=0;
                          if(!capperReq_o.isPartnerPresent() || capperReq_o.isPartnerPreempted()){//sysj/orchestrator.sysj line: 47, column: 5
                            capperReq_o.setREQ(false);//sysj/orchestrator.sysj line: 47, column: 5
                            S1053=1;
                            active[3]=1;
                            ends[3]=1;
                            tdone[3]=1;
                          }
                          else {
                            S1048=0;
                            if(capperReq_o.isACK()){//sysj/orchestrator.sysj line: 47, column: 5
                              capperReq_o.setVal(true);//sysj/orchestrator.sysj line: 47, column: 5
                              S1048=1;
                              if(!capperReq_o.isACK()){//sysj/orchestrator.sysj line: 47, column: 5
                                capperReq_o.setREQ(false);//sysj/orchestrator.sysj line: 47, column: 5
                                ends[3]=2;
                                ;//sysj/orchestrator.sysj line: 47, column: 5
                                getNextBottle_1.setPresent();//sysj/orchestrator.sysj line: 48, column: 5
                                currsigs.addElement(getNextBottle_1);
                                S935=2;
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
                switch(S1053){
                  case 0 : 
                    if(!capperReq_o.isPartnerPresent() || capperReq_o.isPartnerPreempted()){//sysj/orchestrator.sysj line: 47, column: 5
                      capperReq_o.setREQ(false);//sysj/orchestrator.sysj line: 47, column: 5
                      S1053=1;
                      active[3]=1;
                      ends[3]=1;
                      tdone[3]=1;
                    }
                    else {
                      switch(S1048){
                        case 0 : 
                          if(capperReq_o.isACK()){//sysj/orchestrator.sysj line: 47, column: 5
                            capperReq_o.setVal(true);//sysj/orchestrator.sysj line: 47, column: 5
                            S1048=1;
                            if(!capperReq_o.isACK()){//sysj/orchestrator.sysj line: 47, column: 5
                              capperReq_o.setREQ(false);//sysj/orchestrator.sysj line: 47, column: 5
                              ends[3]=2;
                              ;//sysj/orchestrator.sysj line: 47, column: 5
                              getNextBottle_1.setPresent();//sysj/orchestrator.sysj line: 48, column: 5
                              currsigs.addElement(getNextBottle_1);
                              S935=2;
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
                          if(!capperReq_o.isACK()){//sysj/orchestrator.sysj line: 47, column: 5
                            capperReq_o.setREQ(false);//sysj/orchestrator.sysj line: 47, column: 5
                            ends[3]=2;
                            ;//sysj/orchestrator.sysj line: 47, column: 5
                            getNextBottle_1.setPresent();//sysj/orchestrator.sysj line: 48, column: 5
                            currsigs.addElement(getNextBottle_1);
                            S935=2;
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
                    S1053=1;
                    S1053=0;
                    if(!capperReq_o.isPartnerPresent() || capperReq_o.isPartnerPreempted()){//sysj/orchestrator.sysj line: 47, column: 5
                      capperReq_o.setREQ(false);//sysj/orchestrator.sysj line: 47, column: 5
                      S1053=1;
                      active[3]=1;
                      ends[3]=1;
                      tdone[3]=1;
                    }
                    else {
                      S1048=0;
                      if(capperReq_o.isACK()){//sysj/orchestrator.sysj line: 47, column: 5
                        capperReq_o.setVal(true);//sysj/orchestrator.sysj line: 47, column: 5
                        S1048=1;
                        if(!capperReq_o.isACK()){//sysj/orchestrator.sysj line: 47, column: 5
                          capperReq_o.setREQ(false);//sysj/orchestrator.sysj line: 47, column: 5
                          ends[3]=2;
                          ;//sysj/orchestrator.sysj line: 47, column: 5
                          getNextBottle_1.setPresent();//sysj/orchestrator.sysj line: 48, column: 5
                          currsigs.addElement(getNextBottle_1);
                          S935=2;
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
            S935=2;
            S935=0;
            S919=0;
            if(!rotaryStatus_in.isPartnerPresent() || rotaryStatus_in.isPartnerPreempted()){//sysj/orchestrator.sysj line: 40, column: 4
              rotaryStatus_in.setACK(false);//sysj/orchestrator.sysj line: 40, column: 4
              S919=1;
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            else {
              S914=0;
              if(!rotaryStatus_in.isREQ()){//sysj/orchestrator.sysj line: 40, column: 4
                rotaryStatus_in.setACK(true);//sysj/orchestrator.sysj line: 40, column: 4
                S914=1;
                if(rotaryStatus_in.isREQ()){//sysj/orchestrator.sysj line: 40, column: 4
                  rotaryStatus_in.setACK(false);//sysj/orchestrator.sysj line: 40, column: 4
                  ends[3]=2;
                  ;//sysj/orchestrator.sysj line: 40, column: 4
                  rotaryStat_thread_3 = (rotaryStatus_in.getVal() == null ? null : ((String)rotaryStatus_in.getVal()));//sysj/orchestrator.sysj line: 41, column: 4
                  S935=1;
                  if(rotaryStat_thread_3 == "done"){//sysj/orchestrator.sysj line: 44, column: 7
                    S1046=0;
                    S942=0;
                    if(!fillerReq_o.isPartnerPresent() || fillerReq_o.isPartnerPreempted()){//sysj/orchestrator.sysj line: 45, column: 5
                      fillerReq_o.setREQ(false);//sysj/orchestrator.sysj line: 45, column: 5
                      S942=1;
                      active[3]=1;
                      ends[3]=1;
                      tdone[3]=1;
                    }
                    else {
                      S937=0;
                      if(fillerReq_o.isACK()){//sysj/orchestrator.sysj line: 45, column: 5
                        fillerReq_o.setVal(true);//sysj/orchestrator.sysj line: 45, column: 5
                        S937=1;
                        if(!fillerReq_o.isACK()){//sysj/orchestrator.sysj line: 45, column: 5
                          fillerReq_o.setREQ(false);//sysj/orchestrator.sysj line: 45, column: 5
                          ends[3]=2;
                          ;//sysj/orchestrator.sysj line: 45, column: 5
                          S1046=1;
                          S964=0;
                          if(!capLoaderReq_o.isPartnerPresent() || capLoaderReq_o.isPartnerPreempted()){//sysj/orchestrator.sysj line: 46, column: 5
                            capLoaderReq_o.setREQ(false);//sysj/orchestrator.sysj line: 46, column: 5
                            S964=1;
                            active[3]=1;
                            ends[3]=1;
                            tdone[3]=1;
                          }
                          else {
                            S959=0;
                            if(capLoaderReq_o.isACK()){//sysj/orchestrator.sysj line: 46, column: 5
                              capLoaderReq_o.setVal(true);//sysj/orchestrator.sysj line: 46, column: 5
                              S959=1;
                              if(!capLoaderReq_o.isACK()){//sysj/orchestrator.sysj line: 46, column: 5
                                capLoaderReq_o.setREQ(false);//sysj/orchestrator.sysj line: 46, column: 5
                                ends[3]=2;
                                ;//sysj/orchestrator.sysj line: 46, column: 5
                                S1046=2;
                                S1053=0;
                                if(!capperReq_o.isPartnerPresent() || capperReq_o.isPartnerPreempted()){//sysj/orchestrator.sysj line: 47, column: 5
                                  capperReq_o.setREQ(false);//sysj/orchestrator.sysj line: 47, column: 5
                                  S1053=1;
                                  active[3]=1;
                                  ends[3]=1;
                                  tdone[3]=1;
                                }
                                else {
                                  S1048=0;
                                  if(capperReq_o.isACK()){//sysj/orchestrator.sysj line: 47, column: 5
                                    capperReq_o.setVal(true);//sysj/orchestrator.sysj line: 47, column: 5
                                    S1048=1;
                                    if(!capperReq_o.isACK()){//sysj/orchestrator.sysj line: 47, column: 5
                                      capperReq_o.setREQ(false);//sysj/orchestrator.sysj line: 47, column: 5
                                      ends[3]=2;
                                      ;//sysj/orchestrator.sysj line: 47, column: 5
                                      getNextBottle_1.setPresent();//sysj/orchestrator.sysj line: 48, column: 5
                                      currsigs.addElement(getNextBottle_1);
                                      S935=2;
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
                    S935=2;
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

  public void thread23447(int [] tdone, int [] ends){
        switch(S912){
      case 0 : 
        active[2]=0;
        ends[2]=0;
        tdone[2]=1;
        break;
      
      case 1 : 
        switch(S304){
          case 0 : 
            switch(S46){
              case 0 : 
                switch(S8){
                  case 0 : 
                    if(!conveyorReq_o.isPartnerPresent() || conveyorReq_o.isPartnerPreempted()){//sysj/orchestrator.sysj line: 23, column: 5
                      conveyorReq_o.setREQ(false);//sysj/orchestrator.sysj line: 23, column: 5
                      S8=1;
                      active[2]=1;
                      ends[2]=1;
                      tdone[2]=1;
                    }
                    else {
                      switch(S3){
                        case 0 : 
                          if(conveyorReq_o.isACK()){//sysj/orchestrator.sysj line: 23, column: 5
                            conveyorReq_o.setVal(true);//sysj/orchestrator.sysj line: 23, column: 5
                            S3=1;
                            if(!conveyorReq_o.isACK()){//sysj/orchestrator.sysj line: 23, column: 5
                              conveyorReq_o.setREQ(false);//sysj/orchestrator.sysj line: 23, column: 5
                              ends[2]=2;
                              ;//sysj/orchestrator.sysj line: 23, column: 5
                              bottlePlaced = bottlePlaced - 1;//sysj/orchestrator.sysj line: 24, column: 5
                              S46=1;
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
                          if(!conveyorReq_o.isACK()){//sysj/orchestrator.sysj line: 23, column: 5
                            conveyorReq_o.setREQ(false);//sysj/orchestrator.sysj line: 23, column: 5
                            ends[2]=2;
                            ;//sysj/orchestrator.sysj line: 23, column: 5
                            bottlePlaced = bottlePlaced - 1;//sysj/orchestrator.sysj line: 24, column: 5
                            S46=1;
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
                    S8=1;
                    S8=0;
                    if(!conveyorReq_o.isPartnerPresent() || conveyorReq_o.isPartnerPreempted()){//sysj/orchestrator.sysj line: 23, column: 5
                      conveyorReq_o.setREQ(false);//sysj/orchestrator.sysj line: 23, column: 5
                      S8=1;
                      active[2]=1;
                      ends[2]=1;
                      tdone[2]=1;
                    }
                    else {
                      S3=0;
                      if(conveyorReq_o.isACK()){//sysj/orchestrator.sysj line: 23, column: 5
                        conveyorReq_o.setVal(true);//sysj/orchestrator.sysj line: 23, column: 5
                        S3=1;
                        if(!conveyorReq_o.isACK()){//sysj/orchestrator.sysj line: 23, column: 5
                          conveyorReq_o.setREQ(false);//sysj/orchestrator.sysj line: 23, column: 5
                          ends[2]=2;
                          ;//sysj/orchestrator.sysj line: 23, column: 5
                          bottlePlaced = bottlePlaced - 1;//sysj/orchestrator.sysj line: 24, column: 5
                          S46=1;
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
                if(getNextBottle_1.getprestatus()){//sysj/orchestrator.sysj line: 26, column: 11
                  S46=2;
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
                S46=2;
                if(bottlePlaced <= 0){//sysj/orchestrator.sysj line: 21, column: 10
                  System.out.println("sending conveyor req?");//sysj/orchestrator.sysj line: 22, column: 5
                  S46=0;
                  S8=0;
                  if(!conveyorReq_o.isPartnerPresent() || conveyorReq_o.isPartnerPreempted()){//sysj/orchestrator.sysj line: 23, column: 5
                    conveyorReq_o.setREQ(false);//sysj/orchestrator.sysj line: 23, column: 5
                    S8=1;
                    active[2]=1;
                    ends[2]=1;
                    tdone[2]=1;
                  }
                  else {
                    S3=0;
                    if(conveyorReq_o.isACK()){//sysj/orchestrator.sysj line: 23, column: 5
                      conveyorReq_o.setVal(true);//sysj/orchestrator.sysj line: 23, column: 5
                      S3=1;
                      if(!conveyorReq_o.isACK()){//sysj/orchestrator.sysj line: 23, column: 5
                        conveyorReq_o.setREQ(false);//sysj/orchestrator.sysj line: 23, column: 5
                        ends[2]=2;
                        ;//sysj/orchestrator.sysj line: 23, column: 5
                        bottlePlaced = bottlePlaced - 1;//sysj/orchestrator.sysj line: 24, column: 5
                        S46=1;
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
                  conveyorReq_o.setPreempted();//sysj/orchestrator.sysj line: 21, column: 4
                  ends[2]=2;
                  ;//sysj/orchestrator.sysj line: 21, column: 4
                  System.out.println("Done order");//sysj/orchestrator.sysj line: 31, column: 4
                  S304=1;
                  active[2]=1;
                  ends[2]=1;
                  tdone[2]=1;
                }
                break;
              
            }
            break;
          
          case 1 : 
            S304=1;
            bottlePlaced = quantity;//sysj/orchestrator.sysj line: 20, column: 4
            S304=0;
            if(bottlePlaced <= 0){//sysj/orchestrator.sysj line: 21, column: 10
              System.out.println("sending conveyor req?");//sysj/orchestrator.sysj line: 22, column: 5
              S46=0;
              S8=0;
              if(!conveyorReq_o.isPartnerPresent() || conveyorReq_o.isPartnerPreempted()){//sysj/orchestrator.sysj line: 23, column: 5
                conveyorReq_o.setREQ(false);//sysj/orchestrator.sysj line: 23, column: 5
                S8=1;
                active[2]=1;
                ends[2]=1;
                tdone[2]=1;
              }
              else {
                S3=0;
                if(conveyorReq_o.isACK()){//sysj/orchestrator.sysj line: 23, column: 5
                  conveyorReq_o.setVal(true);//sysj/orchestrator.sysj line: 23, column: 5
                  S3=1;
                  if(!conveyorReq_o.isACK()){//sysj/orchestrator.sysj line: 23, column: 5
                    conveyorReq_o.setREQ(false);//sysj/orchestrator.sysj line: 23, column: 5
                    ends[2]=2;
                    ;//sysj/orchestrator.sysj line: 23, column: 5
                    bottlePlaced = bottlePlaced - 1;//sysj/orchestrator.sysj line: 24, column: 5
                    S46=1;
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
              conveyorReq_o.setPreempted();//sysj/orchestrator.sysj line: 21, column: 4
              ends[2]=2;
              ;//sysj/orchestrator.sysj line: 21, column: 4
              System.out.println("Done order");//sysj/orchestrator.sysj line: 31, column: 4
              S304=1;
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread23445(int [] tdone, int [] ends){
        S5860=1;
    S4022=0;
    S3918=0;
    if(!conveyorStatus_in.isPartnerPresent() || conveyorStatus_in.isPartnerPreempted()){//sysj/orchestrator.sysj line: 57, column: 4
      conveyorStatus_in.setACK(false);//sysj/orchestrator.sysj line: 57, column: 4
      S3918=1;
      active[4]=1;
      ends[4]=1;
      tdone[4]=1;
    }
    else {
      S3913=0;
      if(!conveyorStatus_in.isREQ()){//sysj/orchestrator.sysj line: 57, column: 4
        conveyorStatus_in.setACK(true);//sysj/orchestrator.sysj line: 57, column: 4
        S3913=1;
        if(conveyorStatus_in.isREQ()){//sysj/orchestrator.sysj line: 57, column: 4
          conveyorStatus_in.setACK(false);//sysj/orchestrator.sysj line: 57, column: 4
          ends[4]=2;
          ;//sysj/orchestrator.sysj line: 57, column: 4
          S4022=1;
          S3940=0;
          if(!fillerStatus_in.isPartnerPresent() || fillerStatus_in.isPartnerPreempted()){//sysj/orchestrator.sysj line: 58, column: 4
            fillerStatus_in.setACK(false);//sysj/orchestrator.sysj line: 58, column: 4
            S3940=1;
            active[4]=1;
            ends[4]=1;
            tdone[4]=1;
          }
          else {
            S3935=0;
            if(!fillerStatus_in.isREQ()){//sysj/orchestrator.sysj line: 58, column: 4
              fillerStatus_in.setACK(true);//sysj/orchestrator.sysj line: 58, column: 4
              S3935=1;
              if(fillerStatus_in.isREQ()){//sysj/orchestrator.sysj line: 58, column: 4
                fillerStatus_in.setACK(false);//sysj/orchestrator.sysj line: 58, column: 4
                ends[4]=2;
                ;//sysj/orchestrator.sysj line: 58, column: 4
                S4022=2;
                S4029=0;
                if(!capLoaderStatus_in.isPartnerPresent() || capLoaderStatus_in.isPartnerPreempted()){//sysj/orchestrator.sysj line: 59, column: 4
                  capLoaderStatus_in.setACK(false);//sysj/orchestrator.sysj line: 59, column: 4
                  S4029=1;
                  active[4]=1;
                  ends[4]=1;
                  tdone[4]=1;
                }
                else {
                  S4024=0;
                  if(!capLoaderStatus_in.isREQ()){//sysj/orchestrator.sysj line: 59, column: 4
                    capLoaderStatus_in.setACK(true);//sysj/orchestrator.sysj line: 59, column: 4
                    S4024=1;
                    if(capLoaderStatus_in.isREQ()){//sysj/orchestrator.sysj line: 59, column: 4
                      capLoaderStatus_in.setACK(false);//sysj/orchestrator.sysj line: 59, column: 4
                      ends[4]=2;
                      ;//sysj/orchestrator.sysj line: 59, column: 4
                      S4022=3;
                      S4161=0;
                      if(!capperStatus_in.isPartnerPresent() || capperStatus_in.isPartnerPreempted()){//sysj/orchestrator.sysj line: 60, column: 4
                        capperStatus_in.setACK(false);//sysj/orchestrator.sysj line: 60, column: 4
                        S4161=1;
                        active[4]=1;
                        ends[4]=1;
                        tdone[4]=1;
                      }
                      else {
                        S4156=0;
                        if(!capperStatus_in.isREQ()){//sysj/orchestrator.sysj line: 60, column: 4
                          capperStatus_in.setACK(true);//sysj/orchestrator.sysj line: 60, column: 4
                          S4156=1;
                          if(capperStatus_in.isREQ()){//sysj/orchestrator.sysj line: 60, column: 4
                            capperStatus_in.setACK(false);//sysj/orchestrator.sysj line: 60, column: 4
                            ends[4]=2;
                            ;//sysj/orchestrator.sysj line: 60, column: 4
                            coveyStat_thread_4 = (conveyorStatus_in.getVal() == null ? null : ((String)conveyorStatus_in.getVal()));//sysj/orchestrator.sysj line: 62, column: 4
                            fillerStat_thread_4 = (fillerStatus_in.getVal() == null ? null : ((String)fillerStatus_in.getVal()));//sysj/orchestrator.sysj line: 63, column: 4
                            screwerStat_thread_4 = (capLoaderStatus_in.getVal() == null ? null : ((String)capLoaderStatus_in.getVal()));//sysj/orchestrator.sysj line: 64, column: 4
                            loaderStat_thread_4 = (capperStatus_in.getVal() == null ? null : ((String)capperStatus_in.getVal()));//sysj/orchestrator.sysj line: 65, column: 4
                            S4022=4;
                            if((conveyStat == "done" || conveyStat == "idle") && (fillerStat_thread_4 == "done" || fillerStat_thread_4 == "idle") && (screwerStat_thread_4 == "done" || screwerStat_thread_4 == "idle") && (loaderStat_thread_4 == "done" || loaderStat_thread_4 == "idle")){//sysj/orchestrator.sysj line: 68, column: 7
                              S4337=0;
                              if(!allOperationsFinished_o.isPartnerPresent() || allOperationsFinished_o.isPartnerPreempted()){//sysj/orchestrator.sysj line: 73, column: 5
                                allOperationsFinished_o.setREQ(false);//sysj/orchestrator.sysj line: 73, column: 5
                                S4337=1;
                                active[4]=1;
                                ends[4]=1;
                                tdone[4]=1;
                              }
                              else {
                                S4332=0;
                                if(allOperationsFinished_o.isACK()){//sysj/orchestrator.sysj line: 73, column: 5
                                  allOperationsFinished_o.setVal(true);//sysj/orchestrator.sysj line: 73, column: 5
                                  S4332=1;
                                  if(!allOperationsFinished_o.isACK()){//sysj/orchestrator.sysj line: 73, column: 5
                                    allOperationsFinished_o.setREQ(false);//sysj/orchestrator.sysj line: 73, column: 5
                                    ends[4]=2;
                                    ;//sysj/orchestrator.sysj line: 73, column: 5
                                    S4022=5;
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
                              S4022=5;
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

  public void thread23444(int [] tdone, int [] ends){
        S3911=1;
    S935=0;
    S919=0;
    if(!rotaryStatus_in.isPartnerPresent() || rotaryStatus_in.isPartnerPreempted()){//sysj/orchestrator.sysj line: 40, column: 4
      rotaryStatus_in.setACK(false);//sysj/orchestrator.sysj line: 40, column: 4
      S919=1;
      active[3]=1;
      ends[3]=1;
      tdone[3]=1;
    }
    else {
      S914=0;
      if(!rotaryStatus_in.isREQ()){//sysj/orchestrator.sysj line: 40, column: 4
        rotaryStatus_in.setACK(true);//sysj/orchestrator.sysj line: 40, column: 4
        S914=1;
        if(rotaryStatus_in.isREQ()){//sysj/orchestrator.sysj line: 40, column: 4
          rotaryStatus_in.setACK(false);//sysj/orchestrator.sysj line: 40, column: 4
          ends[3]=2;
          ;//sysj/orchestrator.sysj line: 40, column: 4
          rotaryStat_thread_3 = (rotaryStatus_in.getVal() == null ? null : ((String)rotaryStatus_in.getVal()));//sysj/orchestrator.sysj line: 41, column: 4
          S935=1;
          if(rotaryStat_thread_3 == "done"){//sysj/orchestrator.sysj line: 44, column: 7
            S1046=0;
            S942=0;
            if(!fillerReq_o.isPartnerPresent() || fillerReq_o.isPartnerPreempted()){//sysj/orchestrator.sysj line: 45, column: 5
              fillerReq_o.setREQ(false);//sysj/orchestrator.sysj line: 45, column: 5
              S942=1;
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            else {
              S937=0;
              if(fillerReq_o.isACK()){//sysj/orchestrator.sysj line: 45, column: 5
                fillerReq_o.setVal(true);//sysj/orchestrator.sysj line: 45, column: 5
                S937=1;
                if(!fillerReq_o.isACK()){//sysj/orchestrator.sysj line: 45, column: 5
                  fillerReq_o.setREQ(false);//sysj/orchestrator.sysj line: 45, column: 5
                  ends[3]=2;
                  ;//sysj/orchestrator.sysj line: 45, column: 5
                  S1046=1;
                  S964=0;
                  if(!capLoaderReq_o.isPartnerPresent() || capLoaderReq_o.isPartnerPreempted()){//sysj/orchestrator.sysj line: 46, column: 5
                    capLoaderReq_o.setREQ(false);//sysj/orchestrator.sysj line: 46, column: 5
                    S964=1;
                    active[3]=1;
                    ends[3]=1;
                    tdone[3]=1;
                  }
                  else {
                    S959=0;
                    if(capLoaderReq_o.isACK()){//sysj/orchestrator.sysj line: 46, column: 5
                      capLoaderReq_o.setVal(true);//sysj/orchestrator.sysj line: 46, column: 5
                      S959=1;
                      if(!capLoaderReq_o.isACK()){//sysj/orchestrator.sysj line: 46, column: 5
                        capLoaderReq_o.setREQ(false);//sysj/orchestrator.sysj line: 46, column: 5
                        ends[3]=2;
                        ;//sysj/orchestrator.sysj line: 46, column: 5
                        S1046=2;
                        S1053=0;
                        if(!capperReq_o.isPartnerPresent() || capperReq_o.isPartnerPreempted()){//sysj/orchestrator.sysj line: 47, column: 5
                          capperReq_o.setREQ(false);//sysj/orchestrator.sysj line: 47, column: 5
                          S1053=1;
                          active[3]=1;
                          ends[3]=1;
                          tdone[3]=1;
                        }
                        else {
                          S1048=0;
                          if(capperReq_o.isACK()){//sysj/orchestrator.sysj line: 47, column: 5
                            capperReq_o.setVal(true);//sysj/orchestrator.sysj line: 47, column: 5
                            S1048=1;
                            if(!capperReq_o.isACK()){//sysj/orchestrator.sysj line: 47, column: 5
                              capperReq_o.setREQ(false);//sysj/orchestrator.sysj line: 47, column: 5
                              ends[3]=2;
                              ;//sysj/orchestrator.sysj line: 47, column: 5
                              getNextBottle_1.setPresent();//sysj/orchestrator.sysj line: 48, column: 5
                              currsigs.addElement(getNextBottle_1);
                              S935=2;
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
            S935=2;
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

  public void thread23443(int [] tdone, int [] ends){
        S912=1;
    bottlePlaced = quantity;//sysj/orchestrator.sysj line: 20, column: 4
    S304=0;
    if(bottlePlaced <= 0){//sysj/orchestrator.sysj line: 21, column: 10
      System.out.println("sending conveyor req?");//sysj/orchestrator.sysj line: 22, column: 5
      S46=0;
      S8=0;
      if(!conveyorReq_o.isPartnerPresent() || conveyorReq_o.isPartnerPreempted()){//sysj/orchestrator.sysj line: 23, column: 5
        conveyorReq_o.setREQ(false);//sysj/orchestrator.sysj line: 23, column: 5
        S8=1;
        active[2]=1;
        ends[2]=1;
        tdone[2]=1;
      }
      else {
        S3=0;
        if(conveyorReq_o.isACK()){//sysj/orchestrator.sysj line: 23, column: 5
          conveyorReq_o.setVal(true);//sysj/orchestrator.sysj line: 23, column: 5
          S3=1;
          if(!conveyorReq_o.isACK()){//sysj/orchestrator.sysj line: 23, column: 5
            conveyorReq_o.setREQ(false);//sysj/orchestrator.sysj line: 23, column: 5
            ends[2]=2;
            ;//sysj/orchestrator.sysj line: 23, column: 5
            bottlePlaced = bottlePlaced - 1;//sysj/orchestrator.sysj line: 24, column: 5
            S46=1;
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
      conveyorReq_o.setPreempted();//sysj/orchestrator.sysj line: 21, column: 4
      ends[2]=2;
      ;//sysj/orchestrator.sysj line: 21, column: 4
      System.out.println("Done order");//sysj/orchestrator.sysj line: 31, column: 4
      S304=1;
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
      switch(S23441){
        case 0 : 
          S23441=0;
          break RUN;
        
        case 1 : 
          S23441=2;
          S23441=2;
          liquidPercent_thread_1 = new int[] = { 10, 10, 20, 60 } ;//sysj/orchestrator.sysj line: 11, column: 2
          quantity_thread_1 = 5;//sysj/orchestrator.sysj line: 12, column: 2
          getNextBottle_1.setClear();//sysj/orchestrator.sysj line: 13, column: 2
          bottlePlaced_thread_1 = 0;//sysj/orchestrator.sysj line: 15, column: 2
          thread23443(tdone,ends);
          thread23444(tdone,ends);
          thread23445(tdone,ends);
          int biggest23446 = 0;
          if(ends[2]>=biggest23446){
            biggest23446=ends[2];
          }
          if(ends[3]>=biggest23446){
            biggest23446=ends[3];
          }
          if(ends[4]>=biggest23446){
            biggest23446=ends[4];
          }
          if(biggest23446 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
        
        case 2 : 
          getNextBottle_1.setClear();//sysj/orchestrator.sysj line: 13, column: 2
          thread23447(tdone,ends);
          thread23448(tdone,ends);
          thread23449(tdone,ends);
          int biggest23450 = 0;
          if(ends[2]>=biggest23450){
            biggest23450=ends[2];
          }
          if(ends[3]>=biggest23450){
            biggest23450=ends[3];
          }
          if(ends[4]>=biggest23450){
            biggest23450=ends[4];
          }
          if(biggest23450 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
          //FINXME code
          if(biggest23450 == 0){
            S23441=0;
            active[1]=0;
            ends[1]=0;
            S23441=0;
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
      }
      runFinisher();
      if(active[1] == 0){
      	this.terminated = true;
      }
      if(!threaded) break;
    }
  }
}
