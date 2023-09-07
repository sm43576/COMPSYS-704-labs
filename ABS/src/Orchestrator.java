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
  private int S132488 = 1;
  private int S115413 = 1;
  private int S113897 = 1;
  private int S113639 = 1;
  private int S113601 = 1;
  private int S113596 = 1;
  private int S131993 = 1;
  private int S115437 = 1;
  private int S115421 = 1;
  private int S115416 = 1;
  private int S116122 = 1;
  private int S115482 = 1;
  private int S115444 = 1;
  private int S115439 = 1;
  private int S115489 = 1;
  private int S115484 = 1;
  private int S115577 = 1;
  private int S115572 = 1;
  private int S115709 = 1;
  private int S115704 = 1;
  private int S115989 = 1;
  private int S115885 = 1;
  private int S115880 = 1;
  private int S115907 = 1;
  private int S115902 = 1;
  private int S115996 = 1;
  private int S115991 = 1;
  private int S132064 = 1;
  private int S132016 = 1;
  private int S132000 = 1;
  private int S131995 = 1;
  private int S132135 = 1;
  private int S132087 = 1;
  private int S132071 = 1;
  private int S132066 = 1;
  private int S132206 = 1;
  private int S132158 = 1;
  private int S132142 = 1;
  private int S132137 = 1;
  private int S132277 = 1;
  private int S132229 = 1;
  private int S132213 = 1;
  private int S132208 = 1;
  private int S132486 = 1;
  private int S132346 = 1;
  private int S132345 = 1;
  private int S132284 = 1;
  private int S132279 = 1;
  private int S132329 = 1;
  private int S132324 = 1;
  
  private int[] ends = new int[9];
  private int[] tdone = new int[9];
  
  public void thread132504(int [] tdone, int [] ends){
        switch(S132486){
      case 0 : 
        active[8]=0;
        ends[8]=0;
        tdone[8]=1;
        break;
      
      case 1 : 
        switch(S132346){
          case 0 : 
            switch(S132345){
              case 0 : 
                switch(S132284){
                  case 0 : 
                    if(!allOperationsFinished_o.isPartnerPresent() || allOperationsFinished_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 150, column: 5
                      allOperationsFinished_o.setREQ(false);//sysj\orchestrator.sysj line: 150, column: 5
                      S132284=1;
                      active[8]=1;
                      ends[8]=1;
                      tdone[8]=1;
                    }
                    else {
                      switch(S132279){
                        case 0 : 
                          if(allOperationsFinished_o.isACK()){//sysj\orchestrator.sysj line: 150, column: 5
                            allOperationsFinished_o.setVal(true);//sysj\orchestrator.sysj line: 150, column: 5
                            S132279=1;
                            if(!allOperationsFinished_o.isACK()){//sysj\orchestrator.sysj line: 150, column: 5
                              allOperationsFinished_o.setREQ(false);//sysj\orchestrator.sysj line: 150, column: 5
                              ends[8]=2;
                              ;//sysj\orchestrator.sysj line: 150, column: 5
                              S132346=1;
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
                          if(!allOperationsFinished_o.isACK()){//sysj\orchestrator.sysj line: 150, column: 5
                            allOperationsFinished_o.setREQ(false);//sysj\orchestrator.sysj line: 150, column: 5
                            ends[8]=2;
                            ;//sysj\orchestrator.sysj line: 150, column: 5
                            S132346=1;
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
                    S132284=1;
                    S132284=0;
                    if(!allOperationsFinished_o.isPartnerPresent() || allOperationsFinished_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 150, column: 5
                      allOperationsFinished_o.setREQ(false);//sysj\orchestrator.sysj line: 150, column: 5
                      S132284=1;
                      active[8]=1;
                      ends[8]=1;
                      tdone[8]=1;
                    }
                    else {
                      S132279=0;
                      if(allOperationsFinished_o.isACK()){//sysj\orchestrator.sysj line: 150, column: 5
                        allOperationsFinished_o.setVal(true);//sysj\orchestrator.sysj line: 150, column: 5
                        S132279=1;
                        if(!allOperationsFinished_o.isACK()){//sysj\orchestrator.sysj line: 150, column: 5
                          allOperationsFinished_o.setREQ(false);//sysj\orchestrator.sysj line: 150, column: 5
                          ends[8]=2;
                          ;//sysj\orchestrator.sysj line: 150, column: 5
                          S132346=1;
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
                switch(S132329){
                  case 0 : 
                    if(!allOperationsFinished_o.isPartnerPresent() || allOperationsFinished_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 152, column: 5
                      allOperationsFinished_o.setREQ(false);//sysj\orchestrator.sysj line: 152, column: 5
                      S132329=1;
                      active[8]=1;
                      ends[8]=1;
                      tdone[8]=1;
                    }
                    else {
                      switch(S132324){
                        case 0 : 
                          if(allOperationsFinished_o.isACK()){//sysj\orchestrator.sysj line: 152, column: 5
                            allOperationsFinished_o.setVal(false);//sysj\orchestrator.sysj line: 152, column: 5
                            S132324=1;
                            if(!allOperationsFinished_o.isACK()){//sysj\orchestrator.sysj line: 152, column: 5
                              allOperationsFinished_o.setREQ(false);//sysj\orchestrator.sysj line: 152, column: 5
                              ends[8]=2;
                              ;//sysj\orchestrator.sysj line: 152, column: 5
                              S132346=1;
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
                          if(!allOperationsFinished_o.isACK()){//sysj\orchestrator.sysj line: 152, column: 5
                            allOperationsFinished_o.setREQ(false);//sysj\orchestrator.sysj line: 152, column: 5
                            ends[8]=2;
                            ;//sysj\orchestrator.sysj line: 152, column: 5
                            S132346=1;
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
                    S132329=1;
                    S132329=0;
                    if(!allOperationsFinished_o.isPartnerPresent() || allOperationsFinished_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 152, column: 5
                      allOperationsFinished_o.setREQ(false);//sysj\orchestrator.sysj line: 152, column: 5
                      S132329=1;
                      active[8]=1;
                      ends[8]=1;
                      tdone[8]=1;
                    }
                    else {
                      S132324=0;
                      if(allOperationsFinished_o.isACK()){//sysj\orchestrator.sysj line: 152, column: 5
                        allOperationsFinished_o.setVal(false);//sysj\orchestrator.sysj line: 152, column: 5
                        S132324=1;
                        if(!allOperationsFinished_o.isACK()){//sysj\orchestrator.sysj line: 152, column: 5
                          allOperationsFinished_o.setREQ(false);//sysj\orchestrator.sysj line: 152, column: 5
                          ends[8]=2;
                          ;//sysj\orchestrator.sysj line: 152, column: 5
                          S132346=1;
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
            S132346=1;
            S132346=0;
            if((Status.conveyStat == false) && (Status.fillerStat == false) && (Status.capperStat == false) && (Status.capLoaderStat == false)){//sysj\orchestrator.sysj line: 145, column: 7
              S132345=0;
              System.out.println("Orch sending rotary req");//sysj\orchestrator.sysj line: 149, column: 5
              S132284=0;
              if(!allOperationsFinished_o.isPartnerPresent() || allOperationsFinished_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 150, column: 5
                allOperationsFinished_o.setREQ(false);//sysj\orchestrator.sysj line: 150, column: 5
                S132284=1;
                active[8]=1;
                ends[8]=1;
                tdone[8]=1;
              }
              else {
                S132279=0;
                if(allOperationsFinished_o.isACK()){//sysj\orchestrator.sysj line: 150, column: 5
                  allOperationsFinished_o.setVal(true);//sysj\orchestrator.sysj line: 150, column: 5
                  S132279=1;
                  if(!allOperationsFinished_o.isACK()){//sysj\orchestrator.sysj line: 150, column: 5
                    allOperationsFinished_o.setREQ(false);//sysj\orchestrator.sysj line: 150, column: 5
                    ends[8]=2;
                    ;//sysj\orchestrator.sysj line: 150, column: 5
                    S132346=1;
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
              S132345=1;
              S132329=0;
              if(!allOperationsFinished_o.isPartnerPresent() || allOperationsFinished_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 152, column: 5
                allOperationsFinished_o.setREQ(false);//sysj\orchestrator.sysj line: 152, column: 5
                S132329=1;
                active[8]=1;
                ends[8]=1;
                tdone[8]=1;
              }
              else {
                S132324=0;
                if(allOperationsFinished_o.isACK()){//sysj\orchestrator.sysj line: 152, column: 5
                  allOperationsFinished_o.setVal(false);//sysj\orchestrator.sysj line: 152, column: 5
                  S132324=1;
                  if(!allOperationsFinished_o.isACK()){//sysj\orchestrator.sysj line: 152, column: 5
                    allOperationsFinished_o.setREQ(false);//sysj\orchestrator.sysj line: 152, column: 5
                    ends[8]=2;
                    ;//sysj\orchestrator.sysj line: 152, column: 5
                    S132346=1;
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

  public void thread132503(int [] tdone, int [] ends){
        switch(S132277){
      case 0 : 
        active[7]=0;
        ends[7]=0;
        tdone[7]=1;
        break;
      
      case 1 : 
        switch(S132229){
          case 0 : 
            switch(S132213){
              case 0 : 
                if(!capLoaderStatus_in.isPartnerPresent() || capLoaderStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 126, column: 4
                  capLoaderStatus_in.setACK(false);//sysj\orchestrator.sysj line: 126, column: 4
                  S132213=1;
                  active[7]=1;
                  ends[7]=1;
                  tdone[7]=1;
                }
                else {
                  switch(S132208){
                    case 0 : 
                      if(!capLoaderStatus_in.isREQ()){//sysj\orchestrator.sysj line: 126, column: 4
                        capLoaderStatus_in.setACK(true);//sysj\orchestrator.sysj line: 126, column: 4
                        S132208=1;
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
                            Status.capLoaderStat = false;//sysj\orchestrator.sysj line: 134, column: 5
                          }
                          S132229=1;
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
                          Status.capLoaderStat = false;//sysj\orchestrator.sysj line: 134, column: 5
                        }
                        S132229=1;
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
                S132213=1;
                S132213=0;
                if(!capLoaderStatus_in.isPartnerPresent() || capLoaderStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 126, column: 4
                  capLoaderStatus_in.setACK(false);//sysj\orchestrator.sysj line: 126, column: 4
                  S132213=1;
                  active[7]=1;
                  ends[7]=1;
                  tdone[7]=1;
                }
                else {
                  S132208=0;
                  if(!capLoaderStatus_in.isREQ()){//sysj\orchestrator.sysj line: 126, column: 4
                    capLoaderStatus_in.setACK(true);//sysj\orchestrator.sysj line: 126, column: 4
                    S132208=1;
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
                        Status.capLoaderStat = false;//sysj\orchestrator.sysj line: 134, column: 5
                      }
                      S132229=1;
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
            S132229=1;
            S132229=0;
            S132213=0;
            if(!capLoaderStatus_in.isPartnerPresent() || capLoaderStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 126, column: 4
              capLoaderStatus_in.setACK(false);//sysj\orchestrator.sysj line: 126, column: 4
              S132213=1;
              active[7]=1;
              ends[7]=1;
              tdone[7]=1;
            }
            else {
              S132208=0;
              if(!capLoaderStatus_in.isREQ()){//sysj\orchestrator.sysj line: 126, column: 4
                capLoaderStatus_in.setACK(true);//sysj\orchestrator.sysj line: 126, column: 4
                S132208=1;
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
                    Status.capLoaderStat = false;//sysj\orchestrator.sysj line: 134, column: 5
                  }
                  S132229=1;
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

  public void thread132502(int [] tdone, int [] ends){
        switch(S132206){
      case 0 : 
        active[6]=0;
        ends[6]=0;
        tdone[6]=1;
        break;
      
      case 1 : 
        switch(S132158){
          case 0 : 
            switch(S132142){
              case 0 : 
                if(!capperStatus_in.isPartnerPresent() || capperStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 110, column: 4
                  capperStatus_in.setACK(false);//sysj\orchestrator.sysj line: 110, column: 4
                  S132142=1;
                  active[6]=1;
                  ends[6]=1;
                  tdone[6]=1;
                }
                else {
                  switch(S132137){
                    case 0 : 
                      if(!capperStatus_in.isREQ()){//sysj\orchestrator.sysj line: 110, column: 4
                        capperStatus_in.setACK(true);//sysj\orchestrator.sysj line: 110, column: 4
                        S132137=1;
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
                            Status.capperStat = false;//sysj\orchestrator.sysj line: 118, column: 5
                          }
                          S132158=1;
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
                          Status.capperStat = false;//sysj\orchestrator.sysj line: 118, column: 5
                        }
                        S132158=1;
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
                S132142=1;
                S132142=0;
                if(!capperStatus_in.isPartnerPresent() || capperStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 110, column: 4
                  capperStatus_in.setACK(false);//sysj\orchestrator.sysj line: 110, column: 4
                  S132142=1;
                  active[6]=1;
                  ends[6]=1;
                  tdone[6]=1;
                }
                else {
                  S132137=0;
                  if(!capperStatus_in.isREQ()){//sysj\orchestrator.sysj line: 110, column: 4
                    capperStatus_in.setACK(true);//sysj\orchestrator.sysj line: 110, column: 4
                    S132137=1;
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
                        Status.capperStat = false;//sysj\orchestrator.sysj line: 118, column: 5
                      }
                      S132158=1;
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
            S132158=1;
            S132158=0;
            S132142=0;
            if(!capperStatus_in.isPartnerPresent() || capperStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 110, column: 4
              capperStatus_in.setACK(false);//sysj\orchestrator.sysj line: 110, column: 4
              S132142=1;
              active[6]=1;
              ends[6]=1;
              tdone[6]=1;
            }
            else {
              S132137=0;
              if(!capperStatus_in.isREQ()){//sysj\orchestrator.sysj line: 110, column: 4
                capperStatus_in.setACK(true);//sysj\orchestrator.sysj line: 110, column: 4
                S132137=1;
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
                    Status.capperStat = false;//sysj\orchestrator.sysj line: 118, column: 5
                  }
                  S132158=1;
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

  public void thread132501(int [] tdone, int [] ends){
        switch(S132135){
      case 0 : 
        active[5]=0;
        ends[5]=0;
        tdone[5]=1;
        break;
      
      case 1 : 
        switch(S132087){
          case 0 : 
            switch(S132071){
              case 0 : 
                if(!fillerStatus_in.isPartnerPresent() || fillerStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 94, column: 4
                  fillerStatus_in.setACK(false);//sysj\orchestrator.sysj line: 94, column: 4
                  S132071=1;
                  active[5]=1;
                  ends[5]=1;
                  tdone[5]=1;
                }
                else {
                  switch(S132066){
                    case 0 : 
                      if(!fillerStatus_in.isREQ()){//sysj\orchestrator.sysj line: 94, column: 4
                        fillerStatus_in.setACK(true);//sysj\orchestrator.sysj line: 94, column: 4
                        S132066=1;
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
                            Status.fillerStat = false;//sysj\orchestrator.sysj line: 102, column: 5
                          }
                          S132087=1;
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
                          Status.fillerStat = false;//sysj\orchestrator.sysj line: 102, column: 5
                        }
                        S132087=1;
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
                S132071=1;
                S132071=0;
                if(!fillerStatus_in.isPartnerPresent() || fillerStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 94, column: 4
                  fillerStatus_in.setACK(false);//sysj\orchestrator.sysj line: 94, column: 4
                  S132071=1;
                  active[5]=1;
                  ends[5]=1;
                  tdone[5]=1;
                }
                else {
                  S132066=0;
                  if(!fillerStatus_in.isREQ()){//sysj\orchestrator.sysj line: 94, column: 4
                    fillerStatus_in.setACK(true);//sysj\orchestrator.sysj line: 94, column: 4
                    S132066=1;
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
                        Status.fillerStat = false;//sysj\orchestrator.sysj line: 102, column: 5
                      }
                      S132087=1;
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
            S132087=1;
            S132087=0;
            S132071=0;
            if(!fillerStatus_in.isPartnerPresent() || fillerStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 94, column: 4
              fillerStatus_in.setACK(false);//sysj\orchestrator.sysj line: 94, column: 4
              S132071=1;
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            else {
              S132066=0;
              if(!fillerStatus_in.isREQ()){//sysj\orchestrator.sysj line: 94, column: 4
                fillerStatus_in.setACK(true);//sysj\orchestrator.sysj line: 94, column: 4
                S132066=1;
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
                    Status.fillerStat = false;//sysj\orchestrator.sysj line: 102, column: 5
                  }
                  S132087=1;
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

  public void thread132500(int [] tdone, int [] ends){
        switch(S132064){
      case 0 : 
        active[4]=0;
        ends[4]=0;
        tdone[4]=1;
        break;
      
      case 1 : 
        switch(S132016){
          case 0 : 
            switch(S132000){
              case 0 : 
                if(!conveyorStatus_in.isPartnerPresent() || conveyorStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 77, column: 4
                  conveyorStatus_in.setACK(false);//sysj\orchestrator.sysj line: 77, column: 4
                  S132000=1;
                  active[4]=1;
                  ends[4]=1;
                  tdone[4]=1;
                }
                else {
                  switch(S131995){
                    case 0 : 
                      if(!conveyorStatus_in.isREQ()){//sysj\orchestrator.sysj line: 77, column: 4
                        conveyorStatus_in.setACK(true);//sysj\orchestrator.sysj line: 77, column: 4
                        S131995=1;
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
                            Status.conveyStat = false;//sysj\orchestrator.sysj line: 85, column: 5
                          }
                          S132016=1;
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
                          Status.conveyStat = false;//sysj\orchestrator.sysj line: 85, column: 5
                        }
                        S132016=1;
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
                S132000=1;
                S132000=0;
                if(!conveyorStatus_in.isPartnerPresent() || conveyorStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 77, column: 4
                  conveyorStatus_in.setACK(false);//sysj\orchestrator.sysj line: 77, column: 4
                  S132000=1;
                  active[4]=1;
                  ends[4]=1;
                  tdone[4]=1;
                }
                else {
                  S131995=0;
                  if(!conveyorStatus_in.isREQ()){//sysj\orchestrator.sysj line: 77, column: 4
                    conveyorStatus_in.setACK(true);//sysj\orchestrator.sysj line: 77, column: 4
                    S131995=1;
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
                        Status.conveyStat = false;//sysj\orchestrator.sysj line: 85, column: 5
                      }
                      S132016=1;
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
            S132016=1;
            S132016=0;
            S132000=0;
            if(!conveyorStatus_in.isPartnerPresent() || conveyorStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 77, column: 4
              conveyorStatus_in.setACK(false);//sysj\orchestrator.sysj line: 77, column: 4
              S132000=1;
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            else {
              S131995=0;
              if(!conveyorStatus_in.isREQ()){//sysj\orchestrator.sysj line: 77, column: 4
                conveyorStatus_in.setACK(true);//sysj\orchestrator.sysj line: 77, column: 4
                S131995=1;
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
                    Status.conveyStat = false;//sysj\orchestrator.sysj line: 85, column: 5
                  }
                  S132016=1;
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

  public void thread132499(int [] tdone, int [] ends){
        switch(S131993){
      case 0 : 
        active[3]=0;
        ends[3]=0;
        tdone[3]=1;
        break;
      
      case 1 : 
        switch(S115437){
          case 0 : 
            switch(S115421){
              case 0 : 
                if(!rotaryStatus_in.isPartnerPresent() || rotaryStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 53, column: 4
                  rotaryStatus_in.setACK(false);//sysj\orchestrator.sysj line: 53, column: 4
                  S115421=1;
                  active[3]=1;
                  ends[3]=1;
                  tdone[3]=1;
                }
                else {
                  switch(S115416){
                    case 0 : 
                      if(!rotaryStatus_in.isREQ()){//sysj\orchestrator.sysj line: 53, column: 4
                        rotaryStatus_in.setACK(true);//sysj\orchestrator.sysj line: 53, column: 4
                        S115416=1;
                        if(rotaryStatus_in.isREQ()){//sysj\orchestrator.sysj line: 53, column: 4
                          rotaryStatus_in.setACK(false);//sysj\orchestrator.sysj line: 53, column: 4
                          ends[3]=2;
                          ;//sysj\orchestrator.sysj line: 53, column: 4
                          rotaryStat_thread_3 = (rotaryStatus_in.getVal() == null ? null : ((String)rotaryStatus_in.getVal()));//sysj\orchestrator.sysj line: 54, column: 4
                          S115437=1;
                          if(rotaryStat_thread_3 == "done"){//sysj\orchestrator.sysj line: 57, column: 7
                            S116122=0;
                            System.out.println("rotary done, sending filler,loader,screwer, conveyor reqs");//sysj\orchestrator.sysj line: 58, column: 5
                            S115482=0;
                            S115444=0;
                            if(!fillerReq_o.isPartnerPresent() || fillerReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 59, column: 5
                              fillerReq_o.setREQ(false);//sysj\orchestrator.sysj line: 59, column: 5
                              S115444=1;
                              active[3]=1;
                              ends[3]=1;
                              tdone[3]=1;
                            }
                            else {
                              S115439=0;
                              if(fillerReq_o.isACK()){//sysj\orchestrator.sysj line: 59, column: 5
                                fillerReq_o.setVal(true);//sysj\orchestrator.sysj line: 59, column: 5
                                S115439=1;
                                if(!fillerReq_o.isACK()){//sysj\orchestrator.sysj line: 59, column: 5
                                  fillerReq_o.setREQ(false);//sysj\orchestrator.sysj line: 59, column: 5
                                  ends[3]=2;
                                  ;//sysj\orchestrator.sysj line: 59, column: 5
                                  S115482=1;
                                  S115489=0;
                                  if(!percentLiquid_o.isPartnerPresent() || percentLiquid_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 60, column: 5
                                    percentLiquid_o.setREQ(false);//sysj\orchestrator.sysj line: 60, column: 5
                                    S115489=1;
                                    active[3]=1;
                                    ends[3]=1;
                                    tdone[3]=1;
                                  }
                                  else {
                                    S115484=0;
                                    if(percentLiquid_o.isACK()){//sysj\orchestrator.sysj line: 60, column: 5
                                      percentLiquid_o.setVal(liquidPercent_thread_3);//sysj\orchestrator.sysj line: 60, column: 5
                                      S115484=1;
                                      if(!percentLiquid_o.isACK()){//sysj\orchestrator.sysj line: 60, column: 5
                                        percentLiquid_o.setREQ(false);//sysj\orchestrator.sysj line: 60, column: 5
                                        ends[3]=2;
                                        ;//sysj\orchestrator.sysj line: 60, column: 5
                                        S115482=2;
                                        S115577=0;
                                        if(!capLoaderReq_o.isPartnerPresent() || capLoaderReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 61, column: 5
                                          capLoaderReq_o.setREQ(false);//sysj\orchestrator.sysj line: 61, column: 5
                                          S115577=1;
                                          active[3]=1;
                                          ends[3]=1;
                                          tdone[3]=1;
                                        }
                                        else {
                                          S115572=0;
                                          if(capLoaderReq_o.isACK()){//sysj\orchestrator.sysj line: 61, column: 5
                                            capLoaderReq_o.setVal(true);//sysj\orchestrator.sysj line: 61, column: 5
                                            S115572=1;
                                            if(!capLoaderReq_o.isACK()){//sysj\orchestrator.sysj line: 61, column: 5
                                              capLoaderReq_o.setREQ(false);//sysj\orchestrator.sysj line: 61, column: 5
                                              ends[3]=2;
                                              ;//sysj\orchestrator.sysj line: 61, column: 5
                                              S115482=3;
                                              S115709=0;
                                              if(!capperReq_o.isPartnerPresent() || capperReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 62, column: 5
                                                capperReq_o.setREQ(false);//sysj\orchestrator.sysj line: 62, column: 5
                                                S115709=1;
                                                active[3]=1;
                                                ends[3]=1;
                                                tdone[3]=1;
                                              }
                                              else {
                                                S115704=0;
                                                if(capperReq_o.isACK()){//sysj\orchestrator.sysj line: 62, column: 5
                                                  capperReq_o.setVal(true);//sysj\orchestrator.sysj line: 62, column: 5
                                                  S115704=1;
                                                  if(!capperReq_o.isACK()){//sysj\orchestrator.sysj line: 62, column: 5
                                                    capperReq_o.setREQ(false);//sysj\orchestrator.sysj line: 62, column: 5
                                                    ends[3]=2;
                                                    ;//sysj\orchestrator.sysj line: 62, column: 5
                                                    getNextBottle_1.setPresent();//sysj\orchestrator.sysj line: 63, column: 5
                                                    currsigs.addElement(getNextBottle_1);
                                                    S115437=2;
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
                            S116122=1;
                            S115989=0;
                            S115885=0;
                            if(!fillerReq_o.isPartnerPresent() || fillerReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 66, column: 5
                              fillerReq_o.setREQ(false);//sysj\orchestrator.sysj line: 66, column: 5
                              S115885=1;
                              active[3]=1;
                              ends[3]=1;
                              tdone[3]=1;
                            }
                            else {
                              S115880=0;
                              if(fillerReq_o.isACK()){//sysj\orchestrator.sysj line: 66, column: 5
                                fillerReq_o.setVal(false);//sysj\orchestrator.sysj line: 66, column: 5
                                S115880=1;
                                if(!fillerReq_o.isACK()){//sysj\orchestrator.sysj line: 66, column: 5
                                  fillerReq_o.setREQ(false);//sysj\orchestrator.sysj line: 66, column: 5
                                  ends[3]=2;
                                  ;//sysj\orchestrator.sysj line: 66, column: 5
                                  S115989=1;
                                  S115907=0;
                                  if(!capLoaderReq_o.isPartnerPresent() || capLoaderReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 67, column: 5
                                    capLoaderReq_o.setREQ(false);//sysj\orchestrator.sysj line: 67, column: 5
                                    S115907=1;
                                    active[3]=1;
                                    ends[3]=1;
                                    tdone[3]=1;
                                  }
                                  else {
                                    S115902=0;
                                    if(capLoaderReq_o.isACK()){//sysj\orchestrator.sysj line: 67, column: 5
                                      capLoaderReq_o.setVal(false);//sysj\orchestrator.sysj line: 67, column: 5
                                      S115902=1;
                                      if(!capLoaderReq_o.isACK()){//sysj\orchestrator.sysj line: 67, column: 5
                                        capLoaderReq_o.setREQ(false);//sysj\orchestrator.sysj line: 67, column: 5
                                        ends[3]=2;
                                        ;//sysj\orchestrator.sysj line: 67, column: 5
                                        S115989=2;
                                        S115996=0;
                                        if(!capperReq_o.isPartnerPresent() || capperReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 68, column: 5
                                          capperReq_o.setREQ(false);//sysj\orchestrator.sysj line: 68, column: 5
                                          S115996=1;
                                          active[3]=1;
                                          ends[3]=1;
                                          tdone[3]=1;
                                        }
                                        else {
                                          S115991=0;
                                          if(capperReq_o.isACK()){//sysj\orchestrator.sysj line: 68, column: 5
                                            capperReq_o.setVal(false);//sysj\orchestrator.sysj line: 68, column: 5
                                            S115991=1;
                                            if(!capperReq_o.isACK()){//sysj\orchestrator.sysj line: 68, column: 5
                                              capperReq_o.setREQ(false);//sysj\orchestrator.sysj line: 68, column: 5
                                              ends[3]=2;
                                              ;//sysj\orchestrator.sysj line: 68, column: 5
                                              S115437=2;
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
                        S115437=1;
                        if(rotaryStat_thread_3 == "done"){//sysj\orchestrator.sysj line: 57, column: 7
                          S116122=0;
                          System.out.println("rotary done, sending filler,loader,screwer, conveyor reqs");//sysj\orchestrator.sysj line: 58, column: 5
                          S115482=0;
                          S115444=0;
                          if(!fillerReq_o.isPartnerPresent() || fillerReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 59, column: 5
                            fillerReq_o.setREQ(false);//sysj\orchestrator.sysj line: 59, column: 5
                            S115444=1;
                            active[3]=1;
                            ends[3]=1;
                            tdone[3]=1;
                          }
                          else {
                            S115439=0;
                            if(fillerReq_o.isACK()){//sysj\orchestrator.sysj line: 59, column: 5
                              fillerReq_o.setVal(true);//sysj\orchestrator.sysj line: 59, column: 5
                              S115439=1;
                              if(!fillerReq_o.isACK()){//sysj\orchestrator.sysj line: 59, column: 5
                                fillerReq_o.setREQ(false);//sysj\orchestrator.sysj line: 59, column: 5
                                ends[3]=2;
                                ;//sysj\orchestrator.sysj line: 59, column: 5
                                S115482=1;
                                S115489=0;
                                if(!percentLiquid_o.isPartnerPresent() || percentLiquid_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 60, column: 5
                                  percentLiquid_o.setREQ(false);//sysj\orchestrator.sysj line: 60, column: 5
                                  S115489=1;
                                  active[3]=1;
                                  ends[3]=1;
                                  tdone[3]=1;
                                }
                                else {
                                  S115484=0;
                                  if(percentLiquid_o.isACK()){//sysj\orchestrator.sysj line: 60, column: 5
                                    percentLiquid_o.setVal(liquidPercent_thread_3);//sysj\orchestrator.sysj line: 60, column: 5
                                    S115484=1;
                                    if(!percentLiquid_o.isACK()){//sysj\orchestrator.sysj line: 60, column: 5
                                      percentLiquid_o.setREQ(false);//sysj\orchestrator.sysj line: 60, column: 5
                                      ends[3]=2;
                                      ;//sysj\orchestrator.sysj line: 60, column: 5
                                      S115482=2;
                                      S115577=0;
                                      if(!capLoaderReq_o.isPartnerPresent() || capLoaderReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 61, column: 5
                                        capLoaderReq_o.setREQ(false);//sysj\orchestrator.sysj line: 61, column: 5
                                        S115577=1;
                                        active[3]=1;
                                        ends[3]=1;
                                        tdone[3]=1;
                                      }
                                      else {
                                        S115572=0;
                                        if(capLoaderReq_o.isACK()){//sysj\orchestrator.sysj line: 61, column: 5
                                          capLoaderReq_o.setVal(true);//sysj\orchestrator.sysj line: 61, column: 5
                                          S115572=1;
                                          if(!capLoaderReq_o.isACK()){//sysj\orchestrator.sysj line: 61, column: 5
                                            capLoaderReq_o.setREQ(false);//sysj\orchestrator.sysj line: 61, column: 5
                                            ends[3]=2;
                                            ;//sysj\orchestrator.sysj line: 61, column: 5
                                            S115482=3;
                                            S115709=0;
                                            if(!capperReq_o.isPartnerPresent() || capperReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 62, column: 5
                                              capperReq_o.setREQ(false);//sysj\orchestrator.sysj line: 62, column: 5
                                              S115709=1;
                                              active[3]=1;
                                              ends[3]=1;
                                              tdone[3]=1;
                                            }
                                            else {
                                              S115704=0;
                                              if(capperReq_o.isACK()){//sysj\orchestrator.sysj line: 62, column: 5
                                                capperReq_o.setVal(true);//sysj\orchestrator.sysj line: 62, column: 5
                                                S115704=1;
                                                if(!capperReq_o.isACK()){//sysj\orchestrator.sysj line: 62, column: 5
                                                  capperReq_o.setREQ(false);//sysj\orchestrator.sysj line: 62, column: 5
                                                  ends[3]=2;
                                                  ;//sysj\orchestrator.sysj line: 62, column: 5
                                                  getNextBottle_1.setPresent();//sysj\orchestrator.sysj line: 63, column: 5
                                                  currsigs.addElement(getNextBottle_1);
                                                  S115437=2;
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
                          S116122=1;
                          S115989=0;
                          S115885=0;
                          if(!fillerReq_o.isPartnerPresent() || fillerReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 66, column: 5
                            fillerReq_o.setREQ(false);//sysj\orchestrator.sysj line: 66, column: 5
                            S115885=1;
                            active[3]=1;
                            ends[3]=1;
                            tdone[3]=1;
                          }
                          else {
                            S115880=0;
                            if(fillerReq_o.isACK()){//sysj\orchestrator.sysj line: 66, column: 5
                              fillerReq_o.setVal(false);//sysj\orchestrator.sysj line: 66, column: 5
                              S115880=1;
                              if(!fillerReq_o.isACK()){//sysj\orchestrator.sysj line: 66, column: 5
                                fillerReq_o.setREQ(false);//sysj\orchestrator.sysj line: 66, column: 5
                                ends[3]=2;
                                ;//sysj\orchestrator.sysj line: 66, column: 5
                                S115989=1;
                                S115907=0;
                                if(!capLoaderReq_o.isPartnerPresent() || capLoaderReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 67, column: 5
                                  capLoaderReq_o.setREQ(false);//sysj\orchestrator.sysj line: 67, column: 5
                                  S115907=1;
                                  active[3]=1;
                                  ends[3]=1;
                                  tdone[3]=1;
                                }
                                else {
                                  S115902=0;
                                  if(capLoaderReq_o.isACK()){//sysj\orchestrator.sysj line: 67, column: 5
                                    capLoaderReq_o.setVal(false);//sysj\orchestrator.sysj line: 67, column: 5
                                    S115902=1;
                                    if(!capLoaderReq_o.isACK()){//sysj\orchestrator.sysj line: 67, column: 5
                                      capLoaderReq_o.setREQ(false);//sysj\orchestrator.sysj line: 67, column: 5
                                      ends[3]=2;
                                      ;//sysj\orchestrator.sysj line: 67, column: 5
                                      S115989=2;
                                      S115996=0;
                                      if(!capperReq_o.isPartnerPresent() || capperReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 68, column: 5
                                        capperReq_o.setREQ(false);//sysj\orchestrator.sysj line: 68, column: 5
                                        S115996=1;
                                        active[3]=1;
                                        ends[3]=1;
                                        tdone[3]=1;
                                      }
                                      else {
                                        S115991=0;
                                        if(capperReq_o.isACK()){//sysj\orchestrator.sysj line: 68, column: 5
                                          capperReq_o.setVal(false);//sysj\orchestrator.sysj line: 68, column: 5
                                          S115991=1;
                                          if(!capperReq_o.isACK()){//sysj\orchestrator.sysj line: 68, column: 5
                                            capperReq_o.setREQ(false);//sysj\orchestrator.sysj line: 68, column: 5
                                            ends[3]=2;
                                            ;//sysj\orchestrator.sysj line: 68, column: 5
                                            S115437=2;
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
                S115421=1;
                S115421=0;
                if(!rotaryStatus_in.isPartnerPresent() || rotaryStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 53, column: 4
                  rotaryStatus_in.setACK(false);//sysj\orchestrator.sysj line: 53, column: 4
                  S115421=1;
                  active[3]=1;
                  ends[3]=1;
                  tdone[3]=1;
                }
                else {
                  S115416=0;
                  if(!rotaryStatus_in.isREQ()){//sysj\orchestrator.sysj line: 53, column: 4
                    rotaryStatus_in.setACK(true);//sysj\orchestrator.sysj line: 53, column: 4
                    S115416=1;
                    if(rotaryStatus_in.isREQ()){//sysj\orchestrator.sysj line: 53, column: 4
                      rotaryStatus_in.setACK(false);//sysj\orchestrator.sysj line: 53, column: 4
                      ends[3]=2;
                      ;//sysj\orchestrator.sysj line: 53, column: 4
                      rotaryStat_thread_3 = (rotaryStatus_in.getVal() == null ? null : ((String)rotaryStatus_in.getVal()));//sysj\orchestrator.sysj line: 54, column: 4
                      S115437=1;
                      if(rotaryStat_thread_3 == "done"){//sysj\orchestrator.sysj line: 57, column: 7
                        S116122=0;
                        System.out.println("rotary done, sending filler,loader,screwer, conveyor reqs");//sysj\orchestrator.sysj line: 58, column: 5
                        S115482=0;
                        S115444=0;
                        if(!fillerReq_o.isPartnerPresent() || fillerReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 59, column: 5
                          fillerReq_o.setREQ(false);//sysj\orchestrator.sysj line: 59, column: 5
                          S115444=1;
                          active[3]=1;
                          ends[3]=1;
                          tdone[3]=1;
                        }
                        else {
                          S115439=0;
                          if(fillerReq_o.isACK()){//sysj\orchestrator.sysj line: 59, column: 5
                            fillerReq_o.setVal(true);//sysj\orchestrator.sysj line: 59, column: 5
                            S115439=1;
                            if(!fillerReq_o.isACK()){//sysj\orchestrator.sysj line: 59, column: 5
                              fillerReq_o.setREQ(false);//sysj\orchestrator.sysj line: 59, column: 5
                              ends[3]=2;
                              ;//sysj\orchestrator.sysj line: 59, column: 5
                              S115482=1;
                              S115489=0;
                              if(!percentLiquid_o.isPartnerPresent() || percentLiquid_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 60, column: 5
                                percentLiquid_o.setREQ(false);//sysj\orchestrator.sysj line: 60, column: 5
                                S115489=1;
                                active[3]=1;
                                ends[3]=1;
                                tdone[3]=1;
                              }
                              else {
                                S115484=0;
                                if(percentLiquid_o.isACK()){//sysj\orchestrator.sysj line: 60, column: 5
                                  percentLiquid_o.setVal(liquidPercent_thread_3);//sysj\orchestrator.sysj line: 60, column: 5
                                  S115484=1;
                                  if(!percentLiquid_o.isACK()){//sysj\orchestrator.sysj line: 60, column: 5
                                    percentLiquid_o.setREQ(false);//sysj\orchestrator.sysj line: 60, column: 5
                                    ends[3]=2;
                                    ;//sysj\orchestrator.sysj line: 60, column: 5
                                    S115482=2;
                                    S115577=0;
                                    if(!capLoaderReq_o.isPartnerPresent() || capLoaderReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 61, column: 5
                                      capLoaderReq_o.setREQ(false);//sysj\orchestrator.sysj line: 61, column: 5
                                      S115577=1;
                                      active[3]=1;
                                      ends[3]=1;
                                      tdone[3]=1;
                                    }
                                    else {
                                      S115572=0;
                                      if(capLoaderReq_o.isACK()){//sysj\orchestrator.sysj line: 61, column: 5
                                        capLoaderReq_o.setVal(true);//sysj\orchestrator.sysj line: 61, column: 5
                                        S115572=1;
                                        if(!capLoaderReq_o.isACK()){//sysj\orchestrator.sysj line: 61, column: 5
                                          capLoaderReq_o.setREQ(false);//sysj\orchestrator.sysj line: 61, column: 5
                                          ends[3]=2;
                                          ;//sysj\orchestrator.sysj line: 61, column: 5
                                          S115482=3;
                                          S115709=0;
                                          if(!capperReq_o.isPartnerPresent() || capperReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 62, column: 5
                                            capperReq_o.setREQ(false);//sysj\orchestrator.sysj line: 62, column: 5
                                            S115709=1;
                                            active[3]=1;
                                            ends[3]=1;
                                            tdone[3]=1;
                                          }
                                          else {
                                            S115704=0;
                                            if(capperReq_o.isACK()){//sysj\orchestrator.sysj line: 62, column: 5
                                              capperReq_o.setVal(true);//sysj\orchestrator.sysj line: 62, column: 5
                                              S115704=1;
                                              if(!capperReq_o.isACK()){//sysj\orchestrator.sysj line: 62, column: 5
                                                capperReq_o.setREQ(false);//sysj\orchestrator.sysj line: 62, column: 5
                                                ends[3]=2;
                                                ;//sysj\orchestrator.sysj line: 62, column: 5
                                                getNextBottle_1.setPresent();//sysj\orchestrator.sysj line: 63, column: 5
                                                currsigs.addElement(getNextBottle_1);
                                                S115437=2;
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
                        S116122=1;
                        S115989=0;
                        S115885=0;
                        if(!fillerReq_o.isPartnerPresent() || fillerReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 66, column: 5
                          fillerReq_o.setREQ(false);//sysj\orchestrator.sysj line: 66, column: 5
                          S115885=1;
                          active[3]=1;
                          ends[3]=1;
                          tdone[3]=1;
                        }
                        else {
                          S115880=0;
                          if(fillerReq_o.isACK()){//sysj\orchestrator.sysj line: 66, column: 5
                            fillerReq_o.setVal(false);//sysj\orchestrator.sysj line: 66, column: 5
                            S115880=1;
                            if(!fillerReq_o.isACK()){//sysj\orchestrator.sysj line: 66, column: 5
                              fillerReq_o.setREQ(false);//sysj\orchestrator.sysj line: 66, column: 5
                              ends[3]=2;
                              ;//sysj\orchestrator.sysj line: 66, column: 5
                              S115989=1;
                              S115907=0;
                              if(!capLoaderReq_o.isPartnerPresent() || capLoaderReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 67, column: 5
                                capLoaderReq_o.setREQ(false);//sysj\orchestrator.sysj line: 67, column: 5
                                S115907=1;
                                active[3]=1;
                                ends[3]=1;
                                tdone[3]=1;
                              }
                              else {
                                S115902=0;
                                if(capLoaderReq_o.isACK()){//sysj\orchestrator.sysj line: 67, column: 5
                                  capLoaderReq_o.setVal(false);//sysj\orchestrator.sysj line: 67, column: 5
                                  S115902=1;
                                  if(!capLoaderReq_o.isACK()){//sysj\orchestrator.sysj line: 67, column: 5
                                    capLoaderReq_o.setREQ(false);//sysj\orchestrator.sysj line: 67, column: 5
                                    ends[3]=2;
                                    ;//sysj\orchestrator.sysj line: 67, column: 5
                                    S115989=2;
                                    S115996=0;
                                    if(!capperReq_o.isPartnerPresent() || capperReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 68, column: 5
                                      capperReq_o.setREQ(false);//sysj\orchestrator.sysj line: 68, column: 5
                                      S115996=1;
                                      active[3]=1;
                                      ends[3]=1;
                                      tdone[3]=1;
                                    }
                                    else {
                                      S115991=0;
                                      if(capperReq_o.isACK()){//sysj\orchestrator.sysj line: 68, column: 5
                                        capperReq_o.setVal(false);//sysj\orchestrator.sysj line: 68, column: 5
                                        S115991=1;
                                        if(!capperReq_o.isACK()){//sysj\orchestrator.sysj line: 68, column: 5
                                          capperReq_o.setREQ(false);//sysj\orchestrator.sysj line: 68, column: 5
                                          ends[3]=2;
                                          ;//sysj\orchestrator.sysj line: 68, column: 5
                                          S115437=2;
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
            switch(S116122){
              case 0 : 
                switch(S115482){
                  case 0 : 
                    switch(S115444){
                      case 0 : 
                        if(!fillerReq_o.isPartnerPresent() || fillerReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 59, column: 5
                          fillerReq_o.setREQ(false);//sysj\orchestrator.sysj line: 59, column: 5
                          S115444=1;
                          active[3]=1;
                          ends[3]=1;
                          tdone[3]=1;
                        }
                        else {
                          switch(S115439){
                            case 0 : 
                              if(fillerReq_o.isACK()){//sysj\orchestrator.sysj line: 59, column: 5
                                fillerReq_o.setVal(true);//sysj\orchestrator.sysj line: 59, column: 5
                                S115439=1;
                                if(!fillerReq_o.isACK()){//sysj\orchestrator.sysj line: 59, column: 5
                                  fillerReq_o.setREQ(false);//sysj\orchestrator.sysj line: 59, column: 5
                                  ends[3]=2;
                                  ;//sysj\orchestrator.sysj line: 59, column: 5
                                  S115482=1;
                                  S115489=0;
                                  if(!percentLiquid_o.isPartnerPresent() || percentLiquid_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 60, column: 5
                                    percentLiquid_o.setREQ(false);//sysj\orchestrator.sysj line: 60, column: 5
                                    S115489=1;
                                    active[3]=1;
                                    ends[3]=1;
                                    tdone[3]=1;
                                  }
                                  else {
                                    S115484=0;
                                    if(percentLiquid_o.isACK()){//sysj\orchestrator.sysj line: 60, column: 5
                                      percentLiquid_o.setVal(liquidPercent_thread_3);//sysj\orchestrator.sysj line: 60, column: 5
                                      S115484=1;
                                      if(!percentLiquid_o.isACK()){//sysj\orchestrator.sysj line: 60, column: 5
                                        percentLiquid_o.setREQ(false);//sysj\orchestrator.sysj line: 60, column: 5
                                        ends[3]=2;
                                        ;//sysj\orchestrator.sysj line: 60, column: 5
                                        S115482=2;
                                        S115577=0;
                                        if(!capLoaderReq_o.isPartnerPresent() || capLoaderReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 61, column: 5
                                          capLoaderReq_o.setREQ(false);//sysj\orchestrator.sysj line: 61, column: 5
                                          S115577=1;
                                          active[3]=1;
                                          ends[3]=1;
                                          tdone[3]=1;
                                        }
                                        else {
                                          S115572=0;
                                          if(capLoaderReq_o.isACK()){//sysj\orchestrator.sysj line: 61, column: 5
                                            capLoaderReq_o.setVal(true);//sysj\orchestrator.sysj line: 61, column: 5
                                            S115572=1;
                                            if(!capLoaderReq_o.isACK()){//sysj\orchestrator.sysj line: 61, column: 5
                                              capLoaderReq_o.setREQ(false);//sysj\orchestrator.sysj line: 61, column: 5
                                              ends[3]=2;
                                              ;//sysj\orchestrator.sysj line: 61, column: 5
                                              S115482=3;
                                              S115709=0;
                                              if(!capperReq_o.isPartnerPresent() || capperReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 62, column: 5
                                                capperReq_o.setREQ(false);//sysj\orchestrator.sysj line: 62, column: 5
                                                S115709=1;
                                                active[3]=1;
                                                ends[3]=1;
                                                tdone[3]=1;
                                              }
                                              else {
                                                S115704=0;
                                                if(capperReq_o.isACK()){//sysj\orchestrator.sysj line: 62, column: 5
                                                  capperReq_o.setVal(true);//sysj\orchestrator.sysj line: 62, column: 5
                                                  S115704=1;
                                                  if(!capperReq_o.isACK()){//sysj\orchestrator.sysj line: 62, column: 5
                                                    capperReq_o.setREQ(false);//sysj\orchestrator.sysj line: 62, column: 5
                                                    ends[3]=2;
                                                    ;//sysj\orchestrator.sysj line: 62, column: 5
                                                    getNextBottle_1.setPresent();//sysj\orchestrator.sysj line: 63, column: 5
                                                    currsigs.addElement(getNextBottle_1);
                                                    S115437=2;
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
                                S115482=1;
                                S115489=0;
                                if(!percentLiquid_o.isPartnerPresent() || percentLiquid_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 60, column: 5
                                  percentLiquid_o.setREQ(false);//sysj\orchestrator.sysj line: 60, column: 5
                                  S115489=1;
                                  active[3]=1;
                                  ends[3]=1;
                                  tdone[3]=1;
                                }
                                else {
                                  S115484=0;
                                  if(percentLiquid_o.isACK()){//sysj\orchestrator.sysj line: 60, column: 5
                                    percentLiquid_o.setVal(liquidPercent_thread_3);//sysj\orchestrator.sysj line: 60, column: 5
                                    S115484=1;
                                    if(!percentLiquid_o.isACK()){//sysj\orchestrator.sysj line: 60, column: 5
                                      percentLiquid_o.setREQ(false);//sysj\orchestrator.sysj line: 60, column: 5
                                      ends[3]=2;
                                      ;//sysj\orchestrator.sysj line: 60, column: 5
                                      S115482=2;
                                      S115577=0;
                                      if(!capLoaderReq_o.isPartnerPresent() || capLoaderReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 61, column: 5
                                        capLoaderReq_o.setREQ(false);//sysj\orchestrator.sysj line: 61, column: 5
                                        S115577=1;
                                        active[3]=1;
                                        ends[3]=1;
                                        tdone[3]=1;
                                      }
                                      else {
                                        S115572=0;
                                        if(capLoaderReq_o.isACK()){//sysj\orchestrator.sysj line: 61, column: 5
                                          capLoaderReq_o.setVal(true);//sysj\orchestrator.sysj line: 61, column: 5
                                          S115572=1;
                                          if(!capLoaderReq_o.isACK()){//sysj\orchestrator.sysj line: 61, column: 5
                                            capLoaderReq_o.setREQ(false);//sysj\orchestrator.sysj line: 61, column: 5
                                            ends[3]=2;
                                            ;//sysj\orchestrator.sysj line: 61, column: 5
                                            S115482=3;
                                            S115709=0;
                                            if(!capperReq_o.isPartnerPresent() || capperReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 62, column: 5
                                              capperReq_o.setREQ(false);//sysj\orchestrator.sysj line: 62, column: 5
                                              S115709=1;
                                              active[3]=1;
                                              ends[3]=1;
                                              tdone[3]=1;
                                            }
                                            else {
                                              S115704=0;
                                              if(capperReq_o.isACK()){//sysj\orchestrator.sysj line: 62, column: 5
                                                capperReq_o.setVal(true);//sysj\orchestrator.sysj line: 62, column: 5
                                                S115704=1;
                                                if(!capperReq_o.isACK()){//sysj\orchestrator.sysj line: 62, column: 5
                                                  capperReq_o.setREQ(false);//sysj\orchestrator.sysj line: 62, column: 5
                                                  ends[3]=2;
                                                  ;//sysj\orchestrator.sysj line: 62, column: 5
                                                  getNextBottle_1.setPresent();//sysj\orchestrator.sysj line: 63, column: 5
                                                  currsigs.addElement(getNextBottle_1);
                                                  S115437=2;
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
                        S115444=1;
                        S115444=0;
                        if(!fillerReq_o.isPartnerPresent() || fillerReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 59, column: 5
                          fillerReq_o.setREQ(false);//sysj\orchestrator.sysj line: 59, column: 5
                          S115444=1;
                          active[3]=1;
                          ends[3]=1;
                          tdone[3]=1;
                        }
                        else {
                          S115439=0;
                          if(fillerReq_o.isACK()){//sysj\orchestrator.sysj line: 59, column: 5
                            fillerReq_o.setVal(true);//sysj\orchestrator.sysj line: 59, column: 5
                            S115439=1;
                            if(!fillerReq_o.isACK()){//sysj\orchestrator.sysj line: 59, column: 5
                              fillerReq_o.setREQ(false);//sysj\orchestrator.sysj line: 59, column: 5
                              ends[3]=2;
                              ;//sysj\orchestrator.sysj line: 59, column: 5
                              S115482=1;
                              S115489=0;
                              if(!percentLiquid_o.isPartnerPresent() || percentLiquid_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 60, column: 5
                                percentLiquid_o.setREQ(false);//sysj\orchestrator.sysj line: 60, column: 5
                                S115489=1;
                                active[3]=1;
                                ends[3]=1;
                                tdone[3]=1;
                              }
                              else {
                                S115484=0;
                                if(percentLiquid_o.isACK()){//sysj\orchestrator.sysj line: 60, column: 5
                                  percentLiquid_o.setVal(liquidPercent_thread_3);//sysj\orchestrator.sysj line: 60, column: 5
                                  S115484=1;
                                  if(!percentLiquid_o.isACK()){//sysj\orchestrator.sysj line: 60, column: 5
                                    percentLiquid_o.setREQ(false);//sysj\orchestrator.sysj line: 60, column: 5
                                    ends[3]=2;
                                    ;//sysj\orchestrator.sysj line: 60, column: 5
                                    S115482=2;
                                    S115577=0;
                                    if(!capLoaderReq_o.isPartnerPresent() || capLoaderReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 61, column: 5
                                      capLoaderReq_o.setREQ(false);//sysj\orchestrator.sysj line: 61, column: 5
                                      S115577=1;
                                      active[3]=1;
                                      ends[3]=1;
                                      tdone[3]=1;
                                    }
                                    else {
                                      S115572=0;
                                      if(capLoaderReq_o.isACK()){//sysj\orchestrator.sysj line: 61, column: 5
                                        capLoaderReq_o.setVal(true);//sysj\orchestrator.sysj line: 61, column: 5
                                        S115572=1;
                                        if(!capLoaderReq_o.isACK()){//sysj\orchestrator.sysj line: 61, column: 5
                                          capLoaderReq_o.setREQ(false);//sysj\orchestrator.sysj line: 61, column: 5
                                          ends[3]=2;
                                          ;//sysj\orchestrator.sysj line: 61, column: 5
                                          S115482=3;
                                          S115709=0;
                                          if(!capperReq_o.isPartnerPresent() || capperReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 62, column: 5
                                            capperReq_o.setREQ(false);//sysj\orchestrator.sysj line: 62, column: 5
                                            S115709=1;
                                            active[3]=1;
                                            ends[3]=1;
                                            tdone[3]=1;
                                          }
                                          else {
                                            S115704=0;
                                            if(capperReq_o.isACK()){//sysj\orchestrator.sysj line: 62, column: 5
                                              capperReq_o.setVal(true);//sysj\orchestrator.sysj line: 62, column: 5
                                              S115704=1;
                                              if(!capperReq_o.isACK()){//sysj\orchestrator.sysj line: 62, column: 5
                                                capperReq_o.setREQ(false);//sysj\orchestrator.sysj line: 62, column: 5
                                                ends[3]=2;
                                                ;//sysj\orchestrator.sysj line: 62, column: 5
                                                getNextBottle_1.setPresent();//sysj\orchestrator.sysj line: 63, column: 5
                                                currsigs.addElement(getNextBottle_1);
                                                S115437=2;
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
                    switch(S115489){
                      case 0 : 
                        if(!percentLiquid_o.isPartnerPresent() || percentLiquid_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 60, column: 5
                          percentLiquid_o.setREQ(false);//sysj\orchestrator.sysj line: 60, column: 5
                          S115489=1;
                          active[3]=1;
                          ends[3]=1;
                          tdone[3]=1;
                        }
                        else {
                          switch(S115484){
                            case 0 : 
                              if(percentLiquid_o.isACK()){//sysj\orchestrator.sysj line: 60, column: 5
                                percentLiquid_o.setVal(liquidPercent_thread_3);//sysj\orchestrator.sysj line: 60, column: 5
                                S115484=1;
                                if(!percentLiquid_o.isACK()){//sysj\orchestrator.sysj line: 60, column: 5
                                  percentLiquid_o.setREQ(false);//sysj\orchestrator.sysj line: 60, column: 5
                                  ends[3]=2;
                                  ;//sysj\orchestrator.sysj line: 60, column: 5
                                  S115482=2;
                                  S115577=0;
                                  if(!capLoaderReq_o.isPartnerPresent() || capLoaderReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 61, column: 5
                                    capLoaderReq_o.setREQ(false);//sysj\orchestrator.sysj line: 61, column: 5
                                    S115577=1;
                                    active[3]=1;
                                    ends[3]=1;
                                    tdone[3]=1;
                                  }
                                  else {
                                    S115572=0;
                                    if(capLoaderReq_o.isACK()){//sysj\orchestrator.sysj line: 61, column: 5
                                      capLoaderReq_o.setVal(true);//sysj\orchestrator.sysj line: 61, column: 5
                                      S115572=1;
                                      if(!capLoaderReq_o.isACK()){//sysj\orchestrator.sysj line: 61, column: 5
                                        capLoaderReq_o.setREQ(false);//sysj\orchestrator.sysj line: 61, column: 5
                                        ends[3]=2;
                                        ;//sysj\orchestrator.sysj line: 61, column: 5
                                        S115482=3;
                                        S115709=0;
                                        if(!capperReq_o.isPartnerPresent() || capperReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 62, column: 5
                                          capperReq_o.setREQ(false);//sysj\orchestrator.sysj line: 62, column: 5
                                          S115709=1;
                                          active[3]=1;
                                          ends[3]=1;
                                          tdone[3]=1;
                                        }
                                        else {
                                          S115704=0;
                                          if(capperReq_o.isACK()){//sysj\orchestrator.sysj line: 62, column: 5
                                            capperReq_o.setVal(true);//sysj\orchestrator.sysj line: 62, column: 5
                                            S115704=1;
                                            if(!capperReq_o.isACK()){//sysj\orchestrator.sysj line: 62, column: 5
                                              capperReq_o.setREQ(false);//sysj\orchestrator.sysj line: 62, column: 5
                                              ends[3]=2;
                                              ;//sysj\orchestrator.sysj line: 62, column: 5
                                              getNextBottle_1.setPresent();//sysj\orchestrator.sysj line: 63, column: 5
                                              currsigs.addElement(getNextBottle_1);
                                              S115437=2;
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
                                S115482=2;
                                S115577=0;
                                if(!capLoaderReq_o.isPartnerPresent() || capLoaderReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 61, column: 5
                                  capLoaderReq_o.setREQ(false);//sysj\orchestrator.sysj line: 61, column: 5
                                  S115577=1;
                                  active[3]=1;
                                  ends[3]=1;
                                  tdone[3]=1;
                                }
                                else {
                                  S115572=0;
                                  if(capLoaderReq_o.isACK()){//sysj\orchestrator.sysj line: 61, column: 5
                                    capLoaderReq_o.setVal(true);//sysj\orchestrator.sysj line: 61, column: 5
                                    S115572=1;
                                    if(!capLoaderReq_o.isACK()){//sysj\orchestrator.sysj line: 61, column: 5
                                      capLoaderReq_o.setREQ(false);//sysj\orchestrator.sysj line: 61, column: 5
                                      ends[3]=2;
                                      ;//sysj\orchestrator.sysj line: 61, column: 5
                                      S115482=3;
                                      S115709=0;
                                      if(!capperReq_o.isPartnerPresent() || capperReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 62, column: 5
                                        capperReq_o.setREQ(false);//sysj\orchestrator.sysj line: 62, column: 5
                                        S115709=1;
                                        active[3]=1;
                                        ends[3]=1;
                                        tdone[3]=1;
                                      }
                                      else {
                                        S115704=0;
                                        if(capperReq_o.isACK()){//sysj\orchestrator.sysj line: 62, column: 5
                                          capperReq_o.setVal(true);//sysj\orchestrator.sysj line: 62, column: 5
                                          S115704=1;
                                          if(!capperReq_o.isACK()){//sysj\orchestrator.sysj line: 62, column: 5
                                            capperReq_o.setREQ(false);//sysj\orchestrator.sysj line: 62, column: 5
                                            ends[3]=2;
                                            ;//sysj\orchestrator.sysj line: 62, column: 5
                                            getNextBottle_1.setPresent();//sysj\orchestrator.sysj line: 63, column: 5
                                            currsigs.addElement(getNextBottle_1);
                                            S115437=2;
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
                        S115489=1;
                        S115489=0;
                        if(!percentLiquid_o.isPartnerPresent() || percentLiquid_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 60, column: 5
                          percentLiquid_o.setREQ(false);//sysj\orchestrator.sysj line: 60, column: 5
                          S115489=1;
                          active[3]=1;
                          ends[3]=1;
                          tdone[3]=1;
                        }
                        else {
                          S115484=0;
                          if(percentLiquid_o.isACK()){//sysj\orchestrator.sysj line: 60, column: 5
                            percentLiquid_o.setVal(liquidPercent_thread_3);//sysj\orchestrator.sysj line: 60, column: 5
                            S115484=1;
                            if(!percentLiquid_o.isACK()){//sysj\orchestrator.sysj line: 60, column: 5
                              percentLiquid_o.setREQ(false);//sysj\orchestrator.sysj line: 60, column: 5
                              ends[3]=2;
                              ;//sysj\orchestrator.sysj line: 60, column: 5
                              S115482=2;
                              S115577=0;
                              if(!capLoaderReq_o.isPartnerPresent() || capLoaderReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 61, column: 5
                                capLoaderReq_o.setREQ(false);//sysj\orchestrator.sysj line: 61, column: 5
                                S115577=1;
                                active[3]=1;
                                ends[3]=1;
                                tdone[3]=1;
                              }
                              else {
                                S115572=0;
                                if(capLoaderReq_o.isACK()){//sysj\orchestrator.sysj line: 61, column: 5
                                  capLoaderReq_o.setVal(true);//sysj\orchestrator.sysj line: 61, column: 5
                                  S115572=1;
                                  if(!capLoaderReq_o.isACK()){//sysj\orchestrator.sysj line: 61, column: 5
                                    capLoaderReq_o.setREQ(false);//sysj\orchestrator.sysj line: 61, column: 5
                                    ends[3]=2;
                                    ;//sysj\orchestrator.sysj line: 61, column: 5
                                    S115482=3;
                                    S115709=0;
                                    if(!capperReq_o.isPartnerPresent() || capperReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 62, column: 5
                                      capperReq_o.setREQ(false);//sysj\orchestrator.sysj line: 62, column: 5
                                      S115709=1;
                                      active[3]=1;
                                      ends[3]=1;
                                      tdone[3]=1;
                                    }
                                    else {
                                      S115704=0;
                                      if(capperReq_o.isACK()){//sysj\orchestrator.sysj line: 62, column: 5
                                        capperReq_o.setVal(true);//sysj\orchestrator.sysj line: 62, column: 5
                                        S115704=1;
                                        if(!capperReq_o.isACK()){//sysj\orchestrator.sysj line: 62, column: 5
                                          capperReq_o.setREQ(false);//sysj\orchestrator.sysj line: 62, column: 5
                                          ends[3]=2;
                                          ;//sysj\orchestrator.sysj line: 62, column: 5
                                          getNextBottle_1.setPresent();//sysj\orchestrator.sysj line: 63, column: 5
                                          currsigs.addElement(getNextBottle_1);
                                          S115437=2;
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
                    switch(S115577){
                      case 0 : 
                        if(!capLoaderReq_o.isPartnerPresent() || capLoaderReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 61, column: 5
                          capLoaderReq_o.setREQ(false);//sysj\orchestrator.sysj line: 61, column: 5
                          S115577=1;
                          active[3]=1;
                          ends[3]=1;
                          tdone[3]=1;
                        }
                        else {
                          switch(S115572){
                            case 0 : 
                              if(capLoaderReq_o.isACK()){//sysj\orchestrator.sysj line: 61, column: 5
                                capLoaderReq_o.setVal(true);//sysj\orchestrator.sysj line: 61, column: 5
                                S115572=1;
                                if(!capLoaderReq_o.isACK()){//sysj\orchestrator.sysj line: 61, column: 5
                                  capLoaderReq_o.setREQ(false);//sysj\orchestrator.sysj line: 61, column: 5
                                  ends[3]=2;
                                  ;//sysj\orchestrator.sysj line: 61, column: 5
                                  S115482=3;
                                  S115709=0;
                                  if(!capperReq_o.isPartnerPresent() || capperReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 62, column: 5
                                    capperReq_o.setREQ(false);//sysj\orchestrator.sysj line: 62, column: 5
                                    S115709=1;
                                    active[3]=1;
                                    ends[3]=1;
                                    tdone[3]=1;
                                  }
                                  else {
                                    S115704=0;
                                    if(capperReq_o.isACK()){//sysj\orchestrator.sysj line: 62, column: 5
                                      capperReq_o.setVal(true);//sysj\orchestrator.sysj line: 62, column: 5
                                      S115704=1;
                                      if(!capperReq_o.isACK()){//sysj\orchestrator.sysj line: 62, column: 5
                                        capperReq_o.setREQ(false);//sysj\orchestrator.sysj line: 62, column: 5
                                        ends[3]=2;
                                        ;//sysj\orchestrator.sysj line: 62, column: 5
                                        getNextBottle_1.setPresent();//sysj\orchestrator.sysj line: 63, column: 5
                                        currsigs.addElement(getNextBottle_1);
                                        S115437=2;
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
                                S115482=3;
                                S115709=0;
                                if(!capperReq_o.isPartnerPresent() || capperReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 62, column: 5
                                  capperReq_o.setREQ(false);//sysj\orchestrator.sysj line: 62, column: 5
                                  S115709=1;
                                  active[3]=1;
                                  ends[3]=1;
                                  tdone[3]=1;
                                }
                                else {
                                  S115704=0;
                                  if(capperReq_o.isACK()){//sysj\orchestrator.sysj line: 62, column: 5
                                    capperReq_o.setVal(true);//sysj\orchestrator.sysj line: 62, column: 5
                                    S115704=1;
                                    if(!capperReq_o.isACK()){//sysj\orchestrator.sysj line: 62, column: 5
                                      capperReq_o.setREQ(false);//sysj\orchestrator.sysj line: 62, column: 5
                                      ends[3]=2;
                                      ;//sysj\orchestrator.sysj line: 62, column: 5
                                      getNextBottle_1.setPresent();//sysj\orchestrator.sysj line: 63, column: 5
                                      currsigs.addElement(getNextBottle_1);
                                      S115437=2;
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
                        S115577=1;
                        S115577=0;
                        if(!capLoaderReq_o.isPartnerPresent() || capLoaderReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 61, column: 5
                          capLoaderReq_o.setREQ(false);//sysj\orchestrator.sysj line: 61, column: 5
                          S115577=1;
                          active[3]=1;
                          ends[3]=1;
                          tdone[3]=1;
                        }
                        else {
                          S115572=0;
                          if(capLoaderReq_o.isACK()){//sysj\orchestrator.sysj line: 61, column: 5
                            capLoaderReq_o.setVal(true);//sysj\orchestrator.sysj line: 61, column: 5
                            S115572=1;
                            if(!capLoaderReq_o.isACK()){//sysj\orchestrator.sysj line: 61, column: 5
                              capLoaderReq_o.setREQ(false);//sysj\orchestrator.sysj line: 61, column: 5
                              ends[3]=2;
                              ;//sysj\orchestrator.sysj line: 61, column: 5
                              S115482=3;
                              S115709=0;
                              if(!capperReq_o.isPartnerPresent() || capperReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 62, column: 5
                                capperReq_o.setREQ(false);//sysj\orchestrator.sysj line: 62, column: 5
                                S115709=1;
                                active[3]=1;
                                ends[3]=1;
                                tdone[3]=1;
                              }
                              else {
                                S115704=0;
                                if(capperReq_o.isACK()){//sysj\orchestrator.sysj line: 62, column: 5
                                  capperReq_o.setVal(true);//sysj\orchestrator.sysj line: 62, column: 5
                                  S115704=1;
                                  if(!capperReq_o.isACK()){//sysj\orchestrator.sysj line: 62, column: 5
                                    capperReq_o.setREQ(false);//sysj\orchestrator.sysj line: 62, column: 5
                                    ends[3]=2;
                                    ;//sysj\orchestrator.sysj line: 62, column: 5
                                    getNextBottle_1.setPresent();//sysj\orchestrator.sysj line: 63, column: 5
                                    currsigs.addElement(getNextBottle_1);
                                    S115437=2;
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
                    switch(S115709){
                      case 0 : 
                        if(!capperReq_o.isPartnerPresent() || capperReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 62, column: 5
                          capperReq_o.setREQ(false);//sysj\orchestrator.sysj line: 62, column: 5
                          S115709=1;
                          active[3]=1;
                          ends[3]=1;
                          tdone[3]=1;
                        }
                        else {
                          switch(S115704){
                            case 0 : 
                              if(capperReq_o.isACK()){//sysj\orchestrator.sysj line: 62, column: 5
                                capperReq_o.setVal(true);//sysj\orchestrator.sysj line: 62, column: 5
                                S115704=1;
                                if(!capperReq_o.isACK()){//sysj\orchestrator.sysj line: 62, column: 5
                                  capperReq_o.setREQ(false);//sysj\orchestrator.sysj line: 62, column: 5
                                  ends[3]=2;
                                  ;//sysj\orchestrator.sysj line: 62, column: 5
                                  getNextBottle_1.setPresent();//sysj\orchestrator.sysj line: 63, column: 5
                                  currsigs.addElement(getNextBottle_1);
                                  S115437=2;
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
                                S115437=2;
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
                        S115709=1;
                        S115709=0;
                        if(!capperReq_o.isPartnerPresent() || capperReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 62, column: 5
                          capperReq_o.setREQ(false);//sysj\orchestrator.sysj line: 62, column: 5
                          S115709=1;
                          active[3]=1;
                          ends[3]=1;
                          tdone[3]=1;
                        }
                        else {
                          S115704=0;
                          if(capperReq_o.isACK()){//sysj\orchestrator.sysj line: 62, column: 5
                            capperReq_o.setVal(true);//sysj\orchestrator.sysj line: 62, column: 5
                            S115704=1;
                            if(!capperReq_o.isACK()){//sysj\orchestrator.sysj line: 62, column: 5
                              capperReq_o.setREQ(false);//sysj\orchestrator.sysj line: 62, column: 5
                              ends[3]=2;
                              ;//sysj\orchestrator.sysj line: 62, column: 5
                              getNextBottle_1.setPresent();//sysj\orchestrator.sysj line: 63, column: 5
                              currsigs.addElement(getNextBottle_1);
                              S115437=2;
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
                switch(S115989){
                  case 0 : 
                    switch(S115885){
                      case 0 : 
                        if(!fillerReq_o.isPartnerPresent() || fillerReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 66, column: 5
                          fillerReq_o.setREQ(false);//sysj\orchestrator.sysj line: 66, column: 5
                          S115885=1;
                          active[3]=1;
                          ends[3]=1;
                          tdone[3]=1;
                        }
                        else {
                          switch(S115880){
                            case 0 : 
                              if(fillerReq_o.isACK()){//sysj\orchestrator.sysj line: 66, column: 5
                                fillerReq_o.setVal(false);//sysj\orchestrator.sysj line: 66, column: 5
                                S115880=1;
                                if(!fillerReq_o.isACK()){//sysj\orchestrator.sysj line: 66, column: 5
                                  fillerReq_o.setREQ(false);//sysj\orchestrator.sysj line: 66, column: 5
                                  ends[3]=2;
                                  ;//sysj\orchestrator.sysj line: 66, column: 5
                                  S115989=1;
                                  S115907=0;
                                  if(!capLoaderReq_o.isPartnerPresent() || capLoaderReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 67, column: 5
                                    capLoaderReq_o.setREQ(false);//sysj\orchestrator.sysj line: 67, column: 5
                                    S115907=1;
                                    active[3]=1;
                                    ends[3]=1;
                                    tdone[3]=1;
                                  }
                                  else {
                                    S115902=0;
                                    if(capLoaderReq_o.isACK()){//sysj\orchestrator.sysj line: 67, column: 5
                                      capLoaderReq_o.setVal(false);//sysj\orchestrator.sysj line: 67, column: 5
                                      S115902=1;
                                      if(!capLoaderReq_o.isACK()){//sysj\orchestrator.sysj line: 67, column: 5
                                        capLoaderReq_o.setREQ(false);//sysj\orchestrator.sysj line: 67, column: 5
                                        ends[3]=2;
                                        ;//sysj\orchestrator.sysj line: 67, column: 5
                                        S115989=2;
                                        S115996=0;
                                        if(!capperReq_o.isPartnerPresent() || capperReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 68, column: 5
                                          capperReq_o.setREQ(false);//sysj\orchestrator.sysj line: 68, column: 5
                                          S115996=1;
                                          active[3]=1;
                                          ends[3]=1;
                                          tdone[3]=1;
                                        }
                                        else {
                                          S115991=0;
                                          if(capperReq_o.isACK()){//sysj\orchestrator.sysj line: 68, column: 5
                                            capperReq_o.setVal(false);//sysj\orchestrator.sysj line: 68, column: 5
                                            S115991=1;
                                            if(!capperReq_o.isACK()){//sysj\orchestrator.sysj line: 68, column: 5
                                              capperReq_o.setREQ(false);//sysj\orchestrator.sysj line: 68, column: 5
                                              ends[3]=2;
                                              ;//sysj\orchestrator.sysj line: 68, column: 5
                                              S115437=2;
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
                                S115989=1;
                                S115907=0;
                                if(!capLoaderReq_o.isPartnerPresent() || capLoaderReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 67, column: 5
                                  capLoaderReq_o.setREQ(false);//sysj\orchestrator.sysj line: 67, column: 5
                                  S115907=1;
                                  active[3]=1;
                                  ends[3]=1;
                                  tdone[3]=1;
                                }
                                else {
                                  S115902=0;
                                  if(capLoaderReq_o.isACK()){//sysj\orchestrator.sysj line: 67, column: 5
                                    capLoaderReq_o.setVal(false);//sysj\orchestrator.sysj line: 67, column: 5
                                    S115902=1;
                                    if(!capLoaderReq_o.isACK()){//sysj\orchestrator.sysj line: 67, column: 5
                                      capLoaderReq_o.setREQ(false);//sysj\orchestrator.sysj line: 67, column: 5
                                      ends[3]=2;
                                      ;//sysj\orchestrator.sysj line: 67, column: 5
                                      S115989=2;
                                      S115996=0;
                                      if(!capperReq_o.isPartnerPresent() || capperReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 68, column: 5
                                        capperReq_o.setREQ(false);//sysj\orchestrator.sysj line: 68, column: 5
                                        S115996=1;
                                        active[3]=1;
                                        ends[3]=1;
                                        tdone[3]=1;
                                      }
                                      else {
                                        S115991=0;
                                        if(capperReq_o.isACK()){//sysj\orchestrator.sysj line: 68, column: 5
                                          capperReq_o.setVal(false);//sysj\orchestrator.sysj line: 68, column: 5
                                          S115991=1;
                                          if(!capperReq_o.isACK()){//sysj\orchestrator.sysj line: 68, column: 5
                                            capperReq_o.setREQ(false);//sysj\orchestrator.sysj line: 68, column: 5
                                            ends[3]=2;
                                            ;//sysj\orchestrator.sysj line: 68, column: 5
                                            S115437=2;
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
                        S115885=1;
                        S115885=0;
                        if(!fillerReq_o.isPartnerPresent() || fillerReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 66, column: 5
                          fillerReq_o.setREQ(false);//sysj\orchestrator.sysj line: 66, column: 5
                          S115885=1;
                          active[3]=1;
                          ends[3]=1;
                          tdone[3]=1;
                        }
                        else {
                          S115880=0;
                          if(fillerReq_o.isACK()){//sysj\orchestrator.sysj line: 66, column: 5
                            fillerReq_o.setVal(false);//sysj\orchestrator.sysj line: 66, column: 5
                            S115880=1;
                            if(!fillerReq_o.isACK()){//sysj\orchestrator.sysj line: 66, column: 5
                              fillerReq_o.setREQ(false);//sysj\orchestrator.sysj line: 66, column: 5
                              ends[3]=2;
                              ;//sysj\orchestrator.sysj line: 66, column: 5
                              S115989=1;
                              S115907=0;
                              if(!capLoaderReq_o.isPartnerPresent() || capLoaderReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 67, column: 5
                                capLoaderReq_o.setREQ(false);//sysj\orchestrator.sysj line: 67, column: 5
                                S115907=1;
                                active[3]=1;
                                ends[3]=1;
                                tdone[3]=1;
                              }
                              else {
                                S115902=0;
                                if(capLoaderReq_o.isACK()){//sysj\orchestrator.sysj line: 67, column: 5
                                  capLoaderReq_o.setVal(false);//sysj\orchestrator.sysj line: 67, column: 5
                                  S115902=1;
                                  if(!capLoaderReq_o.isACK()){//sysj\orchestrator.sysj line: 67, column: 5
                                    capLoaderReq_o.setREQ(false);//sysj\orchestrator.sysj line: 67, column: 5
                                    ends[3]=2;
                                    ;//sysj\orchestrator.sysj line: 67, column: 5
                                    S115989=2;
                                    S115996=0;
                                    if(!capperReq_o.isPartnerPresent() || capperReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 68, column: 5
                                      capperReq_o.setREQ(false);//sysj\orchestrator.sysj line: 68, column: 5
                                      S115996=1;
                                      active[3]=1;
                                      ends[3]=1;
                                      tdone[3]=1;
                                    }
                                    else {
                                      S115991=0;
                                      if(capperReq_o.isACK()){//sysj\orchestrator.sysj line: 68, column: 5
                                        capperReq_o.setVal(false);//sysj\orchestrator.sysj line: 68, column: 5
                                        S115991=1;
                                        if(!capperReq_o.isACK()){//sysj\orchestrator.sysj line: 68, column: 5
                                          capperReq_o.setREQ(false);//sysj\orchestrator.sysj line: 68, column: 5
                                          ends[3]=2;
                                          ;//sysj\orchestrator.sysj line: 68, column: 5
                                          S115437=2;
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
                    switch(S115907){
                      case 0 : 
                        if(!capLoaderReq_o.isPartnerPresent() || capLoaderReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 67, column: 5
                          capLoaderReq_o.setREQ(false);//sysj\orchestrator.sysj line: 67, column: 5
                          S115907=1;
                          active[3]=1;
                          ends[3]=1;
                          tdone[3]=1;
                        }
                        else {
                          switch(S115902){
                            case 0 : 
                              if(capLoaderReq_o.isACK()){//sysj\orchestrator.sysj line: 67, column: 5
                                capLoaderReq_o.setVal(false);//sysj\orchestrator.sysj line: 67, column: 5
                                S115902=1;
                                if(!capLoaderReq_o.isACK()){//sysj\orchestrator.sysj line: 67, column: 5
                                  capLoaderReq_o.setREQ(false);//sysj\orchestrator.sysj line: 67, column: 5
                                  ends[3]=2;
                                  ;//sysj\orchestrator.sysj line: 67, column: 5
                                  S115989=2;
                                  S115996=0;
                                  if(!capperReq_o.isPartnerPresent() || capperReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 68, column: 5
                                    capperReq_o.setREQ(false);//sysj\orchestrator.sysj line: 68, column: 5
                                    S115996=1;
                                    active[3]=1;
                                    ends[3]=1;
                                    tdone[3]=1;
                                  }
                                  else {
                                    S115991=0;
                                    if(capperReq_o.isACK()){//sysj\orchestrator.sysj line: 68, column: 5
                                      capperReq_o.setVal(false);//sysj\orchestrator.sysj line: 68, column: 5
                                      S115991=1;
                                      if(!capperReq_o.isACK()){//sysj\orchestrator.sysj line: 68, column: 5
                                        capperReq_o.setREQ(false);//sysj\orchestrator.sysj line: 68, column: 5
                                        ends[3]=2;
                                        ;//sysj\orchestrator.sysj line: 68, column: 5
                                        S115437=2;
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
                                S115989=2;
                                S115996=0;
                                if(!capperReq_o.isPartnerPresent() || capperReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 68, column: 5
                                  capperReq_o.setREQ(false);//sysj\orchestrator.sysj line: 68, column: 5
                                  S115996=1;
                                  active[3]=1;
                                  ends[3]=1;
                                  tdone[3]=1;
                                }
                                else {
                                  S115991=0;
                                  if(capperReq_o.isACK()){//sysj\orchestrator.sysj line: 68, column: 5
                                    capperReq_o.setVal(false);//sysj\orchestrator.sysj line: 68, column: 5
                                    S115991=1;
                                    if(!capperReq_o.isACK()){//sysj\orchestrator.sysj line: 68, column: 5
                                      capperReq_o.setREQ(false);//sysj\orchestrator.sysj line: 68, column: 5
                                      ends[3]=2;
                                      ;//sysj\orchestrator.sysj line: 68, column: 5
                                      S115437=2;
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
                        S115907=1;
                        S115907=0;
                        if(!capLoaderReq_o.isPartnerPresent() || capLoaderReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 67, column: 5
                          capLoaderReq_o.setREQ(false);//sysj\orchestrator.sysj line: 67, column: 5
                          S115907=1;
                          active[3]=1;
                          ends[3]=1;
                          tdone[3]=1;
                        }
                        else {
                          S115902=0;
                          if(capLoaderReq_o.isACK()){//sysj\orchestrator.sysj line: 67, column: 5
                            capLoaderReq_o.setVal(false);//sysj\orchestrator.sysj line: 67, column: 5
                            S115902=1;
                            if(!capLoaderReq_o.isACK()){//sysj\orchestrator.sysj line: 67, column: 5
                              capLoaderReq_o.setREQ(false);//sysj\orchestrator.sysj line: 67, column: 5
                              ends[3]=2;
                              ;//sysj\orchestrator.sysj line: 67, column: 5
                              S115989=2;
                              S115996=0;
                              if(!capperReq_o.isPartnerPresent() || capperReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 68, column: 5
                                capperReq_o.setREQ(false);//sysj\orchestrator.sysj line: 68, column: 5
                                S115996=1;
                                active[3]=1;
                                ends[3]=1;
                                tdone[3]=1;
                              }
                              else {
                                S115991=0;
                                if(capperReq_o.isACK()){//sysj\orchestrator.sysj line: 68, column: 5
                                  capperReq_o.setVal(false);//sysj\orchestrator.sysj line: 68, column: 5
                                  S115991=1;
                                  if(!capperReq_o.isACK()){//sysj\orchestrator.sysj line: 68, column: 5
                                    capperReq_o.setREQ(false);//sysj\orchestrator.sysj line: 68, column: 5
                                    ends[3]=2;
                                    ;//sysj\orchestrator.sysj line: 68, column: 5
                                    S115437=2;
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
                    switch(S115996){
                      case 0 : 
                        if(!capperReq_o.isPartnerPresent() || capperReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 68, column: 5
                          capperReq_o.setREQ(false);//sysj\orchestrator.sysj line: 68, column: 5
                          S115996=1;
                          active[3]=1;
                          ends[3]=1;
                          tdone[3]=1;
                        }
                        else {
                          switch(S115991){
                            case 0 : 
                              if(capperReq_o.isACK()){//sysj\orchestrator.sysj line: 68, column: 5
                                capperReq_o.setVal(false);//sysj\orchestrator.sysj line: 68, column: 5
                                S115991=1;
                                if(!capperReq_o.isACK()){//sysj\orchestrator.sysj line: 68, column: 5
                                  capperReq_o.setREQ(false);//sysj\orchestrator.sysj line: 68, column: 5
                                  ends[3]=2;
                                  ;//sysj\orchestrator.sysj line: 68, column: 5
                                  S115437=2;
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
                                S115437=2;
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
                        S115996=1;
                        S115996=0;
                        if(!capperReq_o.isPartnerPresent() || capperReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 68, column: 5
                          capperReq_o.setREQ(false);//sysj\orchestrator.sysj line: 68, column: 5
                          S115996=1;
                          active[3]=1;
                          ends[3]=1;
                          tdone[3]=1;
                        }
                        else {
                          S115991=0;
                          if(capperReq_o.isACK()){//sysj\orchestrator.sysj line: 68, column: 5
                            capperReq_o.setVal(false);//sysj\orchestrator.sysj line: 68, column: 5
                            S115991=1;
                            if(!capperReq_o.isACK()){//sysj\orchestrator.sysj line: 68, column: 5
                              capperReq_o.setREQ(false);//sysj\orchestrator.sysj line: 68, column: 5
                              ends[3]=2;
                              ;//sysj\orchestrator.sysj line: 68, column: 5
                              S115437=2;
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
            S115437=2;
            S115437=0;
            S115421=0;
            if(!rotaryStatus_in.isPartnerPresent() || rotaryStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 53, column: 4
              rotaryStatus_in.setACK(false);//sysj\orchestrator.sysj line: 53, column: 4
              S115421=1;
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            else {
              S115416=0;
              if(!rotaryStatus_in.isREQ()){//sysj\orchestrator.sysj line: 53, column: 4
                rotaryStatus_in.setACK(true);//sysj\orchestrator.sysj line: 53, column: 4
                S115416=1;
                if(rotaryStatus_in.isREQ()){//sysj\orchestrator.sysj line: 53, column: 4
                  rotaryStatus_in.setACK(false);//sysj\orchestrator.sysj line: 53, column: 4
                  ends[3]=2;
                  ;//sysj\orchestrator.sysj line: 53, column: 4
                  rotaryStat_thread_3 = (rotaryStatus_in.getVal() == null ? null : ((String)rotaryStatus_in.getVal()));//sysj\orchestrator.sysj line: 54, column: 4
                  S115437=1;
                  if(rotaryStat_thread_3 == "done"){//sysj\orchestrator.sysj line: 57, column: 7
                    S116122=0;
                    System.out.println("rotary done, sending filler,loader,screwer, conveyor reqs");//sysj\orchestrator.sysj line: 58, column: 5
                    S115482=0;
                    S115444=0;
                    if(!fillerReq_o.isPartnerPresent() || fillerReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 59, column: 5
                      fillerReq_o.setREQ(false);//sysj\orchestrator.sysj line: 59, column: 5
                      S115444=1;
                      active[3]=1;
                      ends[3]=1;
                      tdone[3]=1;
                    }
                    else {
                      S115439=0;
                      if(fillerReq_o.isACK()){//sysj\orchestrator.sysj line: 59, column: 5
                        fillerReq_o.setVal(true);//sysj\orchestrator.sysj line: 59, column: 5
                        S115439=1;
                        if(!fillerReq_o.isACK()){//sysj\orchestrator.sysj line: 59, column: 5
                          fillerReq_o.setREQ(false);//sysj\orchestrator.sysj line: 59, column: 5
                          ends[3]=2;
                          ;//sysj\orchestrator.sysj line: 59, column: 5
                          S115482=1;
                          S115489=0;
                          if(!percentLiquid_o.isPartnerPresent() || percentLiquid_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 60, column: 5
                            percentLiquid_o.setREQ(false);//sysj\orchestrator.sysj line: 60, column: 5
                            S115489=1;
                            active[3]=1;
                            ends[3]=1;
                            tdone[3]=1;
                          }
                          else {
                            S115484=0;
                            if(percentLiquid_o.isACK()){//sysj\orchestrator.sysj line: 60, column: 5
                              percentLiquid_o.setVal(liquidPercent_thread_3);//sysj\orchestrator.sysj line: 60, column: 5
                              S115484=1;
                              if(!percentLiquid_o.isACK()){//sysj\orchestrator.sysj line: 60, column: 5
                                percentLiquid_o.setREQ(false);//sysj\orchestrator.sysj line: 60, column: 5
                                ends[3]=2;
                                ;//sysj\orchestrator.sysj line: 60, column: 5
                                S115482=2;
                                S115577=0;
                                if(!capLoaderReq_o.isPartnerPresent() || capLoaderReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 61, column: 5
                                  capLoaderReq_o.setREQ(false);//sysj\orchestrator.sysj line: 61, column: 5
                                  S115577=1;
                                  active[3]=1;
                                  ends[3]=1;
                                  tdone[3]=1;
                                }
                                else {
                                  S115572=0;
                                  if(capLoaderReq_o.isACK()){//sysj\orchestrator.sysj line: 61, column: 5
                                    capLoaderReq_o.setVal(true);//sysj\orchestrator.sysj line: 61, column: 5
                                    S115572=1;
                                    if(!capLoaderReq_o.isACK()){//sysj\orchestrator.sysj line: 61, column: 5
                                      capLoaderReq_o.setREQ(false);//sysj\orchestrator.sysj line: 61, column: 5
                                      ends[3]=2;
                                      ;//sysj\orchestrator.sysj line: 61, column: 5
                                      S115482=3;
                                      S115709=0;
                                      if(!capperReq_o.isPartnerPresent() || capperReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 62, column: 5
                                        capperReq_o.setREQ(false);//sysj\orchestrator.sysj line: 62, column: 5
                                        S115709=1;
                                        active[3]=1;
                                        ends[3]=1;
                                        tdone[3]=1;
                                      }
                                      else {
                                        S115704=0;
                                        if(capperReq_o.isACK()){//sysj\orchestrator.sysj line: 62, column: 5
                                          capperReq_o.setVal(true);//sysj\orchestrator.sysj line: 62, column: 5
                                          S115704=1;
                                          if(!capperReq_o.isACK()){//sysj\orchestrator.sysj line: 62, column: 5
                                            capperReq_o.setREQ(false);//sysj\orchestrator.sysj line: 62, column: 5
                                            ends[3]=2;
                                            ;//sysj\orchestrator.sysj line: 62, column: 5
                                            getNextBottle_1.setPresent();//sysj\orchestrator.sysj line: 63, column: 5
                                            currsigs.addElement(getNextBottle_1);
                                            S115437=2;
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
                    S116122=1;
                    S115989=0;
                    S115885=0;
                    if(!fillerReq_o.isPartnerPresent() || fillerReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 66, column: 5
                      fillerReq_o.setREQ(false);//sysj\orchestrator.sysj line: 66, column: 5
                      S115885=1;
                      active[3]=1;
                      ends[3]=1;
                      tdone[3]=1;
                    }
                    else {
                      S115880=0;
                      if(fillerReq_o.isACK()){//sysj\orchestrator.sysj line: 66, column: 5
                        fillerReq_o.setVal(false);//sysj\orchestrator.sysj line: 66, column: 5
                        S115880=1;
                        if(!fillerReq_o.isACK()){//sysj\orchestrator.sysj line: 66, column: 5
                          fillerReq_o.setREQ(false);//sysj\orchestrator.sysj line: 66, column: 5
                          ends[3]=2;
                          ;//sysj\orchestrator.sysj line: 66, column: 5
                          S115989=1;
                          S115907=0;
                          if(!capLoaderReq_o.isPartnerPresent() || capLoaderReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 67, column: 5
                            capLoaderReq_o.setREQ(false);//sysj\orchestrator.sysj line: 67, column: 5
                            S115907=1;
                            active[3]=1;
                            ends[3]=1;
                            tdone[3]=1;
                          }
                          else {
                            S115902=0;
                            if(capLoaderReq_o.isACK()){//sysj\orchestrator.sysj line: 67, column: 5
                              capLoaderReq_o.setVal(false);//sysj\orchestrator.sysj line: 67, column: 5
                              S115902=1;
                              if(!capLoaderReq_o.isACK()){//sysj\orchestrator.sysj line: 67, column: 5
                                capLoaderReq_o.setREQ(false);//sysj\orchestrator.sysj line: 67, column: 5
                                ends[3]=2;
                                ;//sysj\orchestrator.sysj line: 67, column: 5
                                S115989=2;
                                S115996=0;
                                if(!capperReq_o.isPartnerPresent() || capperReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 68, column: 5
                                  capperReq_o.setREQ(false);//sysj\orchestrator.sysj line: 68, column: 5
                                  S115996=1;
                                  active[3]=1;
                                  ends[3]=1;
                                  tdone[3]=1;
                                }
                                else {
                                  S115991=0;
                                  if(capperReq_o.isACK()){//sysj\orchestrator.sysj line: 68, column: 5
                                    capperReq_o.setVal(false);//sysj\orchestrator.sysj line: 68, column: 5
                                    S115991=1;
                                    if(!capperReq_o.isACK()){//sysj\orchestrator.sysj line: 68, column: 5
                                      capperReq_o.setREQ(false);//sysj\orchestrator.sysj line: 68, column: 5
                                      ends[3]=2;
                                      ;//sysj\orchestrator.sysj line: 68, column: 5
                                      S115437=2;
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

  public void thread132498(int [] tdone, int [] ends){
        switch(S115413){
      case 0 : 
        active[2]=0;
        ends[2]=0;
        tdone[2]=1;
        break;
      
      case 1 : 
        switch(S113897){
          case 0 : 
            switch(S113639){
              case 0 : 
                switch(S113601){
                  case 0 : 
                    if(!conveyorReq_o.isPartnerPresent() || conveyorReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 30, column: 5
                      conveyorReq_o.setREQ(false);//sysj\orchestrator.sysj line: 30, column: 5
                      S113601=1;
                      active[2]=1;
                      ends[2]=1;
                      tdone[2]=1;
                    }
                    else {
                      switch(S113596){
                        case 0 : 
                          if(conveyorReq_o.isACK()){//sysj\orchestrator.sysj line: 30, column: 5
                            conveyorReq_o.setVal(true);//sysj\orchestrator.sysj line: 30, column: 5
                            S113596=1;
                            if(!conveyorReq_o.isACK()){//sysj\orchestrator.sysj line: 30, column: 5
                              conveyorReq_o.setREQ(false);//sysj\orchestrator.sysj line: 30, column: 5
                              ends[2]=2;
                              ;//sysj\orchestrator.sysj line: 30, column: 5
                              bottlePlaced_thread_2 = bottlePlaced_thread_2 - 1;//sysj\orchestrator.sysj line: 31, column: 5
                              System.out.println("Number of bottles left to do: " + bottlePlaced_thread_2);//sysj\orchestrator.sysj line: 32, column: 5
                              S113639=1;
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
                            S113639=1;
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
                    S113601=1;
                    S113601=0;
                    if(!conveyorReq_o.isPartnerPresent() || conveyorReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 30, column: 5
                      conveyorReq_o.setREQ(false);//sysj\orchestrator.sysj line: 30, column: 5
                      S113601=1;
                      active[2]=1;
                      ends[2]=1;
                      tdone[2]=1;
                    }
                    else {
                      S113596=0;
                      if(conveyorReq_o.isACK()){//sysj\orchestrator.sysj line: 30, column: 5
                        conveyorReq_o.setVal(true);//sysj\orchestrator.sysj line: 30, column: 5
                        S113596=1;
                        if(!conveyorReq_o.isACK()){//sysj\orchestrator.sysj line: 30, column: 5
                          conveyorReq_o.setREQ(false);//sysj\orchestrator.sysj line: 30, column: 5
                          ends[2]=2;
                          ;//sysj\orchestrator.sysj line: 30, column: 5
                          bottlePlaced_thread_2 = bottlePlaced_thread_2 - 1;//sysj\orchestrator.sysj line: 31, column: 5
                          System.out.println("Number of bottles left to do: " + bottlePlaced_thread_2);//sysj\orchestrator.sysj line: 32, column: 5
                          S113639=1;
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
                  S113639=2;
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
                S113639=2;
                if(bottlePlaced_thread_2 >= 0){//sysj\orchestrator.sysj line: 28, column: 10
                  System.out.println("sending conveyor req?");//sysj\orchestrator.sysj line: 29, column: 5
                  S113639=0;
                  S113601=0;
                  if(!conveyorReq_o.isPartnerPresent() || conveyorReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 30, column: 5
                    conveyorReq_o.setREQ(false);//sysj\orchestrator.sysj line: 30, column: 5
                    S113601=1;
                    active[2]=1;
                    ends[2]=1;
                    tdone[2]=1;
                  }
                  else {
                    S113596=0;
                    if(conveyorReq_o.isACK()){//sysj\orchestrator.sysj line: 30, column: 5
                      conveyorReq_o.setVal(true);//sysj\orchestrator.sysj line: 30, column: 5
                      S113596=1;
                      if(!conveyorReq_o.isACK()){//sysj\orchestrator.sysj line: 30, column: 5
                        conveyorReq_o.setREQ(false);//sysj\orchestrator.sysj line: 30, column: 5
                        ends[2]=2;
                        ;//sysj\orchestrator.sysj line: 30, column: 5
                        bottlePlaced_thread_2 = bottlePlaced_thread_2 - 1;//sysj\orchestrator.sysj line: 31, column: 5
                        System.out.println("Number of bottles left to do: " + bottlePlaced_thread_2);//sysj\orchestrator.sysj line: 32, column: 5
                        S113639=1;
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
                  S113897=1;
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
            S113897=2;
            bottlePlaced_thread_2 = quantity_thread_2;//sysj\orchestrator.sysj line: 27, column: 4
            S113897=0;
            if(bottlePlaced_thread_2 >= 0){//sysj\orchestrator.sysj line: 28, column: 10
              System.out.println("sending conveyor req?");//sysj\orchestrator.sysj line: 29, column: 5
              S113639=0;
              S113601=0;
              if(!conveyorReq_o.isPartnerPresent() || conveyorReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 30, column: 5
                conveyorReq_o.setREQ(false);//sysj\orchestrator.sysj line: 30, column: 5
                S113601=1;
                active[2]=1;
                ends[2]=1;
                tdone[2]=1;
              }
              else {
                S113596=0;
                if(conveyorReq_o.isACK()){//sysj\orchestrator.sysj line: 30, column: 5
                  conveyorReq_o.setVal(true);//sysj\orchestrator.sysj line: 30, column: 5
                  S113596=1;
                  if(!conveyorReq_o.isACK()){//sysj\orchestrator.sysj line: 30, column: 5
                    conveyorReq_o.setREQ(false);//sysj\orchestrator.sysj line: 30, column: 5
                    ends[2]=2;
                    ;//sysj\orchestrator.sysj line: 30, column: 5
                    bottlePlaced_thread_2 = bottlePlaced_thread_2 - 1;//sysj\orchestrator.sysj line: 31, column: 5
                    System.out.println("Number of bottles left to do: " + bottlePlaced_thread_2);//sysj\orchestrator.sysj line: 32, column: 5
                    S113639=1;
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
              S113897=1;
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread132496(int [] tdone, int [] ends){
        S132486=1;
    S132346=0;
    if((Status.conveyStat == false) && (Status.fillerStat == false) && (Status.capperStat == false) && (Status.capLoaderStat == false)){//sysj\orchestrator.sysj line: 145, column: 7
      S132345=0;
      System.out.println("Orch sending rotary req");//sysj\orchestrator.sysj line: 149, column: 5
      S132284=0;
      if(!allOperationsFinished_o.isPartnerPresent() || allOperationsFinished_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 150, column: 5
        allOperationsFinished_o.setREQ(false);//sysj\orchestrator.sysj line: 150, column: 5
        S132284=1;
        active[8]=1;
        ends[8]=1;
        tdone[8]=1;
      }
      else {
        S132279=0;
        if(allOperationsFinished_o.isACK()){//sysj\orchestrator.sysj line: 150, column: 5
          allOperationsFinished_o.setVal(true);//sysj\orchestrator.sysj line: 150, column: 5
          S132279=1;
          if(!allOperationsFinished_o.isACK()){//sysj\orchestrator.sysj line: 150, column: 5
            allOperationsFinished_o.setREQ(false);//sysj\orchestrator.sysj line: 150, column: 5
            ends[8]=2;
            ;//sysj\orchestrator.sysj line: 150, column: 5
            S132346=1;
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
      S132345=1;
      S132329=0;
      if(!allOperationsFinished_o.isPartnerPresent() || allOperationsFinished_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 152, column: 5
        allOperationsFinished_o.setREQ(false);//sysj\orchestrator.sysj line: 152, column: 5
        S132329=1;
        active[8]=1;
        ends[8]=1;
        tdone[8]=1;
      }
      else {
        S132324=0;
        if(allOperationsFinished_o.isACK()){//sysj\orchestrator.sysj line: 152, column: 5
          allOperationsFinished_o.setVal(false);//sysj\orchestrator.sysj line: 152, column: 5
          S132324=1;
          if(!allOperationsFinished_o.isACK()){//sysj\orchestrator.sysj line: 152, column: 5
            allOperationsFinished_o.setREQ(false);//sysj\orchestrator.sysj line: 152, column: 5
            ends[8]=2;
            ;//sysj\orchestrator.sysj line: 152, column: 5
            S132346=1;
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

  public void thread132495(int [] tdone, int [] ends){
        S132277=1;
    S132229=0;
    S132213=0;
    if(!capLoaderStatus_in.isPartnerPresent() || capLoaderStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 126, column: 4
      capLoaderStatus_in.setACK(false);//sysj\orchestrator.sysj line: 126, column: 4
      S132213=1;
      active[7]=1;
      ends[7]=1;
      tdone[7]=1;
    }
    else {
      S132208=0;
      if(!capLoaderStatus_in.isREQ()){//sysj\orchestrator.sysj line: 126, column: 4
        capLoaderStatus_in.setACK(true);//sysj\orchestrator.sysj line: 126, column: 4
        S132208=1;
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
            Status.capLoaderStat = false;//sysj\orchestrator.sysj line: 134, column: 5
          }
          S132229=1;
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

  public void thread132494(int [] tdone, int [] ends){
        S132206=1;
    S132158=0;
    S132142=0;
    if(!capperStatus_in.isPartnerPresent() || capperStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 110, column: 4
      capperStatus_in.setACK(false);//sysj\orchestrator.sysj line: 110, column: 4
      S132142=1;
      active[6]=1;
      ends[6]=1;
      tdone[6]=1;
    }
    else {
      S132137=0;
      if(!capperStatus_in.isREQ()){//sysj\orchestrator.sysj line: 110, column: 4
        capperStatus_in.setACK(true);//sysj\orchestrator.sysj line: 110, column: 4
        S132137=1;
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
            Status.capperStat = false;//sysj\orchestrator.sysj line: 118, column: 5
          }
          S132158=1;
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

  public void thread132493(int [] tdone, int [] ends){
        S132135=1;
    S132087=0;
    S132071=0;
    if(!fillerStatus_in.isPartnerPresent() || fillerStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 94, column: 4
      fillerStatus_in.setACK(false);//sysj\orchestrator.sysj line: 94, column: 4
      S132071=1;
      active[5]=1;
      ends[5]=1;
      tdone[5]=1;
    }
    else {
      S132066=0;
      if(!fillerStatus_in.isREQ()){//sysj\orchestrator.sysj line: 94, column: 4
        fillerStatus_in.setACK(true);//sysj\orchestrator.sysj line: 94, column: 4
        S132066=1;
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
            Status.fillerStat = false;//sysj\orchestrator.sysj line: 102, column: 5
          }
          S132087=1;
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

  public void thread132492(int [] tdone, int [] ends){
        S132064=1;
    S132016=0;
    S132000=0;
    if(!conveyorStatus_in.isPartnerPresent() || conveyorStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 77, column: 4
      conveyorStatus_in.setACK(false);//sysj\orchestrator.sysj line: 77, column: 4
      S132000=1;
      active[4]=1;
      ends[4]=1;
      tdone[4]=1;
    }
    else {
      S131995=0;
      if(!conveyorStatus_in.isREQ()){//sysj\orchestrator.sysj line: 77, column: 4
        conveyorStatus_in.setACK(true);//sysj\orchestrator.sysj line: 77, column: 4
        S131995=1;
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
            Status.conveyStat = false;//sysj\orchestrator.sysj line: 85, column: 5
          }
          S132016=1;
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

  public void thread132491(int [] tdone, int [] ends){
        S131993=1;
    liquidPercent_thread_3 = new ArrayList();//sysj\orchestrator.sysj line: 47, column: 3
    liquidPercent_thread_3.add(10);//sysj\orchestrator.sysj line: 48, column: 3
    liquidPercent_thread_3.add(10);//sysj\orchestrator.sysj line: 49, column: 3
    liquidPercent_thread_3.add(20);//sysj\orchestrator.sysj line: 50, column: 3
    liquidPercent_thread_3.add(60);//sysj\orchestrator.sysj line: 51, column: 3
    S115437=0;
    S115421=0;
    if(!rotaryStatus_in.isPartnerPresent() || rotaryStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 53, column: 4
      rotaryStatus_in.setACK(false);//sysj\orchestrator.sysj line: 53, column: 4
      S115421=1;
      active[3]=1;
      ends[3]=1;
      tdone[3]=1;
    }
    else {
      S115416=0;
      if(!rotaryStatus_in.isREQ()){//sysj\orchestrator.sysj line: 53, column: 4
        rotaryStatus_in.setACK(true);//sysj\orchestrator.sysj line: 53, column: 4
        S115416=1;
        if(rotaryStatus_in.isREQ()){//sysj\orchestrator.sysj line: 53, column: 4
          rotaryStatus_in.setACK(false);//sysj\orchestrator.sysj line: 53, column: 4
          ends[3]=2;
          ;//sysj\orchestrator.sysj line: 53, column: 4
          rotaryStat_thread_3 = (rotaryStatus_in.getVal() == null ? null : ((String)rotaryStatus_in.getVal()));//sysj\orchestrator.sysj line: 54, column: 4
          S115437=1;
          if(rotaryStat_thread_3 == "done"){//sysj\orchestrator.sysj line: 57, column: 7
            S116122=0;
            System.out.println("rotary done, sending filler,loader,screwer, conveyor reqs");//sysj\orchestrator.sysj line: 58, column: 5
            S115482=0;
            S115444=0;
            if(!fillerReq_o.isPartnerPresent() || fillerReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 59, column: 5
              fillerReq_o.setREQ(false);//sysj\orchestrator.sysj line: 59, column: 5
              S115444=1;
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            else {
              S115439=0;
              if(fillerReq_o.isACK()){//sysj\orchestrator.sysj line: 59, column: 5
                fillerReq_o.setVal(true);//sysj\orchestrator.sysj line: 59, column: 5
                S115439=1;
                if(!fillerReq_o.isACK()){//sysj\orchestrator.sysj line: 59, column: 5
                  fillerReq_o.setREQ(false);//sysj\orchestrator.sysj line: 59, column: 5
                  ends[3]=2;
                  ;//sysj\orchestrator.sysj line: 59, column: 5
                  S115482=1;
                  S115489=0;
                  if(!percentLiquid_o.isPartnerPresent() || percentLiquid_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 60, column: 5
                    percentLiquid_o.setREQ(false);//sysj\orchestrator.sysj line: 60, column: 5
                    S115489=1;
                    active[3]=1;
                    ends[3]=1;
                    tdone[3]=1;
                  }
                  else {
                    S115484=0;
                    if(percentLiquid_o.isACK()){//sysj\orchestrator.sysj line: 60, column: 5
                      percentLiquid_o.setVal(liquidPercent_thread_3);//sysj\orchestrator.sysj line: 60, column: 5
                      S115484=1;
                      if(!percentLiquid_o.isACK()){//sysj\orchestrator.sysj line: 60, column: 5
                        percentLiquid_o.setREQ(false);//sysj\orchestrator.sysj line: 60, column: 5
                        ends[3]=2;
                        ;//sysj\orchestrator.sysj line: 60, column: 5
                        S115482=2;
                        S115577=0;
                        if(!capLoaderReq_o.isPartnerPresent() || capLoaderReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 61, column: 5
                          capLoaderReq_o.setREQ(false);//sysj\orchestrator.sysj line: 61, column: 5
                          S115577=1;
                          active[3]=1;
                          ends[3]=1;
                          tdone[3]=1;
                        }
                        else {
                          S115572=0;
                          if(capLoaderReq_o.isACK()){//sysj\orchestrator.sysj line: 61, column: 5
                            capLoaderReq_o.setVal(true);//sysj\orchestrator.sysj line: 61, column: 5
                            S115572=1;
                            if(!capLoaderReq_o.isACK()){//sysj\orchestrator.sysj line: 61, column: 5
                              capLoaderReq_o.setREQ(false);//sysj\orchestrator.sysj line: 61, column: 5
                              ends[3]=2;
                              ;//sysj\orchestrator.sysj line: 61, column: 5
                              S115482=3;
                              S115709=0;
                              if(!capperReq_o.isPartnerPresent() || capperReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 62, column: 5
                                capperReq_o.setREQ(false);//sysj\orchestrator.sysj line: 62, column: 5
                                S115709=1;
                                active[3]=1;
                                ends[3]=1;
                                tdone[3]=1;
                              }
                              else {
                                S115704=0;
                                if(capperReq_o.isACK()){//sysj\orchestrator.sysj line: 62, column: 5
                                  capperReq_o.setVal(true);//sysj\orchestrator.sysj line: 62, column: 5
                                  S115704=1;
                                  if(!capperReq_o.isACK()){//sysj\orchestrator.sysj line: 62, column: 5
                                    capperReq_o.setREQ(false);//sysj\orchestrator.sysj line: 62, column: 5
                                    ends[3]=2;
                                    ;//sysj\orchestrator.sysj line: 62, column: 5
                                    getNextBottle_1.setPresent();//sysj\orchestrator.sysj line: 63, column: 5
                                    currsigs.addElement(getNextBottle_1);
                                    S115437=2;
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
            S116122=1;
            S115989=0;
            S115885=0;
            if(!fillerReq_o.isPartnerPresent() || fillerReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 66, column: 5
              fillerReq_o.setREQ(false);//sysj\orchestrator.sysj line: 66, column: 5
              S115885=1;
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            else {
              S115880=0;
              if(fillerReq_o.isACK()){//sysj\orchestrator.sysj line: 66, column: 5
                fillerReq_o.setVal(false);//sysj\orchestrator.sysj line: 66, column: 5
                S115880=1;
                if(!fillerReq_o.isACK()){//sysj\orchestrator.sysj line: 66, column: 5
                  fillerReq_o.setREQ(false);//sysj\orchestrator.sysj line: 66, column: 5
                  ends[3]=2;
                  ;//sysj\orchestrator.sysj line: 66, column: 5
                  S115989=1;
                  S115907=0;
                  if(!capLoaderReq_o.isPartnerPresent() || capLoaderReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 67, column: 5
                    capLoaderReq_o.setREQ(false);//sysj\orchestrator.sysj line: 67, column: 5
                    S115907=1;
                    active[3]=1;
                    ends[3]=1;
                    tdone[3]=1;
                  }
                  else {
                    S115902=0;
                    if(capLoaderReq_o.isACK()){//sysj\orchestrator.sysj line: 67, column: 5
                      capLoaderReq_o.setVal(false);//sysj\orchestrator.sysj line: 67, column: 5
                      S115902=1;
                      if(!capLoaderReq_o.isACK()){//sysj\orchestrator.sysj line: 67, column: 5
                        capLoaderReq_o.setREQ(false);//sysj\orchestrator.sysj line: 67, column: 5
                        ends[3]=2;
                        ;//sysj\orchestrator.sysj line: 67, column: 5
                        S115989=2;
                        S115996=0;
                        if(!capperReq_o.isPartnerPresent() || capperReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 68, column: 5
                          capperReq_o.setREQ(false);//sysj\orchestrator.sysj line: 68, column: 5
                          S115996=1;
                          active[3]=1;
                          ends[3]=1;
                          tdone[3]=1;
                        }
                        else {
                          S115991=0;
                          if(capperReq_o.isACK()){//sysj\orchestrator.sysj line: 68, column: 5
                            capperReq_o.setVal(false);//sysj\orchestrator.sysj line: 68, column: 5
                            S115991=1;
                            if(!capperReq_o.isACK()){//sysj\orchestrator.sysj line: 68, column: 5
                              capperReq_o.setREQ(false);//sysj\orchestrator.sysj line: 68, column: 5
                              ends[3]=2;
                              ;//sysj\orchestrator.sysj line: 68, column: 5
                              S115437=2;
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

  public void thread132490(int [] tdone, int [] ends){
        S115413=1;
    quantity_thread_2 = 5;//sysj\orchestrator.sysj line: 20, column: 3
    bottlePlaced_thread_2 = 0;//sysj\orchestrator.sysj line: 21, column: 3
    bottlePlaced_thread_2 = quantity_thread_2;//sysj\orchestrator.sysj line: 27, column: 4
    S113897=0;
    if(bottlePlaced_thread_2 >= 0){//sysj\orchestrator.sysj line: 28, column: 10
      System.out.println("sending conveyor req?");//sysj\orchestrator.sysj line: 29, column: 5
      S113639=0;
      S113601=0;
      if(!conveyorReq_o.isPartnerPresent() || conveyorReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 30, column: 5
        conveyorReq_o.setREQ(false);//sysj\orchestrator.sysj line: 30, column: 5
        S113601=1;
        active[2]=1;
        ends[2]=1;
        tdone[2]=1;
      }
      else {
        S113596=0;
        if(conveyorReq_o.isACK()){//sysj\orchestrator.sysj line: 30, column: 5
          conveyorReq_o.setVal(true);//sysj\orchestrator.sysj line: 30, column: 5
          S113596=1;
          if(!conveyorReq_o.isACK()){//sysj\orchestrator.sysj line: 30, column: 5
            conveyorReq_o.setREQ(false);//sysj\orchestrator.sysj line: 30, column: 5
            ends[2]=2;
            ;//sysj\orchestrator.sysj line: 30, column: 5
            bottlePlaced_thread_2 = bottlePlaced_thread_2 - 1;//sysj\orchestrator.sysj line: 31, column: 5
            System.out.println("Number of bottles left to do: " + bottlePlaced_thread_2);//sysj\orchestrator.sysj line: 32, column: 5
            S113639=1;
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
      S113897=1;
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
      switch(S132488){
        case 0 : 
          S132488=0;
          break RUN;
        
        case 1 : 
          S132488=2;
          S132488=2;
          getNextBottle_1.setClear();//sysj\orchestrator.sysj line: 16, column: 2
          thread132490(tdone,ends);
          thread132491(tdone,ends);
          thread132492(tdone,ends);
          thread132493(tdone,ends);
          thread132494(tdone,ends);
          thread132495(tdone,ends);
          thread132496(tdone,ends);
          int biggest132497 = 0;
          if(ends[2]>=biggest132497){
            biggest132497=ends[2];
          }
          if(ends[3]>=biggest132497){
            biggest132497=ends[3];
          }
          if(ends[4]>=biggest132497){
            biggest132497=ends[4];
          }
          if(ends[5]>=biggest132497){
            biggest132497=ends[5];
          }
          if(ends[6]>=biggest132497){
            biggest132497=ends[6];
          }
          if(ends[7]>=biggest132497){
            biggest132497=ends[7];
          }
          if(ends[8]>=biggest132497){
            biggest132497=ends[8];
          }
          if(biggest132497 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
        
        case 2 : 
          getNextBottle_1.setClear();//sysj\orchestrator.sysj line: 16, column: 2
          thread132498(tdone,ends);
          thread132499(tdone,ends);
          thread132500(tdone,ends);
          thread132501(tdone,ends);
          thread132502(tdone,ends);
          thread132503(tdone,ends);
          thread132504(tdone,ends);
          int biggest132505 = 0;
          if(ends[2]>=biggest132505){
            biggest132505=ends[2];
          }
          if(ends[3]>=biggest132505){
            biggest132505=ends[3];
          }
          if(ends[4]>=biggest132505){
            biggest132505=ends[4];
          }
          if(ends[5]>=biggest132505){
            biggest132505=ends[5];
          }
          if(ends[6]>=biggest132505){
            biggest132505=ends[6];
          }
          if(ends[7]>=biggest132505){
            biggest132505=ends[7];
          }
          if(ends[8]>=biggest132505){
            biggest132505=ends[8];
          }
          if(biggest132505 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
          //FINXME code
          if(biggest132505 == 0){
            S132488=0;
            active[1]=0;
            ends[1]=0;
            S132488=0;
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
