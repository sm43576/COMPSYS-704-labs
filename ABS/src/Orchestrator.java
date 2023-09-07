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
  private String rotaryStat_thread_3;//sysj\orchestrator.sysj line: 53, column: 4
  private String conveyValue_thread_4;//sysj\orchestrator.sysj line: 76, column: 4
  private String fillerValue_thread_5;//sysj\orchestrator.sysj line: 91, column: 4
  private String capperValue_thread_6;//sysj\orchestrator.sysj line: 105, column: 4
  private String capLoaderValue_thread_7;//sysj\orchestrator.sysj line: 117, column: 4
  private int S125156 = 1;
  private int S118551 = 1;
  private int S117035 = 1;
  private int S116777 = 1;
  private int S116739 = 1;
  private int S116734 = 1;
  private int S124730 = 1;
  private int S118574 = 1;
  private int S118558 = 1;
  private int S118553 = 1;
  private int S119083 = 1;
  private int S118619 = 1;
  private int S118581 = 1;
  private int S118576 = 1;
  private int S118626 = 1;
  private int S118621 = 1;
  private int S118714 = 1;
  private int S118709 = 1;
  private int S118950 = 1;
  private int S118846 = 1;
  private int S118841 = 1;
  private int S118868 = 1;
  private int S118863 = 1;
  private int S118957 = 1;
  private int S118952 = 1;
  private int S124801 = 1;
  private int S124753 = 1;
  private int S124737 = 1;
  private int S124732 = 1;
  private int S124872 = 1;
  private int S124824 = 1;
  private int S124808 = 1;
  private int S124803 = 1;
  private int S124943 = 1;
  private int S124895 = 1;
  private int S124879 = 1;
  private int S124874 = 1;
  private int S125014 = 1;
  private int S124966 = 1;
  private int S124950 = 1;
  private int S124945 = 1;
  private int S125154 = 1;
  private int S125060 = 1;
  private int S125059 = 1;
  private int S125021 = 1;
  private int S125016 = 1;
  private int S125043 = 1;
  private int S125038 = 1;
  
  private int[] ends = new int[9];
  private int[] tdone = new int[9];
  
  public void thread125172(int [] tdone, int [] ends){
        switch(S125154){
      case 0 : 
        active[8]=0;
        ends[8]=0;
        tdone[8]=1;
        break;
      
      case 1 : 
        switch(S125060){
          case 0 : 
            switch(S125059){
              case 0 : 
                switch(S125021){
                  case 0 : 
                    if(!allOperationsFinished_o.isPartnerPresent() || allOperationsFinished_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 137, column: 5
                      allOperationsFinished_o.setREQ(false);//sysj\orchestrator.sysj line: 137, column: 5
                      S125021=1;
                      active[8]=1;
                      ends[8]=1;
                      tdone[8]=1;
                    }
                    else {
                      switch(S125016){
                        case 0 : 
                          if(allOperationsFinished_o.isACK()){//sysj\orchestrator.sysj line: 137, column: 5
                            allOperationsFinished_o.setVal(true);//sysj\orchestrator.sysj line: 137, column: 5
                            S125016=1;
                            if(!allOperationsFinished_o.isACK()){//sysj\orchestrator.sysj line: 137, column: 5
                              allOperationsFinished_o.setREQ(false);//sysj\orchestrator.sysj line: 137, column: 5
                              ends[8]=2;
                              ;//sysj\orchestrator.sysj line: 137, column: 5
                              S125060=1;
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
                          if(!allOperationsFinished_o.isACK()){//sysj\orchestrator.sysj line: 137, column: 5
                            allOperationsFinished_o.setREQ(false);//sysj\orchestrator.sysj line: 137, column: 5
                            ends[8]=2;
                            ;//sysj\orchestrator.sysj line: 137, column: 5
                            S125060=1;
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
                    S125021=1;
                    S125021=0;
                    if(!allOperationsFinished_o.isPartnerPresent() || allOperationsFinished_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 137, column: 5
                      allOperationsFinished_o.setREQ(false);//sysj\orchestrator.sysj line: 137, column: 5
                      S125021=1;
                      active[8]=1;
                      ends[8]=1;
                      tdone[8]=1;
                    }
                    else {
                      S125016=0;
                      if(allOperationsFinished_o.isACK()){//sysj\orchestrator.sysj line: 137, column: 5
                        allOperationsFinished_o.setVal(true);//sysj\orchestrator.sysj line: 137, column: 5
                        S125016=1;
                        if(!allOperationsFinished_o.isACK()){//sysj\orchestrator.sysj line: 137, column: 5
                          allOperationsFinished_o.setREQ(false);//sysj\orchestrator.sysj line: 137, column: 5
                          ends[8]=2;
                          ;//sysj\orchestrator.sysj line: 137, column: 5
                          S125060=1;
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
                switch(S125043){
                  case 0 : 
                    if(!allOperationsFinished_o.isPartnerPresent() || allOperationsFinished_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 139, column: 5
                      allOperationsFinished_o.setREQ(false);//sysj\orchestrator.sysj line: 139, column: 5
                      S125043=1;
                      active[8]=1;
                      ends[8]=1;
                      tdone[8]=1;
                    }
                    else {
                      switch(S125038){
                        case 0 : 
                          if(allOperationsFinished_o.isACK()){//sysj\orchestrator.sysj line: 139, column: 5
                            allOperationsFinished_o.setVal(false);//sysj\orchestrator.sysj line: 139, column: 5
                            S125038=1;
                            if(!allOperationsFinished_o.isACK()){//sysj\orchestrator.sysj line: 139, column: 5
                              allOperationsFinished_o.setREQ(false);//sysj\orchestrator.sysj line: 139, column: 5
                              ends[8]=2;
                              ;//sysj\orchestrator.sysj line: 139, column: 5
                              S125060=1;
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
                          if(!allOperationsFinished_o.isACK()){//sysj\orchestrator.sysj line: 139, column: 5
                            allOperationsFinished_o.setREQ(false);//sysj\orchestrator.sysj line: 139, column: 5
                            ends[8]=2;
                            ;//sysj\orchestrator.sysj line: 139, column: 5
                            S125060=1;
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
                    S125043=1;
                    S125043=0;
                    if(!allOperationsFinished_o.isPartnerPresent() || allOperationsFinished_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 139, column: 5
                      allOperationsFinished_o.setREQ(false);//sysj\orchestrator.sysj line: 139, column: 5
                      S125043=1;
                      active[8]=1;
                      ends[8]=1;
                      tdone[8]=1;
                    }
                    else {
                      S125038=0;
                      if(allOperationsFinished_o.isACK()){//sysj\orchestrator.sysj line: 139, column: 5
                        allOperationsFinished_o.setVal(false);//sysj\orchestrator.sysj line: 139, column: 5
                        S125038=1;
                        if(!allOperationsFinished_o.isACK()){//sysj\orchestrator.sysj line: 139, column: 5
                          allOperationsFinished_o.setREQ(false);//sysj\orchestrator.sysj line: 139, column: 5
                          ends[8]=2;
                          ;//sysj\orchestrator.sysj line: 139, column: 5
                          S125060=1;
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
            S125060=1;
            S125060=0;
            if((Status.conveyStat == true) && (Status.fillerStat == true) && (Status.capperStat == true) && (Status.capLoaderStat == true)){//sysj\orchestrator.sysj line: 132, column: 7
              S125059=0;
              S125021=0;
              if(!allOperationsFinished_o.isPartnerPresent() || allOperationsFinished_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 137, column: 5
                allOperationsFinished_o.setREQ(false);//sysj\orchestrator.sysj line: 137, column: 5
                S125021=1;
                active[8]=1;
                ends[8]=1;
                tdone[8]=1;
              }
              else {
                S125016=0;
                if(allOperationsFinished_o.isACK()){//sysj\orchestrator.sysj line: 137, column: 5
                  allOperationsFinished_o.setVal(true);//sysj\orchestrator.sysj line: 137, column: 5
                  S125016=1;
                  if(!allOperationsFinished_o.isACK()){//sysj\orchestrator.sysj line: 137, column: 5
                    allOperationsFinished_o.setREQ(false);//sysj\orchestrator.sysj line: 137, column: 5
                    ends[8]=2;
                    ;//sysj\orchestrator.sysj line: 137, column: 5
                    S125060=1;
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
              S125059=1;
              S125043=0;
              if(!allOperationsFinished_o.isPartnerPresent() || allOperationsFinished_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 139, column: 5
                allOperationsFinished_o.setREQ(false);//sysj\orchestrator.sysj line: 139, column: 5
                S125043=1;
                active[8]=1;
                ends[8]=1;
                tdone[8]=1;
              }
              else {
                S125038=0;
                if(allOperationsFinished_o.isACK()){//sysj\orchestrator.sysj line: 139, column: 5
                  allOperationsFinished_o.setVal(false);//sysj\orchestrator.sysj line: 139, column: 5
                  S125038=1;
                  if(!allOperationsFinished_o.isACK()){//sysj\orchestrator.sysj line: 139, column: 5
                    allOperationsFinished_o.setREQ(false);//sysj\orchestrator.sysj line: 139, column: 5
                    ends[8]=2;
                    ;//sysj\orchestrator.sysj line: 139, column: 5
                    S125060=1;
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

  public void thread125171(int [] tdone, int [] ends){
        switch(S125014){
      case 0 : 
        active[7]=0;
        ends[7]=0;
        tdone[7]=1;
        break;
      
      case 1 : 
        switch(S124966){
          case 0 : 
            switch(S124950){
              case 0 : 
                if(!capLoaderStatus_in.isPartnerPresent() || capLoaderStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 116, column: 4
                  capLoaderStatus_in.setACK(false);//sysj\orchestrator.sysj line: 116, column: 4
                  S124950=1;
                  active[7]=1;
                  ends[7]=1;
                  tdone[7]=1;
                }
                else {
                  switch(S124945){
                    case 0 : 
                      if(!capLoaderStatus_in.isREQ()){//sysj\orchestrator.sysj line: 116, column: 4
                        capLoaderStatus_in.setACK(true);//sysj\orchestrator.sysj line: 116, column: 4
                        S124945=1;
                        if(capLoaderStatus_in.isREQ()){//sysj\orchestrator.sysj line: 116, column: 4
                          capLoaderStatus_in.setACK(false);//sysj\orchestrator.sysj line: 116, column: 4
                          ends[7]=2;
                          ;//sysj\orchestrator.sysj line: 116, column: 4
                          capLoaderValue_thread_7 = (capLoaderStatus_in.getVal() == null ? null : ((String)capLoaderStatus_in.getVal()));//sysj\orchestrator.sysj line: 117, column: 4
                          if(capLoaderValue_thread_7 == "busy") {//sysj\orchestrator.sysj line: 118, column: 34
                            Status.capLoaderStat = true;//sysj\orchestrator.sysj line: 119, column: 5
                          }
                          else {//sysj\orchestrator.sysj line: 121, column: 9
                            Status.capLoaderStat = false;//sysj\orchestrator.sysj line: 122, column: 5
                          }
                          S124966=1;
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
                      if(capLoaderStatus_in.isREQ()){//sysj\orchestrator.sysj line: 116, column: 4
                        capLoaderStatus_in.setACK(false);//sysj\orchestrator.sysj line: 116, column: 4
                        ends[7]=2;
                        ;//sysj\orchestrator.sysj line: 116, column: 4
                        capLoaderValue_thread_7 = (capLoaderStatus_in.getVal() == null ? null : ((String)capLoaderStatus_in.getVal()));//sysj\orchestrator.sysj line: 117, column: 4
                        if(capLoaderValue_thread_7 == "busy") {//sysj\orchestrator.sysj line: 118, column: 34
                          Status.capLoaderStat = true;//sysj\orchestrator.sysj line: 119, column: 5
                        }
                        else {//sysj\orchestrator.sysj line: 121, column: 9
                          Status.capLoaderStat = false;//sysj\orchestrator.sysj line: 122, column: 5
                        }
                        S124966=1;
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
                S124950=1;
                S124950=0;
                if(!capLoaderStatus_in.isPartnerPresent() || capLoaderStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 116, column: 4
                  capLoaderStatus_in.setACK(false);//sysj\orchestrator.sysj line: 116, column: 4
                  S124950=1;
                  active[7]=1;
                  ends[7]=1;
                  tdone[7]=1;
                }
                else {
                  S124945=0;
                  if(!capLoaderStatus_in.isREQ()){//sysj\orchestrator.sysj line: 116, column: 4
                    capLoaderStatus_in.setACK(true);//sysj\orchestrator.sysj line: 116, column: 4
                    S124945=1;
                    if(capLoaderStatus_in.isREQ()){//sysj\orchestrator.sysj line: 116, column: 4
                      capLoaderStatus_in.setACK(false);//sysj\orchestrator.sysj line: 116, column: 4
                      ends[7]=2;
                      ;//sysj\orchestrator.sysj line: 116, column: 4
                      capLoaderValue_thread_7 = (capLoaderStatus_in.getVal() == null ? null : ((String)capLoaderStatus_in.getVal()));//sysj\orchestrator.sysj line: 117, column: 4
                      if(capLoaderValue_thread_7 == "busy") {//sysj\orchestrator.sysj line: 118, column: 34
                        Status.capLoaderStat = true;//sysj\orchestrator.sysj line: 119, column: 5
                      }
                      else {//sysj\orchestrator.sysj line: 121, column: 9
                        Status.capLoaderStat = false;//sysj\orchestrator.sysj line: 122, column: 5
                      }
                      S124966=1;
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
            S124966=1;
            S124966=0;
            S124950=0;
            if(!capLoaderStatus_in.isPartnerPresent() || capLoaderStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 116, column: 4
              capLoaderStatus_in.setACK(false);//sysj\orchestrator.sysj line: 116, column: 4
              S124950=1;
              active[7]=1;
              ends[7]=1;
              tdone[7]=1;
            }
            else {
              S124945=0;
              if(!capLoaderStatus_in.isREQ()){//sysj\orchestrator.sysj line: 116, column: 4
                capLoaderStatus_in.setACK(true);//sysj\orchestrator.sysj line: 116, column: 4
                S124945=1;
                if(capLoaderStatus_in.isREQ()){//sysj\orchestrator.sysj line: 116, column: 4
                  capLoaderStatus_in.setACK(false);//sysj\orchestrator.sysj line: 116, column: 4
                  ends[7]=2;
                  ;//sysj\orchestrator.sysj line: 116, column: 4
                  capLoaderValue_thread_7 = (capLoaderStatus_in.getVal() == null ? null : ((String)capLoaderStatus_in.getVal()));//sysj\orchestrator.sysj line: 117, column: 4
                  if(capLoaderValue_thread_7 == "busy") {//sysj\orchestrator.sysj line: 118, column: 34
                    Status.capLoaderStat = true;//sysj\orchestrator.sysj line: 119, column: 5
                  }
                  else {//sysj\orchestrator.sysj line: 121, column: 9
                    Status.capLoaderStat = false;//sysj\orchestrator.sysj line: 122, column: 5
                  }
                  S124966=1;
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

  public void thread125170(int [] tdone, int [] ends){
        switch(S124943){
      case 0 : 
        active[6]=0;
        ends[6]=0;
        tdone[6]=1;
        break;
      
      case 1 : 
        switch(S124895){
          case 0 : 
            switch(S124879){
              case 0 : 
                if(!capperStatus_in.isPartnerPresent() || capperStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 104, column: 4
                  capperStatus_in.setACK(false);//sysj\orchestrator.sysj line: 104, column: 4
                  S124879=1;
                  active[6]=1;
                  ends[6]=1;
                  tdone[6]=1;
                }
                else {
                  switch(S124874){
                    case 0 : 
                      if(!capperStatus_in.isREQ()){//sysj\orchestrator.sysj line: 104, column: 4
                        capperStatus_in.setACK(true);//sysj\orchestrator.sysj line: 104, column: 4
                        S124874=1;
                        if(capperStatus_in.isREQ()){//sysj\orchestrator.sysj line: 104, column: 4
                          capperStatus_in.setACK(false);//sysj\orchestrator.sysj line: 104, column: 4
                          ends[6]=2;
                          ;//sysj\orchestrator.sysj line: 104, column: 4
                          capperValue_thread_6 = (capperStatus_in.getVal() == null ? null : ((String)capperStatus_in.getVal()));//sysj\orchestrator.sysj line: 105, column: 4
                          if(capperValue_thread_6 == "busy") {//sysj\orchestrator.sysj line: 106, column: 31
                            Status.capperStat = true;//sysj\orchestrator.sysj line: 107, column: 5
                          }
                          else {//sysj\orchestrator.sysj line: 109, column: 9
                          }
                          S124895=1;
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
                      if(capperStatus_in.isREQ()){//sysj\orchestrator.sysj line: 104, column: 4
                        capperStatus_in.setACK(false);//sysj\orchestrator.sysj line: 104, column: 4
                        ends[6]=2;
                        ;//sysj\orchestrator.sysj line: 104, column: 4
                        capperValue_thread_6 = (capperStatus_in.getVal() == null ? null : ((String)capperStatus_in.getVal()));//sysj\orchestrator.sysj line: 105, column: 4
                        if(capperValue_thread_6 == "busy") {//sysj\orchestrator.sysj line: 106, column: 31
                          Status.capperStat = true;//sysj\orchestrator.sysj line: 107, column: 5
                        }
                        else {//sysj\orchestrator.sysj line: 109, column: 9
                        }
                        S124895=1;
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
                S124879=1;
                S124879=0;
                if(!capperStatus_in.isPartnerPresent() || capperStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 104, column: 4
                  capperStatus_in.setACK(false);//sysj\orchestrator.sysj line: 104, column: 4
                  S124879=1;
                  active[6]=1;
                  ends[6]=1;
                  tdone[6]=1;
                }
                else {
                  S124874=0;
                  if(!capperStatus_in.isREQ()){//sysj\orchestrator.sysj line: 104, column: 4
                    capperStatus_in.setACK(true);//sysj\orchestrator.sysj line: 104, column: 4
                    S124874=1;
                    if(capperStatus_in.isREQ()){//sysj\orchestrator.sysj line: 104, column: 4
                      capperStatus_in.setACK(false);//sysj\orchestrator.sysj line: 104, column: 4
                      ends[6]=2;
                      ;//sysj\orchestrator.sysj line: 104, column: 4
                      capperValue_thread_6 = (capperStatus_in.getVal() == null ? null : ((String)capperStatus_in.getVal()));//sysj\orchestrator.sysj line: 105, column: 4
                      if(capperValue_thread_6 == "busy") {//sysj\orchestrator.sysj line: 106, column: 31
                        Status.capperStat = true;//sysj\orchestrator.sysj line: 107, column: 5
                      }
                      else {//sysj\orchestrator.sysj line: 109, column: 9
                      }
                      S124895=1;
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
            S124895=1;
            S124895=0;
            S124879=0;
            if(!capperStatus_in.isPartnerPresent() || capperStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 104, column: 4
              capperStatus_in.setACK(false);//sysj\orchestrator.sysj line: 104, column: 4
              S124879=1;
              active[6]=1;
              ends[6]=1;
              tdone[6]=1;
            }
            else {
              S124874=0;
              if(!capperStatus_in.isREQ()){//sysj\orchestrator.sysj line: 104, column: 4
                capperStatus_in.setACK(true);//sysj\orchestrator.sysj line: 104, column: 4
                S124874=1;
                if(capperStatus_in.isREQ()){//sysj\orchestrator.sysj line: 104, column: 4
                  capperStatus_in.setACK(false);//sysj\orchestrator.sysj line: 104, column: 4
                  ends[6]=2;
                  ;//sysj\orchestrator.sysj line: 104, column: 4
                  capperValue_thread_6 = (capperStatus_in.getVal() == null ? null : ((String)capperStatus_in.getVal()));//sysj\orchestrator.sysj line: 105, column: 4
                  if(capperValue_thread_6 == "busy") {//sysj\orchestrator.sysj line: 106, column: 31
                    Status.capperStat = true;//sysj\orchestrator.sysj line: 107, column: 5
                  }
                  else {//sysj\orchestrator.sysj line: 109, column: 9
                  }
                  S124895=1;
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

  public void thread125169(int [] tdone, int [] ends){
        switch(S124872){
      case 0 : 
        active[5]=0;
        ends[5]=0;
        tdone[5]=1;
        break;
      
      case 1 : 
        switch(S124824){
          case 0 : 
            switch(S124808){
              case 0 : 
                if(!fillerStatus_in.isPartnerPresent() || fillerStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 90, column: 4
                  fillerStatus_in.setACK(false);//sysj\orchestrator.sysj line: 90, column: 4
                  S124808=1;
                  active[5]=1;
                  ends[5]=1;
                  tdone[5]=1;
                }
                else {
                  switch(S124803){
                    case 0 : 
                      if(!fillerStatus_in.isREQ()){//sysj\orchestrator.sysj line: 90, column: 4
                        fillerStatus_in.setACK(true);//sysj\orchestrator.sysj line: 90, column: 4
                        S124803=1;
                        if(fillerStatus_in.isREQ()){//sysj\orchestrator.sysj line: 90, column: 4
                          fillerStatus_in.setACK(false);//sysj\orchestrator.sysj line: 90, column: 4
                          ends[5]=2;
                          ;//sysj\orchestrator.sysj line: 90, column: 4
                          fillerValue_thread_5 = (fillerStatus_in.getVal() == null ? null : ((String)fillerStatus_in.getVal()));//sysj\orchestrator.sysj line: 91, column: 4
                          if(fillerValue_thread_5 == "busy") {//sysj\orchestrator.sysj line: 92, column: 31
                            Status.fillerStat = true;//sysj\orchestrator.sysj line: 93, column: 5
                          }
                          else {//sysj\orchestrator.sysj line: 95, column: 9
                            Status.fillerStat = false;//sysj\orchestrator.sysj line: 96, column: 5
                          }
                          S124824=1;
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
                      if(fillerStatus_in.isREQ()){//sysj\orchestrator.sysj line: 90, column: 4
                        fillerStatus_in.setACK(false);//sysj\orchestrator.sysj line: 90, column: 4
                        ends[5]=2;
                        ;//sysj\orchestrator.sysj line: 90, column: 4
                        fillerValue_thread_5 = (fillerStatus_in.getVal() == null ? null : ((String)fillerStatus_in.getVal()));//sysj\orchestrator.sysj line: 91, column: 4
                        if(fillerValue_thread_5 == "busy") {//sysj\orchestrator.sysj line: 92, column: 31
                          Status.fillerStat = true;//sysj\orchestrator.sysj line: 93, column: 5
                        }
                        else {//sysj\orchestrator.sysj line: 95, column: 9
                          Status.fillerStat = false;//sysj\orchestrator.sysj line: 96, column: 5
                        }
                        S124824=1;
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
                S124808=1;
                S124808=0;
                if(!fillerStatus_in.isPartnerPresent() || fillerStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 90, column: 4
                  fillerStatus_in.setACK(false);//sysj\orchestrator.sysj line: 90, column: 4
                  S124808=1;
                  active[5]=1;
                  ends[5]=1;
                  tdone[5]=1;
                }
                else {
                  S124803=0;
                  if(!fillerStatus_in.isREQ()){//sysj\orchestrator.sysj line: 90, column: 4
                    fillerStatus_in.setACK(true);//sysj\orchestrator.sysj line: 90, column: 4
                    S124803=1;
                    if(fillerStatus_in.isREQ()){//sysj\orchestrator.sysj line: 90, column: 4
                      fillerStatus_in.setACK(false);//sysj\orchestrator.sysj line: 90, column: 4
                      ends[5]=2;
                      ;//sysj\orchestrator.sysj line: 90, column: 4
                      fillerValue_thread_5 = (fillerStatus_in.getVal() == null ? null : ((String)fillerStatus_in.getVal()));//sysj\orchestrator.sysj line: 91, column: 4
                      if(fillerValue_thread_5 == "busy") {//sysj\orchestrator.sysj line: 92, column: 31
                        Status.fillerStat = true;//sysj\orchestrator.sysj line: 93, column: 5
                      }
                      else {//sysj\orchestrator.sysj line: 95, column: 9
                        Status.fillerStat = false;//sysj\orchestrator.sysj line: 96, column: 5
                      }
                      S124824=1;
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
            S124824=1;
            S124824=0;
            S124808=0;
            if(!fillerStatus_in.isPartnerPresent() || fillerStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 90, column: 4
              fillerStatus_in.setACK(false);//sysj\orchestrator.sysj line: 90, column: 4
              S124808=1;
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            else {
              S124803=0;
              if(!fillerStatus_in.isREQ()){//sysj\orchestrator.sysj line: 90, column: 4
                fillerStatus_in.setACK(true);//sysj\orchestrator.sysj line: 90, column: 4
                S124803=1;
                if(fillerStatus_in.isREQ()){//sysj\orchestrator.sysj line: 90, column: 4
                  fillerStatus_in.setACK(false);//sysj\orchestrator.sysj line: 90, column: 4
                  ends[5]=2;
                  ;//sysj\orchestrator.sysj line: 90, column: 4
                  fillerValue_thread_5 = (fillerStatus_in.getVal() == null ? null : ((String)fillerStatus_in.getVal()));//sysj\orchestrator.sysj line: 91, column: 4
                  if(fillerValue_thread_5 == "busy") {//sysj\orchestrator.sysj line: 92, column: 31
                    Status.fillerStat = true;//sysj\orchestrator.sysj line: 93, column: 5
                  }
                  else {//sysj\orchestrator.sysj line: 95, column: 9
                    Status.fillerStat = false;//sysj\orchestrator.sysj line: 96, column: 5
                  }
                  S124824=1;
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

  public void thread125168(int [] tdone, int [] ends){
        switch(S124801){
      case 0 : 
        active[4]=0;
        ends[4]=0;
        tdone[4]=1;
        break;
      
      case 1 : 
        switch(S124753){
          case 0 : 
            switch(S124737){
              case 0 : 
                if(!conveyorStatus_in.isPartnerPresent() || conveyorStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 75, column: 4
                  conveyorStatus_in.setACK(false);//sysj\orchestrator.sysj line: 75, column: 4
                  S124737=1;
                  active[4]=1;
                  ends[4]=1;
                  tdone[4]=1;
                }
                else {
                  switch(S124732){
                    case 0 : 
                      if(!conveyorStatus_in.isREQ()){//sysj\orchestrator.sysj line: 75, column: 4
                        conveyorStatus_in.setACK(true);//sysj\orchestrator.sysj line: 75, column: 4
                        S124732=1;
                        if(conveyorStatus_in.isREQ()){//sysj\orchestrator.sysj line: 75, column: 4
                          conveyorStatus_in.setACK(false);//sysj\orchestrator.sysj line: 75, column: 4
                          ends[4]=2;
                          ;//sysj\orchestrator.sysj line: 75, column: 4
                          conveyValue_thread_4 = (conveyorStatus_in.getVal() == null ? null : ((String)conveyorStatus_in.getVal()));//sysj\orchestrator.sysj line: 76, column: 4
                          if(conveyValue_thread_4 == "busy") {//sysj\orchestrator.sysj line: 77, column: 31
                            Status.conveyStat = true;//sysj\orchestrator.sysj line: 78, column: 5
                          }
                          else {//sysj\orchestrator.sysj line: 80, column: 9
                            Status.conveyStat = false;//sysj\orchestrator.sysj line: 81, column: 5
                          }
                          S124753=1;
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
                      if(conveyorStatus_in.isREQ()){//sysj\orchestrator.sysj line: 75, column: 4
                        conveyorStatus_in.setACK(false);//sysj\orchestrator.sysj line: 75, column: 4
                        ends[4]=2;
                        ;//sysj\orchestrator.sysj line: 75, column: 4
                        conveyValue_thread_4 = (conveyorStatus_in.getVal() == null ? null : ((String)conveyorStatus_in.getVal()));//sysj\orchestrator.sysj line: 76, column: 4
                        if(conveyValue_thread_4 == "busy") {//sysj\orchestrator.sysj line: 77, column: 31
                          Status.conveyStat = true;//sysj\orchestrator.sysj line: 78, column: 5
                        }
                        else {//sysj\orchestrator.sysj line: 80, column: 9
                          Status.conveyStat = false;//sysj\orchestrator.sysj line: 81, column: 5
                        }
                        S124753=1;
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
                S124737=1;
                S124737=0;
                if(!conveyorStatus_in.isPartnerPresent() || conveyorStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 75, column: 4
                  conveyorStatus_in.setACK(false);//sysj\orchestrator.sysj line: 75, column: 4
                  S124737=1;
                  active[4]=1;
                  ends[4]=1;
                  tdone[4]=1;
                }
                else {
                  S124732=0;
                  if(!conveyorStatus_in.isREQ()){//sysj\orchestrator.sysj line: 75, column: 4
                    conveyorStatus_in.setACK(true);//sysj\orchestrator.sysj line: 75, column: 4
                    S124732=1;
                    if(conveyorStatus_in.isREQ()){//sysj\orchestrator.sysj line: 75, column: 4
                      conveyorStatus_in.setACK(false);//sysj\orchestrator.sysj line: 75, column: 4
                      ends[4]=2;
                      ;//sysj\orchestrator.sysj line: 75, column: 4
                      conveyValue_thread_4 = (conveyorStatus_in.getVal() == null ? null : ((String)conveyorStatus_in.getVal()));//sysj\orchestrator.sysj line: 76, column: 4
                      if(conveyValue_thread_4 == "busy") {//sysj\orchestrator.sysj line: 77, column: 31
                        Status.conveyStat = true;//sysj\orchestrator.sysj line: 78, column: 5
                      }
                      else {//sysj\orchestrator.sysj line: 80, column: 9
                        Status.conveyStat = false;//sysj\orchestrator.sysj line: 81, column: 5
                      }
                      S124753=1;
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
            S124753=1;
            S124753=0;
            S124737=0;
            if(!conveyorStatus_in.isPartnerPresent() || conveyorStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 75, column: 4
              conveyorStatus_in.setACK(false);//sysj\orchestrator.sysj line: 75, column: 4
              S124737=1;
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            else {
              S124732=0;
              if(!conveyorStatus_in.isREQ()){//sysj\orchestrator.sysj line: 75, column: 4
                conveyorStatus_in.setACK(true);//sysj\orchestrator.sysj line: 75, column: 4
                S124732=1;
                if(conveyorStatus_in.isREQ()){//sysj\orchestrator.sysj line: 75, column: 4
                  conveyorStatus_in.setACK(false);//sysj\orchestrator.sysj line: 75, column: 4
                  ends[4]=2;
                  ;//sysj\orchestrator.sysj line: 75, column: 4
                  conveyValue_thread_4 = (conveyorStatus_in.getVal() == null ? null : ((String)conveyorStatus_in.getVal()));//sysj\orchestrator.sysj line: 76, column: 4
                  if(conveyValue_thread_4 == "busy") {//sysj\orchestrator.sysj line: 77, column: 31
                    Status.conveyStat = true;//sysj\orchestrator.sysj line: 78, column: 5
                  }
                  else {//sysj\orchestrator.sysj line: 80, column: 9
                    Status.conveyStat = false;//sysj\orchestrator.sysj line: 81, column: 5
                  }
                  S124753=1;
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

  public void thread125167(int [] tdone, int [] ends){
        switch(S124730){
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
                if(!rotaryStatus_in.isPartnerPresent() || rotaryStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 52, column: 4
                  rotaryStatus_in.setACK(false);//sysj\orchestrator.sysj line: 52, column: 4
                  S118558=1;
                  active[3]=1;
                  ends[3]=1;
                  tdone[3]=1;
                }
                else {
                  switch(S118553){
                    case 0 : 
                      if(!rotaryStatus_in.isREQ()){//sysj\orchestrator.sysj line: 52, column: 4
                        rotaryStatus_in.setACK(true);//sysj\orchestrator.sysj line: 52, column: 4
                        S118553=1;
                        if(rotaryStatus_in.isREQ()){//sysj\orchestrator.sysj line: 52, column: 4
                          rotaryStatus_in.setACK(false);//sysj\orchestrator.sysj line: 52, column: 4
                          ends[3]=2;
                          ;//sysj\orchestrator.sysj line: 52, column: 4
                          rotaryStat_thread_3 = (rotaryStatus_in.getVal() == null ? null : ((String)rotaryStatus_in.getVal()));//sysj\orchestrator.sysj line: 53, column: 4
                          S118574=1;
                          if(rotaryStat_thread_3 == "done"){//sysj\orchestrator.sysj line: 56, column: 7
                            S119083=0;
                            System.out.println("rotary done, sending filler,loader,screwer, conveyor reqs");//sysj\orchestrator.sysj line: 57, column: 5
                            S118619=0;
                            S118581=0;
                            if(!fillerReq_o.isPartnerPresent() || fillerReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 58, column: 5
                              fillerReq_o.setREQ(false);//sysj\orchestrator.sysj line: 58, column: 5
                              S118581=1;
                              active[3]=1;
                              ends[3]=1;
                              tdone[3]=1;
                            }
                            else {
                              S118576=0;
                              if(fillerReq_o.isACK()){//sysj\orchestrator.sysj line: 58, column: 5
                                fillerReq_o.setVal(true);//sysj\orchestrator.sysj line: 58, column: 5
                                S118576=1;
                                if(!fillerReq_o.isACK()){//sysj\orchestrator.sysj line: 58, column: 5
                                  fillerReq_o.setREQ(false);//sysj\orchestrator.sysj line: 58, column: 5
                                  ends[3]=2;
                                  ;//sysj\orchestrator.sysj line: 58, column: 5
                                  S118619=1;
                                  S118626=0;
                                  if(!capLoaderReq_o.isPartnerPresent() || capLoaderReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 59, column: 5
                                    capLoaderReq_o.setREQ(false);//sysj\orchestrator.sysj line: 59, column: 5
                                    S118626=1;
                                    active[3]=1;
                                    ends[3]=1;
                                    tdone[3]=1;
                                  }
                                  else {
                                    S118621=0;
                                    if(capLoaderReq_o.isACK()){//sysj\orchestrator.sysj line: 59, column: 5
                                      capLoaderReq_o.setVal(true);//sysj\orchestrator.sysj line: 59, column: 5
                                      S118621=1;
                                      if(!capLoaderReq_o.isACK()){//sysj\orchestrator.sysj line: 59, column: 5
                                        capLoaderReq_o.setREQ(false);//sysj\orchestrator.sysj line: 59, column: 5
                                        ends[3]=2;
                                        ;//sysj\orchestrator.sysj line: 59, column: 5
                                        S118619=2;
                                        S118714=0;
                                        if(!capperReq_o.isPartnerPresent() || capperReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 60, column: 5
                                          capperReq_o.setREQ(false);//sysj\orchestrator.sysj line: 60, column: 5
                                          S118714=1;
                                          active[3]=1;
                                          ends[3]=1;
                                          tdone[3]=1;
                                        }
                                        else {
                                          S118709=0;
                                          if(capperReq_o.isACK()){//sysj\orchestrator.sysj line: 60, column: 5
                                            capperReq_o.setVal(true);//sysj\orchestrator.sysj line: 60, column: 5
                                            S118709=1;
                                            if(!capperReq_o.isACK()){//sysj\orchestrator.sysj line: 60, column: 5
                                              capperReq_o.setREQ(false);//sysj\orchestrator.sysj line: 60, column: 5
                                              ends[3]=2;
                                              ;//sysj\orchestrator.sysj line: 60, column: 5
                                              getNextBottle_1.setPresent();//sysj\orchestrator.sysj line: 61, column: 5
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
                            S119083=1;
                            S118950=0;
                            S118846=0;
                            if(!fillerReq_o.isPartnerPresent() || fillerReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 64, column: 5
                              fillerReq_o.setREQ(false);//sysj\orchestrator.sysj line: 64, column: 5
                              S118846=1;
                              active[3]=1;
                              ends[3]=1;
                              tdone[3]=1;
                            }
                            else {
                              S118841=0;
                              if(fillerReq_o.isACK()){//sysj\orchestrator.sysj line: 64, column: 5
                                fillerReq_o.setVal(false);//sysj\orchestrator.sysj line: 64, column: 5
                                S118841=1;
                                if(!fillerReq_o.isACK()){//sysj\orchestrator.sysj line: 64, column: 5
                                  fillerReq_o.setREQ(false);//sysj\orchestrator.sysj line: 64, column: 5
                                  ends[3]=2;
                                  ;//sysj\orchestrator.sysj line: 64, column: 5
                                  S118950=1;
                                  S118868=0;
                                  if(!capLoaderReq_o.isPartnerPresent() || capLoaderReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 65, column: 5
                                    capLoaderReq_o.setREQ(false);//sysj\orchestrator.sysj line: 65, column: 5
                                    S118868=1;
                                    active[3]=1;
                                    ends[3]=1;
                                    tdone[3]=1;
                                  }
                                  else {
                                    S118863=0;
                                    if(capLoaderReq_o.isACK()){//sysj\orchestrator.sysj line: 65, column: 5
                                      capLoaderReq_o.setVal(false);//sysj\orchestrator.sysj line: 65, column: 5
                                      S118863=1;
                                      if(!capLoaderReq_o.isACK()){//sysj\orchestrator.sysj line: 65, column: 5
                                        capLoaderReq_o.setREQ(false);//sysj\orchestrator.sysj line: 65, column: 5
                                        ends[3]=2;
                                        ;//sysj\orchestrator.sysj line: 65, column: 5
                                        S118950=2;
                                        S118957=0;
                                        if(!capperReq_o.isPartnerPresent() || capperReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 66, column: 5
                                          capperReq_o.setREQ(false);//sysj\orchestrator.sysj line: 66, column: 5
                                          S118957=1;
                                          active[3]=1;
                                          ends[3]=1;
                                          tdone[3]=1;
                                        }
                                        else {
                                          S118952=0;
                                          if(capperReq_o.isACK()){//sysj\orchestrator.sysj line: 66, column: 5
                                            capperReq_o.setVal(false);//sysj\orchestrator.sysj line: 66, column: 5
                                            S118952=1;
                                            if(!capperReq_o.isACK()){//sysj\orchestrator.sysj line: 66, column: 5
                                              capperReq_o.setREQ(false);//sysj\orchestrator.sysj line: 66, column: 5
                                              ends[3]=2;
                                              ;//sysj\orchestrator.sysj line: 66, column: 5
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
                      if(rotaryStatus_in.isREQ()){//sysj\orchestrator.sysj line: 52, column: 4
                        rotaryStatus_in.setACK(false);//sysj\orchestrator.sysj line: 52, column: 4
                        ends[3]=2;
                        ;//sysj\orchestrator.sysj line: 52, column: 4
                        rotaryStat_thread_3 = (rotaryStatus_in.getVal() == null ? null : ((String)rotaryStatus_in.getVal()));//sysj\orchestrator.sysj line: 53, column: 4
                        S118574=1;
                        if(rotaryStat_thread_3 == "done"){//sysj\orchestrator.sysj line: 56, column: 7
                          S119083=0;
                          System.out.println("rotary done, sending filler,loader,screwer, conveyor reqs");//sysj\orchestrator.sysj line: 57, column: 5
                          S118619=0;
                          S118581=0;
                          if(!fillerReq_o.isPartnerPresent() || fillerReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 58, column: 5
                            fillerReq_o.setREQ(false);//sysj\orchestrator.sysj line: 58, column: 5
                            S118581=1;
                            active[3]=1;
                            ends[3]=1;
                            tdone[3]=1;
                          }
                          else {
                            S118576=0;
                            if(fillerReq_o.isACK()){//sysj\orchestrator.sysj line: 58, column: 5
                              fillerReq_o.setVal(true);//sysj\orchestrator.sysj line: 58, column: 5
                              S118576=1;
                              if(!fillerReq_o.isACK()){//sysj\orchestrator.sysj line: 58, column: 5
                                fillerReq_o.setREQ(false);//sysj\orchestrator.sysj line: 58, column: 5
                                ends[3]=2;
                                ;//sysj\orchestrator.sysj line: 58, column: 5
                                S118619=1;
                                S118626=0;
                                if(!capLoaderReq_o.isPartnerPresent() || capLoaderReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 59, column: 5
                                  capLoaderReq_o.setREQ(false);//sysj\orchestrator.sysj line: 59, column: 5
                                  S118626=1;
                                  active[3]=1;
                                  ends[3]=1;
                                  tdone[3]=1;
                                }
                                else {
                                  S118621=0;
                                  if(capLoaderReq_o.isACK()){//sysj\orchestrator.sysj line: 59, column: 5
                                    capLoaderReq_o.setVal(true);//sysj\orchestrator.sysj line: 59, column: 5
                                    S118621=1;
                                    if(!capLoaderReq_o.isACK()){//sysj\orchestrator.sysj line: 59, column: 5
                                      capLoaderReq_o.setREQ(false);//sysj\orchestrator.sysj line: 59, column: 5
                                      ends[3]=2;
                                      ;//sysj\orchestrator.sysj line: 59, column: 5
                                      S118619=2;
                                      S118714=0;
                                      if(!capperReq_o.isPartnerPresent() || capperReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 60, column: 5
                                        capperReq_o.setREQ(false);//sysj\orchestrator.sysj line: 60, column: 5
                                        S118714=1;
                                        active[3]=1;
                                        ends[3]=1;
                                        tdone[3]=1;
                                      }
                                      else {
                                        S118709=0;
                                        if(capperReq_o.isACK()){//sysj\orchestrator.sysj line: 60, column: 5
                                          capperReq_o.setVal(true);//sysj\orchestrator.sysj line: 60, column: 5
                                          S118709=1;
                                          if(!capperReq_o.isACK()){//sysj\orchestrator.sysj line: 60, column: 5
                                            capperReq_o.setREQ(false);//sysj\orchestrator.sysj line: 60, column: 5
                                            ends[3]=2;
                                            ;//sysj\orchestrator.sysj line: 60, column: 5
                                            getNextBottle_1.setPresent();//sysj\orchestrator.sysj line: 61, column: 5
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
                          S119083=1;
                          S118950=0;
                          S118846=0;
                          if(!fillerReq_o.isPartnerPresent() || fillerReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 64, column: 5
                            fillerReq_o.setREQ(false);//sysj\orchestrator.sysj line: 64, column: 5
                            S118846=1;
                            active[3]=1;
                            ends[3]=1;
                            tdone[3]=1;
                          }
                          else {
                            S118841=0;
                            if(fillerReq_o.isACK()){//sysj\orchestrator.sysj line: 64, column: 5
                              fillerReq_o.setVal(false);//sysj\orchestrator.sysj line: 64, column: 5
                              S118841=1;
                              if(!fillerReq_o.isACK()){//sysj\orchestrator.sysj line: 64, column: 5
                                fillerReq_o.setREQ(false);//sysj\orchestrator.sysj line: 64, column: 5
                                ends[3]=2;
                                ;//sysj\orchestrator.sysj line: 64, column: 5
                                S118950=1;
                                S118868=0;
                                if(!capLoaderReq_o.isPartnerPresent() || capLoaderReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 65, column: 5
                                  capLoaderReq_o.setREQ(false);//sysj\orchestrator.sysj line: 65, column: 5
                                  S118868=1;
                                  active[3]=1;
                                  ends[3]=1;
                                  tdone[3]=1;
                                }
                                else {
                                  S118863=0;
                                  if(capLoaderReq_o.isACK()){//sysj\orchestrator.sysj line: 65, column: 5
                                    capLoaderReq_o.setVal(false);//sysj\orchestrator.sysj line: 65, column: 5
                                    S118863=1;
                                    if(!capLoaderReq_o.isACK()){//sysj\orchestrator.sysj line: 65, column: 5
                                      capLoaderReq_o.setREQ(false);//sysj\orchestrator.sysj line: 65, column: 5
                                      ends[3]=2;
                                      ;//sysj\orchestrator.sysj line: 65, column: 5
                                      S118950=2;
                                      S118957=0;
                                      if(!capperReq_o.isPartnerPresent() || capperReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 66, column: 5
                                        capperReq_o.setREQ(false);//sysj\orchestrator.sysj line: 66, column: 5
                                        S118957=1;
                                        active[3]=1;
                                        ends[3]=1;
                                        tdone[3]=1;
                                      }
                                      else {
                                        S118952=0;
                                        if(capperReq_o.isACK()){//sysj\orchestrator.sysj line: 66, column: 5
                                          capperReq_o.setVal(false);//sysj\orchestrator.sysj line: 66, column: 5
                                          S118952=1;
                                          if(!capperReq_o.isACK()){//sysj\orchestrator.sysj line: 66, column: 5
                                            capperReq_o.setREQ(false);//sysj\orchestrator.sysj line: 66, column: 5
                                            ends[3]=2;
                                            ;//sysj\orchestrator.sysj line: 66, column: 5
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
                if(!rotaryStatus_in.isPartnerPresent() || rotaryStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 52, column: 4
                  rotaryStatus_in.setACK(false);//sysj\orchestrator.sysj line: 52, column: 4
                  S118558=1;
                  active[3]=1;
                  ends[3]=1;
                  tdone[3]=1;
                }
                else {
                  S118553=0;
                  if(!rotaryStatus_in.isREQ()){//sysj\orchestrator.sysj line: 52, column: 4
                    rotaryStatus_in.setACK(true);//sysj\orchestrator.sysj line: 52, column: 4
                    S118553=1;
                    if(rotaryStatus_in.isREQ()){//sysj\orchestrator.sysj line: 52, column: 4
                      rotaryStatus_in.setACK(false);//sysj\orchestrator.sysj line: 52, column: 4
                      ends[3]=2;
                      ;//sysj\orchestrator.sysj line: 52, column: 4
                      rotaryStat_thread_3 = (rotaryStatus_in.getVal() == null ? null : ((String)rotaryStatus_in.getVal()));//sysj\orchestrator.sysj line: 53, column: 4
                      S118574=1;
                      if(rotaryStat_thread_3 == "done"){//sysj\orchestrator.sysj line: 56, column: 7
                        S119083=0;
                        System.out.println("rotary done, sending filler,loader,screwer, conveyor reqs");//sysj\orchestrator.sysj line: 57, column: 5
                        S118619=0;
                        S118581=0;
                        if(!fillerReq_o.isPartnerPresent() || fillerReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 58, column: 5
                          fillerReq_o.setREQ(false);//sysj\orchestrator.sysj line: 58, column: 5
                          S118581=1;
                          active[3]=1;
                          ends[3]=1;
                          tdone[3]=1;
                        }
                        else {
                          S118576=0;
                          if(fillerReq_o.isACK()){//sysj\orchestrator.sysj line: 58, column: 5
                            fillerReq_o.setVal(true);//sysj\orchestrator.sysj line: 58, column: 5
                            S118576=1;
                            if(!fillerReq_o.isACK()){//sysj\orchestrator.sysj line: 58, column: 5
                              fillerReq_o.setREQ(false);//sysj\orchestrator.sysj line: 58, column: 5
                              ends[3]=2;
                              ;//sysj\orchestrator.sysj line: 58, column: 5
                              S118619=1;
                              S118626=0;
                              if(!capLoaderReq_o.isPartnerPresent() || capLoaderReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 59, column: 5
                                capLoaderReq_o.setREQ(false);//sysj\orchestrator.sysj line: 59, column: 5
                                S118626=1;
                                active[3]=1;
                                ends[3]=1;
                                tdone[3]=1;
                              }
                              else {
                                S118621=0;
                                if(capLoaderReq_o.isACK()){//sysj\orchestrator.sysj line: 59, column: 5
                                  capLoaderReq_o.setVal(true);//sysj\orchestrator.sysj line: 59, column: 5
                                  S118621=1;
                                  if(!capLoaderReq_o.isACK()){//sysj\orchestrator.sysj line: 59, column: 5
                                    capLoaderReq_o.setREQ(false);//sysj\orchestrator.sysj line: 59, column: 5
                                    ends[3]=2;
                                    ;//sysj\orchestrator.sysj line: 59, column: 5
                                    S118619=2;
                                    S118714=0;
                                    if(!capperReq_o.isPartnerPresent() || capperReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 60, column: 5
                                      capperReq_o.setREQ(false);//sysj\orchestrator.sysj line: 60, column: 5
                                      S118714=1;
                                      active[3]=1;
                                      ends[3]=1;
                                      tdone[3]=1;
                                    }
                                    else {
                                      S118709=0;
                                      if(capperReq_o.isACK()){//sysj\orchestrator.sysj line: 60, column: 5
                                        capperReq_o.setVal(true);//sysj\orchestrator.sysj line: 60, column: 5
                                        S118709=1;
                                        if(!capperReq_o.isACK()){//sysj\orchestrator.sysj line: 60, column: 5
                                          capperReq_o.setREQ(false);//sysj\orchestrator.sysj line: 60, column: 5
                                          ends[3]=2;
                                          ;//sysj\orchestrator.sysj line: 60, column: 5
                                          getNextBottle_1.setPresent();//sysj\orchestrator.sysj line: 61, column: 5
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
                        S119083=1;
                        S118950=0;
                        S118846=0;
                        if(!fillerReq_o.isPartnerPresent() || fillerReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 64, column: 5
                          fillerReq_o.setREQ(false);//sysj\orchestrator.sysj line: 64, column: 5
                          S118846=1;
                          active[3]=1;
                          ends[3]=1;
                          tdone[3]=1;
                        }
                        else {
                          S118841=0;
                          if(fillerReq_o.isACK()){//sysj\orchestrator.sysj line: 64, column: 5
                            fillerReq_o.setVal(false);//sysj\orchestrator.sysj line: 64, column: 5
                            S118841=1;
                            if(!fillerReq_o.isACK()){//sysj\orchestrator.sysj line: 64, column: 5
                              fillerReq_o.setREQ(false);//sysj\orchestrator.sysj line: 64, column: 5
                              ends[3]=2;
                              ;//sysj\orchestrator.sysj line: 64, column: 5
                              S118950=1;
                              S118868=0;
                              if(!capLoaderReq_o.isPartnerPresent() || capLoaderReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 65, column: 5
                                capLoaderReq_o.setREQ(false);//sysj\orchestrator.sysj line: 65, column: 5
                                S118868=1;
                                active[3]=1;
                                ends[3]=1;
                                tdone[3]=1;
                              }
                              else {
                                S118863=0;
                                if(capLoaderReq_o.isACK()){//sysj\orchestrator.sysj line: 65, column: 5
                                  capLoaderReq_o.setVal(false);//sysj\orchestrator.sysj line: 65, column: 5
                                  S118863=1;
                                  if(!capLoaderReq_o.isACK()){//sysj\orchestrator.sysj line: 65, column: 5
                                    capLoaderReq_o.setREQ(false);//sysj\orchestrator.sysj line: 65, column: 5
                                    ends[3]=2;
                                    ;//sysj\orchestrator.sysj line: 65, column: 5
                                    S118950=2;
                                    S118957=0;
                                    if(!capperReq_o.isPartnerPresent() || capperReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 66, column: 5
                                      capperReq_o.setREQ(false);//sysj\orchestrator.sysj line: 66, column: 5
                                      S118957=1;
                                      active[3]=1;
                                      ends[3]=1;
                                      tdone[3]=1;
                                    }
                                    else {
                                      S118952=0;
                                      if(capperReq_o.isACK()){//sysj\orchestrator.sysj line: 66, column: 5
                                        capperReq_o.setVal(false);//sysj\orchestrator.sysj line: 66, column: 5
                                        S118952=1;
                                        if(!capperReq_o.isACK()){//sysj\orchestrator.sysj line: 66, column: 5
                                          capperReq_o.setREQ(false);//sysj\orchestrator.sysj line: 66, column: 5
                                          ends[3]=2;
                                          ;//sysj\orchestrator.sysj line: 66, column: 5
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
            switch(S119083){
              case 0 : 
                switch(S118619){
                  case 0 : 
                    switch(S118581){
                      case 0 : 
                        if(!fillerReq_o.isPartnerPresent() || fillerReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 58, column: 5
                          fillerReq_o.setREQ(false);//sysj\orchestrator.sysj line: 58, column: 5
                          S118581=1;
                          active[3]=1;
                          ends[3]=1;
                          tdone[3]=1;
                        }
                        else {
                          switch(S118576){
                            case 0 : 
                              if(fillerReq_o.isACK()){//sysj\orchestrator.sysj line: 58, column: 5
                                fillerReq_o.setVal(true);//sysj\orchestrator.sysj line: 58, column: 5
                                S118576=1;
                                if(!fillerReq_o.isACK()){//sysj\orchestrator.sysj line: 58, column: 5
                                  fillerReq_o.setREQ(false);//sysj\orchestrator.sysj line: 58, column: 5
                                  ends[3]=2;
                                  ;//sysj\orchestrator.sysj line: 58, column: 5
                                  S118619=1;
                                  S118626=0;
                                  if(!capLoaderReq_o.isPartnerPresent() || capLoaderReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 59, column: 5
                                    capLoaderReq_o.setREQ(false);//sysj\orchestrator.sysj line: 59, column: 5
                                    S118626=1;
                                    active[3]=1;
                                    ends[3]=1;
                                    tdone[3]=1;
                                  }
                                  else {
                                    S118621=0;
                                    if(capLoaderReq_o.isACK()){//sysj\orchestrator.sysj line: 59, column: 5
                                      capLoaderReq_o.setVal(true);//sysj\orchestrator.sysj line: 59, column: 5
                                      S118621=1;
                                      if(!capLoaderReq_o.isACK()){//sysj\orchestrator.sysj line: 59, column: 5
                                        capLoaderReq_o.setREQ(false);//sysj\orchestrator.sysj line: 59, column: 5
                                        ends[3]=2;
                                        ;//sysj\orchestrator.sysj line: 59, column: 5
                                        S118619=2;
                                        S118714=0;
                                        if(!capperReq_o.isPartnerPresent() || capperReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 60, column: 5
                                          capperReq_o.setREQ(false);//sysj\orchestrator.sysj line: 60, column: 5
                                          S118714=1;
                                          active[3]=1;
                                          ends[3]=1;
                                          tdone[3]=1;
                                        }
                                        else {
                                          S118709=0;
                                          if(capperReq_o.isACK()){//sysj\orchestrator.sysj line: 60, column: 5
                                            capperReq_o.setVal(true);//sysj\orchestrator.sysj line: 60, column: 5
                                            S118709=1;
                                            if(!capperReq_o.isACK()){//sysj\orchestrator.sysj line: 60, column: 5
                                              capperReq_o.setREQ(false);//sysj\orchestrator.sysj line: 60, column: 5
                                              ends[3]=2;
                                              ;//sysj\orchestrator.sysj line: 60, column: 5
                                              getNextBottle_1.setPresent();//sysj\orchestrator.sysj line: 61, column: 5
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
                              if(!fillerReq_o.isACK()){//sysj\orchestrator.sysj line: 58, column: 5
                                fillerReq_o.setREQ(false);//sysj\orchestrator.sysj line: 58, column: 5
                                ends[3]=2;
                                ;//sysj\orchestrator.sysj line: 58, column: 5
                                S118619=1;
                                S118626=0;
                                if(!capLoaderReq_o.isPartnerPresent() || capLoaderReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 59, column: 5
                                  capLoaderReq_o.setREQ(false);//sysj\orchestrator.sysj line: 59, column: 5
                                  S118626=1;
                                  active[3]=1;
                                  ends[3]=1;
                                  tdone[3]=1;
                                }
                                else {
                                  S118621=0;
                                  if(capLoaderReq_o.isACK()){//sysj\orchestrator.sysj line: 59, column: 5
                                    capLoaderReq_o.setVal(true);//sysj\orchestrator.sysj line: 59, column: 5
                                    S118621=1;
                                    if(!capLoaderReq_o.isACK()){//sysj\orchestrator.sysj line: 59, column: 5
                                      capLoaderReq_o.setREQ(false);//sysj\orchestrator.sysj line: 59, column: 5
                                      ends[3]=2;
                                      ;//sysj\orchestrator.sysj line: 59, column: 5
                                      S118619=2;
                                      S118714=0;
                                      if(!capperReq_o.isPartnerPresent() || capperReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 60, column: 5
                                        capperReq_o.setREQ(false);//sysj\orchestrator.sysj line: 60, column: 5
                                        S118714=1;
                                        active[3]=1;
                                        ends[3]=1;
                                        tdone[3]=1;
                                      }
                                      else {
                                        S118709=0;
                                        if(capperReq_o.isACK()){//sysj\orchestrator.sysj line: 60, column: 5
                                          capperReq_o.setVal(true);//sysj\orchestrator.sysj line: 60, column: 5
                                          S118709=1;
                                          if(!capperReq_o.isACK()){//sysj\orchestrator.sysj line: 60, column: 5
                                            capperReq_o.setREQ(false);//sysj\orchestrator.sysj line: 60, column: 5
                                            ends[3]=2;
                                            ;//sysj\orchestrator.sysj line: 60, column: 5
                                            getNextBottle_1.setPresent();//sysj\orchestrator.sysj line: 61, column: 5
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
                        if(!fillerReq_o.isPartnerPresent() || fillerReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 58, column: 5
                          fillerReq_o.setREQ(false);//sysj\orchestrator.sysj line: 58, column: 5
                          S118581=1;
                          active[3]=1;
                          ends[3]=1;
                          tdone[3]=1;
                        }
                        else {
                          S118576=0;
                          if(fillerReq_o.isACK()){//sysj\orchestrator.sysj line: 58, column: 5
                            fillerReq_o.setVal(true);//sysj\orchestrator.sysj line: 58, column: 5
                            S118576=1;
                            if(!fillerReq_o.isACK()){//sysj\orchestrator.sysj line: 58, column: 5
                              fillerReq_o.setREQ(false);//sysj\orchestrator.sysj line: 58, column: 5
                              ends[3]=2;
                              ;//sysj\orchestrator.sysj line: 58, column: 5
                              S118619=1;
                              S118626=0;
                              if(!capLoaderReq_o.isPartnerPresent() || capLoaderReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 59, column: 5
                                capLoaderReq_o.setREQ(false);//sysj\orchestrator.sysj line: 59, column: 5
                                S118626=1;
                                active[3]=1;
                                ends[3]=1;
                                tdone[3]=1;
                              }
                              else {
                                S118621=0;
                                if(capLoaderReq_o.isACK()){//sysj\orchestrator.sysj line: 59, column: 5
                                  capLoaderReq_o.setVal(true);//sysj\orchestrator.sysj line: 59, column: 5
                                  S118621=1;
                                  if(!capLoaderReq_o.isACK()){//sysj\orchestrator.sysj line: 59, column: 5
                                    capLoaderReq_o.setREQ(false);//sysj\orchestrator.sysj line: 59, column: 5
                                    ends[3]=2;
                                    ;//sysj\orchestrator.sysj line: 59, column: 5
                                    S118619=2;
                                    S118714=0;
                                    if(!capperReq_o.isPartnerPresent() || capperReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 60, column: 5
                                      capperReq_o.setREQ(false);//sysj\orchestrator.sysj line: 60, column: 5
                                      S118714=1;
                                      active[3]=1;
                                      ends[3]=1;
                                      tdone[3]=1;
                                    }
                                    else {
                                      S118709=0;
                                      if(capperReq_o.isACK()){//sysj\orchestrator.sysj line: 60, column: 5
                                        capperReq_o.setVal(true);//sysj\orchestrator.sysj line: 60, column: 5
                                        S118709=1;
                                        if(!capperReq_o.isACK()){//sysj\orchestrator.sysj line: 60, column: 5
                                          capperReq_o.setREQ(false);//sysj\orchestrator.sysj line: 60, column: 5
                                          ends[3]=2;
                                          ;//sysj\orchestrator.sysj line: 60, column: 5
                                          getNextBottle_1.setPresent();//sysj\orchestrator.sysj line: 61, column: 5
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
                        if(!capLoaderReq_o.isPartnerPresent() || capLoaderReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 59, column: 5
                          capLoaderReq_o.setREQ(false);//sysj\orchestrator.sysj line: 59, column: 5
                          S118626=1;
                          active[3]=1;
                          ends[3]=1;
                          tdone[3]=1;
                        }
                        else {
                          switch(S118621){
                            case 0 : 
                              if(capLoaderReq_o.isACK()){//sysj\orchestrator.sysj line: 59, column: 5
                                capLoaderReq_o.setVal(true);//sysj\orchestrator.sysj line: 59, column: 5
                                S118621=1;
                                if(!capLoaderReq_o.isACK()){//sysj\orchestrator.sysj line: 59, column: 5
                                  capLoaderReq_o.setREQ(false);//sysj\orchestrator.sysj line: 59, column: 5
                                  ends[3]=2;
                                  ;//sysj\orchestrator.sysj line: 59, column: 5
                                  S118619=2;
                                  S118714=0;
                                  if(!capperReq_o.isPartnerPresent() || capperReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 60, column: 5
                                    capperReq_o.setREQ(false);//sysj\orchestrator.sysj line: 60, column: 5
                                    S118714=1;
                                    active[3]=1;
                                    ends[3]=1;
                                    tdone[3]=1;
                                  }
                                  else {
                                    S118709=0;
                                    if(capperReq_o.isACK()){//sysj\orchestrator.sysj line: 60, column: 5
                                      capperReq_o.setVal(true);//sysj\orchestrator.sysj line: 60, column: 5
                                      S118709=1;
                                      if(!capperReq_o.isACK()){//sysj\orchestrator.sysj line: 60, column: 5
                                        capperReq_o.setREQ(false);//sysj\orchestrator.sysj line: 60, column: 5
                                        ends[3]=2;
                                        ;//sysj\orchestrator.sysj line: 60, column: 5
                                        getNextBottle_1.setPresent();//sysj\orchestrator.sysj line: 61, column: 5
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
                              if(!capLoaderReq_o.isACK()){//sysj\orchestrator.sysj line: 59, column: 5
                                capLoaderReq_o.setREQ(false);//sysj\orchestrator.sysj line: 59, column: 5
                                ends[3]=2;
                                ;//sysj\orchestrator.sysj line: 59, column: 5
                                S118619=2;
                                S118714=0;
                                if(!capperReq_o.isPartnerPresent() || capperReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 60, column: 5
                                  capperReq_o.setREQ(false);//sysj\orchestrator.sysj line: 60, column: 5
                                  S118714=1;
                                  active[3]=1;
                                  ends[3]=1;
                                  tdone[3]=1;
                                }
                                else {
                                  S118709=0;
                                  if(capperReq_o.isACK()){//sysj\orchestrator.sysj line: 60, column: 5
                                    capperReq_o.setVal(true);//sysj\orchestrator.sysj line: 60, column: 5
                                    S118709=1;
                                    if(!capperReq_o.isACK()){//sysj\orchestrator.sysj line: 60, column: 5
                                      capperReq_o.setREQ(false);//sysj\orchestrator.sysj line: 60, column: 5
                                      ends[3]=2;
                                      ;//sysj\orchestrator.sysj line: 60, column: 5
                                      getNextBottle_1.setPresent();//sysj\orchestrator.sysj line: 61, column: 5
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
                        if(!capLoaderReq_o.isPartnerPresent() || capLoaderReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 59, column: 5
                          capLoaderReq_o.setREQ(false);//sysj\orchestrator.sysj line: 59, column: 5
                          S118626=1;
                          active[3]=1;
                          ends[3]=1;
                          tdone[3]=1;
                        }
                        else {
                          S118621=0;
                          if(capLoaderReq_o.isACK()){//sysj\orchestrator.sysj line: 59, column: 5
                            capLoaderReq_o.setVal(true);//sysj\orchestrator.sysj line: 59, column: 5
                            S118621=1;
                            if(!capLoaderReq_o.isACK()){//sysj\orchestrator.sysj line: 59, column: 5
                              capLoaderReq_o.setREQ(false);//sysj\orchestrator.sysj line: 59, column: 5
                              ends[3]=2;
                              ;//sysj\orchestrator.sysj line: 59, column: 5
                              S118619=2;
                              S118714=0;
                              if(!capperReq_o.isPartnerPresent() || capperReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 60, column: 5
                                capperReq_o.setREQ(false);//sysj\orchestrator.sysj line: 60, column: 5
                                S118714=1;
                                active[3]=1;
                                ends[3]=1;
                                tdone[3]=1;
                              }
                              else {
                                S118709=0;
                                if(capperReq_o.isACK()){//sysj\orchestrator.sysj line: 60, column: 5
                                  capperReq_o.setVal(true);//sysj\orchestrator.sysj line: 60, column: 5
                                  S118709=1;
                                  if(!capperReq_o.isACK()){//sysj\orchestrator.sysj line: 60, column: 5
                                    capperReq_o.setREQ(false);//sysj\orchestrator.sysj line: 60, column: 5
                                    ends[3]=2;
                                    ;//sysj\orchestrator.sysj line: 60, column: 5
                                    getNextBottle_1.setPresent();//sysj\orchestrator.sysj line: 61, column: 5
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
                        if(!capperReq_o.isPartnerPresent() || capperReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 60, column: 5
                          capperReq_o.setREQ(false);//sysj\orchestrator.sysj line: 60, column: 5
                          S118714=1;
                          active[3]=1;
                          ends[3]=1;
                          tdone[3]=1;
                        }
                        else {
                          switch(S118709){
                            case 0 : 
                              if(capperReq_o.isACK()){//sysj\orchestrator.sysj line: 60, column: 5
                                capperReq_o.setVal(true);//sysj\orchestrator.sysj line: 60, column: 5
                                S118709=1;
                                if(!capperReq_o.isACK()){//sysj\orchestrator.sysj line: 60, column: 5
                                  capperReq_o.setREQ(false);//sysj\orchestrator.sysj line: 60, column: 5
                                  ends[3]=2;
                                  ;//sysj\orchestrator.sysj line: 60, column: 5
                                  getNextBottle_1.setPresent();//sysj\orchestrator.sysj line: 61, column: 5
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
                              if(!capperReq_o.isACK()){//sysj\orchestrator.sysj line: 60, column: 5
                                capperReq_o.setREQ(false);//sysj\orchestrator.sysj line: 60, column: 5
                                ends[3]=2;
                                ;//sysj\orchestrator.sysj line: 60, column: 5
                                getNextBottle_1.setPresent();//sysj\orchestrator.sysj line: 61, column: 5
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
                        if(!capperReq_o.isPartnerPresent() || capperReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 60, column: 5
                          capperReq_o.setREQ(false);//sysj\orchestrator.sysj line: 60, column: 5
                          S118714=1;
                          active[3]=1;
                          ends[3]=1;
                          tdone[3]=1;
                        }
                        else {
                          S118709=0;
                          if(capperReq_o.isACK()){//sysj\orchestrator.sysj line: 60, column: 5
                            capperReq_o.setVal(true);//sysj\orchestrator.sysj line: 60, column: 5
                            S118709=1;
                            if(!capperReq_o.isACK()){//sysj\orchestrator.sysj line: 60, column: 5
                              capperReq_o.setREQ(false);//sysj\orchestrator.sysj line: 60, column: 5
                              ends[3]=2;
                              ;//sysj\orchestrator.sysj line: 60, column: 5
                              getNextBottle_1.setPresent();//sysj\orchestrator.sysj line: 61, column: 5
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
              
              case 1 : 
                switch(S118950){
                  case 0 : 
                    switch(S118846){
                      case 0 : 
                        if(!fillerReq_o.isPartnerPresent() || fillerReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 64, column: 5
                          fillerReq_o.setREQ(false);//sysj\orchestrator.sysj line: 64, column: 5
                          S118846=1;
                          active[3]=1;
                          ends[3]=1;
                          tdone[3]=1;
                        }
                        else {
                          switch(S118841){
                            case 0 : 
                              if(fillerReq_o.isACK()){//sysj\orchestrator.sysj line: 64, column: 5
                                fillerReq_o.setVal(false);//sysj\orchestrator.sysj line: 64, column: 5
                                S118841=1;
                                if(!fillerReq_o.isACK()){//sysj\orchestrator.sysj line: 64, column: 5
                                  fillerReq_o.setREQ(false);//sysj\orchestrator.sysj line: 64, column: 5
                                  ends[3]=2;
                                  ;//sysj\orchestrator.sysj line: 64, column: 5
                                  S118950=1;
                                  S118868=0;
                                  if(!capLoaderReq_o.isPartnerPresent() || capLoaderReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 65, column: 5
                                    capLoaderReq_o.setREQ(false);//sysj\orchestrator.sysj line: 65, column: 5
                                    S118868=1;
                                    active[3]=1;
                                    ends[3]=1;
                                    tdone[3]=1;
                                  }
                                  else {
                                    S118863=0;
                                    if(capLoaderReq_o.isACK()){//sysj\orchestrator.sysj line: 65, column: 5
                                      capLoaderReq_o.setVal(false);//sysj\orchestrator.sysj line: 65, column: 5
                                      S118863=1;
                                      if(!capLoaderReq_o.isACK()){//sysj\orchestrator.sysj line: 65, column: 5
                                        capLoaderReq_o.setREQ(false);//sysj\orchestrator.sysj line: 65, column: 5
                                        ends[3]=2;
                                        ;//sysj\orchestrator.sysj line: 65, column: 5
                                        S118950=2;
                                        S118957=0;
                                        if(!capperReq_o.isPartnerPresent() || capperReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 66, column: 5
                                          capperReq_o.setREQ(false);//sysj\orchestrator.sysj line: 66, column: 5
                                          S118957=1;
                                          active[3]=1;
                                          ends[3]=1;
                                          tdone[3]=1;
                                        }
                                        else {
                                          S118952=0;
                                          if(capperReq_o.isACK()){//sysj\orchestrator.sysj line: 66, column: 5
                                            capperReq_o.setVal(false);//sysj\orchestrator.sysj line: 66, column: 5
                                            S118952=1;
                                            if(!capperReq_o.isACK()){//sysj\orchestrator.sysj line: 66, column: 5
                                              capperReq_o.setREQ(false);//sysj\orchestrator.sysj line: 66, column: 5
                                              ends[3]=2;
                                              ;//sysj\orchestrator.sysj line: 66, column: 5
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
                              if(!fillerReq_o.isACK()){//sysj\orchestrator.sysj line: 64, column: 5
                                fillerReq_o.setREQ(false);//sysj\orchestrator.sysj line: 64, column: 5
                                ends[3]=2;
                                ;//sysj\orchestrator.sysj line: 64, column: 5
                                S118950=1;
                                S118868=0;
                                if(!capLoaderReq_o.isPartnerPresent() || capLoaderReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 65, column: 5
                                  capLoaderReq_o.setREQ(false);//sysj\orchestrator.sysj line: 65, column: 5
                                  S118868=1;
                                  active[3]=1;
                                  ends[3]=1;
                                  tdone[3]=1;
                                }
                                else {
                                  S118863=0;
                                  if(capLoaderReq_o.isACK()){//sysj\orchestrator.sysj line: 65, column: 5
                                    capLoaderReq_o.setVal(false);//sysj\orchestrator.sysj line: 65, column: 5
                                    S118863=1;
                                    if(!capLoaderReq_o.isACK()){//sysj\orchestrator.sysj line: 65, column: 5
                                      capLoaderReq_o.setREQ(false);//sysj\orchestrator.sysj line: 65, column: 5
                                      ends[3]=2;
                                      ;//sysj\orchestrator.sysj line: 65, column: 5
                                      S118950=2;
                                      S118957=0;
                                      if(!capperReq_o.isPartnerPresent() || capperReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 66, column: 5
                                        capperReq_o.setREQ(false);//sysj\orchestrator.sysj line: 66, column: 5
                                        S118957=1;
                                        active[3]=1;
                                        ends[3]=1;
                                        tdone[3]=1;
                                      }
                                      else {
                                        S118952=0;
                                        if(capperReq_o.isACK()){//sysj\orchestrator.sysj line: 66, column: 5
                                          capperReq_o.setVal(false);//sysj\orchestrator.sysj line: 66, column: 5
                                          S118952=1;
                                          if(!capperReq_o.isACK()){//sysj\orchestrator.sysj line: 66, column: 5
                                            capperReq_o.setREQ(false);//sysj\orchestrator.sysj line: 66, column: 5
                                            ends[3]=2;
                                            ;//sysj\orchestrator.sysj line: 66, column: 5
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
                        S118846=1;
                        S118846=0;
                        if(!fillerReq_o.isPartnerPresent() || fillerReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 64, column: 5
                          fillerReq_o.setREQ(false);//sysj\orchestrator.sysj line: 64, column: 5
                          S118846=1;
                          active[3]=1;
                          ends[3]=1;
                          tdone[3]=1;
                        }
                        else {
                          S118841=0;
                          if(fillerReq_o.isACK()){//sysj\orchestrator.sysj line: 64, column: 5
                            fillerReq_o.setVal(false);//sysj\orchestrator.sysj line: 64, column: 5
                            S118841=1;
                            if(!fillerReq_o.isACK()){//sysj\orchestrator.sysj line: 64, column: 5
                              fillerReq_o.setREQ(false);//sysj\orchestrator.sysj line: 64, column: 5
                              ends[3]=2;
                              ;//sysj\orchestrator.sysj line: 64, column: 5
                              S118950=1;
                              S118868=0;
                              if(!capLoaderReq_o.isPartnerPresent() || capLoaderReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 65, column: 5
                                capLoaderReq_o.setREQ(false);//sysj\orchestrator.sysj line: 65, column: 5
                                S118868=1;
                                active[3]=1;
                                ends[3]=1;
                                tdone[3]=1;
                              }
                              else {
                                S118863=0;
                                if(capLoaderReq_o.isACK()){//sysj\orchestrator.sysj line: 65, column: 5
                                  capLoaderReq_o.setVal(false);//sysj\orchestrator.sysj line: 65, column: 5
                                  S118863=1;
                                  if(!capLoaderReq_o.isACK()){//sysj\orchestrator.sysj line: 65, column: 5
                                    capLoaderReq_o.setREQ(false);//sysj\orchestrator.sysj line: 65, column: 5
                                    ends[3]=2;
                                    ;//sysj\orchestrator.sysj line: 65, column: 5
                                    S118950=2;
                                    S118957=0;
                                    if(!capperReq_o.isPartnerPresent() || capperReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 66, column: 5
                                      capperReq_o.setREQ(false);//sysj\orchestrator.sysj line: 66, column: 5
                                      S118957=1;
                                      active[3]=1;
                                      ends[3]=1;
                                      tdone[3]=1;
                                    }
                                    else {
                                      S118952=0;
                                      if(capperReq_o.isACK()){//sysj\orchestrator.sysj line: 66, column: 5
                                        capperReq_o.setVal(false);//sysj\orchestrator.sysj line: 66, column: 5
                                        S118952=1;
                                        if(!capperReq_o.isACK()){//sysj\orchestrator.sysj line: 66, column: 5
                                          capperReq_o.setREQ(false);//sysj\orchestrator.sysj line: 66, column: 5
                                          ends[3]=2;
                                          ;//sysj\orchestrator.sysj line: 66, column: 5
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
                    switch(S118868){
                      case 0 : 
                        if(!capLoaderReq_o.isPartnerPresent() || capLoaderReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 65, column: 5
                          capLoaderReq_o.setREQ(false);//sysj\orchestrator.sysj line: 65, column: 5
                          S118868=1;
                          active[3]=1;
                          ends[3]=1;
                          tdone[3]=1;
                        }
                        else {
                          switch(S118863){
                            case 0 : 
                              if(capLoaderReq_o.isACK()){//sysj\orchestrator.sysj line: 65, column: 5
                                capLoaderReq_o.setVal(false);//sysj\orchestrator.sysj line: 65, column: 5
                                S118863=1;
                                if(!capLoaderReq_o.isACK()){//sysj\orchestrator.sysj line: 65, column: 5
                                  capLoaderReq_o.setREQ(false);//sysj\orchestrator.sysj line: 65, column: 5
                                  ends[3]=2;
                                  ;//sysj\orchestrator.sysj line: 65, column: 5
                                  S118950=2;
                                  S118957=0;
                                  if(!capperReq_o.isPartnerPresent() || capperReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 66, column: 5
                                    capperReq_o.setREQ(false);//sysj\orchestrator.sysj line: 66, column: 5
                                    S118957=1;
                                    active[3]=1;
                                    ends[3]=1;
                                    tdone[3]=1;
                                  }
                                  else {
                                    S118952=0;
                                    if(capperReq_o.isACK()){//sysj\orchestrator.sysj line: 66, column: 5
                                      capperReq_o.setVal(false);//sysj\orchestrator.sysj line: 66, column: 5
                                      S118952=1;
                                      if(!capperReq_o.isACK()){//sysj\orchestrator.sysj line: 66, column: 5
                                        capperReq_o.setREQ(false);//sysj\orchestrator.sysj line: 66, column: 5
                                        ends[3]=2;
                                        ;//sysj\orchestrator.sysj line: 66, column: 5
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
                              if(!capLoaderReq_o.isACK()){//sysj\orchestrator.sysj line: 65, column: 5
                                capLoaderReq_o.setREQ(false);//sysj\orchestrator.sysj line: 65, column: 5
                                ends[3]=2;
                                ;//sysj\orchestrator.sysj line: 65, column: 5
                                S118950=2;
                                S118957=0;
                                if(!capperReq_o.isPartnerPresent() || capperReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 66, column: 5
                                  capperReq_o.setREQ(false);//sysj\orchestrator.sysj line: 66, column: 5
                                  S118957=1;
                                  active[3]=1;
                                  ends[3]=1;
                                  tdone[3]=1;
                                }
                                else {
                                  S118952=0;
                                  if(capperReq_o.isACK()){//sysj\orchestrator.sysj line: 66, column: 5
                                    capperReq_o.setVal(false);//sysj\orchestrator.sysj line: 66, column: 5
                                    S118952=1;
                                    if(!capperReq_o.isACK()){//sysj\orchestrator.sysj line: 66, column: 5
                                      capperReq_o.setREQ(false);//sysj\orchestrator.sysj line: 66, column: 5
                                      ends[3]=2;
                                      ;//sysj\orchestrator.sysj line: 66, column: 5
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
                        S118868=1;
                        S118868=0;
                        if(!capLoaderReq_o.isPartnerPresent() || capLoaderReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 65, column: 5
                          capLoaderReq_o.setREQ(false);//sysj\orchestrator.sysj line: 65, column: 5
                          S118868=1;
                          active[3]=1;
                          ends[3]=1;
                          tdone[3]=1;
                        }
                        else {
                          S118863=0;
                          if(capLoaderReq_o.isACK()){//sysj\orchestrator.sysj line: 65, column: 5
                            capLoaderReq_o.setVal(false);//sysj\orchestrator.sysj line: 65, column: 5
                            S118863=1;
                            if(!capLoaderReq_o.isACK()){//sysj\orchestrator.sysj line: 65, column: 5
                              capLoaderReq_o.setREQ(false);//sysj\orchestrator.sysj line: 65, column: 5
                              ends[3]=2;
                              ;//sysj\orchestrator.sysj line: 65, column: 5
                              S118950=2;
                              S118957=0;
                              if(!capperReq_o.isPartnerPresent() || capperReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 66, column: 5
                                capperReq_o.setREQ(false);//sysj\orchestrator.sysj line: 66, column: 5
                                S118957=1;
                                active[3]=1;
                                ends[3]=1;
                                tdone[3]=1;
                              }
                              else {
                                S118952=0;
                                if(capperReq_o.isACK()){//sysj\orchestrator.sysj line: 66, column: 5
                                  capperReq_o.setVal(false);//sysj\orchestrator.sysj line: 66, column: 5
                                  S118952=1;
                                  if(!capperReq_o.isACK()){//sysj\orchestrator.sysj line: 66, column: 5
                                    capperReq_o.setREQ(false);//sysj\orchestrator.sysj line: 66, column: 5
                                    ends[3]=2;
                                    ;//sysj\orchestrator.sysj line: 66, column: 5
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
                    switch(S118957){
                      case 0 : 
                        if(!capperReq_o.isPartnerPresent() || capperReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 66, column: 5
                          capperReq_o.setREQ(false);//sysj\orchestrator.sysj line: 66, column: 5
                          S118957=1;
                          active[3]=1;
                          ends[3]=1;
                          tdone[3]=1;
                        }
                        else {
                          switch(S118952){
                            case 0 : 
                              if(capperReq_o.isACK()){//sysj\orchestrator.sysj line: 66, column: 5
                                capperReq_o.setVal(false);//sysj\orchestrator.sysj line: 66, column: 5
                                S118952=1;
                                if(!capperReq_o.isACK()){//sysj\orchestrator.sysj line: 66, column: 5
                                  capperReq_o.setREQ(false);//sysj\orchestrator.sysj line: 66, column: 5
                                  ends[3]=2;
                                  ;//sysj\orchestrator.sysj line: 66, column: 5
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
                              if(!capperReq_o.isACK()){//sysj\orchestrator.sysj line: 66, column: 5
                                capperReq_o.setREQ(false);//sysj\orchestrator.sysj line: 66, column: 5
                                ends[3]=2;
                                ;//sysj\orchestrator.sysj line: 66, column: 5
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
                        S118957=1;
                        S118957=0;
                        if(!capperReq_o.isPartnerPresent() || capperReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 66, column: 5
                          capperReq_o.setREQ(false);//sysj\orchestrator.sysj line: 66, column: 5
                          S118957=1;
                          active[3]=1;
                          ends[3]=1;
                          tdone[3]=1;
                        }
                        else {
                          S118952=0;
                          if(capperReq_o.isACK()){//sysj\orchestrator.sysj line: 66, column: 5
                            capperReq_o.setVal(false);//sysj\orchestrator.sysj line: 66, column: 5
                            S118952=1;
                            if(!capperReq_o.isACK()){//sysj\orchestrator.sysj line: 66, column: 5
                              capperReq_o.setREQ(false);//sysj\orchestrator.sysj line: 66, column: 5
                              ends[3]=2;
                              ;//sysj\orchestrator.sysj line: 66, column: 5
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
              
            }
            break;
          
          case 2 : 
            S118574=2;
            S118574=0;
            S118558=0;
            if(!rotaryStatus_in.isPartnerPresent() || rotaryStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 52, column: 4
              rotaryStatus_in.setACK(false);//sysj\orchestrator.sysj line: 52, column: 4
              S118558=1;
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            else {
              S118553=0;
              if(!rotaryStatus_in.isREQ()){//sysj\orchestrator.sysj line: 52, column: 4
                rotaryStatus_in.setACK(true);//sysj\orchestrator.sysj line: 52, column: 4
                S118553=1;
                if(rotaryStatus_in.isREQ()){//sysj\orchestrator.sysj line: 52, column: 4
                  rotaryStatus_in.setACK(false);//sysj\orchestrator.sysj line: 52, column: 4
                  ends[3]=2;
                  ;//sysj\orchestrator.sysj line: 52, column: 4
                  rotaryStat_thread_3 = (rotaryStatus_in.getVal() == null ? null : ((String)rotaryStatus_in.getVal()));//sysj\orchestrator.sysj line: 53, column: 4
                  S118574=1;
                  if(rotaryStat_thread_3 == "done"){//sysj\orchestrator.sysj line: 56, column: 7
                    S119083=0;
                    System.out.println("rotary done, sending filler,loader,screwer, conveyor reqs");//sysj\orchestrator.sysj line: 57, column: 5
                    S118619=0;
                    S118581=0;
                    if(!fillerReq_o.isPartnerPresent() || fillerReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 58, column: 5
                      fillerReq_o.setREQ(false);//sysj\orchestrator.sysj line: 58, column: 5
                      S118581=1;
                      active[3]=1;
                      ends[3]=1;
                      tdone[3]=1;
                    }
                    else {
                      S118576=0;
                      if(fillerReq_o.isACK()){//sysj\orchestrator.sysj line: 58, column: 5
                        fillerReq_o.setVal(true);//sysj\orchestrator.sysj line: 58, column: 5
                        S118576=1;
                        if(!fillerReq_o.isACK()){//sysj\orchestrator.sysj line: 58, column: 5
                          fillerReq_o.setREQ(false);//sysj\orchestrator.sysj line: 58, column: 5
                          ends[3]=2;
                          ;//sysj\orchestrator.sysj line: 58, column: 5
                          S118619=1;
                          S118626=0;
                          if(!capLoaderReq_o.isPartnerPresent() || capLoaderReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 59, column: 5
                            capLoaderReq_o.setREQ(false);//sysj\orchestrator.sysj line: 59, column: 5
                            S118626=1;
                            active[3]=1;
                            ends[3]=1;
                            tdone[3]=1;
                          }
                          else {
                            S118621=0;
                            if(capLoaderReq_o.isACK()){//sysj\orchestrator.sysj line: 59, column: 5
                              capLoaderReq_o.setVal(true);//sysj\orchestrator.sysj line: 59, column: 5
                              S118621=1;
                              if(!capLoaderReq_o.isACK()){//sysj\orchestrator.sysj line: 59, column: 5
                                capLoaderReq_o.setREQ(false);//sysj\orchestrator.sysj line: 59, column: 5
                                ends[3]=2;
                                ;//sysj\orchestrator.sysj line: 59, column: 5
                                S118619=2;
                                S118714=0;
                                if(!capperReq_o.isPartnerPresent() || capperReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 60, column: 5
                                  capperReq_o.setREQ(false);//sysj\orchestrator.sysj line: 60, column: 5
                                  S118714=1;
                                  active[3]=1;
                                  ends[3]=1;
                                  tdone[3]=1;
                                }
                                else {
                                  S118709=0;
                                  if(capperReq_o.isACK()){//sysj\orchestrator.sysj line: 60, column: 5
                                    capperReq_o.setVal(true);//sysj\orchestrator.sysj line: 60, column: 5
                                    S118709=1;
                                    if(!capperReq_o.isACK()){//sysj\orchestrator.sysj line: 60, column: 5
                                      capperReq_o.setREQ(false);//sysj\orchestrator.sysj line: 60, column: 5
                                      ends[3]=2;
                                      ;//sysj\orchestrator.sysj line: 60, column: 5
                                      getNextBottle_1.setPresent();//sysj\orchestrator.sysj line: 61, column: 5
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
                    S119083=1;
                    S118950=0;
                    S118846=0;
                    if(!fillerReq_o.isPartnerPresent() || fillerReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 64, column: 5
                      fillerReq_o.setREQ(false);//sysj\orchestrator.sysj line: 64, column: 5
                      S118846=1;
                      active[3]=1;
                      ends[3]=1;
                      tdone[3]=1;
                    }
                    else {
                      S118841=0;
                      if(fillerReq_o.isACK()){//sysj\orchestrator.sysj line: 64, column: 5
                        fillerReq_o.setVal(false);//sysj\orchestrator.sysj line: 64, column: 5
                        S118841=1;
                        if(!fillerReq_o.isACK()){//sysj\orchestrator.sysj line: 64, column: 5
                          fillerReq_o.setREQ(false);//sysj\orchestrator.sysj line: 64, column: 5
                          ends[3]=2;
                          ;//sysj\orchestrator.sysj line: 64, column: 5
                          S118950=1;
                          S118868=0;
                          if(!capLoaderReq_o.isPartnerPresent() || capLoaderReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 65, column: 5
                            capLoaderReq_o.setREQ(false);//sysj\orchestrator.sysj line: 65, column: 5
                            S118868=1;
                            active[3]=1;
                            ends[3]=1;
                            tdone[3]=1;
                          }
                          else {
                            S118863=0;
                            if(capLoaderReq_o.isACK()){//sysj\orchestrator.sysj line: 65, column: 5
                              capLoaderReq_o.setVal(false);//sysj\orchestrator.sysj line: 65, column: 5
                              S118863=1;
                              if(!capLoaderReq_o.isACK()){//sysj\orchestrator.sysj line: 65, column: 5
                                capLoaderReq_o.setREQ(false);//sysj\orchestrator.sysj line: 65, column: 5
                                ends[3]=2;
                                ;//sysj\orchestrator.sysj line: 65, column: 5
                                S118950=2;
                                S118957=0;
                                if(!capperReq_o.isPartnerPresent() || capperReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 66, column: 5
                                  capperReq_o.setREQ(false);//sysj\orchestrator.sysj line: 66, column: 5
                                  S118957=1;
                                  active[3]=1;
                                  ends[3]=1;
                                  tdone[3]=1;
                                }
                                else {
                                  S118952=0;
                                  if(capperReq_o.isACK()){//sysj\orchestrator.sysj line: 66, column: 5
                                    capperReq_o.setVal(false);//sysj\orchestrator.sysj line: 66, column: 5
                                    S118952=1;
                                    if(!capperReq_o.isACK()){//sysj\orchestrator.sysj line: 66, column: 5
                                      capperReq_o.setREQ(false);//sysj\orchestrator.sysj line: 66, column: 5
                                      ends[3]=2;
                                      ;//sysj\orchestrator.sysj line: 66, column: 5
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

  public void thread125166(int [] tdone, int [] ends){
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
                    if(!conveyorReq_o.isPartnerPresent() || conveyorReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 35, column: 5
                      conveyorReq_o.setREQ(false);//sysj\orchestrator.sysj line: 35, column: 5
                      S116739=1;
                      active[2]=1;
                      ends[2]=1;
                      tdone[2]=1;
                    }
                    else {
                      switch(S116734){
                        case 0 : 
                          if(conveyorReq_o.isACK()){//sysj\orchestrator.sysj line: 35, column: 5
                            conveyorReq_o.setVal(true);//sysj\orchestrator.sysj line: 35, column: 5
                            S116734=1;
                            if(!conveyorReq_o.isACK()){//sysj\orchestrator.sysj line: 35, column: 5
                              conveyorReq_o.setREQ(false);//sysj\orchestrator.sysj line: 35, column: 5
                              ends[2]=2;
                              ;//sysj\orchestrator.sysj line: 35, column: 5
                              bottlePlaced_thread_2 = bottlePlaced_thread_2 - 1;//sysj\orchestrator.sysj line: 36, column: 5
                              System.out.println(liquidPercent_thread_2.get(3));//sysj\orchestrator.sysj line: 37, column: 5
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
                          if(!conveyorReq_o.isACK()){//sysj\orchestrator.sysj line: 35, column: 5
                            conveyorReq_o.setREQ(false);//sysj\orchestrator.sysj line: 35, column: 5
                            ends[2]=2;
                            ;//sysj\orchestrator.sysj line: 35, column: 5
                            bottlePlaced_thread_2 = bottlePlaced_thread_2 - 1;//sysj\orchestrator.sysj line: 36, column: 5
                            System.out.println(liquidPercent_thread_2.get(3));//sysj\orchestrator.sysj line: 37, column: 5
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
                    if(!conveyorReq_o.isPartnerPresent() || conveyorReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 35, column: 5
                      conveyorReq_o.setREQ(false);//sysj\orchestrator.sysj line: 35, column: 5
                      S116739=1;
                      active[2]=1;
                      ends[2]=1;
                      tdone[2]=1;
                    }
                    else {
                      S116734=0;
                      if(conveyorReq_o.isACK()){//sysj\orchestrator.sysj line: 35, column: 5
                        conveyorReq_o.setVal(true);//sysj\orchestrator.sysj line: 35, column: 5
                        S116734=1;
                        if(!conveyorReq_o.isACK()){//sysj\orchestrator.sysj line: 35, column: 5
                          conveyorReq_o.setREQ(false);//sysj\orchestrator.sysj line: 35, column: 5
                          ends[2]=2;
                          ;//sysj\orchestrator.sysj line: 35, column: 5
                          bottlePlaced_thread_2 = bottlePlaced_thread_2 - 1;//sysj\orchestrator.sysj line: 36, column: 5
                          System.out.println(liquidPercent_thread_2.get(3));//sysj\orchestrator.sysj line: 37, column: 5
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
                if(getNextBottle_1.getprestatus()){//sysj\orchestrator.sysj line: 38, column: 11
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
                if(bottlePlaced_thread_2 >= 0){//sysj\orchestrator.sysj line: 33, column: 10
                  System.out.println("sending conveyor req?");//sysj\orchestrator.sysj line: 34, column: 5
                  S116777=0;
                  S116739=0;
                  if(!conveyorReq_o.isPartnerPresent() || conveyorReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 35, column: 5
                    conveyorReq_o.setREQ(false);//sysj\orchestrator.sysj line: 35, column: 5
                    S116739=1;
                    active[2]=1;
                    ends[2]=1;
                    tdone[2]=1;
                  }
                  else {
                    S116734=0;
                    if(conveyorReq_o.isACK()){//sysj\orchestrator.sysj line: 35, column: 5
                      conveyorReq_o.setVal(true);//sysj\orchestrator.sysj line: 35, column: 5
                      S116734=1;
                      if(!conveyorReq_o.isACK()){//sysj\orchestrator.sysj line: 35, column: 5
                        conveyorReq_o.setREQ(false);//sysj\orchestrator.sysj line: 35, column: 5
                        ends[2]=2;
                        ;//sysj\orchestrator.sysj line: 35, column: 5
                        bottlePlaced_thread_2 = bottlePlaced_thread_2 - 1;//sysj\orchestrator.sysj line: 36, column: 5
                        System.out.println(liquidPercent_thread_2.get(3));//sysj\orchestrator.sysj line: 37, column: 5
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
                  conveyorReq_o.setPreempted();//sysj\orchestrator.sysj line: 33, column: 4
                  ends[2]=2;
                  ;//sysj\orchestrator.sysj line: 33, column: 4
                  System.out.println("Done order");//sysj\orchestrator.sysj line: 43, column: 4
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
            bottlePlaced_thread_2 = quantity_thread_2;//sysj\orchestrator.sysj line: 32, column: 4
            S117035=0;
            if(bottlePlaced_thread_2 >= 0){//sysj\orchestrator.sysj line: 33, column: 10
              System.out.println("sending conveyor req?");//sysj\orchestrator.sysj line: 34, column: 5
              S116777=0;
              S116739=0;
              if(!conveyorReq_o.isPartnerPresent() || conveyorReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 35, column: 5
                conveyorReq_o.setREQ(false);//sysj\orchestrator.sysj line: 35, column: 5
                S116739=1;
                active[2]=1;
                ends[2]=1;
                tdone[2]=1;
              }
              else {
                S116734=0;
                if(conveyorReq_o.isACK()){//sysj\orchestrator.sysj line: 35, column: 5
                  conveyorReq_o.setVal(true);//sysj\orchestrator.sysj line: 35, column: 5
                  S116734=1;
                  if(!conveyorReq_o.isACK()){//sysj\orchestrator.sysj line: 35, column: 5
                    conveyorReq_o.setREQ(false);//sysj\orchestrator.sysj line: 35, column: 5
                    ends[2]=2;
                    ;//sysj\orchestrator.sysj line: 35, column: 5
                    bottlePlaced_thread_2 = bottlePlaced_thread_2 - 1;//sysj\orchestrator.sysj line: 36, column: 5
                    System.out.println(liquidPercent_thread_2.get(3));//sysj\orchestrator.sysj line: 37, column: 5
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
              conveyorReq_o.setPreempted();//sysj\orchestrator.sysj line: 33, column: 4
              ends[2]=2;
              ;//sysj\orchestrator.sysj line: 33, column: 4
              System.out.println("Done order");//sysj\orchestrator.sysj line: 43, column: 4
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

  public void thread125164(int [] tdone, int [] ends){
        S125154=1;
    S125060=0;
    if((Status.conveyStat == true) && (Status.fillerStat == true) && (Status.capperStat == true) && (Status.capLoaderStat == true)){//sysj\orchestrator.sysj line: 132, column: 7
      S125059=0;
      S125021=0;
      if(!allOperationsFinished_o.isPartnerPresent() || allOperationsFinished_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 137, column: 5
        allOperationsFinished_o.setREQ(false);//sysj\orchestrator.sysj line: 137, column: 5
        S125021=1;
        active[8]=1;
        ends[8]=1;
        tdone[8]=1;
      }
      else {
        S125016=0;
        if(allOperationsFinished_o.isACK()){//sysj\orchestrator.sysj line: 137, column: 5
          allOperationsFinished_o.setVal(true);//sysj\orchestrator.sysj line: 137, column: 5
          S125016=1;
          if(!allOperationsFinished_o.isACK()){//sysj\orchestrator.sysj line: 137, column: 5
            allOperationsFinished_o.setREQ(false);//sysj\orchestrator.sysj line: 137, column: 5
            ends[8]=2;
            ;//sysj\orchestrator.sysj line: 137, column: 5
            S125060=1;
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
      S125059=1;
      S125043=0;
      if(!allOperationsFinished_o.isPartnerPresent() || allOperationsFinished_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 139, column: 5
        allOperationsFinished_o.setREQ(false);//sysj\orchestrator.sysj line: 139, column: 5
        S125043=1;
        active[8]=1;
        ends[8]=1;
        tdone[8]=1;
      }
      else {
        S125038=0;
        if(allOperationsFinished_o.isACK()){//sysj\orchestrator.sysj line: 139, column: 5
          allOperationsFinished_o.setVal(false);//sysj\orchestrator.sysj line: 139, column: 5
          S125038=1;
          if(!allOperationsFinished_o.isACK()){//sysj\orchestrator.sysj line: 139, column: 5
            allOperationsFinished_o.setREQ(false);//sysj\orchestrator.sysj line: 139, column: 5
            ends[8]=2;
            ;//sysj\orchestrator.sysj line: 139, column: 5
            S125060=1;
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

  public void thread125163(int [] tdone, int [] ends){
        S125014=1;
    S124966=0;
    S124950=0;
    if(!capLoaderStatus_in.isPartnerPresent() || capLoaderStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 116, column: 4
      capLoaderStatus_in.setACK(false);//sysj\orchestrator.sysj line: 116, column: 4
      S124950=1;
      active[7]=1;
      ends[7]=1;
      tdone[7]=1;
    }
    else {
      S124945=0;
      if(!capLoaderStatus_in.isREQ()){//sysj\orchestrator.sysj line: 116, column: 4
        capLoaderStatus_in.setACK(true);//sysj\orchestrator.sysj line: 116, column: 4
        S124945=1;
        if(capLoaderStatus_in.isREQ()){//sysj\orchestrator.sysj line: 116, column: 4
          capLoaderStatus_in.setACK(false);//sysj\orchestrator.sysj line: 116, column: 4
          ends[7]=2;
          ;//sysj\orchestrator.sysj line: 116, column: 4
          capLoaderValue_thread_7 = (capLoaderStatus_in.getVal() == null ? null : ((String)capLoaderStatus_in.getVal()));//sysj\orchestrator.sysj line: 117, column: 4
          if(capLoaderValue_thread_7 == "busy") {//sysj\orchestrator.sysj line: 118, column: 34
            Status.capLoaderStat = true;//sysj\orchestrator.sysj line: 119, column: 5
          }
          else {//sysj\orchestrator.sysj line: 121, column: 9
            Status.capLoaderStat = false;//sysj\orchestrator.sysj line: 122, column: 5
          }
          S124966=1;
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

  public void thread125162(int [] tdone, int [] ends){
        S124943=1;
    S124895=0;
    S124879=0;
    if(!capperStatus_in.isPartnerPresent() || capperStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 104, column: 4
      capperStatus_in.setACK(false);//sysj\orchestrator.sysj line: 104, column: 4
      S124879=1;
      active[6]=1;
      ends[6]=1;
      tdone[6]=1;
    }
    else {
      S124874=0;
      if(!capperStatus_in.isREQ()){//sysj\orchestrator.sysj line: 104, column: 4
        capperStatus_in.setACK(true);//sysj\orchestrator.sysj line: 104, column: 4
        S124874=1;
        if(capperStatus_in.isREQ()){//sysj\orchestrator.sysj line: 104, column: 4
          capperStatus_in.setACK(false);//sysj\orchestrator.sysj line: 104, column: 4
          ends[6]=2;
          ;//sysj\orchestrator.sysj line: 104, column: 4
          capperValue_thread_6 = (capperStatus_in.getVal() == null ? null : ((String)capperStatus_in.getVal()));//sysj\orchestrator.sysj line: 105, column: 4
          if(capperValue_thread_6 == "busy") {//sysj\orchestrator.sysj line: 106, column: 31
            Status.capperStat = true;//sysj\orchestrator.sysj line: 107, column: 5
          }
          else {//sysj\orchestrator.sysj line: 109, column: 9
          }
          S124895=1;
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

  public void thread125161(int [] tdone, int [] ends){
        S124872=1;
    S124824=0;
    S124808=0;
    if(!fillerStatus_in.isPartnerPresent() || fillerStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 90, column: 4
      fillerStatus_in.setACK(false);//sysj\orchestrator.sysj line: 90, column: 4
      S124808=1;
      active[5]=1;
      ends[5]=1;
      tdone[5]=1;
    }
    else {
      S124803=0;
      if(!fillerStatus_in.isREQ()){//sysj\orchestrator.sysj line: 90, column: 4
        fillerStatus_in.setACK(true);//sysj\orchestrator.sysj line: 90, column: 4
        S124803=1;
        if(fillerStatus_in.isREQ()){//sysj\orchestrator.sysj line: 90, column: 4
          fillerStatus_in.setACK(false);//sysj\orchestrator.sysj line: 90, column: 4
          ends[5]=2;
          ;//sysj\orchestrator.sysj line: 90, column: 4
          fillerValue_thread_5 = (fillerStatus_in.getVal() == null ? null : ((String)fillerStatus_in.getVal()));//sysj\orchestrator.sysj line: 91, column: 4
          if(fillerValue_thread_5 == "busy") {//sysj\orchestrator.sysj line: 92, column: 31
            Status.fillerStat = true;//sysj\orchestrator.sysj line: 93, column: 5
          }
          else {//sysj\orchestrator.sysj line: 95, column: 9
            Status.fillerStat = false;//sysj\orchestrator.sysj line: 96, column: 5
          }
          S124824=1;
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

  public void thread125160(int [] tdone, int [] ends){
        S124801=1;
    S124753=0;
    S124737=0;
    if(!conveyorStatus_in.isPartnerPresent() || conveyorStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 75, column: 4
      conveyorStatus_in.setACK(false);//sysj\orchestrator.sysj line: 75, column: 4
      S124737=1;
      active[4]=1;
      ends[4]=1;
      tdone[4]=1;
    }
    else {
      S124732=0;
      if(!conveyorStatus_in.isREQ()){//sysj\orchestrator.sysj line: 75, column: 4
        conveyorStatus_in.setACK(true);//sysj\orchestrator.sysj line: 75, column: 4
        S124732=1;
        if(conveyorStatus_in.isREQ()){//sysj\orchestrator.sysj line: 75, column: 4
          conveyorStatus_in.setACK(false);//sysj\orchestrator.sysj line: 75, column: 4
          ends[4]=2;
          ;//sysj\orchestrator.sysj line: 75, column: 4
          conveyValue_thread_4 = (conveyorStatus_in.getVal() == null ? null : ((String)conveyorStatus_in.getVal()));//sysj\orchestrator.sysj line: 76, column: 4
          if(conveyValue_thread_4 == "busy") {//sysj\orchestrator.sysj line: 77, column: 31
            Status.conveyStat = true;//sysj\orchestrator.sysj line: 78, column: 5
          }
          else {//sysj\orchestrator.sysj line: 80, column: 9
            Status.conveyStat = false;//sysj\orchestrator.sysj line: 81, column: 5
          }
          S124753=1;
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

  public void thread125159(int [] tdone, int [] ends){
        S124730=1;
    S118574=0;
    S118558=0;
    if(!rotaryStatus_in.isPartnerPresent() || rotaryStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 52, column: 4
      rotaryStatus_in.setACK(false);//sysj\orchestrator.sysj line: 52, column: 4
      S118558=1;
      active[3]=1;
      ends[3]=1;
      tdone[3]=1;
    }
    else {
      S118553=0;
      if(!rotaryStatus_in.isREQ()){//sysj\orchestrator.sysj line: 52, column: 4
        rotaryStatus_in.setACK(true);//sysj\orchestrator.sysj line: 52, column: 4
        S118553=1;
        if(rotaryStatus_in.isREQ()){//sysj\orchestrator.sysj line: 52, column: 4
          rotaryStatus_in.setACK(false);//sysj\orchestrator.sysj line: 52, column: 4
          ends[3]=2;
          ;//sysj\orchestrator.sysj line: 52, column: 4
          rotaryStat_thread_3 = (rotaryStatus_in.getVal() == null ? null : ((String)rotaryStatus_in.getVal()));//sysj\orchestrator.sysj line: 53, column: 4
          S118574=1;
          if(rotaryStat_thread_3 == "done"){//sysj\orchestrator.sysj line: 56, column: 7
            S119083=0;
            System.out.println("rotary done, sending filler,loader,screwer, conveyor reqs");//sysj\orchestrator.sysj line: 57, column: 5
            S118619=0;
            S118581=0;
            if(!fillerReq_o.isPartnerPresent() || fillerReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 58, column: 5
              fillerReq_o.setREQ(false);//sysj\orchestrator.sysj line: 58, column: 5
              S118581=1;
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            else {
              S118576=0;
              if(fillerReq_o.isACK()){//sysj\orchestrator.sysj line: 58, column: 5
                fillerReq_o.setVal(true);//sysj\orchestrator.sysj line: 58, column: 5
                S118576=1;
                if(!fillerReq_o.isACK()){//sysj\orchestrator.sysj line: 58, column: 5
                  fillerReq_o.setREQ(false);//sysj\orchestrator.sysj line: 58, column: 5
                  ends[3]=2;
                  ;//sysj\orchestrator.sysj line: 58, column: 5
                  S118619=1;
                  S118626=0;
                  if(!capLoaderReq_o.isPartnerPresent() || capLoaderReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 59, column: 5
                    capLoaderReq_o.setREQ(false);//sysj\orchestrator.sysj line: 59, column: 5
                    S118626=1;
                    active[3]=1;
                    ends[3]=1;
                    tdone[3]=1;
                  }
                  else {
                    S118621=0;
                    if(capLoaderReq_o.isACK()){//sysj\orchestrator.sysj line: 59, column: 5
                      capLoaderReq_o.setVal(true);//sysj\orchestrator.sysj line: 59, column: 5
                      S118621=1;
                      if(!capLoaderReq_o.isACK()){//sysj\orchestrator.sysj line: 59, column: 5
                        capLoaderReq_o.setREQ(false);//sysj\orchestrator.sysj line: 59, column: 5
                        ends[3]=2;
                        ;//sysj\orchestrator.sysj line: 59, column: 5
                        S118619=2;
                        S118714=0;
                        if(!capperReq_o.isPartnerPresent() || capperReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 60, column: 5
                          capperReq_o.setREQ(false);//sysj\orchestrator.sysj line: 60, column: 5
                          S118714=1;
                          active[3]=1;
                          ends[3]=1;
                          tdone[3]=1;
                        }
                        else {
                          S118709=0;
                          if(capperReq_o.isACK()){//sysj\orchestrator.sysj line: 60, column: 5
                            capperReq_o.setVal(true);//sysj\orchestrator.sysj line: 60, column: 5
                            S118709=1;
                            if(!capperReq_o.isACK()){//sysj\orchestrator.sysj line: 60, column: 5
                              capperReq_o.setREQ(false);//sysj\orchestrator.sysj line: 60, column: 5
                              ends[3]=2;
                              ;//sysj\orchestrator.sysj line: 60, column: 5
                              getNextBottle_1.setPresent();//sysj\orchestrator.sysj line: 61, column: 5
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
            S119083=1;
            S118950=0;
            S118846=0;
            if(!fillerReq_o.isPartnerPresent() || fillerReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 64, column: 5
              fillerReq_o.setREQ(false);//sysj\orchestrator.sysj line: 64, column: 5
              S118846=1;
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            else {
              S118841=0;
              if(fillerReq_o.isACK()){//sysj\orchestrator.sysj line: 64, column: 5
                fillerReq_o.setVal(false);//sysj\orchestrator.sysj line: 64, column: 5
                S118841=1;
                if(!fillerReq_o.isACK()){//sysj\orchestrator.sysj line: 64, column: 5
                  fillerReq_o.setREQ(false);//sysj\orchestrator.sysj line: 64, column: 5
                  ends[3]=2;
                  ;//sysj\orchestrator.sysj line: 64, column: 5
                  S118950=1;
                  S118868=0;
                  if(!capLoaderReq_o.isPartnerPresent() || capLoaderReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 65, column: 5
                    capLoaderReq_o.setREQ(false);//sysj\orchestrator.sysj line: 65, column: 5
                    S118868=1;
                    active[3]=1;
                    ends[3]=1;
                    tdone[3]=1;
                  }
                  else {
                    S118863=0;
                    if(capLoaderReq_o.isACK()){//sysj\orchestrator.sysj line: 65, column: 5
                      capLoaderReq_o.setVal(false);//sysj\orchestrator.sysj line: 65, column: 5
                      S118863=1;
                      if(!capLoaderReq_o.isACK()){//sysj\orchestrator.sysj line: 65, column: 5
                        capLoaderReq_o.setREQ(false);//sysj\orchestrator.sysj line: 65, column: 5
                        ends[3]=2;
                        ;//sysj\orchestrator.sysj line: 65, column: 5
                        S118950=2;
                        S118957=0;
                        if(!capperReq_o.isPartnerPresent() || capperReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 66, column: 5
                          capperReq_o.setREQ(false);//sysj\orchestrator.sysj line: 66, column: 5
                          S118957=1;
                          active[3]=1;
                          ends[3]=1;
                          tdone[3]=1;
                        }
                        else {
                          S118952=0;
                          if(capperReq_o.isACK()){//sysj\orchestrator.sysj line: 66, column: 5
                            capperReq_o.setVal(false);//sysj\orchestrator.sysj line: 66, column: 5
                            S118952=1;
                            if(!capperReq_o.isACK()){//sysj\orchestrator.sysj line: 66, column: 5
                              capperReq_o.setREQ(false);//sysj\orchestrator.sysj line: 66, column: 5
                              ends[3]=2;
                              ;//sysj\orchestrator.sysj line: 66, column: 5
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

  public void thread125158(int [] tdone, int [] ends){
        S118551=1;
    quantity_thread_2 = 5;//sysj\orchestrator.sysj line: 20, column: 3
    bottlePlaced_thread_2 = 0;//sysj\orchestrator.sysj line: 21, column: 3
    liquidPercent_thread_2 = new ArrayList();//sysj\orchestrator.sysj line: 22, column: 3
    liquidPercent_thread_2.add(10);//sysj\orchestrator.sysj line: 23, column: 3
    liquidPercent_thread_2.add(10);//sysj\orchestrator.sysj line: 24, column: 3
    liquidPercent_thread_2.add(20);//sysj\orchestrator.sysj line: 25, column: 3
    liquidPercent_thread_2.add(60);//sysj\orchestrator.sysj line: 26, column: 3
    bottlePlaced_thread_2 = quantity_thread_2;//sysj\orchestrator.sysj line: 32, column: 4
    S117035=0;
    if(bottlePlaced_thread_2 >= 0){//sysj\orchestrator.sysj line: 33, column: 10
      System.out.println("sending conveyor req?");//sysj\orchestrator.sysj line: 34, column: 5
      S116777=0;
      S116739=0;
      if(!conveyorReq_o.isPartnerPresent() || conveyorReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 35, column: 5
        conveyorReq_o.setREQ(false);//sysj\orchestrator.sysj line: 35, column: 5
        S116739=1;
        active[2]=1;
        ends[2]=1;
        tdone[2]=1;
      }
      else {
        S116734=0;
        if(conveyorReq_o.isACK()){//sysj\orchestrator.sysj line: 35, column: 5
          conveyorReq_o.setVal(true);//sysj\orchestrator.sysj line: 35, column: 5
          S116734=1;
          if(!conveyorReq_o.isACK()){//sysj\orchestrator.sysj line: 35, column: 5
            conveyorReq_o.setREQ(false);//sysj\orchestrator.sysj line: 35, column: 5
            ends[2]=2;
            ;//sysj\orchestrator.sysj line: 35, column: 5
            bottlePlaced_thread_2 = bottlePlaced_thread_2 - 1;//sysj\orchestrator.sysj line: 36, column: 5
            System.out.println(liquidPercent_thread_2.get(3));//sysj\orchestrator.sysj line: 37, column: 5
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
      conveyorReq_o.setPreempted();//sysj\orchestrator.sysj line: 33, column: 4
      ends[2]=2;
      ;//sysj\orchestrator.sysj line: 33, column: 4
      System.out.println("Done order");//sysj\orchestrator.sysj line: 43, column: 4
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
      switch(S125156){
        case 0 : 
          S125156=0;
          break RUN;
        
        case 1 : 
          S125156=2;
          S125156=2;
          getNextBottle_1.setClear();//sysj\orchestrator.sysj line: 16, column: 2
          thread125158(tdone,ends);
          thread125159(tdone,ends);
          thread125160(tdone,ends);
          thread125161(tdone,ends);
          thread125162(tdone,ends);
          thread125163(tdone,ends);
          thread125164(tdone,ends);
          int biggest125165 = 0;
          if(ends[2]>=biggest125165){
            biggest125165=ends[2];
          }
          if(ends[3]>=biggest125165){
            biggest125165=ends[3];
          }
          if(ends[4]>=biggest125165){
            biggest125165=ends[4];
          }
          if(ends[5]>=biggest125165){
            biggest125165=ends[5];
          }
          if(ends[6]>=biggest125165){
            biggest125165=ends[6];
          }
          if(ends[7]>=biggest125165){
            biggest125165=ends[7];
          }
          if(ends[8]>=biggest125165){
            biggest125165=ends[8];
          }
          if(biggest125165 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
        
        case 2 : 
          getNextBottle_1.setClear();//sysj\orchestrator.sysj line: 16, column: 2
          thread125166(tdone,ends);
          thread125167(tdone,ends);
          thread125168(tdone,ends);
          thread125169(tdone,ends);
          thread125170(tdone,ends);
          thread125171(tdone,ends);
          thread125172(tdone,ends);
          int biggest125173 = 0;
          if(ends[2]>=biggest125173){
            biggest125173=ends[2];
          }
          if(ends[3]>=biggest125173){
            biggest125173=ends[3];
          }
          if(ends[4]>=biggest125173){
            biggest125173=ends[4];
          }
          if(ends[5]>=biggest125173){
            biggest125173=ends[5];
          }
          if(ends[6]>=biggest125173){
            biggest125173=ends[6];
          }
          if(ends[7]>=biggest125173){
            biggest125173=ends[7];
          }
          if(ends[8]>=biggest125173){
            biggest125173=ends[8];
          }
          if(biggest125173 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
          //FINXME code
          if(biggest125173 == 0){
            S125156=0;
            active[1]=0;
            ends[1]=0;
            S125156=0;
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
