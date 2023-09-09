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
  public Signal valveInjectorActive = new Signal("valveInjectorActive", Signal.INPUT);
  public Signal selectedCanister = new Signal("selectedCanister", Signal.INPUT);
  public Signal selectedPercentage = new Signal("selectedPercentage", Signal.INPUT);
  public Signal valveInjectorOnOff = new Signal("valveInjectorOnOff", Signal.OUTPUT);
  public Signal valveInletOnOff = new Signal("valveInletOnOff", Signal.OUTPUT);
  public Signal dosUnitValveRetract = new Signal("dosUnitValveRetract", Signal.OUTPUT);
  public Signal dosUnitValveExtend = new Signal("dosUnitValveExtend", Signal.OUTPUT);
  public Signal selectCanister = new Signal("selectCanister", Signal.OUTPUT);
  public Signal selectPercentage = new Signal("selectPercentage", Signal.OUTPUT);
  public input_Channel fillerReq_in = new input_Channel();
  public output_Channel fillerStatus_o = new output_Channel();
  private ArrayList recPercentLiq_thread_7;//sysj\controller.sysj line: 95, column: 4
  private int canisterNum_thread_7;//sysj\controller.sysj line: 96, column: 4
  private int S22448 = 1;
  private int S5216 = 1;
  private int S5200 = 1;
  private int S5195 = 1;
  private int S5223 = 1;
  private int S5218 = 1;
  private int S5401 = 1;
  private int S5436 = 1;
  private int S5441 = 1;
  private int S5446 = 1;
  private int S5463 = 1;
  private int S5468 = 1;
  private int S5956 = 1;
  private int S5951 = 1;
  
  private int[] ends = new int[20];
  private int[] tdone = new int[20];
  
  public void thread31184(int [] tdone, int [] ends){
        switch(S5468){
      case 0 : 
        active[11]=0;
        ends[11]=0;
        tdone[11]=1;
        break;
      
      case 1 : 
        dosUnitValveExtend.setPresent();//sysj\controller.sysj line: 120, column: 36
        currsigs.addElement(dosUnitValveExtend);
        active[11]=1;
        ends[11]=1;
        tdone[11]=1;
        break;
      
    }
  }

  public void thread31183(int [] tdone, int [] ends){
        switch(S5463){
      case 0 : 
        active[10]=0;
        ends[10]=0;
        tdone[10]=1;
        break;
      
      case 1 : 
        valveInletOnOff.setPresent();//sysj\controller.sysj line: 120, column: 8
        currsigs.addElement(valveInletOnOff);
        active[10]=1;
        ends[10]=1;
        tdone[10]=1;
        break;
      
    }
  }

  public void thread31181(int [] tdone, int [] ends){
        S5468=1;
    dosUnitValveExtend.setPresent();//sysj\controller.sysj line: 120, column: 36
    currsigs.addElement(dosUnitValveExtend);
    active[11]=1;
    ends[11]=1;
    tdone[11]=1;
  }

  public void thread31180(int [] tdone, int [] ends){
        S5463=1;
    valveInletOnOff.setPresent();//sysj\controller.sysj line: 120, column: 8
    currsigs.addElement(valveInletOnOff);
    active[10]=1;
    ends[10]=1;
    tdone[10]=1;
  }

  public void thread31178(int [] tdone, int [] ends){
        switch(S5446){
      case 0 : 
        active[9]=0;
        ends[9]=0;
        tdone[9]=1;
        break;
      
      case 1 : 
        valveInjectorOnOff.setPresent();//sysj\controller.sysj line: 114, column: 42
        currsigs.addElement(valveInjectorOnOff);
        active[9]=1;
        ends[9]=1;
        tdone[9]=1;
        break;
      
    }
  }

  public void thread31177(int [] tdone, int [] ends){
        switch(S5441){
      case 0 : 
        active[8]=0;
        ends[8]=0;
        tdone[8]=1;
        break;
      
      case 1 : 
        dosUnitValveRetract.setPresent();//sysj\controller.sysj line: 114, column: 8
        currsigs.addElement(dosUnitValveRetract);
        active[8]=1;
        ends[8]=1;
        tdone[8]=1;
        break;
      
    }
  }

  public void thread31175(int [] tdone, int [] ends){
        S5468=1;
    dosUnitValveExtend.setPresent();//sysj\controller.sysj line: 120, column: 36
    currsigs.addElement(dosUnitValveExtend);
    active[11]=1;
    ends[11]=1;
    tdone[11]=1;
  }

  public void thread31174(int [] tdone, int [] ends){
        S5463=1;
    valveInletOnOff.setPresent();//sysj\controller.sysj line: 120, column: 8
    currsigs.addElement(valveInletOnOff);
    active[10]=1;
    ends[10]=1;
    tdone[10]=1;
  }

  public void thread31172(int [] tdone, int [] ends){
        S5446=1;
    valveInjectorOnOff.setPresent();//sysj\controller.sysj line: 114, column: 42
    currsigs.addElement(valveInjectorOnOff);
    active[9]=1;
    ends[9]=1;
    tdone[9]=1;
  }

  public void thread31171(int [] tdone, int [] ends){
        S5441=1;
    dosUnitValveRetract.setPresent();//sysj\controller.sysj line: 114, column: 8
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
      switch(S22448){
        case 0 : 
          S22448=0;
          break RUN;
        
        case 1 : 
          S22448=2;
          S22448=2;
          S5216=0;
          S5200=0;
          if(!fillerReq_in.isPartnerPresent() || fillerReq_in.isPartnerPreempted()){//sysj\controller.sysj line: 83, column: 3
            fillerReq_in.setACK(false);//sysj\controller.sysj line: 83, column: 3
            S5200=1;
            active[7]=1;
            ends[7]=1;
            break RUN;
          }
          else {
            S5195=0;
            if(!fillerReq_in.isREQ()){//sysj\controller.sysj line: 83, column: 3
              fillerReq_in.setACK(true);//sysj\controller.sysj line: 83, column: 3
              S5195=1;
              if(fillerReq_in.isREQ()){//sysj\controller.sysj line: 83, column: 3
                fillerReq_in.setACK(false);//sysj\controller.sysj line: 83, column: 3
                ends[7]=2;
                ;//sysj\controller.sysj line: 83, column: 3
                System.out.println("FillerController: - Received request");//sysj\controller.sysj line: 86, column: 3
                S5216=1;
                if(!bottleAtPos2.getprestatus()){//sysj\controller.sysj line: 87, column: 11
                  System.out.println("FillerController: - Idle (no bottle at pos 2).");//sysj\controller.sysj line: 88, column: 4
                  S5223=0;
                  if(!fillerStatus_o.isPartnerPresent() || fillerStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 89, column: 4
                    fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 89, column: 4
                    S5223=1;
                    active[7]=1;
                    ends[7]=1;
                    break RUN;
                  }
                  else {
                    S5218=0;
                    if(fillerStatus_o.isACK()){//sysj\controller.sysj line: 89, column: 4
                      fillerStatus_o.setVal("idle");//sysj\controller.sysj line: 89, column: 4
                      S5218=1;
                      if(!fillerStatus_o.isACK()){//sysj\controller.sysj line: 89, column: 4
                        fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 89, column: 4
                        ends[7]=2;
                        ;//sysj\controller.sysj line: 89, column: 4
                        S5216=2;
                        if(bottleAtPos2.getprestatus()){//sysj\controller.sysj line: 93, column: 11
                          System.out.println("FillerController: - Bottle detected at position 2.");//sysj\controller.sysj line: 94, column: 4
                          recPercentLiq_thread_7 = (ArrayList)(fillerReq_in.getVal() == null ? null : ((ArrayList)fillerReq_in.getVal()));//sysj\controller.sysj line: 95, column: 4
                          canisterNum_thread_7 = 1;//sysj\controller.sysj line: 96, column: 4
                          S5401=0;
                          if(canisterNum_thread_7 < 5){//sysj\controller.sysj line: 98, column: 10
                            System.out.println("selecting percentage " + recPercentLiq_thread_7.get(canisterNum_thread_7 - 1));//sysj\controller.sysj line: 101, column: 6
                            selectPercentage.setPresent();//sysj\controller.sysj line: 102, column: 6
                            currsigs.addElement(selectPercentage);
                            selectPercentage.setValue(recPercentLiq_thread_7.get(canisterNum_thread_7 - 1));//sysj\controller.sysj line: 102, column: 6
                            S5436=0;
                            System.out.println("selecting canister " + canisterNum_thread_7);//sysj\controller.sysj line: 105, column: 6
                            selectCanister.setPresent();//sysj\controller.sysj line: 106, column: 7
                            currsigs.addElement(selectCanister);
                            selectCanister.setValue(canisterNum_thread_7);//sysj\controller.sysj line: 106, column: 7
                            active[7]=1;
                            ends[7]=1;
                            break RUN;
                          }
                          else {
                            ends[7]=2;
                            ;//sysj\controller.sysj line: 98, column: 4
                            S5401=1;
                            S5956=0;
                            if(!fillerStatus_o.isPartnerPresent() || fillerStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 126, column: 4
                              fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 126, column: 4
                              S5956=1;
                              active[7]=1;
                              ends[7]=1;
                              break RUN;
                            }
                            else {
                              S5951=0;
                              if(fillerStatus_o.isACK()){//sysj\controller.sysj line: 126, column: 4
                                fillerStatus_o.setVal("done");//sysj\controller.sysj line: 126, column: 4
                                S5951=1;
                                if(!fillerStatus_o.isACK()){//sysj\controller.sysj line: 126, column: 4
                                  fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 126, column: 4
                                  ends[7]=2;
                                  ;//sysj\controller.sysj line: 126, column: 4
                                  S5216=3;
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
                          S5216=3;
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
                  S5216=2;
                  if(bottleAtPos2.getprestatus()){//sysj\controller.sysj line: 93, column: 11
                    System.out.println("FillerController: - Bottle detected at position 2.");//sysj\controller.sysj line: 94, column: 4
                    recPercentLiq_thread_7 = (ArrayList)(fillerReq_in.getVal() == null ? null : ((ArrayList)fillerReq_in.getVal()));//sysj\controller.sysj line: 95, column: 4
                    canisterNum_thread_7 = 1;//sysj\controller.sysj line: 96, column: 4
                    S5401=0;
                    if(canisterNum_thread_7 < 5){//sysj\controller.sysj line: 98, column: 10
                      System.out.println("selecting percentage " + recPercentLiq_thread_7.get(canisterNum_thread_7 - 1));//sysj\controller.sysj line: 101, column: 6
                      selectPercentage.setPresent();//sysj\controller.sysj line: 102, column: 6
                      currsigs.addElement(selectPercentage);
                      selectPercentage.setValue(recPercentLiq_thread_7.get(canisterNum_thread_7 - 1));//sysj\controller.sysj line: 102, column: 6
                      S5436=0;
                      System.out.println("selecting canister " + canisterNum_thread_7);//sysj\controller.sysj line: 105, column: 6
                      selectCanister.setPresent();//sysj\controller.sysj line: 106, column: 7
                      currsigs.addElement(selectCanister);
                      selectCanister.setValue(canisterNum_thread_7);//sysj\controller.sysj line: 106, column: 7
                      active[7]=1;
                      ends[7]=1;
                      break RUN;
                    }
                    else {
                      ends[7]=2;
                      ;//sysj\controller.sysj line: 98, column: 4
                      S5401=1;
                      S5956=0;
                      if(!fillerStatus_o.isPartnerPresent() || fillerStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 126, column: 4
                        fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 126, column: 4
                        S5956=1;
                        active[7]=1;
                        ends[7]=1;
                        break RUN;
                      }
                      else {
                        S5951=0;
                        if(fillerStatus_o.isACK()){//sysj\controller.sysj line: 126, column: 4
                          fillerStatus_o.setVal("done");//sysj\controller.sysj line: 126, column: 4
                          S5951=1;
                          if(!fillerStatus_o.isACK()){//sysj\controller.sysj line: 126, column: 4
                            fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 126, column: 4
                            ends[7]=2;
                            ;//sysj\controller.sysj line: 126, column: 4
                            S5216=3;
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
                    S5216=3;
                    active[7]=1;
                    ends[7]=1;
                    break RUN;
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
        
        case 2 : 
          switch(S5216){
            case 0 : 
              switch(S5200){
                case 0 : 
                  if(!fillerReq_in.isPartnerPresent() || fillerReq_in.isPartnerPreempted()){//sysj\controller.sysj line: 83, column: 3
                    fillerReq_in.setACK(false);//sysj\controller.sysj line: 83, column: 3
                    S5200=1;
                    active[7]=1;
                    ends[7]=1;
                    break RUN;
                  }
                  else {
                    switch(S5195){
                      case 0 : 
                        if(!fillerReq_in.isREQ()){//sysj\controller.sysj line: 83, column: 3
                          fillerReq_in.setACK(true);//sysj\controller.sysj line: 83, column: 3
                          S5195=1;
                          if(fillerReq_in.isREQ()){//sysj\controller.sysj line: 83, column: 3
                            fillerReq_in.setACK(false);//sysj\controller.sysj line: 83, column: 3
                            ends[7]=2;
                            ;//sysj\controller.sysj line: 83, column: 3
                            System.out.println("FillerController: - Received request");//sysj\controller.sysj line: 86, column: 3
                            S5216=1;
                            if(!bottleAtPos2.getprestatus()){//sysj\controller.sysj line: 87, column: 11
                              System.out.println("FillerController: - Idle (no bottle at pos 2).");//sysj\controller.sysj line: 88, column: 4
                              S5223=0;
                              if(!fillerStatus_o.isPartnerPresent() || fillerStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 89, column: 4
                                fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 89, column: 4
                                S5223=1;
                                active[7]=1;
                                ends[7]=1;
                                break RUN;
                              }
                              else {
                                S5218=0;
                                if(fillerStatus_o.isACK()){//sysj\controller.sysj line: 89, column: 4
                                  fillerStatus_o.setVal("idle");//sysj\controller.sysj line: 89, column: 4
                                  S5218=1;
                                  if(!fillerStatus_o.isACK()){//sysj\controller.sysj line: 89, column: 4
                                    fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 89, column: 4
                                    ends[7]=2;
                                    ;//sysj\controller.sysj line: 89, column: 4
                                    S5216=2;
                                    if(bottleAtPos2.getprestatus()){//sysj\controller.sysj line: 93, column: 11
                                      System.out.println("FillerController: - Bottle detected at position 2.");//sysj\controller.sysj line: 94, column: 4
                                      recPercentLiq_thread_7 = (ArrayList)(fillerReq_in.getVal() == null ? null : ((ArrayList)fillerReq_in.getVal()));//sysj\controller.sysj line: 95, column: 4
                                      canisterNum_thread_7 = 1;//sysj\controller.sysj line: 96, column: 4
                                      S5401=0;
                                      if(canisterNum_thread_7 < 5){//sysj\controller.sysj line: 98, column: 10
                                        System.out.println("selecting percentage " + recPercentLiq_thread_7.get(canisterNum_thread_7 - 1));//sysj\controller.sysj line: 101, column: 6
                                        selectPercentage.setPresent();//sysj\controller.sysj line: 102, column: 6
                                        currsigs.addElement(selectPercentage);
                                        selectPercentage.setValue(recPercentLiq_thread_7.get(canisterNum_thread_7 - 1));//sysj\controller.sysj line: 102, column: 6
                                        S5436=0;
                                        System.out.println("selecting canister " + canisterNum_thread_7);//sysj\controller.sysj line: 105, column: 6
                                        selectCanister.setPresent();//sysj\controller.sysj line: 106, column: 7
                                        currsigs.addElement(selectCanister);
                                        selectCanister.setValue(canisterNum_thread_7);//sysj\controller.sysj line: 106, column: 7
                                        active[7]=1;
                                        ends[7]=1;
                                        break RUN;
                                      }
                                      else {
                                        ends[7]=2;
                                        ;//sysj\controller.sysj line: 98, column: 4
                                        S5401=1;
                                        S5956=0;
                                        if(!fillerStatus_o.isPartnerPresent() || fillerStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 126, column: 4
                                          fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 126, column: 4
                                          S5956=1;
                                          active[7]=1;
                                          ends[7]=1;
                                          break RUN;
                                        }
                                        else {
                                          S5951=0;
                                          if(fillerStatus_o.isACK()){//sysj\controller.sysj line: 126, column: 4
                                            fillerStatus_o.setVal("done");//sysj\controller.sysj line: 126, column: 4
                                            S5951=1;
                                            if(!fillerStatus_o.isACK()){//sysj\controller.sysj line: 126, column: 4
                                              fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 126, column: 4
                                              ends[7]=2;
                                              ;//sysj\controller.sysj line: 126, column: 4
                                              S5216=3;
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
                                      S5216=3;
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
                              S5216=2;
                              if(bottleAtPos2.getprestatus()){//sysj\controller.sysj line: 93, column: 11
                                System.out.println("FillerController: - Bottle detected at position 2.");//sysj\controller.sysj line: 94, column: 4
                                recPercentLiq_thread_7 = (ArrayList)(fillerReq_in.getVal() == null ? null : ((ArrayList)fillerReq_in.getVal()));//sysj\controller.sysj line: 95, column: 4
                                canisterNum_thread_7 = 1;//sysj\controller.sysj line: 96, column: 4
                                S5401=0;
                                if(canisterNum_thread_7 < 5){//sysj\controller.sysj line: 98, column: 10
                                  System.out.println("selecting percentage " + recPercentLiq_thread_7.get(canisterNum_thread_7 - 1));//sysj\controller.sysj line: 101, column: 6
                                  selectPercentage.setPresent();//sysj\controller.sysj line: 102, column: 6
                                  currsigs.addElement(selectPercentage);
                                  selectPercentage.setValue(recPercentLiq_thread_7.get(canisterNum_thread_7 - 1));//sysj\controller.sysj line: 102, column: 6
                                  S5436=0;
                                  System.out.println("selecting canister " + canisterNum_thread_7);//sysj\controller.sysj line: 105, column: 6
                                  selectCanister.setPresent();//sysj\controller.sysj line: 106, column: 7
                                  currsigs.addElement(selectCanister);
                                  selectCanister.setValue(canisterNum_thread_7);//sysj\controller.sysj line: 106, column: 7
                                  active[7]=1;
                                  ends[7]=1;
                                  break RUN;
                                }
                                else {
                                  ends[7]=2;
                                  ;//sysj\controller.sysj line: 98, column: 4
                                  S5401=1;
                                  S5956=0;
                                  if(!fillerStatus_o.isPartnerPresent() || fillerStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 126, column: 4
                                    fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 126, column: 4
                                    S5956=1;
                                    active[7]=1;
                                    ends[7]=1;
                                    break RUN;
                                  }
                                  else {
                                    S5951=0;
                                    if(fillerStatus_o.isACK()){//sysj\controller.sysj line: 126, column: 4
                                      fillerStatus_o.setVal("done");//sysj\controller.sysj line: 126, column: 4
                                      S5951=1;
                                      if(!fillerStatus_o.isACK()){//sysj\controller.sysj line: 126, column: 4
                                        fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 126, column: 4
                                        ends[7]=2;
                                        ;//sysj\controller.sysj line: 126, column: 4
                                        S5216=3;
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
                                S5216=3;
                                active[7]=1;
                                ends[7]=1;
                                break RUN;
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
                        if(fillerReq_in.isREQ()){//sysj\controller.sysj line: 83, column: 3
                          fillerReq_in.setACK(false);//sysj\controller.sysj line: 83, column: 3
                          ends[7]=2;
                          ;//sysj\controller.sysj line: 83, column: 3
                          System.out.println("FillerController: - Received request");//sysj\controller.sysj line: 86, column: 3
                          S5216=1;
                          if(!bottleAtPos2.getprestatus()){//sysj\controller.sysj line: 87, column: 11
                            System.out.println("FillerController: - Idle (no bottle at pos 2).");//sysj\controller.sysj line: 88, column: 4
                            S5223=0;
                            if(!fillerStatus_o.isPartnerPresent() || fillerStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 89, column: 4
                              fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 89, column: 4
                              S5223=1;
                              active[7]=1;
                              ends[7]=1;
                              break RUN;
                            }
                            else {
                              S5218=0;
                              if(fillerStatus_o.isACK()){//sysj\controller.sysj line: 89, column: 4
                                fillerStatus_o.setVal("idle");//sysj\controller.sysj line: 89, column: 4
                                S5218=1;
                                if(!fillerStatus_o.isACK()){//sysj\controller.sysj line: 89, column: 4
                                  fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 89, column: 4
                                  ends[7]=2;
                                  ;//sysj\controller.sysj line: 89, column: 4
                                  S5216=2;
                                  if(bottleAtPos2.getprestatus()){//sysj\controller.sysj line: 93, column: 11
                                    System.out.println("FillerController: - Bottle detected at position 2.");//sysj\controller.sysj line: 94, column: 4
                                    recPercentLiq_thread_7 = (ArrayList)(fillerReq_in.getVal() == null ? null : ((ArrayList)fillerReq_in.getVal()));//sysj\controller.sysj line: 95, column: 4
                                    canisterNum_thread_7 = 1;//sysj\controller.sysj line: 96, column: 4
                                    S5401=0;
                                    if(canisterNum_thread_7 < 5){//sysj\controller.sysj line: 98, column: 10
                                      System.out.println("selecting percentage " + recPercentLiq_thread_7.get(canisterNum_thread_7 - 1));//sysj\controller.sysj line: 101, column: 6
                                      selectPercentage.setPresent();//sysj\controller.sysj line: 102, column: 6
                                      currsigs.addElement(selectPercentage);
                                      selectPercentage.setValue(recPercentLiq_thread_7.get(canisterNum_thread_7 - 1));//sysj\controller.sysj line: 102, column: 6
                                      S5436=0;
                                      System.out.println("selecting canister " + canisterNum_thread_7);//sysj\controller.sysj line: 105, column: 6
                                      selectCanister.setPresent();//sysj\controller.sysj line: 106, column: 7
                                      currsigs.addElement(selectCanister);
                                      selectCanister.setValue(canisterNum_thread_7);//sysj\controller.sysj line: 106, column: 7
                                      active[7]=1;
                                      ends[7]=1;
                                      break RUN;
                                    }
                                    else {
                                      ends[7]=2;
                                      ;//sysj\controller.sysj line: 98, column: 4
                                      S5401=1;
                                      S5956=0;
                                      if(!fillerStatus_o.isPartnerPresent() || fillerStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 126, column: 4
                                        fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 126, column: 4
                                        S5956=1;
                                        active[7]=1;
                                        ends[7]=1;
                                        break RUN;
                                      }
                                      else {
                                        S5951=0;
                                        if(fillerStatus_o.isACK()){//sysj\controller.sysj line: 126, column: 4
                                          fillerStatus_o.setVal("done");//sysj\controller.sysj line: 126, column: 4
                                          S5951=1;
                                          if(!fillerStatus_o.isACK()){//sysj\controller.sysj line: 126, column: 4
                                            fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 126, column: 4
                                            ends[7]=2;
                                            ;//sysj\controller.sysj line: 126, column: 4
                                            S5216=3;
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
                                    S5216=3;
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
                            S5216=2;
                            if(bottleAtPos2.getprestatus()){//sysj\controller.sysj line: 93, column: 11
                              System.out.println("FillerController: - Bottle detected at position 2.");//sysj\controller.sysj line: 94, column: 4
                              recPercentLiq_thread_7 = (ArrayList)(fillerReq_in.getVal() == null ? null : ((ArrayList)fillerReq_in.getVal()));//sysj\controller.sysj line: 95, column: 4
                              canisterNum_thread_7 = 1;//sysj\controller.sysj line: 96, column: 4
                              S5401=0;
                              if(canisterNum_thread_7 < 5){//sysj\controller.sysj line: 98, column: 10
                                System.out.println("selecting percentage " + recPercentLiq_thread_7.get(canisterNum_thread_7 - 1));//sysj\controller.sysj line: 101, column: 6
                                selectPercentage.setPresent();//sysj\controller.sysj line: 102, column: 6
                                currsigs.addElement(selectPercentage);
                                selectPercentage.setValue(recPercentLiq_thread_7.get(canisterNum_thread_7 - 1));//sysj\controller.sysj line: 102, column: 6
                                S5436=0;
                                System.out.println("selecting canister " + canisterNum_thread_7);//sysj\controller.sysj line: 105, column: 6
                                selectCanister.setPresent();//sysj\controller.sysj line: 106, column: 7
                                currsigs.addElement(selectCanister);
                                selectCanister.setValue(canisterNum_thread_7);//sysj\controller.sysj line: 106, column: 7
                                active[7]=1;
                                ends[7]=1;
                                break RUN;
                              }
                              else {
                                ends[7]=2;
                                ;//sysj\controller.sysj line: 98, column: 4
                                S5401=1;
                                S5956=0;
                                if(!fillerStatus_o.isPartnerPresent() || fillerStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 126, column: 4
                                  fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 126, column: 4
                                  S5956=1;
                                  active[7]=1;
                                  ends[7]=1;
                                  break RUN;
                                }
                                else {
                                  S5951=0;
                                  if(fillerStatus_o.isACK()){//sysj\controller.sysj line: 126, column: 4
                                    fillerStatus_o.setVal("done");//sysj\controller.sysj line: 126, column: 4
                                    S5951=1;
                                    if(!fillerStatus_o.isACK()){//sysj\controller.sysj line: 126, column: 4
                                      fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 126, column: 4
                                      ends[7]=2;
                                      ;//sysj\controller.sysj line: 126, column: 4
                                      S5216=3;
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
                              S5216=3;
                              active[7]=1;
                              ends[7]=1;
                              break RUN;
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
                  S5200=1;
                  S5200=0;
                  if(!fillerReq_in.isPartnerPresent() || fillerReq_in.isPartnerPreempted()){//sysj\controller.sysj line: 83, column: 3
                    fillerReq_in.setACK(false);//sysj\controller.sysj line: 83, column: 3
                    S5200=1;
                    active[7]=1;
                    ends[7]=1;
                    break RUN;
                  }
                  else {
                    S5195=0;
                    if(!fillerReq_in.isREQ()){//sysj\controller.sysj line: 83, column: 3
                      fillerReq_in.setACK(true);//sysj\controller.sysj line: 83, column: 3
                      S5195=1;
                      if(fillerReq_in.isREQ()){//sysj\controller.sysj line: 83, column: 3
                        fillerReq_in.setACK(false);//sysj\controller.sysj line: 83, column: 3
                        ends[7]=2;
                        ;//sysj\controller.sysj line: 83, column: 3
                        System.out.println("FillerController: - Received request");//sysj\controller.sysj line: 86, column: 3
                        S5216=1;
                        if(!bottleAtPos2.getprestatus()){//sysj\controller.sysj line: 87, column: 11
                          System.out.println("FillerController: - Idle (no bottle at pos 2).");//sysj\controller.sysj line: 88, column: 4
                          S5223=0;
                          if(!fillerStatus_o.isPartnerPresent() || fillerStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 89, column: 4
                            fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 89, column: 4
                            S5223=1;
                            active[7]=1;
                            ends[7]=1;
                            break RUN;
                          }
                          else {
                            S5218=0;
                            if(fillerStatus_o.isACK()){//sysj\controller.sysj line: 89, column: 4
                              fillerStatus_o.setVal("idle");//sysj\controller.sysj line: 89, column: 4
                              S5218=1;
                              if(!fillerStatus_o.isACK()){//sysj\controller.sysj line: 89, column: 4
                                fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 89, column: 4
                                ends[7]=2;
                                ;//sysj\controller.sysj line: 89, column: 4
                                S5216=2;
                                if(bottleAtPos2.getprestatus()){//sysj\controller.sysj line: 93, column: 11
                                  System.out.println("FillerController: - Bottle detected at position 2.");//sysj\controller.sysj line: 94, column: 4
                                  recPercentLiq_thread_7 = (ArrayList)(fillerReq_in.getVal() == null ? null : ((ArrayList)fillerReq_in.getVal()));//sysj\controller.sysj line: 95, column: 4
                                  canisterNum_thread_7 = 1;//sysj\controller.sysj line: 96, column: 4
                                  S5401=0;
                                  if(canisterNum_thread_7 < 5){//sysj\controller.sysj line: 98, column: 10
                                    System.out.println("selecting percentage " + recPercentLiq_thread_7.get(canisterNum_thread_7 - 1));//sysj\controller.sysj line: 101, column: 6
                                    selectPercentage.setPresent();//sysj\controller.sysj line: 102, column: 6
                                    currsigs.addElement(selectPercentage);
                                    selectPercentage.setValue(recPercentLiq_thread_7.get(canisterNum_thread_7 - 1));//sysj\controller.sysj line: 102, column: 6
                                    S5436=0;
                                    System.out.println("selecting canister " + canisterNum_thread_7);//sysj\controller.sysj line: 105, column: 6
                                    selectCanister.setPresent();//sysj\controller.sysj line: 106, column: 7
                                    currsigs.addElement(selectCanister);
                                    selectCanister.setValue(canisterNum_thread_7);//sysj\controller.sysj line: 106, column: 7
                                    active[7]=1;
                                    ends[7]=1;
                                    break RUN;
                                  }
                                  else {
                                    ends[7]=2;
                                    ;//sysj\controller.sysj line: 98, column: 4
                                    S5401=1;
                                    S5956=0;
                                    if(!fillerStatus_o.isPartnerPresent() || fillerStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 126, column: 4
                                      fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 126, column: 4
                                      S5956=1;
                                      active[7]=1;
                                      ends[7]=1;
                                      break RUN;
                                    }
                                    else {
                                      S5951=0;
                                      if(fillerStatus_o.isACK()){//sysj\controller.sysj line: 126, column: 4
                                        fillerStatus_o.setVal("done");//sysj\controller.sysj line: 126, column: 4
                                        S5951=1;
                                        if(!fillerStatus_o.isACK()){//sysj\controller.sysj line: 126, column: 4
                                          fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 126, column: 4
                                          ends[7]=2;
                                          ;//sysj\controller.sysj line: 126, column: 4
                                          S5216=3;
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
                                  S5216=3;
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
                          S5216=2;
                          if(bottleAtPos2.getprestatus()){//sysj\controller.sysj line: 93, column: 11
                            System.out.println("FillerController: - Bottle detected at position 2.");//sysj\controller.sysj line: 94, column: 4
                            recPercentLiq_thread_7 = (ArrayList)(fillerReq_in.getVal() == null ? null : ((ArrayList)fillerReq_in.getVal()));//sysj\controller.sysj line: 95, column: 4
                            canisterNum_thread_7 = 1;//sysj\controller.sysj line: 96, column: 4
                            S5401=0;
                            if(canisterNum_thread_7 < 5){//sysj\controller.sysj line: 98, column: 10
                              System.out.println("selecting percentage " + recPercentLiq_thread_7.get(canisterNum_thread_7 - 1));//sysj\controller.sysj line: 101, column: 6
                              selectPercentage.setPresent();//sysj\controller.sysj line: 102, column: 6
                              currsigs.addElement(selectPercentage);
                              selectPercentage.setValue(recPercentLiq_thread_7.get(canisterNum_thread_7 - 1));//sysj\controller.sysj line: 102, column: 6
                              S5436=0;
                              System.out.println("selecting canister " + canisterNum_thread_7);//sysj\controller.sysj line: 105, column: 6
                              selectCanister.setPresent();//sysj\controller.sysj line: 106, column: 7
                              currsigs.addElement(selectCanister);
                              selectCanister.setValue(canisterNum_thread_7);//sysj\controller.sysj line: 106, column: 7
                              active[7]=1;
                              ends[7]=1;
                              break RUN;
                            }
                            else {
                              ends[7]=2;
                              ;//sysj\controller.sysj line: 98, column: 4
                              S5401=1;
                              S5956=0;
                              if(!fillerStatus_o.isPartnerPresent() || fillerStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 126, column: 4
                                fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 126, column: 4
                                S5956=1;
                                active[7]=1;
                                ends[7]=1;
                                break RUN;
                              }
                              else {
                                S5951=0;
                                if(fillerStatus_o.isACK()){//sysj\controller.sysj line: 126, column: 4
                                  fillerStatus_o.setVal("done");//sysj\controller.sysj line: 126, column: 4
                                  S5951=1;
                                  if(!fillerStatus_o.isACK()){//sysj\controller.sysj line: 126, column: 4
                                    fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 126, column: 4
                                    ends[7]=2;
                                    ;//sysj\controller.sysj line: 126, column: 4
                                    S5216=3;
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
                            S5216=3;
                            active[7]=1;
                            ends[7]=1;
                            break RUN;
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
              switch(S5223){
                case 0 : 
                  if(!fillerStatus_o.isPartnerPresent() || fillerStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 89, column: 4
                    fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 89, column: 4
                    S5223=1;
                    active[7]=1;
                    ends[7]=1;
                    break RUN;
                  }
                  else {
                    switch(S5218){
                      case 0 : 
                        if(fillerStatus_o.isACK()){//sysj\controller.sysj line: 89, column: 4
                          fillerStatus_o.setVal("idle");//sysj\controller.sysj line: 89, column: 4
                          S5218=1;
                          if(!fillerStatus_o.isACK()){//sysj\controller.sysj line: 89, column: 4
                            fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 89, column: 4
                            ends[7]=2;
                            ;//sysj\controller.sysj line: 89, column: 4
                            S5216=2;
                            if(bottleAtPos2.getprestatus()){//sysj\controller.sysj line: 93, column: 11
                              System.out.println("FillerController: - Bottle detected at position 2.");//sysj\controller.sysj line: 94, column: 4
                              recPercentLiq_thread_7 = (ArrayList)(fillerReq_in.getVal() == null ? null : ((ArrayList)fillerReq_in.getVal()));//sysj\controller.sysj line: 95, column: 4
                              canisterNum_thread_7 = 1;//sysj\controller.sysj line: 96, column: 4
                              S5401=0;
                              if(canisterNum_thread_7 < 5){//sysj\controller.sysj line: 98, column: 10
                                System.out.println("selecting percentage " + recPercentLiq_thread_7.get(canisterNum_thread_7 - 1));//sysj\controller.sysj line: 101, column: 6
                                selectPercentage.setPresent();//sysj\controller.sysj line: 102, column: 6
                                currsigs.addElement(selectPercentage);
                                selectPercentage.setValue(recPercentLiq_thread_7.get(canisterNum_thread_7 - 1));//sysj\controller.sysj line: 102, column: 6
                                S5436=0;
                                System.out.println("selecting canister " + canisterNum_thread_7);//sysj\controller.sysj line: 105, column: 6
                                selectCanister.setPresent();//sysj\controller.sysj line: 106, column: 7
                                currsigs.addElement(selectCanister);
                                selectCanister.setValue(canisterNum_thread_7);//sysj\controller.sysj line: 106, column: 7
                                active[7]=1;
                                ends[7]=1;
                                break RUN;
                              }
                              else {
                                ends[7]=2;
                                ;//sysj\controller.sysj line: 98, column: 4
                                S5401=1;
                                S5956=0;
                                if(!fillerStatus_o.isPartnerPresent() || fillerStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 126, column: 4
                                  fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 126, column: 4
                                  S5956=1;
                                  active[7]=1;
                                  ends[7]=1;
                                  break RUN;
                                }
                                else {
                                  S5951=0;
                                  if(fillerStatus_o.isACK()){//sysj\controller.sysj line: 126, column: 4
                                    fillerStatus_o.setVal("done");//sysj\controller.sysj line: 126, column: 4
                                    S5951=1;
                                    if(!fillerStatus_o.isACK()){//sysj\controller.sysj line: 126, column: 4
                                      fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 126, column: 4
                                      ends[7]=2;
                                      ;//sysj\controller.sysj line: 126, column: 4
                                      S5216=3;
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
                              S5216=3;
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
                        if(!fillerStatus_o.isACK()){//sysj\controller.sysj line: 89, column: 4
                          fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 89, column: 4
                          ends[7]=2;
                          ;//sysj\controller.sysj line: 89, column: 4
                          S5216=2;
                          if(bottleAtPos2.getprestatus()){//sysj\controller.sysj line: 93, column: 11
                            System.out.println("FillerController: - Bottle detected at position 2.");//sysj\controller.sysj line: 94, column: 4
                            recPercentLiq_thread_7 = (ArrayList)(fillerReq_in.getVal() == null ? null : ((ArrayList)fillerReq_in.getVal()));//sysj\controller.sysj line: 95, column: 4
                            canisterNum_thread_7 = 1;//sysj\controller.sysj line: 96, column: 4
                            S5401=0;
                            if(canisterNum_thread_7 < 5){//sysj\controller.sysj line: 98, column: 10
                              System.out.println("selecting percentage " + recPercentLiq_thread_7.get(canisterNum_thread_7 - 1));//sysj\controller.sysj line: 101, column: 6
                              selectPercentage.setPresent();//sysj\controller.sysj line: 102, column: 6
                              currsigs.addElement(selectPercentage);
                              selectPercentage.setValue(recPercentLiq_thread_7.get(canisterNum_thread_7 - 1));//sysj\controller.sysj line: 102, column: 6
                              S5436=0;
                              System.out.println("selecting canister " + canisterNum_thread_7);//sysj\controller.sysj line: 105, column: 6
                              selectCanister.setPresent();//sysj\controller.sysj line: 106, column: 7
                              currsigs.addElement(selectCanister);
                              selectCanister.setValue(canisterNum_thread_7);//sysj\controller.sysj line: 106, column: 7
                              active[7]=1;
                              ends[7]=1;
                              break RUN;
                            }
                            else {
                              ends[7]=2;
                              ;//sysj\controller.sysj line: 98, column: 4
                              S5401=1;
                              S5956=0;
                              if(!fillerStatus_o.isPartnerPresent() || fillerStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 126, column: 4
                                fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 126, column: 4
                                S5956=1;
                                active[7]=1;
                                ends[7]=1;
                                break RUN;
                              }
                              else {
                                S5951=0;
                                if(fillerStatus_o.isACK()){//sysj\controller.sysj line: 126, column: 4
                                  fillerStatus_o.setVal("done");//sysj\controller.sysj line: 126, column: 4
                                  S5951=1;
                                  if(!fillerStatus_o.isACK()){//sysj\controller.sysj line: 126, column: 4
                                    fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 126, column: 4
                                    ends[7]=2;
                                    ;//sysj\controller.sysj line: 126, column: 4
                                    S5216=3;
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
                            S5216=3;
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
                  if(!fillerStatus_o.isPartnerPresent() || fillerStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 89, column: 4
                    fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 89, column: 4
                    S5223=1;
                    active[7]=1;
                    ends[7]=1;
                    break RUN;
                  }
                  else {
                    S5218=0;
                    if(fillerStatus_o.isACK()){//sysj\controller.sysj line: 89, column: 4
                      fillerStatus_o.setVal("idle");//sysj\controller.sysj line: 89, column: 4
                      S5218=1;
                      if(!fillerStatus_o.isACK()){//sysj\controller.sysj line: 89, column: 4
                        fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 89, column: 4
                        ends[7]=2;
                        ;//sysj\controller.sysj line: 89, column: 4
                        S5216=2;
                        if(bottleAtPos2.getprestatus()){//sysj\controller.sysj line: 93, column: 11
                          System.out.println("FillerController: - Bottle detected at position 2.");//sysj\controller.sysj line: 94, column: 4
                          recPercentLiq_thread_7 = (ArrayList)(fillerReq_in.getVal() == null ? null : ((ArrayList)fillerReq_in.getVal()));//sysj\controller.sysj line: 95, column: 4
                          canisterNum_thread_7 = 1;//sysj\controller.sysj line: 96, column: 4
                          S5401=0;
                          if(canisterNum_thread_7 < 5){//sysj\controller.sysj line: 98, column: 10
                            System.out.println("selecting percentage " + recPercentLiq_thread_7.get(canisterNum_thread_7 - 1));//sysj\controller.sysj line: 101, column: 6
                            selectPercentage.setPresent();//sysj\controller.sysj line: 102, column: 6
                            currsigs.addElement(selectPercentage);
                            selectPercentage.setValue(recPercentLiq_thread_7.get(canisterNum_thread_7 - 1));//sysj\controller.sysj line: 102, column: 6
                            S5436=0;
                            System.out.println("selecting canister " + canisterNum_thread_7);//sysj\controller.sysj line: 105, column: 6
                            selectCanister.setPresent();//sysj\controller.sysj line: 106, column: 7
                            currsigs.addElement(selectCanister);
                            selectCanister.setValue(canisterNum_thread_7);//sysj\controller.sysj line: 106, column: 7
                            active[7]=1;
                            ends[7]=1;
                            break RUN;
                          }
                          else {
                            ends[7]=2;
                            ;//sysj\controller.sysj line: 98, column: 4
                            S5401=1;
                            S5956=0;
                            if(!fillerStatus_o.isPartnerPresent() || fillerStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 126, column: 4
                              fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 126, column: 4
                              S5956=1;
                              active[7]=1;
                              ends[7]=1;
                              break RUN;
                            }
                            else {
                              S5951=0;
                              if(fillerStatus_o.isACK()){//sysj\controller.sysj line: 126, column: 4
                                fillerStatus_o.setVal("done");//sysj\controller.sysj line: 126, column: 4
                                S5951=1;
                                if(!fillerStatus_o.isACK()){//sysj\controller.sysj line: 126, column: 4
                                  fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 126, column: 4
                                  ends[7]=2;
                                  ;//sysj\controller.sysj line: 126, column: 4
                                  S5216=3;
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
                          S5216=3;
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
            
            case 2 : 
              switch(S5401){
                case 0 : 
                  switch(S5436){
                    case 0 : 
                      if(selectedCanister.getprestatus()){//sysj\controller.sysj line: 104, column: 11
                        S5436=1;
                        thread31171(tdone,ends);
                        thread31172(tdone,ends);
                        int biggest31173 = 0;
                        if(ends[8]>=biggest31173){
                          biggest31173=ends[8];
                        }
                        if(ends[9]>=biggest31173){
                          biggest31173=ends[9];
                        }
                        if(biggest31173 == 1){
                          active[7]=1;
                          ends[7]=1;
                          break RUN;
                        }
                      }
                      else {
                        selectCanister.setPresent();//sysj\controller.sysj line: 106, column: 7
                        currsigs.addElement(selectCanister);
                        selectCanister.setValue(canisterNum_thread_7);//sysj\controller.sysj line: 106, column: 7
                        active[7]=1;
                        ends[7]=1;
                        break RUN;
                      }
                    
                    case 1 : 
                      if(dosUnitFilled.getprestatus() && valveInjectorActive.getprestatus()){//sysj\controller.sysj line: 113, column: 12
                        S5436=2;
                        thread31174(tdone,ends);
                        thread31175(tdone,ends);
                        int biggest31176 = 0;
                        if(ends[10]>=biggest31176){
                          biggest31176=ends[10];
                        }
                        if(ends[11]>=biggest31176){
                          biggest31176=ends[11];
                        }
                        if(biggest31176 == 1){
                          active[7]=1;
                          ends[7]=1;
                          break RUN;
                        }
                      }
                      else {
                        thread31177(tdone,ends);
                        thread31178(tdone,ends);
                        int biggest31179 = 0;
                        if(ends[8]>=biggest31179){
                          biggest31179=ends[8];
                        }
                        if(ends[9]>=biggest31179){
                          biggest31179=ends[9];
                        }
                        if(biggest31179 == 1){
                          active[7]=1;
                          ends[7]=1;
                          break RUN;
                        }
                        //FINXME code
                        if(biggest31179 == 0){
                          S5436=2;
                          thread31180(tdone,ends);
                          thread31181(tdone,ends);
                          int biggest31182 = 0;
                          if(ends[10]>=biggest31182){
                            biggest31182=ends[10];
                          }
                          if(ends[11]>=biggest31182){
                            biggest31182=ends[11];
                          }
                          if(biggest31182 == 1){
                            active[7]=1;
                            ends[7]=1;
                            break RUN;
                          }
                        }
                      }
                    
                    case 2 : 
                      if(dosUnitEvac.getprestatus()){//sysj\controller.sysj line: 119, column: 12
                        canisterNum_thread_7 += 1;//sysj\controller.sysj line: 123, column: 6
                        S5436=3;
                        active[7]=1;
                        ends[7]=1;
                        break RUN;
                      }
                      else {
                        thread31183(tdone,ends);
                        thread31184(tdone,ends);
                        int biggest31185 = 0;
                        if(ends[10]>=biggest31185){
                          biggest31185=ends[10];
                        }
                        if(ends[11]>=biggest31185){
                          biggest31185=ends[11];
                        }
                        if(biggest31185 == 1){
                          active[7]=1;
                          ends[7]=1;
                          break RUN;
                        }
                        //FINXME code
                        if(biggest31185 == 0){
                          canisterNum_thread_7 += 1;//sysj\controller.sysj line: 123, column: 6
                          S5436=3;
                          active[7]=1;
                          ends[7]=1;
                          break RUN;
                        }
                      }
                    
                    case 3 : 
                      S5436=3;
                      if(canisterNum_thread_7 < 5){//sysj\controller.sysj line: 98, column: 10
                        System.out.println("selecting percentage " + recPercentLiq_thread_7.get(canisterNum_thread_7 - 1));//sysj\controller.sysj line: 101, column: 6
                        selectPercentage.setPresent();//sysj\controller.sysj line: 102, column: 6
                        currsigs.addElement(selectPercentage);
                        selectPercentage.setValue(recPercentLiq_thread_7.get(canisterNum_thread_7 - 1));//sysj\controller.sysj line: 102, column: 6
                        S5436=0;
                        System.out.println("selecting canister " + canisterNum_thread_7);//sysj\controller.sysj line: 105, column: 6
                        selectCanister.setPresent();//sysj\controller.sysj line: 106, column: 7
                        currsigs.addElement(selectCanister);
                        selectCanister.setValue(canisterNum_thread_7);//sysj\controller.sysj line: 106, column: 7
                        active[7]=1;
                        ends[7]=1;
                        break RUN;
                      }
                      else {
                        ends[7]=2;
                        ;//sysj\controller.sysj line: 98, column: 4
                        S5401=1;
                        S5956=0;
                        if(!fillerStatus_o.isPartnerPresent() || fillerStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 126, column: 4
                          fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 126, column: 4
                          S5956=1;
                          active[7]=1;
                          ends[7]=1;
                          break RUN;
                        }
                        else {
                          S5951=0;
                          if(fillerStatus_o.isACK()){//sysj\controller.sysj line: 126, column: 4
                            fillerStatus_o.setVal("done");//sysj\controller.sysj line: 126, column: 4
                            S5951=1;
                            if(!fillerStatus_o.isACK()){//sysj\controller.sysj line: 126, column: 4
                              fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 126, column: 4
                              ends[7]=2;
                              ;//sysj\controller.sysj line: 126, column: 4
                              S5216=3;
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
                
                case 1 : 
                  switch(S5956){
                    case 0 : 
                      if(!fillerStatus_o.isPartnerPresent() || fillerStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 126, column: 4
                        fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 126, column: 4
                        S5956=1;
                        active[7]=1;
                        ends[7]=1;
                        break RUN;
                      }
                      else {
                        switch(S5951){
                          case 0 : 
                            if(fillerStatus_o.isACK()){//sysj\controller.sysj line: 126, column: 4
                              fillerStatus_o.setVal("done");//sysj\controller.sysj line: 126, column: 4
                              S5951=1;
                              if(!fillerStatus_o.isACK()){//sysj\controller.sysj line: 126, column: 4
                                fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 126, column: 4
                                ends[7]=2;
                                ;//sysj\controller.sysj line: 126, column: 4
                                S5216=3;
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
                            if(!fillerStatus_o.isACK()){//sysj\controller.sysj line: 126, column: 4
                              fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 126, column: 4
                              ends[7]=2;
                              ;//sysj\controller.sysj line: 126, column: 4
                              S5216=3;
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
                      S5956=1;
                      S5956=0;
                      if(!fillerStatus_o.isPartnerPresent() || fillerStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 126, column: 4
                        fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 126, column: 4
                        S5956=1;
                        active[7]=1;
                        ends[7]=1;
                        break RUN;
                      }
                      else {
                        S5951=0;
                        if(fillerStatus_o.isACK()){//sysj\controller.sysj line: 126, column: 4
                          fillerStatus_o.setVal("done");//sysj\controller.sysj line: 126, column: 4
                          S5951=1;
                          if(!fillerStatus_o.isACK()){//sysj\controller.sysj line: 126, column: 4
                            fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 126, column: 4
                            ends[7]=2;
                            ;//sysj\controller.sysj line: 126, column: 4
                            S5216=3;
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
            
            case 3 : 
              S5216=3;
              S5216=0;
              S5200=0;
              if(!fillerReq_in.isPartnerPresent() || fillerReq_in.isPartnerPreempted()){//sysj\controller.sysj line: 83, column: 3
                fillerReq_in.setACK(false);//sysj\controller.sysj line: 83, column: 3
                S5200=1;
                active[7]=1;
                ends[7]=1;
                break RUN;
              }
              else {
                S5195=0;
                if(!fillerReq_in.isREQ()){//sysj\controller.sysj line: 83, column: 3
                  fillerReq_in.setACK(true);//sysj\controller.sysj line: 83, column: 3
                  S5195=1;
                  if(fillerReq_in.isREQ()){//sysj\controller.sysj line: 83, column: 3
                    fillerReq_in.setACK(false);//sysj\controller.sysj line: 83, column: 3
                    ends[7]=2;
                    ;//sysj\controller.sysj line: 83, column: 3
                    System.out.println("FillerController: - Received request");//sysj\controller.sysj line: 86, column: 3
                    S5216=1;
                    if(!bottleAtPos2.getprestatus()){//sysj\controller.sysj line: 87, column: 11
                      System.out.println("FillerController: - Idle (no bottle at pos 2).");//sysj\controller.sysj line: 88, column: 4
                      S5223=0;
                      if(!fillerStatus_o.isPartnerPresent() || fillerStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 89, column: 4
                        fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 89, column: 4
                        S5223=1;
                        active[7]=1;
                        ends[7]=1;
                        break RUN;
                      }
                      else {
                        S5218=0;
                        if(fillerStatus_o.isACK()){//sysj\controller.sysj line: 89, column: 4
                          fillerStatus_o.setVal("idle");//sysj\controller.sysj line: 89, column: 4
                          S5218=1;
                          if(!fillerStatus_o.isACK()){//sysj\controller.sysj line: 89, column: 4
                            fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 89, column: 4
                            ends[7]=2;
                            ;//sysj\controller.sysj line: 89, column: 4
                            S5216=2;
                            if(bottleAtPos2.getprestatus()){//sysj\controller.sysj line: 93, column: 11
                              System.out.println("FillerController: - Bottle detected at position 2.");//sysj\controller.sysj line: 94, column: 4
                              recPercentLiq_thread_7 = (ArrayList)(fillerReq_in.getVal() == null ? null : ((ArrayList)fillerReq_in.getVal()));//sysj\controller.sysj line: 95, column: 4
                              canisterNum_thread_7 = 1;//sysj\controller.sysj line: 96, column: 4
                              S5401=0;
                              if(canisterNum_thread_7 < 5){//sysj\controller.sysj line: 98, column: 10
                                System.out.println("selecting percentage " + recPercentLiq_thread_7.get(canisterNum_thread_7 - 1));//sysj\controller.sysj line: 101, column: 6
                                selectPercentage.setPresent();//sysj\controller.sysj line: 102, column: 6
                                currsigs.addElement(selectPercentage);
                                selectPercentage.setValue(recPercentLiq_thread_7.get(canisterNum_thread_7 - 1));//sysj\controller.sysj line: 102, column: 6
                                S5436=0;
                                System.out.println("selecting canister " + canisterNum_thread_7);//sysj\controller.sysj line: 105, column: 6
                                selectCanister.setPresent();//sysj\controller.sysj line: 106, column: 7
                                currsigs.addElement(selectCanister);
                                selectCanister.setValue(canisterNum_thread_7);//sysj\controller.sysj line: 106, column: 7
                                active[7]=1;
                                ends[7]=1;
                                break RUN;
                              }
                              else {
                                ends[7]=2;
                                ;//sysj\controller.sysj line: 98, column: 4
                                S5401=1;
                                S5956=0;
                                if(!fillerStatus_o.isPartnerPresent() || fillerStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 126, column: 4
                                  fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 126, column: 4
                                  S5956=1;
                                  active[7]=1;
                                  ends[7]=1;
                                  break RUN;
                                }
                                else {
                                  S5951=0;
                                  if(fillerStatus_o.isACK()){//sysj\controller.sysj line: 126, column: 4
                                    fillerStatus_o.setVal("done");//sysj\controller.sysj line: 126, column: 4
                                    S5951=1;
                                    if(!fillerStatus_o.isACK()){//sysj\controller.sysj line: 126, column: 4
                                      fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 126, column: 4
                                      ends[7]=2;
                                      ;//sysj\controller.sysj line: 126, column: 4
                                      S5216=3;
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
                              S5216=3;
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
                      S5216=2;
                      if(bottleAtPos2.getprestatus()){//sysj\controller.sysj line: 93, column: 11
                        System.out.println("FillerController: - Bottle detected at position 2.");//sysj\controller.sysj line: 94, column: 4
                        recPercentLiq_thread_7 = (ArrayList)(fillerReq_in.getVal() == null ? null : ((ArrayList)fillerReq_in.getVal()));//sysj\controller.sysj line: 95, column: 4
                        canisterNum_thread_7 = 1;//sysj\controller.sysj line: 96, column: 4
                        S5401=0;
                        if(canisterNum_thread_7 < 5){//sysj\controller.sysj line: 98, column: 10
                          System.out.println("selecting percentage " + recPercentLiq_thread_7.get(canisterNum_thread_7 - 1));//sysj\controller.sysj line: 101, column: 6
                          selectPercentage.setPresent();//sysj\controller.sysj line: 102, column: 6
                          currsigs.addElement(selectPercentage);
                          selectPercentage.setValue(recPercentLiq_thread_7.get(canisterNum_thread_7 - 1));//sysj\controller.sysj line: 102, column: 6
                          S5436=0;
                          System.out.println("selecting canister " + canisterNum_thread_7);//sysj\controller.sysj line: 105, column: 6
                          selectCanister.setPresent();//sysj\controller.sysj line: 106, column: 7
                          currsigs.addElement(selectCanister);
                          selectCanister.setValue(canisterNum_thread_7);//sysj\controller.sysj line: 106, column: 7
                          active[7]=1;
                          ends[7]=1;
                          break RUN;
                        }
                        else {
                          ends[7]=2;
                          ;//sysj\controller.sysj line: 98, column: 4
                          S5401=1;
                          S5956=0;
                          if(!fillerStatus_o.isPartnerPresent() || fillerStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 126, column: 4
                            fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 126, column: 4
                            S5956=1;
                            active[7]=1;
                            ends[7]=1;
                            break RUN;
                          }
                          else {
                            S5951=0;
                            if(fillerStatus_o.isACK()){//sysj\controller.sysj line: 126, column: 4
                              fillerStatus_o.setVal("done");//sysj\controller.sysj line: 126, column: 4
                              S5951=1;
                              if(!fillerStatus_o.isACK()){//sysj\controller.sysj line: 126, column: 4
                                fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 126, column: 4
                                ends[7]=2;
                                ;//sysj\controller.sysj line: 126, column: 4
                                S5216=3;
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
                        S5216=3;
                        active[7]=1;
                        ends[7]=1;
                        break RUN;
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
        
      }
    }
  }

  public void init(){
    char [] active1 = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
    char [] paused1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    char [] suspended1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
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
          fillerStatus_o.gethook();
          bottleAtPos2.gethook();
          dosUnitEvac.gethook();
          dosUnitFilled.gethook();
          valveInjectorActive.gethook();
          selectedCanister.gethook();
          selectedPercentage.gethook();
          df = true;
        }
        runClockDomain();
      }
      bottleAtPos2.setpreclear();
      dosUnitEvac.setpreclear();
      dosUnitFilled.setpreclear();
      valveInjectorActive.setpreclear();
      selectedCanister.setpreclear();
      selectedPercentage.setpreclear();
      valveInjectorOnOff.setpreclear();
      valveInletOnOff.setpreclear();
      dosUnitValveRetract.setpreclear();
      dosUnitValveExtend.setpreclear();
      selectCanister.setpreclear();
      selectPercentage.setpreclear();
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
      dummyint = valveInjectorActive.getStatus() ? valveInjectorActive.setprepresent() : valveInjectorActive.setpreclear();
      valveInjectorActive.setpreval(valveInjectorActive.getValue());
      valveInjectorActive.setClear();
      dummyint = selectedCanister.getStatus() ? selectedCanister.setprepresent() : selectedCanister.setpreclear();
      selectedCanister.setpreval(selectedCanister.getValue());
      selectedCanister.setClear();
      dummyint = selectedPercentage.getStatus() ? selectedPercentage.setprepresent() : selectedPercentage.setpreclear();
      selectedPercentage.setpreval(selectedPercentage.getValue());
      selectedPercentage.setClear();
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
      selectPercentage.sethook();
      selectPercentage.setClear();
      fillerReq_in.sethook();
      fillerStatus_o.sethook();
      if(paused[7]!=0 || suspended[7]!=0 || active[7]!=1);
      else{
        fillerReq_in.gethook();
        fillerStatus_o.gethook();
        bottleAtPos2.gethook();
        dosUnitEvac.gethook();
        dosUnitFilled.gethook();
        valveInjectorActive.gethook();
        selectedCanister.gethook();
        selectedPercentage.gethook();
      }
      runFinisher();
      if(active[7] == 0){
      	this.terminated = true;
      }
      if(!threaded) break;
    }
  }
}
