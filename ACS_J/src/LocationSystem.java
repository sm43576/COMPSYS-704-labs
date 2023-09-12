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
  private String idQuery_thread_14;//sysj/Exercise6.sysj line: 136, column: 6
  private String result_thread_14;//sysj/Exercise6.sysj line: 138, column: 6
  private String idQuery_thread_15;//sysj/Exercise6.sysj line: 147, column: 6
  private boolean result_thread_15;//sysj/Exercise6.sysj line: 148, column: 6
  private long __start_thread_16;//sysj/Exercise6.sysj line: 156, column: 5
  private int S5366 = 1;
  private int S4730 = 1;
  private int S4418 = 1;
  private int S4402 = 1;
  private int S4397 = 1;
  private int S4425 = 1;
  private int S4420 = 1;
  private int S5065 = 1;
  private int S4753 = 1;
  private int S4737 = 1;
  private int S4732 = 1;
  private int S4760 = 1;
  private int S4755 = 1;
  private int S5364 = 1;
  private int S5080 = 1;
  
  private int[] ends = new int[24];
  private int[] tdone = new int[24];
  
  public void thread10251(int [] tdone, int [] ends){
        switch(S5364){
      case 0 : 
        active[16]=0;
        ends[16]=0;
        tdone[16]=1;
        break;
      
      case 1 : 
        switch(S5080){
          case 0 : 
            if(com.systemj.Timer.getMs() - __start_thread_16 >= (15) * 1000){//sysj/Exercise6.sysj line: 156, column: 5
              ends[16]=2;
              ;//sysj/Exercise6.sysj line: 156, column: 5
              LocationMap.setLocationForID("11111", "2");//sysj/Exercise6.sysj line: 158, column: 6
              S5080=1;
              active[16]=1;
              ends[16]=1;
              tdone[16]=1;
            }
            else {
              active[16]=1;
              ends[16]=1;
              tdone[16]=1;
            }
            break;
          
          case 1 : 
            S5080=1;
            S5080=2;
            __start_thread_16 = com.systemj.Timer.getMs();//sysj/Exercise6.sysj line: 156, column: 5
            if(com.systemj.Timer.getMs() - __start_thread_16 >= (15) * 1000){//sysj/Exercise6.sysj line: 156, column: 5
              ends[16]=2;
              ;//sysj/Exercise6.sysj line: 156, column: 5
              LocationMap.setLocationForID("11111", "3");//sysj/Exercise6.sysj line: 161, column: 6
              S5080=3;
              active[16]=1;
              ends[16]=1;
              tdone[16]=1;
            }
            else {
              active[16]=1;
              ends[16]=1;
              tdone[16]=1;
            }
            break;
          
          case 2 : 
            if(com.systemj.Timer.getMs() - __start_thread_16 >= (15) * 1000){//sysj/Exercise6.sysj line: 156, column: 5
              ends[16]=2;
              ;//sysj/Exercise6.sysj line: 156, column: 5
              LocationMap.setLocationForID("11111", "3");//sysj/Exercise6.sysj line: 161, column: 6
              S5080=3;
              active[16]=1;
              ends[16]=1;
              tdone[16]=1;
            }
            else {
              active[16]=1;
              ends[16]=1;
              tdone[16]=1;
            }
            break;
          
          case 3 : 
            S5080=3;
            S5080=4;
            __start_thread_16 = com.systemj.Timer.getMs();//sysj/Exercise6.sysj line: 156, column: 5
            if(com.systemj.Timer.getMs() - __start_thread_16 >= (15) * 1000){//sysj/Exercise6.sysj line: 156, column: 5
              ends[16]=2;
              ;//sysj/Exercise6.sysj line: 156, column: 5
              LocationMap.setLocationForID("11111", "7");//sysj/Exercise6.sysj line: 164, column: 6
              S5080=5;
              active[16]=1;
              ends[16]=1;
              tdone[16]=1;
            }
            else {
              active[16]=1;
              ends[16]=1;
              tdone[16]=1;
            }
            break;
          
          case 4 : 
            if(com.systemj.Timer.getMs() - __start_thread_16 >= (15) * 1000){//sysj/Exercise6.sysj line: 156, column: 5
              ends[16]=2;
              ;//sysj/Exercise6.sysj line: 156, column: 5
              LocationMap.setLocationForID("11111", "7");//sysj/Exercise6.sysj line: 164, column: 6
              S5080=5;
              active[16]=1;
              ends[16]=1;
              tdone[16]=1;
            }
            else {
              active[16]=1;
              ends[16]=1;
              tdone[16]=1;
            }
            break;
          
          case 5 : 
            S5080=5;
            S5080=6;
            __start_thread_16 = com.systemj.Timer.getMs();//sysj/Exercise6.sysj line: 156, column: 5
            if(com.systemj.Timer.getMs() - __start_thread_16 >= (15) * 1000){//sysj/Exercise6.sysj line: 156, column: 5
              ends[16]=2;
              ;//sysj/Exercise6.sysj line: 156, column: 5
              LocationMap.setLocationForID("11111", "1");//sysj/Exercise6.sysj line: 167, column: 6
              S5080=7;
              active[16]=1;
              ends[16]=1;
              tdone[16]=1;
            }
            else {
              active[16]=1;
              ends[16]=1;
              tdone[16]=1;
            }
            break;
          
          case 6 : 
            if(com.systemj.Timer.getMs() - __start_thread_16 >= (15) * 1000){//sysj/Exercise6.sysj line: 156, column: 5
              ends[16]=2;
              ;//sysj/Exercise6.sysj line: 156, column: 5
              LocationMap.setLocationForID("11111", "1");//sysj/Exercise6.sysj line: 167, column: 6
              S5080=7;
              active[16]=1;
              ends[16]=1;
              tdone[16]=1;
            }
            else {
              active[16]=1;
              ends[16]=1;
              tdone[16]=1;
            }
            break;
          
          case 7 : 
            S5080=7;
            S5080=0;
            __start_thread_16 = com.systemj.Timer.getMs();//sysj/Exercise6.sysj line: 156, column: 5
            if(com.systemj.Timer.getMs() - __start_thread_16 >= (15) * 1000){//sysj/Exercise6.sysj line: 156, column: 5
              ends[16]=2;
              ;//sysj/Exercise6.sysj line: 156, column: 5
              LocationMap.setLocationForID("11111", "2");//sysj/Exercise6.sysj line: 158, column: 6
              S5080=1;
              active[16]=1;
              ends[16]=1;
              tdone[16]=1;
            }
            else {
              active[16]=1;
              ends[16]=1;
              tdone[16]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread10250(int [] tdone, int [] ends){
        switch(S5065){
      case 0 : 
        active[15]=0;
        ends[15]=0;
        tdone[15]=1;
        break;
      
      case 1 : 
        switch(S4753){
          case 0 : 
            switch(S4737){
              case 0 : 
                if(!reqAuthCheck_in.isPartnerPresent() || reqAuthCheck_in.isPartnerPreempted()){//sysj/Exercise6.sysj line: 146, column: 6
                  reqAuthCheck_in.setACK(false);//sysj/Exercise6.sysj line: 146, column: 6
                  S4737=1;
                  active[15]=1;
                  ends[15]=1;
                  tdone[15]=1;
                }
                else {
                  switch(S4732){
                    case 0 : 
                      if(!reqAuthCheck_in.isREQ()){//sysj/Exercise6.sysj line: 146, column: 6
                        reqAuthCheck_in.setACK(true);//sysj/Exercise6.sysj line: 146, column: 6
                        S4732=1;
                        if(reqAuthCheck_in.isREQ()){//sysj/Exercise6.sysj line: 146, column: 6
                          reqAuthCheck_in.setACK(false);//sysj/Exercise6.sysj line: 146, column: 6
                          ends[15]=2;
                          ;//sysj/Exercise6.sysj line: 146, column: 6
                          idQuery_thread_15 = (String)(reqAuthCheck_in.getVal() == null ? null : ((String)reqAuthCheck_in.getVal()));//sysj/Exercise6.sysj line: 147, column: 6
                          result_thread_15 = LocationMap.authIDCheck(idQuery_thread_15);//sysj/Exercise6.sysj line: 148, column: 6
                          S4753=1;
                          S4760=0;
                          if(!idAuthResponse_o.isPartnerPresent() || idAuthResponse_o.isPartnerPreempted()){//sysj/Exercise6.sysj line: 149, column: 6
                            idAuthResponse_o.setREQ(false);//sysj/Exercise6.sysj line: 149, column: 6
                            S4760=1;
                            active[15]=1;
                            ends[15]=1;
                            tdone[15]=1;
                          }
                          else {
                            S4755=0;
                            if(idAuthResponse_o.isACK()){//sysj/Exercise6.sysj line: 149, column: 6
                              idAuthResponse_o.setVal(result_thread_15);//sysj/Exercise6.sysj line: 149, column: 6
                              S4755=1;
                              if(!idAuthResponse_o.isACK()){//sysj/Exercise6.sysj line: 149, column: 6
                                idAuthResponse_o.setREQ(false);//sysj/Exercise6.sysj line: 149, column: 6
                                ends[15]=2;
                                ;//sysj/Exercise6.sysj line: 149, column: 6
                                S4753=2;
                                active[15]=1;
                                ends[15]=1;
                                tdone[15]=1;
                              }
                              else {
                                active[15]=1;
                                ends[15]=1;
                                tdone[15]=1;
                              }
                            }
                            else {
                              active[15]=1;
                              ends[15]=1;
                              tdone[15]=1;
                            }
                          }
                        }
                        else {
                          active[15]=1;
                          ends[15]=1;
                          tdone[15]=1;
                        }
                      }
                      else {
                        active[15]=1;
                        ends[15]=1;
                        tdone[15]=1;
                      }
                      break;
                    
                    case 1 : 
                      if(reqAuthCheck_in.isREQ()){//sysj/Exercise6.sysj line: 146, column: 6
                        reqAuthCheck_in.setACK(false);//sysj/Exercise6.sysj line: 146, column: 6
                        ends[15]=2;
                        ;//sysj/Exercise6.sysj line: 146, column: 6
                        idQuery_thread_15 = (String)(reqAuthCheck_in.getVal() == null ? null : ((String)reqAuthCheck_in.getVal()));//sysj/Exercise6.sysj line: 147, column: 6
                        result_thread_15 = LocationMap.authIDCheck(idQuery_thread_15);//sysj/Exercise6.sysj line: 148, column: 6
                        S4753=1;
                        S4760=0;
                        if(!idAuthResponse_o.isPartnerPresent() || idAuthResponse_o.isPartnerPreempted()){//sysj/Exercise6.sysj line: 149, column: 6
                          idAuthResponse_o.setREQ(false);//sysj/Exercise6.sysj line: 149, column: 6
                          S4760=1;
                          active[15]=1;
                          ends[15]=1;
                          tdone[15]=1;
                        }
                        else {
                          S4755=0;
                          if(idAuthResponse_o.isACK()){//sysj/Exercise6.sysj line: 149, column: 6
                            idAuthResponse_o.setVal(result_thread_15);//sysj/Exercise6.sysj line: 149, column: 6
                            S4755=1;
                            if(!idAuthResponse_o.isACK()){//sysj/Exercise6.sysj line: 149, column: 6
                              idAuthResponse_o.setREQ(false);//sysj/Exercise6.sysj line: 149, column: 6
                              ends[15]=2;
                              ;//sysj/Exercise6.sysj line: 149, column: 6
                              S4753=2;
                              active[15]=1;
                              ends[15]=1;
                              tdone[15]=1;
                            }
                            else {
                              active[15]=1;
                              ends[15]=1;
                              tdone[15]=1;
                            }
                          }
                          else {
                            active[15]=1;
                            ends[15]=1;
                            tdone[15]=1;
                          }
                        }
                      }
                      else {
                        active[15]=1;
                        ends[15]=1;
                        tdone[15]=1;
                      }
                      break;
                    
                  }
                }
                break;
              
              case 1 : 
                S4737=1;
                S4737=0;
                if(!reqAuthCheck_in.isPartnerPresent() || reqAuthCheck_in.isPartnerPreempted()){//sysj/Exercise6.sysj line: 146, column: 6
                  reqAuthCheck_in.setACK(false);//sysj/Exercise6.sysj line: 146, column: 6
                  S4737=1;
                  active[15]=1;
                  ends[15]=1;
                  tdone[15]=1;
                }
                else {
                  S4732=0;
                  if(!reqAuthCheck_in.isREQ()){//sysj/Exercise6.sysj line: 146, column: 6
                    reqAuthCheck_in.setACK(true);//sysj/Exercise6.sysj line: 146, column: 6
                    S4732=1;
                    if(reqAuthCheck_in.isREQ()){//sysj/Exercise6.sysj line: 146, column: 6
                      reqAuthCheck_in.setACK(false);//sysj/Exercise6.sysj line: 146, column: 6
                      ends[15]=2;
                      ;//sysj/Exercise6.sysj line: 146, column: 6
                      idQuery_thread_15 = (String)(reqAuthCheck_in.getVal() == null ? null : ((String)reqAuthCheck_in.getVal()));//sysj/Exercise6.sysj line: 147, column: 6
                      result_thread_15 = LocationMap.authIDCheck(idQuery_thread_15);//sysj/Exercise6.sysj line: 148, column: 6
                      S4753=1;
                      S4760=0;
                      if(!idAuthResponse_o.isPartnerPresent() || idAuthResponse_o.isPartnerPreempted()){//sysj/Exercise6.sysj line: 149, column: 6
                        idAuthResponse_o.setREQ(false);//sysj/Exercise6.sysj line: 149, column: 6
                        S4760=1;
                        active[15]=1;
                        ends[15]=1;
                        tdone[15]=1;
                      }
                      else {
                        S4755=0;
                        if(idAuthResponse_o.isACK()){//sysj/Exercise6.sysj line: 149, column: 6
                          idAuthResponse_o.setVal(result_thread_15);//sysj/Exercise6.sysj line: 149, column: 6
                          S4755=1;
                          if(!idAuthResponse_o.isACK()){//sysj/Exercise6.sysj line: 149, column: 6
                            idAuthResponse_o.setREQ(false);//sysj/Exercise6.sysj line: 149, column: 6
                            ends[15]=2;
                            ;//sysj/Exercise6.sysj line: 149, column: 6
                            S4753=2;
                            active[15]=1;
                            ends[15]=1;
                            tdone[15]=1;
                          }
                          else {
                            active[15]=1;
                            ends[15]=1;
                            tdone[15]=1;
                          }
                        }
                        else {
                          active[15]=1;
                          ends[15]=1;
                          tdone[15]=1;
                        }
                      }
                    }
                    else {
                      active[15]=1;
                      ends[15]=1;
                      tdone[15]=1;
                    }
                  }
                  else {
                    active[15]=1;
                    ends[15]=1;
                    tdone[15]=1;
                  }
                }
                break;
              
            }
            break;
          
          case 1 : 
            switch(S4760){
              case 0 : 
                if(!idAuthResponse_o.isPartnerPresent() || idAuthResponse_o.isPartnerPreempted()){//sysj/Exercise6.sysj line: 149, column: 6
                  idAuthResponse_o.setREQ(false);//sysj/Exercise6.sysj line: 149, column: 6
                  S4760=1;
                  active[15]=1;
                  ends[15]=1;
                  tdone[15]=1;
                }
                else {
                  switch(S4755){
                    case 0 : 
                      if(idAuthResponse_o.isACK()){//sysj/Exercise6.sysj line: 149, column: 6
                        idAuthResponse_o.setVal(result_thread_15);//sysj/Exercise6.sysj line: 149, column: 6
                        S4755=1;
                        if(!idAuthResponse_o.isACK()){//sysj/Exercise6.sysj line: 149, column: 6
                          idAuthResponse_o.setREQ(false);//sysj/Exercise6.sysj line: 149, column: 6
                          ends[15]=2;
                          ;//sysj/Exercise6.sysj line: 149, column: 6
                          S4753=2;
                          active[15]=1;
                          ends[15]=1;
                          tdone[15]=1;
                        }
                        else {
                          active[15]=1;
                          ends[15]=1;
                          tdone[15]=1;
                        }
                      }
                      else {
                        active[15]=1;
                        ends[15]=1;
                        tdone[15]=1;
                      }
                      break;
                    
                    case 1 : 
                      if(!idAuthResponse_o.isACK()){//sysj/Exercise6.sysj line: 149, column: 6
                        idAuthResponse_o.setREQ(false);//sysj/Exercise6.sysj line: 149, column: 6
                        ends[15]=2;
                        ;//sysj/Exercise6.sysj line: 149, column: 6
                        S4753=2;
                        active[15]=1;
                        ends[15]=1;
                        tdone[15]=1;
                      }
                      else {
                        active[15]=1;
                        ends[15]=1;
                        tdone[15]=1;
                      }
                      break;
                    
                  }
                }
                break;
              
              case 1 : 
                S4760=1;
                S4760=0;
                if(!idAuthResponse_o.isPartnerPresent() || idAuthResponse_o.isPartnerPreempted()){//sysj/Exercise6.sysj line: 149, column: 6
                  idAuthResponse_o.setREQ(false);//sysj/Exercise6.sysj line: 149, column: 6
                  S4760=1;
                  active[15]=1;
                  ends[15]=1;
                  tdone[15]=1;
                }
                else {
                  S4755=0;
                  if(idAuthResponse_o.isACK()){//sysj/Exercise6.sysj line: 149, column: 6
                    idAuthResponse_o.setVal(result_thread_15);//sysj/Exercise6.sysj line: 149, column: 6
                    S4755=1;
                    if(!idAuthResponse_o.isACK()){//sysj/Exercise6.sysj line: 149, column: 6
                      idAuthResponse_o.setREQ(false);//sysj/Exercise6.sysj line: 149, column: 6
                      ends[15]=2;
                      ;//sysj/Exercise6.sysj line: 149, column: 6
                      S4753=2;
                      active[15]=1;
                      ends[15]=1;
                      tdone[15]=1;
                    }
                    else {
                      active[15]=1;
                      ends[15]=1;
                      tdone[15]=1;
                    }
                  }
                  else {
                    active[15]=1;
                    ends[15]=1;
                    tdone[15]=1;
                  }
                }
                break;
              
            }
            break;
          
          case 2 : 
            S4753=2;
            S4753=0;
            S4737=0;
            if(!reqAuthCheck_in.isPartnerPresent() || reqAuthCheck_in.isPartnerPreempted()){//sysj/Exercise6.sysj line: 146, column: 6
              reqAuthCheck_in.setACK(false);//sysj/Exercise6.sysj line: 146, column: 6
              S4737=1;
              active[15]=1;
              ends[15]=1;
              tdone[15]=1;
            }
            else {
              S4732=0;
              if(!reqAuthCheck_in.isREQ()){//sysj/Exercise6.sysj line: 146, column: 6
                reqAuthCheck_in.setACK(true);//sysj/Exercise6.sysj line: 146, column: 6
                S4732=1;
                if(reqAuthCheck_in.isREQ()){//sysj/Exercise6.sysj line: 146, column: 6
                  reqAuthCheck_in.setACK(false);//sysj/Exercise6.sysj line: 146, column: 6
                  ends[15]=2;
                  ;//sysj/Exercise6.sysj line: 146, column: 6
                  idQuery_thread_15 = (String)(reqAuthCheck_in.getVal() == null ? null : ((String)reqAuthCheck_in.getVal()));//sysj/Exercise6.sysj line: 147, column: 6
                  result_thread_15 = LocationMap.authIDCheck(idQuery_thread_15);//sysj/Exercise6.sysj line: 148, column: 6
                  S4753=1;
                  S4760=0;
                  if(!idAuthResponse_o.isPartnerPresent() || idAuthResponse_o.isPartnerPreempted()){//sysj/Exercise6.sysj line: 149, column: 6
                    idAuthResponse_o.setREQ(false);//sysj/Exercise6.sysj line: 149, column: 6
                    S4760=1;
                    active[15]=1;
                    ends[15]=1;
                    tdone[15]=1;
                  }
                  else {
                    S4755=0;
                    if(idAuthResponse_o.isACK()){//sysj/Exercise6.sysj line: 149, column: 6
                      idAuthResponse_o.setVal(result_thread_15);//sysj/Exercise6.sysj line: 149, column: 6
                      S4755=1;
                      if(!idAuthResponse_o.isACK()){//sysj/Exercise6.sysj line: 149, column: 6
                        idAuthResponse_o.setREQ(false);//sysj/Exercise6.sysj line: 149, column: 6
                        ends[15]=2;
                        ;//sysj/Exercise6.sysj line: 149, column: 6
                        S4753=2;
                        active[15]=1;
                        ends[15]=1;
                        tdone[15]=1;
                      }
                      else {
                        active[15]=1;
                        ends[15]=1;
                        tdone[15]=1;
                      }
                    }
                    else {
                      active[15]=1;
                      ends[15]=1;
                      tdone[15]=1;
                    }
                  }
                }
                else {
                  active[15]=1;
                  ends[15]=1;
                  tdone[15]=1;
                }
              }
              else {
                active[15]=1;
                ends[15]=1;
                tdone[15]=1;
              }
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread10249(int [] tdone, int [] ends){
        switch(S4730){
      case 0 : 
        active[14]=0;
        ends[14]=0;
        tdone[14]=1;
        break;
      
      case 1 : 
        switch(S4418){
          case 0 : 
            switch(S4402){
              case 0 : 
                if(!reqIDLoc_in.isPartnerPresent() || reqIDLoc_in.isPartnerPreempted()){//sysj/Exercise6.sysj line: 135, column: 6
                  reqIDLoc_in.setACK(false);//sysj/Exercise6.sysj line: 135, column: 6
                  S4402=1;
                  active[14]=1;
                  ends[14]=1;
                  tdone[14]=1;
                }
                else {
                  switch(S4397){
                    case 0 : 
                      if(!reqIDLoc_in.isREQ()){//sysj/Exercise6.sysj line: 135, column: 6
                        reqIDLoc_in.setACK(true);//sysj/Exercise6.sysj line: 135, column: 6
                        S4397=1;
                        if(reqIDLoc_in.isREQ()){//sysj/Exercise6.sysj line: 135, column: 6
                          reqIDLoc_in.setACK(false);//sysj/Exercise6.sysj line: 135, column: 6
                          ends[14]=2;
                          ;//sysj/Exercise6.sysj line: 135, column: 6
                          idQuery_thread_14 = (reqIDLoc_in.getVal() == null ? null : ((String)reqIDLoc_in.getVal()));//sysj/Exercise6.sysj line: 136, column: 6
                          result_thread_14 = LocationMap.getLocationFromID(idQuery_thread_14);//sysj/Exercise6.sysj line: 138, column: 6
                          S4418=1;
                          S4425=0;
                          if(!idLocation_o.isPartnerPresent() || idLocation_o.isPartnerPreempted()){//sysj/Exercise6.sysj line: 139, column: 6
                            idLocation_o.setREQ(false);//sysj/Exercise6.sysj line: 139, column: 6
                            S4425=1;
                            active[14]=1;
                            ends[14]=1;
                            tdone[14]=1;
                          }
                          else {
                            S4420=0;
                            if(idLocation_o.isACK()){//sysj/Exercise6.sysj line: 139, column: 6
                              idLocation_o.setVal(result_thread_14);//sysj/Exercise6.sysj line: 139, column: 6
                              S4420=1;
                              if(!idLocation_o.isACK()){//sysj/Exercise6.sysj line: 139, column: 6
                                idLocation_o.setREQ(false);//sysj/Exercise6.sysj line: 139, column: 6
                                ends[14]=2;
                                ;//sysj/Exercise6.sysj line: 139, column: 6
                                S4418=2;
                                active[14]=1;
                                ends[14]=1;
                                tdone[14]=1;
                              }
                              else {
                                active[14]=1;
                                ends[14]=1;
                                tdone[14]=1;
                              }
                            }
                            else {
                              active[14]=1;
                              ends[14]=1;
                              tdone[14]=1;
                            }
                          }
                        }
                        else {
                          active[14]=1;
                          ends[14]=1;
                          tdone[14]=1;
                        }
                      }
                      else {
                        active[14]=1;
                        ends[14]=1;
                        tdone[14]=1;
                      }
                      break;
                    
                    case 1 : 
                      if(reqIDLoc_in.isREQ()){//sysj/Exercise6.sysj line: 135, column: 6
                        reqIDLoc_in.setACK(false);//sysj/Exercise6.sysj line: 135, column: 6
                        ends[14]=2;
                        ;//sysj/Exercise6.sysj line: 135, column: 6
                        idQuery_thread_14 = (reqIDLoc_in.getVal() == null ? null : ((String)reqIDLoc_in.getVal()));//sysj/Exercise6.sysj line: 136, column: 6
                        result_thread_14 = LocationMap.getLocationFromID(idQuery_thread_14);//sysj/Exercise6.sysj line: 138, column: 6
                        S4418=1;
                        S4425=0;
                        if(!idLocation_o.isPartnerPresent() || idLocation_o.isPartnerPreempted()){//sysj/Exercise6.sysj line: 139, column: 6
                          idLocation_o.setREQ(false);//sysj/Exercise6.sysj line: 139, column: 6
                          S4425=1;
                          active[14]=1;
                          ends[14]=1;
                          tdone[14]=1;
                        }
                        else {
                          S4420=0;
                          if(idLocation_o.isACK()){//sysj/Exercise6.sysj line: 139, column: 6
                            idLocation_o.setVal(result_thread_14);//sysj/Exercise6.sysj line: 139, column: 6
                            S4420=1;
                            if(!idLocation_o.isACK()){//sysj/Exercise6.sysj line: 139, column: 6
                              idLocation_o.setREQ(false);//sysj/Exercise6.sysj line: 139, column: 6
                              ends[14]=2;
                              ;//sysj/Exercise6.sysj line: 139, column: 6
                              S4418=2;
                              active[14]=1;
                              ends[14]=1;
                              tdone[14]=1;
                            }
                            else {
                              active[14]=1;
                              ends[14]=1;
                              tdone[14]=1;
                            }
                          }
                          else {
                            active[14]=1;
                            ends[14]=1;
                            tdone[14]=1;
                          }
                        }
                      }
                      else {
                        active[14]=1;
                        ends[14]=1;
                        tdone[14]=1;
                      }
                      break;
                    
                  }
                }
                break;
              
              case 1 : 
                S4402=1;
                S4402=0;
                if(!reqIDLoc_in.isPartnerPresent() || reqIDLoc_in.isPartnerPreempted()){//sysj/Exercise6.sysj line: 135, column: 6
                  reqIDLoc_in.setACK(false);//sysj/Exercise6.sysj line: 135, column: 6
                  S4402=1;
                  active[14]=1;
                  ends[14]=1;
                  tdone[14]=1;
                }
                else {
                  S4397=0;
                  if(!reqIDLoc_in.isREQ()){//sysj/Exercise6.sysj line: 135, column: 6
                    reqIDLoc_in.setACK(true);//sysj/Exercise6.sysj line: 135, column: 6
                    S4397=1;
                    if(reqIDLoc_in.isREQ()){//sysj/Exercise6.sysj line: 135, column: 6
                      reqIDLoc_in.setACK(false);//sysj/Exercise6.sysj line: 135, column: 6
                      ends[14]=2;
                      ;//sysj/Exercise6.sysj line: 135, column: 6
                      idQuery_thread_14 = (reqIDLoc_in.getVal() == null ? null : ((String)reqIDLoc_in.getVal()));//sysj/Exercise6.sysj line: 136, column: 6
                      result_thread_14 = LocationMap.getLocationFromID(idQuery_thread_14);//sysj/Exercise6.sysj line: 138, column: 6
                      S4418=1;
                      S4425=0;
                      if(!idLocation_o.isPartnerPresent() || idLocation_o.isPartnerPreempted()){//sysj/Exercise6.sysj line: 139, column: 6
                        idLocation_o.setREQ(false);//sysj/Exercise6.sysj line: 139, column: 6
                        S4425=1;
                        active[14]=1;
                        ends[14]=1;
                        tdone[14]=1;
                      }
                      else {
                        S4420=0;
                        if(idLocation_o.isACK()){//sysj/Exercise6.sysj line: 139, column: 6
                          idLocation_o.setVal(result_thread_14);//sysj/Exercise6.sysj line: 139, column: 6
                          S4420=1;
                          if(!idLocation_o.isACK()){//sysj/Exercise6.sysj line: 139, column: 6
                            idLocation_o.setREQ(false);//sysj/Exercise6.sysj line: 139, column: 6
                            ends[14]=2;
                            ;//sysj/Exercise6.sysj line: 139, column: 6
                            S4418=2;
                            active[14]=1;
                            ends[14]=1;
                            tdone[14]=1;
                          }
                          else {
                            active[14]=1;
                            ends[14]=1;
                            tdone[14]=1;
                          }
                        }
                        else {
                          active[14]=1;
                          ends[14]=1;
                          tdone[14]=1;
                        }
                      }
                    }
                    else {
                      active[14]=1;
                      ends[14]=1;
                      tdone[14]=1;
                    }
                  }
                  else {
                    active[14]=1;
                    ends[14]=1;
                    tdone[14]=1;
                  }
                }
                break;
              
            }
            break;
          
          case 1 : 
            switch(S4425){
              case 0 : 
                if(!idLocation_o.isPartnerPresent() || idLocation_o.isPartnerPreempted()){//sysj/Exercise6.sysj line: 139, column: 6
                  idLocation_o.setREQ(false);//sysj/Exercise6.sysj line: 139, column: 6
                  S4425=1;
                  active[14]=1;
                  ends[14]=1;
                  tdone[14]=1;
                }
                else {
                  switch(S4420){
                    case 0 : 
                      if(idLocation_o.isACK()){//sysj/Exercise6.sysj line: 139, column: 6
                        idLocation_o.setVal(result_thread_14);//sysj/Exercise6.sysj line: 139, column: 6
                        S4420=1;
                        if(!idLocation_o.isACK()){//sysj/Exercise6.sysj line: 139, column: 6
                          idLocation_o.setREQ(false);//sysj/Exercise6.sysj line: 139, column: 6
                          ends[14]=2;
                          ;//sysj/Exercise6.sysj line: 139, column: 6
                          S4418=2;
                          active[14]=1;
                          ends[14]=1;
                          tdone[14]=1;
                        }
                        else {
                          active[14]=1;
                          ends[14]=1;
                          tdone[14]=1;
                        }
                      }
                      else {
                        active[14]=1;
                        ends[14]=1;
                        tdone[14]=1;
                      }
                      break;
                    
                    case 1 : 
                      if(!idLocation_o.isACK()){//sysj/Exercise6.sysj line: 139, column: 6
                        idLocation_o.setREQ(false);//sysj/Exercise6.sysj line: 139, column: 6
                        ends[14]=2;
                        ;//sysj/Exercise6.sysj line: 139, column: 6
                        S4418=2;
                        active[14]=1;
                        ends[14]=1;
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
                break;
              
              case 1 : 
                S4425=1;
                S4425=0;
                if(!idLocation_o.isPartnerPresent() || idLocation_o.isPartnerPreempted()){//sysj/Exercise6.sysj line: 139, column: 6
                  idLocation_o.setREQ(false);//sysj/Exercise6.sysj line: 139, column: 6
                  S4425=1;
                  active[14]=1;
                  ends[14]=1;
                  tdone[14]=1;
                }
                else {
                  S4420=0;
                  if(idLocation_o.isACK()){//sysj/Exercise6.sysj line: 139, column: 6
                    idLocation_o.setVal(result_thread_14);//sysj/Exercise6.sysj line: 139, column: 6
                    S4420=1;
                    if(!idLocation_o.isACK()){//sysj/Exercise6.sysj line: 139, column: 6
                      idLocation_o.setREQ(false);//sysj/Exercise6.sysj line: 139, column: 6
                      ends[14]=2;
                      ;//sysj/Exercise6.sysj line: 139, column: 6
                      S4418=2;
                      active[14]=1;
                      ends[14]=1;
                      tdone[14]=1;
                    }
                    else {
                      active[14]=1;
                      ends[14]=1;
                      tdone[14]=1;
                    }
                  }
                  else {
                    active[14]=1;
                    ends[14]=1;
                    tdone[14]=1;
                  }
                }
                break;
              
            }
            break;
          
          case 2 : 
            S4418=2;
            S4418=0;
            S4402=0;
            if(!reqIDLoc_in.isPartnerPresent() || reqIDLoc_in.isPartnerPreempted()){//sysj/Exercise6.sysj line: 135, column: 6
              reqIDLoc_in.setACK(false);//sysj/Exercise6.sysj line: 135, column: 6
              S4402=1;
              active[14]=1;
              ends[14]=1;
              tdone[14]=1;
            }
            else {
              S4397=0;
              if(!reqIDLoc_in.isREQ()){//sysj/Exercise6.sysj line: 135, column: 6
                reqIDLoc_in.setACK(true);//sysj/Exercise6.sysj line: 135, column: 6
                S4397=1;
                if(reqIDLoc_in.isREQ()){//sysj/Exercise6.sysj line: 135, column: 6
                  reqIDLoc_in.setACK(false);//sysj/Exercise6.sysj line: 135, column: 6
                  ends[14]=2;
                  ;//sysj/Exercise6.sysj line: 135, column: 6
                  idQuery_thread_14 = (reqIDLoc_in.getVal() == null ? null : ((String)reqIDLoc_in.getVal()));//sysj/Exercise6.sysj line: 136, column: 6
                  result_thread_14 = LocationMap.getLocationFromID(idQuery_thread_14);//sysj/Exercise6.sysj line: 138, column: 6
                  S4418=1;
                  S4425=0;
                  if(!idLocation_o.isPartnerPresent() || idLocation_o.isPartnerPreempted()){//sysj/Exercise6.sysj line: 139, column: 6
                    idLocation_o.setREQ(false);//sysj/Exercise6.sysj line: 139, column: 6
                    S4425=1;
                    active[14]=1;
                    ends[14]=1;
                    tdone[14]=1;
                  }
                  else {
                    S4420=0;
                    if(idLocation_o.isACK()){//sysj/Exercise6.sysj line: 139, column: 6
                      idLocation_o.setVal(result_thread_14);//sysj/Exercise6.sysj line: 139, column: 6
                      S4420=1;
                      if(!idLocation_o.isACK()){//sysj/Exercise6.sysj line: 139, column: 6
                        idLocation_o.setREQ(false);//sysj/Exercise6.sysj line: 139, column: 6
                        ends[14]=2;
                        ;//sysj/Exercise6.sysj line: 139, column: 6
                        S4418=2;
                        active[14]=1;
                        ends[14]=1;
                        tdone[14]=1;
                      }
                      else {
                        active[14]=1;
                        ends[14]=1;
                        tdone[14]=1;
                      }
                    }
                    else {
                      active[14]=1;
                      ends[14]=1;
                      tdone[14]=1;
                    }
                  }
                }
                else {
                  active[14]=1;
                  ends[14]=1;
                  tdone[14]=1;
                }
              }
              else {
                active[14]=1;
                ends[14]=1;
                tdone[14]=1;
              }
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread10247(int [] tdone, int [] ends){
        S5364=1;
    S5080=0;
    __start_thread_16 = com.systemj.Timer.getMs();//sysj/Exercise6.sysj line: 156, column: 5
    if(com.systemj.Timer.getMs() - __start_thread_16 >= (15) * 1000){//sysj/Exercise6.sysj line: 156, column: 5
      ends[16]=2;
      ;//sysj/Exercise6.sysj line: 156, column: 5
      LocationMap.setLocationForID("11111", "2");//sysj/Exercise6.sysj line: 158, column: 6
      S5080=1;
      active[16]=1;
      ends[16]=1;
      tdone[16]=1;
    }
    else {
      active[16]=1;
      ends[16]=1;
      tdone[16]=1;
    }
  }

  public void thread10246(int [] tdone, int [] ends){
        S5065=1;
    S4753=0;
    S4737=0;
    if(!reqAuthCheck_in.isPartnerPresent() || reqAuthCheck_in.isPartnerPreempted()){//sysj/Exercise6.sysj line: 146, column: 6
      reqAuthCheck_in.setACK(false);//sysj/Exercise6.sysj line: 146, column: 6
      S4737=1;
      active[15]=1;
      ends[15]=1;
      tdone[15]=1;
    }
    else {
      S4732=0;
      if(!reqAuthCheck_in.isREQ()){//sysj/Exercise6.sysj line: 146, column: 6
        reqAuthCheck_in.setACK(true);//sysj/Exercise6.sysj line: 146, column: 6
        S4732=1;
        if(reqAuthCheck_in.isREQ()){//sysj/Exercise6.sysj line: 146, column: 6
          reqAuthCheck_in.setACK(false);//sysj/Exercise6.sysj line: 146, column: 6
          ends[15]=2;
          ;//sysj/Exercise6.sysj line: 146, column: 6
          idQuery_thread_15 = (String)(reqAuthCheck_in.getVal() == null ? null : ((String)reqAuthCheck_in.getVal()));//sysj/Exercise6.sysj line: 147, column: 6
          result_thread_15 = LocationMap.authIDCheck(idQuery_thread_15);//sysj/Exercise6.sysj line: 148, column: 6
          S4753=1;
          S4760=0;
          if(!idAuthResponse_o.isPartnerPresent() || idAuthResponse_o.isPartnerPreempted()){//sysj/Exercise6.sysj line: 149, column: 6
            idAuthResponse_o.setREQ(false);//sysj/Exercise6.sysj line: 149, column: 6
            S4760=1;
            active[15]=1;
            ends[15]=1;
            tdone[15]=1;
          }
          else {
            S4755=0;
            if(idAuthResponse_o.isACK()){//sysj/Exercise6.sysj line: 149, column: 6
              idAuthResponse_o.setVal(result_thread_15);//sysj/Exercise6.sysj line: 149, column: 6
              S4755=1;
              if(!idAuthResponse_o.isACK()){//sysj/Exercise6.sysj line: 149, column: 6
                idAuthResponse_o.setREQ(false);//sysj/Exercise6.sysj line: 149, column: 6
                ends[15]=2;
                ;//sysj/Exercise6.sysj line: 149, column: 6
                S4753=2;
                active[15]=1;
                ends[15]=1;
                tdone[15]=1;
              }
              else {
                active[15]=1;
                ends[15]=1;
                tdone[15]=1;
              }
            }
            else {
              active[15]=1;
              ends[15]=1;
              tdone[15]=1;
            }
          }
        }
        else {
          active[15]=1;
          ends[15]=1;
          tdone[15]=1;
        }
      }
      else {
        active[15]=1;
        ends[15]=1;
        tdone[15]=1;
      }
    }
  }

  public void thread10245(int [] tdone, int [] ends){
        S4730=1;
    S4418=0;
    S4402=0;
    if(!reqIDLoc_in.isPartnerPresent() || reqIDLoc_in.isPartnerPreempted()){//sysj/Exercise6.sysj line: 135, column: 6
      reqIDLoc_in.setACK(false);//sysj/Exercise6.sysj line: 135, column: 6
      S4402=1;
      active[14]=1;
      ends[14]=1;
      tdone[14]=1;
    }
    else {
      S4397=0;
      if(!reqIDLoc_in.isREQ()){//sysj/Exercise6.sysj line: 135, column: 6
        reqIDLoc_in.setACK(true);//sysj/Exercise6.sysj line: 135, column: 6
        S4397=1;
        if(reqIDLoc_in.isREQ()){//sysj/Exercise6.sysj line: 135, column: 6
          reqIDLoc_in.setACK(false);//sysj/Exercise6.sysj line: 135, column: 6
          ends[14]=2;
          ;//sysj/Exercise6.sysj line: 135, column: 6
          idQuery_thread_14 = (reqIDLoc_in.getVal() == null ? null : ((String)reqIDLoc_in.getVal()));//sysj/Exercise6.sysj line: 136, column: 6
          result_thread_14 = LocationMap.getLocationFromID(idQuery_thread_14);//sysj/Exercise6.sysj line: 138, column: 6
          S4418=1;
          S4425=0;
          if(!idLocation_o.isPartnerPresent() || idLocation_o.isPartnerPreempted()){//sysj/Exercise6.sysj line: 139, column: 6
            idLocation_o.setREQ(false);//sysj/Exercise6.sysj line: 139, column: 6
            S4425=1;
            active[14]=1;
            ends[14]=1;
            tdone[14]=1;
          }
          else {
            S4420=0;
            if(idLocation_o.isACK()){//sysj/Exercise6.sysj line: 139, column: 6
              idLocation_o.setVal(result_thread_14);//sysj/Exercise6.sysj line: 139, column: 6
              S4420=1;
              if(!idLocation_o.isACK()){//sysj/Exercise6.sysj line: 139, column: 6
                idLocation_o.setREQ(false);//sysj/Exercise6.sysj line: 139, column: 6
                ends[14]=2;
                ;//sysj/Exercise6.sysj line: 139, column: 6
                S4418=2;
                active[14]=1;
                ends[14]=1;
                tdone[14]=1;
              }
              else {
                active[14]=1;
                ends[14]=1;
                tdone[14]=1;
              }
            }
            else {
              active[14]=1;
              ends[14]=1;
              tdone[14]=1;
            }
          }
        }
        else {
          active[14]=1;
          ends[14]=1;
          tdone[14]=1;
        }
      }
      else {
        active[14]=1;
        ends[14]=1;
        tdone[14]=1;
      }
    }
  }

  public void runClockDomain(){
    for(int i=0;i<ends.length;i++){
      ends[i] = 0;
      tdone[i] = 0;
    }
    
    RUN: while(true){
      switch(S5366){
        case 0 : 
          S5366=0;
          break RUN;
        
        case 1 : 
          S5366=2;
          S5366=2;
          thread10245(tdone,ends);
          thread10246(tdone,ends);
          thread10247(tdone,ends);
          int biggest10248 = 0;
          if(ends[14]>=biggest10248){
            biggest10248=ends[14];
          }
          if(ends[15]>=biggest10248){
            biggest10248=ends[15];
          }
          if(ends[16]>=biggest10248){
            biggest10248=ends[16];
          }
          if(biggest10248 == 1){
            active[13]=1;
            ends[13]=1;
            break RUN;
          }
        
        case 2 : 
          thread10249(tdone,ends);
          thread10250(tdone,ends);
          thread10251(tdone,ends);
          int biggest10252 = 0;
          if(ends[14]>=biggest10252){
            biggest10252=ends[14];
          }
          if(ends[15]>=biggest10252){
            biggest10252=ends[15];
          }
          if(ends[16]>=biggest10252){
            biggest10252=ends[16];
          }
          if(biggest10252 == 1){
            active[13]=1;
            ends[13]=1;
            break RUN;
          }
          //FINXME code
          if(biggest10252 == 0){
            S5366=0;
            active[13]=0;
            ends[13]=0;
            S5366=0;
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
    while(active[13] != 0){
      int index = 13;
      if(paused[index]==1 || suspended[index]==1 || active[index] == 0){
        for(int h=1;h<paused.length;++h){
          paused[h]=0;
        }
      }
      if(paused[13]!=0 || suspended[13]!=0 || active[13]!=1);
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
      if(paused[13]!=0 || suspended[13]!=0 || active[13]!=1);
      else{
        reqIDLoc_in.gethook();
        reqAuthCheck_in.gethook();
        idLocation_o.gethook();
        idAuthResponse_o.gethook();
      }
      runFinisher();
      if(active[13] == 0){
      	this.terminated = true;
      }
      if(!threaded) break;
    }
  }
}
