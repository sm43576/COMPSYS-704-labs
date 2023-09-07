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
  private boolean conveyStat_thread_2;//sysj\orchestrator.sysj line: 21, column: 3
  private boolean fillerStat_thread_2;//sysj\orchestrator.sysj line: 22, column: 3
  private boolean capperStat_thread_2;//sysj\orchestrator.sysj line: 23, column: 3
  private boolean capLoaderStat_thread_2;//sysj\orchestrator.sysj line: 24, column: 3
  private int quantity_thread_2;//sysj\orchestrator.sysj line: 26, column: 3
  private int bottlePlaced_thread_2;//sysj\orchestrator.sysj line: 27, column: 3
  private ArrayList liquidPercent_thread_2;//sysj\orchestrator.sysj line: 28, column: 3
  private String rotaryStat_thread_3;//sysj\orchestrator.sysj line: 59, column: 4
  private String conveyValue_thread_5;//sysj\orchestrator.sysj line: 87, column: 6
  private String fillerValue_thread_6;//sysj\orchestrator.sysj line: 101, column: 5
  private String capperValue_thread_7;//sysj\orchestrator.sysj line: 115, column: 5
  private String capLoaderValue_thread_8;//sysj\orchestrator.sysj line: 128, column: 5
  private int S126009 = 1;
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
  private int S126007 = 1;
  private int S125155 = 1;
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
  
  private int[] ends = new int[10];
  private int[] tdone = new int[10];
  
  public void thread126034(int [] tdone, int [] ends){
        S125154=1;
    S125060=0;
    if((conveyStat == true) && (fillerStat == true) && (capperStat == true) && (capLoaderStat == true)){//sysj\orchestrator.sysj line: 143, column: 9
      S125059=0;
      S125021=0;
      if(!allOperationsFinished_o.isPartnerPresent() || allOperationsFinished_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 148, column: 7
        allOperationsFinished_o.setREQ(false);//sysj\orchestrator.sysj line: 148, column: 7
        S125021=1;
        active[9]=1;
        ends[9]=1;
        tdone[9]=1;
      }
      else {
        S125016=0;
        if(allOperationsFinished_o.isACK()){//sysj\orchestrator.sysj line: 148, column: 7
          allOperationsFinished_o.setVal(true);//sysj\orchestrator.sysj line: 148, column: 7
          S125016=1;
          if(!allOperationsFinished_o.isACK()){//sysj\orchestrator.sysj line: 148, column: 7
            allOperationsFinished_o.setREQ(false);//sysj\orchestrator.sysj line: 148, column: 7
            ends[9]=2;
            ;//sysj\orchestrator.sysj line: 148, column: 7
            S125060=1;
            active[9]=1;
            ends[9]=1;
            tdone[9]=1;
          }
          else {
            active[9]=1;
            ends[9]=1;
            tdone[9]=1;
          }
        }
        else {
          active[9]=1;
          ends[9]=1;
          tdone[9]=1;
        }
      }
    }
    else {
      S125059=1;
      S125043=0;
      if(!allOperationsFinished_o.isPartnerPresent() || allOperationsFinished_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 150, column: 7
        allOperationsFinished_o.setREQ(false);//sysj\orchestrator.sysj line: 150, column: 7
        S125043=1;
        active[9]=1;
        ends[9]=1;
        tdone[9]=1;
      }
      else {
        S125038=0;
        if(allOperationsFinished_o.isACK()){//sysj\orchestrator.sysj line: 150, column: 7
          allOperationsFinished_o.setVal(false);//sysj\orchestrator.sysj line: 150, column: 7
          S125038=1;
          if(!allOperationsFinished_o.isACK()){//sysj\orchestrator.sysj line: 150, column: 7
            allOperationsFinished_o.setREQ(false);//sysj\orchestrator.sysj line: 150, column: 7
            ends[9]=2;
            ;//sysj\orchestrator.sysj line: 150, column: 7
            S125060=1;
            active[9]=1;
            ends[9]=1;
            tdone[9]=1;
          }
          else {
            active[9]=1;
            ends[9]=1;
            tdone[9]=1;
          }
        }
        else {
          active[9]=1;
          ends[9]=1;
          tdone[9]=1;
        }
      }
    }
  }

  public void thread126033(int [] tdone, int [] ends){
        S125014=1;
    S124966=0;
    S124950=0;
    if(!capLoaderStatus_in.isPartnerPresent() || capLoaderStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 127, column: 5
      capLoaderStatus_in.setACK(false);//sysj\orchestrator.sysj line: 127, column: 5
      S124950=1;
      active[8]=1;
      ends[8]=1;
      tdone[8]=1;
    }
    else {
      S124945=0;
      if(!capLoaderStatus_in.isREQ()){//sysj\orchestrator.sysj line: 127, column: 5
        capLoaderStatus_in.setACK(true);//sysj\orchestrator.sysj line: 127, column: 5
        S124945=1;
        if(capLoaderStatus_in.isREQ()){//sysj\orchestrator.sysj line: 127, column: 5
          capLoaderStatus_in.setACK(false);//sysj\orchestrator.sysj line: 127, column: 5
          ends[8]=2;
          ;//sysj\orchestrator.sysj line: 127, column: 5
          capLoaderValue_thread_8 = (capLoaderStatus_in.getVal() == null ? null : ((String)capLoaderStatus_in.getVal()));//sysj\orchestrator.sysj line: 128, column: 5
          if(capLoaderValue_thread_8 == "busy") {//sysj\orchestrator.sysj line: 129, column: 35
            capLoaderStat = true;//sysj\orchestrator.sysj line: 130, column: 6
          }
          else {//sysj\orchestrator.sysj line: 132, column: 10
            capLoaderStat = false;//sysj\orchestrator.sysj line: 133, column: 6
          }
          S124966=1;
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

  public void thread126032(int [] tdone, int [] ends){
        S124943=1;
    S124895=0;
    S124879=0;
    if(!capperStatus_in.isPartnerPresent() || capperStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 114, column: 5
      capperStatus_in.setACK(false);//sysj\orchestrator.sysj line: 114, column: 5
      S124879=1;
      active[7]=1;
      ends[7]=1;
      tdone[7]=1;
    }
    else {
      S124874=0;
      if(!capperStatus_in.isREQ()){//sysj\orchestrator.sysj line: 114, column: 5
        capperStatus_in.setACK(true);//sysj\orchestrator.sysj line: 114, column: 5
        S124874=1;
        if(capperStatus_in.isREQ()){//sysj\orchestrator.sysj line: 114, column: 5
          capperStatus_in.setACK(false);//sysj\orchestrator.sysj line: 114, column: 5
          ends[7]=2;
          ;//sysj\orchestrator.sysj line: 114, column: 5
          capperValue_thread_7 = (capperStatus_in.getVal() == null ? null : ((String)capperStatus_in.getVal()));//sysj\orchestrator.sysj line: 115, column: 5
          if(capperValue_thread_7 == "busy") {//sysj\orchestrator.sysj line: 116, column: 32
            capperStat = true;//sysj\orchestrator.sysj line: 117, column: 6
          }
          else {//sysj\orchestrator.sysj line: 119, column: 10
            capperStat = false;//sysj\orchestrator.sysj line: 120, column: 6
          }
          S124895=1;
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

  public void thread126031(int [] tdone, int [] ends){
        S124872=1;
    S124824=0;
    S124808=0;
    if(!fillerStatus_in.isPartnerPresent() || fillerStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 100, column: 5
      fillerStatus_in.setACK(false);//sysj\orchestrator.sysj line: 100, column: 5
      S124808=1;
      active[6]=1;
      ends[6]=1;
      tdone[6]=1;
    }
    else {
      S124803=0;
      if(!fillerStatus_in.isREQ()){//sysj\orchestrator.sysj line: 100, column: 5
        fillerStatus_in.setACK(true);//sysj\orchestrator.sysj line: 100, column: 5
        S124803=1;
        if(fillerStatus_in.isREQ()){//sysj\orchestrator.sysj line: 100, column: 5
          fillerStatus_in.setACK(false);//sysj\orchestrator.sysj line: 100, column: 5
          ends[6]=2;
          ;//sysj\orchestrator.sysj line: 100, column: 5
          fillerValue_thread_6 = (fillerStatus_in.getVal() == null ? null : ((String)fillerStatus_in.getVal()));//sysj\orchestrator.sysj line: 101, column: 5
          if(fillerValue_thread_6 == "busy") {//sysj\orchestrator.sysj line: 102, column: 32
            fillerStat = true;//sysj\orchestrator.sysj line: 103, column: 6
          }
          else {//sysj\orchestrator.sysj line: 105, column: 10
            fillerStat = false;//sysj\orchestrator.sysj line: 106, column: 6
          }
          S124824=1;
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

  public void thread126030(int [] tdone, int [] ends){
        S124801=1;
    S124753=0;
    S124737=0;
    if(!conveyorStatus_in.isPartnerPresent() || conveyorStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 86, column: 6
      conveyorStatus_in.setACK(false);//sysj\orchestrator.sysj line: 86, column: 6
      S124737=1;
      active[5]=1;
      ends[5]=1;
      tdone[5]=1;
    }
    else {
      S124732=0;
      if(!conveyorStatus_in.isREQ()){//sysj\orchestrator.sysj line: 86, column: 6
        conveyorStatus_in.setACK(true);//sysj\orchestrator.sysj line: 86, column: 6
        S124732=1;
        if(conveyorStatus_in.isREQ()){//sysj\orchestrator.sysj line: 86, column: 6
          conveyorStatus_in.setACK(false);//sysj\orchestrator.sysj line: 86, column: 6
          ends[5]=2;
          ;//sysj\orchestrator.sysj line: 86, column: 6
          conveyValue_thread_5 = (conveyorStatus_in.getVal() == null ? null : ((String)conveyorStatus_in.getVal()));//sysj\orchestrator.sysj line: 87, column: 6
          if(conveyValue_thread_5 == "busy") {//sysj\orchestrator.sysj line: 88, column: 33
            conveyStat = true;//sysj\orchestrator.sysj line: 89, column: 7
          }
          else {//sysj\orchestrator.sysj line: 91, column: 11
            conveyStat = false;//sysj\orchestrator.sysj line: 92, column: 7
          }
          S124753=1;
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

  public void thread126028(int [] tdone, int [] ends){
        switch(S125154){
      case 0 : 
        active[9]=0;
        ends[9]=0;
        tdone[9]=1;
        break;
      
      case 1 : 
        switch(S125060){
          case 0 : 
            switch(S125059){
              case 0 : 
                switch(S125021){
                  case 0 : 
                    if(!allOperationsFinished_o.isPartnerPresent() || allOperationsFinished_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 148, column: 7
                      allOperationsFinished_o.setREQ(false);//sysj\orchestrator.sysj line: 148, column: 7
                      S125021=1;
                      active[9]=1;
                      ends[9]=1;
                      tdone[9]=1;
                    }
                    else {
                      switch(S125016){
                        case 0 : 
                          if(allOperationsFinished_o.isACK()){//sysj\orchestrator.sysj line: 148, column: 7
                            allOperationsFinished_o.setVal(true);//sysj\orchestrator.sysj line: 148, column: 7
                            S125016=1;
                            if(!allOperationsFinished_o.isACK()){//sysj\orchestrator.sysj line: 148, column: 7
                              allOperationsFinished_o.setREQ(false);//sysj\orchestrator.sysj line: 148, column: 7
                              ends[9]=2;
                              ;//sysj\orchestrator.sysj line: 148, column: 7
                              S125060=1;
                              active[9]=1;
                              ends[9]=1;
                              tdone[9]=1;
                            }
                            else {
                              active[9]=1;
                              ends[9]=1;
                              tdone[9]=1;
                            }
                          }
                          else {
                            active[9]=1;
                            ends[9]=1;
                            tdone[9]=1;
                          }
                          break;
                        
                        case 1 : 
                          if(!allOperationsFinished_o.isACK()){//sysj\orchestrator.sysj line: 148, column: 7
                            allOperationsFinished_o.setREQ(false);//sysj\orchestrator.sysj line: 148, column: 7
                            ends[9]=2;
                            ;//sysj\orchestrator.sysj line: 148, column: 7
                            S125060=1;
                            active[9]=1;
                            ends[9]=1;
                            tdone[9]=1;
                          }
                          else {
                            active[9]=1;
                            ends[9]=1;
                            tdone[9]=1;
                          }
                          break;
                        
                      }
                    }
                    break;
                  
                  case 1 : 
                    S125021=1;
                    S125021=0;
                    if(!allOperationsFinished_o.isPartnerPresent() || allOperationsFinished_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 148, column: 7
                      allOperationsFinished_o.setREQ(false);//sysj\orchestrator.sysj line: 148, column: 7
                      S125021=1;
                      active[9]=1;
                      ends[9]=1;
                      tdone[9]=1;
                    }
                    else {
                      S125016=0;
                      if(allOperationsFinished_o.isACK()){//sysj\orchestrator.sysj line: 148, column: 7
                        allOperationsFinished_o.setVal(true);//sysj\orchestrator.sysj line: 148, column: 7
                        S125016=1;
                        if(!allOperationsFinished_o.isACK()){//sysj\orchestrator.sysj line: 148, column: 7
                          allOperationsFinished_o.setREQ(false);//sysj\orchestrator.sysj line: 148, column: 7
                          ends[9]=2;
                          ;//sysj\orchestrator.sysj line: 148, column: 7
                          S125060=1;
                          active[9]=1;
                          ends[9]=1;
                          tdone[9]=1;
                        }
                        else {
                          active[9]=1;
                          ends[9]=1;
                          tdone[9]=1;
                        }
                      }
                      else {
                        active[9]=1;
                        ends[9]=1;
                        tdone[9]=1;
                      }
                    }
                    break;
                  
                }
                break;
              
              case 1 : 
                switch(S125043){
                  case 0 : 
                    if(!allOperationsFinished_o.isPartnerPresent() || allOperationsFinished_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 150, column: 7
                      allOperationsFinished_o.setREQ(false);//sysj\orchestrator.sysj line: 150, column: 7
                      S125043=1;
                      active[9]=1;
                      ends[9]=1;
                      tdone[9]=1;
                    }
                    else {
                      switch(S125038){
                        case 0 : 
                          if(allOperationsFinished_o.isACK()){//sysj\orchestrator.sysj line: 150, column: 7
                            allOperationsFinished_o.setVal(false);//sysj\orchestrator.sysj line: 150, column: 7
                            S125038=1;
                            if(!allOperationsFinished_o.isACK()){//sysj\orchestrator.sysj line: 150, column: 7
                              allOperationsFinished_o.setREQ(false);//sysj\orchestrator.sysj line: 150, column: 7
                              ends[9]=2;
                              ;//sysj\orchestrator.sysj line: 150, column: 7
                              S125060=1;
                              active[9]=1;
                              ends[9]=1;
                              tdone[9]=1;
                            }
                            else {
                              active[9]=1;
                              ends[9]=1;
                              tdone[9]=1;
                            }
                          }
                          else {
                            active[9]=1;
                            ends[9]=1;
                            tdone[9]=1;
                          }
                          break;
                        
                        case 1 : 
                          if(!allOperationsFinished_o.isACK()){//sysj\orchestrator.sysj line: 150, column: 7
                            allOperationsFinished_o.setREQ(false);//sysj\orchestrator.sysj line: 150, column: 7
                            ends[9]=2;
                            ;//sysj\orchestrator.sysj line: 150, column: 7
                            S125060=1;
                            active[9]=1;
                            ends[9]=1;
                            tdone[9]=1;
                          }
                          else {
                            active[9]=1;
                            ends[9]=1;
                            tdone[9]=1;
                          }
                          break;
                        
                      }
                    }
                    break;
                  
                  case 1 : 
                    S125043=1;
                    S125043=0;
                    if(!allOperationsFinished_o.isPartnerPresent() || allOperationsFinished_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 150, column: 7
                      allOperationsFinished_o.setREQ(false);//sysj\orchestrator.sysj line: 150, column: 7
                      S125043=1;
                      active[9]=1;
                      ends[9]=1;
                      tdone[9]=1;
                    }
                    else {
                      S125038=0;
                      if(allOperationsFinished_o.isACK()){//sysj\orchestrator.sysj line: 150, column: 7
                        allOperationsFinished_o.setVal(false);//sysj\orchestrator.sysj line: 150, column: 7
                        S125038=1;
                        if(!allOperationsFinished_o.isACK()){//sysj\orchestrator.sysj line: 150, column: 7
                          allOperationsFinished_o.setREQ(false);//sysj\orchestrator.sysj line: 150, column: 7
                          ends[9]=2;
                          ;//sysj\orchestrator.sysj line: 150, column: 7
                          S125060=1;
                          active[9]=1;
                          ends[9]=1;
                          tdone[9]=1;
                        }
                        else {
                          active[9]=1;
                          ends[9]=1;
                          tdone[9]=1;
                        }
                      }
                      else {
                        active[9]=1;
                        ends[9]=1;
                        tdone[9]=1;
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
            if((conveyStat == true) && (fillerStat == true) && (capperStat == true) && (capLoaderStat == true)){//sysj\orchestrator.sysj line: 143, column: 9
              S125059=0;
              S125021=0;
              if(!allOperationsFinished_o.isPartnerPresent() || allOperationsFinished_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 148, column: 7
                allOperationsFinished_o.setREQ(false);//sysj\orchestrator.sysj line: 148, column: 7
                S125021=1;
                active[9]=1;
                ends[9]=1;
                tdone[9]=1;
              }
              else {
                S125016=0;
                if(allOperationsFinished_o.isACK()){//sysj\orchestrator.sysj line: 148, column: 7
                  allOperationsFinished_o.setVal(true);//sysj\orchestrator.sysj line: 148, column: 7
                  S125016=1;
                  if(!allOperationsFinished_o.isACK()){//sysj\orchestrator.sysj line: 148, column: 7
                    allOperationsFinished_o.setREQ(false);//sysj\orchestrator.sysj line: 148, column: 7
                    ends[9]=2;
                    ;//sysj\orchestrator.sysj line: 148, column: 7
                    S125060=1;
                    active[9]=1;
                    ends[9]=1;
                    tdone[9]=1;
                  }
                  else {
                    active[9]=1;
                    ends[9]=1;
                    tdone[9]=1;
                  }
                }
                else {
                  active[9]=1;
                  ends[9]=1;
                  tdone[9]=1;
                }
              }
            }
            else {
              S125059=1;
              S125043=0;
              if(!allOperationsFinished_o.isPartnerPresent() || allOperationsFinished_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 150, column: 7
                allOperationsFinished_o.setREQ(false);//sysj\orchestrator.sysj line: 150, column: 7
                S125043=1;
                active[9]=1;
                ends[9]=1;
                tdone[9]=1;
              }
              else {
                S125038=0;
                if(allOperationsFinished_o.isACK()){//sysj\orchestrator.sysj line: 150, column: 7
                  allOperationsFinished_o.setVal(false);//sysj\orchestrator.sysj line: 150, column: 7
                  S125038=1;
                  if(!allOperationsFinished_o.isACK()){//sysj\orchestrator.sysj line: 150, column: 7
                    allOperationsFinished_o.setREQ(false);//sysj\orchestrator.sysj line: 150, column: 7
                    ends[9]=2;
                    ;//sysj\orchestrator.sysj line: 150, column: 7
                    S125060=1;
                    active[9]=1;
                    ends[9]=1;
                    tdone[9]=1;
                  }
                  else {
                    active[9]=1;
                    ends[9]=1;
                    tdone[9]=1;
                  }
                }
                else {
                  active[9]=1;
                  ends[9]=1;
                  tdone[9]=1;
                }
              }
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread126027(int [] tdone, int [] ends){
        switch(S125014){
      case 0 : 
        active[8]=0;
        ends[8]=0;
        tdone[8]=1;
        break;
      
      case 1 : 
        switch(S124966){
          case 0 : 
            switch(S124950){
              case 0 : 
                if(!capLoaderStatus_in.isPartnerPresent() || capLoaderStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 127, column: 5
                  capLoaderStatus_in.setACK(false);//sysj\orchestrator.sysj line: 127, column: 5
                  S124950=1;
                  active[8]=1;
                  ends[8]=1;
                  tdone[8]=1;
                }
                else {
                  switch(S124945){
                    case 0 : 
                      if(!capLoaderStatus_in.isREQ()){//sysj\orchestrator.sysj line: 127, column: 5
                        capLoaderStatus_in.setACK(true);//sysj\orchestrator.sysj line: 127, column: 5
                        S124945=1;
                        if(capLoaderStatus_in.isREQ()){//sysj\orchestrator.sysj line: 127, column: 5
                          capLoaderStatus_in.setACK(false);//sysj\orchestrator.sysj line: 127, column: 5
                          ends[8]=2;
                          ;//sysj\orchestrator.sysj line: 127, column: 5
                          capLoaderValue_thread_8 = (capLoaderStatus_in.getVal() == null ? null : ((String)capLoaderStatus_in.getVal()));//sysj\orchestrator.sysj line: 128, column: 5
                          if(capLoaderValue_thread_8 == "busy") {//sysj\orchestrator.sysj line: 129, column: 35
                            capLoaderStat = true;//sysj\orchestrator.sysj line: 130, column: 6
                          }
                          else {//sysj\orchestrator.sysj line: 132, column: 10
                            capLoaderStat = false;//sysj\orchestrator.sysj line: 133, column: 6
                          }
                          S124966=1;
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
                      if(capLoaderStatus_in.isREQ()){//sysj\orchestrator.sysj line: 127, column: 5
                        capLoaderStatus_in.setACK(false);//sysj\orchestrator.sysj line: 127, column: 5
                        ends[8]=2;
                        ;//sysj\orchestrator.sysj line: 127, column: 5
                        capLoaderValue_thread_8 = (capLoaderStatus_in.getVal() == null ? null : ((String)capLoaderStatus_in.getVal()));//sysj\orchestrator.sysj line: 128, column: 5
                        if(capLoaderValue_thread_8 == "busy") {//sysj\orchestrator.sysj line: 129, column: 35
                          capLoaderStat = true;//sysj\orchestrator.sysj line: 130, column: 6
                        }
                        else {//sysj\orchestrator.sysj line: 132, column: 10
                          capLoaderStat = false;//sysj\orchestrator.sysj line: 133, column: 6
                        }
                        S124966=1;
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
                S124950=1;
                S124950=0;
                if(!capLoaderStatus_in.isPartnerPresent() || capLoaderStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 127, column: 5
                  capLoaderStatus_in.setACK(false);//sysj\orchestrator.sysj line: 127, column: 5
                  S124950=1;
                  active[8]=1;
                  ends[8]=1;
                  tdone[8]=1;
                }
                else {
                  S124945=0;
                  if(!capLoaderStatus_in.isREQ()){//sysj\orchestrator.sysj line: 127, column: 5
                    capLoaderStatus_in.setACK(true);//sysj\orchestrator.sysj line: 127, column: 5
                    S124945=1;
                    if(capLoaderStatus_in.isREQ()){//sysj\orchestrator.sysj line: 127, column: 5
                      capLoaderStatus_in.setACK(false);//sysj\orchestrator.sysj line: 127, column: 5
                      ends[8]=2;
                      ;//sysj\orchestrator.sysj line: 127, column: 5
                      capLoaderValue_thread_8 = (capLoaderStatus_in.getVal() == null ? null : ((String)capLoaderStatus_in.getVal()));//sysj\orchestrator.sysj line: 128, column: 5
                      if(capLoaderValue_thread_8 == "busy") {//sysj\orchestrator.sysj line: 129, column: 35
                        capLoaderStat = true;//sysj\orchestrator.sysj line: 130, column: 6
                      }
                      else {//sysj\orchestrator.sysj line: 132, column: 10
                        capLoaderStat = false;//sysj\orchestrator.sysj line: 133, column: 6
                      }
                      S124966=1;
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
            S124966=1;
            S124966=0;
            S124950=0;
            if(!capLoaderStatus_in.isPartnerPresent() || capLoaderStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 127, column: 5
              capLoaderStatus_in.setACK(false);//sysj\orchestrator.sysj line: 127, column: 5
              S124950=1;
              active[8]=1;
              ends[8]=1;
              tdone[8]=1;
            }
            else {
              S124945=0;
              if(!capLoaderStatus_in.isREQ()){//sysj\orchestrator.sysj line: 127, column: 5
                capLoaderStatus_in.setACK(true);//sysj\orchestrator.sysj line: 127, column: 5
                S124945=1;
                if(capLoaderStatus_in.isREQ()){//sysj\orchestrator.sysj line: 127, column: 5
                  capLoaderStatus_in.setACK(false);//sysj\orchestrator.sysj line: 127, column: 5
                  ends[8]=2;
                  ;//sysj\orchestrator.sysj line: 127, column: 5
                  capLoaderValue_thread_8 = (capLoaderStatus_in.getVal() == null ? null : ((String)capLoaderStatus_in.getVal()));//sysj\orchestrator.sysj line: 128, column: 5
                  if(capLoaderValue_thread_8 == "busy") {//sysj\orchestrator.sysj line: 129, column: 35
                    capLoaderStat = true;//sysj\orchestrator.sysj line: 130, column: 6
                  }
                  else {//sysj\orchestrator.sysj line: 132, column: 10
                    capLoaderStat = false;//sysj\orchestrator.sysj line: 133, column: 6
                  }
                  S124966=1;
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
  }

  public void thread126026(int [] tdone, int [] ends){
        switch(S124943){
      case 0 : 
        active[7]=0;
        ends[7]=0;
        tdone[7]=1;
        break;
      
      case 1 : 
        switch(S124895){
          case 0 : 
            switch(S124879){
              case 0 : 
                if(!capperStatus_in.isPartnerPresent() || capperStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 114, column: 5
                  capperStatus_in.setACK(false);//sysj\orchestrator.sysj line: 114, column: 5
                  S124879=1;
                  active[7]=1;
                  ends[7]=1;
                  tdone[7]=1;
                }
                else {
                  switch(S124874){
                    case 0 : 
                      if(!capperStatus_in.isREQ()){//sysj\orchestrator.sysj line: 114, column: 5
                        capperStatus_in.setACK(true);//sysj\orchestrator.sysj line: 114, column: 5
                        S124874=1;
                        if(capperStatus_in.isREQ()){//sysj\orchestrator.sysj line: 114, column: 5
                          capperStatus_in.setACK(false);//sysj\orchestrator.sysj line: 114, column: 5
                          ends[7]=2;
                          ;//sysj\orchestrator.sysj line: 114, column: 5
                          capperValue_thread_7 = (capperStatus_in.getVal() == null ? null : ((String)capperStatus_in.getVal()));//sysj\orchestrator.sysj line: 115, column: 5
                          if(capperValue_thread_7 == "busy") {//sysj\orchestrator.sysj line: 116, column: 32
                            capperStat = true;//sysj\orchestrator.sysj line: 117, column: 6
                          }
                          else {//sysj\orchestrator.sysj line: 119, column: 10
                            capperStat = false;//sysj\orchestrator.sysj line: 120, column: 6
                          }
                          S124895=1;
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
                      if(capperStatus_in.isREQ()){//sysj\orchestrator.sysj line: 114, column: 5
                        capperStatus_in.setACK(false);//sysj\orchestrator.sysj line: 114, column: 5
                        ends[7]=2;
                        ;//sysj\orchestrator.sysj line: 114, column: 5
                        capperValue_thread_7 = (capperStatus_in.getVal() == null ? null : ((String)capperStatus_in.getVal()));//sysj\orchestrator.sysj line: 115, column: 5
                        if(capperValue_thread_7 == "busy") {//sysj\orchestrator.sysj line: 116, column: 32
                          capperStat = true;//sysj\orchestrator.sysj line: 117, column: 6
                        }
                        else {//sysj\orchestrator.sysj line: 119, column: 10
                          capperStat = false;//sysj\orchestrator.sysj line: 120, column: 6
                        }
                        S124895=1;
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
                S124879=1;
                S124879=0;
                if(!capperStatus_in.isPartnerPresent() || capperStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 114, column: 5
                  capperStatus_in.setACK(false);//sysj\orchestrator.sysj line: 114, column: 5
                  S124879=1;
                  active[7]=1;
                  ends[7]=1;
                  tdone[7]=1;
                }
                else {
                  S124874=0;
                  if(!capperStatus_in.isREQ()){//sysj\orchestrator.sysj line: 114, column: 5
                    capperStatus_in.setACK(true);//sysj\orchestrator.sysj line: 114, column: 5
                    S124874=1;
                    if(capperStatus_in.isREQ()){//sysj\orchestrator.sysj line: 114, column: 5
                      capperStatus_in.setACK(false);//sysj\orchestrator.sysj line: 114, column: 5
                      ends[7]=2;
                      ;//sysj\orchestrator.sysj line: 114, column: 5
                      capperValue_thread_7 = (capperStatus_in.getVal() == null ? null : ((String)capperStatus_in.getVal()));//sysj\orchestrator.sysj line: 115, column: 5
                      if(capperValue_thread_7 == "busy") {//sysj\orchestrator.sysj line: 116, column: 32
                        capperStat = true;//sysj\orchestrator.sysj line: 117, column: 6
                      }
                      else {//sysj\orchestrator.sysj line: 119, column: 10
                        capperStat = false;//sysj\orchestrator.sysj line: 120, column: 6
                      }
                      S124895=1;
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
            S124895=1;
            S124895=0;
            S124879=0;
            if(!capperStatus_in.isPartnerPresent() || capperStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 114, column: 5
              capperStatus_in.setACK(false);//sysj\orchestrator.sysj line: 114, column: 5
              S124879=1;
              active[7]=1;
              ends[7]=1;
              tdone[7]=1;
            }
            else {
              S124874=0;
              if(!capperStatus_in.isREQ()){//sysj\orchestrator.sysj line: 114, column: 5
                capperStatus_in.setACK(true);//sysj\orchestrator.sysj line: 114, column: 5
                S124874=1;
                if(capperStatus_in.isREQ()){//sysj\orchestrator.sysj line: 114, column: 5
                  capperStatus_in.setACK(false);//sysj\orchestrator.sysj line: 114, column: 5
                  ends[7]=2;
                  ;//sysj\orchestrator.sysj line: 114, column: 5
                  capperValue_thread_7 = (capperStatus_in.getVal() == null ? null : ((String)capperStatus_in.getVal()));//sysj\orchestrator.sysj line: 115, column: 5
                  if(capperValue_thread_7 == "busy") {//sysj\orchestrator.sysj line: 116, column: 32
                    capperStat = true;//sysj\orchestrator.sysj line: 117, column: 6
                  }
                  else {//sysj\orchestrator.sysj line: 119, column: 10
                    capperStat = false;//sysj\orchestrator.sysj line: 120, column: 6
                  }
                  S124895=1;
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

  public void thread126025(int [] tdone, int [] ends){
        switch(S124872){
      case 0 : 
        active[6]=0;
        ends[6]=0;
        tdone[6]=1;
        break;
      
      case 1 : 
        switch(S124824){
          case 0 : 
            switch(S124808){
              case 0 : 
                if(!fillerStatus_in.isPartnerPresent() || fillerStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 100, column: 5
                  fillerStatus_in.setACK(false);//sysj\orchestrator.sysj line: 100, column: 5
                  S124808=1;
                  active[6]=1;
                  ends[6]=1;
                  tdone[6]=1;
                }
                else {
                  switch(S124803){
                    case 0 : 
                      if(!fillerStatus_in.isREQ()){//sysj\orchestrator.sysj line: 100, column: 5
                        fillerStatus_in.setACK(true);//sysj\orchestrator.sysj line: 100, column: 5
                        S124803=1;
                        if(fillerStatus_in.isREQ()){//sysj\orchestrator.sysj line: 100, column: 5
                          fillerStatus_in.setACK(false);//sysj\orchestrator.sysj line: 100, column: 5
                          ends[6]=2;
                          ;//sysj\orchestrator.sysj line: 100, column: 5
                          fillerValue_thread_6 = (fillerStatus_in.getVal() == null ? null : ((String)fillerStatus_in.getVal()));//sysj\orchestrator.sysj line: 101, column: 5
                          if(fillerValue_thread_6 == "busy") {//sysj\orchestrator.sysj line: 102, column: 32
                            fillerStat = true;//sysj\orchestrator.sysj line: 103, column: 6
                          }
                          else {//sysj\orchestrator.sysj line: 105, column: 10
                            fillerStat = false;//sysj\orchestrator.sysj line: 106, column: 6
                          }
                          S124824=1;
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
                      if(fillerStatus_in.isREQ()){//sysj\orchestrator.sysj line: 100, column: 5
                        fillerStatus_in.setACK(false);//sysj\orchestrator.sysj line: 100, column: 5
                        ends[6]=2;
                        ;//sysj\orchestrator.sysj line: 100, column: 5
                        fillerValue_thread_6 = (fillerStatus_in.getVal() == null ? null : ((String)fillerStatus_in.getVal()));//sysj\orchestrator.sysj line: 101, column: 5
                        if(fillerValue_thread_6 == "busy") {//sysj\orchestrator.sysj line: 102, column: 32
                          fillerStat = true;//sysj\orchestrator.sysj line: 103, column: 6
                        }
                        else {//sysj\orchestrator.sysj line: 105, column: 10
                          fillerStat = false;//sysj\orchestrator.sysj line: 106, column: 6
                        }
                        S124824=1;
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
                S124808=1;
                S124808=0;
                if(!fillerStatus_in.isPartnerPresent() || fillerStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 100, column: 5
                  fillerStatus_in.setACK(false);//sysj\orchestrator.sysj line: 100, column: 5
                  S124808=1;
                  active[6]=1;
                  ends[6]=1;
                  tdone[6]=1;
                }
                else {
                  S124803=0;
                  if(!fillerStatus_in.isREQ()){//sysj\orchestrator.sysj line: 100, column: 5
                    fillerStatus_in.setACK(true);//sysj\orchestrator.sysj line: 100, column: 5
                    S124803=1;
                    if(fillerStatus_in.isREQ()){//sysj\orchestrator.sysj line: 100, column: 5
                      fillerStatus_in.setACK(false);//sysj\orchestrator.sysj line: 100, column: 5
                      ends[6]=2;
                      ;//sysj\orchestrator.sysj line: 100, column: 5
                      fillerValue_thread_6 = (fillerStatus_in.getVal() == null ? null : ((String)fillerStatus_in.getVal()));//sysj\orchestrator.sysj line: 101, column: 5
                      if(fillerValue_thread_6 == "busy") {//sysj\orchestrator.sysj line: 102, column: 32
                        fillerStat = true;//sysj\orchestrator.sysj line: 103, column: 6
                      }
                      else {//sysj\orchestrator.sysj line: 105, column: 10
                        fillerStat = false;//sysj\orchestrator.sysj line: 106, column: 6
                      }
                      S124824=1;
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
            S124824=1;
            S124824=0;
            S124808=0;
            if(!fillerStatus_in.isPartnerPresent() || fillerStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 100, column: 5
              fillerStatus_in.setACK(false);//sysj\orchestrator.sysj line: 100, column: 5
              S124808=1;
              active[6]=1;
              ends[6]=1;
              tdone[6]=1;
            }
            else {
              S124803=0;
              if(!fillerStatus_in.isREQ()){//sysj\orchestrator.sysj line: 100, column: 5
                fillerStatus_in.setACK(true);//sysj\orchestrator.sysj line: 100, column: 5
                S124803=1;
                if(fillerStatus_in.isREQ()){//sysj\orchestrator.sysj line: 100, column: 5
                  fillerStatus_in.setACK(false);//sysj\orchestrator.sysj line: 100, column: 5
                  ends[6]=2;
                  ;//sysj\orchestrator.sysj line: 100, column: 5
                  fillerValue_thread_6 = (fillerStatus_in.getVal() == null ? null : ((String)fillerStatus_in.getVal()));//sysj\orchestrator.sysj line: 101, column: 5
                  if(fillerValue_thread_6 == "busy") {//sysj\orchestrator.sysj line: 102, column: 32
                    fillerStat = true;//sysj\orchestrator.sysj line: 103, column: 6
                  }
                  else {//sysj\orchestrator.sysj line: 105, column: 10
                    fillerStat = false;//sysj\orchestrator.sysj line: 106, column: 6
                  }
                  S124824=1;
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

  public void thread126024(int [] tdone, int [] ends){
        switch(S124801){
      case 0 : 
        active[5]=0;
        ends[5]=0;
        tdone[5]=1;
        break;
      
      case 1 : 
        switch(S124753){
          case 0 : 
            switch(S124737){
              case 0 : 
                if(!conveyorStatus_in.isPartnerPresent() || conveyorStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 86, column: 6
                  conveyorStatus_in.setACK(false);//sysj\orchestrator.sysj line: 86, column: 6
                  S124737=1;
                  active[5]=1;
                  ends[5]=1;
                  tdone[5]=1;
                }
                else {
                  switch(S124732){
                    case 0 : 
                      if(!conveyorStatus_in.isREQ()){//sysj\orchestrator.sysj line: 86, column: 6
                        conveyorStatus_in.setACK(true);//sysj\orchestrator.sysj line: 86, column: 6
                        S124732=1;
                        if(conveyorStatus_in.isREQ()){//sysj\orchestrator.sysj line: 86, column: 6
                          conveyorStatus_in.setACK(false);//sysj\orchestrator.sysj line: 86, column: 6
                          ends[5]=2;
                          ;//sysj\orchestrator.sysj line: 86, column: 6
                          conveyValue_thread_5 = (conveyorStatus_in.getVal() == null ? null : ((String)conveyorStatus_in.getVal()));//sysj\orchestrator.sysj line: 87, column: 6
                          if(conveyValue_thread_5 == "busy") {//sysj\orchestrator.sysj line: 88, column: 33
                            conveyStat = true;//sysj\orchestrator.sysj line: 89, column: 7
                          }
                          else {//sysj\orchestrator.sysj line: 91, column: 11
                            conveyStat = false;//sysj\orchestrator.sysj line: 92, column: 7
                          }
                          S124753=1;
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
                      if(conveyorStatus_in.isREQ()){//sysj\orchestrator.sysj line: 86, column: 6
                        conveyorStatus_in.setACK(false);//sysj\orchestrator.sysj line: 86, column: 6
                        ends[5]=2;
                        ;//sysj\orchestrator.sysj line: 86, column: 6
                        conveyValue_thread_5 = (conveyorStatus_in.getVal() == null ? null : ((String)conveyorStatus_in.getVal()));//sysj\orchestrator.sysj line: 87, column: 6
                        if(conveyValue_thread_5 == "busy") {//sysj\orchestrator.sysj line: 88, column: 33
                          conveyStat = true;//sysj\orchestrator.sysj line: 89, column: 7
                        }
                        else {//sysj\orchestrator.sysj line: 91, column: 11
                          conveyStat = false;//sysj\orchestrator.sysj line: 92, column: 7
                        }
                        S124753=1;
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
                S124737=1;
                S124737=0;
                if(!conveyorStatus_in.isPartnerPresent() || conveyorStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 86, column: 6
                  conveyorStatus_in.setACK(false);//sysj\orchestrator.sysj line: 86, column: 6
                  S124737=1;
                  active[5]=1;
                  ends[5]=1;
                  tdone[5]=1;
                }
                else {
                  S124732=0;
                  if(!conveyorStatus_in.isREQ()){//sysj\orchestrator.sysj line: 86, column: 6
                    conveyorStatus_in.setACK(true);//sysj\orchestrator.sysj line: 86, column: 6
                    S124732=1;
                    if(conveyorStatus_in.isREQ()){//sysj\orchestrator.sysj line: 86, column: 6
                      conveyorStatus_in.setACK(false);//sysj\orchestrator.sysj line: 86, column: 6
                      ends[5]=2;
                      ;//sysj\orchestrator.sysj line: 86, column: 6
                      conveyValue_thread_5 = (conveyorStatus_in.getVal() == null ? null : ((String)conveyorStatus_in.getVal()));//sysj\orchestrator.sysj line: 87, column: 6
                      if(conveyValue_thread_5 == "busy") {//sysj\orchestrator.sysj line: 88, column: 33
                        conveyStat = true;//sysj\orchestrator.sysj line: 89, column: 7
                      }
                      else {//sysj\orchestrator.sysj line: 91, column: 11
                        conveyStat = false;//sysj\orchestrator.sysj line: 92, column: 7
                      }
                      S124753=1;
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
            S124753=1;
            S124753=0;
            S124737=0;
            if(!conveyorStatus_in.isPartnerPresent() || conveyorStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 86, column: 6
              conveyorStatus_in.setACK(false);//sysj\orchestrator.sysj line: 86, column: 6
              S124737=1;
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            else {
              S124732=0;
              if(!conveyorStatus_in.isREQ()){//sysj\orchestrator.sysj line: 86, column: 6
                conveyorStatus_in.setACK(true);//sysj\orchestrator.sysj line: 86, column: 6
                S124732=1;
                if(conveyorStatus_in.isREQ()){//sysj\orchestrator.sysj line: 86, column: 6
                  conveyorStatus_in.setACK(false);//sysj\orchestrator.sysj line: 86, column: 6
                  ends[5]=2;
                  ;//sysj\orchestrator.sysj line: 86, column: 6
                  conveyValue_thread_5 = (conveyorStatus_in.getVal() == null ? null : ((String)conveyorStatus_in.getVal()));//sysj\orchestrator.sysj line: 87, column: 6
                  if(conveyValue_thread_5 == "busy") {//sysj\orchestrator.sysj line: 88, column: 33
                    conveyStat = true;//sysj\orchestrator.sysj line: 89, column: 7
                  }
                  else {//sysj\orchestrator.sysj line: 91, column: 11
                    conveyStat = false;//sysj\orchestrator.sysj line: 92, column: 7
                  }
                  S124753=1;
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

  public void thread126023(int [] tdone, int [] ends){
        switch(S126007){
      case 0 : 
        active[4]=0;
        ends[4]=0;
        tdone[4]=1;
        break;
      
      case 1 : 
        switch(S125155){
          case 0 : 
            thread126024(tdone,ends);
            thread126025(tdone,ends);
            thread126026(tdone,ends);
            thread126027(tdone,ends);
            thread126028(tdone,ends);
            int biggest126029 = 0;
            if(ends[5]>=biggest126029){
              biggest126029=ends[5];
            }
            if(ends[6]>=biggest126029){
              biggest126029=ends[6];
            }
            if(ends[7]>=biggest126029){
              biggest126029=ends[7];
            }
            if(ends[8]>=biggest126029){
              biggest126029=ends[8];
            }
            if(ends[9]>=biggest126029){
              biggest126029=ends[9];
            }
            if(biggest126029 == 1){
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            //FINXME code
            if(biggest126029 == 0){
              S125155=1;
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            break;
          
          case 1 : 
            S125155=1;
            S125155=0;
            thread126030(tdone,ends);
            thread126031(tdone,ends);
            thread126032(tdone,ends);
            thread126033(tdone,ends);
            thread126034(tdone,ends);
            int biggest126035 = 0;
            if(ends[5]>=biggest126035){
              biggest126035=ends[5];
            }
            if(ends[6]>=biggest126035){
              biggest126035=ends[6];
            }
            if(ends[7]>=biggest126035){
              biggest126035=ends[7];
            }
            if(ends[8]>=biggest126035){
              biggest126035=ends[8];
            }
            if(ends[9]>=biggest126035){
              biggest126035=ends[9];
            }
            if(biggest126035 == 1){
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread126022(int [] tdone, int [] ends){
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
                if(!rotaryStatus_in.isPartnerPresent() || rotaryStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 58, column: 4
                  rotaryStatus_in.setACK(false);//sysj\orchestrator.sysj line: 58, column: 4
                  S118558=1;
                  active[3]=1;
                  ends[3]=1;
                  tdone[3]=1;
                }
                else {
                  switch(S118553){
                    case 0 : 
                      if(!rotaryStatus_in.isREQ()){//sysj\orchestrator.sysj line: 58, column: 4
                        rotaryStatus_in.setACK(true);//sysj\orchestrator.sysj line: 58, column: 4
                        S118553=1;
                        if(rotaryStatus_in.isREQ()){//sysj\orchestrator.sysj line: 58, column: 4
                          rotaryStatus_in.setACK(false);//sysj\orchestrator.sysj line: 58, column: 4
                          ends[3]=2;
                          ;//sysj\orchestrator.sysj line: 58, column: 4
                          rotaryStat_thread_3 = (rotaryStatus_in.getVal() == null ? null : ((String)rotaryStatus_in.getVal()));//sysj\orchestrator.sysj line: 59, column: 4
                          S118574=1;
                          if(rotaryStat_thread_3 == "done"){//sysj\orchestrator.sysj line: 62, column: 7
                            S119083=0;
                            System.out.println("rotary done, sending filler,loader,screwer, conveyor reqs");//sysj\orchestrator.sysj line: 63, column: 5
                            S118619=0;
                            S118581=0;
                            if(!fillerReq_o.isPartnerPresent() || fillerReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 64, column: 5
                              fillerReq_o.setREQ(false);//sysj\orchestrator.sysj line: 64, column: 5
                              S118581=1;
                              active[3]=1;
                              ends[3]=1;
                              tdone[3]=1;
                            }
                            else {
                              S118576=0;
                              if(fillerReq_o.isACK()){//sysj\orchestrator.sysj line: 64, column: 5
                                fillerReq_o.setVal(true);//sysj\orchestrator.sysj line: 64, column: 5
                                S118576=1;
                                if(!fillerReq_o.isACK()){//sysj\orchestrator.sysj line: 64, column: 5
                                  fillerReq_o.setREQ(false);//sysj\orchestrator.sysj line: 64, column: 5
                                  ends[3]=2;
                                  ;//sysj\orchestrator.sysj line: 64, column: 5
                                  S118619=1;
                                  S118626=0;
                                  if(!capLoaderReq_o.isPartnerPresent() || capLoaderReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 65, column: 5
                                    capLoaderReq_o.setREQ(false);//sysj\orchestrator.sysj line: 65, column: 5
                                    S118626=1;
                                    active[3]=1;
                                    ends[3]=1;
                                    tdone[3]=1;
                                  }
                                  else {
                                    S118621=0;
                                    if(capLoaderReq_o.isACK()){//sysj\orchestrator.sysj line: 65, column: 5
                                      capLoaderReq_o.setVal(true);//sysj\orchestrator.sysj line: 65, column: 5
                                      S118621=1;
                                      if(!capLoaderReq_o.isACK()){//sysj\orchestrator.sysj line: 65, column: 5
                                        capLoaderReq_o.setREQ(false);//sysj\orchestrator.sysj line: 65, column: 5
                                        ends[3]=2;
                                        ;//sysj\orchestrator.sysj line: 65, column: 5
                                        S118619=2;
                                        S118714=0;
                                        if(!capperReq_o.isPartnerPresent() || capperReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 66, column: 5
                                          capperReq_o.setREQ(false);//sysj\orchestrator.sysj line: 66, column: 5
                                          S118714=1;
                                          active[3]=1;
                                          ends[3]=1;
                                          tdone[3]=1;
                                        }
                                        else {
                                          S118709=0;
                                          if(capperReq_o.isACK()){//sysj\orchestrator.sysj line: 66, column: 5
                                            capperReq_o.setVal(true);//sysj\orchestrator.sysj line: 66, column: 5
                                            S118709=1;
                                            if(!capperReq_o.isACK()){//sysj\orchestrator.sysj line: 66, column: 5
                                              capperReq_o.setREQ(false);//sysj\orchestrator.sysj line: 66, column: 5
                                              ends[3]=2;
                                              ;//sysj\orchestrator.sysj line: 66, column: 5
                                              getNextBottle_1.setPresent();//sysj\orchestrator.sysj line: 67, column: 5
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
                            if(!fillerReq_o.isPartnerPresent() || fillerReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 70, column: 5
                              fillerReq_o.setREQ(false);//sysj\orchestrator.sysj line: 70, column: 5
                              S118846=1;
                              active[3]=1;
                              ends[3]=1;
                              tdone[3]=1;
                            }
                            else {
                              S118841=0;
                              if(fillerReq_o.isACK()){//sysj\orchestrator.sysj line: 70, column: 5
                                fillerReq_o.setVal(false);//sysj\orchestrator.sysj line: 70, column: 5
                                S118841=1;
                                if(!fillerReq_o.isACK()){//sysj\orchestrator.sysj line: 70, column: 5
                                  fillerReq_o.setREQ(false);//sysj\orchestrator.sysj line: 70, column: 5
                                  ends[3]=2;
                                  ;//sysj\orchestrator.sysj line: 70, column: 5
                                  S118950=1;
                                  S118868=0;
                                  if(!capLoaderReq_o.isPartnerPresent() || capLoaderReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 71, column: 5
                                    capLoaderReq_o.setREQ(false);//sysj\orchestrator.sysj line: 71, column: 5
                                    S118868=1;
                                    active[3]=1;
                                    ends[3]=1;
                                    tdone[3]=1;
                                  }
                                  else {
                                    S118863=0;
                                    if(capLoaderReq_o.isACK()){//sysj\orchestrator.sysj line: 71, column: 5
                                      capLoaderReq_o.setVal(false);//sysj\orchestrator.sysj line: 71, column: 5
                                      S118863=1;
                                      if(!capLoaderReq_o.isACK()){//sysj\orchestrator.sysj line: 71, column: 5
                                        capLoaderReq_o.setREQ(false);//sysj\orchestrator.sysj line: 71, column: 5
                                        ends[3]=2;
                                        ;//sysj\orchestrator.sysj line: 71, column: 5
                                        S118950=2;
                                        S118957=0;
                                        if(!capperReq_o.isPartnerPresent() || capperReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 72, column: 5
                                          capperReq_o.setREQ(false);//sysj\orchestrator.sysj line: 72, column: 5
                                          S118957=1;
                                          active[3]=1;
                                          ends[3]=1;
                                          tdone[3]=1;
                                        }
                                        else {
                                          S118952=0;
                                          if(capperReq_o.isACK()){//sysj\orchestrator.sysj line: 72, column: 5
                                            capperReq_o.setVal(false);//sysj\orchestrator.sysj line: 72, column: 5
                                            S118952=1;
                                            if(!capperReq_o.isACK()){//sysj\orchestrator.sysj line: 72, column: 5
                                              capperReq_o.setREQ(false);//sysj\orchestrator.sysj line: 72, column: 5
                                              ends[3]=2;
                                              ;//sysj\orchestrator.sysj line: 72, column: 5
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
                      if(rotaryStatus_in.isREQ()){//sysj\orchestrator.sysj line: 58, column: 4
                        rotaryStatus_in.setACK(false);//sysj\orchestrator.sysj line: 58, column: 4
                        ends[3]=2;
                        ;//sysj\orchestrator.sysj line: 58, column: 4
                        rotaryStat_thread_3 = (rotaryStatus_in.getVal() == null ? null : ((String)rotaryStatus_in.getVal()));//sysj\orchestrator.sysj line: 59, column: 4
                        S118574=1;
                        if(rotaryStat_thread_3 == "done"){//sysj\orchestrator.sysj line: 62, column: 7
                          S119083=0;
                          System.out.println("rotary done, sending filler,loader,screwer, conveyor reqs");//sysj\orchestrator.sysj line: 63, column: 5
                          S118619=0;
                          S118581=0;
                          if(!fillerReq_o.isPartnerPresent() || fillerReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 64, column: 5
                            fillerReq_o.setREQ(false);//sysj\orchestrator.sysj line: 64, column: 5
                            S118581=1;
                            active[3]=1;
                            ends[3]=1;
                            tdone[3]=1;
                          }
                          else {
                            S118576=0;
                            if(fillerReq_o.isACK()){//sysj\orchestrator.sysj line: 64, column: 5
                              fillerReq_o.setVal(true);//sysj\orchestrator.sysj line: 64, column: 5
                              S118576=1;
                              if(!fillerReq_o.isACK()){//sysj\orchestrator.sysj line: 64, column: 5
                                fillerReq_o.setREQ(false);//sysj\orchestrator.sysj line: 64, column: 5
                                ends[3]=2;
                                ;//sysj\orchestrator.sysj line: 64, column: 5
                                S118619=1;
                                S118626=0;
                                if(!capLoaderReq_o.isPartnerPresent() || capLoaderReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 65, column: 5
                                  capLoaderReq_o.setREQ(false);//sysj\orchestrator.sysj line: 65, column: 5
                                  S118626=1;
                                  active[3]=1;
                                  ends[3]=1;
                                  tdone[3]=1;
                                }
                                else {
                                  S118621=0;
                                  if(capLoaderReq_o.isACK()){//sysj\orchestrator.sysj line: 65, column: 5
                                    capLoaderReq_o.setVal(true);//sysj\orchestrator.sysj line: 65, column: 5
                                    S118621=1;
                                    if(!capLoaderReq_o.isACK()){//sysj\orchestrator.sysj line: 65, column: 5
                                      capLoaderReq_o.setREQ(false);//sysj\orchestrator.sysj line: 65, column: 5
                                      ends[3]=2;
                                      ;//sysj\orchestrator.sysj line: 65, column: 5
                                      S118619=2;
                                      S118714=0;
                                      if(!capperReq_o.isPartnerPresent() || capperReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 66, column: 5
                                        capperReq_o.setREQ(false);//sysj\orchestrator.sysj line: 66, column: 5
                                        S118714=1;
                                        active[3]=1;
                                        ends[3]=1;
                                        tdone[3]=1;
                                      }
                                      else {
                                        S118709=0;
                                        if(capperReq_o.isACK()){//sysj\orchestrator.sysj line: 66, column: 5
                                          capperReq_o.setVal(true);//sysj\orchestrator.sysj line: 66, column: 5
                                          S118709=1;
                                          if(!capperReq_o.isACK()){//sysj\orchestrator.sysj line: 66, column: 5
                                            capperReq_o.setREQ(false);//sysj\orchestrator.sysj line: 66, column: 5
                                            ends[3]=2;
                                            ;//sysj\orchestrator.sysj line: 66, column: 5
                                            getNextBottle_1.setPresent();//sysj\orchestrator.sysj line: 67, column: 5
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
                          if(!fillerReq_o.isPartnerPresent() || fillerReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 70, column: 5
                            fillerReq_o.setREQ(false);//sysj\orchestrator.sysj line: 70, column: 5
                            S118846=1;
                            active[3]=1;
                            ends[3]=1;
                            tdone[3]=1;
                          }
                          else {
                            S118841=0;
                            if(fillerReq_o.isACK()){//sysj\orchestrator.sysj line: 70, column: 5
                              fillerReq_o.setVal(false);//sysj\orchestrator.sysj line: 70, column: 5
                              S118841=1;
                              if(!fillerReq_o.isACK()){//sysj\orchestrator.sysj line: 70, column: 5
                                fillerReq_o.setREQ(false);//sysj\orchestrator.sysj line: 70, column: 5
                                ends[3]=2;
                                ;//sysj\orchestrator.sysj line: 70, column: 5
                                S118950=1;
                                S118868=0;
                                if(!capLoaderReq_o.isPartnerPresent() || capLoaderReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 71, column: 5
                                  capLoaderReq_o.setREQ(false);//sysj\orchestrator.sysj line: 71, column: 5
                                  S118868=1;
                                  active[3]=1;
                                  ends[3]=1;
                                  tdone[3]=1;
                                }
                                else {
                                  S118863=0;
                                  if(capLoaderReq_o.isACK()){//sysj\orchestrator.sysj line: 71, column: 5
                                    capLoaderReq_o.setVal(false);//sysj\orchestrator.sysj line: 71, column: 5
                                    S118863=1;
                                    if(!capLoaderReq_o.isACK()){//sysj\orchestrator.sysj line: 71, column: 5
                                      capLoaderReq_o.setREQ(false);//sysj\orchestrator.sysj line: 71, column: 5
                                      ends[3]=2;
                                      ;//sysj\orchestrator.sysj line: 71, column: 5
                                      S118950=2;
                                      S118957=0;
                                      if(!capperReq_o.isPartnerPresent() || capperReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 72, column: 5
                                        capperReq_o.setREQ(false);//sysj\orchestrator.sysj line: 72, column: 5
                                        S118957=1;
                                        active[3]=1;
                                        ends[3]=1;
                                        tdone[3]=1;
                                      }
                                      else {
                                        S118952=0;
                                        if(capperReq_o.isACK()){//sysj\orchestrator.sysj line: 72, column: 5
                                          capperReq_o.setVal(false);//sysj\orchestrator.sysj line: 72, column: 5
                                          S118952=1;
                                          if(!capperReq_o.isACK()){//sysj\orchestrator.sysj line: 72, column: 5
                                            capperReq_o.setREQ(false);//sysj\orchestrator.sysj line: 72, column: 5
                                            ends[3]=2;
                                            ;//sysj\orchestrator.sysj line: 72, column: 5
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
                if(!rotaryStatus_in.isPartnerPresent() || rotaryStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 58, column: 4
                  rotaryStatus_in.setACK(false);//sysj\orchestrator.sysj line: 58, column: 4
                  S118558=1;
                  active[3]=1;
                  ends[3]=1;
                  tdone[3]=1;
                }
                else {
                  S118553=0;
                  if(!rotaryStatus_in.isREQ()){//sysj\orchestrator.sysj line: 58, column: 4
                    rotaryStatus_in.setACK(true);//sysj\orchestrator.sysj line: 58, column: 4
                    S118553=1;
                    if(rotaryStatus_in.isREQ()){//sysj\orchestrator.sysj line: 58, column: 4
                      rotaryStatus_in.setACK(false);//sysj\orchestrator.sysj line: 58, column: 4
                      ends[3]=2;
                      ;//sysj\orchestrator.sysj line: 58, column: 4
                      rotaryStat_thread_3 = (rotaryStatus_in.getVal() == null ? null : ((String)rotaryStatus_in.getVal()));//sysj\orchestrator.sysj line: 59, column: 4
                      S118574=1;
                      if(rotaryStat_thread_3 == "done"){//sysj\orchestrator.sysj line: 62, column: 7
                        S119083=0;
                        System.out.println("rotary done, sending filler,loader,screwer, conveyor reqs");//sysj\orchestrator.sysj line: 63, column: 5
                        S118619=0;
                        S118581=0;
                        if(!fillerReq_o.isPartnerPresent() || fillerReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 64, column: 5
                          fillerReq_o.setREQ(false);//sysj\orchestrator.sysj line: 64, column: 5
                          S118581=1;
                          active[3]=1;
                          ends[3]=1;
                          tdone[3]=1;
                        }
                        else {
                          S118576=0;
                          if(fillerReq_o.isACK()){//sysj\orchestrator.sysj line: 64, column: 5
                            fillerReq_o.setVal(true);//sysj\orchestrator.sysj line: 64, column: 5
                            S118576=1;
                            if(!fillerReq_o.isACK()){//sysj\orchestrator.sysj line: 64, column: 5
                              fillerReq_o.setREQ(false);//sysj\orchestrator.sysj line: 64, column: 5
                              ends[3]=2;
                              ;//sysj\orchestrator.sysj line: 64, column: 5
                              S118619=1;
                              S118626=0;
                              if(!capLoaderReq_o.isPartnerPresent() || capLoaderReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 65, column: 5
                                capLoaderReq_o.setREQ(false);//sysj\orchestrator.sysj line: 65, column: 5
                                S118626=1;
                                active[3]=1;
                                ends[3]=1;
                                tdone[3]=1;
                              }
                              else {
                                S118621=0;
                                if(capLoaderReq_o.isACK()){//sysj\orchestrator.sysj line: 65, column: 5
                                  capLoaderReq_o.setVal(true);//sysj\orchestrator.sysj line: 65, column: 5
                                  S118621=1;
                                  if(!capLoaderReq_o.isACK()){//sysj\orchestrator.sysj line: 65, column: 5
                                    capLoaderReq_o.setREQ(false);//sysj\orchestrator.sysj line: 65, column: 5
                                    ends[3]=2;
                                    ;//sysj\orchestrator.sysj line: 65, column: 5
                                    S118619=2;
                                    S118714=0;
                                    if(!capperReq_o.isPartnerPresent() || capperReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 66, column: 5
                                      capperReq_o.setREQ(false);//sysj\orchestrator.sysj line: 66, column: 5
                                      S118714=1;
                                      active[3]=1;
                                      ends[3]=1;
                                      tdone[3]=1;
                                    }
                                    else {
                                      S118709=0;
                                      if(capperReq_o.isACK()){//sysj\orchestrator.sysj line: 66, column: 5
                                        capperReq_o.setVal(true);//sysj\orchestrator.sysj line: 66, column: 5
                                        S118709=1;
                                        if(!capperReq_o.isACK()){//sysj\orchestrator.sysj line: 66, column: 5
                                          capperReq_o.setREQ(false);//sysj\orchestrator.sysj line: 66, column: 5
                                          ends[3]=2;
                                          ;//sysj\orchestrator.sysj line: 66, column: 5
                                          getNextBottle_1.setPresent();//sysj\orchestrator.sysj line: 67, column: 5
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
                        if(!fillerReq_o.isPartnerPresent() || fillerReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 70, column: 5
                          fillerReq_o.setREQ(false);//sysj\orchestrator.sysj line: 70, column: 5
                          S118846=1;
                          active[3]=1;
                          ends[3]=1;
                          tdone[3]=1;
                        }
                        else {
                          S118841=0;
                          if(fillerReq_o.isACK()){//sysj\orchestrator.sysj line: 70, column: 5
                            fillerReq_o.setVal(false);//sysj\orchestrator.sysj line: 70, column: 5
                            S118841=1;
                            if(!fillerReq_o.isACK()){//sysj\orchestrator.sysj line: 70, column: 5
                              fillerReq_o.setREQ(false);//sysj\orchestrator.sysj line: 70, column: 5
                              ends[3]=2;
                              ;//sysj\orchestrator.sysj line: 70, column: 5
                              S118950=1;
                              S118868=0;
                              if(!capLoaderReq_o.isPartnerPresent() || capLoaderReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 71, column: 5
                                capLoaderReq_o.setREQ(false);//sysj\orchestrator.sysj line: 71, column: 5
                                S118868=1;
                                active[3]=1;
                                ends[3]=1;
                                tdone[3]=1;
                              }
                              else {
                                S118863=0;
                                if(capLoaderReq_o.isACK()){//sysj\orchestrator.sysj line: 71, column: 5
                                  capLoaderReq_o.setVal(false);//sysj\orchestrator.sysj line: 71, column: 5
                                  S118863=1;
                                  if(!capLoaderReq_o.isACK()){//sysj\orchestrator.sysj line: 71, column: 5
                                    capLoaderReq_o.setREQ(false);//sysj\orchestrator.sysj line: 71, column: 5
                                    ends[3]=2;
                                    ;//sysj\orchestrator.sysj line: 71, column: 5
                                    S118950=2;
                                    S118957=0;
                                    if(!capperReq_o.isPartnerPresent() || capperReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 72, column: 5
                                      capperReq_o.setREQ(false);//sysj\orchestrator.sysj line: 72, column: 5
                                      S118957=1;
                                      active[3]=1;
                                      ends[3]=1;
                                      tdone[3]=1;
                                    }
                                    else {
                                      S118952=0;
                                      if(capperReq_o.isACK()){//sysj\orchestrator.sysj line: 72, column: 5
                                        capperReq_o.setVal(false);//sysj\orchestrator.sysj line: 72, column: 5
                                        S118952=1;
                                        if(!capperReq_o.isACK()){//sysj\orchestrator.sysj line: 72, column: 5
                                          capperReq_o.setREQ(false);//sysj\orchestrator.sysj line: 72, column: 5
                                          ends[3]=2;
                                          ;//sysj\orchestrator.sysj line: 72, column: 5
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
                        if(!fillerReq_o.isPartnerPresent() || fillerReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 64, column: 5
                          fillerReq_o.setREQ(false);//sysj\orchestrator.sysj line: 64, column: 5
                          S118581=1;
                          active[3]=1;
                          ends[3]=1;
                          tdone[3]=1;
                        }
                        else {
                          switch(S118576){
                            case 0 : 
                              if(fillerReq_o.isACK()){//sysj\orchestrator.sysj line: 64, column: 5
                                fillerReq_o.setVal(true);//sysj\orchestrator.sysj line: 64, column: 5
                                S118576=1;
                                if(!fillerReq_o.isACK()){//sysj\orchestrator.sysj line: 64, column: 5
                                  fillerReq_o.setREQ(false);//sysj\orchestrator.sysj line: 64, column: 5
                                  ends[3]=2;
                                  ;//sysj\orchestrator.sysj line: 64, column: 5
                                  S118619=1;
                                  S118626=0;
                                  if(!capLoaderReq_o.isPartnerPresent() || capLoaderReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 65, column: 5
                                    capLoaderReq_o.setREQ(false);//sysj\orchestrator.sysj line: 65, column: 5
                                    S118626=1;
                                    active[3]=1;
                                    ends[3]=1;
                                    tdone[3]=1;
                                  }
                                  else {
                                    S118621=0;
                                    if(capLoaderReq_o.isACK()){//sysj\orchestrator.sysj line: 65, column: 5
                                      capLoaderReq_o.setVal(true);//sysj\orchestrator.sysj line: 65, column: 5
                                      S118621=1;
                                      if(!capLoaderReq_o.isACK()){//sysj\orchestrator.sysj line: 65, column: 5
                                        capLoaderReq_o.setREQ(false);//sysj\orchestrator.sysj line: 65, column: 5
                                        ends[3]=2;
                                        ;//sysj\orchestrator.sysj line: 65, column: 5
                                        S118619=2;
                                        S118714=0;
                                        if(!capperReq_o.isPartnerPresent() || capperReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 66, column: 5
                                          capperReq_o.setREQ(false);//sysj\orchestrator.sysj line: 66, column: 5
                                          S118714=1;
                                          active[3]=1;
                                          ends[3]=1;
                                          tdone[3]=1;
                                        }
                                        else {
                                          S118709=0;
                                          if(capperReq_o.isACK()){//sysj\orchestrator.sysj line: 66, column: 5
                                            capperReq_o.setVal(true);//sysj\orchestrator.sysj line: 66, column: 5
                                            S118709=1;
                                            if(!capperReq_o.isACK()){//sysj\orchestrator.sysj line: 66, column: 5
                                              capperReq_o.setREQ(false);//sysj\orchestrator.sysj line: 66, column: 5
                                              ends[3]=2;
                                              ;//sysj\orchestrator.sysj line: 66, column: 5
                                              getNextBottle_1.setPresent();//sysj\orchestrator.sysj line: 67, column: 5
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
                              if(!fillerReq_o.isACK()){//sysj\orchestrator.sysj line: 64, column: 5
                                fillerReq_o.setREQ(false);//sysj\orchestrator.sysj line: 64, column: 5
                                ends[3]=2;
                                ;//sysj\orchestrator.sysj line: 64, column: 5
                                S118619=1;
                                S118626=0;
                                if(!capLoaderReq_o.isPartnerPresent() || capLoaderReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 65, column: 5
                                  capLoaderReq_o.setREQ(false);//sysj\orchestrator.sysj line: 65, column: 5
                                  S118626=1;
                                  active[3]=1;
                                  ends[3]=1;
                                  tdone[3]=1;
                                }
                                else {
                                  S118621=0;
                                  if(capLoaderReq_o.isACK()){//sysj\orchestrator.sysj line: 65, column: 5
                                    capLoaderReq_o.setVal(true);//sysj\orchestrator.sysj line: 65, column: 5
                                    S118621=1;
                                    if(!capLoaderReq_o.isACK()){//sysj\orchestrator.sysj line: 65, column: 5
                                      capLoaderReq_o.setREQ(false);//sysj\orchestrator.sysj line: 65, column: 5
                                      ends[3]=2;
                                      ;//sysj\orchestrator.sysj line: 65, column: 5
                                      S118619=2;
                                      S118714=0;
                                      if(!capperReq_o.isPartnerPresent() || capperReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 66, column: 5
                                        capperReq_o.setREQ(false);//sysj\orchestrator.sysj line: 66, column: 5
                                        S118714=1;
                                        active[3]=1;
                                        ends[3]=1;
                                        tdone[3]=1;
                                      }
                                      else {
                                        S118709=0;
                                        if(capperReq_o.isACK()){//sysj\orchestrator.sysj line: 66, column: 5
                                          capperReq_o.setVal(true);//sysj\orchestrator.sysj line: 66, column: 5
                                          S118709=1;
                                          if(!capperReq_o.isACK()){//sysj\orchestrator.sysj line: 66, column: 5
                                            capperReq_o.setREQ(false);//sysj\orchestrator.sysj line: 66, column: 5
                                            ends[3]=2;
                                            ;//sysj\orchestrator.sysj line: 66, column: 5
                                            getNextBottle_1.setPresent();//sysj\orchestrator.sysj line: 67, column: 5
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
                        if(!fillerReq_o.isPartnerPresent() || fillerReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 64, column: 5
                          fillerReq_o.setREQ(false);//sysj\orchestrator.sysj line: 64, column: 5
                          S118581=1;
                          active[3]=1;
                          ends[3]=1;
                          tdone[3]=1;
                        }
                        else {
                          S118576=0;
                          if(fillerReq_o.isACK()){//sysj\orchestrator.sysj line: 64, column: 5
                            fillerReq_o.setVal(true);//sysj\orchestrator.sysj line: 64, column: 5
                            S118576=1;
                            if(!fillerReq_o.isACK()){//sysj\orchestrator.sysj line: 64, column: 5
                              fillerReq_o.setREQ(false);//sysj\orchestrator.sysj line: 64, column: 5
                              ends[3]=2;
                              ;//sysj\orchestrator.sysj line: 64, column: 5
                              S118619=1;
                              S118626=0;
                              if(!capLoaderReq_o.isPartnerPresent() || capLoaderReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 65, column: 5
                                capLoaderReq_o.setREQ(false);//sysj\orchestrator.sysj line: 65, column: 5
                                S118626=1;
                                active[3]=1;
                                ends[3]=1;
                                tdone[3]=1;
                              }
                              else {
                                S118621=0;
                                if(capLoaderReq_o.isACK()){//sysj\orchestrator.sysj line: 65, column: 5
                                  capLoaderReq_o.setVal(true);//sysj\orchestrator.sysj line: 65, column: 5
                                  S118621=1;
                                  if(!capLoaderReq_o.isACK()){//sysj\orchestrator.sysj line: 65, column: 5
                                    capLoaderReq_o.setREQ(false);//sysj\orchestrator.sysj line: 65, column: 5
                                    ends[3]=2;
                                    ;//sysj\orchestrator.sysj line: 65, column: 5
                                    S118619=2;
                                    S118714=0;
                                    if(!capperReq_o.isPartnerPresent() || capperReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 66, column: 5
                                      capperReq_o.setREQ(false);//sysj\orchestrator.sysj line: 66, column: 5
                                      S118714=1;
                                      active[3]=1;
                                      ends[3]=1;
                                      tdone[3]=1;
                                    }
                                    else {
                                      S118709=0;
                                      if(capperReq_o.isACK()){//sysj\orchestrator.sysj line: 66, column: 5
                                        capperReq_o.setVal(true);//sysj\orchestrator.sysj line: 66, column: 5
                                        S118709=1;
                                        if(!capperReq_o.isACK()){//sysj\orchestrator.sysj line: 66, column: 5
                                          capperReq_o.setREQ(false);//sysj\orchestrator.sysj line: 66, column: 5
                                          ends[3]=2;
                                          ;//sysj\orchestrator.sysj line: 66, column: 5
                                          getNextBottle_1.setPresent();//sysj\orchestrator.sysj line: 67, column: 5
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
                        if(!capLoaderReq_o.isPartnerPresent() || capLoaderReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 65, column: 5
                          capLoaderReq_o.setREQ(false);//sysj\orchestrator.sysj line: 65, column: 5
                          S118626=1;
                          active[3]=1;
                          ends[3]=1;
                          tdone[3]=1;
                        }
                        else {
                          switch(S118621){
                            case 0 : 
                              if(capLoaderReq_o.isACK()){//sysj\orchestrator.sysj line: 65, column: 5
                                capLoaderReq_o.setVal(true);//sysj\orchestrator.sysj line: 65, column: 5
                                S118621=1;
                                if(!capLoaderReq_o.isACK()){//sysj\orchestrator.sysj line: 65, column: 5
                                  capLoaderReq_o.setREQ(false);//sysj\orchestrator.sysj line: 65, column: 5
                                  ends[3]=2;
                                  ;//sysj\orchestrator.sysj line: 65, column: 5
                                  S118619=2;
                                  S118714=0;
                                  if(!capperReq_o.isPartnerPresent() || capperReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 66, column: 5
                                    capperReq_o.setREQ(false);//sysj\orchestrator.sysj line: 66, column: 5
                                    S118714=1;
                                    active[3]=1;
                                    ends[3]=1;
                                    tdone[3]=1;
                                  }
                                  else {
                                    S118709=0;
                                    if(capperReq_o.isACK()){//sysj\orchestrator.sysj line: 66, column: 5
                                      capperReq_o.setVal(true);//sysj\orchestrator.sysj line: 66, column: 5
                                      S118709=1;
                                      if(!capperReq_o.isACK()){//sysj\orchestrator.sysj line: 66, column: 5
                                        capperReq_o.setREQ(false);//sysj\orchestrator.sysj line: 66, column: 5
                                        ends[3]=2;
                                        ;//sysj\orchestrator.sysj line: 66, column: 5
                                        getNextBottle_1.setPresent();//sysj\orchestrator.sysj line: 67, column: 5
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
                              if(!capLoaderReq_o.isACK()){//sysj\orchestrator.sysj line: 65, column: 5
                                capLoaderReq_o.setREQ(false);//sysj\orchestrator.sysj line: 65, column: 5
                                ends[3]=2;
                                ;//sysj\orchestrator.sysj line: 65, column: 5
                                S118619=2;
                                S118714=0;
                                if(!capperReq_o.isPartnerPresent() || capperReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 66, column: 5
                                  capperReq_o.setREQ(false);//sysj\orchestrator.sysj line: 66, column: 5
                                  S118714=1;
                                  active[3]=1;
                                  ends[3]=1;
                                  tdone[3]=1;
                                }
                                else {
                                  S118709=0;
                                  if(capperReq_o.isACK()){//sysj\orchestrator.sysj line: 66, column: 5
                                    capperReq_o.setVal(true);//sysj\orchestrator.sysj line: 66, column: 5
                                    S118709=1;
                                    if(!capperReq_o.isACK()){//sysj\orchestrator.sysj line: 66, column: 5
                                      capperReq_o.setREQ(false);//sysj\orchestrator.sysj line: 66, column: 5
                                      ends[3]=2;
                                      ;//sysj\orchestrator.sysj line: 66, column: 5
                                      getNextBottle_1.setPresent();//sysj\orchestrator.sysj line: 67, column: 5
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
                        if(!capLoaderReq_o.isPartnerPresent() || capLoaderReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 65, column: 5
                          capLoaderReq_o.setREQ(false);//sysj\orchestrator.sysj line: 65, column: 5
                          S118626=1;
                          active[3]=1;
                          ends[3]=1;
                          tdone[3]=1;
                        }
                        else {
                          S118621=0;
                          if(capLoaderReq_o.isACK()){//sysj\orchestrator.sysj line: 65, column: 5
                            capLoaderReq_o.setVal(true);//sysj\orchestrator.sysj line: 65, column: 5
                            S118621=1;
                            if(!capLoaderReq_o.isACK()){//sysj\orchestrator.sysj line: 65, column: 5
                              capLoaderReq_o.setREQ(false);//sysj\orchestrator.sysj line: 65, column: 5
                              ends[3]=2;
                              ;//sysj\orchestrator.sysj line: 65, column: 5
                              S118619=2;
                              S118714=0;
                              if(!capperReq_o.isPartnerPresent() || capperReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 66, column: 5
                                capperReq_o.setREQ(false);//sysj\orchestrator.sysj line: 66, column: 5
                                S118714=1;
                                active[3]=1;
                                ends[3]=1;
                                tdone[3]=1;
                              }
                              else {
                                S118709=0;
                                if(capperReq_o.isACK()){//sysj\orchestrator.sysj line: 66, column: 5
                                  capperReq_o.setVal(true);//sysj\orchestrator.sysj line: 66, column: 5
                                  S118709=1;
                                  if(!capperReq_o.isACK()){//sysj\orchestrator.sysj line: 66, column: 5
                                    capperReq_o.setREQ(false);//sysj\orchestrator.sysj line: 66, column: 5
                                    ends[3]=2;
                                    ;//sysj\orchestrator.sysj line: 66, column: 5
                                    getNextBottle_1.setPresent();//sysj\orchestrator.sysj line: 67, column: 5
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
                        if(!capperReq_o.isPartnerPresent() || capperReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 66, column: 5
                          capperReq_o.setREQ(false);//sysj\orchestrator.sysj line: 66, column: 5
                          S118714=1;
                          active[3]=1;
                          ends[3]=1;
                          tdone[3]=1;
                        }
                        else {
                          switch(S118709){
                            case 0 : 
                              if(capperReq_o.isACK()){//sysj\orchestrator.sysj line: 66, column: 5
                                capperReq_o.setVal(true);//sysj\orchestrator.sysj line: 66, column: 5
                                S118709=1;
                                if(!capperReq_o.isACK()){//sysj\orchestrator.sysj line: 66, column: 5
                                  capperReq_o.setREQ(false);//sysj\orchestrator.sysj line: 66, column: 5
                                  ends[3]=2;
                                  ;//sysj\orchestrator.sysj line: 66, column: 5
                                  getNextBottle_1.setPresent();//sysj\orchestrator.sysj line: 67, column: 5
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
                              if(!capperReq_o.isACK()){//sysj\orchestrator.sysj line: 66, column: 5
                                capperReq_o.setREQ(false);//sysj\orchestrator.sysj line: 66, column: 5
                                ends[3]=2;
                                ;//sysj\orchestrator.sysj line: 66, column: 5
                                getNextBottle_1.setPresent();//sysj\orchestrator.sysj line: 67, column: 5
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
                        if(!capperReq_o.isPartnerPresent() || capperReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 66, column: 5
                          capperReq_o.setREQ(false);//sysj\orchestrator.sysj line: 66, column: 5
                          S118714=1;
                          active[3]=1;
                          ends[3]=1;
                          tdone[3]=1;
                        }
                        else {
                          S118709=0;
                          if(capperReq_o.isACK()){//sysj\orchestrator.sysj line: 66, column: 5
                            capperReq_o.setVal(true);//sysj\orchestrator.sysj line: 66, column: 5
                            S118709=1;
                            if(!capperReq_o.isACK()){//sysj\orchestrator.sysj line: 66, column: 5
                              capperReq_o.setREQ(false);//sysj\orchestrator.sysj line: 66, column: 5
                              ends[3]=2;
                              ;//sysj\orchestrator.sysj line: 66, column: 5
                              getNextBottle_1.setPresent();//sysj\orchestrator.sysj line: 67, column: 5
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
                        if(!fillerReq_o.isPartnerPresent() || fillerReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 70, column: 5
                          fillerReq_o.setREQ(false);//sysj\orchestrator.sysj line: 70, column: 5
                          S118846=1;
                          active[3]=1;
                          ends[3]=1;
                          tdone[3]=1;
                        }
                        else {
                          switch(S118841){
                            case 0 : 
                              if(fillerReq_o.isACK()){//sysj\orchestrator.sysj line: 70, column: 5
                                fillerReq_o.setVal(false);//sysj\orchestrator.sysj line: 70, column: 5
                                S118841=1;
                                if(!fillerReq_o.isACK()){//sysj\orchestrator.sysj line: 70, column: 5
                                  fillerReq_o.setREQ(false);//sysj\orchestrator.sysj line: 70, column: 5
                                  ends[3]=2;
                                  ;//sysj\orchestrator.sysj line: 70, column: 5
                                  S118950=1;
                                  S118868=0;
                                  if(!capLoaderReq_o.isPartnerPresent() || capLoaderReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 71, column: 5
                                    capLoaderReq_o.setREQ(false);//sysj\orchestrator.sysj line: 71, column: 5
                                    S118868=1;
                                    active[3]=1;
                                    ends[3]=1;
                                    tdone[3]=1;
                                  }
                                  else {
                                    S118863=0;
                                    if(capLoaderReq_o.isACK()){//sysj\orchestrator.sysj line: 71, column: 5
                                      capLoaderReq_o.setVal(false);//sysj\orchestrator.sysj line: 71, column: 5
                                      S118863=1;
                                      if(!capLoaderReq_o.isACK()){//sysj\orchestrator.sysj line: 71, column: 5
                                        capLoaderReq_o.setREQ(false);//sysj\orchestrator.sysj line: 71, column: 5
                                        ends[3]=2;
                                        ;//sysj\orchestrator.sysj line: 71, column: 5
                                        S118950=2;
                                        S118957=0;
                                        if(!capperReq_o.isPartnerPresent() || capperReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 72, column: 5
                                          capperReq_o.setREQ(false);//sysj\orchestrator.sysj line: 72, column: 5
                                          S118957=1;
                                          active[3]=1;
                                          ends[3]=1;
                                          tdone[3]=1;
                                        }
                                        else {
                                          S118952=0;
                                          if(capperReq_o.isACK()){//sysj\orchestrator.sysj line: 72, column: 5
                                            capperReq_o.setVal(false);//sysj\orchestrator.sysj line: 72, column: 5
                                            S118952=1;
                                            if(!capperReq_o.isACK()){//sysj\orchestrator.sysj line: 72, column: 5
                                              capperReq_o.setREQ(false);//sysj\orchestrator.sysj line: 72, column: 5
                                              ends[3]=2;
                                              ;//sysj\orchestrator.sysj line: 72, column: 5
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
                              if(!fillerReq_o.isACK()){//sysj\orchestrator.sysj line: 70, column: 5
                                fillerReq_o.setREQ(false);//sysj\orchestrator.sysj line: 70, column: 5
                                ends[3]=2;
                                ;//sysj\orchestrator.sysj line: 70, column: 5
                                S118950=1;
                                S118868=0;
                                if(!capLoaderReq_o.isPartnerPresent() || capLoaderReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 71, column: 5
                                  capLoaderReq_o.setREQ(false);//sysj\orchestrator.sysj line: 71, column: 5
                                  S118868=1;
                                  active[3]=1;
                                  ends[3]=1;
                                  tdone[3]=1;
                                }
                                else {
                                  S118863=0;
                                  if(capLoaderReq_o.isACK()){//sysj\orchestrator.sysj line: 71, column: 5
                                    capLoaderReq_o.setVal(false);//sysj\orchestrator.sysj line: 71, column: 5
                                    S118863=1;
                                    if(!capLoaderReq_o.isACK()){//sysj\orchestrator.sysj line: 71, column: 5
                                      capLoaderReq_o.setREQ(false);//sysj\orchestrator.sysj line: 71, column: 5
                                      ends[3]=2;
                                      ;//sysj\orchestrator.sysj line: 71, column: 5
                                      S118950=2;
                                      S118957=0;
                                      if(!capperReq_o.isPartnerPresent() || capperReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 72, column: 5
                                        capperReq_o.setREQ(false);//sysj\orchestrator.sysj line: 72, column: 5
                                        S118957=1;
                                        active[3]=1;
                                        ends[3]=1;
                                        tdone[3]=1;
                                      }
                                      else {
                                        S118952=0;
                                        if(capperReq_o.isACK()){//sysj\orchestrator.sysj line: 72, column: 5
                                          capperReq_o.setVal(false);//sysj\orchestrator.sysj line: 72, column: 5
                                          S118952=1;
                                          if(!capperReq_o.isACK()){//sysj\orchestrator.sysj line: 72, column: 5
                                            capperReq_o.setREQ(false);//sysj\orchestrator.sysj line: 72, column: 5
                                            ends[3]=2;
                                            ;//sysj\orchestrator.sysj line: 72, column: 5
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
                        if(!fillerReq_o.isPartnerPresent() || fillerReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 70, column: 5
                          fillerReq_o.setREQ(false);//sysj\orchestrator.sysj line: 70, column: 5
                          S118846=1;
                          active[3]=1;
                          ends[3]=1;
                          tdone[3]=1;
                        }
                        else {
                          S118841=0;
                          if(fillerReq_o.isACK()){//sysj\orchestrator.sysj line: 70, column: 5
                            fillerReq_o.setVal(false);//sysj\orchestrator.sysj line: 70, column: 5
                            S118841=1;
                            if(!fillerReq_o.isACK()){//sysj\orchestrator.sysj line: 70, column: 5
                              fillerReq_o.setREQ(false);//sysj\orchestrator.sysj line: 70, column: 5
                              ends[3]=2;
                              ;//sysj\orchestrator.sysj line: 70, column: 5
                              S118950=1;
                              S118868=0;
                              if(!capLoaderReq_o.isPartnerPresent() || capLoaderReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 71, column: 5
                                capLoaderReq_o.setREQ(false);//sysj\orchestrator.sysj line: 71, column: 5
                                S118868=1;
                                active[3]=1;
                                ends[3]=1;
                                tdone[3]=1;
                              }
                              else {
                                S118863=0;
                                if(capLoaderReq_o.isACK()){//sysj\orchestrator.sysj line: 71, column: 5
                                  capLoaderReq_o.setVal(false);//sysj\orchestrator.sysj line: 71, column: 5
                                  S118863=1;
                                  if(!capLoaderReq_o.isACK()){//sysj\orchestrator.sysj line: 71, column: 5
                                    capLoaderReq_o.setREQ(false);//sysj\orchestrator.sysj line: 71, column: 5
                                    ends[3]=2;
                                    ;//sysj\orchestrator.sysj line: 71, column: 5
                                    S118950=2;
                                    S118957=0;
                                    if(!capperReq_o.isPartnerPresent() || capperReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 72, column: 5
                                      capperReq_o.setREQ(false);//sysj\orchestrator.sysj line: 72, column: 5
                                      S118957=1;
                                      active[3]=1;
                                      ends[3]=1;
                                      tdone[3]=1;
                                    }
                                    else {
                                      S118952=0;
                                      if(capperReq_o.isACK()){//sysj\orchestrator.sysj line: 72, column: 5
                                        capperReq_o.setVal(false);//sysj\orchestrator.sysj line: 72, column: 5
                                        S118952=1;
                                        if(!capperReq_o.isACK()){//sysj\orchestrator.sysj line: 72, column: 5
                                          capperReq_o.setREQ(false);//sysj\orchestrator.sysj line: 72, column: 5
                                          ends[3]=2;
                                          ;//sysj\orchestrator.sysj line: 72, column: 5
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
                        if(!capLoaderReq_o.isPartnerPresent() || capLoaderReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 71, column: 5
                          capLoaderReq_o.setREQ(false);//sysj\orchestrator.sysj line: 71, column: 5
                          S118868=1;
                          active[3]=1;
                          ends[3]=1;
                          tdone[3]=1;
                        }
                        else {
                          switch(S118863){
                            case 0 : 
                              if(capLoaderReq_o.isACK()){//sysj\orchestrator.sysj line: 71, column: 5
                                capLoaderReq_o.setVal(false);//sysj\orchestrator.sysj line: 71, column: 5
                                S118863=1;
                                if(!capLoaderReq_o.isACK()){//sysj\orchestrator.sysj line: 71, column: 5
                                  capLoaderReq_o.setREQ(false);//sysj\orchestrator.sysj line: 71, column: 5
                                  ends[3]=2;
                                  ;//sysj\orchestrator.sysj line: 71, column: 5
                                  S118950=2;
                                  S118957=0;
                                  if(!capperReq_o.isPartnerPresent() || capperReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 72, column: 5
                                    capperReq_o.setREQ(false);//sysj\orchestrator.sysj line: 72, column: 5
                                    S118957=1;
                                    active[3]=1;
                                    ends[3]=1;
                                    tdone[3]=1;
                                  }
                                  else {
                                    S118952=0;
                                    if(capperReq_o.isACK()){//sysj\orchestrator.sysj line: 72, column: 5
                                      capperReq_o.setVal(false);//sysj\orchestrator.sysj line: 72, column: 5
                                      S118952=1;
                                      if(!capperReq_o.isACK()){//sysj\orchestrator.sysj line: 72, column: 5
                                        capperReq_o.setREQ(false);//sysj\orchestrator.sysj line: 72, column: 5
                                        ends[3]=2;
                                        ;//sysj\orchestrator.sysj line: 72, column: 5
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
                              if(!capLoaderReq_o.isACK()){//sysj\orchestrator.sysj line: 71, column: 5
                                capLoaderReq_o.setREQ(false);//sysj\orchestrator.sysj line: 71, column: 5
                                ends[3]=2;
                                ;//sysj\orchestrator.sysj line: 71, column: 5
                                S118950=2;
                                S118957=0;
                                if(!capperReq_o.isPartnerPresent() || capperReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 72, column: 5
                                  capperReq_o.setREQ(false);//sysj\orchestrator.sysj line: 72, column: 5
                                  S118957=1;
                                  active[3]=1;
                                  ends[3]=1;
                                  tdone[3]=1;
                                }
                                else {
                                  S118952=0;
                                  if(capperReq_o.isACK()){//sysj\orchestrator.sysj line: 72, column: 5
                                    capperReq_o.setVal(false);//sysj\orchestrator.sysj line: 72, column: 5
                                    S118952=1;
                                    if(!capperReq_o.isACK()){//sysj\orchestrator.sysj line: 72, column: 5
                                      capperReq_o.setREQ(false);//sysj\orchestrator.sysj line: 72, column: 5
                                      ends[3]=2;
                                      ;//sysj\orchestrator.sysj line: 72, column: 5
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
                        if(!capLoaderReq_o.isPartnerPresent() || capLoaderReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 71, column: 5
                          capLoaderReq_o.setREQ(false);//sysj\orchestrator.sysj line: 71, column: 5
                          S118868=1;
                          active[3]=1;
                          ends[3]=1;
                          tdone[3]=1;
                        }
                        else {
                          S118863=0;
                          if(capLoaderReq_o.isACK()){//sysj\orchestrator.sysj line: 71, column: 5
                            capLoaderReq_o.setVal(false);//sysj\orchestrator.sysj line: 71, column: 5
                            S118863=1;
                            if(!capLoaderReq_o.isACK()){//sysj\orchestrator.sysj line: 71, column: 5
                              capLoaderReq_o.setREQ(false);//sysj\orchestrator.sysj line: 71, column: 5
                              ends[3]=2;
                              ;//sysj\orchestrator.sysj line: 71, column: 5
                              S118950=2;
                              S118957=0;
                              if(!capperReq_o.isPartnerPresent() || capperReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 72, column: 5
                                capperReq_o.setREQ(false);//sysj\orchestrator.sysj line: 72, column: 5
                                S118957=1;
                                active[3]=1;
                                ends[3]=1;
                                tdone[3]=1;
                              }
                              else {
                                S118952=0;
                                if(capperReq_o.isACK()){//sysj\orchestrator.sysj line: 72, column: 5
                                  capperReq_o.setVal(false);//sysj\orchestrator.sysj line: 72, column: 5
                                  S118952=1;
                                  if(!capperReq_o.isACK()){//sysj\orchestrator.sysj line: 72, column: 5
                                    capperReq_o.setREQ(false);//sysj\orchestrator.sysj line: 72, column: 5
                                    ends[3]=2;
                                    ;//sysj\orchestrator.sysj line: 72, column: 5
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
                        if(!capperReq_o.isPartnerPresent() || capperReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 72, column: 5
                          capperReq_o.setREQ(false);//sysj\orchestrator.sysj line: 72, column: 5
                          S118957=1;
                          active[3]=1;
                          ends[3]=1;
                          tdone[3]=1;
                        }
                        else {
                          switch(S118952){
                            case 0 : 
                              if(capperReq_o.isACK()){//sysj\orchestrator.sysj line: 72, column: 5
                                capperReq_o.setVal(false);//sysj\orchestrator.sysj line: 72, column: 5
                                S118952=1;
                                if(!capperReq_o.isACK()){//sysj\orchestrator.sysj line: 72, column: 5
                                  capperReq_o.setREQ(false);//sysj\orchestrator.sysj line: 72, column: 5
                                  ends[3]=2;
                                  ;//sysj\orchestrator.sysj line: 72, column: 5
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
                              if(!capperReq_o.isACK()){//sysj\orchestrator.sysj line: 72, column: 5
                                capperReq_o.setREQ(false);//sysj\orchestrator.sysj line: 72, column: 5
                                ends[3]=2;
                                ;//sysj\orchestrator.sysj line: 72, column: 5
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
                        if(!capperReq_o.isPartnerPresent() || capperReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 72, column: 5
                          capperReq_o.setREQ(false);//sysj\orchestrator.sysj line: 72, column: 5
                          S118957=1;
                          active[3]=1;
                          ends[3]=1;
                          tdone[3]=1;
                        }
                        else {
                          S118952=0;
                          if(capperReq_o.isACK()){//sysj\orchestrator.sysj line: 72, column: 5
                            capperReq_o.setVal(false);//sysj\orchestrator.sysj line: 72, column: 5
                            S118952=1;
                            if(!capperReq_o.isACK()){//sysj\orchestrator.sysj line: 72, column: 5
                              capperReq_o.setREQ(false);//sysj\orchestrator.sysj line: 72, column: 5
                              ends[3]=2;
                              ;//sysj\orchestrator.sysj line: 72, column: 5
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
            if(!rotaryStatus_in.isPartnerPresent() || rotaryStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 58, column: 4
              rotaryStatus_in.setACK(false);//sysj\orchestrator.sysj line: 58, column: 4
              S118558=1;
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            else {
              S118553=0;
              if(!rotaryStatus_in.isREQ()){//sysj\orchestrator.sysj line: 58, column: 4
                rotaryStatus_in.setACK(true);//sysj\orchestrator.sysj line: 58, column: 4
                S118553=1;
                if(rotaryStatus_in.isREQ()){//sysj\orchestrator.sysj line: 58, column: 4
                  rotaryStatus_in.setACK(false);//sysj\orchestrator.sysj line: 58, column: 4
                  ends[3]=2;
                  ;//sysj\orchestrator.sysj line: 58, column: 4
                  rotaryStat_thread_3 = (rotaryStatus_in.getVal() == null ? null : ((String)rotaryStatus_in.getVal()));//sysj\orchestrator.sysj line: 59, column: 4
                  S118574=1;
                  if(rotaryStat_thread_3 == "done"){//sysj\orchestrator.sysj line: 62, column: 7
                    S119083=0;
                    System.out.println("rotary done, sending filler,loader,screwer, conveyor reqs");//sysj\orchestrator.sysj line: 63, column: 5
                    S118619=0;
                    S118581=0;
                    if(!fillerReq_o.isPartnerPresent() || fillerReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 64, column: 5
                      fillerReq_o.setREQ(false);//sysj\orchestrator.sysj line: 64, column: 5
                      S118581=1;
                      active[3]=1;
                      ends[3]=1;
                      tdone[3]=1;
                    }
                    else {
                      S118576=0;
                      if(fillerReq_o.isACK()){//sysj\orchestrator.sysj line: 64, column: 5
                        fillerReq_o.setVal(true);//sysj\orchestrator.sysj line: 64, column: 5
                        S118576=1;
                        if(!fillerReq_o.isACK()){//sysj\orchestrator.sysj line: 64, column: 5
                          fillerReq_o.setREQ(false);//sysj\orchestrator.sysj line: 64, column: 5
                          ends[3]=2;
                          ;//sysj\orchestrator.sysj line: 64, column: 5
                          S118619=1;
                          S118626=0;
                          if(!capLoaderReq_o.isPartnerPresent() || capLoaderReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 65, column: 5
                            capLoaderReq_o.setREQ(false);//sysj\orchestrator.sysj line: 65, column: 5
                            S118626=1;
                            active[3]=1;
                            ends[3]=1;
                            tdone[3]=1;
                          }
                          else {
                            S118621=0;
                            if(capLoaderReq_o.isACK()){//sysj\orchestrator.sysj line: 65, column: 5
                              capLoaderReq_o.setVal(true);//sysj\orchestrator.sysj line: 65, column: 5
                              S118621=1;
                              if(!capLoaderReq_o.isACK()){//sysj\orchestrator.sysj line: 65, column: 5
                                capLoaderReq_o.setREQ(false);//sysj\orchestrator.sysj line: 65, column: 5
                                ends[3]=2;
                                ;//sysj\orchestrator.sysj line: 65, column: 5
                                S118619=2;
                                S118714=0;
                                if(!capperReq_o.isPartnerPresent() || capperReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 66, column: 5
                                  capperReq_o.setREQ(false);//sysj\orchestrator.sysj line: 66, column: 5
                                  S118714=1;
                                  active[3]=1;
                                  ends[3]=1;
                                  tdone[3]=1;
                                }
                                else {
                                  S118709=0;
                                  if(capperReq_o.isACK()){//sysj\orchestrator.sysj line: 66, column: 5
                                    capperReq_o.setVal(true);//sysj\orchestrator.sysj line: 66, column: 5
                                    S118709=1;
                                    if(!capperReq_o.isACK()){//sysj\orchestrator.sysj line: 66, column: 5
                                      capperReq_o.setREQ(false);//sysj\orchestrator.sysj line: 66, column: 5
                                      ends[3]=2;
                                      ;//sysj\orchestrator.sysj line: 66, column: 5
                                      getNextBottle_1.setPresent();//sysj\orchestrator.sysj line: 67, column: 5
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
                    if(!fillerReq_o.isPartnerPresent() || fillerReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 70, column: 5
                      fillerReq_o.setREQ(false);//sysj\orchestrator.sysj line: 70, column: 5
                      S118846=1;
                      active[3]=1;
                      ends[3]=1;
                      tdone[3]=1;
                    }
                    else {
                      S118841=0;
                      if(fillerReq_o.isACK()){//sysj\orchestrator.sysj line: 70, column: 5
                        fillerReq_o.setVal(false);//sysj\orchestrator.sysj line: 70, column: 5
                        S118841=1;
                        if(!fillerReq_o.isACK()){//sysj\orchestrator.sysj line: 70, column: 5
                          fillerReq_o.setREQ(false);//sysj\orchestrator.sysj line: 70, column: 5
                          ends[3]=2;
                          ;//sysj\orchestrator.sysj line: 70, column: 5
                          S118950=1;
                          S118868=0;
                          if(!capLoaderReq_o.isPartnerPresent() || capLoaderReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 71, column: 5
                            capLoaderReq_o.setREQ(false);//sysj\orchestrator.sysj line: 71, column: 5
                            S118868=1;
                            active[3]=1;
                            ends[3]=1;
                            tdone[3]=1;
                          }
                          else {
                            S118863=0;
                            if(capLoaderReq_o.isACK()){//sysj\orchestrator.sysj line: 71, column: 5
                              capLoaderReq_o.setVal(false);//sysj\orchestrator.sysj line: 71, column: 5
                              S118863=1;
                              if(!capLoaderReq_o.isACK()){//sysj\orchestrator.sysj line: 71, column: 5
                                capLoaderReq_o.setREQ(false);//sysj\orchestrator.sysj line: 71, column: 5
                                ends[3]=2;
                                ;//sysj\orchestrator.sysj line: 71, column: 5
                                S118950=2;
                                S118957=0;
                                if(!capperReq_o.isPartnerPresent() || capperReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 72, column: 5
                                  capperReq_o.setREQ(false);//sysj\orchestrator.sysj line: 72, column: 5
                                  S118957=1;
                                  active[3]=1;
                                  ends[3]=1;
                                  tdone[3]=1;
                                }
                                else {
                                  S118952=0;
                                  if(capperReq_o.isACK()){//sysj\orchestrator.sysj line: 72, column: 5
                                    capperReq_o.setVal(false);//sysj\orchestrator.sysj line: 72, column: 5
                                    S118952=1;
                                    if(!capperReq_o.isACK()){//sysj\orchestrator.sysj line: 72, column: 5
                                      capperReq_o.setREQ(false);//sysj\orchestrator.sysj line: 72, column: 5
                                      ends[3]=2;
                                      ;//sysj\orchestrator.sysj line: 72, column: 5
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

  public void thread126021(int [] tdone, int [] ends){
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
                    if(!conveyorReq_o.isPartnerPresent() || conveyorReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 41, column: 5
                      conveyorReq_o.setREQ(false);//sysj\orchestrator.sysj line: 41, column: 5
                      S116739=1;
                      active[2]=1;
                      ends[2]=1;
                      tdone[2]=1;
                    }
                    else {
                      switch(S116734){
                        case 0 : 
                          if(conveyorReq_o.isACK()){//sysj\orchestrator.sysj line: 41, column: 5
                            conveyorReq_o.setVal(true);//sysj\orchestrator.sysj line: 41, column: 5
                            S116734=1;
                            if(!conveyorReq_o.isACK()){//sysj\orchestrator.sysj line: 41, column: 5
                              conveyorReq_o.setREQ(false);//sysj\orchestrator.sysj line: 41, column: 5
                              ends[2]=2;
                              ;//sysj\orchestrator.sysj line: 41, column: 5
                              bottlePlaced_thread_2 = bottlePlaced_thread_2 - 1;//sysj\orchestrator.sysj line: 42, column: 5
                              System.out.println(liquidPercent_thread_2.get(3));//sysj\orchestrator.sysj line: 43, column: 5
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
                          if(!conveyorReq_o.isACK()){//sysj\orchestrator.sysj line: 41, column: 5
                            conveyorReq_o.setREQ(false);//sysj\orchestrator.sysj line: 41, column: 5
                            ends[2]=2;
                            ;//sysj\orchestrator.sysj line: 41, column: 5
                            bottlePlaced_thread_2 = bottlePlaced_thread_2 - 1;//sysj\orchestrator.sysj line: 42, column: 5
                            System.out.println(liquidPercent_thread_2.get(3));//sysj\orchestrator.sysj line: 43, column: 5
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
                    if(!conveyorReq_o.isPartnerPresent() || conveyorReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 41, column: 5
                      conveyorReq_o.setREQ(false);//sysj\orchestrator.sysj line: 41, column: 5
                      S116739=1;
                      active[2]=1;
                      ends[2]=1;
                      tdone[2]=1;
                    }
                    else {
                      S116734=0;
                      if(conveyorReq_o.isACK()){//sysj\orchestrator.sysj line: 41, column: 5
                        conveyorReq_o.setVal(true);//sysj\orchestrator.sysj line: 41, column: 5
                        S116734=1;
                        if(!conveyorReq_o.isACK()){//sysj\orchestrator.sysj line: 41, column: 5
                          conveyorReq_o.setREQ(false);//sysj\orchestrator.sysj line: 41, column: 5
                          ends[2]=2;
                          ;//sysj\orchestrator.sysj line: 41, column: 5
                          bottlePlaced_thread_2 = bottlePlaced_thread_2 - 1;//sysj\orchestrator.sysj line: 42, column: 5
                          System.out.println(liquidPercent_thread_2.get(3));//sysj\orchestrator.sysj line: 43, column: 5
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
                if(getNextBottle_1.getprestatus()){//sysj\orchestrator.sysj line: 44, column: 11
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
                if(bottlePlaced_thread_2 >= 0){//sysj\orchestrator.sysj line: 39, column: 10
                  System.out.println("sending conveyor req?");//sysj\orchestrator.sysj line: 40, column: 5
                  S116777=0;
                  S116739=0;
                  if(!conveyorReq_o.isPartnerPresent() || conveyorReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 41, column: 5
                    conveyorReq_o.setREQ(false);//sysj\orchestrator.sysj line: 41, column: 5
                    S116739=1;
                    active[2]=1;
                    ends[2]=1;
                    tdone[2]=1;
                  }
                  else {
                    S116734=0;
                    if(conveyorReq_o.isACK()){//sysj\orchestrator.sysj line: 41, column: 5
                      conveyorReq_o.setVal(true);//sysj\orchestrator.sysj line: 41, column: 5
                      S116734=1;
                      if(!conveyorReq_o.isACK()){//sysj\orchestrator.sysj line: 41, column: 5
                        conveyorReq_o.setREQ(false);//sysj\orchestrator.sysj line: 41, column: 5
                        ends[2]=2;
                        ;//sysj\orchestrator.sysj line: 41, column: 5
                        bottlePlaced_thread_2 = bottlePlaced_thread_2 - 1;//sysj\orchestrator.sysj line: 42, column: 5
                        System.out.println(liquidPercent_thread_2.get(3));//sysj\orchestrator.sysj line: 43, column: 5
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
                  conveyorReq_o.setPreempted();//sysj\orchestrator.sysj line: 39, column: 4
                  ends[2]=2;
                  ;//sysj\orchestrator.sysj line: 39, column: 4
                  System.out.println("Done order");//sysj\orchestrator.sysj line: 49, column: 4
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
            bottlePlaced_thread_2 = quantity_thread_2;//sysj\orchestrator.sysj line: 38, column: 4
            S117035=0;
            if(bottlePlaced_thread_2 >= 0){//sysj\orchestrator.sysj line: 39, column: 10
              System.out.println("sending conveyor req?");//sysj\orchestrator.sysj line: 40, column: 5
              S116777=0;
              S116739=0;
              if(!conveyorReq_o.isPartnerPresent() || conveyorReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 41, column: 5
                conveyorReq_o.setREQ(false);//sysj\orchestrator.sysj line: 41, column: 5
                S116739=1;
                active[2]=1;
                ends[2]=1;
                tdone[2]=1;
              }
              else {
                S116734=0;
                if(conveyorReq_o.isACK()){//sysj\orchestrator.sysj line: 41, column: 5
                  conveyorReq_o.setVal(true);//sysj\orchestrator.sysj line: 41, column: 5
                  S116734=1;
                  if(!conveyorReq_o.isACK()){//sysj\orchestrator.sysj line: 41, column: 5
                    conveyorReq_o.setREQ(false);//sysj\orchestrator.sysj line: 41, column: 5
                    ends[2]=2;
                    ;//sysj\orchestrator.sysj line: 41, column: 5
                    bottlePlaced_thread_2 = bottlePlaced_thread_2 - 1;//sysj\orchestrator.sysj line: 42, column: 5
                    System.out.println(liquidPercent_thread_2.get(3));//sysj\orchestrator.sysj line: 43, column: 5
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
              conveyorReq_o.setPreempted();//sysj\orchestrator.sysj line: 39, column: 4
              ends[2]=2;
              ;//sysj\orchestrator.sysj line: 39, column: 4
              System.out.println("Done order");//sysj\orchestrator.sysj line: 49, column: 4
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

  public void thread126018(int [] tdone, int [] ends){
        S125154=1;
    S125060=0;
    if((conveyStat == true) && (fillerStat == true) && (capperStat == true) && (capLoaderStat == true)){//sysj\orchestrator.sysj line: 143, column: 9
      S125059=0;
      S125021=0;
      if(!allOperationsFinished_o.isPartnerPresent() || allOperationsFinished_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 148, column: 7
        allOperationsFinished_o.setREQ(false);//sysj\orchestrator.sysj line: 148, column: 7
        S125021=1;
        active[9]=1;
        ends[9]=1;
        tdone[9]=1;
      }
      else {
        S125016=0;
        if(allOperationsFinished_o.isACK()){//sysj\orchestrator.sysj line: 148, column: 7
          allOperationsFinished_o.setVal(true);//sysj\orchestrator.sysj line: 148, column: 7
          S125016=1;
          if(!allOperationsFinished_o.isACK()){//sysj\orchestrator.sysj line: 148, column: 7
            allOperationsFinished_o.setREQ(false);//sysj\orchestrator.sysj line: 148, column: 7
            ends[9]=2;
            ;//sysj\orchestrator.sysj line: 148, column: 7
            S125060=1;
            active[9]=1;
            ends[9]=1;
            tdone[9]=1;
          }
          else {
            active[9]=1;
            ends[9]=1;
            tdone[9]=1;
          }
        }
        else {
          active[9]=1;
          ends[9]=1;
          tdone[9]=1;
        }
      }
    }
    else {
      S125059=1;
      S125043=0;
      if(!allOperationsFinished_o.isPartnerPresent() || allOperationsFinished_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 150, column: 7
        allOperationsFinished_o.setREQ(false);//sysj\orchestrator.sysj line: 150, column: 7
        S125043=1;
        active[9]=1;
        ends[9]=1;
        tdone[9]=1;
      }
      else {
        S125038=0;
        if(allOperationsFinished_o.isACK()){//sysj\orchestrator.sysj line: 150, column: 7
          allOperationsFinished_o.setVal(false);//sysj\orchestrator.sysj line: 150, column: 7
          S125038=1;
          if(!allOperationsFinished_o.isACK()){//sysj\orchestrator.sysj line: 150, column: 7
            allOperationsFinished_o.setREQ(false);//sysj\orchestrator.sysj line: 150, column: 7
            ends[9]=2;
            ;//sysj\orchestrator.sysj line: 150, column: 7
            S125060=1;
            active[9]=1;
            ends[9]=1;
            tdone[9]=1;
          }
          else {
            active[9]=1;
            ends[9]=1;
            tdone[9]=1;
          }
        }
        else {
          active[9]=1;
          ends[9]=1;
          tdone[9]=1;
        }
      }
    }
  }

  public void thread126017(int [] tdone, int [] ends){
        S125014=1;
    S124966=0;
    S124950=0;
    if(!capLoaderStatus_in.isPartnerPresent() || capLoaderStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 127, column: 5
      capLoaderStatus_in.setACK(false);//sysj\orchestrator.sysj line: 127, column: 5
      S124950=1;
      active[8]=1;
      ends[8]=1;
      tdone[8]=1;
    }
    else {
      S124945=0;
      if(!capLoaderStatus_in.isREQ()){//sysj\orchestrator.sysj line: 127, column: 5
        capLoaderStatus_in.setACK(true);//sysj\orchestrator.sysj line: 127, column: 5
        S124945=1;
        if(capLoaderStatus_in.isREQ()){//sysj\orchestrator.sysj line: 127, column: 5
          capLoaderStatus_in.setACK(false);//sysj\orchestrator.sysj line: 127, column: 5
          ends[8]=2;
          ;//sysj\orchestrator.sysj line: 127, column: 5
          capLoaderValue_thread_8 = (capLoaderStatus_in.getVal() == null ? null : ((String)capLoaderStatus_in.getVal()));//sysj\orchestrator.sysj line: 128, column: 5
          if(capLoaderValue_thread_8 == "busy") {//sysj\orchestrator.sysj line: 129, column: 35
            capLoaderStat = true;//sysj\orchestrator.sysj line: 130, column: 6
          }
          else {//sysj\orchestrator.sysj line: 132, column: 10
            capLoaderStat = false;//sysj\orchestrator.sysj line: 133, column: 6
          }
          S124966=1;
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

  public void thread126016(int [] tdone, int [] ends){
        S124943=1;
    S124895=0;
    S124879=0;
    if(!capperStatus_in.isPartnerPresent() || capperStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 114, column: 5
      capperStatus_in.setACK(false);//sysj\orchestrator.sysj line: 114, column: 5
      S124879=1;
      active[7]=1;
      ends[7]=1;
      tdone[7]=1;
    }
    else {
      S124874=0;
      if(!capperStatus_in.isREQ()){//sysj\orchestrator.sysj line: 114, column: 5
        capperStatus_in.setACK(true);//sysj\orchestrator.sysj line: 114, column: 5
        S124874=1;
        if(capperStatus_in.isREQ()){//sysj\orchestrator.sysj line: 114, column: 5
          capperStatus_in.setACK(false);//sysj\orchestrator.sysj line: 114, column: 5
          ends[7]=2;
          ;//sysj\orchestrator.sysj line: 114, column: 5
          capperValue_thread_7 = (capperStatus_in.getVal() == null ? null : ((String)capperStatus_in.getVal()));//sysj\orchestrator.sysj line: 115, column: 5
          if(capperValue_thread_7 == "busy") {//sysj\orchestrator.sysj line: 116, column: 32
            capperStat = true;//sysj\orchestrator.sysj line: 117, column: 6
          }
          else {//sysj\orchestrator.sysj line: 119, column: 10
            capperStat = false;//sysj\orchestrator.sysj line: 120, column: 6
          }
          S124895=1;
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

  public void thread126015(int [] tdone, int [] ends){
        S124872=1;
    S124824=0;
    S124808=0;
    if(!fillerStatus_in.isPartnerPresent() || fillerStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 100, column: 5
      fillerStatus_in.setACK(false);//sysj\orchestrator.sysj line: 100, column: 5
      S124808=1;
      active[6]=1;
      ends[6]=1;
      tdone[6]=1;
    }
    else {
      S124803=0;
      if(!fillerStatus_in.isREQ()){//sysj\orchestrator.sysj line: 100, column: 5
        fillerStatus_in.setACK(true);//sysj\orchestrator.sysj line: 100, column: 5
        S124803=1;
        if(fillerStatus_in.isREQ()){//sysj\orchestrator.sysj line: 100, column: 5
          fillerStatus_in.setACK(false);//sysj\orchestrator.sysj line: 100, column: 5
          ends[6]=2;
          ;//sysj\orchestrator.sysj line: 100, column: 5
          fillerValue_thread_6 = (fillerStatus_in.getVal() == null ? null : ((String)fillerStatus_in.getVal()));//sysj\orchestrator.sysj line: 101, column: 5
          if(fillerValue_thread_6 == "busy") {//sysj\orchestrator.sysj line: 102, column: 32
            fillerStat = true;//sysj\orchestrator.sysj line: 103, column: 6
          }
          else {//sysj\orchestrator.sysj line: 105, column: 10
            fillerStat = false;//sysj\orchestrator.sysj line: 106, column: 6
          }
          S124824=1;
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

  public void thread126014(int [] tdone, int [] ends){
        S124801=1;
    S124753=0;
    S124737=0;
    if(!conveyorStatus_in.isPartnerPresent() || conveyorStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 86, column: 6
      conveyorStatus_in.setACK(false);//sysj\orchestrator.sysj line: 86, column: 6
      S124737=1;
      active[5]=1;
      ends[5]=1;
      tdone[5]=1;
    }
    else {
      S124732=0;
      if(!conveyorStatus_in.isREQ()){//sysj\orchestrator.sysj line: 86, column: 6
        conveyorStatus_in.setACK(true);//sysj\orchestrator.sysj line: 86, column: 6
        S124732=1;
        if(conveyorStatus_in.isREQ()){//sysj\orchestrator.sysj line: 86, column: 6
          conveyorStatus_in.setACK(false);//sysj\orchestrator.sysj line: 86, column: 6
          ends[5]=2;
          ;//sysj\orchestrator.sysj line: 86, column: 6
          conveyValue_thread_5 = (conveyorStatus_in.getVal() == null ? null : ((String)conveyorStatus_in.getVal()));//sysj\orchestrator.sysj line: 87, column: 6
          if(conveyValue_thread_5 == "busy") {//sysj\orchestrator.sysj line: 88, column: 33
            conveyStat = true;//sysj\orchestrator.sysj line: 89, column: 7
          }
          else {//sysj\orchestrator.sysj line: 91, column: 11
            conveyStat = false;//sysj\orchestrator.sysj line: 92, column: 7
          }
          S124753=1;
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

  public void thread126013(int [] tdone, int [] ends){
        S126007=1;
    S125155=0;
    thread126014(tdone,ends);
    thread126015(tdone,ends);
    thread126016(tdone,ends);
    thread126017(tdone,ends);
    thread126018(tdone,ends);
    int biggest126019 = 0;
    if(ends[5]>=biggest126019){
      biggest126019=ends[5];
    }
    if(ends[6]>=biggest126019){
      biggest126019=ends[6];
    }
    if(ends[7]>=biggest126019){
      biggest126019=ends[7];
    }
    if(ends[8]>=biggest126019){
      biggest126019=ends[8];
    }
    if(ends[9]>=biggest126019){
      biggest126019=ends[9];
    }
    if(biggest126019 == 1){
      active[4]=1;
      ends[4]=1;
      tdone[4]=1;
    }
  }

  public void thread126012(int [] tdone, int [] ends){
        S124730=1;
    S118574=0;
    S118558=0;
    if(!rotaryStatus_in.isPartnerPresent() || rotaryStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 58, column: 4
      rotaryStatus_in.setACK(false);//sysj\orchestrator.sysj line: 58, column: 4
      S118558=1;
      active[3]=1;
      ends[3]=1;
      tdone[3]=1;
    }
    else {
      S118553=0;
      if(!rotaryStatus_in.isREQ()){//sysj\orchestrator.sysj line: 58, column: 4
        rotaryStatus_in.setACK(true);//sysj\orchestrator.sysj line: 58, column: 4
        S118553=1;
        if(rotaryStatus_in.isREQ()){//sysj\orchestrator.sysj line: 58, column: 4
          rotaryStatus_in.setACK(false);//sysj\orchestrator.sysj line: 58, column: 4
          ends[3]=2;
          ;//sysj\orchestrator.sysj line: 58, column: 4
          rotaryStat_thread_3 = (rotaryStatus_in.getVal() == null ? null : ((String)rotaryStatus_in.getVal()));//sysj\orchestrator.sysj line: 59, column: 4
          S118574=1;
          if(rotaryStat_thread_3 == "done"){//sysj\orchestrator.sysj line: 62, column: 7
            S119083=0;
            System.out.println("rotary done, sending filler,loader,screwer, conveyor reqs");//sysj\orchestrator.sysj line: 63, column: 5
            S118619=0;
            S118581=0;
            if(!fillerReq_o.isPartnerPresent() || fillerReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 64, column: 5
              fillerReq_o.setREQ(false);//sysj\orchestrator.sysj line: 64, column: 5
              S118581=1;
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            else {
              S118576=0;
              if(fillerReq_o.isACK()){//sysj\orchestrator.sysj line: 64, column: 5
                fillerReq_o.setVal(true);//sysj\orchestrator.sysj line: 64, column: 5
                S118576=1;
                if(!fillerReq_o.isACK()){//sysj\orchestrator.sysj line: 64, column: 5
                  fillerReq_o.setREQ(false);//sysj\orchestrator.sysj line: 64, column: 5
                  ends[3]=2;
                  ;//sysj\orchestrator.sysj line: 64, column: 5
                  S118619=1;
                  S118626=0;
                  if(!capLoaderReq_o.isPartnerPresent() || capLoaderReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 65, column: 5
                    capLoaderReq_o.setREQ(false);//sysj\orchestrator.sysj line: 65, column: 5
                    S118626=1;
                    active[3]=1;
                    ends[3]=1;
                    tdone[3]=1;
                  }
                  else {
                    S118621=0;
                    if(capLoaderReq_o.isACK()){//sysj\orchestrator.sysj line: 65, column: 5
                      capLoaderReq_o.setVal(true);//sysj\orchestrator.sysj line: 65, column: 5
                      S118621=1;
                      if(!capLoaderReq_o.isACK()){//sysj\orchestrator.sysj line: 65, column: 5
                        capLoaderReq_o.setREQ(false);//sysj\orchestrator.sysj line: 65, column: 5
                        ends[3]=2;
                        ;//sysj\orchestrator.sysj line: 65, column: 5
                        S118619=2;
                        S118714=0;
                        if(!capperReq_o.isPartnerPresent() || capperReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 66, column: 5
                          capperReq_o.setREQ(false);//sysj\orchestrator.sysj line: 66, column: 5
                          S118714=1;
                          active[3]=1;
                          ends[3]=1;
                          tdone[3]=1;
                        }
                        else {
                          S118709=0;
                          if(capperReq_o.isACK()){//sysj\orchestrator.sysj line: 66, column: 5
                            capperReq_o.setVal(true);//sysj\orchestrator.sysj line: 66, column: 5
                            S118709=1;
                            if(!capperReq_o.isACK()){//sysj\orchestrator.sysj line: 66, column: 5
                              capperReq_o.setREQ(false);//sysj\orchestrator.sysj line: 66, column: 5
                              ends[3]=2;
                              ;//sysj\orchestrator.sysj line: 66, column: 5
                              getNextBottle_1.setPresent();//sysj\orchestrator.sysj line: 67, column: 5
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
            if(!fillerReq_o.isPartnerPresent() || fillerReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 70, column: 5
              fillerReq_o.setREQ(false);//sysj\orchestrator.sysj line: 70, column: 5
              S118846=1;
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            else {
              S118841=0;
              if(fillerReq_o.isACK()){//sysj\orchestrator.sysj line: 70, column: 5
                fillerReq_o.setVal(false);//sysj\orchestrator.sysj line: 70, column: 5
                S118841=1;
                if(!fillerReq_o.isACK()){//sysj\orchestrator.sysj line: 70, column: 5
                  fillerReq_o.setREQ(false);//sysj\orchestrator.sysj line: 70, column: 5
                  ends[3]=2;
                  ;//sysj\orchestrator.sysj line: 70, column: 5
                  S118950=1;
                  S118868=0;
                  if(!capLoaderReq_o.isPartnerPresent() || capLoaderReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 71, column: 5
                    capLoaderReq_o.setREQ(false);//sysj\orchestrator.sysj line: 71, column: 5
                    S118868=1;
                    active[3]=1;
                    ends[3]=1;
                    tdone[3]=1;
                  }
                  else {
                    S118863=0;
                    if(capLoaderReq_o.isACK()){//sysj\orchestrator.sysj line: 71, column: 5
                      capLoaderReq_o.setVal(false);//sysj\orchestrator.sysj line: 71, column: 5
                      S118863=1;
                      if(!capLoaderReq_o.isACK()){//sysj\orchestrator.sysj line: 71, column: 5
                        capLoaderReq_o.setREQ(false);//sysj\orchestrator.sysj line: 71, column: 5
                        ends[3]=2;
                        ;//sysj\orchestrator.sysj line: 71, column: 5
                        S118950=2;
                        S118957=0;
                        if(!capperReq_o.isPartnerPresent() || capperReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 72, column: 5
                          capperReq_o.setREQ(false);//sysj\orchestrator.sysj line: 72, column: 5
                          S118957=1;
                          active[3]=1;
                          ends[3]=1;
                          tdone[3]=1;
                        }
                        else {
                          S118952=0;
                          if(capperReq_o.isACK()){//sysj\orchestrator.sysj line: 72, column: 5
                            capperReq_o.setVal(false);//sysj\orchestrator.sysj line: 72, column: 5
                            S118952=1;
                            if(!capperReq_o.isACK()){//sysj\orchestrator.sysj line: 72, column: 5
                              capperReq_o.setREQ(false);//sysj\orchestrator.sysj line: 72, column: 5
                              ends[3]=2;
                              ;//sysj\orchestrator.sysj line: 72, column: 5
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

  public void thread126011(int [] tdone, int [] ends){
        S118551=1;
    conveyStat_thread_2 = false;//sysj\orchestrator.sysj line: 21, column: 3
    fillerStat_thread_2 = false;//sysj\orchestrator.sysj line: 22, column: 3
    capperStat_thread_2 = false;//sysj\orchestrator.sysj line: 23, column: 3
    capLoaderStat_thread_2 = false;//sysj\orchestrator.sysj line: 24, column: 3
    quantity_thread_2 = 5;//sysj\orchestrator.sysj line: 26, column: 3
    bottlePlaced_thread_2 = 0;//sysj\orchestrator.sysj line: 27, column: 3
    liquidPercent_thread_2 = new ArrayList();//sysj\orchestrator.sysj line: 28, column: 3
    liquidPercent_thread_2.add(10);//sysj\orchestrator.sysj line: 29, column: 3
    liquidPercent_thread_2.add(10);//sysj\orchestrator.sysj line: 30, column: 3
    liquidPercent_thread_2.add(20);//sysj\orchestrator.sysj line: 31, column: 3
    liquidPercent_thread_2.add(60);//sysj\orchestrator.sysj line: 32, column: 3
    bottlePlaced_thread_2 = quantity_thread_2;//sysj\orchestrator.sysj line: 38, column: 4
    S117035=0;
    if(bottlePlaced_thread_2 >= 0){//sysj\orchestrator.sysj line: 39, column: 10
      System.out.println("sending conveyor req?");//sysj\orchestrator.sysj line: 40, column: 5
      S116777=0;
      S116739=0;
      if(!conveyorReq_o.isPartnerPresent() || conveyorReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 41, column: 5
        conveyorReq_o.setREQ(false);//sysj\orchestrator.sysj line: 41, column: 5
        S116739=1;
        active[2]=1;
        ends[2]=1;
        tdone[2]=1;
      }
      else {
        S116734=0;
        if(conveyorReq_o.isACK()){//sysj\orchestrator.sysj line: 41, column: 5
          conveyorReq_o.setVal(true);//sysj\orchestrator.sysj line: 41, column: 5
          S116734=1;
          if(!conveyorReq_o.isACK()){//sysj\orchestrator.sysj line: 41, column: 5
            conveyorReq_o.setREQ(false);//sysj\orchestrator.sysj line: 41, column: 5
            ends[2]=2;
            ;//sysj\orchestrator.sysj line: 41, column: 5
            bottlePlaced_thread_2 = bottlePlaced_thread_2 - 1;//sysj\orchestrator.sysj line: 42, column: 5
            System.out.println(liquidPercent_thread_2.get(3));//sysj\orchestrator.sysj line: 43, column: 5
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
      conveyorReq_o.setPreempted();//sysj\orchestrator.sysj line: 39, column: 4
      ends[2]=2;
      ;//sysj\orchestrator.sysj line: 39, column: 4
      System.out.println("Done order");//sysj\orchestrator.sysj line: 49, column: 4
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
      switch(S126009){
        case 0 : 
          S126009=0;
          break RUN;
        
        case 1 : 
          S126009=2;
          S126009=2;
          getNextBottle_1.setClear();//sysj\orchestrator.sysj line: 16, column: 2
          thread126011(tdone,ends);
          thread126012(tdone,ends);
          thread126013(tdone,ends);
          int biggest126020 = 0;
          if(ends[2]>=biggest126020){
            biggest126020=ends[2];
          }
          if(ends[3]>=biggest126020){
            biggest126020=ends[3];
          }
          if(ends[4]>=biggest126020){
            biggest126020=ends[4];
          }
          if(biggest126020 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
        
        case 2 : 
          getNextBottle_1.setClear();//sysj\orchestrator.sysj line: 16, column: 2
          thread126021(tdone,ends);
          thread126022(tdone,ends);
          thread126023(tdone,ends);
          int biggest126036 = 0;
          if(ends[2]>=biggest126036){
            biggest126036=ends[2];
          }
          if(ends[3]>=biggest126036){
            biggest126036=ends[3];
          }
          if(ends[4]>=biggest126036){
            biggest126036=ends[4];
          }
          if(biggest126036 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
          //FINXME code
          if(biggest126036 == 0){
            S126009=0;
            active[1]=0;
            ends[1]=0;
            S126009=0;
            break RUN;
          }
        
      }
    }
  }

  public void init(){
    char [] active1 = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
    char [] paused1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    char [] suspended1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
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
