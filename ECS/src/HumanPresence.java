import java.util.*;
import com.systemj.ClockDomain;
import com.systemj.Signal;
import com.systemj.input_Channel;
import com.systemj.output_Channel;

public class HumanPresence extends ClockDomain{
  public HumanPresence(String name){super(name);}
  Vector currsigs = new Vector();
  private boolean df = false;
  private char [] active;
  private char [] paused;
  private char [] suspended;
  public Signal zone1Light = new Signal("zone1Light", Signal.OUTPUT);
  public Signal zone2Light = new Signal("zone2Light", Signal.OUTPUT);
  public Signal zone3Light = new Signal("zone3Light", Signal.OUTPUT);
  public Signal zone4Light = new Signal("zone4Light", Signal.OUTPUT);
  public Signal zone5Light = new Signal("zone5Light", Signal.OUTPUT);
  public Signal zone6Light = new Signal("zone6Light", Signal.OUTPUT);
  public Signal zone7Light = new Signal("zone7Light", Signal.OUTPUT);
  public input_Channel zone1P_in = new input_Channel();
  public input_Channel zone2P_in = new input_Channel();
  public input_Channel zone3P_in = new input_Channel();
  public input_Channel zone4P_in = new input_Channel();
  public input_Channel zone5P_in = new input_Channel();
  public input_Channel zone6P_in = new input_Channel();
  public input_Channel zone7P_in = new input_Channel();
  private int S294 = 1;
  private int S23 = 1;
  private int S6 = 1;
  private int S1 = 1;
  private int S47 = 1;
  private int S46 = 1;
  private int S30 = 1;
  private int S25 = 1;
  private int S196 = 1;
  private int S82 = 1;
  private int S54 = 1;
  private int S49 = 1;
  private int S84 = 1;
  private int S220 = 1;
  private int S219 = 1;
  private int S203 = 1;
  private int S198 = 1;
  private int S244 = 1;
  private int S243 = 1;
  private int S227 = 1;
  private int S222 = 1;
  private int S268 = 1;
  private int S267 = 1;
  private int S251 = 1;
  private int S246 = 1;
  private int S292 = 1;
  private int S291 = 1;
  private int S275 = 1;
  private int S270 = 1;
  
  private int[] ends = new int[10];
  private int[] tdone = new int[10];
  
  public void thread945(int [] tdone, int [] ends){
        switch(S292){
      case 0 : 
        active[8]=0;
        ends[8]=0;
        tdone[8]=1;
        break;
      
      case 1 : 
        switch(S291){
          case 0 : 
            switch(S275){
              case 0 : 
                if(!zone7P_in.isPartnerPresent() || zone7P_in.isPartnerPreempted()){//sysj/controller.sysj line: 29, column: 4
                  zone7P_in.setACK(false);//sysj/controller.sysj line: 29, column: 4
                  S275=1;
                  active[8]=1;
                  ends[8]=1;
                  tdone[8]=1;
                }
                else {
                  switch(S270){
                    case 0 : 
                      if(!zone7P_in.isREQ()){//sysj/controller.sysj line: 29, column: 4
                        zone7P_in.setACK(true);//sysj/controller.sysj line: 29, column: 4
                        S270=1;
                        if(zone7P_in.isREQ()){//sysj/controller.sysj line: 29, column: 4
                          zone7P_in.setACK(false);//sysj/controller.sysj line: 29, column: 4
                          ends[8]=2;
                          ;//sysj/controller.sysj line: 29, column: 4
                          S291=1;
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
                      if(zone7P_in.isREQ()){//sysj/controller.sysj line: 29, column: 4
                        zone7P_in.setACK(false);//sysj/controller.sysj line: 29, column: 4
                        ends[8]=2;
                        ;//sysj/controller.sysj line: 29, column: 4
                        S291=1;
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
                S275=1;
                S275=0;
                if(!zone7P_in.isPartnerPresent() || zone7P_in.isPartnerPreempted()){//sysj/controller.sysj line: 29, column: 4
                  zone7P_in.setACK(false);//sysj/controller.sysj line: 29, column: 4
                  S275=1;
                  active[8]=1;
                  ends[8]=1;
                  tdone[8]=1;
                }
                else {
                  S270=0;
                  if(!zone7P_in.isREQ()){//sysj/controller.sysj line: 29, column: 4
                    zone7P_in.setACK(true);//sysj/controller.sysj line: 29, column: 4
                    S270=1;
                    if(zone7P_in.isREQ()){//sysj/controller.sysj line: 29, column: 4
                      zone7P_in.setACK(false);//sysj/controller.sysj line: 29, column: 4
                      ends[8]=2;
                      ;//sysj/controller.sysj line: 29, column: 4
                      S291=1;
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
          
          case 1 : 
            S291=1;
            S292=0;
            active[8]=0;
            ends[8]=0;
            tdone[8]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread944(int [] tdone, int [] ends){
        switch(S268){
      case 0 : 
        active[7]=0;
        ends[7]=0;
        tdone[7]=1;
        break;
      
      case 1 : 
        switch(S267){
          case 0 : 
            switch(S251){
              case 0 : 
                if(!zone6P_in.isPartnerPresent() || zone6P_in.isPartnerPreempted()){//sysj/controller.sysj line: 28, column: 4
                  zone6P_in.setACK(false);//sysj/controller.sysj line: 28, column: 4
                  S251=1;
                  active[7]=1;
                  ends[7]=1;
                  tdone[7]=1;
                }
                else {
                  switch(S246){
                    case 0 : 
                      if(!zone6P_in.isREQ()){//sysj/controller.sysj line: 28, column: 4
                        zone6P_in.setACK(true);//sysj/controller.sysj line: 28, column: 4
                        S246=1;
                        if(zone6P_in.isREQ()){//sysj/controller.sysj line: 28, column: 4
                          zone6P_in.setACK(false);//sysj/controller.sysj line: 28, column: 4
                          ends[7]=2;
                          ;//sysj/controller.sysj line: 28, column: 4
                          S267=1;
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
                      if(zone6P_in.isREQ()){//sysj/controller.sysj line: 28, column: 4
                        zone6P_in.setACK(false);//sysj/controller.sysj line: 28, column: 4
                        ends[7]=2;
                        ;//sysj/controller.sysj line: 28, column: 4
                        S267=1;
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
                S251=1;
                S251=0;
                if(!zone6P_in.isPartnerPresent() || zone6P_in.isPartnerPreempted()){//sysj/controller.sysj line: 28, column: 4
                  zone6P_in.setACK(false);//sysj/controller.sysj line: 28, column: 4
                  S251=1;
                  active[7]=1;
                  ends[7]=1;
                  tdone[7]=1;
                }
                else {
                  S246=0;
                  if(!zone6P_in.isREQ()){//sysj/controller.sysj line: 28, column: 4
                    zone6P_in.setACK(true);//sysj/controller.sysj line: 28, column: 4
                    S246=1;
                    if(zone6P_in.isREQ()){//sysj/controller.sysj line: 28, column: 4
                      zone6P_in.setACK(false);//sysj/controller.sysj line: 28, column: 4
                      ends[7]=2;
                      ;//sysj/controller.sysj line: 28, column: 4
                      S267=1;
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
          
          case 1 : 
            S267=1;
            S268=0;
            active[7]=0;
            ends[7]=0;
            tdone[7]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread943(int [] tdone, int [] ends){
        switch(S244){
      case 0 : 
        active[6]=0;
        ends[6]=0;
        tdone[6]=1;
        break;
      
      case 1 : 
        switch(S243){
          case 0 : 
            switch(S227){
              case 0 : 
                if(!zone5P_in.isPartnerPresent() || zone5P_in.isPartnerPreempted()){//sysj/controller.sysj line: 27, column: 4
                  zone5P_in.setACK(false);//sysj/controller.sysj line: 27, column: 4
                  S227=1;
                  active[6]=1;
                  ends[6]=1;
                  tdone[6]=1;
                }
                else {
                  switch(S222){
                    case 0 : 
                      if(!zone5P_in.isREQ()){//sysj/controller.sysj line: 27, column: 4
                        zone5P_in.setACK(true);//sysj/controller.sysj line: 27, column: 4
                        S222=1;
                        if(zone5P_in.isREQ()){//sysj/controller.sysj line: 27, column: 4
                          zone5P_in.setACK(false);//sysj/controller.sysj line: 27, column: 4
                          ends[6]=2;
                          ;//sysj/controller.sysj line: 27, column: 4
                          S243=1;
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
                      if(zone5P_in.isREQ()){//sysj/controller.sysj line: 27, column: 4
                        zone5P_in.setACK(false);//sysj/controller.sysj line: 27, column: 4
                        ends[6]=2;
                        ;//sysj/controller.sysj line: 27, column: 4
                        S243=1;
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
                S227=1;
                S227=0;
                if(!zone5P_in.isPartnerPresent() || zone5P_in.isPartnerPreempted()){//sysj/controller.sysj line: 27, column: 4
                  zone5P_in.setACK(false);//sysj/controller.sysj line: 27, column: 4
                  S227=1;
                  active[6]=1;
                  ends[6]=1;
                  tdone[6]=1;
                }
                else {
                  S222=0;
                  if(!zone5P_in.isREQ()){//sysj/controller.sysj line: 27, column: 4
                    zone5P_in.setACK(true);//sysj/controller.sysj line: 27, column: 4
                    S222=1;
                    if(zone5P_in.isREQ()){//sysj/controller.sysj line: 27, column: 4
                      zone5P_in.setACK(false);//sysj/controller.sysj line: 27, column: 4
                      ends[6]=2;
                      ;//sysj/controller.sysj line: 27, column: 4
                      S243=1;
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
          
          case 1 : 
            S243=1;
            S244=0;
            active[6]=0;
            ends[6]=0;
            tdone[6]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread942(int [] tdone, int [] ends){
        switch(S220){
      case 0 : 
        active[5]=0;
        ends[5]=0;
        tdone[5]=1;
        break;
      
      case 1 : 
        switch(S219){
          case 0 : 
            switch(S203){
              case 0 : 
                if(!zone4P_in.isPartnerPresent() || zone4P_in.isPartnerPreempted()){//sysj/controller.sysj line: 26, column: 4
                  zone4P_in.setACK(false);//sysj/controller.sysj line: 26, column: 4
                  S203=1;
                  active[5]=1;
                  ends[5]=1;
                  tdone[5]=1;
                }
                else {
                  switch(S198){
                    case 0 : 
                      if(!zone4P_in.isREQ()){//sysj/controller.sysj line: 26, column: 4
                        zone4P_in.setACK(true);//sysj/controller.sysj line: 26, column: 4
                        S198=1;
                        if(zone4P_in.isREQ()){//sysj/controller.sysj line: 26, column: 4
                          zone4P_in.setACK(false);//sysj/controller.sysj line: 26, column: 4
                          ends[5]=2;
                          ;//sysj/controller.sysj line: 26, column: 4
                          S219=1;
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
                      if(zone4P_in.isREQ()){//sysj/controller.sysj line: 26, column: 4
                        zone4P_in.setACK(false);//sysj/controller.sysj line: 26, column: 4
                        ends[5]=2;
                        ;//sysj/controller.sysj line: 26, column: 4
                        S219=1;
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
                S203=1;
                S203=0;
                if(!zone4P_in.isPartnerPresent() || zone4P_in.isPartnerPreempted()){//sysj/controller.sysj line: 26, column: 4
                  zone4P_in.setACK(false);//sysj/controller.sysj line: 26, column: 4
                  S203=1;
                  active[5]=1;
                  ends[5]=1;
                  tdone[5]=1;
                }
                else {
                  S198=0;
                  if(!zone4P_in.isREQ()){//sysj/controller.sysj line: 26, column: 4
                    zone4P_in.setACK(true);//sysj/controller.sysj line: 26, column: 4
                    S198=1;
                    if(zone4P_in.isREQ()){//sysj/controller.sysj line: 26, column: 4
                      zone4P_in.setACK(false);//sysj/controller.sysj line: 26, column: 4
                      ends[5]=2;
                      ;//sysj/controller.sysj line: 26, column: 4
                      S219=1;
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
          
          case 1 : 
            S219=1;
            S220=0;
            active[5]=0;
            ends[5]=0;
            tdone[5]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread941(int [] tdone, int [] ends){
        switch(S196){
      case 0 : 
        active[4]=0;
        ends[4]=0;
        tdone[4]=1;
        break;
      
      case 1 : 
        switch(S82){
          case 0 : 
            switch(S54){
              case 0 : 
                if(!zone3P_in.isPartnerPresent() || zone3P_in.isPartnerPreempted()){//sysj/controller.sysj line: 18, column: 4
                  zone3P_in.setACK(false);//sysj/controller.sysj line: 18, column: 4
                  S54=1;
                  active[4]=1;
                  ends[4]=1;
                  tdone[4]=1;
                }
                else {
                  switch(S49){
                    case 0 : 
                      if(!zone3P_in.isREQ()){//sysj/controller.sysj line: 18, column: 4
                        zone3P_in.setACK(true);//sysj/controller.sysj line: 18, column: 4
                        S49=1;
                        if(zone3P_in.isREQ()){//sysj/controller.sysj line: 18, column: 4
                          zone3P_in.setACK(false);//sysj/controller.sysj line: 18, column: 4
                          ends[4]=2;
                          ;//sysj/controller.sysj line: 18, column: 4
                          S82=1;
                          zone3Light.setPresent();//sysj/controller.sysj line: 19, column: 4
                          currsigs.addElement(zone3Light);
                          System.out.println("Emitted zone3Light");
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
                      if(zone3P_in.isREQ()){//sysj/controller.sysj line: 18, column: 4
                        zone3P_in.setACK(false);//sysj/controller.sysj line: 18, column: 4
                        ends[4]=2;
                        ;//sysj/controller.sysj line: 18, column: 4
                        S82=1;
                        zone3Light.setPresent();//sysj/controller.sysj line: 19, column: 4
                        currsigs.addElement(zone3Light);
                        System.out.println("Emitted zone3Light");
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
                S54=1;
                S54=0;
                if(!zone3P_in.isPartnerPresent() || zone3P_in.isPartnerPreempted()){//sysj/controller.sysj line: 18, column: 4
                  zone3P_in.setACK(false);//sysj/controller.sysj line: 18, column: 4
                  S54=1;
                  active[4]=1;
                  ends[4]=1;
                  tdone[4]=1;
                }
                else {
                  S49=0;
                  if(!zone3P_in.isREQ()){//sysj/controller.sysj line: 18, column: 4
                    zone3P_in.setACK(true);//sysj/controller.sysj line: 18, column: 4
                    S49=1;
                    if(zone3P_in.isREQ()){//sysj/controller.sysj line: 18, column: 4
                      zone3P_in.setACK(false);//sysj/controller.sysj line: 18, column: 4
                      ends[4]=2;
                      ;//sysj/controller.sysj line: 18, column: 4
                      S82=1;
                      zone3Light.setPresent();//sysj/controller.sysj line: 19, column: 4
                      currsigs.addElement(zone3Light);
                      System.out.println("Emitted zone3Light");
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
          
          case 1 : 
            zone3Light.setPresent();//sysj/controller.sysj line: 19, column: 4
            currsigs.addElement(zone3Light);
            System.out.println("Emitted zone3Light");
            active[4]=1;
            ends[4]=1;
            tdone[4]=1;
            break;
          
          case 2 : 
            switch(S84){
              case 0 : 
                S84=0;
                if(com.systemj.Timer.getMs() - __start_thread_4 >= (5) * 1000){//sysj/controller.sysj line: 17, column: 5
                  ends[4]=2;
                  ;//sysj/controller.sysj line: 17, column: 5
                  System.out.println("waited 5min");//sysj/controller.sysj line: 21, column: 4
                  S82=3;
                  active[4]=1;
                  ends[4]=1;
                  tdone[4]=1;
                }
                else {
                  S84=1;
                  active[4]=1;
                  ends[4]=1;
                  tdone[4]=1;
                }
                break;
              
              case 1 : 
                S84=1;
                S84=0;
                if(com.systemj.Timer.getMs() - __start_thread_4 >= (5) * 1000){//sysj/controller.sysj line: 17, column: 5
                  ends[4]=2;
                  ;//sysj/controller.sysj line: 17, column: 5
                  System.out.println("waited 5min");//sysj/controller.sysj line: 21, column: 4
                  S82=3;
                  active[4]=1;
                  ends[4]=1;
                  tdone[4]=1;
                }
                else {
                  S84=1;
                  active[4]=1;
                  ends[4]=1;
                  tdone[4]=1;
                }
                break;
              
            }
            break;
          
          case 3 : 
            S82=3;
            S82=0;
            S54=0;
            if(!zone3P_in.isPartnerPresent() || zone3P_in.isPartnerPreempted()){//sysj/controller.sysj line: 18, column: 4
              zone3P_in.setACK(false);//sysj/controller.sysj line: 18, column: 4
              S54=1;
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            else {
              S49=0;
              if(!zone3P_in.isREQ()){//sysj/controller.sysj line: 18, column: 4
                zone3P_in.setACK(true);//sysj/controller.sysj line: 18, column: 4
                S49=1;
                if(zone3P_in.isREQ()){//sysj/controller.sysj line: 18, column: 4
                  zone3P_in.setACK(false);//sysj/controller.sysj line: 18, column: 4
                  ends[4]=2;
                  ;//sysj/controller.sysj line: 18, column: 4
                  S82=1;
                  zone3Light.setPresent();//sysj/controller.sysj line: 19, column: 4
                  currsigs.addElement(zone3Light);
                  System.out.println("Emitted zone3Light");
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
  }

  public void thread940(int [] tdone, int [] ends){
        switch(S47){
      case 0 : 
        active[3]=0;
        ends[3]=0;
        tdone[3]=1;
        break;
      
      case 1 : 
        switch(S46){
          case 0 : 
            switch(S30){
              case 0 : 
                if(!zone2P_in.isPartnerPresent() || zone2P_in.isPartnerPreempted()){//sysj/controller.sysj line: 16, column: 4
                  zone2P_in.setACK(false);//sysj/controller.sysj line: 16, column: 4
                  S30=1;
                  active[3]=1;
                  ends[3]=1;
                  tdone[3]=1;
                }
                else {
                  switch(S25){
                    case 0 : 
                      if(!zone2P_in.isREQ()){//sysj/controller.sysj line: 16, column: 4
                        zone2P_in.setACK(true);//sysj/controller.sysj line: 16, column: 4
                        S25=1;
                        if(zone2P_in.isREQ()){//sysj/controller.sysj line: 16, column: 4
                          zone2P_in.setACK(false);//sysj/controller.sysj line: 16, column: 4
                          ends[3]=2;
                          ;//sysj/controller.sysj line: 16, column: 4
                          S46=1;
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
                      if(zone2P_in.isREQ()){//sysj/controller.sysj line: 16, column: 4
                        zone2P_in.setACK(false);//sysj/controller.sysj line: 16, column: 4
                        ends[3]=2;
                        ;//sysj/controller.sysj line: 16, column: 4
                        S46=1;
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
                S30=1;
                S30=0;
                if(!zone2P_in.isPartnerPresent() || zone2P_in.isPartnerPreempted()){//sysj/controller.sysj line: 16, column: 4
                  zone2P_in.setACK(false);//sysj/controller.sysj line: 16, column: 4
                  S30=1;
                  active[3]=1;
                  ends[3]=1;
                  tdone[3]=1;
                }
                else {
                  S25=0;
                  if(!zone2P_in.isREQ()){//sysj/controller.sysj line: 16, column: 4
                    zone2P_in.setACK(true);//sysj/controller.sysj line: 16, column: 4
                    S25=1;
                    if(zone2P_in.isREQ()){//sysj/controller.sysj line: 16, column: 4
                      zone2P_in.setACK(false);//sysj/controller.sysj line: 16, column: 4
                      ends[3]=2;
                      ;//sysj/controller.sysj line: 16, column: 4
                      S46=1;
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
          
          case 1 : 
            S46=1;
            S47=0;
            active[3]=0;
            ends[3]=0;
            tdone[3]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread939(int [] tdone, int [] ends){
        switch(S23){
      case 0 : 
        active[2]=0;
        ends[2]=0;
        tdone[2]=1;
        break;
      
      case 1 : 
        switch(S6){
          case 0 : 
            if(!zone1P_in.isPartnerPresent() || zone1P_in.isPartnerPreempted()){//sysj/controller.sysj line: 12, column: 5
              zone1P_in.setACK(false);//sysj/controller.sysj line: 12, column: 5
              S6=1;
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            else {
              switch(S1){
                case 0 : 
                  if(!zone1P_in.isREQ()){//sysj/controller.sysj line: 12, column: 5
                    zone1P_in.setACK(true);//sysj/controller.sysj line: 12, column: 5
                    S1=1;
                    if(zone1P_in.isREQ()){//sysj/controller.sysj line: 12, column: 5
                      zone1P_in.setACK(false);//sysj/controller.sysj line: 12, column: 5
                      ends[2]=2;
                      ;//sysj/controller.sysj line: 12, column: 5
                      System.out.println("lights on");//sysj/controller.sysj line: 13, column: 4
                      zone1Light.setPresent();//sysj/controller.sysj line: 14, column: 4
                      currsigs.addElement(zone1Light);
                      System.out.println("Emitted zone1Light");
                      S23=0;
                      active[2]=0;
                      ends[2]=0;
                      tdone[2]=1;
                    }
                    else {
                      active[2]=1;
                      ends[2]=1;
                      tdone[2]=1;
                    }
                  }
                  else {
                    active[2]=1;
                    ends[2]=1;
                    tdone[2]=1;
                  }
                  break;
                
                case 1 : 
                  if(zone1P_in.isREQ()){//sysj/controller.sysj line: 12, column: 5
                    zone1P_in.setACK(false);//sysj/controller.sysj line: 12, column: 5
                    ends[2]=2;
                    ;//sysj/controller.sysj line: 12, column: 5
                    System.out.println("lights on");//sysj/controller.sysj line: 13, column: 4
                    zone1Light.setPresent();//sysj/controller.sysj line: 14, column: 4
                    currsigs.addElement(zone1Light);
                    System.out.println("Emitted zone1Light");
                    S23=0;
                    active[2]=0;
                    ends[2]=0;
                    tdone[2]=1;
                  }
                  else {
                    active[2]=1;
                    ends[2]=1;
                    tdone[2]=1;
                  }
                  break;
                
              }
            }
            break;
          
          case 1 : 
            S6=1;
            S6=0;
            if(!zone1P_in.isPartnerPresent() || zone1P_in.isPartnerPreempted()){//sysj/controller.sysj line: 12, column: 5
              zone1P_in.setACK(false);//sysj/controller.sysj line: 12, column: 5
              S6=1;
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            else {
              S1=0;
              if(!zone1P_in.isREQ()){//sysj/controller.sysj line: 12, column: 5
                zone1P_in.setACK(true);//sysj/controller.sysj line: 12, column: 5
                S1=1;
                if(zone1P_in.isREQ()){//sysj/controller.sysj line: 12, column: 5
                  zone1P_in.setACK(false);//sysj/controller.sysj line: 12, column: 5
                  ends[2]=2;
                  ;//sysj/controller.sysj line: 12, column: 5
                  System.out.println("lights on");//sysj/controller.sysj line: 13, column: 4
                  zone1Light.setPresent();//sysj/controller.sysj line: 14, column: 4
                  currsigs.addElement(zone1Light);
                  System.out.println("Emitted zone1Light");
                  S23=0;
                  active[2]=0;
                  ends[2]=0;
                  tdone[2]=1;
                }
                else {
                  active[2]=1;
                  ends[2]=1;
                  tdone[2]=1;
                }
              }
              else {
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

  public void thread937(int [] tdone, int [] ends){
        S292=1;
    S291=0;
    S275=0;
    if(!zone7P_in.isPartnerPresent() || zone7P_in.isPartnerPreempted()){//sysj/controller.sysj line: 29, column: 4
      zone7P_in.setACK(false);//sysj/controller.sysj line: 29, column: 4
      S275=1;
      active[8]=1;
      ends[8]=1;
      tdone[8]=1;
    }
    else {
      S270=0;
      if(!zone7P_in.isREQ()){//sysj/controller.sysj line: 29, column: 4
        zone7P_in.setACK(true);//sysj/controller.sysj line: 29, column: 4
        S270=1;
        if(zone7P_in.isREQ()){//sysj/controller.sysj line: 29, column: 4
          zone7P_in.setACK(false);//sysj/controller.sysj line: 29, column: 4
          ends[8]=2;
          ;//sysj/controller.sysj line: 29, column: 4
          S291=1;
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

  public void thread936(int [] tdone, int [] ends){
        S268=1;
    S267=0;
    S251=0;
    if(!zone6P_in.isPartnerPresent() || zone6P_in.isPartnerPreempted()){//sysj/controller.sysj line: 28, column: 4
      zone6P_in.setACK(false);//sysj/controller.sysj line: 28, column: 4
      S251=1;
      active[7]=1;
      ends[7]=1;
      tdone[7]=1;
    }
    else {
      S246=0;
      if(!zone6P_in.isREQ()){//sysj/controller.sysj line: 28, column: 4
        zone6P_in.setACK(true);//sysj/controller.sysj line: 28, column: 4
        S246=1;
        if(zone6P_in.isREQ()){//sysj/controller.sysj line: 28, column: 4
          zone6P_in.setACK(false);//sysj/controller.sysj line: 28, column: 4
          ends[7]=2;
          ;//sysj/controller.sysj line: 28, column: 4
          S267=1;
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

  public void thread935(int [] tdone, int [] ends){
        S244=1;
    S243=0;
    S227=0;
    if(!zone5P_in.isPartnerPresent() || zone5P_in.isPartnerPreempted()){//sysj/controller.sysj line: 27, column: 4
      zone5P_in.setACK(false);//sysj/controller.sysj line: 27, column: 4
      S227=1;
      active[6]=1;
      ends[6]=1;
      tdone[6]=1;
    }
    else {
      S222=0;
      if(!zone5P_in.isREQ()){//sysj/controller.sysj line: 27, column: 4
        zone5P_in.setACK(true);//sysj/controller.sysj line: 27, column: 4
        S222=1;
        if(zone5P_in.isREQ()){//sysj/controller.sysj line: 27, column: 4
          zone5P_in.setACK(false);//sysj/controller.sysj line: 27, column: 4
          ends[6]=2;
          ;//sysj/controller.sysj line: 27, column: 4
          S243=1;
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

  public void thread934(int [] tdone, int [] ends){
        S220=1;
    S219=0;
    S203=0;
    if(!zone4P_in.isPartnerPresent() || zone4P_in.isPartnerPreempted()){//sysj/controller.sysj line: 26, column: 4
      zone4P_in.setACK(false);//sysj/controller.sysj line: 26, column: 4
      S203=1;
      active[5]=1;
      ends[5]=1;
      tdone[5]=1;
    }
    else {
      S198=0;
      if(!zone4P_in.isREQ()){//sysj/controller.sysj line: 26, column: 4
        zone4P_in.setACK(true);//sysj/controller.sysj line: 26, column: 4
        S198=1;
        if(zone4P_in.isREQ()){//sysj/controller.sysj line: 26, column: 4
          zone4P_in.setACK(false);//sysj/controller.sysj line: 26, column: 4
          ends[5]=2;
          ;//sysj/controller.sysj line: 26, column: 4
          S219=1;
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

  public void thread933(int [] tdone, int [] ends){
        S196=1;
    S82=0;
    S54=0;
    if(!zone3P_in.isPartnerPresent() || zone3P_in.isPartnerPreempted()){//sysj/controller.sysj line: 18, column: 4
      zone3P_in.setACK(false);//sysj/controller.sysj line: 18, column: 4
      S54=1;
      active[4]=1;
      ends[4]=1;
      tdone[4]=1;
    }
    else {
      S49=0;
      if(!zone3P_in.isREQ()){//sysj/controller.sysj line: 18, column: 4
        zone3P_in.setACK(true);//sysj/controller.sysj line: 18, column: 4
        S49=1;
        if(zone3P_in.isREQ()){//sysj/controller.sysj line: 18, column: 4
          zone3P_in.setACK(false);//sysj/controller.sysj line: 18, column: 4
          ends[4]=2;
          ;//sysj/controller.sysj line: 18, column: 4
          S82=1;
          zone3Light.setPresent();//sysj/controller.sysj line: 19, column: 4
          currsigs.addElement(zone3Light);
          System.out.println("Emitted zone3Light");
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

  public void thread932(int [] tdone, int [] ends){
        S47=1;
    S46=0;
    S30=0;
    if(!zone2P_in.isPartnerPresent() || zone2P_in.isPartnerPreempted()){//sysj/controller.sysj line: 16, column: 4
      zone2P_in.setACK(false);//sysj/controller.sysj line: 16, column: 4
      S30=1;
      active[3]=1;
      ends[3]=1;
      tdone[3]=1;
    }
    else {
      S25=0;
      if(!zone2P_in.isREQ()){//sysj/controller.sysj line: 16, column: 4
        zone2P_in.setACK(true);//sysj/controller.sysj line: 16, column: 4
        S25=1;
        if(zone2P_in.isREQ()){//sysj/controller.sysj line: 16, column: 4
          zone2P_in.setACK(false);//sysj/controller.sysj line: 16, column: 4
          ends[3]=2;
          ;//sysj/controller.sysj line: 16, column: 4
          S46=1;
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

  public void thread931(int [] tdone, int [] ends){
        S23=1;
    S6=0;
    if(!zone1P_in.isPartnerPresent() || zone1P_in.isPartnerPreempted()){//sysj/controller.sysj line: 12, column: 5
      zone1P_in.setACK(false);//sysj/controller.sysj line: 12, column: 5
      S6=1;
      active[2]=1;
      ends[2]=1;
      tdone[2]=1;
    }
    else {
      S1=0;
      if(!zone1P_in.isREQ()){//sysj/controller.sysj line: 12, column: 5
        zone1P_in.setACK(true);//sysj/controller.sysj line: 12, column: 5
        S1=1;
        if(zone1P_in.isREQ()){//sysj/controller.sysj line: 12, column: 5
          zone1P_in.setACK(false);//sysj/controller.sysj line: 12, column: 5
          ends[2]=2;
          ;//sysj/controller.sysj line: 12, column: 5
          System.out.println("lights on");//sysj/controller.sysj line: 13, column: 4
          zone1Light.setPresent();//sysj/controller.sysj line: 14, column: 4
          currsigs.addElement(zone1Light);
          System.out.println("Emitted zone1Light");
          S23=0;
          active[2]=0;
          ends[2]=0;
          tdone[2]=1;
        }
        else {
          active[2]=1;
          ends[2]=1;
          tdone[2]=1;
        }
      }
      else {
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
      switch(S294){
        case 0 : 
          S294=0;
          break RUN;
        
        case 1 : 
          S294=2;
          S294=2;
          thread931(tdone,ends);
          thread932(tdone,ends);
          thread933(tdone,ends);
          thread934(tdone,ends);
          thread935(tdone,ends);
          thread936(tdone,ends);
          thread937(tdone,ends);
          int biggest938 = 0;
          if(ends[2]>=biggest938){
            biggest938=ends[2];
          }
          if(ends[3]>=biggest938){
            biggest938=ends[3];
          }
          if(ends[4]>=biggest938){
            biggest938=ends[4];
          }
          if(ends[5]>=biggest938){
            biggest938=ends[5];
          }
          if(ends[6]>=biggest938){
            biggest938=ends[6];
          }
          if(ends[7]>=biggest938){
            biggest938=ends[7];
          }
          if(ends[8]>=biggest938){
            biggest938=ends[8];
          }
          if(biggest938 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
        
        case 2 : 
          thread939(tdone,ends);
          thread940(tdone,ends);
          thread941(tdone,ends);
          thread942(tdone,ends);
          thread943(tdone,ends);
          thread944(tdone,ends);
          thread945(tdone,ends);
          int biggest946 = 0;
          if(ends[2]>=biggest946){
            biggest946=ends[2];
          }
          if(ends[3]>=biggest946){
            biggest946=ends[3];
          }
          if(ends[4]>=biggest946){
            biggest946=ends[4];
          }
          if(ends[5]>=biggest946){
            biggest946=ends[5];
          }
          if(ends[6]>=biggest946){
            biggest946=ends[6];
          }
          if(ends[7]>=biggest946){
            biggest946=ends[7];
          }
          if(ends[8]>=biggest946){
            biggest946=ends[8];
          }
          if(biggest946 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
          //FINXME code
          if(biggest946 == 0){
            S294=0;
            active[1]=0;
            ends[1]=0;
            S294=0;
            break RUN;
          }
        
      }
    }
  }

  public void init(){
    char [] active1 = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
    char [] paused1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    char [] suspended1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    paused = paused1;
    active = active1;
    suspended = suspended1;
    // Now instantiate all the local signals ONLY
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
          zone1P_in.gethook();
          zone2P_in.gethook();
          zone3P_in.gethook();
          zone4P_in.gethook();
          zone5P_in.gethook();
          zone6P_in.gethook();
          zone7P_in.gethook();
          df = true;
        }
        runClockDomain();
      }
      zone1Light.setpreclear();
      zone2Light.setpreclear();
      zone3Light.setpreclear();
      zone4Light.setpreclear();
      zone5Light.setpreclear();
      zone6Light.setpreclear();
      zone7Light.setpreclear();
      int dummyint = 0;
      for(int qw=0;qw<currsigs.size();++qw){
        dummyint = ((Signal)currsigs.elementAt(qw)).getStatus() ? ((Signal)currsigs.elementAt(qw)).setprepresent() : ((Signal)currsigs.elementAt(qw)).setpreclear();
        ((Signal)currsigs.elementAt(qw)).setpreval(((Signal)currsigs.elementAt(qw)).getValue());
      }
      currsigs.removeAllElements();
      zone1Light.sethook();
      zone1Light.setClear();
      zone2Light.sethook();
      zone2Light.setClear();
      zone3Light.sethook();
      zone3Light.setClear();
      zone4Light.sethook();
      zone4Light.setClear();
      zone5Light.sethook();
      zone5Light.setClear();
      zone6Light.sethook();
      zone6Light.setClear();
      zone7Light.sethook();
      zone7Light.setClear();
      zone1P_in.sethook();
      zone2P_in.sethook();
      zone3P_in.sethook();
      zone4P_in.sethook();
      zone5P_in.sethook();
      zone6P_in.sethook();
      zone7P_in.sethook();
      if(paused[1]!=0 || suspended[1]!=0 || active[1]!=1);
      else{
        zone1P_in.gethook();
        zone2P_in.gethook();
        zone3P_in.gethook();
        zone4P_in.gethook();
        zone5P_in.gethook();
        zone6P_in.gethook();
        zone7P_in.gethook();
      }
      runFinisher();
      if(active[1] == 0){
      	this.terminated = true;
      }
      if(!threaded) break;
    }
  }
}
