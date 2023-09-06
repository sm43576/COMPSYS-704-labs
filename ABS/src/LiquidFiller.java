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
  private Boolean request_thread_8;//sysj\controller.sysj line: 108, column: 3
  private ArrayList recPercentLiq_thread_8;//sysj\controller.sysj line: 121, column: 6
  private int canisterNum_thread_8;//sysj\controller.sysj line: 122, column: 6
  private int S99434 = 1;
  private int S10166 = 1;
  private int S10150 = 1;
  private int S10145 = 1;
  private int S17600 = 1;
  private int S10173 = 1;
  private int S10168 = 1;
  private int S10234 = 1;
  private int S10196 = 1;
  private int S10191 = 1;
  private int S10241 = 1;
  private int S10236 = 1;
  private int S10353 = 1;
  private int S10335 = 1;
  private int S10340 = 1;
  private int S10370 = 1;
  private int S10375 = 1;
  private int S11523 = 1;
  private int S11518 = 1;
  
  private int[] ends = new int[23];
  private int[] tdone = new int[23];
  
  public void thread115525(int [] tdone, int [] ends){
        switch(S10375){
      case 0 : 
        active[12]=0;
        ends[12]=0;
        tdone[12]=1;
        break;
      
      case 1 : 
        valveInjectorOnOff.setPresent();//sysj\controller.sysj line: 149, column: 43
        currsigs.addElement(valveInjectorOnOff);
        active[12]=1;
        ends[12]=1;
        tdone[12]=1;
        break;
      
    }
  }

  public void thread115524(int [] tdone, int [] ends){
        switch(S10370){
      case 0 : 
        active[11]=0;
        ends[11]=0;
        tdone[11]=1;
        break;
      
      case 1 : 
        dosUnitValveExtend.setPresent();//sysj\controller.sysj line: 149, column: 10
        currsigs.addElement(dosUnitValveExtend);
        active[11]=1;
        ends[11]=1;
        tdone[11]=1;
        break;
      
    }
  }

  public void thread115522(int [] tdone, int [] ends){
        S10375=1;
    valveInjectorOnOff.setPresent();//sysj\controller.sysj line: 149, column: 43
    currsigs.addElement(valveInjectorOnOff);
    active[12]=1;
    ends[12]=1;
    tdone[12]=1;
  }

  public void thread115521(int [] tdone, int [] ends){
        S10370=1;
    dosUnitValveExtend.setPresent();//sysj\controller.sysj line: 149, column: 10
    currsigs.addElement(dosUnitValveExtend);
    active[11]=1;
    ends[11]=1;
    tdone[11]=1;
  }

  public void thread115519(int [] tdone, int [] ends){
        switch(S10340){
      case 0 : 
        active[10]=0;
        ends[10]=0;
        tdone[10]=1;
        break;
      
      case 1 : 
        valveInjectorOnOff.setPresent();//sysj\controller.sysj line: 133, column: 44
        currsigs.addElement(valveInjectorOnOff);
        active[10]=1;
        ends[10]=1;
        tdone[10]=1;
        break;
      
    }
  }

  public void thread115518(int [] tdone, int [] ends){
        switch(S10335){
      case 0 : 
        active[9]=0;
        ends[9]=0;
        tdone[9]=1;
        break;
      
      case 1 : 
        dosUnitValveRetract.setPresent();//sysj\controller.sysj line: 133, column: 10
        currsigs.addElement(dosUnitValveRetract);
        active[9]=1;
        ends[9]=1;
        tdone[9]=1;
        break;
      
    }
  }

  public void thread115516(int [] tdone, int [] ends){
        S10340=1;
    valveInjectorOnOff.setPresent();//sysj\controller.sysj line: 133, column: 44
    currsigs.addElement(valveInjectorOnOff);
    active[10]=1;
    ends[10]=1;
    tdone[10]=1;
  }

  public void thread115515(int [] tdone, int [] ends){
        S10335=1;
    dosUnitValveRetract.setPresent();//sysj\controller.sysj line: 133, column: 10
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
      switch(S99434){
        case 0 : 
          S99434=0;
          break RUN;
        
        case 1 : 
          S99434=2;
          S99434=2;
          S10166=0;
          S10150=0;
          if(!fillerReq_in.isPartnerPresent() || fillerReq_in.isPartnerPreempted()){//sysj\controller.sysj line: 107, column: 3
            fillerReq_in.setACK(false);//sysj\controller.sysj line: 107, column: 3
            S10150=1;
            active[8]=1;
            ends[8]=1;
            break RUN;
          }
          else {
            S10145=0;
            if(!fillerReq_in.isREQ()){//sysj\controller.sysj line: 107, column: 3
              fillerReq_in.setACK(true);//sysj\controller.sysj line: 107, column: 3
              S10145=1;
              if(fillerReq_in.isREQ()){//sysj\controller.sysj line: 107, column: 3
                fillerReq_in.setACK(false);//sysj\controller.sysj line: 107, column: 3
                ends[8]=2;
                ;//sysj\controller.sysj line: 107, column: 3
                request_thread_8 = (fillerReq_in.getVal() == null ? null : ((Boolean)fillerReq_in.getVal()));//sysj\controller.sysj line: 108, column: 3
                S10166=1;
                if(request_thread_8){//sysj\controller.sysj line: 110, column: 3
                  S17600=0;
                  if(!bottleAtPos2.getprestatus()){//sysj\controller.sysj line: 112, column: 13
                    S10173=0;
                    if(!fillerStatus_o.isPartnerPresent() || fillerStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 113, column: 6
                      fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 113, column: 6
                      S10173=1;
                      active[8]=1;
                      ends[8]=1;
                      break RUN;
                    }
                    else {
                      S10168=0;
                      if(fillerStatus_o.isACK()){//sysj\controller.sysj line: 113, column: 6
                        fillerStatus_o.setVal("idle");//sysj\controller.sysj line: 113, column: 6
                        S10168=1;
                        if(!fillerStatus_o.isACK()){//sysj\controller.sysj line: 113, column: 6
                          fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 113, column: 6
                          ends[8]=2;
                          ;//sysj\controller.sysj line: 113, column: 6
                          S17600=1;
                          if(bottleAtPos2.getprestatus()){//sysj\controller.sysj line: 117, column: 13
                            System.out.println("bottle is at pos 2");//sysj\controller.sysj line: 118, column: 6
                            S10234=0;
                            S10196=0;
                            if(!fillerStatus_o.isPartnerPresent() || fillerStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 119, column: 6
                              fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 119, column: 6
                              S10196=1;
                              active[8]=1;
                              ends[8]=1;
                              break RUN;
                            }
                            else {
                              S10191=0;
                              if(fillerStatus_o.isACK()){//sysj\controller.sysj line: 119, column: 6
                                fillerStatus_o.setVal("busy");//sysj\controller.sysj line: 119, column: 6
                                S10191=1;
                                if(!fillerStatus_o.isACK()){//sysj\controller.sysj line: 119, column: 6
                                  fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 119, column: 6
                                  ends[8]=2;
                                  ;//sysj\controller.sysj line: 119, column: 6
                                  S10234=1;
                                  S10241=0;
                                  if(!percentLiquid_in.isPartnerPresent() || percentLiquid_in.isPartnerPreempted()){//sysj\controller.sysj line: 120, column: 6
                                    percentLiquid_in.setACK(false);//sysj\controller.sysj line: 120, column: 6
                                    S10241=1;
                                    active[8]=1;
                                    ends[8]=1;
                                    break RUN;
                                  }
                                  else {
                                    S10236=0;
                                    if(!percentLiquid_in.isREQ()){//sysj\controller.sysj line: 120, column: 6
                                      percentLiquid_in.setACK(true);//sysj\controller.sysj line: 120, column: 6
                                      S10236=1;
                                      if(percentLiquid_in.isREQ()){//sysj\controller.sysj line: 120, column: 6
                                        percentLiquid_in.setACK(false);//sysj\controller.sysj line: 120, column: 6
                                        ends[8]=2;
                                        ;//sysj\controller.sysj line: 120, column: 6
                                        recPercentLiq_thread_8 = (ArrayList)(percentLiquid_in.getVal() == null ? null : ((ArrayList)percentLiquid_in.getVal()));//sysj\controller.sysj line: 121, column: 6
                                        canisterNum_thread_8 = 1;//sysj\controller.sysj line: 122, column: 6
                                        S10234=2;
                                        if(canisterNum_thread_8 < 5){//sysj\controller.sysj line: 124, column: 12
                                          S10353=0;
                                          System.out.println("selecting canister " + canisterNum_thread_8);//sysj\controller.sysj line: 127, column: 8
                                          selectCanister.setPresent();//sysj\controller.sysj line: 128, column: 9
                                          currsigs.addElement(selectCanister);
                                          selectCanister.setValue(canisterNum_thread_8);//sysj\controller.sysj line: 128, column: 9
                                          active[8]=1;
                                          ends[8]=1;
                                          break RUN;
                                        }
                                        else {
                                          ends[8]=2;
                                          ;//sysj\controller.sysj line: 124, column: 6
                                          S10234=3;
                                          S11523=0;
                                          if(!fillerStatus_o.isPartnerPresent() || fillerStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 156, column: 6
                                            fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 156, column: 6
                                            S11523=1;
                                            active[8]=1;
                                            ends[8]=1;
                                            break RUN;
                                          }
                                          else {
                                            S11518=0;
                                            if(fillerStatus_o.isACK()){//sysj\controller.sysj line: 156, column: 6
                                              fillerStatus_o.setVal("done");//sysj\controller.sysj line: 156, column: 6
                                              S11518=1;
                                              if(!fillerStatus_o.isACK()){//sysj\controller.sysj line: 156, column: 6
                                                fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 156, column: 6
                                                ends[8]=2;
                                                ;//sysj\controller.sysj line: 156, column: 6
                                                S10166=2;
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
                            S10166=2;
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
                    S17600=1;
                    if(bottleAtPos2.getprestatus()){//sysj\controller.sysj line: 117, column: 13
                      System.out.println("bottle is at pos 2");//sysj\controller.sysj line: 118, column: 6
                      S10234=0;
                      S10196=0;
                      if(!fillerStatus_o.isPartnerPresent() || fillerStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 119, column: 6
                        fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 119, column: 6
                        S10196=1;
                        active[8]=1;
                        ends[8]=1;
                        break RUN;
                      }
                      else {
                        S10191=0;
                        if(fillerStatus_o.isACK()){//sysj\controller.sysj line: 119, column: 6
                          fillerStatus_o.setVal("busy");//sysj\controller.sysj line: 119, column: 6
                          S10191=1;
                          if(!fillerStatus_o.isACK()){//sysj\controller.sysj line: 119, column: 6
                            fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 119, column: 6
                            ends[8]=2;
                            ;//sysj\controller.sysj line: 119, column: 6
                            S10234=1;
                            S10241=0;
                            if(!percentLiquid_in.isPartnerPresent() || percentLiquid_in.isPartnerPreempted()){//sysj\controller.sysj line: 120, column: 6
                              percentLiquid_in.setACK(false);//sysj\controller.sysj line: 120, column: 6
                              S10241=1;
                              active[8]=1;
                              ends[8]=1;
                              break RUN;
                            }
                            else {
                              S10236=0;
                              if(!percentLiquid_in.isREQ()){//sysj\controller.sysj line: 120, column: 6
                                percentLiquid_in.setACK(true);//sysj\controller.sysj line: 120, column: 6
                                S10236=1;
                                if(percentLiquid_in.isREQ()){//sysj\controller.sysj line: 120, column: 6
                                  percentLiquid_in.setACK(false);//sysj\controller.sysj line: 120, column: 6
                                  ends[8]=2;
                                  ;//sysj\controller.sysj line: 120, column: 6
                                  recPercentLiq_thread_8 = (ArrayList)(percentLiquid_in.getVal() == null ? null : ((ArrayList)percentLiquid_in.getVal()));//sysj\controller.sysj line: 121, column: 6
                                  canisterNum_thread_8 = 1;//sysj\controller.sysj line: 122, column: 6
                                  S10234=2;
                                  if(canisterNum_thread_8 < 5){//sysj\controller.sysj line: 124, column: 12
                                    S10353=0;
                                    System.out.println("selecting canister " + canisterNum_thread_8);//sysj\controller.sysj line: 127, column: 8
                                    selectCanister.setPresent();//sysj\controller.sysj line: 128, column: 9
                                    currsigs.addElement(selectCanister);
                                    selectCanister.setValue(canisterNum_thread_8);//sysj\controller.sysj line: 128, column: 9
                                    active[8]=1;
                                    ends[8]=1;
                                    break RUN;
                                  }
                                  else {
                                    ends[8]=2;
                                    ;//sysj\controller.sysj line: 124, column: 6
                                    S10234=3;
                                    S11523=0;
                                    if(!fillerStatus_o.isPartnerPresent() || fillerStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 156, column: 6
                                      fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 156, column: 6
                                      S11523=1;
                                      active[8]=1;
                                      ends[8]=1;
                                      break RUN;
                                    }
                                    else {
                                      S11518=0;
                                      if(fillerStatus_o.isACK()){//sysj\controller.sysj line: 156, column: 6
                                        fillerStatus_o.setVal("done");//sysj\controller.sysj line: 156, column: 6
                                        S11518=1;
                                        if(!fillerStatus_o.isACK()){//sysj\controller.sysj line: 156, column: 6
                                          fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 156, column: 6
                                          ends[8]=2;
                                          ;//sysj\controller.sysj line: 156, column: 6
                                          S10166=2;
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
                      S10166=2;
                      active[8]=1;
                      ends[8]=1;
                      break RUN;
                    }
                  }
                }
                else {
                  S10166=2;
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
          switch(S10166){
            case 0 : 
              switch(S10150){
                case 0 : 
                  if(!fillerReq_in.isPartnerPresent() || fillerReq_in.isPartnerPreempted()){//sysj\controller.sysj line: 107, column: 3
                    fillerReq_in.setACK(false);//sysj\controller.sysj line: 107, column: 3
                    S10150=1;
                    active[8]=1;
                    ends[8]=1;
                    break RUN;
                  }
                  else {
                    switch(S10145){
                      case 0 : 
                        if(!fillerReq_in.isREQ()){//sysj\controller.sysj line: 107, column: 3
                          fillerReq_in.setACK(true);//sysj\controller.sysj line: 107, column: 3
                          S10145=1;
                          if(fillerReq_in.isREQ()){//sysj\controller.sysj line: 107, column: 3
                            fillerReq_in.setACK(false);//sysj\controller.sysj line: 107, column: 3
                            ends[8]=2;
                            ;//sysj\controller.sysj line: 107, column: 3
                            request_thread_8 = (fillerReq_in.getVal() == null ? null : ((Boolean)fillerReq_in.getVal()));//sysj\controller.sysj line: 108, column: 3
                            S10166=1;
                            if(request_thread_8){//sysj\controller.sysj line: 110, column: 3
                              S17600=0;
                              if(!bottleAtPos2.getprestatus()){//sysj\controller.sysj line: 112, column: 13
                                S10173=0;
                                if(!fillerStatus_o.isPartnerPresent() || fillerStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 113, column: 6
                                  fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 113, column: 6
                                  S10173=1;
                                  active[8]=1;
                                  ends[8]=1;
                                  break RUN;
                                }
                                else {
                                  S10168=0;
                                  if(fillerStatus_o.isACK()){//sysj\controller.sysj line: 113, column: 6
                                    fillerStatus_o.setVal("idle");//sysj\controller.sysj line: 113, column: 6
                                    S10168=1;
                                    if(!fillerStatus_o.isACK()){//sysj\controller.sysj line: 113, column: 6
                                      fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 113, column: 6
                                      ends[8]=2;
                                      ;//sysj\controller.sysj line: 113, column: 6
                                      S17600=1;
                                      if(bottleAtPos2.getprestatus()){//sysj\controller.sysj line: 117, column: 13
                                        System.out.println("bottle is at pos 2");//sysj\controller.sysj line: 118, column: 6
                                        S10234=0;
                                        S10196=0;
                                        if(!fillerStatus_o.isPartnerPresent() || fillerStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 119, column: 6
                                          fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 119, column: 6
                                          S10196=1;
                                          active[8]=1;
                                          ends[8]=1;
                                          break RUN;
                                        }
                                        else {
                                          S10191=0;
                                          if(fillerStatus_o.isACK()){//sysj\controller.sysj line: 119, column: 6
                                            fillerStatus_o.setVal("busy");//sysj\controller.sysj line: 119, column: 6
                                            S10191=1;
                                            if(!fillerStatus_o.isACK()){//sysj\controller.sysj line: 119, column: 6
                                              fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 119, column: 6
                                              ends[8]=2;
                                              ;//sysj\controller.sysj line: 119, column: 6
                                              S10234=1;
                                              S10241=0;
                                              if(!percentLiquid_in.isPartnerPresent() || percentLiquid_in.isPartnerPreempted()){//sysj\controller.sysj line: 120, column: 6
                                                percentLiquid_in.setACK(false);//sysj\controller.sysj line: 120, column: 6
                                                S10241=1;
                                                active[8]=1;
                                                ends[8]=1;
                                                break RUN;
                                              }
                                              else {
                                                S10236=0;
                                                if(!percentLiquid_in.isREQ()){//sysj\controller.sysj line: 120, column: 6
                                                  percentLiquid_in.setACK(true);//sysj\controller.sysj line: 120, column: 6
                                                  S10236=1;
                                                  if(percentLiquid_in.isREQ()){//sysj\controller.sysj line: 120, column: 6
                                                    percentLiquid_in.setACK(false);//sysj\controller.sysj line: 120, column: 6
                                                    ends[8]=2;
                                                    ;//sysj\controller.sysj line: 120, column: 6
                                                    recPercentLiq_thread_8 = (ArrayList)(percentLiquid_in.getVal() == null ? null : ((ArrayList)percentLiquid_in.getVal()));//sysj\controller.sysj line: 121, column: 6
                                                    canisterNum_thread_8 = 1;//sysj\controller.sysj line: 122, column: 6
                                                    S10234=2;
                                                    if(canisterNum_thread_8 < 5){//sysj\controller.sysj line: 124, column: 12
                                                      S10353=0;
                                                      System.out.println("selecting canister " + canisterNum_thread_8);//sysj\controller.sysj line: 127, column: 8
                                                      selectCanister.setPresent();//sysj\controller.sysj line: 128, column: 9
                                                      currsigs.addElement(selectCanister);
                                                      selectCanister.setValue(canisterNum_thread_8);//sysj\controller.sysj line: 128, column: 9
                                                      active[8]=1;
                                                      ends[8]=1;
                                                      break RUN;
                                                    }
                                                    else {
                                                      ends[8]=2;
                                                      ;//sysj\controller.sysj line: 124, column: 6
                                                      S10234=3;
                                                      S11523=0;
                                                      if(!fillerStatus_o.isPartnerPresent() || fillerStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 156, column: 6
                                                        fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 156, column: 6
                                                        S11523=1;
                                                        active[8]=1;
                                                        ends[8]=1;
                                                        break RUN;
                                                      }
                                                      else {
                                                        S11518=0;
                                                        if(fillerStatus_o.isACK()){//sysj\controller.sysj line: 156, column: 6
                                                          fillerStatus_o.setVal("done");//sysj\controller.sysj line: 156, column: 6
                                                          S11518=1;
                                                          if(!fillerStatus_o.isACK()){//sysj\controller.sysj line: 156, column: 6
                                                            fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 156, column: 6
                                                            ends[8]=2;
                                                            ;//sysj\controller.sysj line: 156, column: 6
                                                            S10166=2;
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
                                        S10166=2;
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
                                S17600=1;
                                if(bottleAtPos2.getprestatus()){//sysj\controller.sysj line: 117, column: 13
                                  System.out.println("bottle is at pos 2");//sysj\controller.sysj line: 118, column: 6
                                  S10234=0;
                                  S10196=0;
                                  if(!fillerStatus_o.isPartnerPresent() || fillerStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 119, column: 6
                                    fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 119, column: 6
                                    S10196=1;
                                    active[8]=1;
                                    ends[8]=1;
                                    break RUN;
                                  }
                                  else {
                                    S10191=0;
                                    if(fillerStatus_o.isACK()){//sysj\controller.sysj line: 119, column: 6
                                      fillerStatus_o.setVal("busy");//sysj\controller.sysj line: 119, column: 6
                                      S10191=1;
                                      if(!fillerStatus_o.isACK()){//sysj\controller.sysj line: 119, column: 6
                                        fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 119, column: 6
                                        ends[8]=2;
                                        ;//sysj\controller.sysj line: 119, column: 6
                                        S10234=1;
                                        S10241=0;
                                        if(!percentLiquid_in.isPartnerPresent() || percentLiquid_in.isPartnerPreempted()){//sysj\controller.sysj line: 120, column: 6
                                          percentLiquid_in.setACK(false);//sysj\controller.sysj line: 120, column: 6
                                          S10241=1;
                                          active[8]=1;
                                          ends[8]=1;
                                          break RUN;
                                        }
                                        else {
                                          S10236=0;
                                          if(!percentLiquid_in.isREQ()){//sysj\controller.sysj line: 120, column: 6
                                            percentLiquid_in.setACK(true);//sysj\controller.sysj line: 120, column: 6
                                            S10236=1;
                                            if(percentLiquid_in.isREQ()){//sysj\controller.sysj line: 120, column: 6
                                              percentLiquid_in.setACK(false);//sysj\controller.sysj line: 120, column: 6
                                              ends[8]=2;
                                              ;//sysj\controller.sysj line: 120, column: 6
                                              recPercentLiq_thread_8 = (ArrayList)(percentLiquid_in.getVal() == null ? null : ((ArrayList)percentLiquid_in.getVal()));//sysj\controller.sysj line: 121, column: 6
                                              canisterNum_thread_8 = 1;//sysj\controller.sysj line: 122, column: 6
                                              S10234=2;
                                              if(canisterNum_thread_8 < 5){//sysj\controller.sysj line: 124, column: 12
                                                S10353=0;
                                                System.out.println("selecting canister " + canisterNum_thread_8);//sysj\controller.sysj line: 127, column: 8
                                                selectCanister.setPresent();//sysj\controller.sysj line: 128, column: 9
                                                currsigs.addElement(selectCanister);
                                                selectCanister.setValue(canisterNum_thread_8);//sysj\controller.sysj line: 128, column: 9
                                                active[8]=1;
                                                ends[8]=1;
                                                break RUN;
                                              }
                                              else {
                                                ends[8]=2;
                                                ;//sysj\controller.sysj line: 124, column: 6
                                                S10234=3;
                                                S11523=0;
                                                if(!fillerStatus_o.isPartnerPresent() || fillerStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 156, column: 6
                                                  fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 156, column: 6
                                                  S11523=1;
                                                  active[8]=1;
                                                  ends[8]=1;
                                                  break RUN;
                                                }
                                                else {
                                                  S11518=0;
                                                  if(fillerStatus_o.isACK()){//sysj\controller.sysj line: 156, column: 6
                                                    fillerStatus_o.setVal("done");//sysj\controller.sysj line: 156, column: 6
                                                    S11518=1;
                                                    if(!fillerStatus_o.isACK()){//sysj\controller.sysj line: 156, column: 6
                                                      fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 156, column: 6
                                                      ends[8]=2;
                                                      ;//sysj\controller.sysj line: 156, column: 6
                                                      S10166=2;
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
                                  S10166=2;
                                  active[8]=1;
                                  ends[8]=1;
                                  break RUN;
                                }
                              }
                            }
                            else {
                              S10166=2;
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
                        if(fillerReq_in.isREQ()){//sysj\controller.sysj line: 107, column: 3
                          fillerReq_in.setACK(false);//sysj\controller.sysj line: 107, column: 3
                          ends[8]=2;
                          ;//sysj\controller.sysj line: 107, column: 3
                          request_thread_8 = (fillerReq_in.getVal() == null ? null : ((Boolean)fillerReq_in.getVal()));//sysj\controller.sysj line: 108, column: 3
                          S10166=1;
                          if(request_thread_8){//sysj\controller.sysj line: 110, column: 3
                            S17600=0;
                            if(!bottleAtPos2.getprestatus()){//sysj\controller.sysj line: 112, column: 13
                              S10173=0;
                              if(!fillerStatus_o.isPartnerPresent() || fillerStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 113, column: 6
                                fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 113, column: 6
                                S10173=1;
                                active[8]=1;
                                ends[8]=1;
                                break RUN;
                              }
                              else {
                                S10168=0;
                                if(fillerStatus_o.isACK()){//sysj\controller.sysj line: 113, column: 6
                                  fillerStatus_o.setVal("idle");//sysj\controller.sysj line: 113, column: 6
                                  S10168=1;
                                  if(!fillerStatus_o.isACK()){//sysj\controller.sysj line: 113, column: 6
                                    fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 113, column: 6
                                    ends[8]=2;
                                    ;//sysj\controller.sysj line: 113, column: 6
                                    S17600=1;
                                    if(bottleAtPos2.getprestatus()){//sysj\controller.sysj line: 117, column: 13
                                      System.out.println("bottle is at pos 2");//sysj\controller.sysj line: 118, column: 6
                                      S10234=0;
                                      S10196=0;
                                      if(!fillerStatus_o.isPartnerPresent() || fillerStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 119, column: 6
                                        fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 119, column: 6
                                        S10196=1;
                                        active[8]=1;
                                        ends[8]=1;
                                        break RUN;
                                      }
                                      else {
                                        S10191=0;
                                        if(fillerStatus_o.isACK()){//sysj\controller.sysj line: 119, column: 6
                                          fillerStatus_o.setVal("busy");//sysj\controller.sysj line: 119, column: 6
                                          S10191=1;
                                          if(!fillerStatus_o.isACK()){//sysj\controller.sysj line: 119, column: 6
                                            fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 119, column: 6
                                            ends[8]=2;
                                            ;//sysj\controller.sysj line: 119, column: 6
                                            S10234=1;
                                            S10241=0;
                                            if(!percentLiquid_in.isPartnerPresent() || percentLiquid_in.isPartnerPreempted()){//sysj\controller.sysj line: 120, column: 6
                                              percentLiquid_in.setACK(false);//sysj\controller.sysj line: 120, column: 6
                                              S10241=1;
                                              active[8]=1;
                                              ends[8]=1;
                                              break RUN;
                                            }
                                            else {
                                              S10236=0;
                                              if(!percentLiquid_in.isREQ()){//sysj\controller.sysj line: 120, column: 6
                                                percentLiquid_in.setACK(true);//sysj\controller.sysj line: 120, column: 6
                                                S10236=1;
                                                if(percentLiquid_in.isREQ()){//sysj\controller.sysj line: 120, column: 6
                                                  percentLiquid_in.setACK(false);//sysj\controller.sysj line: 120, column: 6
                                                  ends[8]=2;
                                                  ;//sysj\controller.sysj line: 120, column: 6
                                                  recPercentLiq_thread_8 = (ArrayList)(percentLiquid_in.getVal() == null ? null : ((ArrayList)percentLiquid_in.getVal()));//sysj\controller.sysj line: 121, column: 6
                                                  canisterNum_thread_8 = 1;//sysj\controller.sysj line: 122, column: 6
                                                  S10234=2;
                                                  if(canisterNum_thread_8 < 5){//sysj\controller.sysj line: 124, column: 12
                                                    S10353=0;
                                                    System.out.println("selecting canister " + canisterNum_thread_8);//sysj\controller.sysj line: 127, column: 8
                                                    selectCanister.setPresent();//sysj\controller.sysj line: 128, column: 9
                                                    currsigs.addElement(selectCanister);
                                                    selectCanister.setValue(canisterNum_thread_8);//sysj\controller.sysj line: 128, column: 9
                                                    active[8]=1;
                                                    ends[8]=1;
                                                    break RUN;
                                                  }
                                                  else {
                                                    ends[8]=2;
                                                    ;//sysj\controller.sysj line: 124, column: 6
                                                    S10234=3;
                                                    S11523=0;
                                                    if(!fillerStatus_o.isPartnerPresent() || fillerStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 156, column: 6
                                                      fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 156, column: 6
                                                      S11523=1;
                                                      active[8]=1;
                                                      ends[8]=1;
                                                      break RUN;
                                                    }
                                                    else {
                                                      S11518=0;
                                                      if(fillerStatus_o.isACK()){//sysj\controller.sysj line: 156, column: 6
                                                        fillerStatus_o.setVal("done");//sysj\controller.sysj line: 156, column: 6
                                                        S11518=1;
                                                        if(!fillerStatus_o.isACK()){//sysj\controller.sysj line: 156, column: 6
                                                          fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 156, column: 6
                                                          ends[8]=2;
                                                          ;//sysj\controller.sysj line: 156, column: 6
                                                          S10166=2;
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
                                      S10166=2;
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
                              S17600=1;
                              if(bottleAtPos2.getprestatus()){//sysj\controller.sysj line: 117, column: 13
                                System.out.println("bottle is at pos 2");//sysj\controller.sysj line: 118, column: 6
                                S10234=0;
                                S10196=0;
                                if(!fillerStatus_o.isPartnerPresent() || fillerStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 119, column: 6
                                  fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 119, column: 6
                                  S10196=1;
                                  active[8]=1;
                                  ends[8]=1;
                                  break RUN;
                                }
                                else {
                                  S10191=0;
                                  if(fillerStatus_o.isACK()){//sysj\controller.sysj line: 119, column: 6
                                    fillerStatus_o.setVal("busy");//sysj\controller.sysj line: 119, column: 6
                                    S10191=1;
                                    if(!fillerStatus_o.isACK()){//sysj\controller.sysj line: 119, column: 6
                                      fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 119, column: 6
                                      ends[8]=2;
                                      ;//sysj\controller.sysj line: 119, column: 6
                                      S10234=1;
                                      S10241=0;
                                      if(!percentLiquid_in.isPartnerPresent() || percentLiquid_in.isPartnerPreempted()){//sysj\controller.sysj line: 120, column: 6
                                        percentLiquid_in.setACK(false);//sysj\controller.sysj line: 120, column: 6
                                        S10241=1;
                                        active[8]=1;
                                        ends[8]=1;
                                        break RUN;
                                      }
                                      else {
                                        S10236=0;
                                        if(!percentLiquid_in.isREQ()){//sysj\controller.sysj line: 120, column: 6
                                          percentLiquid_in.setACK(true);//sysj\controller.sysj line: 120, column: 6
                                          S10236=1;
                                          if(percentLiquid_in.isREQ()){//sysj\controller.sysj line: 120, column: 6
                                            percentLiquid_in.setACK(false);//sysj\controller.sysj line: 120, column: 6
                                            ends[8]=2;
                                            ;//sysj\controller.sysj line: 120, column: 6
                                            recPercentLiq_thread_8 = (ArrayList)(percentLiquid_in.getVal() == null ? null : ((ArrayList)percentLiquid_in.getVal()));//sysj\controller.sysj line: 121, column: 6
                                            canisterNum_thread_8 = 1;//sysj\controller.sysj line: 122, column: 6
                                            S10234=2;
                                            if(canisterNum_thread_8 < 5){//sysj\controller.sysj line: 124, column: 12
                                              S10353=0;
                                              System.out.println("selecting canister " + canisterNum_thread_8);//sysj\controller.sysj line: 127, column: 8
                                              selectCanister.setPresent();//sysj\controller.sysj line: 128, column: 9
                                              currsigs.addElement(selectCanister);
                                              selectCanister.setValue(canisterNum_thread_8);//sysj\controller.sysj line: 128, column: 9
                                              active[8]=1;
                                              ends[8]=1;
                                              break RUN;
                                            }
                                            else {
                                              ends[8]=2;
                                              ;//sysj\controller.sysj line: 124, column: 6
                                              S10234=3;
                                              S11523=0;
                                              if(!fillerStatus_o.isPartnerPresent() || fillerStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 156, column: 6
                                                fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 156, column: 6
                                                S11523=1;
                                                active[8]=1;
                                                ends[8]=1;
                                                break RUN;
                                              }
                                              else {
                                                S11518=0;
                                                if(fillerStatus_o.isACK()){//sysj\controller.sysj line: 156, column: 6
                                                  fillerStatus_o.setVal("done");//sysj\controller.sysj line: 156, column: 6
                                                  S11518=1;
                                                  if(!fillerStatus_o.isACK()){//sysj\controller.sysj line: 156, column: 6
                                                    fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 156, column: 6
                                                    ends[8]=2;
                                                    ;//sysj\controller.sysj line: 156, column: 6
                                                    S10166=2;
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
                                S10166=2;
                                active[8]=1;
                                ends[8]=1;
                                break RUN;
                              }
                            }
                          }
                          else {
                            S10166=2;
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
                  S10150=1;
                  S10150=0;
                  if(!fillerReq_in.isPartnerPresent() || fillerReq_in.isPartnerPreempted()){//sysj\controller.sysj line: 107, column: 3
                    fillerReq_in.setACK(false);//sysj\controller.sysj line: 107, column: 3
                    S10150=1;
                    active[8]=1;
                    ends[8]=1;
                    break RUN;
                  }
                  else {
                    S10145=0;
                    if(!fillerReq_in.isREQ()){//sysj\controller.sysj line: 107, column: 3
                      fillerReq_in.setACK(true);//sysj\controller.sysj line: 107, column: 3
                      S10145=1;
                      if(fillerReq_in.isREQ()){//sysj\controller.sysj line: 107, column: 3
                        fillerReq_in.setACK(false);//sysj\controller.sysj line: 107, column: 3
                        ends[8]=2;
                        ;//sysj\controller.sysj line: 107, column: 3
                        request_thread_8 = (fillerReq_in.getVal() == null ? null : ((Boolean)fillerReq_in.getVal()));//sysj\controller.sysj line: 108, column: 3
                        S10166=1;
                        if(request_thread_8){//sysj\controller.sysj line: 110, column: 3
                          S17600=0;
                          if(!bottleAtPos2.getprestatus()){//sysj\controller.sysj line: 112, column: 13
                            S10173=0;
                            if(!fillerStatus_o.isPartnerPresent() || fillerStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 113, column: 6
                              fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 113, column: 6
                              S10173=1;
                              active[8]=1;
                              ends[8]=1;
                              break RUN;
                            }
                            else {
                              S10168=0;
                              if(fillerStatus_o.isACK()){//sysj\controller.sysj line: 113, column: 6
                                fillerStatus_o.setVal("idle");//sysj\controller.sysj line: 113, column: 6
                                S10168=1;
                                if(!fillerStatus_o.isACK()){//sysj\controller.sysj line: 113, column: 6
                                  fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 113, column: 6
                                  ends[8]=2;
                                  ;//sysj\controller.sysj line: 113, column: 6
                                  S17600=1;
                                  if(bottleAtPos2.getprestatus()){//sysj\controller.sysj line: 117, column: 13
                                    System.out.println("bottle is at pos 2");//sysj\controller.sysj line: 118, column: 6
                                    S10234=0;
                                    S10196=0;
                                    if(!fillerStatus_o.isPartnerPresent() || fillerStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 119, column: 6
                                      fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 119, column: 6
                                      S10196=1;
                                      active[8]=1;
                                      ends[8]=1;
                                      break RUN;
                                    }
                                    else {
                                      S10191=0;
                                      if(fillerStatus_o.isACK()){//sysj\controller.sysj line: 119, column: 6
                                        fillerStatus_o.setVal("busy");//sysj\controller.sysj line: 119, column: 6
                                        S10191=1;
                                        if(!fillerStatus_o.isACK()){//sysj\controller.sysj line: 119, column: 6
                                          fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 119, column: 6
                                          ends[8]=2;
                                          ;//sysj\controller.sysj line: 119, column: 6
                                          S10234=1;
                                          S10241=0;
                                          if(!percentLiquid_in.isPartnerPresent() || percentLiquid_in.isPartnerPreempted()){//sysj\controller.sysj line: 120, column: 6
                                            percentLiquid_in.setACK(false);//sysj\controller.sysj line: 120, column: 6
                                            S10241=1;
                                            active[8]=1;
                                            ends[8]=1;
                                            break RUN;
                                          }
                                          else {
                                            S10236=0;
                                            if(!percentLiquid_in.isREQ()){//sysj\controller.sysj line: 120, column: 6
                                              percentLiquid_in.setACK(true);//sysj\controller.sysj line: 120, column: 6
                                              S10236=1;
                                              if(percentLiquid_in.isREQ()){//sysj\controller.sysj line: 120, column: 6
                                                percentLiquid_in.setACK(false);//sysj\controller.sysj line: 120, column: 6
                                                ends[8]=2;
                                                ;//sysj\controller.sysj line: 120, column: 6
                                                recPercentLiq_thread_8 = (ArrayList)(percentLiquid_in.getVal() == null ? null : ((ArrayList)percentLiquid_in.getVal()));//sysj\controller.sysj line: 121, column: 6
                                                canisterNum_thread_8 = 1;//sysj\controller.sysj line: 122, column: 6
                                                S10234=2;
                                                if(canisterNum_thread_8 < 5){//sysj\controller.sysj line: 124, column: 12
                                                  S10353=0;
                                                  System.out.println("selecting canister " + canisterNum_thread_8);//sysj\controller.sysj line: 127, column: 8
                                                  selectCanister.setPresent();//sysj\controller.sysj line: 128, column: 9
                                                  currsigs.addElement(selectCanister);
                                                  selectCanister.setValue(canisterNum_thread_8);//sysj\controller.sysj line: 128, column: 9
                                                  active[8]=1;
                                                  ends[8]=1;
                                                  break RUN;
                                                }
                                                else {
                                                  ends[8]=2;
                                                  ;//sysj\controller.sysj line: 124, column: 6
                                                  S10234=3;
                                                  S11523=0;
                                                  if(!fillerStatus_o.isPartnerPresent() || fillerStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 156, column: 6
                                                    fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 156, column: 6
                                                    S11523=1;
                                                    active[8]=1;
                                                    ends[8]=1;
                                                    break RUN;
                                                  }
                                                  else {
                                                    S11518=0;
                                                    if(fillerStatus_o.isACK()){//sysj\controller.sysj line: 156, column: 6
                                                      fillerStatus_o.setVal("done");//sysj\controller.sysj line: 156, column: 6
                                                      S11518=1;
                                                      if(!fillerStatus_o.isACK()){//sysj\controller.sysj line: 156, column: 6
                                                        fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 156, column: 6
                                                        ends[8]=2;
                                                        ;//sysj\controller.sysj line: 156, column: 6
                                                        S10166=2;
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
                                    S10166=2;
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
                            S17600=1;
                            if(bottleAtPos2.getprestatus()){//sysj\controller.sysj line: 117, column: 13
                              System.out.println("bottle is at pos 2");//sysj\controller.sysj line: 118, column: 6
                              S10234=0;
                              S10196=0;
                              if(!fillerStatus_o.isPartnerPresent() || fillerStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 119, column: 6
                                fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 119, column: 6
                                S10196=1;
                                active[8]=1;
                                ends[8]=1;
                                break RUN;
                              }
                              else {
                                S10191=0;
                                if(fillerStatus_o.isACK()){//sysj\controller.sysj line: 119, column: 6
                                  fillerStatus_o.setVal("busy");//sysj\controller.sysj line: 119, column: 6
                                  S10191=1;
                                  if(!fillerStatus_o.isACK()){//sysj\controller.sysj line: 119, column: 6
                                    fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 119, column: 6
                                    ends[8]=2;
                                    ;//sysj\controller.sysj line: 119, column: 6
                                    S10234=1;
                                    S10241=0;
                                    if(!percentLiquid_in.isPartnerPresent() || percentLiquid_in.isPartnerPreempted()){//sysj\controller.sysj line: 120, column: 6
                                      percentLiquid_in.setACK(false);//sysj\controller.sysj line: 120, column: 6
                                      S10241=1;
                                      active[8]=1;
                                      ends[8]=1;
                                      break RUN;
                                    }
                                    else {
                                      S10236=0;
                                      if(!percentLiquid_in.isREQ()){//sysj\controller.sysj line: 120, column: 6
                                        percentLiquid_in.setACK(true);//sysj\controller.sysj line: 120, column: 6
                                        S10236=1;
                                        if(percentLiquid_in.isREQ()){//sysj\controller.sysj line: 120, column: 6
                                          percentLiquid_in.setACK(false);//sysj\controller.sysj line: 120, column: 6
                                          ends[8]=2;
                                          ;//sysj\controller.sysj line: 120, column: 6
                                          recPercentLiq_thread_8 = (ArrayList)(percentLiquid_in.getVal() == null ? null : ((ArrayList)percentLiquid_in.getVal()));//sysj\controller.sysj line: 121, column: 6
                                          canisterNum_thread_8 = 1;//sysj\controller.sysj line: 122, column: 6
                                          S10234=2;
                                          if(canisterNum_thread_8 < 5){//sysj\controller.sysj line: 124, column: 12
                                            S10353=0;
                                            System.out.println("selecting canister " + canisterNum_thread_8);//sysj\controller.sysj line: 127, column: 8
                                            selectCanister.setPresent();//sysj\controller.sysj line: 128, column: 9
                                            currsigs.addElement(selectCanister);
                                            selectCanister.setValue(canisterNum_thread_8);//sysj\controller.sysj line: 128, column: 9
                                            active[8]=1;
                                            ends[8]=1;
                                            break RUN;
                                          }
                                          else {
                                            ends[8]=2;
                                            ;//sysj\controller.sysj line: 124, column: 6
                                            S10234=3;
                                            S11523=0;
                                            if(!fillerStatus_o.isPartnerPresent() || fillerStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 156, column: 6
                                              fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 156, column: 6
                                              S11523=1;
                                              active[8]=1;
                                              ends[8]=1;
                                              break RUN;
                                            }
                                            else {
                                              S11518=0;
                                              if(fillerStatus_o.isACK()){//sysj\controller.sysj line: 156, column: 6
                                                fillerStatus_o.setVal("done");//sysj\controller.sysj line: 156, column: 6
                                                S11518=1;
                                                if(!fillerStatus_o.isACK()){//sysj\controller.sysj line: 156, column: 6
                                                  fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 156, column: 6
                                                  ends[8]=2;
                                                  ;//sysj\controller.sysj line: 156, column: 6
                                                  S10166=2;
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
                              S10166=2;
                              active[8]=1;
                              ends[8]=1;
                              break RUN;
                            }
                          }
                        }
                        else {
                          S10166=2;
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
              switch(S17600){
                case 0 : 
                  switch(S10173){
                    case 0 : 
                      if(!fillerStatus_o.isPartnerPresent() || fillerStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 113, column: 6
                        fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 113, column: 6
                        S10173=1;
                        active[8]=1;
                        ends[8]=1;
                        break RUN;
                      }
                      else {
                        switch(S10168){
                          case 0 : 
                            if(fillerStatus_o.isACK()){//sysj\controller.sysj line: 113, column: 6
                              fillerStatus_o.setVal("idle");//sysj\controller.sysj line: 113, column: 6
                              S10168=1;
                              if(!fillerStatus_o.isACK()){//sysj\controller.sysj line: 113, column: 6
                                fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 113, column: 6
                                ends[8]=2;
                                ;//sysj\controller.sysj line: 113, column: 6
                                S17600=1;
                                if(bottleAtPos2.getprestatus()){//sysj\controller.sysj line: 117, column: 13
                                  System.out.println("bottle is at pos 2");//sysj\controller.sysj line: 118, column: 6
                                  S10234=0;
                                  S10196=0;
                                  if(!fillerStatus_o.isPartnerPresent() || fillerStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 119, column: 6
                                    fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 119, column: 6
                                    S10196=1;
                                    active[8]=1;
                                    ends[8]=1;
                                    break RUN;
                                  }
                                  else {
                                    S10191=0;
                                    if(fillerStatus_o.isACK()){//sysj\controller.sysj line: 119, column: 6
                                      fillerStatus_o.setVal("busy");//sysj\controller.sysj line: 119, column: 6
                                      S10191=1;
                                      if(!fillerStatus_o.isACK()){//sysj\controller.sysj line: 119, column: 6
                                        fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 119, column: 6
                                        ends[8]=2;
                                        ;//sysj\controller.sysj line: 119, column: 6
                                        S10234=1;
                                        S10241=0;
                                        if(!percentLiquid_in.isPartnerPresent() || percentLiquid_in.isPartnerPreempted()){//sysj\controller.sysj line: 120, column: 6
                                          percentLiquid_in.setACK(false);//sysj\controller.sysj line: 120, column: 6
                                          S10241=1;
                                          active[8]=1;
                                          ends[8]=1;
                                          break RUN;
                                        }
                                        else {
                                          S10236=0;
                                          if(!percentLiquid_in.isREQ()){//sysj\controller.sysj line: 120, column: 6
                                            percentLiquid_in.setACK(true);//sysj\controller.sysj line: 120, column: 6
                                            S10236=1;
                                            if(percentLiquid_in.isREQ()){//sysj\controller.sysj line: 120, column: 6
                                              percentLiquid_in.setACK(false);//sysj\controller.sysj line: 120, column: 6
                                              ends[8]=2;
                                              ;//sysj\controller.sysj line: 120, column: 6
                                              recPercentLiq_thread_8 = (ArrayList)(percentLiquid_in.getVal() == null ? null : ((ArrayList)percentLiquid_in.getVal()));//sysj\controller.sysj line: 121, column: 6
                                              canisterNum_thread_8 = 1;//sysj\controller.sysj line: 122, column: 6
                                              S10234=2;
                                              if(canisterNum_thread_8 < 5){//sysj\controller.sysj line: 124, column: 12
                                                S10353=0;
                                                System.out.println("selecting canister " + canisterNum_thread_8);//sysj\controller.sysj line: 127, column: 8
                                                selectCanister.setPresent();//sysj\controller.sysj line: 128, column: 9
                                                currsigs.addElement(selectCanister);
                                                selectCanister.setValue(canisterNum_thread_8);//sysj\controller.sysj line: 128, column: 9
                                                active[8]=1;
                                                ends[8]=1;
                                                break RUN;
                                              }
                                              else {
                                                ends[8]=2;
                                                ;//sysj\controller.sysj line: 124, column: 6
                                                S10234=3;
                                                S11523=0;
                                                if(!fillerStatus_o.isPartnerPresent() || fillerStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 156, column: 6
                                                  fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 156, column: 6
                                                  S11523=1;
                                                  active[8]=1;
                                                  ends[8]=1;
                                                  break RUN;
                                                }
                                                else {
                                                  S11518=0;
                                                  if(fillerStatus_o.isACK()){//sysj\controller.sysj line: 156, column: 6
                                                    fillerStatus_o.setVal("done");//sysj\controller.sysj line: 156, column: 6
                                                    S11518=1;
                                                    if(!fillerStatus_o.isACK()){//sysj\controller.sysj line: 156, column: 6
                                                      fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 156, column: 6
                                                      ends[8]=2;
                                                      ;//sysj\controller.sysj line: 156, column: 6
                                                      S10166=2;
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
                                  S10166=2;
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
                            if(!fillerStatus_o.isACK()){//sysj\controller.sysj line: 113, column: 6
                              fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 113, column: 6
                              ends[8]=2;
                              ;//sysj\controller.sysj line: 113, column: 6
                              S17600=1;
                              if(bottleAtPos2.getprestatus()){//sysj\controller.sysj line: 117, column: 13
                                System.out.println("bottle is at pos 2");//sysj\controller.sysj line: 118, column: 6
                                S10234=0;
                                S10196=0;
                                if(!fillerStatus_o.isPartnerPresent() || fillerStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 119, column: 6
                                  fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 119, column: 6
                                  S10196=1;
                                  active[8]=1;
                                  ends[8]=1;
                                  break RUN;
                                }
                                else {
                                  S10191=0;
                                  if(fillerStatus_o.isACK()){//sysj\controller.sysj line: 119, column: 6
                                    fillerStatus_o.setVal("busy");//sysj\controller.sysj line: 119, column: 6
                                    S10191=1;
                                    if(!fillerStatus_o.isACK()){//sysj\controller.sysj line: 119, column: 6
                                      fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 119, column: 6
                                      ends[8]=2;
                                      ;//sysj\controller.sysj line: 119, column: 6
                                      S10234=1;
                                      S10241=0;
                                      if(!percentLiquid_in.isPartnerPresent() || percentLiquid_in.isPartnerPreempted()){//sysj\controller.sysj line: 120, column: 6
                                        percentLiquid_in.setACK(false);//sysj\controller.sysj line: 120, column: 6
                                        S10241=1;
                                        active[8]=1;
                                        ends[8]=1;
                                        break RUN;
                                      }
                                      else {
                                        S10236=0;
                                        if(!percentLiquid_in.isREQ()){//sysj\controller.sysj line: 120, column: 6
                                          percentLiquid_in.setACK(true);//sysj\controller.sysj line: 120, column: 6
                                          S10236=1;
                                          if(percentLiquid_in.isREQ()){//sysj\controller.sysj line: 120, column: 6
                                            percentLiquid_in.setACK(false);//sysj\controller.sysj line: 120, column: 6
                                            ends[8]=2;
                                            ;//sysj\controller.sysj line: 120, column: 6
                                            recPercentLiq_thread_8 = (ArrayList)(percentLiquid_in.getVal() == null ? null : ((ArrayList)percentLiquid_in.getVal()));//sysj\controller.sysj line: 121, column: 6
                                            canisterNum_thread_8 = 1;//sysj\controller.sysj line: 122, column: 6
                                            S10234=2;
                                            if(canisterNum_thread_8 < 5){//sysj\controller.sysj line: 124, column: 12
                                              S10353=0;
                                              System.out.println("selecting canister " + canisterNum_thread_8);//sysj\controller.sysj line: 127, column: 8
                                              selectCanister.setPresent();//sysj\controller.sysj line: 128, column: 9
                                              currsigs.addElement(selectCanister);
                                              selectCanister.setValue(canisterNum_thread_8);//sysj\controller.sysj line: 128, column: 9
                                              active[8]=1;
                                              ends[8]=1;
                                              break RUN;
                                            }
                                            else {
                                              ends[8]=2;
                                              ;//sysj\controller.sysj line: 124, column: 6
                                              S10234=3;
                                              S11523=0;
                                              if(!fillerStatus_o.isPartnerPresent() || fillerStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 156, column: 6
                                                fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 156, column: 6
                                                S11523=1;
                                                active[8]=1;
                                                ends[8]=1;
                                                break RUN;
                                              }
                                              else {
                                                S11518=0;
                                                if(fillerStatus_o.isACK()){//sysj\controller.sysj line: 156, column: 6
                                                  fillerStatus_o.setVal("done");//sysj\controller.sysj line: 156, column: 6
                                                  S11518=1;
                                                  if(!fillerStatus_o.isACK()){//sysj\controller.sysj line: 156, column: 6
                                                    fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 156, column: 6
                                                    ends[8]=2;
                                                    ;//sysj\controller.sysj line: 156, column: 6
                                                    S10166=2;
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
                                S10166=2;
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
                      S10173=1;
                      S10173=0;
                      if(!fillerStatus_o.isPartnerPresent() || fillerStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 113, column: 6
                        fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 113, column: 6
                        S10173=1;
                        active[8]=1;
                        ends[8]=1;
                        break RUN;
                      }
                      else {
                        S10168=0;
                        if(fillerStatus_o.isACK()){//sysj\controller.sysj line: 113, column: 6
                          fillerStatus_o.setVal("idle");//sysj\controller.sysj line: 113, column: 6
                          S10168=1;
                          if(!fillerStatus_o.isACK()){//sysj\controller.sysj line: 113, column: 6
                            fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 113, column: 6
                            ends[8]=2;
                            ;//sysj\controller.sysj line: 113, column: 6
                            S17600=1;
                            if(bottleAtPos2.getprestatus()){//sysj\controller.sysj line: 117, column: 13
                              System.out.println("bottle is at pos 2");//sysj\controller.sysj line: 118, column: 6
                              S10234=0;
                              S10196=0;
                              if(!fillerStatus_o.isPartnerPresent() || fillerStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 119, column: 6
                                fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 119, column: 6
                                S10196=1;
                                active[8]=1;
                                ends[8]=1;
                                break RUN;
                              }
                              else {
                                S10191=0;
                                if(fillerStatus_o.isACK()){//sysj\controller.sysj line: 119, column: 6
                                  fillerStatus_o.setVal("busy");//sysj\controller.sysj line: 119, column: 6
                                  S10191=1;
                                  if(!fillerStatus_o.isACK()){//sysj\controller.sysj line: 119, column: 6
                                    fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 119, column: 6
                                    ends[8]=2;
                                    ;//sysj\controller.sysj line: 119, column: 6
                                    S10234=1;
                                    S10241=0;
                                    if(!percentLiquid_in.isPartnerPresent() || percentLiquid_in.isPartnerPreempted()){//sysj\controller.sysj line: 120, column: 6
                                      percentLiquid_in.setACK(false);//sysj\controller.sysj line: 120, column: 6
                                      S10241=1;
                                      active[8]=1;
                                      ends[8]=1;
                                      break RUN;
                                    }
                                    else {
                                      S10236=0;
                                      if(!percentLiquid_in.isREQ()){//sysj\controller.sysj line: 120, column: 6
                                        percentLiquid_in.setACK(true);//sysj\controller.sysj line: 120, column: 6
                                        S10236=1;
                                        if(percentLiquid_in.isREQ()){//sysj\controller.sysj line: 120, column: 6
                                          percentLiquid_in.setACK(false);//sysj\controller.sysj line: 120, column: 6
                                          ends[8]=2;
                                          ;//sysj\controller.sysj line: 120, column: 6
                                          recPercentLiq_thread_8 = (ArrayList)(percentLiquid_in.getVal() == null ? null : ((ArrayList)percentLiquid_in.getVal()));//sysj\controller.sysj line: 121, column: 6
                                          canisterNum_thread_8 = 1;//sysj\controller.sysj line: 122, column: 6
                                          S10234=2;
                                          if(canisterNum_thread_8 < 5){//sysj\controller.sysj line: 124, column: 12
                                            S10353=0;
                                            System.out.println("selecting canister " + canisterNum_thread_8);//sysj\controller.sysj line: 127, column: 8
                                            selectCanister.setPresent();//sysj\controller.sysj line: 128, column: 9
                                            currsigs.addElement(selectCanister);
                                            selectCanister.setValue(canisterNum_thread_8);//sysj\controller.sysj line: 128, column: 9
                                            active[8]=1;
                                            ends[8]=1;
                                            break RUN;
                                          }
                                          else {
                                            ends[8]=2;
                                            ;//sysj\controller.sysj line: 124, column: 6
                                            S10234=3;
                                            S11523=0;
                                            if(!fillerStatus_o.isPartnerPresent() || fillerStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 156, column: 6
                                              fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 156, column: 6
                                              S11523=1;
                                              active[8]=1;
                                              ends[8]=1;
                                              break RUN;
                                            }
                                            else {
                                              S11518=0;
                                              if(fillerStatus_o.isACK()){//sysj\controller.sysj line: 156, column: 6
                                                fillerStatus_o.setVal("done");//sysj\controller.sysj line: 156, column: 6
                                                S11518=1;
                                                if(!fillerStatus_o.isACK()){//sysj\controller.sysj line: 156, column: 6
                                                  fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 156, column: 6
                                                  ends[8]=2;
                                                  ;//sysj\controller.sysj line: 156, column: 6
                                                  S10166=2;
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
                              S10166=2;
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
                  switch(S10234){
                    case 0 : 
                      switch(S10196){
                        case 0 : 
                          if(!fillerStatus_o.isPartnerPresent() || fillerStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 119, column: 6
                            fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 119, column: 6
                            S10196=1;
                            active[8]=1;
                            ends[8]=1;
                            break RUN;
                          }
                          else {
                            switch(S10191){
                              case 0 : 
                                if(fillerStatus_o.isACK()){//sysj\controller.sysj line: 119, column: 6
                                  fillerStatus_o.setVal("busy");//sysj\controller.sysj line: 119, column: 6
                                  S10191=1;
                                  if(!fillerStatus_o.isACK()){//sysj\controller.sysj line: 119, column: 6
                                    fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 119, column: 6
                                    ends[8]=2;
                                    ;//sysj\controller.sysj line: 119, column: 6
                                    S10234=1;
                                    S10241=0;
                                    if(!percentLiquid_in.isPartnerPresent() || percentLiquid_in.isPartnerPreempted()){//sysj\controller.sysj line: 120, column: 6
                                      percentLiquid_in.setACK(false);//sysj\controller.sysj line: 120, column: 6
                                      S10241=1;
                                      active[8]=1;
                                      ends[8]=1;
                                      break RUN;
                                    }
                                    else {
                                      S10236=0;
                                      if(!percentLiquid_in.isREQ()){//sysj\controller.sysj line: 120, column: 6
                                        percentLiquid_in.setACK(true);//sysj\controller.sysj line: 120, column: 6
                                        S10236=1;
                                        if(percentLiquid_in.isREQ()){//sysj\controller.sysj line: 120, column: 6
                                          percentLiquid_in.setACK(false);//sysj\controller.sysj line: 120, column: 6
                                          ends[8]=2;
                                          ;//sysj\controller.sysj line: 120, column: 6
                                          recPercentLiq_thread_8 = (ArrayList)(percentLiquid_in.getVal() == null ? null : ((ArrayList)percentLiquid_in.getVal()));//sysj\controller.sysj line: 121, column: 6
                                          canisterNum_thread_8 = 1;//sysj\controller.sysj line: 122, column: 6
                                          S10234=2;
                                          if(canisterNum_thread_8 < 5){//sysj\controller.sysj line: 124, column: 12
                                            S10353=0;
                                            System.out.println("selecting canister " + canisterNum_thread_8);//sysj\controller.sysj line: 127, column: 8
                                            selectCanister.setPresent();//sysj\controller.sysj line: 128, column: 9
                                            currsigs.addElement(selectCanister);
                                            selectCanister.setValue(canisterNum_thread_8);//sysj\controller.sysj line: 128, column: 9
                                            active[8]=1;
                                            ends[8]=1;
                                            break RUN;
                                          }
                                          else {
                                            ends[8]=2;
                                            ;//sysj\controller.sysj line: 124, column: 6
                                            S10234=3;
                                            S11523=0;
                                            if(!fillerStatus_o.isPartnerPresent() || fillerStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 156, column: 6
                                              fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 156, column: 6
                                              S11523=1;
                                              active[8]=1;
                                              ends[8]=1;
                                              break RUN;
                                            }
                                            else {
                                              S11518=0;
                                              if(fillerStatus_o.isACK()){//sysj\controller.sysj line: 156, column: 6
                                                fillerStatus_o.setVal("done");//sysj\controller.sysj line: 156, column: 6
                                                S11518=1;
                                                if(!fillerStatus_o.isACK()){//sysj\controller.sysj line: 156, column: 6
                                                  fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 156, column: 6
                                                  ends[8]=2;
                                                  ;//sysj\controller.sysj line: 156, column: 6
                                                  S10166=2;
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
                                if(!fillerStatus_o.isACK()){//sysj\controller.sysj line: 119, column: 6
                                  fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 119, column: 6
                                  ends[8]=2;
                                  ;//sysj\controller.sysj line: 119, column: 6
                                  S10234=1;
                                  S10241=0;
                                  if(!percentLiquid_in.isPartnerPresent() || percentLiquid_in.isPartnerPreempted()){//sysj\controller.sysj line: 120, column: 6
                                    percentLiquid_in.setACK(false);//sysj\controller.sysj line: 120, column: 6
                                    S10241=1;
                                    active[8]=1;
                                    ends[8]=1;
                                    break RUN;
                                  }
                                  else {
                                    S10236=0;
                                    if(!percentLiquid_in.isREQ()){//sysj\controller.sysj line: 120, column: 6
                                      percentLiquid_in.setACK(true);//sysj\controller.sysj line: 120, column: 6
                                      S10236=1;
                                      if(percentLiquid_in.isREQ()){//sysj\controller.sysj line: 120, column: 6
                                        percentLiquid_in.setACK(false);//sysj\controller.sysj line: 120, column: 6
                                        ends[8]=2;
                                        ;//sysj\controller.sysj line: 120, column: 6
                                        recPercentLiq_thread_8 = (ArrayList)(percentLiquid_in.getVal() == null ? null : ((ArrayList)percentLiquid_in.getVal()));//sysj\controller.sysj line: 121, column: 6
                                        canisterNum_thread_8 = 1;//sysj\controller.sysj line: 122, column: 6
                                        S10234=2;
                                        if(canisterNum_thread_8 < 5){//sysj\controller.sysj line: 124, column: 12
                                          S10353=0;
                                          System.out.println("selecting canister " + canisterNum_thread_8);//sysj\controller.sysj line: 127, column: 8
                                          selectCanister.setPresent();//sysj\controller.sysj line: 128, column: 9
                                          currsigs.addElement(selectCanister);
                                          selectCanister.setValue(canisterNum_thread_8);//sysj\controller.sysj line: 128, column: 9
                                          active[8]=1;
                                          ends[8]=1;
                                          break RUN;
                                        }
                                        else {
                                          ends[8]=2;
                                          ;//sysj\controller.sysj line: 124, column: 6
                                          S10234=3;
                                          S11523=0;
                                          if(!fillerStatus_o.isPartnerPresent() || fillerStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 156, column: 6
                                            fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 156, column: 6
                                            S11523=1;
                                            active[8]=1;
                                            ends[8]=1;
                                            break RUN;
                                          }
                                          else {
                                            S11518=0;
                                            if(fillerStatus_o.isACK()){//sysj\controller.sysj line: 156, column: 6
                                              fillerStatus_o.setVal("done");//sysj\controller.sysj line: 156, column: 6
                                              S11518=1;
                                              if(!fillerStatus_o.isACK()){//sysj\controller.sysj line: 156, column: 6
                                                fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 156, column: 6
                                                ends[8]=2;
                                                ;//sysj\controller.sysj line: 156, column: 6
                                                S10166=2;
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
                          S10196=1;
                          S10196=0;
                          if(!fillerStatus_o.isPartnerPresent() || fillerStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 119, column: 6
                            fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 119, column: 6
                            S10196=1;
                            active[8]=1;
                            ends[8]=1;
                            break RUN;
                          }
                          else {
                            S10191=0;
                            if(fillerStatus_o.isACK()){//sysj\controller.sysj line: 119, column: 6
                              fillerStatus_o.setVal("busy");//sysj\controller.sysj line: 119, column: 6
                              S10191=1;
                              if(!fillerStatus_o.isACK()){//sysj\controller.sysj line: 119, column: 6
                                fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 119, column: 6
                                ends[8]=2;
                                ;//sysj\controller.sysj line: 119, column: 6
                                S10234=1;
                                S10241=0;
                                if(!percentLiquid_in.isPartnerPresent() || percentLiquid_in.isPartnerPreempted()){//sysj\controller.sysj line: 120, column: 6
                                  percentLiquid_in.setACK(false);//sysj\controller.sysj line: 120, column: 6
                                  S10241=1;
                                  active[8]=1;
                                  ends[8]=1;
                                  break RUN;
                                }
                                else {
                                  S10236=0;
                                  if(!percentLiquid_in.isREQ()){//sysj\controller.sysj line: 120, column: 6
                                    percentLiquid_in.setACK(true);//sysj\controller.sysj line: 120, column: 6
                                    S10236=1;
                                    if(percentLiquid_in.isREQ()){//sysj\controller.sysj line: 120, column: 6
                                      percentLiquid_in.setACK(false);//sysj\controller.sysj line: 120, column: 6
                                      ends[8]=2;
                                      ;//sysj\controller.sysj line: 120, column: 6
                                      recPercentLiq_thread_8 = (ArrayList)(percentLiquid_in.getVal() == null ? null : ((ArrayList)percentLiquid_in.getVal()));//sysj\controller.sysj line: 121, column: 6
                                      canisterNum_thread_8 = 1;//sysj\controller.sysj line: 122, column: 6
                                      S10234=2;
                                      if(canisterNum_thread_8 < 5){//sysj\controller.sysj line: 124, column: 12
                                        S10353=0;
                                        System.out.println("selecting canister " + canisterNum_thread_8);//sysj\controller.sysj line: 127, column: 8
                                        selectCanister.setPresent();//sysj\controller.sysj line: 128, column: 9
                                        currsigs.addElement(selectCanister);
                                        selectCanister.setValue(canisterNum_thread_8);//sysj\controller.sysj line: 128, column: 9
                                        active[8]=1;
                                        ends[8]=1;
                                        break RUN;
                                      }
                                      else {
                                        ends[8]=2;
                                        ;//sysj\controller.sysj line: 124, column: 6
                                        S10234=3;
                                        S11523=0;
                                        if(!fillerStatus_o.isPartnerPresent() || fillerStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 156, column: 6
                                          fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 156, column: 6
                                          S11523=1;
                                          active[8]=1;
                                          ends[8]=1;
                                          break RUN;
                                        }
                                        else {
                                          S11518=0;
                                          if(fillerStatus_o.isACK()){//sysj\controller.sysj line: 156, column: 6
                                            fillerStatus_o.setVal("done");//sysj\controller.sysj line: 156, column: 6
                                            S11518=1;
                                            if(!fillerStatus_o.isACK()){//sysj\controller.sysj line: 156, column: 6
                                              fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 156, column: 6
                                              ends[8]=2;
                                              ;//sysj\controller.sysj line: 156, column: 6
                                              S10166=2;
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
                      switch(S10241){
                        case 0 : 
                          if(!percentLiquid_in.isPartnerPresent() || percentLiquid_in.isPartnerPreempted()){//sysj\controller.sysj line: 120, column: 6
                            percentLiquid_in.setACK(false);//sysj\controller.sysj line: 120, column: 6
                            S10241=1;
                            active[8]=1;
                            ends[8]=1;
                            break RUN;
                          }
                          else {
                            switch(S10236){
                              case 0 : 
                                if(!percentLiquid_in.isREQ()){//sysj\controller.sysj line: 120, column: 6
                                  percentLiquid_in.setACK(true);//sysj\controller.sysj line: 120, column: 6
                                  S10236=1;
                                  if(percentLiquid_in.isREQ()){//sysj\controller.sysj line: 120, column: 6
                                    percentLiquid_in.setACK(false);//sysj\controller.sysj line: 120, column: 6
                                    ends[8]=2;
                                    ;//sysj\controller.sysj line: 120, column: 6
                                    recPercentLiq_thread_8 = (ArrayList)(percentLiquid_in.getVal() == null ? null : ((ArrayList)percentLiquid_in.getVal()));//sysj\controller.sysj line: 121, column: 6
                                    canisterNum_thread_8 = 1;//sysj\controller.sysj line: 122, column: 6
                                    S10234=2;
                                    if(canisterNum_thread_8 < 5){//sysj\controller.sysj line: 124, column: 12
                                      S10353=0;
                                      System.out.println("selecting canister " + canisterNum_thread_8);//sysj\controller.sysj line: 127, column: 8
                                      selectCanister.setPresent();//sysj\controller.sysj line: 128, column: 9
                                      currsigs.addElement(selectCanister);
                                      selectCanister.setValue(canisterNum_thread_8);//sysj\controller.sysj line: 128, column: 9
                                      active[8]=1;
                                      ends[8]=1;
                                      break RUN;
                                    }
                                    else {
                                      ends[8]=2;
                                      ;//sysj\controller.sysj line: 124, column: 6
                                      S10234=3;
                                      S11523=0;
                                      if(!fillerStatus_o.isPartnerPresent() || fillerStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 156, column: 6
                                        fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 156, column: 6
                                        S11523=1;
                                        active[8]=1;
                                        ends[8]=1;
                                        break RUN;
                                      }
                                      else {
                                        S11518=0;
                                        if(fillerStatus_o.isACK()){//sysj\controller.sysj line: 156, column: 6
                                          fillerStatus_o.setVal("done");//sysj\controller.sysj line: 156, column: 6
                                          S11518=1;
                                          if(!fillerStatus_o.isACK()){//sysj\controller.sysj line: 156, column: 6
                                            fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 156, column: 6
                                            ends[8]=2;
                                            ;//sysj\controller.sysj line: 156, column: 6
                                            S10166=2;
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
                                if(percentLiquid_in.isREQ()){//sysj\controller.sysj line: 120, column: 6
                                  percentLiquid_in.setACK(false);//sysj\controller.sysj line: 120, column: 6
                                  ends[8]=2;
                                  ;//sysj\controller.sysj line: 120, column: 6
                                  recPercentLiq_thread_8 = (ArrayList)(percentLiquid_in.getVal() == null ? null : ((ArrayList)percentLiquid_in.getVal()));//sysj\controller.sysj line: 121, column: 6
                                  canisterNum_thread_8 = 1;//sysj\controller.sysj line: 122, column: 6
                                  S10234=2;
                                  if(canisterNum_thread_8 < 5){//sysj\controller.sysj line: 124, column: 12
                                    S10353=0;
                                    System.out.println("selecting canister " + canisterNum_thread_8);//sysj\controller.sysj line: 127, column: 8
                                    selectCanister.setPresent();//sysj\controller.sysj line: 128, column: 9
                                    currsigs.addElement(selectCanister);
                                    selectCanister.setValue(canisterNum_thread_8);//sysj\controller.sysj line: 128, column: 9
                                    active[8]=1;
                                    ends[8]=1;
                                    break RUN;
                                  }
                                  else {
                                    ends[8]=2;
                                    ;//sysj\controller.sysj line: 124, column: 6
                                    S10234=3;
                                    S11523=0;
                                    if(!fillerStatus_o.isPartnerPresent() || fillerStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 156, column: 6
                                      fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 156, column: 6
                                      S11523=1;
                                      active[8]=1;
                                      ends[8]=1;
                                      break RUN;
                                    }
                                    else {
                                      S11518=0;
                                      if(fillerStatus_o.isACK()){//sysj\controller.sysj line: 156, column: 6
                                        fillerStatus_o.setVal("done");//sysj\controller.sysj line: 156, column: 6
                                        S11518=1;
                                        if(!fillerStatus_o.isACK()){//sysj\controller.sysj line: 156, column: 6
                                          fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 156, column: 6
                                          ends[8]=2;
                                          ;//sysj\controller.sysj line: 156, column: 6
                                          S10166=2;
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
                          S10241=1;
                          S10241=0;
                          if(!percentLiquid_in.isPartnerPresent() || percentLiquid_in.isPartnerPreempted()){//sysj\controller.sysj line: 120, column: 6
                            percentLiquid_in.setACK(false);//sysj\controller.sysj line: 120, column: 6
                            S10241=1;
                            active[8]=1;
                            ends[8]=1;
                            break RUN;
                          }
                          else {
                            S10236=0;
                            if(!percentLiquid_in.isREQ()){//sysj\controller.sysj line: 120, column: 6
                              percentLiquid_in.setACK(true);//sysj\controller.sysj line: 120, column: 6
                              S10236=1;
                              if(percentLiquid_in.isREQ()){//sysj\controller.sysj line: 120, column: 6
                                percentLiquid_in.setACK(false);//sysj\controller.sysj line: 120, column: 6
                                ends[8]=2;
                                ;//sysj\controller.sysj line: 120, column: 6
                                recPercentLiq_thread_8 = (ArrayList)(percentLiquid_in.getVal() == null ? null : ((ArrayList)percentLiquid_in.getVal()));//sysj\controller.sysj line: 121, column: 6
                                canisterNum_thread_8 = 1;//sysj\controller.sysj line: 122, column: 6
                                S10234=2;
                                if(canisterNum_thread_8 < 5){//sysj\controller.sysj line: 124, column: 12
                                  S10353=0;
                                  System.out.println("selecting canister " + canisterNum_thread_8);//sysj\controller.sysj line: 127, column: 8
                                  selectCanister.setPresent();//sysj\controller.sysj line: 128, column: 9
                                  currsigs.addElement(selectCanister);
                                  selectCanister.setValue(canisterNum_thread_8);//sysj\controller.sysj line: 128, column: 9
                                  active[8]=1;
                                  ends[8]=1;
                                  break RUN;
                                }
                                else {
                                  ends[8]=2;
                                  ;//sysj\controller.sysj line: 124, column: 6
                                  S10234=3;
                                  S11523=0;
                                  if(!fillerStatus_o.isPartnerPresent() || fillerStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 156, column: 6
                                    fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 156, column: 6
                                    S11523=1;
                                    active[8]=1;
                                    ends[8]=1;
                                    break RUN;
                                  }
                                  else {
                                    S11518=0;
                                    if(fillerStatus_o.isACK()){//sysj\controller.sysj line: 156, column: 6
                                      fillerStatus_o.setVal("done");//sysj\controller.sysj line: 156, column: 6
                                      S11518=1;
                                      if(!fillerStatus_o.isACK()){//sysj\controller.sysj line: 156, column: 6
                                        fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 156, column: 6
                                        ends[8]=2;
                                        ;//sysj\controller.sysj line: 156, column: 6
                                        S10166=2;
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
                      switch(S10353){
                        case 0 : 
                          if(selectedCanister.getprestatus()){//sysj\controller.sysj line: 126, column: 13
                            S10353=1;
                            thread115515(tdone,ends);
                            thread115516(tdone,ends);
                            int biggest115517 = 0;
                            if(ends[9]>=biggest115517){
                              biggest115517=ends[9];
                            }
                            if(ends[10]>=biggest115517){
                              biggest115517=ends[10];
                            }
                            if(biggest115517 == 1){
                              active[8]=1;
                              ends[8]=1;
                              break RUN;
                            }
                          }
                          else {
                            selectCanister.setPresent();//sysj\controller.sysj line: 128, column: 9
                            currsigs.addElement(selectCanister);
                            selectCanister.setValue(canisterNum_thread_8);//sysj\controller.sysj line: 128, column: 9
                            active[8]=1;
                            ends[8]=1;
                            break RUN;
                          }
                        
                        case 1 : 
                          if(!dosUnitEvac.getprestatus()){//sysj\controller.sysj line: 132, column: 14
                            System.out.println("Canister above bottle");//sysj\controller.sysj line: 135, column: 8
                            receivedPercentage.setPresent();//sysj\controller.sysj line: 139, column: 8
                            currsigs.addElement(receivedPercentage);
                            receivedPercentage.setValue(recPercentLiq_thread_8.get(canisterNum_thread_8 - 1));//sysj\controller.sysj line: 139, column: 8
                            S10353=2;
                            valveInletOnOff.setPresent();//sysj\controller.sysj line: 143, column: 9
                            currsigs.addElement(valveInletOnOff);
                            active[8]=1;
                            ends[8]=1;
                            break RUN;
                          }
                          else {
                            thread115518(tdone,ends);
                            thread115519(tdone,ends);
                            int biggest115520 = 0;
                            if(ends[9]>=biggest115520){
                              biggest115520=ends[9];
                            }
                            if(ends[10]>=biggest115520){
                              biggest115520=ends[10];
                            }
                            if(biggest115520 == 1){
                              active[8]=1;
                              ends[8]=1;
                              break RUN;
                            }
                            //FINXME code
                            if(biggest115520 == 0){
                              System.out.println("Canister above bottle");//sysj\controller.sysj line: 135, column: 8
                              receivedPercentage.setPresent();//sysj\controller.sysj line: 139, column: 8
                              currsigs.addElement(receivedPercentage);
                              receivedPercentage.setValue(recPercentLiq_thread_8.get(canisterNum_thread_8 - 1));//sysj\controller.sysj line: 139, column: 8
                              S10353=2;
                              valveInletOnOff.setPresent();//sysj\controller.sysj line: 143, column: 9
                              currsigs.addElement(valveInletOnOff);
                              active[8]=1;
                              ends[8]=1;
                              break RUN;
                            }
                          }
                        
                        case 2 : 
                          if(dosUnitFilled.getprestatus()){//sysj\controller.sysj line: 142, column: 14
                            System.out.println("Bottle controller filled");//sysj\controller.sysj line: 146, column: 8
                            S10353=3;
                            thread115521(tdone,ends);
                            thread115522(tdone,ends);
                            int biggest115523 = 0;
                            if(ends[11]>=biggest115523){
                              biggest115523=ends[11];
                            }
                            if(ends[12]>=biggest115523){
                              biggest115523=ends[12];
                            }
                            if(biggest115523 == 1){
                              active[8]=1;
                              ends[8]=1;
                              break RUN;
                            }
                          }
                          else {
                            valveInletOnOff.setPresent();//sysj\controller.sysj line: 143, column: 9
                            currsigs.addElement(valveInletOnOff);
                            active[8]=1;
                            ends[8]=1;
                            break RUN;
                          }
                        
                        case 3 : 
                          if(dosUnitEvac.getprestatus()){//sysj\controller.sysj line: 148, column: 14
                            System.out.println("Canister returned");//sysj\controller.sysj line: 151, column: 8
                            canisterNum_thread_8 += 1;//sysj\controller.sysj line: 153, column: 8
                            S10353=4;
                            active[8]=1;
                            ends[8]=1;
                            break RUN;
                          }
                          else {
                            thread115524(tdone,ends);
                            thread115525(tdone,ends);
                            int biggest115526 = 0;
                            if(ends[11]>=biggest115526){
                              biggest115526=ends[11];
                            }
                            if(ends[12]>=biggest115526){
                              biggest115526=ends[12];
                            }
                            if(biggest115526 == 1){
                              active[8]=1;
                              ends[8]=1;
                              break RUN;
                            }
                            //FINXME code
                            if(biggest115526 == 0){
                              System.out.println("Canister returned");//sysj\controller.sysj line: 151, column: 8
                              canisterNum_thread_8 += 1;//sysj\controller.sysj line: 153, column: 8
                              S10353=4;
                              active[8]=1;
                              ends[8]=1;
                              break RUN;
                            }
                          }
                        
                        case 4 : 
                          S10353=4;
                          if(canisterNum_thread_8 < 5){//sysj\controller.sysj line: 124, column: 12
                            S10353=0;
                            System.out.println("selecting canister " + canisterNum_thread_8);//sysj\controller.sysj line: 127, column: 8
                            selectCanister.setPresent();//sysj\controller.sysj line: 128, column: 9
                            currsigs.addElement(selectCanister);
                            selectCanister.setValue(canisterNum_thread_8);//sysj\controller.sysj line: 128, column: 9
                            active[8]=1;
                            ends[8]=1;
                            break RUN;
                          }
                          else {
                            ends[8]=2;
                            ;//sysj\controller.sysj line: 124, column: 6
                            S10234=3;
                            S11523=0;
                            if(!fillerStatus_o.isPartnerPresent() || fillerStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 156, column: 6
                              fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 156, column: 6
                              S11523=1;
                              active[8]=1;
                              ends[8]=1;
                              break RUN;
                            }
                            else {
                              S11518=0;
                              if(fillerStatus_o.isACK()){//sysj\controller.sysj line: 156, column: 6
                                fillerStatus_o.setVal("done");//sysj\controller.sysj line: 156, column: 6
                                S11518=1;
                                if(!fillerStatus_o.isACK()){//sysj\controller.sysj line: 156, column: 6
                                  fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 156, column: 6
                                  ends[8]=2;
                                  ;//sysj\controller.sysj line: 156, column: 6
                                  S10166=2;
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
                      switch(S11523){
                        case 0 : 
                          if(!fillerStatus_o.isPartnerPresent() || fillerStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 156, column: 6
                            fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 156, column: 6
                            S11523=1;
                            active[8]=1;
                            ends[8]=1;
                            break RUN;
                          }
                          else {
                            switch(S11518){
                              case 0 : 
                                if(fillerStatus_o.isACK()){//sysj\controller.sysj line: 156, column: 6
                                  fillerStatus_o.setVal("done");//sysj\controller.sysj line: 156, column: 6
                                  S11518=1;
                                  if(!fillerStatus_o.isACK()){//sysj\controller.sysj line: 156, column: 6
                                    fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 156, column: 6
                                    ends[8]=2;
                                    ;//sysj\controller.sysj line: 156, column: 6
                                    S10166=2;
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
                                if(!fillerStatus_o.isACK()){//sysj\controller.sysj line: 156, column: 6
                                  fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 156, column: 6
                                  ends[8]=2;
                                  ;//sysj\controller.sysj line: 156, column: 6
                                  S10166=2;
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
                          S11523=1;
                          S11523=0;
                          if(!fillerStatus_o.isPartnerPresent() || fillerStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 156, column: 6
                            fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 156, column: 6
                            S11523=1;
                            active[8]=1;
                            ends[8]=1;
                            break RUN;
                          }
                          else {
                            S11518=0;
                            if(fillerStatus_o.isACK()){//sysj\controller.sysj line: 156, column: 6
                              fillerStatus_o.setVal("done");//sysj\controller.sysj line: 156, column: 6
                              S11518=1;
                              if(!fillerStatus_o.isACK()){//sysj\controller.sysj line: 156, column: 6
                                fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 156, column: 6
                                ends[8]=2;
                                ;//sysj\controller.sysj line: 156, column: 6
                                S10166=2;
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
              S10166=2;
              S10166=0;
              S10150=0;
              if(!fillerReq_in.isPartnerPresent() || fillerReq_in.isPartnerPreempted()){//sysj\controller.sysj line: 107, column: 3
                fillerReq_in.setACK(false);//sysj\controller.sysj line: 107, column: 3
                S10150=1;
                active[8]=1;
                ends[8]=1;
                break RUN;
              }
              else {
                S10145=0;
                if(!fillerReq_in.isREQ()){//sysj\controller.sysj line: 107, column: 3
                  fillerReq_in.setACK(true);//sysj\controller.sysj line: 107, column: 3
                  S10145=1;
                  if(fillerReq_in.isREQ()){//sysj\controller.sysj line: 107, column: 3
                    fillerReq_in.setACK(false);//sysj\controller.sysj line: 107, column: 3
                    ends[8]=2;
                    ;//sysj\controller.sysj line: 107, column: 3
                    request_thread_8 = (fillerReq_in.getVal() == null ? null : ((Boolean)fillerReq_in.getVal()));//sysj\controller.sysj line: 108, column: 3
                    S10166=1;
                    if(request_thread_8){//sysj\controller.sysj line: 110, column: 3
                      S17600=0;
                      if(!bottleAtPos2.getprestatus()){//sysj\controller.sysj line: 112, column: 13
                        S10173=0;
                        if(!fillerStatus_o.isPartnerPresent() || fillerStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 113, column: 6
                          fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 113, column: 6
                          S10173=1;
                          active[8]=1;
                          ends[8]=1;
                          break RUN;
                        }
                        else {
                          S10168=0;
                          if(fillerStatus_o.isACK()){//sysj\controller.sysj line: 113, column: 6
                            fillerStatus_o.setVal("idle");//sysj\controller.sysj line: 113, column: 6
                            S10168=1;
                            if(!fillerStatus_o.isACK()){//sysj\controller.sysj line: 113, column: 6
                              fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 113, column: 6
                              ends[8]=2;
                              ;//sysj\controller.sysj line: 113, column: 6
                              S17600=1;
                              if(bottleAtPos2.getprestatus()){//sysj\controller.sysj line: 117, column: 13
                                System.out.println("bottle is at pos 2");//sysj\controller.sysj line: 118, column: 6
                                S10234=0;
                                S10196=0;
                                if(!fillerStatus_o.isPartnerPresent() || fillerStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 119, column: 6
                                  fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 119, column: 6
                                  S10196=1;
                                  active[8]=1;
                                  ends[8]=1;
                                  break RUN;
                                }
                                else {
                                  S10191=0;
                                  if(fillerStatus_o.isACK()){//sysj\controller.sysj line: 119, column: 6
                                    fillerStatus_o.setVal("busy");//sysj\controller.sysj line: 119, column: 6
                                    S10191=1;
                                    if(!fillerStatus_o.isACK()){//sysj\controller.sysj line: 119, column: 6
                                      fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 119, column: 6
                                      ends[8]=2;
                                      ;//sysj\controller.sysj line: 119, column: 6
                                      S10234=1;
                                      S10241=0;
                                      if(!percentLiquid_in.isPartnerPresent() || percentLiquid_in.isPartnerPreempted()){//sysj\controller.sysj line: 120, column: 6
                                        percentLiquid_in.setACK(false);//sysj\controller.sysj line: 120, column: 6
                                        S10241=1;
                                        active[8]=1;
                                        ends[8]=1;
                                        break RUN;
                                      }
                                      else {
                                        S10236=0;
                                        if(!percentLiquid_in.isREQ()){//sysj\controller.sysj line: 120, column: 6
                                          percentLiquid_in.setACK(true);//sysj\controller.sysj line: 120, column: 6
                                          S10236=1;
                                          if(percentLiquid_in.isREQ()){//sysj\controller.sysj line: 120, column: 6
                                            percentLiquid_in.setACK(false);//sysj\controller.sysj line: 120, column: 6
                                            ends[8]=2;
                                            ;//sysj\controller.sysj line: 120, column: 6
                                            recPercentLiq_thread_8 = (ArrayList)(percentLiquid_in.getVal() == null ? null : ((ArrayList)percentLiquid_in.getVal()));//sysj\controller.sysj line: 121, column: 6
                                            canisterNum_thread_8 = 1;//sysj\controller.sysj line: 122, column: 6
                                            S10234=2;
                                            if(canisterNum_thread_8 < 5){//sysj\controller.sysj line: 124, column: 12
                                              S10353=0;
                                              System.out.println("selecting canister " + canisterNum_thread_8);//sysj\controller.sysj line: 127, column: 8
                                              selectCanister.setPresent();//sysj\controller.sysj line: 128, column: 9
                                              currsigs.addElement(selectCanister);
                                              selectCanister.setValue(canisterNum_thread_8);//sysj\controller.sysj line: 128, column: 9
                                              active[8]=1;
                                              ends[8]=1;
                                              break RUN;
                                            }
                                            else {
                                              ends[8]=2;
                                              ;//sysj\controller.sysj line: 124, column: 6
                                              S10234=3;
                                              S11523=0;
                                              if(!fillerStatus_o.isPartnerPresent() || fillerStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 156, column: 6
                                                fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 156, column: 6
                                                S11523=1;
                                                active[8]=1;
                                                ends[8]=1;
                                                break RUN;
                                              }
                                              else {
                                                S11518=0;
                                                if(fillerStatus_o.isACK()){//sysj\controller.sysj line: 156, column: 6
                                                  fillerStatus_o.setVal("done");//sysj\controller.sysj line: 156, column: 6
                                                  S11518=1;
                                                  if(!fillerStatus_o.isACK()){//sysj\controller.sysj line: 156, column: 6
                                                    fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 156, column: 6
                                                    ends[8]=2;
                                                    ;//sysj\controller.sysj line: 156, column: 6
                                                    S10166=2;
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
                                S10166=2;
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
                        S17600=1;
                        if(bottleAtPos2.getprestatus()){//sysj\controller.sysj line: 117, column: 13
                          System.out.println("bottle is at pos 2");//sysj\controller.sysj line: 118, column: 6
                          S10234=0;
                          S10196=0;
                          if(!fillerStatus_o.isPartnerPresent() || fillerStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 119, column: 6
                            fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 119, column: 6
                            S10196=1;
                            active[8]=1;
                            ends[8]=1;
                            break RUN;
                          }
                          else {
                            S10191=0;
                            if(fillerStatus_o.isACK()){//sysj\controller.sysj line: 119, column: 6
                              fillerStatus_o.setVal("busy");//sysj\controller.sysj line: 119, column: 6
                              S10191=1;
                              if(!fillerStatus_o.isACK()){//sysj\controller.sysj line: 119, column: 6
                                fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 119, column: 6
                                ends[8]=2;
                                ;//sysj\controller.sysj line: 119, column: 6
                                S10234=1;
                                S10241=0;
                                if(!percentLiquid_in.isPartnerPresent() || percentLiquid_in.isPartnerPreempted()){//sysj\controller.sysj line: 120, column: 6
                                  percentLiquid_in.setACK(false);//sysj\controller.sysj line: 120, column: 6
                                  S10241=1;
                                  active[8]=1;
                                  ends[8]=1;
                                  break RUN;
                                }
                                else {
                                  S10236=0;
                                  if(!percentLiquid_in.isREQ()){//sysj\controller.sysj line: 120, column: 6
                                    percentLiquid_in.setACK(true);//sysj\controller.sysj line: 120, column: 6
                                    S10236=1;
                                    if(percentLiquid_in.isREQ()){//sysj\controller.sysj line: 120, column: 6
                                      percentLiquid_in.setACK(false);//sysj\controller.sysj line: 120, column: 6
                                      ends[8]=2;
                                      ;//sysj\controller.sysj line: 120, column: 6
                                      recPercentLiq_thread_8 = (ArrayList)(percentLiquid_in.getVal() == null ? null : ((ArrayList)percentLiquid_in.getVal()));//sysj\controller.sysj line: 121, column: 6
                                      canisterNum_thread_8 = 1;//sysj\controller.sysj line: 122, column: 6
                                      S10234=2;
                                      if(canisterNum_thread_8 < 5){//sysj\controller.sysj line: 124, column: 12
                                        S10353=0;
                                        System.out.println("selecting canister " + canisterNum_thread_8);//sysj\controller.sysj line: 127, column: 8
                                        selectCanister.setPresent();//sysj\controller.sysj line: 128, column: 9
                                        currsigs.addElement(selectCanister);
                                        selectCanister.setValue(canisterNum_thread_8);//sysj\controller.sysj line: 128, column: 9
                                        active[8]=1;
                                        ends[8]=1;
                                        break RUN;
                                      }
                                      else {
                                        ends[8]=2;
                                        ;//sysj\controller.sysj line: 124, column: 6
                                        S10234=3;
                                        S11523=0;
                                        if(!fillerStatus_o.isPartnerPresent() || fillerStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 156, column: 6
                                          fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 156, column: 6
                                          S11523=1;
                                          active[8]=1;
                                          ends[8]=1;
                                          break RUN;
                                        }
                                        else {
                                          S11518=0;
                                          if(fillerStatus_o.isACK()){//sysj\controller.sysj line: 156, column: 6
                                            fillerStatus_o.setVal("done");//sysj\controller.sysj line: 156, column: 6
                                            S11518=1;
                                            if(!fillerStatus_o.isACK()){//sysj\controller.sysj line: 156, column: 6
                                              fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 156, column: 6
                                              ends[8]=2;
                                              ;//sysj\controller.sysj line: 156, column: 6
                                              S10166=2;
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
                          S10166=2;
                          active[8]=1;
                          ends[8]=1;
                          break RUN;
                        }
                      }
                    }
                    else {
                      S10166=2;
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
