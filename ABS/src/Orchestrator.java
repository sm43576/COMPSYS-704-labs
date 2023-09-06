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
  private String conveyStat_thread_4;//sysj\orchestrator.sysj line: 78, column: 4
  private String fillerStat_thread_4;//sysj\orchestrator.sysj line: 79, column: 4
  private String screwerStat_thread_4;//sysj\orchestrator.sysj line: 80, column: 4
  private String loaderStat_thread_4;//sysj\orchestrator.sysj line: 81, column: 4
  private int S121305 = 1;
  private int S115401 = 1;
  private int S113885 = 1;
  private int S113627 = 1;
  private int S113589 = 1;
  private int S113584 = 1;
  private int S118664 = 1;
  private int S115424 = 1;
  private int S115408 = 1;
  private int S115403 = 1;
  private int S115469 = 1;
  private int S115431 = 1;
  private int S115426 = 1;
  private int S115476 = 1;
  private int S115471 = 1;
  private int S115564 = 1;
  private int S115559 = 1;
  private int S121303 = 1;
  private int S118687 = 1;
  private int S118671 = 1;
  private int S118666 = 1;
  private int S118694 = 1;
  private int S118689 = 1;
  private int S118782 = 1;
  private int S118777 = 1;
  private int S118914 = 1;
  private int S118909 = 1;
  private int S119090 = 1;
  private int S119085 = 1;
  
  private int[] ends = new int[5];
  private int[] tdone = new int[5];
  
  public void thread121313(int [] tdone, int [] ends){
        switch(S121303){
      case 0 : 
        active[4]=0;
        ends[4]=0;
        tdone[4]=1;
        break;
      
      case 1 : 
        switch(S118687){
          case 0 : 
            switch(S118671){
              case 0 : 
                if(!conveyorStatus_in.isPartnerPresent() || conveyorStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 67, column: 4
                  conveyorStatus_in.setACK(false);//sysj\orchestrator.sysj line: 67, column: 4
                  S118671=1;
                  active[4]=1;
                  ends[4]=1;
                  tdone[4]=1;
                }
                else {
                  switch(S118666){
                    case 0 : 
                      if(!conveyorStatus_in.isREQ()){//sysj\orchestrator.sysj line: 67, column: 4
                        conveyorStatus_in.setACK(true);//sysj\orchestrator.sysj line: 67, column: 4
                        S118666=1;
                        if(conveyorStatus_in.isREQ()){//sysj\orchestrator.sysj line: 67, column: 4
                          conveyorStatus_in.setACK(false);//sysj\orchestrator.sysj line: 67, column: 4
                          ends[4]=2;
                          ;//sysj\orchestrator.sysj line: 67, column: 4
                          System.out.println("Received conveyor status");//sysj\orchestrator.sysj line: 68, column: 4
                          S118687=1;
                          S118694=0;
                          if(!fillerStatus_in.isPartnerPresent() || fillerStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 69, column: 4
                            fillerStatus_in.setACK(false);//sysj\orchestrator.sysj line: 69, column: 4
                            S118694=1;
                            active[4]=1;
                            ends[4]=1;
                            tdone[4]=1;
                          }
                          else {
                            S118689=0;
                            if(!fillerStatus_in.isREQ()){//sysj\orchestrator.sysj line: 69, column: 4
                              fillerStatus_in.setACK(true);//sysj\orchestrator.sysj line: 69, column: 4
                              S118689=1;
                              if(fillerStatus_in.isREQ()){//sysj\orchestrator.sysj line: 69, column: 4
                                fillerStatus_in.setACK(false);//sysj\orchestrator.sysj line: 69, column: 4
                                ends[4]=2;
                                ;//sysj\orchestrator.sysj line: 69, column: 4
                                System.out.println("Received filler status");//sysj\orchestrator.sysj line: 70, column: 4
                                S118687=2;
                                S118782=0;
                                if(!capLoaderStatus_in.isPartnerPresent() || capLoaderStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 72, column: 4
                                  capLoaderStatus_in.setACK(false);//sysj\orchestrator.sysj line: 72, column: 4
                                  S118782=1;
                                  active[4]=1;
                                  ends[4]=1;
                                  tdone[4]=1;
                                }
                                else {
                                  S118777=0;
                                  if(!capLoaderStatus_in.isREQ()){//sysj\orchestrator.sysj line: 72, column: 4
                                    capLoaderStatus_in.setACK(true);//sysj\orchestrator.sysj line: 72, column: 4
                                    S118777=1;
                                    if(capLoaderStatus_in.isREQ()){//sysj\orchestrator.sysj line: 72, column: 4
                                      capLoaderStatus_in.setACK(false);//sysj\orchestrator.sysj line: 72, column: 4
                                      ends[4]=2;
                                      ;//sysj\orchestrator.sysj line: 72, column: 4
                                      System.out.println("Received caploader status");//sysj\orchestrator.sysj line: 73, column: 4
                                      S118687=3;
                                      S118914=0;
                                      if(!capperStatus_in.isPartnerPresent() || capperStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 74, column: 4
                                        capperStatus_in.setACK(false);//sysj\orchestrator.sysj line: 74, column: 4
                                        S118914=1;
                                        active[4]=1;
                                        ends[4]=1;
                                        tdone[4]=1;
                                      }
                                      else {
                                        S118909=0;
                                        if(!capperStatus_in.isREQ()){//sysj\orchestrator.sysj line: 74, column: 4
                                          capperStatus_in.setACK(true);//sysj\orchestrator.sysj line: 74, column: 4
                                          S118909=1;
                                          if(capperStatus_in.isREQ()){//sysj\orchestrator.sysj line: 74, column: 4
                                            capperStatus_in.setACK(false);//sysj\orchestrator.sysj line: 74, column: 4
                                            ends[4]=2;
                                            ;//sysj\orchestrator.sysj line: 74, column: 4
                                            System.out.println("Received capper status");//sysj\orchestrator.sysj line: 75, column: 4
                                            System.out.println("All is received");//sysj\orchestrator.sysj line: 76, column: 4
                                            conveyStat_thread_4 = (conveyorStatus_in.getVal() == null ? null : ((String)conveyorStatus_in.getVal()));//sysj\orchestrator.sysj line: 78, column: 4
                                            fillerStat_thread_4 = (fillerStatus_in.getVal() == null ? null : ((String)fillerStatus_in.getVal()));//sysj\orchestrator.sysj line: 79, column: 4
                                            screwerStat_thread_4 = (capLoaderStatus_in.getVal() == null ? null : ((String)capLoaderStatus_in.getVal()));//sysj\orchestrator.sysj line: 80, column: 4
                                            loaderStat_thread_4 = (capperStatus_in.getVal() == null ? null : ((String)capperStatus_in.getVal()));//sysj\orchestrator.sysj line: 81, column: 4
                                            S118687=4;
                                            if((conveyStat_thread_4 == "done" || conveyStat_thread_4 == "idle") && (fillerStat_thread_4 == "done" || fillerStat_thread_4 == "idle") && (screwerStat_thread_4 == "done" || screwerStat_thread_4 == "idle") && (loaderStat_thread_4 == "done" || loaderStat_thread_4 == "idle")){//sysj\orchestrator.sysj line: 84, column: 7
                                              System.out.println("sending request to rotary?");//sysj\orchestrator.sysj line: 88, column: 5
                                              S119090=0;
                                              if(!allOperationsFinished_o.isPartnerPresent() || allOperationsFinished_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 89, column: 5
                                                allOperationsFinished_o.setREQ(false);//sysj\orchestrator.sysj line: 89, column: 5
                                                S119090=1;
                                                active[4]=1;
                                                ends[4]=1;
                                                tdone[4]=1;
                                              }
                                              else {
                                                S119085=0;
                                                if(allOperationsFinished_o.isACK()){//sysj\orchestrator.sysj line: 89, column: 5
                                                  allOperationsFinished_o.setVal(true);//sysj\orchestrator.sysj line: 89, column: 5
                                                  S119085=1;
                                                  if(!allOperationsFinished_o.isACK()){//sysj\orchestrator.sysj line: 89, column: 5
                                                    allOperationsFinished_o.setREQ(false);//sysj\orchestrator.sysj line: 89, column: 5
                                                    ends[4]=2;
                                                    ;//sysj\orchestrator.sysj line: 89, column: 5
                                                    S118687=5;
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
                                              S118687=5;
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
                        System.out.println("Received conveyor status");//sysj\orchestrator.sysj line: 68, column: 4
                        S118687=1;
                        S118694=0;
                        if(!fillerStatus_in.isPartnerPresent() || fillerStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 69, column: 4
                          fillerStatus_in.setACK(false);//sysj\orchestrator.sysj line: 69, column: 4
                          S118694=1;
                          active[4]=1;
                          ends[4]=1;
                          tdone[4]=1;
                        }
                        else {
                          S118689=0;
                          if(!fillerStatus_in.isREQ()){//sysj\orchestrator.sysj line: 69, column: 4
                            fillerStatus_in.setACK(true);//sysj\orchestrator.sysj line: 69, column: 4
                            S118689=1;
                            if(fillerStatus_in.isREQ()){//sysj\orchestrator.sysj line: 69, column: 4
                              fillerStatus_in.setACK(false);//sysj\orchestrator.sysj line: 69, column: 4
                              ends[4]=2;
                              ;//sysj\orchestrator.sysj line: 69, column: 4
                              System.out.println("Received filler status");//sysj\orchestrator.sysj line: 70, column: 4
                              S118687=2;
                              S118782=0;
                              if(!capLoaderStatus_in.isPartnerPresent() || capLoaderStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 72, column: 4
                                capLoaderStatus_in.setACK(false);//sysj\orchestrator.sysj line: 72, column: 4
                                S118782=1;
                                active[4]=1;
                                ends[4]=1;
                                tdone[4]=1;
                              }
                              else {
                                S118777=0;
                                if(!capLoaderStatus_in.isREQ()){//sysj\orchestrator.sysj line: 72, column: 4
                                  capLoaderStatus_in.setACK(true);//sysj\orchestrator.sysj line: 72, column: 4
                                  S118777=1;
                                  if(capLoaderStatus_in.isREQ()){//sysj\orchestrator.sysj line: 72, column: 4
                                    capLoaderStatus_in.setACK(false);//sysj\orchestrator.sysj line: 72, column: 4
                                    ends[4]=2;
                                    ;//sysj\orchestrator.sysj line: 72, column: 4
                                    System.out.println("Received caploader status");//sysj\orchestrator.sysj line: 73, column: 4
                                    S118687=3;
                                    S118914=0;
                                    if(!capperStatus_in.isPartnerPresent() || capperStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 74, column: 4
                                      capperStatus_in.setACK(false);//sysj\orchestrator.sysj line: 74, column: 4
                                      S118914=1;
                                      active[4]=1;
                                      ends[4]=1;
                                      tdone[4]=1;
                                    }
                                    else {
                                      S118909=0;
                                      if(!capperStatus_in.isREQ()){//sysj\orchestrator.sysj line: 74, column: 4
                                        capperStatus_in.setACK(true);//sysj\orchestrator.sysj line: 74, column: 4
                                        S118909=1;
                                        if(capperStatus_in.isREQ()){//sysj\orchestrator.sysj line: 74, column: 4
                                          capperStatus_in.setACK(false);//sysj\orchestrator.sysj line: 74, column: 4
                                          ends[4]=2;
                                          ;//sysj\orchestrator.sysj line: 74, column: 4
                                          System.out.println("Received capper status");//sysj\orchestrator.sysj line: 75, column: 4
                                          System.out.println("All is received");//sysj\orchestrator.sysj line: 76, column: 4
                                          conveyStat_thread_4 = (conveyorStatus_in.getVal() == null ? null : ((String)conveyorStatus_in.getVal()));//sysj\orchestrator.sysj line: 78, column: 4
                                          fillerStat_thread_4 = (fillerStatus_in.getVal() == null ? null : ((String)fillerStatus_in.getVal()));//sysj\orchestrator.sysj line: 79, column: 4
                                          screwerStat_thread_4 = (capLoaderStatus_in.getVal() == null ? null : ((String)capLoaderStatus_in.getVal()));//sysj\orchestrator.sysj line: 80, column: 4
                                          loaderStat_thread_4 = (capperStatus_in.getVal() == null ? null : ((String)capperStatus_in.getVal()));//sysj\orchestrator.sysj line: 81, column: 4
                                          S118687=4;
                                          if((conveyStat_thread_4 == "done" || conveyStat_thread_4 == "idle") && (fillerStat_thread_4 == "done" || fillerStat_thread_4 == "idle") && (screwerStat_thread_4 == "done" || screwerStat_thread_4 == "idle") && (loaderStat_thread_4 == "done" || loaderStat_thread_4 == "idle")){//sysj\orchestrator.sysj line: 84, column: 7
                                            System.out.println("sending request to rotary?");//sysj\orchestrator.sysj line: 88, column: 5
                                            S119090=0;
                                            if(!allOperationsFinished_o.isPartnerPresent() || allOperationsFinished_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 89, column: 5
                                              allOperationsFinished_o.setREQ(false);//sysj\orchestrator.sysj line: 89, column: 5
                                              S119090=1;
                                              active[4]=1;
                                              ends[4]=1;
                                              tdone[4]=1;
                                            }
                                            else {
                                              S119085=0;
                                              if(allOperationsFinished_o.isACK()){//sysj\orchestrator.sysj line: 89, column: 5
                                                allOperationsFinished_o.setVal(true);//sysj\orchestrator.sysj line: 89, column: 5
                                                S119085=1;
                                                if(!allOperationsFinished_o.isACK()){//sysj\orchestrator.sysj line: 89, column: 5
                                                  allOperationsFinished_o.setREQ(false);//sysj\orchestrator.sysj line: 89, column: 5
                                                  ends[4]=2;
                                                  ;//sysj\orchestrator.sysj line: 89, column: 5
                                                  S118687=5;
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
                                            S118687=5;
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
                S118671=1;
                S118671=0;
                if(!conveyorStatus_in.isPartnerPresent() || conveyorStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 67, column: 4
                  conveyorStatus_in.setACK(false);//sysj\orchestrator.sysj line: 67, column: 4
                  S118671=1;
                  active[4]=1;
                  ends[4]=1;
                  tdone[4]=1;
                }
                else {
                  S118666=0;
                  if(!conveyorStatus_in.isREQ()){//sysj\orchestrator.sysj line: 67, column: 4
                    conveyorStatus_in.setACK(true);//sysj\orchestrator.sysj line: 67, column: 4
                    S118666=1;
                    if(conveyorStatus_in.isREQ()){//sysj\orchestrator.sysj line: 67, column: 4
                      conveyorStatus_in.setACK(false);//sysj\orchestrator.sysj line: 67, column: 4
                      ends[4]=2;
                      ;//sysj\orchestrator.sysj line: 67, column: 4
                      System.out.println("Received conveyor status");//sysj\orchestrator.sysj line: 68, column: 4
                      S118687=1;
                      S118694=0;
                      if(!fillerStatus_in.isPartnerPresent() || fillerStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 69, column: 4
                        fillerStatus_in.setACK(false);//sysj\orchestrator.sysj line: 69, column: 4
                        S118694=1;
                        active[4]=1;
                        ends[4]=1;
                        tdone[4]=1;
                      }
                      else {
                        S118689=0;
                        if(!fillerStatus_in.isREQ()){//sysj\orchestrator.sysj line: 69, column: 4
                          fillerStatus_in.setACK(true);//sysj\orchestrator.sysj line: 69, column: 4
                          S118689=1;
                          if(fillerStatus_in.isREQ()){//sysj\orchestrator.sysj line: 69, column: 4
                            fillerStatus_in.setACK(false);//sysj\orchestrator.sysj line: 69, column: 4
                            ends[4]=2;
                            ;//sysj\orchestrator.sysj line: 69, column: 4
                            System.out.println("Received filler status");//sysj\orchestrator.sysj line: 70, column: 4
                            S118687=2;
                            S118782=0;
                            if(!capLoaderStatus_in.isPartnerPresent() || capLoaderStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 72, column: 4
                              capLoaderStatus_in.setACK(false);//sysj\orchestrator.sysj line: 72, column: 4
                              S118782=1;
                              active[4]=1;
                              ends[4]=1;
                              tdone[4]=1;
                            }
                            else {
                              S118777=0;
                              if(!capLoaderStatus_in.isREQ()){//sysj\orchestrator.sysj line: 72, column: 4
                                capLoaderStatus_in.setACK(true);//sysj\orchestrator.sysj line: 72, column: 4
                                S118777=1;
                                if(capLoaderStatus_in.isREQ()){//sysj\orchestrator.sysj line: 72, column: 4
                                  capLoaderStatus_in.setACK(false);//sysj\orchestrator.sysj line: 72, column: 4
                                  ends[4]=2;
                                  ;//sysj\orchestrator.sysj line: 72, column: 4
                                  System.out.println("Received caploader status");//sysj\orchestrator.sysj line: 73, column: 4
                                  S118687=3;
                                  S118914=0;
                                  if(!capperStatus_in.isPartnerPresent() || capperStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 74, column: 4
                                    capperStatus_in.setACK(false);//sysj\orchestrator.sysj line: 74, column: 4
                                    S118914=1;
                                    active[4]=1;
                                    ends[4]=1;
                                    tdone[4]=1;
                                  }
                                  else {
                                    S118909=0;
                                    if(!capperStatus_in.isREQ()){//sysj\orchestrator.sysj line: 74, column: 4
                                      capperStatus_in.setACK(true);//sysj\orchestrator.sysj line: 74, column: 4
                                      S118909=1;
                                      if(capperStatus_in.isREQ()){//sysj\orchestrator.sysj line: 74, column: 4
                                        capperStatus_in.setACK(false);//sysj\orchestrator.sysj line: 74, column: 4
                                        ends[4]=2;
                                        ;//sysj\orchestrator.sysj line: 74, column: 4
                                        System.out.println("Received capper status");//sysj\orchestrator.sysj line: 75, column: 4
                                        System.out.println("All is received");//sysj\orchestrator.sysj line: 76, column: 4
                                        conveyStat_thread_4 = (conveyorStatus_in.getVal() == null ? null : ((String)conveyorStatus_in.getVal()));//sysj\orchestrator.sysj line: 78, column: 4
                                        fillerStat_thread_4 = (fillerStatus_in.getVal() == null ? null : ((String)fillerStatus_in.getVal()));//sysj\orchestrator.sysj line: 79, column: 4
                                        screwerStat_thread_4 = (capLoaderStatus_in.getVal() == null ? null : ((String)capLoaderStatus_in.getVal()));//sysj\orchestrator.sysj line: 80, column: 4
                                        loaderStat_thread_4 = (capperStatus_in.getVal() == null ? null : ((String)capperStatus_in.getVal()));//sysj\orchestrator.sysj line: 81, column: 4
                                        S118687=4;
                                        if((conveyStat_thread_4 == "done" || conveyStat_thread_4 == "idle") && (fillerStat_thread_4 == "done" || fillerStat_thread_4 == "idle") && (screwerStat_thread_4 == "done" || screwerStat_thread_4 == "idle") && (loaderStat_thread_4 == "done" || loaderStat_thread_4 == "idle")){//sysj\orchestrator.sysj line: 84, column: 7
                                          System.out.println("sending request to rotary?");//sysj\orchestrator.sysj line: 88, column: 5
                                          S119090=0;
                                          if(!allOperationsFinished_o.isPartnerPresent() || allOperationsFinished_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 89, column: 5
                                            allOperationsFinished_o.setREQ(false);//sysj\orchestrator.sysj line: 89, column: 5
                                            S119090=1;
                                            active[4]=1;
                                            ends[4]=1;
                                            tdone[4]=1;
                                          }
                                          else {
                                            S119085=0;
                                            if(allOperationsFinished_o.isACK()){//sysj\orchestrator.sysj line: 89, column: 5
                                              allOperationsFinished_o.setVal(true);//sysj\orchestrator.sysj line: 89, column: 5
                                              S119085=1;
                                              if(!allOperationsFinished_o.isACK()){//sysj\orchestrator.sysj line: 89, column: 5
                                                allOperationsFinished_o.setREQ(false);//sysj\orchestrator.sysj line: 89, column: 5
                                                ends[4]=2;
                                                ;//sysj\orchestrator.sysj line: 89, column: 5
                                                S118687=5;
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
                                          S118687=5;
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
            switch(S118694){
              case 0 : 
                if(!fillerStatus_in.isPartnerPresent() || fillerStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 69, column: 4
                  fillerStatus_in.setACK(false);//sysj\orchestrator.sysj line: 69, column: 4
                  S118694=1;
                  active[4]=1;
                  ends[4]=1;
                  tdone[4]=1;
                }
                else {
                  switch(S118689){
                    case 0 : 
                      if(!fillerStatus_in.isREQ()){//sysj\orchestrator.sysj line: 69, column: 4
                        fillerStatus_in.setACK(true);//sysj\orchestrator.sysj line: 69, column: 4
                        S118689=1;
                        if(fillerStatus_in.isREQ()){//sysj\orchestrator.sysj line: 69, column: 4
                          fillerStatus_in.setACK(false);//sysj\orchestrator.sysj line: 69, column: 4
                          ends[4]=2;
                          ;//sysj\orchestrator.sysj line: 69, column: 4
                          System.out.println("Received filler status");//sysj\orchestrator.sysj line: 70, column: 4
                          S118687=2;
                          S118782=0;
                          if(!capLoaderStatus_in.isPartnerPresent() || capLoaderStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 72, column: 4
                            capLoaderStatus_in.setACK(false);//sysj\orchestrator.sysj line: 72, column: 4
                            S118782=1;
                            active[4]=1;
                            ends[4]=1;
                            tdone[4]=1;
                          }
                          else {
                            S118777=0;
                            if(!capLoaderStatus_in.isREQ()){//sysj\orchestrator.sysj line: 72, column: 4
                              capLoaderStatus_in.setACK(true);//sysj\orchestrator.sysj line: 72, column: 4
                              S118777=1;
                              if(capLoaderStatus_in.isREQ()){//sysj\orchestrator.sysj line: 72, column: 4
                                capLoaderStatus_in.setACK(false);//sysj\orchestrator.sysj line: 72, column: 4
                                ends[4]=2;
                                ;//sysj\orchestrator.sysj line: 72, column: 4
                                System.out.println("Received caploader status");//sysj\orchestrator.sysj line: 73, column: 4
                                S118687=3;
                                S118914=0;
                                if(!capperStatus_in.isPartnerPresent() || capperStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 74, column: 4
                                  capperStatus_in.setACK(false);//sysj\orchestrator.sysj line: 74, column: 4
                                  S118914=1;
                                  active[4]=1;
                                  ends[4]=1;
                                  tdone[4]=1;
                                }
                                else {
                                  S118909=0;
                                  if(!capperStatus_in.isREQ()){//sysj\orchestrator.sysj line: 74, column: 4
                                    capperStatus_in.setACK(true);//sysj\orchestrator.sysj line: 74, column: 4
                                    S118909=1;
                                    if(capperStatus_in.isREQ()){//sysj\orchestrator.sysj line: 74, column: 4
                                      capperStatus_in.setACK(false);//sysj\orchestrator.sysj line: 74, column: 4
                                      ends[4]=2;
                                      ;//sysj\orchestrator.sysj line: 74, column: 4
                                      System.out.println("Received capper status");//sysj\orchestrator.sysj line: 75, column: 4
                                      System.out.println("All is received");//sysj\orchestrator.sysj line: 76, column: 4
                                      conveyStat_thread_4 = (conveyorStatus_in.getVal() == null ? null : ((String)conveyorStatus_in.getVal()));//sysj\orchestrator.sysj line: 78, column: 4
                                      fillerStat_thread_4 = (fillerStatus_in.getVal() == null ? null : ((String)fillerStatus_in.getVal()));//sysj\orchestrator.sysj line: 79, column: 4
                                      screwerStat_thread_4 = (capLoaderStatus_in.getVal() == null ? null : ((String)capLoaderStatus_in.getVal()));//sysj\orchestrator.sysj line: 80, column: 4
                                      loaderStat_thread_4 = (capperStatus_in.getVal() == null ? null : ((String)capperStatus_in.getVal()));//sysj\orchestrator.sysj line: 81, column: 4
                                      S118687=4;
                                      if((conveyStat_thread_4 == "done" || conveyStat_thread_4 == "idle") && (fillerStat_thread_4 == "done" || fillerStat_thread_4 == "idle") && (screwerStat_thread_4 == "done" || screwerStat_thread_4 == "idle") && (loaderStat_thread_4 == "done" || loaderStat_thread_4 == "idle")){//sysj\orchestrator.sysj line: 84, column: 7
                                        System.out.println("sending request to rotary?");//sysj\orchestrator.sysj line: 88, column: 5
                                        S119090=0;
                                        if(!allOperationsFinished_o.isPartnerPresent() || allOperationsFinished_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 89, column: 5
                                          allOperationsFinished_o.setREQ(false);//sysj\orchestrator.sysj line: 89, column: 5
                                          S119090=1;
                                          active[4]=1;
                                          ends[4]=1;
                                          tdone[4]=1;
                                        }
                                        else {
                                          S119085=0;
                                          if(allOperationsFinished_o.isACK()){//sysj\orchestrator.sysj line: 89, column: 5
                                            allOperationsFinished_o.setVal(true);//sysj\orchestrator.sysj line: 89, column: 5
                                            S119085=1;
                                            if(!allOperationsFinished_o.isACK()){//sysj\orchestrator.sysj line: 89, column: 5
                                              allOperationsFinished_o.setREQ(false);//sysj\orchestrator.sysj line: 89, column: 5
                                              ends[4]=2;
                                              ;//sysj\orchestrator.sysj line: 89, column: 5
                                              S118687=5;
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
                                        S118687=5;
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
                      if(fillerStatus_in.isREQ()){//sysj\orchestrator.sysj line: 69, column: 4
                        fillerStatus_in.setACK(false);//sysj\orchestrator.sysj line: 69, column: 4
                        ends[4]=2;
                        ;//sysj\orchestrator.sysj line: 69, column: 4
                        System.out.println("Received filler status");//sysj\orchestrator.sysj line: 70, column: 4
                        S118687=2;
                        S118782=0;
                        if(!capLoaderStatus_in.isPartnerPresent() || capLoaderStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 72, column: 4
                          capLoaderStatus_in.setACK(false);//sysj\orchestrator.sysj line: 72, column: 4
                          S118782=1;
                          active[4]=1;
                          ends[4]=1;
                          tdone[4]=1;
                        }
                        else {
                          S118777=0;
                          if(!capLoaderStatus_in.isREQ()){//sysj\orchestrator.sysj line: 72, column: 4
                            capLoaderStatus_in.setACK(true);//sysj\orchestrator.sysj line: 72, column: 4
                            S118777=1;
                            if(capLoaderStatus_in.isREQ()){//sysj\orchestrator.sysj line: 72, column: 4
                              capLoaderStatus_in.setACK(false);//sysj\orchestrator.sysj line: 72, column: 4
                              ends[4]=2;
                              ;//sysj\orchestrator.sysj line: 72, column: 4
                              System.out.println("Received caploader status");//sysj\orchestrator.sysj line: 73, column: 4
                              S118687=3;
                              S118914=0;
                              if(!capperStatus_in.isPartnerPresent() || capperStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 74, column: 4
                                capperStatus_in.setACK(false);//sysj\orchestrator.sysj line: 74, column: 4
                                S118914=1;
                                active[4]=1;
                                ends[4]=1;
                                tdone[4]=1;
                              }
                              else {
                                S118909=0;
                                if(!capperStatus_in.isREQ()){//sysj\orchestrator.sysj line: 74, column: 4
                                  capperStatus_in.setACK(true);//sysj\orchestrator.sysj line: 74, column: 4
                                  S118909=1;
                                  if(capperStatus_in.isREQ()){//sysj\orchestrator.sysj line: 74, column: 4
                                    capperStatus_in.setACK(false);//sysj\orchestrator.sysj line: 74, column: 4
                                    ends[4]=2;
                                    ;//sysj\orchestrator.sysj line: 74, column: 4
                                    System.out.println("Received capper status");//sysj\orchestrator.sysj line: 75, column: 4
                                    System.out.println("All is received");//sysj\orchestrator.sysj line: 76, column: 4
                                    conveyStat_thread_4 = (conveyorStatus_in.getVal() == null ? null : ((String)conveyorStatus_in.getVal()));//sysj\orchestrator.sysj line: 78, column: 4
                                    fillerStat_thread_4 = (fillerStatus_in.getVal() == null ? null : ((String)fillerStatus_in.getVal()));//sysj\orchestrator.sysj line: 79, column: 4
                                    screwerStat_thread_4 = (capLoaderStatus_in.getVal() == null ? null : ((String)capLoaderStatus_in.getVal()));//sysj\orchestrator.sysj line: 80, column: 4
                                    loaderStat_thread_4 = (capperStatus_in.getVal() == null ? null : ((String)capperStatus_in.getVal()));//sysj\orchestrator.sysj line: 81, column: 4
                                    S118687=4;
                                    if((conveyStat_thread_4 == "done" || conveyStat_thread_4 == "idle") && (fillerStat_thread_4 == "done" || fillerStat_thread_4 == "idle") && (screwerStat_thread_4 == "done" || screwerStat_thread_4 == "idle") && (loaderStat_thread_4 == "done" || loaderStat_thread_4 == "idle")){//sysj\orchestrator.sysj line: 84, column: 7
                                      System.out.println("sending request to rotary?");//sysj\orchestrator.sysj line: 88, column: 5
                                      S119090=0;
                                      if(!allOperationsFinished_o.isPartnerPresent() || allOperationsFinished_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 89, column: 5
                                        allOperationsFinished_o.setREQ(false);//sysj\orchestrator.sysj line: 89, column: 5
                                        S119090=1;
                                        active[4]=1;
                                        ends[4]=1;
                                        tdone[4]=1;
                                      }
                                      else {
                                        S119085=0;
                                        if(allOperationsFinished_o.isACK()){//sysj\orchestrator.sysj line: 89, column: 5
                                          allOperationsFinished_o.setVal(true);//sysj\orchestrator.sysj line: 89, column: 5
                                          S119085=1;
                                          if(!allOperationsFinished_o.isACK()){//sysj\orchestrator.sysj line: 89, column: 5
                                            allOperationsFinished_o.setREQ(false);//sysj\orchestrator.sysj line: 89, column: 5
                                            ends[4]=2;
                                            ;//sysj\orchestrator.sysj line: 89, column: 5
                                            S118687=5;
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
                                      S118687=5;
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
                S118694=1;
                S118694=0;
                if(!fillerStatus_in.isPartnerPresent() || fillerStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 69, column: 4
                  fillerStatus_in.setACK(false);//sysj\orchestrator.sysj line: 69, column: 4
                  S118694=1;
                  active[4]=1;
                  ends[4]=1;
                  tdone[4]=1;
                }
                else {
                  S118689=0;
                  if(!fillerStatus_in.isREQ()){//sysj\orchestrator.sysj line: 69, column: 4
                    fillerStatus_in.setACK(true);//sysj\orchestrator.sysj line: 69, column: 4
                    S118689=1;
                    if(fillerStatus_in.isREQ()){//sysj\orchestrator.sysj line: 69, column: 4
                      fillerStatus_in.setACK(false);//sysj\orchestrator.sysj line: 69, column: 4
                      ends[4]=2;
                      ;//sysj\orchestrator.sysj line: 69, column: 4
                      System.out.println("Received filler status");//sysj\orchestrator.sysj line: 70, column: 4
                      S118687=2;
                      S118782=0;
                      if(!capLoaderStatus_in.isPartnerPresent() || capLoaderStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 72, column: 4
                        capLoaderStatus_in.setACK(false);//sysj\orchestrator.sysj line: 72, column: 4
                        S118782=1;
                        active[4]=1;
                        ends[4]=1;
                        tdone[4]=1;
                      }
                      else {
                        S118777=0;
                        if(!capLoaderStatus_in.isREQ()){//sysj\orchestrator.sysj line: 72, column: 4
                          capLoaderStatus_in.setACK(true);//sysj\orchestrator.sysj line: 72, column: 4
                          S118777=1;
                          if(capLoaderStatus_in.isREQ()){//sysj\orchestrator.sysj line: 72, column: 4
                            capLoaderStatus_in.setACK(false);//sysj\orchestrator.sysj line: 72, column: 4
                            ends[4]=2;
                            ;//sysj\orchestrator.sysj line: 72, column: 4
                            System.out.println("Received caploader status");//sysj\orchestrator.sysj line: 73, column: 4
                            S118687=3;
                            S118914=0;
                            if(!capperStatus_in.isPartnerPresent() || capperStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 74, column: 4
                              capperStatus_in.setACK(false);//sysj\orchestrator.sysj line: 74, column: 4
                              S118914=1;
                              active[4]=1;
                              ends[4]=1;
                              tdone[4]=1;
                            }
                            else {
                              S118909=0;
                              if(!capperStatus_in.isREQ()){//sysj\orchestrator.sysj line: 74, column: 4
                                capperStatus_in.setACK(true);//sysj\orchestrator.sysj line: 74, column: 4
                                S118909=1;
                                if(capperStatus_in.isREQ()){//sysj\orchestrator.sysj line: 74, column: 4
                                  capperStatus_in.setACK(false);//sysj\orchestrator.sysj line: 74, column: 4
                                  ends[4]=2;
                                  ;//sysj\orchestrator.sysj line: 74, column: 4
                                  System.out.println("Received capper status");//sysj\orchestrator.sysj line: 75, column: 4
                                  System.out.println("All is received");//sysj\orchestrator.sysj line: 76, column: 4
                                  conveyStat_thread_4 = (conveyorStatus_in.getVal() == null ? null : ((String)conveyorStatus_in.getVal()));//sysj\orchestrator.sysj line: 78, column: 4
                                  fillerStat_thread_4 = (fillerStatus_in.getVal() == null ? null : ((String)fillerStatus_in.getVal()));//sysj\orchestrator.sysj line: 79, column: 4
                                  screwerStat_thread_4 = (capLoaderStatus_in.getVal() == null ? null : ((String)capLoaderStatus_in.getVal()));//sysj\orchestrator.sysj line: 80, column: 4
                                  loaderStat_thread_4 = (capperStatus_in.getVal() == null ? null : ((String)capperStatus_in.getVal()));//sysj\orchestrator.sysj line: 81, column: 4
                                  S118687=4;
                                  if((conveyStat_thread_4 == "done" || conveyStat_thread_4 == "idle") && (fillerStat_thread_4 == "done" || fillerStat_thread_4 == "idle") && (screwerStat_thread_4 == "done" || screwerStat_thread_4 == "idle") && (loaderStat_thread_4 == "done" || loaderStat_thread_4 == "idle")){//sysj\orchestrator.sysj line: 84, column: 7
                                    System.out.println("sending request to rotary?");//sysj\orchestrator.sysj line: 88, column: 5
                                    S119090=0;
                                    if(!allOperationsFinished_o.isPartnerPresent() || allOperationsFinished_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 89, column: 5
                                      allOperationsFinished_o.setREQ(false);//sysj\orchestrator.sysj line: 89, column: 5
                                      S119090=1;
                                      active[4]=1;
                                      ends[4]=1;
                                      tdone[4]=1;
                                    }
                                    else {
                                      S119085=0;
                                      if(allOperationsFinished_o.isACK()){//sysj\orchestrator.sysj line: 89, column: 5
                                        allOperationsFinished_o.setVal(true);//sysj\orchestrator.sysj line: 89, column: 5
                                        S119085=1;
                                        if(!allOperationsFinished_o.isACK()){//sysj\orchestrator.sysj line: 89, column: 5
                                          allOperationsFinished_o.setREQ(false);//sysj\orchestrator.sysj line: 89, column: 5
                                          ends[4]=2;
                                          ;//sysj\orchestrator.sysj line: 89, column: 5
                                          S118687=5;
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
                                    S118687=5;
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
            switch(S118782){
              case 0 : 
                if(!capLoaderStatus_in.isPartnerPresent() || capLoaderStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 72, column: 4
                  capLoaderStatus_in.setACK(false);//sysj\orchestrator.sysj line: 72, column: 4
                  S118782=1;
                  active[4]=1;
                  ends[4]=1;
                  tdone[4]=1;
                }
                else {
                  switch(S118777){
                    case 0 : 
                      if(!capLoaderStatus_in.isREQ()){//sysj\orchestrator.sysj line: 72, column: 4
                        capLoaderStatus_in.setACK(true);//sysj\orchestrator.sysj line: 72, column: 4
                        S118777=1;
                        if(capLoaderStatus_in.isREQ()){//sysj\orchestrator.sysj line: 72, column: 4
                          capLoaderStatus_in.setACK(false);//sysj\orchestrator.sysj line: 72, column: 4
                          ends[4]=2;
                          ;//sysj\orchestrator.sysj line: 72, column: 4
                          System.out.println("Received caploader status");//sysj\orchestrator.sysj line: 73, column: 4
                          S118687=3;
                          S118914=0;
                          if(!capperStatus_in.isPartnerPresent() || capperStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 74, column: 4
                            capperStatus_in.setACK(false);//sysj\orchestrator.sysj line: 74, column: 4
                            S118914=1;
                            active[4]=1;
                            ends[4]=1;
                            tdone[4]=1;
                          }
                          else {
                            S118909=0;
                            if(!capperStatus_in.isREQ()){//sysj\orchestrator.sysj line: 74, column: 4
                              capperStatus_in.setACK(true);//sysj\orchestrator.sysj line: 74, column: 4
                              S118909=1;
                              if(capperStatus_in.isREQ()){//sysj\orchestrator.sysj line: 74, column: 4
                                capperStatus_in.setACK(false);//sysj\orchestrator.sysj line: 74, column: 4
                                ends[4]=2;
                                ;//sysj\orchestrator.sysj line: 74, column: 4
                                System.out.println("Received capper status");//sysj\orchestrator.sysj line: 75, column: 4
                                System.out.println("All is received");//sysj\orchestrator.sysj line: 76, column: 4
                                conveyStat_thread_4 = (conveyorStatus_in.getVal() == null ? null : ((String)conveyorStatus_in.getVal()));//sysj\orchestrator.sysj line: 78, column: 4
                                fillerStat_thread_4 = (fillerStatus_in.getVal() == null ? null : ((String)fillerStatus_in.getVal()));//sysj\orchestrator.sysj line: 79, column: 4
                                screwerStat_thread_4 = (capLoaderStatus_in.getVal() == null ? null : ((String)capLoaderStatus_in.getVal()));//sysj\orchestrator.sysj line: 80, column: 4
                                loaderStat_thread_4 = (capperStatus_in.getVal() == null ? null : ((String)capperStatus_in.getVal()));//sysj\orchestrator.sysj line: 81, column: 4
                                S118687=4;
                                if((conveyStat_thread_4 == "done" || conveyStat_thread_4 == "idle") && (fillerStat_thread_4 == "done" || fillerStat_thread_4 == "idle") && (screwerStat_thread_4 == "done" || screwerStat_thread_4 == "idle") && (loaderStat_thread_4 == "done" || loaderStat_thread_4 == "idle")){//sysj\orchestrator.sysj line: 84, column: 7
                                  System.out.println("sending request to rotary?");//sysj\orchestrator.sysj line: 88, column: 5
                                  S119090=0;
                                  if(!allOperationsFinished_o.isPartnerPresent() || allOperationsFinished_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 89, column: 5
                                    allOperationsFinished_o.setREQ(false);//sysj\orchestrator.sysj line: 89, column: 5
                                    S119090=1;
                                    active[4]=1;
                                    ends[4]=1;
                                    tdone[4]=1;
                                  }
                                  else {
                                    S119085=0;
                                    if(allOperationsFinished_o.isACK()){//sysj\orchestrator.sysj line: 89, column: 5
                                      allOperationsFinished_o.setVal(true);//sysj\orchestrator.sysj line: 89, column: 5
                                      S119085=1;
                                      if(!allOperationsFinished_o.isACK()){//sysj\orchestrator.sysj line: 89, column: 5
                                        allOperationsFinished_o.setREQ(false);//sysj\orchestrator.sysj line: 89, column: 5
                                        ends[4]=2;
                                        ;//sysj\orchestrator.sysj line: 89, column: 5
                                        S118687=5;
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
                                  S118687=5;
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
                      if(capLoaderStatus_in.isREQ()){//sysj\orchestrator.sysj line: 72, column: 4
                        capLoaderStatus_in.setACK(false);//sysj\orchestrator.sysj line: 72, column: 4
                        ends[4]=2;
                        ;//sysj\orchestrator.sysj line: 72, column: 4
                        System.out.println("Received caploader status");//sysj\orchestrator.sysj line: 73, column: 4
                        S118687=3;
                        S118914=0;
                        if(!capperStatus_in.isPartnerPresent() || capperStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 74, column: 4
                          capperStatus_in.setACK(false);//sysj\orchestrator.sysj line: 74, column: 4
                          S118914=1;
                          active[4]=1;
                          ends[4]=1;
                          tdone[4]=1;
                        }
                        else {
                          S118909=0;
                          if(!capperStatus_in.isREQ()){//sysj\orchestrator.sysj line: 74, column: 4
                            capperStatus_in.setACK(true);//sysj\orchestrator.sysj line: 74, column: 4
                            S118909=1;
                            if(capperStatus_in.isREQ()){//sysj\orchestrator.sysj line: 74, column: 4
                              capperStatus_in.setACK(false);//sysj\orchestrator.sysj line: 74, column: 4
                              ends[4]=2;
                              ;//sysj\orchestrator.sysj line: 74, column: 4
                              System.out.println("Received capper status");//sysj\orchestrator.sysj line: 75, column: 4
                              System.out.println("All is received");//sysj\orchestrator.sysj line: 76, column: 4
                              conveyStat_thread_4 = (conveyorStatus_in.getVal() == null ? null : ((String)conveyorStatus_in.getVal()));//sysj\orchestrator.sysj line: 78, column: 4
                              fillerStat_thread_4 = (fillerStatus_in.getVal() == null ? null : ((String)fillerStatus_in.getVal()));//sysj\orchestrator.sysj line: 79, column: 4
                              screwerStat_thread_4 = (capLoaderStatus_in.getVal() == null ? null : ((String)capLoaderStatus_in.getVal()));//sysj\orchestrator.sysj line: 80, column: 4
                              loaderStat_thread_4 = (capperStatus_in.getVal() == null ? null : ((String)capperStatus_in.getVal()));//sysj\orchestrator.sysj line: 81, column: 4
                              S118687=4;
                              if((conveyStat_thread_4 == "done" || conveyStat_thread_4 == "idle") && (fillerStat_thread_4 == "done" || fillerStat_thread_4 == "idle") && (screwerStat_thread_4 == "done" || screwerStat_thread_4 == "idle") && (loaderStat_thread_4 == "done" || loaderStat_thread_4 == "idle")){//sysj\orchestrator.sysj line: 84, column: 7
                                System.out.println("sending request to rotary?");//sysj\orchestrator.sysj line: 88, column: 5
                                S119090=0;
                                if(!allOperationsFinished_o.isPartnerPresent() || allOperationsFinished_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 89, column: 5
                                  allOperationsFinished_o.setREQ(false);//sysj\orchestrator.sysj line: 89, column: 5
                                  S119090=1;
                                  active[4]=1;
                                  ends[4]=1;
                                  tdone[4]=1;
                                }
                                else {
                                  S119085=0;
                                  if(allOperationsFinished_o.isACK()){//sysj\orchestrator.sysj line: 89, column: 5
                                    allOperationsFinished_o.setVal(true);//sysj\orchestrator.sysj line: 89, column: 5
                                    S119085=1;
                                    if(!allOperationsFinished_o.isACK()){//sysj\orchestrator.sysj line: 89, column: 5
                                      allOperationsFinished_o.setREQ(false);//sysj\orchestrator.sysj line: 89, column: 5
                                      ends[4]=2;
                                      ;//sysj\orchestrator.sysj line: 89, column: 5
                                      S118687=5;
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
                                S118687=5;
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
                S118782=1;
                S118782=0;
                if(!capLoaderStatus_in.isPartnerPresent() || capLoaderStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 72, column: 4
                  capLoaderStatus_in.setACK(false);//sysj\orchestrator.sysj line: 72, column: 4
                  S118782=1;
                  active[4]=1;
                  ends[4]=1;
                  tdone[4]=1;
                }
                else {
                  S118777=0;
                  if(!capLoaderStatus_in.isREQ()){//sysj\orchestrator.sysj line: 72, column: 4
                    capLoaderStatus_in.setACK(true);//sysj\orchestrator.sysj line: 72, column: 4
                    S118777=1;
                    if(capLoaderStatus_in.isREQ()){//sysj\orchestrator.sysj line: 72, column: 4
                      capLoaderStatus_in.setACK(false);//sysj\orchestrator.sysj line: 72, column: 4
                      ends[4]=2;
                      ;//sysj\orchestrator.sysj line: 72, column: 4
                      System.out.println("Received caploader status");//sysj\orchestrator.sysj line: 73, column: 4
                      S118687=3;
                      S118914=0;
                      if(!capperStatus_in.isPartnerPresent() || capperStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 74, column: 4
                        capperStatus_in.setACK(false);//sysj\orchestrator.sysj line: 74, column: 4
                        S118914=1;
                        active[4]=1;
                        ends[4]=1;
                        tdone[4]=1;
                      }
                      else {
                        S118909=0;
                        if(!capperStatus_in.isREQ()){//sysj\orchestrator.sysj line: 74, column: 4
                          capperStatus_in.setACK(true);//sysj\orchestrator.sysj line: 74, column: 4
                          S118909=1;
                          if(capperStatus_in.isREQ()){//sysj\orchestrator.sysj line: 74, column: 4
                            capperStatus_in.setACK(false);//sysj\orchestrator.sysj line: 74, column: 4
                            ends[4]=2;
                            ;//sysj\orchestrator.sysj line: 74, column: 4
                            System.out.println("Received capper status");//sysj\orchestrator.sysj line: 75, column: 4
                            System.out.println("All is received");//sysj\orchestrator.sysj line: 76, column: 4
                            conveyStat_thread_4 = (conveyorStatus_in.getVal() == null ? null : ((String)conveyorStatus_in.getVal()));//sysj\orchestrator.sysj line: 78, column: 4
                            fillerStat_thread_4 = (fillerStatus_in.getVal() == null ? null : ((String)fillerStatus_in.getVal()));//sysj\orchestrator.sysj line: 79, column: 4
                            screwerStat_thread_4 = (capLoaderStatus_in.getVal() == null ? null : ((String)capLoaderStatus_in.getVal()));//sysj\orchestrator.sysj line: 80, column: 4
                            loaderStat_thread_4 = (capperStatus_in.getVal() == null ? null : ((String)capperStatus_in.getVal()));//sysj\orchestrator.sysj line: 81, column: 4
                            S118687=4;
                            if((conveyStat_thread_4 == "done" || conveyStat_thread_4 == "idle") && (fillerStat_thread_4 == "done" || fillerStat_thread_4 == "idle") && (screwerStat_thread_4 == "done" || screwerStat_thread_4 == "idle") && (loaderStat_thread_4 == "done" || loaderStat_thread_4 == "idle")){//sysj\orchestrator.sysj line: 84, column: 7
                              System.out.println("sending request to rotary?");//sysj\orchestrator.sysj line: 88, column: 5
                              S119090=0;
                              if(!allOperationsFinished_o.isPartnerPresent() || allOperationsFinished_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 89, column: 5
                                allOperationsFinished_o.setREQ(false);//sysj\orchestrator.sysj line: 89, column: 5
                                S119090=1;
                                active[4]=1;
                                ends[4]=1;
                                tdone[4]=1;
                              }
                              else {
                                S119085=0;
                                if(allOperationsFinished_o.isACK()){//sysj\orchestrator.sysj line: 89, column: 5
                                  allOperationsFinished_o.setVal(true);//sysj\orchestrator.sysj line: 89, column: 5
                                  S119085=1;
                                  if(!allOperationsFinished_o.isACK()){//sysj\orchestrator.sysj line: 89, column: 5
                                    allOperationsFinished_o.setREQ(false);//sysj\orchestrator.sysj line: 89, column: 5
                                    ends[4]=2;
                                    ;//sysj\orchestrator.sysj line: 89, column: 5
                                    S118687=5;
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
                              S118687=5;
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
            switch(S118914){
              case 0 : 
                if(!capperStatus_in.isPartnerPresent() || capperStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 74, column: 4
                  capperStatus_in.setACK(false);//sysj\orchestrator.sysj line: 74, column: 4
                  S118914=1;
                  active[4]=1;
                  ends[4]=1;
                  tdone[4]=1;
                }
                else {
                  switch(S118909){
                    case 0 : 
                      if(!capperStatus_in.isREQ()){//sysj\orchestrator.sysj line: 74, column: 4
                        capperStatus_in.setACK(true);//sysj\orchestrator.sysj line: 74, column: 4
                        S118909=1;
                        if(capperStatus_in.isREQ()){//sysj\orchestrator.sysj line: 74, column: 4
                          capperStatus_in.setACK(false);//sysj\orchestrator.sysj line: 74, column: 4
                          ends[4]=2;
                          ;//sysj\orchestrator.sysj line: 74, column: 4
                          System.out.println("Received capper status");//sysj\orchestrator.sysj line: 75, column: 4
                          System.out.println("All is received");//sysj\orchestrator.sysj line: 76, column: 4
                          conveyStat_thread_4 = (conveyorStatus_in.getVal() == null ? null : ((String)conveyorStatus_in.getVal()));//sysj\orchestrator.sysj line: 78, column: 4
                          fillerStat_thread_4 = (fillerStatus_in.getVal() == null ? null : ((String)fillerStatus_in.getVal()));//sysj\orchestrator.sysj line: 79, column: 4
                          screwerStat_thread_4 = (capLoaderStatus_in.getVal() == null ? null : ((String)capLoaderStatus_in.getVal()));//sysj\orchestrator.sysj line: 80, column: 4
                          loaderStat_thread_4 = (capperStatus_in.getVal() == null ? null : ((String)capperStatus_in.getVal()));//sysj\orchestrator.sysj line: 81, column: 4
                          S118687=4;
                          if((conveyStat_thread_4 == "done" || conveyStat_thread_4 == "idle") && (fillerStat_thread_4 == "done" || fillerStat_thread_4 == "idle") && (screwerStat_thread_4 == "done" || screwerStat_thread_4 == "idle") && (loaderStat_thread_4 == "done" || loaderStat_thread_4 == "idle")){//sysj\orchestrator.sysj line: 84, column: 7
                            System.out.println("sending request to rotary?");//sysj\orchestrator.sysj line: 88, column: 5
                            S119090=0;
                            if(!allOperationsFinished_o.isPartnerPresent() || allOperationsFinished_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 89, column: 5
                              allOperationsFinished_o.setREQ(false);//sysj\orchestrator.sysj line: 89, column: 5
                              S119090=1;
                              active[4]=1;
                              ends[4]=1;
                              tdone[4]=1;
                            }
                            else {
                              S119085=0;
                              if(allOperationsFinished_o.isACK()){//sysj\orchestrator.sysj line: 89, column: 5
                                allOperationsFinished_o.setVal(true);//sysj\orchestrator.sysj line: 89, column: 5
                                S119085=1;
                                if(!allOperationsFinished_o.isACK()){//sysj\orchestrator.sysj line: 89, column: 5
                                  allOperationsFinished_o.setREQ(false);//sysj\orchestrator.sysj line: 89, column: 5
                                  ends[4]=2;
                                  ;//sysj\orchestrator.sysj line: 89, column: 5
                                  S118687=5;
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
                            S118687=5;
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
                      if(capperStatus_in.isREQ()){//sysj\orchestrator.sysj line: 74, column: 4
                        capperStatus_in.setACK(false);//sysj\orchestrator.sysj line: 74, column: 4
                        ends[4]=2;
                        ;//sysj\orchestrator.sysj line: 74, column: 4
                        System.out.println("Received capper status");//sysj\orchestrator.sysj line: 75, column: 4
                        System.out.println("All is received");//sysj\orchestrator.sysj line: 76, column: 4
                        conveyStat_thread_4 = (conveyorStatus_in.getVal() == null ? null : ((String)conveyorStatus_in.getVal()));//sysj\orchestrator.sysj line: 78, column: 4
                        fillerStat_thread_4 = (fillerStatus_in.getVal() == null ? null : ((String)fillerStatus_in.getVal()));//sysj\orchestrator.sysj line: 79, column: 4
                        screwerStat_thread_4 = (capLoaderStatus_in.getVal() == null ? null : ((String)capLoaderStatus_in.getVal()));//sysj\orchestrator.sysj line: 80, column: 4
                        loaderStat_thread_4 = (capperStatus_in.getVal() == null ? null : ((String)capperStatus_in.getVal()));//sysj\orchestrator.sysj line: 81, column: 4
                        S118687=4;
                        if((conveyStat_thread_4 == "done" || conveyStat_thread_4 == "idle") && (fillerStat_thread_4 == "done" || fillerStat_thread_4 == "idle") && (screwerStat_thread_4 == "done" || screwerStat_thread_4 == "idle") && (loaderStat_thread_4 == "done" || loaderStat_thread_4 == "idle")){//sysj\orchestrator.sysj line: 84, column: 7
                          System.out.println("sending request to rotary?");//sysj\orchestrator.sysj line: 88, column: 5
                          S119090=0;
                          if(!allOperationsFinished_o.isPartnerPresent() || allOperationsFinished_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 89, column: 5
                            allOperationsFinished_o.setREQ(false);//sysj\orchestrator.sysj line: 89, column: 5
                            S119090=1;
                            active[4]=1;
                            ends[4]=1;
                            tdone[4]=1;
                          }
                          else {
                            S119085=0;
                            if(allOperationsFinished_o.isACK()){//sysj\orchestrator.sysj line: 89, column: 5
                              allOperationsFinished_o.setVal(true);//sysj\orchestrator.sysj line: 89, column: 5
                              S119085=1;
                              if(!allOperationsFinished_o.isACK()){//sysj\orchestrator.sysj line: 89, column: 5
                                allOperationsFinished_o.setREQ(false);//sysj\orchestrator.sysj line: 89, column: 5
                                ends[4]=2;
                                ;//sysj\orchestrator.sysj line: 89, column: 5
                                S118687=5;
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
                          S118687=5;
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
                S118914=1;
                S118914=0;
                if(!capperStatus_in.isPartnerPresent() || capperStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 74, column: 4
                  capperStatus_in.setACK(false);//sysj\orchestrator.sysj line: 74, column: 4
                  S118914=1;
                  active[4]=1;
                  ends[4]=1;
                  tdone[4]=1;
                }
                else {
                  S118909=0;
                  if(!capperStatus_in.isREQ()){//sysj\orchestrator.sysj line: 74, column: 4
                    capperStatus_in.setACK(true);//sysj\orchestrator.sysj line: 74, column: 4
                    S118909=1;
                    if(capperStatus_in.isREQ()){//sysj\orchestrator.sysj line: 74, column: 4
                      capperStatus_in.setACK(false);//sysj\orchestrator.sysj line: 74, column: 4
                      ends[4]=2;
                      ;//sysj\orchestrator.sysj line: 74, column: 4
                      System.out.println("Received capper status");//sysj\orchestrator.sysj line: 75, column: 4
                      System.out.println("All is received");//sysj\orchestrator.sysj line: 76, column: 4
                      conveyStat_thread_4 = (conveyorStatus_in.getVal() == null ? null : ((String)conveyorStatus_in.getVal()));//sysj\orchestrator.sysj line: 78, column: 4
                      fillerStat_thread_4 = (fillerStatus_in.getVal() == null ? null : ((String)fillerStatus_in.getVal()));//sysj\orchestrator.sysj line: 79, column: 4
                      screwerStat_thread_4 = (capLoaderStatus_in.getVal() == null ? null : ((String)capLoaderStatus_in.getVal()));//sysj\orchestrator.sysj line: 80, column: 4
                      loaderStat_thread_4 = (capperStatus_in.getVal() == null ? null : ((String)capperStatus_in.getVal()));//sysj\orchestrator.sysj line: 81, column: 4
                      S118687=4;
                      if((conveyStat_thread_4 == "done" || conveyStat_thread_4 == "idle") && (fillerStat_thread_4 == "done" || fillerStat_thread_4 == "idle") && (screwerStat_thread_4 == "done" || screwerStat_thread_4 == "idle") && (loaderStat_thread_4 == "done" || loaderStat_thread_4 == "idle")){//sysj\orchestrator.sysj line: 84, column: 7
                        System.out.println("sending request to rotary?");//sysj\orchestrator.sysj line: 88, column: 5
                        S119090=0;
                        if(!allOperationsFinished_o.isPartnerPresent() || allOperationsFinished_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 89, column: 5
                          allOperationsFinished_o.setREQ(false);//sysj\orchestrator.sysj line: 89, column: 5
                          S119090=1;
                          active[4]=1;
                          ends[4]=1;
                          tdone[4]=1;
                        }
                        else {
                          S119085=0;
                          if(allOperationsFinished_o.isACK()){//sysj\orchestrator.sysj line: 89, column: 5
                            allOperationsFinished_o.setVal(true);//sysj\orchestrator.sysj line: 89, column: 5
                            S119085=1;
                            if(!allOperationsFinished_o.isACK()){//sysj\orchestrator.sysj line: 89, column: 5
                              allOperationsFinished_o.setREQ(false);//sysj\orchestrator.sysj line: 89, column: 5
                              ends[4]=2;
                              ;//sysj\orchestrator.sysj line: 89, column: 5
                              S118687=5;
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
                        S118687=5;
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
            switch(S119090){
              case 0 : 
                if(!allOperationsFinished_o.isPartnerPresent() || allOperationsFinished_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 89, column: 5
                  allOperationsFinished_o.setREQ(false);//sysj\orchestrator.sysj line: 89, column: 5
                  S119090=1;
                  active[4]=1;
                  ends[4]=1;
                  tdone[4]=1;
                }
                else {
                  switch(S119085){
                    case 0 : 
                      if(allOperationsFinished_o.isACK()){//sysj\orchestrator.sysj line: 89, column: 5
                        allOperationsFinished_o.setVal(true);//sysj\orchestrator.sysj line: 89, column: 5
                        S119085=1;
                        if(!allOperationsFinished_o.isACK()){//sysj\orchestrator.sysj line: 89, column: 5
                          allOperationsFinished_o.setREQ(false);//sysj\orchestrator.sysj line: 89, column: 5
                          ends[4]=2;
                          ;//sysj\orchestrator.sysj line: 89, column: 5
                          S118687=5;
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
                      if(!allOperationsFinished_o.isACK()){//sysj\orchestrator.sysj line: 89, column: 5
                        allOperationsFinished_o.setREQ(false);//sysj\orchestrator.sysj line: 89, column: 5
                        ends[4]=2;
                        ;//sysj\orchestrator.sysj line: 89, column: 5
                        S118687=5;
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
                S119090=1;
                S119090=0;
                if(!allOperationsFinished_o.isPartnerPresent() || allOperationsFinished_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 89, column: 5
                  allOperationsFinished_o.setREQ(false);//sysj\orchestrator.sysj line: 89, column: 5
                  S119090=1;
                  active[4]=1;
                  ends[4]=1;
                  tdone[4]=1;
                }
                else {
                  S119085=0;
                  if(allOperationsFinished_o.isACK()){//sysj\orchestrator.sysj line: 89, column: 5
                    allOperationsFinished_o.setVal(true);//sysj\orchestrator.sysj line: 89, column: 5
                    S119085=1;
                    if(!allOperationsFinished_o.isACK()){//sysj\orchestrator.sysj line: 89, column: 5
                      allOperationsFinished_o.setREQ(false);//sysj\orchestrator.sysj line: 89, column: 5
                      ends[4]=2;
                      ;//sysj\orchestrator.sysj line: 89, column: 5
                      S118687=5;
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
            S118687=5;
            S118687=0;
            S118671=0;
            if(!conveyorStatus_in.isPartnerPresent() || conveyorStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 67, column: 4
              conveyorStatus_in.setACK(false);//sysj\orchestrator.sysj line: 67, column: 4
              S118671=1;
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            else {
              S118666=0;
              if(!conveyorStatus_in.isREQ()){//sysj\orchestrator.sysj line: 67, column: 4
                conveyorStatus_in.setACK(true);//sysj\orchestrator.sysj line: 67, column: 4
                S118666=1;
                if(conveyorStatus_in.isREQ()){//sysj\orchestrator.sysj line: 67, column: 4
                  conveyorStatus_in.setACK(false);//sysj\orchestrator.sysj line: 67, column: 4
                  ends[4]=2;
                  ;//sysj\orchestrator.sysj line: 67, column: 4
                  System.out.println("Received conveyor status");//sysj\orchestrator.sysj line: 68, column: 4
                  S118687=1;
                  S118694=0;
                  if(!fillerStatus_in.isPartnerPresent() || fillerStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 69, column: 4
                    fillerStatus_in.setACK(false);//sysj\orchestrator.sysj line: 69, column: 4
                    S118694=1;
                    active[4]=1;
                    ends[4]=1;
                    tdone[4]=1;
                  }
                  else {
                    S118689=0;
                    if(!fillerStatus_in.isREQ()){//sysj\orchestrator.sysj line: 69, column: 4
                      fillerStatus_in.setACK(true);//sysj\orchestrator.sysj line: 69, column: 4
                      S118689=1;
                      if(fillerStatus_in.isREQ()){//sysj\orchestrator.sysj line: 69, column: 4
                        fillerStatus_in.setACK(false);//sysj\orchestrator.sysj line: 69, column: 4
                        ends[4]=2;
                        ;//sysj\orchestrator.sysj line: 69, column: 4
                        System.out.println("Received filler status");//sysj\orchestrator.sysj line: 70, column: 4
                        S118687=2;
                        S118782=0;
                        if(!capLoaderStatus_in.isPartnerPresent() || capLoaderStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 72, column: 4
                          capLoaderStatus_in.setACK(false);//sysj\orchestrator.sysj line: 72, column: 4
                          S118782=1;
                          active[4]=1;
                          ends[4]=1;
                          tdone[4]=1;
                        }
                        else {
                          S118777=0;
                          if(!capLoaderStatus_in.isREQ()){//sysj\orchestrator.sysj line: 72, column: 4
                            capLoaderStatus_in.setACK(true);//sysj\orchestrator.sysj line: 72, column: 4
                            S118777=1;
                            if(capLoaderStatus_in.isREQ()){//sysj\orchestrator.sysj line: 72, column: 4
                              capLoaderStatus_in.setACK(false);//sysj\orchestrator.sysj line: 72, column: 4
                              ends[4]=2;
                              ;//sysj\orchestrator.sysj line: 72, column: 4
                              System.out.println("Received caploader status");//sysj\orchestrator.sysj line: 73, column: 4
                              S118687=3;
                              S118914=0;
                              if(!capperStatus_in.isPartnerPresent() || capperStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 74, column: 4
                                capperStatus_in.setACK(false);//sysj\orchestrator.sysj line: 74, column: 4
                                S118914=1;
                                active[4]=1;
                                ends[4]=1;
                                tdone[4]=1;
                              }
                              else {
                                S118909=0;
                                if(!capperStatus_in.isREQ()){//sysj\orchestrator.sysj line: 74, column: 4
                                  capperStatus_in.setACK(true);//sysj\orchestrator.sysj line: 74, column: 4
                                  S118909=1;
                                  if(capperStatus_in.isREQ()){//sysj\orchestrator.sysj line: 74, column: 4
                                    capperStatus_in.setACK(false);//sysj\orchestrator.sysj line: 74, column: 4
                                    ends[4]=2;
                                    ;//sysj\orchestrator.sysj line: 74, column: 4
                                    System.out.println("Received capper status");//sysj\orchestrator.sysj line: 75, column: 4
                                    System.out.println("All is received");//sysj\orchestrator.sysj line: 76, column: 4
                                    conveyStat_thread_4 = (conveyorStatus_in.getVal() == null ? null : ((String)conveyorStatus_in.getVal()));//sysj\orchestrator.sysj line: 78, column: 4
                                    fillerStat_thread_4 = (fillerStatus_in.getVal() == null ? null : ((String)fillerStatus_in.getVal()));//sysj\orchestrator.sysj line: 79, column: 4
                                    screwerStat_thread_4 = (capLoaderStatus_in.getVal() == null ? null : ((String)capLoaderStatus_in.getVal()));//sysj\orchestrator.sysj line: 80, column: 4
                                    loaderStat_thread_4 = (capperStatus_in.getVal() == null ? null : ((String)capperStatus_in.getVal()));//sysj\orchestrator.sysj line: 81, column: 4
                                    S118687=4;
                                    if((conveyStat_thread_4 == "done" || conveyStat_thread_4 == "idle") && (fillerStat_thread_4 == "done" || fillerStat_thread_4 == "idle") && (screwerStat_thread_4 == "done" || screwerStat_thread_4 == "idle") && (loaderStat_thread_4 == "done" || loaderStat_thread_4 == "idle")){//sysj\orchestrator.sysj line: 84, column: 7
                                      System.out.println("sending request to rotary?");//sysj\orchestrator.sysj line: 88, column: 5
                                      S119090=0;
                                      if(!allOperationsFinished_o.isPartnerPresent() || allOperationsFinished_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 89, column: 5
                                        allOperationsFinished_o.setREQ(false);//sysj\orchestrator.sysj line: 89, column: 5
                                        S119090=1;
                                        active[4]=1;
                                        ends[4]=1;
                                        tdone[4]=1;
                                      }
                                      else {
                                        S119085=0;
                                        if(allOperationsFinished_o.isACK()){//sysj\orchestrator.sysj line: 89, column: 5
                                          allOperationsFinished_o.setVal(true);//sysj\orchestrator.sysj line: 89, column: 5
                                          S119085=1;
                                          if(!allOperationsFinished_o.isACK()){//sysj\orchestrator.sysj line: 89, column: 5
                                            allOperationsFinished_o.setREQ(false);//sysj\orchestrator.sysj line: 89, column: 5
                                            ends[4]=2;
                                            ;//sysj\orchestrator.sysj line: 89, column: 5
                                            S118687=5;
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
                                      S118687=5;
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

  public void thread121312(int [] tdone, int [] ends){
        switch(S118664){
      case 0 : 
        active[3]=0;
        ends[3]=0;
        tdone[3]=1;
        break;
      
      case 1 : 
        switch(S115424){
          case 0 : 
            switch(S115408){
              case 0 : 
                if(!rotaryStatus_in.isPartnerPresent() || rotaryStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 49, column: 4
                  rotaryStatus_in.setACK(false);//sysj\orchestrator.sysj line: 49, column: 4
                  S115408=1;
                  active[3]=1;
                  ends[3]=1;
                  tdone[3]=1;
                }
                else {
                  switch(S115403){
                    case 0 : 
                      if(!rotaryStatus_in.isREQ()){//sysj\orchestrator.sysj line: 49, column: 4
                        rotaryStatus_in.setACK(true);//sysj\orchestrator.sysj line: 49, column: 4
                        S115403=1;
                        if(rotaryStatus_in.isREQ()){//sysj\orchestrator.sysj line: 49, column: 4
                          rotaryStatus_in.setACK(false);//sysj\orchestrator.sysj line: 49, column: 4
                          ends[3]=2;
                          ;//sysj\orchestrator.sysj line: 49, column: 4
                          rotaryStat_thread_3 = (rotaryStatus_in.getVal() == null ? null : ((String)rotaryStatus_in.getVal()));//sysj\orchestrator.sysj line: 50, column: 4
                          S115424=1;
                          if(rotaryStat_thread_3 == "done"){//sysj\orchestrator.sysj line: 53, column: 7
                            System.out.println("rotary done, sending filler,loader,screwer, conveyor reqs");//sysj\orchestrator.sysj line: 54, column: 5
                            S115469=0;
                            S115431=0;
                            if(!fillerReq_o.isPartnerPresent() || fillerReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 55, column: 5
                              fillerReq_o.setREQ(false);//sysj\orchestrator.sysj line: 55, column: 5
                              S115431=1;
                              active[3]=1;
                              ends[3]=1;
                              tdone[3]=1;
                            }
                            else {
                              S115426=0;
                              if(fillerReq_o.isACK()){//sysj\orchestrator.sysj line: 55, column: 5
                                fillerReq_o.setVal(true);//sysj\orchestrator.sysj line: 55, column: 5
                                S115426=1;
                                if(!fillerReq_o.isACK()){//sysj\orchestrator.sysj line: 55, column: 5
                                  fillerReq_o.setREQ(false);//sysj\orchestrator.sysj line: 55, column: 5
                                  ends[3]=2;
                                  ;//sysj\orchestrator.sysj line: 55, column: 5
                                  S115469=1;
                                  S115476=0;
                                  if(!capLoaderReq_o.isPartnerPresent() || capLoaderReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 56, column: 5
                                    capLoaderReq_o.setREQ(false);//sysj\orchestrator.sysj line: 56, column: 5
                                    S115476=1;
                                    active[3]=1;
                                    ends[3]=1;
                                    tdone[3]=1;
                                  }
                                  else {
                                    S115471=0;
                                    if(capLoaderReq_o.isACK()){//sysj\orchestrator.sysj line: 56, column: 5
                                      capLoaderReq_o.setVal(true);//sysj\orchestrator.sysj line: 56, column: 5
                                      S115471=1;
                                      if(!capLoaderReq_o.isACK()){//sysj\orchestrator.sysj line: 56, column: 5
                                        capLoaderReq_o.setREQ(false);//sysj\orchestrator.sysj line: 56, column: 5
                                        ends[3]=2;
                                        ;//sysj\orchestrator.sysj line: 56, column: 5
                                        S115469=2;
                                        S115564=0;
                                        if(!capperReq_o.isPartnerPresent() || capperReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 57, column: 5
                                          capperReq_o.setREQ(false);//sysj\orchestrator.sysj line: 57, column: 5
                                          S115564=1;
                                          active[3]=1;
                                          ends[3]=1;
                                          tdone[3]=1;
                                        }
                                        else {
                                          S115559=0;
                                          if(capperReq_o.isACK()){//sysj\orchestrator.sysj line: 57, column: 5
                                            capperReq_o.setVal(true);//sysj\orchestrator.sysj line: 57, column: 5
                                            S115559=1;
                                            if(!capperReq_o.isACK()){//sysj\orchestrator.sysj line: 57, column: 5
                                              capperReq_o.setREQ(false);//sysj\orchestrator.sysj line: 57, column: 5
                                              ends[3]=2;
                                              ;//sysj\orchestrator.sysj line: 57, column: 5
                                              getNextBottle_1.setPresent();//sysj\orchestrator.sysj line: 58, column: 5
                                              currsigs.addElement(getNextBottle_1);
                                              S115424=2;
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
                            S115424=2;
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
                        S115424=1;
                        if(rotaryStat_thread_3 == "done"){//sysj\orchestrator.sysj line: 53, column: 7
                          System.out.println("rotary done, sending filler,loader,screwer, conveyor reqs");//sysj\orchestrator.sysj line: 54, column: 5
                          S115469=0;
                          S115431=0;
                          if(!fillerReq_o.isPartnerPresent() || fillerReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 55, column: 5
                            fillerReq_o.setREQ(false);//sysj\orchestrator.sysj line: 55, column: 5
                            S115431=1;
                            active[3]=1;
                            ends[3]=1;
                            tdone[3]=1;
                          }
                          else {
                            S115426=0;
                            if(fillerReq_o.isACK()){//sysj\orchestrator.sysj line: 55, column: 5
                              fillerReq_o.setVal(true);//sysj\orchestrator.sysj line: 55, column: 5
                              S115426=1;
                              if(!fillerReq_o.isACK()){//sysj\orchestrator.sysj line: 55, column: 5
                                fillerReq_o.setREQ(false);//sysj\orchestrator.sysj line: 55, column: 5
                                ends[3]=2;
                                ;//sysj\orchestrator.sysj line: 55, column: 5
                                S115469=1;
                                S115476=0;
                                if(!capLoaderReq_o.isPartnerPresent() || capLoaderReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 56, column: 5
                                  capLoaderReq_o.setREQ(false);//sysj\orchestrator.sysj line: 56, column: 5
                                  S115476=1;
                                  active[3]=1;
                                  ends[3]=1;
                                  tdone[3]=1;
                                }
                                else {
                                  S115471=0;
                                  if(capLoaderReq_o.isACK()){//sysj\orchestrator.sysj line: 56, column: 5
                                    capLoaderReq_o.setVal(true);//sysj\orchestrator.sysj line: 56, column: 5
                                    S115471=1;
                                    if(!capLoaderReq_o.isACK()){//sysj\orchestrator.sysj line: 56, column: 5
                                      capLoaderReq_o.setREQ(false);//sysj\orchestrator.sysj line: 56, column: 5
                                      ends[3]=2;
                                      ;//sysj\orchestrator.sysj line: 56, column: 5
                                      S115469=2;
                                      S115564=0;
                                      if(!capperReq_o.isPartnerPresent() || capperReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 57, column: 5
                                        capperReq_o.setREQ(false);//sysj\orchestrator.sysj line: 57, column: 5
                                        S115564=1;
                                        active[3]=1;
                                        ends[3]=1;
                                        tdone[3]=1;
                                      }
                                      else {
                                        S115559=0;
                                        if(capperReq_o.isACK()){//sysj\orchestrator.sysj line: 57, column: 5
                                          capperReq_o.setVal(true);//sysj\orchestrator.sysj line: 57, column: 5
                                          S115559=1;
                                          if(!capperReq_o.isACK()){//sysj\orchestrator.sysj line: 57, column: 5
                                            capperReq_o.setREQ(false);//sysj\orchestrator.sysj line: 57, column: 5
                                            ends[3]=2;
                                            ;//sysj\orchestrator.sysj line: 57, column: 5
                                            getNextBottle_1.setPresent();//sysj\orchestrator.sysj line: 58, column: 5
                                            currsigs.addElement(getNextBottle_1);
                                            S115424=2;
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
                          S115424=2;
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
                S115408=1;
                S115408=0;
                if(!rotaryStatus_in.isPartnerPresent() || rotaryStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 49, column: 4
                  rotaryStatus_in.setACK(false);//sysj\orchestrator.sysj line: 49, column: 4
                  S115408=1;
                  active[3]=1;
                  ends[3]=1;
                  tdone[3]=1;
                }
                else {
                  S115403=0;
                  if(!rotaryStatus_in.isREQ()){//sysj\orchestrator.sysj line: 49, column: 4
                    rotaryStatus_in.setACK(true);//sysj\orchestrator.sysj line: 49, column: 4
                    S115403=1;
                    if(rotaryStatus_in.isREQ()){//sysj\orchestrator.sysj line: 49, column: 4
                      rotaryStatus_in.setACK(false);//sysj\orchestrator.sysj line: 49, column: 4
                      ends[3]=2;
                      ;//sysj\orchestrator.sysj line: 49, column: 4
                      rotaryStat_thread_3 = (rotaryStatus_in.getVal() == null ? null : ((String)rotaryStatus_in.getVal()));//sysj\orchestrator.sysj line: 50, column: 4
                      S115424=1;
                      if(rotaryStat_thread_3 == "done"){//sysj\orchestrator.sysj line: 53, column: 7
                        System.out.println("rotary done, sending filler,loader,screwer, conveyor reqs");//sysj\orchestrator.sysj line: 54, column: 5
                        S115469=0;
                        S115431=0;
                        if(!fillerReq_o.isPartnerPresent() || fillerReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 55, column: 5
                          fillerReq_o.setREQ(false);//sysj\orchestrator.sysj line: 55, column: 5
                          S115431=1;
                          active[3]=1;
                          ends[3]=1;
                          tdone[3]=1;
                        }
                        else {
                          S115426=0;
                          if(fillerReq_o.isACK()){//sysj\orchestrator.sysj line: 55, column: 5
                            fillerReq_o.setVal(true);//sysj\orchestrator.sysj line: 55, column: 5
                            S115426=1;
                            if(!fillerReq_o.isACK()){//sysj\orchestrator.sysj line: 55, column: 5
                              fillerReq_o.setREQ(false);//sysj\orchestrator.sysj line: 55, column: 5
                              ends[3]=2;
                              ;//sysj\orchestrator.sysj line: 55, column: 5
                              S115469=1;
                              S115476=0;
                              if(!capLoaderReq_o.isPartnerPresent() || capLoaderReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 56, column: 5
                                capLoaderReq_o.setREQ(false);//sysj\orchestrator.sysj line: 56, column: 5
                                S115476=1;
                                active[3]=1;
                                ends[3]=1;
                                tdone[3]=1;
                              }
                              else {
                                S115471=0;
                                if(capLoaderReq_o.isACK()){//sysj\orchestrator.sysj line: 56, column: 5
                                  capLoaderReq_o.setVal(true);//sysj\orchestrator.sysj line: 56, column: 5
                                  S115471=1;
                                  if(!capLoaderReq_o.isACK()){//sysj\orchestrator.sysj line: 56, column: 5
                                    capLoaderReq_o.setREQ(false);//sysj\orchestrator.sysj line: 56, column: 5
                                    ends[3]=2;
                                    ;//sysj\orchestrator.sysj line: 56, column: 5
                                    S115469=2;
                                    S115564=0;
                                    if(!capperReq_o.isPartnerPresent() || capperReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 57, column: 5
                                      capperReq_o.setREQ(false);//sysj\orchestrator.sysj line: 57, column: 5
                                      S115564=1;
                                      active[3]=1;
                                      ends[3]=1;
                                      tdone[3]=1;
                                    }
                                    else {
                                      S115559=0;
                                      if(capperReq_o.isACK()){//sysj\orchestrator.sysj line: 57, column: 5
                                        capperReq_o.setVal(true);//sysj\orchestrator.sysj line: 57, column: 5
                                        S115559=1;
                                        if(!capperReq_o.isACK()){//sysj\orchestrator.sysj line: 57, column: 5
                                          capperReq_o.setREQ(false);//sysj\orchestrator.sysj line: 57, column: 5
                                          ends[3]=2;
                                          ;//sysj\orchestrator.sysj line: 57, column: 5
                                          getNextBottle_1.setPresent();//sysj\orchestrator.sysj line: 58, column: 5
                                          currsigs.addElement(getNextBottle_1);
                                          S115424=2;
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
                        S115424=2;
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
            switch(S115469){
              case 0 : 
                switch(S115431){
                  case 0 : 
                    if(!fillerReq_o.isPartnerPresent() || fillerReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 55, column: 5
                      fillerReq_o.setREQ(false);//sysj\orchestrator.sysj line: 55, column: 5
                      S115431=1;
                      active[3]=1;
                      ends[3]=1;
                      tdone[3]=1;
                    }
                    else {
                      switch(S115426){
                        case 0 : 
                          if(fillerReq_o.isACK()){//sysj\orchestrator.sysj line: 55, column: 5
                            fillerReq_o.setVal(true);//sysj\orchestrator.sysj line: 55, column: 5
                            S115426=1;
                            if(!fillerReq_o.isACK()){//sysj\orchestrator.sysj line: 55, column: 5
                              fillerReq_o.setREQ(false);//sysj\orchestrator.sysj line: 55, column: 5
                              ends[3]=2;
                              ;//sysj\orchestrator.sysj line: 55, column: 5
                              S115469=1;
                              S115476=0;
                              if(!capLoaderReq_o.isPartnerPresent() || capLoaderReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 56, column: 5
                                capLoaderReq_o.setREQ(false);//sysj\orchestrator.sysj line: 56, column: 5
                                S115476=1;
                                active[3]=1;
                                ends[3]=1;
                                tdone[3]=1;
                              }
                              else {
                                S115471=0;
                                if(capLoaderReq_o.isACK()){//sysj\orchestrator.sysj line: 56, column: 5
                                  capLoaderReq_o.setVal(true);//sysj\orchestrator.sysj line: 56, column: 5
                                  S115471=1;
                                  if(!capLoaderReq_o.isACK()){//sysj\orchestrator.sysj line: 56, column: 5
                                    capLoaderReq_o.setREQ(false);//sysj\orchestrator.sysj line: 56, column: 5
                                    ends[3]=2;
                                    ;//sysj\orchestrator.sysj line: 56, column: 5
                                    S115469=2;
                                    S115564=0;
                                    if(!capperReq_o.isPartnerPresent() || capperReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 57, column: 5
                                      capperReq_o.setREQ(false);//sysj\orchestrator.sysj line: 57, column: 5
                                      S115564=1;
                                      active[3]=1;
                                      ends[3]=1;
                                      tdone[3]=1;
                                    }
                                    else {
                                      S115559=0;
                                      if(capperReq_o.isACK()){//sysj\orchestrator.sysj line: 57, column: 5
                                        capperReq_o.setVal(true);//sysj\orchestrator.sysj line: 57, column: 5
                                        S115559=1;
                                        if(!capperReq_o.isACK()){//sysj\orchestrator.sysj line: 57, column: 5
                                          capperReq_o.setREQ(false);//sysj\orchestrator.sysj line: 57, column: 5
                                          ends[3]=2;
                                          ;//sysj\orchestrator.sysj line: 57, column: 5
                                          getNextBottle_1.setPresent();//sysj\orchestrator.sysj line: 58, column: 5
                                          currsigs.addElement(getNextBottle_1);
                                          S115424=2;
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
                            S115469=1;
                            S115476=0;
                            if(!capLoaderReq_o.isPartnerPresent() || capLoaderReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 56, column: 5
                              capLoaderReq_o.setREQ(false);//sysj\orchestrator.sysj line: 56, column: 5
                              S115476=1;
                              active[3]=1;
                              ends[3]=1;
                              tdone[3]=1;
                            }
                            else {
                              S115471=0;
                              if(capLoaderReq_o.isACK()){//sysj\orchestrator.sysj line: 56, column: 5
                                capLoaderReq_o.setVal(true);//sysj\orchestrator.sysj line: 56, column: 5
                                S115471=1;
                                if(!capLoaderReq_o.isACK()){//sysj\orchestrator.sysj line: 56, column: 5
                                  capLoaderReq_o.setREQ(false);//sysj\orchestrator.sysj line: 56, column: 5
                                  ends[3]=2;
                                  ;//sysj\orchestrator.sysj line: 56, column: 5
                                  S115469=2;
                                  S115564=0;
                                  if(!capperReq_o.isPartnerPresent() || capperReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 57, column: 5
                                    capperReq_o.setREQ(false);//sysj\orchestrator.sysj line: 57, column: 5
                                    S115564=1;
                                    active[3]=1;
                                    ends[3]=1;
                                    tdone[3]=1;
                                  }
                                  else {
                                    S115559=0;
                                    if(capperReq_o.isACK()){//sysj\orchestrator.sysj line: 57, column: 5
                                      capperReq_o.setVal(true);//sysj\orchestrator.sysj line: 57, column: 5
                                      S115559=1;
                                      if(!capperReq_o.isACK()){//sysj\orchestrator.sysj line: 57, column: 5
                                        capperReq_o.setREQ(false);//sysj\orchestrator.sysj line: 57, column: 5
                                        ends[3]=2;
                                        ;//sysj\orchestrator.sysj line: 57, column: 5
                                        getNextBottle_1.setPresent();//sysj\orchestrator.sysj line: 58, column: 5
                                        currsigs.addElement(getNextBottle_1);
                                        S115424=2;
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
                    S115431=1;
                    S115431=0;
                    if(!fillerReq_o.isPartnerPresent() || fillerReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 55, column: 5
                      fillerReq_o.setREQ(false);//sysj\orchestrator.sysj line: 55, column: 5
                      S115431=1;
                      active[3]=1;
                      ends[3]=1;
                      tdone[3]=1;
                    }
                    else {
                      S115426=0;
                      if(fillerReq_o.isACK()){//sysj\orchestrator.sysj line: 55, column: 5
                        fillerReq_o.setVal(true);//sysj\orchestrator.sysj line: 55, column: 5
                        S115426=1;
                        if(!fillerReq_o.isACK()){//sysj\orchestrator.sysj line: 55, column: 5
                          fillerReq_o.setREQ(false);//sysj\orchestrator.sysj line: 55, column: 5
                          ends[3]=2;
                          ;//sysj\orchestrator.sysj line: 55, column: 5
                          S115469=1;
                          S115476=0;
                          if(!capLoaderReq_o.isPartnerPresent() || capLoaderReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 56, column: 5
                            capLoaderReq_o.setREQ(false);//sysj\orchestrator.sysj line: 56, column: 5
                            S115476=1;
                            active[3]=1;
                            ends[3]=1;
                            tdone[3]=1;
                          }
                          else {
                            S115471=0;
                            if(capLoaderReq_o.isACK()){//sysj\orchestrator.sysj line: 56, column: 5
                              capLoaderReq_o.setVal(true);//sysj\orchestrator.sysj line: 56, column: 5
                              S115471=1;
                              if(!capLoaderReq_o.isACK()){//sysj\orchestrator.sysj line: 56, column: 5
                                capLoaderReq_o.setREQ(false);//sysj\orchestrator.sysj line: 56, column: 5
                                ends[3]=2;
                                ;//sysj\orchestrator.sysj line: 56, column: 5
                                S115469=2;
                                S115564=0;
                                if(!capperReq_o.isPartnerPresent() || capperReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 57, column: 5
                                  capperReq_o.setREQ(false);//sysj\orchestrator.sysj line: 57, column: 5
                                  S115564=1;
                                  active[3]=1;
                                  ends[3]=1;
                                  tdone[3]=1;
                                }
                                else {
                                  S115559=0;
                                  if(capperReq_o.isACK()){//sysj\orchestrator.sysj line: 57, column: 5
                                    capperReq_o.setVal(true);//sysj\orchestrator.sysj line: 57, column: 5
                                    S115559=1;
                                    if(!capperReq_o.isACK()){//sysj\orchestrator.sysj line: 57, column: 5
                                      capperReq_o.setREQ(false);//sysj\orchestrator.sysj line: 57, column: 5
                                      ends[3]=2;
                                      ;//sysj\orchestrator.sysj line: 57, column: 5
                                      getNextBottle_1.setPresent();//sysj\orchestrator.sysj line: 58, column: 5
                                      currsigs.addElement(getNextBottle_1);
                                      S115424=2;
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
                switch(S115476){
                  case 0 : 
                    if(!capLoaderReq_o.isPartnerPresent() || capLoaderReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 56, column: 5
                      capLoaderReq_o.setREQ(false);//sysj\orchestrator.sysj line: 56, column: 5
                      S115476=1;
                      active[3]=1;
                      ends[3]=1;
                      tdone[3]=1;
                    }
                    else {
                      switch(S115471){
                        case 0 : 
                          if(capLoaderReq_o.isACK()){//sysj\orchestrator.sysj line: 56, column: 5
                            capLoaderReq_o.setVal(true);//sysj\orchestrator.sysj line: 56, column: 5
                            S115471=1;
                            if(!capLoaderReq_o.isACK()){//sysj\orchestrator.sysj line: 56, column: 5
                              capLoaderReq_o.setREQ(false);//sysj\orchestrator.sysj line: 56, column: 5
                              ends[3]=2;
                              ;//sysj\orchestrator.sysj line: 56, column: 5
                              S115469=2;
                              S115564=0;
                              if(!capperReq_o.isPartnerPresent() || capperReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 57, column: 5
                                capperReq_o.setREQ(false);//sysj\orchestrator.sysj line: 57, column: 5
                                S115564=1;
                                active[3]=1;
                                ends[3]=1;
                                tdone[3]=1;
                              }
                              else {
                                S115559=0;
                                if(capperReq_o.isACK()){//sysj\orchestrator.sysj line: 57, column: 5
                                  capperReq_o.setVal(true);//sysj\orchestrator.sysj line: 57, column: 5
                                  S115559=1;
                                  if(!capperReq_o.isACK()){//sysj\orchestrator.sysj line: 57, column: 5
                                    capperReq_o.setREQ(false);//sysj\orchestrator.sysj line: 57, column: 5
                                    ends[3]=2;
                                    ;//sysj\orchestrator.sysj line: 57, column: 5
                                    getNextBottle_1.setPresent();//sysj\orchestrator.sysj line: 58, column: 5
                                    currsigs.addElement(getNextBottle_1);
                                    S115424=2;
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
                            S115469=2;
                            S115564=0;
                            if(!capperReq_o.isPartnerPresent() || capperReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 57, column: 5
                              capperReq_o.setREQ(false);//sysj\orchestrator.sysj line: 57, column: 5
                              S115564=1;
                              active[3]=1;
                              ends[3]=1;
                              tdone[3]=1;
                            }
                            else {
                              S115559=0;
                              if(capperReq_o.isACK()){//sysj\orchestrator.sysj line: 57, column: 5
                                capperReq_o.setVal(true);//sysj\orchestrator.sysj line: 57, column: 5
                                S115559=1;
                                if(!capperReq_o.isACK()){//sysj\orchestrator.sysj line: 57, column: 5
                                  capperReq_o.setREQ(false);//sysj\orchestrator.sysj line: 57, column: 5
                                  ends[3]=2;
                                  ;//sysj\orchestrator.sysj line: 57, column: 5
                                  getNextBottle_1.setPresent();//sysj\orchestrator.sysj line: 58, column: 5
                                  currsigs.addElement(getNextBottle_1);
                                  S115424=2;
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
                    S115476=1;
                    S115476=0;
                    if(!capLoaderReq_o.isPartnerPresent() || capLoaderReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 56, column: 5
                      capLoaderReq_o.setREQ(false);//sysj\orchestrator.sysj line: 56, column: 5
                      S115476=1;
                      active[3]=1;
                      ends[3]=1;
                      tdone[3]=1;
                    }
                    else {
                      S115471=0;
                      if(capLoaderReq_o.isACK()){//sysj\orchestrator.sysj line: 56, column: 5
                        capLoaderReq_o.setVal(true);//sysj\orchestrator.sysj line: 56, column: 5
                        S115471=1;
                        if(!capLoaderReq_o.isACK()){//sysj\orchestrator.sysj line: 56, column: 5
                          capLoaderReq_o.setREQ(false);//sysj\orchestrator.sysj line: 56, column: 5
                          ends[3]=2;
                          ;//sysj\orchestrator.sysj line: 56, column: 5
                          S115469=2;
                          S115564=0;
                          if(!capperReq_o.isPartnerPresent() || capperReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 57, column: 5
                            capperReq_o.setREQ(false);//sysj\orchestrator.sysj line: 57, column: 5
                            S115564=1;
                            active[3]=1;
                            ends[3]=1;
                            tdone[3]=1;
                          }
                          else {
                            S115559=0;
                            if(capperReq_o.isACK()){//sysj\orchestrator.sysj line: 57, column: 5
                              capperReq_o.setVal(true);//sysj\orchestrator.sysj line: 57, column: 5
                              S115559=1;
                              if(!capperReq_o.isACK()){//sysj\orchestrator.sysj line: 57, column: 5
                                capperReq_o.setREQ(false);//sysj\orchestrator.sysj line: 57, column: 5
                                ends[3]=2;
                                ;//sysj\orchestrator.sysj line: 57, column: 5
                                getNextBottle_1.setPresent();//sysj\orchestrator.sysj line: 58, column: 5
                                currsigs.addElement(getNextBottle_1);
                                S115424=2;
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
                switch(S115564){
                  case 0 : 
                    if(!capperReq_o.isPartnerPresent() || capperReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 57, column: 5
                      capperReq_o.setREQ(false);//sysj\orchestrator.sysj line: 57, column: 5
                      S115564=1;
                      active[3]=1;
                      ends[3]=1;
                      tdone[3]=1;
                    }
                    else {
                      switch(S115559){
                        case 0 : 
                          if(capperReq_o.isACK()){//sysj\orchestrator.sysj line: 57, column: 5
                            capperReq_o.setVal(true);//sysj\orchestrator.sysj line: 57, column: 5
                            S115559=1;
                            if(!capperReq_o.isACK()){//sysj\orchestrator.sysj line: 57, column: 5
                              capperReq_o.setREQ(false);//sysj\orchestrator.sysj line: 57, column: 5
                              ends[3]=2;
                              ;//sysj\orchestrator.sysj line: 57, column: 5
                              getNextBottle_1.setPresent();//sysj\orchestrator.sysj line: 58, column: 5
                              currsigs.addElement(getNextBottle_1);
                              S115424=2;
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
                            S115424=2;
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
                    S115564=1;
                    S115564=0;
                    if(!capperReq_o.isPartnerPresent() || capperReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 57, column: 5
                      capperReq_o.setREQ(false);//sysj\orchestrator.sysj line: 57, column: 5
                      S115564=1;
                      active[3]=1;
                      ends[3]=1;
                      tdone[3]=1;
                    }
                    else {
                      S115559=0;
                      if(capperReq_o.isACK()){//sysj\orchestrator.sysj line: 57, column: 5
                        capperReq_o.setVal(true);//sysj\orchestrator.sysj line: 57, column: 5
                        S115559=1;
                        if(!capperReq_o.isACK()){//sysj\orchestrator.sysj line: 57, column: 5
                          capperReq_o.setREQ(false);//sysj\orchestrator.sysj line: 57, column: 5
                          ends[3]=2;
                          ;//sysj\orchestrator.sysj line: 57, column: 5
                          getNextBottle_1.setPresent();//sysj\orchestrator.sysj line: 58, column: 5
                          currsigs.addElement(getNextBottle_1);
                          S115424=2;
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
            S115424=2;
            S115424=0;
            S115408=0;
            if(!rotaryStatus_in.isPartnerPresent() || rotaryStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 49, column: 4
              rotaryStatus_in.setACK(false);//sysj\orchestrator.sysj line: 49, column: 4
              S115408=1;
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            else {
              S115403=0;
              if(!rotaryStatus_in.isREQ()){//sysj\orchestrator.sysj line: 49, column: 4
                rotaryStatus_in.setACK(true);//sysj\orchestrator.sysj line: 49, column: 4
                S115403=1;
                if(rotaryStatus_in.isREQ()){//sysj\orchestrator.sysj line: 49, column: 4
                  rotaryStatus_in.setACK(false);//sysj\orchestrator.sysj line: 49, column: 4
                  ends[3]=2;
                  ;//sysj\orchestrator.sysj line: 49, column: 4
                  rotaryStat_thread_3 = (rotaryStatus_in.getVal() == null ? null : ((String)rotaryStatus_in.getVal()));//sysj\orchestrator.sysj line: 50, column: 4
                  S115424=1;
                  if(rotaryStat_thread_3 == "done"){//sysj\orchestrator.sysj line: 53, column: 7
                    System.out.println("rotary done, sending filler,loader,screwer, conveyor reqs");//sysj\orchestrator.sysj line: 54, column: 5
                    S115469=0;
                    S115431=0;
                    if(!fillerReq_o.isPartnerPresent() || fillerReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 55, column: 5
                      fillerReq_o.setREQ(false);//sysj\orchestrator.sysj line: 55, column: 5
                      S115431=1;
                      active[3]=1;
                      ends[3]=1;
                      tdone[3]=1;
                    }
                    else {
                      S115426=0;
                      if(fillerReq_o.isACK()){//sysj\orchestrator.sysj line: 55, column: 5
                        fillerReq_o.setVal(true);//sysj\orchestrator.sysj line: 55, column: 5
                        S115426=1;
                        if(!fillerReq_o.isACK()){//sysj\orchestrator.sysj line: 55, column: 5
                          fillerReq_o.setREQ(false);//sysj\orchestrator.sysj line: 55, column: 5
                          ends[3]=2;
                          ;//sysj\orchestrator.sysj line: 55, column: 5
                          S115469=1;
                          S115476=0;
                          if(!capLoaderReq_o.isPartnerPresent() || capLoaderReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 56, column: 5
                            capLoaderReq_o.setREQ(false);//sysj\orchestrator.sysj line: 56, column: 5
                            S115476=1;
                            active[3]=1;
                            ends[3]=1;
                            tdone[3]=1;
                          }
                          else {
                            S115471=0;
                            if(capLoaderReq_o.isACK()){//sysj\orchestrator.sysj line: 56, column: 5
                              capLoaderReq_o.setVal(true);//sysj\orchestrator.sysj line: 56, column: 5
                              S115471=1;
                              if(!capLoaderReq_o.isACK()){//sysj\orchestrator.sysj line: 56, column: 5
                                capLoaderReq_o.setREQ(false);//sysj\orchestrator.sysj line: 56, column: 5
                                ends[3]=2;
                                ;//sysj\orchestrator.sysj line: 56, column: 5
                                S115469=2;
                                S115564=0;
                                if(!capperReq_o.isPartnerPresent() || capperReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 57, column: 5
                                  capperReq_o.setREQ(false);//sysj\orchestrator.sysj line: 57, column: 5
                                  S115564=1;
                                  active[3]=1;
                                  ends[3]=1;
                                  tdone[3]=1;
                                }
                                else {
                                  S115559=0;
                                  if(capperReq_o.isACK()){//sysj\orchestrator.sysj line: 57, column: 5
                                    capperReq_o.setVal(true);//sysj\orchestrator.sysj line: 57, column: 5
                                    S115559=1;
                                    if(!capperReq_o.isACK()){//sysj\orchestrator.sysj line: 57, column: 5
                                      capperReq_o.setREQ(false);//sysj\orchestrator.sysj line: 57, column: 5
                                      ends[3]=2;
                                      ;//sysj\orchestrator.sysj line: 57, column: 5
                                      getNextBottle_1.setPresent();//sysj\orchestrator.sysj line: 58, column: 5
                                      currsigs.addElement(getNextBottle_1);
                                      S115424=2;
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
                    S115424=2;
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

  public void thread121311(int [] tdone, int [] ends){
        switch(S115401){
      case 0 : 
        active[2]=0;
        ends[2]=0;
        tdone[2]=1;
        break;
      
      case 1 : 
        switch(S113885){
          case 0 : 
            switch(S113627){
              case 0 : 
                switch(S113589){
                  case 0 : 
                    if(!conveyorReq_o.isPartnerPresent() || conveyorReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 32, column: 5
                      conveyorReq_o.setREQ(false);//sysj\orchestrator.sysj line: 32, column: 5
                      S113589=1;
                      active[2]=1;
                      ends[2]=1;
                      tdone[2]=1;
                    }
                    else {
                      switch(S113584){
                        case 0 : 
                          if(conveyorReq_o.isACK()){//sysj\orchestrator.sysj line: 32, column: 5
                            conveyorReq_o.setVal(true);//sysj\orchestrator.sysj line: 32, column: 5
                            S113584=1;
                            if(!conveyorReq_o.isACK()){//sysj\orchestrator.sysj line: 32, column: 5
                              conveyorReq_o.setREQ(false);//sysj\orchestrator.sysj line: 32, column: 5
                              ends[2]=2;
                              ;//sysj\orchestrator.sysj line: 32, column: 5
                              bottlePlaced_thread_2 = bottlePlaced_thread_2 - 1;//sysj\orchestrator.sysj line: 33, column: 5
                              System.out.println(liquidPercent_thread_2.get(3));//sysj\orchestrator.sysj line: 34, column: 5
                              S113627=1;
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
                            S113627=1;
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
                    S113589=1;
                    S113589=0;
                    if(!conveyorReq_o.isPartnerPresent() || conveyorReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 32, column: 5
                      conveyorReq_o.setREQ(false);//sysj\orchestrator.sysj line: 32, column: 5
                      S113589=1;
                      active[2]=1;
                      ends[2]=1;
                      tdone[2]=1;
                    }
                    else {
                      S113584=0;
                      if(conveyorReq_o.isACK()){//sysj\orchestrator.sysj line: 32, column: 5
                        conveyorReq_o.setVal(true);//sysj\orchestrator.sysj line: 32, column: 5
                        S113584=1;
                        if(!conveyorReq_o.isACK()){//sysj\orchestrator.sysj line: 32, column: 5
                          conveyorReq_o.setREQ(false);//sysj\orchestrator.sysj line: 32, column: 5
                          ends[2]=2;
                          ;//sysj\orchestrator.sysj line: 32, column: 5
                          bottlePlaced_thread_2 = bottlePlaced_thread_2 - 1;//sysj\orchestrator.sysj line: 33, column: 5
                          System.out.println(liquidPercent_thread_2.get(3));//sysj\orchestrator.sysj line: 34, column: 5
                          S113627=1;
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
                  S113627=2;
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
                S113627=2;
                if(bottlePlaced_thread_2 >= 0){//sysj\orchestrator.sysj line: 30, column: 10
                  System.out.println("sending conveyor req?");//sysj\orchestrator.sysj line: 31, column: 5
                  S113627=0;
                  S113589=0;
                  if(!conveyorReq_o.isPartnerPresent() || conveyorReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 32, column: 5
                    conveyorReq_o.setREQ(false);//sysj\orchestrator.sysj line: 32, column: 5
                    S113589=1;
                    active[2]=1;
                    ends[2]=1;
                    tdone[2]=1;
                  }
                  else {
                    S113584=0;
                    if(conveyorReq_o.isACK()){//sysj\orchestrator.sysj line: 32, column: 5
                      conveyorReq_o.setVal(true);//sysj\orchestrator.sysj line: 32, column: 5
                      S113584=1;
                      if(!conveyorReq_o.isACK()){//sysj\orchestrator.sysj line: 32, column: 5
                        conveyorReq_o.setREQ(false);//sysj\orchestrator.sysj line: 32, column: 5
                        ends[2]=2;
                        ;//sysj\orchestrator.sysj line: 32, column: 5
                        bottlePlaced_thread_2 = bottlePlaced_thread_2 - 1;//sysj\orchestrator.sysj line: 33, column: 5
                        System.out.println(liquidPercent_thread_2.get(3));//sysj\orchestrator.sysj line: 34, column: 5
                        S113627=1;
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
                  S113885=1;
                  active[2]=1;
                  ends[2]=1;
                  tdone[2]=1;
                }
                break;
              
            }
            break;
          
          case 1 : 
            S113885=1;
            bottlePlaced_thread_2 = quantity_thread_2;//sysj\orchestrator.sysj line: 29, column: 4
            S113885=0;
            if(bottlePlaced_thread_2 >= 0){//sysj\orchestrator.sysj line: 30, column: 10
              System.out.println("sending conveyor req?");//sysj\orchestrator.sysj line: 31, column: 5
              S113627=0;
              S113589=0;
              if(!conveyorReq_o.isPartnerPresent() || conveyorReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 32, column: 5
                conveyorReq_o.setREQ(false);//sysj\orchestrator.sysj line: 32, column: 5
                S113589=1;
                active[2]=1;
                ends[2]=1;
                tdone[2]=1;
              }
              else {
                S113584=0;
                if(conveyorReq_o.isACK()){//sysj\orchestrator.sysj line: 32, column: 5
                  conveyorReq_o.setVal(true);//sysj\orchestrator.sysj line: 32, column: 5
                  S113584=1;
                  if(!conveyorReq_o.isACK()){//sysj\orchestrator.sysj line: 32, column: 5
                    conveyorReq_o.setREQ(false);//sysj\orchestrator.sysj line: 32, column: 5
                    ends[2]=2;
                    ;//sysj\orchestrator.sysj line: 32, column: 5
                    bottlePlaced_thread_2 = bottlePlaced_thread_2 - 1;//sysj\orchestrator.sysj line: 33, column: 5
                    System.out.println(liquidPercent_thread_2.get(3));//sysj\orchestrator.sysj line: 34, column: 5
                    S113627=1;
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
              S113885=1;
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread121309(int [] tdone, int [] ends){
        S121303=1;
    S118687=0;
    S118671=0;
    if(!conveyorStatus_in.isPartnerPresent() || conveyorStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 67, column: 4
      conveyorStatus_in.setACK(false);//sysj\orchestrator.sysj line: 67, column: 4
      S118671=1;
      active[4]=1;
      ends[4]=1;
      tdone[4]=1;
    }
    else {
      S118666=0;
      if(!conveyorStatus_in.isREQ()){//sysj\orchestrator.sysj line: 67, column: 4
        conveyorStatus_in.setACK(true);//sysj\orchestrator.sysj line: 67, column: 4
        S118666=1;
        if(conveyorStatus_in.isREQ()){//sysj\orchestrator.sysj line: 67, column: 4
          conveyorStatus_in.setACK(false);//sysj\orchestrator.sysj line: 67, column: 4
          ends[4]=2;
          ;//sysj\orchestrator.sysj line: 67, column: 4
          System.out.println("Received conveyor status");//sysj\orchestrator.sysj line: 68, column: 4
          S118687=1;
          S118694=0;
          if(!fillerStatus_in.isPartnerPresent() || fillerStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 69, column: 4
            fillerStatus_in.setACK(false);//sysj\orchestrator.sysj line: 69, column: 4
            S118694=1;
            active[4]=1;
            ends[4]=1;
            tdone[4]=1;
          }
          else {
            S118689=0;
            if(!fillerStatus_in.isREQ()){//sysj\orchestrator.sysj line: 69, column: 4
              fillerStatus_in.setACK(true);//sysj\orchestrator.sysj line: 69, column: 4
              S118689=1;
              if(fillerStatus_in.isREQ()){//sysj\orchestrator.sysj line: 69, column: 4
                fillerStatus_in.setACK(false);//sysj\orchestrator.sysj line: 69, column: 4
                ends[4]=2;
                ;//sysj\orchestrator.sysj line: 69, column: 4
                System.out.println("Received filler status");//sysj\orchestrator.sysj line: 70, column: 4
                S118687=2;
                S118782=0;
                if(!capLoaderStatus_in.isPartnerPresent() || capLoaderStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 72, column: 4
                  capLoaderStatus_in.setACK(false);//sysj\orchestrator.sysj line: 72, column: 4
                  S118782=1;
                  active[4]=1;
                  ends[4]=1;
                  tdone[4]=1;
                }
                else {
                  S118777=0;
                  if(!capLoaderStatus_in.isREQ()){//sysj\orchestrator.sysj line: 72, column: 4
                    capLoaderStatus_in.setACK(true);//sysj\orchestrator.sysj line: 72, column: 4
                    S118777=1;
                    if(capLoaderStatus_in.isREQ()){//sysj\orchestrator.sysj line: 72, column: 4
                      capLoaderStatus_in.setACK(false);//sysj\orchestrator.sysj line: 72, column: 4
                      ends[4]=2;
                      ;//sysj\orchestrator.sysj line: 72, column: 4
                      System.out.println("Received caploader status");//sysj\orchestrator.sysj line: 73, column: 4
                      S118687=3;
                      S118914=0;
                      if(!capperStatus_in.isPartnerPresent() || capperStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 74, column: 4
                        capperStatus_in.setACK(false);//sysj\orchestrator.sysj line: 74, column: 4
                        S118914=1;
                        active[4]=1;
                        ends[4]=1;
                        tdone[4]=1;
                      }
                      else {
                        S118909=0;
                        if(!capperStatus_in.isREQ()){//sysj\orchestrator.sysj line: 74, column: 4
                          capperStatus_in.setACK(true);//sysj\orchestrator.sysj line: 74, column: 4
                          S118909=1;
                          if(capperStatus_in.isREQ()){//sysj\orchestrator.sysj line: 74, column: 4
                            capperStatus_in.setACK(false);//sysj\orchestrator.sysj line: 74, column: 4
                            ends[4]=2;
                            ;//sysj\orchestrator.sysj line: 74, column: 4
                            System.out.println("Received capper status");//sysj\orchestrator.sysj line: 75, column: 4
                            System.out.println("All is received");//sysj\orchestrator.sysj line: 76, column: 4
                            conveyStat_thread_4 = (conveyorStatus_in.getVal() == null ? null : ((String)conveyorStatus_in.getVal()));//sysj\orchestrator.sysj line: 78, column: 4
                            fillerStat_thread_4 = (fillerStatus_in.getVal() == null ? null : ((String)fillerStatus_in.getVal()));//sysj\orchestrator.sysj line: 79, column: 4
                            screwerStat_thread_4 = (capLoaderStatus_in.getVal() == null ? null : ((String)capLoaderStatus_in.getVal()));//sysj\orchestrator.sysj line: 80, column: 4
                            loaderStat_thread_4 = (capperStatus_in.getVal() == null ? null : ((String)capperStatus_in.getVal()));//sysj\orchestrator.sysj line: 81, column: 4
                            S118687=4;
                            if((conveyStat_thread_4 == "done" || conveyStat_thread_4 == "idle") && (fillerStat_thread_4 == "done" || fillerStat_thread_4 == "idle") && (screwerStat_thread_4 == "done" || screwerStat_thread_4 == "idle") && (loaderStat_thread_4 == "done" || loaderStat_thread_4 == "idle")){//sysj\orchestrator.sysj line: 84, column: 7
                              System.out.println("sending request to rotary?");//sysj\orchestrator.sysj line: 88, column: 5
                              S119090=0;
                              if(!allOperationsFinished_o.isPartnerPresent() || allOperationsFinished_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 89, column: 5
                                allOperationsFinished_o.setREQ(false);//sysj\orchestrator.sysj line: 89, column: 5
                                S119090=1;
                                active[4]=1;
                                ends[4]=1;
                                tdone[4]=1;
                              }
                              else {
                                S119085=0;
                                if(allOperationsFinished_o.isACK()){//sysj\orchestrator.sysj line: 89, column: 5
                                  allOperationsFinished_o.setVal(true);//sysj\orchestrator.sysj line: 89, column: 5
                                  S119085=1;
                                  if(!allOperationsFinished_o.isACK()){//sysj\orchestrator.sysj line: 89, column: 5
                                    allOperationsFinished_o.setREQ(false);//sysj\orchestrator.sysj line: 89, column: 5
                                    ends[4]=2;
                                    ;//sysj\orchestrator.sysj line: 89, column: 5
                                    S118687=5;
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
                              S118687=5;
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

  public void thread121308(int [] tdone, int [] ends){
        S118664=1;
    S115424=0;
    S115408=0;
    if(!rotaryStatus_in.isPartnerPresent() || rotaryStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 49, column: 4
      rotaryStatus_in.setACK(false);//sysj\orchestrator.sysj line: 49, column: 4
      S115408=1;
      active[3]=1;
      ends[3]=1;
      tdone[3]=1;
    }
    else {
      S115403=0;
      if(!rotaryStatus_in.isREQ()){//sysj\orchestrator.sysj line: 49, column: 4
        rotaryStatus_in.setACK(true);//sysj\orchestrator.sysj line: 49, column: 4
        S115403=1;
        if(rotaryStatus_in.isREQ()){//sysj\orchestrator.sysj line: 49, column: 4
          rotaryStatus_in.setACK(false);//sysj\orchestrator.sysj line: 49, column: 4
          ends[3]=2;
          ;//sysj\orchestrator.sysj line: 49, column: 4
          rotaryStat_thread_3 = (rotaryStatus_in.getVal() == null ? null : ((String)rotaryStatus_in.getVal()));//sysj\orchestrator.sysj line: 50, column: 4
          S115424=1;
          if(rotaryStat_thread_3 == "done"){//sysj\orchestrator.sysj line: 53, column: 7
            System.out.println("rotary done, sending filler,loader,screwer, conveyor reqs");//sysj\orchestrator.sysj line: 54, column: 5
            S115469=0;
            S115431=0;
            if(!fillerReq_o.isPartnerPresent() || fillerReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 55, column: 5
              fillerReq_o.setREQ(false);//sysj\orchestrator.sysj line: 55, column: 5
              S115431=1;
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            else {
              S115426=0;
              if(fillerReq_o.isACK()){//sysj\orchestrator.sysj line: 55, column: 5
                fillerReq_o.setVal(true);//sysj\orchestrator.sysj line: 55, column: 5
                S115426=1;
                if(!fillerReq_o.isACK()){//sysj\orchestrator.sysj line: 55, column: 5
                  fillerReq_o.setREQ(false);//sysj\orchestrator.sysj line: 55, column: 5
                  ends[3]=2;
                  ;//sysj\orchestrator.sysj line: 55, column: 5
                  S115469=1;
                  S115476=0;
                  if(!capLoaderReq_o.isPartnerPresent() || capLoaderReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 56, column: 5
                    capLoaderReq_o.setREQ(false);//sysj\orchestrator.sysj line: 56, column: 5
                    S115476=1;
                    active[3]=1;
                    ends[3]=1;
                    tdone[3]=1;
                  }
                  else {
                    S115471=0;
                    if(capLoaderReq_o.isACK()){//sysj\orchestrator.sysj line: 56, column: 5
                      capLoaderReq_o.setVal(true);//sysj\orchestrator.sysj line: 56, column: 5
                      S115471=1;
                      if(!capLoaderReq_o.isACK()){//sysj\orchestrator.sysj line: 56, column: 5
                        capLoaderReq_o.setREQ(false);//sysj\orchestrator.sysj line: 56, column: 5
                        ends[3]=2;
                        ;//sysj\orchestrator.sysj line: 56, column: 5
                        S115469=2;
                        S115564=0;
                        if(!capperReq_o.isPartnerPresent() || capperReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 57, column: 5
                          capperReq_o.setREQ(false);//sysj\orchestrator.sysj line: 57, column: 5
                          S115564=1;
                          active[3]=1;
                          ends[3]=1;
                          tdone[3]=1;
                        }
                        else {
                          S115559=0;
                          if(capperReq_o.isACK()){//sysj\orchestrator.sysj line: 57, column: 5
                            capperReq_o.setVal(true);//sysj\orchestrator.sysj line: 57, column: 5
                            S115559=1;
                            if(!capperReq_o.isACK()){//sysj\orchestrator.sysj line: 57, column: 5
                              capperReq_o.setREQ(false);//sysj\orchestrator.sysj line: 57, column: 5
                              ends[3]=2;
                              ;//sysj\orchestrator.sysj line: 57, column: 5
                              getNextBottle_1.setPresent();//sysj\orchestrator.sysj line: 58, column: 5
                              currsigs.addElement(getNextBottle_1);
                              S115424=2;
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
            S115424=2;
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

  public void thread121307(int [] tdone, int [] ends){
        S115401=1;
    quantity_thread_2 = 5;//sysj\orchestrator.sysj line: 20, column: 3
    bottlePlaced_thread_2 = 0;//sysj\orchestrator.sysj line: 21, column: 3
    liquidPercent_thread_2 = new ArrayList();//sysj\orchestrator.sysj line: 22, column: 3
    liquidPercent_thread_2.add(10);//sysj\orchestrator.sysj line: 23, column: 3
    liquidPercent_thread_2.add(10);//sysj\orchestrator.sysj line: 24, column: 3
    liquidPercent_thread_2.add(20);//sysj\orchestrator.sysj line: 25, column: 3
    liquidPercent_thread_2.add(60);//sysj\orchestrator.sysj line: 26, column: 3
    bottlePlaced_thread_2 = quantity_thread_2;//sysj\orchestrator.sysj line: 29, column: 4
    S113885=0;
    if(bottlePlaced_thread_2 >= 0){//sysj\orchestrator.sysj line: 30, column: 10
      System.out.println("sending conveyor req?");//sysj\orchestrator.sysj line: 31, column: 5
      S113627=0;
      S113589=0;
      if(!conveyorReq_o.isPartnerPresent() || conveyorReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 32, column: 5
        conveyorReq_o.setREQ(false);//sysj\orchestrator.sysj line: 32, column: 5
        S113589=1;
        active[2]=1;
        ends[2]=1;
        tdone[2]=1;
      }
      else {
        S113584=0;
        if(conveyorReq_o.isACK()){//sysj\orchestrator.sysj line: 32, column: 5
          conveyorReq_o.setVal(true);//sysj\orchestrator.sysj line: 32, column: 5
          S113584=1;
          if(!conveyorReq_o.isACK()){//sysj\orchestrator.sysj line: 32, column: 5
            conveyorReq_o.setREQ(false);//sysj\orchestrator.sysj line: 32, column: 5
            ends[2]=2;
            ;//sysj\orchestrator.sysj line: 32, column: 5
            bottlePlaced_thread_2 = bottlePlaced_thread_2 - 1;//sysj\orchestrator.sysj line: 33, column: 5
            System.out.println(liquidPercent_thread_2.get(3));//sysj\orchestrator.sysj line: 34, column: 5
            S113627=1;
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
      S113885=1;
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
      switch(S121305){
        case 0 : 
          S121305=0;
          break RUN;
        
        case 1 : 
          S121305=2;
          S121305=2;
          getNextBottle_1.setClear();//sysj\orchestrator.sysj line: 16, column: 2
          thread121307(tdone,ends);
          thread121308(tdone,ends);
          thread121309(tdone,ends);
          int biggest121310 = 0;
          if(ends[2]>=biggest121310){
            biggest121310=ends[2];
          }
          if(ends[3]>=biggest121310){
            biggest121310=ends[3];
          }
          if(ends[4]>=biggest121310){
            biggest121310=ends[4];
          }
          if(biggest121310 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
        
        case 2 : 
          getNextBottle_1.setClear();//sysj\orchestrator.sysj line: 16, column: 2
          thread121311(tdone,ends);
          thread121312(tdone,ends);
          thread121313(tdone,ends);
          int biggest121314 = 0;
          if(ends[2]>=biggest121314){
            biggest121314=ends[2];
          }
          if(ends[3]>=biggest121314){
            biggest121314=ends[3];
          }
          if(ends[4]>=biggest121314){
            biggest121314=ends[4];
          }
          if(biggest121314 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
          //FINXME code
          if(biggest121314 == 0){
            S121305=0;
            active[1]=0;
            ends[1]=0;
            S121305=0;
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
