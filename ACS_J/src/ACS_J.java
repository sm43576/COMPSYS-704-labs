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
  public input_Channel humanPresence_in = new input_Channel();
  public input_Channel idLocation_in = new input_Channel();
  public input_Channel door1CardReader_in = new input_Channel();
  public input_Channel idAuthResponse_in = new input_Channel();
  public output_Channel reqIDLoc_o = new output_Channel();
  public output_Channel door1Grant_o = new output_Channel();
  public output_Channel door1Deny_o = new output_Channel();
  public output_Channel emergencyOff_o = new output_Channel();
  public output_Channel reqAuthCheck_o = new output_Channel();
  private int zone1NumEmployee_thread_13;//sysj/Exercise6.sysj line: 162, column: 4
  private int zone2NumEmployee_thread_13;//sysj/Exercise6.sysj line: 163, column: 4
  private int zone3NumEmployee_thread_13;//sysj/Exercise6.sysj line: 164, column: 4
  private int zone7NumEmployee_thread_13;//sysj/Exercise6.sysj line: 165, column: 4
  private String id_thread_11;//sysj/Exercise6.sysj line: 133, column: 5
  private boolean result_thread_11;//sysj/Exercise6.sysj line: 134, column: 5
  private boolean result_thread_12;//sysj/Exercise6.sysj line: 151, column: 5
  private boolean response_thread_13;//sysj/Exercise6.sysj line: 203, column: 5
  private long __start_thread_13;//sysj/Exercise6.sysj line: 167, column: 4
  private String zoneLocation_thread_13;//sysj/Exercise6.sysj line: 179, column: 5
  private int S6333 = 1;
  private int S3732 = 1;
  private int S3120 = 1;
  private int S3104 = 1;
  private int S3099 = 1;
  private int S3167 = 1;
  private int S3127 = 1;
  private int S3122 = 1;
  private int S3150 = 1;
  private int S3145 = 1;
  private int S3803 = 1;
  private int S3755 = 1;
  private int S3739 = 1;
  private int S3734 = 1;
  private int S6331 = 1;
  private int S3819 = 1;
  private int S3826 = 1;
  private int S3821 = 1;
  private int S3914 = 1;
  private int S3909 = 1;
  private int S4046 = 1;
  private int S4041 = 1;
  private int S4090 = 1;
  private int S4085 = 1;
  
  private int[] ends = new int[14];
  private int[] tdone = new int[14];
  
  public void thread6357(int [] tdone, int [] ends){
        switch(S6331){
      case 0 : 
        active[13]=0;
        ends[13]=0;
        tdone[13]=1;
        break;
      
      case 1 : 
        switch(S3819){
          case 0 : 
            if(com.systemj.Timer.getMs() - __start_thread_13 >= (5) * 1000){//sysj/Exercise6.sysj line: 167, column: 4
              ends[13]=2;
              ;//sysj/Exercise6.sysj line: 167, column: 4
              zone1NumEmployee_thread_13 = 0;//sysj/Exercise6.sysj line: 172, column: 5
              zone2NumEmployee_thread_13 = 0;//sysj/Exercise6.sysj line: 173, column: 5
              zone3NumEmployee_thread_13 = 0;//sysj/Exercise6.sysj line: 174, column: 5
              zone7NumEmployee_thread_13 = 0;//sysj/Exercise6.sysj line: 175, column: 5
              S3819=1;
              S3826=0;
              if(!reqIDLoc_o.isPartnerPresent() || reqIDLoc_o.isPartnerPreempted()){//sysj/Exercise6.sysj line: 177, column: 5
                reqIDLoc_o.setREQ(false);//sysj/Exercise6.sysj line: 177, column: 5
                S3826=1;
                active[13]=1;
                ends[13]=1;
                tdone[13]=1;
              }
              else {
                S3821=0;
                if(reqIDLoc_o.isACK()){//sysj/Exercise6.sysj line: 177, column: 5
                  reqIDLoc_o.setVal("11111");//sysj/Exercise6.sysj line: 177, column: 5
                  S3821=1;
                  if(!reqIDLoc_o.isACK()){//sysj/Exercise6.sysj line: 177, column: 5
                    reqIDLoc_o.setREQ(false);//sysj/Exercise6.sysj line: 177, column: 5
                    ends[13]=2;
                    ;//sysj/Exercise6.sysj line: 177, column: 5
                    S3819=2;
                    S3914=0;
                    if(!idLocation_in.isPartnerPresent() || idLocation_in.isPartnerPreempted()){//sysj/Exercise6.sysj line: 178, column: 5
                      idLocation_in.setACK(false);//sysj/Exercise6.sysj line: 178, column: 5
                      S3914=1;
                      active[13]=1;
                      ends[13]=1;
                      tdone[13]=1;
                    }
                    else {
                      S3909=0;
                      if(!idLocation_in.isREQ()){//sysj/Exercise6.sysj line: 178, column: 5
                        idLocation_in.setACK(true);//sysj/Exercise6.sysj line: 178, column: 5
                        S3909=1;
                        if(idLocation_in.isREQ()){//sysj/Exercise6.sysj line: 178, column: 5
                          idLocation_in.setACK(false);//sysj/Exercise6.sysj line: 178, column: 5
                          ends[13]=2;
                          ;//sysj/Exercise6.sysj line: 178, column: 5
                          zoneLocation_thread_13 = (String)(idLocation_in.getVal() == null ? null : ((String)idLocation_in.getVal()));//sysj/Exercise6.sysj line: 179, column: 5
                          S3819=3;
                          active[13]=1;
                          ends[13]=1;
                          tdone[13]=1;
                        }
                        else {
                          active[13]=1;
                          ends[13]=1;
                          tdone[13]=1;
                        }
                      }
                      else {
                        active[13]=1;
                        ends[13]=1;
                        tdone[13]=1;
                      }
                    }
                  }
                  else {
                    active[13]=1;
                    ends[13]=1;
                    tdone[13]=1;
                  }
                }
                else {
                  active[13]=1;
                  ends[13]=1;
                  tdone[13]=1;
                }
              }
            }
            else {
              active[13]=1;
              ends[13]=1;
              tdone[13]=1;
            }
            break;
          
          case 1 : 
            switch(S3826){
              case 0 : 
                if(!reqIDLoc_o.isPartnerPresent() || reqIDLoc_o.isPartnerPreempted()){//sysj/Exercise6.sysj line: 177, column: 5
                  reqIDLoc_o.setREQ(false);//sysj/Exercise6.sysj line: 177, column: 5
                  S3826=1;
                  active[13]=1;
                  ends[13]=1;
                  tdone[13]=1;
                }
                else {
                  switch(S3821){
                    case 0 : 
                      if(reqIDLoc_o.isACK()){//sysj/Exercise6.sysj line: 177, column: 5
                        reqIDLoc_o.setVal("11111");//sysj/Exercise6.sysj line: 177, column: 5
                        S3821=1;
                        if(!reqIDLoc_o.isACK()){//sysj/Exercise6.sysj line: 177, column: 5
                          reqIDLoc_o.setREQ(false);//sysj/Exercise6.sysj line: 177, column: 5
                          ends[13]=2;
                          ;//sysj/Exercise6.sysj line: 177, column: 5
                          S3819=2;
                          S3914=0;
                          if(!idLocation_in.isPartnerPresent() || idLocation_in.isPartnerPreempted()){//sysj/Exercise6.sysj line: 178, column: 5
                            idLocation_in.setACK(false);//sysj/Exercise6.sysj line: 178, column: 5
                            S3914=1;
                            active[13]=1;
                            ends[13]=1;
                            tdone[13]=1;
                          }
                          else {
                            S3909=0;
                            if(!idLocation_in.isREQ()){//sysj/Exercise6.sysj line: 178, column: 5
                              idLocation_in.setACK(true);//sysj/Exercise6.sysj line: 178, column: 5
                              S3909=1;
                              if(idLocation_in.isREQ()){//sysj/Exercise6.sysj line: 178, column: 5
                                idLocation_in.setACK(false);//sysj/Exercise6.sysj line: 178, column: 5
                                ends[13]=2;
                                ;//sysj/Exercise6.sysj line: 178, column: 5
                                zoneLocation_thread_13 = (String)(idLocation_in.getVal() == null ? null : ((String)idLocation_in.getVal()));//sysj/Exercise6.sysj line: 179, column: 5
                                S3819=3;
                                active[13]=1;
                                ends[13]=1;
                                tdone[13]=1;
                              }
                              else {
                                active[13]=1;
                                ends[13]=1;
                                tdone[13]=1;
                              }
                            }
                            else {
                              active[13]=1;
                              ends[13]=1;
                              tdone[13]=1;
                            }
                          }
                        }
                        else {
                          active[13]=1;
                          ends[13]=1;
                          tdone[13]=1;
                        }
                      }
                      else {
                        active[13]=1;
                        ends[13]=1;
                        tdone[13]=1;
                      }
                      break;
                    
                    case 1 : 
                      if(!reqIDLoc_o.isACK()){//sysj/Exercise6.sysj line: 177, column: 5
                        reqIDLoc_o.setREQ(false);//sysj/Exercise6.sysj line: 177, column: 5
                        ends[13]=2;
                        ;//sysj/Exercise6.sysj line: 177, column: 5
                        S3819=2;
                        S3914=0;
                        if(!idLocation_in.isPartnerPresent() || idLocation_in.isPartnerPreempted()){//sysj/Exercise6.sysj line: 178, column: 5
                          idLocation_in.setACK(false);//sysj/Exercise6.sysj line: 178, column: 5
                          S3914=1;
                          active[13]=1;
                          ends[13]=1;
                          tdone[13]=1;
                        }
                        else {
                          S3909=0;
                          if(!idLocation_in.isREQ()){//sysj/Exercise6.sysj line: 178, column: 5
                            idLocation_in.setACK(true);//sysj/Exercise6.sysj line: 178, column: 5
                            S3909=1;
                            if(idLocation_in.isREQ()){//sysj/Exercise6.sysj line: 178, column: 5
                              idLocation_in.setACK(false);//sysj/Exercise6.sysj line: 178, column: 5
                              ends[13]=2;
                              ;//sysj/Exercise6.sysj line: 178, column: 5
                              zoneLocation_thread_13 = (String)(idLocation_in.getVal() == null ? null : ((String)idLocation_in.getVal()));//sysj/Exercise6.sysj line: 179, column: 5
                              S3819=3;
                              active[13]=1;
                              ends[13]=1;
                              tdone[13]=1;
                            }
                            else {
                              active[13]=1;
                              ends[13]=1;
                              tdone[13]=1;
                            }
                          }
                          else {
                            active[13]=1;
                            ends[13]=1;
                            tdone[13]=1;
                          }
                        }
                      }
                      else {
                        active[13]=1;
                        ends[13]=1;
                        tdone[13]=1;
                      }
                      break;
                    
                  }
                }
                break;
              
              case 1 : 
                S3826=1;
                S3826=0;
                if(!reqIDLoc_o.isPartnerPresent() || reqIDLoc_o.isPartnerPreempted()){//sysj/Exercise6.sysj line: 177, column: 5
                  reqIDLoc_o.setREQ(false);//sysj/Exercise6.sysj line: 177, column: 5
                  S3826=1;
                  active[13]=1;
                  ends[13]=1;
                  tdone[13]=1;
                }
                else {
                  S3821=0;
                  if(reqIDLoc_o.isACK()){//sysj/Exercise6.sysj line: 177, column: 5
                    reqIDLoc_o.setVal("11111");//sysj/Exercise6.sysj line: 177, column: 5
                    S3821=1;
                    if(!reqIDLoc_o.isACK()){//sysj/Exercise6.sysj line: 177, column: 5
                      reqIDLoc_o.setREQ(false);//sysj/Exercise6.sysj line: 177, column: 5
                      ends[13]=2;
                      ;//sysj/Exercise6.sysj line: 177, column: 5
                      S3819=2;
                      S3914=0;
                      if(!idLocation_in.isPartnerPresent() || idLocation_in.isPartnerPreempted()){//sysj/Exercise6.sysj line: 178, column: 5
                        idLocation_in.setACK(false);//sysj/Exercise6.sysj line: 178, column: 5
                        S3914=1;
                        active[13]=1;
                        ends[13]=1;
                        tdone[13]=1;
                      }
                      else {
                        S3909=0;
                        if(!idLocation_in.isREQ()){//sysj/Exercise6.sysj line: 178, column: 5
                          idLocation_in.setACK(true);//sysj/Exercise6.sysj line: 178, column: 5
                          S3909=1;
                          if(idLocation_in.isREQ()){//sysj/Exercise6.sysj line: 178, column: 5
                            idLocation_in.setACK(false);//sysj/Exercise6.sysj line: 178, column: 5
                            ends[13]=2;
                            ;//sysj/Exercise6.sysj line: 178, column: 5
                            zoneLocation_thread_13 = (String)(idLocation_in.getVal() == null ? null : ((String)idLocation_in.getVal()));//sysj/Exercise6.sysj line: 179, column: 5
                            S3819=3;
                            active[13]=1;
                            ends[13]=1;
                            tdone[13]=1;
                          }
                          else {
                            active[13]=1;
                            ends[13]=1;
                            tdone[13]=1;
                          }
                        }
                        else {
                          active[13]=1;
                          ends[13]=1;
                          tdone[13]=1;
                        }
                      }
                    }
                    else {
                      active[13]=1;
                      ends[13]=1;
                      tdone[13]=1;
                    }
                  }
                  else {
                    active[13]=1;
                    ends[13]=1;
                    tdone[13]=1;
                  }
                }
                break;
              
            }
            break;
          
          case 2 : 
            switch(S3914){
              case 0 : 
                if(!idLocation_in.isPartnerPresent() || idLocation_in.isPartnerPreempted()){//sysj/Exercise6.sysj line: 178, column: 5
                  idLocation_in.setACK(false);//sysj/Exercise6.sysj line: 178, column: 5
                  S3914=1;
                  active[13]=1;
                  ends[13]=1;
                  tdone[13]=1;
                }
                else {
                  switch(S3909){
                    case 0 : 
                      if(!idLocation_in.isREQ()){//sysj/Exercise6.sysj line: 178, column: 5
                        idLocation_in.setACK(true);//sysj/Exercise6.sysj line: 178, column: 5
                        S3909=1;
                        if(idLocation_in.isREQ()){//sysj/Exercise6.sysj line: 178, column: 5
                          idLocation_in.setACK(false);//sysj/Exercise6.sysj line: 178, column: 5
                          ends[13]=2;
                          ;//sysj/Exercise6.sysj line: 178, column: 5
                          zoneLocation_thread_13 = (String)(idLocation_in.getVal() == null ? null : ((String)idLocation_in.getVal()));//sysj/Exercise6.sysj line: 179, column: 5
                          S3819=3;
                          active[13]=1;
                          ends[13]=1;
                          tdone[13]=1;
                        }
                        else {
                          active[13]=1;
                          ends[13]=1;
                          tdone[13]=1;
                        }
                      }
                      else {
                        active[13]=1;
                        ends[13]=1;
                        tdone[13]=1;
                      }
                      break;
                    
                    case 1 : 
                      if(idLocation_in.isREQ()){//sysj/Exercise6.sysj line: 178, column: 5
                        idLocation_in.setACK(false);//sysj/Exercise6.sysj line: 178, column: 5
                        ends[13]=2;
                        ;//sysj/Exercise6.sysj line: 178, column: 5
                        zoneLocation_thread_13 = (String)(idLocation_in.getVal() == null ? null : ((String)idLocation_in.getVal()));//sysj/Exercise6.sysj line: 179, column: 5
                        S3819=3;
                        active[13]=1;
                        ends[13]=1;
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
                break;
              
              case 1 : 
                S3914=1;
                S3914=0;
                if(!idLocation_in.isPartnerPresent() || idLocation_in.isPartnerPreempted()){//sysj/Exercise6.sysj line: 178, column: 5
                  idLocation_in.setACK(false);//sysj/Exercise6.sysj line: 178, column: 5
                  S3914=1;
                  active[13]=1;
                  ends[13]=1;
                  tdone[13]=1;
                }
                else {
                  S3909=0;
                  if(!idLocation_in.isREQ()){//sysj/Exercise6.sysj line: 178, column: 5
                    idLocation_in.setACK(true);//sysj/Exercise6.sysj line: 178, column: 5
                    S3909=1;
                    if(idLocation_in.isREQ()){//sysj/Exercise6.sysj line: 178, column: 5
                      idLocation_in.setACK(false);//sysj/Exercise6.sysj line: 178, column: 5
                      ends[13]=2;
                      ;//sysj/Exercise6.sysj line: 178, column: 5
                      zoneLocation_thread_13 = (String)(idLocation_in.getVal() == null ? null : ((String)idLocation_in.getVal()));//sysj/Exercise6.sysj line: 179, column: 5
                      S3819=3;
                      active[13]=1;
                      ends[13]=1;
                      tdone[13]=1;
                    }
                    else {
                      active[13]=1;
                      ends[13]=1;
                      tdone[13]=1;
                    }
                  }
                  else {
                    active[13]=1;
                    ends[13]=1;
                    tdone[13]=1;
                  }
                }
                break;
              
            }
            break;
          
          case 3 : 
            S3819=3;
            switch (zoneLocation_thread_13) {//sysj/Exercise6.sysj line: 184, column: 5
              case "1"://sysj/Exercise6.sysj line: 185, column: 5
                zone1NumEmployee_thread_13 = zone1NumEmployee_thread_13 + 1;//sysj/Exercise6.sysj line: 186, column: 6
                break ;//sysj/Exercise6.sysj line: 187, column: 6
              case "2"://sysj/Exercise6.sysj line: 188, column: 5
                zone2NumEmployee_thread_13 = zone2NumEmployee_thread_13 + 1;//sysj/Exercise6.sysj line: 189, column: 6
                break ;//sysj/Exercise6.sysj line: 190, column: 6
              case "3"://sysj/Exercise6.sysj line: 191, column: 5
                zone3NumEmployee_thread_13 = zone3NumEmployee_thread_13 + 1;//sysj/Exercise6.sysj line: 192, column: 6
                break ;//sysj/Exercise6.sysj line: 193, column: 6
              case "7"://sysj/Exercise6.sysj line: 194, column: 5
                zone7NumEmployee_thread_13 = zone7NumEmployee_thread_13 + 1;//sysj/Exercise6.sysj line: 195, column: 6
                break ;//sysj/Exercise6.sysj line: 196, column: 6
            }
            S3819=4;
            active[13]=1;
            ends[13]=1;
            tdone[13]=1;
            break;
          
          case 4 : 
            S3819=4;
            S3819=5;
            S4046=0;
            if(!reqAuthCheck_o.isPartnerPresent() || reqAuthCheck_o.isPartnerPreempted()){//sysj/Exercise6.sysj line: 200, column: 5
              reqAuthCheck_o.setREQ(false);//sysj/Exercise6.sysj line: 200, column: 5
              S4046=1;
              active[13]=1;
              ends[13]=1;
              tdone[13]=1;
            }
            else {
              S4041=0;
              if(reqAuthCheck_o.isACK()){//sysj/Exercise6.sysj line: 200, column: 5
                reqAuthCheck_o.setVal("11111");//sysj/Exercise6.sysj line: 200, column: 5
                S4041=1;
                if(!reqAuthCheck_o.isACK()){//sysj/Exercise6.sysj line: 200, column: 5
                  reqAuthCheck_o.setREQ(false);//sysj/Exercise6.sysj line: 200, column: 5
                  ends[13]=2;
                  ;//sysj/Exercise6.sysj line: 200, column: 5
                  S3819=6;
                  S4090=0;
                  if(!idAuthResponse_in.isPartnerPresent() || idAuthResponse_in.isPartnerPreempted()){//sysj/Exercise6.sysj line: 201, column: 5
                    idAuthResponse_in.setACK(false);//sysj/Exercise6.sysj line: 201, column: 5
                    S4090=1;
                    active[13]=1;
                    ends[13]=1;
                    tdone[13]=1;
                  }
                  else {
                    S4085=0;
                    if(!idAuthResponse_in.isREQ()){//sysj/Exercise6.sysj line: 201, column: 5
                      idAuthResponse_in.setACK(true);//sysj/Exercise6.sysj line: 201, column: 5
                      S4085=1;
                      if(idAuthResponse_in.isREQ()){//sysj/Exercise6.sysj line: 201, column: 5
                        idAuthResponse_in.setACK(false);//sysj/Exercise6.sysj line: 201, column: 5
                        ends[13]=2;
                        ;//sysj/Exercise6.sysj line: 201, column: 5
                        response_thread_13 = (idAuthResponse_in.getVal() == null ? false : ((Boolean)idAuthResponse_in.getVal()).booleanValue());//sysj/Exercise6.sysj line: 203, column: 5
                        if(response_thread_13 == false){//sysj/Exercise6.sysj line: 206, column: 9
                          if(zoneLocation_thread_13 == "1"){//sysj/Exercise6.sysj line: 209, column: 7
                            System.out.println("Unauthorized employee found in Zone 1.");//sysj/Exercise6.sysj line: 210, column: 8
                            zone1Unauth.setPresent();//sysj/Exercise6.sysj line: 211, column: 8
                            currsigs.addElement(zone1Unauth);
                            System.out.println("Detected employees: " + zone1NumEmployee_thread_13 + " " + zone2NumEmployee_thread_13 + " " + zone3NumEmployee_thread_13 + " " + zone7NumEmployee_thread_13);//sysj/Exercise6.sysj line: 228, column: 5
                            zone1Num.setPresent();//sysj/Exercise6.sysj line: 232, column: 5
                            currsigs.addElement(zone1Num);
                            zone1Num.setValue(zone1NumEmployee_thread_13);//sysj/Exercise6.sysj line: 232, column: 5
                            zone2Num.setPresent();//sysj/Exercise6.sysj line: 233, column: 5
                            currsigs.addElement(zone2Num);
                            zone2Num.setValue(zone2NumEmployee_thread_13);//sysj/Exercise6.sysj line: 233, column: 5
                            zone3Num.setPresent();//sysj/Exercise6.sysj line: 234, column: 5
                            currsigs.addElement(zone3Num);
                            zone3Num.setValue(zone3NumEmployee_thread_13);//sysj/Exercise6.sysj line: 234, column: 5
                            zone7Num.setPresent();//sysj/Exercise6.sysj line: 235, column: 5
                            currsigs.addElement(zone7Num);
                            zone7Num.setValue(zone7NumEmployee_thread_13);//sysj/Exercise6.sysj line: 235, column: 5
                            S3819=7;
                            active[13]=1;
                            ends[13]=1;
                            tdone[13]=1;
                          }
                          else {
                            if(zoneLocation_thread_13 == "2"){//sysj/Exercise6.sysj line: 213, column: 7
                              System.out.println("Unauthorized employee found in Zone 2.");//sysj/Exercise6.sysj line: 214, column: 8
                              zone2Unauth.setPresent();//sysj/Exercise6.sysj line: 215, column: 8
                              currsigs.addElement(zone2Unauth);
                              System.out.println("Detected employees: " + zone1NumEmployee_thread_13 + " " + zone2NumEmployee_thread_13 + " " + zone3NumEmployee_thread_13 + " " + zone7NumEmployee_thread_13);//sysj/Exercise6.sysj line: 228, column: 5
                              zone1Num.setPresent();//sysj/Exercise6.sysj line: 232, column: 5
                              currsigs.addElement(zone1Num);
                              zone1Num.setValue(zone1NumEmployee_thread_13);//sysj/Exercise6.sysj line: 232, column: 5
                              zone2Num.setPresent();//sysj/Exercise6.sysj line: 233, column: 5
                              currsigs.addElement(zone2Num);
                              zone2Num.setValue(zone2NumEmployee_thread_13);//sysj/Exercise6.sysj line: 233, column: 5
                              zone3Num.setPresent();//sysj/Exercise6.sysj line: 234, column: 5
                              currsigs.addElement(zone3Num);
                              zone3Num.setValue(zone3NumEmployee_thread_13);//sysj/Exercise6.sysj line: 234, column: 5
                              zone7Num.setPresent();//sysj/Exercise6.sysj line: 235, column: 5
                              currsigs.addElement(zone7Num);
                              zone7Num.setValue(zone7NumEmployee_thread_13);//sysj/Exercise6.sysj line: 235, column: 5
                              S3819=7;
                              active[13]=1;
                              ends[13]=1;
                              tdone[13]=1;
                            }
                            else {
                              if(zoneLocation_thread_13 == "3"){//sysj/Exercise6.sysj line: 217, column: 7
                                System.out.println("Unauthorized employee found in Zone 3.");//sysj/Exercise6.sysj line: 218, column: 8
                                zone3Unauth.setPresent();//sysj/Exercise6.sysj line: 219, column: 8
                                currsigs.addElement(zone3Unauth);
                                System.out.println("Detected employees: " + zone1NumEmployee_thread_13 + " " + zone2NumEmployee_thread_13 + " " + zone3NumEmployee_thread_13 + " " + zone7NumEmployee_thread_13);//sysj/Exercise6.sysj line: 228, column: 5
                                zone1Num.setPresent();//sysj/Exercise6.sysj line: 232, column: 5
                                currsigs.addElement(zone1Num);
                                zone1Num.setValue(zone1NumEmployee_thread_13);//sysj/Exercise6.sysj line: 232, column: 5
                                zone2Num.setPresent();//sysj/Exercise6.sysj line: 233, column: 5
                                currsigs.addElement(zone2Num);
                                zone2Num.setValue(zone2NumEmployee_thread_13);//sysj/Exercise6.sysj line: 233, column: 5
                                zone3Num.setPresent();//sysj/Exercise6.sysj line: 234, column: 5
                                currsigs.addElement(zone3Num);
                                zone3Num.setValue(zone3NumEmployee_thread_13);//sysj/Exercise6.sysj line: 234, column: 5
                                zone7Num.setPresent();//sysj/Exercise6.sysj line: 235, column: 5
                                currsigs.addElement(zone7Num);
                                zone7Num.setValue(zone7NumEmployee_thread_13);//sysj/Exercise6.sysj line: 235, column: 5
                                S3819=7;
                                active[13]=1;
                                ends[13]=1;
                                tdone[13]=1;
                              }
                              else {
                                if(zoneLocation_thread_13 == "7"){//sysj/Exercise6.sysj line: 221, column: 7
                                  System.out.println("Unauthorized employee found in Zone 7.");//sysj/Exercise6.sysj line: 222, column: 8
                                  zone7Unauth.setPresent();//sysj/Exercise6.sysj line: 223, column: 8
                                  currsigs.addElement(zone7Unauth);
                                  System.out.println("Detected employees: " + zone1NumEmployee_thread_13 + " " + zone2NumEmployee_thread_13 + " " + zone3NumEmployee_thread_13 + " " + zone7NumEmployee_thread_13);//sysj/Exercise6.sysj line: 228, column: 5
                                  zone1Num.setPresent();//sysj/Exercise6.sysj line: 232, column: 5
                                  currsigs.addElement(zone1Num);
                                  zone1Num.setValue(zone1NumEmployee_thread_13);//sysj/Exercise6.sysj line: 232, column: 5
                                  zone2Num.setPresent();//sysj/Exercise6.sysj line: 233, column: 5
                                  currsigs.addElement(zone2Num);
                                  zone2Num.setValue(zone2NumEmployee_thread_13);//sysj/Exercise6.sysj line: 233, column: 5
                                  zone3Num.setPresent();//sysj/Exercise6.sysj line: 234, column: 5
                                  currsigs.addElement(zone3Num);
                                  zone3Num.setValue(zone3NumEmployee_thread_13);//sysj/Exercise6.sysj line: 234, column: 5
                                  zone7Num.setPresent();//sysj/Exercise6.sysj line: 235, column: 5
                                  currsigs.addElement(zone7Num);
                                  zone7Num.setValue(zone7NumEmployee_thread_13);//sysj/Exercise6.sysj line: 235, column: 5
                                  S3819=7;
                                  active[13]=1;
                                  ends[13]=1;
                                  tdone[13]=1;
                                }
                                else {
                                  System.out.println("Detected employees: " + zone1NumEmployee_thread_13 + " " + zone2NumEmployee_thread_13 + " " + zone3NumEmployee_thread_13 + " " + zone7NumEmployee_thread_13);//sysj/Exercise6.sysj line: 228, column: 5
                                  zone1Num.setPresent();//sysj/Exercise6.sysj line: 232, column: 5
                                  currsigs.addElement(zone1Num);
                                  zone1Num.setValue(zone1NumEmployee_thread_13);//sysj/Exercise6.sysj line: 232, column: 5
                                  zone2Num.setPresent();//sysj/Exercise6.sysj line: 233, column: 5
                                  currsigs.addElement(zone2Num);
                                  zone2Num.setValue(zone2NumEmployee_thread_13);//sysj/Exercise6.sysj line: 233, column: 5
                                  zone3Num.setPresent();//sysj/Exercise6.sysj line: 234, column: 5
                                  currsigs.addElement(zone3Num);
                                  zone3Num.setValue(zone3NumEmployee_thread_13);//sysj/Exercise6.sysj line: 234, column: 5
                                  zone7Num.setPresent();//sysj/Exercise6.sysj line: 235, column: 5
                                  currsigs.addElement(zone7Num);
                                  zone7Num.setValue(zone7NumEmployee_thread_13);//sysj/Exercise6.sysj line: 235, column: 5
                                  S3819=7;
                                  active[13]=1;
                                  ends[13]=1;
                                  tdone[13]=1;
                                }
                              }
                            }
                          }
                        }
                        else {
                          System.out.println("Detected employees: " + zone1NumEmployee_thread_13 + " " + zone2NumEmployee_thread_13 + " " + zone3NumEmployee_thread_13 + " " + zone7NumEmployee_thread_13);//sysj/Exercise6.sysj line: 228, column: 5
                          zone1Num.setPresent();//sysj/Exercise6.sysj line: 232, column: 5
                          currsigs.addElement(zone1Num);
                          zone1Num.setValue(zone1NumEmployee_thread_13);//sysj/Exercise6.sysj line: 232, column: 5
                          zone2Num.setPresent();//sysj/Exercise6.sysj line: 233, column: 5
                          currsigs.addElement(zone2Num);
                          zone2Num.setValue(zone2NumEmployee_thread_13);//sysj/Exercise6.sysj line: 233, column: 5
                          zone3Num.setPresent();//sysj/Exercise6.sysj line: 234, column: 5
                          currsigs.addElement(zone3Num);
                          zone3Num.setValue(zone3NumEmployee_thread_13);//sysj/Exercise6.sysj line: 234, column: 5
                          zone7Num.setPresent();//sysj/Exercise6.sysj line: 235, column: 5
                          currsigs.addElement(zone7Num);
                          zone7Num.setValue(zone7NumEmployee_thread_13);//sysj/Exercise6.sysj line: 235, column: 5
                          S3819=7;
                          active[13]=1;
                          ends[13]=1;
                          tdone[13]=1;
                        }
                      }
                      else {
                        active[13]=1;
                        ends[13]=1;
                        tdone[13]=1;
                      }
                    }
                    else {
                      active[13]=1;
                      ends[13]=1;
                      tdone[13]=1;
                    }
                  }
                }
                else {
                  active[13]=1;
                  ends[13]=1;
                  tdone[13]=1;
                }
              }
              else {
                active[13]=1;
                ends[13]=1;
                tdone[13]=1;
              }
            }
            break;
          
          case 5 : 
            switch(S4046){
              case 0 : 
                if(!reqAuthCheck_o.isPartnerPresent() || reqAuthCheck_o.isPartnerPreempted()){//sysj/Exercise6.sysj line: 200, column: 5
                  reqAuthCheck_o.setREQ(false);//sysj/Exercise6.sysj line: 200, column: 5
                  S4046=1;
                  active[13]=1;
                  ends[13]=1;
                  tdone[13]=1;
                }
                else {
                  switch(S4041){
                    case 0 : 
                      if(reqAuthCheck_o.isACK()){//sysj/Exercise6.sysj line: 200, column: 5
                        reqAuthCheck_o.setVal("11111");//sysj/Exercise6.sysj line: 200, column: 5
                        S4041=1;
                        if(!reqAuthCheck_o.isACK()){//sysj/Exercise6.sysj line: 200, column: 5
                          reqAuthCheck_o.setREQ(false);//sysj/Exercise6.sysj line: 200, column: 5
                          ends[13]=2;
                          ;//sysj/Exercise6.sysj line: 200, column: 5
                          S3819=6;
                          S4090=0;
                          if(!idAuthResponse_in.isPartnerPresent() || idAuthResponse_in.isPartnerPreempted()){//sysj/Exercise6.sysj line: 201, column: 5
                            idAuthResponse_in.setACK(false);//sysj/Exercise6.sysj line: 201, column: 5
                            S4090=1;
                            active[13]=1;
                            ends[13]=1;
                            tdone[13]=1;
                          }
                          else {
                            S4085=0;
                            if(!idAuthResponse_in.isREQ()){//sysj/Exercise6.sysj line: 201, column: 5
                              idAuthResponse_in.setACK(true);//sysj/Exercise6.sysj line: 201, column: 5
                              S4085=1;
                              if(idAuthResponse_in.isREQ()){//sysj/Exercise6.sysj line: 201, column: 5
                                idAuthResponse_in.setACK(false);//sysj/Exercise6.sysj line: 201, column: 5
                                ends[13]=2;
                                ;//sysj/Exercise6.sysj line: 201, column: 5
                                response_thread_13 = (idAuthResponse_in.getVal() == null ? false : ((Boolean)idAuthResponse_in.getVal()).booleanValue());//sysj/Exercise6.sysj line: 203, column: 5
                                if(response_thread_13 == false){//sysj/Exercise6.sysj line: 206, column: 9
                                  if(zoneLocation_thread_13 == "1"){//sysj/Exercise6.sysj line: 209, column: 7
                                    System.out.println("Unauthorized employee found in Zone 1.");//sysj/Exercise6.sysj line: 210, column: 8
                                    zone1Unauth.setPresent();//sysj/Exercise6.sysj line: 211, column: 8
                                    currsigs.addElement(zone1Unauth);
                                    System.out.println("Detected employees: " + zone1NumEmployee_thread_13 + " " + zone2NumEmployee_thread_13 + " " + zone3NumEmployee_thread_13 + " " + zone7NumEmployee_thread_13);//sysj/Exercise6.sysj line: 228, column: 5
                                    zone1Num.setPresent();//sysj/Exercise6.sysj line: 232, column: 5
                                    currsigs.addElement(zone1Num);
                                    zone1Num.setValue(zone1NumEmployee_thread_13);//sysj/Exercise6.sysj line: 232, column: 5
                                    zone2Num.setPresent();//sysj/Exercise6.sysj line: 233, column: 5
                                    currsigs.addElement(zone2Num);
                                    zone2Num.setValue(zone2NumEmployee_thread_13);//sysj/Exercise6.sysj line: 233, column: 5
                                    zone3Num.setPresent();//sysj/Exercise6.sysj line: 234, column: 5
                                    currsigs.addElement(zone3Num);
                                    zone3Num.setValue(zone3NumEmployee_thread_13);//sysj/Exercise6.sysj line: 234, column: 5
                                    zone7Num.setPresent();//sysj/Exercise6.sysj line: 235, column: 5
                                    currsigs.addElement(zone7Num);
                                    zone7Num.setValue(zone7NumEmployee_thread_13);//sysj/Exercise6.sysj line: 235, column: 5
                                    S3819=7;
                                    active[13]=1;
                                    ends[13]=1;
                                    tdone[13]=1;
                                  }
                                  else {
                                    if(zoneLocation_thread_13 == "2"){//sysj/Exercise6.sysj line: 213, column: 7
                                      System.out.println("Unauthorized employee found in Zone 2.");//sysj/Exercise6.sysj line: 214, column: 8
                                      zone2Unauth.setPresent();//sysj/Exercise6.sysj line: 215, column: 8
                                      currsigs.addElement(zone2Unauth);
                                      System.out.println("Detected employees: " + zone1NumEmployee_thread_13 + " " + zone2NumEmployee_thread_13 + " " + zone3NumEmployee_thread_13 + " " + zone7NumEmployee_thread_13);//sysj/Exercise6.sysj line: 228, column: 5
                                      zone1Num.setPresent();//sysj/Exercise6.sysj line: 232, column: 5
                                      currsigs.addElement(zone1Num);
                                      zone1Num.setValue(zone1NumEmployee_thread_13);//sysj/Exercise6.sysj line: 232, column: 5
                                      zone2Num.setPresent();//sysj/Exercise6.sysj line: 233, column: 5
                                      currsigs.addElement(zone2Num);
                                      zone2Num.setValue(zone2NumEmployee_thread_13);//sysj/Exercise6.sysj line: 233, column: 5
                                      zone3Num.setPresent();//sysj/Exercise6.sysj line: 234, column: 5
                                      currsigs.addElement(zone3Num);
                                      zone3Num.setValue(zone3NumEmployee_thread_13);//sysj/Exercise6.sysj line: 234, column: 5
                                      zone7Num.setPresent();//sysj/Exercise6.sysj line: 235, column: 5
                                      currsigs.addElement(zone7Num);
                                      zone7Num.setValue(zone7NumEmployee_thread_13);//sysj/Exercise6.sysj line: 235, column: 5
                                      S3819=7;
                                      active[13]=1;
                                      ends[13]=1;
                                      tdone[13]=1;
                                    }
                                    else {
                                      if(zoneLocation_thread_13 == "3"){//sysj/Exercise6.sysj line: 217, column: 7
                                        System.out.println("Unauthorized employee found in Zone 3.");//sysj/Exercise6.sysj line: 218, column: 8
                                        zone3Unauth.setPresent();//sysj/Exercise6.sysj line: 219, column: 8
                                        currsigs.addElement(zone3Unauth);
                                        System.out.println("Detected employees: " + zone1NumEmployee_thread_13 + " " + zone2NumEmployee_thread_13 + " " + zone3NumEmployee_thread_13 + " " + zone7NumEmployee_thread_13);//sysj/Exercise6.sysj line: 228, column: 5
                                        zone1Num.setPresent();//sysj/Exercise6.sysj line: 232, column: 5
                                        currsigs.addElement(zone1Num);
                                        zone1Num.setValue(zone1NumEmployee_thread_13);//sysj/Exercise6.sysj line: 232, column: 5
                                        zone2Num.setPresent();//sysj/Exercise6.sysj line: 233, column: 5
                                        currsigs.addElement(zone2Num);
                                        zone2Num.setValue(zone2NumEmployee_thread_13);//sysj/Exercise6.sysj line: 233, column: 5
                                        zone3Num.setPresent();//sysj/Exercise6.sysj line: 234, column: 5
                                        currsigs.addElement(zone3Num);
                                        zone3Num.setValue(zone3NumEmployee_thread_13);//sysj/Exercise6.sysj line: 234, column: 5
                                        zone7Num.setPresent();//sysj/Exercise6.sysj line: 235, column: 5
                                        currsigs.addElement(zone7Num);
                                        zone7Num.setValue(zone7NumEmployee_thread_13);//sysj/Exercise6.sysj line: 235, column: 5
                                        S3819=7;
                                        active[13]=1;
                                        ends[13]=1;
                                        tdone[13]=1;
                                      }
                                      else {
                                        if(zoneLocation_thread_13 == "7"){//sysj/Exercise6.sysj line: 221, column: 7
                                          System.out.println("Unauthorized employee found in Zone 7.");//sysj/Exercise6.sysj line: 222, column: 8
                                          zone7Unauth.setPresent();//sysj/Exercise6.sysj line: 223, column: 8
                                          currsigs.addElement(zone7Unauth);
                                          System.out.println("Detected employees: " + zone1NumEmployee_thread_13 + " " + zone2NumEmployee_thread_13 + " " + zone3NumEmployee_thread_13 + " " + zone7NumEmployee_thread_13);//sysj/Exercise6.sysj line: 228, column: 5
                                          zone1Num.setPresent();//sysj/Exercise6.sysj line: 232, column: 5
                                          currsigs.addElement(zone1Num);
                                          zone1Num.setValue(zone1NumEmployee_thread_13);//sysj/Exercise6.sysj line: 232, column: 5
                                          zone2Num.setPresent();//sysj/Exercise6.sysj line: 233, column: 5
                                          currsigs.addElement(zone2Num);
                                          zone2Num.setValue(zone2NumEmployee_thread_13);//sysj/Exercise6.sysj line: 233, column: 5
                                          zone3Num.setPresent();//sysj/Exercise6.sysj line: 234, column: 5
                                          currsigs.addElement(zone3Num);
                                          zone3Num.setValue(zone3NumEmployee_thread_13);//sysj/Exercise6.sysj line: 234, column: 5
                                          zone7Num.setPresent();//sysj/Exercise6.sysj line: 235, column: 5
                                          currsigs.addElement(zone7Num);
                                          zone7Num.setValue(zone7NumEmployee_thread_13);//sysj/Exercise6.sysj line: 235, column: 5
                                          S3819=7;
                                          active[13]=1;
                                          ends[13]=1;
                                          tdone[13]=1;
                                        }
                                        else {
                                          System.out.println("Detected employees: " + zone1NumEmployee_thread_13 + " " + zone2NumEmployee_thread_13 + " " + zone3NumEmployee_thread_13 + " " + zone7NumEmployee_thread_13);//sysj/Exercise6.sysj line: 228, column: 5
                                          zone1Num.setPresent();//sysj/Exercise6.sysj line: 232, column: 5
                                          currsigs.addElement(zone1Num);
                                          zone1Num.setValue(zone1NumEmployee_thread_13);//sysj/Exercise6.sysj line: 232, column: 5
                                          zone2Num.setPresent();//sysj/Exercise6.sysj line: 233, column: 5
                                          currsigs.addElement(zone2Num);
                                          zone2Num.setValue(zone2NumEmployee_thread_13);//sysj/Exercise6.sysj line: 233, column: 5
                                          zone3Num.setPresent();//sysj/Exercise6.sysj line: 234, column: 5
                                          currsigs.addElement(zone3Num);
                                          zone3Num.setValue(zone3NumEmployee_thread_13);//sysj/Exercise6.sysj line: 234, column: 5
                                          zone7Num.setPresent();//sysj/Exercise6.sysj line: 235, column: 5
                                          currsigs.addElement(zone7Num);
                                          zone7Num.setValue(zone7NumEmployee_thread_13);//sysj/Exercise6.sysj line: 235, column: 5
                                          S3819=7;
                                          active[13]=1;
                                          ends[13]=1;
                                          tdone[13]=1;
                                        }
                                      }
                                    }
                                  }
                                }
                                else {
                                  System.out.println("Detected employees: " + zone1NumEmployee_thread_13 + " " + zone2NumEmployee_thread_13 + " " + zone3NumEmployee_thread_13 + " " + zone7NumEmployee_thread_13);//sysj/Exercise6.sysj line: 228, column: 5
                                  zone1Num.setPresent();//sysj/Exercise6.sysj line: 232, column: 5
                                  currsigs.addElement(zone1Num);
                                  zone1Num.setValue(zone1NumEmployee_thread_13);//sysj/Exercise6.sysj line: 232, column: 5
                                  zone2Num.setPresent();//sysj/Exercise6.sysj line: 233, column: 5
                                  currsigs.addElement(zone2Num);
                                  zone2Num.setValue(zone2NumEmployee_thread_13);//sysj/Exercise6.sysj line: 233, column: 5
                                  zone3Num.setPresent();//sysj/Exercise6.sysj line: 234, column: 5
                                  currsigs.addElement(zone3Num);
                                  zone3Num.setValue(zone3NumEmployee_thread_13);//sysj/Exercise6.sysj line: 234, column: 5
                                  zone7Num.setPresent();//sysj/Exercise6.sysj line: 235, column: 5
                                  currsigs.addElement(zone7Num);
                                  zone7Num.setValue(zone7NumEmployee_thread_13);//sysj/Exercise6.sysj line: 235, column: 5
                                  S3819=7;
                                  active[13]=1;
                                  ends[13]=1;
                                  tdone[13]=1;
                                }
                              }
                              else {
                                active[13]=1;
                                ends[13]=1;
                                tdone[13]=1;
                              }
                            }
                            else {
                              active[13]=1;
                              ends[13]=1;
                              tdone[13]=1;
                            }
                          }
                        }
                        else {
                          active[13]=1;
                          ends[13]=1;
                          tdone[13]=1;
                        }
                      }
                      else {
                        active[13]=1;
                        ends[13]=1;
                        tdone[13]=1;
                      }
                      break;
                    
                    case 1 : 
                      if(!reqAuthCheck_o.isACK()){//sysj/Exercise6.sysj line: 200, column: 5
                        reqAuthCheck_o.setREQ(false);//sysj/Exercise6.sysj line: 200, column: 5
                        ends[13]=2;
                        ;//sysj/Exercise6.sysj line: 200, column: 5
                        S3819=6;
                        S4090=0;
                        if(!idAuthResponse_in.isPartnerPresent() || idAuthResponse_in.isPartnerPreempted()){//sysj/Exercise6.sysj line: 201, column: 5
                          idAuthResponse_in.setACK(false);//sysj/Exercise6.sysj line: 201, column: 5
                          S4090=1;
                          active[13]=1;
                          ends[13]=1;
                          tdone[13]=1;
                        }
                        else {
                          S4085=0;
                          if(!idAuthResponse_in.isREQ()){//sysj/Exercise6.sysj line: 201, column: 5
                            idAuthResponse_in.setACK(true);//sysj/Exercise6.sysj line: 201, column: 5
                            S4085=1;
                            if(idAuthResponse_in.isREQ()){//sysj/Exercise6.sysj line: 201, column: 5
                              idAuthResponse_in.setACK(false);//sysj/Exercise6.sysj line: 201, column: 5
                              ends[13]=2;
                              ;//sysj/Exercise6.sysj line: 201, column: 5
                              response_thread_13 = (idAuthResponse_in.getVal() == null ? false : ((Boolean)idAuthResponse_in.getVal()).booleanValue());//sysj/Exercise6.sysj line: 203, column: 5
                              if(response_thread_13 == false){//sysj/Exercise6.sysj line: 206, column: 9
                                if(zoneLocation_thread_13 == "1"){//sysj/Exercise6.sysj line: 209, column: 7
                                  System.out.println("Unauthorized employee found in Zone 1.");//sysj/Exercise6.sysj line: 210, column: 8
                                  zone1Unauth.setPresent();//sysj/Exercise6.sysj line: 211, column: 8
                                  currsigs.addElement(zone1Unauth);
                                  System.out.println("Detected employees: " + zone1NumEmployee_thread_13 + " " + zone2NumEmployee_thread_13 + " " + zone3NumEmployee_thread_13 + " " + zone7NumEmployee_thread_13);//sysj/Exercise6.sysj line: 228, column: 5
                                  zone1Num.setPresent();//sysj/Exercise6.sysj line: 232, column: 5
                                  currsigs.addElement(zone1Num);
                                  zone1Num.setValue(zone1NumEmployee_thread_13);//sysj/Exercise6.sysj line: 232, column: 5
                                  zone2Num.setPresent();//sysj/Exercise6.sysj line: 233, column: 5
                                  currsigs.addElement(zone2Num);
                                  zone2Num.setValue(zone2NumEmployee_thread_13);//sysj/Exercise6.sysj line: 233, column: 5
                                  zone3Num.setPresent();//sysj/Exercise6.sysj line: 234, column: 5
                                  currsigs.addElement(zone3Num);
                                  zone3Num.setValue(zone3NumEmployee_thread_13);//sysj/Exercise6.sysj line: 234, column: 5
                                  zone7Num.setPresent();//sysj/Exercise6.sysj line: 235, column: 5
                                  currsigs.addElement(zone7Num);
                                  zone7Num.setValue(zone7NumEmployee_thread_13);//sysj/Exercise6.sysj line: 235, column: 5
                                  S3819=7;
                                  active[13]=1;
                                  ends[13]=1;
                                  tdone[13]=1;
                                }
                                else {
                                  if(zoneLocation_thread_13 == "2"){//sysj/Exercise6.sysj line: 213, column: 7
                                    System.out.println("Unauthorized employee found in Zone 2.");//sysj/Exercise6.sysj line: 214, column: 8
                                    zone2Unauth.setPresent();//sysj/Exercise6.sysj line: 215, column: 8
                                    currsigs.addElement(zone2Unauth);
                                    System.out.println("Detected employees: " + zone1NumEmployee_thread_13 + " " + zone2NumEmployee_thread_13 + " " + zone3NumEmployee_thread_13 + " " + zone7NumEmployee_thread_13);//sysj/Exercise6.sysj line: 228, column: 5
                                    zone1Num.setPresent();//sysj/Exercise6.sysj line: 232, column: 5
                                    currsigs.addElement(zone1Num);
                                    zone1Num.setValue(zone1NumEmployee_thread_13);//sysj/Exercise6.sysj line: 232, column: 5
                                    zone2Num.setPresent();//sysj/Exercise6.sysj line: 233, column: 5
                                    currsigs.addElement(zone2Num);
                                    zone2Num.setValue(zone2NumEmployee_thread_13);//sysj/Exercise6.sysj line: 233, column: 5
                                    zone3Num.setPresent();//sysj/Exercise6.sysj line: 234, column: 5
                                    currsigs.addElement(zone3Num);
                                    zone3Num.setValue(zone3NumEmployee_thread_13);//sysj/Exercise6.sysj line: 234, column: 5
                                    zone7Num.setPresent();//sysj/Exercise6.sysj line: 235, column: 5
                                    currsigs.addElement(zone7Num);
                                    zone7Num.setValue(zone7NumEmployee_thread_13);//sysj/Exercise6.sysj line: 235, column: 5
                                    S3819=7;
                                    active[13]=1;
                                    ends[13]=1;
                                    tdone[13]=1;
                                  }
                                  else {
                                    if(zoneLocation_thread_13 == "3"){//sysj/Exercise6.sysj line: 217, column: 7
                                      System.out.println("Unauthorized employee found in Zone 3.");//sysj/Exercise6.sysj line: 218, column: 8
                                      zone3Unauth.setPresent();//sysj/Exercise6.sysj line: 219, column: 8
                                      currsigs.addElement(zone3Unauth);
                                      System.out.println("Detected employees: " + zone1NumEmployee_thread_13 + " " + zone2NumEmployee_thread_13 + " " + zone3NumEmployee_thread_13 + " " + zone7NumEmployee_thread_13);//sysj/Exercise6.sysj line: 228, column: 5
                                      zone1Num.setPresent();//sysj/Exercise6.sysj line: 232, column: 5
                                      currsigs.addElement(zone1Num);
                                      zone1Num.setValue(zone1NumEmployee_thread_13);//sysj/Exercise6.sysj line: 232, column: 5
                                      zone2Num.setPresent();//sysj/Exercise6.sysj line: 233, column: 5
                                      currsigs.addElement(zone2Num);
                                      zone2Num.setValue(zone2NumEmployee_thread_13);//sysj/Exercise6.sysj line: 233, column: 5
                                      zone3Num.setPresent();//sysj/Exercise6.sysj line: 234, column: 5
                                      currsigs.addElement(zone3Num);
                                      zone3Num.setValue(zone3NumEmployee_thread_13);//sysj/Exercise6.sysj line: 234, column: 5
                                      zone7Num.setPresent();//sysj/Exercise6.sysj line: 235, column: 5
                                      currsigs.addElement(zone7Num);
                                      zone7Num.setValue(zone7NumEmployee_thread_13);//sysj/Exercise6.sysj line: 235, column: 5
                                      S3819=7;
                                      active[13]=1;
                                      ends[13]=1;
                                      tdone[13]=1;
                                    }
                                    else {
                                      if(zoneLocation_thread_13 == "7"){//sysj/Exercise6.sysj line: 221, column: 7
                                        System.out.println("Unauthorized employee found in Zone 7.");//sysj/Exercise6.sysj line: 222, column: 8
                                        zone7Unauth.setPresent();//sysj/Exercise6.sysj line: 223, column: 8
                                        currsigs.addElement(zone7Unauth);
                                        System.out.println("Detected employees: " + zone1NumEmployee_thread_13 + " " + zone2NumEmployee_thread_13 + " " + zone3NumEmployee_thread_13 + " " + zone7NumEmployee_thread_13);//sysj/Exercise6.sysj line: 228, column: 5
                                        zone1Num.setPresent();//sysj/Exercise6.sysj line: 232, column: 5
                                        currsigs.addElement(zone1Num);
                                        zone1Num.setValue(zone1NumEmployee_thread_13);//sysj/Exercise6.sysj line: 232, column: 5
                                        zone2Num.setPresent();//sysj/Exercise6.sysj line: 233, column: 5
                                        currsigs.addElement(zone2Num);
                                        zone2Num.setValue(zone2NumEmployee_thread_13);//sysj/Exercise6.sysj line: 233, column: 5
                                        zone3Num.setPresent();//sysj/Exercise6.sysj line: 234, column: 5
                                        currsigs.addElement(zone3Num);
                                        zone3Num.setValue(zone3NumEmployee_thread_13);//sysj/Exercise6.sysj line: 234, column: 5
                                        zone7Num.setPresent();//sysj/Exercise6.sysj line: 235, column: 5
                                        currsigs.addElement(zone7Num);
                                        zone7Num.setValue(zone7NumEmployee_thread_13);//sysj/Exercise6.sysj line: 235, column: 5
                                        S3819=7;
                                        active[13]=1;
                                        ends[13]=1;
                                        tdone[13]=1;
                                      }
                                      else {
                                        System.out.println("Detected employees: " + zone1NumEmployee_thread_13 + " " + zone2NumEmployee_thread_13 + " " + zone3NumEmployee_thread_13 + " " + zone7NumEmployee_thread_13);//sysj/Exercise6.sysj line: 228, column: 5
                                        zone1Num.setPresent();//sysj/Exercise6.sysj line: 232, column: 5
                                        currsigs.addElement(zone1Num);
                                        zone1Num.setValue(zone1NumEmployee_thread_13);//sysj/Exercise6.sysj line: 232, column: 5
                                        zone2Num.setPresent();//sysj/Exercise6.sysj line: 233, column: 5
                                        currsigs.addElement(zone2Num);
                                        zone2Num.setValue(zone2NumEmployee_thread_13);//sysj/Exercise6.sysj line: 233, column: 5
                                        zone3Num.setPresent();//sysj/Exercise6.sysj line: 234, column: 5
                                        currsigs.addElement(zone3Num);
                                        zone3Num.setValue(zone3NumEmployee_thread_13);//sysj/Exercise6.sysj line: 234, column: 5
                                        zone7Num.setPresent();//sysj/Exercise6.sysj line: 235, column: 5
                                        currsigs.addElement(zone7Num);
                                        zone7Num.setValue(zone7NumEmployee_thread_13);//sysj/Exercise6.sysj line: 235, column: 5
                                        S3819=7;
                                        active[13]=1;
                                        ends[13]=1;
                                        tdone[13]=1;
                                      }
                                    }
                                  }
                                }
                              }
                              else {
                                System.out.println("Detected employees: " + zone1NumEmployee_thread_13 + " " + zone2NumEmployee_thread_13 + " " + zone3NumEmployee_thread_13 + " " + zone7NumEmployee_thread_13);//sysj/Exercise6.sysj line: 228, column: 5
                                zone1Num.setPresent();//sysj/Exercise6.sysj line: 232, column: 5
                                currsigs.addElement(zone1Num);
                                zone1Num.setValue(zone1NumEmployee_thread_13);//sysj/Exercise6.sysj line: 232, column: 5
                                zone2Num.setPresent();//sysj/Exercise6.sysj line: 233, column: 5
                                currsigs.addElement(zone2Num);
                                zone2Num.setValue(zone2NumEmployee_thread_13);//sysj/Exercise6.sysj line: 233, column: 5
                                zone3Num.setPresent();//sysj/Exercise6.sysj line: 234, column: 5
                                currsigs.addElement(zone3Num);
                                zone3Num.setValue(zone3NumEmployee_thread_13);//sysj/Exercise6.sysj line: 234, column: 5
                                zone7Num.setPresent();//sysj/Exercise6.sysj line: 235, column: 5
                                currsigs.addElement(zone7Num);
                                zone7Num.setValue(zone7NumEmployee_thread_13);//sysj/Exercise6.sysj line: 235, column: 5
                                S3819=7;
                                active[13]=1;
                                ends[13]=1;
                                tdone[13]=1;
                              }
                            }
                            else {
                              active[13]=1;
                              ends[13]=1;
                              tdone[13]=1;
                            }
                          }
                          else {
                            active[13]=1;
                            ends[13]=1;
                            tdone[13]=1;
                          }
                        }
                      }
                      else {
                        active[13]=1;
                        ends[13]=1;
                        tdone[13]=1;
                      }
                      break;
                    
                  }
                }
                break;
              
              case 1 : 
                S4046=1;
                S4046=0;
                if(!reqAuthCheck_o.isPartnerPresent() || reqAuthCheck_o.isPartnerPreempted()){//sysj/Exercise6.sysj line: 200, column: 5
                  reqAuthCheck_o.setREQ(false);//sysj/Exercise6.sysj line: 200, column: 5
                  S4046=1;
                  active[13]=1;
                  ends[13]=1;
                  tdone[13]=1;
                }
                else {
                  S4041=0;
                  if(reqAuthCheck_o.isACK()){//sysj/Exercise6.sysj line: 200, column: 5
                    reqAuthCheck_o.setVal("11111");//sysj/Exercise6.sysj line: 200, column: 5
                    S4041=1;
                    if(!reqAuthCheck_o.isACK()){//sysj/Exercise6.sysj line: 200, column: 5
                      reqAuthCheck_o.setREQ(false);//sysj/Exercise6.sysj line: 200, column: 5
                      ends[13]=2;
                      ;//sysj/Exercise6.sysj line: 200, column: 5
                      S3819=6;
                      S4090=0;
                      if(!idAuthResponse_in.isPartnerPresent() || idAuthResponse_in.isPartnerPreempted()){//sysj/Exercise6.sysj line: 201, column: 5
                        idAuthResponse_in.setACK(false);//sysj/Exercise6.sysj line: 201, column: 5
                        S4090=1;
                        active[13]=1;
                        ends[13]=1;
                        tdone[13]=1;
                      }
                      else {
                        S4085=0;
                        if(!idAuthResponse_in.isREQ()){//sysj/Exercise6.sysj line: 201, column: 5
                          idAuthResponse_in.setACK(true);//sysj/Exercise6.sysj line: 201, column: 5
                          S4085=1;
                          if(idAuthResponse_in.isREQ()){//sysj/Exercise6.sysj line: 201, column: 5
                            idAuthResponse_in.setACK(false);//sysj/Exercise6.sysj line: 201, column: 5
                            ends[13]=2;
                            ;//sysj/Exercise6.sysj line: 201, column: 5
                            response_thread_13 = (idAuthResponse_in.getVal() == null ? false : ((Boolean)idAuthResponse_in.getVal()).booleanValue());//sysj/Exercise6.sysj line: 203, column: 5
                            if(response_thread_13 == false){//sysj/Exercise6.sysj line: 206, column: 9
                              if(zoneLocation_thread_13 == "1"){//sysj/Exercise6.sysj line: 209, column: 7
                                System.out.println("Unauthorized employee found in Zone 1.");//sysj/Exercise6.sysj line: 210, column: 8
                                zone1Unauth.setPresent();//sysj/Exercise6.sysj line: 211, column: 8
                                currsigs.addElement(zone1Unauth);
                                System.out.println("Detected employees: " + zone1NumEmployee_thread_13 + " " + zone2NumEmployee_thread_13 + " " + zone3NumEmployee_thread_13 + " " + zone7NumEmployee_thread_13);//sysj/Exercise6.sysj line: 228, column: 5
                                zone1Num.setPresent();//sysj/Exercise6.sysj line: 232, column: 5
                                currsigs.addElement(zone1Num);
                                zone1Num.setValue(zone1NumEmployee_thread_13);//sysj/Exercise6.sysj line: 232, column: 5
                                zone2Num.setPresent();//sysj/Exercise6.sysj line: 233, column: 5
                                currsigs.addElement(zone2Num);
                                zone2Num.setValue(zone2NumEmployee_thread_13);//sysj/Exercise6.sysj line: 233, column: 5
                                zone3Num.setPresent();//sysj/Exercise6.sysj line: 234, column: 5
                                currsigs.addElement(zone3Num);
                                zone3Num.setValue(zone3NumEmployee_thread_13);//sysj/Exercise6.sysj line: 234, column: 5
                                zone7Num.setPresent();//sysj/Exercise6.sysj line: 235, column: 5
                                currsigs.addElement(zone7Num);
                                zone7Num.setValue(zone7NumEmployee_thread_13);//sysj/Exercise6.sysj line: 235, column: 5
                                S3819=7;
                                active[13]=1;
                                ends[13]=1;
                                tdone[13]=1;
                              }
                              else {
                                if(zoneLocation_thread_13 == "2"){//sysj/Exercise6.sysj line: 213, column: 7
                                  System.out.println("Unauthorized employee found in Zone 2.");//sysj/Exercise6.sysj line: 214, column: 8
                                  zone2Unauth.setPresent();//sysj/Exercise6.sysj line: 215, column: 8
                                  currsigs.addElement(zone2Unauth);
                                  System.out.println("Detected employees: " + zone1NumEmployee_thread_13 + " " + zone2NumEmployee_thread_13 + " " + zone3NumEmployee_thread_13 + " " + zone7NumEmployee_thread_13);//sysj/Exercise6.sysj line: 228, column: 5
                                  zone1Num.setPresent();//sysj/Exercise6.sysj line: 232, column: 5
                                  currsigs.addElement(zone1Num);
                                  zone1Num.setValue(zone1NumEmployee_thread_13);//sysj/Exercise6.sysj line: 232, column: 5
                                  zone2Num.setPresent();//sysj/Exercise6.sysj line: 233, column: 5
                                  currsigs.addElement(zone2Num);
                                  zone2Num.setValue(zone2NumEmployee_thread_13);//sysj/Exercise6.sysj line: 233, column: 5
                                  zone3Num.setPresent();//sysj/Exercise6.sysj line: 234, column: 5
                                  currsigs.addElement(zone3Num);
                                  zone3Num.setValue(zone3NumEmployee_thread_13);//sysj/Exercise6.sysj line: 234, column: 5
                                  zone7Num.setPresent();//sysj/Exercise6.sysj line: 235, column: 5
                                  currsigs.addElement(zone7Num);
                                  zone7Num.setValue(zone7NumEmployee_thread_13);//sysj/Exercise6.sysj line: 235, column: 5
                                  S3819=7;
                                  active[13]=1;
                                  ends[13]=1;
                                  tdone[13]=1;
                                }
                                else {
                                  if(zoneLocation_thread_13 == "3"){//sysj/Exercise6.sysj line: 217, column: 7
                                    System.out.println("Unauthorized employee found in Zone 3.");//sysj/Exercise6.sysj line: 218, column: 8
                                    zone3Unauth.setPresent();//sysj/Exercise6.sysj line: 219, column: 8
                                    currsigs.addElement(zone3Unauth);
                                    System.out.println("Detected employees: " + zone1NumEmployee_thread_13 + " " + zone2NumEmployee_thread_13 + " " + zone3NumEmployee_thread_13 + " " + zone7NumEmployee_thread_13);//sysj/Exercise6.sysj line: 228, column: 5
                                    zone1Num.setPresent();//sysj/Exercise6.sysj line: 232, column: 5
                                    currsigs.addElement(zone1Num);
                                    zone1Num.setValue(zone1NumEmployee_thread_13);//sysj/Exercise6.sysj line: 232, column: 5
                                    zone2Num.setPresent();//sysj/Exercise6.sysj line: 233, column: 5
                                    currsigs.addElement(zone2Num);
                                    zone2Num.setValue(zone2NumEmployee_thread_13);//sysj/Exercise6.sysj line: 233, column: 5
                                    zone3Num.setPresent();//sysj/Exercise6.sysj line: 234, column: 5
                                    currsigs.addElement(zone3Num);
                                    zone3Num.setValue(zone3NumEmployee_thread_13);//sysj/Exercise6.sysj line: 234, column: 5
                                    zone7Num.setPresent();//sysj/Exercise6.sysj line: 235, column: 5
                                    currsigs.addElement(zone7Num);
                                    zone7Num.setValue(zone7NumEmployee_thread_13);//sysj/Exercise6.sysj line: 235, column: 5
                                    S3819=7;
                                    active[13]=1;
                                    ends[13]=1;
                                    tdone[13]=1;
                                  }
                                  else {
                                    if(zoneLocation_thread_13 == "7"){//sysj/Exercise6.sysj line: 221, column: 7
                                      System.out.println("Unauthorized employee found in Zone 7.");//sysj/Exercise6.sysj line: 222, column: 8
                                      zone7Unauth.setPresent();//sysj/Exercise6.sysj line: 223, column: 8
                                      currsigs.addElement(zone7Unauth);
                                      System.out.println("Detected employees: " + zone1NumEmployee_thread_13 + " " + zone2NumEmployee_thread_13 + " " + zone3NumEmployee_thread_13 + " " + zone7NumEmployee_thread_13);//sysj/Exercise6.sysj line: 228, column: 5
                                      zone1Num.setPresent();//sysj/Exercise6.sysj line: 232, column: 5
                                      currsigs.addElement(zone1Num);
                                      zone1Num.setValue(zone1NumEmployee_thread_13);//sysj/Exercise6.sysj line: 232, column: 5
                                      zone2Num.setPresent();//sysj/Exercise6.sysj line: 233, column: 5
                                      currsigs.addElement(zone2Num);
                                      zone2Num.setValue(zone2NumEmployee_thread_13);//sysj/Exercise6.sysj line: 233, column: 5
                                      zone3Num.setPresent();//sysj/Exercise6.sysj line: 234, column: 5
                                      currsigs.addElement(zone3Num);
                                      zone3Num.setValue(zone3NumEmployee_thread_13);//sysj/Exercise6.sysj line: 234, column: 5
                                      zone7Num.setPresent();//sysj/Exercise6.sysj line: 235, column: 5
                                      currsigs.addElement(zone7Num);
                                      zone7Num.setValue(zone7NumEmployee_thread_13);//sysj/Exercise6.sysj line: 235, column: 5
                                      S3819=7;
                                      active[13]=1;
                                      ends[13]=1;
                                      tdone[13]=1;
                                    }
                                    else {
                                      System.out.println("Detected employees: " + zone1NumEmployee_thread_13 + " " + zone2NumEmployee_thread_13 + " " + zone3NumEmployee_thread_13 + " " + zone7NumEmployee_thread_13);//sysj/Exercise6.sysj line: 228, column: 5
                                      zone1Num.setPresent();//sysj/Exercise6.sysj line: 232, column: 5
                                      currsigs.addElement(zone1Num);
                                      zone1Num.setValue(zone1NumEmployee_thread_13);//sysj/Exercise6.sysj line: 232, column: 5
                                      zone2Num.setPresent();//sysj/Exercise6.sysj line: 233, column: 5
                                      currsigs.addElement(zone2Num);
                                      zone2Num.setValue(zone2NumEmployee_thread_13);//sysj/Exercise6.sysj line: 233, column: 5
                                      zone3Num.setPresent();//sysj/Exercise6.sysj line: 234, column: 5
                                      currsigs.addElement(zone3Num);
                                      zone3Num.setValue(zone3NumEmployee_thread_13);//sysj/Exercise6.sysj line: 234, column: 5
                                      zone7Num.setPresent();//sysj/Exercise6.sysj line: 235, column: 5
                                      currsigs.addElement(zone7Num);
                                      zone7Num.setValue(zone7NumEmployee_thread_13);//sysj/Exercise6.sysj line: 235, column: 5
                                      S3819=7;
                                      active[13]=1;
                                      ends[13]=1;
                                      tdone[13]=1;
                                    }
                                  }
                                }
                              }
                            }
                            else {
                              System.out.println("Detected employees: " + zone1NumEmployee_thread_13 + " " + zone2NumEmployee_thread_13 + " " + zone3NumEmployee_thread_13 + " " + zone7NumEmployee_thread_13);//sysj/Exercise6.sysj line: 228, column: 5
                              zone1Num.setPresent();//sysj/Exercise6.sysj line: 232, column: 5
                              currsigs.addElement(zone1Num);
                              zone1Num.setValue(zone1NumEmployee_thread_13);//sysj/Exercise6.sysj line: 232, column: 5
                              zone2Num.setPresent();//sysj/Exercise6.sysj line: 233, column: 5
                              currsigs.addElement(zone2Num);
                              zone2Num.setValue(zone2NumEmployee_thread_13);//sysj/Exercise6.sysj line: 233, column: 5
                              zone3Num.setPresent();//sysj/Exercise6.sysj line: 234, column: 5
                              currsigs.addElement(zone3Num);
                              zone3Num.setValue(zone3NumEmployee_thread_13);//sysj/Exercise6.sysj line: 234, column: 5
                              zone7Num.setPresent();//sysj/Exercise6.sysj line: 235, column: 5
                              currsigs.addElement(zone7Num);
                              zone7Num.setValue(zone7NumEmployee_thread_13);//sysj/Exercise6.sysj line: 235, column: 5
                              S3819=7;
                              active[13]=1;
                              ends[13]=1;
                              tdone[13]=1;
                            }
                          }
                          else {
                            active[13]=1;
                            ends[13]=1;
                            tdone[13]=1;
                          }
                        }
                        else {
                          active[13]=1;
                          ends[13]=1;
                          tdone[13]=1;
                        }
                      }
                    }
                    else {
                      active[13]=1;
                      ends[13]=1;
                      tdone[13]=1;
                    }
                  }
                  else {
                    active[13]=1;
                    ends[13]=1;
                    tdone[13]=1;
                  }
                }
                break;
              
            }
            break;
          
          case 6 : 
            switch(S4090){
              case 0 : 
                if(!idAuthResponse_in.isPartnerPresent() || idAuthResponse_in.isPartnerPreempted()){//sysj/Exercise6.sysj line: 201, column: 5
                  idAuthResponse_in.setACK(false);//sysj/Exercise6.sysj line: 201, column: 5
                  S4090=1;
                  active[13]=1;
                  ends[13]=1;
                  tdone[13]=1;
                }
                else {
                  switch(S4085){
                    case 0 : 
                      if(!idAuthResponse_in.isREQ()){//sysj/Exercise6.sysj line: 201, column: 5
                        idAuthResponse_in.setACK(true);//sysj/Exercise6.sysj line: 201, column: 5
                        S4085=1;
                        if(idAuthResponse_in.isREQ()){//sysj/Exercise6.sysj line: 201, column: 5
                          idAuthResponse_in.setACK(false);//sysj/Exercise6.sysj line: 201, column: 5
                          ends[13]=2;
                          ;//sysj/Exercise6.sysj line: 201, column: 5
                          response_thread_13 = (idAuthResponse_in.getVal() == null ? false : ((Boolean)idAuthResponse_in.getVal()).booleanValue());//sysj/Exercise6.sysj line: 203, column: 5
                          if(response_thread_13 == false){//sysj/Exercise6.sysj line: 206, column: 9
                            if(zoneLocation_thread_13 == "1"){//sysj/Exercise6.sysj line: 209, column: 7
                              System.out.println("Unauthorized employee found in Zone 1.");//sysj/Exercise6.sysj line: 210, column: 8
                              zone1Unauth.setPresent();//sysj/Exercise6.sysj line: 211, column: 8
                              currsigs.addElement(zone1Unauth);
                              System.out.println("Detected employees: " + zone1NumEmployee_thread_13 + " " + zone2NumEmployee_thread_13 + " " + zone3NumEmployee_thread_13 + " " + zone7NumEmployee_thread_13);//sysj/Exercise6.sysj line: 228, column: 5
                              zone1Num.setPresent();//sysj/Exercise6.sysj line: 232, column: 5
                              currsigs.addElement(zone1Num);
                              zone1Num.setValue(zone1NumEmployee_thread_13);//sysj/Exercise6.sysj line: 232, column: 5
                              zone2Num.setPresent();//sysj/Exercise6.sysj line: 233, column: 5
                              currsigs.addElement(zone2Num);
                              zone2Num.setValue(zone2NumEmployee_thread_13);//sysj/Exercise6.sysj line: 233, column: 5
                              zone3Num.setPresent();//sysj/Exercise6.sysj line: 234, column: 5
                              currsigs.addElement(zone3Num);
                              zone3Num.setValue(zone3NumEmployee_thread_13);//sysj/Exercise6.sysj line: 234, column: 5
                              zone7Num.setPresent();//sysj/Exercise6.sysj line: 235, column: 5
                              currsigs.addElement(zone7Num);
                              zone7Num.setValue(zone7NumEmployee_thread_13);//sysj/Exercise6.sysj line: 235, column: 5
                              S3819=7;
                              active[13]=1;
                              ends[13]=1;
                              tdone[13]=1;
                            }
                            else {
                              if(zoneLocation_thread_13 == "2"){//sysj/Exercise6.sysj line: 213, column: 7
                                System.out.println("Unauthorized employee found in Zone 2.");//sysj/Exercise6.sysj line: 214, column: 8
                                zone2Unauth.setPresent();//sysj/Exercise6.sysj line: 215, column: 8
                                currsigs.addElement(zone2Unauth);
                                System.out.println("Detected employees: " + zone1NumEmployee_thread_13 + " " + zone2NumEmployee_thread_13 + " " + zone3NumEmployee_thread_13 + " " + zone7NumEmployee_thread_13);//sysj/Exercise6.sysj line: 228, column: 5
                                zone1Num.setPresent();//sysj/Exercise6.sysj line: 232, column: 5
                                currsigs.addElement(zone1Num);
                                zone1Num.setValue(zone1NumEmployee_thread_13);//sysj/Exercise6.sysj line: 232, column: 5
                                zone2Num.setPresent();//sysj/Exercise6.sysj line: 233, column: 5
                                currsigs.addElement(zone2Num);
                                zone2Num.setValue(zone2NumEmployee_thread_13);//sysj/Exercise6.sysj line: 233, column: 5
                                zone3Num.setPresent();//sysj/Exercise6.sysj line: 234, column: 5
                                currsigs.addElement(zone3Num);
                                zone3Num.setValue(zone3NumEmployee_thread_13);//sysj/Exercise6.sysj line: 234, column: 5
                                zone7Num.setPresent();//sysj/Exercise6.sysj line: 235, column: 5
                                currsigs.addElement(zone7Num);
                                zone7Num.setValue(zone7NumEmployee_thread_13);//sysj/Exercise6.sysj line: 235, column: 5
                                S3819=7;
                                active[13]=1;
                                ends[13]=1;
                                tdone[13]=1;
                              }
                              else {
                                if(zoneLocation_thread_13 == "3"){//sysj/Exercise6.sysj line: 217, column: 7
                                  System.out.println("Unauthorized employee found in Zone 3.");//sysj/Exercise6.sysj line: 218, column: 8
                                  zone3Unauth.setPresent();//sysj/Exercise6.sysj line: 219, column: 8
                                  currsigs.addElement(zone3Unauth);
                                  System.out.println("Detected employees: " + zone1NumEmployee_thread_13 + " " + zone2NumEmployee_thread_13 + " " + zone3NumEmployee_thread_13 + " " + zone7NumEmployee_thread_13);//sysj/Exercise6.sysj line: 228, column: 5
                                  zone1Num.setPresent();//sysj/Exercise6.sysj line: 232, column: 5
                                  currsigs.addElement(zone1Num);
                                  zone1Num.setValue(zone1NumEmployee_thread_13);//sysj/Exercise6.sysj line: 232, column: 5
                                  zone2Num.setPresent();//sysj/Exercise6.sysj line: 233, column: 5
                                  currsigs.addElement(zone2Num);
                                  zone2Num.setValue(zone2NumEmployee_thread_13);//sysj/Exercise6.sysj line: 233, column: 5
                                  zone3Num.setPresent();//sysj/Exercise6.sysj line: 234, column: 5
                                  currsigs.addElement(zone3Num);
                                  zone3Num.setValue(zone3NumEmployee_thread_13);//sysj/Exercise6.sysj line: 234, column: 5
                                  zone7Num.setPresent();//sysj/Exercise6.sysj line: 235, column: 5
                                  currsigs.addElement(zone7Num);
                                  zone7Num.setValue(zone7NumEmployee_thread_13);//sysj/Exercise6.sysj line: 235, column: 5
                                  S3819=7;
                                  active[13]=1;
                                  ends[13]=1;
                                  tdone[13]=1;
                                }
                                else {
                                  if(zoneLocation_thread_13 == "7"){//sysj/Exercise6.sysj line: 221, column: 7
                                    System.out.println("Unauthorized employee found in Zone 7.");//sysj/Exercise6.sysj line: 222, column: 8
                                    zone7Unauth.setPresent();//sysj/Exercise6.sysj line: 223, column: 8
                                    currsigs.addElement(zone7Unauth);
                                    System.out.println("Detected employees: " + zone1NumEmployee_thread_13 + " " + zone2NumEmployee_thread_13 + " " + zone3NumEmployee_thread_13 + " " + zone7NumEmployee_thread_13);//sysj/Exercise6.sysj line: 228, column: 5
                                    zone1Num.setPresent();//sysj/Exercise6.sysj line: 232, column: 5
                                    currsigs.addElement(zone1Num);
                                    zone1Num.setValue(zone1NumEmployee_thread_13);//sysj/Exercise6.sysj line: 232, column: 5
                                    zone2Num.setPresent();//sysj/Exercise6.sysj line: 233, column: 5
                                    currsigs.addElement(zone2Num);
                                    zone2Num.setValue(zone2NumEmployee_thread_13);//sysj/Exercise6.sysj line: 233, column: 5
                                    zone3Num.setPresent();//sysj/Exercise6.sysj line: 234, column: 5
                                    currsigs.addElement(zone3Num);
                                    zone3Num.setValue(zone3NumEmployee_thread_13);//sysj/Exercise6.sysj line: 234, column: 5
                                    zone7Num.setPresent();//sysj/Exercise6.sysj line: 235, column: 5
                                    currsigs.addElement(zone7Num);
                                    zone7Num.setValue(zone7NumEmployee_thread_13);//sysj/Exercise6.sysj line: 235, column: 5
                                    S3819=7;
                                    active[13]=1;
                                    ends[13]=1;
                                    tdone[13]=1;
                                  }
                                  else {
                                    System.out.println("Detected employees: " + zone1NumEmployee_thread_13 + " " + zone2NumEmployee_thread_13 + " " + zone3NumEmployee_thread_13 + " " + zone7NumEmployee_thread_13);//sysj/Exercise6.sysj line: 228, column: 5
                                    zone1Num.setPresent();//sysj/Exercise6.sysj line: 232, column: 5
                                    currsigs.addElement(zone1Num);
                                    zone1Num.setValue(zone1NumEmployee_thread_13);//sysj/Exercise6.sysj line: 232, column: 5
                                    zone2Num.setPresent();//sysj/Exercise6.sysj line: 233, column: 5
                                    currsigs.addElement(zone2Num);
                                    zone2Num.setValue(zone2NumEmployee_thread_13);//sysj/Exercise6.sysj line: 233, column: 5
                                    zone3Num.setPresent();//sysj/Exercise6.sysj line: 234, column: 5
                                    currsigs.addElement(zone3Num);
                                    zone3Num.setValue(zone3NumEmployee_thread_13);//sysj/Exercise6.sysj line: 234, column: 5
                                    zone7Num.setPresent();//sysj/Exercise6.sysj line: 235, column: 5
                                    currsigs.addElement(zone7Num);
                                    zone7Num.setValue(zone7NumEmployee_thread_13);//sysj/Exercise6.sysj line: 235, column: 5
                                    S3819=7;
                                    active[13]=1;
                                    ends[13]=1;
                                    tdone[13]=1;
                                  }
                                }
                              }
                            }
                          }
                          else {
                            System.out.println("Detected employees: " + zone1NumEmployee_thread_13 + " " + zone2NumEmployee_thread_13 + " " + zone3NumEmployee_thread_13 + " " + zone7NumEmployee_thread_13);//sysj/Exercise6.sysj line: 228, column: 5
                            zone1Num.setPresent();//sysj/Exercise6.sysj line: 232, column: 5
                            currsigs.addElement(zone1Num);
                            zone1Num.setValue(zone1NumEmployee_thread_13);//sysj/Exercise6.sysj line: 232, column: 5
                            zone2Num.setPresent();//sysj/Exercise6.sysj line: 233, column: 5
                            currsigs.addElement(zone2Num);
                            zone2Num.setValue(zone2NumEmployee_thread_13);//sysj/Exercise6.sysj line: 233, column: 5
                            zone3Num.setPresent();//sysj/Exercise6.sysj line: 234, column: 5
                            currsigs.addElement(zone3Num);
                            zone3Num.setValue(zone3NumEmployee_thread_13);//sysj/Exercise6.sysj line: 234, column: 5
                            zone7Num.setPresent();//sysj/Exercise6.sysj line: 235, column: 5
                            currsigs.addElement(zone7Num);
                            zone7Num.setValue(zone7NumEmployee_thread_13);//sysj/Exercise6.sysj line: 235, column: 5
                            S3819=7;
                            active[13]=1;
                            ends[13]=1;
                            tdone[13]=1;
                          }
                        }
                        else {
                          active[13]=1;
                          ends[13]=1;
                          tdone[13]=1;
                        }
                      }
                      else {
                        active[13]=1;
                        ends[13]=1;
                        tdone[13]=1;
                      }
                      break;
                    
                    case 1 : 
                      if(idAuthResponse_in.isREQ()){//sysj/Exercise6.sysj line: 201, column: 5
                        idAuthResponse_in.setACK(false);//sysj/Exercise6.sysj line: 201, column: 5
                        ends[13]=2;
                        ;//sysj/Exercise6.sysj line: 201, column: 5
                        response_thread_13 = (idAuthResponse_in.getVal() == null ? false : ((Boolean)idAuthResponse_in.getVal()).booleanValue());//sysj/Exercise6.sysj line: 203, column: 5
                        if(response_thread_13 == false){//sysj/Exercise6.sysj line: 206, column: 9
                          if(zoneLocation_thread_13 == "1"){//sysj/Exercise6.sysj line: 209, column: 7
                            System.out.println("Unauthorized employee found in Zone 1.");//sysj/Exercise6.sysj line: 210, column: 8
                            zone1Unauth.setPresent();//sysj/Exercise6.sysj line: 211, column: 8
                            currsigs.addElement(zone1Unauth);
                            System.out.println("Detected employees: " + zone1NumEmployee_thread_13 + " " + zone2NumEmployee_thread_13 + " " + zone3NumEmployee_thread_13 + " " + zone7NumEmployee_thread_13);//sysj/Exercise6.sysj line: 228, column: 5
                            zone1Num.setPresent();//sysj/Exercise6.sysj line: 232, column: 5
                            currsigs.addElement(zone1Num);
                            zone1Num.setValue(zone1NumEmployee_thread_13);//sysj/Exercise6.sysj line: 232, column: 5
                            zone2Num.setPresent();//sysj/Exercise6.sysj line: 233, column: 5
                            currsigs.addElement(zone2Num);
                            zone2Num.setValue(zone2NumEmployee_thread_13);//sysj/Exercise6.sysj line: 233, column: 5
                            zone3Num.setPresent();//sysj/Exercise6.sysj line: 234, column: 5
                            currsigs.addElement(zone3Num);
                            zone3Num.setValue(zone3NumEmployee_thread_13);//sysj/Exercise6.sysj line: 234, column: 5
                            zone7Num.setPresent();//sysj/Exercise6.sysj line: 235, column: 5
                            currsigs.addElement(zone7Num);
                            zone7Num.setValue(zone7NumEmployee_thread_13);//sysj/Exercise6.sysj line: 235, column: 5
                            S3819=7;
                            active[13]=1;
                            ends[13]=1;
                            tdone[13]=1;
                          }
                          else {
                            if(zoneLocation_thread_13 == "2"){//sysj/Exercise6.sysj line: 213, column: 7
                              System.out.println("Unauthorized employee found in Zone 2.");//sysj/Exercise6.sysj line: 214, column: 8
                              zone2Unauth.setPresent();//sysj/Exercise6.sysj line: 215, column: 8
                              currsigs.addElement(zone2Unauth);
                              System.out.println("Detected employees: " + zone1NumEmployee_thread_13 + " " + zone2NumEmployee_thread_13 + " " + zone3NumEmployee_thread_13 + " " + zone7NumEmployee_thread_13);//sysj/Exercise6.sysj line: 228, column: 5
                              zone1Num.setPresent();//sysj/Exercise6.sysj line: 232, column: 5
                              currsigs.addElement(zone1Num);
                              zone1Num.setValue(zone1NumEmployee_thread_13);//sysj/Exercise6.sysj line: 232, column: 5
                              zone2Num.setPresent();//sysj/Exercise6.sysj line: 233, column: 5
                              currsigs.addElement(zone2Num);
                              zone2Num.setValue(zone2NumEmployee_thread_13);//sysj/Exercise6.sysj line: 233, column: 5
                              zone3Num.setPresent();//sysj/Exercise6.sysj line: 234, column: 5
                              currsigs.addElement(zone3Num);
                              zone3Num.setValue(zone3NumEmployee_thread_13);//sysj/Exercise6.sysj line: 234, column: 5
                              zone7Num.setPresent();//sysj/Exercise6.sysj line: 235, column: 5
                              currsigs.addElement(zone7Num);
                              zone7Num.setValue(zone7NumEmployee_thread_13);//sysj/Exercise6.sysj line: 235, column: 5
                              S3819=7;
                              active[13]=1;
                              ends[13]=1;
                              tdone[13]=1;
                            }
                            else {
                              if(zoneLocation_thread_13 == "3"){//sysj/Exercise6.sysj line: 217, column: 7
                                System.out.println("Unauthorized employee found in Zone 3.");//sysj/Exercise6.sysj line: 218, column: 8
                                zone3Unauth.setPresent();//sysj/Exercise6.sysj line: 219, column: 8
                                currsigs.addElement(zone3Unauth);
                                System.out.println("Detected employees: " + zone1NumEmployee_thread_13 + " " + zone2NumEmployee_thread_13 + " " + zone3NumEmployee_thread_13 + " " + zone7NumEmployee_thread_13);//sysj/Exercise6.sysj line: 228, column: 5
                                zone1Num.setPresent();//sysj/Exercise6.sysj line: 232, column: 5
                                currsigs.addElement(zone1Num);
                                zone1Num.setValue(zone1NumEmployee_thread_13);//sysj/Exercise6.sysj line: 232, column: 5
                                zone2Num.setPresent();//sysj/Exercise6.sysj line: 233, column: 5
                                currsigs.addElement(zone2Num);
                                zone2Num.setValue(zone2NumEmployee_thread_13);//sysj/Exercise6.sysj line: 233, column: 5
                                zone3Num.setPresent();//sysj/Exercise6.sysj line: 234, column: 5
                                currsigs.addElement(zone3Num);
                                zone3Num.setValue(zone3NumEmployee_thread_13);//sysj/Exercise6.sysj line: 234, column: 5
                                zone7Num.setPresent();//sysj/Exercise6.sysj line: 235, column: 5
                                currsigs.addElement(zone7Num);
                                zone7Num.setValue(zone7NumEmployee_thread_13);//sysj/Exercise6.sysj line: 235, column: 5
                                S3819=7;
                                active[13]=1;
                                ends[13]=1;
                                tdone[13]=1;
                              }
                              else {
                                if(zoneLocation_thread_13 == "7"){//sysj/Exercise6.sysj line: 221, column: 7
                                  System.out.println("Unauthorized employee found in Zone 7.");//sysj/Exercise6.sysj line: 222, column: 8
                                  zone7Unauth.setPresent();//sysj/Exercise6.sysj line: 223, column: 8
                                  currsigs.addElement(zone7Unauth);
                                  System.out.println("Detected employees: " + zone1NumEmployee_thread_13 + " " + zone2NumEmployee_thread_13 + " " + zone3NumEmployee_thread_13 + " " + zone7NumEmployee_thread_13);//sysj/Exercise6.sysj line: 228, column: 5
                                  zone1Num.setPresent();//sysj/Exercise6.sysj line: 232, column: 5
                                  currsigs.addElement(zone1Num);
                                  zone1Num.setValue(zone1NumEmployee_thread_13);//sysj/Exercise6.sysj line: 232, column: 5
                                  zone2Num.setPresent();//sysj/Exercise6.sysj line: 233, column: 5
                                  currsigs.addElement(zone2Num);
                                  zone2Num.setValue(zone2NumEmployee_thread_13);//sysj/Exercise6.sysj line: 233, column: 5
                                  zone3Num.setPresent();//sysj/Exercise6.sysj line: 234, column: 5
                                  currsigs.addElement(zone3Num);
                                  zone3Num.setValue(zone3NumEmployee_thread_13);//sysj/Exercise6.sysj line: 234, column: 5
                                  zone7Num.setPresent();//sysj/Exercise6.sysj line: 235, column: 5
                                  currsigs.addElement(zone7Num);
                                  zone7Num.setValue(zone7NumEmployee_thread_13);//sysj/Exercise6.sysj line: 235, column: 5
                                  S3819=7;
                                  active[13]=1;
                                  ends[13]=1;
                                  tdone[13]=1;
                                }
                                else {
                                  System.out.println("Detected employees: " + zone1NumEmployee_thread_13 + " " + zone2NumEmployee_thread_13 + " " + zone3NumEmployee_thread_13 + " " + zone7NumEmployee_thread_13);//sysj/Exercise6.sysj line: 228, column: 5
                                  zone1Num.setPresent();//sysj/Exercise6.sysj line: 232, column: 5
                                  currsigs.addElement(zone1Num);
                                  zone1Num.setValue(zone1NumEmployee_thread_13);//sysj/Exercise6.sysj line: 232, column: 5
                                  zone2Num.setPresent();//sysj/Exercise6.sysj line: 233, column: 5
                                  currsigs.addElement(zone2Num);
                                  zone2Num.setValue(zone2NumEmployee_thread_13);//sysj/Exercise6.sysj line: 233, column: 5
                                  zone3Num.setPresent();//sysj/Exercise6.sysj line: 234, column: 5
                                  currsigs.addElement(zone3Num);
                                  zone3Num.setValue(zone3NumEmployee_thread_13);//sysj/Exercise6.sysj line: 234, column: 5
                                  zone7Num.setPresent();//sysj/Exercise6.sysj line: 235, column: 5
                                  currsigs.addElement(zone7Num);
                                  zone7Num.setValue(zone7NumEmployee_thread_13);//sysj/Exercise6.sysj line: 235, column: 5
                                  S3819=7;
                                  active[13]=1;
                                  ends[13]=1;
                                  tdone[13]=1;
                                }
                              }
                            }
                          }
                        }
                        else {
                          System.out.println("Detected employees: " + zone1NumEmployee_thread_13 + " " + zone2NumEmployee_thread_13 + " " + zone3NumEmployee_thread_13 + " " + zone7NumEmployee_thread_13);//sysj/Exercise6.sysj line: 228, column: 5
                          zone1Num.setPresent();//sysj/Exercise6.sysj line: 232, column: 5
                          currsigs.addElement(zone1Num);
                          zone1Num.setValue(zone1NumEmployee_thread_13);//sysj/Exercise6.sysj line: 232, column: 5
                          zone2Num.setPresent();//sysj/Exercise6.sysj line: 233, column: 5
                          currsigs.addElement(zone2Num);
                          zone2Num.setValue(zone2NumEmployee_thread_13);//sysj/Exercise6.sysj line: 233, column: 5
                          zone3Num.setPresent();//sysj/Exercise6.sysj line: 234, column: 5
                          currsigs.addElement(zone3Num);
                          zone3Num.setValue(zone3NumEmployee_thread_13);//sysj/Exercise6.sysj line: 234, column: 5
                          zone7Num.setPresent();//sysj/Exercise6.sysj line: 235, column: 5
                          currsigs.addElement(zone7Num);
                          zone7Num.setValue(zone7NumEmployee_thread_13);//sysj/Exercise6.sysj line: 235, column: 5
                          S3819=7;
                          active[13]=1;
                          ends[13]=1;
                          tdone[13]=1;
                        }
                      }
                      else {
                        active[13]=1;
                        ends[13]=1;
                        tdone[13]=1;
                      }
                      break;
                    
                  }
                }
                break;
              
              case 1 : 
                S4090=1;
                S4090=0;
                if(!idAuthResponse_in.isPartnerPresent() || idAuthResponse_in.isPartnerPreempted()){//sysj/Exercise6.sysj line: 201, column: 5
                  idAuthResponse_in.setACK(false);//sysj/Exercise6.sysj line: 201, column: 5
                  S4090=1;
                  active[13]=1;
                  ends[13]=1;
                  tdone[13]=1;
                }
                else {
                  S4085=0;
                  if(!idAuthResponse_in.isREQ()){//sysj/Exercise6.sysj line: 201, column: 5
                    idAuthResponse_in.setACK(true);//sysj/Exercise6.sysj line: 201, column: 5
                    S4085=1;
                    if(idAuthResponse_in.isREQ()){//sysj/Exercise6.sysj line: 201, column: 5
                      idAuthResponse_in.setACK(false);//sysj/Exercise6.sysj line: 201, column: 5
                      ends[13]=2;
                      ;//sysj/Exercise6.sysj line: 201, column: 5
                      response_thread_13 = (idAuthResponse_in.getVal() == null ? false : ((Boolean)idAuthResponse_in.getVal()).booleanValue());//sysj/Exercise6.sysj line: 203, column: 5
                      if(response_thread_13 == false){//sysj/Exercise6.sysj line: 206, column: 9
                        if(zoneLocation_thread_13 == "1"){//sysj/Exercise6.sysj line: 209, column: 7
                          System.out.println("Unauthorized employee found in Zone 1.");//sysj/Exercise6.sysj line: 210, column: 8
                          zone1Unauth.setPresent();//sysj/Exercise6.sysj line: 211, column: 8
                          currsigs.addElement(zone1Unauth);
                          System.out.println("Detected employees: " + zone1NumEmployee_thread_13 + " " + zone2NumEmployee_thread_13 + " " + zone3NumEmployee_thread_13 + " " + zone7NumEmployee_thread_13);//sysj/Exercise6.sysj line: 228, column: 5
                          zone1Num.setPresent();//sysj/Exercise6.sysj line: 232, column: 5
                          currsigs.addElement(zone1Num);
                          zone1Num.setValue(zone1NumEmployee_thread_13);//sysj/Exercise6.sysj line: 232, column: 5
                          zone2Num.setPresent();//sysj/Exercise6.sysj line: 233, column: 5
                          currsigs.addElement(zone2Num);
                          zone2Num.setValue(zone2NumEmployee_thread_13);//sysj/Exercise6.sysj line: 233, column: 5
                          zone3Num.setPresent();//sysj/Exercise6.sysj line: 234, column: 5
                          currsigs.addElement(zone3Num);
                          zone3Num.setValue(zone3NumEmployee_thread_13);//sysj/Exercise6.sysj line: 234, column: 5
                          zone7Num.setPresent();//sysj/Exercise6.sysj line: 235, column: 5
                          currsigs.addElement(zone7Num);
                          zone7Num.setValue(zone7NumEmployee_thread_13);//sysj/Exercise6.sysj line: 235, column: 5
                          S3819=7;
                          active[13]=1;
                          ends[13]=1;
                          tdone[13]=1;
                        }
                        else {
                          if(zoneLocation_thread_13 == "2"){//sysj/Exercise6.sysj line: 213, column: 7
                            System.out.println("Unauthorized employee found in Zone 2.");//sysj/Exercise6.sysj line: 214, column: 8
                            zone2Unauth.setPresent();//sysj/Exercise6.sysj line: 215, column: 8
                            currsigs.addElement(zone2Unauth);
                            System.out.println("Detected employees: " + zone1NumEmployee_thread_13 + " " + zone2NumEmployee_thread_13 + " " + zone3NumEmployee_thread_13 + " " + zone7NumEmployee_thread_13);//sysj/Exercise6.sysj line: 228, column: 5
                            zone1Num.setPresent();//sysj/Exercise6.sysj line: 232, column: 5
                            currsigs.addElement(zone1Num);
                            zone1Num.setValue(zone1NumEmployee_thread_13);//sysj/Exercise6.sysj line: 232, column: 5
                            zone2Num.setPresent();//sysj/Exercise6.sysj line: 233, column: 5
                            currsigs.addElement(zone2Num);
                            zone2Num.setValue(zone2NumEmployee_thread_13);//sysj/Exercise6.sysj line: 233, column: 5
                            zone3Num.setPresent();//sysj/Exercise6.sysj line: 234, column: 5
                            currsigs.addElement(zone3Num);
                            zone3Num.setValue(zone3NumEmployee_thread_13);//sysj/Exercise6.sysj line: 234, column: 5
                            zone7Num.setPresent();//sysj/Exercise6.sysj line: 235, column: 5
                            currsigs.addElement(zone7Num);
                            zone7Num.setValue(zone7NumEmployee_thread_13);//sysj/Exercise6.sysj line: 235, column: 5
                            S3819=7;
                            active[13]=1;
                            ends[13]=1;
                            tdone[13]=1;
                          }
                          else {
                            if(zoneLocation_thread_13 == "3"){//sysj/Exercise6.sysj line: 217, column: 7
                              System.out.println("Unauthorized employee found in Zone 3.");//sysj/Exercise6.sysj line: 218, column: 8
                              zone3Unauth.setPresent();//sysj/Exercise6.sysj line: 219, column: 8
                              currsigs.addElement(zone3Unauth);
                              System.out.println("Detected employees: " + zone1NumEmployee_thread_13 + " " + zone2NumEmployee_thread_13 + " " + zone3NumEmployee_thread_13 + " " + zone7NumEmployee_thread_13);//sysj/Exercise6.sysj line: 228, column: 5
                              zone1Num.setPresent();//sysj/Exercise6.sysj line: 232, column: 5
                              currsigs.addElement(zone1Num);
                              zone1Num.setValue(zone1NumEmployee_thread_13);//sysj/Exercise6.sysj line: 232, column: 5
                              zone2Num.setPresent();//sysj/Exercise6.sysj line: 233, column: 5
                              currsigs.addElement(zone2Num);
                              zone2Num.setValue(zone2NumEmployee_thread_13);//sysj/Exercise6.sysj line: 233, column: 5
                              zone3Num.setPresent();//sysj/Exercise6.sysj line: 234, column: 5
                              currsigs.addElement(zone3Num);
                              zone3Num.setValue(zone3NumEmployee_thread_13);//sysj/Exercise6.sysj line: 234, column: 5
                              zone7Num.setPresent();//sysj/Exercise6.sysj line: 235, column: 5
                              currsigs.addElement(zone7Num);
                              zone7Num.setValue(zone7NumEmployee_thread_13);//sysj/Exercise6.sysj line: 235, column: 5
                              S3819=7;
                              active[13]=1;
                              ends[13]=1;
                              tdone[13]=1;
                            }
                            else {
                              if(zoneLocation_thread_13 == "7"){//sysj/Exercise6.sysj line: 221, column: 7
                                System.out.println("Unauthorized employee found in Zone 7.");//sysj/Exercise6.sysj line: 222, column: 8
                                zone7Unauth.setPresent();//sysj/Exercise6.sysj line: 223, column: 8
                                currsigs.addElement(zone7Unauth);
                                System.out.println("Detected employees: " + zone1NumEmployee_thread_13 + " " + zone2NumEmployee_thread_13 + " " + zone3NumEmployee_thread_13 + " " + zone7NumEmployee_thread_13);//sysj/Exercise6.sysj line: 228, column: 5
                                zone1Num.setPresent();//sysj/Exercise6.sysj line: 232, column: 5
                                currsigs.addElement(zone1Num);
                                zone1Num.setValue(zone1NumEmployee_thread_13);//sysj/Exercise6.sysj line: 232, column: 5
                                zone2Num.setPresent();//sysj/Exercise6.sysj line: 233, column: 5
                                currsigs.addElement(zone2Num);
                                zone2Num.setValue(zone2NumEmployee_thread_13);//sysj/Exercise6.sysj line: 233, column: 5
                                zone3Num.setPresent();//sysj/Exercise6.sysj line: 234, column: 5
                                currsigs.addElement(zone3Num);
                                zone3Num.setValue(zone3NumEmployee_thread_13);//sysj/Exercise6.sysj line: 234, column: 5
                                zone7Num.setPresent();//sysj/Exercise6.sysj line: 235, column: 5
                                currsigs.addElement(zone7Num);
                                zone7Num.setValue(zone7NumEmployee_thread_13);//sysj/Exercise6.sysj line: 235, column: 5
                                S3819=7;
                                active[13]=1;
                                ends[13]=1;
                                tdone[13]=1;
                              }
                              else {
                                System.out.println("Detected employees: " + zone1NumEmployee_thread_13 + " " + zone2NumEmployee_thread_13 + " " + zone3NumEmployee_thread_13 + " " + zone7NumEmployee_thread_13);//sysj/Exercise6.sysj line: 228, column: 5
                                zone1Num.setPresent();//sysj/Exercise6.sysj line: 232, column: 5
                                currsigs.addElement(zone1Num);
                                zone1Num.setValue(zone1NumEmployee_thread_13);//sysj/Exercise6.sysj line: 232, column: 5
                                zone2Num.setPresent();//sysj/Exercise6.sysj line: 233, column: 5
                                currsigs.addElement(zone2Num);
                                zone2Num.setValue(zone2NumEmployee_thread_13);//sysj/Exercise6.sysj line: 233, column: 5
                                zone3Num.setPresent();//sysj/Exercise6.sysj line: 234, column: 5
                                currsigs.addElement(zone3Num);
                                zone3Num.setValue(zone3NumEmployee_thread_13);//sysj/Exercise6.sysj line: 234, column: 5
                                zone7Num.setPresent();//sysj/Exercise6.sysj line: 235, column: 5
                                currsigs.addElement(zone7Num);
                                zone7Num.setValue(zone7NumEmployee_thread_13);//sysj/Exercise6.sysj line: 235, column: 5
                                S3819=7;
                                active[13]=1;
                                ends[13]=1;
                                tdone[13]=1;
                              }
                            }
                          }
                        }
                      }
                      else {
                        System.out.println("Detected employees: " + zone1NumEmployee_thread_13 + " " + zone2NumEmployee_thread_13 + " " + zone3NumEmployee_thread_13 + " " + zone7NumEmployee_thread_13);//sysj/Exercise6.sysj line: 228, column: 5
                        zone1Num.setPresent();//sysj/Exercise6.sysj line: 232, column: 5
                        currsigs.addElement(zone1Num);
                        zone1Num.setValue(zone1NumEmployee_thread_13);//sysj/Exercise6.sysj line: 232, column: 5
                        zone2Num.setPresent();//sysj/Exercise6.sysj line: 233, column: 5
                        currsigs.addElement(zone2Num);
                        zone2Num.setValue(zone2NumEmployee_thread_13);//sysj/Exercise6.sysj line: 233, column: 5
                        zone3Num.setPresent();//sysj/Exercise6.sysj line: 234, column: 5
                        currsigs.addElement(zone3Num);
                        zone3Num.setValue(zone3NumEmployee_thread_13);//sysj/Exercise6.sysj line: 234, column: 5
                        zone7Num.setPresent();//sysj/Exercise6.sysj line: 235, column: 5
                        currsigs.addElement(zone7Num);
                        zone7Num.setValue(zone7NumEmployee_thread_13);//sysj/Exercise6.sysj line: 235, column: 5
                        S3819=7;
                        active[13]=1;
                        ends[13]=1;
                        tdone[13]=1;
                      }
                    }
                    else {
                      active[13]=1;
                      ends[13]=1;
                      tdone[13]=1;
                    }
                  }
                  else {
                    active[13]=1;
                    ends[13]=1;
                    tdone[13]=1;
                  }
                }
                break;
              
            }
            break;
          
          case 7 : 
            S3819=7;
            S3819=0;
            __start_thread_13 = com.systemj.Timer.getMs();//sysj/Exercise6.sysj line: 167, column: 4
            if(com.systemj.Timer.getMs() - __start_thread_13 >= (5) * 1000){//sysj/Exercise6.sysj line: 167, column: 4
              ends[13]=2;
              ;//sysj/Exercise6.sysj line: 167, column: 4
              zone1NumEmployee_thread_13 = 0;//sysj/Exercise6.sysj line: 172, column: 5
              zone2NumEmployee_thread_13 = 0;//sysj/Exercise6.sysj line: 173, column: 5
              zone3NumEmployee_thread_13 = 0;//sysj/Exercise6.sysj line: 174, column: 5
              zone7NumEmployee_thread_13 = 0;//sysj/Exercise6.sysj line: 175, column: 5
              S3819=1;
              S3826=0;
              if(!reqIDLoc_o.isPartnerPresent() || reqIDLoc_o.isPartnerPreempted()){//sysj/Exercise6.sysj line: 177, column: 5
                reqIDLoc_o.setREQ(false);//sysj/Exercise6.sysj line: 177, column: 5
                S3826=1;
                active[13]=1;
                ends[13]=1;
                tdone[13]=1;
              }
              else {
                S3821=0;
                if(reqIDLoc_o.isACK()){//sysj/Exercise6.sysj line: 177, column: 5
                  reqIDLoc_o.setVal("11111");//sysj/Exercise6.sysj line: 177, column: 5
                  S3821=1;
                  if(!reqIDLoc_o.isACK()){//sysj/Exercise6.sysj line: 177, column: 5
                    reqIDLoc_o.setREQ(false);//sysj/Exercise6.sysj line: 177, column: 5
                    ends[13]=2;
                    ;//sysj/Exercise6.sysj line: 177, column: 5
                    S3819=2;
                    S3914=0;
                    if(!idLocation_in.isPartnerPresent() || idLocation_in.isPartnerPreempted()){//sysj/Exercise6.sysj line: 178, column: 5
                      idLocation_in.setACK(false);//sysj/Exercise6.sysj line: 178, column: 5
                      S3914=1;
                      active[13]=1;
                      ends[13]=1;
                      tdone[13]=1;
                    }
                    else {
                      S3909=0;
                      if(!idLocation_in.isREQ()){//sysj/Exercise6.sysj line: 178, column: 5
                        idLocation_in.setACK(true);//sysj/Exercise6.sysj line: 178, column: 5
                        S3909=1;
                        if(idLocation_in.isREQ()){//sysj/Exercise6.sysj line: 178, column: 5
                          idLocation_in.setACK(false);//sysj/Exercise6.sysj line: 178, column: 5
                          ends[13]=2;
                          ;//sysj/Exercise6.sysj line: 178, column: 5
                          zoneLocation_thread_13 = (String)(idLocation_in.getVal() == null ? null : ((String)idLocation_in.getVal()));//sysj/Exercise6.sysj line: 179, column: 5
                          S3819=3;
                          active[13]=1;
                          ends[13]=1;
                          tdone[13]=1;
                        }
                        else {
                          active[13]=1;
                          ends[13]=1;
                          tdone[13]=1;
                        }
                      }
                      else {
                        active[13]=1;
                        ends[13]=1;
                        tdone[13]=1;
                      }
                    }
                  }
                  else {
                    active[13]=1;
                    ends[13]=1;
                    tdone[13]=1;
                  }
                }
                else {
                  active[13]=1;
                  ends[13]=1;
                  tdone[13]=1;
                }
              }
            }
            else {
              active[13]=1;
              ends[13]=1;
              tdone[13]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread6356(int [] tdone, int [] ends){
        switch(S3803){
      case 0 : 
        active[12]=0;
        ends[12]=0;
        tdone[12]=1;
        break;
      
      case 1 : 
        switch(S3755){
          case 0 : 
            switch(S3739){
              case 0 : 
                if(!humanPresence_in.isPartnerPresent() || humanPresence_in.isPartnerPreempted()){//sysj/Exercise6.sysj line: 150, column: 5
                  humanPresence_in.setACK(false);//sysj/Exercise6.sysj line: 150, column: 5
                  S3739=1;
                  active[12]=1;
                  ends[12]=1;
                  tdone[12]=1;
                }
                else {
                  switch(S3734){
                    case 0 : 
                      if(!humanPresence_in.isREQ()){//sysj/Exercise6.sysj line: 150, column: 5
                        humanPresence_in.setACK(true);//sysj/Exercise6.sysj line: 150, column: 5
                        S3734=1;
                        if(humanPresence_in.isREQ()){//sysj/Exercise6.sysj line: 150, column: 5
                          humanPresence_in.setACK(false);//sysj/Exercise6.sysj line: 150, column: 5
                          ends[12]=2;
                          ;//sysj/Exercise6.sysj line: 150, column: 5
                          result_thread_12 = (boolean)(humanPresence_in.getVal() == null ? false : ((Boolean)humanPresence_in.getVal()).booleanValue());//sysj/Exercise6.sysj line: 151, column: 5
                          System.out.println("Infrared sensor trip - emergency off enacted.");//sysj/Exercise6.sysj line: 153, column: 5
                          emergencyOffUI.setPresent();//sysj/Exercise6.sysj line: 155, column: 5
                          currsigs.addElement(emergencyOffUI);
                          S3755=1;
                          active[12]=1;
                          ends[12]=1;
                          tdone[12]=1;
                        }
                        else {
                          active[12]=1;
                          ends[12]=1;
                          tdone[12]=1;
                        }
                      }
                      else {
                        active[12]=1;
                        ends[12]=1;
                        tdone[12]=1;
                      }
                      break;
                    
                    case 1 : 
                      if(humanPresence_in.isREQ()){//sysj/Exercise6.sysj line: 150, column: 5
                        humanPresence_in.setACK(false);//sysj/Exercise6.sysj line: 150, column: 5
                        ends[12]=2;
                        ;//sysj/Exercise6.sysj line: 150, column: 5
                        result_thread_12 = (boolean)(humanPresence_in.getVal() == null ? false : ((Boolean)humanPresence_in.getVal()).booleanValue());//sysj/Exercise6.sysj line: 151, column: 5
                        System.out.println("Infrared sensor trip - emergency off enacted.");//sysj/Exercise6.sysj line: 153, column: 5
                        emergencyOffUI.setPresent();//sysj/Exercise6.sysj line: 155, column: 5
                        currsigs.addElement(emergencyOffUI);
                        S3755=1;
                        active[12]=1;
                        ends[12]=1;
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
                break;
              
              case 1 : 
                S3739=1;
                S3739=0;
                if(!humanPresence_in.isPartnerPresent() || humanPresence_in.isPartnerPreempted()){//sysj/Exercise6.sysj line: 150, column: 5
                  humanPresence_in.setACK(false);//sysj/Exercise6.sysj line: 150, column: 5
                  S3739=1;
                  active[12]=1;
                  ends[12]=1;
                  tdone[12]=1;
                }
                else {
                  S3734=0;
                  if(!humanPresence_in.isREQ()){//sysj/Exercise6.sysj line: 150, column: 5
                    humanPresence_in.setACK(true);//sysj/Exercise6.sysj line: 150, column: 5
                    S3734=1;
                    if(humanPresence_in.isREQ()){//sysj/Exercise6.sysj line: 150, column: 5
                      humanPresence_in.setACK(false);//sysj/Exercise6.sysj line: 150, column: 5
                      ends[12]=2;
                      ;//sysj/Exercise6.sysj line: 150, column: 5
                      result_thread_12 = (boolean)(humanPresence_in.getVal() == null ? false : ((Boolean)humanPresence_in.getVal()).booleanValue());//sysj/Exercise6.sysj line: 151, column: 5
                      System.out.println("Infrared sensor trip - emergency off enacted.");//sysj/Exercise6.sysj line: 153, column: 5
                      emergencyOffUI.setPresent();//sysj/Exercise6.sysj line: 155, column: 5
                      currsigs.addElement(emergencyOffUI);
                      S3755=1;
                      active[12]=1;
                      ends[12]=1;
                      tdone[12]=1;
                    }
                    else {
                      active[12]=1;
                      ends[12]=1;
                      tdone[12]=1;
                    }
                  }
                  else {
                    active[12]=1;
                    ends[12]=1;
                    tdone[12]=1;
                  }
                }
                break;
              
            }
            break;
          
          case 1 : 
            S3755=1;
            S3755=0;
            S3739=0;
            if(!humanPresence_in.isPartnerPresent() || humanPresence_in.isPartnerPreempted()){//sysj/Exercise6.sysj line: 150, column: 5
              humanPresence_in.setACK(false);//sysj/Exercise6.sysj line: 150, column: 5
              S3739=1;
              active[12]=1;
              ends[12]=1;
              tdone[12]=1;
            }
            else {
              S3734=0;
              if(!humanPresence_in.isREQ()){//sysj/Exercise6.sysj line: 150, column: 5
                humanPresence_in.setACK(true);//sysj/Exercise6.sysj line: 150, column: 5
                S3734=1;
                if(humanPresence_in.isREQ()){//sysj/Exercise6.sysj line: 150, column: 5
                  humanPresence_in.setACK(false);//sysj/Exercise6.sysj line: 150, column: 5
                  ends[12]=2;
                  ;//sysj/Exercise6.sysj line: 150, column: 5
                  result_thread_12 = (boolean)(humanPresence_in.getVal() == null ? false : ((Boolean)humanPresence_in.getVal()).booleanValue());//sysj/Exercise6.sysj line: 151, column: 5
                  System.out.println("Infrared sensor trip - emergency off enacted.");//sysj/Exercise6.sysj line: 153, column: 5
                  emergencyOffUI.setPresent();//sysj/Exercise6.sysj line: 155, column: 5
                  currsigs.addElement(emergencyOffUI);
                  S3755=1;
                  active[12]=1;
                  ends[12]=1;
                  tdone[12]=1;
                }
                else {
                  active[12]=1;
                  ends[12]=1;
                  tdone[12]=1;
                }
              }
              else {
                active[12]=1;
                ends[12]=1;
                tdone[12]=1;
              }
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread6355(int [] tdone, int [] ends){
        switch(S3732){
      case 0 : 
        active[11]=0;
        ends[11]=0;
        tdone[11]=1;
        break;
      
      case 1 : 
        switch(S3120){
          case 0 : 
            switch(S3104){
              case 0 : 
                if(!door1CardReader_in.isPartnerPresent() || door1CardReader_in.isPartnerPreempted()){//sysj/Exercise6.sysj line: 132, column: 5
                  door1CardReader_in.setACK(false);//sysj/Exercise6.sysj line: 132, column: 5
                  S3104=1;
                  active[11]=1;
                  ends[11]=1;
                  tdone[11]=1;
                }
                else {
                  switch(S3099){
                    case 0 : 
                      if(!door1CardReader_in.isREQ()){//sysj/Exercise6.sysj line: 132, column: 5
                        door1CardReader_in.setACK(true);//sysj/Exercise6.sysj line: 132, column: 5
                        S3099=1;
                        if(door1CardReader_in.isREQ()){//sysj/Exercise6.sysj line: 132, column: 5
                          door1CardReader_in.setACK(false);//sysj/Exercise6.sysj line: 132, column: 5
                          ends[11]=2;
                          ;//sysj/Exercise6.sysj line: 132, column: 5
                          id_thread_11 = (String)(door1CardReader_in.getVal() == null ? null : ((String)door1CardReader_in.getVal()));//sysj/Exercise6.sysj line: 133, column: 5
                          result_thread_11 = DoorIDDB.authDoorAccess(id_thread_11, "1");//sysj/Exercise6.sysj line: 134, column: 5
                          S3120=1;
                          if(result_thread_11 == true){//sysj/Exercise6.sysj line: 135, column: 9
                            S3167=0;
                            S3127=0;
                            if(!door1Grant_o.isPartnerPresent() || door1Grant_o.isPartnerPreempted()){//sysj/Exercise6.sysj line: 136, column: 6
                              door1Grant_o.setREQ(false);//sysj/Exercise6.sysj line: 136, column: 6
                              S3127=1;
                              active[11]=1;
                              ends[11]=1;
                              tdone[11]=1;
                            }
                            else {
                              S3122=0;
                              if(door1Grant_o.isACK()){//sysj/Exercise6.sysj line: 136, column: 6
                                door1Grant_o.setVal(true);//sysj/Exercise6.sysj line: 136, column: 6
                                S3122=1;
                                if(!door1Grant_o.isACK()){//sysj/Exercise6.sysj line: 136, column: 6
                                  door1Grant_o.setREQ(false);//sysj/Exercise6.sysj line: 136, column: 6
                                  ends[11]=2;
                                  ;//sysj/Exercise6.sysj line: 136, column: 6
                                  door1GrantUI.setPresent();//sysj/Exercise6.sysj line: 137, column: 6
                                  currsigs.addElement(door1GrantUI);
                                  S3120=2;
                                  active[11]=1;
                                  ends[11]=1;
                                  tdone[11]=1;
                                }
                                else {
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
                            }
                          }
                          else {
                            S3167=1;
                            S3150=0;
                            if(!door1Deny_o.isPartnerPresent() || door1Deny_o.isPartnerPreempted()){//sysj/Exercise6.sysj line: 140, column: 6
                              door1Deny_o.setREQ(false);//sysj/Exercise6.sysj line: 140, column: 6
                              S3150=1;
                              active[11]=1;
                              ends[11]=1;
                              tdone[11]=1;
                            }
                            else {
                              S3145=0;
                              if(door1Deny_o.isACK()){//sysj/Exercise6.sysj line: 140, column: 6
                                door1Deny_o.setVal(true);//sysj/Exercise6.sysj line: 140, column: 6
                                S3145=1;
                                if(!door1Deny_o.isACK()){//sysj/Exercise6.sysj line: 140, column: 6
                                  door1Deny_o.setREQ(false);//sysj/Exercise6.sysj line: 140, column: 6
                                  ends[11]=2;
                                  ;//sysj/Exercise6.sysj line: 140, column: 6
                                  door1DenyUI.setPresent();//sysj/Exercise6.sysj line: 141, column: 6
                                  currsigs.addElement(door1DenyUI);
                                  S3120=2;
                                  active[11]=1;
                                  ends[11]=1;
                                  tdone[11]=1;
                                }
                                else {
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
                            }
                          }
                        }
                        else {
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
                      if(door1CardReader_in.isREQ()){//sysj/Exercise6.sysj line: 132, column: 5
                        door1CardReader_in.setACK(false);//sysj/Exercise6.sysj line: 132, column: 5
                        ends[11]=2;
                        ;//sysj/Exercise6.sysj line: 132, column: 5
                        id_thread_11 = (String)(door1CardReader_in.getVal() == null ? null : ((String)door1CardReader_in.getVal()));//sysj/Exercise6.sysj line: 133, column: 5
                        result_thread_11 = DoorIDDB.authDoorAccess(id_thread_11, "1");//sysj/Exercise6.sysj line: 134, column: 5
                        S3120=1;
                        if(result_thread_11 == true){//sysj/Exercise6.sysj line: 135, column: 9
                          S3167=0;
                          S3127=0;
                          if(!door1Grant_o.isPartnerPresent() || door1Grant_o.isPartnerPreempted()){//sysj/Exercise6.sysj line: 136, column: 6
                            door1Grant_o.setREQ(false);//sysj/Exercise6.sysj line: 136, column: 6
                            S3127=1;
                            active[11]=1;
                            ends[11]=1;
                            tdone[11]=1;
                          }
                          else {
                            S3122=0;
                            if(door1Grant_o.isACK()){//sysj/Exercise6.sysj line: 136, column: 6
                              door1Grant_o.setVal(true);//sysj/Exercise6.sysj line: 136, column: 6
                              S3122=1;
                              if(!door1Grant_o.isACK()){//sysj/Exercise6.sysj line: 136, column: 6
                                door1Grant_o.setREQ(false);//sysj/Exercise6.sysj line: 136, column: 6
                                ends[11]=2;
                                ;//sysj/Exercise6.sysj line: 136, column: 6
                                door1GrantUI.setPresent();//sysj/Exercise6.sysj line: 137, column: 6
                                currsigs.addElement(door1GrantUI);
                                S3120=2;
                                active[11]=1;
                                ends[11]=1;
                                tdone[11]=1;
                              }
                              else {
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
                          }
                        }
                        else {
                          S3167=1;
                          S3150=0;
                          if(!door1Deny_o.isPartnerPresent() || door1Deny_o.isPartnerPreempted()){//sysj/Exercise6.sysj line: 140, column: 6
                            door1Deny_o.setREQ(false);//sysj/Exercise6.sysj line: 140, column: 6
                            S3150=1;
                            active[11]=1;
                            ends[11]=1;
                            tdone[11]=1;
                          }
                          else {
                            S3145=0;
                            if(door1Deny_o.isACK()){//sysj/Exercise6.sysj line: 140, column: 6
                              door1Deny_o.setVal(true);//sysj/Exercise6.sysj line: 140, column: 6
                              S3145=1;
                              if(!door1Deny_o.isACK()){//sysj/Exercise6.sysj line: 140, column: 6
                                door1Deny_o.setREQ(false);//sysj/Exercise6.sysj line: 140, column: 6
                                ends[11]=2;
                                ;//sysj/Exercise6.sysj line: 140, column: 6
                                door1DenyUI.setPresent();//sysj/Exercise6.sysj line: 141, column: 6
                                currsigs.addElement(door1DenyUI);
                                S3120=2;
                                active[11]=1;
                                ends[11]=1;
                                tdone[11]=1;
                              }
                              else {
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
                          }
                        }
                      }
                      else {
                        active[11]=1;
                        ends[11]=1;
                        tdone[11]=1;
                      }
                      break;
                    
                  }
                }
                break;
              
              case 1 : 
                S3104=1;
                S3104=0;
                if(!door1CardReader_in.isPartnerPresent() || door1CardReader_in.isPartnerPreempted()){//sysj/Exercise6.sysj line: 132, column: 5
                  door1CardReader_in.setACK(false);//sysj/Exercise6.sysj line: 132, column: 5
                  S3104=1;
                  active[11]=1;
                  ends[11]=1;
                  tdone[11]=1;
                }
                else {
                  S3099=0;
                  if(!door1CardReader_in.isREQ()){//sysj/Exercise6.sysj line: 132, column: 5
                    door1CardReader_in.setACK(true);//sysj/Exercise6.sysj line: 132, column: 5
                    S3099=1;
                    if(door1CardReader_in.isREQ()){//sysj/Exercise6.sysj line: 132, column: 5
                      door1CardReader_in.setACK(false);//sysj/Exercise6.sysj line: 132, column: 5
                      ends[11]=2;
                      ;//sysj/Exercise6.sysj line: 132, column: 5
                      id_thread_11 = (String)(door1CardReader_in.getVal() == null ? null : ((String)door1CardReader_in.getVal()));//sysj/Exercise6.sysj line: 133, column: 5
                      result_thread_11 = DoorIDDB.authDoorAccess(id_thread_11, "1");//sysj/Exercise6.sysj line: 134, column: 5
                      S3120=1;
                      if(result_thread_11 == true){//sysj/Exercise6.sysj line: 135, column: 9
                        S3167=0;
                        S3127=0;
                        if(!door1Grant_o.isPartnerPresent() || door1Grant_o.isPartnerPreempted()){//sysj/Exercise6.sysj line: 136, column: 6
                          door1Grant_o.setREQ(false);//sysj/Exercise6.sysj line: 136, column: 6
                          S3127=1;
                          active[11]=1;
                          ends[11]=1;
                          tdone[11]=1;
                        }
                        else {
                          S3122=0;
                          if(door1Grant_o.isACK()){//sysj/Exercise6.sysj line: 136, column: 6
                            door1Grant_o.setVal(true);//sysj/Exercise6.sysj line: 136, column: 6
                            S3122=1;
                            if(!door1Grant_o.isACK()){//sysj/Exercise6.sysj line: 136, column: 6
                              door1Grant_o.setREQ(false);//sysj/Exercise6.sysj line: 136, column: 6
                              ends[11]=2;
                              ;//sysj/Exercise6.sysj line: 136, column: 6
                              door1GrantUI.setPresent();//sysj/Exercise6.sysj line: 137, column: 6
                              currsigs.addElement(door1GrantUI);
                              S3120=2;
                              active[11]=1;
                              ends[11]=1;
                              tdone[11]=1;
                            }
                            else {
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
                        }
                      }
                      else {
                        S3167=1;
                        S3150=0;
                        if(!door1Deny_o.isPartnerPresent() || door1Deny_o.isPartnerPreempted()){//sysj/Exercise6.sysj line: 140, column: 6
                          door1Deny_o.setREQ(false);//sysj/Exercise6.sysj line: 140, column: 6
                          S3150=1;
                          active[11]=1;
                          ends[11]=1;
                          tdone[11]=1;
                        }
                        else {
                          S3145=0;
                          if(door1Deny_o.isACK()){//sysj/Exercise6.sysj line: 140, column: 6
                            door1Deny_o.setVal(true);//sysj/Exercise6.sysj line: 140, column: 6
                            S3145=1;
                            if(!door1Deny_o.isACK()){//sysj/Exercise6.sysj line: 140, column: 6
                              door1Deny_o.setREQ(false);//sysj/Exercise6.sysj line: 140, column: 6
                              ends[11]=2;
                              ;//sysj/Exercise6.sysj line: 140, column: 6
                              door1DenyUI.setPresent();//sysj/Exercise6.sysj line: 141, column: 6
                              currsigs.addElement(door1DenyUI);
                              S3120=2;
                              active[11]=1;
                              ends[11]=1;
                              tdone[11]=1;
                            }
                            else {
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
                        }
                      }
                    }
                    else {
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
                }
                break;
              
            }
            break;
          
          case 1 : 
            switch(S3167){
              case 0 : 
                switch(S3127){
                  case 0 : 
                    if(!door1Grant_o.isPartnerPresent() || door1Grant_o.isPartnerPreempted()){//sysj/Exercise6.sysj line: 136, column: 6
                      door1Grant_o.setREQ(false);//sysj/Exercise6.sysj line: 136, column: 6
                      S3127=1;
                      active[11]=1;
                      ends[11]=1;
                      tdone[11]=1;
                    }
                    else {
                      switch(S3122){
                        case 0 : 
                          if(door1Grant_o.isACK()){//sysj/Exercise6.sysj line: 136, column: 6
                            door1Grant_o.setVal(true);//sysj/Exercise6.sysj line: 136, column: 6
                            S3122=1;
                            if(!door1Grant_o.isACK()){//sysj/Exercise6.sysj line: 136, column: 6
                              door1Grant_o.setREQ(false);//sysj/Exercise6.sysj line: 136, column: 6
                              ends[11]=2;
                              ;//sysj/Exercise6.sysj line: 136, column: 6
                              door1GrantUI.setPresent();//sysj/Exercise6.sysj line: 137, column: 6
                              currsigs.addElement(door1GrantUI);
                              S3120=2;
                              active[11]=1;
                              ends[11]=1;
                              tdone[11]=1;
                            }
                            else {
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
                          if(!door1Grant_o.isACK()){//sysj/Exercise6.sysj line: 136, column: 6
                            door1Grant_o.setREQ(false);//sysj/Exercise6.sysj line: 136, column: 6
                            ends[11]=2;
                            ;//sysj/Exercise6.sysj line: 136, column: 6
                            door1GrantUI.setPresent();//sysj/Exercise6.sysj line: 137, column: 6
                            currsigs.addElement(door1GrantUI);
                            S3120=2;
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
                        
                      }
                    }
                    break;
                  
                  case 1 : 
                    S3127=1;
                    S3127=0;
                    if(!door1Grant_o.isPartnerPresent() || door1Grant_o.isPartnerPreempted()){//sysj/Exercise6.sysj line: 136, column: 6
                      door1Grant_o.setREQ(false);//sysj/Exercise6.sysj line: 136, column: 6
                      S3127=1;
                      active[11]=1;
                      ends[11]=1;
                      tdone[11]=1;
                    }
                    else {
                      S3122=0;
                      if(door1Grant_o.isACK()){//sysj/Exercise6.sysj line: 136, column: 6
                        door1Grant_o.setVal(true);//sysj/Exercise6.sysj line: 136, column: 6
                        S3122=1;
                        if(!door1Grant_o.isACK()){//sysj/Exercise6.sysj line: 136, column: 6
                          door1Grant_o.setREQ(false);//sysj/Exercise6.sysj line: 136, column: 6
                          ends[11]=2;
                          ;//sysj/Exercise6.sysj line: 136, column: 6
                          door1GrantUI.setPresent();//sysj/Exercise6.sysj line: 137, column: 6
                          currsigs.addElement(door1GrantUI);
                          S3120=2;
                          active[11]=1;
                          ends[11]=1;
                          tdone[11]=1;
                        }
                        else {
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
                    }
                    break;
                  
                }
                break;
              
              case 1 : 
                switch(S3150){
                  case 0 : 
                    if(!door1Deny_o.isPartnerPresent() || door1Deny_o.isPartnerPreempted()){//sysj/Exercise6.sysj line: 140, column: 6
                      door1Deny_o.setREQ(false);//sysj/Exercise6.sysj line: 140, column: 6
                      S3150=1;
                      active[11]=1;
                      ends[11]=1;
                      tdone[11]=1;
                    }
                    else {
                      switch(S3145){
                        case 0 : 
                          if(door1Deny_o.isACK()){//sysj/Exercise6.sysj line: 140, column: 6
                            door1Deny_o.setVal(true);//sysj/Exercise6.sysj line: 140, column: 6
                            S3145=1;
                            if(!door1Deny_o.isACK()){//sysj/Exercise6.sysj line: 140, column: 6
                              door1Deny_o.setREQ(false);//sysj/Exercise6.sysj line: 140, column: 6
                              ends[11]=2;
                              ;//sysj/Exercise6.sysj line: 140, column: 6
                              door1DenyUI.setPresent();//sysj/Exercise6.sysj line: 141, column: 6
                              currsigs.addElement(door1DenyUI);
                              S3120=2;
                              active[11]=1;
                              ends[11]=1;
                              tdone[11]=1;
                            }
                            else {
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
                          if(!door1Deny_o.isACK()){//sysj/Exercise6.sysj line: 140, column: 6
                            door1Deny_o.setREQ(false);//sysj/Exercise6.sysj line: 140, column: 6
                            ends[11]=2;
                            ;//sysj/Exercise6.sysj line: 140, column: 6
                            door1DenyUI.setPresent();//sysj/Exercise6.sysj line: 141, column: 6
                            currsigs.addElement(door1DenyUI);
                            S3120=2;
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
                        
                      }
                    }
                    break;
                  
                  case 1 : 
                    S3150=1;
                    S3150=0;
                    if(!door1Deny_o.isPartnerPresent() || door1Deny_o.isPartnerPreempted()){//sysj/Exercise6.sysj line: 140, column: 6
                      door1Deny_o.setREQ(false);//sysj/Exercise6.sysj line: 140, column: 6
                      S3150=1;
                      active[11]=1;
                      ends[11]=1;
                      tdone[11]=1;
                    }
                    else {
                      S3145=0;
                      if(door1Deny_o.isACK()){//sysj/Exercise6.sysj line: 140, column: 6
                        door1Deny_o.setVal(true);//sysj/Exercise6.sysj line: 140, column: 6
                        S3145=1;
                        if(!door1Deny_o.isACK()){//sysj/Exercise6.sysj line: 140, column: 6
                          door1Deny_o.setREQ(false);//sysj/Exercise6.sysj line: 140, column: 6
                          ends[11]=2;
                          ;//sysj/Exercise6.sysj line: 140, column: 6
                          door1DenyUI.setPresent();//sysj/Exercise6.sysj line: 141, column: 6
                          currsigs.addElement(door1DenyUI);
                          S3120=2;
                          active[11]=1;
                          ends[11]=1;
                          tdone[11]=1;
                        }
                        else {
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
                    }
                    break;
                  
                }
                break;
              
            }
            break;
          
          case 2 : 
            S3120=2;
            S3120=0;
            S3104=0;
            if(!door1CardReader_in.isPartnerPresent() || door1CardReader_in.isPartnerPreempted()){//sysj/Exercise6.sysj line: 132, column: 5
              door1CardReader_in.setACK(false);//sysj/Exercise6.sysj line: 132, column: 5
              S3104=1;
              active[11]=1;
              ends[11]=1;
              tdone[11]=1;
            }
            else {
              S3099=0;
              if(!door1CardReader_in.isREQ()){//sysj/Exercise6.sysj line: 132, column: 5
                door1CardReader_in.setACK(true);//sysj/Exercise6.sysj line: 132, column: 5
                S3099=1;
                if(door1CardReader_in.isREQ()){//sysj/Exercise6.sysj line: 132, column: 5
                  door1CardReader_in.setACK(false);//sysj/Exercise6.sysj line: 132, column: 5
                  ends[11]=2;
                  ;//sysj/Exercise6.sysj line: 132, column: 5
                  id_thread_11 = (String)(door1CardReader_in.getVal() == null ? null : ((String)door1CardReader_in.getVal()));//sysj/Exercise6.sysj line: 133, column: 5
                  result_thread_11 = DoorIDDB.authDoorAccess(id_thread_11, "1");//sysj/Exercise6.sysj line: 134, column: 5
                  S3120=1;
                  if(result_thread_11 == true){//sysj/Exercise6.sysj line: 135, column: 9
                    S3167=0;
                    S3127=0;
                    if(!door1Grant_o.isPartnerPresent() || door1Grant_o.isPartnerPreempted()){//sysj/Exercise6.sysj line: 136, column: 6
                      door1Grant_o.setREQ(false);//sysj/Exercise6.sysj line: 136, column: 6
                      S3127=1;
                      active[11]=1;
                      ends[11]=1;
                      tdone[11]=1;
                    }
                    else {
                      S3122=0;
                      if(door1Grant_o.isACK()){//sysj/Exercise6.sysj line: 136, column: 6
                        door1Grant_o.setVal(true);//sysj/Exercise6.sysj line: 136, column: 6
                        S3122=1;
                        if(!door1Grant_o.isACK()){//sysj/Exercise6.sysj line: 136, column: 6
                          door1Grant_o.setREQ(false);//sysj/Exercise6.sysj line: 136, column: 6
                          ends[11]=2;
                          ;//sysj/Exercise6.sysj line: 136, column: 6
                          door1GrantUI.setPresent();//sysj/Exercise6.sysj line: 137, column: 6
                          currsigs.addElement(door1GrantUI);
                          S3120=2;
                          active[11]=1;
                          ends[11]=1;
                          tdone[11]=1;
                        }
                        else {
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
                    }
                  }
                  else {
                    S3167=1;
                    S3150=0;
                    if(!door1Deny_o.isPartnerPresent() || door1Deny_o.isPartnerPreempted()){//sysj/Exercise6.sysj line: 140, column: 6
                      door1Deny_o.setREQ(false);//sysj/Exercise6.sysj line: 140, column: 6
                      S3150=1;
                      active[11]=1;
                      ends[11]=1;
                      tdone[11]=1;
                    }
                    else {
                      S3145=0;
                      if(door1Deny_o.isACK()){//sysj/Exercise6.sysj line: 140, column: 6
                        door1Deny_o.setVal(true);//sysj/Exercise6.sysj line: 140, column: 6
                        S3145=1;
                        if(!door1Deny_o.isACK()){//sysj/Exercise6.sysj line: 140, column: 6
                          door1Deny_o.setREQ(false);//sysj/Exercise6.sysj line: 140, column: 6
                          ends[11]=2;
                          ;//sysj/Exercise6.sysj line: 140, column: 6
                          door1DenyUI.setPresent();//sysj/Exercise6.sysj line: 141, column: 6
                          currsigs.addElement(door1DenyUI);
                          S3120=2;
                          active[11]=1;
                          ends[11]=1;
                          tdone[11]=1;
                        }
                        else {
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
                    }
                  }
                }
                else {
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
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread6353(int [] tdone, int [] ends){
        S6331=1;
    zone1NumEmployee_thread_13 = 0;//sysj/Exercise6.sysj line: 162, column: 4
    zone2NumEmployee_thread_13 = 0;//sysj/Exercise6.sysj line: 163, column: 4
    zone3NumEmployee_thread_13 = 0;//sysj/Exercise6.sysj line: 164, column: 4
    zone7NumEmployee_thread_13 = 0;//sysj/Exercise6.sysj line: 165, column: 4
    S3819=0;
    __start_thread_13 = com.systemj.Timer.getMs();//sysj/Exercise6.sysj line: 167, column: 4
    if(com.systemj.Timer.getMs() - __start_thread_13 >= (5) * 1000){//sysj/Exercise6.sysj line: 167, column: 4
      ends[13]=2;
      ;//sysj/Exercise6.sysj line: 167, column: 4
      zone1NumEmployee_thread_13 = 0;//sysj/Exercise6.sysj line: 172, column: 5
      zone2NumEmployee_thread_13 = 0;//sysj/Exercise6.sysj line: 173, column: 5
      zone3NumEmployee_thread_13 = 0;//sysj/Exercise6.sysj line: 174, column: 5
      zone7NumEmployee_thread_13 = 0;//sysj/Exercise6.sysj line: 175, column: 5
      S3819=1;
      S3826=0;
      if(!reqIDLoc_o.isPartnerPresent() || reqIDLoc_o.isPartnerPreempted()){//sysj/Exercise6.sysj line: 177, column: 5
        reqIDLoc_o.setREQ(false);//sysj/Exercise6.sysj line: 177, column: 5
        S3826=1;
        active[13]=1;
        ends[13]=1;
        tdone[13]=1;
      }
      else {
        S3821=0;
        if(reqIDLoc_o.isACK()){//sysj/Exercise6.sysj line: 177, column: 5
          reqIDLoc_o.setVal("11111");//sysj/Exercise6.sysj line: 177, column: 5
          S3821=1;
          if(!reqIDLoc_o.isACK()){//sysj/Exercise6.sysj line: 177, column: 5
            reqIDLoc_o.setREQ(false);//sysj/Exercise6.sysj line: 177, column: 5
            ends[13]=2;
            ;//sysj/Exercise6.sysj line: 177, column: 5
            S3819=2;
            S3914=0;
            if(!idLocation_in.isPartnerPresent() || idLocation_in.isPartnerPreempted()){//sysj/Exercise6.sysj line: 178, column: 5
              idLocation_in.setACK(false);//sysj/Exercise6.sysj line: 178, column: 5
              S3914=1;
              active[13]=1;
              ends[13]=1;
              tdone[13]=1;
            }
            else {
              S3909=0;
              if(!idLocation_in.isREQ()){//sysj/Exercise6.sysj line: 178, column: 5
                idLocation_in.setACK(true);//sysj/Exercise6.sysj line: 178, column: 5
                S3909=1;
                if(idLocation_in.isREQ()){//sysj/Exercise6.sysj line: 178, column: 5
                  idLocation_in.setACK(false);//sysj/Exercise6.sysj line: 178, column: 5
                  ends[13]=2;
                  ;//sysj/Exercise6.sysj line: 178, column: 5
                  zoneLocation_thread_13 = (String)(idLocation_in.getVal() == null ? null : ((String)idLocation_in.getVal()));//sysj/Exercise6.sysj line: 179, column: 5
                  S3819=3;
                  active[13]=1;
                  ends[13]=1;
                  tdone[13]=1;
                }
                else {
                  active[13]=1;
                  ends[13]=1;
                  tdone[13]=1;
                }
              }
              else {
                active[13]=1;
                ends[13]=1;
                tdone[13]=1;
              }
            }
          }
          else {
            active[13]=1;
            ends[13]=1;
            tdone[13]=1;
          }
        }
        else {
          active[13]=1;
          ends[13]=1;
          tdone[13]=1;
        }
      }
    }
    else {
      active[13]=1;
      ends[13]=1;
      tdone[13]=1;
    }
  }

  public void thread6352(int [] tdone, int [] ends){
        S3803=1;
    S3755=0;
    S3739=0;
    if(!humanPresence_in.isPartnerPresent() || humanPresence_in.isPartnerPreempted()){//sysj/Exercise6.sysj line: 150, column: 5
      humanPresence_in.setACK(false);//sysj/Exercise6.sysj line: 150, column: 5
      S3739=1;
      active[12]=1;
      ends[12]=1;
      tdone[12]=1;
    }
    else {
      S3734=0;
      if(!humanPresence_in.isREQ()){//sysj/Exercise6.sysj line: 150, column: 5
        humanPresence_in.setACK(true);//sysj/Exercise6.sysj line: 150, column: 5
        S3734=1;
        if(humanPresence_in.isREQ()){//sysj/Exercise6.sysj line: 150, column: 5
          humanPresence_in.setACK(false);//sysj/Exercise6.sysj line: 150, column: 5
          ends[12]=2;
          ;//sysj/Exercise6.sysj line: 150, column: 5
          result_thread_12 = (boolean)(humanPresence_in.getVal() == null ? false : ((Boolean)humanPresence_in.getVal()).booleanValue());//sysj/Exercise6.sysj line: 151, column: 5
          System.out.println("Infrared sensor trip - emergency off enacted.");//sysj/Exercise6.sysj line: 153, column: 5
          emergencyOffUI.setPresent();//sysj/Exercise6.sysj line: 155, column: 5
          currsigs.addElement(emergencyOffUI);
          S3755=1;
          active[12]=1;
          ends[12]=1;
          tdone[12]=1;
        }
        else {
          active[12]=1;
          ends[12]=1;
          tdone[12]=1;
        }
      }
      else {
        active[12]=1;
        ends[12]=1;
        tdone[12]=1;
      }
    }
  }

  public void thread6351(int [] tdone, int [] ends){
        S3732=1;
    S3120=0;
    S3104=0;
    if(!door1CardReader_in.isPartnerPresent() || door1CardReader_in.isPartnerPreempted()){//sysj/Exercise6.sysj line: 132, column: 5
      door1CardReader_in.setACK(false);//sysj/Exercise6.sysj line: 132, column: 5
      S3104=1;
      active[11]=1;
      ends[11]=1;
      tdone[11]=1;
    }
    else {
      S3099=0;
      if(!door1CardReader_in.isREQ()){//sysj/Exercise6.sysj line: 132, column: 5
        door1CardReader_in.setACK(true);//sysj/Exercise6.sysj line: 132, column: 5
        S3099=1;
        if(door1CardReader_in.isREQ()){//sysj/Exercise6.sysj line: 132, column: 5
          door1CardReader_in.setACK(false);//sysj/Exercise6.sysj line: 132, column: 5
          ends[11]=2;
          ;//sysj/Exercise6.sysj line: 132, column: 5
          id_thread_11 = (String)(door1CardReader_in.getVal() == null ? null : ((String)door1CardReader_in.getVal()));//sysj/Exercise6.sysj line: 133, column: 5
          result_thread_11 = DoorIDDB.authDoorAccess(id_thread_11, "1");//sysj/Exercise6.sysj line: 134, column: 5
          S3120=1;
          if(result_thread_11 == true){//sysj/Exercise6.sysj line: 135, column: 9
            S3167=0;
            S3127=0;
            if(!door1Grant_o.isPartnerPresent() || door1Grant_o.isPartnerPreempted()){//sysj/Exercise6.sysj line: 136, column: 6
              door1Grant_o.setREQ(false);//sysj/Exercise6.sysj line: 136, column: 6
              S3127=1;
              active[11]=1;
              ends[11]=1;
              tdone[11]=1;
            }
            else {
              S3122=0;
              if(door1Grant_o.isACK()){//sysj/Exercise6.sysj line: 136, column: 6
                door1Grant_o.setVal(true);//sysj/Exercise6.sysj line: 136, column: 6
                S3122=1;
                if(!door1Grant_o.isACK()){//sysj/Exercise6.sysj line: 136, column: 6
                  door1Grant_o.setREQ(false);//sysj/Exercise6.sysj line: 136, column: 6
                  ends[11]=2;
                  ;//sysj/Exercise6.sysj line: 136, column: 6
                  door1GrantUI.setPresent();//sysj/Exercise6.sysj line: 137, column: 6
                  currsigs.addElement(door1GrantUI);
                  S3120=2;
                  active[11]=1;
                  ends[11]=1;
                  tdone[11]=1;
                }
                else {
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
            }
          }
          else {
            S3167=1;
            S3150=0;
            if(!door1Deny_o.isPartnerPresent() || door1Deny_o.isPartnerPreempted()){//sysj/Exercise6.sysj line: 140, column: 6
              door1Deny_o.setREQ(false);//sysj/Exercise6.sysj line: 140, column: 6
              S3150=1;
              active[11]=1;
              ends[11]=1;
              tdone[11]=1;
            }
            else {
              S3145=0;
              if(door1Deny_o.isACK()){//sysj/Exercise6.sysj line: 140, column: 6
                door1Deny_o.setVal(true);//sysj/Exercise6.sysj line: 140, column: 6
                S3145=1;
                if(!door1Deny_o.isACK()){//sysj/Exercise6.sysj line: 140, column: 6
                  door1Deny_o.setREQ(false);//sysj/Exercise6.sysj line: 140, column: 6
                  ends[11]=2;
                  ;//sysj/Exercise6.sysj line: 140, column: 6
                  door1DenyUI.setPresent();//sysj/Exercise6.sysj line: 141, column: 6
                  currsigs.addElement(door1DenyUI);
                  S3120=2;
                  active[11]=1;
                  ends[11]=1;
                  tdone[11]=1;
                }
                else {
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
            }
          }
        }
        else {
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
    }
  }

  public void runClockDomain(){
    for(int i=0;i<ends.length;i++){
      ends[i] = 0;
      tdone[i] = 0;
    }
    
    RUN: while(true){
      switch(S6333){
        case 0 : 
          S6333=0;
          break RUN;
        
        case 1 : 
          S6333=2;
          S6333=2;
          thread6351(tdone,ends);
          thread6352(tdone,ends);
          thread6353(tdone,ends);
          int biggest6354 = 0;
          if(ends[11]>=biggest6354){
            biggest6354=ends[11];
          }
          if(ends[12]>=biggest6354){
            biggest6354=ends[12];
          }
          if(ends[13]>=biggest6354){
            biggest6354=ends[13];
          }
          if(biggest6354 == 1){
            active[10]=1;
            ends[10]=1;
            break RUN;
          }
        
        case 2 : 
          thread6355(tdone,ends);
          thread6356(tdone,ends);
          thread6357(tdone,ends);
          int biggest6358 = 0;
          if(ends[11]>=biggest6358){
            biggest6358=ends[11];
          }
          if(ends[12]>=biggest6358){
            biggest6358=ends[12];
          }
          if(ends[13]>=biggest6358){
            biggest6358=ends[13];
          }
          if(biggest6358 == 1){
            active[10]=1;
            ends[10]=1;
            break RUN;
          }
          //FINXME code
          if(biggest6358 == 0){
            S6333=0;
            active[10]=0;
            ends[10]=0;
            S6333=0;
            break RUN;
          }
        
      }
    }
  }

  public void init(){
    char [] active1 = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
    char [] paused1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    char [] suspended1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    paused = paused1;
    active = active1;
    suspended = suspended1;
    // Now instantiate all the local signals ONLY
    // --------------------------------------------------
  }
  
  public void run(){
    while(active[10] != 0){
      int index = 10;
      if(paused[index]==1 || suspended[index]==1 || active[index] == 0){
        for(int h=1;h<paused.length;++h){
          paused[h]=0;
        }
      }
      if(paused[10]!=0 || suspended[10]!=0 || active[10]!=1);
      else{
        if(!df){
          humanPresence_in.gethook();
          idLocation_in.gethook();
          door1CardReader_in.gethook();
          idAuthResponse_in.gethook();
          reqIDLoc_o.gethook();
          door1Grant_o.gethook();
          door1Deny_o.gethook();
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
      humanPresence_in.sethook();
      idLocation_in.sethook();
      door1CardReader_in.sethook();
      idAuthResponse_in.sethook();
      reqIDLoc_o.sethook();
      door1Grant_o.sethook();
      door1Deny_o.sethook();
      emergencyOff_o.sethook();
      reqAuthCheck_o.sethook();
      if(paused[10]!=0 || suspended[10]!=0 || active[10]!=1);
      else{
        humanPresence_in.gethook();
        idLocation_in.gethook();
        door1CardReader_in.gethook();
        idAuthResponse_in.gethook();
        reqIDLoc_o.gethook();
        door1Grant_o.gethook();
        door1Deny_o.gethook();
        emergencyOff_o.gethook();
        reqAuthCheck_o.gethook();
      }
      runFinisher();
      if(active[10] == 0){
      	this.terminated = true;
      }
      if(!threaded) break;
    }
  }
}
