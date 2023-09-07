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
  private ArrayList liquidPercent_thread_3;//sysj\orchestrator.sysj line: 47, column: 3
  private String rotaryStat_thread_3;//sysj\orchestrator.sysj line: 54, column: 4
  private String conveyValue_thread_4;//sysj\orchestrator.sysj line: 78, column: 4
  private String fillerValue_thread_5;//sysj\orchestrator.sysj line: 95, column: 4
  private String capperValue_thread_6;//sysj\orchestrator.sysj line: 111, column: 4
  private String capLoaderValue_thread_7;//sysj\orchestrator.sysj line: 127, column: 4
  private int S136808 = 1;
  private int S119733 = 1;
  private int S118217 = 1;
  private int S117959 = 1;
  private int S117921 = 1;
  private int S117916 = 1;
  private int S136313 = 1;
  private int S119757 = 1;
  private int S119741 = 1;
  private int S119736 = 1;
  private int S120442 = 1;
  private int S119802 = 1;
  private int S119764 = 1;
  private int S119759 = 1;
  private int S119809 = 1;
  private int S119804 = 1;
  private int S119897 = 1;
  private int S119892 = 1;
  private int S120029 = 1;
  private int S120024 = 1;
  private int S120309 = 1;
  private int S120205 = 1;
  private int S120200 = 1;
  private int S120227 = 1;
  private int S120222 = 1;
  private int S120316 = 1;
  private int S120311 = 1;
  private int S136384 = 1;
  private int S136336 = 1;
  private int S136320 = 1;
  private int S136315 = 1;
  private int S136455 = 1;
  private int S136407 = 1;
  private int S136391 = 1;
  private int S136386 = 1;
  private int S136526 = 1;
  private int S136478 = 1;
  private int S136462 = 1;
  private int S136457 = 1;
  private int S136597 = 1;
  private int S136549 = 1;
  private int S136533 = 1;
  private int S136528 = 1;
  private int S136806 = 1;
  private int S136666 = 1;
  private int S136665 = 1;
  private int S136605 = 1;
  private int S136600 = 1;
  private int S136649 = 1;
  private int S136644 = 1;
  
  private int[] ends = new int[9];
  private int[] tdone = new int[9];
  
  public void thread136824(int [] tdone, int [] ends){
        switch(S136806){
      case 0 : 
        active[8]=0;
        ends[8]=0;
        tdone[8]=1;
        break;
      
      case 1 : 
        switch(S136666){
          case 0 : 
            switch(S136665){
              case 0 : 
                switch(S136605){
                  case 0 : 
                    if(!allOperationsFinished_o.isPartnerPresent() || allOperationsFinished_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 151, column: 5
                      allOperationsFinished_o.setREQ(false);//sysj\orchestrator.sysj line: 151, column: 5
                      S136605=1;
                      active[8]=1;
                      ends[8]=1;
                      tdone[8]=1;
                    }
                    else {
                      switch(S136600){
                        case 0 : 
                          if(allOperationsFinished_o.isACK()){//sysj\orchestrator.sysj line: 151, column: 5
                            allOperationsFinished_o.setVal(true);//sysj\orchestrator.sysj line: 151, column: 5
                            S136600=1;
                            if(!allOperationsFinished_o.isACK()){//sysj\orchestrator.sysj line: 151, column: 5
                              allOperationsFinished_o.setREQ(false);//sysj\orchestrator.sysj line: 151, column: 5
                              ends[8]=2;
                              ;//sysj\orchestrator.sysj line: 151, column: 5
                              S136666=1;
                              active[8]=1;
                              ends[8]=1;
                              tdone[8]=1;
                            }
                            else {
                              active[8]=1;
                              ends[8]=1;
                              tdone[8]=1;
                            }
                          }
                          else {
                            active[8]=1;
                            ends[8]=1;
                            tdone[8]=1;
                          }
                          break;
                        
                        case 1 : 
                          if(!allOperationsFinished_o.isACK()){//sysj\orchestrator.sysj line: 151, column: 5
                            allOperationsFinished_o.setREQ(false);//sysj\orchestrator.sysj line: 151, column: 5
                            ends[8]=2;
                            ;//sysj\orchestrator.sysj line: 151, column: 5
                            S136666=1;
                            active[8]=1;
                            ends[8]=1;
                            tdone[8]=1;
                          }
                          else {
                            active[8]=1;
                            ends[8]=1;
                            tdone[8]=1;
                          }
                          break;
                        
                      }
                    }
                    break;
                  
                  case 1 : 
                    S136605=1;
                    S136605=0;
                    if(!allOperationsFinished_o.isPartnerPresent() || allOperationsFinished_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 151, column: 5
                      allOperationsFinished_o.setREQ(false);//sysj\orchestrator.sysj line: 151, column: 5
                      S136605=1;
                      active[8]=1;
                      ends[8]=1;
                      tdone[8]=1;
                    }
                    else {
                      S136600=0;
                      if(allOperationsFinished_o.isACK()){//sysj\orchestrator.sysj line: 151, column: 5
                        allOperationsFinished_o.setVal(true);//sysj\orchestrator.sysj line: 151, column: 5
                        S136600=1;
                        if(!allOperationsFinished_o.isACK()){//sysj\orchestrator.sysj line: 151, column: 5
                          allOperationsFinished_o.setREQ(false);//sysj\orchestrator.sysj line: 151, column: 5
                          ends[8]=2;
                          ;//sysj\orchestrator.sysj line: 151, column: 5
                          S136666=1;
                          active[8]=1;
                          ends[8]=1;
                          tdone[8]=1;
                        }
                        else {
                          active[8]=1;
                          ends[8]=1;
                          tdone[8]=1;
                        }
                      }
                      else {
                        active[8]=1;
                        ends[8]=1;
                        tdone[8]=1;
                      }
                    }
                    break;
                  
                }
                break;
              
              case 1 : 
                switch(S136649){
                  case 0 : 
                    if(!allOperationsFinished_o.isPartnerPresent() || allOperationsFinished_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 154, column: 5
                      allOperationsFinished_o.setREQ(false);//sysj\orchestrator.sysj line: 154, column: 5
                      S136649=1;
                      active[8]=1;
                      ends[8]=1;
                      tdone[8]=1;
                    }
                    else {
                      switch(S136644){
                        case 0 : 
                          if(allOperationsFinished_o.isACK()){//sysj\orchestrator.sysj line: 154, column: 5
                            allOperationsFinished_o.setVal(false);//sysj\orchestrator.sysj line: 154, column: 5
                            S136644=1;
                            if(!allOperationsFinished_o.isACK()){//sysj\orchestrator.sysj line: 154, column: 5
                              allOperationsFinished_o.setREQ(false);//sysj\orchestrator.sysj line: 154, column: 5
                              ends[8]=2;
                              ;//sysj\orchestrator.sysj line: 154, column: 5
                              S136666=1;
                              active[8]=1;
                              ends[8]=1;
                              tdone[8]=1;
                            }
                            else {
                              active[8]=1;
                              ends[8]=1;
                              tdone[8]=1;
                            }
                          }
                          else {
                            active[8]=1;
                            ends[8]=1;
                            tdone[8]=1;
                          }
                          break;
                        
                        case 1 : 
                          if(!allOperationsFinished_o.isACK()){//sysj\orchestrator.sysj line: 154, column: 5
                            allOperationsFinished_o.setREQ(false);//sysj\orchestrator.sysj line: 154, column: 5
                            ends[8]=2;
                            ;//sysj\orchestrator.sysj line: 154, column: 5
                            S136666=1;
                            active[8]=1;
                            ends[8]=1;
                            tdone[8]=1;
                          }
                          else {
                            active[8]=1;
                            ends[8]=1;
                            tdone[8]=1;
                          }
                          break;
                        
                      }
                    }
                    break;
                  
                  case 1 : 
                    S136649=1;
                    S136649=0;
                    if(!allOperationsFinished_o.isPartnerPresent() || allOperationsFinished_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 154, column: 5
                      allOperationsFinished_o.setREQ(false);//sysj\orchestrator.sysj line: 154, column: 5
                      S136649=1;
                      active[8]=1;
                      ends[8]=1;
                      tdone[8]=1;
                    }
                    else {
                      S136644=0;
                      if(allOperationsFinished_o.isACK()){//sysj\orchestrator.sysj line: 154, column: 5
                        allOperationsFinished_o.setVal(false);//sysj\orchestrator.sysj line: 154, column: 5
                        S136644=1;
                        if(!allOperationsFinished_o.isACK()){//sysj\orchestrator.sysj line: 154, column: 5
                          allOperationsFinished_o.setREQ(false);//sysj\orchestrator.sysj line: 154, column: 5
                          ends[8]=2;
                          ;//sysj\orchestrator.sysj line: 154, column: 5
                          S136666=1;
                          active[8]=1;
                          ends[8]=1;
                          tdone[8]=1;
                        }
                        else {
                          active[8]=1;
                          ends[8]=1;
                          tdone[8]=1;
                        }
                      }
                      else {
                        active[8]=1;
                        ends[8]=1;
                        tdone[8]=1;
                      }
                    }
                    break;
                  
                }
                break;
              
            }
            break;
          
          case 1 : 
            S136666=1;
            S136666=0;
            if((Status.conveyStat == false) && (Status.fillerStat == false) && (Status.capperStat == false) && (Status.capLoaderStat == false)){//sysj\orchestrator.sysj line: 145, column: 7
              S136665=0;
              System.out.println("Orch sending rotary req");//sysj\orchestrator.sysj line: 149, column: 5
              Status.conveyStat = true;//sysj\orchestrator.sysj line: 150, column: 5
              S136605=0;
              if(!allOperationsFinished_o.isPartnerPresent() || allOperationsFinished_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 151, column: 5
                allOperationsFinished_o.setREQ(false);//sysj\orchestrator.sysj line: 151, column: 5
                S136605=1;
                active[8]=1;
                ends[8]=1;
                tdone[8]=1;
              }
              else {
                S136600=0;
                if(allOperationsFinished_o.isACK()){//sysj\orchestrator.sysj line: 151, column: 5
                  allOperationsFinished_o.setVal(true);//sysj\orchestrator.sysj line: 151, column: 5
                  S136600=1;
                  if(!allOperationsFinished_o.isACK()){//sysj\orchestrator.sysj line: 151, column: 5
                    allOperationsFinished_o.setREQ(false);//sysj\orchestrator.sysj line: 151, column: 5
                    ends[8]=2;
                    ;//sysj\orchestrator.sysj line: 151, column: 5
                    S136666=1;
                    active[8]=1;
                    ends[8]=1;
                    tdone[8]=1;
                  }
                  else {
                    active[8]=1;
                    ends[8]=1;
                    tdone[8]=1;
                  }
                }
                else {
                  active[8]=1;
                  ends[8]=1;
                  tdone[8]=1;
                }
              }
            }
            else {
              S136665=1;
              S136649=0;
              if(!allOperationsFinished_o.isPartnerPresent() || allOperationsFinished_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 154, column: 5
                allOperationsFinished_o.setREQ(false);//sysj\orchestrator.sysj line: 154, column: 5
                S136649=1;
                active[8]=1;
                ends[8]=1;
                tdone[8]=1;
              }
              else {
                S136644=0;
                if(allOperationsFinished_o.isACK()){//sysj\orchestrator.sysj line: 154, column: 5
                  allOperationsFinished_o.setVal(false);//sysj\orchestrator.sysj line: 154, column: 5
                  S136644=1;
                  if(!allOperationsFinished_o.isACK()){//sysj\orchestrator.sysj line: 154, column: 5
                    allOperationsFinished_o.setREQ(false);//sysj\orchestrator.sysj line: 154, column: 5
                    ends[8]=2;
                    ;//sysj\orchestrator.sysj line: 154, column: 5
                    S136666=1;
                    active[8]=1;
                    ends[8]=1;
                    tdone[8]=1;
                  }
                  else {
                    active[8]=1;
                    ends[8]=1;
                    tdone[8]=1;
                  }
                }
                else {
                  active[8]=1;
                  ends[8]=1;
                  tdone[8]=1;
                }
              }
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread136823(int [] tdone, int [] ends){
        switch(S136597){
      case 0 : 
        active[7]=0;
        ends[7]=0;
        tdone[7]=1;
        break;
      
      case 1 : 
        switch(S136549){
          case 0 : 
            switch(S136533){
              case 0 : 
                if(!capLoaderStatus_in.isPartnerPresent() || capLoaderStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 126, column: 4
                  capLoaderStatus_in.setACK(false);//sysj\orchestrator.sysj line: 126, column: 4
                  S136533=1;
                  active[7]=1;
                  ends[7]=1;
                  tdone[7]=1;
                }
                else {
                  switch(S136528){
                    case 0 : 
                      if(!capLoaderStatus_in.isREQ()){//sysj\orchestrator.sysj line: 126, column: 4
                        capLoaderStatus_in.setACK(true);//sysj\orchestrator.sysj line: 126, column: 4
                        S136528=1;
                        if(capLoaderStatus_in.isREQ()){//sysj\orchestrator.sysj line: 126, column: 4
                          capLoaderStatus_in.setACK(false);//sysj\orchestrator.sysj line: 126, column: 4
                          ends[7]=2;
                          ;//sysj\orchestrator.sysj line: 126, column: 4
                          capLoaderValue_thread_7 = (capLoaderStatus_in.getVal() == null ? null : ((String)capLoaderStatus_in.getVal()));//sysj\orchestrator.sysj line: 127, column: 4
                          if(capLoaderValue_thread_7 == "busy") {//sysj\orchestrator.sysj line: 128, column: 34
                            System.out.println("Orch received - loader busy");//sysj\orchestrator.sysj line: 129, column: 5
                            Status.capLoaderStat = true;//sysj\orchestrator.sysj line: 130, column: 5
                          }
                          else {//sysj\orchestrator.sysj line: 132, column: 9
                            System.out.println("Orch received - loader done");//sysj\orchestrator.sysj line: 133, column: 5
                            Status.capLoaderStat = false;//sysj\orchestrator.sysj line: 134, column: 5
                          }
                          S136549=1;
                          active[7]=1;
                          ends[7]=1;
                          tdone[7]=1;
                        }
                        else {
                          active[7]=1;
                          ends[7]=1;
                          tdone[7]=1;
                        }
                      }
                      else {
                        active[7]=1;
                        ends[7]=1;
                        tdone[7]=1;
                      }
                      break;
                    
                    case 1 : 
                      if(capLoaderStatus_in.isREQ()){//sysj\orchestrator.sysj line: 126, column: 4
                        capLoaderStatus_in.setACK(false);//sysj\orchestrator.sysj line: 126, column: 4
                        ends[7]=2;
                        ;//sysj\orchestrator.sysj line: 126, column: 4
                        capLoaderValue_thread_7 = (capLoaderStatus_in.getVal() == null ? null : ((String)capLoaderStatus_in.getVal()));//sysj\orchestrator.sysj line: 127, column: 4
                        if(capLoaderValue_thread_7 == "busy") {//sysj\orchestrator.sysj line: 128, column: 34
                          System.out.println("Orch received - loader busy");//sysj\orchestrator.sysj line: 129, column: 5
                          Status.capLoaderStat = true;//sysj\orchestrator.sysj line: 130, column: 5
                        }
                        else {//sysj\orchestrator.sysj line: 132, column: 9
                          System.out.println("Orch received - loader done");//sysj\orchestrator.sysj line: 133, column: 5
                          Status.capLoaderStat = false;//sysj\orchestrator.sysj line: 134, column: 5
                        }
                        S136549=1;
                        active[7]=1;
                        ends[7]=1;
                        tdone[7]=1;
                      }
                      else {
                        active[7]=1;
                        ends[7]=1;
                        tdone[7]=1;
                      }
                      break;
                    
                  }
                }
                break;
              
              case 1 : 
                S136533=1;
                S136533=0;
                if(!capLoaderStatus_in.isPartnerPresent() || capLoaderStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 126, column: 4
                  capLoaderStatus_in.setACK(false);//sysj\orchestrator.sysj line: 126, column: 4
                  S136533=1;
                  active[7]=1;
                  ends[7]=1;
                  tdone[7]=1;
                }
                else {
                  S136528=0;
                  if(!capLoaderStatus_in.isREQ()){//sysj\orchestrator.sysj line: 126, column: 4
                    capLoaderStatus_in.setACK(true);//sysj\orchestrator.sysj line: 126, column: 4
                    S136528=1;
                    if(capLoaderStatus_in.isREQ()){//sysj\orchestrator.sysj line: 126, column: 4
                      capLoaderStatus_in.setACK(false);//sysj\orchestrator.sysj line: 126, column: 4
                      ends[7]=2;
                      ;//sysj\orchestrator.sysj line: 126, column: 4
                      capLoaderValue_thread_7 = (capLoaderStatus_in.getVal() == null ? null : ((String)capLoaderStatus_in.getVal()));//sysj\orchestrator.sysj line: 127, column: 4
                      if(capLoaderValue_thread_7 == "busy") {//sysj\orchestrator.sysj line: 128, column: 34
                        System.out.println("Orch received - loader busy");//sysj\orchestrator.sysj line: 129, column: 5
                        Status.capLoaderStat = true;//sysj\orchestrator.sysj line: 130, column: 5
                      }
                      else {//sysj\orchestrator.sysj line: 132, column: 9
                        System.out.println("Orch received - loader done");//sysj\orchestrator.sysj line: 133, column: 5
                        Status.capLoaderStat = false;//sysj\orchestrator.sysj line: 134, column: 5
                      }
                      S136549=1;
                      active[7]=1;
                      ends[7]=1;
                      tdone[7]=1;
                    }
                    else {
                      active[7]=1;
                      ends[7]=1;
                      tdone[7]=1;
                    }
                  }
                  else {
                    active[7]=1;
                    ends[7]=1;
                    tdone[7]=1;
                  }
                }
                break;
              
            }
            break;
          
          case 1 : 
            S136549=1;
            S136549=0;
            S136533=0;
            if(!capLoaderStatus_in.isPartnerPresent() || capLoaderStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 126, column: 4
              capLoaderStatus_in.setACK(false);//sysj\orchestrator.sysj line: 126, column: 4
              S136533=1;
              active[7]=1;
              ends[7]=1;
              tdone[7]=1;
            }
            else {
              S136528=0;
              if(!capLoaderStatus_in.isREQ()){//sysj\orchestrator.sysj line: 126, column: 4
                capLoaderStatus_in.setACK(true);//sysj\orchestrator.sysj line: 126, column: 4
                S136528=1;
                if(capLoaderStatus_in.isREQ()){//sysj\orchestrator.sysj line: 126, column: 4
                  capLoaderStatus_in.setACK(false);//sysj\orchestrator.sysj line: 126, column: 4
                  ends[7]=2;
                  ;//sysj\orchestrator.sysj line: 126, column: 4
                  capLoaderValue_thread_7 = (capLoaderStatus_in.getVal() == null ? null : ((String)capLoaderStatus_in.getVal()));//sysj\orchestrator.sysj line: 127, column: 4
                  if(capLoaderValue_thread_7 == "busy") {//sysj\orchestrator.sysj line: 128, column: 34
                    System.out.println("Orch received - loader busy");//sysj\orchestrator.sysj line: 129, column: 5
                    Status.capLoaderStat = true;//sysj\orchestrator.sysj line: 130, column: 5
                  }
                  else {//sysj\orchestrator.sysj line: 132, column: 9
                    System.out.println("Orch received - loader done");//sysj\orchestrator.sysj line: 133, column: 5
                    Status.capLoaderStat = false;//sysj\orchestrator.sysj line: 134, column: 5
                  }
                  S136549=1;
                  active[7]=1;
                  ends[7]=1;
                  tdone[7]=1;
                }
                else {
                  active[7]=1;
                  ends[7]=1;
                  tdone[7]=1;
                }
              }
              else {
                active[7]=1;
                ends[7]=1;
                tdone[7]=1;
              }
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread136822(int [] tdone, int [] ends){
        switch(S136526){
      case 0 : 
        active[6]=0;
        ends[6]=0;
        tdone[6]=1;
        break;
      
      case 1 : 
        switch(S136478){
          case 0 : 
            switch(S136462){
              case 0 : 
                if(!capperStatus_in.isPartnerPresent() || capperStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 110, column: 4
                  capperStatus_in.setACK(false);//sysj\orchestrator.sysj line: 110, column: 4
                  S136462=1;
                  active[6]=1;
                  ends[6]=1;
                  tdone[6]=1;
                }
                else {
                  switch(S136457){
                    case 0 : 
                      if(!capperStatus_in.isREQ()){//sysj\orchestrator.sysj line: 110, column: 4
                        capperStatus_in.setACK(true);//sysj\orchestrator.sysj line: 110, column: 4
                        S136457=1;
                        if(capperStatus_in.isREQ()){//sysj\orchestrator.sysj line: 110, column: 4
                          capperStatus_in.setACK(false);//sysj\orchestrator.sysj line: 110, column: 4
                          ends[6]=2;
                          ;//sysj\orchestrator.sysj line: 110, column: 4
                          capperValue_thread_6 = (capperStatus_in.getVal() == null ? null : ((String)capperStatus_in.getVal()));//sysj\orchestrator.sysj line: 111, column: 4
                          if(capperValue_thread_6 == "busy") {//sysj\orchestrator.sysj line: 112, column: 31
                            System.out.println("Orch received - capper busy");//sysj\orchestrator.sysj line: 113, column: 5
                            Status.capperStat = true;//sysj\orchestrator.sysj line: 114, column: 5
                          }
                          else {//sysj\orchestrator.sysj line: 116, column: 9
                            System.out.println("Orch received - capper done");//sysj\orchestrator.sysj line: 117, column: 5
                            Status.capperStat = false;//sysj\orchestrator.sysj line: 118, column: 5
                          }
                          S136478=1;
                          active[6]=1;
                          ends[6]=1;
                          tdone[6]=1;
                        }
                        else {
                          active[6]=1;
                          ends[6]=1;
                          tdone[6]=1;
                        }
                      }
                      else {
                        active[6]=1;
                        ends[6]=1;
                        tdone[6]=1;
                      }
                      break;
                    
                    case 1 : 
                      if(capperStatus_in.isREQ()){//sysj\orchestrator.sysj line: 110, column: 4
                        capperStatus_in.setACK(false);//sysj\orchestrator.sysj line: 110, column: 4
                        ends[6]=2;
                        ;//sysj\orchestrator.sysj line: 110, column: 4
                        capperValue_thread_6 = (capperStatus_in.getVal() == null ? null : ((String)capperStatus_in.getVal()));//sysj\orchestrator.sysj line: 111, column: 4
                        if(capperValue_thread_6 == "busy") {//sysj\orchestrator.sysj line: 112, column: 31
                          System.out.println("Orch received - capper busy");//sysj\orchestrator.sysj line: 113, column: 5
                          Status.capperStat = true;//sysj\orchestrator.sysj line: 114, column: 5
                        }
                        else {//sysj\orchestrator.sysj line: 116, column: 9
                          System.out.println("Orch received - capper done");//sysj\orchestrator.sysj line: 117, column: 5
                          Status.capperStat = false;//sysj\orchestrator.sysj line: 118, column: 5
                        }
                        S136478=1;
                        active[6]=1;
                        ends[6]=1;
                        tdone[6]=1;
                      }
                      else {
                        active[6]=1;
                        ends[6]=1;
                        tdone[6]=1;
                      }
                      break;
                    
                  }
                }
                break;
              
              case 1 : 
                S136462=1;
                S136462=0;
                if(!capperStatus_in.isPartnerPresent() || capperStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 110, column: 4
                  capperStatus_in.setACK(false);//sysj\orchestrator.sysj line: 110, column: 4
                  S136462=1;
                  active[6]=1;
                  ends[6]=1;
                  tdone[6]=1;
                }
                else {
                  S136457=0;
                  if(!capperStatus_in.isREQ()){//sysj\orchestrator.sysj line: 110, column: 4
                    capperStatus_in.setACK(true);//sysj\orchestrator.sysj line: 110, column: 4
                    S136457=1;
                    if(capperStatus_in.isREQ()){//sysj\orchestrator.sysj line: 110, column: 4
                      capperStatus_in.setACK(false);//sysj\orchestrator.sysj line: 110, column: 4
                      ends[6]=2;
                      ;//sysj\orchestrator.sysj line: 110, column: 4
                      capperValue_thread_6 = (capperStatus_in.getVal() == null ? null : ((String)capperStatus_in.getVal()));//sysj\orchestrator.sysj line: 111, column: 4
                      if(capperValue_thread_6 == "busy") {//sysj\orchestrator.sysj line: 112, column: 31
                        System.out.println("Orch received - capper busy");//sysj\orchestrator.sysj line: 113, column: 5
                        Status.capperStat = true;//sysj\orchestrator.sysj line: 114, column: 5
                      }
                      else {//sysj\orchestrator.sysj line: 116, column: 9
                        System.out.println("Orch received - capper done");//sysj\orchestrator.sysj line: 117, column: 5
                        Status.capperStat = false;//sysj\orchestrator.sysj line: 118, column: 5
                      }
                      S136478=1;
                      active[6]=1;
                      ends[6]=1;
                      tdone[6]=1;
                    }
                    else {
                      active[6]=1;
                      ends[6]=1;
                      tdone[6]=1;
                    }
                  }
                  else {
                    active[6]=1;
                    ends[6]=1;
                    tdone[6]=1;
                  }
                }
                break;
              
            }
            break;
          
          case 1 : 
            S136478=1;
            S136478=0;
            S136462=0;
            if(!capperStatus_in.isPartnerPresent() || capperStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 110, column: 4
              capperStatus_in.setACK(false);//sysj\orchestrator.sysj line: 110, column: 4
              S136462=1;
              active[6]=1;
              ends[6]=1;
              tdone[6]=1;
            }
            else {
              S136457=0;
              if(!capperStatus_in.isREQ()){//sysj\orchestrator.sysj line: 110, column: 4
                capperStatus_in.setACK(true);//sysj\orchestrator.sysj line: 110, column: 4
                S136457=1;
                if(capperStatus_in.isREQ()){//sysj\orchestrator.sysj line: 110, column: 4
                  capperStatus_in.setACK(false);//sysj\orchestrator.sysj line: 110, column: 4
                  ends[6]=2;
                  ;//sysj\orchestrator.sysj line: 110, column: 4
                  capperValue_thread_6 = (capperStatus_in.getVal() == null ? null : ((String)capperStatus_in.getVal()));//sysj\orchestrator.sysj line: 111, column: 4
                  if(capperValue_thread_6 == "busy") {//sysj\orchestrator.sysj line: 112, column: 31
                    System.out.println("Orch received - capper busy");//sysj\orchestrator.sysj line: 113, column: 5
                    Status.capperStat = true;//sysj\orchestrator.sysj line: 114, column: 5
                  }
                  else {//sysj\orchestrator.sysj line: 116, column: 9
                    System.out.println("Orch received - capper done");//sysj\orchestrator.sysj line: 117, column: 5
                    Status.capperStat = false;//sysj\orchestrator.sysj line: 118, column: 5
                  }
                  S136478=1;
                  active[6]=1;
                  ends[6]=1;
                  tdone[6]=1;
                }
                else {
                  active[6]=1;
                  ends[6]=1;
                  tdone[6]=1;
                }
              }
              else {
                active[6]=1;
                ends[6]=1;
                tdone[6]=1;
              }
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread136821(int [] tdone, int [] ends){
        switch(S136455){
      case 0 : 
        active[5]=0;
        ends[5]=0;
        tdone[5]=1;
        break;
      
      case 1 : 
        switch(S136407){
          case 0 : 
            switch(S136391){
              case 0 : 
                if(!fillerStatus_in.isPartnerPresent() || fillerStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 94, column: 4
                  fillerStatus_in.setACK(false);//sysj\orchestrator.sysj line: 94, column: 4
                  S136391=1;
                  active[5]=1;
                  ends[5]=1;
                  tdone[5]=1;
                }
                else {
                  switch(S136386){
                    case 0 : 
                      if(!fillerStatus_in.isREQ()){//sysj\orchestrator.sysj line: 94, column: 4
                        fillerStatus_in.setACK(true);//sysj\orchestrator.sysj line: 94, column: 4
                        S136386=1;
                        if(fillerStatus_in.isREQ()){//sysj\orchestrator.sysj line: 94, column: 4
                          fillerStatus_in.setACK(false);//sysj\orchestrator.sysj line: 94, column: 4
                          ends[5]=2;
                          ;//sysj\orchestrator.sysj line: 94, column: 4
                          fillerValue_thread_5 = (fillerStatus_in.getVal() == null ? null : ((String)fillerStatus_in.getVal()));//sysj\orchestrator.sysj line: 95, column: 4
                          if(fillerValue_thread_5 == "busy") {//sysj\orchestrator.sysj line: 96, column: 31
                            System.out.println("Orch received - filler busy");//sysj\orchestrator.sysj line: 97, column: 5
                            Status.fillerStat = true;//sysj\orchestrator.sysj line: 98, column: 5
                          }
                          else {//sysj\orchestrator.sysj line: 100, column: 9
                            System.out.println("Orch received - filler done");//sysj\orchestrator.sysj line: 101, column: 5
                            Status.fillerStat = false;//sysj\orchestrator.sysj line: 102, column: 5
                          }
                          S136407=1;
                          active[5]=1;
                          ends[5]=1;
                          tdone[5]=1;
                        }
                        else {
                          active[5]=1;
                          ends[5]=1;
                          tdone[5]=1;
                        }
                      }
                      else {
                        active[5]=1;
                        ends[5]=1;
                        tdone[5]=1;
                      }
                      break;
                    
                    case 1 : 
                      if(fillerStatus_in.isREQ()){//sysj\orchestrator.sysj line: 94, column: 4
                        fillerStatus_in.setACK(false);//sysj\orchestrator.sysj line: 94, column: 4
                        ends[5]=2;
                        ;//sysj\orchestrator.sysj line: 94, column: 4
                        fillerValue_thread_5 = (fillerStatus_in.getVal() == null ? null : ((String)fillerStatus_in.getVal()));//sysj\orchestrator.sysj line: 95, column: 4
                        if(fillerValue_thread_5 == "busy") {//sysj\orchestrator.sysj line: 96, column: 31
                          System.out.println("Orch received - filler busy");//sysj\orchestrator.sysj line: 97, column: 5
                          Status.fillerStat = true;//sysj\orchestrator.sysj line: 98, column: 5
                        }
                        else {//sysj\orchestrator.sysj line: 100, column: 9
                          System.out.println("Orch received - filler done");//sysj\orchestrator.sysj line: 101, column: 5
                          Status.fillerStat = false;//sysj\orchestrator.sysj line: 102, column: 5
                        }
                        S136407=1;
                        active[5]=1;
                        ends[5]=1;
                        tdone[5]=1;
                      }
                      else {
                        active[5]=1;
                        ends[5]=1;
                        tdone[5]=1;
                      }
                      break;
                    
                  }
                }
                break;
              
              case 1 : 
                S136391=1;
                S136391=0;
                if(!fillerStatus_in.isPartnerPresent() || fillerStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 94, column: 4
                  fillerStatus_in.setACK(false);//sysj\orchestrator.sysj line: 94, column: 4
                  S136391=1;
                  active[5]=1;
                  ends[5]=1;
                  tdone[5]=1;
                }
                else {
                  S136386=0;
                  if(!fillerStatus_in.isREQ()){//sysj\orchestrator.sysj line: 94, column: 4
                    fillerStatus_in.setACK(true);//sysj\orchestrator.sysj line: 94, column: 4
                    S136386=1;
                    if(fillerStatus_in.isREQ()){//sysj\orchestrator.sysj line: 94, column: 4
                      fillerStatus_in.setACK(false);//sysj\orchestrator.sysj line: 94, column: 4
                      ends[5]=2;
                      ;//sysj\orchestrator.sysj line: 94, column: 4
                      fillerValue_thread_5 = (fillerStatus_in.getVal() == null ? null : ((String)fillerStatus_in.getVal()));//sysj\orchestrator.sysj line: 95, column: 4
                      if(fillerValue_thread_5 == "busy") {//sysj\orchestrator.sysj line: 96, column: 31
                        System.out.println("Orch received - filler busy");//sysj\orchestrator.sysj line: 97, column: 5
                        Status.fillerStat = true;//sysj\orchestrator.sysj line: 98, column: 5
                      }
                      else {//sysj\orchestrator.sysj line: 100, column: 9
                        System.out.println("Orch received - filler done");//sysj\orchestrator.sysj line: 101, column: 5
                        Status.fillerStat = false;//sysj\orchestrator.sysj line: 102, column: 5
                      }
                      S136407=1;
                      active[5]=1;
                      ends[5]=1;
                      tdone[5]=1;
                    }
                    else {
                      active[5]=1;
                      ends[5]=1;
                      tdone[5]=1;
                    }
                  }
                  else {
                    active[5]=1;
                    ends[5]=1;
                    tdone[5]=1;
                  }
                }
                break;
              
            }
            break;
          
          case 1 : 
            S136407=1;
            S136407=0;
            S136391=0;
            if(!fillerStatus_in.isPartnerPresent() || fillerStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 94, column: 4
              fillerStatus_in.setACK(false);//sysj\orchestrator.sysj line: 94, column: 4
              S136391=1;
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            else {
              S136386=0;
              if(!fillerStatus_in.isREQ()){//sysj\orchestrator.sysj line: 94, column: 4
                fillerStatus_in.setACK(true);//sysj\orchestrator.sysj line: 94, column: 4
                S136386=1;
                if(fillerStatus_in.isREQ()){//sysj\orchestrator.sysj line: 94, column: 4
                  fillerStatus_in.setACK(false);//sysj\orchestrator.sysj line: 94, column: 4
                  ends[5]=2;
                  ;//sysj\orchestrator.sysj line: 94, column: 4
                  fillerValue_thread_5 = (fillerStatus_in.getVal() == null ? null : ((String)fillerStatus_in.getVal()));//sysj\orchestrator.sysj line: 95, column: 4
                  if(fillerValue_thread_5 == "busy") {//sysj\orchestrator.sysj line: 96, column: 31
                    System.out.println("Orch received - filler busy");//sysj\orchestrator.sysj line: 97, column: 5
                    Status.fillerStat = true;//sysj\orchestrator.sysj line: 98, column: 5
                  }
                  else {//sysj\orchestrator.sysj line: 100, column: 9
                    System.out.println("Orch received - filler done");//sysj\orchestrator.sysj line: 101, column: 5
                    Status.fillerStat = false;//sysj\orchestrator.sysj line: 102, column: 5
                  }
                  S136407=1;
                  active[5]=1;
                  ends[5]=1;
                  tdone[5]=1;
                }
                else {
                  active[5]=1;
                  ends[5]=1;
                  tdone[5]=1;
                }
              }
              else {
                active[5]=1;
                ends[5]=1;
                tdone[5]=1;
              }
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread136820(int [] tdone, int [] ends){
        switch(S136384){
      case 0 : 
        active[4]=0;
        ends[4]=0;
        tdone[4]=1;
        break;
      
      case 1 : 
        switch(S136336){
          case 0 : 
            switch(S136320){
              case 0 : 
                if(!conveyorStatus_in.isPartnerPresent() || conveyorStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 77, column: 4
                  conveyorStatus_in.setACK(false);//sysj\orchestrator.sysj line: 77, column: 4
                  S136320=1;
                  active[4]=1;
                  ends[4]=1;
                  tdone[4]=1;
                }
                else {
                  switch(S136315){
                    case 0 : 
                      if(!conveyorStatus_in.isREQ()){//sysj\orchestrator.sysj line: 77, column: 4
                        conveyorStatus_in.setACK(true);//sysj\orchestrator.sysj line: 77, column: 4
                        S136315=1;
                        if(conveyorStatus_in.isREQ()){//sysj\orchestrator.sysj line: 77, column: 4
                          conveyorStatus_in.setACK(false);//sysj\orchestrator.sysj line: 77, column: 4
                          ends[4]=2;
                          ;//sysj\orchestrator.sysj line: 77, column: 4
                          conveyValue_thread_4 = (conveyorStatus_in.getVal() == null ? null : ((String)conveyorStatus_in.getVal()));//sysj\orchestrator.sysj line: 78, column: 4
                          if(conveyValue_thread_4 == "busy") {//sysj\orchestrator.sysj line: 79, column: 31
                            System.out.println("Orch received - convey busy");//sysj\orchestrator.sysj line: 80, column: 5
                            Status.conveyStat = true;//sysj\orchestrator.sysj line: 81, column: 5
                          }
                          else {//sysj\orchestrator.sysj line: 83, column: 9
                            System.out.println("Orch received - convey done");//sysj\orchestrator.sysj line: 84, column: 5
                            Status.conveyStat = false;//sysj\orchestrator.sysj line: 85, column: 5
                          }
                          S136336=1;
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
                      if(conveyorStatus_in.isREQ()){//sysj\orchestrator.sysj line: 77, column: 4
                        conveyorStatus_in.setACK(false);//sysj\orchestrator.sysj line: 77, column: 4
                        ends[4]=2;
                        ;//sysj\orchestrator.sysj line: 77, column: 4
                        conveyValue_thread_4 = (conveyorStatus_in.getVal() == null ? null : ((String)conveyorStatus_in.getVal()));//sysj\orchestrator.sysj line: 78, column: 4
                        if(conveyValue_thread_4 == "busy") {//sysj\orchestrator.sysj line: 79, column: 31
                          System.out.println("Orch received - convey busy");//sysj\orchestrator.sysj line: 80, column: 5
                          Status.conveyStat = true;//sysj\orchestrator.sysj line: 81, column: 5
                        }
                        else {//sysj\orchestrator.sysj line: 83, column: 9
                          System.out.println("Orch received - convey done");//sysj\orchestrator.sysj line: 84, column: 5
                          Status.conveyStat = false;//sysj\orchestrator.sysj line: 85, column: 5
                        }
                        S136336=1;
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
                S136320=1;
                S136320=0;
                if(!conveyorStatus_in.isPartnerPresent() || conveyorStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 77, column: 4
                  conveyorStatus_in.setACK(false);//sysj\orchestrator.sysj line: 77, column: 4
                  S136320=1;
                  active[4]=1;
                  ends[4]=1;
                  tdone[4]=1;
                }
                else {
                  S136315=0;
                  if(!conveyorStatus_in.isREQ()){//sysj\orchestrator.sysj line: 77, column: 4
                    conveyorStatus_in.setACK(true);//sysj\orchestrator.sysj line: 77, column: 4
                    S136315=1;
                    if(conveyorStatus_in.isREQ()){//sysj\orchestrator.sysj line: 77, column: 4
                      conveyorStatus_in.setACK(false);//sysj\orchestrator.sysj line: 77, column: 4
                      ends[4]=2;
                      ;//sysj\orchestrator.sysj line: 77, column: 4
                      conveyValue_thread_4 = (conveyorStatus_in.getVal() == null ? null : ((String)conveyorStatus_in.getVal()));//sysj\orchestrator.sysj line: 78, column: 4
                      if(conveyValue_thread_4 == "busy") {//sysj\orchestrator.sysj line: 79, column: 31
                        System.out.println("Orch received - convey busy");//sysj\orchestrator.sysj line: 80, column: 5
                        Status.conveyStat = true;//sysj\orchestrator.sysj line: 81, column: 5
                      }
                      else {//sysj\orchestrator.sysj line: 83, column: 9
                        System.out.println("Orch received - convey done");//sysj\orchestrator.sysj line: 84, column: 5
                        Status.conveyStat = false;//sysj\orchestrator.sysj line: 85, column: 5
                      }
                      S136336=1;
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
          
          case 1 : 
            S136336=1;
            S136336=0;
            S136320=0;
            if(!conveyorStatus_in.isPartnerPresent() || conveyorStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 77, column: 4
              conveyorStatus_in.setACK(false);//sysj\orchestrator.sysj line: 77, column: 4
              S136320=1;
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            else {
              S136315=0;
              if(!conveyorStatus_in.isREQ()){//sysj\orchestrator.sysj line: 77, column: 4
                conveyorStatus_in.setACK(true);//sysj\orchestrator.sysj line: 77, column: 4
                S136315=1;
                if(conveyorStatus_in.isREQ()){//sysj\orchestrator.sysj line: 77, column: 4
                  conveyorStatus_in.setACK(false);//sysj\orchestrator.sysj line: 77, column: 4
                  ends[4]=2;
                  ;//sysj\orchestrator.sysj line: 77, column: 4
                  conveyValue_thread_4 = (conveyorStatus_in.getVal() == null ? null : ((String)conveyorStatus_in.getVal()));//sysj\orchestrator.sysj line: 78, column: 4
                  if(conveyValue_thread_4 == "busy") {//sysj\orchestrator.sysj line: 79, column: 31
                    System.out.println("Orch received - convey busy");//sysj\orchestrator.sysj line: 80, column: 5
                    Status.conveyStat = true;//sysj\orchestrator.sysj line: 81, column: 5
                  }
                  else {//sysj\orchestrator.sysj line: 83, column: 9
                    System.out.println("Orch received - convey done");//sysj\orchestrator.sysj line: 84, column: 5
                    Status.conveyStat = false;//sysj\orchestrator.sysj line: 85, column: 5
                  }
                  S136336=1;
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
      
    }
  }

  public void thread136819(int [] tdone, int [] ends){
        switch(S136313){
      case 0 : 
        active[3]=0;
        ends[3]=0;
        tdone[3]=1;
        break;
      
      case 1 : 
        switch(S119757){
          case 0 : 
            switch(S119741){
              case 0 : 
                if(!rotaryStatus_in.isPartnerPresent() || rotaryStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 53, column: 4
                  rotaryStatus_in.setACK(false);//sysj\orchestrator.sysj line: 53, column: 4
                  S119741=1;
                  active[3]=1;
                  ends[3]=1;
                  tdone[3]=1;
                }
                else {
                  switch(S119736){
                    case 0 : 
                      if(!rotaryStatus_in.isREQ()){//sysj\orchestrator.sysj line: 53, column: 4
                        rotaryStatus_in.setACK(true);//sysj\orchestrator.sysj line: 53, column: 4
                        S119736=1;
                        if(rotaryStatus_in.isREQ()){//sysj\orchestrator.sysj line: 53, column: 4
                          rotaryStatus_in.setACK(false);//sysj\orchestrator.sysj line: 53, column: 4
                          ends[3]=2;
                          ;//sysj\orchestrator.sysj line: 53, column: 4
                          rotaryStat_thread_3 = (rotaryStatus_in.getVal() == null ? null : ((String)rotaryStatus_in.getVal()));//sysj\orchestrator.sysj line: 54, column: 4
                          S119757=1;
                          if(rotaryStat_thread_3 == "done"){//sysj\orchestrator.sysj line: 57, column: 7
                            S120442=0;
                            System.out.println("rotary done, sending filler,loader,screwer, conveyor reqs");//sysj\orchestrator.sysj line: 58, column: 5
                            S119802=0;
                            S119764=0;
                            if(!fillerReq_o.isPartnerPresent() || fillerReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 59, column: 5
                              fillerReq_o.setREQ(false);//sysj\orchestrator.sysj line: 59, column: 5
                              S119764=1;
                              active[3]=1;
                              ends[3]=1;
                              tdone[3]=1;
                            }
                            else {
                              S119759=0;
                              if(fillerReq_o.isACK()){//sysj\orchestrator.sysj line: 59, column: 5
                                fillerReq_o.setVal(true);//sysj\orchestrator.sysj line: 59, column: 5
                                S119759=1;
                                if(!fillerReq_o.isACK()){//sysj\orchestrator.sysj line: 59, column: 5
                                  fillerReq_o.setREQ(false);//sysj\orchestrator.sysj line: 59, column: 5
                                  ends[3]=2;
                                  ;//sysj\orchestrator.sysj line: 59, column: 5
                                  S119802=1;
                                  S119809=0;
                                  if(!percentLiquid_o.isPartnerPresent() || percentLiquid_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 60, column: 5
                                    percentLiquid_o.setREQ(false);//sysj\orchestrator.sysj line: 60, column: 5
                                    S119809=1;
                                    active[3]=1;
                                    ends[3]=1;
                                    tdone[3]=1;
                                  }
                                  else {
                                    S119804=0;
                                    if(percentLiquid_o.isACK()){//sysj\orchestrator.sysj line: 60, column: 5
                                      percentLiquid_o.setVal(liquidPercent_thread_3);//sysj\orchestrator.sysj line: 60, column: 5
                                      S119804=1;
                                      if(!percentLiquid_o.isACK()){//sysj\orchestrator.sysj line: 60, column: 5
                                        percentLiquid_o.setREQ(false);//sysj\orchestrator.sysj line: 60, column: 5
                                        ends[3]=2;
                                        ;//sysj\orchestrator.sysj line: 60, column: 5
                                        S119802=2;
                                        S119897=0;
                                        if(!capLoaderReq_o.isPartnerPresent() || capLoaderReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 61, column: 5
                                          capLoaderReq_o.setREQ(false);//sysj\orchestrator.sysj line: 61, column: 5
                                          S119897=1;
                                          active[3]=1;
                                          ends[3]=1;
                                          tdone[3]=1;
                                        }
                                        else {
                                          S119892=0;
                                          if(capLoaderReq_o.isACK()){//sysj\orchestrator.sysj line: 61, column: 5
                                            capLoaderReq_o.setVal(true);//sysj\orchestrator.sysj line: 61, column: 5
                                            S119892=1;
                                            if(!capLoaderReq_o.isACK()){//sysj\orchestrator.sysj line: 61, column: 5
                                              capLoaderReq_o.setREQ(false);//sysj\orchestrator.sysj line: 61, column: 5
                                              ends[3]=2;
                                              ;//sysj\orchestrator.sysj line: 61, column: 5
                                              S119802=3;
                                              S120029=0;
                                              if(!capperReq_o.isPartnerPresent() || capperReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 62, column: 5
                                                capperReq_o.setREQ(false);//sysj\orchestrator.sysj line: 62, column: 5
                                                S120029=1;
                                                active[3]=1;
                                                ends[3]=1;
                                                tdone[3]=1;
                                              }
                                              else {
                                                S120024=0;
                                                if(capperReq_o.isACK()){//sysj\orchestrator.sysj line: 62, column: 5
                                                  capperReq_o.setVal(true);//sysj\orchestrator.sysj line: 62, column: 5
                                                  S120024=1;
                                                  if(!capperReq_o.isACK()){//sysj\orchestrator.sysj line: 62, column: 5
                                                    capperReq_o.setREQ(false);//sysj\orchestrator.sysj line: 62, column: 5
                                                    ends[3]=2;
                                                    ;//sysj\orchestrator.sysj line: 62, column: 5
                                                    getNextBottle_1.setPresent();//sysj\orchestrator.sysj line: 63, column: 5
                                                    currsigs.addElement(getNextBottle_1);
                                                    S119757=2;
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
                            S120442=1;
                            S120309=0;
                            S120205=0;
                            if(!fillerReq_o.isPartnerPresent() || fillerReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 66, column: 5
                              fillerReq_o.setREQ(false);//sysj\orchestrator.sysj line: 66, column: 5
                              S120205=1;
                              active[3]=1;
                              ends[3]=1;
                              tdone[3]=1;
                            }
                            else {
                              S120200=0;
                              if(fillerReq_o.isACK()){//sysj\orchestrator.sysj line: 66, column: 5
                                fillerReq_o.setVal(false);//sysj\orchestrator.sysj line: 66, column: 5
                                S120200=1;
                                if(!fillerReq_o.isACK()){//sysj\orchestrator.sysj line: 66, column: 5
                                  fillerReq_o.setREQ(false);//sysj\orchestrator.sysj line: 66, column: 5
                                  ends[3]=2;
                                  ;//sysj\orchestrator.sysj line: 66, column: 5
                                  S120309=1;
                                  S120227=0;
                                  if(!capLoaderReq_o.isPartnerPresent() || capLoaderReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 67, column: 5
                                    capLoaderReq_o.setREQ(false);//sysj\orchestrator.sysj line: 67, column: 5
                                    S120227=1;
                                    active[3]=1;
                                    ends[3]=1;
                                    tdone[3]=1;
                                  }
                                  else {
                                    S120222=0;
                                    if(capLoaderReq_o.isACK()){//sysj\orchestrator.sysj line: 67, column: 5
                                      capLoaderReq_o.setVal(false);//sysj\orchestrator.sysj line: 67, column: 5
                                      S120222=1;
                                      if(!capLoaderReq_o.isACK()){//sysj\orchestrator.sysj line: 67, column: 5
                                        capLoaderReq_o.setREQ(false);//sysj\orchestrator.sysj line: 67, column: 5
                                        ends[3]=2;
                                        ;//sysj\orchestrator.sysj line: 67, column: 5
                                        S120309=2;
                                        S120316=0;
                                        if(!capperReq_o.isPartnerPresent() || capperReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 68, column: 5
                                          capperReq_o.setREQ(false);//sysj\orchestrator.sysj line: 68, column: 5
                                          S120316=1;
                                          active[3]=1;
                                          ends[3]=1;
                                          tdone[3]=1;
                                        }
                                        else {
                                          S120311=0;
                                          if(capperReq_o.isACK()){//sysj\orchestrator.sysj line: 68, column: 5
                                            capperReq_o.setVal(false);//sysj\orchestrator.sysj line: 68, column: 5
                                            S120311=1;
                                            if(!capperReq_o.isACK()){//sysj\orchestrator.sysj line: 68, column: 5
                                              capperReq_o.setREQ(false);//sysj\orchestrator.sysj line: 68, column: 5
                                              ends[3]=2;
                                              ;//sysj\orchestrator.sysj line: 68, column: 5
                                              S119757=2;
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
                      if(rotaryStatus_in.isREQ()){//sysj\orchestrator.sysj line: 53, column: 4
                        rotaryStatus_in.setACK(false);//sysj\orchestrator.sysj line: 53, column: 4
                        ends[3]=2;
                        ;//sysj\orchestrator.sysj line: 53, column: 4
                        rotaryStat_thread_3 = (rotaryStatus_in.getVal() == null ? null : ((String)rotaryStatus_in.getVal()));//sysj\orchestrator.sysj line: 54, column: 4
                        S119757=1;
                        if(rotaryStat_thread_3 == "done"){//sysj\orchestrator.sysj line: 57, column: 7
                          S120442=0;
                          System.out.println("rotary done, sending filler,loader,screwer, conveyor reqs");//sysj\orchestrator.sysj line: 58, column: 5
                          S119802=0;
                          S119764=0;
                          if(!fillerReq_o.isPartnerPresent() || fillerReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 59, column: 5
                            fillerReq_o.setREQ(false);//sysj\orchestrator.sysj line: 59, column: 5
                            S119764=1;
                            active[3]=1;
                            ends[3]=1;
                            tdone[3]=1;
                          }
                          else {
                            S119759=0;
                            if(fillerReq_o.isACK()){//sysj\orchestrator.sysj line: 59, column: 5
                              fillerReq_o.setVal(true);//sysj\orchestrator.sysj line: 59, column: 5
                              S119759=1;
                              if(!fillerReq_o.isACK()){//sysj\orchestrator.sysj line: 59, column: 5
                                fillerReq_o.setREQ(false);//sysj\orchestrator.sysj line: 59, column: 5
                                ends[3]=2;
                                ;//sysj\orchestrator.sysj line: 59, column: 5
                                S119802=1;
                                S119809=0;
                                if(!percentLiquid_o.isPartnerPresent() || percentLiquid_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 60, column: 5
                                  percentLiquid_o.setREQ(false);//sysj\orchestrator.sysj line: 60, column: 5
                                  S119809=1;
                                  active[3]=1;
                                  ends[3]=1;
                                  tdone[3]=1;
                                }
                                else {
                                  S119804=0;
                                  if(percentLiquid_o.isACK()){//sysj\orchestrator.sysj line: 60, column: 5
                                    percentLiquid_o.setVal(liquidPercent_thread_3);//sysj\orchestrator.sysj line: 60, column: 5
                                    S119804=1;
                                    if(!percentLiquid_o.isACK()){//sysj\orchestrator.sysj line: 60, column: 5
                                      percentLiquid_o.setREQ(false);//sysj\orchestrator.sysj line: 60, column: 5
                                      ends[3]=2;
                                      ;//sysj\orchestrator.sysj line: 60, column: 5
                                      S119802=2;
                                      S119897=0;
                                      if(!capLoaderReq_o.isPartnerPresent() || capLoaderReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 61, column: 5
                                        capLoaderReq_o.setREQ(false);//sysj\orchestrator.sysj line: 61, column: 5
                                        S119897=1;
                                        active[3]=1;
                                        ends[3]=1;
                                        tdone[3]=1;
                                      }
                                      else {
                                        S119892=0;
                                        if(capLoaderReq_o.isACK()){//sysj\orchestrator.sysj line: 61, column: 5
                                          capLoaderReq_o.setVal(true);//sysj\orchestrator.sysj line: 61, column: 5
                                          S119892=1;
                                          if(!capLoaderReq_o.isACK()){//sysj\orchestrator.sysj line: 61, column: 5
                                            capLoaderReq_o.setREQ(false);//sysj\orchestrator.sysj line: 61, column: 5
                                            ends[3]=2;
                                            ;//sysj\orchestrator.sysj line: 61, column: 5
                                            S119802=3;
                                            S120029=0;
                                            if(!capperReq_o.isPartnerPresent() || capperReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 62, column: 5
                                              capperReq_o.setREQ(false);//sysj\orchestrator.sysj line: 62, column: 5
                                              S120029=1;
                                              active[3]=1;
                                              ends[3]=1;
                                              tdone[3]=1;
                                            }
                                            else {
                                              S120024=0;
                                              if(capperReq_o.isACK()){//sysj\orchestrator.sysj line: 62, column: 5
                                                capperReq_o.setVal(true);//sysj\orchestrator.sysj line: 62, column: 5
                                                S120024=1;
                                                if(!capperReq_o.isACK()){//sysj\orchestrator.sysj line: 62, column: 5
                                                  capperReq_o.setREQ(false);//sysj\orchestrator.sysj line: 62, column: 5
                                                  ends[3]=2;
                                                  ;//sysj\orchestrator.sysj line: 62, column: 5
                                                  getNextBottle_1.setPresent();//sysj\orchestrator.sysj line: 63, column: 5
                                                  currsigs.addElement(getNextBottle_1);
                                                  S119757=2;
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
                          S120442=1;
                          S120309=0;
                          S120205=0;
                          if(!fillerReq_o.isPartnerPresent() || fillerReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 66, column: 5
                            fillerReq_o.setREQ(false);//sysj\orchestrator.sysj line: 66, column: 5
                            S120205=1;
                            active[3]=1;
                            ends[3]=1;
                            tdone[3]=1;
                          }
                          else {
                            S120200=0;
                            if(fillerReq_o.isACK()){//sysj\orchestrator.sysj line: 66, column: 5
                              fillerReq_o.setVal(false);//sysj\orchestrator.sysj line: 66, column: 5
                              S120200=1;
                              if(!fillerReq_o.isACK()){//sysj\orchestrator.sysj line: 66, column: 5
                                fillerReq_o.setREQ(false);//sysj\orchestrator.sysj line: 66, column: 5
                                ends[3]=2;
                                ;//sysj\orchestrator.sysj line: 66, column: 5
                                S120309=1;
                                S120227=0;
                                if(!capLoaderReq_o.isPartnerPresent() || capLoaderReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 67, column: 5
                                  capLoaderReq_o.setREQ(false);//sysj\orchestrator.sysj line: 67, column: 5
                                  S120227=1;
                                  active[3]=1;
                                  ends[3]=1;
                                  tdone[3]=1;
                                }
                                else {
                                  S120222=0;
                                  if(capLoaderReq_o.isACK()){//sysj\orchestrator.sysj line: 67, column: 5
                                    capLoaderReq_o.setVal(false);//sysj\orchestrator.sysj line: 67, column: 5
                                    S120222=1;
                                    if(!capLoaderReq_o.isACK()){//sysj\orchestrator.sysj line: 67, column: 5
                                      capLoaderReq_o.setREQ(false);//sysj\orchestrator.sysj line: 67, column: 5
                                      ends[3]=2;
                                      ;//sysj\orchestrator.sysj line: 67, column: 5
                                      S120309=2;
                                      S120316=0;
                                      if(!capperReq_o.isPartnerPresent() || capperReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 68, column: 5
                                        capperReq_o.setREQ(false);//sysj\orchestrator.sysj line: 68, column: 5
                                        S120316=1;
                                        active[3]=1;
                                        ends[3]=1;
                                        tdone[3]=1;
                                      }
                                      else {
                                        S120311=0;
                                        if(capperReq_o.isACK()){//sysj\orchestrator.sysj line: 68, column: 5
                                          capperReq_o.setVal(false);//sysj\orchestrator.sysj line: 68, column: 5
                                          S120311=1;
                                          if(!capperReq_o.isACK()){//sysj\orchestrator.sysj line: 68, column: 5
                                            capperReq_o.setREQ(false);//sysj\orchestrator.sysj line: 68, column: 5
                                            ends[3]=2;
                                            ;//sysj\orchestrator.sysj line: 68, column: 5
                                            S119757=2;
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
                S119741=1;
                S119741=0;
                if(!rotaryStatus_in.isPartnerPresent() || rotaryStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 53, column: 4
                  rotaryStatus_in.setACK(false);//sysj\orchestrator.sysj line: 53, column: 4
                  S119741=1;
                  active[3]=1;
                  ends[3]=1;
                  tdone[3]=1;
                }
                else {
                  S119736=0;
                  if(!rotaryStatus_in.isREQ()){//sysj\orchestrator.sysj line: 53, column: 4
                    rotaryStatus_in.setACK(true);//sysj\orchestrator.sysj line: 53, column: 4
                    S119736=1;
                    if(rotaryStatus_in.isREQ()){//sysj\orchestrator.sysj line: 53, column: 4
                      rotaryStatus_in.setACK(false);//sysj\orchestrator.sysj line: 53, column: 4
                      ends[3]=2;
                      ;//sysj\orchestrator.sysj line: 53, column: 4
                      rotaryStat_thread_3 = (rotaryStatus_in.getVal() == null ? null : ((String)rotaryStatus_in.getVal()));//sysj\orchestrator.sysj line: 54, column: 4
                      S119757=1;
                      if(rotaryStat_thread_3 == "done"){//sysj\orchestrator.sysj line: 57, column: 7
                        S120442=0;
                        System.out.println("rotary done, sending filler,loader,screwer, conveyor reqs");//sysj\orchestrator.sysj line: 58, column: 5
                        S119802=0;
                        S119764=0;
                        if(!fillerReq_o.isPartnerPresent() || fillerReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 59, column: 5
                          fillerReq_o.setREQ(false);//sysj\orchestrator.sysj line: 59, column: 5
                          S119764=1;
                          active[3]=1;
                          ends[3]=1;
                          tdone[3]=1;
                        }
                        else {
                          S119759=0;
                          if(fillerReq_o.isACK()){//sysj\orchestrator.sysj line: 59, column: 5
                            fillerReq_o.setVal(true);//sysj\orchestrator.sysj line: 59, column: 5
                            S119759=1;
                            if(!fillerReq_o.isACK()){//sysj\orchestrator.sysj line: 59, column: 5
                              fillerReq_o.setREQ(false);//sysj\orchestrator.sysj line: 59, column: 5
                              ends[3]=2;
                              ;//sysj\orchestrator.sysj line: 59, column: 5
                              S119802=1;
                              S119809=0;
                              if(!percentLiquid_o.isPartnerPresent() || percentLiquid_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 60, column: 5
                                percentLiquid_o.setREQ(false);//sysj\orchestrator.sysj line: 60, column: 5
                                S119809=1;
                                active[3]=1;
                                ends[3]=1;
                                tdone[3]=1;
                              }
                              else {
                                S119804=0;
                                if(percentLiquid_o.isACK()){//sysj\orchestrator.sysj line: 60, column: 5
                                  percentLiquid_o.setVal(liquidPercent_thread_3);//sysj\orchestrator.sysj line: 60, column: 5
                                  S119804=1;
                                  if(!percentLiquid_o.isACK()){//sysj\orchestrator.sysj line: 60, column: 5
                                    percentLiquid_o.setREQ(false);//sysj\orchestrator.sysj line: 60, column: 5
                                    ends[3]=2;
                                    ;//sysj\orchestrator.sysj line: 60, column: 5
                                    S119802=2;
                                    S119897=0;
                                    if(!capLoaderReq_o.isPartnerPresent() || capLoaderReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 61, column: 5
                                      capLoaderReq_o.setREQ(false);//sysj\orchestrator.sysj line: 61, column: 5
                                      S119897=1;
                                      active[3]=1;
                                      ends[3]=1;
                                      tdone[3]=1;
                                    }
                                    else {
                                      S119892=0;
                                      if(capLoaderReq_o.isACK()){//sysj\orchestrator.sysj line: 61, column: 5
                                        capLoaderReq_o.setVal(true);//sysj\orchestrator.sysj line: 61, column: 5
                                        S119892=1;
                                        if(!capLoaderReq_o.isACK()){//sysj\orchestrator.sysj line: 61, column: 5
                                          capLoaderReq_o.setREQ(false);//sysj\orchestrator.sysj line: 61, column: 5
                                          ends[3]=2;
                                          ;//sysj\orchestrator.sysj line: 61, column: 5
                                          S119802=3;
                                          S120029=0;
                                          if(!capperReq_o.isPartnerPresent() || capperReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 62, column: 5
                                            capperReq_o.setREQ(false);//sysj\orchestrator.sysj line: 62, column: 5
                                            S120029=1;
                                            active[3]=1;
                                            ends[3]=1;
                                            tdone[3]=1;
                                          }
                                          else {
                                            S120024=0;
                                            if(capperReq_o.isACK()){//sysj\orchestrator.sysj line: 62, column: 5
                                              capperReq_o.setVal(true);//sysj\orchestrator.sysj line: 62, column: 5
                                              S120024=1;
                                              if(!capperReq_o.isACK()){//sysj\orchestrator.sysj line: 62, column: 5
                                                capperReq_o.setREQ(false);//sysj\orchestrator.sysj line: 62, column: 5
                                                ends[3]=2;
                                                ;//sysj\orchestrator.sysj line: 62, column: 5
                                                getNextBottle_1.setPresent();//sysj\orchestrator.sysj line: 63, column: 5
                                                currsigs.addElement(getNextBottle_1);
                                                S119757=2;
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
                        S120442=1;
                        S120309=0;
                        S120205=0;
                        if(!fillerReq_o.isPartnerPresent() || fillerReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 66, column: 5
                          fillerReq_o.setREQ(false);//sysj\orchestrator.sysj line: 66, column: 5
                          S120205=1;
                          active[3]=1;
                          ends[3]=1;
                          tdone[3]=1;
                        }
                        else {
                          S120200=0;
                          if(fillerReq_o.isACK()){//sysj\orchestrator.sysj line: 66, column: 5
                            fillerReq_o.setVal(false);//sysj\orchestrator.sysj line: 66, column: 5
                            S120200=1;
                            if(!fillerReq_o.isACK()){//sysj\orchestrator.sysj line: 66, column: 5
                              fillerReq_o.setREQ(false);//sysj\orchestrator.sysj line: 66, column: 5
                              ends[3]=2;
                              ;//sysj\orchestrator.sysj line: 66, column: 5
                              S120309=1;
                              S120227=0;
                              if(!capLoaderReq_o.isPartnerPresent() || capLoaderReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 67, column: 5
                                capLoaderReq_o.setREQ(false);//sysj\orchestrator.sysj line: 67, column: 5
                                S120227=1;
                                active[3]=1;
                                ends[3]=1;
                                tdone[3]=1;
                              }
                              else {
                                S120222=0;
                                if(capLoaderReq_o.isACK()){//sysj\orchestrator.sysj line: 67, column: 5
                                  capLoaderReq_o.setVal(false);//sysj\orchestrator.sysj line: 67, column: 5
                                  S120222=1;
                                  if(!capLoaderReq_o.isACK()){//sysj\orchestrator.sysj line: 67, column: 5
                                    capLoaderReq_o.setREQ(false);//sysj\orchestrator.sysj line: 67, column: 5
                                    ends[3]=2;
                                    ;//sysj\orchestrator.sysj line: 67, column: 5
                                    S120309=2;
                                    S120316=0;
                                    if(!capperReq_o.isPartnerPresent() || capperReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 68, column: 5
                                      capperReq_o.setREQ(false);//sysj\orchestrator.sysj line: 68, column: 5
                                      S120316=1;
                                      active[3]=1;
                                      ends[3]=1;
                                      tdone[3]=1;
                                    }
                                    else {
                                      S120311=0;
                                      if(capperReq_o.isACK()){//sysj\orchestrator.sysj line: 68, column: 5
                                        capperReq_o.setVal(false);//sysj\orchestrator.sysj line: 68, column: 5
                                        S120311=1;
                                        if(!capperReq_o.isACK()){//sysj\orchestrator.sysj line: 68, column: 5
                                          capperReq_o.setREQ(false);//sysj\orchestrator.sysj line: 68, column: 5
                                          ends[3]=2;
                                          ;//sysj\orchestrator.sysj line: 68, column: 5
                                          S119757=2;
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
            switch(S120442){
              case 0 : 
                switch(S119802){
                  case 0 : 
                    switch(S119764){
                      case 0 : 
                        if(!fillerReq_o.isPartnerPresent() || fillerReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 59, column: 5
                          fillerReq_o.setREQ(false);//sysj\orchestrator.sysj line: 59, column: 5
                          S119764=1;
                          active[3]=1;
                          ends[3]=1;
                          tdone[3]=1;
                        }
                        else {
                          switch(S119759){
                            case 0 : 
                              if(fillerReq_o.isACK()){//sysj\orchestrator.sysj line: 59, column: 5
                                fillerReq_o.setVal(true);//sysj\orchestrator.sysj line: 59, column: 5
                                S119759=1;
                                if(!fillerReq_o.isACK()){//sysj\orchestrator.sysj line: 59, column: 5
                                  fillerReq_o.setREQ(false);//sysj\orchestrator.sysj line: 59, column: 5
                                  ends[3]=2;
                                  ;//sysj\orchestrator.sysj line: 59, column: 5
                                  S119802=1;
                                  S119809=0;
                                  if(!percentLiquid_o.isPartnerPresent() || percentLiquid_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 60, column: 5
                                    percentLiquid_o.setREQ(false);//sysj\orchestrator.sysj line: 60, column: 5
                                    S119809=1;
                                    active[3]=1;
                                    ends[3]=1;
                                    tdone[3]=1;
                                  }
                                  else {
                                    S119804=0;
                                    if(percentLiquid_o.isACK()){//sysj\orchestrator.sysj line: 60, column: 5
                                      percentLiquid_o.setVal(liquidPercent_thread_3);//sysj\orchestrator.sysj line: 60, column: 5
                                      S119804=1;
                                      if(!percentLiquid_o.isACK()){//sysj\orchestrator.sysj line: 60, column: 5
                                        percentLiquid_o.setREQ(false);//sysj\orchestrator.sysj line: 60, column: 5
                                        ends[3]=2;
                                        ;//sysj\orchestrator.sysj line: 60, column: 5
                                        S119802=2;
                                        S119897=0;
                                        if(!capLoaderReq_o.isPartnerPresent() || capLoaderReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 61, column: 5
                                          capLoaderReq_o.setREQ(false);//sysj\orchestrator.sysj line: 61, column: 5
                                          S119897=1;
                                          active[3]=1;
                                          ends[3]=1;
                                          tdone[3]=1;
                                        }
                                        else {
                                          S119892=0;
                                          if(capLoaderReq_o.isACK()){//sysj\orchestrator.sysj line: 61, column: 5
                                            capLoaderReq_o.setVal(true);//sysj\orchestrator.sysj line: 61, column: 5
                                            S119892=1;
                                            if(!capLoaderReq_o.isACK()){//sysj\orchestrator.sysj line: 61, column: 5
                                              capLoaderReq_o.setREQ(false);//sysj\orchestrator.sysj line: 61, column: 5
                                              ends[3]=2;
                                              ;//sysj\orchestrator.sysj line: 61, column: 5
                                              S119802=3;
                                              S120029=0;
                                              if(!capperReq_o.isPartnerPresent() || capperReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 62, column: 5
                                                capperReq_o.setREQ(false);//sysj\orchestrator.sysj line: 62, column: 5
                                                S120029=1;
                                                active[3]=1;
                                                ends[3]=1;
                                                tdone[3]=1;
                                              }
                                              else {
                                                S120024=0;
                                                if(capperReq_o.isACK()){//sysj\orchestrator.sysj line: 62, column: 5
                                                  capperReq_o.setVal(true);//sysj\orchestrator.sysj line: 62, column: 5
                                                  S120024=1;
                                                  if(!capperReq_o.isACK()){//sysj\orchestrator.sysj line: 62, column: 5
                                                    capperReq_o.setREQ(false);//sysj\orchestrator.sysj line: 62, column: 5
                                                    ends[3]=2;
                                                    ;//sysj\orchestrator.sysj line: 62, column: 5
                                                    getNextBottle_1.setPresent();//sysj\orchestrator.sysj line: 63, column: 5
                                                    currsigs.addElement(getNextBottle_1);
                                                    S119757=2;
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
                              if(!fillerReq_o.isACK()){//sysj\orchestrator.sysj line: 59, column: 5
                                fillerReq_o.setREQ(false);//sysj\orchestrator.sysj line: 59, column: 5
                                ends[3]=2;
                                ;//sysj\orchestrator.sysj line: 59, column: 5
                                S119802=1;
                                S119809=0;
                                if(!percentLiquid_o.isPartnerPresent() || percentLiquid_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 60, column: 5
                                  percentLiquid_o.setREQ(false);//sysj\orchestrator.sysj line: 60, column: 5
                                  S119809=1;
                                  active[3]=1;
                                  ends[3]=1;
                                  tdone[3]=1;
                                }
                                else {
                                  S119804=0;
                                  if(percentLiquid_o.isACK()){//sysj\orchestrator.sysj line: 60, column: 5
                                    percentLiquid_o.setVal(liquidPercent_thread_3);//sysj\orchestrator.sysj line: 60, column: 5
                                    S119804=1;
                                    if(!percentLiquid_o.isACK()){//sysj\orchestrator.sysj line: 60, column: 5
                                      percentLiquid_o.setREQ(false);//sysj\orchestrator.sysj line: 60, column: 5
                                      ends[3]=2;
                                      ;//sysj\orchestrator.sysj line: 60, column: 5
                                      S119802=2;
                                      S119897=0;
                                      if(!capLoaderReq_o.isPartnerPresent() || capLoaderReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 61, column: 5
                                        capLoaderReq_o.setREQ(false);//sysj\orchestrator.sysj line: 61, column: 5
                                        S119897=1;
                                        active[3]=1;
                                        ends[3]=1;
                                        tdone[3]=1;
                                      }
                                      else {
                                        S119892=0;
                                        if(capLoaderReq_o.isACK()){//sysj\orchestrator.sysj line: 61, column: 5
                                          capLoaderReq_o.setVal(true);//sysj\orchestrator.sysj line: 61, column: 5
                                          S119892=1;
                                          if(!capLoaderReq_o.isACK()){//sysj\orchestrator.sysj line: 61, column: 5
                                            capLoaderReq_o.setREQ(false);//sysj\orchestrator.sysj line: 61, column: 5
                                            ends[3]=2;
                                            ;//sysj\orchestrator.sysj line: 61, column: 5
                                            S119802=3;
                                            S120029=0;
                                            if(!capperReq_o.isPartnerPresent() || capperReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 62, column: 5
                                              capperReq_o.setREQ(false);//sysj\orchestrator.sysj line: 62, column: 5
                                              S120029=1;
                                              active[3]=1;
                                              ends[3]=1;
                                              tdone[3]=1;
                                            }
                                            else {
                                              S120024=0;
                                              if(capperReq_o.isACK()){//sysj\orchestrator.sysj line: 62, column: 5
                                                capperReq_o.setVal(true);//sysj\orchestrator.sysj line: 62, column: 5
                                                S120024=1;
                                                if(!capperReq_o.isACK()){//sysj\orchestrator.sysj line: 62, column: 5
                                                  capperReq_o.setREQ(false);//sysj\orchestrator.sysj line: 62, column: 5
                                                  ends[3]=2;
                                                  ;//sysj\orchestrator.sysj line: 62, column: 5
                                                  getNextBottle_1.setPresent();//sysj\orchestrator.sysj line: 63, column: 5
                                                  currsigs.addElement(getNextBottle_1);
                                                  S119757=2;
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
                                active[3]=1;
                                ends[3]=1;
                                tdone[3]=1;
                              }
                              break;
                            
                          }
                        }
                        break;
                      
                      case 1 : 
                        S119764=1;
                        S119764=0;
                        if(!fillerReq_o.isPartnerPresent() || fillerReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 59, column: 5
                          fillerReq_o.setREQ(false);//sysj\orchestrator.sysj line: 59, column: 5
                          S119764=1;
                          active[3]=1;
                          ends[3]=1;
                          tdone[3]=1;
                        }
                        else {
                          S119759=0;
                          if(fillerReq_o.isACK()){//sysj\orchestrator.sysj line: 59, column: 5
                            fillerReq_o.setVal(true);//sysj\orchestrator.sysj line: 59, column: 5
                            S119759=1;
                            if(!fillerReq_o.isACK()){//sysj\orchestrator.sysj line: 59, column: 5
                              fillerReq_o.setREQ(false);//sysj\orchestrator.sysj line: 59, column: 5
                              ends[3]=2;
                              ;//sysj\orchestrator.sysj line: 59, column: 5
                              S119802=1;
                              S119809=0;
                              if(!percentLiquid_o.isPartnerPresent() || percentLiquid_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 60, column: 5
                                percentLiquid_o.setREQ(false);//sysj\orchestrator.sysj line: 60, column: 5
                                S119809=1;
                                active[3]=1;
                                ends[3]=1;
                                tdone[3]=1;
                              }
                              else {
                                S119804=0;
                                if(percentLiquid_o.isACK()){//sysj\orchestrator.sysj line: 60, column: 5
                                  percentLiquid_o.setVal(liquidPercent_thread_3);//sysj\orchestrator.sysj line: 60, column: 5
                                  S119804=1;
                                  if(!percentLiquid_o.isACK()){//sysj\orchestrator.sysj line: 60, column: 5
                                    percentLiquid_o.setREQ(false);//sysj\orchestrator.sysj line: 60, column: 5
                                    ends[3]=2;
                                    ;//sysj\orchestrator.sysj line: 60, column: 5
                                    S119802=2;
                                    S119897=0;
                                    if(!capLoaderReq_o.isPartnerPresent() || capLoaderReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 61, column: 5
                                      capLoaderReq_o.setREQ(false);//sysj\orchestrator.sysj line: 61, column: 5
                                      S119897=1;
                                      active[3]=1;
                                      ends[3]=1;
                                      tdone[3]=1;
                                    }
                                    else {
                                      S119892=0;
                                      if(capLoaderReq_o.isACK()){//sysj\orchestrator.sysj line: 61, column: 5
                                        capLoaderReq_o.setVal(true);//sysj\orchestrator.sysj line: 61, column: 5
                                        S119892=1;
                                        if(!capLoaderReq_o.isACK()){//sysj\orchestrator.sysj line: 61, column: 5
                                          capLoaderReq_o.setREQ(false);//sysj\orchestrator.sysj line: 61, column: 5
                                          ends[3]=2;
                                          ;//sysj\orchestrator.sysj line: 61, column: 5
                                          S119802=3;
                                          S120029=0;
                                          if(!capperReq_o.isPartnerPresent() || capperReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 62, column: 5
                                            capperReq_o.setREQ(false);//sysj\orchestrator.sysj line: 62, column: 5
                                            S120029=1;
                                            active[3]=1;
                                            ends[3]=1;
                                            tdone[3]=1;
                                          }
                                          else {
                                            S120024=0;
                                            if(capperReq_o.isACK()){//sysj\orchestrator.sysj line: 62, column: 5
                                              capperReq_o.setVal(true);//sysj\orchestrator.sysj line: 62, column: 5
                                              S120024=1;
                                              if(!capperReq_o.isACK()){//sysj\orchestrator.sysj line: 62, column: 5
                                                capperReq_o.setREQ(false);//sysj\orchestrator.sysj line: 62, column: 5
                                                ends[3]=2;
                                                ;//sysj\orchestrator.sysj line: 62, column: 5
                                                getNextBottle_1.setPresent();//sysj\orchestrator.sysj line: 63, column: 5
                                                currsigs.addElement(getNextBottle_1);
                                                S119757=2;
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
                    switch(S119809){
                      case 0 : 
                        if(!percentLiquid_o.isPartnerPresent() || percentLiquid_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 60, column: 5
                          percentLiquid_o.setREQ(false);//sysj\orchestrator.sysj line: 60, column: 5
                          S119809=1;
                          active[3]=1;
                          ends[3]=1;
                          tdone[3]=1;
                        }
                        else {
                          switch(S119804){
                            case 0 : 
                              if(percentLiquid_o.isACK()){//sysj\orchestrator.sysj line: 60, column: 5
                                percentLiquid_o.setVal(liquidPercent_thread_3);//sysj\orchestrator.sysj line: 60, column: 5
                                S119804=1;
                                if(!percentLiquid_o.isACK()){//sysj\orchestrator.sysj line: 60, column: 5
                                  percentLiquid_o.setREQ(false);//sysj\orchestrator.sysj line: 60, column: 5
                                  ends[3]=2;
                                  ;//sysj\orchestrator.sysj line: 60, column: 5
                                  S119802=2;
                                  S119897=0;
                                  if(!capLoaderReq_o.isPartnerPresent() || capLoaderReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 61, column: 5
                                    capLoaderReq_o.setREQ(false);//sysj\orchestrator.sysj line: 61, column: 5
                                    S119897=1;
                                    active[3]=1;
                                    ends[3]=1;
                                    tdone[3]=1;
                                  }
                                  else {
                                    S119892=0;
                                    if(capLoaderReq_o.isACK()){//sysj\orchestrator.sysj line: 61, column: 5
                                      capLoaderReq_o.setVal(true);//sysj\orchestrator.sysj line: 61, column: 5
                                      S119892=1;
                                      if(!capLoaderReq_o.isACK()){//sysj\orchestrator.sysj line: 61, column: 5
                                        capLoaderReq_o.setREQ(false);//sysj\orchestrator.sysj line: 61, column: 5
                                        ends[3]=2;
                                        ;//sysj\orchestrator.sysj line: 61, column: 5
                                        S119802=3;
                                        S120029=0;
                                        if(!capperReq_o.isPartnerPresent() || capperReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 62, column: 5
                                          capperReq_o.setREQ(false);//sysj\orchestrator.sysj line: 62, column: 5
                                          S120029=1;
                                          active[3]=1;
                                          ends[3]=1;
                                          tdone[3]=1;
                                        }
                                        else {
                                          S120024=0;
                                          if(capperReq_o.isACK()){//sysj\orchestrator.sysj line: 62, column: 5
                                            capperReq_o.setVal(true);//sysj\orchestrator.sysj line: 62, column: 5
                                            S120024=1;
                                            if(!capperReq_o.isACK()){//sysj\orchestrator.sysj line: 62, column: 5
                                              capperReq_o.setREQ(false);//sysj\orchestrator.sysj line: 62, column: 5
                                              ends[3]=2;
                                              ;//sysj\orchestrator.sysj line: 62, column: 5
                                              getNextBottle_1.setPresent();//sysj\orchestrator.sysj line: 63, column: 5
                                              currsigs.addElement(getNextBottle_1);
                                              S119757=2;
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
                              if(!percentLiquid_o.isACK()){//sysj\orchestrator.sysj line: 60, column: 5
                                percentLiquid_o.setREQ(false);//sysj\orchestrator.sysj line: 60, column: 5
                                ends[3]=2;
                                ;//sysj\orchestrator.sysj line: 60, column: 5
                                S119802=2;
                                S119897=0;
                                if(!capLoaderReq_o.isPartnerPresent() || capLoaderReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 61, column: 5
                                  capLoaderReq_o.setREQ(false);//sysj\orchestrator.sysj line: 61, column: 5
                                  S119897=1;
                                  active[3]=1;
                                  ends[3]=1;
                                  tdone[3]=1;
                                }
                                else {
                                  S119892=0;
                                  if(capLoaderReq_o.isACK()){//sysj\orchestrator.sysj line: 61, column: 5
                                    capLoaderReq_o.setVal(true);//sysj\orchestrator.sysj line: 61, column: 5
                                    S119892=1;
                                    if(!capLoaderReq_o.isACK()){//sysj\orchestrator.sysj line: 61, column: 5
                                      capLoaderReq_o.setREQ(false);//sysj\orchestrator.sysj line: 61, column: 5
                                      ends[3]=2;
                                      ;//sysj\orchestrator.sysj line: 61, column: 5
                                      S119802=3;
                                      S120029=0;
                                      if(!capperReq_o.isPartnerPresent() || capperReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 62, column: 5
                                        capperReq_o.setREQ(false);//sysj\orchestrator.sysj line: 62, column: 5
                                        S120029=1;
                                        active[3]=1;
                                        ends[3]=1;
                                        tdone[3]=1;
                                      }
                                      else {
                                        S120024=0;
                                        if(capperReq_o.isACK()){//sysj\orchestrator.sysj line: 62, column: 5
                                          capperReq_o.setVal(true);//sysj\orchestrator.sysj line: 62, column: 5
                                          S120024=1;
                                          if(!capperReq_o.isACK()){//sysj\orchestrator.sysj line: 62, column: 5
                                            capperReq_o.setREQ(false);//sysj\orchestrator.sysj line: 62, column: 5
                                            ends[3]=2;
                                            ;//sysj\orchestrator.sysj line: 62, column: 5
                                            getNextBottle_1.setPresent();//sysj\orchestrator.sysj line: 63, column: 5
                                            currsigs.addElement(getNextBottle_1);
                                            S119757=2;
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
                        S119809=1;
                        S119809=0;
                        if(!percentLiquid_o.isPartnerPresent() || percentLiquid_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 60, column: 5
                          percentLiquid_o.setREQ(false);//sysj\orchestrator.sysj line: 60, column: 5
                          S119809=1;
                          active[3]=1;
                          ends[3]=1;
                          tdone[3]=1;
                        }
                        else {
                          S119804=0;
                          if(percentLiquid_o.isACK()){//sysj\orchestrator.sysj line: 60, column: 5
                            percentLiquid_o.setVal(liquidPercent_thread_3);//sysj\orchestrator.sysj line: 60, column: 5
                            S119804=1;
                            if(!percentLiquid_o.isACK()){//sysj\orchestrator.sysj line: 60, column: 5
                              percentLiquid_o.setREQ(false);//sysj\orchestrator.sysj line: 60, column: 5
                              ends[3]=2;
                              ;//sysj\orchestrator.sysj line: 60, column: 5
                              S119802=2;
                              S119897=0;
                              if(!capLoaderReq_o.isPartnerPresent() || capLoaderReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 61, column: 5
                                capLoaderReq_o.setREQ(false);//sysj\orchestrator.sysj line: 61, column: 5
                                S119897=1;
                                active[3]=1;
                                ends[3]=1;
                                tdone[3]=1;
                              }
                              else {
                                S119892=0;
                                if(capLoaderReq_o.isACK()){//sysj\orchestrator.sysj line: 61, column: 5
                                  capLoaderReq_o.setVal(true);//sysj\orchestrator.sysj line: 61, column: 5
                                  S119892=1;
                                  if(!capLoaderReq_o.isACK()){//sysj\orchestrator.sysj line: 61, column: 5
                                    capLoaderReq_o.setREQ(false);//sysj\orchestrator.sysj line: 61, column: 5
                                    ends[3]=2;
                                    ;//sysj\orchestrator.sysj line: 61, column: 5
                                    S119802=3;
                                    S120029=0;
                                    if(!capperReq_o.isPartnerPresent() || capperReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 62, column: 5
                                      capperReq_o.setREQ(false);//sysj\orchestrator.sysj line: 62, column: 5
                                      S120029=1;
                                      active[3]=1;
                                      ends[3]=1;
                                      tdone[3]=1;
                                    }
                                    else {
                                      S120024=0;
                                      if(capperReq_o.isACK()){//sysj\orchestrator.sysj line: 62, column: 5
                                        capperReq_o.setVal(true);//sysj\orchestrator.sysj line: 62, column: 5
                                        S120024=1;
                                        if(!capperReq_o.isACK()){//sysj\orchestrator.sysj line: 62, column: 5
                                          capperReq_o.setREQ(false);//sysj\orchestrator.sysj line: 62, column: 5
                                          ends[3]=2;
                                          ;//sysj\orchestrator.sysj line: 62, column: 5
                                          getNextBottle_1.setPresent();//sysj\orchestrator.sysj line: 63, column: 5
                                          currsigs.addElement(getNextBottle_1);
                                          S119757=2;
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
                  
                  case 2 : 
                    switch(S119897){
                      case 0 : 
                        if(!capLoaderReq_o.isPartnerPresent() || capLoaderReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 61, column: 5
                          capLoaderReq_o.setREQ(false);//sysj\orchestrator.sysj line: 61, column: 5
                          S119897=1;
                          active[3]=1;
                          ends[3]=1;
                          tdone[3]=1;
                        }
                        else {
                          switch(S119892){
                            case 0 : 
                              if(capLoaderReq_o.isACK()){//sysj\orchestrator.sysj line: 61, column: 5
                                capLoaderReq_o.setVal(true);//sysj\orchestrator.sysj line: 61, column: 5
                                S119892=1;
                                if(!capLoaderReq_o.isACK()){//sysj\orchestrator.sysj line: 61, column: 5
                                  capLoaderReq_o.setREQ(false);//sysj\orchestrator.sysj line: 61, column: 5
                                  ends[3]=2;
                                  ;//sysj\orchestrator.sysj line: 61, column: 5
                                  S119802=3;
                                  S120029=0;
                                  if(!capperReq_o.isPartnerPresent() || capperReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 62, column: 5
                                    capperReq_o.setREQ(false);//sysj\orchestrator.sysj line: 62, column: 5
                                    S120029=1;
                                    active[3]=1;
                                    ends[3]=1;
                                    tdone[3]=1;
                                  }
                                  else {
                                    S120024=0;
                                    if(capperReq_o.isACK()){//sysj\orchestrator.sysj line: 62, column: 5
                                      capperReq_o.setVal(true);//sysj\orchestrator.sysj line: 62, column: 5
                                      S120024=1;
                                      if(!capperReq_o.isACK()){//sysj\orchestrator.sysj line: 62, column: 5
                                        capperReq_o.setREQ(false);//sysj\orchestrator.sysj line: 62, column: 5
                                        ends[3]=2;
                                        ;//sysj\orchestrator.sysj line: 62, column: 5
                                        getNextBottle_1.setPresent();//sysj\orchestrator.sysj line: 63, column: 5
                                        currsigs.addElement(getNextBottle_1);
                                        S119757=2;
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
                              if(!capLoaderReq_o.isACK()){//sysj\orchestrator.sysj line: 61, column: 5
                                capLoaderReq_o.setREQ(false);//sysj\orchestrator.sysj line: 61, column: 5
                                ends[3]=2;
                                ;//sysj\orchestrator.sysj line: 61, column: 5
                                S119802=3;
                                S120029=0;
                                if(!capperReq_o.isPartnerPresent() || capperReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 62, column: 5
                                  capperReq_o.setREQ(false);//sysj\orchestrator.sysj line: 62, column: 5
                                  S120029=1;
                                  active[3]=1;
                                  ends[3]=1;
                                  tdone[3]=1;
                                }
                                else {
                                  S120024=0;
                                  if(capperReq_o.isACK()){//sysj\orchestrator.sysj line: 62, column: 5
                                    capperReq_o.setVal(true);//sysj\orchestrator.sysj line: 62, column: 5
                                    S120024=1;
                                    if(!capperReq_o.isACK()){//sysj\orchestrator.sysj line: 62, column: 5
                                      capperReq_o.setREQ(false);//sysj\orchestrator.sysj line: 62, column: 5
                                      ends[3]=2;
                                      ;//sysj\orchestrator.sysj line: 62, column: 5
                                      getNextBottle_1.setPresent();//sysj\orchestrator.sysj line: 63, column: 5
                                      currsigs.addElement(getNextBottle_1);
                                      S119757=2;
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
                        S119897=1;
                        S119897=0;
                        if(!capLoaderReq_o.isPartnerPresent() || capLoaderReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 61, column: 5
                          capLoaderReq_o.setREQ(false);//sysj\orchestrator.sysj line: 61, column: 5
                          S119897=1;
                          active[3]=1;
                          ends[3]=1;
                          tdone[3]=1;
                        }
                        else {
                          S119892=0;
                          if(capLoaderReq_o.isACK()){//sysj\orchestrator.sysj line: 61, column: 5
                            capLoaderReq_o.setVal(true);//sysj\orchestrator.sysj line: 61, column: 5
                            S119892=1;
                            if(!capLoaderReq_o.isACK()){//sysj\orchestrator.sysj line: 61, column: 5
                              capLoaderReq_o.setREQ(false);//sysj\orchestrator.sysj line: 61, column: 5
                              ends[3]=2;
                              ;//sysj\orchestrator.sysj line: 61, column: 5
                              S119802=3;
                              S120029=0;
                              if(!capperReq_o.isPartnerPresent() || capperReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 62, column: 5
                                capperReq_o.setREQ(false);//sysj\orchestrator.sysj line: 62, column: 5
                                S120029=1;
                                active[3]=1;
                                ends[3]=1;
                                tdone[3]=1;
                              }
                              else {
                                S120024=0;
                                if(capperReq_o.isACK()){//sysj\orchestrator.sysj line: 62, column: 5
                                  capperReq_o.setVal(true);//sysj\orchestrator.sysj line: 62, column: 5
                                  S120024=1;
                                  if(!capperReq_o.isACK()){//sysj\orchestrator.sysj line: 62, column: 5
                                    capperReq_o.setREQ(false);//sysj\orchestrator.sysj line: 62, column: 5
                                    ends[3]=2;
                                    ;//sysj\orchestrator.sysj line: 62, column: 5
                                    getNextBottle_1.setPresent();//sysj\orchestrator.sysj line: 63, column: 5
                                    currsigs.addElement(getNextBottle_1);
                                    S119757=2;
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
                  
                  case 3 : 
                    switch(S120029){
                      case 0 : 
                        if(!capperReq_o.isPartnerPresent() || capperReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 62, column: 5
                          capperReq_o.setREQ(false);//sysj\orchestrator.sysj line: 62, column: 5
                          S120029=1;
                          active[3]=1;
                          ends[3]=1;
                          tdone[3]=1;
                        }
                        else {
                          switch(S120024){
                            case 0 : 
                              if(capperReq_o.isACK()){//sysj\orchestrator.sysj line: 62, column: 5
                                capperReq_o.setVal(true);//sysj\orchestrator.sysj line: 62, column: 5
                                S120024=1;
                                if(!capperReq_o.isACK()){//sysj\orchestrator.sysj line: 62, column: 5
                                  capperReq_o.setREQ(false);//sysj\orchestrator.sysj line: 62, column: 5
                                  ends[3]=2;
                                  ;//sysj\orchestrator.sysj line: 62, column: 5
                                  getNextBottle_1.setPresent();//sysj\orchestrator.sysj line: 63, column: 5
                                  currsigs.addElement(getNextBottle_1);
                                  S119757=2;
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
                              if(!capperReq_o.isACK()){//sysj\orchestrator.sysj line: 62, column: 5
                                capperReq_o.setREQ(false);//sysj\orchestrator.sysj line: 62, column: 5
                                ends[3]=2;
                                ;//sysj\orchestrator.sysj line: 62, column: 5
                                getNextBottle_1.setPresent();//sysj\orchestrator.sysj line: 63, column: 5
                                currsigs.addElement(getNextBottle_1);
                                S119757=2;
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
                        S120029=1;
                        S120029=0;
                        if(!capperReq_o.isPartnerPresent() || capperReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 62, column: 5
                          capperReq_o.setREQ(false);//sysj\orchestrator.sysj line: 62, column: 5
                          S120029=1;
                          active[3]=1;
                          ends[3]=1;
                          tdone[3]=1;
                        }
                        else {
                          S120024=0;
                          if(capperReq_o.isACK()){//sysj\orchestrator.sysj line: 62, column: 5
                            capperReq_o.setVal(true);//sysj\orchestrator.sysj line: 62, column: 5
                            S120024=1;
                            if(!capperReq_o.isACK()){//sysj\orchestrator.sysj line: 62, column: 5
                              capperReq_o.setREQ(false);//sysj\orchestrator.sysj line: 62, column: 5
                              ends[3]=2;
                              ;//sysj\orchestrator.sysj line: 62, column: 5
                              getNextBottle_1.setPresent();//sysj\orchestrator.sysj line: 63, column: 5
                              currsigs.addElement(getNextBottle_1);
                              S119757=2;
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
              
              case 1 : 
                switch(S120309){
                  case 0 : 
                    switch(S120205){
                      case 0 : 
                        if(!fillerReq_o.isPartnerPresent() || fillerReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 66, column: 5
                          fillerReq_o.setREQ(false);//sysj\orchestrator.sysj line: 66, column: 5
                          S120205=1;
                          active[3]=1;
                          ends[3]=1;
                          tdone[3]=1;
                        }
                        else {
                          switch(S120200){
                            case 0 : 
                              if(fillerReq_o.isACK()){//sysj\orchestrator.sysj line: 66, column: 5
                                fillerReq_o.setVal(false);//sysj\orchestrator.sysj line: 66, column: 5
                                S120200=1;
                                if(!fillerReq_o.isACK()){//sysj\orchestrator.sysj line: 66, column: 5
                                  fillerReq_o.setREQ(false);//sysj\orchestrator.sysj line: 66, column: 5
                                  ends[3]=2;
                                  ;//sysj\orchestrator.sysj line: 66, column: 5
                                  S120309=1;
                                  S120227=0;
                                  if(!capLoaderReq_o.isPartnerPresent() || capLoaderReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 67, column: 5
                                    capLoaderReq_o.setREQ(false);//sysj\orchestrator.sysj line: 67, column: 5
                                    S120227=1;
                                    active[3]=1;
                                    ends[3]=1;
                                    tdone[3]=1;
                                  }
                                  else {
                                    S120222=0;
                                    if(capLoaderReq_o.isACK()){//sysj\orchestrator.sysj line: 67, column: 5
                                      capLoaderReq_o.setVal(false);//sysj\orchestrator.sysj line: 67, column: 5
                                      S120222=1;
                                      if(!capLoaderReq_o.isACK()){//sysj\orchestrator.sysj line: 67, column: 5
                                        capLoaderReq_o.setREQ(false);//sysj\orchestrator.sysj line: 67, column: 5
                                        ends[3]=2;
                                        ;//sysj\orchestrator.sysj line: 67, column: 5
                                        S120309=2;
                                        S120316=0;
                                        if(!capperReq_o.isPartnerPresent() || capperReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 68, column: 5
                                          capperReq_o.setREQ(false);//sysj\orchestrator.sysj line: 68, column: 5
                                          S120316=1;
                                          active[3]=1;
                                          ends[3]=1;
                                          tdone[3]=1;
                                        }
                                        else {
                                          S120311=0;
                                          if(capperReq_o.isACK()){//sysj\orchestrator.sysj line: 68, column: 5
                                            capperReq_o.setVal(false);//sysj\orchestrator.sysj line: 68, column: 5
                                            S120311=1;
                                            if(!capperReq_o.isACK()){//sysj\orchestrator.sysj line: 68, column: 5
                                              capperReq_o.setREQ(false);//sysj\orchestrator.sysj line: 68, column: 5
                                              ends[3]=2;
                                              ;//sysj\orchestrator.sysj line: 68, column: 5
                                              S119757=2;
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
                              if(!fillerReq_o.isACK()){//sysj\orchestrator.sysj line: 66, column: 5
                                fillerReq_o.setREQ(false);//sysj\orchestrator.sysj line: 66, column: 5
                                ends[3]=2;
                                ;//sysj\orchestrator.sysj line: 66, column: 5
                                S120309=1;
                                S120227=0;
                                if(!capLoaderReq_o.isPartnerPresent() || capLoaderReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 67, column: 5
                                  capLoaderReq_o.setREQ(false);//sysj\orchestrator.sysj line: 67, column: 5
                                  S120227=1;
                                  active[3]=1;
                                  ends[3]=1;
                                  tdone[3]=1;
                                }
                                else {
                                  S120222=0;
                                  if(capLoaderReq_o.isACK()){//sysj\orchestrator.sysj line: 67, column: 5
                                    capLoaderReq_o.setVal(false);//sysj\orchestrator.sysj line: 67, column: 5
                                    S120222=1;
                                    if(!capLoaderReq_o.isACK()){//sysj\orchestrator.sysj line: 67, column: 5
                                      capLoaderReq_o.setREQ(false);//sysj\orchestrator.sysj line: 67, column: 5
                                      ends[3]=2;
                                      ;//sysj\orchestrator.sysj line: 67, column: 5
                                      S120309=2;
                                      S120316=0;
                                      if(!capperReq_o.isPartnerPresent() || capperReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 68, column: 5
                                        capperReq_o.setREQ(false);//sysj\orchestrator.sysj line: 68, column: 5
                                        S120316=1;
                                        active[3]=1;
                                        ends[3]=1;
                                        tdone[3]=1;
                                      }
                                      else {
                                        S120311=0;
                                        if(capperReq_o.isACK()){//sysj\orchestrator.sysj line: 68, column: 5
                                          capperReq_o.setVal(false);//sysj\orchestrator.sysj line: 68, column: 5
                                          S120311=1;
                                          if(!capperReq_o.isACK()){//sysj\orchestrator.sysj line: 68, column: 5
                                            capperReq_o.setREQ(false);//sysj\orchestrator.sysj line: 68, column: 5
                                            ends[3]=2;
                                            ;//sysj\orchestrator.sysj line: 68, column: 5
                                            S119757=2;
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
                        S120205=1;
                        S120205=0;
                        if(!fillerReq_o.isPartnerPresent() || fillerReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 66, column: 5
                          fillerReq_o.setREQ(false);//sysj\orchestrator.sysj line: 66, column: 5
                          S120205=1;
                          active[3]=1;
                          ends[3]=1;
                          tdone[3]=1;
                        }
                        else {
                          S120200=0;
                          if(fillerReq_o.isACK()){//sysj\orchestrator.sysj line: 66, column: 5
                            fillerReq_o.setVal(false);//sysj\orchestrator.sysj line: 66, column: 5
                            S120200=1;
                            if(!fillerReq_o.isACK()){//sysj\orchestrator.sysj line: 66, column: 5
                              fillerReq_o.setREQ(false);//sysj\orchestrator.sysj line: 66, column: 5
                              ends[3]=2;
                              ;//sysj\orchestrator.sysj line: 66, column: 5
                              S120309=1;
                              S120227=0;
                              if(!capLoaderReq_o.isPartnerPresent() || capLoaderReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 67, column: 5
                                capLoaderReq_o.setREQ(false);//sysj\orchestrator.sysj line: 67, column: 5
                                S120227=1;
                                active[3]=1;
                                ends[3]=1;
                                tdone[3]=1;
                              }
                              else {
                                S120222=0;
                                if(capLoaderReq_o.isACK()){//sysj\orchestrator.sysj line: 67, column: 5
                                  capLoaderReq_o.setVal(false);//sysj\orchestrator.sysj line: 67, column: 5
                                  S120222=1;
                                  if(!capLoaderReq_o.isACK()){//sysj\orchestrator.sysj line: 67, column: 5
                                    capLoaderReq_o.setREQ(false);//sysj\orchestrator.sysj line: 67, column: 5
                                    ends[3]=2;
                                    ;//sysj\orchestrator.sysj line: 67, column: 5
                                    S120309=2;
                                    S120316=0;
                                    if(!capperReq_o.isPartnerPresent() || capperReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 68, column: 5
                                      capperReq_o.setREQ(false);//sysj\orchestrator.sysj line: 68, column: 5
                                      S120316=1;
                                      active[3]=1;
                                      ends[3]=1;
                                      tdone[3]=1;
                                    }
                                    else {
                                      S120311=0;
                                      if(capperReq_o.isACK()){//sysj\orchestrator.sysj line: 68, column: 5
                                        capperReq_o.setVal(false);//sysj\orchestrator.sysj line: 68, column: 5
                                        S120311=1;
                                        if(!capperReq_o.isACK()){//sysj\orchestrator.sysj line: 68, column: 5
                                          capperReq_o.setREQ(false);//sysj\orchestrator.sysj line: 68, column: 5
                                          ends[3]=2;
                                          ;//sysj\orchestrator.sysj line: 68, column: 5
                                          S119757=2;
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
                    switch(S120227){
                      case 0 : 
                        if(!capLoaderReq_o.isPartnerPresent() || capLoaderReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 67, column: 5
                          capLoaderReq_o.setREQ(false);//sysj\orchestrator.sysj line: 67, column: 5
                          S120227=1;
                          active[3]=1;
                          ends[3]=1;
                          tdone[3]=1;
                        }
                        else {
                          switch(S120222){
                            case 0 : 
                              if(capLoaderReq_o.isACK()){//sysj\orchestrator.sysj line: 67, column: 5
                                capLoaderReq_o.setVal(false);//sysj\orchestrator.sysj line: 67, column: 5
                                S120222=1;
                                if(!capLoaderReq_o.isACK()){//sysj\orchestrator.sysj line: 67, column: 5
                                  capLoaderReq_o.setREQ(false);//sysj\orchestrator.sysj line: 67, column: 5
                                  ends[3]=2;
                                  ;//sysj\orchestrator.sysj line: 67, column: 5
                                  S120309=2;
                                  S120316=0;
                                  if(!capperReq_o.isPartnerPresent() || capperReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 68, column: 5
                                    capperReq_o.setREQ(false);//sysj\orchestrator.sysj line: 68, column: 5
                                    S120316=1;
                                    active[3]=1;
                                    ends[3]=1;
                                    tdone[3]=1;
                                  }
                                  else {
                                    S120311=0;
                                    if(capperReq_o.isACK()){//sysj\orchestrator.sysj line: 68, column: 5
                                      capperReq_o.setVal(false);//sysj\orchestrator.sysj line: 68, column: 5
                                      S120311=1;
                                      if(!capperReq_o.isACK()){//sysj\orchestrator.sysj line: 68, column: 5
                                        capperReq_o.setREQ(false);//sysj\orchestrator.sysj line: 68, column: 5
                                        ends[3]=2;
                                        ;//sysj\orchestrator.sysj line: 68, column: 5
                                        S119757=2;
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
                              if(!capLoaderReq_o.isACK()){//sysj\orchestrator.sysj line: 67, column: 5
                                capLoaderReq_o.setREQ(false);//sysj\orchestrator.sysj line: 67, column: 5
                                ends[3]=2;
                                ;//sysj\orchestrator.sysj line: 67, column: 5
                                S120309=2;
                                S120316=0;
                                if(!capperReq_o.isPartnerPresent() || capperReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 68, column: 5
                                  capperReq_o.setREQ(false);//sysj\orchestrator.sysj line: 68, column: 5
                                  S120316=1;
                                  active[3]=1;
                                  ends[3]=1;
                                  tdone[3]=1;
                                }
                                else {
                                  S120311=0;
                                  if(capperReq_o.isACK()){//sysj\orchestrator.sysj line: 68, column: 5
                                    capperReq_o.setVal(false);//sysj\orchestrator.sysj line: 68, column: 5
                                    S120311=1;
                                    if(!capperReq_o.isACK()){//sysj\orchestrator.sysj line: 68, column: 5
                                      capperReq_o.setREQ(false);//sysj\orchestrator.sysj line: 68, column: 5
                                      ends[3]=2;
                                      ;//sysj\orchestrator.sysj line: 68, column: 5
                                      S119757=2;
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
                        S120227=1;
                        S120227=0;
                        if(!capLoaderReq_o.isPartnerPresent() || capLoaderReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 67, column: 5
                          capLoaderReq_o.setREQ(false);//sysj\orchestrator.sysj line: 67, column: 5
                          S120227=1;
                          active[3]=1;
                          ends[3]=1;
                          tdone[3]=1;
                        }
                        else {
                          S120222=0;
                          if(capLoaderReq_o.isACK()){//sysj\orchestrator.sysj line: 67, column: 5
                            capLoaderReq_o.setVal(false);//sysj\orchestrator.sysj line: 67, column: 5
                            S120222=1;
                            if(!capLoaderReq_o.isACK()){//sysj\orchestrator.sysj line: 67, column: 5
                              capLoaderReq_o.setREQ(false);//sysj\orchestrator.sysj line: 67, column: 5
                              ends[3]=2;
                              ;//sysj\orchestrator.sysj line: 67, column: 5
                              S120309=2;
                              S120316=0;
                              if(!capperReq_o.isPartnerPresent() || capperReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 68, column: 5
                                capperReq_o.setREQ(false);//sysj\orchestrator.sysj line: 68, column: 5
                                S120316=1;
                                active[3]=1;
                                ends[3]=1;
                                tdone[3]=1;
                              }
                              else {
                                S120311=0;
                                if(capperReq_o.isACK()){//sysj\orchestrator.sysj line: 68, column: 5
                                  capperReq_o.setVal(false);//sysj\orchestrator.sysj line: 68, column: 5
                                  S120311=1;
                                  if(!capperReq_o.isACK()){//sysj\orchestrator.sysj line: 68, column: 5
                                    capperReq_o.setREQ(false);//sysj\orchestrator.sysj line: 68, column: 5
                                    ends[3]=2;
                                    ;//sysj\orchestrator.sysj line: 68, column: 5
                                    S119757=2;
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
                    switch(S120316){
                      case 0 : 
                        if(!capperReq_o.isPartnerPresent() || capperReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 68, column: 5
                          capperReq_o.setREQ(false);//sysj\orchestrator.sysj line: 68, column: 5
                          S120316=1;
                          active[3]=1;
                          ends[3]=1;
                          tdone[3]=1;
                        }
                        else {
                          switch(S120311){
                            case 0 : 
                              if(capperReq_o.isACK()){//sysj\orchestrator.sysj line: 68, column: 5
                                capperReq_o.setVal(false);//sysj\orchestrator.sysj line: 68, column: 5
                                S120311=1;
                                if(!capperReq_o.isACK()){//sysj\orchestrator.sysj line: 68, column: 5
                                  capperReq_o.setREQ(false);//sysj\orchestrator.sysj line: 68, column: 5
                                  ends[3]=2;
                                  ;//sysj\orchestrator.sysj line: 68, column: 5
                                  S119757=2;
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
                              if(!capperReq_o.isACK()){//sysj\orchestrator.sysj line: 68, column: 5
                                capperReq_o.setREQ(false);//sysj\orchestrator.sysj line: 68, column: 5
                                ends[3]=2;
                                ;//sysj\orchestrator.sysj line: 68, column: 5
                                S119757=2;
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
                        S120316=1;
                        S120316=0;
                        if(!capperReq_o.isPartnerPresent() || capperReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 68, column: 5
                          capperReq_o.setREQ(false);//sysj\orchestrator.sysj line: 68, column: 5
                          S120316=1;
                          active[3]=1;
                          ends[3]=1;
                          tdone[3]=1;
                        }
                        else {
                          S120311=0;
                          if(capperReq_o.isACK()){//sysj\orchestrator.sysj line: 68, column: 5
                            capperReq_o.setVal(false);//sysj\orchestrator.sysj line: 68, column: 5
                            S120311=1;
                            if(!capperReq_o.isACK()){//sysj\orchestrator.sysj line: 68, column: 5
                              capperReq_o.setREQ(false);//sysj\orchestrator.sysj line: 68, column: 5
                              ends[3]=2;
                              ;//sysj\orchestrator.sysj line: 68, column: 5
                              S119757=2;
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
              
            }
            break;
          
          case 2 : 
            S119757=2;
            S119757=0;
            S119741=0;
            if(!rotaryStatus_in.isPartnerPresent() || rotaryStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 53, column: 4
              rotaryStatus_in.setACK(false);//sysj\orchestrator.sysj line: 53, column: 4
              S119741=1;
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            else {
              S119736=0;
              if(!rotaryStatus_in.isREQ()){//sysj\orchestrator.sysj line: 53, column: 4
                rotaryStatus_in.setACK(true);//sysj\orchestrator.sysj line: 53, column: 4
                S119736=1;
                if(rotaryStatus_in.isREQ()){//sysj\orchestrator.sysj line: 53, column: 4
                  rotaryStatus_in.setACK(false);//sysj\orchestrator.sysj line: 53, column: 4
                  ends[3]=2;
                  ;//sysj\orchestrator.sysj line: 53, column: 4
                  rotaryStat_thread_3 = (rotaryStatus_in.getVal() == null ? null : ((String)rotaryStatus_in.getVal()));//sysj\orchestrator.sysj line: 54, column: 4
                  S119757=1;
                  if(rotaryStat_thread_3 == "done"){//sysj\orchestrator.sysj line: 57, column: 7
                    S120442=0;
                    System.out.println("rotary done, sending filler,loader,screwer, conveyor reqs");//sysj\orchestrator.sysj line: 58, column: 5
                    S119802=0;
                    S119764=0;
                    if(!fillerReq_o.isPartnerPresent() || fillerReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 59, column: 5
                      fillerReq_o.setREQ(false);//sysj\orchestrator.sysj line: 59, column: 5
                      S119764=1;
                      active[3]=1;
                      ends[3]=1;
                      tdone[3]=1;
                    }
                    else {
                      S119759=0;
                      if(fillerReq_o.isACK()){//sysj\orchestrator.sysj line: 59, column: 5
                        fillerReq_o.setVal(true);//sysj\orchestrator.sysj line: 59, column: 5
                        S119759=1;
                        if(!fillerReq_o.isACK()){//sysj\orchestrator.sysj line: 59, column: 5
                          fillerReq_o.setREQ(false);//sysj\orchestrator.sysj line: 59, column: 5
                          ends[3]=2;
                          ;//sysj\orchestrator.sysj line: 59, column: 5
                          S119802=1;
                          S119809=0;
                          if(!percentLiquid_o.isPartnerPresent() || percentLiquid_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 60, column: 5
                            percentLiquid_o.setREQ(false);//sysj\orchestrator.sysj line: 60, column: 5
                            S119809=1;
                            active[3]=1;
                            ends[3]=1;
                            tdone[3]=1;
                          }
                          else {
                            S119804=0;
                            if(percentLiquid_o.isACK()){//sysj\orchestrator.sysj line: 60, column: 5
                              percentLiquid_o.setVal(liquidPercent_thread_3);//sysj\orchestrator.sysj line: 60, column: 5
                              S119804=1;
                              if(!percentLiquid_o.isACK()){//sysj\orchestrator.sysj line: 60, column: 5
                                percentLiquid_o.setREQ(false);//sysj\orchestrator.sysj line: 60, column: 5
                                ends[3]=2;
                                ;//sysj\orchestrator.sysj line: 60, column: 5
                                S119802=2;
                                S119897=0;
                                if(!capLoaderReq_o.isPartnerPresent() || capLoaderReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 61, column: 5
                                  capLoaderReq_o.setREQ(false);//sysj\orchestrator.sysj line: 61, column: 5
                                  S119897=1;
                                  active[3]=1;
                                  ends[3]=1;
                                  tdone[3]=1;
                                }
                                else {
                                  S119892=0;
                                  if(capLoaderReq_o.isACK()){//sysj\orchestrator.sysj line: 61, column: 5
                                    capLoaderReq_o.setVal(true);//sysj\orchestrator.sysj line: 61, column: 5
                                    S119892=1;
                                    if(!capLoaderReq_o.isACK()){//sysj\orchestrator.sysj line: 61, column: 5
                                      capLoaderReq_o.setREQ(false);//sysj\orchestrator.sysj line: 61, column: 5
                                      ends[3]=2;
                                      ;//sysj\orchestrator.sysj line: 61, column: 5
                                      S119802=3;
                                      S120029=0;
                                      if(!capperReq_o.isPartnerPresent() || capperReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 62, column: 5
                                        capperReq_o.setREQ(false);//sysj\orchestrator.sysj line: 62, column: 5
                                        S120029=1;
                                        active[3]=1;
                                        ends[3]=1;
                                        tdone[3]=1;
                                      }
                                      else {
                                        S120024=0;
                                        if(capperReq_o.isACK()){//sysj\orchestrator.sysj line: 62, column: 5
                                          capperReq_o.setVal(true);//sysj\orchestrator.sysj line: 62, column: 5
                                          S120024=1;
                                          if(!capperReq_o.isACK()){//sysj\orchestrator.sysj line: 62, column: 5
                                            capperReq_o.setREQ(false);//sysj\orchestrator.sysj line: 62, column: 5
                                            ends[3]=2;
                                            ;//sysj\orchestrator.sysj line: 62, column: 5
                                            getNextBottle_1.setPresent();//sysj\orchestrator.sysj line: 63, column: 5
                                            currsigs.addElement(getNextBottle_1);
                                            S119757=2;
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
                    S120442=1;
                    S120309=0;
                    S120205=0;
                    if(!fillerReq_o.isPartnerPresent() || fillerReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 66, column: 5
                      fillerReq_o.setREQ(false);//sysj\orchestrator.sysj line: 66, column: 5
                      S120205=1;
                      active[3]=1;
                      ends[3]=1;
                      tdone[3]=1;
                    }
                    else {
                      S120200=0;
                      if(fillerReq_o.isACK()){//sysj\orchestrator.sysj line: 66, column: 5
                        fillerReq_o.setVal(false);//sysj\orchestrator.sysj line: 66, column: 5
                        S120200=1;
                        if(!fillerReq_o.isACK()){//sysj\orchestrator.sysj line: 66, column: 5
                          fillerReq_o.setREQ(false);//sysj\orchestrator.sysj line: 66, column: 5
                          ends[3]=2;
                          ;//sysj\orchestrator.sysj line: 66, column: 5
                          S120309=1;
                          S120227=0;
                          if(!capLoaderReq_o.isPartnerPresent() || capLoaderReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 67, column: 5
                            capLoaderReq_o.setREQ(false);//sysj\orchestrator.sysj line: 67, column: 5
                            S120227=1;
                            active[3]=1;
                            ends[3]=1;
                            tdone[3]=1;
                          }
                          else {
                            S120222=0;
                            if(capLoaderReq_o.isACK()){//sysj\orchestrator.sysj line: 67, column: 5
                              capLoaderReq_o.setVal(false);//sysj\orchestrator.sysj line: 67, column: 5
                              S120222=1;
                              if(!capLoaderReq_o.isACK()){//sysj\orchestrator.sysj line: 67, column: 5
                                capLoaderReq_o.setREQ(false);//sysj\orchestrator.sysj line: 67, column: 5
                                ends[3]=2;
                                ;//sysj\orchestrator.sysj line: 67, column: 5
                                S120309=2;
                                S120316=0;
                                if(!capperReq_o.isPartnerPresent() || capperReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 68, column: 5
                                  capperReq_o.setREQ(false);//sysj\orchestrator.sysj line: 68, column: 5
                                  S120316=1;
                                  active[3]=1;
                                  ends[3]=1;
                                  tdone[3]=1;
                                }
                                else {
                                  S120311=0;
                                  if(capperReq_o.isACK()){//sysj\orchestrator.sysj line: 68, column: 5
                                    capperReq_o.setVal(false);//sysj\orchestrator.sysj line: 68, column: 5
                                    S120311=1;
                                    if(!capperReq_o.isACK()){//sysj\orchestrator.sysj line: 68, column: 5
                                      capperReq_o.setREQ(false);//sysj\orchestrator.sysj line: 68, column: 5
                                      ends[3]=2;
                                      ;//sysj\orchestrator.sysj line: 68, column: 5
                                      S119757=2;
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

  public void thread136818(int [] tdone, int [] ends){
        switch(S119733){
      case 0 : 
        active[2]=0;
        ends[2]=0;
        tdone[2]=1;
        break;
      
      case 1 : 
        switch(S118217){
          case 0 : 
            switch(S117959){
              case 0 : 
                switch(S117921){
                  case 0 : 
                    if(!conveyorReq_o.isPartnerPresent() || conveyorReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 30, column: 5
                      conveyorReq_o.setREQ(false);//sysj\orchestrator.sysj line: 30, column: 5
                      S117921=1;
                      active[2]=1;
                      ends[2]=1;
                      tdone[2]=1;
                    }
                    else {
                      switch(S117916){
                        case 0 : 
                          if(conveyorReq_o.isACK()){//sysj\orchestrator.sysj line: 30, column: 5
                            conveyorReq_o.setVal(true);//sysj\orchestrator.sysj line: 30, column: 5
                            S117916=1;
                            if(!conveyorReq_o.isACK()){//sysj\orchestrator.sysj line: 30, column: 5
                              conveyorReq_o.setREQ(false);//sysj\orchestrator.sysj line: 30, column: 5
                              ends[2]=2;
                              ;//sysj\orchestrator.sysj line: 30, column: 5
                              bottlePlaced_thread_2 = bottlePlaced_thread_2 - 1;//sysj\orchestrator.sysj line: 31, column: 5
                              System.out.println("Number of bottles left to do: " + bottlePlaced_thread_2);//sysj\orchestrator.sysj line: 32, column: 5
                              S117959=1;
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
                          if(!conveyorReq_o.isACK()){//sysj\orchestrator.sysj line: 30, column: 5
                            conveyorReq_o.setREQ(false);//sysj\orchestrator.sysj line: 30, column: 5
                            ends[2]=2;
                            ;//sysj\orchestrator.sysj line: 30, column: 5
                            bottlePlaced_thread_2 = bottlePlaced_thread_2 - 1;//sysj\orchestrator.sysj line: 31, column: 5
                            System.out.println("Number of bottles left to do: " + bottlePlaced_thread_2);//sysj\orchestrator.sysj line: 32, column: 5
                            S117959=1;
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
                    S117921=1;
                    S117921=0;
                    if(!conveyorReq_o.isPartnerPresent() || conveyorReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 30, column: 5
                      conveyorReq_o.setREQ(false);//sysj\orchestrator.sysj line: 30, column: 5
                      S117921=1;
                      active[2]=1;
                      ends[2]=1;
                      tdone[2]=1;
                    }
                    else {
                      S117916=0;
                      if(conveyorReq_o.isACK()){//sysj\orchestrator.sysj line: 30, column: 5
                        conveyorReq_o.setVal(true);//sysj\orchestrator.sysj line: 30, column: 5
                        S117916=1;
                        if(!conveyorReq_o.isACK()){//sysj\orchestrator.sysj line: 30, column: 5
                          conveyorReq_o.setREQ(false);//sysj\orchestrator.sysj line: 30, column: 5
                          ends[2]=2;
                          ;//sysj\orchestrator.sysj line: 30, column: 5
                          bottlePlaced_thread_2 = bottlePlaced_thread_2 - 1;//sysj\orchestrator.sysj line: 31, column: 5
                          System.out.println("Number of bottles left to do: " + bottlePlaced_thread_2);//sysj\orchestrator.sysj line: 32, column: 5
                          S117959=1;
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
                if(getNextBottle_1.getprestatus()){//sysj\orchestrator.sysj line: 33, column: 11
                  S117959=2;
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
                S117959=2;
                if(bottlePlaced_thread_2 >= 0){//sysj\orchestrator.sysj line: 28, column: 10
                  System.out.println("sending conveyor req?");//sysj\orchestrator.sysj line: 29, column: 5
                  S117959=0;
                  S117921=0;
                  if(!conveyorReq_o.isPartnerPresent() || conveyorReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 30, column: 5
                    conveyorReq_o.setREQ(false);//sysj\orchestrator.sysj line: 30, column: 5
                    S117921=1;
                    active[2]=1;
                    ends[2]=1;
                    tdone[2]=1;
                  }
                  else {
                    S117916=0;
                    if(conveyorReq_o.isACK()){//sysj\orchestrator.sysj line: 30, column: 5
                      conveyorReq_o.setVal(true);//sysj\orchestrator.sysj line: 30, column: 5
                      S117916=1;
                      if(!conveyorReq_o.isACK()){//sysj\orchestrator.sysj line: 30, column: 5
                        conveyorReq_o.setREQ(false);//sysj\orchestrator.sysj line: 30, column: 5
                        ends[2]=2;
                        ;//sysj\orchestrator.sysj line: 30, column: 5
                        bottlePlaced_thread_2 = bottlePlaced_thread_2 - 1;//sysj\orchestrator.sysj line: 31, column: 5
                        System.out.println("Number of bottles left to do: " + bottlePlaced_thread_2);//sysj\orchestrator.sysj line: 32, column: 5
                        S117959=1;
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
                  conveyorReq_o.setPreempted();//sysj\orchestrator.sysj line: 28, column: 4
                  ends[2]=2;
                  ;//sysj\orchestrator.sysj line: 28, column: 4
                  System.out.println("Done order");//sysj\orchestrator.sysj line: 38, column: 4
                  S118217=1;
                  active[2]=1;
                  ends[2]=1;
                  tdone[2]=1;
                }
                break;
              
            }
            break;
          
          case 1 : 
            active[2]=1;
            ends[2]=1;
            tdone[2]=1;
            break;
          
          case 2 : 
            S118217=2;
            bottlePlaced_thread_2 = quantity_thread_2;//sysj\orchestrator.sysj line: 27, column: 4
            S118217=0;
            if(bottlePlaced_thread_2 >= 0){//sysj\orchestrator.sysj line: 28, column: 10
              System.out.println("sending conveyor req?");//sysj\orchestrator.sysj line: 29, column: 5
              S117959=0;
              S117921=0;
              if(!conveyorReq_o.isPartnerPresent() || conveyorReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 30, column: 5
                conveyorReq_o.setREQ(false);//sysj\orchestrator.sysj line: 30, column: 5
                S117921=1;
                active[2]=1;
                ends[2]=1;
                tdone[2]=1;
              }
              else {
                S117916=0;
                if(conveyorReq_o.isACK()){//sysj\orchestrator.sysj line: 30, column: 5
                  conveyorReq_o.setVal(true);//sysj\orchestrator.sysj line: 30, column: 5
                  S117916=1;
                  if(!conveyorReq_o.isACK()){//sysj\orchestrator.sysj line: 30, column: 5
                    conveyorReq_o.setREQ(false);//sysj\orchestrator.sysj line: 30, column: 5
                    ends[2]=2;
                    ;//sysj\orchestrator.sysj line: 30, column: 5
                    bottlePlaced_thread_2 = bottlePlaced_thread_2 - 1;//sysj\orchestrator.sysj line: 31, column: 5
                    System.out.println("Number of bottles left to do: " + bottlePlaced_thread_2);//sysj\orchestrator.sysj line: 32, column: 5
                    S117959=1;
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
              conveyorReq_o.setPreempted();//sysj\orchestrator.sysj line: 28, column: 4
              ends[2]=2;
              ;//sysj\orchestrator.sysj line: 28, column: 4
              System.out.println("Done order");//sysj\orchestrator.sysj line: 38, column: 4
              S118217=1;
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread136816(int [] tdone, int [] ends){
        S136806=1;
    S136666=0;
    if((Status.conveyStat == false) && (Status.fillerStat == false) && (Status.capperStat == false) && (Status.capLoaderStat == false)){//sysj\orchestrator.sysj line: 145, column: 7
      S136665=0;
      System.out.println("Orch sending rotary req");//sysj\orchestrator.sysj line: 149, column: 5
      Status.conveyStat = true;//sysj\orchestrator.sysj line: 150, column: 5
      S136605=0;
      if(!allOperationsFinished_o.isPartnerPresent() || allOperationsFinished_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 151, column: 5
        allOperationsFinished_o.setREQ(false);//sysj\orchestrator.sysj line: 151, column: 5
        S136605=1;
        active[8]=1;
        ends[8]=1;
        tdone[8]=1;
      }
      else {
        S136600=0;
        if(allOperationsFinished_o.isACK()){//sysj\orchestrator.sysj line: 151, column: 5
          allOperationsFinished_o.setVal(true);//sysj\orchestrator.sysj line: 151, column: 5
          S136600=1;
          if(!allOperationsFinished_o.isACK()){//sysj\orchestrator.sysj line: 151, column: 5
            allOperationsFinished_o.setREQ(false);//sysj\orchestrator.sysj line: 151, column: 5
            ends[8]=2;
            ;//sysj\orchestrator.sysj line: 151, column: 5
            S136666=1;
            active[8]=1;
            ends[8]=1;
            tdone[8]=1;
          }
          else {
            active[8]=1;
            ends[8]=1;
            tdone[8]=1;
          }
        }
        else {
          active[8]=1;
          ends[8]=1;
          tdone[8]=1;
        }
      }
    }
    else {
      S136665=1;
      S136649=0;
      if(!allOperationsFinished_o.isPartnerPresent() || allOperationsFinished_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 154, column: 5
        allOperationsFinished_o.setREQ(false);//sysj\orchestrator.sysj line: 154, column: 5
        S136649=1;
        active[8]=1;
        ends[8]=1;
        tdone[8]=1;
      }
      else {
        S136644=0;
        if(allOperationsFinished_o.isACK()){//sysj\orchestrator.sysj line: 154, column: 5
          allOperationsFinished_o.setVal(false);//sysj\orchestrator.sysj line: 154, column: 5
          S136644=1;
          if(!allOperationsFinished_o.isACK()){//sysj\orchestrator.sysj line: 154, column: 5
            allOperationsFinished_o.setREQ(false);//sysj\orchestrator.sysj line: 154, column: 5
            ends[8]=2;
            ;//sysj\orchestrator.sysj line: 154, column: 5
            S136666=1;
            active[8]=1;
            ends[8]=1;
            tdone[8]=1;
          }
          else {
            active[8]=1;
            ends[8]=1;
            tdone[8]=1;
          }
        }
        else {
          active[8]=1;
          ends[8]=1;
          tdone[8]=1;
        }
      }
    }
  }

  public void thread136815(int [] tdone, int [] ends){
        S136597=1;
    S136549=0;
    S136533=0;
    if(!capLoaderStatus_in.isPartnerPresent() || capLoaderStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 126, column: 4
      capLoaderStatus_in.setACK(false);//sysj\orchestrator.sysj line: 126, column: 4
      S136533=1;
      active[7]=1;
      ends[7]=1;
      tdone[7]=1;
    }
    else {
      S136528=0;
      if(!capLoaderStatus_in.isREQ()){//sysj\orchestrator.sysj line: 126, column: 4
        capLoaderStatus_in.setACK(true);//sysj\orchestrator.sysj line: 126, column: 4
        S136528=1;
        if(capLoaderStatus_in.isREQ()){//sysj\orchestrator.sysj line: 126, column: 4
          capLoaderStatus_in.setACK(false);//sysj\orchestrator.sysj line: 126, column: 4
          ends[7]=2;
          ;//sysj\orchestrator.sysj line: 126, column: 4
          capLoaderValue_thread_7 = (capLoaderStatus_in.getVal() == null ? null : ((String)capLoaderStatus_in.getVal()));//sysj\orchestrator.sysj line: 127, column: 4
          if(capLoaderValue_thread_7 == "busy") {//sysj\orchestrator.sysj line: 128, column: 34
            System.out.println("Orch received - loader busy");//sysj\orchestrator.sysj line: 129, column: 5
            Status.capLoaderStat = true;//sysj\orchestrator.sysj line: 130, column: 5
          }
          else {//sysj\orchestrator.sysj line: 132, column: 9
            System.out.println("Orch received - loader done");//sysj\orchestrator.sysj line: 133, column: 5
            Status.capLoaderStat = false;//sysj\orchestrator.sysj line: 134, column: 5
          }
          S136549=1;
          active[7]=1;
          ends[7]=1;
          tdone[7]=1;
        }
        else {
          active[7]=1;
          ends[7]=1;
          tdone[7]=1;
        }
      }
      else {
        active[7]=1;
        ends[7]=1;
        tdone[7]=1;
      }
    }
  }

  public void thread136814(int [] tdone, int [] ends){
        S136526=1;
    S136478=0;
    S136462=0;
    if(!capperStatus_in.isPartnerPresent() || capperStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 110, column: 4
      capperStatus_in.setACK(false);//sysj\orchestrator.sysj line: 110, column: 4
      S136462=1;
      active[6]=1;
      ends[6]=1;
      tdone[6]=1;
    }
    else {
      S136457=0;
      if(!capperStatus_in.isREQ()){//sysj\orchestrator.sysj line: 110, column: 4
        capperStatus_in.setACK(true);//sysj\orchestrator.sysj line: 110, column: 4
        S136457=1;
        if(capperStatus_in.isREQ()){//sysj\orchestrator.sysj line: 110, column: 4
          capperStatus_in.setACK(false);//sysj\orchestrator.sysj line: 110, column: 4
          ends[6]=2;
          ;//sysj\orchestrator.sysj line: 110, column: 4
          capperValue_thread_6 = (capperStatus_in.getVal() == null ? null : ((String)capperStatus_in.getVal()));//sysj\orchestrator.sysj line: 111, column: 4
          if(capperValue_thread_6 == "busy") {//sysj\orchestrator.sysj line: 112, column: 31
            System.out.println("Orch received - capper busy");//sysj\orchestrator.sysj line: 113, column: 5
            Status.capperStat = true;//sysj\orchestrator.sysj line: 114, column: 5
          }
          else {//sysj\orchestrator.sysj line: 116, column: 9
            System.out.println("Orch received - capper done");//sysj\orchestrator.sysj line: 117, column: 5
            Status.capperStat = false;//sysj\orchestrator.sysj line: 118, column: 5
          }
          S136478=1;
          active[6]=1;
          ends[6]=1;
          tdone[6]=1;
        }
        else {
          active[6]=1;
          ends[6]=1;
          tdone[6]=1;
        }
      }
      else {
        active[6]=1;
        ends[6]=1;
        tdone[6]=1;
      }
    }
  }

  public void thread136813(int [] tdone, int [] ends){
        S136455=1;
    S136407=0;
    S136391=0;
    if(!fillerStatus_in.isPartnerPresent() || fillerStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 94, column: 4
      fillerStatus_in.setACK(false);//sysj\orchestrator.sysj line: 94, column: 4
      S136391=1;
      active[5]=1;
      ends[5]=1;
      tdone[5]=1;
    }
    else {
      S136386=0;
      if(!fillerStatus_in.isREQ()){//sysj\orchestrator.sysj line: 94, column: 4
        fillerStatus_in.setACK(true);//sysj\orchestrator.sysj line: 94, column: 4
        S136386=1;
        if(fillerStatus_in.isREQ()){//sysj\orchestrator.sysj line: 94, column: 4
          fillerStatus_in.setACK(false);//sysj\orchestrator.sysj line: 94, column: 4
          ends[5]=2;
          ;//sysj\orchestrator.sysj line: 94, column: 4
          fillerValue_thread_5 = (fillerStatus_in.getVal() == null ? null : ((String)fillerStatus_in.getVal()));//sysj\orchestrator.sysj line: 95, column: 4
          if(fillerValue_thread_5 == "busy") {//sysj\orchestrator.sysj line: 96, column: 31
            System.out.println("Orch received - filler busy");//sysj\orchestrator.sysj line: 97, column: 5
            Status.fillerStat = true;//sysj\orchestrator.sysj line: 98, column: 5
          }
          else {//sysj\orchestrator.sysj line: 100, column: 9
            System.out.println("Orch received - filler done");//sysj\orchestrator.sysj line: 101, column: 5
            Status.fillerStat = false;//sysj\orchestrator.sysj line: 102, column: 5
          }
          S136407=1;
          active[5]=1;
          ends[5]=1;
          tdone[5]=1;
        }
        else {
          active[5]=1;
          ends[5]=1;
          tdone[5]=1;
        }
      }
      else {
        active[5]=1;
        ends[5]=1;
        tdone[5]=1;
      }
    }
  }

  public void thread136812(int [] tdone, int [] ends){
        S136384=1;
    S136336=0;
    S136320=0;
    if(!conveyorStatus_in.isPartnerPresent() || conveyorStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 77, column: 4
      conveyorStatus_in.setACK(false);//sysj\orchestrator.sysj line: 77, column: 4
      S136320=1;
      active[4]=1;
      ends[4]=1;
      tdone[4]=1;
    }
    else {
      S136315=0;
      if(!conveyorStatus_in.isREQ()){//sysj\orchestrator.sysj line: 77, column: 4
        conveyorStatus_in.setACK(true);//sysj\orchestrator.sysj line: 77, column: 4
        S136315=1;
        if(conveyorStatus_in.isREQ()){//sysj\orchestrator.sysj line: 77, column: 4
          conveyorStatus_in.setACK(false);//sysj\orchestrator.sysj line: 77, column: 4
          ends[4]=2;
          ;//sysj\orchestrator.sysj line: 77, column: 4
          conveyValue_thread_4 = (conveyorStatus_in.getVal() == null ? null : ((String)conveyorStatus_in.getVal()));//sysj\orchestrator.sysj line: 78, column: 4
          if(conveyValue_thread_4 == "busy") {//sysj\orchestrator.sysj line: 79, column: 31
            System.out.println("Orch received - convey busy");//sysj\orchestrator.sysj line: 80, column: 5
            Status.conveyStat = true;//sysj\orchestrator.sysj line: 81, column: 5
          }
          else {//sysj\orchestrator.sysj line: 83, column: 9
            System.out.println("Orch received - convey done");//sysj\orchestrator.sysj line: 84, column: 5
            Status.conveyStat = false;//sysj\orchestrator.sysj line: 85, column: 5
          }
          S136336=1;
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

  public void thread136811(int [] tdone, int [] ends){
        S136313=1;
    liquidPercent_thread_3 = new ArrayList();//sysj\orchestrator.sysj line: 47, column: 3
    liquidPercent_thread_3.add(10);//sysj\orchestrator.sysj line: 48, column: 3
    liquidPercent_thread_3.add(10);//sysj\orchestrator.sysj line: 49, column: 3
    liquidPercent_thread_3.add(20);//sysj\orchestrator.sysj line: 50, column: 3
    liquidPercent_thread_3.add(60);//sysj\orchestrator.sysj line: 51, column: 3
    S119757=0;
    S119741=0;
    if(!rotaryStatus_in.isPartnerPresent() || rotaryStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 53, column: 4
      rotaryStatus_in.setACK(false);//sysj\orchestrator.sysj line: 53, column: 4
      S119741=1;
      active[3]=1;
      ends[3]=1;
      tdone[3]=1;
    }
    else {
      S119736=0;
      if(!rotaryStatus_in.isREQ()){//sysj\orchestrator.sysj line: 53, column: 4
        rotaryStatus_in.setACK(true);//sysj\orchestrator.sysj line: 53, column: 4
        S119736=1;
        if(rotaryStatus_in.isREQ()){//sysj\orchestrator.sysj line: 53, column: 4
          rotaryStatus_in.setACK(false);//sysj\orchestrator.sysj line: 53, column: 4
          ends[3]=2;
          ;//sysj\orchestrator.sysj line: 53, column: 4
          rotaryStat_thread_3 = (rotaryStatus_in.getVal() == null ? null : ((String)rotaryStatus_in.getVal()));//sysj\orchestrator.sysj line: 54, column: 4
          S119757=1;
          if(rotaryStat_thread_3 == "done"){//sysj\orchestrator.sysj line: 57, column: 7
            S120442=0;
            System.out.println("rotary done, sending filler,loader,screwer, conveyor reqs");//sysj\orchestrator.sysj line: 58, column: 5
            S119802=0;
            S119764=0;
            if(!fillerReq_o.isPartnerPresent() || fillerReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 59, column: 5
              fillerReq_o.setREQ(false);//sysj\orchestrator.sysj line: 59, column: 5
              S119764=1;
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            else {
              S119759=0;
              if(fillerReq_o.isACK()){//sysj\orchestrator.sysj line: 59, column: 5
                fillerReq_o.setVal(true);//sysj\orchestrator.sysj line: 59, column: 5
                S119759=1;
                if(!fillerReq_o.isACK()){//sysj\orchestrator.sysj line: 59, column: 5
                  fillerReq_o.setREQ(false);//sysj\orchestrator.sysj line: 59, column: 5
                  ends[3]=2;
                  ;//sysj\orchestrator.sysj line: 59, column: 5
                  S119802=1;
                  S119809=0;
                  if(!percentLiquid_o.isPartnerPresent() || percentLiquid_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 60, column: 5
                    percentLiquid_o.setREQ(false);//sysj\orchestrator.sysj line: 60, column: 5
                    S119809=1;
                    active[3]=1;
                    ends[3]=1;
                    tdone[3]=1;
                  }
                  else {
                    S119804=0;
                    if(percentLiquid_o.isACK()){//sysj\orchestrator.sysj line: 60, column: 5
                      percentLiquid_o.setVal(liquidPercent_thread_3);//sysj\orchestrator.sysj line: 60, column: 5
                      S119804=1;
                      if(!percentLiquid_o.isACK()){//sysj\orchestrator.sysj line: 60, column: 5
                        percentLiquid_o.setREQ(false);//sysj\orchestrator.sysj line: 60, column: 5
                        ends[3]=2;
                        ;//sysj\orchestrator.sysj line: 60, column: 5
                        S119802=2;
                        S119897=0;
                        if(!capLoaderReq_o.isPartnerPresent() || capLoaderReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 61, column: 5
                          capLoaderReq_o.setREQ(false);//sysj\orchestrator.sysj line: 61, column: 5
                          S119897=1;
                          active[3]=1;
                          ends[3]=1;
                          tdone[3]=1;
                        }
                        else {
                          S119892=0;
                          if(capLoaderReq_o.isACK()){//sysj\orchestrator.sysj line: 61, column: 5
                            capLoaderReq_o.setVal(true);//sysj\orchestrator.sysj line: 61, column: 5
                            S119892=1;
                            if(!capLoaderReq_o.isACK()){//sysj\orchestrator.sysj line: 61, column: 5
                              capLoaderReq_o.setREQ(false);//sysj\orchestrator.sysj line: 61, column: 5
                              ends[3]=2;
                              ;//sysj\orchestrator.sysj line: 61, column: 5
                              S119802=3;
                              S120029=0;
                              if(!capperReq_o.isPartnerPresent() || capperReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 62, column: 5
                                capperReq_o.setREQ(false);//sysj\orchestrator.sysj line: 62, column: 5
                                S120029=1;
                                active[3]=1;
                                ends[3]=1;
                                tdone[3]=1;
                              }
                              else {
                                S120024=0;
                                if(capperReq_o.isACK()){//sysj\orchestrator.sysj line: 62, column: 5
                                  capperReq_o.setVal(true);//sysj\orchestrator.sysj line: 62, column: 5
                                  S120024=1;
                                  if(!capperReq_o.isACK()){//sysj\orchestrator.sysj line: 62, column: 5
                                    capperReq_o.setREQ(false);//sysj\orchestrator.sysj line: 62, column: 5
                                    ends[3]=2;
                                    ;//sysj\orchestrator.sysj line: 62, column: 5
                                    getNextBottle_1.setPresent();//sysj\orchestrator.sysj line: 63, column: 5
                                    currsigs.addElement(getNextBottle_1);
                                    S119757=2;
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
            S120442=1;
            S120309=0;
            S120205=0;
            if(!fillerReq_o.isPartnerPresent() || fillerReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 66, column: 5
              fillerReq_o.setREQ(false);//sysj\orchestrator.sysj line: 66, column: 5
              S120205=1;
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            else {
              S120200=0;
              if(fillerReq_o.isACK()){//sysj\orchestrator.sysj line: 66, column: 5
                fillerReq_o.setVal(false);//sysj\orchestrator.sysj line: 66, column: 5
                S120200=1;
                if(!fillerReq_o.isACK()){//sysj\orchestrator.sysj line: 66, column: 5
                  fillerReq_o.setREQ(false);//sysj\orchestrator.sysj line: 66, column: 5
                  ends[3]=2;
                  ;//sysj\orchestrator.sysj line: 66, column: 5
                  S120309=1;
                  S120227=0;
                  if(!capLoaderReq_o.isPartnerPresent() || capLoaderReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 67, column: 5
                    capLoaderReq_o.setREQ(false);//sysj\orchestrator.sysj line: 67, column: 5
                    S120227=1;
                    active[3]=1;
                    ends[3]=1;
                    tdone[3]=1;
                  }
                  else {
                    S120222=0;
                    if(capLoaderReq_o.isACK()){//sysj\orchestrator.sysj line: 67, column: 5
                      capLoaderReq_o.setVal(false);//sysj\orchestrator.sysj line: 67, column: 5
                      S120222=1;
                      if(!capLoaderReq_o.isACK()){//sysj\orchestrator.sysj line: 67, column: 5
                        capLoaderReq_o.setREQ(false);//sysj\orchestrator.sysj line: 67, column: 5
                        ends[3]=2;
                        ;//sysj\orchestrator.sysj line: 67, column: 5
                        S120309=2;
                        S120316=0;
                        if(!capperReq_o.isPartnerPresent() || capperReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 68, column: 5
                          capperReq_o.setREQ(false);//sysj\orchestrator.sysj line: 68, column: 5
                          S120316=1;
                          active[3]=1;
                          ends[3]=1;
                          tdone[3]=1;
                        }
                        else {
                          S120311=0;
                          if(capperReq_o.isACK()){//sysj\orchestrator.sysj line: 68, column: 5
                            capperReq_o.setVal(false);//sysj\orchestrator.sysj line: 68, column: 5
                            S120311=1;
                            if(!capperReq_o.isACK()){//sysj\orchestrator.sysj line: 68, column: 5
                              capperReq_o.setREQ(false);//sysj\orchestrator.sysj line: 68, column: 5
                              ends[3]=2;
                              ;//sysj\orchestrator.sysj line: 68, column: 5
                              S119757=2;
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

  public void thread136810(int [] tdone, int [] ends){
        S119733=1;
    quantity_thread_2 = 5;//sysj\orchestrator.sysj line: 20, column: 3
    bottlePlaced_thread_2 = 0;//sysj\orchestrator.sysj line: 21, column: 3
    bottlePlaced_thread_2 = quantity_thread_2;//sysj\orchestrator.sysj line: 27, column: 4
    S118217=0;
    if(bottlePlaced_thread_2 >= 0){//sysj\orchestrator.sysj line: 28, column: 10
      System.out.println("sending conveyor req?");//sysj\orchestrator.sysj line: 29, column: 5
      S117959=0;
      S117921=0;
      if(!conveyorReq_o.isPartnerPresent() || conveyorReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 30, column: 5
        conveyorReq_o.setREQ(false);//sysj\orchestrator.sysj line: 30, column: 5
        S117921=1;
        active[2]=1;
        ends[2]=1;
        tdone[2]=1;
      }
      else {
        S117916=0;
        if(conveyorReq_o.isACK()){//sysj\orchestrator.sysj line: 30, column: 5
          conveyorReq_o.setVal(true);//sysj\orchestrator.sysj line: 30, column: 5
          S117916=1;
          if(!conveyorReq_o.isACK()){//sysj\orchestrator.sysj line: 30, column: 5
            conveyorReq_o.setREQ(false);//sysj\orchestrator.sysj line: 30, column: 5
            ends[2]=2;
            ;//sysj\orchestrator.sysj line: 30, column: 5
            bottlePlaced_thread_2 = bottlePlaced_thread_2 - 1;//sysj\orchestrator.sysj line: 31, column: 5
            System.out.println("Number of bottles left to do: " + bottlePlaced_thread_2);//sysj\orchestrator.sysj line: 32, column: 5
            S117959=1;
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
      conveyorReq_o.setPreempted();//sysj\orchestrator.sysj line: 28, column: 4
      ends[2]=2;
      ;//sysj\orchestrator.sysj line: 28, column: 4
      System.out.println("Done order");//sysj\orchestrator.sysj line: 38, column: 4
      S118217=1;
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
      switch(S136808){
        case 0 : 
          S136808=0;
          break RUN;
        
        case 1 : 
          S136808=2;
          S136808=2;
          getNextBottle_1.setClear();//sysj\orchestrator.sysj line: 16, column: 2
          thread136810(tdone,ends);
          thread136811(tdone,ends);
          thread136812(tdone,ends);
          thread136813(tdone,ends);
          thread136814(tdone,ends);
          thread136815(tdone,ends);
          thread136816(tdone,ends);
          int biggest136817 = 0;
          if(ends[2]>=biggest136817){
            biggest136817=ends[2];
          }
          if(ends[3]>=biggest136817){
            biggest136817=ends[3];
          }
          if(ends[4]>=biggest136817){
            biggest136817=ends[4];
          }
          if(ends[5]>=biggest136817){
            biggest136817=ends[5];
          }
          if(ends[6]>=biggest136817){
            biggest136817=ends[6];
          }
          if(ends[7]>=biggest136817){
            biggest136817=ends[7];
          }
          if(ends[8]>=biggest136817){
            biggest136817=ends[8];
          }
          if(biggest136817 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
        
        case 2 : 
          getNextBottle_1.setClear();//sysj\orchestrator.sysj line: 16, column: 2
          thread136818(tdone,ends);
          thread136819(tdone,ends);
          thread136820(tdone,ends);
          thread136821(tdone,ends);
          thread136822(tdone,ends);
          thread136823(tdone,ends);
          thread136824(tdone,ends);
          int biggest136825 = 0;
          if(ends[2]>=biggest136825){
            biggest136825=ends[2];
          }
          if(ends[3]>=biggest136825){
            biggest136825=ends[3];
          }
          if(ends[4]>=biggest136825){
            biggest136825=ends[4];
          }
          if(ends[5]>=biggest136825){
            biggest136825=ends[5];
          }
          if(ends[6]>=biggest136825){
            biggest136825=ends[6];
          }
          if(ends[7]>=biggest136825){
            biggest136825=ends[7];
          }
          if(ends[8]>=biggest136825){
            biggest136825=ends[8];
          }
          if(biggest136825 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
          //FINXME code
          if(biggest136825 == 0){
            S136808=0;
            active[1]=0;
            ends[1]=0;
            S136808=0;
            break RUN;
          }
        
      }
    }
  }

  public void init(){
    char [] active1 = {1, 1, 1, 1, 1, 1, 1, 1, 1};
    char [] paused1 = {0, 0, 0, 0, 0, 0, 0, 0, 0};
    char [] suspended1 = {0, 0, 0, 0, 0, 0, 0, 0, 0};
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
