import java.util.*;
import com.systemj.ClockDomain;
import com.systemj.Signal;
import com.systemj.input_Channel;
import com.systemj.output_Channel;
import java.util.ArrayList;//sysj\controller.sysj line: 1, column: 1

public class LiquidFiller extends ClockDomain{
  public LiquidFiller(String name){super(name);}
  Vector currsigs = new Vector();
  private boolean df = false;
  private char [] active;
  private char [] paused;
  private char [] suspended;
  public Signal bottleAtPos2 = new Signal("bottleAtPos2", Signal.INPUT);
  public Signal dosUnitEvac = new Signal("dosUnitEvac", Signal.INPUT);
  public Signal dosUnitFilled = new Signal("dosUnitFilled", Signal.INPUT);
  public Signal selectedCanister = new Signal("selectedCanister", Signal.INPUT);
  public Signal valveInjectorOnOff = new Signal("valveInjectorOnOff", Signal.OUTPUT);
  public Signal valveInletOnOff = new Signal("valveInletOnOff", Signal.OUTPUT);
  public Signal dosUnitValveRetract = new Signal("dosUnitValveRetract", Signal.OUTPUT);
  public Signal dosUnitValveExtend = new Signal("dosUnitValveExtend", Signal.OUTPUT);
  public Signal selectCanister = new Signal("selectCanister", Signal.OUTPUT);
  public Signal receivedPercentage = new Signal("receivedPercentage", Signal.OUTPUT);
  public input_Channel fillerReq_in = new input_Channel();
  public input_Channel percentLiquid_in = new input_Channel();
  public output_Channel fillerStatus_o = new output_Channel();
  private Boolean request_thread_8;//sysj\controller.sysj line: 107, column: 3
  private ArrayList recPercentLiq_thread_8;//sysj\controller.sysj line: 119, column: 6
  private int canisterNum_thread_8;//sysj\controller.sysj line: 120, column: 6
  private int S93374 = 1;
  private int S9746 = 1;
  private int S9730 = 1;
  private int S9725 = 1;
  private int S16710 = 1;
  private int S9753 = 1;
  private int S9748 = 1;
  private int S9880 = 1;
  private int S9776 = 1;
  private int S9771 = 1;
  private int S9798 = 1;
  private int S9793 = 1;
  private int S9907 = 1;
  private int S9889 = 1;
  private int S9894 = 1;
  private int S9924 = 1;
  private int S9929 = 1;
  private int S11009 = 1;
  private int S11004 = 1;
  
  private int[] ends = new int[23];
  private int[] tdone = new int[23];
  
  public void thread104665(int [] tdone, int [] ends){
        switch(S9929){
      case 0 : 
        active[12]=0;
        ends[12]=0;
        tdone[12]=1;
        break;
      
      case 1 : 
        valveInjectorOnOff.setPresent();//sysj\controller.sysj line: 147, column: 43
        currsigs.addElement(valveInjectorOnOff);
        active[12]=1;
        ends[12]=1;
        tdone[12]=1;
        break;
      
    }
  }

  public void thread104664(int [] tdone, int [] ends){
        switch(S9924){
      case 0 : 
        active[11]=0;
        ends[11]=0;
        tdone[11]=1;
        break;
      
      case 1 : 
        dosUnitValveExtend.setPresent();//sysj\controller.sysj line: 147, column: 10
        currsigs.addElement(dosUnitValveExtend);
        active[11]=1;
        ends[11]=1;
        tdone[11]=1;
        break;
      
    }
  }

  public void thread104662(int [] tdone, int [] ends){
        S9929=1;
    valveInjectorOnOff.setPresent();//sysj\controller.sysj line: 147, column: 43
    currsigs.addElement(valveInjectorOnOff);
    active[12]=1;
    ends[12]=1;
    tdone[12]=1;
  }

  public void thread104661(int [] tdone, int [] ends){
        S9924=1;
    dosUnitValveExtend.setPresent();//sysj\controller.sysj line: 147, column: 10
    currsigs.addElement(dosUnitValveExtend);
    active[11]=1;
    ends[11]=1;
    tdone[11]=1;
  }

  public void thread104659(int [] tdone, int [] ends){
        switch(S9894){
      case 0 : 
        active[10]=0;
        ends[10]=0;
        tdone[10]=1;
        break;
      
      case 1 : 
        valveInjectorOnOff.setPresent();//sysj\controller.sysj line: 131, column: 44
        currsigs.addElement(valveInjectorOnOff);
        active[10]=1;
        ends[10]=1;
        tdone[10]=1;
        break;
      
    }
  }

  public void thread104658(int [] tdone, int [] ends){
        switch(S9889){
      case 0 : 
        active[9]=0;
        ends[9]=0;
        tdone[9]=1;
        break;
      
      case 1 : 
        dosUnitValveRetract.setPresent();//sysj\controller.sysj line: 131, column: 10
        currsigs.addElement(dosUnitValveRetract);
        active[9]=1;
        ends[9]=1;
        tdone[9]=1;
        break;
      
    }
  }

  public void thread104656(int [] tdone, int [] ends){
        S9894=1;
    valveInjectorOnOff.setPresent();//sysj\controller.sysj line: 131, column: 44
    currsigs.addElement(valveInjectorOnOff);
    active[10]=1;
    ends[10]=1;
    tdone[10]=1;
  }

  public void thread104655(int [] tdone, int [] ends){
        S9889=1;
    dosUnitValveRetract.setPresent();//sysj\controller.sysj line: 131, column: 10
    currsigs.addElement(dosUnitValveRetract);
    active[9]=1;
    ends[9]=1;
    tdone[9]=1;
  }

  public void runClockDomain(){
    for(int i=0;i<ends.length;i++){
      ends[i] = 0;
      tdone[i] = 0;
    }
    
    RUN: while(true){
      switch(S93374){
        case 0 : 
          S93374=0;
          break RUN;
        
        case 1 : 
          S93374=2;
          S93374=2;
          S9746=0;
          S9730=0;
          if(!fillerReq_in.isPartnerPresent() || fillerReq_in.isPartnerPreempted()){//sysj\controller.sysj line: 106, column: 3
            fillerReq_in.setACK(false);//sysj\controller.sysj line: 106, column: 3
            S9730=1;
            active[8]=1;
            ends[8]=1;
            break RUN;
          }
          else {
            S9725=0;
            if(!fillerReq_in.isREQ()){//sysj\controller.sysj line: 106, column: 3
              fillerReq_in.setACK(true);//sysj\controller.sysj line: 106, column: 3
              S9725=1;
              if(fillerReq_in.isREQ()){//sysj\controller.sysj line: 106, column: 3
                fillerReq_in.setACK(false);//sysj\controller.sysj line: 106, column: 3
                ends[8]=2;
                ;//sysj\controller.sysj line: 106, column: 3
                request_thread_8 = (fillerReq_in.getVal() == null ? null : ((Boolean)fillerReq_in.getVal()));//sysj\controller.sysj line: 107, column: 3
                S9746=1;
                if(request_thread_8){//sysj\controller.sysj line: 109, column: 3
                  S16710=0;
                  if(!bottleAtPos2.getprestatus()){//sysj\controller.sysj line: 111, column: 13
                    S9753=0;
                    if(!fillerStatus_o.isPartnerPresent() || fillerStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 112, column: 6
                      fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 112, column: 6
                      S9753=1;
                      active[8]=1;
                      ends[8]=1;
                      break RUN;
                    }
                    else {
                      S9748=0;
                      if(fillerStatus_o.isACK()){//sysj\controller.sysj line: 112, column: 6
                        fillerStatus_o.setVal("idle");//sysj\controller.sysj line: 112, column: 6
                        S9748=1;
                        if(!fillerStatus_o.isACK()){//sysj\controller.sysj line: 112, column: 6
                          fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 112, column: 6
                          ends[8]=2;
                          ;//sysj\controller.sysj line: 112, column: 6
                          S16710=1;
                          if(bottleAtPos2.getprestatus()){//sysj\controller.sysj line: 116, column: 13
                            S9880=0;
                            S9776=0;
                            if(!fillerStatus_o.isPartnerPresent() || fillerStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 117, column: 6
                              fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 117, column: 6
                              S9776=1;
                              active[8]=1;
                              ends[8]=1;
                              break RUN;
                            }
                            else {
                              S9771=0;
                              if(fillerStatus_o.isACK()){//sysj\controller.sysj line: 117, column: 6
                                fillerStatus_o.setVal("busy");//sysj\controller.sysj line: 117, column: 6
                                S9771=1;
                                if(!fillerStatus_o.isACK()){//sysj\controller.sysj line: 117, column: 6
                                  fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 117, column: 6
                                  ends[8]=2;
                                  ;//sysj\controller.sysj line: 117, column: 6
                                  S9880=1;
                                  S9798=0;
                                  if(!percentLiquid_in.isPartnerPresent() || percentLiquid_in.isPartnerPreempted()){//sysj\controller.sysj line: 118, column: 6
                                    percentLiquid_in.setACK(false);//sysj\controller.sysj line: 118, column: 6
                                    S9798=1;
                                    active[8]=1;
                                    ends[8]=1;
                                    break RUN;
                                  }
                                  else {
                                    S9793=0;
                                    if(!percentLiquid_in.isREQ()){//sysj\controller.sysj line: 118, column: 6
                                      percentLiquid_in.setACK(true);//sysj\controller.sysj line: 118, column: 6
                                      S9793=1;
                                      if(percentLiquid_in.isREQ()){//sysj\controller.sysj line: 118, column: 6
                                        percentLiquid_in.setACK(false);//sysj\controller.sysj line: 118, column: 6
                                        ends[8]=2;
                                        ;//sysj\controller.sysj line: 118, column: 6
                                        recPercentLiq_thread_8 = (ArrayList)(percentLiquid_in.getVal() == null ? null : ((ArrayList)percentLiquid_in.getVal()));//sysj\controller.sysj line: 119, column: 6
                                        canisterNum_thread_8 = 1;//sysj\controller.sysj line: 120, column: 6
                                        S9880=2;
                                        if(canisterNum_thread_8 < 5){//sysj\controller.sysj line: 122, column: 12
                                          S9907=0;
                                          selectCanister.setPresent();//sysj\controller.sysj line: 126, column: 9
                                          currsigs.addElement(selectCanister);
                                          selectCanister.setValue(canisterNum_thread_8);//sysj\controller.sysj line: 126, column: 9
                                          active[8]=1;
                                          ends[8]=1;
                                          break RUN;
                                        }
                                        else {
                                          ends[8]=2;
                                          ;//sysj\controller.sysj line: 122, column: 6
                                          S9880=3;
                                          S11009=0;
                                          if(!fillerStatus_o.isPartnerPresent() || fillerStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 154, column: 6
                                            fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 154, column: 6
                                            S11009=1;
                                            active[8]=1;
                                            ends[8]=1;
                                            break RUN;
                                          }
                                          else {
                                            S11004=0;
                                            if(fillerStatus_o.isACK()){//sysj\controller.sysj line: 154, column: 6
                                              fillerStatus_o.setVal("done");//sysj\controller.sysj line: 154, column: 6
                                              S11004=1;
                                              if(!fillerStatus_o.isACK()){//sysj\controller.sysj line: 154, column: 6
                                                fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 154, column: 6
                                                ends[8]=2;
                                                ;//sysj\controller.sysj line: 154, column: 6
                                                S9746=2;
                                                active[8]=1;
                                                ends[8]=1;
                                                break RUN;
                                              }
                                              else {
                                                active[8]=1;
                                                ends[8]=1;
                                                break RUN;
                                              }
                                            }
                                            else {
                                              active[8]=1;
                                              ends[8]=1;
                                              break RUN;
                                            }
                                          }
                                        }
                                      }
                                      else {
                                        active[8]=1;
                                        ends[8]=1;
                                        break RUN;
                                      }
                                    }
                                    else {
                                      active[8]=1;
                                      ends[8]=1;
                                      break RUN;
                                    }
                                  }
                                }
                                else {
                                  active[8]=1;
                                  ends[8]=1;
                                  break RUN;
                                }
                              }
                              else {
                                active[8]=1;
                                ends[8]=1;
                                break RUN;
                              }
                            }
                          }
                          else {
                            S9746=2;
                            active[8]=1;
                            ends[8]=1;
                            break RUN;
                          }
                        }
                        else {
                          active[8]=1;
                          ends[8]=1;
                          break RUN;
                        }
                      }
                      else {
                        active[8]=1;
                        ends[8]=1;
                        break RUN;
                      }
                    }
                  }
                  else {
                    S16710=1;
                    if(bottleAtPos2.getprestatus()){//sysj\controller.sysj line: 116, column: 13
                      S9880=0;
                      S9776=0;
                      if(!fillerStatus_o.isPartnerPresent() || fillerStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 117, column: 6
                        fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 117, column: 6
                        S9776=1;
                        active[8]=1;
                        ends[8]=1;
                        break RUN;
                      }
                      else {
                        S9771=0;
                        if(fillerStatus_o.isACK()){//sysj\controller.sysj line: 117, column: 6
                          fillerStatus_o.setVal("busy");//sysj\controller.sysj line: 117, column: 6
                          S9771=1;
                          if(!fillerStatus_o.isACK()){//sysj\controller.sysj line: 117, column: 6
                            fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 117, column: 6
                            ends[8]=2;
                            ;//sysj\controller.sysj line: 117, column: 6
                            S9880=1;
                            S9798=0;
                            if(!percentLiquid_in.isPartnerPresent() || percentLiquid_in.isPartnerPreempted()){//sysj\controller.sysj line: 118, column: 6
                              percentLiquid_in.setACK(false);//sysj\controller.sysj line: 118, column: 6
                              S9798=1;
                              active[8]=1;
                              ends[8]=1;
                              break RUN;
                            }
                            else {
                              S9793=0;
                              if(!percentLiquid_in.isREQ()){//sysj\controller.sysj line: 118, column: 6
                                percentLiquid_in.setACK(true);//sysj\controller.sysj line: 118, column: 6
                                S9793=1;
                                if(percentLiquid_in.isREQ()){//sysj\controller.sysj line: 118, column: 6
                                  percentLiquid_in.setACK(false);//sysj\controller.sysj line: 118, column: 6
                                  ends[8]=2;
                                  ;//sysj\controller.sysj line: 118, column: 6
                                  recPercentLiq_thread_8 = (ArrayList)(percentLiquid_in.getVal() == null ? null : ((ArrayList)percentLiquid_in.getVal()));//sysj\controller.sysj line: 119, column: 6
                                  canisterNum_thread_8 = 1;//sysj\controller.sysj line: 120, column: 6
                                  S9880=2;
                                  if(canisterNum_thread_8 < 5){//sysj\controller.sysj line: 122, column: 12
                                    S9907=0;
                                    selectCanister.setPresent();//sysj\controller.sysj line: 126, column: 9
                                    currsigs.addElement(selectCanister);
                                    selectCanister.setValue(canisterNum_thread_8);//sysj\controller.sysj line: 126, column: 9
                                    active[8]=1;
                                    ends[8]=1;
                                    break RUN;
                                  }
                                  else {
                                    ends[8]=2;
                                    ;//sysj\controller.sysj line: 122, column: 6
                                    S9880=3;
                                    S11009=0;
                                    if(!fillerStatus_o.isPartnerPresent() || fillerStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 154, column: 6
                                      fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 154, column: 6
                                      S11009=1;
                                      active[8]=1;
                                      ends[8]=1;
                                      break RUN;
                                    }
                                    else {
                                      S11004=0;
                                      if(fillerStatus_o.isACK()){//sysj\controller.sysj line: 154, column: 6
                                        fillerStatus_o.setVal("done");//sysj\controller.sysj line: 154, column: 6
                                        S11004=1;
                                        if(!fillerStatus_o.isACK()){//sysj\controller.sysj line: 154, column: 6
                                          fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 154, column: 6
                                          ends[8]=2;
                                          ;//sysj\controller.sysj line: 154, column: 6
                                          S9746=2;
                                          active[8]=1;
                                          ends[8]=1;
                                          break RUN;
                                        }
                                        else {
                                          active[8]=1;
                                          ends[8]=1;
                                          break RUN;
                                        }
                                      }
                                      else {
                                        active[8]=1;
                                        ends[8]=1;
                                        break RUN;
                                      }
                                    }
                                  }
                                }
                                else {
                                  active[8]=1;
                                  ends[8]=1;
                                  break RUN;
                                }
                              }
                              else {
                                active[8]=1;
                                ends[8]=1;
                                break RUN;
                              }
                            }
                          }
                          else {
                            active[8]=1;
                            ends[8]=1;
                            break RUN;
                          }
                        }
                        else {
                          active[8]=1;
                          ends[8]=1;
                          break RUN;
                        }
                      }
                    }
                    else {
                      S9746=2;
                      active[8]=1;
                      ends[8]=1;
                      break RUN;
                    }
                  }
                }
                else {
                  S9746=2;
                  active[8]=1;
                  ends[8]=1;
                  break RUN;
                }
              }
              else {
                active[8]=1;
                ends[8]=1;
                break RUN;
              }
            }
            else {
              active[8]=1;
              ends[8]=1;
              break RUN;
            }
          }
        
        case 2 : 
          switch(S9746){
            case 0 : 
              switch(S9730){
                case 0 : 
                  if(!fillerReq_in.isPartnerPresent() || fillerReq_in.isPartnerPreempted()){//sysj\controller.sysj line: 106, column: 3
                    fillerReq_in.setACK(false);//sysj\controller.sysj line: 106, column: 3
                    S9730=1;
                    active[8]=1;
                    ends[8]=1;
                    break RUN;
                  }
                  else {
                    switch(S9725){
                      case 0 : 
                        if(!fillerReq_in.isREQ()){//sysj\controller.sysj line: 106, column: 3
                          fillerReq_in.setACK(true);//sysj\controller.sysj line: 106, column: 3
                          S9725=1;
                          if(fillerReq_in.isREQ()){//sysj\controller.sysj line: 106, column: 3
                            fillerReq_in.setACK(false);//sysj\controller.sysj line: 106, column: 3
                            ends[8]=2;
                            ;//sysj\controller.sysj line: 106, column: 3
                            request_thread_8 = (fillerReq_in.getVal() == null ? null : ((Boolean)fillerReq_in.getVal()));//sysj\controller.sysj line: 107, column: 3
                            S9746=1;
                            if(request_thread_8){//sysj\controller.sysj line: 109, column: 3
                              S16710=0;
                              if(!bottleAtPos2.getprestatus()){//sysj\controller.sysj line: 111, column: 13
                                S9753=0;
                                if(!fillerStatus_o.isPartnerPresent() || fillerStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 112, column: 6
                                  fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 112, column: 6
                                  S9753=1;
                                  active[8]=1;
                                  ends[8]=1;
                                  break RUN;
                                }
                                else {
                                  S9748=0;
                                  if(fillerStatus_o.isACK()){//sysj\controller.sysj line: 112, column: 6
                                    fillerStatus_o.setVal("idle");//sysj\controller.sysj line: 112, column: 6
                                    S9748=1;
                                    if(!fillerStatus_o.isACK()){//sysj\controller.sysj line: 112, column: 6
                                      fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 112, column: 6
                                      ends[8]=2;
                                      ;//sysj\controller.sysj line: 112, column: 6
                                      S16710=1;
                                      if(bottleAtPos2.getprestatus()){//sysj\controller.sysj line: 116, column: 13
                                        S9880=0;
                                        S9776=0;
                                        if(!fillerStatus_o.isPartnerPresent() || fillerStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 117, column: 6
                                          fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 117, column: 6
                                          S9776=1;
                                          active[8]=1;
                                          ends[8]=1;
                                          break RUN;
                                        }
                                        else {
                                          S9771=0;
                                          if(fillerStatus_o.isACK()){//sysj\controller.sysj line: 117, column: 6
                                            fillerStatus_o.setVal("busy");//sysj\controller.sysj line: 117, column: 6
                                            S9771=1;
                                            if(!fillerStatus_o.isACK()){//sysj\controller.sysj line: 117, column: 6
                                              fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 117, column: 6
                                              ends[8]=2;
                                              ;//sysj\controller.sysj line: 117, column: 6
                                              S9880=1;
                                              S9798=0;
                                              if(!percentLiquid_in.isPartnerPresent() || percentLiquid_in.isPartnerPreempted()){//sysj\controller.sysj line: 118, column: 6
                                                percentLiquid_in.setACK(false);//sysj\controller.sysj line: 118, column: 6
                                                S9798=1;
                                                active[8]=1;
                                                ends[8]=1;
                                                break RUN;
                                              }
                                              else {
                                                S9793=0;
                                                if(!percentLiquid_in.isREQ()){//sysj\controller.sysj line: 118, column: 6
                                                  percentLiquid_in.setACK(true);//sysj\controller.sysj line: 118, column: 6
                                                  S9793=1;
                                                  if(percentLiquid_in.isREQ()){//sysj\controller.sysj line: 118, column: 6
                                                    percentLiquid_in.setACK(false);//sysj\controller.sysj line: 118, column: 6
                                                    ends[8]=2;
                                                    ;//sysj\controller.sysj line: 118, column: 6
                                                    recPercentLiq_thread_8 = (ArrayList)(percentLiquid_in.getVal() == null ? null : ((ArrayList)percentLiquid_in.getVal()));//sysj\controller.sysj line: 119, column: 6
                                                    canisterNum_thread_8 = 1;//sysj\controller.sysj line: 120, column: 6
                                                    S9880=2;
                                                    if(canisterNum_thread_8 < 5){//sysj\controller.sysj line: 122, column: 12
                                                      S9907=0;
                                                      selectCanister.setPresent();//sysj\controller.sysj line: 126, column: 9
                                                      currsigs.addElement(selectCanister);
                                                      selectCanister.setValue(canisterNum_thread_8);//sysj\controller.sysj line: 126, column: 9
                                                      active[8]=1;
                                                      ends[8]=1;
                                                      break RUN;
                                                    }
                                                    else {
                                                      ends[8]=2;
                                                      ;//sysj\controller.sysj line: 122, column: 6
                                                      S9880=3;
                                                      S11009=0;
                                                      if(!fillerStatus_o.isPartnerPresent() || fillerStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 154, column: 6
                                                        fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 154, column: 6
                                                        S11009=1;
                                                        active[8]=1;
                                                        ends[8]=1;
                                                        break RUN;
                                                      }
                                                      else {
                                                        S11004=0;
                                                        if(fillerStatus_o.isACK()){//sysj\controller.sysj line: 154, column: 6
                                                          fillerStatus_o.setVal("done");//sysj\controller.sysj line: 154, column: 6
                                                          S11004=1;
                                                          if(!fillerStatus_o.isACK()){//sysj\controller.sysj line: 154, column: 6
                                                            fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 154, column: 6
                                                            ends[8]=2;
                                                            ;//sysj\controller.sysj line: 154, column: 6
                                                            S9746=2;
                                                            active[8]=1;
                                                            ends[8]=1;
                                                            break RUN;
                                                          }
                                                          else {
                                                            active[8]=1;
                                                            ends[8]=1;
                                                            break RUN;
                                                          }
                                                        }
                                                        else {
                                                          active[8]=1;
                                                          ends[8]=1;
                                                          break RUN;
                                                        }
                                                      }
                                                    }
                                                  }
                                                  else {
                                                    active[8]=1;
                                                    ends[8]=1;
                                                    break RUN;
                                                  }
                                                }
                                                else {
                                                  active[8]=1;
                                                  ends[8]=1;
                                                  break RUN;
                                                }
                                              }
                                            }
                                            else {
                                              active[8]=1;
                                              ends[8]=1;
                                              break RUN;
                                            }
                                          }
                                          else {
                                            active[8]=1;
                                            ends[8]=1;
                                            break RUN;
                                          }
                                        }
                                      }
                                      else {
                                        S9746=2;
                                        active[8]=1;
                                        ends[8]=1;
                                        break RUN;
                                      }
                                    }
                                    else {
                                      active[8]=1;
                                      ends[8]=1;
                                      break RUN;
                                    }
                                  }
                                  else {
                                    active[8]=1;
                                    ends[8]=1;
                                    break RUN;
                                  }
                                }
                              }
                              else {
                                S16710=1;
                                if(bottleAtPos2.getprestatus()){//sysj\controller.sysj line: 116, column: 13
                                  S9880=0;
                                  S9776=0;
                                  if(!fillerStatus_o.isPartnerPresent() || fillerStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 117, column: 6
                                    fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 117, column: 6
                                    S9776=1;
                                    active[8]=1;
                                    ends[8]=1;
                                    break RUN;
                                  }
                                  else {
                                    S9771=0;
                                    if(fillerStatus_o.isACK()){//sysj\controller.sysj line: 117, column: 6
                                      fillerStatus_o.setVal("busy");//sysj\controller.sysj line: 117, column: 6
                                      S9771=1;
                                      if(!fillerStatus_o.isACK()){//sysj\controller.sysj line: 117, column: 6
                                        fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 117, column: 6
                                        ends[8]=2;
                                        ;//sysj\controller.sysj line: 117, column: 6
                                        S9880=1;
                                        S9798=0;
                                        if(!percentLiquid_in.isPartnerPresent() || percentLiquid_in.isPartnerPreempted()){//sysj\controller.sysj line: 118, column: 6
                                          percentLiquid_in.setACK(false);//sysj\controller.sysj line: 118, column: 6
                                          S9798=1;
                                          active[8]=1;
                                          ends[8]=1;
                                          break RUN;
                                        }
                                        else {
                                          S9793=0;
                                          if(!percentLiquid_in.isREQ()){//sysj\controller.sysj line: 118, column: 6
                                            percentLiquid_in.setACK(true);//sysj\controller.sysj line: 118, column: 6
                                            S9793=1;
                                            if(percentLiquid_in.isREQ()){//sysj\controller.sysj line: 118, column: 6
                                              percentLiquid_in.setACK(false);//sysj\controller.sysj line: 118, column: 6
                                              ends[8]=2;
                                              ;//sysj\controller.sysj line: 118, column: 6
                                              recPercentLiq_thread_8 = (ArrayList)(percentLiquid_in.getVal() == null ? null : ((ArrayList)percentLiquid_in.getVal()));//sysj\controller.sysj line: 119, column: 6
                                              canisterNum_thread_8 = 1;//sysj\controller.sysj line: 120, column: 6
                                              S9880=2;
                                              if(canisterNum_thread_8 < 5){//sysj\controller.sysj line: 122, column: 12
                                                S9907=0;
                                                selectCanister.setPresent();//sysj\controller.sysj line: 126, column: 9
                                                currsigs.addElement(selectCanister);
                                                selectCanister.setValue(canisterNum_thread_8);//sysj\controller.sysj line: 126, column: 9
                                                active[8]=1;
                                                ends[8]=1;
                                                break RUN;
                                              }
                                              else {
                                                ends[8]=2;
                                                ;//sysj\controller.sysj line: 122, column: 6
                                                S9880=3;
                                                S11009=0;
                                                if(!fillerStatus_o.isPartnerPresent() || fillerStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 154, column: 6
                                                  fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 154, column: 6
                                                  S11009=1;
                                                  active[8]=1;
                                                  ends[8]=1;
                                                  break RUN;
                                                }
                                                else {
                                                  S11004=0;
                                                  if(fillerStatus_o.isACK()){//sysj\controller.sysj line: 154, column: 6
                                                    fillerStatus_o.setVal("done");//sysj\controller.sysj line: 154, column: 6
                                                    S11004=1;
                                                    if(!fillerStatus_o.isACK()){//sysj\controller.sysj line: 154, column: 6
                                                      fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 154, column: 6
                                                      ends[8]=2;
                                                      ;//sysj\controller.sysj line: 154, column: 6
                                                      S9746=2;
                                                      active[8]=1;
                                                      ends[8]=1;
                                                      break RUN;
                                                    }
                                                    else {
                                                      active[8]=1;
                                                      ends[8]=1;
                                                      break RUN;
                                                    }
                                                  }
                                                  else {
                                                    active[8]=1;
                                                    ends[8]=1;
                                                    break RUN;
                                                  }
                                                }
                                              }
                                            }
                                            else {
                                              active[8]=1;
                                              ends[8]=1;
                                              break RUN;
                                            }
                                          }
                                          else {
                                            active[8]=1;
                                            ends[8]=1;
                                            break RUN;
                                          }
                                        }
                                      }
                                      else {
                                        active[8]=1;
                                        ends[8]=1;
                                        break RUN;
                                      }
                                    }
                                    else {
                                      active[8]=1;
                                      ends[8]=1;
                                      break RUN;
                                    }
                                  }
                                }
                                else {
                                  S9746=2;
                                  active[8]=1;
                                  ends[8]=1;
                                  break RUN;
                                }
                              }
                            }
                            else {
                              S9746=2;
                              active[8]=1;
                              ends[8]=1;
                              break RUN;
                            }
                          }
                          else {
                            active[8]=1;
                            ends[8]=1;
                            break RUN;
                          }
                        }
                        else {
                          active[8]=1;
                          ends[8]=1;
                          break RUN;
                        }
                      
                      case 1 : 
                        if(fillerReq_in.isREQ()){//sysj\controller.sysj line: 106, column: 3
                          fillerReq_in.setACK(false);//sysj\controller.sysj line: 106, column: 3
                          ends[8]=2;
                          ;//sysj\controller.sysj line: 106, column: 3
                          request_thread_8 = (fillerReq_in.getVal() == null ? null : ((Boolean)fillerReq_in.getVal()));//sysj\controller.sysj line: 107, column: 3
                          S9746=1;
                          if(request_thread_8){//sysj\controller.sysj line: 109, column: 3
                            S16710=0;
                            if(!bottleAtPos2.getprestatus()){//sysj\controller.sysj line: 111, column: 13
                              S9753=0;
                              if(!fillerStatus_o.isPartnerPresent() || fillerStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 112, column: 6
                                fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 112, column: 6
                                S9753=1;
                                active[8]=1;
                                ends[8]=1;
                                break RUN;
                              }
                              else {
                                S9748=0;
                                if(fillerStatus_o.isACK()){//sysj\controller.sysj line: 112, column: 6
                                  fillerStatus_o.setVal("idle");//sysj\controller.sysj line: 112, column: 6
                                  S9748=1;
                                  if(!fillerStatus_o.isACK()){//sysj\controller.sysj line: 112, column: 6
                                    fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 112, column: 6
                                    ends[8]=2;
                                    ;//sysj\controller.sysj line: 112, column: 6
                                    S16710=1;
                                    if(bottleAtPos2.getprestatus()){//sysj\controller.sysj line: 116, column: 13
                                      S9880=0;
                                      S9776=0;
                                      if(!fillerStatus_o.isPartnerPresent() || fillerStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 117, column: 6
                                        fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 117, column: 6
                                        S9776=1;
                                        active[8]=1;
                                        ends[8]=1;
                                        break RUN;
                                      }
                                      else {
                                        S9771=0;
                                        if(fillerStatus_o.isACK()){//sysj\controller.sysj line: 117, column: 6
                                          fillerStatus_o.setVal("busy");//sysj\controller.sysj line: 117, column: 6
                                          S9771=1;
                                          if(!fillerStatus_o.isACK()){//sysj\controller.sysj line: 117, column: 6
                                            fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 117, column: 6
                                            ends[8]=2;
                                            ;//sysj\controller.sysj line: 117, column: 6
                                            S9880=1;
                                            S9798=0;
                                            if(!percentLiquid_in.isPartnerPresent() || percentLiquid_in.isPartnerPreempted()){//sysj\controller.sysj line: 118, column: 6
                                              percentLiquid_in.setACK(false);//sysj\controller.sysj line: 118, column: 6
                                              S9798=1;
                                              active[8]=1;
                                              ends[8]=1;
                                              break RUN;
                                            }
                                            else {
                                              S9793=0;
                                              if(!percentLiquid_in.isREQ()){//sysj\controller.sysj line: 118, column: 6
                                                percentLiquid_in.setACK(true);//sysj\controller.sysj line: 118, column: 6
                                                S9793=1;
                                                if(percentLiquid_in.isREQ()){//sysj\controller.sysj line: 118, column: 6
                                                  percentLiquid_in.setACK(false);//sysj\controller.sysj line: 118, column: 6
                                                  ends[8]=2;
                                                  ;//sysj\controller.sysj line: 118, column: 6
                                                  recPercentLiq_thread_8 = (ArrayList)(percentLiquid_in.getVal() == null ? null : ((ArrayList)percentLiquid_in.getVal()));//sysj\controller.sysj line: 119, column: 6
                                                  canisterNum_thread_8 = 1;//sysj\controller.sysj line: 120, column: 6
                                                  S9880=2;
                                                  if(canisterNum_thread_8 < 5){//sysj\controller.sysj line: 122, column: 12
                                                    S9907=0;
                                                    selectCanister.setPresent();//sysj\controller.sysj line: 126, column: 9
                                                    currsigs.addElement(selectCanister);
                                                    selectCanister.setValue(canisterNum_thread_8);//sysj\controller.sysj line: 126, column: 9
                                                    active[8]=1;
                                                    ends[8]=1;
                                                    break RUN;
                                                  }
                                                  else {
                                                    ends[8]=2;
                                                    ;//sysj\controller.sysj line: 122, column: 6
                                                    S9880=3;
                                                    S11009=0;
                                                    if(!fillerStatus_o.isPartnerPresent() || fillerStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 154, column: 6
                                                      fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 154, column: 6
                                                      S11009=1;
                                                      active[8]=1;
                                                      ends[8]=1;
                                                      break RUN;
                                                    }
                                                    else {
                                                      S11004=0;
                                                      if(fillerStatus_o.isACK()){//sysj\controller.sysj line: 154, column: 6
                                                        fillerStatus_o.setVal("done");//sysj\controller.sysj line: 154, column: 6
                                                        S11004=1;
                                                        if(!fillerStatus_o.isACK()){//sysj\controller.sysj line: 154, column: 6
                                                          fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 154, column: 6
                                                          ends[8]=2;
                                                          ;//sysj\controller.sysj line: 154, column: 6
                                                          S9746=2;
                                                          active[8]=1;
                                                          ends[8]=1;
                                                          break RUN;
                                                        }
                                                        else {
                                                          active[8]=1;
                                                          ends[8]=1;
                                                          break RUN;
                                                        }
                                                      }
                                                      else {
                                                        active[8]=1;
                                                        ends[8]=1;
                                                        break RUN;
                                                      }
                                                    }
                                                  }
                                                }
                                                else {
                                                  active[8]=1;
                                                  ends[8]=1;
                                                  break RUN;
                                                }
                                              }
                                              else {
                                                active[8]=1;
                                                ends[8]=1;
                                                break RUN;
                                              }
                                            }
                                          }
                                          else {
                                            active[8]=1;
                                            ends[8]=1;
                                            break RUN;
                                          }
                                        }
                                        else {
                                          active[8]=1;
                                          ends[8]=1;
                                          break RUN;
                                        }
                                      }
                                    }
                                    else {
                                      S9746=2;
                                      active[8]=1;
                                      ends[8]=1;
                                      break RUN;
                                    }
                                  }
                                  else {
                                    active[8]=1;
                                    ends[8]=1;
                                    break RUN;
                                  }
                                }
                                else {
                                  active[8]=1;
                                  ends[8]=1;
                                  break RUN;
                                }
                              }
                            }
                            else {
                              S16710=1;
                              if(bottleAtPos2.getprestatus()){//sysj\controller.sysj line: 116, column: 13
                                S9880=0;
                                S9776=0;
                                if(!fillerStatus_o.isPartnerPresent() || fillerStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 117, column: 6
                                  fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 117, column: 6
                                  S9776=1;
                                  active[8]=1;
                                  ends[8]=1;
                                  break RUN;
                                }
                                else {
                                  S9771=0;
                                  if(fillerStatus_o.isACK()){//sysj\controller.sysj line: 117, column: 6
                                    fillerStatus_o.setVal("busy");//sysj\controller.sysj line: 117, column: 6
                                    S9771=1;
                                    if(!fillerStatus_o.isACK()){//sysj\controller.sysj line: 117, column: 6
                                      fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 117, column: 6
                                      ends[8]=2;
                                      ;//sysj\controller.sysj line: 117, column: 6
                                      S9880=1;
                                      S9798=0;
                                      if(!percentLiquid_in.isPartnerPresent() || percentLiquid_in.isPartnerPreempted()){//sysj\controller.sysj line: 118, column: 6
                                        percentLiquid_in.setACK(false);//sysj\controller.sysj line: 118, column: 6
                                        S9798=1;
                                        active[8]=1;
                                        ends[8]=1;
                                        break RUN;
                                      }
                                      else {
                                        S9793=0;
                                        if(!percentLiquid_in.isREQ()){//sysj\controller.sysj line: 118, column: 6
                                          percentLiquid_in.setACK(true);//sysj\controller.sysj line: 118, column: 6
                                          S9793=1;
                                          if(percentLiquid_in.isREQ()){//sysj\controller.sysj line: 118, column: 6
                                            percentLiquid_in.setACK(false);//sysj\controller.sysj line: 118, column: 6
                                            ends[8]=2;
                                            ;//sysj\controller.sysj line: 118, column: 6
                                            recPercentLiq_thread_8 = (ArrayList)(percentLiquid_in.getVal() == null ? null : ((ArrayList)percentLiquid_in.getVal()));//sysj\controller.sysj line: 119, column: 6
                                            canisterNum_thread_8 = 1;//sysj\controller.sysj line: 120, column: 6
                                            S9880=2;
                                            if(canisterNum_thread_8 < 5){//sysj\controller.sysj line: 122, column: 12
                                              S9907=0;
                                              selectCanister.setPresent();//sysj\controller.sysj line: 126, column: 9
                                              currsigs.addElement(selectCanister);
                                              selectCanister.setValue(canisterNum_thread_8);//sysj\controller.sysj line: 126, column: 9
                                              active[8]=1;
                                              ends[8]=1;
                                              break RUN;
                                            }
                                            else {
                                              ends[8]=2;
                                              ;//sysj\controller.sysj line: 122, column: 6
                                              S9880=3;
                                              S11009=0;
                                              if(!fillerStatus_o.isPartnerPresent() || fillerStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 154, column: 6
                                                fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 154, column: 6
                                                S11009=1;
                                                active[8]=1;
                                                ends[8]=1;
                                                break RUN;
                                              }
                                              else {
                                                S11004=0;
                                                if(fillerStatus_o.isACK()){//sysj\controller.sysj line: 154, column: 6
                                                  fillerStatus_o.setVal("done");//sysj\controller.sysj line: 154, column: 6
                                                  S11004=1;
                                                  if(!fillerStatus_o.isACK()){//sysj\controller.sysj line: 154, column: 6
                                                    fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 154, column: 6
                                                    ends[8]=2;
                                                    ;//sysj\controller.sysj line: 154, column: 6
                                                    S9746=2;
                                                    active[8]=1;
                                                    ends[8]=1;
                                                    break RUN;
                                                  }
                                                  else {
                                                    active[8]=1;
                                                    ends[8]=1;
                                                    break RUN;
                                                  }
                                                }
                                                else {
                                                  active[8]=1;
                                                  ends[8]=1;
                                                  break RUN;
                                                }
                                              }
                                            }
                                          }
                                          else {
                                            active[8]=1;
                                            ends[8]=1;
                                            break RUN;
                                          }
                                        }
                                        else {
                                          active[8]=1;
                                          ends[8]=1;
                                          break RUN;
                                        }
                                      }
                                    }
                                    else {
                                      active[8]=1;
                                      ends[8]=1;
                                      break RUN;
                                    }
                                  }
                                  else {
                                    active[8]=1;
                                    ends[8]=1;
                                    break RUN;
                                  }
                                }
                              }
                              else {
                                S9746=2;
                                active[8]=1;
                                ends[8]=1;
                                break RUN;
                              }
                            }
                          }
                          else {
                            S9746=2;
                            active[8]=1;
                            ends[8]=1;
                            break RUN;
                          }
                        }
                        else {
                          active[8]=1;
                          ends[8]=1;
                          break RUN;
                        }
                      
                    }
                  }
                  break;
                
                case 1 : 
                  S9730=1;
                  S9730=0;
                  if(!fillerReq_in.isPartnerPresent() || fillerReq_in.isPartnerPreempted()){//sysj\controller.sysj line: 106, column: 3
                    fillerReq_in.setACK(false);//sysj\controller.sysj line: 106, column: 3
                    S9730=1;
                    active[8]=1;
                    ends[8]=1;
                    break RUN;
                  }
                  else {
                    S9725=0;
                    if(!fillerReq_in.isREQ()){//sysj\controller.sysj line: 106, column: 3
                      fillerReq_in.setACK(true);//sysj\controller.sysj line: 106, column: 3
                      S9725=1;
                      if(fillerReq_in.isREQ()){//sysj\controller.sysj line: 106, column: 3
                        fillerReq_in.setACK(false);//sysj\controller.sysj line: 106, column: 3
                        ends[8]=2;
                        ;//sysj\controller.sysj line: 106, column: 3
                        request_thread_8 = (fillerReq_in.getVal() == null ? null : ((Boolean)fillerReq_in.getVal()));//sysj\controller.sysj line: 107, column: 3
                        S9746=1;
                        if(request_thread_8){//sysj\controller.sysj line: 109, column: 3
                          S16710=0;
                          if(!bottleAtPos2.getprestatus()){//sysj\controller.sysj line: 111, column: 13
                            S9753=0;
                            if(!fillerStatus_o.isPartnerPresent() || fillerStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 112, column: 6
                              fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 112, column: 6
                              S9753=1;
                              active[8]=1;
                              ends[8]=1;
                              break RUN;
                            }
                            else {
                              S9748=0;
                              if(fillerStatus_o.isACK()){//sysj\controller.sysj line: 112, column: 6
                                fillerStatus_o.setVal("idle");//sysj\controller.sysj line: 112, column: 6
                                S9748=1;
                                if(!fillerStatus_o.isACK()){//sysj\controller.sysj line: 112, column: 6
                                  fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 112, column: 6
                                  ends[8]=2;
                                  ;//sysj\controller.sysj line: 112, column: 6
                                  S16710=1;
                                  if(bottleAtPos2.getprestatus()){//sysj\controller.sysj line: 116, column: 13
                                    S9880=0;
                                    S9776=0;
                                    if(!fillerStatus_o.isPartnerPresent() || fillerStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 117, column: 6
                                      fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 117, column: 6
                                      S9776=1;
                                      active[8]=1;
                                      ends[8]=1;
                                      break RUN;
                                    }
                                    else {
                                      S9771=0;
                                      if(fillerStatus_o.isACK()){//sysj\controller.sysj line: 117, column: 6
                                        fillerStatus_o.setVal("busy");//sysj\controller.sysj line: 117, column: 6
                                        S9771=1;
                                        if(!fillerStatus_o.isACK()){//sysj\controller.sysj line: 117, column: 6
                                          fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 117, column: 6
                                          ends[8]=2;
                                          ;//sysj\controller.sysj line: 117, column: 6
                                          S9880=1;
                                          S9798=0;
                                          if(!percentLiquid_in.isPartnerPresent() || percentLiquid_in.isPartnerPreempted()){//sysj\controller.sysj line: 118, column: 6
                                            percentLiquid_in.setACK(false);//sysj\controller.sysj line: 118, column: 6
                                            S9798=1;
                                            active[8]=1;
                                            ends[8]=1;
                                            break RUN;
                                          }
                                          else {
                                            S9793=0;
                                            if(!percentLiquid_in.isREQ()){//sysj\controller.sysj line: 118, column: 6
                                              percentLiquid_in.setACK(true);//sysj\controller.sysj line: 118, column: 6
                                              S9793=1;
                                              if(percentLiquid_in.isREQ()){//sysj\controller.sysj line: 118, column: 6
                                                percentLiquid_in.setACK(false);//sysj\controller.sysj line: 118, column: 6
                                                ends[8]=2;
                                                ;//sysj\controller.sysj line: 118, column: 6
                                                recPercentLiq_thread_8 = (ArrayList)(percentLiquid_in.getVal() == null ? null : ((ArrayList)percentLiquid_in.getVal()));//sysj\controller.sysj line: 119, column: 6
                                                canisterNum_thread_8 = 1;//sysj\controller.sysj line: 120, column: 6
                                                S9880=2;
                                                if(canisterNum_thread_8 < 5){//sysj\controller.sysj line: 122, column: 12
                                                  S9907=0;
                                                  selectCanister.setPresent();//sysj\controller.sysj line: 126, column: 9
                                                  currsigs.addElement(selectCanister);
                                                  selectCanister.setValue(canisterNum_thread_8);//sysj\controller.sysj line: 126, column: 9
                                                  active[8]=1;
                                                  ends[8]=1;
                                                  break RUN;
                                                }
                                                else {
                                                  ends[8]=2;
                                                  ;//sysj\controller.sysj line: 122, column: 6
                                                  S9880=3;
                                                  S11009=0;
                                                  if(!fillerStatus_o.isPartnerPresent() || fillerStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 154, column: 6
                                                    fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 154, column: 6
                                                    S11009=1;
                                                    active[8]=1;
                                                    ends[8]=1;
                                                    break RUN;
                                                  }
                                                  else {
                                                    S11004=0;
                                                    if(fillerStatus_o.isACK()){//sysj\controller.sysj line: 154, column: 6
                                                      fillerStatus_o.setVal("done");//sysj\controller.sysj line: 154, column: 6
                                                      S11004=1;
                                                      if(!fillerStatus_o.isACK()){//sysj\controller.sysj line: 154, column: 6
                                                        fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 154, column: 6
                                                        ends[8]=2;
                                                        ;//sysj\controller.sysj line: 154, column: 6
                                                        S9746=2;
                                                        active[8]=1;
                                                        ends[8]=1;
                                                        break RUN;
                                                      }
                                                      else {
                                                        active[8]=1;
                                                        ends[8]=1;
                                                        break RUN;
                                                      }
                                                    }
                                                    else {
                                                      active[8]=1;
                                                      ends[8]=1;
                                                      break RUN;
                                                    }
                                                  }
                                                }
                                              }
                                              else {
                                                active[8]=1;
                                                ends[8]=1;
                                                break RUN;
                                              }
                                            }
                                            else {
                                              active[8]=1;
                                              ends[8]=1;
                                              break RUN;
                                            }
                                          }
                                        }
                                        else {
                                          active[8]=1;
                                          ends[8]=1;
                                          break RUN;
                                        }
                                      }
                                      else {
                                        active[8]=1;
                                        ends[8]=1;
                                        break RUN;
                                      }
                                    }
                                  }
                                  else {
                                    S9746=2;
                                    active[8]=1;
                                    ends[8]=1;
                                    break RUN;
                                  }
                                }
                                else {
                                  active[8]=1;
                                  ends[8]=1;
                                  break RUN;
                                }
                              }
                              else {
                                active[8]=1;
                                ends[8]=1;
                                break RUN;
                              }
                            }
                          }
                          else {
                            S16710=1;
                            if(bottleAtPos2.getprestatus()){//sysj\controller.sysj line: 116, column: 13
                              S9880=0;
                              S9776=0;
                              if(!fillerStatus_o.isPartnerPresent() || fillerStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 117, column: 6
                                fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 117, column: 6
                                S9776=1;
                                active[8]=1;
                                ends[8]=1;
                                break RUN;
                              }
                              else {
                                S9771=0;
                                if(fillerStatus_o.isACK()){//sysj\controller.sysj line: 117, column: 6
                                  fillerStatus_o.setVal("busy");//sysj\controller.sysj line: 117, column: 6
                                  S9771=1;
                                  if(!fillerStatus_o.isACK()){//sysj\controller.sysj line: 117, column: 6
                                    fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 117, column: 6
                                    ends[8]=2;
                                    ;//sysj\controller.sysj line: 117, column: 6
                                    S9880=1;
                                    S9798=0;
                                    if(!percentLiquid_in.isPartnerPresent() || percentLiquid_in.isPartnerPreempted()){//sysj\controller.sysj line: 118, column: 6
                                      percentLiquid_in.setACK(false);//sysj\controller.sysj line: 118, column: 6
                                      S9798=1;
                                      active[8]=1;
                                      ends[8]=1;
                                      break RUN;
                                    }
                                    else {
                                      S9793=0;
                                      if(!percentLiquid_in.isREQ()){//sysj\controller.sysj line: 118, column: 6
                                        percentLiquid_in.setACK(true);//sysj\controller.sysj line: 118, column: 6
                                        S9793=1;
                                        if(percentLiquid_in.isREQ()){//sysj\controller.sysj line: 118, column: 6
                                          percentLiquid_in.setACK(false);//sysj\controller.sysj line: 118, column: 6
                                          ends[8]=2;
                                          ;//sysj\controller.sysj line: 118, column: 6
                                          recPercentLiq_thread_8 = (ArrayList)(percentLiquid_in.getVal() == null ? null : ((ArrayList)percentLiquid_in.getVal()));//sysj\controller.sysj line: 119, column: 6
                                          canisterNum_thread_8 = 1;//sysj\controller.sysj line: 120, column: 6
                                          S9880=2;
                                          if(canisterNum_thread_8 < 5){//sysj\controller.sysj line: 122, column: 12
                                            S9907=0;
                                            selectCanister.setPresent();//sysj\controller.sysj line: 126, column: 9
                                            currsigs.addElement(selectCanister);
                                            selectCanister.setValue(canisterNum_thread_8);//sysj\controller.sysj line: 126, column: 9
                                            active[8]=1;
                                            ends[8]=1;
                                            break RUN;
                                          }
                                          else {
                                            ends[8]=2;
                                            ;//sysj\controller.sysj line: 122, column: 6
                                            S9880=3;
                                            S11009=0;
                                            if(!fillerStatus_o.isPartnerPresent() || fillerStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 154, column: 6
                                              fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 154, column: 6
                                              S11009=1;
                                              active[8]=1;
                                              ends[8]=1;
                                              break RUN;
                                            }
                                            else {
                                              S11004=0;
                                              if(fillerStatus_o.isACK()){//sysj\controller.sysj line: 154, column: 6
                                                fillerStatus_o.setVal("done");//sysj\controller.sysj line: 154, column: 6
                                                S11004=1;
                                                if(!fillerStatus_o.isACK()){//sysj\controller.sysj line: 154, column: 6
                                                  fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 154, column: 6
                                                  ends[8]=2;
                                                  ;//sysj\controller.sysj line: 154, column: 6
                                                  S9746=2;
                                                  active[8]=1;
                                                  ends[8]=1;
                                                  break RUN;
                                                }
                                                else {
                                                  active[8]=1;
                                                  ends[8]=1;
                                                  break RUN;
                                                }
                                              }
                                              else {
                                                active[8]=1;
                                                ends[8]=1;
                                                break RUN;
                                              }
                                            }
                                          }
                                        }
                                        else {
                                          active[8]=1;
                                          ends[8]=1;
                                          break RUN;
                                        }
                                      }
                                      else {
                                        active[8]=1;
                                        ends[8]=1;
                                        break RUN;
                                      }
                                    }
                                  }
                                  else {
                                    active[8]=1;
                                    ends[8]=1;
                                    break RUN;
                                  }
                                }
                                else {
                                  active[8]=1;
                                  ends[8]=1;
                                  break RUN;
                                }
                              }
                            }
                            else {
                              S9746=2;
                              active[8]=1;
                              ends[8]=1;
                              break RUN;
                            }
                          }
                        }
                        else {
                          S9746=2;
                          active[8]=1;
                          ends[8]=1;
                          break RUN;
                        }
                      }
                      else {
                        active[8]=1;
                        ends[8]=1;
                        break RUN;
                      }
                    }
                    else {
                      active[8]=1;
                      ends[8]=1;
                      break RUN;
                    }
                  }
                
              }
              break;
            
            case 1 : 
              switch(S16710){
                case 0 : 
                  switch(S9753){
                    case 0 : 
                      if(!fillerStatus_o.isPartnerPresent() || fillerStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 112, column: 6
                        fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 112, column: 6
                        S9753=1;
                        active[8]=1;
                        ends[8]=1;
                        break RUN;
                      }
                      else {
                        switch(S9748){
                          case 0 : 
                            if(fillerStatus_o.isACK()){//sysj\controller.sysj line: 112, column: 6
                              fillerStatus_o.setVal("idle");//sysj\controller.sysj line: 112, column: 6
                              S9748=1;
                              if(!fillerStatus_o.isACK()){//sysj\controller.sysj line: 112, column: 6
                                fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 112, column: 6
                                ends[8]=2;
                                ;//sysj\controller.sysj line: 112, column: 6
                                S16710=1;
                                if(bottleAtPos2.getprestatus()){//sysj\controller.sysj line: 116, column: 13
                                  S9880=0;
                                  S9776=0;
                                  if(!fillerStatus_o.isPartnerPresent() || fillerStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 117, column: 6
                                    fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 117, column: 6
                                    S9776=1;
                                    active[8]=1;
                                    ends[8]=1;
                                    break RUN;
                                  }
                                  else {
                                    S9771=0;
                                    if(fillerStatus_o.isACK()){//sysj\controller.sysj line: 117, column: 6
                                      fillerStatus_o.setVal("busy");//sysj\controller.sysj line: 117, column: 6
                                      S9771=1;
                                      if(!fillerStatus_o.isACK()){//sysj\controller.sysj line: 117, column: 6
                                        fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 117, column: 6
                                        ends[8]=2;
                                        ;//sysj\controller.sysj line: 117, column: 6
                                        S9880=1;
                                        S9798=0;
                                        if(!percentLiquid_in.isPartnerPresent() || percentLiquid_in.isPartnerPreempted()){//sysj\controller.sysj line: 118, column: 6
                                          percentLiquid_in.setACK(false);//sysj\controller.sysj line: 118, column: 6
                                          S9798=1;
                                          active[8]=1;
                                          ends[8]=1;
                                          break RUN;
                                        }
                                        else {
                                          S9793=0;
                                          if(!percentLiquid_in.isREQ()){//sysj\controller.sysj line: 118, column: 6
                                            percentLiquid_in.setACK(true);//sysj\controller.sysj line: 118, column: 6
                                            S9793=1;
                                            if(percentLiquid_in.isREQ()){//sysj\controller.sysj line: 118, column: 6
                                              percentLiquid_in.setACK(false);//sysj\controller.sysj line: 118, column: 6
                                              ends[8]=2;
                                              ;//sysj\controller.sysj line: 118, column: 6
                                              recPercentLiq_thread_8 = (ArrayList)(percentLiquid_in.getVal() == null ? null : ((ArrayList)percentLiquid_in.getVal()));//sysj\controller.sysj line: 119, column: 6
                                              canisterNum_thread_8 = 1;//sysj\controller.sysj line: 120, column: 6
                                              S9880=2;
                                              if(canisterNum_thread_8 < 5){//sysj\controller.sysj line: 122, column: 12
                                                S9907=0;
                                                selectCanister.setPresent();//sysj\controller.sysj line: 126, column: 9
                                                currsigs.addElement(selectCanister);
                                                selectCanister.setValue(canisterNum_thread_8);//sysj\controller.sysj line: 126, column: 9
                                                active[8]=1;
                                                ends[8]=1;
                                                break RUN;
                                              }
                                              else {
                                                ends[8]=2;
                                                ;//sysj\controller.sysj line: 122, column: 6
                                                S9880=3;
                                                S11009=0;
                                                if(!fillerStatus_o.isPartnerPresent() || fillerStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 154, column: 6
                                                  fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 154, column: 6
                                                  S11009=1;
                                                  active[8]=1;
                                                  ends[8]=1;
                                                  break RUN;
                                                }
                                                else {
                                                  S11004=0;
                                                  if(fillerStatus_o.isACK()){//sysj\controller.sysj line: 154, column: 6
                                                    fillerStatus_o.setVal("done");//sysj\controller.sysj line: 154, column: 6
                                                    S11004=1;
                                                    if(!fillerStatus_o.isACK()){//sysj\controller.sysj line: 154, column: 6
                                                      fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 154, column: 6
                                                      ends[8]=2;
                                                      ;//sysj\controller.sysj line: 154, column: 6
                                                      S9746=2;
                                                      active[8]=1;
                                                      ends[8]=1;
                                                      break RUN;
                                                    }
                                                    else {
                                                      active[8]=1;
                                                      ends[8]=1;
                                                      break RUN;
                                                    }
                                                  }
                                                  else {
                                                    active[8]=1;
                                                    ends[8]=1;
                                                    break RUN;
                                                  }
                                                }
                                              }
                                            }
                                            else {
                                              active[8]=1;
                                              ends[8]=1;
                                              break RUN;
                                            }
                                          }
                                          else {
                                            active[8]=1;
                                            ends[8]=1;
                                            break RUN;
                                          }
                                        }
                                      }
                                      else {
                                        active[8]=1;
                                        ends[8]=1;
                                        break RUN;
                                      }
                                    }
                                    else {
                                      active[8]=1;
                                      ends[8]=1;
                                      break RUN;
                                    }
                                  }
                                }
                                else {
                                  S9746=2;
                                  active[8]=1;
                                  ends[8]=1;
                                  break RUN;
                                }
                              }
                              else {
                                active[8]=1;
                                ends[8]=1;
                                break RUN;
                              }
                            }
                            else {
                              active[8]=1;
                              ends[8]=1;
                              break RUN;
                            }
                          
                          case 1 : 
                            if(!fillerStatus_o.isACK()){//sysj\controller.sysj line: 112, column: 6
                              fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 112, column: 6
                              ends[8]=2;
                              ;//sysj\controller.sysj line: 112, column: 6
                              S16710=1;
                              if(bottleAtPos2.getprestatus()){//sysj\controller.sysj line: 116, column: 13
                                S9880=0;
                                S9776=0;
                                if(!fillerStatus_o.isPartnerPresent() || fillerStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 117, column: 6
                                  fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 117, column: 6
                                  S9776=1;
                                  active[8]=1;
                                  ends[8]=1;
                                  break RUN;
                                }
                                else {
                                  S9771=0;
                                  if(fillerStatus_o.isACK()){//sysj\controller.sysj line: 117, column: 6
                                    fillerStatus_o.setVal("busy");//sysj\controller.sysj line: 117, column: 6
                                    S9771=1;
                                    if(!fillerStatus_o.isACK()){//sysj\controller.sysj line: 117, column: 6
                                      fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 117, column: 6
                                      ends[8]=2;
                                      ;//sysj\controller.sysj line: 117, column: 6
                                      S9880=1;
                                      S9798=0;
                                      if(!percentLiquid_in.isPartnerPresent() || percentLiquid_in.isPartnerPreempted()){//sysj\controller.sysj line: 118, column: 6
                                        percentLiquid_in.setACK(false);//sysj\controller.sysj line: 118, column: 6
                                        S9798=1;
                                        active[8]=1;
                                        ends[8]=1;
                                        break RUN;
                                      }
                                      else {
                                        S9793=0;
                                        if(!percentLiquid_in.isREQ()){//sysj\controller.sysj line: 118, column: 6
                                          percentLiquid_in.setACK(true);//sysj\controller.sysj line: 118, column: 6
                                          S9793=1;
                                          if(percentLiquid_in.isREQ()){//sysj\controller.sysj line: 118, column: 6
                                            percentLiquid_in.setACK(false);//sysj\controller.sysj line: 118, column: 6
                                            ends[8]=2;
                                            ;//sysj\controller.sysj line: 118, column: 6
                                            recPercentLiq_thread_8 = (ArrayList)(percentLiquid_in.getVal() == null ? null : ((ArrayList)percentLiquid_in.getVal()));//sysj\controller.sysj line: 119, column: 6
                                            canisterNum_thread_8 = 1;//sysj\controller.sysj line: 120, column: 6
                                            S9880=2;
                                            if(canisterNum_thread_8 < 5){//sysj\controller.sysj line: 122, column: 12
                                              S9907=0;
                                              selectCanister.setPresent();//sysj\controller.sysj line: 126, column: 9
                                              currsigs.addElement(selectCanister);
                                              selectCanister.setValue(canisterNum_thread_8);//sysj\controller.sysj line: 126, column: 9
                                              active[8]=1;
                                              ends[8]=1;
                                              break RUN;
                                            }
                                            else {
                                              ends[8]=2;
                                              ;//sysj\controller.sysj line: 122, column: 6
                                              S9880=3;
                                              S11009=0;
                                              if(!fillerStatus_o.isPartnerPresent() || fillerStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 154, column: 6
                                                fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 154, column: 6
                                                S11009=1;
                                                active[8]=1;
                                                ends[8]=1;
                                                break RUN;
                                              }
                                              else {
                                                S11004=0;
                                                if(fillerStatus_o.isACK()){//sysj\controller.sysj line: 154, column: 6
                                                  fillerStatus_o.setVal("done");//sysj\controller.sysj line: 154, column: 6
                                                  S11004=1;
                                                  if(!fillerStatus_o.isACK()){//sysj\controller.sysj line: 154, column: 6
                                                    fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 154, column: 6
                                                    ends[8]=2;
                                                    ;//sysj\controller.sysj line: 154, column: 6
                                                    S9746=2;
                                                    active[8]=1;
                                                    ends[8]=1;
                                                    break RUN;
                                                  }
                                                  else {
                                                    active[8]=1;
                                                    ends[8]=1;
                                                    break RUN;
                                                  }
                                                }
                                                else {
                                                  active[8]=1;
                                                  ends[8]=1;
                                                  break RUN;
                                                }
                                              }
                                            }
                                          }
                                          else {
                                            active[8]=1;
                                            ends[8]=1;
                                            break RUN;
                                          }
                                        }
                                        else {
                                          active[8]=1;
                                          ends[8]=1;
                                          break RUN;
                                        }
                                      }
                                    }
                                    else {
                                      active[8]=1;
                                      ends[8]=1;
                                      break RUN;
                                    }
                                  }
                                  else {
                                    active[8]=1;
                                    ends[8]=1;
                                    break RUN;
                                  }
                                }
                              }
                              else {
                                S9746=2;
                                active[8]=1;
                                ends[8]=1;
                                break RUN;
                              }
                            }
                            else {
                              active[8]=1;
                              ends[8]=1;
                              break RUN;
                            }
                          
                        }
                      }
                      break;
                    
                    case 1 : 
                      S9753=1;
                      S9753=0;
                      if(!fillerStatus_o.isPartnerPresent() || fillerStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 112, column: 6
                        fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 112, column: 6
                        S9753=1;
                        active[8]=1;
                        ends[8]=1;
                        break RUN;
                      }
                      else {
                        S9748=0;
                        if(fillerStatus_o.isACK()){//sysj\controller.sysj line: 112, column: 6
                          fillerStatus_o.setVal("idle");//sysj\controller.sysj line: 112, column: 6
                          S9748=1;
                          if(!fillerStatus_o.isACK()){//sysj\controller.sysj line: 112, column: 6
                            fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 112, column: 6
                            ends[8]=2;
                            ;//sysj\controller.sysj line: 112, column: 6
                            S16710=1;
                            if(bottleAtPos2.getprestatus()){//sysj\controller.sysj line: 116, column: 13
                              S9880=0;
                              S9776=0;
                              if(!fillerStatus_o.isPartnerPresent() || fillerStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 117, column: 6
                                fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 117, column: 6
                                S9776=1;
                                active[8]=1;
                                ends[8]=1;
                                break RUN;
                              }
                              else {
                                S9771=0;
                                if(fillerStatus_o.isACK()){//sysj\controller.sysj line: 117, column: 6
                                  fillerStatus_o.setVal("busy");//sysj\controller.sysj line: 117, column: 6
                                  S9771=1;
                                  if(!fillerStatus_o.isACK()){//sysj\controller.sysj line: 117, column: 6
                                    fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 117, column: 6
                                    ends[8]=2;
                                    ;//sysj\controller.sysj line: 117, column: 6
                                    S9880=1;
                                    S9798=0;
                                    if(!percentLiquid_in.isPartnerPresent() || percentLiquid_in.isPartnerPreempted()){//sysj\controller.sysj line: 118, column: 6
                                      percentLiquid_in.setACK(false);//sysj\controller.sysj line: 118, column: 6
                                      S9798=1;
                                      active[8]=1;
                                      ends[8]=1;
                                      break RUN;
                                    }
                                    else {
                                      S9793=0;
                                      if(!percentLiquid_in.isREQ()){//sysj\controller.sysj line: 118, column: 6
                                        percentLiquid_in.setACK(true);//sysj\controller.sysj line: 118, column: 6
                                        S9793=1;
                                        if(percentLiquid_in.isREQ()){//sysj\controller.sysj line: 118, column: 6
                                          percentLiquid_in.setACK(false);//sysj\controller.sysj line: 118, column: 6
                                          ends[8]=2;
                                          ;//sysj\controller.sysj line: 118, column: 6
                                          recPercentLiq_thread_8 = (ArrayList)(percentLiquid_in.getVal() == null ? null : ((ArrayList)percentLiquid_in.getVal()));//sysj\controller.sysj line: 119, column: 6
                                          canisterNum_thread_8 = 1;//sysj\controller.sysj line: 120, column: 6
                                          S9880=2;
                                          if(canisterNum_thread_8 < 5){//sysj\controller.sysj line: 122, column: 12
                                            S9907=0;
                                            selectCanister.setPresent();//sysj\controller.sysj line: 126, column: 9
                                            currsigs.addElement(selectCanister);
                                            selectCanister.setValue(canisterNum_thread_8);//sysj\controller.sysj line: 126, column: 9
                                            active[8]=1;
                                            ends[8]=1;
                                            break RUN;
                                          }
                                          else {
                                            ends[8]=2;
                                            ;//sysj\controller.sysj line: 122, column: 6
                                            S9880=3;
                                            S11009=0;
                                            if(!fillerStatus_o.isPartnerPresent() || fillerStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 154, column: 6
                                              fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 154, column: 6
                                              S11009=1;
                                              active[8]=1;
                                              ends[8]=1;
                                              break RUN;
                                            }
                                            else {
                                              S11004=0;
                                              if(fillerStatus_o.isACK()){//sysj\controller.sysj line: 154, column: 6
                                                fillerStatus_o.setVal("done");//sysj\controller.sysj line: 154, column: 6
                                                S11004=1;
                                                if(!fillerStatus_o.isACK()){//sysj\controller.sysj line: 154, column: 6
                                                  fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 154, column: 6
                                                  ends[8]=2;
                                                  ;//sysj\controller.sysj line: 154, column: 6
                                                  S9746=2;
                                                  active[8]=1;
                                                  ends[8]=1;
                                                  break RUN;
                                                }
                                                else {
                                                  active[8]=1;
                                                  ends[8]=1;
                                                  break RUN;
                                                }
                                              }
                                              else {
                                                active[8]=1;
                                                ends[8]=1;
                                                break RUN;
                                              }
                                            }
                                          }
                                        }
                                        else {
                                          active[8]=1;
                                          ends[8]=1;
                                          break RUN;
                                        }
                                      }
                                      else {
                                        active[8]=1;
                                        ends[8]=1;
                                        break RUN;
                                      }
                                    }
                                  }
                                  else {
                                    active[8]=1;
                                    ends[8]=1;
                                    break RUN;
                                  }
                                }
                                else {
                                  active[8]=1;
                                  ends[8]=1;
                                  break RUN;
                                }
                              }
                            }
                            else {
                              S9746=2;
                              active[8]=1;
                              ends[8]=1;
                              break RUN;
                            }
                          }
                          else {
                            active[8]=1;
                            ends[8]=1;
                            break RUN;
                          }
                        }
                        else {
                          active[8]=1;
                          ends[8]=1;
                          break RUN;
                        }
                      }
                    
                  }
                  break;
                
                case 1 : 
                  switch(S9880){
                    case 0 : 
                      switch(S9776){
                        case 0 : 
                          if(!fillerStatus_o.isPartnerPresent() || fillerStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 117, column: 6
                            fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 117, column: 6
                            S9776=1;
                            active[8]=1;
                            ends[8]=1;
                            break RUN;
                          }
                          else {
                            switch(S9771){
                              case 0 : 
                                if(fillerStatus_o.isACK()){//sysj\controller.sysj line: 117, column: 6
                                  fillerStatus_o.setVal("busy");//sysj\controller.sysj line: 117, column: 6
                                  S9771=1;
                                  if(!fillerStatus_o.isACK()){//sysj\controller.sysj line: 117, column: 6
                                    fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 117, column: 6
                                    ends[8]=2;
                                    ;//sysj\controller.sysj line: 117, column: 6
                                    S9880=1;
                                    S9798=0;
                                    if(!percentLiquid_in.isPartnerPresent() || percentLiquid_in.isPartnerPreempted()){//sysj\controller.sysj line: 118, column: 6
                                      percentLiquid_in.setACK(false);//sysj\controller.sysj line: 118, column: 6
                                      S9798=1;
                                      active[8]=1;
                                      ends[8]=1;
                                      break RUN;
                                    }
                                    else {
                                      S9793=0;
                                      if(!percentLiquid_in.isREQ()){//sysj\controller.sysj line: 118, column: 6
                                        percentLiquid_in.setACK(true);//sysj\controller.sysj line: 118, column: 6
                                        S9793=1;
                                        if(percentLiquid_in.isREQ()){//sysj\controller.sysj line: 118, column: 6
                                          percentLiquid_in.setACK(false);//sysj\controller.sysj line: 118, column: 6
                                          ends[8]=2;
                                          ;//sysj\controller.sysj line: 118, column: 6
                                          recPercentLiq_thread_8 = (ArrayList)(percentLiquid_in.getVal() == null ? null : ((ArrayList)percentLiquid_in.getVal()));//sysj\controller.sysj line: 119, column: 6
                                          canisterNum_thread_8 = 1;//sysj\controller.sysj line: 120, column: 6
                                          S9880=2;
                                          if(canisterNum_thread_8 < 5){//sysj\controller.sysj line: 122, column: 12
                                            S9907=0;
                                            selectCanister.setPresent();//sysj\controller.sysj line: 126, column: 9
                                            currsigs.addElement(selectCanister);
                                            selectCanister.setValue(canisterNum_thread_8);//sysj\controller.sysj line: 126, column: 9
                                            active[8]=1;
                                            ends[8]=1;
                                            break RUN;
                                          }
                                          else {
                                            ends[8]=2;
                                            ;//sysj\controller.sysj line: 122, column: 6
                                            S9880=3;
                                            S11009=0;
                                            if(!fillerStatus_o.isPartnerPresent() || fillerStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 154, column: 6
                                              fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 154, column: 6
                                              S11009=1;
                                              active[8]=1;
                                              ends[8]=1;
                                              break RUN;
                                            }
                                            else {
                                              S11004=0;
                                              if(fillerStatus_o.isACK()){//sysj\controller.sysj line: 154, column: 6
                                                fillerStatus_o.setVal("done");//sysj\controller.sysj line: 154, column: 6
                                                S11004=1;
                                                if(!fillerStatus_o.isACK()){//sysj\controller.sysj line: 154, column: 6
                                                  fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 154, column: 6
                                                  ends[8]=2;
                                                  ;//sysj\controller.sysj line: 154, column: 6
                                                  S9746=2;
                                                  active[8]=1;
                                                  ends[8]=1;
                                                  break RUN;
                                                }
                                                else {
                                                  active[8]=1;
                                                  ends[8]=1;
                                                  break RUN;
                                                }
                                              }
                                              else {
                                                active[8]=1;
                                                ends[8]=1;
                                                break RUN;
                                              }
                                            }
                                          }
                                        }
                                        else {
                                          active[8]=1;
                                          ends[8]=1;
                                          break RUN;
                                        }
                                      }
                                      else {
                                        active[8]=1;
                                        ends[8]=1;
                                        break RUN;
                                      }
                                    }
                                  }
                                  else {
                                    active[8]=1;
                                    ends[8]=1;
                                    break RUN;
                                  }
                                }
                                else {
                                  active[8]=1;
                                  ends[8]=1;
                                  break RUN;
                                }
                              
                              case 1 : 
                                if(!fillerStatus_o.isACK()){//sysj\controller.sysj line: 117, column: 6
                                  fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 117, column: 6
                                  ends[8]=2;
                                  ;//sysj\controller.sysj line: 117, column: 6
                                  S9880=1;
                                  S9798=0;
                                  if(!percentLiquid_in.isPartnerPresent() || percentLiquid_in.isPartnerPreempted()){//sysj\controller.sysj line: 118, column: 6
                                    percentLiquid_in.setACK(false);//sysj\controller.sysj line: 118, column: 6
                                    S9798=1;
                                    active[8]=1;
                                    ends[8]=1;
                                    break RUN;
                                  }
                                  else {
                                    S9793=0;
                                    if(!percentLiquid_in.isREQ()){//sysj\controller.sysj line: 118, column: 6
                                      percentLiquid_in.setACK(true);//sysj\controller.sysj line: 118, column: 6
                                      S9793=1;
                                      if(percentLiquid_in.isREQ()){//sysj\controller.sysj line: 118, column: 6
                                        percentLiquid_in.setACK(false);//sysj\controller.sysj line: 118, column: 6
                                        ends[8]=2;
                                        ;//sysj\controller.sysj line: 118, column: 6
                                        recPercentLiq_thread_8 = (ArrayList)(percentLiquid_in.getVal() == null ? null : ((ArrayList)percentLiquid_in.getVal()));//sysj\controller.sysj line: 119, column: 6
                                        canisterNum_thread_8 = 1;//sysj\controller.sysj line: 120, column: 6
                                        S9880=2;
                                        if(canisterNum_thread_8 < 5){//sysj\controller.sysj line: 122, column: 12
                                          S9907=0;
                                          selectCanister.setPresent();//sysj\controller.sysj line: 126, column: 9
                                          currsigs.addElement(selectCanister);
                                          selectCanister.setValue(canisterNum_thread_8);//sysj\controller.sysj line: 126, column: 9
                                          active[8]=1;
                                          ends[8]=1;
                                          break RUN;
                                        }
                                        else {
                                          ends[8]=2;
                                          ;//sysj\controller.sysj line: 122, column: 6
                                          S9880=3;
                                          S11009=0;
                                          if(!fillerStatus_o.isPartnerPresent() || fillerStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 154, column: 6
                                            fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 154, column: 6
                                            S11009=1;
                                            active[8]=1;
                                            ends[8]=1;
                                            break RUN;
                                          }
                                          else {
                                            S11004=0;
                                            if(fillerStatus_o.isACK()){//sysj\controller.sysj line: 154, column: 6
                                              fillerStatus_o.setVal("done");//sysj\controller.sysj line: 154, column: 6
                                              S11004=1;
                                              if(!fillerStatus_o.isACK()){//sysj\controller.sysj line: 154, column: 6
                                                fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 154, column: 6
                                                ends[8]=2;
                                                ;//sysj\controller.sysj line: 154, column: 6
                                                S9746=2;
                                                active[8]=1;
                                                ends[8]=1;
                                                break RUN;
                                              }
                                              else {
                                                active[8]=1;
                                                ends[8]=1;
                                                break RUN;
                                              }
                                            }
                                            else {
                                              active[8]=1;
                                              ends[8]=1;
                                              break RUN;
                                            }
                                          }
                                        }
                                      }
                                      else {
                                        active[8]=1;
                                        ends[8]=1;
                                        break RUN;
                                      }
                                    }
                                    else {
                                      active[8]=1;
                                      ends[8]=1;
                                      break RUN;
                                    }
                                  }
                                }
                                else {
                                  active[8]=1;
                                  ends[8]=1;
                                  break RUN;
                                }
                              
                            }
                          }
                          break;
                        
                        case 1 : 
                          S9776=1;
                          S9776=0;
                          if(!fillerStatus_o.isPartnerPresent() || fillerStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 117, column: 6
                            fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 117, column: 6
                            S9776=1;
                            active[8]=1;
                            ends[8]=1;
                            break RUN;
                          }
                          else {
                            S9771=0;
                            if(fillerStatus_o.isACK()){//sysj\controller.sysj line: 117, column: 6
                              fillerStatus_o.setVal("busy");//sysj\controller.sysj line: 117, column: 6
                              S9771=1;
                              if(!fillerStatus_o.isACK()){//sysj\controller.sysj line: 117, column: 6
                                fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 117, column: 6
                                ends[8]=2;
                                ;//sysj\controller.sysj line: 117, column: 6
                                S9880=1;
                                S9798=0;
                                if(!percentLiquid_in.isPartnerPresent() || percentLiquid_in.isPartnerPreempted()){//sysj\controller.sysj line: 118, column: 6
                                  percentLiquid_in.setACK(false);//sysj\controller.sysj line: 118, column: 6
                                  S9798=1;
                                  active[8]=1;
                                  ends[8]=1;
                                  break RUN;
                                }
                                else {
                                  S9793=0;
                                  if(!percentLiquid_in.isREQ()){//sysj\controller.sysj line: 118, column: 6
                                    percentLiquid_in.setACK(true);//sysj\controller.sysj line: 118, column: 6
                                    S9793=1;
                                    if(percentLiquid_in.isREQ()){//sysj\controller.sysj line: 118, column: 6
                                      percentLiquid_in.setACK(false);//sysj\controller.sysj line: 118, column: 6
                                      ends[8]=2;
                                      ;//sysj\controller.sysj line: 118, column: 6
                                      recPercentLiq_thread_8 = (ArrayList)(percentLiquid_in.getVal() == null ? null : ((ArrayList)percentLiquid_in.getVal()));//sysj\controller.sysj line: 119, column: 6
                                      canisterNum_thread_8 = 1;//sysj\controller.sysj line: 120, column: 6
                                      S9880=2;
                                      if(canisterNum_thread_8 < 5){//sysj\controller.sysj line: 122, column: 12
                                        S9907=0;
                                        selectCanister.setPresent();//sysj\controller.sysj line: 126, column: 9
                                        currsigs.addElement(selectCanister);
                                        selectCanister.setValue(canisterNum_thread_8);//sysj\controller.sysj line: 126, column: 9
                                        active[8]=1;
                                        ends[8]=1;
                                        break RUN;
                                      }
                                      else {
                                        ends[8]=2;
                                        ;//sysj\controller.sysj line: 122, column: 6
                                        S9880=3;
                                        S11009=0;
                                        if(!fillerStatus_o.isPartnerPresent() || fillerStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 154, column: 6
                                          fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 154, column: 6
                                          S11009=1;
                                          active[8]=1;
                                          ends[8]=1;
                                          break RUN;
                                        }
                                        else {
                                          S11004=0;
                                          if(fillerStatus_o.isACK()){//sysj\controller.sysj line: 154, column: 6
                                            fillerStatus_o.setVal("done");//sysj\controller.sysj line: 154, column: 6
                                            S11004=1;
                                            if(!fillerStatus_o.isACK()){//sysj\controller.sysj line: 154, column: 6
                                              fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 154, column: 6
                                              ends[8]=2;
                                              ;//sysj\controller.sysj line: 154, column: 6
                                              S9746=2;
                                              active[8]=1;
                                              ends[8]=1;
                                              break RUN;
                                            }
                                            else {
                                              active[8]=1;
                                              ends[8]=1;
                                              break RUN;
                                            }
                                          }
                                          else {
                                            active[8]=1;
                                            ends[8]=1;
                                            break RUN;
                                          }
                                        }
                                      }
                                    }
                                    else {
                                      active[8]=1;
                                      ends[8]=1;
                                      break RUN;
                                    }
                                  }
                                  else {
                                    active[8]=1;
                                    ends[8]=1;
                                    break RUN;
                                  }
                                }
                              }
                              else {
                                active[8]=1;
                                ends[8]=1;
                                break RUN;
                              }
                            }
                            else {
                              active[8]=1;
                              ends[8]=1;
                              break RUN;
                            }
                          }
                        
                      }
                      break;
                    
                    case 1 : 
                      switch(S9798){
                        case 0 : 
                          if(!percentLiquid_in.isPartnerPresent() || percentLiquid_in.isPartnerPreempted()){//sysj\controller.sysj line: 118, column: 6
                            percentLiquid_in.setACK(false);//sysj\controller.sysj line: 118, column: 6
                            S9798=1;
                            active[8]=1;
                            ends[8]=1;
                            break RUN;
                          }
                          else {
                            switch(S9793){
                              case 0 : 
                                if(!percentLiquid_in.isREQ()){//sysj\controller.sysj line: 118, column: 6
                                  percentLiquid_in.setACK(true);//sysj\controller.sysj line: 118, column: 6
                                  S9793=1;
                                  if(percentLiquid_in.isREQ()){//sysj\controller.sysj line: 118, column: 6
                                    percentLiquid_in.setACK(false);//sysj\controller.sysj line: 118, column: 6
                                    ends[8]=2;
                                    ;//sysj\controller.sysj line: 118, column: 6
                                    recPercentLiq_thread_8 = (ArrayList)(percentLiquid_in.getVal() == null ? null : ((ArrayList)percentLiquid_in.getVal()));//sysj\controller.sysj line: 119, column: 6
                                    canisterNum_thread_8 = 1;//sysj\controller.sysj line: 120, column: 6
                                    S9880=2;
                                    if(canisterNum_thread_8 < 5){//sysj\controller.sysj line: 122, column: 12
                                      S9907=0;
                                      selectCanister.setPresent();//sysj\controller.sysj line: 126, column: 9
                                      currsigs.addElement(selectCanister);
                                      selectCanister.setValue(canisterNum_thread_8);//sysj\controller.sysj line: 126, column: 9
                                      active[8]=1;
                                      ends[8]=1;
                                      break RUN;
                                    }
                                    else {
                                      ends[8]=2;
                                      ;//sysj\controller.sysj line: 122, column: 6
                                      S9880=3;
                                      S11009=0;
                                      if(!fillerStatus_o.isPartnerPresent() || fillerStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 154, column: 6
                                        fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 154, column: 6
                                        S11009=1;
                                        active[8]=1;
                                        ends[8]=1;
                                        break RUN;
                                      }
                                      else {
                                        S11004=0;
                                        if(fillerStatus_o.isACK()){//sysj\controller.sysj line: 154, column: 6
                                          fillerStatus_o.setVal("done");//sysj\controller.sysj line: 154, column: 6
                                          S11004=1;
                                          if(!fillerStatus_o.isACK()){//sysj\controller.sysj line: 154, column: 6
                                            fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 154, column: 6
                                            ends[8]=2;
                                            ;//sysj\controller.sysj line: 154, column: 6
                                            S9746=2;
                                            active[8]=1;
                                            ends[8]=1;
                                            break RUN;
                                          }
                                          else {
                                            active[8]=1;
                                            ends[8]=1;
                                            break RUN;
                                          }
                                        }
                                        else {
                                          active[8]=1;
                                          ends[8]=1;
                                          break RUN;
                                        }
                                      }
                                    }
                                  }
                                  else {
                                    active[8]=1;
                                    ends[8]=1;
                                    break RUN;
                                  }
                                }
                                else {
                                  active[8]=1;
                                  ends[8]=1;
                                  break RUN;
                                }
                              
                              case 1 : 
                                if(percentLiquid_in.isREQ()){//sysj\controller.sysj line: 118, column: 6
                                  percentLiquid_in.setACK(false);//sysj\controller.sysj line: 118, column: 6
                                  ends[8]=2;
                                  ;//sysj\controller.sysj line: 118, column: 6
                                  recPercentLiq_thread_8 = (ArrayList)(percentLiquid_in.getVal() == null ? null : ((ArrayList)percentLiquid_in.getVal()));//sysj\controller.sysj line: 119, column: 6
                                  canisterNum_thread_8 = 1;//sysj\controller.sysj line: 120, column: 6
                                  S9880=2;
                                  if(canisterNum_thread_8 < 5){//sysj\controller.sysj line: 122, column: 12
                                    S9907=0;
                                    selectCanister.setPresent();//sysj\controller.sysj line: 126, column: 9
                                    currsigs.addElement(selectCanister);
                                    selectCanister.setValue(canisterNum_thread_8);//sysj\controller.sysj line: 126, column: 9
                                    active[8]=1;
                                    ends[8]=1;
                                    break RUN;
                                  }
                                  else {
                                    ends[8]=2;
                                    ;//sysj\controller.sysj line: 122, column: 6
                                    S9880=3;
                                    S11009=0;
                                    if(!fillerStatus_o.isPartnerPresent() || fillerStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 154, column: 6
                                      fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 154, column: 6
                                      S11009=1;
                                      active[8]=1;
                                      ends[8]=1;
                                      break RUN;
                                    }
                                    else {
                                      S11004=0;
                                      if(fillerStatus_o.isACK()){//sysj\controller.sysj line: 154, column: 6
                                        fillerStatus_o.setVal("done");//sysj\controller.sysj line: 154, column: 6
                                        S11004=1;
                                        if(!fillerStatus_o.isACK()){//sysj\controller.sysj line: 154, column: 6
                                          fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 154, column: 6
                                          ends[8]=2;
                                          ;//sysj\controller.sysj line: 154, column: 6
                                          S9746=2;
                                          active[8]=1;
                                          ends[8]=1;
                                          break RUN;
                                        }
                                        else {
                                          active[8]=1;
                                          ends[8]=1;
                                          break RUN;
                                        }
                                      }
                                      else {
                                        active[8]=1;
                                        ends[8]=1;
                                        break RUN;
                                      }
                                    }
                                  }
                                }
                                else {
                                  active[8]=1;
                                  ends[8]=1;
                                  break RUN;
                                }
                              
                            }
                          }
                          break;
                        
                        case 1 : 
                          S9798=1;
                          S9798=0;
                          if(!percentLiquid_in.isPartnerPresent() || percentLiquid_in.isPartnerPreempted()){//sysj\controller.sysj line: 118, column: 6
                            percentLiquid_in.setACK(false);//sysj\controller.sysj line: 118, column: 6
                            S9798=1;
                            active[8]=1;
                            ends[8]=1;
                            break RUN;
                          }
                          else {
                            S9793=0;
                            if(!percentLiquid_in.isREQ()){//sysj\controller.sysj line: 118, column: 6
                              percentLiquid_in.setACK(true);//sysj\controller.sysj line: 118, column: 6
                              S9793=1;
                              if(percentLiquid_in.isREQ()){//sysj\controller.sysj line: 118, column: 6
                                percentLiquid_in.setACK(false);//sysj\controller.sysj line: 118, column: 6
                                ends[8]=2;
                                ;//sysj\controller.sysj line: 118, column: 6
                                recPercentLiq_thread_8 = (ArrayList)(percentLiquid_in.getVal() == null ? null : ((ArrayList)percentLiquid_in.getVal()));//sysj\controller.sysj line: 119, column: 6
                                canisterNum_thread_8 = 1;//sysj\controller.sysj line: 120, column: 6
                                S9880=2;
                                if(canisterNum_thread_8 < 5){//sysj\controller.sysj line: 122, column: 12
                                  S9907=0;
                                  selectCanister.setPresent();//sysj\controller.sysj line: 126, column: 9
                                  currsigs.addElement(selectCanister);
                                  selectCanister.setValue(canisterNum_thread_8);//sysj\controller.sysj line: 126, column: 9
                                  active[8]=1;
                                  ends[8]=1;
                                  break RUN;
                                }
                                else {
                                  ends[8]=2;
                                  ;//sysj\controller.sysj line: 122, column: 6
                                  S9880=3;
                                  S11009=0;
                                  if(!fillerStatus_o.isPartnerPresent() || fillerStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 154, column: 6
                                    fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 154, column: 6
                                    S11009=1;
                                    active[8]=1;
                                    ends[8]=1;
                                    break RUN;
                                  }
                                  else {
                                    S11004=0;
                                    if(fillerStatus_o.isACK()){//sysj\controller.sysj line: 154, column: 6
                                      fillerStatus_o.setVal("done");//sysj\controller.sysj line: 154, column: 6
                                      S11004=1;
                                      if(!fillerStatus_o.isACK()){//sysj\controller.sysj line: 154, column: 6
                                        fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 154, column: 6
                                        ends[8]=2;
                                        ;//sysj\controller.sysj line: 154, column: 6
                                        S9746=2;
                                        active[8]=1;
                                        ends[8]=1;
                                        break RUN;
                                      }
                                      else {
                                        active[8]=1;
                                        ends[8]=1;
                                        break RUN;
                                      }
                                    }
                                    else {
                                      active[8]=1;
                                      ends[8]=1;
                                      break RUN;
                                    }
                                  }
                                }
                              }
                              else {
                                active[8]=1;
                                ends[8]=1;
                                break RUN;
                              }
                            }
                            else {
                              active[8]=1;
                              ends[8]=1;
                              break RUN;
                            }
                          }
                        
                      }
                      break;
                    
                    case 2 : 
                      switch(S9907){
                        case 0 : 
                          if(selectedCanister.getprestatus()){//sysj\controller.sysj line: 125, column: 13
                            S9907=1;
                            thread104655(tdone,ends);
                            thread104656(tdone,ends);
                            int biggest104657 = 0;
                            if(ends[9]>=biggest104657){
                              biggest104657=ends[9];
                            }
                            if(ends[10]>=biggest104657){
                              biggest104657=ends[10];
                            }
                            if(biggest104657 == 1){
                              active[8]=1;
                              ends[8]=1;
                              break RUN;
                            }
                          }
                          else {
                            selectCanister.setPresent();//sysj\controller.sysj line: 126, column: 9
                            currsigs.addElement(selectCanister);
                            selectCanister.setValue(canisterNum_thread_8);//sysj\controller.sysj line: 126, column: 9
                            active[8]=1;
                            ends[8]=1;
                            break RUN;
                          }
                        
                        case 1 : 
                          if(!dosUnitEvac.getprestatus()){//sysj\controller.sysj line: 130, column: 14
                            System.out.println("Canister above bottle");//sysj\controller.sysj line: 133, column: 8
                            receivedPercentage.setPresent();//sysj\controller.sysj line: 137, column: 8
                            currsigs.addElement(receivedPercentage);
                            receivedPercentage.setValue(recPercentLiq_thread_8.get(canisterNum_thread_8 - 1));//sysj\controller.sysj line: 137, column: 8
                            S9907=2;
                            valveInletOnOff.setPresent();//sysj\controller.sysj line: 141, column: 9
                            currsigs.addElement(valveInletOnOff);
                            active[8]=1;
                            ends[8]=1;
                            break RUN;
                          }
                          else {
                            thread104658(tdone,ends);
                            thread104659(tdone,ends);
                            int biggest104660 = 0;
                            if(ends[9]>=biggest104660){
                              biggest104660=ends[9];
                            }
                            if(ends[10]>=biggest104660){
                              biggest104660=ends[10];
                            }
                            if(biggest104660 == 1){
                              active[8]=1;
                              ends[8]=1;
                              break RUN;
                            }
                            //FINXME code
                            if(biggest104660 == 0){
                              System.out.println("Canister above bottle");//sysj\controller.sysj line: 133, column: 8
                              receivedPercentage.setPresent();//sysj\controller.sysj line: 137, column: 8
                              currsigs.addElement(receivedPercentage);
                              receivedPercentage.setValue(recPercentLiq_thread_8.get(canisterNum_thread_8 - 1));//sysj\controller.sysj line: 137, column: 8
                              S9907=2;
                              valveInletOnOff.setPresent();//sysj\controller.sysj line: 141, column: 9
                              currsigs.addElement(valveInletOnOff);
                              active[8]=1;
                              ends[8]=1;
                              break RUN;
                            }
                          }
                        
                        case 2 : 
                          if(dosUnitFilled.getprestatus()){//sysj\controller.sysj line: 140, column: 14
                            System.out.println("Bottle controller filled");//sysj\controller.sysj line: 144, column: 8
                            S9907=3;
                            thread104661(tdone,ends);
                            thread104662(tdone,ends);
                            int biggest104663 = 0;
                            if(ends[11]>=biggest104663){
                              biggest104663=ends[11];
                            }
                            if(ends[12]>=biggest104663){
                              biggest104663=ends[12];
                            }
                            if(biggest104663 == 1){
                              active[8]=1;
                              ends[8]=1;
                              break RUN;
                            }
                          }
                          else {
                            valveInletOnOff.setPresent();//sysj\controller.sysj line: 141, column: 9
                            currsigs.addElement(valveInletOnOff);
                            active[8]=1;
                            ends[8]=1;
                            break RUN;
                          }
                        
                        case 3 : 
                          if(dosUnitEvac.getprestatus()){//sysj\controller.sysj line: 146, column: 14
                            System.out.println("Canister returned");//sysj\controller.sysj line: 149, column: 8
                            canisterNum_thread_8 += 1;//sysj\controller.sysj line: 151, column: 8
                            S9907=4;
                            active[8]=1;
                            ends[8]=1;
                            break RUN;
                          }
                          else {
                            thread104664(tdone,ends);
                            thread104665(tdone,ends);
                            int biggest104666 = 0;
                            if(ends[11]>=biggest104666){
                              biggest104666=ends[11];
                            }
                            if(ends[12]>=biggest104666){
                              biggest104666=ends[12];
                            }
                            if(biggest104666 == 1){
                              active[8]=1;
                              ends[8]=1;
                              break RUN;
                            }
                            //FINXME code
                            if(biggest104666 == 0){
                              System.out.println("Canister returned");//sysj\controller.sysj line: 149, column: 8
                              canisterNum_thread_8 += 1;//sysj\controller.sysj line: 151, column: 8
                              S9907=4;
                              active[8]=1;
                              ends[8]=1;
                              break RUN;
                            }
                          }
                        
                        case 4 : 
                          S9907=4;
                          if(canisterNum_thread_8 < 5){//sysj\controller.sysj line: 122, column: 12
                            S9907=0;
                            selectCanister.setPresent();//sysj\controller.sysj line: 126, column: 9
                            currsigs.addElement(selectCanister);
                            selectCanister.setValue(canisterNum_thread_8);//sysj\controller.sysj line: 126, column: 9
                            active[8]=1;
                            ends[8]=1;
                            break RUN;
                          }
                          else {
                            ends[8]=2;
                            ;//sysj\controller.sysj line: 122, column: 6
                            S9880=3;
                            S11009=0;
                            if(!fillerStatus_o.isPartnerPresent() || fillerStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 154, column: 6
                              fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 154, column: 6
                              S11009=1;
                              active[8]=1;
                              ends[8]=1;
                              break RUN;
                            }
                            else {
                              S11004=0;
                              if(fillerStatus_o.isACK()){//sysj\controller.sysj line: 154, column: 6
                                fillerStatus_o.setVal("done");//sysj\controller.sysj line: 154, column: 6
                                S11004=1;
                                if(!fillerStatus_o.isACK()){//sysj\controller.sysj line: 154, column: 6
                                  fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 154, column: 6
                                  ends[8]=2;
                                  ;//sysj\controller.sysj line: 154, column: 6
                                  S9746=2;
                                  active[8]=1;
                                  ends[8]=1;
                                  break RUN;
                                }
                                else {
                                  active[8]=1;
                                  ends[8]=1;
                                  break RUN;
                                }
                              }
                              else {
                                active[8]=1;
                                ends[8]=1;
                                break RUN;
                              }
                            }
                          }
                        
                      }
                      break;
                    
                    case 3 : 
                      switch(S11009){
                        case 0 : 
                          if(!fillerStatus_o.isPartnerPresent() || fillerStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 154, column: 6
                            fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 154, column: 6
                            S11009=1;
                            active[8]=1;
                            ends[8]=1;
                            break RUN;
                          }
                          else {
                            switch(S11004){
                              case 0 : 
                                if(fillerStatus_o.isACK()){//sysj\controller.sysj line: 154, column: 6
                                  fillerStatus_o.setVal("done");//sysj\controller.sysj line: 154, column: 6
                                  S11004=1;
                                  if(!fillerStatus_o.isACK()){//sysj\controller.sysj line: 154, column: 6
                                    fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 154, column: 6
                                    ends[8]=2;
                                    ;//sysj\controller.sysj line: 154, column: 6
                                    S9746=2;
                                    active[8]=1;
                                    ends[8]=1;
                                    break RUN;
                                  }
                                  else {
                                    active[8]=1;
                                    ends[8]=1;
                                    break RUN;
                                  }
                                }
                                else {
                                  active[8]=1;
                                  ends[8]=1;
                                  break RUN;
                                }
                              
                              case 1 : 
                                if(!fillerStatus_o.isACK()){//sysj\controller.sysj line: 154, column: 6
                                  fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 154, column: 6
                                  ends[8]=2;
                                  ;//sysj\controller.sysj line: 154, column: 6
                                  S9746=2;
                                  active[8]=1;
                                  ends[8]=1;
                                  break RUN;
                                }
                                else {
                                  active[8]=1;
                                  ends[8]=1;
                                  break RUN;
                                }
                              
                            }
                          }
                          break;
                        
                        case 1 : 
                          S11009=1;
                          S11009=0;
                          if(!fillerStatus_o.isPartnerPresent() || fillerStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 154, column: 6
                            fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 154, column: 6
                            S11009=1;
                            active[8]=1;
                            ends[8]=1;
                            break RUN;
                          }
                          else {
                            S11004=0;
                            if(fillerStatus_o.isACK()){//sysj\controller.sysj line: 154, column: 6
                              fillerStatus_o.setVal("done");//sysj\controller.sysj line: 154, column: 6
                              S11004=1;
                              if(!fillerStatus_o.isACK()){//sysj\controller.sysj line: 154, column: 6
                                fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 154, column: 6
                                ends[8]=2;
                                ;//sysj\controller.sysj line: 154, column: 6
                                S9746=2;
                                active[8]=1;
                                ends[8]=1;
                                break RUN;
                              }
                              else {
                                active[8]=1;
                                ends[8]=1;
                                break RUN;
                              }
                            }
                            else {
                              active[8]=1;
                              ends[8]=1;
                              break RUN;
                            }
                          }
                        
                      }
                      break;
                    
                  }
                  break;
                
              }
              break;
            
            case 2 : 
              S9746=2;
              S9746=0;
              S9730=0;
              if(!fillerReq_in.isPartnerPresent() || fillerReq_in.isPartnerPreempted()){//sysj\controller.sysj line: 106, column: 3
                fillerReq_in.setACK(false);//sysj\controller.sysj line: 106, column: 3
                S9730=1;
                active[8]=1;
                ends[8]=1;
                break RUN;
              }
              else {
                S9725=0;
                if(!fillerReq_in.isREQ()){//sysj\controller.sysj line: 106, column: 3
                  fillerReq_in.setACK(true);//sysj\controller.sysj line: 106, column: 3
                  S9725=1;
                  if(fillerReq_in.isREQ()){//sysj\controller.sysj line: 106, column: 3
                    fillerReq_in.setACK(false);//sysj\controller.sysj line: 106, column: 3
                    ends[8]=2;
                    ;//sysj\controller.sysj line: 106, column: 3
                    request_thread_8 = (fillerReq_in.getVal() == null ? null : ((Boolean)fillerReq_in.getVal()));//sysj\controller.sysj line: 107, column: 3
                    S9746=1;
                    if(request_thread_8){//sysj\controller.sysj line: 109, column: 3
                      S16710=0;
                      if(!bottleAtPos2.getprestatus()){//sysj\controller.sysj line: 111, column: 13
                        S9753=0;
                        if(!fillerStatus_o.isPartnerPresent() || fillerStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 112, column: 6
                          fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 112, column: 6
                          S9753=1;
                          active[8]=1;
                          ends[8]=1;
                          break RUN;
                        }
                        else {
                          S9748=0;
                          if(fillerStatus_o.isACK()){//sysj\controller.sysj line: 112, column: 6
                            fillerStatus_o.setVal("idle");//sysj\controller.sysj line: 112, column: 6
                            S9748=1;
                            if(!fillerStatus_o.isACK()){//sysj\controller.sysj line: 112, column: 6
                              fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 112, column: 6
                              ends[8]=2;
                              ;//sysj\controller.sysj line: 112, column: 6
                              S16710=1;
                              if(bottleAtPos2.getprestatus()){//sysj\controller.sysj line: 116, column: 13
                                S9880=0;
                                S9776=0;
                                if(!fillerStatus_o.isPartnerPresent() || fillerStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 117, column: 6
                                  fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 117, column: 6
                                  S9776=1;
                                  active[8]=1;
                                  ends[8]=1;
                                  break RUN;
                                }
                                else {
                                  S9771=0;
                                  if(fillerStatus_o.isACK()){//sysj\controller.sysj line: 117, column: 6
                                    fillerStatus_o.setVal("busy");//sysj\controller.sysj line: 117, column: 6
                                    S9771=1;
                                    if(!fillerStatus_o.isACK()){//sysj\controller.sysj line: 117, column: 6
                                      fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 117, column: 6
                                      ends[8]=2;
                                      ;//sysj\controller.sysj line: 117, column: 6
                                      S9880=1;
                                      S9798=0;
                                      if(!percentLiquid_in.isPartnerPresent() || percentLiquid_in.isPartnerPreempted()){//sysj\controller.sysj line: 118, column: 6
                                        percentLiquid_in.setACK(false);//sysj\controller.sysj line: 118, column: 6
                                        S9798=1;
                                        active[8]=1;
                                        ends[8]=1;
                                        break RUN;
                                      }
                                      else {
                                        S9793=0;
                                        if(!percentLiquid_in.isREQ()){//sysj\controller.sysj line: 118, column: 6
                                          percentLiquid_in.setACK(true);//sysj\controller.sysj line: 118, column: 6
                                          S9793=1;
                                          if(percentLiquid_in.isREQ()){//sysj\controller.sysj line: 118, column: 6
                                            percentLiquid_in.setACK(false);//sysj\controller.sysj line: 118, column: 6
                                            ends[8]=2;
                                            ;//sysj\controller.sysj line: 118, column: 6
                                            recPercentLiq_thread_8 = (ArrayList)(percentLiquid_in.getVal() == null ? null : ((ArrayList)percentLiquid_in.getVal()));//sysj\controller.sysj line: 119, column: 6
                                            canisterNum_thread_8 = 1;//sysj\controller.sysj line: 120, column: 6
                                            S9880=2;
                                            if(canisterNum_thread_8 < 5){//sysj\controller.sysj line: 122, column: 12
                                              S9907=0;
                                              selectCanister.setPresent();//sysj\controller.sysj line: 126, column: 9
                                              currsigs.addElement(selectCanister);
                                              selectCanister.setValue(canisterNum_thread_8);//sysj\controller.sysj line: 126, column: 9
                                              active[8]=1;
                                              ends[8]=1;
                                              break RUN;
                                            }
                                            else {
                                              ends[8]=2;
                                              ;//sysj\controller.sysj line: 122, column: 6
                                              S9880=3;
                                              S11009=0;
                                              if(!fillerStatus_o.isPartnerPresent() || fillerStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 154, column: 6
                                                fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 154, column: 6
                                                S11009=1;
                                                active[8]=1;
                                                ends[8]=1;
                                                break RUN;
                                              }
                                              else {
                                                S11004=0;
                                                if(fillerStatus_o.isACK()){//sysj\controller.sysj line: 154, column: 6
                                                  fillerStatus_o.setVal("done");//sysj\controller.sysj line: 154, column: 6
                                                  S11004=1;
                                                  if(!fillerStatus_o.isACK()){//sysj\controller.sysj line: 154, column: 6
                                                    fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 154, column: 6
                                                    ends[8]=2;
                                                    ;//sysj\controller.sysj line: 154, column: 6
                                                    S9746=2;
                                                    active[8]=1;
                                                    ends[8]=1;
                                                    break RUN;
                                                  }
                                                  else {
                                                    active[8]=1;
                                                    ends[8]=1;
                                                    break RUN;
                                                  }
                                                }
                                                else {
                                                  active[8]=1;
                                                  ends[8]=1;
                                                  break RUN;
                                                }
                                              }
                                            }
                                          }
                                          else {
                                            active[8]=1;
                                            ends[8]=1;
                                            break RUN;
                                          }
                                        }
                                        else {
                                          active[8]=1;
                                          ends[8]=1;
                                          break RUN;
                                        }
                                      }
                                    }
                                    else {
                                      active[8]=1;
                                      ends[8]=1;
                                      break RUN;
                                    }
                                  }
                                  else {
                                    active[8]=1;
                                    ends[8]=1;
                                    break RUN;
                                  }
                                }
                              }
                              else {
                                S9746=2;
                                active[8]=1;
                                ends[8]=1;
                                break RUN;
                              }
                            }
                            else {
                              active[8]=1;
                              ends[8]=1;
                              break RUN;
                            }
                          }
                          else {
                            active[8]=1;
                            ends[8]=1;
                            break RUN;
                          }
                        }
                      }
                      else {
                        S16710=1;
                        if(bottleAtPos2.getprestatus()){//sysj\controller.sysj line: 116, column: 13
                          S9880=0;
                          S9776=0;
                          if(!fillerStatus_o.isPartnerPresent() || fillerStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 117, column: 6
                            fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 117, column: 6
                            S9776=1;
                            active[8]=1;
                            ends[8]=1;
                            break RUN;
                          }
                          else {
                            S9771=0;
                            if(fillerStatus_o.isACK()){//sysj\controller.sysj line: 117, column: 6
                              fillerStatus_o.setVal("busy");//sysj\controller.sysj line: 117, column: 6
                              S9771=1;
                              if(!fillerStatus_o.isACK()){//sysj\controller.sysj line: 117, column: 6
                                fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 117, column: 6
                                ends[8]=2;
                                ;//sysj\controller.sysj line: 117, column: 6
                                S9880=1;
                                S9798=0;
                                if(!percentLiquid_in.isPartnerPresent() || percentLiquid_in.isPartnerPreempted()){//sysj\controller.sysj line: 118, column: 6
                                  percentLiquid_in.setACK(false);//sysj\controller.sysj line: 118, column: 6
                                  S9798=1;
                                  active[8]=1;
                                  ends[8]=1;
                                  break RUN;
                                }
                                else {
                                  S9793=0;
                                  if(!percentLiquid_in.isREQ()){//sysj\controller.sysj line: 118, column: 6
                                    percentLiquid_in.setACK(true);//sysj\controller.sysj line: 118, column: 6
                                    S9793=1;
                                    if(percentLiquid_in.isREQ()){//sysj\controller.sysj line: 118, column: 6
                                      percentLiquid_in.setACK(false);//sysj\controller.sysj line: 118, column: 6
                                      ends[8]=2;
                                      ;//sysj\controller.sysj line: 118, column: 6
                                      recPercentLiq_thread_8 = (ArrayList)(percentLiquid_in.getVal() == null ? null : ((ArrayList)percentLiquid_in.getVal()));//sysj\controller.sysj line: 119, column: 6
                                      canisterNum_thread_8 = 1;//sysj\controller.sysj line: 120, column: 6
                                      S9880=2;
                                      if(canisterNum_thread_8 < 5){//sysj\controller.sysj line: 122, column: 12
                                        S9907=0;
                                        selectCanister.setPresent();//sysj\controller.sysj line: 126, column: 9
                                        currsigs.addElement(selectCanister);
                                        selectCanister.setValue(canisterNum_thread_8);//sysj\controller.sysj line: 126, column: 9
                                        active[8]=1;
                                        ends[8]=1;
                                        break RUN;
                                      }
                                      else {
                                        ends[8]=2;
                                        ;//sysj\controller.sysj line: 122, column: 6
                                        S9880=3;
                                        S11009=0;
                                        if(!fillerStatus_o.isPartnerPresent() || fillerStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 154, column: 6
                                          fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 154, column: 6
                                          S11009=1;
                                          active[8]=1;
                                          ends[8]=1;
                                          break RUN;
                                        }
                                        else {
                                          S11004=0;
                                          if(fillerStatus_o.isACK()){//sysj\controller.sysj line: 154, column: 6
                                            fillerStatus_o.setVal("done");//sysj\controller.sysj line: 154, column: 6
                                            S11004=1;
                                            if(!fillerStatus_o.isACK()){//sysj\controller.sysj line: 154, column: 6
                                              fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 154, column: 6
                                              ends[8]=2;
                                              ;//sysj\controller.sysj line: 154, column: 6
                                              S9746=2;
                                              active[8]=1;
                                              ends[8]=1;
                                              break RUN;
                                            }
                                            else {
                                              active[8]=1;
                                              ends[8]=1;
                                              break RUN;
                                            }
                                          }
                                          else {
                                            active[8]=1;
                                            ends[8]=1;
                                            break RUN;
                                          }
                                        }
                                      }
                                    }
                                    else {
                                      active[8]=1;
                                      ends[8]=1;
                                      break RUN;
                                    }
                                  }
                                  else {
                                    active[8]=1;
                                    ends[8]=1;
                                    break RUN;
                                  }
                                }
                              }
                              else {
                                active[8]=1;
                                ends[8]=1;
                                break RUN;
                              }
                            }
                            else {
                              active[8]=1;
                              ends[8]=1;
                              break RUN;
                            }
                          }
                        }
                        else {
                          S9746=2;
                          active[8]=1;
                          ends[8]=1;
                          break RUN;
                        }
                      }
                    }
                    else {
                      S9746=2;
                      active[8]=1;
                      ends[8]=1;
                      break RUN;
                    }
                  }
                  else {
                    active[8]=1;
                    ends[8]=1;
                    break RUN;
                  }
                }
                else {
                  active[8]=1;
                  ends[8]=1;
                  break RUN;
                }
              }
            
          }
        
      }
    }
  }

  public void init(){
    char [] active1 = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
    char [] paused1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    char [] suspended1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    paused = paused1;
    active = active1;
    suspended = suspended1;
    // Now instantiate all the local signals ONLY
    // --------------------------------------------------
  }
  
  public void run(){
    while(active[8] != 0){
      int index = 8;
      if(paused[index]==1 || suspended[index]==1 || active[index] == 0){
        for(int h=1;h<paused.length;++h){
          paused[h]=0;
        }
      }
      if(paused[8]!=0 || suspended[8]!=0 || active[8]!=1);
      else{
        if(!df){
          fillerReq_in.gethook();
          percentLiquid_in.gethook();
          fillerStatus_o.gethook();
          bottleAtPos2.gethook();
          dosUnitEvac.gethook();
          dosUnitFilled.gethook();
          selectedCanister.gethook();
          df = true;
        }
        runClockDomain();
      }
      bottleAtPos2.setpreclear();
      dosUnitEvac.setpreclear();
      dosUnitFilled.setpreclear();
      selectedCanister.setpreclear();
      valveInjectorOnOff.setpreclear();
      valveInletOnOff.setpreclear();
      dosUnitValveRetract.setpreclear();
      dosUnitValveExtend.setpreclear();
      selectCanister.setpreclear();
      receivedPercentage.setpreclear();
      int dummyint = 0;
      for(int qw=0;qw<currsigs.size();++qw){
        dummyint = ((Signal)currsigs.elementAt(qw)).getStatus() ? ((Signal)currsigs.elementAt(qw)).setprepresent() : ((Signal)currsigs.elementAt(qw)).setpreclear();
        ((Signal)currsigs.elementAt(qw)).setpreval(((Signal)currsigs.elementAt(qw)).getValue());
      }
      currsigs.removeAllElements();
      dummyint = bottleAtPos2.getStatus() ? bottleAtPos2.setprepresent() : bottleAtPos2.setpreclear();
      bottleAtPos2.setpreval(bottleAtPos2.getValue());
      bottleAtPos2.setClear();
      dummyint = dosUnitEvac.getStatus() ? dosUnitEvac.setprepresent() : dosUnitEvac.setpreclear();
      dosUnitEvac.setpreval(dosUnitEvac.getValue());
      dosUnitEvac.setClear();
      dummyint = dosUnitFilled.getStatus() ? dosUnitFilled.setprepresent() : dosUnitFilled.setpreclear();
      dosUnitFilled.setpreval(dosUnitFilled.getValue());
      dosUnitFilled.setClear();
      dummyint = selectedCanister.getStatus() ? selectedCanister.setprepresent() : selectedCanister.setpreclear();
      selectedCanister.setpreval(selectedCanister.getValue());
      selectedCanister.setClear();
      valveInjectorOnOff.sethook();
      valveInjectorOnOff.setClear();
      valveInletOnOff.sethook();
      valveInletOnOff.setClear();
      dosUnitValveRetract.sethook();
      dosUnitValveRetract.setClear();
      dosUnitValveExtend.sethook();
      dosUnitValveExtend.setClear();
      selectCanister.sethook();
      selectCanister.setClear();
      receivedPercentage.sethook();
      receivedPercentage.setClear();
      fillerReq_in.sethook();
      percentLiquid_in.sethook();
      fillerStatus_o.sethook();
      if(paused[8]!=0 || suspended[8]!=0 || active[8]!=1);
      else{
        fillerReq_in.gethook();
        percentLiquid_in.gethook();
        fillerStatus_o.gethook();
        bottleAtPos2.gethook();
        dosUnitEvac.gethook();
        dosUnitFilled.gethook();
        selectedCanister.gethook();
      }
      runFinisher();
      if(active[8] == 0){
      	this.terminated = true;
      }
      if(!threaded) break;
    }
  }
}
