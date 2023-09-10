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
  private int S311 = 1;
  private int S94 = 1;
  private int S22 = 1;
  private int S6 = 1;
  private int S1 = 1;
  private int S26 = 1;
  private int S118 = 1;
  private int S117 = 1;
  private int S101 = 1;
  private int S96 = 1;
  private int S213 = 1;
  private int S141 = 1;
  private int S125 = 1;
  private int S120 = 1;
  private int S145 = 1;
  private int S237 = 1;
  private int S236 = 1;
  private int S220 = 1;
  private int S215 = 1;
  private int S261 = 1;
  private int S260 = 1;
  private int S244 = 1;
  private int S239 = 1;
  private int S285 = 1;
  private int S284 = 1;
  private int S268 = 1;
  private int S263 = 1;
  private int S309 = 1;
  private int S308 = 1;
  private int S292 = 1;
  private int S287 = 1;
  
  private int[] ends = new int[12];
  private int[] tdone = new int[12];
  
  public void thread2003(int [] tdone, int [] ends){
        switch(S309){
      case 0 : 
        active[8]=0;
        ends[8]=0;
        tdone[8]=1;
        break;
      
      case 1 : 
        switch(S308){
          case 0 : 
            switch(S292){
              case 0 : 
                if(!zone7P_in.isPartnerPresent() || zone7P_in.isPartnerPreempted()){//sysj/controller.sysj line: 54, column: 4
                  zone7P_in.setACK(false);//sysj/controller.sysj line: 54, column: 4
                  S292=1;
                  active[8]=1;
                  ends[8]=1;
                  tdone[8]=1;
                }
                else {
                  switch(S287){
                    case 0 : 
                      if(!zone7P_in.isREQ()){//sysj/controller.sysj line: 54, column: 4
                        zone7P_in.setACK(true);//sysj/controller.sysj line: 54, column: 4
                        S287=1;
                        if(zone7P_in.isREQ()){//sysj/controller.sysj line: 54, column: 4
                          zone7P_in.setACK(false);//sysj/controller.sysj line: 54, column: 4
                          ends[8]=2;
                          ;//sysj/controller.sysj line: 54, column: 4
                          S308=1;
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
                      if(zone7P_in.isREQ()){//sysj/controller.sysj line: 54, column: 4
                        zone7P_in.setACK(false);//sysj/controller.sysj line: 54, column: 4
                        ends[8]=2;
                        ;//sysj/controller.sysj line: 54, column: 4
                        S308=1;
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
                S292=1;
                S292=0;
                if(!zone7P_in.isPartnerPresent() || zone7P_in.isPartnerPreempted()){//sysj/controller.sysj line: 54, column: 4
                  zone7P_in.setACK(false);//sysj/controller.sysj line: 54, column: 4
                  S292=1;
                  active[8]=1;
                  ends[8]=1;
                  tdone[8]=1;
                }
                else {
                  S287=0;
                  if(!zone7P_in.isREQ()){//sysj/controller.sysj line: 54, column: 4
                    zone7P_in.setACK(true);//sysj/controller.sysj line: 54, column: 4
                    S287=1;
                    if(zone7P_in.isREQ()){//sysj/controller.sysj line: 54, column: 4
                      zone7P_in.setACK(false);//sysj/controller.sysj line: 54, column: 4
                      ends[8]=2;
                      ;//sysj/controller.sysj line: 54, column: 4
                      S308=1;
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
            S308=1;
            S309=0;
            active[8]=0;
            ends[8]=0;
            tdone[8]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread2002(int [] tdone, int [] ends){
        switch(S285){
      case 0 : 
        active[7]=0;
        ends[7]=0;
        tdone[7]=1;
        break;
      
      case 1 : 
        switch(S284){
          case 0 : 
            switch(S268){
              case 0 : 
                if(!zone6P_in.isPartnerPresent() || zone6P_in.isPartnerPreempted()){//sysj/controller.sysj line: 53, column: 4
                  zone6P_in.setACK(false);//sysj/controller.sysj line: 53, column: 4
                  S268=1;
                  active[7]=1;
                  ends[7]=1;
                  tdone[7]=1;
                }
                else {
                  switch(S263){
                    case 0 : 
                      if(!zone6P_in.isREQ()){//sysj/controller.sysj line: 53, column: 4
                        zone6P_in.setACK(true);//sysj/controller.sysj line: 53, column: 4
                        S263=1;
                        if(zone6P_in.isREQ()){//sysj/controller.sysj line: 53, column: 4
                          zone6P_in.setACK(false);//sysj/controller.sysj line: 53, column: 4
                          ends[7]=2;
                          ;//sysj/controller.sysj line: 53, column: 4
                          S284=1;
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
                      if(zone6P_in.isREQ()){//sysj/controller.sysj line: 53, column: 4
                        zone6P_in.setACK(false);//sysj/controller.sysj line: 53, column: 4
                        ends[7]=2;
                        ;//sysj/controller.sysj line: 53, column: 4
                        S284=1;
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
                S268=1;
                S268=0;
                if(!zone6P_in.isPartnerPresent() || zone6P_in.isPartnerPreempted()){//sysj/controller.sysj line: 53, column: 4
                  zone6P_in.setACK(false);//sysj/controller.sysj line: 53, column: 4
                  S268=1;
                  active[7]=1;
                  ends[7]=1;
                  tdone[7]=1;
                }
                else {
                  S263=0;
                  if(!zone6P_in.isREQ()){//sysj/controller.sysj line: 53, column: 4
                    zone6P_in.setACK(true);//sysj/controller.sysj line: 53, column: 4
                    S263=1;
                    if(zone6P_in.isREQ()){//sysj/controller.sysj line: 53, column: 4
                      zone6P_in.setACK(false);//sysj/controller.sysj line: 53, column: 4
                      ends[7]=2;
                      ;//sysj/controller.sysj line: 53, column: 4
                      S284=1;
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
            S284=1;
            S285=0;
            active[7]=0;
            ends[7]=0;
            tdone[7]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread2001(int [] tdone, int [] ends){
        switch(S261){
      case 0 : 
        active[6]=0;
        ends[6]=0;
        tdone[6]=1;
        break;
      
      case 1 : 
        switch(S260){
          case 0 : 
            switch(S244){
              case 0 : 
                if(!zone5P_in.isPartnerPresent() || zone5P_in.isPartnerPreempted()){//sysj/controller.sysj line: 52, column: 4
                  zone5P_in.setACK(false);//sysj/controller.sysj line: 52, column: 4
                  S244=1;
                  active[6]=1;
                  ends[6]=1;
                  tdone[6]=1;
                }
                else {
                  switch(S239){
                    case 0 : 
                      if(!zone5P_in.isREQ()){//sysj/controller.sysj line: 52, column: 4
                        zone5P_in.setACK(true);//sysj/controller.sysj line: 52, column: 4
                        S239=1;
                        if(zone5P_in.isREQ()){//sysj/controller.sysj line: 52, column: 4
                          zone5P_in.setACK(false);//sysj/controller.sysj line: 52, column: 4
                          ends[6]=2;
                          ;//sysj/controller.sysj line: 52, column: 4
                          S260=1;
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
                      if(zone5P_in.isREQ()){//sysj/controller.sysj line: 52, column: 4
                        zone5P_in.setACK(false);//sysj/controller.sysj line: 52, column: 4
                        ends[6]=2;
                        ;//sysj/controller.sysj line: 52, column: 4
                        S260=1;
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
                S244=1;
                S244=0;
                if(!zone5P_in.isPartnerPresent() || zone5P_in.isPartnerPreempted()){//sysj/controller.sysj line: 52, column: 4
                  zone5P_in.setACK(false);//sysj/controller.sysj line: 52, column: 4
                  S244=1;
                  active[6]=1;
                  ends[6]=1;
                  tdone[6]=1;
                }
                else {
                  S239=0;
                  if(!zone5P_in.isREQ()){//sysj/controller.sysj line: 52, column: 4
                    zone5P_in.setACK(true);//sysj/controller.sysj line: 52, column: 4
                    S239=1;
                    if(zone5P_in.isREQ()){//sysj/controller.sysj line: 52, column: 4
                      zone5P_in.setACK(false);//sysj/controller.sysj line: 52, column: 4
                      ends[6]=2;
                      ;//sysj/controller.sysj line: 52, column: 4
                      S260=1;
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
            S260=1;
            S261=0;
            active[6]=0;
            ends[6]=0;
            tdone[6]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread2000(int [] tdone, int [] ends){
        switch(S237){
      case 0 : 
        active[5]=0;
        ends[5]=0;
        tdone[5]=1;
        break;
      
      case 1 : 
        switch(S236){
          case 0 : 
            switch(S220){
              case 0 : 
                if(!zone4P_in.isPartnerPresent() || zone4P_in.isPartnerPreempted()){//sysj/controller.sysj line: 51, column: 4
                  zone4P_in.setACK(false);//sysj/controller.sysj line: 51, column: 4
                  S220=1;
                  active[5]=1;
                  ends[5]=1;
                  tdone[5]=1;
                }
                else {
                  switch(S215){
                    case 0 : 
                      if(!zone4P_in.isREQ()){//sysj/controller.sysj line: 51, column: 4
                        zone4P_in.setACK(true);//sysj/controller.sysj line: 51, column: 4
                        S215=1;
                        if(zone4P_in.isREQ()){//sysj/controller.sysj line: 51, column: 4
                          zone4P_in.setACK(false);//sysj/controller.sysj line: 51, column: 4
                          ends[5]=2;
                          ;//sysj/controller.sysj line: 51, column: 4
                          S236=1;
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
                      if(zone4P_in.isREQ()){//sysj/controller.sysj line: 51, column: 4
                        zone4P_in.setACK(false);//sysj/controller.sysj line: 51, column: 4
                        ends[5]=2;
                        ;//sysj/controller.sysj line: 51, column: 4
                        S236=1;
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
                S220=1;
                S220=0;
                if(!zone4P_in.isPartnerPresent() || zone4P_in.isPartnerPreempted()){//sysj/controller.sysj line: 51, column: 4
                  zone4P_in.setACK(false);//sysj/controller.sysj line: 51, column: 4
                  S220=1;
                  active[5]=1;
                  ends[5]=1;
                  tdone[5]=1;
                }
                else {
                  S215=0;
                  if(!zone4P_in.isREQ()){//sysj/controller.sysj line: 51, column: 4
                    zone4P_in.setACK(true);//sysj/controller.sysj line: 51, column: 4
                    S215=1;
                    if(zone4P_in.isREQ()){//sysj/controller.sysj line: 51, column: 4
                      zone4P_in.setACK(false);//sysj/controller.sysj line: 51, column: 4
                      ends[5]=2;
                      ;//sysj/controller.sysj line: 51, column: 4
                      S236=1;
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
            S236=1;
            S237=0;
            active[5]=0;
            ends[5]=0;
            tdone[5]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread1999(int [] tdone, int [] ends){
        switch(S213){
      case 0 : 
        active[4]=0;
        ends[4]=0;
        tdone[4]=1;
        break;
      
      case 1 : 
        switch(S141){
          case 0 : 
            switch(S125){
              case 0 : 
                if(!zone3P_in.isPartnerPresent() || zone3P_in.isPartnerPreempted()){//sysj/controller.sysj line: 33, column: 4
                  zone3P_in.setACK(false);//sysj/controller.sysj line: 33, column: 4
                  S125=1;
                  active[4]=1;
                  ends[4]=1;
                  tdone[4]=1;
                }
                else {
                  switch(S120){
                    case 0 : 
                      if(!zone3P_in.isREQ()){//sysj/controller.sysj line: 33, column: 4
                        zone3P_in.setACK(true);//sysj/controller.sysj line: 33, column: 4
                        S120=1;
                        if(zone3P_in.isREQ()){//sysj/controller.sysj line: 33, column: 4
                          zone3P_in.setACK(false);//sysj/controller.sysj line: 33, column: 4
                          ends[4]=2;
                          ;//sysj/controller.sysj line: 33, column: 4
                          S141=1;
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
                      if(zone3P_in.isREQ()){//sysj/controller.sysj line: 33, column: 4
                        zone3P_in.setACK(false);//sysj/controller.sysj line: 33, column: 4
                        ends[4]=2;
                        ;//sysj/controller.sysj line: 33, column: 4
                        S141=1;
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
                S125=1;
                S125=0;
                if(!zone3P_in.isPartnerPresent() || zone3P_in.isPartnerPreempted()){//sysj/controller.sysj line: 33, column: 4
                  zone3P_in.setACK(false);//sysj/controller.sysj line: 33, column: 4
                  S125=1;
                  active[4]=1;
                  ends[4]=1;
                  tdone[4]=1;
                }
                else {
                  S120=0;
                  if(!zone3P_in.isREQ()){//sysj/controller.sysj line: 33, column: 4
                    zone3P_in.setACK(true);//sysj/controller.sysj line: 33, column: 4
                    S120=1;
                    if(zone3P_in.isREQ()){//sysj/controller.sysj line: 33, column: 4
                      zone3P_in.setACK(false);//sysj/controller.sysj line: 33, column: 4
                      ends[4]=2;
                      ;//sysj/controller.sysj line: 33, column: 4
                      S141=1;
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
            S141=1;
            S141=2;
            if((zone3P_in.getVal() == null ? false : ((Boolean)zone3P_in.getVal()).booleanValue()) == true){//sysj/controller.sysj line: 35, column: 8
              S145=0;
              System.out.println("detected");//sysj/controller.sysj line: 36, column: 5
              zone3Light.setPresent();//sysj/controller.sysj line: 37, column: 5
              currsigs.addElement(zone3Light);
              zone3Light.setValue("detected");//sysj/controller.sysj line: 37, column: 5
              System.out.println("Emitted zone3Light");
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            else {
              S145=1;
              if((zone3P_in.getVal() == null ? false : ((Boolean)zone3P_in.getVal()).booleanValue()) == false){//sysj/controller.sysj line: 41, column: 12
                System.out.println("notdetected");//sysj/controller.sysj line: 43, column: 6
                zone3Light.setPresent();//sysj/controller.sysj line: 44, column: 6
                currsigs.addElement(zone3Light);
                zone3Light.setValue("notdetected");//sysj/controller.sysj line: 44, column: 6
                System.out.println("Emitted zone3Light");
                active[4]=1;
                ends[4]=1;
                tdone[4]=1;
              }
              else {
                S141=3;
                active[4]=1;
                ends[4]=1;
                tdone[4]=1;
              }
            }
            break;
          
          case 2 : 
            switch(S145){
              case 0 : 
                S141=3;
                active[4]=1;
                ends[4]=1;
                tdone[4]=1;
                break;
              
              case 1 : 
                S141=3;
                active[4]=1;
                ends[4]=1;
                tdone[4]=1;
                break;
              
            }
            break;
          
          case 3 : 
            S141=3;
            S141=0;
            S125=0;
            if(!zone3P_in.isPartnerPresent() || zone3P_in.isPartnerPreempted()){//sysj/controller.sysj line: 33, column: 4
              zone3P_in.setACK(false);//sysj/controller.sysj line: 33, column: 4
              S125=1;
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            else {
              S120=0;
              if(!zone3P_in.isREQ()){//sysj/controller.sysj line: 33, column: 4
                zone3P_in.setACK(true);//sysj/controller.sysj line: 33, column: 4
                S120=1;
                if(zone3P_in.isREQ()){//sysj/controller.sysj line: 33, column: 4
                  zone3P_in.setACK(false);//sysj/controller.sysj line: 33, column: 4
                  ends[4]=2;
                  ;//sysj/controller.sysj line: 33, column: 4
                  S141=1;
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

  public void thread1998(int [] tdone, int [] ends){
        switch(S118){
      case 0 : 
        active[3]=0;
        ends[3]=0;
        tdone[3]=1;
        break;
      
      case 1 : 
        switch(S117){
          case 0 : 
            switch(S101){
              case 0 : 
                if(!zone2P_in.isPartnerPresent() || zone2P_in.isPartnerPreempted()){//sysj/controller.sysj line: 30, column: 4
                  zone2P_in.setACK(false);//sysj/controller.sysj line: 30, column: 4
                  S101=1;
                  active[3]=1;
                  ends[3]=1;
                  tdone[3]=1;
                }
                else {
                  switch(S96){
                    case 0 : 
                      if(!zone2P_in.isREQ()){//sysj/controller.sysj line: 30, column: 4
                        zone2P_in.setACK(true);//sysj/controller.sysj line: 30, column: 4
                        S96=1;
                        if(zone2P_in.isREQ()){//sysj/controller.sysj line: 30, column: 4
                          zone2P_in.setACK(false);//sysj/controller.sysj line: 30, column: 4
                          ends[3]=2;
                          ;//sysj/controller.sysj line: 30, column: 4
                          S117=1;
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
                      if(zone2P_in.isREQ()){//sysj/controller.sysj line: 30, column: 4
                        zone2P_in.setACK(false);//sysj/controller.sysj line: 30, column: 4
                        ends[3]=2;
                        ;//sysj/controller.sysj line: 30, column: 4
                        S117=1;
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
                S101=1;
                S101=0;
                if(!zone2P_in.isPartnerPresent() || zone2P_in.isPartnerPreempted()){//sysj/controller.sysj line: 30, column: 4
                  zone2P_in.setACK(false);//sysj/controller.sysj line: 30, column: 4
                  S101=1;
                  active[3]=1;
                  ends[3]=1;
                  tdone[3]=1;
                }
                else {
                  S96=0;
                  if(!zone2P_in.isREQ()){//sysj/controller.sysj line: 30, column: 4
                    zone2P_in.setACK(true);//sysj/controller.sysj line: 30, column: 4
                    S96=1;
                    if(zone2P_in.isREQ()){//sysj/controller.sysj line: 30, column: 4
                      zone2P_in.setACK(false);//sysj/controller.sysj line: 30, column: 4
                      ends[3]=2;
                      ;//sysj/controller.sysj line: 30, column: 4
                      S117=1;
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
            S117=1;
            S118=0;
            active[3]=0;
            ends[3]=0;
            tdone[3]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread1997(int [] tdone, int [] ends){
        switch(S94){
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
                if(!zone1P_in.isPartnerPresent() || zone1P_in.isPartnerPreempted()){//sysj/controller.sysj line: 12, column: 4
                  zone1P_in.setACK(false);//sysj/controller.sysj line: 12, column: 4
                  S6=1;
                  active[2]=1;
                  ends[2]=1;
                  tdone[2]=1;
                }
                else {
                  switch(S1){
                    case 0 : 
                      if(!zone1P_in.isREQ()){//sysj/controller.sysj line: 12, column: 4
                        zone1P_in.setACK(true);//sysj/controller.sysj line: 12, column: 4
                        S1=1;
                        if(zone1P_in.isREQ()){//sysj/controller.sysj line: 12, column: 4
                          zone1P_in.setACK(false);//sysj/controller.sysj line: 12, column: 4
                          ends[2]=2;
                          ;//sysj/controller.sysj line: 12, column: 4
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
                      if(zone1P_in.isREQ()){//sysj/controller.sysj line: 12, column: 4
                        zone1P_in.setACK(false);//sysj/controller.sysj line: 12, column: 4
                        ends[2]=2;
                        ;//sysj/controller.sysj line: 12, column: 4
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
                if(!zone1P_in.isPartnerPresent() || zone1P_in.isPartnerPreempted()){//sysj/controller.sysj line: 12, column: 4
                  zone1P_in.setACK(false);//sysj/controller.sysj line: 12, column: 4
                  S6=1;
                  active[2]=1;
                  ends[2]=1;
                  tdone[2]=1;
                }
                else {
                  S1=0;
                  if(!zone1P_in.isREQ()){//sysj/controller.sysj line: 12, column: 4
                    zone1P_in.setACK(true);//sysj/controller.sysj line: 12, column: 4
                    S1=1;
                    if(zone1P_in.isREQ()){//sysj/controller.sysj line: 12, column: 4
                      zone1P_in.setACK(false);//sysj/controller.sysj line: 12, column: 4
                      ends[2]=2;
                      ;//sysj/controller.sysj line: 12, column: 4
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
            S22=2;
            if((zone1P_in.getVal() == null ? false : ((Boolean)zone1P_in.getVal()).booleanValue()) == true){//sysj/controller.sysj line: 14, column: 8
              S26=0;
              System.out.println("detected");//sysj/controller.sysj line: 15, column: 5
              zone1Light.setPresent();//sysj/controller.sysj line: 16, column: 5
              currsigs.addElement(zone1Light);
              zone1Light.setValue("detected");//sysj/controller.sysj line: 16, column: 5
              System.out.println("Emitted zone1Light");
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            else {
              S26=1;
              if((zone1P_in.getVal() == null ? false : ((Boolean)zone1P_in.getVal()).booleanValue()) == false){//sysj/controller.sysj line: 20, column: 12
                System.out.println("notdetected");//sysj/controller.sysj line: 22, column: 6
                zone1Light.setPresent();//sysj/controller.sysj line: 23, column: 6
                currsigs.addElement(zone1Light);
                zone1Light.setValue("notdetected");//sysj/controller.sysj line: 23, column: 6
                System.out.println("Emitted zone1Light");
                active[2]=1;
                ends[2]=1;
                tdone[2]=1;
              }
              else {
                S22=3;
                active[2]=1;
                ends[2]=1;
                tdone[2]=1;
              }
            }
            break;
          
          case 2 : 
            switch(S26){
              case 0 : 
                S22=3;
                active[2]=1;
                ends[2]=1;
                tdone[2]=1;
                break;
              
              case 1 : 
                S22=3;
                active[2]=1;
                ends[2]=1;
                tdone[2]=1;
                break;
              
            }
            break;
          
          case 3 : 
            S22=3;
            S22=0;
            S6=0;
            if(!zone1P_in.isPartnerPresent() || zone1P_in.isPartnerPreempted()){//sysj/controller.sysj line: 12, column: 4
              zone1P_in.setACK(false);//sysj/controller.sysj line: 12, column: 4
              S6=1;
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            else {
              S1=0;
              if(!zone1P_in.isREQ()){//sysj/controller.sysj line: 12, column: 4
                zone1P_in.setACK(true);//sysj/controller.sysj line: 12, column: 4
                S1=1;
                if(zone1P_in.isREQ()){//sysj/controller.sysj line: 12, column: 4
                  zone1P_in.setACK(false);//sysj/controller.sysj line: 12, column: 4
                  ends[2]=2;
                  ;//sysj/controller.sysj line: 12, column: 4
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
      
    }
  }

  public void thread1995(int [] tdone, int [] ends){
        S309=1;
    S308=0;
    S292=0;
    if(!zone7P_in.isPartnerPresent() || zone7P_in.isPartnerPreempted()){//sysj/controller.sysj line: 54, column: 4
      zone7P_in.setACK(false);//sysj/controller.sysj line: 54, column: 4
      S292=1;
      active[8]=1;
      ends[8]=1;
      tdone[8]=1;
    }
    else {
      S287=0;
      if(!zone7P_in.isREQ()){//sysj/controller.sysj line: 54, column: 4
        zone7P_in.setACK(true);//sysj/controller.sysj line: 54, column: 4
        S287=1;
        if(zone7P_in.isREQ()){//sysj/controller.sysj line: 54, column: 4
          zone7P_in.setACK(false);//sysj/controller.sysj line: 54, column: 4
          ends[8]=2;
          ;//sysj/controller.sysj line: 54, column: 4
          S308=1;
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

  public void thread1994(int [] tdone, int [] ends){
        S285=1;
    S284=0;
    S268=0;
    if(!zone6P_in.isPartnerPresent() || zone6P_in.isPartnerPreempted()){//sysj/controller.sysj line: 53, column: 4
      zone6P_in.setACK(false);//sysj/controller.sysj line: 53, column: 4
      S268=1;
      active[7]=1;
      ends[7]=1;
      tdone[7]=1;
    }
    else {
      S263=0;
      if(!zone6P_in.isREQ()){//sysj/controller.sysj line: 53, column: 4
        zone6P_in.setACK(true);//sysj/controller.sysj line: 53, column: 4
        S263=1;
        if(zone6P_in.isREQ()){//sysj/controller.sysj line: 53, column: 4
          zone6P_in.setACK(false);//sysj/controller.sysj line: 53, column: 4
          ends[7]=2;
          ;//sysj/controller.sysj line: 53, column: 4
          S284=1;
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

  public void thread1993(int [] tdone, int [] ends){
        S261=1;
    S260=0;
    S244=0;
    if(!zone5P_in.isPartnerPresent() || zone5P_in.isPartnerPreempted()){//sysj/controller.sysj line: 52, column: 4
      zone5P_in.setACK(false);//sysj/controller.sysj line: 52, column: 4
      S244=1;
      active[6]=1;
      ends[6]=1;
      tdone[6]=1;
    }
    else {
      S239=0;
      if(!zone5P_in.isREQ()){//sysj/controller.sysj line: 52, column: 4
        zone5P_in.setACK(true);//sysj/controller.sysj line: 52, column: 4
        S239=1;
        if(zone5P_in.isREQ()){//sysj/controller.sysj line: 52, column: 4
          zone5P_in.setACK(false);//sysj/controller.sysj line: 52, column: 4
          ends[6]=2;
          ;//sysj/controller.sysj line: 52, column: 4
          S260=1;
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

  public void thread1992(int [] tdone, int [] ends){
        S237=1;
    S236=0;
    S220=0;
    if(!zone4P_in.isPartnerPresent() || zone4P_in.isPartnerPreempted()){//sysj/controller.sysj line: 51, column: 4
      zone4P_in.setACK(false);//sysj/controller.sysj line: 51, column: 4
      S220=1;
      active[5]=1;
      ends[5]=1;
      tdone[5]=1;
    }
    else {
      S215=0;
      if(!zone4P_in.isREQ()){//sysj/controller.sysj line: 51, column: 4
        zone4P_in.setACK(true);//sysj/controller.sysj line: 51, column: 4
        S215=1;
        if(zone4P_in.isREQ()){//sysj/controller.sysj line: 51, column: 4
          zone4P_in.setACK(false);//sysj/controller.sysj line: 51, column: 4
          ends[5]=2;
          ;//sysj/controller.sysj line: 51, column: 4
          S236=1;
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

  public void thread1991(int [] tdone, int [] ends){
        S213=1;
    S141=0;
    S125=0;
    if(!zone3P_in.isPartnerPresent() || zone3P_in.isPartnerPreempted()){//sysj/controller.sysj line: 33, column: 4
      zone3P_in.setACK(false);//sysj/controller.sysj line: 33, column: 4
      S125=1;
      active[4]=1;
      ends[4]=1;
      tdone[4]=1;
    }
    else {
      S120=0;
      if(!zone3P_in.isREQ()){//sysj/controller.sysj line: 33, column: 4
        zone3P_in.setACK(true);//sysj/controller.sysj line: 33, column: 4
        S120=1;
        if(zone3P_in.isREQ()){//sysj/controller.sysj line: 33, column: 4
          zone3P_in.setACK(false);//sysj/controller.sysj line: 33, column: 4
          ends[4]=2;
          ;//sysj/controller.sysj line: 33, column: 4
          S141=1;
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

  public void thread1990(int [] tdone, int [] ends){
        S118=1;
    S117=0;
    S101=0;
    if(!zone2P_in.isPartnerPresent() || zone2P_in.isPartnerPreempted()){//sysj/controller.sysj line: 30, column: 4
      zone2P_in.setACK(false);//sysj/controller.sysj line: 30, column: 4
      S101=1;
      active[3]=1;
      ends[3]=1;
      tdone[3]=1;
    }
    else {
      S96=0;
      if(!zone2P_in.isREQ()){//sysj/controller.sysj line: 30, column: 4
        zone2P_in.setACK(true);//sysj/controller.sysj line: 30, column: 4
        S96=1;
        if(zone2P_in.isREQ()){//sysj/controller.sysj line: 30, column: 4
          zone2P_in.setACK(false);//sysj/controller.sysj line: 30, column: 4
          ends[3]=2;
          ;//sysj/controller.sysj line: 30, column: 4
          S117=1;
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

  public void thread1989(int [] tdone, int [] ends){
        S94=1;
    S22=0;
    S6=0;
    if(!zone1P_in.isPartnerPresent() || zone1P_in.isPartnerPreempted()){//sysj/controller.sysj line: 12, column: 4
      zone1P_in.setACK(false);//sysj/controller.sysj line: 12, column: 4
      S6=1;
      active[2]=1;
      ends[2]=1;
      tdone[2]=1;
    }
    else {
      S1=0;
      if(!zone1P_in.isREQ()){//sysj/controller.sysj line: 12, column: 4
        zone1P_in.setACK(true);//sysj/controller.sysj line: 12, column: 4
        S1=1;
        if(zone1P_in.isREQ()){//sysj/controller.sysj line: 12, column: 4
          zone1P_in.setACK(false);//sysj/controller.sysj line: 12, column: 4
          ends[2]=2;
          ;//sysj/controller.sysj line: 12, column: 4
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
      switch(S311){
        case 0 : 
          S311=0;
          break RUN;
        
        case 1 : 
          S311=2;
          S311=2;
          thread1989(tdone,ends);
          thread1990(tdone,ends);
          thread1991(tdone,ends);
          thread1992(tdone,ends);
          thread1993(tdone,ends);
          thread1994(tdone,ends);
          thread1995(tdone,ends);
          int biggest1996 = 0;
          if(ends[2]>=biggest1996){
            biggest1996=ends[2];
          }
          if(ends[3]>=biggest1996){
            biggest1996=ends[3];
          }
          if(ends[4]>=biggest1996){
            biggest1996=ends[4];
          }
          if(ends[5]>=biggest1996){
            biggest1996=ends[5];
          }
          if(ends[6]>=biggest1996){
            biggest1996=ends[6];
          }
          if(ends[7]>=biggest1996){
            biggest1996=ends[7];
          }
          if(ends[8]>=biggest1996){
            biggest1996=ends[8];
          }
          if(biggest1996 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
        
        case 2 : 
          thread1997(tdone,ends);
          thread1998(tdone,ends);
          thread1999(tdone,ends);
          thread2000(tdone,ends);
          thread2001(tdone,ends);
          thread2002(tdone,ends);
          thread2003(tdone,ends);
          int biggest2004 = 0;
          if(ends[2]>=biggest2004){
            biggest2004=ends[2];
          }
          if(ends[3]>=biggest2004){
            biggest2004=ends[3];
          }
          if(ends[4]>=biggest2004){
            biggest2004=ends[4];
          }
          if(ends[5]>=biggest2004){
            biggest2004=ends[5];
          }
          if(ends[6]>=biggest2004){
            biggest2004=ends[6];
          }
          if(ends[7]>=biggest2004){
            biggest2004=ends[7];
          }
          if(ends[8]>=biggest2004){
            biggest2004=ends[8];
          }
          if(biggest2004 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
          //FINXME code
          if(biggest2004 == 0){
            S311=0;
            active[1]=0;
            ends[1]=0;
            S311=0;
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
