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
  private String rotaryStat_thread_3;//sysj\orchestrator.sysj line: 54, column: 4
  private String conveyValue_thread_4;//sysj\orchestrator.sysj line: 77, column: 4
  private String fillerValue_thread_5;//sysj\orchestrator.sysj line: 94, column: 4
  private String capperValue_thread_6;//sysj\orchestrator.sysj line: 110, column: 4
  private String capLoaderValue_thread_7;//sysj\orchestrator.sysj line: 126, column: 4
  private int S127163 = 1;
  private int S120489 = 1;
  private int S118973 = 1;
  private int S118715 = 1;
  private int S118677 = 1;
  private int S118672 = 1;
  private int S126668 = 1;
  private int S120512 = 1;
  private int S120496 = 1;
  private int S120491 = 1;
  private int S121021 = 1;
  private int S120557 = 1;
  private int S120519 = 1;
  private int S120514 = 1;
  private int S120564 = 1;
  private int S120559 = 1;
  private int S120652 = 1;
  private int S120647 = 1;
  private int S120888 = 1;
  private int S120784 = 1;
  private int S120779 = 1;
  private int S120806 = 1;
  private int S120801 = 1;
  private int S120895 = 1;
  private int S120890 = 1;
  private int S126739 = 1;
  private int S126691 = 1;
  private int S126675 = 1;
  private int S126670 = 1;
  private int S126810 = 1;
  private int S126762 = 1;
  private int S126746 = 1;
  private int S126741 = 1;
  private int S126881 = 1;
  private int S126833 = 1;
  private int S126817 = 1;
  private int S126812 = 1;
  private int S126952 = 1;
  private int S126904 = 1;
  private int S126888 = 1;
  private int S126883 = 1;
  private int S127161 = 1;
  private int S127021 = 1;
  private int S127020 = 1;
  private int S126959 = 1;
  private int S126954 = 1;
  private int S127004 = 1;
  private int S126999 = 1;
  
  private int[] ends = new int[9];
  private int[] tdone = new int[9];
  
  public void thread127179(int [] tdone, int [] ends){
        switch(S127161){
      case 0 : 
        active[8]=0;
        ends[8]=0;
        tdone[8]=1;
        break;
      
      case 1 : 
        switch(S127021){
          case 0 : 
            switch(S127020){
              case 0 : 
                switch(S126959){
                  case 0 : 
                    if(!allOperationsFinished_o.isPartnerPresent() || allOperationsFinished_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 149, column: 5
                      allOperationsFinished_o.setREQ(false);//sysj\orchestrator.sysj line: 149, column: 5
                      S126959=1;
                      active[8]=1;
                      ends[8]=1;
                      tdone[8]=1;
                    }
                    else {
                      switch(S126954){
                        case 0 : 
                          if(allOperationsFinished_o.isACK()){//sysj\orchestrator.sysj line: 149, column: 5
                            allOperationsFinished_o.setVal(true);//sysj\orchestrator.sysj line: 149, column: 5
                            S126954=1;
                            if(!allOperationsFinished_o.isACK()){//sysj\orchestrator.sysj line: 149, column: 5
                              allOperationsFinished_o.setREQ(false);//sysj\orchestrator.sysj line: 149, column: 5
                              ends[8]=2;
                              ;//sysj\orchestrator.sysj line: 149, column: 5
                              S127021=1;
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
                          if(!allOperationsFinished_o.isACK()){//sysj\orchestrator.sysj line: 149, column: 5
                            allOperationsFinished_o.setREQ(false);//sysj\orchestrator.sysj line: 149, column: 5
                            ends[8]=2;
                            ;//sysj\orchestrator.sysj line: 149, column: 5
                            S127021=1;
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
                    S126959=1;
                    S126959=0;
                    if(!allOperationsFinished_o.isPartnerPresent() || allOperationsFinished_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 149, column: 5
                      allOperationsFinished_o.setREQ(false);//sysj\orchestrator.sysj line: 149, column: 5
                      S126959=1;
                      active[8]=1;
                      ends[8]=1;
                      tdone[8]=1;
                    }
                    else {
                      S126954=0;
                      if(allOperationsFinished_o.isACK()){//sysj\orchestrator.sysj line: 149, column: 5
                        allOperationsFinished_o.setVal(true);//sysj\orchestrator.sysj line: 149, column: 5
                        S126954=1;
                        if(!allOperationsFinished_o.isACK()){//sysj\orchestrator.sysj line: 149, column: 5
                          allOperationsFinished_o.setREQ(false);//sysj\orchestrator.sysj line: 149, column: 5
                          ends[8]=2;
                          ;//sysj\orchestrator.sysj line: 149, column: 5
                          S127021=1;
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
                switch(S127004){
                  case 0 : 
                    if(!allOperationsFinished_o.isPartnerPresent() || allOperationsFinished_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 151, column: 5
                      allOperationsFinished_o.setREQ(false);//sysj\orchestrator.sysj line: 151, column: 5
                      S127004=1;
                      active[8]=1;
                      ends[8]=1;
                      tdone[8]=1;
                    }
                    else {
                      switch(S126999){
                        case 0 : 
                          if(allOperationsFinished_o.isACK()){//sysj\orchestrator.sysj line: 151, column: 5
                            allOperationsFinished_o.setVal(false);//sysj\orchestrator.sysj line: 151, column: 5
                            S126999=1;
                            if(!allOperationsFinished_o.isACK()){//sysj\orchestrator.sysj line: 151, column: 5
                              allOperationsFinished_o.setREQ(false);//sysj\orchestrator.sysj line: 151, column: 5
                              ends[8]=2;
                              ;//sysj\orchestrator.sysj line: 151, column: 5
                              S127021=1;
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
                            S127021=1;
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
                    S127004=1;
                    S127004=0;
                    if(!allOperationsFinished_o.isPartnerPresent() || allOperationsFinished_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 151, column: 5
                      allOperationsFinished_o.setREQ(false);//sysj\orchestrator.sysj line: 151, column: 5
                      S127004=1;
                      active[8]=1;
                      ends[8]=1;
                      tdone[8]=1;
                    }
                    else {
                      S126999=0;
                      if(allOperationsFinished_o.isACK()){//sysj\orchestrator.sysj line: 151, column: 5
                        allOperationsFinished_o.setVal(false);//sysj\orchestrator.sysj line: 151, column: 5
                        S126999=1;
                        if(!allOperationsFinished_o.isACK()){//sysj\orchestrator.sysj line: 151, column: 5
                          allOperationsFinished_o.setREQ(false);//sysj\orchestrator.sysj line: 151, column: 5
                          ends[8]=2;
                          ;//sysj\orchestrator.sysj line: 151, column: 5
                          S127021=1;
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
            S127021=1;
            S127021=0;
            if((Status.conveyStat == false) && (Status.fillerStat == false) && (Status.capperStat == false) && (Status.capLoaderStat == false)){//sysj\orchestrator.sysj line: 144, column: 7
              S127020=0;
              System.out.println("Orch sending rotary req");//sysj\orchestrator.sysj line: 148, column: 5
              S126959=0;
              if(!allOperationsFinished_o.isPartnerPresent() || allOperationsFinished_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 149, column: 5
                allOperationsFinished_o.setREQ(false);//sysj\orchestrator.sysj line: 149, column: 5
                S126959=1;
                active[8]=1;
                ends[8]=1;
                tdone[8]=1;
              }
              else {
                S126954=0;
                if(allOperationsFinished_o.isACK()){//sysj\orchestrator.sysj line: 149, column: 5
                  allOperationsFinished_o.setVal(true);//sysj\orchestrator.sysj line: 149, column: 5
                  S126954=1;
                  if(!allOperationsFinished_o.isACK()){//sysj\orchestrator.sysj line: 149, column: 5
                    allOperationsFinished_o.setREQ(false);//sysj\orchestrator.sysj line: 149, column: 5
                    ends[8]=2;
                    ;//sysj\orchestrator.sysj line: 149, column: 5
                    S127021=1;
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
              S127020=1;
              S127004=0;
              if(!allOperationsFinished_o.isPartnerPresent() || allOperationsFinished_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 151, column: 5
                allOperationsFinished_o.setREQ(false);//sysj\orchestrator.sysj line: 151, column: 5
                S127004=1;
                active[8]=1;
                ends[8]=1;
                tdone[8]=1;
              }
              else {
                S126999=0;
                if(allOperationsFinished_o.isACK()){//sysj\orchestrator.sysj line: 151, column: 5
                  allOperationsFinished_o.setVal(false);//sysj\orchestrator.sysj line: 151, column: 5
                  S126999=1;
                  if(!allOperationsFinished_o.isACK()){//sysj\orchestrator.sysj line: 151, column: 5
                    allOperationsFinished_o.setREQ(false);//sysj\orchestrator.sysj line: 151, column: 5
                    ends[8]=2;
                    ;//sysj\orchestrator.sysj line: 151, column: 5
                    S127021=1;
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

  public void thread127178(int [] tdone, int [] ends){
        switch(S126952){
      case 0 : 
        active[7]=0;
        ends[7]=0;
        tdone[7]=1;
        break;
      
      case 1 : 
        switch(S126904){
          case 0 : 
            switch(S126888){
              case 0 : 
                if(!capLoaderStatus_in.isPartnerPresent() || capLoaderStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 125, column: 4
                  capLoaderStatus_in.setACK(false);//sysj\orchestrator.sysj line: 125, column: 4
                  S126888=1;
                  active[7]=1;
                  ends[7]=1;
                  tdone[7]=1;
                }
                else {
                  switch(S126883){
                    case 0 : 
                      if(!capLoaderStatus_in.isREQ()){//sysj\orchestrator.sysj line: 125, column: 4
                        capLoaderStatus_in.setACK(true);//sysj\orchestrator.sysj line: 125, column: 4
                        S126883=1;
                        if(capLoaderStatus_in.isREQ()){//sysj\orchestrator.sysj line: 125, column: 4
                          capLoaderStatus_in.setACK(false);//sysj\orchestrator.sysj line: 125, column: 4
                          ends[7]=2;
                          ;//sysj\orchestrator.sysj line: 125, column: 4
                          capLoaderValue_thread_7 = (capLoaderStatus_in.getVal() == null ? null : ((String)capLoaderStatus_in.getVal()));//sysj\orchestrator.sysj line: 126, column: 4
                          if(capLoaderValue_thread_7 == "busy") {//sysj\orchestrator.sysj line: 127, column: 34
                            System.out.println("Orch received - loader busy");//sysj\orchestrator.sysj line: 128, column: 5
                            Status.capLoaderStat = true;//sysj\orchestrator.sysj line: 129, column: 5
                          }
                          else {//sysj\orchestrator.sysj line: 131, column: 9
                            Status.capLoaderStat = false;//sysj\orchestrator.sysj line: 133, column: 5
                          }
                          S126904=1;
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
                      if(capLoaderStatus_in.isREQ()){//sysj\orchestrator.sysj line: 125, column: 4
                        capLoaderStatus_in.setACK(false);//sysj\orchestrator.sysj line: 125, column: 4
                        ends[7]=2;
                        ;//sysj\orchestrator.sysj line: 125, column: 4
                        capLoaderValue_thread_7 = (capLoaderStatus_in.getVal() == null ? null : ((String)capLoaderStatus_in.getVal()));//sysj\orchestrator.sysj line: 126, column: 4
                        if(capLoaderValue_thread_7 == "busy") {//sysj\orchestrator.sysj line: 127, column: 34
                          System.out.println("Orch received - loader busy");//sysj\orchestrator.sysj line: 128, column: 5
                          Status.capLoaderStat = true;//sysj\orchestrator.sysj line: 129, column: 5
                        }
                        else {//sysj\orchestrator.sysj line: 131, column: 9
                          Status.capLoaderStat = false;//sysj\orchestrator.sysj line: 133, column: 5
                        }
                        S126904=1;
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
                S126888=1;
                S126888=0;
                if(!capLoaderStatus_in.isPartnerPresent() || capLoaderStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 125, column: 4
                  capLoaderStatus_in.setACK(false);//sysj\orchestrator.sysj line: 125, column: 4
                  S126888=1;
                  active[7]=1;
                  ends[7]=1;
                  tdone[7]=1;
                }
                else {
                  S126883=0;
                  if(!capLoaderStatus_in.isREQ()){//sysj\orchestrator.sysj line: 125, column: 4
                    capLoaderStatus_in.setACK(true);//sysj\orchestrator.sysj line: 125, column: 4
                    S126883=1;
                    if(capLoaderStatus_in.isREQ()){//sysj\orchestrator.sysj line: 125, column: 4
                      capLoaderStatus_in.setACK(false);//sysj\orchestrator.sysj line: 125, column: 4
                      ends[7]=2;
                      ;//sysj\orchestrator.sysj line: 125, column: 4
                      capLoaderValue_thread_7 = (capLoaderStatus_in.getVal() == null ? null : ((String)capLoaderStatus_in.getVal()));//sysj\orchestrator.sysj line: 126, column: 4
                      if(capLoaderValue_thread_7 == "busy") {//sysj\orchestrator.sysj line: 127, column: 34
                        System.out.println("Orch received - loader busy");//sysj\orchestrator.sysj line: 128, column: 5
                        Status.capLoaderStat = true;//sysj\orchestrator.sysj line: 129, column: 5
                      }
                      else {//sysj\orchestrator.sysj line: 131, column: 9
                        Status.capLoaderStat = false;//sysj\orchestrator.sysj line: 133, column: 5
                      }
                      S126904=1;
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
            S126904=1;
            S126904=0;
            S126888=0;
            if(!capLoaderStatus_in.isPartnerPresent() || capLoaderStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 125, column: 4
              capLoaderStatus_in.setACK(false);//sysj\orchestrator.sysj line: 125, column: 4
              S126888=1;
              active[7]=1;
              ends[7]=1;
              tdone[7]=1;
            }
            else {
              S126883=0;
              if(!capLoaderStatus_in.isREQ()){//sysj\orchestrator.sysj line: 125, column: 4
                capLoaderStatus_in.setACK(true);//sysj\orchestrator.sysj line: 125, column: 4
                S126883=1;
                if(capLoaderStatus_in.isREQ()){//sysj\orchestrator.sysj line: 125, column: 4
                  capLoaderStatus_in.setACK(false);//sysj\orchestrator.sysj line: 125, column: 4
                  ends[7]=2;
                  ;//sysj\orchestrator.sysj line: 125, column: 4
                  capLoaderValue_thread_7 = (capLoaderStatus_in.getVal() == null ? null : ((String)capLoaderStatus_in.getVal()));//sysj\orchestrator.sysj line: 126, column: 4
                  if(capLoaderValue_thread_7 == "busy") {//sysj\orchestrator.sysj line: 127, column: 34
                    System.out.println("Orch received - loader busy");//sysj\orchestrator.sysj line: 128, column: 5
                    Status.capLoaderStat = true;//sysj\orchestrator.sysj line: 129, column: 5
                  }
                  else {//sysj\orchestrator.sysj line: 131, column: 9
                    Status.capLoaderStat = false;//sysj\orchestrator.sysj line: 133, column: 5
                  }
                  S126904=1;
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

  public void thread127177(int [] tdone, int [] ends){
        switch(S126881){
      case 0 : 
        active[6]=0;
        ends[6]=0;
        tdone[6]=1;
        break;
      
      case 1 : 
        switch(S126833){
          case 0 : 
            switch(S126817){
              case 0 : 
                if(!capperStatus_in.isPartnerPresent() || capperStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 109, column: 4
                  capperStatus_in.setACK(false);//sysj\orchestrator.sysj line: 109, column: 4
                  S126817=1;
                  active[6]=1;
                  ends[6]=1;
                  tdone[6]=1;
                }
                else {
                  switch(S126812){
                    case 0 : 
                      if(!capperStatus_in.isREQ()){//sysj\orchestrator.sysj line: 109, column: 4
                        capperStatus_in.setACK(true);//sysj\orchestrator.sysj line: 109, column: 4
                        S126812=1;
                        if(capperStatus_in.isREQ()){//sysj\orchestrator.sysj line: 109, column: 4
                          capperStatus_in.setACK(false);//sysj\orchestrator.sysj line: 109, column: 4
                          ends[6]=2;
                          ;//sysj\orchestrator.sysj line: 109, column: 4
                          capperValue_thread_6 = (capperStatus_in.getVal() == null ? null : ((String)capperStatus_in.getVal()));//sysj\orchestrator.sysj line: 110, column: 4
                          if(capperValue_thread_6 == "busy") {//sysj\orchestrator.sysj line: 111, column: 31
                            System.out.println("Orch received - capper busy");//sysj\orchestrator.sysj line: 112, column: 5
                            Status.capperStat = true;//sysj\orchestrator.sysj line: 113, column: 5
                          }
                          else {//sysj\orchestrator.sysj line: 115, column: 9
                            Status.capperStat = false;//sysj\orchestrator.sysj line: 117, column: 5
                          }
                          S126833=1;
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
                      if(capperStatus_in.isREQ()){//sysj\orchestrator.sysj line: 109, column: 4
                        capperStatus_in.setACK(false);//sysj\orchestrator.sysj line: 109, column: 4
                        ends[6]=2;
                        ;//sysj\orchestrator.sysj line: 109, column: 4
                        capperValue_thread_6 = (capperStatus_in.getVal() == null ? null : ((String)capperStatus_in.getVal()));//sysj\orchestrator.sysj line: 110, column: 4
                        if(capperValue_thread_6 == "busy") {//sysj\orchestrator.sysj line: 111, column: 31
                          System.out.println("Orch received - capper busy");//sysj\orchestrator.sysj line: 112, column: 5
                          Status.capperStat = true;//sysj\orchestrator.sysj line: 113, column: 5
                        }
                        else {//sysj\orchestrator.sysj line: 115, column: 9
                          Status.capperStat = false;//sysj\orchestrator.sysj line: 117, column: 5
                        }
                        S126833=1;
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
                S126817=1;
                S126817=0;
                if(!capperStatus_in.isPartnerPresent() || capperStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 109, column: 4
                  capperStatus_in.setACK(false);//sysj\orchestrator.sysj line: 109, column: 4
                  S126817=1;
                  active[6]=1;
                  ends[6]=1;
                  tdone[6]=1;
                }
                else {
                  S126812=0;
                  if(!capperStatus_in.isREQ()){//sysj\orchestrator.sysj line: 109, column: 4
                    capperStatus_in.setACK(true);//sysj\orchestrator.sysj line: 109, column: 4
                    S126812=1;
                    if(capperStatus_in.isREQ()){//sysj\orchestrator.sysj line: 109, column: 4
                      capperStatus_in.setACK(false);//sysj\orchestrator.sysj line: 109, column: 4
                      ends[6]=2;
                      ;//sysj\orchestrator.sysj line: 109, column: 4
                      capperValue_thread_6 = (capperStatus_in.getVal() == null ? null : ((String)capperStatus_in.getVal()));//sysj\orchestrator.sysj line: 110, column: 4
                      if(capperValue_thread_6 == "busy") {//sysj\orchestrator.sysj line: 111, column: 31
                        System.out.println("Orch received - capper busy");//sysj\orchestrator.sysj line: 112, column: 5
                        Status.capperStat = true;//sysj\orchestrator.sysj line: 113, column: 5
                      }
                      else {//sysj\orchestrator.sysj line: 115, column: 9
                        Status.capperStat = false;//sysj\orchestrator.sysj line: 117, column: 5
                      }
                      S126833=1;
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
            S126833=1;
            S126833=0;
            S126817=0;
            if(!capperStatus_in.isPartnerPresent() || capperStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 109, column: 4
              capperStatus_in.setACK(false);//sysj\orchestrator.sysj line: 109, column: 4
              S126817=1;
              active[6]=1;
              ends[6]=1;
              tdone[6]=1;
            }
            else {
              S126812=0;
              if(!capperStatus_in.isREQ()){//sysj\orchestrator.sysj line: 109, column: 4
                capperStatus_in.setACK(true);//sysj\orchestrator.sysj line: 109, column: 4
                S126812=1;
                if(capperStatus_in.isREQ()){//sysj\orchestrator.sysj line: 109, column: 4
                  capperStatus_in.setACK(false);//sysj\orchestrator.sysj line: 109, column: 4
                  ends[6]=2;
                  ;//sysj\orchestrator.sysj line: 109, column: 4
                  capperValue_thread_6 = (capperStatus_in.getVal() == null ? null : ((String)capperStatus_in.getVal()));//sysj\orchestrator.sysj line: 110, column: 4
                  if(capperValue_thread_6 == "busy") {//sysj\orchestrator.sysj line: 111, column: 31
                    System.out.println("Orch received - capper busy");//sysj\orchestrator.sysj line: 112, column: 5
                    Status.capperStat = true;//sysj\orchestrator.sysj line: 113, column: 5
                  }
                  else {//sysj\orchestrator.sysj line: 115, column: 9
                    Status.capperStat = false;//sysj\orchestrator.sysj line: 117, column: 5
                  }
                  S126833=1;
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

  public void thread127176(int [] tdone, int [] ends){
        switch(S126810){
      case 0 : 
        active[5]=0;
        ends[5]=0;
        tdone[5]=1;
        break;
      
      case 1 : 
        switch(S126762){
          case 0 : 
            switch(S126746){
              case 0 : 
                if(!fillerStatus_in.isPartnerPresent() || fillerStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 93, column: 4
                  fillerStatus_in.setACK(false);//sysj\orchestrator.sysj line: 93, column: 4
                  S126746=1;
                  active[5]=1;
                  ends[5]=1;
                  tdone[5]=1;
                }
                else {
                  switch(S126741){
                    case 0 : 
                      if(!fillerStatus_in.isREQ()){//sysj\orchestrator.sysj line: 93, column: 4
                        fillerStatus_in.setACK(true);//sysj\orchestrator.sysj line: 93, column: 4
                        S126741=1;
                        if(fillerStatus_in.isREQ()){//sysj\orchestrator.sysj line: 93, column: 4
                          fillerStatus_in.setACK(false);//sysj\orchestrator.sysj line: 93, column: 4
                          ends[5]=2;
                          ;//sysj\orchestrator.sysj line: 93, column: 4
                          fillerValue_thread_5 = (fillerStatus_in.getVal() == null ? null : ((String)fillerStatus_in.getVal()));//sysj\orchestrator.sysj line: 94, column: 4
                          if(fillerValue_thread_5 == "busy") {//sysj\orchestrator.sysj line: 95, column: 31
                            System.out.println("Orch received - filler busy");//sysj\orchestrator.sysj line: 96, column: 5
                            Status.fillerStat = true;//sysj\orchestrator.sysj line: 97, column: 5
                          }
                          else {//sysj\orchestrator.sysj line: 99, column: 9
                            Status.fillerStat = false;//sysj\orchestrator.sysj line: 101, column: 5
                          }
                          S126762=1;
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
                      if(fillerStatus_in.isREQ()){//sysj\orchestrator.sysj line: 93, column: 4
                        fillerStatus_in.setACK(false);//sysj\orchestrator.sysj line: 93, column: 4
                        ends[5]=2;
                        ;//sysj\orchestrator.sysj line: 93, column: 4
                        fillerValue_thread_5 = (fillerStatus_in.getVal() == null ? null : ((String)fillerStatus_in.getVal()));//sysj\orchestrator.sysj line: 94, column: 4
                        if(fillerValue_thread_5 == "busy") {//sysj\orchestrator.sysj line: 95, column: 31
                          System.out.println("Orch received - filler busy");//sysj\orchestrator.sysj line: 96, column: 5
                          Status.fillerStat = true;//sysj\orchestrator.sysj line: 97, column: 5
                        }
                        else {//sysj\orchestrator.sysj line: 99, column: 9
                          Status.fillerStat = false;//sysj\orchestrator.sysj line: 101, column: 5
                        }
                        S126762=1;
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
                S126746=1;
                S126746=0;
                if(!fillerStatus_in.isPartnerPresent() || fillerStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 93, column: 4
                  fillerStatus_in.setACK(false);//sysj\orchestrator.sysj line: 93, column: 4
                  S126746=1;
                  active[5]=1;
                  ends[5]=1;
                  tdone[5]=1;
                }
                else {
                  S126741=0;
                  if(!fillerStatus_in.isREQ()){//sysj\orchestrator.sysj line: 93, column: 4
                    fillerStatus_in.setACK(true);//sysj\orchestrator.sysj line: 93, column: 4
                    S126741=1;
                    if(fillerStatus_in.isREQ()){//sysj\orchestrator.sysj line: 93, column: 4
                      fillerStatus_in.setACK(false);//sysj\orchestrator.sysj line: 93, column: 4
                      ends[5]=2;
                      ;//sysj\orchestrator.sysj line: 93, column: 4
                      fillerValue_thread_5 = (fillerStatus_in.getVal() == null ? null : ((String)fillerStatus_in.getVal()));//sysj\orchestrator.sysj line: 94, column: 4
                      if(fillerValue_thread_5 == "busy") {//sysj\orchestrator.sysj line: 95, column: 31
                        System.out.println("Orch received - filler busy");//sysj\orchestrator.sysj line: 96, column: 5
                        Status.fillerStat = true;//sysj\orchestrator.sysj line: 97, column: 5
                      }
                      else {//sysj\orchestrator.sysj line: 99, column: 9
                        Status.fillerStat = false;//sysj\orchestrator.sysj line: 101, column: 5
                      }
                      S126762=1;
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
            S126762=1;
            S126762=0;
            S126746=0;
            if(!fillerStatus_in.isPartnerPresent() || fillerStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 93, column: 4
              fillerStatus_in.setACK(false);//sysj\orchestrator.sysj line: 93, column: 4
              S126746=1;
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            else {
              S126741=0;
              if(!fillerStatus_in.isREQ()){//sysj\orchestrator.sysj line: 93, column: 4
                fillerStatus_in.setACK(true);//sysj\orchestrator.sysj line: 93, column: 4
                S126741=1;
                if(fillerStatus_in.isREQ()){//sysj\orchestrator.sysj line: 93, column: 4
                  fillerStatus_in.setACK(false);//sysj\orchestrator.sysj line: 93, column: 4
                  ends[5]=2;
                  ;//sysj\orchestrator.sysj line: 93, column: 4
                  fillerValue_thread_5 = (fillerStatus_in.getVal() == null ? null : ((String)fillerStatus_in.getVal()));//sysj\orchestrator.sysj line: 94, column: 4
                  if(fillerValue_thread_5 == "busy") {//sysj\orchestrator.sysj line: 95, column: 31
                    System.out.println("Orch received - filler busy");//sysj\orchestrator.sysj line: 96, column: 5
                    Status.fillerStat = true;//sysj\orchestrator.sysj line: 97, column: 5
                  }
                  else {//sysj\orchestrator.sysj line: 99, column: 9
                    Status.fillerStat = false;//sysj\orchestrator.sysj line: 101, column: 5
                  }
                  S126762=1;
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

  public void thread127175(int [] tdone, int [] ends){
        switch(S126739){
      case 0 : 
        active[4]=0;
        ends[4]=0;
        tdone[4]=1;
        break;
      
      case 1 : 
        switch(S126691){
          case 0 : 
            switch(S126675){
              case 0 : 
                if(!conveyorStatus_in.isPartnerPresent() || conveyorStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 76, column: 4
                  conveyorStatus_in.setACK(false);//sysj\orchestrator.sysj line: 76, column: 4
                  S126675=1;
                  active[4]=1;
                  ends[4]=1;
                  tdone[4]=1;
                }
                else {
                  switch(S126670){
                    case 0 : 
                      if(!conveyorStatus_in.isREQ()){//sysj\orchestrator.sysj line: 76, column: 4
                        conveyorStatus_in.setACK(true);//sysj\orchestrator.sysj line: 76, column: 4
                        S126670=1;
                        if(conveyorStatus_in.isREQ()){//sysj\orchestrator.sysj line: 76, column: 4
                          conveyorStatus_in.setACK(false);//sysj\orchestrator.sysj line: 76, column: 4
                          ends[4]=2;
                          ;//sysj\orchestrator.sysj line: 76, column: 4
                          conveyValue_thread_4 = (conveyorStatus_in.getVal() == null ? null : ((String)conveyorStatus_in.getVal()));//sysj\orchestrator.sysj line: 77, column: 4
                          if(conveyValue_thread_4 == "busy") {//sysj\orchestrator.sysj line: 78, column: 31
                            System.out.println("Orch received - convey busy");//sysj\orchestrator.sysj line: 79, column: 5
                            Status.conveyStat = true;//sysj\orchestrator.sysj line: 80, column: 5
                          }
                          else {//sysj\orchestrator.sysj line: 82, column: 9
                            Status.conveyStat = false;//sysj\orchestrator.sysj line: 84, column: 5
                          }
                          S126691=1;
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
                      if(conveyorStatus_in.isREQ()){//sysj\orchestrator.sysj line: 76, column: 4
                        conveyorStatus_in.setACK(false);//sysj\orchestrator.sysj line: 76, column: 4
                        ends[4]=2;
                        ;//sysj\orchestrator.sysj line: 76, column: 4
                        conveyValue_thread_4 = (conveyorStatus_in.getVal() == null ? null : ((String)conveyorStatus_in.getVal()));//sysj\orchestrator.sysj line: 77, column: 4
                        if(conveyValue_thread_4 == "busy") {//sysj\orchestrator.sysj line: 78, column: 31
                          System.out.println("Orch received - convey busy");//sysj\orchestrator.sysj line: 79, column: 5
                          Status.conveyStat = true;//sysj\orchestrator.sysj line: 80, column: 5
                        }
                        else {//sysj\orchestrator.sysj line: 82, column: 9
                          Status.conveyStat = false;//sysj\orchestrator.sysj line: 84, column: 5
                        }
                        S126691=1;
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
                S126675=1;
                S126675=0;
                if(!conveyorStatus_in.isPartnerPresent() || conveyorStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 76, column: 4
                  conveyorStatus_in.setACK(false);//sysj\orchestrator.sysj line: 76, column: 4
                  S126675=1;
                  active[4]=1;
                  ends[4]=1;
                  tdone[4]=1;
                }
                else {
                  S126670=0;
                  if(!conveyorStatus_in.isREQ()){//sysj\orchestrator.sysj line: 76, column: 4
                    conveyorStatus_in.setACK(true);//sysj\orchestrator.sysj line: 76, column: 4
                    S126670=1;
                    if(conveyorStatus_in.isREQ()){//sysj\orchestrator.sysj line: 76, column: 4
                      conveyorStatus_in.setACK(false);//sysj\orchestrator.sysj line: 76, column: 4
                      ends[4]=2;
                      ;//sysj\orchestrator.sysj line: 76, column: 4
                      conveyValue_thread_4 = (conveyorStatus_in.getVal() == null ? null : ((String)conveyorStatus_in.getVal()));//sysj\orchestrator.sysj line: 77, column: 4
                      if(conveyValue_thread_4 == "busy") {//sysj\orchestrator.sysj line: 78, column: 31
                        System.out.println("Orch received - convey busy");//sysj\orchestrator.sysj line: 79, column: 5
                        Status.conveyStat = true;//sysj\orchestrator.sysj line: 80, column: 5
                      }
                      else {//sysj\orchestrator.sysj line: 82, column: 9
                        Status.conveyStat = false;//sysj\orchestrator.sysj line: 84, column: 5
                      }
                      S126691=1;
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
            S126691=1;
            S126691=0;
            S126675=0;
            if(!conveyorStatus_in.isPartnerPresent() || conveyorStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 76, column: 4
              conveyorStatus_in.setACK(false);//sysj\orchestrator.sysj line: 76, column: 4
              S126675=1;
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            else {
              S126670=0;
              if(!conveyorStatus_in.isREQ()){//sysj\orchestrator.sysj line: 76, column: 4
                conveyorStatus_in.setACK(true);//sysj\orchestrator.sysj line: 76, column: 4
                S126670=1;
                if(conveyorStatus_in.isREQ()){//sysj\orchestrator.sysj line: 76, column: 4
                  conveyorStatus_in.setACK(false);//sysj\orchestrator.sysj line: 76, column: 4
                  ends[4]=2;
                  ;//sysj\orchestrator.sysj line: 76, column: 4
                  conveyValue_thread_4 = (conveyorStatus_in.getVal() == null ? null : ((String)conveyorStatus_in.getVal()));//sysj\orchestrator.sysj line: 77, column: 4
                  if(conveyValue_thread_4 == "busy") {//sysj\orchestrator.sysj line: 78, column: 31
                    System.out.println("Orch received - convey busy");//sysj\orchestrator.sysj line: 79, column: 5
                    Status.conveyStat = true;//sysj\orchestrator.sysj line: 80, column: 5
                  }
                  else {//sysj\orchestrator.sysj line: 82, column: 9
                    Status.conveyStat = false;//sysj\orchestrator.sysj line: 84, column: 5
                  }
                  S126691=1;
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

  public void thread127174(int [] tdone, int [] ends){
        switch(S126668){
      case 0 : 
        active[3]=0;
        ends[3]=0;
        tdone[3]=1;
        break;
      
      case 1 : 
        switch(S120512){
          case 0 : 
            switch(S120496){
              case 0 : 
                if(!rotaryStatus_in.isPartnerPresent() || rotaryStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 53, column: 4
                  rotaryStatus_in.setACK(false);//sysj\orchestrator.sysj line: 53, column: 4
                  S120496=1;
                  active[3]=1;
                  ends[3]=1;
                  tdone[3]=1;
                }
                else {
                  switch(S120491){
                    case 0 : 
                      if(!rotaryStatus_in.isREQ()){//sysj\orchestrator.sysj line: 53, column: 4
                        rotaryStatus_in.setACK(true);//sysj\orchestrator.sysj line: 53, column: 4
                        S120491=1;
                        if(rotaryStatus_in.isREQ()){//sysj\orchestrator.sysj line: 53, column: 4
                          rotaryStatus_in.setACK(false);//sysj\orchestrator.sysj line: 53, column: 4
                          ends[3]=2;
                          ;//sysj\orchestrator.sysj line: 53, column: 4
                          rotaryStat_thread_3 = (rotaryStatus_in.getVal() == null ? null : ((String)rotaryStatus_in.getVal()));//sysj\orchestrator.sysj line: 54, column: 4
                          S120512=1;
                          if(rotaryStat_thread_3 == "done"){//sysj\orchestrator.sysj line: 57, column: 7
                            S121021=0;
                            System.out.println("rotary done, sending filler,loader,screwer, conveyor reqs");//sysj\orchestrator.sysj line: 58, column: 5
                            S120557=0;
                            S120519=0;
                            if(!fillerReq_o.isPartnerPresent() || fillerReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 59, column: 5
                              fillerReq_o.setREQ(false);//sysj\orchestrator.sysj line: 59, column: 5
                              S120519=1;
                              active[3]=1;
                              ends[3]=1;
                              tdone[3]=1;
                            }
                            else {
                              S120514=0;
                              if(fillerReq_o.isACK()){//sysj\orchestrator.sysj line: 59, column: 5
                                fillerReq_o.setVal(true);//sysj\orchestrator.sysj line: 59, column: 5
                                S120514=1;
                                if(!fillerReq_o.isACK()){//sysj\orchestrator.sysj line: 59, column: 5
                                  fillerReq_o.setREQ(false);//sysj\orchestrator.sysj line: 59, column: 5
                                  ends[3]=2;
                                  ;//sysj\orchestrator.sysj line: 59, column: 5
                                  S120557=1;
                                  S120564=0;
                                  if(!capLoaderReq_o.isPartnerPresent() || capLoaderReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 60, column: 5
                                    capLoaderReq_o.setREQ(false);//sysj\orchestrator.sysj line: 60, column: 5
                                    S120564=1;
                                    active[3]=1;
                                    ends[3]=1;
                                    tdone[3]=1;
                                  }
                                  else {
                                    S120559=0;
                                    if(capLoaderReq_o.isACK()){//sysj\orchestrator.sysj line: 60, column: 5
                                      capLoaderReq_o.setVal(true);//sysj\orchestrator.sysj line: 60, column: 5
                                      S120559=1;
                                      if(!capLoaderReq_o.isACK()){//sysj\orchestrator.sysj line: 60, column: 5
                                        capLoaderReq_o.setREQ(false);//sysj\orchestrator.sysj line: 60, column: 5
                                        ends[3]=2;
                                        ;//sysj\orchestrator.sysj line: 60, column: 5
                                        S120557=2;
                                        S120652=0;
                                        if(!capperReq_o.isPartnerPresent() || capperReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 61, column: 5
                                          capperReq_o.setREQ(false);//sysj\orchestrator.sysj line: 61, column: 5
                                          S120652=1;
                                          active[3]=1;
                                          ends[3]=1;
                                          tdone[3]=1;
                                        }
                                        else {
                                          S120647=0;
                                          if(capperReq_o.isACK()){//sysj\orchestrator.sysj line: 61, column: 5
                                            capperReq_o.setVal(true);//sysj\orchestrator.sysj line: 61, column: 5
                                            S120647=1;
                                            if(!capperReq_o.isACK()){//sysj\orchestrator.sysj line: 61, column: 5
                                              capperReq_o.setREQ(false);//sysj\orchestrator.sysj line: 61, column: 5
                                              ends[3]=2;
                                              ;//sysj\orchestrator.sysj line: 61, column: 5
                                              getNextBottle_1.setPresent();//sysj\orchestrator.sysj line: 62, column: 5
                                              currsigs.addElement(getNextBottle_1);
                                              S120512=2;
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
                            S121021=1;
                            S120888=0;
                            S120784=0;
                            if(!fillerReq_o.isPartnerPresent() || fillerReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 65, column: 5
                              fillerReq_o.setREQ(false);//sysj\orchestrator.sysj line: 65, column: 5
                              S120784=1;
                              active[3]=1;
                              ends[3]=1;
                              tdone[3]=1;
                            }
                            else {
                              S120779=0;
                              if(fillerReq_o.isACK()){//sysj\orchestrator.sysj line: 65, column: 5
                                fillerReq_o.setVal(false);//sysj\orchestrator.sysj line: 65, column: 5
                                S120779=1;
                                if(!fillerReq_o.isACK()){//sysj\orchestrator.sysj line: 65, column: 5
                                  fillerReq_o.setREQ(false);//sysj\orchestrator.sysj line: 65, column: 5
                                  ends[3]=2;
                                  ;//sysj\orchestrator.sysj line: 65, column: 5
                                  S120888=1;
                                  S120806=0;
                                  if(!capLoaderReq_o.isPartnerPresent() || capLoaderReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 66, column: 5
                                    capLoaderReq_o.setREQ(false);//sysj\orchestrator.sysj line: 66, column: 5
                                    S120806=1;
                                    active[3]=1;
                                    ends[3]=1;
                                    tdone[3]=1;
                                  }
                                  else {
                                    S120801=0;
                                    if(capLoaderReq_o.isACK()){//sysj\orchestrator.sysj line: 66, column: 5
                                      capLoaderReq_o.setVal(false);//sysj\orchestrator.sysj line: 66, column: 5
                                      S120801=1;
                                      if(!capLoaderReq_o.isACK()){//sysj\orchestrator.sysj line: 66, column: 5
                                        capLoaderReq_o.setREQ(false);//sysj\orchestrator.sysj line: 66, column: 5
                                        ends[3]=2;
                                        ;//sysj\orchestrator.sysj line: 66, column: 5
                                        S120888=2;
                                        S120895=0;
                                        if(!capperReq_o.isPartnerPresent() || capperReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 67, column: 5
                                          capperReq_o.setREQ(false);//sysj\orchestrator.sysj line: 67, column: 5
                                          S120895=1;
                                          active[3]=1;
                                          ends[3]=1;
                                          tdone[3]=1;
                                        }
                                        else {
                                          S120890=0;
                                          if(capperReq_o.isACK()){//sysj\orchestrator.sysj line: 67, column: 5
                                            capperReq_o.setVal(false);//sysj\orchestrator.sysj line: 67, column: 5
                                            S120890=1;
                                            if(!capperReq_o.isACK()){//sysj\orchestrator.sysj line: 67, column: 5
                                              capperReq_o.setREQ(false);//sysj\orchestrator.sysj line: 67, column: 5
                                              ends[3]=2;
                                              ;//sysj\orchestrator.sysj line: 67, column: 5
                                              S120512=2;
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
                        S120512=1;
                        if(rotaryStat_thread_3 == "done"){//sysj\orchestrator.sysj line: 57, column: 7
                          S121021=0;
                          System.out.println("rotary done, sending filler,loader,screwer, conveyor reqs");//sysj\orchestrator.sysj line: 58, column: 5
                          S120557=0;
                          S120519=0;
                          if(!fillerReq_o.isPartnerPresent() || fillerReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 59, column: 5
                            fillerReq_o.setREQ(false);//sysj\orchestrator.sysj line: 59, column: 5
                            S120519=1;
                            active[3]=1;
                            ends[3]=1;
                            tdone[3]=1;
                          }
                          else {
                            S120514=0;
                            if(fillerReq_o.isACK()){//sysj\orchestrator.sysj line: 59, column: 5
                              fillerReq_o.setVal(true);//sysj\orchestrator.sysj line: 59, column: 5
                              S120514=1;
                              if(!fillerReq_o.isACK()){//sysj\orchestrator.sysj line: 59, column: 5
                                fillerReq_o.setREQ(false);//sysj\orchestrator.sysj line: 59, column: 5
                                ends[3]=2;
                                ;//sysj\orchestrator.sysj line: 59, column: 5
                                S120557=1;
                                S120564=0;
                                if(!capLoaderReq_o.isPartnerPresent() || capLoaderReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 60, column: 5
                                  capLoaderReq_o.setREQ(false);//sysj\orchestrator.sysj line: 60, column: 5
                                  S120564=1;
                                  active[3]=1;
                                  ends[3]=1;
                                  tdone[3]=1;
                                }
                                else {
                                  S120559=0;
                                  if(capLoaderReq_o.isACK()){//sysj\orchestrator.sysj line: 60, column: 5
                                    capLoaderReq_o.setVal(true);//sysj\orchestrator.sysj line: 60, column: 5
                                    S120559=1;
                                    if(!capLoaderReq_o.isACK()){//sysj\orchestrator.sysj line: 60, column: 5
                                      capLoaderReq_o.setREQ(false);//sysj\orchestrator.sysj line: 60, column: 5
                                      ends[3]=2;
                                      ;//sysj\orchestrator.sysj line: 60, column: 5
                                      S120557=2;
                                      S120652=0;
                                      if(!capperReq_o.isPartnerPresent() || capperReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 61, column: 5
                                        capperReq_o.setREQ(false);//sysj\orchestrator.sysj line: 61, column: 5
                                        S120652=1;
                                        active[3]=1;
                                        ends[3]=1;
                                        tdone[3]=1;
                                      }
                                      else {
                                        S120647=0;
                                        if(capperReq_o.isACK()){//sysj\orchestrator.sysj line: 61, column: 5
                                          capperReq_o.setVal(true);//sysj\orchestrator.sysj line: 61, column: 5
                                          S120647=1;
                                          if(!capperReq_o.isACK()){//sysj\orchestrator.sysj line: 61, column: 5
                                            capperReq_o.setREQ(false);//sysj\orchestrator.sysj line: 61, column: 5
                                            ends[3]=2;
                                            ;//sysj\orchestrator.sysj line: 61, column: 5
                                            getNextBottle_1.setPresent();//sysj\orchestrator.sysj line: 62, column: 5
                                            currsigs.addElement(getNextBottle_1);
                                            S120512=2;
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
                          S121021=1;
                          S120888=0;
                          S120784=0;
                          if(!fillerReq_o.isPartnerPresent() || fillerReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 65, column: 5
                            fillerReq_o.setREQ(false);//sysj\orchestrator.sysj line: 65, column: 5
                            S120784=1;
                            active[3]=1;
                            ends[3]=1;
                            tdone[3]=1;
                          }
                          else {
                            S120779=0;
                            if(fillerReq_o.isACK()){//sysj\orchestrator.sysj line: 65, column: 5
                              fillerReq_o.setVal(false);//sysj\orchestrator.sysj line: 65, column: 5
                              S120779=1;
                              if(!fillerReq_o.isACK()){//sysj\orchestrator.sysj line: 65, column: 5
                                fillerReq_o.setREQ(false);//sysj\orchestrator.sysj line: 65, column: 5
                                ends[3]=2;
                                ;//sysj\orchestrator.sysj line: 65, column: 5
                                S120888=1;
                                S120806=0;
                                if(!capLoaderReq_o.isPartnerPresent() || capLoaderReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 66, column: 5
                                  capLoaderReq_o.setREQ(false);//sysj\orchestrator.sysj line: 66, column: 5
                                  S120806=1;
                                  active[3]=1;
                                  ends[3]=1;
                                  tdone[3]=1;
                                }
                                else {
                                  S120801=0;
                                  if(capLoaderReq_o.isACK()){//sysj\orchestrator.sysj line: 66, column: 5
                                    capLoaderReq_o.setVal(false);//sysj\orchestrator.sysj line: 66, column: 5
                                    S120801=1;
                                    if(!capLoaderReq_o.isACK()){//sysj\orchestrator.sysj line: 66, column: 5
                                      capLoaderReq_o.setREQ(false);//sysj\orchestrator.sysj line: 66, column: 5
                                      ends[3]=2;
                                      ;//sysj\orchestrator.sysj line: 66, column: 5
                                      S120888=2;
                                      S120895=0;
                                      if(!capperReq_o.isPartnerPresent() || capperReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 67, column: 5
                                        capperReq_o.setREQ(false);//sysj\orchestrator.sysj line: 67, column: 5
                                        S120895=1;
                                        active[3]=1;
                                        ends[3]=1;
                                        tdone[3]=1;
                                      }
                                      else {
                                        S120890=0;
                                        if(capperReq_o.isACK()){//sysj\orchestrator.sysj line: 67, column: 5
                                          capperReq_o.setVal(false);//sysj\orchestrator.sysj line: 67, column: 5
                                          S120890=1;
                                          if(!capperReq_o.isACK()){//sysj\orchestrator.sysj line: 67, column: 5
                                            capperReq_o.setREQ(false);//sysj\orchestrator.sysj line: 67, column: 5
                                            ends[3]=2;
                                            ;//sysj\orchestrator.sysj line: 67, column: 5
                                            S120512=2;
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
                S120496=1;
                S120496=0;
                if(!rotaryStatus_in.isPartnerPresent() || rotaryStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 53, column: 4
                  rotaryStatus_in.setACK(false);//sysj\orchestrator.sysj line: 53, column: 4
                  S120496=1;
                  active[3]=1;
                  ends[3]=1;
                  tdone[3]=1;
                }
                else {
                  S120491=0;
                  if(!rotaryStatus_in.isREQ()){//sysj\orchestrator.sysj line: 53, column: 4
                    rotaryStatus_in.setACK(true);//sysj\orchestrator.sysj line: 53, column: 4
                    S120491=1;
                    if(rotaryStatus_in.isREQ()){//sysj\orchestrator.sysj line: 53, column: 4
                      rotaryStatus_in.setACK(false);//sysj\orchestrator.sysj line: 53, column: 4
                      ends[3]=2;
                      ;//sysj\orchestrator.sysj line: 53, column: 4
                      rotaryStat_thread_3 = (rotaryStatus_in.getVal() == null ? null : ((String)rotaryStatus_in.getVal()));//sysj\orchestrator.sysj line: 54, column: 4
                      S120512=1;
                      if(rotaryStat_thread_3 == "done"){//sysj\orchestrator.sysj line: 57, column: 7
                        S121021=0;
                        System.out.println("rotary done, sending filler,loader,screwer, conveyor reqs");//sysj\orchestrator.sysj line: 58, column: 5
                        S120557=0;
                        S120519=0;
                        if(!fillerReq_o.isPartnerPresent() || fillerReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 59, column: 5
                          fillerReq_o.setREQ(false);//sysj\orchestrator.sysj line: 59, column: 5
                          S120519=1;
                          active[3]=1;
                          ends[3]=1;
                          tdone[3]=1;
                        }
                        else {
                          S120514=0;
                          if(fillerReq_o.isACK()){//sysj\orchestrator.sysj line: 59, column: 5
                            fillerReq_o.setVal(true);//sysj\orchestrator.sysj line: 59, column: 5
                            S120514=1;
                            if(!fillerReq_o.isACK()){//sysj\orchestrator.sysj line: 59, column: 5
                              fillerReq_o.setREQ(false);//sysj\orchestrator.sysj line: 59, column: 5
                              ends[3]=2;
                              ;//sysj\orchestrator.sysj line: 59, column: 5
                              S120557=1;
                              S120564=0;
                              if(!capLoaderReq_o.isPartnerPresent() || capLoaderReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 60, column: 5
                                capLoaderReq_o.setREQ(false);//sysj\orchestrator.sysj line: 60, column: 5
                                S120564=1;
                                active[3]=1;
                                ends[3]=1;
                                tdone[3]=1;
                              }
                              else {
                                S120559=0;
                                if(capLoaderReq_o.isACK()){//sysj\orchestrator.sysj line: 60, column: 5
                                  capLoaderReq_o.setVal(true);//sysj\orchestrator.sysj line: 60, column: 5
                                  S120559=1;
                                  if(!capLoaderReq_o.isACK()){//sysj\orchestrator.sysj line: 60, column: 5
                                    capLoaderReq_o.setREQ(false);//sysj\orchestrator.sysj line: 60, column: 5
                                    ends[3]=2;
                                    ;//sysj\orchestrator.sysj line: 60, column: 5
                                    S120557=2;
                                    S120652=0;
                                    if(!capperReq_o.isPartnerPresent() || capperReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 61, column: 5
                                      capperReq_o.setREQ(false);//sysj\orchestrator.sysj line: 61, column: 5
                                      S120652=1;
                                      active[3]=1;
                                      ends[3]=1;
                                      tdone[3]=1;
                                    }
                                    else {
                                      S120647=0;
                                      if(capperReq_o.isACK()){//sysj\orchestrator.sysj line: 61, column: 5
                                        capperReq_o.setVal(true);//sysj\orchestrator.sysj line: 61, column: 5
                                        S120647=1;
                                        if(!capperReq_o.isACK()){//sysj\orchestrator.sysj line: 61, column: 5
                                          capperReq_o.setREQ(false);//sysj\orchestrator.sysj line: 61, column: 5
                                          ends[3]=2;
                                          ;//sysj\orchestrator.sysj line: 61, column: 5
                                          getNextBottle_1.setPresent();//sysj\orchestrator.sysj line: 62, column: 5
                                          currsigs.addElement(getNextBottle_1);
                                          S120512=2;
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
                        S121021=1;
                        S120888=0;
                        S120784=0;
                        if(!fillerReq_o.isPartnerPresent() || fillerReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 65, column: 5
                          fillerReq_o.setREQ(false);//sysj\orchestrator.sysj line: 65, column: 5
                          S120784=1;
                          active[3]=1;
                          ends[3]=1;
                          tdone[3]=1;
                        }
                        else {
                          S120779=0;
                          if(fillerReq_o.isACK()){//sysj\orchestrator.sysj line: 65, column: 5
                            fillerReq_o.setVal(false);//sysj\orchestrator.sysj line: 65, column: 5
                            S120779=1;
                            if(!fillerReq_o.isACK()){//sysj\orchestrator.sysj line: 65, column: 5
                              fillerReq_o.setREQ(false);//sysj\orchestrator.sysj line: 65, column: 5
                              ends[3]=2;
                              ;//sysj\orchestrator.sysj line: 65, column: 5
                              S120888=1;
                              S120806=0;
                              if(!capLoaderReq_o.isPartnerPresent() || capLoaderReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 66, column: 5
                                capLoaderReq_o.setREQ(false);//sysj\orchestrator.sysj line: 66, column: 5
                                S120806=1;
                                active[3]=1;
                                ends[3]=1;
                                tdone[3]=1;
                              }
                              else {
                                S120801=0;
                                if(capLoaderReq_o.isACK()){//sysj\orchestrator.sysj line: 66, column: 5
                                  capLoaderReq_o.setVal(false);//sysj\orchestrator.sysj line: 66, column: 5
                                  S120801=1;
                                  if(!capLoaderReq_o.isACK()){//sysj\orchestrator.sysj line: 66, column: 5
                                    capLoaderReq_o.setREQ(false);//sysj\orchestrator.sysj line: 66, column: 5
                                    ends[3]=2;
                                    ;//sysj\orchestrator.sysj line: 66, column: 5
                                    S120888=2;
                                    S120895=0;
                                    if(!capperReq_o.isPartnerPresent() || capperReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 67, column: 5
                                      capperReq_o.setREQ(false);//sysj\orchestrator.sysj line: 67, column: 5
                                      S120895=1;
                                      active[3]=1;
                                      ends[3]=1;
                                      tdone[3]=1;
                                    }
                                    else {
                                      S120890=0;
                                      if(capperReq_o.isACK()){//sysj\orchestrator.sysj line: 67, column: 5
                                        capperReq_o.setVal(false);//sysj\orchestrator.sysj line: 67, column: 5
                                        S120890=1;
                                        if(!capperReq_o.isACK()){//sysj\orchestrator.sysj line: 67, column: 5
                                          capperReq_o.setREQ(false);//sysj\orchestrator.sysj line: 67, column: 5
                                          ends[3]=2;
                                          ;//sysj\orchestrator.sysj line: 67, column: 5
                                          S120512=2;
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
            switch(S121021){
              case 0 : 
                switch(S120557){
                  case 0 : 
                    switch(S120519){
                      case 0 : 
                        if(!fillerReq_o.isPartnerPresent() || fillerReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 59, column: 5
                          fillerReq_o.setREQ(false);//sysj\orchestrator.sysj line: 59, column: 5
                          S120519=1;
                          active[3]=1;
                          ends[3]=1;
                          tdone[3]=1;
                        }
                        else {
                          switch(S120514){
                            case 0 : 
                              if(fillerReq_o.isACK()){//sysj\orchestrator.sysj line: 59, column: 5
                                fillerReq_o.setVal(true);//sysj\orchestrator.sysj line: 59, column: 5
                                S120514=1;
                                if(!fillerReq_o.isACK()){//sysj\orchestrator.sysj line: 59, column: 5
                                  fillerReq_o.setREQ(false);//sysj\orchestrator.sysj line: 59, column: 5
                                  ends[3]=2;
                                  ;//sysj\orchestrator.sysj line: 59, column: 5
                                  S120557=1;
                                  S120564=0;
                                  if(!capLoaderReq_o.isPartnerPresent() || capLoaderReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 60, column: 5
                                    capLoaderReq_o.setREQ(false);//sysj\orchestrator.sysj line: 60, column: 5
                                    S120564=1;
                                    active[3]=1;
                                    ends[3]=1;
                                    tdone[3]=1;
                                  }
                                  else {
                                    S120559=0;
                                    if(capLoaderReq_o.isACK()){//sysj\orchestrator.sysj line: 60, column: 5
                                      capLoaderReq_o.setVal(true);//sysj\orchestrator.sysj line: 60, column: 5
                                      S120559=1;
                                      if(!capLoaderReq_o.isACK()){//sysj\orchestrator.sysj line: 60, column: 5
                                        capLoaderReq_o.setREQ(false);//sysj\orchestrator.sysj line: 60, column: 5
                                        ends[3]=2;
                                        ;//sysj\orchestrator.sysj line: 60, column: 5
                                        S120557=2;
                                        S120652=0;
                                        if(!capperReq_o.isPartnerPresent() || capperReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 61, column: 5
                                          capperReq_o.setREQ(false);//sysj\orchestrator.sysj line: 61, column: 5
                                          S120652=1;
                                          active[3]=1;
                                          ends[3]=1;
                                          tdone[3]=1;
                                        }
                                        else {
                                          S120647=0;
                                          if(capperReq_o.isACK()){//sysj\orchestrator.sysj line: 61, column: 5
                                            capperReq_o.setVal(true);//sysj\orchestrator.sysj line: 61, column: 5
                                            S120647=1;
                                            if(!capperReq_o.isACK()){//sysj\orchestrator.sysj line: 61, column: 5
                                              capperReq_o.setREQ(false);//sysj\orchestrator.sysj line: 61, column: 5
                                              ends[3]=2;
                                              ;//sysj\orchestrator.sysj line: 61, column: 5
                                              getNextBottle_1.setPresent();//sysj\orchestrator.sysj line: 62, column: 5
                                              currsigs.addElement(getNextBottle_1);
                                              S120512=2;
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
                              if(!fillerReq_o.isACK()){//sysj\orchestrator.sysj line: 59, column: 5
                                fillerReq_o.setREQ(false);//sysj\orchestrator.sysj line: 59, column: 5
                                ends[3]=2;
                                ;//sysj\orchestrator.sysj line: 59, column: 5
                                S120557=1;
                                S120564=0;
                                if(!capLoaderReq_o.isPartnerPresent() || capLoaderReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 60, column: 5
                                  capLoaderReq_o.setREQ(false);//sysj\orchestrator.sysj line: 60, column: 5
                                  S120564=1;
                                  active[3]=1;
                                  ends[3]=1;
                                  tdone[3]=1;
                                }
                                else {
                                  S120559=0;
                                  if(capLoaderReq_o.isACK()){//sysj\orchestrator.sysj line: 60, column: 5
                                    capLoaderReq_o.setVal(true);//sysj\orchestrator.sysj line: 60, column: 5
                                    S120559=1;
                                    if(!capLoaderReq_o.isACK()){//sysj\orchestrator.sysj line: 60, column: 5
                                      capLoaderReq_o.setREQ(false);//sysj\orchestrator.sysj line: 60, column: 5
                                      ends[3]=2;
                                      ;//sysj\orchestrator.sysj line: 60, column: 5
                                      S120557=2;
                                      S120652=0;
                                      if(!capperReq_o.isPartnerPresent() || capperReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 61, column: 5
                                        capperReq_o.setREQ(false);//sysj\orchestrator.sysj line: 61, column: 5
                                        S120652=1;
                                        active[3]=1;
                                        ends[3]=1;
                                        tdone[3]=1;
                                      }
                                      else {
                                        S120647=0;
                                        if(capperReq_o.isACK()){//sysj\orchestrator.sysj line: 61, column: 5
                                          capperReq_o.setVal(true);//sysj\orchestrator.sysj line: 61, column: 5
                                          S120647=1;
                                          if(!capperReq_o.isACK()){//sysj\orchestrator.sysj line: 61, column: 5
                                            capperReq_o.setREQ(false);//sysj\orchestrator.sysj line: 61, column: 5
                                            ends[3]=2;
                                            ;//sysj\orchestrator.sysj line: 61, column: 5
                                            getNextBottle_1.setPresent();//sysj\orchestrator.sysj line: 62, column: 5
                                            currsigs.addElement(getNextBottle_1);
                                            S120512=2;
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
                        S120519=1;
                        S120519=0;
                        if(!fillerReq_o.isPartnerPresent() || fillerReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 59, column: 5
                          fillerReq_o.setREQ(false);//sysj\orchestrator.sysj line: 59, column: 5
                          S120519=1;
                          active[3]=1;
                          ends[3]=1;
                          tdone[3]=1;
                        }
                        else {
                          S120514=0;
                          if(fillerReq_o.isACK()){//sysj\orchestrator.sysj line: 59, column: 5
                            fillerReq_o.setVal(true);//sysj\orchestrator.sysj line: 59, column: 5
                            S120514=1;
                            if(!fillerReq_o.isACK()){//sysj\orchestrator.sysj line: 59, column: 5
                              fillerReq_o.setREQ(false);//sysj\orchestrator.sysj line: 59, column: 5
                              ends[3]=2;
                              ;//sysj\orchestrator.sysj line: 59, column: 5
                              S120557=1;
                              S120564=0;
                              if(!capLoaderReq_o.isPartnerPresent() || capLoaderReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 60, column: 5
                                capLoaderReq_o.setREQ(false);//sysj\orchestrator.sysj line: 60, column: 5
                                S120564=1;
                                active[3]=1;
                                ends[3]=1;
                                tdone[3]=1;
                              }
                              else {
                                S120559=0;
                                if(capLoaderReq_o.isACK()){//sysj\orchestrator.sysj line: 60, column: 5
                                  capLoaderReq_o.setVal(true);//sysj\orchestrator.sysj line: 60, column: 5
                                  S120559=1;
                                  if(!capLoaderReq_o.isACK()){//sysj\orchestrator.sysj line: 60, column: 5
                                    capLoaderReq_o.setREQ(false);//sysj\orchestrator.sysj line: 60, column: 5
                                    ends[3]=2;
                                    ;//sysj\orchestrator.sysj line: 60, column: 5
                                    S120557=2;
                                    S120652=0;
                                    if(!capperReq_o.isPartnerPresent() || capperReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 61, column: 5
                                      capperReq_o.setREQ(false);//sysj\orchestrator.sysj line: 61, column: 5
                                      S120652=1;
                                      active[3]=1;
                                      ends[3]=1;
                                      tdone[3]=1;
                                    }
                                    else {
                                      S120647=0;
                                      if(capperReq_o.isACK()){//sysj\orchestrator.sysj line: 61, column: 5
                                        capperReq_o.setVal(true);//sysj\orchestrator.sysj line: 61, column: 5
                                        S120647=1;
                                        if(!capperReq_o.isACK()){//sysj\orchestrator.sysj line: 61, column: 5
                                          capperReq_o.setREQ(false);//sysj\orchestrator.sysj line: 61, column: 5
                                          ends[3]=2;
                                          ;//sysj\orchestrator.sysj line: 61, column: 5
                                          getNextBottle_1.setPresent();//sysj\orchestrator.sysj line: 62, column: 5
                                          currsigs.addElement(getNextBottle_1);
                                          S120512=2;
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
                    switch(S120564){
                      case 0 : 
                        if(!capLoaderReq_o.isPartnerPresent() || capLoaderReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 60, column: 5
                          capLoaderReq_o.setREQ(false);//sysj\orchestrator.sysj line: 60, column: 5
                          S120564=1;
                          active[3]=1;
                          ends[3]=1;
                          tdone[3]=1;
                        }
                        else {
                          switch(S120559){
                            case 0 : 
                              if(capLoaderReq_o.isACK()){//sysj\orchestrator.sysj line: 60, column: 5
                                capLoaderReq_o.setVal(true);//sysj\orchestrator.sysj line: 60, column: 5
                                S120559=1;
                                if(!capLoaderReq_o.isACK()){//sysj\orchestrator.sysj line: 60, column: 5
                                  capLoaderReq_o.setREQ(false);//sysj\orchestrator.sysj line: 60, column: 5
                                  ends[3]=2;
                                  ;//sysj\orchestrator.sysj line: 60, column: 5
                                  S120557=2;
                                  S120652=0;
                                  if(!capperReq_o.isPartnerPresent() || capperReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 61, column: 5
                                    capperReq_o.setREQ(false);//sysj\orchestrator.sysj line: 61, column: 5
                                    S120652=1;
                                    active[3]=1;
                                    ends[3]=1;
                                    tdone[3]=1;
                                  }
                                  else {
                                    S120647=0;
                                    if(capperReq_o.isACK()){//sysj\orchestrator.sysj line: 61, column: 5
                                      capperReq_o.setVal(true);//sysj\orchestrator.sysj line: 61, column: 5
                                      S120647=1;
                                      if(!capperReq_o.isACK()){//sysj\orchestrator.sysj line: 61, column: 5
                                        capperReq_o.setREQ(false);//sysj\orchestrator.sysj line: 61, column: 5
                                        ends[3]=2;
                                        ;//sysj\orchestrator.sysj line: 61, column: 5
                                        getNextBottle_1.setPresent();//sysj\orchestrator.sysj line: 62, column: 5
                                        currsigs.addElement(getNextBottle_1);
                                        S120512=2;
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
                              if(!capLoaderReq_o.isACK()){//sysj\orchestrator.sysj line: 60, column: 5
                                capLoaderReq_o.setREQ(false);//sysj\orchestrator.sysj line: 60, column: 5
                                ends[3]=2;
                                ;//sysj\orchestrator.sysj line: 60, column: 5
                                S120557=2;
                                S120652=0;
                                if(!capperReq_o.isPartnerPresent() || capperReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 61, column: 5
                                  capperReq_o.setREQ(false);//sysj\orchestrator.sysj line: 61, column: 5
                                  S120652=1;
                                  active[3]=1;
                                  ends[3]=1;
                                  tdone[3]=1;
                                }
                                else {
                                  S120647=0;
                                  if(capperReq_o.isACK()){//sysj\orchestrator.sysj line: 61, column: 5
                                    capperReq_o.setVal(true);//sysj\orchestrator.sysj line: 61, column: 5
                                    S120647=1;
                                    if(!capperReq_o.isACK()){//sysj\orchestrator.sysj line: 61, column: 5
                                      capperReq_o.setREQ(false);//sysj\orchestrator.sysj line: 61, column: 5
                                      ends[3]=2;
                                      ;//sysj\orchestrator.sysj line: 61, column: 5
                                      getNextBottle_1.setPresent();//sysj\orchestrator.sysj line: 62, column: 5
                                      currsigs.addElement(getNextBottle_1);
                                      S120512=2;
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
                        S120564=1;
                        S120564=0;
                        if(!capLoaderReq_o.isPartnerPresent() || capLoaderReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 60, column: 5
                          capLoaderReq_o.setREQ(false);//sysj\orchestrator.sysj line: 60, column: 5
                          S120564=1;
                          active[3]=1;
                          ends[3]=1;
                          tdone[3]=1;
                        }
                        else {
                          S120559=0;
                          if(capLoaderReq_o.isACK()){//sysj\orchestrator.sysj line: 60, column: 5
                            capLoaderReq_o.setVal(true);//sysj\orchestrator.sysj line: 60, column: 5
                            S120559=1;
                            if(!capLoaderReq_o.isACK()){//sysj\orchestrator.sysj line: 60, column: 5
                              capLoaderReq_o.setREQ(false);//sysj\orchestrator.sysj line: 60, column: 5
                              ends[3]=2;
                              ;//sysj\orchestrator.sysj line: 60, column: 5
                              S120557=2;
                              S120652=0;
                              if(!capperReq_o.isPartnerPresent() || capperReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 61, column: 5
                                capperReq_o.setREQ(false);//sysj\orchestrator.sysj line: 61, column: 5
                                S120652=1;
                                active[3]=1;
                                ends[3]=1;
                                tdone[3]=1;
                              }
                              else {
                                S120647=0;
                                if(capperReq_o.isACK()){//sysj\orchestrator.sysj line: 61, column: 5
                                  capperReq_o.setVal(true);//sysj\orchestrator.sysj line: 61, column: 5
                                  S120647=1;
                                  if(!capperReq_o.isACK()){//sysj\orchestrator.sysj line: 61, column: 5
                                    capperReq_o.setREQ(false);//sysj\orchestrator.sysj line: 61, column: 5
                                    ends[3]=2;
                                    ;//sysj\orchestrator.sysj line: 61, column: 5
                                    getNextBottle_1.setPresent();//sysj\orchestrator.sysj line: 62, column: 5
                                    currsigs.addElement(getNextBottle_1);
                                    S120512=2;
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
                    switch(S120652){
                      case 0 : 
                        if(!capperReq_o.isPartnerPresent() || capperReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 61, column: 5
                          capperReq_o.setREQ(false);//sysj\orchestrator.sysj line: 61, column: 5
                          S120652=1;
                          active[3]=1;
                          ends[3]=1;
                          tdone[3]=1;
                        }
                        else {
                          switch(S120647){
                            case 0 : 
                              if(capperReq_o.isACK()){//sysj\orchestrator.sysj line: 61, column: 5
                                capperReq_o.setVal(true);//sysj\orchestrator.sysj line: 61, column: 5
                                S120647=1;
                                if(!capperReq_o.isACK()){//sysj\orchestrator.sysj line: 61, column: 5
                                  capperReq_o.setREQ(false);//sysj\orchestrator.sysj line: 61, column: 5
                                  ends[3]=2;
                                  ;//sysj\orchestrator.sysj line: 61, column: 5
                                  getNextBottle_1.setPresent();//sysj\orchestrator.sysj line: 62, column: 5
                                  currsigs.addElement(getNextBottle_1);
                                  S120512=2;
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
                              if(!capperReq_o.isACK()){//sysj\orchestrator.sysj line: 61, column: 5
                                capperReq_o.setREQ(false);//sysj\orchestrator.sysj line: 61, column: 5
                                ends[3]=2;
                                ;//sysj\orchestrator.sysj line: 61, column: 5
                                getNextBottle_1.setPresent();//sysj\orchestrator.sysj line: 62, column: 5
                                currsigs.addElement(getNextBottle_1);
                                S120512=2;
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
                        S120652=1;
                        S120652=0;
                        if(!capperReq_o.isPartnerPresent() || capperReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 61, column: 5
                          capperReq_o.setREQ(false);//sysj\orchestrator.sysj line: 61, column: 5
                          S120652=1;
                          active[3]=1;
                          ends[3]=1;
                          tdone[3]=1;
                        }
                        else {
                          S120647=0;
                          if(capperReq_o.isACK()){//sysj\orchestrator.sysj line: 61, column: 5
                            capperReq_o.setVal(true);//sysj\orchestrator.sysj line: 61, column: 5
                            S120647=1;
                            if(!capperReq_o.isACK()){//sysj\orchestrator.sysj line: 61, column: 5
                              capperReq_o.setREQ(false);//sysj\orchestrator.sysj line: 61, column: 5
                              ends[3]=2;
                              ;//sysj\orchestrator.sysj line: 61, column: 5
                              getNextBottle_1.setPresent();//sysj\orchestrator.sysj line: 62, column: 5
                              currsigs.addElement(getNextBottle_1);
                              S120512=2;
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
                switch(S120888){
                  case 0 : 
                    switch(S120784){
                      case 0 : 
                        if(!fillerReq_o.isPartnerPresent() || fillerReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 65, column: 5
                          fillerReq_o.setREQ(false);//sysj\orchestrator.sysj line: 65, column: 5
                          S120784=1;
                          active[3]=1;
                          ends[3]=1;
                          tdone[3]=1;
                        }
                        else {
                          switch(S120779){
                            case 0 : 
                              if(fillerReq_o.isACK()){//sysj\orchestrator.sysj line: 65, column: 5
                                fillerReq_o.setVal(false);//sysj\orchestrator.sysj line: 65, column: 5
                                S120779=1;
                                if(!fillerReq_o.isACK()){//sysj\orchestrator.sysj line: 65, column: 5
                                  fillerReq_o.setREQ(false);//sysj\orchestrator.sysj line: 65, column: 5
                                  ends[3]=2;
                                  ;//sysj\orchestrator.sysj line: 65, column: 5
                                  S120888=1;
                                  S120806=0;
                                  if(!capLoaderReq_o.isPartnerPresent() || capLoaderReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 66, column: 5
                                    capLoaderReq_o.setREQ(false);//sysj\orchestrator.sysj line: 66, column: 5
                                    S120806=1;
                                    active[3]=1;
                                    ends[3]=1;
                                    tdone[3]=1;
                                  }
                                  else {
                                    S120801=0;
                                    if(capLoaderReq_o.isACK()){//sysj\orchestrator.sysj line: 66, column: 5
                                      capLoaderReq_o.setVal(false);//sysj\orchestrator.sysj line: 66, column: 5
                                      S120801=1;
                                      if(!capLoaderReq_o.isACK()){//sysj\orchestrator.sysj line: 66, column: 5
                                        capLoaderReq_o.setREQ(false);//sysj\orchestrator.sysj line: 66, column: 5
                                        ends[3]=2;
                                        ;//sysj\orchestrator.sysj line: 66, column: 5
                                        S120888=2;
                                        S120895=0;
                                        if(!capperReq_o.isPartnerPresent() || capperReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 67, column: 5
                                          capperReq_o.setREQ(false);//sysj\orchestrator.sysj line: 67, column: 5
                                          S120895=1;
                                          active[3]=1;
                                          ends[3]=1;
                                          tdone[3]=1;
                                        }
                                        else {
                                          S120890=0;
                                          if(capperReq_o.isACK()){//sysj\orchestrator.sysj line: 67, column: 5
                                            capperReq_o.setVal(false);//sysj\orchestrator.sysj line: 67, column: 5
                                            S120890=1;
                                            if(!capperReq_o.isACK()){//sysj\orchestrator.sysj line: 67, column: 5
                                              capperReq_o.setREQ(false);//sysj\orchestrator.sysj line: 67, column: 5
                                              ends[3]=2;
                                              ;//sysj\orchestrator.sysj line: 67, column: 5
                                              S120512=2;
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
                              if(!fillerReq_o.isACK()){//sysj\orchestrator.sysj line: 65, column: 5
                                fillerReq_o.setREQ(false);//sysj\orchestrator.sysj line: 65, column: 5
                                ends[3]=2;
                                ;//sysj\orchestrator.sysj line: 65, column: 5
                                S120888=1;
                                S120806=0;
                                if(!capLoaderReq_o.isPartnerPresent() || capLoaderReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 66, column: 5
                                  capLoaderReq_o.setREQ(false);//sysj\orchestrator.sysj line: 66, column: 5
                                  S120806=1;
                                  active[3]=1;
                                  ends[3]=1;
                                  tdone[3]=1;
                                }
                                else {
                                  S120801=0;
                                  if(capLoaderReq_o.isACK()){//sysj\orchestrator.sysj line: 66, column: 5
                                    capLoaderReq_o.setVal(false);//sysj\orchestrator.sysj line: 66, column: 5
                                    S120801=1;
                                    if(!capLoaderReq_o.isACK()){//sysj\orchestrator.sysj line: 66, column: 5
                                      capLoaderReq_o.setREQ(false);//sysj\orchestrator.sysj line: 66, column: 5
                                      ends[3]=2;
                                      ;//sysj\orchestrator.sysj line: 66, column: 5
                                      S120888=2;
                                      S120895=0;
                                      if(!capperReq_o.isPartnerPresent() || capperReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 67, column: 5
                                        capperReq_o.setREQ(false);//sysj\orchestrator.sysj line: 67, column: 5
                                        S120895=1;
                                        active[3]=1;
                                        ends[3]=1;
                                        tdone[3]=1;
                                      }
                                      else {
                                        S120890=0;
                                        if(capperReq_o.isACK()){//sysj\orchestrator.sysj line: 67, column: 5
                                          capperReq_o.setVal(false);//sysj\orchestrator.sysj line: 67, column: 5
                                          S120890=1;
                                          if(!capperReq_o.isACK()){//sysj\orchestrator.sysj line: 67, column: 5
                                            capperReq_o.setREQ(false);//sysj\orchestrator.sysj line: 67, column: 5
                                            ends[3]=2;
                                            ;//sysj\orchestrator.sysj line: 67, column: 5
                                            S120512=2;
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
                        S120784=1;
                        S120784=0;
                        if(!fillerReq_o.isPartnerPresent() || fillerReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 65, column: 5
                          fillerReq_o.setREQ(false);//sysj\orchestrator.sysj line: 65, column: 5
                          S120784=1;
                          active[3]=1;
                          ends[3]=1;
                          tdone[3]=1;
                        }
                        else {
                          S120779=0;
                          if(fillerReq_o.isACK()){//sysj\orchestrator.sysj line: 65, column: 5
                            fillerReq_o.setVal(false);//sysj\orchestrator.sysj line: 65, column: 5
                            S120779=1;
                            if(!fillerReq_o.isACK()){//sysj\orchestrator.sysj line: 65, column: 5
                              fillerReq_o.setREQ(false);//sysj\orchestrator.sysj line: 65, column: 5
                              ends[3]=2;
                              ;//sysj\orchestrator.sysj line: 65, column: 5
                              S120888=1;
                              S120806=0;
                              if(!capLoaderReq_o.isPartnerPresent() || capLoaderReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 66, column: 5
                                capLoaderReq_o.setREQ(false);//sysj\orchestrator.sysj line: 66, column: 5
                                S120806=1;
                                active[3]=1;
                                ends[3]=1;
                                tdone[3]=1;
                              }
                              else {
                                S120801=0;
                                if(capLoaderReq_o.isACK()){//sysj\orchestrator.sysj line: 66, column: 5
                                  capLoaderReq_o.setVal(false);//sysj\orchestrator.sysj line: 66, column: 5
                                  S120801=1;
                                  if(!capLoaderReq_o.isACK()){//sysj\orchestrator.sysj line: 66, column: 5
                                    capLoaderReq_o.setREQ(false);//sysj\orchestrator.sysj line: 66, column: 5
                                    ends[3]=2;
                                    ;//sysj\orchestrator.sysj line: 66, column: 5
                                    S120888=2;
                                    S120895=0;
                                    if(!capperReq_o.isPartnerPresent() || capperReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 67, column: 5
                                      capperReq_o.setREQ(false);//sysj\orchestrator.sysj line: 67, column: 5
                                      S120895=1;
                                      active[3]=1;
                                      ends[3]=1;
                                      tdone[3]=1;
                                    }
                                    else {
                                      S120890=0;
                                      if(capperReq_o.isACK()){//sysj\orchestrator.sysj line: 67, column: 5
                                        capperReq_o.setVal(false);//sysj\orchestrator.sysj line: 67, column: 5
                                        S120890=1;
                                        if(!capperReq_o.isACK()){//sysj\orchestrator.sysj line: 67, column: 5
                                          capperReq_o.setREQ(false);//sysj\orchestrator.sysj line: 67, column: 5
                                          ends[3]=2;
                                          ;//sysj\orchestrator.sysj line: 67, column: 5
                                          S120512=2;
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
                    switch(S120806){
                      case 0 : 
                        if(!capLoaderReq_o.isPartnerPresent() || capLoaderReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 66, column: 5
                          capLoaderReq_o.setREQ(false);//sysj\orchestrator.sysj line: 66, column: 5
                          S120806=1;
                          active[3]=1;
                          ends[3]=1;
                          tdone[3]=1;
                        }
                        else {
                          switch(S120801){
                            case 0 : 
                              if(capLoaderReq_o.isACK()){//sysj\orchestrator.sysj line: 66, column: 5
                                capLoaderReq_o.setVal(false);//sysj\orchestrator.sysj line: 66, column: 5
                                S120801=1;
                                if(!capLoaderReq_o.isACK()){//sysj\orchestrator.sysj line: 66, column: 5
                                  capLoaderReq_o.setREQ(false);//sysj\orchestrator.sysj line: 66, column: 5
                                  ends[3]=2;
                                  ;//sysj\orchestrator.sysj line: 66, column: 5
                                  S120888=2;
                                  S120895=0;
                                  if(!capperReq_o.isPartnerPresent() || capperReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 67, column: 5
                                    capperReq_o.setREQ(false);//sysj\orchestrator.sysj line: 67, column: 5
                                    S120895=1;
                                    active[3]=1;
                                    ends[3]=1;
                                    tdone[3]=1;
                                  }
                                  else {
                                    S120890=0;
                                    if(capperReq_o.isACK()){//sysj\orchestrator.sysj line: 67, column: 5
                                      capperReq_o.setVal(false);//sysj\orchestrator.sysj line: 67, column: 5
                                      S120890=1;
                                      if(!capperReq_o.isACK()){//sysj\orchestrator.sysj line: 67, column: 5
                                        capperReq_o.setREQ(false);//sysj\orchestrator.sysj line: 67, column: 5
                                        ends[3]=2;
                                        ;//sysj\orchestrator.sysj line: 67, column: 5
                                        S120512=2;
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
                              if(!capLoaderReq_o.isACK()){//sysj\orchestrator.sysj line: 66, column: 5
                                capLoaderReq_o.setREQ(false);//sysj\orchestrator.sysj line: 66, column: 5
                                ends[3]=2;
                                ;//sysj\orchestrator.sysj line: 66, column: 5
                                S120888=2;
                                S120895=0;
                                if(!capperReq_o.isPartnerPresent() || capperReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 67, column: 5
                                  capperReq_o.setREQ(false);//sysj\orchestrator.sysj line: 67, column: 5
                                  S120895=1;
                                  active[3]=1;
                                  ends[3]=1;
                                  tdone[3]=1;
                                }
                                else {
                                  S120890=0;
                                  if(capperReq_o.isACK()){//sysj\orchestrator.sysj line: 67, column: 5
                                    capperReq_o.setVal(false);//sysj\orchestrator.sysj line: 67, column: 5
                                    S120890=1;
                                    if(!capperReq_o.isACK()){//sysj\orchestrator.sysj line: 67, column: 5
                                      capperReq_o.setREQ(false);//sysj\orchestrator.sysj line: 67, column: 5
                                      ends[3]=2;
                                      ;//sysj\orchestrator.sysj line: 67, column: 5
                                      S120512=2;
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
                        S120806=1;
                        S120806=0;
                        if(!capLoaderReq_o.isPartnerPresent() || capLoaderReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 66, column: 5
                          capLoaderReq_o.setREQ(false);//sysj\orchestrator.sysj line: 66, column: 5
                          S120806=1;
                          active[3]=1;
                          ends[3]=1;
                          tdone[3]=1;
                        }
                        else {
                          S120801=0;
                          if(capLoaderReq_o.isACK()){//sysj\orchestrator.sysj line: 66, column: 5
                            capLoaderReq_o.setVal(false);//sysj\orchestrator.sysj line: 66, column: 5
                            S120801=1;
                            if(!capLoaderReq_o.isACK()){//sysj\orchestrator.sysj line: 66, column: 5
                              capLoaderReq_o.setREQ(false);//sysj\orchestrator.sysj line: 66, column: 5
                              ends[3]=2;
                              ;//sysj\orchestrator.sysj line: 66, column: 5
                              S120888=2;
                              S120895=0;
                              if(!capperReq_o.isPartnerPresent() || capperReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 67, column: 5
                                capperReq_o.setREQ(false);//sysj\orchestrator.sysj line: 67, column: 5
                                S120895=1;
                                active[3]=1;
                                ends[3]=1;
                                tdone[3]=1;
                              }
                              else {
                                S120890=0;
                                if(capperReq_o.isACK()){//sysj\orchestrator.sysj line: 67, column: 5
                                  capperReq_o.setVal(false);//sysj\orchestrator.sysj line: 67, column: 5
                                  S120890=1;
                                  if(!capperReq_o.isACK()){//sysj\orchestrator.sysj line: 67, column: 5
                                    capperReq_o.setREQ(false);//sysj\orchestrator.sysj line: 67, column: 5
                                    ends[3]=2;
                                    ;//sysj\orchestrator.sysj line: 67, column: 5
                                    S120512=2;
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
                    switch(S120895){
                      case 0 : 
                        if(!capperReq_o.isPartnerPresent() || capperReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 67, column: 5
                          capperReq_o.setREQ(false);//sysj\orchestrator.sysj line: 67, column: 5
                          S120895=1;
                          active[3]=1;
                          ends[3]=1;
                          tdone[3]=1;
                        }
                        else {
                          switch(S120890){
                            case 0 : 
                              if(capperReq_o.isACK()){//sysj\orchestrator.sysj line: 67, column: 5
                                capperReq_o.setVal(false);//sysj\orchestrator.sysj line: 67, column: 5
                                S120890=1;
                                if(!capperReq_o.isACK()){//sysj\orchestrator.sysj line: 67, column: 5
                                  capperReq_o.setREQ(false);//sysj\orchestrator.sysj line: 67, column: 5
                                  ends[3]=2;
                                  ;//sysj\orchestrator.sysj line: 67, column: 5
                                  S120512=2;
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
                              if(!capperReq_o.isACK()){//sysj\orchestrator.sysj line: 67, column: 5
                                capperReq_o.setREQ(false);//sysj\orchestrator.sysj line: 67, column: 5
                                ends[3]=2;
                                ;//sysj\orchestrator.sysj line: 67, column: 5
                                S120512=2;
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
                        S120895=1;
                        S120895=0;
                        if(!capperReq_o.isPartnerPresent() || capperReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 67, column: 5
                          capperReq_o.setREQ(false);//sysj\orchestrator.sysj line: 67, column: 5
                          S120895=1;
                          active[3]=1;
                          ends[3]=1;
                          tdone[3]=1;
                        }
                        else {
                          S120890=0;
                          if(capperReq_o.isACK()){//sysj\orchestrator.sysj line: 67, column: 5
                            capperReq_o.setVal(false);//sysj\orchestrator.sysj line: 67, column: 5
                            S120890=1;
                            if(!capperReq_o.isACK()){//sysj\orchestrator.sysj line: 67, column: 5
                              capperReq_o.setREQ(false);//sysj\orchestrator.sysj line: 67, column: 5
                              ends[3]=2;
                              ;//sysj\orchestrator.sysj line: 67, column: 5
                              S120512=2;
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
            S120512=2;
            S120512=0;
            S120496=0;
            if(!rotaryStatus_in.isPartnerPresent() || rotaryStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 53, column: 4
              rotaryStatus_in.setACK(false);//sysj\orchestrator.sysj line: 53, column: 4
              S120496=1;
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            else {
              S120491=0;
              if(!rotaryStatus_in.isREQ()){//sysj\orchestrator.sysj line: 53, column: 4
                rotaryStatus_in.setACK(true);//sysj\orchestrator.sysj line: 53, column: 4
                S120491=1;
                if(rotaryStatus_in.isREQ()){//sysj\orchestrator.sysj line: 53, column: 4
                  rotaryStatus_in.setACK(false);//sysj\orchestrator.sysj line: 53, column: 4
                  ends[3]=2;
                  ;//sysj\orchestrator.sysj line: 53, column: 4
                  rotaryStat_thread_3 = (rotaryStatus_in.getVal() == null ? null : ((String)rotaryStatus_in.getVal()));//sysj\orchestrator.sysj line: 54, column: 4
                  S120512=1;
                  if(rotaryStat_thread_3 == "done"){//sysj\orchestrator.sysj line: 57, column: 7
                    S121021=0;
                    System.out.println("rotary done, sending filler,loader,screwer, conveyor reqs");//sysj\orchestrator.sysj line: 58, column: 5
                    S120557=0;
                    S120519=0;
                    if(!fillerReq_o.isPartnerPresent() || fillerReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 59, column: 5
                      fillerReq_o.setREQ(false);//sysj\orchestrator.sysj line: 59, column: 5
                      S120519=1;
                      active[3]=1;
                      ends[3]=1;
                      tdone[3]=1;
                    }
                    else {
                      S120514=0;
                      if(fillerReq_o.isACK()){//sysj\orchestrator.sysj line: 59, column: 5
                        fillerReq_o.setVal(true);//sysj\orchestrator.sysj line: 59, column: 5
                        S120514=1;
                        if(!fillerReq_o.isACK()){//sysj\orchestrator.sysj line: 59, column: 5
                          fillerReq_o.setREQ(false);//sysj\orchestrator.sysj line: 59, column: 5
                          ends[3]=2;
                          ;//sysj\orchestrator.sysj line: 59, column: 5
                          S120557=1;
                          S120564=0;
                          if(!capLoaderReq_o.isPartnerPresent() || capLoaderReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 60, column: 5
                            capLoaderReq_o.setREQ(false);//sysj\orchestrator.sysj line: 60, column: 5
                            S120564=1;
                            active[3]=1;
                            ends[3]=1;
                            tdone[3]=1;
                          }
                          else {
                            S120559=0;
                            if(capLoaderReq_o.isACK()){//sysj\orchestrator.sysj line: 60, column: 5
                              capLoaderReq_o.setVal(true);//sysj\orchestrator.sysj line: 60, column: 5
                              S120559=1;
                              if(!capLoaderReq_o.isACK()){//sysj\orchestrator.sysj line: 60, column: 5
                                capLoaderReq_o.setREQ(false);//sysj\orchestrator.sysj line: 60, column: 5
                                ends[3]=2;
                                ;//sysj\orchestrator.sysj line: 60, column: 5
                                S120557=2;
                                S120652=0;
                                if(!capperReq_o.isPartnerPresent() || capperReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 61, column: 5
                                  capperReq_o.setREQ(false);//sysj\orchestrator.sysj line: 61, column: 5
                                  S120652=1;
                                  active[3]=1;
                                  ends[3]=1;
                                  tdone[3]=1;
                                }
                                else {
                                  S120647=0;
                                  if(capperReq_o.isACK()){//sysj\orchestrator.sysj line: 61, column: 5
                                    capperReq_o.setVal(true);//sysj\orchestrator.sysj line: 61, column: 5
                                    S120647=1;
                                    if(!capperReq_o.isACK()){//sysj\orchestrator.sysj line: 61, column: 5
                                      capperReq_o.setREQ(false);//sysj\orchestrator.sysj line: 61, column: 5
                                      ends[3]=2;
                                      ;//sysj\orchestrator.sysj line: 61, column: 5
                                      getNextBottle_1.setPresent();//sysj\orchestrator.sysj line: 62, column: 5
                                      currsigs.addElement(getNextBottle_1);
                                      S120512=2;
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
                    S121021=1;
                    S120888=0;
                    S120784=0;
                    if(!fillerReq_o.isPartnerPresent() || fillerReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 65, column: 5
                      fillerReq_o.setREQ(false);//sysj\orchestrator.sysj line: 65, column: 5
                      S120784=1;
                      active[3]=1;
                      ends[3]=1;
                      tdone[3]=1;
                    }
                    else {
                      S120779=0;
                      if(fillerReq_o.isACK()){//sysj\orchestrator.sysj line: 65, column: 5
                        fillerReq_o.setVal(false);//sysj\orchestrator.sysj line: 65, column: 5
                        S120779=1;
                        if(!fillerReq_o.isACK()){//sysj\orchestrator.sysj line: 65, column: 5
                          fillerReq_o.setREQ(false);//sysj\orchestrator.sysj line: 65, column: 5
                          ends[3]=2;
                          ;//sysj\orchestrator.sysj line: 65, column: 5
                          S120888=1;
                          S120806=0;
                          if(!capLoaderReq_o.isPartnerPresent() || capLoaderReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 66, column: 5
                            capLoaderReq_o.setREQ(false);//sysj\orchestrator.sysj line: 66, column: 5
                            S120806=1;
                            active[3]=1;
                            ends[3]=1;
                            tdone[3]=1;
                          }
                          else {
                            S120801=0;
                            if(capLoaderReq_o.isACK()){//sysj\orchestrator.sysj line: 66, column: 5
                              capLoaderReq_o.setVal(false);//sysj\orchestrator.sysj line: 66, column: 5
                              S120801=1;
                              if(!capLoaderReq_o.isACK()){//sysj\orchestrator.sysj line: 66, column: 5
                                capLoaderReq_o.setREQ(false);//sysj\orchestrator.sysj line: 66, column: 5
                                ends[3]=2;
                                ;//sysj\orchestrator.sysj line: 66, column: 5
                                S120888=2;
                                S120895=0;
                                if(!capperReq_o.isPartnerPresent() || capperReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 67, column: 5
                                  capperReq_o.setREQ(false);//sysj\orchestrator.sysj line: 67, column: 5
                                  S120895=1;
                                  active[3]=1;
                                  ends[3]=1;
                                  tdone[3]=1;
                                }
                                else {
                                  S120890=0;
                                  if(capperReq_o.isACK()){//sysj\orchestrator.sysj line: 67, column: 5
                                    capperReq_o.setVal(false);//sysj\orchestrator.sysj line: 67, column: 5
                                    S120890=1;
                                    if(!capperReq_o.isACK()){//sysj\orchestrator.sysj line: 67, column: 5
                                      capperReq_o.setREQ(false);//sysj\orchestrator.sysj line: 67, column: 5
                                      ends[3]=2;
                                      ;//sysj\orchestrator.sysj line: 67, column: 5
                                      S120512=2;
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

  public void thread127173(int [] tdone, int [] ends){
        switch(S120489){
      case 0 : 
        active[2]=0;
        ends[2]=0;
        tdone[2]=1;
        break;
      
      case 1 : 
        switch(S118973){
          case 0 : 
            switch(S118715){
              case 0 : 
                switch(S118677){
                  case 0 : 
                    if(!conveyorReq_o.isPartnerPresent() || conveyorReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 35, column: 5
                      conveyorReq_o.setREQ(false);//sysj\orchestrator.sysj line: 35, column: 5
                      S118677=1;
                      active[2]=1;
                      ends[2]=1;
                      tdone[2]=1;
                    }
                    else {
                      switch(S118672){
                        case 0 : 
                          if(conveyorReq_o.isACK()){//sysj\orchestrator.sysj line: 35, column: 5
                            conveyorReq_o.setVal(true);//sysj\orchestrator.sysj line: 35, column: 5
                            S118672=1;
                            if(!conveyorReq_o.isACK()){//sysj\orchestrator.sysj line: 35, column: 5
                              conveyorReq_o.setREQ(false);//sysj\orchestrator.sysj line: 35, column: 5
                              ends[2]=2;
                              ;//sysj\orchestrator.sysj line: 35, column: 5
                              bottlePlaced_thread_2 = bottlePlaced_thread_2 - 1;//sysj\orchestrator.sysj line: 36, column: 5
                              System.out.println("Number of bottles left to do: " + bottlePlaced_thread_2);//sysj\orchestrator.sysj line: 37, column: 5
                              S118715=1;
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
                            System.out.println("Number of bottles left to do: " + bottlePlaced_thread_2);//sysj\orchestrator.sysj line: 37, column: 5
                            S118715=1;
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
                    S118677=1;
                    S118677=0;
                    if(!conveyorReq_o.isPartnerPresent() || conveyorReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 35, column: 5
                      conveyorReq_o.setREQ(false);//sysj\orchestrator.sysj line: 35, column: 5
                      S118677=1;
                      active[2]=1;
                      ends[2]=1;
                      tdone[2]=1;
                    }
                    else {
                      S118672=0;
                      if(conveyorReq_o.isACK()){//sysj\orchestrator.sysj line: 35, column: 5
                        conveyorReq_o.setVal(true);//sysj\orchestrator.sysj line: 35, column: 5
                        S118672=1;
                        if(!conveyorReq_o.isACK()){//sysj\orchestrator.sysj line: 35, column: 5
                          conveyorReq_o.setREQ(false);//sysj\orchestrator.sysj line: 35, column: 5
                          ends[2]=2;
                          ;//sysj\orchestrator.sysj line: 35, column: 5
                          bottlePlaced_thread_2 = bottlePlaced_thread_2 - 1;//sysj\orchestrator.sysj line: 36, column: 5
                          System.out.println("Number of bottles left to do: " + bottlePlaced_thread_2);//sysj\orchestrator.sysj line: 37, column: 5
                          S118715=1;
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
                  S118715=2;
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
                S118715=2;
                if(bottlePlaced_thread_2 >= 0){//sysj\orchestrator.sysj line: 33, column: 10
                  System.out.println("sending conveyor req?");//sysj\orchestrator.sysj line: 34, column: 5
                  S118715=0;
                  S118677=0;
                  if(!conveyorReq_o.isPartnerPresent() || conveyorReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 35, column: 5
                    conveyorReq_o.setREQ(false);//sysj\orchestrator.sysj line: 35, column: 5
                    S118677=1;
                    active[2]=1;
                    ends[2]=1;
                    tdone[2]=1;
                  }
                  else {
                    S118672=0;
                    if(conveyorReq_o.isACK()){//sysj\orchestrator.sysj line: 35, column: 5
                      conveyorReq_o.setVal(true);//sysj\orchestrator.sysj line: 35, column: 5
                      S118672=1;
                      if(!conveyorReq_o.isACK()){//sysj\orchestrator.sysj line: 35, column: 5
                        conveyorReq_o.setREQ(false);//sysj\orchestrator.sysj line: 35, column: 5
                        ends[2]=2;
                        ;//sysj\orchestrator.sysj line: 35, column: 5
                        bottlePlaced_thread_2 = bottlePlaced_thread_2 - 1;//sysj\orchestrator.sysj line: 36, column: 5
                        System.out.println("Number of bottles left to do: " + bottlePlaced_thread_2);//sysj\orchestrator.sysj line: 37, column: 5
                        S118715=1;
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
                  S118973=1;
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
            S118973=2;
            bottlePlaced_thread_2 = quantity_thread_2;//sysj\orchestrator.sysj line: 32, column: 4
            S118973=0;
            if(bottlePlaced_thread_2 >= 0){//sysj\orchestrator.sysj line: 33, column: 10
              System.out.println("sending conveyor req?");//sysj\orchestrator.sysj line: 34, column: 5
              S118715=0;
              S118677=0;
              if(!conveyorReq_o.isPartnerPresent() || conveyorReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 35, column: 5
                conveyorReq_o.setREQ(false);//sysj\orchestrator.sysj line: 35, column: 5
                S118677=1;
                active[2]=1;
                ends[2]=1;
                tdone[2]=1;
              }
              else {
                S118672=0;
                if(conveyorReq_o.isACK()){//sysj\orchestrator.sysj line: 35, column: 5
                  conveyorReq_o.setVal(true);//sysj\orchestrator.sysj line: 35, column: 5
                  S118672=1;
                  if(!conveyorReq_o.isACK()){//sysj\orchestrator.sysj line: 35, column: 5
                    conveyorReq_o.setREQ(false);//sysj\orchestrator.sysj line: 35, column: 5
                    ends[2]=2;
                    ;//sysj\orchestrator.sysj line: 35, column: 5
                    bottlePlaced_thread_2 = bottlePlaced_thread_2 - 1;//sysj\orchestrator.sysj line: 36, column: 5
                    System.out.println("Number of bottles left to do: " + bottlePlaced_thread_2);//sysj\orchestrator.sysj line: 37, column: 5
                    S118715=1;
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
              S118973=1;
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread127171(int [] tdone, int [] ends){
        S127161=1;
    S127021=0;
    if((Status.conveyStat == false) && (Status.fillerStat == false) && (Status.capperStat == false) && (Status.capLoaderStat == false)){//sysj\orchestrator.sysj line: 144, column: 7
      S127020=0;
      System.out.println("Orch sending rotary req");//sysj\orchestrator.sysj line: 148, column: 5
      S126959=0;
      if(!allOperationsFinished_o.isPartnerPresent() || allOperationsFinished_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 149, column: 5
        allOperationsFinished_o.setREQ(false);//sysj\orchestrator.sysj line: 149, column: 5
        S126959=1;
        active[8]=1;
        ends[8]=1;
        tdone[8]=1;
      }
      else {
        S126954=0;
        if(allOperationsFinished_o.isACK()){//sysj\orchestrator.sysj line: 149, column: 5
          allOperationsFinished_o.setVal(true);//sysj\orchestrator.sysj line: 149, column: 5
          S126954=1;
          if(!allOperationsFinished_o.isACK()){//sysj\orchestrator.sysj line: 149, column: 5
            allOperationsFinished_o.setREQ(false);//sysj\orchestrator.sysj line: 149, column: 5
            ends[8]=2;
            ;//sysj\orchestrator.sysj line: 149, column: 5
            S127021=1;
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
      S127020=1;
      S127004=0;
      if(!allOperationsFinished_o.isPartnerPresent() || allOperationsFinished_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 151, column: 5
        allOperationsFinished_o.setREQ(false);//sysj\orchestrator.sysj line: 151, column: 5
        S127004=1;
        active[8]=1;
        ends[8]=1;
        tdone[8]=1;
      }
      else {
        S126999=0;
        if(allOperationsFinished_o.isACK()){//sysj\orchestrator.sysj line: 151, column: 5
          allOperationsFinished_o.setVal(false);//sysj\orchestrator.sysj line: 151, column: 5
          S126999=1;
          if(!allOperationsFinished_o.isACK()){//sysj\orchestrator.sysj line: 151, column: 5
            allOperationsFinished_o.setREQ(false);//sysj\orchestrator.sysj line: 151, column: 5
            ends[8]=2;
            ;//sysj\orchestrator.sysj line: 151, column: 5
            S127021=1;
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

  public void thread127170(int [] tdone, int [] ends){
        S126952=1;
    S126904=0;
    S126888=0;
    if(!capLoaderStatus_in.isPartnerPresent() || capLoaderStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 125, column: 4
      capLoaderStatus_in.setACK(false);//sysj\orchestrator.sysj line: 125, column: 4
      S126888=1;
      active[7]=1;
      ends[7]=1;
      tdone[7]=1;
    }
    else {
      S126883=0;
      if(!capLoaderStatus_in.isREQ()){//sysj\orchestrator.sysj line: 125, column: 4
        capLoaderStatus_in.setACK(true);//sysj\orchestrator.sysj line: 125, column: 4
        S126883=1;
        if(capLoaderStatus_in.isREQ()){//sysj\orchestrator.sysj line: 125, column: 4
          capLoaderStatus_in.setACK(false);//sysj\orchestrator.sysj line: 125, column: 4
          ends[7]=2;
          ;//sysj\orchestrator.sysj line: 125, column: 4
          capLoaderValue_thread_7 = (capLoaderStatus_in.getVal() == null ? null : ((String)capLoaderStatus_in.getVal()));//sysj\orchestrator.sysj line: 126, column: 4
          if(capLoaderValue_thread_7 == "busy") {//sysj\orchestrator.sysj line: 127, column: 34
            System.out.println("Orch received - loader busy");//sysj\orchestrator.sysj line: 128, column: 5
            Status.capLoaderStat = true;//sysj\orchestrator.sysj line: 129, column: 5
          }
          else {//sysj\orchestrator.sysj line: 131, column: 9
            Status.capLoaderStat = false;//sysj\orchestrator.sysj line: 133, column: 5
          }
          S126904=1;
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

  public void thread127169(int [] tdone, int [] ends){
        S126881=1;
    S126833=0;
    S126817=0;
    if(!capperStatus_in.isPartnerPresent() || capperStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 109, column: 4
      capperStatus_in.setACK(false);//sysj\orchestrator.sysj line: 109, column: 4
      S126817=1;
      active[6]=1;
      ends[6]=1;
      tdone[6]=1;
    }
    else {
      S126812=0;
      if(!capperStatus_in.isREQ()){//sysj\orchestrator.sysj line: 109, column: 4
        capperStatus_in.setACK(true);//sysj\orchestrator.sysj line: 109, column: 4
        S126812=1;
        if(capperStatus_in.isREQ()){//sysj\orchestrator.sysj line: 109, column: 4
          capperStatus_in.setACK(false);//sysj\orchestrator.sysj line: 109, column: 4
          ends[6]=2;
          ;//sysj\orchestrator.sysj line: 109, column: 4
          capperValue_thread_6 = (capperStatus_in.getVal() == null ? null : ((String)capperStatus_in.getVal()));//sysj\orchestrator.sysj line: 110, column: 4
          if(capperValue_thread_6 == "busy") {//sysj\orchestrator.sysj line: 111, column: 31
            System.out.println("Orch received - capper busy");//sysj\orchestrator.sysj line: 112, column: 5
            Status.capperStat = true;//sysj\orchestrator.sysj line: 113, column: 5
          }
          else {//sysj\orchestrator.sysj line: 115, column: 9
            Status.capperStat = false;//sysj\orchestrator.sysj line: 117, column: 5
          }
          S126833=1;
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

  public void thread127168(int [] tdone, int [] ends){
        S126810=1;
    S126762=0;
    S126746=0;
    if(!fillerStatus_in.isPartnerPresent() || fillerStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 93, column: 4
      fillerStatus_in.setACK(false);//sysj\orchestrator.sysj line: 93, column: 4
      S126746=1;
      active[5]=1;
      ends[5]=1;
      tdone[5]=1;
    }
    else {
      S126741=0;
      if(!fillerStatus_in.isREQ()){//sysj\orchestrator.sysj line: 93, column: 4
        fillerStatus_in.setACK(true);//sysj\orchestrator.sysj line: 93, column: 4
        S126741=1;
        if(fillerStatus_in.isREQ()){//sysj\orchestrator.sysj line: 93, column: 4
          fillerStatus_in.setACK(false);//sysj\orchestrator.sysj line: 93, column: 4
          ends[5]=2;
          ;//sysj\orchestrator.sysj line: 93, column: 4
          fillerValue_thread_5 = (fillerStatus_in.getVal() == null ? null : ((String)fillerStatus_in.getVal()));//sysj\orchestrator.sysj line: 94, column: 4
          if(fillerValue_thread_5 == "busy") {//sysj\orchestrator.sysj line: 95, column: 31
            System.out.println("Orch received - filler busy");//sysj\orchestrator.sysj line: 96, column: 5
            Status.fillerStat = true;//sysj\orchestrator.sysj line: 97, column: 5
          }
          else {//sysj\orchestrator.sysj line: 99, column: 9
            Status.fillerStat = false;//sysj\orchestrator.sysj line: 101, column: 5
          }
          S126762=1;
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

  public void thread127167(int [] tdone, int [] ends){
        S126739=1;
    S126691=0;
    S126675=0;
    if(!conveyorStatus_in.isPartnerPresent() || conveyorStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 76, column: 4
      conveyorStatus_in.setACK(false);//sysj\orchestrator.sysj line: 76, column: 4
      S126675=1;
      active[4]=1;
      ends[4]=1;
      tdone[4]=1;
    }
    else {
      S126670=0;
      if(!conveyorStatus_in.isREQ()){//sysj\orchestrator.sysj line: 76, column: 4
        conveyorStatus_in.setACK(true);//sysj\orchestrator.sysj line: 76, column: 4
        S126670=1;
        if(conveyorStatus_in.isREQ()){//sysj\orchestrator.sysj line: 76, column: 4
          conveyorStatus_in.setACK(false);//sysj\orchestrator.sysj line: 76, column: 4
          ends[4]=2;
          ;//sysj\orchestrator.sysj line: 76, column: 4
          conveyValue_thread_4 = (conveyorStatus_in.getVal() == null ? null : ((String)conveyorStatus_in.getVal()));//sysj\orchestrator.sysj line: 77, column: 4
          if(conveyValue_thread_4 == "busy") {//sysj\orchestrator.sysj line: 78, column: 31
            System.out.println("Orch received - convey busy");//sysj\orchestrator.sysj line: 79, column: 5
            Status.conveyStat = true;//sysj\orchestrator.sysj line: 80, column: 5
          }
          else {//sysj\orchestrator.sysj line: 82, column: 9
            Status.conveyStat = false;//sysj\orchestrator.sysj line: 84, column: 5
          }
          S126691=1;
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

  public void thread127166(int [] tdone, int [] ends){
        S126668=1;
    S120512=0;
    S120496=0;
    if(!rotaryStatus_in.isPartnerPresent() || rotaryStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 53, column: 4
      rotaryStatus_in.setACK(false);//sysj\orchestrator.sysj line: 53, column: 4
      S120496=1;
      active[3]=1;
      ends[3]=1;
      tdone[3]=1;
    }
    else {
      S120491=0;
      if(!rotaryStatus_in.isREQ()){//sysj\orchestrator.sysj line: 53, column: 4
        rotaryStatus_in.setACK(true);//sysj\orchestrator.sysj line: 53, column: 4
        S120491=1;
        if(rotaryStatus_in.isREQ()){//sysj\orchestrator.sysj line: 53, column: 4
          rotaryStatus_in.setACK(false);//sysj\orchestrator.sysj line: 53, column: 4
          ends[3]=2;
          ;//sysj\orchestrator.sysj line: 53, column: 4
          rotaryStat_thread_3 = (rotaryStatus_in.getVal() == null ? null : ((String)rotaryStatus_in.getVal()));//sysj\orchestrator.sysj line: 54, column: 4
          S120512=1;
          if(rotaryStat_thread_3 == "done"){//sysj\orchestrator.sysj line: 57, column: 7
            S121021=0;
            System.out.println("rotary done, sending filler,loader,screwer, conveyor reqs");//sysj\orchestrator.sysj line: 58, column: 5
            S120557=0;
            S120519=0;
            if(!fillerReq_o.isPartnerPresent() || fillerReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 59, column: 5
              fillerReq_o.setREQ(false);//sysj\orchestrator.sysj line: 59, column: 5
              S120519=1;
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            else {
              S120514=0;
              if(fillerReq_o.isACK()){//sysj\orchestrator.sysj line: 59, column: 5
                fillerReq_o.setVal(true);//sysj\orchestrator.sysj line: 59, column: 5
                S120514=1;
                if(!fillerReq_o.isACK()){//sysj\orchestrator.sysj line: 59, column: 5
                  fillerReq_o.setREQ(false);//sysj\orchestrator.sysj line: 59, column: 5
                  ends[3]=2;
                  ;//sysj\orchestrator.sysj line: 59, column: 5
                  S120557=1;
                  S120564=0;
                  if(!capLoaderReq_o.isPartnerPresent() || capLoaderReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 60, column: 5
                    capLoaderReq_o.setREQ(false);//sysj\orchestrator.sysj line: 60, column: 5
                    S120564=1;
                    active[3]=1;
                    ends[3]=1;
                    tdone[3]=1;
                  }
                  else {
                    S120559=0;
                    if(capLoaderReq_o.isACK()){//sysj\orchestrator.sysj line: 60, column: 5
                      capLoaderReq_o.setVal(true);//sysj\orchestrator.sysj line: 60, column: 5
                      S120559=1;
                      if(!capLoaderReq_o.isACK()){//sysj\orchestrator.sysj line: 60, column: 5
                        capLoaderReq_o.setREQ(false);//sysj\orchestrator.sysj line: 60, column: 5
                        ends[3]=2;
                        ;//sysj\orchestrator.sysj line: 60, column: 5
                        S120557=2;
                        S120652=0;
                        if(!capperReq_o.isPartnerPresent() || capperReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 61, column: 5
                          capperReq_o.setREQ(false);//sysj\orchestrator.sysj line: 61, column: 5
                          S120652=1;
                          active[3]=1;
                          ends[3]=1;
                          tdone[3]=1;
                        }
                        else {
                          S120647=0;
                          if(capperReq_o.isACK()){//sysj\orchestrator.sysj line: 61, column: 5
                            capperReq_o.setVal(true);//sysj\orchestrator.sysj line: 61, column: 5
                            S120647=1;
                            if(!capperReq_o.isACK()){//sysj\orchestrator.sysj line: 61, column: 5
                              capperReq_o.setREQ(false);//sysj\orchestrator.sysj line: 61, column: 5
                              ends[3]=2;
                              ;//sysj\orchestrator.sysj line: 61, column: 5
                              getNextBottle_1.setPresent();//sysj\orchestrator.sysj line: 62, column: 5
                              currsigs.addElement(getNextBottle_1);
                              S120512=2;
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
            S121021=1;
            S120888=0;
            S120784=0;
            if(!fillerReq_o.isPartnerPresent() || fillerReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 65, column: 5
              fillerReq_o.setREQ(false);//sysj\orchestrator.sysj line: 65, column: 5
              S120784=1;
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            else {
              S120779=0;
              if(fillerReq_o.isACK()){//sysj\orchestrator.sysj line: 65, column: 5
                fillerReq_o.setVal(false);//sysj\orchestrator.sysj line: 65, column: 5
                S120779=1;
                if(!fillerReq_o.isACK()){//sysj\orchestrator.sysj line: 65, column: 5
                  fillerReq_o.setREQ(false);//sysj\orchestrator.sysj line: 65, column: 5
                  ends[3]=2;
                  ;//sysj\orchestrator.sysj line: 65, column: 5
                  S120888=1;
                  S120806=0;
                  if(!capLoaderReq_o.isPartnerPresent() || capLoaderReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 66, column: 5
                    capLoaderReq_o.setREQ(false);//sysj\orchestrator.sysj line: 66, column: 5
                    S120806=1;
                    active[3]=1;
                    ends[3]=1;
                    tdone[3]=1;
                  }
                  else {
                    S120801=0;
                    if(capLoaderReq_o.isACK()){//sysj\orchestrator.sysj line: 66, column: 5
                      capLoaderReq_o.setVal(false);//sysj\orchestrator.sysj line: 66, column: 5
                      S120801=1;
                      if(!capLoaderReq_o.isACK()){//sysj\orchestrator.sysj line: 66, column: 5
                        capLoaderReq_o.setREQ(false);//sysj\orchestrator.sysj line: 66, column: 5
                        ends[3]=2;
                        ;//sysj\orchestrator.sysj line: 66, column: 5
                        S120888=2;
                        S120895=0;
                        if(!capperReq_o.isPartnerPresent() || capperReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 67, column: 5
                          capperReq_o.setREQ(false);//sysj\orchestrator.sysj line: 67, column: 5
                          S120895=1;
                          active[3]=1;
                          ends[3]=1;
                          tdone[3]=1;
                        }
                        else {
                          S120890=0;
                          if(capperReq_o.isACK()){//sysj\orchestrator.sysj line: 67, column: 5
                            capperReq_o.setVal(false);//sysj\orchestrator.sysj line: 67, column: 5
                            S120890=1;
                            if(!capperReq_o.isACK()){//sysj\orchestrator.sysj line: 67, column: 5
                              capperReq_o.setREQ(false);//sysj\orchestrator.sysj line: 67, column: 5
                              ends[3]=2;
                              ;//sysj\orchestrator.sysj line: 67, column: 5
                              S120512=2;
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

  public void thread127165(int [] tdone, int [] ends){
        S120489=1;
    quantity_thread_2 = 5;//sysj\orchestrator.sysj line: 20, column: 3
    bottlePlaced_thread_2 = 0;//sysj\orchestrator.sysj line: 21, column: 3
    liquidPercent_thread_2 = new ArrayList();//sysj\orchestrator.sysj line: 22, column: 3
    liquidPercent_thread_2.add(10);//sysj\orchestrator.sysj line: 23, column: 3
    liquidPercent_thread_2.add(10);//sysj\orchestrator.sysj line: 24, column: 3
    liquidPercent_thread_2.add(20);//sysj\orchestrator.sysj line: 25, column: 3
    liquidPercent_thread_2.add(60);//sysj\orchestrator.sysj line: 26, column: 3
    bottlePlaced_thread_2 = quantity_thread_2;//sysj\orchestrator.sysj line: 32, column: 4
    S118973=0;
    if(bottlePlaced_thread_2 >= 0){//sysj\orchestrator.sysj line: 33, column: 10
      System.out.println("sending conveyor req?");//sysj\orchestrator.sysj line: 34, column: 5
      S118715=0;
      S118677=0;
      if(!conveyorReq_o.isPartnerPresent() || conveyorReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 35, column: 5
        conveyorReq_o.setREQ(false);//sysj\orchestrator.sysj line: 35, column: 5
        S118677=1;
        active[2]=1;
        ends[2]=1;
        tdone[2]=1;
      }
      else {
        S118672=0;
        if(conveyorReq_o.isACK()){//sysj\orchestrator.sysj line: 35, column: 5
          conveyorReq_o.setVal(true);//sysj\orchestrator.sysj line: 35, column: 5
          S118672=1;
          if(!conveyorReq_o.isACK()){//sysj\orchestrator.sysj line: 35, column: 5
            conveyorReq_o.setREQ(false);//sysj\orchestrator.sysj line: 35, column: 5
            ends[2]=2;
            ;//sysj\orchestrator.sysj line: 35, column: 5
            bottlePlaced_thread_2 = bottlePlaced_thread_2 - 1;//sysj\orchestrator.sysj line: 36, column: 5
            System.out.println("Number of bottles left to do: " + bottlePlaced_thread_2);//sysj\orchestrator.sysj line: 37, column: 5
            S118715=1;
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
      S118973=1;
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
      switch(S127163){
        case 0 : 
          S127163=0;
          break RUN;
        
        case 1 : 
          S127163=2;
          S127163=2;
          getNextBottle_1.setClear();//sysj\orchestrator.sysj line: 16, column: 2
          thread127165(tdone,ends);
          thread127166(tdone,ends);
          thread127167(tdone,ends);
          thread127168(tdone,ends);
          thread127169(tdone,ends);
          thread127170(tdone,ends);
          thread127171(tdone,ends);
          int biggest127172 = 0;
          if(ends[2]>=biggest127172){
            biggest127172=ends[2];
          }
          if(ends[3]>=biggest127172){
            biggest127172=ends[3];
          }
          if(ends[4]>=biggest127172){
            biggest127172=ends[4];
          }
          if(ends[5]>=biggest127172){
            biggest127172=ends[5];
          }
          if(ends[6]>=biggest127172){
            biggest127172=ends[6];
          }
          if(ends[7]>=biggest127172){
            biggest127172=ends[7];
          }
          if(ends[8]>=biggest127172){
            biggest127172=ends[8];
          }
          if(biggest127172 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
        
        case 2 : 
          getNextBottle_1.setClear();//sysj\orchestrator.sysj line: 16, column: 2
          thread127173(tdone,ends);
          thread127174(tdone,ends);
          thread127175(tdone,ends);
          thread127176(tdone,ends);
          thread127177(tdone,ends);
          thread127178(tdone,ends);
          thread127179(tdone,ends);
          int biggest127180 = 0;
          if(ends[2]>=biggest127180){
            biggest127180=ends[2];
          }
          if(ends[3]>=biggest127180){
            biggest127180=ends[3];
          }
          if(ends[4]>=biggest127180){
            biggest127180=ends[4];
          }
          if(ends[5]>=biggest127180){
            biggest127180=ends[5];
          }
          if(ends[6]>=biggest127180){
            biggest127180=ends[6];
          }
          if(ends[7]>=biggest127180){
            biggest127180=ends[7];
          }
          if(ends[8]>=biggest127180){
            biggest127180=ends[8];
          }
          if(biggest127180 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
          //FINXME code
          if(biggest127180 == 0){
            S127163=0;
            active[1]=0;
            ends[1]=0;
            S127163=0;
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
