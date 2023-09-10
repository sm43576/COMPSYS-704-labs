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
  private long __start_thread_10;//sysj/controller.sysj line: 65, column: 5
  private long __start_thread_11;//sysj/controller.sysj line: 77, column: 5
  private int S1987 = 1;
  private int S1148 = 1;
  private int S334 = 1;
  private int S318 = 1;
  private int S313 = 1;
  private int S336 = 1;
  private int S369 = 1;
  private int S364 = 1;
  private int S1985 = 1;
  private int S1171 = 1;
  private int S1155 = 1;
  private int S1150 = 1;
  private int S1206 = 1;
  private int S1201 = 1;
  
  private int[] ends = new int[12];
  private int[] tdone = new int[12];
  
  public void thread2009(int [] tdone, int [] ends){
        switch(S1985){
      case 0 : 
        active[11]=0;
        ends[11]=0;
        tdone[11]=1;
        break;
      
      case 1 : 
        switch(S1171){
          case 0 : 
            switch(S1155){
              case 0 : 
                if(!zone3P_o.isPartnerPresent() || zone3P_o.isPartnerPreempted()){//sysj/controller.sysj line: 78, column: 5
                  zone3P_o.setREQ(false);//sysj/controller.sysj line: 78, column: 5
                  S1155=1;
                  active[11]=1;
                  ends[11]=1;
                  tdone[11]=1;
                }
                else {
                  switch(S1150){
                    case 0 : 
                      if(zone3P_o.isACK()){//sysj/controller.sysj line: 78, column: 5
                        zone3P_o.setVal(true);//sysj/controller.sysj line: 78, column: 5
                        S1150=1;
                        if(!zone3P_o.isACK()){//sysj/controller.sysj line: 78, column: 5
                          zone3P_o.setREQ(false);//sysj/controller.sysj line: 78, column: 5
                          ends[11]=2;
                          ;//sysj/controller.sysj line: 78, column: 5
                          S1171=1;
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
                      if(!zone3P_o.isACK()){//sysj/controller.sysj line: 78, column: 5
                        zone3P_o.setREQ(false);//sysj/controller.sysj line: 78, column: 5
                        ends[11]=2;
                        ;//sysj/controller.sysj line: 78, column: 5
                        S1171=1;
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
                S1155=1;
                S1155=0;
                if(!zone3P_o.isPartnerPresent() || zone3P_o.isPartnerPreempted()){//sysj/controller.sysj line: 78, column: 5
                  zone3P_o.setREQ(false);//sysj/controller.sysj line: 78, column: 5
                  S1155=1;
                  active[11]=1;
                  ends[11]=1;
                  tdone[11]=1;
                }
                else {
                  S1150=0;
                  if(zone3P_o.isACK()){//sysj/controller.sysj line: 78, column: 5
                    zone3P_o.setVal(true);//sysj/controller.sysj line: 78, column: 5
                    S1150=1;
                    if(!zone3P_o.isACK()){//sysj/controller.sysj line: 78, column: 5
                      zone3P_o.setREQ(false);//sysj/controller.sysj line: 78, column: 5
                      ends[11]=2;
                      ;//sysj/controller.sysj line: 78, column: 5
                      S1171=1;
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
            S1171=1;
            S1171=2;
            __start_thread_11 = com.systemj.Timer.getMs();//sysj/controller.sysj line: 77, column: 5
            if(com.systemj.Timer.getMs() - __start_thread_11 >= (5) * 1000){//sysj/controller.sysj line: 77, column: 5
              ends[11]=2;
              ;//sysj/controller.sysj line: 77, column: 5
              System.out.println("sent");//sysj/controller.sysj line: 81, column: 5
              S1171=3;
              S1206=0;
              if(!zone3P_o.isPartnerPresent() || zone3P_o.isPartnerPreempted()){//sysj/controller.sysj line: 83, column: 5
                zone3P_o.setREQ(false);//sysj/controller.sysj line: 83, column: 5
                S1206=1;
                active[11]=1;
                ends[11]=1;
                tdone[11]=1;
              }
              else {
                S1201=0;
                if(zone3P_o.isACK()){//sysj/controller.sysj line: 83, column: 5
                  zone3P_o.setVal(false);//sysj/controller.sysj line: 83, column: 5
                  S1201=1;
                  if(!zone3P_o.isACK()){//sysj/controller.sysj line: 83, column: 5
                    zone3P_o.setREQ(false);//sysj/controller.sysj line: 83, column: 5
                    ends[11]=2;
                    ;//sysj/controller.sysj line: 83, column: 5
                    S1171=4;
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
            if(com.systemj.Timer.getMs() - __start_thread_11 >= (5) * 1000){//sysj/controller.sysj line: 77, column: 5
              ends[11]=2;
              ;//sysj/controller.sysj line: 77, column: 5
              System.out.println("sent");//sysj/controller.sysj line: 81, column: 5
              S1171=3;
              S1206=0;
              if(!zone3P_o.isPartnerPresent() || zone3P_o.isPartnerPreempted()){//sysj/controller.sysj line: 83, column: 5
                zone3P_o.setREQ(false);//sysj/controller.sysj line: 83, column: 5
                S1206=1;
                active[11]=1;
                ends[11]=1;
                tdone[11]=1;
              }
              else {
                S1201=0;
                if(zone3P_o.isACK()){//sysj/controller.sysj line: 83, column: 5
                  zone3P_o.setVal(false);//sysj/controller.sysj line: 83, column: 5
                  S1201=1;
                  if(!zone3P_o.isACK()){//sysj/controller.sysj line: 83, column: 5
                    zone3P_o.setREQ(false);//sysj/controller.sysj line: 83, column: 5
                    ends[11]=2;
                    ;//sysj/controller.sysj line: 83, column: 5
                    S1171=4;
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
            switch(S1206){
              case 0 : 
                if(!zone3P_o.isPartnerPresent() || zone3P_o.isPartnerPreempted()){//sysj/controller.sysj line: 83, column: 5
                  zone3P_o.setREQ(false);//sysj/controller.sysj line: 83, column: 5
                  S1206=1;
                  active[11]=1;
                  ends[11]=1;
                  tdone[11]=1;
                }
                else {
                  switch(S1201){
                    case 0 : 
                      if(zone3P_o.isACK()){//sysj/controller.sysj line: 83, column: 5
                        zone3P_o.setVal(false);//sysj/controller.sysj line: 83, column: 5
                        S1201=1;
                        if(!zone3P_o.isACK()){//sysj/controller.sysj line: 83, column: 5
                          zone3P_o.setREQ(false);//sysj/controller.sysj line: 83, column: 5
                          ends[11]=2;
                          ;//sysj/controller.sysj line: 83, column: 5
                          S1171=4;
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
                      if(!zone3P_o.isACK()){//sysj/controller.sysj line: 83, column: 5
                        zone3P_o.setREQ(false);//sysj/controller.sysj line: 83, column: 5
                        ends[11]=2;
                        ;//sysj/controller.sysj line: 83, column: 5
                        S1171=4;
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
                S1206=1;
                S1206=0;
                if(!zone3P_o.isPartnerPresent() || zone3P_o.isPartnerPreempted()){//sysj/controller.sysj line: 83, column: 5
                  zone3P_o.setREQ(false);//sysj/controller.sysj line: 83, column: 5
                  S1206=1;
                  active[11]=1;
                  ends[11]=1;
                  tdone[11]=1;
                }
                else {
                  S1201=0;
                  if(zone3P_o.isACK()){//sysj/controller.sysj line: 83, column: 5
                    zone3P_o.setVal(false);//sysj/controller.sysj line: 83, column: 5
                    S1201=1;
                    if(!zone3P_o.isACK()){//sysj/controller.sysj line: 83, column: 5
                      zone3P_o.setREQ(false);//sysj/controller.sysj line: 83, column: 5
                      ends[11]=2;
                      ;//sysj/controller.sysj line: 83, column: 5
                      S1171=4;
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
            S1171=4;
            S1171=5;
            __start_thread_11 = com.systemj.Timer.getMs();//sysj/controller.sysj line: 77, column: 5
            if(com.systemj.Timer.getMs() - __start_thread_11 >= (5) * 1000){//sysj/controller.sysj line: 77, column: 5
              ends[11]=2;
              ;//sysj/controller.sysj line: 77, column: 5
              System.out.println("unsent");//sysj/controller.sysj line: 86, column: 5
              S1171=0;
              S1155=0;
              if(!zone3P_o.isPartnerPresent() || zone3P_o.isPartnerPreempted()){//sysj/controller.sysj line: 78, column: 5
                zone3P_o.setREQ(false);//sysj/controller.sysj line: 78, column: 5
                S1155=1;
                active[11]=1;
                ends[11]=1;
                tdone[11]=1;
              }
              else {
                S1150=0;
                if(zone3P_o.isACK()){//sysj/controller.sysj line: 78, column: 5
                  zone3P_o.setVal(true);//sysj/controller.sysj line: 78, column: 5
                  S1150=1;
                  if(!zone3P_o.isACK()){//sysj/controller.sysj line: 78, column: 5
                    zone3P_o.setREQ(false);//sysj/controller.sysj line: 78, column: 5
                    ends[11]=2;
                    ;//sysj/controller.sysj line: 78, column: 5
                    S1171=1;
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
            if(com.systemj.Timer.getMs() - __start_thread_11 >= (5) * 1000){//sysj/controller.sysj line: 77, column: 5
              ends[11]=2;
              ;//sysj/controller.sysj line: 77, column: 5
              System.out.println("unsent");//sysj/controller.sysj line: 86, column: 5
              S1171=0;
              S1155=0;
              if(!zone3P_o.isPartnerPresent() || zone3P_o.isPartnerPreempted()){//sysj/controller.sysj line: 78, column: 5
                zone3P_o.setREQ(false);//sysj/controller.sysj line: 78, column: 5
                S1155=1;
                active[11]=1;
                ends[11]=1;
                tdone[11]=1;
              }
              else {
                S1150=0;
                if(zone3P_o.isACK()){//sysj/controller.sysj line: 78, column: 5
                  zone3P_o.setVal(true);//sysj/controller.sysj line: 78, column: 5
                  S1150=1;
                  if(!zone3P_o.isACK()){//sysj/controller.sysj line: 78, column: 5
                    zone3P_o.setREQ(false);//sysj/controller.sysj line: 78, column: 5
                    ends[11]=2;
                    ;//sysj/controller.sysj line: 78, column: 5
                    S1171=1;
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

  public void thread2008(int [] tdone, int [] ends){
        switch(S1148){
      case 0 : 
        active[10]=0;
        ends[10]=0;
        tdone[10]=1;
        break;
      
      case 1 : 
        switch(S334){
          case 0 : 
            switch(S318){
              case 0 : 
                if(!zone1P_o.isPartnerPresent() || zone1P_o.isPartnerPreempted()){//sysj/controller.sysj line: 66, column: 5
                  zone1P_o.setREQ(false);//sysj/controller.sysj line: 66, column: 5
                  S318=1;
                  active[10]=1;
                  ends[10]=1;
                  tdone[10]=1;
                }
                else {
                  switch(S313){
                    case 0 : 
                      if(zone1P_o.isACK()){//sysj/controller.sysj line: 66, column: 5
                        zone1P_o.setVal(true);//sysj/controller.sysj line: 66, column: 5
                        S313=1;
                        if(!zone1P_o.isACK()){//sysj/controller.sysj line: 66, column: 5
                          zone1P_o.setREQ(false);//sysj/controller.sysj line: 66, column: 5
                          ends[10]=2;
                          ;//sysj/controller.sysj line: 66, column: 5
                          S334=1;
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
                      if(!zone1P_o.isACK()){//sysj/controller.sysj line: 66, column: 5
                        zone1P_o.setREQ(false);//sysj/controller.sysj line: 66, column: 5
                        ends[10]=2;
                        ;//sysj/controller.sysj line: 66, column: 5
                        S334=1;
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
                S318=1;
                S318=0;
                if(!zone1P_o.isPartnerPresent() || zone1P_o.isPartnerPreempted()){//sysj/controller.sysj line: 66, column: 5
                  zone1P_o.setREQ(false);//sysj/controller.sysj line: 66, column: 5
                  S318=1;
                  active[10]=1;
                  ends[10]=1;
                  tdone[10]=1;
                }
                else {
                  S313=0;
                  if(zone1P_o.isACK()){//sysj/controller.sysj line: 66, column: 5
                    zone1P_o.setVal(true);//sysj/controller.sysj line: 66, column: 5
                    S313=1;
                    if(!zone1P_o.isACK()){//sysj/controller.sysj line: 66, column: 5
                      zone1P_o.setREQ(false);//sysj/controller.sysj line: 66, column: 5
                      ends[10]=2;
                      ;//sysj/controller.sysj line: 66, column: 5
                      S334=1;
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
            S334=1;
            S334=2;
            __start_thread_10 = com.systemj.Timer.getMs();//sysj/controller.sysj line: 65, column: 5
            S336=0;
            if(com.systemj.Timer.getMs() - __start_thread_10 >= (2) * 1000){//sysj/controller.sysj line: 65, column: 5
              ends[10]=2;
              ;//sysj/controller.sysj line: 65, column: 5
              System.out.println("sent");//sysj/controller.sysj line: 69, column: 5
              S334=3;
              S369=0;
              if(!zone1P_o.isPartnerPresent() || zone1P_o.isPartnerPreempted()){//sysj/controller.sysj line: 71, column: 5
                zone1P_o.setREQ(false);//sysj/controller.sysj line: 71, column: 5
                S369=1;
                active[10]=1;
                ends[10]=1;
                tdone[10]=1;
              }
              else {
                S364=0;
                if(zone1P_o.isACK()){//sysj/controller.sysj line: 71, column: 5
                  zone1P_o.setVal(false);//sysj/controller.sysj line: 71, column: 5
                  S364=1;
                  if(!zone1P_o.isACK()){//sysj/controller.sysj line: 71, column: 5
                    zone1P_o.setREQ(false);//sysj/controller.sysj line: 71, column: 5
                    ends[10]=2;
                    ;//sysj/controller.sysj line: 71, column: 5
                    S334=4;
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
              S336=1;
              active[10]=1;
              ends[10]=1;
              tdone[10]=1;
            }
            break;
          
          case 2 : 
            switch(S336){
              case 0 : 
                S336=0;
                if(com.systemj.Timer.getMs() - __start_thread_10 >= (2) * 1000){//sysj/controller.sysj line: 65, column: 5
                  ends[10]=2;
                  ;//sysj/controller.sysj line: 65, column: 5
                  System.out.println("sent");//sysj/controller.sysj line: 69, column: 5
                  S334=3;
                  S369=0;
                  if(!zone1P_o.isPartnerPresent() || zone1P_o.isPartnerPreempted()){//sysj/controller.sysj line: 71, column: 5
                    zone1P_o.setREQ(false);//sysj/controller.sysj line: 71, column: 5
                    S369=1;
                    active[10]=1;
                    ends[10]=1;
                    tdone[10]=1;
                  }
                  else {
                    S364=0;
                    if(zone1P_o.isACK()){//sysj/controller.sysj line: 71, column: 5
                      zone1P_o.setVal(false);//sysj/controller.sysj line: 71, column: 5
                      S364=1;
                      if(!zone1P_o.isACK()){//sysj/controller.sysj line: 71, column: 5
                        zone1P_o.setREQ(false);//sysj/controller.sysj line: 71, column: 5
                        ends[10]=2;
                        ;//sysj/controller.sysj line: 71, column: 5
                        S334=4;
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
                  S336=1;
                  active[10]=1;
                  ends[10]=1;
                  tdone[10]=1;
                }
                break;
              
              case 1 : 
                S336=1;
                S336=0;
                if(com.systemj.Timer.getMs() - __start_thread_10 >= (2) * 1000){//sysj/controller.sysj line: 65, column: 5
                  ends[10]=2;
                  ;//sysj/controller.sysj line: 65, column: 5
                  System.out.println("sent");//sysj/controller.sysj line: 69, column: 5
                  S334=3;
                  S369=0;
                  if(!zone1P_o.isPartnerPresent() || zone1P_o.isPartnerPreempted()){//sysj/controller.sysj line: 71, column: 5
                    zone1P_o.setREQ(false);//sysj/controller.sysj line: 71, column: 5
                    S369=1;
                    active[10]=1;
                    ends[10]=1;
                    tdone[10]=1;
                  }
                  else {
                    S364=0;
                    if(zone1P_o.isACK()){//sysj/controller.sysj line: 71, column: 5
                      zone1P_o.setVal(false);//sysj/controller.sysj line: 71, column: 5
                      S364=1;
                      if(!zone1P_o.isACK()){//sysj/controller.sysj line: 71, column: 5
                        zone1P_o.setREQ(false);//sysj/controller.sysj line: 71, column: 5
                        ends[10]=2;
                        ;//sysj/controller.sysj line: 71, column: 5
                        S334=4;
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
                  S336=1;
                  active[10]=1;
                  ends[10]=1;
                  tdone[10]=1;
                }
                break;
              
            }
            break;
          
          case 3 : 
            switch(S369){
              case 0 : 
                if(!zone1P_o.isPartnerPresent() || zone1P_o.isPartnerPreempted()){//sysj/controller.sysj line: 71, column: 5
                  zone1P_o.setREQ(false);//sysj/controller.sysj line: 71, column: 5
                  S369=1;
                  active[10]=1;
                  ends[10]=1;
                  tdone[10]=1;
                }
                else {
                  switch(S364){
                    case 0 : 
                      if(zone1P_o.isACK()){//sysj/controller.sysj line: 71, column: 5
                        zone1P_o.setVal(false);//sysj/controller.sysj line: 71, column: 5
                        S364=1;
                        if(!zone1P_o.isACK()){//sysj/controller.sysj line: 71, column: 5
                          zone1P_o.setREQ(false);//sysj/controller.sysj line: 71, column: 5
                          ends[10]=2;
                          ;//sysj/controller.sysj line: 71, column: 5
                          S334=4;
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
                      if(!zone1P_o.isACK()){//sysj/controller.sysj line: 71, column: 5
                        zone1P_o.setREQ(false);//sysj/controller.sysj line: 71, column: 5
                        ends[10]=2;
                        ;//sysj/controller.sysj line: 71, column: 5
                        S334=4;
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
                S369=1;
                S369=0;
                if(!zone1P_o.isPartnerPresent() || zone1P_o.isPartnerPreempted()){//sysj/controller.sysj line: 71, column: 5
                  zone1P_o.setREQ(false);//sysj/controller.sysj line: 71, column: 5
                  S369=1;
                  active[10]=1;
                  ends[10]=1;
                  tdone[10]=1;
                }
                else {
                  S364=0;
                  if(zone1P_o.isACK()){//sysj/controller.sysj line: 71, column: 5
                    zone1P_o.setVal(false);//sysj/controller.sysj line: 71, column: 5
                    S364=1;
                    if(!zone1P_o.isACK()){//sysj/controller.sysj line: 71, column: 5
                      zone1P_o.setREQ(false);//sysj/controller.sysj line: 71, column: 5
                      ends[10]=2;
                      ;//sysj/controller.sysj line: 71, column: 5
                      S334=4;
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
            S334=4;
            S334=5;
            __start_thread_10 = com.systemj.Timer.getMs();//sysj/controller.sysj line: 65, column: 5
            if(com.systemj.Timer.getMs() - __start_thread_10 >= (4) * 1000){//sysj/controller.sysj line: 65, column: 5
              ends[10]=2;
              ;//sysj/controller.sysj line: 65, column: 5
              System.out.println("unsent");//sysj/controller.sysj line: 74, column: 5
              S334=0;
              S318=0;
              if(!zone1P_o.isPartnerPresent() || zone1P_o.isPartnerPreempted()){//sysj/controller.sysj line: 66, column: 5
                zone1P_o.setREQ(false);//sysj/controller.sysj line: 66, column: 5
                S318=1;
                active[10]=1;
                ends[10]=1;
                tdone[10]=1;
              }
              else {
                S313=0;
                if(zone1P_o.isACK()){//sysj/controller.sysj line: 66, column: 5
                  zone1P_o.setVal(true);//sysj/controller.sysj line: 66, column: 5
                  S313=1;
                  if(!zone1P_o.isACK()){//sysj/controller.sysj line: 66, column: 5
                    zone1P_o.setREQ(false);//sysj/controller.sysj line: 66, column: 5
                    ends[10]=2;
                    ;//sysj/controller.sysj line: 66, column: 5
                    S334=1;
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
            if(com.systemj.Timer.getMs() - __start_thread_10 >= (4) * 1000){//sysj/controller.sysj line: 65, column: 5
              ends[10]=2;
              ;//sysj/controller.sysj line: 65, column: 5
              System.out.println("unsent");//sysj/controller.sysj line: 74, column: 5
              S334=0;
              S318=0;
              if(!zone1P_o.isPartnerPresent() || zone1P_o.isPartnerPreempted()){//sysj/controller.sysj line: 66, column: 5
                zone1P_o.setREQ(false);//sysj/controller.sysj line: 66, column: 5
                S318=1;
                active[10]=1;
                ends[10]=1;
                tdone[10]=1;
              }
              else {
                S313=0;
                if(zone1P_o.isACK()){//sysj/controller.sysj line: 66, column: 5
                  zone1P_o.setVal(true);//sysj/controller.sysj line: 66, column: 5
                  S313=1;
                  if(!zone1P_o.isACK()){//sysj/controller.sysj line: 66, column: 5
                    zone1P_o.setREQ(false);//sysj/controller.sysj line: 66, column: 5
                    ends[10]=2;
                    ;//sysj/controller.sysj line: 66, column: 5
                    S334=1;
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

  public void thread2006(int [] tdone, int [] ends){
        S1985=1;
    S1171=0;
    S1155=0;
    if(!zone3P_o.isPartnerPresent() || zone3P_o.isPartnerPreempted()){//sysj/controller.sysj line: 78, column: 5
      zone3P_o.setREQ(false);//sysj/controller.sysj line: 78, column: 5
      S1155=1;
      active[11]=1;
      ends[11]=1;
      tdone[11]=1;
    }
    else {
      S1150=0;
      if(zone3P_o.isACK()){//sysj/controller.sysj line: 78, column: 5
        zone3P_o.setVal(true);//sysj/controller.sysj line: 78, column: 5
        S1150=1;
        if(!zone3P_o.isACK()){//sysj/controller.sysj line: 78, column: 5
          zone3P_o.setREQ(false);//sysj/controller.sysj line: 78, column: 5
          ends[11]=2;
          ;//sysj/controller.sysj line: 78, column: 5
          S1171=1;
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

  public void thread2005(int [] tdone, int [] ends){
        S1148=1;
    S334=0;
    S318=0;
    if(!zone1P_o.isPartnerPresent() || zone1P_o.isPartnerPreempted()){//sysj/controller.sysj line: 66, column: 5
      zone1P_o.setREQ(false);//sysj/controller.sysj line: 66, column: 5
      S318=1;
      active[10]=1;
      ends[10]=1;
      tdone[10]=1;
    }
    else {
      S313=0;
      if(zone1P_o.isACK()){//sysj/controller.sysj line: 66, column: 5
        zone1P_o.setVal(true);//sysj/controller.sysj line: 66, column: 5
        S313=1;
        if(!zone1P_o.isACK()){//sysj/controller.sysj line: 66, column: 5
          zone1P_o.setREQ(false);//sysj/controller.sysj line: 66, column: 5
          ends[10]=2;
          ;//sysj/controller.sysj line: 66, column: 5
          S334=1;
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
      switch(S1987){
        case 0 : 
          S1987=0;
          break RUN;
        
        case 1 : 
          S1987=2;
          S1987=2;
          thread2005(tdone,ends);
          thread2006(tdone,ends);
          int biggest2007 = 0;
          if(ends[10]>=biggest2007){
            biggest2007=ends[10];
          }
          if(ends[11]>=biggest2007){
            biggest2007=ends[11];
          }
          if(biggest2007 == 1){
            active[9]=1;
            ends[9]=1;
            break RUN;
          }
        
        case 2 : 
          thread2008(tdone,ends);
          thread2009(tdone,ends);
          int biggest2010 = 0;
          if(ends[10]>=biggest2010){
            biggest2010=ends[10];
          }
          if(ends[11]>=biggest2010){
            biggest2010=ends[11];
          }
          if(biggest2010 == 1){
            active[9]=1;
            ends[9]=1;
            break RUN;
          }
          //FINXME code
          if(biggest2010 == 0){
            S1987=0;
            active[9]=0;
            ends[9]=0;
            S1987=0;
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
