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
  private int S22388 = 1;
  private int S5156 = 1;
  private int S5140 = 1;
  private int S5135 = 1;
  private int S5163 = 1;
  private int S5158 = 1;
  private int S5341 = 1;
  private int S5376 = 1;
  private int S5381 = 1;
  private int S5386 = 1;
  private int S5403 = 1;
  private int S5408 = 1;
  private int S5896 = 1;
  private int S5891 = 1;
  
  private int[] ends = new int[22];
  private int[] tdone = new int[22];
  
  public void thread40519(int [] tdone, int [] ends){
        switch(S5408){
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

  public void thread40518(int [] tdone, int [] ends){
        switch(S5403){
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

  public void thread40516(int [] tdone, int [] ends){
        S5408=1;
    dosUnitValveExtend.setPresent();//sysj\controller.sysj line: 120, column: 36
    currsigs.addElement(dosUnitValveExtend);
    active[11]=1;
    ends[11]=1;
    tdone[11]=1;
  }

  public void thread40515(int [] tdone, int [] ends){
        S5403=1;
    valveInletOnOff.setPresent();//sysj\controller.sysj line: 120, column: 8
    currsigs.addElement(valveInletOnOff);
    active[10]=1;
    ends[10]=1;
    tdone[10]=1;
  }

  public void thread40513(int [] tdone, int [] ends){
        switch(S5386){
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

  public void thread40512(int [] tdone, int [] ends){
        switch(S5381){
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

  public void thread40510(int [] tdone, int [] ends){
        S5408=1;
    dosUnitValveExtend.setPresent();//sysj\controller.sysj line: 120, column: 36
    currsigs.addElement(dosUnitValveExtend);
    active[11]=1;
    ends[11]=1;
    tdone[11]=1;
  }

  public void thread40509(int [] tdone, int [] ends){
        S5403=1;
    valveInletOnOff.setPresent();//sysj\controller.sysj line: 120, column: 8
    currsigs.addElement(valveInletOnOff);
    active[10]=1;
    ends[10]=1;
    tdone[10]=1;
  }

  public void thread40507(int [] tdone, int [] ends){
        S5386=1;
    valveInjectorOnOff.setPresent();//sysj\controller.sysj line: 114, column: 42
    currsigs.addElement(valveInjectorOnOff);
    active[9]=1;
    ends[9]=1;
    tdone[9]=1;
  }

  public void thread40506(int [] tdone, int [] ends){
        S5381=1;
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
      switch(S22388){
        case 0 : 
          S22388=0;
          break RUN;
        
        case 1 : 
          S22388=2;
          S22388=2;
          S5156=0;
          S5140=0;
          if(!fillerReq_in.isPartnerPresent() || fillerReq_in.isPartnerPreempted()){//sysj\controller.sysj line: 83, column: 3
            fillerReq_in.setACK(false);//sysj\controller.sysj line: 83, column: 3
            S5140=1;
            active[7]=1;
            ends[7]=1;
            break RUN;
          }
          else {
            S5135=0;
            if(!fillerReq_in.isREQ()){//sysj\controller.sysj line: 83, column: 3
              fillerReq_in.setACK(true);//sysj\controller.sysj line: 83, column: 3
              S5135=1;
              if(fillerReq_in.isREQ()){//sysj\controller.sysj line: 83, column: 3
                fillerReq_in.setACK(false);//sysj\controller.sysj line: 83, column: 3
                ends[7]=2;
                ;//sysj\controller.sysj line: 83, column: 3
                System.out.println("FillerController: - Received request");//sysj\controller.sysj line: 86, column: 3
                S5156=1;
                if(!bottleAtPos2.getprestatus()){//sysj\controller.sysj line: 87, column: 11
                  System.out.println("FillerController: - Idle (no bottle at pos 2).");//sysj\controller.sysj line: 88, column: 4
                  S5163=0;
                  if(!fillerStatus_o.isPartnerPresent() || fillerStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 89, column: 4
                    fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 89, column: 4
                    S5163=1;
                    active[7]=1;
                    ends[7]=1;
                    break RUN;
                  }
                  else {
                    S5158=0;
                    if(fillerStatus_o.isACK()){//sysj\controller.sysj line: 89, column: 4
                      fillerStatus_o.setVal("idle");//sysj\controller.sysj line: 89, column: 4
                      S5158=1;
                      if(!fillerStatus_o.isACK()){//sysj\controller.sysj line: 89, column: 4
                        fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 89, column: 4
                        ends[7]=2;
                        ;//sysj\controller.sysj line: 89, column: 4
                        S5156=2;
                        if(bottleAtPos2.getprestatus()){//sysj\controller.sysj line: 93, column: 11
                          System.out.println("FillerController: - Bottle detected at position 2.");//sysj\controller.sysj line: 94, column: 4
                          recPercentLiq_thread_7 = (ArrayList)(fillerReq_in.getVal() == null ? null : ((ArrayList)fillerReq_in.getVal()));//sysj\controller.sysj line: 95, column: 4
                          canisterNum_thread_7 = 1;//sysj\controller.sysj line: 96, column: 4
                          S5341=0;
                          if(canisterNum_thread_7 < 5){//sysj\controller.sysj line: 98, column: 10
                            System.out.println("selecting percentage " + recPercentLiq_thread_7.get(canisterNum_thread_7 - 1));//sysj\controller.sysj line: 101, column: 6
                            selectPercentage.setPresent();//sysj\controller.sysj line: 102, column: 6
                            currsigs.addElement(selectPercentage);
                            selectPercentage.setValue(recPercentLiq_thread_7.get(canisterNum_thread_7 - 1));//sysj\controller.sysj line: 102, column: 6
                            S5376=0;
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
                            S5341=1;
                            S5896=0;
                            if(!fillerStatus_o.isPartnerPresent() || fillerStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 126, column: 4
                              fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 126, column: 4
                              S5896=1;
                              active[7]=1;
                              ends[7]=1;
                              break RUN;
                            }
                            else {
                              S5891=0;
                              if(fillerStatus_o.isACK()){//sysj\controller.sysj line: 126, column: 4
                                fillerStatus_o.setVal("done");//sysj\controller.sysj line: 126, column: 4
                                S5891=1;
                                if(!fillerStatus_o.isACK()){//sysj\controller.sysj line: 126, column: 4
                                  fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 126, column: 4
                                  ends[7]=2;
                                  ;//sysj\controller.sysj line: 126, column: 4
                                  S5156=3;
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
                          S5156=3;
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
                  S5156=2;
                  if(bottleAtPos2.getprestatus()){//sysj\controller.sysj line: 93, column: 11
                    System.out.println("FillerController: - Bottle detected at position 2.");//sysj\controller.sysj line: 94, column: 4
                    recPercentLiq_thread_7 = (ArrayList)(fillerReq_in.getVal() == null ? null : ((ArrayList)fillerReq_in.getVal()));//sysj\controller.sysj line: 95, column: 4
                    canisterNum_thread_7 = 1;//sysj\controller.sysj line: 96, column: 4
                    S5341=0;
                    if(canisterNum_thread_7 < 5){//sysj\controller.sysj line: 98, column: 10
                      System.out.println("selecting percentage " + recPercentLiq_thread_7.get(canisterNum_thread_7 - 1));//sysj\controller.sysj line: 101, column: 6
                      selectPercentage.setPresent();//sysj\controller.sysj line: 102, column: 6
                      currsigs.addElement(selectPercentage);
                      selectPercentage.setValue(recPercentLiq_thread_7.get(canisterNum_thread_7 - 1));//sysj\controller.sysj line: 102, column: 6
                      S5376=0;
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
                      S5341=1;
                      S5896=0;
                      if(!fillerStatus_o.isPartnerPresent() || fillerStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 126, column: 4
                        fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 126, column: 4
                        S5896=1;
                        active[7]=1;
                        ends[7]=1;
                        break RUN;
                      }
                      else {
                        S5891=0;
                        if(fillerStatus_o.isACK()){//sysj\controller.sysj line: 126, column: 4
                          fillerStatus_o.setVal("done");//sysj\controller.sysj line: 126, column: 4
                          S5891=1;
                          if(!fillerStatus_o.isACK()){//sysj\controller.sysj line: 126, column: 4
                            fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 126, column: 4
                            ends[7]=2;
                            ;//sysj\controller.sysj line: 126, column: 4
                            S5156=3;
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
                    S5156=3;
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
          switch(S5156){
            case 0 : 
              switch(S5140){
                case 0 : 
                  if(!fillerReq_in.isPartnerPresent() || fillerReq_in.isPartnerPreempted()){//sysj\controller.sysj line: 83, column: 3
                    fillerReq_in.setACK(false);//sysj\controller.sysj line: 83, column: 3
                    S5140=1;
                    active[7]=1;
                    ends[7]=1;
                    break RUN;
                  }
                  else {
                    switch(S5135){
                      case 0 : 
                        if(!fillerReq_in.isREQ()){//sysj\controller.sysj line: 83, column: 3
                          fillerReq_in.setACK(true);//sysj\controller.sysj line: 83, column: 3
                          S5135=1;
                          if(fillerReq_in.isREQ()){//sysj\controller.sysj line: 83, column: 3
                            fillerReq_in.setACK(false);//sysj\controller.sysj line: 83, column: 3
                            ends[7]=2;
                            ;//sysj\controller.sysj line: 83, column: 3
                            System.out.println("FillerController: - Received request");//sysj\controller.sysj line: 86, column: 3
                            S5156=1;
                            if(!bottleAtPos2.getprestatus()){//sysj\controller.sysj line: 87, column: 11
                              System.out.println("FillerController: - Idle (no bottle at pos 2).");//sysj\controller.sysj line: 88, column: 4
                              S5163=0;
                              if(!fillerStatus_o.isPartnerPresent() || fillerStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 89, column: 4
                                fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 89, column: 4
                                S5163=1;
                                active[7]=1;
                                ends[7]=1;
                                break RUN;
                              }
                              else {
                                S5158=0;
                                if(fillerStatus_o.isACK()){//sysj\controller.sysj line: 89, column: 4
                                  fillerStatus_o.setVal("idle");//sysj\controller.sysj line: 89, column: 4
                                  S5158=1;
                                  if(!fillerStatus_o.isACK()){//sysj\controller.sysj line: 89, column: 4
                                    fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 89, column: 4
                                    ends[7]=2;
                                    ;//sysj\controller.sysj line: 89, column: 4
                                    S5156=2;
                                    if(bottleAtPos2.getprestatus()){//sysj\controller.sysj line: 93, column: 11
                                      System.out.println("FillerController: - Bottle detected at position 2.");//sysj\controller.sysj line: 94, column: 4
                                      recPercentLiq_thread_7 = (ArrayList)(fillerReq_in.getVal() == null ? null : ((ArrayList)fillerReq_in.getVal()));//sysj\controller.sysj line: 95, column: 4
                                      canisterNum_thread_7 = 1;//sysj\controller.sysj line: 96, column: 4
                                      S5341=0;
                                      if(canisterNum_thread_7 < 5){//sysj\controller.sysj line: 98, column: 10
                                        System.out.println("selecting percentage " + recPercentLiq_thread_7.get(canisterNum_thread_7 - 1));//sysj\controller.sysj line: 101, column: 6
                                        selectPercentage.setPresent();//sysj\controller.sysj line: 102, column: 6
                                        currsigs.addElement(selectPercentage);
                                        selectPercentage.setValue(recPercentLiq_thread_7.get(canisterNum_thread_7 - 1));//sysj\controller.sysj line: 102, column: 6
                                        S5376=0;
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
                                        S5341=1;
                                        S5896=0;
                                        if(!fillerStatus_o.isPartnerPresent() || fillerStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 126, column: 4
                                          fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 126, column: 4
                                          S5896=1;
                                          active[7]=1;
                                          ends[7]=1;
                                          break RUN;
                                        }
                                        else {
                                          S5891=0;
                                          if(fillerStatus_o.isACK()){//sysj\controller.sysj line: 126, column: 4
                                            fillerStatus_o.setVal("done");//sysj\controller.sysj line: 126, column: 4
                                            S5891=1;
                                            if(!fillerStatus_o.isACK()){//sysj\controller.sysj line: 126, column: 4
                                              fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 126, column: 4
                                              ends[7]=2;
                                              ;//sysj\controller.sysj line: 126, column: 4
                                              S5156=3;
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
                                      S5156=3;
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
                              S5156=2;
                              if(bottleAtPos2.getprestatus()){//sysj\controller.sysj line: 93, column: 11
                                System.out.println("FillerController: - Bottle detected at position 2.");//sysj\controller.sysj line: 94, column: 4
                                recPercentLiq_thread_7 = (ArrayList)(fillerReq_in.getVal() == null ? null : ((ArrayList)fillerReq_in.getVal()));//sysj\controller.sysj line: 95, column: 4
                                canisterNum_thread_7 = 1;//sysj\controller.sysj line: 96, column: 4
                                S5341=0;
                                if(canisterNum_thread_7 < 5){//sysj\controller.sysj line: 98, column: 10
                                  System.out.println("selecting percentage " + recPercentLiq_thread_7.get(canisterNum_thread_7 - 1));//sysj\controller.sysj line: 101, column: 6
                                  selectPercentage.setPresent();//sysj\controller.sysj line: 102, column: 6
                                  currsigs.addElement(selectPercentage);
                                  selectPercentage.setValue(recPercentLiq_thread_7.get(canisterNum_thread_7 - 1));//sysj\controller.sysj line: 102, column: 6
                                  S5376=0;
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
                                  S5341=1;
                                  S5896=0;
                                  if(!fillerStatus_o.isPartnerPresent() || fillerStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 126, column: 4
                                    fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 126, column: 4
                                    S5896=1;
                                    active[7]=1;
                                    ends[7]=1;
                                    break RUN;
                                  }
                                  else {
                                    S5891=0;
                                    if(fillerStatus_o.isACK()){//sysj\controller.sysj line: 126, column: 4
                                      fillerStatus_o.setVal("done");//sysj\controller.sysj line: 126, column: 4
                                      S5891=1;
                                      if(!fillerStatus_o.isACK()){//sysj\controller.sysj line: 126, column: 4
                                        fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 126, column: 4
                                        ends[7]=2;
                                        ;//sysj\controller.sysj line: 126, column: 4
                                        S5156=3;
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
                                S5156=3;
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
                          S5156=1;
                          if(!bottleAtPos2.getprestatus()){//sysj\controller.sysj line: 87, column: 11
                            System.out.println("FillerController: - Idle (no bottle at pos 2).");//sysj\controller.sysj line: 88, column: 4
                            S5163=0;
                            if(!fillerStatus_o.isPartnerPresent() || fillerStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 89, column: 4
                              fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 89, column: 4
                              S5163=1;
                              active[7]=1;
                              ends[7]=1;
                              break RUN;
                            }
                            else {
                              S5158=0;
                              if(fillerStatus_o.isACK()){//sysj\controller.sysj line: 89, column: 4
                                fillerStatus_o.setVal("idle");//sysj\controller.sysj line: 89, column: 4
                                S5158=1;
                                if(!fillerStatus_o.isACK()){//sysj\controller.sysj line: 89, column: 4
                                  fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 89, column: 4
                                  ends[7]=2;
                                  ;//sysj\controller.sysj line: 89, column: 4
                                  S5156=2;
                                  if(bottleAtPos2.getprestatus()){//sysj\controller.sysj line: 93, column: 11
                                    System.out.println("FillerController: - Bottle detected at position 2.");//sysj\controller.sysj line: 94, column: 4
                                    recPercentLiq_thread_7 = (ArrayList)(fillerReq_in.getVal() == null ? null : ((ArrayList)fillerReq_in.getVal()));//sysj\controller.sysj line: 95, column: 4
                                    canisterNum_thread_7 = 1;//sysj\controller.sysj line: 96, column: 4
                                    S5341=0;
                                    if(canisterNum_thread_7 < 5){//sysj\controller.sysj line: 98, column: 10
                                      System.out.println("selecting percentage " + recPercentLiq_thread_7.get(canisterNum_thread_7 - 1));//sysj\controller.sysj line: 101, column: 6
                                      selectPercentage.setPresent();//sysj\controller.sysj line: 102, column: 6
                                      currsigs.addElement(selectPercentage);
                                      selectPercentage.setValue(recPercentLiq_thread_7.get(canisterNum_thread_7 - 1));//sysj\controller.sysj line: 102, column: 6
                                      S5376=0;
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
                                      S5341=1;
                                      S5896=0;
                                      if(!fillerStatus_o.isPartnerPresent() || fillerStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 126, column: 4
                                        fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 126, column: 4
                                        S5896=1;
                                        active[7]=1;
                                        ends[7]=1;
                                        break RUN;
                                      }
                                      else {
                                        S5891=0;
                                        if(fillerStatus_o.isACK()){//sysj\controller.sysj line: 126, column: 4
                                          fillerStatus_o.setVal("done");//sysj\controller.sysj line: 126, column: 4
                                          S5891=1;
                                          if(!fillerStatus_o.isACK()){//sysj\controller.sysj line: 126, column: 4
                                            fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 126, column: 4
                                            ends[7]=2;
                                            ;//sysj\controller.sysj line: 126, column: 4
                                            S5156=3;
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
                                    S5156=3;
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
                            S5156=2;
                            if(bottleAtPos2.getprestatus()){//sysj\controller.sysj line: 93, column: 11
                              System.out.println("FillerController: - Bottle detected at position 2.");//sysj\controller.sysj line: 94, column: 4
                              recPercentLiq_thread_7 = (ArrayList)(fillerReq_in.getVal() == null ? null : ((ArrayList)fillerReq_in.getVal()));//sysj\controller.sysj line: 95, column: 4
                              canisterNum_thread_7 = 1;//sysj\controller.sysj line: 96, column: 4
                              S5341=0;
                              if(canisterNum_thread_7 < 5){//sysj\controller.sysj line: 98, column: 10
                                System.out.println("selecting percentage " + recPercentLiq_thread_7.get(canisterNum_thread_7 - 1));//sysj\controller.sysj line: 101, column: 6
                                selectPercentage.setPresent();//sysj\controller.sysj line: 102, column: 6
                                currsigs.addElement(selectPercentage);
                                selectPercentage.setValue(recPercentLiq_thread_7.get(canisterNum_thread_7 - 1));//sysj\controller.sysj line: 102, column: 6
                                S5376=0;
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
                                S5341=1;
                                S5896=0;
                                if(!fillerStatus_o.isPartnerPresent() || fillerStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 126, column: 4
                                  fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 126, column: 4
                                  S5896=1;
                                  active[7]=1;
                                  ends[7]=1;
                                  break RUN;
                                }
                                else {
                                  S5891=0;
                                  if(fillerStatus_o.isACK()){//sysj\controller.sysj line: 126, column: 4
                                    fillerStatus_o.setVal("done");//sysj\controller.sysj line: 126, column: 4
                                    S5891=1;
                                    if(!fillerStatus_o.isACK()){//sysj\controller.sysj line: 126, column: 4
                                      fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 126, column: 4
                                      ends[7]=2;
                                      ;//sysj\controller.sysj line: 126, column: 4
                                      S5156=3;
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
                              S5156=3;
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
                  S5140=1;
                  S5140=0;
                  if(!fillerReq_in.isPartnerPresent() || fillerReq_in.isPartnerPreempted()){//sysj\controller.sysj line: 83, column: 3
                    fillerReq_in.setACK(false);//sysj\controller.sysj line: 83, column: 3
                    S5140=1;
                    active[7]=1;
                    ends[7]=1;
                    break RUN;
                  }
                  else {
                    S5135=0;
                    if(!fillerReq_in.isREQ()){//sysj\controller.sysj line: 83, column: 3
                      fillerReq_in.setACK(true);//sysj\controller.sysj line: 83, column: 3
                      S5135=1;
                      if(fillerReq_in.isREQ()){//sysj\controller.sysj line: 83, column: 3
                        fillerReq_in.setACK(false);//sysj\controller.sysj line: 83, column: 3
                        ends[7]=2;
                        ;//sysj\controller.sysj line: 83, column: 3
                        System.out.println("FillerController: - Received request");//sysj\controller.sysj line: 86, column: 3
                        S5156=1;
                        if(!bottleAtPos2.getprestatus()){//sysj\controller.sysj line: 87, column: 11
                          System.out.println("FillerController: - Idle (no bottle at pos 2).");//sysj\controller.sysj line: 88, column: 4
                          S5163=0;
                          if(!fillerStatus_o.isPartnerPresent() || fillerStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 89, column: 4
                            fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 89, column: 4
                            S5163=1;
                            active[7]=1;
                            ends[7]=1;
                            break RUN;
                          }
                          else {
                            S5158=0;
                            if(fillerStatus_o.isACK()){//sysj\controller.sysj line: 89, column: 4
                              fillerStatus_o.setVal("idle");//sysj\controller.sysj line: 89, column: 4
                              S5158=1;
                              if(!fillerStatus_o.isACK()){//sysj\controller.sysj line: 89, column: 4
                                fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 89, column: 4
                                ends[7]=2;
                                ;//sysj\controller.sysj line: 89, column: 4
                                S5156=2;
                                if(bottleAtPos2.getprestatus()){//sysj\controller.sysj line: 93, column: 11
                                  System.out.println("FillerController: - Bottle detected at position 2.");//sysj\controller.sysj line: 94, column: 4
                                  recPercentLiq_thread_7 = (ArrayList)(fillerReq_in.getVal() == null ? null : ((ArrayList)fillerReq_in.getVal()));//sysj\controller.sysj line: 95, column: 4
                                  canisterNum_thread_7 = 1;//sysj\controller.sysj line: 96, column: 4
                                  S5341=0;
                                  if(canisterNum_thread_7 < 5){//sysj\controller.sysj line: 98, column: 10
                                    System.out.println("selecting percentage " + recPercentLiq_thread_7.get(canisterNum_thread_7 - 1));//sysj\controller.sysj line: 101, column: 6
                                    selectPercentage.setPresent();//sysj\controller.sysj line: 102, column: 6
                                    currsigs.addElement(selectPercentage);
                                    selectPercentage.setValue(recPercentLiq_thread_7.get(canisterNum_thread_7 - 1));//sysj\controller.sysj line: 102, column: 6
                                    S5376=0;
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
                                    S5341=1;
                                    S5896=0;
                                    if(!fillerStatus_o.isPartnerPresent() || fillerStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 126, column: 4
                                      fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 126, column: 4
                                      S5896=1;
                                      active[7]=1;
                                      ends[7]=1;
                                      break RUN;
                                    }
                                    else {
                                      S5891=0;
                                      if(fillerStatus_o.isACK()){//sysj\controller.sysj line: 126, column: 4
                                        fillerStatus_o.setVal("done");//sysj\controller.sysj line: 126, column: 4
                                        S5891=1;
                                        if(!fillerStatus_o.isACK()){//sysj\controller.sysj line: 126, column: 4
                                          fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 126, column: 4
                                          ends[7]=2;
                                          ;//sysj\controller.sysj line: 126, column: 4
                                          S5156=3;
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
                                  S5156=3;
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
                          S5156=2;
                          if(bottleAtPos2.getprestatus()){//sysj\controller.sysj line: 93, column: 11
                            System.out.println("FillerController: - Bottle detected at position 2.");//sysj\controller.sysj line: 94, column: 4
                            recPercentLiq_thread_7 = (ArrayList)(fillerReq_in.getVal() == null ? null : ((ArrayList)fillerReq_in.getVal()));//sysj\controller.sysj line: 95, column: 4
                            canisterNum_thread_7 = 1;//sysj\controller.sysj line: 96, column: 4
                            S5341=0;
                            if(canisterNum_thread_7 < 5){//sysj\controller.sysj line: 98, column: 10
                              System.out.println("selecting percentage " + recPercentLiq_thread_7.get(canisterNum_thread_7 - 1));//sysj\controller.sysj line: 101, column: 6
                              selectPercentage.setPresent();//sysj\controller.sysj line: 102, column: 6
                              currsigs.addElement(selectPercentage);
                              selectPercentage.setValue(recPercentLiq_thread_7.get(canisterNum_thread_7 - 1));//sysj\controller.sysj line: 102, column: 6
                              S5376=0;
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
                              S5341=1;
                              S5896=0;
                              if(!fillerStatus_o.isPartnerPresent() || fillerStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 126, column: 4
                                fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 126, column: 4
                                S5896=1;
                                active[7]=1;
                                ends[7]=1;
                                break RUN;
                              }
                              else {
                                S5891=0;
                                if(fillerStatus_o.isACK()){//sysj\controller.sysj line: 126, column: 4
                                  fillerStatus_o.setVal("done");//sysj\controller.sysj line: 126, column: 4
                                  S5891=1;
                                  if(!fillerStatus_o.isACK()){//sysj\controller.sysj line: 126, column: 4
                                    fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 126, column: 4
                                    ends[7]=2;
                                    ;//sysj\controller.sysj line: 126, column: 4
                                    S5156=3;
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
                            S5156=3;
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
              switch(S5163){
                case 0 : 
                  if(!fillerStatus_o.isPartnerPresent() || fillerStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 89, column: 4
                    fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 89, column: 4
                    S5163=1;
                    active[7]=1;
                    ends[7]=1;
                    break RUN;
                  }
                  else {
                    switch(S5158){
                      case 0 : 
                        if(fillerStatus_o.isACK()){//sysj\controller.sysj line: 89, column: 4
                          fillerStatus_o.setVal("idle");//sysj\controller.sysj line: 89, column: 4
                          S5158=1;
                          if(!fillerStatus_o.isACK()){//sysj\controller.sysj line: 89, column: 4
                            fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 89, column: 4
                            ends[7]=2;
                            ;//sysj\controller.sysj line: 89, column: 4
                            S5156=2;
                            if(bottleAtPos2.getprestatus()){//sysj\controller.sysj line: 93, column: 11
                              System.out.println("FillerController: - Bottle detected at position 2.");//sysj\controller.sysj line: 94, column: 4
                              recPercentLiq_thread_7 = (ArrayList)(fillerReq_in.getVal() == null ? null : ((ArrayList)fillerReq_in.getVal()));//sysj\controller.sysj line: 95, column: 4
                              canisterNum_thread_7 = 1;//sysj\controller.sysj line: 96, column: 4
                              S5341=0;
                              if(canisterNum_thread_7 < 5){//sysj\controller.sysj line: 98, column: 10
                                System.out.println("selecting percentage " + recPercentLiq_thread_7.get(canisterNum_thread_7 - 1));//sysj\controller.sysj line: 101, column: 6
                                selectPercentage.setPresent();//sysj\controller.sysj line: 102, column: 6
                                currsigs.addElement(selectPercentage);
                                selectPercentage.setValue(recPercentLiq_thread_7.get(canisterNum_thread_7 - 1));//sysj\controller.sysj line: 102, column: 6
                                S5376=0;
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
                                S5341=1;
                                S5896=0;
                                if(!fillerStatus_o.isPartnerPresent() || fillerStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 126, column: 4
                                  fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 126, column: 4
                                  S5896=1;
                                  active[7]=1;
                                  ends[7]=1;
                                  break RUN;
                                }
                                else {
                                  S5891=0;
                                  if(fillerStatus_o.isACK()){//sysj\controller.sysj line: 126, column: 4
                                    fillerStatus_o.setVal("done");//sysj\controller.sysj line: 126, column: 4
                                    S5891=1;
                                    if(!fillerStatus_o.isACK()){//sysj\controller.sysj line: 126, column: 4
                                      fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 126, column: 4
                                      ends[7]=2;
                                      ;//sysj\controller.sysj line: 126, column: 4
                                      S5156=3;
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
                              S5156=3;
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
                          S5156=2;
                          if(bottleAtPos2.getprestatus()){//sysj\controller.sysj line: 93, column: 11
                            System.out.println("FillerController: - Bottle detected at position 2.");//sysj\controller.sysj line: 94, column: 4
                            recPercentLiq_thread_7 = (ArrayList)(fillerReq_in.getVal() == null ? null : ((ArrayList)fillerReq_in.getVal()));//sysj\controller.sysj line: 95, column: 4
                            canisterNum_thread_7 = 1;//sysj\controller.sysj line: 96, column: 4
                            S5341=0;
                            if(canisterNum_thread_7 < 5){//sysj\controller.sysj line: 98, column: 10
                              System.out.println("selecting percentage " + recPercentLiq_thread_7.get(canisterNum_thread_7 - 1));//sysj\controller.sysj line: 101, column: 6
                              selectPercentage.setPresent();//sysj\controller.sysj line: 102, column: 6
                              currsigs.addElement(selectPercentage);
                              selectPercentage.setValue(recPercentLiq_thread_7.get(canisterNum_thread_7 - 1));//sysj\controller.sysj line: 102, column: 6
                              S5376=0;
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
                              S5341=1;
                              S5896=0;
                              if(!fillerStatus_o.isPartnerPresent() || fillerStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 126, column: 4
                                fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 126, column: 4
                                S5896=1;
                                active[7]=1;
                                ends[7]=1;
                                break RUN;
                              }
                              else {
                                S5891=0;
                                if(fillerStatus_o.isACK()){//sysj\controller.sysj line: 126, column: 4
                                  fillerStatus_o.setVal("done");//sysj\controller.sysj line: 126, column: 4
                                  S5891=1;
                                  if(!fillerStatus_o.isACK()){//sysj\controller.sysj line: 126, column: 4
                                    fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 126, column: 4
                                    ends[7]=2;
                                    ;//sysj\controller.sysj line: 126, column: 4
                                    S5156=3;
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
                            S5156=3;
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
                  S5163=1;
                  S5163=0;
                  if(!fillerStatus_o.isPartnerPresent() || fillerStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 89, column: 4
                    fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 89, column: 4
                    S5163=1;
                    active[7]=1;
                    ends[7]=1;
                    break RUN;
                  }
                  else {
                    S5158=0;
                    if(fillerStatus_o.isACK()){//sysj\controller.sysj line: 89, column: 4
                      fillerStatus_o.setVal("idle");//sysj\controller.sysj line: 89, column: 4
                      S5158=1;
                      if(!fillerStatus_o.isACK()){//sysj\controller.sysj line: 89, column: 4
                        fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 89, column: 4
                        ends[7]=2;
                        ;//sysj\controller.sysj line: 89, column: 4
                        S5156=2;
                        if(bottleAtPos2.getprestatus()){//sysj\controller.sysj line: 93, column: 11
                          System.out.println("FillerController: - Bottle detected at position 2.");//sysj\controller.sysj line: 94, column: 4
                          recPercentLiq_thread_7 = (ArrayList)(fillerReq_in.getVal() == null ? null : ((ArrayList)fillerReq_in.getVal()));//sysj\controller.sysj line: 95, column: 4
                          canisterNum_thread_7 = 1;//sysj\controller.sysj line: 96, column: 4
                          S5341=0;
                          if(canisterNum_thread_7 < 5){//sysj\controller.sysj line: 98, column: 10
                            System.out.println("selecting percentage " + recPercentLiq_thread_7.get(canisterNum_thread_7 - 1));//sysj\controller.sysj line: 101, column: 6
                            selectPercentage.setPresent();//sysj\controller.sysj line: 102, column: 6
                            currsigs.addElement(selectPercentage);
                            selectPercentage.setValue(recPercentLiq_thread_7.get(canisterNum_thread_7 - 1));//sysj\controller.sysj line: 102, column: 6
                            S5376=0;
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
                            S5341=1;
                            S5896=0;
                            if(!fillerStatus_o.isPartnerPresent() || fillerStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 126, column: 4
                              fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 126, column: 4
                              S5896=1;
                              active[7]=1;
                              ends[7]=1;
                              break RUN;
                            }
                            else {
                              S5891=0;
                              if(fillerStatus_o.isACK()){//sysj\controller.sysj line: 126, column: 4
                                fillerStatus_o.setVal("done");//sysj\controller.sysj line: 126, column: 4
                                S5891=1;
                                if(!fillerStatus_o.isACK()){//sysj\controller.sysj line: 126, column: 4
                                  fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 126, column: 4
                                  ends[7]=2;
                                  ;//sysj\controller.sysj line: 126, column: 4
                                  S5156=3;
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
                          S5156=3;
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
              switch(S5341){
                case 0 : 
                  switch(S5376){
                    case 0 : 
                      if(selectedCanister.getprestatus()){//sysj\controller.sysj line: 104, column: 11
                        S5376=1;
                        thread40506(tdone,ends);
                        thread40507(tdone,ends);
                        int biggest40508 = 0;
                        if(ends[8]>=biggest40508){
                          biggest40508=ends[8];
                        }
                        if(ends[9]>=biggest40508){
                          biggest40508=ends[9];
                        }
                        if(biggest40508 == 1){
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
                        S5376=2;
                        thread40509(tdone,ends);
                        thread40510(tdone,ends);
                        int biggest40511 = 0;
                        if(ends[10]>=biggest40511){
                          biggest40511=ends[10];
                        }
                        if(ends[11]>=biggest40511){
                          biggest40511=ends[11];
                        }
                        if(biggest40511 == 1){
                          active[7]=1;
                          ends[7]=1;
                          break RUN;
                        }
                      }
                      else {
                        thread40512(tdone,ends);
                        thread40513(tdone,ends);
                        int biggest40514 = 0;
                        if(ends[8]>=biggest40514){
                          biggest40514=ends[8];
                        }
                        if(ends[9]>=biggest40514){
                          biggest40514=ends[9];
                        }
                        if(biggest40514 == 1){
                          active[7]=1;
                          ends[7]=1;
                          break RUN;
                        }
                        //FINXME code
                        if(biggest40514 == 0){
                          S5376=2;
                          thread40515(tdone,ends);
                          thread40516(tdone,ends);
                          int biggest40517 = 0;
                          if(ends[10]>=biggest40517){
                            biggest40517=ends[10];
                          }
                          if(ends[11]>=biggest40517){
                            biggest40517=ends[11];
                          }
                          if(biggest40517 == 1){
                            active[7]=1;
                            ends[7]=1;
                            break RUN;
                          }
                        }
                      }
                    
                    case 2 : 
                      if(dosUnitEvac.getprestatus()){//sysj\controller.sysj line: 119, column: 12
                        canisterNum_thread_7 += 1;//sysj\controller.sysj line: 123, column: 6
                        S5376=3;
                        active[7]=1;
                        ends[7]=1;
                        break RUN;
                      }
                      else {
                        thread40518(tdone,ends);
                        thread40519(tdone,ends);
                        int biggest40520 = 0;
                        if(ends[10]>=biggest40520){
                          biggest40520=ends[10];
                        }
                        if(ends[11]>=biggest40520){
                          biggest40520=ends[11];
                        }
                        if(biggest40520 == 1){
                          active[7]=1;
                          ends[7]=1;
                          break RUN;
                        }
                        //FINXME code
                        if(biggest40520 == 0){
                          canisterNum_thread_7 += 1;//sysj\controller.sysj line: 123, column: 6
                          S5376=3;
                          active[7]=1;
                          ends[7]=1;
                          break RUN;
                        }
                      }
                    
                    case 3 : 
                      S5376=3;
                      if(canisterNum_thread_7 < 5){//sysj\controller.sysj line: 98, column: 10
                        System.out.println("selecting percentage " + recPercentLiq_thread_7.get(canisterNum_thread_7 - 1));//sysj\controller.sysj line: 101, column: 6
                        selectPercentage.setPresent();//sysj\controller.sysj line: 102, column: 6
                        currsigs.addElement(selectPercentage);
                        selectPercentage.setValue(recPercentLiq_thread_7.get(canisterNum_thread_7 - 1));//sysj\controller.sysj line: 102, column: 6
                        S5376=0;
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
                        S5341=1;
                        S5896=0;
                        if(!fillerStatus_o.isPartnerPresent() || fillerStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 126, column: 4
                          fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 126, column: 4
                          S5896=1;
                          active[7]=1;
                          ends[7]=1;
                          break RUN;
                        }
                        else {
                          S5891=0;
                          if(fillerStatus_o.isACK()){//sysj\controller.sysj line: 126, column: 4
                            fillerStatus_o.setVal("done");//sysj\controller.sysj line: 126, column: 4
                            S5891=1;
                            if(!fillerStatus_o.isACK()){//sysj\controller.sysj line: 126, column: 4
                              fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 126, column: 4
                              ends[7]=2;
                              ;//sysj\controller.sysj line: 126, column: 4
                              S5156=3;
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
                  switch(S5896){
                    case 0 : 
                      if(!fillerStatus_o.isPartnerPresent() || fillerStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 126, column: 4
                        fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 126, column: 4
                        S5896=1;
                        active[7]=1;
                        ends[7]=1;
                        break RUN;
                      }
                      else {
                        switch(S5891){
                          case 0 : 
                            if(fillerStatus_o.isACK()){//sysj\controller.sysj line: 126, column: 4
                              fillerStatus_o.setVal("done");//sysj\controller.sysj line: 126, column: 4
                              S5891=1;
                              if(!fillerStatus_o.isACK()){//sysj\controller.sysj line: 126, column: 4
                                fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 126, column: 4
                                ends[7]=2;
                                ;//sysj\controller.sysj line: 126, column: 4
                                S5156=3;
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
                              S5156=3;
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
                      S5896=1;
                      S5896=0;
                      if(!fillerStatus_o.isPartnerPresent() || fillerStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 126, column: 4
                        fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 126, column: 4
                        S5896=1;
                        active[7]=1;
                        ends[7]=1;
                        break RUN;
                      }
                      else {
                        S5891=0;
                        if(fillerStatus_o.isACK()){//sysj\controller.sysj line: 126, column: 4
                          fillerStatus_o.setVal("done");//sysj\controller.sysj line: 126, column: 4
                          S5891=1;
                          if(!fillerStatus_o.isACK()){//sysj\controller.sysj line: 126, column: 4
                            fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 126, column: 4
                            ends[7]=2;
                            ;//sysj\controller.sysj line: 126, column: 4
                            S5156=3;
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
              S5156=3;
              S5156=0;
              S5140=0;
              if(!fillerReq_in.isPartnerPresent() || fillerReq_in.isPartnerPreempted()){//sysj\controller.sysj line: 83, column: 3
                fillerReq_in.setACK(false);//sysj\controller.sysj line: 83, column: 3
                S5140=1;
                active[7]=1;
                ends[7]=1;
                break RUN;
              }
              else {
                S5135=0;
                if(!fillerReq_in.isREQ()){//sysj\controller.sysj line: 83, column: 3
                  fillerReq_in.setACK(true);//sysj\controller.sysj line: 83, column: 3
                  S5135=1;
                  if(fillerReq_in.isREQ()){//sysj\controller.sysj line: 83, column: 3
                    fillerReq_in.setACK(false);//sysj\controller.sysj line: 83, column: 3
                    ends[7]=2;
                    ;//sysj\controller.sysj line: 83, column: 3
                    System.out.println("FillerController: - Received request");//sysj\controller.sysj line: 86, column: 3
                    S5156=1;
                    if(!bottleAtPos2.getprestatus()){//sysj\controller.sysj line: 87, column: 11
                      System.out.println("FillerController: - Idle (no bottle at pos 2).");//sysj\controller.sysj line: 88, column: 4
                      S5163=0;
                      if(!fillerStatus_o.isPartnerPresent() || fillerStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 89, column: 4
                        fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 89, column: 4
                        S5163=1;
                        active[7]=1;
                        ends[7]=1;
                        break RUN;
                      }
                      else {
                        S5158=0;
                        if(fillerStatus_o.isACK()){//sysj\controller.sysj line: 89, column: 4
                          fillerStatus_o.setVal("idle");//sysj\controller.sysj line: 89, column: 4
                          S5158=1;
                          if(!fillerStatus_o.isACK()){//sysj\controller.sysj line: 89, column: 4
                            fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 89, column: 4
                            ends[7]=2;
                            ;//sysj\controller.sysj line: 89, column: 4
                            S5156=2;
                            if(bottleAtPos2.getprestatus()){//sysj\controller.sysj line: 93, column: 11
                              System.out.println("FillerController: - Bottle detected at position 2.");//sysj\controller.sysj line: 94, column: 4
                              recPercentLiq_thread_7 = (ArrayList)(fillerReq_in.getVal() == null ? null : ((ArrayList)fillerReq_in.getVal()));//sysj\controller.sysj line: 95, column: 4
                              canisterNum_thread_7 = 1;//sysj\controller.sysj line: 96, column: 4
                              S5341=0;
                              if(canisterNum_thread_7 < 5){//sysj\controller.sysj line: 98, column: 10
                                System.out.println("selecting percentage " + recPercentLiq_thread_7.get(canisterNum_thread_7 - 1));//sysj\controller.sysj line: 101, column: 6
                                selectPercentage.setPresent();//sysj\controller.sysj line: 102, column: 6
                                currsigs.addElement(selectPercentage);
                                selectPercentage.setValue(recPercentLiq_thread_7.get(canisterNum_thread_7 - 1));//sysj\controller.sysj line: 102, column: 6
                                S5376=0;
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
                                S5341=1;
                                S5896=0;
                                if(!fillerStatus_o.isPartnerPresent() || fillerStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 126, column: 4
                                  fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 126, column: 4
                                  S5896=1;
                                  active[7]=1;
                                  ends[7]=1;
                                  break RUN;
                                }
                                else {
                                  S5891=0;
                                  if(fillerStatus_o.isACK()){//sysj\controller.sysj line: 126, column: 4
                                    fillerStatus_o.setVal("done");//sysj\controller.sysj line: 126, column: 4
                                    S5891=1;
                                    if(!fillerStatus_o.isACK()){//sysj\controller.sysj line: 126, column: 4
                                      fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 126, column: 4
                                      ends[7]=2;
                                      ;//sysj\controller.sysj line: 126, column: 4
                                      S5156=3;
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
                              S5156=3;
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
                      S5156=2;
                      if(bottleAtPos2.getprestatus()){//sysj\controller.sysj line: 93, column: 11
                        System.out.println("FillerController: - Bottle detected at position 2.");//sysj\controller.sysj line: 94, column: 4
                        recPercentLiq_thread_7 = (ArrayList)(fillerReq_in.getVal() == null ? null : ((ArrayList)fillerReq_in.getVal()));//sysj\controller.sysj line: 95, column: 4
                        canisterNum_thread_7 = 1;//sysj\controller.sysj line: 96, column: 4
                        S5341=0;
                        if(canisterNum_thread_7 < 5){//sysj\controller.sysj line: 98, column: 10
                          System.out.println("selecting percentage " + recPercentLiq_thread_7.get(canisterNum_thread_7 - 1));//sysj\controller.sysj line: 101, column: 6
                          selectPercentage.setPresent();//sysj\controller.sysj line: 102, column: 6
                          currsigs.addElement(selectPercentage);
                          selectPercentage.setValue(recPercentLiq_thread_7.get(canisterNum_thread_7 - 1));//sysj\controller.sysj line: 102, column: 6
                          S5376=0;
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
                          S5341=1;
                          S5896=0;
                          if(!fillerStatus_o.isPartnerPresent() || fillerStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 126, column: 4
                            fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 126, column: 4
                            S5896=1;
                            active[7]=1;
                            ends[7]=1;
                            break RUN;
                          }
                          else {
                            S5891=0;
                            if(fillerStatus_o.isACK()){//sysj\controller.sysj line: 126, column: 4
                              fillerStatus_o.setVal("done");//sysj\controller.sysj line: 126, column: 4
                              S5891=1;
                              if(!fillerStatus_o.isACK()){//sysj\controller.sysj line: 126, column: 4
                                fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 126, column: 4
                                ends[7]=2;
                                ;//sysj\controller.sysj line: 126, column: 4
                                S5156=3;
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
                        S5156=3;
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
