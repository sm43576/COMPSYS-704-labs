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
  private int S124455 = 1;
  private int S118551 = 1;
  private int S117035 = 1;
  private int S116777 = 1;
  private int S116739 = 1;
  private int S116734 = 1;
  private int S121814 = 1;
  private int S118574 = 1;
  private int S118558 = 1;
  private int S118553 = 1;
  private int S118619 = 1;
  private int S118581 = 1;
  private int S118576 = 1;
  private int S118626 = 1;
  private int S118621 = 1;
  private int S118714 = 1;
  private int S118709 = 1;
  private int S124453 = 1;
  private int S121837 = 1;
  private int S121821 = 1;
  private int S121816 = 1;
  private int S121844 = 1;
  private int S121839 = 1;
  private int S121932 = 1;
  private int S121927 = 1;
  private int S122064 = 1;
  private int S122059 = 1;
  private int S122240 = 1;
  private int S122235 = 1;
  
  private int[] ends = new int[5];
  private int[] tdone = new int[5];
  
  public void thread124463(int [] tdone, int [] ends){
        switch(S124453){
      case 0 : 
        active[4]=0;
        ends[4]=0;
        tdone[4]=1;
        break;
      
      case 1 : 
        switch(S121837){
          case 0 : 
            switch(S121821){
              case 0 : 
                if(!conveyorStatus_in.isPartnerPresent() || conveyorStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 67, column: 4
                  conveyorStatus_in.setACK(false);//sysj\orchestrator.sysj line: 67, column: 4
                  S121821=1;
                  active[4]=1;
                  ends[4]=1;
                  tdone[4]=1;
                }
                else {
                  switch(S121816){
                    case 0 : 
                      if(!conveyorStatus_in.isREQ()){//sysj\orchestrator.sysj line: 67, column: 4
                        conveyorStatus_in.setACK(true);//sysj\orchestrator.sysj line: 67, column: 4
                        S121816=1;
                        if(conveyorStatus_in.isREQ()){//sysj\orchestrator.sysj line: 67, column: 4
                          conveyorStatus_in.setACK(false);//sysj\orchestrator.sysj line: 67, column: 4
                          ends[4]=2;
                          ;//sysj\orchestrator.sysj line: 67, column: 4
                          System.out.println("Received conveyor status");//sysj\orchestrator.sysj line: 68, column: 4
                          S121837=1;
                          S121844=0;
                          if(!fillerStatus_in.isPartnerPresent() || fillerStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 69, column: 4
                            fillerStatus_in.setACK(false);//sysj\orchestrator.sysj line: 69, column: 4
                            S121844=1;
                            active[4]=1;
                            ends[4]=1;
                            tdone[4]=1;
                          }
                          else {
                            S121839=0;
                            if(!fillerStatus_in.isREQ()){//sysj\orchestrator.sysj line: 69, column: 4
                              fillerStatus_in.setACK(true);//sysj\orchestrator.sysj line: 69, column: 4
                              S121839=1;
                              if(fillerStatus_in.isREQ()){//sysj\orchestrator.sysj line: 69, column: 4
                                fillerStatus_in.setACK(false);//sysj\orchestrator.sysj line: 69, column: 4
                                ends[4]=2;
                                ;//sysj\orchestrator.sysj line: 69, column: 4
                                System.out.println("Received filler status");//sysj\orchestrator.sysj line: 70, column: 4
                                S121837=2;
                                S121932=0;
                                if(!capLoaderStatus_in.isPartnerPresent() || capLoaderStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 72, column: 4
                                  capLoaderStatus_in.setACK(false);//sysj\orchestrator.sysj line: 72, column: 4
                                  S121932=1;
                                  active[4]=1;
                                  ends[4]=1;
                                  tdone[4]=1;
                                }
                                else {
                                  S121927=0;
                                  if(!capLoaderStatus_in.isREQ()){//sysj\orchestrator.sysj line: 72, column: 4
                                    capLoaderStatus_in.setACK(true);//sysj\orchestrator.sysj line: 72, column: 4
                                    S121927=1;
                                    if(capLoaderStatus_in.isREQ()){//sysj\orchestrator.sysj line: 72, column: 4
                                      capLoaderStatus_in.setACK(false);//sysj\orchestrator.sysj line: 72, column: 4
                                      ends[4]=2;
                                      ;//sysj\orchestrator.sysj line: 72, column: 4
                                      System.out.println("Received caploader status");//sysj\orchestrator.sysj line: 73, column: 4
                                      S121837=3;
                                      S122064=0;
                                      if(!capperStatus_in.isPartnerPresent() || capperStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 74, column: 4
                                        capperStatus_in.setACK(false);//sysj\orchestrator.sysj line: 74, column: 4
                                        S122064=1;
                                        active[4]=1;
                                        ends[4]=1;
                                        tdone[4]=1;
                                      }
                                      else {
                                        S122059=0;
                                        if(!capperStatus_in.isREQ()){//sysj\orchestrator.sysj line: 74, column: 4
                                          capperStatus_in.setACK(true);//sysj\orchestrator.sysj line: 74, column: 4
                                          S122059=1;
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
                                            S121837=4;
                                            if((conveyStat_thread_4 == "done" || conveyStat_thread_4 == "idle") && (fillerStat_thread_4 == "done" || fillerStat_thread_4 == "idle") && (screwerStat_thread_4 == "done" || screwerStat_thread_4 == "idle") && (loaderStat_thread_4 == "done" || loaderStat_thread_4 == "idle")){//sysj\orchestrator.sysj line: 84, column: 7
                                              System.out.println("sending request to rotary?");//sysj\orchestrator.sysj line: 88, column: 5
                                              S122240=0;
                                              if(!allOperationsFinished_o.isPartnerPresent() || allOperationsFinished_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 89, column: 5
                                                allOperationsFinished_o.setREQ(false);//sysj\orchestrator.sysj line: 89, column: 5
                                                S122240=1;
                                                active[4]=1;
                                                ends[4]=1;
                                                tdone[4]=1;
                                              }
                                              else {
                                                S122235=0;
                                                if(allOperationsFinished_o.isACK()){//sysj\orchestrator.sysj line: 89, column: 5
                                                  allOperationsFinished_o.setVal(true);//sysj\orchestrator.sysj line: 89, column: 5
                                                  S122235=1;
                                                  if(!allOperationsFinished_o.isACK()){//sysj\orchestrator.sysj line: 89, column: 5
                                                    allOperationsFinished_o.setREQ(false);//sysj\orchestrator.sysj line: 89, column: 5
                                                    ends[4]=2;
                                                    ;//sysj\orchestrator.sysj line: 89, column: 5
                                                    S121837=5;
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
                                              S121837=5;
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
                        S121837=1;
                        S121844=0;
                        if(!fillerStatus_in.isPartnerPresent() || fillerStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 69, column: 4
                          fillerStatus_in.setACK(false);//sysj\orchestrator.sysj line: 69, column: 4
                          S121844=1;
                          active[4]=1;
                          ends[4]=1;
                          tdone[4]=1;
                        }
                        else {
                          S121839=0;
                          if(!fillerStatus_in.isREQ()){//sysj\orchestrator.sysj line: 69, column: 4
                            fillerStatus_in.setACK(true);//sysj\orchestrator.sysj line: 69, column: 4
                            S121839=1;
                            if(fillerStatus_in.isREQ()){//sysj\orchestrator.sysj line: 69, column: 4
                              fillerStatus_in.setACK(false);//sysj\orchestrator.sysj line: 69, column: 4
                              ends[4]=2;
                              ;//sysj\orchestrator.sysj line: 69, column: 4
                              System.out.println("Received filler status");//sysj\orchestrator.sysj line: 70, column: 4
                              S121837=2;
                              S121932=0;
                              if(!capLoaderStatus_in.isPartnerPresent() || capLoaderStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 72, column: 4
                                capLoaderStatus_in.setACK(false);//sysj\orchestrator.sysj line: 72, column: 4
                                S121932=1;
                                active[4]=1;
                                ends[4]=1;
                                tdone[4]=1;
                              }
                              else {
                                S121927=0;
                                if(!capLoaderStatus_in.isREQ()){//sysj\orchestrator.sysj line: 72, column: 4
                                  capLoaderStatus_in.setACK(true);//sysj\orchestrator.sysj line: 72, column: 4
                                  S121927=1;
                                  if(capLoaderStatus_in.isREQ()){//sysj\orchestrator.sysj line: 72, column: 4
                                    capLoaderStatus_in.setACK(false);//sysj\orchestrator.sysj line: 72, column: 4
                                    ends[4]=2;
                                    ;//sysj\orchestrator.sysj line: 72, column: 4
                                    System.out.println("Received caploader status");//sysj\orchestrator.sysj line: 73, column: 4
                                    S121837=3;
                                    S122064=0;
                                    if(!capperStatus_in.isPartnerPresent() || capperStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 74, column: 4
                                      capperStatus_in.setACK(false);//sysj\orchestrator.sysj line: 74, column: 4
                                      S122064=1;
                                      active[4]=1;
                                      ends[4]=1;
                                      tdone[4]=1;
                                    }
                                    else {
                                      S122059=0;
                                      if(!capperStatus_in.isREQ()){//sysj\orchestrator.sysj line: 74, column: 4
                                        capperStatus_in.setACK(true);//sysj\orchestrator.sysj line: 74, column: 4
                                        S122059=1;
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
                                          S121837=4;
                                          if((conveyStat_thread_4 == "done" || conveyStat_thread_4 == "idle") && (fillerStat_thread_4 == "done" || fillerStat_thread_4 == "idle") && (screwerStat_thread_4 == "done" || screwerStat_thread_4 == "idle") && (loaderStat_thread_4 == "done" || loaderStat_thread_4 == "idle")){//sysj\orchestrator.sysj line: 84, column: 7
                                            System.out.println("sending request to rotary?");//sysj\orchestrator.sysj line: 88, column: 5
                                            S122240=0;
                                            if(!allOperationsFinished_o.isPartnerPresent() || allOperationsFinished_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 89, column: 5
                                              allOperationsFinished_o.setREQ(false);//sysj\orchestrator.sysj line: 89, column: 5
                                              S122240=1;
                                              active[4]=1;
                                              ends[4]=1;
                                              tdone[4]=1;
                                            }
                                            else {
                                              S122235=0;
                                              if(allOperationsFinished_o.isACK()){//sysj\orchestrator.sysj line: 89, column: 5
                                                allOperationsFinished_o.setVal(true);//sysj\orchestrator.sysj line: 89, column: 5
                                                S122235=1;
                                                if(!allOperationsFinished_o.isACK()){//sysj\orchestrator.sysj line: 89, column: 5
                                                  allOperationsFinished_o.setREQ(false);//sysj\orchestrator.sysj line: 89, column: 5
                                                  ends[4]=2;
                                                  ;//sysj\orchestrator.sysj line: 89, column: 5
                                                  S121837=5;
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
                                            S121837=5;
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
                S121821=1;
                S121821=0;
                if(!conveyorStatus_in.isPartnerPresent() || conveyorStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 67, column: 4
                  conveyorStatus_in.setACK(false);//sysj\orchestrator.sysj line: 67, column: 4
                  S121821=1;
                  active[4]=1;
                  ends[4]=1;
                  tdone[4]=1;
                }
                else {
                  S121816=0;
                  if(!conveyorStatus_in.isREQ()){//sysj\orchestrator.sysj line: 67, column: 4
                    conveyorStatus_in.setACK(true);//sysj\orchestrator.sysj line: 67, column: 4
                    S121816=1;
                    if(conveyorStatus_in.isREQ()){//sysj\orchestrator.sysj line: 67, column: 4
                      conveyorStatus_in.setACK(false);//sysj\orchestrator.sysj line: 67, column: 4
                      ends[4]=2;
                      ;//sysj\orchestrator.sysj line: 67, column: 4
                      System.out.println("Received conveyor status");//sysj\orchestrator.sysj line: 68, column: 4
                      S121837=1;
                      S121844=0;
                      if(!fillerStatus_in.isPartnerPresent() || fillerStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 69, column: 4
                        fillerStatus_in.setACK(false);//sysj\orchestrator.sysj line: 69, column: 4
                        S121844=1;
                        active[4]=1;
                        ends[4]=1;
                        tdone[4]=1;
                      }
                      else {
                        S121839=0;
                        if(!fillerStatus_in.isREQ()){//sysj\orchestrator.sysj line: 69, column: 4
                          fillerStatus_in.setACK(true);//sysj\orchestrator.sysj line: 69, column: 4
                          S121839=1;
                          if(fillerStatus_in.isREQ()){//sysj\orchestrator.sysj line: 69, column: 4
                            fillerStatus_in.setACK(false);//sysj\orchestrator.sysj line: 69, column: 4
                            ends[4]=2;
                            ;//sysj\orchestrator.sysj line: 69, column: 4
                            System.out.println("Received filler status");//sysj\orchestrator.sysj line: 70, column: 4
                            S121837=2;
                            S121932=0;
                            if(!capLoaderStatus_in.isPartnerPresent() || capLoaderStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 72, column: 4
                              capLoaderStatus_in.setACK(false);//sysj\orchestrator.sysj line: 72, column: 4
                              S121932=1;
                              active[4]=1;
                              ends[4]=1;
                              tdone[4]=1;
                            }
                            else {
                              S121927=0;
                              if(!capLoaderStatus_in.isREQ()){//sysj\orchestrator.sysj line: 72, column: 4
                                capLoaderStatus_in.setACK(true);//sysj\orchestrator.sysj line: 72, column: 4
                                S121927=1;
                                if(capLoaderStatus_in.isREQ()){//sysj\orchestrator.sysj line: 72, column: 4
                                  capLoaderStatus_in.setACK(false);//sysj\orchestrator.sysj line: 72, column: 4
                                  ends[4]=2;
                                  ;//sysj\orchestrator.sysj line: 72, column: 4
                                  System.out.println("Received caploader status");//sysj\orchestrator.sysj line: 73, column: 4
                                  S121837=3;
                                  S122064=0;
                                  if(!capperStatus_in.isPartnerPresent() || capperStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 74, column: 4
                                    capperStatus_in.setACK(false);//sysj\orchestrator.sysj line: 74, column: 4
                                    S122064=1;
                                    active[4]=1;
                                    ends[4]=1;
                                    tdone[4]=1;
                                  }
                                  else {
                                    S122059=0;
                                    if(!capperStatus_in.isREQ()){//sysj\orchestrator.sysj line: 74, column: 4
                                      capperStatus_in.setACK(true);//sysj\orchestrator.sysj line: 74, column: 4
                                      S122059=1;
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
                                        S121837=4;
                                        if((conveyStat_thread_4 == "done" || conveyStat_thread_4 == "idle") && (fillerStat_thread_4 == "done" || fillerStat_thread_4 == "idle") && (screwerStat_thread_4 == "done" || screwerStat_thread_4 == "idle") && (loaderStat_thread_4 == "done" || loaderStat_thread_4 == "idle")){//sysj\orchestrator.sysj line: 84, column: 7
                                          System.out.println("sending request to rotary?");//sysj\orchestrator.sysj line: 88, column: 5
                                          S122240=0;
                                          if(!allOperationsFinished_o.isPartnerPresent() || allOperationsFinished_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 89, column: 5
                                            allOperationsFinished_o.setREQ(false);//sysj\orchestrator.sysj line: 89, column: 5
                                            S122240=1;
                                            active[4]=1;
                                            ends[4]=1;
                                            tdone[4]=1;
                                          }
                                          else {
                                            S122235=0;
                                            if(allOperationsFinished_o.isACK()){//sysj\orchestrator.sysj line: 89, column: 5
                                              allOperationsFinished_o.setVal(true);//sysj\orchestrator.sysj line: 89, column: 5
                                              S122235=1;
                                              if(!allOperationsFinished_o.isACK()){//sysj\orchestrator.sysj line: 89, column: 5
                                                allOperationsFinished_o.setREQ(false);//sysj\orchestrator.sysj line: 89, column: 5
                                                ends[4]=2;
                                                ;//sysj\orchestrator.sysj line: 89, column: 5
                                                S121837=5;
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
                                          S121837=5;
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
            switch(S121844){
              case 0 : 
                if(!fillerStatus_in.isPartnerPresent() || fillerStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 69, column: 4
                  fillerStatus_in.setACK(false);//sysj\orchestrator.sysj line: 69, column: 4
                  S121844=1;
                  active[4]=1;
                  ends[4]=1;
                  tdone[4]=1;
                }
                else {
                  switch(S121839){
                    case 0 : 
                      if(!fillerStatus_in.isREQ()){//sysj\orchestrator.sysj line: 69, column: 4
                        fillerStatus_in.setACK(true);//sysj\orchestrator.sysj line: 69, column: 4
                        S121839=1;
                        if(fillerStatus_in.isREQ()){//sysj\orchestrator.sysj line: 69, column: 4
                          fillerStatus_in.setACK(false);//sysj\orchestrator.sysj line: 69, column: 4
                          ends[4]=2;
                          ;//sysj\orchestrator.sysj line: 69, column: 4
                          System.out.println("Received filler status");//sysj\orchestrator.sysj line: 70, column: 4
                          S121837=2;
                          S121932=0;
                          if(!capLoaderStatus_in.isPartnerPresent() || capLoaderStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 72, column: 4
                            capLoaderStatus_in.setACK(false);//sysj\orchestrator.sysj line: 72, column: 4
                            S121932=1;
                            active[4]=1;
                            ends[4]=1;
                            tdone[4]=1;
                          }
                          else {
                            S121927=0;
                            if(!capLoaderStatus_in.isREQ()){//sysj\orchestrator.sysj line: 72, column: 4
                              capLoaderStatus_in.setACK(true);//sysj\orchestrator.sysj line: 72, column: 4
                              S121927=1;
                              if(capLoaderStatus_in.isREQ()){//sysj\orchestrator.sysj line: 72, column: 4
                                capLoaderStatus_in.setACK(false);//sysj\orchestrator.sysj line: 72, column: 4
                                ends[4]=2;
                                ;//sysj\orchestrator.sysj line: 72, column: 4
                                System.out.println("Received caploader status");//sysj\orchestrator.sysj line: 73, column: 4
                                S121837=3;
                                S122064=0;
                                if(!capperStatus_in.isPartnerPresent() || capperStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 74, column: 4
                                  capperStatus_in.setACK(false);//sysj\orchestrator.sysj line: 74, column: 4
                                  S122064=1;
                                  active[4]=1;
                                  ends[4]=1;
                                  tdone[4]=1;
                                }
                                else {
                                  S122059=0;
                                  if(!capperStatus_in.isREQ()){//sysj\orchestrator.sysj line: 74, column: 4
                                    capperStatus_in.setACK(true);//sysj\orchestrator.sysj line: 74, column: 4
                                    S122059=1;
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
                                      S121837=4;
                                      if((conveyStat_thread_4 == "done" || conveyStat_thread_4 == "idle") && (fillerStat_thread_4 == "done" || fillerStat_thread_4 == "idle") && (screwerStat_thread_4 == "done" || screwerStat_thread_4 == "idle") && (loaderStat_thread_4 == "done" || loaderStat_thread_4 == "idle")){//sysj\orchestrator.sysj line: 84, column: 7
                                        System.out.println("sending request to rotary?");//sysj\orchestrator.sysj line: 88, column: 5
                                        S122240=0;
                                        if(!allOperationsFinished_o.isPartnerPresent() || allOperationsFinished_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 89, column: 5
                                          allOperationsFinished_o.setREQ(false);//sysj\orchestrator.sysj line: 89, column: 5
                                          S122240=1;
                                          active[4]=1;
                                          ends[4]=1;
                                          tdone[4]=1;
                                        }
                                        else {
                                          S122235=0;
                                          if(allOperationsFinished_o.isACK()){//sysj\orchestrator.sysj line: 89, column: 5
                                            allOperationsFinished_o.setVal(true);//sysj\orchestrator.sysj line: 89, column: 5
                                            S122235=1;
                                            if(!allOperationsFinished_o.isACK()){//sysj\orchestrator.sysj line: 89, column: 5
                                              allOperationsFinished_o.setREQ(false);//sysj\orchestrator.sysj line: 89, column: 5
                                              ends[4]=2;
                                              ;//sysj\orchestrator.sysj line: 89, column: 5
                                              S121837=5;
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
                                        S121837=5;
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
                        S121837=2;
                        S121932=0;
                        if(!capLoaderStatus_in.isPartnerPresent() || capLoaderStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 72, column: 4
                          capLoaderStatus_in.setACK(false);//sysj\orchestrator.sysj line: 72, column: 4
                          S121932=1;
                          active[4]=1;
                          ends[4]=1;
                          tdone[4]=1;
                        }
                        else {
                          S121927=0;
                          if(!capLoaderStatus_in.isREQ()){//sysj\orchestrator.sysj line: 72, column: 4
                            capLoaderStatus_in.setACK(true);//sysj\orchestrator.sysj line: 72, column: 4
                            S121927=1;
                            if(capLoaderStatus_in.isREQ()){//sysj\orchestrator.sysj line: 72, column: 4
                              capLoaderStatus_in.setACK(false);//sysj\orchestrator.sysj line: 72, column: 4
                              ends[4]=2;
                              ;//sysj\orchestrator.sysj line: 72, column: 4
                              System.out.println("Received caploader status");//sysj\orchestrator.sysj line: 73, column: 4
                              S121837=3;
                              S122064=0;
                              if(!capperStatus_in.isPartnerPresent() || capperStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 74, column: 4
                                capperStatus_in.setACK(false);//sysj\orchestrator.sysj line: 74, column: 4
                                S122064=1;
                                active[4]=1;
                                ends[4]=1;
                                tdone[4]=1;
                              }
                              else {
                                S122059=0;
                                if(!capperStatus_in.isREQ()){//sysj\orchestrator.sysj line: 74, column: 4
                                  capperStatus_in.setACK(true);//sysj\orchestrator.sysj line: 74, column: 4
                                  S122059=1;
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
                                    S121837=4;
                                    if((conveyStat_thread_4 == "done" || conveyStat_thread_4 == "idle") && (fillerStat_thread_4 == "done" || fillerStat_thread_4 == "idle") && (screwerStat_thread_4 == "done" || screwerStat_thread_4 == "idle") && (loaderStat_thread_4 == "done" || loaderStat_thread_4 == "idle")){//sysj\orchestrator.sysj line: 84, column: 7
                                      System.out.println("sending request to rotary?");//sysj\orchestrator.sysj line: 88, column: 5
                                      S122240=0;
                                      if(!allOperationsFinished_o.isPartnerPresent() || allOperationsFinished_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 89, column: 5
                                        allOperationsFinished_o.setREQ(false);//sysj\orchestrator.sysj line: 89, column: 5
                                        S122240=1;
                                        active[4]=1;
                                        ends[4]=1;
                                        tdone[4]=1;
                                      }
                                      else {
                                        S122235=0;
                                        if(allOperationsFinished_o.isACK()){//sysj\orchestrator.sysj line: 89, column: 5
                                          allOperationsFinished_o.setVal(true);//sysj\orchestrator.sysj line: 89, column: 5
                                          S122235=1;
                                          if(!allOperationsFinished_o.isACK()){//sysj\orchestrator.sysj line: 89, column: 5
                                            allOperationsFinished_o.setREQ(false);//sysj\orchestrator.sysj line: 89, column: 5
                                            ends[4]=2;
                                            ;//sysj\orchestrator.sysj line: 89, column: 5
                                            S121837=5;
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
                                      S121837=5;
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
                S121844=1;
                S121844=0;
                if(!fillerStatus_in.isPartnerPresent() || fillerStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 69, column: 4
                  fillerStatus_in.setACK(false);//sysj\orchestrator.sysj line: 69, column: 4
                  S121844=1;
                  active[4]=1;
                  ends[4]=1;
                  tdone[4]=1;
                }
                else {
                  S121839=0;
                  if(!fillerStatus_in.isREQ()){//sysj\orchestrator.sysj line: 69, column: 4
                    fillerStatus_in.setACK(true);//sysj\orchestrator.sysj line: 69, column: 4
                    S121839=1;
                    if(fillerStatus_in.isREQ()){//sysj\orchestrator.sysj line: 69, column: 4
                      fillerStatus_in.setACK(false);//sysj\orchestrator.sysj line: 69, column: 4
                      ends[4]=2;
                      ;//sysj\orchestrator.sysj line: 69, column: 4
                      System.out.println("Received filler status");//sysj\orchestrator.sysj line: 70, column: 4
                      S121837=2;
                      S121932=0;
                      if(!capLoaderStatus_in.isPartnerPresent() || capLoaderStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 72, column: 4
                        capLoaderStatus_in.setACK(false);//sysj\orchestrator.sysj line: 72, column: 4
                        S121932=1;
                        active[4]=1;
                        ends[4]=1;
                        tdone[4]=1;
                      }
                      else {
                        S121927=0;
                        if(!capLoaderStatus_in.isREQ()){//sysj\orchestrator.sysj line: 72, column: 4
                          capLoaderStatus_in.setACK(true);//sysj\orchestrator.sysj line: 72, column: 4
                          S121927=1;
                          if(capLoaderStatus_in.isREQ()){//sysj\orchestrator.sysj line: 72, column: 4
                            capLoaderStatus_in.setACK(false);//sysj\orchestrator.sysj line: 72, column: 4
                            ends[4]=2;
                            ;//sysj\orchestrator.sysj line: 72, column: 4
                            System.out.println("Received caploader status");//sysj\orchestrator.sysj line: 73, column: 4
                            S121837=3;
                            S122064=0;
                            if(!capperStatus_in.isPartnerPresent() || capperStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 74, column: 4
                              capperStatus_in.setACK(false);//sysj\orchestrator.sysj line: 74, column: 4
                              S122064=1;
                              active[4]=1;
                              ends[4]=1;
                              tdone[4]=1;
                            }
                            else {
                              S122059=0;
                              if(!capperStatus_in.isREQ()){//sysj\orchestrator.sysj line: 74, column: 4
                                capperStatus_in.setACK(true);//sysj\orchestrator.sysj line: 74, column: 4
                                S122059=1;
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
                                  S121837=4;
                                  if((conveyStat_thread_4 == "done" || conveyStat_thread_4 == "idle") && (fillerStat_thread_4 == "done" || fillerStat_thread_4 == "idle") && (screwerStat_thread_4 == "done" || screwerStat_thread_4 == "idle") && (loaderStat_thread_4 == "done" || loaderStat_thread_4 == "idle")){//sysj\orchestrator.sysj line: 84, column: 7
                                    System.out.println("sending request to rotary?");//sysj\orchestrator.sysj line: 88, column: 5
                                    S122240=0;
                                    if(!allOperationsFinished_o.isPartnerPresent() || allOperationsFinished_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 89, column: 5
                                      allOperationsFinished_o.setREQ(false);//sysj\orchestrator.sysj line: 89, column: 5
                                      S122240=1;
                                      active[4]=1;
                                      ends[4]=1;
                                      tdone[4]=1;
                                    }
                                    else {
                                      S122235=0;
                                      if(allOperationsFinished_o.isACK()){//sysj\orchestrator.sysj line: 89, column: 5
                                        allOperationsFinished_o.setVal(true);//sysj\orchestrator.sysj line: 89, column: 5
                                        S122235=1;
                                        if(!allOperationsFinished_o.isACK()){//sysj\orchestrator.sysj line: 89, column: 5
                                          allOperationsFinished_o.setREQ(false);//sysj\orchestrator.sysj line: 89, column: 5
                                          ends[4]=2;
                                          ;//sysj\orchestrator.sysj line: 89, column: 5
                                          S121837=5;
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
                                    S121837=5;
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
            switch(S121932){
              case 0 : 
                if(!capLoaderStatus_in.isPartnerPresent() || capLoaderStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 72, column: 4
                  capLoaderStatus_in.setACK(false);//sysj\orchestrator.sysj line: 72, column: 4
                  S121932=1;
                  active[4]=1;
                  ends[4]=1;
                  tdone[4]=1;
                }
                else {
                  switch(S121927){
                    case 0 : 
                      if(!capLoaderStatus_in.isREQ()){//sysj\orchestrator.sysj line: 72, column: 4
                        capLoaderStatus_in.setACK(true);//sysj\orchestrator.sysj line: 72, column: 4
                        S121927=1;
                        if(capLoaderStatus_in.isREQ()){//sysj\orchestrator.sysj line: 72, column: 4
                          capLoaderStatus_in.setACK(false);//sysj\orchestrator.sysj line: 72, column: 4
                          ends[4]=2;
                          ;//sysj\orchestrator.sysj line: 72, column: 4
                          System.out.println("Received caploader status");//sysj\orchestrator.sysj line: 73, column: 4
                          S121837=3;
                          S122064=0;
                          if(!capperStatus_in.isPartnerPresent() || capperStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 74, column: 4
                            capperStatus_in.setACK(false);//sysj\orchestrator.sysj line: 74, column: 4
                            S122064=1;
                            active[4]=1;
                            ends[4]=1;
                            tdone[4]=1;
                          }
                          else {
                            S122059=0;
                            if(!capperStatus_in.isREQ()){//sysj\orchestrator.sysj line: 74, column: 4
                              capperStatus_in.setACK(true);//sysj\orchestrator.sysj line: 74, column: 4
                              S122059=1;
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
                                S121837=4;
                                if((conveyStat_thread_4 == "done" || conveyStat_thread_4 == "idle") && (fillerStat_thread_4 == "done" || fillerStat_thread_4 == "idle") && (screwerStat_thread_4 == "done" || screwerStat_thread_4 == "idle") && (loaderStat_thread_4 == "done" || loaderStat_thread_4 == "idle")){//sysj\orchestrator.sysj line: 84, column: 7
                                  System.out.println("sending request to rotary?");//sysj\orchestrator.sysj line: 88, column: 5
                                  S122240=0;
                                  if(!allOperationsFinished_o.isPartnerPresent() || allOperationsFinished_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 89, column: 5
                                    allOperationsFinished_o.setREQ(false);//sysj\orchestrator.sysj line: 89, column: 5
                                    S122240=1;
                                    active[4]=1;
                                    ends[4]=1;
                                    tdone[4]=1;
                                  }
                                  else {
                                    S122235=0;
                                    if(allOperationsFinished_o.isACK()){//sysj\orchestrator.sysj line: 89, column: 5
                                      allOperationsFinished_o.setVal(true);//sysj\orchestrator.sysj line: 89, column: 5
                                      S122235=1;
                                      if(!allOperationsFinished_o.isACK()){//sysj\orchestrator.sysj line: 89, column: 5
                                        allOperationsFinished_o.setREQ(false);//sysj\orchestrator.sysj line: 89, column: 5
                                        ends[4]=2;
                                        ;//sysj\orchestrator.sysj line: 89, column: 5
                                        S121837=5;
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
                                  S121837=5;
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
                        S121837=3;
                        S122064=0;
                        if(!capperStatus_in.isPartnerPresent() || capperStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 74, column: 4
                          capperStatus_in.setACK(false);//sysj\orchestrator.sysj line: 74, column: 4
                          S122064=1;
                          active[4]=1;
                          ends[4]=1;
                          tdone[4]=1;
                        }
                        else {
                          S122059=0;
                          if(!capperStatus_in.isREQ()){//sysj\orchestrator.sysj line: 74, column: 4
                            capperStatus_in.setACK(true);//sysj\orchestrator.sysj line: 74, column: 4
                            S122059=1;
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
                              S121837=4;
                              if((conveyStat_thread_4 == "done" || conveyStat_thread_4 == "idle") && (fillerStat_thread_4 == "done" || fillerStat_thread_4 == "idle") && (screwerStat_thread_4 == "done" || screwerStat_thread_4 == "idle") && (loaderStat_thread_4 == "done" || loaderStat_thread_4 == "idle")){//sysj\orchestrator.sysj line: 84, column: 7
                                System.out.println("sending request to rotary?");//sysj\orchestrator.sysj line: 88, column: 5
                                S122240=0;
                                if(!allOperationsFinished_o.isPartnerPresent() || allOperationsFinished_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 89, column: 5
                                  allOperationsFinished_o.setREQ(false);//sysj\orchestrator.sysj line: 89, column: 5
                                  S122240=1;
                                  active[4]=1;
                                  ends[4]=1;
                                  tdone[4]=1;
                                }
                                else {
                                  S122235=0;
                                  if(allOperationsFinished_o.isACK()){//sysj\orchestrator.sysj line: 89, column: 5
                                    allOperationsFinished_o.setVal(true);//sysj\orchestrator.sysj line: 89, column: 5
                                    S122235=1;
                                    if(!allOperationsFinished_o.isACK()){//sysj\orchestrator.sysj line: 89, column: 5
                                      allOperationsFinished_o.setREQ(false);//sysj\orchestrator.sysj line: 89, column: 5
                                      ends[4]=2;
                                      ;//sysj\orchestrator.sysj line: 89, column: 5
                                      S121837=5;
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
                                S121837=5;
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
                S121932=1;
                S121932=0;
                if(!capLoaderStatus_in.isPartnerPresent() || capLoaderStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 72, column: 4
                  capLoaderStatus_in.setACK(false);//sysj\orchestrator.sysj line: 72, column: 4
                  S121932=1;
                  active[4]=1;
                  ends[4]=1;
                  tdone[4]=1;
                }
                else {
                  S121927=0;
                  if(!capLoaderStatus_in.isREQ()){//sysj\orchestrator.sysj line: 72, column: 4
                    capLoaderStatus_in.setACK(true);//sysj\orchestrator.sysj line: 72, column: 4
                    S121927=1;
                    if(capLoaderStatus_in.isREQ()){//sysj\orchestrator.sysj line: 72, column: 4
                      capLoaderStatus_in.setACK(false);//sysj\orchestrator.sysj line: 72, column: 4
                      ends[4]=2;
                      ;//sysj\orchestrator.sysj line: 72, column: 4
                      System.out.println("Received caploader status");//sysj\orchestrator.sysj line: 73, column: 4
                      S121837=3;
                      S122064=0;
                      if(!capperStatus_in.isPartnerPresent() || capperStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 74, column: 4
                        capperStatus_in.setACK(false);//sysj\orchestrator.sysj line: 74, column: 4
                        S122064=1;
                        active[4]=1;
                        ends[4]=1;
                        tdone[4]=1;
                      }
                      else {
                        S122059=0;
                        if(!capperStatus_in.isREQ()){//sysj\orchestrator.sysj line: 74, column: 4
                          capperStatus_in.setACK(true);//sysj\orchestrator.sysj line: 74, column: 4
                          S122059=1;
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
                            S121837=4;
                            if((conveyStat_thread_4 == "done" || conveyStat_thread_4 == "idle") && (fillerStat_thread_4 == "done" || fillerStat_thread_4 == "idle") && (screwerStat_thread_4 == "done" || screwerStat_thread_4 == "idle") && (loaderStat_thread_4 == "done" || loaderStat_thread_4 == "idle")){//sysj\orchestrator.sysj line: 84, column: 7
                              System.out.println("sending request to rotary?");//sysj\orchestrator.sysj line: 88, column: 5
                              S122240=0;
                              if(!allOperationsFinished_o.isPartnerPresent() || allOperationsFinished_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 89, column: 5
                                allOperationsFinished_o.setREQ(false);//sysj\orchestrator.sysj line: 89, column: 5
                                S122240=1;
                                active[4]=1;
                                ends[4]=1;
                                tdone[4]=1;
                              }
                              else {
                                S122235=0;
                                if(allOperationsFinished_o.isACK()){//sysj\orchestrator.sysj line: 89, column: 5
                                  allOperationsFinished_o.setVal(true);//sysj\orchestrator.sysj line: 89, column: 5
                                  S122235=1;
                                  if(!allOperationsFinished_o.isACK()){//sysj\orchestrator.sysj line: 89, column: 5
                                    allOperationsFinished_o.setREQ(false);//sysj\orchestrator.sysj line: 89, column: 5
                                    ends[4]=2;
                                    ;//sysj\orchestrator.sysj line: 89, column: 5
                                    S121837=5;
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
                              S121837=5;
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
            switch(S122064){
              case 0 : 
                if(!capperStatus_in.isPartnerPresent() || capperStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 74, column: 4
                  capperStatus_in.setACK(false);//sysj\orchestrator.sysj line: 74, column: 4
                  S122064=1;
                  active[4]=1;
                  ends[4]=1;
                  tdone[4]=1;
                }
                else {
                  switch(S122059){
                    case 0 : 
                      if(!capperStatus_in.isREQ()){//sysj\orchestrator.sysj line: 74, column: 4
                        capperStatus_in.setACK(true);//sysj\orchestrator.sysj line: 74, column: 4
                        S122059=1;
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
                          S121837=4;
                          if((conveyStat_thread_4 == "done" || conveyStat_thread_4 == "idle") && (fillerStat_thread_4 == "done" || fillerStat_thread_4 == "idle") && (screwerStat_thread_4 == "done" || screwerStat_thread_4 == "idle") && (loaderStat_thread_4 == "done" || loaderStat_thread_4 == "idle")){//sysj\orchestrator.sysj line: 84, column: 7
                            System.out.println("sending request to rotary?");//sysj\orchestrator.sysj line: 88, column: 5
                            S122240=0;
                            if(!allOperationsFinished_o.isPartnerPresent() || allOperationsFinished_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 89, column: 5
                              allOperationsFinished_o.setREQ(false);//sysj\orchestrator.sysj line: 89, column: 5
                              S122240=1;
                              active[4]=1;
                              ends[4]=1;
                              tdone[4]=1;
                            }
                            else {
                              S122235=0;
                              if(allOperationsFinished_o.isACK()){//sysj\orchestrator.sysj line: 89, column: 5
                                allOperationsFinished_o.setVal(true);//sysj\orchestrator.sysj line: 89, column: 5
                                S122235=1;
                                if(!allOperationsFinished_o.isACK()){//sysj\orchestrator.sysj line: 89, column: 5
                                  allOperationsFinished_o.setREQ(false);//sysj\orchestrator.sysj line: 89, column: 5
                                  ends[4]=2;
                                  ;//sysj\orchestrator.sysj line: 89, column: 5
                                  S121837=5;
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
                            S121837=5;
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
                        S121837=4;
                        if((conveyStat_thread_4 == "done" || conveyStat_thread_4 == "idle") && (fillerStat_thread_4 == "done" || fillerStat_thread_4 == "idle") && (screwerStat_thread_4 == "done" || screwerStat_thread_4 == "idle") && (loaderStat_thread_4 == "done" || loaderStat_thread_4 == "idle")){//sysj\orchestrator.sysj line: 84, column: 7
                          System.out.println("sending request to rotary?");//sysj\orchestrator.sysj line: 88, column: 5
                          S122240=0;
                          if(!allOperationsFinished_o.isPartnerPresent() || allOperationsFinished_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 89, column: 5
                            allOperationsFinished_o.setREQ(false);//sysj\orchestrator.sysj line: 89, column: 5
                            S122240=1;
                            active[4]=1;
                            ends[4]=1;
                            tdone[4]=1;
                          }
                          else {
                            S122235=0;
                            if(allOperationsFinished_o.isACK()){//sysj\orchestrator.sysj line: 89, column: 5
                              allOperationsFinished_o.setVal(true);//sysj\orchestrator.sysj line: 89, column: 5
                              S122235=1;
                              if(!allOperationsFinished_o.isACK()){//sysj\orchestrator.sysj line: 89, column: 5
                                allOperationsFinished_o.setREQ(false);//sysj\orchestrator.sysj line: 89, column: 5
                                ends[4]=2;
                                ;//sysj\orchestrator.sysj line: 89, column: 5
                                S121837=5;
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
                          S121837=5;
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
                S122064=1;
                S122064=0;
                if(!capperStatus_in.isPartnerPresent() || capperStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 74, column: 4
                  capperStatus_in.setACK(false);//sysj\orchestrator.sysj line: 74, column: 4
                  S122064=1;
                  active[4]=1;
                  ends[4]=1;
                  tdone[4]=1;
                }
                else {
                  S122059=0;
                  if(!capperStatus_in.isREQ()){//sysj\orchestrator.sysj line: 74, column: 4
                    capperStatus_in.setACK(true);//sysj\orchestrator.sysj line: 74, column: 4
                    S122059=1;
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
                      S121837=4;
                      if((conveyStat_thread_4 == "done" || conveyStat_thread_4 == "idle") && (fillerStat_thread_4 == "done" || fillerStat_thread_4 == "idle") && (screwerStat_thread_4 == "done" || screwerStat_thread_4 == "idle") && (loaderStat_thread_4 == "done" || loaderStat_thread_4 == "idle")){//sysj\orchestrator.sysj line: 84, column: 7
                        System.out.println("sending request to rotary?");//sysj\orchestrator.sysj line: 88, column: 5
                        S122240=0;
                        if(!allOperationsFinished_o.isPartnerPresent() || allOperationsFinished_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 89, column: 5
                          allOperationsFinished_o.setREQ(false);//sysj\orchestrator.sysj line: 89, column: 5
                          S122240=1;
                          active[4]=1;
                          ends[4]=1;
                          tdone[4]=1;
                        }
                        else {
                          S122235=0;
                          if(allOperationsFinished_o.isACK()){//sysj\orchestrator.sysj line: 89, column: 5
                            allOperationsFinished_o.setVal(true);//sysj\orchestrator.sysj line: 89, column: 5
                            S122235=1;
                            if(!allOperationsFinished_o.isACK()){//sysj\orchestrator.sysj line: 89, column: 5
                              allOperationsFinished_o.setREQ(false);//sysj\orchestrator.sysj line: 89, column: 5
                              ends[4]=2;
                              ;//sysj\orchestrator.sysj line: 89, column: 5
                              S121837=5;
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
                        S121837=5;
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
            switch(S122240){
              case 0 : 
                if(!allOperationsFinished_o.isPartnerPresent() || allOperationsFinished_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 89, column: 5
                  allOperationsFinished_o.setREQ(false);//sysj\orchestrator.sysj line: 89, column: 5
                  S122240=1;
                  active[4]=1;
                  ends[4]=1;
                  tdone[4]=1;
                }
                else {
                  switch(S122235){
                    case 0 : 
                      if(allOperationsFinished_o.isACK()){//sysj\orchestrator.sysj line: 89, column: 5
                        allOperationsFinished_o.setVal(true);//sysj\orchestrator.sysj line: 89, column: 5
                        S122235=1;
                        if(!allOperationsFinished_o.isACK()){//sysj\orchestrator.sysj line: 89, column: 5
                          allOperationsFinished_o.setREQ(false);//sysj\orchestrator.sysj line: 89, column: 5
                          ends[4]=2;
                          ;//sysj\orchestrator.sysj line: 89, column: 5
                          S121837=5;
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
                        S121837=5;
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
                S122240=1;
                S122240=0;
                if(!allOperationsFinished_o.isPartnerPresent() || allOperationsFinished_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 89, column: 5
                  allOperationsFinished_o.setREQ(false);//sysj\orchestrator.sysj line: 89, column: 5
                  S122240=1;
                  active[4]=1;
                  ends[4]=1;
                  tdone[4]=1;
                }
                else {
                  S122235=0;
                  if(allOperationsFinished_o.isACK()){//sysj\orchestrator.sysj line: 89, column: 5
                    allOperationsFinished_o.setVal(true);//sysj\orchestrator.sysj line: 89, column: 5
                    S122235=1;
                    if(!allOperationsFinished_o.isACK()){//sysj\orchestrator.sysj line: 89, column: 5
                      allOperationsFinished_o.setREQ(false);//sysj\orchestrator.sysj line: 89, column: 5
                      ends[4]=2;
                      ;//sysj\orchestrator.sysj line: 89, column: 5
                      S121837=5;
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
            S121837=5;
            S121837=0;
            S121821=0;
            if(!conveyorStatus_in.isPartnerPresent() || conveyorStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 67, column: 4
              conveyorStatus_in.setACK(false);//sysj\orchestrator.sysj line: 67, column: 4
              S121821=1;
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            else {
              S121816=0;
              if(!conveyorStatus_in.isREQ()){//sysj\orchestrator.sysj line: 67, column: 4
                conveyorStatus_in.setACK(true);//sysj\orchestrator.sysj line: 67, column: 4
                S121816=1;
                if(conveyorStatus_in.isREQ()){//sysj\orchestrator.sysj line: 67, column: 4
                  conveyorStatus_in.setACK(false);//sysj\orchestrator.sysj line: 67, column: 4
                  ends[4]=2;
                  ;//sysj\orchestrator.sysj line: 67, column: 4
                  System.out.println("Received conveyor status");//sysj\orchestrator.sysj line: 68, column: 4
                  S121837=1;
                  S121844=0;
                  if(!fillerStatus_in.isPartnerPresent() || fillerStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 69, column: 4
                    fillerStatus_in.setACK(false);//sysj\orchestrator.sysj line: 69, column: 4
                    S121844=1;
                    active[4]=1;
                    ends[4]=1;
                    tdone[4]=1;
                  }
                  else {
                    S121839=0;
                    if(!fillerStatus_in.isREQ()){//sysj\orchestrator.sysj line: 69, column: 4
                      fillerStatus_in.setACK(true);//sysj\orchestrator.sysj line: 69, column: 4
                      S121839=1;
                      if(fillerStatus_in.isREQ()){//sysj\orchestrator.sysj line: 69, column: 4
                        fillerStatus_in.setACK(false);//sysj\orchestrator.sysj line: 69, column: 4
                        ends[4]=2;
                        ;//sysj\orchestrator.sysj line: 69, column: 4
                        System.out.println("Received filler status");//sysj\orchestrator.sysj line: 70, column: 4
                        S121837=2;
                        S121932=0;
                        if(!capLoaderStatus_in.isPartnerPresent() || capLoaderStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 72, column: 4
                          capLoaderStatus_in.setACK(false);//sysj\orchestrator.sysj line: 72, column: 4
                          S121932=1;
                          active[4]=1;
                          ends[4]=1;
                          tdone[4]=1;
                        }
                        else {
                          S121927=0;
                          if(!capLoaderStatus_in.isREQ()){//sysj\orchestrator.sysj line: 72, column: 4
                            capLoaderStatus_in.setACK(true);//sysj\orchestrator.sysj line: 72, column: 4
                            S121927=1;
                            if(capLoaderStatus_in.isREQ()){//sysj\orchestrator.sysj line: 72, column: 4
                              capLoaderStatus_in.setACK(false);//sysj\orchestrator.sysj line: 72, column: 4
                              ends[4]=2;
                              ;//sysj\orchestrator.sysj line: 72, column: 4
                              System.out.println("Received caploader status");//sysj\orchestrator.sysj line: 73, column: 4
                              S121837=3;
                              S122064=0;
                              if(!capperStatus_in.isPartnerPresent() || capperStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 74, column: 4
                                capperStatus_in.setACK(false);//sysj\orchestrator.sysj line: 74, column: 4
                                S122064=1;
                                active[4]=1;
                                ends[4]=1;
                                tdone[4]=1;
                              }
                              else {
                                S122059=0;
                                if(!capperStatus_in.isREQ()){//sysj\orchestrator.sysj line: 74, column: 4
                                  capperStatus_in.setACK(true);//sysj\orchestrator.sysj line: 74, column: 4
                                  S122059=1;
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
                                    S121837=4;
                                    if((conveyStat_thread_4 == "done" || conveyStat_thread_4 == "idle") && (fillerStat_thread_4 == "done" || fillerStat_thread_4 == "idle") && (screwerStat_thread_4 == "done" || screwerStat_thread_4 == "idle") && (loaderStat_thread_4 == "done" || loaderStat_thread_4 == "idle")){//sysj\orchestrator.sysj line: 84, column: 7
                                      System.out.println("sending request to rotary?");//sysj\orchestrator.sysj line: 88, column: 5
                                      S122240=0;
                                      if(!allOperationsFinished_o.isPartnerPresent() || allOperationsFinished_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 89, column: 5
                                        allOperationsFinished_o.setREQ(false);//sysj\orchestrator.sysj line: 89, column: 5
                                        S122240=1;
                                        active[4]=1;
                                        ends[4]=1;
                                        tdone[4]=1;
                                      }
                                      else {
                                        S122235=0;
                                        if(allOperationsFinished_o.isACK()){//sysj\orchestrator.sysj line: 89, column: 5
                                          allOperationsFinished_o.setVal(true);//sysj\orchestrator.sysj line: 89, column: 5
                                          S122235=1;
                                          if(!allOperationsFinished_o.isACK()){//sysj\orchestrator.sysj line: 89, column: 5
                                            allOperationsFinished_o.setREQ(false);//sysj\orchestrator.sysj line: 89, column: 5
                                            ends[4]=2;
                                            ;//sysj\orchestrator.sysj line: 89, column: 5
                                            S121837=5;
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
                                      S121837=5;
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

  public void thread124462(int [] tdone, int [] ends){
        switch(S121814){
      case 0 : 
        active[3]=0;
        ends[3]=0;
        tdone[3]=1;
        break;
      
      case 1 : 
        switch(S118574){
          case 0 : 
            switch(S118558){
              case 0 : 
                if(!rotaryStatus_in.isPartnerPresent() || rotaryStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 49, column: 4
                  rotaryStatus_in.setACK(false);//sysj\orchestrator.sysj line: 49, column: 4
                  S118558=1;
                  active[3]=1;
                  ends[3]=1;
                  tdone[3]=1;
                }
                else {
                  switch(S118553){
                    case 0 : 
                      if(!rotaryStatus_in.isREQ()){//sysj\orchestrator.sysj line: 49, column: 4
                        rotaryStatus_in.setACK(true);//sysj\orchestrator.sysj line: 49, column: 4
                        S118553=1;
                        if(rotaryStatus_in.isREQ()){//sysj\orchestrator.sysj line: 49, column: 4
                          rotaryStatus_in.setACK(false);//sysj\orchestrator.sysj line: 49, column: 4
                          ends[3]=2;
                          ;//sysj\orchestrator.sysj line: 49, column: 4
                          rotaryStat_thread_3 = (rotaryStatus_in.getVal() == null ? null : ((String)rotaryStatus_in.getVal()));//sysj\orchestrator.sysj line: 50, column: 4
                          S118574=1;
                          if(rotaryStat_thread_3 == "done"){//sysj\orchestrator.sysj line: 53, column: 7
                            System.out.println("rotary done, sending filler,loader,screwer, conveyor reqs");//sysj\orchestrator.sysj line: 54, column: 5
                            S118619=0;
                            S118581=0;
                            if(!fillerReq_o.isPartnerPresent() || fillerReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 55, column: 5
                              fillerReq_o.setREQ(false);//sysj\orchestrator.sysj line: 55, column: 5
                              S118581=1;
                              active[3]=1;
                              ends[3]=1;
                              tdone[3]=1;
                            }
                            else {
                              S118576=0;
                              if(fillerReq_o.isACK()){//sysj\orchestrator.sysj line: 55, column: 5
                                fillerReq_o.setVal(true);//sysj\orchestrator.sysj line: 55, column: 5
                                S118576=1;
                                if(!fillerReq_o.isACK()){//sysj\orchestrator.sysj line: 55, column: 5
                                  fillerReq_o.setREQ(false);//sysj\orchestrator.sysj line: 55, column: 5
                                  ends[3]=2;
                                  ;//sysj\orchestrator.sysj line: 55, column: 5
                                  S118619=1;
                                  S118626=0;
                                  if(!capLoaderReq_o.isPartnerPresent() || capLoaderReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 56, column: 5
                                    capLoaderReq_o.setREQ(false);//sysj\orchestrator.sysj line: 56, column: 5
                                    S118626=1;
                                    active[3]=1;
                                    ends[3]=1;
                                    tdone[3]=1;
                                  }
                                  else {
                                    S118621=0;
                                    if(capLoaderReq_o.isACK()){//sysj\orchestrator.sysj line: 56, column: 5
                                      capLoaderReq_o.setVal(true);//sysj\orchestrator.sysj line: 56, column: 5
                                      S118621=1;
                                      if(!capLoaderReq_o.isACK()){//sysj\orchestrator.sysj line: 56, column: 5
                                        capLoaderReq_o.setREQ(false);//sysj\orchestrator.sysj line: 56, column: 5
                                        ends[3]=2;
                                        ;//sysj\orchestrator.sysj line: 56, column: 5
                                        S118619=2;
                                        S118714=0;
                                        if(!capperReq_o.isPartnerPresent() || capperReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 57, column: 5
                                          capperReq_o.setREQ(false);//sysj\orchestrator.sysj line: 57, column: 5
                                          S118714=1;
                                          active[3]=1;
                                          ends[3]=1;
                                          tdone[3]=1;
                                        }
                                        else {
                                          S118709=0;
                                          if(capperReq_o.isACK()){//sysj\orchestrator.sysj line: 57, column: 5
                                            capperReq_o.setVal(true);//sysj\orchestrator.sysj line: 57, column: 5
                                            S118709=1;
                                            if(!capperReq_o.isACK()){//sysj\orchestrator.sysj line: 57, column: 5
                                              capperReq_o.setREQ(false);//sysj\orchestrator.sysj line: 57, column: 5
                                              ends[3]=2;
                                              ;//sysj\orchestrator.sysj line: 57, column: 5
                                              getNextBottle_1.setPresent();//sysj\orchestrator.sysj line: 58, column: 5
                                              currsigs.addElement(getNextBottle_1);
                                              S118574=2;
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
                            S118574=2;
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
                        S118574=1;
                        if(rotaryStat_thread_3 == "done"){//sysj\orchestrator.sysj line: 53, column: 7
                          System.out.println("rotary done, sending filler,loader,screwer, conveyor reqs");//sysj\orchestrator.sysj line: 54, column: 5
                          S118619=0;
                          S118581=0;
                          if(!fillerReq_o.isPartnerPresent() || fillerReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 55, column: 5
                            fillerReq_o.setREQ(false);//sysj\orchestrator.sysj line: 55, column: 5
                            S118581=1;
                            active[3]=1;
                            ends[3]=1;
                            tdone[3]=1;
                          }
                          else {
                            S118576=0;
                            if(fillerReq_o.isACK()){//sysj\orchestrator.sysj line: 55, column: 5
                              fillerReq_o.setVal(true);//sysj\orchestrator.sysj line: 55, column: 5
                              S118576=1;
                              if(!fillerReq_o.isACK()){//sysj\orchestrator.sysj line: 55, column: 5
                                fillerReq_o.setREQ(false);//sysj\orchestrator.sysj line: 55, column: 5
                                ends[3]=2;
                                ;//sysj\orchestrator.sysj line: 55, column: 5
                                S118619=1;
                                S118626=0;
                                if(!capLoaderReq_o.isPartnerPresent() || capLoaderReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 56, column: 5
                                  capLoaderReq_o.setREQ(false);//sysj\orchestrator.sysj line: 56, column: 5
                                  S118626=1;
                                  active[3]=1;
                                  ends[3]=1;
                                  tdone[3]=1;
                                }
                                else {
                                  S118621=0;
                                  if(capLoaderReq_o.isACK()){//sysj\orchestrator.sysj line: 56, column: 5
                                    capLoaderReq_o.setVal(true);//sysj\orchestrator.sysj line: 56, column: 5
                                    S118621=1;
                                    if(!capLoaderReq_o.isACK()){//sysj\orchestrator.sysj line: 56, column: 5
                                      capLoaderReq_o.setREQ(false);//sysj\orchestrator.sysj line: 56, column: 5
                                      ends[3]=2;
                                      ;//sysj\orchestrator.sysj line: 56, column: 5
                                      S118619=2;
                                      S118714=0;
                                      if(!capperReq_o.isPartnerPresent() || capperReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 57, column: 5
                                        capperReq_o.setREQ(false);//sysj\orchestrator.sysj line: 57, column: 5
                                        S118714=1;
                                        active[3]=1;
                                        ends[3]=1;
                                        tdone[3]=1;
                                      }
                                      else {
                                        S118709=0;
                                        if(capperReq_o.isACK()){//sysj\orchestrator.sysj line: 57, column: 5
                                          capperReq_o.setVal(true);//sysj\orchestrator.sysj line: 57, column: 5
                                          S118709=1;
                                          if(!capperReq_o.isACK()){//sysj\orchestrator.sysj line: 57, column: 5
                                            capperReq_o.setREQ(false);//sysj\orchestrator.sysj line: 57, column: 5
                                            ends[3]=2;
                                            ;//sysj\orchestrator.sysj line: 57, column: 5
                                            getNextBottle_1.setPresent();//sysj\orchestrator.sysj line: 58, column: 5
                                            currsigs.addElement(getNextBottle_1);
                                            S118574=2;
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
                          S118574=2;
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
                S118558=1;
                S118558=0;
                if(!rotaryStatus_in.isPartnerPresent() || rotaryStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 49, column: 4
                  rotaryStatus_in.setACK(false);//sysj\orchestrator.sysj line: 49, column: 4
                  S118558=1;
                  active[3]=1;
                  ends[3]=1;
                  tdone[3]=1;
                }
                else {
                  S118553=0;
                  if(!rotaryStatus_in.isREQ()){//sysj\orchestrator.sysj line: 49, column: 4
                    rotaryStatus_in.setACK(true);//sysj\orchestrator.sysj line: 49, column: 4
                    S118553=1;
                    if(rotaryStatus_in.isREQ()){//sysj\orchestrator.sysj line: 49, column: 4
                      rotaryStatus_in.setACK(false);//sysj\orchestrator.sysj line: 49, column: 4
                      ends[3]=2;
                      ;//sysj\orchestrator.sysj line: 49, column: 4
                      rotaryStat_thread_3 = (rotaryStatus_in.getVal() == null ? null : ((String)rotaryStatus_in.getVal()));//sysj\orchestrator.sysj line: 50, column: 4
                      S118574=1;
                      if(rotaryStat_thread_3 == "done"){//sysj\orchestrator.sysj line: 53, column: 7
                        System.out.println("rotary done, sending filler,loader,screwer, conveyor reqs");//sysj\orchestrator.sysj line: 54, column: 5
                        S118619=0;
                        S118581=0;
                        if(!fillerReq_o.isPartnerPresent() || fillerReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 55, column: 5
                          fillerReq_o.setREQ(false);//sysj\orchestrator.sysj line: 55, column: 5
                          S118581=1;
                          active[3]=1;
                          ends[3]=1;
                          tdone[3]=1;
                        }
                        else {
                          S118576=0;
                          if(fillerReq_o.isACK()){//sysj\orchestrator.sysj line: 55, column: 5
                            fillerReq_o.setVal(true);//sysj\orchestrator.sysj line: 55, column: 5
                            S118576=1;
                            if(!fillerReq_o.isACK()){//sysj\orchestrator.sysj line: 55, column: 5
                              fillerReq_o.setREQ(false);//sysj\orchestrator.sysj line: 55, column: 5
                              ends[3]=2;
                              ;//sysj\orchestrator.sysj line: 55, column: 5
                              S118619=1;
                              S118626=0;
                              if(!capLoaderReq_o.isPartnerPresent() || capLoaderReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 56, column: 5
                                capLoaderReq_o.setREQ(false);//sysj\orchestrator.sysj line: 56, column: 5
                                S118626=1;
                                active[3]=1;
                                ends[3]=1;
                                tdone[3]=1;
                              }
                              else {
                                S118621=0;
                                if(capLoaderReq_o.isACK()){//sysj\orchestrator.sysj line: 56, column: 5
                                  capLoaderReq_o.setVal(true);//sysj\orchestrator.sysj line: 56, column: 5
                                  S118621=1;
                                  if(!capLoaderReq_o.isACK()){//sysj\orchestrator.sysj line: 56, column: 5
                                    capLoaderReq_o.setREQ(false);//sysj\orchestrator.sysj line: 56, column: 5
                                    ends[3]=2;
                                    ;//sysj\orchestrator.sysj line: 56, column: 5
                                    S118619=2;
                                    S118714=0;
                                    if(!capperReq_o.isPartnerPresent() || capperReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 57, column: 5
                                      capperReq_o.setREQ(false);//sysj\orchestrator.sysj line: 57, column: 5
                                      S118714=1;
                                      active[3]=1;
                                      ends[3]=1;
                                      tdone[3]=1;
                                    }
                                    else {
                                      S118709=0;
                                      if(capperReq_o.isACK()){//sysj\orchestrator.sysj line: 57, column: 5
                                        capperReq_o.setVal(true);//sysj\orchestrator.sysj line: 57, column: 5
                                        S118709=1;
                                        if(!capperReq_o.isACK()){//sysj\orchestrator.sysj line: 57, column: 5
                                          capperReq_o.setREQ(false);//sysj\orchestrator.sysj line: 57, column: 5
                                          ends[3]=2;
                                          ;//sysj\orchestrator.sysj line: 57, column: 5
                                          getNextBottle_1.setPresent();//sysj\orchestrator.sysj line: 58, column: 5
                                          currsigs.addElement(getNextBottle_1);
                                          S118574=2;
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
                        S118574=2;
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
            switch(S118619){
              case 0 : 
                switch(S118581){
                  case 0 : 
                    if(!fillerReq_o.isPartnerPresent() || fillerReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 55, column: 5
                      fillerReq_o.setREQ(false);//sysj\orchestrator.sysj line: 55, column: 5
                      S118581=1;
                      active[3]=1;
                      ends[3]=1;
                      tdone[3]=1;
                    }
                    else {
                      switch(S118576){
                        case 0 : 
                          if(fillerReq_o.isACK()){//sysj\orchestrator.sysj line: 55, column: 5
                            fillerReq_o.setVal(true);//sysj\orchestrator.sysj line: 55, column: 5
                            S118576=1;
                            if(!fillerReq_o.isACK()){//sysj\orchestrator.sysj line: 55, column: 5
                              fillerReq_o.setREQ(false);//sysj\orchestrator.sysj line: 55, column: 5
                              ends[3]=2;
                              ;//sysj\orchestrator.sysj line: 55, column: 5
                              S118619=1;
                              S118626=0;
                              if(!capLoaderReq_o.isPartnerPresent() || capLoaderReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 56, column: 5
                                capLoaderReq_o.setREQ(false);//sysj\orchestrator.sysj line: 56, column: 5
                                S118626=1;
                                active[3]=1;
                                ends[3]=1;
                                tdone[3]=1;
                              }
                              else {
                                S118621=0;
                                if(capLoaderReq_o.isACK()){//sysj\orchestrator.sysj line: 56, column: 5
                                  capLoaderReq_o.setVal(true);//sysj\orchestrator.sysj line: 56, column: 5
                                  S118621=1;
                                  if(!capLoaderReq_o.isACK()){//sysj\orchestrator.sysj line: 56, column: 5
                                    capLoaderReq_o.setREQ(false);//sysj\orchestrator.sysj line: 56, column: 5
                                    ends[3]=2;
                                    ;//sysj\orchestrator.sysj line: 56, column: 5
                                    S118619=2;
                                    S118714=0;
                                    if(!capperReq_o.isPartnerPresent() || capperReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 57, column: 5
                                      capperReq_o.setREQ(false);//sysj\orchestrator.sysj line: 57, column: 5
                                      S118714=1;
                                      active[3]=1;
                                      ends[3]=1;
                                      tdone[3]=1;
                                    }
                                    else {
                                      S118709=0;
                                      if(capperReq_o.isACK()){//sysj\orchestrator.sysj line: 57, column: 5
                                        capperReq_o.setVal(true);//sysj\orchestrator.sysj line: 57, column: 5
                                        S118709=1;
                                        if(!capperReq_o.isACK()){//sysj\orchestrator.sysj line: 57, column: 5
                                          capperReq_o.setREQ(false);//sysj\orchestrator.sysj line: 57, column: 5
                                          ends[3]=2;
                                          ;//sysj\orchestrator.sysj line: 57, column: 5
                                          getNextBottle_1.setPresent();//sysj\orchestrator.sysj line: 58, column: 5
                                          currsigs.addElement(getNextBottle_1);
                                          S118574=2;
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
                            S118619=1;
                            S118626=0;
                            if(!capLoaderReq_o.isPartnerPresent() || capLoaderReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 56, column: 5
                              capLoaderReq_o.setREQ(false);//sysj\orchestrator.sysj line: 56, column: 5
                              S118626=1;
                              active[3]=1;
                              ends[3]=1;
                              tdone[3]=1;
                            }
                            else {
                              S118621=0;
                              if(capLoaderReq_o.isACK()){//sysj\orchestrator.sysj line: 56, column: 5
                                capLoaderReq_o.setVal(true);//sysj\orchestrator.sysj line: 56, column: 5
                                S118621=1;
                                if(!capLoaderReq_o.isACK()){//sysj\orchestrator.sysj line: 56, column: 5
                                  capLoaderReq_o.setREQ(false);//sysj\orchestrator.sysj line: 56, column: 5
                                  ends[3]=2;
                                  ;//sysj\orchestrator.sysj line: 56, column: 5
                                  S118619=2;
                                  S118714=0;
                                  if(!capperReq_o.isPartnerPresent() || capperReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 57, column: 5
                                    capperReq_o.setREQ(false);//sysj\orchestrator.sysj line: 57, column: 5
                                    S118714=1;
                                    active[3]=1;
                                    ends[3]=1;
                                    tdone[3]=1;
                                  }
                                  else {
                                    S118709=0;
                                    if(capperReq_o.isACK()){//sysj\orchestrator.sysj line: 57, column: 5
                                      capperReq_o.setVal(true);//sysj\orchestrator.sysj line: 57, column: 5
                                      S118709=1;
                                      if(!capperReq_o.isACK()){//sysj\orchestrator.sysj line: 57, column: 5
                                        capperReq_o.setREQ(false);//sysj\orchestrator.sysj line: 57, column: 5
                                        ends[3]=2;
                                        ;//sysj\orchestrator.sysj line: 57, column: 5
                                        getNextBottle_1.setPresent();//sysj\orchestrator.sysj line: 58, column: 5
                                        currsigs.addElement(getNextBottle_1);
                                        S118574=2;
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
                    S118581=1;
                    S118581=0;
                    if(!fillerReq_o.isPartnerPresent() || fillerReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 55, column: 5
                      fillerReq_o.setREQ(false);//sysj\orchestrator.sysj line: 55, column: 5
                      S118581=1;
                      active[3]=1;
                      ends[3]=1;
                      tdone[3]=1;
                    }
                    else {
                      S118576=0;
                      if(fillerReq_o.isACK()){//sysj\orchestrator.sysj line: 55, column: 5
                        fillerReq_o.setVal(true);//sysj\orchestrator.sysj line: 55, column: 5
                        S118576=1;
                        if(!fillerReq_o.isACK()){//sysj\orchestrator.sysj line: 55, column: 5
                          fillerReq_o.setREQ(false);//sysj\orchestrator.sysj line: 55, column: 5
                          ends[3]=2;
                          ;//sysj\orchestrator.sysj line: 55, column: 5
                          S118619=1;
                          S118626=0;
                          if(!capLoaderReq_o.isPartnerPresent() || capLoaderReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 56, column: 5
                            capLoaderReq_o.setREQ(false);//sysj\orchestrator.sysj line: 56, column: 5
                            S118626=1;
                            active[3]=1;
                            ends[3]=1;
                            tdone[3]=1;
                          }
                          else {
                            S118621=0;
                            if(capLoaderReq_o.isACK()){//sysj\orchestrator.sysj line: 56, column: 5
                              capLoaderReq_o.setVal(true);//sysj\orchestrator.sysj line: 56, column: 5
                              S118621=1;
                              if(!capLoaderReq_o.isACK()){//sysj\orchestrator.sysj line: 56, column: 5
                                capLoaderReq_o.setREQ(false);//sysj\orchestrator.sysj line: 56, column: 5
                                ends[3]=2;
                                ;//sysj\orchestrator.sysj line: 56, column: 5
                                S118619=2;
                                S118714=0;
                                if(!capperReq_o.isPartnerPresent() || capperReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 57, column: 5
                                  capperReq_o.setREQ(false);//sysj\orchestrator.sysj line: 57, column: 5
                                  S118714=1;
                                  active[3]=1;
                                  ends[3]=1;
                                  tdone[3]=1;
                                }
                                else {
                                  S118709=0;
                                  if(capperReq_o.isACK()){//sysj\orchestrator.sysj line: 57, column: 5
                                    capperReq_o.setVal(true);//sysj\orchestrator.sysj line: 57, column: 5
                                    S118709=1;
                                    if(!capperReq_o.isACK()){//sysj\orchestrator.sysj line: 57, column: 5
                                      capperReq_o.setREQ(false);//sysj\orchestrator.sysj line: 57, column: 5
                                      ends[3]=2;
                                      ;//sysj\orchestrator.sysj line: 57, column: 5
                                      getNextBottle_1.setPresent();//sysj\orchestrator.sysj line: 58, column: 5
                                      currsigs.addElement(getNextBottle_1);
                                      S118574=2;
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
                switch(S118626){
                  case 0 : 
                    if(!capLoaderReq_o.isPartnerPresent() || capLoaderReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 56, column: 5
                      capLoaderReq_o.setREQ(false);//sysj\orchestrator.sysj line: 56, column: 5
                      S118626=1;
                      active[3]=1;
                      ends[3]=1;
                      tdone[3]=1;
                    }
                    else {
                      switch(S118621){
                        case 0 : 
                          if(capLoaderReq_o.isACK()){//sysj\orchestrator.sysj line: 56, column: 5
                            capLoaderReq_o.setVal(true);//sysj\orchestrator.sysj line: 56, column: 5
                            S118621=1;
                            if(!capLoaderReq_o.isACK()){//sysj\orchestrator.sysj line: 56, column: 5
                              capLoaderReq_o.setREQ(false);//sysj\orchestrator.sysj line: 56, column: 5
                              ends[3]=2;
                              ;//sysj\orchestrator.sysj line: 56, column: 5
                              S118619=2;
                              S118714=0;
                              if(!capperReq_o.isPartnerPresent() || capperReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 57, column: 5
                                capperReq_o.setREQ(false);//sysj\orchestrator.sysj line: 57, column: 5
                                S118714=1;
                                active[3]=1;
                                ends[3]=1;
                                tdone[3]=1;
                              }
                              else {
                                S118709=0;
                                if(capperReq_o.isACK()){//sysj\orchestrator.sysj line: 57, column: 5
                                  capperReq_o.setVal(true);//sysj\orchestrator.sysj line: 57, column: 5
                                  S118709=1;
                                  if(!capperReq_o.isACK()){//sysj\orchestrator.sysj line: 57, column: 5
                                    capperReq_o.setREQ(false);//sysj\orchestrator.sysj line: 57, column: 5
                                    ends[3]=2;
                                    ;//sysj\orchestrator.sysj line: 57, column: 5
                                    getNextBottle_1.setPresent();//sysj\orchestrator.sysj line: 58, column: 5
                                    currsigs.addElement(getNextBottle_1);
                                    S118574=2;
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
                            S118619=2;
                            S118714=0;
                            if(!capperReq_o.isPartnerPresent() || capperReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 57, column: 5
                              capperReq_o.setREQ(false);//sysj\orchestrator.sysj line: 57, column: 5
                              S118714=1;
                              active[3]=1;
                              ends[3]=1;
                              tdone[3]=1;
                            }
                            else {
                              S118709=0;
                              if(capperReq_o.isACK()){//sysj\orchestrator.sysj line: 57, column: 5
                                capperReq_o.setVal(true);//sysj\orchestrator.sysj line: 57, column: 5
                                S118709=1;
                                if(!capperReq_o.isACK()){//sysj\orchestrator.sysj line: 57, column: 5
                                  capperReq_o.setREQ(false);//sysj\orchestrator.sysj line: 57, column: 5
                                  ends[3]=2;
                                  ;//sysj\orchestrator.sysj line: 57, column: 5
                                  getNextBottle_1.setPresent();//sysj\orchestrator.sysj line: 58, column: 5
                                  currsigs.addElement(getNextBottle_1);
                                  S118574=2;
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
                    S118626=1;
                    S118626=0;
                    if(!capLoaderReq_o.isPartnerPresent() || capLoaderReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 56, column: 5
                      capLoaderReq_o.setREQ(false);//sysj\orchestrator.sysj line: 56, column: 5
                      S118626=1;
                      active[3]=1;
                      ends[3]=1;
                      tdone[3]=1;
                    }
                    else {
                      S118621=0;
                      if(capLoaderReq_o.isACK()){//sysj\orchestrator.sysj line: 56, column: 5
                        capLoaderReq_o.setVal(true);//sysj\orchestrator.sysj line: 56, column: 5
                        S118621=1;
                        if(!capLoaderReq_o.isACK()){//sysj\orchestrator.sysj line: 56, column: 5
                          capLoaderReq_o.setREQ(false);//sysj\orchestrator.sysj line: 56, column: 5
                          ends[3]=2;
                          ;//sysj\orchestrator.sysj line: 56, column: 5
                          S118619=2;
                          S118714=0;
                          if(!capperReq_o.isPartnerPresent() || capperReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 57, column: 5
                            capperReq_o.setREQ(false);//sysj\orchestrator.sysj line: 57, column: 5
                            S118714=1;
                            active[3]=1;
                            ends[3]=1;
                            tdone[3]=1;
                          }
                          else {
                            S118709=0;
                            if(capperReq_o.isACK()){//sysj\orchestrator.sysj line: 57, column: 5
                              capperReq_o.setVal(true);//sysj\orchestrator.sysj line: 57, column: 5
                              S118709=1;
                              if(!capperReq_o.isACK()){//sysj\orchestrator.sysj line: 57, column: 5
                                capperReq_o.setREQ(false);//sysj\orchestrator.sysj line: 57, column: 5
                                ends[3]=2;
                                ;//sysj\orchestrator.sysj line: 57, column: 5
                                getNextBottle_1.setPresent();//sysj\orchestrator.sysj line: 58, column: 5
                                currsigs.addElement(getNextBottle_1);
                                S118574=2;
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
                switch(S118714){
                  case 0 : 
                    if(!capperReq_o.isPartnerPresent() || capperReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 57, column: 5
                      capperReq_o.setREQ(false);//sysj\orchestrator.sysj line: 57, column: 5
                      S118714=1;
                      active[3]=1;
                      ends[3]=1;
                      tdone[3]=1;
                    }
                    else {
                      switch(S118709){
                        case 0 : 
                          if(capperReq_o.isACK()){//sysj\orchestrator.sysj line: 57, column: 5
                            capperReq_o.setVal(true);//sysj\orchestrator.sysj line: 57, column: 5
                            S118709=1;
                            if(!capperReq_o.isACK()){//sysj\orchestrator.sysj line: 57, column: 5
                              capperReq_o.setREQ(false);//sysj\orchestrator.sysj line: 57, column: 5
                              ends[3]=2;
                              ;//sysj\orchestrator.sysj line: 57, column: 5
                              getNextBottle_1.setPresent();//sysj\orchestrator.sysj line: 58, column: 5
                              currsigs.addElement(getNextBottle_1);
                              S118574=2;
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
                            S118574=2;
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
                    S118714=1;
                    S118714=0;
                    if(!capperReq_o.isPartnerPresent() || capperReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 57, column: 5
                      capperReq_o.setREQ(false);//sysj\orchestrator.sysj line: 57, column: 5
                      S118714=1;
                      active[3]=1;
                      ends[3]=1;
                      tdone[3]=1;
                    }
                    else {
                      S118709=0;
                      if(capperReq_o.isACK()){//sysj\orchestrator.sysj line: 57, column: 5
                        capperReq_o.setVal(true);//sysj\orchestrator.sysj line: 57, column: 5
                        S118709=1;
                        if(!capperReq_o.isACK()){//sysj\orchestrator.sysj line: 57, column: 5
                          capperReq_o.setREQ(false);//sysj\orchestrator.sysj line: 57, column: 5
                          ends[3]=2;
                          ;//sysj\orchestrator.sysj line: 57, column: 5
                          getNextBottle_1.setPresent();//sysj\orchestrator.sysj line: 58, column: 5
                          currsigs.addElement(getNextBottle_1);
                          S118574=2;
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
            S118574=2;
            S118574=0;
            S118558=0;
            if(!rotaryStatus_in.isPartnerPresent() || rotaryStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 49, column: 4
              rotaryStatus_in.setACK(false);//sysj\orchestrator.sysj line: 49, column: 4
              S118558=1;
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            else {
              S118553=0;
              if(!rotaryStatus_in.isREQ()){//sysj\orchestrator.sysj line: 49, column: 4
                rotaryStatus_in.setACK(true);//sysj\orchestrator.sysj line: 49, column: 4
                S118553=1;
                if(rotaryStatus_in.isREQ()){//sysj\orchestrator.sysj line: 49, column: 4
                  rotaryStatus_in.setACK(false);//sysj\orchestrator.sysj line: 49, column: 4
                  ends[3]=2;
                  ;//sysj\orchestrator.sysj line: 49, column: 4
                  rotaryStat_thread_3 = (rotaryStatus_in.getVal() == null ? null : ((String)rotaryStatus_in.getVal()));//sysj\orchestrator.sysj line: 50, column: 4
                  S118574=1;
                  if(rotaryStat_thread_3 == "done"){//sysj\orchestrator.sysj line: 53, column: 7
                    System.out.println("rotary done, sending filler,loader,screwer, conveyor reqs");//sysj\orchestrator.sysj line: 54, column: 5
                    S118619=0;
                    S118581=0;
                    if(!fillerReq_o.isPartnerPresent() || fillerReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 55, column: 5
                      fillerReq_o.setREQ(false);//sysj\orchestrator.sysj line: 55, column: 5
                      S118581=1;
                      active[3]=1;
                      ends[3]=1;
                      tdone[3]=1;
                    }
                    else {
                      S118576=0;
                      if(fillerReq_o.isACK()){//sysj\orchestrator.sysj line: 55, column: 5
                        fillerReq_o.setVal(true);//sysj\orchestrator.sysj line: 55, column: 5
                        S118576=1;
                        if(!fillerReq_o.isACK()){//sysj\orchestrator.sysj line: 55, column: 5
                          fillerReq_o.setREQ(false);//sysj\orchestrator.sysj line: 55, column: 5
                          ends[3]=2;
                          ;//sysj\orchestrator.sysj line: 55, column: 5
                          S118619=1;
                          S118626=0;
                          if(!capLoaderReq_o.isPartnerPresent() || capLoaderReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 56, column: 5
                            capLoaderReq_o.setREQ(false);//sysj\orchestrator.sysj line: 56, column: 5
                            S118626=1;
                            active[3]=1;
                            ends[3]=1;
                            tdone[3]=1;
                          }
                          else {
                            S118621=0;
                            if(capLoaderReq_o.isACK()){//sysj\orchestrator.sysj line: 56, column: 5
                              capLoaderReq_o.setVal(true);//sysj\orchestrator.sysj line: 56, column: 5
                              S118621=1;
                              if(!capLoaderReq_o.isACK()){//sysj\orchestrator.sysj line: 56, column: 5
                                capLoaderReq_o.setREQ(false);//sysj\orchestrator.sysj line: 56, column: 5
                                ends[3]=2;
                                ;//sysj\orchestrator.sysj line: 56, column: 5
                                S118619=2;
                                S118714=0;
                                if(!capperReq_o.isPartnerPresent() || capperReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 57, column: 5
                                  capperReq_o.setREQ(false);//sysj\orchestrator.sysj line: 57, column: 5
                                  S118714=1;
                                  active[3]=1;
                                  ends[3]=1;
                                  tdone[3]=1;
                                }
                                else {
                                  S118709=0;
                                  if(capperReq_o.isACK()){//sysj\orchestrator.sysj line: 57, column: 5
                                    capperReq_o.setVal(true);//sysj\orchestrator.sysj line: 57, column: 5
                                    S118709=1;
                                    if(!capperReq_o.isACK()){//sysj\orchestrator.sysj line: 57, column: 5
                                      capperReq_o.setREQ(false);//sysj\orchestrator.sysj line: 57, column: 5
                                      ends[3]=2;
                                      ;//sysj\orchestrator.sysj line: 57, column: 5
                                      getNextBottle_1.setPresent();//sysj\orchestrator.sysj line: 58, column: 5
                                      currsigs.addElement(getNextBottle_1);
                                      S118574=2;
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
                    S118574=2;
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

  public void thread124461(int [] tdone, int [] ends){
        switch(S118551){
      case 0 : 
        active[2]=0;
        ends[2]=0;
        tdone[2]=1;
        break;
      
      case 1 : 
        switch(S117035){
          case 0 : 
            switch(S116777){
              case 0 : 
                switch(S116739){
                  case 0 : 
                    if(!conveyorReq_o.isPartnerPresent() || conveyorReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 32, column: 5
                      conveyorReq_o.setREQ(false);//sysj\orchestrator.sysj line: 32, column: 5
                      S116739=1;
                      active[2]=1;
                      ends[2]=1;
                      tdone[2]=1;
                    }
                    else {
                      switch(S116734){
                        case 0 : 
                          if(conveyorReq_o.isACK()){//sysj\orchestrator.sysj line: 32, column: 5
                            conveyorReq_o.setVal(true);//sysj\orchestrator.sysj line: 32, column: 5
                            S116734=1;
                            if(!conveyorReq_o.isACK()){//sysj\orchestrator.sysj line: 32, column: 5
                              conveyorReq_o.setREQ(false);//sysj\orchestrator.sysj line: 32, column: 5
                              ends[2]=2;
                              ;//sysj\orchestrator.sysj line: 32, column: 5
                              bottlePlaced_thread_2 = bottlePlaced_thread_2 - 1;//sysj\orchestrator.sysj line: 33, column: 5
                              System.out.println(liquidPercent_thread_2.get(3));//sysj\orchestrator.sysj line: 34, column: 5
                              S116777=1;
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
                            S116777=1;
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
                    S116739=1;
                    S116739=0;
                    if(!conveyorReq_o.isPartnerPresent() || conveyorReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 32, column: 5
                      conveyorReq_o.setREQ(false);//sysj\orchestrator.sysj line: 32, column: 5
                      S116739=1;
                      active[2]=1;
                      ends[2]=1;
                      tdone[2]=1;
                    }
                    else {
                      S116734=0;
                      if(conveyorReq_o.isACK()){//sysj\orchestrator.sysj line: 32, column: 5
                        conveyorReq_o.setVal(true);//sysj\orchestrator.sysj line: 32, column: 5
                        S116734=1;
                        if(!conveyorReq_o.isACK()){//sysj\orchestrator.sysj line: 32, column: 5
                          conveyorReq_o.setREQ(false);//sysj\orchestrator.sysj line: 32, column: 5
                          ends[2]=2;
                          ;//sysj\orchestrator.sysj line: 32, column: 5
                          bottlePlaced_thread_2 = bottlePlaced_thread_2 - 1;//sysj\orchestrator.sysj line: 33, column: 5
                          System.out.println(liquidPercent_thread_2.get(3));//sysj\orchestrator.sysj line: 34, column: 5
                          S116777=1;
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
                  S116777=2;
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
                S116777=2;
                if(bottlePlaced_thread_2 >= 0){//sysj\orchestrator.sysj line: 30, column: 10
                  System.out.println("sending conveyor req?");//sysj\orchestrator.sysj line: 31, column: 5
                  S116777=0;
                  S116739=0;
                  if(!conveyorReq_o.isPartnerPresent() || conveyorReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 32, column: 5
                    conveyorReq_o.setREQ(false);//sysj\orchestrator.sysj line: 32, column: 5
                    S116739=1;
                    active[2]=1;
                    ends[2]=1;
                    tdone[2]=1;
                  }
                  else {
                    S116734=0;
                    if(conveyorReq_o.isACK()){//sysj\orchestrator.sysj line: 32, column: 5
                      conveyorReq_o.setVal(true);//sysj\orchestrator.sysj line: 32, column: 5
                      S116734=1;
                      if(!conveyorReq_o.isACK()){//sysj\orchestrator.sysj line: 32, column: 5
                        conveyorReq_o.setREQ(false);//sysj\orchestrator.sysj line: 32, column: 5
                        ends[2]=2;
                        ;//sysj\orchestrator.sysj line: 32, column: 5
                        bottlePlaced_thread_2 = bottlePlaced_thread_2 - 1;//sysj\orchestrator.sysj line: 33, column: 5
                        System.out.println(liquidPercent_thread_2.get(3));//sysj\orchestrator.sysj line: 34, column: 5
                        S116777=1;
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
                  S117035=1;
                  active[2]=1;
                  ends[2]=1;
                  tdone[2]=1;
                }
                break;
              
            }
            break;
          
          case 1 : 
            S117035=1;
            bottlePlaced_thread_2 = quantity_thread_2;//sysj\orchestrator.sysj line: 29, column: 4
            S117035=0;
            if(bottlePlaced_thread_2 >= 0){//sysj\orchestrator.sysj line: 30, column: 10
              System.out.println("sending conveyor req?");//sysj\orchestrator.sysj line: 31, column: 5
              S116777=0;
              S116739=0;
              if(!conveyorReq_o.isPartnerPresent() || conveyorReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 32, column: 5
                conveyorReq_o.setREQ(false);//sysj\orchestrator.sysj line: 32, column: 5
                S116739=1;
                active[2]=1;
                ends[2]=1;
                tdone[2]=1;
              }
              else {
                S116734=0;
                if(conveyorReq_o.isACK()){//sysj\orchestrator.sysj line: 32, column: 5
                  conveyorReq_o.setVal(true);//sysj\orchestrator.sysj line: 32, column: 5
                  S116734=1;
                  if(!conveyorReq_o.isACK()){//sysj\orchestrator.sysj line: 32, column: 5
                    conveyorReq_o.setREQ(false);//sysj\orchestrator.sysj line: 32, column: 5
                    ends[2]=2;
                    ;//sysj\orchestrator.sysj line: 32, column: 5
                    bottlePlaced_thread_2 = bottlePlaced_thread_2 - 1;//sysj\orchestrator.sysj line: 33, column: 5
                    System.out.println(liquidPercent_thread_2.get(3));//sysj\orchestrator.sysj line: 34, column: 5
                    S116777=1;
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
              S117035=1;
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread124459(int [] tdone, int [] ends){
        S124453=1;
    S121837=0;
    S121821=0;
    if(!conveyorStatus_in.isPartnerPresent() || conveyorStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 67, column: 4
      conveyorStatus_in.setACK(false);//sysj\orchestrator.sysj line: 67, column: 4
      S121821=1;
      active[4]=1;
      ends[4]=1;
      tdone[4]=1;
    }
    else {
      S121816=0;
      if(!conveyorStatus_in.isREQ()){//sysj\orchestrator.sysj line: 67, column: 4
        conveyorStatus_in.setACK(true);//sysj\orchestrator.sysj line: 67, column: 4
        S121816=1;
        if(conveyorStatus_in.isREQ()){//sysj\orchestrator.sysj line: 67, column: 4
          conveyorStatus_in.setACK(false);//sysj\orchestrator.sysj line: 67, column: 4
          ends[4]=2;
          ;//sysj\orchestrator.sysj line: 67, column: 4
          System.out.println("Received conveyor status");//sysj\orchestrator.sysj line: 68, column: 4
          S121837=1;
          S121844=0;
          if(!fillerStatus_in.isPartnerPresent() || fillerStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 69, column: 4
            fillerStatus_in.setACK(false);//sysj\orchestrator.sysj line: 69, column: 4
            S121844=1;
            active[4]=1;
            ends[4]=1;
            tdone[4]=1;
          }
          else {
            S121839=0;
            if(!fillerStatus_in.isREQ()){//sysj\orchestrator.sysj line: 69, column: 4
              fillerStatus_in.setACK(true);//sysj\orchestrator.sysj line: 69, column: 4
              S121839=1;
              if(fillerStatus_in.isREQ()){//sysj\orchestrator.sysj line: 69, column: 4
                fillerStatus_in.setACK(false);//sysj\orchestrator.sysj line: 69, column: 4
                ends[4]=2;
                ;//sysj\orchestrator.sysj line: 69, column: 4
                System.out.println("Received filler status");//sysj\orchestrator.sysj line: 70, column: 4
                S121837=2;
                S121932=0;
                if(!capLoaderStatus_in.isPartnerPresent() || capLoaderStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 72, column: 4
                  capLoaderStatus_in.setACK(false);//sysj\orchestrator.sysj line: 72, column: 4
                  S121932=1;
                  active[4]=1;
                  ends[4]=1;
                  tdone[4]=1;
                }
                else {
                  S121927=0;
                  if(!capLoaderStatus_in.isREQ()){//sysj\orchestrator.sysj line: 72, column: 4
                    capLoaderStatus_in.setACK(true);//sysj\orchestrator.sysj line: 72, column: 4
                    S121927=1;
                    if(capLoaderStatus_in.isREQ()){//sysj\orchestrator.sysj line: 72, column: 4
                      capLoaderStatus_in.setACK(false);//sysj\orchestrator.sysj line: 72, column: 4
                      ends[4]=2;
                      ;//sysj\orchestrator.sysj line: 72, column: 4
                      System.out.println("Received caploader status");//sysj\orchestrator.sysj line: 73, column: 4
                      S121837=3;
                      S122064=0;
                      if(!capperStatus_in.isPartnerPresent() || capperStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 74, column: 4
                        capperStatus_in.setACK(false);//sysj\orchestrator.sysj line: 74, column: 4
                        S122064=1;
                        active[4]=1;
                        ends[4]=1;
                        tdone[4]=1;
                      }
                      else {
                        S122059=0;
                        if(!capperStatus_in.isREQ()){//sysj\orchestrator.sysj line: 74, column: 4
                          capperStatus_in.setACK(true);//sysj\orchestrator.sysj line: 74, column: 4
                          S122059=1;
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
                            S121837=4;
                            if((conveyStat_thread_4 == "done" || conveyStat_thread_4 == "idle") && (fillerStat_thread_4 == "done" || fillerStat_thread_4 == "idle") && (screwerStat_thread_4 == "done" || screwerStat_thread_4 == "idle") && (loaderStat_thread_4 == "done" || loaderStat_thread_4 == "idle")){//sysj\orchestrator.sysj line: 84, column: 7
                              System.out.println("sending request to rotary?");//sysj\orchestrator.sysj line: 88, column: 5
                              S122240=0;
                              if(!allOperationsFinished_o.isPartnerPresent() || allOperationsFinished_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 89, column: 5
                                allOperationsFinished_o.setREQ(false);//sysj\orchestrator.sysj line: 89, column: 5
                                S122240=1;
                                active[4]=1;
                                ends[4]=1;
                                tdone[4]=1;
                              }
                              else {
                                S122235=0;
                                if(allOperationsFinished_o.isACK()){//sysj\orchestrator.sysj line: 89, column: 5
                                  allOperationsFinished_o.setVal(true);//sysj\orchestrator.sysj line: 89, column: 5
                                  S122235=1;
                                  if(!allOperationsFinished_o.isACK()){//sysj\orchestrator.sysj line: 89, column: 5
                                    allOperationsFinished_o.setREQ(false);//sysj\orchestrator.sysj line: 89, column: 5
                                    ends[4]=2;
                                    ;//sysj\orchestrator.sysj line: 89, column: 5
                                    S121837=5;
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
                              S121837=5;
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

  public void thread124458(int [] tdone, int [] ends){
        S121814=1;
    S118574=0;
    S118558=0;
    if(!rotaryStatus_in.isPartnerPresent() || rotaryStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 49, column: 4
      rotaryStatus_in.setACK(false);//sysj\orchestrator.sysj line: 49, column: 4
      S118558=1;
      active[3]=1;
      ends[3]=1;
      tdone[3]=1;
    }
    else {
      S118553=0;
      if(!rotaryStatus_in.isREQ()){//sysj\orchestrator.sysj line: 49, column: 4
        rotaryStatus_in.setACK(true);//sysj\orchestrator.sysj line: 49, column: 4
        S118553=1;
        if(rotaryStatus_in.isREQ()){//sysj\orchestrator.sysj line: 49, column: 4
          rotaryStatus_in.setACK(false);//sysj\orchestrator.sysj line: 49, column: 4
          ends[3]=2;
          ;//sysj\orchestrator.sysj line: 49, column: 4
          rotaryStat_thread_3 = (rotaryStatus_in.getVal() == null ? null : ((String)rotaryStatus_in.getVal()));//sysj\orchestrator.sysj line: 50, column: 4
          S118574=1;
          if(rotaryStat_thread_3 == "done"){//sysj\orchestrator.sysj line: 53, column: 7
            System.out.println("rotary done, sending filler,loader,screwer, conveyor reqs");//sysj\orchestrator.sysj line: 54, column: 5
            S118619=0;
            S118581=0;
            if(!fillerReq_o.isPartnerPresent() || fillerReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 55, column: 5
              fillerReq_o.setREQ(false);//sysj\orchestrator.sysj line: 55, column: 5
              S118581=1;
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            else {
              S118576=0;
              if(fillerReq_o.isACK()){//sysj\orchestrator.sysj line: 55, column: 5
                fillerReq_o.setVal(true);//sysj\orchestrator.sysj line: 55, column: 5
                S118576=1;
                if(!fillerReq_o.isACK()){//sysj\orchestrator.sysj line: 55, column: 5
                  fillerReq_o.setREQ(false);//sysj\orchestrator.sysj line: 55, column: 5
                  ends[3]=2;
                  ;//sysj\orchestrator.sysj line: 55, column: 5
                  S118619=1;
                  S118626=0;
                  if(!capLoaderReq_o.isPartnerPresent() || capLoaderReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 56, column: 5
                    capLoaderReq_o.setREQ(false);//sysj\orchestrator.sysj line: 56, column: 5
                    S118626=1;
                    active[3]=1;
                    ends[3]=1;
                    tdone[3]=1;
                  }
                  else {
                    S118621=0;
                    if(capLoaderReq_o.isACK()){//sysj\orchestrator.sysj line: 56, column: 5
                      capLoaderReq_o.setVal(true);//sysj\orchestrator.sysj line: 56, column: 5
                      S118621=1;
                      if(!capLoaderReq_o.isACK()){//sysj\orchestrator.sysj line: 56, column: 5
                        capLoaderReq_o.setREQ(false);//sysj\orchestrator.sysj line: 56, column: 5
                        ends[3]=2;
                        ;//sysj\orchestrator.sysj line: 56, column: 5
                        S118619=2;
                        S118714=0;
                        if(!capperReq_o.isPartnerPresent() || capperReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 57, column: 5
                          capperReq_o.setREQ(false);//sysj\orchestrator.sysj line: 57, column: 5
                          S118714=1;
                          active[3]=1;
                          ends[3]=1;
                          tdone[3]=1;
                        }
                        else {
                          S118709=0;
                          if(capperReq_o.isACK()){//sysj\orchestrator.sysj line: 57, column: 5
                            capperReq_o.setVal(true);//sysj\orchestrator.sysj line: 57, column: 5
                            S118709=1;
                            if(!capperReq_o.isACK()){//sysj\orchestrator.sysj line: 57, column: 5
                              capperReq_o.setREQ(false);//sysj\orchestrator.sysj line: 57, column: 5
                              ends[3]=2;
                              ;//sysj\orchestrator.sysj line: 57, column: 5
                              getNextBottle_1.setPresent();//sysj\orchestrator.sysj line: 58, column: 5
                              currsigs.addElement(getNextBottle_1);
                              S118574=2;
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
            S118574=2;
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

  public void thread124457(int [] tdone, int [] ends){
        S118551=1;
    quantity_thread_2 = 5;//sysj\orchestrator.sysj line: 20, column: 3
    bottlePlaced_thread_2 = 0;//sysj\orchestrator.sysj line: 21, column: 3
    liquidPercent_thread_2 = new ArrayList();//sysj\orchestrator.sysj line: 22, column: 3
    liquidPercent_thread_2.add(10);//sysj\orchestrator.sysj line: 23, column: 3
    liquidPercent_thread_2.add(10);//sysj\orchestrator.sysj line: 24, column: 3
    liquidPercent_thread_2.add(20);//sysj\orchestrator.sysj line: 25, column: 3
    liquidPercent_thread_2.add(60);//sysj\orchestrator.sysj line: 26, column: 3
    bottlePlaced_thread_2 = quantity_thread_2;//sysj\orchestrator.sysj line: 29, column: 4
    S117035=0;
    if(bottlePlaced_thread_2 >= 0){//sysj\orchestrator.sysj line: 30, column: 10
      System.out.println("sending conveyor req?");//sysj\orchestrator.sysj line: 31, column: 5
      S116777=0;
      S116739=0;
      if(!conveyorReq_o.isPartnerPresent() || conveyorReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 32, column: 5
        conveyorReq_o.setREQ(false);//sysj\orchestrator.sysj line: 32, column: 5
        S116739=1;
        active[2]=1;
        ends[2]=1;
        tdone[2]=1;
      }
      else {
        S116734=0;
        if(conveyorReq_o.isACK()){//sysj\orchestrator.sysj line: 32, column: 5
          conveyorReq_o.setVal(true);//sysj\orchestrator.sysj line: 32, column: 5
          S116734=1;
          if(!conveyorReq_o.isACK()){//sysj\orchestrator.sysj line: 32, column: 5
            conveyorReq_o.setREQ(false);//sysj\orchestrator.sysj line: 32, column: 5
            ends[2]=2;
            ;//sysj\orchestrator.sysj line: 32, column: 5
            bottlePlaced_thread_2 = bottlePlaced_thread_2 - 1;//sysj\orchestrator.sysj line: 33, column: 5
            System.out.println(liquidPercent_thread_2.get(3));//sysj\orchestrator.sysj line: 34, column: 5
            S116777=1;
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
      S117035=1;
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
      switch(S124455){
        case 0 : 
          S124455=0;
          break RUN;
        
        case 1 : 
          S124455=2;
          S124455=2;
          getNextBottle_1.setClear();//sysj\orchestrator.sysj line: 16, column: 2
          thread124457(tdone,ends);
          thread124458(tdone,ends);
          thread124459(tdone,ends);
          int biggest124460 = 0;
          if(ends[2]>=biggest124460){
            biggest124460=ends[2];
          }
          if(ends[3]>=biggest124460){
            biggest124460=ends[3];
          }
          if(ends[4]>=biggest124460){
            biggest124460=ends[4];
          }
          if(biggest124460 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
        
        case 2 : 
          getNextBottle_1.setClear();//sysj\orchestrator.sysj line: 16, column: 2
          thread124461(tdone,ends);
          thread124462(tdone,ends);
          thread124463(tdone,ends);
          int biggest124464 = 0;
          if(ends[2]>=biggest124464){
            biggest124464=ends[2];
          }
          if(ends[3]>=biggest124464){
            biggest124464=ends[3];
          }
          if(ends[4]>=biggest124464){
            biggest124464=ends[4];
          }
          if(biggest124464 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
          //FINXME code
          if(biggest124464 == 0){
            S124455=0;
            active[1]=0;
            ends[1]=0;
            S124455=0;
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
