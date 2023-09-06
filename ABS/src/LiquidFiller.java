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
  private Boolean request_thread_8;//sysj\controller.sysj line: 109, column: 3
  private ArrayList recPercentLiq_thread_8;//sysj\controller.sysj line: 122, column: 6
  private int canisterNum_thread_8;//sysj\controller.sysj line: 123, column: 6
  private int S100538 = 1;
  private int S11270 = 1;
  private int S11254 = 1;
  private int S11249 = 1;
  private int S18704 = 1;
  private int S11277 = 1;
  private int S11272 = 1;
  private int S11338 = 1;
  private int S11300 = 1;
  private int S11295 = 1;
  private int S11345 = 1;
  private int S11340 = 1;
  private int S11457 = 1;
  private int S11439 = 1;
  private int S11444 = 1;
  private int S11474 = 1;
  private int S11479 = 1;
  private int S12627 = 1;
  private int S12622 = 1;
  
  private int[] ends = new int[23];
  private int[] tdone = new int[23];
  
  public void thread116629(int [] tdone, int [] ends){
        switch(S11479){
      case 0 : 
        active[12]=0;
        ends[12]=0;
        tdone[12]=1;
        break;
      
      case 1 : 
        valveInjectorOnOff.setPresent();//sysj\controller.sysj line: 150, column: 43
        currsigs.addElement(valveInjectorOnOff);
        active[12]=1;
        ends[12]=1;
        tdone[12]=1;
        break;
      
    }
  }

  public void thread116628(int [] tdone, int [] ends){
        switch(S11474){
      case 0 : 
        active[11]=0;
        ends[11]=0;
        tdone[11]=1;
        break;
      
      case 1 : 
        dosUnitValveExtend.setPresent();//sysj\controller.sysj line: 150, column: 10
        currsigs.addElement(dosUnitValveExtend);
        active[11]=1;
        ends[11]=1;
        tdone[11]=1;
        break;
      
    }
  }

  public void thread116626(int [] tdone, int [] ends){
        S11479=1;
    valveInjectorOnOff.setPresent();//sysj\controller.sysj line: 150, column: 43
    currsigs.addElement(valveInjectorOnOff);
    active[12]=1;
    ends[12]=1;
    tdone[12]=1;
  }

  public void thread116625(int [] tdone, int [] ends){
        S11474=1;
    dosUnitValveExtend.setPresent();//sysj\controller.sysj line: 150, column: 10
    currsigs.addElement(dosUnitValveExtend);
    active[11]=1;
    ends[11]=1;
    tdone[11]=1;
  }

  public void thread116623(int [] tdone, int [] ends){
        switch(S11444){
      case 0 : 
        active[10]=0;
        ends[10]=0;
        tdone[10]=1;
        break;
      
      case 1 : 
        valveInjectorOnOff.setPresent();//sysj\controller.sysj line: 134, column: 44
        currsigs.addElement(valveInjectorOnOff);
        active[10]=1;
        ends[10]=1;
        tdone[10]=1;
        break;
      
    }
  }

  public void thread116622(int [] tdone, int [] ends){
        switch(S11439){
      case 0 : 
        active[9]=0;
        ends[9]=0;
        tdone[9]=1;
        break;
      
      case 1 : 
        dosUnitValveRetract.setPresent();//sysj\controller.sysj line: 134, column: 10
        currsigs.addElement(dosUnitValveRetract);
        active[9]=1;
        ends[9]=1;
        tdone[9]=1;
        break;
      
    }
  }

  public void thread116620(int [] tdone, int [] ends){
        S11444=1;
    valveInjectorOnOff.setPresent();//sysj\controller.sysj line: 134, column: 44
    currsigs.addElement(valveInjectorOnOff);
    active[10]=1;
    ends[10]=1;
    tdone[10]=1;
  }

  public void thread116619(int [] tdone, int [] ends){
        S11439=1;
    dosUnitValveRetract.setPresent();//sysj\controller.sysj line: 134, column: 10
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
      switch(S100538){
        case 0 : 
          S100538=0;
          break RUN;
        
        case 1 : 
          S100538=2;
          S100538=2;
          S11270=0;
          S11254=0;
          if(!fillerReq_in.isPartnerPresent() || fillerReq_in.isPartnerPreempted()){//sysj\controller.sysj line: 108, column: 3
            fillerReq_in.setACK(false);//sysj\controller.sysj line: 108, column: 3
            S11254=1;
            active[8]=1;
            ends[8]=1;
            break RUN;
          }
          else {
            S11249=0;
            if(!fillerReq_in.isREQ()){//sysj\controller.sysj line: 108, column: 3
              fillerReq_in.setACK(true);//sysj\controller.sysj line: 108, column: 3
              S11249=1;
              if(fillerReq_in.isREQ()){//sysj\controller.sysj line: 108, column: 3
                fillerReq_in.setACK(false);//sysj\controller.sysj line: 108, column: 3
                ends[8]=2;
                ;//sysj\controller.sysj line: 108, column: 3
                request_thread_8 = (fillerReq_in.getVal() == null ? null : ((Boolean)fillerReq_in.getVal()));//sysj\controller.sysj line: 109, column: 3
                S11270=1;
                if(request_thread_8){//sysj\controller.sysj line: 111, column: 3
                  S18704=0;
                  if(!bottleAtPos2.getprestatus()){//sysj\controller.sysj line: 113, column: 13
                    S11277=0;
                    if(!fillerStatus_o.isPartnerPresent() || fillerStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 114, column: 6
                      fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 114, column: 6
                      S11277=1;
                      active[8]=1;
                      ends[8]=1;
                      break RUN;
                    }
                    else {
                      S11272=0;
                      if(fillerStatus_o.isACK()){//sysj\controller.sysj line: 114, column: 6
                        fillerStatus_o.setVal("idle");//sysj\controller.sysj line: 114, column: 6
                        S11272=1;
                        if(!fillerStatus_o.isACK()){//sysj\controller.sysj line: 114, column: 6
                          fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 114, column: 6
                          ends[8]=2;
                          ;//sysj\controller.sysj line: 114, column: 6
                          S18704=1;
                          if(bottleAtPos2.getprestatus()){//sysj\controller.sysj line: 118, column: 13
                            System.out.println("bottle is at pos 2");//sysj\controller.sysj line: 119, column: 6
                            S11338=0;
                            S11300=0;
                            if(!fillerStatus_o.isPartnerPresent() || fillerStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 120, column: 6
                              fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 120, column: 6
                              S11300=1;
                              active[8]=1;
                              ends[8]=1;
                              break RUN;
                            }
                            else {
                              S11295=0;
                              if(fillerStatus_o.isACK()){//sysj\controller.sysj line: 120, column: 6
                                fillerStatus_o.setVal("busy");//sysj\controller.sysj line: 120, column: 6
                                S11295=1;
                                if(!fillerStatus_o.isACK()){//sysj\controller.sysj line: 120, column: 6
                                  fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 120, column: 6
                                  ends[8]=2;
                                  ;//sysj\controller.sysj line: 120, column: 6
                                  S11338=1;
                                  S11345=0;
                                  if(!percentLiquid_in.isPartnerPresent() || percentLiquid_in.isPartnerPreempted()){//sysj\controller.sysj line: 121, column: 6
                                    percentLiquid_in.setACK(false);//sysj\controller.sysj line: 121, column: 6
                                    S11345=1;
                                    active[8]=1;
                                    ends[8]=1;
                                    break RUN;
                                  }
                                  else {
                                    S11340=0;
                                    if(!percentLiquid_in.isREQ()){//sysj\controller.sysj line: 121, column: 6
                                      percentLiquid_in.setACK(true);//sysj\controller.sysj line: 121, column: 6
                                      S11340=1;
                                      if(percentLiquid_in.isREQ()){//sysj\controller.sysj line: 121, column: 6
                                        percentLiquid_in.setACK(false);//sysj\controller.sysj line: 121, column: 6
                                        ends[8]=2;
                                        ;//sysj\controller.sysj line: 121, column: 6
                                        recPercentLiq_thread_8 = (ArrayList)(percentLiquid_in.getVal() == null ? null : ((ArrayList)percentLiquid_in.getVal()));//sysj\controller.sysj line: 122, column: 6
                                        canisterNum_thread_8 = 1;//sysj\controller.sysj line: 123, column: 6
                                        S11338=2;
                                        if(canisterNum_thread_8 < 5){//sysj\controller.sysj line: 125, column: 12
                                          S11457=0;
                                          System.out.println("selecting canister " + canisterNum_thread_8);//sysj\controller.sysj line: 128, column: 8
                                          selectCanister.setPresent();//sysj\controller.sysj line: 129, column: 9
                                          currsigs.addElement(selectCanister);
                                          selectCanister.setValue(canisterNum_thread_8);//sysj\controller.sysj line: 129, column: 9
                                          active[8]=1;
                                          ends[8]=1;
                                          break RUN;
                                        }
                                        else {
                                          ends[8]=2;
                                          ;//sysj\controller.sysj line: 125, column: 6
                                          S11338=3;
                                          S12627=0;
                                          if(!fillerStatus_o.isPartnerPresent() || fillerStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 157, column: 6
                                            fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 157, column: 6
                                            S12627=1;
                                            active[8]=1;
                                            ends[8]=1;
                                            break RUN;
                                          }
                                          else {
                                            S12622=0;
                                            if(fillerStatus_o.isACK()){//sysj\controller.sysj line: 157, column: 6
                                              fillerStatus_o.setVal("done");//sysj\controller.sysj line: 157, column: 6
                                              S12622=1;
                                              if(!fillerStatus_o.isACK()){//sysj\controller.sysj line: 157, column: 6
                                                fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 157, column: 6
                                                ends[8]=2;
                                                ;//sysj\controller.sysj line: 157, column: 6
                                                S11270=2;
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
                            S11270=2;
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
                    S18704=1;
                    if(bottleAtPos2.getprestatus()){//sysj\controller.sysj line: 118, column: 13
                      System.out.println("bottle is at pos 2");//sysj\controller.sysj line: 119, column: 6
                      S11338=0;
                      S11300=0;
                      if(!fillerStatus_o.isPartnerPresent() || fillerStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 120, column: 6
                        fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 120, column: 6
                        S11300=1;
                        active[8]=1;
                        ends[8]=1;
                        break RUN;
                      }
                      else {
                        S11295=0;
                        if(fillerStatus_o.isACK()){//sysj\controller.sysj line: 120, column: 6
                          fillerStatus_o.setVal("busy");//sysj\controller.sysj line: 120, column: 6
                          S11295=1;
                          if(!fillerStatus_o.isACK()){//sysj\controller.sysj line: 120, column: 6
                            fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 120, column: 6
                            ends[8]=2;
                            ;//sysj\controller.sysj line: 120, column: 6
                            S11338=1;
                            S11345=0;
                            if(!percentLiquid_in.isPartnerPresent() || percentLiquid_in.isPartnerPreempted()){//sysj\controller.sysj line: 121, column: 6
                              percentLiquid_in.setACK(false);//sysj\controller.sysj line: 121, column: 6
                              S11345=1;
                              active[8]=1;
                              ends[8]=1;
                              break RUN;
                            }
                            else {
                              S11340=0;
                              if(!percentLiquid_in.isREQ()){//sysj\controller.sysj line: 121, column: 6
                                percentLiquid_in.setACK(true);//sysj\controller.sysj line: 121, column: 6
                                S11340=1;
                                if(percentLiquid_in.isREQ()){//sysj\controller.sysj line: 121, column: 6
                                  percentLiquid_in.setACK(false);//sysj\controller.sysj line: 121, column: 6
                                  ends[8]=2;
                                  ;//sysj\controller.sysj line: 121, column: 6
                                  recPercentLiq_thread_8 = (ArrayList)(percentLiquid_in.getVal() == null ? null : ((ArrayList)percentLiquid_in.getVal()));//sysj\controller.sysj line: 122, column: 6
                                  canisterNum_thread_8 = 1;//sysj\controller.sysj line: 123, column: 6
                                  S11338=2;
                                  if(canisterNum_thread_8 < 5){//sysj\controller.sysj line: 125, column: 12
                                    S11457=0;
                                    System.out.println("selecting canister " + canisterNum_thread_8);//sysj\controller.sysj line: 128, column: 8
                                    selectCanister.setPresent();//sysj\controller.sysj line: 129, column: 9
                                    currsigs.addElement(selectCanister);
                                    selectCanister.setValue(canisterNum_thread_8);//sysj\controller.sysj line: 129, column: 9
                                    active[8]=1;
                                    ends[8]=1;
                                    break RUN;
                                  }
                                  else {
                                    ends[8]=2;
                                    ;//sysj\controller.sysj line: 125, column: 6
                                    S11338=3;
                                    S12627=0;
                                    if(!fillerStatus_o.isPartnerPresent() || fillerStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 157, column: 6
                                      fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 157, column: 6
                                      S12627=1;
                                      active[8]=1;
                                      ends[8]=1;
                                      break RUN;
                                    }
                                    else {
                                      S12622=0;
                                      if(fillerStatus_o.isACK()){//sysj\controller.sysj line: 157, column: 6
                                        fillerStatus_o.setVal("done");//sysj\controller.sysj line: 157, column: 6
                                        S12622=1;
                                        if(!fillerStatus_o.isACK()){//sysj\controller.sysj line: 157, column: 6
                                          fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 157, column: 6
                                          ends[8]=2;
                                          ;//sysj\controller.sysj line: 157, column: 6
                                          S11270=2;
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
                      S11270=2;
                      active[8]=1;
                      ends[8]=1;
                      break RUN;
                    }
                  }
                }
                else {
                  S11270=2;
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
          switch(S11270){
            case 0 : 
              switch(S11254){
                case 0 : 
                  if(!fillerReq_in.isPartnerPresent() || fillerReq_in.isPartnerPreempted()){//sysj\controller.sysj line: 108, column: 3
                    fillerReq_in.setACK(false);//sysj\controller.sysj line: 108, column: 3
                    S11254=1;
                    active[8]=1;
                    ends[8]=1;
                    break RUN;
                  }
                  else {
                    switch(S11249){
                      case 0 : 
                        if(!fillerReq_in.isREQ()){//sysj\controller.sysj line: 108, column: 3
                          fillerReq_in.setACK(true);//sysj\controller.sysj line: 108, column: 3
                          S11249=1;
                          if(fillerReq_in.isREQ()){//sysj\controller.sysj line: 108, column: 3
                            fillerReq_in.setACK(false);//sysj\controller.sysj line: 108, column: 3
                            ends[8]=2;
                            ;//sysj\controller.sysj line: 108, column: 3
                            request_thread_8 = (fillerReq_in.getVal() == null ? null : ((Boolean)fillerReq_in.getVal()));//sysj\controller.sysj line: 109, column: 3
                            S11270=1;
                            if(request_thread_8){//sysj\controller.sysj line: 111, column: 3
                              S18704=0;
                              if(!bottleAtPos2.getprestatus()){//sysj\controller.sysj line: 113, column: 13
                                S11277=0;
                                if(!fillerStatus_o.isPartnerPresent() || fillerStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 114, column: 6
                                  fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 114, column: 6
                                  S11277=1;
                                  active[8]=1;
                                  ends[8]=1;
                                  break RUN;
                                }
                                else {
                                  S11272=0;
                                  if(fillerStatus_o.isACK()){//sysj\controller.sysj line: 114, column: 6
                                    fillerStatus_o.setVal("idle");//sysj\controller.sysj line: 114, column: 6
                                    S11272=1;
                                    if(!fillerStatus_o.isACK()){//sysj\controller.sysj line: 114, column: 6
                                      fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 114, column: 6
                                      ends[8]=2;
                                      ;//sysj\controller.sysj line: 114, column: 6
                                      S18704=1;
                                      if(bottleAtPos2.getprestatus()){//sysj\controller.sysj line: 118, column: 13
                                        System.out.println("bottle is at pos 2");//sysj\controller.sysj line: 119, column: 6
                                        S11338=0;
                                        S11300=0;
                                        if(!fillerStatus_o.isPartnerPresent() || fillerStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 120, column: 6
                                          fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 120, column: 6
                                          S11300=1;
                                          active[8]=1;
                                          ends[8]=1;
                                          break RUN;
                                        }
                                        else {
                                          S11295=0;
                                          if(fillerStatus_o.isACK()){//sysj\controller.sysj line: 120, column: 6
                                            fillerStatus_o.setVal("busy");//sysj\controller.sysj line: 120, column: 6
                                            S11295=1;
                                            if(!fillerStatus_o.isACK()){//sysj\controller.sysj line: 120, column: 6
                                              fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 120, column: 6
                                              ends[8]=2;
                                              ;//sysj\controller.sysj line: 120, column: 6
                                              S11338=1;
                                              S11345=0;
                                              if(!percentLiquid_in.isPartnerPresent() || percentLiquid_in.isPartnerPreempted()){//sysj\controller.sysj line: 121, column: 6
                                                percentLiquid_in.setACK(false);//sysj\controller.sysj line: 121, column: 6
                                                S11345=1;
                                                active[8]=1;
                                                ends[8]=1;
                                                break RUN;
                                              }
                                              else {
                                                S11340=0;
                                                if(!percentLiquid_in.isREQ()){//sysj\controller.sysj line: 121, column: 6
                                                  percentLiquid_in.setACK(true);//sysj\controller.sysj line: 121, column: 6
                                                  S11340=1;
                                                  if(percentLiquid_in.isREQ()){//sysj\controller.sysj line: 121, column: 6
                                                    percentLiquid_in.setACK(false);//sysj\controller.sysj line: 121, column: 6
                                                    ends[8]=2;
                                                    ;//sysj\controller.sysj line: 121, column: 6
                                                    recPercentLiq_thread_8 = (ArrayList)(percentLiquid_in.getVal() == null ? null : ((ArrayList)percentLiquid_in.getVal()));//sysj\controller.sysj line: 122, column: 6
                                                    canisterNum_thread_8 = 1;//sysj\controller.sysj line: 123, column: 6
                                                    S11338=2;
                                                    if(canisterNum_thread_8 < 5){//sysj\controller.sysj line: 125, column: 12
                                                      S11457=0;
                                                      System.out.println("selecting canister " + canisterNum_thread_8);//sysj\controller.sysj line: 128, column: 8
                                                      selectCanister.setPresent();//sysj\controller.sysj line: 129, column: 9
                                                      currsigs.addElement(selectCanister);
                                                      selectCanister.setValue(canisterNum_thread_8);//sysj\controller.sysj line: 129, column: 9
                                                      active[8]=1;
                                                      ends[8]=1;
                                                      break RUN;
                                                    }
                                                    else {
                                                      ends[8]=2;
                                                      ;//sysj\controller.sysj line: 125, column: 6
                                                      S11338=3;
                                                      S12627=0;
                                                      if(!fillerStatus_o.isPartnerPresent() || fillerStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 157, column: 6
                                                        fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 157, column: 6
                                                        S12627=1;
                                                        active[8]=1;
                                                        ends[8]=1;
                                                        break RUN;
                                                      }
                                                      else {
                                                        S12622=0;
                                                        if(fillerStatus_o.isACK()){//sysj\controller.sysj line: 157, column: 6
                                                          fillerStatus_o.setVal("done");//sysj\controller.sysj line: 157, column: 6
                                                          S12622=1;
                                                          if(!fillerStatus_o.isACK()){//sysj\controller.sysj line: 157, column: 6
                                                            fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 157, column: 6
                                                            ends[8]=2;
                                                            ;//sysj\controller.sysj line: 157, column: 6
                                                            S11270=2;
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
                                        S11270=2;
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
                                S18704=1;
                                if(bottleAtPos2.getprestatus()){//sysj\controller.sysj line: 118, column: 13
                                  System.out.println("bottle is at pos 2");//sysj\controller.sysj line: 119, column: 6
                                  S11338=0;
                                  S11300=0;
                                  if(!fillerStatus_o.isPartnerPresent() || fillerStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 120, column: 6
                                    fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 120, column: 6
                                    S11300=1;
                                    active[8]=1;
                                    ends[8]=1;
                                    break RUN;
                                  }
                                  else {
                                    S11295=0;
                                    if(fillerStatus_o.isACK()){//sysj\controller.sysj line: 120, column: 6
                                      fillerStatus_o.setVal("busy");//sysj\controller.sysj line: 120, column: 6
                                      S11295=1;
                                      if(!fillerStatus_o.isACK()){//sysj\controller.sysj line: 120, column: 6
                                        fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 120, column: 6
                                        ends[8]=2;
                                        ;//sysj\controller.sysj line: 120, column: 6
                                        S11338=1;
                                        S11345=0;
                                        if(!percentLiquid_in.isPartnerPresent() || percentLiquid_in.isPartnerPreempted()){//sysj\controller.sysj line: 121, column: 6
                                          percentLiquid_in.setACK(false);//sysj\controller.sysj line: 121, column: 6
                                          S11345=1;
                                          active[8]=1;
                                          ends[8]=1;
                                          break RUN;
                                        }
                                        else {
                                          S11340=0;
                                          if(!percentLiquid_in.isREQ()){//sysj\controller.sysj line: 121, column: 6
                                            percentLiquid_in.setACK(true);//sysj\controller.sysj line: 121, column: 6
                                            S11340=1;
                                            if(percentLiquid_in.isREQ()){//sysj\controller.sysj line: 121, column: 6
                                              percentLiquid_in.setACK(false);//sysj\controller.sysj line: 121, column: 6
                                              ends[8]=2;
                                              ;//sysj\controller.sysj line: 121, column: 6
                                              recPercentLiq_thread_8 = (ArrayList)(percentLiquid_in.getVal() == null ? null : ((ArrayList)percentLiquid_in.getVal()));//sysj\controller.sysj line: 122, column: 6
                                              canisterNum_thread_8 = 1;//sysj\controller.sysj line: 123, column: 6
                                              S11338=2;
                                              if(canisterNum_thread_8 < 5){//sysj\controller.sysj line: 125, column: 12
                                                S11457=0;
                                                System.out.println("selecting canister " + canisterNum_thread_8);//sysj\controller.sysj line: 128, column: 8
                                                selectCanister.setPresent();//sysj\controller.sysj line: 129, column: 9
                                                currsigs.addElement(selectCanister);
                                                selectCanister.setValue(canisterNum_thread_8);//sysj\controller.sysj line: 129, column: 9
                                                active[8]=1;
                                                ends[8]=1;
                                                break RUN;
                                              }
                                              else {
                                                ends[8]=2;
                                                ;//sysj\controller.sysj line: 125, column: 6
                                                S11338=3;
                                                S12627=0;
                                                if(!fillerStatus_o.isPartnerPresent() || fillerStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 157, column: 6
                                                  fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 157, column: 6
                                                  S12627=1;
                                                  active[8]=1;
                                                  ends[8]=1;
                                                  break RUN;
                                                }
                                                else {
                                                  S12622=0;
                                                  if(fillerStatus_o.isACK()){//sysj\controller.sysj line: 157, column: 6
                                                    fillerStatus_o.setVal("done");//sysj\controller.sysj line: 157, column: 6
                                                    S12622=1;
                                                    if(!fillerStatus_o.isACK()){//sysj\controller.sysj line: 157, column: 6
                                                      fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 157, column: 6
                                                      ends[8]=2;
                                                      ;//sysj\controller.sysj line: 157, column: 6
                                                      S11270=2;
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
                                  S11270=2;
                                  active[8]=1;
                                  ends[8]=1;
                                  break RUN;
                                }
                              }
                            }
                            else {
                              S11270=2;
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
                        if(fillerReq_in.isREQ()){//sysj\controller.sysj line: 108, column: 3
                          fillerReq_in.setACK(false);//sysj\controller.sysj line: 108, column: 3
                          ends[8]=2;
                          ;//sysj\controller.sysj line: 108, column: 3
                          request_thread_8 = (fillerReq_in.getVal() == null ? null : ((Boolean)fillerReq_in.getVal()));//sysj\controller.sysj line: 109, column: 3
                          S11270=1;
                          if(request_thread_8){//sysj\controller.sysj line: 111, column: 3
                            S18704=0;
                            if(!bottleAtPos2.getprestatus()){//sysj\controller.sysj line: 113, column: 13
                              S11277=0;
                              if(!fillerStatus_o.isPartnerPresent() || fillerStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 114, column: 6
                                fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 114, column: 6
                                S11277=1;
                                active[8]=1;
                                ends[8]=1;
                                break RUN;
                              }
                              else {
                                S11272=0;
                                if(fillerStatus_o.isACK()){//sysj\controller.sysj line: 114, column: 6
                                  fillerStatus_o.setVal("idle");//sysj\controller.sysj line: 114, column: 6
                                  S11272=1;
                                  if(!fillerStatus_o.isACK()){//sysj\controller.sysj line: 114, column: 6
                                    fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 114, column: 6
                                    ends[8]=2;
                                    ;//sysj\controller.sysj line: 114, column: 6
                                    S18704=1;
                                    if(bottleAtPos2.getprestatus()){//sysj\controller.sysj line: 118, column: 13
                                      System.out.println("bottle is at pos 2");//sysj\controller.sysj line: 119, column: 6
                                      S11338=0;
                                      S11300=0;
                                      if(!fillerStatus_o.isPartnerPresent() || fillerStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 120, column: 6
                                        fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 120, column: 6
                                        S11300=1;
                                        active[8]=1;
                                        ends[8]=1;
                                        break RUN;
                                      }
                                      else {
                                        S11295=0;
                                        if(fillerStatus_o.isACK()){//sysj\controller.sysj line: 120, column: 6
                                          fillerStatus_o.setVal("busy");//sysj\controller.sysj line: 120, column: 6
                                          S11295=1;
                                          if(!fillerStatus_o.isACK()){//sysj\controller.sysj line: 120, column: 6
                                            fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 120, column: 6
                                            ends[8]=2;
                                            ;//sysj\controller.sysj line: 120, column: 6
                                            S11338=1;
                                            S11345=0;
                                            if(!percentLiquid_in.isPartnerPresent() || percentLiquid_in.isPartnerPreempted()){//sysj\controller.sysj line: 121, column: 6
                                              percentLiquid_in.setACK(false);//sysj\controller.sysj line: 121, column: 6
                                              S11345=1;
                                              active[8]=1;
                                              ends[8]=1;
                                              break RUN;
                                            }
                                            else {
                                              S11340=0;
                                              if(!percentLiquid_in.isREQ()){//sysj\controller.sysj line: 121, column: 6
                                                percentLiquid_in.setACK(true);//sysj\controller.sysj line: 121, column: 6
                                                S11340=1;
                                                if(percentLiquid_in.isREQ()){//sysj\controller.sysj line: 121, column: 6
                                                  percentLiquid_in.setACK(false);//sysj\controller.sysj line: 121, column: 6
                                                  ends[8]=2;
                                                  ;//sysj\controller.sysj line: 121, column: 6
                                                  recPercentLiq_thread_8 = (ArrayList)(percentLiquid_in.getVal() == null ? null : ((ArrayList)percentLiquid_in.getVal()));//sysj\controller.sysj line: 122, column: 6
                                                  canisterNum_thread_8 = 1;//sysj\controller.sysj line: 123, column: 6
                                                  S11338=2;
                                                  if(canisterNum_thread_8 < 5){//sysj\controller.sysj line: 125, column: 12
                                                    S11457=0;
                                                    System.out.println("selecting canister " + canisterNum_thread_8);//sysj\controller.sysj line: 128, column: 8
                                                    selectCanister.setPresent();//sysj\controller.sysj line: 129, column: 9
                                                    currsigs.addElement(selectCanister);
                                                    selectCanister.setValue(canisterNum_thread_8);//sysj\controller.sysj line: 129, column: 9
                                                    active[8]=1;
                                                    ends[8]=1;
                                                    break RUN;
                                                  }
                                                  else {
                                                    ends[8]=2;
                                                    ;//sysj\controller.sysj line: 125, column: 6
                                                    S11338=3;
                                                    S12627=0;
                                                    if(!fillerStatus_o.isPartnerPresent() || fillerStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 157, column: 6
                                                      fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 157, column: 6
                                                      S12627=1;
                                                      active[8]=1;
                                                      ends[8]=1;
                                                      break RUN;
                                                    }
                                                    else {
                                                      S12622=0;
                                                      if(fillerStatus_o.isACK()){//sysj\controller.sysj line: 157, column: 6
                                                        fillerStatus_o.setVal("done");//sysj\controller.sysj line: 157, column: 6
                                                        S12622=1;
                                                        if(!fillerStatus_o.isACK()){//sysj\controller.sysj line: 157, column: 6
                                                          fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 157, column: 6
                                                          ends[8]=2;
                                                          ;//sysj\controller.sysj line: 157, column: 6
                                                          S11270=2;
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
                                      S11270=2;
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
                              S18704=1;
                              if(bottleAtPos2.getprestatus()){//sysj\controller.sysj line: 118, column: 13
                                System.out.println("bottle is at pos 2");//sysj\controller.sysj line: 119, column: 6
                                S11338=0;
                                S11300=0;
                                if(!fillerStatus_o.isPartnerPresent() || fillerStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 120, column: 6
                                  fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 120, column: 6
                                  S11300=1;
                                  active[8]=1;
                                  ends[8]=1;
                                  break RUN;
                                }
                                else {
                                  S11295=0;
                                  if(fillerStatus_o.isACK()){//sysj\controller.sysj line: 120, column: 6
                                    fillerStatus_o.setVal("busy");//sysj\controller.sysj line: 120, column: 6
                                    S11295=1;
                                    if(!fillerStatus_o.isACK()){//sysj\controller.sysj line: 120, column: 6
                                      fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 120, column: 6
                                      ends[8]=2;
                                      ;//sysj\controller.sysj line: 120, column: 6
                                      S11338=1;
                                      S11345=0;
                                      if(!percentLiquid_in.isPartnerPresent() || percentLiquid_in.isPartnerPreempted()){//sysj\controller.sysj line: 121, column: 6
                                        percentLiquid_in.setACK(false);//sysj\controller.sysj line: 121, column: 6
                                        S11345=1;
                                        active[8]=1;
                                        ends[8]=1;
                                        break RUN;
                                      }
                                      else {
                                        S11340=0;
                                        if(!percentLiquid_in.isREQ()){//sysj\controller.sysj line: 121, column: 6
                                          percentLiquid_in.setACK(true);//sysj\controller.sysj line: 121, column: 6
                                          S11340=1;
                                          if(percentLiquid_in.isREQ()){//sysj\controller.sysj line: 121, column: 6
                                            percentLiquid_in.setACK(false);//sysj\controller.sysj line: 121, column: 6
                                            ends[8]=2;
                                            ;//sysj\controller.sysj line: 121, column: 6
                                            recPercentLiq_thread_8 = (ArrayList)(percentLiquid_in.getVal() == null ? null : ((ArrayList)percentLiquid_in.getVal()));//sysj\controller.sysj line: 122, column: 6
                                            canisterNum_thread_8 = 1;//sysj\controller.sysj line: 123, column: 6
                                            S11338=2;
                                            if(canisterNum_thread_8 < 5){//sysj\controller.sysj line: 125, column: 12
                                              S11457=0;
                                              System.out.println("selecting canister " + canisterNum_thread_8);//sysj\controller.sysj line: 128, column: 8
                                              selectCanister.setPresent();//sysj\controller.sysj line: 129, column: 9
                                              currsigs.addElement(selectCanister);
                                              selectCanister.setValue(canisterNum_thread_8);//sysj\controller.sysj line: 129, column: 9
                                              active[8]=1;
                                              ends[8]=1;
                                              break RUN;
                                            }
                                            else {
                                              ends[8]=2;
                                              ;//sysj\controller.sysj line: 125, column: 6
                                              S11338=3;
                                              S12627=0;
                                              if(!fillerStatus_o.isPartnerPresent() || fillerStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 157, column: 6
                                                fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 157, column: 6
                                                S12627=1;
                                                active[8]=1;
                                                ends[8]=1;
                                                break RUN;
                                              }
                                              else {
                                                S12622=0;
                                                if(fillerStatus_o.isACK()){//sysj\controller.sysj line: 157, column: 6
                                                  fillerStatus_o.setVal("done");//sysj\controller.sysj line: 157, column: 6
                                                  S12622=1;
                                                  if(!fillerStatus_o.isACK()){//sysj\controller.sysj line: 157, column: 6
                                                    fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 157, column: 6
                                                    ends[8]=2;
                                                    ;//sysj\controller.sysj line: 157, column: 6
                                                    S11270=2;
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
                                S11270=2;
                                active[8]=1;
                                ends[8]=1;
                                break RUN;
                              }
                            }
                          }
                          else {
                            S11270=2;
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
                  S11254=1;
                  S11254=0;
                  if(!fillerReq_in.isPartnerPresent() || fillerReq_in.isPartnerPreempted()){//sysj\controller.sysj line: 108, column: 3
                    fillerReq_in.setACK(false);//sysj\controller.sysj line: 108, column: 3
                    S11254=1;
                    active[8]=1;
                    ends[8]=1;
                    break RUN;
                  }
                  else {
                    S11249=0;
                    if(!fillerReq_in.isREQ()){//sysj\controller.sysj line: 108, column: 3
                      fillerReq_in.setACK(true);//sysj\controller.sysj line: 108, column: 3
                      S11249=1;
                      if(fillerReq_in.isREQ()){//sysj\controller.sysj line: 108, column: 3
                        fillerReq_in.setACK(false);//sysj\controller.sysj line: 108, column: 3
                        ends[8]=2;
                        ;//sysj\controller.sysj line: 108, column: 3
                        request_thread_8 = (fillerReq_in.getVal() == null ? null : ((Boolean)fillerReq_in.getVal()));//sysj\controller.sysj line: 109, column: 3
                        S11270=1;
                        if(request_thread_8){//sysj\controller.sysj line: 111, column: 3
                          S18704=0;
                          if(!bottleAtPos2.getprestatus()){//sysj\controller.sysj line: 113, column: 13
                            S11277=0;
                            if(!fillerStatus_o.isPartnerPresent() || fillerStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 114, column: 6
                              fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 114, column: 6
                              S11277=1;
                              active[8]=1;
                              ends[8]=1;
                              break RUN;
                            }
                            else {
                              S11272=0;
                              if(fillerStatus_o.isACK()){//sysj\controller.sysj line: 114, column: 6
                                fillerStatus_o.setVal("idle");//sysj\controller.sysj line: 114, column: 6
                                S11272=1;
                                if(!fillerStatus_o.isACK()){//sysj\controller.sysj line: 114, column: 6
                                  fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 114, column: 6
                                  ends[8]=2;
                                  ;//sysj\controller.sysj line: 114, column: 6
                                  S18704=1;
                                  if(bottleAtPos2.getprestatus()){//sysj\controller.sysj line: 118, column: 13
                                    System.out.println("bottle is at pos 2");//sysj\controller.sysj line: 119, column: 6
                                    S11338=0;
                                    S11300=0;
                                    if(!fillerStatus_o.isPartnerPresent() || fillerStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 120, column: 6
                                      fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 120, column: 6
                                      S11300=1;
                                      active[8]=1;
                                      ends[8]=1;
                                      break RUN;
                                    }
                                    else {
                                      S11295=0;
                                      if(fillerStatus_o.isACK()){//sysj\controller.sysj line: 120, column: 6
                                        fillerStatus_o.setVal("busy");//sysj\controller.sysj line: 120, column: 6
                                        S11295=1;
                                        if(!fillerStatus_o.isACK()){//sysj\controller.sysj line: 120, column: 6
                                          fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 120, column: 6
                                          ends[8]=2;
                                          ;//sysj\controller.sysj line: 120, column: 6
                                          S11338=1;
                                          S11345=0;
                                          if(!percentLiquid_in.isPartnerPresent() || percentLiquid_in.isPartnerPreempted()){//sysj\controller.sysj line: 121, column: 6
                                            percentLiquid_in.setACK(false);//sysj\controller.sysj line: 121, column: 6
                                            S11345=1;
                                            active[8]=1;
                                            ends[8]=1;
                                            break RUN;
                                          }
                                          else {
                                            S11340=0;
                                            if(!percentLiquid_in.isREQ()){//sysj\controller.sysj line: 121, column: 6
                                              percentLiquid_in.setACK(true);//sysj\controller.sysj line: 121, column: 6
                                              S11340=1;
                                              if(percentLiquid_in.isREQ()){//sysj\controller.sysj line: 121, column: 6
                                                percentLiquid_in.setACK(false);//sysj\controller.sysj line: 121, column: 6
                                                ends[8]=2;
                                                ;//sysj\controller.sysj line: 121, column: 6
                                                recPercentLiq_thread_8 = (ArrayList)(percentLiquid_in.getVal() == null ? null : ((ArrayList)percentLiquid_in.getVal()));//sysj\controller.sysj line: 122, column: 6
                                                canisterNum_thread_8 = 1;//sysj\controller.sysj line: 123, column: 6
                                                S11338=2;
                                                if(canisterNum_thread_8 < 5){//sysj\controller.sysj line: 125, column: 12
                                                  S11457=0;
                                                  System.out.println("selecting canister " + canisterNum_thread_8);//sysj\controller.sysj line: 128, column: 8
                                                  selectCanister.setPresent();//sysj\controller.sysj line: 129, column: 9
                                                  currsigs.addElement(selectCanister);
                                                  selectCanister.setValue(canisterNum_thread_8);//sysj\controller.sysj line: 129, column: 9
                                                  active[8]=1;
                                                  ends[8]=1;
                                                  break RUN;
                                                }
                                                else {
                                                  ends[8]=2;
                                                  ;//sysj\controller.sysj line: 125, column: 6
                                                  S11338=3;
                                                  S12627=0;
                                                  if(!fillerStatus_o.isPartnerPresent() || fillerStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 157, column: 6
                                                    fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 157, column: 6
                                                    S12627=1;
                                                    active[8]=1;
                                                    ends[8]=1;
                                                    break RUN;
                                                  }
                                                  else {
                                                    S12622=0;
                                                    if(fillerStatus_o.isACK()){//sysj\controller.sysj line: 157, column: 6
                                                      fillerStatus_o.setVal("done");//sysj\controller.sysj line: 157, column: 6
                                                      S12622=1;
                                                      if(!fillerStatus_o.isACK()){//sysj\controller.sysj line: 157, column: 6
                                                        fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 157, column: 6
                                                        ends[8]=2;
                                                        ;//sysj\controller.sysj line: 157, column: 6
                                                        S11270=2;
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
                                    S11270=2;
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
                            S18704=1;
                            if(bottleAtPos2.getprestatus()){//sysj\controller.sysj line: 118, column: 13
                              System.out.println("bottle is at pos 2");//sysj\controller.sysj line: 119, column: 6
                              S11338=0;
                              S11300=0;
                              if(!fillerStatus_o.isPartnerPresent() || fillerStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 120, column: 6
                                fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 120, column: 6
                                S11300=1;
                                active[8]=1;
                                ends[8]=1;
                                break RUN;
                              }
                              else {
                                S11295=0;
                                if(fillerStatus_o.isACK()){//sysj\controller.sysj line: 120, column: 6
                                  fillerStatus_o.setVal("busy");//sysj\controller.sysj line: 120, column: 6
                                  S11295=1;
                                  if(!fillerStatus_o.isACK()){//sysj\controller.sysj line: 120, column: 6
                                    fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 120, column: 6
                                    ends[8]=2;
                                    ;//sysj\controller.sysj line: 120, column: 6
                                    S11338=1;
                                    S11345=0;
                                    if(!percentLiquid_in.isPartnerPresent() || percentLiquid_in.isPartnerPreempted()){//sysj\controller.sysj line: 121, column: 6
                                      percentLiquid_in.setACK(false);//sysj\controller.sysj line: 121, column: 6
                                      S11345=1;
                                      active[8]=1;
                                      ends[8]=1;
                                      break RUN;
                                    }
                                    else {
                                      S11340=0;
                                      if(!percentLiquid_in.isREQ()){//sysj\controller.sysj line: 121, column: 6
                                        percentLiquid_in.setACK(true);//sysj\controller.sysj line: 121, column: 6
                                        S11340=1;
                                        if(percentLiquid_in.isREQ()){//sysj\controller.sysj line: 121, column: 6
                                          percentLiquid_in.setACK(false);//sysj\controller.sysj line: 121, column: 6
                                          ends[8]=2;
                                          ;//sysj\controller.sysj line: 121, column: 6
                                          recPercentLiq_thread_8 = (ArrayList)(percentLiquid_in.getVal() == null ? null : ((ArrayList)percentLiquid_in.getVal()));//sysj\controller.sysj line: 122, column: 6
                                          canisterNum_thread_8 = 1;//sysj\controller.sysj line: 123, column: 6
                                          S11338=2;
                                          if(canisterNum_thread_8 < 5){//sysj\controller.sysj line: 125, column: 12
                                            S11457=0;
                                            System.out.println("selecting canister " + canisterNum_thread_8);//sysj\controller.sysj line: 128, column: 8
                                            selectCanister.setPresent();//sysj\controller.sysj line: 129, column: 9
                                            currsigs.addElement(selectCanister);
                                            selectCanister.setValue(canisterNum_thread_8);//sysj\controller.sysj line: 129, column: 9
                                            active[8]=1;
                                            ends[8]=1;
                                            break RUN;
                                          }
                                          else {
                                            ends[8]=2;
                                            ;//sysj\controller.sysj line: 125, column: 6
                                            S11338=3;
                                            S12627=0;
                                            if(!fillerStatus_o.isPartnerPresent() || fillerStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 157, column: 6
                                              fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 157, column: 6
                                              S12627=1;
                                              active[8]=1;
                                              ends[8]=1;
                                              break RUN;
                                            }
                                            else {
                                              S12622=0;
                                              if(fillerStatus_o.isACK()){//sysj\controller.sysj line: 157, column: 6
                                                fillerStatus_o.setVal("done");//sysj\controller.sysj line: 157, column: 6
                                                S12622=1;
                                                if(!fillerStatus_o.isACK()){//sysj\controller.sysj line: 157, column: 6
                                                  fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 157, column: 6
                                                  ends[8]=2;
                                                  ;//sysj\controller.sysj line: 157, column: 6
                                                  S11270=2;
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
                              S11270=2;
                              active[8]=1;
                              ends[8]=1;
                              break RUN;
                            }
                          }
                        }
                        else {
                          S11270=2;
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
              switch(S18704){
                case 0 : 
                  switch(S11277){
                    case 0 : 
                      if(!fillerStatus_o.isPartnerPresent() || fillerStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 114, column: 6
                        fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 114, column: 6
                        S11277=1;
                        active[8]=1;
                        ends[8]=1;
                        break RUN;
                      }
                      else {
                        switch(S11272){
                          case 0 : 
                            if(fillerStatus_o.isACK()){//sysj\controller.sysj line: 114, column: 6
                              fillerStatus_o.setVal("idle");//sysj\controller.sysj line: 114, column: 6
                              S11272=1;
                              if(!fillerStatus_o.isACK()){//sysj\controller.sysj line: 114, column: 6
                                fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 114, column: 6
                                ends[8]=2;
                                ;//sysj\controller.sysj line: 114, column: 6
                                S18704=1;
                                if(bottleAtPos2.getprestatus()){//sysj\controller.sysj line: 118, column: 13
                                  System.out.println("bottle is at pos 2");//sysj\controller.sysj line: 119, column: 6
                                  S11338=0;
                                  S11300=0;
                                  if(!fillerStatus_o.isPartnerPresent() || fillerStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 120, column: 6
                                    fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 120, column: 6
                                    S11300=1;
                                    active[8]=1;
                                    ends[8]=1;
                                    break RUN;
                                  }
                                  else {
                                    S11295=0;
                                    if(fillerStatus_o.isACK()){//sysj\controller.sysj line: 120, column: 6
                                      fillerStatus_o.setVal("busy");//sysj\controller.sysj line: 120, column: 6
                                      S11295=1;
                                      if(!fillerStatus_o.isACK()){//sysj\controller.sysj line: 120, column: 6
                                        fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 120, column: 6
                                        ends[8]=2;
                                        ;//sysj\controller.sysj line: 120, column: 6
                                        S11338=1;
                                        S11345=0;
                                        if(!percentLiquid_in.isPartnerPresent() || percentLiquid_in.isPartnerPreempted()){//sysj\controller.sysj line: 121, column: 6
                                          percentLiquid_in.setACK(false);//sysj\controller.sysj line: 121, column: 6
                                          S11345=1;
                                          active[8]=1;
                                          ends[8]=1;
                                          break RUN;
                                        }
                                        else {
                                          S11340=0;
                                          if(!percentLiquid_in.isREQ()){//sysj\controller.sysj line: 121, column: 6
                                            percentLiquid_in.setACK(true);//sysj\controller.sysj line: 121, column: 6
                                            S11340=1;
                                            if(percentLiquid_in.isREQ()){//sysj\controller.sysj line: 121, column: 6
                                              percentLiquid_in.setACK(false);//sysj\controller.sysj line: 121, column: 6
                                              ends[8]=2;
                                              ;//sysj\controller.sysj line: 121, column: 6
                                              recPercentLiq_thread_8 = (ArrayList)(percentLiquid_in.getVal() == null ? null : ((ArrayList)percentLiquid_in.getVal()));//sysj\controller.sysj line: 122, column: 6
                                              canisterNum_thread_8 = 1;//sysj\controller.sysj line: 123, column: 6
                                              S11338=2;
                                              if(canisterNum_thread_8 < 5){//sysj\controller.sysj line: 125, column: 12
                                                S11457=0;
                                                System.out.println("selecting canister " + canisterNum_thread_8);//sysj\controller.sysj line: 128, column: 8
                                                selectCanister.setPresent();//sysj\controller.sysj line: 129, column: 9
                                                currsigs.addElement(selectCanister);
                                                selectCanister.setValue(canisterNum_thread_8);//sysj\controller.sysj line: 129, column: 9
                                                active[8]=1;
                                                ends[8]=1;
                                                break RUN;
                                              }
                                              else {
                                                ends[8]=2;
                                                ;//sysj\controller.sysj line: 125, column: 6
                                                S11338=3;
                                                S12627=0;
                                                if(!fillerStatus_o.isPartnerPresent() || fillerStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 157, column: 6
                                                  fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 157, column: 6
                                                  S12627=1;
                                                  active[8]=1;
                                                  ends[8]=1;
                                                  break RUN;
                                                }
                                                else {
                                                  S12622=0;
                                                  if(fillerStatus_o.isACK()){//sysj\controller.sysj line: 157, column: 6
                                                    fillerStatus_o.setVal("done");//sysj\controller.sysj line: 157, column: 6
                                                    S12622=1;
                                                    if(!fillerStatus_o.isACK()){//sysj\controller.sysj line: 157, column: 6
                                                      fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 157, column: 6
                                                      ends[8]=2;
                                                      ;//sysj\controller.sysj line: 157, column: 6
                                                      S11270=2;
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
                                  S11270=2;
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
                            if(!fillerStatus_o.isACK()){//sysj\controller.sysj line: 114, column: 6
                              fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 114, column: 6
                              ends[8]=2;
                              ;//sysj\controller.sysj line: 114, column: 6
                              S18704=1;
                              if(bottleAtPos2.getprestatus()){//sysj\controller.sysj line: 118, column: 13
                                System.out.println("bottle is at pos 2");//sysj\controller.sysj line: 119, column: 6
                                S11338=0;
                                S11300=0;
                                if(!fillerStatus_o.isPartnerPresent() || fillerStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 120, column: 6
                                  fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 120, column: 6
                                  S11300=1;
                                  active[8]=1;
                                  ends[8]=1;
                                  break RUN;
                                }
                                else {
                                  S11295=0;
                                  if(fillerStatus_o.isACK()){//sysj\controller.sysj line: 120, column: 6
                                    fillerStatus_o.setVal("busy");//sysj\controller.sysj line: 120, column: 6
                                    S11295=1;
                                    if(!fillerStatus_o.isACK()){//sysj\controller.sysj line: 120, column: 6
                                      fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 120, column: 6
                                      ends[8]=2;
                                      ;//sysj\controller.sysj line: 120, column: 6
                                      S11338=1;
                                      S11345=0;
                                      if(!percentLiquid_in.isPartnerPresent() || percentLiquid_in.isPartnerPreempted()){//sysj\controller.sysj line: 121, column: 6
                                        percentLiquid_in.setACK(false);//sysj\controller.sysj line: 121, column: 6
                                        S11345=1;
                                        active[8]=1;
                                        ends[8]=1;
                                        break RUN;
                                      }
                                      else {
                                        S11340=0;
                                        if(!percentLiquid_in.isREQ()){//sysj\controller.sysj line: 121, column: 6
                                          percentLiquid_in.setACK(true);//sysj\controller.sysj line: 121, column: 6
                                          S11340=1;
                                          if(percentLiquid_in.isREQ()){//sysj\controller.sysj line: 121, column: 6
                                            percentLiquid_in.setACK(false);//sysj\controller.sysj line: 121, column: 6
                                            ends[8]=2;
                                            ;//sysj\controller.sysj line: 121, column: 6
                                            recPercentLiq_thread_8 = (ArrayList)(percentLiquid_in.getVal() == null ? null : ((ArrayList)percentLiquid_in.getVal()));//sysj\controller.sysj line: 122, column: 6
                                            canisterNum_thread_8 = 1;//sysj\controller.sysj line: 123, column: 6
                                            S11338=2;
                                            if(canisterNum_thread_8 < 5){//sysj\controller.sysj line: 125, column: 12
                                              S11457=0;
                                              System.out.println("selecting canister " + canisterNum_thread_8);//sysj\controller.sysj line: 128, column: 8
                                              selectCanister.setPresent();//sysj\controller.sysj line: 129, column: 9
                                              currsigs.addElement(selectCanister);
                                              selectCanister.setValue(canisterNum_thread_8);//sysj\controller.sysj line: 129, column: 9
                                              active[8]=1;
                                              ends[8]=1;
                                              break RUN;
                                            }
                                            else {
                                              ends[8]=2;
                                              ;//sysj\controller.sysj line: 125, column: 6
                                              S11338=3;
                                              S12627=0;
                                              if(!fillerStatus_o.isPartnerPresent() || fillerStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 157, column: 6
                                                fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 157, column: 6
                                                S12627=1;
                                                active[8]=1;
                                                ends[8]=1;
                                                break RUN;
                                              }
                                              else {
                                                S12622=0;
                                                if(fillerStatus_o.isACK()){//sysj\controller.sysj line: 157, column: 6
                                                  fillerStatus_o.setVal("done");//sysj\controller.sysj line: 157, column: 6
                                                  S12622=1;
                                                  if(!fillerStatus_o.isACK()){//sysj\controller.sysj line: 157, column: 6
                                                    fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 157, column: 6
                                                    ends[8]=2;
                                                    ;//sysj\controller.sysj line: 157, column: 6
                                                    S11270=2;
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
                                S11270=2;
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
                      S11277=1;
                      S11277=0;
                      if(!fillerStatus_o.isPartnerPresent() || fillerStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 114, column: 6
                        fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 114, column: 6
                        S11277=1;
                        active[8]=1;
                        ends[8]=1;
                        break RUN;
                      }
                      else {
                        S11272=0;
                        if(fillerStatus_o.isACK()){//sysj\controller.sysj line: 114, column: 6
                          fillerStatus_o.setVal("idle");//sysj\controller.sysj line: 114, column: 6
                          S11272=1;
                          if(!fillerStatus_o.isACK()){//sysj\controller.sysj line: 114, column: 6
                            fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 114, column: 6
                            ends[8]=2;
                            ;//sysj\controller.sysj line: 114, column: 6
                            S18704=1;
                            if(bottleAtPos2.getprestatus()){//sysj\controller.sysj line: 118, column: 13
                              System.out.println("bottle is at pos 2");//sysj\controller.sysj line: 119, column: 6
                              S11338=0;
                              S11300=0;
                              if(!fillerStatus_o.isPartnerPresent() || fillerStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 120, column: 6
                                fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 120, column: 6
                                S11300=1;
                                active[8]=1;
                                ends[8]=1;
                                break RUN;
                              }
                              else {
                                S11295=0;
                                if(fillerStatus_o.isACK()){//sysj\controller.sysj line: 120, column: 6
                                  fillerStatus_o.setVal("busy");//sysj\controller.sysj line: 120, column: 6
                                  S11295=1;
                                  if(!fillerStatus_o.isACK()){//sysj\controller.sysj line: 120, column: 6
                                    fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 120, column: 6
                                    ends[8]=2;
                                    ;//sysj\controller.sysj line: 120, column: 6
                                    S11338=1;
                                    S11345=0;
                                    if(!percentLiquid_in.isPartnerPresent() || percentLiquid_in.isPartnerPreempted()){//sysj\controller.sysj line: 121, column: 6
                                      percentLiquid_in.setACK(false);//sysj\controller.sysj line: 121, column: 6
                                      S11345=1;
                                      active[8]=1;
                                      ends[8]=1;
                                      break RUN;
                                    }
                                    else {
                                      S11340=0;
                                      if(!percentLiquid_in.isREQ()){//sysj\controller.sysj line: 121, column: 6
                                        percentLiquid_in.setACK(true);//sysj\controller.sysj line: 121, column: 6
                                        S11340=1;
                                        if(percentLiquid_in.isREQ()){//sysj\controller.sysj line: 121, column: 6
                                          percentLiquid_in.setACK(false);//sysj\controller.sysj line: 121, column: 6
                                          ends[8]=2;
                                          ;//sysj\controller.sysj line: 121, column: 6
                                          recPercentLiq_thread_8 = (ArrayList)(percentLiquid_in.getVal() == null ? null : ((ArrayList)percentLiquid_in.getVal()));//sysj\controller.sysj line: 122, column: 6
                                          canisterNum_thread_8 = 1;//sysj\controller.sysj line: 123, column: 6
                                          S11338=2;
                                          if(canisterNum_thread_8 < 5){//sysj\controller.sysj line: 125, column: 12
                                            S11457=0;
                                            System.out.println("selecting canister " + canisterNum_thread_8);//sysj\controller.sysj line: 128, column: 8
                                            selectCanister.setPresent();//sysj\controller.sysj line: 129, column: 9
                                            currsigs.addElement(selectCanister);
                                            selectCanister.setValue(canisterNum_thread_8);//sysj\controller.sysj line: 129, column: 9
                                            active[8]=1;
                                            ends[8]=1;
                                            break RUN;
                                          }
                                          else {
                                            ends[8]=2;
                                            ;//sysj\controller.sysj line: 125, column: 6
                                            S11338=3;
                                            S12627=0;
                                            if(!fillerStatus_o.isPartnerPresent() || fillerStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 157, column: 6
                                              fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 157, column: 6
                                              S12627=1;
                                              active[8]=1;
                                              ends[8]=1;
                                              break RUN;
                                            }
                                            else {
                                              S12622=0;
                                              if(fillerStatus_o.isACK()){//sysj\controller.sysj line: 157, column: 6
                                                fillerStatus_o.setVal("done");//sysj\controller.sysj line: 157, column: 6
                                                S12622=1;
                                                if(!fillerStatus_o.isACK()){//sysj\controller.sysj line: 157, column: 6
                                                  fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 157, column: 6
                                                  ends[8]=2;
                                                  ;//sysj\controller.sysj line: 157, column: 6
                                                  S11270=2;
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
                              S11270=2;
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
                  switch(S11338){
                    case 0 : 
                      switch(S11300){
                        case 0 : 
                          if(!fillerStatus_o.isPartnerPresent() || fillerStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 120, column: 6
                            fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 120, column: 6
                            S11300=1;
                            active[8]=1;
                            ends[8]=1;
                            break RUN;
                          }
                          else {
                            switch(S11295){
                              case 0 : 
                                if(fillerStatus_o.isACK()){//sysj\controller.sysj line: 120, column: 6
                                  fillerStatus_o.setVal("busy");//sysj\controller.sysj line: 120, column: 6
                                  S11295=1;
                                  if(!fillerStatus_o.isACK()){//sysj\controller.sysj line: 120, column: 6
                                    fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 120, column: 6
                                    ends[8]=2;
                                    ;//sysj\controller.sysj line: 120, column: 6
                                    S11338=1;
                                    S11345=0;
                                    if(!percentLiquid_in.isPartnerPresent() || percentLiquid_in.isPartnerPreempted()){//sysj\controller.sysj line: 121, column: 6
                                      percentLiquid_in.setACK(false);//sysj\controller.sysj line: 121, column: 6
                                      S11345=1;
                                      active[8]=1;
                                      ends[8]=1;
                                      break RUN;
                                    }
                                    else {
                                      S11340=0;
                                      if(!percentLiquid_in.isREQ()){//sysj\controller.sysj line: 121, column: 6
                                        percentLiquid_in.setACK(true);//sysj\controller.sysj line: 121, column: 6
                                        S11340=1;
                                        if(percentLiquid_in.isREQ()){//sysj\controller.sysj line: 121, column: 6
                                          percentLiquid_in.setACK(false);//sysj\controller.sysj line: 121, column: 6
                                          ends[8]=2;
                                          ;//sysj\controller.sysj line: 121, column: 6
                                          recPercentLiq_thread_8 = (ArrayList)(percentLiquid_in.getVal() == null ? null : ((ArrayList)percentLiquid_in.getVal()));//sysj\controller.sysj line: 122, column: 6
                                          canisterNum_thread_8 = 1;//sysj\controller.sysj line: 123, column: 6
                                          S11338=2;
                                          if(canisterNum_thread_8 < 5){//sysj\controller.sysj line: 125, column: 12
                                            S11457=0;
                                            System.out.println("selecting canister " + canisterNum_thread_8);//sysj\controller.sysj line: 128, column: 8
                                            selectCanister.setPresent();//sysj\controller.sysj line: 129, column: 9
                                            currsigs.addElement(selectCanister);
                                            selectCanister.setValue(canisterNum_thread_8);//sysj\controller.sysj line: 129, column: 9
                                            active[8]=1;
                                            ends[8]=1;
                                            break RUN;
                                          }
                                          else {
                                            ends[8]=2;
                                            ;//sysj\controller.sysj line: 125, column: 6
                                            S11338=3;
                                            S12627=0;
                                            if(!fillerStatus_o.isPartnerPresent() || fillerStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 157, column: 6
                                              fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 157, column: 6
                                              S12627=1;
                                              active[8]=1;
                                              ends[8]=1;
                                              break RUN;
                                            }
                                            else {
                                              S12622=0;
                                              if(fillerStatus_o.isACK()){//sysj\controller.sysj line: 157, column: 6
                                                fillerStatus_o.setVal("done");//sysj\controller.sysj line: 157, column: 6
                                                S12622=1;
                                                if(!fillerStatus_o.isACK()){//sysj\controller.sysj line: 157, column: 6
                                                  fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 157, column: 6
                                                  ends[8]=2;
                                                  ;//sysj\controller.sysj line: 157, column: 6
                                                  S11270=2;
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
                                if(!fillerStatus_o.isACK()){//sysj\controller.sysj line: 120, column: 6
                                  fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 120, column: 6
                                  ends[8]=2;
                                  ;//sysj\controller.sysj line: 120, column: 6
                                  S11338=1;
                                  S11345=0;
                                  if(!percentLiquid_in.isPartnerPresent() || percentLiquid_in.isPartnerPreempted()){//sysj\controller.sysj line: 121, column: 6
                                    percentLiquid_in.setACK(false);//sysj\controller.sysj line: 121, column: 6
                                    S11345=1;
                                    active[8]=1;
                                    ends[8]=1;
                                    break RUN;
                                  }
                                  else {
                                    S11340=0;
                                    if(!percentLiquid_in.isREQ()){//sysj\controller.sysj line: 121, column: 6
                                      percentLiquid_in.setACK(true);//sysj\controller.sysj line: 121, column: 6
                                      S11340=1;
                                      if(percentLiquid_in.isREQ()){//sysj\controller.sysj line: 121, column: 6
                                        percentLiquid_in.setACK(false);//sysj\controller.sysj line: 121, column: 6
                                        ends[8]=2;
                                        ;//sysj\controller.sysj line: 121, column: 6
                                        recPercentLiq_thread_8 = (ArrayList)(percentLiquid_in.getVal() == null ? null : ((ArrayList)percentLiquid_in.getVal()));//sysj\controller.sysj line: 122, column: 6
                                        canisterNum_thread_8 = 1;//sysj\controller.sysj line: 123, column: 6
                                        S11338=2;
                                        if(canisterNum_thread_8 < 5){//sysj\controller.sysj line: 125, column: 12
                                          S11457=0;
                                          System.out.println("selecting canister " + canisterNum_thread_8);//sysj\controller.sysj line: 128, column: 8
                                          selectCanister.setPresent();//sysj\controller.sysj line: 129, column: 9
                                          currsigs.addElement(selectCanister);
                                          selectCanister.setValue(canisterNum_thread_8);//sysj\controller.sysj line: 129, column: 9
                                          active[8]=1;
                                          ends[8]=1;
                                          break RUN;
                                        }
                                        else {
                                          ends[8]=2;
                                          ;//sysj\controller.sysj line: 125, column: 6
                                          S11338=3;
                                          S12627=0;
                                          if(!fillerStatus_o.isPartnerPresent() || fillerStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 157, column: 6
                                            fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 157, column: 6
                                            S12627=1;
                                            active[8]=1;
                                            ends[8]=1;
                                            break RUN;
                                          }
                                          else {
                                            S12622=0;
                                            if(fillerStatus_o.isACK()){//sysj\controller.sysj line: 157, column: 6
                                              fillerStatus_o.setVal("done");//sysj\controller.sysj line: 157, column: 6
                                              S12622=1;
                                              if(!fillerStatus_o.isACK()){//sysj\controller.sysj line: 157, column: 6
                                                fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 157, column: 6
                                                ends[8]=2;
                                                ;//sysj\controller.sysj line: 157, column: 6
                                                S11270=2;
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
                          S11300=1;
                          S11300=0;
                          if(!fillerStatus_o.isPartnerPresent() || fillerStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 120, column: 6
                            fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 120, column: 6
                            S11300=1;
                            active[8]=1;
                            ends[8]=1;
                            break RUN;
                          }
                          else {
                            S11295=0;
                            if(fillerStatus_o.isACK()){//sysj\controller.sysj line: 120, column: 6
                              fillerStatus_o.setVal("busy");//sysj\controller.sysj line: 120, column: 6
                              S11295=1;
                              if(!fillerStatus_o.isACK()){//sysj\controller.sysj line: 120, column: 6
                                fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 120, column: 6
                                ends[8]=2;
                                ;//sysj\controller.sysj line: 120, column: 6
                                S11338=1;
                                S11345=0;
                                if(!percentLiquid_in.isPartnerPresent() || percentLiquid_in.isPartnerPreempted()){//sysj\controller.sysj line: 121, column: 6
                                  percentLiquid_in.setACK(false);//sysj\controller.sysj line: 121, column: 6
                                  S11345=1;
                                  active[8]=1;
                                  ends[8]=1;
                                  break RUN;
                                }
                                else {
                                  S11340=0;
                                  if(!percentLiquid_in.isREQ()){//sysj\controller.sysj line: 121, column: 6
                                    percentLiquid_in.setACK(true);//sysj\controller.sysj line: 121, column: 6
                                    S11340=1;
                                    if(percentLiquid_in.isREQ()){//sysj\controller.sysj line: 121, column: 6
                                      percentLiquid_in.setACK(false);//sysj\controller.sysj line: 121, column: 6
                                      ends[8]=2;
                                      ;//sysj\controller.sysj line: 121, column: 6
                                      recPercentLiq_thread_8 = (ArrayList)(percentLiquid_in.getVal() == null ? null : ((ArrayList)percentLiquid_in.getVal()));//sysj\controller.sysj line: 122, column: 6
                                      canisterNum_thread_8 = 1;//sysj\controller.sysj line: 123, column: 6
                                      S11338=2;
                                      if(canisterNum_thread_8 < 5){//sysj\controller.sysj line: 125, column: 12
                                        S11457=0;
                                        System.out.println("selecting canister " + canisterNum_thread_8);//sysj\controller.sysj line: 128, column: 8
                                        selectCanister.setPresent();//sysj\controller.sysj line: 129, column: 9
                                        currsigs.addElement(selectCanister);
                                        selectCanister.setValue(canisterNum_thread_8);//sysj\controller.sysj line: 129, column: 9
                                        active[8]=1;
                                        ends[8]=1;
                                        break RUN;
                                      }
                                      else {
                                        ends[8]=2;
                                        ;//sysj\controller.sysj line: 125, column: 6
                                        S11338=3;
                                        S12627=0;
                                        if(!fillerStatus_o.isPartnerPresent() || fillerStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 157, column: 6
                                          fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 157, column: 6
                                          S12627=1;
                                          active[8]=1;
                                          ends[8]=1;
                                          break RUN;
                                        }
                                        else {
                                          S12622=0;
                                          if(fillerStatus_o.isACK()){//sysj\controller.sysj line: 157, column: 6
                                            fillerStatus_o.setVal("done");//sysj\controller.sysj line: 157, column: 6
                                            S12622=1;
                                            if(!fillerStatus_o.isACK()){//sysj\controller.sysj line: 157, column: 6
                                              fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 157, column: 6
                                              ends[8]=2;
                                              ;//sysj\controller.sysj line: 157, column: 6
                                              S11270=2;
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
                      switch(S11345){
                        case 0 : 
                          if(!percentLiquid_in.isPartnerPresent() || percentLiquid_in.isPartnerPreempted()){//sysj\controller.sysj line: 121, column: 6
                            percentLiquid_in.setACK(false);//sysj\controller.sysj line: 121, column: 6
                            S11345=1;
                            active[8]=1;
                            ends[8]=1;
                            break RUN;
                          }
                          else {
                            switch(S11340){
                              case 0 : 
                                if(!percentLiquid_in.isREQ()){//sysj\controller.sysj line: 121, column: 6
                                  percentLiquid_in.setACK(true);//sysj\controller.sysj line: 121, column: 6
                                  S11340=1;
                                  if(percentLiquid_in.isREQ()){//sysj\controller.sysj line: 121, column: 6
                                    percentLiquid_in.setACK(false);//sysj\controller.sysj line: 121, column: 6
                                    ends[8]=2;
                                    ;//sysj\controller.sysj line: 121, column: 6
                                    recPercentLiq_thread_8 = (ArrayList)(percentLiquid_in.getVal() == null ? null : ((ArrayList)percentLiquid_in.getVal()));//sysj\controller.sysj line: 122, column: 6
                                    canisterNum_thread_8 = 1;//sysj\controller.sysj line: 123, column: 6
                                    S11338=2;
                                    if(canisterNum_thread_8 < 5){//sysj\controller.sysj line: 125, column: 12
                                      S11457=0;
                                      System.out.println("selecting canister " + canisterNum_thread_8);//sysj\controller.sysj line: 128, column: 8
                                      selectCanister.setPresent();//sysj\controller.sysj line: 129, column: 9
                                      currsigs.addElement(selectCanister);
                                      selectCanister.setValue(canisterNum_thread_8);//sysj\controller.sysj line: 129, column: 9
                                      active[8]=1;
                                      ends[8]=1;
                                      break RUN;
                                    }
                                    else {
                                      ends[8]=2;
                                      ;//sysj\controller.sysj line: 125, column: 6
                                      S11338=3;
                                      S12627=0;
                                      if(!fillerStatus_o.isPartnerPresent() || fillerStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 157, column: 6
                                        fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 157, column: 6
                                        S12627=1;
                                        active[8]=1;
                                        ends[8]=1;
                                        break RUN;
                                      }
                                      else {
                                        S12622=0;
                                        if(fillerStatus_o.isACK()){//sysj\controller.sysj line: 157, column: 6
                                          fillerStatus_o.setVal("done");//sysj\controller.sysj line: 157, column: 6
                                          S12622=1;
                                          if(!fillerStatus_o.isACK()){//sysj\controller.sysj line: 157, column: 6
                                            fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 157, column: 6
                                            ends[8]=2;
                                            ;//sysj\controller.sysj line: 157, column: 6
                                            S11270=2;
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
                                if(percentLiquid_in.isREQ()){//sysj\controller.sysj line: 121, column: 6
                                  percentLiquid_in.setACK(false);//sysj\controller.sysj line: 121, column: 6
                                  ends[8]=2;
                                  ;//sysj\controller.sysj line: 121, column: 6
                                  recPercentLiq_thread_8 = (ArrayList)(percentLiquid_in.getVal() == null ? null : ((ArrayList)percentLiquid_in.getVal()));//sysj\controller.sysj line: 122, column: 6
                                  canisterNum_thread_8 = 1;//sysj\controller.sysj line: 123, column: 6
                                  S11338=2;
                                  if(canisterNum_thread_8 < 5){//sysj\controller.sysj line: 125, column: 12
                                    S11457=0;
                                    System.out.println("selecting canister " + canisterNum_thread_8);//sysj\controller.sysj line: 128, column: 8
                                    selectCanister.setPresent();//sysj\controller.sysj line: 129, column: 9
                                    currsigs.addElement(selectCanister);
                                    selectCanister.setValue(canisterNum_thread_8);//sysj\controller.sysj line: 129, column: 9
                                    active[8]=1;
                                    ends[8]=1;
                                    break RUN;
                                  }
                                  else {
                                    ends[8]=2;
                                    ;//sysj\controller.sysj line: 125, column: 6
                                    S11338=3;
                                    S12627=0;
                                    if(!fillerStatus_o.isPartnerPresent() || fillerStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 157, column: 6
                                      fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 157, column: 6
                                      S12627=1;
                                      active[8]=1;
                                      ends[8]=1;
                                      break RUN;
                                    }
                                    else {
                                      S12622=0;
                                      if(fillerStatus_o.isACK()){//sysj\controller.sysj line: 157, column: 6
                                        fillerStatus_o.setVal("done");//sysj\controller.sysj line: 157, column: 6
                                        S12622=1;
                                        if(!fillerStatus_o.isACK()){//sysj\controller.sysj line: 157, column: 6
                                          fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 157, column: 6
                                          ends[8]=2;
                                          ;//sysj\controller.sysj line: 157, column: 6
                                          S11270=2;
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
                          S11345=1;
                          S11345=0;
                          if(!percentLiquid_in.isPartnerPresent() || percentLiquid_in.isPartnerPreempted()){//sysj\controller.sysj line: 121, column: 6
                            percentLiquid_in.setACK(false);//sysj\controller.sysj line: 121, column: 6
                            S11345=1;
                            active[8]=1;
                            ends[8]=1;
                            break RUN;
                          }
                          else {
                            S11340=0;
                            if(!percentLiquid_in.isREQ()){//sysj\controller.sysj line: 121, column: 6
                              percentLiquid_in.setACK(true);//sysj\controller.sysj line: 121, column: 6
                              S11340=1;
                              if(percentLiquid_in.isREQ()){//sysj\controller.sysj line: 121, column: 6
                                percentLiquid_in.setACK(false);//sysj\controller.sysj line: 121, column: 6
                                ends[8]=2;
                                ;//sysj\controller.sysj line: 121, column: 6
                                recPercentLiq_thread_8 = (ArrayList)(percentLiquid_in.getVal() == null ? null : ((ArrayList)percentLiquid_in.getVal()));//sysj\controller.sysj line: 122, column: 6
                                canisterNum_thread_8 = 1;//sysj\controller.sysj line: 123, column: 6
                                S11338=2;
                                if(canisterNum_thread_8 < 5){//sysj\controller.sysj line: 125, column: 12
                                  S11457=0;
                                  System.out.println("selecting canister " + canisterNum_thread_8);//sysj\controller.sysj line: 128, column: 8
                                  selectCanister.setPresent();//sysj\controller.sysj line: 129, column: 9
                                  currsigs.addElement(selectCanister);
                                  selectCanister.setValue(canisterNum_thread_8);//sysj\controller.sysj line: 129, column: 9
                                  active[8]=1;
                                  ends[8]=1;
                                  break RUN;
                                }
                                else {
                                  ends[8]=2;
                                  ;//sysj\controller.sysj line: 125, column: 6
                                  S11338=3;
                                  S12627=0;
                                  if(!fillerStatus_o.isPartnerPresent() || fillerStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 157, column: 6
                                    fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 157, column: 6
                                    S12627=1;
                                    active[8]=1;
                                    ends[8]=1;
                                    break RUN;
                                  }
                                  else {
                                    S12622=0;
                                    if(fillerStatus_o.isACK()){//sysj\controller.sysj line: 157, column: 6
                                      fillerStatus_o.setVal("done");//sysj\controller.sysj line: 157, column: 6
                                      S12622=1;
                                      if(!fillerStatus_o.isACK()){//sysj\controller.sysj line: 157, column: 6
                                        fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 157, column: 6
                                        ends[8]=2;
                                        ;//sysj\controller.sysj line: 157, column: 6
                                        S11270=2;
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
                      switch(S11457){
                        case 0 : 
                          if(selectedCanister.getprestatus()){//sysj\controller.sysj line: 127, column: 13
                            S11457=1;
                            thread116619(tdone,ends);
                            thread116620(tdone,ends);
                            int biggest116621 = 0;
                            if(ends[9]>=biggest116621){
                              biggest116621=ends[9];
                            }
                            if(ends[10]>=biggest116621){
                              biggest116621=ends[10];
                            }
                            if(biggest116621 == 1){
                              active[8]=1;
                              ends[8]=1;
                              break RUN;
                            }
                          }
                          else {
                            selectCanister.setPresent();//sysj\controller.sysj line: 129, column: 9
                            currsigs.addElement(selectCanister);
                            selectCanister.setValue(canisterNum_thread_8);//sysj\controller.sysj line: 129, column: 9
                            active[8]=1;
                            ends[8]=1;
                            break RUN;
                          }
                        
                        case 1 : 
                          if(!dosUnitEvac.getprestatus()){//sysj\controller.sysj line: 133, column: 14
                            System.out.println("Canister above bottle");//sysj\controller.sysj line: 136, column: 8
                            receivedPercentage.setPresent();//sysj\controller.sysj line: 140, column: 8
                            currsigs.addElement(receivedPercentage);
                            receivedPercentage.setValue(recPercentLiq_thread_8.get(canisterNum_thread_8 - 1));//sysj\controller.sysj line: 140, column: 8
                            S11457=2;
                            valveInletOnOff.setPresent();//sysj\controller.sysj line: 144, column: 9
                            currsigs.addElement(valveInletOnOff);
                            active[8]=1;
                            ends[8]=1;
                            break RUN;
                          }
                          else {
                            thread116622(tdone,ends);
                            thread116623(tdone,ends);
                            int biggest116624 = 0;
                            if(ends[9]>=biggest116624){
                              biggest116624=ends[9];
                            }
                            if(ends[10]>=biggest116624){
                              biggest116624=ends[10];
                            }
                            if(biggest116624 == 1){
                              active[8]=1;
                              ends[8]=1;
                              break RUN;
                            }
                            //FINXME code
                            if(biggest116624 == 0){
                              System.out.println("Canister above bottle");//sysj\controller.sysj line: 136, column: 8
                              receivedPercentage.setPresent();//sysj\controller.sysj line: 140, column: 8
                              currsigs.addElement(receivedPercentage);
                              receivedPercentage.setValue(recPercentLiq_thread_8.get(canisterNum_thread_8 - 1));//sysj\controller.sysj line: 140, column: 8
                              S11457=2;
                              valveInletOnOff.setPresent();//sysj\controller.sysj line: 144, column: 9
                              currsigs.addElement(valveInletOnOff);
                              active[8]=1;
                              ends[8]=1;
                              break RUN;
                            }
                          }
                        
                        case 2 : 
                          if(dosUnitFilled.getprestatus()){//sysj\controller.sysj line: 143, column: 14
                            System.out.println("Bottle controller filled");//sysj\controller.sysj line: 147, column: 8
                            S11457=3;
                            thread116625(tdone,ends);
                            thread116626(tdone,ends);
                            int biggest116627 = 0;
                            if(ends[11]>=biggest116627){
                              biggest116627=ends[11];
                            }
                            if(ends[12]>=biggest116627){
                              biggest116627=ends[12];
                            }
                            if(biggest116627 == 1){
                              active[8]=1;
                              ends[8]=1;
                              break RUN;
                            }
                          }
                          else {
                            valveInletOnOff.setPresent();//sysj\controller.sysj line: 144, column: 9
                            currsigs.addElement(valveInletOnOff);
                            active[8]=1;
                            ends[8]=1;
                            break RUN;
                          }
                        
                        case 3 : 
                          if(dosUnitEvac.getprestatus()){//sysj\controller.sysj line: 149, column: 14
                            System.out.println("Canister returned");//sysj\controller.sysj line: 152, column: 8
                            canisterNum_thread_8 += 1;//sysj\controller.sysj line: 154, column: 8
                            S11457=4;
                            active[8]=1;
                            ends[8]=1;
                            break RUN;
                          }
                          else {
                            thread116628(tdone,ends);
                            thread116629(tdone,ends);
                            int biggest116630 = 0;
                            if(ends[11]>=biggest116630){
                              biggest116630=ends[11];
                            }
                            if(ends[12]>=biggest116630){
                              biggest116630=ends[12];
                            }
                            if(biggest116630 == 1){
                              active[8]=1;
                              ends[8]=1;
                              break RUN;
                            }
                            //FINXME code
                            if(biggest116630 == 0){
                              System.out.println("Canister returned");//sysj\controller.sysj line: 152, column: 8
                              canisterNum_thread_8 += 1;//sysj\controller.sysj line: 154, column: 8
                              S11457=4;
                              active[8]=1;
                              ends[8]=1;
                              break RUN;
                            }
                          }
                        
                        case 4 : 
                          S11457=4;
                          if(canisterNum_thread_8 < 5){//sysj\controller.sysj line: 125, column: 12
                            S11457=0;
                            System.out.println("selecting canister " + canisterNum_thread_8);//sysj\controller.sysj line: 128, column: 8
                            selectCanister.setPresent();//sysj\controller.sysj line: 129, column: 9
                            currsigs.addElement(selectCanister);
                            selectCanister.setValue(canisterNum_thread_8);//sysj\controller.sysj line: 129, column: 9
                            active[8]=1;
                            ends[8]=1;
                            break RUN;
                          }
                          else {
                            ends[8]=2;
                            ;//sysj\controller.sysj line: 125, column: 6
                            S11338=3;
                            S12627=0;
                            if(!fillerStatus_o.isPartnerPresent() || fillerStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 157, column: 6
                              fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 157, column: 6
                              S12627=1;
                              active[8]=1;
                              ends[8]=1;
                              break RUN;
                            }
                            else {
                              S12622=0;
                              if(fillerStatus_o.isACK()){//sysj\controller.sysj line: 157, column: 6
                                fillerStatus_o.setVal("done");//sysj\controller.sysj line: 157, column: 6
                                S12622=1;
                                if(!fillerStatus_o.isACK()){//sysj\controller.sysj line: 157, column: 6
                                  fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 157, column: 6
                                  ends[8]=2;
                                  ;//sysj\controller.sysj line: 157, column: 6
                                  S11270=2;
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
                      switch(S12627){
                        case 0 : 
                          if(!fillerStatus_o.isPartnerPresent() || fillerStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 157, column: 6
                            fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 157, column: 6
                            S12627=1;
                            active[8]=1;
                            ends[8]=1;
                            break RUN;
                          }
                          else {
                            switch(S12622){
                              case 0 : 
                                if(fillerStatus_o.isACK()){//sysj\controller.sysj line: 157, column: 6
                                  fillerStatus_o.setVal("done");//sysj\controller.sysj line: 157, column: 6
                                  S12622=1;
                                  if(!fillerStatus_o.isACK()){//sysj\controller.sysj line: 157, column: 6
                                    fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 157, column: 6
                                    ends[8]=2;
                                    ;//sysj\controller.sysj line: 157, column: 6
                                    S11270=2;
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
                                if(!fillerStatus_o.isACK()){//sysj\controller.sysj line: 157, column: 6
                                  fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 157, column: 6
                                  ends[8]=2;
                                  ;//sysj\controller.sysj line: 157, column: 6
                                  S11270=2;
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
                          S12627=1;
                          S12627=0;
                          if(!fillerStatus_o.isPartnerPresent() || fillerStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 157, column: 6
                            fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 157, column: 6
                            S12627=1;
                            active[8]=1;
                            ends[8]=1;
                            break RUN;
                          }
                          else {
                            S12622=0;
                            if(fillerStatus_o.isACK()){//sysj\controller.sysj line: 157, column: 6
                              fillerStatus_o.setVal("done");//sysj\controller.sysj line: 157, column: 6
                              S12622=1;
                              if(!fillerStatus_o.isACK()){//sysj\controller.sysj line: 157, column: 6
                                fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 157, column: 6
                                ends[8]=2;
                                ;//sysj\controller.sysj line: 157, column: 6
                                S11270=2;
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
              S11270=2;
              S11270=0;
              S11254=0;
              if(!fillerReq_in.isPartnerPresent() || fillerReq_in.isPartnerPreempted()){//sysj\controller.sysj line: 108, column: 3
                fillerReq_in.setACK(false);//sysj\controller.sysj line: 108, column: 3
                S11254=1;
                active[8]=1;
                ends[8]=1;
                break RUN;
              }
              else {
                S11249=0;
                if(!fillerReq_in.isREQ()){//sysj\controller.sysj line: 108, column: 3
                  fillerReq_in.setACK(true);//sysj\controller.sysj line: 108, column: 3
                  S11249=1;
                  if(fillerReq_in.isREQ()){//sysj\controller.sysj line: 108, column: 3
                    fillerReq_in.setACK(false);//sysj\controller.sysj line: 108, column: 3
                    ends[8]=2;
                    ;//sysj\controller.sysj line: 108, column: 3
                    request_thread_8 = (fillerReq_in.getVal() == null ? null : ((Boolean)fillerReq_in.getVal()));//sysj\controller.sysj line: 109, column: 3
                    S11270=1;
                    if(request_thread_8){//sysj\controller.sysj line: 111, column: 3
                      S18704=0;
                      if(!bottleAtPos2.getprestatus()){//sysj\controller.sysj line: 113, column: 13
                        S11277=0;
                        if(!fillerStatus_o.isPartnerPresent() || fillerStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 114, column: 6
                          fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 114, column: 6
                          S11277=1;
                          active[8]=1;
                          ends[8]=1;
                          break RUN;
                        }
                        else {
                          S11272=0;
                          if(fillerStatus_o.isACK()){//sysj\controller.sysj line: 114, column: 6
                            fillerStatus_o.setVal("idle");//sysj\controller.sysj line: 114, column: 6
                            S11272=1;
                            if(!fillerStatus_o.isACK()){//sysj\controller.sysj line: 114, column: 6
                              fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 114, column: 6
                              ends[8]=2;
                              ;//sysj\controller.sysj line: 114, column: 6
                              S18704=1;
                              if(bottleAtPos2.getprestatus()){//sysj\controller.sysj line: 118, column: 13
                                System.out.println("bottle is at pos 2");//sysj\controller.sysj line: 119, column: 6
                                S11338=0;
                                S11300=0;
                                if(!fillerStatus_o.isPartnerPresent() || fillerStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 120, column: 6
                                  fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 120, column: 6
                                  S11300=1;
                                  active[8]=1;
                                  ends[8]=1;
                                  break RUN;
                                }
                                else {
                                  S11295=0;
                                  if(fillerStatus_o.isACK()){//sysj\controller.sysj line: 120, column: 6
                                    fillerStatus_o.setVal("busy");//sysj\controller.sysj line: 120, column: 6
                                    S11295=1;
                                    if(!fillerStatus_o.isACK()){//sysj\controller.sysj line: 120, column: 6
                                      fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 120, column: 6
                                      ends[8]=2;
                                      ;//sysj\controller.sysj line: 120, column: 6
                                      S11338=1;
                                      S11345=0;
                                      if(!percentLiquid_in.isPartnerPresent() || percentLiquid_in.isPartnerPreempted()){//sysj\controller.sysj line: 121, column: 6
                                        percentLiquid_in.setACK(false);//sysj\controller.sysj line: 121, column: 6
                                        S11345=1;
                                        active[8]=1;
                                        ends[8]=1;
                                        break RUN;
                                      }
                                      else {
                                        S11340=0;
                                        if(!percentLiquid_in.isREQ()){//sysj\controller.sysj line: 121, column: 6
                                          percentLiquid_in.setACK(true);//sysj\controller.sysj line: 121, column: 6
                                          S11340=1;
                                          if(percentLiquid_in.isREQ()){//sysj\controller.sysj line: 121, column: 6
                                            percentLiquid_in.setACK(false);//sysj\controller.sysj line: 121, column: 6
                                            ends[8]=2;
                                            ;//sysj\controller.sysj line: 121, column: 6
                                            recPercentLiq_thread_8 = (ArrayList)(percentLiquid_in.getVal() == null ? null : ((ArrayList)percentLiquid_in.getVal()));//sysj\controller.sysj line: 122, column: 6
                                            canisterNum_thread_8 = 1;//sysj\controller.sysj line: 123, column: 6
                                            S11338=2;
                                            if(canisterNum_thread_8 < 5){//sysj\controller.sysj line: 125, column: 12
                                              S11457=0;
                                              System.out.println("selecting canister " + canisterNum_thread_8);//sysj\controller.sysj line: 128, column: 8
                                              selectCanister.setPresent();//sysj\controller.sysj line: 129, column: 9
                                              currsigs.addElement(selectCanister);
                                              selectCanister.setValue(canisterNum_thread_8);//sysj\controller.sysj line: 129, column: 9
                                              active[8]=1;
                                              ends[8]=1;
                                              break RUN;
                                            }
                                            else {
                                              ends[8]=2;
                                              ;//sysj\controller.sysj line: 125, column: 6
                                              S11338=3;
                                              S12627=0;
                                              if(!fillerStatus_o.isPartnerPresent() || fillerStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 157, column: 6
                                                fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 157, column: 6
                                                S12627=1;
                                                active[8]=1;
                                                ends[8]=1;
                                                break RUN;
                                              }
                                              else {
                                                S12622=0;
                                                if(fillerStatus_o.isACK()){//sysj\controller.sysj line: 157, column: 6
                                                  fillerStatus_o.setVal("done");//sysj\controller.sysj line: 157, column: 6
                                                  S12622=1;
                                                  if(!fillerStatus_o.isACK()){//sysj\controller.sysj line: 157, column: 6
                                                    fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 157, column: 6
                                                    ends[8]=2;
                                                    ;//sysj\controller.sysj line: 157, column: 6
                                                    S11270=2;
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
                                S11270=2;
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
                        S18704=1;
                        if(bottleAtPos2.getprestatus()){//sysj\controller.sysj line: 118, column: 13
                          System.out.println("bottle is at pos 2");//sysj\controller.sysj line: 119, column: 6
                          S11338=0;
                          S11300=0;
                          if(!fillerStatus_o.isPartnerPresent() || fillerStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 120, column: 6
                            fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 120, column: 6
                            S11300=1;
                            active[8]=1;
                            ends[8]=1;
                            break RUN;
                          }
                          else {
                            S11295=0;
                            if(fillerStatus_o.isACK()){//sysj\controller.sysj line: 120, column: 6
                              fillerStatus_o.setVal("busy");//sysj\controller.sysj line: 120, column: 6
                              S11295=1;
                              if(!fillerStatus_o.isACK()){//sysj\controller.sysj line: 120, column: 6
                                fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 120, column: 6
                                ends[8]=2;
                                ;//sysj\controller.sysj line: 120, column: 6
                                S11338=1;
                                S11345=0;
                                if(!percentLiquid_in.isPartnerPresent() || percentLiquid_in.isPartnerPreempted()){//sysj\controller.sysj line: 121, column: 6
                                  percentLiquid_in.setACK(false);//sysj\controller.sysj line: 121, column: 6
                                  S11345=1;
                                  active[8]=1;
                                  ends[8]=1;
                                  break RUN;
                                }
                                else {
                                  S11340=0;
                                  if(!percentLiquid_in.isREQ()){//sysj\controller.sysj line: 121, column: 6
                                    percentLiquid_in.setACK(true);//sysj\controller.sysj line: 121, column: 6
                                    S11340=1;
                                    if(percentLiquid_in.isREQ()){//sysj\controller.sysj line: 121, column: 6
                                      percentLiquid_in.setACK(false);//sysj\controller.sysj line: 121, column: 6
                                      ends[8]=2;
                                      ;//sysj\controller.sysj line: 121, column: 6
                                      recPercentLiq_thread_8 = (ArrayList)(percentLiquid_in.getVal() == null ? null : ((ArrayList)percentLiquid_in.getVal()));//sysj\controller.sysj line: 122, column: 6
                                      canisterNum_thread_8 = 1;//sysj\controller.sysj line: 123, column: 6
                                      S11338=2;
                                      if(canisterNum_thread_8 < 5){//sysj\controller.sysj line: 125, column: 12
                                        S11457=0;
                                        System.out.println("selecting canister " + canisterNum_thread_8);//sysj\controller.sysj line: 128, column: 8
                                        selectCanister.setPresent();//sysj\controller.sysj line: 129, column: 9
                                        currsigs.addElement(selectCanister);
                                        selectCanister.setValue(canisterNum_thread_8);//sysj\controller.sysj line: 129, column: 9
                                        active[8]=1;
                                        ends[8]=1;
                                        break RUN;
                                      }
                                      else {
                                        ends[8]=2;
                                        ;//sysj\controller.sysj line: 125, column: 6
                                        S11338=3;
                                        S12627=0;
                                        if(!fillerStatus_o.isPartnerPresent() || fillerStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 157, column: 6
                                          fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 157, column: 6
                                          S12627=1;
                                          active[8]=1;
                                          ends[8]=1;
                                          break RUN;
                                        }
                                        else {
                                          S12622=0;
                                          if(fillerStatus_o.isACK()){//sysj\controller.sysj line: 157, column: 6
                                            fillerStatus_o.setVal("done");//sysj\controller.sysj line: 157, column: 6
                                            S12622=1;
                                            if(!fillerStatus_o.isACK()){//sysj\controller.sysj line: 157, column: 6
                                              fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 157, column: 6
                                              ends[8]=2;
                                              ;//sysj\controller.sysj line: 157, column: 6
                                              S11270=2;
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
                          S11270=2;
                          active[8]=1;
                          ends[8]=1;
                          break RUN;
                        }
                      }
                    }
                    else {
                      S11270=2;
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
