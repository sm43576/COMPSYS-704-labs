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
  public Signal recOrderStatus = new Signal("recOrderStatus", Signal.INPUT);
  public Signal order = new Signal("order", Signal.INPUT);
  public Signal orderStatus = new Signal("orderStatus", Signal.OUTPUT);
  public input_Channel conveyorStatus_in = new input_Channel();
  public input_Channel capperStatus_in = new input_Channel();
  public input_Channel capLoaderStatus_in = new input_Channel();
  public input_Channel fillerStatus_in = new input_Channel();
  public input_Channel rotaryStatus_in = new input_Channel();
  public output_Channel conveyorReq_o = new output_Channel();
  public output_Channel rotaryReq_o = new output_Channel();
  public output_Channel fillerReq_o = new output_Channel();
  public output_Channel capperReq_o = new output_Channel();
  public output_Channel capLoaderReq_o = new output_Channel();
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
  private Signal startOrder_1;
  private Signal orderIsDone_1;
  private Signal initABS_1;
  private Signal foundCurrentOrder_1;
  private Signal currentOrder_1;
  private ArrayList fifoQueue_thread_2;//sysj\orchestrator.sysj line: 25, column: 3
  private ArrayList liquidPercent_thread_2;//sysj\orchestrator.sysj line: 26, column: 3
  private int bottlePlaced_thread_5;//sysj\orchestrator.sysj line: 161, column: 3
  private Order nextOrder_thread_2;//sysj\orchestrator.sysj line: 83, column: 8
  private Order newOrder_thread_2;//sysj\orchestrator.sysj line: 35, column: 6
  private Order tempOrder_thread_2;//sysj\orchestrator.sysj line: 43, column: 7
  private Order myOrder_thread_4;//sysj\orchestrator.sysj line: 126, column: 6
  private Order order_thread_5;//sysj\orchestrator.sysj line: 166, column: 5
  private String res_thread_6;//sysj\orchestrator.sysj line: 192, column: 4
  private String res_thread_7;//sysj\orchestrator.sysj line: 204, column: 4
  private String res_thread_8;//sysj\orchestrator.sysj line: 217, column: 4
  private ArrayList req_thread_9;//sysj\orchestrator.sysj line: 226, column: 4
  private String res_thread_9;//sysj\orchestrator.sysj line: 230, column: 4
  private String res_thread_10;//sysj\orchestrator.sysj line: 242, column: 4
  private Order order_thread_11;//sysj\orchestrator.sysj line: 259, column: 5
  private ArrayList liquidPercent_thread_11;//sysj\orchestrator.sysj line: 260, column: 5
  private int S38202 = 1;
  private int S32857 = 1;
  private int S31521 = 1;
  private int S31301 = 1;
  private int S32874 = 1;
  private int S32862 = 1;
  private int S32900 = 1;
  private int S33202 = 1;
  private int S32950 = 1;
  private int S32901 = 1;
  private int S32902 = 1;
  private int S34142 = 1;
  private int S33248 = 1;
  private int S33210 = 1;
  private int S33205 = 1;
  private int S33255 = 1;
  private int S33250 = 1;
  private int S35082 = 1;
  private int S34144 = 1;
  private int S34151 = 1;
  private int S34146 = 1;
  private int S34195 = 1;
  private int S34190 = 1;
  private int S36022 = 1;
  private int S35084 = 1;
  private int S35091 = 1;
  private int S35086 = 1;
  private int S35135 = 1;
  private int S35130 = 1;
  private int S36962 = 1;
  private int S36024 = 1;
  private int S36031 = 1;
  private int S36026 = 1;
  private int S36075 = 1;
  private int S36070 = 1;
  private int S37902 = 1;
  private int S36964 = 1;
  private int S36971 = 1;
  private int S36966 = 1;
  private int S37015 = 1;
  private int S37010 = 1;
  private int S38200 = 1;
  private int S37904 = 1;
  private int S37908 = 1;
  private int S37911 = 1;
  private int S37914 = 1;
  private int S37917 = 1;
  
  private int[] ends = new int[15];
  private int[] tdone = new int[15];
  
  public void thread38231(int [] tdone, int [] ends){
        switch(S37917){
      case 0 : 
        active[14]=0;
        ends[14]=0;
        tdone[14]=1;
        break;
      
      case 1 : 
        if(recCapperStatus_1.getprestatus()){//sysj\orchestrator.sysj line: 266, column: 73
          S37917=0;
          active[14]=0;
          ends[14]=0;
          tdone[14]=1;
        }
        else {
          active[14]=1;
          ends[14]=1;
          tdone[14]=1;
        }
        break;
      
    }
  }

  public void thread38230(int [] tdone, int [] ends){
        switch(S37914){
      case 0 : 
        active[13]=0;
        ends[13]=0;
        tdone[13]=1;
        break;
      
      case 1 : 
        if(recCapLoaderStatus_1.getprestatus()){//sysj\orchestrator.sysj line: 266, column: 41
          S37914=0;
          active[13]=0;
          ends[13]=0;
          tdone[13]=1;
        }
        else {
          active[13]=1;
          ends[13]=1;
          tdone[13]=1;
        }
        break;
      
    }
  }

  public void thread38229(int [] tdone, int [] ends){
        switch(S37911){
      case 0 : 
        active[12]=0;
        ends[12]=0;
        tdone[12]=1;
        break;
      
      case 1 : 
        if(recFillerStatus_1.getprestatus()){//sysj\orchestrator.sysj line: 266, column: 12
          S37911=0;
          active[12]=0;
          ends[12]=0;
          tdone[12]=1;
        }
        else {
          active[12]=1;
          ends[12]=1;
          tdone[12]=1;
        }
        break;
      
    }
  }

  public void thread38227(int [] tdone, int [] ends){
        S37917=1;
    active[14]=1;
    ends[14]=1;
    tdone[14]=1;
  }

  public void thread38226(int [] tdone, int [] ends){
        S37914=1;
    active[13]=1;
    ends[13]=1;
    tdone[13]=1;
  }

  public void thread38225(int [] tdone, int [] ends){
        S37911=1;
    active[12]=1;
    ends[12]=1;
    tdone[12]=1;
  }

  public void thread38224(int [] tdone, int [] ends){
        switch(S38200){
      case 0 : 
        active[11]=0;
        ends[11]=0;
        tdone[11]=1;
        break;
      
      case 1 : 
        switch(S37904){
          case 0 : 
            if(recConveyorStatus_1.getprestatus()){//sysj\orchestrator.sysj line: 251, column: 10
              sigRotaryReq_1.setPresent();//sysj\orchestrator.sysj line: 252, column: 4
              currsigs.addElement(sigRotaryReq_1);
              S37904=1;
              active[11]=1;
              ends[11]=1;
              tdone[11]=1;
            }
            else {
              active[11]=1;
              ends[11]=1;
              tdone[11]=1;
            }
            break;
          
          case 1 : 
            if(recRotaryStatus_1.getprestatus()){//sysj\orchestrator.sysj line: 253, column: 10
              S37904=2;
              S37908=0;
              active[11]=1;
              ends[11]=1;
              tdone[11]=1;
            }
            else {
              active[11]=1;
              ends[11]=1;
              tdone[11]=1;
            }
            break;
          
          case 2 : 
            switch(S37908){
              case 0 : 
                if(currentOrder_1.getprestatus()){//sysj\orchestrator.sysj line: 256, column: 11
                  System.out.println("Orch: New bottle. Preparing to send requests..");//sysj\orchestrator.sysj line: 257, column: 5
                  order_thread_11 = (Order)(currentOrder_1.getpreval() == null ? null : ((Order)currentOrder_1.getpreval()));//sysj\orchestrator.sysj line: 259, column: 5
                  liquidPercent_thread_11 = (ArrayList)order_thread_11.getLiquidPercentageArray();//sysj\orchestrator.sysj line: 260, column: 5
                  sigFillerReq_1.setPresent();//sysj\orchestrator.sysj line: 263, column: 5
                  currsigs.addElement(sigFillerReq_1);
                  sigFillerReq_1.setValue(liquidPercent_thread_11);//sysj\orchestrator.sysj line: 263, column: 5
                  sigCapLoaderReq_1.setPresent();//sysj\orchestrator.sysj line: 264, column: 5
                  currsigs.addElement(sigCapLoaderReq_1);
                  sigCapperReq_1.setPresent();//sysj\orchestrator.sysj line: 265, column: 5
                  currsigs.addElement(sigCapperReq_1);
                  S37908=1;
                  thread38225(tdone,ends);
                  thread38226(tdone,ends);
                  thread38227(tdone,ends);
                  int biggest38228 = 0;
                  if(ends[12]>=biggest38228){
                    biggest38228=ends[12];
                  }
                  if(ends[13]>=biggest38228){
                    biggest38228=ends[13];
                  }
                  if(ends[14]>=biggest38228){
                    biggest38228=ends[14];
                  }
                  if(biggest38228 == 1){
                    active[11]=1;
                    ends[11]=1;
                    tdone[11]=1;
                  }
                }
                else {
                  active[11]=1;
                  ends[11]=1;
                  tdone[11]=1;
                }
                break;
              
              case 1 : 
                thread38229(tdone,ends);
                thread38230(tdone,ends);
                thread38231(tdone,ends);
                int biggest38232 = 0;
                if(ends[12]>=biggest38232){
                  biggest38232=ends[12];
                }
                if(ends[13]>=biggest38232){
                  biggest38232=ends[13];
                }
                if(ends[14]>=biggest38232){
                  biggest38232=ends[14];
                }
                if(biggest38232 == 1){
                  active[11]=1;
                  ends[11]=1;
                  tdone[11]=1;
                }
                //FINXME code
                if(biggest38232 == 0){
                  System.out.println("Orch: All done!");//sysj\orchestrator.sysj line: 267, column: 5
                  getNextBottle_1.setPresent();//sysj\orchestrator.sysj line: 270, column: 5
                  currsigs.addElement(getNextBottle_1);
                  S37908=2;
                  active[11]=1;
                  ends[11]=1;
                  tdone[11]=1;
                }
                break;
              
              case 2 : 
                if(recConveyorStatus_1.getprestatus()){//sysj\orchestrator.sysj line: 271, column: 11
                  sigRotaryReq_1.setPresent();//sysj\orchestrator.sysj line: 273, column: 5
                  currsigs.addElement(sigRotaryReq_1);
                  S37908=3;
                  active[11]=1;
                  ends[11]=1;
                  tdone[11]=1;
                }
                else {
                  active[11]=1;
                  ends[11]=1;
                  tdone[11]=1;
                }
                break;
              
              case 3 : 
                if(recRotaryStatus_1.getprestatus()){//sysj\orchestrator.sysj line: 274, column: 11
                  S37908=4;
                  active[11]=1;
                  ends[11]=1;
                  tdone[11]=1;
                }
                else {
                  active[11]=1;
                  ends[11]=1;
                  tdone[11]=1;
                }
                break;
              
              case 4 : 
                S37908=4;
                S37908=0;
                active[11]=1;
                ends[11]=1;
                tdone[11]=1;
                break;
              
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread38223(int [] tdone, int [] ends){
        switch(S37902){
      case 0 : 
        active[10]=0;
        ends[10]=0;
        tdone[10]=1;
        break;
      
      case 1 : 
        switch(S36964){
          case 0 : 
            if(sigRotaryReq_1.getprestatus()){//sysj\orchestrator.sysj line: 237, column: 10
              System.out.println("Orch: Sending rotary request");//sysj\orchestrator.sysj line: 238, column: 4
              S36964=1;
              S36971=0;
              if(!rotaryReq_o.isPartnerPresent() || rotaryReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 239, column: 4
                rotaryReq_o.setREQ(false);//sysj\orchestrator.sysj line: 239, column: 4
                S36971=1;
                active[10]=1;
                ends[10]=1;
                tdone[10]=1;
              }
              else {
                S36966=0;
                if(rotaryReq_o.isACK()){//sysj\orchestrator.sysj line: 239, column: 4
                  rotaryReq_o.setVal(true);//sysj\orchestrator.sysj line: 239, column: 4
                  S36966=1;
                  if(!rotaryReq_o.isACK()){//sysj\orchestrator.sysj line: 239, column: 4
                    rotaryReq_o.setREQ(false);//sysj\orchestrator.sysj line: 239, column: 4
                    ends[10]=2;
                    ;//sysj\orchestrator.sysj line: 239, column: 4
                    S36964=2;
                    S37015=0;
                    if(!rotaryStatus_in.isPartnerPresent() || rotaryStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 240, column: 4
                      rotaryStatus_in.setACK(false);//sysj\orchestrator.sysj line: 240, column: 4
                      S37015=1;
                      active[10]=1;
                      ends[10]=1;
                      tdone[10]=1;
                    }
                    else {
                      S37010=0;
                      if(!rotaryStatus_in.isREQ()){//sysj\orchestrator.sysj line: 240, column: 4
                        rotaryStatus_in.setACK(true);//sysj\orchestrator.sysj line: 240, column: 4
                        S37010=1;
                        if(rotaryStatus_in.isREQ()){//sysj\orchestrator.sysj line: 240, column: 4
                          rotaryStatus_in.setACK(false);//sysj\orchestrator.sysj line: 240, column: 4
                          ends[10]=2;
                          ;//sysj\orchestrator.sysj line: 240, column: 4
                          System.out.println("Orch: Received rotary status");//sysj\orchestrator.sysj line: 241, column: 4
                          res_thread_10 = (String)(rotaryStatus_in.getVal() == null ? null : ((String)rotaryStatus_in.getVal()));//sysj\orchestrator.sysj line: 242, column: 4
                          recRotaryStatus_1.setPresent();//sysj\orchestrator.sysj line: 243, column: 4
                          currsigs.addElement(recRotaryStatus_1);
                          recRotaryStatus_1.setValue(res_thread_10);//sysj\orchestrator.sysj line: 243, column: 4
                          S36964=0;
                          active[10]=1;
                          ends[10]=1;
                          tdone[10]=1;
                        }
                        else {
                          active[10]=1;
                          ends[10]=1;
                          tdone[10]=1;
                        }
                      }
                      else {
                        active[10]=1;
                        ends[10]=1;
                        tdone[10]=1;
                      }
                    }
                  }
                  else {
                    active[10]=1;
                    ends[10]=1;
                    tdone[10]=1;
                  }
                }
                else {
                  active[10]=1;
                  ends[10]=1;
                  tdone[10]=1;
                }
              }
            }
            else {
              active[10]=1;
              ends[10]=1;
              tdone[10]=1;
            }
            break;
          
          case 1 : 
            switch(S36971){
              case 0 : 
                if(!rotaryReq_o.isPartnerPresent() || rotaryReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 239, column: 4
                  rotaryReq_o.setREQ(false);//sysj\orchestrator.sysj line: 239, column: 4
                  S36971=1;
                  active[10]=1;
                  ends[10]=1;
                  tdone[10]=1;
                }
                else {
                  switch(S36966){
                    case 0 : 
                      if(rotaryReq_o.isACK()){//sysj\orchestrator.sysj line: 239, column: 4
                        rotaryReq_o.setVal(true);//sysj\orchestrator.sysj line: 239, column: 4
                        S36966=1;
                        if(!rotaryReq_o.isACK()){//sysj\orchestrator.sysj line: 239, column: 4
                          rotaryReq_o.setREQ(false);//sysj\orchestrator.sysj line: 239, column: 4
                          ends[10]=2;
                          ;//sysj\orchestrator.sysj line: 239, column: 4
                          S36964=2;
                          S37015=0;
                          if(!rotaryStatus_in.isPartnerPresent() || rotaryStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 240, column: 4
                            rotaryStatus_in.setACK(false);//sysj\orchestrator.sysj line: 240, column: 4
                            S37015=1;
                            active[10]=1;
                            ends[10]=1;
                            tdone[10]=1;
                          }
                          else {
                            S37010=0;
                            if(!rotaryStatus_in.isREQ()){//sysj\orchestrator.sysj line: 240, column: 4
                              rotaryStatus_in.setACK(true);//sysj\orchestrator.sysj line: 240, column: 4
                              S37010=1;
                              if(rotaryStatus_in.isREQ()){//sysj\orchestrator.sysj line: 240, column: 4
                                rotaryStatus_in.setACK(false);//sysj\orchestrator.sysj line: 240, column: 4
                                ends[10]=2;
                                ;//sysj\orchestrator.sysj line: 240, column: 4
                                System.out.println("Orch: Received rotary status");//sysj\orchestrator.sysj line: 241, column: 4
                                res_thread_10 = (String)(rotaryStatus_in.getVal() == null ? null : ((String)rotaryStatus_in.getVal()));//sysj\orchestrator.sysj line: 242, column: 4
                                recRotaryStatus_1.setPresent();//sysj\orchestrator.sysj line: 243, column: 4
                                currsigs.addElement(recRotaryStatus_1);
                                recRotaryStatus_1.setValue(res_thread_10);//sysj\orchestrator.sysj line: 243, column: 4
                                S36964=0;
                                active[10]=1;
                                ends[10]=1;
                                tdone[10]=1;
                              }
                              else {
                                active[10]=1;
                                ends[10]=1;
                                tdone[10]=1;
                              }
                            }
                            else {
                              active[10]=1;
                              ends[10]=1;
                              tdone[10]=1;
                            }
                          }
                        }
                        else {
                          active[10]=1;
                          ends[10]=1;
                          tdone[10]=1;
                        }
                      }
                      else {
                        active[10]=1;
                        ends[10]=1;
                        tdone[10]=1;
                      }
                      break;
                    
                    case 1 : 
                      if(!rotaryReq_o.isACK()){//sysj\orchestrator.sysj line: 239, column: 4
                        rotaryReq_o.setREQ(false);//sysj\orchestrator.sysj line: 239, column: 4
                        ends[10]=2;
                        ;//sysj\orchestrator.sysj line: 239, column: 4
                        S36964=2;
                        S37015=0;
                        if(!rotaryStatus_in.isPartnerPresent() || rotaryStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 240, column: 4
                          rotaryStatus_in.setACK(false);//sysj\orchestrator.sysj line: 240, column: 4
                          S37015=1;
                          active[10]=1;
                          ends[10]=1;
                          tdone[10]=1;
                        }
                        else {
                          S37010=0;
                          if(!rotaryStatus_in.isREQ()){//sysj\orchestrator.sysj line: 240, column: 4
                            rotaryStatus_in.setACK(true);//sysj\orchestrator.sysj line: 240, column: 4
                            S37010=1;
                            if(rotaryStatus_in.isREQ()){//sysj\orchestrator.sysj line: 240, column: 4
                              rotaryStatus_in.setACK(false);//sysj\orchestrator.sysj line: 240, column: 4
                              ends[10]=2;
                              ;//sysj\orchestrator.sysj line: 240, column: 4
                              System.out.println("Orch: Received rotary status");//sysj\orchestrator.sysj line: 241, column: 4
                              res_thread_10 = (String)(rotaryStatus_in.getVal() == null ? null : ((String)rotaryStatus_in.getVal()));//sysj\orchestrator.sysj line: 242, column: 4
                              recRotaryStatus_1.setPresent();//sysj\orchestrator.sysj line: 243, column: 4
                              currsigs.addElement(recRotaryStatus_1);
                              recRotaryStatus_1.setValue(res_thread_10);//sysj\orchestrator.sysj line: 243, column: 4
                              S36964=0;
                              active[10]=1;
                              ends[10]=1;
                              tdone[10]=1;
                            }
                            else {
                              active[10]=1;
                              ends[10]=1;
                              tdone[10]=1;
                            }
                          }
                          else {
                            active[10]=1;
                            ends[10]=1;
                            tdone[10]=1;
                          }
                        }
                      }
                      else {
                        active[10]=1;
                        ends[10]=1;
                        tdone[10]=1;
                      }
                      break;
                    
                  }
                }
                break;
              
              case 1 : 
                S36971=1;
                S36971=0;
                if(!rotaryReq_o.isPartnerPresent() || rotaryReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 239, column: 4
                  rotaryReq_o.setREQ(false);//sysj\orchestrator.sysj line: 239, column: 4
                  S36971=1;
                  active[10]=1;
                  ends[10]=1;
                  tdone[10]=1;
                }
                else {
                  S36966=0;
                  if(rotaryReq_o.isACK()){//sysj\orchestrator.sysj line: 239, column: 4
                    rotaryReq_o.setVal(true);//sysj\orchestrator.sysj line: 239, column: 4
                    S36966=1;
                    if(!rotaryReq_o.isACK()){//sysj\orchestrator.sysj line: 239, column: 4
                      rotaryReq_o.setREQ(false);//sysj\orchestrator.sysj line: 239, column: 4
                      ends[10]=2;
                      ;//sysj\orchestrator.sysj line: 239, column: 4
                      S36964=2;
                      S37015=0;
                      if(!rotaryStatus_in.isPartnerPresent() || rotaryStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 240, column: 4
                        rotaryStatus_in.setACK(false);//sysj\orchestrator.sysj line: 240, column: 4
                        S37015=1;
                        active[10]=1;
                        ends[10]=1;
                        tdone[10]=1;
                      }
                      else {
                        S37010=0;
                        if(!rotaryStatus_in.isREQ()){//sysj\orchestrator.sysj line: 240, column: 4
                          rotaryStatus_in.setACK(true);//sysj\orchestrator.sysj line: 240, column: 4
                          S37010=1;
                          if(rotaryStatus_in.isREQ()){//sysj\orchestrator.sysj line: 240, column: 4
                            rotaryStatus_in.setACK(false);//sysj\orchestrator.sysj line: 240, column: 4
                            ends[10]=2;
                            ;//sysj\orchestrator.sysj line: 240, column: 4
                            System.out.println("Orch: Received rotary status");//sysj\orchestrator.sysj line: 241, column: 4
                            res_thread_10 = (String)(rotaryStatus_in.getVal() == null ? null : ((String)rotaryStatus_in.getVal()));//sysj\orchestrator.sysj line: 242, column: 4
                            recRotaryStatus_1.setPresent();//sysj\orchestrator.sysj line: 243, column: 4
                            currsigs.addElement(recRotaryStatus_1);
                            recRotaryStatus_1.setValue(res_thread_10);//sysj\orchestrator.sysj line: 243, column: 4
                            S36964=0;
                            active[10]=1;
                            ends[10]=1;
                            tdone[10]=1;
                          }
                          else {
                            active[10]=1;
                            ends[10]=1;
                            tdone[10]=1;
                          }
                        }
                        else {
                          active[10]=1;
                          ends[10]=1;
                          tdone[10]=1;
                        }
                      }
                    }
                    else {
                      active[10]=1;
                      ends[10]=1;
                      tdone[10]=1;
                    }
                  }
                  else {
                    active[10]=1;
                    ends[10]=1;
                    tdone[10]=1;
                  }
                }
                break;
              
            }
            break;
          
          case 2 : 
            switch(S37015){
              case 0 : 
                if(!rotaryStatus_in.isPartnerPresent() || rotaryStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 240, column: 4
                  rotaryStatus_in.setACK(false);//sysj\orchestrator.sysj line: 240, column: 4
                  S37015=1;
                  active[10]=1;
                  ends[10]=1;
                  tdone[10]=1;
                }
                else {
                  switch(S37010){
                    case 0 : 
                      if(!rotaryStatus_in.isREQ()){//sysj\orchestrator.sysj line: 240, column: 4
                        rotaryStatus_in.setACK(true);//sysj\orchestrator.sysj line: 240, column: 4
                        S37010=1;
                        if(rotaryStatus_in.isREQ()){//sysj\orchestrator.sysj line: 240, column: 4
                          rotaryStatus_in.setACK(false);//sysj\orchestrator.sysj line: 240, column: 4
                          ends[10]=2;
                          ;//sysj\orchestrator.sysj line: 240, column: 4
                          System.out.println("Orch: Received rotary status");//sysj\orchestrator.sysj line: 241, column: 4
                          res_thread_10 = (String)(rotaryStatus_in.getVal() == null ? null : ((String)rotaryStatus_in.getVal()));//sysj\orchestrator.sysj line: 242, column: 4
                          recRotaryStatus_1.setPresent();//sysj\orchestrator.sysj line: 243, column: 4
                          currsigs.addElement(recRotaryStatus_1);
                          recRotaryStatus_1.setValue(res_thread_10);//sysj\orchestrator.sysj line: 243, column: 4
                          S36964=0;
                          active[10]=1;
                          ends[10]=1;
                          tdone[10]=1;
                        }
                        else {
                          active[10]=1;
                          ends[10]=1;
                          tdone[10]=1;
                        }
                      }
                      else {
                        active[10]=1;
                        ends[10]=1;
                        tdone[10]=1;
                      }
                      break;
                    
                    case 1 : 
                      if(rotaryStatus_in.isREQ()){//sysj\orchestrator.sysj line: 240, column: 4
                        rotaryStatus_in.setACK(false);//sysj\orchestrator.sysj line: 240, column: 4
                        ends[10]=2;
                        ;//sysj\orchestrator.sysj line: 240, column: 4
                        System.out.println("Orch: Received rotary status");//sysj\orchestrator.sysj line: 241, column: 4
                        res_thread_10 = (String)(rotaryStatus_in.getVal() == null ? null : ((String)rotaryStatus_in.getVal()));//sysj\orchestrator.sysj line: 242, column: 4
                        recRotaryStatus_1.setPresent();//sysj\orchestrator.sysj line: 243, column: 4
                        currsigs.addElement(recRotaryStatus_1);
                        recRotaryStatus_1.setValue(res_thread_10);//sysj\orchestrator.sysj line: 243, column: 4
                        S36964=0;
                        active[10]=1;
                        ends[10]=1;
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
                break;
              
              case 1 : 
                S37015=1;
                S37015=0;
                if(!rotaryStatus_in.isPartnerPresent() || rotaryStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 240, column: 4
                  rotaryStatus_in.setACK(false);//sysj\orchestrator.sysj line: 240, column: 4
                  S37015=1;
                  active[10]=1;
                  ends[10]=1;
                  tdone[10]=1;
                }
                else {
                  S37010=0;
                  if(!rotaryStatus_in.isREQ()){//sysj\orchestrator.sysj line: 240, column: 4
                    rotaryStatus_in.setACK(true);//sysj\orchestrator.sysj line: 240, column: 4
                    S37010=1;
                    if(rotaryStatus_in.isREQ()){//sysj\orchestrator.sysj line: 240, column: 4
                      rotaryStatus_in.setACK(false);//sysj\orchestrator.sysj line: 240, column: 4
                      ends[10]=2;
                      ;//sysj\orchestrator.sysj line: 240, column: 4
                      System.out.println("Orch: Received rotary status");//sysj\orchestrator.sysj line: 241, column: 4
                      res_thread_10 = (String)(rotaryStatus_in.getVal() == null ? null : ((String)rotaryStatus_in.getVal()));//sysj\orchestrator.sysj line: 242, column: 4
                      recRotaryStatus_1.setPresent();//sysj\orchestrator.sysj line: 243, column: 4
                      currsigs.addElement(recRotaryStatus_1);
                      recRotaryStatus_1.setValue(res_thread_10);//sysj\orchestrator.sysj line: 243, column: 4
                      S36964=0;
                      active[10]=1;
                      ends[10]=1;
                      tdone[10]=1;
                    }
                    else {
                      active[10]=1;
                      ends[10]=1;
                      tdone[10]=1;
                    }
                  }
                  else {
                    active[10]=1;
                    ends[10]=1;
                    tdone[10]=1;
                  }
                }
                break;
              
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread38222(int [] tdone, int [] ends){
        switch(S36962){
      case 0 : 
        active[9]=0;
        ends[9]=0;
        tdone[9]=1;
        break;
      
      case 1 : 
        switch(S36024){
          case 0 : 
            if(sigFillerReq_1.getprestatus()){//sysj\orchestrator.sysj line: 224, column: 10
              System.out.println("Orch: Sending filler request");//sysj\orchestrator.sysj line: 225, column: 4
              req_thread_9 = (ArrayList)(sigFillerReq_1.getpreval() == null ? null : ((ArrayList)sigFillerReq_1.getpreval()));//sysj\orchestrator.sysj line: 226, column: 4
              S36024=1;
              S36031=0;
              if(!fillerReq_o.isPartnerPresent() || fillerReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 227, column: 4
                fillerReq_o.setREQ(false);//sysj\orchestrator.sysj line: 227, column: 4
                S36031=1;
                active[9]=1;
                ends[9]=1;
                tdone[9]=1;
              }
              else {
                S36026=0;
                if(fillerReq_o.isACK()){//sysj\orchestrator.sysj line: 227, column: 4
                  fillerReq_o.setVal(req_thread_9);//sysj\orchestrator.sysj line: 227, column: 4
                  S36026=1;
                  if(!fillerReq_o.isACK()){//sysj\orchestrator.sysj line: 227, column: 4
                    fillerReq_o.setREQ(false);//sysj\orchestrator.sysj line: 227, column: 4
                    ends[9]=2;
                    ;//sysj\orchestrator.sysj line: 227, column: 4
                    S36024=2;
                    S36075=0;
                    if(!fillerStatus_in.isPartnerPresent() || fillerStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 228, column: 4
                      fillerStatus_in.setACK(false);//sysj\orchestrator.sysj line: 228, column: 4
                      S36075=1;
                      active[9]=1;
                      ends[9]=1;
                      tdone[9]=1;
                    }
                    else {
                      S36070=0;
                      if(!fillerStatus_in.isREQ()){//sysj\orchestrator.sysj line: 228, column: 4
                        fillerStatus_in.setACK(true);//sysj\orchestrator.sysj line: 228, column: 4
                        S36070=1;
                        if(fillerStatus_in.isREQ()){//sysj\orchestrator.sysj line: 228, column: 4
                          fillerStatus_in.setACK(false);//sysj\orchestrator.sysj line: 228, column: 4
                          ends[9]=2;
                          ;//sysj\orchestrator.sysj line: 228, column: 4
                          System.out.println("Orch: Received filler status");//sysj\orchestrator.sysj line: 229, column: 4
                          res_thread_9 = (String)(fillerStatus_in.getVal() == null ? null : ((String)fillerStatus_in.getVal()));//sysj\orchestrator.sysj line: 230, column: 4
                          recFillerStatus_1.setPresent();//sysj\orchestrator.sysj line: 231, column: 4
                          currsigs.addElement(recFillerStatus_1);
                          recFillerStatus_1.setValue(res_thread_9);//sysj\orchestrator.sysj line: 231, column: 4
                          S36024=0;
                          active[9]=1;
                          ends[9]=1;
                          tdone[9]=1;
                        }
                        else {
                          active[9]=1;
                          ends[9]=1;
                          tdone[9]=1;
                        }
                      }
                      else {
                        active[9]=1;
                        ends[9]=1;
                        tdone[9]=1;
                      }
                    }
                  }
                  else {
                    active[9]=1;
                    ends[9]=1;
                    tdone[9]=1;
                  }
                }
                else {
                  active[9]=1;
                  ends[9]=1;
                  tdone[9]=1;
                }
              }
            }
            else {
              active[9]=1;
              ends[9]=1;
              tdone[9]=1;
            }
            break;
          
          case 1 : 
            switch(S36031){
              case 0 : 
                if(!fillerReq_o.isPartnerPresent() || fillerReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 227, column: 4
                  fillerReq_o.setREQ(false);//sysj\orchestrator.sysj line: 227, column: 4
                  S36031=1;
                  active[9]=1;
                  ends[9]=1;
                  tdone[9]=1;
                }
                else {
                  switch(S36026){
                    case 0 : 
                      if(fillerReq_o.isACK()){//sysj\orchestrator.sysj line: 227, column: 4
                        fillerReq_o.setVal(req_thread_9);//sysj\orchestrator.sysj line: 227, column: 4
                        S36026=1;
                        if(!fillerReq_o.isACK()){//sysj\orchestrator.sysj line: 227, column: 4
                          fillerReq_o.setREQ(false);//sysj\orchestrator.sysj line: 227, column: 4
                          ends[9]=2;
                          ;//sysj\orchestrator.sysj line: 227, column: 4
                          S36024=2;
                          S36075=0;
                          if(!fillerStatus_in.isPartnerPresent() || fillerStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 228, column: 4
                            fillerStatus_in.setACK(false);//sysj\orchestrator.sysj line: 228, column: 4
                            S36075=1;
                            active[9]=1;
                            ends[9]=1;
                            tdone[9]=1;
                          }
                          else {
                            S36070=0;
                            if(!fillerStatus_in.isREQ()){//sysj\orchestrator.sysj line: 228, column: 4
                              fillerStatus_in.setACK(true);//sysj\orchestrator.sysj line: 228, column: 4
                              S36070=1;
                              if(fillerStatus_in.isREQ()){//sysj\orchestrator.sysj line: 228, column: 4
                                fillerStatus_in.setACK(false);//sysj\orchestrator.sysj line: 228, column: 4
                                ends[9]=2;
                                ;//sysj\orchestrator.sysj line: 228, column: 4
                                System.out.println("Orch: Received filler status");//sysj\orchestrator.sysj line: 229, column: 4
                                res_thread_9 = (String)(fillerStatus_in.getVal() == null ? null : ((String)fillerStatus_in.getVal()));//sysj\orchestrator.sysj line: 230, column: 4
                                recFillerStatus_1.setPresent();//sysj\orchestrator.sysj line: 231, column: 4
                                currsigs.addElement(recFillerStatus_1);
                                recFillerStatus_1.setValue(res_thread_9);//sysj\orchestrator.sysj line: 231, column: 4
                                S36024=0;
                                active[9]=1;
                                ends[9]=1;
                                tdone[9]=1;
                              }
                              else {
                                active[9]=1;
                                ends[9]=1;
                                tdone[9]=1;
                              }
                            }
                            else {
                              active[9]=1;
                              ends[9]=1;
                              tdone[9]=1;
                            }
                          }
                        }
                        else {
                          active[9]=1;
                          ends[9]=1;
                          tdone[9]=1;
                        }
                      }
                      else {
                        active[9]=1;
                        ends[9]=1;
                        tdone[9]=1;
                      }
                      break;
                    
                    case 1 : 
                      if(!fillerReq_o.isACK()){//sysj\orchestrator.sysj line: 227, column: 4
                        fillerReq_o.setREQ(false);//sysj\orchestrator.sysj line: 227, column: 4
                        ends[9]=2;
                        ;//sysj\orchestrator.sysj line: 227, column: 4
                        S36024=2;
                        S36075=0;
                        if(!fillerStatus_in.isPartnerPresent() || fillerStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 228, column: 4
                          fillerStatus_in.setACK(false);//sysj\orchestrator.sysj line: 228, column: 4
                          S36075=1;
                          active[9]=1;
                          ends[9]=1;
                          tdone[9]=1;
                        }
                        else {
                          S36070=0;
                          if(!fillerStatus_in.isREQ()){//sysj\orchestrator.sysj line: 228, column: 4
                            fillerStatus_in.setACK(true);//sysj\orchestrator.sysj line: 228, column: 4
                            S36070=1;
                            if(fillerStatus_in.isREQ()){//sysj\orchestrator.sysj line: 228, column: 4
                              fillerStatus_in.setACK(false);//sysj\orchestrator.sysj line: 228, column: 4
                              ends[9]=2;
                              ;//sysj\orchestrator.sysj line: 228, column: 4
                              System.out.println("Orch: Received filler status");//sysj\orchestrator.sysj line: 229, column: 4
                              res_thread_9 = (String)(fillerStatus_in.getVal() == null ? null : ((String)fillerStatus_in.getVal()));//sysj\orchestrator.sysj line: 230, column: 4
                              recFillerStatus_1.setPresent();//sysj\orchestrator.sysj line: 231, column: 4
                              currsigs.addElement(recFillerStatus_1);
                              recFillerStatus_1.setValue(res_thread_9);//sysj\orchestrator.sysj line: 231, column: 4
                              S36024=0;
                              active[9]=1;
                              ends[9]=1;
                              tdone[9]=1;
                            }
                            else {
                              active[9]=1;
                              ends[9]=1;
                              tdone[9]=1;
                            }
                          }
                          else {
                            active[9]=1;
                            ends[9]=1;
                            tdone[9]=1;
                          }
                        }
                      }
                      else {
                        active[9]=1;
                        ends[9]=1;
                        tdone[9]=1;
                      }
                      break;
                    
                  }
                }
                break;
              
              case 1 : 
                S36031=1;
                S36031=0;
                if(!fillerReq_o.isPartnerPresent() || fillerReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 227, column: 4
                  fillerReq_o.setREQ(false);//sysj\orchestrator.sysj line: 227, column: 4
                  S36031=1;
                  active[9]=1;
                  ends[9]=1;
                  tdone[9]=1;
                }
                else {
                  S36026=0;
                  if(fillerReq_o.isACK()){//sysj\orchestrator.sysj line: 227, column: 4
                    fillerReq_o.setVal(req_thread_9);//sysj\orchestrator.sysj line: 227, column: 4
                    S36026=1;
                    if(!fillerReq_o.isACK()){//sysj\orchestrator.sysj line: 227, column: 4
                      fillerReq_o.setREQ(false);//sysj\orchestrator.sysj line: 227, column: 4
                      ends[9]=2;
                      ;//sysj\orchestrator.sysj line: 227, column: 4
                      S36024=2;
                      S36075=0;
                      if(!fillerStatus_in.isPartnerPresent() || fillerStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 228, column: 4
                        fillerStatus_in.setACK(false);//sysj\orchestrator.sysj line: 228, column: 4
                        S36075=1;
                        active[9]=1;
                        ends[9]=1;
                        tdone[9]=1;
                      }
                      else {
                        S36070=0;
                        if(!fillerStatus_in.isREQ()){//sysj\orchestrator.sysj line: 228, column: 4
                          fillerStatus_in.setACK(true);//sysj\orchestrator.sysj line: 228, column: 4
                          S36070=1;
                          if(fillerStatus_in.isREQ()){//sysj\orchestrator.sysj line: 228, column: 4
                            fillerStatus_in.setACK(false);//sysj\orchestrator.sysj line: 228, column: 4
                            ends[9]=2;
                            ;//sysj\orchestrator.sysj line: 228, column: 4
                            System.out.println("Orch: Received filler status");//sysj\orchestrator.sysj line: 229, column: 4
                            res_thread_9 = (String)(fillerStatus_in.getVal() == null ? null : ((String)fillerStatus_in.getVal()));//sysj\orchestrator.sysj line: 230, column: 4
                            recFillerStatus_1.setPresent();//sysj\orchestrator.sysj line: 231, column: 4
                            currsigs.addElement(recFillerStatus_1);
                            recFillerStatus_1.setValue(res_thread_9);//sysj\orchestrator.sysj line: 231, column: 4
                            S36024=0;
                            active[9]=1;
                            ends[9]=1;
                            tdone[9]=1;
                          }
                          else {
                            active[9]=1;
                            ends[9]=1;
                            tdone[9]=1;
                          }
                        }
                        else {
                          active[9]=1;
                          ends[9]=1;
                          tdone[9]=1;
                        }
                      }
                    }
                    else {
                      active[9]=1;
                      ends[9]=1;
                      tdone[9]=1;
                    }
                  }
                  else {
                    active[9]=1;
                    ends[9]=1;
                    tdone[9]=1;
                  }
                }
                break;
              
            }
            break;
          
          case 2 : 
            switch(S36075){
              case 0 : 
                if(!fillerStatus_in.isPartnerPresent() || fillerStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 228, column: 4
                  fillerStatus_in.setACK(false);//sysj\orchestrator.sysj line: 228, column: 4
                  S36075=1;
                  active[9]=1;
                  ends[9]=1;
                  tdone[9]=1;
                }
                else {
                  switch(S36070){
                    case 0 : 
                      if(!fillerStatus_in.isREQ()){//sysj\orchestrator.sysj line: 228, column: 4
                        fillerStatus_in.setACK(true);//sysj\orchestrator.sysj line: 228, column: 4
                        S36070=1;
                        if(fillerStatus_in.isREQ()){//sysj\orchestrator.sysj line: 228, column: 4
                          fillerStatus_in.setACK(false);//sysj\orchestrator.sysj line: 228, column: 4
                          ends[9]=2;
                          ;//sysj\orchestrator.sysj line: 228, column: 4
                          System.out.println("Orch: Received filler status");//sysj\orchestrator.sysj line: 229, column: 4
                          res_thread_9 = (String)(fillerStatus_in.getVal() == null ? null : ((String)fillerStatus_in.getVal()));//sysj\orchestrator.sysj line: 230, column: 4
                          recFillerStatus_1.setPresent();//sysj\orchestrator.sysj line: 231, column: 4
                          currsigs.addElement(recFillerStatus_1);
                          recFillerStatus_1.setValue(res_thread_9);//sysj\orchestrator.sysj line: 231, column: 4
                          S36024=0;
                          active[9]=1;
                          ends[9]=1;
                          tdone[9]=1;
                        }
                        else {
                          active[9]=1;
                          ends[9]=1;
                          tdone[9]=1;
                        }
                      }
                      else {
                        active[9]=1;
                        ends[9]=1;
                        tdone[9]=1;
                      }
                      break;
                    
                    case 1 : 
                      if(fillerStatus_in.isREQ()){//sysj\orchestrator.sysj line: 228, column: 4
                        fillerStatus_in.setACK(false);//sysj\orchestrator.sysj line: 228, column: 4
                        ends[9]=2;
                        ;//sysj\orchestrator.sysj line: 228, column: 4
                        System.out.println("Orch: Received filler status");//sysj\orchestrator.sysj line: 229, column: 4
                        res_thread_9 = (String)(fillerStatus_in.getVal() == null ? null : ((String)fillerStatus_in.getVal()));//sysj\orchestrator.sysj line: 230, column: 4
                        recFillerStatus_1.setPresent();//sysj\orchestrator.sysj line: 231, column: 4
                        currsigs.addElement(recFillerStatus_1);
                        recFillerStatus_1.setValue(res_thread_9);//sysj\orchestrator.sysj line: 231, column: 4
                        S36024=0;
                        active[9]=1;
                        ends[9]=1;
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
                break;
              
              case 1 : 
                S36075=1;
                S36075=0;
                if(!fillerStatus_in.isPartnerPresent() || fillerStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 228, column: 4
                  fillerStatus_in.setACK(false);//sysj\orchestrator.sysj line: 228, column: 4
                  S36075=1;
                  active[9]=1;
                  ends[9]=1;
                  tdone[9]=1;
                }
                else {
                  S36070=0;
                  if(!fillerStatus_in.isREQ()){//sysj\orchestrator.sysj line: 228, column: 4
                    fillerStatus_in.setACK(true);//sysj\orchestrator.sysj line: 228, column: 4
                    S36070=1;
                    if(fillerStatus_in.isREQ()){//sysj\orchestrator.sysj line: 228, column: 4
                      fillerStatus_in.setACK(false);//sysj\orchestrator.sysj line: 228, column: 4
                      ends[9]=2;
                      ;//sysj\orchestrator.sysj line: 228, column: 4
                      System.out.println("Orch: Received filler status");//sysj\orchestrator.sysj line: 229, column: 4
                      res_thread_9 = (String)(fillerStatus_in.getVal() == null ? null : ((String)fillerStatus_in.getVal()));//sysj\orchestrator.sysj line: 230, column: 4
                      recFillerStatus_1.setPresent();//sysj\orchestrator.sysj line: 231, column: 4
                      currsigs.addElement(recFillerStatus_1);
                      recFillerStatus_1.setValue(res_thread_9);//sysj\orchestrator.sysj line: 231, column: 4
                      S36024=0;
                      active[9]=1;
                      ends[9]=1;
                      tdone[9]=1;
                    }
                    else {
                      active[9]=1;
                      ends[9]=1;
                      tdone[9]=1;
                    }
                  }
                  else {
                    active[9]=1;
                    ends[9]=1;
                    tdone[9]=1;
                  }
                }
                break;
              
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread38221(int [] tdone, int [] ends){
        switch(S36022){
      case 0 : 
        active[8]=0;
        ends[8]=0;
        tdone[8]=1;
        break;
      
      case 1 : 
        switch(S35084){
          case 0 : 
            if(sigCapLoaderReq_1.getprestatus()){//sysj\orchestrator.sysj line: 211, column: 10
              System.out.println("Orch: Sending cap loader request");//sysj\orchestrator.sysj line: 212, column: 4
              S35084=1;
              S35091=0;
              if(!capLoaderReq_o.isPartnerPresent() || capLoaderReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 213, column: 4
                capLoaderReq_o.setREQ(false);//sysj\orchestrator.sysj line: 213, column: 4
                S35091=1;
                active[8]=1;
                ends[8]=1;
                tdone[8]=1;
              }
              else {
                S35086=0;
                if(capLoaderReq_o.isACK()){//sysj\orchestrator.sysj line: 213, column: 4
                  capLoaderReq_o.setVal(true);//sysj\orchestrator.sysj line: 213, column: 4
                  S35086=1;
                  if(!capLoaderReq_o.isACK()){//sysj\orchestrator.sysj line: 213, column: 4
                    capLoaderReq_o.setREQ(false);//sysj\orchestrator.sysj line: 213, column: 4
                    ends[8]=2;
                    ;//sysj\orchestrator.sysj line: 213, column: 4
                    S35084=2;
                    S35135=0;
                    if(!capLoaderStatus_in.isPartnerPresent() || capLoaderStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 214, column: 4
                      capLoaderStatus_in.setACK(false);//sysj\orchestrator.sysj line: 214, column: 4
                      S35135=1;
                      active[8]=1;
                      ends[8]=1;
                      tdone[8]=1;
                    }
                    else {
                      S35130=0;
                      if(!capLoaderStatus_in.isREQ()){//sysj\orchestrator.sysj line: 214, column: 4
                        capLoaderStatus_in.setACK(true);//sysj\orchestrator.sysj line: 214, column: 4
                        S35130=1;
                        if(capLoaderStatus_in.isREQ()){//sysj\orchestrator.sysj line: 214, column: 4
                          capLoaderStatus_in.setACK(false);//sysj\orchestrator.sysj line: 214, column: 4
                          ends[8]=2;
                          ;//sysj\orchestrator.sysj line: 214, column: 4
                          System.out.println("Orch: Received cap loader status");//sysj\orchestrator.sysj line: 215, column: 4
                          res_thread_8 = (String)(capLoaderStatus_in.getVal() == null ? null : ((String)capLoaderStatus_in.getVal()));//sysj\orchestrator.sysj line: 217, column: 4
                          recCapLoaderStatus_1.setPresent();//sysj\orchestrator.sysj line: 218, column: 4
                          currsigs.addElement(recCapLoaderStatus_1);
                          recCapLoaderStatus_1.setValue(res_thread_8);//sysj\orchestrator.sysj line: 218, column: 4
                          S35084=0;
                          active[8]=1;
                          ends[8]=1;
                          tdone[8]=1;
                        }
                        else {
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
                    }
                  }
                  else {
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
              }
            }
            else {
              active[8]=1;
              ends[8]=1;
              tdone[8]=1;
            }
            break;
          
          case 1 : 
            switch(S35091){
              case 0 : 
                if(!capLoaderReq_o.isPartnerPresent() || capLoaderReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 213, column: 4
                  capLoaderReq_o.setREQ(false);//sysj\orchestrator.sysj line: 213, column: 4
                  S35091=1;
                  active[8]=1;
                  ends[8]=1;
                  tdone[8]=1;
                }
                else {
                  switch(S35086){
                    case 0 : 
                      if(capLoaderReq_o.isACK()){//sysj\orchestrator.sysj line: 213, column: 4
                        capLoaderReq_o.setVal(true);//sysj\orchestrator.sysj line: 213, column: 4
                        S35086=1;
                        if(!capLoaderReq_o.isACK()){//sysj\orchestrator.sysj line: 213, column: 4
                          capLoaderReq_o.setREQ(false);//sysj\orchestrator.sysj line: 213, column: 4
                          ends[8]=2;
                          ;//sysj\orchestrator.sysj line: 213, column: 4
                          S35084=2;
                          S35135=0;
                          if(!capLoaderStatus_in.isPartnerPresent() || capLoaderStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 214, column: 4
                            capLoaderStatus_in.setACK(false);//sysj\orchestrator.sysj line: 214, column: 4
                            S35135=1;
                            active[8]=1;
                            ends[8]=1;
                            tdone[8]=1;
                          }
                          else {
                            S35130=0;
                            if(!capLoaderStatus_in.isREQ()){//sysj\orchestrator.sysj line: 214, column: 4
                              capLoaderStatus_in.setACK(true);//sysj\orchestrator.sysj line: 214, column: 4
                              S35130=1;
                              if(capLoaderStatus_in.isREQ()){//sysj\orchestrator.sysj line: 214, column: 4
                                capLoaderStatus_in.setACK(false);//sysj\orchestrator.sysj line: 214, column: 4
                                ends[8]=2;
                                ;//sysj\orchestrator.sysj line: 214, column: 4
                                System.out.println("Orch: Received cap loader status");//sysj\orchestrator.sysj line: 215, column: 4
                                res_thread_8 = (String)(capLoaderStatus_in.getVal() == null ? null : ((String)capLoaderStatus_in.getVal()));//sysj\orchestrator.sysj line: 217, column: 4
                                recCapLoaderStatus_1.setPresent();//sysj\orchestrator.sysj line: 218, column: 4
                                currsigs.addElement(recCapLoaderStatus_1);
                                recCapLoaderStatus_1.setValue(res_thread_8);//sysj\orchestrator.sysj line: 218, column: 4
                                S35084=0;
                                active[8]=1;
                                ends[8]=1;
                                tdone[8]=1;
                              }
                              else {
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
                          }
                        }
                        else {
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
                    
                    case 1 : 
                      if(!capLoaderReq_o.isACK()){//sysj\orchestrator.sysj line: 213, column: 4
                        capLoaderReq_o.setREQ(false);//sysj\orchestrator.sysj line: 213, column: 4
                        ends[8]=2;
                        ;//sysj\orchestrator.sysj line: 213, column: 4
                        S35084=2;
                        S35135=0;
                        if(!capLoaderStatus_in.isPartnerPresent() || capLoaderStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 214, column: 4
                          capLoaderStatus_in.setACK(false);//sysj\orchestrator.sysj line: 214, column: 4
                          S35135=1;
                          active[8]=1;
                          ends[8]=1;
                          tdone[8]=1;
                        }
                        else {
                          S35130=0;
                          if(!capLoaderStatus_in.isREQ()){//sysj\orchestrator.sysj line: 214, column: 4
                            capLoaderStatus_in.setACK(true);//sysj\orchestrator.sysj line: 214, column: 4
                            S35130=1;
                            if(capLoaderStatus_in.isREQ()){//sysj\orchestrator.sysj line: 214, column: 4
                              capLoaderStatus_in.setACK(false);//sysj\orchestrator.sysj line: 214, column: 4
                              ends[8]=2;
                              ;//sysj\orchestrator.sysj line: 214, column: 4
                              System.out.println("Orch: Received cap loader status");//sysj\orchestrator.sysj line: 215, column: 4
                              res_thread_8 = (String)(capLoaderStatus_in.getVal() == null ? null : ((String)capLoaderStatus_in.getVal()));//sysj\orchestrator.sysj line: 217, column: 4
                              recCapLoaderStatus_1.setPresent();//sysj\orchestrator.sysj line: 218, column: 4
                              currsigs.addElement(recCapLoaderStatus_1);
                              recCapLoaderStatus_1.setValue(res_thread_8);//sysj\orchestrator.sysj line: 218, column: 4
                              S35084=0;
                              active[8]=1;
                              ends[8]=1;
                              tdone[8]=1;
                            }
                            else {
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
                        }
                      }
                      else {
                        active[8]=1;
                        ends[8]=1;
                        tdone[8]=1;
                      }
                      break;
                    
                  }
                }
                break;
              
              case 1 : 
                S35091=1;
                S35091=0;
                if(!capLoaderReq_o.isPartnerPresent() || capLoaderReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 213, column: 4
                  capLoaderReq_o.setREQ(false);//sysj\orchestrator.sysj line: 213, column: 4
                  S35091=1;
                  active[8]=1;
                  ends[8]=1;
                  tdone[8]=1;
                }
                else {
                  S35086=0;
                  if(capLoaderReq_o.isACK()){//sysj\orchestrator.sysj line: 213, column: 4
                    capLoaderReq_o.setVal(true);//sysj\orchestrator.sysj line: 213, column: 4
                    S35086=1;
                    if(!capLoaderReq_o.isACK()){//sysj\orchestrator.sysj line: 213, column: 4
                      capLoaderReq_o.setREQ(false);//sysj\orchestrator.sysj line: 213, column: 4
                      ends[8]=2;
                      ;//sysj\orchestrator.sysj line: 213, column: 4
                      S35084=2;
                      S35135=0;
                      if(!capLoaderStatus_in.isPartnerPresent() || capLoaderStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 214, column: 4
                        capLoaderStatus_in.setACK(false);//sysj\orchestrator.sysj line: 214, column: 4
                        S35135=1;
                        active[8]=1;
                        ends[8]=1;
                        tdone[8]=1;
                      }
                      else {
                        S35130=0;
                        if(!capLoaderStatus_in.isREQ()){//sysj\orchestrator.sysj line: 214, column: 4
                          capLoaderStatus_in.setACK(true);//sysj\orchestrator.sysj line: 214, column: 4
                          S35130=1;
                          if(capLoaderStatus_in.isREQ()){//sysj\orchestrator.sysj line: 214, column: 4
                            capLoaderStatus_in.setACK(false);//sysj\orchestrator.sysj line: 214, column: 4
                            ends[8]=2;
                            ;//sysj\orchestrator.sysj line: 214, column: 4
                            System.out.println("Orch: Received cap loader status");//sysj\orchestrator.sysj line: 215, column: 4
                            res_thread_8 = (String)(capLoaderStatus_in.getVal() == null ? null : ((String)capLoaderStatus_in.getVal()));//sysj\orchestrator.sysj line: 217, column: 4
                            recCapLoaderStatus_1.setPresent();//sysj\orchestrator.sysj line: 218, column: 4
                            currsigs.addElement(recCapLoaderStatus_1);
                            recCapLoaderStatus_1.setValue(res_thread_8);//sysj\orchestrator.sysj line: 218, column: 4
                            S35084=0;
                            active[8]=1;
                            ends[8]=1;
                            tdone[8]=1;
                          }
                          else {
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
                      }
                    }
                    else {
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
                }
                break;
              
            }
            break;
          
          case 2 : 
            switch(S35135){
              case 0 : 
                if(!capLoaderStatus_in.isPartnerPresent() || capLoaderStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 214, column: 4
                  capLoaderStatus_in.setACK(false);//sysj\orchestrator.sysj line: 214, column: 4
                  S35135=1;
                  active[8]=1;
                  ends[8]=1;
                  tdone[8]=1;
                }
                else {
                  switch(S35130){
                    case 0 : 
                      if(!capLoaderStatus_in.isREQ()){//sysj\orchestrator.sysj line: 214, column: 4
                        capLoaderStatus_in.setACK(true);//sysj\orchestrator.sysj line: 214, column: 4
                        S35130=1;
                        if(capLoaderStatus_in.isREQ()){//sysj\orchestrator.sysj line: 214, column: 4
                          capLoaderStatus_in.setACK(false);//sysj\orchestrator.sysj line: 214, column: 4
                          ends[8]=2;
                          ;//sysj\orchestrator.sysj line: 214, column: 4
                          System.out.println("Orch: Received cap loader status");//sysj\orchestrator.sysj line: 215, column: 4
                          res_thread_8 = (String)(capLoaderStatus_in.getVal() == null ? null : ((String)capLoaderStatus_in.getVal()));//sysj\orchestrator.sysj line: 217, column: 4
                          recCapLoaderStatus_1.setPresent();//sysj\orchestrator.sysj line: 218, column: 4
                          currsigs.addElement(recCapLoaderStatus_1);
                          recCapLoaderStatus_1.setValue(res_thread_8);//sysj\orchestrator.sysj line: 218, column: 4
                          S35084=0;
                          active[8]=1;
                          ends[8]=1;
                          tdone[8]=1;
                        }
                        else {
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
                    
                    case 1 : 
                      if(capLoaderStatus_in.isREQ()){//sysj\orchestrator.sysj line: 214, column: 4
                        capLoaderStatus_in.setACK(false);//sysj\orchestrator.sysj line: 214, column: 4
                        ends[8]=2;
                        ;//sysj\orchestrator.sysj line: 214, column: 4
                        System.out.println("Orch: Received cap loader status");//sysj\orchestrator.sysj line: 215, column: 4
                        res_thread_8 = (String)(capLoaderStatus_in.getVal() == null ? null : ((String)capLoaderStatus_in.getVal()));//sysj\orchestrator.sysj line: 217, column: 4
                        recCapLoaderStatus_1.setPresent();//sysj\orchestrator.sysj line: 218, column: 4
                        currsigs.addElement(recCapLoaderStatus_1);
                        recCapLoaderStatus_1.setValue(res_thread_8);//sysj\orchestrator.sysj line: 218, column: 4
                        S35084=0;
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
                    
                  }
                }
                break;
              
              case 1 : 
                S35135=1;
                S35135=0;
                if(!capLoaderStatus_in.isPartnerPresent() || capLoaderStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 214, column: 4
                  capLoaderStatus_in.setACK(false);//sysj\orchestrator.sysj line: 214, column: 4
                  S35135=1;
                  active[8]=1;
                  ends[8]=1;
                  tdone[8]=1;
                }
                else {
                  S35130=0;
                  if(!capLoaderStatus_in.isREQ()){//sysj\orchestrator.sysj line: 214, column: 4
                    capLoaderStatus_in.setACK(true);//sysj\orchestrator.sysj line: 214, column: 4
                    S35130=1;
                    if(capLoaderStatus_in.isREQ()){//sysj\orchestrator.sysj line: 214, column: 4
                      capLoaderStatus_in.setACK(false);//sysj\orchestrator.sysj line: 214, column: 4
                      ends[8]=2;
                      ;//sysj\orchestrator.sysj line: 214, column: 4
                      System.out.println("Orch: Received cap loader status");//sysj\orchestrator.sysj line: 215, column: 4
                      res_thread_8 = (String)(capLoaderStatus_in.getVal() == null ? null : ((String)capLoaderStatus_in.getVal()));//sysj\orchestrator.sysj line: 217, column: 4
                      recCapLoaderStatus_1.setPresent();//sysj\orchestrator.sysj line: 218, column: 4
                      currsigs.addElement(recCapLoaderStatus_1);
                      recCapLoaderStatus_1.setValue(res_thread_8);//sysj\orchestrator.sysj line: 218, column: 4
                      S35084=0;
                      active[8]=1;
                      ends[8]=1;
                      tdone[8]=1;
                    }
                    else {
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
                }
                break;
              
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread38220(int [] tdone, int [] ends){
        switch(S35082){
      case 0 : 
        active[7]=0;
        ends[7]=0;
        tdone[7]=1;
        break;
      
      case 1 : 
        switch(S34144){
          case 0 : 
            if(sigCapperReq_1.getprestatus()){//sysj\orchestrator.sysj line: 199, column: 10
              System.out.println("Orch: Sending capper request");//sysj\orchestrator.sysj line: 200, column: 4
              S34144=1;
              S34151=0;
              if(!capperReq_o.isPartnerPresent() || capperReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 201, column: 4
                capperReq_o.setREQ(false);//sysj\orchestrator.sysj line: 201, column: 4
                S34151=1;
                active[7]=1;
                ends[7]=1;
                tdone[7]=1;
              }
              else {
                S34146=0;
                if(capperReq_o.isACK()){//sysj\orchestrator.sysj line: 201, column: 4
                  capperReq_o.setVal(true);//sysj\orchestrator.sysj line: 201, column: 4
                  S34146=1;
                  if(!capperReq_o.isACK()){//sysj\orchestrator.sysj line: 201, column: 4
                    capperReq_o.setREQ(false);//sysj\orchestrator.sysj line: 201, column: 4
                    ends[7]=2;
                    ;//sysj\orchestrator.sysj line: 201, column: 4
                    S34144=2;
                    S34195=0;
                    if(!capperStatus_in.isPartnerPresent() || capperStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 202, column: 4
                      capperStatus_in.setACK(false);//sysj\orchestrator.sysj line: 202, column: 4
                      S34195=1;
                      active[7]=1;
                      ends[7]=1;
                      tdone[7]=1;
                    }
                    else {
                      S34190=0;
                      if(!capperStatus_in.isREQ()){//sysj\orchestrator.sysj line: 202, column: 4
                        capperStatus_in.setACK(true);//sysj\orchestrator.sysj line: 202, column: 4
                        S34190=1;
                        if(capperStatus_in.isREQ()){//sysj\orchestrator.sysj line: 202, column: 4
                          capperStatus_in.setACK(false);//sysj\orchestrator.sysj line: 202, column: 4
                          ends[7]=2;
                          ;//sysj\orchestrator.sysj line: 202, column: 4
                          System.out.println("Orch: Received capper status");//sysj\orchestrator.sysj line: 203, column: 4
                          res_thread_7 = (String)(capperStatus_in.getVal() == null ? null : ((String)capperStatus_in.getVal()));//sysj\orchestrator.sysj line: 204, column: 4
                          recCapperStatus_1.setPresent();//sysj\orchestrator.sysj line: 205, column: 4
                          currsigs.addElement(recCapperStatus_1);
                          recCapperStatus_1.setValue(res_thread_7);//sysj\orchestrator.sysj line: 205, column: 4
                          S34144=0;
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
            switch(S34151){
              case 0 : 
                if(!capperReq_o.isPartnerPresent() || capperReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 201, column: 4
                  capperReq_o.setREQ(false);//sysj\orchestrator.sysj line: 201, column: 4
                  S34151=1;
                  active[7]=1;
                  ends[7]=1;
                  tdone[7]=1;
                }
                else {
                  switch(S34146){
                    case 0 : 
                      if(capperReq_o.isACK()){//sysj\orchestrator.sysj line: 201, column: 4
                        capperReq_o.setVal(true);//sysj\orchestrator.sysj line: 201, column: 4
                        S34146=1;
                        if(!capperReq_o.isACK()){//sysj\orchestrator.sysj line: 201, column: 4
                          capperReq_o.setREQ(false);//sysj\orchestrator.sysj line: 201, column: 4
                          ends[7]=2;
                          ;//sysj\orchestrator.sysj line: 201, column: 4
                          S34144=2;
                          S34195=0;
                          if(!capperStatus_in.isPartnerPresent() || capperStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 202, column: 4
                            capperStatus_in.setACK(false);//sysj\orchestrator.sysj line: 202, column: 4
                            S34195=1;
                            active[7]=1;
                            ends[7]=1;
                            tdone[7]=1;
                          }
                          else {
                            S34190=0;
                            if(!capperStatus_in.isREQ()){//sysj\orchestrator.sysj line: 202, column: 4
                              capperStatus_in.setACK(true);//sysj\orchestrator.sysj line: 202, column: 4
                              S34190=1;
                              if(capperStatus_in.isREQ()){//sysj\orchestrator.sysj line: 202, column: 4
                                capperStatus_in.setACK(false);//sysj\orchestrator.sysj line: 202, column: 4
                                ends[7]=2;
                                ;//sysj\orchestrator.sysj line: 202, column: 4
                                System.out.println("Orch: Received capper status");//sysj\orchestrator.sysj line: 203, column: 4
                                res_thread_7 = (String)(capperStatus_in.getVal() == null ? null : ((String)capperStatus_in.getVal()));//sysj\orchestrator.sysj line: 204, column: 4
                                recCapperStatus_1.setPresent();//sysj\orchestrator.sysj line: 205, column: 4
                                currsigs.addElement(recCapperStatus_1);
                                recCapperStatus_1.setValue(res_thread_7);//sysj\orchestrator.sysj line: 205, column: 4
                                S34144=0;
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
                      if(!capperReq_o.isACK()){//sysj\orchestrator.sysj line: 201, column: 4
                        capperReq_o.setREQ(false);//sysj\orchestrator.sysj line: 201, column: 4
                        ends[7]=2;
                        ;//sysj\orchestrator.sysj line: 201, column: 4
                        S34144=2;
                        S34195=0;
                        if(!capperStatus_in.isPartnerPresent() || capperStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 202, column: 4
                          capperStatus_in.setACK(false);//sysj\orchestrator.sysj line: 202, column: 4
                          S34195=1;
                          active[7]=1;
                          ends[7]=1;
                          tdone[7]=1;
                        }
                        else {
                          S34190=0;
                          if(!capperStatus_in.isREQ()){//sysj\orchestrator.sysj line: 202, column: 4
                            capperStatus_in.setACK(true);//sysj\orchestrator.sysj line: 202, column: 4
                            S34190=1;
                            if(capperStatus_in.isREQ()){//sysj\orchestrator.sysj line: 202, column: 4
                              capperStatus_in.setACK(false);//sysj\orchestrator.sysj line: 202, column: 4
                              ends[7]=2;
                              ;//sysj\orchestrator.sysj line: 202, column: 4
                              System.out.println("Orch: Received capper status");//sysj\orchestrator.sysj line: 203, column: 4
                              res_thread_7 = (String)(capperStatus_in.getVal() == null ? null : ((String)capperStatus_in.getVal()));//sysj\orchestrator.sysj line: 204, column: 4
                              recCapperStatus_1.setPresent();//sysj\orchestrator.sysj line: 205, column: 4
                              currsigs.addElement(recCapperStatus_1);
                              recCapperStatus_1.setValue(res_thread_7);//sysj\orchestrator.sysj line: 205, column: 4
                              S34144=0;
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
                S34151=1;
                S34151=0;
                if(!capperReq_o.isPartnerPresent() || capperReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 201, column: 4
                  capperReq_o.setREQ(false);//sysj\orchestrator.sysj line: 201, column: 4
                  S34151=1;
                  active[7]=1;
                  ends[7]=1;
                  tdone[7]=1;
                }
                else {
                  S34146=0;
                  if(capperReq_o.isACK()){//sysj\orchestrator.sysj line: 201, column: 4
                    capperReq_o.setVal(true);//sysj\orchestrator.sysj line: 201, column: 4
                    S34146=1;
                    if(!capperReq_o.isACK()){//sysj\orchestrator.sysj line: 201, column: 4
                      capperReq_o.setREQ(false);//sysj\orchestrator.sysj line: 201, column: 4
                      ends[7]=2;
                      ;//sysj\orchestrator.sysj line: 201, column: 4
                      S34144=2;
                      S34195=0;
                      if(!capperStatus_in.isPartnerPresent() || capperStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 202, column: 4
                        capperStatus_in.setACK(false);//sysj\orchestrator.sysj line: 202, column: 4
                        S34195=1;
                        active[7]=1;
                        ends[7]=1;
                        tdone[7]=1;
                      }
                      else {
                        S34190=0;
                        if(!capperStatus_in.isREQ()){//sysj\orchestrator.sysj line: 202, column: 4
                          capperStatus_in.setACK(true);//sysj\orchestrator.sysj line: 202, column: 4
                          S34190=1;
                          if(capperStatus_in.isREQ()){//sysj\orchestrator.sysj line: 202, column: 4
                            capperStatus_in.setACK(false);//sysj\orchestrator.sysj line: 202, column: 4
                            ends[7]=2;
                            ;//sysj\orchestrator.sysj line: 202, column: 4
                            System.out.println("Orch: Received capper status");//sysj\orchestrator.sysj line: 203, column: 4
                            res_thread_7 = (String)(capperStatus_in.getVal() == null ? null : ((String)capperStatus_in.getVal()));//sysj\orchestrator.sysj line: 204, column: 4
                            recCapperStatus_1.setPresent();//sysj\orchestrator.sysj line: 205, column: 4
                            currsigs.addElement(recCapperStatus_1);
                            recCapperStatus_1.setValue(res_thread_7);//sysj\orchestrator.sysj line: 205, column: 4
                            S34144=0;
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
            switch(S34195){
              case 0 : 
                if(!capperStatus_in.isPartnerPresent() || capperStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 202, column: 4
                  capperStatus_in.setACK(false);//sysj\orchestrator.sysj line: 202, column: 4
                  S34195=1;
                  active[7]=1;
                  ends[7]=1;
                  tdone[7]=1;
                }
                else {
                  switch(S34190){
                    case 0 : 
                      if(!capperStatus_in.isREQ()){//sysj\orchestrator.sysj line: 202, column: 4
                        capperStatus_in.setACK(true);//sysj\orchestrator.sysj line: 202, column: 4
                        S34190=1;
                        if(capperStatus_in.isREQ()){//sysj\orchestrator.sysj line: 202, column: 4
                          capperStatus_in.setACK(false);//sysj\orchestrator.sysj line: 202, column: 4
                          ends[7]=2;
                          ;//sysj\orchestrator.sysj line: 202, column: 4
                          System.out.println("Orch: Received capper status");//sysj\orchestrator.sysj line: 203, column: 4
                          res_thread_7 = (String)(capperStatus_in.getVal() == null ? null : ((String)capperStatus_in.getVal()));//sysj\orchestrator.sysj line: 204, column: 4
                          recCapperStatus_1.setPresent();//sysj\orchestrator.sysj line: 205, column: 4
                          currsigs.addElement(recCapperStatus_1);
                          recCapperStatus_1.setValue(res_thread_7);//sysj\orchestrator.sysj line: 205, column: 4
                          S34144=0;
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
                      if(capperStatus_in.isREQ()){//sysj\orchestrator.sysj line: 202, column: 4
                        capperStatus_in.setACK(false);//sysj\orchestrator.sysj line: 202, column: 4
                        ends[7]=2;
                        ;//sysj\orchestrator.sysj line: 202, column: 4
                        System.out.println("Orch: Received capper status");//sysj\orchestrator.sysj line: 203, column: 4
                        res_thread_7 = (String)(capperStatus_in.getVal() == null ? null : ((String)capperStatus_in.getVal()));//sysj\orchestrator.sysj line: 204, column: 4
                        recCapperStatus_1.setPresent();//sysj\orchestrator.sysj line: 205, column: 4
                        currsigs.addElement(recCapperStatus_1);
                        recCapperStatus_1.setValue(res_thread_7);//sysj\orchestrator.sysj line: 205, column: 4
                        S34144=0;
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
                S34195=1;
                S34195=0;
                if(!capperStatus_in.isPartnerPresent() || capperStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 202, column: 4
                  capperStatus_in.setACK(false);//sysj\orchestrator.sysj line: 202, column: 4
                  S34195=1;
                  active[7]=1;
                  ends[7]=1;
                  tdone[7]=1;
                }
                else {
                  S34190=0;
                  if(!capperStatus_in.isREQ()){//sysj\orchestrator.sysj line: 202, column: 4
                    capperStatus_in.setACK(true);//sysj\orchestrator.sysj line: 202, column: 4
                    S34190=1;
                    if(capperStatus_in.isREQ()){//sysj\orchestrator.sysj line: 202, column: 4
                      capperStatus_in.setACK(false);//sysj\orchestrator.sysj line: 202, column: 4
                      ends[7]=2;
                      ;//sysj\orchestrator.sysj line: 202, column: 4
                      System.out.println("Orch: Received capper status");//sysj\orchestrator.sysj line: 203, column: 4
                      res_thread_7 = (String)(capperStatus_in.getVal() == null ? null : ((String)capperStatus_in.getVal()));//sysj\orchestrator.sysj line: 204, column: 4
                      recCapperStatus_1.setPresent();//sysj\orchestrator.sysj line: 205, column: 4
                      currsigs.addElement(recCapperStatus_1);
                      recCapperStatus_1.setValue(res_thread_7);//sysj\orchestrator.sysj line: 205, column: 4
                      S34144=0;
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

  public void thread38219(int [] tdone, int [] ends){
        switch(S34142){
      case 0 : 
        active[6]=0;
        ends[6]=0;
        tdone[6]=1;
        break;
      
      case 1 : 
        switch(S33248){
          case 0 : 
            if(sigConveyorReq_1.getprestatus()){//sysj\orchestrator.sysj line: 189, column: 10
              S33248=1;
              S33210=0;
              if(!conveyorReq_o.isPartnerPresent() || conveyorReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 190, column: 4
                conveyorReq_o.setREQ(false);//sysj\orchestrator.sysj line: 190, column: 4
                S33210=1;
                active[6]=1;
                ends[6]=1;
                tdone[6]=1;
              }
              else {
                S33205=0;
                if(conveyorReq_o.isACK()){//sysj\orchestrator.sysj line: 190, column: 4
                  conveyorReq_o.setVal(true);//sysj\orchestrator.sysj line: 190, column: 4
                  S33205=1;
                  if(!conveyorReq_o.isACK()){//sysj\orchestrator.sysj line: 190, column: 4
                    conveyorReq_o.setREQ(false);//sysj\orchestrator.sysj line: 190, column: 4
                    ends[6]=2;
                    ;//sysj\orchestrator.sysj line: 190, column: 4
                    S33248=2;
                    S33255=0;
                    if(!conveyorStatus_in.isPartnerPresent() || conveyorStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 191, column: 4
                      conveyorStatus_in.setACK(false);//sysj\orchestrator.sysj line: 191, column: 4
                      S33255=1;
                      active[6]=1;
                      ends[6]=1;
                      tdone[6]=1;
                    }
                    else {
                      S33250=0;
                      if(!conveyorStatus_in.isREQ()){//sysj\orchestrator.sysj line: 191, column: 4
                        conveyorStatus_in.setACK(true);//sysj\orchestrator.sysj line: 191, column: 4
                        S33250=1;
                        if(conveyorStatus_in.isREQ()){//sysj\orchestrator.sysj line: 191, column: 4
                          conveyorStatus_in.setACK(false);//sysj\orchestrator.sysj line: 191, column: 4
                          ends[6]=2;
                          ;//sysj\orchestrator.sysj line: 191, column: 4
                          res_thread_6 = (String)(conveyorStatus_in.getVal() == null ? null : ((String)conveyorStatus_in.getVal()));//sysj\orchestrator.sysj line: 192, column: 4
                          recConveyorStatus_1.setPresent();//sysj\orchestrator.sysj line: 193, column: 4
                          currsigs.addElement(recConveyorStatus_1);
                          recConveyorStatus_1.setValue(res_thread_6);//sysj\orchestrator.sysj line: 193, column: 4
                          S33248=0;
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
            switch(S33210){
              case 0 : 
                if(!conveyorReq_o.isPartnerPresent() || conveyorReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 190, column: 4
                  conveyorReq_o.setREQ(false);//sysj\orchestrator.sysj line: 190, column: 4
                  S33210=1;
                  active[6]=1;
                  ends[6]=1;
                  tdone[6]=1;
                }
                else {
                  switch(S33205){
                    case 0 : 
                      if(conveyorReq_o.isACK()){//sysj\orchestrator.sysj line: 190, column: 4
                        conveyorReq_o.setVal(true);//sysj\orchestrator.sysj line: 190, column: 4
                        S33205=1;
                        if(!conveyorReq_o.isACK()){//sysj\orchestrator.sysj line: 190, column: 4
                          conveyorReq_o.setREQ(false);//sysj\orchestrator.sysj line: 190, column: 4
                          ends[6]=2;
                          ;//sysj\orchestrator.sysj line: 190, column: 4
                          S33248=2;
                          S33255=0;
                          if(!conveyorStatus_in.isPartnerPresent() || conveyorStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 191, column: 4
                            conveyorStatus_in.setACK(false);//sysj\orchestrator.sysj line: 191, column: 4
                            S33255=1;
                            active[6]=1;
                            ends[6]=1;
                            tdone[6]=1;
                          }
                          else {
                            S33250=0;
                            if(!conveyorStatus_in.isREQ()){//sysj\orchestrator.sysj line: 191, column: 4
                              conveyorStatus_in.setACK(true);//sysj\orchestrator.sysj line: 191, column: 4
                              S33250=1;
                              if(conveyorStatus_in.isREQ()){//sysj\orchestrator.sysj line: 191, column: 4
                                conveyorStatus_in.setACK(false);//sysj\orchestrator.sysj line: 191, column: 4
                                ends[6]=2;
                                ;//sysj\orchestrator.sysj line: 191, column: 4
                                res_thread_6 = (String)(conveyorStatus_in.getVal() == null ? null : ((String)conveyorStatus_in.getVal()));//sysj\orchestrator.sysj line: 192, column: 4
                                recConveyorStatus_1.setPresent();//sysj\orchestrator.sysj line: 193, column: 4
                                currsigs.addElement(recConveyorStatus_1);
                                recConveyorStatus_1.setValue(res_thread_6);//sysj\orchestrator.sysj line: 193, column: 4
                                S33248=0;
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
                      if(!conveyorReq_o.isACK()){//sysj\orchestrator.sysj line: 190, column: 4
                        conveyorReq_o.setREQ(false);//sysj\orchestrator.sysj line: 190, column: 4
                        ends[6]=2;
                        ;//sysj\orchestrator.sysj line: 190, column: 4
                        S33248=2;
                        S33255=0;
                        if(!conveyorStatus_in.isPartnerPresent() || conveyorStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 191, column: 4
                          conveyorStatus_in.setACK(false);//sysj\orchestrator.sysj line: 191, column: 4
                          S33255=1;
                          active[6]=1;
                          ends[6]=1;
                          tdone[6]=1;
                        }
                        else {
                          S33250=0;
                          if(!conveyorStatus_in.isREQ()){//sysj\orchestrator.sysj line: 191, column: 4
                            conveyorStatus_in.setACK(true);//sysj\orchestrator.sysj line: 191, column: 4
                            S33250=1;
                            if(conveyorStatus_in.isREQ()){//sysj\orchestrator.sysj line: 191, column: 4
                              conveyorStatus_in.setACK(false);//sysj\orchestrator.sysj line: 191, column: 4
                              ends[6]=2;
                              ;//sysj\orchestrator.sysj line: 191, column: 4
                              res_thread_6 = (String)(conveyorStatus_in.getVal() == null ? null : ((String)conveyorStatus_in.getVal()));//sysj\orchestrator.sysj line: 192, column: 4
                              recConveyorStatus_1.setPresent();//sysj\orchestrator.sysj line: 193, column: 4
                              currsigs.addElement(recConveyorStatus_1);
                              recConveyorStatus_1.setValue(res_thread_6);//sysj\orchestrator.sysj line: 193, column: 4
                              S33248=0;
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
                S33210=1;
                S33210=0;
                if(!conveyorReq_o.isPartnerPresent() || conveyorReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 190, column: 4
                  conveyorReq_o.setREQ(false);//sysj\orchestrator.sysj line: 190, column: 4
                  S33210=1;
                  active[6]=1;
                  ends[6]=1;
                  tdone[6]=1;
                }
                else {
                  S33205=0;
                  if(conveyorReq_o.isACK()){//sysj\orchestrator.sysj line: 190, column: 4
                    conveyorReq_o.setVal(true);//sysj\orchestrator.sysj line: 190, column: 4
                    S33205=1;
                    if(!conveyorReq_o.isACK()){//sysj\orchestrator.sysj line: 190, column: 4
                      conveyorReq_o.setREQ(false);//sysj\orchestrator.sysj line: 190, column: 4
                      ends[6]=2;
                      ;//sysj\orchestrator.sysj line: 190, column: 4
                      S33248=2;
                      S33255=0;
                      if(!conveyorStatus_in.isPartnerPresent() || conveyorStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 191, column: 4
                        conveyorStatus_in.setACK(false);//sysj\orchestrator.sysj line: 191, column: 4
                        S33255=1;
                        active[6]=1;
                        ends[6]=1;
                        tdone[6]=1;
                      }
                      else {
                        S33250=0;
                        if(!conveyorStatus_in.isREQ()){//sysj\orchestrator.sysj line: 191, column: 4
                          conveyorStatus_in.setACK(true);//sysj\orchestrator.sysj line: 191, column: 4
                          S33250=1;
                          if(conveyorStatus_in.isREQ()){//sysj\orchestrator.sysj line: 191, column: 4
                            conveyorStatus_in.setACK(false);//sysj\orchestrator.sysj line: 191, column: 4
                            ends[6]=2;
                            ;//sysj\orchestrator.sysj line: 191, column: 4
                            res_thread_6 = (String)(conveyorStatus_in.getVal() == null ? null : ((String)conveyorStatus_in.getVal()));//sysj\orchestrator.sysj line: 192, column: 4
                            recConveyorStatus_1.setPresent();//sysj\orchestrator.sysj line: 193, column: 4
                            currsigs.addElement(recConveyorStatus_1);
                            recConveyorStatus_1.setValue(res_thread_6);//sysj\orchestrator.sysj line: 193, column: 4
                            S33248=0;
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
            switch(S33255){
              case 0 : 
                if(!conveyorStatus_in.isPartnerPresent() || conveyorStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 191, column: 4
                  conveyorStatus_in.setACK(false);//sysj\orchestrator.sysj line: 191, column: 4
                  S33255=1;
                  active[6]=1;
                  ends[6]=1;
                  tdone[6]=1;
                }
                else {
                  switch(S33250){
                    case 0 : 
                      if(!conveyorStatus_in.isREQ()){//sysj\orchestrator.sysj line: 191, column: 4
                        conveyorStatus_in.setACK(true);//sysj\orchestrator.sysj line: 191, column: 4
                        S33250=1;
                        if(conveyorStatus_in.isREQ()){//sysj\orchestrator.sysj line: 191, column: 4
                          conveyorStatus_in.setACK(false);//sysj\orchestrator.sysj line: 191, column: 4
                          ends[6]=2;
                          ;//sysj\orchestrator.sysj line: 191, column: 4
                          res_thread_6 = (String)(conveyorStatus_in.getVal() == null ? null : ((String)conveyorStatus_in.getVal()));//sysj\orchestrator.sysj line: 192, column: 4
                          recConveyorStatus_1.setPresent();//sysj\orchestrator.sysj line: 193, column: 4
                          currsigs.addElement(recConveyorStatus_1);
                          recConveyorStatus_1.setValue(res_thread_6);//sysj\orchestrator.sysj line: 193, column: 4
                          S33248=0;
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
                      if(conveyorStatus_in.isREQ()){//sysj\orchestrator.sysj line: 191, column: 4
                        conveyorStatus_in.setACK(false);//sysj\orchestrator.sysj line: 191, column: 4
                        ends[6]=2;
                        ;//sysj\orchestrator.sysj line: 191, column: 4
                        res_thread_6 = (String)(conveyorStatus_in.getVal() == null ? null : ((String)conveyorStatus_in.getVal()));//sysj\orchestrator.sysj line: 192, column: 4
                        recConveyorStatus_1.setPresent();//sysj\orchestrator.sysj line: 193, column: 4
                        currsigs.addElement(recConveyorStatus_1);
                        recConveyorStatus_1.setValue(res_thread_6);//sysj\orchestrator.sysj line: 193, column: 4
                        S33248=0;
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
                S33255=1;
                S33255=0;
                if(!conveyorStatus_in.isPartnerPresent() || conveyorStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 191, column: 4
                  conveyorStatus_in.setACK(false);//sysj\orchestrator.sysj line: 191, column: 4
                  S33255=1;
                  active[6]=1;
                  ends[6]=1;
                  tdone[6]=1;
                }
                else {
                  S33250=0;
                  if(!conveyorStatus_in.isREQ()){//sysj\orchestrator.sysj line: 191, column: 4
                    conveyorStatus_in.setACK(true);//sysj\orchestrator.sysj line: 191, column: 4
                    S33250=1;
                    if(conveyorStatus_in.isREQ()){//sysj\orchestrator.sysj line: 191, column: 4
                      conveyorStatus_in.setACK(false);//sysj\orchestrator.sysj line: 191, column: 4
                      ends[6]=2;
                      ;//sysj\orchestrator.sysj line: 191, column: 4
                      res_thread_6 = (String)(conveyorStatus_in.getVal() == null ? null : ((String)conveyorStatus_in.getVal()));//sysj\orchestrator.sysj line: 192, column: 4
                      recConveyorStatus_1.setPresent();//sysj\orchestrator.sysj line: 193, column: 4
                      currsigs.addElement(recConveyorStatus_1);
                      recConveyorStatus_1.setValue(res_thread_6);//sysj\orchestrator.sysj line: 193, column: 4
                      S33248=0;
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

  public void thread38218(int [] tdone, int [] ends){
        switch(S33202){
      case 0 : 
        active[5]=0;
        ends[5]=0;
        tdone[5]=1;
        break;
      
      case 1 : 
        switch(S32950){
          case 0 : 
            switch(S32901){
              case 0 : 
                switch(S32902){
                  case 0 : 
                    if(recConveyorStatus_1.getprestatus()){//sysj\orchestrator.sysj line: 172, column: 12
                      System.out.println("Orch: Received conveyor status");//sysj\orchestrator.sysj line: 173, column: 6
                      bottlePlaced_thread_5 = bottlePlaced_thread_5 - 1;//sysj\orchestrator.sysj line: 174, column: 6
                      S32902=1;
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
                  
                  case 1 : 
                    if(getNextBottle_1.getprestatus()){//sysj\orchestrator.sysj line: 175, column: 12
                      System.out.println("Orch: Number of bottles left to do: " + bottlePlaced_thread_5);//sysj\orchestrator.sysj line: 176, column: 6
                      S32902=2;
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
                  
                  case 2 : 
                    S32902=2;
                    if(bottlePlaced_thread_5 >= 0){//sysj\orchestrator.sysj line: 169, column: 11
                      System.out.println("Orch: Sending conveyor request");//sysj\orchestrator.sysj line: 170, column: 6
                      sigConveyorReq_1.setPresent();//sysj\orchestrator.sysj line: 171, column: 6
                      currsigs.addElement(sigConveyorReq_1);
                      sigConveyorReq_1.setValue(true);//sysj\orchestrator.sysj line: 171, column: 6
                      S32902=0;
                      active[5]=1;
                      ends[5]=1;
                      tdone[5]=1;
                    }
                    else {
                      ends[5]=2;
                      ;//sysj\orchestrator.sysj line: 169, column: 5
                      S32901=1;
                      orderIsDone_1.setPresent();//sysj\orchestrator.sysj line: 179, column: 5
                      currsigs.addElement(orderIsDone_1);
                      active[5]=1;
                      ends[5]=1;
                      tdone[5]=1;
                    }
                    break;
                  
                }
                break;
              
              case 1 : 
                orderIsDone_1.setPresent();//sysj\orchestrator.sysj line: 179, column: 5
                currsigs.addElement(orderIsDone_1);
                active[5]=1;
                ends[5]=1;
                tdone[5]=1;
                break;
              
              case 2 : 
                active[5]=1;
                ends[5]=1;
                tdone[5]=1;
                break;
              
            }
            break;
          
          case 1 : 
            S32950=1;
            S32950=0;
            if(currentOrder_1.getprestatus()){//sysj\orchestrator.sysj line: 165, column: 12
              order_thread_5 = (Order)(currentOrder_1.getpreval() == null ? null : ((Order)currentOrder_1.getpreval()));//sysj\orchestrator.sysj line: 166, column: 5
              bottlePlaced_thread_5 = order_thread_5.getQuantity();//sysj\orchestrator.sysj line: 167, column: 5
              S32901=0;
              if(bottlePlaced_thread_5 >= 0){//sysj\orchestrator.sysj line: 169, column: 11
                System.out.println("Orch: Sending conveyor request");//sysj\orchestrator.sysj line: 170, column: 6
                sigConveyorReq_1.setPresent();//sysj\orchestrator.sysj line: 171, column: 6
                currsigs.addElement(sigConveyorReq_1);
                sigConveyorReq_1.setValue(true);//sysj\orchestrator.sysj line: 171, column: 6
                S32902=0;
                active[5]=1;
                ends[5]=1;
                tdone[5]=1;
              }
              else {
                ends[5]=2;
                ;//sysj\orchestrator.sysj line: 169, column: 5
                S32901=1;
                orderIsDone_1.setPresent();//sysj\orchestrator.sysj line: 179, column: 5
                currsigs.addElement(orderIsDone_1);
                active[5]=1;
                ends[5]=1;
                tdone[5]=1;
              }
            }
            else {
              S32950=1;
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread38217(int [] tdone, int [] ends){
        switch(S32900){
      case 0 : 
        active[4]=0;
        ends[4]=0;
        tdone[4]=1;
        break;
      
      case 1 : 
        if(startOrder_1.getprestatus()){//sysj\orchestrator.sysj line: 124, column: 12
          if(currentOrder_1.getprestatus()){//sysj\orchestrator.sysj line: 125, column: 13
            myOrder_thread_4 = (currentOrder_1.getpreval() == null ? null : ((Order)currentOrder_1.getpreval()));//sysj\orchestrator.sysj line: 126, column: 6
            currentOrder_1.setPresent();//sysj\orchestrator.sysj line: 129, column: 7
            currsigs.addElement(currentOrder_1);
            currentOrder_1.setValue(myOrder_thread_4);//sysj\orchestrator.sysj line: 129, column: 7
            foundCurrentOrder_1.setPresent();//sysj\orchestrator.sysj line: 130, column: 7
            currsigs.addElement(foundCurrentOrder_1);
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
      
    }
  }

  public void thread38216(int [] tdone, int [] ends){
        switch(S32874){
      case 0 : 
        active[3]=0;
        ends[3]=0;
        tdone[3]=1;
        break;
      
      case 1 : 
        switch(S32862){
          case 0 : 
            if(currentOrder_1.getprestatus()){//sysj\orchestrator.sysj line: 113, column: 10
              S32862=1;
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            else {
              initABS_1.setPresent();//sysj\orchestrator.sysj line: 114, column: 5
              currsigs.addElement(initABS_1);
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            break;
          
          case 1 : 
            S32862=1;
            S32862=0;
            initABS_1.setPresent();//sysj\orchestrator.sysj line: 114, column: 5
            currsigs.addElement(initABS_1);
            active[3]=1;
            ends[3]=1;
            tdone[3]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread38215(int [] tdone, int [] ends){
        switch(S32857){
      case 0 : 
        active[2]=0;
        ends[2]=0;
        tdone[2]=1;
        break;
      
      case 1 : 
        switch(S31521){
          case 0 : 
            if(recOrderStatus.getprestatus()){//sysj\orchestrator.sysj line: 61, column: 13
              System.out.println("orch received: recOrderStatus");//sysj\orchestrator.sysj line: 65, column: 7
              S31521=1;
              if(orderIsDone_1.getprestatus()){//sysj\orchestrator.sysj line: 71, column: 13
                if(currentOrder_1.getprestatus()){//sysj\orchestrator.sysj line: 72, column: 14
                  tempOrder_thread_2 = (currentOrder_1.getpreval() == null ? null : ((Order)currentOrder_1.getpreval()));//sysj\orchestrator.sysj line: 73, column: 7
                  tempOrder_thread_2.setOrderStatus("Done");//sysj\orchestrator.sysj line: 75, column: 7
                  S31301=0;
                  orderStatus.setPresent();//sysj\orchestrator.sysj line: 77, column: 8
                  currsigs.addElement(orderStatus);
                  orderStatus.setValue(tempOrder_thread_2);//sysj\orchestrator.sysj line: 77, column: 8
                  active[2]=1;
                  ends[2]=1;
                  tdone[2]=1;
                }
                else {
                  S31521=2;
                  active[2]=1;
                  ends[2]=1;
                  tdone[2]=1;
                }
              }
              else {
                S31521=2;
                active[2]=1;
                ends[2]=1;
                tdone[2]=1;
              }
            }
            else {
              orderStatus.setPresent();//sysj\orchestrator.sysj line: 62, column: 8
              currsigs.addElement(orderStatus);
              orderStatus.setValue(tempOrder_thread_2);//sysj\orchestrator.sysj line: 62, column: 8
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            break;
          
          case 1 : 
            switch(S31301){
              case 0 : 
                if(recOrderStatus.getprestatus()){//sysj\orchestrator.sysj line: 76, column: 13
                  System.out.println("initialising next order...");//sysj\orchestrator.sysj line: 81, column: 7
                  S31301=1;
                  if(!fifoQueue_thread_2.isEmpty()){//sysj\orchestrator.sysj line: 82, column: 10
                    nextOrder_thread_2 = (Order)fifoQueue_thread_2.get(0);//sysj\orchestrator.sysj line: 83, column: 8
                    fifoQueue_thread_2.remove(0);//sysj\orchestrator.sysj line: 84, column: 8
                    currentOrder_1.setPresent();//sysj\orchestrator.sysj line: 88, column: 9
                    currsigs.addElement(currentOrder_1);
                    currentOrder_1.setValue(nextOrder_thread_2);//sysj\orchestrator.sysj line: 88, column: 9
                    startOrder_1.setPresent();//sysj\orchestrator.sysj line: 89, column: 9
                    currsigs.addElement(startOrder_1);
                    nextOrder_thread_2.setOrderStatus("Started");//sysj\orchestrator.sysj line: 93, column: 8
                    System.out.println("emitting next orderstatus: started");//sysj\orchestrator.sysj line: 94, column: 8
                    orderStatus.setPresent();//sysj\orchestrator.sysj line: 96, column: 9
                    currsigs.addElement(orderStatus);
                    orderStatus.setValue(nextOrder_thread_2);//sysj\orchestrator.sysj line: 96, column: 9
                    active[2]=1;
                    ends[2]=1;
                    tdone[2]=1;
                  }
                  else {
                    S31521=2;
                    active[2]=1;
                    ends[2]=1;
                    tdone[2]=1;
                  }
                }
                else {
                  orderStatus.setPresent();//sysj\orchestrator.sysj line: 77, column: 8
                  currsigs.addElement(orderStatus);
                  orderStatus.setValue(tempOrder_thread_2);//sysj\orchestrator.sysj line: 77, column: 8
                  active[2]=1;
                  ends[2]=1;
                  tdone[2]=1;
                }
                break;
              
              case 1 : 
                if(recOrderStatus.getprestatus()){//sysj\orchestrator.sysj line: 95, column: 14
                  S31521=2;
                  active[2]=1;
                  ends[2]=1;
                  tdone[2]=1;
                }
                else {
                  orderStatus.setPresent();//sysj\orchestrator.sysj line: 96, column: 9
                  currsigs.addElement(orderStatus);
                  orderStatus.setValue(nextOrder_thread_2);//sysj\orchestrator.sysj line: 96, column: 9
                  active[2]=1;
                  ends[2]=1;
                  tdone[2]=1;
                }
                break;
              
            }
            break;
          
          case 2 : 
            S31521=2;
            S31521=0;
            if(order.getprestatus()){//sysj\orchestrator.sysj line: 33, column: 13
              System.out.println("got order!");//sysj\orchestrator.sysj line: 34, column: 6
              newOrder_thread_2 = (order.getpreval() == null ? null : ((Order)order.getpreval()));//sysj\orchestrator.sysj line: 35, column: 6
              System.out.println(newOrder_thread_2.getQuantity());//sysj\orchestrator.sysj line: 36, column: 6
              fifoQueue_thread_2.add(newOrder_thread_2);//sysj\orchestrator.sysj line: 38, column: 6
              if(initABS_1.getprestatus()){//sysj\orchestrator.sysj line: 41, column: 14
                System.out.println("start of ABS get first item");//sysj\orchestrator.sysj line: 42, column: 7
                tempOrder_thread_2 = (Order)fifoQueue_thread_2.get(0);//sysj\orchestrator.sysj line: 43, column: 7
                fifoQueue_thread_2.remove(0);//sysj\orchestrator.sysj line: 46, column: 7
                System.out.println(newOrder_thread_2.getCustomerID());//sysj\orchestrator.sysj line: 47, column: 7
                currentOrder_1.setPresent();//sysj\orchestrator.sysj line: 51, column: 8
                currsigs.addElement(currentOrder_1);
                currentOrder_1.setValue(tempOrder_thread_2);//sysj\orchestrator.sysj line: 51, column: 8
                startOrder_1.setPresent();//sysj\orchestrator.sysj line: 52, column: 8
                currsigs.addElement(startOrder_1);
                tempOrder_thread_2.setOrderStatus("Started");//sysj\orchestrator.sysj line: 57, column: 7
                System.out.println("emitting orderstatus: started");//sysj\orchestrator.sysj line: 58, column: 7
                orderStatus.setPresent();//sysj\orchestrator.sysj line: 62, column: 8
                currsigs.addElement(orderStatus);
                orderStatus.setValue(tempOrder_thread_2);//sysj\orchestrator.sysj line: 62, column: 8
                active[2]=1;
                ends[2]=1;
                tdone[2]=1;
              }
              else {
                S31521=1;
                if(orderIsDone_1.getprestatus()){//sysj\orchestrator.sysj line: 71, column: 13
                  if(currentOrder_1.getprestatus()){//sysj\orchestrator.sysj line: 72, column: 14
                    tempOrder_thread_2 = (currentOrder_1.getpreval() == null ? null : ((Order)currentOrder_1.getpreval()));//sysj\orchestrator.sysj line: 73, column: 7
                    tempOrder_thread_2.setOrderStatus("Done");//sysj\orchestrator.sysj line: 75, column: 7
                    S31301=0;
                    orderStatus.setPresent();//sysj\orchestrator.sysj line: 77, column: 8
                    currsigs.addElement(orderStatus);
                    orderStatus.setValue(tempOrder_thread_2);//sysj\orchestrator.sysj line: 77, column: 8
                    active[2]=1;
                    ends[2]=1;
                    tdone[2]=1;
                  }
                  else {
                    S31521=2;
                    active[2]=1;
                    ends[2]=1;
                    tdone[2]=1;
                  }
                }
                else {
                  S31521=2;
                  active[2]=1;
                  ends[2]=1;
                  tdone[2]=1;
                }
              }
            }
            else {
              S31521=1;
              if(orderIsDone_1.getprestatus()){//sysj\orchestrator.sysj line: 71, column: 13
                if(currentOrder_1.getprestatus()){//sysj\orchestrator.sysj line: 72, column: 14
                  tempOrder_thread_2 = (currentOrder_1.getpreval() == null ? null : ((Order)currentOrder_1.getpreval()));//sysj\orchestrator.sysj line: 73, column: 7
                  tempOrder_thread_2.setOrderStatus("Done");//sysj\orchestrator.sysj line: 75, column: 7
                  S31301=0;
                  orderStatus.setPresent();//sysj\orchestrator.sysj line: 77, column: 8
                  currsigs.addElement(orderStatus);
                  orderStatus.setValue(tempOrder_thread_2);//sysj\orchestrator.sysj line: 77, column: 8
                  active[2]=1;
                  ends[2]=1;
                  tdone[2]=1;
                }
                else {
                  S31521=2;
                  active[2]=1;
                  ends[2]=1;
                  tdone[2]=1;
                }
              }
              else {
                S31521=2;
                active[2]=1;
                ends[2]=1;
                tdone[2]=1;
              }
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread38213(int [] tdone, int [] ends){
        S38200=1;
    S37904=0;
    active[11]=1;
    ends[11]=1;
    tdone[11]=1;
  }

  public void thread38212(int [] tdone, int [] ends){
        S37902=1;
    S36964=0;
    active[10]=1;
    ends[10]=1;
    tdone[10]=1;
  }

  public void thread38211(int [] tdone, int [] ends){
        S36962=1;
    S36024=0;
    active[9]=1;
    ends[9]=1;
    tdone[9]=1;
  }

  public void thread38210(int [] tdone, int [] ends){
        S36022=1;
    S35084=0;
    active[8]=1;
    ends[8]=1;
    tdone[8]=1;
  }

  public void thread38209(int [] tdone, int [] ends){
        S35082=1;
    S34144=0;
    active[7]=1;
    ends[7]=1;
    tdone[7]=1;
  }

  public void thread38208(int [] tdone, int [] ends){
        S34142=1;
    S33248=0;
    active[6]=1;
    ends[6]=1;
    tdone[6]=1;
  }

  public void thread38207(int [] tdone, int [] ends){
        S33202=1;
    bottlePlaced_thread_5 = 0;//sysj\orchestrator.sysj line: 161, column: 3
    S32950=0;
    if(currentOrder_1.getprestatus()){//sysj\orchestrator.sysj line: 165, column: 12
      order_thread_5 = (Order)(currentOrder_1.getpreval() == null ? null : ((Order)currentOrder_1.getpreval()));//sysj\orchestrator.sysj line: 166, column: 5
      bottlePlaced_thread_5 = order_thread_5.getQuantity();//sysj\orchestrator.sysj line: 167, column: 5
      S32901=0;
      if(bottlePlaced_thread_5 >= 0){//sysj\orchestrator.sysj line: 169, column: 11
        System.out.println("Orch: Sending conveyor request");//sysj\orchestrator.sysj line: 170, column: 6
        sigConveyorReq_1.setPresent();//sysj\orchestrator.sysj line: 171, column: 6
        currsigs.addElement(sigConveyorReq_1);
        sigConveyorReq_1.setValue(true);//sysj\orchestrator.sysj line: 171, column: 6
        S32902=0;
        active[5]=1;
        ends[5]=1;
        tdone[5]=1;
      }
      else {
        ends[5]=2;
        ;//sysj\orchestrator.sysj line: 169, column: 5
        S32901=1;
        orderIsDone_1.setPresent();//sysj\orchestrator.sysj line: 179, column: 5
        currsigs.addElement(orderIsDone_1);
        active[5]=1;
        ends[5]=1;
        tdone[5]=1;
      }
    }
    else {
      S32950=1;
      active[5]=1;
      ends[5]=1;
      tdone[5]=1;
    }
  }

  public void thread38206(int [] tdone, int [] ends){
        S32900=1;
    if(startOrder_1.getprestatus()){//sysj\orchestrator.sysj line: 124, column: 12
      if(currentOrder_1.getprestatus()){//sysj\orchestrator.sysj line: 125, column: 13
        myOrder_thread_4 = (currentOrder_1.getpreval() == null ? null : ((Order)currentOrder_1.getpreval()));//sysj\orchestrator.sysj line: 126, column: 6
        currentOrder_1.setPresent();//sysj\orchestrator.sysj line: 129, column: 7
        currsigs.addElement(currentOrder_1);
        currentOrder_1.setValue(myOrder_thread_4);//sysj\orchestrator.sysj line: 129, column: 7
        foundCurrentOrder_1.setPresent();//sysj\orchestrator.sysj line: 130, column: 7
        currsigs.addElement(foundCurrentOrder_1);
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

  public void thread38205(int [] tdone, int [] ends){
        S32874=1;
    S32862=0;
    initABS_1.setPresent();//sysj\orchestrator.sysj line: 114, column: 5
    currsigs.addElement(initABS_1);
    active[3]=1;
    ends[3]=1;
    tdone[3]=1;
  }

  public void thread38204(int [] tdone, int [] ends){
        S32857=1;
    fifoQueue_thread_2 = new ArrayList();//sysj\orchestrator.sysj line: 25, column: 3
    liquidPercent_thread_2 = new ArrayList();//sysj\orchestrator.sysj line: 26, column: 3
    S31521=0;
    if(order.getprestatus()){//sysj\orchestrator.sysj line: 33, column: 13
      System.out.println("got order!");//sysj\orchestrator.sysj line: 34, column: 6
      newOrder_thread_2 = (order.getpreval() == null ? null : ((Order)order.getpreval()));//sysj\orchestrator.sysj line: 35, column: 6
      System.out.println(newOrder_thread_2.getQuantity());//sysj\orchestrator.sysj line: 36, column: 6
      fifoQueue_thread_2.add(newOrder_thread_2);//sysj\orchestrator.sysj line: 38, column: 6
      if(initABS_1.getprestatus()){//sysj\orchestrator.sysj line: 41, column: 14
        System.out.println("start of ABS get first item");//sysj\orchestrator.sysj line: 42, column: 7
        tempOrder_thread_2 = (Order)fifoQueue_thread_2.get(0);//sysj\orchestrator.sysj line: 43, column: 7
        fifoQueue_thread_2.remove(0);//sysj\orchestrator.sysj line: 46, column: 7
        System.out.println(newOrder_thread_2.getCustomerID());//sysj\orchestrator.sysj line: 47, column: 7
        currentOrder_1.setPresent();//sysj\orchestrator.sysj line: 51, column: 8
        currsigs.addElement(currentOrder_1);
        currentOrder_1.setValue(tempOrder_thread_2);//sysj\orchestrator.sysj line: 51, column: 8
        startOrder_1.setPresent();//sysj\orchestrator.sysj line: 52, column: 8
        currsigs.addElement(startOrder_1);
        tempOrder_thread_2.setOrderStatus("Started");//sysj\orchestrator.sysj line: 57, column: 7
        System.out.println("emitting orderstatus: started");//sysj\orchestrator.sysj line: 58, column: 7
        orderStatus.setPresent();//sysj\orchestrator.sysj line: 62, column: 8
        currsigs.addElement(orderStatus);
        orderStatus.setValue(tempOrder_thread_2);//sysj\orchestrator.sysj line: 62, column: 8
        active[2]=1;
        ends[2]=1;
        tdone[2]=1;
      }
      else {
        S31521=1;
        if(orderIsDone_1.getprestatus()){//sysj\orchestrator.sysj line: 71, column: 13
          if(currentOrder_1.getprestatus()){//sysj\orchestrator.sysj line: 72, column: 14
            tempOrder_thread_2 = (currentOrder_1.getpreval() == null ? null : ((Order)currentOrder_1.getpreval()));//sysj\orchestrator.sysj line: 73, column: 7
            tempOrder_thread_2.setOrderStatus("Done");//sysj\orchestrator.sysj line: 75, column: 7
            S31301=0;
            orderStatus.setPresent();//sysj\orchestrator.sysj line: 77, column: 8
            currsigs.addElement(orderStatus);
            orderStatus.setValue(tempOrder_thread_2);//sysj\orchestrator.sysj line: 77, column: 8
            active[2]=1;
            ends[2]=1;
            tdone[2]=1;
          }
          else {
            S31521=2;
            active[2]=1;
            ends[2]=1;
            tdone[2]=1;
          }
        }
        else {
          S31521=2;
          active[2]=1;
          ends[2]=1;
          tdone[2]=1;
        }
      }
    }
    else {
      S31521=1;
      if(orderIsDone_1.getprestatus()){//sysj\orchestrator.sysj line: 71, column: 13
        if(currentOrder_1.getprestatus()){//sysj\orchestrator.sysj line: 72, column: 14
          tempOrder_thread_2 = (currentOrder_1.getpreval() == null ? null : ((Order)currentOrder_1.getpreval()));//sysj\orchestrator.sysj line: 73, column: 7
          tempOrder_thread_2.setOrderStatus("Done");//sysj\orchestrator.sysj line: 75, column: 7
          S31301=0;
          orderStatus.setPresent();//sysj\orchestrator.sysj line: 77, column: 8
          currsigs.addElement(orderStatus);
          orderStatus.setValue(tempOrder_thread_2);//sysj\orchestrator.sysj line: 77, column: 8
          active[2]=1;
          ends[2]=1;
          tdone[2]=1;
        }
        else {
          S31521=2;
          active[2]=1;
          ends[2]=1;
          tdone[2]=1;
        }
      }
      else {
        S31521=2;
        active[2]=1;
        ends[2]=1;
        tdone[2]=1;
      }
    }
  }

  public void runClockDomain(){
    for(int i=0;i<ends.length;i++){
      ends[i] = 0;
      tdone[i] = 0;
    }
    
    RUN: while(true){
      switch(S38202){
        case 0 : 
          S38202=0;
          break RUN;
        
        case 1 : 
          S38202=2;
          S38202=2;
          sigConveyorReq_1.setClear();//sysj\orchestrator.sysj line: 12, column: 2
          sigCapperReq_1.setClear();//sysj\orchestrator.sysj line: 12, column: 2
          sigCapLoaderReq_1.setClear();//sysj\orchestrator.sysj line: 12, column: 2
          sigRotaryReq_1.setClear();//sysj\orchestrator.sysj line: 12, column: 2
          sigFillerReq_1.setClear();//sysj\orchestrator.sysj line: 13, column: 2
          recConveyorStatus_1.setClear();//sysj\orchestrator.sysj line: 14, column: 2
          recCapperStatus_1.setClear();//sysj\orchestrator.sysj line: 14, column: 2
          recCapLoaderStatus_1.setClear();//sysj\orchestrator.sysj line: 14, column: 2
          recFillerStatus_1.setClear();//sysj\orchestrator.sysj line: 14, column: 2
          recRotaryStatus_1.setClear();//sysj\orchestrator.sysj line: 14, column: 2
          getNextBottle_1.setClear();//sysj\orchestrator.sysj line: 15, column: 2
          startOrder_1.setClear();//sysj\orchestrator.sysj line: 18, column: 2
          orderIsDone_1.setClear();//sysj\orchestrator.sysj line: 19, column: 2
          initABS_1.setClear();//sysj\orchestrator.sysj line: 20, column: 2
          foundCurrentOrder_1.setClear();//sysj\orchestrator.sysj line: 21, column: 2
          currentOrder_1.setClear();//sysj\orchestrator.sysj line: 22, column: 2
          thread38204(tdone,ends);
          thread38205(tdone,ends);
          thread38206(tdone,ends);
          thread38207(tdone,ends);
          thread38208(tdone,ends);
          thread38209(tdone,ends);
          thread38210(tdone,ends);
          thread38211(tdone,ends);
          thread38212(tdone,ends);
          thread38213(tdone,ends);
          int biggest38214 = 0;
          if(ends[2]>=biggest38214){
            biggest38214=ends[2];
          }
          if(ends[3]>=biggest38214){
            biggest38214=ends[3];
          }
          if(ends[4]>=biggest38214){
            biggest38214=ends[4];
          }
          if(ends[5]>=biggest38214){
            biggest38214=ends[5];
          }
          if(ends[6]>=biggest38214){
            biggest38214=ends[6];
          }
          if(ends[7]>=biggest38214){
            biggest38214=ends[7];
          }
          if(ends[8]>=biggest38214){
            biggest38214=ends[8];
          }
          if(ends[9]>=biggest38214){
            biggest38214=ends[9];
          }
          if(ends[10]>=biggest38214){
            biggest38214=ends[10];
          }
          if(ends[11]>=biggest38214){
            biggest38214=ends[11];
          }
          if(biggest38214 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
        
        case 2 : 
          sigConveyorReq_1.setClear();//sysj\orchestrator.sysj line: 12, column: 2
          sigCapperReq_1.setClear();//sysj\orchestrator.sysj line: 12, column: 2
          sigCapLoaderReq_1.setClear();//sysj\orchestrator.sysj line: 12, column: 2
          sigRotaryReq_1.setClear();//sysj\orchestrator.sysj line: 12, column: 2
          sigFillerReq_1.setClear();//sysj\orchestrator.sysj line: 13, column: 2
          recConveyorStatus_1.setClear();//sysj\orchestrator.sysj line: 14, column: 2
          recCapperStatus_1.setClear();//sysj\orchestrator.sysj line: 14, column: 2
          recCapLoaderStatus_1.setClear();//sysj\orchestrator.sysj line: 14, column: 2
          recFillerStatus_1.setClear();//sysj\orchestrator.sysj line: 14, column: 2
          recRotaryStatus_1.setClear();//sysj\orchestrator.sysj line: 14, column: 2
          getNextBottle_1.setClear();//sysj\orchestrator.sysj line: 15, column: 2
          startOrder_1.setClear();//sysj\orchestrator.sysj line: 18, column: 2
          orderIsDone_1.setClear();//sysj\orchestrator.sysj line: 19, column: 2
          initABS_1.setClear();//sysj\orchestrator.sysj line: 20, column: 2
          foundCurrentOrder_1.setClear();//sysj\orchestrator.sysj line: 21, column: 2
          currentOrder_1.setClear();//sysj\orchestrator.sysj line: 22, column: 2
          thread38215(tdone,ends);
          thread38216(tdone,ends);
          thread38217(tdone,ends);
          thread38218(tdone,ends);
          thread38219(tdone,ends);
          thread38220(tdone,ends);
          thread38221(tdone,ends);
          thread38222(tdone,ends);
          thread38223(tdone,ends);
          thread38224(tdone,ends);
          int biggest38233 = 0;
          if(ends[2]>=biggest38233){
            biggest38233=ends[2];
          }
          if(ends[3]>=biggest38233){
            biggest38233=ends[3];
          }
          if(ends[4]>=biggest38233){
            biggest38233=ends[4];
          }
          if(ends[5]>=biggest38233){
            biggest38233=ends[5];
          }
          if(ends[6]>=biggest38233){
            biggest38233=ends[6];
          }
          if(ends[7]>=biggest38233){
            biggest38233=ends[7];
          }
          if(ends[8]>=biggest38233){
            biggest38233=ends[8];
          }
          if(ends[9]>=biggest38233){
            biggest38233=ends[9];
          }
          if(ends[10]>=biggest38233){
            biggest38233=ends[10];
          }
          if(ends[11]>=biggest38233){
            biggest38233=ends[11];
          }
          if(biggest38233 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
          //FINXME code
          if(biggest38233 == 0){
            S38202=0;
            active[1]=0;
            ends[1]=0;
            S38202=0;
            break RUN;
          }
        
      }
    }
  }

  public void init(){
    char [] active1 = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
    char [] paused1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    char [] suspended1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
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
    startOrder_1 = new Signal();
    orderIsDone_1 = new Signal();
    initABS_1 = new Signal();
    foundCurrentOrder_1 = new Signal();
    currentOrder_1 = new Signal();
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
          conveyorReq_o.gethook();
          rotaryReq_o.gethook();
          fillerReq_o.gethook();
          capperReq_o.gethook();
          capLoaderReq_o.gethook();
          recOrderStatus.gethook();
          order.gethook();
          df = true;
        }
        runClockDomain();
      }
      recOrderStatus.setpreclear();
      order.setpreclear();
      orderStatus.setpreclear();
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
      startOrder_1.setpreclear();
      orderIsDone_1.setpreclear();
      initABS_1.setpreclear();
      foundCurrentOrder_1.setpreclear();
      currentOrder_1.setpreclear();
      int dummyint = 0;
      for(int qw=0;qw<currsigs.size();++qw){
        dummyint = ((Signal)currsigs.elementAt(qw)).getStatus() ? ((Signal)currsigs.elementAt(qw)).setprepresent() : ((Signal)currsigs.elementAt(qw)).setpreclear();
        ((Signal)currsigs.elementAt(qw)).setpreval(((Signal)currsigs.elementAt(qw)).getValue());
      }
      currsigs.removeAllElements();
      dummyint = recOrderStatus.getStatus() ? recOrderStatus.setprepresent() : recOrderStatus.setpreclear();
      recOrderStatus.setpreval(recOrderStatus.getValue());
      recOrderStatus.setClear();
      dummyint = order.getStatus() ? order.setprepresent() : order.setpreclear();
      order.setpreval(order.getValue());
      order.setClear();
      orderStatus.sethook();
      orderStatus.setClear();
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
      startOrder_1.setClear();
      orderIsDone_1.setClear();
      initABS_1.setClear();
      foundCurrentOrder_1.setClear();
      currentOrder_1.setClear();
      conveyorStatus_in.sethook();
      capperStatus_in.sethook();
      capLoaderStatus_in.sethook();
      fillerStatus_in.sethook();
      rotaryStatus_in.sethook();
      conveyorReq_o.sethook();
      rotaryReq_o.sethook();
      fillerReq_o.sethook();
      capperReq_o.sethook();
      capLoaderReq_o.sethook();
      if(paused[1]!=0 || suspended[1]!=0 || active[1]!=1);
      else{
        conveyorStatus_in.gethook();
        capperStatus_in.gethook();
        capLoaderStatus_in.gethook();
        fillerStatus_in.gethook();
        rotaryStatus_in.gethook();
        conveyorReq_o.gethook();
        rotaryReq_o.gethook();
        fillerReq_o.gethook();
        capperReq_o.gethook();
        capLoaderReq_o.gethook();
        recOrderStatus.gethook();
        order.gethook();
      }
      runFinisher();
      if(active[1] == 0){
      	this.terminated = true;
      }
      if(!threaded) break;
    }
  }
}
