import java.util.*;
import com.systemj.ClockDomain;
import com.systemj.Signal;
import com.systemj.input_Channel;
import com.systemj.output_Channel;
import java.util.ArrayList;//sysj\orchestrator.sysj line: 1, column: 1

public class Orchestrator extends ClockDomain{
  public Orchestrator(String name){super(name);}
  Vector currsigs = new Vector();
  private boolean df = false;
  private char [] active;
  private char [] paused;
  private char [] suspended;
  public input_Channel conveyorStatus_in = new input_Channel();
  public input_Channel capperStatus_in = new input_Channel();
  public input_Channel capLoaderStatus_in = new input_Channel();
  public input_Channel fillerStatus_in = new input_Channel();
  public input_Channel rotaryStatus_in = new input_Channel();
  public input_Channel order_in = new input_Channel();
  public output_Channel conveyorReq_o = new output_Channel();
  public output_Channel rotaryReq_o = new output_Channel();
  public output_Channel fillerReq_o = new output_Channel();
  public output_Channel capperReq_o = new output_Channel();
  public output_Channel capLoaderReq_o = new output_Channel();
  public output_Channel doneOrder_o = new output_Channel();
  public output_Channel percentLiquid_o = new output_Channel();
  private Signal sigConveyorReq_1;
  private Signal sigCapperReq_1;
  private Signal sigCapLoaderReq_1;
  private Signal sigFillerReq_1;
  private Signal sigRotaryReq_1;
  private Signal recConveyorStatus_1;
  private Signal recCapperStatus_1;
  private Signal recCapLoaderStatus_1;
  private Signal recFillerStatus_1;
  private Signal recRotaryStatus_1;
  private Signal getNextBottle_1;
  private int quantity_thread_2;//sysj\orchestrator.sysj line: 17, column: 3
  private int bottlePlaced_thread_2;//sysj\orchestrator.sysj line: 18, column: 3
  private ArrayList liquidPercent_thread_2;//sysj\orchestrator.sysj line: 19, column: 3
  private String res_thread_3;//sysj\orchestrator.sysj line: 50, column: 4
  private String res_thread_4;//sysj\orchestrator.sysj line: 62, column: 4
  private String res_thread_5;//sysj\orchestrator.sysj line: 75, column: 4
  private String res_thread_6;//sysj\orchestrator.sysj line: 87, column: 4
  private String res_thread_7;//sysj\orchestrator.sysj line: 99, column: 4
  private int S83368 = 1;
  private int S78274 = 1;
  private int S78078 = 1;
  private int S78040 = 1;
  private int S79214 = 1;
  private int S78320 = 1;
  private int S78282 = 1;
  private int S78277 = 1;
  private int S78327 = 1;
  private int S78322 = 1;
  private int S80154 = 1;
  private int S79216 = 1;
  private int S79223 = 1;
  private int S79218 = 1;
  private int S79267 = 1;
  private int S79262 = 1;
  private int S81094 = 1;
  private int S80156 = 1;
  private int S80163 = 1;
  private int S80158 = 1;
  private int S80207 = 1;
  private int S80202 = 1;
  private int S82034 = 1;
  private int S81096 = 1;
  private int S81103 = 1;
  private int S81098 = 1;
  private int S81147 = 1;
  private int S81142 = 1;
  private int S82974 = 1;
  private int S82036 = 1;
  private int S82043 = 1;
  private int S82038 = 1;
  private int S82087 = 1;
  private int S82082 = 1;
  private int S83366 = 1;
  private int S82976 = 1;
  private int S82979 = 1;
  private int S82982 = 1;
  private int S82985 = 1;
  private int S82988 = 1;
  
  private int[] ends = new int[12];
  private int[] tdone = new int[12];
  
  public void thread83395(int [] tdone, int [] ends){
        S82988=1;
    active[11]=1;
    ends[11]=1;
    tdone[11]=1;
  }

  public void thread83394(int [] tdone, int [] ends){
        S82985=1;
    active[10]=1;
    ends[10]=1;
    tdone[10]=1;
  }

  public void thread83393(int [] tdone, int [] ends){
        S82982=1;
    active[9]=1;
    ends[9]=1;
    tdone[9]=1;
  }

  public void thread83391(int [] tdone, int [] ends){
        switch(S82988){
      case 0 : 
        active[11]=0;
        ends[11]=0;
        tdone[11]=1;
        break;
      
      case 1 : 
        if(recCapperStatus_1.getprestatus()){//sysj\orchestrator.sysj line: 117, column: 73
          S82988=0;
          active[11]=0;
          ends[11]=0;
          tdone[11]=1;
        }
        else {
          active[11]=1;
          ends[11]=1;
          tdone[11]=1;
        }
        break;
      
    }
  }

  public void thread83390(int [] tdone, int [] ends){
        switch(S82985){
      case 0 : 
        active[10]=0;
        ends[10]=0;
        tdone[10]=1;
        break;
      
      case 1 : 
        if(recCapLoaderStatus_1.getprestatus()){//sysj\orchestrator.sysj line: 117, column: 41
          S82985=0;
          active[10]=0;
          ends[10]=0;
          tdone[10]=1;
        }
        else {
          active[10]=1;
          ends[10]=1;
          tdone[10]=1;
        }
        break;
      
    }
  }

  public void thread83389(int [] tdone, int [] ends){
        switch(S82982){
      case 0 : 
        active[9]=0;
        ends[9]=0;
        tdone[9]=1;
        break;
      
      case 1 : 
        if(recFillerStatus_1.getprestatus()){//sysj\orchestrator.sysj line: 117, column: 12
          S82982=0;
          active[9]=0;
          ends[9]=0;
          tdone[9]=1;
        }
        else {
          active[9]=1;
          ends[9]=1;
          tdone[9]=1;
        }
        break;
      
    }
  }

  public void thread83387(int [] tdone, int [] ends){
        S82988=1;
    active[11]=1;
    ends[11]=1;
    tdone[11]=1;
  }

  public void thread83386(int [] tdone, int [] ends){
        S82985=1;
    active[10]=1;
    ends[10]=1;
    tdone[10]=1;
  }

  public void thread83385(int [] tdone, int [] ends){
        S82982=1;
    active[9]=1;
    ends[9]=1;
    tdone[9]=1;
  }

  public void thread83384(int [] tdone, int [] ends){
        switch(S83366){
      case 0 : 
        active[8]=0;
        ends[8]=0;
        tdone[8]=1;
        break;
      
      case 1 : 
        switch(S82976){
          case 0 : 
            if(recConveyorStatus_1.getprestatus()){//sysj\orchestrator.sysj line: 107, column: 10
              sigRotaryReq_1.setPresent();//sysj\orchestrator.sysj line: 108, column: 4
              currsigs.addElement(sigRotaryReq_1);
              S82976=1;
              active[8]=1;
              ends[8]=1;
              tdone[8]=1;
            }
            else {
              active[8]=1;
              ends[8]=1;
              tdone[8]=1;
            }
            break;
          
          case 1 : 
            if(recRotaryStatus_1.getprestatus()){//sysj\orchestrator.sysj line: 109, column: 10
              S82976=2;
              System.out.println("Orch: New bottle. Preparing to send requests..");//sysj\orchestrator.sysj line: 113, column: 5
              sigFillerReq_1.setPresent();//sysj\orchestrator.sysj line: 114, column: 5
              currsigs.addElement(sigFillerReq_1);
              sigCapLoaderReq_1.setPresent();//sysj\orchestrator.sysj line: 115, column: 5
              currsigs.addElement(sigCapLoaderReq_1);
              sigCapperReq_1.setPresent();//sysj\orchestrator.sysj line: 116, column: 5
              currsigs.addElement(sigCapperReq_1);
              S82979=0;
              thread83385(tdone,ends);
              thread83386(tdone,ends);
              thread83387(tdone,ends);
              int biggest83388 = 0;
              if(ends[9]>=biggest83388){
                biggest83388=ends[9];
              }
              if(ends[10]>=biggest83388){
                biggest83388=ends[10];
              }
              if(ends[11]>=biggest83388){
                biggest83388=ends[11];
              }
              if(biggest83388 == 1){
                active[8]=1;
                ends[8]=1;
                tdone[8]=1;
              }
            }
            else {
              active[8]=1;
              ends[8]=1;
              tdone[8]=1;
            }
            break;
          
          case 2 : 
            switch(S82979){
              case 0 : 
                thread83389(tdone,ends);
                thread83390(tdone,ends);
                thread83391(tdone,ends);
                int biggest83392 = 0;
                if(ends[9]>=biggest83392){
                  biggest83392=ends[9];
                }
                if(ends[10]>=biggest83392){
                  biggest83392=ends[10];
                }
                if(ends[11]>=biggest83392){
                  biggest83392=ends[11];
                }
                if(biggest83392 == 1){
                  active[8]=1;
                  ends[8]=1;
                  tdone[8]=1;
                }
                //FINXME code
                if(biggest83392 == 0){
                  sigRotaryReq_1.setPresent();//sysj\orchestrator.sysj line: 120, column: 5
                  currsigs.addElement(sigRotaryReq_1);
                  S82979=1;
                  active[8]=1;
                  ends[8]=1;
                  tdone[8]=1;
                }
                break;
              
              case 1 : 
                if(recRotaryStatus_1.getprestatus()){//sysj\orchestrator.sysj line: 121, column: 11
                  getNextBottle_1.setPresent();//sysj\orchestrator.sysj line: 124, column: 5
                  currsigs.addElement(getNextBottle_1);
                  S82979=2;
                  active[8]=1;
                  ends[8]=1;
                  tdone[8]=1;
                }
                else {
                  active[8]=1;
                  ends[8]=1;
                  tdone[8]=1;
                }
                break;
              
              case 2 : 
                S82979=2;
                System.out.println("Orch: New bottle. Preparing to send requests..");//sysj\orchestrator.sysj line: 113, column: 5
                sigFillerReq_1.setPresent();//sysj\orchestrator.sysj line: 114, column: 5
                currsigs.addElement(sigFillerReq_1);
                sigCapLoaderReq_1.setPresent();//sysj\orchestrator.sysj line: 115, column: 5
                currsigs.addElement(sigCapLoaderReq_1);
                sigCapperReq_1.setPresent();//sysj\orchestrator.sysj line: 116, column: 5
                currsigs.addElement(sigCapperReq_1);
                S82979=0;
                thread83393(tdone,ends);
                thread83394(tdone,ends);
                thread83395(tdone,ends);
                int biggest83396 = 0;
                if(ends[9]>=biggest83396){
                  biggest83396=ends[9];
                }
                if(ends[10]>=biggest83396){
                  biggest83396=ends[10];
                }
                if(ends[11]>=biggest83396){
                  biggest83396=ends[11];
                }
                if(biggest83396 == 1){
                  active[8]=1;
                  ends[8]=1;
                  tdone[8]=1;
                }
                break;
              
            }
            break;
          
          case 3 : 
            S82976=3;
            S82976=0;
            active[8]=1;
            ends[8]=1;
            tdone[8]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread83383(int [] tdone, int [] ends){
        switch(S82974){
      case 0 : 
        active[7]=0;
        ends[7]=0;
        tdone[7]=1;
        break;
      
      case 1 : 
        switch(S82036){
          case 0 : 
            if(sigRotaryReq_1.getprestatus()){//sysj\orchestrator.sysj line: 94, column: 10
              System.out.println("Orch: Sending rotary request");//sysj\orchestrator.sysj line: 95, column: 4
              S82036=1;
              S82043=0;
              if(!rotaryReq_o.isPartnerPresent() || rotaryReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 96, column: 4
                rotaryReq_o.setREQ(false);//sysj\orchestrator.sysj line: 96, column: 4
                S82043=1;
                active[7]=1;
                ends[7]=1;
                tdone[7]=1;
              }
              else {
                S82038=0;
                if(rotaryReq_o.isACK()){//sysj\orchestrator.sysj line: 96, column: 4
                  rotaryReq_o.setVal(true);//sysj\orchestrator.sysj line: 96, column: 4
                  S82038=1;
                  if(!rotaryReq_o.isACK()){//sysj\orchestrator.sysj line: 96, column: 4
                    rotaryReq_o.setREQ(false);//sysj\orchestrator.sysj line: 96, column: 4
                    ends[7]=2;
                    ;//sysj\orchestrator.sysj line: 96, column: 4
                    S82036=2;
                    S82087=0;
                    if(!rotaryStatus_in.isPartnerPresent() || rotaryStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 97, column: 4
                      rotaryStatus_in.setACK(false);//sysj\orchestrator.sysj line: 97, column: 4
                      S82087=1;
                      active[7]=1;
                      ends[7]=1;
                      tdone[7]=1;
                    }
                    else {
                      S82082=0;
                      if(!rotaryStatus_in.isREQ()){//sysj\orchestrator.sysj line: 97, column: 4
                        rotaryStatus_in.setACK(true);//sysj\orchestrator.sysj line: 97, column: 4
                        S82082=1;
                        if(rotaryStatus_in.isREQ()){//sysj\orchestrator.sysj line: 97, column: 4
                          rotaryStatus_in.setACK(false);//sysj\orchestrator.sysj line: 97, column: 4
                          ends[7]=2;
                          ;//sysj\orchestrator.sysj line: 97, column: 4
                          System.out.println("Orch: Received rotary status");//sysj\orchestrator.sysj line: 98, column: 4
                          res_thread_7 = (String)(rotaryStatus_in.getVal() == null ? null : ((String)rotaryStatus_in.getVal()));//sysj\orchestrator.sysj line: 99, column: 4
                          recRotaryStatus_1.setPresent();//sysj\orchestrator.sysj line: 100, column: 4
                          currsigs.addElement(recRotaryStatus_1);
                          recRotaryStatus_1.setValue(res_thread_7);//sysj\orchestrator.sysj line: 100, column: 4
                          S82036=0;
                          active[7]=1;
                          ends[7]=1;
                          tdone[7]=1;
                        }
                        else {
                          active[7]=1;
                          ends[7]=1;
                          tdone[7]=1;
                        }
                      }
                      else {
                        active[7]=1;
                        ends[7]=1;
                        tdone[7]=1;
                      }
                    }
                  }
                  else {
                    active[7]=1;
                    ends[7]=1;
                    tdone[7]=1;
                  }
                }
                else {
                  active[7]=1;
                  ends[7]=1;
                  tdone[7]=1;
                }
              }
            }
            else {
              active[7]=1;
              ends[7]=1;
              tdone[7]=1;
            }
            break;
          
          case 1 : 
            switch(S82043){
              case 0 : 
                if(!rotaryReq_o.isPartnerPresent() || rotaryReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 96, column: 4
                  rotaryReq_o.setREQ(false);//sysj\orchestrator.sysj line: 96, column: 4
                  S82043=1;
                  active[7]=1;
                  ends[7]=1;
                  tdone[7]=1;
                }
                else {
                  switch(S82038){
                    case 0 : 
                      if(rotaryReq_o.isACK()){//sysj\orchestrator.sysj line: 96, column: 4
                        rotaryReq_o.setVal(true);//sysj\orchestrator.sysj line: 96, column: 4
                        S82038=1;
                        if(!rotaryReq_o.isACK()){//sysj\orchestrator.sysj line: 96, column: 4
                          rotaryReq_o.setREQ(false);//sysj\orchestrator.sysj line: 96, column: 4
                          ends[7]=2;
                          ;//sysj\orchestrator.sysj line: 96, column: 4
                          S82036=2;
                          S82087=0;
                          if(!rotaryStatus_in.isPartnerPresent() || rotaryStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 97, column: 4
                            rotaryStatus_in.setACK(false);//sysj\orchestrator.sysj line: 97, column: 4
                            S82087=1;
                            active[7]=1;
                            ends[7]=1;
                            tdone[7]=1;
                          }
                          else {
                            S82082=0;
                            if(!rotaryStatus_in.isREQ()){//sysj\orchestrator.sysj line: 97, column: 4
                              rotaryStatus_in.setACK(true);//sysj\orchestrator.sysj line: 97, column: 4
                              S82082=1;
                              if(rotaryStatus_in.isREQ()){//sysj\orchestrator.sysj line: 97, column: 4
                                rotaryStatus_in.setACK(false);//sysj\orchestrator.sysj line: 97, column: 4
                                ends[7]=2;
                                ;//sysj\orchestrator.sysj line: 97, column: 4
                                System.out.println("Orch: Received rotary status");//sysj\orchestrator.sysj line: 98, column: 4
                                res_thread_7 = (String)(rotaryStatus_in.getVal() == null ? null : ((String)rotaryStatus_in.getVal()));//sysj\orchestrator.sysj line: 99, column: 4
                                recRotaryStatus_1.setPresent();//sysj\orchestrator.sysj line: 100, column: 4
                                currsigs.addElement(recRotaryStatus_1);
                                recRotaryStatus_1.setValue(res_thread_7);//sysj\orchestrator.sysj line: 100, column: 4
                                S82036=0;
                                active[7]=1;
                                ends[7]=1;
                                tdone[7]=1;
                              }
                              else {
                                active[7]=1;
                                ends[7]=1;
                                tdone[7]=1;
                              }
                            }
                            else {
                              active[7]=1;
                              ends[7]=1;
                              tdone[7]=1;
                            }
                          }
                        }
                        else {
                          active[7]=1;
                          ends[7]=1;
                          tdone[7]=1;
                        }
                      }
                      else {
                        active[7]=1;
                        ends[7]=1;
                        tdone[7]=1;
                      }
                      break;
                    
                    case 1 : 
                      if(!rotaryReq_o.isACK()){//sysj\orchestrator.sysj line: 96, column: 4
                        rotaryReq_o.setREQ(false);//sysj\orchestrator.sysj line: 96, column: 4
                        ends[7]=2;
                        ;//sysj\orchestrator.sysj line: 96, column: 4
                        S82036=2;
                        S82087=0;
                        if(!rotaryStatus_in.isPartnerPresent() || rotaryStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 97, column: 4
                          rotaryStatus_in.setACK(false);//sysj\orchestrator.sysj line: 97, column: 4
                          S82087=1;
                          active[7]=1;
                          ends[7]=1;
                          tdone[7]=1;
                        }
                        else {
                          S82082=0;
                          if(!rotaryStatus_in.isREQ()){//sysj\orchestrator.sysj line: 97, column: 4
                            rotaryStatus_in.setACK(true);//sysj\orchestrator.sysj line: 97, column: 4
                            S82082=1;
                            if(rotaryStatus_in.isREQ()){//sysj\orchestrator.sysj line: 97, column: 4
                              rotaryStatus_in.setACK(false);//sysj\orchestrator.sysj line: 97, column: 4
                              ends[7]=2;
                              ;//sysj\orchestrator.sysj line: 97, column: 4
                              System.out.println("Orch: Received rotary status");//sysj\orchestrator.sysj line: 98, column: 4
                              res_thread_7 = (String)(rotaryStatus_in.getVal() == null ? null : ((String)rotaryStatus_in.getVal()));//sysj\orchestrator.sysj line: 99, column: 4
                              recRotaryStatus_1.setPresent();//sysj\orchestrator.sysj line: 100, column: 4
                              currsigs.addElement(recRotaryStatus_1);
                              recRotaryStatus_1.setValue(res_thread_7);//sysj\orchestrator.sysj line: 100, column: 4
                              S82036=0;
                              active[7]=1;
                              ends[7]=1;
                              tdone[7]=1;
                            }
                            else {
                              active[7]=1;
                              ends[7]=1;
                              tdone[7]=1;
                            }
                          }
                          else {
                            active[7]=1;
                            ends[7]=1;
                            tdone[7]=1;
                          }
                        }
                      }
                      else {
                        active[7]=1;
                        ends[7]=1;
                        tdone[7]=1;
                      }
                      break;
                    
                  }
                }
                break;
              
              case 1 : 
                S82043=1;
                S82043=0;
                if(!rotaryReq_o.isPartnerPresent() || rotaryReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 96, column: 4
                  rotaryReq_o.setREQ(false);//sysj\orchestrator.sysj line: 96, column: 4
                  S82043=1;
                  active[7]=1;
                  ends[7]=1;
                  tdone[7]=1;
                }
                else {
                  S82038=0;
                  if(rotaryReq_o.isACK()){//sysj\orchestrator.sysj line: 96, column: 4
                    rotaryReq_o.setVal(true);//sysj\orchestrator.sysj line: 96, column: 4
                    S82038=1;
                    if(!rotaryReq_o.isACK()){//sysj\orchestrator.sysj line: 96, column: 4
                      rotaryReq_o.setREQ(false);//sysj\orchestrator.sysj line: 96, column: 4
                      ends[7]=2;
                      ;//sysj\orchestrator.sysj line: 96, column: 4
                      S82036=2;
                      S82087=0;
                      if(!rotaryStatus_in.isPartnerPresent() || rotaryStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 97, column: 4
                        rotaryStatus_in.setACK(false);//sysj\orchestrator.sysj line: 97, column: 4
                        S82087=1;
                        active[7]=1;
                        ends[7]=1;
                        tdone[7]=1;
                      }
                      else {
                        S82082=0;
                        if(!rotaryStatus_in.isREQ()){//sysj\orchestrator.sysj line: 97, column: 4
                          rotaryStatus_in.setACK(true);//sysj\orchestrator.sysj line: 97, column: 4
                          S82082=1;
                          if(rotaryStatus_in.isREQ()){//sysj\orchestrator.sysj line: 97, column: 4
                            rotaryStatus_in.setACK(false);//sysj\orchestrator.sysj line: 97, column: 4
                            ends[7]=2;
                            ;//sysj\orchestrator.sysj line: 97, column: 4
                            System.out.println("Orch: Received rotary status");//sysj\orchestrator.sysj line: 98, column: 4
                            res_thread_7 = (String)(rotaryStatus_in.getVal() == null ? null : ((String)rotaryStatus_in.getVal()));//sysj\orchestrator.sysj line: 99, column: 4
                            recRotaryStatus_1.setPresent();//sysj\orchestrator.sysj line: 100, column: 4
                            currsigs.addElement(recRotaryStatus_1);
                            recRotaryStatus_1.setValue(res_thread_7);//sysj\orchestrator.sysj line: 100, column: 4
                            S82036=0;
                            active[7]=1;
                            ends[7]=1;
                            tdone[7]=1;
                          }
                          else {
                            active[7]=1;
                            ends[7]=1;
                            tdone[7]=1;
                          }
                        }
                        else {
                          active[7]=1;
                          ends[7]=1;
                          tdone[7]=1;
                        }
                      }
                    }
                    else {
                      active[7]=1;
                      ends[7]=1;
                      tdone[7]=1;
                    }
                  }
                  else {
                    active[7]=1;
                    ends[7]=1;
                    tdone[7]=1;
                  }
                }
                break;
              
            }
            break;
          
          case 2 : 
            switch(S82087){
              case 0 : 
                if(!rotaryStatus_in.isPartnerPresent() || rotaryStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 97, column: 4
                  rotaryStatus_in.setACK(false);//sysj\orchestrator.sysj line: 97, column: 4
                  S82087=1;
                  active[7]=1;
                  ends[7]=1;
                  tdone[7]=1;
                }
                else {
                  switch(S82082){
                    case 0 : 
                      if(!rotaryStatus_in.isREQ()){//sysj\orchestrator.sysj line: 97, column: 4
                        rotaryStatus_in.setACK(true);//sysj\orchestrator.sysj line: 97, column: 4
                        S82082=1;
                        if(rotaryStatus_in.isREQ()){//sysj\orchestrator.sysj line: 97, column: 4
                          rotaryStatus_in.setACK(false);//sysj\orchestrator.sysj line: 97, column: 4
                          ends[7]=2;
                          ;//sysj\orchestrator.sysj line: 97, column: 4
                          System.out.println("Orch: Received rotary status");//sysj\orchestrator.sysj line: 98, column: 4
                          res_thread_7 = (String)(rotaryStatus_in.getVal() == null ? null : ((String)rotaryStatus_in.getVal()));//sysj\orchestrator.sysj line: 99, column: 4
                          recRotaryStatus_1.setPresent();//sysj\orchestrator.sysj line: 100, column: 4
                          currsigs.addElement(recRotaryStatus_1);
                          recRotaryStatus_1.setValue(res_thread_7);//sysj\orchestrator.sysj line: 100, column: 4
                          S82036=0;
                          active[7]=1;
                          ends[7]=1;
                          tdone[7]=1;
                        }
                        else {
                          active[7]=1;
                          ends[7]=1;
                          tdone[7]=1;
                        }
                      }
                      else {
                        active[7]=1;
                        ends[7]=1;
                        tdone[7]=1;
                      }
                      break;
                    
                    case 1 : 
                      if(rotaryStatus_in.isREQ()){//sysj\orchestrator.sysj line: 97, column: 4
                        rotaryStatus_in.setACK(false);//sysj\orchestrator.sysj line: 97, column: 4
                        ends[7]=2;
                        ;//sysj\orchestrator.sysj line: 97, column: 4
                        System.out.println("Orch: Received rotary status");//sysj\orchestrator.sysj line: 98, column: 4
                        res_thread_7 = (String)(rotaryStatus_in.getVal() == null ? null : ((String)rotaryStatus_in.getVal()));//sysj\orchestrator.sysj line: 99, column: 4
                        recRotaryStatus_1.setPresent();//sysj\orchestrator.sysj line: 100, column: 4
                        currsigs.addElement(recRotaryStatus_1);
                        recRotaryStatus_1.setValue(res_thread_7);//sysj\orchestrator.sysj line: 100, column: 4
                        S82036=0;
                        active[7]=1;
                        ends[7]=1;
                        tdone[7]=1;
                      }
                      else {
                        active[7]=1;
                        ends[7]=1;
                        tdone[7]=1;
                      }
                      break;
                    
                  }
                }
                break;
              
              case 1 : 
                S82087=1;
                S82087=0;
                if(!rotaryStatus_in.isPartnerPresent() || rotaryStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 97, column: 4
                  rotaryStatus_in.setACK(false);//sysj\orchestrator.sysj line: 97, column: 4
                  S82087=1;
                  active[7]=1;
                  ends[7]=1;
                  tdone[7]=1;
                }
                else {
                  S82082=0;
                  if(!rotaryStatus_in.isREQ()){//sysj\orchestrator.sysj line: 97, column: 4
                    rotaryStatus_in.setACK(true);//sysj\orchestrator.sysj line: 97, column: 4
                    S82082=1;
                    if(rotaryStatus_in.isREQ()){//sysj\orchestrator.sysj line: 97, column: 4
                      rotaryStatus_in.setACK(false);//sysj\orchestrator.sysj line: 97, column: 4
                      ends[7]=2;
                      ;//sysj\orchestrator.sysj line: 97, column: 4
                      System.out.println("Orch: Received rotary status");//sysj\orchestrator.sysj line: 98, column: 4
                      res_thread_7 = (String)(rotaryStatus_in.getVal() == null ? null : ((String)rotaryStatus_in.getVal()));//sysj\orchestrator.sysj line: 99, column: 4
                      recRotaryStatus_1.setPresent();//sysj\orchestrator.sysj line: 100, column: 4
                      currsigs.addElement(recRotaryStatus_1);
                      recRotaryStatus_1.setValue(res_thread_7);//sysj\orchestrator.sysj line: 100, column: 4
                      S82036=0;
                      active[7]=1;
                      ends[7]=1;
                      tdone[7]=1;
                    }
                    else {
                      active[7]=1;
                      ends[7]=1;
                      tdone[7]=1;
                    }
                  }
                  else {
                    active[7]=1;
                    ends[7]=1;
                    tdone[7]=1;
                  }
                }
                break;
              
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread83382(int [] tdone, int [] ends){
        switch(S82034){
      case 0 : 
        active[6]=0;
        ends[6]=0;
        tdone[6]=1;
        break;
      
      case 1 : 
        switch(S81096){
          case 0 : 
            if(sigFillerReq_1.getprestatus()){//sysj\orchestrator.sysj line: 82, column: 10
              System.out.println("Orch: Sending filler request");//sysj\orchestrator.sysj line: 83, column: 4
              S81096=1;
              S81103=0;
              if(!fillerReq_o.isPartnerPresent() || fillerReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 84, column: 4
                fillerReq_o.setREQ(false);//sysj\orchestrator.sysj line: 84, column: 4
                S81103=1;
                active[6]=1;
                ends[6]=1;
                tdone[6]=1;
              }
              else {
                S81098=0;
                if(fillerReq_o.isACK()){//sysj\orchestrator.sysj line: 84, column: 4
                  fillerReq_o.setVal(true);//sysj\orchestrator.sysj line: 84, column: 4
                  S81098=1;
                  if(!fillerReq_o.isACK()){//sysj\orchestrator.sysj line: 84, column: 4
                    fillerReq_o.setREQ(false);//sysj\orchestrator.sysj line: 84, column: 4
                    ends[6]=2;
                    ;//sysj\orchestrator.sysj line: 84, column: 4
                    S81096=2;
                    S81147=0;
                    if(!fillerStatus_in.isPartnerPresent() || fillerStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 85, column: 4
                      fillerStatus_in.setACK(false);//sysj\orchestrator.sysj line: 85, column: 4
                      S81147=1;
                      active[6]=1;
                      ends[6]=1;
                      tdone[6]=1;
                    }
                    else {
                      S81142=0;
                      if(!fillerStatus_in.isREQ()){//sysj\orchestrator.sysj line: 85, column: 4
                        fillerStatus_in.setACK(true);//sysj\orchestrator.sysj line: 85, column: 4
                        S81142=1;
                        if(fillerStatus_in.isREQ()){//sysj\orchestrator.sysj line: 85, column: 4
                          fillerStatus_in.setACK(false);//sysj\orchestrator.sysj line: 85, column: 4
                          ends[6]=2;
                          ;//sysj\orchestrator.sysj line: 85, column: 4
                          System.out.println("Orch: Received filler status");//sysj\orchestrator.sysj line: 86, column: 4
                          res_thread_6 = (String)(fillerStatus_in.getVal() == null ? null : ((String)fillerStatus_in.getVal()));//sysj\orchestrator.sysj line: 87, column: 4
                          recFillerStatus_1.setPresent();//sysj\orchestrator.sysj line: 88, column: 4
                          currsigs.addElement(recFillerStatus_1);
                          recFillerStatus_1.setValue(res_thread_6);//sysj\orchestrator.sysj line: 88, column: 4
                          S81096=0;
                          active[6]=1;
                          ends[6]=1;
                          tdone[6]=1;
                        }
                        else {
                          active[6]=1;
                          ends[6]=1;
                          tdone[6]=1;
                        }
                      }
                      else {
                        active[6]=1;
                        ends[6]=1;
                        tdone[6]=1;
                      }
                    }
                  }
                  else {
                    active[6]=1;
                    ends[6]=1;
                    tdone[6]=1;
                  }
                }
                else {
                  active[6]=1;
                  ends[6]=1;
                  tdone[6]=1;
                }
              }
            }
            else {
              active[6]=1;
              ends[6]=1;
              tdone[6]=1;
            }
            break;
          
          case 1 : 
            switch(S81103){
              case 0 : 
                if(!fillerReq_o.isPartnerPresent() || fillerReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 84, column: 4
                  fillerReq_o.setREQ(false);//sysj\orchestrator.sysj line: 84, column: 4
                  S81103=1;
                  active[6]=1;
                  ends[6]=1;
                  tdone[6]=1;
                }
                else {
                  switch(S81098){
                    case 0 : 
                      if(fillerReq_o.isACK()){//sysj\orchestrator.sysj line: 84, column: 4
                        fillerReq_o.setVal(true);//sysj\orchestrator.sysj line: 84, column: 4
                        S81098=1;
                        if(!fillerReq_o.isACK()){//sysj\orchestrator.sysj line: 84, column: 4
                          fillerReq_o.setREQ(false);//sysj\orchestrator.sysj line: 84, column: 4
                          ends[6]=2;
                          ;//sysj\orchestrator.sysj line: 84, column: 4
                          S81096=2;
                          S81147=0;
                          if(!fillerStatus_in.isPartnerPresent() || fillerStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 85, column: 4
                            fillerStatus_in.setACK(false);//sysj\orchestrator.sysj line: 85, column: 4
                            S81147=1;
                            active[6]=1;
                            ends[6]=1;
                            tdone[6]=1;
                          }
                          else {
                            S81142=0;
                            if(!fillerStatus_in.isREQ()){//sysj\orchestrator.sysj line: 85, column: 4
                              fillerStatus_in.setACK(true);//sysj\orchestrator.sysj line: 85, column: 4
                              S81142=1;
                              if(fillerStatus_in.isREQ()){//sysj\orchestrator.sysj line: 85, column: 4
                                fillerStatus_in.setACK(false);//sysj\orchestrator.sysj line: 85, column: 4
                                ends[6]=2;
                                ;//sysj\orchestrator.sysj line: 85, column: 4
                                System.out.println("Orch: Received filler status");//sysj\orchestrator.sysj line: 86, column: 4
                                res_thread_6 = (String)(fillerStatus_in.getVal() == null ? null : ((String)fillerStatus_in.getVal()));//sysj\orchestrator.sysj line: 87, column: 4
                                recFillerStatus_1.setPresent();//sysj\orchestrator.sysj line: 88, column: 4
                                currsigs.addElement(recFillerStatus_1);
                                recFillerStatus_1.setValue(res_thread_6);//sysj\orchestrator.sysj line: 88, column: 4
                                S81096=0;
                                active[6]=1;
                                ends[6]=1;
                                tdone[6]=1;
                              }
                              else {
                                active[6]=1;
                                ends[6]=1;
                                tdone[6]=1;
                              }
                            }
                            else {
                              active[6]=1;
                              ends[6]=1;
                              tdone[6]=1;
                            }
                          }
                        }
                        else {
                          active[6]=1;
                          ends[6]=1;
                          tdone[6]=1;
                        }
                      }
                      else {
                        active[6]=1;
                        ends[6]=1;
                        tdone[6]=1;
                      }
                      break;
                    
                    case 1 : 
                      if(!fillerReq_o.isACK()){//sysj\orchestrator.sysj line: 84, column: 4
                        fillerReq_o.setREQ(false);//sysj\orchestrator.sysj line: 84, column: 4
                        ends[6]=2;
                        ;//sysj\orchestrator.sysj line: 84, column: 4
                        S81096=2;
                        S81147=0;
                        if(!fillerStatus_in.isPartnerPresent() || fillerStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 85, column: 4
                          fillerStatus_in.setACK(false);//sysj\orchestrator.sysj line: 85, column: 4
                          S81147=1;
                          active[6]=1;
                          ends[6]=1;
                          tdone[6]=1;
                        }
                        else {
                          S81142=0;
                          if(!fillerStatus_in.isREQ()){//sysj\orchestrator.sysj line: 85, column: 4
                            fillerStatus_in.setACK(true);//sysj\orchestrator.sysj line: 85, column: 4
                            S81142=1;
                            if(fillerStatus_in.isREQ()){//sysj\orchestrator.sysj line: 85, column: 4
                              fillerStatus_in.setACK(false);//sysj\orchestrator.sysj line: 85, column: 4
                              ends[6]=2;
                              ;//sysj\orchestrator.sysj line: 85, column: 4
                              System.out.println("Orch: Received filler status");//sysj\orchestrator.sysj line: 86, column: 4
                              res_thread_6 = (String)(fillerStatus_in.getVal() == null ? null : ((String)fillerStatus_in.getVal()));//sysj\orchestrator.sysj line: 87, column: 4
                              recFillerStatus_1.setPresent();//sysj\orchestrator.sysj line: 88, column: 4
                              currsigs.addElement(recFillerStatus_1);
                              recFillerStatus_1.setValue(res_thread_6);//sysj\orchestrator.sysj line: 88, column: 4
                              S81096=0;
                              active[6]=1;
                              ends[6]=1;
                              tdone[6]=1;
                            }
                            else {
                              active[6]=1;
                              ends[6]=1;
                              tdone[6]=1;
                            }
                          }
                          else {
                            active[6]=1;
                            ends[6]=1;
                            tdone[6]=1;
                          }
                        }
                      }
                      else {
                        active[6]=1;
                        ends[6]=1;
                        tdone[6]=1;
                      }
                      break;
                    
                  }
                }
                break;
              
              case 1 : 
                S81103=1;
                S81103=0;
                if(!fillerReq_o.isPartnerPresent() || fillerReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 84, column: 4
                  fillerReq_o.setREQ(false);//sysj\orchestrator.sysj line: 84, column: 4
                  S81103=1;
                  active[6]=1;
                  ends[6]=1;
                  tdone[6]=1;
                }
                else {
                  S81098=0;
                  if(fillerReq_o.isACK()){//sysj\orchestrator.sysj line: 84, column: 4
                    fillerReq_o.setVal(true);//sysj\orchestrator.sysj line: 84, column: 4
                    S81098=1;
                    if(!fillerReq_o.isACK()){//sysj\orchestrator.sysj line: 84, column: 4
                      fillerReq_o.setREQ(false);//sysj\orchestrator.sysj line: 84, column: 4
                      ends[6]=2;
                      ;//sysj\orchestrator.sysj line: 84, column: 4
                      S81096=2;
                      S81147=0;
                      if(!fillerStatus_in.isPartnerPresent() || fillerStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 85, column: 4
                        fillerStatus_in.setACK(false);//sysj\orchestrator.sysj line: 85, column: 4
                        S81147=1;
                        active[6]=1;
                        ends[6]=1;
                        tdone[6]=1;
                      }
                      else {
                        S81142=0;
                        if(!fillerStatus_in.isREQ()){//sysj\orchestrator.sysj line: 85, column: 4
                          fillerStatus_in.setACK(true);//sysj\orchestrator.sysj line: 85, column: 4
                          S81142=1;
                          if(fillerStatus_in.isREQ()){//sysj\orchestrator.sysj line: 85, column: 4
                            fillerStatus_in.setACK(false);//sysj\orchestrator.sysj line: 85, column: 4
                            ends[6]=2;
                            ;//sysj\orchestrator.sysj line: 85, column: 4
                            System.out.println("Orch: Received filler status");//sysj\orchestrator.sysj line: 86, column: 4
                            res_thread_6 = (String)(fillerStatus_in.getVal() == null ? null : ((String)fillerStatus_in.getVal()));//sysj\orchestrator.sysj line: 87, column: 4
                            recFillerStatus_1.setPresent();//sysj\orchestrator.sysj line: 88, column: 4
                            currsigs.addElement(recFillerStatus_1);
                            recFillerStatus_1.setValue(res_thread_6);//sysj\orchestrator.sysj line: 88, column: 4
                            S81096=0;
                            active[6]=1;
                            ends[6]=1;
                            tdone[6]=1;
                          }
                          else {
                            active[6]=1;
                            ends[6]=1;
                            tdone[6]=1;
                          }
                        }
                        else {
                          active[6]=1;
                          ends[6]=1;
                          tdone[6]=1;
                        }
                      }
                    }
                    else {
                      active[6]=1;
                      ends[6]=1;
                      tdone[6]=1;
                    }
                  }
                  else {
                    active[6]=1;
                    ends[6]=1;
                    tdone[6]=1;
                  }
                }
                break;
              
            }
            break;
          
          case 2 : 
            switch(S81147){
              case 0 : 
                if(!fillerStatus_in.isPartnerPresent() || fillerStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 85, column: 4
                  fillerStatus_in.setACK(false);//sysj\orchestrator.sysj line: 85, column: 4
                  S81147=1;
                  active[6]=1;
                  ends[6]=1;
                  tdone[6]=1;
                }
                else {
                  switch(S81142){
                    case 0 : 
                      if(!fillerStatus_in.isREQ()){//sysj\orchestrator.sysj line: 85, column: 4
                        fillerStatus_in.setACK(true);//sysj\orchestrator.sysj line: 85, column: 4
                        S81142=1;
                        if(fillerStatus_in.isREQ()){//sysj\orchestrator.sysj line: 85, column: 4
                          fillerStatus_in.setACK(false);//sysj\orchestrator.sysj line: 85, column: 4
                          ends[6]=2;
                          ;//sysj\orchestrator.sysj line: 85, column: 4
                          System.out.println("Orch: Received filler status");//sysj\orchestrator.sysj line: 86, column: 4
                          res_thread_6 = (String)(fillerStatus_in.getVal() == null ? null : ((String)fillerStatus_in.getVal()));//sysj\orchestrator.sysj line: 87, column: 4
                          recFillerStatus_1.setPresent();//sysj\orchestrator.sysj line: 88, column: 4
                          currsigs.addElement(recFillerStatus_1);
                          recFillerStatus_1.setValue(res_thread_6);//sysj\orchestrator.sysj line: 88, column: 4
                          S81096=0;
                          active[6]=1;
                          ends[6]=1;
                          tdone[6]=1;
                        }
                        else {
                          active[6]=1;
                          ends[6]=1;
                          tdone[6]=1;
                        }
                      }
                      else {
                        active[6]=1;
                        ends[6]=1;
                        tdone[6]=1;
                      }
                      break;
                    
                    case 1 : 
                      if(fillerStatus_in.isREQ()){//sysj\orchestrator.sysj line: 85, column: 4
                        fillerStatus_in.setACK(false);//sysj\orchestrator.sysj line: 85, column: 4
                        ends[6]=2;
                        ;//sysj\orchestrator.sysj line: 85, column: 4
                        System.out.println("Orch: Received filler status");//sysj\orchestrator.sysj line: 86, column: 4
                        res_thread_6 = (String)(fillerStatus_in.getVal() == null ? null : ((String)fillerStatus_in.getVal()));//sysj\orchestrator.sysj line: 87, column: 4
                        recFillerStatus_1.setPresent();//sysj\orchestrator.sysj line: 88, column: 4
                        currsigs.addElement(recFillerStatus_1);
                        recFillerStatus_1.setValue(res_thread_6);//sysj\orchestrator.sysj line: 88, column: 4
                        S81096=0;
                        active[6]=1;
                        ends[6]=1;
                        tdone[6]=1;
                      }
                      else {
                        active[6]=1;
                        ends[6]=1;
                        tdone[6]=1;
                      }
                      break;
                    
                  }
                }
                break;
              
              case 1 : 
                S81147=1;
                S81147=0;
                if(!fillerStatus_in.isPartnerPresent() || fillerStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 85, column: 4
                  fillerStatus_in.setACK(false);//sysj\orchestrator.sysj line: 85, column: 4
                  S81147=1;
                  active[6]=1;
                  ends[6]=1;
                  tdone[6]=1;
                }
                else {
                  S81142=0;
                  if(!fillerStatus_in.isREQ()){//sysj\orchestrator.sysj line: 85, column: 4
                    fillerStatus_in.setACK(true);//sysj\orchestrator.sysj line: 85, column: 4
                    S81142=1;
                    if(fillerStatus_in.isREQ()){//sysj\orchestrator.sysj line: 85, column: 4
                      fillerStatus_in.setACK(false);//sysj\orchestrator.sysj line: 85, column: 4
                      ends[6]=2;
                      ;//sysj\orchestrator.sysj line: 85, column: 4
                      System.out.println("Orch: Received filler status");//sysj\orchestrator.sysj line: 86, column: 4
                      res_thread_6 = (String)(fillerStatus_in.getVal() == null ? null : ((String)fillerStatus_in.getVal()));//sysj\orchestrator.sysj line: 87, column: 4
                      recFillerStatus_1.setPresent();//sysj\orchestrator.sysj line: 88, column: 4
                      currsigs.addElement(recFillerStatus_1);
                      recFillerStatus_1.setValue(res_thread_6);//sysj\orchestrator.sysj line: 88, column: 4
                      S81096=0;
                      active[6]=1;
                      ends[6]=1;
                      tdone[6]=1;
                    }
                    else {
                      active[6]=1;
                      ends[6]=1;
                      tdone[6]=1;
                    }
                  }
                  else {
                    active[6]=1;
                    ends[6]=1;
                    tdone[6]=1;
                  }
                }
                break;
              
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread83381(int [] tdone, int [] ends){
        switch(S81094){
      case 0 : 
        active[5]=0;
        ends[5]=0;
        tdone[5]=1;
        break;
      
      case 1 : 
        switch(S80156){
          case 0 : 
            if(sigCapLoaderReq_1.getprestatus()){//sysj\orchestrator.sysj line: 69, column: 10
              System.out.println("Orch: Sending cap loader request");//sysj\orchestrator.sysj line: 70, column: 4
              S80156=1;
              S80163=0;
              if(!capLoaderReq_o.isPartnerPresent() || capLoaderReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 71, column: 4
                capLoaderReq_o.setREQ(false);//sysj\orchestrator.sysj line: 71, column: 4
                S80163=1;
                active[5]=1;
                ends[5]=1;
                tdone[5]=1;
              }
              else {
                S80158=0;
                if(capLoaderReq_o.isACK()){//sysj\orchestrator.sysj line: 71, column: 4
                  capLoaderReq_o.setVal(true);//sysj\orchestrator.sysj line: 71, column: 4
                  S80158=1;
                  if(!capLoaderReq_o.isACK()){//sysj\orchestrator.sysj line: 71, column: 4
                    capLoaderReq_o.setREQ(false);//sysj\orchestrator.sysj line: 71, column: 4
                    ends[5]=2;
                    ;//sysj\orchestrator.sysj line: 71, column: 4
                    S80156=2;
                    S80207=0;
                    if(!capLoaderStatus_in.isPartnerPresent() || capLoaderStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 72, column: 4
                      capLoaderStatus_in.setACK(false);//sysj\orchestrator.sysj line: 72, column: 4
                      S80207=1;
                      active[5]=1;
                      ends[5]=1;
                      tdone[5]=1;
                    }
                    else {
                      S80202=0;
                      if(!capLoaderStatus_in.isREQ()){//sysj\orchestrator.sysj line: 72, column: 4
                        capLoaderStatus_in.setACK(true);//sysj\orchestrator.sysj line: 72, column: 4
                        S80202=1;
                        if(capLoaderStatus_in.isREQ()){//sysj\orchestrator.sysj line: 72, column: 4
                          capLoaderStatus_in.setACK(false);//sysj\orchestrator.sysj line: 72, column: 4
                          ends[5]=2;
                          ;//sysj\orchestrator.sysj line: 72, column: 4
                          System.out.println("Orch: Received cap loader status");//sysj\orchestrator.sysj line: 73, column: 4
                          res_thread_5 = (String)(capLoaderStatus_in.getVal() == null ? null : ((String)capLoaderStatus_in.getVal()));//sysj\orchestrator.sysj line: 75, column: 4
                          recCapLoaderStatus_1.setPresent();//sysj\orchestrator.sysj line: 76, column: 4
                          currsigs.addElement(recCapLoaderStatus_1);
                          recCapLoaderStatus_1.setValue(res_thread_5);//sysj\orchestrator.sysj line: 76, column: 4
                          S80156=0;
                          active[5]=1;
                          ends[5]=1;
                          tdone[5]=1;
                        }
                        else {
                          active[5]=1;
                          ends[5]=1;
                          tdone[5]=1;
                        }
                      }
                      else {
                        active[5]=1;
                        ends[5]=1;
                        tdone[5]=1;
                      }
                    }
                  }
                  else {
                    active[5]=1;
                    ends[5]=1;
                    tdone[5]=1;
                  }
                }
                else {
                  active[5]=1;
                  ends[5]=1;
                  tdone[5]=1;
                }
              }
            }
            else {
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            break;
          
          case 1 : 
            switch(S80163){
              case 0 : 
                if(!capLoaderReq_o.isPartnerPresent() || capLoaderReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 71, column: 4
                  capLoaderReq_o.setREQ(false);//sysj\orchestrator.sysj line: 71, column: 4
                  S80163=1;
                  active[5]=1;
                  ends[5]=1;
                  tdone[5]=1;
                }
                else {
                  switch(S80158){
                    case 0 : 
                      if(capLoaderReq_o.isACK()){//sysj\orchestrator.sysj line: 71, column: 4
                        capLoaderReq_o.setVal(true);//sysj\orchestrator.sysj line: 71, column: 4
                        S80158=1;
                        if(!capLoaderReq_o.isACK()){//sysj\orchestrator.sysj line: 71, column: 4
                          capLoaderReq_o.setREQ(false);//sysj\orchestrator.sysj line: 71, column: 4
                          ends[5]=2;
                          ;//sysj\orchestrator.sysj line: 71, column: 4
                          S80156=2;
                          S80207=0;
                          if(!capLoaderStatus_in.isPartnerPresent() || capLoaderStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 72, column: 4
                            capLoaderStatus_in.setACK(false);//sysj\orchestrator.sysj line: 72, column: 4
                            S80207=1;
                            active[5]=1;
                            ends[5]=1;
                            tdone[5]=1;
                          }
                          else {
                            S80202=0;
                            if(!capLoaderStatus_in.isREQ()){//sysj\orchestrator.sysj line: 72, column: 4
                              capLoaderStatus_in.setACK(true);//sysj\orchestrator.sysj line: 72, column: 4
                              S80202=1;
                              if(capLoaderStatus_in.isREQ()){//sysj\orchestrator.sysj line: 72, column: 4
                                capLoaderStatus_in.setACK(false);//sysj\orchestrator.sysj line: 72, column: 4
                                ends[5]=2;
                                ;//sysj\orchestrator.sysj line: 72, column: 4
                                System.out.println("Orch: Received cap loader status");//sysj\orchestrator.sysj line: 73, column: 4
                                res_thread_5 = (String)(capLoaderStatus_in.getVal() == null ? null : ((String)capLoaderStatus_in.getVal()));//sysj\orchestrator.sysj line: 75, column: 4
                                recCapLoaderStatus_1.setPresent();//sysj\orchestrator.sysj line: 76, column: 4
                                currsigs.addElement(recCapLoaderStatus_1);
                                recCapLoaderStatus_1.setValue(res_thread_5);//sysj\orchestrator.sysj line: 76, column: 4
                                S80156=0;
                                active[5]=1;
                                ends[5]=1;
                                tdone[5]=1;
                              }
                              else {
                                active[5]=1;
                                ends[5]=1;
                                tdone[5]=1;
                              }
                            }
                            else {
                              active[5]=1;
                              ends[5]=1;
                              tdone[5]=1;
                            }
                          }
                        }
                        else {
                          active[5]=1;
                          ends[5]=1;
                          tdone[5]=1;
                        }
                      }
                      else {
                        active[5]=1;
                        ends[5]=1;
                        tdone[5]=1;
                      }
                      break;
                    
                    case 1 : 
                      if(!capLoaderReq_o.isACK()){//sysj\orchestrator.sysj line: 71, column: 4
                        capLoaderReq_o.setREQ(false);//sysj\orchestrator.sysj line: 71, column: 4
                        ends[5]=2;
                        ;//sysj\orchestrator.sysj line: 71, column: 4
                        S80156=2;
                        S80207=0;
                        if(!capLoaderStatus_in.isPartnerPresent() || capLoaderStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 72, column: 4
                          capLoaderStatus_in.setACK(false);//sysj\orchestrator.sysj line: 72, column: 4
                          S80207=1;
                          active[5]=1;
                          ends[5]=1;
                          tdone[5]=1;
                        }
                        else {
                          S80202=0;
                          if(!capLoaderStatus_in.isREQ()){//sysj\orchestrator.sysj line: 72, column: 4
                            capLoaderStatus_in.setACK(true);//sysj\orchestrator.sysj line: 72, column: 4
                            S80202=1;
                            if(capLoaderStatus_in.isREQ()){//sysj\orchestrator.sysj line: 72, column: 4
                              capLoaderStatus_in.setACK(false);//sysj\orchestrator.sysj line: 72, column: 4
                              ends[5]=2;
                              ;//sysj\orchestrator.sysj line: 72, column: 4
                              System.out.println("Orch: Received cap loader status");//sysj\orchestrator.sysj line: 73, column: 4
                              res_thread_5 = (String)(capLoaderStatus_in.getVal() == null ? null : ((String)capLoaderStatus_in.getVal()));//sysj\orchestrator.sysj line: 75, column: 4
                              recCapLoaderStatus_1.setPresent();//sysj\orchestrator.sysj line: 76, column: 4
                              currsigs.addElement(recCapLoaderStatus_1);
                              recCapLoaderStatus_1.setValue(res_thread_5);//sysj\orchestrator.sysj line: 76, column: 4
                              S80156=0;
                              active[5]=1;
                              ends[5]=1;
                              tdone[5]=1;
                            }
                            else {
                              active[5]=1;
                              ends[5]=1;
                              tdone[5]=1;
                            }
                          }
                          else {
                            active[5]=1;
                            ends[5]=1;
                            tdone[5]=1;
                          }
                        }
                      }
                      else {
                        active[5]=1;
                        ends[5]=1;
                        tdone[5]=1;
                      }
                      break;
                    
                  }
                }
                break;
              
              case 1 : 
                S80163=1;
                S80163=0;
                if(!capLoaderReq_o.isPartnerPresent() || capLoaderReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 71, column: 4
                  capLoaderReq_o.setREQ(false);//sysj\orchestrator.sysj line: 71, column: 4
                  S80163=1;
                  active[5]=1;
                  ends[5]=1;
                  tdone[5]=1;
                }
                else {
                  S80158=0;
                  if(capLoaderReq_o.isACK()){//sysj\orchestrator.sysj line: 71, column: 4
                    capLoaderReq_o.setVal(true);//sysj\orchestrator.sysj line: 71, column: 4
                    S80158=1;
                    if(!capLoaderReq_o.isACK()){//sysj\orchestrator.sysj line: 71, column: 4
                      capLoaderReq_o.setREQ(false);//sysj\orchestrator.sysj line: 71, column: 4
                      ends[5]=2;
                      ;//sysj\orchestrator.sysj line: 71, column: 4
                      S80156=2;
                      S80207=0;
                      if(!capLoaderStatus_in.isPartnerPresent() || capLoaderStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 72, column: 4
                        capLoaderStatus_in.setACK(false);//sysj\orchestrator.sysj line: 72, column: 4
                        S80207=1;
                        active[5]=1;
                        ends[5]=1;
                        tdone[5]=1;
                      }
                      else {
                        S80202=0;
                        if(!capLoaderStatus_in.isREQ()){//sysj\orchestrator.sysj line: 72, column: 4
                          capLoaderStatus_in.setACK(true);//sysj\orchestrator.sysj line: 72, column: 4
                          S80202=1;
                          if(capLoaderStatus_in.isREQ()){//sysj\orchestrator.sysj line: 72, column: 4
                            capLoaderStatus_in.setACK(false);//sysj\orchestrator.sysj line: 72, column: 4
                            ends[5]=2;
                            ;//sysj\orchestrator.sysj line: 72, column: 4
                            System.out.println("Orch: Received cap loader status");//sysj\orchestrator.sysj line: 73, column: 4
                            res_thread_5 = (String)(capLoaderStatus_in.getVal() == null ? null : ((String)capLoaderStatus_in.getVal()));//sysj\orchestrator.sysj line: 75, column: 4
                            recCapLoaderStatus_1.setPresent();//sysj\orchestrator.sysj line: 76, column: 4
                            currsigs.addElement(recCapLoaderStatus_1);
                            recCapLoaderStatus_1.setValue(res_thread_5);//sysj\orchestrator.sysj line: 76, column: 4
                            S80156=0;
                            active[5]=1;
                            ends[5]=1;
                            tdone[5]=1;
                          }
                          else {
                            active[5]=1;
                            ends[5]=1;
                            tdone[5]=1;
                          }
                        }
                        else {
                          active[5]=1;
                          ends[5]=1;
                          tdone[5]=1;
                        }
                      }
                    }
                    else {
                      active[5]=1;
                      ends[5]=1;
                      tdone[5]=1;
                    }
                  }
                  else {
                    active[5]=1;
                    ends[5]=1;
                    tdone[5]=1;
                  }
                }
                break;
              
            }
            break;
          
          case 2 : 
            switch(S80207){
              case 0 : 
                if(!capLoaderStatus_in.isPartnerPresent() || capLoaderStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 72, column: 4
                  capLoaderStatus_in.setACK(false);//sysj\orchestrator.sysj line: 72, column: 4
                  S80207=1;
                  active[5]=1;
                  ends[5]=1;
                  tdone[5]=1;
                }
                else {
                  switch(S80202){
                    case 0 : 
                      if(!capLoaderStatus_in.isREQ()){//sysj\orchestrator.sysj line: 72, column: 4
                        capLoaderStatus_in.setACK(true);//sysj\orchestrator.sysj line: 72, column: 4
                        S80202=1;
                        if(capLoaderStatus_in.isREQ()){//sysj\orchestrator.sysj line: 72, column: 4
                          capLoaderStatus_in.setACK(false);//sysj\orchestrator.sysj line: 72, column: 4
                          ends[5]=2;
                          ;//sysj\orchestrator.sysj line: 72, column: 4
                          System.out.println("Orch: Received cap loader status");//sysj\orchestrator.sysj line: 73, column: 4
                          res_thread_5 = (String)(capLoaderStatus_in.getVal() == null ? null : ((String)capLoaderStatus_in.getVal()));//sysj\orchestrator.sysj line: 75, column: 4
                          recCapLoaderStatus_1.setPresent();//sysj\orchestrator.sysj line: 76, column: 4
                          currsigs.addElement(recCapLoaderStatus_1);
                          recCapLoaderStatus_1.setValue(res_thread_5);//sysj\orchestrator.sysj line: 76, column: 4
                          S80156=0;
                          active[5]=1;
                          ends[5]=1;
                          tdone[5]=1;
                        }
                        else {
                          active[5]=1;
                          ends[5]=1;
                          tdone[5]=1;
                        }
                      }
                      else {
                        active[5]=1;
                        ends[5]=1;
                        tdone[5]=1;
                      }
                      break;
                    
                    case 1 : 
                      if(capLoaderStatus_in.isREQ()){//sysj\orchestrator.sysj line: 72, column: 4
                        capLoaderStatus_in.setACK(false);//sysj\orchestrator.sysj line: 72, column: 4
                        ends[5]=2;
                        ;//sysj\orchestrator.sysj line: 72, column: 4
                        System.out.println("Orch: Received cap loader status");//sysj\orchestrator.sysj line: 73, column: 4
                        res_thread_5 = (String)(capLoaderStatus_in.getVal() == null ? null : ((String)capLoaderStatus_in.getVal()));//sysj\orchestrator.sysj line: 75, column: 4
                        recCapLoaderStatus_1.setPresent();//sysj\orchestrator.sysj line: 76, column: 4
                        currsigs.addElement(recCapLoaderStatus_1);
                        recCapLoaderStatus_1.setValue(res_thread_5);//sysj\orchestrator.sysj line: 76, column: 4
                        S80156=0;
                        active[5]=1;
                        ends[5]=1;
                        tdone[5]=1;
                      }
                      else {
                        active[5]=1;
                        ends[5]=1;
                        tdone[5]=1;
                      }
                      break;
                    
                  }
                }
                break;
              
              case 1 : 
                S80207=1;
                S80207=0;
                if(!capLoaderStatus_in.isPartnerPresent() || capLoaderStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 72, column: 4
                  capLoaderStatus_in.setACK(false);//sysj\orchestrator.sysj line: 72, column: 4
                  S80207=1;
                  active[5]=1;
                  ends[5]=1;
                  tdone[5]=1;
                }
                else {
                  S80202=0;
                  if(!capLoaderStatus_in.isREQ()){//sysj\orchestrator.sysj line: 72, column: 4
                    capLoaderStatus_in.setACK(true);//sysj\orchestrator.sysj line: 72, column: 4
                    S80202=1;
                    if(capLoaderStatus_in.isREQ()){//sysj\orchestrator.sysj line: 72, column: 4
                      capLoaderStatus_in.setACK(false);//sysj\orchestrator.sysj line: 72, column: 4
                      ends[5]=2;
                      ;//sysj\orchestrator.sysj line: 72, column: 4
                      System.out.println("Orch: Received cap loader status");//sysj\orchestrator.sysj line: 73, column: 4
                      res_thread_5 = (String)(capLoaderStatus_in.getVal() == null ? null : ((String)capLoaderStatus_in.getVal()));//sysj\orchestrator.sysj line: 75, column: 4
                      recCapLoaderStatus_1.setPresent();//sysj\orchestrator.sysj line: 76, column: 4
                      currsigs.addElement(recCapLoaderStatus_1);
                      recCapLoaderStatus_1.setValue(res_thread_5);//sysj\orchestrator.sysj line: 76, column: 4
                      S80156=0;
                      active[5]=1;
                      ends[5]=1;
                      tdone[5]=1;
                    }
                    else {
                      active[5]=1;
                      ends[5]=1;
                      tdone[5]=1;
                    }
                  }
                  else {
                    active[5]=1;
                    ends[5]=1;
                    tdone[5]=1;
                  }
                }
                break;
              
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread83380(int [] tdone, int [] ends){
        switch(S80154){
      case 0 : 
        active[4]=0;
        ends[4]=0;
        tdone[4]=1;
        break;
      
      case 1 : 
        switch(S79216){
          case 0 : 
            if(sigCapperReq_1.getprestatus()){//sysj\orchestrator.sysj line: 57, column: 10
              System.out.println("Orch: Sending capper request");//sysj\orchestrator.sysj line: 58, column: 4
              S79216=1;
              S79223=0;
              if(!capperReq_o.isPartnerPresent() || capperReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 59, column: 4
                capperReq_o.setREQ(false);//sysj\orchestrator.sysj line: 59, column: 4
                S79223=1;
                active[4]=1;
                ends[4]=1;
                tdone[4]=1;
              }
              else {
                S79218=0;
                if(capperReq_o.isACK()){//sysj\orchestrator.sysj line: 59, column: 4
                  capperReq_o.setVal(true);//sysj\orchestrator.sysj line: 59, column: 4
                  S79218=1;
                  if(!capperReq_o.isACK()){//sysj\orchestrator.sysj line: 59, column: 4
                    capperReq_o.setREQ(false);//sysj\orchestrator.sysj line: 59, column: 4
                    ends[4]=2;
                    ;//sysj\orchestrator.sysj line: 59, column: 4
                    S79216=2;
                    S79267=0;
                    if(!capperStatus_in.isPartnerPresent() || capperStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 60, column: 4
                      capperStatus_in.setACK(false);//sysj\orchestrator.sysj line: 60, column: 4
                      S79267=1;
                      active[4]=1;
                      ends[4]=1;
                      tdone[4]=1;
                    }
                    else {
                      S79262=0;
                      if(!capperStatus_in.isREQ()){//sysj\orchestrator.sysj line: 60, column: 4
                        capperStatus_in.setACK(true);//sysj\orchestrator.sysj line: 60, column: 4
                        S79262=1;
                        if(capperStatus_in.isREQ()){//sysj\orchestrator.sysj line: 60, column: 4
                          capperStatus_in.setACK(false);//sysj\orchestrator.sysj line: 60, column: 4
                          ends[4]=2;
                          ;//sysj\orchestrator.sysj line: 60, column: 4
                          System.out.println("Orch: Received capper status");//sysj\orchestrator.sysj line: 61, column: 4
                          res_thread_4 = (String)(capperStatus_in.getVal() == null ? null : ((String)capperStatus_in.getVal()));//sysj\orchestrator.sysj line: 62, column: 4
                          recCapperStatus_1.setPresent();//sysj\orchestrator.sysj line: 63, column: 4
                          currsigs.addElement(recCapperStatus_1);
                          recCapperStatus_1.setValue(res_thread_4);//sysj\orchestrator.sysj line: 63, column: 4
                          S79216=0;
                          active[4]=1;
                          ends[4]=1;
                          tdone[4]=1;
                        }
                        else {
                          active[4]=1;
                          ends[4]=1;
                          tdone[4]=1;
                        }
                      }
                      else {
                        active[4]=1;
                        ends[4]=1;
                        tdone[4]=1;
                      }
                    }
                  }
                  else {
                    active[4]=1;
                    ends[4]=1;
                    tdone[4]=1;
                  }
                }
                else {
                  active[4]=1;
                  ends[4]=1;
                  tdone[4]=1;
                }
              }
            }
            else {
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            break;
          
          case 1 : 
            switch(S79223){
              case 0 : 
                if(!capperReq_o.isPartnerPresent() || capperReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 59, column: 4
                  capperReq_o.setREQ(false);//sysj\orchestrator.sysj line: 59, column: 4
                  S79223=1;
                  active[4]=1;
                  ends[4]=1;
                  tdone[4]=1;
                }
                else {
                  switch(S79218){
                    case 0 : 
                      if(capperReq_o.isACK()){//sysj\orchestrator.sysj line: 59, column: 4
                        capperReq_o.setVal(true);//sysj\orchestrator.sysj line: 59, column: 4
                        S79218=1;
                        if(!capperReq_o.isACK()){//sysj\orchestrator.sysj line: 59, column: 4
                          capperReq_o.setREQ(false);//sysj\orchestrator.sysj line: 59, column: 4
                          ends[4]=2;
                          ;//sysj\orchestrator.sysj line: 59, column: 4
                          S79216=2;
                          S79267=0;
                          if(!capperStatus_in.isPartnerPresent() || capperStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 60, column: 4
                            capperStatus_in.setACK(false);//sysj\orchestrator.sysj line: 60, column: 4
                            S79267=1;
                            active[4]=1;
                            ends[4]=1;
                            tdone[4]=1;
                          }
                          else {
                            S79262=0;
                            if(!capperStatus_in.isREQ()){//sysj\orchestrator.sysj line: 60, column: 4
                              capperStatus_in.setACK(true);//sysj\orchestrator.sysj line: 60, column: 4
                              S79262=1;
                              if(capperStatus_in.isREQ()){//sysj\orchestrator.sysj line: 60, column: 4
                                capperStatus_in.setACK(false);//sysj\orchestrator.sysj line: 60, column: 4
                                ends[4]=2;
                                ;//sysj\orchestrator.sysj line: 60, column: 4
                                System.out.println("Orch: Received capper status");//sysj\orchestrator.sysj line: 61, column: 4
                                res_thread_4 = (String)(capperStatus_in.getVal() == null ? null : ((String)capperStatus_in.getVal()));//sysj\orchestrator.sysj line: 62, column: 4
                                recCapperStatus_1.setPresent();//sysj\orchestrator.sysj line: 63, column: 4
                                currsigs.addElement(recCapperStatus_1);
                                recCapperStatus_1.setValue(res_thread_4);//sysj\orchestrator.sysj line: 63, column: 4
                                S79216=0;
                                active[4]=1;
                                ends[4]=1;
                                tdone[4]=1;
                              }
                              else {
                                active[4]=1;
                                ends[4]=1;
                                tdone[4]=1;
                              }
                            }
                            else {
                              active[4]=1;
                              ends[4]=1;
                              tdone[4]=1;
                            }
                          }
                        }
                        else {
                          active[4]=1;
                          ends[4]=1;
                          tdone[4]=1;
                        }
                      }
                      else {
                        active[4]=1;
                        ends[4]=1;
                        tdone[4]=1;
                      }
                      break;
                    
                    case 1 : 
                      if(!capperReq_o.isACK()){//sysj\orchestrator.sysj line: 59, column: 4
                        capperReq_o.setREQ(false);//sysj\orchestrator.sysj line: 59, column: 4
                        ends[4]=2;
                        ;//sysj\orchestrator.sysj line: 59, column: 4
                        S79216=2;
                        S79267=0;
                        if(!capperStatus_in.isPartnerPresent() || capperStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 60, column: 4
                          capperStatus_in.setACK(false);//sysj\orchestrator.sysj line: 60, column: 4
                          S79267=1;
                          active[4]=1;
                          ends[4]=1;
                          tdone[4]=1;
                        }
                        else {
                          S79262=0;
                          if(!capperStatus_in.isREQ()){//sysj\orchestrator.sysj line: 60, column: 4
                            capperStatus_in.setACK(true);//sysj\orchestrator.sysj line: 60, column: 4
                            S79262=1;
                            if(capperStatus_in.isREQ()){//sysj\orchestrator.sysj line: 60, column: 4
                              capperStatus_in.setACK(false);//sysj\orchestrator.sysj line: 60, column: 4
                              ends[4]=2;
                              ;//sysj\orchestrator.sysj line: 60, column: 4
                              System.out.println("Orch: Received capper status");//sysj\orchestrator.sysj line: 61, column: 4
                              res_thread_4 = (String)(capperStatus_in.getVal() == null ? null : ((String)capperStatus_in.getVal()));//sysj\orchestrator.sysj line: 62, column: 4
                              recCapperStatus_1.setPresent();//sysj\orchestrator.sysj line: 63, column: 4
                              currsigs.addElement(recCapperStatus_1);
                              recCapperStatus_1.setValue(res_thread_4);//sysj\orchestrator.sysj line: 63, column: 4
                              S79216=0;
                              active[4]=1;
                              ends[4]=1;
                              tdone[4]=1;
                            }
                            else {
                              active[4]=1;
                              ends[4]=1;
                              tdone[4]=1;
                            }
                          }
                          else {
                            active[4]=1;
                            ends[4]=1;
                            tdone[4]=1;
                          }
                        }
                      }
                      else {
                        active[4]=1;
                        ends[4]=1;
                        tdone[4]=1;
                      }
                      break;
                    
                  }
                }
                break;
              
              case 1 : 
                S79223=1;
                S79223=0;
                if(!capperReq_o.isPartnerPresent() || capperReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 59, column: 4
                  capperReq_o.setREQ(false);//sysj\orchestrator.sysj line: 59, column: 4
                  S79223=1;
                  active[4]=1;
                  ends[4]=1;
                  tdone[4]=1;
                }
                else {
                  S79218=0;
                  if(capperReq_o.isACK()){//sysj\orchestrator.sysj line: 59, column: 4
                    capperReq_o.setVal(true);//sysj\orchestrator.sysj line: 59, column: 4
                    S79218=1;
                    if(!capperReq_o.isACK()){//sysj\orchestrator.sysj line: 59, column: 4
                      capperReq_o.setREQ(false);//sysj\orchestrator.sysj line: 59, column: 4
                      ends[4]=2;
                      ;//sysj\orchestrator.sysj line: 59, column: 4
                      S79216=2;
                      S79267=0;
                      if(!capperStatus_in.isPartnerPresent() || capperStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 60, column: 4
                        capperStatus_in.setACK(false);//sysj\orchestrator.sysj line: 60, column: 4
                        S79267=1;
                        active[4]=1;
                        ends[4]=1;
                        tdone[4]=1;
                      }
                      else {
                        S79262=0;
                        if(!capperStatus_in.isREQ()){//sysj\orchestrator.sysj line: 60, column: 4
                          capperStatus_in.setACK(true);//sysj\orchestrator.sysj line: 60, column: 4
                          S79262=1;
                          if(capperStatus_in.isREQ()){//sysj\orchestrator.sysj line: 60, column: 4
                            capperStatus_in.setACK(false);//sysj\orchestrator.sysj line: 60, column: 4
                            ends[4]=2;
                            ;//sysj\orchestrator.sysj line: 60, column: 4
                            System.out.println("Orch: Received capper status");//sysj\orchestrator.sysj line: 61, column: 4
                            res_thread_4 = (String)(capperStatus_in.getVal() == null ? null : ((String)capperStatus_in.getVal()));//sysj\orchestrator.sysj line: 62, column: 4
                            recCapperStatus_1.setPresent();//sysj\orchestrator.sysj line: 63, column: 4
                            currsigs.addElement(recCapperStatus_1);
                            recCapperStatus_1.setValue(res_thread_4);//sysj\orchestrator.sysj line: 63, column: 4
                            S79216=0;
                            active[4]=1;
                            ends[4]=1;
                            tdone[4]=1;
                          }
                          else {
                            active[4]=1;
                            ends[4]=1;
                            tdone[4]=1;
                          }
                        }
                        else {
                          active[4]=1;
                          ends[4]=1;
                          tdone[4]=1;
                        }
                      }
                    }
                    else {
                      active[4]=1;
                      ends[4]=1;
                      tdone[4]=1;
                    }
                  }
                  else {
                    active[4]=1;
                    ends[4]=1;
                    tdone[4]=1;
                  }
                }
                break;
              
            }
            break;
          
          case 2 : 
            switch(S79267){
              case 0 : 
                if(!capperStatus_in.isPartnerPresent() || capperStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 60, column: 4
                  capperStatus_in.setACK(false);//sysj\orchestrator.sysj line: 60, column: 4
                  S79267=1;
                  active[4]=1;
                  ends[4]=1;
                  tdone[4]=1;
                }
                else {
                  switch(S79262){
                    case 0 : 
                      if(!capperStatus_in.isREQ()){//sysj\orchestrator.sysj line: 60, column: 4
                        capperStatus_in.setACK(true);//sysj\orchestrator.sysj line: 60, column: 4
                        S79262=1;
                        if(capperStatus_in.isREQ()){//sysj\orchestrator.sysj line: 60, column: 4
                          capperStatus_in.setACK(false);//sysj\orchestrator.sysj line: 60, column: 4
                          ends[4]=2;
                          ;//sysj\orchestrator.sysj line: 60, column: 4
                          System.out.println("Orch: Received capper status");//sysj\orchestrator.sysj line: 61, column: 4
                          res_thread_4 = (String)(capperStatus_in.getVal() == null ? null : ((String)capperStatus_in.getVal()));//sysj\orchestrator.sysj line: 62, column: 4
                          recCapperStatus_1.setPresent();//sysj\orchestrator.sysj line: 63, column: 4
                          currsigs.addElement(recCapperStatus_1);
                          recCapperStatus_1.setValue(res_thread_4);//sysj\orchestrator.sysj line: 63, column: 4
                          S79216=0;
                          active[4]=1;
                          ends[4]=1;
                          tdone[4]=1;
                        }
                        else {
                          active[4]=1;
                          ends[4]=1;
                          tdone[4]=1;
                        }
                      }
                      else {
                        active[4]=1;
                        ends[4]=1;
                        tdone[4]=1;
                      }
                      break;
                    
                    case 1 : 
                      if(capperStatus_in.isREQ()){//sysj\orchestrator.sysj line: 60, column: 4
                        capperStatus_in.setACK(false);//sysj\orchestrator.sysj line: 60, column: 4
                        ends[4]=2;
                        ;//sysj\orchestrator.sysj line: 60, column: 4
                        System.out.println("Orch: Received capper status");//sysj\orchestrator.sysj line: 61, column: 4
                        res_thread_4 = (String)(capperStatus_in.getVal() == null ? null : ((String)capperStatus_in.getVal()));//sysj\orchestrator.sysj line: 62, column: 4
                        recCapperStatus_1.setPresent();//sysj\orchestrator.sysj line: 63, column: 4
                        currsigs.addElement(recCapperStatus_1);
                        recCapperStatus_1.setValue(res_thread_4);//sysj\orchestrator.sysj line: 63, column: 4
                        S79216=0;
                        active[4]=1;
                        ends[4]=1;
                        tdone[4]=1;
                      }
                      else {
                        active[4]=1;
                        ends[4]=1;
                        tdone[4]=1;
                      }
                      break;
                    
                  }
                }
                break;
              
              case 1 : 
                S79267=1;
                S79267=0;
                if(!capperStatus_in.isPartnerPresent() || capperStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 60, column: 4
                  capperStatus_in.setACK(false);//sysj\orchestrator.sysj line: 60, column: 4
                  S79267=1;
                  active[4]=1;
                  ends[4]=1;
                  tdone[4]=1;
                }
                else {
                  S79262=0;
                  if(!capperStatus_in.isREQ()){//sysj\orchestrator.sysj line: 60, column: 4
                    capperStatus_in.setACK(true);//sysj\orchestrator.sysj line: 60, column: 4
                    S79262=1;
                    if(capperStatus_in.isREQ()){//sysj\orchestrator.sysj line: 60, column: 4
                      capperStatus_in.setACK(false);//sysj\orchestrator.sysj line: 60, column: 4
                      ends[4]=2;
                      ;//sysj\orchestrator.sysj line: 60, column: 4
                      System.out.println("Orch: Received capper status");//sysj\orchestrator.sysj line: 61, column: 4
                      res_thread_4 = (String)(capperStatus_in.getVal() == null ? null : ((String)capperStatus_in.getVal()));//sysj\orchestrator.sysj line: 62, column: 4
                      recCapperStatus_1.setPresent();//sysj\orchestrator.sysj line: 63, column: 4
                      currsigs.addElement(recCapperStatus_1);
                      recCapperStatus_1.setValue(res_thread_4);//sysj\orchestrator.sysj line: 63, column: 4
                      S79216=0;
                      active[4]=1;
                      ends[4]=1;
                      tdone[4]=1;
                    }
                    else {
                      active[4]=1;
                      ends[4]=1;
                      tdone[4]=1;
                    }
                  }
                  else {
                    active[4]=1;
                    ends[4]=1;
                    tdone[4]=1;
                  }
                }
                break;
              
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread83379(int [] tdone, int [] ends){
        switch(S79214){
      case 0 : 
        active[3]=0;
        ends[3]=0;
        tdone[3]=1;
        break;
      
      case 1 : 
        switch(S78320){
          case 0 : 
            if(sigConveyorReq_1.getprestatus()){//sysj\orchestrator.sysj line: 47, column: 10
              S78320=1;
              S78282=0;
              if(!conveyorReq_o.isPartnerPresent() || conveyorReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 48, column: 4
                conveyorReq_o.setREQ(false);//sysj\orchestrator.sysj line: 48, column: 4
                S78282=1;
                active[3]=1;
                ends[3]=1;
                tdone[3]=1;
              }
              else {
                S78277=0;
                if(conveyorReq_o.isACK()){//sysj\orchestrator.sysj line: 48, column: 4
                  conveyorReq_o.setVal(true);//sysj\orchestrator.sysj line: 48, column: 4
                  S78277=1;
                  if(!conveyorReq_o.isACK()){//sysj\orchestrator.sysj line: 48, column: 4
                    conveyorReq_o.setREQ(false);//sysj\orchestrator.sysj line: 48, column: 4
                    ends[3]=2;
                    ;//sysj\orchestrator.sysj line: 48, column: 4
                    S78320=2;
                    S78327=0;
                    if(!conveyorStatus_in.isPartnerPresent() || conveyorStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 49, column: 4
                      conveyorStatus_in.setACK(false);//sysj\orchestrator.sysj line: 49, column: 4
                      S78327=1;
                      active[3]=1;
                      ends[3]=1;
                      tdone[3]=1;
                    }
                    else {
                      S78322=0;
                      if(!conveyorStatus_in.isREQ()){//sysj\orchestrator.sysj line: 49, column: 4
                        conveyorStatus_in.setACK(true);//sysj\orchestrator.sysj line: 49, column: 4
                        S78322=1;
                        if(conveyorStatus_in.isREQ()){//sysj\orchestrator.sysj line: 49, column: 4
                          conveyorStatus_in.setACK(false);//sysj\orchestrator.sysj line: 49, column: 4
                          ends[3]=2;
                          ;//sysj\orchestrator.sysj line: 49, column: 4
                          res_thread_3 = (String)(conveyorStatus_in.getVal() == null ? null : ((String)conveyorStatus_in.getVal()));//sysj\orchestrator.sysj line: 50, column: 4
                          recConveyorStatus_1.setPresent();//sysj\orchestrator.sysj line: 51, column: 4
                          currsigs.addElement(recConveyorStatus_1);
                          recConveyorStatus_1.setValue(res_thread_3);//sysj\orchestrator.sysj line: 51, column: 4
                          S78320=0;
                          active[3]=1;
                          ends[3]=1;
                          tdone[3]=1;
                        }
                        else {
                          active[3]=1;
                          ends[3]=1;
                          tdone[3]=1;
                        }
                      }
                      else {
                        active[3]=1;
                        ends[3]=1;
                        tdone[3]=1;
                      }
                    }
                  }
                  else {
                    active[3]=1;
                    ends[3]=1;
                    tdone[3]=1;
                  }
                }
                else {
                  active[3]=1;
                  ends[3]=1;
                  tdone[3]=1;
                }
              }
            }
            else {
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            break;
          
          case 1 : 
            switch(S78282){
              case 0 : 
                if(!conveyorReq_o.isPartnerPresent() || conveyorReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 48, column: 4
                  conveyorReq_o.setREQ(false);//sysj\orchestrator.sysj line: 48, column: 4
                  S78282=1;
                  active[3]=1;
                  ends[3]=1;
                  tdone[3]=1;
                }
                else {
                  switch(S78277){
                    case 0 : 
                      if(conveyorReq_o.isACK()){//sysj\orchestrator.sysj line: 48, column: 4
                        conveyorReq_o.setVal(true);//sysj\orchestrator.sysj line: 48, column: 4
                        S78277=1;
                        if(!conveyorReq_o.isACK()){//sysj\orchestrator.sysj line: 48, column: 4
                          conveyorReq_o.setREQ(false);//sysj\orchestrator.sysj line: 48, column: 4
                          ends[3]=2;
                          ;//sysj\orchestrator.sysj line: 48, column: 4
                          S78320=2;
                          S78327=0;
                          if(!conveyorStatus_in.isPartnerPresent() || conveyorStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 49, column: 4
                            conveyorStatus_in.setACK(false);//sysj\orchestrator.sysj line: 49, column: 4
                            S78327=1;
                            active[3]=1;
                            ends[3]=1;
                            tdone[3]=1;
                          }
                          else {
                            S78322=0;
                            if(!conveyorStatus_in.isREQ()){//sysj\orchestrator.sysj line: 49, column: 4
                              conveyorStatus_in.setACK(true);//sysj\orchestrator.sysj line: 49, column: 4
                              S78322=1;
                              if(conveyorStatus_in.isREQ()){//sysj\orchestrator.sysj line: 49, column: 4
                                conveyorStatus_in.setACK(false);//sysj\orchestrator.sysj line: 49, column: 4
                                ends[3]=2;
                                ;//sysj\orchestrator.sysj line: 49, column: 4
                                res_thread_3 = (String)(conveyorStatus_in.getVal() == null ? null : ((String)conveyorStatus_in.getVal()));//sysj\orchestrator.sysj line: 50, column: 4
                                recConveyorStatus_1.setPresent();//sysj\orchestrator.sysj line: 51, column: 4
                                currsigs.addElement(recConveyorStatus_1);
                                recConveyorStatus_1.setValue(res_thread_3);//sysj\orchestrator.sysj line: 51, column: 4
                                S78320=0;
                                active[3]=1;
                                ends[3]=1;
                                tdone[3]=1;
                              }
                              else {
                                active[3]=1;
                                ends[3]=1;
                                tdone[3]=1;
                              }
                            }
                            else {
                              active[3]=1;
                              ends[3]=1;
                              tdone[3]=1;
                            }
                          }
                        }
                        else {
                          active[3]=1;
                          ends[3]=1;
                          tdone[3]=1;
                        }
                      }
                      else {
                        active[3]=1;
                        ends[3]=1;
                        tdone[3]=1;
                      }
                      break;
                    
                    case 1 : 
                      if(!conveyorReq_o.isACK()){//sysj\orchestrator.sysj line: 48, column: 4
                        conveyorReq_o.setREQ(false);//sysj\orchestrator.sysj line: 48, column: 4
                        ends[3]=2;
                        ;//sysj\orchestrator.sysj line: 48, column: 4
                        S78320=2;
                        S78327=0;
                        if(!conveyorStatus_in.isPartnerPresent() || conveyorStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 49, column: 4
                          conveyorStatus_in.setACK(false);//sysj\orchestrator.sysj line: 49, column: 4
                          S78327=1;
                          active[3]=1;
                          ends[3]=1;
                          tdone[3]=1;
                        }
                        else {
                          S78322=0;
                          if(!conveyorStatus_in.isREQ()){//sysj\orchestrator.sysj line: 49, column: 4
                            conveyorStatus_in.setACK(true);//sysj\orchestrator.sysj line: 49, column: 4
                            S78322=1;
                            if(conveyorStatus_in.isREQ()){//sysj\orchestrator.sysj line: 49, column: 4
                              conveyorStatus_in.setACK(false);//sysj\orchestrator.sysj line: 49, column: 4
                              ends[3]=2;
                              ;//sysj\orchestrator.sysj line: 49, column: 4
                              res_thread_3 = (String)(conveyorStatus_in.getVal() == null ? null : ((String)conveyorStatus_in.getVal()));//sysj\orchestrator.sysj line: 50, column: 4
                              recConveyorStatus_1.setPresent();//sysj\orchestrator.sysj line: 51, column: 4
                              currsigs.addElement(recConveyorStatus_1);
                              recConveyorStatus_1.setValue(res_thread_3);//sysj\orchestrator.sysj line: 51, column: 4
                              S78320=0;
                              active[3]=1;
                              ends[3]=1;
                              tdone[3]=1;
                            }
                            else {
                              active[3]=1;
                              ends[3]=1;
                              tdone[3]=1;
                            }
                          }
                          else {
                            active[3]=1;
                            ends[3]=1;
                            tdone[3]=1;
                          }
                        }
                      }
                      else {
                        active[3]=1;
                        ends[3]=1;
                        tdone[3]=1;
                      }
                      break;
                    
                  }
                }
                break;
              
              case 1 : 
                S78282=1;
                S78282=0;
                if(!conveyorReq_o.isPartnerPresent() || conveyorReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 48, column: 4
                  conveyorReq_o.setREQ(false);//sysj\orchestrator.sysj line: 48, column: 4
                  S78282=1;
                  active[3]=1;
                  ends[3]=1;
                  tdone[3]=1;
                }
                else {
                  S78277=0;
                  if(conveyorReq_o.isACK()){//sysj\orchestrator.sysj line: 48, column: 4
                    conveyorReq_o.setVal(true);//sysj\orchestrator.sysj line: 48, column: 4
                    S78277=1;
                    if(!conveyorReq_o.isACK()){//sysj\orchestrator.sysj line: 48, column: 4
                      conveyorReq_o.setREQ(false);//sysj\orchestrator.sysj line: 48, column: 4
                      ends[3]=2;
                      ;//sysj\orchestrator.sysj line: 48, column: 4
                      S78320=2;
                      S78327=0;
                      if(!conveyorStatus_in.isPartnerPresent() || conveyorStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 49, column: 4
                        conveyorStatus_in.setACK(false);//sysj\orchestrator.sysj line: 49, column: 4
                        S78327=1;
                        active[3]=1;
                        ends[3]=1;
                        tdone[3]=1;
                      }
                      else {
                        S78322=0;
                        if(!conveyorStatus_in.isREQ()){//sysj\orchestrator.sysj line: 49, column: 4
                          conveyorStatus_in.setACK(true);//sysj\orchestrator.sysj line: 49, column: 4
                          S78322=1;
                          if(conveyorStatus_in.isREQ()){//sysj\orchestrator.sysj line: 49, column: 4
                            conveyorStatus_in.setACK(false);//sysj\orchestrator.sysj line: 49, column: 4
                            ends[3]=2;
                            ;//sysj\orchestrator.sysj line: 49, column: 4
                            res_thread_3 = (String)(conveyorStatus_in.getVal() == null ? null : ((String)conveyorStatus_in.getVal()));//sysj\orchestrator.sysj line: 50, column: 4
                            recConveyorStatus_1.setPresent();//sysj\orchestrator.sysj line: 51, column: 4
                            currsigs.addElement(recConveyorStatus_1);
                            recConveyorStatus_1.setValue(res_thread_3);//sysj\orchestrator.sysj line: 51, column: 4
                            S78320=0;
                            active[3]=1;
                            ends[3]=1;
                            tdone[3]=1;
                          }
                          else {
                            active[3]=1;
                            ends[3]=1;
                            tdone[3]=1;
                          }
                        }
                        else {
                          active[3]=1;
                          ends[3]=1;
                          tdone[3]=1;
                        }
                      }
                    }
                    else {
                      active[3]=1;
                      ends[3]=1;
                      tdone[3]=1;
                    }
                  }
                  else {
                    active[3]=1;
                    ends[3]=1;
                    tdone[3]=1;
                  }
                }
                break;
              
            }
            break;
          
          case 2 : 
            switch(S78327){
              case 0 : 
                if(!conveyorStatus_in.isPartnerPresent() || conveyorStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 49, column: 4
                  conveyorStatus_in.setACK(false);//sysj\orchestrator.sysj line: 49, column: 4
                  S78327=1;
                  active[3]=1;
                  ends[3]=1;
                  tdone[3]=1;
                }
                else {
                  switch(S78322){
                    case 0 : 
                      if(!conveyorStatus_in.isREQ()){//sysj\orchestrator.sysj line: 49, column: 4
                        conveyorStatus_in.setACK(true);//sysj\orchestrator.sysj line: 49, column: 4
                        S78322=1;
                        if(conveyorStatus_in.isREQ()){//sysj\orchestrator.sysj line: 49, column: 4
                          conveyorStatus_in.setACK(false);//sysj\orchestrator.sysj line: 49, column: 4
                          ends[3]=2;
                          ;//sysj\orchestrator.sysj line: 49, column: 4
                          res_thread_3 = (String)(conveyorStatus_in.getVal() == null ? null : ((String)conveyorStatus_in.getVal()));//sysj\orchestrator.sysj line: 50, column: 4
                          recConveyorStatus_1.setPresent();//sysj\orchestrator.sysj line: 51, column: 4
                          currsigs.addElement(recConveyorStatus_1);
                          recConveyorStatus_1.setValue(res_thread_3);//sysj\orchestrator.sysj line: 51, column: 4
                          S78320=0;
                          active[3]=1;
                          ends[3]=1;
                          tdone[3]=1;
                        }
                        else {
                          active[3]=1;
                          ends[3]=1;
                          tdone[3]=1;
                        }
                      }
                      else {
                        active[3]=1;
                        ends[3]=1;
                        tdone[3]=1;
                      }
                      break;
                    
                    case 1 : 
                      if(conveyorStatus_in.isREQ()){//sysj\orchestrator.sysj line: 49, column: 4
                        conveyorStatus_in.setACK(false);//sysj\orchestrator.sysj line: 49, column: 4
                        ends[3]=2;
                        ;//sysj\orchestrator.sysj line: 49, column: 4
                        res_thread_3 = (String)(conveyorStatus_in.getVal() == null ? null : ((String)conveyorStatus_in.getVal()));//sysj\orchestrator.sysj line: 50, column: 4
                        recConveyorStatus_1.setPresent();//sysj\orchestrator.sysj line: 51, column: 4
                        currsigs.addElement(recConveyorStatus_1);
                        recConveyorStatus_1.setValue(res_thread_3);//sysj\orchestrator.sysj line: 51, column: 4
                        S78320=0;
                        active[3]=1;
                        ends[3]=1;
                        tdone[3]=1;
                      }
                      else {
                        active[3]=1;
                        ends[3]=1;
                        tdone[3]=1;
                      }
                      break;
                    
                  }
                }
                break;
              
              case 1 : 
                S78327=1;
                S78327=0;
                if(!conveyorStatus_in.isPartnerPresent() || conveyorStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 49, column: 4
                  conveyorStatus_in.setACK(false);//sysj\orchestrator.sysj line: 49, column: 4
                  S78327=1;
                  active[3]=1;
                  ends[3]=1;
                  tdone[3]=1;
                }
                else {
                  S78322=0;
                  if(!conveyorStatus_in.isREQ()){//sysj\orchestrator.sysj line: 49, column: 4
                    conveyorStatus_in.setACK(true);//sysj\orchestrator.sysj line: 49, column: 4
                    S78322=1;
                    if(conveyorStatus_in.isREQ()){//sysj\orchestrator.sysj line: 49, column: 4
                      conveyorStatus_in.setACK(false);//sysj\orchestrator.sysj line: 49, column: 4
                      ends[3]=2;
                      ;//sysj\orchestrator.sysj line: 49, column: 4
                      res_thread_3 = (String)(conveyorStatus_in.getVal() == null ? null : ((String)conveyorStatus_in.getVal()));//sysj\orchestrator.sysj line: 50, column: 4
                      recConveyorStatus_1.setPresent();//sysj\orchestrator.sysj line: 51, column: 4
                      currsigs.addElement(recConveyorStatus_1);
                      recConveyorStatus_1.setValue(res_thread_3);//sysj\orchestrator.sysj line: 51, column: 4
                      S78320=0;
                      active[3]=1;
                      ends[3]=1;
                      tdone[3]=1;
                    }
                    else {
                      active[3]=1;
                      ends[3]=1;
                      tdone[3]=1;
                    }
                  }
                  else {
                    active[3]=1;
                    ends[3]=1;
                    tdone[3]=1;
                  }
                }
                break;
              
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread83378(int [] tdone, int [] ends){
        switch(S78274){
      case 0 : 
        active[2]=0;
        ends[2]=0;
        tdone[2]=1;
        break;
      
      case 1 : 
        switch(S78078){
          case 0 : 
            switch(S78040){
              case 0 : 
                if(recConveyorStatus_1.getprestatus()){//sysj\orchestrator.sysj line: 31, column: 11
                  System.out.println("Orch: Received conveyor status");//sysj\orchestrator.sysj line: 32, column: 5
                  bottlePlaced_thread_2 = bottlePlaced_thread_2 - 1;//sysj\orchestrator.sysj line: 33, column: 5
                  S78040=1;
                  active[2]=1;
                  ends[2]=1;
                  tdone[2]=1;
                }
                else {
                  active[2]=1;
                  ends[2]=1;
                  tdone[2]=1;
                }
                break;
              
              case 1 : 
                if(getNextBottle_1.getprestatus()){//sysj\orchestrator.sysj line: 34, column: 11
                  System.out.println("Orch: Number of bottles left to do: " + bottlePlaced_thread_2);//sysj\orchestrator.sysj line: 35, column: 5
                  S78040=2;
                  active[2]=1;
                  ends[2]=1;
                  tdone[2]=1;
                }
                else {
                  active[2]=1;
                  ends[2]=1;
                  tdone[2]=1;
                }
                break;
              
              case 2 : 
                S78040=2;
                if(bottlePlaced_thread_2 >= 0){//sysj\orchestrator.sysj line: 28, column: 10
                  System.out.println("Orch: Sending conveyor request");//sysj\orchestrator.sysj line: 29, column: 5
                  sigConveyorReq_1.setPresent();//sysj\orchestrator.sysj line: 30, column: 5
                  currsigs.addElement(sigConveyorReq_1);
                  sigConveyorReq_1.setValue(true);//sysj\orchestrator.sysj line: 30, column: 5
                  S78040=0;
                  active[2]=1;
                  ends[2]=1;
                  tdone[2]=1;
                }
                else {
                  ends[2]=2;
                  ;//sysj\orchestrator.sysj line: 28, column: 4
                  System.out.println("Done order");//sysj\orchestrator.sysj line: 39, column: 4
                  S78078=1;
                  active[2]=1;
                  ends[2]=1;
                  tdone[2]=1;
                }
                break;
              
            }
            break;
          
          case 1 : 
            active[2]=1;
            ends[2]=1;
            tdone[2]=1;
            break;
          
          case 2 : 
            S78078=2;
            bottlePlaced_thread_2 = quantity_thread_2;//sysj\orchestrator.sysj line: 27, column: 4
            S78078=0;
            if(bottlePlaced_thread_2 >= 0){//sysj\orchestrator.sysj line: 28, column: 10
              System.out.println("Orch: Sending conveyor request");//sysj\orchestrator.sysj line: 29, column: 5
              sigConveyorReq_1.setPresent();//sysj\orchestrator.sysj line: 30, column: 5
              currsigs.addElement(sigConveyorReq_1);
              sigConveyorReq_1.setValue(true);//sysj\orchestrator.sysj line: 30, column: 5
              S78040=0;
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            else {
              ends[2]=2;
              ;//sysj\orchestrator.sysj line: 28, column: 4
              System.out.println("Done order");//sysj\orchestrator.sysj line: 39, column: 4
              S78078=1;
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread83376(int [] tdone, int [] ends){
        S83366=1;
    S82976=0;
    active[8]=1;
    ends[8]=1;
    tdone[8]=1;
  }

  public void thread83375(int [] tdone, int [] ends){
        S82974=1;
    S82036=0;
    active[7]=1;
    ends[7]=1;
    tdone[7]=1;
  }

  public void thread83374(int [] tdone, int [] ends){
        S82034=1;
    S81096=0;
    active[6]=1;
    ends[6]=1;
    tdone[6]=1;
  }

  public void thread83373(int [] tdone, int [] ends){
        S81094=1;
    S80156=0;
    active[5]=1;
    ends[5]=1;
    tdone[5]=1;
  }

  public void thread83372(int [] tdone, int [] ends){
        S80154=1;
    S79216=0;
    active[4]=1;
    ends[4]=1;
    tdone[4]=1;
  }

  public void thread83371(int [] tdone, int [] ends){
        S79214=1;
    S78320=0;
    active[3]=1;
    ends[3]=1;
    tdone[3]=1;
  }

  public void thread83370(int [] tdone, int [] ends){
        S78274=1;
    quantity_thread_2 = 5;//sysj\orchestrator.sysj line: 17, column: 3
    bottlePlaced_thread_2 = 0;//sysj\orchestrator.sysj line: 18, column: 3
    liquidPercent_thread_2 = new ArrayList();//sysj\orchestrator.sysj line: 19, column: 3
    liquidPercent_thread_2.add(10);//sysj\orchestrator.sysj line: 20, column: 3
    liquidPercent_thread_2.add(10);//sysj\orchestrator.sysj line: 21, column: 3
    liquidPercent_thread_2.add(20);//sysj\orchestrator.sysj line: 22, column: 3
    liquidPercent_thread_2.add(60);//sysj\orchestrator.sysj line: 23, column: 3
    bottlePlaced_thread_2 = quantity_thread_2;//sysj\orchestrator.sysj line: 27, column: 4
    S78078=0;
    if(bottlePlaced_thread_2 >= 0){//sysj\orchestrator.sysj line: 28, column: 10
      System.out.println("Orch: Sending conveyor request");//sysj\orchestrator.sysj line: 29, column: 5
      sigConveyorReq_1.setPresent();//sysj\orchestrator.sysj line: 30, column: 5
      currsigs.addElement(sigConveyorReq_1);
      sigConveyorReq_1.setValue(true);//sysj\orchestrator.sysj line: 30, column: 5
      S78040=0;
      active[2]=1;
      ends[2]=1;
      tdone[2]=1;
    }
    else {
      ends[2]=2;
      ;//sysj\orchestrator.sysj line: 28, column: 4
      System.out.println("Done order");//sysj\orchestrator.sysj line: 39, column: 4
      S78078=1;
      active[2]=1;
      ends[2]=1;
      tdone[2]=1;
    }
  }

  public void runClockDomain(){
    for(int i=0;i<ends.length;i++){
      ends[i] = 0;
      tdone[i] = 0;
    }
    
    RUN: while(true){
      switch(S83368){
        case 0 : 
          S83368=0;
          break RUN;
        
        case 1 : 
          S83368=2;
          S83368=2;
          sigConveyorReq_1.setClear();//sysj\orchestrator.sysj line: 12, column: 2
          sigCapperReq_1.setClear();//sysj\orchestrator.sysj line: 12, column: 2
          sigCapLoaderReq_1.setClear();//sysj\orchestrator.sysj line: 12, column: 2
          sigFillerReq_1.setClear();//sysj\orchestrator.sysj line: 12, column: 2
          sigRotaryReq_1.setClear();//sysj\orchestrator.sysj line: 12, column: 2
          recConveyorStatus_1.setClear();//sysj\orchestrator.sysj line: 13, column: 2
          recCapperStatus_1.setClear();//sysj\orchestrator.sysj line: 13, column: 2
          recCapLoaderStatus_1.setClear();//sysj\orchestrator.sysj line: 13, column: 2
          recFillerStatus_1.setClear();//sysj\orchestrator.sysj line: 13, column: 2
          recRotaryStatus_1.setClear();//sysj\orchestrator.sysj line: 13, column: 2
          getNextBottle_1.setClear();//sysj\orchestrator.sysj line: 14, column: 2
          thread83370(tdone,ends);
          thread83371(tdone,ends);
          thread83372(tdone,ends);
          thread83373(tdone,ends);
          thread83374(tdone,ends);
          thread83375(tdone,ends);
          thread83376(tdone,ends);
          int biggest83377 = 0;
          if(ends[2]>=biggest83377){
            biggest83377=ends[2];
          }
          if(ends[3]>=biggest83377){
            biggest83377=ends[3];
          }
          if(ends[4]>=biggest83377){
            biggest83377=ends[4];
          }
          if(ends[5]>=biggest83377){
            biggest83377=ends[5];
          }
          if(ends[6]>=biggest83377){
            biggest83377=ends[6];
          }
          if(ends[7]>=biggest83377){
            biggest83377=ends[7];
          }
          if(ends[8]>=biggest83377){
            biggest83377=ends[8];
          }
          if(biggest83377 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
        
        case 2 : 
          sigConveyorReq_1.setClear();//sysj\orchestrator.sysj line: 12, column: 2
          sigCapperReq_1.setClear();//sysj\orchestrator.sysj line: 12, column: 2
          sigCapLoaderReq_1.setClear();//sysj\orchestrator.sysj line: 12, column: 2
          sigFillerReq_1.setClear();//sysj\orchestrator.sysj line: 12, column: 2
          sigRotaryReq_1.setClear();//sysj\orchestrator.sysj line: 12, column: 2
          recConveyorStatus_1.setClear();//sysj\orchestrator.sysj line: 13, column: 2
          recCapperStatus_1.setClear();//sysj\orchestrator.sysj line: 13, column: 2
          recCapLoaderStatus_1.setClear();//sysj\orchestrator.sysj line: 13, column: 2
          recFillerStatus_1.setClear();//sysj\orchestrator.sysj line: 13, column: 2
          recRotaryStatus_1.setClear();//sysj\orchestrator.sysj line: 13, column: 2
          getNextBottle_1.setClear();//sysj\orchestrator.sysj line: 14, column: 2
          thread83378(tdone,ends);
          thread83379(tdone,ends);
          thread83380(tdone,ends);
          thread83381(tdone,ends);
          thread83382(tdone,ends);
          thread83383(tdone,ends);
          thread83384(tdone,ends);
          int biggest83397 = 0;
          if(ends[2]>=biggest83397){
            biggest83397=ends[2];
          }
          if(ends[3]>=biggest83397){
            biggest83397=ends[3];
          }
          if(ends[4]>=biggest83397){
            biggest83397=ends[4];
          }
          if(ends[5]>=biggest83397){
            biggest83397=ends[5];
          }
          if(ends[6]>=biggest83397){
            biggest83397=ends[6];
          }
          if(ends[7]>=biggest83397){
            biggest83397=ends[7];
          }
          if(ends[8]>=biggest83397){
            biggest83397=ends[8];
          }
          if(biggest83397 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
          //FINXME code
          if(biggest83397 == 0){
            S83368=0;
            active[1]=0;
            ends[1]=0;
            S83368=0;
            break RUN;
          }
        
      }
    }
  }

  public void init(){
    char [] active1 = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
    char [] paused1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    char [] suspended1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    paused = paused1;
    active = active1;
    suspended = suspended1;
    // Now instantiate all the local signals ONLY
    sigConveyorReq_1 = new Signal();
    sigCapperReq_1 = new Signal();
    sigCapLoaderReq_1 = new Signal();
    sigFillerReq_1 = new Signal();
    sigRotaryReq_1 = new Signal();
    recConveyorStatus_1 = new Signal();
    recCapperStatus_1 = new Signal();
    recCapLoaderStatus_1 = new Signal();
    recFillerStatus_1 = new Signal();
    recRotaryStatus_1 = new Signal();
    getNextBottle_1 = new Signal();
    // --------------------------------------------------
  }
  
  public void run(){
    while(active[1] != 0){
      int index = 1;
      if(paused[index]==1 || suspended[index]==1 || active[index] == 0){
        for(int h=1;h<paused.length;++h){
          paused[h]=0;
        }
      }
      if(paused[1]!=0 || suspended[1]!=0 || active[1]!=1);
      else{
        if(!df){
          conveyorStatus_in.gethook();
          capperStatus_in.gethook();
          capLoaderStatus_in.gethook();
          fillerStatus_in.gethook();
          rotaryStatus_in.gethook();
          order_in.gethook();
          conveyorReq_o.gethook();
          rotaryReq_o.gethook();
          fillerReq_o.gethook();
          capperReq_o.gethook();
          capLoaderReq_o.gethook();
          doneOrder_o.gethook();
          percentLiquid_o.gethook();
          df = true;
        }
        runClockDomain();
      }
      sigConveyorReq_1.setpreclear();
      sigCapperReq_1.setpreclear();
      sigCapLoaderReq_1.setpreclear();
      sigFillerReq_1.setpreclear();
      sigRotaryReq_1.setpreclear();
      recConveyorStatus_1.setpreclear();
      recCapperStatus_1.setpreclear();
      recCapLoaderStatus_1.setpreclear();
      recFillerStatus_1.setpreclear();
      recRotaryStatus_1.setpreclear();
      getNextBottle_1.setpreclear();
      int dummyint = 0;
      for(int qw=0;qw<currsigs.size();++qw){
        dummyint = ((Signal)currsigs.elementAt(qw)).getStatus() ? ((Signal)currsigs.elementAt(qw)).setprepresent() : ((Signal)currsigs.elementAt(qw)).setpreclear();
        ((Signal)currsigs.elementAt(qw)).setpreval(((Signal)currsigs.elementAt(qw)).getValue());
      }
      currsigs.removeAllElements();
      sigConveyorReq_1.setClear();
      sigCapperReq_1.setClear();
      sigCapLoaderReq_1.setClear();
      sigFillerReq_1.setClear();
      sigRotaryReq_1.setClear();
      recConveyorStatus_1.setClear();
      recCapperStatus_1.setClear();
      recCapLoaderStatus_1.setClear();
      recFillerStatus_1.setClear();
      recRotaryStatus_1.setClear();
      getNextBottle_1.setClear();
      conveyorStatus_in.sethook();
      capperStatus_in.sethook();
      capLoaderStatus_in.sethook();
      fillerStatus_in.sethook();
      rotaryStatus_in.sethook();
      order_in.sethook();
      conveyorReq_o.sethook();
      rotaryReq_o.sethook();
      fillerReq_o.sethook();
      capperReq_o.sethook();
      capLoaderReq_o.sethook();
      doneOrder_o.sethook();
      percentLiquid_o.sethook();
      if(paused[1]!=0 || suspended[1]!=0 || active[1]!=1);
      else{
        conveyorStatus_in.gethook();
        capperStatus_in.gethook();
        capLoaderStatus_in.gethook();
        fillerStatus_in.gethook();
        rotaryStatus_in.gethook();
        order_in.gethook();
        conveyorReq_o.gethook();
        rotaryReq_o.gethook();
        fillerReq_o.gethook();
        capperReq_o.gethook();
        capLoaderReq_o.gethook();
        doneOrder_o.gethook();
        percentLiquid_o.gethook();
      }
      runFinisher();
      if(active[1] == 0){
      	this.terminated = true;
      }
      if(!threaded) break;
    }
  }
}
