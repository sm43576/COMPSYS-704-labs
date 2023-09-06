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
  private ArrayList recPercentLiq_thread_8;//sysj\controller.sysj line: 120, column: 6
  private int canisterNum_thread_8;//sysj\controller.sysj line: 121, column: 6
  private int S97322 = 1;
  private int S8054 = 1;
  private int S8038 = 1;
  private int S8033 = 1;
  private int S15488 = 1;
  private int S8061 = 1;
  private int S8056 = 1;
  private int S8122 = 1;
  private int S8084 = 1;
  private int S8079 = 1;
  private int S8129 = 1;
  private int S8124 = 1;
  private int S8241 = 1;
  private int S8223 = 1;
  private int S8228 = 1;
  private int S8258 = 1;
  private int S8263 = 1;
  private int S9411 = 1;
  private int S9406 = 1;
  
  private int[] ends = new int[23];
  private int[] tdone = new int[23];
  
  public void thread113413(int [] tdone, int [] ends){
        switch(S8263){
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

  public void thread113412(int [] tdone, int [] ends){
        switch(S8258){
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

  public void thread113410(int [] tdone, int [] ends){
        S8263=1;
    valveInjectorOnOff.setPresent();//sysj\controller.sysj line: 148, column: 43
    currsigs.addElement(valveInjectorOnOff);
    active[12]=1;
    ends[12]=1;
    tdone[12]=1;
  }

  public void thread113409(int [] tdone, int [] ends){
        S8258=1;
    dosUnitValveExtend.setPresent();//sysj\controller.sysj line: 148, column: 10
    currsigs.addElement(dosUnitValveExtend);
    active[11]=1;
    ends[11]=1;
    tdone[11]=1;
  }

  public void thread113407(int [] tdone, int [] ends){
        switch(S8228){
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

  public void thread113406(int [] tdone, int [] ends){
        switch(S8223){
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

  public void thread113404(int [] tdone, int [] ends){
        S8228=1;
    valveInjectorOnOff.setPresent();//sysj\controller.sysj line: 132, column: 44
    currsigs.addElement(valveInjectorOnOff);
    active[10]=1;
    ends[10]=1;
    tdone[10]=1;
  }

  public void thread113403(int [] tdone, int [] ends){
        S8223=1;
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
      switch(S97322){
        case 0 : 
          S97322=0;
          break RUN;
        
        case 1 : 
          S97322=2;
          S97322=2;
          S8054=0;
          S8038=0;
          if(!fillerReq_in.isPartnerPresent() || fillerReq_in.isPartnerPreempted()){//sysj\controller.sysj line: 106, column: 3
            fillerReq_in.setACK(false);//sysj\controller.sysj line: 106, column: 3
            S8038=1;
            active[8]=1;
            ends[8]=1;
            break RUN;
          }
          else {
            S8033=0;
            if(!fillerReq_in.isREQ()){//sysj\controller.sysj line: 106, column: 3
              fillerReq_in.setACK(true);//sysj\controller.sysj line: 106, column: 3
              S8033=1;
              if(fillerReq_in.isREQ()){//sysj\controller.sysj line: 106, column: 3
                fillerReq_in.setACK(false);//sysj\controller.sysj line: 106, column: 3
                ends[8]=2;
                ;//sysj\controller.sysj line: 106, column: 3
                request_thread_8 = (fillerReq_in.getVal() == null ? null : ((Boolean)fillerReq_in.getVal()));//sysj\controller.sysj line: 107, column: 3
                S8054=1;
                if(request_thread_8){//sysj\controller.sysj line: 109, column: 3
                  S15488=0;
                  if(!bottleAtPos2.getprestatus()){//sysj\controller.sysj line: 111, column: 13
                    S8061=0;
                    if(!fillerStatus_o.isPartnerPresent() || fillerStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 112, column: 6
                      fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 112, column: 6
                      S8061=1;
                      active[8]=1;
                      ends[8]=1;
                      break RUN;
                    }
                    else {
                      S8056=0;
                      if(fillerStatus_o.isACK()){//sysj\controller.sysj line: 112, column: 6
                        fillerStatus_o.setVal("idle");//sysj\controller.sysj line: 112, column: 6
                        S8056=1;
                        if(!fillerStatus_o.isACK()){//sysj\controller.sysj line: 112, column: 6
                          fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 112, column: 6
                          ends[8]=2;
                          ;//sysj\controller.sysj line: 112, column: 6
                          S15488=1;
                          if(bottleAtPos2.getprestatus()){//sysj\controller.sysj line: 116, column: 13
                            System.out.println("bottle is at pos 2");//sysj\controller.sysj line: 117, column: 6
                            S8122=0;
                            S8084=0;
                            if(!fillerStatus_o.isPartnerPresent() || fillerStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 118, column: 6
                              fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 118, column: 6
                              S8084=1;
                              active[8]=1;
                              ends[8]=1;
                              break RUN;
                            }
                            else {
                              S8079=0;
                              if(fillerStatus_o.isACK()){//sysj\controller.sysj line: 118, column: 6
                                fillerStatus_o.setVal("busy");//sysj\controller.sysj line: 118, column: 6
                                S8079=1;
                                if(!fillerStatus_o.isACK()){//sysj\controller.sysj line: 118, column: 6
                                  fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 118, column: 6
                                  ends[8]=2;
                                  ;//sysj\controller.sysj line: 118, column: 6
                                  S8122=1;
                                  S8129=0;
                                  if(!percentLiquid_in.isPartnerPresent() || percentLiquid_in.isPartnerPreempted()){//sysj\controller.sysj line: 119, column: 6
                                    percentLiquid_in.setACK(false);//sysj\controller.sysj line: 119, column: 6
                                    S8129=1;
                                    active[8]=1;
                                    ends[8]=1;
                                    break RUN;
                                  }
                                  else {
                                    S8124=0;
                                    if(!percentLiquid_in.isREQ()){//sysj\controller.sysj line: 119, column: 6
                                      percentLiquid_in.setACK(true);//sysj\controller.sysj line: 119, column: 6
                                      S8124=1;
                                      if(percentLiquid_in.isREQ()){//sysj\controller.sysj line: 119, column: 6
                                        percentLiquid_in.setACK(false);//sysj\controller.sysj line: 119, column: 6
                                        ends[8]=2;
                                        ;//sysj\controller.sysj line: 119, column: 6
                                        recPercentLiq_thread_8 = (ArrayList)(percentLiquid_in.getVal() == null ? null : ((ArrayList)percentLiquid_in.getVal()));//sysj\controller.sysj line: 120, column: 6
                                        canisterNum_thread_8 = 1;//sysj\controller.sysj line: 121, column: 6
                                        S8122=2;
                                        if(canisterNum_thread_8 < 5){//sysj\controller.sysj line: 123, column: 12
                                          S8241=0;
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
                                          S8122=3;
                                          S9411=0;
                                          if(!fillerStatus_o.isPartnerPresent() || fillerStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 155, column: 6
                                            fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 155, column: 6
                                            S9411=1;
                                            active[8]=1;
                                            ends[8]=1;
                                            break RUN;
                                          }
                                          else {
                                            S9406=0;
                                            if(fillerStatus_o.isACK()){//sysj\controller.sysj line: 155, column: 6
                                              fillerStatus_o.setVal("done");//sysj\controller.sysj line: 155, column: 6
                                              S9406=1;
                                              if(!fillerStatus_o.isACK()){//sysj\controller.sysj line: 155, column: 6
                                                fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 155, column: 6
                                                ends[8]=2;
                                                ;//sysj\controller.sysj line: 155, column: 6
                                                S8054=2;
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
                            S8054=2;
                            active[8]=1;
                            ends[8]=1;
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
                    S15488=1;
                    if(bottleAtPos2.getprestatus()){//sysj\controller.sysj line: 116, column: 13
                      System.out.println("bottle is at pos 2");//sysj\controller.sysj line: 117, column: 6
                      S8122=0;
                      S8084=0;
                      if(!fillerStatus_o.isPartnerPresent() || fillerStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 118, column: 6
                        fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 118, column: 6
                        S8084=1;
                        active[8]=1;
                        ends[8]=1;
                        break RUN;
                      }
                      else {
                        S8079=0;
                        if(fillerStatus_o.isACK()){//sysj\controller.sysj line: 118, column: 6
                          fillerStatus_o.setVal("busy");//sysj\controller.sysj line: 118, column: 6
                          S8079=1;
                          if(!fillerStatus_o.isACK()){//sysj\controller.sysj line: 118, column: 6
                            fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 118, column: 6
                            ends[8]=2;
                            ;//sysj\controller.sysj line: 118, column: 6
                            S8122=1;
                            S8129=0;
                            if(!percentLiquid_in.isPartnerPresent() || percentLiquid_in.isPartnerPreempted()){//sysj\controller.sysj line: 119, column: 6
                              percentLiquid_in.setACK(false);//sysj\controller.sysj line: 119, column: 6
                              S8129=1;
                              active[8]=1;
                              ends[8]=1;
                              break RUN;
                            }
                            else {
                              S8124=0;
                              if(!percentLiquid_in.isREQ()){//sysj\controller.sysj line: 119, column: 6
                                percentLiquid_in.setACK(true);//sysj\controller.sysj line: 119, column: 6
                                S8124=1;
                                if(percentLiquid_in.isREQ()){//sysj\controller.sysj line: 119, column: 6
                                  percentLiquid_in.setACK(false);//sysj\controller.sysj line: 119, column: 6
                                  ends[8]=2;
                                  ;//sysj\controller.sysj line: 119, column: 6
                                  recPercentLiq_thread_8 = (ArrayList)(percentLiquid_in.getVal() == null ? null : ((ArrayList)percentLiquid_in.getVal()));//sysj\controller.sysj line: 120, column: 6
                                  canisterNum_thread_8 = 1;//sysj\controller.sysj line: 121, column: 6
                                  S8122=2;
                                  if(canisterNum_thread_8 < 5){//sysj\controller.sysj line: 123, column: 12
                                    S8241=0;
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
                                    S8122=3;
                                    S9411=0;
                                    if(!fillerStatus_o.isPartnerPresent() || fillerStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 155, column: 6
                                      fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 155, column: 6
                                      S9411=1;
                                      active[8]=1;
                                      ends[8]=1;
                                      break RUN;
                                    }
                                    else {
                                      S9406=0;
                                      if(fillerStatus_o.isACK()){//sysj\controller.sysj line: 155, column: 6
                                        fillerStatus_o.setVal("done");//sysj\controller.sysj line: 155, column: 6
                                        S9406=1;
                                        if(!fillerStatus_o.isACK()){//sysj\controller.sysj line: 155, column: 6
                                          fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 155, column: 6
                                          ends[8]=2;
                                          ;//sysj\controller.sysj line: 155, column: 6
                                          S8054=2;
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
                      S8054=2;
                      active[8]=1;
                      ends[8]=1;
                      break RUN;
                    }
                  }
                }
                else {
                  S8054=2;
                  active[8]=1;
                  ends[8]=1;
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
          switch(S8054){
            case 0 : 
              switch(S8038){
                case 0 : 
                  if(!fillerReq_in.isPartnerPresent() || fillerReq_in.isPartnerPreempted()){//sysj\controller.sysj line: 106, column: 3
                    fillerReq_in.setACK(false);//sysj\controller.sysj line: 106, column: 3
                    S8038=1;
                    active[8]=1;
                    ends[8]=1;
                    break RUN;
                  }
                  else {
                    switch(S8033){
                      case 0 : 
                        if(!fillerReq_in.isREQ()){//sysj\controller.sysj line: 106, column: 3
                          fillerReq_in.setACK(true);//sysj\controller.sysj line: 106, column: 3
                          S8033=1;
                          if(fillerReq_in.isREQ()){//sysj\controller.sysj line: 106, column: 3
                            fillerReq_in.setACK(false);//sysj\controller.sysj line: 106, column: 3
                            ends[8]=2;
                            ;//sysj\controller.sysj line: 106, column: 3
                            request_thread_8 = (fillerReq_in.getVal() == null ? null : ((Boolean)fillerReq_in.getVal()));//sysj\controller.sysj line: 107, column: 3
                            S8054=1;
                            if(request_thread_8){//sysj\controller.sysj line: 109, column: 3
                              S15488=0;
                              if(!bottleAtPos2.getprestatus()){//sysj\controller.sysj line: 111, column: 13
                                S8061=0;
                                if(!fillerStatus_o.isPartnerPresent() || fillerStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 112, column: 6
                                  fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 112, column: 6
                                  S8061=1;
                                  active[8]=1;
                                  ends[8]=1;
                                  break RUN;
                                }
                                else {
                                  S8056=0;
                                  if(fillerStatus_o.isACK()){//sysj\controller.sysj line: 112, column: 6
                                    fillerStatus_o.setVal("idle");//sysj\controller.sysj line: 112, column: 6
                                    S8056=1;
                                    if(!fillerStatus_o.isACK()){//sysj\controller.sysj line: 112, column: 6
                                      fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 112, column: 6
                                      ends[8]=2;
                                      ;//sysj\controller.sysj line: 112, column: 6
                                      S15488=1;
                                      if(bottleAtPos2.getprestatus()){//sysj\controller.sysj line: 116, column: 13
                                        System.out.println("bottle is at pos 2");//sysj\controller.sysj line: 117, column: 6
                                        S8122=0;
                                        S8084=0;
                                        if(!fillerStatus_o.isPartnerPresent() || fillerStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 118, column: 6
                                          fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 118, column: 6
                                          S8084=1;
                                          active[8]=1;
                                          ends[8]=1;
                                          break RUN;
                                        }
                                        else {
                                          S8079=0;
                                          if(fillerStatus_o.isACK()){//sysj\controller.sysj line: 118, column: 6
                                            fillerStatus_o.setVal("busy");//sysj\controller.sysj line: 118, column: 6
                                            S8079=1;
                                            if(!fillerStatus_o.isACK()){//sysj\controller.sysj line: 118, column: 6
                                              fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 118, column: 6
                                              ends[8]=2;
                                              ;//sysj\controller.sysj line: 118, column: 6
                                              S8122=1;
                                              S8129=0;
                                              if(!percentLiquid_in.isPartnerPresent() || percentLiquid_in.isPartnerPreempted()){//sysj\controller.sysj line: 119, column: 6
                                                percentLiquid_in.setACK(false);//sysj\controller.sysj line: 119, column: 6
                                                S8129=1;
                                                active[8]=1;
                                                ends[8]=1;
                                                break RUN;
                                              }
                                              else {
                                                S8124=0;
                                                if(!percentLiquid_in.isREQ()){//sysj\controller.sysj line: 119, column: 6
                                                  percentLiquid_in.setACK(true);//sysj\controller.sysj line: 119, column: 6
                                                  S8124=1;
                                                  if(percentLiquid_in.isREQ()){//sysj\controller.sysj line: 119, column: 6
                                                    percentLiquid_in.setACK(false);//sysj\controller.sysj line: 119, column: 6
                                                    ends[8]=2;
                                                    ;//sysj\controller.sysj line: 119, column: 6
                                                    recPercentLiq_thread_8 = (ArrayList)(percentLiquid_in.getVal() == null ? null : ((ArrayList)percentLiquid_in.getVal()));//sysj\controller.sysj line: 120, column: 6
                                                    canisterNum_thread_8 = 1;//sysj\controller.sysj line: 121, column: 6
                                                    S8122=2;
                                                    if(canisterNum_thread_8 < 5){//sysj\controller.sysj line: 123, column: 12
                                                      S8241=0;
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
                                                      S8122=3;
                                                      S9411=0;
                                                      if(!fillerStatus_o.isPartnerPresent() || fillerStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 155, column: 6
                                                        fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 155, column: 6
                                                        S9411=1;
                                                        active[8]=1;
                                                        ends[8]=1;
                                                        break RUN;
                                                      }
                                                      else {
                                                        S9406=0;
                                                        if(fillerStatus_o.isACK()){//sysj\controller.sysj line: 155, column: 6
                                                          fillerStatus_o.setVal("done");//sysj\controller.sysj line: 155, column: 6
                                                          S9406=1;
                                                          if(!fillerStatus_o.isACK()){//sysj\controller.sysj line: 155, column: 6
                                                            fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 155, column: 6
                                                            ends[8]=2;
                                                            ;//sysj\controller.sysj line: 155, column: 6
                                                            S8054=2;
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
                                        S8054=2;
                                        active[8]=1;
                                        ends[8]=1;
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
                                S15488=1;
                                if(bottleAtPos2.getprestatus()){//sysj\controller.sysj line: 116, column: 13
                                  System.out.println("bottle is at pos 2");//sysj\controller.sysj line: 117, column: 6
                                  S8122=0;
                                  S8084=0;
                                  if(!fillerStatus_o.isPartnerPresent() || fillerStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 118, column: 6
                                    fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 118, column: 6
                                    S8084=1;
                                    active[8]=1;
                                    ends[8]=1;
                                    break RUN;
                                  }
                                  else {
                                    S8079=0;
                                    if(fillerStatus_o.isACK()){//sysj\controller.sysj line: 118, column: 6
                                      fillerStatus_o.setVal("busy");//sysj\controller.sysj line: 118, column: 6
                                      S8079=1;
                                      if(!fillerStatus_o.isACK()){//sysj\controller.sysj line: 118, column: 6
                                        fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 118, column: 6
                                        ends[8]=2;
                                        ;//sysj\controller.sysj line: 118, column: 6
                                        S8122=1;
                                        S8129=0;
                                        if(!percentLiquid_in.isPartnerPresent() || percentLiquid_in.isPartnerPreempted()){//sysj\controller.sysj line: 119, column: 6
                                          percentLiquid_in.setACK(false);//sysj\controller.sysj line: 119, column: 6
                                          S8129=1;
                                          active[8]=1;
                                          ends[8]=1;
                                          break RUN;
                                        }
                                        else {
                                          S8124=0;
                                          if(!percentLiquid_in.isREQ()){//sysj\controller.sysj line: 119, column: 6
                                            percentLiquid_in.setACK(true);//sysj\controller.sysj line: 119, column: 6
                                            S8124=1;
                                            if(percentLiquid_in.isREQ()){//sysj\controller.sysj line: 119, column: 6
                                              percentLiquid_in.setACK(false);//sysj\controller.sysj line: 119, column: 6
                                              ends[8]=2;
                                              ;//sysj\controller.sysj line: 119, column: 6
                                              recPercentLiq_thread_8 = (ArrayList)(percentLiquid_in.getVal() == null ? null : ((ArrayList)percentLiquid_in.getVal()));//sysj\controller.sysj line: 120, column: 6
                                              canisterNum_thread_8 = 1;//sysj\controller.sysj line: 121, column: 6
                                              S8122=2;
                                              if(canisterNum_thread_8 < 5){//sysj\controller.sysj line: 123, column: 12
                                                S8241=0;
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
                                                S8122=3;
                                                S9411=0;
                                                if(!fillerStatus_o.isPartnerPresent() || fillerStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 155, column: 6
                                                  fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 155, column: 6
                                                  S9411=1;
                                                  active[8]=1;
                                                  ends[8]=1;
                                                  break RUN;
                                                }
                                                else {
                                                  S9406=0;
                                                  if(fillerStatus_o.isACK()){//sysj\controller.sysj line: 155, column: 6
                                                    fillerStatus_o.setVal("done");//sysj\controller.sysj line: 155, column: 6
                                                    S9406=1;
                                                    if(!fillerStatus_o.isACK()){//sysj\controller.sysj line: 155, column: 6
                                                      fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 155, column: 6
                                                      ends[8]=2;
                                                      ;//sysj\controller.sysj line: 155, column: 6
                                                      S8054=2;
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
                                  S8054=2;
                                  active[8]=1;
                                  ends[8]=1;
                                  break RUN;
                                }
                              }
                            }
                            else {
                              S8054=2;
                              active[8]=1;
                              ends[8]=1;
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
                          S8054=1;
                          if(request_thread_8){//sysj\controller.sysj line: 109, column: 3
                            S15488=0;
                            if(!bottleAtPos2.getprestatus()){//sysj\controller.sysj line: 111, column: 13
                              S8061=0;
                              if(!fillerStatus_o.isPartnerPresent() || fillerStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 112, column: 6
                                fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 112, column: 6
                                S8061=1;
                                active[8]=1;
                                ends[8]=1;
                                break RUN;
                              }
                              else {
                                S8056=0;
                                if(fillerStatus_o.isACK()){//sysj\controller.sysj line: 112, column: 6
                                  fillerStatus_o.setVal("idle");//sysj\controller.sysj line: 112, column: 6
                                  S8056=1;
                                  if(!fillerStatus_o.isACK()){//sysj\controller.sysj line: 112, column: 6
                                    fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 112, column: 6
                                    ends[8]=2;
                                    ;//sysj\controller.sysj line: 112, column: 6
                                    S15488=1;
                                    if(bottleAtPos2.getprestatus()){//sysj\controller.sysj line: 116, column: 13
                                      System.out.println("bottle is at pos 2");//sysj\controller.sysj line: 117, column: 6
                                      S8122=0;
                                      S8084=0;
                                      if(!fillerStatus_o.isPartnerPresent() || fillerStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 118, column: 6
                                        fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 118, column: 6
                                        S8084=1;
                                        active[8]=1;
                                        ends[8]=1;
                                        break RUN;
                                      }
                                      else {
                                        S8079=0;
                                        if(fillerStatus_o.isACK()){//sysj\controller.sysj line: 118, column: 6
                                          fillerStatus_o.setVal("busy");//sysj\controller.sysj line: 118, column: 6
                                          S8079=1;
                                          if(!fillerStatus_o.isACK()){//sysj\controller.sysj line: 118, column: 6
                                            fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 118, column: 6
                                            ends[8]=2;
                                            ;//sysj\controller.sysj line: 118, column: 6
                                            S8122=1;
                                            S8129=0;
                                            if(!percentLiquid_in.isPartnerPresent() || percentLiquid_in.isPartnerPreempted()){//sysj\controller.sysj line: 119, column: 6
                                              percentLiquid_in.setACK(false);//sysj\controller.sysj line: 119, column: 6
                                              S8129=1;
                                              active[8]=1;
                                              ends[8]=1;
                                              break RUN;
                                            }
                                            else {
                                              S8124=0;
                                              if(!percentLiquid_in.isREQ()){//sysj\controller.sysj line: 119, column: 6
                                                percentLiquid_in.setACK(true);//sysj\controller.sysj line: 119, column: 6
                                                S8124=1;
                                                if(percentLiquid_in.isREQ()){//sysj\controller.sysj line: 119, column: 6
                                                  percentLiquid_in.setACK(false);//sysj\controller.sysj line: 119, column: 6
                                                  ends[8]=2;
                                                  ;//sysj\controller.sysj line: 119, column: 6
                                                  recPercentLiq_thread_8 = (ArrayList)(percentLiquid_in.getVal() == null ? null : ((ArrayList)percentLiquid_in.getVal()));//sysj\controller.sysj line: 120, column: 6
                                                  canisterNum_thread_8 = 1;//sysj\controller.sysj line: 121, column: 6
                                                  S8122=2;
                                                  if(canisterNum_thread_8 < 5){//sysj\controller.sysj line: 123, column: 12
                                                    S8241=0;
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
                                                    S8122=3;
                                                    S9411=0;
                                                    if(!fillerStatus_o.isPartnerPresent() || fillerStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 155, column: 6
                                                      fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 155, column: 6
                                                      S9411=1;
                                                      active[8]=1;
                                                      ends[8]=1;
                                                      break RUN;
                                                    }
                                                    else {
                                                      S9406=0;
                                                      if(fillerStatus_o.isACK()){//sysj\controller.sysj line: 155, column: 6
                                                        fillerStatus_o.setVal("done");//sysj\controller.sysj line: 155, column: 6
                                                        S9406=1;
                                                        if(!fillerStatus_o.isACK()){//sysj\controller.sysj line: 155, column: 6
                                                          fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 155, column: 6
                                                          ends[8]=2;
                                                          ;//sysj\controller.sysj line: 155, column: 6
                                                          S8054=2;
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
                                      S8054=2;
                                      active[8]=1;
                                      ends[8]=1;
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
                              S15488=1;
                              if(bottleAtPos2.getprestatus()){//sysj\controller.sysj line: 116, column: 13
                                System.out.println("bottle is at pos 2");//sysj\controller.sysj line: 117, column: 6
                                S8122=0;
                                S8084=0;
                                if(!fillerStatus_o.isPartnerPresent() || fillerStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 118, column: 6
                                  fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 118, column: 6
                                  S8084=1;
                                  active[8]=1;
                                  ends[8]=1;
                                  break RUN;
                                }
                                else {
                                  S8079=0;
                                  if(fillerStatus_o.isACK()){//sysj\controller.sysj line: 118, column: 6
                                    fillerStatus_o.setVal("busy");//sysj\controller.sysj line: 118, column: 6
                                    S8079=1;
                                    if(!fillerStatus_o.isACK()){//sysj\controller.sysj line: 118, column: 6
                                      fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 118, column: 6
                                      ends[8]=2;
                                      ;//sysj\controller.sysj line: 118, column: 6
                                      S8122=1;
                                      S8129=0;
                                      if(!percentLiquid_in.isPartnerPresent() || percentLiquid_in.isPartnerPreempted()){//sysj\controller.sysj line: 119, column: 6
                                        percentLiquid_in.setACK(false);//sysj\controller.sysj line: 119, column: 6
                                        S8129=1;
                                        active[8]=1;
                                        ends[8]=1;
                                        break RUN;
                                      }
                                      else {
                                        S8124=0;
                                        if(!percentLiquid_in.isREQ()){//sysj\controller.sysj line: 119, column: 6
                                          percentLiquid_in.setACK(true);//sysj\controller.sysj line: 119, column: 6
                                          S8124=1;
                                          if(percentLiquid_in.isREQ()){//sysj\controller.sysj line: 119, column: 6
                                            percentLiquid_in.setACK(false);//sysj\controller.sysj line: 119, column: 6
                                            ends[8]=2;
                                            ;//sysj\controller.sysj line: 119, column: 6
                                            recPercentLiq_thread_8 = (ArrayList)(percentLiquid_in.getVal() == null ? null : ((ArrayList)percentLiquid_in.getVal()));//sysj\controller.sysj line: 120, column: 6
                                            canisterNum_thread_8 = 1;//sysj\controller.sysj line: 121, column: 6
                                            S8122=2;
                                            if(canisterNum_thread_8 < 5){//sysj\controller.sysj line: 123, column: 12
                                              S8241=0;
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
                                              S8122=3;
                                              S9411=0;
                                              if(!fillerStatus_o.isPartnerPresent() || fillerStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 155, column: 6
                                                fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 155, column: 6
                                                S9411=1;
                                                active[8]=1;
                                                ends[8]=1;
                                                break RUN;
                                              }
                                              else {
                                                S9406=0;
                                                if(fillerStatus_o.isACK()){//sysj\controller.sysj line: 155, column: 6
                                                  fillerStatus_o.setVal("done");//sysj\controller.sysj line: 155, column: 6
                                                  S9406=1;
                                                  if(!fillerStatus_o.isACK()){//sysj\controller.sysj line: 155, column: 6
                                                    fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 155, column: 6
                                                    ends[8]=2;
                                                    ;//sysj\controller.sysj line: 155, column: 6
                                                    S8054=2;
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
                                S8054=2;
                                active[8]=1;
                                ends[8]=1;
                                break RUN;
                              }
                            }
                          }
                          else {
                            S8054=2;
                            active[8]=1;
                            ends[8]=1;
                            break RUN;
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
                  S8038=1;
                  S8038=0;
                  if(!fillerReq_in.isPartnerPresent() || fillerReq_in.isPartnerPreempted()){//sysj\controller.sysj line: 106, column: 3
                    fillerReq_in.setACK(false);//sysj\controller.sysj line: 106, column: 3
                    S8038=1;
                    active[8]=1;
                    ends[8]=1;
                    break RUN;
                  }
                  else {
                    S8033=0;
                    if(!fillerReq_in.isREQ()){//sysj\controller.sysj line: 106, column: 3
                      fillerReq_in.setACK(true);//sysj\controller.sysj line: 106, column: 3
                      S8033=1;
                      if(fillerReq_in.isREQ()){//sysj\controller.sysj line: 106, column: 3
                        fillerReq_in.setACK(false);//sysj\controller.sysj line: 106, column: 3
                        ends[8]=2;
                        ;//sysj\controller.sysj line: 106, column: 3
                        request_thread_8 = (fillerReq_in.getVal() == null ? null : ((Boolean)fillerReq_in.getVal()));//sysj\controller.sysj line: 107, column: 3
                        S8054=1;
                        if(request_thread_8){//sysj\controller.sysj line: 109, column: 3
                          S15488=0;
                          if(!bottleAtPos2.getprestatus()){//sysj\controller.sysj line: 111, column: 13
                            S8061=0;
                            if(!fillerStatus_o.isPartnerPresent() || fillerStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 112, column: 6
                              fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 112, column: 6
                              S8061=1;
                              active[8]=1;
                              ends[8]=1;
                              break RUN;
                            }
                            else {
                              S8056=0;
                              if(fillerStatus_o.isACK()){//sysj\controller.sysj line: 112, column: 6
                                fillerStatus_o.setVal("idle");//sysj\controller.sysj line: 112, column: 6
                                S8056=1;
                                if(!fillerStatus_o.isACK()){//sysj\controller.sysj line: 112, column: 6
                                  fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 112, column: 6
                                  ends[8]=2;
                                  ;//sysj\controller.sysj line: 112, column: 6
                                  S15488=1;
                                  if(bottleAtPos2.getprestatus()){//sysj\controller.sysj line: 116, column: 13
                                    System.out.println("bottle is at pos 2");//sysj\controller.sysj line: 117, column: 6
                                    S8122=0;
                                    S8084=0;
                                    if(!fillerStatus_o.isPartnerPresent() || fillerStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 118, column: 6
                                      fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 118, column: 6
                                      S8084=1;
                                      active[8]=1;
                                      ends[8]=1;
                                      break RUN;
                                    }
                                    else {
                                      S8079=0;
                                      if(fillerStatus_o.isACK()){//sysj\controller.sysj line: 118, column: 6
                                        fillerStatus_o.setVal("busy");//sysj\controller.sysj line: 118, column: 6
                                        S8079=1;
                                        if(!fillerStatus_o.isACK()){//sysj\controller.sysj line: 118, column: 6
                                          fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 118, column: 6
                                          ends[8]=2;
                                          ;//sysj\controller.sysj line: 118, column: 6
                                          S8122=1;
                                          S8129=0;
                                          if(!percentLiquid_in.isPartnerPresent() || percentLiquid_in.isPartnerPreempted()){//sysj\controller.sysj line: 119, column: 6
                                            percentLiquid_in.setACK(false);//sysj\controller.sysj line: 119, column: 6
                                            S8129=1;
                                            active[8]=1;
                                            ends[8]=1;
                                            break RUN;
                                          }
                                          else {
                                            S8124=0;
                                            if(!percentLiquid_in.isREQ()){//sysj\controller.sysj line: 119, column: 6
                                              percentLiquid_in.setACK(true);//sysj\controller.sysj line: 119, column: 6
                                              S8124=1;
                                              if(percentLiquid_in.isREQ()){//sysj\controller.sysj line: 119, column: 6
                                                percentLiquid_in.setACK(false);//sysj\controller.sysj line: 119, column: 6
                                                ends[8]=2;
                                                ;//sysj\controller.sysj line: 119, column: 6
                                                recPercentLiq_thread_8 = (ArrayList)(percentLiquid_in.getVal() == null ? null : ((ArrayList)percentLiquid_in.getVal()));//sysj\controller.sysj line: 120, column: 6
                                                canisterNum_thread_8 = 1;//sysj\controller.sysj line: 121, column: 6
                                                S8122=2;
                                                if(canisterNum_thread_8 < 5){//sysj\controller.sysj line: 123, column: 12
                                                  S8241=0;
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
                                                  S8122=3;
                                                  S9411=0;
                                                  if(!fillerStatus_o.isPartnerPresent() || fillerStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 155, column: 6
                                                    fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 155, column: 6
                                                    S9411=1;
                                                    active[8]=1;
                                                    ends[8]=1;
                                                    break RUN;
                                                  }
                                                  else {
                                                    S9406=0;
                                                    if(fillerStatus_o.isACK()){//sysj\controller.sysj line: 155, column: 6
                                                      fillerStatus_o.setVal("done");//sysj\controller.sysj line: 155, column: 6
                                                      S9406=1;
                                                      if(!fillerStatus_o.isACK()){//sysj\controller.sysj line: 155, column: 6
                                                        fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 155, column: 6
                                                        ends[8]=2;
                                                        ;//sysj\controller.sysj line: 155, column: 6
                                                        S8054=2;
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
                                    S8054=2;
                                    active[8]=1;
                                    ends[8]=1;
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
                            S15488=1;
                            if(bottleAtPos2.getprestatus()){//sysj\controller.sysj line: 116, column: 13
                              System.out.println("bottle is at pos 2");//sysj\controller.sysj line: 117, column: 6
                              S8122=0;
                              S8084=0;
                              if(!fillerStatus_o.isPartnerPresent() || fillerStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 118, column: 6
                                fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 118, column: 6
                                S8084=1;
                                active[8]=1;
                                ends[8]=1;
                                break RUN;
                              }
                              else {
                                S8079=0;
                                if(fillerStatus_o.isACK()){//sysj\controller.sysj line: 118, column: 6
                                  fillerStatus_o.setVal("busy");//sysj\controller.sysj line: 118, column: 6
                                  S8079=1;
                                  if(!fillerStatus_o.isACK()){//sysj\controller.sysj line: 118, column: 6
                                    fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 118, column: 6
                                    ends[8]=2;
                                    ;//sysj\controller.sysj line: 118, column: 6
                                    S8122=1;
                                    S8129=0;
                                    if(!percentLiquid_in.isPartnerPresent() || percentLiquid_in.isPartnerPreempted()){//sysj\controller.sysj line: 119, column: 6
                                      percentLiquid_in.setACK(false);//sysj\controller.sysj line: 119, column: 6
                                      S8129=1;
                                      active[8]=1;
                                      ends[8]=1;
                                      break RUN;
                                    }
                                    else {
                                      S8124=0;
                                      if(!percentLiquid_in.isREQ()){//sysj\controller.sysj line: 119, column: 6
                                        percentLiquid_in.setACK(true);//sysj\controller.sysj line: 119, column: 6
                                        S8124=1;
                                        if(percentLiquid_in.isREQ()){//sysj\controller.sysj line: 119, column: 6
                                          percentLiquid_in.setACK(false);//sysj\controller.sysj line: 119, column: 6
                                          ends[8]=2;
                                          ;//sysj\controller.sysj line: 119, column: 6
                                          recPercentLiq_thread_8 = (ArrayList)(percentLiquid_in.getVal() == null ? null : ((ArrayList)percentLiquid_in.getVal()));//sysj\controller.sysj line: 120, column: 6
                                          canisterNum_thread_8 = 1;//sysj\controller.sysj line: 121, column: 6
                                          S8122=2;
                                          if(canisterNum_thread_8 < 5){//sysj\controller.sysj line: 123, column: 12
                                            S8241=0;
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
                                            S8122=3;
                                            S9411=0;
                                            if(!fillerStatus_o.isPartnerPresent() || fillerStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 155, column: 6
                                              fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 155, column: 6
                                              S9411=1;
                                              active[8]=1;
                                              ends[8]=1;
                                              break RUN;
                                            }
                                            else {
                                              S9406=0;
                                              if(fillerStatus_o.isACK()){//sysj\controller.sysj line: 155, column: 6
                                                fillerStatus_o.setVal("done");//sysj\controller.sysj line: 155, column: 6
                                                S9406=1;
                                                if(!fillerStatus_o.isACK()){//sysj\controller.sysj line: 155, column: 6
                                                  fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 155, column: 6
                                                  ends[8]=2;
                                                  ;//sysj\controller.sysj line: 155, column: 6
                                                  S8054=2;
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
                              S8054=2;
                              active[8]=1;
                              ends[8]=1;
                              break RUN;
                            }
                          }
                        }
                        else {
                          S8054=2;
                          active[8]=1;
                          ends[8]=1;
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
              switch(S15488){
                case 0 : 
                  switch(S8061){
                    case 0 : 
                      if(!fillerStatus_o.isPartnerPresent() || fillerStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 112, column: 6
                        fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 112, column: 6
                        S8061=1;
                        active[8]=1;
                        ends[8]=1;
                        break RUN;
                      }
                      else {
                        switch(S8056){
                          case 0 : 
                            if(fillerStatus_o.isACK()){//sysj\controller.sysj line: 112, column: 6
                              fillerStatus_o.setVal("idle");//sysj\controller.sysj line: 112, column: 6
                              S8056=1;
                              if(!fillerStatus_o.isACK()){//sysj\controller.sysj line: 112, column: 6
                                fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 112, column: 6
                                ends[8]=2;
                                ;//sysj\controller.sysj line: 112, column: 6
                                S15488=1;
                                if(bottleAtPos2.getprestatus()){//sysj\controller.sysj line: 116, column: 13
                                  System.out.println("bottle is at pos 2");//sysj\controller.sysj line: 117, column: 6
                                  S8122=0;
                                  S8084=0;
                                  if(!fillerStatus_o.isPartnerPresent() || fillerStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 118, column: 6
                                    fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 118, column: 6
                                    S8084=1;
                                    active[8]=1;
                                    ends[8]=1;
                                    break RUN;
                                  }
                                  else {
                                    S8079=0;
                                    if(fillerStatus_o.isACK()){//sysj\controller.sysj line: 118, column: 6
                                      fillerStatus_o.setVal("busy");//sysj\controller.sysj line: 118, column: 6
                                      S8079=1;
                                      if(!fillerStatus_o.isACK()){//sysj\controller.sysj line: 118, column: 6
                                        fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 118, column: 6
                                        ends[8]=2;
                                        ;//sysj\controller.sysj line: 118, column: 6
                                        S8122=1;
                                        S8129=0;
                                        if(!percentLiquid_in.isPartnerPresent() || percentLiquid_in.isPartnerPreempted()){//sysj\controller.sysj line: 119, column: 6
                                          percentLiquid_in.setACK(false);//sysj\controller.sysj line: 119, column: 6
                                          S8129=1;
                                          active[8]=1;
                                          ends[8]=1;
                                          break RUN;
                                        }
                                        else {
                                          S8124=0;
                                          if(!percentLiquid_in.isREQ()){//sysj\controller.sysj line: 119, column: 6
                                            percentLiquid_in.setACK(true);//sysj\controller.sysj line: 119, column: 6
                                            S8124=1;
                                            if(percentLiquid_in.isREQ()){//sysj\controller.sysj line: 119, column: 6
                                              percentLiquid_in.setACK(false);//sysj\controller.sysj line: 119, column: 6
                                              ends[8]=2;
                                              ;//sysj\controller.sysj line: 119, column: 6
                                              recPercentLiq_thread_8 = (ArrayList)(percentLiquid_in.getVal() == null ? null : ((ArrayList)percentLiquid_in.getVal()));//sysj\controller.sysj line: 120, column: 6
                                              canisterNum_thread_8 = 1;//sysj\controller.sysj line: 121, column: 6
                                              S8122=2;
                                              if(canisterNum_thread_8 < 5){//sysj\controller.sysj line: 123, column: 12
                                                S8241=0;
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
                                                S8122=3;
                                                S9411=0;
                                                if(!fillerStatus_o.isPartnerPresent() || fillerStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 155, column: 6
                                                  fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 155, column: 6
                                                  S9411=1;
                                                  active[8]=1;
                                                  ends[8]=1;
                                                  break RUN;
                                                }
                                                else {
                                                  S9406=0;
                                                  if(fillerStatus_o.isACK()){//sysj\controller.sysj line: 155, column: 6
                                                    fillerStatus_o.setVal("done");//sysj\controller.sysj line: 155, column: 6
                                                    S9406=1;
                                                    if(!fillerStatus_o.isACK()){//sysj\controller.sysj line: 155, column: 6
                                                      fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 155, column: 6
                                                      ends[8]=2;
                                                      ;//sysj\controller.sysj line: 155, column: 6
                                                      S8054=2;
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
                                  S8054=2;
                                  active[8]=1;
                                  ends[8]=1;
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
                              S15488=1;
                              if(bottleAtPos2.getprestatus()){//sysj\controller.sysj line: 116, column: 13
                                System.out.println("bottle is at pos 2");//sysj\controller.sysj line: 117, column: 6
                                S8122=0;
                                S8084=0;
                                if(!fillerStatus_o.isPartnerPresent() || fillerStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 118, column: 6
                                  fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 118, column: 6
                                  S8084=1;
                                  active[8]=1;
                                  ends[8]=1;
                                  break RUN;
                                }
                                else {
                                  S8079=0;
                                  if(fillerStatus_o.isACK()){//sysj\controller.sysj line: 118, column: 6
                                    fillerStatus_o.setVal("busy");//sysj\controller.sysj line: 118, column: 6
                                    S8079=1;
                                    if(!fillerStatus_o.isACK()){//sysj\controller.sysj line: 118, column: 6
                                      fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 118, column: 6
                                      ends[8]=2;
                                      ;//sysj\controller.sysj line: 118, column: 6
                                      S8122=1;
                                      S8129=0;
                                      if(!percentLiquid_in.isPartnerPresent() || percentLiquid_in.isPartnerPreempted()){//sysj\controller.sysj line: 119, column: 6
                                        percentLiquid_in.setACK(false);//sysj\controller.sysj line: 119, column: 6
                                        S8129=1;
                                        active[8]=1;
                                        ends[8]=1;
                                        break RUN;
                                      }
                                      else {
                                        S8124=0;
                                        if(!percentLiquid_in.isREQ()){//sysj\controller.sysj line: 119, column: 6
                                          percentLiquid_in.setACK(true);//sysj\controller.sysj line: 119, column: 6
                                          S8124=1;
                                          if(percentLiquid_in.isREQ()){//sysj\controller.sysj line: 119, column: 6
                                            percentLiquid_in.setACK(false);//sysj\controller.sysj line: 119, column: 6
                                            ends[8]=2;
                                            ;//sysj\controller.sysj line: 119, column: 6
                                            recPercentLiq_thread_8 = (ArrayList)(percentLiquid_in.getVal() == null ? null : ((ArrayList)percentLiquid_in.getVal()));//sysj\controller.sysj line: 120, column: 6
                                            canisterNum_thread_8 = 1;//sysj\controller.sysj line: 121, column: 6
                                            S8122=2;
                                            if(canisterNum_thread_8 < 5){//sysj\controller.sysj line: 123, column: 12
                                              S8241=0;
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
                                              S8122=3;
                                              S9411=0;
                                              if(!fillerStatus_o.isPartnerPresent() || fillerStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 155, column: 6
                                                fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 155, column: 6
                                                S9411=1;
                                                active[8]=1;
                                                ends[8]=1;
                                                break RUN;
                                              }
                                              else {
                                                S9406=0;
                                                if(fillerStatus_o.isACK()){//sysj\controller.sysj line: 155, column: 6
                                                  fillerStatus_o.setVal("done");//sysj\controller.sysj line: 155, column: 6
                                                  S9406=1;
                                                  if(!fillerStatus_o.isACK()){//sysj\controller.sysj line: 155, column: 6
                                                    fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 155, column: 6
                                                    ends[8]=2;
                                                    ;//sysj\controller.sysj line: 155, column: 6
                                                    S8054=2;
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
                                S8054=2;
                                active[8]=1;
                                ends[8]=1;
                                break RUN;
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
                      S8061=1;
                      S8061=0;
                      if(!fillerStatus_o.isPartnerPresent() || fillerStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 112, column: 6
                        fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 112, column: 6
                        S8061=1;
                        active[8]=1;
                        ends[8]=1;
                        break RUN;
                      }
                      else {
                        S8056=0;
                        if(fillerStatus_o.isACK()){//sysj\controller.sysj line: 112, column: 6
                          fillerStatus_o.setVal("idle");//sysj\controller.sysj line: 112, column: 6
                          S8056=1;
                          if(!fillerStatus_o.isACK()){//sysj\controller.sysj line: 112, column: 6
                            fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 112, column: 6
                            ends[8]=2;
                            ;//sysj\controller.sysj line: 112, column: 6
                            S15488=1;
                            if(bottleAtPos2.getprestatus()){//sysj\controller.sysj line: 116, column: 13
                              System.out.println("bottle is at pos 2");//sysj\controller.sysj line: 117, column: 6
                              S8122=0;
                              S8084=0;
                              if(!fillerStatus_o.isPartnerPresent() || fillerStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 118, column: 6
                                fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 118, column: 6
                                S8084=1;
                                active[8]=1;
                                ends[8]=1;
                                break RUN;
                              }
                              else {
                                S8079=0;
                                if(fillerStatus_o.isACK()){//sysj\controller.sysj line: 118, column: 6
                                  fillerStatus_o.setVal("busy");//sysj\controller.sysj line: 118, column: 6
                                  S8079=1;
                                  if(!fillerStatus_o.isACK()){//sysj\controller.sysj line: 118, column: 6
                                    fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 118, column: 6
                                    ends[8]=2;
                                    ;//sysj\controller.sysj line: 118, column: 6
                                    S8122=1;
                                    S8129=0;
                                    if(!percentLiquid_in.isPartnerPresent() || percentLiquid_in.isPartnerPreempted()){//sysj\controller.sysj line: 119, column: 6
                                      percentLiquid_in.setACK(false);//sysj\controller.sysj line: 119, column: 6
                                      S8129=1;
                                      active[8]=1;
                                      ends[8]=1;
                                      break RUN;
                                    }
                                    else {
                                      S8124=0;
                                      if(!percentLiquid_in.isREQ()){//sysj\controller.sysj line: 119, column: 6
                                        percentLiquid_in.setACK(true);//sysj\controller.sysj line: 119, column: 6
                                        S8124=1;
                                        if(percentLiquid_in.isREQ()){//sysj\controller.sysj line: 119, column: 6
                                          percentLiquid_in.setACK(false);//sysj\controller.sysj line: 119, column: 6
                                          ends[8]=2;
                                          ;//sysj\controller.sysj line: 119, column: 6
                                          recPercentLiq_thread_8 = (ArrayList)(percentLiquid_in.getVal() == null ? null : ((ArrayList)percentLiquid_in.getVal()));//sysj\controller.sysj line: 120, column: 6
                                          canisterNum_thread_8 = 1;//sysj\controller.sysj line: 121, column: 6
                                          S8122=2;
                                          if(canisterNum_thread_8 < 5){//sysj\controller.sysj line: 123, column: 12
                                            S8241=0;
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
                                            S8122=3;
                                            S9411=0;
                                            if(!fillerStatus_o.isPartnerPresent() || fillerStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 155, column: 6
                                              fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 155, column: 6
                                              S9411=1;
                                              active[8]=1;
                                              ends[8]=1;
                                              break RUN;
                                            }
                                            else {
                                              S9406=0;
                                              if(fillerStatus_o.isACK()){//sysj\controller.sysj line: 155, column: 6
                                                fillerStatus_o.setVal("done");//sysj\controller.sysj line: 155, column: 6
                                                S9406=1;
                                                if(!fillerStatus_o.isACK()){//sysj\controller.sysj line: 155, column: 6
                                                  fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 155, column: 6
                                                  ends[8]=2;
                                                  ;//sysj\controller.sysj line: 155, column: 6
                                                  S8054=2;
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
                              S8054=2;
                              active[8]=1;
                              ends[8]=1;
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
                  switch(S8122){
                    case 0 : 
                      switch(S8084){
                        case 0 : 
                          if(!fillerStatus_o.isPartnerPresent() || fillerStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 118, column: 6
                            fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 118, column: 6
                            S8084=1;
                            active[8]=1;
                            ends[8]=1;
                            break RUN;
                          }
                          else {
                            switch(S8079){
                              case 0 : 
                                if(fillerStatus_o.isACK()){//sysj\controller.sysj line: 118, column: 6
                                  fillerStatus_o.setVal("busy");//sysj\controller.sysj line: 118, column: 6
                                  S8079=1;
                                  if(!fillerStatus_o.isACK()){//sysj\controller.sysj line: 118, column: 6
                                    fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 118, column: 6
                                    ends[8]=2;
                                    ;//sysj\controller.sysj line: 118, column: 6
                                    S8122=1;
                                    S8129=0;
                                    if(!percentLiquid_in.isPartnerPresent() || percentLiquid_in.isPartnerPreempted()){//sysj\controller.sysj line: 119, column: 6
                                      percentLiquid_in.setACK(false);//sysj\controller.sysj line: 119, column: 6
                                      S8129=1;
                                      active[8]=1;
                                      ends[8]=1;
                                      break RUN;
                                    }
                                    else {
                                      S8124=0;
                                      if(!percentLiquid_in.isREQ()){//sysj\controller.sysj line: 119, column: 6
                                        percentLiquid_in.setACK(true);//sysj\controller.sysj line: 119, column: 6
                                        S8124=1;
                                        if(percentLiquid_in.isREQ()){//sysj\controller.sysj line: 119, column: 6
                                          percentLiquid_in.setACK(false);//sysj\controller.sysj line: 119, column: 6
                                          ends[8]=2;
                                          ;//sysj\controller.sysj line: 119, column: 6
                                          recPercentLiq_thread_8 = (ArrayList)(percentLiquid_in.getVal() == null ? null : ((ArrayList)percentLiquid_in.getVal()));//sysj\controller.sysj line: 120, column: 6
                                          canisterNum_thread_8 = 1;//sysj\controller.sysj line: 121, column: 6
                                          S8122=2;
                                          if(canisterNum_thread_8 < 5){//sysj\controller.sysj line: 123, column: 12
                                            S8241=0;
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
                                            S8122=3;
                                            S9411=0;
                                            if(!fillerStatus_o.isPartnerPresent() || fillerStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 155, column: 6
                                              fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 155, column: 6
                                              S9411=1;
                                              active[8]=1;
                                              ends[8]=1;
                                              break RUN;
                                            }
                                            else {
                                              S9406=0;
                                              if(fillerStatus_o.isACK()){//sysj\controller.sysj line: 155, column: 6
                                                fillerStatus_o.setVal("done");//sysj\controller.sysj line: 155, column: 6
                                                S9406=1;
                                                if(!fillerStatus_o.isACK()){//sysj\controller.sysj line: 155, column: 6
                                                  fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 155, column: 6
                                                  ends[8]=2;
                                                  ;//sysj\controller.sysj line: 155, column: 6
                                                  S8054=2;
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
                                  S8122=1;
                                  S8129=0;
                                  if(!percentLiquid_in.isPartnerPresent() || percentLiquid_in.isPartnerPreempted()){//sysj\controller.sysj line: 119, column: 6
                                    percentLiquid_in.setACK(false);//sysj\controller.sysj line: 119, column: 6
                                    S8129=1;
                                    active[8]=1;
                                    ends[8]=1;
                                    break RUN;
                                  }
                                  else {
                                    S8124=0;
                                    if(!percentLiquid_in.isREQ()){//sysj\controller.sysj line: 119, column: 6
                                      percentLiquid_in.setACK(true);//sysj\controller.sysj line: 119, column: 6
                                      S8124=1;
                                      if(percentLiquid_in.isREQ()){//sysj\controller.sysj line: 119, column: 6
                                        percentLiquid_in.setACK(false);//sysj\controller.sysj line: 119, column: 6
                                        ends[8]=2;
                                        ;//sysj\controller.sysj line: 119, column: 6
                                        recPercentLiq_thread_8 = (ArrayList)(percentLiquid_in.getVal() == null ? null : ((ArrayList)percentLiquid_in.getVal()));//sysj\controller.sysj line: 120, column: 6
                                        canisterNum_thread_8 = 1;//sysj\controller.sysj line: 121, column: 6
                                        S8122=2;
                                        if(canisterNum_thread_8 < 5){//sysj\controller.sysj line: 123, column: 12
                                          S8241=0;
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
                                          S8122=3;
                                          S9411=0;
                                          if(!fillerStatus_o.isPartnerPresent() || fillerStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 155, column: 6
                                            fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 155, column: 6
                                            S9411=1;
                                            active[8]=1;
                                            ends[8]=1;
                                            break RUN;
                                          }
                                          else {
                                            S9406=0;
                                            if(fillerStatus_o.isACK()){//sysj\controller.sysj line: 155, column: 6
                                              fillerStatus_o.setVal("done");//sysj\controller.sysj line: 155, column: 6
                                              S9406=1;
                                              if(!fillerStatus_o.isACK()){//sysj\controller.sysj line: 155, column: 6
                                                fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 155, column: 6
                                                ends[8]=2;
                                                ;//sysj\controller.sysj line: 155, column: 6
                                                S8054=2;
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
                          S8084=1;
                          S8084=0;
                          if(!fillerStatus_o.isPartnerPresent() || fillerStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 118, column: 6
                            fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 118, column: 6
                            S8084=1;
                            active[8]=1;
                            ends[8]=1;
                            break RUN;
                          }
                          else {
                            S8079=0;
                            if(fillerStatus_o.isACK()){//sysj\controller.sysj line: 118, column: 6
                              fillerStatus_o.setVal("busy");//sysj\controller.sysj line: 118, column: 6
                              S8079=1;
                              if(!fillerStatus_o.isACK()){//sysj\controller.sysj line: 118, column: 6
                                fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 118, column: 6
                                ends[8]=2;
                                ;//sysj\controller.sysj line: 118, column: 6
                                S8122=1;
                                S8129=0;
                                if(!percentLiquid_in.isPartnerPresent() || percentLiquid_in.isPartnerPreempted()){//sysj\controller.sysj line: 119, column: 6
                                  percentLiquid_in.setACK(false);//sysj\controller.sysj line: 119, column: 6
                                  S8129=1;
                                  active[8]=1;
                                  ends[8]=1;
                                  break RUN;
                                }
                                else {
                                  S8124=0;
                                  if(!percentLiquid_in.isREQ()){//sysj\controller.sysj line: 119, column: 6
                                    percentLiquid_in.setACK(true);//sysj\controller.sysj line: 119, column: 6
                                    S8124=1;
                                    if(percentLiquid_in.isREQ()){//sysj\controller.sysj line: 119, column: 6
                                      percentLiquid_in.setACK(false);//sysj\controller.sysj line: 119, column: 6
                                      ends[8]=2;
                                      ;//sysj\controller.sysj line: 119, column: 6
                                      recPercentLiq_thread_8 = (ArrayList)(percentLiquid_in.getVal() == null ? null : ((ArrayList)percentLiquid_in.getVal()));//sysj\controller.sysj line: 120, column: 6
                                      canisterNum_thread_8 = 1;//sysj\controller.sysj line: 121, column: 6
                                      S8122=2;
                                      if(canisterNum_thread_8 < 5){//sysj\controller.sysj line: 123, column: 12
                                        S8241=0;
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
                                        S8122=3;
                                        S9411=0;
                                        if(!fillerStatus_o.isPartnerPresent() || fillerStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 155, column: 6
                                          fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 155, column: 6
                                          S9411=1;
                                          active[8]=1;
                                          ends[8]=1;
                                          break RUN;
                                        }
                                        else {
                                          S9406=0;
                                          if(fillerStatus_o.isACK()){//sysj\controller.sysj line: 155, column: 6
                                            fillerStatus_o.setVal("done");//sysj\controller.sysj line: 155, column: 6
                                            S9406=1;
                                            if(!fillerStatus_o.isACK()){//sysj\controller.sysj line: 155, column: 6
                                              fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 155, column: 6
                                              ends[8]=2;
                                              ;//sysj\controller.sysj line: 155, column: 6
                                              S8054=2;
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
                      switch(S8129){
                        case 0 : 
                          if(!percentLiquid_in.isPartnerPresent() || percentLiquid_in.isPartnerPreempted()){//sysj\controller.sysj line: 119, column: 6
                            percentLiquid_in.setACK(false);//sysj\controller.sysj line: 119, column: 6
                            S8129=1;
                            active[8]=1;
                            ends[8]=1;
                            break RUN;
                          }
                          else {
                            switch(S8124){
                              case 0 : 
                                if(!percentLiquid_in.isREQ()){//sysj\controller.sysj line: 119, column: 6
                                  percentLiquid_in.setACK(true);//sysj\controller.sysj line: 119, column: 6
                                  S8124=1;
                                  if(percentLiquid_in.isREQ()){//sysj\controller.sysj line: 119, column: 6
                                    percentLiquid_in.setACK(false);//sysj\controller.sysj line: 119, column: 6
                                    ends[8]=2;
                                    ;//sysj\controller.sysj line: 119, column: 6
                                    recPercentLiq_thread_8 = (ArrayList)(percentLiquid_in.getVal() == null ? null : ((ArrayList)percentLiquid_in.getVal()));//sysj\controller.sysj line: 120, column: 6
                                    canisterNum_thread_8 = 1;//sysj\controller.sysj line: 121, column: 6
                                    S8122=2;
                                    if(canisterNum_thread_8 < 5){//sysj\controller.sysj line: 123, column: 12
                                      S8241=0;
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
                                      S8122=3;
                                      S9411=0;
                                      if(!fillerStatus_o.isPartnerPresent() || fillerStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 155, column: 6
                                        fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 155, column: 6
                                        S9411=1;
                                        active[8]=1;
                                        ends[8]=1;
                                        break RUN;
                                      }
                                      else {
                                        S9406=0;
                                        if(fillerStatus_o.isACK()){//sysj\controller.sysj line: 155, column: 6
                                          fillerStatus_o.setVal("done");//sysj\controller.sysj line: 155, column: 6
                                          S9406=1;
                                          if(!fillerStatus_o.isACK()){//sysj\controller.sysj line: 155, column: 6
                                            fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 155, column: 6
                                            ends[8]=2;
                                            ;//sysj\controller.sysj line: 155, column: 6
                                            S8054=2;
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
                                  S8122=2;
                                  if(canisterNum_thread_8 < 5){//sysj\controller.sysj line: 123, column: 12
                                    S8241=0;
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
                                    S8122=3;
                                    S9411=0;
                                    if(!fillerStatus_o.isPartnerPresent() || fillerStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 155, column: 6
                                      fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 155, column: 6
                                      S9411=1;
                                      active[8]=1;
                                      ends[8]=1;
                                      break RUN;
                                    }
                                    else {
                                      S9406=0;
                                      if(fillerStatus_o.isACK()){//sysj\controller.sysj line: 155, column: 6
                                        fillerStatus_o.setVal("done");//sysj\controller.sysj line: 155, column: 6
                                        S9406=1;
                                        if(!fillerStatus_o.isACK()){//sysj\controller.sysj line: 155, column: 6
                                          fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 155, column: 6
                                          ends[8]=2;
                                          ;//sysj\controller.sysj line: 155, column: 6
                                          S8054=2;
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
                          S8129=1;
                          S8129=0;
                          if(!percentLiquid_in.isPartnerPresent() || percentLiquid_in.isPartnerPreempted()){//sysj\controller.sysj line: 119, column: 6
                            percentLiquid_in.setACK(false);//sysj\controller.sysj line: 119, column: 6
                            S8129=1;
                            active[8]=1;
                            ends[8]=1;
                            break RUN;
                          }
                          else {
                            S8124=0;
                            if(!percentLiquid_in.isREQ()){//sysj\controller.sysj line: 119, column: 6
                              percentLiquid_in.setACK(true);//sysj\controller.sysj line: 119, column: 6
                              S8124=1;
                              if(percentLiquid_in.isREQ()){//sysj\controller.sysj line: 119, column: 6
                                percentLiquid_in.setACK(false);//sysj\controller.sysj line: 119, column: 6
                                ends[8]=2;
                                ;//sysj\controller.sysj line: 119, column: 6
                                recPercentLiq_thread_8 = (ArrayList)(percentLiquid_in.getVal() == null ? null : ((ArrayList)percentLiquid_in.getVal()));//sysj\controller.sysj line: 120, column: 6
                                canisterNum_thread_8 = 1;//sysj\controller.sysj line: 121, column: 6
                                S8122=2;
                                if(canisterNum_thread_8 < 5){//sysj\controller.sysj line: 123, column: 12
                                  S8241=0;
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
                                  S8122=3;
                                  S9411=0;
                                  if(!fillerStatus_o.isPartnerPresent() || fillerStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 155, column: 6
                                    fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 155, column: 6
                                    S9411=1;
                                    active[8]=1;
                                    ends[8]=1;
                                    break RUN;
                                  }
                                  else {
                                    S9406=0;
                                    if(fillerStatus_o.isACK()){//sysj\controller.sysj line: 155, column: 6
                                      fillerStatus_o.setVal("done");//sysj\controller.sysj line: 155, column: 6
                                      S9406=1;
                                      if(!fillerStatus_o.isACK()){//sysj\controller.sysj line: 155, column: 6
                                        fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 155, column: 6
                                        ends[8]=2;
                                        ;//sysj\controller.sysj line: 155, column: 6
                                        S8054=2;
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
                      switch(S8241){
                        case 0 : 
                          if(selectedCanister.getprestatus()){//sysj\controller.sysj line: 125, column: 13
                            S8241=1;
                            thread113403(tdone,ends);
                            thread113404(tdone,ends);
                            int biggest113405 = 0;
                            if(ends[9]>=biggest113405){
                              biggest113405=ends[9];
                            }
                            if(ends[10]>=biggest113405){
                              biggest113405=ends[10];
                            }
                            if(biggest113405 == 1){
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
                            S8241=2;
                            valveInletOnOff.setPresent();//sysj\controller.sysj line: 142, column: 9
                            currsigs.addElement(valveInletOnOff);
                            active[8]=1;
                            ends[8]=1;
                            break RUN;
                          }
                          else {
                            thread113406(tdone,ends);
                            thread113407(tdone,ends);
                            int biggest113408 = 0;
                            if(ends[9]>=biggest113408){
                              biggest113408=ends[9];
                            }
                            if(ends[10]>=biggest113408){
                              biggest113408=ends[10];
                            }
                            if(biggest113408 == 1){
                              active[8]=1;
                              ends[8]=1;
                              break RUN;
                            }
                            //FINXME code
                            if(biggest113408 == 0){
                              System.out.println("Canister above bottle");//sysj\controller.sysj line: 134, column: 8
                              receivedPercentage.setPresent();//sysj\controller.sysj line: 138, column: 8
                              currsigs.addElement(receivedPercentage);
                              receivedPercentage.setValue(recPercentLiq_thread_8.get(canisterNum_thread_8 - 1));//sysj\controller.sysj line: 138, column: 8
                              S8241=2;
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
                            S8241=3;
                            thread113409(tdone,ends);
                            thread113410(tdone,ends);
                            int biggest113411 = 0;
                            if(ends[11]>=biggest113411){
                              biggest113411=ends[11];
                            }
                            if(ends[12]>=biggest113411){
                              biggest113411=ends[12];
                            }
                            if(biggest113411 == 1){
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
                            S8241=4;
                            active[8]=1;
                            ends[8]=1;
                            break RUN;
                          }
                          else {
                            thread113412(tdone,ends);
                            thread113413(tdone,ends);
                            int biggest113414 = 0;
                            if(ends[11]>=biggest113414){
                              biggest113414=ends[11];
                            }
                            if(ends[12]>=biggest113414){
                              biggest113414=ends[12];
                            }
                            if(biggest113414 == 1){
                              active[8]=1;
                              ends[8]=1;
                              break RUN;
                            }
                            //FINXME code
                            if(biggest113414 == 0){
                              System.out.println("Canister returned");//sysj\controller.sysj line: 150, column: 8
                              canisterNum_thread_8 += 1;//sysj\controller.sysj line: 152, column: 8
                              S8241=4;
                              active[8]=1;
                              ends[8]=1;
                              break RUN;
                            }
                          }
                        
                        case 4 : 
                          S8241=4;
                          if(canisterNum_thread_8 < 5){//sysj\controller.sysj line: 123, column: 12
                            S8241=0;
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
                            S8122=3;
                            S9411=0;
                            if(!fillerStatus_o.isPartnerPresent() || fillerStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 155, column: 6
                              fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 155, column: 6
                              S9411=1;
                              active[8]=1;
                              ends[8]=1;
                              break RUN;
                            }
                            else {
                              S9406=0;
                              if(fillerStatus_o.isACK()){//sysj\controller.sysj line: 155, column: 6
                                fillerStatus_o.setVal("done");//sysj\controller.sysj line: 155, column: 6
                                S9406=1;
                                if(!fillerStatus_o.isACK()){//sysj\controller.sysj line: 155, column: 6
                                  fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 155, column: 6
                                  ends[8]=2;
                                  ;//sysj\controller.sysj line: 155, column: 6
                                  S8054=2;
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
                      switch(S9411){
                        case 0 : 
                          if(!fillerStatus_o.isPartnerPresent() || fillerStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 155, column: 6
                            fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 155, column: 6
                            S9411=1;
                            active[8]=1;
                            ends[8]=1;
                            break RUN;
                          }
                          else {
                            switch(S9406){
                              case 0 : 
                                if(fillerStatus_o.isACK()){//sysj\controller.sysj line: 155, column: 6
                                  fillerStatus_o.setVal("done");//sysj\controller.sysj line: 155, column: 6
                                  S9406=1;
                                  if(!fillerStatus_o.isACK()){//sysj\controller.sysj line: 155, column: 6
                                    fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 155, column: 6
                                    ends[8]=2;
                                    ;//sysj\controller.sysj line: 155, column: 6
                                    S8054=2;
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
                                  S8054=2;
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
                          S9411=1;
                          S9411=0;
                          if(!fillerStatus_o.isPartnerPresent() || fillerStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 155, column: 6
                            fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 155, column: 6
                            S9411=1;
                            active[8]=1;
                            ends[8]=1;
                            break RUN;
                          }
                          else {
                            S9406=0;
                            if(fillerStatus_o.isACK()){//sysj\controller.sysj line: 155, column: 6
                              fillerStatus_o.setVal("done");//sysj\controller.sysj line: 155, column: 6
                              S9406=1;
                              if(!fillerStatus_o.isACK()){//sysj\controller.sysj line: 155, column: 6
                                fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 155, column: 6
                                ends[8]=2;
                                ;//sysj\controller.sysj line: 155, column: 6
                                S8054=2;
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
              S8054=2;
              S8054=0;
              S8038=0;
              if(!fillerReq_in.isPartnerPresent() || fillerReq_in.isPartnerPreempted()){//sysj\controller.sysj line: 106, column: 3
                fillerReq_in.setACK(false);//sysj\controller.sysj line: 106, column: 3
                S8038=1;
                active[8]=1;
                ends[8]=1;
                break RUN;
              }
              else {
                S8033=0;
                if(!fillerReq_in.isREQ()){//sysj\controller.sysj line: 106, column: 3
                  fillerReq_in.setACK(true);//sysj\controller.sysj line: 106, column: 3
                  S8033=1;
                  if(fillerReq_in.isREQ()){//sysj\controller.sysj line: 106, column: 3
                    fillerReq_in.setACK(false);//sysj\controller.sysj line: 106, column: 3
                    ends[8]=2;
                    ;//sysj\controller.sysj line: 106, column: 3
                    request_thread_8 = (fillerReq_in.getVal() == null ? null : ((Boolean)fillerReq_in.getVal()));//sysj\controller.sysj line: 107, column: 3
                    S8054=1;
                    if(request_thread_8){//sysj\controller.sysj line: 109, column: 3
                      S15488=0;
                      if(!bottleAtPos2.getprestatus()){//sysj\controller.sysj line: 111, column: 13
                        S8061=0;
                        if(!fillerStatus_o.isPartnerPresent() || fillerStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 112, column: 6
                          fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 112, column: 6
                          S8061=1;
                          active[8]=1;
                          ends[8]=1;
                          break RUN;
                        }
                        else {
                          S8056=0;
                          if(fillerStatus_o.isACK()){//sysj\controller.sysj line: 112, column: 6
                            fillerStatus_o.setVal("idle");//sysj\controller.sysj line: 112, column: 6
                            S8056=1;
                            if(!fillerStatus_o.isACK()){//sysj\controller.sysj line: 112, column: 6
                              fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 112, column: 6
                              ends[8]=2;
                              ;//sysj\controller.sysj line: 112, column: 6
                              S15488=1;
                              if(bottleAtPos2.getprestatus()){//sysj\controller.sysj line: 116, column: 13
                                System.out.println("bottle is at pos 2");//sysj\controller.sysj line: 117, column: 6
                                S8122=0;
                                S8084=0;
                                if(!fillerStatus_o.isPartnerPresent() || fillerStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 118, column: 6
                                  fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 118, column: 6
                                  S8084=1;
                                  active[8]=1;
                                  ends[8]=1;
                                  break RUN;
                                }
                                else {
                                  S8079=0;
                                  if(fillerStatus_o.isACK()){//sysj\controller.sysj line: 118, column: 6
                                    fillerStatus_o.setVal("busy");//sysj\controller.sysj line: 118, column: 6
                                    S8079=1;
                                    if(!fillerStatus_o.isACK()){//sysj\controller.sysj line: 118, column: 6
                                      fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 118, column: 6
                                      ends[8]=2;
                                      ;//sysj\controller.sysj line: 118, column: 6
                                      S8122=1;
                                      S8129=0;
                                      if(!percentLiquid_in.isPartnerPresent() || percentLiquid_in.isPartnerPreempted()){//sysj\controller.sysj line: 119, column: 6
                                        percentLiquid_in.setACK(false);//sysj\controller.sysj line: 119, column: 6
                                        S8129=1;
                                        active[8]=1;
                                        ends[8]=1;
                                        break RUN;
                                      }
                                      else {
                                        S8124=0;
                                        if(!percentLiquid_in.isREQ()){//sysj\controller.sysj line: 119, column: 6
                                          percentLiquid_in.setACK(true);//sysj\controller.sysj line: 119, column: 6
                                          S8124=1;
                                          if(percentLiquid_in.isREQ()){//sysj\controller.sysj line: 119, column: 6
                                            percentLiquid_in.setACK(false);//sysj\controller.sysj line: 119, column: 6
                                            ends[8]=2;
                                            ;//sysj\controller.sysj line: 119, column: 6
                                            recPercentLiq_thread_8 = (ArrayList)(percentLiquid_in.getVal() == null ? null : ((ArrayList)percentLiquid_in.getVal()));//sysj\controller.sysj line: 120, column: 6
                                            canisterNum_thread_8 = 1;//sysj\controller.sysj line: 121, column: 6
                                            S8122=2;
                                            if(canisterNum_thread_8 < 5){//sysj\controller.sysj line: 123, column: 12
                                              S8241=0;
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
                                              S8122=3;
                                              S9411=0;
                                              if(!fillerStatus_o.isPartnerPresent() || fillerStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 155, column: 6
                                                fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 155, column: 6
                                                S9411=1;
                                                active[8]=1;
                                                ends[8]=1;
                                                break RUN;
                                              }
                                              else {
                                                S9406=0;
                                                if(fillerStatus_o.isACK()){//sysj\controller.sysj line: 155, column: 6
                                                  fillerStatus_o.setVal("done");//sysj\controller.sysj line: 155, column: 6
                                                  S9406=1;
                                                  if(!fillerStatus_o.isACK()){//sysj\controller.sysj line: 155, column: 6
                                                    fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 155, column: 6
                                                    ends[8]=2;
                                                    ;//sysj\controller.sysj line: 155, column: 6
                                                    S8054=2;
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
                                S8054=2;
                                active[8]=1;
                                ends[8]=1;
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
                        S15488=1;
                        if(bottleAtPos2.getprestatus()){//sysj\controller.sysj line: 116, column: 13
                          System.out.println("bottle is at pos 2");//sysj\controller.sysj line: 117, column: 6
                          S8122=0;
                          S8084=0;
                          if(!fillerStatus_o.isPartnerPresent() || fillerStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 118, column: 6
                            fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 118, column: 6
                            S8084=1;
                            active[8]=1;
                            ends[8]=1;
                            break RUN;
                          }
                          else {
                            S8079=0;
                            if(fillerStatus_o.isACK()){//sysj\controller.sysj line: 118, column: 6
                              fillerStatus_o.setVal("busy");//sysj\controller.sysj line: 118, column: 6
                              S8079=1;
                              if(!fillerStatus_o.isACK()){//sysj\controller.sysj line: 118, column: 6
                                fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 118, column: 6
                                ends[8]=2;
                                ;//sysj\controller.sysj line: 118, column: 6
                                S8122=1;
                                S8129=0;
                                if(!percentLiquid_in.isPartnerPresent() || percentLiquid_in.isPartnerPreempted()){//sysj\controller.sysj line: 119, column: 6
                                  percentLiquid_in.setACK(false);//sysj\controller.sysj line: 119, column: 6
                                  S8129=1;
                                  active[8]=1;
                                  ends[8]=1;
                                  break RUN;
                                }
                                else {
                                  S8124=0;
                                  if(!percentLiquid_in.isREQ()){//sysj\controller.sysj line: 119, column: 6
                                    percentLiquid_in.setACK(true);//sysj\controller.sysj line: 119, column: 6
                                    S8124=1;
                                    if(percentLiquid_in.isREQ()){//sysj\controller.sysj line: 119, column: 6
                                      percentLiquid_in.setACK(false);//sysj\controller.sysj line: 119, column: 6
                                      ends[8]=2;
                                      ;//sysj\controller.sysj line: 119, column: 6
                                      recPercentLiq_thread_8 = (ArrayList)(percentLiquid_in.getVal() == null ? null : ((ArrayList)percentLiquid_in.getVal()));//sysj\controller.sysj line: 120, column: 6
                                      canisterNum_thread_8 = 1;//sysj\controller.sysj line: 121, column: 6
                                      S8122=2;
                                      if(canisterNum_thread_8 < 5){//sysj\controller.sysj line: 123, column: 12
                                        S8241=0;
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
                                        S8122=3;
                                        S9411=0;
                                        if(!fillerStatus_o.isPartnerPresent() || fillerStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 155, column: 6
                                          fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 155, column: 6
                                          S9411=1;
                                          active[8]=1;
                                          ends[8]=1;
                                          break RUN;
                                        }
                                        else {
                                          S9406=0;
                                          if(fillerStatus_o.isACK()){//sysj\controller.sysj line: 155, column: 6
                                            fillerStatus_o.setVal("done");//sysj\controller.sysj line: 155, column: 6
                                            S9406=1;
                                            if(!fillerStatus_o.isACK()){//sysj\controller.sysj line: 155, column: 6
                                              fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 155, column: 6
                                              ends[8]=2;
                                              ;//sysj\controller.sysj line: 155, column: 6
                                              S8054=2;
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
                          S8054=2;
                          active[8]=1;
                          ends[8]=1;
                          break RUN;
                        }
                      }
                    }
                    else {
                      S8054=2;
                      active[8]=1;
                      ends[8]=1;
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
