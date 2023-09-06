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
  private int S98690 = 1;
  private int S9158 = 1;
  private int S9142 = 1;
  private int S9137 = 1;
  private int S16615 = 1;
  private int S16592 = 1;
  private int S9165 = 1;
  private int S9160 = 1;
  private int S9226 = 1;
  private int S9188 = 1;
  private int S9183 = 1;
  private int S9233 = 1;
  private int S9228 = 1;
  private int S9345 = 1;
  private int S9327 = 1;
  private int S9332 = 1;
  private int S9362 = 1;
  private int S9367 = 1;
  private int S10515 = 1;
  private int S10510 = 1;
  private int S16599 = 1;
  private int S16594 = 1;
  
  private int[] ends = new int[23];
  private int[] tdone = new int[23];
  
  public void thread116563(int [] tdone, int [] ends){
        switch(S9367){
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

  public void thread116562(int [] tdone, int [] ends){
        switch(S9362){
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

  public void thread116560(int [] tdone, int [] ends){
        S9367=1;
    valveInjectorOnOff.setPresent();//sysj\controller.sysj line: 149, column: 43
    currsigs.addElement(valveInjectorOnOff);
    active[12]=1;
    ends[12]=1;
    tdone[12]=1;
  }

  public void thread116559(int [] tdone, int [] ends){
        S9362=1;
    dosUnitValveExtend.setPresent();//sysj\controller.sysj line: 149, column: 10
    currsigs.addElement(dosUnitValveExtend);
    active[11]=1;
    ends[11]=1;
    tdone[11]=1;
  }

  public void thread116557(int [] tdone, int [] ends){
        switch(S9332){
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

  public void thread116556(int [] tdone, int [] ends){
        switch(S9327){
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

  public void thread116554(int [] tdone, int [] ends){
        S9332=1;
    valveInjectorOnOff.setPresent();//sysj\controller.sysj line: 133, column: 44
    currsigs.addElement(valveInjectorOnOff);
    active[10]=1;
    ends[10]=1;
    tdone[10]=1;
  }

  public void thread116553(int [] tdone, int [] ends){
        S9327=1;
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
      switch(S98690){
        case 0 : 
          S98690=0;
          break RUN;
        
        case 1 : 
          S98690=2;
          S98690=2;
          S9158=0;
          S9142=0;
          if(!fillerReq_in.isPartnerPresent() || fillerReq_in.isPartnerPreempted()){//sysj\controller.sysj line: 107, column: 3
            fillerReq_in.setACK(false);//sysj\controller.sysj line: 107, column: 3
            S9142=1;
            active[8]=1;
            ends[8]=1;
            break RUN;
          }
          else {
            S9137=0;
            if(!fillerReq_in.isREQ()){//sysj\controller.sysj line: 107, column: 3
              fillerReq_in.setACK(true);//sysj\controller.sysj line: 107, column: 3
              S9137=1;
              if(fillerReq_in.isREQ()){//sysj\controller.sysj line: 107, column: 3
                fillerReq_in.setACK(false);//sysj\controller.sysj line: 107, column: 3
                ends[8]=2;
                ;//sysj\controller.sysj line: 107, column: 3
                request_thread_8 = (fillerReq_in.getVal() == null ? null : ((Boolean)fillerReq_in.getVal()));//sysj\controller.sysj line: 108, column: 3
                S9158=1;
                if(request_thread_8){//sysj\controller.sysj line: 110, column: 3
                  S16615=0;
                  S16592=0;
                  if(!bottleAtPos2.getprestatus()){//sysj\controller.sysj line: 112, column: 13
                    S9165=0;
                    if(!fillerStatus_o.isPartnerPresent() || fillerStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 113, column: 6
                      fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 113, column: 6
                      S9165=1;
                      active[8]=1;
                      ends[8]=1;
                      break RUN;
                    }
                    else {
                      S9160=0;
                      if(fillerStatus_o.isACK()){//sysj\controller.sysj line: 113, column: 6
                        fillerStatus_o.setVal("idle");//sysj\controller.sysj line: 113, column: 6
                        S9160=1;
                        if(!fillerStatus_o.isACK()){//sysj\controller.sysj line: 113, column: 6
                          fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 113, column: 6
                          ends[8]=2;
                          ;//sysj\controller.sysj line: 113, column: 6
                          S16592=1;
                          if(bottleAtPos2.getprestatus()){//sysj\controller.sysj line: 117, column: 13
                            System.out.println("bottle is at pos 2");//sysj\controller.sysj line: 118, column: 6
                            S9226=0;
                            S9188=0;
                            if(!fillerStatus_o.isPartnerPresent() || fillerStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 119, column: 6
                              fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 119, column: 6
                              S9188=1;
                              active[8]=1;
                              ends[8]=1;
                              break RUN;
                            }
                            else {
                              S9183=0;
                              if(fillerStatus_o.isACK()){//sysj\controller.sysj line: 119, column: 6
                                fillerStatus_o.setVal("busy");//sysj\controller.sysj line: 119, column: 6
                                S9183=1;
                                if(!fillerStatus_o.isACK()){//sysj\controller.sysj line: 119, column: 6
                                  fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 119, column: 6
                                  ends[8]=2;
                                  ;//sysj\controller.sysj line: 119, column: 6
                                  S9226=1;
                                  S9233=0;
                                  if(!percentLiquid_in.isPartnerPresent() || percentLiquid_in.isPartnerPreempted()){//sysj\controller.sysj line: 120, column: 6
                                    percentLiquid_in.setACK(false);//sysj\controller.sysj line: 120, column: 6
                                    S9233=1;
                                    active[8]=1;
                                    ends[8]=1;
                                    break RUN;
                                  }
                                  else {
                                    S9228=0;
                                    if(!percentLiquid_in.isREQ()){//sysj\controller.sysj line: 120, column: 6
                                      percentLiquid_in.setACK(true);//sysj\controller.sysj line: 120, column: 6
                                      S9228=1;
                                      if(percentLiquid_in.isREQ()){//sysj\controller.sysj line: 120, column: 6
                                        percentLiquid_in.setACK(false);//sysj\controller.sysj line: 120, column: 6
                                        ends[8]=2;
                                        ;//sysj\controller.sysj line: 120, column: 6
                                        recPercentLiq_thread_8 = (ArrayList)(percentLiquid_in.getVal() == null ? null : ((ArrayList)percentLiquid_in.getVal()));//sysj\controller.sysj line: 121, column: 6
                                        canisterNum_thread_8 = 1;//sysj\controller.sysj line: 122, column: 6
                                        S9226=2;
                                        if(canisterNum_thread_8 < 5){//sysj\controller.sysj line: 124, column: 12
                                          S9345=0;
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
                                          S9226=3;
                                          S10515=0;
                                          if(!fillerStatus_o.isPartnerPresent() || fillerStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 156, column: 6
                                            fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 156, column: 6
                                            S10515=1;
                                            active[8]=1;
                                            ends[8]=1;
                                            break RUN;
                                          }
                                          else {
                                            S10510=0;
                                            if(fillerStatus_o.isACK()){//sysj\controller.sysj line: 156, column: 6
                                              fillerStatus_o.setVal("done");//sysj\controller.sysj line: 156, column: 6
                                              S10510=1;
                                              if(!fillerStatus_o.isACK()){//sysj\controller.sysj line: 156, column: 6
                                                fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 156, column: 6
                                                ends[8]=2;
                                                ;//sysj\controller.sysj line: 156, column: 6
                                                S9158=2;
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
                            S9158=2;
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
                    S16592=1;
                    if(bottleAtPos2.getprestatus()){//sysj\controller.sysj line: 117, column: 13
                      System.out.println("bottle is at pos 2");//sysj\controller.sysj line: 118, column: 6
                      S9226=0;
                      S9188=0;
                      if(!fillerStatus_o.isPartnerPresent() || fillerStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 119, column: 6
                        fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 119, column: 6
                        S9188=1;
                        active[8]=1;
                        ends[8]=1;
                        break RUN;
                      }
                      else {
                        S9183=0;
                        if(fillerStatus_o.isACK()){//sysj\controller.sysj line: 119, column: 6
                          fillerStatus_o.setVal("busy");//sysj\controller.sysj line: 119, column: 6
                          S9183=1;
                          if(!fillerStatus_o.isACK()){//sysj\controller.sysj line: 119, column: 6
                            fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 119, column: 6
                            ends[8]=2;
                            ;//sysj\controller.sysj line: 119, column: 6
                            S9226=1;
                            S9233=0;
                            if(!percentLiquid_in.isPartnerPresent() || percentLiquid_in.isPartnerPreempted()){//sysj\controller.sysj line: 120, column: 6
                              percentLiquid_in.setACK(false);//sysj\controller.sysj line: 120, column: 6
                              S9233=1;
                              active[8]=1;
                              ends[8]=1;
                              break RUN;
                            }
                            else {
                              S9228=0;
                              if(!percentLiquid_in.isREQ()){//sysj\controller.sysj line: 120, column: 6
                                percentLiquid_in.setACK(true);//sysj\controller.sysj line: 120, column: 6
                                S9228=1;
                                if(percentLiquid_in.isREQ()){//sysj\controller.sysj line: 120, column: 6
                                  percentLiquid_in.setACK(false);//sysj\controller.sysj line: 120, column: 6
                                  ends[8]=2;
                                  ;//sysj\controller.sysj line: 120, column: 6
                                  recPercentLiq_thread_8 = (ArrayList)(percentLiquid_in.getVal() == null ? null : ((ArrayList)percentLiquid_in.getVal()));//sysj\controller.sysj line: 121, column: 6
                                  canisterNum_thread_8 = 1;//sysj\controller.sysj line: 122, column: 6
                                  S9226=2;
                                  if(canisterNum_thread_8 < 5){//sysj\controller.sysj line: 124, column: 12
                                    S9345=0;
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
                                    S9226=3;
                                    S10515=0;
                                    if(!fillerStatus_o.isPartnerPresent() || fillerStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 156, column: 6
                                      fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 156, column: 6
                                      S10515=1;
                                      active[8]=1;
                                      ends[8]=1;
                                      break RUN;
                                    }
                                    else {
                                      S10510=0;
                                      if(fillerStatus_o.isACK()){//sysj\controller.sysj line: 156, column: 6
                                        fillerStatus_o.setVal("done");//sysj\controller.sysj line: 156, column: 6
                                        S10510=1;
                                        if(!fillerStatus_o.isACK()){//sysj\controller.sysj line: 156, column: 6
                                          fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 156, column: 6
                                          ends[8]=2;
                                          ;//sysj\controller.sysj line: 156, column: 6
                                          S9158=2;
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
                      S9158=2;
                      active[8]=1;
                      ends[8]=1;
                      break RUN;
                    }
                  }
                }
                else {
                  S16615=1;
                  S16599=0;
                  if(!fillerStatus_o.isPartnerPresent() || fillerStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 159, column: 4
                    fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 159, column: 4
                    S16599=1;
                    active[8]=1;
                    ends[8]=1;
                    break RUN;
                  }
                  else {
                    S16594=0;
                    if(fillerStatus_o.isACK()){//sysj\controller.sysj line: 159, column: 4
                      fillerStatus_o.setVal("idle");//sysj\controller.sysj line: 159, column: 4
                      S16594=1;
                      if(!fillerStatus_o.isACK()){//sysj\controller.sysj line: 159, column: 4
                        fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 159, column: 4
                        ends[8]=2;
                        ;//sysj\controller.sysj line: 159, column: 4
                        S9158=2;
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
        
        case 2 : 
          switch(S9158){
            case 0 : 
              switch(S9142){
                case 0 : 
                  if(!fillerReq_in.isPartnerPresent() || fillerReq_in.isPartnerPreempted()){//sysj\controller.sysj line: 107, column: 3
                    fillerReq_in.setACK(false);//sysj\controller.sysj line: 107, column: 3
                    S9142=1;
                    active[8]=1;
                    ends[8]=1;
                    break RUN;
                  }
                  else {
                    switch(S9137){
                      case 0 : 
                        if(!fillerReq_in.isREQ()){//sysj\controller.sysj line: 107, column: 3
                          fillerReq_in.setACK(true);//sysj\controller.sysj line: 107, column: 3
                          S9137=1;
                          if(fillerReq_in.isREQ()){//sysj\controller.sysj line: 107, column: 3
                            fillerReq_in.setACK(false);//sysj\controller.sysj line: 107, column: 3
                            ends[8]=2;
                            ;//sysj\controller.sysj line: 107, column: 3
                            request_thread_8 = (fillerReq_in.getVal() == null ? null : ((Boolean)fillerReq_in.getVal()));//sysj\controller.sysj line: 108, column: 3
                            S9158=1;
                            if(request_thread_8){//sysj\controller.sysj line: 110, column: 3
                              S16615=0;
                              S16592=0;
                              if(!bottleAtPos2.getprestatus()){//sysj\controller.sysj line: 112, column: 13
                                S9165=0;
                                if(!fillerStatus_o.isPartnerPresent() || fillerStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 113, column: 6
                                  fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 113, column: 6
                                  S9165=1;
                                  active[8]=1;
                                  ends[8]=1;
                                  break RUN;
                                }
                                else {
                                  S9160=0;
                                  if(fillerStatus_o.isACK()){//sysj\controller.sysj line: 113, column: 6
                                    fillerStatus_o.setVal("idle");//sysj\controller.sysj line: 113, column: 6
                                    S9160=1;
                                    if(!fillerStatus_o.isACK()){//sysj\controller.sysj line: 113, column: 6
                                      fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 113, column: 6
                                      ends[8]=2;
                                      ;//sysj\controller.sysj line: 113, column: 6
                                      S16592=1;
                                      if(bottleAtPos2.getprestatus()){//sysj\controller.sysj line: 117, column: 13
                                        System.out.println("bottle is at pos 2");//sysj\controller.sysj line: 118, column: 6
                                        S9226=0;
                                        S9188=0;
                                        if(!fillerStatus_o.isPartnerPresent() || fillerStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 119, column: 6
                                          fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 119, column: 6
                                          S9188=1;
                                          active[8]=1;
                                          ends[8]=1;
                                          break RUN;
                                        }
                                        else {
                                          S9183=0;
                                          if(fillerStatus_o.isACK()){//sysj\controller.sysj line: 119, column: 6
                                            fillerStatus_o.setVal("busy");//sysj\controller.sysj line: 119, column: 6
                                            S9183=1;
                                            if(!fillerStatus_o.isACK()){//sysj\controller.sysj line: 119, column: 6
                                              fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 119, column: 6
                                              ends[8]=2;
                                              ;//sysj\controller.sysj line: 119, column: 6
                                              S9226=1;
                                              S9233=0;
                                              if(!percentLiquid_in.isPartnerPresent() || percentLiquid_in.isPartnerPreempted()){//sysj\controller.sysj line: 120, column: 6
                                                percentLiquid_in.setACK(false);//sysj\controller.sysj line: 120, column: 6
                                                S9233=1;
                                                active[8]=1;
                                                ends[8]=1;
                                                break RUN;
                                              }
                                              else {
                                                S9228=0;
                                                if(!percentLiquid_in.isREQ()){//sysj\controller.sysj line: 120, column: 6
                                                  percentLiquid_in.setACK(true);//sysj\controller.sysj line: 120, column: 6
                                                  S9228=1;
                                                  if(percentLiquid_in.isREQ()){//sysj\controller.sysj line: 120, column: 6
                                                    percentLiquid_in.setACK(false);//sysj\controller.sysj line: 120, column: 6
                                                    ends[8]=2;
                                                    ;//sysj\controller.sysj line: 120, column: 6
                                                    recPercentLiq_thread_8 = (ArrayList)(percentLiquid_in.getVal() == null ? null : ((ArrayList)percentLiquid_in.getVal()));//sysj\controller.sysj line: 121, column: 6
                                                    canisterNum_thread_8 = 1;//sysj\controller.sysj line: 122, column: 6
                                                    S9226=2;
                                                    if(canisterNum_thread_8 < 5){//sysj\controller.sysj line: 124, column: 12
                                                      S9345=0;
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
                                                      S9226=3;
                                                      S10515=0;
                                                      if(!fillerStatus_o.isPartnerPresent() || fillerStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 156, column: 6
                                                        fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 156, column: 6
                                                        S10515=1;
                                                        active[8]=1;
                                                        ends[8]=1;
                                                        break RUN;
                                                      }
                                                      else {
                                                        S10510=0;
                                                        if(fillerStatus_o.isACK()){//sysj\controller.sysj line: 156, column: 6
                                                          fillerStatus_o.setVal("done");//sysj\controller.sysj line: 156, column: 6
                                                          S10510=1;
                                                          if(!fillerStatus_o.isACK()){//sysj\controller.sysj line: 156, column: 6
                                                            fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 156, column: 6
                                                            ends[8]=2;
                                                            ;//sysj\controller.sysj line: 156, column: 6
                                                            S9158=2;
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
                                        S9158=2;
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
                                S16592=1;
                                if(bottleAtPos2.getprestatus()){//sysj\controller.sysj line: 117, column: 13
                                  System.out.println("bottle is at pos 2");//sysj\controller.sysj line: 118, column: 6
                                  S9226=0;
                                  S9188=0;
                                  if(!fillerStatus_o.isPartnerPresent() || fillerStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 119, column: 6
                                    fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 119, column: 6
                                    S9188=1;
                                    active[8]=1;
                                    ends[8]=1;
                                    break RUN;
                                  }
                                  else {
                                    S9183=0;
                                    if(fillerStatus_o.isACK()){//sysj\controller.sysj line: 119, column: 6
                                      fillerStatus_o.setVal("busy");//sysj\controller.sysj line: 119, column: 6
                                      S9183=1;
                                      if(!fillerStatus_o.isACK()){//sysj\controller.sysj line: 119, column: 6
                                        fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 119, column: 6
                                        ends[8]=2;
                                        ;//sysj\controller.sysj line: 119, column: 6
                                        S9226=1;
                                        S9233=0;
                                        if(!percentLiquid_in.isPartnerPresent() || percentLiquid_in.isPartnerPreempted()){//sysj\controller.sysj line: 120, column: 6
                                          percentLiquid_in.setACK(false);//sysj\controller.sysj line: 120, column: 6
                                          S9233=1;
                                          active[8]=1;
                                          ends[8]=1;
                                          break RUN;
                                        }
                                        else {
                                          S9228=0;
                                          if(!percentLiquid_in.isREQ()){//sysj\controller.sysj line: 120, column: 6
                                            percentLiquid_in.setACK(true);//sysj\controller.sysj line: 120, column: 6
                                            S9228=1;
                                            if(percentLiquid_in.isREQ()){//sysj\controller.sysj line: 120, column: 6
                                              percentLiquid_in.setACK(false);//sysj\controller.sysj line: 120, column: 6
                                              ends[8]=2;
                                              ;//sysj\controller.sysj line: 120, column: 6
                                              recPercentLiq_thread_8 = (ArrayList)(percentLiquid_in.getVal() == null ? null : ((ArrayList)percentLiquid_in.getVal()));//sysj\controller.sysj line: 121, column: 6
                                              canisterNum_thread_8 = 1;//sysj\controller.sysj line: 122, column: 6
                                              S9226=2;
                                              if(canisterNum_thread_8 < 5){//sysj\controller.sysj line: 124, column: 12
                                                S9345=0;
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
                                                S9226=3;
                                                S10515=0;
                                                if(!fillerStatus_o.isPartnerPresent() || fillerStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 156, column: 6
                                                  fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 156, column: 6
                                                  S10515=1;
                                                  active[8]=1;
                                                  ends[8]=1;
                                                  break RUN;
                                                }
                                                else {
                                                  S10510=0;
                                                  if(fillerStatus_o.isACK()){//sysj\controller.sysj line: 156, column: 6
                                                    fillerStatus_o.setVal("done");//sysj\controller.sysj line: 156, column: 6
                                                    S10510=1;
                                                    if(!fillerStatus_o.isACK()){//sysj\controller.sysj line: 156, column: 6
                                                      fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 156, column: 6
                                                      ends[8]=2;
                                                      ;//sysj\controller.sysj line: 156, column: 6
                                                      S9158=2;
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
                                  S9158=2;
                                  active[8]=1;
                                  ends[8]=1;
                                  break RUN;
                                }
                              }
                            }
                            else {
                              S16615=1;
                              S16599=0;
                              if(!fillerStatus_o.isPartnerPresent() || fillerStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 159, column: 4
                                fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 159, column: 4
                                S16599=1;
                                active[8]=1;
                                ends[8]=1;
                                break RUN;
                              }
                              else {
                                S16594=0;
                                if(fillerStatus_o.isACK()){//sysj\controller.sysj line: 159, column: 4
                                  fillerStatus_o.setVal("idle");//sysj\controller.sysj line: 159, column: 4
                                  S16594=1;
                                  if(!fillerStatus_o.isACK()){//sysj\controller.sysj line: 159, column: 4
                                    fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 159, column: 4
                                    ends[8]=2;
                                    ;//sysj\controller.sysj line: 159, column: 4
                                    S9158=2;
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
                        if(fillerReq_in.isREQ()){//sysj\controller.sysj line: 107, column: 3
                          fillerReq_in.setACK(false);//sysj\controller.sysj line: 107, column: 3
                          ends[8]=2;
                          ;//sysj\controller.sysj line: 107, column: 3
                          request_thread_8 = (fillerReq_in.getVal() == null ? null : ((Boolean)fillerReq_in.getVal()));//sysj\controller.sysj line: 108, column: 3
                          S9158=1;
                          if(request_thread_8){//sysj\controller.sysj line: 110, column: 3
                            S16615=0;
                            S16592=0;
                            if(!bottleAtPos2.getprestatus()){//sysj\controller.sysj line: 112, column: 13
                              S9165=0;
                              if(!fillerStatus_o.isPartnerPresent() || fillerStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 113, column: 6
                                fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 113, column: 6
                                S9165=1;
                                active[8]=1;
                                ends[8]=1;
                                break RUN;
                              }
                              else {
                                S9160=0;
                                if(fillerStatus_o.isACK()){//sysj\controller.sysj line: 113, column: 6
                                  fillerStatus_o.setVal("idle");//sysj\controller.sysj line: 113, column: 6
                                  S9160=1;
                                  if(!fillerStatus_o.isACK()){//sysj\controller.sysj line: 113, column: 6
                                    fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 113, column: 6
                                    ends[8]=2;
                                    ;//sysj\controller.sysj line: 113, column: 6
                                    S16592=1;
                                    if(bottleAtPos2.getprestatus()){//sysj\controller.sysj line: 117, column: 13
                                      System.out.println("bottle is at pos 2");//sysj\controller.sysj line: 118, column: 6
                                      S9226=0;
                                      S9188=0;
                                      if(!fillerStatus_o.isPartnerPresent() || fillerStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 119, column: 6
                                        fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 119, column: 6
                                        S9188=1;
                                        active[8]=1;
                                        ends[8]=1;
                                        break RUN;
                                      }
                                      else {
                                        S9183=0;
                                        if(fillerStatus_o.isACK()){//sysj\controller.sysj line: 119, column: 6
                                          fillerStatus_o.setVal("busy");//sysj\controller.sysj line: 119, column: 6
                                          S9183=1;
                                          if(!fillerStatus_o.isACK()){//sysj\controller.sysj line: 119, column: 6
                                            fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 119, column: 6
                                            ends[8]=2;
                                            ;//sysj\controller.sysj line: 119, column: 6
                                            S9226=1;
                                            S9233=0;
                                            if(!percentLiquid_in.isPartnerPresent() || percentLiquid_in.isPartnerPreempted()){//sysj\controller.sysj line: 120, column: 6
                                              percentLiquid_in.setACK(false);//sysj\controller.sysj line: 120, column: 6
                                              S9233=1;
                                              active[8]=1;
                                              ends[8]=1;
                                              break RUN;
                                            }
                                            else {
                                              S9228=0;
                                              if(!percentLiquid_in.isREQ()){//sysj\controller.sysj line: 120, column: 6
                                                percentLiquid_in.setACK(true);//sysj\controller.sysj line: 120, column: 6
                                                S9228=1;
                                                if(percentLiquid_in.isREQ()){//sysj\controller.sysj line: 120, column: 6
                                                  percentLiquid_in.setACK(false);//sysj\controller.sysj line: 120, column: 6
                                                  ends[8]=2;
                                                  ;//sysj\controller.sysj line: 120, column: 6
                                                  recPercentLiq_thread_8 = (ArrayList)(percentLiquid_in.getVal() == null ? null : ((ArrayList)percentLiquid_in.getVal()));//sysj\controller.sysj line: 121, column: 6
                                                  canisterNum_thread_8 = 1;//sysj\controller.sysj line: 122, column: 6
                                                  S9226=2;
                                                  if(canisterNum_thread_8 < 5){//sysj\controller.sysj line: 124, column: 12
                                                    S9345=0;
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
                                                    S9226=3;
                                                    S10515=0;
                                                    if(!fillerStatus_o.isPartnerPresent() || fillerStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 156, column: 6
                                                      fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 156, column: 6
                                                      S10515=1;
                                                      active[8]=1;
                                                      ends[8]=1;
                                                      break RUN;
                                                    }
                                                    else {
                                                      S10510=0;
                                                      if(fillerStatus_o.isACK()){//sysj\controller.sysj line: 156, column: 6
                                                        fillerStatus_o.setVal("done");//sysj\controller.sysj line: 156, column: 6
                                                        S10510=1;
                                                        if(!fillerStatus_o.isACK()){//sysj\controller.sysj line: 156, column: 6
                                                          fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 156, column: 6
                                                          ends[8]=2;
                                                          ;//sysj\controller.sysj line: 156, column: 6
                                                          S9158=2;
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
                                      S9158=2;
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
                              S16592=1;
                              if(bottleAtPos2.getprestatus()){//sysj\controller.sysj line: 117, column: 13
                                System.out.println("bottle is at pos 2");//sysj\controller.sysj line: 118, column: 6
                                S9226=0;
                                S9188=0;
                                if(!fillerStatus_o.isPartnerPresent() || fillerStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 119, column: 6
                                  fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 119, column: 6
                                  S9188=1;
                                  active[8]=1;
                                  ends[8]=1;
                                  break RUN;
                                }
                                else {
                                  S9183=0;
                                  if(fillerStatus_o.isACK()){//sysj\controller.sysj line: 119, column: 6
                                    fillerStatus_o.setVal("busy");//sysj\controller.sysj line: 119, column: 6
                                    S9183=1;
                                    if(!fillerStatus_o.isACK()){//sysj\controller.sysj line: 119, column: 6
                                      fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 119, column: 6
                                      ends[8]=2;
                                      ;//sysj\controller.sysj line: 119, column: 6
                                      S9226=1;
                                      S9233=0;
                                      if(!percentLiquid_in.isPartnerPresent() || percentLiquid_in.isPartnerPreempted()){//sysj\controller.sysj line: 120, column: 6
                                        percentLiquid_in.setACK(false);//sysj\controller.sysj line: 120, column: 6
                                        S9233=1;
                                        active[8]=1;
                                        ends[8]=1;
                                        break RUN;
                                      }
                                      else {
                                        S9228=0;
                                        if(!percentLiquid_in.isREQ()){//sysj\controller.sysj line: 120, column: 6
                                          percentLiquid_in.setACK(true);//sysj\controller.sysj line: 120, column: 6
                                          S9228=1;
                                          if(percentLiquid_in.isREQ()){//sysj\controller.sysj line: 120, column: 6
                                            percentLiquid_in.setACK(false);//sysj\controller.sysj line: 120, column: 6
                                            ends[8]=2;
                                            ;//sysj\controller.sysj line: 120, column: 6
                                            recPercentLiq_thread_8 = (ArrayList)(percentLiquid_in.getVal() == null ? null : ((ArrayList)percentLiquid_in.getVal()));//sysj\controller.sysj line: 121, column: 6
                                            canisterNum_thread_8 = 1;//sysj\controller.sysj line: 122, column: 6
                                            S9226=2;
                                            if(canisterNum_thread_8 < 5){//sysj\controller.sysj line: 124, column: 12
                                              S9345=0;
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
                                              S9226=3;
                                              S10515=0;
                                              if(!fillerStatus_o.isPartnerPresent() || fillerStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 156, column: 6
                                                fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 156, column: 6
                                                S10515=1;
                                                active[8]=1;
                                                ends[8]=1;
                                                break RUN;
                                              }
                                              else {
                                                S10510=0;
                                                if(fillerStatus_o.isACK()){//sysj\controller.sysj line: 156, column: 6
                                                  fillerStatus_o.setVal("done");//sysj\controller.sysj line: 156, column: 6
                                                  S10510=1;
                                                  if(!fillerStatus_o.isACK()){//sysj\controller.sysj line: 156, column: 6
                                                    fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 156, column: 6
                                                    ends[8]=2;
                                                    ;//sysj\controller.sysj line: 156, column: 6
                                                    S9158=2;
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
                                S9158=2;
                                active[8]=1;
                                ends[8]=1;
                                break RUN;
                              }
                            }
                          }
                          else {
                            S16615=1;
                            S16599=0;
                            if(!fillerStatus_o.isPartnerPresent() || fillerStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 159, column: 4
                              fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 159, column: 4
                              S16599=1;
                              active[8]=1;
                              ends[8]=1;
                              break RUN;
                            }
                            else {
                              S16594=0;
                              if(fillerStatus_o.isACK()){//sysj\controller.sysj line: 159, column: 4
                                fillerStatus_o.setVal("idle");//sysj\controller.sysj line: 159, column: 4
                                S16594=1;
                                if(!fillerStatus_o.isACK()){//sysj\controller.sysj line: 159, column: 4
                                  fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 159, column: 4
                                  ends[8]=2;
                                  ;//sysj\controller.sysj line: 159, column: 4
                                  S9158=2;
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
                  S9142=1;
                  S9142=0;
                  if(!fillerReq_in.isPartnerPresent() || fillerReq_in.isPartnerPreempted()){//sysj\controller.sysj line: 107, column: 3
                    fillerReq_in.setACK(false);//sysj\controller.sysj line: 107, column: 3
                    S9142=1;
                    active[8]=1;
                    ends[8]=1;
                    break RUN;
                  }
                  else {
                    S9137=0;
                    if(!fillerReq_in.isREQ()){//sysj\controller.sysj line: 107, column: 3
                      fillerReq_in.setACK(true);//sysj\controller.sysj line: 107, column: 3
                      S9137=1;
                      if(fillerReq_in.isREQ()){//sysj\controller.sysj line: 107, column: 3
                        fillerReq_in.setACK(false);//sysj\controller.sysj line: 107, column: 3
                        ends[8]=2;
                        ;//sysj\controller.sysj line: 107, column: 3
                        request_thread_8 = (fillerReq_in.getVal() == null ? null : ((Boolean)fillerReq_in.getVal()));//sysj\controller.sysj line: 108, column: 3
                        S9158=1;
                        if(request_thread_8){//sysj\controller.sysj line: 110, column: 3
                          S16615=0;
                          S16592=0;
                          if(!bottleAtPos2.getprestatus()){//sysj\controller.sysj line: 112, column: 13
                            S9165=0;
                            if(!fillerStatus_o.isPartnerPresent() || fillerStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 113, column: 6
                              fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 113, column: 6
                              S9165=1;
                              active[8]=1;
                              ends[8]=1;
                              break RUN;
                            }
                            else {
                              S9160=0;
                              if(fillerStatus_o.isACK()){//sysj\controller.sysj line: 113, column: 6
                                fillerStatus_o.setVal("idle");//sysj\controller.sysj line: 113, column: 6
                                S9160=1;
                                if(!fillerStatus_o.isACK()){//sysj\controller.sysj line: 113, column: 6
                                  fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 113, column: 6
                                  ends[8]=2;
                                  ;//sysj\controller.sysj line: 113, column: 6
                                  S16592=1;
                                  if(bottleAtPos2.getprestatus()){//sysj\controller.sysj line: 117, column: 13
                                    System.out.println("bottle is at pos 2");//sysj\controller.sysj line: 118, column: 6
                                    S9226=0;
                                    S9188=0;
                                    if(!fillerStatus_o.isPartnerPresent() || fillerStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 119, column: 6
                                      fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 119, column: 6
                                      S9188=1;
                                      active[8]=1;
                                      ends[8]=1;
                                      break RUN;
                                    }
                                    else {
                                      S9183=0;
                                      if(fillerStatus_o.isACK()){//sysj\controller.sysj line: 119, column: 6
                                        fillerStatus_o.setVal("busy");//sysj\controller.sysj line: 119, column: 6
                                        S9183=1;
                                        if(!fillerStatus_o.isACK()){//sysj\controller.sysj line: 119, column: 6
                                          fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 119, column: 6
                                          ends[8]=2;
                                          ;//sysj\controller.sysj line: 119, column: 6
                                          S9226=1;
                                          S9233=0;
                                          if(!percentLiquid_in.isPartnerPresent() || percentLiquid_in.isPartnerPreempted()){//sysj\controller.sysj line: 120, column: 6
                                            percentLiquid_in.setACK(false);//sysj\controller.sysj line: 120, column: 6
                                            S9233=1;
                                            active[8]=1;
                                            ends[8]=1;
                                            break RUN;
                                          }
                                          else {
                                            S9228=0;
                                            if(!percentLiquid_in.isREQ()){//sysj\controller.sysj line: 120, column: 6
                                              percentLiquid_in.setACK(true);//sysj\controller.sysj line: 120, column: 6
                                              S9228=1;
                                              if(percentLiquid_in.isREQ()){//sysj\controller.sysj line: 120, column: 6
                                                percentLiquid_in.setACK(false);//sysj\controller.sysj line: 120, column: 6
                                                ends[8]=2;
                                                ;//sysj\controller.sysj line: 120, column: 6
                                                recPercentLiq_thread_8 = (ArrayList)(percentLiquid_in.getVal() == null ? null : ((ArrayList)percentLiquid_in.getVal()));//sysj\controller.sysj line: 121, column: 6
                                                canisterNum_thread_8 = 1;//sysj\controller.sysj line: 122, column: 6
                                                S9226=2;
                                                if(canisterNum_thread_8 < 5){//sysj\controller.sysj line: 124, column: 12
                                                  S9345=0;
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
                                                  S9226=3;
                                                  S10515=0;
                                                  if(!fillerStatus_o.isPartnerPresent() || fillerStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 156, column: 6
                                                    fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 156, column: 6
                                                    S10515=1;
                                                    active[8]=1;
                                                    ends[8]=1;
                                                    break RUN;
                                                  }
                                                  else {
                                                    S10510=0;
                                                    if(fillerStatus_o.isACK()){//sysj\controller.sysj line: 156, column: 6
                                                      fillerStatus_o.setVal("done");//sysj\controller.sysj line: 156, column: 6
                                                      S10510=1;
                                                      if(!fillerStatus_o.isACK()){//sysj\controller.sysj line: 156, column: 6
                                                        fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 156, column: 6
                                                        ends[8]=2;
                                                        ;//sysj\controller.sysj line: 156, column: 6
                                                        S9158=2;
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
                                    S9158=2;
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
                            S16592=1;
                            if(bottleAtPos2.getprestatus()){//sysj\controller.sysj line: 117, column: 13
                              System.out.println("bottle is at pos 2");//sysj\controller.sysj line: 118, column: 6
                              S9226=0;
                              S9188=0;
                              if(!fillerStatus_o.isPartnerPresent() || fillerStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 119, column: 6
                                fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 119, column: 6
                                S9188=1;
                                active[8]=1;
                                ends[8]=1;
                                break RUN;
                              }
                              else {
                                S9183=0;
                                if(fillerStatus_o.isACK()){//sysj\controller.sysj line: 119, column: 6
                                  fillerStatus_o.setVal("busy");//sysj\controller.sysj line: 119, column: 6
                                  S9183=1;
                                  if(!fillerStatus_o.isACK()){//sysj\controller.sysj line: 119, column: 6
                                    fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 119, column: 6
                                    ends[8]=2;
                                    ;//sysj\controller.sysj line: 119, column: 6
                                    S9226=1;
                                    S9233=0;
                                    if(!percentLiquid_in.isPartnerPresent() || percentLiquid_in.isPartnerPreempted()){//sysj\controller.sysj line: 120, column: 6
                                      percentLiquid_in.setACK(false);//sysj\controller.sysj line: 120, column: 6
                                      S9233=1;
                                      active[8]=1;
                                      ends[8]=1;
                                      break RUN;
                                    }
                                    else {
                                      S9228=0;
                                      if(!percentLiquid_in.isREQ()){//sysj\controller.sysj line: 120, column: 6
                                        percentLiquid_in.setACK(true);//sysj\controller.sysj line: 120, column: 6
                                        S9228=1;
                                        if(percentLiquid_in.isREQ()){//sysj\controller.sysj line: 120, column: 6
                                          percentLiquid_in.setACK(false);//sysj\controller.sysj line: 120, column: 6
                                          ends[8]=2;
                                          ;//sysj\controller.sysj line: 120, column: 6
                                          recPercentLiq_thread_8 = (ArrayList)(percentLiquid_in.getVal() == null ? null : ((ArrayList)percentLiquid_in.getVal()));//sysj\controller.sysj line: 121, column: 6
                                          canisterNum_thread_8 = 1;//sysj\controller.sysj line: 122, column: 6
                                          S9226=2;
                                          if(canisterNum_thread_8 < 5){//sysj\controller.sysj line: 124, column: 12
                                            S9345=0;
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
                                            S9226=3;
                                            S10515=0;
                                            if(!fillerStatus_o.isPartnerPresent() || fillerStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 156, column: 6
                                              fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 156, column: 6
                                              S10515=1;
                                              active[8]=1;
                                              ends[8]=1;
                                              break RUN;
                                            }
                                            else {
                                              S10510=0;
                                              if(fillerStatus_o.isACK()){//sysj\controller.sysj line: 156, column: 6
                                                fillerStatus_o.setVal("done");//sysj\controller.sysj line: 156, column: 6
                                                S10510=1;
                                                if(!fillerStatus_o.isACK()){//sysj\controller.sysj line: 156, column: 6
                                                  fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 156, column: 6
                                                  ends[8]=2;
                                                  ;//sysj\controller.sysj line: 156, column: 6
                                                  S9158=2;
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
                              S9158=2;
                              active[8]=1;
                              ends[8]=1;
                              break RUN;
                            }
                          }
                        }
                        else {
                          S16615=1;
                          S16599=0;
                          if(!fillerStatus_o.isPartnerPresent() || fillerStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 159, column: 4
                            fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 159, column: 4
                            S16599=1;
                            active[8]=1;
                            ends[8]=1;
                            break RUN;
                          }
                          else {
                            S16594=0;
                            if(fillerStatus_o.isACK()){//sysj\controller.sysj line: 159, column: 4
                              fillerStatus_o.setVal("idle");//sysj\controller.sysj line: 159, column: 4
                              S16594=1;
                              if(!fillerStatus_o.isACK()){//sysj\controller.sysj line: 159, column: 4
                                fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 159, column: 4
                                ends[8]=2;
                                ;//sysj\controller.sysj line: 159, column: 4
                                S9158=2;
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
            
            case 1 : 
              switch(S16615){
                case 0 : 
                  switch(S16592){
                    case 0 : 
                      switch(S9165){
                        case 0 : 
                          if(!fillerStatus_o.isPartnerPresent() || fillerStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 113, column: 6
                            fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 113, column: 6
                            S9165=1;
                            active[8]=1;
                            ends[8]=1;
                            break RUN;
                          }
                          else {
                            switch(S9160){
                              case 0 : 
                                if(fillerStatus_o.isACK()){//sysj\controller.sysj line: 113, column: 6
                                  fillerStatus_o.setVal("idle");//sysj\controller.sysj line: 113, column: 6
                                  S9160=1;
                                  if(!fillerStatus_o.isACK()){//sysj\controller.sysj line: 113, column: 6
                                    fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 113, column: 6
                                    ends[8]=2;
                                    ;//sysj\controller.sysj line: 113, column: 6
                                    S16592=1;
                                    if(bottleAtPos2.getprestatus()){//sysj\controller.sysj line: 117, column: 13
                                      System.out.println("bottle is at pos 2");//sysj\controller.sysj line: 118, column: 6
                                      S9226=0;
                                      S9188=0;
                                      if(!fillerStatus_o.isPartnerPresent() || fillerStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 119, column: 6
                                        fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 119, column: 6
                                        S9188=1;
                                        active[8]=1;
                                        ends[8]=1;
                                        break RUN;
                                      }
                                      else {
                                        S9183=0;
                                        if(fillerStatus_o.isACK()){//sysj\controller.sysj line: 119, column: 6
                                          fillerStatus_o.setVal("busy");//sysj\controller.sysj line: 119, column: 6
                                          S9183=1;
                                          if(!fillerStatus_o.isACK()){//sysj\controller.sysj line: 119, column: 6
                                            fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 119, column: 6
                                            ends[8]=2;
                                            ;//sysj\controller.sysj line: 119, column: 6
                                            S9226=1;
                                            S9233=0;
                                            if(!percentLiquid_in.isPartnerPresent() || percentLiquid_in.isPartnerPreempted()){//sysj\controller.sysj line: 120, column: 6
                                              percentLiquid_in.setACK(false);//sysj\controller.sysj line: 120, column: 6
                                              S9233=1;
                                              active[8]=1;
                                              ends[8]=1;
                                              break RUN;
                                            }
                                            else {
                                              S9228=0;
                                              if(!percentLiquid_in.isREQ()){//sysj\controller.sysj line: 120, column: 6
                                                percentLiquid_in.setACK(true);//sysj\controller.sysj line: 120, column: 6
                                                S9228=1;
                                                if(percentLiquid_in.isREQ()){//sysj\controller.sysj line: 120, column: 6
                                                  percentLiquid_in.setACK(false);//sysj\controller.sysj line: 120, column: 6
                                                  ends[8]=2;
                                                  ;//sysj\controller.sysj line: 120, column: 6
                                                  recPercentLiq_thread_8 = (ArrayList)(percentLiquid_in.getVal() == null ? null : ((ArrayList)percentLiquid_in.getVal()));//sysj\controller.sysj line: 121, column: 6
                                                  canisterNum_thread_8 = 1;//sysj\controller.sysj line: 122, column: 6
                                                  S9226=2;
                                                  if(canisterNum_thread_8 < 5){//sysj\controller.sysj line: 124, column: 12
                                                    S9345=0;
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
                                                    S9226=3;
                                                    S10515=0;
                                                    if(!fillerStatus_o.isPartnerPresent() || fillerStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 156, column: 6
                                                      fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 156, column: 6
                                                      S10515=1;
                                                      active[8]=1;
                                                      ends[8]=1;
                                                      break RUN;
                                                    }
                                                    else {
                                                      S10510=0;
                                                      if(fillerStatus_o.isACK()){//sysj\controller.sysj line: 156, column: 6
                                                        fillerStatus_o.setVal("done");//sysj\controller.sysj line: 156, column: 6
                                                        S10510=1;
                                                        if(!fillerStatus_o.isACK()){//sysj\controller.sysj line: 156, column: 6
                                                          fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 156, column: 6
                                                          ends[8]=2;
                                                          ;//sysj\controller.sysj line: 156, column: 6
                                                          S9158=2;
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
                                      S9158=2;
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
                                  S16592=1;
                                  if(bottleAtPos2.getprestatus()){//sysj\controller.sysj line: 117, column: 13
                                    System.out.println("bottle is at pos 2");//sysj\controller.sysj line: 118, column: 6
                                    S9226=0;
                                    S9188=0;
                                    if(!fillerStatus_o.isPartnerPresent() || fillerStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 119, column: 6
                                      fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 119, column: 6
                                      S9188=1;
                                      active[8]=1;
                                      ends[8]=1;
                                      break RUN;
                                    }
                                    else {
                                      S9183=0;
                                      if(fillerStatus_o.isACK()){//sysj\controller.sysj line: 119, column: 6
                                        fillerStatus_o.setVal("busy");//sysj\controller.sysj line: 119, column: 6
                                        S9183=1;
                                        if(!fillerStatus_o.isACK()){//sysj\controller.sysj line: 119, column: 6
                                          fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 119, column: 6
                                          ends[8]=2;
                                          ;//sysj\controller.sysj line: 119, column: 6
                                          S9226=1;
                                          S9233=0;
                                          if(!percentLiquid_in.isPartnerPresent() || percentLiquid_in.isPartnerPreempted()){//sysj\controller.sysj line: 120, column: 6
                                            percentLiquid_in.setACK(false);//sysj\controller.sysj line: 120, column: 6
                                            S9233=1;
                                            active[8]=1;
                                            ends[8]=1;
                                            break RUN;
                                          }
                                          else {
                                            S9228=0;
                                            if(!percentLiquid_in.isREQ()){//sysj\controller.sysj line: 120, column: 6
                                              percentLiquid_in.setACK(true);//sysj\controller.sysj line: 120, column: 6
                                              S9228=1;
                                              if(percentLiquid_in.isREQ()){//sysj\controller.sysj line: 120, column: 6
                                                percentLiquid_in.setACK(false);//sysj\controller.sysj line: 120, column: 6
                                                ends[8]=2;
                                                ;//sysj\controller.sysj line: 120, column: 6
                                                recPercentLiq_thread_8 = (ArrayList)(percentLiquid_in.getVal() == null ? null : ((ArrayList)percentLiquid_in.getVal()));//sysj\controller.sysj line: 121, column: 6
                                                canisterNum_thread_8 = 1;//sysj\controller.sysj line: 122, column: 6
                                                S9226=2;
                                                if(canisterNum_thread_8 < 5){//sysj\controller.sysj line: 124, column: 12
                                                  S9345=0;
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
                                                  S9226=3;
                                                  S10515=0;
                                                  if(!fillerStatus_o.isPartnerPresent() || fillerStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 156, column: 6
                                                    fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 156, column: 6
                                                    S10515=1;
                                                    active[8]=1;
                                                    ends[8]=1;
                                                    break RUN;
                                                  }
                                                  else {
                                                    S10510=0;
                                                    if(fillerStatus_o.isACK()){//sysj\controller.sysj line: 156, column: 6
                                                      fillerStatus_o.setVal("done");//sysj\controller.sysj line: 156, column: 6
                                                      S10510=1;
                                                      if(!fillerStatus_o.isACK()){//sysj\controller.sysj line: 156, column: 6
                                                        fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 156, column: 6
                                                        ends[8]=2;
                                                        ;//sysj\controller.sysj line: 156, column: 6
                                                        S9158=2;
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
                                    S9158=2;
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
                          S9165=1;
                          S9165=0;
                          if(!fillerStatus_o.isPartnerPresent() || fillerStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 113, column: 6
                            fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 113, column: 6
                            S9165=1;
                            active[8]=1;
                            ends[8]=1;
                            break RUN;
                          }
                          else {
                            S9160=0;
                            if(fillerStatus_o.isACK()){//sysj\controller.sysj line: 113, column: 6
                              fillerStatus_o.setVal("idle");//sysj\controller.sysj line: 113, column: 6
                              S9160=1;
                              if(!fillerStatus_o.isACK()){//sysj\controller.sysj line: 113, column: 6
                                fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 113, column: 6
                                ends[8]=2;
                                ;//sysj\controller.sysj line: 113, column: 6
                                S16592=1;
                                if(bottleAtPos2.getprestatus()){//sysj\controller.sysj line: 117, column: 13
                                  System.out.println("bottle is at pos 2");//sysj\controller.sysj line: 118, column: 6
                                  S9226=0;
                                  S9188=0;
                                  if(!fillerStatus_o.isPartnerPresent() || fillerStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 119, column: 6
                                    fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 119, column: 6
                                    S9188=1;
                                    active[8]=1;
                                    ends[8]=1;
                                    break RUN;
                                  }
                                  else {
                                    S9183=0;
                                    if(fillerStatus_o.isACK()){//sysj\controller.sysj line: 119, column: 6
                                      fillerStatus_o.setVal("busy");//sysj\controller.sysj line: 119, column: 6
                                      S9183=1;
                                      if(!fillerStatus_o.isACK()){//sysj\controller.sysj line: 119, column: 6
                                        fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 119, column: 6
                                        ends[8]=2;
                                        ;//sysj\controller.sysj line: 119, column: 6
                                        S9226=1;
                                        S9233=0;
                                        if(!percentLiquid_in.isPartnerPresent() || percentLiquid_in.isPartnerPreempted()){//sysj\controller.sysj line: 120, column: 6
                                          percentLiquid_in.setACK(false);//sysj\controller.sysj line: 120, column: 6
                                          S9233=1;
                                          active[8]=1;
                                          ends[8]=1;
                                          break RUN;
                                        }
                                        else {
                                          S9228=0;
                                          if(!percentLiquid_in.isREQ()){//sysj\controller.sysj line: 120, column: 6
                                            percentLiquid_in.setACK(true);//sysj\controller.sysj line: 120, column: 6
                                            S9228=1;
                                            if(percentLiquid_in.isREQ()){//sysj\controller.sysj line: 120, column: 6
                                              percentLiquid_in.setACK(false);//sysj\controller.sysj line: 120, column: 6
                                              ends[8]=2;
                                              ;//sysj\controller.sysj line: 120, column: 6
                                              recPercentLiq_thread_8 = (ArrayList)(percentLiquid_in.getVal() == null ? null : ((ArrayList)percentLiquid_in.getVal()));//sysj\controller.sysj line: 121, column: 6
                                              canisterNum_thread_8 = 1;//sysj\controller.sysj line: 122, column: 6
                                              S9226=2;
                                              if(canisterNum_thread_8 < 5){//sysj\controller.sysj line: 124, column: 12
                                                S9345=0;
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
                                                S9226=3;
                                                S10515=0;
                                                if(!fillerStatus_o.isPartnerPresent() || fillerStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 156, column: 6
                                                  fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 156, column: 6
                                                  S10515=1;
                                                  active[8]=1;
                                                  ends[8]=1;
                                                  break RUN;
                                                }
                                                else {
                                                  S10510=0;
                                                  if(fillerStatus_o.isACK()){//sysj\controller.sysj line: 156, column: 6
                                                    fillerStatus_o.setVal("done");//sysj\controller.sysj line: 156, column: 6
                                                    S10510=1;
                                                    if(!fillerStatus_o.isACK()){//sysj\controller.sysj line: 156, column: 6
                                                      fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 156, column: 6
                                                      ends[8]=2;
                                                      ;//sysj\controller.sysj line: 156, column: 6
                                                      S9158=2;
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
                                  S9158=2;
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
                      switch(S9226){
                        case 0 : 
                          switch(S9188){
                            case 0 : 
                              if(!fillerStatus_o.isPartnerPresent() || fillerStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 119, column: 6
                                fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 119, column: 6
                                S9188=1;
                                active[8]=1;
                                ends[8]=1;
                                break RUN;
                              }
                              else {
                                switch(S9183){
                                  case 0 : 
                                    if(fillerStatus_o.isACK()){//sysj\controller.sysj line: 119, column: 6
                                      fillerStatus_o.setVal("busy");//sysj\controller.sysj line: 119, column: 6
                                      S9183=1;
                                      if(!fillerStatus_o.isACK()){//sysj\controller.sysj line: 119, column: 6
                                        fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 119, column: 6
                                        ends[8]=2;
                                        ;//sysj\controller.sysj line: 119, column: 6
                                        S9226=1;
                                        S9233=0;
                                        if(!percentLiquid_in.isPartnerPresent() || percentLiquid_in.isPartnerPreempted()){//sysj\controller.sysj line: 120, column: 6
                                          percentLiquid_in.setACK(false);//sysj\controller.sysj line: 120, column: 6
                                          S9233=1;
                                          active[8]=1;
                                          ends[8]=1;
                                          break RUN;
                                        }
                                        else {
                                          S9228=0;
                                          if(!percentLiquid_in.isREQ()){//sysj\controller.sysj line: 120, column: 6
                                            percentLiquid_in.setACK(true);//sysj\controller.sysj line: 120, column: 6
                                            S9228=1;
                                            if(percentLiquid_in.isREQ()){//sysj\controller.sysj line: 120, column: 6
                                              percentLiquid_in.setACK(false);//sysj\controller.sysj line: 120, column: 6
                                              ends[8]=2;
                                              ;//sysj\controller.sysj line: 120, column: 6
                                              recPercentLiq_thread_8 = (ArrayList)(percentLiquid_in.getVal() == null ? null : ((ArrayList)percentLiquid_in.getVal()));//sysj\controller.sysj line: 121, column: 6
                                              canisterNum_thread_8 = 1;//sysj\controller.sysj line: 122, column: 6
                                              S9226=2;
                                              if(canisterNum_thread_8 < 5){//sysj\controller.sysj line: 124, column: 12
                                                S9345=0;
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
                                                S9226=3;
                                                S10515=0;
                                                if(!fillerStatus_o.isPartnerPresent() || fillerStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 156, column: 6
                                                  fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 156, column: 6
                                                  S10515=1;
                                                  active[8]=1;
                                                  ends[8]=1;
                                                  break RUN;
                                                }
                                                else {
                                                  S10510=0;
                                                  if(fillerStatus_o.isACK()){//sysj\controller.sysj line: 156, column: 6
                                                    fillerStatus_o.setVal("done");//sysj\controller.sysj line: 156, column: 6
                                                    S10510=1;
                                                    if(!fillerStatus_o.isACK()){//sysj\controller.sysj line: 156, column: 6
                                                      fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 156, column: 6
                                                      ends[8]=2;
                                                      ;//sysj\controller.sysj line: 156, column: 6
                                                      S9158=2;
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
                                      S9226=1;
                                      S9233=0;
                                      if(!percentLiquid_in.isPartnerPresent() || percentLiquid_in.isPartnerPreempted()){//sysj\controller.sysj line: 120, column: 6
                                        percentLiquid_in.setACK(false);//sysj\controller.sysj line: 120, column: 6
                                        S9233=1;
                                        active[8]=1;
                                        ends[8]=1;
                                        break RUN;
                                      }
                                      else {
                                        S9228=0;
                                        if(!percentLiquid_in.isREQ()){//sysj\controller.sysj line: 120, column: 6
                                          percentLiquid_in.setACK(true);//sysj\controller.sysj line: 120, column: 6
                                          S9228=1;
                                          if(percentLiquid_in.isREQ()){//sysj\controller.sysj line: 120, column: 6
                                            percentLiquid_in.setACK(false);//sysj\controller.sysj line: 120, column: 6
                                            ends[8]=2;
                                            ;//sysj\controller.sysj line: 120, column: 6
                                            recPercentLiq_thread_8 = (ArrayList)(percentLiquid_in.getVal() == null ? null : ((ArrayList)percentLiquid_in.getVal()));//sysj\controller.sysj line: 121, column: 6
                                            canisterNum_thread_8 = 1;//sysj\controller.sysj line: 122, column: 6
                                            S9226=2;
                                            if(canisterNum_thread_8 < 5){//sysj\controller.sysj line: 124, column: 12
                                              S9345=0;
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
                                              S9226=3;
                                              S10515=0;
                                              if(!fillerStatus_o.isPartnerPresent() || fillerStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 156, column: 6
                                                fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 156, column: 6
                                                S10515=1;
                                                active[8]=1;
                                                ends[8]=1;
                                                break RUN;
                                              }
                                              else {
                                                S10510=0;
                                                if(fillerStatus_o.isACK()){//sysj\controller.sysj line: 156, column: 6
                                                  fillerStatus_o.setVal("done");//sysj\controller.sysj line: 156, column: 6
                                                  S10510=1;
                                                  if(!fillerStatus_o.isACK()){//sysj\controller.sysj line: 156, column: 6
                                                    fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 156, column: 6
                                                    ends[8]=2;
                                                    ;//sysj\controller.sysj line: 156, column: 6
                                                    S9158=2;
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
                              S9188=1;
                              S9188=0;
                              if(!fillerStatus_o.isPartnerPresent() || fillerStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 119, column: 6
                                fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 119, column: 6
                                S9188=1;
                                active[8]=1;
                                ends[8]=1;
                                break RUN;
                              }
                              else {
                                S9183=0;
                                if(fillerStatus_o.isACK()){//sysj\controller.sysj line: 119, column: 6
                                  fillerStatus_o.setVal("busy");//sysj\controller.sysj line: 119, column: 6
                                  S9183=1;
                                  if(!fillerStatus_o.isACK()){//sysj\controller.sysj line: 119, column: 6
                                    fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 119, column: 6
                                    ends[8]=2;
                                    ;//sysj\controller.sysj line: 119, column: 6
                                    S9226=1;
                                    S9233=0;
                                    if(!percentLiquid_in.isPartnerPresent() || percentLiquid_in.isPartnerPreempted()){//sysj\controller.sysj line: 120, column: 6
                                      percentLiquid_in.setACK(false);//sysj\controller.sysj line: 120, column: 6
                                      S9233=1;
                                      active[8]=1;
                                      ends[8]=1;
                                      break RUN;
                                    }
                                    else {
                                      S9228=0;
                                      if(!percentLiquid_in.isREQ()){//sysj\controller.sysj line: 120, column: 6
                                        percentLiquid_in.setACK(true);//sysj\controller.sysj line: 120, column: 6
                                        S9228=1;
                                        if(percentLiquid_in.isREQ()){//sysj\controller.sysj line: 120, column: 6
                                          percentLiquid_in.setACK(false);//sysj\controller.sysj line: 120, column: 6
                                          ends[8]=2;
                                          ;//sysj\controller.sysj line: 120, column: 6
                                          recPercentLiq_thread_8 = (ArrayList)(percentLiquid_in.getVal() == null ? null : ((ArrayList)percentLiquid_in.getVal()));//sysj\controller.sysj line: 121, column: 6
                                          canisterNum_thread_8 = 1;//sysj\controller.sysj line: 122, column: 6
                                          S9226=2;
                                          if(canisterNum_thread_8 < 5){//sysj\controller.sysj line: 124, column: 12
                                            S9345=0;
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
                                            S9226=3;
                                            S10515=0;
                                            if(!fillerStatus_o.isPartnerPresent() || fillerStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 156, column: 6
                                              fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 156, column: 6
                                              S10515=1;
                                              active[8]=1;
                                              ends[8]=1;
                                              break RUN;
                                            }
                                            else {
                                              S10510=0;
                                              if(fillerStatus_o.isACK()){//sysj\controller.sysj line: 156, column: 6
                                                fillerStatus_o.setVal("done");//sysj\controller.sysj line: 156, column: 6
                                                S10510=1;
                                                if(!fillerStatus_o.isACK()){//sysj\controller.sysj line: 156, column: 6
                                                  fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 156, column: 6
                                                  ends[8]=2;
                                                  ;//sysj\controller.sysj line: 156, column: 6
                                                  S9158=2;
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
                          switch(S9233){
                            case 0 : 
                              if(!percentLiquid_in.isPartnerPresent() || percentLiquid_in.isPartnerPreempted()){//sysj\controller.sysj line: 120, column: 6
                                percentLiquid_in.setACK(false);//sysj\controller.sysj line: 120, column: 6
                                S9233=1;
                                active[8]=1;
                                ends[8]=1;
                                break RUN;
                              }
                              else {
                                switch(S9228){
                                  case 0 : 
                                    if(!percentLiquid_in.isREQ()){//sysj\controller.sysj line: 120, column: 6
                                      percentLiquid_in.setACK(true);//sysj\controller.sysj line: 120, column: 6
                                      S9228=1;
                                      if(percentLiquid_in.isREQ()){//sysj\controller.sysj line: 120, column: 6
                                        percentLiquid_in.setACK(false);//sysj\controller.sysj line: 120, column: 6
                                        ends[8]=2;
                                        ;//sysj\controller.sysj line: 120, column: 6
                                        recPercentLiq_thread_8 = (ArrayList)(percentLiquid_in.getVal() == null ? null : ((ArrayList)percentLiquid_in.getVal()));//sysj\controller.sysj line: 121, column: 6
                                        canisterNum_thread_8 = 1;//sysj\controller.sysj line: 122, column: 6
                                        S9226=2;
                                        if(canisterNum_thread_8 < 5){//sysj\controller.sysj line: 124, column: 12
                                          S9345=0;
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
                                          S9226=3;
                                          S10515=0;
                                          if(!fillerStatus_o.isPartnerPresent() || fillerStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 156, column: 6
                                            fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 156, column: 6
                                            S10515=1;
                                            active[8]=1;
                                            ends[8]=1;
                                            break RUN;
                                          }
                                          else {
                                            S10510=0;
                                            if(fillerStatus_o.isACK()){//sysj\controller.sysj line: 156, column: 6
                                              fillerStatus_o.setVal("done");//sysj\controller.sysj line: 156, column: 6
                                              S10510=1;
                                              if(!fillerStatus_o.isACK()){//sysj\controller.sysj line: 156, column: 6
                                                fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 156, column: 6
                                                ends[8]=2;
                                                ;//sysj\controller.sysj line: 156, column: 6
                                                S9158=2;
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
                                      S9226=2;
                                      if(canisterNum_thread_8 < 5){//sysj\controller.sysj line: 124, column: 12
                                        S9345=0;
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
                                        S9226=3;
                                        S10515=0;
                                        if(!fillerStatus_o.isPartnerPresent() || fillerStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 156, column: 6
                                          fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 156, column: 6
                                          S10515=1;
                                          active[8]=1;
                                          ends[8]=1;
                                          break RUN;
                                        }
                                        else {
                                          S10510=0;
                                          if(fillerStatus_o.isACK()){//sysj\controller.sysj line: 156, column: 6
                                            fillerStatus_o.setVal("done");//sysj\controller.sysj line: 156, column: 6
                                            S10510=1;
                                            if(!fillerStatus_o.isACK()){//sysj\controller.sysj line: 156, column: 6
                                              fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 156, column: 6
                                              ends[8]=2;
                                              ;//sysj\controller.sysj line: 156, column: 6
                                              S9158=2;
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
                              S9233=1;
                              S9233=0;
                              if(!percentLiquid_in.isPartnerPresent() || percentLiquid_in.isPartnerPreempted()){//sysj\controller.sysj line: 120, column: 6
                                percentLiquid_in.setACK(false);//sysj\controller.sysj line: 120, column: 6
                                S9233=1;
                                active[8]=1;
                                ends[8]=1;
                                break RUN;
                              }
                              else {
                                S9228=0;
                                if(!percentLiquid_in.isREQ()){//sysj\controller.sysj line: 120, column: 6
                                  percentLiquid_in.setACK(true);//sysj\controller.sysj line: 120, column: 6
                                  S9228=1;
                                  if(percentLiquid_in.isREQ()){//sysj\controller.sysj line: 120, column: 6
                                    percentLiquid_in.setACK(false);//sysj\controller.sysj line: 120, column: 6
                                    ends[8]=2;
                                    ;//sysj\controller.sysj line: 120, column: 6
                                    recPercentLiq_thread_8 = (ArrayList)(percentLiquid_in.getVal() == null ? null : ((ArrayList)percentLiquid_in.getVal()));//sysj\controller.sysj line: 121, column: 6
                                    canisterNum_thread_8 = 1;//sysj\controller.sysj line: 122, column: 6
                                    S9226=2;
                                    if(canisterNum_thread_8 < 5){//sysj\controller.sysj line: 124, column: 12
                                      S9345=0;
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
                                      S9226=3;
                                      S10515=0;
                                      if(!fillerStatus_o.isPartnerPresent() || fillerStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 156, column: 6
                                        fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 156, column: 6
                                        S10515=1;
                                        active[8]=1;
                                        ends[8]=1;
                                        break RUN;
                                      }
                                      else {
                                        S10510=0;
                                        if(fillerStatus_o.isACK()){//sysj\controller.sysj line: 156, column: 6
                                          fillerStatus_o.setVal("done");//sysj\controller.sysj line: 156, column: 6
                                          S10510=1;
                                          if(!fillerStatus_o.isACK()){//sysj\controller.sysj line: 156, column: 6
                                            fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 156, column: 6
                                            ends[8]=2;
                                            ;//sysj\controller.sysj line: 156, column: 6
                                            S9158=2;
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
                          switch(S9345){
                            case 0 : 
                              if(selectedCanister.getprestatus()){//sysj\controller.sysj line: 126, column: 13
                                S9345=1;
                                thread116553(tdone,ends);
                                thread116554(tdone,ends);
                                int biggest116555 = 0;
                                if(ends[9]>=biggest116555){
                                  biggest116555=ends[9];
                                }
                                if(ends[10]>=biggest116555){
                                  biggest116555=ends[10];
                                }
                                if(biggest116555 == 1){
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
                                S9345=2;
                                valveInletOnOff.setPresent();//sysj\controller.sysj line: 143, column: 9
                                currsigs.addElement(valveInletOnOff);
                                active[8]=1;
                                ends[8]=1;
                                break RUN;
                              }
                              else {
                                thread116556(tdone,ends);
                                thread116557(tdone,ends);
                                int biggest116558 = 0;
                                if(ends[9]>=biggest116558){
                                  biggest116558=ends[9];
                                }
                                if(ends[10]>=biggest116558){
                                  biggest116558=ends[10];
                                }
                                if(biggest116558 == 1){
                                  active[8]=1;
                                  ends[8]=1;
                                  break RUN;
                                }
                                //FINXME code
                                if(biggest116558 == 0){
                                  System.out.println("Canister above bottle");//sysj\controller.sysj line: 135, column: 8
                                  receivedPercentage.setPresent();//sysj\controller.sysj line: 139, column: 8
                                  currsigs.addElement(receivedPercentage);
                                  receivedPercentage.setValue(recPercentLiq_thread_8.get(canisterNum_thread_8 - 1));//sysj\controller.sysj line: 139, column: 8
                                  S9345=2;
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
                                S9345=3;
                                thread116559(tdone,ends);
                                thread116560(tdone,ends);
                                int biggest116561 = 0;
                                if(ends[11]>=biggest116561){
                                  biggest116561=ends[11];
                                }
                                if(ends[12]>=biggest116561){
                                  biggest116561=ends[12];
                                }
                                if(biggest116561 == 1){
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
                                S9345=4;
                                active[8]=1;
                                ends[8]=1;
                                break RUN;
                              }
                              else {
                                thread116562(tdone,ends);
                                thread116563(tdone,ends);
                                int biggest116564 = 0;
                                if(ends[11]>=biggest116564){
                                  biggest116564=ends[11];
                                }
                                if(ends[12]>=biggest116564){
                                  biggest116564=ends[12];
                                }
                                if(biggest116564 == 1){
                                  active[8]=1;
                                  ends[8]=1;
                                  break RUN;
                                }
                                //FINXME code
                                if(biggest116564 == 0){
                                  System.out.println("Canister returned");//sysj\controller.sysj line: 151, column: 8
                                  canisterNum_thread_8 += 1;//sysj\controller.sysj line: 153, column: 8
                                  S9345=4;
                                  active[8]=1;
                                  ends[8]=1;
                                  break RUN;
                                }
                              }
                            
                            case 4 : 
                              S9345=4;
                              if(canisterNum_thread_8 < 5){//sysj\controller.sysj line: 124, column: 12
                                S9345=0;
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
                                S9226=3;
                                S10515=0;
                                if(!fillerStatus_o.isPartnerPresent() || fillerStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 156, column: 6
                                  fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 156, column: 6
                                  S10515=1;
                                  active[8]=1;
                                  ends[8]=1;
                                  break RUN;
                                }
                                else {
                                  S10510=0;
                                  if(fillerStatus_o.isACK()){//sysj\controller.sysj line: 156, column: 6
                                    fillerStatus_o.setVal("done");//sysj\controller.sysj line: 156, column: 6
                                    S10510=1;
                                    if(!fillerStatus_o.isACK()){//sysj\controller.sysj line: 156, column: 6
                                      fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 156, column: 6
                                      ends[8]=2;
                                      ;//sysj\controller.sysj line: 156, column: 6
                                      S9158=2;
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
                          switch(S10515){
                            case 0 : 
                              if(!fillerStatus_o.isPartnerPresent() || fillerStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 156, column: 6
                                fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 156, column: 6
                                S10515=1;
                                active[8]=1;
                                ends[8]=1;
                                break RUN;
                              }
                              else {
                                switch(S10510){
                                  case 0 : 
                                    if(fillerStatus_o.isACK()){//sysj\controller.sysj line: 156, column: 6
                                      fillerStatus_o.setVal("done");//sysj\controller.sysj line: 156, column: 6
                                      S10510=1;
                                      if(!fillerStatus_o.isACK()){//sysj\controller.sysj line: 156, column: 6
                                        fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 156, column: 6
                                        ends[8]=2;
                                        ;//sysj\controller.sysj line: 156, column: 6
                                        S9158=2;
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
                                      S9158=2;
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
                              S10515=1;
                              S10515=0;
                              if(!fillerStatus_o.isPartnerPresent() || fillerStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 156, column: 6
                                fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 156, column: 6
                                S10515=1;
                                active[8]=1;
                                ends[8]=1;
                                break RUN;
                              }
                              else {
                                S10510=0;
                                if(fillerStatus_o.isACK()){//sysj\controller.sysj line: 156, column: 6
                                  fillerStatus_o.setVal("done");//sysj\controller.sysj line: 156, column: 6
                                  S10510=1;
                                  if(!fillerStatus_o.isACK()){//sysj\controller.sysj line: 156, column: 6
                                    fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 156, column: 6
                                    ends[8]=2;
                                    ;//sysj\controller.sysj line: 156, column: 6
                                    S9158=2;
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
                
                case 1 : 
                  switch(S16599){
                    case 0 : 
                      if(!fillerStatus_o.isPartnerPresent() || fillerStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 159, column: 4
                        fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 159, column: 4
                        S16599=1;
                        active[8]=1;
                        ends[8]=1;
                        break RUN;
                      }
                      else {
                        switch(S16594){
                          case 0 : 
                            if(fillerStatus_o.isACK()){//sysj\controller.sysj line: 159, column: 4
                              fillerStatus_o.setVal("idle");//sysj\controller.sysj line: 159, column: 4
                              S16594=1;
                              if(!fillerStatus_o.isACK()){//sysj\controller.sysj line: 159, column: 4
                                fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 159, column: 4
                                ends[8]=2;
                                ;//sysj\controller.sysj line: 159, column: 4
                                S9158=2;
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
                            if(!fillerStatus_o.isACK()){//sysj\controller.sysj line: 159, column: 4
                              fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 159, column: 4
                              ends[8]=2;
                              ;//sysj\controller.sysj line: 159, column: 4
                              S9158=2;
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
                      S16599=1;
                      S16599=0;
                      if(!fillerStatus_o.isPartnerPresent() || fillerStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 159, column: 4
                        fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 159, column: 4
                        S16599=1;
                        active[8]=1;
                        ends[8]=1;
                        break RUN;
                      }
                      else {
                        S16594=0;
                        if(fillerStatus_o.isACK()){//sysj\controller.sysj line: 159, column: 4
                          fillerStatus_o.setVal("idle");//sysj\controller.sysj line: 159, column: 4
                          S16594=1;
                          if(!fillerStatus_o.isACK()){//sysj\controller.sysj line: 159, column: 4
                            fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 159, column: 4
                            ends[8]=2;
                            ;//sysj\controller.sysj line: 159, column: 4
                            S9158=2;
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
            
            case 2 : 
              S9158=2;
              S9158=0;
              S9142=0;
              if(!fillerReq_in.isPartnerPresent() || fillerReq_in.isPartnerPreempted()){//sysj\controller.sysj line: 107, column: 3
                fillerReq_in.setACK(false);//sysj\controller.sysj line: 107, column: 3
                S9142=1;
                active[8]=1;
                ends[8]=1;
                break RUN;
              }
              else {
                S9137=0;
                if(!fillerReq_in.isREQ()){//sysj\controller.sysj line: 107, column: 3
                  fillerReq_in.setACK(true);//sysj\controller.sysj line: 107, column: 3
                  S9137=1;
                  if(fillerReq_in.isREQ()){//sysj\controller.sysj line: 107, column: 3
                    fillerReq_in.setACK(false);//sysj\controller.sysj line: 107, column: 3
                    ends[8]=2;
                    ;//sysj\controller.sysj line: 107, column: 3
                    request_thread_8 = (fillerReq_in.getVal() == null ? null : ((Boolean)fillerReq_in.getVal()));//sysj\controller.sysj line: 108, column: 3
                    S9158=1;
                    if(request_thread_8){//sysj\controller.sysj line: 110, column: 3
                      S16615=0;
                      S16592=0;
                      if(!bottleAtPos2.getprestatus()){//sysj\controller.sysj line: 112, column: 13
                        S9165=0;
                        if(!fillerStatus_o.isPartnerPresent() || fillerStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 113, column: 6
                          fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 113, column: 6
                          S9165=1;
                          active[8]=1;
                          ends[8]=1;
                          break RUN;
                        }
                        else {
                          S9160=0;
                          if(fillerStatus_o.isACK()){//sysj\controller.sysj line: 113, column: 6
                            fillerStatus_o.setVal("idle");//sysj\controller.sysj line: 113, column: 6
                            S9160=1;
                            if(!fillerStatus_o.isACK()){//sysj\controller.sysj line: 113, column: 6
                              fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 113, column: 6
                              ends[8]=2;
                              ;//sysj\controller.sysj line: 113, column: 6
                              S16592=1;
                              if(bottleAtPos2.getprestatus()){//sysj\controller.sysj line: 117, column: 13
                                System.out.println("bottle is at pos 2");//sysj\controller.sysj line: 118, column: 6
                                S9226=0;
                                S9188=0;
                                if(!fillerStatus_o.isPartnerPresent() || fillerStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 119, column: 6
                                  fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 119, column: 6
                                  S9188=1;
                                  active[8]=1;
                                  ends[8]=1;
                                  break RUN;
                                }
                                else {
                                  S9183=0;
                                  if(fillerStatus_o.isACK()){//sysj\controller.sysj line: 119, column: 6
                                    fillerStatus_o.setVal("busy");//sysj\controller.sysj line: 119, column: 6
                                    S9183=1;
                                    if(!fillerStatus_o.isACK()){//sysj\controller.sysj line: 119, column: 6
                                      fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 119, column: 6
                                      ends[8]=2;
                                      ;//sysj\controller.sysj line: 119, column: 6
                                      S9226=1;
                                      S9233=0;
                                      if(!percentLiquid_in.isPartnerPresent() || percentLiquid_in.isPartnerPreempted()){//sysj\controller.sysj line: 120, column: 6
                                        percentLiquid_in.setACK(false);//sysj\controller.sysj line: 120, column: 6
                                        S9233=1;
                                        active[8]=1;
                                        ends[8]=1;
                                        break RUN;
                                      }
                                      else {
                                        S9228=0;
                                        if(!percentLiquid_in.isREQ()){//sysj\controller.sysj line: 120, column: 6
                                          percentLiquid_in.setACK(true);//sysj\controller.sysj line: 120, column: 6
                                          S9228=1;
                                          if(percentLiquid_in.isREQ()){//sysj\controller.sysj line: 120, column: 6
                                            percentLiquid_in.setACK(false);//sysj\controller.sysj line: 120, column: 6
                                            ends[8]=2;
                                            ;//sysj\controller.sysj line: 120, column: 6
                                            recPercentLiq_thread_8 = (ArrayList)(percentLiquid_in.getVal() == null ? null : ((ArrayList)percentLiquid_in.getVal()));//sysj\controller.sysj line: 121, column: 6
                                            canisterNum_thread_8 = 1;//sysj\controller.sysj line: 122, column: 6
                                            S9226=2;
                                            if(canisterNum_thread_8 < 5){//sysj\controller.sysj line: 124, column: 12
                                              S9345=0;
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
                                              S9226=3;
                                              S10515=0;
                                              if(!fillerStatus_o.isPartnerPresent() || fillerStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 156, column: 6
                                                fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 156, column: 6
                                                S10515=1;
                                                active[8]=1;
                                                ends[8]=1;
                                                break RUN;
                                              }
                                              else {
                                                S10510=0;
                                                if(fillerStatus_o.isACK()){//sysj\controller.sysj line: 156, column: 6
                                                  fillerStatus_o.setVal("done");//sysj\controller.sysj line: 156, column: 6
                                                  S10510=1;
                                                  if(!fillerStatus_o.isACK()){//sysj\controller.sysj line: 156, column: 6
                                                    fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 156, column: 6
                                                    ends[8]=2;
                                                    ;//sysj\controller.sysj line: 156, column: 6
                                                    S9158=2;
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
                                S9158=2;
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
                        S16592=1;
                        if(bottleAtPos2.getprestatus()){//sysj\controller.sysj line: 117, column: 13
                          System.out.println("bottle is at pos 2");//sysj\controller.sysj line: 118, column: 6
                          S9226=0;
                          S9188=0;
                          if(!fillerStatus_o.isPartnerPresent() || fillerStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 119, column: 6
                            fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 119, column: 6
                            S9188=1;
                            active[8]=1;
                            ends[8]=1;
                            break RUN;
                          }
                          else {
                            S9183=0;
                            if(fillerStatus_o.isACK()){//sysj\controller.sysj line: 119, column: 6
                              fillerStatus_o.setVal("busy");//sysj\controller.sysj line: 119, column: 6
                              S9183=1;
                              if(!fillerStatus_o.isACK()){//sysj\controller.sysj line: 119, column: 6
                                fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 119, column: 6
                                ends[8]=2;
                                ;//sysj\controller.sysj line: 119, column: 6
                                S9226=1;
                                S9233=0;
                                if(!percentLiquid_in.isPartnerPresent() || percentLiquid_in.isPartnerPreempted()){//sysj\controller.sysj line: 120, column: 6
                                  percentLiquid_in.setACK(false);//sysj\controller.sysj line: 120, column: 6
                                  S9233=1;
                                  active[8]=1;
                                  ends[8]=1;
                                  break RUN;
                                }
                                else {
                                  S9228=0;
                                  if(!percentLiquid_in.isREQ()){//sysj\controller.sysj line: 120, column: 6
                                    percentLiquid_in.setACK(true);//sysj\controller.sysj line: 120, column: 6
                                    S9228=1;
                                    if(percentLiquid_in.isREQ()){//sysj\controller.sysj line: 120, column: 6
                                      percentLiquid_in.setACK(false);//sysj\controller.sysj line: 120, column: 6
                                      ends[8]=2;
                                      ;//sysj\controller.sysj line: 120, column: 6
                                      recPercentLiq_thread_8 = (ArrayList)(percentLiquid_in.getVal() == null ? null : ((ArrayList)percentLiquid_in.getVal()));//sysj\controller.sysj line: 121, column: 6
                                      canisterNum_thread_8 = 1;//sysj\controller.sysj line: 122, column: 6
                                      S9226=2;
                                      if(canisterNum_thread_8 < 5){//sysj\controller.sysj line: 124, column: 12
                                        S9345=0;
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
                                        S9226=3;
                                        S10515=0;
                                        if(!fillerStatus_o.isPartnerPresent() || fillerStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 156, column: 6
                                          fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 156, column: 6
                                          S10515=1;
                                          active[8]=1;
                                          ends[8]=1;
                                          break RUN;
                                        }
                                        else {
                                          S10510=0;
                                          if(fillerStatus_o.isACK()){//sysj\controller.sysj line: 156, column: 6
                                            fillerStatus_o.setVal("done");//sysj\controller.sysj line: 156, column: 6
                                            S10510=1;
                                            if(!fillerStatus_o.isACK()){//sysj\controller.sysj line: 156, column: 6
                                              fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 156, column: 6
                                              ends[8]=2;
                                              ;//sysj\controller.sysj line: 156, column: 6
                                              S9158=2;
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
                          S9158=2;
                          active[8]=1;
                          ends[8]=1;
                          break RUN;
                        }
                      }
                    }
                    else {
                      S16615=1;
                      S16599=0;
                      if(!fillerStatus_o.isPartnerPresent() || fillerStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 159, column: 4
                        fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 159, column: 4
                        S16599=1;
                        active[8]=1;
                        ends[8]=1;
                        break RUN;
                      }
                      else {
                        S16594=0;
                        if(fillerStatus_o.isACK()){//sysj\controller.sysj line: 159, column: 4
                          fillerStatus_o.setVal("idle");//sysj\controller.sysj line: 159, column: 4
                          S16594=1;
                          if(!fillerStatus_o.isACK()){//sysj\controller.sysj line: 159, column: 4
                            fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 159, column: 4
                            ends[8]=2;
                            ;//sysj\controller.sysj line: 159, column: 4
                            S9158=2;
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
