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
  private int number_thread_8;//sysj\controller.sysj line: 137, column: 8
  private Boolean request_thread_8;//sysj\controller.sysj line: 105, column: 3
  private ArrayList recPercentLiq_thread_8;//sysj\controller.sysj line: 119, column: 6
  private int canisterNum_thread_8;//sysj\controller.sysj line: 120, column: 6
  private int S101840 = 1;
  private int S7712 = 1;
  private int S7696 = 1;
  private int S7691 = 1;
  private int S15552 = 1;
  private int S7759 = 1;
  private int S7719 = 1;
  private int S7714 = 1;
  private int S7804 = 1;
  private int S7766 = 1;
  private int S7761 = 1;
  private int S7811 = 1;
  private int S7806 = 1;
  private int S7923 = 1;
  private int S7905 = 1;
  private int S7910 = 1;
  private int S7944 = 1;
  private int S7949 = 1;
  private int S9165 = 1;
  private int S9160 = 1;
  private int S15536 = 1;
  private int S15531 = 1;
  
  private int[] ends = new int[23];
  private int[] tdone = new int[23];
  
  public void thread117745(int [] tdone, int [] ends){
        switch(S7949){
      case 0 : 
        active[12]=0;
        ends[12]=0;
        tdone[12]=1;
        break;
      
      case 1 : 
        valveInjectorOnOff.setPresent();//sysj\controller.sysj line: 151, column: 43
        currsigs.addElement(valveInjectorOnOff);
        active[12]=1;
        ends[12]=1;
        tdone[12]=1;
        break;
      
    }
  }

  public void thread117744(int [] tdone, int [] ends){
        switch(S7944){
      case 0 : 
        active[11]=0;
        ends[11]=0;
        tdone[11]=1;
        break;
      
      case 1 : 
        dosUnitValveExtend.setPresent();//sysj\controller.sysj line: 151, column: 10
        currsigs.addElement(dosUnitValveExtend);
        active[11]=1;
        ends[11]=1;
        tdone[11]=1;
        break;
      
    }
  }

  public void thread117742(int [] tdone, int [] ends){
        S7949=1;
    valveInjectorOnOff.setPresent();//sysj\controller.sysj line: 151, column: 43
    currsigs.addElement(valveInjectorOnOff);
    active[12]=1;
    ends[12]=1;
    tdone[12]=1;
  }

  public void thread117741(int [] tdone, int [] ends){
        S7944=1;
    dosUnitValveExtend.setPresent();//sysj\controller.sysj line: 151, column: 10
    currsigs.addElement(dosUnitValveExtend);
    active[11]=1;
    ends[11]=1;
    tdone[11]=1;
  }

  public void thread117739(int [] tdone, int [] ends){
        switch(S7910){
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

  public void thread117738(int [] tdone, int [] ends){
        switch(S7905){
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

  public void thread117736(int [] tdone, int [] ends){
        S7910=1;
    valveInjectorOnOff.setPresent();//sysj\controller.sysj line: 131, column: 44
    currsigs.addElement(valveInjectorOnOff);
    active[10]=1;
    ends[10]=1;
    tdone[10]=1;
  }

  public void thread117735(int [] tdone, int [] ends){
        S7905=1;
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
      switch(S101840){
        case 0 : 
          S101840=0;
          break RUN;
        
        case 1 : 
          S101840=2;
          S101840=2;
          S7712=0;
          S7696=0;
          if(!fillerReq_in.isPartnerPresent() || fillerReq_in.isPartnerPreempted()){//sysj\controller.sysj line: 104, column: 3
            fillerReq_in.setACK(false);//sysj\controller.sysj line: 104, column: 3
            S7696=1;
            active[8]=1;
            ends[8]=1;
            break RUN;
          }
          else {
            S7691=0;
            if(!fillerReq_in.isREQ()){//sysj\controller.sysj line: 104, column: 3
              fillerReq_in.setACK(true);//sysj\controller.sysj line: 104, column: 3
              S7691=1;
              if(fillerReq_in.isREQ()){//sysj\controller.sysj line: 104, column: 3
                fillerReq_in.setACK(false);//sysj\controller.sysj line: 104, column: 3
                ends[8]=2;
                ;//sysj\controller.sysj line: 104, column: 3
                request_thread_8 = (fillerReq_in.getVal() == null ? null : ((Boolean)fillerReq_in.getVal()));//sysj\controller.sysj line: 105, column: 3
                S7712=1;
                if(request_thread_8){//sysj\controller.sysj line: 107, column: 3
                  S15552=0;
                  System.out.println("Filler - received req from orch");//sysj\controller.sysj line: 109, column: 5
                  S7759=0;
                  if(!bottleAtPos2.getprestatus()){//sysj\controller.sysj line: 110, column: 13
                    S7719=0;
                    if(!fillerStatus_o.isPartnerPresent() || fillerStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 111, column: 6
                      fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 111, column: 6
                      S7719=1;
                      active[8]=1;
                      ends[8]=1;
                      break RUN;
                    }
                    else {
                      S7714=0;
                      if(fillerStatus_o.isACK()){//sysj\controller.sysj line: 111, column: 6
                        fillerStatus_o.setVal("idle");//sysj\controller.sysj line: 111, column: 6
                        S7714=1;
                        if(!fillerStatus_o.isACK()){//sysj\controller.sysj line: 111, column: 6
                          fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 111, column: 6
                          ends[8]=2;
                          ;//sysj\controller.sysj line: 111, column: 6
                          S7759=1;
                          if(bottleAtPos2.getprestatus()){//sysj\controller.sysj line: 115, column: 13
                            System.out.println("Filler - bottle is at pos 2");//sysj\controller.sysj line: 116, column: 6
                            S7804=0;
                            S7766=0;
                            if(!fillerStatus_o.isPartnerPresent() || fillerStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 117, column: 6
                              fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 117, column: 6
                              S7766=1;
                              active[8]=1;
                              ends[8]=1;
                              break RUN;
                            }
                            else {
                              S7761=0;
                              if(fillerStatus_o.isACK()){//sysj\controller.sysj line: 117, column: 6
                                fillerStatus_o.setVal("busy");//sysj\controller.sysj line: 117, column: 6
                                S7761=1;
                                if(!fillerStatus_o.isACK()){//sysj\controller.sysj line: 117, column: 6
                                  fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 117, column: 6
                                  ends[8]=2;
                                  ;//sysj\controller.sysj line: 117, column: 6
                                  S7804=1;
                                  S7811=0;
                                  if(!percentLiquid_in.isPartnerPresent() || percentLiquid_in.isPartnerPreempted()){//sysj\controller.sysj line: 118, column: 6
                                    percentLiquid_in.setACK(false);//sysj\controller.sysj line: 118, column: 6
                                    S7811=1;
                                    active[8]=1;
                                    ends[8]=1;
                                    break RUN;
                                  }
                                  else {
                                    S7806=0;
                                    if(!percentLiquid_in.isREQ()){//sysj\controller.sysj line: 118, column: 6
                                      percentLiquid_in.setACK(true);//sysj\controller.sysj line: 118, column: 6
                                      S7806=1;
                                      if(percentLiquid_in.isREQ()){//sysj\controller.sysj line: 118, column: 6
                                        percentLiquid_in.setACK(false);//sysj\controller.sysj line: 118, column: 6
                                        ends[8]=2;
                                        ;//sysj\controller.sysj line: 118, column: 6
                                        recPercentLiq_thread_8 = (ArrayList)(percentLiquid_in.getVal() == null ? null : ((ArrayList)percentLiquid_in.getVal()));//sysj\controller.sysj line: 119, column: 6
                                        canisterNum_thread_8 = 1;//sysj\controller.sysj line: 120, column: 6
                                        S7804=2;
                                        if(canisterNum_thread_8 < 5){//sysj\controller.sysj line: 122, column: 12
                                          S7923=0;
                                          System.out.println("selecting canister " + canisterNum_thread_8);//sysj\controller.sysj line: 125, column: 8
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
                                          S7804=3;
                                          S9165=0;
                                          if(!fillerStatus_o.isPartnerPresent() || fillerStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 158, column: 6
                                            fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 158, column: 6
                                            S9165=1;
                                            active[8]=1;
                                            ends[8]=1;
                                            break RUN;
                                          }
                                          else {
                                            S9160=0;
                                            if(fillerStatus_o.isACK()){//sysj\controller.sysj line: 158, column: 6
                                              fillerStatus_o.setVal("done");//sysj\controller.sysj line: 158, column: 6
                                              S9160=1;
                                              if(!fillerStatus_o.isACK()){//sysj\controller.sysj line: 158, column: 6
                                                fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 158, column: 6
                                                ends[8]=2;
                                                ;//sysj\controller.sysj line: 158, column: 6
                                                S7712=2;
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
                            S7712=2;
                            active[8]=1;
                            ends[8]=1;
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
                    S7759=1;
                    if(bottleAtPos2.getprestatus()){//sysj\controller.sysj line: 115, column: 13
                      System.out.println("Filler - bottle is at pos 2");//sysj\controller.sysj line: 116, column: 6
                      S7804=0;
                      S7766=0;
                      if(!fillerStatus_o.isPartnerPresent() || fillerStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 117, column: 6
                        fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 117, column: 6
                        S7766=1;
                        active[8]=1;
                        ends[8]=1;
                        break RUN;
                      }
                      else {
                        S7761=0;
                        if(fillerStatus_o.isACK()){//sysj\controller.sysj line: 117, column: 6
                          fillerStatus_o.setVal("busy");//sysj\controller.sysj line: 117, column: 6
                          S7761=1;
                          if(!fillerStatus_o.isACK()){//sysj\controller.sysj line: 117, column: 6
                            fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 117, column: 6
                            ends[8]=2;
                            ;//sysj\controller.sysj line: 117, column: 6
                            S7804=1;
                            S7811=0;
                            if(!percentLiquid_in.isPartnerPresent() || percentLiquid_in.isPartnerPreempted()){//sysj\controller.sysj line: 118, column: 6
                              percentLiquid_in.setACK(false);//sysj\controller.sysj line: 118, column: 6
                              S7811=1;
                              active[8]=1;
                              ends[8]=1;
                              break RUN;
                            }
                            else {
                              S7806=0;
                              if(!percentLiquid_in.isREQ()){//sysj\controller.sysj line: 118, column: 6
                                percentLiquid_in.setACK(true);//sysj\controller.sysj line: 118, column: 6
                                S7806=1;
                                if(percentLiquid_in.isREQ()){//sysj\controller.sysj line: 118, column: 6
                                  percentLiquid_in.setACK(false);//sysj\controller.sysj line: 118, column: 6
                                  ends[8]=2;
                                  ;//sysj\controller.sysj line: 118, column: 6
                                  recPercentLiq_thread_8 = (ArrayList)(percentLiquid_in.getVal() == null ? null : ((ArrayList)percentLiquid_in.getVal()));//sysj\controller.sysj line: 119, column: 6
                                  canisterNum_thread_8 = 1;//sysj\controller.sysj line: 120, column: 6
                                  S7804=2;
                                  if(canisterNum_thread_8 < 5){//sysj\controller.sysj line: 122, column: 12
                                    S7923=0;
                                    System.out.println("selecting canister " + canisterNum_thread_8);//sysj\controller.sysj line: 125, column: 8
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
                                    S7804=3;
                                    S9165=0;
                                    if(!fillerStatus_o.isPartnerPresent() || fillerStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 158, column: 6
                                      fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 158, column: 6
                                      S9165=1;
                                      active[8]=1;
                                      ends[8]=1;
                                      break RUN;
                                    }
                                    else {
                                      S9160=0;
                                      if(fillerStatus_o.isACK()){//sysj\controller.sysj line: 158, column: 6
                                        fillerStatus_o.setVal("done");//sysj\controller.sysj line: 158, column: 6
                                        S9160=1;
                                        if(!fillerStatus_o.isACK()){//sysj\controller.sysj line: 158, column: 6
                                          fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 158, column: 6
                                          ends[8]=2;
                                          ;//sysj\controller.sysj line: 158, column: 6
                                          S7712=2;
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
                      S7712=2;
                      active[8]=1;
                      ends[8]=1;
                      break RUN;
                    }
                  }
                }
                else {
                  S15552=1;
                  S15536=0;
                  if(!fillerStatus_o.isPartnerPresent() || fillerStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 161, column: 4
                    fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 161, column: 4
                    S15536=1;
                    active[8]=1;
                    ends[8]=1;
                    break RUN;
                  }
                  else {
                    S15531=0;
                    if(fillerStatus_o.isACK()){//sysj\controller.sysj line: 161, column: 4
                      fillerStatus_o.setVal("idle");//sysj\controller.sysj line: 161, column: 4
                      S15531=1;
                      if(!fillerStatus_o.isACK()){//sysj\controller.sysj line: 161, column: 4
                        fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 161, column: 4
                        ends[8]=2;
                        ;//sysj\controller.sysj line: 161, column: 4
                        S7712=2;
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
          switch(S7712){
            case 0 : 
              switch(S7696){
                case 0 : 
                  if(!fillerReq_in.isPartnerPresent() || fillerReq_in.isPartnerPreempted()){//sysj\controller.sysj line: 104, column: 3
                    fillerReq_in.setACK(false);//sysj\controller.sysj line: 104, column: 3
                    S7696=1;
                    active[8]=1;
                    ends[8]=1;
                    break RUN;
                  }
                  else {
                    switch(S7691){
                      case 0 : 
                        if(!fillerReq_in.isREQ()){//sysj\controller.sysj line: 104, column: 3
                          fillerReq_in.setACK(true);//sysj\controller.sysj line: 104, column: 3
                          S7691=1;
                          if(fillerReq_in.isREQ()){//sysj\controller.sysj line: 104, column: 3
                            fillerReq_in.setACK(false);//sysj\controller.sysj line: 104, column: 3
                            ends[8]=2;
                            ;//sysj\controller.sysj line: 104, column: 3
                            request_thread_8 = (fillerReq_in.getVal() == null ? null : ((Boolean)fillerReq_in.getVal()));//sysj\controller.sysj line: 105, column: 3
                            S7712=1;
                            if(request_thread_8){//sysj\controller.sysj line: 107, column: 3
                              S15552=0;
                              System.out.println("Filler - received req from orch");//sysj\controller.sysj line: 109, column: 5
                              S7759=0;
                              if(!bottleAtPos2.getprestatus()){//sysj\controller.sysj line: 110, column: 13
                                S7719=0;
                                if(!fillerStatus_o.isPartnerPresent() || fillerStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 111, column: 6
                                  fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 111, column: 6
                                  S7719=1;
                                  active[8]=1;
                                  ends[8]=1;
                                  break RUN;
                                }
                                else {
                                  S7714=0;
                                  if(fillerStatus_o.isACK()){//sysj\controller.sysj line: 111, column: 6
                                    fillerStatus_o.setVal("idle");//sysj\controller.sysj line: 111, column: 6
                                    S7714=1;
                                    if(!fillerStatus_o.isACK()){//sysj\controller.sysj line: 111, column: 6
                                      fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 111, column: 6
                                      ends[8]=2;
                                      ;//sysj\controller.sysj line: 111, column: 6
                                      S7759=1;
                                      if(bottleAtPos2.getprestatus()){//sysj\controller.sysj line: 115, column: 13
                                        System.out.println("Filler - bottle is at pos 2");//sysj\controller.sysj line: 116, column: 6
                                        S7804=0;
                                        S7766=0;
                                        if(!fillerStatus_o.isPartnerPresent() || fillerStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 117, column: 6
                                          fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 117, column: 6
                                          S7766=1;
                                          active[8]=1;
                                          ends[8]=1;
                                          break RUN;
                                        }
                                        else {
                                          S7761=0;
                                          if(fillerStatus_o.isACK()){//sysj\controller.sysj line: 117, column: 6
                                            fillerStatus_o.setVal("busy");//sysj\controller.sysj line: 117, column: 6
                                            S7761=1;
                                            if(!fillerStatus_o.isACK()){//sysj\controller.sysj line: 117, column: 6
                                              fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 117, column: 6
                                              ends[8]=2;
                                              ;//sysj\controller.sysj line: 117, column: 6
                                              S7804=1;
                                              S7811=0;
                                              if(!percentLiquid_in.isPartnerPresent() || percentLiquid_in.isPartnerPreempted()){//sysj\controller.sysj line: 118, column: 6
                                                percentLiquid_in.setACK(false);//sysj\controller.sysj line: 118, column: 6
                                                S7811=1;
                                                active[8]=1;
                                                ends[8]=1;
                                                break RUN;
                                              }
                                              else {
                                                S7806=0;
                                                if(!percentLiquid_in.isREQ()){//sysj\controller.sysj line: 118, column: 6
                                                  percentLiquid_in.setACK(true);//sysj\controller.sysj line: 118, column: 6
                                                  S7806=1;
                                                  if(percentLiquid_in.isREQ()){//sysj\controller.sysj line: 118, column: 6
                                                    percentLiquid_in.setACK(false);//sysj\controller.sysj line: 118, column: 6
                                                    ends[8]=2;
                                                    ;//sysj\controller.sysj line: 118, column: 6
                                                    recPercentLiq_thread_8 = (ArrayList)(percentLiquid_in.getVal() == null ? null : ((ArrayList)percentLiquid_in.getVal()));//sysj\controller.sysj line: 119, column: 6
                                                    canisterNum_thread_8 = 1;//sysj\controller.sysj line: 120, column: 6
                                                    S7804=2;
                                                    if(canisterNum_thread_8 < 5){//sysj\controller.sysj line: 122, column: 12
                                                      S7923=0;
                                                      System.out.println("selecting canister " + canisterNum_thread_8);//sysj\controller.sysj line: 125, column: 8
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
                                                      S7804=3;
                                                      S9165=0;
                                                      if(!fillerStatus_o.isPartnerPresent() || fillerStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 158, column: 6
                                                        fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 158, column: 6
                                                        S9165=1;
                                                        active[8]=1;
                                                        ends[8]=1;
                                                        break RUN;
                                                      }
                                                      else {
                                                        S9160=0;
                                                        if(fillerStatus_o.isACK()){//sysj\controller.sysj line: 158, column: 6
                                                          fillerStatus_o.setVal("done");//sysj\controller.sysj line: 158, column: 6
                                                          S9160=1;
                                                          if(!fillerStatus_o.isACK()){//sysj\controller.sysj line: 158, column: 6
                                                            fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 158, column: 6
                                                            ends[8]=2;
                                                            ;//sysj\controller.sysj line: 158, column: 6
                                                            S7712=2;
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
                                        S7712=2;
                                        active[8]=1;
                                        ends[8]=1;
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
                                S7759=1;
                                if(bottleAtPos2.getprestatus()){//sysj\controller.sysj line: 115, column: 13
                                  System.out.println("Filler - bottle is at pos 2");//sysj\controller.sysj line: 116, column: 6
                                  S7804=0;
                                  S7766=0;
                                  if(!fillerStatus_o.isPartnerPresent() || fillerStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 117, column: 6
                                    fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 117, column: 6
                                    S7766=1;
                                    active[8]=1;
                                    ends[8]=1;
                                    break RUN;
                                  }
                                  else {
                                    S7761=0;
                                    if(fillerStatus_o.isACK()){//sysj\controller.sysj line: 117, column: 6
                                      fillerStatus_o.setVal("busy");//sysj\controller.sysj line: 117, column: 6
                                      S7761=1;
                                      if(!fillerStatus_o.isACK()){//sysj\controller.sysj line: 117, column: 6
                                        fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 117, column: 6
                                        ends[8]=2;
                                        ;//sysj\controller.sysj line: 117, column: 6
                                        S7804=1;
                                        S7811=0;
                                        if(!percentLiquid_in.isPartnerPresent() || percentLiquid_in.isPartnerPreempted()){//sysj\controller.sysj line: 118, column: 6
                                          percentLiquid_in.setACK(false);//sysj\controller.sysj line: 118, column: 6
                                          S7811=1;
                                          active[8]=1;
                                          ends[8]=1;
                                          break RUN;
                                        }
                                        else {
                                          S7806=0;
                                          if(!percentLiquid_in.isREQ()){//sysj\controller.sysj line: 118, column: 6
                                            percentLiquid_in.setACK(true);//sysj\controller.sysj line: 118, column: 6
                                            S7806=1;
                                            if(percentLiquid_in.isREQ()){//sysj\controller.sysj line: 118, column: 6
                                              percentLiquid_in.setACK(false);//sysj\controller.sysj line: 118, column: 6
                                              ends[8]=2;
                                              ;//sysj\controller.sysj line: 118, column: 6
                                              recPercentLiq_thread_8 = (ArrayList)(percentLiquid_in.getVal() == null ? null : ((ArrayList)percentLiquid_in.getVal()));//sysj\controller.sysj line: 119, column: 6
                                              canisterNum_thread_8 = 1;//sysj\controller.sysj line: 120, column: 6
                                              S7804=2;
                                              if(canisterNum_thread_8 < 5){//sysj\controller.sysj line: 122, column: 12
                                                S7923=0;
                                                System.out.println("selecting canister " + canisterNum_thread_8);//sysj\controller.sysj line: 125, column: 8
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
                                                S7804=3;
                                                S9165=0;
                                                if(!fillerStatus_o.isPartnerPresent() || fillerStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 158, column: 6
                                                  fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 158, column: 6
                                                  S9165=1;
                                                  active[8]=1;
                                                  ends[8]=1;
                                                  break RUN;
                                                }
                                                else {
                                                  S9160=0;
                                                  if(fillerStatus_o.isACK()){//sysj\controller.sysj line: 158, column: 6
                                                    fillerStatus_o.setVal("done");//sysj\controller.sysj line: 158, column: 6
                                                    S9160=1;
                                                    if(!fillerStatus_o.isACK()){//sysj\controller.sysj line: 158, column: 6
                                                      fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 158, column: 6
                                                      ends[8]=2;
                                                      ;//sysj\controller.sysj line: 158, column: 6
                                                      S7712=2;
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
                                  S7712=2;
                                  active[8]=1;
                                  ends[8]=1;
                                  break RUN;
                                }
                              }
                            }
                            else {
                              S15552=1;
                              S15536=0;
                              if(!fillerStatus_o.isPartnerPresent() || fillerStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 161, column: 4
                                fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 161, column: 4
                                S15536=1;
                                active[8]=1;
                                ends[8]=1;
                                break RUN;
                              }
                              else {
                                S15531=0;
                                if(fillerStatus_o.isACK()){//sysj\controller.sysj line: 161, column: 4
                                  fillerStatus_o.setVal("idle");//sysj\controller.sysj line: 161, column: 4
                                  S15531=1;
                                  if(!fillerStatus_o.isACK()){//sysj\controller.sysj line: 161, column: 4
                                    fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 161, column: 4
                                    ends[8]=2;
                                    ;//sysj\controller.sysj line: 161, column: 4
                                    S7712=2;
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
                        if(fillerReq_in.isREQ()){//sysj\controller.sysj line: 104, column: 3
                          fillerReq_in.setACK(false);//sysj\controller.sysj line: 104, column: 3
                          ends[8]=2;
                          ;//sysj\controller.sysj line: 104, column: 3
                          request_thread_8 = (fillerReq_in.getVal() == null ? null : ((Boolean)fillerReq_in.getVal()));//sysj\controller.sysj line: 105, column: 3
                          S7712=1;
                          if(request_thread_8){//sysj\controller.sysj line: 107, column: 3
                            S15552=0;
                            System.out.println("Filler - received req from orch");//sysj\controller.sysj line: 109, column: 5
                            S7759=0;
                            if(!bottleAtPos2.getprestatus()){//sysj\controller.sysj line: 110, column: 13
                              S7719=0;
                              if(!fillerStatus_o.isPartnerPresent() || fillerStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 111, column: 6
                                fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 111, column: 6
                                S7719=1;
                                active[8]=1;
                                ends[8]=1;
                                break RUN;
                              }
                              else {
                                S7714=0;
                                if(fillerStatus_o.isACK()){//sysj\controller.sysj line: 111, column: 6
                                  fillerStatus_o.setVal("idle");//sysj\controller.sysj line: 111, column: 6
                                  S7714=1;
                                  if(!fillerStatus_o.isACK()){//sysj\controller.sysj line: 111, column: 6
                                    fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 111, column: 6
                                    ends[8]=2;
                                    ;//sysj\controller.sysj line: 111, column: 6
                                    S7759=1;
                                    if(bottleAtPos2.getprestatus()){//sysj\controller.sysj line: 115, column: 13
                                      System.out.println("Filler - bottle is at pos 2");//sysj\controller.sysj line: 116, column: 6
                                      S7804=0;
                                      S7766=0;
                                      if(!fillerStatus_o.isPartnerPresent() || fillerStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 117, column: 6
                                        fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 117, column: 6
                                        S7766=1;
                                        active[8]=1;
                                        ends[8]=1;
                                        break RUN;
                                      }
                                      else {
                                        S7761=0;
                                        if(fillerStatus_o.isACK()){//sysj\controller.sysj line: 117, column: 6
                                          fillerStatus_o.setVal("busy");//sysj\controller.sysj line: 117, column: 6
                                          S7761=1;
                                          if(!fillerStatus_o.isACK()){//sysj\controller.sysj line: 117, column: 6
                                            fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 117, column: 6
                                            ends[8]=2;
                                            ;//sysj\controller.sysj line: 117, column: 6
                                            S7804=1;
                                            S7811=0;
                                            if(!percentLiquid_in.isPartnerPresent() || percentLiquid_in.isPartnerPreempted()){//sysj\controller.sysj line: 118, column: 6
                                              percentLiquid_in.setACK(false);//sysj\controller.sysj line: 118, column: 6
                                              S7811=1;
                                              active[8]=1;
                                              ends[8]=1;
                                              break RUN;
                                            }
                                            else {
                                              S7806=0;
                                              if(!percentLiquid_in.isREQ()){//sysj\controller.sysj line: 118, column: 6
                                                percentLiquid_in.setACK(true);//sysj\controller.sysj line: 118, column: 6
                                                S7806=1;
                                                if(percentLiquid_in.isREQ()){//sysj\controller.sysj line: 118, column: 6
                                                  percentLiquid_in.setACK(false);//sysj\controller.sysj line: 118, column: 6
                                                  ends[8]=2;
                                                  ;//sysj\controller.sysj line: 118, column: 6
                                                  recPercentLiq_thread_8 = (ArrayList)(percentLiquid_in.getVal() == null ? null : ((ArrayList)percentLiquid_in.getVal()));//sysj\controller.sysj line: 119, column: 6
                                                  canisterNum_thread_8 = 1;//sysj\controller.sysj line: 120, column: 6
                                                  S7804=2;
                                                  if(canisterNum_thread_8 < 5){//sysj\controller.sysj line: 122, column: 12
                                                    S7923=0;
                                                    System.out.println("selecting canister " + canisterNum_thread_8);//sysj\controller.sysj line: 125, column: 8
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
                                                    S7804=3;
                                                    S9165=0;
                                                    if(!fillerStatus_o.isPartnerPresent() || fillerStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 158, column: 6
                                                      fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 158, column: 6
                                                      S9165=1;
                                                      active[8]=1;
                                                      ends[8]=1;
                                                      break RUN;
                                                    }
                                                    else {
                                                      S9160=0;
                                                      if(fillerStatus_o.isACK()){//sysj\controller.sysj line: 158, column: 6
                                                        fillerStatus_o.setVal("done");//sysj\controller.sysj line: 158, column: 6
                                                        S9160=1;
                                                        if(!fillerStatus_o.isACK()){//sysj\controller.sysj line: 158, column: 6
                                                          fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 158, column: 6
                                                          ends[8]=2;
                                                          ;//sysj\controller.sysj line: 158, column: 6
                                                          S7712=2;
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
                                      S7712=2;
                                      active[8]=1;
                                      ends[8]=1;
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
                              S7759=1;
                              if(bottleAtPos2.getprestatus()){//sysj\controller.sysj line: 115, column: 13
                                System.out.println("Filler - bottle is at pos 2");//sysj\controller.sysj line: 116, column: 6
                                S7804=0;
                                S7766=0;
                                if(!fillerStatus_o.isPartnerPresent() || fillerStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 117, column: 6
                                  fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 117, column: 6
                                  S7766=1;
                                  active[8]=1;
                                  ends[8]=1;
                                  break RUN;
                                }
                                else {
                                  S7761=0;
                                  if(fillerStatus_o.isACK()){//sysj\controller.sysj line: 117, column: 6
                                    fillerStatus_o.setVal("busy");//sysj\controller.sysj line: 117, column: 6
                                    S7761=1;
                                    if(!fillerStatus_o.isACK()){//sysj\controller.sysj line: 117, column: 6
                                      fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 117, column: 6
                                      ends[8]=2;
                                      ;//sysj\controller.sysj line: 117, column: 6
                                      S7804=1;
                                      S7811=0;
                                      if(!percentLiquid_in.isPartnerPresent() || percentLiquid_in.isPartnerPreempted()){//sysj\controller.sysj line: 118, column: 6
                                        percentLiquid_in.setACK(false);//sysj\controller.sysj line: 118, column: 6
                                        S7811=1;
                                        active[8]=1;
                                        ends[8]=1;
                                        break RUN;
                                      }
                                      else {
                                        S7806=0;
                                        if(!percentLiquid_in.isREQ()){//sysj\controller.sysj line: 118, column: 6
                                          percentLiquid_in.setACK(true);//sysj\controller.sysj line: 118, column: 6
                                          S7806=1;
                                          if(percentLiquid_in.isREQ()){//sysj\controller.sysj line: 118, column: 6
                                            percentLiquid_in.setACK(false);//sysj\controller.sysj line: 118, column: 6
                                            ends[8]=2;
                                            ;//sysj\controller.sysj line: 118, column: 6
                                            recPercentLiq_thread_8 = (ArrayList)(percentLiquid_in.getVal() == null ? null : ((ArrayList)percentLiquid_in.getVal()));//sysj\controller.sysj line: 119, column: 6
                                            canisterNum_thread_8 = 1;//sysj\controller.sysj line: 120, column: 6
                                            S7804=2;
                                            if(canisterNum_thread_8 < 5){//sysj\controller.sysj line: 122, column: 12
                                              S7923=0;
                                              System.out.println("selecting canister " + canisterNum_thread_8);//sysj\controller.sysj line: 125, column: 8
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
                                              S7804=3;
                                              S9165=0;
                                              if(!fillerStatus_o.isPartnerPresent() || fillerStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 158, column: 6
                                                fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 158, column: 6
                                                S9165=1;
                                                active[8]=1;
                                                ends[8]=1;
                                                break RUN;
                                              }
                                              else {
                                                S9160=0;
                                                if(fillerStatus_o.isACK()){//sysj\controller.sysj line: 158, column: 6
                                                  fillerStatus_o.setVal("done");//sysj\controller.sysj line: 158, column: 6
                                                  S9160=1;
                                                  if(!fillerStatus_o.isACK()){//sysj\controller.sysj line: 158, column: 6
                                                    fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 158, column: 6
                                                    ends[8]=2;
                                                    ;//sysj\controller.sysj line: 158, column: 6
                                                    S7712=2;
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
                                S7712=2;
                                active[8]=1;
                                ends[8]=1;
                                break RUN;
                              }
                            }
                          }
                          else {
                            S15552=1;
                            S15536=0;
                            if(!fillerStatus_o.isPartnerPresent() || fillerStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 161, column: 4
                              fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 161, column: 4
                              S15536=1;
                              active[8]=1;
                              ends[8]=1;
                              break RUN;
                            }
                            else {
                              S15531=0;
                              if(fillerStatus_o.isACK()){//sysj\controller.sysj line: 161, column: 4
                                fillerStatus_o.setVal("idle");//sysj\controller.sysj line: 161, column: 4
                                S15531=1;
                                if(!fillerStatus_o.isACK()){//sysj\controller.sysj line: 161, column: 4
                                  fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 161, column: 4
                                  ends[8]=2;
                                  ;//sysj\controller.sysj line: 161, column: 4
                                  S7712=2;
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
                  S7696=1;
                  S7696=0;
                  if(!fillerReq_in.isPartnerPresent() || fillerReq_in.isPartnerPreempted()){//sysj\controller.sysj line: 104, column: 3
                    fillerReq_in.setACK(false);//sysj\controller.sysj line: 104, column: 3
                    S7696=1;
                    active[8]=1;
                    ends[8]=1;
                    break RUN;
                  }
                  else {
                    S7691=0;
                    if(!fillerReq_in.isREQ()){//sysj\controller.sysj line: 104, column: 3
                      fillerReq_in.setACK(true);//sysj\controller.sysj line: 104, column: 3
                      S7691=1;
                      if(fillerReq_in.isREQ()){//sysj\controller.sysj line: 104, column: 3
                        fillerReq_in.setACK(false);//sysj\controller.sysj line: 104, column: 3
                        ends[8]=2;
                        ;//sysj\controller.sysj line: 104, column: 3
                        request_thread_8 = (fillerReq_in.getVal() == null ? null : ((Boolean)fillerReq_in.getVal()));//sysj\controller.sysj line: 105, column: 3
                        S7712=1;
                        if(request_thread_8){//sysj\controller.sysj line: 107, column: 3
                          S15552=0;
                          System.out.println("Filler - received req from orch");//sysj\controller.sysj line: 109, column: 5
                          S7759=0;
                          if(!bottleAtPos2.getprestatus()){//sysj\controller.sysj line: 110, column: 13
                            S7719=0;
                            if(!fillerStatus_o.isPartnerPresent() || fillerStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 111, column: 6
                              fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 111, column: 6
                              S7719=1;
                              active[8]=1;
                              ends[8]=1;
                              break RUN;
                            }
                            else {
                              S7714=0;
                              if(fillerStatus_o.isACK()){//sysj\controller.sysj line: 111, column: 6
                                fillerStatus_o.setVal("idle");//sysj\controller.sysj line: 111, column: 6
                                S7714=1;
                                if(!fillerStatus_o.isACK()){//sysj\controller.sysj line: 111, column: 6
                                  fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 111, column: 6
                                  ends[8]=2;
                                  ;//sysj\controller.sysj line: 111, column: 6
                                  S7759=1;
                                  if(bottleAtPos2.getprestatus()){//sysj\controller.sysj line: 115, column: 13
                                    System.out.println("Filler - bottle is at pos 2");//sysj\controller.sysj line: 116, column: 6
                                    S7804=0;
                                    S7766=0;
                                    if(!fillerStatus_o.isPartnerPresent() || fillerStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 117, column: 6
                                      fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 117, column: 6
                                      S7766=1;
                                      active[8]=1;
                                      ends[8]=1;
                                      break RUN;
                                    }
                                    else {
                                      S7761=0;
                                      if(fillerStatus_o.isACK()){//sysj\controller.sysj line: 117, column: 6
                                        fillerStatus_o.setVal("busy");//sysj\controller.sysj line: 117, column: 6
                                        S7761=1;
                                        if(!fillerStatus_o.isACK()){//sysj\controller.sysj line: 117, column: 6
                                          fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 117, column: 6
                                          ends[8]=2;
                                          ;//sysj\controller.sysj line: 117, column: 6
                                          S7804=1;
                                          S7811=0;
                                          if(!percentLiquid_in.isPartnerPresent() || percentLiquid_in.isPartnerPreempted()){//sysj\controller.sysj line: 118, column: 6
                                            percentLiquid_in.setACK(false);//sysj\controller.sysj line: 118, column: 6
                                            S7811=1;
                                            active[8]=1;
                                            ends[8]=1;
                                            break RUN;
                                          }
                                          else {
                                            S7806=0;
                                            if(!percentLiquid_in.isREQ()){//sysj\controller.sysj line: 118, column: 6
                                              percentLiquid_in.setACK(true);//sysj\controller.sysj line: 118, column: 6
                                              S7806=1;
                                              if(percentLiquid_in.isREQ()){//sysj\controller.sysj line: 118, column: 6
                                                percentLiquid_in.setACK(false);//sysj\controller.sysj line: 118, column: 6
                                                ends[8]=2;
                                                ;//sysj\controller.sysj line: 118, column: 6
                                                recPercentLiq_thread_8 = (ArrayList)(percentLiquid_in.getVal() == null ? null : ((ArrayList)percentLiquid_in.getVal()));//sysj\controller.sysj line: 119, column: 6
                                                canisterNum_thread_8 = 1;//sysj\controller.sysj line: 120, column: 6
                                                S7804=2;
                                                if(canisterNum_thread_8 < 5){//sysj\controller.sysj line: 122, column: 12
                                                  S7923=0;
                                                  System.out.println("selecting canister " + canisterNum_thread_8);//sysj\controller.sysj line: 125, column: 8
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
                                                  S7804=3;
                                                  S9165=0;
                                                  if(!fillerStatus_o.isPartnerPresent() || fillerStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 158, column: 6
                                                    fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 158, column: 6
                                                    S9165=1;
                                                    active[8]=1;
                                                    ends[8]=1;
                                                    break RUN;
                                                  }
                                                  else {
                                                    S9160=0;
                                                    if(fillerStatus_o.isACK()){//sysj\controller.sysj line: 158, column: 6
                                                      fillerStatus_o.setVal("done");//sysj\controller.sysj line: 158, column: 6
                                                      S9160=1;
                                                      if(!fillerStatus_o.isACK()){//sysj\controller.sysj line: 158, column: 6
                                                        fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 158, column: 6
                                                        ends[8]=2;
                                                        ;//sysj\controller.sysj line: 158, column: 6
                                                        S7712=2;
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
                                    S7712=2;
                                    active[8]=1;
                                    ends[8]=1;
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
                            S7759=1;
                            if(bottleAtPos2.getprestatus()){//sysj\controller.sysj line: 115, column: 13
                              System.out.println("Filler - bottle is at pos 2");//sysj\controller.sysj line: 116, column: 6
                              S7804=0;
                              S7766=0;
                              if(!fillerStatus_o.isPartnerPresent() || fillerStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 117, column: 6
                                fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 117, column: 6
                                S7766=1;
                                active[8]=1;
                                ends[8]=1;
                                break RUN;
                              }
                              else {
                                S7761=0;
                                if(fillerStatus_o.isACK()){//sysj\controller.sysj line: 117, column: 6
                                  fillerStatus_o.setVal("busy");//sysj\controller.sysj line: 117, column: 6
                                  S7761=1;
                                  if(!fillerStatus_o.isACK()){//sysj\controller.sysj line: 117, column: 6
                                    fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 117, column: 6
                                    ends[8]=2;
                                    ;//sysj\controller.sysj line: 117, column: 6
                                    S7804=1;
                                    S7811=0;
                                    if(!percentLiquid_in.isPartnerPresent() || percentLiquid_in.isPartnerPreempted()){//sysj\controller.sysj line: 118, column: 6
                                      percentLiquid_in.setACK(false);//sysj\controller.sysj line: 118, column: 6
                                      S7811=1;
                                      active[8]=1;
                                      ends[8]=1;
                                      break RUN;
                                    }
                                    else {
                                      S7806=0;
                                      if(!percentLiquid_in.isREQ()){//sysj\controller.sysj line: 118, column: 6
                                        percentLiquid_in.setACK(true);//sysj\controller.sysj line: 118, column: 6
                                        S7806=1;
                                        if(percentLiquid_in.isREQ()){//sysj\controller.sysj line: 118, column: 6
                                          percentLiquid_in.setACK(false);//sysj\controller.sysj line: 118, column: 6
                                          ends[8]=2;
                                          ;//sysj\controller.sysj line: 118, column: 6
                                          recPercentLiq_thread_8 = (ArrayList)(percentLiquid_in.getVal() == null ? null : ((ArrayList)percentLiquid_in.getVal()));//sysj\controller.sysj line: 119, column: 6
                                          canisterNum_thread_8 = 1;//sysj\controller.sysj line: 120, column: 6
                                          S7804=2;
                                          if(canisterNum_thread_8 < 5){//sysj\controller.sysj line: 122, column: 12
                                            S7923=0;
                                            System.out.println("selecting canister " + canisterNum_thread_8);//sysj\controller.sysj line: 125, column: 8
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
                                            S7804=3;
                                            S9165=0;
                                            if(!fillerStatus_o.isPartnerPresent() || fillerStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 158, column: 6
                                              fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 158, column: 6
                                              S9165=1;
                                              active[8]=1;
                                              ends[8]=1;
                                              break RUN;
                                            }
                                            else {
                                              S9160=0;
                                              if(fillerStatus_o.isACK()){//sysj\controller.sysj line: 158, column: 6
                                                fillerStatus_o.setVal("done");//sysj\controller.sysj line: 158, column: 6
                                                S9160=1;
                                                if(!fillerStatus_o.isACK()){//sysj\controller.sysj line: 158, column: 6
                                                  fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 158, column: 6
                                                  ends[8]=2;
                                                  ;//sysj\controller.sysj line: 158, column: 6
                                                  S7712=2;
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
                              S7712=2;
                              active[8]=1;
                              ends[8]=1;
                              break RUN;
                            }
                          }
                        }
                        else {
                          S15552=1;
                          S15536=0;
                          if(!fillerStatus_o.isPartnerPresent() || fillerStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 161, column: 4
                            fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 161, column: 4
                            S15536=1;
                            active[8]=1;
                            ends[8]=1;
                            break RUN;
                          }
                          else {
                            S15531=0;
                            if(fillerStatus_o.isACK()){//sysj\controller.sysj line: 161, column: 4
                              fillerStatus_o.setVal("idle");//sysj\controller.sysj line: 161, column: 4
                              S15531=1;
                              if(!fillerStatus_o.isACK()){//sysj\controller.sysj line: 161, column: 4
                                fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 161, column: 4
                                ends[8]=2;
                                ;//sysj\controller.sysj line: 161, column: 4
                                S7712=2;
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
              switch(S15552){
                case 0 : 
                  switch(S7759){
                    case 0 : 
                      switch(S7719){
                        case 0 : 
                          if(!fillerStatus_o.isPartnerPresent() || fillerStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 111, column: 6
                            fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 111, column: 6
                            S7719=1;
                            active[8]=1;
                            ends[8]=1;
                            break RUN;
                          }
                          else {
                            switch(S7714){
                              case 0 : 
                                if(fillerStatus_o.isACK()){//sysj\controller.sysj line: 111, column: 6
                                  fillerStatus_o.setVal("idle");//sysj\controller.sysj line: 111, column: 6
                                  S7714=1;
                                  if(!fillerStatus_o.isACK()){//sysj\controller.sysj line: 111, column: 6
                                    fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 111, column: 6
                                    ends[8]=2;
                                    ;//sysj\controller.sysj line: 111, column: 6
                                    S7759=1;
                                    if(bottleAtPos2.getprestatus()){//sysj\controller.sysj line: 115, column: 13
                                      System.out.println("Filler - bottle is at pos 2");//sysj\controller.sysj line: 116, column: 6
                                      S7804=0;
                                      S7766=0;
                                      if(!fillerStatus_o.isPartnerPresent() || fillerStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 117, column: 6
                                        fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 117, column: 6
                                        S7766=1;
                                        active[8]=1;
                                        ends[8]=1;
                                        break RUN;
                                      }
                                      else {
                                        S7761=0;
                                        if(fillerStatus_o.isACK()){//sysj\controller.sysj line: 117, column: 6
                                          fillerStatus_o.setVal("busy");//sysj\controller.sysj line: 117, column: 6
                                          S7761=1;
                                          if(!fillerStatus_o.isACK()){//sysj\controller.sysj line: 117, column: 6
                                            fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 117, column: 6
                                            ends[8]=2;
                                            ;//sysj\controller.sysj line: 117, column: 6
                                            S7804=1;
                                            S7811=0;
                                            if(!percentLiquid_in.isPartnerPresent() || percentLiquid_in.isPartnerPreempted()){//sysj\controller.sysj line: 118, column: 6
                                              percentLiquid_in.setACK(false);//sysj\controller.sysj line: 118, column: 6
                                              S7811=1;
                                              active[8]=1;
                                              ends[8]=1;
                                              break RUN;
                                            }
                                            else {
                                              S7806=0;
                                              if(!percentLiquid_in.isREQ()){//sysj\controller.sysj line: 118, column: 6
                                                percentLiquid_in.setACK(true);//sysj\controller.sysj line: 118, column: 6
                                                S7806=1;
                                                if(percentLiquid_in.isREQ()){//sysj\controller.sysj line: 118, column: 6
                                                  percentLiquid_in.setACK(false);//sysj\controller.sysj line: 118, column: 6
                                                  ends[8]=2;
                                                  ;//sysj\controller.sysj line: 118, column: 6
                                                  recPercentLiq_thread_8 = (ArrayList)(percentLiquid_in.getVal() == null ? null : ((ArrayList)percentLiquid_in.getVal()));//sysj\controller.sysj line: 119, column: 6
                                                  canisterNum_thread_8 = 1;//sysj\controller.sysj line: 120, column: 6
                                                  S7804=2;
                                                  if(canisterNum_thread_8 < 5){//sysj\controller.sysj line: 122, column: 12
                                                    S7923=0;
                                                    System.out.println("selecting canister " + canisterNum_thread_8);//sysj\controller.sysj line: 125, column: 8
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
                                                    S7804=3;
                                                    S9165=0;
                                                    if(!fillerStatus_o.isPartnerPresent() || fillerStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 158, column: 6
                                                      fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 158, column: 6
                                                      S9165=1;
                                                      active[8]=1;
                                                      ends[8]=1;
                                                      break RUN;
                                                    }
                                                    else {
                                                      S9160=0;
                                                      if(fillerStatus_o.isACK()){//sysj\controller.sysj line: 158, column: 6
                                                        fillerStatus_o.setVal("done");//sysj\controller.sysj line: 158, column: 6
                                                        S9160=1;
                                                        if(!fillerStatus_o.isACK()){//sysj\controller.sysj line: 158, column: 6
                                                          fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 158, column: 6
                                                          ends[8]=2;
                                                          ;//sysj\controller.sysj line: 158, column: 6
                                                          S7712=2;
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
                                      S7712=2;
                                      active[8]=1;
                                      ends[8]=1;
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
                                if(!fillerStatus_o.isACK()){//sysj\controller.sysj line: 111, column: 6
                                  fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 111, column: 6
                                  ends[8]=2;
                                  ;//sysj\controller.sysj line: 111, column: 6
                                  S7759=1;
                                  if(bottleAtPos2.getprestatus()){//sysj\controller.sysj line: 115, column: 13
                                    System.out.println("Filler - bottle is at pos 2");//sysj\controller.sysj line: 116, column: 6
                                    S7804=0;
                                    S7766=0;
                                    if(!fillerStatus_o.isPartnerPresent() || fillerStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 117, column: 6
                                      fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 117, column: 6
                                      S7766=1;
                                      active[8]=1;
                                      ends[8]=1;
                                      break RUN;
                                    }
                                    else {
                                      S7761=0;
                                      if(fillerStatus_o.isACK()){//sysj\controller.sysj line: 117, column: 6
                                        fillerStatus_o.setVal("busy");//sysj\controller.sysj line: 117, column: 6
                                        S7761=1;
                                        if(!fillerStatus_o.isACK()){//sysj\controller.sysj line: 117, column: 6
                                          fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 117, column: 6
                                          ends[8]=2;
                                          ;//sysj\controller.sysj line: 117, column: 6
                                          S7804=1;
                                          S7811=0;
                                          if(!percentLiquid_in.isPartnerPresent() || percentLiquid_in.isPartnerPreempted()){//sysj\controller.sysj line: 118, column: 6
                                            percentLiquid_in.setACK(false);//sysj\controller.sysj line: 118, column: 6
                                            S7811=1;
                                            active[8]=1;
                                            ends[8]=1;
                                            break RUN;
                                          }
                                          else {
                                            S7806=0;
                                            if(!percentLiquid_in.isREQ()){//sysj\controller.sysj line: 118, column: 6
                                              percentLiquid_in.setACK(true);//sysj\controller.sysj line: 118, column: 6
                                              S7806=1;
                                              if(percentLiquid_in.isREQ()){//sysj\controller.sysj line: 118, column: 6
                                                percentLiquid_in.setACK(false);//sysj\controller.sysj line: 118, column: 6
                                                ends[8]=2;
                                                ;//sysj\controller.sysj line: 118, column: 6
                                                recPercentLiq_thread_8 = (ArrayList)(percentLiquid_in.getVal() == null ? null : ((ArrayList)percentLiquid_in.getVal()));//sysj\controller.sysj line: 119, column: 6
                                                canisterNum_thread_8 = 1;//sysj\controller.sysj line: 120, column: 6
                                                S7804=2;
                                                if(canisterNum_thread_8 < 5){//sysj\controller.sysj line: 122, column: 12
                                                  S7923=0;
                                                  System.out.println("selecting canister " + canisterNum_thread_8);//sysj\controller.sysj line: 125, column: 8
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
                                                  S7804=3;
                                                  S9165=0;
                                                  if(!fillerStatus_o.isPartnerPresent() || fillerStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 158, column: 6
                                                    fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 158, column: 6
                                                    S9165=1;
                                                    active[8]=1;
                                                    ends[8]=1;
                                                    break RUN;
                                                  }
                                                  else {
                                                    S9160=0;
                                                    if(fillerStatus_o.isACK()){//sysj\controller.sysj line: 158, column: 6
                                                      fillerStatus_o.setVal("done");//sysj\controller.sysj line: 158, column: 6
                                                      S9160=1;
                                                      if(!fillerStatus_o.isACK()){//sysj\controller.sysj line: 158, column: 6
                                                        fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 158, column: 6
                                                        ends[8]=2;
                                                        ;//sysj\controller.sysj line: 158, column: 6
                                                        S7712=2;
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
                                    S7712=2;
                                    active[8]=1;
                                    ends[8]=1;
                                    break RUN;
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
                          S7719=1;
                          S7719=0;
                          if(!fillerStatus_o.isPartnerPresent() || fillerStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 111, column: 6
                            fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 111, column: 6
                            S7719=1;
                            active[8]=1;
                            ends[8]=1;
                            break RUN;
                          }
                          else {
                            S7714=0;
                            if(fillerStatus_o.isACK()){//sysj\controller.sysj line: 111, column: 6
                              fillerStatus_o.setVal("idle");//sysj\controller.sysj line: 111, column: 6
                              S7714=1;
                              if(!fillerStatus_o.isACK()){//sysj\controller.sysj line: 111, column: 6
                                fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 111, column: 6
                                ends[8]=2;
                                ;//sysj\controller.sysj line: 111, column: 6
                                S7759=1;
                                if(bottleAtPos2.getprestatus()){//sysj\controller.sysj line: 115, column: 13
                                  System.out.println("Filler - bottle is at pos 2");//sysj\controller.sysj line: 116, column: 6
                                  S7804=0;
                                  S7766=0;
                                  if(!fillerStatus_o.isPartnerPresent() || fillerStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 117, column: 6
                                    fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 117, column: 6
                                    S7766=1;
                                    active[8]=1;
                                    ends[8]=1;
                                    break RUN;
                                  }
                                  else {
                                    S7761=0;
                                    if(fillerStatus_o.isACK()){//sysj\controller.sysj line: 117, column: 6
                                      fillerStatus_o.setVal("busy");//sysj\controller.sysj line: 117, column: 6
                                      S7761=1;
                                      if(!fillerStatus_o.isACK()){//sysj\controller.sysj line: 117, column: 6
                                        fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 117, column: 6
                                        ends[8]=2;
                                        ;//sysj\controller.sysj line: 117, column: 6
                                        S7804=1;
                                        S7811=0;
                                        if(!percentLiquid_in.isPartnerPresent() || percentLiquid_in.isPartnerPreempted()){//sysj\controller.sysj line: 118, column: 6
                                          percentLiquid_in.setACK(false);//sysj\controller.sysj line: 118, column: 6
                                          S7811=1;
                                          active[8]=1;
                                          ends[8]=1;
                                          break RUN;
                                        }
                                        else {
                                          S7806=0;
                                          if(!percentLiquid_in.isREQ()){//sysj\controller.sysj line: 118, column: 6
                                            percentLiquid_in.setACK(true);//sysj\controller.sysj line: 118, column: 6
                                            S7806=1;
                                            if(percentLiquid_in.isREQ()){//sysj\controller.sysj line: 118, column: 6
                                              percentLiquid_in.setACK(false);//sysj\controller.sysj line: 118, column: 6
                                              ends[8]=2;
                                              ;//sysj\controller.sysj line: 118, column: 6
                                              recPercentLiq_thread_8 = (ArrayList)(percentLiquid_in.getVal() == null ? null : ((ArrayList)percentLiquid_in.getVal()));//sysj\controller.sysj line: 119, column: 6
                                              canisterNum_thread_8 = 1;//sysj\controller.sysj line: 120, column: 6
                                              S7804=2;
                                              if(canisterNum_thread_8 < 5){//sysj\controller.sysj line: 122, column: 12
                                                S7923=0;
                                                System.out.println("selecting canister " + canisterNum_thread_8);//sysj\controller.sysj line: 125, column: 8
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
                                                S7804=3;
                                                S9165=0;
                                                if(!fillerStatus_o.isPartnerPresent() || fillerStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 158, column: 6
                                                  fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 158, column: 6
                                                  S9165=1;
                                                  active[8]=1;
                                                  ends[8]=1;
                                                  break RUN;
                                                }
                                                else {
                                                  S9160=0;
                                                  if(fillerStatus_o.isACK()){//sysj\controller.sysj line: 158, column: 6
                                                    fillerStatus_o.setVal("done");//sysj\controller.sysj line: 158, column: 6
                                                    S9160=1;
                                                    if(!fillerStatus_o.isACK()){//sysj\controller.sysj line: 158, column: 6
                                                      fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 158, column: 6
                                                      ends[8]=2;
                                                      ;//sysj\controller.sysj line: 158, column: 6
                                                      S7712=2;
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
                                  S7712=2;
                                  active[8]=1;
                                  ends[8]=1;
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
                      switch(S7804){
                        case 0 : 
                          switch(S7766){
                            case 0 : 
                              if(!fillerStatus_o.isPartnerPresent() || fillerStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 117, column: 6
                                fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 117, column: 6
                                S7766=1;
                                active[8]=1;
                                ends[8]=1;
                                break RUN;
                              }
                              else {
                                switch(S7761){
                                  case 0 : 
                                    if(fillerStatus_o.isACK()){//sysj\controller.sysj line: 117, column: 6
                                      fillerStatus_o.setVal("busy");//sysj\controller.sysj line: 117, column: 6
                                      S7761=1;
                                      if(!fillerStatus_o.isACK()){//sysj\controller.sysj line: 117, column: 6
                                        fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 117, column: 6
                                        ends[8]=2;
                                        ;//sysj\controller.sysj line: 117, column: 6
                                        S7804=1;
                                        S7811=0;
                                        if(!percentLiquid_in.isPartnerPresent() || percentLiquid_in.isPartnerPreempted()){//sysj\controller.sysj line: 118, column: 6
                                          percentLiquid_in.setACK(false);//sysj\controller.sysj line: 118, column: 6
                                          S7811=1;
                                          active[8]=1;
                                          ends[8]=1;
                                          break RUN;
                                        }
                                        else {
                                          S7806=0;
                                          if(!percentLiquid_in.isREQ()){//sysj\controller.sysj line: 118, column: 6
                                            percentLiquid_in.setACK(true);//sysj\controller.sysj line: 118, column: 6
                                            S7806=1;
                                            if(percentLiquid_in.isREQ()){//sysj\controller.sysj line: 118, column: 6
                                              percentLiquid_in.setACK(false);//sysj\controller.sysj line: 118, column: 6
                                              ends[8]=2;
                                              ;//sysj\controller.sysj line: 118, column: 6
                                              recPercentLiq_thread_8 = (ArrayList)(percentLiquid_in.getVal() == null ? null : ((ArrayList)percentLiquid_in.getVal()));//sysj\controller.sysj line: 119, column: 6
                                              canisterNum_thread_8 = 1;//sysj\controller.sysj line: 120, column: 6
                                              S7804=2;
                                              if(canisterNum_thread_8 < 5){//sysj\controller.sysj line: 122, column: 12
                                                S7923=0;
                                                System.out.println("selecting canister " + canisterNum_thread_8);//sysj\controller.sysj line: 125, column: 8
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
                                                S7804=3;
                                                S9165=0;
                                                if(!fillerStatus_o.isPartnerPresent() || fillerStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 158, column: 6
                                                  fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 158, column: 6
                                                  S9165=1;
                                                  active[8]=1;
                                                  ends[8]=1;
                                                  break RUN;
                                                }
                                                else {
                                                  S9160=0;
                                                  if(fillerStatus_o.isACK()){//sysj\controller.sysj line: 158, column: 6
                                                    fillerStatus_o.setVal("done");//sysj\controller.sysj line: 158, column: 6
                                                    S9160=1;
                                                    if(!fillerStatus_o.isACK()){//sysj\controller.sysj line: 158, column: 6
                                                      fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 158, column: 6
                                                      ends[8]=2;
                                                      ;//sysj\controller.sysj line: 158, column: 6
                                                      S7712=2;
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
                                      S7804=1;
                                      S7811=0;
                                      if(!percentLiquid_in.isPartnerPresent() || percentLiquid_in.isPartnerPreempted()){//sysj\controller.sysj line: 118, column: 6
                                        percentLiquid_in.setACK(false);//sysj\controller.sysj line: 118, column: 6
                                        S7811=1;
                                        active[8]=1;
                                        ends[8]=1;
                                        break RUN;
                                      }
                                      else {
                                        S7806=0;
                                        if(!percentLiquid_in.isREQ()){//sysj\controller.sysj line: 118, column: 6
                                          percentLiquid_in.setACK(true);//sysj\controller.sysj line: 118, column: 6
                                          S7806=1;
                                          if(percentLiquid_in.isREQ()){//sysj\controller.sysj line: 118, column: 6
                                            percentLiquid_in.setACK(false);//sysj\controller.sysj line: 118, column: 6
                                            ends[8]=2;
                                            ;//sysj\controller.sysj line: 118, column: 6
                                            recPercentLiq_thread_8 = (ArrayList)(percentLiquid_in.getVal() == null ? null : ((ArrayList)percentLiquid_in.getVal()));//sysj\controller.sysj line: 119, column: 6
                                            canisterNum_thread_8 = 1;//sysj\controller.sysj line: 120, column: 6
                                            S7804=2;
                                            if(canisterNum_thread_8 < 5){//sysj\controller.sysj line: 122, column: 12
                                              S7923=0;
                                              System.out.println("selecting canister " + canisterNum_thread_8);//sysj\controller.sysj line: 125, column: 8
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
                                              S7804=3;
                                              S9165=0;
                                              if(!fillerStatus_o.isPartnerPresent() || fillerStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 158, column: 6
                                                fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 158, column: 6
                                                S9165=1;
                                                active[8]=1;
                                                ends[8]=1;
                                                break RUN;
                                              }
                                              else {
                                                S9160=0;
                                                if(fillerStatus_o.isACK()){//sysj\controller.sysj line: 158, column: 6
                                                  fillerStatus_o.setVal("done");//sysj\controller.sysj line: 158, column: 6
                                                  S9160=1;
                                                  if(!fillerStatus_o.isACK()){//sysj\controller.sysj line: 158, column: 6
                                                    fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 158, column: 6
                                                    ends[8]=2;
                                                    ;//sysj\controller.sysj line: 158, column: 6
                                                    S7712=2;
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
                              S7766=1;
                              S7766=0;
                              if(!fillerStatus_o.isPartnerPresent() || fillerStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 117, column: 6
                                fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 117, column: 6
                                S7766=1;
                                active[8]=1;
                                ends[8]=1;
                                break RUN;
                              }
                              else {
                                S7761=0;
                                if(fillerStatus_o.isACK()){//sysj\controller.sysj line: 117, column: 6
                                  fillerStatus_o.setVal("busy");//sysj\controller.sysj line: 117, column: 6
                                  S7761=1;
                                  if(!fillerStatus_o.isACK()){//sysj\controller.sysj line: 117, column: 6
                                    fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 117, column: 6
                                    ends[8]=2;
                                    ;//sysj\controller.sysj line: 117, column: 6
                                    S7804=1;
                                    S7811=0;
                                    if(!percentLiquid_in.isPartnerPresent() || percentLiquid_in.isPartnerPreempted()){//sysj\controller.sysj line: 118, column: 6
                                      percentLiquid_in.setACK(false);//sysj\controller.sysj line: 118, column: 6
                                      S7811=1;
                                      active[8]=1;
                                      ends[8]=1;
                                      break RUN;
                                    }
                                    else {
                                      S7806=0;
                                      if(!percentLiquid_in.isREQ()){//sysj\controller.sysj line: 118, column: 6
                                        percentLiquid_in.setACK(true);//sysj\controller.sysj line: 118, column: 6
                                        S7806=1;
                                        if(percentLiquid_in.isREQ()){//sysj\controller.sysj line: 118, column: 6
                                          percentLiquid_in.setACK(false);//sysj\controller.sysj line: 118, column: 6
                                          ends[8]=2;
                                          ;//sysj\controller.sysj line: 118, column: 6
                                          recPercentLiq_thread_8 = (ArrayList)(percentLiquid_in.getVal() == null ? null : ((ArrayList)percentLiquid_in.getVal()));//sysj\controller.sysj line: 119, column: 6
                                          canisterNum_thread_8 = 1;//sysj\controller.sysj line: 120, column: 6
                                          S7804=2;
                                          if(canisterNum_thread_8 < 5){//sysj\controller.sysj line: 122, column: 12
                                            S7923=0;
                                            System.out.println("selecting canister " + canisterNum_thread_8);//sysj\controller.sysj line: 125, column: 8
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
                                            S7804=3;
                                            S9165=0;
                                            if(!fillerStatus_o.isPartnerPresent() || fillerStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 158, column: 6
                                              fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 158, column: 6
                                              S9165=1;
                                              active[8]=1;
                                              ends[8]=1;
                                              break RUN;
                                            }
                                            else {
                                              S9160=0;
                                              if(fillerStatus_o.isACK()){//sysj\controller.sysj line: 158, column: 6
                                                fillerStatus_o.setVal("done");//sysj\controller.sysj line: 158, column: 6
                                                S9160=1;
                                                if(!fillerStatus_o.isACK()){//sysj\controller.sysj line: 158, column: 6
                                                  fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 158, column: 6
                                                  ends[8]=2;
                                                  ;//sysj\controller.sysj line: 158, column: 6
                                                  S7712=2;
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
                          switch(S7811){
                            case 0 : 
                              if(!percentLiquid_in.isPartnerPresent() || percentLiquid_in.isPartnerPreempted()){//sysj\controller.sysj line: 118, column: 6
                                percentLiquid_in.setACK(false);//sysj\controller.sysj line: 118, column: 6
                                S7811=1;
                                active[8]=1;
                                ends[8]=1;
                                break RUN;
                              }
                              else {
                                switch(S7806){
                                  case 0 : 
                                    if(!percentLiquid_in.isREQ()){//sysj\controller.sysj line: 118, column: 6
                                      percentLiquid_in.setACK(true);//sysj\controller.sysj line: 118, column: 6
                                      S7806=1;
                                      if(percentLiquid_in.isREQ()){//sysj\controller.sysj line: 118, column: 6
                                        percentLiquid_in.setACK(false);//sysj\controller.sysj line: 118, column: 6
                                        ends[8]=2;
                                        ;//sysj\controller.sysj line: 118, column: 6
                                        recPercentLiq_thread_8 = (ArrayList)(percentLiquid_in.getVal() == null ? null : ((ArrayList)percentLiquid_in.getVal()));//sysj\controller.sysj line: 119, column: 6
                                        canisterNum_thread_8 = 1;//sysj\controller.sysj line: 120, column: 6
                                        S7804=2;
                                        if(canisterNum_thread_8 < 5){//sysj\controller.sysj line: 122, column: 12
                                          S7923=0;
                                          System.out.println("selecting canister " + canisterNum_thread_8);//sysj\controller.sysj line: 125, column: 8
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
                                          S7804=3;
                                          S9165=0;
                                          if(!fillerStatus_o.isPartnerPresent() || fillerStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 158, column: 6
                                            fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 158, column: 6
                                            S9165=1;
                                            active[8]=1;
                                            ends[8]=1;
                                            break RUN;
                                          }
                                          else {
                                            S9160=0;
                                            if(fillerStatus_o.isACK()){//sysj\controller.sysj line: 158, column: 6
                                              fillerStatus_o.setVal("done");//sysj\controller.sysj line: 158, column: 6
                                              S9160=1;
                                              if(!fillerStatus_o.isACK()){//sysj\controller.sysj line: 158, column: 6
                                                fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 158, column: 6
                                                ends[8]=2;
                                                ;//sysj\controller.sysj line: 158, column: 6
                                                S7712=2;
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
                                      S7804=2;
                                      if(canisterNum_thread_8 < 5){//sysj\controller.sysj line: 122, column: 12
                                        S7923=0;
                                        System.out.println("selecting canister " + canisterNum_thread_8);//sysj\controller.sysj line: 125, column: 8
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
                                        S7804=3;
                                        S9165=0;
                                        if(!fillerStatus_o.isPartnerPresent() || fillerStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 158, column: 6
                                          fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 158, column: 6
                                          S9165=1;
                                          active[8]=1;
                                          ends[8]=1;
                                          break RUN;
                                        }
                                        else {
                                          S9160=0;
                                          if(fillerStatus_o.isACK()){//sysj\controller.sysj line: 158, column: 6
                                            fillerStatus_o.setVal("done");//sysj\controller.sysj line: 158, column: 6
                                            S9160=1;
                                            if(!fillerStatus_o.isACK()){//sysj\controller.sysj line: 158, column: 6
                                              fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 158, column: 6
                                              ends[8]=2;
                                              ;//sysj\controller.sysj line: 158, column: 6
                                              S7712=2;
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
                              S7811=1;
                              S7811=0;
                              if(!percentLiquid_in.isPartnerPresent() || percentLiquid_in.isPartnerPreempted()){//sysj\controller.sysj line: 118, column: 6
                                percentLiquid_in.setACK(false);//sysj\controller.sysj line: 118, column: 6
                                S7811=1;
                                active[8]=1;
                                ends[8]=1;
                                break RUN;
                              }
                              else {
                                S7806=0;
                                if(!percentLiquid_in.isREQ()){//sysj\controller.sysj line: 118, column: 6
                                  percentLiquid_in.setACK(true);//sysj\controller.sysj line: 118, column: 6
                                  S7806=1;
                                  if(percentLiquid_in.isREQ()){//sysj\controller.sysj line: 118, column: 6
                                    percentLiquid_in.setACK(false);//sysj\controller.sysj line: 118, column: 6
                                    ends[8]=2;
                                    ;//sysj\controller.sysj line: 118, column: 6
                                    recPercentLiq_thread_8 = (ArrayList)(percentLiquid_in.getVal() == null ? null : ((ArrayList)percentLiquid_in.getVal()));//sysj\controller.sysj line: 119, column: 6
                                    canisterNum_thread_8 = 1;//sysj\controller.sysj line: 120, column: 6
                                    S7804=2;
                                    if(canisterNum_thread_8 < 5){//sysj\controller.sysj line: 122, column: 12
                                      S7923=0;
                                      System.out.println("selecting canister " + canisterNum_thread_8);//sysj\controller.sysj line: 125, column: 8
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
                                      S7804=3;
                                      S9165=0;
                                      if(!fillerStatus_o.isPartnerPresent() || fillerStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 158, column: 6
                                        fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 158, column: 6
                                        S9165=1;
                                        active[8]=1;
                                        ends[8]=1;
                                        break RUN;
                                      }
                                      else {
                                        S9160=0;
                                        if(fillerStatus_o.isACK()){//sysj\controller.sysj line: 158, column: 6
                                          fillerStatus_o.setVal("done");//sysj\controller.sysj line: 158, column: 6
                                          S9160=1;
                                          if(!fillerStatus_o.isACK()){//sysj\controller.sysj line: 158, column: 6
                                            fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 158, column: 6
                                            ends[8]=2;
                                            ;//sysj\controller.sysj line: 158, column: 6
                                            S7712=2;
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
                          switch(S7923){
                            case 0 : 
                              if(selectedCanister.getprestatus()){//sysj\controller.sysj line: 124, column: 13
                                S7923=1;
                                thread117735(tdone,ends);
                                thread117736(tdone,ends);
                                int biggest117737 = 0;
                                if(ends[9]>=biggest117737){
                                  biggest117737=ends[9];
                                }
                                if(ends[10]>=biggest117737){
                                  biggest117737=ends[10];
                                }
                                if(biggest117737 == 1){
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
                                number_thread_8 = (int)(recPercentLiq_thread_8.get(canisterNum_thread_8 - 1));//sysj\controller.sysj line: 137, column: 8
                                receivedPercentage.setPresent();//sysj\controller.sysj line: 138, column: 8
                                currsigs.addElement(receivedPercentage);
                                receivedPercentage.setValue(number_thread_8);//sysj\controller.sysj line: 138, column: 8
                                System.out.println("emitted perecent");//sysj\controller.sysj line: 140, column: 8
                                S7923=2;
                                active[8]=1;
                                ends[8]=1;
                                break RUN;
                              }
                              else {
                                thread117738(tdone,ends);
                                thread117739(tdone,ends);
                                int biggest117740 = 0;
                                if(ends[9]>=biggest117740){
                                  biggest117740=ends[9];
                                }
                                if(ends[10]>=biggest117740){
                                  biggest117740=ends[10];
                                }
                                if(biggest117740 == 1){
                                  active[8]=1;
                                  ends[8]=1;
                                  break RUN;
                                }
                                //FINXME code
                                if(biggest117740 == 0){
                                  System.out.println("Canister above bottle");//sysj\controller.sysj line: 133, column: 8
                                  number_thread_8 = (int)(recPercentLiq_thread_8.get(canisterNum_thread_8 - 1));//sysj\controller.sysj line: 137, column: 8
                                  receivedPercentage.setPresent();//sysj\controller.sysj line: 138, column: 8
                                  currsigs.addElement(receivedPercentage);
                                  receivedPercentage.setValue(number_thread_8);//sysj\controller.sysj line: 138, column: 8
                                  System.out.println("emitted perecent");//sysj\controller.sysj line: 140, column: 8
                                  S7923=2;
                                  active[8]=1;
                                  ends[8]=1;
                                  break RUN;
                                }
                              }
                            
                            case 2 : 
                              S7923=2;
                              S7923=3;
                              System.out.println("entered abort");//sysj\controller.sysj line: 144, column: 9
                              valveInletOnOff.setPresent();//sysj\controller.sysj line: 145, column: 9
                              currsigs.addElement(valveInletOnOff);
                              active[8]=1;
                              ends[8]=1;
                              break RUN;
                            
                            case 3 : 
                              if(dosUnitFilled.getprestatus()){//sysj\controller.sysj line: 143, column: 14
                                System.out.println("Bottle controller filled");//sysj\controller.sysj line: 148, column: 8
                                S7923=4;
                                thread117741(tdone,ends);
                                thread117742(tdone,ends);
                                int biggest117743 = 0;
                                if(ends[11]>=biggest117743){
                                  biggest117743=ends[11];
                                }
                                if(ends[12]>=biggest117743){
                                  biggest117743=ends[12];
                                }
                                if(biggest117743 == 1){
                                  active[8]=1;
                                  ends[8]=1;
                                  break RUN;
                                }
                              }
                              else {
                                valveInletOnOff.setPresent();//sysj\controller.sysj line: 145, column: 9
                                currsigs.addElement(valveInletOnOff);
                                active[8]=1;
                                ends[8]=1;
                                break RUN;
                              }
                            
                            case 4 : 
                              if(dosUnitEvac.getprestatus()){//sysj\controller.sysj line: 150, column: 14
                                System.out.println("Canister returned");//sysj\controller.sysj line: 153, column: 8
                                canisterNum_thread_8 = canisterNum_thread_8 + 1;//sysj\controller.sysj line: 155, column: 8
                                S7923=5;
                                active[8]=1;
                                ends[8]=1;
                                break RUN;
                              }
                              else {
                                thread117744(tdone,ends);
                                thread117745(tdone,ends);
                                int biggest117746 = 0;
                                if(ends[11]>=biggest117746){
                                  biggest117746=ends[11];
                                }
                                if(ends[12]>=biggest117746){
                                  biggest117746=ends[12];
                                }
                                if(biggest117746 == 1){
                                  active[8]=1;
                                  ends[8]=1;
                                  break RUN;
                                }
                                //FINXME code
                                if(biggest117746 == 0){
                                  System.out.println("Canister returned");//sysj\controller.sysj line: 153, column: 8
                                  canisterNum_thread_8 = canisterNum_thread_8 + 1;//sysj\controller.sysj line: 155, column: 8
                                  S7923=5;
                                  active[8]=1;
                                  ends[8]=1;
                                  break RUN;
                                }
                              }
                            
                            case 5 : 
                              S7923=5;
                              if(canisterNum_thread_8 < 5){//sysj\controller.sysj line: 122, column: 12
                                S7923=0;
                                System.out.println("selecting canister " + canisterNum_thread_8);//sysj\controller.sysj line: 125, column: 8
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
                                S7804=3;
                                S9165=0;
                                if(!fillerStatus_o.isPartnerPresent() || fillerStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 158, column: 6
                                  fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 158, column: 6
                                  S9165=1;
                                  active[8]=1;
                                  ends[8]=1;
                                  break RUN;
                                }
                                else {
                                  S9160=0;
                                  if(fillerStatus_o.isACK()){//sysj\controller.sysj line: 158, column: 6
                                    fillerStatus_o.setVal("done");//sysj\controller.sysj line: 158, column: 6
                                    S9160=1;
                                    if(!fillerStatus_o.isACK()){//sysj\controller.sysj line: 158, column: 6
                                      fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 158, column: 6
                                      ends[8]=2;
                                      ;//sysj\controller.sysj line: 158, column: 6
                                      S7712=2;
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
                          switch(S9165){
                            case 0 : 
                              if(!fillerStatus_o.isPartnerPresent() || fillerStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 158, column: 6
                                fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 158, column: 6
                                S9165=1;
                                active[8]=1;
                                ends[8]=1;
                                break RUN;
                              }
                              else {
                                switch(S9160){
                                  case 0 : 
                                    if(fillerStatus_o.isACK()){//sysj\controller.sysj line: 158, column: 6
                                      fillerStatus_o.setVal("done");//sysj\controller.sysj line: 158, column: 6
                                      S9160=1;
                                      if(!fillerStatus_o.isACK()){//sysj\controller.sysj line: 158, column: 6
                                        fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 158, column: 6
                                        ends[8]=2;
                                        ;//sysj\controller.sysj line: 158, column: 6
                                        S7712=2;
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
                                    if(!fillerStatus_o.isACK()){//sysj\controller.sysj line: 158, column: 6
                                      fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 158, column: 6
                                      ends[8]=2;
                                      ;//sysj\controller.sysj line: 158, column: 6
                                      S7712=2;
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
                              S9165=1;
                              S9165=0;
                              if(!fillerStatus_o.isPartnerPresent() || fillerStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 158, column: 6
                                fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 158, column: 6
                                S9165=1;
                                active[8]=1;
                                ends[8]=1;
                                break RUN;
                              }
                              else {
                                S9160=0;
                                if(fillerStatus_o.isACK()){//sysj\controller.sysj line: 158, column: 6
                                  fillerStatus_o.setVal("done");//sysj\controller.sysj line: 158, column: 6
                                  S9160=1;
                                  if(!fillerStatus_o.isACK()){//sysj\controller.sysj line: 158, column: 6
                                    fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 158, column: 6
                                    ends[8]=2;
                                    ;//sysj\controller.sysj line: 158, column: 6
                                    S7712=2;
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
                  switch(S15536){
                    case 0 : 
                      if(!fillerStatus_o.isPartnerPresent() || fillerStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 161, column: 4
                        fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 161, column: 4
                        S15536=1;
                        active[8]=1;
                        ends[8]=1;
                        break RUN;
                      }
                      else {
                        switch(S15531){
                          case 0 : 
                            if(fillerStatus_o.isACK()){//sysj\controller.sysj line: 161, column: 4
                              fillerStatus_o.setVal("idle");//sysj\controller.sysj line: 161, column: 4
                              S15531=1;
                              if(!fillerStatus_o.isACK()){//sysj\controller.sysj line: 161, column: 4
                                fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 161, column: 4
                                ends[8]=2;
                                ;//sysj\controller.sysj line: 161, column: 4
                                S7712=2;
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
                            if(!fillerStatus_o.isACK()){//sysj\controller.sysj line: 161, column: 4
                              fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 161, column: 4
                              ends[8]=2;
                              ;//sysj\controller.sysj line: 161, column: 4
                              S7712=2;
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
                      S15536=1;
                      S15536=0;
                      if(!fillerStatus_o.isPartnerPresent() || fillerStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 161, column: 4
                        fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 161, column: 4
                        S15536=1;
                        active[8]=1;
                        ends[8]=1;
                        break RUN;
                      }
                      else {
                        S15531=0;
                        if(fillerStatus_o.isACK()){//sysj\controller.sysj line: 161, column: 4
                          fillerStatus_o.setVal("idle");//sysj\controller.sysj line: 161, column: 4
                          S15531=1;
                          if(!fillerStatus_o.isACK()){//sysj\controller.sysj line: 161, column: 4
                            fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 161, column: 4
                            ends[8]=2;
                            ;//sysj\controller.sysj line: 161, column: 4
                            S7712=2;
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
              S7712=2;
              S7712=0;
              S7696=0;
              if(!fillerReq_in.isPartnerPresent() || fillerReq_in.isPartnerPreempted()){//sysj\controller.sysj line: 104, column: 3
                fillerReq_in.setACK(false);//sysj\controller.sysj line: 104, column: 3
                S7696=1;
                active[8]=1;
                ends[8]=1;
                break RUN;
              }
              else {
                S7691=0;
                if(!fillerReq_in.isREQ()){//sysj\controller.sysj line: 104, column: 3
                  fillerReq_in.setACK(true);//sysj\controller.sysj line: 104, column: 3
                  S7691=1;
                  if(fillerReq_in.isREQ()){//sysj\controller.sysj line: 104, column: 3
                    fillerReq_in.setACK(false);//sysj\controller.sysj line: 104, column: 3
                    ends[8]=2;
                    ;//sysj\controller.sysj line: 104, column: 3
                    request_thread_8 = (fillerReq_in.getVal() == null ? null : ((Boolean)fillerReq_in.getVal()));//sysj\controller.sysj line: 105, column: 3
                    S7712=1;
                    if(request_thread_8){//sysj\controller.sysj line: 107, column: 3
                      S15552=0;
                      System.out.println("Filler - received req from orch");//sysj\controller.sysj line: 109, column: 5
                      S7759=0;
                      if(!bottleAtPos2.getprestatus()){//sysj\controller.sysj line: 110, column: 13
                        S7719=0;
                        if(!fillerStatus_o.isPartnerPresent() || fillerStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 111, column: 6
                          fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 111, column: 6
                          S7719=1;
                          active[8]=1;
                          ends[8]=1;
                          break RUN;
                        }
                        else {
                          S7714=0;
                          if(fillerStatus_o.isACK()){//sysj\controller.sysj line: 111, column: 6
                            fillerStatus_o.setVal("idle");//sysj\controller.sysj line: 111, column: 6
                            S7714=1;
                            if(!fillerStatus_o.isACK()){//sysj\controller.sysj line: 111, column: 6
                              fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 111, column: 6
                              ends[8]=2;
                              ;//sysj\controller.sysj line: 111, column: 6
                              S7759=1;
                              if(bottleAtPos2.getprestatus()){//sysj\controller.sysj line: 115, column: 13
                                System.out.println("Filler - bottle is at pos 2");//sysj\controller.sysj line: 116, column: 6
                                S7804=0;
                                S7766=0;
                                if(!fillerStatus_o.isPartnerPresent() || fillerStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 117, column: 6
                                  fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 117, column: 6
                                  S7766=1;
                                  active[8]=1;
                                  ends[8]=1;
                                  break RUN;
                                }
                                else {
                                  S7761=0;
                                  if(fillerStatus_o.isACK()){//sysj\controller.sysj line: 117, column: 6
                                    fillerStatus_o.setVal("busy");//sysj\controller.sysj line: 117, column: 6
                                    S7761=1;
                                    if(!fillerStatus_o.isACK()){//sysj\controller.sysj line: 117, column: 6
                                      fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 117, column: 6
                                      ends[8]=2;
                                      ;//sysj\controller.sysj line: 117, column: 6
                                      S7804=1;
                                      S7811=0;
                                      if(!percentLiquid_in.isPartnerPresent() || percentLiquid_in.isPartnerPreempted()){//sysj\controller.sysj line: 118, column: 6
                                        percentLiquid_in.setACK(false);//sysj\controller.sysj line: 118, column: 6
                                        S7811=1;
                                        active[8]=1;
                                        ends[8]=1;
                                        break RUN;
                                      }
                                      else {
                                        S7806=0;
                                        if(!percentLiquid_in.isREQ()){//sysj\controller.sysj line: 118, column: 6
                                          percentLiquid_in.setACK(true);//sysj\controller.sysj line: 118, column: 6
                                          S7806=1;
                                          if(percentLiquid_in.isREQ()){//sysj\controller.sysj line: 118, column: 6
                                            percentLiquid_in.setACK(false);//sysj\controller.sysj line: 118, column: 6
                                            ends[8]=2;
                                            ;//sysj\controller.sysj line: 118, column: 6
                                            recPercentLiq_thread_8 = (ArrayList)(percentLiquid_in.getVal() == null ? null : ((ArrayList)percentLiquid_in.getVal()));//sysj\controller.sysj line: 119, column: 6
                                            canisterNum_thread_8 = 1;//sysj\controller.sysj line: 120, column: 6
                                            S7804=2;
                                            if(canisterNum_thread_8 < 5){//sysj\controller.sysj line: 122, column: 12
                                              S7923=0;
                                              System.out.println("selecting canister " + canisterNum_thread_8);//sysj\controller.sysj line: 125, column: 8
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
                                              S7804=3;
                                              S9165=0;
                                              if(!fillerStatus_o.isPartnerPresent() || fillerStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 158, column: 6
                                                fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 158, column: 6
                                                S9165=1;
                                                active[8]=1;
                                                ends[8]=1;
                                                break RUN;
                                              }
                                              else {
                                                S9160=0;
                                                if(fillerStatus_o.isACK()){//sysj\controller.sysj line: 158, column: 6
                                                  fillerStatus_o.setVal("done");//sysj\controller.sysj line: 158, column: 6
                                                  S9160=1;
                                                  if(!fillerStatus_o.isACK()){//sysj\controller.sysj line: 158, column: 6
                                                    fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 158, column: 6
                                                    ends[8]=2;
                                                    ;//sysj\controller.sysj line: 158, column: 6
                                                    S7712=2;
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
                                S7712=2;
                                active[8]=1;
                                ends[8]=1;
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
                        S7759=1;
                        if(bottleAtPos2.getprestatus()){//sysj\controller.sysj line: 115, column: 13
                          System.out.println("Filler - bottle is at pos 2");//sysj\controller.sysj line: 116, column: 6
                          S7804=0;
                          S7766=0;
                          if(!fillerStatus_o.isPartnerPresent() || fillerStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 117, column: 6
                            fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 117, column: 6
                            S7766=1;
                            active[8]=1;
                            ends[8]=1;
                            break RUN;
                          }
                          else {
                            S7761=0;
                            if(fillerStatus_o.isACK()){//sysj\controller.sysj line: 117, column: 6
                              fillerStatus_o.setVal("busy");//sysj\controller.sysj line: 117, column: 6
                              S7761=1;
                              if(!fillerStatus_o.isACK()){//sysj\controller.sysj line: 117, column: 6
                                fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 117, column: 6
                                ends[8]=2;
                                ;//sysj\controller.sysj line: 117, column: 6
                                S7804=1;
                                S7811=0;
                                if(!percentLiquid_in.isPartnerPresent() || percentLiquid_in.isPartnerPreempted()){//sysj\controller.sysj line: 118, column: 6
                                  percentLiquid_in.setACK(false);//sysj\controller.sysj line: 118, column: 6
                                  S7811=1;
                                  active[8]=1;
                                  ends[8]=1;
                                  break RUN;
                                }
                                else {
                                  S7806=0;
                                  if(!percentLiquid_in.isREQ()){//sysj\controller.sysj line: 118, column: 6
                                    percentLiquid_in.setACK(true);//sysj\controller.sysj line: 118, column: 6
                                    S7806=1;
                                    if(percentLiquid_in.isREQ()){//sysj\controller.sysj line: 118, column: 6
                                      percentLiquid_in.setACK(false);//sysj\controller.sysj line: 118, column: 6
                                      ends[8]=2;
                                      ;//sysj\controller.sysj line: 118, column: 6
                                      recPercentLiq_thread_8 = (ArrayList)(percentLiquid_in.getVal() == null ? null : ((ArrayList)percentLiquid_in.getVal()));//sysj\controller.sysj line: 119, column: 6
                                      canisterNum_thread_8 = 1;//sysj\controller.sysj line: 120, column: 6
                                      S7804=2;
                                      if(canisterNum_thread_8 < 5){//sysj\controller.sysj line: 122, column: 12
                                        S7923=0;
                                        System.out.println("selecting canister " + canisterNum_thread_8);//sysj\controller.sysj line: 125, column: 8
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
                                        S7804=3;
                                        S9165=0;
                                        if(!fillerStatus_o.isPartnerPresent() || fillerStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 158, column: 6
                                          fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 158, column: 6
                                          S9165=1;
                                          active[8]=1;
                                          ends[8]=1;
                                          break RUN;
                                        }
                                        else {
                                          S9160=0;
                                          if(fillerStatus_o.isACK()){//sysj\controller.sysj line: 158, column: 6
                                            fillerStatus_o.setVal("done");//sysj\controller.sysj line: 158, column: 6
                                            S9160=1;
                                            if(!fillerStatus_o.isACK()){//sysj\controller.sysj line: 158, column: 6
                                              fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 158, column: 6
                                              ends[8]=2;
                                              ;//sysj\controller.sysj line: 158, column: 6
                                              S7712=2;
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
                          S7712=2;
                          active[8]=1;
                          ends[8]=1;
                          break RUN;
                        }
                      }
                    }
                    else {
                      S15552=1;
                      S15536=0;
                      if(!fillerStatus_o.isPartnerPresent() || fillerStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 161, column: 4
                        fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 161, column: 4
                        S15536=1;
                        active[8]=1;
                        ends[8]=1;
                        break RUN;
                      }
                      else {
                        S15531=0;
                        if(fillerStatus_o.isACK()){//sysj\controller.sysj line: 161, column: 4
                          fillerStatus_o.setVal("idle");//sysj\controller.sysj line: 161, column: 4
                          S15531=1;
                          if(!fillerStatus_o.isACK()){//sysj\controller.sysj line: 161, column: 4
                            fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 161, column: 4
                            ends[8]=2;
                            ;//sysj\controller.sysj line: 161, column: 4
                            S7712=2;
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
