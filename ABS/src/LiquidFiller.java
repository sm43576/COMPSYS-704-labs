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
  private Boolean request_thread_7;//sysj\controller.sysj line: 85, column: 3
  private ArrayList recPercentLiq_thread_7;//sysj\controller.sysj line: 99, column: 6
  private int canisterNum_thread_7;//sysj\controller.sysj line: 100, column: 6
  private int S63512 = 1;
  private int S5216 = 1;
  private int S5200 = 1;
  private int S5195 = 1;
  private int S5309 = 1;
  private int S5223 = 1;
  private int S5218 = 1;
  private int S5354 = 1;
  private int S5316 = 1;
  private int S5311 = 1;
  private int S5385 = 1;
  private int S5367 = 1;
  private int S5372 = 1;
  private int S5402 = 1;
  private int S5407 = 1;
  private int S6157 = 1;
  private int S6152 = 1;
  
  private int[] ends = new int[22];
  private int[] tdone = new int[22];
  
  public void thread77908(int [] tdone, int [] ends){
        switch(S5407){
      case 0 : 
        active[11]=0;
        ends[11]=0;
        tdone[11]=1;
        break;
      
      case 1 : 
        valveInjectorOnOff.setPresent();//sysj\controller.sysj line: 127, column: 43
        currsigs.addElement(valveInjectorOnOff);
        active[11]=1;
        ends[11]=1;
        tdone[11]=1;
        break;
      
    }
  }

  public void thread77907(int [] tdone, int [] ends){
        switch(S5402){
      case 0 : 
        active[10]=0;
        ends[10]=0;
        tdone[10]=1;
        break;
      
      case 1 : 
        dosUnitValveExtend.setPresent();//sysj\controller.sysj line: 127, column: 10
        currsigs.addElement(dosUnitValveExtend);
        active[10]=1;
        ends[10]=1;
        tdone[10]=1;
        break;
      
    }
  }

  public void thread77905(int [] tdone, int [] ends){
        S5407=1;
    valveInjectorOnOff.setPresent();//sysj\controller.sysj line: 127, column: 43
    currsigs.addElement(valveInjectorOnOff);
    active[11]=1;
    ends[11]=1;
    tdone[11]=1;
  }

  public void thread77904(int [] tdone, int [] ends){
        S5402=1;
    dosUnitValveExtend.setPresent();//sysj\controller.sysj line: 127, column: 10
    currsigs.addElement(dosUnitValveExtend);
    active[10]=1;
    ends[10]=1;
    tdone[10]=1;
  }

  public void thread77902(int [] tdone, int [] ends){
        switch(S5372){
      case 0 : 
        active[9]=0;
        ends[9]=0;
        tdone[9]=1;
        break;
      
      case 1 : 
        valveInjectorOnOff.setPresent();//sysj\controller.sysj line: 111, column: 44
        currsigs.addElement(valveInjectorOnOff);
        active[9]=1;
        ends[9]=1;
        tdone[9]=1;
        break;
      
    }
  }

  public void thread77901(int [] tdone, int [] ends){
        switch(S5367){
      case 0 : 
        active[8]=0;
        ends[8]=0;
        tdone[8]=1;
        break;
      
      case 1 : 
        dosUnitValveRetract.setPresent();//sysj\controller.sysj line: 111, column: 10
        currsigs.addElement(dosUnitValveRetract);
        active[8]=1;
        ends[8]=1;
        tdone[8]=1;
        break;
      
    }
  }

  public void thread77899(int [] tdone, int [] ends){
        S5372=1;
    valveInjectorOnOff.setPresent();//sysj\controller.sysj line: 111, column: 44
    currsigs.addElement(valveInjectorOnOff);
    active[9]=1;
    ends[9]=1;
    tdone[9]=1;
  }

  public void thread77898(int [] tdone, int [] ends){
        S5367=1;
    dosUnitValveRetract.setPresent();//sysj\controller.sysj line: 111, column: 10
    currsigs.addElement(dosUnitValveRetract);
    active[8]=1;
    ends[8]=1;
    tdone[8]=1;
  }

  public void runClockDomain(){
    for(int i=0;i<ends.length;i++){
      ends[i] = 0;
      tdone[i] = 0;
    }
    
    RUN: while(true){
      switch(S63512){
        case 0 : 
          S63512=0;
          break RUN;
        
        case 1 : 
          S63512=2;
          S63512=2;
          S5216=0;
          S5200=0;
          if(!fillerReq_in.isPartnerPresent() || fillerReq_in.isPartnerPreempted()){//sysj\controller.sysj line: 84, column: 3
            fillerReq_in.setACK(false);//sysj\controller.sysj line: 84, column: 3
            S5200=1;
            active[7]=1;
            ends[7]=1;
            break RUN;
          }
          else {
            S5195=0;
            if(!fillerReq_in.isREQ()){//sysj\controller.sysj line: 84, column: 3
              fillerReq_in.setACK(true);//sysj\controller.sysj line: 84, column: 3
              S5195=1;
              if(fillerReq_in.isREQ()){//sysj\controller.sysj line: 84, column: 3
                fillerReq_in.setACK(false);//sysj\controller.sysj line: 84, column: 3
                ends[7]=2;
                ;//sysj\controller.sysj line: 84, column: 3
                request_thread_7 = (fillerReq_in.getVal() == null ? null : ((Boolean)fillerReq_in.getVal()));//sysj\controller.sysj line: 85, column: 3
                S5216=1;
                if(request_thread_7){//sysj\controller.sysj line: 87, column: 3
                  System.out.println("FillerController: - Received request");//sysj\controller.sysj line: 89, column: 5
                  S5309=0;
                  if(!bottleAtPos2.getprestatus()){//sysj\controller.sysj line: 90, column: 13
                    System.out.println("FillerController: - Idle (no bottle at pos 2).");//sysj\controller.sysj line: 91, column: 6
                    S5223=0;
                    if(!fillerStatus_o.isPartnerPresent() || fillerStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 92, column: 6
                      fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 92, column: 6
                      S5223=1;
                      active[7]=1;
                      ends[7]=1;
                      break RUN;
                    }
                    else {
                      S5218=0;
                      if(fillerStatus_o.isACK()){//sysj\controller.sysj line: 92, column: 6
                        fillerStatus_o.setVal("idle");//sysj\controller.sysj line: 92, column: 6
                        S5218=1;
                        if(!fillerStatus_o.isACK()){//sysj\controller.sysj line: 92, column: 6
                          fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 92, column: 6
                          ends[7]=2;
                          ;//sysj\controller.sysj line: 92, column: 6
                          S5309=1;
                          if(bottleAtPos2.getprestatus()){//sysj\controller.sysj line: 96, column: 13
                            System.out.println("FillerController: - Bottle detected at position 2.");//sysj\controller.sysj line: 97, column: 6
                            S5354=0;
                            S5316=0;
                            if(!percentLiquid_in.isPartnerPresent() || percentLiquid_in.isPartnerPreempted()){//sysj\controller.sysj line: 98, column: 6
                              percentLiquid_in.setACK(false);//sysj\controller.sysj line: 98, column: 6
                              S5316=1;
                              active[7]=1;
                              ends[7]=1;
                              break RUN;
                            }
                            else {
                              S5311=0;
                              if(!percentLiquid_in.isREQ()){//sysj\controller.sysj line: 98, column: 6
                                percentLiquid_in.setACK(true);//sysj\controller.sysj line: 98, column: 6
                                S5311=1;
                                if(percentLiquid_in.isREQ()){//sysj\controller.sysj line: 98, column: 6
                                  percentLiquid_in.setACK(false);//sysj\controller.sysj line: 98, column: 6
                                  ends[7]=2;
                                  ;//sysj\controller.sysj line: 98, column: 6
                                  recPercentLiq_thread_7 = (ArrayList)(percentLiquid_in.getVal() == null ? null : ((ArrayList)percentLiquid_in.getVal()));//sysj\controller.sysj line: 99, column: 6
                                  canisterNum_thread_7 = 1;//sysj\controller.sysj line: 100, column: 6
                                  S5354=1;
                                  if(canisterNum_thread_7 < 5){//sysj\controller.sysj line: 102, column: 12
                                    S5385=0;
                                    System.out.println("selecting canister " + canisterNum_thread_7);//sysj\controller.sysj line: 105, column: 8
                                    selectCanister.setPresent();//sysj\controller.sysj line: 106, column: 9
                                    currsigs.addElement(selectCanister);
                                    selectCanister.setValue(canisterNum_thread_7);//sysj\controller.sysj line: 106, column: 9
                                    active[7]=1;
                                    ends[7]=1;
                                    break RUN;
                                  }
                                  else {
                                    ends[7]=2;
                                    ;//sysj\controller.sysj line: 102, column: 6
                                    S5354=2;
                                    S6157=0;
                                    if(!fillerStatus_o.isPartnerPresent() || fillerStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 134, column: 6
                                      fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 134, column: 6
                                      S6157=1;
                                      active[7]=1;
                                      ends[7]=1;
                                      break RUN;
                                    }
                                    else {
                                      S6152=0;
                                      if(fillerStatus_o.isACK()){//sysj\controller.sysj line: 134, column: 6
                                        fillerStatus_o.setVal("done");//sysj\controller.sysj line: 134, column: 6
                                        S6152=1;
                                        if(!fillerStatus_o.isACK()){//sysj\controller.sysj line: 134, column: 6
                                          fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 134, column: 6
                                          ends[7]=2;
                                          ;//sysj\controller.sysj line: 134, column: 6
                                          S5216=2;
                                          active[7]=1;
                                          ends[7]=1;
                                          break RUN;
                                        }
                                        else {
                                          active[7]=1;
                                          ends[7]=1;
                                          break RUN;
                                        }
                                      }
                                      else {
                                        active[7]=1;
                                        ends[7]=1;
                                        break RUN;
                                      }
                                    }
                                  }
                                }
                                else {
                                  active[7]=1;
                                  ends[7]=1;
                                  break RUN;
                                }
                              }
                              else {
                                active[7]=1;
                                ends[7]=1;
                                break RUN;
                              }
                            }
                          }
                          else {
                            S5216=2;
                            active[7]=1;
                            ends[7]=1;
                            break RUN;
                          }
                        }
                        else {
                          active[7]=1;
                          ends[7]=1;
                          break RUN;
                        }
                      }
                      else {
                        active[7]=1;
                        ends[7]=1;
                        break RUN;
                      }
                    }
                  }
                  else {
                    S5309=1;
                    if(bottleAtPos2.getprestatus()){//sysj\controller.sysj line: 96, column: 13
                      System.out.println("FillerController: - Bottle detected at position 2.");//sysj\controller.sysj line: 97, column: 6
                      S5354=0;
                      S5316=0;
                      if(!percentLiquid_in.isPartnerPresent() || percentLiquid_in.isPartnerPreempted()){//sysj\controller.sysj line: 98, column: 6
                        percentLiquid_in.setACK(false);//sysj\controller.sysj line: 98, column: 6
                        S5316=1;
                        active[7]=1;
                        ends[7]=1;
                        break RUN;
                      }
                      else {
                        S5311=0;
                        if(!percentLiquid_in.isREQ()){//sysj\controller.sysj line: 98, column: 6
                          percentLiquid_in.setACK(true);//sysj\controller.sysj line: 98, column: 6
                          S5311=1;
                          if(percentLiquid_in.isREQ()){//sysj\controller.sysj line: 98, column: 6
                            percentLiquid_in.setACK(false);//sysj\controller.sysj line: 98, column: 6
                            ends[7]=2;
                            ;//sysj\controller.sysj line: 98, column: 6
                            recPercentLiq_thread_7 = (ArrayList)(percentLiquid_in.getVal() == null ? null : ((ArrayList)percentLiquid_in.getVal()));//sysj\controller.sysj line: 99, column: 6
                            canisterNum_thread_7 = 1;//sysj\controller.sysj line: 100, column: 6
                            S5354=1;
                            if(canisterNum_thread_7 < 5){//sysj\controller.sysj line: 102, column: 12
                              S5385=0;
                              System.out.println("selecting canister " + canisterNum_thread_7);//sysj\controller.sysj line: 105, column: 8
                              selectCanister.setPresent();//sysj\controller.sysj line: 106, column: 9
                              currsigs.addElement(selectCanister);
                              selectCanister.setValue(canisterNum_thread_7);//sysj\controller.sysj line: 106, column: 9
                              active[7]=1;
                              ends[7]=1;
                              break RUN;
                            }
                            else {
                              ends[7]=2;
                              ;//sysj\controller.sysj line: 102, column: 6
                              S5354=2;
                              S6157=0;
                              if(!fillerStatus_o.isPartnerPresent() || fillerStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 134, column: 6
                                fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 134, column: 6
                                S6157=1;
                                active[7]=1;
                                ends[7]=1;
                                break RUN;
                              }
                              else {
                                S6152=0;
                                if(fillerStatus_o.isACK()){//sysj\controller.sysj line: 134, column: 6
                                  fillerStatus_o.setVal("done");//sysj\controller.sysj line: 134, column: 6
                                  S6152=1;
                                  if(!fillerStatus_o.isACK()){//sysj\controller.sysj line: 134, column: 6
                                    fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 134, column: 6
                                    ends[7]=2;
                                    ;//sysj\controller.sysj line: 134, column: 6
                                    S5216=2;
                                    active[7]=1;
                                    ends[7]=1;
                                    break RUN;
                                  }
                                  else {
                                    active[7]=1;
                                    ends[7]=1;
                                    break RUN;
                                  }
                                }
                                else {
                                  active[7]=1;
                                  ends[7]=1;
                                  break RUN;
                                }
                              }
                            }
                          }
                          else {
                            active[7]=1;
                            ends[7]=1;
                            break RUN;
                          }
                        }
                        else {
                          active[7]=1;
                          ends[7]=1;
                          break RUN;
                        }
                      }
                    }
                    else {
                      S5216=2;
                      active[7]=1;
                      ends[7]=1;
                      break RUN;
                    }
                  }
                }
                else {
                  S5216=2;
                  active[7]=1;
                  ends[7]=1;
                  break RUN;
                }
              }
              else {
                active[7]=1;
                ends[7]=1;
                break RUN;
              }
            }
            else {
              active[7]=1;
              ends[7]=1;
              break RUN;
            }
          }
        
        case 2 : 
          switch(S5216){
            case 0 : 
              switch(S5200){
                case 0 : 
                  if(!fillerReq_in.isPartnerPresent() || fillerReq_in.isPartnerPreempted()){//sysj\controller.sysj line: 84, column: 3
                    fillerReq_in.setACK(false);//sysj\controller.sysj line: 84, column: 3
                    S5200=1;
                    active[7]=1;
                    ends[7]=1;
                    break RUN;
                  }
                  else {
                    switch(S5195){
                      case 0 : 
                        if(!fillerReq_in.isREQ()){//sysj\controller.sysj line: 84, column: 3
                          fillerReq_in.setACK(true);//sysj\controller.sysj line: 84, column: 3
                          S5195=1;
                          if(fillerReq_in.isREQ()){//sysj\controller.sysj line: 84, column: 3
                            fillerReq_in.setACK(false);//sysj\controller.sysj line: 84, column: 3
                            ends[7]=2;
                            ;//sysj\controller.sysj line: 84, column: 3
                            request_thread_7 = (fillerReq_in.getVal() == null ? null : ((Boolean)fillerReq_in.getVal()));//sysj\controller.sysj line: 85, column: 3
                            S5216=1;
                            if(request_thread_7){//sysj\controller.sysj line: 87, column: 3
                              System.out.println("FillerController: - Received request");//sysj\controller.sysj line: 89, column: 5
                              S5309=0;
                              if(!bottleAtPos2.getprestatus()){//sysj\controller.sysj line: 90, column: 13
                                System.out.println("FillerController: - Idle (no bottle at pos 2).");//sysj\controller.sysj line: 91, column: 6
                                S5223=0;
                                if(!fillerStatus_o.isPartnerPresent() || fillerStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 92, column: 6
                                  fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 92, column: 6
                                  S5223=1;
                                  active[7]=1;
                                  ends[7]=1;
                                  break RUN;
                                }
                                else {
                                  S5218=0;
                                  if(fillerStatus_o.isACK()){//sysj\controller.sysj line: 92, column: 6
                                    fillerStatus_o.setVal("idle");//sysj\controller.sysj line: 92, column: 6
                                    S5218=1;
                                    if(!fillerStatus_o.isACK()){//sysj\controller.sysj line: 92, column: 6
                                      fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 92, column: 6
                                      ends[7]=2;
                                      ;//sysj\controller.sysj line: 92, column: 6
                                      S5309=1;
                                      if(bottleAtPos2.getprestatus()){//sysj\controller.sysj line: 96, column: 13
                                        System.out.println("FillerController: - Bottle detected at position 2.");//sysj\controller.sysj line: 97, column: 6
                                        S5354=0;
                                        S5316=0;
                                        if(!percentLiquid_in.isPartnerPresent() || percentLiquid_in.isPartnerPreempted()){//sysj\controller.sysj line: 98, column: 6
                                          percentLiquid_in.setACK(false);//sysj\controller.sysj line: 98, column: 6
                                          S5316=1;
                                          active[7]=1;
                                          ends[7]=1;
                                          break RUN;
                                        }
                                        else {
                                          S5311=0;
                                          if(!percentLiquid_in.isREQ()){//sysj\controller.sysj line: 98, column: 6
                                            percentLiquid_in.setACK(true);//sysj\controller.sysj line: 98, column: 6
                                            S5311=1;
                                            if(percentLiquid_in.isREQ()){//sysj\controller.sysj line: 98, column: 6
                                              percentLiquid_in.setACK(false);//sysj\controller.sysj line: 98, column: 6
                                              ends[7]=2;
                                              ;//sysj\controller.sysj line: 98, column: 6
                                              recPercentLiq_thread_7 = (ArrayList)(percentLiquid_in.getVal() == null ? null : ((ArrayList)percentLiquid_in.getVal()));//sysj\controller.sysj line: 99, column: 6
                                              canisterNum_thread_7 = 1;//sysj\controller.sysj line: 100, column: 6
                                              S5354=1;
                                              if(canisterNum_thread_7 < 5){//sysj\controller.sysj line: 102, column: 12
                                                S5385=0;
                                                System.out.println("selecting canister " + canisterNum_thread_7);//sysj\controller.sysj line: 105, column: 8
                                                selectCanister.setPresent();//sysj\controller.sysj line: 106, column: 9
                                                currsigs.addElement(selectCanister);
                                                selectCanister.setValue(canisterNum_thread_7);//sysj\controller.sysj line: 106, column: 9
                                                active[7]=1;
                                                ends[7]=1;
                                                break RUN;
                                              }
                                              else {
                                                ends[7]=2;
                                                ;//sysj\controller.sysj line: 102, column: 6
                                                S5354=2;
                                                S6157=0;
                                                if(!fillerStatus_o.isPartnerPresent() || fillerStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 134, column: 6
                                                  fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 134, column: 6
                                                  S6157=1;
                                                  active[7]=1;
                                                  ends[7]=1;
                                                  break RUN;
                                                }
                                                else {
                                                  S6152=0;
                                                  if(fillerStatus_o.isACK()){//sysj\controller.sysj line: 134, column: 6
                                                    fillerStatus_o.setVal("done");//sysj\controller.sysj line: 134, column: 6
                                                    S6152=1;
                                                    if(!fillerStatus_o.isACK()){//sysj\controller.sysj line: 134, column: 6
                                                      fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 134, column: 6
                                                      ends[7]=2;
                                                      ;//sysj\controller.sysj line: 134, column: 6
                                                      S5216=2;
                                                      active[7]=1;
                                                      ends[7]=1;
                                                      break RUN;
                                                    }
                                                    else {
                                                      active[7]=1;
                                                      ends[7]=1;
                                                      break RUN;
                                                    }
                                                  }
                                                  else {
                                                    active[7]=1;
                                                    ends[7]=1;
                                                    break RUN;
                                                  }
                                                }
                                              }
                                            }
                                            else {
                                              active[7]=1;
                                              ends[7]=1;
                                              break RUN;
                                            }
                                          }
                                          else {
                                            active[7]=1;
                                            ends[7]=1;
                                            break RUN;
                                          }
                                        }
                                      }
                                      else {
                                        S5216=2;
                                        active[7]=1;
                                        ends[7]=1;
                                        break RUN;
                                      }
                                    }
                                    else {
                                      active[7]=1;
                                      ends[7]=1;
                                      break RUN;
                                    }
                                  }
                                  else {
                                    active[7]=1;
                                    ends[7]=1;
                                    break RUN;
                                  }
                                }
                              }
                              else {
                                S5309=1;
                                if(bottleAtPos2.getprestatus()){//sysj\controller.sysj line: 96, column: 13
                                  System.out.println("FillerController: - Bottle detected at position 2.");//sysj\controller.sysj line: 97, column: 6
                                  S5354=0;
                                  S5316=0;
                                  if(!percentLiquid_in.isPartnerPresent() || percentLiquid_in.isPartnerPreempted()){//sysj\controller.sysj line: 98, column: 6
                                    percentLiquid_in.setACK(false);//sysj\controller.sysj line: 98, column: 6
                                    S5316=1;
                                    active[7]=1;
                                    ends[7]=1;
                                    break RUN;
                                  }
                                  else {
                                    S5311=0;
                                    if(!percentLiquid_in.isREQ()){//sysj\controller.sysj line: 98, column: 6
                                      percentLiquid_in.setACK(true);//sysj\controller.sysj line: 98, column: 6
                                      S5311=1;
                                      if(percentLiquid_in.isREQ()){//sysj\controller.sysj line: 98, column: 6
                                        percentLiquid_in.setACK(false);//sysj\controller.sysj line: 98, column: 6
                                        ends[7]=2;
                                        ;//sysj\controller.sysj line: 98, column: 6
                                        recPercentLiq_thread_7 = (ArrayList)(percentLiquid_in.getVal() == null ? null : ((ArrayList)percentLiquid_in.getVal()));//sysj\controller.sysj line: 99, column: 6
                                        canisterNum_thread_7 = 1;//sysj\controller.sysj line: 100, column: 6
                                        S5354=1;
                                        if(canisterNum_thread_7 < 5){//sysj\controller.sysj line: 102, column: 12
                                          S5385=0;
                                          System.out.println("selecting canister " + canisterNum_thread_7);//sysj\controller.sysj line: 105, column: 8
                                          selectCanister.setPresent();//sysj\controller.sysj line: 106, column: 9
                                          currsigs.addElement(selectCanister);
                                          selectCanister.setValue(canisterNum_thread_7);//sysj\controller.sysj line: 106, column: 9
                                          active[7]=1;
                                          ends[7]=1;
                                          break RUN;
                                        }
                                        else {
                                          ends[7]=2;
                                          ;//sysj\controller.sysj line: 102, column: 6
                                          S5354=2;
                                          S6157=0;
                                          if(!fillerStatus_o.isPartnerPresent() || fillerStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 134, column: 6
                                            fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 134, column: 6
                                            S6157=1;
                                            active[7]=1;
                                            ends[7]=1;
                                            break RUN;
                                          }
                                          else {
                                            S6152=0;
                                            if(fillerStatus_o.isACK()){//sysj\controller.sysj line: 134, column: 6
                                              fillerStatus_o.setVal("done");//sysj\controller.sysj line: 134, column: 6
                                              S6152=1;
                                              if(!fillerStatus_o.isACK()){//sysj\controller.sysj line: 134, column: 6
                                                fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 134, column: 6
                                                ends[7]=2;
                                                ;//sysj\controller.sysj line: 134, column: 6
                                                S5216=2;
                                                active[7]=1;
                                                ends[7]=1;
                                                break RUN;
                                              }
                                              else {
                                                active[7]=1;
                                                ends[7]=1;
                                                break RUN;
                                              }
                                            }
                                            else {
                                              active[7]=1;
                                              ends[7]=1;
                                              break RUN;
                                            }
                                          }
                                        }
                                      }
                                      else {
                                        active[7]=1;
                                        ends[7]=1;
                                        break RUN;
                                      }
                                    }
                                    else {
                                      active[7]=1;
                                      ends[7]=1;
                                      break RUN;
                                    }
                                  }
                                }
                                else {
                                  S5216=2;
                                  active[7]=1;
                                  ends[7]=1;
                                  break RUN;
                                }
                              }
                            }
                            else {
                              S5216=2;
                              active[7]=1;
                              ends[7]=1;
                              break RUN;
                            }
                          }
                          else {
                            active[7]=1;
                            ends[7]=1;
                            break RUN;
                          }
                        }
                        else {
                          active[7]=1;
                          ends[7]=1;
                          break RUN;
                        }
                      
                      case 1 : 
                        if(fillerReq_in.isREQ()){//sysj\controller.sysj line: 84, column: 3
                          fillerReq_in.setACK(false);//sysj\controller.sysj line: 84, column: 3
                          ends[7]=2;
                          ;//sysj\controller.sysj line: 84, column: 3
                          request_thread_7 = (fillerReq_in.getVal() == null ? null : ((Boolean)fillerReq_in.getVal()));//sysj\controller.sysj line: 85, column: 3
                          S5216=1;
                          if(request_thread_7){//sysj\controller.sysj line: 87, column: 3
                            System.out.println("FillerController: - Received request");//sysj\controller.sysj line: 89, column: 5
                            S5309=0;
                            if(!bottleAtPos2.getprestatus()){//sysj\controller.sysj line: 90, column: 13
                              System.out.println("FillerController: - Idle (no bottle at pos 2).");//sysj\controller.sysj line: 91, column: 6
                              S5223=0;
                              if(!fillerStatus_o.isPartnerPresent() || fillerStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 92, column: 6
                                fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 92, column: 6
                                S5223=1;
                                active[7]=1;
                                ends[7]=1;
                                break RUN;
                              }
                              else {
                                S5218=0;
                                if(fillerStatus_o.isACK()){//sysj\controller.sysj line: 92, column: 6
                                  fillerStatus_o.setVal("idle");//sysj\controller.sysj line: 92, column: 6
                                  S5218=1;
                                  if(!fillerStatus_o.isACK()){//sysj\controller.sysj line: 92, column: 6
                                    fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 92, column: 6
                                    ends[7]=2;
                                    ;//sysj\controller.sysj line: 92, column: 6
                                    S5309=1;
                                    if(bottleAtPos2.getprestatus()){//sysj\controller.sysj line: 96, column: 13
                                      System.out.println("FillerController: - Bottle detected at position 2.");//sysj\controller.sysj line: 97, column: 6
                                      S5354=0;
                                      S5316=0;
                                      if(!percentLiquid_in.isPartnerPresent() || percentLiquid_in.isPartnerPreempted()){//sysj\controller.sysj line: 98, column: 6
                                        percentLiquid_in.setACK(false);//sysj\controller.sysj line: 98, column: 6
                                        S5316=1;
                                        active[7]=1;
                                        ends[7]=1;
                                        break RUN;
                                      }
                                      else {
                                        S5311=0;
                                        if(!percentLiquid_in.isREQ()){//sysj\controller.sysj line: 98, column: 6
                                          percentLiquid_in.setACK(true);//sysj\controller.sysj line: 98, column: 6
                                          S5311=1;
                                          if(percentLiquid_in.isREQ()){//sysj\controller.sysj line: 98, column: 6
                                            percentLiquid_in.setACK(false);//sysj\controller.sysj line: 98, column: 6
                                            ends[7]=2;
                                            ;//sysj\controller.sysj line: 98, column: 6
                                            recPercentLiq_thread_7 = (ArrayList)(percentLiquid_in.getVal() == null ? null : ((ArrayList)percentLiquid_in.getVal()));//sysj\controller.sysj line: 99, column: 6
                                            canisterNum_thread_7 = 1;//sysj\controller.sysj line: 100, column: 6
                                            S5354=1;
                                            if(canisterNum_thread_7 < 5){//sysj\controller.sysj line: 102, column: 12
                                              S5385=0;
                                              System.out.println("selecting canister " + canisterNum_thread_7);//sysj\controller.sysj line: 105, column: 8
                                              selectCanister.setPresent();//sysj\controller.sysj line: 106, column: 9
                                              currsigs.addElement(selectCanister);
                                              selectCanister.setValue(canisterNum_thread_7);//sysj\controller.sysj line: 106, column: 9
                                              active[7]=1;
                                              ends[7]=1;
                                              break RUN;
                                            }
                                            else {
                                              ends[7]=2;
                                              ;//sysj\controller.sysj line: 102, column: 6
                                              S5354=2;
                                              S6157=0;
                                              if(!fillerStatus_o.isPartnerPresent() || fillerStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 134, column: 6
                                                fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 134, column: 6
                                                S6157=1;
                                                active[7]=1;
                                                ends[7]=1;
                                                break RUN;
                                              }
                                              else {
                                                S6152=0;
                                                if(fillerStatus_o.isACK()){//sysj\controller.sysj line: 134, column: 6
                                                  fillerStatus_o.setVal("done");//sysj\controller.sysj line: 134, column: 6
                                                  S6152=1;
                                                  if(!fillerStatus_o.isACK()){//sysj\controller.sysj line: 134, column: 6
                                                    fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 134, column: 6
                                                    ends[7]=2;
                                                    ;//sysj\controller.sysj line: 134, column: 6
                                                    S5216=2;
                                                    active[7]=1;
                                                    ends[7]=1;
                                                    break RUN;
                                                  }
                                                  else {
                                                    active[7]=1;
                                                    ends[7]=1;
                                                    break RUN;
                                                  }
                                                }
                                                else {
                                                  active[7]=1;
                                                  ends[7]=1;
                                                  break RUN;
                                                }
                                              }
                                            }
                                          }
                                          else {
                                            active[7]=1;
                                            ends[7]=1;
                                            break RUN;
                                          }
                                        }
                                        else {
                                          active[7]=1;
                                          ends[7]=1;
                                          break RUN;
                                        }
                                      }
                                    }
                                    else {
                                      S5216=2;
                                      active[7]=1;
                                      ends[7]=1;
                                      break RUN;
                                    }
                                  }
                                  else {
                                    active[7]=1;
                                    ends[7]=1;
                                    break RUN;
                                  }
                                }
                                else {
                                  active[7]=1;
                                  ends[7]=1;
                                  break RUN;
                                }
                              }
                            }
                            else {
                              S5309=1;
                              if(bottleAtPos2.getprestatus()){//sysj\controller.sysj line: 96, column: 13
                                System.out.println("FillerController: - Bottle detected at position 2.");//sysj\controller.sysj line: 97, column: 6
                                S5354=0;
                                S5316=0;
                                if(!percentLiquid_in.isPartnerPresent() || percentLiquid_in.isPartnerPreempted()){//sysj\controller.sysj line: 98, column: 6
                                  percentLiquid_in.setACK(false);//sysj\controller.sysj line: 98, column: 6
                                  S5316=1;
                                  active[7]=1;
                                  ends[7]=1;
                                  break RUN;
                                }
                                else {
                                  S5311=0;
                                  if(!percentLiquid_in.isREQ()){//sysj\controller.sysj line: 98, column: 6
                                    percentLiquid_in.setACK(true);//sysj\controller.sysj line: 98, column: 6
                                    S5311=1;
                                    if(percentLiquid_in.isREQ()){//sysj\controller.sysj line: 98, column: 6
                                      percentLiquid_in.setACK(false);//sysj\controller.sysj line: 98, column: 6
                                      ends[7]=2;
                                      ;//sysj\controller.sysj line: 98, column: 6
                                      recPercentLiq_thread_7 = (ArrayList)(percentLiquid_in.getVal() == null ? null : ((ArrayList)percentLiquid_in.getVal()));//sysj\controller.sysj line: 99, column: 6
                                      canisterNum_thread_7 = 1;//sysj\controller.sysj line: 100, column: 6
                                      S5354=1;
                                      if(canisterNum_thread_7 < 5){//sysj\controller.sysj line: 102, column: 12
                                        S5385=0;
                                        System.out.println("selecting canister " + canisterNum_thread_7);//sysj\controller.sysj line: 105, column: 8
                                        selectCanister.setPresent();//sysj\controller.sysj line: 106, column: 9
                                        currsigs.addElement(selectCanister);
                                        selectCanister.setValue(canisterNum_thread_7);//sysj\controller.sysj line: 106, column: 9
                                        active[7]=1;
                                        ends[7]=1;
                                        break RUN;
                                      }
                                      else {
                                        ends[7]=2;
                                        ;//sysj\controller.sysj line: 102, column: 6
                                        S5354=2;
                                        S6157=0;
                                        if(!fillerStatus_o.isPartnerPresent() || fillerStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 134, column: 6
                                          fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 134, column: 6
                                          S6157=1;
                                          active[7]=1;
                                          ends[7]=1;
                                          break RUN;
                                        }
                                        else {
                                          S6152=0;
                                          if(fillerStatus_o.isACK()){//sysj\controller.sysj line: 134, column: 6
                                            fillerStatus_o.setVal("done");//sysj\controller.sysj line: 134, column: 6
                                            S6152=1;
                                            if(!fillerStatus_o.isACK()){//sysj\controller.sysj line: 134, column: 6
                                              fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 134, column: 6
                                              ends[7]=2;
                                              ;//sysj\controller.sysj line: 134, column: 6
                                              S5216=2;
                                              active[7]=1;
                                              ends[7]=1;
                                              break RUN;
                                            }
                                            else {
                                              active[7]=1;
                                              ends[7]=1;
                                              break RUN;
                                            }
                                          }
                                          else {
                                            active[7]=1;
                                            ends[7]=1;
                                            break RUN;
                                          }
                                        }
                                      }
                                    }
                                    else {
                                      active[7]=1;
                                      ends[7]=1;
                                      break RUN;
                                    }
                                  }
                                  else {
                                    active[7]=1;
                                    ends[7]=1;
                                    break RUN;
                                  }
                                }
                              }
                              else {
                                S5216=2;
                                active[7]=1;
                                ends[7]=1;
                                break RUN;
                              }
                            }
                          }
                          else {
                            S5216=2;
                            active[7]=1;
                            ends[7]=1;
                            break RUN;
                          }
                        }
                        else {
                          active[7]=1;
                          ends[7]=1;
                          break RUN;
                        }
                      
                    }
                  }
                  break;
                
                case 1 : 
                  S5200=1;
                  S5200=0;
                  if(!fillerReq_in.isPartnerPresent() || fillerReq_in.isPartnerPreempted()){//sysj\controller.sysj line: 84, column: 3
                    fillerReq_in.setACK(false);//sysj\controller.sysj line: 84, column: 3
                    S5200=1;
                    active[7]=1;
                    ends[7]=1;
                    break RUN;
                  }
                  else {
                    S5195=0;
                    if(!fillerReq_in.isREQ()){//sysj\controller.sysj line: 84, column: 3
                      fillerReq_in.setACK(true);//sysj\controller.sysj line: 84, column: 3
                      S5195=1;
                      if(fillerReq_in.isREQ()){//sysj\controller.sysj line: 84, column: 3
                        fillerReq_in.setACK(false);//sysj\controller.sysj line: 84, column: 3
                        ends[7]=2;
                        ;//sysj\controller.sysj line: 84, column: 3
                        request_thread_7 = (fillerReq_in.getVal() == null ? null : ((Boolean)fillerReq_in.getVal()));//sysj\controller.sysj line: 85, column: 3
                        S5216=1;
                        if(request_thread_7){//sysj\controller.sysj line: 87, column: 3
                          System.out.println("FillerController: - Received request");//sysj\controller.sysj line: 89, column: 5
                          S5309=0;
                          if(!bottleAtPos2.getprestatus()){//sysj\controller.sysj line: 90, column: 13
                            System.out.println("FillerController: - Idle (no bottle at pos 2).");//sysj\controller.sysj line: 91, column: 6
                            S5223=0;
                            if(!fillerStatus_o.isPartnerPresent() || fillerStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 92, column: 6
                              fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 92, column: 6
                              S5223=1;
                              active[7]=1;
                              ends[7]=1;
                              break RUN;
                            }
                            else {
                              S5218=0;
                              if(fillerStatus_o.isACK()){//sysj\controller.sysj line: 92, column: 6
                                fillerStatus_o.setVal("idle");//sysj\controller.sysj line: 92, column: 6
                                S5218=1;
                                if(!fillerStatus_o.isACK()){//sysj\controller.sysj line: 92, column: 6
                                  fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 92, column: 6
                                  ends[7]=2;
                                  ;//sysj\controller.sysj line: 92, column: 6
                                  S5309=1;
                                  if(bottleAtPos2.getprestatus()){//sysj\controller.sysj line: 96, column: 13
                                    System.out.println("FillerController: - Bottle detected at position 2.");//sysj\controller.sysj line: 97, column: 6
                                    S5354=0;
                                    S5316=0;
                                    if(!percentLiquid_in.isPartnerPresent() || percentLiquid_in.isPartnerPreempted()){//sysj\controller.sysj line: 98, column: 6
                                      percentLiquid_in.setACK(false);//sysj\controller.sysj line: 98, column: 6
                                      S5316=1;
                                      active[7]=1;
                                      ends[7]=1;
                                      break RUN;
                                    }
                                    else {
                                      S5311=0;
                                      if(!percentLiquid_in.isREQ()){//sysj\controller.sysj line: 98, column: 6
                                        percentLiquid_in.setACK(true);//sysj\controller.sysj line: 98, column: 6
                                        S5311=1;
                                        if(percentLiquid_in.isREQ()){//sysj\controller.sysj line: 98, column: 6
                                          percentLiquid_in.setACK(false);//sysj\controller.sysj line: 98, column: 6
                                          ends[7]=2;
                                          ;//sysj\controller.sysj line: 98, column: 6
                                          recPercentLiq_thread_7 = (ArrayList)(percentLiquid_in.getVal() == null ? null : ((ArrayList)percentLiquid_in.getVal()));//sysj\controller.sysj line: 99, column: 6
                                          canisterNum_thread_7 = 1;//sysj\controller.sysj line: 100, column: 6
                                          S5354=1;
                                          if(canisterNum_thread_7 < 5){//sysj\controller.sysj line: 102, column: 12
                                            S5385=0;
                                            System.out.println("selecting canister " + canisterNum_thread_7);//sysj\controller.sysj line: 105, column: 8
                                            selectCanister.setPresent();//sysj\controller.sysj line: 106, column: 9
                                            currsigs.addElement(selectCanister);
                                            selectCanister.setValue(canisterNum_thread_7);//sysj\controller.sysj line: 106, column: 9
                                            active[7]=1;
                                            ends[7]=1;
                                            break RUN;
                                          }
                                          else {
                                            ends[7]=2;
                                            ;//sysj\controller.sysj line: 102, column: 6
                                            S5354=2;
                                            S6157=0;
                                            if(!fillerStatus_o.isPartnerPresent() || fillerStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 134, column: 6
                                              fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 134, column: 6
                                              S6157=1;
                                              active[7]=1;
                                              ends[7]=1;
                                              break RUN;
                                            }
                                            else {
                                              S6152=0;
                                              if(fillerStatus_o.isACK()){//sysj\controller.sysj line: 134, column: 6
                                                fillerStatus_o.setVal("done");//sysj\controller.sysj line: 134, column: 6
                                                S6152=1;
                                                if(!fillerStatus_o.isACK()){//sysj\controller.sysj line: 134, column: 6
                                                  fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 134, column: 6
                                                  ends[7]=2;
                                                  ;//sysj\controller.sysj line: 134, column: 6
                                                  S5216=2;
                                                  active[7]=1;
                                                  ends[7]=1;
                                                  break RUN;
                                                }
                                                else {
                                                  active[7]=1;
                                                  ends[7]=1;
                                                  break RUN;
                                                }
                                              }
                                              else {
                                                active[7]=1;
                                                ends[7]=1;
                                                break RUN;
                                              }
                                            }
                                          }
                                        }
                                        else {
                                          active[7]=1;
                                          ends[7]=1;
                                          break RUN;
                                        }
                                      }
                                      else {
                                        active[7]=1;
                                        ends[7]=1;
                                        break RUN;
                                      }
                                    }
                                  }
                                  else {
                                    S5216=2;
                                    active[7]=1;
                                    ends[7]=1;
                                    break RUN;
                                  }
                                }
                                else {
                                  active[7]=1;
                                  ends[7]=1;
                                  break RUN;
                                }
                              }
                              else {
                                active[7]=1;
                                ends[7]=1;
                                break RUN;
                              }
                            }
                          }
                          else {
                            S5309=1;
                            if(bottleAtPos2.getprestatus()){//sysj\controller.sysj line: 96, column: 13
                              System.out.println("FillerController: - Bottle detected at position 2.");//sysj\controller.sysj line: 97, column: 6
                              S5354=0;
                              S5316=0;
                              if(!percentLiquid_in.isPartnerPresent() || percentLiquid_in.isPartnerPreempted()){//sysj\controller.sysj line: 98, column: 6
                                percentLiquid_in.setACK(false);//sysj\controller.sysj line: 98, column: 6
                                S5316=1;
                                active[7]=1;
                                ends[7]=1;
                                break RUN;
                              }
                              else {
                                S5311=0;
                                if(!percentLiquid_in.isREQ()){//sysj\controller.sysj line: 98, column: 6
                                  percentLiquid_in.setACK(true);//sysj\controller.sysj line: 98, column: 6
                                  S5311=1;
                                  if(percentLiquid_in.isREQ()){//sysj\controller.sysj line: 98, column: 6
                                    percentLiquid_in.setACK(false);//sysj\controller.sysj line: 98, column: 6
                                    ends[7]=2;
                                    ;//sysj\controller.sysj line: 98, column: 6
                                    recPercentLiq_thread_7 = (ArrayList)(percentLiquid_in.getVal() == null ? null : ((ArrayList)percentLiquid_in.getVal()));//sysj\controller.sysj line: 99, column: 6
                                    canisterNum_thread_7 = 1;//sysj\controller.sysj line: 100, column: 6
                                    S5354=1;
                                    if(canisterNum_thread_7 < 5){//sysj\controller.sysj line: 102, column: 12
                                      S5385=0;
                                      System.out.println("selecting canister " + canisterNum_thread_7);//sysj\controller.sysj line: 105, column: 8
                                      selectCanister.setPresent();//sysj\controller.sysj line: 106, column: 9
                                      currsigs.addElement(selectCanister);
                                      selectCanister.setValue(canisterNum_thread_7);//sysj\controller.sysj line: 106, column: 9
                                      active[7]=1;
                                      ends[7]=1;
                                      break RUN;
                                    }
                                    else {
                                      ends[7]=2;
                                      ;//sysj\controller.sysj line: 102, column: 6
                                      S5354=2;
                                      S6157=0;
                                      if(!fillerStatus_o.isPartnerPresent() || fillerStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 134, column: 6
                                        fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 134, column: 6
                                        S6157=1;
                                        active[7]=1;
                                        ends[7]=1;
                                        break RUN;
                                      }
                                      else {
                                        S6152=0;
                                        if(fillerStatus_o.isACK()){//sysj\controller.sysj line: 134, column: 6
                                          fillerStatus_o.setVal("done");//sysj\controller.sysj line: 134, column: 6
                                          S6152=1;
                                          if(!fillerStatus_o.isACK()){//sysj\controller.sysj line: 134, column: 6
                                            fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 134, column: 6
                                            ends[7]=2;
                                            ;//sysj\controller.sysj line: 134, column: 6
                                            S5216=2;
                                            active[7]=1;
                                            ends[7]=1;
                                            break RUN;
                                          }
                                          else {
                                            active[7]=1;
                                            ends[7]=1;
                                            break RUN;
                                          }
                                        }
                                        else {
                                          active[7]=1;
                                          ends[7]=1;
                                          break RUN;
                                        }
                                      }
                                    }
                                  }
                                  else {
                                    active[7]=1;
                                    ends[7]=1;
                                    break RUN;
                                  }
                                }
                                else {
                                  active[7]=1;
                                  ends[7]=1;
                                  break RUN;
                                }
                              }
                            }
                            else {
                              S5216=2;
                              active[7]=1;
                              ends[7]=1;
                              break RUN;
                            }
                          }
                        }
                        else {
                          S5216=2;
                          active[7]=1;
                          ends[7]=1;
                          break RUN;
                        }
                      }
                      else {
                        active[7]=1;
                        ends[7]=1;
                        break RUN;
                      }
                    }
                    else {
                      active[7]=1;
                      ends[7]=1;
                      break RUN;
                    }
                  }
                
              }
              break;
            
            case 1 : 
              switch(S5309){
                case 0 : 
                  switch(S5223){
                    case 0 : 
                      if(!fillerStatus_o.isPartnerPresent() || fillerStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 92, column: 6
                        fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 92, column: 6
                        S5223=1;
                        active[7]=1;
                        ends[7]=1;
                        break RUN;
                      }
                      else {
                        switch(S5218){
                          case 0 : 
                            if(fillerStatus_o.isACK()){//sysj\controller.sysj line: 92, column: 6
                              fillerStatus_o.setVal("idle");//sysj\controller.sysj line: 92, column: 6
                              S5218=1;
                              if(!fillerStatus_o.isACK()){//sysj\controller.sysj line: 92, column: 6
                                fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 92, column: 6
                                ends[7]=2;
                                ;//sysj\controller.sysj line: 92, column: 6
                                S5309=1;
                                if(bottleAtPos2.getprestatus()){//sysj\controller.sysj line: 96, column: 13
                                  System.out.println("FillerController: - Bottle detected at position 2.");//sysj\controller.sysj line: 97, column: 6
                                  S5354=0;
                                  S5316=0;
                                  if(!percentLiquid_in.isPartnerPresent() || percentLiquid_in.isPartnerPreempted()){//sysj\controller.sysj line: 98, column: 6
                                    percentLiquid_in.setACK(false);//sysj\controller.sysj line: 98, column: 6
                                    S5316=1;
                                    active[7]=1;
                                    ends[7]=1;
                                    break RUN;
                                  }
                                  else {
                                    S5311=0;
                                    if(!percentLiquid_in.isREQ()){//sysj\controller.sysj line: 98, column: 6
                                      percentLiquid_in.setACK(true);//sysj\controller.sysj line: 98, column: 6
                                      S5311=1;
                                      if(percentLiquid_in.isREQ()){//sysj\controller.sysj line: 98, column: 6
                                        percentLiquid_in.setACK(false);//sysj\controller.sysj line: 98, column: 6
                                        ends[7]=2;
                                        ;//sysj\controller.sysj line: 98, column: 6
                                        recPercentLiq_thread_7 = (ArrayList)(percentLiquid_in.getVal() == null ? null : ((ArrayList)percentLiquid_in.getVal()));//sysj\controller.sysj line: 99, column: 6
                                        canisterNum_thread_7 = 1;//sysj\controller.sysj line: 100, column: 6
                                        S5354=1;
                                        if(canisterNum_thread_7 < 5){//sysj\controller.sysj line: 102, column: 12
                                          S5385=0;
                                          System.out.println("selecting canister " + canisterNum_thread_7);//sysj\controller.sysj line: 105, column: 8
                                          selectCanister.setPresent();//sysj\controller.sysj line: 106, column: 9
                                          currsigs.addElement(selectCanister);
                                          selectCanister.setValue(canisterNum_thread_7);//sysj\controller.sysj line: 106, column: 9
                                          active[7]=1;
                                          ends[7]=1;
                                          break RUN;
                                        }
                                        else {
                                          ends[7]=2;
                                          ;//sysj\controller.sysj line: 102, column: 6
                                          S5354=2;
                                          S6157=0;
                                          if(!fillerStatus_o.isPartnerPresent() || fillerStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 134, column: 6
                                            fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 134, column: 6
                                            S6157=1;
                                            active[7]=1;
                                            ends[7]=1;
                                            break RUN;
                                          }
                                          else {
                                            S6152=0;
                                            if(fillerStatus_o.isACK()){//sysj\controller.sysj line: 134, column: 6
                                              fillerStatus_o.setVal("done");//sysj\controller.sysj line: 134, column: 6
                                              S6152=1;
                                              if(!fillerStatus_o.isACK()){//sysj\controller.sysj line: 134, column: 6
                                                fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 134, column: 6
                                                ends[7]=2;
                                                ;//sysj\controller.sysj line: 134, column: 6
                                                S5216=2;
                                                active[7]=1;
                                                ends[7]=1;
                                                break RUN;
                                              }
                                              else {
                                                active[7]=1;
                                                ends[7]=1;
                                                break RUN;
                                              }
                                            }
                                            else {
                                              active[7]=1;
                                              ends[7]=1;
                                              break RUN;
                                            }
                                          }
                                        }
                                      }
                                      else {
                                        active[7]=1;
                                        ends[7]=1;
                                        break RUN;
                                      }
                                    }
                                    else {
                                      active[7]=1;
                                      ends[7]=1;
                                      break RUN;
                                    }
                                  }
                                }
                                else {
                                  S5216=2;
                                  active[7]=1;
                                  ends[7]=1;
                                  break RUN;
                                }
                              }
                              else {
                                active[7]=1;
                                ends[7]=1;
                                break RUN;
                              }
                            }
                            else {
                              active[7]=1;
                              ends[7]=1;
                              break RUN;
                            }
                          
                          case 1 : 
                            if(!fillerStatus_o.isACK()){//sysj\controller.sysj line: 92, column: 6
                              fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 92, column: 6
                              ends[7]=2;
                              ;//sysj\controller.sysj line: 92, column: 6
                              S5309=1;
                              if(bottleAtPos2.getprestatus()){//sysj\controller.sysj line: 96, column: 13
                                System.out.println("FillerController: - Bottle detected at position 2.");//sysj\controller.sysj line: 97, column: 6
                                S5354=0;
                                S5316=0;
                                if(!percentLiquid_in.isPartnerPresent() || percentLiquid_in.isPartnerPreempted()){//sysj\controller.sysj line: 98, column: 6
                                  percentLiquid_in.setACK(false);//sysj\controller.sysj line: 98, column: 6
                                  S5316=1;
                                  active[7]=1;
                                  ends[7]=1;
                                  break RUN;
                                }
                                else {
                                  S5311=0;
                                  if(!percentLiquid_in.isREQ()){//sysj\controller.sysj line: 98, column: 6
                                    percentLiquid_in.setACK(true);//sysj\controller.sysj line: 98, column: 6
                                    S5311=1;
                                    if(percentLiquid_in.isREQ()){//sysj\controller.sysj line: 98, column: 6
                                      percentLiquid_in.setACK(false);//sysj\controller.sysj line: 98, column: 6
                                      ends[7]=2;
                                      ;//sysj\controller.sysj line: 98, column: 6
                                      recPercentLiq_thread_7 = (ArrayList)(percentLiquid_in.getVal() == null ? null : ((ArrayList)percentLiquid_in.getVal()));//sysj\controller.sysj line: 99, column: 6
                                      canisterNum_thread_7 = 1;//sysj\controller.sysj line: 100, column: 6
                                      S5354=1;
                                      if(canisterNum_thread_7 < 5){//sysj\controller.sysj line: 102, column: 12
                                        S5385=0;
                                        System.out.println("selecting canister " + canisterNum_thread_7);//sysj\controller.sysj line: 105, column: 8
                                        selectCanister.setPresent();//sysj\controller.sysj line: 106, column: 9
                                        currsigs.addElement(selectCanister);
                                        selectCanister.setValue(canisterNum_thread_7);//sysj\controller.sysj line: 106, column: 9
                                        active[7]=1;
                                        ends[7]=1;
                                        break RUN;
                                      }
                                      else {
                                        ends[7]=2;
                                        ;//sysj\controller.sysj line: 102, column: 6
                                        S5354=2;
                                        S6157=0;
                                        if(!fillerStatus_o.isPartnerPresent() || fillerStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 134, column: 6
                                          fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 134, column: 6
                                          S6157=1;
                                          active[7]=1;
                                          ends[7]=1;
                                          break RUN;
                                        }
                                        else {
                                          S6152=0;
                                          if(fillerStatus_o.isACK()){//sysj\controller.sysj line: 134, column: 6
                                            fillerStatus_o.setVal("done");//sysj\controller.sysj line: 134, column: 6
                                            S6152=1;
                                            if(!fillerStatus_o.isACK()){//sysj\controller.sysj line: 134, column: 6
                                              fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 134, column: 6
                                              ends[7]=2;
                                              ;//sysj\controller.sysj line: 134, column: 6
                                              S5216=2;
                                              active[7]=1;
                                              ends[7]=1;
                                              break RUN;
                                            }
                                            else {
                                              active[7]=1;
                                              ends[7]=1;
                                              break RUN;
                                            }
                                          }
                                          else {
                                            active[7]=1;
                                            ends[7]=1;
                                            break RUN;
                                          }
                                        }
                                      }
                                    }
                                    else {
                                      active[7]=1;
                                      ends[7]=1;
                                      break RUN;
                                    }
                                  }
                                  else {
                                    active[7]=1;
                                    ends[7]=1;
                                    break RUN;
                                  }
                                }
                              }
                              else {
                                S5216=2;
                                active[7]=1;
                                ends[7]=1;
                                break RUN;
                              }
                            }
                            else {
                              active[7]=1;
                              ends[7]=1;
                              break RUN;
                            }
                          
                        }
                      }
                      break;
                    
                    case 1 : 
                      S5223=1;
                      S5223=0;
                      if(!fillerStatus_o.isPartnerPresent() || fillerStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 92, column: 6
                        fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 92, column: 6
                        S5223=1;
                        active[7]=1;
                        ends[7]=1;
                        break RUN;
                      }
                      else {
                        S5218=0;
                        if(fillerStatus_o.isACK()){//sysj\controller.sysj line: 92, column: 6
                          fillerStatus_o.setVal("idle");//sysj\controller.sysj line: 92, column: 6
                          S5218=1;
                          if(!fillerStatus_o.isACK()){//sysj\controller.sysj line: 92, column: 6
                            fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 92, column: 6
                            ends[7]=2;
                            ;//sysj\controller.sysj line: 92, column: 6
                            S5309=1;
                            if(bottleAtPos2.getprestatus()){//sysj\controller.sysj line: 96, column: 13
                              System.out.println("FillerController: - Bottle detected at position 2.");//sysj\controller.sysj line: 97, column: 6
                              S5354=0;
                              S5316=0;
                              if(!percentLiquid_in.isPartnerPresent() || percentLiquid_in.isPartnerPreempted()){//sysj\controller.sysj line: 98, column: 6
                                percentLiquid_in.setACK(false);//sysj\controller.sysj line: 98, column: 6
                                S5316=1;
                                active[7]=1;
                                ends[7]=1;
                                break RUN;
                              }
                              else {
                                S5311=0;
                                if(!percentLiquid_in.isREQ()){//sysj\controller.sysj line: 98, column: 6
                                  percentLiquid_in.setACK(true);//sysj\controller.sysj line: 98, column: 6
                                  S5311=1;
                                  if(percentLiquid_in.isREQ()){//sysj\controller.sysj line: 98, column: 6
                                    percentLiquid_in.setACK(false);//sysj\controller.sysj line: 98, column: 6
                                    ends[7]=2;
                                    ;//sysj\controller.sysj line: 98, column: 6
                                    recPercentLiq_thread_7 = (ArrayList)(percentLiquid_in.getVal() == null ? null : ((ArrayList)percentLiquid_in.getVal()));//sysj\controller.sysj line: 99, column: 6
                                    canisterNum_thread_7 = 1;//sysj\controller.sysj line: 100, column: 6
                                    S5354=1;
                                    if(canisterNum_thread_7 < 5){//sysj\controller.sysj line: 102, column: 12
                                      S5385=0;
                                      System.out.println("selecting canister " + canisterNum_thread_7);//sysj\controller.sysj line: 105, column: 8
                                      selectCanister.setPresent();//sysj\controller.sysj line: 106, column: 9
                                      currsigs.addElement(selectCanister);
                                      selectCanister.setValue(canisterNum_thread_7);//sysj\controller.sysj line: 106, column: 9
                                      active[7]=1;
                                      ends[7]=1;
                                      break RUN;
                                    }
                                    else {
                                      ends[7]=2;
                                      ;//sysj\controller.sysj line: 102, column: 6
                                      S5354=2;
                                      S6157=0;
                                      if(!fillerStatus_o.isPartnerPresent() || fillerStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 134, column: 6
                                        fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 134, column: 6
                                        S6157=1;
                                        active[7]=1;
                                        ends[7]=1;
                                        break RUN;
                                      }
                                      else {
                                        S6152=0;
                                        if(fillerStatus_o.isACK()){//sysj\controller.sysj line: 134, column: 6
                                          fillerStatus_o.setVal("done");//sysj\controller.sysj line: 134, column: 6
                                          S6152=1;
                                          if(!fillerStatus_o.isACK()){//sysj\controller.sysj line: 134, column: 6
                                            fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 134, column: 6
                                            ends[7]=2;
                                            ;//sysj\controller.sysj line: 134, column: 6
                                            S5216=2;
                                            active[7]=1;
                                            ends[7]=1;
                                            break RUN;
                                          }
                                          else {
                                            active[7]=1;
                                            ends[7]=1;
                                            break RUN;
                                          }
                                        }
                                        else {
                                          active[7]=1;
                                          ends[7]=1;
                                          break RUN;
                                        }
                                      }
                                    }
                                  }
                                  else {
                                    active[7]=1;
                                    ends[7]=1;
                                    break RUN;
                                  }
                                }
                                else {
                                  active[7]=1;
                                  ends[7]=1;
                                  break RUN;
                                }
                              }
                            }
                            else {
                              S5216=2;
                              active[7]=1;
                              ends[7]=1;
                              break RUN;
                            }
                          }
                          else {
                            active[7]=1;
                            ends[7]=1;
                            break RUN;
                          }
                        }
                        else {
                          active[7]=1;
                          ends[7]=1;
                          break RUN;
                        }
                      }
                    
                  }
                  break;
                
                case 1 : 
                  switch(S5354){
                    case 0 : 
                      switch(S5316){
                        case 0 : 
                          if(!percentLiquid_in.isPartnerPresent() || percentLiquid_in.isPartnerPreempted()){//sysj\controller.sysj line: 98, column: 6
                            percentLiquid_in.setACK(false);//sysj\controller.sysj line: 98, column: 6
                            S5316=1;
                            active[7]=1;
                            ends[7]=1;
                            break RUN;
                          }
                          else {
                            switch(S5311){
                              case 0 : 
                                if(!percentLiquid_in.isREQ()){//sysj\controller.sysj line: 98, column: 6
                                  percentLiquid_in.setACK(true);//sysj\controller.sysj line: 98, column: 6
                                  S5311=1;
                                  if(percentLiquid_in.isREQ()){//sysj\controller.sysj line: 98, column: 6
                                    percentLiquid_in.setACK(false);//sysj\controller.sysj line: 98, column: 6
                                    ends[7]=2;
                                    ;//sysj\controller.sysj line: 98, column: 6
                                    recPercentLiq_thread_7 = (ArrayList)(percentLiquid_in.getVal() == null ? null : ((ArrayList)percentLiquid_in.getVal()));//sysj\controller.sysj line: 99, column: 6
                                    canisterNum_thread_7 = 1;//sysj\controller.sysj line: 100, column: 6
                                    S5354=1;
                                    if(canisterNum_thread_7 < 5){//sysj\controller.sysj line: 102, column: 12
                                      S5385=0;
                                      System.out.println("selecting canister " + canisterNum_thread_7);//sysj\controller.sysj line: 105, column: 8
                                      selectCanister.setPresent();//sysj\controller.sysj line: 106, column: 9
                                      currsigs.addElement(selectCanister);
                                      selectCanister.setValue(canisterNum_thread_7);//sysj\controller.sysj line: 106, column: 9
                                      active[7]=1;
                                      ends[7]=1;
                                      break RUN;
                                    }
                                    else {
                                      ends[7]=2;
                                      ;//sysj\controller.sysj line: 102, column: 6
                                      S5354=2;
                                      S6157=0;
                                      if(!fillerStatus_o.isPartnerPresent() || fillerStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 134, column: 6
                                        fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 134, column: 6
                                        S6157=1;
                                        active[7]=1;
                                        ends[7]=1;
                                        break RUN;
                                      }
                                      else {
                                        S6152=0;
                                        if(fillerStatus_o.isACK()){//sysj\controller.sysj line: 134, column: 6
                                          fillerStatus_o.setVal("done");//sysj\controller.sysj line: 134, column: 6
                                          S6152=1;
                                          if(!fillerStatus_o.isACK()){//sysj\controller.sysj line: 134, column: 6
                                            fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 134, column: 6
                                            ends[7]=2;
                                            ;//sysj\controller.sysj line: 134, column: 6
                                            S5216=2;
                                            active[7]=1;
                                            ends[7]=1;
                                            break RUN;
                                          }
                                          else {
                                            active[7]=1;
                                            ends[7]=1;
                                            break RUN;
                                          }
                                        }
                                        else {
                                          active[7]=1;
                                          ends[7]=1;
                                          break RUN;
                                        }
                                      }
                                    }
                                  }
                                  else {
                                    active[7]=1;
                                    ends[7]=1;
                                    break RUN;
                                  }
                                }
                                else {
                                  active[7]=1;
                                  ends[7]=1;
                                  break RUN;
                                }
                              
                              case 1 : 
                                if(percentLiquid_in.isREQ()){//sysj\controller.sysj line: 98, column: 6
                                  percentLiquid_in.setACK(false);//sysj\controller.sysj line: 98, column: 6
                                  ends[7]=2;
                                  ;//sysj\controller.sysj line: 98, column: 6
                                  recPercentLiq_thread_7 = (ArrayList)(percentLiquid_in.getVal() == null ? null : ((ArrayList)percentLiquid_in.getVal()));//sysj\controller.sysj line: 99, column: 6
                                  canisterNum_thread_7 = 1;//sysj\controller.sysj line: 100, column: 6
                                  S5354=1;
                                  if(canisterNum_thread_7 < 5){//sysj\controller.sysj line: 102, column: 12
                                    S5385=0;
                                    System.out.println("selecting canister " + canisterNum_thread_7);//sysj\controller.sysj line: 105, column: 8
                                    selectCanister.setPresent();//sysj\controller.sysj line: 106, column: 9
                                    currsigs.addElement(selectCanister);
                                    selectCanister.setValue(canisterNum_thread_7);//sysj\controller.sysj line: 106, column: 9
                                    active[7]=1;
                                    ends[7]=1;
                                    break RUN;
                                  }
                                  else {
                                    ends[7]=2;
                                    ;//sysj\controller.sysj line: 102, column: 6
                                    S5354=2;
                                    S6157=0;
                                    if(!fillerStatus_o.isPartnerPresent() || fillerStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 134, column: 6
                                      fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 134, column: 6
                                      S6157=1;
                                      active[7]=1;
                                      ends[7]=1;
                                      break RUN;
                                    }
                                    else {
                                      S6152=0;
                                      if(fillerStatus_o.isACK()){//sysj\controller.sysj line: 134, column: 6
                                        fillerStatus_o.setVal("done");//sysj\controller.sysj line: 134, column: 6
                                        S6152=1;
                                        if(!fillerStatus_o.isACK()){//sysj\controller.sysj line: 134, column: 6
                                          fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 134, column: 6
                                          ends[7]=2;
                                          ;//sysj\controller.sysj line: 134, column: 6
                                          S5216=2;
                                          active[7]=1;
                                          ends[7]=1;
                                          break RUN;
                                        }
                                        else {
                                          active[7]=1;
                                          ends[7]=1;
                                          break RUN;
                                        }
                                      }
                                      else {
                                        active[7]=1;
                                        ends[7]=1;
                                        break RUN;
                                      }
                                    }
                                  }
                                }
                                else {
                                  active[7]=1;
                                  ends[7]=1;
                                  break RUN;
                                }
                              
                            }
                          }
                          break;
                        
                        case 1 : 
                          S5316=1;
                          S5316=0;
                          if(!percentLiquid_in.isPartnerPresent() || percentLiquid_in.isPartnerPreempted()){//sysj\controller.sysj line: 98, column: 6
                            percentLiquid_in.setACK(false);//sysj\controller.sysj line: 98, column: 6
                            S5316=1;
                            active[7]=1;
                            ends[7]=1;
                            break RUN;
                          }
                          else {
                            S5311=0;
                            if(!percentLiquid_in.isREQ()){//sysj\controller.sysj line: 98, column: 6
                              percentLiquid_in.setACK(true);//sysj\controller.sysj line: 98, column: 6
                              S5311=1;
                              if(percentLiquid_in.isREQ()){//sysj\controller.sysj line: 98, column: 6
                                percentLiquid_in.setACK(false);//sysj\controller.sysj line: 98, column: 6
                                ends[7]=2;
                                ;//sysj\controller.sysj line: 98, column: 6
                                recPercentLiq_thread_7 = (ArrayList)(percentLiquid_in.getVal() == null ? null : ((ArrayList)percentLiquid_in.getVal()));//sysj\controller.sysj line: 99, column: 6
                                canisterNum_thread_7 = 1;//sysj\controller.sysj line: 100, column: 6
                                S5354=1;
                                if(canisterNum_thread_7 < 5){//sysj\controller.sysj line: 102, column: 12
                                  S5385=0;
                                  System.out.println("selecting canister " + canisterNum_thread_7);//sysj\controller.sysj line: 105, column: 8
                                  selectCanister.setPresent();//sysj\controller.sysj line: 106, column: 9
                                  currsigs.addElement(selectCanister);
                                  selectCanister.setValue(canisterNum_thread_7);//sysj\controller.sysj line: 106, column: 9
                                  active[7]=1;
                                  ends[7]=1;
                                  break RUN;
                                }
                                else {
                                  ends[7]=2;
                                  ;//sysj\controller.sysj line: 102, column: 6
                                  S5354=2;
                                  S6157=0;
                                  if(!fillerStatus_o.isPartnerPresent() || fillerStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 134, column: 6
                                    fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 134, column: 6
                                    S6157=1;
                                    active[7]=1;
                                    ends[7]=1;
                                    break RUN;
                                  }
                                  else {
                                    S6152=0;
                                    if(fillerStatus_o.isACK()){//sysj\controller.sysj line: 134, column: 6
                                      fillerStatus_o.setVal("done");//sysj\controller.sysj line: 134, column: 6
                                      S6152=1;
                                      if(!fillerStatus_o.isACK()){//sysj\controller.sysj line: 134, column: 6
                                        fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 134, column: 6
                                        ends[7]=2;
                                        ;//sysj\controller.sysj line: 134, column: 6
                                        S5216=2;
                                        active[7]=1;
                                        ends[7]=1;
                                        break RUN;
                                      }
                                      else {
                                        active[7]=1;
                                        ends[7]=1;
                                        break RUN;
                                      }
                                    }
                                    else {
                                      active[7]=1;
                                      ends[7]=1;
                                      break RUN;
                                    }
                                  }
                                }
                              }
                              else {
                                active[7]=1;
                                ends[7]=1;
                                break RUN;
                              }
                            }
                            else {
                              active[7]=1;
                              ends[7]=1;
                              break RUN;
                            }
                          }
                        
                      }
                      break;
                    
                    case 1 : 
                      switch(S5385){
                        case 0 : 
                          if(selectedCanister.getprestatus()){//sysj\controller.sysj line: 104, column: 13
                            S5385=1;
                            thread77898(tdone,ends);
                            thread77899(tdone,ends);
                            int biggest77900 = 0;
                            if(ends[8]>=biggest77900){
                              biggest77900=ends[8];
                            }
                            if(ends[9]>=biggest77900){
                              biggest77900=ends[9];
                            }
                            if(biggest77900 == 1){
                              active[7]=1;
                              ends[7]=1;
                              break RUN;
                            }
                          }
                          else {
                            selectCanister.setPresent();//sysj\controller.sysj line: 106, column: 9
                            currsigs.addElement(selectCanister);
                            selectCanister.setValue(canisterNum_thread_7);//sysj\controller.sysj line: 106, column: 9
                            active[7]=1;
                            ends[7]=1;
                            break RUN;
                          }
                        
                        case 1 : 
                          if(!dosUnitEvac.getprestatus()){//sysj\controller.sysj line: 110, column: 14
                            System.out.println("Canister above bottle");//sysj\controller.sysj line: 113, column: 8
                            receivedPercentage.setPresent();//sysj\controller.sysj line: 117, column: 8
                            currsigs.addElement(receivedPercentage);
                            receivedPercentage.setValue(recPercentLiq_thread_7.get(canisterNum_thread_7 - 1));//sysj\controller.sysj line: 117, column: 8
                            S5385=2;
                            valveInletOnOff.setPresent();//sysj\controller.sysj line: 121, column: 9
                            currsigs.addElement(valveInletOnOff);
                            active[7]=1;
                            ends[7]=1;
                            break RUN;
                          }
                          else {
                            thread77901(tdone,ends);
                            thread77902(tdone,ends);
                            int biggest77903 = 0;
                            if(ends[8]>=biggest77903){
                              biggest77903=ends[8];
                            }
                            if(ends[9]>=biggest77903){
                              biggest77903=ends[9];
                            }
                            if(biggest77903 == 1){
                              active[7]=1;
                              ends[7]=1;
                              break RUN;
                            }
                            //FINXME code
                            if(biggest77903 == 0){
                              System.out.println("Canister above bottle");//sysj\controller.sysj line: 113, column: 8
                              receivedPercentage.setPresent();//sysj\controller.sysj line: 117, column: 8
                              currsigs.addElement(receivedPercentage);
                              receivedPercentage.setValue(recPercentLiq_thread_7.get(canisterNum_thread_7 - 1));//sysj\controller.sysj line: 117, column: 8
                              S5385=2;
                              valveInletOnOff.setPresent();//sysj\controller.sysj line: 121, column: 9
                              currsigs.addElement(valveInletOnOff);
                              active[7]=1;
                              ends[7]=1;
                              break RUN;
                            }
                          }
                        
                        case 2 : 
                          if(dosUnitFilled.getprestatus()){//sysj\controller.sysj line: 120, column: 14
                            System.out.println("Bottle controller filled");//sysj\controller.sysj line: 124, column: 8
                            S5385=3;
                            thread77904(tdone,ends);
                            thread77905(tdone,ends);
                            int biggest77906 = 0;
                            if(ends[10]>=biggest77906){
                              biggest77906=ends[10];
                            }
                            if(ends[11]>=biggest77906){
                              biggest77906=ends[11];
                            }
                            if(biggest77906 == 1){
                              active[7]=1;
                              ends[7]=1;
                              break RUN;
                            }
                          }
                          else {
                            valveInletOnOff.setPresent();//sysj\controller.sysj line: 121, column: 9
                            currsigs.addElement(valveInletOnOff);
                            active[7]=1;
                            ends[7]=1;
                            break RUN;
                          }
                        
                        case 3 : 
                          if(dosUnitEvac.getprestatus()){//sysj\controller.sysj line: 126, column: 14
                            System.out.println("Canister returned");//sysj\controller.sysj line: 129, column: 8
                            canisterNum_thread_7 += 1;//sysj\controller.sysj line: 131, column: 8
                            S5385=4;
                            active[7]=1;
                            ends[7]=1;
                            break RUN;
                          }
                          else {
                            thread77907(tdone,ends);
                            thread77908(tdone,ends);
                            int biggest77909 = 0;
                            if(ends[10]>=biggest77909){
                              biggest77909=ends[10];
                            }
                            if(ends[11]>=biggest77909){
                              biggest77909=ends[11];
                            }
                            if(biggest77909 == 1){
                              active[7]=1;
                              ends[7]=1;
                              break RUN;
                            }
                            //FINXME code
                            if(biggest77909 == 0){
                              System.out.println("Canister returned");//sysj\controller.sysj line: 129, column: 8
                              canisterNum_thread_7 += 1;//sysj\controller.sysj line: 131, column: 8
                              S5385=4;
                              active[7]=1;
                              ends[7]=1;
                              break RUN;
                            }
                          }
                        
                        case 4 : 
                          S5385=4;
                          if(canisterNum_thread_7 < 5){//sysj\controller.sysj line: 102, column: 12
                            S5385=0;
                            System.out.println("selecting canister " + canisterNum_thread_7);//sysj\controller.sysj line: 105, column: 8
                            selectCanister.setPresent();//sysj\controller.sysj line: 106, column: 9
                            currsigs.addElement(selectCanister);
                            selectCanister.setValue(canisterNum_thread_7);//sysj\controller.sysj line: 106, column: 9
                            active[7]=1;
                            ends[7]=1;
                            break RUN;
                          }
                          else {
                            ends[7]=2;
                            ;//sysj\controller.sysj line: 102, column: 6
                            S5354=2;
                            S6157=0;
                            if(!fillerStatus_o.isPartnerPresent() || fillerStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 134, column: 6
                              fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 134, column: 6
                              S6157=1;
                              active[7]=1;
                              ends[7]=1;
                              break RUN;
                            }
                            else {
                              S6152=0;
                              if(fillerStatus_o.isACK()){//sysj\controller.sysj line: 134, column: 6
                                fillerStatus_o.setVal("done");//sysj\controller.sysj line: 134, column: 6
                                S6152=1;
                                if(!fillerStatus_o.isACK()){//sysj\controller.sysj line: 134, column: 6
                                  fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 134, column: 6
                                  ends[7]=2;
                                  ;//sysj\controller.sysj line: 134, column: 6
                                  S5216=2;
                                  active[7]=1;
                                  ends[7]=1;
                                  break RUN;
                                }
                                else {
                                  active[7]=1;
                                  ends[7]=1;
                                  break RUN;
                                }
                              }
                              else {
                                active[7]=1;
                                ends[7]=1;
                                break RUN;
                              }
                            }
                          }
                        
                      }
                      break;
                    
                    case 2 : 
                      switch(S6157){
                        case 0 : 
                          if(!fillerStatus_o.isPartnerPresent() || fillerStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 134, column: 6
                            fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 134, column: 6
                            S6157=1;
                            active[7]=1;
                            ends[7]=1;
                            break RUN;
                          }
                          else {
                            switch(S6152){
                              case 0 : 
                                if(fillerStatus_o.isACK()){//sysj\controller.sysj line: 134, column: 6
                                  fillerStatus_o.setVal("done");//sysj\controller.sysj line: 134, column: 6
                                  S6152=1;
                                  if(!fillerStatus_o.isACK()){//sysj\controller.sysj line: 134, column: 6
                                    fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 134, column: 6
                                    ends[7]=2;
                                    ;//sysj\controller.sysj line: 134, column: 6
                                    S5216=2;
                                    active[7]=1;
                                    ends[7]=1;
                                    break RUN;
                                  }
                                  else {
                                    active[7]=1;
                                    ends[7]=1;
                                    break RUN;
                                  }
                                }
                                else {
                                  active[7]=1;
                                  ends[7]=1;
                                  break RUN;
                                }
                              
                              case 1 : 
                                if(!fillerStatus_o.isACK()){//sysj\controller.sysj line: 134, column: 6
                                  fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 134, column: 6
                                  ends[7]=2;
                                  ;//sysj\controller.sysj line: 134, column: 6
                                  S5216=2;
                                  active[7]=1;
                                  ends[7]=1;
                                  break RUN;
                                }
                                else {
                                  active[7]=1;
                                  ends[7]=1;
                                  break RUN;
                                }
                              
                            }
                          }
                          break;
                        
                        case 1 : 
                          S6157=1;
                          S6157=0;
                          if(!fillerStatus_o.isPartnerPresent() || fillerStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 134, column: 6
                            fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 134, column: 6
                            S6157=1;
                            active[7]=1;
                            ends[7]=1;
                            break RUN;
                          }
                          else {
                            S6152=0;
                            if(fillerStatus_o.isACK()){//sysj\controller.sysj line: 134, column: 6
                              fillerStatus_o.setVal("done");//sysj\controller.sysj line: 134, column: 6
                              S6152=1;
                              if(!fillerStatus_o.isACK()){//sysj\controller.sysj line: 134, column: 6
                                fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 134, column: 6
                                ends[7]=2;
                                ;//sysj\controller.sysj line: 134, column: 6
                                S5216=2;
                                active[7]=1;
                                ends[7]=1;
                                break RUN;
                              }
                              else {
                                active[7]=1;
                                ends[7]=1;
                                break RUN;
                              }
                            }
                            else {
                              active[7]=1;
                              ends[7]=1;
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
              S5216=2;
              S5216=0;
              S5200=0;
              if(!fillerReq_in.isPartnerPresent() || fillerReq_in.isPartnerPreempted()){//sysj\controller.sysj line: 84, column: 3
                fillerReq_in.setACK(false);//sysj\controller.sysj line: 84, column: 3
                S5200=1;
                active[7]=1;
                ends[7]=1;
                break RUN;
              }
              else {
                S5195=0;
                if(!fillerReq_in.isREQ()){//sysj\controller.sysj line: 84, column: 3
                  fillerReq_in.setACK(true);//sysj\controller.sysj line: 84, column: 3
                  S5195=1;
                  if(fillerReq_in.isREQ()){//sysj\controller.sysj line: 84, column: 3
                    fillerReq_in.setACK(false);//sysj\controller.sysj line: 84, column: 3
                    ends[7]=2;
                    ;//sysj\controller.sysj line: 84, column: 3
                    request_thread_7 = (fillerReq_in.getVal() == null ? null : ((Boolean)fillerReq_in.getVal()));//sysj\controller.sysj line: 85, column: 3
                    S5216=1;
                    if(request_thread_7){//sysj\controller.sysj line: 87, column: 3
                      System.out.println("FillerController: - Received request");//sysj\controller.sysj line: 89, column: 5
                      S5309=0;
                      if(!bottleAtPos2.getprestatus()){//sysj\controller.sysj line: 90, column: 13
                        System.out.println("FillerController: - Idle (no bottle at pos 2).");//sysj\controller.sysj line: 91, column: 6
                        S5223=0;
                        if(!fillerStatus_o.isPartnerPresent() || fillerStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 92, column: 6
                          fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 92, column: 6
                          S5223=1;
                          active[7]=1;
                          ends[7]=1;
                          break RUN;
                        }
                        else {
                          S5218=0;
                          if(fillerStatus_o.isACK()){//sysj\controller.sysj line: 92, column: 6
                            fillerStatus_o.setVal("idle");//sysj\controller.sysj line: 92, column: 6
                            S5218=1;
                            if(!fillerStatus_o.isACK()){//sysj\controller.sysj line: 92, column: 6
                              fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 92, column: 6
                              ends[7]=2;
                              ;//sysj\controller.sysj line: 92, column: 6
                              S5309=1;
                              if(bottleAtPos2.getprestatus()){//sysj\controller.sysj line: 96, column: 13
                                System.out.println("FillerController: - Bottle detected at position 2.");//sysj\controller.sysj line: 97, column: 6
                                S5354=0;
                                S5316=0;
                                if(!percentLiquid_in.isPartnerPresent() || percentLiquid_in.isPartnerPreempted()){//sysj\controller.sysj line: 98, column: 6
                                  percentLiquid_in.setACK(false);//sysj\controller.sysj line: 98, column: 6
                                  S5316=1;
                                  active[7]=1;
                                  ends[7]=1;
                                  break RUN;
                                }
                                else {
                                  S5311=0;
                                  if(!percentLiquid_in.isREQ()){//sysj\controller.sysj line: 98, column: 6
                                    percentLiquid_in.setACK(true);//sysj\controller.sysj line: 98, column: 6
                                    S5311=1;
                                    if(percentLiquid_in.isREQ()){//sysj\controller.sysj line: 98, column: 6
                                      percentLiquid_in.setACK(false);//sysj\controller.sysj line: 98, column: 6
                                      ends[7]=2;
                                      ;//sysj\controller.sysj line: 98, column: 6
                                      recPercentLiq_thread_7 = (ArrayList)(percentLiquid_in.getVal() == null ? null : ((ArrayList)percentLiquid_in.getVal()));//sysj\controller.sysj line: 99, column: 6
                                      canisterNum_thread_7 = 1;//sysj\controller.sysj line: 100, column: 6
                                      S5354=1;
                                      if(canisterNum_thread_7 < 5){//sysj\controller.sysj line: 102, column: 12
                                        S5385=0;
                                        System.out.println("selecting canister " + canisterNum_thread_7);//sysj\controller.sysj line: 105, column: 8
                                        selectCanister.setPresent();//sysj\controller.sysj line: 106, column: 9
                                        currsigs.addElement(selectCanister);
                                        selectCanister.setValue(canisterNum_thread_7);//sysj\controller.sysj line: 106, column: 9
                                        active[7]=1;
                                        ends[7]=1;
                                        break RUN;
                                      }
                                      else {
                                        ends[7]=2;
                                        ;//sysj\controller.sysj line: 102, column: 6
                                        S5354=2;
                                        S6157=0;
                                        if(!fillerStatus_o.isPartnerPresent() || fillerStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 134, column: 6
                                          fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 134, column: 6
                                          S6157=1;
                                          active[7]=1;
                                          ends[7]=1;
                                          break RUN;
                                        }
                                        else {
                                          S6152=0;
                                          if(fillerStatus_o.isACK()){//sysj\controller.sysj line: 134, column: 6
                                            fillerStatus_o.setVal("done");//sysj\controller.sysj line: 134, column: 6
                                            S6152=1;
                                            if(!fillerStatus_o.isACK()){//sysj\controller.sysj line: 134, column: 6
                                              fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 134, column: 6
                                              ends[7]=2;
                                              ;//sysj\controller.sysj line: 134, column: 6
                                              S5216=2;
                                              active[7]=1;
                                              ends[7]=1;
                                              break RUN;
                                            }
                                            else {
                                              active[7]=1;
                                              ends[7]=1;
                                              break RUN;
                                            }
                                          }
                                          else {
                                            active[7]=1;
                                            ends[7]=1;
                                            break RUN;
                                          }
                                        }
                                      }
                                    }
                                    else {
                                      active[7]=1;
                                      ends[7]=1;
                                      break RUN;
                                    }
                                  }
                                  else {
                                    active[7]=1;
                                    ends[7]=1;
                                    break RUN;
                                  }
                                }
                              }
                              else {
                                S5216=2;
                                active[7]=1;
                                ends[7]=1;
                                break RUN;
                              }
                            }
                            else {
                              active[7]=1;
                              ends[7]=1;
                              break RUN;
                            }
                          }
                          else {
                            active[7]=1;
                            ends[7]=1;
                            break RUN;
                          }
                        }
                      }
                      else {
                        S5309=1;
                        if(bottleAtPos2.getprestatus()){//sysj\controller.sysj line: 96, column: 13
                          System.out.println("FillerController: - Bottle detected at position 2.");//sysj\controller.sysj line: 97, column: 6
                          S5354=0;
                          S5316=0;
                          if(!percentLiquid_in.isPartnerPresent() || percentLiquid_in.isPartnerPreempted()){//sysj\controller.sysj line: 98, column: 6
                            percentLiquid_in.setACK(false);//sysj\controller.sysj line: 98, column: 6
                            S5316=1;
                            active[7]=1;
                            ends[7]=1;
                            break RUN;
                          }
                          else {
                            S5311=0;
                            if(!percentLiquid_in.isREQ()){//sysj\controller.sysj line: 98, column: 6
                              percentLiquid_in.setACK(true);//sysj\controller.sysj line: 98, column: 6
                              S5311=1;
                              if(percentLiquid_in.isREQ()){//sysj\controller.sysj line: 98, column: 6
                                percentLiquid_in.setACK(false);//sysj\controller.sysj line: 98, column: 6
                                ends[7]=2;
                                ;//sysj\controller.sysj line: 98, column: 6
                                recPercentLiq_thread_7 = (ArrayList)(percentLiquid_in.getVal() == null ? null : ((ArrayList)percentLiquid_in.getVal()));//sysj\controller.sysj line: 99, column: 6
                                canisterNum_thread_7 = 1;//sysj\controller.sysj line: 100, column: 6
                                S5354=1;
                                if(canisterNum_thread_7 < 5){//sysj\controller.sysj line: 102, column: 12
                                  S5385=0;
                                  System.out.println("selecting canister " + canisterNum_thread_7);//sysj\controller.sysj line: 105, column: 8
                                  selectCanister.setPresent();//sysj\controller.sysj line: 106, column: 9
                                  currsigs.addElement(selectCanister);
                                  selectCanister.setValue(canisterNum_thread_7);//sysj\controller.sysj line: 106, column: 9
                                  active[7]=1;
                                  ends[7]=1;
                                  break RUN;
                                }
                                else {
                                  ends[7]=2;
                                  ;//sysj\controller.sysj line: 102, column: 6
                                  S5354=2;
                                  S6157=0;
                                  if(!fillerStatus_o.isPartnerPresent() || fillerStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 134, column: 6
                                    fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 134, column: 6
                                    S6157=1;
                                    active[7]=1;
                                    ends[7]=1;
                                    break RUN;
                                  }
                                  else {
                                    S6152=0;
                                    if(fillerStatus_o.isACK()){//sysj\controller.sysj line: 134, column: 6
                                      fillerStatus_o.setVal("done");//sysj\controller.sysj line: 134, column: 6
                                      S6152=1;
                                      if(!fillerStatus_o.isACK()){//sysj\controller.sysj line: 134, column: 6
                                        fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 134, column: 6
                                        ends[7]=2;
                                        ;//sysj\controller.sysj line: 134, column: 6
                                        S5216=2;
                                        active[7]=1;
                                        ends[7]=1;
                                        break RUN;
                                      }
                                      else {
                                        active[7]=1;
                                        ends[7]=1;
                                        break RUN;
                                      }
                                    }
                                    else {
                                      active[7]=1;
                                      ends[7]=1;
                                      break RUN;
                                    }
                                  }
                                }
                              }
                              else {
                                active[7]=1;
                                ends[7]=1;
                                break RUN;
                              }
                            }
                            else {
                              active[7]=1;
                              ends[7]=1;
                              break RUN;
                            }
                          }
                        }
                        else {
                          S5216=2;
                          active[7]=1;
                          ends[7]=1;
                          break RUN;
                        }
                      }
                    }
                    else {
                      S5216=2;
                      active[7]=1;
                      ends[7]=1;
                      break RUN;
                    }
                  }
                  else {
                    active[7]=1;
                    ends[7]=1;
                    break RUN;
                  }
                }
                else {
                  active[7]=1;
                  ends[7]=1;
                  break RUN;
                }
              }
            
          }
        
      }
    }
  }

  public void init(){
    char [] active1 = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
    char [] paused1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    char [] suspended1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    paused = paused1;
    active = active1;
    suspended = suspended1;
    // Now instantiate all the local signals ONLY
    // --------------------------------------------------
  }
  
  public void run(){
    while(active[7] != 0){
      int index = 7;
      if(paused[index]==1 || suspended[index]==1 || active[index] == 0){
        for(int h=1;h<paused.length;++h){
          paused[h]=0;
        }
      }
      if(paused[7]!=0 || suspended[7]!=0 || active[7]!=1);
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
      if(paused[7]!=0 || suspended[7]!=0 || active[7]!=1);
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
      if(active[7] == 0){
      	this.terminated = true;
      }
      if(!threaded) break;
    }
  }
}
