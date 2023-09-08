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
  private int S38644 = 1;
  private int S33160 = 1;
  private int S32964 = 1;
  private int S32926 = 1;
  private int S34100 = 1;
  private int S33206 = 1;
  private int S33168 = 1;
  private int S33163 = 1;
  private int S33213 = 1;
  private int S33208 = 1;
  private int S35040 = 1;
  private int S34102 = 1;
  private int S34109 = 1;
  private int S34104 = 1;
  private int S34153 = 1;
  private int S34148 = 1;
  private int S35980 = 1;
  private int S35042 = 1;
  private int S35049 = 1;
  private int S35044 = 1;
  private int S35093 = 1;
  private int S35088 = 1;
  private int S36920 = 1;
  private int S35982 = 1;
  private int S35989 = 1;
  private int S35984 = 1;
  private int S36033 = 1;
  private int S36028 = 1;
  private int S37860 = 1;
  private int S36922 = 1;
  private int S36929 = 1;
  private int S36924 = 1;
  private int S36973 = 1;
  private int S36968 = 1;
  private int S38642 = 1;
  private int S37863 = 1;
  private int S37866 = 1;
  private int S37869 = 1;
  private int S37872 = 1;
  private int S37875 = 1;
  
  private int[] ends = new int[12];
  private int[] tdone = new int[12];
  
  public void thread38671(int [] tdone, int [] ends){
        S37875=1;
    active[11]=1;
    ends[11]=1;
    tdone[11]=1;
  }

  public void thread38670(int [] tdone, int [] ends){
        S37872=1;
    active[10]=1;
    ends[10]=1;
    tdone[10]=1;
  }

  public void thread38669(int [] tdone, int [] ends){
        S37869=1;
    active[9]=1;
    ends[9]=1;
    tdone[9]=1;
  }

  public void thread38667(int [] tdone, int [] ends){
        switch(S37875){
      case 0 : 
        active[11]=0;
        ends[11]=0;
        tdone[11]=1;
        break;
      
      case 1 : 
        if(recCapperStatus_1.getprestatus()){//sysj\orchestrator.sysj line: 118, column: 73
          S37875=0;
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

  public void thread38666(int [] tdone, int [] ends){
        switch(S37872){
      case 0 : 
        active[10]=0;
        ends[10]=0;
        tdone[10]=1;
        break;
      
      case 1 : 
        if(recCapLoaderStatus_1.getprestatus()){//sysj\orchestrator.sysj line: 118, column: 41
          S37872=0;
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

  public void thread38665(int [] tdone, int [] ends){
        switch(S37869){
      case 0 : 
        active[9]=0;
        ends[9]=0;
        tdone[9]=1;
        break;
      
      case 1 : 
        if(recFillerStatus_1.getprestatus()){//sysj\orchestrator.sysj line: 118, column: 12
          S37869=0;
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

  public void thread38663(int [] tdone, int [] ends){
        S37875=1;
    active[11]=1;
    ends[11]=1;
    tdone[11]=1;
  }

  public void thread38662(int [] tdone, int [] ends){
        S37872=1;
    active[10]=1;
    ends[10]=1;
    tdone[10]=1;
  }

  public void thread38661(int [] tdone, int [] ends){
        S37869=1;
    active[9]=1;
    ends[9]=1;
    tdone[9]=1;
  }

  public void thread38660(int [] tdone, int [] ends){
        switch(S38642){
      case 0 : 
        active[8]=0;
        ends[8]=0;
        tdone[8]=1;
        break;
      
      case 1 : 
        switch(S37863){
          case 0 : 
            if(recConveyorStatus_1.getprestatus()){//sysj\orchestrator.sysj line: 108, column: 10
              sigRotaryReq_1.setPresent();//sysj\orchestrator.sysj line: 109, column: 4
              currsigs.addElement(sigRotaryReq_1);
              S37863=1;
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
              S37863=2;
              System.out.println("Orch: New bottle. Preparing to send requests..");//sysj\orchestrator.sysj line: 114, column: 5
              sigFillerReq_1.setPresent();//sysj\orchestrator.sysj line: 115, column: 5
              currsigs.addElement(sigFillerReq_1);
              sigFillerReq_1.setValue(liquidPercent_thread_8);//sysj\orchestrator.sysj line: 115, column: 5
              sigCapLoaderReq_1.setPresent();//sysj\orchestrator.sysj line: 116, column: 5
              currsigs.addElement(sigCapLoaderReq_1);
              sigCapperReq_1.setPresent();//sysj\orchestrator.sysj line: 117, column: 5
              currsigs.addElement(sigCapperReq_1);
              S37866=0;
              thread38661(tdone,ends);
              thread38662(tdone,ends);
              thread38663(tdone,ends);
              int biggest38664 = 0;
              if(ends[9]>=biggest38664){
                biggest38664=ends[9];
              }
              if(ends[10]>=biggest38664){
                biggest38664=ends[10];
              }
              if(ends[11]>=biggest38664){
                biggest38664=ends[11];
              }
              if(biggest38664 == 1){
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
            switch(S37866){
              case 0 : 
                thread38665(tdone,ends);
                thread38666(tdone,ends);
                thread38667(tdone,ends);
                int biggest38668 = 0;
                if(ends[9]>=biggest38668){
                  biggest38668=ends[9];
                }
                if(ends[10]>=biggest38668){
                  biggest38668=ends[10];
                }
                if(ends[11]>=biggest38668){
                  biggest38668=ends[11];
                }
                if(biggest38668 == 1){
                  active[8]=1;
                  ends[8]=1;
                  tdone[8]=1;
                }
                //FINXME code
                if(biggest38668 == 0){
                  sigRotaryReq_1.setPresent();//sysj\orchestrator.sysj line: 121, column: 5
                  currsigs.addElement(sigRotaryReq_1);
                  S37866=1;
                  active[8]=1;
                  ends[8]=1;
                  tdone[8]=1;
                }
                break;
              
              case 1 : 
                if(recRotaryStatus_1.getprestatus()){//sysj\orchestrator.sysj line: 122, column: 11
                  getNextBottle_1.setPresent();//sysj\orchestrator.sysj line: 125, column: 5
                  currsigs.addElement(getNextBottle_1);
                  S37866=2;
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
                S37866=2;
                System.out.println("Orch: New bottle. Preparing to send requests..");//sysj\orchestrator.sysj line: 114, column: 5
                sigFillerReq_1.setPresent();//sysj\orchestrator.sysj line: 115, column: 5
                currsigs.addElement(sigFillerReq_1);
                sigFillerReq_1.setValue(liquidPercent_thread_8);//sysj\orchestrator.sysj line: 115, column: 5
                sigCapLoaderReq_1.setPresent();//sysj\orchestrator.sysj line: 116, column: 5
                currsigs.addElement(sigCapLoaderReq_1);
                sigCapperReq_1.setPresent();//sysj\orchestrator.sysj line: 117, column: 5
                currsigs.addElement(sigCapperReq_1);
                S37866=0;
                thread38669(tdone,ends);
                thread38670(tdone,ends);
                thread38671(tdone,ends);
                int biggest38672 = 0;
                if(ends[9]>=biggest38672){
                  biggest38672=ends[9];
                }
                if(ends[10]>=biggest38672){
                  biggest38672=ends[10];
                }
                if(ends[11]>=biggest38672){
                  biggest38672=ends[11];
                }
                if(biggest38672 == 1){
                  active[8]=1;
                  ends[8]=1;
                  tdone[8]=1;
                }
                break;
              
            }
            break;
          
          case 3 : 
            S37863=3;
            S37863=0;
            active[8]=1;
            ends[8]=1;
            tdone[8]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread38659(int [] tdone, int [] ends){
        switch(S37860){
      case 0 : 
        active[7]=0;
        ends[7]=0;
        tdone[7]=1;
        break;
      
      case 1 : 
        switch(S36922){
          case 0 : 
            if(sigRotaryReq_1.getprestatus()){//sysj\orchestrator.sysj line: 89, column: 10
              System.out.println("Orch: Sending rotary request");//sysj\orchestrator.sysj line: 90, column: 4
              S36922=1;
              S36929=0;
              if(!rotaryReq_o.isPartnerPresent() || rotaryReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 91, column: 4
                rotaryReq_o.setREQ(false);//sysj\orchestrator.sysj line: 91, column: 4
                S36929=1;
                active[7]=1;
                ends[7]=1;
                tdone[7]=1;
              }
              else {
                S36924=0;
                if(rotaryReq_o.isACK()){//sysj\orchestrator.sysj line: 91, column: 4
                  rotaryReq_o.setVal(true);//sysj\orchestrator.sysj line: 91, column: 4
                  S36924=1;
                  if(!rotaryReq_o.isACK()){//sysj\orchestrator.sysj line: 91, column: 4
                    rotaryReq_o.setREQ(false);//sysj\orchestrator.sysj line: 91, column: 4
                    ends[7]=2;
                    ;//sysj\orchestrator.sysj line: 91, column: 4
                    S36922=2;
                    S36973=0;
                    if(!rotaryStatus_in.isPartnerPresent() || rotaryStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 92, column: 4
                      rotaryStatus_in.setACK(false);//sysj\orchestrator.sysj line: 92, column: 4
                      S36973=1;
                      active[7]=1;
                      ends[7]=1;
                      tdone[7]=1;
                    }
                    else {
                      S36968=0;
                      if(!rotaryStatus_in.isREQ()){//sysj\orchestrator.sysj line: 92, column: 4
                        rotaryStatus_in.setACK(true);//sysj\orchestrator.sysj line: 92, column: 4
                        S36968=1;
                        if(rotaryStatus_in.isREQ()){//sysj\orchestrator.sysj line: 92, column: 4
                          rotaryStatus_in.setACK(false);//sysj\orchestrator.sysj line: 92, column: 4
                          ends[7]=2;
                          ;//sysj\orchestrator.sysj line: 92, column: 4
                          System.out.println("Orch: Received rotary status");//sysj\orchestrator.sysj line: 93, column: 4
                          res_thread_7 = (String)(rotaryStatus_in.getVal() == null ? null : ((String)rotaryStatus_in.getVal()));//sysj\orchestrator.sysj line: 94, column: 4
                          recRotaryStatus_1.setPresent();//sysj\orchestrator.sysj line: 95, column: 4
                          currsigs.addElement(recRotaryStatus_1);
                          recRotaryStatus_1.setValue(res_thread_7);//sysj\orchestrator.sysj line: 95, column: 4
                          S36922=0;
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
            switch(S36929){
              case 0 : 
                if(!rotaryReq_o.isPartnerPresent() || rotaryReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 91, column: 4
                  rotaryReq_o.setREQ(false);//sysj\orchestrator.sysj line: 91, column: 4
                  S36929=1;
                  active[7]=1;
                  ends[7]=1;
                  tdone[7]=1;
                }
                else {
                  switch(S36924){
                    case 0 : 
                      if(rotaryReq_o.isACK()){//sysj\orchestrator.sysj line: 91, column: 4
                        rotaryReq_o.setVal(true);//sysj\orchestrator.sysj line: 91, column: 4
                        S36924=1;
                        if(!rotaryReq_o.isACK()){//sysj\orchestrator.sysj line: 91, column: 4
                          rotaryReq_o.setREQ(false);//sysj\orchestrator.sysj line: 91, column: 4
                          ends[7]=2;
                          ;//sysj\orchestrator.sysj line: 91, column: 4
                          S36922=2;
                          S36973=0;
                          if(!rotaryStatus_in.isPartnerPresent() || rotaryStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 92, column: 4
                            rotaryStatus_in.setACK(false);//sysj\orchestrator.sysj line: 92, column: 4
                            S36973=1;
                            active[7]=1;
                            ends[7]=1;
                            tdone[7]=1;
                          }
                          else {
                            S36968=0;
                            if(!rotaryStatus_in.isREQ()){//sysj\orchestrator.sysj line: 92, column: 4
                              rotaryStatus_in.setACK(true);//sysj\orchestrator.sysj line: 92, column: 4
                              S36968=1;
                              if(rotaryStatus_in.isREQ()){//sysj\orchestrator.sysj line: 92, column: 4
                                rotaryStatus_in.setACK(false);//sysj\orchestrator.sysj line: 92, column: 4
                                ends[7]=2;
                                ;//sysj\orchestrator.sysj line: 92, column: 4
                                System.out.println("Orch: Received rotary status");//sysj\orchestrator.sysj line: 93, column: 4
                                res_thread_7 = (String)(rotaryStatus_in.getVal() == null ? null : ((String)rotaryStatus_in.getVal()));//sysj\orchestrator.sysj line: 94, column: 4
                                recRotaryStatus_1.setPresent();//sysj\orchestrator.sysj line: 95, column: 4
                                currsigs.addElement(recRotaryStatus_1);
                                recRotaryStatus_1.setValue(res_thread_7);//sysj\orchestrator.sysj line: 95, column: 4
                                S36922=0;
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
                        S36922=2;
                        S36973=0;
                        if(!rotaryStatus_in.isPartnerPresent() || rotaryStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 92, column: 4
                          rotaryStatus_in.setACK(false);//sysj\orchestrator.sysj line: 92, column: 4
                          S36973=1;
                          active[7]=1;
                          ends[7]=1;
                          tdone[7]=1;
                        }
                        else {
                          S36968=0;
                          if(!rotaryStatus_in.isREQ()){//sysj\orchestrator.sysj line: 92, column: 4
                            rotaryStatus_in.setACK(true);//sysj\orchestrator.sysj line: 92, column: 4
                            S36968=1;
                            if(rotaryStatus_in.isREQ()){//sysj\orchestrator.sysj line: 92, column: 4
                              rotaryStatus_in.setACK(false);//sysj\orchestrator.sysj line: 92, column: 4
                              ends[7]=2;
                              ;//sysj\orchestrator.sysj line: 92, column: 4
                              System.out.println("Orch: Received rotary status");//sysj\orchestrator.sysj line: 93, column: 4
                              res_thread_7 = (String)(rotaryStatus_in.getVal() == null ? null : ((String)rotaryStatus_in.getVal()));//sysj\orchestrator.sysj line: 94, column: 4
                              recRotaryStatus_1.setPresent();//sysj\orchestrator.sysj line: 95, column: 4
                              currsigs.addElement(recRotaryStatus_1);
                              recRotaryStatus_1.setValue(res_thread_7);//sysj\orchestrator.sysj line: 95, column: 4
                              S36922=0;
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
                S36929=1;
                S36929=0;
                if(!rotaryReq_o.isPartnerPresent() || rotaryReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 91, column: 4
                  rotaryReq_o.setREQ(false);//sysj\orchestrator.sysj line: 91, column: 4
                  S36929=1;
                  active[7]=1;
                  ends[7]=1;
                  tdone[7]=1;
                }
                else {
                  S36924=0;
                  if(rotaryReq_o.isACK()){//sysj\orchestrator.sysj line: 91, column: 4
                    rotaryReq_o.setVal(true);//sysj\orchestrator.sysj line: 91, column: 4
                    S36924=1;
                    if(!rotaryReq_o.isACK()){//sysj\orchestrator.sysj line: 91, column: 4
                      rotaryReq_o.setREQ(false);//sysj\orchestrator.sysj line: 91, column: 4
                      ends[7]=2;
                      ;//sysj\orchestrator.sysj line: 91, column: 4
                      S36922=2;
                      S36973=0;
                      if(!rotaryStatus_in.isPartnerPresent() || rotaryStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 92, column: 4
                        rotaryStatus_in.setACK(false);//sysj\orchestrator.sysj line: 92, column: 4
                        S36973=1;
                        active[7]=1;
                        ends[7]=1;
                        tdone[7]=1;
                      }
                      else {
                        S36968=0;
                        if(!rotaryStatus_in.isREQ()){//sysj\orchestrator.sysj line: 92, column: 4
                          rotaryStatus_in.setACK(true);//sysj\orchestrator.sysj line: 92, column: 4
                          S36968=1;
                          if(rotaryStatus_in.isREQ()){//sysj\orchestrator.sysj line: 92, column: 4
                            rotaryStatus_in.setACK(false);//sysj\orchestrator.sysj line: 92, column: 4
                            ends[7]=2;
                            ;//sysj\orchestrator.sysj line: 92, column: 4
                            System.out.println("Orch: Received rotary status");//sysj\orchestrator.sysj line: 93, column: 4
                            res_thread_7 = (String)(rotaryStatus_in.getVal() == null ? null : ((String)rotaryStatus_in.getVal()));//sysj\orchestrator.sysj line: 94, column: 4
                            recRotaryStatus_1.setPresent();//sysj\orchestrator.sysj line: 95, column: 4
                            currsigs.addElement(recRotaryStatus_1);
                            recRotaryStatus_1.setValue(res_thread_7);//sysj\orchestrator.sysj line: 95, column: 4
                            S36922=0;
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
            switch(S36973){
              case 0 : 
                if(!rotaryStatus_in.isPartnerPresent() || rotaryStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 92, column: 4
                  rotaryStatus_in.setACK(false);//sysj\orchestrator.sysj line: 92, column: 4
                  S36973=1;
                  active[7]=1;
                  ends[7]=1;
                  tdone[7]=1;
                }
                else {
                  switch(S36968){
                    case 0 : 
                      if(!rotaryStatus_in.isREQ()){//sysj\orchestrator.sysj line: 92, column: 4
                        rotaryStatus_in.setACK(true);//sysj\orchestrator.sysj line: 92, column: 4
                        S36968=1;
                        if(rotaryStatus_in.isREQ()){//sysj\orchestrator.sysj line: 92, column: 4
                          rotaryStatus_in.setACK(false);//sysj\orchestrator.sysj line: 92, column: 4
                          ends[7]=2;
                          ;//sysj\orchestrator.sysj line: 92, column: 4
                          System.out.println("Orch: Received rotary status");//sysj\orchestrator.sysj line: 93, column: 4
                          res_thread_7 = (String)(rotaryStatus_in.getVal() == null ? null : ((String)rotaryStatus_in.getVal()));//sysj\orchestrator.sysj line: 94, column: 4
                          recRotaryStatus_1.setPresent();//sysj\orchestrator.sysj line: 95, column: 4
                          currsigs.addElement(recRotaryStatus_1);
                          recRotaryStatus_1.setValue(res_thread_7);//sysj\orchestrator.sysj line: 95, column: 4
                          S36922=0;
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
                        S36922=0;
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
                S36973=1;
                S36973=0;
                if(!rotaryStatus_in.isPartnerPresent() || rotaryStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 92, column: 4
                  rotaryStatus_in.setACK(false);//sysj\orchestrator.sysj line: 92, column: 4
                  S36973=1;
                  active[7]=1;
                  ends[7]=1;
                  tdone[7]=1;
                }
                else {
                  S36968=0;
                  if(!rotaryStatus_in.isREQ()){//sysj\orchestrator.sysj line: 92, column: 4
                    rotaryStatus_in.setACK(true);//sysj\orchestrator.sysj line: 92, column: 4
                    S36968=1;
                    if(rotaryStatus_in.isREQ()){//sysj\orchestrator.sysj line: 92, column: 4
                      rotaryStatus_in.setACK(false);//sysj\orchestrator.sysj line: 92, column: 4
                      ends[7]=2;
                      ;//sysj\orchestrator.sysj line: 92, column: 4
                      System.out.println("Orch: Received rotary status");//sysj\orchestrator.sysj line: 93, column: 4
                      res_thread_7 = (String)(rotaryStatus_in.getVal() == null ? null : ((String)rotaryStatus_in.getVal()));//sysj\orchestrator.sysj line: 94, column: 4
                      recRotaryStatus_1.setPresent();//sysj\orchestrator.sysj line: 95, column: 4
                      currsigs.addElement(recRotaryStatus_1);
                      recRotaryStatus_1.setValue(res_thread_7);//sysj\orchestrator.sysj line: 95, column: 4
                      S36922=0;
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

  public void thread38658(int [] tdone, int [] ends){
        switch(S36920){
      case 0 : 
        active[6]=0;
        ends[6]=0;
        tdone[6]=1;
        break;
      
      case 1 : 
        switch(S35982){
          case 0 : 
            if(sigFillerReq_1.getprestatus()){//sysj\orchestrator.sysj line: 76, column: 10
              System.out.println("Orch: Sending filler request");//sysj\orchestrator.sysj line: 77, column: 4
              req_thread_6 = (ArrayList)(sigFillerReq_1.getpreval() == null ? null : ((ArrayList)sigFillerReq_1.getpreval()));//sysj\orchestrator.sysj line: 78, column: 4
              S35982=1;
              S35989=0;
              if(!fillerReq_o.isPartnerPresent() || fillerReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 79, column: 4
                fillerReq_o.setREQ(false);//sysj\orchestrator.sysj line: 79, column: 4
                S35989=1;
                active[6]=1;
                ends[6]=1;
                tdone[6]=1;
              }
              else {
                S35984=0;
                if(fillerReq_o.isACK()){//sysj\orchestrator.sysj line: 79, column: 4
                  fillerReq_o.setVal(req_thread_6);//sysj\orchestrator.sysj line: 79, column: 4
                  S35984=1;
                  if(!fillerReq_o.isACK()){//sysj\orchestrator.sysj line: 79, column: 4
                    fillerReq_o.setREQ(false);//sysj\orchestrator.sysj line: 79, column: 4
                    ends[6]=2;
                    ;//sysj\orchestrator.sysj line: 79, column: 4
                    S35982=2;
                    S36033=0;
                    if(!fillerStatus_in.isPartnerPresent() || fillerStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 80, column: 4
                      fillerStatus_in.setACK(false);//sysj\orchestrator.sysj line: 80, column: 4
                      S36033=1;
                      active[6]=1;
                      ends[6]=1;
                      tdone[6]=1;
                    }
                    else {
                      S36028=0;
                      if(!fillerStatus_in.isREQ()){//sysj\orchestrator.sysj line: 80, column: 4
                        fillerStatus_in.setACK(true);//sysj\orchestrator.sysj line: 80, column: 4
                        S36028=1;
                        if(fillerStatus_in.isREQ()){//sysj\orchestrator.sysj line: 80, column: 4
                          fillerStatus_in.setACK(false);//sysj\orchestrator.sysj line: 80, column: 4
                          ends[6]=2;
                          ;//sysj\orchestrator.sysj line: 80, column: 4
                          System.out.println("Orch: Received filler status");//sysj\orchestrator.sysj line: 81, column: 4
                          res_thread_6 = (String)(fillerStatus_in.getVal() == null ? null : ((String)fillerStatus_in.getVal()));//sysj\orchestrator.sysj line: 82, column: 4
                          recFillerStatus_1.setPresent();//sysj\orchestrator.sysj line: 83, column: 4
                          currsigs.addElement(recFillerStatus_1);
                          recFillerStatus_1.setValue(res_thread_6);//sysj\orchestrator.sysj line: 83, column: 4
                          S35982=0;
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
            switch(S35989){
              case 0 : 
                if(!fillerReq_o.isPartnerPresent() || fillerReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 79, column: 4
                  fillerReq_o.setREQ(false);//sysj\orchestrator.sysj line: 79, column: 4
                  S35989=1;
                  active[6]=1;
                  ends[6]=1;
                  tdone[6]=1;
                }
                else {
                  switch(S35984){
                    case 0 : 
                      if(fillerReq_o.isACK()){//sysj\orchestrator.sysj line: 79, column: 4
                        fillerReq_o.setVal(req_thread_6);//sysj\orchestrator.sysj line: 79, column: 4
                        S35984=1;
                        if(!fillerReq_o.isACK()){//sysj\orchestrator.sysj line: 79, column: 4
                          fillerReq_o.setREQ(false);//sysj\orchestrator.sysj line: 79, column: 4
                          ends[6]=2;
                          ;//sysj\orchestrator.sysj line: 79, column: 4
                          S35982=2;
                          S36033=0;
                          if(!fillerStatus_in.isPartnerPresent() || fillerStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 80, column: 4
                            fillerStatus_in.setACK(false);//sysj\orchestrator.sysj line: 80, column: 4
                            S36033=1;
                            active[6]=1;
                            ends[6]=1;
                            tdone[6]=1;
                          }
                          else {
                            S36028=0;
                            if(!fillerStatus_in.isREQ()){//sysj\orchestrator.sysj line: 80, column: 4
                              fillerStatus_in.setACK(true);//sysj\orchestrator.sysj line: 80, column: 4
                              S36028=1;
                              if(fillerStatus_in.isREQ()){//sysj\orchestrator.sysj line: 80, column: 4
                                fillerStatus_in.setACK(false);//sysj\orchestrator.sysj line: 80, column: 4
                                ends[6]=2;
                                ;//sysj\orchestrator.sysj line: 80, column: 4
                                System.out.println("Orch: Received filler status");//sysj\orchestrator.sysj line: 81, column: 4
                                res_thread_6 = (String)(fillerStatus_in.getVal() == null ? null : ((String)fillerStatus_in.getVal()));//sysj\orchestrator.sysj line: 82, column: 4
                                recFillerStatus_1.setPresent();//sysj\orchestrator.sysj line: 83, column: 4
                                currsigs.addElement(recFillerStatus_1);
                                recFillerStatus_1.setValue(res_thread_6);//sysj\orchestrator.sysj line: 83, column: 4
                                S35982=0;
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
                        S35982=2;
                        S36033=0;
                        if(!fillerStatus_in.isPartnerPresent() || fillerStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 80, column: 4
                          fillerStatus_in.setACK(false);//sysj\orchestrator.sysj line: 80, column: 4
                          S36033=1;
                          active[6]=1;
                          ends[6]=1;
                          tdone[6]=1;
                        }
                        else {
                          S36028=0;
                          if(!fillerStatus_in.isREQ()){//sysj\orchestrator.sysj line: 80, column: 4
                            fillerStatus_in.setACK(true);//sysj\orchestrator.sysj line: 80, column: 4
                            S36028=1;
                            if(fillerStatus_in.isREQ()){//sysj\orchestrator.sysj line: 80, column: 4
                              fillerStatus_in.setACK(false);//sysj\orchestrator.sysj line: 80, column: 4
                              ends[6]=2;
                              ;//sysj\orchestrator.sysj line: 80, column: 4
                              System.out.println("Orch: Received filler status");//sysj\orchestrator.sysj line: 81, column: 4
                              res_thread_6 = (String)(fillerStatus_in.getVal() == null ? null : ((String)fillerStatus_in.getVal()));//sysj\orchestrator.sysj line: 82, column: 4
                              recFillerStatus_1.setPresent();//sysj\orchestrator.sysj line: 83, column: 4
                              currsigs.addElement(recFillerStatus_1);
                              recFillerStatus_1.setValue(res_thread_6);//sysj\orchestrator.sysj line: 83, column: 4
                              S35982=0;
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
                S35989=1;
                S35989=0;
                if(!fillerReq_o.isPartnerPresent() || fillerReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 79, column: 4
                  fillerReq_o.setREQ(false);//sysj\orchestrator.sysj line: 79, column: 4
                  S35989=1;
                  active[6]=1;
                  ends[6]=1;
                  tdone[6]=1;
                }
                else {
                  S35984=0;
                  if(fillerReq_o.isACK()){//sysj\orchestrator.sysj line: 79, column: 4
                    fillerReq_o.setVal(req_thread_6);//sysj\orchestrator.sysj line: 79, column: 4
                    S35984=1;
                    if(!fillerReq_o.isACK()){//sysj\orchestrator.sysj line: 79, column: 4
                      fillerReq_o.setREQ(false);//sysj\orchestrator.sysj line: 79, column: 4
                      ends[6]=2;
                      ;//sysj\orchestrator.sysj line: 79, column: 4
                      S35982=2;
                      S36033=0;
                      if(!fillerStatus_in.isPartnerPresent() || fillerStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 80, column: 4
                        fillerStatus_in.setACK(false);//sysj\orchestrator.sysj line: 80, column: 4
                        S36033=1;
                        active[6]=1;
                        ends[6]=1;
                        tdone[6]=1;
                      }
                      else {
                        S36028=0;
                        if(!fillerStatus_in.isREQ()){//sysj\orchestrator.sysj line: 80, column: 4
                          fillerStatus_in.setACK(true);//sysj\orchestrator.sysj line: 80, column: 4
                          S36028=1;
                          if(fillerStatus_in.isREQ()){//sysj\orchestrator.sysj line: 80, column: 4
                            fillerStatus_in.setACK(false);//sysj\orchestrator.sysj line: 80, column: 4
                            ends[6]=2;
                            ;//sysj\orchestrator.sysj line: 80, column: 4
                            System.out.println("Orch: Received filler status");//sysj\orchestrator.sysj line: 81, column: 4
                            res_thread_6 = (String)(fillerStatus_in.getVal() == null ? null : ((String)fillerStatus_in.getVal()));//sysj\orchestrator.sysj line: 82, column: 4
                            recFillerStatus_1.setPresent();//sysj\orchestrator.sysj line: 83, column: 4
                            currsigs.addElement(recFillerStatus_1);
                            recFillerStatus_1.setValue(res_thread_6);//sysj\orchestrator.sysj line: 83, column: 4
                            S35982=0;
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
            switch(S36033){
              case 0 : 
                if(!fillerStatus_in.isPartnerPresent() || fillerStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 80, column: 4
                  fillerStatus_in.setACK(false);//sysj\orchestrator.sysj line: 80, column: 4
                  S36033=1;
                  active[6]=1;
                  ends[6]=1;
                  tdone[6]=1;
                }
                else {
                  switch(S36028){
                    case 0 : 
                      if(!fillerStatus_in.isREQ()){//sysj\orchestrator.sysj line: 80, column: 4
                        fillerStatus_in.setACK(true);//sysj\orchestrator.sysj line: 80, column: 4
                        S36028=1;
                        if(fillerStatus_in.isREQ()){//sysj\orchestrator.sysj line: 80, column: 4
                          fillerStatus_in.setACK(false);//sysj\orchestrator.sysj line: 80, column: 4
                          ends[6]=2;
                          ;//sysj\orchestrator.sysj line: 80, column: 4
                          System.out.println("Orch: Received filler status");//sysj\orchestrator.sysj line: 81, column: 4
                          res_thread_6 = (String)(fillerStatus_in.getVal() == null ? null : ((String)fillerStatus_in.getVal()));//sysj\orchestrator.sysj line: 82, column: 4
                          recFillerStatus_1.setPresent();//sysj\orchestrator.sysj line: 83, column: 4
                          currsigs.addElement(recFillerStatus_1);
                          recFillerStatus_1.setValue(res_thread_6);//sysj\orchestrator.sysj line: 83, column: 4
                          S35982=0;
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
                        S35982=0;
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
                S36033=1;
                S36033=0;
                if(!fillerStatus_in.isPartnerPresent() || fillerStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 80, column: 4
                  fillerStatus_in.setACK(false);//sysj\orchestrator.sysj line: 80, column: 4
                  S36033=1;
                  active[6]=1;
                  ends[6]=1;
                  tdone[6]=1;
                }
                else {
                  S36028=0;
                  if(!fillerStatus_in.isREQ()){//sysj\orchestrator.sysj line: 80, column: 4
                    fillerStatus_in.setACK(true);//sysj\orchestrator.sysj line: 80, column: 4
                    S36028=1;
                    if(fillerStatus_in.isREQ()){//sysj\orchestrator.sysj line: 80, column: 4
                      fillerStatus_in.setACK(false);//sysj\orchestrator.sysj line: 80, column: 4
                      ends[6]=2;
                      ;//sysj\orchestrator.sysj line: 80, column: 4
                      System.out.println("Orch: Received filler status");//sysj\orchestrator.sysj line: 81, column: 4
                      res_thread_6 = (String)(fillerStatus_in.getVal() == null ? null : ((String)fillerStatus_in.getVal()));//sysj\orchestrator.sysj line: 82, column: 4
                      recFillerStatus_1.setPresent();//sysj\orchestrator.sysj line: 83, column: 4
                      currsigs.addElement(recFillerStatus_1);
                      recFillerStatus_1.setValue(res_thread_6);//sysj\orchestrator.sysj line: 83, column: 4
                      S35982=0;
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

  public void thread38657(int [] tdone, int [] ends){
        switch(S35980){
      case 0 : 
        active[5]=0;
        ends[5]=0;
        tdone[5]=1;
        break;
      
      case 1 : 
        switch(S35042){
          case 0 : 
            if(sigCapLoaderReq_1.getprestatus()){//sysj\orchestrator.sysj line: 63, column: 10
              System.out.println("Orch: Sending cap loader request");//sysj\orchestrator.sysj line: 64, column: 4
              S35042=1;
              S35049=0;
              if(!capLoaderReq_o.isPartnerPresent() || capLoaderReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 65, column: 4
                capLoaderReq_o.setREQ(false);//sysj\orchestrator.sysj line: 65, column: 4
                S35049=1;
                active[5]=1;
                ends[5]=1;
                tdone[5]=1;
              }
              else {
                S35044=0;
                if(capLoaderReq_o.isACK()){//sysj\orchestrator.sysj line: 65, column: 4
                  capLoaderReq_o.setVal(true);//sysj\orchestrator.sysj line: 65, column: 4
                  S35044=1;
                  if(!capLoaderReq_o.isACK()){//sysj\orchestrator.sysj line: 65, column: 4
                    capLoaderReq_o.setREQ(false);//sysj\orchestrator.sysj line: 65, column: 4
                    ends[5]=2;
                    ;//sysj\orchestrator.sysj line: 65, column: 4
                    S35042=2;
                    S35093=0;
                    if(!capLoaderStatus_in.isPartnerPresent() || capLoaderStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 66, column: 4
                      capLoaderStatus_in.setACK(false);//sysj\orchestrator.sysj line: 66, column: 4
                      S35093=1;
                      active[5]=1;
                      ends[5]=1;
                      tdone[5]=1;
                    }
                    else {
                      S35088=0;
                      if(!capLoaderStatus_in.isREQ()){//sysj\orchestrator.sysj line: 66, column: 4
                        capLoaderStatus_in.setACK(true);//sysj\orchestrator.sysj line: 66, column: 4
                        S35088=1;
                        if(capLoaderStatus_in.isREQ()){//sysj\orchestrator.sysj line: 66, column: 4
                          capLoaderStatus_in.setACK(false);//sysj\orchestrator.sysj line: 66, column: 4
                          ends[5]=2;
                          ;//sysj\orchestrator.sysj line: 66, column: 4
                          System.out.println("Orch: Received cap loader status");//sysj\orchestrator.sysj line: 67, column: 4
                          res_thread_5 = (String)(capLoaderStatus_in.getVal() == null ? null : ((String)capLoaderStatus_in.getVal()));//sysj\orchestrator.sysj line: 69, column: 4
                          recCapLoaderStatus_1.setPresent();//sysj\orchestrator.sysj line: 70, column: 4
                          currsigs.addElement(recCapLoaderStatus_1);
                          recCapLoaderStatus_1.setValue(res_thread_5);//sysj\orchestrator.sysj line: 70, column: 4
                          S35042=0;
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
            switch(S35049){
              case 0 : 
                if(!capLoaderReq_o.isPartnerPresent() || capLoaderReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 65, column: 4
                  capLoaderReq_o.setREQ(false);//sysj\orchestrator.sysj line: 65, column: 4
                  S35049=1;
                  active[5]=1;
                  ends[5]=1;
                  tdone[5]=1;
                }
                else {
                  switch(S35044){
                    case 0 : 
                      if(capLoaderReq_o.isACK()){//sysj\orchestrator.sysj line: 65, column: 4
                        capLoaderReq_o.setVal(true);//sysj\orchestrator.sysj line: 65, column: 4
                        S35044=1;
                        if(!capLoaderReq_o.isACK()){//sysj\orchestrator.sysj line: 65, column: 4
                          capLoaderReq_o.setREQ(false);//sysj\orchestrator.sysj line: 65, column: 4
                          ends[5]=2;
                          ;//sysj\orchestrator.sysj line: 65, column: 4
                          S35042=2;
                          S35093=0;
                          if(!capLoaderStatus_in.isPartnerPresent() || capLoaderStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 66, column: 4
                            capLoaderStatus_in.setACK(false);//sysj\orchestrator.sysj line: 66, column: 4
                            S35093=1;
                            active[5]=1;
                            ends[5]=1;
                            tdone[5]=1;
                          }
                          else {
                            S35088=0;
                            if(!capLoaderStatus_in.isREQ()){//sysj\orchestrator.sysj line: 66, column: 4
                              capLoaderStatus_in.setACK(true);//sysj\orchestrator.sysj line: 66, column: 4
                              S35088=1;
                              if(capLoaderStatus_in.isREQ()){//sysj\orchestrator.sysj line: 66, column: 4
                                capLoaderStatus_in.setACK(false);//sysj\orchestrator.sysj line: 66, column: 4
                                ends[5]=2;
                                ;//sysj\orchestrator.sysj line: 66, column: 4
                                System.out.println("Orch: Received cap loader status");//sysj\orchestrator.sysj line: 67, column: 4
                                res_thread_5 = (String)(capLoaderStatus_in.getVal() == null ? null : ((String)capLoaderStatus_in.getVal()));//sysj\orchestrator.sysj line: 69, column: 4
                                recCapLoaderStatus_1.setPresent();//sysj\orchestrator.sysj line: 70, column: 4
                                currsigs.addElement(recCapLoaderStatus_1);
                                recCapLoaderStatus_1.setValue(res_thread_5);//sysj\orchestrator.sysj line: 70, column: 4
                                S35042=0;
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
                        S35042=2;
                        S35093=0;
                        if(!capLoaderStatus_in.isPartnerPresent() || capLoaderStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 66, column: 4
                          capLoaderStatus_in.setACK(false);//sysj\orchestrator.sysj line: 66, column: 4
                          S35093=1;
                          active[5]=1;
                          ends[5]=1;
                          tdone[5]=1;
                        }
                        else {
                          S35088=0;
                          if(!capLoaderStatus_in.isREQ()){//sysj\orchestrator.sysj line: 66, column: 4
                            capLoaderStatus_in.setACK(true);//sysj\orchestrator.sysj line: 66, column: 4
                            S35088=1;
                            if(capLoaderStatus_in.isREQ()){//sysj\orchestrator.sysj line: 66, column: 4
                              capLoaderStatus_in.setACK(false);//sysj\orchestrator.sysj line: 66, column: 4
                              ends[5]=2;
                              ;//sysj\orchestrator.sysj line: 66, column: 4
                              System.out.println("Orch: Received cap loader status");//sysj\orchestrator.sysj line: 67, column: 4
                              res_thread_5 = (String)(capLoaderStatus_in.getVal() == null ? null : ((String)capLoaderStatus_in.getVal()));//sysj\orchestrator.sysj line: 69, column: 4
                              recCapLoaderStatus_1.setPresent();//sysj\orchestrator.sysj line: 70, column: 4
                              currsigs.addElement(recCapLoaderStatus_1);
                              recCapLoaderStatus_1.setValue(res_thread_5);//sysj\orchestrator.sysj line: 70, column: 4
                              S35042=0;
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
                S35049=1;
                S35049=0;
                if(!capLoaderReq_o.isPartnerPresent() || capLoaderReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 65, column: 4
                  capLoaderReq_o.setREQ(false);//sysj\orchestrator.sysj line: 65, column: 4
                  S35049=1;
                  active[5]=1;
                  ends[5]=1;
                  tdone[5]=1;
                }
                else {
                  S35044=0;
                  if(capLoaderReq_o.isACK()){//sysj\orchestrator.sysj line: 65, column: 4
                    capLoaderReq_o.setVal(true);//sysj\orchestrator.sysj line: 65, column: 4
                    S35044=1;
                    if(!capLoaderReq_o.isACK()){//sysj\orchestrator.sysj line: 65, column: 4
                      capLoaderReq_o.setREQ(false);//sysj\orchestrator.sysj line: 65, column: 4
                      ends[5]=2;
                      ;//sysj\orchestrator.sysj line: 65, column: 4
                      S35042=2;
                      S35093=0;
                      if(!capLoaderStatus_in.isPartnerPresent() || capLoaderStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 66, column: 4
                        capLoaderStatus_in.setACK(false);//sysj\orchestrator.sysj line: 66, column: 4
                        S35093=1;
                        active[5]=1;
                        ends[5]=1;
                        tdone[5]=1;
                      }
                      else {
                        S35088=0;
                        if(!capLoaderStatus_in.isREQ()){//sysj\orchestrator.sysj line: 66, column: 4
                          capLoaderStatus_in.setACK(true);//sysj\orchestrator.sysj line: 66, column: 4
                          S35088=1;
                          if(capLoaderStatus_in.isREQ()){//sysj\orchestrator.sysj line: 66, column: 4
                            capLoaderStatus_in.setACK(false);//sysj\orchestrator.sysj line: 66, column: 4
                            ends[5]=2;
                            ;//sysj\orchestrator.sysj line: 66, column: 4
                            System.out.println("Orch: Received cap loader status");//sysj\orchestrator.sysj line: 67, column: 4
                            res_thread_5 = (String)(capLoaderStatus_in.getVal() == null ? null : ((String)capLoaderStatus_in.getVal()));//sysj\orchestrator.sysj line: 69, column: 4
                            recCapLoaderStatus_1.setPresent();//sysj\orchestrator.sysj line: 70, column: 4
                            currsigs.addElement(recCapLoaderStatus_1);
                            recCapLoaderStatus_1.setValue(res_thread_5);//sysj\orchestrator.sysj line: 70, column: 4
                            S35042=0;
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
            switch(S35093){
              case 0 : 
                if(!capLoaderStatus_in.isPartnerPresent() || capLoaderStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 66, column: 4
                  capLoaderStatus_in.setACK(false);//sysj\orchestrator.sysj line: 66, column: 4
                  S35093=1;
                  active[5]=1;
                  ends[5]=1;
                  tdone[5]=1;
                }
                else {
                  switch(S35088){
                    case 0 : 
                      if(!capLoaderStatus_in.isREQ()){//sysj\orchestrator.sysj line: 66, column: 4
                        capLoaderStatus_in.setACK(true);//sysj\orchestrator.sysj line: 66, column: 4
                        S35088=1;
                        if(capLoaderStatus_in.isREQ()){//sysj\orchestrator.sysj line: 66, column: 4
                          capLoaderStatus_in.setACK(false);//sysj\orchestrator.sysj line: 66, column: 4
                          ends[5]=2;
                          ;//sysj\orchestrator.sysj line: 66, column: 4
                          System.out.println("Orch: Received cap loader status");//sysj\orchestrator.sysj line: 67, column: 4
                          res_thread_5 = (String)(capLoaderStatus_in.getVal() == null ? null : ((String)capLoaderStatus_in.getVal()));//sysj\orchestrator.sysj line: 69, column: 4
                          recCapLoaderStatus_1.setPresent();//sysj\orchestrator.sysj line: 70, column: 4
                          currsigs.addElement(recCapLoaderStatus_1);
                          recCapLoaderStatus_1.setValue(res_thread_5);//sysj\orchestrator.sysj line: 70, column: 4
                          S35042=0;
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
                        S35042=0;
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
                S35093=1;
                S35093=0;
                if(!capLoaderStatus_in.isPartnerPresent() || capLoaderStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 66, column: 4
                  capLoaderStatus_in.setACK(false);//sysj\orchestrator.sysj line: 66, column: 4
                  S35093=1;
                  active[5]=1;
                  ends[5]=1;
                  tdone[5]=1;
                }
                else {
                  S35088=0;
                  if(!capLoaderStatus_in.isREQ()){//sysj\orchestrator.sysj line: 66, column: 4
                    capLoaderStatus_in.setACK(true);//sysj\orchestrator.sysj line: 66, column: 4
                    S35088=1;
                    if(capLoaderStatus_in.isREQ()){//sysj\orchestrator.sysj line: 66, column: 4
                      capLoaderStatus_in.setACK(false);//sysj\orchestrator.sysj line: 66, column: 4
                      ends[5]=2;
                      ;//sysj\orchestrator.sysj line: 66, column: 4
                      System.out.println("Orch: Received cap loader status");//sysj\orchestrator.sysj line: 67, column: 4
                      res_thread_5 = (String)(capLoaderStatus_in.getVal() == null ? null : ((String)capLoaderStatus_in.getVal()));//sysj\orchestrator.sysj line: 69, column: 4
                      recCapLoaderStatus_1.setPresent();//sysj\orchestrator.sysj line: 70, column: 4
                      currsigs.addElement(recCapLoaderStatus_1);
                      recCapLoaderStatus_1.setValue(res_thread_5);//sysj\orchestrator.sysj line: 70, column: 4
                      S35042=0;
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

  public void thread38656(int [] tdone, int [] ends){
        switch(S35040){
      case 0 : 
        active[4]=0;
        ends[4]=0;
        tdone[4]=1;
        break;
      
      case 1 : 
        switch(S34102){
          case 0 : 
            if(sigCapperReq_1.getprestatus()){//sysj\orchestrator.sysj line: 51, column: 10
              System.out.println("Orch: Sending capper request");//sysj\orchestrator.sysj line: 52, column: 4
              S34102=1;
              S34109=0;
              if(!capperReq_o.isPartnerPresent() || capperReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 53, column: 4
                capperReq_o.setREQ(false);//sysj\orchestrator.sysj line: 53, column: 4
                S34109=1;
                active[4]=1;
                ends[4]=1;
                tdone[4]=1;
              }
              else {
                S34104=0;
                if(capperReq_o.isACK()){//sysj\orchestrator.sysj line: 53, column: 4
                  capperReq_o.setVal(true);//sysj\orchestrator.sysj line: 53, column: 4
                  S34104=1;
                  if(!capperReq_o.isACK()){//sysj\orchestrator.sysj line: 53, column: 4
                    capperReq_o.setREQ(false);//sysj\orchestrator.sysj line: 53, column: 4
                    ends[4]=2;
                    ;//sysj\orchestrator.sysj line: 53, column: 4
                    S34102=2;
                    S34153=0;
                    if(!capperStatus_in.isPartnerPresent() || capperStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 54, column: 4
                      capperStatus_in.setACK(false);//sysj\orchestrator.sysj line: 54, column: 4
                      S34153=1;
                      active[4]=1;
                      ends[4]=1;
                      tdone[4]=1;
                    }
                    else {
                      S34148=0;
                      if(!capperStatus_in.isREQ()){//sysj\orchestrator.sysj line: 54, column: 4
                        capperStatus_in.setACK(true);//sysj\orchestrator.sysj line: 54, column: 4
                        S34148=1;
                        if(capperStatus_in.isREQ()){//sysj\orchestrator.sysj line: 54, column: 4
                          capperStatus_in.setACK(false);//sysj\orchestrator.sysj line: 54, column: 4
                          ends[4]=2;
                          ;//sysj\orchestrator.sysj line: 54, column: 4
                          System.out.println("Orch: Received capper status");//sysj\orchestrator.sysj line: 55, column: 4
                          res_thread_4 = (String)(capperStatus_in.getVal() == null ? null : ((String)capperStatus_in.getVal()));//sysj\orchestrator.sysj line: 56, column: 4
                          recCapperStatus_1.setPresent();//sysj\orchestrator.sysj line: 57, column: 4
                          currsigs.addElement(recCapperStatus_1);
                          recCapperStatus_1.setValue(res_thread_4);//sysj\orchestrator.sysj line: 57, column: 4
                          S34102=0;
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
            switch(S34109){
              case 0 : 
                if(!capperReq_o.isPartnerPresent() || capperReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 53, column: 4
                  capperReq_o.setREQ(false);//sysj\orchestrator.sysj line: 53, column: 4
                  S34109=1;
                  active[4]=1;
                  ends[4]=1;
                  tdone[4]=1;
                }
                else {
                  switch(S34104){
                    case 0 : 
                      if(capperReq_o.isACK()){//sysj\orchestrator.sysj line: 53, column: 4
                        capperReq_o.setVal(true);//sysj\orchestrator.sysj line: 53, column: 4
                        S34104=1;
                        if(!capperReq_o.isACK()){//sysj\orchestrator.sysj line: 53, column: 4
                          capperReq_o.setREQ(false);//sysj\orchestrator.sysj line: 53, column: 4
                          ends[4]=2;
                          ;//sysj\orchestrator.sysj line: 53, column: 4
                          S34102=2;
                          S34153=0;
                          if(!capperStatus_in.isPartnerPresent() || capperStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 54, column: 4
                            capperStatus_in.setACK(false);//sysj\orchestrator.sysj line: 54, column: 4
                            S34153=1;
                            active[4]=1;
                            ends[4]=1;
                            tdone[4]=1;
                          }
                          else {
                            S34148=0;
                            if(!capperStatus_in.isREQ()){//sysj\orchestrator.sysj line: 54, column: 4
                              capperStatus_in.setACK(true);//sysj\orchestrator.sysj line: 54, column: 4
                              S34148=1;
                              if(capperStatus_in.isREQ()){//sysj\orchestrator.sysj line: 54, column: 4
                                capperStatus_in.setACK(false);//sysj\orchestrator.sysj line: 54, column: 4
                                ends[4]=2;
                                ;//sysj\orchestrator.sysj line: 54, column: 4
                                System.out.println("Orch: Received capper status");//sysj\orchestrator.sysj line: 55, column: 4
                                res_thread_4 = (String)(capperStatus_in.getVal() == null ? null : ((String)capperStatus_in.getVal()));//sysj\orchestrator.sysj line: 56, column: 4
                                recCapperStatus_1.setPresent();//sysj\orchestrator.sysj line: 57, column: 4
                                currsigs.addElement(recCapperStatus_1);
                                recCapperStatus_1.setValue(res_thread_4);//sysj\orchestrator.sysj line: 57, column: 4
                                S34102=0;
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
                        S34102=2;
                        S34153=0;
                        if(!capperStatus_in.isPartnerPresent() || capperStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 54, column: 4
                          capperStatus_in.setACK(false);//sysj\orchestrator.sysj line: 54, column: 4
                          S34153=1;
                          active[4]=1;
                          ends[4]=1;
                          tdone[4]=1;
                        }
                        else {
                          S34148=0;
                          if(!capperStatus_in.isREQ()){//sysj\orchestrator.sysj line: 54, column: 4
                            capperStatus_in.setACK(true);//sysj\orchestrator.sysj line: 54, column: 4
                            S34148=1;
                            if(capperStatus_in.isREQ()){//sysj\orchestrator.sysj line: 54, column: 4
                              capperStatus_in.setACK(false);//sysj\orchestrator.sysj line: 54, column: 4
                              ends[4]=2;
                              ;//sysj\orchestrator.sysj line: 54, column: 4
                              System.out.println("Orch: Received capper status");//sysj\orchestrator.sysj line: 55, column: 4
                              res_thread_4 = (String)(capperStatus_in.getVal() == null ? null : ((String)capperStatus_in.getVal()));//sysj\orchestrator.sysj line: 56, column: 4
                              recCapperStatus_1.setPresent();//sysj\orchestrator.sysj line: 57, column: 4
                              currsigs.addElement(recCapperStatus_1);
                              recCapperStatus_1.setValue(res_thread_4);//sysj\orchestrator.sysj line: 57, column: 4
                              S34102=0;
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
                S34109=1;
                S34109=0;
                if(!capperReq_o.isPartnerPresent() || capperReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 53, column: 4
                  capperReq_o.setREQ(false);//sysj\orchestrator.sysj line: 53, column: 4
                  S34109=1;
                  active[4]=1;
                  ends[4]=1;
                  tdone[4]=1;
                }
                else {
                  S34104=0;
                  if(capperReq_o.isACK()){//sysj\orchestrator.sysj line: 53, column: 4
                    capperReq_o.setVal(true);//sysj\orchestrator.sysj line: 53, column: 4
                    S34104=1;
                    if(!capperReq_o.isACK()){//sysj\orchestrator.sysj line: 53, column: 4
                      capperReq_o.setREQ(false);//sysj\orchestrator.sysj line: 53, column: 4
                      ends[4]=2;
                      ;//sysj\orchestrator.sysj line: 53, column: 4
                      S34102=2;
                      S34153=0;
                      if(!capperStatus_in.isPartnerPresent() || capperStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 54, column: 4
                        capperStatus_in.setACK(false);//sysj\orchestrator.sysj line: 54, column: 4
                        S34153=1;
                        active[4]=1;
                        ends[4]=1;
                        tdone[4]=1;
                      }
                      else {
                        S34148=0;
                        if(!capperStatus_in.isREQ()){//sysj\orchestrator.sysj line: 54, column: 4
                          capperStatus_in.setACK(true);//sysj\orchestrator.sysj line: 54, column: 4
                          S34148=1;
                          if(capperStatus_in.isREQ()){//sysj\orchestrator.sysj line: 54, column: 4
                            capperStatus_in.setACK(false);//sysj\orchestrator.sysj line: 54, column: 4
                            ends[4]=2;
                            ;//sysj\orchestrator.sysj line: 54, column: 4
                            System.out.println("Orch: Received capper status");//sysj\orchestrator.sysj line: 55, column: 4
                            res_thread_4 = (String)(capperStatus_in.getVal() == null ? null : ((String)capperStatus_in.getVal()));//sysj\orchestrator.sysj line: 56, column: 4
                            recCapperStatus_1.setPresent();//sysj\orchestrator.sysj line: 57, column: 4
                            currsigs.addElement(recCapperStatus_1);
                            recCapperStatus_1.setValue(res_thread_4);//sysj\orchestrator.sysj line: 57, column: 4
                            S34102=0;
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
            switch(S34153){
              case 0 : 
                if(!capperStatus_in.isPartnerPresent() || capperStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 54, column: 4
                  capperStatus_in.setACK(false);//sysj\orchestrator.sysj line: 54, column: 4
                  S34153=1;
                  active[4]=1;
                  ends[4]=1;
                  tdone[4]=1;
                }
                else {
                  switch(S34148){
                    case 0 : 
                      if(!capperStatus_in.isREQ()){//sysj\orchestrator.sysj line: 54, column: 4
                        capperStatus_in.setACK(true);//sysj\orchestrator.sysj line: 54, column: 4
                        S34148=1;
                        if(capperStatus_in.isREQ()){//sysj\orchestrator.sysj line: 54, column: 4
                          capperStatus_in.setACK(false);//sysj\orchestrator.sysj line: 54, column: 4
                          ends[4]=2;
                          ;//sysj\orchestrator.sysj line: 54, column: 4
                          System.out.println("Orch: Received capper status");//sysj\orchestrator.sysj line: 55, column: 4
                          res_thread_4 = (String)(capperStatus_in.getVal() == null ? null : ((String)capperStatus_in.getVal()));//sysj\orchestrator.sysj line: 56, column: 4
                          recCapperStatus_1.setPresent();//sysj\orchestrator.sysj line: 57, column: 4
                          currsigs.addElement(recCapperStatus_1);
                          recCapperStatus_1.setValue(res_thread_4);//sysj\orchestrator.sysj line: 57, column: 4
                          S34102=0;
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
                        S34102=0;
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
                S34153=1;
                S34153=0;
                if(!capperStatus_in.isPartnerPresent() || capperStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 54, column: 4
                  capperStatus_in.setACK(false);//sysj\orchestrator.sysj line: 54, column: 4
                  S34153=1;
                  active[4]=1;
                  ends[4]=1;
                  tdone[4]=1;
                }
                else {
                  S34148=0;
                  if(!capperStatus_in.isREQ()){//sysj\orchestrator.sysj line: 54, column: 4
                    capperStatus_in.setACK(true);//sysj\orchestrator.sysj line: 54, column: 4
                    S34148=1;
                    if(capperStatus_in.isREQ()){//sysj\orchestrator.sysj line: 54, column: 4
                      capperStatus_in.setACK(false);//sysj\orchestrator.sysj line: 54, column: 4
                      ends[4]=2;
                      ;//sysj\orchestrator.sysj line: 54, column: 4
                      System.out.println("Orch: Received capper status");//sysj\orchestrator.sysj line: 55, column: 4
                      res_thread_4 = (String)(capperStatus_in.getVal() == null ? null : ((String)capperStatus_in.getVal()));//sysj\orchestrator.sysj line: 56, column: 4
                      recCapperStatus_1.setPresent();//sysj\orchestrator.sysj line: 57, column: 4
                      currsigs.addElement(recCapperStatus_1);
                      recCapperStatus_1.setValue(res_thread_4);//sysj\orchestrator.sysj line: 57, column: 4
                      S34102=0;
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

  public void thread38655(int [] tdone, int [] ends){
        switch(S34100){
      case 0 : 
        active[3]=0;
        ends[3]=0;
        tdone[3]=1;
        break;
      
      case 1 : 
        switch(S33206){
          case 0 : 
            if(sigConveyorReq_1.getprestatus()){//sysj\orchestrator.sysj line: 41, column: 10
              S33206=1;
              S33168=0;
              if(!conveyorReq_o.isPartnerPresent() || conveyorReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 42, column: 4
                conveyorReq_o.setREQ(false);//sysj\orchestrator.sysj line: 42, column: 4
                S33168=1;
                active[3]=1;
                ends[3]=1;
                tdone[3]=1;
              }
              else {
                S33163=0;
                if(conveyorReq_o.isACK()){//sysj\orchestrator.sysj line: 42, column: 4
                  conveyorReq_o.setVal(true);//sysj\orchestrator.sysj line: 42, column: 4
                  S33163=1;
                  if(!conveyorReq_o.isACK()){//sysj\orchestrator.sysj line: 42, column: 4
                    conveyorReq_o.setREQ(false);//sysj\orchestrator.sysj line: 42, column: 4
                    ends[3]=2;
                    ;//sysj\orchestrator.sysj line: 42, column: 4
                    S33206=2;
                    S33213=0;
                    if(!conveyorStatus_in.isPartnerPresent() || conveyorStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 43, column: 4
                      conveyorStatus_in.setACK(false);//sysj\orchestrator.sysj line: 43, column: 4
                      S33213=1;
                      active[3]=1;
                      ends[3]=1;
                      tdone[3]=1;
                    }
                    else {
                      S33208=0;
                      if(!conveyorStatus_in.isREQ()){//sysj\orchestrator.sysj line: 43, column: 4
                        conveyorStatus_in.setACK(true);//sysj\orchestrator.sysj line: 43, column: 4
                        S33208=1;
                        if(conveyorStatus_in.isREQ()){//sysj\orchestrator.sysj line: 43, column: 4
                          conveyorStatus_in.setACK(false);//sysj\orchestrator.sysj line: 43, column: 4
                          ends[3]=2;
                          ;//sysj\orchestrator.sysj line: 43, column: 4
                          res_thread_3 = (String)(conveyorStatus_in.getVal() == null ? null : ((String)conveyorStatus_in.getVal()));//sysj\orchestrator.sysj line: 44, column: 4
                          recConveyorStatus_1.setPresent();//sysj\orchestrator.sysj line: 45, column: 4
                          currsigs.addElement(recConveyorStatus_1);
                          recConveyorStatus_1.setValue(res_thread_3);//sysj\orchestrator.sysj line: 45, column: 4
                          S33206=0;
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
            switch(S33168){
              case 0 : 
                if(!conveyorReq_o.isPartnerPresent() || conveyorReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 42, column: 4
                  conveyorReq_o.setREQ(false);//sysj\orchestrator.sysj line: 42, column: 4
                  S33168=1;
                  active[3]=1;
                  ends[3]=1;
                  tdone[3]=1;
                }
                else {
                  switch(S33163){
                    case 0 : 
                      if(conveyorReq_o.isACK()){//sysj\orchestrator.sysj line: 42, column: 4
                        conveyorReq_o.setVal(true);//sysj\orchestrator.sysj line: 42, column: 4
                        S33163=1;
                        if(!conveyorReq_o.isACK()){//sysj\orchestrator.sysj line: 42, column: 4
                          conveyorReq_o.setREQ(false);//sysj\orchestrator.sysj line: 42, column: 4
                          ends[3]=2;
                          ;//sysj\orchestrator.sysj line: 42, column: 4
                          S33206=2;
                          S33213=0;
                          if(!conveyorStatus_in.isPartnerPresent() || conveyorStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 43, column: 4
                            conveyorStatus_in.setACK(false);//sysj\orchestrator.sysj line: 43, column: 4
                            S33213=1;
                            active[3]=1;
                            ends[3]=1;
                            tdone[3]=1;
                          }
                          else {
                            S33208=0;
                            if(!conveyorStatus_in.isREQ()){//sysj\orchestrator.sysj line: 43, column: 4
                              conveyorStatus_in.setACK(true);//sysj\orchestrator.sysj line: 43, column: 4
                              S33208=1;
                              if(conveyorStatus_in.isREQ()){//sysj\orchestrator.sysj line: 43, column: 4
                                conveyorStatus_in.setACK(false);//sysj\orchestrator.sysj line: 43, column: 4
                                ends[3]=2;
                                ;//sysj\orchestrator.sysj line: 43, column: 4
                                res_thread_3 = (String)(conveyorStatus_in.getVal() == null ? null : ((String)conveyorStatus_in.getVal()));//sysj\orchestrator.sysj line: 44, column: 4
                                recConveyorStatus_1.setPresent();//sysj\orchestrator.sysj line: 45, column: 4
                                currsigs.addElement(recConveyorStatus_1);
                                recConveyorStatus_1.setValue(res_thread_3);//sysj\orchestrator.sysj line: 45, column: 4
                                S33206=0;
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
                        S33206=2;
                        S33213=0;
                        if(!conveyorStatus_in.isPartnerPresent() || conveyorStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 43, column: 4
                          conveyorStatus_in.setACK(false);//sysj\orchestrator.sysj line: 43, column: 4
                          S33213=1;
                          active[3]=1;
                          ends[3]=1;
                          tdone[3]=1;
                        }
                        else {
                          S33208=0;
                          if(!conveyorStatus_in.isREQ()){//sysj\orchestrator.sysj line: 43, column: 4
                            conveyorStatus_in.setACK(true);//sysj\orchestrator.sysj line: 43, column: 4
                            S33208=1;
                            if(conveyorStatus_in.isREQ()){//sysj\orchestrator.sysj line: 43, column: 4
                              conveyorStatus_in.setACK(false);//sysj\orchestrator.sysj line: 43, column: 4
                              ends[3]=2;
                              ;//sysj\orchestrator.sysj line: 43, column: 4
                              res_thread_3 = (String)(conveyorStatus_in.getVal() == null ? null : ((String)conveyorStatus_in.getVal()));//sysj\orchestrator.sysj line: 44, column: 4
                              recConveyorStatus_1.setPresent();//sysj\orchestrator.sysj line: 45, column: 4
                              currsigs.addElement(recConveyorStatus_1);
                              recConveyorStatus_1.setValue(res_thread_3);//sysj\orchestrator.sysj line: 45, column: 4
                              S33206=0;
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
                S33168=1;
                S33168=0;
                if(!conveyorReq_o.isPartnerPresent() || conveyorReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 42, column: 4
                  conveyorReq_o.setREQ(false);//sysj\orchestrator.sysj line: 42, column: 4
                  S33168=1;
                  active[3]=1;
                  ends[3]=1;
                  tdone[3]=1;
                }
                else {
                  S33163=0;
                  if(conveyorReq_o.isACK()){//sysj\orchestrator.sysj line: 42, column: 4
                    conveyorReq_o.setVal(true);//sysj\orchestrator.sysj line: 42, column: 4
                    S33163=1;
                    if(!conveyorReq_o.isACK()){//sysj\orchestrator.sysj line: 42, column: 4
                      conveyorReq_o.setREQ(false);//sysj\orchestrator.sysj line: 42, column: 4
                      ends[3]=2;
                      ;//sysj\orchestrator.sysj line: 42, column: 4
                      S33206=2;
                      S33213=0;
                      if(!conveyorStatus_in.isPartnerPresent() || conveyorStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 43, column: 4
                        conveyorStatus_in.setACK(false);//sysj\orchestrator.sysj line: 43, column: 4
                        S33213=1;
                        active[3]=1;
                        ends[3]=1;
                        tdone[3]=1;
                      }
                      else {
                        S33208=0;
                        if(!conveyorStatus_in.isREQ()){//sysj\orchestrator.sysj line: 43, column: 4
                          conveyorStatus_in.setACK(true);//sysj\orchestrator.sysj line: 43, column: 4
                          S33208=1;
                          if(conveyorStatus_in.isREQ()){//sysj\orchestrator.sysj line: 43, column: 4
                            conveyorStatus_in.setACK(false);//sysj\orchestrator.sysj line: 43, column: 4
                            ends[3]=2;
                            ;//sysj\orchestrator.sysj line: 43, column: 4
                            res_thread_3 = (String)(conveyorStatus_in.getVal() == null ? null : ((String)conveyorStatus_in.getVal()));//sysj\orchestrator.sysj line: 44, column: 4
                            recConveyorStatus_1.setPresent();//sysj\orchestrator.sysj line: 45, column: 4
                            currsigs.addElement(recConveyorStatus_1);
                            recConveyorStatus_1.setValue(res_thread_3);//sysj\orchestrator.sysj line: 45, column: 4
                            S33206=0;
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
            switch(S33213){
              case 0 : 
                if(!conveyorStatus_in.isPartnerPresent() || conveyorStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 43, column: 4
                  conveyorStatus_in.setACK(false);//sysj\orchestrator.sysj line: 43, column: 4
                  S33213=1;
                  active[3]=1;
                  ends[3]=1;
                  tdone[3]=1;
                }
                else {
                  switch(S33208){
                    case 0 : 
                      if(!conveyorStatus_in.isREQ()){//sysj\orchestrator.sysj line: 43, column: 4
                        conveyorStatus_in.setACK(true);//sysj\orchestrator.sysj line: 43, column: 4
                        S33208=1;
                        if(conveyorStatus_in.isREQ()){//sysj\orchestrator.sysj line: 43, column: 4
                          conveyorStatus_in.setACK(false);//sysj\orchestrator.sysj line: 43, column: 4
                          ends[3]=2;
                          ;//sysj\orchestrator.sysj line: 43, column: 4
                          res_thread_3 = (String)(conveyorStatus_in.getVal() == null ? null : ((String)conveyorStatus_in.getVal()));//sysj\orchestrator.sysj line: 44, column: 4
                          recConveyorStatus_1.setPresent();//sysj\orchestrator.sysj line: 45, column: 4
                          currsigs.addElement(recConveyorStatus_1);
                          recConveyorStatus_1.setValue(res_thread_3);//sysj\orchestrator.sysj line: 45, column: 4
                          S33206=0;
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
                        S33206=0;
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
                S33213=1;
                S33213=0;
                if(!conveyorStatus_in.isPartnerPresent() || conveyorStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 43, column: 4
                  conveyorStatus_in.setACK(false);//sysj\orchestrator.sysj line: 43, column: 4
                  S33213=1;
                  active[3]=1;
                  ends[3]=1;
                  tdone[3]=1;
                }
                else {
                  S33208=0;
                  if(!conveyorStatus_in.isREQ()){//sysj\orchestrator.sysj line: 43, column: 4
                    conveyorStatus_in.setACK(true);//sysj\orchestrator.sysj line: 43, column: 4
                    S33208=1;
                    if(conveyorStatus_in.isREQ()){//sysj\orchestrator.sysj line: 43, column: 4
                      conveyorStatus_in.setACK(false);//sysj\orchestrator.sysj line: 43, column: 4
                      ends[3]=2;
                      ;//sysj\orchestrator.sysj line: 43, column: 4
                      res_thread_3 = (String)(conveyorStatus_in.getVal() == null ? null : ((String)conveyorStatus_in.getVal()));//sysj\orchestrator.sysj line: 44, column: 4
                      recConveyorStatus_1.setPresent();//sysj\orchestrator.sysj line: 45, column: 4
                      currsigs.addElement(recConveyorStatus_1);
                      recConveyorStatus_1.setValue(res_thread_3);//sysj\orchestrator.sysj line: 45, column: 4
                      S33206=0;
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

  public void thread38654(int [] tdone, int [] ends){
        switch(S33160){
      case 0 : 
        active[2]=0;
        ends[2]=0;
        tdone[2]=1;
        break;
      
      case 1 : 
        switch(S32964){
          case 0 : 
            switch(S32926){
              case 0 : 
                if(recConveyorStatus_1.getprestatus()){//sysj\orchestrator.sysj line: 25, column: 11
                  System.out.println("Orch: Received conveyor status");//sysj\orchestrator.sysj line: 26, column: 5
                  bottlePlaced_thread_2 = bottlePlaced_thread_2 - 1;//sysj\orchestrator.sysj line: 27, column: 5
                  S32926=1;
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
                  S32926=2;
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
                S32926=2;
                if(bottlePlaced_thread_2 >= 0){//sysj\orchestrator.sysj line: 22, column: 10
                  System.out.println("Orch: Sending conveyor request");//sysj\orchestrator.sysj line: 23, column: 5
                  sigConveyorReq_1.setPresent();//sysj\orchestrator.sysj line: 24, column: 5
                  currsigs.addElement(sigConveyorReq_1);
                  sigConveyorReq_1.setValue(true);//sysj\orchestrator.sysj line: 24, column: 5
                  S32926=0;
                  active[2]=1;
                  ends[2]=1;
                  tdone[2]=1;
                }
                else {
                  ends[2]=2;
                  ;//sysj\orchestrator.sysj line: 22, column: 4
                  System.out.println("Done order");//sysj\orchestrator.sysj line: 33, column: 4
                  S32964=1;
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
            S32964=2;
            bottlePlaced_thread_2 = quantity_thread_2;//sysj\orchestrator.sysj line: 21, column: 4
            S32964=0;
            if(bottlePlaced_thread_2 >= 0){//sysj\orchestrator.sysj line: 22, column: 10
              System.out.println("Orch: Sending conveyor request");//sysj\orchestrator.sysj line: 23, column: 5
              sigConveyorReq_1.setPresent();//sysj\orchestrator.sysj line: 24, column: 5
              currsigs.addElement(sigConveyorReq_1);
              sigConveyorReq_1.setValue(true);//sysj\orchestrator.sysj line: 24, column: 5
              S32926=0;
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            else {
              ends[2]=2;
              ;//sysj\orchestrator.sysj line: 22, column: 4
              System.out.println("Done order");//sysj\orchestrator.sysj line: 33, column: 4
              S32964=1;
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread38652(int [] tdone, int [] ends){
        S38642=1;
    liquidPercent_thread_8 = new ArrayList();//sysj\orchestrator.sysj line: 100, column: 3
    liquidPercent_thread_8.add(10);//sysj\orchestrator.sysj line: 101, column: 3
    liquidPercent_thread_8.add(10);//sysj\orchestrator.sysj line: 102, column: 3
    liquidPercent_thread_8.add(20);//sysj\orchestrator.sysj line: 103, column: 3
    liquidPercent_thread_8.add(60);//sysj\orchestrator.sysj line: 104, column: 3
    S37863=0;
    active[8]=1;
    ends[8]=1;
    tdone[8]=1;
  }

  public void thread38651(int [] tdone, int [] ends){
        S37860=1;
    S36922=0;
    active[7]=1;
    ends[7]=1;
    tdone[7]=1;
  }

  public void thread38650(int [] tdone, int [] ends){
        S36920=1;
    S35982=0;
    active[6]=1;
    ends[6]=1;
    tdone[6]=1;
  }

  public void thread38649(int [] tdone, int [] ends){
        S35980=1;
    S35042=0;
    active[5]=1;
    ends[5]=1;
    tdone[5]=1;
  }

  public void thread38648(int [] tdone, int [] ends){
        S35040=1;
    S34102=0;
    active[4]=1;
    ends[4]=1;
    tdone[4]=1;
  }

  public void thread38647(int [] tdone, int [] ends){
        S34100=1;
    S33206=0;
    active[3]=1;
    ends[3]=1;
    tdone[3]=1;
  }

  public void thread38646(int [] tdone, int [] ends){
        S33160=1;
    quantity_thread_2 = 5;//sysj\orchestrator.sysj line: 15, column: 3
    bottlePlaced_thread_2 = 0;//sysj\orchestrator.sysj line: 16, column: 3
    bottlePlaced_thread_2 = quantity_thread_2;//sysj\orchestrator.sysj line: 21, column: 4
    S32964=0;
    if(bottlePlaced_thread_2 >= 0){//sysj\orchestrator.sysj line: 22, column: 10
      System.out.println("Orch: Sending conveyor request");//sysj\orchestrator.sysj line: 23, column: 5
      sigConveyorReq_1.setPresent();//sysj\orchestrator.sysj line: 24, column: 5
      currsigs.addElement(sigConveyorReq_1);
      sigConveyorReq_1.setValue(true);//sysj\orchestrator.sysj line: 24, column: 5
      S32926=0;
      active[2]=1;
      ends[2]=1;
      tdone[2]=1;
    }
    else {
      ends[2]=2;
      ;//sysj\orchestrator.sysj line: 22, column: 4
      System.out.println("Done order");//sysj\orchestrator.sysj line: 33, column: 4
      S32964=1;
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
      switch(S38644){
        case 0 : 
          S38644=0;
          break RUN;
        
        case 1 : 
          S38644=2;
          S38644=2;
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
          thread38646(tdone,ends);
          thread38647(tdone,ends);
          thread38648(tdone,ends);
          thread38649(tdone,ends);
          thread38650(tdone,ends);
          thread38651(tdone,ends);
          thread38652(tdone,ends);
          int biggest38653 = 0;
          if(ends[2]>=biggest38653){
            biggest38653=ends[2];
          }
          if(ends[3]>=biggest38653){
            biggest38653=ends[3];
          }
          if(ends[4]>=biggest38653){
            biggest38653=ends[4];
          }
          if(ends[5]>=biggest38653){
            biggest38653=ends[5];
          }
          if(ends[6]>=biggest38653){
            biggest38653=ends[6];
          }
          if(ends[7]>=biggest38653){
            biggest38653=ends[7];
          }
          if(ends[8]>=biggest38653){
            biggest38653=ends[8];
          }
          if(biggest38653 == 1){
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
          thread38654(tdone,ends);
          thread38655(tdone,ends);
          thread38656(tdone,ends);
          thread38657(tdone,ends);
          thread38658(tdone,ends);
          thread38659(tdone,ends);
          thread38660(tdone,ends);
          int biggest38673 = 0;
          if(ends[2]>=biggest38673){
            biggest38673=ends[2];
          }
          if(ends[3]>=biggest38673){
            biggest38673=ends[3];
          }
          if(ends[4]>=biggest38673){
            biggest38673=ends[4];
          }
          if(ends[5]>=biggest38673){
            biggest38673=ends[5];
          }
          if(ends[6]>=biggest38673){
            biggest38673=ends[6];
          }
          if(ends[7]>=biggest38673){
            biggest38673=ends[7];
          }
          if(ends[8]>=biggest38673){
            biggest38673=ends[8];
          }
          if(biggest38673 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
          //FINXME code
          if(biggest38673 == 0){
            S38644=0;
            active[1]=0;
            ends[1]=0;
            S38644=0;
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
