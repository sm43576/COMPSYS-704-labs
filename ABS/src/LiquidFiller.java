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
  public output_Channel fillerStatus_o = new output_Channel();
  private ArrayList recPercentLiq_thread_7;//sysj\controller.sysj line: 95, column: 4
  private int canisterNum_thread_7;//sysj\controller.sysj line: 96, column: 4
  private int S18398 = 1;
  private int S5216 = 1;
  private int S5200 = 1;
  private int S5195 = 1;
  private int S5223 = 1;
  private int S5218 = 1;
  private int S5401 = 1;
  private int S5432 = 1;
  private int S5414 = 1;
  private int S5419 = 1;
  private int S5449 = 1;
  private int S5454 = 1;
  private int S5806 = 1;
  private int S5801 = 1;
  
  private int[] ends = new int[22];
  private int[] tdone = new int[22];
  
  public void thread32794(int [] tdone, int [] ends){
        switch(S5454){
      case 0 : 
        active[11]=0;
        ends[11]=0;
        tdone[11]=1;
        break;
      
      case 1 : 
        valveInjectorOnOff.setPresent();//sysj\controller.sysj line: 123, column: 41
        currsigs.addElement(valveInjectorOnOff);
        active[11]=1;
        ends[11]=1;
        tdone[11]=1;
        break;
      
    }
  }

  public void thread32793(int [] tdone, int [] ends){
        switch(S5449){
      case 0 : 
        active[10]=0;
        ends[10]=0;
        tdone[10]=1;
        break;
      
      case 1 : 
        dosUnitValveExtend.setPresent();//sysj\controller.sysj line: 123, column: 8
        currsigs.addElement(dosUnitValveExtend);
        active[10]=1;
        ends[10]=1;
        tdone[10]=1;
        break;
      
    }
  }

  public void thread32791(int [] tdone, int [] ends){
        S5454=1;
    valveInjectorOnOff.setPresent();//sysj\controller.sysj line: 123, column: 41
    currsigs.addElement(valveInjectorOnOff);
    active[11]=1;
    ends[11]=1;
    tdone[11]=1;
  }

  public void thread32790(int [] tdone, int [] ends){
        S5449=1;
    dosUnitValveExtend.setPresent();//sysj\controller.sysj line: 123, column: 8
    currsigs.addElement(dosUnitValveExtend);
    active[10]=1;
    ends[10]=1;
    tdone[10]=1;
  }

  public void thread32788(int [] tdone, int [] ends){
        switch(S5419){
      case 0 : 
        active[9]=0;
        ends[9]=0;
        tdone[9]=1;
        break;
      
      case 1 : 
        valveInjectorOnOff.setPresent();//sysj\controller.sysj line: 107, column: 42
        currsigs.addElement(valveInjectorOnOff);
        active[9]=1;
        ends[9]=1;
        tdone[9]=1;
        break;
      
    }
  }

  public void thread32787(int [] tdone, int [] ends){
        switch(S5414){
      case 0 : 
        active[8]=0;
        ends[8]=0;
        tdone[8]=1;
        break;
      
      case 1 : 
        dosUnitValveRetract.setPresent();//sysj\controller.sysj line: 107, column: 8
        currsigs.addElement(dosUnitValveRetract);
        active[8]=1;
        ends[8]=1;
        tdone[8]=1;
        break;
      
    }
  }

  public void thread32785(int [] tdone, int [] ends){
        S5419=1;
    valveInjectorOnOff.setPresent();//sysj\controller.sysj line: 107, column: 42
    currsigs.addElement(valveInjectorOnOff);
    active[9]=1;
    ends[9]=1;
    tdone[9]=1;
  }

  public void thread32784(int [] tdone, int [] ends){
        S5414=1;
    dosUnitValveRetract.setPresent();//sysj\controller.sysj line: 107, column: 8
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
      switch(S18398){
        case 0 : 
          S18398=0;
          break RUN;
        
        case 1 : 
          S18398=2;
          S18398=2;
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
                            S5432=0;
                            System.out.println("selecting canister " + canisterNum_thread_7);//sysj\controller.sysj line: 101, column: 6
                            selectCanister.setPresent();//sysj\controller.sysj line: 102, column: 7
                            currsigs.addElement(selectCanister);
                            selectCanister.setValue(canisterNum_thread_7);//sysj\controller.sysj line: 102, column: 7
                            active[7]=1;
                            ends[7]=1;
                            break RUN;
                          }
                          else {
                            ends[7]=2;
                            ;//sysj\controller.sysj line: 98, column: 4
                            S5401=1;
                            S5806=0;
                            if(!fillerStatus_o.isPartnerPresent() || fillerStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 130, column: 4
                              fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 130, column: 4
                              S5806=1;
                              active[7]=1;
                              ends[7]=1;
                              break RUN;
                            }
                            else {
                              S5801=0;
                              if(fillerStatus_o.isACK()){//sysj\controller.sysj line: 130, column: 4
                                fillerStatus_o.setVal("done");//sysj\controller.sysj line: 130, column: 4
                                S5801=1;
                                if(!fillerStatus_o.isACK()){//sysj\controller.sysj line: 130, column: 4
                                  fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 130, column: 4
                                  ends[7]=2;
                                  ;//sysj\controller.sysj line: 130, column: 4
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
                      S5432=0;
                      System.out.println("selecting canister " + canisterNum_thread_7);//sysj\controller.sysj line: 101, column: 6
                      selectCanister.setPresent();//sysj\controller.sysj line: 102, column: 7
                      currsigs.addElement(selectCanister);
                      selectCanister.setValue(canisterNum_thread_7);//sysj\controller.sysj line: 102, column: 7
                      active[7]=1;
                      ends[7]=1;
                      break RUN;
                    }
                    else {
                      ends[7]=2;
                      ;//sysj\controller.sysj line: 98, column: 4
                      S5401=1;
                      S5806=0;
                      if(!fillerStatus_o.isPartnerPresent() || fillerStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 130, column: 4
                        fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 130, column: 4
                        S5806=1;
                        active[7]=1;
                        ends[7]=1;
                        break RUN;
                      }
                      else {
                        S5801=0;
                        if(fillerStatus_o.isACK()){//sysj\controller.sysj line: 130, column: 4
                          fillerStatus_o.setVal("done");//sysj\controller.sysj line: 130, column: 4
                          S5801=1;
                          if(!fillerStatus_o.isACK()){//sysj\controller.sysj line: 130, column: 4
                            fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 130, column: 4
                            ends[7]=2;
                            ;//sysj\controller.sysj line: 130, column: 4
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
                                        S5432=0;
                                        System.out.println("selecting canister " + canisterNum_thread_7);//sysj\controller.sysj line: 101, column: 6
                                        selectCanister.setPresent();//sysj\controller.sysj line: 102, column: 7
                                        currsigs.addElement(selectCanister);
                                        selectCanister.setValue(canisterNum_thread_7);//sysj\controller.sysj line: 102, column: 7
                                        active[7]=1;
                                        ends[7]=1;
                                        break RUN;
                                      }
                                      else {
                                        ends[7]=2;
                                        ;//sysj\controller.sysj line: 98, column: 4
                                        S5401=1;
                                        S5806=0;
                                        if(!fillerStatus_o.isPartnerPresent() || fillerStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 130, column: 4
                                          fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 130, column: 4
                                          S5806=1;
                                          active[7]=1;
                                          ends[7]=1;
                                          break RUN;
                                        }
                                        else {
                                          S5801=0;
                                          if(fillerStatus_o.isACK()){//sysj\controller.sysj line: 130, column: 4
                                            fillerStatus_o.setVal("done");//sysj\controller.sysj line: 130, column: 4
                                            S5801=1;
                                            if(!fillerStatus_o.isACK()){//sysj\controller.sysj line: 130, column: 4
                                              fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 130, column: 4
                                              ends[7]=2;
                                              ;//sysj\controller.sysj line: 130, column: 4
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
                                  S5432=0;
                                  System.out.println("selecting canister " + canisterNum_thread_7);//sysj\controller.sysj line: 101, column: 6
                                  selectCanister.setPresent();//sysj\controller.sysj line: 102, column: 7
                                  currsigs.addElement(selectCanister);
                                  selectCanister.setValue(canisterNum_thread_7);//sysj\controller.sysj line: 102, column: 7
                                  active[7]=1;
                                  ends[7]=1;
                                  break RUN;
                                }
                                else {
                                  ends[7]=2;
                                  ;//sysj\controller.sysj line: 98, column: 4
                                  S5401=1;
                                  S5806=0;
                                  if(!fillerStatus_o.isPartnerPresent() || fillerStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 130, column: 4
                                    fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 130, column: 4
                                    S5806=1;
                                    active[7]=1;
                                    ends[7]=1;
                                    break RUN;
                                  }
                                  else {
                                    S5801=0;
                                    if(fillerStatus_o.isACK()){//sysj\controller.sysj line: 130, column: 4
                                      fillerStatus_o.setVal("done");//sysj\controller.sysj line: 130, column: 4
                                      S5801=1;
                                      if(!fillerStatus_o.isACK()){//sysj\controller.sysj line: 130, column: 4
                                        fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 130, column: 4
                                        ends[7]=2;
                                        ;//sysj\controller.sysj line: 130, column: 4
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
                                      S5432=0;
                                      System.out.println("selecting canister " + canisterNum_thread_7);//sysj\controller.sysj line: 101, column: 6
                                      selectCanister.setPresent();//sysj\controller.sysj line: 102, column: 7
                                      currsigs.addElement(selectCanister);
                                      selectCanister.setValue(canisterNum_thread_7);//sysj\controller.sysj line: 102, column: 7
                                      active[7]=1;
                                      ends[7]=1;
                                      break RUN;
                                    }
                                    else {
                                      ends[7]=2;
                                      ;//sysj\controller.sysj line: 98, column: 4
                                      S5401=1;
                                      S5806=0;
                                      if(!fillerStatus_o.isPartnerPresent() || fillerStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 130, column: 4
                                        fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 130, column: 4
                                        S5806=1;
                                        active[7]=1;
                                        ends[7]=1;
                                        break RUN;
                                      }
                                      else {
                                        S5801=0;
                                        if(fillerStatus_o.isACK()){//sysj\controller.sysj line: 130, column: 4
                                          fillerStatus_o.setVal("done");//sysj\controller.sysj line: 130, column: 4
                                          S5801=1;
                                          if(!fillerStatus_o.isACK()){//sysj\controller.sysj line: 130, column: 4
                                            fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 130, column: 4
                                            ends[7]=2;
                                            ;//sysj\controller.sysj line: 130, column: 4
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
                                S5432=0;
                                System.out.println("selecting canister " + canisterNum_thread_7);//sysj\controller.sysj line: 101, column: 6
                                selectCanister.setPresent();//sysj\controller.sysj line: 102, column: 7
                                currsigs.addElement(selectCanister);
                                selectCanister.setValue(canisterNum_thread_7);//sysj\controller.sysj line: 102, column: 7
                                active[7]=1;
                                ends[7]=1;
                                break RUN;
                              }
                              else {
                                ends[7]=2;
                                ;//sysj\controller.sysj line: 98, column: 4
                                S5401=1;
                                S5806=0;
                                if(!fillerStatus_o.isPartnerPresent() || fillerStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 130, column: 4
                                  fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 130, column: 4
                                  S5806=1;
                                  active[7]=1;
                                  ends[7]=1;
                                  break RUN;
                                }
                                else {
                                  S5801=0;
                                  if(fillerStatus_o.isACK()){//sysj\controller.sysj line: 130, column: 4
                                    fillerStatus_o.setVal("done");//sysj\controller.sysj line: 130, column: 4
                                    S5801=1;
                                    if(!fillerStatus_o.isACK()){//sysj\controller.sysj line: 130, column: 4
                                      fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 130, column: 4
                                      ends[7]=2;
                                      ;//sysj\controller.sysj line: 130, column: 4
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
                                    S5432=0;
                                    System.out.println("selecting canister " + canisterNum_thread_7);//sysj\controller.sysj line: 101, column: 6
                                    selectCanister.setPresent();//sysj\controller.sysj line: 102, column: 7
                                    currsigs.addElement(selectCanister);
                                    selectCanister.setValue(canisterNum_thread_7);//sysj\controller.sysj line: 102, column: 7
                                    active[7]=1;
                                    ends[7]=1;
                                    break RUN;
                                  }
                                  else {
                                    ends[7]=2;
                                    ;//sysj\controller.sysj line: 98, column: 4
                                    S5401=1;
                                    S5806=0;
                                    if(!fillerStatus_o.isPartnerPresent() || fillerStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 130, column: 4
                                      fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 130, column: 4
                                      S5806=1;
                                      active[7]=1;
                                      ends[7]=1;
                                      break RUN;
                                    }
                                    else {
                                      S5801=0;
                                      if(fillerStatus_o.isACK()){//sysj\controller.sysj line: 130, column: 4
                                        fillerStatus_o.setVal("done");//sysj\controller.sysj line: 130, column: 4
                                        S5801=1;
                                        if(!fillerStatus_o.isACK()){//sysj\controller.sysj line: 130, column: 4
                                          fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 130, column: 4
                                          ends[7]=2;
                                          ;//sysj\controller.sysj line: 130, column: 4
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
                              S5432=0;
                              System.out.println("selecting canister " + canisterNum_thread_7);//sysj\controller.sysj line: 101, column: 6
                              selectCanister.setPresent();//sysj\controller.sysj line: 102, column: 7
                              currsigs.addElement(selectCanister);
                              selectCanister.setValue(canisterNum_thread_7);//sysj\controller.sysj line: 102, column: 7
                              active[7]=1;
                              ends[7]=1;
                              break RUN;
                            }
                            else {
                              ends[7]=2;
                              ;//sysj\controller.sysj line: 98, column: 4
                              S5401=1;
                              S5806=0;
                              if(!fillerStatus_o.isPartnerPresent() || fillerStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 130, column: 4
                                fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 130, column: 4
                                S5806=1;
                                active[7]=1;
                                ends[7]=1;
                                break RUN;
                              }
                              else {
                                S5801=0;
                                if(fillerStatus_o.isACK()){//sysj\controller.sysj line: 130, column: 4
                                  fillerStatus_o.setVal("done");//sysj\controller.sysj line: 130, column: 4
                                  S5801=1;
                                  if(!fillerStatus_o.isACK()){//sysj\controller.sysj line: 130, column: 4
                                    fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 130, column: 4
                                    ends[7]=2;
                                    ;//sysj\controller.sysj line: 130, column: 4
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
                                S5432=0;
                                System.out.println("selecting canister " + canisterNum_thread_7);//sysj\controller.sysj line: 101, column: 6
                                selectCanister.setPresent();//sysj\controller.sysj line: 102, column: 7
                                currsigs.addElement(selectCanister);
                                selectCanister.setValue(canisterNum_thread_7);//sysj\controller.sysj line: 102, column: 7
                                active[7]=1;
                                ends[7]=1;
                                break RUN;
                              }
                              else {
                                ends[7]=2;
                                ;//sysj\controller.sysj line: 98, column: 4
                                S5401=1;
                                S5806=0;
                                if(!fillerStatus_o.isPartnerPresent() || fillerStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 130, column: 4
                                  fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 130, column: 4
                                  S5806=1;
                                  active[7]=1;
                                  ends[7]=1;
                                  break RUN;
                                }
                                else {
                                  S5801=0;
                                  if(fillerStatus_o.isACK()){//sysj\controller.sysj line: 130, column: 4
                                    fillerStatus_o.setVal("done");//sysj\controller.sysj line: 130, column: 4
                                    S5801=1;
                                    if(!fillerStatus_o.isACK()){//sysj\controller.sysj line: 130, column: 4
                                      fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 130, column: 4
                                      ends[7]=2;
                                      ;//sysj\controller.sysj line: 130, column: 4
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
                              S5432=0;
                              System.out.println("selecting canister " + canisterNum_thread_7);//sysj\controller.sysj line: 101, column: 6
                              selectCanister.setPresent();//sysj\controller.sysj line: 102, column: 7
                              currsigs.addElement(selectCanister);
                              selectCanister.setValue(canisterNum_thread_7);//sysj\controller.sysj line: 102, column: 7
                              active[7]=1;
                              ends[7]=1;
                              break RUN;
                            }
                            else {
                              ends[7]=2;
                              ;//sysj\controller.sysj line: 98, column: 4
                              S5401=1;
                              S5806=0;
                              if(!fillerStatus_o.isPartnerPresent() || fillerStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 130, column: 4
                                fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 130, column: 4
                                S5806=1;
                                active[7]=1;
                                ends[7]=1;
                                break RUN;
                              }
                              else {
                                S5801=0;
                                if(fillerStatus_o.isACK()){//sysj\controller.sysj line: 130, column: 4
                                  fillerStatus_o.setVal("done");//sysj\controller.sysj line: 130, column: 4
                                  S5801=1;
                                  if(!fillerStatus_o.isACK()){//sysj\controller.sysj line: 130, column: 4
                                    fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 130, column: 4
                                    ends[7]=2;
                                    ;//sysj\controller.sysj line: 130, column: 4
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
                            S5432=0;
                            System.out.println("selecting canister " + canisterNum_thread_7);//sysj\controller.sysj line: 101, column: 6
                            selectCanister.setPresent();//sysj\controller.sysj line: 102, column: 7
                            currsigs.addElement(selectCanister);
                            selectCanister.setValue(canisterNum_thread_7);//sysj\controller.sysj line: 102, column: 7
                            active[7]=1;
                            ends[7]=1;
                            break RUN;
                          }
                          else {
                            ends[7]=2;
                            ;//sysj\controller.sysj line: 98, column: 4
                            S5401=1;
                            S5806=0;
                            if(!fillerStatus_o.isPartnerPresent() || fillerStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 130, column: 4
                              fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 130, column: 4
                              S5806=1;
                              active[7]=1;
                              ends[7]=1;
                              break RUN;
                            }
                            else {
                              S5801=0;
                              if(fillerStatus_o.isACK()){//sysj\controller.sysj line: 130, column: 4
                                fillerStatus_o.setVal("done");//sysj\controller.sysj line: 130, column: 4
                                S5801=1;
                                if(!fillerStatus_o.isACK()){//sysj\controller.sysj line: 130, column: 4
                                  fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 130, column: 4
                                  ends[7]=2;
                                  ;//sysj\controller.sysj line: 130, column: 4
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
                  switch(S5432){
                    case 0 : 
                      if(selectedCanister.getprestatus()){//sysj\controller.sysj line: 100, column: 11
                        S5432=1;
                        thread32784(tdone,ends);
                        thread32785(tdone,ends);
                        int biggest32786 = 0;
                        if(ends[8]>=biggest32786){
                          biggest32786=ends[8];
                        }
                        if(ends[9]>=biggest32786){
                          biggest32786=ends[9];
                        }
                        if(biggest32786 == 1){
                          active[7]=1;
                          ends[7]=1;
                          break RUN;
                        }
                      }
                      else {
                        selectCanister.setPresent();//sysj\controller.sysj line: 102, column: 7
                        currsigs.addElement(selectCanister);
                        selectCanister.setValue(canisterNum_thread_7);//sysj\controller.sysj line: 102, column: 7
                        active[7]=1;
                        ends[7]=1;
                        break RUN;
                      }
                    
                    case 1 : 
                      if(!dosUnitEvac.getprestatus()){//sysj\controller.sysj line: 106, column: 12
                        System.out.println("Canister above bottle");//sysj\controller.sysj line: 109, column: 6
                        receivedPercentage.setPresent();//sysj\controller.sysj line: 113, column: 6
                        currsigs.addElement(receivedPercentage);
                        receivedPercentage.setValue(recPercentLiq_thread_7.get(canisterNum_thread_7 - 1));//sysj\controller.sysj line: 113, column: 6
                        S5432=2;
                        valveInletOnOff.setPresent();//sysj\controller.sysj line: 117, column: 7
                        currsigs.addElement(valveInletOnOff);
                        active[7]=1;
                        ends[7]=1;
                        break RUN;
                      }
                      else {
                        thread32787(tdone,ends);
                        thread32788(tdone,ends);
                        int biggest32789 = 0;
                        if(ends[8]>=biggest32789){
                          biggest32789=ends[8];
                        }
                        if(ends[9]>=biggest32789){
                          biggest32789=ends[9];
                        }
                        if(biggest32789 == 1){
                          active[7]=1;
                          ends[7]=1;
                          break RUN;
                        }
                        //FINXME code
                        if(biggest32789 == 0){
                          System.out.println("Canister above bottle");//sysj\controller.sysj line: 109, column: 6
                          receivedPercentage.setPresent();//sysj\controller.sysj line: 113, column: 6
                          currsigs.addElement(receivedPercentage);
                          receivedPercentage.setValue(recPercentLiq_thread_7.get(canisterNum_thread_7 - 1));//sysj\controller.sysj line: 113, column: 6
                          S5432=2;
                          valveInletOnOff.setPresent();//sysj\controller.sysj line: 117, column: 7
                          currsigs.addElement(valveInletOnOff);
                          active[7]=1;
                          ends[7]=1;
                          break RUN;
                        }
                      }
                    
                    case 2 : 
                      if(dosUnitFilled.getprestatus()){//sysj\controller.sysj line: 116, column: 12
                        System.out.println("Bottle controller filled");//sysj\controller.sysj line: 120, column: 6
                        S5432=3;
                        thread32790(tdone,ends);
                        thread32791(tdone,ends);
                        int biggest32792 = 0;
                        if(ends[10]>=biggest32792){
                          biggest32792=ends[10];
                        }
                        if(ends[11]>=biggest32792){
                          biggest32792=ends[11];
                        }
                        if(biggest32792 == 1){
                          active[7]=1;
                          ends[7]=1;
                          break RUN;
                        }
                      }
                      else {
                        valveInletOnOff.setPresent();//sysj\controller.sysj line: 117, column: 7
                        currsigs.addElement(valveInletOnOff);
                        active[7]=1;
                        ends[7]=1;
                        break RUN;
                      }
                    
                    case 3 : 
                      if(dosUnitEvac.getprestatus()){//sysj\controller.sysj line: 122, column: 12
                        System.out.println("Canister returned");//sysj\controller.sysj line: 125, column: 6
                        canisterNum_thread_7 += 1;//sysj\controller.sysj line: 127, column: 6
                        S5432=4;
                        active[7]=1;
                        ends[7]=1;
                        break RUN;
                      }
                      else {
                        thread32793(tdone,ends);
                        thread32794(tdone,ends);
                        int biggest32795 = 0;
                        if(ends[10]>=biggest32795){
                          biggest32795=ends[10];
                        }
                        if(ends[11]>=biggest32795){
                          biggest32795=ends[11];
                        }
                        if(biggest32795 == 1){
                          active[7]=1;
                          ends[7]=1;
                          break RUN;
                        }
                        //FINXME code
                        if(biggest32795 == 0){
                          System.out.println("Canister returned");//sysj\controller.sysj line: 125, column: 6
                          canisterNum_thread_7 += 1;//sysj\controller.sysj line: 127, column: 6
                          S5432=4;
                          active[7]=1;
                          ends[7]=1;
                          break RUN;
                        }
                      }
                    
                    case 4 : 
                      S5432=4;
                      if(canisterNum_thread_7 < 5){//sysj\controller.sysj line: 98, column: 10
                        S5432=0;
                        System.out.println("selecting canister " + canisterNum_thread_7);//sysj\controller.sysj line: 101, column: 6
                        selectCanister.setPresent();//sysj\controller.sysj line: 102, column: 7
                        currsigs.addElement(selectCanister);
                        selectCanister.setValue(canisterNum_thread_7);//sysj\controller.sysj line: 102, column: 7
                        active[7]=1;
                        ends[7]=1;
                        break RUN;
                      }
                      else {
                        ends[7]=2;
                        ;//sysj\controller.sysj line: 98, column: 4
                        S5401=1;
                        S5806=0;
                        if(!fillerStatus_o.isPartnerPresent() || fillerStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 130, column: 4
                          fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 130, column: 4
                          S5806=1;
                          active[7]=1;
                          ends[7]=1;
                          break RUN;
                        }
                        else {
                          S5801=0;
                          if(fillerStatus_o.isACK()){//sysj\controller.sysj line: 130, column: 4
                            fillerStatus_o.setVal("done");//sysj\controller.sysj line: 130, column: 4
                            S5801=1;
                            if(!fillerStatus_o.isACK()){//sysj\controller.sysj line: 130, column: 4
                              fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 130, column: 4
                              ends[7]=2;
                              ;//sysj\controller.sysj line: 130, column: 4
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
                  switch(S5806){
                    case 0 : 
                      if(!fillerStatus_o.isPartnerPresent() || fillerStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 130, column: 4
                        fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 130, column: 4
                        S5806=1;
                        active[7]=1;
                        ends[7]=1;
                        break RUN;
                      }
                      else {
                        switch(S5801){
                          case 0 : 
                            if(fillerStatus_o.isACK()){//sysj\controller.sysj line: 130, column: 4
                              fillerStatus_o.setVal("done");//sysj\controller.sysj line: 130, column: 4
                              S5801=1;
                              if(!fillerStatus_o.isACK()){//sysj\controller.sysj line: 130, column: 4
                                fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 130, column: 4
                                ends[7]=2;
                                ;//sysj\controller.sysj line: 130, column: 4
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
                            if(!fillerStatus_o.isACK()){//sysj\controller.sysj line: 130, column: 4
                              fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 130, column: 4
                              ends[7]=2;
                              ;//sysj\controller.sysj line: 130, column: 4
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
                      S5806=1;
                      S5806=0;
                      if(!fillerStatus_o.isPartnerPresent() || fillerStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 130, column: 4
                        fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 130, column: 4
                        S5806=1;
                        active[7]=1;
                        ends[7]=1;
                        break RUN;
                      }
                      else {
                        S5801=0;
                        if(fillerStatus_o.isACK()){//sysj\controller.sysj line: 130, column: 4
                          fillerStatus_o.setVal("done");//sysj\controller.sysj line: 130, column: 4
                          S5801=1;
                          if(!fillerStatus_o.isACK()){//sysj\controller.sysj line: 130, column: 4
                            fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 130, column: 4
                            ends[7]=2;
                            ;//sysj\controller.sysj line: 130, column: 4
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
                                S5432=0;
                                System.out.println("selecting canister " + canisterNum_thread_7);//sysj\controller.sysj line: 101, column: 6
                                selectCanister.setPresent();//sysj\controller.sysj line: 102, column: 7
                                currsigs.addElement(selectCanister);
                                selectCanister.setValue(canisterNum_thread_7);//sysj\controller.sysj line: 102, column: 7
                                active[7]=1;
                                ends[7]=1;
                                break RUN;
                              }
                              else {
                                ends[7]=2;
                                ;//sysj\controller.sysj line: 98, column: 4
                                S5401=1;
                                S5806=0;
                                if(!fillerStatus_o.isPartnerPresent() || fillerStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 130, column: 4
                                  fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 130, column: 4
                                  S5806=1;
                                  active[7]=1;
                                  ends[7]=1;
                                  break RUN;
                                }
                                else {
                                  S5801=0;
                                  if(fillerStatus_o.isACK()){//sysj\controller.sysj line: 130, column: 4
                                    fillerStatus_o.setVal("done");//sysj\controller.sysj line: 130, column: 4
                                    S5801=1;
                                    if(!fillerStatus_o.isACK()){//sysj\controller.sysj line: 130, column: 4
                                      fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 130, column: 4
                                      ends[7]=2;
                                      ;//sysj\controller.sysj line: 130, column: 4
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
                          S5432=0;
                          System.out.println("selecting canister " + canisterNum_thread_7);//sysj\controller.sysj line: 101, column: 6
                          selectCanister.setPresent();//sysj\controller.sysj line: 102, column: 7
                          currsigs.addElement(selectCanister);
                          selectCanister.setValue(canisterNum_thread_7);//sysj\controller.sysj line: 102, column: 7
                          active[7]=1;
                          ends[7]=1;
                          break RUN;
                        }
                        else {
                          ends[7]=2;
                          ;//sysj\controller.sysj line: 98, column: 4
                          S5401=1;
                          S5806=0;
                          if(!fillerStatus_o.isPartnerPresent() || fillerStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 130, column: 4
                            fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 130, column: 4
                            S5806=1;
                            active[7]=1;
                            ends[7]=1;
                            break RUN;
                          }
                          else {
                            S5801=0;
                            if(fillerStatus_o.isACK()){//sysj\controller.sysj line: 130, column: 4
                              fillerStatus_o.setVal("done");//sysj\controller.sysj line: 130, column: 4
                              S5801=1;
                              if(!fillerStatus_o.isACK()){//sysj\controller.sysj line: 130, column: 4
                                fillerStatus_o.setREQ(false);//sysj\controller.sysj line: 130, column: 4
                                ends[7]=2;
                                ;//sysj\controller.sysj line: 130, column: 4
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
      fillerStatus_o.sethook();
      if(paused[7]!=0 || suspended[7]!=0 || active[7]!=1);
      else{
        fillerReq_in.gethook();
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
