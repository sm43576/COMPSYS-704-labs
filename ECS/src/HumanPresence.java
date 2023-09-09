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
  private int S228 = 1;
  private int S23 = 1;
  private int S6 = 1;
  private int S1 = 1;
  private int S47 = 1;
  private int S46 = 1;
  private int S30 = 1;
  private int S25 = 1;
  private int S130 = 1;
  private int S74 = 1;
  private int S54 = 1;
  private int S49 = 1;
  private int S154 = 1;
  private int S153 = 1;
  private int S137 = 1;
  private int S132 = 1;
  private int S178 = 1;
  private int S177 = 1;
  private int S161 = 1;
  private int S156 = 1;
  private int S202 = 1;
  private int S201 = 1;
  private int S185 = 1;
  private int S180 = 1;
  private int S226 = 1;
  private int S225 = 1;
  private int S209 = 1;
  private int S204 = 1;
  
  private int[] ends = new int[10];
  private int[] tdone = new int[10];
  
  public void thread783(int [] tdone, int [] ends){
        switch(S226){
      case 0 : 
        active[8]=0;
        ends[8]=0;
        tdone[8]=1;
        break;
      
      case 1 : 
        switch(S225){
          case 0 : 
            switch(S209){
              case 0 : 
                if(!zone7P_in.isPartnerPresent() || zone7P_in.isPartnerPreempted()){//sysj/controller.sysj line: 32, column: 4
                  zone7P_in.setACK(false);//sysj/controller.sysj line: 32, column: 4
                  S209=1;
                  active[8]=1;
                  ends[8]=1;
                  tdone[8]=1;
                }
                else {
                  switch(S204){
                    case 0 : 
                      if(!zone7P_in.isREQ()){//sysj/controller.sysj line: 32, column: 4
                        zone7P_in.setACK(true);//sysj/controller.sysj line: 32, column: 4
                        S204=1;
                        if(zone7P_in.isREQ()){//sysj/controller.sysj line: 32, column: 4
                          zone7P_in.setACK(false);//sysj/controller.sysj line: 32, column: 4
                          ends[8]=2;
                          ;//sysj/controller.sysj line: 32, column: 4
                          S225=1;
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
                      if(zone7P_in.isREQ()){//sysj/controller.sysj line: 32, column: 4
                        zone7P_in.setACK(false);//sysj/controller.sysj line: 32, column: 4
                        ends[8]=2;
                        ;//sysj/controller.sysj line: 32, column: 4
                        S225=1;
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
                S209=1;
                S209=0;
                if(!zone7P_in.isPartnerPresent() || zone7P_in.isPartnerPreempted()){//sysj/controller.sysj line: 32, column: 4
                  zone7P_in.setACK(false);//sysj/controller.sysj line: 32, column: 4
                  S209=1;
                  active[8]=1;
                  ends[8]=1;
                  tdone[8]=1;
                }
                else {
                  S204=0;
                  if(!zone7P_in.isREQ()){//sysj/controller.sysj line: 32, column: 4
                    zone7P_in.setACK(true);//sysj/controller.sysj line: 32, column: 4
                    S204=1;
                    if(zone7P_in.isREQ()){//sysj/controller.sysj line: 32, column: 4
                      zone7P_in.setACK(false);//sysj/controller.sysj line: 32, column: 4
                      ends[8]=2;
                      ;//sysj/controller.sysj line: 32, column: 4
                      S225=1;
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
            S225=1;
            S226=0;
            active[8]=0;
            ends[8]=0;
            tdone[8]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread782(int [] tdone, int [] ends){
        switch(S202){
      case 0 : 
        active[7]=0;
        ends[7]=0;
        tdone[7]=1;
        break;
      
      case 1 : 
        switch(S201){
          case 0 : 
            switch(S185){
              case 0 : 
                if(!zone6P_in.isPartnerPresent() || zone6P_in.isPartnerPreempted()){//sysj/controller.sysj line: 31, column: 4
                  zone6P_in.setACK(false);//sysj/controller.sysj line: 31, column: 4
                  S185=1;
                  active[7]=1;
                  ends[7]=1;
                  tdone[7]=1;
                }
                else {
                  switch(S180){
                    case 0 : 
                      if(!zone6P_in.isREQ()){//sysj/controller.sysj line: 31, column: 4
                        zone6P_in.setACK(true);//sysj/controller.sysj line: 31, column: 4
                        S180=1;
                        if(zone6P_in.isREQ()){//sysj/controller.sysj line: 31, column: 4
                          zone6P_in.setACK(false);//sysj/controller.sysj line: 31, column: 4
                          ends[7]=2;
                          ;//sysj/controller.sysj line: 31, column: 4
                          S201=1;
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
                      if(zone6P_in.isREQ()){//sysj/controller.sysj line: 31, column: 4
                        zone6P_in.setACK(false);//sysj/controller.sysj line: 31, column: 4
                        ends[7]=2;
                        ;//sysj/controller.sysj line: 31, column: 4
                        S201=1;
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
                S185=1;
                S185=0;
                if(!zone6P_in.isPartnerPresent() || zone6P_in.isPartnerPreempted()){//sysj/controller.sysj line: 31, column: 4
                  zone6P_in.setACK(false);//sysj/controller.sysj line: 31, column: 4
                  S185=1;
                  active[7]=1;
                  ends[7]=1;
                  tdone[7]=1;
                }
                else {
                  S180=0;
                  if(!zone6P_in.isREQ()){//sysj/controller.sysj line: 31, column: 4
                    zone6P_in.setACK(true);//sysj/controller.sysj line: 31, column: 4
                    S180=1;
                    if(zone6P_in.isREQ()){//sysj/controller.sysj line: 31, column: 4
                      zone6P_in.setACK(false);//sysj/controller.sysj line: 31, column: 4
                      ends[7]=2;
                      ;//sysj/controller.sysj line: 31, column: 4
                      S201=1;
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
            S201=1;
            S202=0;
            active[7]=0;
            ends[7]=0;
            tdone[7]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread781(int [] tdone, int [] ends){
        switch(S178){
      case 0 : 
        active[6]=0;
        ends[6]=0;
        tdone[6]=1;
        break;
      
      case 1 : 
        switch(S177){
          case 0 : 
            switch(S161){
              case 0 : 
                if(!zone5P_in.isPartnerPresent() || zone5P_in.isPartnerPreempted()){//sysj/controller.sysj line: 30, column: 4
                  zone5P_in.setACK(false);//sysj/controller.sysj line: 30, column: 4
                  S161=1;
                  active[6]=1;
                  ends[6]=1;
                  tdone[6]=1;
                }
                else {
                  switch(S156){
                    case 0 : 
                      if(!zone5P_in.isREQ()){//sysj/controller.sysj line: 30, column: 4
                        zone5P_in.setACK(true);//sysj/controller.sysj line: 30, column: 4
                        S156=1;
                        if(zone5P_in.isREQ()){//sysj/controller.sysj line: 30, column: 4
                          zone5P_in.setACK(false);//sysj/controller.sysj line: 30, column: 4
                          ends[6]=2;
                          ;//sysj/controller.sysj line: 30, column: 4
                          S177=1;
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
                      if(zone5P_in.isREQ()){//sysj/controller.sysj line: 30, column: 4
                        zone5P_in.setACK(false);//sysj/controller.sysj line: 30, column: 4
                        ends[6]=2;
                        ;//sysj/controller.sysj line: 30, column: 4
                        S177=1;
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
                S161=1;
                S161=0;
                if(!zone5P_in.isPartnerPresent() || zone5P_in.isPartnerPreempted()){//sysj/controller.sysj line: 30, column: 4
                  zone5P_in.setACK(false);//sysj/controller.sysj line: 30, column: 4
                  S161=1;
                  active[6]=1;
                  ends[6]=1;
                  tdone[6]=1;
                }
                else {
                  S156=0;
                  if(!zone5P_in.isREQ()){//sysj/controller.sysj line: 30, column: 4
                    zone5P_in.setACK(true);//sysj/controller.sysj line: 30, column: 4
                    S156=1;
                    if(zone5P_in.isREQ()){//sysj/controller.sysj line: 30, column: 4
                      zone5P_in.setACK(false);//sysj/controller.sysj line: 30, column: 4
                      ends[6]=2;
                      ;//sysj/controller.sysj line: 30, column: 4
                      S177=1;
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
            S177=1;
            S178=0;
            active[6]=0;
            ends[6]=0;
            tdone[6]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread780(int [] tdone, int [] ends){
        switch(S154){
      case 0 : 
        active[5]=0;
        ends[5]=0;
        tdone[5]=1;
        break;
      
      case 1 : 
        switch(S153){
          case 0 : 
            switch(S137){
              case 0 : 
                if(!zone4P_in.isPartnerPresent() || zone4P_in.isPartnerPreempted()){//sysj/controller.sysj line: 29, column: 4
                  zone4P_in.setACK(false);//sysj/controller.sysj line: 29, column: 4
                  S137=1;
                  active[5]=1;
                  ends[5]=1;
                  tdone[5]=1;
                }
                else {
                  switch(S132){
                    case 0 : 
                      if(!zone4P_in.isREQ()){//sysj/controller.sysj line: 29, column: 4
                        zone4P_in.setACK(true);//sysj/controller.sysj line: 29, column: 4
                        S132=1;
                        if(zone4P_in.isREQ()){//sysj/controller.sysj line: 29, column: 4
                          zone4P_in.setACK(false);//sysj/controller.sysj line: 29, column: 4
                          ends[5]=2;
                          ;//sysj/controller.sysj line: 29, column: 4
                          S153=1;
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
                      if(zone4P_in.isREQ()){//sysj/controller.sysj line: 29, column: 4
                        zone4P_in.setACK(false);//sysj/controller.sysj line: 29, column: 4
                        ends[5]=2;
                        ;//sysj/controller.sysj line: 29, column: 4
                        S153=1;
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
                S137=1;
                S137=0;
                if(!zone4P_in.isPartnerPresent() || zone4P_in.isPartnerPreempted()){//sysj/controller.sysj line: 29, column: 4
                  zone4P_in.setACK(false);//sysj/controller.sysj line: 29, column: 4
                  S137=1;
                  active[5]=1;
                  ends[5]=1;
                  tdone[5]=1;
                }
                else {
                  S132=0;
                  if(!zone4P_in.isREQ()){//sysj/controller.sysj line: 29, column: 4
                    zone4P_in.setACK(true);//sysj/controller.sysj line: 29, column: 4
                    S132=1;
                    if(zone4P_in.isREQ()){//sysj/controller.sysj line: 29, column: 4
                      zone4P_in.setACK(false);//sysj/controller.sysj line: 29, column: 4
                      ends[5]=2;
                      ;//sysj/controller.sysj line: 29, column: 4
                      S153=1;
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
            S153=1;
            S154=0;
            active[5]=0;
            ends[5]=0;
            tdone[5]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread779(int [] tdone, int [] ends){
        switch(S130){
      case 0 : 
        active[4]=0;
        ends[4]=0;
        tdone[4]=1;
        break;
      
      case 1 : 
        switch(S74){
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
                          S74=1;
                          if((zone3P_in.getVal() == null ? false : ((Boolean)zone3P_in.getVal()).booleanValue()) == true){//sysj/controller.sysj line: 19, column: 8
                            zone3Light.setPresent();//sysj/controller.sysj line: 20, column: 5
                            currsigs.addElement(zone3Light);
                            zone3Light.setValue(0);//sysj/controller.sysj line: 20, column: 5
                            System.out.println("Emitted zone3Light");
                            System.out.println("waited 5min");//sysj/controller.sysj line: 25, column: 4
                            S74=2;
                            active[4]=1;
                            ends[4]=1;
                            tdone[4]=1;
                          }
                          else {
                            zone3Light.setPresent();//sysj/controller.sysj line: 23, column: 5
                            currsigs.addElement(zone3Light);
                            zone3Light.setValue(1);//sysj/controller.sysj line: 23, column: 5
                            System.out.println("Emitted zone3Light");
                            System.out.println("waited 5min");//sysj/controller.sysj line: 25, column: 4
                            S74=2;
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
                        S74=1;
                        if((zone3P_in.getVal() == null ? false : ((Boolean)zone3P_in.getVal()).booleanValue()) == true){//sysj/controller.sysj line: 19, column: 8
                          zone3Light.setPresent();//sysj/controller.sysj line: 20, column: 5
                          currsigs.addElement(zone3Light);
                          zone3Light.setValue(0);//sysj/controller.sysj line: 20, column: 5
                          System.out.println("Emitted zone3Light");
                          System.out.println("waited 5min");//sysj/controller.sysj line: 25, column: 4
                          S74=2;
                          active[4]=1;
                          ends[4]=1;
                          tdone[4]=1;
                        }
                        else {
                          zone3Light.setPresent();//sysj/controller.sysj line: 23, column: 5
                          currsigs.addElement(zone3Light);
                          zone3Light.setValue(1);//sysj/controller.sysj line: 23, column: 5
                          System.out.println("Emitted zone3Light");
                          System.out.println("waited 5min");//sysj/controller.sysj line: 25, column: 4
                          S74=2;
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
                      S74=1;
                      if((zone3P_in.getVal() == null ? false : ((Boolean)zone3P_in.getVal()).booleanValue()) == true){//sysj/controller.sysj line: 19, column: 8
                        zone3Light.setPresent();//sysj/controller.sysj line: 20, column: 5
                        currsigs.addElement(zone3Light);
                        zone3Light.setValue(0);//sysj/controller.sysj line: 20, column: 5
                        System.out.println("Emitted zone3Light");
                        System.out.println("waited 5min");//sysj/controller.sysj line: 25, column: 4
                        S74=2;
                        active[4]=1;
                        ends[4]=1;
                        tdone[4]=1;
                      }
                      else {
                        zone3Light.setPresent();//sysj/controller.sysj line: 23, column: 5
                        currsigs.addElement(zone3Light);
                        zone3Light.setValue(1);//sysj/controller.sysj line: 23, column: 5
                        System.out.println("Emitted zone3Light");
                        System.out.println("waited 5min");//sysj/controller.sysj line: 25, column: 4
                        S74=2;
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
            S74=0;
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
                  S74=1;
                  if((zone3P_in.getVal() == null ? false : ((Boolean)zone3P_in.getVal()).booleanValue()) == true){//sysj/controller.sysj line: 19, column: 8
                    zone3Light.setPresent();//sysj/controller.sysj line: 20, column: 5
                    currsigs.addElement(zone3Light);
                    zone3Light.setValue(0);//sysj/controller.sysj line: 20, column: 5
                    System.out.println("Emitted zone3Light");
                    System.out.println("waited 5min");//sysj/controller.sysj line: 25, column: 4
                    S74=2;
                    active[4]=1;
                    ends[4]=1;
                    tdone[4]=1;
                  }
                  else {
                    zone3Light.setPresent();//sysj/controller.sysj line: 23, column: 5
                    currsigs.addElement(zone3Light);
                    zone3Light.setValue(1);//sysj/controller.sysj line: 23, column: 5
                    System.out.println("Emitted zone3Light");
                    System.out.println("waited 5min");//sysj/controller.sysj line: 25, column: 4
                    S74=2;
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
              else {
                active[4]=1;
                ends[4]=1;
                tdone[4]=1;
              }
            }
            break;
          
          case 2 : 
            S74=2;
            S74=0;
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
                  S74=1;
                  if((zone3P_in.getVal() == null ? false : ((Boolean)zone3P_in.getVal()).booleanValue()) == true){//sysj/controller.sysj line: 19, column: 8
                    zone3Light.setPresent();//sysj/controller.sysj line: 20, column: 5
                    currsigs.addElement(zone3Light);
                    zone3Light.setValue(0);//sysj/controller.sysj line: 20, column: 5
                    System.out.println("Emitted zone3Light");
                    System.out.println("waited 5min");//sysj/controller.sysj line: 25, column: 4
                    S74=2;
                    active[4]=1;
                    ends[4]=1;
                    tdone[4]=1;
                  }
                  else {
                    zone3Light.setPresent();//sysj/controller.sysj line: 23, column: 5
                    currsigs.addElement(zone3Light);
                    zone3Light.setValue(1);//sysj/controller.sysj line: 23, column: 5
                    System.out.println("Emitted zone3Light");
                    System.out.println("waited 5min");//sysj/controller.sysj line: 25, column: 4
                    S74=2;
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

  public void thread778(int [] tdone, int [] ends){
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

  public void thread777(int [] tdone, int [] ends){
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

  public void thread775(int [] tdone, int [] ends){
        S226=1;
    S225=0;
    S209=0;
    if(!zone7P_in.isPartnerPresent() || zone7P_in.isPartnerPreempted()){//sysj/controller.sysj line: 32, column: 4
      zone7P_in.setACK(false);//sysj/controller.sysj line: 32, column: 4
      S209=1;
      active[8]=1;
      ends[8]=1;
      tdone[8]=1;
    }
    else {
      S204=0;
      if(!zone7P_in.isREQ()){//sysj/controller.sysj line: 32, column: 4
        zone7P_in.setACK(true);//sysj/controller.sysj line: 32, column: 4
        S204=1;
        if(zone7P_in.isREQ()){//sysj/controller.sysj line: 32, column: 4
          zone7P_in.setACK(false);//sysj/controller.sysj line: 32, column: 4
          ends[8]=2;
          ;//sysj/controller.sysj line: 32, column: 4
          S225=1;
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

  public void thread774(int [] tdone, int [] ends){
        S202=1;
    S201=0;
    S185=0;
    if(!zone6P_in.isPartnerPresent() || zone6P_in.isPartnerPreempted()){//sysj/controller.sysj line: 31, column: 4
      zone6P_in.setACK(false);//sysj/controller.sysj line: 31, column: 4
      S185=1;
      active[7]=1;
      ends[7]=1;
      tdone[7]=1;
    }
    else {
      S180=0;
      if(!zone6P_in.isREQ()){//sysj/controller.sysj line: 31, column: 4
        zone6P_in.setACK(true);//sysj/controller.sysj line: 31, column: 4
        S180=1;
        if(zone6P_in.isREQ()){//sysj/controller.sysj line: 31, column: 4
          zone6P_in.setACK(false);//sysj/controller.sysj line: 31, column: 4
          ends[7]=2;
          ;//sysj/controller.sysj line: 31, column: 4
          S201=1;
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

  public void thread773(int [] tdone, int [] ends){
        S178=1;
    S177=0;
    S161=0;
    if(!zone5P_in.isPartnerPresent() || zone5P_in.isPartnerPreempted()){//sysj/controller.sysj line: 30, column: 4
      zone5P_in.setACK(false);//sysj/controller.sysj line: 30, column: 4
      S161=1;
      active[6]=1;
      ends[6]=1;
      tdone[6]=1;
    }
    else {
      S156=0;
      if(!zone5P_in.isREQ()){//sysj/controller.sysj line: 30, column: 4
        zone5P_in.setACK(true);//sysj/controller.sysj line: 30, column: 4
        S156=1;
        if(zone5P_in.isREQ()){//sysj/controller.sysj line: 30, column: 4
          zone5P_in.setACK(false);//sysj/controller.sysj line: 30, column: 4
          ends[6]=2;
          ;//sysj/controller.sysj line: 30, column: 4
          S177=1;
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

  public void thread772(int [] tdone, int [] ends){
        S154=1;
    S153=0;
    S137=0;
    if(!zone4P_in.isPartnerPresent() || zone4P_in.isPartnerPreempted()){//sysj/controller.sysj line: 29, column: 4
      zone4P_in.setACK(false);//sysj/controller.sysj line: 29, column: 4
      S137=1;
      active[5]=1;
      ends[5]=1;
      tdone[5]=1;
    }
    else {
      S132=0;
      if(!zone4P_in.isREQ()){//sysj/controller.sysj line: 29, column: 4
        zone4P_in.setACK(true);//sysj/controller.sysj line: 29, column: 4
        S132=1;
        if(zone4P_in.isREQ()){//sysj/controller.sysj line: 29, column: 4
          zone4P_in.setACK(false);//sysj/controller.sysj line: 29, column: 4
          ends[5]=2;
          ;//sysj/controller.sysj line: 29, column: 4
          S153=1;
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

  public void thread771(int [] tdone, int [] ends){
        S130=1;
    S74=0;
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
          S74=1;
          if((zone3P_in.getVal() == null ? false : ((Boolean)zone3P_in.getVal()).booleanValue()) == true){//sysj/controller.sysj line: 19, column: 8
            zone3Light.setPresent();//sysj/controller.sysj line: 20, column: 5
            currsigs.addElement(zone3Light);
            zone3Light.setValue(0);//sysj/controller.sysj line: 20, column: 5
            System.out.println("Emitted zone3Light");
            System.out.println("waited 5min");//sysj/controller.sysj line: 25, column: 4
            S74=2;
            active[4]=1;
            ends[4]=1;
            tdone[4]=1;
          }
          else {
            zone3Light.setPresent();//sysj/controller.sysj line: 23, column: 5
            currsigs.addElement(zone3Light);
            zone3Light.setValue(1);//sysj/controller.sysj line: 23, column: 5
            System.out.println("Emitted zone3Light");
            System.out.println("waited 5min");//sysj/controller.sysj line: 25, column: 4
            S74=2;
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
      else {
        active[4]=1;
        ends[4]=1;
        tdone[4]=1;
      }
    }
  }

  public void thread770(int [] tdone, int [] ends){
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

  public void thread769(int [] tdone, int [] ends){
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
      switch(S228){
        case 0 : 
          S228=0;
          break RUN;
        
        case 1 : 
          S228=2;
          S228=2;
          thread769(tdone,ends);
          thread770(tdone,ends);
          thread771(tdone,ends);
          thread772(tdone,ends);
          thread773(tdone,ends);
          thread774(tdone,ends);
          thread775(tdone,ends);
          int biggest776 = 0;
          if(ends[2]>=biggest776){
            biggest776=ends[2];
          }
          if(ends[3]>=biggest776){
            biggest776=ends[3];
          }
          if(ends[4]>=biggest776){
            biggest776=ends[4];
          }
          if(ends[5]>=biggest776){
            biggest776=ends[5];
          }
          if(ends[6]>=biggest776){
            biggest776=ends[6];
          }
          if(ends[7]>=biggest776){
            biggest776=ends[7];
          }
          if(ends[8]>=biggest776){
            biggest776=ends[8];
          }
          if(biggest776 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
        
        case 2 : 
          thread777(tdone,ends);
          thread778(tdone,ends);
          thread779(tdone,ends);
          thread780(tdone,ends);
          thread781(tdone,ends);
          thread782(tdone,ends);
          thread783(tdone,ends);
          int biggest784 = 0;
          if(ends[2]>=biggest784){
            biggest784=ends[2];
          }
          if(ends[3]>=biggest784){
            biggest784=ends[3];
          }
          if(ends[4]>=biggest784){
            biggest784=ends[4];
          }
          if(ends[5]>=biggest784){
            biggest784=ends[5];
          }
          if(ends[6]>=biggest784){
            biggest784=ends[6];
          }
          if(ends[7]>=biggest784){
            biggest784=ends[7];
          }
          if(ends[8]>=biggest784){
            biggest784=ends[8];
          }
          if(biggest784 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
          //FINXME code
          if(biggest784 == 0){
            S228=0;
            active[1]=0;
            ends[1]=0;
            S228=0;
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
