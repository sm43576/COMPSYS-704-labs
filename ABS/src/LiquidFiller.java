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
  private Boolean request_thread_8;//sysj\controller.sysj line: 106, column: 3
  private ArrayList recPercentLiq_thread_8;//sysj\controller.sysj line: 120, column: 6
  private int canisterNum_thread_8;//sysj\controller.sysj line: 121, column: 6
  private int S97796 = 1;
  private int S7988 = 1;
  private int S7972 = 1;
  private int S7967 = 1;
  private int S15468 = 1;
  private int S8035 = 1;
  private int S7995 = 1;
  private int S7990 = 1;
  private int S8080 = 1;
  private int S8042 = 1;
  private int S8037 = 1;
  private int S8087 = 1;
  private int S8082 = 1;
  private int S8199 = 1;
  private int S8181 = 1;
  private int S8186 = 1;
  private int S8216 = 1;
  private int S8221 = 1;
  private int S9369 = 1;
  private int S9364 = 1;
  private int S15452 = 1;
  private int S15447 = 1;
  
  private int[] ends = new int[23];
  private int[] tdone = new int[23];
  
  public void thread118501(int [] tdone, int [] ends){
        switch(S8221){
      case 0 : 
        active[12]=0;
        ends[12]=0;
        tdone[12]=1;
        break;
      
      case 1 : 
        valveInjectorOnOff.setPresent();//sysj\controller.sysj line: 148, column: 43
        currsigs.addElement(valveInjectorOnOff);
        active[12]=1;
        ends[12]=1;
        tdone[12]=1;
        break;
      
    }
  }

  public void thread118500(int [] tdone, int [] ends){
        switch(S8216){
      case 0 : 
        active[11]=0;
        ends[11]=0;
        tdone[11]=1;
        break;
      
      case 1 : 
        dosUnitValveExtend.setPresent();//sysj\controller.sysj line: 148, column: 10
        currsigs.addElement(dosUnitValveExtend);
        active[11]=1;
        ends[11]=1;
        tdone[11]=1;
        break;
      
    }
  }

  public void thread118498(int [] tdone, int [] ends){
        S8221=1;
    valveInjectorOnOff.setPresent();//sysj\controller.sysj line: 148, column: 43
    currsigs.addElement(valveInjectorOnOff);
    active[12]=1;
    ends[12]=1;
    tdone[12]=1;
  }

  public void thread118497(int [] tdone, int [] ends){
        S8216=1;
    dosUnitValveExtend.setPresent();//sysj\controller.sysj line: 148, column: 10
    currsigs.addElement(dosUnitValveExtend);
    active[11]=1;
    ends[11]=1;
    tdone[11]=1;
  }

  public void thread118495(int [] tdone, int [] ends){
        switch(S8186){
      case 0 : 
        active[10]=0;
        ends[10]=0;
        tdone[10]=1;
        break;
      
      case 1 : 
        valveInjectorOnOff.setPresent();//sysj\controller.sysj line: 132, column: 44
        currsigs.addElement(valveInjectorOnOff);
        active[10]=1;
        ends[10]=1;
        tdone[10]=1;
        break;
      
    }
  }

  public void thread118494(int [] tdone, int [] ends){
        switch(S8181){
      case 0 : 
        active[9]=0;
        ends[9]=0;
        tdone[9]=1;
        break;
      
      case 1 : 
        dosUnitValveRetract.setPresent();//sysj\controller.sysj line: 132, column: 10
        currsigs.addElement(dosUnitValveRetract);
        active[9]=1;
        ends[9]=1;
        tdone[9]=1;
        break;
      
    }
  }

  public void thread118492(int [] tdone, int [] ends){
        S8186=1;
    valveInjectorOnOff.setPresent();//sysj\controller.sysj line: 132, column: 44
    currsigs.addElement(valveInjectorOnOff);
    active[10]=1;
    ends[10]=1;
    tdone[10]=1;
  }

  public void thread118491(int [] tdone, int [] ends){
        S8181=1;
    dosUnitValveRetract.setPresent();//sysj\controller.sysj line: 132, column: 10
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
      switch(S97796){
        case 0 : 
          S97796=0;
          break RUN;
        
        case 1 : 
          S97796=2;
          S97796=2;
          S7988=0;
          S7972=0;
          if(!fillerReq_in.isPartnerPresent() || fillerReq_in.isPartnerPreempted()){//sysj\controller.sysj line: 105, column: 3
            fillerReq_in.setACK(false);//sysj\controller.sysj line: 105, column: 3
            S7972=1;
            active[8]=1;
            ends[8]=1;
            break RUN;
          }
          else {
            S7967=0;
            if(!fillerReq_in.isREQ()){//sysj\controller.sysj line: 105, column: 3
              fillerReq_in.setACK(true);//sysj\controller.sysj line: 105, column: 3
              S7967=1;
              if(fillerReq_in.isREQ()){//sysj\controller.sysj line: 105, column: 3
                fillerReq_in.setACK(false);//sysj\controller.sysj line: 105, column: 3
                ends[8]=2;
                ;//sysj\controller.sysj line: 105, column: 3
                request_thread_8 = (fillerReq_in.getVal() == null ? null : ((Boolean)fillerReq_in.getVal()));//sysj\controller.sysj line: 106, column: 3
                S7988=1;
                if(request_thread_8){//sysj\controller.sysj line: 108, column: 3
                  S15468=0;
                  System.out.println("Filler - received req from orch");//sysj\controller.sysj line: 110, column: 5
                  S8035=0;
                  if(!bottleAtPos2.getprestatus()){//sysj\controller.sysj line: 111, column: 13
                    S7995=0;
                    if(!fillerStatus_o.isPartnerPresent() || fillerStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 112, column: 6
                      fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 112, column: 6
                      S7995=1;
                      active[8]=1;
                      ends[8]=1;
                      break RUN;
                    }
                    else {
                      S7990=0;
                      if(fillerStatus_o.isACK()){//sysj\controller.sysj line: 112, column: 6
                        fillerStatus_o.setVal("idle");//sysj\controller.sysj line: 112, column: 6
                        S7990=1;
                        if(!fillerStatus_o.isACK()){//sysj\controller.sysj line: 112, column: 6
                          fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 112, column: 6
                          ends[8]=2;
                          ;//sysj\controller.sysj line: 112, column: 6
                          S8035=1;
                          if(bottleAtPos2.getprestatus()){//sysj\controller.sysj line: 116, column: 13
                            System.out.println("Filler - bottle is at pos 2");//sysj\controller.sysj line: 117, column: 6
                            S8080=0;
                            S8042=0;
                            if(!fillerStatus_o.isPartnerPresent() || fillerStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 118, column: 6
                              fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 118, column: 6
                              S8042=1;
                              active[8]=1;
                              ends[8]=1;
                              break RUN;
                            }
                            else {
                              S8037=0;
                              if(fillerStatus_o.isACK()){//sysj\controller.sysj line: 118, column: 6
                                fillerStatus_o.setVal("busy");//sysj\controller.sysj line: 118, column: 6
                                S8037=1;
                                if(!fillerStatus_o.isACK()){//sysj\controller.sysj line: 118, column: 6
                                  fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 118, column: 6
                                  ends[8]=2;
                                  ;//sysj\controller.sysj line: 118, column: 6
                                  S8080=1;
                                  S8087=0;
                                  if(!percentLiquid_in.isPartnerPresent() || percentLiquid_in.isPartnerPreempted()){//sysj\controller.sysj line: 119, column: 6
                                    percentLiquid_in.setACK(false);//sysj\controller.sysj line: 119, column: 6
                                    S8087=1;
                                    active[8]=1;
                                    ends[8]=1;
                                    break RUN;
                                  }
                                  else {
                                    S8082=0;
                                    if(!percentLiquid_in.isREQ()){//sysj\controller.sysj line: 119, column: 6
                                      percentLiquid_in.setACK(true);//sysj\controller.sysj line: 119, column: 6
                                      S8082=1;
                                      if(percentLiquid_in.isREQ()){//sysj\controller.sysj line: 119, column: 6
                                        percentLiquid_in.setACK(false);//sysj\controller.sysj line: 119, column: 6
                                        ends[8]=2;
                                        ;//sysj\controller.sysj line: 119, column: 6
                                        recPercentLiq_thread_8 = (ArrayList)(percentLiquid_in.getVal() == null ? null : ((ArrayList)percentLiquid_in.getVal()));//sysj\controller.sysj line: 120, column: 6
                                        canisterNum_thread_8 = 1;//sysj\controller.sysj line: 121, column: 6
                                        S8080=2;
                                        if(canisterNum_thread_8 < 5){//sysj\controller.sysj line: 123, column: 12
                                          S8199=0;
                                          System.out.println("selecting canister " + canisterNum_thread_8);//sysj\controller.sysj line: 126, column: 8
                                          selectCanister.setPresent();//sysj\controller.sysj line: 127, column: 9
                                          currsigs.addElement(selectCanister);
                                          selectCanister.setValue(canisterNum_thread_8);//sysj\controller.sysj line: 127, column: 9
                                          active[8]=1;
                                          ends[8]=1;
                                          break RUN;
                                        }
                                        else {
                                          ends[8]=2;
                                          ;//sysj\controller.sysj line: 123, column: 6
                                          S8080=3;
                                          S9369=0;
                                          if(!fillerStatus_o.isPartnerPresent() || fillerStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 155, column: 6
                                            fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 155, column: 6
                                            S9369=1;
                                            active[8]=1;
                                            ends[8]=1;
                                            break RUN;
                                          }
                                          else {
                                            S9364=0;
                                            if(fillerStatus_o.isACK()){//sysj\controller.sysj line: 155, column: 6
                                              fillerStatus_o.setVal("done");//sysj\controller.sysj line: 155, column: 6
                                              S9364=1;
                                              if(!fillerStatus_o.isACK()){//sysj\controller.sysj line: 155, column: 6
                                                fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 155, column: 6
                                                ends[8]=2;
                                                ;//sysj\controller.sysj line: 155, column: 6
                                                S7988=2;
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
                            S7988=2;
                            active[8]=1;
                            ends[8]=1;
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
                    S8035=1;
                    if(bottleAtPos2.getprestatus()){//sysj\controller.sysj line: 116, column: 13
                      System.out.println("Filler - bottle is at pos 2");//sysj\controller.sysj line: 117, column: 6
                      S8080=0;
                      S8042=0;
                      if(!fillerStatus_o.isPartnerPresent() || fillerStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 118, column: 6
                        fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 118, column: 6
                        S8042=1;
                        active[8]=1;
                        ends[8]=1;
                        break RUN;
                      }
                      else {
                        S8037=0;
                        if(fillerStatus_o.isACK()){//sysj\controller.sysj line: 118, column: 6
                          fillerStatus_o.setVal("busy");//sysj\controller.sysj line: 118, column: 6
                          S8037=1;
                          if(!fillerStatus_o.isACK()){//sysj\controller.sysj line: 118, column: 6
                            fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 118, column: 6
                            ends[8]=2;
                            ;//sysj\controller.sysj line: 118, column: 6
                            S8080=1;
                            S8087=0;
                            if(!percentLiquid_in.isPartnerPresent() || percentLiquid_in.isPartnerPreempted()){//sysj\controller.sysj line: 119, column: 6
                              percentLiquid_in.setACK(false);//sysj\controller.sysj line: 119, column: 6
                              S8087=1;
                              active[8]=1;
                              ends[8]=1;
                              break RUN;
                            }
                            else {
                              S8082=0;
                              if(!percentLiquid_in.isREQ()){//sysj\controller.sysj line: 119, column: 6
                                percentLiquid_in.setACK(true);//sysj\controller.sysj line: 119, column: 6
                                S8082=1;
                                if(percentLiquid_in.isREQ()){//sysj\controller.sysj line: 119, column: 6
                                  percentLiquid_in.setACK(false);//sysj\controller.sysj line: 119, column: 6
                                  ends[8]=2;
                                  ;//sysj\controller.sysj line: 119, column: 6
                                  recPercentLiq_thread_8 = (ArrayList)(percentLiquid_in.getVal() == null ? null : ((ArrayList)percentLiquid_in.getVal()));//sysj\controller.sysj line: 120, column: 6
                                  canisterNum_thread_8 = 1;//sysj\controller.sysj line: 121, column: 6
                                  S8080=2;
                                  if(canisterNum_thread_8 < 5){//sysj\controller.sysj line: 123, column: 12
                                    S8199=0;
                                    System.out.println("selecting canister " + canisterNum_thread_8);//sysj\controller.sysj line: 126, column: 8
                                    selectCanister.setPresent();//sysj\controller.sysj line: 127, column: 9
                                    currsigs.addElement(selectCanister);
                                    selectCanister.setValue(canisterNum_thread_8);//sysj\controller.sysj line: 127, column: 9
                                    active[8]=1;
                                    ends[8]=1;
                                    break RUN;
                                  }
                                  else {
                                    ends[8]=2;
                                    ;//sysj\controller.sysj line: 123, column: 6
                                    S8080=3;
                                    S9369=0;
                                    if(!fillerStatus_o.isPartnerPresent() || fillerStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 155, column: 6
                                      fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 155, column: 6
                                      S9369=1;
                                      active[8]=1;
                                      ends[8]=1;
                                      break RUN;
                                    }
                                    else {
                                      S9364=0;
                                      if(fillerStatus_o.isACK()){//sysj\controller.sysj line: 155, column: 6
                                        fillerStatus_o.setVal("done");//sysj\controller.sysj line: 155, column: 6
                                        S9364=1;
                                        if(!fillerStatus_o.isACK()){//sysj\controller.sysj line: 155, column: 6
                                          fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 155, column: 6
                                          ends[8]=2;
                                          ;//sysj\controller.sysj line: 155, column: 6
                                          S7988=2;
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
                      S7988=2;
                      active[8]=1;
                      ends[8]=1;
                      break RUN;
                    }
                  }
                }
                else {
                  S15468=1;
                  S15452=0;
                  if(!fillerStatus_o.isPartnerPresent() || fillerStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 158, column: 4
                    fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 158, column: 4
                    S15452=1;
                    active[8]=1;
                    ends[8]=1;
                    break RUN;
                  }
                  else {
                    S15447=0;
                    if(fillerStatus_o.isACK()){//sysj\controller.sysj line: 158, column: 4
                      fillerStatus_o.setVal("idle");//sysj\controller.sysj line: 158, column: 4
                      S15447=1;
                      if(!fillerStatus_o.isACK()){//sysj\controller.sysj line: 158, column: 4
                        fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 158, column: 4
                        ends[8]=2;
                        ;//sysj\controller.sysj line: 158, column: 4
                        S7988=2;
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
          switch(S7988){
            case 0 : 
              switch(S7972){
                case 0 : 
                  if(!fillerReq_in.isPartnerPresent() || fillerReq_in.isPartnerPreempted()){//sysj\controller.sysj line: 105, column: 3
                    fillerReq_in.setACK(false);//sysj\controller.sysj line: 105, column: 3
                    S7972=1;
                    active[8]=1;
                    ends[8]=1;
                    break RUN;
                  }
                  else {
                    switch(S7967){
                      case 0 : 
                        if(!fillerReq_in.isREQ()){//sysj\controller.sysj line: 105, column: 3
                          fillerReq_in.setACK(true);//sysj\controller.sysj line: 105, column: 3
                          S7967=1;
                          if(fillerReq_in.isREQ()){//sysj\controller.sysj line: 105, column: 3
                            fillerReq_in.setACK(false);//sysj\controller.sysj line: 105, column: 3
                            ends[8]=2;
                            ;//sysj\controller.sysj line: 105, column: 3
                            request_thread_8 = (fillerReq_in.getVal() == null ? null : ((Boolean)fillerReq_in.getVal()));//sysj\controller.sysj line: 106, column: 3
                            S7988=1;
                            if(request_thread_8){//sysj\controller.sysj line: 108, column: 3
                              S15468=0;
                              System.out.println("Filler - received req from orch");//sysj\controller.sysj line: 110, column: 5
                              S8035=0;
                              if(!bottleAtPos2.getprestatus()){//sysj\controller.sysj line: 111, column: 13
                                S7995=0;
                                if(!fillerStatus_o.isPartnerPresent() || fillerStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 112, column: 6
                                  fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 112, column: 6
                                  S7995=1;
                                  active[8]=1;
                                  ends[8]=1;
                                  break RUN;
                                }
                                else {
                                  S7990=0;
                                  if(fillerStatus_o.isACK()){//sysj\controller.sysj line: 112, column: 6
                                    fillerStatus_o.setVal("idle");//sysj\controller.sysj line: 112, column: 6
                                    S7990=1;
                                    if(!fillerStatus_o.isACK()){//sysj\controller.sysj line: 112, column: 6
                                      fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 112, column: 6
                                      ends[8]=2;
                                      ;//sysj\controller.sysj line: 112, column: 6
                                      S8035=1;
                                      if(bottleAtPos2.getprestatus()){//sysj\controller.sysj line: 116, column: 13
                                        System.out.println("Filler - bottle is at pos 2");//sysj\controller.sysj line: 117, column: 6
                                        S8080=0;
                                        S8042=0;
                                        if(!fillerStatus_o.isPartnerPresent() || fillerStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 118, column: 6
                                          fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 118, column: 6
                                          S8042=1;
                                          active[8]=1;
                                          ends[8]=1;
                                          break RUN;
                                        }
                                        else {
                                          S8037=0;
                                          if(fillerStatus_o.isACK()){//sysj\controller.sysj line: 118, column: 6
                                            fillerStatus_o.setVal("busy");//sysj\controller.sysj line: 118, column: 6
                                            S8037=1;
                                            if(!fillerStatus_o.isACK()){//sysj\controller.sysj line: 118, column: 6
                                              fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 118, column: 6
                                              ends[8]=2;
                                              ;//sysj\controller.sysj line: 118, column: 6
                                              S8080=1;
                                              S8087=0;
                                              if(!percentLiquid_in.isPartnerPresent() || percentLiquid_in.isPartnerPreempted()){//sysj\controller.sysj line: 119, column: 6
                                                percentLiquid_in.setACK(false);//sysj\controller.sysj line: 119, column: 6
                                                S8087=1;
                                                active[8]=1;
                                                ends[8]=1;
                                                break RUN;
                                              }
                                              else {
                                                S8082=0;
                                                if(!percentLiquid_in.isREQ()){//sysj\controller.sysj line: 119, column: 6
                                                  percentLiquid_in.setACK(true);//sysj\controller.sysj line: 119, column: 6
                                                  S8082=1;
                                                  if(percentLiquid_in.isREQ()){//sysj\controller.sysj line: 119, column: 6
                                                    percentLiquid_in.setACK(false);//sysj\controller.sysj line: 119, column: 6
                                                    ends[8]=2;
                                                    ;//sysj\controller.sysj line: 119, column: 6
                                                    recPercentLiq_thread_8 = (ArrayList)(percentLiquid_in.getVal() == null ? null : ((ArrayList)percentLiquid_in.getVal()));//sysj\controller.sysj line: 120, column: 6
                                                    canisterNum_thread_8 = 1;//sysj\controller.sysj line: 121, column: 6
                                                    S8080=2;
                                                    if(canisterNum_thread_8 < 5){//sysj\controller.sysj line: 123, column: 12
                                                      S8199=0;
                                                      System.out.println("selecting canister " + canisterNum_thread_8);//sysj\controller.sysj line: 126, column: 8
                                                      selectCanister.setPresent();//sysj\controller.sysj line: 127, column: 9
                                                      currsigs.addElement(selectCanister);
                                                      selectCanister.setValue(canisterNum_thread_8);//sysj\controller.sysj line: 127, column: 9
                                                      active[8]=1;
                                                      ends[8]=1;
                                                      break RUN;
                                                    }
                                                    else {
                                                      ends[8]=2;
                                                      ;//sysj\controller.sysj line: 123, column: 6
                                                      S8080=3;
                                                      S9369=0;
                                                      if(!fillerStatus_o.isPartnerPresent() || fillerStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 155, column: 6
                                                        fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 155, column: 6
                                                        S9369=1;
                                                        active[8]=1;
                                                        ends[8]=1;
                                                        break RUN;
                                                      }
                                                      else {
                                                        S9364=0;
                                                        if(fillerStatus_o.isACK()){//sysj\controller.sysj line: 155, column: 6
                                                          fillerStatus_o.setVal("done");//sysj\controller.sysj line: 155, column: 6
                                                          S9364=1;
                                                          if(!fillerStatus_o.isACK()){//sysj\controller.sysj line: 155, column: 6
                                                            fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 155, column: 6
                                                            ends[8]=2;
                                                            ;//sysj\controller.sysj line: 155, column: 6
                                                            S7988=2;
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
                                        S7988=2;
                                        active[8]=1;
                                        ends[8]=1;
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
                                S8035=1;
                                if(bottleAtPos2.getprestatus()){//sysj\controller.sysj line: 116, column: 13
                                  System.out.println("Filler - bottle is at pos 2");//sysj\controller.sysj line: 117, column: 6
                                  S8080=0;
                                  S8042=0;
                                  if(!fillerStatus_o.isPartnerPresent() || fillerStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 118, column: 6
                                    fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 118, column: 6
                                    S8042=1;
                                    active[8]=1;
                                    ends[8]=1;
                                    break RUN;
                                  }
                                  else {
                                    S8037=0;
                                    if(fillerStatus_o.isACK()){//sysj\controller.sysj line: 118, column: 6
                                      fillerStatus_o.setVal("busy");//sysj\controller.sysj line: 118, column: 6
                                      S8037=1;
                                      if(!fillerStatus_o.isACK()){//sysj\controller.sysj line: 118, column: 6
                                        fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 118, column: 6
                                        ends[8]=2;
                                        ;//sysj\controller.sysj line: 118, column: 6
                                        S8080=1;
                                        S8087=0;
                                        if(!percentLiquid_in.isPartnerPresent() || percentLiquid_in.isPartnerPreempted()){//sysj\controller.sysj line: 119, column: 6
                                          percentLiquid_in.setACK(false);//sysj\controller.sysj line: 119, column: 6
                                          S8087=1;
                                          active[8]=1;
                                          ends[8]=1;
                                          break RUN;
                                        }
                                        else {
                                          S8082=0;
                                          if(!percentLiquid_in.isREQ()){//sysj\controller.sysj line: 119, column: 6
                                            percentLiquid_in.setACK(true);//sysj\controller.sysj line: 119, column: 6
                                            S8082=1;
                                            if(percentLiquid_in.isREQ()){//sysj\controller.sysj line: 119, column: 6
                                              percentLiquid_in.setACK(false);//sysj\controller.sysj line: 119, column: 6
                                              ends[8]=2;
                                              ;//sysj\controller.sysj line: 119, column: 6
                                              recPercentLiq_thread_8 = (ArrayList)(percentLiquid_in.getVal() == null ? null : ((ArrayList)percentLiquid_in.getVal()));//sysj\controller.sysj line: 120, column: 6
                                              canisterNum_thread_8 = 1;//sysj\controller.sysj line: 121, column: 6
                                              S8080=2;
                                              if(canisterNum_thread_8 < 5){//sysj\controller.sysj line: 123, column: 12
                                                S8199=0;
                                                System.out.println("selecting canister " + canisterNum_thread_8);//sysj\controller.sysj line: 126, column: 8
                                                selectCanister.setPresent();//sysj\controller.sysj line: 127, column: 9
                                                currsigs.addElement(selectCanister);
                                                selectCanister.setValue(canisterNum_thread_8);//sysj\controller.sysj line: 127, column: 9
                                                active[8]=1;
                                                ends[8]=1;
                                                break RUN;
                                              }
                                              else {
                                                ends[8]=2;
                                                ;//sysj\controller.sysj line: 123, column: 6
                                                S8080=3;
                                                S9369=0;
                                                if(!fillerStatus_o.isPartnerPresent() || fillerStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 155, column: 6
                                                  fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 155, column: 6
                                                  S9369=1;
                                                  active[8]=1;
                                                  ends[8]=1;
                                                  break RUN;
                                                }
                                                else {
                                                  S9364=0;
                                                  if(fillerStatus_o.isACK()){//sysj\controller.sysj line: 155, column: 6
                                                    fillerStatus_o.setVal("done");//sysj\controller.sysj line: 155, column: 6
                                                    S9364=1;
                                                    if(!fillerStatus_o.isACK()){//sysj\controller.sysj line: 155, column: 6
                                                      fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 155, column: 6
                                                      ends[8]=2;
                                                      ;//sysj\controller.sysj line: 155, column: 6
                                                      S7988=2;
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
                                  S7988=2;
                                  active[8]=1;
                                  ends[8]=1;
                                  break RUN;
                                }
                              }
                            }
                            else {
                              S15468=1;
                              S15452=0;
                              if(!fillerStatus_o.isPartnerPresent() || fillerStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 158, column: 4
                                fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 158, column: 4
                                S15452=1;
                                active[8]=1;
                                ends[8]=1;
                                break RUN;
                              }
                              else {
                                S15447=0;
                                if(fillerStatus_o.isACK()){//sysj\controller.sysj line: 158, column: 4
                                  fillerStatus_o.setVal("idle");//sysj\controller.sysj line: 158, column: 4
                                  S15447=1;
                                  if(!fillerStatus_o.isACK()){//sysj\controller.sysj line: 158, column: 4
                                    fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 158, column: 4
                                    ends[8]=2;
                                    ;//sysj\controller.sysj line: 158, column: 4
                                    S7988=2;
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
                        if(fillerReq_in.isREQ()){//sysj\controller.sysj line: 105, column: 3
                          fillerReq_in.setACK(false);//sysj\controller.sysj line: 105, column: 3
                          ends[8]=2;
                          ;//sysj\controller.sysj line: 105, column: 3
                          request_thread_8 = (fillerReq_in.getVal() == null ? null : ((Boolean)fillerReq_in.getVal()));//sysj\controller.sysj line: 106, column: 3
                          S7988=1;
                          if(request_thread_8){//sysj\controller.sysj line: 108, column: 3
                            S15468=0;
                            System.out.println("Filler - received req from orch");//sysj\controller.sysj line: 110, column: 5
                            S8035=0;
                            if(!bottleAtPos2.getprestatus()){//sysj\controller.sysj line: 111, column: 13
                              S7995=0;
                              if(!fillerStatus_o.isPartnerPresent() || fillerStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 112, column: 6
                                fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 112, column: 6
                                S7995=1;
                                active[8]=1;
                                ends[8]=1;
                                break RUN;
                              }
                              else {
                                S7990=0;
                                if(fillerStatus_o.isACK()){//sysj\controller.sysj line: 112, column: 6
                                  fillerStatus_o.setVal("idle");//sysj\controller.sysj line: 112, column: 6
                                  S7990=1;
                                  if(!fillerStatus_o.isACK()){//sysj\controller.sysj line: 112, column: 6
                                    fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 112, column: 6
                                    ends[8]=2;
                                    ;//sysj\controller.sysj line: 112, column: 6
                                    S8035=1;
                                    if(bottleAtPos2.getprestatus()){//sysj\controller.sysj line: 116, column: 13
                                      System.out.println("Filler - bottle is at pos 2");//sysj\controller.sysj line: 117, column: 6
                                      S8080=0;
                                      S8042=0;
                                      if(!fillerStatus_o.isPartnerPresent() || fillerStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 118, column: 6
                                        fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 118, column: 6
                                        S8042=1;
                                        active[8]=1;
                                        ends[8]=1;
                                        break RUN;
                                      }
                                      else {
                                        S8037=0;
                                        if(fillerStatus_o.isACK()){//sysj\controller.sysj line: 118, column: 6
                                          fillerStatus_o.setVal("busy");//sysj\controller.sysj line: 118, column: 6
                                          S8037=1;
                                          if(!fillerStatus_o.isACK()){//sysj\controller.sysj line: 118, column: 6
                                            fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 118, column: 6
                                            ends[8]=2;
                                            ;//sysj\controller.sysj line: 118, column: 6
                                            S8080=1;
                                            S8087=0;
                                            if(!percentLiquid_in.isPartnerPresent() || percentLiquid_in.isPartnerPreempted()){//sysj\controller.sysj line: 119, column: 6
                                              percentLiquid_in.setACK(false);//sysj\controller.sysj line: 119, column: 6
                                              S8087=1;
                                              active[8]=1;
                                              ends[8]=1;
                                              break RUN;
                                            }
                                            else {
                                              S8082=0;
                                              if(!percentLiquid_in.isREQ()){//sysj\controller.sysj line: 119, column: 6
                                                percentLiquid_in.setACK(true);//sysj\controller.sysj line: 119, column: 6
                                                S8082=1;
                                                if(percentLiquid_in.isREQ()){//sysj\controller.sysj line: 119, column: 6
                                                  percentLiquid_in.setACK(false);//sysj\controller.sysj line: 119, column: 6
                                                  ends[8]=2;
                                                  ;//sysj\controller.sysj line: 119, column: 6
                                                  recPercentLiq_thread_8 = (ArrayList)(percentLiquid_in.getVal() == null ? null : ((ArrayList)percentLiquid_in.getVal()));//sysj\controller.sysj line: 120, column: 6
                                                  canisterNum_thread_8 = 1;//sysj\controller.sysj line: 121, column: 6
                                                  S8080=2;
                                                  if(canisterNum_thread_8 < 5){//sysj\controller.sysj line: 123, column: 12
                                                    S8199=0;
                                                    System.out.println("selecting canister " + canisterNum_thread_8);//sysj\controller.sysj line: 126, column: 8
                                                    selectCanister.setPresent();//sysj\controller.sysj line: 127, column: 9
                                                    currsigs.addElement(selectCanister);
                                                    selectCanister.setValue(canisterNum_thread_8);//sysj\controller.sysj line: 127, column: 9
                                                    active[8]=1;
                                                    ends[8]=1;
                                                    break RUN;
                                                  }
                                                  else {
                                                    ends[8]=2;
                                                    ;//sysj\controller.sysj line: 123, column: 6
                                                    S8080=3;
                                                    S9369=0;
                                                    if(!fillerStatus_o.isPartnerPresent() || fillerStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 155, column: 6
                                                      fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 155, column: 6
                                                      S9369=1;
                                                      active[8]=1;
                                                      ends[8]=1;
                                                      break RUN;
                                                    }
                                                    else {
                                                      S9364=0;
                                                      if(fillerStatus_o.isACK()){//sysj\controller.sysj line: 155, column: 6
                                                        fillerStatus_o.setVal("done");//sysj\controller.sysj line: 155, column: 6
                                                        S9364=1;
                                                        if(!fillerStatus_o.isACK()){//sysj\controller.sysj line: 155, column: 6
                                                          fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 155, column: 6
                                                          ends[8]=2;
                                                          ;//sysj\controller.sysj line: 155, column: 6
                                                          S7988=2;
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
                                      S7988=2;
                                      active[8]=1;
                                      ends[8]=1;
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
                              S8035=1;
                              if(bottleAtPos2.getprestatus()){//sysj\controller.sysj line: 116, column: 13
                                System.out.println("Filler - bottle is at pos 2");//sysj\controller.sysj line: 117, column: 6
                                S8080=0;
                                S8042=0;
                                if(!fillerStatus_o.isPartnerPresent() || fillerStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 118, column: 6
                                  fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 118, column: 6
                                  S8042=1;
                                  active[8]=1;
                                  ends[8]=1;
                                  break RUN;
                                }
                                else {
                                  S8037=0;
                                  if(fillerStatus_o.isACK()){//sysj\controller.sysj line: 118, column: 6
                                    fillerStatus_o.setVal("busy");//sysj\controller.sysj line: 118, column: 6
                                    S8037=1;
                                    if(!fillerStatus_o.isACK()){//sysj\controller.sysj line: 118, column: 6
                                      fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 118, column: 6
                                      ends[8]=2;
                                      ;//sysj\controller.sysj line: 118, column: 6
                                      S8080=1;
                                      S8087=0;
                                      if(!percentLiquid_in.isPartnerPresent() || percentLiquid_in.isPartnerPreempted()){//sysj\controller.sysj line: 119, column: 6
                                        percentLiquid_in.setACK(false);//sysj\controller.sysj line: 119, column: 6
                                        S8087=1;
                                        active[8]=1;
                                        ends[8]=1;
                                        break RUN;
                                      }
                                      else {
                                        S8082=0;
                                        if(!percentLiquid_in.isREQ()){//sysj\controller.sysj line: 119, column: 6
                                          percentLiquid_in.setACK(true);//sysj\controller.sysj line: 119, column: 6
                                          S8082=1;
                                          if(percentLiquid_in.isREQ()){//sysj\controller.sysj line: 119, column: 6
                                            percentLiquid_in.setACK(false);//sysj\controller.sysj line: 119, column: 6
                                            ends[8]=2;
                                            ;//sysj\controller.sysj line: 119, column: 6
                                            recPercentLiq_thread_8 = (ArrayList)(percentLiquid_in.getVal() == null ? null : ((ArrayList)percentLiquid_in.getVal()));//sysj\controller.sysj line: 120, column: 6
                                            canisterNum_thread_8 = 1;//sysj\controller.sysj line: 121, column: 6
                                            S8080=2;
                                            if(canisterNum_thread_8 < 5){//sysj\controller.sysj line: 123, column: 12
                                              S8199=0;
                                              System.out.println("selecting canister " + canisterNum_thread_8);//sysj\controller.sysj line: 126, column: 8
                                              selectCanister.setPresent();//sysj\controller.sysj line: 127, column: 9
                                              currsigs.addElement(selectCanister);
                                              selectCanister.setValue(canisterNum_thread_8);//sysj\controller.sysj line: 127, column: 9
                                              active[8]=1;
                                              ends[8]=1;
                                              break RUN;
                                            }
                                            else {
                                              ends[8]=2;
                                              ;//sysj\controller.sysj line: 123, column: 6
                                              S8080=3;
                                              S9369=0;
                                              if(!fillerStatus_o.isPartnerPresent() || fillerStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 155, column: 6
                                                fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 155, column: 6
                                                S9369=1;
                                                active[8]=1;
                                                ends[8]=1;
                                                break RUN;
                                              }
                                              else {
                                                S9364=0;
                                                if(fillerStatus_o.isACK()){//sysj\controller.sysj line: 155, column: 6
                                                  fillerStatus_o.setVal("done");//sysj\controller.sysj line: 155, column: 6
                                                  S9364=1;
                                                  if(!fillerStatus_o.isACK()){//sysj\controller.sysj line: 155, column: 6
                                                    fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 155, column: 6
                                                    ends[8]=2;
                                                    ;//sysj\controller.sysj line: 155, column: 6
                                                    S7988=2;
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
                                S7988=2;
                                active[8]=1;
                                ends[8]=1;
                                break RUN;
                              }
                            }
                          }
                          else {
                            S15468=1;
                            S15452=0;
                            if(!fillerStatus_o.isPartnerPresent() || fillerStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 158, column: 4
                              fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 158, column: 4
                              S15452=1;
                              active[8]=1;
                              ends[8]=1;
                              break RUN;
                            }
                            else {
                              S15447=0;
                              if(fillerStatus_o.isACK()){//sysj\controller.sysj line: 158, column: 4
                                fillerStatus_o.setVal("idle");//sysj\controller.sysj line: 158, column: 4
                                S15447=1;
                                if(!fillerStatus_o.isACK()){//sysj\controller.sysj line: 158, column: 4
                                  fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 158, column: 4
                                  ends[8]=2;
                                  ;//sysj\controller.sysj line: 158, column: 4
                                  S7988=2;
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
                  S7972=1;
                  S7972=0;
                  if(!fillerReq_in.isPartnerPresent() || fillerReq_in.isPartnerPreempted()){//sysj\controller.sysj line: 105, column: 3
                    fillerReq_in.setACK(false);//sysj\controller.sysj line: 105, column: 3
                    S7972=1;
                    active[8]=1;
                    ends[8]=1;
                    break RUN;
                  }
                  else {
                    S7967=0;
                    if(!fillerReq_in.isREQ()){//sysj\controller.sysj line: 105, column: 3
                      fillerReq_in.setACK(true);//sysj\controller.sysj line: 105, column: 3
                      S7967=1;
                      if(fillerReq_in.isREQ()){//sysj\controller.sysj line: 105, column: 3
                        fillerReq_in.setACK(false);//sysj\controller.sysj line: 105, column: 3
                        ends[8]=2;
                        ;//sysj\controller.sysj line: 105, column: 3
                        request_thread_8 = (fillerReq_in.getVal() == null ? null : ((Boolean)fillerReq_in.getVal()));//sysj\controller.sysj line: 106, column: 3
                        S7988=1;
                        if(request_thread_8){//sysj\controller.sysj line: 108, column: 3
                          S15468=0;
                          System.out.println("Filler - received req from orch");//sysj\controller.sysj line: 110, column: 5
                          S8035=0;
                          if(!bottleAtPos2.getprestatus()){//sysj\controller.sysj line: 111, column: 13
                            S7995=0;
                            if(!fillerStatus_o.isPartnerPresent() || fillerStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 112, column: 6
                              fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 112, column: 6
                              S7995=1;
                              active[8]=1;
                              ends[8]=1;
                              break RUN;
                            }
                            else {
                              S7990=0;
                              if(fillerStatus_o.isACK()){//sysj\controller.sysj line: 112, column: 6
                                fillerStatus_o.setVal("idle");//sysj\controller.sysj line: 112, column: 6
                                S7990=1;
                                if(!fillerStatus_o.isACK()){//sysj\controller.sysj line: 112, column: 6
                                  fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 112, column: 6
                                  ends[8]=2;
                                  ;//sysj\controller.sysj line: 112, column: 6
                                  S8035=1;
                                  if(bottleAtPos2.getprestatus()){//sysj\controller.sysj line: 116, column: 13
                                    System.out.println("Filler - bottle is at pos 2");//sysj\controller.sysj line: 117, column: 6
                                    S8080=0;
                                    S8042=0;
                                    if(!fillerStatus_o.isPartnerPresent() || fillerStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 118, column: 6
                                      fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 118, column: 6
                                      S8042=1;
                                      active[8]=1;
                                      ends[8]=1;
                                      break RUN;
                                    }
                                    else {
                                      S8037=0;
                                      if(fillerStatus_o.isACK()){//sysj\controller.sysj line: 118, column: 6
                                        fillerStatus_o.setVal("busy");//sysj\controller.sysj line: 118, column: 6
                                        S8037=1;
                                        if(!fillerStatus_o.isACK()){//sysj\controller.sysj line: 118, column: 6
                                          fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 118, column: 6
                                          ends[8]=2;
                                          ;//sysj\controller.sysj line: 118, column: 6
                                          S8080=1;
                                          S8087=0;
                                          if(!percentLiquid_in.isPartnerPresent() || percentLiquid_in.isPartnerPreempted()){//sysj\controller.sysj line: 119, column: 6
                                            percentLiquid_in.setACK(false);//sysj\controller.sysj line: 119, column: 6
                                            S8087=1;
                                            active[8]=1;
                                            ends[8]=1;
                                            break RUN;
                                          }
                                          else {
                                            S8082=0;
                                            if(!percentLiquid_in.isREQ()){//sysj\controller.sysj line: 119, column: 6
                                              percentLiquid_in.setACK(true);//sysj\controller.sysj line: 119, column: 6
                                              S8082=1;
                                              if(percentLiquid_in.isREQ()){//sysj\controller.sysj line: 119, column: 6
                                                percentLiquid_in.setACK(false);//sysj\controller.sysj line: 119, column: 6
                                                ends[8]=2;
                                                ;//sysj\controller.sysj line: 119, column: 6
                                                recPercentLiq_thread_8 = (ArrayList)(percentLiquid_in.getVal() == null ? null : ((ArrayList)percentLiquid_in.getVal()));//sysj\controller.sysj line: 120, column: 6
                                                canisterNum_thread_8 = 1;//sysj\controller.sysj line: 121, column: 6
                                                S8080=2;
                                                if(canisterNum_thread_8 < 5){//sysj\controller.sysj line: 123, column: 12
                                                  S8199=0;
                                                  System.out.println("selecting canister " + canisterNum_thread_8);//sysj\controller.sysj line: 126, column: 8
                                                  selectCanister.setPresent();//sysj\controller.sysj line: 127, column: 9
                                                  currsigs.addElement(selectCanister);
                                                  selectCanister.setValue(canisterNum_thread_8);//sysj\controller.sysj line: 127, column: 9
                                                  active[8]=1;
                                                  ends[8]=1;
                                                  break RUN;
                                                }
                                                else {
                                                  ends[8]=2;
                                                  ;//sysj\controller.sysj line: 123, column: 6
                                                  S8080=3;
                                                  S9369=0;
                                                  if(!fillerStatus_o.isPartnerPresent() || fillerStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 155, column: 6
                                                    fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 155, column: 6
                                                    S9369=1;
                                                    active[8]=1;
                                                    ends[8]=1;
                                                    break RUN;
                                                  }
                                                  else {
                                                    S9364=0;
                                                    if(fillerStatus_o.isACK()){//sysj\controller.sysj line: 155, column: 6
                                                      fillerStatus_o.setVal("done");//sysj\controller.sysj line: 155, column: 6
                                                      S9364=1;
                                                      if(!fillerStatus_o.isACK()){//sysj\controller.sysj line: 155, column: 6
                                                        fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 155, column: 6
                                                        ends[8]=2;
                                                        ;//sysj\controller.sysj line: 155, column: 6
                                                        S7988=2;
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
                                    S7988=2;
                                    active[8]=1;
                                    ends[8]=1;
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
                            S8035=1;
                            if(bottleAtPos2.getprestatus()){//sysj\controller.sysj line: 116, column: 13
                              System.out.println("Filler - bottle is at pos 2");//sysj\controller.sysj line: 117, column: 6
                              S8080=0;
                              S8042=0;
                              if(!fillerStatus_o.isPartnerPresent() || fillerStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 118, column: 6
                                fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 118, column: 6
                                S8042=1;
                                active[8]=1;
                                ends[8]=1;
                                break RUN;
                              }
                              else {
                                S8037=0;
                                if(fillerStatus_o.isACK()){//sysj\controller.sysj line: 118, column: 6
                                  fillerStatus_o.setVal("busy");//sysj\controller.sysj line: 118, column: 6
                                  S8037=1;
                                  if(!fillerStatus_o.isACK()){//sysj\controller.sysj line: 118, column: 6
                                    fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 118, column: 6
                                    ends[8]=2;
                                    ;//sysj\controller.sysj line: 118, column: 6
                                    S8080=1;
                                    S8087=0;
                                    if(!percentLiquid_in.isPartnerPresent() || percentLiquid_in.isPartnerPreempted()){//sysj\controller.sysj line: 119, column: 6
                                      percentLiquid_in.setACK(false);//sysj\controller.sysj line: 119, column: 6
                                      S8087=1;
                                      active[8]=1;
                                      ends[8]=1;
                                      break RUN;
                                    }
                                    else {
                                      S8082=0;
                                      if(!percentLiquid_in.isREQ()){//sysj\controller.sysj line: 119, column: 6
                                        percentLiquid_in.setACK(true);//sysj\controller.sysj line: 119, column: 6
                                        S8082=1;
                                        if(percentLiquid_in.isREQ()){//sysj\controller.sysj line: 119, column: 6
                                          percentLiquid_in.setACK(false);//sysj\controller.sysj line: 119, column: 6
                                          ends[8]=2;
                                          ;//sysj\controller.sysj line: 119, column: 6
                                          recPercentLiq_thread_8 = (ArrayList)(percentLiquid_in.getVal() == null ? null : ((ArrayList)percentLiquid_in.getVal()));//sysj\controller.sysj line: 120, column: 6
                                          canisterNum_thread_8 = 1;//sysj\controller.sysj line: 121, column: 6
                                          S8080=2;
                                          if(canisterNum_thread_8 < 5){//sysj\controller.sysj line: 123, column: 12
                                            S8199=0;
                                            System.out.println("selecting canister " + canisterNum_thread_8);//sysj\controller.sysj line: 126, column: 8
                                            selectCanister.setPresent();//sysj\controller.sysj line: 127, column: 9
                                            currsigs.addElement(selectCanister);
                                            selectCanister.setValue(canisterNum_thread_8);//sysj\controller.sysj line: 127, column: 9
                                            active[8]=1;
                                            ends[8]=1;
                                            break RUN;
                                          }
                                          else {
                                            ends[8]=2;
                                            ;//sysj\controller.sysj line: 123, column: 6
                                            S8080=3;
                                            S9369=0;
                                            if(!fillerStatus_o.isPartnerPresent() || fillerStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 155, column: 6
                                              fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 155, column: 6
                                              S9369=1;
                                              active[8]=1;
                                              ends[8]=1;
                                              break RUN;
                                            }
                                            else {
                                              S9364=0;
                                              if(fillerStatus_o.isACK()){//sysj\controller.sysj line: 155, column: 6
                                                fillerStatus_o.setVal("done");//sysj\controller.sysj line: 155, column: 6
                                                S9364=1;
                                                if(!fillerStatus_o.isACK()){//sysj\controller.sysj line: 155, column: 6
                                                  fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 155, column: 6
                                                  ends[8]=2;
                                                  ;//sysj\controller.sysj line: 155, column: 6
                                                  S7988=2;
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
                              S7988=2;
                              active[8]=1;
                              ends[8]=1;
                              break RUN;
                            }
                          }
                        }
                        else {
                          S15468=1;
                          S15452=0;
                          if(!fillerStatus_o.isPartnerPresent() || fillerStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 158, column: 4
                            fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 158, column: 4
                            S15452=1;
                            active[8]=1;
                            ends[8]=1;
                            break RUN;
                          }
                          else {
                            S15447=0;
                            if(fillerStatus_o.isACK()){//sysj\controller.sysj line: 158, column: 4
                              fillerStatus_o.setVal("idle");//sysj\controller.sysj line: 158, column: 4
                              S15447=1;
                              if(!fillerStatus_o.isACK()){//sysj\controller.sysj line: 158, column: 4
                                fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 158, column: 4
                                ends[8]=2;
                                ;//sysj\controller.sysj line: 158, column: 4
                                S7988=2;
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
              switch(S15468){
                case 0 : 
                  switch(S8035){
                    case 0 : 
                      switch(S7995){
                        case 0 : 
                          if(!fillerStatus_o.isPartnerPresent() || fillerStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 112, column: 6
                            fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 112, column: 6
                            S7995=1;
                            active[8]=1;
                            ends[8]=1;
                            break RUN;
                          }
                          else {
                            switch(S7990){
                              case 0 : 
                                if(fillerStatus_o.isACK()){//sysj\controller.sysj line: 112, column: 6
                                  fillerStatus_o.setVal("idle");//sysj\controller.sysj line: 112, column: 6
                                  S7990=1;
                                  if(!fillerStatus_o.isACK()){//sysj\controller.sysj line: 112, column: 6
                                    fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 112, column: 6
                                    ends[8]=2;
                                    ;//sysj\controller.sysj line: 112, column: 6
                                    S8035=1;
                                    if(bottleAtPos2.getprestatus()){//sysj\controller.sysj line: 116, column: 13
                                      System.out.println("Filler - bottle is at pos 2");//sysj\controller.sysj line: 117, column: 6
                                      S8080=0;
                                      S8042=0;
                                      if(!fillerStatus_o.isPartnerPresent() || fillerStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 118, column: 6
                                        fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 118, column: 6
                                        S8042=1;
                                        active[8]=1;
                                        ends[8]=1;
                                        break RUN;
                                      }
                                      else {
                                        S8037=0;
                                        if(fillerStatus_o.isACK()){//sysj\controller.sysj line: 118, column: 6
                                          fillerStatus_o.setVal("busy");//sysj\controller.sysj line: 118, column: 6
                                          S8037=1;
                                          if(!fillerStatus_o.isACK()){//sysj\controller.sysj line: 118, column: 6
                                            fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 118, column: 6
                                            ends[8]=2;
                                            ;//sysj\controller.sysj line: 118, column: 6
                                            S8080=1;
                                            S8087=0;
                                            if(!percentLiquid_in.isPartnerPresent() || percentLiquid_in.isPartnerPreempted()){//sysj\controller.sysj line: 119, column: 6
                                              percentLiquid_in.setACK(false);//sysj\controller.sysj line: 119, column: 6
                                              S8087=1;
                                              active[8]=1;
                                              ends[8]=1;
                                              break RUN;
                                            }
                                            else {
                                              S8082=0;
                                              if(!percentLiquid_in.isREQ()){//sysj\controller.sysj line: 119, column: 6
                                                percentLiquid_in.setACK(true);//sysj\controller.sysj line: 119, column: 6
                                                S8082=1;
                                                if(percentLiquid_in.isREQ()){//sysj\controller.sysj line: 119, column: 6
                                                  percentLiquid_in.setACK(false);//sysj\controller.sysj line: 119, column: 6
                                                  ends[8]=2;
                                                  ;//sysj\controller.sysj line: 119, column: 6
                                                  recPercentLiq_thread_8 = (ArrayList)(percentLiquid_in.getVal() == null ? null : ((ArrayList)percentLiquid_in.getVal()));//sysj\controller.sysj line: 120, column: 6
                                                  canisterNum_thread_8 = 1;//sysj\controller.sysj line: 121, column: 6
                                                  S8080=2;
                                                  if(canisterNum_thread_8 < 5){//sysj\controller.sysj line: 123, column: 12
                                                    S8199=0;
                                                    System.out.println("selecting canister " + canisterNum_thread_8);//sysj\controller.sysj line: 126, column: 8
                                                    selectCanister.setPresent();//sysj\controller.sysj line: 127, column: 9
                                                    currsigs.addElement(selectCanister);
                                                    selectCanister.setValue(canisterNum_thread_8);//sysj\controller.sysj line: 127, column: 9
                                                    active[8]=1;
                                                    ends[8]=1;
                                                    break RUN;
                                                  }
                                                  else {
                                                    ends[8]=2;
                                                    ;//sysj\controller.sysj line: 123, column: 6
                                                    S8080=3;
                                                    S9369=0;
                                                    if(!fillerStatus_o.isPartnerPresent() || fillerStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 155, column: 6
                                                      fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 155, column: 6
                                                      S9369=1;
                                                      active[8]=1;
                                                      ends[8]=1;
                                                      break RUN;
                                                    }
                                                    else {
                                                      S9364=0;
                                                      if(fillerStatus_o.isACK()){//sysj\controller.sysj line: 155, column: 6
                                                        fillerStatus_o.setVal("done");//sysj\controller.sysj line: 155, column: 6
                                                        S9364=1;
                                                        if(!fillerStatus_o.isACK()){//sysj\controller.sysj line: 155, column: 6
                                                          fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 155, column: 6
                                                          ends[8]=2;
                                                          ;//sysj\controller.sysj line: 155, column: 6
                                                          S7988=2;
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
                                      S7988=2;
                                      active[8]=1;
                                      ends[8]=1;
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
                                  S8035=1;
                                  if(bottleAtPos2.getprestatus()){//sysj\controller.sysj line: 116, column: 13
                                    System.out.println("Filler - bottle is at pos 2");//sysj\controller.sysj line: 117, column: 6
                                    S8080=0;
                                    S8042=0;
                                    if(!fillerStatus_o.isPartnerPresent() || fillerStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 118, column: 6
                                      fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 118, column: 6
                                      S8042=1;
                                      active[8]=1;
                                      ends[8]=1;
                                      break RUN;
                                    }
                                    else {
                                      S8037=0;
                                      if(fillerStatus_o.isACK()){//sysj\controller.sysj line: 118, column: 6
                                        fillerStatus_o.setVal("busy");//sysj\controller.sysj line: 118, column: 6
                                        S8037=1;
                                        if(!fillerStatus_o.isACK()){//sysj\controller.sysj line: 118, column: 6
                                          fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 118, column: 6
                                          ends[8]=2;
                                          ;//sysj\controller.sysj line: 118, column: 6
                                          S8080=1;
                                          S8087=0;
                                          if(!percentLiquid_in.isPartnerPresent() || percentLiquid_in.isPartnerPreempted()){//sysj\controller.sysj line: 119, column: 6
                                            percentLiquid_in.setACK(false);//sysj\controller.sysj line: 119, column: 6
                                            S8087=1;
                                            active[8]=1;
                                            ends[8]=1;
                                            break RUN;
                                          }
                                          else {
                                            S8082=0;
                                            if(!percentLiquid_in.isREQ()){//sysj\controller.sysj line: 119, column: 6
                                              percentLiquid_in.setACK(true);//sysj\controller.sysj line: 119, column: 6
                                              S8082=1;
                                              if(percentLiquid_in.isREQ()){//sysj\controller.sysj line: 119, column: 6
                                                percentLiquid_in.setACK(false);//sysj\controller.sysj line: 119, column: 6
                                                ends[8]=2;
                                                ;//sysj\controller.sysj line: 119, column: 6
                                                recPercentLiq_thread_8 = (ArrayList)(percentLiquid_in.getVal() == null ? null : ((ArrayList)percentLiquid_in.getVal()));//sysj\controller.sysj line: 120, column: 6
                                                canisterNum_thread_8 = 1;//sysj\controller.sysj line: 121, column: 6
                                                S8080=2;
                                                if(canisterNum_thread_8 < 5){//sysj\controller.sysj line: 123, column: 12
                                                  S8199=0;
                                                  System.out.println("selecting canister " + canisterNum_thread_8);//sysj\controller.sysj line: 126, column: 8
                                                  selectCanister.setPresent();//sysj\controller.sysj line: 127, column: 9
                                                  currsigs.addElement(selectCanister);
                                                  selectCanister.setValue(canisterNum_thread_8);//sysj\controller.sysj line: 127, column: 9
                                                  active[8]=1;
                                                  ends[8]=1;
                                                  break RUN;
                                                }
                                                else {
                                                  ends[8]=2;
                                                  ;//sysj\controller.sysj line: 123, column: 6
                                                  S8080=3;
                                                  S9369=0;
                                                  if(!fillerStatus_o.isPartnerPresent() || fillerStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 155, column: 6
                                                    fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 155, column: 6
                                                    S9369=1;
                                                    active[8]=1;
                                                    ends[8]=1;
                                                    break RUN;
                                                  }
                                                  else {
                                                    S9364=0;
                                                    if(fillerStatus_o.isACK()){//sysj\controller.sysj line: 155, column: 6
                                                      fillerStatus_o.setVal("done");//sysj\controller.sysj line: 155, column: 6
                                                      S9364=1;
                                                      if(!fillerStatus_o.isACK()){//sysj\controller.sysj line: 155, column: 6
                                                        fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 155, column: 6
                                                        ends[8]=2;
                                                        ;//sysj\controller.sysj line: 155, column: 6
                                                        S7988=2;
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
                                    S7988=2;
                                    active[8]=1;
                                    ends[8]=1;
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
                          S7995=1;
                          S7995=0;
                          if(!fillerStatus_o.isPartnerPresent() || fillerStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 112, column: 6
                            fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 112, column: 6
                            S7995=1;
                            active[8]=1;
                            ends[8]=1;
                            break RUN;
                          }
                          else {
                            S7990=0;
                            if(fillerStatus_o.isACK()){//sysj\controller.sysj line: 112, column: 6
                              fillerStatus_o.setVal("idle");//sysj\controller.sysj line: 112, column: 6
                              S7990=1;
                              if(!fillerStatus_o.isACK()){//sysj\controller.sysj line: 112, column: 6
                                fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 112, column: 6
                                ends[8]=2;
                                ;//sysj\controller.sysj line: 112, column: 6
                                S8035=1;
                                if(bottleAtPos2.getprestatus()){//sysj\controller.sysj line: 116, column: 13
                                  System.out.println("Filler - bottle is at pos 2");//sysj\controller.sysj line: 117, column: 6
                                  S8080=0;
                                  S8042=0;
                                  if(!fillerStatus_o.isPartnerPresent() || fillerStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 118, column: 6
                                    fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 118, column: 6
                                    S8042=1;
                                    active[8]=1;
                                    ends[8]=1;
                                    break RUN;
                                  }
                                  else {
                                    S8037=0;
                                    if(fillerStatus_o.isACK()){//sysj\controller.sysj line: 118, column: 6
                                      fillerStatus_o.setVal("busy");//sysj\controller.sysj line: 118, column: 6
                                      S8037=1;
                                      if(!fillerStatus_o.isACK()){//sysj\controller.sysj line: 118, column: 6
                                        fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 118, column: 6
                                        ends[8]=2;
                                        ;//sysj\controller.sysj line: 118, column: 6
                                        S8080=1;
                                        S8087=0;
                                        if(!percentLiquid_in.isPartnerPresent() || percentLiquid_in.isPartnerPreempted()){//sysj\controller.sysj line: 119, column: 6
                                          percentLiquid_in.setACK(false);//sysj\controller.sysj line: 119, column: 6
                                          S8087=1;
                                          active[8]=1;
                                          ends[8]=1;
                                          break RUN;
                                        }
                                        else {
                                          S8082=0;
                                          if(!percentLiquid_in.isREQ()){//sysj\controller.sysj line: 119, column: 6
                                            percentLiquid_in.setACK(true);//sysj\controller.sysj line: 119, column: 6
                                            S8082=1;
                                            if(percentLiquid_in.isREQ()){//sysj\controller.sysj line: 119, column: 6
                                              percentLiquid_in.setACK(false);//sysj\controller.sysj line: 119, column: 6
                                              ends[8]=2;
                                              ;//sysj\controller.sysj line: 119, column: 6
                                              recPercentLiq_thread_8 = (ArrayList)(percentLiquid_in.getVal() == null ? null : ((ArrayList)percentLiquid_in.getVal()));//sysj\controller.sysj line: 120, column: 6
                                              canisterNum_thread_8 = 1;//sysj\controller.sysj line: 121, column: 6
                                              S8080=2;
                                              if(canisterNum_thread_8 < 5){//sysj\controller.sysj line: 123, column: 12
                                                S8199=0;
                                                System.out.println("selecting canister " + canisterNum_thread_8);//sysj\controller.sysj line: 126, column: 8
                                                selectCanister.setPresent();//sysj\controller.sysj line: 127, column: 9
                                                currsigs.addElement(selectCanister);
                                                selectCanister.setValue(canisterNum_thread_8);//sysj\controller.sysj line: 127, column: 9
                                                active[8]=1;
                                                ends[8]=1;
                                                break RUN;
                                              }
                                              else {
                                                ends[8]=2;
                                                ;//sysj\controller.sysj line: 123, column: 6
                                                S8080=3;
                                                S9369=0;
                                                if(!fillerStatus_o.isPartnerPresent() || fillerStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 155, column: 6
                                                  fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 155, column: 6
                                                  S9369=1;
                                                  active[8]=1;
                                                  ends[8]=1;
                                                  break RUN;
                                                }
                                                else {
                                                  S9364=0;
                                                  if(fillerStatus_o.isACK()){//sysj\controller.sysj line: 155, column: 6
                                                    fillerStatus_o.setVal("done");//sysj\controller.sysj line: 155, column: 6
                                                    S9364=1;
                                                    if(!fillerStatus_o.isACK()){//sysj\controller.sysj line: 155, column: 6
                                                      fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 155, column: 6
                                                      ends[8]=2;
                                                      ;//sysj\controller.sysj line: 155, column: 6
                                                      S7988=2;
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
                                  S7988=2;
                                  active[8]=1;
                                  ends[8]=1;
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
                      switch(S8080){
                        case 0 : 
                          switch(S8042){
                            case 0 : 
                              if(!fillerStatus_o.isPartnerPresent() || fillerStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 118, column: 6
                                fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 118, column: 6
                                S8042=1;
                                active[8]=1;
                                ends[8]=1;
                                break RUN;
                              }
                              else {
                                switch(S8037){
                                  case 0 : 
                                    if(fillerStatus_o.isACK()){//sysj\controller.sysj line: 118, column: 6
                                      fillerStatus_o.setVal("busy");//sysj\controller.sysj line: 118, column: 6
                                      S8037=1;
                                      if(!fillerStatus_o.isACK()){//sysj\controller.sysj line: 118, column: 6
                                        fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 118, column: 6
                                        ends[8]=2;
                                        ;//sysj\controller.sysj line: 118, column: 6
                                        S8080=1;
                                        S8087=0;
                                        if(!percentLiquid_in.isPartnerPresent() || percentLiquid_in.isPartnerPreempted()){//sysj\controller.sysj line: 119, column: 6
                                          percentLiquid_in.setACK(false);//sysj\controller.sysj line: 119, column: 6
                                          S8087=1;
                                          active[8]=1;
                                          ends[8]=1;
                                          break RUN;
                                        }
                                        else {
                                          S8082=0;
                                          if(!percentLiquid_in.isREQ()){//sysj\controller.sysj line: 119, column: 6
                                            percentLiquid_in.setACK(true);//sysj\controller.sysj line: 119, column: 6
                                            S8082=1;
                                            if(percentLiquid_in.isREQ()){//sysj\controller.sysj line: 119, column: 6
                                              percentLiquid_in.setACK(false);//sysj\controller.sysj line: 119, column: 6
                                              ends[8]=2;
                                              ;//sysj\controller.sysj line: 119, column: 6
                                              recPercentLiq_thread_8 = (ArrayList)(percentLiquid_in.getVal() == null ? null : ((ArrayList)percentLiquid_in.getVal()));//sysj\controller.sysj line: 120, column: 6
                                              canisterNum_thread_8 = 1;//sysj\controller.sysj line: 121, column: 6
                                              S8080=2;
                                              if(canisterNum_thread_8 < 5){//sysj\controller.sysj line: 123, column: 12
                                                S8199=0;
                                                System.out.println("selecting canister " + canisterNum_thread_8);//sysj\controller.sysj line: 126, column: 8
                                                selectCanister.setPresent();//sysj\controller.sysj line: 127, column: 9
                                                currsigs.addElement(selectCanister);
                                                selectCanister.setValue(canisterNum_thread_8);//sysj\controller.sysj line: 127, column: 9
                                                active[8]=1;
                                                ends[8]=1;
                                                break RUN;
                                              }
                                              else {
                                                ends[8]=2;
                                                ;//sysj\controller.sysj line: 123, column: 6
                                                S8080=3;
                                                S9369=0;
                                                if(!fillerStatus_o.isPartnerPresent() || fillerStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 155, column: 6
                                                  fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 155, column: 6
                                                  S9369=1;
                                                  active[8]=1;
                                                  ends[8]=1;
                                                  break RUN;
                                                }
                                                else {
                                                  S9364=0;
                                                  if(fillerStatus_o.isACK()){//sysj\controller.sysj line: 155, column: 6
                                                    fillerStatus_o.setVal("done");//sysj\controller.sysj line: 155, column: 6
                                                    S9364=1;
                                                    if(!fillerStatus_o.isACK()){//sysj\controller.sysj line: 155, column: 6
                                                      fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 155, column: 6
                                                      ends[8]=2;
                                                      ;//sysj\controller.sysj line: 155, column: 6
                                                      S7988=2;
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
                                    if(!fillerStatus_o.isACK()){//sysj\controller.sysj line: 118, column: 6
                                      fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 118, column: 6
                                      ends[8]=2;
                                      ;//sysj\controller.sysj line: 118, column: 6
                                      S8080=1;
                                      S8087=0;
                                      if(!percentLiquid_in.isPartnerPresent() || percentLiquid_in.isPartnerPreempted()){//sysj\controller.sysj line: 119, column: 6
                                        percentLiquid_in.setACK(false);//sysj\controller.sysj line: 119, column: 6
                                        S8087=1;
                                        active[8]=1;
                                        ends[8]=1;
                                        break RUN;
                                      }
                                      else {
                                        S8082=0;
                                        if(!percentLiquid_in.isREQ()){//sysj\controller.sysj line: 119, column: 6
                                          percentLiquid_in.setACK(true);//sysj\controller.sysj line: 119, column: 6
                                          S8082=1;
                                          if(percentLiquid_in.isREQ()){//sysj\controller.sysj line: 119, column: 6
                                            percentLiquid_in.setACK(false);//sysj\controller.sysj line: 119, column: 6
                                            ends[8]=2;
                                            ;//sysj\controller.sysj line: 119, column: 6
                                            recPercentLiq_thread_8 = (ArrayList)(percentLiquid_in.getVal() == null ? null : ((ArrayList)percentLiquid_in.getVal()));//sysj\controller.sysj line: 120, column: 6
                                            canisterNum_thread_8 = 1;//sysj\controller.sysj line: 121, column: 6
                                            S8080=2;
                                            if(canisterNum_thread_8 < 5){//sysj\controller.sysj line: 123, column: 12
                                              S8199=0;
                                              System.out.println("selecting canister " + canisterNum_thread_8);//sysj\controller.sysj line: 126, column: 8
                                              selectCanister.setPresent();//sysj\controller.sysj line: 127, column: 9
                                              currsigs.addElement(selectCanister);
                                              selectCanister.setValue(canisterNum_thread_8);//sysj\controller.sysj line: 127, column: 9
                                              active[8]=1;
                                              ends[8]=1;
                                              break RUN;
                                            }
                                            else {
                                              ends[8]=2;
                                              ;//sysj\controller.sysj line: 123, column: 6
                                              S8080=3;
                                              S9369=0;
                                              if(!fillerStatus_o.isPartnerPresent() || fillerStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 155, column: 6
                                                fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 155, column: 6
                                                S9369=1;
                                                active[8]=1;
                                                ends[8]=1;
                                                break RUN;
                                              }
                                              else {
                                                S9364=0;
                                                if(fillerStatus_o.isACK()){//sysj\controller.sysj line: 155, column: 6
                                                  fillerStatus_o.setVal("done");//sysj\controller.sysj line: 155, column: 6
                                                  S9364=1;
                                                  if(!fillerStatus_o.isACK()){//sysj\controller.sysj line: 155, column: 6
                                                    fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 155, column: 6
                                                    ends[8]=2;
                                                    ;//sysj\controller.sysj line: 155, column: 6
                                                    S7988=2;
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
                              S8042=1;
                              S8042=0;
                              if(!fillerStatus_o.isPartnerPresent() || fillerStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 118, column: 6
                                fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 118, column: 6
                                S8042=1;
                                active[8]=1;
                                ends[8]=1;
                                break RUN;
                              }
                              else {
                                S8037=0;
                                if(fillerStatus_o.isACK()){//sysj\controller.sysj line: 118, column: 6
                                  fillerStatus_o.setVal("busy");//sysj\controller.sysj line: 118, column: 6
                                  S8037=1;
                                  if(!fillerStatus_o.isACK()){//sysj\controller.sysj line: 118, column: 6
                                    fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 118, column: 6
                                    ends[8]=2;
                                    ;//sysj\controller.sysj line: 118, column: 6
                                    S8080=1;
                                    S8087=0;
                                    if(!percentLiquid_in.isPartnerPresent() || percentLiquid_in.isPartnerPreempted()){//sysj\controller.sysj line: 119, column: 6
                                      percentLiquid_in.setACK(false);//sysj\controller.sysj line: 119, column: 6
                                      S8087=1;
                                      active[8]=1;
                                      ends[8]=1;
                                      break RUN;
                                    }
                                    else {
                                      S8082=0;
                                      if(!percentLiquid_in.isREQ()){//sysj\controller.sysj line: 119, column: 6
                                        percentLiquid_in.setACK(true);//sysj\controller.sysj line: 119, column: 6
                                        S8082=1;
                                        if(percentLiquid_in.isREQ()){//sysj\controller.sysj line: 119, column: 6
                                          percentLiquid_in.setACK(false);//sysj\controller.sysj line: 119, column: 6
                                          ends[8]=2;
                                          ;//sysj\controller.sysj line: 119, column: 6
                                          recPercentLiq_thread_8 = (ArrayList)(percentLiquid_in.getVal() == null ? null : ((ArrayList)percentLiquid_in.getVal()));//sysj\controller.sysj line: 120, column: 6
                                          canisterNum_thread_8 = 1;//sysj\controller.sysj line: 121, column: 6
                                          S8080=2;
                                          if(canisterNum_thread_8 < 5){//sysj\controller.sysj line: 123, column: 12
                                            S8199=0;
                                            System.out.println("selecting canister " + canisterNum_thread_8);//sysj\controller.sysj line: 126, column: 8
                                            selectCanister.setPresent();//sysj\controller.sysj line: 127, column: 9
                                            currsigs.addElement(selectCanister);
                                            selectCanister.setValue(canisterNum_thread_8);//sysj\controller.sysj line: 127, column: 9
                                            active[8]=1;
                                            ends[8]=1;
                                            break RUN;
                                          }
                                          else {
                                            ends[8]=2;
                                            ;//sysj\controller.sysj line: 123, column: 6
                                            S8080=3;
                                            S9369=0;
                                            if(!fillerStatus_o.isPartnerPresent() || fillerStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 155, column: 6
                                              fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 155, column: 6
                                              S9369=1;
                                              active[8]=1;
                                              ends[8]=1;
                                              break RUN;
                                            }
                                            else {
                                              S9364=0;
                                              if(fillerStatus_o.isACK()){//sysj\controller.sysj line: 155, column: 6
                                                fillerStatus_o.setVal("done");//sysj\controller.sysj line: 155, column: 6
                                                S9364=1;
                                                if(!fillerStatus_o.isACK()){//sysj\controller.sysj line: 155, column: 6
                                                  fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 155, column: 6
                                                  ends[8]=2;
                                                  ;//sysj\controller.sysj line: 155, column: 6
                                                  S7988=2;
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
                          switch(S8087){
                            case 0 : 
                              if(!percentLiquid_in.isPartnerPresent() || percentLiquid_in.isPartnerPreempted()){//sysj\controller.sysj line: 119, column: 6
                                percentLiquid_in.setACK(false);//sysj\controller.sysj line: 119, column: 6
                                S8087=1;
                                active[8]=1;
                                ends[8]=1;
                                break RUN;
                              }
                              else {
                                switch(S8082){
                                  case 0 : 
                                    if(!percentLiquid_in.isREQ()){//sysj\controller.sysj line: 119, column: 6
                                      percentLiquid_in.setACK(true);//sysj\controller.sysj line: 119, column: 6
                                      S8082=1;
                                      if(percentLiquid_in.isREQ()){//sysj\controller.sysj line: 119, column: 6
                                        percentLiquid_in.setACK(false);//sysj\controller.sysj line: 119, column: 6
                                        ends[8]=2;
                                        ;//sysj\controller.sysj line: 119, column: 6
                                        recPercentLiq_thread_8 = (ArrayList)(percentLiquid_in.getVal() == null ? null : ((ArrayList)percentLiquid_in.getVal()));//sysj\controller.sysj line: 120, column: 6
                                        canisterNum_thread_8 = 1;//sysj\controller.sysj line: 121, column: 6
                                        S8080=2;
                                        if(canisterNum_thread_8 < 5){//sysj\controller.sysj line: 123, column: 12
                                          S8199=0;
                                          System.out.println("selecting canister " + canisterNum_thread_8);//sysj\controller.sysj line: 126, column: 8
                                          selectCanister.setPresent();//sysj\controller.sysj line: 127, column: 9
                                          currsigs.addElement(selectCanister);
                                          selectCanister.setValue(canisterNum_thread_8);//sysj\controller.sysj line: 127, column: 9
                                          active[8]=1;
                                          ends[8]=1;
                                          break RUN;
                                        }
                                        else {
                                          ends[8]=2;
                                          ;//sysj\controller.sysj line: 123, column: 6
                                          S8080=3;
                                          S9369=0;
                                          if(!fillerStatus_o.isPartnerPresent() || fillerStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 155, column: 6
                                            fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 155, column: 6
                                            S9369=1;
                                            active[8]=1;
                                            ends[8]=1;
                                            break RUN;
                                          }
                                          else {
                                            S9364=0;
                                            if(fillerStatus_o.isACK()){//sysj\controller.sysj line: 155, column: 6
                                              fillerStatus_o.setVal("done");//sysj\controller.sysj line: 155, column: 6
                                              S9364=1;
                                              if(!fillerStatus_o.isACK()){//sysj\controller.sysj line: 155, column: 6
                                                fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 155, column: 6
                                                ends[8]=2;
                                                ;//sysj\controller.sysj line: 155, column: 6
                                                S7988=2;
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
                                    if(percentLiquid_in.isREQ()){//sysj\controller.sysj line: 119, column: 6
                                      percentLiquid_in.setACK(false);//sysj\controller.sysj line: 119, column: 6
                                      ends[8]=2;
                                      ;//sysj\controller.sysj line: 119, column: 6
                                      recPercentLiq_thread_8 = (ArrayList)(percentLiquid_in.getVal() == null ? null : ((ArrayList)percentLiquid_in.getVal()));//sysj\controller.sysj line: 120, column: 6
                                      canisterNum_thread_8 = 1;//sysj\controller.sysj line: 121, column: 6
                                      S8080=2;
                                      if(canisterNum_thread_8 < 5){//sysj\controller.sysj line: 123, column: 12
                                        S8199=0;
                                        System.out.println("selecting canister " + canisterNum_thread_8);//sysj\controller.sysj line: 126, column: 8
                                        selectCanister.setPresent();//sysj\controller.sysj line: 127, column: 9
                                        currsigs.addElement(selectCanister);
                                        selectCanister.setValue(canisterNum_thread_8);//sysj\controller.sysj line: 127, column: 9
                                        active[8]=1;
                                        ends[8]=1;
                                        break RUN;
                                      }
                                      else {
                                        ends[8]=2;
                                        ;//sysj\controller.sysj line: 123, column: 6
                                        S8080=3;
                                        S9369=0;
                                        if(!fillerStatus_o.isPartnerPresent() || fillerStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 155, column: 6
                                          fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 155, column: 6
                                          S9369=1;
                                          active[8]=1;
                                          ends[8]=1;
                                          break RUN;
                                        }
                                        else {
                                          S9364=0;
                                          if(fillerStatus_o.isACK()){//sysj\controller.sysj line: 155, column: 6
                                            fillerStatus_o.setVal("done");//sysj\controller.sysj line: 155, column: 6
                                            S9364=1;
                                            if(!fillerStatus_o.isACK()){//sysj\controller.sysj line: 155, column: 6
                                              fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 155, column: 6
                                              ends[8]=2;
                                              ;//sysj\controller.sysj line: 155, column: 6
                                              S7988=2;
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
                              S8087=1;
                              S8087=0;
                              if(!percentLiquid_in.isPartnerPresent() || percentLiquid_in.isPartnerPreempted()){//sysj\controller.sysj line: 119, column: 6
                                percentLiquid_in.setACK(false);//sysj\controller.sysj line: 119, column: 6
                                S8087=1;
                                active[8]=1;
                                ends[8]=1;
                                break RUN;
                              }
                              else {
                                S8082=0;
                                if(!percentLiquid_in.isREQ()){//sysj\controller.sysj line: 119, column: 6
                                  percentLiquid_in.setACK(true);//sysj\controller.sysj line: 119, column: 6
                                  S8082=1;
                                  if(percentLiquid_in.isREQ()){//sysj\controller.sysj line: 119, column: 6
                                    percentLiquid_in.setACK(false);//sysj\controller.sysj line: 119, column: 6
                                    ends[8]=2;
                                    ;//sysj\controller.sysj line: 119, column: 6
                                    recPercentLiq_thread_8 = (ArrayList)(percentLiquid_in.getVal() == null ? null : ((ArrayList)percentLiquid_in.getVal()));//sysj\controller.sysj line: 120, column: 6
                                    canisterNum_thread_8 = 1;//sysj\controller.sysj line: 121, column: 6
                                    S8080=2;
                                    if(canisterNum_thread_8 < 5){//sysj\controller.sysj line: 123, column: 12
                                      S8199=0;
                                      System.out.println("selecting canister " + canisterNum_thread_8);//sysj\controller.sysj line: 126, column: 8
                                      selectCanister.setPresent();//sysj\controller.sysj line: 127, column: 9
                                      currsigs.addElement(selectCanister);
                                      selectCanister.setValue(canisterNum_thread_8);//sysj\controller.sysj line: 127, column: 9
                                      active[8]=1;
                                      ends[8]=1;
                                      break RUN;
                                    }
                                    else {
                                      ends[8]=2;
                                      ;//sysj\controller.sysj line: 123, column: 6
                                      S8080=3;
                                      S9369=0;
                                      if(!fillerStatus_o.isPartnerPresent() || fillerStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 155, column: 6
                                        fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 155, column: 6
                                        S9369=1;
                                        active[8]=1;
                                        ends[8]=1;
                                        break RUN;
                                      }
                                      else {
                                        S9364=0;
                                        if(fillerStatus_o.isACK()){//sysj\controller.sysj line: 155, column: 6
                                          fillerStatus_o.setVal("done");//sysj\controller.sysj line: 155, column: 6
                                          S9364=1;
                                          if(!fillerStatus_o.isACK()){//sysj\controller.sysj line: 155, column: 6
                                            fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 155, column: 6
                                            ends[8]=2;
                                            ;//sysj\controller.sysj line: 155, column: 6
                                            S7988=2;
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
                          switch(S8199){
                            case 0 : 
                              if(selectedCanister.getprestatus()){//sysj\controller.sysj line: 125, column: 13
                                S8199=1;
                                thread118491(tdone,ends);
                                thread118492(tdone,ends);
                                int biggest118493 = 0;
                                if(ends[9]>=biggest118493){
                                  biggest118493=ends[9];
                                }
                                if(ends[10]>=biggest118493){
                                  biggest118493=ends[10];
                                }
                                if(biggest118493 == 1){
                                  active[8]=1;
                                  ends[8]=1;
                                  break RUN;
                                }
                              }
                              else {
                                selectCanister.setPresent();//sysj\controller.sysj line: 127, column: 9
                                currsigs.addElement(selectCanister);
                                selectCanister.setValue(canisterNum_thread_8);//sysj\controller.sysj line: 127, column: 9
                                active[8]=1;
                                ends[8]=1;
                                break RUN;
                              }
                            
                            case 1 : 
                              if(!dosUnitEvac.getprestatus()){//sysj\controller.sysj line: 131, column: 14
                                System.out.println("Canister above bottle");//sysj\controller.sysj line: 134, column: 8
                                receivedPercentage.setPresent();//sysj\controller.sysj line: 138, column: 8
                                currsigs.addElement(receivedPercentage);
                                receivedPercentage.setValue(recPercentLiq_thread_8.get(canisterNum_thread_8 - 1));//sysj\controller.sysj line: 138, column: 8
                                S8199=2;
                                valveInletOnOff.setPresent();//sysj\controller.sysj line: 142, column: 9
                                currsigs.addElement(valveInletOnOff);
                                active[8]=1;
                                ends[8]=1;
                                break RUN;
                              }
                              else {
                                thread118494(tdone,ends);
                                thread118495(tdone,ends);
                                int biggest118496 = 0;
                                if(ends[9]>=biggest118496){
                                  biggest118496=ends[9];
                                }
                                if(ends[10]>=biggest118496){
                                  biggest118496=ends[10];
                                }
                                if(biggest118496 == 1){
                                  active[8]=1;
                                  ends[8]=1;
                                  break RUN;
                                }
                                //FINXME code
                                if(biggest118496 == 0){
                                  System.out.println("Canister above bottle");//sysj\controller.sysj line: 134, column: 8
                                  receivedPercentage.setPresent();//sysj\controller.sysj line: 138, column: 8
                                  currsigs.addElement(receivedPercentage);
                                  receivedPercentage.setValue(recPercentLiq_thread_8.get(canisterNum_thread_8 - 1));//sysj\controller.sysj line: 138, column: 8
                                  S8199=2;
                                  valveInletOnOff.setPresent();//sysj\controller.sysj line: 142, column: 9
                                  currsigs.addElement(valveInletOnOff);
                                  active[8]=1;
                                  ends[8]=1;
                                  break RUN;
                                }
                              }
                            
                            case 2 : 
                              if(dosUnitFilled.getprestatus()){//sysj\controller.sysj line: 141, column: 14
                                System.out.println("Bottle controller filled");//sysj\controller.sysj line: 145, column: 8
                                S8199=3;
                                thread118497(tdone,ends);
                                thread118498(tdone,ends);
                                int biggest118499 = 0;
                                if(ends[11]>=biggest118499){
                                  biggest118499=ends[11];
                                }
                                if(ends[12]>=biggest118499){
                                  biggest118499=ends[12];
                                }
                                if(biggest118499 == 1){
                                  active[8]=1;
                                  ends[8]=1;
                                  break RUN;
                                }
                              }
                              else {
                                valveInletOnOff.setPresent();//sysj\controller.sysj line: 142, column: 9
                                currsigs.addElement(valveInletOnOff);
                                active[8]=1;
                                ends[8]=1;
                                break RUN;
                              }
                            
                            case 3 : 
                              if(dosUnitEvac.getprestatus()){//sysj\controller.sysj line: 147, column: 14
                                System.out.println("Canister returned");//sysj\controller.sysj line: 150, column: 8
                                canisterNum_thread_8 += 1;//sysj\controller.sysj line: 152, column: 8
                                S8199=4;
                                active[8]=1;
                                ends[8]=1;
                                break RUN;
                              }
                              else {
                                thread118500(tdone,ends);
                                thread118501(tdone,ends);
                                int biggest118502 = 0;
                                if(ends[11]>=biggest118502){
                                  biggest118502=ends[11];
                                }
                                if(ends[12]>=biggest118502){
                                  biggest118502=ends[12];
                                }
                                if(biggest118502 == 1){
                                  active[8]=1;
                                  ends[8]=1;
                                  break RUN;
                                }
                                //FINXME code
                                if(biggest118502 == 0){
                                  System.out.println("Canister returned");//sysj\controller.sysj line: 150, column: 8
                                  canisterNum_thread_8 += 1;//sysj\controller.sysj line: 152, column: 8
                                  S8199=4;
                                  active[8]=1;
                                  ends[8]=1;
                                  break RUN;
                                }
                              }
                            
                            case 4 : 
                              S8199=4;
                              if(canisterNum_thread_8 < 5){//sysj\controller.sysj line: 123, column: 12
                                S8199=0;
                                System.out.println("selecting canister " + canisterNum_thread_8);//sysj\controller.sysj line: 126, column: 8
                                selectCanister.setPresent();//sysj\controller.sysj line: 127, column: 9
                                currsigs.addElement(selectCanister);
                                selectCanister.setValue(canisterNum_thread_8);//sysj\controller.sysj line: 127, column: 9
                                active[8]=1;
                                ends[8]=1;
                                break RUN;
                              }
                              else {
                                ends[8]=2;
                                ;//sysj\controller.sysj line: 123, column: 6
                                S8080=3;
                                S9369=0;
                                if(!fillerStatus_o.isPartnerPresent() || fillerStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 155, column: 6
                                  fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 155, column: 6
                                  S9369=1;
                                  active[8]=1;
                                  ends[8]=1;
                                  break RUN;
                                }
                                else {
                                  S9364=0;
                                  if(fillerStatus_o.isACK()){//sysj\controller.sysj line: 155, column: 6
                                    fillerStatus_o.setVal("done");//sysj\controller.sysj line: 155, column: 6
                                    S9364=1;
                                    if(!fillerStatus_o.isACK()){//sysj\controller.sysj line: 155, column: 6
                                      fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 155, column: 6
                                      ends[8]=2;
                                      ;//sysj\controller.sysj line: 155, column: 6
                                      S7988=2;
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
                          switch(S9369){
                            case 0 : 
                              if(!fillerStatus_o.isPartnerPresent() || fillerStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 155, column: 6
                                fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 155, column: 6
                                S9369=1;
                                active[8]=1;
                                ends[8]=1;
                                break RUN;
                              }
                              else {
                                switch(S9364){
                                  case 0 : 
                                    if(fillerStatus_o.isACK()){//sysj\controller.sysj line: 155, column: 6
                                      fillerStatus_o.setVal("done");//sysj\controller.sysj line: 155, column: 6
                                      S9364=1;
                                      if(!fillerStatus_o.isACK()){//sysj\controller.sysj line: 155, column: 6
                                        fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 155, column: 6
                                        ends[8]=2;
                                        ;//sysj\controller.sysj line: 155, column: 6
                                        S7988=2;
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
                                    if(!fillerStatus_o.isACK()){//sysj\controller.sysj line: 155, column: 6
                                      fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 155, column: 6
                                      ends[8]=2;
                                      ;//sysj\controller.sysj line: 155, column: 6
                                      S7988=2;
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
                              S9369=1;
                              S9369=0;
                              if(!fillerStatus_o.isPartnerPresent() || fillerStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 155, column: 6
                                fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 155, column: 6
                                S9369=1;
                                active[8]=1;
                                ends[8]=1;
                                break RUN;
                              }
                              else {
                                S9364=0;
                                if(fillerStatus_o.isACK()){//sysj\controller.sysj line: 155, column: 6
                                  fillerStatus_o.setVal("done");//sysj\controller.sysj line: 155, column: 6
                                  S9364=1;
                                  if(!fillerStatus_o.isACK()){//sysj\controller.sysj line: 155, column: 6
                                    fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 155, column: 6
                                    ends[8]=2;
                                    ;//sysj\controller.sysj line: 155, column: 6
                                    S7988=2;
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
                  switch(S15452){
                    case 0 : 
                      if(!fillerStatus_o.isPartnerPresent() || fillerStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 158, column: 4
                        fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 158, column: 4
                        S15452=1;
                        active[8]=1;
                        ends[8]=1;
                        break RUN;
                      }
                      else {
                        switch(S15447){
                          case 0 : 
                            if(fillerStatus_o.isACK()){//sysj\controller.sysj line: 158, column: 4
                              fillerStatus_o.setVal("idle");//sysj\controller.sysj line: 158, column: 4
                              S15447=1;
                              if(!fillerStatus_o.isACK()){//sysj\controller.sysj line: 158, column: 4
                                fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 158, column: 4
                                ends[8]=2;
                                ;//sysj\controller.sysj line: 158, column: 4
                                S7988=2;
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
                            if(!fillerStatus_o.isACK()){//sysj\controller.sysj line: 158, column: 4
                              fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 158, column: 4
                              ends[8]=2;
                              ;//sysj\controller.sysj line: 158, column: 4
                              S7988=2;
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
                      S15452=1;
                      S15452=0;
                      if(!fillerStatus_o.isPartnerPresent() || fillerStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 158, column: 4
                        fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 158, column: 4
                        S15452=1;
                        active[8]=1;
                        ends[8]=1;
                        break RUN;
                      }
                      else {
                        S15447=0;
                        if(fillerStatus_o.isACK()){//sysj\controller.sysj line: 158, column: 4
                          fillerStatus_o.setVal("idle");//sysj\controller.sysj line: 158, column: 4
                          S15447=1;
                          if(!fillerStatus_o.isACK()){//sysj\controller.sysj line: 158, column: 4
                            fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 158, column: 4
                            ends[8]=2;
                            ;//sysj\controller.sysj line: 158, column: 4
                            S7988=2;
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
              S7988=2;
              S7988=0;
              S7972=0;
              if(!fillerReq_in.isPartnerPresent() || fillerReq_in.isPartnerPreempted()){//sysj\controller.sysj line: 105, column: 3
                fillerReq_in.setACK(false);//sysj\controller.sysj line: 105, column: 3
                S7972=1;
                active[8]=1;
                ends[8]=1;
                break RUN;
              }
              else {
                S7967=0;
                if(!fillerReq_in.isREQ()){//sysj\controller.sysj line: 105, column: 3
                  fillerReq_in.setACK(true);//sysj\controller.sysj line: 105, column: 3
                  S7967=1;
                  if(fillerReq_in.isREQ()){//sysj\controller.sysj line: 105, column: 3
                    fillerReq_in.setACK(false);//sysj\controller.sysj line: 105, column: 3
                    ends[8]=2;
                    ;//sysj\controller.sysj line: 105, column: 3
                    request_thread_8 = (fillerReq_in.getVal() == null ? null : ((Boolean)fillerReq_in.getVal()));//sysj\controller.sysj line: 106, column: 3
                    S7988=1;
                    if(request_thread_8){//sysj\controller.sysj line: 108, column: 3
                      S15468=0;
                      System.out.println("Filler - received req from orch");//sysj\controller.sysj line: 110, column: 5
                      S8035=0;
                      if(!bottleAtPos2.getprestatus()){//sysj\controller.sysj line: 111, column: 13
                        S7995=0;
                        if(!fillerStatus_o.isPartnerPresent() || fillerStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 112, column: 6
                          fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 112, column: 6
                          S7995=1;
                          active[8]=1;
                          ends[8]=1;
                          break RUN;
                        }
                        else {
                          S7990=0;
                          if(fillerStatus_o.isACK()){//sysj\controller.sysj line: 112, column: 6
                            fillerStatus_o.setVal("idle");//sysj\controller.sysj line: 112, column: 6
                            S7990=1;
                            if(!fillerStatus_o.isACK()){//sysj\controller.sysj line: 112, column: 6
                              fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 112, column: 6
                              ends[8]=2;
                              ;//sysj\controller.sysj line: 112, column: 6
                              S8035=1;
                              if(bottleAtPos2.getprestatus()){//sysj\controller.sysj line: 116, column: 13
                                System.out.println("Filler - bottle is at pos 2");//sysj\controller.sysj line: 117, column: 6
                                S8080=0;
                                S8042=0;
                                if(!fillerStatus_o.isPartnerPresent() || fillerStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 118, column: 6
                                  fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 118, column: 6
                                  S8042=1;
                                  active[8]=1;
                                  ends[8]=1;
                                  break RUN;
                                }
                                else {
                                  S8037=0;
                                  if(fillerStatus_o.isACK()){//sysj\controller.sysj line: 118, column: 6
                                    fillerStatus_o.setVal("busy");//sysj\controller.sysj line: 118, column: 6
                                    S8037=1;
                                    if(!fillerStatus_o.isACK()){//sysj\controller.sysj line: 118, column: 6
                                      fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 118, column: 6
                                      ends[8]=2;
                                      ;//sysj\controller.sysj line: 118, column: 6
                                      S8080=1;
                                      S8087=0;
                                      if(!percentLiquid_in.isPartnerPresent() || percentLiquid_in.isPartnerPreempted()){//sysj\controller.sysj line: 119, column: 6
                                        percentLiquid_in.setACK(false);//sysj\controller.sysj line: 119, column: 6
                                        S8087=1;
                                        active[8]=1;
                                        ends[8]=1;
                                        break RUN;
                                      }
                                      else {
                                        S8082=0;
                                        if(!percentLiquid_in.isREQ()){//sysj\controller.sysj line: 119, column: 6
                                          percentLiquid_in.setACK(true);//sysj\controller.sysj line: 119, column: 6
                                          S8082=1;
                                          if(percentLiquid_in.isREQ()){//sysj\controller.sysj line: 119, column: 6
                                            percentLiquid_in.setACK(false);//sysj\controller.sysj line: 119, column: 6
                                            ends[8]=2;
                                            ;//sysj\controller.sysj line: 119, column: 6
                                            recPercentLiq_thread_8 = (ArrayList)(percentLiquid_in.getVal() == null ? null : ((ArrayList)percentLiquid_in.getVal()));//sysj\controller.sysj line: 120, column: 6
                                            canisterNum_thread_8 = 1;//sysj\controller.sysj line: 121, column: 6
                                            S8080=2;
                                            if(canisterNum_thread_8 < 5){//sysj\controller.sysj line: 123, column: 12
                                              S8199=0;
                                              System.out.println("selecting canister " + canisterNum_thread_8);//sysj\controller.sysj line: 126, column: 8
                                              selectCanister.setPresent();//sysj\controller.sysj line: 127, column: 9
                                              currsigs.addElement(selectCanister);
                                              selectCanister.setValue(canisterNum_thread_8);//sysj\controller.sysj line: 127, column: 9
                                              active[8]=1;
                                              ends[8]=1;
                                              break RUN;
                                            }
                                            else {
                                              ends[8]=2;
                                              ;//sysj\controller.sysj line: 123, column: 6
                                              S8080=3;
                                              S9369=0;
                                              if(!fillerStatus_o.isPartnerPresent() || fillerStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 155, column: 6
                                                fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 155, column: 6
                                                S9369=1;
                                                active[8]=1;
                                                ends[8]=1;
                                                break RUN;
                                              }
                                              else {
                                                S9364=0;
                                                if(fillerStatus_o.isACK()){//sysj\controller.sysj line: 155, column: 6
                                                  fillerStatus_o.setVal("done");//sysj\controller.sysj line: 155, column: 6
                                                  S9364=1;
                                                  if(!fillerStatus_o.isACK()){//sysj\controller.sysj line: 155, column: 6
                                                    fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 155, column: 6
                                                    ends[8]=2;
                                                    ;//sysj\controller.sysj line: 155, column: 6
                                                    S7988=2;
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
                                S7988=2;
                                active[8]=1;
                                ends[8]=1;
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
                        S8035=1;
                        if(bottleAtPos2.getprestatus()){//sysj\controller.sysj line: 116, column: 13
                          System.out.println("Filler - bottle is at pos 2");//sysj\controller.sysj line: 117, column: 6
                          S8080=0;
                          S8042=0;
                          if(!fillerStatus_o.isPartnerPresent() || fillerStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 118, column: 6
                            fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 118, column: 6
                            S8042=1;
                            active[8]=1;
                            ends[8]=1;
                            break RUN;
                          }
                          else {
                            S8037=0;
                            if(fillerStatus_o.isACK()){//sysj\controller.sysj line: 118, column: 6
                              fillerStatus_o.setVal("busy");//sysj\controller.sysj line: 118, column: 6
                              S8037=1;
                              if(!fillerStatus_o.isACK()){//sysj\controller.sysj line: 118, column: 6
                                fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 118, column: 6
                                ends[8]=2;
                                ;//sysj\controller.sysj line: 118, column: 6
                                S8080=1;
                                S8087=0;
                                if(!percentLiquid_in.isPartnerPresent() || percentLiquid_in.isPartnerPreempted()){//sysj\controller.sysj line: 119, column: 6
                                  percentLiquid_in.setACK(false);//sysj\controller.sysj line: 119, column: 6
                                  S8087=1;
                                  active[8]=1;
                                  ends[8]=1;
                                  break RUN;
                                }
                                else {
                                  S8082=0;
                                  if(!percentLiquid_in.isREQ()){//sysj\controller.sysj line: 119, column: 6
                                    percentLiquid_in.setACK(true);//sysj\controller.sysj line: 119, column: 6
                                    S8082=1;
                                    if(percentLiquid_in.isREQ()){//sysj\controller.sysj line: 119, column: 6
                                      percentLiquid_in.setACK(false);//sysj\controller.sysj line: 119, column: 6
                                      ends[8]=2;
                                      ;//sysj\controller.sysj line: 119, column: 6
                                      recPercentLiq_thread_8 = (ArrayList)(percentLiquid_in.getVal() == null ? null : ((ArrayList)percentLiquid_in.getVal()));//sysj\controller.sysj line: 120, column: 6
                                      canisterNum_thread_8 = 1;//sysj\controller.sysj line: 121, column: 6
                                      S8080=2;
                                      if(canisterNum_thread_8 < 5){//sysj\controller.sysj line: 123, column: 12
                                        S8199=0;
                                        System.out.println("selecting canister " + canisterNum_thread_8);//sysj\controller.sysj line: 126, column: 8
                                        selectCanister.setPresent();//sysj\controller.sysj line: 127, column: 9
                                        currsigs.addElement(selectCanister);
                                        selectCanister.setValue(canisterNum_thread_8);//sysj\controller.sysj line: 127, column: 9
                                        active[8]=1;
                                        ends[8]=1;
                                        break RUN;
                                      }
                                      else {
                                        ends[8]=2;
                                        ;//sysj\controller.sysj line: 123, column: 6
                                        S8080=3;
                                        S9369=0;
                                        if(!fillerStatus_o.isPartnerPresent() || fillerStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 155, column: 6
                                          fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 155, column: 6
                                          S9369=1;
                                          active[8]=1;
                                          ends[8]=1;
                                          break RUN;
                                        }
                                        else {
                                          S9364=0;
                                          if(fillerStatus_o.isACK()){//sysj\controller.sysj line: 155, column: 6
                                            fillerStatus_o.setVal("done");//sysj\controller.sysj line: 155, column: 6
                                            S9364=1;
                                            if(!fillerStatus_o.isACK()){//sysj\controller.sysj line: 155, column: 6
                                              fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 155, column: 6
                                              ends[8]=2;
                                              ;//sysj\controller.sysj line: 155, column: 6
                                              S7988=2;
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
                          S7988=2;
                          active[8]=1;
                          ends[8]=1;
                          break RUN;
                        }
                      }
                    }
                    else {
                      S15468=1;
                      S15452=0;
                      if(!fillerStatus_o.isPartnerPresent() || fillerStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 158, column: 4
                        fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 158, column: 4
                        S15452=1;
                        active[8]=1;
                        ends[8]=1;
                        break RUN;
                      }
                      else {
                        S15447=0;
                        if(fillerStatus_o.isACK()){//sysj\controller.sysj line: 158, column: 4
                          fillerStatus_o.setVal("idle");//sysj\controller.sysj line: 158, column: 4
                          S15447=1;
                          if(!fillerStatus_o.isACK()){//sysj\controller.sysj line: 158, column: 4
                            fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 158, column: 4
                            ends[8]=2;
                            ;//sysj\controller.sysj line: 158, column: 4
                            S7988=2;
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
