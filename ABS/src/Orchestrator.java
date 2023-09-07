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
  private boolean conveyStat_thread_4;//sysj\orchestrator.sysj line: 74, column: 3
  private boolean fillerStat_thread_4;//sysj\orchestrator.sysj line: 75, column: 3
  private boolean capperStat_thread_4;//sysj\orchestrator.sysj line: 76, column: 3
  private boolean capLoaderStat_thread_4;//sysj\orchestrator.sysj line: 77, column: 3
  private String rotaryStat_thread_3;//sysj\orchestrator.sysj line: 53, column: 4
  private String conveyValue_thread_5;//sysj\orchestrator.sysj line: 85, column: 6
  private String fillerValue_thread_6;//sysj\orchestrator.sysj line: 99, column: 5
  private String capperValue_thread_7;//sysj\orchestrator.sysj line: 113, column: 5
  private String capLoaderValue_thread_8;//sysj\orchestrator.sysj line: 126, column: 5
  private int S125582 = 1;
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
  private int S125580 = 1;
  private int S124802 = 1;
  private int S124754 = 1;
  private int S124738 = 1;
  private int S124733 = 1;
  private int S124873 = 1;
  private int S124825 = 1;
  private int S124809 = 1;
  private int S124804 = 1;
  private int S124944 = 1;
  private int S124896 = 1;
  private int S124880 = 1;
  private int S124875 = 1;
  private int S125015 = 1;
  private int S124967 = 1;
  private int S124951 = 1;
  private int S124946 = 1;
  private int S125155 = 1;
  private int S125061 = 1;
  private int S125060 = 1;
  private int S125022 = 1;
  private int S125017 = 1;
  private int S125044 = 1;
  private int S125039 = 1;
  
  private int[] ends = new int[10];
  private int[] tdone = new int[10];
  
  public void thread125601(int [] tdone, int [] ends){
        switch(S125155){
      case 0 : 
        active[9]=0;
        ends[9]=0;
        tdone[9]=1;
        break;
      
      case 1 : 
        switch(S125061){
          case 0 : 
            switch(S125060){
              case 0 : 
                switch(S125022){
                  case 0 : 
                    if(!allOperationsFinished_o.isPartnerPresent() || allOperationsFinished_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 149, column: 7
                      allOperationsFinished_o.setREQ(false);//sysj\orchestrator.sysj line: 149, column: 7
                      S125022=1;
                      active[9]=1;
                      ends[9]=1;
                      tdone[9]=1;
                    }
                    else {
                      switch(S125017){
                        case 0 : 
                          if(allOperationsFinished_o.isACK()){//sysj\orchestrator.sysj line: 149, column: 7
                            allOperationsFinished_o.setVal(true);//sysj\orchestrator.sysj line: 149, column: 7
                            S125017=1;
                            if(!allOperationsFinished_o.isACK()){//sysj\orchestrator.sysj line: 149, column: 7
                              allOperationsFinished_o.setREQ(false);//sysj\orchestrator.sysj line: 149, column: 7
                              ends[9]=2;
                              ;//sysj\orchestrator.sysj line: 149, column: 7
                              S125061=1;
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
                          if(!allOperationsFinished_o.isACK()){//sysj\orchestrator.sysj line: 149, column: 7
                            allOperationsFinished_o.setREQ(false);//sysj\orchestrator.sysj line: 149, column: 7
                            ends[9]=2;
                            ;//sysj\orchestrator.sysj line: 149, column: 7
                            S125061=1;
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
                    S125022=1;
                    S125022=0;
                    if(!allOperationsFinished_o.isPartnerPresent() || allOperationsFinished_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 149, column: 7
                      allOperationsFinished_o.setREQ(false);//sysj\orchestrator.sysj line: 149, column: 7
                      S125022=1;
                      active[9]=1;
                      ends[9]=1;
                      tdone[9]=1;
                    }
                    else {
                      S125017=0;
                      if(allOperationsFinished_o.isACK()){//sysj\orchestrator.sysj line: 149, column: 7
                        allOperationsFinished_o.setVal(true);//sysj\orchestrator.sysj line: 149, column: 7
                        S125017=1;
                        if(!allOperationsFinished_o.isACK()){//sysj\orchestrator.sysj line: 149, column: 7
                          allOperationsFinished_o.setREQ(false);//sysj\orchestrator.sysj line: 149, column: 7
                          ends[9]=2;
                          ;//sysj\orchestrator.sysj line: 149, column: 7
                          S125061=1;
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
                switch(S125044){
                  case 0 : 
                    if(!allOperationsFinished_o.isPartnerPresent() || allOperationsFinished_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 151, column: 7
                      allOperationsFinished_o.setREQ(false);//sysj\orchestrator.sysj line: 151, column: 7
                      S125044=1;
                      active[9]=1;
                      ends[9]=1;
                      tdone[9]=1;
                    }
                    else {
                      switch(S125039){
                        case 0 : 
                          if(allOperationsFinished_o.isACK()){//sysj\orchestrator.sysj line: 151, column: 7
                            allOperationsFinished_o.setVal(false);//sysj\orchestrator.sysj line: 151, column: 7
                            S125039=1;
                            if(!allOperationsFinished_o.isACK()){//sysj\orchestrator.sysj line: 151, column: 7
                              allOperationsFinished_o.setREQ(false);//sysj\orchestrator.sysj line: 151, column: 7
                              ends[9]=2;
                              ;//sysj\orchestrator.sysj line: 151, column: 7
                              S125061=1;
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
                          if(!allOperationsFinished_o.isACK()){//sysj\orchestrator.sysj line: 151, column: 7
                            allOperationsFinished_o.setREQ(false);//sysj\orchestrator.sysj line: 151, column: 7
                            ends[9]=2;
                            ;//sysj\orchestrator.sysj line: 151, column: 7
                            S125061=1;
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
                    S125044=1;
                    S125044=0;
                    if(!allOperationsFinished_o.isPartnerPresent() || allOperationsFinished_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 151, column: 7
                      allOperationsFinished_o.setREQ(false);//sysj\orchestrator.sysj line: 151, column: 7
                      S125044=1;
                      active[9]=1;
                      ends[9]=1;
                      tdone[9]=1;
                    }
                    else {
                      S125039=0;
                      if(allOperationsFinished_o.isACK()){//sysj\orchestrator.sysj line: 151, column: 7
                        allOperationsFinished_o.setVal(false);//sysj\orchestrator.sysj line: 151, column: 7
                        S125039=1;
                        if(!allOperationsFinished_o.isACK()){//sysj\orchestrator.sysj line: 151, column: 7
                          allOperationsFinished_o.setREQ(false);//sysj\orchestrator.sysj line: 151, column: 7
                          ends[9]=2;
                          ;//sysj\orchestrator.sysj line: 151, column: 7
                          S125061=1;
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
            S125061=1;
            S125061=0;
            if((conveyStat == true) && (fillerStat == true) && (capperStat == true) && (capLoaderStat == true)){//sysj\orchestrator.sysj line: 144, column: 9
              S125060=0;
              S125022=0;
              if(!allOperationsFinished_o.isPartnerPresent() || allOperationsFinished_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 149, column: 7
                allOperationsFinished_o.setREQ(false);//sysj\orchestrator.sysj line: 149, column: 7
                S125022=1;
                active[9]=1;
                ends[9]=1;
                tdone[9]=1;
              }
              else {
                S125017=0;
                if(allOperationsFinished_o.isACK()){//sysj\orchestrator.sysj line: 149, column: 7
                  allOperationsFinished_o.setVal(true);//sysj\orchestrator.sysj line: 149, column: 7
                  S125017=1;
                  if(!allOperationsFinished_o.isACK()){//sysj\orchestrator.sysj line: 149, column: 7
                    allOperationsFinished_o.setREQ(false);//sysj\orchestrator.sysj line: 149, column: 7
                    ends[9]=2;
                    ;//sysj\orchestrator.sysj line: 149, column: 7
                    S125061=1;
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
              S125060=1;
              S125044=0;
              if(!allOperationsFinished_o.isPartnerPresent() || allOperationsFinished_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 151, column: 7
                allOperationsFinished_o.setREQ(false);//sysj\orchestrator.sysj line: 151, column: 7
                S125044=1;
                active[9]=1;
                ends[9]=1;
                tdone[9]=1;
              }
              else {
                S125039=0;
                if(allOperationsFinished_o.isACK()){//sysj\orchestrator.sysj line: 151, column: 7
                  allOperationsFinished_o.setVal(false);//sysj\orchestrator.sysj line: 151, column: 7
                  S125039=1;
                  if(!allOperationsFinished_o.isACK()){//sysj\orchestrator.sysj line: 151, column: 7
                    allOperationsFinished_o.setREQ(false);//sysj\orchestrator.sysj line: 151, column: 7
                    ends[9]=2;
                    ;//sysj\orchestrator.sysj line: 151, column: 7
                    S125061=1;
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

  public void thread125600(int [] tdone, int [] ends){
        switch(S125015){
      case 0 : 
        active[8]=0;
        ends[8]=0;
        tdone[8]=1;
        break;
      
      case 1 : 
        switch(S124967){
          case 0 : 
            switch(S124951){
              case 0 : 
                if(!capLoaderStatus_in.isPartnerPresent() || capLoaderStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 125, column: 5
                  capLoaderStatus_in.setACK(false);//sysj\orchestrator.sysj line: 125, column: 5
                  S124951=1;
                  active[8]=1;
                  ends[8]=1;
                  tdone[8]=1;
                }
                else {
                  switch(S124946){
                    case 0 : 
                      if(!capLoaderStatus_in.isREQ()){//sysj\orchestrator.sysj line: 125, column: 5
                        capLoaderStatus_in.setACK(true);//sysj\orchestrator.sysj line: 125, column: 5
                        S124946=1;
                        if(capLoaderStatus_in.isREQ()){//sysj\orchestrator.sysj line: 125, column: 5
                          capLoaderStatus_in.setACK(false);//sysj\orchestrator.sysj line: 125, column: 5
                          ends[8]=2;
                          ;//sysj\orchestrator.sysj line: 125, column: 5
                          capLoaderValue_thread_8 = (capLoaderStatus_in.getVal() == null ? null : ((String)capLoaderStatus_in.getVal()));//sysj\orchestrator.sysj line: 126, column: 5
                          if(capLoaderValue_thread_8 == "busy") {//sysj\orchestrator.sysj line: 127, column: 35
                            capLoaderStat = true;//sysj\orchestrator.sysj line: 128, column: 6
                          }
                          else {//sysj\orchestrator.sysj line: 130, column: 10
                            capLoaderStat = false;//sysj\orchestrator.sysj line: 131, column: 6
                          }
                          S124967=1;
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
                      if(capLoaderStatus_in.isREQ()){//sysj\orchestrator.sysj line: 125, column: 5
                        capLoaderStatus_in.setACK(false);//sysj\orchestrator.sysj line: 125, column: 5
                        ends[8]=2;
                        ;//sysj\orchestrator.sysj line: 125, column: 5
                        capLoaderValue_thread_8 = (capLoaderStatus_in.getVal() == null ? null : ((String)capLoaderStatus_in.getVal()));//sysj\orchestrator.sysj line: 126, column: 5
                        if(capLoaderValue_thread_8 == "busy") {//sysj\orchestrator.sysj line: 127, column: 35
                          capLoaderStat = true;//sysj\orchestrator.sysj line: 128, column: 6
                        }
                        else {//sysj\orchestrator.sysj line: 130, column: 10
                          capLoaderStat = false;//sysj\orchestrator.sysj line: 131, column: 6
                        }
                        S124967=1;
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
                S124951=1;
                S124951=0;
                if(!capLoaderStatus_in.isPartnerPresent() || capLoaderStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 125, column: 5
                  capLoaderStatus_in.setACK(false);//sysj\orchestrator.sysj line: 125, column: 5
                  S124951=1;
                  active[8]=1;
                  ends[8]=1;
                  tdone[8]=1;
                }
                else {
                  S124946=0;
                  if(!capLoaderStatus_in.isREQ()){//sysj\orchestrator.sysj line: 125, column: 5
                    capLoaderStatus_in.setACK(true);//sysj\orchestrator.sysj line: 125, column: 5
                    S124946=1;
                    if(capLoaderStatus_in.isREQ()){//sysj\orchestrator.sysj line: 125, column: 5
                      capLoaderStatus_in.setACK(false);//sysj\orchestrator.sysj line: 125, column: 5
                      ends[8]=2;
                      ;//sysj\orchestrator.sysj line: 125, column: 5
                      capLoaderValue_thread_8 = (capLoaderStatus_in.getVal() == null ? null : ((String)capLoaderStatus_in.getVal()));//sysj\orchestrator.sysj line: 126, column: 5
                      if(capLoaderValue_thread_8 == "busy") {//sysj\orchestrator.sysj line: 127, column: 35
                        capLoaderStat = true;//sysj\orchestrator.sysj line: 128, column: 6
                      }
                      else {//sysj\orchestrator.sysj line: 130, column: 10
                        capLoaderStat = false;//sysj\orchestrator.sysj line: 131, column: 6
                      }
                      S124967=1;
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
            S124967=1;
            S124967=0;
            S124951=0;
            if(!capLoaderStatus_in.isPartnerPresent() || capLoaderStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 125, column: 5
              capLoaderStatus_in.setACK(false);//sysj\orchestrator.sysj line: 125, column: 5
              S124951=1;
              active[8]=1;
              ends[8]=1;
              tdone[8]=1;
            }
            else {
              S124946=0;
              if(!capLoaderStatus_in.isREQ()){//sysj\orchestrator.sysj line: 125, column: 5
                capLoaderStatus_in.setACK(true);//sysj\orchestrator.sysj line: 125, column: 5
                S124946=1;
                if(capLoaderStatus_in.isREQ()){//sysj\orchestrator.sysj line: 125, column: 5
                  capLoaderStatus_in.setACK(false);//sysj\orchestrator.sysj line: 125, column: 5
                  ends[8]=2;
                  ;//sysj\orchestrator.sysj line: 125, column: 5
                  capLoaderValue_thread_8 = (capLoaderStatus_in.getVal() == null ? null : ((String)capLoaderStatus_in.getVal()));//sysj\orchestrator.sysj line: 126, column: 5
                  if(capLoaderValue_thread_8 == "busy") {//sysj\orchestrator.sysj line: 127, column: 35
                    capLoaderStat = true;//sysj\orchestrator.sysj line: 128, column: 6
                  }
                  else {//sysj\orchestrator.sysj line: 130, column: 10
                    capLoaderStat = false;//sysj\orchestrator.sysj line: 131, column: 6
                  }
                  S124967=1;
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

  public void thread125599(int [] tdone, int [] ends){
        switch(S124944){
      case 0 : 
        active[7]=0;
        ends[7]=0;
        tdone[7]=1;
        break;
      
      case 1 : 
        switch(S124896){
          case 0 : 
            switch(S124880){
              case 0 : 
                if(!capperStatus_in.isPartnerPresent() || capperStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 112, column: 5
                  capperStatus_in.setACK(false);//sysj\orchestrator.sysj line: 112, column: 5
                  S124880=1;
                  active[7]=1;
                  ends[7]=1;
                  tdone[7]=1;
                }
                else {
                  switch(S124875){
                    case 0 : 
                      if(!capperStatus_in.isREQ()){//sysj\orchestrator.sysj line: 112, column: 5
                        capperStatus_in.setACK(true);//sysj\orchestrator.sysj line: 112, column: 5
                        S124875=1;
                        if(capperStatus_in.isREQ()){//sysj\orchestrator.sysj line: 112, column: 5
                          capperStatus_in.setACK(false);//sysj\orchestrator.sysj line: 112, column: 5
                          ends[7]=2;
                          ;//sysj\orchestrator.sysj line: 112, column: 5
                          capperValue_thread_7 = (capperStatus_in.getVal() == null ? null : ((String)capperStatus_in.getVal()));//sysj\orchestrator.sysj line: 113, column: 5
                          if(capperValue_thread_7 == "busy") {//sysj\orchestrator.sysj line: 114, column: 32
                            capperStat = true;//sysj\orchestrator.sysj line: 115, column: 6
                          }
                          else {//sysj\orchestrator.sysj line: 117, column: 10
                            capperStat = false;//sysj\orchestrator.sysj line: 118, column: 6
                          }
                          S124896=1;
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
                      if(capperStatus_in.isREQ()){//sysj\orchestrator.sysj line: 112, column: 5
                        capperStatus_in.setACK(false);//sysj\orchestrator.sysj line: 112, column: 5
                        ends[7]=2;
                        ;//sysj\orchestrator.sysj line: 112, column: 5
                        capperValue_thread_7 = (capperStatus_in.getVal() == null ? null : ((String)capperStatus_in.getVal()));//sysj\orchestrator.sysj line: 113, column: 5
                        if(capperValue_thread_7 == "busy") {//sysj\orchestrator.sysj line: 114, column: 32
                          capperStat = true;//sysj\orchestrator.sysj line: 115, column: 6
                        }
                        else {//sysj\orchestrator.sysj line: 117, column: 10
                          capperStat = false;//sysj\orchestrator.sysj line: 118, column: 6
                        }
                        S124896=1;
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
                S124880=1;
                S124880=0;
                if(!capperStatus_in.isPartnerPresent() || capperStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 112, column: 5
                  capperStatus_in.setACK(false);//sysj\orchestrator.sysj line: 112, column: 5
                  S124880=1;
                  active[7]=1;
                  ends[7]=1;
                  tdone[7]=1;
                }
                else {
                  S124875=0;
                  if(!capperStatus_in.isREQ()){//sysj\orchestrator.sysj line: 112, column: 5
                    capperStatus_in.setACK(true);//sysj\orchestrator.sysj line: 112, column: 5
                    S124875=1;
                    if(capperStatus_in.isREQ()){//sysj\orchestrator.sysj line: 112, column: 5
                      capperStatus_in.setACK(false);//sysj\orchestrator.sysj line: 112, column: 5
                      ends[7]=2;
                      ;//sysj\orchestrator.sysj line: 112, column: 5
                      capperValue_thread_7 = (capperStatus_in.getVal() == null ? null : ((String)capperStatus_in.getVal()));//sysj\orchestrator.sysj line: 113, column: 5
                      if(capperValue_thread_7 == "busy") {//sysj\orchestrator.sysj line: 114, column: 32
                        capperStat = true;//sysj\orchestrator.sysj line: 115, column: 6
                      }
                      else {//sysj\orchestrator.sysj line: 117, column: 10
                        capperStat = false;//sysj\orchestrator.sysj line: 118, column: 6
                      }
                      S124896=1;
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
            S124896=1;
            S124896=0;
            S124880=0;
            if(!capperStatus_in.isPartnerPresent() || capperStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 112, column: 5
              capperStatus_in.setACK(false);//sysj\orchestrator.sysj line: 112, column: 5
              S124880=1;
              active[7]=1;
              ends[7]=1;
              tdone[7]=1;
            }
            else {
              S124875=0;
              if(!capperStatus_in.isREQ()){//sysj\orchestrator.sysj line: 112, column: 5
                capperStatus_in.setACK(true);//sysj\orchestrator.sysj line: 112, column: 5
                S124875=1;
                if(capperStatus_in.isREQ()){//sysj\orchestrator.sysj line: 112, column: 5
                  capperStatus_in.setACK(false);//sysj\orchestrator.sysj line: 112, column: 5
                  ends[7]=2;
                  ;//sysj\orchestrator.sysj line: 112, column: 5
                  capperValue_thread_7 = (capperStatus_in.getVal() == null ? null : ((String)capperStatus_in.getVal()));//sysj\orchestrator.sysj line: 113, column: 5
                  if(capperValue_thread_7 == "busy") {//sysj\orchestrator.sysj line: 114, column: 32
                    capperStat = true;//sysj\orchestrator.sysj line: 115, column: 6
                  }
                  else {//sysj\orchestrator.sysj line: 117, column: 10
                    capperStat = false;//sysj\orchestrator.sysj line: 118, column: 6
                  }
                  S124896=1;
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

  public void thread125598(int [] tdone, int [] ends){
        switch(S124873){
      case 0 : 
        active[6]=0;
        ends[6]=0;
        tdone[6]=1;
        break;
      
      case 1 : 
        switch(S124825){
          case 0 : 
            switch(S124809){
              case 0 : 
                if(!fillerStatus_in.isPartnerPresent() || fillerStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 98, column: 5
                  fillerStatus_in.setACK(false);//sysj\orchestrator.sysj line: 98, column: 5
                  S124809=1;
                  active[6]=1;
                  ends[6]=1;
                  tdone[6]=1;
                }
                else {
                  switch(S124804){
                    case 0 : 
                      if(!fillerStatus_in.isREQ()){//sysj\orchestrator.sysj line: 98, column: 5
                        fillerStatus_in.setACK(true);//sysj\orchestrator.sysj line: 98, column: 5
                        S124804=1;
                        if(fillerStatus_in.isREQ()){//sysj\orchestrator.sysj line: 98, column: 5
                          fillerStatus_in.setACK(false);//sysj\orchestrator.sysj line: 98, column: 5
                          ends[6]=2;
                          ;//sysj\orchestrator.sysj line: 98, column: 5
                          fillerValue_thread_6 = (fillerStatus_in.getVal() == null ? null : ((String)fillerStatus_in.getVal()));//sysj\orchestrator.sysj line: 99, column: 5
                          if(fillerValue_thread_6 == "busy") {//sysj\orchestrator.sysj line: 100, column: 32
                            fillerStat = true;//sysj\orchestrator.sysj line: 101, column: 6
                          }
                          else {//sysj\orchestrator.sysj line: 103, column: 10
                            fillerStat = false;//sysj\orchestrator.sysj line: 104, column: 6
                          }
                          S124825=1;
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
                      if(fillerStatus_in.isREQ()){//sysj\orchestrator.sysj line: 98, column: 5
                        fillerStatus_in.setACK(false);//sysj\orchestrator.sysj line: 98, column: 5
                        ends[6]=2;
                        ;//sysj\orchestrator.sysj line: 98, column: 5
                        fillerValue_thread_6 = (fillerStatus_in.getVal() == null ? null : ((String)fillerStatus_in.getVal()));//sysj\orchestrator.sysj line: 99, column: 5
                        if(fillerValue_thread_6 == "busy") {//sysj\orchestrator.sysj line: 100, column: 32
                          fillerStat = true;//sysj\orchestrator.sysj line: 101, column: 6
                        }
                        else {//sysj\orchestrator.sysj line: 103, column: 10
                          fillerStat = false;//sysj\orchestrator.sysj line: 104, column: 6
                        }
                        S124825=1;
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
                S124809=1;
                S124809=0;
                if(!fillerStatus_in.isPartnerPresent() || fillerStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 98, column: 5
                  fillerStatus_in.setACK(false);//sysj\orchestrator.sysj line: 98, column: 5
                  S124809=1;
                  active[6]=1;
                  ends[6]=1;
                  tdone[6]=1;
                }
                else {
                  S124804=0;
                  if(!fillerStatus_in.isREQ()){//sysj\orchestrator.sysj line: 98, column: 5
                    fillerStatus_in.setACK(true);//sysj\orchestrator.sysj line: 98, column: 5
                    S124804=1;
                    if(fillerStatus_in.isREQ()){//sysj\orchestrator.sysj line: 98, column: 5
                      fillerStatus_in.setACK(false);//sysj\orchestrator.sysj line: 98, column: 5
                      ends[6]=2;
                      ;//sysj\orchestrator.sysj line: 98, column: 5
                      fillerValue_thread_6 = (fillerStatus_in.getVal() == null ? null : ((String)fillerStatus_in.getVal()));//sysj\orchestrator.sysj line: 99, column: 5
                      if(fillerValue_thread_6 == "busy") {//sysj\orchestrator.sysj line: 100, column: 32
                        fillerStat = true;//sysj\orchestrator.sysj line: 101, column: 6
                      }
                      else {//sysj\orchestrator.sysj line: 103, column: 10
                        fillerStat = false;//sysj\orchestrator.sysj line: 104, column: 6
                      }
                      S124825=1;
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
            S124825=1;
            S124825=0;
            S124809=0;
            if(!fillerStatus_in.isPartnerPresent() || fillerStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 98, column: 5
              fillerStatus_in.setACK(false);//sysj\orchestrator.sysj line: 98, column: 5
              S124809=1;
              active[6]=1;
              ends[6]=1;
              tdone[6]=1;
            }
            else {
              S124804=0;
              if(!fillerStatus_in.isREQ()){//sysj\orchestrator.sysj line: 98, column: 5
                fillerStatus_in.setACK(true);//sysj\orchestrator.sysj line: 98, column: 5
                S124804=1;
                if(fillerStatus_in.isREQ()){//sysj\orchestrator.sysj line: 98, column: 5
                  fillerStatus_in.setACK(false);//sysj\orchestrator.sysj line: 98, column: 5
                  ends[6]=2;
                  ;//sysj\orchestrator.sysj line: 98, column: 5
                  fillerValue_thread_6 = (fillerStatus_in.getVal() == null ? null : ((String)fillerStatus_in.getVal()));//sysj\orchestrator.sysj line: 99, column: 5
                  if(fillerValue_thread_6 == "busy") {//sysj\orchestrator.sysj line: 100, column: 32
                    fillerStat = true;//sysj\orchestrator.sysj line: 101, column: 6
                  }
                  else {//sysj\orchestrator.sysj line: 103, column: 10
                    fillerStat = false;//sysj\orchestrator.sysj line: 104, column: 6
                  }
                  S124825=1;
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

  public void thread125597(int [] tdone, int [] ends){
        switch(S124802){
      case 0 : 
        active[5]=0;
        ends[5]=0;
        tdone[5]=1;
        break;
      
      case 1 : 
        switch(S124754){
          case 0 : 
            switch(S124738){
              case 0 : 
                if(!conveyorStatus_in.isPartnerPresent() || conveyorStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 84, column: 6
                  conveyorStatus_in.setACK(false);//sysj\orchestrator.sysj line: 84, column: 6
                  S124738=1;
                  active[5]=1;
                  ends[5]=1;
                  tdone[5]=1;
                }
                else {
                  switch(S124733){
                    case 0 : 
                      if(!conveyorStatus_in.isREQ()){//sysj\orchestrator.sysj line: 84, column: 6
                        conveyorStatus_in.setACK(true);//sysj\orchestrator.sysj line: 84, column: 6
                        S124733=1;
                        if(conveyorStatus_in.isREQ()){//sysj\orchestrator.sysj line: 84, column: 6
                          conveyorStatus_in.setACK(false);//sysj\orchestrator.sysj line: 84, column: 6
                          ends[5]=2;
                          ;//sysj\orchestrator.sysj line: 84, column: 6
                          conveyValue_thread_5 = (conveyorStatus_in.getVal() == null ? null : ((String)conveyorStatus_in.getVal()));//sysj\orchestrator.sysj line: 85, column: 6
                          if(conveyValue_thread_5 == "busy") {//sysj\orchestrator.sysj line: 86, column: 33
                            conveyStat = true;//sysj\orchestrator.sysj line: 87, column: 7
                          }
                          else {//sysj\orchestrator.sysj line: 89, column: 11
                            conveyStat = false;//sysj\orchestrator.sysj line: 90, column: 7
                          }
                          S124754=1;
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
                      if(conveyorStatus_in.isREQ()){//sysj\orchestrator.sysj line: 84, column: 6
                        conveyorStatus_in.setACK(false);//sysj\orchestrator.sysj line: 84, column: 6
                        ends[5]=2;
                        ;//sysj\orchestrator.sysj line: 84, column: 6
                        conveyValue_thread_5 = (conveyorStatus_in.getVal() == null ? null : ((String)conveyorStatus_in.getVal()));//sysj\orchestrator.sysj line: 85, column: 6
                        if(conveyValue_thread_5 == "busy") {//sysj\orchestrator.sysj line: 86, column: 33
                          conveyStat = true;//sysj\orchestrator.sysj line: 87, column: 7
                        }
                        else {//sysj\orchestrator.sysj line: 89, column: 11
                          conveyStat = false;//sysj\orchestrator.sysj line: 90, column: 7
                        }
                        S124754=1;
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
                S124738=1;
                S124738=0;
                if(!conveyorStatus_in.isPartnerPresent() || conveyorStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 84, column: 6
                  conveyorStatus_in.setACK(false);//sysj\orchestrator.sysj line: 84, column: 6
                  S124738=1;
                  active[5]=1;
                  ends[5]=1;
                  tdone[5]=1;
                }
                else {
                  S124733=0;
                  if(!conveyorStatus_in.isREQ()){//sysj\orchestrator.sysj line: 84, column: 6
                    conveyorStatus_in.setACK(true);//sysj\orchestrator.sysj line: 84, column: 6
                    S124733=1;
                    if(conveyorStatus_in.isREQ()){//sysj\orchestrator.sysj line: 84, column: 6
                      conveyorStatus_in.setACK(false);//sysj\orchestrator.sysj line: 84, column: 6
                      ends[5]=2;
                      ;//sysj\orchestrator.sysj line: 84, column: 6
                      conveyValue_thread_5 = (conveyorStatus_in.getVal() == null ? null : ((String)conveyorStatus_in.getVal()));//sysj\orchestrator.sysj line: 85, column: 6
                      if(conveyValue_thread_5 == "busy") {//sysj\orchestrator.sysj line: 86, column: 33
                        conveyStat = true;//sysj\orchestrator.sysj line: 87, column: 7
                      }
                      else {//sysj\orchestrator.sysj line: 89, column: 11
                        conveyStat = false;//sysj\orchestrator.sysj line: 90, column: 7
                      }
                      S124754=1;
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
            S124754=1;
            S124754=0;
            S124738=0;
            if(!conveyorStatus_in.isPartnerPresent() || conveyorStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 84, column: 6
              conveyorStatus_in.setACK(false);//sysj\orchestrator.sysj line: 84, column: 6
              S124738=1;
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            else {
              S124733=0;
              if(!conveyorStatus_in.isREQ()){//sysj\orchestrator.sysj line: 84, column: 6
                conveyorStatus_in.setACK(true);//sysj\orchestrator.sysj line: 84, column: 6
                S124733=1;
                if(conveyorStatus_in.isREQ()){//sysj\orchestrator.sysj line: 84, column: 6
                  conveyorStatus_in.setACK(false);//sysj\orchestrator.sysj line: 84, column: 6
                  ends[5]=2;
                  ;//sysj\orchestrator.sysj line: 84, column: 6
                  conveyValue_thread_5 = (conveyorStatus_in.getVal() == null ? null : ((String)conveyorStatus_in.getVal()));//sysj\orchestrator.sysj line: 85, column: 6
                  if(conveyValue_thread_5 == "busy") {//sysj\orchestrator.sysj line: 86, column: 33
                    conveyStat = true;//sysj\orchestrator.sysj line: 87, column: 7
                  }
                  else {//sysj\orchestrator.sysj line: 89, column: 11
                    conveyStat = false;//sysj\orchestrator.sysj line: 90, column: 7
                  }
                  S124754=1;
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

  public void thread125596(int [] tdone, int [] ends){
        switch(S125580){
      case 0 : 
        active[4]=0;
        ends[4]=0;
        tdone[4]=1;
        break;
      
      case 1 : 
        thread125597(tdone,ends);
        thread125598(tdone,ends);
        thread125599(tdone,ends);
        thread125600(tdone,ends);
        thread125601(tdone,ends);
        int biggest125602 = 0;
        if(ends[5]>=biggest125602){
          biggest125602=ends[5];
        }
        if(ends[6]>=biggest125602){
          biggest125602=ends[6];
        }
        if(ends[7]>=biggest125602){
          biggest125602=ends[7];
        }
        if(ends[8]>=biggest125602){
          biggest125602=ends[8];
        }
        if(ends[9]>=biggest125602){
          biggest125602=ends[9];
        }
        if(biggest125602 == 1){
          active[4]=1;
          ends[4]=1;
          tdone[4]=1;
        }
        //FINXME code
        if(biggest125602 == 0){
          S125580=0;
          active[4]=0;
          ends[4]=0;
          tdone[4]=1;
        }
        break;
      
    }
  }

  public void thread125595(int [] tdone, int [] ends){
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

  public void thread125594(int [] tdone, int [] ends){
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

  public void thread125591(int [] tdone, int [] ends){
        S125155=1;
    S125061=0;
    if((conveyStat == true) && (fillerStat == true) && (capperStat == true) && (capLoaderStat == true)){//sysj\orchestrator.sysj line: 144, column: 9
      S125060=0;
      S125022=0;
      if(!allOperationsFinished_o.isPartnerPresent() || allOperationsFinished_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 149, column: 7
        allOperationsFinished_o.setREQ(false);//sysj\orchestrator.sysj line: 149, column: 7
        S125022=1;
        active[9]=1;
        ends[9]=1;
        tdone[9]=1;
      }
      else {
        S125017=0;
        if(allOperationsFinished_o.isACK()){//sysj\orchestrator.sysj line: 149, column: 7
          allOperationsFinished_o.setVal(true);//sysj\orchestrator.sysj line: 149, column: 7
          S125017=1;
          if(!allOperationsFinished_o.isACK()){//sysj\orchestrator.sysj line: 149, column: 7
            allOperationsFinished_o.setREQ(false);//sysj\orchestrator.sysj line: 149, column: 7
            ends[9]=2;
            ;//sysj\orchestrator.sysj line: 149, column: 7
            S125061=1;
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
      S125060=1;
      S125044=0;
      if(!allOperationsFinished_o.isPartnerPresent() || allOperationsFinished_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 151, column: 7
        allOperationsFinished_o.setREQ(false);//sysj\orchestrator.sysj line: 151, column: 7
        S125044=1;
        active[9]=1;
        ends[9]=1;
        tdone[9]=1;
      }
      else {
        S125039=0;
        if(allOperationsFinished_o.isACK()){//sysj\orchestrator.sysj line: 151, column: 7
          allOperationsFinished_o.setVal(false);//sysj\orchestrator.sysj line: 151, column: 7
          S125039=1;
          if(!allOperationsFinished_o.isACK()){//sysj\orchestrator.sysj line: 151, column: 7
            allOperationsFinished_o.setREQ(false);//sysj\orchestrator.sysj line: 151, column: 7
            ends[9]=2;
            ;//sysj\orchestrator.sysj line: 151, column: 7
            S125061=1;
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

  public void thread125590(int [] tdone, int [] ends){
        S125015=1;
    S124967=0;
    S124951=0;
    if(!capLoaderStatus_in.isPartnerPresent() || capLoaderStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 125, column: 5
      capLoaderStatus_in.setACK(false);//sysj\orchestrator.sysj line: 125, column: 5
      S124951=1;
      active[8]=1;
      ends[8]=1;
      tdone[8]=1;
    }
    else {
      S124946=0;
      if(!capLoaderStatus_in.isREQ()){//sysj\orchestrator.sysj line: 125, column: 5
        capLoaderStatus_in.setACK(true);//sysj\orchestrator.sysj line: 125, column: 5
        S124946=1;
        if(capLoaderStatus_in.isREQ()){//sysj\orchestrator.sysj line: 125, column: 5
          capLoaderStatus_in.setACK(false);//sysj\orchestrator.sysj line: 125, column: 5
          ends[8]=2;
          ;//sysj\orchestrator.sysj line: 125, column: 5
          capLoaderValue_thread_8 = (capLoaderStatus_in.getVal() == null ? null : ((String)capLoaderStatus_in.getVal()));//sysj\orchestrator.sysj line: 126, column: 5
          if(capLoaderValue_thread_8 == "busy") {//sysj\orchestrator.sysj line: 127, column: 35
            capLoaderStat = true;//sysj\orchestrator.sysj line: 128, column: 6
          }
          else {//sysj\orchestrator.sysj line: 130, column: 10
            capLoaderStat = false;//sysj\orchestrator.sysj line: 131, column: 6
          }
          S124967=1;
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

  public void thread125589(int [] tdone, int [] ends){
        S124944=1;
    S124896=0;
    S124880=0;
    if(!capperStatus_in.isPartnerPresent() || capperStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 112, column: 5
      capperStatus_in.setACK(false);//sysj\orchestrator.sysj line: 112, column: 5
      S124880=1;
      active[7]=1;
      ends[7]=1;
      tdone[7]=1;
    }
    else {
      S124875=0;
      if(!capperStatus_in.isREQ()){//sysj\orchestrator.sysj line: 112, column: 5
        capperStatus_in.setACK(true);//sysj\orchestrator.sysj line: 112, column: 5
        S124875=1;
        if(capperStatus_in.isREQ()){//sysj\orchestrator.sysj line: 112, column: 5
          capperStatus_in.setACK(false);//sysj\orchestrator.sysj line: 112, column: 5
          ends[7]=2;
          ;//sysj\orchestrator.sysj line: 112, column: 5
          capperValue_thread_7 = (capperStatus_in.getVal() == null ? null : ((String)capperStatus_in.getVal()));//sysj\orchestrator.sysj line: 113, column: 5
          if(capperValue_thread_7 == "busy") {//sysj\orchestrator.sysj line: 114, column: 32
            capperStat = true;//sysj\orchestrator.sysj line: 115, column: 6
          }
          else {//sysj\orchestrator.sysj line: 117, column: 10
            capperStat = false;//sysj\orchestrator.sysj line: 118, column: 6
          }
          S124896=1;
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

  public void thread125588(int [] tdone, int [] ends){
        S124873=1;
    S124825=0;
    S124809=0;
    if(!fillerStatus_in.isPartnerPresent() || fillerStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 98, column: 5
      fillerStatus_in.setACK(false);//sysj\orchestrator.sysj line: 98, column: 5
      S124809=1;
      active[6]=1;
      ends[6]=1;
      tdone[6]=1;
    }
    else {
      S124804=0;
      if(!fillerStatus_in.isREQ()){//sysj\orchestrator.sysj line: 98, column: 5
        fillerStatus_in.setACK(true);//sysj\orchestrator.sysj line: 98, column: 5
        S124804=1;
        if(fillerStatus_in.isREQ()){//sysj\orchestrator.sysj line: 98, column: 5
          fillerStatus_in.setACK(false);//sysj\orchestrator.sysj line: 98, column: 5
          ends[6]=2;
          ;//sysj\orchestrator.sysj line: 98, column: 5
          fillerValue_thread_6 = (fillerStatus_in.getVal() == null ? null : ((String)fillerStatus_in.getVal()));//sysj\orchestrator.sysj line: 99, column: 5
          if(fillerValue_thread_6 == "busy") {//sysj\orchestrator.sysj line: 100, column: 32
            fillerStat = true;//sysj\orchestrator.sysj line: 101, column: 6
          }
          else {//sysj\orchestrator.sysj line: 103, column: 10
            fillerStat = false;//sysj\orchestrator.sysj line: 104, column: 6
          }
          S124825=1;
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

  public void thread125587(int [] tdone, int [] ends){
        S124802=1;
    S124754=0;
    S124738=0;
    if(!conveyorStatus_in.isPartnerPresent() || conveyorStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 84, column: 6
      conveyorStatus_in.setACK(false);//sysj\orchestrator.sysj line: 84, column: 6
      S124738=1;
      active[5]=1;
      ends[5]=1;
      tdone[5]=1;
    }
    else {
      S124733=0;
      if(!conveyorStatus_in.isREQ()){//sysj\orchestrator.sysj line: 84, column: 6
        conveyorStatus_in.setACK(true);//sysj\orchestrator.sysj line: 84, column: 6
        S124733=1;
        if(conveyorStatus_in.isREQ()){//sysj\orchestrator.sysj line: 84, column: 6
          conveyorStatus_in.setACK(false);//sysj\orchestrator.sysj line: 84, column: 6
          ends[5]=2;
          ;//sysj\orchestrator.sysj line: 84, column: 6
          conveyValue_thread_5 = (conveyorStatus_in.getVal() == null ? null : ((String)conveyorStatus_in.getVal()));//sysj\orchestrator.sysj line: 85, column: 6
          if(conveyValue_thread_5 == "busy") {//sysj\orchestrator.sysj line: 86, column: 33
            conveyStat = true;//sysj\orchestrator.sysj line: 87, column: 7
          }
          else {//sysj\orchestrator.sysj line: 89, column: 11
            conveyStat = false;//sysj\orchestrator.sysj line: 90, column: 7
          }
          S124754=1;
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

  public void thread125586(int [] tdone, int [] ends){
        S125580=1;
    conveyStat_thread_4 = false;//sysj\orchestrator.sysj line: 74, column: 3
    fillerStat_thread_4 = false;//sysj\orchestrator.sysj line: 75, column: 3
    capperStat_thread_4 = false;//sysj\orchestrator.sysj line: 76, column: 3
    capLoaderStat_thread_4 = false;//sysj\orchestrator.sysj line: 77, column: 3
    thread125587(tdone,ends);
    thread125588(tdone,ends);
    thread125589(tdone,ends);
    thread125590(tdone,ends);
    thread125591(tdone,ends);
    int biggest125592 = 0;
    if(ends[5]>=biggest125592){
      biggest125592=ends[5];
    }
    if(ends[6]>=biggest125592){
      biggest125592=ends[6];
    }
    if(ends[7]>=biggest125592){
      biggest125592=ends[7];
    }
    if(ends[8]>=biggest125592){
      biggest125592=ends[8];
    }
    if(ends[9]>=biggest125592){
      biggest125592=ends[9];
    }
    if(biggest125592 == 1){
      active[4]=1;
      ends[4]=1;
      tdone[4]=1;
    }
  }

  public void thread125585(int [] tdone, int [] ends){
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

  public void thread125584(int [] tdone, int [] ends){
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
      switch(S125582){
        case 0 : 
          S125582=0;
          break RUN;
        
        case 1 : 
          S125582=2;
          S125582=2;
          getNextBottle_1.setClear();//sysj\orchestrator.sysj line: 16, column: 2
          thread125584(tdone,ends);
          thread125585(tdone,ends);
          thread125586(tdone,ends);
          int biggest125593 = 0;
          if(ends[2]>=biggest125593){
            biggest125593=ends[2];
          }
          if(ends[3]>=biggest125593){
            biggest125593=ends[3];
          }
          if(ends[4]>=biggest125593){
            biggest125593=ends[4];
          }
          if(biggest125593 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
        
        case 2 : 
          getNextBottle_1.setClear();//sysj\orchestrator.sysj line: 16, column: 2
          thread125594(tdone,ends);
          thread125595(tdone,ends);
          thread125596(tdone,ends);
          int biggest125603 = 0;
          if(ends[2]>=biggest125603){
            biggest125603=ends[2];
          }
          if(ends[3]>=biggest125603){
            biggest125603=ends[3];
          }
          if(ends[4]>=biggest125603){
            biggest125603=ends[4];
          }
          if(biggest125603 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
          //FINXME code
          if(biggest125603 == 0){
            S125582=0;
            active[1]=0;
            ends[1]=0;
            S125582=0;
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
