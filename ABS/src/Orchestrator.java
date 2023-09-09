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
  private Signal sigConveyorReq_1;
  private Signal sigCapperReq_1;
  private Signal sigCapLoaderReq_1;
  private Signal sigRotaryReq_1;
  private Signal sigFillerReq_1;
  private Signal recConveyorStatus_1;
  private Signal recCapperStatus_1;
  private Signal recCapLoaderStatus_1;
  private Signal recFillerStatus_1;
  private Signal recRotaryStatus_1;
  private Signal getNextBottle_1;
  private int quantity_thread_2;//sysj\orchestrator.sysj line: 15, column: 3
  private int bottlePlaced_thread_2;//sysj\orchestrator.sysj line: 16, column: 3
  private ArrayList liquidPercent_thread_8;//sysj\orchestrator.sysj line: 100, column: 3
  private String res_thread_3;//sysj\orchestrator.sysj line: 44, column: 4
  private String res_thread_4;//sysj\orchestrator.sysj line: 56, column: 4
  private String res_thread_5;//sysj\orchestrator.sysj line: 69, column: 4
  private ArrayList req_thread_6;//sysj\orchestrator.sysj line: 78, column: 4
  private String res_thread_6;//sysj\orchestrator.sysj line: 82, column: 4
  private String res_thread_7;//sysj\orchestrator.sysj line: 94, column: 4
  private int S37040 = 1;
  private int S31484 = 1;
  private int S31288 = 1;
  private int S31250 = 1;
  private int S32424 = 1;
  private int S31530 = 1;
  private int S31492 = 1;
  private int S31487 = 1;
  private int S31537 = 1;
  private int S31532 = 1;
  private int S33364 = 1;
  private int S32426 = 1;
  private int S32433 = 1;
  private int S32428 = 1;
  private int S32477 = 1;
  private int S32472 = 1;
  private int S34304 = 1;
  private int S33366 = 1;
  private int S33373 = 1;
  private int S33368 = 1;
  private int S33417 = 1;
  private int S33412 = 1;
  private int S35244 = 1;
  private int S34306 = 1;
  private int S34313 = 1;
  private int S34308 = 1;
  private int S34357 = 1;
  private int S34352 = 1;
  private int S36184 = 1;
  private int S35246 = 1;
  private int S35253 = 1;
  private int S35248 = 1;
  private int S35297 = 1;
  private int S35292 = 1;
  private int S37038 = 1;
  private int S36187 = 1;
  private int S36190 = 1;
  private int S36193 = 1;
  private int S36196 = 1;
  private int S36199 = 1;
  
  private int[] ends = new int[12];
  private int[] tdone = new int[12];
  
  public void thread37067(int [] tdone, int [] ends){
        S36199=1;
    active[11]=1;
    ends[11]=1;
    tdone[11]=1;
  }

  public void thread37066(int [] tdone, int [] ends){
        S36196=1;
    active[10]=1;
    ends[10]=1;
    tdone[10]=1;
  }

  public void thread37065(int [] tdone, int [] ends){
        S36193=1;
    active[9]=1;
    ends[9]=1;
    tdone[9]=1;
  }

  public void thread37063(int [] tdone, int [] ends){
        switch(S36199){
      case 0 : 
        active[11]=0;
        ends[11]=0;
        tdone[11]=1;
        break;
      
      case 1 : 
        if(recCapperStatus_1.getprestatus()){//sysj\orchestrator.sysj line: 118, column: 73
          S36199=0;
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

  public void thread37062(int [] tdone, int [] ends){
        switch(S36196){
      case 0 : 
        active[10]=0;
        ends[10]=0;
        tdone[10]=1;
        break;
      
      case 1 : 
        if(recCapLoaderStatus_1.getprestatus()){//sysj\orchestrator.sysj line: 118, column: 41
          S36196=0;
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

  public void thread37061(int [] tdone, int [] ends){
        switch(S36193){
      case 0 : 
        active[9]=0;
        ends[9]=0;
        tdone[9]=1;
        break;
      
      case 1 : 
        if(recFillerStatus_1.getprestatus()){//sysj\orchestrator.sysj line: 118, column: 12
          S36193=0;
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

  public void thread37059(int [] tdone, int [] ends){
        S36199=1;
    active[11]=1;
    ends[11]=1;
    tdone[11]=1;
  }

  public void thread37058(int [] tdone, int [] ends){
        S36196=1;
    active[10]=1;
    ends[10]=1;
    tdone[10]=1;
  }

  public void thread37057(int [] tdone, int [] ends){
        S36193=1;
    active[9]=1;
    ends[9]=1;
    tdone[9]=1;
  }

  public void thread37056(int [] tdone, int [] ends){
        switch(S37038){
      case 0 : 
        active[8]=0;
        ends[8]=0;
        tdone[8]=1;
        break;
      
      case 1 : 
        switch(S36187){
          case 0 : 
            if(recConveyorStatus_1.getprestatus()){//sysj\orchestrator.sysj line: 108, column: 10
              sigRotaryReq_1.setPresent();//sysj\orchestrator.sysj line: 109, column: 4
              currsigs.addElement(sigRotaryReq_1);
              S36187=1;
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
            if(recRotaryStatus_1.getprestatus()){//sysj\orchestrator.sysj line: 110, column: 10
              S36187=2;
              System.out.println("Orch: New bottle. Preparing to send requests..");//sysj\orchestrator.sysj line: 114, column: 5
              sigFillerReq_1.setPresent();//sysj\orchestrator.sysj line: 115, column: 5
              currsigs.addElement(sigFillerReq_1);
              sigFillerReq_1.setValue(liquidPercent_thread_8);//sysj\orchestrator.sysj line: 115, column: 5
              sigCapLoaderReq_1.setPresent();//sysj\orchestrator.sysj line: 116, column: 5
              currsigs.addElement(sigCapLoaderReq_1);
              sigCapperReq_1.setPresent();//sysj\orchestrator.sysj line: 117, column: 5
              currsigs.addElement(sigCapperReq_1);
              S36190=0;
              thread37057(tdone,ends);
              thread37058(tdone,ends);
              thread37059(tdone,ends);
              int biggest37060 = 0;
              if(ends[9]>=biggest37060){
                biggest37060=ends[9];
              }
              if(ends[10]>=biggest37060){
                biggest37060=ends[10];
              }
              if(ends[11]>=biggest37060){
                biggest37060=ends[11];
              }
              if(biggest37060 == 1){
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
            switch(S36190){
              case 0 : 
                thread37061(tdone,ends);
                thread37062(tdone,ends);
                thread37063(tdone,ends);
                int biggest37064 = 0;
                if(ends[9]>=biggest37064){
                  biggest37064=ends[9];
                }
                if(ends[10]>=biggest37064){
                  biggest37064=ends[10];
                }
                if(ends[11]>=biggest37064){
                  biggest37064=ends[11];
                }
                if(biggest37064 == 1){
                  active[8]=1;
                  ends[8]=1;
                  tdone[8]=1;
                }
                //FINXME code
                if(biggest37064 == 0){
                  System.out.println("Orch: All done!");//sysj\orchestrator.sysj line: 119, column: 5
                  getNextBottle_1.setPresent();//sysj\orchestrator.sysj line: 122, column: 5
                  currsigs.addElement(getNextBottle_1);
                  S36190=1;
                  active[8]=1;
                  ends[8]=1;
                  tdone[8]=1;
                }
                break;
              
              case 1 : 
                if(recConveyorStatus_1.getprestatus()){//sysj\orchestrator.sysj line: 123, column: 11
                  sigRotaryReq_1.setPresent();//sysj\orchestrator.sysj line: 125, column: 5
                  currsigs.addElement(sigRotaryReq_1);
                  S36190=2;
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
                if(recRotaryStatus_1.getprestatus()){//sysj\orchestrator.sysj line: 126, column: 11
                  S36190=3;
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
              
              case 3 : 
                S36190=3;
                System.out.println("Orch: New bottle. Preparing to send requests..");//sysj\orchestrator.sysj line: 114, column: 5
                sigFillerReq_1.setPresent();//sysj\orchestrator.sysj line: 115, column: 5
                currsigs.addElement(sigFillerReq_1);
                sigFillerReq_1.setValue(liquidPercent_thread_8);//sysj\orchestrator.sysj line: 115, column: 5
                sigCapLoaderReq_1.setPresent();//sysj\orchestrator.sysj line: 116, column: 5
                currsigs.addElement(sigCapLoaderReq_1);
                sigCapperReq_1.setPresent();//sysj\orchestrator.sysj line: 117, column: 5
                currsigs.addElement(sigCapperReq_1);
                S36190=0;
                thread37065(tdone,ends);
                thread37066(tdone,ends);
                thread37067(tdone,ends);
                int biggest37068 = 0;
                if(ends[9]>=biggest37068){
                  biggest37068=ends[9];
                }
                if(ends[10]>=biggest37068){
                  biggest37068=ends[10];
                }
                if(ends[11]>=biggest37068){
                  biggest37068=ends[11];
                }
                if(biggest37068 == 1){
                  active[8]=1;
                  ends[8]=1;
                  tdone[8]=1;
                }
                break;
              
            }
            break;
          
          case 3 : 
            S36187=3;
            S36187=0;
            active[8]=1;
            ends[8]=1;
            tdone[8]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread37055(int [] tdone, int [] ends){
        switch(S36184){
      case 0 : 
        active[7]=0;
        ends[7]=0;
        tdone[7]=1;
        break;
      
      case 1 : 
        switch(S35246){
          case 0 : 
            if(sigRotaryReq_1.getprestatus()){//sysj\orchestrator.sysj line: 89, column: 10
              System.out.println("Orch: Sending rotary request");//sysj\orchestrator.sysj line: 90, column: 4
              S35246=1;
              S35253=0;
              if(!rotaryReq_o.isPartnerPresent() || rotaryReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 91, column: 4
                rotaryReq_o.setREQ(false);//sysj\orchestrator.sysj line: 91, column: 4
                S35253=1;
                active[7]=1;
                ends[7]=1;
                tdone[7]=1;
              }
              else {
                S35248=0;
                if(rotaryReq_o.isACK()){//sysj\orchestrator.sysj line: 91, column: 4
                  rotaryReq_o.setVal(true);//sysj\orchestrator.sysj line: 91, column: 4
                  S35248=1;
                  if(!rotaryReq_o.isACK()){//sysj\orchestrator.sysj line: 91, column: 4
                    rotaryReq_o.setREQ(false);//sysj\orchestrator.sysj line: 91, column: 4
                    ends[7]=2;
                    ;//sysj\orchestrator.sysj line: 91, column: 4
                    S35246=2;
                    S35297=0;
                    if(!rotaryStatus_in.isPartnerPresent() || rotaryStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 92, column: 4
                      rotaryStatus_in.setACK(false);//sysj\orchestrator.sysj line: 92, column: 4
                      S35297=1;
                      active[7]=1;
                      ends[7]=1;
                      tdone[7]=1;
                    }
                    else {
                      S35292=0;
                      if(!rotaryStatus_in.isREQ()){//sysj\orchestrator.sysj line: 92, column: 4
                        rotaryStatus_in.setACK(true);//sysj\orchestrator.sysj line: 92, column: 4
                        S35292=1;
                        if(rotaryStatus_in.isREQ()){//sysj\orchestrator.sysj line: 92, column: 4
                          rotaryStatus_in.setACK(false);//sysj\orchestrator.sysj line: 92, column: 4
                          ends[7]=2;
                          ;//sysj\orchestrator.sysj line: 92, column: 4
                          System.out.println("Orch: Received rotary status");//sysj\orchestrator.sysj line: 93, column: 4
                          res_thread_7 = (String)(rotaryStatus_in.getVal() == null ? null : ((String)rotaryStatus_in.getVal()));//sysj\orchestrator.sysj line: 94, column: 4
                          recRotaryStatus_1.setPresent();//sysj\orchestrator.sysj line: 95, column: 4
                          currsigs.addElement(recRotaryStatus_1);
                          recRotaryStatus_1.setValue(res_thread_7);//sysj\orchestrator.sysj line: 95, column: 4
                          S35246=0;
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
            switch(S35253){
              case 0 : 
                if(!rotaryReq_o.isPartnerPresent() || rotaryReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 91, column: 4
                  rotaryReq_o.setREQ(false);//sysj\orchestrator.sysj line: 91, column: 4
                  S35253=1;
                  active[7]=1;
                  ends[7]=1;
                  tdone[7]=1;
                }
                else {
                  switch(S35248){
                    case 0 : 
                      if(rotaryReq_o.isACK()){//sysj\orchestrator.sysj line: 91, column: 4
                        rotaryReq_o.setVal(true);//sysj\orchestrator.sysj line: 91, column: 4
                        S35248=1;
                        if(!rotaryReq_o.isACK()){//sysj\orchestrator.sysj line: 91, column: 4
                          rotaryReq_o.setREQ(false);//sysj\orchestrator.sysj line: 91, column: 4
                          ends[7]=2;
                          ;//sysj\orchestrator.sysj line: 91, column: 4
                          S35246=2;
                          S35297=0;
                          if(!rotaryStatus_in.isPartnerPresent() || rotaryStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 92, column: 4
                            rotaryStatus_in.setACK(false);//sysj\orchestrator.sysj line: 92, column: 4
                            S35297=1;
                            active[7]=1;
                            ends[7]=1;
                            tdone[7]=1;
                          }
                          else {
                            S35292=0;
                            if(!rotaryStatus_in.isREQ()){//sysj\orchestrator.sysj line: 92, column: 4
                              rotaryStatus_in.setACK(true);//sysj\orchestrator.sysj line: 92, column: 4
                              S35292=1;
                              if(rotaryStatus_in.isREQ()){//sysj\orchestrator.sysj line: 92, column: 4
                                rotaryStatus_in.setACK(false);//sysj\orchestrator.sysj line: 92, column: 4
                                ends[7]=2;
                                ;//sysj\orchestrator.sysj line: 92, column: 4
                                System.out.println("Orch: Received rotary status");//sysj\orchestrator.sysj line: 93, column: 4
                                res_thread_7 = (String)(rotaryStatus_in.getVal() == null ? null : ((String)rotaryStatus_in.getVal()));//sysj\orchestrator.sysj line: 94, column: 4
                                recRotaryStatus_1.setPresent();//sysj\orchestrator.sysj line: 95, column: 4
                                currsigs.addElement(recRotaryStatus_1);
                                recRotaryStatus_1.setValue(res_thread_7);//sysj\orchestrator.sysj line: 95, column: 4
                                S35246=0;
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
                      if(!rotaryReq_o.isACK()){//sysj\orchestrator.sysj line: 91, column: 4
                        rotaryReq_o.setREQ(false);//sysj\orchestrator.sysj line: 91, column: 4
                        ends[7]=2;
                        ;//sysj\orchestrator.sysj line: 91, column: 4
                        S35246=2;
                        S35297=0;
                        if(!rotaryStatus_in.isPartnerPresent() || rotaryStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 92, column: 4
                          rotaryStatus_in.setACK(false);//sysj\orchestrator.sysj line: 92, column: 4
                          S35297=1;
                          active[7]=1;
                          ends[7]=1;
                          tdone[7]=1;
                        }
                        else {
                          S35292=0;
                          if(!rotaryStatus_in.isREQ()){//sysj\orchestrator.sysj line: 92, column: 4
                            rotaryStatus_in.setACK(true);//sysj\orchestrator.sysj line: 92, column: 4
                            S35292=1;
                            if(rotaryStatus_in.isREQ()){//sysj\orchestrator.sysj line: 92, column: 4
                              rotaryStatus_in.setACK(false);//sysj\orchestrator.sysj line: 92, column: 4
                              ends[7]=2;
                              ;//sysj\orchestrator.sysj line: 92, column: 4
                              System.out.println("Orch: Received rotary status");//sysj\orchestrator.sysj line: 93, column: 4
                              res_thread_7 = (String)(rotaryStatus_in.getVal() == null ? null : ((String)rotaryStatus_in.getVal()));//sysj\orchestrator.sysj line: 94, column: 4
                              recRotaryStatus_1.setPresent();//sysj\orchestrator.sysj line: 95, column: 4
                              currsigs.addElement(recRotaryStatus_1);
                              recRotaryStatus_1.setValue(res_thread_7);//sysj\orchestrator.sysj line: 95, column: 4
                              S35246=0;
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
                S35253=1;
                S35253=0;
                if(!rotaryReq_o.isPartnerPresent() || rotaryReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 91, column: 4
                  rotaryReq_o.setREQ(false);//sysj\orchestrator.sysj line: 91, column: 4
                  S35253=1;
                  active[7]=1;
                  ends[7]=1;
                  tdone[7]=1;
                }
                else {
                  S35248=0;
                  if(rotaryReq_o.isACK()){//sysj\orchestrator.sysj line: 91, column: 4
                    rotaryReq_o.setVal(true);//sysj\orchestrator.sysj line: 91, column: 4
                    S35248=1;
                    if(!rotaryReq_o.isACK()){//sysj\orchestrator.sysj line: 91, column: 4
                      rotaryReq_o.setREQ(false);//sysj\orchestrator.sysj line: 91, column: 4
                      ends[7]=2;
                      ;//sysj\orchestrator.sysj line: 91, column: 4
                      S35246=2;
                      S35297=0;
                      if(!rotaryStatus_in.isPartnerPresent() || rotaryStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 92, column: 4
                        rotaryStatus_in.setACK(false);//sysj\orchestrator.sysj line: 92, column: 4
                        S35297=1;
                        active[7]=1;
                        ends[7]=1;
                        tdone[7]=1;
                      }
                      else {
                        S35292=0;
                        if(!rotaryStatus_in.isREQ()){//sysj\orchestrator.sysj line: 92, column: 4
                          rotaryStatus_in.setACK(true);//sysj\orchestrator.sysj line: 92, column: 4
                          S35292=1;
                          if(rotaryStatus_in.isREQ()){//sysj\orchestrator.sysj line: 92, column: 4
                            rotaryStatus_in.setACK(false);//sysj\orchestrator.sysj line: 92, column: 4
                            ends[7]=2;
                            ;//sysj\orchestrator.sysj line: 92, column: 4
                            System.out.println("Orch: Received rotary status");//sysj\orchestrator.sysj line: 93, column: 4
                            res_thread_7 = (String)(rotaryStatus_in.getVal() == null ? null : ((String)rotaryStatus_in.getVal()));//sysj\orchestrator.sysj line: 94, column: 4
                            recRotaryStatus_1.setPresent();//sysj\orchestrator.sysj line: 95, column: 4
                            currsigs.addElement(recRotaryStatus_1);
                            recRotaryStatus_1.setValue(res_thread_7);//sysj\orchestrator.sysj line: 95, column: 4
                            S35246=0;
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
            switch(S35297){
              case 0 : 
                if(!rotaryStatus_in.isPartnerPresent() || rotaryStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 92, column: 4
                  rotaryStatus_in.setACK(false);//sysj\orchestrator.sysj line: 92, column: 4
                  S35297=1;
                  active[7]=1;
                  ends[7]=1;
                  tdone[7]=1;
                }
                else {
                  switch(S35292){
                    case 0 : 
                      if(!rotaryStatus_in.isREQ()){//sysj\orchestrator.sysj line: 92, column: 4
                        rotaryStatus_in.setACK(true);//sysj\orchestrator.sysj line: 92, column: 4
                        S35292=1;
                        if(rotaryStatus_in.isREQ()){//sysj\orchestrator.sysj line: 92, column: 4
                          rotaryStatus_in.setACK(false);//sysj\orchestrator.sysj line: 92, column: 4
                          ends[7]=2;
                          ;//sysj\orchestrator.sysj line: 92, column: 4
                          System.out.println("Orch: Received rotary status");//sysj\orchestrator.sysj line: 93, column: 4
                          res_thread_7 = (String)(rotaryStatus_in.getVal() == null ? null : ((String)rotaryStatus_in.getVal()));//sysj\orchestrator.sysj line: 94, column: 4
                          recRotaryStatus_1.setPresent();//sysj\orchestrator.sysj line: 95, column: 4
                          currsigs.addElement(recRotaryStatus_1);
                          recRotaryStatus_1.setValue(res_thread_7);//sysj\orchestrator.sysj line: 95, column: 4
                          S35246=0;
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
                      if(rotaryStatus_in.isREQ()){//sysj\orchestrator.sysj line: 92, column: 4
                        rotaryStatus_in.setACK(false);//sysj\orchestrator.sysj line: 92, column: 4
                        ends[7]=2;
                        ;//sysj\orchestrator.sysj line: 92, column: 4
                        System.out.println("Orch: Received rotary status");//sysj\orchestrator.sysj line: 93, column: 4
                        res_thread_7 = (String)(rotaryStatus_in.getVal() == null ? null : ((String)rotaryStatus_in.getVal()));//sysj\orchestrator.sysj line: 94, column: 4
                        recRotaryStatus_1.setPresent();//sysj\orchestrator.sysj line: 95, column: 4
                        currsigs.addElement(recRotaryStatus_1);
                        recRotaryStatus_1.setValue(res_thread_7);//sysj\orchestrator.sysj line: 95, column: 4
                        S35246=0;
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
                S35297=1;
                S35297=0;
                if(!rotaryStatus_in.isPartnerPresent() || rotaryStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 92, column: 4
                  rotaryStatus_in.setACK(false);//sysj\orchestrator.sysj line: 92, column: 4
                  S35297=1;
                  active[7]=1;
                  ends[7]=1;
                  tdone[7]=1;
                }
                else {
                  S35292=0;
                  if(!rotaryStatus_in.isREQ()){//sysj\orchestrator.sysj line: 92, column: 4
                    rotaryStatus_in.setACK(true);//sysj\orchestrator.sysj line: 92, column: 4
                    S35292=1;
                    if(rotaryStatus_in.isREQ()){//sysj\orchestrator.sysj line: 92, column: 4
                      rotaryStatus_in.setACK(false);//sysj\orchestrator.sysj line: 92, column: 4
                      ends[7]=2;
                      ;//sysj\orchestrator.sysj line: 92, column: 4
                      System.out.println("Orch: Received rotary status");//sysj\orchestrator.sysj line: 93, column: 4
                      res_thread_7 = (String)(rotaryStatus_in.getVal() == null ? null : ((String)rotaryStatus_in.getVal()));//sysj\orchestrator.sysj line: 94, column: 4
                      recRotaryStatus_1.setPresent();//sysj\orchestrator.sysj line: 95, column: 4
                      currsigs.addElement(recRotaryStatus_1);
                      recRotaryStatus_1.setValue(res_thread_7);//sysj\orchestrator.sysj line: 95, column: 4
                      S35246=0;
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

  public void thread37054(int [] tdone, int [] ends){
        switch(S35244){
      case 0 : 
        active[6]=0;
        ends[6]=0;
        tdone[6]=1;
        break;
      
      case 1 : 
        switch(S34306){
          case 0 : 
            if(sigFillerReq_1.getprestatus()){//sysj\orchestrator.sysj line: 76, column: 10
              System.out.println("Orch: Sending filler request");//sysj\orchestrator.sysj line: 77, column: 4
              req_thread_6 = (ArrayList)(sigFillerReq_1.getpreval() == null ? null : ((ArrayList)sigFillerReq_1.getpreval()));//sysj\orchestrator.sysj line: 78, column: 4
              S34306=1;
              S34313=0;
              if(!fillerReq_o.isPartnerPresent() || fillerReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 79, column: 4
                fillerReq_o.setREQ(false);//sysj\orchestrator.sysj line: 79, column: 4
                S34313=1;
                active[6]=1;
                ends[6]=1;
                tdone[6]=1;
              }
              else {
                S34308=0;
                if(fillerReq_o.isACK()){//sysj\orchestrator.sysj line: 79, column: 4
                  fillerReq_o.setVal(req_thread_6);//sysj\orchestrator.sysj line: 79, column: 4
                  S34308=1;
                  if(!fillerReq_o.isACK()){//sysj\orchestrator.sysj line: 79, column: 4
                    fillerReq_o.setREQ(false);//sysj\orchestrator.sysj line: 79, column: 4
                    ends[6]=2;
                    ;//sysj\orchestrator.sysj line: 79, column: 4
                    S34306=2;
                    S34357=0;
                    if(!fillerStatus_in.isPartnerPresent() || fillerStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 80, column: 4
                      fillerStatus_in.setACK(false);//sysj\orchestrator.sysj line: 80, column: 4
                      S34357=1;
                      active[6]=1;
                      ends[6]=1;
                      tdone[6]=1;
                    }
                    else {
                      S34352=0;
                      if(!fillerStatus_in.isREQ()){//sysj\orchestrator.sysj line: 80, column: 4
                        fillerStatus_in.setACK(true);//sysj\orchestrator.sysj line: 80, column: 4
                        S34352=1;
                        if(fillerStatus_in.isREQ()){//sysj\orchestrator.sysj line: 80, column: 4
                          fillerStatus_in.setACK(false);//sysj\orchestrator.sysj line: 80, column: 4
                          ends[6]=2;
                          ;//sysj\orchestrator.sysj line: 80, column: 4
                          System.out.println("Orch: Received filler status");//sysj\orchestrator.sysj line: 81, column: 4
                          res_thread_6 = (String)(fillerStatus_in.getVal() == null ? null : ((String)fillerStatus_in.getVal()));//sysj\orchestrator.sysj line: 82, column: 4
                          recFillerStatus_1.setPresent();//sysj\orchestrator.sysj line: 83, column: 4
                          currsigs.addElement(recFillerStatus_1);
                          recFillerStatus_1.setValue(res_thread_6);//sysj\orchestrator.sysj line: 83, column: 4
                          S34306=0;
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
            switch(S34313){
              case 0 : 
                if(!fillerReq_o.isPartnerPresent() || fillerReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 79, column: 4
                  fillerReq_o.setREQ(false);//sysj\orchestrator.sysj line: 79, column: 4
                  S34313=1;
                  active[6]=1;
                  ends[6]=1;
                  tdone[6]=1;
                }
                else {
                  switch(S34308){
                    case 0 : 
                      if(fillerReq_o.isACK()){//sysj\orchestrator.sysj line: 79, column: 4
                        fillerReq_o.setVal(req_thread_6);//sysj\orchestrator.sysj line: 79, column: 4
                        S34308=1;
                        if(!fillerReq_o.isACK()){//sysj\orchestrator.sysj line: 79, column: 4
                          fillerReq_o.setREQ(false);//sysj\orchestrator.sysj line: 79, column: 4
                          ends[6]=2;
                          ;//sysj\orchestrator.sysj line: 79, column: 4
                          S34306=2;
                          S34357=0;
                          if(!fillerStatus_in.isPartnerPresent() || fillerStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 80, column: 4
                            fillerStatus_in.setACK(false);//sysj\orchestrator.sysj line: 80, column: 4
                            S34357=1;
                            active[6]=1;
                            ends[6]=1;
                            tdone[6]=1;
                          }
                          else {
                            S34352=0;
                            if(!fillerStatus_in.isREQ()){//sysj\orchestrator.sysj line: 80, column: 4
                              fillerStatus_in.setACK(true);//sysj\orchestrator.sysj line: 80, column: 4
                              S34352=1;
                              if(fillerStatus_in.isREQ()){//sysj\orchestrator.sysj line: 80, column: 4
                                fillerStatus_in.setACK(false);//sysj\orchestrator.sysj line: 80, column: 4
                                ends[6]=2;
                                ;//sysj\orchestrator.sysj line: 80, column: 4
                                System.out.println("Orch: Received filler status");//sysj\orchestrator.sysj line: 81, column: 4
                                res_thread_6 = (String)(fillerStatus_in.getVal() == null ? null : ((String)fillerStatus_in.getVal()));//sysj\orchestrator.sysj line: 82, column: 4
                                recFillerStatus_1.setPresent();//sysj\orchestrator.sysj line: 83, column: 4
                                currsigs.addElement(recFillerStatus_1);
                                recFillerStatus_1.setValue(res_thread_6);//sysj\orchestrator.sysj line: 83, column: 4
                                S34306=0;
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
                      if(!fillerReq_o.isACK()){//sysj\orchestrator.sysj line: 79, column: 4
                        fillerReq_o.setREQ(false);//sysj\orchestrator.sysj line: 79, column: 4
                        ends[6]=2;
                        ;//sysj\orchestrator.sysj line: 79, column: 4
                        S34306=2;
                        S34357=0;
                        if(!fillerStatus_in.isPartnerPresent() || fillerStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 80, column: 4
                          fillerStatus_in.setACK(false);//sysj\orchestrator.sysj line: 80, column: 4
                          S34357=1;
                          active[6]=1;
                          ends[6]=1;
                          tdone[6]=1;
                        }
                        else {
                          S34352=0;
                          if(!fillerStatus_in.isREQ()){//sysj\orchestrator.sysj line: 80, column: 4
                            fillerStatus_in.setACK(true);//sysj\orchestrator.sysj line: 80, column: 4
                            S34352=1;
                            if(fillerStatus_in.isREQ()){//sysj\orchestrator.sysj line: 80, column: 4
                              fillerStatus_in.setACK(false);//sysj\orchestrator.sysj line: 80, column: 4
                              ends[6]=2;
                              ;//sysj\orchestrator.sysj line: 80, column: 4
                              System.out.println("Orch: Received filler status");//sysj\orchestrator.sysj line: 81, column: 4
                              res_thread_6 = (String)(fillerStatus_in.getVal() == null ? null : ((String)fillerStatus_in.getVal()));//sysj\orchestrator.sysj line: 82, column: 4
                              recFillerStatus_1.setPresent();//sysj\orchestrator.sysj line: 83, column: 4
                              currsigs.addElement(recFillerStatus_1);
                              recFillerStatus_1.setValue(res_thread_6);//sysj\orchestrator.sysj line: 83, column: 4
                              S34306=0;
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
                S34313=1;
                S34313=0;
                if(!fillerReq_o.isPartnerPresent() || fillerReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 79, column: 4
                  fillerReq_o.setREQ(false);//sysj\orchestrator.sysj line: 79, column: 4
                  S34313=1;
                  active[6]=1;
                  ends[6]=1;
                  tdone[6]=1;
                }
                else {
                  S34308=0;
                  if(fillerReq_o.isACK()){//sysj\orchestrator.sysj line: 79, column: 4
                    fillerReq_o.setVal(req_thread_6);//sysj\orchestrator.sysj line: 79, column: 4
                    S34308=1;
                    if(!fillerReq_o.isACK()){//sysj\orchestrator.sysj line: 79, column: 4
                      fillerReq_o.setREQ(false);//sysj\orchestrator.sysj line: 79, column: 4
                      ends[6]=2;
                      ;//sysj\orchestrator.sysj line: 79, column: 4
                      S34306=2;
                      S34357=0;
                      if(!fillerStatus_in.isPartnerPresent() || fillerStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 80, column: 4
                        fillerStatus_in.setACK(false);//sysj\orchestrator.sysj line: 80, column: 4
                        S34357=1;
                        active[6]=1;
                        ends[6]=1;
                        tdone[6]=1;
                      }
                      else {
                        S34352=0;
                        if(!fillerStatus_in.isREQ()){//sysj\orchestrator.sysj line: 80, column: 4
                          fillerStatus_in.setACK(true);//sysj\orchestrator.sysj line: 80, column: 4
                          S34352=1;
                          if(fillerStatus_in.isREQ()){//sysj\orchestrator.sysj line: 80, column: 4
                            fillerStatus_in.setACK(false);//sysj\orchestrator.sysj line: 80, column: 4
                            ends[6]=2;
                            ;//sysj\orchestrator.sysj line: 80, column: 4
                            System.out.println("Orch: Received filler status");//sysj\orchestrator.sysj line: 81, column: 4
                            res_thread_6 = (String)(fillerStatus_in.getVal() == null ? null : ((String)fillerStatus_in.getVal()));//sysj\orchestrator.sysj line: 82, column: 4
                            recFillerStatus_1.setPresent();//sysj\orchestrator.sysj line: 83, column: 4
                            currsigs.addElement(recFillerStatus_1);
                            recFillerStatus_1.setValue(res_thread_6);//sysj\orchestrator.sysj line: 83, column: 4
                            S34306=0;
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
            switch(S34357){
              case 0 : 
                if(!fillerStatus_in.isPartnerPresent() || fillerStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 80, column: 4
                  fillerStatus_in.setACK(false);//sysj\orchestrator.sysj line: 80, column: 4
                  S34357=1;
                  active[6]=1;
                  ends[6]=1;
                  tdone[6]=1;
                }
                else {
                  switch(S34352){
                    case 0 : 
                      if(!fillerStatus_in.isREQ()){//sysj\orchestrator.sysj line: 80, column: 4
                        fillerStatus_in.setACK(true);//sysj\orchestrator.sysj line: 80, column: 4
                        S34352=1;
                        if(fillerStatus_in.isREQ()){//sysj\orchestrator.sysj line: 80, column: 4
                          fillerStatus_in.setACK(false);//sysj\orchestrator.sysj line: 80, column: 4
                          ends[6]=2;
                          ;//sysj\orchestrator.sysj line: 80, column: 4
                          System.out.println("Orch: Received filler status");//sysj\orchestrator.sysj line: 81, column: 4
                          res_thread_6 = (String)(fillerStatus_in.getVal() == null ? null : ((String)fillerStatus_in.getVal()));//sysj\orchestrator.sysj line: 82, column: 4
                          recFillerStatus_1.setPresent();//sysj\orchestrator.sysj line: 83, column: 4
                          currsigs.addElement(recFillerStatus_1);
                          recFillerStatus_1.setValue(res_thread_6);//sysj\orchestrator.sysj line: 83, column: 4
                          S34306=0;
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
                      if(fillerStatus_in.isREQ()){//sysj\orchestrator.sysj line: 80, column: 4
                        fillerStatus_in.setACK(false);//sysj\orchestrator.sysj line: 80, column: 4
                        ends[6]=2;
                        ;//sysj\orchestrator.sysj line: 80, column: 4
                        System.out.println("Orch: Received filler status");//sysj\orchestrator.sysj line: 81, column: 4
                        res_thread_6 = (String)(fillerStatus_in.getVal() == null ? null : ((String)fillerStatus_in.getVal()));//sysj\orchestrator.sysj line: 82, column: 4
                        recFillerStatus_1.setPresent();//sysj\orchestrator.sysj line: 83, column: 4
                        currsigs.addElement(recFillerStatus_1);
                        recFillerStatus_1.setValue(res_thread_6);//sysj\orchestrator.sysj line: 83, column: 4
                        S34306=0;
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
                S34357=1;
                S34357=0;
                if(!fillerStatus_in.isPartnerPresent() || fillerStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 80, column: 4
                  fillerStatus_in.setACK(false);//sysj\orchestrator.sysj line: 80, column: 4
                  S34357=1;
                  active[6]=1;
                  ends[6]=1;
                  tdone[6]=1;
                }
                else {
                  S34352=0;
                  if(!fillerStatus_in.isREQ()){//sysj\orchestrator.sysj line: 80, column: 4
                    fillerStatus_in.setACK(true);//sysj\orchestrator.sysj line: 80, column: 4
                    S34352=1;
                    if(fillerStatus_in.isREQ()){//sysj\orchestrator.sysj line: 80, column: 4
                      fillerStatus_in.setACK(false);//sysj\orchestrator.sysj line: 80, column: 4
                      ends[6]=2;
                      ;//sysj\orchestrator.sysj line: 80, column: 4
                      System.out.println("Orch: Received filler status");//sysj\orchestrator.sysj line: 81, column: 4
                      res_thread_6 = (String)(fillerStatus_in.getVal() == null ? null : ((String)fillerStatus_in.getVal()));//sysj\orchestrator.sysj line: 82, column: 4
                      recFillerStatus_1.setPresent();//sysj\orchestrator.sysj line: 83, column: 4
                      currsigs.addElement(recFillerStatus_1);
                      recFillerStatus_1.setValue(res_thread_6);//sysj\orchestrator.sysj line: 83, column: 4
                      S34306=0;
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

  public void thread37053(int [] tdone, int [] ends){
        switch(S34304){
      case 0 : 
        active[5]=0;
        ends[5]=0;
        tdone[5]=1;
        break;
      
      case 1 : 
        switch(S33366){
          case 0 : 
            if(sigCapLoaderReq_1.getprestatus()){//sysj\orchestrator.sysj line: 63, column: 10
              System.out.println("Orch: Sending cap loader request");//sysj\orchestrator.sysj line: 64, column: 4
              S33366=1;
              S33373=0;
              if(!capLoaderReq_o.isPartnerPresent() || capLoaderReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 65, column: 4
                capLoaderReq_o.setREQ(false);//sysj\orchestrator.sysj line: 65, column: 4
                S33373=1;
                active[5]=1;
                ends[5]=1;
                tdone[5]=1;
              }
              else {
                S33368=0;
                if(capLoaderReq_o.isACK()){//sysj\orchestrator.sysj line: 65, column: 4
                  capLoaderReq_o.setVal(true);//sysj\orchestrator.sysj line: 65, column: 4
                  S33368=1;
                  if(!capLoaderReq_o.isACK()){//sysj\orchestrator.sysj line: 65, column: 4
                    capLoaderReq_o.setREQ(false);//sysj\orchestrator.sysj line: 65, column: 4
                    ends[5]=2;
                    ;//sysj\orchestrator.sysj line: 65, column: 4
                    S33366=2;
                    S33417=0;
                    if(!capLoaderStatus_in.isPartnerPresent() || capLoaderStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 66, column: 4
                      capLoaderStatus_in.setACK(false);//sysj\orchestrator.sysj line: 66, column: 4
                      S33417=1;
                      active[5]=1;
                      ends[5]=1;
                      tdone[5]=1;
                    }
                    else {
                      S33412=0;
                      if(!capLoaderStatus_in.isREQ()){//sysj\orchestrator.sysj line: 66, column: 4
                        capLoaderStatus_in.setACK(true);//sysj\orchestrator.sysj line: 66, column: 4
                        S33412=1;
                        if(capLoaderStatus_in.isREQ()){//sysj\orchestrator.sysj line: 66, column: 4
                          capLoaderStatus_in.setACK(false);//sysj\orchestrator.sysj line: 66, column: 4
                          ends[5]=2;
                          ;//sysj\orchestrator.sysj line: 66, column: 4
                          System.out.println("Orch: Received cap loader status");//sysj\orchestrator.sysj line: 67, column: 4
                          res_thread_5 = (String)(capLoaderStatus_in.getVal() == null ? null : ((String)capLoaderStatus_in.getVal()));//sysj\orchestrator.sysj line: 69, column: 4
                          recCapLoaderStatus_1.setPresent();//sysj\orchestrator.sysj line: 70, column: 4
                          currsigs.addElement(recCapLoaderStatus_1);
                          recCapLoaderStatus_1.setValue(res_thread_5);//sysj\orchestrator.sysj line: 70, column: 4
                          S33366=0;
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
            switch(S33373){
              case 0 : 
                if(!capLoaderReq_o.isPartnerPresent() || capLoaderReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 65, column: 4
                  capLoaderReq_o.setREQ(false);//sysj\orchestrator.sysj line: 65, column: 4
                  S33373=1;
                  active[5]=1;
                  ends[5]=1;
                  tdone[5]=1;
                }
                else {
                  switch(S33368){
                    case 0 : 
                      if(capLoaderReq_o.isACK()){//sysj\orchestrator.sysj line: 65, column: 4
                        capLoaderReq_o.setVal(true);//sysj\orchestrator.sysj line: 65, column: 4
                        S33368=1;
                        if(!capLoaderReq_o.isACK()){//sysj\orchestrator.sysj line: 65, column: 4
                          capLoaderReq_o.setREQ(false);//sysj\orchestrator.sysj line: 65, column: 4
                          ends[5]=2;
                          ;//sysj\orchestrator.sysj line: 65, column: 4
                          S33366=2;
                          S33417=0;
                          if(!capLoaderStatus_in.isPartnerPresent() || capLoaderStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 66, column: 4
                            capLoaderStatus_in.setACK(false);//sysj\orchestrator.sysj line: 66, column: 4
                            S33417=1;
                            active[5]=1;
                            ends[5]=1;
                            tdone[5]=1;
                          }
                          else {
                            S33412=0;
                            if(!capLoaderStatus_in.isREQ()){//sysj\orchestrator.sysj line: 66, column: 4
                              capLoaderStatus_in.setACK(true);//sysj\orchestrator.sysj line: 66, column: 4
                              S33412=1;
                              if(capLoaderStatus_in.isREQ()){//sysj\orchestrator.sysj line: 66, column: 4
                                capLoaderStatus_in.setACK(false);//sysj\orchestrator.sysj line: 66, column: 4
                                ends[5]=2;
                                ;//sysj\orchestrator.sysj line: 66, column: 4
                                System.out.println("Orch: Received cap loader status");//sysj\orchestrator.sysj line: 67, column: 4
                                res_thread_5 = (String)(capLoaderStatus_in.getVal() == null ? null : ((String)capLoaderStatus_in.getVal()));//sysj\orchestrator.sysj line: 69, column: 4
                                recCapLoaderStatus_1.setPresent();//sysj\orchestrator.sysj line: 70, column: 4
                                currsigs.addElement(recCapLoaderStatus_1);
                                recCapLoaderStatus_1.setValue(res_thread_5);//sysj\orchestrator.sysj line: 70, column: 4
                                S33366=0;
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
                      if(!capLoaderReq_o.isACK()){//sysj\orchestrator.sysj line: 65, column: 4
                        capLoaderReq_o.setREQ(false);//sysj\orchestrator.sysj line: 65, column: 4
                        ends[5]=2;
                        ;//sysj\orchestrator.sysj line: 65, column: 4
                        S33366=2;
                        S33417=0;
                        if(!capLoaderStatus_in.isPartnerPresent() || capLoaderStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 66, column: 4
                          capLoaderStatus_in.setACK(false);//sysj\orchestrator.sysj line: 66, column: 4
                          S33417=1;
                          active[5]=1;
                          ends[5]=1;
                          tdone[5]=1;
                        }
                        else {
                          S33412=0;
                          if(!capLoaderStatus_in.isREQ()){//sysj\orchestrator.sysj line: 66, column: 4
                            capLoaderStatus_in.setACK(true);//sysj\orchestrator.sysj line: 66, column: 4
                            S33412=1;
                            if(capLoaderStatus_in.isREQ()){//sysj\orchestrator.sysj line: 66, column: 4
                              capLoaderStatus_in.setACK(false);//sysj\orchestrator.sysj line: 66, column: 4
                              ends[5]=2;
                              ;//sysj\orchestrator.sysj line: 66, column: 4
                              System.out.println("Orch: Received cap loader status");//sysj\orchestrator.sysj line: 67, column: 4
                              res_thread_5 = (String)(capLoaderStatus_in.getVal() == null ? null : ((String)capLoaderStatus_in.getVal()));//sysj\orchestrator.sysj line: 69, column: 4
                              recCapLoaderStatus_1.setPresent();//sysj\orchestrator.sysj line: 70, column: 4
                              currsigs.addElement(recCapLoaderStatus_1);
                              recCapLoaderStatus_1.setValue(res_thread_5);//sysj\orchestrator.sysj line: 70, column: 4
                              S33366=0;
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
                S33373=1;
                S33373=0;
                if(!capLoaderReq_o.isPartnerPresent() || capLoaderReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 65, column: 4
                  capLoaderReq_o.setREQ(false);//sysj\orchestrator.sysj line: 65, column: 4
                  S33373=1;
                  active[5]=1;
                  ends[5]=1;
                  tdone[5]=1;
                }
                else {
                  S33368=0;
                  if(capLoaderReq_o.isACK()){//sysj\orchestrator.sysj line: 65, column: 4
                    capLoaderReq_o.setVal(true);//sysj\orchestrator.sysj line: 65, column: 4
                    S33368=1;
                    if(!capLoaderReq_o.isACK()){//sysj\orchestrator.sysj line: 65, column: 4
                      capLoaderReq_o.setREQ(false);//sysj\orchestrator.sysj line: 65, column: 4
                      ends[5]=2;
                      ;//sysj\orchestrator.sysj line: 65, column: 4
                      S33366=2;
                      S33417=0;
                      if(!capLoaderStatus_in.isPartnerPresent() || capLoaderStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 66, column: 4
                        capLoaderStatus_in.setACK(false);//sysj\orchestrator.sysj line: 66, column: 4
                        S33417=1;
                        active[5]=1;
                        ends[5]=1;
                        tdone[5]=1;
                      }
                      else {
                        S33412=0;
                        if(!capLoaderStatus_in.isREQ()){//sysj\orchestrator.sysj line: 66, column: 4
                          capLoaderStatus_in.setACK(true);//sysj\orchestrator.sysj line: 66, column: 4
                          S33412=1;
                          if(capLoaderStatus_in.isREQ()){//sysj\orchestrator.sysj line: 66, column: 4
                            capLoaderStatus_in.setACK(false);//sysj\orchestrator.sysj line: 66, column: 4
                            ends[5]=2;
                            ;//sysj\orchestrator.sysj line: 66, column: 4
                            System.out.println("Orch: Received cap loader status");//sysj\orchestrator.sysj line: 67, column: 4
                            res_thread_5 = (String)(capLoaderStatus_in.getVal() == null ? null : ((String)capLoaderStatus_in.getVal()));//sysj\orchestrator.sysj line: 69, column: 4
                            recCapLoaderStatus_1.setPresent();//sysj\orchestrator.sysj line: 70, column: 4
                            currsigs.addElement(recCapLoaderStatus_1);
                            recCapLoaderStatus_1.setValue(res_thread_5);//sysj\orchestrator.sysj line: 70, column: 4
                            S33366=0;
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
            switch(S33417){
              case 0 : 
                if(!capLoaderStatus_in.isPartnerPresent() || capLoaderStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 66, column: 4
                  capLoaderStatus_in.setACK(false);//sysj\orchestrator.sysj line: 66, column: 4
                  S33417=1;
                  active[5]=1;
                  ends[5]=1;
                  tdone[5]=1;
                }
                else {
                  switch(S33412){
                    case 0 : 
                      if(!capLoaderStatus_in.isREQ()){//sysj\orchestrator.sysj line: 66, column: 4
                        capLoaderStatus_in.setACK(true);//sysj\orchestrator.sysj line: 66, column: 4
                        S33412=1;
                        if(capLoaderStatus_in.isREQ()){//sysj\orchestrator.sysj line: 66, column: 4
                          capLoaderStatus_in.setACK(false);//sysj\orchestrator.sysj line: 66, column: 4
                          ends[5]=2;
                          ;//sysj\orchestrator.sysj line: 66, column: 4
                          System.out.println("Orch: Received cap loader status");//sysj\orchestrator.sysj line: 67, column: 4
                          res_thread_5 = (String)(capLoaderStatus_in.getVal() == null ? null : ((String)capLoaderStatus_in.getVal()));//sysj\orchestrator.sysj line: 69, column: 4
                          recCapLoaderStatus_1.setPresent();//sysj\orchestrator.sysj line: 70, column: 4
                          currsigs.addElement(recCapLoaderStatus_1);
                          recCapLoaderStatus_1.setValue(res_thread_5);//sysj\orchestrator.sysj line: 70, column: 4
                          S33366=0;
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
                      if(capLoaderStatus_in.isREQ()){//sysj\orchestrator.sysj line: 66, column: 4
                        capLoaderStatus_in.setACK(false);//sysj\orchestrator.sysj line: 66, column: 4
                        ends[5]=2;
                        ;//sysj\orchestrator.sysj line: 66, column: 4
                        System.out.println("Orch: Received cap loader status");//sysj\orchestrator.sysj line: 67, column: 4
                        res_thread_5 = (String)(capLoaderStatus_in.getVal() == null ? null : ((String)capLoaderStatus_in.getVal()));//sysj\orchestrator.sysj line: 69, column: 4
                        recCapLoaderStatus_1.setPresent();//sysj\orchestrator.sysj line: 70, column: 4
                        currsigs.addElement(recCapLoaderStatus_1);
                        recCapLoaderStatus_1.setValue(res_thread_5);//sysj\orchestrator.sysj line: 70, column: 4
                        S33366=0;
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
                S33417=1;
                S33417=0;
                if(!capLoaderStatus_in.isPartnerPresent() || capLoaderStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 66, column: 4
                  capLoaderStatus_in.setACK(false);//sysj\orchestrator.sysj line: 66, column: 4
                  S33417=1;
                  active[5]=1;
                  ends[5]=1;
                  tdone[5]=1;
                }
                else {
                  S33412=0;
                  if(!capLoaderStatus_in.isREQ()){//sysj\orchestrator.sysj line: 66, column: 4
                    capLoaderStatus_in.setACK(true);//sysj\orchestrator.sysj line: 66, column: 4
                    S33412=1;
                    if(capLoaderStatus_in.isREQ()){//sysj\orchestrator.sysj line: 66, column: 4
                      capLoaderStatus_in.setACK(false);//sysj\orchestrator.sysj line: 66, column: 4
                      ends[5]=2;
                      ;//sysj\orchestrator.sysj line: 66, column: 4
                      System.out.println("Orch: Received cap loader status");//sysj\orchestrator.sysj line: 67, column: 4
                      res_thread_5 = (String)(capLoaderStatus_in.getVal() == null ? null : ((String)capLoaderStatus_in.getVal()));//sysj\orchestrator.sysj line: 69, column: 4
                      recCapLoaderStatus_1.setPresent();//sysj\orchestrator.sysj line: 70, column: 4
                      currsigs.addElement(recCapLoaderStatus_1);
                      recCapLoaderStatus_1.setValue(res_thread_5);//sysj\orchestrator.sysj line: 70, column: 4
                      S33366=0;
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

  public void thread37052(int [] tdone, int [] ends){
        switch(S33364){
      case 0 : 
        active[4]=0;
        ends[4]=0;
        tdone[4]=1;
        break;
      
      case 1 : 
        switch(S32426){
          case 0 : 
            if(sigCapperReq_1.getprestatus()){//sysj\orchestrator.sysj line: 51, column: 10
              System.out.println("Orch: Sending capper request");//sysj\orchestrator.sysj line: 52, column: 4
              S32426=1;
              S32433=0;
              if(!capperReq_o.isPartnerPresent() || capperReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 53, column: 4
                capperReq_o.setREQ(false);//sysj\orchestrator.sysj line: 53, column: 4
                S32433=1;
                active[4]=1;
                ends[4]=1;
                tdone[4]=1;
              }
              else {
                S32428=0;
                if(capperReq_o.isACK()){//sysj\orchestrator.sysj line: 53, column: 4
                  capperReq_o.setVal(true);//sysj\orchestrator.sysj line: 53, column: 4
                  S32428=1;
                  if(!capperReq_o.isACK()){//sysj\orchestrator.sysj line: 53, column: 4
                    capperReq_o.setREQ(false);//sysj\orchestrator.sysj line: 53, column: 4
                    ends[4]=2;
                    ;//sysj\orchestrator.sysj line: 53, column: 4
                    S32426=2;
                    S32477=0;
                    if(!capperStatus_in.isPartnerPresent() || capperStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 54, column: 4
                      capperStatus_in.setACK(false);//sysj\orchestrator.sysj line: 54, column: 4
                      S32477=1;
                      active[4]=1;
                      ends[4]=1;
                      tdone[4]=1;
                    }
                    else {
                      S32472=0;
                      if(!capperStatus_in.isREQ()){//sysj\orchestrator.sysj line: 54, column: 4
                        capperStatus_in.setACK(true);//sysj\orchestrator.sysj line: 54, column: 4
                        S32472=1;
                        if(capperStatus_in.isREQ()){//sysj\orchestrator.sysj line: 54, column: 4
                          capperStatus_in.setACK(false);//sysj\orchestrator.sysj line: 54, column: 4
                          ends[4]=2;
                          ;//sysj\orchestrator.sysj line: 54, column: 4
                          System.out.println("Orch: Received capper status");//sysj\orchestrator.sysj line: 55, column: 4
                          res_thread_4 = (String)(capperStatus_in.getVal() == null ? null : ((String)capperStatus_in.getVal()));//sysj\orchestrator.sysj line: 56, column: 4
                          recCapperStatus_1.setPresent();//sysj\orchestrator.sysj line: 57, column: 4
                          currsigs.addElement(recCapperStatus_1);
                          recCapperStatus_1.setValue(res_thread_4);//sysj\orchestrator.sysj line: 57, column: 4
                          S32426=0;
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
            switch(S32433){
              case 0 : 
                if(!capperReq_o.isPartnerPresent() || capperReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 53, column: 4
                  capperReq_o.setREQ(false);//sysj\orchestrator.sysj line: 53, column: 4
                  S32433=1;
                  active[4]=1;
                  ends[4]=1;
                  tdone[4]=1;
                }
                else {
                  switch(S32428){
                    case 0 : 
                      if(capperReq_o.isACK()){//sysj\orchestrator.sysj line: 53, column: 4
                        capperReq_o.setVal(true);//sysj\orchestrator.sysj line: 53, column: 4
                        S32428=1;
                        if(!capperReq_o.isACK()){//sysj\orchestrator.sysj line: 53, column: 4
                          capperReq_o.setREQ(false);//sysj\orchestrator.sysj line: 53, column: 4
                          ends[4]=2;
                          ;//sysj\orchestrator.sysj line: 53, column: 4
                          S32426=2;
                          S32477=0;
                          if(!capperStatus_in.isPartnerPresent() || capperStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 54, column: 4
                            capperStatus_in.setACK(false);//sysj\orchestrator.sysj line: 54, column: 4
                            S32477=1;
                            active[4]=1;
                            ends[4]=1;
                            tdone[4]=1;
                          }
                          else {
                            S32472=0;
                            if(!capperStatus_in.isREQ()){//sysj\orchestrator.sysj line: 54, column: 4
                              capperStatus_in.setACK(true);//sysj\orchestrator.sysj line: 54, column: 4
                              S32472=1;
                              if(capperStatus_in.isREQ()){//sysj\orchestrator.sysj line: 54, column: 4
                                capperStatus_in.setACK(false);//sysj\orchestrator.sysj line: 54, column: 4
                                ends[4]=2;
                                ;//sysj\orchestrator.sysj line: 54, column: 4
                                System.out.println("Orch: Received capper status");//sysj\orchestrator.sysj line: 55, column: 4
                                res_thread_4 = (String)(capperStatus_in.getVal() == null ? null : ((String)capperStatus_in.getVal()));//sysj\orchestrator.sysj line: 56, column: 4
                                recCapperStatus_1.setPresent();//sysj\orchestrator.sysj line: 57, column: 4
                                currsigs.addElement(recCapperStatus_1);
                                recCapperStatus_1.setValue(res_thread_4);//sysj\orchestrator.sysj line: 57, column: 4
                                S32426=0;
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
                      if(!capperReq_o.isACK()){//sysj\orchestrator.sysj line: 53, column: 4
                        capperReq_o.setREQ(false);//sysj\orchestrator.sysj line: 53, column: 4
                        ends[4]=2;
                        ;//sysj\orchestrator.sysj line: 53, column: 4
                        S32426=2;
                        S32477=0;
                        if(!capperStatus_in.isPartnerPresent() || capperStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 54, column: 4
                          capperStatus_in.setACK(false);//sysj\orchestrator.sysj line: 54, column: 4
                          S32477=1;
                          active[4]=1;
                          ends[4]=1;
                          tdone[4]=1;
                        }
                        else {
                          S32472=0;
                          if(!capperStatus_in.isREQ()){//sysj\orchestrator.sysj line: 54, column: 4
                            capperStatus_in.setACK(true);//sysj\orchestrator.sysj line: 54, column: 4
                            S32472=1;
                            if(capperStatus_in.isREQ()){//sysj\orchestrator.sysj line: 54, column: 4
                              capperStatus_in.setACK(false);//sysj\orchestrator.sysj line: 54, column: 4
                              ends[4]=2;
                              ;//sysj\orchestrator.sysj line: 54, column: 4
                              System.out.println("Orch: Received capper status");//sysj\orchestrator.sysj line: 55, column: 4
                              res_thread_4 = (String)(capperStatus_in.getVal() == null ? null : ((String)capperStatus_in.getVal()));//sysj\orchestrator.sysj line: 56, column: 4
                              recCapperStatus_1.setPresent();//sysj\orchestrator.sysj line: 57, column: 4
                              currsigs.addElement(recCapperStatus_1);
                              recCapperStatus_1.setValue(res_thread_4);//sysj\orchestrator.sysj line: 57, column: 4
                              S32426=0;
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
                S32433=1;
                S32433=0;
                if(!capperReq_o.isPartnerPresent() || capperReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 53, column: 4
                  capperReq_o.setREQ(false);//sysj\orchestrator.sysj line: 53, column: 4
                  S32433=1;
                  active[4]=1;
                  ends[4]=1;
                  tdone[4]=1;
                }
                else {
                  S32428=0;
                  if(capperReq_o.isACK()){//sysj\orchestrator.sysj line: 53, column: 4
                    capperReq_o.setVal(true);//sysj\orchestrator.sysj line: 53, column: 4
                    S32428=1;
                    if(!capperReq_o.isACK()){//sysj\orchestrator.sysj line: 53, column: 4
                      capperReq_o.setREQ(false);//sysj\orchestrator.sysj line: 53, column: 4
                      ends[4]=2;
                      ;//sysj\orchestrator.sysj line: 53, column: 4
                      S32426=2;
                      S32477=0;
                      if(!capperStatus_in.isPartnerPresent() || capperStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 54, column: 4
                        capperStatus_in.setACK(false);//sysj\orchestrator.sysj line: 54, column: 4
                        S32477=1;
                        active[4]=1;
                        ends[4]=1;
                        tdone[4]=1;
                      }
                      else {
                        S32472=0;
                        if(!capperStatus_in.isREQ()){//sysj\orchestrator.sysj line: 54, column: 4
                          capperStatus_in.setACK(true);//sysj\orchestrator.sysj line: 54, column: 4
                          S32472=1;
                          if(capperStatus_in.isREQ()){//sysj\orchestrator.sysj line: 54, column: 4
                            capperStatus_in.setACK(false);//sysj\orchestrator.sysj line: 54, column: 4
                            ends[4]=2;
                            ;//sysj\orchestrator.sysj line: 54, column: 4
                            System.out.println("Orch: Received capper status");//sysj\orchestrator.sysj line: 55, column: 4
                            res_thread_4 = (String)(capperStatus_in.getVal() == null ? null : ((String)capperStatus_in.getVal()));//sysj\orchestrator.sysj line: 56, column: 4
                            recCapperStatus_1.setPresent();//sysj\orchestrator.sysj line: 57, column: 4
                            currsigs.addElement(recCapperStatus_1);
                            recCapperStatus_1.setValue(res_thread_4);//sysj\orchestrator.sysj line: 57, column: 4
                            S32426=0;
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
            switch(S32477){
              case 0 : 
                if(!capperStatus_in.isPartnerPresent() || capperStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 54, column: 4
                  capperStatus_in.setACK(false);//sysj\orchestrator.sysj line: 54, column: 4
                  S32477=1;
                  active[4]=1;
                  ends[4]=1;
                  tdone[4]=1;
                }
                else {
                  switch(S32472){
                    case 0 : 
                      if(!capperStatus_in.isREQ()){//sysj\orchestrator.sysj line: 54, column: 4
                        capperStatus_in.setACK(true);//sysj\orchestrator.sysj line: 54, column: 4
                        S32472=1;
                        if(capperStatus_in.isREQ()){//sysj\orchestrator.sysj line: 54, column: 4
                          capperStatus_in.setACK(false);//sysj\orchestrator.sysj line: 54, column: 4
                          ends[4]=2;
                          ;//sysj\orchestrator.sysj line: 54, column: 4
                          System.out.println("Orch: Received capper status");//sysj\orchestrator.sysj line: 55, column: 4
                          res_thread_4 = (String)(capperStatus_in.getVal() == null ? null : ((String)capperStatus_in.getVal()));//sysj\orchestrator.sysj line: 56, column: 4
                          recCapperStatus_1.setPresent();//sysj\orchestrator.sysj line: 57, column: 4
                          currsigs.addElement(recCapperStatus_1);
                          recCapperStatus_1.setValue(res_thread_4);//sysj\orchestrator.sysj line: 57, column: 4
                          S32426=0;
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
                      if(capperStatus_in.isREQ()){//sysj\orchestrator.sysj line: 54, column: 4
                        capperStatus_in.setACK(false);//sysj\orchestrator.sysj line: 54, column: 4
                        ends[4]=2;
                        ;//sysj\orchestrator.sysj line: 54, column: 4
                        System.out.println("Orch: Received capper status");//sysj\orchestrator.sysj line: 55, column: 4
                        res_thread_4 = (String)(capperStatus_in.getVal() == null ? null : ((String)capperStatus_in.getVal()));//sysj\orchestrator.sysj line: 56, column: 4
                        recCapperStatus_1.setPresent();//sysj\orchestrator.sysj line: 57, column: 4
                        currsigs.addElement(recCapperStatus_1);
                        recCapperStatus_1.setValue(res_thread_4);//sysj\orchestrator.sysj line: 57, column: 4
                        S32426=0;
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
                S32477=1;
                S32477=0;
                if(!capperStatus_in.isPartnerPresent() || capperStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 54, column: 4
                  capperStatus_in.setACK(false);//sysj\orchestrator.sysj line: 54, column: 4
                  S32477=1;
                  active[4]=1;
                  ends[4]=1;
                  tdone[4]=1;
                }
                else {
                  S32472=0;
                  if(!capperStatus_in.isREQ()){//sysj\orchestrator.sysj line: 54, column: 4
                    capperStatus_in.setACK(true);//sysj\orchestrator.sysj line: 54, column: 4
                    S32472=1;
                    if(capperStatus_in.isREQ()){//sysj\orchestrator.sysj line: 54, column: 4
                      capperStatus_in.setACK(false);//sysj\orchestrator.sysj line: 54, column: 4
                      ends[4]=2;
                      ;//sysj\orchestrator.sysj line: 54, column: 4
                      System.out.println("Orch: Received capper status");//sysj\orchestrator.sysj line: 55, column: 4
                      res_thread_4 = (String)(capperStatus_in.getVal() == null ? null : ((String)capperStatus_in.getVal()));//sysj\orchestrator.sysj line: 56, column: 4
                      recCapperStatus_1.setPresent();//sysj\orchestrator.sysj line: 57, column: 4
                      currsigs.addElement(recCapperStatus_1);
                      recCapperStatus_1.setValue(res_thread_4);//sysj\orchestrator.sysj line: 57, column: 4
                      S32426=0;
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

  public void thread37051(int [] tdone, int [] ends){
        switch(S32424){
      case 0 : 
        active[3]=0;
        ends[3]=0;
        tdone[3]=1;
        break;
      
      case 1 : 
        switch(S31530){
          case 0 : 
            if(sigConveyorReq_1.getprestatus()){//sysj\orchestrator.sysj line: 41, column: 10
              S31530=1;
              S31492=0;
              if(!conveyorReq_o.isPartnerPresent() || conveyorReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 42, column: 4
                conveyorReq_o.setREQ(false);//sysj\orchestrator.sysj line: 42, column: 4
                S31492=1;
                active[3]=1;
                ends[3]=1;
                tdone[3]=1;
              }
              else {
                S31487=0;
                if(conveyorReq_o.isACK()){//sysj\orchestrator.sysj line: 42, column: 4
                  conveyorReq_o.setVal(true);//sysj\orchestrator.sysj line: 42, column: 4
                  S31487=1;
                  if(!conveyorReq_o.isACK()){//sysj\orchestrator.sysj line: 42, column: 4
                    conveyorReq_o.setREQ(false);//sysj\orchestrator.sysj line: 42, column: 4
                    ends[3]=2;
                    ;//sysj\orchestrator.sysj line: 42, column: 4
                    S31530=2;
                    S31537=0;
                    if(!conveyorStatus_in.isPartnerPresent() || conveyorStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 43, column: 4
                      conveyorStatus_in.setACK(false);//sysj\orchestrator.sysj line: 43, column: 4
                      S31537=1;
                      active[3]=1;
                      ends[3]=1;
                      tdone[3]=1;
                    }
                    else {
                      S31532=0;
                      if(!conveyorStatus_in.isREQ()){//sysj\orchestrator.sysj line: 43, column: 4
                        conveyorStatus_in.setACK(true);//sysj\orchestrator.sysj line: 43, column: 4
                        S31532=1;
                        if(conveyorStatus_in.isREQ()){//sysj\orchestrator.sysj line: 43, column: 4
                          conveyorStatus_in.setACK(false);//sysj\orchestrator.sysj line: 43, column: 4
                          ends[3]=2;
                          ;//sysj\orchestrator.sysj line: 43, column: 4
                          res_thread_3 = (String)(conveyorStatus_in.getVal() == null ? null : ((String)conveyorStatus_in.getVal()));//sysj\orchestrator.sysj line: 44, column: 4
                          recConveyorStatus_1.setPresent();//sysj\orchestrator.sysj line: 45, column: 4
                          currsigs.addElement(recConveyorStatus_1);
                          recConveyorStatus_1.setValue(res_thread_3);//sysj\orchestrator.sysj line: 45, column: 4
                          S31530=0;
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
            switch(S31492){
              case 0 : 
                if(!conveyorReq_o.isPartnerPresent() || conveyorReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 42, column: 4
                  conveyorReq_o.setREQ(false);//sysj\orchestrator.sysj line: 42, column: 4
                  S31492=1;
                  active[3]=1;
                  ends[3]=1;
                  tdone[3]=1;
                }
                else {
                  switch(S31487){
                    case 0 : 
                      if(conveyorReq_o.isACK()){//sysj\orchestrator.sysj line: 42, column: 4
                        conveyorReq_o.setVal(true);//sysj\orchestrator.sysj line: 42, column: 4
                        S31487=1;
                        if(!conveyorReq_o.isACK()){//sysj\orchestrator.sysj line: 42, column: 4
                          conveyorReq_o.setREQ(false);//sysj\orchestrator.sysj line: 42, column: 4
                          ends[3]=2;
                          ;//sysj\orchestrator.sysj line: 42, column: 4
                          S31530=2;
                          S31537=0;
                          if(!conveyorStatus_in.isPartnerPresent() || conveyorStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 43, column: 4
                            conveyorStatus_in.setACK(false);//sysj\orchestrator.sysj line: 43, column: 4
                            S31537=1;
                            active[3]=1;
                            ends[3]=1;
                            tdone[3]=1;
                          }
                          else {
                            S31532=0;
                            if(!conveyorStatus_in.isREQ()){//sysj\orchestrator.sysj line: 43, column: 4
                              conveyorStatus_in.setACK(true);//sysj\orchestrator.sysj line: 43, column: 4
                              S31532=1;
                              if(conveyorStatus_in.isREQ()){//sysj\orchestrator.sysj line: 43, column: 4
                                conveyorStatus_in.setACK(false);//sysj\orchestrator.sysj line: 43, column: 4
                                ends[3]=2;
                                ;//sysj\orchestrator.sysj line: 43, column: 4
                                res_thread_3 = (String)(conveyorStatus_in.getVal() == null ? null : ((String)conveyorStatus_in.getVal()));//sysj\orchestrator.sysj line: 44, column: 4
                                recConveyorStatus_1.setPresent();//sysj\orchestrator.sysj line: 45, column: 4
                                currsigs.addElement(recConveyorStatus_1);
                                recConveyorStatus_1.setValue(res_thread_3);//sysj\orchestrator.sysj line: 45, column: 4
                                S31530=0;
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
                      if(!conveyorReq_o.isACK()){//sysj\orchestrator.sysj line: 42, column: 4
                        conveyorReq_o.setREQ(false);//sysj\orchestrator.sysj line: 42, column: 4
                        ends[3]=2;
                        ;//sysj\orchestrator.sysj line: 42, column: 4
                        S31530=2;
                        S31537=0;
                        if(!conveyorStatus_in.isPartnerPresent() || conveyorStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 43, column: 4
                          conveyorStatus_in.setACK(false);//sysj\orchestrator.sysj line: 43, column: 4
                          S31537=1;
                          active[3]=1;
                          ends[3]=1;
                          tdone[3]=1;
                        }
                        else {
                          S31532=0;
                          if(!conveyorStatus_in.isREQ()){//sysj\orchestrator.sysj line: 43, column: 4
                            conveyorStatus_in.setACK(true);//sysj\orchestrator.sysj line: 43, column: 4
                            S31532=1;
                            if(conveyorStatus_in.isREQ()){//sysj\orchestrator.sysj line: 43, column: 4
                              conveyorStatus_in.setACK(false);//sysj\orchestrator.sysj line: 43, column: 4
                              ends[3]=2;
                              ;//sysj\orchestrator.sysj line: 43, column: 4
                              res_thread_3 = (String)(conveyorStatus_in.getVal() == null ? null : ((String)conveyorStatus_in.getVal()));//sysj\orchestrator.sysj line: 44, column: 4
                              recConveyorStatus_1.setPresent();//sysj\orchestrator.sysj line: 45, column: 4
                              currsigs.addElement(recConveyorStatus_1);
                              recConveyorStatus_1.setValue(res_thread_3);//sysj\orchestrator.sysj line: 45, column: 4
                              S31530=0;
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
                S31492=1;
                S31492=0;
                if(!conveyorReq_o.isPartnerPresent() || conveyorReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 42, column: 4
                  conveyorReq_o.setREQ(false);//sysj\orchestrator.sysj line: 42, column: 4
                  S31492=1;
                  active[3]=1;
                  ends[3]=1;
                  tdone[3]=1;
                }
                else {
                  S31487=0;
                  if(conveyorReq_o.isACK()){//sysj\orchestrator.sysj line: 42, column: 4
                    conveyorReq_o.setVal(true);//sysj\orchestrator.sysj line: 42, column: 4
                    S31487=1;
                    if(!conveyorReq_o.isACK()){//sysj\orchestrator.sysj line: 42, column: 4
                      conveyorReq_o.setREQ(false);//sysj\orchestrator.sysj line: 42, column: 4
                      ends[3]=2;
                      ;//sysj\orchestrator.sysj line: 42, column: 4
                      S31530=2;
                      S31537=0;
                      if(!conveyorStatus_in.isPartnerPresent() || conveyorStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 43, column: 4
                        conveyorStatus_in.setACK(false);//sysj\orchestrator.sysj line: 43, column: 4
                        S31537=1;
                        active[3]=1;
                        ends[3]=1;
                        tdone[3]=1;
                      }
                      else {
                        S31532=0;
                        if(!conveyorStatus_in.isREQ()){//sysj\orchestrator.sysj line: 43, column: 4
                          conveyorStatus_in.setACK(true);//sysj\orchestrator.sysj line: 43, column: 4
                          S31532=1;
                          if(conveyorStatus_in.isREQ()){//sysj\orchestrator.sysj line: 43, column: 4
                            conveyorStatus_in.setACK(false);//sysj\orchestrator.sysj line: 43, column: 4
                            ends[3]=2;
                            ;//sysj\orchestrator.sysj line: 43, column: 4
                            res_thread_3 = (String)(conveyorStatus_in.getVal() == null ? null : ((String)conveyorStatus_in.getVal()));//sysj\orchestrator.sysj line: 44, column: 4
                            recConveyorStatus_1.setPresent();//sysj\orchestrator.sysj line: 45, column: 4
                            currsigs.addElement(recConveyorStatus_1);
                            recConveyorStatus_1.setValue(res_thread_3);//sysj\orchestrator.sysj line: 45, column: 4
                            S31530=0;
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
            switch(S31537){
              case 0 : 
                if(!conveyorStatus_in.isPartnerPresent() || conveyorStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 43, column: 4
                  conveyorStatus_in.setACK(false);//sysj\orchestrator.sysj line: 43, column: 4
                  S31537=1;
                  active[3]=1;
                  ends[3]=1;
                  tdone[3]=1;
                }
                else {
                  switch(S31532){
                    case 0 : 
                      if(!conveyorStatus_in.isREQ()){//sysj\orchestrator.sysj line: 43, column: 4
                        conveyorStatus_in.setACK(true);//sysj\orchestrator.sysj line: 43, column: 4
                        S31532=1;
                        if(conveyorStatus_in.isREQ()){//sysj\orchestrator.sysj line: 43, column: 4
                          conveyorStatus_in.setACK(false);//sysj\orchestrator.sysj line: 43, column: 4
                          ends[3]=2;
                          ;//sysj\orchestrator.sysj line: 43, column: 4
                          res_thread_3 = (String)(conveyorStatus_in.getVal() == null ? null : ((String)conveyorStatus_in.getVal()));//sysj\orchestrator.sysj line: 44, column: 4
                          recConveyorStatus_1.setPresent();//sysj\orchestrator.sysj line: 45, column: 4
                          currsigs.addElement(recConveyorStatus_1);
                          recConveyorStatus_1.setValue(res_thread_3);//sysj\orchestrator.sysj line: 45, column: 4
                          S31530=0;
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
                      if(conveyorStatus_in.isREQ()){//sysj\orchestrator.sysj line: 43, column: 4
                        conveyorStatus_in.setACK(false);//sysj\orchestrator.sysj line: 43, column: 4
                        ends[3]=2;
                        ;//sysj\orchestrator.sysj line: 43, column: 4
                        res_thread_3 = (String)(conveyorStatus_in.getVal() == null ? null : ((String)conveyorStatus_in.getVal()));//sysj\orchestrator.sysj line: 44, column: 4
                        recConveyorStatus_1.setPresent();//sysj\orchestrator.sysj line: 45, column: 4
                        currsigs.addElement(recConveyorStatus_1);
                        recConveyorStatus_1.setValue(res_thread_3);//sysj\orchestrator.sysj line: 45, column: 4
                        S31530=0;
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
                S31537=1;
                S31537=0;
                if(!conveyorStatus_in.isPartnerPresent() || conveyorStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 43, column: 4
                  conveyorStatus_in.setACK(false);//sysj\orchestrator.sysj line: 43, column: 4
                  S31537=1;
                  active[3]=1;
                  ends[3]=1;
                  tdone[3]=1;
                }
                else {
                  S31532=0;
                  if(!conveyorStatus_in.isREQ()){//sysj\orchestrator.sysj line: 43, column: 4
                    conveyorStatus_in.setACK(true);//sysj\orchestrator.sysj line: 43, column: 4
                    S31532=1;
                    if(conveyorStatus_in.isREQ()){//sysj\orchestrator.sysj line: 43, column: 4
                      conveyorStatus_in.setACK(false);//sysj\orchestrator.sysj line: 43, column: 4
                      ends[3]=2;
                      ;//sysj\orchestrator.sysj line: 43, column: 4
                      res_thread_3 = (String)(conveyorStatus_in.getVal() == null ? null : ((String)conveyorStatus_in.getVal()));//sysj\orchestrator.sysj line: 44, column: 4
                      recConveyorStatus_1.setPresent();//sysj\orchestrator.sysj line: 45, column: 4
                      currsigs.addElement(recConveyorStatus_1);
                      recConveyorStatus_1.setValue(res_thread_3);//sysj\orchestrator.sysj line: 45, column: 4
                      S31530=0;
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

  public void thread37050(int [] tdone, int [] ends){
        switch(S31484){
      case 0 : 
        active[2]=0;
        ends[2]=0;
        tdone[2]=1;
        break;
      
      case 1 : 
        switch(S31288){
          case 0 : 
            switch(S31250){
              case 0 : 
                if(recConveyorStatus_1.getprestatus()){//sysj\orchestrator.sysj line: 25, column: 11
                  System.out.println("Orch: Received conveyor status");//sysj\orchestrator.sysj line: 26, column: 5
                  bottlePlaced_thread_2 = bottlePlaced_thread_2 - 1;//sysj\orchestrator.sysj line: 27, column: 5
                  S31250=1;
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
                if(getNextBottle_1.getprestatus()){//sysj\orchestrator.sysj line: 28, column: 11
                  System.out.println("Orch: Number of bottles left to do: " + bottlePlaced_thread_2);//sysj\orchestrator.sysj line: 29, column: 5
                  S31250=2;
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
                S31250=2;
                if(bottlePlaced_thread_2 >= 0){//sysj\orchestrator.sysj line: 22, column: 10
                  System.out.println("Orch: Sending conveyor request");//sysj\orchestrator.sysj line: 23, column: 5
                  sigConveyorReq_1.setPresent();//sysj\orchestrator.sysj line: 24, column: 5
                  currsigs.addElement(sigConveyorReq_1);
                  sigConveyorReq_1.setValue(true);//sysj\orchestrator.sysj line: 24, column: 5
                  S31250=0;
                  active[2]=1;
                  ends[2]=1;
                  tdone[2]=1;
                }
                else {
                  ends[2]=2;
                  ;//sysj\orchestrator.sysj line: 22, column: 4
                  System.out.println("Done order");//sysj\orchestrator.sysj line: 33, column: 4
                  S31288=1;
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
            S31288=2;
            bottlePlaced_thread_2 = quantity_thread_2;//sysj\orchestrator.sysj line: 21, column: 4
            S31288=0;
            if(bottlePlaced_thread_2 >= 0){//sysj\orchestrator.sysj line: 22, column: 10
              System.out.println("Orch: Sending conveyor request");//sysj\orchestrator.sysj line: 23, column: 5
              sigConveyorReq_1.setPresent();//sysj\orchestrator.sysj line: 24, column: 5
              currsigs.addElement(sigConveyorReq_1);
              sigConveyorReq_1.setValue(true);//sysj\orchestrator.sysj line: 24, column: 5
              S31250=0;
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            else {
              ends[2]=2;
              ;//sysj\orchestrator.sysj line: 22, column: 4
              System.out.println("Done order");//sysj\orchestrator.sysj line: 33, column: 4
              S31288=1;
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread37048(int [] tdone, int [] ends){
        S37038=1;
    liquidPercent_thread_8 = new ArrayList();//sysj\orchestrator.sysj line: 100, column: 3
    liquidPercent_thread_8.add(10);//sysj\orchestrator.sysj line: 101, column: 3
    liquidPercent_thread_8.add(10);//sysj\orchestrator.sysj line: 102, column: 3
    liquidPercent_thread_8.add(20);//sysj\orchestrator.sysj line: 103, column: 3
    liquidPercent_thread_8.add(60);//sysj\orchestrator.sysj line: 104, column: 3
    S36187=0;
    active[8]=1;
    ends[8]=1;
    tdone[8]=1;
  }

  public void thread37047(int [] tdone, int [] ends){
        S36184=1;
    S35246=0;
    active[7]=1;
    ends[7]=1;
    tdone[7]=1;
  }

  public void thread37046(int [] tdone, int [] ends){
        S35244=1;
    S34306=0;
    active[6]=1;
    ends[6]=1;
    tdone[6]=1;
  }

  public void thread37045(int [] tdone, int [] ends){
        S34304=1;
    S33366=0;
    active[5]=1;
    ends[5]=1;
    tdone[5]=1;
  }

  public void thread37044(int [] tdone, int [] ends){
        S33364=1;
    S32426=0;
    active[4]=1;
    ends[4]=1;
    tdone[4]=1;
  }

  public void thread37043(int [] tdone, int [] ends){
        S32424=1;
    S31530=0;
    active[3]=1;
    ends[3]=1;
    tdone[3]=1;
  }

  public void thread37042(int [] tdone, int [] ends){
        S31484=1;
    quantity_thread_2 = 10;//sysj\orchestrator.sysj line: 15, column: 3
    bottlePlaced_thread_2 = 0;//sysj\orchestrator.sysj line: 16, column: 3
    bottlePlaced_thread_2 = quantity_thread_2;//sysj\orchestrator.sysj line: 21, column: 4
    S31288=0;
    if(bottlePlaced_thread_2 >= 0){//sysj\orchestrator.sysj line: 22, column: 10
      System.out.println("Orch: Sending conveyor request");//sysj\orchestrator.sysj line: 23, column: 5
      sigConveyorReq_1.setPresent();//sysj\orchestrator.sysj line: 24, column: 5
      currsigs.addElement(sigConveyorReq_1);
      sigConveyorReq_1.setValue(true);//sysj\orchestrator.sysj line: 24, column: 5
      S31250=0;
      active[2]=1;
      ends[2]=1;
      tdone[2]=1;
    }
    else {
      ends[2]=2;
      ;//sysj\orchestrator.sysj line: 22, column: 4
      System.out.println("Done order");//sysj\orchestrator.sysj line: 33, column: 4
      S31288=1;
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
      switch(S37040){
        case 0 : 
          S37040=0;
          break RUN;
        
        case 1 : 
          S37040=2;
          S37040=2;
          sigConveyorReq_1.setClear();//sysj\orchestrator.sysj line: 9, column: 2
          sigCapperReq_1.setClear();//sysj\orchestrator.sysj line: 9, column: 2
          sigCapLoaderReq_1.setClear();//sysj\orchestrator.sysj line: 9, column: 2
          sigRotaryReq_1.setClear();//sysj\orchestrator.sysj line: 9, column: 2
          sigFillerReq_1.setClear();//sysj\orchestrator.sysj line: 10, column: 2
          recConveyorStatus_1.setClear();//sysj\orchestrator.sysj line: 11, column: 2
          recCapperStatus_1.setClear();//sysj\orchestrator.sysj line: 11, column: 2
          recCapLoaderStatus_1.setClear();//sysj\orchestrator.sysj line: 11, column: 2
          recFillerStatus_1.setClear();//sysj\orchestrator.sysj line: 11, column: 2
          recRotaryStatus_1.setClear();//sysj\orchestrator.sysj line: 11, column: 2
          getNextBottle_1.setClear();//sysj\orchestrator.sysj line: 12, column: 2
          thread37042(tdone,ends);
          thread37043(tdone,ends);
          thread37044(tdone,ends);
          thread37045(tdone,ends);
          thread37046(tdone,ends);
          thread37047(tdone,ends);
          thread37048(tdone,ends);
          int biggest37049 = 0;
          if(ends[2]>=biggest37049){
            biggest37049=ends[2];
          }
          if(ends[3]>=biggest37049){
            biggest37049=ends[3];
          }
          if(ends[4]>=biggest37049){
            biggest37049=ends[4];
          }
          if(ends[5]>=biggest37049){
            biggest37049=ends[5];
          }
          if(ends[6]>=biggest37049){
            biggest37049=ends[6];
          }
          if(ends[7]>=biggest37049){
            biggest37049=ends[7];
          }
          if(ends[8]>=biggest37049){
            biggest37049=ends[8];
          }
          if(biggest37049 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
        
        case 2 : 
          sigConveyorReq_1.setClear();//sysj\orchestrator.sysj line: 9, column: 2
          sigCapperReq_1.setClear();//sysj\orchestrator.sysj line: 9, column: 2
          sigCapLoaderReq_1.setClear();//sysj\orchestrator.sysj line: 9, column: 2
          sigRotaryReq_1.setClear();//sysj\orchestrator.sysj line: 9, column: 2
          sigFillerReq_1.setClear();//sysj\orchestrator.sysj line: 10, column: 2
          recConveyorStatus_1.setClear();//sysj\orchestrator.sysj line: 11, column: 2
          recCapperStatus_1.setClear();//sysj\orchestrator.sysj line: 11, column: 2
          recCapLoaderStatus_1.setClear();//sysj\orchestrator.sysj line: 11, column: 2
          recFillerStatus_1.setClear();//sysj\orchestrator.sysj line: 11, column: 2
          recRotaryStatus_1.setClear();//sysj\orchestrator.sysj line: 11, column: 2
          getNextBottle_1.setClear();//sysj\orchestrator.sysj line: 12, column: 2
          thread37050(tdone,ends);
          thread37051(tdone,ends);
          thread37052(tdone,ends);
          thread37053(tdone,ends);
          thread37054(tdone,ends);
          thread37055(tdone,ends);
          thread37056(tdone,ends);
          int biggest37069 = 0;
          if(ends[2]>=biggest37069){
            biggest37069=ends[2];
          }
          if(ends[3]>=biggest37069){
            biggest37069=ends[3];
          }
          if(ends[4]>=biggest37069){
            biggest37069=ends[4];
          }
          if(ends[5]>=biggest37069){
            biggest37069=ends[5];
          }
          if(ends[6]>=biggest37069){
            biggest37069=ends[6];
          }
          if(ends[7]>=biggest37069){
            biggest37069=ends[7];
          }
          if(ends[8]>=biggest37069){
            biggest37069=ends[8];
          }
          if(biggest37069 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
          //FINXME code
          if(biggest37069 == 0){
            S37040=0;
            active[1]=0;
            ends[1]=0;
            S37040=0;
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
    sigRotaryReq_1 = new Signal();
    sigFillerReq_1 = new Signal();
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
          df = true;
        }
        runClockDomain();
      }
      sigConveyorReq_1.setpreclear();
      sigCapperReq_1.setpreclear();
      sigCapLoaderReq_1.setpreclear();
      sigRotaryReq_1.setpreclear();
      sigFillerReq_1.setpreclear();
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
      sigRotaryReq_1.setClear();
      sigFillerReq_1.setClear();
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
      }
      runFinisher();
      if(active[1] == 0){
      	this.terminated = true;
      }
      if(!threaded) break;
    }
  }
}
