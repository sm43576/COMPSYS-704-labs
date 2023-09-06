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
  private String conveyStat_thread_4;//sysj\orchestrator.sysj line: 72, column: 4
  private String fillerStat_thread_4;//sysj\orchestrator.sysj line: 73, column: 4
  private String screwerStat_thread_4;//sysj\orchestrator.sysj line: 74, column: 4
  private String loaderStat_thread_4;//sysj\orchestrator.sysj line: 75, column: 4
  private int S123417 = 1;
  private int S117513 = 1;
  private int S115997 = 1;
  private int S115739 = 1;
  private int S115701 = 1;
  private int S115696 = 1;
  private int S120776 = 1;
  private int S117536 = 1;
  private int S117520 = 1;
  private int S117515 = 1;
  private int S117581 = 1;
  private int S117543 = 1;
  private int S117538 = 1;
  private int S117588 = 1;
  private int S117583 = 1;
  private int S117676 = 1;
  private int S117671 = 1;
  private int S123415 = 1;
  private int S120887 = 1;
  private int S120783 = 1;
  private int S120778 = 1;
  private int S120805 = 1;
  private int S120800 = 1;
  private int S120894 = 1;
  private int S120889 = 1;
  private int S121026 = 1;
  private int S121021 = 1;
  private int S121202 = 1;
  private int S121197 = 1;
  
  private int[] ends = new int[5];
  private int[] tdone = new int[5];
  
  public void thread123425(int [] tdone, int [] ends){
        switch(S123415){
      case 0 : 
        active[4]=0;
        ends[4]=0;
        tdone[4]=1;
        break;
      
      case 1 : 
        switch(S120887){
          case 0 : 
            switch(S120783){
              case 0 : 
                if(!conveyorStatus_in.isPartnerPresent() || conveyorStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 67, column: 4
                  conveyorStatus_in.setACK(false);//sysj\orchestrator.sysj line: 67, column: 4
                  S120783=1;
                  active[4]=1;
                  ends[4]=1;
                  tdone[4]=1;
                }
                else {
                  switch(S120778){
                    case 0 : 
                      if(!conveyorStatus_in.isREQ()){//sysj\orchestrator.sysj line: 67, column: 4
                        conveyorStatus_in.setACK(true);//sysj\orchestrator.sysj line: 67, column: 4
                        S120778=1;
                        if(conveyorStatus_in.isREQ()){//sysj\orchestrator.sysj line: 67, column: 4
                          conveyorStatus_in.setACK(false);//sysj\orchestrator.sysj line: 67, column: 4
                          ends[4]=2;
                          ;//sysj\orchestrator.sysj line: 67, column: 4
                          S120887=1;
                          S120805=0;
                          if(!fillerStatus_in.isPartnerPresent() || fillerStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 68, column: 4
                            fillerStatus_in.setACK(false);//sysj\orchestrator.sysj line: 68, column: 4
                            S120805=1;
                            active[4]=1;
                            ends[4]=1;
                            tdone[4]=1;
                          }
                          else {
                            S120800=0;
                            if(!fillerStatus_in.isREQ()){//sysj\orchestrator.sysj line: 68, column: 4
                              fillerStatus_in.setACK(true);//sysj\orchestrator.sysj line: 68, column: 4
                              S120800=1;
                              if(fillerStatus_in.isREQ()){//sysj\orchestrator.sysj line: 68, column: 4
                                fillerStatus_in.setACK(false);//sysj\orchestrator.sysj line: 68, column: 4
                                ends[4]=2;
                                ;//sysj\orchestrator.sysj line: 68, column: 4
                                S120887=2;
                                S120894=0;
                                if(!capLoaderStatus_in.isPartnerPresent() || capLoaderStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 69, column: 4
                                  capLoaderStatus_in.setACK(false);//sysj\orchestrator.sysj line: 69, column: 4
                                  S120894=1;
                                  active[4]=1;
                                  ends[4]=1;
                                  tdone[4]=1;
                                }
                                else {
                                  S120889=0;
                                  if(!capLoaderStatus_in.isREQ()){//sysj\orchestrator.sysj line: 69, column: 4
                                    capLoaderStatus_in.setACK(true);//sysj\orchestrator.sysj line: 69, column: 4
                                    S120889=1;
                                    if(capLoaderStatus_in.isREQ()){//sysj\orchestrator.sysj line: 69, column: 4
                                      capLoaderStatus_in.setACK(false);//sysj\orchestrator.sysj line: 69, column: 4
                                      ends[4]=2;
                                      ;//sysj\orchestrator.sysj line: 69, column: 4
                                      S120887=3;
                                      S121026=0;
                                      if(!capperStatus_in.isPartnerPresent() || capperStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 70, column: 4
                                        capperStatus_in.setACK(false);//sysj\orchestrator.sysj line: 70, column: 4
                                        S121026=1;
                                        active[4]=1;
                                        ends[4]=1;
                                        tdone[4]=1;
                                      }
                                      else {
                                        S121021=0;
                                        if(!capperStatus_in.isREQ()){//sysj\orchestrator.sysj line: 70, column: 4
                                          capperStatus_in.setACK(true);//sysj\orchestrator.sysj line: 70, column: 4
                                          S121021=1;
                                          if(capperStatus_in.isREQ()){//sysj\orchestrator.sysj line: 70, column: 4
                                            capperStatus_in.setACK(false);//sysj\orchestrator.sysj line: 70, column: 4
                                            ends[4]=2;
                                            ;//sysj\orchestrator.sysj line: 70, column: 4
                                            conveyStat_thread_4 = (conveyorStatus_in.getVal() == null ? null : ((String)conveyorStatus_in.getVal()));//sysj\orchestrator.sysj line: 72, column: 4
                                            fillerStat_thread_4 = (fillerStatus_in.getVal() == null ? null : ((String)fillerStatus_in.getVal()));//sysj\orchestrator.sysj line: 73, column: 4
                                            screwerStat_thread_4 = (capLoaderStatus_in.getVal() == null ? null : ((String)capLoaderStatus_in.getVal()));//sysj\orchestrator.sysj line: 74, column: 4
                                            loaderStat_thread_4 = (capperStatus_in.getVal() == null ? null : ((String)capperStatus_in.getVal()));//sysj\orchestrator.sysj line: 75, column: 4
                                            S120887=4;
                                            if((conveyStat_thread_4 == "done" || conveyStat_thread_4 == "idle") && (fillerStat_thread_4 == "done" || fillerStat_thread_4 == "idle") && (screwerStat_thread_4 == "done" || screwerStat_thread_4 == "idle") && (loaderStat_thread_4 == "done" || loaderStat_thread_4 == "idle")){//sysj\orchestrator.sysj line: 78, column: 7
                                              System.out.println("sending request to rotary?");//sysj\orchestrator.sysj line: 82, column: 5
                                              S121202=0;
                                              if(!allOperationsFinished_o.isPartnerPresent() || allOperationsFinished_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 83, column: 5
                                                allOperationsFinished_o.setREQ(false);//sysj\orchestrator.sysj line: 83, column: 5
                                                S121202=1;
                                                active[4]=1;
                                                ends[4]=1;
                                                tdone[4]=1;
                                              }
                                              else {
                                                S121197=0;
                                                if(allOperationsFinished_o.isACK()){//sysj\orchestrator.sysj line: 83, column: 5
                                                  allOperationsFinished_o.setVal(true);//sysj\orchestrator.sysj line: 83, column: 5
                                                  S121197=1;
                                                  if(!allOperationsFinished_o.isACK()){//sysj\orchestrator.sysj line: 83, column: 5
                                                    allOperationsFinished_o.setREQ(false);//sysj\orchestrator.sysj line: 83, column: 5
                                                    ends[4]=2;
                                                    ;//sysj\orchestrator.sysj line: 83, column: 5
                                                    S120887=5;
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
                                              S120887=5;
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
                      if(conveyorStatus_in.isREQ()){//sysj\orchestrator.sysj line: 67, column: 4
                        conveyorStatus_in.setACK(false);//sysj\orchestrator.sysj line: 67, column: 4
                        ends[4]=2;
                        ;//sysj\orchestrator.sysj line: 67, column: 4
                        S120887=1;
                        S120805=0;
                        if(!fillerStatus_in.isPartnerPresent() || fillerStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 68, column: 4
                          fillerStatus_in.setACK(false);//sysj\orchestrator.sysj line: 68, column: 4
                          S120805=1;
                          active[4]=1;
                          ends[4]=1;
                          tdone[4]=1;
                        }
                        else {
                          S120800=0;
                          if(!fillerStatus_in.isREQ()){//sysj\orchestrator.sysj line: 68, column: 4
                            fillerStatus_in.setACK(true);//sysj\orchestrator.sysj line: 68, column: 4
                            S120800=1;
                            if(fillerStatus_in.isREQ()){//sysj\orchestrator.sysj line: 68, column: 4
                              fillerStatus_in.setACK(false);//sysj\orchestrator.sysj line: 68, column: 4
                              ends[4]=2;
                              ;//sysj\orchestrator.sysj line: 68, column: 4
                              S120887=2;
                              S120894=0;
                              if(!capLoaderStatus_in.isPartnerPresent() || capLoaderStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 69, column: 4
                                capLoaderStatus_in.setACK(false);//sysj\orchestrator.sysj line: 69, column: 4
                                S120894=1;
                                active[4]=1;
                                ends[4]=1;
                                tdone[4]=1;
                              }
                              else {
                                S120889=0;
                                if(!capLoaderStatus_in.isREQ()){//sysj\orchestrator.sysj line: 69, column: 4
                                  capLoaderStatus_in.setACK(true);//sysj\orchestrator.sysj line: 69, column: 4
                                  S120889=1;
                                  if(capLoaderStatus_in.isREQ()){//sysj\orchestrator.sysj line: 69, column: 4
                                    capLoaderStatus_in.setACK(false);//sysj\orchestrator.sysj line: 69, column: 4
                                    ends[4]=2;
                                    ;//sysj\orchestrator.sysj line: 69, column: 4
                                    S120887=3;
                                    S121026=0;
                                    if(!capperStatus_in.isPartnerPresent() || capperStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 70, column: 4
                                      capperStatus_in.setACK(false);//sysj\orchestrator.sysj line: 70, column: 4
                                      S121026=1;
                                      active[4]=1;
                                      ends[4]=1;
                                      tdone[4]=1;
                                    }
                                    else {
                                      S121021=0;
                                      if(!capperStatus_in.isREQ()){//sysj\orchestrator.sysj line: 70, column: 4
                                        capperStatus_in.setACK(true);//sysj\orchestrator.sysj line: 70, column: 4
                                        S121021=1;
                                        if(capperStatus_in.isREQ()){//sysj\orchestrator.sysj line: 70, column: 4
                                          capperStatus_in.setACK(false);//sysj\orchestrator.sysj line: 70, column: 4
                                          ends[4]=2;
                                          ;//sysj\orchestrator.sysj line: 70, column: 4
                                          conveyStat_thread_4 = (conveyorStatus_in.getVal() == null ? null : ((String)conveyorStatus_in.getVal()));//sysj\orchestrator.sysj line: 72, column: 4
                                          fillerStat_thread_4 = (fillerStatus_in.getVal() == null ? null : ((String)fillerStatus_in.getVal()));//sysj\orchestrator.sysj line: 73, column: 4
                                          screwerStat_thread_4 = (capLoaderStatus_in.getVal() == null ? null : ((String)capLoaderStatus_in.getVal()));//sysj\orchestrator.sysj line: 74, column: 4
                                          loaderStat_thread_4 = (capperStatus_in.getVal() == null ? null : ((String)capperStatus_in.getVal()));//sysj\orchestrator.sysj line: 75, column: 4
                                          S120887=4;
                                          if((conveyStat_thread_4 == "done" || conveyStat_thread_4 == "idle") && (fillerStat_thread_4 == "done" || fillerStat_thread_4 == "idle") && (screwerStat_thread_4 == "done" || screwerStat_thread_4 == "idle") && (loaderStat_thread_4 == "done" || loaderStat_thread_4 == "idle")){//sysj\orchestrator.sysj line: 78, column: 7
                                            System.out.println("sending request to rotary?");//sysj\orchestrator.sysj line: 82, column: 5
                                            S121202=0;
                                            if(!allOperationsFinished_o.isPartnerPresent() || allOperationsFinished_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 83, column: 5
                                              allOperationsFinished_o.setREQ(false);//sysj\orchestrator.sysj line: 83, column: 5
                                              S121202=1;
                                              active[4]=1;
                                              ends[4]=1;
                                              tdone[4]=1;
                                            }
                                            else {
                                              S121197=0;
                                              if(allOperationsFinished_o.isACK()){//sysj\orchestrator.sysj line: 83, column: 5
                                                allOperationsFinished_o.setVal(true);//sysj\orchestrator.sysj line: 83, column: 5
                                                S121197=1;
                                                if(!allOperationsFinished_o.isACK()){//sysj\orchestrator.sysj line: 83, column: 5
                                                  allOperationsFinished_o.setREQ(false);//sysj\orchestrator.sysj line: 83, column: 5
                                                  ends[4]=2;
                                                  ;//sysj\orchestrator.sysj line: 83, column: 5
                                                  S120887=5;
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
                                            S120887=5;
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
                S120783=1;
                S120783=0;
                if(!conveyorStatus_in.isPartnerPresent() || conveyorStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 67, column: 4
                  conveyorStatus_in.setACK(false);//sysj\orchestrator.sysj line: 67, column: 4
                  S120783=1;
                  active[4]=1;
                  ends[4]=1;
                  tdone[4]=1;
                }
                else {
                  S120778=0;
                  if(!conveyorStatus_in.isREQ()){//sysj\orchestrator.sysj line: 67, column: 4
                    conveyorStatus_in.setACK(true);//sysj\orchestrator.sysj line: 67, column: 4
                    S120778=1;
                    if(conveyorStatus_in.isREQ()){//sysj\orchestrator.sysj line: 67, column: 4
                      conveyorStatus_in.setACK(false);//sysj\orchestrator.sysj line: 67, column: 4
                      ends[4]=2;
                      ;//sysj\orchestrator.sysj line: 67, column: 4
                      S120887=1;
                      S120805=0;
                      if(!fillerStatus_in.isPartnerPresent() || fillerStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 68, column: 4
                        fillerStatus_in.setACK(false);//sysj\orchestrator.sysj line: 68, column: 4
                        S120805=1;
                        active[4]=1;
                        ends[4]=1;
                        tdone[4]=1;
                      }
                      else {
                        S120800=0;
                        if(!fillerStatus_in.isREQ()){//sysj\orchestrator.sysj line: 68, column: 4
                          fillerStatus_in.setACK(true);//sysj\orchestrator.sysj line: 68, column: 4
                          S120800=1;
                          if(fillerStatus_in.isREQ()){//sysj\orchestrator.sysj line: 68, column: 4
                            fillerStatus_in.setACK(false);//sysj\orchestrator.sysj line: 68, column: 4
                            ends[4]=2;
                            ;//sysj\orchestrator.sysj line: 68, column: 4
                            S120887=2;
                            S120894=0;
                            if(!capLoaderStatus_in.isPartnerPresent() || capLoaderStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 69, column: 4
                              capLoaderStatus_in.setACK(false);//sysj\orchestrator.sysj line: 69, column: 4
                              S120894=1;
                              active[4]=1;
                              ends[4]=1;
                              tdone[4]=1;
                            }
                            else {
                              S120889=0;
                              if(!capLoaderStatus_in.isREQ()){//sysj\orchestrator.sysj line: 69, column: 4
                                capLoaderStatus_in.setACK(true);//sysj\orchestrator.sysj line: 69, column: 4
                                S120889=1;
                                if(capLoaderStatus_in.isREQ()){//sysj\orchestrator.sysj line: 69, column: 4
                                  capLoaderStatus_in.setACK(false);//sysj\orchestrator.sysj line: 69, column: 4
                                  ends[4]=2;
                                  ;//sysj\orchestrator.sysj line: 69, column: 4
                                  S120887=3;
                                  S121026=0;
                                  if(!capperStatus_in.isPartnerPresent() || capperStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 70, column: 4
                                    capperStatus_in.setACK(false);//sysj\orchestrator.sysj line: 70, column: 4
                                    S121026=1;
                                    active[4]=1;
                                    ends[4]=1;
                                    tdone[4]=1;
                                  }
                                  else {
                                    S121021=0;
                                    if(!capperStatus_in.isREQ()){//sysj\orchestrator.sysj line: 70, column: 4
                                      capperStatus_in.setACK(true);//sysj\orchestrator.sysj line: 70, column: 4
                                      S121021=1;
                                      if(capperStatus_in.isREQ()){//sysj\orchestrator.sysj line: 70, column: 4
                                        capperStatus_in.setACK(false);//sysj\orchestrator.sysj line: 70, column: 4
                                        ends[4]=2;
                                        ;//sysj\orchestrator.sysj line: 70, column: 4
                                        conveyStat_thread_4 = (conveyorStatus_in.getVal() == null ? null : ((String)conveyorStatus_in.getVal()));//sysj\orchestrator.sysj line: 72, column: 4
                                        fillerStat_thread_4 = (fillerStatus_in.getVal() == null ? null : ((String)fillerStatus_in.getVal()));//sysj\orchestrator.sysj line: 73, column: 4
                                        screwerStat_thread_4 = (capLoaderStatus_in.getVal() == null ? null : ((String)capLoaderStatus_in.getVal()));//sysj\orchestrator.sysj line: 74, column: 4
                                        loaderStat_thread_4 = (capperStatus_in.getVal() == null ? null : ((String)capperStatus_in.getVal()));//sysj\orchestrator.sysj line: 75, column: 4
                                        S120887=4;
                                        if((conveyStat_thread_4 == "done" || conveyStat_thread_4 == "idle") && (fillerStat_thread_4 == "done" || fillerStat_thread_4 == "idle") && (screwerStat_thread_4 == "done" || screwerStat_thread_4 == "idle") && (loaderStat_thread_4 == "done" || loaderStat_thread_4 == "idle")){//sysj\orchestrator.sysj line: 78, column: 7
                                          System.out.println("sending request to rotary?");//sysj\orchestrator.sysj line: 82, column: 5
                                          S121202=0;
                                          if(!allOperationsFinished_o.isPartnerPresent() || allOperationsFinished_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 83, column: 5
                                            allOperationsFinished_o.setREQ(false);//sysj\orchestrator.sysj line: 83, column: 5
                                            S121202=1;
                                            active[4]=1;
                                            ends[4]=1;
                                            tdone[4]=1;
                                          }
                                          else {
                                            S121197=0;
                                            if(allOperationsFinished_o.isACK()){//sysj\orchestrator.sysj line: 83, column: 5
                                              allOperationsFinished_o.setVal(true);//sysj\orchestrator.sysj line: 83, column: 5
                                              S121197=1;
                                              if(!allOperationsFinished_o.isACK()){//sysj\orchestrator.sysj line: 83, column: 5
                                                allOperationsFinished_o.setREQ(false);//sysj\orchestrator.sysj line: 83, column: 5
                                                ends[4]=2;
                                                ;//sysj\orchestrator.sysj line: 83, column: 5
                                                S120887=5;
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
                                          S120887=5;
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
            switch(S120805){
              case 0 : 
                if(!fillerStatus_in.isPartnerPresent() || fillerStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 68, column: 4
                  fillerStatus_in.setACK(false);//sysj\orchestrator.sysj line: 68, column: 4
                  S120805=1;
                  active[4]=1;
                  ends[4]=1;
                  tdone[4]=1;
                }
                else {
                  switch(S120800){
                    case 0 : 
                      if(!fillerStatus_in.isREQ()){//sysj\orchestrator.sysj line: 68, column: 4
                        fillerStatus_in.setACK(true);//sysj\orchestrator.sysj line: 68, column: 4
                        S120800=1;
                        if(fillerStatus_in.isREQ()){//sysj\orchestrator.sysj line: 68, column: 4
                          fillerStatus_in.setACK(false);//sysj\orchestrator.sysj line: 68, column: 4
                          ends[4]=2;
                          ;//sysj\orchestrator.sysj line: 68, column: 4
                          S120887=2;
                          S120894=0;
                          if(!capLoaderStatus_in.isPartnerPresent() || capLoaderStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 69, column: 4
                            capLoaderStatus_in.setACK(false);//sysj\orchestrator.sysj line: 69, column: 4
                            S120894=1;
                            active[4]=1;
                            ends[4]=1;
                            tdone[4]=1;
                          }
                          else {
                            S120889=0;
                            if(!capLoaderStatus_in.isREQ()){//sysj\orchestrator.sysj line: 69, column: 4
                              capLoaderStatus_in.setACK(true);//sysj\orchestrator.sysj line: 69, column: 4
                              S120889=1;
                              if(capLoaderStatus_in.isREQ()){//sysj\orchestrator.sysj line: 69, column: 4
                                capLoaderStatus_in.setACK(false);//sysj\orchestrator.sysj line: 69, column: 4
                                ends[4]=2;
                                ;//sysj\orchestrator.sysj line: 69, column: 4
                                S120887=3;
                                S121026=0;
                                if(!capperStatus_in.isPartnerPresent() || capperStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 70, column: 4
                                  capperStatus_in.setACK(false);//sysj\orchestrator.sysj line: 70, column: 4
                                  S121026=1;
                                  active[4]=1;
                                  ends[4]=1;
                                  tdone[4]=1;
                                }
                                else {
                                  S121021=0;
                                  if(!capperStatus_in.isREQ()){//sysj\orchestrator.sysj line: 70, column: 4
                                    capperStatus_in.setACK(true);//sysj\orchestrator.sysj line: 70, column: 4
                                    S121021=1;
                                    if(capperStatus_in.isREQ()){//sysj\orchestrator.sysj line: 70, column: 4
                                      capperStatus_in.setACK(false);//sysj\orchestrator.sysj line: 70, column: 4
                                      ends[4]=2;
                                      ;//sysj\orchestrator.sysj line: 70, column: 4
                                      conveyStat_thread_4 = (conveyorStatus_in.getVal() == null ? null : ((String)conveyorStatus_in.getVal()));//sysj\orchestrator.sysj line: 72, column: 4
                                      fillerStat_thread_4 = (fillerStatus_in.getVal() == null ? null : ((String)fillerStatus_in.getVal()));//sysj\orchestrator.sysj line: 73, column: 4
                                      screwerStat_thread_4 = (capLoaderStatus_in.getVal() == null ? null : ((String)capLoaderStatus_in.getVal()));//sysj\orchestrator.sysj line: 74, column: 4
                                      loaderStat_thread_4 = (capperStatus_in.getVal() == null ? null : ((String)capperStatus_in.getVal()));//sysj\orchestrator.sysj line: 75, column: 4
                                      S120887=4;
                                      if((conveyStat_thread_4 == "done" || conveyStat_thread_4 == "idle") && (fillerStat_thread_4 == "done" || fillerStat_thread_4 == "idle") && (screwerStat_thread_4 == "done" || screwerStat_thread_4 == "idle") && (loaderStat_thread_4 == "done" || loaderStat_thread_4 == "idle")){//sysj\orchestrator.sysj line: 78, column: 7
                                        System.out.println("sending request to rotary?");//sysj\orchestrator.sysj line: 82, column: 5
                                        S121202=0;
                                        if(!allOperationsFinished_o.isPartnerPresent() || allOperationsFinished_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 83, column: 5
                                          allOperationsFinished_o.setREQ(false);//sysj\orchestrator.sysj line: 83, column: 5
                                          S121202=1;
                                          active[4]=1;
                                          ends[4]=1;
                                          tdone[4]=1;
                                        }
                                        else {
                                          S121197=0;
                                          if(allOperationsFinished_o.isACK()){//sysj\orchestrator.sysj line: 83, column: 5
                                            allOperationsFinished_o.setVal(true);//sysj\orchestrator.sysj line: 83, column: 5
                                            S121197=1;
                                            if(!allOperationsFinished_o.isACK()){//sysj\orchestrator.sysj line: 83, column: 5
                                              allOperationsFinished_o.setREQ(false);//sysj\orchestrator.sysj line: 83, column: 5
                                              ends[4]=2;
                                              ;//sysj\orchestrator.sysj line: 83, column: 5
                                              S120887=5;
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
                                        S120887=5;
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
                      if(fillerStatus_in.isREQ()){//sysj\orchestrator.sysj line: 68, column: 4
                        fillerStatus_in.setACK(false);//sysj\orchestrator.sysj line: 68, column: 4
                        ends[4]=2;
                        ;//sysj\orchestrator.sysj line: 68, column: 4
                        S120887=2;
                        S120894=0;
                        if(!capLoaderStatus_in.isPartnerPresent() || capLoaderStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 69, column: 4
                          capLoaderStatus_in.setACK(false);//sysj\orchestrator.sysj line: 69, column: 4
                          S120894=1;
                          active[4]=1;
                          ends[4]=1;
                          tdone[4]=1;
                        }
                        else {
                          S120889=0;
                          if(!capLoaderStatus_in.isREQ()){//sysj\orchestrator.sysj line: 69, column: 4
                            capLoaderStatus_in.setACK(true);//sysj\orchestrator.sysj line: 69, column: 4
                            S120889=1;
                            if(capLoaderStatus_in.isREQ()){//sysj\orchestrator.sysj line: 69, column: 4
                              capLoaderStatus_in.setACK(false);//sysj\orchestrator.sysj line: 69, column: 4
                              ends[4]=2;
                              ;//sysj\orchestrator.sysj line: 69, column: 4
                              S120887=3;
                              S121026=0;
                              if(!capperStatus_in.isPartnerPresent() || capperStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 70, column: 4
                                capperStatus_in.setACK(false);//sysj\orchestrator.sysj line: 70, column: 4
                                S121026=1;
                                active[4]=1;
                                ends[4]=1;
                                tdone[4]=1;
                              }
                              else {
                                S121021=0;
                                if(!capperStatus_in.isREQ()){//sysj\orchestrator.sysj line: 70, column: 4
                                  capperStatus_in.setACK(true);//sysj\orchestrator.sysj line: 70, column: 4
                                  S121021=1;
                                  if(capperStatus_in.isREQ()){//sysj\orchestrator.sysj line: 70, column: 4
                                    capperStatus_in.setACK(false);//sysj\orchestrator.sysj line: 70, column: 4
                                    ends[4]=2;
                                    ;//sysj\orchestrator.sysj line: 70, column: 4
                                    conveyStat_thread_4 = (conveyorStatus_in.getVal() == null ? null : ((String)conveyorStatus_in.getVal()));//sysj\orchestrator.sysj line: 72, column: 4
                                    fillerStat_thread_4 = (fillerStatus_in.getVal() == null ? null : ((String)fillerStatus_in.getVal()));//sysj\orchestrator.sysj line: 73, column: 4
                                    screwerStat_thread_4 = (capLoaderStatus_in.getVal() == null ? null : ((String)capLoaderStatus_in.getVal()));//sysj\orchestrator.sysj line: 74, column: 4
                                    loaderStat_thread_4 = (capperStatus_in.getVal() == null ? null : ((String)capperStatus_in.getVal()));//sysj\orchestrator.sysj line: 75, column: 4
                                    S120887=4;
                                    if((conveyStat_thread_4 == "done" || conveyStat_thread_4 == "idle") && (fillerStat_thread_4 == "done" || fillerStat_thread_4 == "idle") && (screwerStat_thread_4 == "done" || screwerStat_thread_4 == "idle") && (loaderStat_thread_4 == "done" || loaderStat_thread_4 == "idle")){//sysj\orchestrator.sysj line: 78, column: 7
                                      System.out.println("sending request to rotary?");//sysj\orchestrator.sysj line: 82, column: 5
                                      S121202=0;
                                      if(!allOperationsFinished_o.isPartnerPresent() || allOperationsFinished_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 83, column: 5
                                        allOperationsFinished_o.setREQ(false);//sysj\orchestrator.sysj line: 83, column: 5
                                        S121202=1;
                                        active[4]=1;
                                        ends[4]=1;
                                        tdone[4]=1;
                                      }
                                      else {
                                        S121197=0;
                                        if(allOperationsFinished_o.isACK()){//sysj\orchestrator.sysj line: 83, column: 5
                                          allOperationsFinished_o.setVal(true);//sysj\orchestrator.sysj line: 83, column: 5
                                          S121197=1;
                                          if(!allOperationsFinished_o.isACK()){//sysj\orchestrator.sysj line: 83, column: 5
                                            allOperationsFinished_o.setREQ(false);//sysj\orchestrator.sysj line: 83, column: 5
                                            ends[4]=2;
                                            ;//sysj\orchestrator.sysj line: 83, column: 5
                                            S120887=5;
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
                                      S120887=5;
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
                S120805=1;
                S120805=0;
                if(!fillerStatus_in.isPartnerPresent() || fillerStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 68, column: 4
                  fillerStatus_in.setACK(false);//sysj\orchestrator.sysj line: 68, column: 4
                  S120805=1;
                  active[4]=1;
                  ends[4]=1;
                  tdone[4]=1;
                }
                else {
                  S120800=0;
                  if(!fillerStatus_in.isREQ()){//sysj\orchestrator.sysj line: 68, column: 4
                    fillerStatus_in.setACK(true);//sysj\orchestrator.sysj line: 68, column: 4
                    S120800=1;
                    if(fillerStatus_in.isREQ()){//sysj\orchestrator.sysj line: 68, column: 4
                      fillerStatus_in.setACK(false);//sysj\orchestrator.sysj line: 68, column: 4
                      ends[4]=2;
                      ;//sysj\orchestrator.sysj line: 68, column: 4
                      S120887=2;
                      S120894=0;
                      if(!capLoaderStatus_in.isPartnerPresent() || capLoaderStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 69, column: 4
                        capLoaderStatus_in.setACK(false);//sysj\orchestrator.sysj line: 69, column: 4
                        S120894=1;
                        active[4]=1;
                        ends[4]=1;
                        tdone[4]=1;
                      }
                      else {
                        S120889=0;
                        if(!capLoaderStatus_in.isREQ()){//sysj\orchestrator.sysj line: 69, column: 4
                          capLoaderStatus_in.setACK(true);//sysj\orchestrator.sysj line: 69, column: 4
                          S120889=1;
                          if(capLoaderStatus_in.isREQ()){//sysj\orchestrator.sysj line: 69, column: 4
                            capLoaderStatus_in.setACK(false);//sysj\orchestrator.sysj line: 69, column: 4
                            ends[4]=2;
                            ;//sysj\orchestrator.sysj line: 69, column: 4
                            S120887=3;
                            S121026=0;
                            if(!capperStatus_in.isPartnerPresent() || capperStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 70, column: 4
                              capperStatus_in.setACK(false);//sysj\orchestrator.sysj line: 70, column: 4
                              S121026=1;
                              active[4]=1;
                              ends[4]=1;
                              tdone[4]=1;
                            }
                            else {
                              S121021=0;
                              if(!capperStatus_in.isREQ()){//sysj\orchestrator.sysj line: 70, column: 4
                                capperStatus_in.setACK(true);//sysj\orchestrator.sysj line: 70, column: 4
                                S121021=1;
                                if(capperStatus_in.isREQ()){//sysj\orchestrator.sysj line: 70, column: 4
                                  capperStatus_in.setACK(false);//sysj\orchestrator.sysj line: 70, column: 4
                                  ends[4]=2;
                                  ;//sysj\orchestrator.sysj line: 70, column: 4
                                  conveyStat_thread_4 = (conveyorStatus_in.getVal() == null ? null : ((String)conveyorStatus_in.getVal()));//sysj\orchestrator.sysj line: 72, column: 4
                                  fillerStat_thread_4 = (fillerStatus_in.getVal() == null ? null : ((String)fillerStatus_in.getVal()));//sysj\orchestrator.sysj line: 73, column: 4
                                  screwerStat_thread_4 = (capLoaderStatus_in.getVal() == null ? null : ((String)capLoaderStatus_in.getVal()));//sysj\orchestrator.sysj line: 74, column: 4
                                  loaderStat_thread_4 = (capperStatus_in.getVal() == null ? null : ((String)capperStatus_in.getVal()));//sysj\orchestrator.sysj line: 75, column: 4
                                  S120887=4;
                                  if((conveyStat_thread_4 == "done" || conveyStat_thread_4 == "idle") && (fillerStat_thread_4 == "done" || fillerStat_thread_4 == "idle") && (screwerStat_thread_4 == "done" || screwerStat_thread_4 == "idle") && (loaderStat_thread_4 == "done" || loaderStat_thread_4 == "idle")){//sysj\orchestrator.sysj line: 78, column: 7
                                    System.out.println("sending request to rotary?");//sysj\orchestrator.sysj line: 82, column: 5
                                    S121202=0;
                                    if(!allOperationsFinished_o.isPartnerPresent() || allOperationsFinished_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 83, column: 5
                                      allOperationsFinished_o.setREQ(false);//sysj\orchestrator.sysj line: 83, column: 5
                                      S121202=1;
                                      active[4]=1;
                                      ends[4]=1;
                                      tdone[4]=1;
                                    }
                                    else {
                                      S121197=0;
                                      if(allOperationsFinished_o.isACK()){//sysj\orchestrator.sysj line: 83, column: 5
                                        allOperationsFinished_o.setVal(true);//sysj\orchestrator.sysj line: 83, column: 5
                                        S121197=1;
                                        if(!allOperationsFinished_o.isACK()){//sysj\orchestrator.sysj line: 83, column: 5
                                          allOperationsFinished_o.setREQ(false);//sysj\orchestrator.sysj line: 83, column: 5
                                          ends[4]=2;
                                          ;//sysj\orchestrator.sysj line: 83, column: 5
                                          S120887=5;
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
                                    S120887=5;
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
            switch(S120894){
              case 0 : 
                if(!capLoaderStatus_in.isPartnerPresent() || capLoaderStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 69, column: 4
                  capLoaderStatus_in.setACK(false);//sysj\orchestrator.sysj line: 69, column: 4
                  S120894=1;
                  active[4]=1;
                  ends[4]=1;
                  tdone[4]=1;
                }
                else {
                  switch(S120889){
                    case 0 : 
                      if(!capLoaderStatus_in.isREQ()){//sysj\orchestrator.sysj line: 69, column: 4
                        capLoaderStatus_in.setACK(true);//sysj\orchestrator.sysj line: 69, column: 4
                        S120889=1;
                        if(capLoaderStatus_in.isREQ()){//sysj\orchestrator.sysj line: 69, column: 4
                          capLoaderStatus_in.setACK(false);//sysj\orchestrator.sysj line: 69, column: 4
                          ends[4]=2;
                          ;//sysj\orchestrator.sysj line: 69, column: 4
                          S120887=3;
                          S121026=0;
                          if(!capperStatus_in.isPartnerPresent() || capperStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 70, column: 4
                            capperStatus_in.setACK(false);//sysj\orchestrator.sysj line: 70, column: 4
                            S121026=1;
                            active[4]=1;
                            ends[4]=1;
                            tdone[4]=1;
                          }
                          else {
                            S121021=0;
                            if(!capperStatus_in.isREQ()){//sysj\orchestrator.sysj line: 70, column: 4
                              capperStatus_in.setACK(true);//sysj\orchestrator.sysj line: 70, column: 4
                              S121021=1;
                              if(capperStatus_in.isREQ()){//sysj\orchestrator.sysj line: 70, column: 4
                                capperStatus_in.setACK(false);//sysj\orchestrator.sysj line: 70, column: 4
                                ends[4]=2;
                                ;//sysj\orchestrator.sysj line: 70, column: 4
                                conveyStat_thread_4 = (conveyorStatus_in.getVal() == null ? null : ((String)conveyorStatus_in.getVal()));//sysj\orchestrator.sysj line: 72, column: 4
                                fillerStat_thread_4 = (fillerStatus_in.getVal() == null ? null : ((String)fillerStatus_in.getVal()));//sysj\orchestrator.sysj line: 73, column: 4
                                screwerStat_thread_4 = (capLoaderStatus_in.getVal() == null ? null : ((String)capLoaderStatus_in.getVal()));//sysj\orchestrator.sysj line: 74, column: 4
                                loaderStat_thread_4 = (capperStatus_in.getVal() == null ? null : ((String)capperStatus_in.getVal()));//sysj\orchestrator.sysj line: 75, column: 4
                                S120887=4;
                                if((conveyStat_thread_4 == "done" || conveyStat_thread_4 == "idle") && (fillerStat_thread_4 == "done" || fillerStat_thread_4 == "idle") && (screwerStat_thread_4 == "done" || screwerStat_thread_4 == "idle") && (loaderStat_thread_4 == "done" || loaderStat_thread_4 == "idle")){//sysj\orchestrator.sysj line: 78, column: 7
                                  System.out.println("sending request to rotary?");//sysj\orchestrator.sysj line: 82, column: 5
                                  S121202=0;
                                  if(!allOperationsFinished_o.isPartnerPresent() || allOperationsFinished_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 83, column: 5
                                    allOperationsFinished_o.setREQ(false);//sysj\orchestrator.sysj line: 83, column: 5
                                    S121202=1;
                                    active[4]=1;
                                    ends[4]=1;
                                    tdone[4]=1;
                                  }
                                  else {
                                    S121197=0;
                                    if(allOperationsFinished_o.isACK()){//sysj\orchestrator.sysj line: 83, column: 5
                                      allOperationsFinished_o.setVal(true);//sysj\orchestrator.sysj line: 83, column: 5
                                      S121197=1;
                                      if(!allOperationsFinished_o.isACK()){//sysj\orchestrator.sysj line: 83, column: 5
                                        allOperationsFinished_o.setREQ(false);//sysj\orchestrator.sysj line: 83, column: 5
                                        ends[4]=2;
                                        ;//sysj\orchestrator.sysj line: 83, column: 5
                                        S120887=5;
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
                                  S120887=5;
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
                      if(capLoaderStatus_in.isREQ()){//sysj\orchestrator.sysj line: 69, column: 4
                        capLoaderStatus_in.setACK(false);//sysj\orchestrator.sysj line: 69, column: 4
                        ends[4]=2;
                        ;//sysj\orchestrator.sysj line: 69, column: 4
                        S120887=3;
                        S121026=0;
                        if(!capperStatus_in.isPartnerPresent() || capperStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 70, column: 4
                          capperStatus_in.setACK(false);//sysj\orchestrator.sysj line: 70, column: 4
                          S121026=1;
                          active[4]=1;
                          ends[4]=1;
                          tdone[4]=1;
                        }
                        else {
                          S121021=0;
                          if(!capperStatus_in.isREQ()){//sysj\orchestrator.sysj line: 70, column: 4
                            capperStatus_in.setACK(true);//sysj\orchestrator.sysj line: 70, column: 4
                            S121021=1;
                            if(capperStatus_in.isREQ()){//sysj\orchestrator.sysj line: 70, column: 4
                              capperStatus_in.setACK(false);//sysj\orchestrator.sysj line: 70, column: 4
                              ends[4]=2;
                              ;//sysj\orchestrator.sysj line: 70, column: 4
                              conveyStat_thread_4 = (conveyorStatus_in.getVal() == null ? null : ((String)conveyorStatus_in.getVal()));//sysj\orchestrator.sysj line: 72, column: 4
                              fillerStat_thread_4 = (fillerStatus_in.getVal() == null ? null : ((String)fillerStatus_in.getVal()));//sysj\orchestrator.sysj line: 73, column: 4
                              screwerStat_thread_4 = (capLoaderStatus_in.getVal() == null ? null : ((String)capLoaderStatus_in.getVal()));//sysj\orchestrator.sysj line: 74, column: 4
                              loaderStat_thread_4 = (capperStatus_in.getVal() == null ? null : ((String)capperStatus_in.getVal()));//sysj\orchestrator.sysj line: 75, column: 4
                              S120887=4;
                              if((conveyStat_thread_4 == "done" || conveyStat_thread_4 == "idle") && (fillerStat_thread_4 == "done" || fillerStat_thread_4 == "idle") && (screwerStat_thread_4 == "done" || screwerStat_thread_4 == "idle") && (loaderStat_thread_4 == "done" || loaderStat_thread_4 == "idle")){//sysj\orchestrator.sysj line: 78, column: 7
                                System.out.println("sending request to rotary?");//sysj\orchestrator.sysj line: 82, column: 5
                                S121202=0;
                                if(!allOperationsFinished_o.isPartnerPresent() || allOperationsFinished_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 83, column: 5
                                  allOperationsFinished_o.setREQ(false);//sysj\orchestrator.sysj line: 83, column: 5
                                  S121202=1;
                                  active[4]=1;
                                  ends[4]=1;
                                  tdone[4]=1;
                                }
                                else {
                                  S121197=0;
                                  if(allOperationsFinished_o.isACK()){//sysj\orchestrator.sysj line: 83, column: 5
                                    allOperationsFinished_o.setVal(true);//sysj\orchestrator.sysj line: 83, column: 5
                                    S121197=1;
                                    if(!allOperationsFinished_o.isACK()){//sysj\orchestrator.sysj line: 83, column: 5
                                      allOperationsFinished_o.setREQ(false);//sysj\orchestrator.sysj line: 83, column: 5
                                      ends[4]=2;
                                      ;//sysj\orchestrator.sysj line: 83, column: 5
                                      S120887=5;
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
                                S120887=5;
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
                S120894=1;
                S120894=0;
                if(!capLoaderStatus_in.isPartnerPresent() || capLoaderStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 69, column: 4
                  capLoaderStatus_in.setACK(false);//sysj\orchestrator.sysj line: 69, column: 4
                  S120894=1;
                  active[4]=1;
                  ends[4]=1;
                  tdone[4]=1;
                }
                else {
                  S120889=0;
                  if(!capLoaderStatus_in.isREQ()){//sysj\orchestrator.sysj line: 69, column: 4
                    capLoaderStatus_in.setACK(true);//sysj\orchestrator.sysj line: 69, column: 4
                    S120889=1;
                    if(capLoaderStatus_in.isREQ()){//sysj\orchestrator.sysj line: 69, column: 4
                      capLoaderStatus_in.setACK(false);//sysj\orchestrator.sysj line: 69, column: 4
                      ends[4]=2;
                      ;//sysj\orchestrator.sysj line: 69, column: 4
                      S120887=3;
                      S121026=0;
                      if(!capperStatus_in.isPartnerPresent() || capperStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 70, column: 4
                        capperStatus_in.setACK(false);//sysj\orchestrator.sysj line: 70, column: 4
                        S121026=1;
                        active[4]=1;
                        ends[4]=1;
                        tdone[4]=1;
                      }
                      else {
                        S121021=0;
                        if(!capperStatus_in.isREQ()){//sysj\orchestrator.sysj line: 70, column: 4
                          capperStatus_in.setACK(true);//sysj\orchestrator.sysj line: 70, column: 4
                          S121021=1;
                          if(capperStatus_in.isREQ()){//sysj\orchestrator.sysj line: 70, column: 4
                            capperStatus_in.setACK(false);//sysj\orchestrator.sysj line: 70, column: 4
                            ends[4]=2;
                            ;//sysj\orchestrator.sysj line: 70, column: 4
                            conveyStat_thread_4 = (conveyorStatus_in.getVal() == null ? null : ((String)conveyorStatus_in.getVal()));//sysj\orchestrator.sysj line: 72, column: 4
                            fillerStat_thread_4 = (fillerStatus_in.getVal() == null ? null : ((String)fillerStatus_in.getVal()));//sysj\orchestrator.sysj line: 73, column: 4
                            screwerStat_thread_4 = (capLoaderStatus_in.getVal() == null ? null : ((String)capLoaderStatus_in.getVal()));//sysj\orchestrator.sysj line: 74, column: 4
                            loaderStat_thread_4 = (capperStatus_in.getVal() == null ? null : ((String)capperStatus_in.getVal()));//sysj\orchestrator.sysj line: 75, column: 4
                            S120887=4;
                            if((conveyStat_thread_4 == "done" || conveyStat_thread_4 == "idle") && (fillerStat_thread_4 == "done" || fillerStat_thread_4 == "idle") && (screwerStat_thread_4 == "done" || screwerStat_thread_4 == "idle") && (loaderStat_thread_4 == "done" || loaderStat_thread_4 == "idle")){//sysj\orchestrator.sysj line: 78, column: 7
                              System.out.println("sending request to rotary?");//sysj\orchestrator.sysj line: 82, column: 5
                              S121202=0;
                              if(!allOperationsFinished_o.isPartnerPresent() || allOperationsFinished_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 83, column: 5
                                allOperationsFinished_o.setREQ(false);//sysj\orchestrator.sysj line: 83, column: 5
                                S121202=1;
                                active[4]=1;
                                ends[4]=1;
                                tdone[4]=1;
                              }
                              else {
                                S121197=0;
                                if(allOperationsFinished_o.isACK()){//sysj\orchestrator.sysj line: 83, column: 5
                                  allOperationsFinished_o.setVal(true);//sysj\orchestrator.sysj line: 83, column: 5
                                  S121197=1;
                                  if(!allOperationsFinished_o.isACK()){//sysj\orchestrator.sysj line: 83, column: 5
                                    allOperationsFinished_o.setREQ(false);//sysj\orchestrator.sysj line: 83, column: 5
                                    ends[4]=2;
                                    ;//sysj\orchestrator.sysj line: 83, column: 5
                                    S120887=5;
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
                              S120887=5;
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
            switch(S121026){
              case 0 : 
                if(!capperStatus_in.isPartnerPresent() || capperStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 70, column: 4
                  capperStatus_in.setACK(false);//sysj\orchestrator.sysj line: 70, column: 4
                  S121026=1;
                  active[4]=1;
                  ends[4]=1;
                  tdone[4]=1;
                }
                else {
                  switch(S121021){
                    case 0 : 
                      if(!capperStatus_in.isREQ()){//sysj\orchestrator.sysj line: 70, column: 4
                        capperStatus_in.setACK(true);//sysj\orchestrator.sysj line: 70, column: 4
                        S121021=1;
                        if(capperStatus_in.isREQ()){//sysj\orchestrator.sysj line: 70, column: 4
                          capperStatus_in.setACK(false);//sysj\orchestrator.sysj line: 70, column: 4
                          ends[4]=2;
                          ;//sysj\orchestrator.sysj line: 70, column: 4
                          conveyStat_thread_4 = (conveyorStatus_in.getVal() == null ? null : ((String)conveyorStatus_in.getVal()));//sysj\orchestrator.sysj line: 72, column: 4
                          fillerStat_thread_4 = (fillerStatus_in.getVal() == null ? null : ((String)fillerStatus_in.getVal()));//sysj\orchestrator.sysj line: 73, column: 4
                          screwerStat_thread_4 = (capLoaderStatus_in.getVal() == null ? null : ((String)capLoaderStatus_in.getVal()));//sysj\orchestrator.sysj line: 74, column: 4
                          loaderStat_thread_4 = (capperStatus_in.getVal() == null ? null : ((String)capperStatus_in.getVal()));//sysj\orchestrator.sysj line: 75, column: 4
                          S120887=4;
                          if((conveyStat_thread_4 == "done" || conveyStat_thread_4 == "idle") && (fillerStat_thread_4 == "done" || fillerStat_thread_4 == "idle") && (screwerStat_thread_4 == "done" || screwerStat_thread_4 == "idle") && (loaderStat_thread_4 == "done" || loaderStat_thread_4 == "idle")){//sysj\orchestrator.sysj line: 78, column: 7
                            System.out.println("sending request to rotary?");//sysj\orchestrator.sysj line: 82, column: 5
                            S121202=0;
                            if(!allOperationsFinished_o.isPartnerPresent() || allOperationsFinished_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 83, column: 5
                              allOperationsFinished_o.setREQ(false);//sysj\orchestrator.sysj line: 83, column: 5
                              S121202=1;
                              active[4]=1;
                              ends[4]=1;
                              tdone[4]=1;
                            }
                            else {
                              S121197=0;
                              if(allOperationsFinished_o.isACK()){//sysj\orchestrator.sysj line: 83, column: 5
                                allOperationsFinished_o.setVal(true);//sysj\orchestrator.sysj line: 83, column: 5
                                S121197=1;
                                if(!allOperationsFinished_o.isACK()){//sysj\orchestrator.sysj line: 83, column: 5
                                  allOperationsFinished_o.setREQ(false);//sysj\orchestrator.sysj line: 83, column: 5
                                  ends[4]=2;
                                  ;//sysj\orchestrator.sysj line: 83, column: 5
                                  S120887=5;
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
                            S120887=5;
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
                      if(capperStatus_in.isREQ()){//sysj\orchestrator.sysj line: 70, column: 4
                        capperStatus_in.setACK(false);//sysj\orchestrator.sysj line: 70, column: 4
                        ends[4]=2;
                        ;//sysj\orchestrator.sysj line: 70, column: 4
                        conveyStat_thread_4 = (conveyorStatus_in.getVal() == null ? null : ((String)conveyorStatus_in.getVal()));//sysj\orchestrator.sysj line: 72, column: 4
                        fillerStat_thread_4 = (fillerStatus_in.getVal() == null ? null : ((String)fillerStatus_in.getVal()));//sysj\orchestrator.sysj line: 73, column: 4
                        screwerStat_thread_4 = (capLoaderStatus_in.getVal() == null ? null : ((String)capLoaderStatus_in.getVal()));//sysj\orchestrator.sysj line: 74, column: 4
                        loaderStat_thread_4 = (capperStatus_in.getVal() == null ? null : ((String)capperStatus_in.getVal()));//sysj\orchestrator.sysj line: 75, column: 4
                        S120887=4;
                        if((conveyStat_thread_4 == "done" || conveyStat_thread_4 == "idle") && (fillerStat_thread_4 == "done" || fillerStat_thread_4 == "idle") && (screwerStat_thread_4 == "done" || screwerStat_thread_4 == "idle") && (loaderStat_thread_4 == "done" || loaderStat_thread_4 == "idle")){//sysj\orchestrator.sysj line: 78, column: 7
                          System.out.println("sending request to rotary?");//sysj\orchestrator.sysj line: 82, column: 5
                          S121202=0;
                          if(!allOperationsFinished_o.isPartnerPresent() || allOperationsFinished_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 83, column: 5
                            allOperationsFinished_o.setREQ(false);//sysj\orchestrator.sysj line: 83, column: 5
                            S121202=1;
                            active[4]=1;
                            ends[4]=1;
                            tdone[4]=1;
                          }
                          else {
                            S121197=0;
                            if(allOperationsFinished_o.isACK()){//sysj\orchestrator.sysj line: 83, column: 5
                              allOperationsFinished_o.setVal(true);//sysj\orchestrator.sysj line: 83, column: 5
                              S121197=1;
                              if(!allOperationsFinished_o.isACK()){//sysj\orchestrator.sysj line: 83, column: 5
                                allOperationsFinished_o.setREQ(false);//sysj\orchestrator.sysj line: 83, column: 5
                                ends[4]=2;
                                ;//sysj\orchestrator.sysj line: 83, column: 5
                                S120887=5;
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
                          S120887=5;
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
                S121026=1;
                S121026=0;
                if(!capperStatus_in.isPartnerPresent() || capperStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 70, column: 4
                  capperStatus_in.setACK(false);//sysj\orchestrator.sysj line: 70, column: 4
                  S121026=1;
                  active[4]=1;
                  ends[4]=1;
                  tdone[4]=1;
                }
                else {
                  S121021=0;
                  if(!capperStatus_in.isREQ()){//sysj\orchestrator.sysj line: 70, column: 4
                    capperStatus_in.setACK(true);//sysj\orchestrator.sysj line: 70, column: 4
                    S121021=1;
                    if(capperStatus_in.isREQ()){//sysj\orchestrator.sysj line: 70, column: 4
                      capperStatus_in.setACK(false);//sysj\orchestrator.sysj line: 70, column: 4
                      ends[4]=2;
                      ;//sysj\orchestrator.sysj line: 70, column: 4
                      conveyStat_thread_4 = (conveyorStatus_in.getVal() == null ? null : ((String)conveyorStatus_in.getVal()));//sysj\orchestrator.sysj line: 72, column: 4
                      fillerStat_thread_4 = (fillerStatus_in.getVal() == null ? null : ((String)fillerStatus_in.getVal()));//sysj\orchestrator.sysj line: 73, column: 4
                      screwerStat_thread_4 = (capLoaderStatus_in.getVal() == null ? null : ((String)capLoaderStatus_in.getVal()));//sysj\orchestrator.sysj line: 74, column: 4
                      loaderStat_thread_4 = (capperStatus_in.getVal() == null ? null : ((String)capperStatus_in.getVal()));//sysj\orchestrator.sysj line: 75, column: 4
                      S120887=4;
                      if((conveyStat_thread_4 == "done" || conveyStat_thread_4 == "idle") && (fillerStat_thread_4 == "done" || fillerStat_thread_4 == "idle") && (screwerStat_thread_4 == "done" || screwerStat_thread_4 == "idle") && (loaderStat_thread_4 == "done" || loaderStat_thread_4 == "idle")){//sysj\orchestrator.sysj line: 78, column: 7
                        System.out.println("sending request to rotary?");//sysj\orchestrator.sysj line: 82, column: 5
                        S121202=0;
                        if(!allOperationsFinished_o.isPartnerPresent() || allOperationsFinished_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 83, column: 5
                          allOperationsFinished_o.setREQ(false);//sysj\orchestrator.sysj line: 83, column: 5
                          S121202=1;
                          active[4]=1;
                          ends[4]=1;
                          tdone[4]=1;
                        }
                        else {
                          S121197=0;
                          if(allOperationsFinished_o.isACK()){//sysj\orchestrator.sysj line: 83, column: 5
                            allOperationsFinished_o.setVal(true);//sysj\orchestrator.sysj line: 83, column: 5
                            S121197=1;
                            if(!allOperationsFinished_o.isACK()){//sysj\orchestrator.sysj line: 83, column: 5
                              allOperationsFinished_o.setREQ(false);//sysj\orchestrator.sysj line: 83, column: 5
                              ends[4]=2;
                              ;//sysj\orchestrator.sysj line: 83, column: 5
                              S120887=5;
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
                        S120887=5;
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
            switch(S121202){
              case 0 : 
                if(!allOperationsFinished_o.isPartnerPresent() || allOperationsFinished_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 83, column: 5
                  allOperationsFinished_o.setREQ(false);//sysj\orchestrator.sysj line: 83, column: 5
                  S121202=1;
                  active[4]=1;
                  ends[4]=1;
                  tdone[4]=1;
                }
                else {
                  switch(S121197){
                    case 0 : 
                      if(allOperationsFinished_o.isACK()){//sysj\orchestrator.sysj line: 83, column: 5
                        allOperationsFinished_o.setVal(true);//sysj\orchestrator.sysj line: 83, column: 5
                        S121197=1;
                        if(!allOperationsFinished_o.isACK()){//sysj\orchestrator.sysj line: 83, column: 5
                          allOperationsFinished_o.setREQ(false);//sysj\orchestrator.sysj line: 83, column: 5
                          ends[4]=2;
                          ;//sysj\orchestrator.sysj line: 83, column: 5
                          S120887=5;
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
                      if(!allOperationsFinished_o.isACK()){//sysj\orchestrator.sysj line: 83, column: 5
                        allOperationsFinished_o.setREQ(false);//sysj\orchestrator.sysj line: 83, column: 5
                        ends[4]=2;
                        ;//sysj\orchestrator.sysj line: 83, column: 5
                        S120887=5;
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
                S121202=1;
                S121202=0;
                if(!allOperationsFinished_o.isPartnerPresent() || allOperationsFinished_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 83, column: 5
                  allOperationsFinished_o.setREQ(false);//sysj\orchestrator.sysj line: 83, column: 5
                  S121202=1;
                  active[4]=1;
                  ends[4]=1;
                  tdone[4]=1;
                }
                else {
                  S121197=0;
                  if(allOperationsFinished_o.isACK()){//sysj\orchestrator.sysj line: 83, column: 5
                    allOperationsFinished_o.setVal(true);//sysj\orchestrator.sysj line: 83, column: 5
                    S121197=1;
                    if(!allOperationsFinished_o.isACK()){//sysj\orchestrator.sysj line: 83, column: 5
                      allOperationsFinished_o.setREQ(false);//sysj\orchestrator.sysj line: 83, column: 5
                      ends[4]=2;
                      ;//sysj\orchestrator.sysj line: 83, column: 5
                      S120887=5;
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
            S120887=5;
            S120887=0;
            S120783=0;
            if(!conveyorStatus_in.isPartnerPresent() || conveyorStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 67, column: 4
              conveyorStatus_in.setACK(false);//sysj\orchestrator.sysj line: 67, column: 4
              S120783=1;
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            else {
              S120778=0;
              if(!conveyorStatus_in.isREQ()){//sysj\orchestrator.sysj line: 67, column: 4
                conveyorStatus_in.setACK(true);//sysj\orchestrator.sysj line: 67, column: 4
                S120778=1;
                if(conveyorStatus_in.isREQ()){//sysj\orchestrator.sysj line: 67, column: 4
                  conveyorStatus_in.setACK(false);//sysj\orchestrator.sysj line: 67, column: 4
                  ends[4]=2;
                  ;//sysj\orchestrator.sysj line: 67, column: 4
                  S120887=1;
                  S120805=0;
                  if(!fillerStatus_in.isPartnerPresent() || fillerStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 68, column: 4
                    fillerStatus_in.setACK(false);//sysj\orchestrator.sysj line: 68, column: 4
                    S120805=1;
                    active[4]=1;
                    ends[4]=1;
                    tdone[4]=1;
                  }
                  else {
                    S120800=0;
                    if(!fillerStatus_in.isREQ()){//sysj\orchestrator.sysj line: 68, column: 4
                      fillerStatus_in.setACK(true);//sysj\orchestrator.sysj line: 68, column: 4
                      S120800=1;
                      if(fillerStatus_in.isREQ()){//sysj\orchestrator.sysj line: 68, column: 4
                        fillerStatus_in.setACK(false);//sysj\orchestrator.sysj line: 68, column: 4
                        ends[4]=2;
                        ;//sysj\orchestrator.sysj line: 68, column: 4
                        S120887=2;
                        S120894=0;
                        if(!capLoaderStatus_in.isPartnerPresent() || capLoaderStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 69, column: 4
                          capLoaderStatus_in.setACK(false);//sysj\orchestrator.sysj line: 69, column: 4
                          S120894=1;
                          active[4]=1;
                          ends[4]=1;
                          tdone[4]=1;
                        }
                        else {
                          S120889=0;
                          if(!capLoaderStatus_in.isREQ()){//sysj\orchestrator.sysj line: 69, column: 4
                            capLoaderStatus_in.setACK(true);//sysj\orchestrator.sysj line: 69, column: 4
                            S120889=1;
                            if(capLoaderStatus_in.isREQ()){//sysj\orchestrator.sysj line: 69, column: 4
                              capLoaderStatus_in.setACK(false);//sysj\orchestrator.sysj line: 69, column: 4
                              ends[4]=2;
                              ;//sysj\orchestrator.sysj line: 69, column: 4
                              S120887=3;
                              S121026=0;
                              if(!capperStatus_in.isPartnerPresent() || capperStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 70, column: 4
                                capperStatus_in.setACK(false);//sysj\orchestrator.sysj line: 70, column: 4
                                S121026=1;
                                active[4]=1;
                                ends[4]=1;
                                tdone[4]=1;
                              }
                              else {
                                S121021=0;
                                if(!capperStatus_in.isREQ()){//sysj\orchestrator.sysj line: 70, column: 4
                                  capperStatus_in.setACK(true);//sysj\orchestrator.sysj line: 70, column: 4
                                  S121021=1;
                                  if(capperStatus_in.isREQ()){//sysj\orchestrator.sysj line: 70, column: 4
                                    capperStatus_in.setACK(false);//sysj\orchestrator.sysj line: 70, column: 4
                                    ends[4]=2;
                                    ;//sysj\orchestrator.sysj line: 70, column: 4
                                    conveyStat_thread_4 = (conveyorStatus_in.getVal() == null ? null : ((String)conveyorStatus_in.getVal()));//sysj\orchestrator.sysj line: 72, column: 4
                                    fillerStat_thread_4 = (fillerStatus_in.getVal() == null ? null : ((String)fillerStatus_in.getVal()));//sysj\orchestrator.sysj line: 73, column: 4
                                    screwerStat_thread_4 = (capLoaderStatus_in.getVal() == null ? null : ((String)capLoaderStatus_in.getVal()));//sysj\orchestrator.sysj line: 74, column: 4
                                    loaderStat_thread_4 = (capperStatus_in.getVal() == null ? null : ((String)capperStatus_in.getVal()));//sysj\orchestrator.sysj line: 75, column: 4
                                    S120887=4;
                                    if((conveyStat_thread_4 == "done" || conveyStat_thread_4 == "idle") && (fillerStat_thread_4 == "done" || fillerStat_thread_4 == "idle") && (screwerStat_thread_4 == "done" || screwerStat_thread_4 == "idle") && (loaderStat_thread_4 == "done" || loaderStat_thread_4 == "idle")){//sysj\orchestrator.sysj line: 78, column: 7
                                      System.out.println("sending request to rotary?");//sysj\orchestrator.sysj line: 82, column: 5
                                      S121202=0;
                                      if(!allOperationsFinished_o.isPartnerPresent() || allOperationsFinished_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 83, column: 5
                                        allOperationsFinished_o.setREQ(false);//sysj\orchestrator.sysj line: 83, column: 5
                                        S121202=1;
                                        active[4]=1;
                                        ends[4]=1;
                                        tdone[4]=1;
                                      }
                                      else {
                                        S121197=0;
                                        if(allOperationsFinished_o.isACK()){//sysj\orchestrator.sysj line: 83, column: 5
                                          allOperationsFinished_o.setVal(true);//sysj\orchestrator.sysj line: 83, column: 5
                                          S121197=1;
                                          if(!allOperationsFinished_o.isACK()){//sysj\orchestrator.sysj line: 83, column: 5
                                            allOperationsFinished_o.setREQ(false);//sysj\orchestrator.sysj line: 83, column: 5
                                            ends[4]=2;
                                            ;//sysj\orchestrator.sysj line: 83, column: 5
                                            S120887=5;
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
                                      S120887=5;
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

  public void thread123424(int [] tdone, int [] ends){
        switch(S120776){
      case 0 : 
        active[3]=0;
        ends[3]=0;
        tdone[3]=1;
        break;
      
      case 1 : 
        switch(S117536){
          case 0 : 
            switch(S117520){
              case 0 : 
                if(!rotaryStatus_in.isPartnerPresent() || rotaryStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 49, column: 4
                  rotaryStatus_in.setACK(false);//sysj\orchestrator.sysj line: 49, column: 4
                  S117520=1;
                  active[3]=1;
                  ends[3]=1;
                  tdone[3]=1;
                }
                else {
                  switch(S117515){
                    case 0 : 
                      if(!rotaryStatus_in.isREQ()){//sysj\orchestrator.sysj line: 49, column: 4
                        rotaryStatus_in.setACK(true);//sysj\orchestrator.sysj line: 49, column: 4
                        S117515=1;
                        if(rotaryStatus_in.isREQ()){//sysj\orchestrator.sysj line: 49, column: 4
                          rotaryStatus_in.setACK(false);//sysj\orchestrator.sysj line: 49, column: 4
                          ends[3]=2;
                          ;//sysj\orchestrator.sysj line: 49, column: 4
                          rotaryStat_thread_3 = (rotaryStatus_in.getVal() == null ? null : ((String)rotaryStatus_in.getVal()));//sysj\orchestrator.sysj line: 50, column: 4
                          S117536=1;
                          if(rotaryStat_thread_3 == "done"){//sysj\orchestrator.sysj line: 53, column: 7
                            System.out.println("rotary done, sending filler,loader,screwer, conveyor reqs");//sysj\orchestrator.sysj line: 54, column: 5
                            S117581=0;
                            S117543=0;
                            if(!fillerReq_o.isPartnerPresent() || fillerReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 55, column: 5
                              fillerReq_o.setREQ(false);//sysj\orchestrator.sysj line: 55, column: 5
                              S117543=1;
                              active[3]=1;
                              ends[3]=1;
                              tdone[3]=1;
                            }
                            else {
                              S117538=0;
                              if(fillerReq_o.isACK()){//sysj\orchestrator.sysj line: 55, column: 5
                                fillerReq_o.setVal(true);//sysj\orchestrator.sysj line: 55, column: 5
                                S117538=1;
                                if(!fillerReq_o.isACK()){//sysj\orchestrator.sysj line: 55, column: 5
                                  fillerReq_o.setREQ(false);//sysj\orchestrator.sysj line: 55, column: 5
                                  ends[3]=2;
                                  ;//sysj\orchestrator.sysj line: 55, column: 5
                                  S117581=1;
                                  S117588=0;
                                  if(!capLoaderReq_o.isPartnerPresent() || capLoaderReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 56, column: 5
                                    capLoaderReq_o.setREQ(false);//sysj\orchestrator.sysj line: 56, column: 5
                                    S117588=1;
                                    active[3]=1;
                                    ends[3]=1;
                                    tdone[3]=1;
                                  }
                                  else {
                                    S117583=0;
                                    if(capLoaderReq_o.isACK()){//sysj\orchestrator.sysj line: 56, column: 5
                                      capLoaderReq_o.setVal(true);//sysj\orchestrator.sysj line: 56, column: 5
                                      S117583=1;
                                      if(!capLoaderReq_o.isACK()){//sysj\orchestrator.sysj line: 56, column: 5
                                        capLoaderReq_o.setREQ(false);//sysj\orchestrator.sysj line: 56, column: 5
                                        ends[3]=2;
                                        ;//sysj\orchestrator.sysj line: 56, column: 5
                                        S117581=2;
                                        S117676=0;
                                        if(!capperReq_o.isPartnerPresent() || capperReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 57, column: 5
                                          capperReq_o.setREQ(false);//sysj\orchestrator.sysj line: 57, column: 5
                                          S117676=1;
                                          active[3]=1;
                                          ends[3]=1;
                                          tdone[3]=1;
                                        }
                                        else {
                                          S117671=0;
                                          if(capperReq_o.isACK()){//sysj\orchestrator.sysj line: 57, column: 5
                                            capperReq_o.setVal(true);//sysj\orchestrator.sysj line: 57, column: 5
                                            S117671=1;
                                            if(!capperReq_o.isACK()){//sysj\orchestrator.sysj line: 57, column: 5
                                              capperReq_o.setREQ(false);//sysj\orchestrator.sysj line: 57, column: 5
                                              ends[3]=2;
                                              ;//sysj\orchestrator.sysj line: 57, column: 5
                                              getNextBottle_1.setPresent();//sysj\orchestrator.sysj line: 58, column: 5
                                              currsigs.addElement(getNextBottle_1);
                                              S117536=2;
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
                            S117536=2;
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
                        S117536=1;
                        if(rotaryStat_thread_3 == "done"){//sysj\orchestrator.sysj line: 53, column: 7
                          System.out.println("rotary done, sending filler,loader,screwer, conveyor reqs");//sysj\orchestrator.sysj line: 54, column: 5
                          S117581=0;
                          S117543=0;
                          if(!fillerReq_o.isPartnerPresent() || fillerReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 55, column: 5
                            fillerReq_o.setREQ(false);//sysj\orchestrator.sysj line: 55, column: 5
                            S117543=1;
                            active[3]=1;
                            ends[3]=1;
                            tdone[3]=1;
                          }
                          else {
                            S117538=0;
                            if(fillerReq_o.isACK()){//sysj\orchestrator.sysj line: 55, column: 5
                              fillerReq_o.setVal(true);//sysj\orchestrator.sysj line: 55, column: 5
                              S117538=1;
                              if(!fillerReq_o.isACK()){//sysj\orchestrator.sysj line: 55, column: 5
                                fillerReq_o.setREQ(false);//sysj\orchestrator.sysj line: 55, column: 5
                                ends[3]=2;
                                ;//sysj\orchestrator.sysj line: 55, column: 5
                                S117581=1;
                                S117588=0;
                                if(!capLoaderReq_o.isPartnerPresent() || capLoaderReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 56, column: 5
                                  capLoaderReq_o.setREQ(false);//sysj\orchestrator.sysj line: 56, column: 5
                                  S117588=1;
                                  active[3]=1;
                                  ends[3]=1;
                                  tdone[3]=1;
                                }
                                else {
                                  S117583=0;
                                  if(capLoaderReq_o.isACK()){//sysj\orchestrator.sysj line: 56, column: 5
                                    capLoaderReq_o.setVal(true);//sysj\orchestrator.sysj line: 56, column: 5
                                    S117583=1;
                                    if(!capLoaderReq_o.isACK()){//sysj\orchestrator.sysj line: 56, column: 5
                                      capLoaderReq_o.setREQ(false);//sysj\orchestrator.sysj line: 56, column: 5
                                      ends[3]=2;
                                      ;//sysj\orchestrator.sysj line: 56, column: 5
                                      S117581=2;
                                      S117676=0;
                                      if(!capperReq_o.isPartnerPresent() || capperReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 57, column: 5
                                        capperReq_o.setREQ(false);//sysj\orchestrator.sysj line: 57, column: 5
                                        S117676=1;
                                        active[3]=1;
                                        ends[3]=1;
                                        tdone[3]=1;
                                      }
                                      else {
                                        S117671=0;
                                        if(capperReq_o.isACK()){//sysj\orchestrator.sysj line: 57, column: 5
                                          capperReq_o.setVal(true);//sysj\orchestrator.sysj line: 57, column: 5
                                          S117671=1;
                                          if(!capperReq_o.isACK()){//sysj\orchestrator.sysj line: 57, column: 5
                                            capperReq_o.setREQ(false);//sysj\orchestrator.sysj line: 57, column: 5
                                            ends[3]=2;
                                            ;//sysj\orchestrator.sysj line: 57, column: 5
                                            getNextBottle_1.setPresent();//sysj\orchestrator.sysj line: 58, column: 5
                                            currsigs.addElement(getNextBottle_1);
                                            S117536=2;
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
                          S117536=2;
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
                S117520=1;
                S117520=0;
                if(!rotaryStatus_in.isPartnerPresent() || rotaryStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 49, column: 4
                  rotaryStatus_in.setACK(false);//sysj\orchestrator.sysj line: 49, column: 4
                  S117520=1;
                  active[3]=1;
                  ends[3]=1;
                  tdone[3]=1;
                }
                else {
                  S117515=0;
                  if(!rotaryStatus_in.isREQ()){//sysj\orchestrator.sysj line: 49, column: 4
                    rotaryStatus_in.setACK(true);//sysj\orchestrator.sysj line: 49, column: 4
                    S117515=1;
                    if(rotaryStatus_in.isREQ()){//sysj\orchestrator.sysj line: 49, column: 4
                      rotaryStatus_in.setACK(false);//sysj\orchestrator.sysj line: 49, column: 4
                      ends[3]=2;
                      ;//sysj\orchestrator.sysj line: 49, column: 4
                      rotaryStat_thread_3 = (rotaryStatus_in.getVal() == null ? null : ((String)rotaryStatus_in.getVal()));//sysj\orchestrator.sysj line: 50, column: 4
                      S117536=1;
                      if(rotaryStat_thread_3 == "done"){//sysj\orchestrator.sysj line: 53, column: 7
                        System.out.println("rotary done, sending filler,loader,screwer, conveyor reqs");//sysj\orchestrator.sysj line: 54, column: 5
                        S117581=0;
                        S117543=0;
                        if(!fillerReq_o.isPartnerPresent() || fillerReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 55, column: 5
                          fillerReq_o.setREQ(false);//sysj\orchestrator.sysj line: 55, column: 5
                          S117543=1;
                          active[3]=1;
                          ends[3]=1;
                          tdone[3]=1;
                        }
                        else {
                          S117538=0;
                          if(fillerReq_o.isACK()){//sysj\orchestrator.sysj line: 55, column: 5
                            fillerReq_o.setVal(true);//sysj\orchestrator.sysj line: 55, column: 5
                            S117538=1;
                            if(!fillerReq_o.isACK()){//sysj\orchestrator.sysj line: 55, column: 5
                              fillerReq_o.setREQ(false);//sysj\orchestrator.sysj line: 55, column: 5
                              ends[3]=2;
                              ;//sysj\orchestrator.sysj line: 55, column: 5
                              S117581=1;
                              S117588=0;
                              if(!capLoaderReq_o.isPartnerPresent() || capLoaderReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 56, column: 5
                                capLoaderReq_o.setREQ(false);//sysj\orchestrator.sysj line: 56, column: 5
                                S117588=1;
                                active[3]=1;
                                ends[3]=1;
                                tdone[3]=1;
                              }
                              else {
                                S117583=0;
                                if(capLoaderReq_o.isACK()){//sysj\orchestrator.sysj line: 56, column: 5
                                  capLoaderReq_o.setVal(true);//sysj\orchestrator.sysj line: 56, column: 5
                                  S117583=1;
                                  if(!capLoaderReq_o.isACK()){//sysj\orchestrator.sysj line: 56, column: 5
                                    capLoaderReq_o.setREQ(false);//sysj\orchestrator.sysj line: 56, column: 5
                                    ends[3]=2;
                                    ;//sysj\orchestrator.sysj line: 56, column: 5
                                    S117581=2;
                                    S117676=0;
                                    if(!capperReq_o.isPartnerPresent() || capperReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 57, column: 5
                                      capperReq_o.setREQ(false);//sysj\orchestrator.sysj line: 57, column: 5
                                      S117676=1;
                                      active[3]=1;
                                      ends[3]=1;
                                      tdone[3]=1;
                                    }
                                    else {
                                      S117671=0;
                                      if(capperReq_o.isACK()){//sysj\orchestrator.sysj line: 57, column: 5
                                        capperReq_o.setVal(true);//sysj\orchestrator.sysj line: 57, column: 5
                                        S117671=1;
                                        if(!capperReq_o.isACK()){//sysj\orchestrator.sysj line: 57, column: 5
                                          capperReq_o.setREQ(false);//sysj\orchestrator.sysj line: 57, column: 5
                                          ends[3]=2;
                                          ;//sysj\orchestrator.sysj line: 57, column: 5
                                          getNextBottle_1.setPresent();//sysj\orchestrator.sysj line: 58, column: 5
                                          currsigs.addElement(getNextBottle_1);
                                          S117536=2;
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
                        S117536=2;
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
            switch(S117581){
              case 0 : 
                switch(S117543){
                  case 0 : 
                    if(!fillerReq_o.isPartnerPresent() || fillerReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 55, column: 5
                      fillerReq_o.setREQ(false);//sysj\orchestrator.sysj line: 55, column: 5
                      S117543=1;
                      active[3]=1;
                      ends[3]=1;
                      tdone[3]=1;
                    }
                    else {
                      switch(S117538){
                        case 0 : 
                          if(fillerReq_o.isACK()){//sysj\orchestrator.sysj line: 55, column: 5
                            fillerReq_o.setVal(true);//sysj\orchestrator.sysj line: 55, column: 5
                            S117538=1;
                            if(!fillerReq_o.isACK()){//sysj\orchestrator.sysj line: 55, column: 5
                              fillerReq_o.setREQ(false);//sysj\orchestrator.sysj line: 55, column: 5
                              ends[3]=2;
                              ;//sysj\orchestrator.sysj line: 55, column: 5
                              S117581=1;
                              S117588=0;
                              if(!capLoaderReq_o.isPartnerPresent() || capLoaderReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 56, column: 5
                                capLoaderReq_o.setREQ(false);//sysj\orchestrator.sysj line: 56, column: 5
                                S117588=1;
                                active[3]=1;
                                ends[3]=1;
                                tdone[3]=1;
                              }
                              else {
                                S117583=0;
                                if(capLoaderReq_o.isACK()){//sysj\orchestrator.sysj line: 56, column: 5
                                  capLoaderReq_o.setVal(true);//sysj\orchestrator.sysj line: 56, column: 5
                                  S117583=1;
                                  if(!capLoaderReq_o.isACK()){//sysj\orchestrator.sysj line: 56, column: 5
                                    capLoaderReq_o.setREQ(false);//sysj\orchestrator.sysj line: 56, column: 5
                                    ends[3]=2;
                                    ;//sysj\orchestrator.sysj line: 56, column: 5
                                    S117581=2;
                                    S117676=0;
                                    if(!capperReq_o.isPartnerPresent() || capperReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 57, column: 5
                                      capperReq_o.setREQ(false);//sysj\orchestrator.sysj line: 57, column: 5
                                      S117676=1;
                                      active[3]=1;
                                      ends[3]=1;
                                      tdone[3]=1;
                                    }
                                    else {
                                      S117671=0;
                                      if(capperReq_o.isACK()){//sysj\orchestrator.sysj line: 57, column: 5
                                        capperReq_o.setVal(true);//sysj\orchestrator.sysj line: 57, column: 5
                                        S117671=1;
                                        if(!capperReq_o.isACK()){//sysj\orchestrator.sysj line: 57, column: 5
                                          capperReq_o.setREQ(false);//sysj\orchestrator.sysj line: 57, column: 5
                                          ends[3]=2;
                                          ;//sysj\orchestrator.sysj line: 57, column: 5
                                          getNextBottle_1.setPresent();//sysj\orchestrator.sysj line: 58, column: 5
                                          currsigs.addElement(getNextBottle_1);
                                          S117536=2;
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
                          if(!fillerReq_o.isACK()){//sysj\orchestrator.sysj line: 55, column: 5
                            fillerReq_o.setREQ(false);//sysj\orchestrator.sysj line: 55, column: 5
                            ends[3]=2;
                            ;//sysj\orchestrator.sysj line: 55, column: 5
                            S117581=1;
                            S117588=0;
                            if(!capLoaderReq_o.isPartnerPresent() || capLoaderReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 56, column: 5
                              capLoaderReq_o.setREQ(false);//sysj\orchestrator.sysj line: 56, column: 5
                              S117588=1;
                              active[3]=1;
                              ends[3]=1;
                              tdone[3]=1;
                            }
                            else {
                              S117583=0;
                              if(capLoaderReq_o.isACK()){//sysj\orchestrator.sysj line: 56, column: 5
                                capLoaderReq_o.setVal(true);//sysj\orchestrator.sysj line: 56, column: 5
                                S117583=1;
                                if(!capLoaderReq_o.isACK()){//sysj\orchestrator.sysj line: 56, column: 5
                                  capLoaderReq_o.setREQ(false);//sysj\orchestrator.sysj line: 56, column: 5
                                  ends[3]=2;
                                  ;//sysj\orchestrator.sysj line: 56, column: 5
                                  S117581=2;
                                  S117676=0;
                                  if(!capperReq_o.isPartnerPresent() || capperReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 57, column: 5
                                    capperReq_o.setREQ(false);//sysj\orchestrator.sysj line: 57, column: 5
                                    S117676=1;
                                    active[3]=1;
                                    ends[3]=1;
                                    tdone[3]=1;
                                  }
                                  else {
                                    S117671=0;
                                    if(capperReq_o.isACK()){//sysj\orchestrator.sysj line: 57, column: 5
                                      capperReq_o.setVal(true);//sysj\orchestrator.sysj line: 57, column: 5
                                      S117671=1;
                                      if(!capperReq_o.isACK()){//sysj\orchestrator.sysj line: 57, column: 5
                                        capperReq_o.setREQ(false);//sysj\orchestrator.sysj line: 57, column: 5
                                        ends[3]=2;
                                        ;//sysj\orchestrator.sysj line: 57, column: 5
                                        getNextBottle_1.setPresent();//sysj\orchestrator.sysj line: 58, column: 5
                                        currsigs.addElement(getNextBottle_1);
                                        S117536=2;
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
                    S117543=1;
                    S117543=0;
                    if(!fillerReq_o.isPartnerPresent() || fillerReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 55, column: 5
                      fillerReq_o.setREQ(false);//sysj\orchestrator.sysj line: 55, column: 5
                      S117543=1;
                      active[3]=1;
                      ends[3]=1;
                      tdone[3]=1;
                    }
                    else {
                      S117538=0;
                      if(fillerReq_o.isACK()){//sysj\orchestrator.sysj line: 55, column: 5
                        fillerReq_o.setVal(true);//sysj\orchestrator.sysj line: 55, column: 5
                        S117538=1;
                        if(!fillerReq_o.isACK()){//sysj\orchestrator.sysj line: 55, column: 5
                          fillerReq_o.setREQ(false);//sysj\orchestrator.sysj line: 55, column: 5
                          ends[3]=2;
                          ;//sysj\orchestrator.sysj line: 55, column: 5
                          S117581=1;
                          S117588=0;
                          if(!capLoaderReq_o.isPartnerPresent() || capLoaderReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 56, column: 5
                            capLoaderReq_o.setREQ(false);//sysj\orchestrator.sysj line: 56, column: 5
                            S117588=1;
                            active[3]=1;
                            ends[3]=1;
                            tdone[3]=1;
                          }
                          else {
                            S117583=0;
                            if(capLoaderReq_o.isACK()){//sysj\orchestrator.sysj line: 56, column: 5
                              capLoaderReq_o.setVal(true);//sysj\orchestrator.sysj line: 56, column: 5
                              S117583=1;
                              if(!capLoaderReq_o.isACK()){//sysj\orchestrator.sysj line: 56, column: 5
                                capLoaderReq_o.setREQ(false);//sysj\orchestrator.sysj line: 56, column: 5
                                ends[3]=2;
                                ;//sysj\orchestrator.sysj line: 56, column: 5
                                S117581=2;
                                S117676=0;
                                if(!capperReq_o.isPartnerPresent() || capperReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 57, column: 5
                                  capperReq_o.setREQ(false);//sysj\orchestrator.sysj line: 57, column: 5
                                  S117676=1;
                                  active[3]=1;
                                  ends[3]=1;
                                  tdone[3]=1;
                                }
                                else {
                                  S117671=0;
                                  if(capperReq_o.isACK()){//sysj\orchestrator.sysj line: 57, column: 5
                                    capperReq_o.setVal(true);//sysj\orchestrator.sysj line: 57, column: 5
                                    S117671=1;
                                    if(!capperReq_o.isACK()){//sysj\orchestrator.sysj line: 57, column: 5
                                      capperReq_o.setREQ(false);//sysj\orchestrator.sysj line: 57, column: 5
                                      ends[3]=2;
                                      ;//sysj\orchestrator.sysj line: 57, column: 5
                                      getNextBottle_1.setPresent();//sysj\orchestrator.sysj line: 58, column: 5
                                      currsigs.addElement(getNextBottle_1);
                                      S117536=2;
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
                switch(S117588){
                  case 0 : 
                    if(!capLoaderReq_o.isPartnerPresent() || capLoaderReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 56, column: 5
                      capLoaderReq_o.setREQ(false);//sysj\orchestrator.sysj line: 56, column: 5
                      S117588=1;
                      active[3]=1;
                      ends[3]=1;
                      tdone[3]=1;
                    }
                    else {
                      switch(S117583){
                        case 0 : 
                          if(capLoaderReq_o.isACK()){//sysj\orchestrator.sysj line: 56, column: 5
                            capLoaderReq_o.setVal(true);//sysj\orchestrator.sysj line: 56, column: 5
                            S117583=1;
                            if(!capLoaderReq_o.isACK()){//sysj\orchestrator.sysj line: 56, column: 5
                              capLoaderReq_o.setREQ(false);//sysj\orchestrator.sysj line: 56, column: 5
                              ends[3]=2;
                              ;//sysj\orchestrator.sysj line: 56, column: 5
                              S117581=2;
                              S117676=0;
                              if(!capperReq_o.isPartnerPresent() || capperReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 57, column: 5
                                capperReq_o.setREQ(false);//sysj\orchestrator.sysj line: 57, column: 5
                                S117676=1;
                                active[3]=1;
                                ends[3]=1;
                                tdone[3]=1;
                              }
                              else {
                                S117671=0;
                                if(capperReq_o.isACK()){//sysj\orchestrator.sysj line: 57, column: 5
                                  capperReq_o.setVal(true);//sysj\orchestrator.sysj line: 57, column: 5
                                  S117671=1;
                                  if(!capperReq_o.isACK()){//sysj\orchestrator.sysj line: 57, column: 5
                                    capperReq_o.setREQ(false);//sysj\orchestrator.sysj line: 57, column: 5
                                    ends[3]=2;
                                    ;//sysj\orchestrator.sysj line: 57, column: 5
                                    getNextBottle_1.setPresent();//sysj\orchestrator.sysj line: 58, column: 5
                                    currsigs.addElement(getNextBottle_1);
                                    S117536=2;
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
                          if(!capLoaderReq_o.isACK()){//sysj\orchestrator.sysj line: 56, column: 5
                            capLoaderReq_o.setREQ(false);//sysj\orchestrator.sysj line: 56, column: 5
                            ends[3]=2;
                            ;//sysj\orchestrator.sysj line: 56, column: 5
                            S117581=2;
                            S117676=0;
                            if(!capperReq_o.isPartnerPresent() || capperReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 57, column: 5
                              capperReq_o.setREQ(false);//sysj\orchestrator.sysj line: 57, column: 5
                              S117676=1;
                              active[3]=1;
                              ends[3]=1;
                              tdone[3]=1;
                            }
                            else {
                              S117671=0;
                              if(capperReq_o.isACK()){//sysj\orchestrator.sysj line: 57, column: 5
                                capperReq_o.setVal(true);//sysj\orchestrator.sysj line: 57, column: 5
                                S117671=1;
                                if(!capperReq_o.isACK()){//sysj\orchestrator.sysj line: 57, column: 5
                                  capperReq_o.setREQ(false);//sysj\orchestrator.sysj line: 57, column: 5
                                  ends[3]=2;
                                  ;//sysj\orchestrator.sysj line: 57, column: 5
                                  getNextBottle_1.setPresent();//sysj\orchestrator.sysj line: 58, column: 5
                                  currsigs.addElement(getNextBottle_1);
                                  S117536=2;
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
                    S117588=1;
                    S117588=0;
                    if(!capLoaderReq_o.isPartnerPresent() || capLoaderReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 56, column: 5
                      capLoaderReq_o.setREQ(false);//sysj\orchestrator.sysj line: 56, column: 5
                      S117588=1;
                      active[3]=1;
                      ends[3]=1;
                      tdone[3]=1;
                    }
                    else {
                      S117583=0;
                      if(capLoaderReq_o.isACK()){//sysj\orchestrator.sysj line: 56, column: 5
                        capLoaderReq_o.setVal(true);//sysj\orchestrator.sysj line: 56, column: 5
                        S117583=1;
                        if(!capLoaderReq_o.isACK()){//sysj\orchestrator.sysj line: 56, column: 5
                          capLoaderReq_o.setREQ(false);//sysj\orchestrator.sysj line: 56, column: 5
                          ends[3]=2;
                          ;//sysj\orchestrator.sysj line: 56, column: 5
                          S117581=2;
                          S117676=0;
                          if(!capperReq_o.isPartnerPresent() || capperReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 57, column: 5
                            capperReq_o.setREQ(false);//sysj\orchestrator.sysj line: 57, column: 5
                            S117676=1;
                            active[3]=1;
                            ends[3]=1;
                            tdone[3]=1;
                          }
                          else {
                            S117671=0;
                            if(capperReq_o.isACK()){//sysj\orchestrator.sysj line: 57, column: 5
                              capperReq_o.setVal(true);//sysj\orchestrator.sysj line: 57, column: 5
                              S117671=1;
                              if(!capperReq_o.isACK()){//sysj\orchestrator.sysj line: 57, column: 5
                                capperReq_o.setREQ(false);//sysj\orchestrator.sysj line: 57, column: 5
                                ends[3]=2;
                                ;//sysj\orchestrator.sysj line: 57, column: 5
                                getNextBottle_1.setPresent();//sysj\orchestrator.sysj line: 58, column: 5
                                currsigs.addElement(getNextBottle_1);
                                S117536=2;
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
                switch(S117676){
                  case 0 : 
                    if(!capperReq_o.isPartnerPresent() || capperReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 57, column: 5
                      capperReq_o.setREQ(false);//sysj\orchestrator.sysj line: 57, column: 5
                      S117676=1;
                      active[3]=1;
                      ends[3]=1;
                      tdone[3]=1;
                    }
                    else {
                      switch(S117671){
                        case 0 : 
                          if(capperReq_o.isACK()){//sysj\orchestrator.sysj line: 57, column: 5
                            capperReq_o.setVal(true);//sysj\orchestrator.sysj line: 57, column: 5
                            S117671=1;
                            if(!capperReq_o.isACK()){//sysj\orchestrator.sysj line: 57, column: 5
                              capperReq_o.setREQ(false);//sysj\orchestrator.sysj line: 57, column: 5
                              ends[3]=2;
                              ;//sysj\orchestrator.sysj line: 57, column: 5
                              getNextBottle_1.setPresent();//sysj\orchestrator.sysj line: 58, column: 5
                              currsigs.addElement(getNextBottle_1);
                              S117536=2;
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
                          if(!capperReq_o.isACK()){//sysj\orchestrator.sysj line: 57, column: 5
                            capperReq_o.setREQ(false);//sysj\orchestrator.sysj line: 57, column: 5
                            ends[3]=2;
                            ;//sysj\orchestrator.sysj line: 57, column: 5
                            getNextBottle_1.setPresent();//sysj\orchestrator.sysj line: 58, column: 5
                            currsigs.addElement(getNextBottle_1);
                            S117536=2;
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
                    S117676=1;
                    S117676=0;
                    if(!capperReq_o.isPartnerPresent() || capperReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 57, column: 5
                      capperReq_o.setREQ(false);//sysj\orchestrator.sysj line: 57, column: 5
                      S117676=1;
                      active[3]=1;
                      ends[3]=1;
                      tdone[3]=1;
                    }
                    else {
                      S117671=0;
                      if(capperReq_o.isACK()){//sysj\orchestrator.sysj line: 57, column: 5
                        capperReq_o.setVal(true);//sysj\orchestrator.sysj line: 57, column: 5
                        S117671=1;
                        if(!capperReq_o.isACK()){//sysj\orchestrator.sysj line: 57, column: 5
                          capperReq_o.setREQ(false);//sysj\orchestrator.sysj line: 57, column: 5
                          ends[3]=2;
                          ;//sysj\orchestrator.sysj line: 57, column: 5
                          getNextBottle_1.setPresent();//sysj\orchestrator.sysj line: 58, column: 5
                          currsigs.addElement(getNextBottle_1);
                          S117536=2;
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
            S117536=2;
            S117536=0;
            S117520=0;
            if(!rotaryStatus_in.isPartnerPresent() || rotaryStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 49, column: 4
              rotaryStatus_in.setACK(false);//sysj\orchestrator.sysj line: 49, column: 4
              S117520=1;
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            else {
              S117515=0;
              if(!rotaryStatus_in.isREQ()){//sysj\orchestrator.sysj line: 49, column: 4
                rotaryStatus_in.setACK(true);//sysj\orchestrator.sysj line: 49, column: 4
                S117515=1;
                if(rotaryStatus_in.isREQ()){//sysj\orchestrator.sysj line: 49, column: 4
                  rotaryStatus_in.setACK(false);//sysj\orchestrator.sysj line: 49, column: 4
                  ends[3]=2;
                  ;//sysj\orchestrator.sysj line: 49, column: 4
                  rotaryStat_thread_3 = (rotaryStatus_in.getVal() == null ? null : ((String)rotaryStatus_in.getVal()));//sysj\orchestrator.sysj line: 50, column: 4
                  S117536=1;
                  if(rotaryStat_thread_3 == "done"){//sysj\orchestrator.sysj line: 53, column: 7
                    System.out.println("rotary done, sending filler,loader,screwer, conveyor reqs");//sysj\orchestrator.sysj line: 54, column: 5
                    S117581=0;
                    S117543=0;
                    if(!fillerReq_o.isPartnerPresent() || fillerReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 55, column: 5
                      fillerReq_o.setREQ(false);//sysj\orchestrator.sysj line: 55, column: 5
                      S117543=1;
                      active[3]=1;
                      ends[3]=1;
                      tdone[3]=1;
                    }
                    else {
                      S117538=0;
                      if(fillerReq_o.isACK()){//sysj\orchestrator.sysj line: 55, column: 5
                        fillerReq_o.setVal(true);//sysj\orchestrator.sysj line: 55, column: 5
                        S117538=1;
                        if(!fillerReq_o.isACK()){//sysj\orchestrator.sysj line: 55, column: 5
                          fillerReq_o.setREQ(false);//sysj\orchestrator.sysj line: 55, column: 5
                          ends[3]=2;
                          ;//sysj\orchestrator.sysj line: 55, column: 5
                          S117581=1;
                          S117588=0;
                          if(!capLoaderReq_o.isPartnerPresent() || capLoaderReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 56, column: 5
                            capLoaderReq_o.setREQ(false);//sysj\orchestrator.sysj line: 56, column: 5
                            S117588=1;
                            active[3]=1;
                            ends[3]=1;
                            tdone[3]=1;
                          }
                          else {
                            S117583=0;
                            if(capLoaderReq_o.isACK()){//sysj\orchestrator.sysj line: 56, column: 5
                              capLoaderReq_o.setVal(true);//sysj\orchestrator.sysj line: 56, column: 5
                              S117583=1;
                              if(!capLoaderReq_o.isACK()){//sysj\orchestrator.sysj line: 56, column: 5
                                capLoaderReq_o.setREQ(false);//sysj\orchestrator.sysj line: 56, column: 5
                                ends[3]=2;
                                ;//sysj\orchestrator.sysj line: 56, column: 5
                                S117581=2;
                                S117676=0;
                                if(!capperReq_o.isPartnerPresent() || capperReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 57, column: 5
                                  capperReq_o.setREQ(false);//sysj\orchestrator.sysj line: 57, column: 5
                                  S117676=1;
                                  active[3]=1;
                                  ends[3]=1;
                                  tdone[3]=1;
                                }
                                else {
                                  S117671=0;
                                  if(capperReq_o.isACK()){//sysj\orchestrator.sysj line: 57, column: 5
                                    capperReq_o.setVal(true);//sysj\orchestrator.sysj line: 57, column: 5
                                    S117671=1;
                                    if(!capperReq_o.isACK()){//sysj\orchestrator.sysj line: 57, column: 5
                                      capperReq_o.setREQ(false);//sysj\orchestrator.sysj line: 57, column: 5
                                      ends[3]=2;
                                      ;//sysj\orchestrator.sysj line: 57, column: 5
                                      getNextBottle_1.setPresent();//sysj\orchestrator.sysj line: 58, column: 5
                                      currsigs.addElement(getNextBottle_1);
                                      S117536=2;
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
                    S117536=2;
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

  public void thread123423(int [] tdone, int [] ends){
        switch(S117513){
      case 0 : 
        active[2]=0;
        ends[2]=0;
        tdone[2]=1;
        break;
      
      case 1 : 
        switch(S115997){
          case 0 : 
            switch(S115739){
              case 0 : 
                switch(S115701){
                  case 0 : 
                    if(!conveyorReq_o.isPartnerPresent() || conveyorReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 32, column: 5
                      conveyorReq_o.setREQ(false);//sysj\orchestrator.sysj line: 32, column: 5
                      S115701=1;
                      active[2]=1;
                      ends[2]=1;
                      tdone[2]=1;
                    }
                    else {
                      switch(S115696){
                        case 0 : 
                          if(conveyorReq_o.isACK()){//sysj\orchestrator.sysj line: 32, column: 5
                            conveyorReq_o.setVal(true);//sysj\orchestrator.sysj line: 32, column: 5
                            S115696=1;
                            if(!conveyorReq_o.isACK()){//sysj\orchestrator.sysj line: 32, column: 5
                              conveyorReq_o.setREQ(false);//sysj\orchestrator.sysj line: 32, column: 5
                              ends[2]=2;
                              ;//sysj\orchestrator.sysj line: 32, column: 5
                              bottlePlaced_thread_2 = bottlePlaced_thread_2 - 1;//sysj\orchestrator.sysj line: 33, column: 5
                              System.out.println(liquidPercent_thread_2.get(3));//sysj\orchestrator.sysj line: 34, column: 5
                              S115739=1;
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
                            S115739=1;
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
                    S115701=1;
                    S115701=0;
                    if(!conveyorReq_o.isPartnerPresent() || conveyorReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 32, column: 5
                      conveyorReq_o.setREQ(false);//sysj\orchestrator.sysj line: 32, column: 5
                      S115701=1;
                      active[2]=1;
                      ends[2]=1;
                      tdone[2]=1;
                    }
                    else {
                      S115696=0;
                      if(conveyorReq_o.isACK()){//sysj\orchestrator.sysj line: 32, column: 5
                        conveyorReq_o.setVal(true);//sysj\orchestrator.sysj line: 32, column: 5
                        S115696=1;
                        if(!conveyorReq_o.isACK()){//sysj\orchestrator.sysj line: 32, column: 5
                          conveyorReq_o.setREQ(false);//sysj\orchestrator.sysj line: 32, column: 5
                          ends[2]=2;
                          ;//sysj\orchestrator.sysj line: 32, column: 5
                          bottlePlaced_thread_2 = bottlePlaced_thread_2 - 1;//sysj\orchestrator.sysj line: 33, column: 5
                          System.out.println(liquidPercent_thread_2.get(3));//sysj\orchestrator.sysj line: 34, column: 5
                          S115739=1;
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
                  S115739=2;
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
                S115739=2;
                if(bottlePlaced_thread_2 >= 0){//sysj\orchestrator.sysj line: 30, column: 10
                  System.out.println("sending conveyor req?");//sysj\orchestrator.sysj line: 31, column: 5
                  S115739=0;
                  S115701=0;
                  if(!conveyorReq_o.isPartnerPresent() || conveyorReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 32, column: 5
                    conveyorReq_o.setREQ(false);//sysj\orchestrator.sysj line: 32, column: 5
                    S115701=1;
                    active[2]=1;
                    ends[2]=1;
                    tdone[2]=1;
                  }
                  else {
                    S115696=0;
                    if(conveyorReq_o.isACK()){//sysj\orchestrator.sysj line: 32, column: 5
                      conveyorReq_o.setVal(true);//sysj\orchestrator.sysj line: 32, column: 5
                      S115696=1;
                      if(!conveyorReq_o.isACK()){//sysj\orchestrator.sysj line: 32, column: 5
                        conveyorReq_o.setREQ(false);//sysj\orchestrator.sysj line: 32, column: 5
                        ends[2]=2;
                        ;//sysj\orchestrator.sysj line: 32, column: 5
                        bottlePlaced_thread_2 = bottlePlaced_thread_2 - 1;//sysj\orchestrator.sysj line: 33, column: 5
                        System.out.println(liquidPercent_thread_2.get(3));//sysj\orchestrator.sysj line: 34, column: 5
                        S115739=1;
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
                  S115997=1;
                  active[2]=1;
                  ends[2]=1;
                  tdone[2]=1;
                }
                break;
              
            }
            break;
          
          case 1 : 
            S115997=1;
            bottlePlaced_thread_2 = quantity_thread_2;//sysj\orchestrator.sysj line: 29, column: 4
            S115997=0;
            if(bottlePlaced_thread_2 >= 0){//sysj\orchestrator.sysj line: 30, column: 10
              System.out.println("sending conveyor req?");//sysj\orchestrator.sysj line: 31, column: 5
              S115739=0;
              S115701=0;
              if(!conveyorReq_o.isPartnerPresent() || conveyorReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 32, column: 5
                conveyorReq_o.setREQ(false);//sysj\orchestrator.sysj line: 32, column: 5
                S115701=1;
                active[2]=1;
                ends[2]=1;
                tdone[2]=1;
              }
              else {
                S115696=0;
                if(conveyorReq_o.isACK()){//sysj\orchestrator.sysj line: 32, column: 5
                  conveyorReq_o.setVal(true);//sysj\orchestrator.sysj line: 32, column: 5
                  S115696=1;
                  if(!conveyorReq_o.isACK()){//sysj\orchestrator.sysj line: 32, column: 5
                    conveyorReq_o.setREQ(false);//sysj\orchestrator.sysj line: 32, column: 5
                    ends[2]=2;
                    ;//sysj\orchestrator.sysj line: 32, column: 5
                    bottlePlaced_thread_2 = bottlePlaced_thread_2 - 1;//sysj\orchestrator.sysj line: 33, column: 5
                    System.out.println(liquidPercent_thread_2.get(3));//sysj\orchestrator.sysj line: 34, column: 5
                    S115739=1;
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
              S115997=1;
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread123421(int [] tdone, int [] ends){
        S123415=1;
    S120887=0;
    S120783=0;
    if(!conveyorStatus_in.isPartnerPresent() || conveyorStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 67, column: 4
      conveyorStatus_in.setACK(false);//sysj\orchestrator.sysj line: 67, column: 4
      S120783=1;
      active[4]=1;
      ends[4]=1;
      tdone[4]=1;
    }
    else {
      S120778=0;
      if(!conveyorStatus_in.isREQ()){//sysj\orchestrator.sysj line: 67, column: 4
        conveyorStatus_in.setACK(true);//sysj\orchestrator.sysj line: 67, column: 4
        S120778=1;
        if(conveyorStatus_in.isREQ()){//sysj\orchestrator.sysj line: 67, column: 4
          conveyorStatus_in.setACK(false);//sysj\orchestrator.sysj line: 67, column: 4
          ends[4]=2;
          ;//sysj\orchestrator.sysj line: 67, column: 4
          S120887=1;
          S120805=0;
          if(!fillerStatus_in.isPartnerPresent() || fillerStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 68, column: 4
            fillerStatus_in.setACK(false);//sysj\orchestrator.sysj line: 68, column: 4
            S120805=1;
            active[4]=1;
            ends[4]=1;
            tdone[4]=1;
          }
          else {
            S120800=0;
            if(!fillerStatus_in.isREQ()){//sysj\orchestrator.sysj line: 68, column: 4
              fillerStatus_in.setACK(true);//sysj\orchestrator.sysj line: 68, column: 4
              S120800=1;
              if(fillerStatus_in.isREQ()){//sysj\orchestrator.sysj line: 68, column: 4
                fillerStatus_in.setACK(false);//sysj\orchestrator.sysj line: 68, column: 4
                ends[4]=2;
                ;//sysj\orchestrator.sysj line: 68, column: 4
                S120887=2;
                S120894=0;
                if(!capLoaderStatus_in.isPartnerPresent() || capLoaderStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 69, column: 4
                  capLoaderStatus_in.setACK(false);//sysj\orchestrator.sysj line: 69, column: 4
                  S120894=1;
                  active[4]=1;
                  ends[4]=1;
                  tdone[4]=1;
                }
                else {
                  S120889=0;
                  if(!capLoaderStatus_in.isREQ()){//sysj\orchestrator.sysj line: 69, column: 4
                    capLoaderStatus_in.setACK(true);//sysj\orchestrator.sysj line: 69, column: 4
                    S120889=1;
                    if(capLoaderStatus_in.isREQ()){//sysj\orchestrator.sysj line: 69, column: 4
                      capLoaderStatus_in.setACK(false);//sysj\orchestrator.sysj line: 69, column: 4
                      ends[4]=2;
                      ;//sysj\orchestrator.sysj line: 69, column: 4
                      S120887=3;
                      S121026=0;
                      if(!capperStatus_in.isPartnerPresent() || capperStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 70, column: 4
                        capperStatus_in.setACK(false);//sysj\orchestrator.sysj line: 70, column: 4
                        S121026=1;
                        active[4]=1;
                        ends[4]=1;
                        tdone[4]=1;
                      }
                      else {
                        S121021=0;
                        if(!capperStatus_in.isREQ()){//sysj\orchestrator.sysj line: 70, column: 4
                          capperStatus_in.setACK(true);//sysj\orchestrator.sysj line: 70, column: 4
                          S121021=1;
                          if(capperStatus_in.isREQ()){//sysj\orchestrator.sysj line: 70, column: 4
                            capperStatus_in.setACK(false);//sysj\orchestrator.sysj line: 70, column: 4
                            ends[4]=2;
                            ;//sysj\orchestrator.sysj line: 70, column: 4
                            conveyStat_thread_4 = (conveyorStatus_in.getVal() == null ? null : ((String)conveyorStatus_in.getVal()));//sysj\orchestrator.sysj line: 72, column: 4
                            fillerStat_thread_4 = (fillerStatus_in.getVal() == null ? null : ((String)fillerStatus_in.getVal()));//sysj\orchestrator.sysj line: 73, column: 4
                            screwerStat_thread_4 = (capLoaderStatus_in.getVal() == null ? null : ((String)capLoaderStatus_in.getVal()));//sysj\orchestrator.sysj line: 74, column: 4
                            loaderStat_thread_4 = (capperStatus_in.getVal() == null ? null : ((String)capperStatus_in.getVal()));//sysj\orchestrator.sysj line: 75, column: 4
                            S120887=4;
                            if((conveyStat_thread_4 == "done" || conveyStat_thread_4 == "idle") && (fillerStat_thread_4 == "done" || fillerStat_thread_4 == "idle") && (screwerStat_thread_4 == "done" || screwerStat_thread_4 == "idle") && (loaderStat_thread_4 == "done" || loaderStat_thread_4 == "idle")){//sysj\orchestrator.sysj line: 78, column: 7
                              System.out.println("sending request to rotary?");//sysj\orchestrator.sysj line: 82, column: 5
                              S121202=0;
                              if(!allOperationsFinished_o.isPartnerPresent() || allOperationsFinished_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 83, column: 5
                                allOperationsFinished_o.setREQ(false);//sysj\orchestrator.sysj line: 83, column: 5
                                S121202=1;
                                active[4]=1;
                                ends[4]=1;
                                tdone[4]=1;
                              }
                              else {
                                S121197=0;
                                if(allOperationsFinished_o.isACK()){//sysj\orchestrator.sysj line: 83, column: 5
                                  allOperationsFinished_o.setVal(true);//sysj\orchestrator.sysj line: 83, column: 5
                                  S121197=1;
                                  if(!allOperationsFinished_o.isACK()){//sysj\orchestrator.sysj line: 83, column: 5
                                    allOperationsFinished_o.setREQ(false);//sysj\orchestrator.sysj line: 83, column: 5
                                    ends[4]=2;
                                    ;//sysj\orchestrator.sysj line: 83, column: 5
                                    S120887=5;
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
                              S120887=5;
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

  public void thread123420(int [] tdone, int [] ends){
        S120776=1;
    S117536=0;
    S117520=0;
    if(!rotaryStatus_in.isPartnerPresent() || rotaryStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 49, column: 4
      rotaryStatus_in.setACK(false);//sysj\orchestrator.sysj line: 49, column: 4
      S117520=1;
      active[3]=1;
      ends[3]=1;
      tdone[3]=1;
    }
    else {
      S117515=0;
      if(!rotaryStatus_in.isREQ()){//sysj\orchestrator.sysj line: 49, column: 4
        rotaryStatus_in.setACK(true);//sysj\orchestrator.sysj line: 49, column: 4
        S117515=1;
        if(rotaryStatus_in.isREQ()){//sysj\orchestrator.sysj line: 49, column: 4
          rotaryStatus_in.setACK(false);//sysj\orchestrator.sysj line: 49, column: 4
          ends[3]=2;
          ;//sysj\orchestrator.sysj line: 49, column: 4
          rotaryStat_thread_3 = (rotaryStatus_in.getVal() == null ? null : ((String)rotaryStatus_in.getVal()));//sysj\orchestrator.sysj line: 50, column: 4
          S117536=1;
          if(rotaryStat_thread_3 == "done"){//sysj\orchestrator.sysj line: 53, column: 7
            System.out.println("rotary done, sending filler,loader,screwer, conveyor reqs");//sysj\orchestrator.sysj line: 54, column: 5
            S117581=0;
            S117543=0;
            if(!fillerReq_o.isPartnerPresent() || fillerReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 55, column: 5
              fillerReq_o.setREQ(false);//sysj\orchestrator.sysj line: 55, column: 5
              S117543=1;
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            else {
              S117538=0;
              if(fillerReq_o.isACK()){//sysj\orchestrator.sysj line: 55, column: 5
                fillerReq_o.setVal(true);//sysj\orchestrator.sysj line: 55, column: 5
                S117538=1;
                if(!fillerReq_o.isACK()){//sysj\orchestrator.sysj line: 55, column: 5
                  fillerReq_o.setREQ(false);//sysj\orchestrator.sysj line: 55, column: 5
                  ends[3]=2;
                  ;//sysj\orchestrator.sysj line: 55, column: 5
                  S117581=1;
                  S117588=0;
                  if(!capLoaderReq_o.isPartnerPresent() || capLoaderReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 56, column: 5
                    capLoaderReq_o.setREQ(false);//sysj\orchestrator.sysj line: 56, column: 5
                    S117588=1;
                    active[3]=1;
                    ends[3]=1;
                    tdone[3]=1;
                  }
                  else {
                    S117583=0;
                    if(capLoaderReq_o.isACK()){//sysj\orchestrator.sysj line: 56, column: 5
                      capLoaderReq_o.setVal(true);//sysj\orchestrator.sysj line: 56, column: 5
                      S117583=1;
                      if(!capLoaderReq_o.isACK()){//sysj\orchestrator.sysj line: 56, column: 5
                        capLoaderReq_o.setREQ(false);//sysj\orchestrator.sysj line: 56, column: 5
                        ends[3]=2;
                        ;//sysj\orchestrator.sysj line: 56, column: 5
                        S117581=2;
                        S117676=0;
                        if(!capperReq_o.isPartnerPresent() || capperReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 57, column: 5
                          capperReq_o.setREQ(false);//sysj\orchestrator.sysj line: 57, column: 5
                          S117676=1;
                          active[3]=1;
                          ends[3]=1;
                          tdone[3]=1;
                        }
                        else {
                          S117671=0;
                          if(capperReq_o.isACK()){//sysj\orchestrator.sysj line: 57, column: 5
                            capperReq_o.setVal(true);//sysj\orchestrator.sysj line: 57, column: 5
                            S117671=1;
                            if(!capperReq_o.isACK()){//sysj\orchestrator.sysj line: 57, column: 5
                              capperReq_o.setREQ(false);//sysj\orchestrator.sysj line: 57, column: 5
                              ends[3]=2;
                              ;//sysj\orchestrator.sysj line: 57, column: 5
                              getNextBottle_1.setPresent();//sysj\orchestrator.sysj line: 58, column: 5
                              currsigs.addElement(getNextBottle_1);
                              S117536=2;
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
            S117536=2;
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

  public void thread123419(int [] tdone, int [] ends){
        S117513=1;
    quantity_thread_2 = 5;//sysj\orchestrator.sysj line: 20, column: 3
    bottlePlaced_thread_2 = 0;//sysj\orchestrator.sysj line: 21, column: 3
    liquidPercent_thread_2 = new ArrayList();//sysj\orchestrator.sysj line: 22, column: 3
    liquidPercent_thread_2.add(10);//sysj\orchestrator.sysj line: 23, column: 3
    liquidPercent_thread_2.add(10);//sysj\orchestrator.sysj line: 24, column: 3
    liquidPercent_thread_2.add(20);//sysj\orchestrator.sysj line: 25, column: 3
    liquidPercent_thread_2.add(60);//sysj\orchestrator.sysj line: 26, column: 3
    bottlePlaced_thread_2 = quantity_thread_2;//sysj\orchestrator.sysj line: 29, column: 4
    S115997=0;
    if(bottlePlaced_thread_2 >= 0){//sysj\orchestrator.sysj line: 30, column: 10
      System.out.println("sending conveyor req?");//sysj\orchestrator.sysj line: 31, column: 5
      S115739=0;
      S115701=0;
      if(!conveyorReq_o.isPartnerPresent() || conveyorReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 32, column: 5
        conveyorReq_o.setREQ(false);//sysj\orchestrator.sysj line: 32, column: 5
        S115701=1;
        active[2]=1;
        ends[2]=1;
        tdone[2]=1;
      }
      else {
        S115696=0;
        if(conveyorReq_o.isACK()){//sysj\orchestrator.sysj line: 32, column: 5
          conveyorReq_o.setVal(true);//sysj\orchestrator.sysj line: 32, column: 5
          S115696=1;
          if(!conveyorReq_o.isACK()){//sysj\orchestrator.sysj line: 32, column: 5
            conveyorReq_o.setREQ(false);//sysj\orchestrator.sysj line: 32, column: 5
            ends[2]=2;
            ;//sysj\orchestrator.sysj line: 32, column: 5
            bottlePlaced_thread_2 = bottlePlaced_thread_2 - 1;//sysj\orchestrator.sysj line: 33, column: 5
            System.out.println(liquidPercent_thread_2.get(3));//sysj\orchestrator.sysj line: 34, column: 5
            S115739=1;
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
      S115997=1;
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
      switch(S123417){
        case 0 : 
          S123417=0;
          break RUN;
        
        case 1 : 
          S123417=2;
          S123417=2;
          getNextBottle_1.setClear();//sysj\orchestrator.sysj line: 16, column: 2
          thread123419(tdone,ends);
          thread123420(tdone,ends);
          thread123421(tdone,ends);
          int biggest123422 = 0;
          if(ends[2]>=biggest123422){
            biggest123422=ends[2];
          }
          if(ends[3]>=biggest123422){
            biggest123422=ends[3];
          }
          if(ends[4]>=biggest123422){
            biggest123422=ends[4];
          }
          if(biggest123422 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
        
        case 2 : 
          getNextBottle_1.setClear();//sysj\orchestrator.sysj line: 16, column: 2
          thread123423(tdone,ends);
          thread123424(tdone,ends);
          thread123425(tdone,ends);
          int biggest123426 = 0;
          if(ends[2]>=biggest123426){
            biggest123426=ends[2];
          }
          if(ends[3]>=biggest123426){
            biggest123426=ends[3];
          }
          if(ends[4]>=biggest123426){
            biggest123426=ends[4];
          }
          if(biggest123426 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
          //FINXME code
          if(biggest123426 == 0){
            S123417=0;
            active[1]=0;
            ends[1]=0;
            S123417=0;
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
