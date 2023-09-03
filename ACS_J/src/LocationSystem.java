import java.util.*;
import com.systemj.ClockDomain;
import com.systemj.Signal;
import com.systemj.input_Channel;
import com.systemj.output_Channel;

public class LocationSystem extends ClockDomain{
  public LocationSystem(String name){super(name);}
  Vector currsigs = new Vector();
  private boolean df = false;
  private char [] active;
  private char [] paused;
  private char [] suspended;
  public input_Channel reqIDLoc_in = new input_Channel();
  public input_Channel reqAuthCheck_in = new input_Channel();
  public output_Channel idLocation_o = new output_Channel();
  public output_Channel idAuthResponse_o = new output_Channel();
  private String idQuery_thread_6;//sysj/Exercise6.sysj line: 54, column: 6
  private String result_thread_6;//sysj/Exercise6.sysj line: 56, column: 6
  private String idQuery_thread_7;//sysj/Exercise6.sysj line: 65, column: 6
  private boolean result_thread_7;//sysj/Exercise6.sysj line: 66, column: 6
  private long __start_thread_8;//sysj/Exercise6.sysj line: 74, column: 5
  private int S2786 = 1;
  private int S2150 = 1;
  private int S1838 = 1;
  private int S1822 = 1;
  private int S1817 = 1;
  private int S1845 = 1;
  private int S1840 = 1;
  private int S2485 = 1;
  private int S2173 = 1;
  private int S2157 = 1;
  private int S2152 = 1;
  private int S2180 = 1;
  private int S2175 = 1;
  private int S2784 = 1;
  private int S2500 = 1;
  
  private int[] ends = new int[14];
  private int[] tdone = new int[14];
  
  public void thread6349(int [] tdone, int [] ends){
        switch(S2784){
      case 0 : 
        active[8]=0;
        ends[8]=0;
        tdone[8]=1;
        break;
      
      case 1 : 
        switch(S2500){
          case 0 : 
            if(com.systemj.Timer.getMs() - __start_thread_8 >= (15) * 1000){//sysj/Exercise6.sysj line: 74, column: 5
              ends[8]=2;
              ;//sysj/Exercise6.sysj line: 74, column: 5
              LocationMap.setLocationForID("11111", "2");//sysj/Exercise6.sysj line: 76, column: 6
              S2500=1;
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
            S2500=1;
            S2500=2;
            __start_thread_8 = com.systemj.Timer.getMs();//sysj/Exercise6.sysj line: 74, column: 5
            if(com.systemj.Timer.getMs() - __start_thread_8 >= (15) * 1000){//sysj/Exercise6.sysj line: 74, column: 5
              ends[8]=2;
              ;//sysj/Exercise6.sysj line: 74, column: 5
              LocationMap.setLocationForID("11111", "3");//sysj/Exercise6.sysj line: 79, column: 6
              S2500=3;
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
            if(com.systemj.Timer.getMs() - __start_thread_8 >= (15) * 1000){//sysj/Exercise6.sysj line: 74, column: 5
              ends[8]=2;
              ;//sysj/Exercise6.sysj line: 74, column: 5
              LocationMap.setLocationForID("11111", "3");//sysj/Exercise6.sysj line: 79, column: 6
              S2500=3;
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
            S2500=3;
            S2500=4;
            __start_thread_8 = com.systemj.Timer.getMs();//sysj/Exercise6.sysj line: 74, column: 5
            if(com.systemj.Timer.getMs() - __start_thread_8 >= (15) * 1000){//sysj/Exercise6.sysj line: 74, column: 5
              ends[8]=2;
              ;//sysj/Exercise6.sysj line: 74, column: 5
              LocationMap.setLocationForID("11111", "7");//sysj/Exercise6.sysj line: 82, column: 6
              S2500=5;
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
          
          case 4 : 
            if(com.systemj.Timer.getMs() - __start_thread_8 >= (15) * 1000){//sysj/Exercise6.sysj line: 74, column: 5
              ends[8]=2;
              ;//sysj/Exercise6.sysj line: 74, column: 5
              LocationMap.setLocationForID("11111", "7");//sysj/Exercise6.sysj line: 82, column: 6
              S2500=5;
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
          
          case 5 : 
            S2500=5;
            S2500=6;
            __start_thread_8 = com.systemj.Timer.getMs();//sysj/Exercise6.sysj line: 74, column: 5
            if(com.systemj.Timer.getMs() - __start_thread_8 >= (15) * 1000){//sysj/Exercise6.sysj line: 74, column: 5
              ends[8]=2;
              ;//sysj/Exercise6.sysj line: 74, column: 5
              LocationMap.setLocationForID("11111", "1");//sysj/Exercise6.sysj line: 85, column: 6
              S2500=7;
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
          
          case 6 : 
            if(com.systemj.Timer.getMs() - __start_thread_8 >= (15) * 1000){//sysj/Exercise6.sysj line: 74, column: 5
              ends[8]=2;
              ;//sysj/Exercise6.sysj line: 74, column: 5
              LocationMap.setLocationForID("11111", "1");//sysj/Exercise6.sysj line: 85, column: 6
              S2500=7;
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
          
          case 7 : 
            S2500=7;
            S2500=0;
            __start_thread_8 = com.systemj.Timer.getMs();//sysj/Exercise6.sysj line: 74, column: 5
            if(com.systemj.Timer.getMs() - __start_thread_8 >= (15) * 1000){//sysj/Exercise6.sysj line: 74, column: 5
              ends[8]=2;
              ;//sysj/Exercise6.sysj line: 74, column: 5
              LocationMap.setLocationForID("11111", "2");//sysj/Exercise6.sysj line: 76, column: 6
              S2500=1;
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
        break;
      
    }
  }

  public void thread6348(int [] tdone, int [] ends){
        switch(S2485){
      case 0 : 
        active[7]=0;
        ends[7]=0;
        tdone[7]=1;
        break;
      
      case 1 : 
        switch(S2173){
          case 0 : 
            switch(S2157){
              case 0 : 
                if(!reqAuthCheck_in.isPartnerPresent() || reqAuthCheck_in.isPartnerPreempted()){//sysj/Exercise6.sysj line: 64, column: 6
                  reqAuthCheck_in.setACK(false);//sysj/Exercise6.sysj line: 64, column: 6
                  S2157=1;
                  active[7]=1;
                  ends[7]=1;
                  tdone[7]=1;
                }
                else {
                  switch(S2152){
                    case 0 : 
                      if(!reqAuthCheck_in.isREQ()){//sysj/Exercise6.sysj line: 64, column: 6
                        reqAuthCheck_in.setACK(true);//sysj/Exercise6.sysj line: 64, column: 6
                        S2152=1;
                        if(reqAuthCheck_in.isREQ()){//sysj/Exercise6.sysj line: 64, column: 6
                          reqAuthCheck_in.setACK(false);//sysj/Exercise6.sysj line: 64, column: 6
                          ends[7]=2;
                          ;//sysj/Exercise6.sysj line: 64, column: 6
                          idQuery_thread_7 = (String)(reqAuthCheck_in.getVal() == null ? null : ((String)reqAuthCheck_in.getVal()));//sysj/Exercise6.sysj line: 65, column: 6
                          result_thread_7 = LocationMap.authIDCheck(idQuery_thread_7);//sysj/Exercise6.sysj line: 66, column: 6
                          S2173=1;
                          S2180=0;
                          if(!idAuthResponse_o.isPartnerPresent() || idAuthResponse_o.isPartnerPreempted()){//sysj/Exercise6.sysj line: 67, column: 6
                            idAuthResponse_o.setREQ(false);//sysj/Exercise6.sysj line: 67, column: 6
                            S2180=1;
                            active[7]=1;
                            ends[7]=1;
                            tdone[7]=1;
                          }
                          else {
                            S2175=0;
                            if(idAuthResponse_o.isACK()){//sysj/Exercise6.sysj line: 67, column: 6
                              idAuthResponse_o.setVal(result_thread_7);//sysj/Exercise6.sysj line: 67, column: 6
                              S2175=1;
                              if(!idAuthResponse_o.isACK()){//sysj/Exercise6.sysj line: 67, column: 6
                                idAuthResponse_o.setREQ(false);//sysj/Exercise6.sysj line: 67, column: 6
                                ends[7]=2;
                                ;//sysj/Exercise6.sysj line: 67, column: 6
                                S2173=2;
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
                      if(reqAuthCheck_in.isREQ()){//sysj/Exercise6.sysj line: 64, column: 6
                        reqAuthCheck_in.setACK(false);//sysj/Exercise6.sysj line: 64, column: 6
                        ends[7]=2;
                        ;//sysj/Exercise6.sysj line: 64, column: 6
                        idQuery_thread_7 = (String)(reqAuthCheck_in.getVal() == null ? null : ((String)reqAuthCheck_in.getVal()));//sysj/Exercise6.sysj line: 65, column: 6
                        result_thread_7 = LocationMap.authIDCheck(idQuery_thread_7);//sysj/Exercise6.sysj line: 66, column: 6
                        S2173=1;
                        S2180=0;
                        if(!idAuthResponse_o.isPartnerPresent() || idAuthResponse_o.isPartnerPreempted()){//sysj/Exercise6.sysj line: 67, column: 6
                          idAuthResponse_o.setREQ(false);//sysj/Exercise6.sysj line: 67, column: 6
                          S2180=1;
                          active[7]=1;
                          ends[7]=1;
                          tdone[7]=1;
                        }
                        else {
                          S2175=0;
                          if(idAuthResponse_o.isACK()){//sysj/Exercise6.sysj line: 67, column: 6
                            idAuthResponse_o.setVal(result_thread_7);//sysj/Exercise6.sysj line: 67, column: 6
                            S2175=1;
                            if(!idAuthResponse_o.isACK()){//sysj/Exercise6.sysj line: 67, column: 6
                              idAuthResponse_o.setREQ(false);//sysj/Exercise6.sysj line: 67, column: 6
                              ends[7]=2;
                              ;//sysj/Exercise6.sysj line: 67, column: 6
                              S2173=2;
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
                S2157=1;
                S2157=0;
                if(!reqAuthCheck_in.isPartnerPresent() || reqAuthCheck_in.isPartnerPreempted()){//sysj/Exercise6.sysj line: 64, column: 6
                  reqAuthCheck_in.setACK(false);//sysj/Exercise6.sysj line: 64, column: 6
                  S2157=1;
                  active[7]=1;
                  ends[7]=1;
                  tdone[7]=1;
                }
                else {
                  S2152=0;
                  if(!reqAuthCheck_in.isREQ()){//sysj/Exercise6.sysj line: 64, column: 6
                    reqAuthCheck_in.setACK(true);//sysj/Exercise6.sysj line: 64, column: 6
                    S2152=1;
                    if(reqAuthCheck_in.isREQ()){//sysj/Exercise6.sysj line: 64, column: 6
                      reqAuthCheck_in.setACK(false);//sysj/Exercise6.sysj line: 64, column: 6
                      ends[7]=2;
                      ;//sysj/Exercise6.sysj line: 64, column: 6
                      idQuery_thread_7 = (String)(reqAuthCheck_in.getVal() == null ? null : ((String)reqAuthCheck_in.getVal()));//sysj/Exercise6.sysj line: 65, column: 6
                      result_thread_7 = LocationMap.authIDCheck(idQuery_thread_7);//sysj/Exercise6.sysj line: 66, column: 6
                      S2173=1;
                      S2180=0;
                      if(!idAuthResponse_o.isPartnerPresent() || idAuthResponse_o.isPartnerPreempted()){//sysj/Exercise6.sysj line: 67, column: 6
                        idAuthResponse_o.setREQ(false);//sysj/Exercise6.sysj line: 67, column: 6
                        S2180=1;
                        active[7]=1;
                        ends[7]=1;
                        tdone[7]=1;
                      }
                      else {
                        S2175=0;
                        if(idAuthResponse_o.isACK()){//sysj/Exercise6.sysj line: 67, column: 6
                          idAuthResponse_o.setVal(result_thread_7);//sysj/Exercise6.sysj line: 67, column: 6
                          S2175=1;
                          if(!idAuthResponse_o.isACK()){//sysj/Exercise6.sysj line: 67, column: 6
                            idAuthResponse_o.setREQ(false);//sysj/Exercise6.sysj line: 67, column: 6
                            ends[7]=2;
                            ;//sysj/Exercise6.sysj line: 67, column: 6
                            S2173=2;
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
          
          case 1 : 
            switch(S2180){
              case 0 : 
                if(!idAuthResponse_o.isPartnerPresent() || idAuthResponse_o.isPartnerPreempted()){//sysj/Exercise6.sysj line: 67, column: 6
                  idAuthResponse_o.setREQ(false);//sysj/Exercise6.sysj line: 67, column: 6
                  S2180=1;
                  active[7]=1;
                  ends[7]=1;
                  tdone[7]=1;
                }
                else {
                  switch(S2175){
                    case 0 : 
                      if(idAuthResponse_o.isACK()){//sysj/Exercise6.sysj line: 67, column: 6
                        idAuthResponse_o.setVal(result_thread_7);//sysj/Exercise6.sysj line: 67, column: 6
                        S2175=1;
                        if(!idAuthResponse_o.isACK()){//sysj/Exercise6.sysj line: 67, column: 6
                          idAuthResponse_o.setREQ(false);//sysj/Exercise6.sysj line: 67, column: 6
                          ends[7]=2;
                          ;//sysj/Exercise6.sysj line: 67, column: 6
                          S2173=2;
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
                      if(!idAuthResponse_o.isACK()){//sysj/Exercise6.sysj line: 67, column: 6
                        idAuthResponse_o.setREQ(false);//sysj/Exercise6.sysj line: 67, column: 6
                        ends[7]=2;
                        ;//sysj/Exercise6.sysj line: 67, column: 6
                        S2173=2;
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
                S2180=1;
                S2180=0;
                if(!idAuthResponse_o.isPartnerPresent() || idAuthResponse_o.isPartnerPreempted()){//sysj/Exercise6.sysj line: 67, column: 6
                  idAuthResponse_o.setREQ(false);//sysj/Exercise6.sysj line: 67, column: 6
                  S2180=1;
                  active[7]=1;
                  ends[7]=1;
                  tdone[7]=1;
                }
                else {
                  S2175=0;
                  if(idAuthResponse_o.isACK()){//sysj/Exercise6.sysj line: 67, column: 6
                    idAuthResponse_o.setVal(result_thread_7);//sysj/Exercise6.sysj line: 67, column: 6
                    S2175=1;
                    if(!idAuthResponse_o.isACK()){//sysj/Exercise6.sysj line: 67, column: 6
                      idAuthResponse_o.setREQ(false);//sysj/Exercise6.sysj line: 67, column: 6
                      ends[7]=2;
                      ;//sysj/Exercise6.sysj line: 67, column: 6
                      S2173=2;
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
          
          case 2 : 
            S2173=2;
            S2173=0;
            S2157=0;
            if(!reqAuthCheck_in.isPartnerPresent() || reqAuthCheck_in.isPartnerPreempted()){//sysj/Exercise6.sysj line: 64, column: 6
              reqAuthCheck_in.setACK(false);//sysj/Exercise6.sysj line: 64, column: 6
              S2157=1;
              active[7]=1;
              ends[7]=1;
              tdone[7]=1;
            }
            else {
              S2152=0;
              if(!reqAuthCheck_in.isREQ()){//sysj/Exercise6.sysj line: 64, column: 6
                reqAuthCheck_in.setACK(true);//sysj/Exercise6.sysj line: 64, column: 6
                S2152=1;
                if(reqAuthCheck_in.isREQ()){//sysj/Exercise6.sysj line: 64, column: 6
                  reqAuthCheck_in.setACK(false);//sysj/Exercise6.sysj line: 64, column: 6
                  ends[7]=2;
                  ;//sysj/Exercise6.sysj line: 64, column: 6
                  idQuery_thread_7 = (String)(reqAuthCheck_in.getVal() == null ? null : ((String)reqAuthCheck_in.getVal()));//sysj/Exercise6.sysj line: 65, column: 6
                  result_thread_7 = LocationMap.authIDCheck(idQuery_thread_7);//sysj/Exercise6.sysj line: 66, column: 6
                  S2173=1;
                  S2180=0;
                  if(!idAuthResponse_o.isPartnerPresent() || idAuthResponse_o.isPartnerPreempted()){//sysj/Exercise6.sysj line: 67, column: 6
                    idAuthResponse_o.setREQ(false);//sysj/Exercise6.sysj line: 67, column: 6
                    S2180=1;
                    active[7]=1;
                    ends[7]=1;
                    tdone[7]=1;
                  }
                  else {
                    S2175=0;
                    if(idAuthResponse_o.isACK()){//sysj/Exercise6.sysj line: 67, column: 6
                      idAuthResponse_o.setVal(result_thread_7);//sysj/Exercise6.sysj line: 67, column: 6
                      S2175=1;
                      if(!idAuthResponse_o.isACK()){//sysj/Exercise6.sysj line: 67, column: 6
                        idAuthResponse_o.setREQ(false);//sysj/Exercise6.sysj line: 67, column: 6
                        ends[7]=2;
                        ;//sysj/Exercise6.sysj line: 67, column: 6
                        S2173=2;
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
      
    }
  }

  public void thread6347(int [] tdone, int [] ends){
        switch(S2150){
      case 0 : 
        active[6]=0;
        ends[6]=0;
        tdone[6]=1;
        break;
      
      case 1 : 
        switch(S1838){
          case 0 : 
            switch(S1822){
              case 0 : 
                if(!reqIDLoc_in.isPartnerPresent() || reqIDLoc_in.isPartnerPreempted()){//sysj/Exercise6.sysj line: 53, column: 6
                  reqIDLoc_in.setACK(false);//sysj/Exercise6.sysj line: 53, column: 6
                  S1822=1;
                  active[6]=1;
                  ends[6]=1;
                  tdone[6]=1;
                }
                else {
                  switch(S1817){
                    case 0 : 
                      if(!reqIDLoc_in.isREQ()){//sysj/Exercise6.sysj line: 53, column: 6
                        reqIDLoc_in.setACK(true);//sysj/Exercise6.sysj line: 53, column: 6
                        S1817=1;
                        if(reqIDLoc_in.isREQ()){//sysj/Exercise6.sysj line: 53, column: 6
                          reqIDLoc_in.setACK(false);//sysj/Exercise6.sysj line: 53, column: 6
                          ends[6]=2;
                          ;//sysj/Exercise6.sysj line: 53, column: 6
                          idQuery_thread_6 = (reqIDLoc_in.getVal() == null ? null : ((String)reqIDLoc_in.getVal()));//sysj/Exercise6.sysj line: 54, column: 6
                          result_thread_6 = LocationMap.getLocationFromID(idQuery_thread_6);//sysj/Exercise6.sysj line: 56, column: 6
                          S1838=1;
                          S1845=0;
                          if(!idLocation_o.isPartnerPresent() || idLocation_o.isPartnerPreempted()){//sysj/Exercise6.sysj line: 57, column: 6
                            idLocation_o.setREQ(false);//sysj/Exercise6.sysj line: 57, column: 6
                            S1845=1;
                            active[6]=1;
                            ends[6]=1;
                            tdone[6]=1;
                          }
                          else {
                            S1840=0;
                            if(idLocation_o.isACK()){//sysj/Exercise6.sysj line: 57, column: 6
                              idLocation_o.setVal(result_thread_6);//sysj/Exercise6.sysj line: 57, column: 6
                              S1840=1;
                              if(!idLocation_o.isACK()){//sysj/Exercise6.sysj line: 57, column: 6
                                idLocation_o.setREQ(false);//sysj/Exercise6.sysj line: 57, column: 6
                                ends[6]=2;
                                ;//sysj/Exercise6.sysj line: 57, column: 6
                                S1838=2;
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
                      if(reqIDLoc_in.isREQ()){//sysj/Exercise6.sysj line: 53, column: 6
                        reqIDLoc_in.setACK(false);//sysj/Exercise6.sysj line: 53, column: 6
                        ends[6]=2;
                        ;//sysj/Exercise6.sysj line: 53, column: 6
                        idQuery_thread_6 = (reqIDLoc_in.getVal() == null ? null : ((String)reqIDLoc_in.getVal()));//sysj/Exercise6.sysj line: 54, column: 6
                        result_thread_6 = LocationMap.getLocationFromID(idQuery_thread_6);//sysj/Exercise6.sysj line: 56, column: 6
                        S1838=1;
                        S1845=0;
                        if(!idLocation_o.isPartnerPresent() || idLocation_o.isPartnerPreempted()){//sysj/Exercise6.sysj line: 57, column: 6
                          idLocation_o.setREQ(false);//sysj/Exercise6.sysj line: 57, column: 6
                          S1845=1;
                          active[6]=1;
                          ends[6]=1;
                          tdone[6]=1;
                        }
                        else {
                          S1840=0;
                          if(idLocation_o.isACK()){//sysj/Exercise6.sysj line: 57, column: 6
                            idLocation_o.setVal(result_thread_6);//sysj/Exercise6.sysj line: 57, column: 6
                            S1840=1;
                            if(!idLocation_o.isACK()){//sysj/Exercise6.sysj line: 57, column: 6
                              idLocation_o.setREQ(false);//sysj/Exercise6.sysj line: 57, column: 6
                              ends[6]=2;
                              ;//sysj/Exercise6.sysj line: 57, column: 6
                              S1838=2;
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
                S1822=1;
                S1822=0;
                if(!reqIDLoc_in.isPartnerPresent() || reqIDLoc_in.isPartnerPreempted()){//sysj/Exercise6.sysj line: 53, column: 6
                  reqIDLoc_in.setACK(false);//sysj/Exercise6.sysj line: 53, column: 6
                  S1822=1;
                  active[6]=1;
                  ends[6]=1;
                  tdone[6]=1;
                }
                else {
                  S1817=0;
                  if(!reqIDLoc_in.isREQ()){//sysj/Exercise6.sysj line: 53, column: 6
                    reqIDLoc_in.setACK(true);//sysj/Exercise6.sysj line: 53, column: 6
                    S1817=1;
                    if(reqIDLoc_in.isREQ()){//sysj/Exercise6.sysj line: 53, column: 6
                      reqIDLoc_in.setACK(false);//sysj/Exercise6.sysj line: 53, column: 6
                      ends[6]=2;
                      ;//sysj/Exercise6.sysj line: 53, column: 6
                      idQuery_thread_6 = (reqIDLoc_in.getVal() == null ? null : ((String)reqIDLoc_in.getVal()));//sysj/Exercise6.sysj line: 54, column: 6
                      result_thread_6 = LocationMap.getLocationFromID(idQuery_thread_6);//sysj/Exercise6.sysj line: 56, column: 6
                      S1838=1;
                      S1845=0;
                      if(!idLocation_o.isPartnerPresent() || idLocation_o.isPartnerPreempted()){//sysj/Exercise6.sysj line: 57, column: 6
                        idLocation_o.setREQ(false);//sysj/Exercise6.sysj line: 57, column: 6
                        S1845=1;
                        active[6]=1;
                        ends[6]=1;
                        tdone[6]=1;
                      }
                      else {
                        S1840=0;
                        if(idLocation_o.isACK()){//sysj/Exercise6.sysj line: 57, column: 6
                          idLocation_o.setVal(result_thread_6);//sysj/Exercise6.sysj line: 57, column: 6
                          S1840=1;
                          if(!idLocation_o.isACK()){//sysj/Exercise6.sysj line: 57, column: 6
                            idLocation_o.setREQ(false);//sysj/Exercise6.sysj line: 57, column: 6
                            ends[6]=2;
                            ;//sysj/Exercise6.sysj line: 57, column: 6
                            S1838=2;
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
          
          case 1 : 
            switch(S1845){
              case 0 : 
                if(!idLocation_o.isPartnerPresent() || idLocation_o.isPartnerPreempted()){//sysj/Exercise6.sysj line: 57, column: 6
                  idLocation_o.setREQ(false);//sysj/Exercise6.sysj line: 57, column: 6
                  S1845=1;
                  active[6]=1;
                  ends[6]=1;
                  tdone[6]=1;
                }
                else {
                  switch(S1840){
                    case 0 : 
                      if(idLocation_o.isACK()){//sysj/Exercise6.sysj line: 57, column: 6
                        idLocation_o.setVal(result_thread_6);//sysj/Exercise6.sysj line: 57, column: 6
                        S1840=1;
                        if(!idLocation_o.isACK()){//sysj/Exercise6.sysj line: 57, column: 6
                          idLocation_o.setREQ(false);//sysj/Exercise6.sysj line: 57, column: 6
                          ends[6]=2;
                          ;//sysj/Exercise6.sysj line: 57, column: 6
                          S1838=2;
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
                      if(!idLocation_o.isACK()){//sysj/Exercise6.sysj line: 57, column: 6
                        idLocation_o.setREQ(false);//sysj/Exercise6.sysj line: 57, column: 6
                        ends[6]=2;
                        ;//sysj/Exercise6.sysj line: 57, column: 6
                        S1838=2;
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
                S1845=1;
                S1845=0;
                if(!idLocation_o.isPartnerPresent() || idLocation_o.isPartnerPreempted()){//sysj/Exercise6.sysj line: 57, column: 6
                  idLocation_o.setREQ(false);//sysj/Exercise6.sysj line: 57, column: 6
                  S1845=1;
                  active[6]=1;
                  ends[6]=1;
                  tdone[6]=1;
                }
                else {
                  S1840=0;
                  if(idLocation_o.isACK()){//sysj/Exercise6.sysj line: 57, column: 6
                    idLocation_o.setVal(result_thread_6);//sysj/Exercise6.sysj line: 57, column: 6
                    S1840=1;
                    if(!idLocation_o.isACK()){//sysj/Exercise6.sysj line: 57, column: 6
                      idLocation_o.setREQ(false);//sysj/Exercise6.sysj line: 57, column: 6
                      ends[6]=2;
                      ;//sysj/Exercise6.sysj line: 57, column: 6
                      S1838=2;
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
          
          case 2 : 
            S1838=2;
            S1838=0;
            S1822=0;
            if(!reqIDLoc_in.isPartnerPresent() || reqIDLoc_in.isPartnerPreempted()){//sysj/Exercise6.sysj line: 53, column: 6
              reqIDLoc_in.setACK(false);//sysj/Exercise6.sysj line: 53, column: 6
              S1822=1;
              active[6]=1;
              ends[6]=1;
              tdone[6]=1;
            }
            else {
              S1817=0;
              if(!reqIDLoc_in.isREQ()){//sysj/Exercise6.sysj line: 53, column: 6
                reqIDLoc_in.setACK(true);//sysj/Exercise6.sysj line: 53, column: 6
                S1817=1;
                if(reqIDLoc_in.isREQ()){//sysj/Exercise6.sysj line: 53, column: 6
                  reqIDLoc_in.setACK(false);//sysj/Exercise6.sysj line: 53, column: 6
                  ends[6]=2;
                  ;//sysj/Exercise6.sysj line: 53, column: 6
                  idQuery_thread_6 = (reqIDLoc_in.getVal() == null ? null : ((String)reqIDLoc_in.getVal()));//sysj/Exercise6.sysj line: 54, column: 6
                  result_thread_6 = LocationMap.getLocationFromID(idQuery_thread_6);//sysj/Exercise6.sysj line: 56, column: 6
                  S1838=1;
                  S1845=0;
                  if(!idLocation_o.isPartnerPresent() || idLocation_o.isPartnerPreempted()){//sysj/Exercise6.sysj line: 57, column: 6
                    idLocation_o.setREQ(false);//sysj/Exercise6.sysj line: 57, column: 6
                    S1845=1;
                    active[6]=1;
                    ends[6]=1;
                    tdone[6]=1;
                  }
                  else {
                    S1840=0;
                    if(idLocation_o.isACK()){//sysj/Exercise6.sysj line: 57, column: 6
                      idLocation_o.setVal(result_thread_6);//sysj/Exercise6.sysj line: 57, column: 6
                      S1840=1;
                      if(!idLocation_o.isACK()){//sysj/Exercise6.sysj line: 57, column: 6
                        idLocation_o.setREQ(false);//sysj/Exercise6.sysj line: 57, column: 6
                        ends[6]=2;
                        ;//sysj/Exercise6.sysj line: 57, column: 6
                        S1838=2;
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
      
    }
  }

  public void thread6345(int [] tdone, int [] ends){
        S2784=1;
    S2500=0;
    __start_thread_8 = com.systemj.Timer.getMs();//sysj/Exercise6.sysj line: 74, column: 5
    if(com.systemj.Timer.getMs() - __start_thread_8 >= (15) * 1000){//sysj/Exercise6.sysj line: 74, column: 5
      ends[8]=2;
      ;//sysj/Exercise6.sysj line: 74, column: 5
      LocationMap.setLocationForID("11111", "2");//sysj/Exercise6.sysj line: 76, column: 6
      S2500=1;
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

  public void thread6344(int [] tdone, int [] ends){
        S2485=1;
    S2173=0;
    S2157=0;
    if(!reqAuthCheck_in.isPartnerPresent() || reqAuthCheck_in.isPartnerPreempted()){//sysj/Exercise6.sysj line: 64, column: 6
      reqAuthCheck_in.setACK(false);//sysj/Exercise6.sysj line: 64, column: 6
      S2157=1;
      active[7]=1;
      ends[7]=1;
      tdone[7]=1;
    }
    else {
      S2152=0;
      if(!reqAuthCheck_in.isREQ()){//sysj/Exercise6.sysj line: 64, column: 6
        reqAuthCheck_in.setACK(true);//sysj/Exercise6.sysj line: 64, column: 6
        S2152=1;
        if(reqAuthCheck_in.isREQ()){//sysj/Exercise6.sysj line: 64, column: 6
          reqAuthCheck_in.setACK(false);//sysj/Exercise6.sysj line: 64, column: 6
          ends[7]=2;
          ;//sysj/Exercise6.sysj line: 64, column: 6
          idQuery_thread_7 = (String)(reqAuthCheck_in.getVal() == null ? null : ((String)reqAuthCheck_in.getVal()));//sysj/Exercise6.sysj line: 65, column: 6
          result_thread_7 = LocationMap.authIDCheck(idQuery_thread_7);//sysj/Exercise6.sysj line: 66, column: 6
          S2173=1;
          S2180=0;
          if(!idAuthResponse_o.isPartnerPresent() || idAuthResponse_o.isPartnerPreempted()){//sysj/Exercise6.sysj line: 67, column: 6
            idAuthResponse_o.setREQ(false);//sysj/Exercise6.sysj line: 67, column: 6
            S2180=1;
            active[7]=1;
            ends[7]=1;
            tdone[7]=1;
          }
          else {
            S2175=0;
            if(idAuthResponse_o.isACK()){//sysj/Exercise6.sysj line: 67, column: 6
              idAuthResponse_o.setVal(result_thread_7);//sysj/Exercise6.sysj line: 67, column: 6
              S2175=1;
              if(!idAuthResponse_o.isACK()){//sysj/Exercise6.sysj line: 67, column: 6
                idAuthResponse_o.setREQ(false);//sysj/Exercise6.sysj line: 67, column: 6
                ends[7]=2;
                ;//sysj/Exercise6.sysj line: 67, column: 6
                S2173=2;
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

  public void thread6343(int [] tdone, int [] ends){
        S2150=1;
    S1838=0;
    S1822=0;
    if(!reqIDLoc_in.isPartnerPresent() || reqIDLoc_in.isPartnerPreempted()){//sysj/Exercise6.sysj line: 53, column: 6
      reqIDLoc_in.setACK(false);//sysj/Exercise6.sysj line: 53, column: 6
      S1822=1;
      active[6]=1;
      ends[6]=1;
      tdone[6]=1;
    }
    else {
      S1817=0;
      if(!reqIDLoc_in.isREQ()){//sysj/Exercise6.sysj line: 53, column: 6
        reqIDLoc_in.setACK(true);//sysj/Exercise6.sysj line: 53, column: 6
        S1817=1;
        if(reqIDLoc_in.isREQ()){//sysj/Exercise6.sysj line: 53, column: 6
          reqIDLoc_in.setACK(false);//sysj/Exercise6.sysj line: 53, column: 6
          ends[6]=2;
          ;//sysj/Exercise6.sysj line: 53, column: 6
          idQuery_thread_6 = (reqIDLoc_in.getVal() == null ? null : ((String)reqIDLoc_in.getVal()));//sysj/Exercise6.sysj line: 54, column: 6
          result_thread_6 = LocationMap.getLocationFromID(idQuery_thread_6);//sysj/Exercise6.sysj line: 56, column: 6
          S1838=1;
          S1845=0;
          if(!idLocation_o.isPartnerPresent() || idLocation_o.isPartnerPreempted()){//sysj/Exercise6.sysj line: 57, column: 6
            idLocation_o.setREQ(false);//sysj/Exercise6.sysj line: 57, column: 6
            S1845=1;
            active[6]=1;
            ends[6]=1;
            tdone[6]=1;
          }
          else {
            S1840=0;
            if(idLocation_o.isACK()){//sysj/Exercise6.sysj line: 57, column: 6
              idLocation_o.setVal(result_thread_6);//sysj/Exercise6.sysj line: 57, column: 6
              S1840=1;
              if(!idLocation_o.isACK()){//sysj/Exercise6.sysj line: 57, column: 6
                idLocation_o.setREQ(false);//sysj/Exercise6.sysj line: 57, column: 6
                ends[6]=2;
                ;//sysj/Exercise6.sysj line: 57, column: 6
                S1838=2;
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

  public void runClockDomain(){
    for(int i=0;i<ends.length;i++){
      ends[i] = 0;
      tdone[i] = 0;
    }
    
    RUN: while(true){
      switch(S2786){
        case 0 : 
          S2786=0;
          break RUN;
        
        case 1 : 
          S2786=2;
          S2786=2;
          thread6343(tdone,ends);
          thread6344(tdone,ends);
          thread6345(tdone,ends);
          int biggest6346 = 0;
          if(ends[6]>=biggest6346){
            biggest6346=ends[6];
          }
          if(ends[7]>=biggest6346){
            biggest6346=ends[7];
          }
          if(ends[8]>=biggest6346){
            biggest6346=ends[8];
          }
          if(biggest6346 == 1){
            active[5]=1;
            ends[5]=1;
            break RUN;
          }
        
        case 2 : 
          thread6347(tdone,ends);
          thread6348(tdone,ends);
          thread6349(tdone,ends);
          int biggest6350 = 0;
          if(ends[6]>=biggest6350){
            biggest6350=ends[6];
          }
          if(ends[7]>=biggest6350){
            biggest6350=ends[7];
          }
          if(ends[8]>=biggest6350){
            biggest6350=ends[8];
          }
          if(biggest6350 == 1){
            active[5]=1;
            ends[5]=1;
            break RUN;
          }
          //FINXME code
          if(biggest6350 == 0){
            S2786=0;
            active[5]=0;
            ends[5]=0;
            S2786=0;
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
    while(active[5] != 0){
      int index = 5;
      if(paused[index]==1 || suspended[index]==1 || active[index] == 0){
        for(int h=1;h<paused.length;++h){
          paused[h]=0;
        }
      }
      if(paused[5]!=0 || suspended[5]!=0 || active[5]!=1);
      else{
        if(!df){
          reqIDLoc_in.gethook();
          reqAuthCheck_in.gethook();
          idLocation_o.gethook();
          idAuthResponse_o.gethook();
          df = true;
        }
        runClockDomain();
      }
      int dummyint = 0;
      for(int qw=0;qw<currsigs.size();++qw){
        dummyint = ((Signal)currsigs.elementAt(qw)).getStatus() ? ((Signal)currsigs.elementAt(qw)).setprepresent() : ((Signal)currsigs.elementAt(qw)).setpreclear();
        ((Signal)currsigs.elementAt(qw)).setpreval(((Signal)currsigs.elementAt(qw)).getValue());
      }
      currsigs.removeAllElements();
      reqIDLoc_in.sethook();
      reqAuthCheck_in.sethook();
      idLocation_o.sethook();
      idAuthResponse_o.sethook();
      if(paused[5]!=0 || suspended[5]!=0 || active[5]!=1);
      else{
        reqIDLoc_in.gethook();
        reqAuthCheck_in.gethook();
        idLocation_o.gethook();
        idAuthResponse_o.gethook();
      }
      runFinisher();
      if(active[5] == 0){
      	this.terminated = true;
      }
      if(!threaded) break;
    }
  }
}
