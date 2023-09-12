import java.util.*;
import com.systemj.ClockDomain;
import com.systemj.Signal;
import com.systemj.input_Channel;
import com.systemj.output_Channel;

public class ACS_J extends ClockDomain{
  public ACS_J(String name){super(name);}
  Vector currsigs = new Vector();
  private boolean df = false;
  private char [] active;
  private char [] paused;
  private char [] suspended;
  public Signal zone1Num = new Signal("zone1Num", Signal.OUTPUT);
  public Signal zone2Num = new Signal("zone2Num", Signal.OUTPUT);
  public Signal zone3Num = new Signal("zone3Num", Signal.OUTPUT);
  public Signal zone7Num = new Signal("zone7Num", Signal.OUTPUT);
  public Signal zone1Unauth = new Signal("zone1Unauth", Signal.OUTPUT);
  public Signal zone2Unauth = new Signal("zone2Unauth", Signal.OUTPUT);
  public Signal zone3Unauth = new Signal("zone3Unauth", Signal.OUTPUT);
  public Signal zone7Unauth = new Signal("zone7Unauth", Signal.OUTPUT);
  public Signal emergencyOffUI = new Signal("emergencyOffUI", Signal.OUTPUT);
  public Signal door1GrantUI = new Signal("door1GrantUI", Signal.OUTPUT);
  public Signal door1DenyUI = new Signal("door1DenyUI", Signal.OUTPUT);
  public Signal door2GrantUI = new Signal("door2GrantUI", Signal.OUTPUT);
  public Signal door2DenyUI = new Signal("door2DenyUI", Signal.OUTPUT);
  public Signal door3GrantUI = new Signal("door3GrantUI", Signal.OUTPUT);
  public Signal door3DenyUI = new Signal("door3DenyUI", Signal.OUTPUT);
  public input_Channel humanPresence_in = new input_Channel();
  public input_Channel idLocation_in = new input_Channel();
  public input_Channel door1CardReader_in = new input_Channel();
  public input_Channel door2CardReader_in = new input_Channel();
  public input_Channel door3CardReader_in = new input_Channel();
  public input_Channel idAuthResponse_in = new input_Channel();
  public output_Channel reqIDLoc_o = new output_Channel();
  public output_Channel door1Grant_o = new output_Channel();
  public output_Channel door1Deny_o = new output_Channel();
  public output_Channel door2Grant_o = new output_Channel();
  public output_Channel door2Deny_o = new output_Channel();
  public output_Channel door3Grant_o = new output_Channel();
  public output_Channel door3Deny_o = new output_Channel();
  public output_Channel emergencyOff_o = new output_Channel();
  public output_Channel reqAuthCheck_o = new output_Channel();
  private int zone1NumEmployee_thread_23;//sysj/Exercise6.sysj line: 292, column: 4
  private int zone2NumEmployee_thread_23;//sysj/Exercise6.sysj line: 293, column: 4
  private int zone3NumEmployee_thread_23;//sysj/Exercise6.sysj line: 294, column: 4
  private int zone7NumEmployee_thread_23;//sysj/Exercise6.sysj line: 295, column: 4
  private String id_thread_19;//sysj/Exercise6.sysj line: 225, column: 5
  private boolean result_thread_19;//sysj/Exercise6.sysj line: 226, column: 5
  private String id_thread_20;//sysj/Exercise6.sysj line: 243, column: 5
  private boolean result_thread_20;//sysj/Exercise6.sysj line: 244, column: 5
  private String id_thread_21;//sysj/Exercise6.sysj line: 261, column: 5
  private boolean result_thread_21;//sysj/Exercise6.sysj line: 262, column: 5
  private boolean result_thread_22;//sysj/Exercise6.sysj line: 279, column: 5
  private boolean response_thread_23;//sysj/Exercise6.sysj line: 333, column: 5
  private long __start_thread_23;//sysj/Exercise6.sysj line: 297, column: 4
  private String zoneLocation_thread_23;//sysj/Exercise6.sysj line: 309, column: 5
  private int S10219 = 1;
  private int S6312 = 1;
  private int S5700 = 1;
  private int S5684 = 1;
  private int S5679 = 1;
  private int S5747 = 1;
  private int S5707 = 1;
  private int S5702 = 1;
  private int S5730 = 1;
  private int S5725 = 1;
  private int S6947 = 1;
  private int S6335 = 1;
  private int S6319 = 1;
  private int S6314 = 1;
  private int S6382 = 1;
  private int S6342 = 1;
  private int S6337 = 1;
  private int S6365 = 1;
  private int S6360 = 1;
  private int S7582 = 1;
  private int S6970 = 1;
  private int S6954 = 1;
  private int S6949 = 1;
  private int S7017 = 1;
  private int S6977 = 1;
  private int S6972 = 1;
  private int S7000 = 1;
  private int S6995 = 1;
  private int S7689 = 1;
  private int S7605 = 1;
  private int S7589 = 1;
  private int S7584 = 1;
  private int S10217 = 1;
  private int S7705 = 1;
  private int S7712 = 1;
  private int S7707 = 1;
  private int S7800 = 1;
  private int S7795 = 1;
  private int S7932 = 1;
  private int S7927 = 1;
  private int S7976 = 1;
  private int S7971 = 1;
  
  private int[] ends = new int[24];
  private int[] tdone = new int[24];
  
  public void thread10263(int [] tdone, int [] ends){
        switch(S10217){
      case 0 : 
        active[23]=0;
        ends[23]=0;
        tdone[23]=1;
        break;
      
      case 1 : 
        switch(S7705){
          case 0 : 
            if(com.systemj.Timer.getMs() - __start_thread_23 >= (5) * 1000){//sysj/Exercise6.sysj line: 297, column: 4
              ends[23]=2;
              ;//sysj/Exercise6.sysj line: 297, column: 4
              zone1NumEmployee_thread_23 = 0;//sysj/Exercise6.sysj line: 302, column: 5
              zone2NumEmployee_thread_23 = 0;//sysj/Exercise6.sysj line: 303, column: 5
              zone3NumEmployee_thread_23 = 0;//sysj/Exercise6.sysj line: 304, column: 5
              zone7NumEmployee_thread_23 = 0;//sysj/Exercise6.sysj line: 305, column: 5
              S7705=1;
              S7712=0;
              if(!reqIDLoc_o.isPartnerPresent() || reqIDLoc_o.isPartnerPreempted()){//sysj/Exercise6.sysj line: 307, column: 5
                reqIDLoc_o.setREQ(false);//sysj/Exercise6.sysj line: 307, column: 5
                S7712=1;
                active[23]=1;
                ends[23]=1;
                tdone[23]=1;
              }
              else {
                S7707=0;
                if(reqIDLoc_o.isACK()){//sysj/Exercise6.sysj line: 307, column: 5
                  reqIDLoc_o.setVal("11111");//sysj/Exercise6.sysj line: 307, column: 5
                  S7707=1;
                  if(!reqIDLoc_o.isACK()){//sysj/Exercise6.sysj line: 307, column: 5
                    reqIDLoc_o.setREQ(false);//sysj/Exercise6.sysj line: 307, column: 5
                    ends[23]=2;
                    ;//sysj/Exercise6.sysj line: 307, column: 5
                    S7705=2;
                    S7800=0;
                    if(!idLocation_in.isPartnerPresent() || idLocation_in.isPartnerPreempted()){//sysj/Exercise6.sysj line: 308, column: 5
                      idLocation_in.setACK(false);//sysj/Exercise6.sysj line: 308, column: 5
                      S7800=1;
                      active[23]=1;
                      ends[23]=1;
                      tdone[23]=1;
                    }
                    else {
                      S7795=0;
                      if(!idLocation_in.isREQ()){//sysj/Exercise6.sysj line: 308, column: 5
                        idLocation_in.setACK(true);//sysj/Exercise6.sysj line: 308, column: 5
                        S7795=1;
                        if(idLocation_in.isREQ()){//sysj/Exercise6.sysj line: 308, column: 5
                          idLocation_in.setACK(false);//sysj/Exercise6.sysj line: 308, column: 5
                          ends[23]=2;
                          ;//sysj/Exercise6.sysj line: 308, column: 5
                          zoneLocation_thread_23 = (String)(idLocation_in.getVal() == null ? null : ((String)idLocation_in.getVal()));//sysj/Exercise6.sysj line: 309, column: 5
                          S7705=3;
                          active[23]=1;
                          ends[23]=1;
                          tdone[23]=1;
                        }
                        else {
                          active[23]=1;
                          ends[23]=1;
                          tdone[23]=1;
                        }
                      }
                      else {
                        active[23]=1;
                        ends[23]=1;
                        tdone[23]=1;
                      }
                    }
                  }
                  else {
                    active[23]=1;
                    ends[23]=1;
                    tdone[23]=1;
                  }
                }
                else {
                  active[23]=1;
                  ends[23]=1;
                  tdone[23]=1;
                }
              }
            }
            else {
              active[23]=1;
              ends[23]=1;
              tdone[23]=1;
            }
            break;
          
          case 1 : 
            switch(S7712){
              case 0 : 
                if(!reqIDLoc_o.isPartnerPresent() || reqIDLoc_o.isPartnerPreempted()){//sysj/Exercise6.sysj line: 307, column: 5
                  reqIDLoc_o.setREQ(false);//sysj/Exercise6.sysj line: 307, column: 5
                  S7712=1;
                  active[23]=1;
                  ends[23]=1;
                  tdone[23]=1;
                }
                else {
                  switch(S7707){
                    case 0 : 
                      if(reqIDLoc_o.isACK()){//sysj/Exercise6.sysj line: 307, column: 5
                        reqIDLoc_o.setVal("11111");//sysj/Exercise6.sysj line: 307, column: 5
                        S7707=1;
                        if(!reqIDLoc_o.isACK()){//sysj/Exercise6.sysj line: 307, column: 5
                          reqIDLoc_o.setREQ(false);//sysj/Exercise6.sysj line: 307, column: 5
                          ends[23]=2;
                          ;//sysj/Exercise6.sysj line: 307, column: 5
                          S7705=2;
                          S7800=0;
                          if(!idLocation_in.isPartnerPresent() || idLocation_in.isPartnerPreempted()){//sysj/Exercise6.sysj line: 308, column: 5
                            idLocation_in.setACK(false);//sysj/Exercise6.sysj line: 308, column: 5
                            S7800=1;
                            active[23]=1;
                            ends[23]=1;
                            tdone[23]=1;
                          }
                          else {
                            S7795=0;
                            if(!idLocation_in.isREQ()){//sysj/Exercise6.sysj line: 308, column: 5
                              idLocation_in.setACK(true);//sysj/Exercise6.sysj line: 308, column: 5
                              S7795=1;
                              if(idLocation_in.isREQ()){//sysj/Exercise6.sysj line: 308, column: 5
                                idLocation_in.setACK(false);//sysj/Exercise6.sysj line: 308, column: 5
                                ends[23]=2;
                                ;//sysj/Exercise6.sysj line: 308, column: 5
                                zoneLocation_thread_23 = (String)(idLocation_in.getVal() == null ? null : ((String)idLocation_in.getVal()));//sysj/Exercise6.sysj line: 309, column: 5
                                S7705=3;
                                active[23]=1;
                                ends[23]=1;
                                tdone[23]=1;
                              }
                              else {
                                active[23]=1;
                                ends[23]=1;
                                tdone[23]=1;
                              }
                            }
                            else {
                              active[23]=1;
                              ends[23]=1;
                              tdone[23]=1;
                            }
                          }
                        }
                        else {
                          active[23]=1;
                          ends[23]=1;
                          tdone[23]=1;
                        }
                      }
                      else {
                        active[23]=1;
                        ends[23]=1;
                        tdone[23]=1;
                      }
                      break;
                    
                    case 1 : 
                      if(!reqIDLoc_o.isACK()){//sysj/Exercise6.sysj line: 307, column: 5
                        reqIDLoc_o.setREQ(false);//sysj/Exercise6.sysj line: 307, column: 5
                        ends[23]=2;
                        ;//sysj/Exercise6.sysj line: 307, column: 5
                        S7705=2;
                        S7800=0;
                        if(!idLocation_in.isPartnerPresent() || idLocation_in.isPartnerPreempted()){//sysj/Exercise6.sysj line: 308, column: 5
                          idLocation_in.setACK(false);//sysj/Exercise6.sysj line: 308, column: 5
                          S7800=1;
                          active[23]=1;
                          ends[23]=1;
                          tdone[23]=1;
                        }
                        else {
                          S7795=0;
                          if(!idLocation_in.isREQ()){//sysj/Exercise6.sysj line: 308, column: 5
                            idLocation_in.setACK(true);//sysj/Exercise6.sysj line: 308, column: 5
                            S7795=1;
                            if(idLocation_in.isREQ()){//sysj/Exercise6.sysj line: 308, column: 5
                              idLocation_in.setACK(false);//sysj/Exercise6.sysj line: 308, column: 5
                              ends[23]=2;
                              ;//sysj/Exercise6.sysj line: 308, column: 5
                              zoneLocation_thread_23 = (String)(idLocation_in.getVal() == null ? null : ((String)idLocation_in.getVal()));//sysj/Exercise6.sysj line: 309, column: 5
                              S7705=3;
                              active[23]=1;
                              ends[23]=1;
                              tdone[23]=1;
                            }
                            else {
                              active[23]=1;
                              ends[23]=1;
                              tdone[23]=1;
                            }
                          }
                          else {
                            active[23]=1;
                            ends[23]=1;
                            tdone[23]=1;
                          }
                        }
                      }
                      else {
                        active[23]=1;
                        ends[23]=1;
                        tdone[23]=1;
                      }
                      break;
                    
                  }
                }
                break;
              
              case 1 : 
                S7712=1;
                S7712=0;
                if(!reqIDLoc_o.isPartnerPresent() || reqIDLoc_o.isPartnerPreempted()){//sysj/Exercise6.sysj line: 307, column: 5
                  reqIDLoc_o.setREQ(false);//sysj/Exercise6.sysj line: 307, column: 5
                  S7712=1;
                  active[23]=1;
                  ends[23]=1;
                  tdone[23]=1;
                }
                else {
                  S7707=0;
                  if(reqIDLoc_o.isACK()){//sysj/Exercise6.sysj line: 307, column: 5
                    reqIDLoc_o.setVal("11111");//sysj/Exercise6.sysj line: 307, column: 5
                    S7707=1;
                    if(!reqIDLoc_o.isACK()){//sysj/Exercise6.sysj line: 307, column: 5
                      reqIDLoc_o.setREQ(false);//sysj/Exercise6.sysj line: 307, column: 5
                      ends[23]=2;
                      ;//sysj/Exercise6.sysj line: 307, column: 5
                      S7705=2;
                      S7800=0;
                      if(!idLocation_in.isPartnerPresent() || idLocation_in.isPartnerPreempted()){//sysj/Exercise6.sysj line: 308, column: 5
                        idLocation_in.setACK(false);//sysj/Exercise6.sysj line: 308, column: 5
                        S7800=1;
                        active[23]=1;
                        ends[23]=1;
                        tdone[23]=1;
                      }
                      else {
                        S7795=0;
                        if(!idLocation_in.isREQ()){//sysj/Exercise6.sysj line: 308, column: 5
                          idLocation_in.setACK(true);//sysj/Exercise6.sysj line: 308, column: 5
                          S7795=1;
                          if(idLocation_in.isREQ()){//sysj/Exercise6.sysj line: 308, column: 5
                            idLocation_in.setACK(false);//sysj/Exercise6.sysj line: 308, column: 5
                            ends[23]=2;
                            ;//sysj/Exercise6.sysj line: 308, column: 5
                            zoneLocation_thread_23 = (String)(idLocation_in.getVal() == null ? null : ((String)idLocation_in.getVal()));//sysj/Exercise6.sysj line: 309, column: 5
                            S7705=3;
                            active[23]=1;
                            ends[23]=1;
                            tdone[23]=1;
                          }
                          else {
                            active[23]=1;
                            ends[23]=1;
                            tdone[23]=1;
                          }
                        }
                        else {
                          active[23]=1;
                          ends[23]=1;
                          tdone[23]=1;
                        }
                      }
                    }
                    else {
                      active[23]=1;
                      ends[23]=1;
                      tdone[23]=1;
                    }
                  }
                  else {
                    active[23]=1;
                    ends[23]=1;
                    tdone[23]=1;
                  }
                }
                break;
              
            }
            break;
          
          case 2 : 
            switch(S7800){
              case 0 : 
                if(!idLocation_in.isPartnerPresent() || idLocation_in.isPartnerPreempted()){//sysj/Exercise6.sysj line: 308, column: 5
                  idLocation_in.setACK(false);//sysj/Exercise6.sysj line: 308, column: 5
                  S7800=1;
                  active[23]=1;
                  ends[23]=1;
                  tdone[23]=1;
                }
                else {
                  switch(S7795){
                    case 0 : 
                      if(!idLocation_in.isREQ()){//sysj/Exercise6.sysj line: 308, column: 5
                        idLocation_in.setACK(true);//sysj/Exercise6.sysj line: 308, column: 5
                        S7795=1;
                        if(idLocation_in.isREQ()){//sysj/Exercise6.sysj line: 308, column: 5
                          idLocation_in.setACK(false);//sysj/Exercise6.sysj line: 308, column: 5
                          ends[23]=2;
                          ;//sysj/Exercise6.sysj line: 308, column: 5
                          zoneLocation_thread_23 = (String)(idLocation_in.getVal() == null ? null : ((String)idLocation_in.getVal()));//sysj/Exercise6.sysj line: 309, column: 5
                          S7705=3;
                          active[23]=1;
                          ends[23]=1;
                          tdone[23]=1;
                        }
                        else {
                          active[23]=1;
                          ends[23]=1;
                          tdone[23]=1;
                        }
                      }
                      else {
                        active[23]=1;
                        ends[23]=1;
                        tdone[23]=1;
                      }
                      break;
                    
                    case 1 : 
                      if(idLocation_in.isREQ()){//sysj/Exercise6.sysj line: 308, column: 5
                        idLocation_in.setACK(false);//sysj/Exercise6.sysj line: 308, column: 5
                        ends[23]=2;
                        ;//sysj/Exercise6.sysj line: 308, column: 5
                        zoneLocation_thread_23 = (String)(idLocation_in.getVal() == null ? null : ((String)idLocation_in.getVal()));//sysj/Exercise6.sysj line: 309, column: 5
                        S7705=3;
                        active[23]=1;
                        ends[23]=1;
                        tdone[23]=1;
                      }
                      else {
                        active[23]=1;
                        ends[23]=1;
                        tdone[23]=1;
                      }
                      break;
                    
                  }
                }
                break;
              
              case 1 : 
                S7800=1;
                S7800=0;
                if(!idLocation_in.isPartnerPresent() || idLocation_in.isPartnerPreempted()){//sysj/Exercise6.sysj line: 308, column: 5
                  idLocation_in.setACK(false);//sysj/Exercise6.sysj line: 308, column: 5
                  S7800=1;
                  active[23]=1;
                  ends[23]=1;
                  tdone[23]=1;
                }
                else {
                  S7795=0;
                  if(!idLocation_in.isREQ()){//sysj/Exercise6.sysj line: 308, column: 5
                    idLocation_in.setACK(true);//sysj/Exercise6.sysj line: 308, column: 5
                    S7795=1;
                    if(idLocation_in.isREQ()){//sysj/Exercise6.sysj line: 308, column: 5
                      idLocation_in.setACK(false);//sysj/Exercise6.sysj line: 308, column: 5
                      ends[23]=2;
                      ;//sysj/Exercise6.sysj line: 308, column: 5
                      zoneLocation_thread_23 = (String)(idLocation_in.getVal() == null ? null : ((String)idLocation_in.getVal()));//sysj/Exercise6.sysj line: 309, column: 5
                      S7705=3;
                      active[23]=1;
                      ends[23]=1;
                      tdone[23]=1;
                    }
                    else {
                      active[23]=1;
                      ends[23]=1;
                      tdone[23]=1;
                    }
                  }
                  else {
                    active[23]=1;
                    ends[23]=1;
                    tdone[23]=1;
                  }
                }
                break;
              
            }
            break;
          
          case 3 : 
            S7705=3;
            switch (zoneLocation_thread_23) {//sysj/Exercise6.sysj line: 314, column: 5
              case "1"://sysj/Exercise6.sysj line: 315, column: 5
                zone1NumEmployee_thread_23 = zone1NumEmployee_thread_23 + 1;//sysj/Exercise6.sysj line: 316, column: 6
                break ;//sysj/Exercise6.sysj line: 317, column: 6
              case "2"://sysj/Exercise6.sysj line: 318, column: 5
                zone2NumEmployee_thread_23 = zone2NumEmployee_thread_23 + 1;//sysj/Exercise6.sysj line: 319, column: 6
                break ;//sysj/Exercise6.sysj line: 320, column: 6
              case "3"://sysj/Exercise6.sysj line: 321, column: 5
                zone3NumEmployee_thread_23 = zone3NumEmployee_thread_23 + 1;//sysj/Exercise6.sysj line: 322, column: 6
                break ;//sysj/Exercise6.sysj line: 323, column: 6
              case "7"://sysj/Exercise6.sysj line: 324, column: 5
                zone7NumEmployee_thread_23 = zone7NumEmployee_thread_23 + 1;//sysj/Exercise6.sysj line: 325, column: 6
                break ;//sysj/Exercise6.sysj line: 326, column: 6
            }
            S7705=4;
            active[23]=1;
            ends[23]=1;
            tdone[23]=1;
            break;
          
          case 4 : 
            S7705=4;
            S7705=5;
            S7932=0;
            if(!reqAuthCheck_o.isPartnerPresent() || reqAuthCheck_o.isPartnerPreempted()){//sysj/Exercise6.sysj line: 330, column: 5
              reqAuthCheck_o.setREQ(false);//sysj/Exercise6.sysj line: 330, column: 5
              S7932=1;
              active[23]=1;
              ends[23]=1;
              tdone[23]=1;
            }
            else {
              S7927=0;
              if(reqAuthCheck_o.isACK()){//sysj/Exercise6.sysj line: 330, column: 5
                reqAuthCheck_o.setVal("11111");//sysj/Exercise6.sysj line: 330, column: 5
                S7927=1;
                if(!reqAuthCheck_o.isACK()){//sysj/Exercise6.sysj line: 330, column: 5
                  reqAuthCheck_o.setREQ(false);//sysj/Exercise6.sysj line: 330, column: 5
                  ends[23]=2;
                  ;//sysj/Exercise6.sysj line: 330, column: 5
                  S7705=6;
                  S7976=0;
                  if(!idAuthResponse_in.isPartnerPresent() || idAuthResponse_in.isPartnerPreempted()){//sysj/Exercise6.sysj line: 331, column: 5
                    idAuthResponse_in.setACK(false);//sysj/Exercise6.sysj line: 331, column: 5
                    S7976=1;
                    active[23]=1;
                    ends[23]=1;
                    tdone[23]=1;
                  }
                  else {
                    S7971=0;
                    if(!idAuthResponse_in.isREQ()){//sysj/Exercise6.sysj line: 331, column: 5
                      idAuthResponse_in.setACK(true);//sysj/Exercise6.sysj line: 331, column: 5
                      S7971=1;
                      if(idAuthResponse_in.isREQ()){//sysj/Exercise6.sysj line: 331, column: 5
                        idAuthResponse_in.setACK(false);//sysj/Exercise6.sysj line: 331, column: 5
                        ends[23]=2;
                        ;//sysj/Exercise6.sysj line: 331, column: 5
                        response_thread_23 = (idAuthResponse_in.getVal() == null ? false : ((Boolean)idAuthResponse_in.getVal()).booleanValue());//sysj/Exercise6.sysj line: 333, column: 5
                        if(response_thread_23 == false){//sysj/Exercise6.sysj line: 336, column: 9
                          if(zoneLocation_thread_23 == "1"){//sysj/Exercise6.sysj line: 339, column: 7
                            System.out.println("Unauthorized employee found in Zone 1.");//sysj/Exercise6.sysj line: 340, column: 8
                            zone1Unauth.setPresent();//sysj/Exercise6.sysj line: 341, column: 8
                            currsigs.addElement(zone1Unauth);
                            System.out.println("Detected employees: " + zone1NumEmployee_thread_23 + " " + zone2NumEmployee_thread_23 + " " + zone3NumEmployee_thread_23 + " " + zone7NumEmployee_thread_23);//sysj/Exercise6.sysj line: 358, column: 5
                            zone1Num.setPresent();//sysj/Exercise6.sysj line: 362, column: 5
                            currsigs.addElement(zone1Num);
                            zone1Num.setValue(zone1NumEmployee_thread_23);//sysj/Exercise6.sysj line: 362, column: 5
                            zone2Num.setPresent();//sysj/Exercise6.sysj line: 363, column: 5
                            currsigs.addElement(zone2Num);
                            zone2Num.setValue(zone2NumEmployee_thread_23);//sysj/Exercise6.sysj line: 363, column: 5
                            zone3Num.setPresent();//sysj/Exercise6.sysj line: 364, column: 5
                            currsigs.addElement(zone3Num);
                            zone3Num.setValue(zone3NumEmployee_thread_23);//sysj/Exercise6.sysj line: 364, column: 5
                            zone7Num.setPresent();//sysj/Exercise6.sysj line: 365, column: 5
                            currsigs.addElement(zone7Num);
                            zone7Num.setValue(zone7NumEmployee_thread_23);//sysj/Exercise6.sysj line: 365, column: 5
                            S7705=7;
                            active[23]=1;
                            ends[23]=1;
                            tdone[23]=1;
                          }
                          else {
                            if(zoneLocation_thread_23 == "2"){//sysj/Exercise6.sysj line: 343, column: 7
                              System.out.println("Unauthorized employee found in Zone 2.");//sysj/Exercise6.sysj line: 344, column: 8
                              zone2Unauth.setPresent();//sysj/Exercise6.sysj line: 345, column: 8
                              currsigs.addElement(zone2Unauth);
                              System.out.println("Detected employees: " + zone1NumEmployee_thread_23 + " " + zone2NumEmployee_thread_23 + " " + zone3NumEmployee_thread_23 + " " + zone7NumEmployee_thread_23);//sysj/Exercise6.sysj line: 358, column: 5
                              zone1Num.setPresent();//sysj/Exercise6.sysj line: 362, column: 5
                              currsigs.addElement(zone1Num);
                              zone1Num.setValue(zone1NumEmployee_thread_23);//sysj/Exercise6.sysj line: 362, column: 5
                              zone2Num.setPresent();//sysj/Exercise6.sysj line: 363, column: 5
                              currsigs.addElement(zone2Num);
                              zone2Num.setValue(zone2NumEmployee_thread_23);//sysj/Exercise6.sysj line: 363, column: 5
                              zone3Num.setPresent();//sysj/Exercise6.sysj line: 364, column: 5
                              currsigs.addElement(zone3Num);
                              zone3Num.setValue(zone3NumEmployee_thread_23);//sysj/Exercise6.sysj line: 364, column: 5
                              zone7Num.setPresent();//sysj/Exercise6.sysj line: 365, column: 5
                              currsigs.addElement(zone7Num);
                              zone7Num.setValue(zone7NumEmployee_thread_23);//sysj/Exercise6.sysj line: 365, column: 5
                              S7705=7;
                              active[23]=1;
                              ends[23]=1;
                              tdone[23]=1;
                            }
                            else {
                              if(zoneLocation_thread_23 == "3"){//sysj/Exercise6.sysj line: 347, column: 7
                                System.out.println("Unauthorized employee found in Zone 3.");//sysj/Exercise6.sysj line: 348, column: 8
                                zone3Unauth.setPresent();//sysj/Exercise6.sysj line: 349, column: 8
                                currsigs.addElement(zone3Unauth);
                                System.out.println("Detected employees: " + zone1NumEmployee_thread_23 + " " + zone2NumEmployee_thread_23 + " " + zone3NumEmployee_thread_23 + " " + zone7NumEmployee_thread_23);//sysj/Exercise6.sysj line: 358, column: 5
                                zone1Num.setPresent();//sysj/Exercise6.sysj line: 362, column: 5
                                currsigs.addElement(zone1Num);
                                zone1Num.setValue(zone1NumEmployee_thread_23);//sysj/Exercise6.sysj line: 362, column: 5
                                zone2Num.setPresent();//sysj/Exercise6.sysj line: 363, column: 5
                                currsigs.addElement(zone2Num);
                                zone2Num.setValue(zone2NumEmployee_thread_23);//sysj/Exercise6.sysj line: 363, column: 5
                                zone3Num.setPresent();//sysj/Exercise6.sysj line: 364, column: 5
                                currsigs.addElement(zone3Num);
                                zone3Num.setValue(zone3NumEmployee_thread_23);//sysj/Exercise6.sysj line: 364, column: 5
                                zone7Num.setPresent();//sysj/Exercise6.sysj line: 365, column: 5
                                currsigs.addElement(zone7Num);
                                zone7Num.setValue(zone7NumEmployee_thread_23);//sysj/Exercise6.sysj line: 365, column: 5
                                S7705=7;
                                active[23]=1;
                                ends[23]=1;
                                tdone[23]=1;
                              }
                              else {
                                if(zoneLocation_thread_23 == "7"){//sysj/Exercise6.sysj line: 351, column: 7
                                  System.out.println("Unauthorized employee found in Zone 7.");//sysj/Exercise6.sysj line: 352, column: 8
                                  zone7Unauth.setPresent();//sysj/Exercise6.sysj line: 353, column: 8
                                  currsigs.addElement(zone7Unauth);
                                  System.out.println("Detected employees: " + zone1NumEmployee_thread_23 + " " + zone2NumEmployee_thread_23 + " " + zone3NumEmployee_thread_23 + " " + zone7NumEmployee_thread_23);//sysj/Exercise6.sysj line: 358, column: 5
                                  zone1Num.setPresent();//sysj/Exercise6.sysj line: 362, column: 5
                                  currsigs.addElement(zone1Num);
                                  zone1Num.setValue(zone1NumEmployee_thread_23);//sysj/Exercise6.sysj line: 362, column: 5
                                  zone2Num.setPresent();//sysj/Exercise6.sysj line: 363, column: 5
                                  currsigs.addElement(zone2Num);
                                  zone2Num.setValue(zone2NumEmployee_thread_23);//sysj/Exercise6.sysj line: 363, column: 5
                                  zone3Num.setPresent();//sysj/Exercise6.sysj line: 364, column: 5
                                  currsigs.addElement(zone3Num);
                                  zone3Num.setValue(zone3NumEmployee_thread_23);//sysj/Exercise6.sysj line: 364, column: 5
                                  zone7Num.setPresent();//sysj/Exercise6.sysj line: 365, column: 5
                                  currsigs.addElement(zone7Num);
                                  zone7Num.setValue(zone7NumEmployee_thread_23);//sysj/Exercise6.sysj line: 365, column: 5
                                  S7705=7;
                                  active[23]=1;
                                  ends[23]=1;
                                  tdone[23]=1;
                                }
                                else {
                                  System.out.println("Detected employees: " + zone1NumEmployee_thread_23 + " " + zone2NumEmployee_thread_23 + " " + zone3NumEmployee_thread_23 + " " + zone7NumEmployee_thread_23);//sysj/Exercise6.sysj line: 358, column: 5
                                  zone1Num.setPresent();//sysj/Exercise6.sysj line: 362, column: 5
                                  currsigs.addElement(zone1Num);
                                  zone1Num.setValue(zone1NumEmployee_thread_23);//sysj/Exercise6.sysj line: 362, column: 5
                                  zone2Num.setPresent();//sysj/Exercise6.sysj line: 363, column: 5
                                  currsigs.addElement(zone2Num);
                                  zone2Num.setValue(zone2NumEmployee_thread_23);//sysj/Exercise6.sysj line: 363, column: 5
                                  zone3Num.setPresent();//sysj/Exercise6.sysj line: 364, column: 5
                                  currsigs.addElement(zone3Num);
                                  zone3Num.setValue(zone3NumEmployee_thread_23);//sysj/Exercise6.sysj line: 364, column: 5
                                  zone7Num.setPresent();//sysj/Exercise6.sysj line: 365, column: 5
                                  currsigs.addElement(zone7Num);
                                  zone7Num.setValue(zone7NumEmployee_thread_23);//sysj/Exercise6.sysj line: 365, column: 5
                                  S7705=7;
                                  active[23]=1;
                                  ends[23]=1;
                                  tdone[23]=1;
                                }
                              }
                            }
                          }
                        }
                        else {
                          System.out.println("Detected employees: " + zone1NumEmployee_thread_23 + " " + zone2NumEmployee_thread_23 + " " + zone3NumEmployee_thread_23 + " " + zone7NumEmployee_thread_23);//sysj/Exercise6.sysj line: 358, column: 5
                          zone1Num.setPresent();//sysj/Exercise6.sysj line: 362, column: 5
                          currsigs.addElement(zone1Num);
                          zone1Num.setValue(zone1NumEmployee_thread_23);//sysj/Exercise6.sysj line: 362, column: 5
                          zone2Num.setPresent();//sysj/Exercise6.sysj line: 363, column: 5
                          currsigs.addElement(zone2Num);
                          zone2Num.setValue(zone2NumEmployee_thread_23);//sysj/Exercise6.sysj line: 363, column: 5
                          zone3Num.setPresent();//sysj/Exercise6.sysj line: 364, column: 5
                          currsigs.addElement(zone3Num);
                          zone3Num.setValue(zone3NumEmployee_thread_23);//sysj/Exercise6.sysj line: 364, column: 5
                          zone7Num.setPresent();//sysj/Exercise6.sysj line: 365, column: 5
                          currsigs.addElement(zone7Num);
                          zone7Num.setValue(zone7NumEmployee_thread_23);//sysj/Exercise6.sysj line: 365, column: 5
                          S7705=7;
                          active[23]=1;
                          ends[23]=1;
                          tdone[23]=1;
                        }
                      }
                      else {
                        active[23]=1;
                        ends[23]=1;
                        tdone[23]=1;
                      }
                    }
                    else {
                      active[23]=1;
                      ends[23]=1;
                      tdone[23]=1;
                    }
                  }
                }
                else {
                  active[23]=1;
                  ends[23]=1;
                  tdone[23]=1;
                }
              }
              else {
                active[23]=1;
                ends[23]=1;
                tdone[23]=1;
              }
            }
            break;
          
          case 5 : 
            switch(S7932){
              case 0 : 
                if(!reqAuthCheck_o.isPartnerPresent() || reqAuthCheck_o.isPartnerPreempted()){//sysj/Exercise6.sysj line: 330, column: 5
                  reqAuthCheck_o.setREQ(false);//sysj/Exercise6.sysj line: 330, column: 5
                  S7932=1;
                  active[23]=1;
                  ends[23]=1;
                  tdone[23]=1;
                }
                else {
                  switch(S7927){
                    case 0 : 
                      if(reqAuthCheck_o.isACK()){//sysj/Exercise6.sysj line: 330, column: 5
                        reqAuthCheck_o.setVal("11111");//sysj/Exercise6.sysj line: 330, column: 5
                        S7927=1;
                        if(!reqAuthCheck_o.isACK()){//sysj/Exercise6.sysj line: 330, column: 5
                          reqAuthCheck_o.setREQ(false);//sysj/Exercise6.sysj line: 330, column: 5
                          ends[23]=2;
                          ;//sysj/Exercise6.sysj line: 330, column: 5
                          S7705=6;
                          S7976=0;
                          if(!idAuthResponse_in.isPartnerPresent() || idAuthResponse_in.isPartnerPreempted()){//sysj/Exercise6.sysj line: 331, column: 5
                            idAuthResponse_in.setACK(false);//sysj/Exercise6.sysj line: 331, column: 5
                            S7976=1;
                            active[23]=1;
                            ends[23]=1;
                            tdone[23]=1;
                          }
                          else {
                            S7971=0;
                            if(!idAuthResponse_in.isREQ()){//sysj/Exercise6.sysj line: 331, column: 5
                              idAuthResponse_in.setACK(true);//sysj/Exercise6.sysj line: 331, column: 5
                              S7971=1;
                              if(idAuthResponse_in.isREQ()){//sysj/Exercise6.sysj line: 331, column: 5
                                idAuthResponse_in.setACK(false);//sysj/Exercise6.sysj line: 331, column: 5
                                ends[23]=2;
                                ;//sysj/Exercise6.sysj line: 331, column: 5
                                response_thread_23 = (idAuthResponse_in.getVal() == null ? false : ((Boolean)idAuthResponse_in.getVal()).booleanValue());//sysj/Exercise6.sysj line: 333, column: 5
                                if(response_thread_23 == false){//sysj/Exercise6.sysj line: 336, column: 9
                                  if(zoneLocation_thread_23 == "1"){//sysj/Exercise6.sysj line: 339, column: 7
                                    System.out.println("Unauthorized employee found in Zone 1.");//sysj/Exercise6.sysj line: 340, column: 8
                                    zone1Unauth.setPresent();//sysj/Exercise6.sysj line: 341, column: 8
                                    currsigs.addElement(zone1Unauth);
                                    System.out.println("Detected employees: " + zone1NumEmployee_thread_23 + " " + zone2NumEmployee_thread_23 + " " + zone3NumEmployee_thread_23 + " " + zone7NumEmployee_thread_23);//sysj/Exercise6.sysj line: 358, column: 5
                                    zone1Num.setPresent();//sysj/Exercise6.sysj line: 362, column: 5
                                    currsigs.addElement(zone1Num);
                                    zone1Num.setValue(zone1NumEmployee_thread_23);//sysj/Exercise6.sysj line: 362, column: 5
                                    zone2Num.setPresent();//sysj/Exercise6.sysj line: 363, column: 5
                                    currsigs.addElement(zone2Num);
                                    zone2Num.setValue(zone2NumEmployee_thread_23);//sysj/Exercise6.sysj line: 363, column: 5
                                    zone3Num.setPresent();//sysj/Exercise6.sysj line: 364, column: 5
                                    currsigs.addElement(zone3Num);
                                    zone3Num.setValue(zone3NumEmployee_thread_23);//sysj/Exercise6.sysj line: 364, column: 5
                                    zone7Num.setPresent();//sysj/Exercise6.sysj line: 365, column: 5
                                    currsigs.addElement(zone7Num);
                                    zone7Num.setValue(zone7NumEmployee_thread_23);//sysj/Exercise6.sysj line: 365, column: 5
                                    S7705=7;
                                    active[23]=1;
                                    ends[23]=1;
                                    tdone[23]=1;
                                  }
                                  else {
                                    if(zoneLocation_thread_23 == "2"){//sysj/Exercise6.sysj line: 343, column: 7
                                      System.out.println("Unauthorized employee found in Zone 2.");//sysj/Exercise6.sysj line: 344, column: 8
                                      zone2Unauth.setPresent();//sysj/Exercise6.sysj line: 345, column: 8
                                      currsigs.addElement(zone2Unauth);
                                      System.out.println("Detected employees: " + zone1NumEmployee_thread_23 + " " + zone2NumEmployee_thread_23 + " " + zone3NumEmployee_thread_23 + " " + zone7NumEmployee_thread_23);//sysj/Exercise6.sysj line: 358, column: 5
                                      zone1Num.setPresent();//sysj/Exercise6.sysj line: 362, column: 5
                                      currsigs.addElement(zone1Num);
                                      zone1Num.setValue(zone1NumEmployee_thread_23);//sysj/Exercise6.sysj line: 362, column: 5
                                      zone2Num.setPresent();//sysj/Exercise6.sysj line: 363, column: 5
                                      currsigs.addElement(zone2Num);
                                      zone2Num.setValue(zone2NumEmployee_thread_23);//sysj/Exercise6.sysj line: 363, column: 5
                                      zone3Num.setPresent();//sysj/Exercise6.sysj line: 364, column: 5
                                      currsigs.addElement(zone3Num);
                                      zone3Num.setValue(zone3NumEmployee_thread_23);//sysj/Exercise6.sysj line: 364, column: 5
                                      zone7Num.setPresent();//sysj/Exercise6.sysj line: 365, column: 5
                                      currsigs.addElement(zone7Num);
                                      zone7Num.setValue(zone7NumEmployee_thread_23);//sysj/Exercise6.sysj line: 365, column: 5
                                      S7705=7;
                                      active[23]=1;
                                      ends[23]=1;
                                      tdone[23]=1;
                                    }
                                    else {
                                      if(zoneLocation_thread_23 == "3"){//sysj/Exercise6.sysj line: 347, column: 7
                                        System.out.println("Unauthorized employee found in Zone 3.");//sysj/Exercise6.sysj line: 348, column: 8
                                        zone3Unauth.setPresent();//sysj/Exercise6.sysj line: 349, column: 8
                                        currsigs.addElement(zone3Unauth);
                                        System.out.println("Detected employees: " + zone1NumEmployee_thread_23 + " " + zone2NumEmployee_thread_23 + " " + zone3NumEmployee_thread_23 + " " + zone7NumEmployee_thread_23);//sysj/Exercise6.sysj line: 358, column: 5
                                        zone1Num.setPresent();//sysj/Exercise6.sysj line: 362, column: 5
                                        currsigs.addElement(zone1Num);
                                        zone1Num.setValue(zone1NumEmployee_thread_23);//sysj/Exercise6.sysj line: 362, column: 5
                                        zone2Num.setPresent();//sysj/Exercise6.sysj line: 363, column: 5
                                        currsigs.addElement(zone2Num);
                                        zone2Num.setValue(zone2NumEmployee_thread_23);//sysj/Exercise6.sysj line: 363, column: 5
                                        zone3Num.setPresent();//sysj/Exercise6.sysj line: 364, column: 5
                                        currsigs.addElement(zone3Num);
                                        zone3Num.setValue(zone3NumEmployee_thread_23);//sysj/Exercise6.sysj line: 364, column: 5
                                        zone7Num.setPresent();//sysj/Exercise6.sysj line: 365, column: 5
                                        currsigs.addElement(zone7Num);
                                        zone7Num.setValue(zone7NumEmployee_thread_23);//sysj/Exercise6.sysj line: 365, column: 5
                                        S7705=7;
                                        active[23]=1;
                                        ends[23]=1;
                                        tdone[23]=1;
                                      }
                                      else {
                                        if(zoneLocation_thread_23 == "7"){//sysj/Exercise6.sysj line: 351, column: 7
                                          System.out.println("Unauthorized employee found in Zone 7.");//sysj/Exercise6.sysj line: 352, column: 8
                                          zone7Unauth.setPresent();//sysj/Exercise6.sysj line: 353, column: 8
                                          currsigs.addElement(zone7Unauth);
                                          System.out.println("Detected employees: " + zone1NumEmployee_thread_23 + " " + zone2NumEmployee_thread_23 + " " + zone3NumEmployee_thread_23 + " " + zone7NumEmployee_thread_23);//sysj/Exercise6.sysj line: 358, column: 5
                                          zone1Num.setPresent();//sysj/Exercise6.sysj line: 362, column: 5
                                          currsigs.addElement(zone1Num);
                                          zone1Num.setValue(zone1NumEmployee_thread_23);//sysj/Exercise6.sysj line: 362, column: 5
                                          zone2Num.setPresent();//sysj/Exercise6.sysj line: 363, column: 5
                                          currsigs.addElement(zone2Num);
                                          zone2Num.setValue(zone2NumEmployee_thread_23);//sysj/Exercise6.sysj line: 363, column: 5
                                          zone3Num.setPresent();//sysj/Exercise6.sysj line: 364, column: 5
                                          currsigs.addElement(zone3Num);
                                          zone3Num.setValue(zone3NumEmployee_thread_23);//sysj/Exercise6.sysj line: 364, column: 5
                                          zone7Num.setPresent();//sysj/Exercise6.sysj line: 365, column: 5
                                          currsigs.addElement(zone7Num);
                                          zone7Num.setValue(zone7NumEmployee_thread_23);//sysj/Exercise6.sysj line: 365, column: 5
                                          S7705=7;
                                          active[23]=1;
                                          ends[23]=1;
                                          tdone[23]=1;
                                        }
                                        else {
                                          System.out.println("Detected employees: " + zone1NumEmployee_thread_23 + " " + zone2NumEmployee_thread_23 + " " + zone3NumEmployee_thread_23 + " " + zone7NumEmployee_thread_23);//sysj/Exercise6.sysj line: 358, column: 5
                                          zone1Num.setPresent();//sysj/Exercise6.sysj line: 362, column: 5
                                          currsigs.addElement(zone1Num);
                                          zone1Num.setValue(zone1NumEmployee_thread_23);//sysj/Exercise6.sysj line: 362, column: 5
                                          zone2Num.setPresent();//sysj/Exercise6.sysj line: 363, column: 5
                                          currsigs.addElement(zone2Num);
                                          zone2Num.setValue(zone2NumEmployee_thread_23);//sysj/Exercise6.sysj line: 363, column: 5
                                          zone3Num.setPresent();//sysj/Exercise6.sysj line: 364, column: 5
                                          currsigs.addElement(zone3Num);
                                          zone3Num.setValue(zone3NumEmployee_thread_23);//sysj/Exercise6.sysj line: 364, column: 5
                                          zone7Num.setPresent();//sysj/Exercise6.sysj line: 365, column: 5
                                          currsigs.addElement(zone7Num);
                                          zone7Num.setValue(zone7NumEmployee_thread_23);//sysj/Exercise6.sysj line: 365, column: 5
                                          S7705=7;
                                          active[23]=1;
                                          ends[23]=1;
                                          tdone[23]=1;
                                        }
                                      }
                                    }
                                  }
                                }
                                else {
                                  System.out.println("Detected employees: " + zone1NumEmployee_thread_23 + " " + zone2NumEmployee_thread_23 + " " + zone3NumEmployee_thread_23 + " " + zone7NumEmployee_thread_23);//sysj/Exercise6.sysj line: 358, column: 5
                                  zone1Num.setPresent();//sysj/Exercise6.sysj line: 362, column: 5
                                  currsigs.addElement(zone1Num);
                                  zone1Num.setValue(zone1NumEmployee_thread_23);//sysj/Exercise6.sysj line: 362, column: 5
                                  zone2Num.setPresent();//sysj/Exercise6.sysj line: 363, column: 5
                                  currsigs.addElement(zone2Num);
                                  zone2Num.setValue(zone2NumEmployee_thread_23);//sysj/Exercise6.sysj line: 363, column: 5
                                  zone3Num.setPresent();//sysj/Exercise6.sysj line: 364, column: 5
                                  currsigs.addElement(zone3Num);
                                  zone3Num.setValue(zone3NumEmployee_thread_23);//sysj/Exercise6.sysj line: 364, column: 5
                                  zone7Num.setPresent();//sysj/Exercise6.sysj line: 365, column: 5
                                  currsigs.addElement(zone7Num);
                                  zone7Num.setValue(zone7NumEmployee_thread_23);//sysj/Exercise6.sysj line: 365, column: 5
                                  S7705=7;
                                  active[23]=1;
                                  ends[23]=1;
                                  tdone[23]=1;
                                }
                              }
                              else {
                                active[23]=1;
                                ends[23]=1;
                                tdone[23]=1;
                              }
                            }
                            else {
                              active[23]=1;
                              ends[23]=1;
                              tdone[23]=1;
                            }
                          }
                        }
                        else {
                          active[23]=1;
                          ends[23]=1;
                          tdone[23]=1;
                        }
                      }
                      else {
                        active[23]=1;
                        ends[23]=1;
                        tdone[23]=1;
                      }
                      break;
                    
                    case 1 : 
                      if(!reqAuthCheck_o.isACK()){//sysj/Exercise6.sysj line: 330, column: 5
                        reqAuthCheck_o.setREQ(false);//sysj/Exercise6.sysj line: 330, column: 5
                        ends[23]=2;
                        ;//sysj/Exercise6.sysj line: 330, column: 5
                        S7705=6;
                        S7976=0;
                        if(!idAuthResponse_in.isPartnerPresent() || idAuthResponse_in.isPartnerPreempted()){//sysj/Exercise6.sysj line: 331, column: 5
                          idAuthResponse_in.setACK(false);//sysj/Exercise6.sysj line: 331, column: 5
                          S7976=1;
                          active[23]=1;
                          ends[23]=1;
                          tdone[23]=1;
                        }
                        else {
                          S7971=0;
                          if(!idAuthResponse_in.isREQ()){//sysj/Exercise6.sysj line: 331, column: 5
                            idAuthResponse_in.setACK(true);//sysj/Exercise6.sysj line: 331, column: 5
                            S7971=1;
                            if(idAuthResponse_in.isREQ()){//sysj/Exercise6.sysj line: 331, column: 5
                              idAuthResponse_in.setACK(false);//sysj/Exercise6.sysj line: 331, column: 5
                              ends[23]=2;
                              ;//sysj/Exercise6.sysj line: 331, column: 5
                              response_thread_23 = (idAuthResponse_in.getVal() == null ? false : ((Boolean)idAuthResponse_in.getVal()).booleanValue());//sysj/Exercise6.sysj line: 333, column: 5
                              if(response_thread_23 == false){//sysj/Exercise6.sysj line: 336, column: 9
                                if(zoneLocation_thread_23 == "1"){//sysj/Exercise6.sysj line: 339, column: 7
                                  System.out.println("Unauthorized employee found in Zone 1.");//sysj/Exercise6.sysj line: 340, column: 8
                                  zone1Unauth.setPresent();//sysj/Exercise6.sysj line: 341, column: 8
                                  currsigs.addElement(zone1Unauth);
                                  System.out.println("Detected employees: " + zone1NumEmployee_thread_23 + " " + zone2NumEmployee_thread_23 + " " + zone3NumEmployee_thread_23 + " " + zone7NumEmployee_thread_23);//sysj/Exercise6.sysj line: 358, column: 5
                                  zone1Num.setPresent();//sysj/Exercise6.sysj line: 362, column: 5
                                  currsigs.addElement(zone1Num);
                                  zone1Num.setValue(zone1NumEmployee_thread_23);//sysj/Exercise6.sysj line: 362, column: 5
                                  zone2Num.setPresent();//sysj/Exercise6.sysj line: 363, column: 5
                                  currsigs.addElement(zone2Num);
                                  zone2Num.setValue(zone2NumEmployee_thread_23);//sysj/Exercise6.sysj line: 363, column: 5
                                  zone3Num.setPresent();//sysj/Exercise6.sysj line: 364, column: 5
                                  currsigs.addElement(zone3Num);
                                  zone3Num.setValue(zone3NumEmployee_thread_23);//sysj/Exercise6.sysj line: 364, column: 5
                                  zone7Num.setPresent();//sysj/Exercise6.sysj line: 365, column: 5
                                  currsigs.addElement(zone7Num);
                                  zone7Num.setValue(zone7NumEmployee_thread_23);//sysj/Exercise6.sysj line: 365, column: 5
                                  S7705=7;
                                  active[23]=1;
                                  ends[23]=1;
                                  tdone[23]=1;
                                }
                                else {
                                  if(zoneLocation_thread_23 == "2"){//sysj/Exercise6.sysj line: 343, column: 7
                                    System.out.println("Unauthorized employee found in Zone 2.");//sysj/Exercise6.sysj line: 344, column: 8
                                    zone2Unauth.setPresent();//sysj/Exercise6.sysj line: 345, column: 8
                                    currsigs.addElement(zone2Unauth);
                                    System.out.println("Detected employees: " + zone1NumEmployee_thread_23 + " " + zone2NumEmployee_thread_23 + " " + zone3NumEmployee_thread_23 + " " + zone7NumEmployee_thread_23);//sysj/Exercise6.sysj line: 358, column: 5
                                    zone1Num.setPresent();//sysj/Exercise6.sysj line: 362, column: 5
                                    currsigs.addElement(zone1Num);
                                    zone1Num.setValue(zone1NumEmployee_thread_23);//sysj/Exercise6.sysj line: 362, column: 5
                                    zone2Num.setPresent();//sysj/Exercise6.sysj line: 363, column: 5
                                    currsigs.addElement(zone2Num);
                                    zone2Num.setValue(zone2NumEmployee_thread_23);//sysj/Exercise6.sysj line: 363, column: 5
                                    zone3Num.setPresent();//sysj/Exercise6.sysj line: 364, column: 5
                                    currsigs.addElement(zone3Num);
                                    zone3Num.setValue(zone3NumEmployee_thread_23);//sysj/Exercise6.sysj line: 364, column: 5
                                    zone7Num.setPresent();//sysj/Exercise6.sysj line: 365, column: 5
                                    currsigs.addElement(zone7Num);
                                    zone7Num.setValue(zone7NumEmployee_thread_23);//sysj/Exercise6.sysj line: 365, column: 5
                                    S7705=7;
                                    active[23]=1;
                                    ends[23]=1;
                                    tdone[23]=1;
                                  }
                                  else {
                                    if(zoneLocation_thread_23 == "3"){//sysj/Exercise6.sysj line: 347, column: 7
                                      System.out.println("Unauthorized employee found in Zone 3.");//sysj/Exercise6.sysj line: 348, column: 8
                                      zone3Unauth.setPresent();//sysj/Exercise6.sysj line: 349, column: 8
                                      currsigs.addElement(zone3Unauth);
                                      System.out.println("Detected employees: " + zone1NumEmployee_thread_23 + " " + zone2NumEmployee_thread_23 + " " + zone3NumEmployee_thread_23 + " " + zone7NumEmployee_thread_23);//sysj/Exercise6.sysj line: 358, column: 5
                                      zone1Num.setPresent();//sysj/Exercise6.sysj line: 362, column: 5
                                      currsigs.addElement(zone1Num);
                                      zone1Num.setValue(zone1NumEmployee_thread_23);//sysj/Exercise6.sysj line: 362, column: 5
                                      zone2Num.setPresent();//sysj/Exercise6.sysj line: 363, column: 5
                                      currsigs.addElement(zone2Num);
                                      zone2Num.setValue(zone2NumEmployee_thread_23);//sysj/Exercise6.sysj line: 363, column: 5
                                      zone3Num.setPresent();//sysj/Exercise6.sysj line: 364, column: 5
                                      currsigs.addElement(zone3Num);
                                      zone3Num.setValue(zone3NumEmployee_thread_23);//sysj/Exercise6.sysj line: 364, column: 5
                                      zone7Num.setPresent();//sysj/Exercise6.sysj line: 365, column: 5
                                      currsigs.addElement(zone7Num);
                                      zone7Num.setValue(zone7NumEmployee_thread_23);//sysj/Exercise6.sysj line: 365, column: 5
                                      S7705=7;
                                      active[23]=1;
                                      ends[23]=1;
                                      tdone[23]=1;
                                    }
                                    else {
                                      if(zoneLocation_thread_23 == "7"){//sysj/Exercise6.sysj line: 351, column: 7
                                        System.out.println("Unauthorized employee found in Zone 7.");//sysj/Exercise6.sysj line: 352, column: 8
                                        zone7Unauth.setPresent();//sysj/Exercise6.sysj line: 353, column: 8
                                        currsigs.addElement(zone7Unauth);
                                        System.out.println("Detected employees: " + zone1NumEmployee_thread_23 + " " + zone2NumEmployee_thread_23 + " " + zone3NumEmployee_thread_23 + " " + zone7NumEmployee_thread_23);//sysj/Exercise6.sysj line: 358, column: 5
                                        zone1Num.setPresent();//sysj/Exercise6.sysj line: 362, column: 5
                                        currsigs.addElement(zone1Num);
                                        zone1Num.setValue(zone1NumEmployee_thread_23);//sysj/Exercise6.sysj line: 362, column: 5
                                        zone2Num.setPresent();//sysj/Exercise6.sysj line: 363, column: 5
                                        currsigs.addElement(zone2Num);
                                        zone2Num.setValue(zone2NumEmployee_thread_23);//sysj/Exercise6.sysj line: 363, column: 5
                                        zone3Num.setPresent();//sysj/Exercise6.sysj line: 364, column: 5
                                        currsigs.addElement(zone3Num);
                                        zone3Num.setValue(zone3NumEmployee_thread_23);//sysj/Exercise6.sysj line: 364, column: 5
                                        zone7Num.setPresent();//sysj/Exercise6.sysj line: 365, column: 5
                                        currsigs.addElement(zone7Num);
                                        zone7Num.setValue(zone7NumEmployee_thread_23);//sysj/Exercise6.sysj line: 365, column: 5
                                        S7705=7;
                                        active[23]=1;
                                        ends[23]=1;
                                        tdone[23]=1;
                                      }
                                      else {
                                        System.out.println("Detected employees: " + zone1NumEmployee_thread_23 + " " + zone2NumEmployee_thread_23 + " " + zone3NumEmployee_thread_23 + " " + zone7NumEmployee_thread_23);//sysj/Exercise6.sysj line: 358, column: 5
                                        zone1Num.setPresent();//sysj/Exercise6.sysj line: 362, column: 5
                                        currsigs.addElement(zone1Num);
                                        zone1Num.setValue(zone1NumEmployee_thread_23);//sysj/Exercise6.sysj line: 362, column: 5
                                        zone2Num.setPresent();//sysj/Exercise6.sysj line: 363, column: 5
                                        currsigs.addElement(zone2Num);
                                        zone2Num.setValue(zone2NumEmployee_thread_23);//sysj/Exercise6.sysj line: 363, column: 5
                                        zone3Num.setPresent();//sysj/Exercise6.sysj line: 364, column: 5
                                        currsigs.addElement(zone3Num);
                                        zone3Num.setValue(zone3NumEmployee_thread_23);//sysj/Exercise6.sysj line: 364, column: 5
                                        zone7Num.setPresent();//sysj/Exercise6.sysj line: 365, column: 5
                                        currsigs.addElement(zone7Num);
                                        zone7Num.setValue(zone7NumEmployee_thread_23);//sysj/Exercise6.sysj line: 365, column: 5
                                        S7705=7;
                                        active[23]=1;
                                        ends[23]=1;
                                        tdone[23]=1;
                                      }
                                    }
                                  }
                                }
                              }
                              else {
                                System.out.println("Detected employees: " + zone1NumEmployee_thread_23 + " " + zone2NumEmployee_thread_23 + " " + zone3NumEmployee_thread_23 + " " + zone7NumEmployee_thread_23);//sysj/Exercise6.sysj line: 358, column: 5
                                zone1Num.setPresent();//sysj/Exercise6.sysj line: 362, column: 5
                                currsigs.addElement(zone1Num);
                                zone1Num.setValue(zone1NumEmployee_thread_23);//sysj/Exercise6.sysj line: 362, column: 5
                                zone2Num.setPresent();//sysj/Exercise6.sysj line: 363, column: 5
                                currsigs.addElement(zone2Num);
                                zone2Num.setValue(zone2NumEmployee_thread_23);//sysj/Exercise6.sysj line: 363, column: 5
                                zone3Num.setPresent();//sysj/Exercise6.sysj line: 364, column: 5
                                currsigs.addElement(zone3Num);
                                zone3Num.setValue(zone3NumEmployee_thread_23);//sysj/Exercise6.sysj line: 364, column: 5
                                zone7Num.setPresent();//sysj/Exercise6.sysj line: 365, column: 5
                                currsigs.addElement(zone7Num);
                                zone7Num.setValue(zone7NumEmployee_thread_23);//sysj/Exercise6.sysj line: 365, column: 5
                                S7705=7;
                                active[23]=1;
                                ends[23]=1;
                                tdone[23]=1;
                              }
                            }
                            else {
                              active[23]=1;
                              ends[23]=1;
                              tdone[23]=1;
                            }
                          }
                          else {
                            active[23]=1;
                            ends[23]=1;
                            tdone[23]=1;
                          }
                        }
                      }
                      else {
                        active[23]=1;
                        ends[23]=1;
                        tdone[23]=1;
                      }
                      break;
                    
                  }
                }
                break;
              
              case 1 : 
                S7932=1;
                S7932=0;
                if(!reqAuthCheck_o.isPartnerPresent() || reqAuthCheck_o.isPartnerPreempted()){//sysj/Exercise6.sysj line: 330, column: 5
                  reqAuthCheck_o.setREQ(false);//sysj/Exercise6.sysj line: 330, column: 5
                  S7932=1;
                  active[23]=1;
                  ends[23]=1;
                  tdone[23]=1;
                }
                else {
                  S7927=0;
                  if(reqAuthCheck_o.isACK()){//sysj/Exercise6.sysj line: 330, column: 5
                    reqAuthCheck_o.setVal("11111");//sysj/Exercise6.sysj line: 330, column: 5
                    S7927=1;
                    if(!reqAuthCheck_o.isACK()){//sysj/Exercise6.sysj line: 330, column: 5
                      reqAuthCheck_o.setREQ(false);//sysj/Exercise6.sysj line: 330, column: 5
                      ends[23]=2;
                      ;//sysj/Exercise6.sysj line: 330, column: 5
                      S7705=6;
                      S7976=0;
                      if(!idAuthResponse_in.isPartnerPresent() || idAuthResponse_in.isPartnerPreempted()){//sysj/Exercise6.sysj line: 331, column: 5
                        idAuthResponse_in.setACK(false);//sysj/Exercise6.sysj line: 331, column: 5
                        S7976=1;
                        active[23]=1;
                        ends[23]=1;
                        tdone[23]=1;
                      }
                      else {
                        S7971=0;
                        if(!idAuthResponse_in.isREQ()){//sysj/Exercise6.sysj line: 331, column: 5
                          idAuthResponse_in.setACK(true);//sysj/Exercise6.sysj line: 331, column: 5
                          S7971=1;
                          if(idAuthResponse_in.isREQ()){//sysj/Exercise6.sysj line: 331, column: 5
                            idAuthResponse_in.setACK(false);//sysj/Exercise6.sysj line: 331, column: 5
                            ends[23]=2;
                            ;//sysj/Exercise6.sysj line: 331, column: 5
                            response_thread_23 = (idAuthResponse_in.getVal() == null ? false : ((Boolean)idAuthResponse_in.getVal()).booleanValue());//sysj/Exercise6.sysj line: 333, column: 5
                            if(response_thread_23 == false){//sysj/Exercise6.sysj line: 336, column: 9
                              if(zoneLocation_thread_23 == "1"){//sysj/Exercise6.sysj line: 339, column: 7
                                System.out.println("Unauthorized employee found in Zone 1.");//sysj/Exercise6.sysj line: 340, column: 8
                                zone1Unauth.setPresent();//sysj/Exercise6.sysj line: 341, column: 8
                                currsigs.addElement(zone1Unauth);
                                System.out.println("Detected employees: " + zone1NumEmployee_thread_23 + " " + zone2NumEmployee_thread_23 + " " + zone3NumEmployee_thread_23 + " " + zone7NumEmployee_thread_23);//sysj/Exercise6.sysj line: 358, column: 5
                                zone1Num.setPresent();//sysj/Exercise6.sysj line: 362, column: 5
                                currsigs.addElement(zone1Num);
                                zone1Num.setValue(zone1NumEmployee_thread_23);//sysj/Exercise6.sysj line: 362, column: 5
                                zone2Num.setPresent();//sysj/Exercise6.sysj line: 363, column: 5
                                currsigs.addElement(zone2Num);
                                zone2Num.setValue(zone2NumEmployee_thread_23);//sysj/Exercise6.sysj line: 363, column: 5
                                zone3Num.setPresent();//sysj/Exercise6.sysj line: 364, column: 5
                                currsigs.addElement(zone3Num);
                                zone3Num.setValue(zone3NumEmployee_thread_23);//sysj/Exercise6.sysj line: 364, column: 5
                                zone7Num.setPresent();//sysj/Exercise6.sysj line: 365, column: 5
                                currsigs.addElement(zone7Num);
                                zone7Num.setValue(zone7NumEmployee_thread_23);//sysj/Exercise6.sysj line: 365, column: 5
                                S7705=7;
                                active[23]=1;
                                ends[23]=1;
                                tdone[23]=1;
                              }
                              else {
                                if(zoneLocation_thread_23 == "2"){//sysj/Exercise6.sysj line: 343, column: 7
                                  System.out.println("Unauthorized employee found in Zone 2.");//sysj/Exercise6.sysj line: 344, column: 8
                                  zone2Unauth.setPresent();//sysj/Exercise6.sysj line: 345, column: 8
                                  currsigs.addElement(zone2Unauth);
                                  System.out.println("Detected employees: " + zone1NumEmployee_thread_23 + " " + zone2NumEmployee_thread_23 + " " + zone3NumEmployee_thread_23 + " " + zone7NumEmployee_thread_23);//sysj/Exercise6.sysj line: 358, column: 5
                                  zone1Num.setPresent();//sysj/Exercise6.sysj line: 362, column: 5
                                  currsigs.addElement(zone1Num);
                                  zone1Num.setValue(zone1NumEmployee_thread_23);//sysj/Exercise6.sysj line: 362, column: 5
                                  zone2Num.setPresent();//sysj/Exercise6.sysj line: 363, column: 5
                                  currsigs.addElement(zone2Num);
                                  zone2Num.setValue(zone2NumEmployee_thread_23);//sysj/Exercise6.sysj line: 363, column: 5
                                  zone3Num.setPresent();//sysj/Exercise6.sysj line: 364, column: 5
                                  currsigs.addElement(zone3Num);
                                  zone3Num.setValue(zone3NumEmployee_thread_23);//sysj/Exercise6.sysj line: 364, column: 5
                                  zone7Num.setPresent();//sysj/Exercise6.sysj line: 365, column: 5
                                  currsigs.addElement(zone7Num);
                                  zone7Num.setValue(zone7NumEmployee_thread_23);//sysj/Exercise6.sysj line: 365, column: 5
                                  S7705=7;
                                  active[23]=1;
                                  ends[23]=1;
                                  tdone[23]=1;
                                }
                                else {
                                  if(zoneLocation_thread_23 == "3"){//sysj/Exercise6.sysj line: 347, column: 7
                                    System.out.println("Unauthorized employee found in Zone 3.");//sysj/Exercise6.sysj line: 348, column: 8
                                    zone3Unauth.setPresent();//sysj/Exercise6.sysj line: 349, column: 8
                                    currsigs.addElement(zone3Unauth);
                                    System.out.println("Detected employees: " + zone1NumEmployee_thread_23 + " " + zone2NumEmployee_thread_23 + " " + zone3NumEmployee_thread_23 + " " + zone7NumEmployee_thread_23);//sysj/Exercise6.sysj line: 358, column: 5
                                    zone1Num.setPresent();//sysj/Exercise6.sysj line: 362, column: 5
                                    currsigs.addElement(zone1Num);
                                    zone1Num.setValue(zone1NumEmployee_thread_23);//sysj/Exercise6.sysj line: 362, column: 5
                                    zone2Num.setPresent();//sysj/Exercise6.sysj line: 363, column: 5
                                    currsigs.addElement(zone2Num);
                                    zone2Num.setValue(zone2NumEmployee_thread_23);//sysj/Exercise6.sysj line: 363, column: 5
                                    zone3Num.setPresent();//sysj/Exercise6.sysj line: 364, column: 5
                                    currsigs.addElement(zone3Num);
                                    zone3Num.setValue(zone3NumEmployee_thread_23);//sysj/Exercise6.sysj line: 364, column: 5
                                    zone7Num.setPresent();//sysj/Exercise6.sysj line: 365, column: 5
                                    currsigs.addElement(zone7Num);
                                    zone7Num.setValue(zone7NumEmployee_thread_23);//sysj/Exercise6.sysj line: 365, column: 5
                                    S7705=7;
                                    active[23]=1;
                                    ends[23]=1;
                                    tdone[23]=1;
                                  }
                                  else {
                                    if(zoneLocation_thread_23 == "7"){//sysj/Exercise6.sysj line: 351, column: 7
                                      System.out.println("Unauthorized employee found in Zone 7.");//sysj/Exercise6.sysj line: 352, column: 8
                                      zone7Unauth.setPresent();//sysj/Exercise6.sysj line: 353, column: 8
                                      currsigs.addElement(zone7Unauth);
                                      System.out.println("Detected employees: " + zone1NumEmployee_thread_23 + " " + zone2NumEmployee_thread_23 + " " + zone3NumEmployee_thread_23 + " " + zone7NumEmployee_thread_23);//sysj/Exercise6.sysj line: 358, column: 5
                                      zone1Num.setPresent();//sysj/Exercise6.sysj line: 362, column: 5
                                      currsigs.addElement(zone1Num);
                                      zone1Num.setValue(zone1NumEmployee_thread_23);//sysj/Exercise6.sysj line: 362, column: 5
                                      zone2Num.setPresent();//sysj/Exercise6.sysj line: 363, column: 5
                                      currsigs.addElement(zone2Num);
                                      zone2Num.setValue(zone2NumEmployee_thread_23);//sysj/Exercise6.sysj line: 363, column: 5
                                      zone3Num.setPresent();//sysj/Exercise6.sysj line: 364, column: 5
                                      currsigs.addElement(zone3Num);
                                      zone3Num.setValue(zone3NumEmployee_thread_23);//sysj/Exercise6.sysj line: 364, column: 5
                                      zone7Num.setPresent();//sysj/Exercise6.sysj line: 365, column: 5
                                      currsigs.addElement(zone7Num);
                                      zone7Num.setValue(zone7NumEmployee_thread_23);//sysj/Exercise6.sysj line: 365, column: 5
                                      S7705=7;
                                      active[23]=1;
                                      ends[23]=1;
                                      tdone[23]=1;
                                    }
                                    else {
                                      System.out.println("Detected employees: " + zone1NumEmployee_thread_23 + " " + zone2NumEmployee_thread_23 + " " + zone3NumEmployee_thread_23 + " " + zone7NumEmployee_thread_23);//sysj/Exercise6.sysj line: 358, column: 5
                                      zone1Num.setPresent();//sysj/Exercise6.sysj line: 362, column: 5
                                      currsigs.addElement(zone1Num);
                                      zone1Num.setValue(zone1NumEmployee_thread_23);//sysj/Exercise6.sysj line: 362, column: 5
                                      zone2Num.setPresent();//sysj/Exercise6.sysj line: 363, column: 5
                                      currsigs.addElement(zone2Num);
                                      zone2Num.setValue(zone2NumEmployee_thread_23);//sysj/Exercise6.sysj line: 363, column: 5
                                      zone3Num.setPresent();//sysj/Exercise6.sysj line: 364, column: 5
                                      currsigs.addElement(zone3Num);
                                      zone3Num.setValue(zone3NumEmployee_thread_23);//sysj/Exercise6.sysj line: 364, column: 5
                                      zone7Num.setPresent();//sysj/Exercise6.sysj line: 365, column: 5
                                      currsigs.addElement(zone7Num);
                                      zone7Num.setValue(zone7NumEmployee_thread_23);//sysj/Exercise6.sysj line: 365, column: 5
                                      S7705=7;
                                      active[23]=1;
                                      ends[23]=1;
                                      tdone[23]=1;
                                    }
                                  }
                                }
                              }
                            }
                            else {
                              System.out.println("Detected employees: " + zone1NumEmployee_thread_23 + " " + zone2NumEmployee_thread_23 + " " + zone3NumEmployee_thread_23 + " " + zone7NumEmployee_thread_23);//sysj/Exercise6.sysj line: 358, column: 5
                              zone1Num.setPresent();//sysj/Exercise6.sysj line: 362, column: 5
                              currsigs.addElement(zone1Num);
                              zone1Num.setValue(zone1NumEmployee_thread_23);//sysj/Exercise6.sysj line: 362, column: 5
                              zone2Num.setPresent();//sysj/Exercise6.sysj line: 363, column: 5
                              currsigs.addElement(zone2Num);
                              zone2Num.setValue(zone2NumEmployee_thread_23);//sysj/Exercise6.sysj line: 363, column: 5
                              zone3Num.setPresent();//sysj/Exercise6.sysj line: 364, column: 5
                              currsigs.addElement(zone3Num);
                              zone3Num.setValue(zone3NumEmployee_thread_23);//sysj/Exercise6.sysj line: 364, column: 5
                              zone7Num.setPresent();//sysj/Exercise6.sysj line: 365, column: 5
                              currsigs.addElement(zone7Num);
                              zone7Num.setValue(zone7NumEmployee_thread_23);//sysj/Exercise6.sysj line: 365, column: 5
                              S7705=7;
                              active[23]=1;
                              ends[23]=1;
                              tdone[23]=1;
                            }
                          }
                          else {
                            active[23]=1;
                            ends[23]=1;
                            tdone[23]=1;
                          }
                        }
                        else {
                          active[23]=1;
                          ends[23]=1;
                          tdone[23]=1;
                        }
                      }
                    }
                    else {
                      active[23]=1;
                      ends[23]=1;
                      tdone[23]=1;
                    }
                  }
                  else {
                    active[23]=1;
                    ends[23]=1;
                    tdone[23]=1;
                  }
                }
                break;
              
            }
            break;
          
          case 6 : 
            switch(S7976){
              case 0 : 
                if(!idAuthResponse_in.isPartnerPresent() || idAuthResponse_in.isPartnerPreempted()){//sysj/Exercise6.sysj line: 331, column: 5
                  idAuthResponse_in.setACK(false);//sysj/Exercise6.sysj line: 331, column: 5
                  S7976=1;
                  active[23]=1;
                  ends[23]=1;
                  tdone[23]=1;
                }
                else {
                  switch(S7971){
                    case 0 : 
                      if(!idAuthResponse_in.isREQ()){//sysj/Exercise6.sysj line: 331, column: 5
                        idAuthResponse_in.setACK(true);//sysj/Exercise6.sysj line: 331, column: 5
                        S7971=1;
                        if(idAuthResponse_in.isREQ()){//sysj/Exercise6.sysj line: 331, column: 5
                          idAuthResponse_in.setACK(false);//sysj/Exercise6.sysj line: 331, column: 5
                          ends[23]=2;
                          ;//sysj/Exercise6.sysj line: 331, column: 5
                          response_thread_23 = (idAuthResponse_in.getVal() == null ? false : ((Boolean)idAuthResponse_in.getVal()).booleanValue());//sysj/Exercise6.sysj line: 333, column: 5
                          if(response_thread_23 == false){//sysj/Exercise6.sysj line: 336, column: 9
                            if(zoneLocation_thread_23 == "1"){//sysj/Exercise6.sysj line: 339, column: 7
                              System.out.println("Unauthorized employee found in Zone 1.");//sysj/Exercise6.sysj line: 340, column: 8
                              zone1Unauth.setPresent();//sysj/Exercise6.sysj line: 341, column: 8
                              currsigs.addElement(zone1Unauth);
                              System.out.println("Detected employees: " + zone1NumEmployee_thread_23 + " " + zone2NumEmployee_thread_23 + " " + zone3NumEmployee_thread_23 + " " + zone7NumEmployee_thread_23);//sysj/Exercise6.sysj line: 358, column: 5
                              zone1Num.setPresent();//sysj/Exercise6.sysj line: 362, column: 5
                              currsigs.addElement(zone1Num);
                              zone1Num.setValue(zone1NumEmployee_thread_23);//sysj/Exercise6.sysj line: 362, column: 5
                              zone2Num.setPresent();//sysj/Exercise6.sysj line: 363, column: 5
                              currsigs.addElement(zone2Num);
                              zone2Num.setValue(zone2NumEmployee_thread_23);//sysj/Exercise6.sysj line: 363, column: 5
                              zone3Num.setPresent();//sysj/Exercise6.sysj line: 364, column: 5
                              currsigs.addElement(zone3Num);
                              zone3Num.setValue(zone3NumEmployee_thread_23);//sysj/Exercise6.sysj line: 364, column: 5
                              zone7Num.setPresent();//sysj/Exercise6.sysj line: 365, column: 5
                              currsigs.addElement(zone7Num);
                              zone7Num.setValue(zone7NumEmployee_thread_23);//sysj/Exercise6.sysj line: 365, column: 5
                              S7705=7;
                              active[23]=1;
                              ends[23]=1;
                              tdone[23]=1;
                            }
                            else {
                              if(zoneLocation_thread_23 == "2"){//sysj/Exercise6.sysj line: 343, column: 7
                                System.out.println("Unauthorized employee found in Zone 2.");//sysj/Exercise6.sysj line: 344, column: 8
                                zone2Unauth.setPresent();//sysj/Exercise6.sysj line: 345, column: 8
                                currsigs.addElement(zone2Unauth);
                                System.out.println("Detected employees: " + zone1NumEmployee_thread_23 + " " + zone2NumEmployee_thread_23 + " " + zone3NumEmployee_thread_23 + " " + zone7NumEmployee_thread_23);//sysj/Exercise6.sysj line: 358, column: 5
                                zone1Num.setPresent();//sysj/Exercise6.sysj line: 362, column: 5
                                currsigs.addElement(zone1Num);
                                zone1Num.setValue(zone1NumEmployee_thread_23);//sysj/Exercise6.sysj line: 362, column: 5
                                zone2Num.setPresent();//sysj/Exercise6.sysj line: 363, column: 5
                                currsigs.addElement(zone2Num);
                                zone2Num.setValue(zone2NumEmployee_thread_23);//sysj/Exercise6.sysj line: 363, column: 5
                                zone3Num.setPresent();//sysj/Exercise6.sysj line: 364, column: 5
                                currsigs.addElement(zone3Num);
                                zone3Num.setValue(zone3NumEmployee_thread_23);//sysj/Exercise6.sysj line: 364, column: 5
                                zone7Num.setPresent();//sysj/Exercise6.sysj line: 365, column: 5
                                currsigs.addElement(zone7Num);
                                zone7Num.setValue(zone7NumEmployee_thread_23);//sysj/Exercise6.sysj line: 365, column: 5
                                S7705=7;
                                active[23]=1;
                                ends[23]=1;
                                tdone[23]=1;
                              }
                              else {
                                if(zoneLocation_thread_23 == "3"){//sysj/Exercise6.sysj line: 347, column: 7
                                  System.out.println("Unauthorized employee found in Zone 3.");//sysj/Exercise6.sysj line: 348, column: 8
                                  zone3Unauth.setPresent();//sysj/Exercise6.sysj line: 349, column: 8
                                  currsigs.addElement(zone3Unauth);
                                  System.out.println("Detected employees: " + zone1NumEmployee_thread_23 + " " + zone2NumEmployee_thread_23 + " " + zone3NumEmployee_thread_23 + " " + zone7NumEmployee_thread_23);//sysj/Exercise6.sysj line: 358, column: 5
                                  zone1Num.setPresent();//sysj/Exercise6.sysj line: 362, column: 5
                                  currsigs.addElement(zone1Num);
                                  zone1Num.setValue(zone1NumEmployee_thread_23);//sysj/Exercise6.sysj line: 362, column: 5
                                  zone2Num.setPresent();//sysj/Exercise6.sysj line: 363, column: 5
                                  currsigs.addElement(zone2Num);
                                  zone2Num.setValue(zone2NumEmployee_thread_23);//sysj/Exercise6.sysj line: 363, column: 5
                                  zone3Num.setPresent();//sysj/Exercise6.sysj line: 364, column: 5
                                  currsigs.addElement(zone3Num);
                                  zone3Num.setValue(zone3NumEmployee_thread_23);//sysj/Exercise6.sysj line: 364, column: 5
                                  zone7Num.setPresent();//sysj/Exercise6.sysj line: 365, column: 5
                                  currsigs.addElement(zone7Num);
                                  zone7Num.setValue(zone7NumEmployee_thread_23);//sysj/Exercise6.sysj line: 365, column: 5
                                  S7705=7;
                                  active[23]=1;
                                  ends[23]=1;
                                  tdone[23]=1;
                                }
                                else {
                                  if(zoneLocation_thread_23 == "7"){//sysj/Exercise6.sysj line: 351, column: 7
                                    System.out.println("Unauthorized employee found in Zone 7.");//sysj/Exercise6.sysj line: 352, column: 8
                                    zone7Unauth.setPresent();//sysj/Exercise6.sysj line: 353, column: 8
                                    currsigs.addElement(zone7Unauth);
                                    System.out.println("Detected employees: " + zone1NumEmployee_thread_23 + " " + zone2NumEmployee_thread_23 + " " + zone3NumEmployee_thread_23 + " " + zone7NumEmployee_thread_23);//sysj/Exercise6.sysj line: 358, column: 5
                                    zone1Num.setPresent();//sysj/Exercise6.sysj line: 362, column: 5
                                    currsigs.addElement(zone1Num);
                                    zone1Num.setValue(zone1NumEmployee_thread_23);//sysj/Exercise6.sysj line: 362, column: 5
                                    zone2Num.setPresent();//sysj/Exercise6.sysj line: 363, column: 5
                                    currsigs.addElement(zone2Num);
                                    zone2Num.setValue(zone2NumEmployee_thread_23);//sysj/Exercise6.sysj line: 363, column: 5
                                    zone3Num.setPresent();//sysj/Exercise6.sysj line: 364, column: 5
                                    currsigs.addElement(zone3Num);
                                    zone3Num.setValue(zone3NumEmployee_thread_23);//sysj/Exercise6.sysj line: 364, column: 5
                                    zone7Num.setPresent();//sysj/Exercise6.sysj line: 365, column: 5
                                    currsigs.addElement(zone7Num);
                                    zone7Num.setValue(zone7NumEmployee_thread_23);//sysj/Exercise6.sysj line: 365, column: 5
                                    S7705=7;
                                    active[23]=1;
                                    ends[23]=1;
                                    tdone[23]=1;
                                  }
                                  else {
                                    System.out.println("Detected employees: " + zone1NumEmployee_thread_23 + " " + zone2NumEmployee_thread_23 + " " + zone3NumEmployee_thread_23 + " " + zone7NumEmployee_thread_23);//sysj/Exercise6.sysj line: 358, column: 5
                                    zone1Num.setPresent();//sysj/Exercise6.sysj line: 362, column: 5
                                    currsigs.addElement(zone1Num);
                                    zone1Num.setValue(zone1NumEmployee_thread_23);//sysj/Exercise6.sysj line: 362, column: 5
                                    zone2Num.setPresent();//sysj/Exercise6.sysj line: 363, column: 5
                                    currsigs.addElement(zone2Num);
                                    zone2Num.setValue(zone2NumEmployee_thread_23);//sysj/Exercise6.sysj line: 363, column: 5
                                    zone3Num.setPresent();//sysj/Exercise6.sysj line: 364, column: 5
                                    currsigs.addElement(zone3Num);
                                    zone3Num.setValue(zone3NumEmployee_thread_23);//sysj/Exercise6.sysj line: 364, column: 5
                                    zone7Num.setPresent();//sysj/Exercise6.sysj line: 365, column: 5
                                    currsigs.addElement(zone7Num);
                                    zone7Num.setValue(zone7NumEmployee_thread_23);//sysj/Exercise6.sysj line: 365, column: 5
                                    S7705=7;
                                    active[23]=1;
                                    ends[23]=1;
                                    tdone[23]=1;
                                  }
                                }
                              }
                            }
                          }
                          else {
                            System.out.println("Detected employees: " + zone1NumEmployee_thread_23 + " " + zone2NumEmployee_thread_23 + " " + zone3NumEmployee_thread_23 + " " + zone7NumEmployee_thread_23);//sysj/Exercise6.sysj line: 358, column: 5
                            zone1Num.setPresent();//sysj/Exercise6.sysj line: 362, column: 5
                            currsigs.addElement(zone1Num);
                            zone1Num.setValue(zone1NumEmployee_thread_23);//sysj/Exercise6.sysj line: 362, column: 5
                            zone2Num.setPresent();//sysj/Exercise6.sysj line: 363, column: 5
                            currsigs.addElement(zone2Num);
                            zone2Num.setValue(zone2NumEmployee_thread_23);//sysj/Exercise6.sysj line: 363, column: 5
                            zone3Num.setPresent();//sysj/Exercise6.sysj line: 364, column: 5
                            currsigs.addElement(zone3Num);
                            zone3Num.setValue(zone3NumEmployee_thread_23);//sysj/Exercise6.sysj line: 364, column: 5
                            zone7Num.setPresent();//sysj/Exercise6.sysj line: 365, column: 5
                            currsigs.addElement(zone7Num);
                            zone7Num.setValue(zone7NumEmployee_thread_23);//sysj/Exercise6.sysj line: 365, column: 5
                            S7705=7;
                            active[23]=1;
                            ends[23]=1;
                            tdone[23]=1;
                          }
                        }
                        else {
                          active[23]=1;
                          ends[23]=1;
                          tdone[23]=1;
                        }
                      }
                      else {
                        active[23]=1;
                        ends[23]=1;
                        tdone[23]=1;
                      }
                      break;
                    
                    case 1 : 
                      if(idAuthResponse_in.isREQ()){//sysj/Exercise6.sysj line: 331, column: 5
                        idAuthResponse_in.setACK(false);//sysj/Exercise6.sysj line: 331, column: 5
                        ends[23]=2;
                        ;//sysj/Exercise6.sysj line: 331, column: 5
                        response_thread_23 = (idAuthResponse_in.getVal() == null ? false : ((Boolean)idAuthResponse_in.getVal()).booleanValue());//sysj/Exercise6.sysj line: 333, column: 5
                        if(response_thread_23 == false){//sysj/Exercise6.sysj line: 336, column: 9
                          if(zoneLocation_thread_23 == "1"){//sysj/Exercise6.sysj line: 339, column: 7
                            System.out.println("Unauthorized employee found in Zone 1.");//sysj/Exercise6.sysj line: 340, column: 8
                            zone1Unauth.setPresent();//sysj/Exercise6.sysj line: 341, column: 8
                            currsigs.addElement(zone1Unauth);
                            System.out.println("Detected employees: " + zone1NumEmployee_thread_23 + " " + zone2NumEmployee_thread_23 + " " + zone3NumEmployee_thread_23 + " " + zone7NumEmployee_thread_23);//sysj/Exercise6.sysj line: 358, column: 5
                            zone1Num.setPresent();//sysj/Exercise6.sysj line: 362, column: 5
                            currsigs.addElement(zone1Num);
                            zone1Num.setValue(zone1NumEmployee_thread_23);//sysj/Exercise6.sysj line: 362, column: 5
                            zone2Num.setPresent();//sysj/Exercise6.sysj line: 363, column: 5
                            currsigs.addElement(zone2Num);
                            zone2Num.setValue(zone2NumEmployee_thread_23);//sysj/Exercise6.sysj line: 363, column: 5
                            zone3Num.setPresent();//sysj/Exercise6.sysj line: 364, column: 5
                            currsigs.addElement(zone3Num);
                            zone3Num.setValue(zone3NumEmployee_thread_23);//sysj/Exercise6.sysj line: 364, column: 5
                            zone7Num.setPresent();//sysj/Exercise6.sysj line: 365, column: 5
                            currsigs.addElement(zone7Num);
                            zone7Num.setValue(zone7NumEmployee_thread_23);//sysj/Exercise6.sysj line: 365, column: 5
                            S7705=7;
                            active[23]=1;
                            ends[23]=1;
                            tdone[23]=1;
                          }
                          else {
                            if(zoneLocation_thread_23 == "2"){//sysj/Exercise6.sysj line: 343, column: 7
                              System.out.println("Unauthorized employee found in Zone 2.");//sysj/Exercise6.sysj line: 344, column: 8
                              zone2Unauth.setPresent();//sysj/Exercise6.sysj line: 345, column: 8
                              currsigs.addElement(zone2Unauth);
                              System.out.println("Detected employees: " + zone1NumEmployee_thread_23 + " " + zone2NumEmployee_thread_23 + " " + zone3NumEmployee_thread_23 + " " + zone7NumEmployee_thread_23);//sysj/Exercise6.sysj line: 358, column: 5
                              zone1Num.setPresent();//sysj/Exercise6.sysj line: 362, column: 5
                              currsigs.addElement(zone1Num);
                              zone1Num.setValue(zone1NumEmployee_thread_23);//sysj/Exercise6.sysj line: 362, column: 5
                              zone2Num.setPresent();//sysj/Exercise6.sysj line: 363, column: 5
                              currsigs.addElement(zone2Num);
                              zone2Num.setValue(zone2NumEmployee_thread_23);//sysj/Exercise6.sysj line: 363, column: 5
                              zone3Num.setPresent();//sysj/Exercise6.sysj line: 364, column: 5
                              currsigs.addElement(zone3Num);
                              zone3Num.setValue(zone3NumEmployee_thread_23);//sysj/Exercise6.sysj line: 364, column: 5
                              zone7Num.setPresent();//sysj/Exercise6.sysj line: 365, column: 5
                              currsigs.addElement(zone7Num);
                              zone7Num.setValue(zone7NumEmployee_thread_23);//sysj/Exercise6.sysj line: 365, column: 5
                              S7705=7;
                              active[23]=1;
                              ends[23]=1;
                              tdone[23]=1;
                            }
                            else {
                              if(zoneLocation_thread_23 == "3"){//sysj/Exercise6.sysj line: 347, column: 7
                                System.out.println("Unauthorized employee found in Zone 3.");//sysj/Exercise6.sysj line: 348, column: 8
                                zone3Unauth.setPresent();//sysj/Exercise6.sysj line: 349, column: 8
                                currsigs.addElement(zone3Unauth);
                                System.out.println("Detected employees: " + zone1NumEmployee_thread_23 + " " + zone2NumEmployee_thread_23 + " " + zone3NumEmployee_thread_23 + " " + zone7NumEmployee_thread_23);//sysj/Exercise6.sysj line: 358, column: 5
                                zone1Num.setPresent();//sysj/Exercise6.sysj line: 362, column: 5
                                currsigs.addElement(zone1Num);
                                zone1Num.setValue(zone1NumEmployee_thread_23);//sysj/Exercise6.sysj line: 362, column: 5
                                zone2Num.setPresent();//sysj/Exercise6.sysj line: 363, column: 5
                                currsigs.addElement(zone2Num);
                                zone2Num.setValue(zone2NumEmployee_thread_23);//sysj/Exercise6.sysj line: 363, column: 5
                                zone3Num.setPresent();//sysj/Exercise6.sysj line: 364, column: 5
                                currsigs.addElement(zone3Num);
                                zone3Num.setValue(zone3NumEmployee_thread_23);//sysj/Exercise6.sysj line: 364, column: 5
                                zone7Num.setPresent();//sysj/Exercise6.sysj line: 365, column: 5
                                currsigs.addElement(zone7Num);
                                zone7Num.setValue(zone7NumEmployee_thread_23);//sysj/Exercise6.sysj line: 365, column: 5
                                S7705=7;
                                active[23]=1;
                                ends[23]=1;
                                tdone[23]=1;
                              }
                              else {
                                if(zoneLocation_thread_23 == "7"){//sysj/Exercise6.sysj line: 351, column: 7
                                  System.out.println("Unauthorized employee found in Zone 7.");//sysj/Exercise6.sysj line: 352, column: 8
                                  zone7Unauth.setPresent();//sysj/Exercise6.sysj line: 353, column: 8
                                  currsigs.addElement(zone7Unauth);
                                  System.out.println("Detected employees: " + zone1NumEmployee_thread_23 + " " + zone2NumEmployee_thread_23 + " " + zone3NumEmployee_thread_23 + " " + zone7NumEmployee_thread_23);//sysj/Exercise6.sysj line: 358, column: 5
                                  zone1Num.setPresent();//sysj/Exercise6.sysj line: 362, column: 5
                                  currsigs.addElement(zone1Num);
                                  zone1Num.setValue(zone1NumEmployee_thread_23);//sysj/Exercise6.sysj line: 362, column: 5
                                  zone2Num.setPresent();//sysj/Exercise6.sysj line: 363, column: 5
                                  currsigs.addElement(zone2Num);
                                  zone2Num.setValue(zone2NumEmployee_thread_23);//sysj/Exercise6.sysj line: 363, column: 5
                                  zone3Num.setPresent();//sysj/Exercise6.sysj line: 364, column: 5
                                  currsigs.addElement(zone3Num);
                                  zone3Num.setValue(zone3NumEmployee_thread_23);//sysj/Exercise6.sysj line: 364, column: 5
                                  zone7Num.setPresent();//sysj/Exercise6.sysj line: 365, column: 5
                                  currsigs.addElement(zone7Num);
                                  zone7Num.setValue(zone7NumEmployee_thread_23);//sysj/Exercise6.sysj line: 365, column: 5
                                  S7705=7;
                                  active[23]=1;
                                  ends[23]=1;
                                  tdone[23]=1;
                                }
                                else {
                                  System.out.println("Detected employees: " + zone1NumEmployee_thread_23 + " " + zone2NumEmployee_thread_23 + " " + zone3NumEmployee_thread_23 + " " + zone7NumEmployee_thread_23);//sysj/Exercise6.sysj line: 358, column: 5
                                  zone1Num.setPresent();//sysj/Exercise6.sysj line: 362, column: 5
                                  currsigs.addElement(zone1Num);
                                  zone1Num.setValue(zone1NumEmployee_thread_23);//sysj/Exercise6.sysj line: 362, column: 5
                                  zone2Num.setPresent();//sysj/Exercise6.sysj line: 363, column: 5
                                  currsigs.addElement(zone2Num);
                                  zone2Num.setValue(zone2NumEmployee_thread_23);//sysj/Exercise6.sysj line: 363, column: 5
                                  zone3Num.setPresent();//sysj/Exercise6.sysj line: 364, column: 5
                                  currsigs.addElement(zone3Num);
                                  zone3Num.setValue(zone3NumEmployee_thread_23);//sysj/Exercise6.sysj line: 364, column: 5
                                  zone7Num.setPresent();//sysj/Exercise6.sysj line: 365, column: 5
                                  currsigs.addElement(zone7Num);
                                  zone7Num.setValue(zone7NumEmployee_thread_23);//sysj/Exercise6.sysj line: 365, column: 5
                                  S7705=7;
                                  active[23]=1;
                                  ends[23]=1;
                                  tdone[23]=1;
                                }
                              }
                            }
                          }
                        }
                        else {
                          System.out.println("Detected employees: " + zone1NumEmployee_thread_23 + " " + zone2NumEmployee_thread_23 + " " + zone3NumEmployee_thread_23 + " " + zone7NumEmployee_thread_23);//sysj/Exercise6.sysj line: 358, column: 5
                          zone1Num.setPresent();//sysj/Exercise6.sysj line: 362, column: 5
                          currsigs.addElement(zone1Num);
                          zone1Num.setValue(zone1NumEmployee_thread_23);//sysj/Exercise6.sysj line: 362, column: 5
                          zone2Num.setPresent();//sysj/Exercise6.sysj line: 363, column: 5
                          currsigs.addElement(zone2Num);
                          zone2Num.setValue(zone2NumEmployee_thread_23);//sysj/Exercise6.sysj line: 363, column: 5
                          zone3Num.setPresent();//sysj/Exercise6.sysj line: 364, column: 5
                          currsigs.addElement(zone3Num);
                          zone3Num.setValue(zone3NumEmployee_thread_23);//sysj/Exercise6.sysj line: 364, column: 5
                          zone7Num.setPresent();//sysj/Exercise6.sysj line: 365, column: 5
                          currsigs.addElement(zone7Num);
                          zone7Num.setValue(zone7NumEmployee_thread_23);//sysj/Exercise6.sysj line: 365, column: 5
                          S7705=7;
                          active[23]=1;
                          ends[23]=1;
                          tdone[23]=1;
                        }
                      }
                      else {
                        active[23]=1;
                        ends[23]=1;
                        tdone[23]=1;
                      }
                      break;
                    
                  }
                }
                break;
              
              case 1 : 
                S7976=1;
                S7976=0;
                if(!idAuthResponse_in.isPartnerPresent() || idAuthResponse_in.isPartnerPreempted()){//sysj/Exercise6.sysj line: 331, column: 5
                  idAuthResponse_in.setACK(false);//sysj/Exercise6.sysj line: 331, column: 5
                  S7976=1;
                  active[23]=1;
                  ends[23]=1;
                  tdone[23]=1;
                }
                else {
                  S7971=0;
                  if(!idAuthResponse_in.isREQ()){//sysj/Exercise6.sysj line: 331, column: 5
                    idAuthResponse_in.setACK(true);//sysj/Exercise6.sysj line: 331, column: 5
                    S7971=1;
                    if(idAuthResponse_in.isREQ()){//sysj/Exercise6.sysj line: 331, column: 5
                      idAuthResponse_in.setACK(false);//sysj/Exercise6.sysj line: 331, column: 5
                      ends[23]=2;
                      ;//sysj/Exercise6.sysj line: 331, column: 5
                      response_thread_23 = (idAuthResponse_in.getVal() == null ? false : ((Boolean)idAuthResponse_in.getVal()).booleanValue());//sysj/Exercise6.sysj line: 333, column: 5
                      if(response_thread_23 == false){//sysj/Exercise6.sysj line: 336, column: 9
                        if(zoneLocation_thread_23 == "1"){//sysj/Exercise6.sysj line: 339, column: 7
                          System.out.println("Unauthorized employee found in Zone 1.");//sysj/Exercise6.sysj line: 340, column: 8
                          zone1Unauth.setPresent();//sysj/Exercise6.sysj line: 341, column: 8
                          currsigs.addElement(zone1Unauth);
                          System.out.println("Detected employees: " + zone1NumEmployee_thread_23 + " " + zone2NumEmployee_thread_23 + " " + zone3NumEmployee_thread_23 + " " + zone7NumEmployee_thread_23);//sysj/Exercise6.sysj line: 358, column: 5
                          zone1Num.setPresent();//sysj/Exercise6.sysj line: 362, column: 5
                          currsigs.addElement(zone1Num);
                          zone1Num.setValue(zone1NumEmployee_thread_23);//sysj/Exercise6.sysj line: 362, column: 5
                          zone2Num.setPresent();//sysj/Exercise6.sysj line: 363, column: 5
                          currsigs.addElement(zone2Num);
                          zone2Num.setValue(zone2NumEmployee_thread_23);//sysj/Exercise6.sysj line: 363, column: 5
                          zone3Num.setPresent();//sysj/Exercise6.sysj line: 364, column: 5
                          currsigs.addElement(zone3Num);
                          zone3Num.setValue(zone3NumEmployee_thread_23);//sysj/Exercise6.sysj line: 364, column: 5
                          zone7Num.setPresent();//sysj/Exercise6.sysj line: 365, column: 5
                          currsigs.addElement(zone7Num);
                          zone7Num.setValue(zone7NumEmployee_thread_23);//sysj/Exercise6.sysj line: 365, column: 5
                          S7705=7;
                          active[23]=1;
                          ends[23]=1;
                          tdone[23]=1;
                        }
                        else {
                          if(zoneLocation_thread_23 == "2"){//sysj/Exercise6.sysj line: 343, column: 7
                            System.out.println("Unauthorized employee found in Zone 2.");//sysj/Exercise6.sysj line: 344, column: 8
                            zone2Unauth.setPresent();//sysj/Exercise6.sysj line: 345, column: 8
                            currsigs.addElement(zone2Unauth);
                            System.out.println("Detected employees: " + zone1NumEmployee_thread_23 + " " + zone2NumEmployee_thread_23 + " " + zone3NumEmployee_thread_23 + " " + zone7NumEmployee_thread_23);//sysj/Exercise6.sysj line: 358, column: 5
                            zone1Num.setPresent();//sysj/Exercise6.sysj line: 362, column: 5
                            currsigs.addElement(zone1Num);
                            zone1Num.setValue(zone1NumEmployee_thread_23);//sysj/Exercise6.sysj line: 362, column: 5
                            zone2Num.setPresent();//sysj/Exercise6.sysj line: 363, column: 5
                            currsigs.addElement(zone2Num);
                            zone2Num.setValue(zone2NumEmployee_thread_23);//sysj/Exercise6.sysj line: 363, column: 5
                            zone3Num.setPresent();//sysj/Exercise6.sysj line: 364, column: 5
                            currsigs.addElement(zone3Num);
                            zone3Num.setValue(zone3NumEmployee_thread_23);//sysj/Exercise6.sysj line: 364, column: 5
                            zone7Num.setPresent();//sysj/Exercise6.sysj line: 365, column: 5
                            currsigs.addElement(zone7Num);
                            zone7Num.setValue(zone7NumEmployee_thread_23);//sysj/Exercise6.sysj line: 365, column: 5
                            S7705=7;
                            active[23]=1;
                            ends[23]=1;
                            tdone[23]=1;
                          }
                          else {
                            if(zoneLocation_thread_23 == "3"){//sysj/Exercise6.sysj line: 347, column: 7
                              System.out.println("Unauthorized employee found in Zone 3.");//sysj/Exercise6.sysj line: 348, column: 8
                              zone3Unauth.setPresent();//sysj/Exercise6.sysj line: 349, column: 8
                              currsigs.addElement(zone3Unauth);
                              System.out.println("Detected employees: " + zone1NumEmployee_thread_23 + " " + zone2NumEmployee_thread_23 + " " + zone3NumEmployee_thread_23 + " " + zone7NumEmployee_thread_23);//sysj/Exercise6.sysj line: 358, column: 5
                              zone1Num.setPresent();//sysj/Exercise6.sysj line: 362, column: 5
                              currsigs.addElement(zone1Num);
                              zone1Num.setValue(zone1NumEmployee_thread_23);//sysj/Exercise6.sysj line: 362, column: 5
                              zone2Num.setPresent();//sysj/Exercise6.sysj line: 363, column: 5
                              currsigs.addElement(zone2Num);
                              zone2Num.setValue(zone2NumEmployee_thread_23);//sysj/Exercise6.sysj line: 363, column: 5
                              zone3Num.setPresent();//sysj/Exercise6.sysj line: 364, column: 5
                              currsigs.addElement(zone3Num);
                              zone3Num.setValue(zone3NumEmployee_thread_23);//sysj/Exercise6.sysj line: 364, column: 5
                              zone7Num.setPresent();//sysj/Exercise6.sysj line: 365, column: 5
                              currsigs.addElement(zone7Num);
                              zone7Num.setValue(zone7NumEmployee_thread_23);//sysj/Exercise6.sysj line: 365, column: 5
                              S7705=7;
                              active[23]=1;
                              ends[23]=1;
                              tdone[23]=1;
                            }
                            else {
                              if(zoneLocation_thread_23 == "7"){//sysj/Exercise6.sysj line: 351, column: 7
                                System.out.println("Unauthorized employee found in Zone 7.");//sysj/Exercise6.sysj line: 352, column: 8
                                zone7Unauth.setPresent();//sysj/Exercise6.sysj line: 353, column: 8
                                currsigs.addElement(zone7Unauth);
                                System.out.println("Detected employees: " + zone1NumEmployee_thread_23 + " " + zone2NumEmployee_thread_23 + " " + zone3NumEmployee_thread_23 + " " + zone7NumEmployee_thread_23);//sysj/Exercise6.sysj line: 358, column: 5
                                zone1Num.setPresent();//sysj/Exercise6.sysj line: 362, column: 5
                                currsigs.addElement(zone1Num);
                                zone1Num.setValue(zone1NumEmployee_thread_23);//sysj/Exercise6.sysj line: 362, column: 5
                                zone2Num.setPresent();//sysj/Exercise6.sysj line: 363, column: 5
                                currsigs.addElement(zone2Num);
                                zone2Num.setValue(zone2NumEmployee_thread_23);//sysj/Exercise6.sysj line: 363, column: 5
                                zone3Num.setPresent();//sysj/Exercise6.sysj line: 364, column: 5
                                currsigs.addElement(zone3Num);
                                zone3Num.setValue(zone3NumEmployee_thread_23);//sysj/Exercise6.sysj line: 364, column: 5
                                zone7Num.setPresent();//sysj/Exercise6.sysj line: 365, column: 5
                                currsigs.addElement(zone7Num);
                                zone7Num.setValue(zone7NumEmployee_thread_23);//sysj/Exercise6.sysj line: 365, column: 5
                                S7705=7;
                                active[23]=1;
                                ends[23]=1;
                                tdone[23]=1;
                              }
                              else {
                                System.out.println("Detected employees: " + zone1NumEmployee_thread_23 + " " + zone2NumEmployee_thread_23 + " " + zone3NumEmployee_thread_23 + " " + zone7NumEmployee_thread_23);//sysj/Exercise6.sysj line: 358, column: 5
                                zone1Num.setPresent();//sysj/Exercise6.sysj line: 362, column: 5
                                currsigs.addElement(zone1Num);
                                zone1Num.setValue(zone1NumEmployee_thread_23);//sysj/Exercise6.sysj line: 362, column: 5
                                zone2Num.setPresent();//sysj/Exercise6.sysj line: 363, column: 5
                                currsigs.addElement(zone2Num);
                                zone2Num.setValue(zone2NumEmployee_thread_23);//sysj/Exercise6.sysj line: 363, column: 5
                                zone3Num.setPresent();//sysj/Exercise6.sysj line: 364, column: 5
                                currsigs.addElement(zone3Num);
                                zone3Num.setValue(zone3NumEmployee_thread_23);//sysj/Exercise6.sysj line: 364, column: 5
                                zone7Num.setPresent();//sysj/Exercise6.sysj line: 365, column: 5
                                currsigs.addElement(zone7Num);
                                zone7Num.setValue(zone7NumEmployee_thread_23);//sysj/Exercise6.sysj line: 365, column: 5
                                S7705=7;
                                active[23]=1;
                                ends[23]=1;
                                tdone[23]=1;
                              }
                            }
                          }
                        }
                      }
                      else {
                        System.out.println("Detected employees: " + zone1NumEmployee_thread_23 + " " + zone2NumEmployee_thread_23 + " " + zone3NumEmployee_thread_23 + " " + zone7NumEmployee_thread_23);//sysj/Exercise6.sysj line: 358, column: 5
                        zone1Num.setPresent();//sysj/Exercise6.sysj line: 362, column: 5
                        currsigs.addElement(zone1Num);
                        zone1Num.setValue(zone1NumEmployee_thread_23);//sysj/Exercise6.sysj line: 362, column: 5
                        zone2Num.setPresent();//sysj/Exercise6.sysj line: 363, column: 5
                        currsigs.addElement(zone2Num);
                        zone2Num.setValue(zone2NumEmployee_thread_23);//sysj/Exercise6.sysj line: 363, column: 5
                        zone3Num.setPresent();//sysj/Exercise6.sysj line: 364, column: 5
                        currsigs.addElement(zone3Num);
                        zone3Num.setValue(zone3NumEmployee_thread_23);//sysj/Exercise6.sysj line: 364, column: 5
                        zone7Num.setPresent();//sysj/Exercise6.sysj line: 365, column: 5
                        currsigs.addElement(zone7Num);
                        zone7Num.setValue(zone7NumEmployee_thread_23);//sysj/Exercise6.sysj line: 365, column: 5
                        S7705=7;
                        active[23]=1;
                        ends[23]=1;
                        tdone[23]=1;
                      }
                    }
                    else {
                      active[23]=1;
                      ends[23]=1;
                      tdone[23]=1;
                    }
                  }
                  else {
                    active[23]=1;
                    ends[23]=1;
                    tdone[23]=1;
                  }
                }
                break;
              
            }
            break;
          
          case 7 : 
            S7705=7;
            S7705=0;
            __start_thread_23 = com.systemj.Timer.getMs();//sysj/Exercise6.sysj line: 297, column: 4
            if(com.systemj.Timer.getMs() - __start_thread_23 >= (5) * 1000){//sysj/Exercise6.sysj line: 297, column: 4
              ends[23]=2;
              ;//sysj/Exercise6.sysj line: 297, column: 4
              zone1NumEmployee_thread_23 = 0;//sysj/Exercise6.sysj line: 302, column: 5
              zone2NumEmployee_thread_23 = 0;//sysj/Exercise6.sysj line: 303, column: 5
              zone3NumEmployee_thread_23 = 0;//sysj/Exercise6.sysj line: 304, column: 5
              zone7NumEmployee_thread_23 = 0;//sysj/Exercise6.sysj line: 305, column: 5
              S7705=1;
              S7712=0;
              if(!reqIDLoc_o.isPartnerPresent() || reqIDLoc_o.isPartnerPreempted()){//sysj/Exercise6.sysj line: 307, column: 5
                reqIDLoc_o.setREQ(false);//sysj/Exercise6.sysj line: 307, column: 5
                S7712=1;
                active[23]=1;
                ends[23]=1;
                tdone[23]=1;
              }
              else {
                S7707=0;
                if(reqIDLoc_o.isACK()){//sysj/Exercise6.sysj line: 307, column: 5
                  reqIDLoc_o.setVal("11111");//sysj/Exercise6.sysj line: 307, column: 5
                  S7707=1;
                  if(!reqIDLoc_o.isACK()){//sysj/Exercise6.sysj line: 307, column: 5
                    reqIDLoc_o.setREQ(false);//sysj/Exercise6.sysj line: 307, column: 5
                    ends[23]=2;
                    ;//sysj/Exercise6.sysj line: 307, column: 5
                    S7705=2;
                    S7800=0;
                    if(!idLocation_in.isPartnerPresent() || idLocation_in.isPartnerPreempted()){//sysj/Exercise6.sysj line: 308, column: 5
                      idLocation_in.setACK(false);//sysj/Exercise6.sysj line: 308, column: 5
                      S7800=1;
                      active[23]=1;
                      ends[23]=1;
                      tdone[23]=1;
                    }
                    else {
                      S7795=0;
                      if(!idLocation_in.isREQ()){//sysj/Exercise6.sysj line: 308, column: 5
                        idLocation_in.setACK(true);//sysj/Exercise6.sysj line: 308, column: 5
                        S7795=1;
                        if(idLocation_in.isREQ()){//sysj/Exercise6.sysj line: 308, column: 5
                          idLocation_in.setACK(false);//sysj/Exercise6.sysj line: 308, column: 5
                          ends[23]=2;
                          ;//sysj/Exercise6.sysj line: 308, column: 5
                          zoneLocation_thread_23 = (String)(idLocation_in.getVal() == null ? null : ((String)idLocation_in.getVal()));//sysj/Exercise6.sysj line: 309, column: 5
                          S7705=3;
                          active[23]=1;
                          ends[23]=1;
                          tdone[23]=1;
                        }
                        else {
                          active[23]=1;
                          ends[23]=1;
                          tdone[23]=1;
                        }
                      }
                      else {
                        active[23]=1;
                        ends[23]=1;
                        tdone[23]=1;
                      }
                    }
                  }
                  else {
                    active[23]=1;
                    ends[23]=1;
                    tdone[23]=1;
                  }
                }
                else {
                  active[23]=1;
                  ends[23]=1;
                  tdone[23]=1;
                }
              }
            }
            else {
              active[23]=1;
              ends[23]=1;
              tdone[23]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread10262(int [] tdone, int [] ends){
        switch(S7689){
      case 0 : 
        active[22]=0;
        ends[22]=0;
        tdone[22]=1;
        break;
      
      case 1 : 
        switch(S7605){
          case 0 : 
            switch(S7589){
              case 0 : 
                if(!humanPresence_in.isPartnerPresent() || humanPresence_in.isPartnerPreempted()){//sysj/Exercise6.sysj line: 278, column: 5
                  humanPresence_in.setACK(false);//sysj/Exercise6.sysj line: 278, column: 5
                  S7589=1;
                  active[22]=1;
                  ends[22]=1;
                  tdone[22]=1;
                }
                else {
                  switch(S7584){
                    case 0 : 
                      if(!humanPresence_in.isREQ()){//sysj/Exercise6.sysj line: 278, column: 5
                        humanPresence_in.setACK(true);//sysj/Exercise6.sysj line: 278, column: 5
                        S7584=1;
                        if(humanPresence_in.isREQ()){//sysj/Exercise6.sysj line: 278, column: 5
                          humanPresence_in.setACK(false);//sysj/Exercise6.sysj line: 278, column: 5
                          ends[22]=2;
                          ;//sysj/Exercise6.sysj line: 278, column: 5
                          result_thread_22 = (boolean)(humanPresence_in.getVal() == null ? false : ((Boolean)humanPresence_in.getVal()).booleanValue());//sysj/Exercise6.sysj line: 279, column: 5
                          System.out.println("Infrared sensor trip - emergency off enacted.");//sysj/Exercise6.sysj line: 281, column: 5
                          S7605=1;
                          emergencyOffUI.setPresent();//sysj/Exercise6.sysj line: 285, column: 5
                          currsigs.addElement(emergencyOffUI);
                          active[22]=1;
                          ends[22]=1;
                          tdone[22]=1;
                        }
                        else {
                          active[22]=1;
                          ends[22]=1;
                          tdone[22]=1;
                        }
                      }
                      else {
                        active[22]=1;
                        ends[22]=1;
                        tdone[22]=1;
                      }
                      break;
                    
                    case 1 : 
                      if(humanPresence_in.isREQ()){//sysj/Exercise6.sysj line: 278, column: 5
                        humanPresence_in.setACK(false);//sysj/Exercise6.sysj line: 278, column: 5
                        ends[22]=2;
                        ;//sysj/Exercise6.sysj line: 278, column: 5
                        result_thread_22 = (boolean)(humanPresence_in.getVal() == null ? false : ((Boolean)humanPresence_in.getVal()).booleanValue());//sysj/Exercise6.sysj line: 279, column: 5
                        System.out.println("Infrared sensor trip - emergency off enacted.");//sysj/Exercise6.sysj line: 281, column: 5
                        S7605=1;
                        emergencyOffUI.setPresent();//sysj/Exercise6.sysj line: 285, column: 5
                        currsigs.addElement(emergencyOffUI);
                        active[22]=1;
                        ends[22]=1;
                        tdone[22]=1;
                      }
                      else {
                        active[22]=1;
                        ends[22]=1;
                        tdone[22]=1;
                      }
                      break;
                    
                  }
                }
                break;
              
              case 1 : 
                S7589=1;
                S7589=0;
                if(!humanPresence_in.isPartnerPresent() || humanPresence_in.isPartnerPreempted()){//sysj/Exercise6.sysj line: 278, column: 5
                  humanPresence_in.setACK(false);//sysj/Exercise6.sysj line: 278, column: 5
                  S7589=1;
                  active[22]=1;
                  ends[22]=1;
                  tdone[22]=1;
                }
                else {
                  S7584=0;
                  if(!humanPresence_in.isREQ()){//sysj/Exercise6.sysj line: 278, column: 5
                    humanPresence_in.setACK(true);//sysj/Exercise6.sysj line: 278, column: 5
                    S7584=1;
                    if(humanPresence_in.isREQ()){//sysj/Exercise6.sysj line: 278, column: 5
                      humanPresence_in.setACK(false);//sysj/Exercise6.sysj line: 278, column: 5
                      ends[22]=2;
                      ;//sysj/Exercise6.sysj line: 278, column: 5
                      result_thread_22 = (boolean)(humanPresence_in.getVal() == null ? false : ((Boolean)humanPresence_in.getVal()).booleanValue());//sysj/Exercise6.sysj line: 279, column: 5
                      System.out.println("Infrared sensor trip - emergency off enacted.");//sysj/Exercise6.sysj line: 281, column: 5
                      S7605=1;
                      emergencyOffUI.setPresent();//sysj/Exercise6.sysj line: 285, column: 5
                      currsigs.addElement(emergencyOffUI);
                      active[22]=1;
                      ends[22]=1;
                      tdone[22]=1;
                    }
                    else {
                      active[22]=1;
                      ends[22]=1;
                      tdone[22]=1;
                    }
                  }
                  else {
                    active[22]=1;
                    ends[22]=1;
                    tdone[22]=1;
                  }
                }
                break;
              
            }
            break;
          
          case 1 : 
            emergencyOffUI.setPresent();//sysj/Exercise6.sysj line: 285, column: 5
            currsigs.addElement(emergencyOffUI);
            active[22]=1;
            ends[22]=1;
            tdone[22]=1;
            break;
          
          case 2 : 
            S7605=2;
            S7605=0;
            S7589=0;
            if(!humanPresence_in.isPartnerPresent() || humanPresence_in.isPartnerPreempted()){//sysj/Exercise6.sysj line: 278, column: 5
              humanPresence_in.setACK(false);//sysj/Exercise6.sysj line: 278, column: 5
              S7589=1;
              active[22]=1;
              ends[22]=1;
              tdone[22]=1;
            }
            else {
              S7584=0;
              if(!humanPresence_in.isREQ()){//sysj/Exercise6.sysj line: 278, column: 5
                humanPresence_in.setACK(true);//sysj/Exercise6.sysj line: 278, column: 5
                S7584=1;
                if(humanPresence_in.isREQ()){//sysj/Exercise6.sysj line: 278, column: 5
                  humanPresence_in.setACK(false);//sysj/Exercise6.sysj line: 278, column: 5
                  ends[22]=2;
                  ;//sysj/Exercise6.sysj line: 278, column: 5
                  result_thread_22 = (boolean)(humanPresence_in.getVal() == null ? false : ((Boolean)humanPresence_in.getVal()).booleanValue());//sysj/Exercise6.sysj line: 279, column: 5
                  System.out.println("Infrared sensor trip - emergency off enacted.");//sysj/Exercise6.sysj line: 281, column: 5
                  S7605=1;
                  emergencyOffUI.setPresent();//sysj/Exercise6.sysj line: 285, column: 5
                  currsigs.addElement(emergencyOffUI);
                  active[22]=1;
                  ends[22]=1;
                  tdone[22]=1;
                }
                else {
                  active[22]=1;
                  ends[22]=1;
                  tdone[22]=1;
                }
              }
              else {
                active[22]=1;
                ends[22]=1;
                tdone[22]=1;
              }
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread10261(int [] tdone, int [] ends){
        switch(S7582){
      case 0 : 
        active[21]=0;
        ends[21]=0;
        tdone[21]=1;
        break;
      
      case 1 : 
        switch(S6970){
          case 0 : 
            switch(S6954){
              case 0 : 
                if(!door3CardReader_in.isPartnerPresent() || door3CardReader_in.isPartnerPreempted()){//sysj/Exercise6.sysj line: 260, column: 5
                  door3CardReader_in.setACK(false);//sysj/Exercise6.sysj line: 260, column: 5
                  S6954=1;
                  active[21]=1;
                  ends[21]=1;
                  tdone[21]=1;
                }
                else {
                  switch(S6949){
                    case 0 : 
                      if(!door3CardReader_in.isREQ()){//sysj/Exercise6.sysj line: 260, column: 5
                        door3CardReader_in.setACK(true);//sysj/Exercise6.sysj line: 260, column: 5
                        S6949=1;
                        if(door3CardReader_in.isREQ()){//sysj/Exercise6.sysj line: 260, column: 5
                          door3CardReader_in.setACK(false);//sysj/Exercise6.sysj line: 260, column: 5
                          ends[21]=2;
                          ;//sysj/Exercise6.sysj line: 260, column: 5
                          id_thread_21 = (String)(door3CardReader_in.getVal() == null ? null : ((String)door3CardReader_in.getVal()));//sysj/Exercise6.sysj line: 261, column: 5
                          result_thread_21 = DoorIDDB.authDoorAccess(id_thread_21, "3");//sysj/Exercise6.sysj line: 262, column: 5
                          S6970=1;
                          if(result_thread_21 == true){//sysj/Exercise6.sysj line: 263, column: 9
                            S7017=0;
                            S6977=0;
                            if(!door3Grant_o.isPartnerPresent() || door3Grant_o.isPartnerPreempted()){//sysj/Exercise6.sysj line: 264, column: 6
                              door3Grant_o.setREQ(false);//sysj/Exercise6.sysj line: 264, column: 6
                              S6977=1;
                              active[21]=1;
                              ends[21]=1;
                              tdone[21]=1;
                            }
                            else {
                              S6972=0;
                              if(door3Grant_o.isACK()){//sysj/Exercise6.sysj line: 264, column: 6
                                door3Grant_o.setVal(true);//sysj/Exercise6.sysj line: 264, column: 6
                                S6972=1;
                                if(!door3Grant_o.isACK()){//sysj/Exercise6.sysj line: 264, column: 6
                                  door3Grant_o.setREQ(false);//sysj/Exercise6.sysj line: 264, column: 6
                                  ends[21]=2;
                                  ;//sysj/Exercise6.sysj line: 264, column: 6
                                  door3GrantUI.setPresent();//sysj/Exercise6.sysj line: 265, column: 6
                                  currsigs.addElement(door3GrantUI);
                                  S6970=2;
                                  active[21]=1;
                                  ends[21]=1;
                                  tdone[21]=1;
                                }
                                else {
                                  active[21]=1;
                                  ends[21]=1;
                                  tdone[21]=1;
                                }
                              }
                              else {
                                active[21]=1;
                                ends[21]=1;
                                tdone[21]=1;
                              }
                            }
                          }
                          else {
                            S7017=1;
                            S7000=0;
                            if(!door3Deny_o.isPartnerPresent() || door3Deny_o.isPartnerPreempted()){//sysj/Exercise6.sysj line: 268, column: 6
                              door3Deny_o.setREQ(false);//sysj/Exercise6.sysj line: 268, column: 6
                              S7000=1;
                              active[21]=1;
                              ends[21]=1;
                              tdone[21]=1;
                            }
                            else {
                              S6995=0;
                              if(door3Deny_o.isACK()){//sysj/Exercise6.sysj line: 268, column: 6
                                door3Deny_o.setVal(true);//sysj/Exercise6.sysj line: 268, column: 6
                                S6995=1;
                                if(!door3Deny_o.isACK()){//sysj/Exercise6.sysj line: 268, column: 6
                                  door3Deny_o.setREQ(false);//sysj/Exercise6.sysj line: 268, column: 6
                                  ends[21]=2;
                                  ;//sysj/Exercise6.sysj line: 268, column: 6
                                  door3DenyUI.setPresent();//sysj/Exercise6.sysj line: 269, column: 6
                                  currsigs.addElement(door3DenyUI);
                                  S6970=2;
                                  active[21]=1;
                                  ends[21]=1;
                                  tdone[21]=1;
                                }
                                else {
                                  active[21]=1;
                                  ends[21]=1;
                                  tdone[21]=1;
                                }
                              }
                              else {
                                active[21]=1;
                                ends[21]=1;
                                tdone[21]=1;
                              }
                            }
                          }
                        }
                        else {
                          active[21]=1;
                          ends[21]=1;
                          tdone[21]=1;
                        }
                      }
                      else {
                        active[21]=1;
                        ends[21]=1;
                        tdone[21]=1;
                      }
                      break;
                    
                    case 1 : 
                      if(door3CardReader_in.isREQ()){//sysj/Exercise6.sysj line: 260, column: 5
                        door3CardReader_in.setACK(false);//sysj/Exercise6.sysj line: 260, column: 5
                        ends[21]=2;
                        ;//sysj/Exercise6.sysj line: 260, column: 5
                        id_thread_21 = (String)(door3CardReader_in.getVal() == null ? null : ((String)door3CardReader_in.getVal()));//sysj/Exercise6.sysj line: 261, column: 5
                        result_thread_21 = DoorIDDB.authDoorAccess(id_thread_21, "3");//sysj/Exercise6.sysj line: 262, column: 5
                        S6970=1;
                        if(result_thread_21 == true){//sysj/Exercise6.sysj line: 263, column: 9
                          S7017=0;
                          S6977=0;
                          if(!door3Grant_o.isPartnerPresent() || door3Grant_o.isPartnerPreempted()){//sysj/Exercise6.sysj line: 264, column: 6
                            door3Grant_o.setREQ(false);//sysj/Exercise6.sysj line: 264, column: 6
                            S6977=1;
                            active[21]=1;
                            ends[21]=1;
                            tdone[21]=1;
                          }
                          else {
                            S6972=0;
                            if(door3Grant_o.isACK()){//sysj/Exercise6.sysj line: 264, column: 6
                              door3Grant_o.setVal(true);//sysj/Exercise6.sysj line: 264, column: 6
                              S6972=1;
                              if(!door3Grant_o.isACK()){//sysj/Exercise6.sysj line: 264, column: 6
                                door3Grant_o.setREQ(false);//sysj/Exercise6.sysj line: 264, column: 6
                                ends[21]=2;
                                ;//sysj/Exercise6.sysj line: 264, column: 6
                                door3GrantUI.setPresent();//sysj/Exercise6.sysj line: 265, column: 6
                                currsigs.addElement(door3GrantUI);
                                S6970=2;
                                active[21]=1;
                                ends[21]=1;
                                tdone[21]=1;
                              }
                              else {
                                active[21]=1;
                                ends[21]=1;
                                tdone[21]=1;
                              }
                            }
                            else {
                              active[21]=1;
                              ends[21]=1;
                              tdone[21]=1;
                            }
                          }
                        }
                        else {
                          S7017=1;
                          S7000=0;
                          if(!door3Deny_o.isPartnerPresent() || door3Deny_o.isPartnerPreempted()){//sysj/Exercise6.sysj line: 268, column: 6
                            door3Deny_o.setREQ(false);//sysj/Exercise6.sysj line: 268, column: 6
                            S7000=1;
                            active[21]=1;
                            ends[21]=1;
                            tdone[21]=1;
                          }
                          else {
                            S6995=0;
                            if(door3Deny_o.isACK()){//sysj/Exercise6.sysj line: 268, column: 6
                              door3Deny_o.setVal(true);//sysj/Exercise6.sysj line: 268, column: 6
                              S6995=1;
                              if(!door3Deny_o.isACK()){//sysj/Exercise6.sysj line: 268, column: 6
                                door3Deny_o.setREQ(false);//sysj/Exercise6.sysj line: 268, column: 6
                                ends[21]=2;
                                ;//sysj/Exercise6.sysj line: 268, column: 6
                                door3DenyUI.setPresent();//sysj/Exercise6.sysj line: 269, column: 6
                                currsigs.addElement(door3DenyUI);
                                S6970=2;
                                active[21]=1;
                                ends[21]=1;
                                tdone[21]=1;
                              }
                              else {
                                active[21]=1;
                                ends[21]=1;
                                tdone[21]=1;
                              }
                            }
                            else {
                              active[21]=1;
                              ends[21]=1;
                              tdone[21]=1;
                            }
                          }
                        }
                      }
                      else {
                        active[21]=1;
                        ends[21]=1;
                        tdone[21]=1;
                      }
                      break;
                    
                  }
                }
                break;
              
              case 1 : 
                S6954=1;
                S6954=0;
                if(!door3CardReader_in.isPartnerPresent() || door3CardReader_in.isPartnerPreempted()){//sysj/Exercise6.sysj line: 260, column: 5
                  door3CardReader_in.setACK(false);//sysj/Exercise6.sysj line: 260, column: 5
                  S6954=1;
                  active[21]=1;
                  ends[21]=1;
                  tdone[21]=1;
                }
                else {
                  S6949=0;
                  if(!door3CardReader_in.isREQ()){//sysj/Exercise6.sysj line: 260, column: 5
                    door3CardReader_in.setACK(true);//sysj/Exercise6.sysj line: 260, column: 5
                    S6949=1;
                    if(door3CardReader_in.isREQ()){//sysj/Exercise6.sysj line: 260, column: 5
                      door3CardReader_in.setACK(false);//sysj/Exercise6.sysj line: 260, column: 5
                      ends[21]=2;
                      ;//sysj/Exercise6.sysj line: 260, column: 5
                      id_thread_21 = (String)(door3CardReader_in.getVal() == null ? null : ((String)door3CardReader_in.getVal()));//sysj/Exercise6.sysj line: 261, column: 5
                      result_thread_21 = DoorIDDB.authDoorAccess(id_thread_21, "3");//sysj/Exercise6.sysj line: 262, column: 5
                      S6970=1;
                      if(result_thread_21 == true){//sysj/Exercise6.sysj line: 263, column: 9
                        S7017=0;
                        S6977=0;
                        if(!door3Grant_o.isPartnerPresent() || door3Grant_o.isPartnerPreempted()){//sysj/Exercise6.sysj line: 264, column: 6
                          door3Grant_o.setREQ(false);//sysj/Exercise6.sysj line: 264, column: 6
                          S6977=1;
                          active[21]=1;
                          ends[21]=1;
                          tdone[21]=1;
                        }
                        else {
                          S6972=0;
                          if(door3Grant_o.isACK()){//sysj/Exercise6.sysj line: 264, column: 6
                            door3Grant_o.setVal(true);//sysj/Exercise6.sysj line: 264, column: 6
                            S6972=1;
                            if(!door3Grant_o.isACK()){//sysj/Exercise6.sysj line: 264, column: 6
                              door3Grant_o.setREQ(false);//sysj/Exercise6.sysj line: 264, column: 6
                              ends[21]=2;
                              ;//sysj/Exercise6.sysj line: 264, column: 6
                              door3GrantUI.setPresent();//sysj/Exercise6.sysj line: 265, column: 6
                              currsigs.addElement(door3GrantUI);
                              S6970=2;
                              active[21]=1;
                              ends[21]=1;
                              tdone[21]=1;
                            }
                            else {
                              active[21]=1;
                              ends[21]=1;
                              tdone[21]=1;
                            }
                          }
                          else {
                            active[21]=1;
                            ends[21]=1;
                            tdone[21]=1;
                          }
                        }
                      }
                      else {
                        S7017=1;
                        S7000=0;
                        if(!door3Deny_o.isPartnerPresent() || door3Deny_o.isPartnerPreempted()){//sysj/Exercise6.sysj line: 268, column: 6
                          door3Deny_o.setREQ(false);//sysj/Exercise6.sysj line: 268, column: 6
                          S7000=1;
                          active[21]=1;
                          ends[21]=1;
                          tdone[21]=1;
                        }
                        else {
                          S6995=0;
                          if(door3Deny_o.isACK()){//sysj/Exercise6.sysj line: 268, column: 6
                            door3Deny_o.setVal(true);//sysj/Exercise6.sysj line: 268, column: 6
                            S6995=1;
                            if(!door3Deny_o.isACK()){//sysj/Exercise6.sysj line: 268, column: 6
                              door3Deny_o.setREQ(false);//sysj/Exercise6.sysj line: 268, column: 6
                              ends[21]=2;
                              ;//sysj/Exercise6.sysj line: 268, column: 6
                              door3DenyUI.setPresent();//sysj/Exercise6.sysj line: 269, column: 6
                              currsigs.addElement(door3DenyUI);
                              S6970=2;
                              active[21]=1;
                              ends[21]=1;
                              tdone[21]=1;
                            }
                            else {
                              active[21]=1;
                              ends[21]=1;
                              tdone[21]=1;
                            }
                          }
                          else {
                            active[21]=1;
                            ends[21]=1;
                            tdone[21]=1;
                          }
                        }
                      }
                    }
                    else {
                      active[21]=1;
                      ends[21]=1;
                      tdone[21]=1;
                    }
                  }
                  else {
                    active[21]=1;
                    ends[21]=1;
                    tdone[21]=1;
                  }
                }
                break;
              
            }
            break;
          
          case 1 : 
            switch(S7017){
              case 0 : 
                switch(S6977){
                  case 0 : 
                    if(!door3Grant_o.isPartnerPresent() || door3Grant_o.isPartnerPreempted()){//sysj/Exercise6.sysj line: 264, column: 6
                      door3Grant_o.setREQ(false);//sysj/Exercise6.sysj line: 264, column: 6
                      S6977=1;
                      active[21]=1;
                      ends[21]=1;
                      tdone[21]=1;
                    }
                    else {
                      switch(S6972){
                        case 0 : 
                          if(door3Grant_o.isACK()){//sysj/Exercise6.sysj line: 264, column: 6
                            door3Grant_o.setVal(true);//sysj/Exercise6.sysj line: 264, column: 6
                            S6972=1;
                            if(!door3Grant_o.isACK()){//sysj/Exercise6.sysj line: 264, column: 6
                              door3Grant_o.setREQ(false);//sysj/Exercise6.sysj line: 264, column: 6
                              ends[21]=2;
                              ;//sysj/Exercise6.sysj line: 264, column: 6
                              door3GrantUI.setPresent();//sysj/Exercise6.sysj line: 265, column: 6
                              currsigs.addElement(door3GrantUI);
                              S6970=2;
                              active[21]=1;
                              ends[21]=1;
                              tdone[21]=1;
                            }
                            else {
                              active[21]=1;
                              ends[21]=1;
                              tdone[21]=1;
                            }
                          }
                          else {
                            active[21]=1;
                            ends[21]=1;
                            tdone[21]=1;
                          }
                          break;
                        
                        case 1 : 
                          if(!door3Grant_o.isACK()){//sysj/Exercise6.sysj line: 264, column: 6
                            door3Grant_o.setREQ(false);//sysj/Exercise6.sysj line: 264, column: 6
                            ends[21]=2;
                            ;//sysj/Exercise6.sysj line: 264, column: 6
                            door3GrantUI.setPresent();//sysj/Exercise6.sysj line: 265, column: 6
                            currsigs.addElement(door3GrantUI);
                            S6970=2;
                            active[21]=1;
                            ends[21]=1;
                            tdone[21]=1;
                          }
                          else {
                            active[21]=1;
                            ends[21]=1;
                            tdone[21]=1;
                          }
                          break;
                        
                      }
                    }
                    break;
                  
                  case 1 : 
                    S6977=1;
                    S6977=0;
                    if(!door3Grant_o.isPartnerPresent() || door3Grant_o.isPartnerPreempted()){//sysj/Exercise6.sysj line: 264, column: 6
                      door3Grant_o.setREQ(false);//sysj/Exercise6.sysj line: 264, column: 6
                      S6977=1;
                      active[21]=1;
                      ends[21]=1;
                      tdone[21]=1;
                    }
                    else {
                      S6972=0;
                      if(door3Grant_o.isACK()){//sysj/Exercise6.sysj line: 264, column: 6
                        door3Grant_o.setVal(true);//sysj/Exercise6.sysj line: 264, column: 6
                        S6972=1;
                        if(!door3Grant_o.isACK()){//sysj/Exercise6.sysj line: 264, column: 6
                          door3Grant_o.setREQ(false);//sysj/Exercise6.sysj line: 264, column: 6
                          ends[21]=2;
                          ;//sysj/Exercise6.sysj line: 264, column: 6
                          door3GrantUI.setPresent();//sysj/Exercise6.sysj line: 265, column: 6
                          currsigs.addElement(door3GrantUI);
                          S6970=2;
                          active[21]=1;
                          ends[21]=1;
                          tdone[21]=1;
                        }
                        else {
                          active[21]=1;
                          ends[21]=1;
                          tdone[21]=1;
                        }
                      }
                      else {
                        active[21]=1;
                        ends[21]=1;
                        tdone[21]=1;
                      }
                    }
                    break;
                  
                }
                break;
              
              case 1 : 
                switch(S7000){
                  case 0 : 
                    if(!door3Deny_o.isPartnerPresent() || door3Deny_o.isPartnerPreempted()){//sysj/Exercise6.sysj line: 268, column: 6
                      door3Deny_o.setREQ(false);//sysj/Exercise6.sysj line: 268, column: 6
                      S7000=1;
                      active[21]=1;
                      ends[21]=1;
                      tdone[21]=1;
                    }
                    else {
                      switch(S6995){
                        case 0 : 
                          if(door3Deny_o.isACK()){//sysj/Exercise6.sysj line: 268, column: 6
                            door3Deny_o.setVal(true);//sysj/Exercise6.sysj line: 268, column: 6
                            S6995=1;
                            if(!door3Deny_o.isACK()){//sysj/Exercise6.sysj line: 268, column: 6
                              door3Deny_o.setREQ(false);//sysj/Exercise6.sysj line: 268, column: 6
                              ends[21]=2;
                              ;//sysj/Exercise6.sysj line: 268, column: 6
                              door3DenyUI.setPresent();//sysj/Exercise6.sysj line: 269, column: 6
                              currsigs.addElement(door3DenyUI);
                              S6970=2;
                              active[21]=1;
                              ends[21]=1;
                              tdone[21]=1;
                            }
                            else {
                              active[21]=1;
                              ends[21]=1;
                              tdone[21]=1;
                            }
                          }
                          else {
                            active[21]=1;
                            ends[21]=1;
                            tdone[21]=1;
                          }
                          break;
                        
                        case 1 : 
                          if(!door3Deny_o.isACK()){//sysj/Exercise6.sysj line: 268, column: 6
                            door3Deny_o.setREQ(false);//sysj/Exercise6.sysj line: 268, column: 6
                            ends[21]=2;
                            ;//sysj/Exercise6.sysj line: 268, column: 6
                            door3DenyUI.setPresent();//sysj/Exercise6.sysj line: 269, column: 6
                            currsigs.addElement(door3DenyUI);
                            S6970=2;
                            active[21]=1;
                            ends[21]=1;
                            tdone[21]=1;
                          }
                          else {
                            active[21]=1;
                            ends[21]=1;
                            tdone[21]=1;
                          }
                          break;
                        
                      }
                    }
                    break;
                  
                  case 1 : 
                    S7000=1;
                    S7000=0;
                    if(!door3Deny_o.isPartnerPresent() || door3Deny_o.isPartnerPreempted()){//sysj/Exercise6.sysj line: 268, column: 6
                      door3Deny_o.setREQ(false);//sysj/Exercise6.sysj line: 268, column: 6
                      S7000=1;
                      active[21]=1;
                      ends[21]=1;
                      tdone[21]=1;
                    }
                    else {
                      S6995=0;
                      if(door3Deny_o.isACK()){//sysj/Exercise6.sysj line: 268, column: 6
                        door3Deny_o.setVal(true);//sysj/Exercise6.sysj line: 268, column: 6
                        S6995=1;
                        if(!door3Deny_o.isACK()){//sysj/Exercise6.sysj line: 268, column: 6
                          door3Deny_o.setREQ(false);//sysj/Exercise6.sysj line: 268, column: 6
                          ends[21]=2;
                          ;//sysj/Exercise6.sysj line: 268, column: 6
                          door3DenyUI.setPresent();//sysj/Exercise6.sysj line: 269, column: 6
                          currsigs.addElement(door3DenyUI);
                          S6970=2;
                          active[21]=1;
                          ends[21]=1;
                          tdone[21]=1;
                        }
                        else {
                          active[21]=1;
                          ends[21]=1;
                          tdone[21]=1;
                        }
                      }
                      else {
                        active[21]=1;
                        ends[21]=1;
                        tdone[21]=1;
                      }
                    }
                    break;
                  
                }
                break;
              
            }
            break;
          
          case 2 : 
            S6970=2;
            S6970=0;
            S6954=0;
            if(!door3CardReader_in.isPartnerPresent() || door3CardReader_in.isPartnerPreempted()){//sysj/Exercise6.sysj line: 260, column: 5
              door3CardReader_in.setACK(false);//sysj/Exercise6.sysj line: 260, column: 5
              S6954=1;
              active[21]=1;
              ends[21]=1;
              tdone[21]=1;
            }
            else {
              S6949=0;
              if(!door3CardReader_in.isREQ()){//sysj/Exercise6.sysj line: 260, column: 5
                door3CardReader_in.setACK(true);//sysj/Exercise6.sysj line: 260, column: 5
                S6949=1;
                if(door3CardReader_in.isREQ()){//sysj/Exercise6.sysj line: 260, column: 5
                  door3CardReader_in.setACK(false);//sysj/Exercise6.sysj line: 260, column: 5
                  ends[21]=2;
                  ;//sysj/Exercise6.sysj line: 260, column: 5
                  id_thread_21 = (String)(door3CardReader_in.getVal() == null ? null : ((String)door3CardReader_in.getVal()));//sysj/Exercise6.sysj line: 261, column: 5
                  result_thread_21 = DoorIDDB.authDoorAccess(id_thread_21, "3");//sysj/Exercise6.sysj line: 262, column: 5
                  S6970=1;
                  if(result_thread_21 == true){//sysj/Exercise6.sysj line: 263, column: 9
                    S7017=0;
                    S6977=0;
                    if(!door3Grant_o.isPartnerPresent() || door3Grant_o.isPartnerPreempted()){//sysj/Exercise6.sysj line: 264, column: 6
                      door3Grant_o.setREQ(false);//sysj/Exercise6.sysj line: 264, column: 6
                      S6977=1;
                      active[21]=1;
                      ends[21]=1;
                      tdone[21]=1;
                    }
                    else {
                      S6972=0;
                      if(door3Grant_o.isACK()){//sysj/Exercise6.sysj line: 264, column: 6
                        door3Grant_o.setVal(true);//sysj/Exercise6.sysj line: 264, column: 6
                        S6972=1;
                        if(!door3Grant_o.isACK()){//sysj/Exercise6.sysj line: 264, column: 6
                          door3Grant_o.setREQ(false);//sysj/Exercise6.sysj line: 264, column: 6
                          ends[21]=2;
                          ;//sysj/Exercise6.sysj line: 264, column: 6
                          door3GrantUI.setPresent();//sysj/Exercise6.sysj line: 265, column: 6
                          currsigs.addElement(door3GrantUI);
                          S6970=2;
                          active[21]=1;
                          ends[21]=1;
                          tdone[21]=1;
                        }
                        else {
                          active[21]=1;
                          ends[21]=1;
                          tdone[21]=1;
                        }
                      }
                      else {
                        active[21]=1;
                        ends[21]=1;
                        tdone[21]=1;
                      }
                    }
                  }
                  else {
                    S7017=1;
                    S7000=0;
                    if(!door3Deny_o.isPartnerPresent() || door3Deny_o.isPartnerPreempted()){//sysj/Exercise6.sysj line: 268, column: 6
                      door3Deny_o.setREQ(false);//sysj/Exercise6.sysj line: 268, column: 6
                      S7000=1;
                      active[21]=1;
                      ends[21]=1;
                      tdone[21]=1;
                    }
                    else {
                      S6995=0;
                      if(door3Deny_o.isACK()){//sysj/Exercise6.sysj line: 268, column: 6
                        door3Deny_o.setVal(true);//sysj/Exercise6.sysj line: 268, column: 6
                        S6995=1;
                        if(!door3Deny_o.isACK()){//sysj/Exercise6.sysj line: 268, column: 6
                          door3Deny_o.setREQ(false);//sysj/Exercise6.sysj line: 268, column: 6
                          ends[21]=2;
                          ;//sysj/Exercise6.sysj line: 268, column: 6
                          door3DenyUI.setPresent();//sysj/Exercise6.sysj line: 269, column: 6
                          currsigs.addElement(door3DenyUI);
                          S6970=2;
                          active[21]=1;
                          ends[21]=1;
                          tdone[21]=1;
                        }
                        else {
                          active[21]=1;
                          ends[21]=1;
                          tdone[21]=1;
                        }
                      }
                      else {
                        active[21]=1;
                        ends[21]=1;
                        tdone[21]=1;
                      }
                    }
                  }
                }
                else {
                  active[21]=1;
                  ends[21]=1;
                  tdone[21]=1;
                }
              }
              else {
                active[21]=1;
                ends[21]=1;
                tdone[21]=1;
              }
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread10260(int [] tdone, int [] ends){
        switch(S6947){
      case 0 : 
        active[20]=0;
        ends[20]=0;
        tdone[20]=1;
        break;
      
      case 1 : 
        switch(S6335){
          case 0 : 
            switch(S6319){
              case 0 : 
                if(!door2CardReader_in.isPartnerPresent() || door2CardReader_in.isPartnerPreempted()){//sysj/Exercise6.sysj line: 242, column: 5
                  door2CardReader_in.setACK(false);//sysj/Exercise6.sysj line: 242, column: 5
                  S6319=1;
                  active[20]=1;
                  ends[20]=1;
                  tdone[20]=1;
                }
                else {
                  switch(S6314){
                    case 0 : 
                      if(!door2CardReader_in.isREQ()){//sysj/Exercise6.sysj line: 242, column: 5
                        door2CardReader_in.setACK(true);//sysj/Exercise6.sysj line: 242, column: 5
                        S6314=1;
                        if(door2CardReader_in.isREQ()){//sysj/Exercise6.sysj line: 242, column: 5
                          door2CardReader_in.setACK(false);//sysj/Exercise6.sysj line: 242, column: 5
                          ends[20]=2;
                          ;//sysj/Exercise6.sysj line: 242, column: 5
                          id_thread_20 = (String)(door2CardReader_in.getVal() == null ? null : ((String)door2CardReader_in.getVal()));//sysj/Exercise6.sysj line: 243, column: 5
                          result_thread_20 = DoorIDDB.authDoorAccess(id_thread_20, "2");//sysj/Exercise6.sysj line: 244, column: 5
                          S6335=1;
                          if(result_thread_20 == true){//sysj/Exercise6.sysj line: 245, column: 9
                            S6382=0;
                            S6342=0;
                            if(!door2Grant_o.isPartnerPresent() || door2Grant_o.isPartnerPreempted()){//sysj/Exercise6.sysj line: 246, column: 6
                              door2Grant_o.setREQ(false);//sysj/Exercise6.sysj line: 246, column: 6
                              S6342=1;
                              active[20]=1;
                              ends[20]=1;
                              tdone[20]=1;
                            }
                            else {
                              S6337=0;
                              if(door2Grant_o.isACK()){//sysj/Exercise6.sysj line: 246, column: 6
                                door2Grant_o.setVal(true);//sysj/Exercise6.sysj line: 246, column: 6
                                S6337=1;
                                if(!door2Grant_o.isACK()){//sysj/Exercise6.sysj line: 246, column: 6
                                  door2Grant_o.setREQ(false);//sysj/Exercise6.sysj line: 246, column: 6
                                  ends[20]=2;
                                  ;//sysj/Exercise6.sysj line: 246, column: 6
                                  door2GrantUI.setPresent();//sysj/Exercise6.sysj line: 247, column: 6
                                  currsigs.addElement(door2GrantUI);
                                  S6335=2;
                                  active[20]=1;
                                  ends[20]=1;
                                  tdone[20]=1;
                                }
                                else {
                                  active[20]=1;
                                  ends[20]=1;
                                  tdone[20]=1;
                                }
                              }
                              else {
                                active[20]=1;
                                ends[20]=1;
                                tdone[20]=1;
                              }
                            }
                          }
                          else {
                            S6382=1;
                            S6365=0;
                            if(!door2Deny_o.isPartnerPresent() || door2Deny_o.isPartnerPreempted()){//sysj/Exercise6.sysj line: 250, column: 6
                              door2Deny_o.setREQ(false);//sysj/Exercise6.sysj line: 250, column: 6
                              S6365=1;
                              active[20]=1;
                              ends[20]=1;
                              tdone[20]=1;
                            }
                            else {
                              S6360=0;
                              if(door2Deny_o.isACK()){//sysj/Exercise6.sysj line: 250, column: 6
                                door2Deny_o.setVal(true);//sysj/Exercise6.sysj line: 250, column: 6
                                S6360=1;
                                if(!door2Deny_o.isACK()){//sysj/Exercise6.sysj line: 250, column: 6
                                  door2Deny_o.setREQ(false);//sysj/Exercise6.sysj line: 250, column: 6
                                  ends[20]=2;
                                  ;//sysj/Exercise6.sysj line: 250, column: 6
                                  door2DenyUI.setPresent();//sysj/Exercise6.sysj line: 251, column: 6
                                  currsigs.addElement(door2DenyUI);
                                  S6335=2;
                                  active[20]=1;
                                  ends[20]=1;
                                  tdone[20]=1;
                                }
                                else {
                                  active[20]=1;
                                  ends[20]=1;
                                  tdone[20]=1;
                                }
                              }
                              else {
                                active[20]=1;
                                ends[20]=1;
                                tdone[20]=1;
                              }
                            }
                          }
                        }
                        else {
                          active[20]=1;
                          ends[20]=1;
                          tdone[20]=1;
                        }
                      }
                      else {
                        active[20]=1;
                        ends[20]=1;
                        tdone[20]=1;
                      }
                      break;
                    
                    case 1 : 
                      if(door2CardReader_in.isREQ()){//sysj/Exercise6.sysj line: 242, column: 5
                        door2CardReader_in.setACK(false);//sysj/Exercise6.sysj line: 242, column: 5
                        ends[20]=2;
                        ;//sysj/Exercise6.sysj line: 242, column: 5
                        id_thread_20 = (String)(door2CardReader_in.getVal() == null ? null : ((String)door2CardReader_in.getVal()));//sysj/Exercise6.sysj line: 243, column: 5
                        result_thread_20 = DoorIDDB.authDoorAccess(id_thread_20, "2");//sysj/Exercise6.sysj line: 244, column: 5
                        S6335=1;
                        if(result_thread_20 == true){//sysj/Exercise6.sysj line: 245, column: 9
                          S6382=0;
                          S6342=0;
                          if(!door2Grant_o.isPartnerPresent() || door2Grant_o.isPartnerPreempted()){//sysj/Exercise6.sysj line: 246, column: 6
                            door2Grant_o.setREQ(false);//sysj/Exercise6.sysj line: 246, column: 6
                            S6342=1;
                            active[20]=1;
                            ends[20]=1;
                            tdone[20]=1;
                          }
                          else {
                            S6337=0;
                            if(door2Grant_o.isACK()){//sysj/Exercise6.sysj line: 246, column: 6
                              door2Grant_o.setVal(true);//sysj/Exercise6.sysj line: 246, column: 6
                              S6337=1;
                              if(!door2Grant_o.isACK()){//sysj/Exercise6.sysj line: 246, column: 6
                                door2Grant_o.setREQ(false);//sysj/Exercise6.sysj line: 246, column: 6
                                ends[20]=2;
                                ;//sysj/Exercise6.sysj line: 246, column: 6
                                door2GrantUI.setPresent();//sysj/Exercise6.sysj line: 247, column: 6
                                currsigs.addElement(door2GrantUI);
                                S6335=2;
                                active[20]=1;
                                ends[20]=1;
                                tdone[20]=1;
                              }
                              else {
                                active[20]=1;
                                ends[20]=1;
                                tdone[20]=1;
                              }
                            }
                            else {
                              active[20]=1;
                              ends[20]=1;
                              tdone[20]=1;
                            }
                          }
                        }
                        else {
                          S6382=1;
                          S6365=0;
                          if(!door2Deny_o.isPartnerPresent() || door2Deny_o.isPartnerPreempted()){//sysj/Exercise6.sysj line: 250, column: 6
                            door2Deny_o.setREQ(false);//sysj/Exercise6.sysj line: 250, column: 6
                            S6365=1;
                            active[20]=1;
                            ends[20]=1;
                            tdone[20]=1;
                          }
                          else {
                            S6360=0;
                            if(door2Deny_o.isACK()){//sysj/Exercise6.sysj line: 250, column: 6
                              door2Deny_o.setVal(true);//sysj/Exercise6.sysj line: 250, column: 6
                              S6360=1;
                              if(!door2Deny_o.isACK()){//sysj/Exercise6.sysj line: 250, column: 6
                                door2Deny_o.setREQ(false);//sysj/Exercise6.sysj line: 250, column: 6
                                ends[20]=2;
                                ;//sysj/Exercise6.sysj line: 250, column: 6
                                door2DenyUI.setPresent();//sysj/Exercise6.sysj line: 251, column: 6
                                currsigs.addElement(door2DenyUI);
                                S6335=2;
                                active[20]=1;
                                ends[20]=1;
                                tdone[20]=1;
                              }
                              else {
                                active[20]=1;
                                ends[20]=1;
                                tdone[20]=1;
                              }
                            }
                            else {
                              active[20]=1;
                              ends[20]=1;
                              tdone[20]=1;
                            }
                          }
                        }
                      }
                      else {
                        active[20]=1;
                        ends[20]=1;
                        tdone[20]=1;
                      }
                      break;
                    
                  }
                }
                break;
              
              case 1 : 
                S6319=1;
                S6319=0;
                if(!door2CardReader_in.isPartnerPresent() || door2CardReader_in.isPartnerPreempted()){//sysj/Exercise6.sysj line: 242, column: 5
                  door2CardReader_in.setACK(false);//sysj/Exercise6.sysj line: 242, column: 5
                  S6319=1;
                  active[20]=1;
                  ends[20]=1;
                  tdone[20]=1;
                }
                else {
                  S6314=0;
                  if(!door2CardReader_in.isREQ()){//sysj/Exercise6.sysj line: 242, column: 5
                    door2CardReader_in.setACK(true);//sysj/Exercise6.sysj line: 242, column: 5
                    S6314=1;
                    if(door2CardReader_in.isREQ()){//sysj/Exercise6.sysj line: 242, column: 5
                      door2CardReader_in.setACK(false);//sysj/Exercise6.sysj line: 242, column: 5
                      ends[20]=2;
                      ;//sysj/Exercise6.sysj line: 242, column: 5
                      id_thread_20 = (String)(door2CardReader_in.getVal() == null ? null : ((String)door2CardReader_in.getVal()));//sysj/Exercise6.sysj line: 243, column: 5
                      result_thread_20 = DoorIDDB.authDoorAccess(id_thread_20, "2");//sysj/Exercise6.sysj line: 244, column: 5
                      S6335=1;
                      if(result_thread_20 == true){//sysj/Exercise6.sysj line: 245, column: 9
                        S6382=0;
                        S6342=0;
                        if(!door2Grant_o.isPartnerPresent() || door2Grant_o.isPartnerPreempted()){//sysj/Exercise6.sysj line: 246, column: 6
                          door2Grant_o.setREQ(false);//sysj/Exercise6.sysj line: 246, column: 6
                          S6342=1;
                          active[20]=1;
                          ends[20]=1;
                          tdone[20]=1;
                        }
                        else {
                          S6337=0;
                          if(door2Grant_o.isACK()){//sysj/Exercise6.sysj line: 246, column: 6
                            door2Grant_o.setVal(true);//sysj/Exercise6.sysj line: 246, column: 6
                            S6337=1;
                            if(!door2Grant_o.isACK()){//sysj/Exercise6.sysj line: 246, column: 6
                              door2Grant_o.setREQ(false);//sysj/Exercise6.sysj line: 246, column: 6
                              ends[20]=2;
                              ;//sysj/Exercise6.sysj line: 246, column: 6
                              door2GrantUI.setPresent();//sysj/Exercise6.sysj line: 247, column: 6
                              currsigs.addElement(door2GrantUI);
                              S6335=2;
                              active[20]=1;
                              ends[20]=1;
                              tdone[20]=1;
                            }
                            else {
                              active[20]=1;
                              ends[20]=1;
                              tdone[20]=1;
                            }
                          }
                          else {
                            active[20]=1;
                            ends[20]=1;
                            tdone[20]=1;
                          }
                        }
                      }
                      else {
                        S6382=1;
                        S6365=0;
                        if(!door2Deny_o.isPartnerPresent() || door2Deny_o.isPartnerPreempted()){//sysj/Exercise6.sysj line: 250, column: 6
                          door2Deny_o.setREQ(false);//sysj/Exercise6.sysj line: 250, column: 6
                          S6365=1;
                          active[20]=1;
                          ends[20]=1;
                          tdone[20]=1;
                        }
                        else {
                          S6360=0;
                          if(door2Deny_o.isACK()){//sysj/Exercise6.sysj line: 250, column: 6
                            door2Deny_o.setVal(true);//sysj/Exercise6.sysj line: 250, column: 6
                            S6360=1;
                            if(!door2Deny_o.isACK()){//sysj/Exercise6.sysj line: 250, column: 6
                              door2Deny_o.setREQ(false);//sysj/Exercise6.sysj line: 250, column: 6
                              ends[20]=2;
                              ;//sysj/Exercise6.sysj line: 250, column: 6
                              door2DenyUI.setPresent();//sysj/Exercise6.sysj line: 251, column: 6
                              currsigs.addElement(door2DenyUI);
                              S6335=2;
                              active[20]=1;
                              ends[20]=1;
                              tdone[20]=1;
                            }
                            else {
                              active[20]=1;
                              ends[20]=1;
                              tdone[20]=1;
                            }
                          }
                          else {
                            active[20]=1;
                            ends[20]=1;
                            tdone[20]=1;
                          }
                        }
                      }
                    }
                    else {
                      active[20]=1;
                      ends[20]=1;
                      tdone[20]=1;
                    }
                  }
                  else {
                    active[20]=1;
                    ends[20]=1;
                    tdone[20]=1;
                  }
                }
                break;
              
            }
            break;
          
          case 1 : 
            switch(S6382){
              case 0 : 
                switch(S6342){
                  case 0 : 
                    if(!door2Grant_o.isPartnerPresent() || door2Grant_o.isPartnerPreempted()){//sysj/Exercise6.sysj line: 246, column: 6
                      door2Grant_o.setREQ(false);//sysj/Exercise6.sysj line: 246, column: 6
                      S6342=1;
                      active[20]=1;
                      ends[20]=1;
                      tdone[20]=1;
                    }
                    else {
                      switch(S6337){
                        case 0 : 
                          if(door2Grant_o.isACK()){//sysj/Exercise6.sysj line: 246, column: 6
                            door2Grant_o.setVal(true);//sysj/Exercise6.sysj line: 246, column: 6
                            S6337=1;
                            if(!door2Grant_o.isACK()){//sysj/Exercise6.sysj line: 246, column: 6
                              door2Grant_o.setREQ(false);//sysj/Exercise6.sysj line: 246, column: 6
                              ends[20]=2;
                              ;//sysj/Exercise6.sysj line: 246, column: 6
                              door2GrantUI.setPresent();//sysj/Exercise6.sysj line: 247, column: 6
                              currsigs.addElement(door2GrantUI);
                              S6335=2;
                              active[20]=1;
                              ends[20]=1;
                              tdone[20]=1;
                            }
                            else {
                              active[20]=1;
                              ends[20]=1;
                              tdone[20]=1;
                            }
                          }
                          else {
                            active[20]=1;
                            ends[20]=1;
                            tdone[20]=1;
                          }
                          break;
                        
                        case 1 : 
                          if(!door2Grant_o.isACK()){//sysj/Exercise6.sysj line: 246, column: 6
                            door2Grant_o.setREQ(false);//sysj/Exercise6.sysj line: 246, column: 6
                            ends[20]=2;
                            ;//sysj/Exercise6.sysj line: 246, column: 6
                            door2GrantUI.setPresent();//sysj/Exercise6.sysj line: 247, column: 6
                            currsigs.addElement(door2GrantUI);
                            S6335=2;
                            active[20]=1;
                            ends[20]=1;
                            tdone[20]=1;
                          }
                          else {
                            active[20]=1;
                            ends[20]=1;
                            tdone[20]=1;
                          }
                          break;
                        
                      }
                    }
                    break;
                  
                  case 1 : 
                    S6342=1;
                    S6342=0;
                    if(!door2Grant_o.isPartnerPresent() || door2Grant_o.isPartnerPreempted()){//sysj/Exercise6.sysj line: 246, column: 6
                      door2Grant_o.setREQ(false);//sysj/Exercise6.sysj line: 246, column: 6
                      S6342=1;
                      active[20]=1;
                      ends[20]=1;
                      tdone[20]=1;
                    }
                    else {
                      S6337=0;
                      if(door2Grant_o.isACK()){//sysj/Exercise6.sysj line: 246, column: 6
                        door2Grant_o.setVal(true);//sysj/Exercise6.sysj line: 246, column: 6
                        S6337=1;
                        if(!door2Grant_o.isACK()){//sysj/Exercise6.sysj line: 246, column: 6
                          door2Grant_o.setREQ(false);//sysj/Exercise6.sysj line: 246, column: 6
                          ends[20]=2;
                          ;//sysj/Exercise6.sysj line: 246, column: 6
                          door2GrantUI.setPresent();//sysj/Exercise6.sysj line: 247, column: 6
                          currsigs.addElement(door2GrantUI);
                          S6335=2;
                          active[20]=1;
                          ends[20]=1;
                          tdone[20]=1;
                        }
                        else {
                          active[20]=1;
                          ends[20]=1;
                          tdone[20]=1;
                        }
                      }
                      else {
                        active[20]=1;
                        ends[20]=1;
                        tdone[20]=1;
                      }
                    }
                    break;
                  
                }
                break;
              
              case 1 : 
                switch(S6365){
                  case 0 : 
                    if(!door2Deny_o.isPartnerPresent() || door2Deny_o.isPartnerPreempted()){//sysj/Exercise6.sysj line: 250, column: 6
                      door2Deny_o.setREQ(false);//sysj/Exercise6.sysj line: 250, column: 6
                      S6365=1;
                      active[20]=1;
                      ends[20]=1;
                      tdone[20]=1;
                    }
                    else {
                      switch(S6360){
                        case 0 : 
                          if(door2Deny_o.isACK()){//sysj/Exercise6.sysj line: 250, column: 6
                            door2Deny_o.setVal(true);//sysj/Exercise6.sysj line: 250, column: 6
                            S6360=1;
                            if(!door2Deny_o.isACK()){//sysj/Exercise6.sysj line: 250, column: 6
                              door2Deny_o.setREQ(false);//sysj/Exercise6.sysj line: 250, column: 6
                              ends[20]=2;
                              ;//sysj/Exercise6.sysj line: 250, column: 6
                              door2DenyUI.setPresent();//sysj/Exercise6.sysj line: 251, column: 6
                              currsigs.addElement(door2DenyUI);
                              S6335=2;
                              active[20]=1;
                              ends[20]=1;
                              tdone[20]=1;
                            }
                            else {
                              active[20]=1;
                              ends[20]=1;
                              tdone[20]=1;
                            }
                          }
                          else {
                            active[20]=1;
                            ends[20]=1;
                            tdone[20]=1;
                          }
                          break;
                        
                        case 1 : 
                          if(!door2Deny_o.isACK()){//sysj/Exercise6.sysj line: 250, column: 6
                            door2Deny_o.setREQ(false);//sysj/Exercise6.sysj line: 250, column: 6
                            ends[20]=2;
                            ;//sysj/Exercise6.sysj line: 250, column: 6
                            door2DenyUI.setPresent();//sysj/Exercise6.sysj line: 251, column: 6
                            currsigs.addElement(door2DenyUI);
                            S6335=2;
                            active[20]=1;
                            ends[20]=1;
                            tdone[20]=1;
                          }
                          else {
                            active[20]=1;
                            ends[20]=1;
                            tdone[20]=1;
                          }
                          break;
                        
                      }
                    }
                    break;
                  
                  case 1 : 
                    S6365=1;
                    S6365=0;
                    if(!door2Deny_o.isPartnerPresent() || door2Deny_o.isPartnerPreempted()){//sysj/Exercise6.sysj line: 250, column: 6
                      door2Deny_o.setREQ(false);//sysj/Exercise6.sysj line: 250, column: 6
                      S6365=1;
                      active[20]=1;
                      ends[20]=1;
                      tdone[20]=1;
                    }
                    else {
                      S6360=0;
                      if(door2Deny_o.isACK()){//sysj/Exercise6.sysj line: 250, column: 6
                        door2Deny_o.setVal(true);//sysj/Exercise6.sysj line: 250, column: 6
                        S6360=1;
                        if(!door2Deny_o.isACK()){//sysj/Exercise6.sysj line: 250, column: 6
                          door2Deny_o.setREQ(false);//sysj/Exercise6.sysj line: 250, column: 6
                          ends[20]=2;
                          ;//sysj/Exercise6.sysj line: 250, column: 6
                          door2DenyUI.setPresent();//sysj/Exercise6.sysj line: 251, column: 6
                          currsigs.addElement(door2DenyUI);
                          S6335=2;
                          active[20]=1;
                          ends[20]=1;
                          tdone[20]=1;
                        }
                        else {
                          active[20]=1;
                          ends[20]=1;
                          tdone[20]=1;
                        }
                      }
                      else {
                        active[20]=1;
                        ends[20]=1;
                        tdone[20]=1;
                      }
                    }
                    break;
                  
                }
                break;
              
            }
            break;
          
          case 2 : 
            S6335=2;
            S6335=0;
            S6319=0;
            if(!door2CardReader_in.isPartnerPresent() || door2CardReader_in.isPartnerPreempted()){//sysj/Exercise6.sysj line: 242, column: 5
              door2CardReader_in.setACK(false);//sysj/Exercise6.sysj line: 242, column: 5
              S6319=1;
              active[20]=1;
              ends[20]=1;
              tdone[20]=1;
            }
            else {
              S6314=0;
              if(!door2CardReader_in.isREQ()){//sysj/Exercise6.sysj line: 242, column: 5
                door2CardReader_in.setACK(true);//sysj/Exercise6.sysj line: 242, column: 5
                S6314=1;
                if(door2CardReader_in.isREQ()){//sysj/Exercise6.sysj line: 242, column: 5
                  door2CardReader_in.setACK(false);//sysj/Exercise6.sysj line: 242, column: 5
                  ends[20]=2;
                  ;//sysj/Exercise6.sysj line: 242, column: 5
                  id_thread_20 = (String)(door2CardReader_in.getVal() == null ? null : ((String)door2CardReader_in.getVal()));//sysj/Exercise6.sysj line: 243, column: 5
                  result_thread_20 = DoorIDDB.authDoorAccess(id_thread_20, "2");//sysj/Exercise6.sysj line: 244, column: 5
                  S6335=1;
                  if(result_thread_20 == true){//sysj/Exercise6.sysj line: 245, column: 9
                    S6382=0;
                    S6342=0;
                    if(!door2Grant_o.isPartnerPresent() || door2Grant_o.isPartnerPreempted()){//sysj/Exercise6.sysj line: 246, column: 6
                      door2Grant_o.setREQ(false);//sysj/Exercise6.sysj line: 246, column: 6
                      S6342=1;
                      active[20]=1;
                      ends[20]=1;
                      tdone[20]=1;
                    }
                    else {
                      S6337=0;
                      if(door2Grant_o.isACK()){//sysj/Exercise6.sysj line: 246, column: 6
                        door2Grant_o.setVal(true);//sysj/Exercise6.sysj line: 246, column: 6
                        S6337=1;
                        if(!door2Grant_o.isACK()){//sysj/Exercise6.sysj line: 246, column: 6
                          door2Grant_o.setREQ(false);//sysj/Exercise6.sysj line: 246, column: 6
                          ends[20]=2;
                          ;//sysj/Exercise6.sysj line: 246, column: 6
                          door2GrantUI.setPresent();//sysj/Exercise6.sysj line: 247, column: 6
                          currsigs.addElement(door2GrantUI);
                          S6335=2;
                          active[20]=1;
                          ends[20]=1;
                          tdone[20]=1;
                        }
                        else {
                          active[20]=1;
                          ends[20]=1;
                          tdone[20]=1;
                        }
                      }
                      else {
                        active[20]=1;
                        ends[20]=1;
                        tdone[20]=1;
                      }
                    }
                  }
                  else {
                    S6382=1;
                    S6365=0;
                    if(!door2Deny_o.isPartnerPresent() || door2Deny_o.isPartnerPreempted()){//sysj/Exercise6.sysj line: 250, column: 6
                      door2Deny_o.setREQ(false);//sysj/Exercise6.sysj line: 250, column: 6
                      S6365=1;
                      active[20]=1;
                      ends[20]=1;
                      tdone[20]=1;
                    }
                    else {
                      S6360=0;
                      if(door2Deny_o.isACK()){//sysj/Exercise6.sysj line: 250, column: 6
                        door2Deny_o.setVal(true);//sysj/Exercise6.sysj line: 250, column: 6
                        S6360=1;
                        if(!door2Deny_o.isACK()){//sysj/Exercise6.sysj line: 250, column: 6
                          door2Deny_o.setREQ(false);//sysj/Exercise6.sysj line: 250, column: 6
                          ends[20]=2;
                          ;//sysj/Exercise6.sysj line: 250, column: 6
                          door2DenyUI.setPresent();//sysj/Exercise6.sysj line: 251, column: 6
                          currsigs.addElement(door2DenyUI);
                          S6335=2;
                          active[20]=1;
                          ends[20]=1;
                          tdone[20]=1;
                        }
                        else {
                          active[20]=1;
                          ends[20]=1;
                          tdone[20]=1;
                        }
                      }
                      else {
                        active[20]=1;
                        ends[20]=1;
                        tdone[20]=1;
                      }
                    }
                  }
                }
                else {
                  active[20]=1;
                  ends[20]=1;
                  tdone[20]=1;
                }
              }
              else {
                active[20]=1;
                ends[20]=1;
                tdone[20]=1;
              }
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread10259(int [] tdone, int [] ends){
        switch(S6312){
      case 0 : 
        active[19]=0;
        ends[19]=0;
        tdone[19]=1;
        break;
      
      case 1 : 
        switch(S5700){
          case 0 : 
            switch(S5684){
              case 0 : 
                if(!door1CardReader_in.isPartnerPresent() || door1CardReader_in.isPartnerPreempted()){//sysj/Exercise6.sysj line: 224, column: 5
                  door1CardReader_in.setACK(false);//sysj/Exercise6.sysj line: 224, column: 5
                  S5684=1;
                  active[19]=1;
                  ends[19]=1;
                  tdone[19]=1;
                }
                else {
                  switch(S5679){
                    case 0 : 
                      if(!door1CardReader_in.isREQ()){//sysj/Exercise6.sysj line: 224, column: 5
                        door1CardReader_in.setACK(true);//sysj/Exercise6.sysj line: 224, column: 5
                        S5679=1;
                        if(door1CardReader_in.isREQ()){//sysj/Exercise6.sysj line: 224, column: 5
                          door1CardReader_in.setACK(false);//sysj/Exercise6.sysj line: 224, column: 5
                          ends[19]=2;
                          ;//sysj/Exercise6.sysj line: 224, column: 5
                          id_thread_19 = (String)(door1CardReader_in.getVal() == null ? null : ((String)door1CardReader_in.getVal()));//sysj/Exercise6.sysj line: 225, column: 5
                          result_thread_19 = DoorIDDB.authDoorAccess(id_thread_19, "1");//sysj/Exercise6.sysj line: 226, column: 5
                          S5700=1;
                          if(result_thread_19 == true){//sysj/Exercise6.sysj line: 227, column: 9
                            S5747=0;
                            S5707=0;
                            if(!door1Grant_o.isPartnerPresent() || door1Grant_o.isPartnerPreempted()){//sysj/Exercise6.sysj line: 228, column: 6
                              door1Grant_o.setREQ(false);//sysj/Exercise6.sysj line: 228, column: 6
                              S5707=1;
                              active[19]=1;
                              ends[19]=1;
                              tdone[19]=1;
                            }
                            else {
                              S5702=0;
                              if(door1Grant_o.isACK()){//sysj/Exercise6.sysj line: 228, column: 6
                                door1Grant_o.setVal(true);//sysj/Exercise6.sysj line: 228, column: 6
                                S5702=1;
                                if(!door1Grant_o.isACK()){//sysj/Exercise6.sysj line: 228, column: 6
                                  door1Grant_o.setREQ(false);//sysj/Exercise6.sysj line: 228, column: 6
                                  ends[19]=2;
                                  ;//sysj/Exercise6.sysj line: 228, column: 6
                                  door1GrantUI.setPresent();//sysj/Exercise6.sysj line: 229, column: 6
                                  currsigs.addElement(door1GrantUI);
                                  S5700=2;
                                  active[19]=1;
                                  ends[19]=1;
                                  tdone[19]=1;
                                }
                                else {
                                  active[19]=1;
                                  ends[19]=1;
                                  tdone[19]=1;
                                }
                              }
                              else {
                                active[19]=1;
                                ends[19]=1;
                                tdone[19]=1;
                              }
                            }
                          }
                          else {
                            S5747=1;
                            S5730=0;
                            if(!door1Deny_o.isPartnerPresent() || door1Deny_o.isPartnerPreempted()){//sysj/Exercise6.sysj line: 232, column: 6
                              door1Deny_o.setREQ(false);//sysj/Exercise6.sysj line: 232, column: 6
                              S5730=1;
                              active[19]=1;
                              ends[19]=1;
                              tdone[19]=1;
                            }
                            else {
                              S5725=0;
                              if(door1Deny_o.isACK()){//sysj/Exercise6.sysj line: 232, column: 6
                                door1Deny_o.setVal(true);//sysj/Exercise6.sysj line: 232, column: 6
                                S5725=1;
                                if(!door1Deny_o.isACK()){//sysj/Exercise6.sysj line: 232, column: 6
                                  door1Deny_o.setREQ(false);//sysj/Exercise6.sysj line: 232, column: 6
                                  ends[19]=2;
                                  ;//sysj/Exercise6.sysj line: 232, column: 6
                                  door1DenyUI.setPresent();//sysj/Exercise6.sysj line: 233, column: 6
                                  currsigs.addElement(door1DenyUI);
                                  S5700=2;
                                  active[19]=1;
                                  ends[19]=1;
                                  tdone[19]=1;
                                }
                                else {
                                  active[19]=1;
                                  ends[19]=1;
                                  tdone[19]=1;
                                }
                              }
                              else {
                                active[19]=1;
                                ends[19]=1;
                                tdone[19]=1;
                              }
                            }
                          }
                        }
                        else {
                          active[19]=1;
                          ends[19]=1;
                          tdone[19]=1;
                        }
                      }
                      else {
                        active[19]=1;
                        ends[19]=1;
                        tdone[19]=1;
                      }
                      break;
                    
                    case 1 : 
                      if(door1CardReader_in.isREQ()){//sysj/Exercise6.sysj line: 224, column: 5
                        door1CardReader_in.setACK(false);//sysj/Exercise6.sysj line: 224, column: 5
                        ends[19]=2;
                        ;//sysj/Exercise6.sysj line: 224, column: 5
                        id_thread_19 = (String)(door1CardReader_in.getVal() == null ? null : ((String)door1CardReader_in.getVal()));//sysj/Exercise6.sysj line: 225, column: 5
                        result_thread_19 = DoorIDDB.authDoorAccess(id_thread_19, "1");//sysj/Exercise6.sysj line: 226, column: 5
                        S5700=1;
                        if(result_thread_19 == true){//sysj/Exercise6.sysj line: 227, column: 9
                          S5747=0;
                          S5707=0;
                          if(!door1Grant_o.isPartnerPresent() || door1Grant_o.isPartnerPreempted()){//sysj/Exercise6.sysj line: 228, column: 6
                            door1Grant_o.setREQ(false);//sysj/Exercise6.sysj line: 228, column: 6
                            S5707=1;
                            active[19]=1;
                            ends[19]=1;
                            tdone[19]=1;
                          }
                          else {
                            S5702=0;
                            if(door1Grant_o.isACK()){//sysj/Exercise6.sysj line: 228, column: 6
                              door1Grant_o.setVal(true);//sysj/Exercise6.sysj line: 228, column: 6
                              S5702=1;
                              if(!door1Grant_o.isACK()){//sysj/Exercise6.sysj line: 228, column: 6
                                door1Grant_o.setREQ(false);//sysj/Exercise6.sysj line: 228, column: 6
                                ends[19]=2;
                                ;//sysj/Exercise6.sysj line: 228, column: 6
                                door1GrantUI.setPresent();//sysj/Exercise6.sysj line: 229, column: 6
                                currsigs.addElement(door1GrantUI);
                                S5700=2;
                                active[19]=1;
                                ends[19]=1;
                                tdone[19]=1;
                              }
                              else {
                                active[19]=1;
                                ends[19]=1;
                                tdone[19]=1;
                              }
                            }
                            else {
                              active[19]=1;
                              ends[19]=1;
                              tdone[19]=1;
                            }
                          }
                        }
                        else {
                          S5747=1;
                          S5730=0;
                          if(!door1Deny_o.isPartnerPresent() || door1Deny_o.isPartnerPreempted()){//sysj/Exercise6.sysj line: 232, column: 6
                            door1Deny_o.setREQ(false);//sysj/Exercise6.sysj line: 232, column: 6
                            S5730=1;
                            active[19]=1;
                            ends[19]=1;
                            tdone[19]=1;
                          }
                          else {
                            S5725=0;
                            if(door1Deny_o.isACK()){//sysj/Exercise6.sysj line: 232, column: 6
                              door1Deny_o.setVal(true);//sysj/Exercise6.sysj line: 232, column: 6
                              S5725=1;
                              if(!door1Deny_o.isACK()){//sysj/Exercise6.sysj line: 232, column: 6
                                door1Deny_o.setREQ(false);//sysj/Exercise6.sysj line: 232, column: 6
                                ends[19]=2;
                                ;//sysj/Exercise6.sysj line: 232, column: 6
                                door1DenyUI.setPresent();//sysj/Exercise6.sysj line: 233, column: 6
                                currsigs.addElement(door1DenyUI);
                                S5700=2;
                                active[19]=1;
                                ends[19]=1;
                                tdone[19]=1;
                              }
                              else {
                                active[19]=1;
                                ends[19]=1;
                                tdone[19]=1;
                              }
                            }
                            else {
                              active[19]=1;
                              ends[19]=1;
                              tdone[19]=1;
                            }
                          }
                        }
                      }
                      else {
                        active[19]=1;
                        ends[19]=1;
                        tdone[19]=1;
                      }
                      break;
                    
                  }
                }
                break;
              
              case 1 : 
                S5684=1;
                S5684=0;
                if(!door1CardReader_in.isPartnerPresent() || door1CardReader_in.isPartnerPreempted()){//sysj/Exercise6.sysj line: 224, column: 5
                  door1CardReader_in.setACK(false);//sysj/Exercise6.sysj line: 224, column: 5
                  S5684=1;
                  active[19]=1;
                  ends[19]=1;
                  tdone[19]=1;
                }
                else {
                  S5679=0;
                  if(!door1CardReader_in.isREQ()){//sysj/Exercise6.sysj line: 224, column: 5
                    door1CardReader_in.setACK(true);//sysj/Exercise6.sysj line: 224, column: 5
                    S5679=1;
                    if(door1CardReader_in.isREQ()){//sysj/Exercise6.sysj line: 224, column: 5
                      door1CardReader_in.setACK(false);//sysj/Exercise6.sysj line: 224, column: 5
                      ends[19]=2;
                      ;//sysj/Exercise6.sysj line: 224, column: 5
                      id_thread_19 = (String)(door1CardReader_in.getVal() == null ? null : ((String)door1CardReader_in.getVal()));//sysj/Exercise6.sysj line: 225, column: 5
                      result_thread_19 = DoorIDDB.authDoorAccess(id_thread_19, "1");//sysj/Exercise6.sysj line: 226, column: 5
                      S5700=1;
                      if(result_thread_19 == true){//sysj/Exercise6.sysj line: 227, column: 9
                        S5747=0;
                        S5707=0;
                        if(!door1Grant_o.isPartnerPresent() || door1Grant_o.isPartnerPreempted()){//sysj/Exercise6.sysj line: 228, column: 6
                          door1Grant_o.setREQ(false);//sysj/Exercise6.sysj line: 228, column: 6
                          S5707=1;
                          active[19]=1;
                          ends[19]=1;
                          tdone[19]=1;
                        }
                        else {
                          S5702=0;
                          if(door1Grant_o.isACK()){//sysj/Exercise6.sysj line: 228, column: 6
                            door1Grant_o.setVal(true);//sysj/Exercise6.sysj line: 228, column: 6
                            S5702=1;
                            if(!door1Grant_o.isACK()){//sysj/Exercise6.sysj line: 228, column: 6
                              door1Grant_o.setREQ(false);//sysj/Exercise6.sysj line: 228, column: 6
                              ends[19]=2;
                              ;//sysj/Exercise6.sysj line: 228, column: 6
                              door1GrantUI.setPresent();//sysj/Exercise6.sysj line: 229, column: 6
                              currsigs.addElement(door1GrantUI);
                              S5700=2;
                              active[19]=1;
                              ends[19]=1;
                              tdone[19]=1;
                            }
                            else {
                              active[19]=1;
                              ends[19]=1;
                              tdone[19]=1;
                            }
                          }
                          else {
                            active[19]=1;
                            ends[19]=1;
                            tdone[19]=1;
                          }
                        }
                      }
                      else {
                        S5747=1;
                        S5730=0;
                        if(!door1Deny_o.isPartnerPresent() || door1Deny_o.isPartnerPreempted()){//sysj/Exercise6.sysj line: 232, column: 6
                          door1Deny_o.setREQ(false);//sysj/Exercise6.sysj line: 232, column: 6
                          S5730=1;
                          active[19]=1;
                          ends[19]=1;
                          tdone[19]=1;
                        }
                        else {
                          S5725=0;
                          if(door1Deny_o.isACK()){//sysj/Exercise6.sysj line: 232, column: 6
                            door1Deny_o.setVal(true);//sysj/Exercise6.sysj line: 232, column: 6
                            S5725=1;
                            if(!door1Deny_o.isACK()){//sysj/Exercise6.sysj line: 232, column: 6
                              door1Deny_o.setREQ(false);//sysj/Exercise6.sysj line: 232, column: 6
                              ends[19]=2;
                              ;//sysj/Exercise6.sysj line: 232, column: 6
                              door1DenyUI.setPresent();//sysj/Exercise6.sysj line: 233, column: 6
                              currsigs.addElement(door1DenyUI);
                              S5700=2;
                              active[19]=1;
                              ends[19]=1;
                              tdone[19]=1;
                            }
                            else {
                              active[19]=1;
                              ends[19]=1;
                              tdone[19]=1;
                            }
                          }
                          else {
                            active[19]=1;
                            ends[19]=1;
                            tdone[19]=1;
                          }
                        }
                      }
                    }
                    else {
                      active[19]=1;
                      ends[19]=1;
                      tdone[19]=1;
                    }
                  }
                  else {
                    active[19]=1;
                    ends[19]=1;
                    tdone[19]=1;
                  }
                }
                break;
              
            }
            break;
          
          case 1 : 
            switch(S5747){
              case 0 : 
                switch(S5707){
                  case 0 : 
                    if(!door1Grant_o.isPartnerPresent() || door1Grant_o.isPartnerPreempted()){//sysj/Exercise6.sysj line: 228, column: 6
                      door1Grant_o.setREQ(false);//sysj/Exercise6.sysj line: 228, column: 6
                      S5707=1;
                      active[19]=1;
                      ends[19]=1;
                      tdone[19]=1;
                    }
                    else {
                      switch(S5702){
                        case 0 : 
                          if(door1Grant_o.isACK()){//sysj/Exercise6.sysj line: 228, column: 6
                            door1Grant_o.setVal(true);//sysj/Exercise6.sysj line: 228, column: 6
                            S5702=1;
                            if(!door1Grant_o.isACK()){//sysj/Exercise6.sysj line: 228, column: 6
                              door1Grant_o.setREQ(false);//sysj/Exercise6.sysj line: 228, column: 6
                              ends[19]=2;
                              ;//sysj/Exercise6.sysj line: 228, column: 6
                              door1GrantUI.setPresent();//sysj/Exercise6.sysj line: 229, column: 6
                              currsigs.addElement(door1GrantUI);
                              S5700=2;
                              active[19]=1;
                              ends[19]=1;
                              tdone[19]=1;
                            }
                            else {
                              active[19]=1;
                              ends[19]=1;
                              tdone[19]=1;
                            }
                          }
                          else {
                            active[19]=1;
                            ends[19]=1;
                            tdone[19]=1;
                          }
                          break;
                        
                        case 1 : 
                          if(!door1Grant_o.isACK()){//sysj/Exercise6.sysj line: 228, column: 6
                            door1Grant_o.setREQ(false);//sysj/Exercise6.sysj line: 228, column: 6
                            ends[19]=2;
                            ;//sysj/Exercise6.sysj line: 228, column: 6
                            door1GrantUI.setPresent();//sysj/Exercise6.sysj line: 229, column: 6
                            currsigs.addElement(door1GrantUI);
                            S5700=2;
                            active[19]=1;
                            ends[19]=1;
                            tdone[19]=1;
                          }
                          else {
                            active[19]=1;
                            ends[19]=1;
                            tdone[19]=1;
                          }
                          break;
                        
                      }
                    }
                    break;
                  
                  case 1 : 
                    S5707=1;
                    S5707=0;
                    if(!door1Grant_o.isPartnerPresent() || door1Grant_o.isPartnerPreempted()){//sysj/Exercise6.sysj line: 228, column: 6
                      door1Grant_o.setREQ(false);//sysj/Exercise6.sysj line: 228, column: 6
                      S5707=1;
                      active[19]=1;
                      ends[19]=1;
                      tdone[19]=1;
                    }
                    else {
                      S5702=0;
                      if(door1Grant_o.isACK()){//sysj/Exercise6.sysj line: 228, column: 6
                        door1Grant_o.setVal(true);//sysj/Exercise6.sysj line: 228, column: 6
                        S5702=1;
                        if(!door1Grant_o.isACK()){//sysj/Exercise6.sysj line: 228, column: 6
                          door1Grant_o.setREQ(false);//sysj/Exercise6.sysj line: 228, column: 6
                          ends[19]=2;
                          ;//sysj/Exercise6.sysj line: 228, column: 6
                          door1GrantUI.setPresent();//sysj/Exercise6.sysj line: 229, column: 6
                          currsigs.addElement(door1GrantUI);
                          S5700=2;
                          active[19]=1;
                          ends[19]=1;
                          tdone[19]=1;
                        }
                        else {
                          active[19]=1;
                          ends[19]=1;
                          tdone[19]=1;
                        }
                      }
                      else {
                        active[19]=1;
                        ends[19]=1;
                        tdone[19]=1;
                      }
                    }
                    break;
                  
                }
                break;
              
              case 1 : 
                switch(S5730){
                  case 0 : 
                    if(!door1Deny_o.isPartnerPresent() || door1Deny_o.isPartnerPreempted()){//sysj/Exercise6.sysj line: 232, column: 6
                      door1Deny_o.setREQ(false);//sysj/Exercise6.sysj line: 232, column: 6
                      S5730=1;
                      active[19]=1;
                      ends[19]=1;
                      tdone[19]=1;
                    }
                    else {
                      switch(S5725){
                        case 0 : 
                          if(door1Deny_o.isACK()){//sysj/Exercise6.sysj line: 232, column: 6
                            door1Deny_o.setVal(true);//sysj/Exercise6.sysj line: 232, column: 6
                            S5725=1;
                            if(!door1Deny_o.isACK()){//sysj/Exercise6.sysj line: 232, column: 6
                              door1Deny_o.setREQ(false);//sysj/Exercise6.sysj line: 232, column: 6
                              ends[19]=2;
                              ;//sysj/Exercise6.sysj line: 232, column: 6
                              door1DenyUI.setPresent();//sysj/Exercise6.sysj line: 233, column: 6
                              currsigs.addElement(door1DenyUI);
                              S5700=2;
                              active[19]=1;
                              ends[19]=1;
                              tdone[19]=1;
                            }
                            else {
                              active[19]=1;
                              ends[19]=1;
                              tdone[19]=1;
                            }
                          }
                          else {
                            active[19]=1;
                            ends[19]=1;
                            tdone[19]=1;
                          }
                          break;
                        
                        case 1 : 
                          if(!door1Deny_o.isACK()){//sysj/Exercise6.sysj line: 232, column: 6
                            door1Deny_o.setREQ(false);//sysj/Exercise6.sysj line: 232, column: 6
                            ends[19]=2;
                            ;//sysj/Exercise6.sysj line: 232, column: 6
                            door1DenyUI.setPresent();//sysj/Exercise6.sysj line: 233, column: 6
                            currsigs.addElement(door1DenyUI);
                            S5700=2;
                            active[19]=1;
                            ends[19]=1;
                            tdone[19]=1;
                          }
                          else {
                            active[19]=1;
                            ends[19]=1;
                            tdone[19]=1;
                          }
                          break;
                        
                      }
                    }
                    break;
                  
                  case 1 : 
                    S5730=1;
                    S5730=0;
                    if(!door1Deny_o.isPartnerPresent() || door1Deny_o.isPartnerPreempted()){//sysj/Exercise6.sysj line: 232, column: 6
                      door1Deny_o.setREQ(false);//sysj/Exercise6.sysj line: 232, column: 6
                      S5730=1;
                      active[19]=1;
                      ends[19]=1;
                      tdone[19]=1;
                    }
                    else {
                      S5725=0;
                      if(door1Deny_o.isACK()){//sysj/Exercise6.sysj line: 232, column: 6
                        door1Deny_o.setVal(true);//sysj/Exercise6.sysj line: 232, column: 6
                        S5725=1;
                        if(!door1Deny_o.isACK()){//sysj/Exercise6.sysj line: 232, column: 6
                          door1Deny_o.setREQ(false);//sysj/Exercise6.sysj line: 232, column: 6
                          ends[19]=2;
                          ;//sysj/Exercise6.sysj line: 232, column: 6
                          door1DenyUI.setPresent();//sysj/Exercise6.sysj line: 233, column: 6
                          currsigs.addElement(door1DenyUI);
                          S5700=2;
                          active[19]=1;
                          ends[19]=1;
                          tdone[19]=1;
                        }
                        else {
                          active[19]=1;
                          ends[19]=1;
                          tdone[19]=1;
                        }
                      }
                      else {
                        active[19]=1;
                        ends[19]=1;
                        tdone[19]=1;
                      }
                    }
                    break;
                  
                }
                break;
              
            }
            break;
          
          case 2 : 
            S5700=2;
            S5700=0;
            S5684=0;
            if(!door1CardReader_in.isPartnerPresent() || door1CardReader_in.isPartnerPreempted()){//sysj/Exercise6.sysj line: 224, column: 5
              door1CardReader_in.setACK(false);//sysj/Exercise6.sysj line: 224, column: 5
              S5684=1;
              active[19]=1;
              ends[19]=1;
              tdone[19]=1;
            }
            else {
              S5679=0;
              if(!door1CardReader_in.isREQ()){//sysj/Exercise6.sysj line: 224, column: 5
                door1CardReader_in.setACK(true);//sysj/Exercise6.sysj line: 224, column: 5
                S5679=1;
                if(door1CardReader_in.isREQ()){//sysj/Exercise6.sysj line: 224, column: 5
                  door1CardReader_in.setACK(false);//sysj/Exercise6.sysj line: 224, column: 5
                  ends[19]=2;
                  ;//sysj/Exercise6.sysj line: 224, column: 5
                  id_thread_19 = (String)(door1CardReader_in.getVal() == null ? null : ((String)door1CardReader_in.getVal()));//sysj/Exercise6.sysj line: 225, column: 5
                  result_thread_19 = DoorIDDB.authDoorAccess(id_thread_19, "1");//sysj/Exercise6.sysj line: 226, column: 5
                  S5700=1;
                  if(result_thread_19 == true){//sysj/Exercise6.sysj line: 227, column: 9
                    S5747=0;
                    S5707=0;
                    if(!door1Grant_o.isPartnerPresent() || door1Grant_o.isPartnerPreempted()){//sysj/Exercise6.sysj line: 228, column: 6
                      door1Grant_o.setREQ(false);//sysj/Exercise6.sysj line: 228, column: 6
                      S5707=1;
                      active[19]=1;
                      ends[19]=1;
                      tdone[19]=1;
                    }
                    else {
                      S5702=0;
                      if(door1Grant_o.isACK()){//sysj/Exercise6.sysj line: 228, column: 6
                        door1Grant_o.setVal(true);//sysj/Exercise6.sysj line: 228, column: 6
                        S5702=1;
                        if(!door1Grant_o.isACK()){//sysj/Exercise6.sysj line: 228, column: 6
                          door1Grant_o.setREQ(false);//sysj/Exercise6.sysj line: 228, column: 6
                          ends[19]=2;
                          ;//sysj/Exercise6.sysj line: 228, column: 6
                          door1GrantUI.setPresent();//sysj/Exercise6.sysj line: 229, column: 6
                          currsigs.addElement(door1GrantUI);
                          S5700=2;
                          active[19]=1;
                          ends[19]=1;
                          tdone[19]=1;
                        }
                        else {
                          active[19]=1;
                          ends[19]=1;
                          tdone[19]=1;
                        }
                      }
                      else {
                        active[19]=1;
                        ends[19]=1;
                        tdone[19]=1;
                      }
                    }
                  }
                  else {
                    S5747=1;
                    S5730=0;
                    if(!door1Deny_o.isPartnerPresent() || door1Deny_o.isPartnerPreempted()){//sysj/Exercise6.sysj line: 232, column: 6
                      door1Deny_o.setREQ(false);//sysj/Exercise6.sysj line: 232, column: 6
                      S5730=1;
                      active[19]=1;
                      ends[19]=1;
                      tdone[19]=1;
                    }
                    else {
                      S5725=0;
                      if(door1Deny_o.isACK()){//sysj/Exercise6.sysj line: 232, column: 6
                        door1Deny_o.setVal(true);//sysj/Exercise6.sysj line: 232, column: 6
                        S5725=1;
                        if(!door1Deny_o.isACK()){//sysj/Exercise6.sysj line: 232, column: 6
                          door1Deny_o.setREQ(false);//sysj/Exercise6.sysj line: 232, column: 6
                          ends[19]=2;
                          ;//sysj/Exercise6.sysj line: 232, column: 6
                          door1DenyUI.setPresent();//sysj/Exercise6.sysj line: 233, column: 6
                          currsigs.addElement(door1DenyUI);
                          S5700=2;
                          active[19]=1;
                          ends[19]=1;
                          tdone[19]=1;
                        }
                        else {
                          active[19]=1;
                          ends[19]=1;
                          tdone[19]=1;
                        }
                      }
                      else {
                        active[19]=1;
                        ends[19]=1;
                        tdone[19]=1;
                      }
                    }
                  }
                }
                else {
                  active[19]=1;
                  ends[19]=1;
                  tdone[19]=1;
                }
              }
              else {
                active[19]=1;
                ends[19]=1;
                tdone[19]=1;
              }
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread10257(int [] tdone, int [] ends){
        S10217=1;
    zone1NumEmployee_thread_23 = 0;//sysj/Exercise6.sysj line: 292, column: 4
    zone2NumEmployee_thread_23 = 0;//sysj/Exercise6.sysj line: 293, column: 4
    zone3NumEmployee_thread_23 = 0;//sysj/Exercise6.sysj line: 294, column: 4
    zone7NumEmployee_thread_23 = 0;//sysj/Exercise6.sysj line: 295, column: 4
    S7705=0;
    __start_thread_23 = com.systemj.Timer.getMs();//sysj/Exercise6.sysj line: 297, column: 4
    if(com.systemj.Timer.getMs() - __start_thread_23 >= (5) * 1000){//sysj/Exercise6.sysj line: 297, column: 4
      ends[23]=2;
      ;//sysj/Exercise6.sysj line: 297, column: 4
      zone1NumEmployee_thread_23 = 0;//sysj/Exercise6.sysj line: 302, column: 5
      zone2NumEmployee_thread_23 = 0;//sysj/Exercise6.sysj line: 303, column: 5
      zone3NumEmployee_thread_23 = 0;//sysj/Exercise6.sysj line: 304, column: 5
      zone7NumEmployee_thread_23 = 0;//sysj/Exercise6.sysj line: 305, column: 5
      S7705=1;
      S7712=0;
      if(!reqIDLoc_o.isPartnerPresent() || reqIDLoc_o.isPartnerPreempted()){//sysj/Exercise6.sysj line: 307, column: 5
        reqIDLoc_o.setREQ(false);//sysj/Exercise6.sysj line: 307, column: 5
        S7712=1;
        active[23]=1;
        ends[23]=1;
        tdone[23]=1;
      }
      else {
        S7707=0;
        if(reqIDLoc_o.isACK()){//sysj/Exercise6.sysj line: 307, column: 5
          reqIDLoc_o.setVal("11111");//sysj/Exercise6.sysj line: 307, column: 5
          S7707=1;
          if(!reqIDLoc_o.isACK()){//sysj/Exercise6.sysj line: 307, column: 5
            reqIDLoc_o.setREQ(false);//sysj/Exercise6.sysj line: 307, column: 5
            ends[23]=2;
            ;//sysj/Exercise6.sysj line: 307, column: 5
            S7705=2;
            S7800=0;
            if(!idLocation_in.isPartnerPresent() || idLocation_in.isPartnerPreempted()){//sysj/Exercise6.sysj line: 308, column: 5
              idLocation_in.setACK(false);//sysj/Exercise6.sysj line: 308, column: 5
              S7800=1;
              active[23]=1;
              ends[23]=1;
              tdone[23]=1;
            }
            else {
              S7795=0;
              if(!idLocation_in.isREQ()){//sysj/Exercise6.sysj line: 308, column: 5
                idLocation_in.setACK(true);//sysj/Exercise6.sysj line: 308, column: 5
                S7795=1;
                if(idLocation_in.isREQ()){//sysj/Exercise6.sysj line: 308, column: 5
                  idLocation_in.setACK(false);//sysj/Exercise6.sysj line: 308, column: 5
                  ends[23]=2;
                  ;//sysj/Exercise6.sysj line: 308, column: 5
                  zoneLocation_thread_23 = (String)(idLocation_in.getVal() == null ? null : ((String)idLocation_in.getVal()));//sysj/Exercise6.sysj line: 309, column: 5
                  S7705=3;
                  active[23]=1;
                  ends[23]=1;
                  tdone[23]=1;
                }
                else {
                  active[23]=1;
                  ends[23]=1;
                  tdone[23]=1;
                }
              }
              else {
                active[23]=1;
                ends[23]=1;
                tdone[23]=1;
              }
            }
          }
          else {
            active[23]=1;
            ends[23]=1;
            tdone[23]=1;
          }
        }
        else {
          active[23]=1;
          ends[23]=1;
          tdone[23]=1;
        }
      }
    }
    else {
      active[23]=1;
      ends[23]=1;
      tdone[23]=1;
    }
  }

  public void thread10256(int [] tdone, int [] ends){
        S7689=1;
    S7605=0;
    S7589=0;
    if(!humanPresence_in.isPartnerPresent() || humanPresence_in.isPartnerPreempted()){//sysj/Exercise6.sysj line: 278, column: 5
      humanPresence_in.setACK(false);//sysj/Exercise6.sysj line: 278, column: 5
      S7589=1;
      active[22]=1;
      ends[22]=1;
      tdone[22]=1;
    }
    else {
      S7584=0;
      if(!humanPresence_in.isREQ()){//sysj/Exercise6.sysj line: 278, column: 5
        humanPresence_in.setACK(true);//sysj/Exercise6.sysj line: 278, column: 5
        S7584=1;
        if(humanPresence_in.isREQ()){//sysj/Exercise6.sysj line: 278, column: 5
          humanPresence_in.setACK(false);//sysj/Exercise6.sysj line: 278, column: 5
          ends[22]=2;
          ;//sysj/Exercise6.sysj line: 278, column: 5
          result_thread_22 = (boolean)(humanPresence_in.getVal() == null ? false : ((Boolean)humanPresence_in.getVal()).booleanValue());//sysj/Exercise6.sysj line: 279, column: 5
          System.out.println("Infrared sensor trip - emergency off enacted.");//sysj/Exercise6.sysj line: 281, column: 5
          S7605=1;
          emergencyOffUI.setPresent();//sysj/Exercise6.sysj line: 285, column: 5
          currsigs.addElement(emergencyOffUI);
          active[22]=1;
          ends[22]=1;
          tdone[22]=1;
        }
        else {
          active[22]=1;
          ends[22]=1;
          tdone[22]=1;
        }
      }
      else {
        active[22]=1;
        ends[22]=1;
        tdone[22]=1;
      }
    }
  }

  public void thread10255(int [] tdone, int [] ends){
        S7582=1;
    S6970=0;
    S6954=0;
    if(!door3CardReader_in.isPartnerPresent() || door3CardReader_in.isPartnerPreempted()){//sysj/Exercise6.sysj line: 260, column: 5
      door3CardReader_in.setACK(false);//sysj/Exercise6.sysj line: 260, column: 5
      S6954=1;
      active[21]=1;
      ends[21]=1;
      tdone[21]=1;
    }
    else {
      S6949=0;
      if(!door3CardReader_in.isREQ()){//sysj/Exercise6.sysj line: 260, column: 5
        door3CardReader_in.setACK(true);//sysj/Exercise6.sysj line: 260, column: 5
        S6949=1;
        if(door3CardReader_in.isREQ()){//sysj/Exercise6.sysj line: 260, column: 5
          door3CardReader_in.setACK(false);//sysj/Exercise6.sysj line: 260, column: 5
          ends[21]=2;
          ;//sysj/Exercise6.sysj line: 260, column: 5
          id_thread_21 = (String)(door3CardReader_in.getVal() == null ? null : ((String)door3CardReader_in.getVal()));//sysj/Exercise6.sysj line: 261, column: 5
          result_thread_21 = DoorIDDB.authDoorAccess(id_thread_21, "3");//sysj/Exercise6.sysj line: 262, column: 5
          S6970=1;
          if(result_thread_21 == true){//sysj/Exercise6.sysj line: 263, column: 9
            S7017=0;
            S6977=0;
            if(!door3Grant_o.isPartnerPresent() || door3Grant_o.isPartnerPreempted()){//sysj/Exercise6.sysj line: 264, column: 6
              door3Grant_o.setREQ(false);//sysj/Exercise6.sysj line: 264, column: 6
              S6977=1;
              active[21]=1;
              ends[21]=1;
              tdone[21]=1;
            }
            else {
              S6972=0;
              if(door3Grant_o.isACK()){//sysj/Exercise6.sysj line: 264, column: 6
                door3Grant_o.setVal(true);//sysj/Exercise6.sysj line: 264, column: 6
                S6972=1;
                if(!door3Grant_o.isACK()){//sysj/Exercise6.sysj line: 264, column: 6
                  door3Grant_o.setREQ(false);//sysj/Exercise6.sysj line: 264, column: 6
                  ends[21]=2;
                  ;//sysj/Exercise6.sysj line: 264, column: 6
                  door3GrantUI.setPresent();//sysj/Exercise6.sysj line: 265, column: 6
                  currsigs.addElement(door3GrantUI);
                  S6970=2;
                  active[21]=1;
                  ends[21]=1;
                  tdone[21]=1;
                }
                else {
                  active[21]=1;
                  ends[21]=1;
                  tdone[21]=1;
                }
              }
              else {
                active[21]=1;
                ends[21]=1;
                tdone[21]=1;
              }
            }
          }
          else {
            S7017=1;
            S7000=0;
            if(!door3Deny_o.isPartnerPresent() || door3Deny_o.isPartnerPreempted()){//sysj/Exercise6.sysj line: 268, column: 6
              door3Deny_o.setREQ(false);//sysj/Exercise6.sysj line: 268, column: 6
              S7000=1;
              active[21]=1;
              ends[21]=1;
              tdone[21]=1;
            }
            else {
              S6995=0;
              if(door3Deny_o.isACK()){//sysj/Exercise6.sysj line: 268, column: 6
                door3Deny_o.setVal(true);//sysj/Exercise6.sysj line: 268, column: 6
                S6995=1;
                if(!door3Deny_o.isACK()){//sysj/Exercise6.sysj line: 268, column: 6
                  door3Deny_o.setREQ(false);//sysj/Exercise6.sysj line: 268, column: 6
                  ends[21]=2;
                  ;//sysj/Exercise6.sysj line: 268, column: 6
                  door3DenyUI.setPresent();//sysj/Exercise6.sysj line: 269, column: 6
                  currsigs.addElement(door3DenyUI);
                  S6970=2;
                  active[21]=1;
                  ends[21]=1;
                  tdone[21]=1;
                }
                else {
                  active[21]=1;
                  ends[21]=1;
                  tdone[21]=1;
                }
              }
              else {
                active[21]=1;
                ends[21]=1;
                tdone[21]=1;
              }
            }
          }
        }
        else {
          active[21]=1;
          ends[21]=1;
          tdone[21]=1;
        }
      }
      else {
        active[21]=1;
        ends[21]=1;
        tdone[21]=1;
      }
    }
  }

  public void thread10254(int [] tdone, int [] ends){
        S6947=1;
    S6335=0;
    S6319=0;
    if(!door2CardReader_in.isPartnerPresent() || door2CardReader_in.isPartnerPreempted()){//sysj/Exercise6.sysj line: 242, column: 5
      door2CardReader_in.setACK(false);//sysj/Exercise6.sysj line: 242, column: 5
      S6319=1;
      active[20]=1;
      ends[20]=1;
      tdone[20]=1;
    }
    else {
      S6314=0;
      if(!door2CardReader_in.isREQ()){//sysj/Exercise6.sysj line: 242, column: 5
        door2CardReader_in.setACK(true);//sysj/Exercise6.sysj line: 242, column: 5
        S6314=1;
        if(door2CardReader_in.isREQ()){//sysj/Exercise6.sysj line: 242, column: 5
          door2CardReader_in.setACK(false);//sysj/Exercise6.sysj line: 242, column: 5
          ends[20]=2;
          ;//sysj/Exercise6.sysj line: 242, column: 5
          id_thread_20 = (String)(door2CardReader_in.getVal() == null ? null : ((String)door2CardReader_in.getVal()));//sysj/Exercise6.sysj line: 243, column: 5
          result_thread_20 = DoorIDDB.authDoorAccess(id_thread_20, "2");//sysj/Exercise6.sysj line: 244, column: 5
          S6335=1;
          if(result_thread_20 == true){//sysj/Exercise6.sysj line: 245, column: 9
            S6382=0;
            S6342=0;
            if(!door2Grant_o.isPartnerPresent() || door2Grant_o.isPartnerPreempted()){//sysj/Exercise6.sysj line: 246, column: 6
              door2Grant_o.setREQ(false);//sysj/Exercise6.sysj line: 246, column: 6
              S6342=1;
              active[20]=1;
              ends[20]=1;
              tdone[20]=1;
            }
            else {
              S6337=0;
              if(door2Grant_o.isACK()){//sysj/Exercise6.sysj line: 246, column: 6
                door2Grant_o.setVal(true);//sysj/Exercise6.sysj line: 246, column: 6
                S6337=1;
                if(!door2Grant_o.isACK()){//sysj/Exercise6.sysj line: 246, column: 6
                  door2Grant_o.setREQ(false);//sysj/Exercise6.sysj line: 246, column: 6
                  ends[20]=2;
                  ;//sysj/Exercise6.sysj line: 246, column: 6
                  door2GrantUI.setPresent();//sysj/Exercise6.sysj line: 247, column: 6
                  currsigs.addElement(door2GrantUI);
                  S6335=2;
                  active[20]=1;
                  ends[20]=1;
                  tdone[20]=1;
                }
                else {
                  active[20]=1;
                  ends[20]=1;
                  tdone[20]=1;
                }
              }
              else {
                active[20]=1;
                ends[20]=1;
                tdone[20]=1;
              }
            }
          }
          else {
            S6382=1;
            S6365=0;
            if(!door2Deny_o.isPartnerPresent() || door2Deny_o.isPartnerPreempted()){//sysj/Exercise6.sysj line: 250, column: 6
              door2Deny_o.setREQ(false);//sysj/Exercise6.sysj line: 250, column: 6
              S6365=1;
              active[20]=1;
              ends[20]=1;
              tdone[20]=1;
            }
            else {
              S6360=0;
              if(door2Deny_o.isACK()){//sysj/Exercise6.sysj line: 250, column: 6
                door2Deny_o.setVal(true);//sysj/Exercise6.sysj line: 250, column: 6
                S6360=1;
                if(!door2Deny_o.isACK()){//sysj/Exercise6.sysj line: 250, column: 6
                  door2Deny_o.setREQ(false);//sysj/Exercise6.sysj line: 250, column: 6
                  ends[20]=2;
                  ;//sysj/Exercise6.sysj line: 250, column: 6
                  door2DenyUI.setPresent();//sysj/Exercise6.sysj line: 251, column: 6
                  currsigs.addElement(door2DenyUI);
                  S6335=2;
                  active[20]=1;
                  ends[20]=1;
                  tdone[20]=1;
                }
                else {
                  active[20]=1;
                  ends[20]=1;
                  tdone[20]=1;
                }
              }
              else {
                active[20]=1;
                ends[20]=1;
                tdone[20]=1;
              }
            }
          }
        }
        else {
          active[20]=1;
          ends[20]=1;
          tdone[20]=1;
        }
      }
      else {
        active[20]=1;
        ends[20]=1;
        tdone[20]=1;
      }
    }
  }

  public void thread10253(int [] tdone, int [] ends){
        S6312=1;
    S5700=0;
    S5684=0;
    if(!door1CardReader_in.isPartnerPresent() || door1CardReader_in.isPartnerPreempted()){//sysj/Exercise6.sysj line: 224, column: 5
      door1CardReader_in.setACK(false);//sysj/Exercise6.sysj line: 224, column: 5
      S5684=1;
      active[19]=1;
      ends[19]=1;
      tdone[19]=1;
    }
    else {
      S5679=0;
      if(!door1CardReader_in.isREQ()){//sysj/Exercise6.sysj line: 224, column: 5
        door1CardReader_in.setACK(true);//sysj/Exercise6.sysj line: 224, column: 5
        S5679=1;
        if(door1CardReader_in.isREQ()){//sysj/Exercise6.sysj line: 224, column: 5
          door1CardReader_in.setACK(false);//sysj/Exercise6.sysj line: 224, column: 5
          ends[19]=2;
          ;//sysj/Exercise6.sysj line: 224, column: 5
          id_thread_19 = (String)(door1CardReader_in.getVal() == null ? null : ((String)door1CardReader_in.getVal()));//sysj/Exercise6.sysj line: 225, column: 5
          result_thread_19 = DoorIDDB.authDoorAccess(id_thread_19, "1");//sysj/Exercise6.sysj line: 226, column: 5
          S5700=1;
          if(result_thread_19 == true){//sysj/Exercise6.sysj line: 227, column: 9
            S5747=0;
            S5707=0;
            if(!door1Grant_o.isPartnerPresent() || door1Grant_o.isPartnerPreempted()){//sysj/Exercise6.sysj line: 228, column: 6
              door1Grant_o.setREQ(false);//sysj/Exercise6.sysj line: 228, column: 6
              S5707=1;
              active[19]=1;
              ends[19]=1;
              tdone[19]=1;
            }
            else {
              S5702=0;
              if(door1Grant_o.isACK()){//sysj/Exercise6.sysj line: 228, column: 6
                door1Grant_o.setVal(true);//sysj/Exercise6.sysj line: 228, column: 6
                S5702=1;
                if(!door1Grant_o.isACK()){//sysj/Exercise6.sysj line: 228, column: 6
                  door1Grant_o.setREQ(false);//sysj/Exercise6.sysj line: 228, column: 6
                  ends[19]=2;
                  ;//sysj/Exercise6.sysj line: 228, column: 6
                  door1GrantUI.setPresent();//sysj/Exercise6.sysj line: 229, column: 6
                  currsigs.addElement(door1GrantUI);
                  S5700=2;
                  active[19]=1;
                  ends[19]=1;
                  tdone[19]=1;
                }
                else {
                  active[19]=1;
                  ends[19]=1;
                  tdone[19]=1;
                }
              }
              else {
                active[19]=1;
                ends[19]=1;
                tdone[19]=1;
              }
            }
          }
          else {
            S5747=1;
            S5730=0;
            if(!door1Deny_o.isPartnerPresent() || door1Deny_o.isPartnerPreempted()){//sysj/Exercise6.sysj line: 232, column: 6
              door1Deny_o.setREQ(false);//sysj/Exercise6.sysj line: 232, column: 6
              S5730=1;
              active[19]=1;
              ends[19]=1;
              tdone[19]=1;
            }
            else {
              S5725=0;
              if(door1Deny_o.isACK()){//sysj/Exercise6.sysj line: 232, column: 6
                door1Deny_o.setVal(true);//sysj/Exercise6.sysj line: 232, column: 6
                S5725=1;
                if(!door1Deny_o.isACK()){//sysj/Exercise6.sysj line: 232, column: 6
                  door1Deny_o.setREQ(false);//sysj/Exercise6.sysj line: 232, column: 6
                  ends[19]=2;
                  ;//sysj/Exercise6.sysj line: 232, column: 6
                  door1DenyUI.setPresent();//sysj/Exercise6.sysj line: 233, column: 6
                  currsigs.addElement(door1DenyUI);
                  S5700=2;
                  active[19]=1;
                  ends[19]=1;
                  tdone[19]=1;
                }
                else {
                  active[19]=1;
                  ends[19]=1;
                  tdone[19]=1;
                }
              }
              else {
                active[19]=1;
                ends[19]=1;
                tdone[19]=1;
              }
            }
          }
        }
        else {
          active[19]=1;
          ends[19]=1;
          tdone[19]=1;
        }
      }
      else {
        active[19]=1;
        ends[19]=1;
        tdone[19]=1;
      }
    }
  }

  public void runClockDomain(){
    for(int i=0;i<ends.length;i++){
      ends[i] = 0;
      tdone[i] = 0;
    }
    
    RUN: while(true){
      switch(S10219){
        case 0 : 
          S10219=0;
          break RUN;
        
        case 1 : 
          S10219=2;
          S10219=2;
          thread10253(tdone,ends);
          thread10254(tdone,ends);
          thread10255(tdone,ends);
          thread10256(tdone,ends);
          thread10257(tdone,ends);
          int biggest10258 = 0;
          if(ends[19]>=biggest10258){
            biggest10258=ends[19];
          }
          if(ends[20]>=biggest10258){
            biggest10258=ends[20];
          }
          if(ends[21]>=biggest10258){
            biggest10258=ends[21];
          }
          if(ends[22]>=biggest10258){
            biggest10258=ends[22];
          }
          if(ends[23]>=biggest10258){
            biggest10258=ends[23];
          }
          if(biggest10258 == 1){
            active[18]=1;
            ends[18]=1;
            break RUN;
          }
        
        case 2 : 
          thread10259(tdone,ends);
          thread10260(tdone,ends);
          thread10261(tdone,ends);
          thread10262(tdone,ends);
          thread10263(tdone,ends);
          int biggest10264 = 0;
          if(ends[19]>=biggest10264){
            biggest10264=ends[19];
          }
          if(ends[20]>=biggest10264){
            biggest10264=ends[20];
          }
          if(ends[21]>=biggest10264){
            biggest10264=ends[21];
          }
          if(ends[22]>=biggest10264){
            biggest10264=ends[22];
          }
          if(ends[23]>=biggest10264){
            biggest10264=ends[23];
          }
          if(biggest10264 == 1){
            active[18]=1;
            ends[18]=1;
            break RUN;
          }
          //FINXME code
          if(biggest10264 == 0){
            S10219=0;
            active[18]=0;
            ends[18]=0;
            S10219=0;
            break RUN;
          }
        
      }
    }
  }

  public void init(){
    char [] active1 = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
    char [] paused1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    char [] suspended1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    paused = paused1;
    active = active1;
    suspended = suspended1;
    // Now instantiate all the local signals ONLY
    // --------------------------------------------------
  }
  
  public void run(){
    while(active[18] != 0){
      int index = 18;
      if(paused[index]==1 || suspended[index]==1 || active[index] == 0){
        for(int h=1;h<paused.length;++h){
          paused[h]=0;
        }
      }
      if(paused[18]!=0 || suspended[18]!=0 || active[18]!=1);
      else{
        if(!df){
          humanPresence_in.gethook();
          idLocation_in.gethook();
          door1CardReader_in.gethook();
          door2CardReader_in.gethook();
          door3CardReader_in.gethook();
          idAuthResponse_in.gethook();
          reqIDLoc_o.gethook();
          door1Grant_o.gethook();
          door1Deny_o.gethook();
          door2Grant_o.gethook();
          door2Deny_o.gethook();
          door3Grant_o.gethook();
          door3Deny_o.gethook();
          emergencyOff_o.gethook();
          reqAuthCheck_o.gethook();
          df = true;
        }
        runClockDomain();
      }
      zone1Num.setpreclear();
      zone2Num.setpreclear();
      zone3Num.setpreclear();
      zone7Num.setpreclear();
      zone1Unauth.setpreclear();
      zone2Unauth.setpreclear();
      zone3Unauth.setpreclear();
      zone7Unauth.setpreclear();
      emergencyOffUI.setpreclear();
      door1GrantUI.setpreclear();
      door1DenyUI.setpreclear();
      door2GrantUI.setpreclear();
      door2DenyUI.setpreclear();
      door3GrantUI.setpreclear();
      door3DenyUI.setpreclear();
      int dummyint = 0;
      for(int qw=0;qw<currsigs.size();++qw){
        dummyint = ((Signal)currsigs.elementAt(qw)).getStatus() ? ((Signal)currsigs.elementAt(qw)).setprepresent() : ((Signal)currsigs.elementAt(qw)).setpreclear();
        ((Signal)currsigs.elementAt(qw)).setpreval(((Signal)currsigs.elementAt(qw)).getValue());
      }
      currsigs.removeAllElements();
      zone1Num.sethook();
      zone1Num.setClear();
      zone2Num.sethook();
      zone2Num.setClear();
      zone3Num.sethook();
      zone3Num.setClear();
      zone7Num.sethook();
      zone7Num.setClear();
      zone1Unauth.sethook();
      zone1Unauth.setClear();
      zone2Unauth.sethook();
      zone2Unauth.setClear();
      zone3Unauth.sethook();
      zone3Unauth.setClear();
      zone7Unauth.sethook();
      zone7Unauth.setClear();
      emergencyOffUI.sethook();
      emergencyOffUI.setClear();
      door1GrantUI.sethook();
      door1GrantUI.setClear();
      door1DenyUI.sethook();
      door1DenyUI.setClear();
      door2GrantUI.sethook();
      door2GrantUI.setClear();
      door2DenyUI.sethook();
      door2DenyUI.setClear();
      door3GrantUI.sethook();
      door3GrantUI.setClear();
      door3DenyUI.sethook();
      door3DenyUI.setClear();
      humanPresence_in.sethook();
      idLocation_in.sethook();
      door1CardReader_in.sethook();
      door2CardReader_in.sethook();
      door3CardReader_in.sethook();
      idAuthResponse_in.sethook();
      reqIDLoc_o.sethook();
      door1Grant_o.sethook();
      door1Deny_o.sethook();
      door2Grant_o.sethook();
      door2Deny_o.sethook();
      door3Grant_o.sethook();
      door3Deny_o.sethook();
      emergencyOff_o.sethook();
      reqAuthCheck_o.sethook();
      if(paused[18]!=0 || suspended[18]!=0 || active[18]!=1);
      else{
        humanPresence_in.gethook();
        idLocation_in.gethook();
        door1CardReader_in.gethook();
        door2CardReader_in.gethook();
        door3CardReader_in.gethook();
        idAuthResponse_in.gethook();
        reqIDLoc_o.gethook();
        door1Grant_o.gethook();
        door1Deny_o.gethook();
        door2Grant_o.gethook();
        door2Deny_o.gethook();
        door3Grant_o.gethook();
        door3Deny_o.gethook();
        emergencyOff_o.gethook();
        reqAuthCheck_o.gethook();
      }
      runFinisher();
      if(active[18] == 0){
      	this.terminated = true;
      }
      if(!threaded) break;
    }
  }
}
