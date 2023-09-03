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
  public Signal zone1light = new Signal("zone1light", Signal.OUTPUT);
  public Signal zone2light = new Signal("zone2light", Signal.OUTPUT);
  public Signal zone3light = new Signal("zone3light", Signal.OUTPUT);
  public Signal zone4light = new Signal("zone4light", Signal.OUTPUT);
  public Signal zone5light = new Signal("zone5light", Signal.OUTPUT);
  public Signal zone6light = new Signal("zone6light", Signal.OUTPUT);
  public Signal zone7light = new Signal("zone7light", Signal.OUTPUT);
  public input_Channel zone1P_in = new input_Channel();
  public input_Channel zone2P_in = new input_Channel();
  public input_Channel zone3P_in = new input_Channel();
  public input_Channel zone4P_in = new input_Channel();
  public input_Channel zone5P_in = new input_Channel();
  public input_Channel zone6P_in = new input_Channel();
  public input_Channel zone7P_in = new input_Channel();
  private int S505 = 1;
  private int S23 = 1;
  private int S22 = 1;
  private int S6 = 1;
  private int S1 = 1;
  private int S47 = 1;
  private int S46 = 1;
  private int S30 = 1;
  private int S25 = 1;
  private int S71 = 1;
  private int S70 = 1;
  private int S54 = 1;
  private int S49 = 1;
  private int S95 = 1;
  private int S94 = 1;
  private int S78 = 1;
  private int S73 = 1;
  private int S119 = 1;
  private int S118 = 1;
  private int S102 = 1;
  private int S97 = 1;
  private int S143 = 1;
  private int S142 = 1;
  private int S126 = 1;
  private int S121 = 1;
  private int S167 = 1;
  private int S166 = 1;
  private int S150 = 1;
  private int S145 = 1;
  
  private int[] ends = new int[10];
  private int[] tdone = new int[10];
  
  public void thread768(int [] tdone, int [] ends){
        S167=1;
    S166=0;
    S150=0;
    if(!zone7P_in.isPartnerPresent() || zone7P_in.isPartnerPreempted()){//sysj/controller.sysj line: 22, column: 5
      zone7P_in.setACK(false);//sysj/controller.sysj line: 22, column: 5
      S150=1;
      active[8]=1;
      ends[8]=1;
      tdone[8]=1;
    }
    else {
      S145=0;
      if(!zone7P_in.isREQ()){//sysj/controller.sysj line: 22, column: 5
        zone7P_in.setACK(true);//sysj/controller.sysj line: 22, column: 5
        S145=1;
        if(zone7P_in.isREQ()){//sysj/controller.sysj line: 22, column: 5
          zone7P_in.setACK(false);//sysj/controller.sysj line: 22, column: 5
          ends[8]=2;
          ;//sysj/controller.sysj line: 22, column: 5
          S166=1;
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

  public void thread767(int [] tdone, int [] ends){
        S143=1;
    S142=0;
    S126=0;
    if(!zone6P_in.isPartnerPresent() || zone6P_in.isPartnerPreempted()){//sysj/controller.sysj line: 21, column: 5
      zone6P_in.setACK(false);//sysj/controller.sysj line: 21, column: 5
      S126=1;
      active[7]=1;
      ends[7]=1;
      tdone[7]=1;
    }
    else {
      S121=0;
      if(!zone6P_in.isREQ()){//sysj/controller.sysj line: 21, column: 5
        zone6P_in.setACK(true);//sysj/controller.sysj line: 21, column: 5
        S121=1;
        if(zone6P_in.isREQ()){//sysj/controller.sysj line: 21, column: 5
          zone6P_in.setACK(false);//sysj/controller.sysj line: 21, column: 5
          ends[7]=2;
          ;//sysj/controller.sysj line: 21, column: 5
          S142=1;
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

  public void thread766(int [] tdone, int [] ends){
        S119=1;
    S118=0;
    S102=0;
    if(!zone5P_in.isPartnerPresent() || zone5P_in.isPartnerPreempted()){//sysj/controller.sysj line: 20, column: 5
      zone5P_in.setACK(false);//sysj/controller.sysj line: 20, column: 5
      S102=1;
      active[6]=1;
      ends[6]=1;
      tdone[6]=1;
    }
    else {
      S97=0;
      if(!zone5P_in.isREQ()){//sysj/controller.sysj line: 20, column: 5
        zone5P_in.setACK(true);//sysj/controller.sysj line: 20, column: 5
        S97=1;
        if(zone5P_in.isREQ()){//sysj/controller.sysj line: 20, column: 5
          zone5P_in.setACK(false);//sysj/controller.sysj line: 20, column: 5
          ends[6]=2;
          ;//sysj/controller.sysj line: 20, column: 5
          S118=1;
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

  public void thread765(int [] tdone, int [] ends){
        S95=1;
    S94=0;
    S78=0;
    if(!zone4P_in.isPartnerPresent() || zone4P_in.isPartnerPreempted()){//sysj/controller.sysj line: 19, column: 5
      zone4P_in.setACK(false);//sysj/controller.sysj line: 19, column: 5
      S78=1;
      active[5]=1;
      ends[5]=1;
      tdone[5]=1;
    }
    else {
      S73=0;
      if(!zone4P_in.isREQ()){//sysj/controller.sysj line: 19, column: 5
        zone4P_in.setACK(true);//sysj/controller.sysj line: 19, column: 5
        S73=1;
        if(zone4P_in.isREQ()){//sysj/controller.sysj line: 19, column: 5
          zone4P_in.setACK(false);//sysj/controller.sysj line: 19, column: 5
          ends[5]=2;
          ;//sysj/controller.sysj line: 19, column: 5
          S94=1;
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

  public void thread764(int [] tdone, int [] ends){
        S71=1;
    S70=0;
    S54=0;
    if(!zone3P_in.isPartnerPresent() || zone3P_in.isPartnerPreempted()){//sysj/controller.sysj line: 14, column: 5
      zone3P_in.setACK(false);//sysj/controller.sysj line: 14, column: 5
      S54=1;
      active[4]=1;
      ends[4]=1;
      tdone[4]=1;
    }
    else {
      S49=0;
      if(!zone3P_in.isREQ()){//sysj/controller.sysj line: 14, column: 5
        zone3P_in.setACK(true);//sysj/controller.sysj line: 14, column: 5
        S49=1;
        if(zone3P_in.isREQ()){//sysj/controller.sysj line: 14, column: 5
          zone3P_in.setACK(false);//sysj/controller.sysj line: 14, column: 5
          ends[4]=2;
          ;//sysj/controller.sysj line: 14, column: 5
          System.out.println("lights on");//sysj/controller.sysj line: 15, column: 5
          S70=1;
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

  public void thread763(int [] tdone, int [] ends){
        S47=1;
    S46=0;
    S30=0;
    if(!zone2P_in.isPartnerPresent() || zone2P_in.isPartnerPreempted()){//sysj/controller.sysj line: 13, column: 5
      zone2P_in.setACK(false);//sysj/controller.sysj line: 13, column: 5
      S30=1;
      active[3]=1;
      ends[3]=1;
      tdone[3]=1;
    }
    else {
      S25=0;
      if(!zone2P_in.isREQ()){//sysj/controller.sysj line: 13, column: 5
        zone2P_in.setACK(true);//sysj/controller.sysj line: 13, column: 5
        S25=1;
        if(zone2P_in.isREQ()){//sysj/controller.sysj line: 13, column: 5
          zone2P_in.setACK(false);//sysj/controller.sysj line: 13, column: 5
          ends[3]=2;
          ;//sysj/controller.sysj line: 13, column: 5
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

  public void thread762(int [] tdone, int [] ends){
        S23=1;
    S22=0;
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
          S22=1;
          active[2]=1;
          ends[2]=1;
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

  public void thread760(int [] tdone, int [] ends){
        switch(S167){
      case 0 : 
        active[8]=0;
        ends[8]=0;
        tdone[8]=1;
        break;
      
      case 1 : 
        switch(S166){
          case 0 : 
            switch(S150){
              case 0 : 
                if(!zone7P_in.isPartnerPresent() || zone7P_in.isPartnerPreempted()){//sysj/controller.sysj line: 22, column: 5
                  zone7P_in.setACK(false);//sysj/controller.sysj line: 22, column: 5
                  S150=1;
                  active[8]=1;
                  ends[8]=1;
                  tdone[8]=1;
                }
                else {
                  switch(S145){
                    case 0 : 
                      if(!zone7P_in.isREQ()){//sysj/controller.sysj line: 22, column: 5
                        zone7P_in.setACK(true);//sysj/controller.sysj line: 22, column: 5
                        S145=1;
                        if(zone7P_in.isREQ()){//sysj/controller.sysj line: 22, column: 5
                          zone7P_in.setACK(false);//sysj/controller.sysj line: 22, column: 5
                          ends[8]=2;
                          ;//sysj/controller.sysj line: 22, column: 5
                          S166=1;
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
                      if(zone7P_in.isREQ()){//sysj/controller.sysj line: 22, column: 5
                        zone7P_in.setACK(false);//sysj/controller.sysj line: 22, column: 5
                        ends[8]=2;
                        ;//sysj/controller.sysj line: 22, column: 5
                        S166=1;
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
                S150=1;
                S150=0;
                if(!zone7P_in.isPartnerPresent() || zone7P_in.isPartnerPreempted()){//sysj/controller.sysj line: 22, column: 5
                  zone7P_in.setACK(false);//sysj/controller.sysj line: 22, column: 5
                  S150=1;
                  active[8]=1;
                  ends[8]=1;
                  tdone[8]=1;
                }
                else {
                  S145=0;
                  if(!zone7P_in.isREQ()){//sysj/controller.sysj line: 22, column: 5
                    zone7P_in.setACK(true);//sysj/controller.sysj line: 22, column: 5
                    S145=1;
                    if(zone7P_in.isREQ()){//sysj/controller.sysj line: 22, column: 5
                      zone7P_in.setACK(false);//sysj/controller.sysj line: 22, column: 5
                      ends[8]=2;
                      ;//sysj/controller.sysj line: 22, column: 5
                      S166=1;
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
            S166=1;
            S167=0;
            active[8]=0;
            ends[8]=0;
            tdone[8]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread759(int [] tdone, int [] ends){
        switch(S143){
      case 0 : 
        active[7]=0;
        ends[7]=0;
        tdone[7]=1;
        break;
      
      case 1 : 
        switch(S142){
          case 0 : 
            switch(S126){
              case 0 : 
                if(!zone6P_in.isPartnerPresent() || zone6P_in.isPartnerPreempted()){//sysj/controller.sysj line: 21, column: 5
                  zone6P_in.setACK(false);//sysj/controller.sysj line: 21, column: 5
                  S126=1;
                  active[7]=1;
                  ends[7]=1;
                  tdone[7]=1;
                }
                else {
                  switch(S121){
                    case 0 : 
                      if(!zone6P_in.isREQ()){//sysj/controller.sysj line: 21, column: 5
                        zone6P_in.setACK(true);//sysj/controller.sysj line: 21, column: 5
                        S121=1;
                        if(zone6P_in.isREQ()){//sysj/controller.sysj line: 21, column: 5
                          zone6P_in.setACK(false);//sysj/controller.sysj line: 21, column: 5
                          ends[7]=2;
                          ;//sysj/controller.sysj line: 21, column: 5
                          S142=1;
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
                      if(zone6P_in.isREQ()){//sysj/controller.sysj line: 21, column: 5
                        zone6P_in.setACK(false);//sysj/controller.sysj line: 21, column: 5
                        ends[7]=2;
                        ;//sysj/controller.sysj line: 21, column: 5
                        S142=1;
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
                S126=1;
                S126=0;
                if(!zone6P_in.isPartnerPresent() || zone6P_in.isPartnerPreempted()){//sysj/controller.sysj line: 21, column: 5
                  zone6P_in.setACK(false);//sysj/controller.sysj line: 21, column: 5
                  S126=1;
                  active[7]=1;
                  ends[7]=1;
                  tdone[7]=1;
                }
                else {
                  S121=0;
                  if(!zone6P_in.isREQ()){//sysj/controller.sysj line: 21, column: 5
                    zone6P_in.setACK(true);//sysj/controller.sysj line: 21, column: 5
                    S121=1;
                    if(zone6P_in.isREQ()){//sysj/controller.sysj line: 21, column: 5
                      zone6P_in.setACK(false);//sysj/controller.sysj line: 21, column: 5
                      ends[7]=2;
                      ;//sysj/controller.sysj line: 21, column: 5
                      S142=1;
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
            S142=1;
            S143=0;
            active[7]=0;
            ends[7]=0;
            tdone[7]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread758(int [] tdone, int [] ends){
        switch(S119){
      case 0 : 
        active[6]=0;
        ends[6]=0;
        tdone[6]=1;
        break;
      
      case 1 : 
        switch(S118){
          case 0 : 
            switch(S102){
              case 0 : 
                if(!zone5P_in.isPartnerPresent() || zone5P_in.isPartnerPreempted()){//sysj/controller.sysj line: 20, column: 5
                  zone5P_in.setACK(false);//sysj/controller.sysj line: 20, column: 5
                  S102=1;
                  active[6]=1;
                  ends[6]=1;
                  tdone[6]=1;
                }
                else {
                  switch(S97){
                    case 0 : 
                      if(!zone5P_in.isREQ()){//sysj/controller.sysj line: 20, column: 5
                        zone5P_in.setACK(true);//sysj/controller.sysj line: 20, column: 5
                        S97=1;
                        if(zone5P_in.isREQ()){//sysj/controller.sysj line: 20, column: 5
                          zone5P_in.setACK(false);//sysj/controller.sysj line: 20, column: 5
                          ends[6]=2;
                          ;//sysj/controller.sysj line: 20, column: 5
                          S118=1;
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
                      if(zone5P_in.isREQ()){//sysj/controller.sysj line: 20, column: 5
                        zone5P_in.setACK(false);//sysj/controller.sysj line: 20, column: 5
                        ends[6]=2;
                        ;//sysj/controller.sysj line: 20, column: 5
                        S118=1;
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
                S102=1;
                S102=0;
                if(!zone5P_in.isPartnerPresent() || zone5P_in.isPartnerPreempted()){//sysj/controller.sysj line: 20, column: 5
                  zone5P_in.setACK(false);//sysj/controller.sysj line: 20, column: 5
                  S102=1;
                  active[6]=1;
                  ends[6]=1;
                  tdone[6]=1;
                }
                else {
                  S97=0;
                  if(!zone5P_in.isREQ()){//sysj/controller.sysj line: 20, column: 5
                    zone5P_in.setACK(true);//sysj/controller.sysj line: 20, column: 5
                    S97=1;
                    if(zone5P_in.isREQ()){//sysj/controller.sysj line: 20, column: 5
                      zone5P_in.setACK(false);//sysj/controller.sysj line: 20, column: 5
                      ends[6]=2;
                      ;//sysj/controller.sysj line: 20, column: 5
                      S118=1;
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
            S118=1;
            S119=0;
            active[6]=0;
            ends[6]=0;
            tdone[6]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread757(int [] tdone, int [] ends){
        switch(S95){
      case 0 : 
        active[5]=0;
        ends[5]=0;
        tdone[5]=1;
        break;
      
      case 1 : 
        switch(S94){
          case 0 : 
            switch(S78){
              case 0 : 
                if(!zone4P_in.isPartnerPresent() || zone4P_in.isPartnerPreempted()){//sysj/controller.sysj line: 19, column: 5
                  zone4P_in.setACK(false);//sysj/controller.sysj line: 19, column: 5
                  S78=1;
                  active[5]=1;
                  ends[5]=1;
                  tdone[5]=1;
                }
                else {
                  switch(S73){
                    case 0 : 
                      if(!zone4P_in.isREQ()){//sysj/controller.sysj line: 19, column: 5
                        zone4P_in.setACK(true);//sysj/controller.sysj line: 19, column: 5
                        S73=1;
                        if(zone4P_in.isREQ()){//sysj/controller.sysj line: 19, column: 5
                          zone4P_in.setACK(false);//sysj/controller.sysj line: 19, column: 5
                          ends[5]=2;
                          ;//sysj/controller.sysj line: 19, column: 5
                          S94=1;
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
                      if(zone4P_in.isREQ()){//sysj/controller.sysj line: 19, column: 5
                        zone4P_in.setACK(false);//sysj/controller.sysj line: 19, column: 5
                        ends[5]=2;
                        ;//sysj/controller.sysj line: 19, column: 5
                        S94=1;
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
                S78=1;
                S78=0;
                if(!zone4P_in.isPartnerPresent() || zone4P_in.isPartnerPreempted()){//sysj/controller.sysj line: 19, column: 5
                  zone4P_in.setACK(false);//sysj/controller.sysj line: 19, column: 5
                  S78=1;
                  active[5]=1;
                  ends[5]=1;
                  tdone[5]=1;
                }
                else {
                  S73=0;
                  if(!zone4P_in.isREQ()){//sysj/controller.sysj line: 19, column: 5
                    zone4P_in.setACK(true);//sysj/controller.sysj line: 19, column: 5
                    S73=1;
                    if(zone4P_in.isREQ()){//sysj/controller.sysj line: 19, column: 5
                      zone4P_in.setACK(false);//sysj/controller.sysj line: 19, column: 5
                      ends[5]=2;
                      ;//sysj/controller.sysj line: 19, column: 5
                      S94=1;
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
            S94=1;
            S95=0;
            active[5]=0;
            ends[5]=0;
            tdone[5]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread756(int [] tdone, int [] ends){
        switch(S71){
      case 0 : 
        active[4]=0;
        ends[4]=0;
        tdone[4]=1;
        break;
      
      case 1 : 
        switch(S70){
          case 0 : 
            switch(S54){
              case 0 : 
                if(!zone3P_in.isPartnerPresent() || zone3P_in.isPartnerPreempted()){//sysj/controller.sysj line: 14, column: 5
                  zone3P_in.setACK(false);//sysj/controller.sysj line: 14, column: 5
                  S54=1;
                  active[4]=1;
                  ends[4]=1;
                  tdone[4]=1;
                }
                else {
                  switch(S49){
                    case 0 : 
                      if(!zone3P_in.isREQ()){//sysj/controller.sysj line: 14, column: 5
                        zone3P_in.setACK(true);//sysj/controller.sysj line: 14, column: 5
                        S49=1;
                        if(zone3P_in.isREQ()){//sysj/controller.sysj line: 14, column: 5
                          zone3P_in.setACK(false);//sysj/controller.sysj line: 14, column: 5
                          ends[4]=2;
                          ;//sysj/controller.sysj line: 14, column: 5
                          System.out.println("lights on");//sysj/controller.sysj line: 15, column: 5
                          S70=1;
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
                      if(zone3P_in.isREQ()){//sysj/controller.sysj line: 14, column: 5
                        zone3P_in.setACK(false);//sysj/controller.sysj line: 14, column: 5
                        ends[4]=2;
                        ;//sysj/controller.sysj line: 14, column: 5
                        System.out.println("lights on");//sysj/controller.sysj line: 15, column: 5
                        S70=1;
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
                if(!zone3P_in.isPartnerPresent() || zone3P_in.isPartnerPreempted()){//sysj/controller.sysj line: 14, column: 5
                  zone3P_in.setACK(false);//sysj/controller.sysj line: 14, column: 5
                  S54=1;
                  active[4]=1;
                  ends[4]=1;
                  tdone[4]=1;
                }
                else {
                  S49=0;
                  if(!zone3P_in.isREQ()){//sysj/controller.sysj line: 14, column: 5
                    zone3P_in.setACK(true);//sysj/controller.sysj line: 14, column: 5
                    S49=1;
                    if(zone3P_in.isREQ()){//sysj/controller.sysj line: 14, column: 5
                      zone3P_in.setACK(false);//sysj/controller.sysj line: 14, column: 5
                      ends[4]=2;
                      ;//sysj/controller.sysj line: 14, column: 5
                      System.out.println("lights on");//sysj/controller.sysj line: 15, column: 5
                      S70=1;
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
            S70=1;
            S71=0;
            active[4]=0;
            ends[4]=0;
            tdone[4]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread755(int [] tdone, int [] ends){
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
                if(!zone2P_in.isPartnerPresent() || zone2P_in.isPartnerPreempted()){//sysj/controller.sysj line: 13, column: 5
                  zone2P_in.setACK(false);//sysj/controller.sysj line: 13, column: 5
                  S30=1;
                  active[3]=1;
                  ends[3]=1;
                  tdone[3]=1;
                }
                else {
                  switch(S25){
                    case 0 : 
                      if(!zone2P_in.isREQ()){//sysj/controller.sysj line: 13, column: 5
                        zone2P_in.setACK(true);//sysj/controller.sysj line: 13, column: 5
                        S25=1;
                        if(zone2P_in.isREQ()){//sysj/controller.sysj line: 13, column: 5
                          zone2P_in.setACK(false);//sysj/controller.sysj line: 13, column: 5
                          ends[3]=2;
                          ;//sysj/controller.sysj line: 13, column: 5
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
                      if(zone2P_in.isREQ()){//sysj/controller.sysj line: 13, column: 5
                        zone2P_in.setACK(false);//sysj/controller.sysj line: 13, column: 5
                        ends[3]=2;
                        ;//sysj/controller.sysj line: 13, column: 5
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
                if(!zone2P_in.isPartnerPresent() || zone2P_in.isPartnerPreempted()){//sysj/controller.sysj line: 13, column: 5
                  zone2P_in.setACK(false);//sysj/controller.sysj line: 13, column: 5
                  S30=1;
                  active[3]=1;
                  ends[3]=1;
                  tdone[3]=1;
                }
                else {
                  S25=0;
                  if(!zone2P_in.isREQ()){//sysj/controller.sysj line: 13, column: 5
                    zone2P_in.setACK(true);//sysj/controller.sysj line: 13, column: 5
                    S25=1;
                    if(zone2P_in.isREQ()){//sysj/controller.sysj line: 13, column: 5
                      zone2P_in.setACK(false);//sysj/controller.sysj line: 13, column: 5
                      ends[3]=2;
                      ;//sysj/controller.sysj line: 13, column: 5
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

  public void thread754(int [] tdone, int [] ends){
        switch(S23){
      case 0 : 
        active[2]=0;
        ends[2]=0;
        tdone[2]=1;
        break;
      
      case 1 : 
        switch(S22){
          case 0 : 
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
                          S22=1;
                          active[2]=1;
                          ends[2]=1;
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
                        S22=1;
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
                      S22=1;
                      active[2]=1;
                      ends[2]=1;
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
          
          case 1 : 
            S22=1;
            S23=0;
            active[2]=0;
            ends[2]=0;
            tdone[2]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread752(int [] tdone, int [] ends){
        S167=1;
    S166=0;
    S150=0;
    if(!zone7P_in.isPartnerPresent() || zone7P_in.isPartnerPreempted()){//sysj/controller.sysj line: 22, column: 5
      zone7P_in.setACK(false);//sysj/controller.sysj line: 22, column: 5
      S150=1;
      active[8]=1;
      ends[8]=1;
      tdone[8]=1;
    }
    else {
      S145=0;
      if(!zone7P_in.isREQ()){//sysj/controller.sysj line: 22, column: 5
        zone7P_in.setACK(true);//sysj/controller.sysj line: 22, column: 5
        S145=1;
        if(zone7P_in.isREQ()){//sysj/controller.sysj line: 22, column: 5
          zone7P_in.setACK(false);//sysj/controller.sysj line: 22, column: 5
          ends[8]=2;
          ;//sysj/controller.sysj line: 22, column: 5
          S166=1;
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

  public void thread751(int [] tdone, int [] ends){
        S143=1;
    S142=0;
    S126=0;
    if(!zone6P_in.isPartnerPresent() || zone6P_in.isPartnerPreempted()){//sysj/controller.sysj line: 21, column: 5
      zone6P_in.setACK(false);//sysj/controller.sysj line: 21, column: 5
      S126=1;
      active[7]=1;
      ends[7]=1;
      tdone[7]=1;
    }
    else {
      S121=0;
      if(!zone6P_in.isREQ()){//sysj/controller.sysj line: 21, column: 5
        zone6P_in.setACK(true);//sysj/controller.sysj line: 21, column: 5
        S121=1;
        if(zone6P_in.isREQ()){//sysj/controller.sysj line: 21, column: 5
          zone6P_in.setACK(false);//sysj/controller.sysj line: 21, column: 5
          ends[7]=2;
          ;//sysj/controller.sysj line: 21, column: 5
          S142=1;
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

  public void thread750(int [] tdone, int [] ends){
        S119=1;
    S118=0;
    S102=0;
    if(!zone5P_in.isPartnerPresent() || zone5P_in.isPartnerPreempted()){//sysj/controller.sysj line: 20, column: 5
      zone5P_in.setACK(false);//sysj/controller.sysj line: 20, column: 5
      S102=1;
      active[6]=1;
      ends[6]=1;
      tdone[6]=1;
    }
    else {
      S97=0;
      if(!zone5P_in.isREQ()){//sysj/controller.sysj line: 20, column: 5
        zone5P_in.setACK(true);//sysj/controller.sysj line: 20, column: 5
        S97=1;
        if(zone5P_in.isREQ()){//sysj/controller.sysj line: 20, column: 5
          zone5P_in.setACK(false);//sysj/controller.sysj line: 20, column: 5
          ends[6]=2;
          ;//sysj/controller.sysj line: 20, column: 5
          S118=1;
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

  public void thread749(int [] tdone, int [] ends){
        S95=1;
    S94=0;
    S78=0;
    if(!zone4P_in.isPartnerPresent() || zone4P_in.isPartnerPreempted()){//sysj/controller.sysj line: 19, column: 5
      zone4P_in.setACK(false);//sysj/controller.sysj line: 19, column: 5
      S78=1;
      active[5]=1;
      ends[5]=1;
      tdone[5]=1;
    }
    else {
      S73=0;
      if(!zone4P_in.isREQ()){//sysj/controller.sysj line: 19, column: 5
        zone4P_in.setACK(true);//sysj/controller.sysj line: 19, column: 5
        S73=1;
        if(zone4P_in.isREQ()){//sysj/controller.sysj line: 19, column: 5
          zone4P_in.setACK(false);//sysj/controller.sysj line: 19, column: 5
          ends[5]=2;
          ;//sysj/controller.sysj line: 19, column: 5
          S94=1;
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

  public void thread748(int [] tdone, int [] ends){
        S71=1;
    S70=0;
    S54=0;
    if(!zone3P_in.isPartnerPresent() || zone3P_in.isPartnerPreempted()){//sysj/controller.sysj line: 14, column: 5
      zone3P_in.setACK(false);//sysj/controller.sysj line: 14, column: 5
      S54=1;
      active[4]=1;
      ends[4]=1;
      tdone[4]=1;
    }
    else {
      S49=0;
      if(!zone3P_in.isREQ()){//sysj/controller.sysj line: 14, column: 5
        zone3P_in.setACK(true);//sysj/controller.sysj line: 14, column: 5
        S49=1;
        if(zone3P_in.isREQ()){//sysj/controller.sysj line: 14, column: 5
          zone3P_in.setACK(false);//sysj/controller.sysj line: 14, column: 5
          ends[4]=2;
          ;//sysj/controller.sysj line: 14, column: 5
          System.out.println("lights on");//sysj/controller.sysj line: 15, column: 5
          S70=1;
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

  public void thread747(int [] tdone, int [] ends){
        S47=1;
    S46=0;
    S30=0;
    if(!zone2P_in.isPartnerPresent() || zone2P_in.isPartnerPreempted()){//sysj/controller.sysj line: 13, column: 5
      zone2P_in.setACK(false);//sysj/controller.sysj line: 13, column: 5
      S30=1;
      active[3]=1;
      ends[3]=1;
      tdone[3]=1;
    }
    else {
      S25=0;
      if(!zone2P_in.isREQ()){//sysj/controller.sysj line: 13, column: 5
        zone2P_in.setACK(true);//sysj/controller.sysj line: 13, column: 5
        S25=1;
        if(zone2P_in.isREQ()){//sysj/controller.sysj line: 13, column: 5
          zone2P_in.setACK(false);//sysj/controller.sysj line: 13, column: 5
          ends[3]=2;
          ;//sysj/controller.sysj line: 13, column: 5
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

  public void thread746(int [] tdone, int [] ends){
        S23=1;
    S22=0;
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
          S22=1;
          active[2]=1;
          ends[2]=1;
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
      switch(S505){
        case 0 : 
          S505=0;
          break RUN;
        
        case 1 : 
          S505=2;
          S505=2;
          thread746(tdone,ends);
          thread747(tdone,ends);
          thread748(tdone,ends);
          thread749(tdone,ends);
          thread750(tdone,ends);
          thread751(tdone,ends);
          thread752(tdone,ends);
          int biggest753 = 0;
          if(ends[2]>=biggest753){
            biggest753=ends[2];
          }
          if(ends[3]>=biggest753){
            biggest753=ends[3];
          }
          if(ends[4]>=biggest753){
            biggest753=ends[4];
          }
          if(ends[5]>=biggest753){
            biggest753=ends[5];
          }
          if(ends[6]>=biggest753){
            biggest753=ends[6];
          }
          if(ends[7]>=biggest753){
            biggest753=ends[7];
          }
          if(ends[8]>=biggest753){
            biggest753=ends[8];
          }
          if(biggest753 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
        
        case 2 : 
          thread754(tdone,ends);
          thread755(tdone,ends);
          thread756(tdone,ends);
          thread757(tdone,ends);
          thread758(tdone,ends);
          thread759(tdone,ends);
          thread760(tdone,ends);
          int biggest761 = 0;
          if(ends[2]>=biggest761){
            biggest761=ends[2];
          }
          if(ends[3]>=biggest761){
            biggest761=ends[3];
          }
          if(ends[4]>=biggest761){
            biggest761=ends[4];
          }
          if(ends[5]>=biggest761){
            biggest761=ends[5];
          }
          if(ends[6]>=biggest761){
            biggest761=ends[6];
          }
          if(ends[7]>=biggest761){
            biggest761=ends[7];
          }
          if(ends[8]>=biggest761){
            biggest761=ends[8];
          }
          if(biggest761 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
          //FINXME code
          if(biggest761 == 0){
            thread762(tdone,ends);
            thread763(tdone,ends);
            thread764(tdone,ends);
            thread765(tdone,ends);
            thread766(tdone,ends);
            thread767(tdone,ends);
            thread768(tdone,ends);
            int biggest769 = 0;
            if(ends[2]>=biggest769){
              biggest769=ends[2];
            }
            if(ends[3]>=biggest769){
              biggest769=ends[3];
            }
            if(ends[4]>=biggest769){
              biggest769=ends[4];
            }
            if(ends[5]>=biggest769){
              biggest769=ends[5];
            }
            if(ends[6]>=biggest769){
              biggest769=ends[6];
            }
            if(ends[7]>=biggest769){
              biggest769=ends[7];
            }
            if(ends[8]>=biggest769){
              biggest769=ends[8];
            }
            if(biggest769 == 1){
              active[1]=1;
              ends[1]=1;
              break RUN;
            }
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
      zone1light.setpreclear();
      zone2light.setpreclear();
      zone3light.setpreclear();
      zone4light.setpreclear();
      zone5light.setpreclear();
      zone6light.setpreclear();
      zone7light.setpreclear();
      int dummyint = 0;
      for(int qw=0;qw<currsigs.size();++qw){
        dummyint = ((Signal)currsigs.elementAt(qw)).getStatus() ? ((Signal)currsigs.elementAt(qw)).setprepresent() : ((Signal)currsigs.elementAt(qw)).setpreclear();
        ((Signal)currsigs.elementAt(qw)).setpreval(((Signal)currsigs.elementAt(qw)).getValue());
      }
      currsigs.removeAllElements();
      zone1light.sethook();
      zone1light.setClear();
      zone2light.sethook();
      zone2light.setClear();
      zone3light.sethook();
      zone3light.setClear();
      zone4light.sethook();
      zone4light.setClear();
      zone5light.sethook();
      zone5light.setClear();
      zone6light.sethook();
      zone6light.setClear();
      zone7light.sethook();
      zone7light.setClear();
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
