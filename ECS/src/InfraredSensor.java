import java.util.*;
import com.systemj.ClockDomain;
import com.systemj.Signal;
import com.systemj.input_Channel;
import com.systemj.output_Channel;

public class InfraredSensor extends ClockDomain{
  public InfraredSensor(String name){super(name);}
  Vector currsigs = new Vector();
  private boolean df = false;
  private char [] active;
  private char [] paused;
  private char [] suspended;
  public output_Channel zone1P_o = new output_Channel();
  public output_Channel zone2P_o = new output_Channel();
  public output_Channel zone3P_o = new output_Channel();
  public output_Channel zone4P_o = new output_Channel();
  public output_Channel zone5P_o = new output_Channel();
  public output_Channel zone6P_o = new output_Channel();
  public output_Channel zone7P_o = new output_Channel();
  private long __start_thread_10;//sysj\controller.sysj line: 140, column: 5
  private long __start_thread_11;//sysj\controller.sysj line: 152, column: 5
  private int S2342 = 1;
  private int S1503 = 1;
  private int S689 = 1;
  private int S673 = 1;
  private int S668 = 1;
  private int S691 = 1;
  private int S724 = 1;
  private int S719 = 1;
  private int S2340 = 1;
  private int S1526 = 1;
  private int S1510 = 1;
  private int S1505 = 1;
  private int S1561 = 1;
  private int S1556 = 1;
  
  private int[] ends = new int[20];
  private int[] tdone = new int[20];
  
  public void thread3229(int [] tdone, int [] ends){
        switch(S2340){
      case 0 : 
        active[11]=0;
        ends[11]=0;
        tdone[11]=1;
        break;
      
      case 1 : 
        switch(S1526){
          case 0 : 
            switch(S1510){
              case 0 : 
                if(!zone3P_o.isPartnerPresent() || zone3P_o.isPartnerPreempted()){//sysj\controller.sysj line: 153, column: 5
                  zone3P_o.setREQ(false);//sysj\controller.sysj line: 153, column: 5
                  S1510=1;
                  active[11]=1;
                  ends[11]=1;
                  tdone[11]=1;
                }
                else {
                  switch(S1505){
                    case 0 : 
                      if(zone3P_o.isACK()){//sysj\controller.sysj line: 153, column: 5
                        zone3P_o.setVal(true);//sysj\controller.sysj line: 153, column: 5
                        S1505=1;
                        if(!zone3P_o.isACK()){//sysj\controller.sysj line: 153, column: 5
                          zone3P_o.setREQ(false);//sysj\controller.sysj line: 153, column: 5
                          ends[11]=2;
                          ;//sysj\controller.sysj line: 153, column: 5
                          S1526=1;
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
                      if(!zone3P_o.isACK()){//sysj\controller.sysj line: 153, column: 5
                        zone3P_o.setREQ(false);//sysj\controller.sysj line: 153, column: 5
                        ends[11]=2;
                        ;//sysj\controller.sysj line: 153, column: 5
                        S1526=1;
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
                S1510=1;
                S1510=0;
                if(!zone3P_o.isPartnerPresent() || zone3P_o.isPartnerPreempted()){//sysj\controller.sysj line: 153, column: 5
                  zone3P_o.setREQ(false);//sysj\controller.sysj line: 153, column: 5
                  S1510=1;
                  active[11]=1;
                  ends[11]=1;
                  tdone[11]=1;
                }
                else {
                  S1505=0;
                  if(zone3P_o.isACK()){//sysj\controller.sysj line: 153, column: 5
                    zone3P_o.setVal(true);//sysj\controller.sysj line: 153, column: 5
                    S1505=1;
                    if(!zone3P_o.isACK()){//sysj\controller.sysj line: 153, column: 5
                      zone3P_o.setREQ(false);//sysj\controller.sysj line: 153, column: 5
                      ends[11]=2;
                      ;//sysj\controller.sysj line: 153, column: 5
                      S1526=1;
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
            S1526=1;
            S1526=2;
            __start_thread_11 = com.systemj.Timer.getMs();//sysj\controller.sysj line: 152, column: 5
            if(com.systemj.Timer.getMs() - __start_thread_11 >= (5) * 1000){//sysj\controller.sysj line: 152, column: 5
              ends[11]=2;
              ;//sysj\controller.sysj line: 152, column: 5
              System.out.println("sent");//sysj\controller.sysj line: 156, column: 5
              S1526=3;
              S1561=0;
              if(!zone3P_o.isPartnerPresent() || zone3P_o.isPartnerPreempted()){//sysj\controller.sysj line: 158, column: 5
                zone3P_o.setREQ(false);//sysj\controller.sysj line: 158, column: 5
                S1561=1;
                active[11]=1;
                ends[11]=1;
                tdone[11]=1;
              }
              else {
                S1556=0;
                if(zone3P_o.isACK()){//sysj\controller.sysj line: 158, column: 5
                  zone3P_o.setVal(false);//sysj\controller.sysj line: 158, column: 5
                  S1556=1;
                  if(!zone3P_o.isACK()){//sysj\controller.sysj line: 158, column: 5
                    zone3P_o.setREQ(false);//sysj\controller.sysj line: 158, column: 5
                    ends[11]=2;
                    ;//sysj\controller.sysj line: 158, column: 5
                    S1526=4;
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
              active[11]=1;
              ends[11]=1;
              tdone[11]=1;
            }
            break;
          
          case 2 : 
            if(com.systemj.Timer.getMs() - __start_thread_11 >= (5) * 1000){//sysj\controller.sysj line: 152, column: 5
              ends[11]=2;
              ;//sysj\controller.sysj line: 152, column: 5
              System.out.println("sent");//sysj\controller.sysj line: 156, column: 5
              S1526=3;
              S1561=0;
              if(!zone3P_o.isPartnerPresent() || zone3P_o.isPartnerPreempted()){//sysj\controller.sysj line: 158, column: 5
                zone3P_o.setREQ(false);//sysj\controller.sysj line: 158, column: 5
                S1561=1;
                active[11]=1;
                ends[11]=1;
                tdone[11]=1;
              }
              else {
                S1556=0;
                if(zone3P_o.isACK()){//sysj\controller.sysj line: 158, column: 5
                  zone3P_o.setVal(false);//sysj\controller.sysj line: 158, column: 5
                  S1556=1;
                  if(!zone3P_o.isACK()){//sysj\controller.sysj line: 158, column: 5
                    zone3P_o.setREQ(false);//sysj\controller.sysj line: 158, column: 5
                    ends[11]=2;
                    ;//sysj\controller.sysj line: 158, column: 5
                    S1526=4;
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
              active[11]=1;
              ends[11]=1;
              tdone[11]=1;
            }
            break;
          
          case 3 : 
            switch(S1561){
              case 0 : 
                if(!zone3P_o.isPartnerPresent() || zone3P_o.isPartnerPreempted()){//sysj\controller.sysj line: 158, column: 5
                  zone3P_o.setREQ(false);//sysj\controller.sysj line: 158, column: 5
                  S1561=1;
                  active[11]=1;
                  ends[11]=1;
                  tdone[11]=1;
                }
                else {
                  switch(S1556){
                    case 0 : 
                      if(zone3P_o.isACK()){//sysj\controller.sysj line: 158, column: 5
                        zone3P_o.setVal(false);//sysj\controller.sysj line: 158, column: 5
                        S1556=1;
                        if(!zone3P_o.isACK()){//sysj\controller.sysj line: 158, column: 5
                          zone3P_o.setREQ(false);//sysj\controller.sysj line: 158, column: 5
                          ends[11]=2;
                          ;//sysj\controller.sysj line: 158, column: 5
                          S1526=4;
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
                      if(!zone3P_o.isACK()){//sysj\controller.sysj line: 158, column: 5
                        zone3P_o.setREQ(false);//sysj\controller.sysj line: 158, column: 5
                        ends[11]=2;
                        ;//sysj\controller.sysj line: 158, column: 5
                        S1526=4;
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
                S1561=1;
                S1561=0;
                if(!zone3P_o.isPartnerPresent() || zone3P_o.isPartnerPreempted()){//sysj\controller.sysj line: 158, column: 5
                  zone3P_o.setREQ(false);//sysj\controller.sysj line: 158, column: 5
                  S1561=1;
                  active[11]=1;
                  ends[11]=1;
                  tdone[11]=1;
                }
                else {
                  S1556=0;
                  if(zone3P_o.isACK()){//sysj\controller.sysj line: 158, column: 5
                    zone3P_o.setVal(false);//sysj\controller.sysj line: 158, column: 5
                    S1556=1;
                    if(!zone3P_o.isACK()){//sysj\controller.sysj line: 158, column: 5
                      zone3P_o.setREQ(false);//sysj\controller.sysj line: 158, column: 5
                      ends[11]=2;
                      ;//sysj\controller.sysj line: 158, column: 5
                      S1526=4;
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
          
          case 4 : 
            S1526=4;
            S1526=5;
            __start_thread_11 = com.systemj.Timer.getMs();//sysj\controller.sysj line: 152, column: 5
            if(com.systemj.Timer.getMs() - __start_thread_11 >= (5) * 1000){//sysj\controller.sysj line: 152, column: 5
              ends[11]=2;
              ;//sysj\controller.sysj line: 152, column: 5
              System.out.println("unsent");//sysj\controller.sysj line: 161, column: 5
              S1526=0;
              S1510=0;
              if(!zone3P_o.isPartnerPresent() || zone3P_o.isPartnerPreempted()){//sysj\controller.sysj line: 153, column: 5
                zone3P_o.setREQ(false);//sysj\controller.sysj line: 153, column: 5
                S1510=1;
                active[11]=1;
                ends[11]=1;
                tdone[11]=1;
              }
              else {
                S1505=0;
                if(zone3P_o.isACK()){//sysj\controller.sysj line: 153, column: 5
                  zone3P_o.setVal(true);//sysj\controller.sysj line: 153, column: 5
                  S1505=1;
                  if(!zone3P_o.isACK()){//sysj\controller.sysj line: 153, column: 5
                    zone3P_o.setREQ(false);//sysj\controller.sysj line: 153, column: 5
                    ends[11]=2;
                    ;//sysj\controller.sysj line: 153, column: 5
                    S1526=1;
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
              active[11]=1;
              ends[11]=1;
              tdone[11]=1;
            }
            break;
          
          case 5 : 
            if(com.systemj.Timer.getMs() - __start_thread_11 >= (5) * 1000){//sysj\controller.sysj line: 152, column: 5
              ends[11]=2;
              ;//sysj\controller.sysj line: 152, column: 5
              System.out.println("unsent");//sysj\controller.sysj line: 161, column: 5
              S1526=0;
              S1510=0;
              if(!zone3P_o.isPartnerPresent() || zone3P_o.isPartnerPreempted()){//sysj\controller.sysj line: 153, column: 5
                zone3P_o.setREQ(false);//sysj\controller.sysj line: 153, column: 5
                S1510=1;
                active[11]=1;
                ends[11]=1;
                tdone[11]=1;
              }
              else {
                S1505=0;
                if(zone3P_o.isACK()){//sysj\controller.sysj line: 153, column: 5
                  zone3P_o.setVal(true);//sysj\controller.sysj line: 153, column: 5
                  S1505=1;
                  if(!zone3P_o.isACK()){//sysj\controller.sysj line: 153, column: 5
                    zone3P_o.setREQ(false);//sysj\controller.sysj line: 153, column: 5
                    ends[11]=2;
                    ;//sysj\controller.sysj line: 153, column: 5
                    S1526=1;
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
              active[11]=1;
              ends[11]=1;
              tdone[11]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread3228(int [] tdone, int [] ends){
        switch(S1503){
      case 0 : 
        active[10]=0;
        ends[10]=0;
        tdone[10]=1;
        break;
      
      case 1 : 
        switch(S689){
          case 0 : 
            switch(S673){
              case 0 : 
                if(!zone1P_o.isPartnerPresent() || zone1P_o.isPartnerPreempted()){//sysj\controller.sysj line: 141, column: 5
                  zone1P_o.setREQ(false);//sysj\controller.sysj line: 141, column: 5
                  S673=1;
                  active[10]=1;
                  ends[10]=1;
                  tdone[10]=1;
                }
                else {
                  switch(S668){
                    case 0 : 
                      if(zone1P_o.isACK()){//sysj\controller.sysj line: 141, column: 5
                        zone1P_o.setVal(true);//sysj\controller.sysj line: 141, column: 5
                        S668=1;
                        if(!zone1P_o.isACK()){//sysj\controller.sysj line: 141, column: 5
                          zone1P_o.setREQ(false);//sysj\controller.sysj line: 141, column: 5
                          ends[10]=2;
                          ;//sysj\controller.sysj line: 141, column: 5
                          S689=1;
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
                      if(!zone1P_o.isACK()){//sysj\controller.sysj line: 141, column: 5
                        zone1P_o.setREQ(false);//sysj\controller.sysj line: 141, column: 5
                        ends[10]=2;
                        ;//sysj\controller.sysj line: 141, column: 5
                        S689=1;
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
                S673=1;
                S673=0;
                if(!zone1P_o.isPartnerPresent() || zone1P_o.isPartnerPreempted()){//sysj\controller.sysj line: 141, column: 5
                  zone1P_o.setREQ(false);//sysj\controller.sysj line: 141, column: 5
                  S673=1;
                  active[10]=1;
                  ends[10]=1;
                  tdone[10]=1;
                }
                else {
                  S668=0;
                  if(zone1P_o.isACK()){//sysj\controller.sysj line: 141, column: 5
                    zone1P_o.setVal(true);//sysj\controller.sysj line: 141, column: 5
                    S668=1;
                    if(!zone1P_o.isACK()){//sysj\controller.sysj line: 141, column: 5
                      zone1P_o.setREQ(false);//sysj\controller.sysj line: 141, column: 5
                      ends[10]=2;
                      ;//sysj\controller.sysj line: 141, column: 5
                      S689=1;
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
          
          case 1 : 
            S689=1;
            S689=2;
            __start_thread_10 = com.systemj.Timer.getMs();//sysj\controller.sysj line: 140, column: 5
            S691=0;
            if(com.systemj.Timer.getMs() - __start_thread_10 >= (2) * 1000){//sysj\controller.sysj line: 140, column: 5
              ends[10]=2;
              ;//sysj\controller.sysj line: 140, column: 5
              System.out.println("sent");//sysj\controller.sysj line: 144, column: 5
              S689=3;
              S724=0;
              if(!zone1P_o.isPartnerPresent() || zone1P_o.isPartnerPreempted()){//sysj\controller.sysj line: 146, column: 5
                zone1P_o.setREQ(false);//sysj\controller.sysj line: 146, column: 5
                S724=1;
                active[10]=1;
                ends[10]=1;
                tdone[10]=1;
              }
              else {
                S719=0;
                if(zone1P_o.isACK()){//sysj\controller.sysj line: 146, column: 5
                  zone1P_o.setVal(false);//sysj\controller.sysj line: 146, column: 5
                  S719=1;
                  if(!zone1P_o.isACK()){//sysj\controller.sysj line: 146, column: 5
                    zone1P_o.setREQ(false);//sysj\controller.sysj line: 146, column: 5
                    ends[10]=2;
                    ;//sysj\controller.sysj line: 146, column: 5
                    S689=4;
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
              S691=1;
              active[10]=1;
              ends[10]=1;
              tdone[10]=1;
            }
            break;
          
          case 2 : 
            switch(S691){
              case 0 : 
                S691=0;
                if(com.systemj.Timer.getMs() - __start_thread_10 >= (2) * 1000){//sysj\controller.sysj line: 140, column: 5
                  ends[10]=2;
                  ;//sysj\controller.sysj line: 140, column: 5
                  System.out.println("sent");//sysj\controller.sysj line: 144, column: 5
                  S689=3;
                  S724=0;
                  if(!zone1P_o.isPartnerPresent() || zone1P_o.isPartnerPreempted()){//sysj\controller.sysj line: 146, column: 5
                    zone1P_o.setREQ(false);//sysj\controller.sysj line: 146, column: 5
                    S724=1;
                    active[10]=1;
                    ends[10]=1;
                    tdone[10]=1;
                  }
                  else {
                    S719=0;
                    if(zone1P_o.isACK()){//sysj\controller.sysj line: 146, column: 5
                      zone1P_o.setVal(false);//sysj\controller.sysj line: 146, column: 5
                      S719=1;
                      if(!zone1P_o.isACK()){//sysj\controller.sysj line: 146, column: 5
                        zone1P_o.setREQ(false);//sysj\controller.sysj line: 146, column: 5
                        ends[10]=2;
                        ;//sysj\controller.sysj line: 146, column: 5
                        S689=4;
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
                  S691=1;
                  active[10]=1;
                  ends[10]=1;
                  tdone[10]=1;
                }
                break;
              
              case 1 : 
                S691=1;
                S691=0;
                if(com.systemj.Timer.getMs() - __start_thread_10 >= (2) * 1000){//sysj\controller.sysj line: 140, column: 5
                  ends[10]=2;
                  ;//sysj\controller.sysj line: 140, column: 5
                  System.out.println("sent");//sysj\controller.sysj line: 144, column: 5
                  S689=3;
                  S724=0;
                  if(!zone1P_o.isPartnerPresent() || zone1P_o.isPartnerPreempted()){//sysj\controller.sysj line: 146, column: 5
                    zone1P_o.setREQ(false);//sysj\controller.sysj line: 146, column: 5
                    S724=1;
                    active[10]=1;
                    ends[10]=1;
                    tdone[10]=1;
                  }
                  else {
                    S719=0;
                    if(zone1P_o.isACK()){//sysj\controller.sysj line: 146, column: 5
                      zone1P_o.setVal(false);//sysj\controller.sysj line: 146, column: 5
                      S719=1;
                      if(!zone1P_o.isACK()){//sysj\controller.sysj line: 146, column: 5
                        zone1P_o.setREQ(false);//sysj\controller.sysj line: 146, column: 5
                        ends[10]=2;
                        ;//sysj\controller.sysj line: 146, column: 5
                        S689=4;
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
                  S691=1;
                  active[10]=1;
                  ends[10]=1;
                  tdone[10]=1;
                }
                break;
              
            }
            break;
          
          case 3 : 
            switch(S724){
              case 0 : 
                if(!zone1P_o.isPartnerPresent() || zone1P_o.isPartnerPreempted()){//sysj\controller.sysj line: 146, column: 5
                  zone1P_o.setREQ(false);//sysj\controller.sysj line: 146, column: 5
                  S724=1;
                  active[10]=1;
                  ends[10]=1;
                  tdone[10]=1;
                }
                else {
                  switch(S719){
                    case 0 : 
                      if(zone1P_o.isACK()){//sysj\controller.sysj line: 146, column: 5
                        zone1P_o.setVal(false);//sysj\controller.sysj line: 146, column: 5
                        S719=1;
                        if(!zone1P_o.isACK()){//sysj\controller.sysj line: 146, column: 5
                          zone1P_o.setREQ(false);//sysj\controller.sysj line: 146, column: 5
                          ends[10]=2;
                          ;//sysj\controller.sysj line: 146, column: 5
                          S689=4;
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
                      if(!zone1P_o.isACK()){//sysj\controller.sysj line: 146, column: 5
                        zone1P_o.setREQ(false);//sysj\controller.sysj line: 146, column: 5
                        ends[10]=2;
                        ;//sysj\controller.sysj line: 146, column: 5
                        S689=4;
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
                S724=1;
                S724=0;
                if(!zone1P_o.isPartnerPresent() || zone1P_o.isPartnerPreempted()){//sysj\controller.sysj line: 146, column: 5
                  zone1P_o.setREQ(false);//sysj\controller.sysj line: 146, column: 5
                  S724=1;
                  active[10]=1;
                  ends[10]=1;
                  tdone[10]=1;
                }
                else {
                  S719=0;
                  if(zone1P_o.isACK()){//sysj\controller.sysj line: 146, column: 5
                    zone1P_o.setVal(false);//sysj\controller.sysj line: 146, column: 5
                    S719=1;
                    if(!zone1P_o.isACK()){//sysj\controller.sysj line: 146, column: 5
                      zone1P_o.setREQ(false);//sysj\controller.sysj line: 146, column: 5
                      ends[10]=2;
                      ;//sysj\controller.sysj line: 146, column: 5
                      S689=4;
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
          
          case 4 : 
            S689=4;
            S689=5;
            __start_thread_10 = com.systemj.Timer.getMs();//sysj\controller.sysj line: 140, column: 5
            if(com.systemj.Timer.getMs() - __start_thread_10 >= (4) * 1000){//sysj\controller.sysj line: 140, column: 5
              ends[10]=2;
              ;//sysj\controller.sysj line: 140, column: 5
              System.out.println("unsent");//sysj\controller.sysj line: 149, column: 5
              S689=0;
              S673=0;
              if(!zone1P_o.isPartnerPresent() || zone1P_o.isPartnerPreempted()){//sysj\controller.sysj line: 141, column: 5
                zone1P_o.setREQ(false);//sysj\controller.sysj line: 141, column: 5
                S673=1;
                active[10]=1;
                ends[10]=1;
                tdone[10]=1;
              }
              else {
                S668=0;
                if(zone1P_o.isACK()){//sysj\controller.sysj line: 141, column: 5
                  zone1P_o.setVal(true);//sysj\controller.sysj line: 141, column: 5
                  S668=1;
                  if(!zone1P_o.isACK()){//sysj\controller.sysj line: 141, column: 5
                    zone1P_o.setREQ(false);//sysj\controller.sysj line: 141, column: 5
                    ends[10]=2;
                    ;//sysj\controller.sysj line: 141, column: 5
                    S689=1;
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
          
          case 5 : 
            if(com.systemj.Timer.getMs() - __start_thread_10 >= (4) * 1000){//sysj\controller.sysj line: 140, column: 5
              ends[10]=2;
              ;//sysj\controller.sysj line: 140, column: 5
              System.out.println("unsent");//sysj\controller.sysj line: 149, column: 5
              S689=0;
              S673=0;
              if(!zone1P_o.isPartnerPresent() || zone1P_o.isPartnerPreempted()){//sysj\controller.sysj line: 141, column: 5
                zone1P_o.setREQ(false);//sysj\controller.sysj line: 141, column: 5
                S673=1;
                active[10]=1;
                ends[10]=1;
                tdone[10]=1;
              }
              else {
                S668=0;
                if(zone1P_o.isACK()){//sysj\controller.sysj line: 141, column: 5
                  zone1P_o.setVal(true);//sysj\controller.sysj line: 141, column: 5
                  S668=1;
                  if(!zone1P_o.isACK()){//sysj\controller.sysj line: 141, column: 5
                    zone1P_o.setREQ(false);//sysj\controller.sysj line: 141, column: 5
                    ends[10]=2;
                    ;//sysj\controller.sysj line: 141, column: 5
                    S689=1;
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
        break;
      
    }
  }

  public void thread3226(int [] tdone, int [] ends){
        S2340=1;
    S1526=0;
    S1510=0;
    if(!zone3P_o.isPartnerPresent() || zone3P_o.isPartnerPreempted()){//sysj\controller.sysj line: 153, column: 5
      zone3P_o.setREQ(false);//sysj\controller.sysj line: 153, column: 5
      S1510=1;
      active[11]=1;
      ends[11]=1;
      tdone[11]=1;
    }
    else {
      S1505=0;
      if(zone3P_o.isACK()){//sysj\controller.sysj line: 153, column: 5
        zone3P_o.setVal(true);//sysj\controller.sysj line: 153, column: 5
        S1505=1;
        if(!zone3P_o.isACK()){//sysj\controller.sysj line: 153, column: 5
          zone3P_o.setREQ(false);//sysj\controller.sysj line: 153, column: 5
          ends[11]=2;
          ;//sysj\controller.sysj line: 153, column: 5
          S1526=1;
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

  public void thread3225(int [] tdone, int [] ends){
        S1503=1;
    S689=0;
    S673=0;
    if(!zone1P_o.isPartnerPresent() || zone1P_o.isPartnerPreempted()){//sysj\controller.sysj line: 141, column: 5
      zone1P_o.setREQ(false);//sysj\controller.sysj line: 141, column: 5
      S673=1;
      active[10]=1;
      ends[10]=1;
      tdone[10]=1;
    }
    else {
      S668=0;
      if(zone1P_o.isACK()){//sysj\controller.sysj line: 141, column: 5
        zone1P_o.setVal(true);//sysj\controller.sysj line: 141, column: 5
        S668=1;
        if(!zone1P_o.isACK()){//sysj\controller.sysj line: 141, column: 5
          zone1P_o.setREQ(false);//sysj\controller.sysj line: 141, column: 5
          ends[10]=2;
          ;//sysj\controller.sysj line: 141, column: 5
          S689=1;
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

  public void runClockDomain(){
    for(int i=0;i<ends.length;i++){
      ends[i] = 0;
      tdone[i] = 0;
    }
    
    RUN: while(true){
      switch(S2342){
        case 0 : 
          S2342=0;
          break RUN;
        
        case 1 : 
          S2342=2;
          S2342=2;
          thread3225(tdone,ends);
          thread3226(tdone,ends);
          int biggest3227 = 0;
          if(ends[10]>=biggest3227){
            biggest3227=ends[10];
          }
          if(ends[11]>=biggest3227){
            biggest3227=ends[11];
          }
          if(biggest3227 == 1){
            active[9]=1;
            ends[9]=1;
            break RUN;
          }
        
        case 2 : 
          thread3228(tdone,ends);
          thread3229(tdone,ends);
          int biggest3230 = 0;
          if(ends[10]>=biggest3230){
            biggest3230=ends[10];
          }
          if(ends[11]>=biggest3230){
            biggest3230=ends[11];
          }
          if(biggest3230 == 1){
            active[9]=1;
            ends[9]=1;
            break RUN;
          }
          //FINXME code
          if(biggest3230 == 0){
            S2342=0;
            active[9]=0;
            ends[9]=0;
            S2342=0;
            break RUN;
          }
        
      }
    }
  }

  public void init(){
    char [] active1 = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
    char [] paused1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    char [] suspended1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    paused = paused1;
    active = active1;
    suspended = suspended1;
    // Now instantiate all the local signals ONLY
    // --------------------------------------------------
  }
  
  public void run(){
    while(active[9] != 0){
      int index = 9;
      if(paused[index]==1 || suspended[index]==1 || active[index] == 0){
        for(int h=1;h<paused.length;++h){
          paused[h]=0;
        }
      }
      if(paused[9]!=0 || suspended[9]!=0 || active[9]!=1);
      else{
        if(!df){
          zone1P_o.gethook();
          zone2P_o.gethook();
          zone3P_o.gethook();
          zone4P_o.gethook();
          zone5P_o.gethook();
          zone6P_o.gethook();
          zone7P_o.gethook();
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
      zone1P_o.sethook();
      zone2P_o.sethook();
      zone3P_o.sethook();
      zone4P_o.sethook();
      zone5P_o.sethook();
      zone6P_o.sethook();
      zone7P_o.sethook();
      if(paused[9]!=0 || suspended[9]!=0 || active[9]!=1);
      else{
        zone1P_o.gethook();
        zone2P_o.gethook();
        zone3P_o.gethook();
        zone4P_o.gethook();
        zone5P_o.gethook();
        zone6P_o.gethook();
        zone7P_o.gethook();
      }
      runFinisher();
      if(active[9] == 0){
      	this.terminated = true;
      }
      if(!threaded) break;
    }
  }
}
