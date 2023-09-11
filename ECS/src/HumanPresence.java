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
  private int S666 = 1;
  private int S94 = 1;
  private int S22 = 1;
  private int S6 = 1;
  private int S1 = 1;
  private int S26 = 1;
  private int S189 = 1;
  private int S117 = 1;
  private int S101 = 1;
  private int S96 = 1;
  private int S121 = 1;
  private int S284 = 1;
  private int S212 = 1;
  private int S196 = 1;
  private int S191 = 1;
  private int S216 = 1;
  private int S379 = 1;
  private int S307 = 1;
  private int S291 = 1;
  private int S286 = 1;
  private int S311 = 1;
  private int S474 = 1;
  private int S402 = 1;
  private int S386 = 1;
  private int S381 = 1;
  private int S406 = 1;
  private int S569 = 1;
  private int S497 = 1;
  private int S481 = 1;
  private int S476 = 1;
  private int S501 = 1;
  private int S664 = 1;
  private int S592 = 1;
  private int S576 = 1;
  private int S571 = 1;
  private int S596 = 1;
  
  private int[] ends = new int[18];
  private int[] tdone = new int[18];
  
  public void thread2760(int [] tdone, int [] ends){
        switch(S664){
      case 0 : 
        active[8]=0;
        ends[8]=0;
        tdone[8]=1;
        break;
      
      case 1 : 
        switch(S592){
          case 0 : 
            switch(S576){
              case 0 : 
                if(!zone7P_in.isPartnerPresent() || zone7P_in.isPartnerPreempted()){//sysj\controller.sysj line: 117, column: 5
                  zone7P_in.setACK(false);//sysj\controller.sysj line: 117, column: 5
                  S576=1;
                  active[8]=1;
                  ends[8]=1;
                  tdone[8]=1;
                }
                else {
                  switch(S571){
                    case 0 : 
                      if(!zone7P_in.isREQ()){//sysj\controller.sysj line: 117, column: 5
                        zone7P_in.setACK(true);//sysj\controller.sysj line: 117, column: 5
                        S571=1;
                        if(zone7P_in.isREQ()){//sysj\controller.sysj line: 117, column: 5
                          zone7P_in.setACK(false);//sysj\controller.sysj line: 117, column: 5
                          ends[8]=2;
                          ;//sysj\controller.sysj line: 117, column: 5
                          S592=1;
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
                      if(zone7P_in.isREQ()){//sysj\controller.sysj line: 117, column: 5
                        zone7P_in.setACK(false);//sysj\controller.sysj line: 117, column: 5
                        ends[8]=2;
                        ;//sysj\controller.sysj line: 117, column: 5
                        S592=1;
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
                S576=1;
                S576=0;
                if(!zone7P_in.isPartnerPresent() || zone7P_in.isPartnerPreempted()){//sysj\controller.sysj line: 117, column: 5
                  zone7P_in.setACK(false);//sysj\controller.sysj line: 117, column: 5
                  S576=1;
                  active[8]=1;
                  ends[8]=1;
                  tdone[8]=1;
                }
                else {
                  S571=0;
                  if(!zone7P_in.isREQ()){//sysj\controller.sysj line: 117, column: 5
                    zone7P_in.setACK(true);//sysj\controller.sysj line: 117, column: 5
                    S571=1;
                    if(zone7P_in.isREQ()){//sysj\controller.sysj line: 117, column: 5
                      zone7P_in.setACK(false);//sysj\controller.sysj line: 117, column: 5
                      ends[8]=2;
                      ;//sysj\controller.sysj line: 117, column: 5
                      S592=1;
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
            S592=1;
            S592=2;
            if((zone4P_in.getVal() == null ? false : ((Boolean)zone4P_in.getVal()).booleanValue()) == true){//sysj\controller.sysj line: 119, column: 9
              S596=0;
              System.out.println("detected");//sysj\controller.sysj line: 120, column: 6
              zone4Light.setPresent();//sysj\controller.sysj line: 121, column: 6
              currsigs.addElement(zone4Light);
              zone4Light.setValue("detected");//sysj\controller.sysj line: 121, column: 6
              active[8]=1;
              ends[8]=1;
              tdone[8]=1;
            }
            else {
              S596=1;
              if((zone4P_in.getVal() == null ? false : ((Boolean)zone4P_in.getVal()).booleanValue()) == false){//sysj\controller.sysj line: 125, column: 13
                System.out.println("notdetected");//sysj\controller.sysj line: 126, column: 7
                zone4Light.setPresent();//sysj\controller.sysj line: 127, column: 7
                currsigs.addElement(zone4Light);
                zone4Light.setValue("notdetected");//sysj\controller.sysj line: 127, column: 7
                active[8]=1;
                ends[8]=1;
                tdone[8]=1;
              }
              else {
                S592=3;
                active[8]=1;
                ends[8]=1;
                tdone[8]=1;
              }
            }
            break;
          
          case 2 : 
            switch(S596){
              case 0 : 
                S592=3;
                active[8]=1;
                ends[8]=1;
                tdone[8]=1;
                break;
              
              case 1 : 
                S592=3;
                active[8]=1;
                ends[8]=1;
                tdone[8]=1;
                break;
              
            }
            break;
          
          case 3 : 
            S592=3;
            S592=0;
            S576=0;
            if(!zone7P_in.isPartnerPresent() || zone7P_in.isPartnerPreempted()){//sysj\controller.sysj line: 117, column: 5
              zone7P_in.setACK(false);//sysj\controller.sysj line: 117, column: 5
              S576=1;
              active[8]=1;
              ends[8]=1;
              tdone[8]=1;
            }
            else {
              S571=0;
              if(!zone7P_in.isREQ()){//sysj\controller.sysj line: 117, column: 5
                zone7P_in.setACK(true);//sysj\controller.sysj line: 117, column: 5
                S571=1;
                if(zone7P_in.isREQ()){//sysj\controller.sysj line: 117, column: 5
                  zone7P_in.setACK(false);//sysj\controller.sysj line: 117, column: 5
                  ends[8]=2;
                  ;//sysj\controller.sysj line: 117, column: 5
                  S592=1;
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
      
    }
  }

  public void thread2759(int [] tdone, int [] ends){
        switch(S569){
      case 0 : 
        active[7]=0;
        ends[7]=0;
        tdone[7]=1;
        break;
      
      case 1 : 
        switch(S497){
          case 0 : 
            switch(S481){
              case 0 : 
                if(!zone6P_in.isPartnerPresent() || zone6P_in.isPartnerPreempted()){//sysj\controller.sysj line: 100, column: 5
                  zone6P_in.setACK(false);//sysj\controller.sysj line: 100, column: 5
                  S481=1;
                  active[7]=1;
                  ends[7]=1;
                  tdone[7]=1;
                }
                else {
                  switch(S476){
                    case 0 : 
                      if(!zone6P_in.isREQ()){//sysj\controller.sysj line: 100, column: 5
                        zone6P_in.setACK(true);//sysj\controller.sysj line: 100, column: 5
                        S476=1;
                        if(zone6P_in.isREQ()){//sysj\controller.sysj line: 100, column: 5
                          zone6P_in.setACK(false);//sysj\controller.sysj line: 100, column: 5
                          ends[7]=2;
                          ;//sysj\controller.sysj line: 100, column: 5
                          S497=1;
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
                      if(zone6P_in.isREQ()){//sysj\controller.sysj line: 100, column: 5
                        zone6P_in.setACK(false);//sysj\controller.sysj line: 100, column: 5
                        ends[7]=2;
                        ;//sysj\controller.sysj line: 100, column: 5
                        S497=1;
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
                S481=1;
                S481=0;
                if(!zone6P_in.isPartnerPresent() || zone6P_in.isPartnerPreempted()){//sysj\controller.sysj line: 100, column: 5
                  zone6P_in.setACK(false);//sysj\controller.sysj line: 100, column: 5
                  S481=1;
                  active[7]=1;
                  ends[7]=1;
                  tdone[7]=1;
                }
                else {
                  S476=0;
                  if(!zone6P_in.isREQ()){//sysj\controller.sysj line: 100, column: 5
                    zone6P_in.setACK(true);//sysj\controller.sysj line: 100, column: 5
                    S476=1;
                    if(zone6P_in.isREQ()){//sysj\controller.sysj line: 100, column: 5
                      zone6P_in.setACK(false);//sysj\controller.sysj line: 100, column: 5
                      ends[7]=2;
                      ;//sysj\controller.sysj line: 100, column: 5
                      S497=1;
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
            S497=1;
            S497=2;
            if((zone6P_in.getVal() == null ? false : ((Boolean)zone6P_in.getVal()).booleanValue()) == true){//sysj\controller.sysj line: 102, column: 9
              S501=0;
              System.out.println("detected");//sysj\controller.sysj line: 103, column: 6
              zone6Light.setPresent();//sysj\controller.sysj line: 104, column: 6
              currsigs.addElement(zone6Light);
              zone6Light.setValue("detected");//sysj\controller.sysj line: 104, column: 6
              active[7]=1;
              ends[7]=1;
              tdone[7]=1;
            }
            else {
              S501=1;
              if((zone6P_in.getVal() == null ? false : ((Boolean)zone6P_in.getVal()).booleanValue()) == false){//sysj\controller.sysj line: 108, column: 13
                System.out.println("notdetected");//sysj\controller.sysj line: 109, column: 7
                zone6Light.setPresent();//sysj\controller.sysj line: 110, column: 7
                currsigs.addElement(zone6Light);
                zone6Light.setValue("notdetected");//sysj\controller.sysj line: 110, column: 7
                active[7]=1;
                ends[7]=1;
                tdone[7]=1;
              }
              else {
                S497=3;
                active[7]=1;
                ends[7]=1;
                tdone[7]=1;
              }
            }
            break;
          
          case 2 : 
            switch(S501){
              case 0 : 
                S497=3;
                active[7]=1;
                ends[7]=1;
                tdone[7]=1;
                break;
              
              case 1 : 
                S497=3;
                active[7]=1;
                ends[7]=1;
                tdone[7]=1;
                break;
              
            }
            break;
          
          case 3 : 
            S497=3;
            S497=0;
            S481=0;
            if(!zone6P_in.isPartnerPresent() || zone6P_in.isPartnerPreempted()){//sysj\controller.sysj line: 100, column: 5
              zone6P_in.setACK(false);//sysj\controller.sysj line: 100, column: 5
              S481=1;
              active[7]=1;
              ends[7]=1;
              tdone[7]=1;
            }
            else {
              S476=0;
              if(!zone6P_in.isREQ()){//sysj\controller.sysj line: 100, column: 5
                zone6P_in.setACK(true);//sysj\controller.sysj line: 100, column: 5
                S476=1;
                if(zone6P_in.isREQ()){//sysj\controller.sysj line: 100, column: 5
                  zone6P_in.setACK(false);//sysj\controller.sysj line: 100, column: 5
                  ends[7]=2;
                  ;//sysj\controller.sysj line: 100, column: 5
                  S497=1;
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
      
    }
  }

  public void thread2758(int [] tdone, int [] ends){
        switch(S474){
      case 0 : 
        active[6]=0;
        ends[6]=0;
        tdone[6]=1;
        break;
      
      case 1 : 
        switch(S402){
          case 0 : 
            switch(S386){
              case 0 : 
                if(!zone5P_in.isPartnerPresent() || zone5P_in.isPartnerPreempted()){//sysj\controller.sysj line: 83, column: 5
                  zone5P_in.setACK(false);//sysj\controller.sysj line: 83, column: 5
                  S386=1;
                  active[6]=1;
                  ends[6]=1;
                  tdone[6]=1;
                }
                else {
                  switch(S381){
                    case 0 : 
                      if(!zone5P_in.isREQ()){//sysj\controller.sysj line: 83, column: 5
                        zone5P_in.setACK(true);//sysj\controller.sysj line: 83, column: 5
                        S381=1;
                        if(zone5P_in.isREQ()){//sysj\controller.sysj line: 83, column: 5
                          zone5P_in.setACK(false);//sysj\controller.sysj line: 83, column: 5
                          ends[6]=2;
                          ;//sysj\controller.sysj line: 83, column: 5
                          S402=1;
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
                      if(zone5P_in.isREQ()){//sysj\controller.sysj line: 83, column: 5
                        zone5P_in.setACK(false);//sysj\controller.sysj line: 83, column: 5
                        ends[6]=2;
                        ;//sysj\controller.sysj line: 83, column: 5
                        S402=1;
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
                S386=1;
                S386=0;
                if(!zone5P_in.isPartnerPresent() || zone5P_in.isPartnerPreempted()){//sysj\controller.sysj line: 83, column: 5
                  zone5P_in.setACK(false);//sysj\controller.sysj line: 83, column: 5
                  S386=1;
                  active[6]=1;
                  ends[6]=1;
                  tdone[6]=1;
                }
                else {
                  S381=0;
                  if(!zone5P_in.isREQ()){//sysj\controller.sysj line: 83, column: 5
                    zone5P_in.setACK(true);//sysj\controller.sysj line: 83, column: 5
                    S381=1;
                    if(zone5P_in.isREQ()){//sysj\controller.sysj line: 83, column: 5
                      zone5P_in.setACK(false);//sysj\controller.sysj line: 83, column: 5
                      ends[6]=2;
                      ;//sysj\controller.sysj line: 83, column: 5
                      S402=1;
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
            S402=1;
            S402=2;
            if((zone5P_in.getVal() == null ? false : ((Boolean)zone5P_in.getVal()).booleanValue()) == true){//sysj\controller.sysj line: 85, column: 9
              S406=0;
              System.out.println("detected");//sysj\controller.sysj line: 86, column: 6
              zone5Light.setPresent();//sysj\controller.sysj line: 87, column: 6
              currsigs.addElement(zone5Light);
              zone5Light.setValue("detected");//sysj\controller.sysj line: 87, column: 6
              active[6]=1;
              ends[6]=1;
              tdone[6]=1;
            }
            else {
              S406=1;
              if((zone5P_in.getVal() == null ? false : ((Boolean)zone5P_in.getVal()).booleanValue()) == false){//sysj\controller.sysj line: 91, column: 13
                System.out.println("notdetected");//sysj\controller.sysj line: 92, column: 7
                zone5Light.setPresent();//sysj\controller.sysj line: 93, column: 7
                currsigs.addElement(zone5Light);
                zone5Light.setValue("notdetected");//sysj\controller.sysj line: 93, column: 7
                active[6]=1;
                ends[6]=1;
                tdone[6]=1;
              }
              else {
                S402=3;
                active[6]=1;
                ends[6]=1;
                tdone[6]=1;
              }
            }
            break;
          
          case 2 : 
            switch(S406){
              case 0 : 
                S402=3;
                active[6]=1;
                ends[6]=1;
                tdone[6]=1;
                break;
              
              case 1 : 
                S402=3;
                active[6]=1;
                ends[6]=1;
                tdone[6]=1;
                break;
              
            }
            break;
          
          case 3 : 
            S402=3;
            S402=0;
            S386=0;
            if(!zone5P_in.isPartnerPresent() || zone5P_in.isPartnerPreempted()){//sysj\controller.sysj line: 83, column: 5
              zone5P_in.setACK(false);//sysj\controller.sysj line: 83, column: 5
              S386=1;
              active[6]=1;
              ends[6]=1;
              tdone[6]=1;
            }
            else {
              S381=0;
              if(!zone5P_in.isREQ()){//sysj\controller.sysj line: 83, column: 5
                zone5P_in.setACK(true);//sysj\controller.sysj line: 83, column: 5
                S381=1;
                if(zone5P_in.isREQ()){//sysj\controller.sysj line: 83, column: 5
                  zone5P_in.setACK(false);//sysj\controller.sysj line: 83, column: 5
                  ends[6]=2;
                  ;//sysj\controller.sysj line: 83, column: 5
                  S402=1;
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
      
    }
  }

  public void thread2757(int [] tdone, int [] ends){
        switch(S379){
      case 0 : 
        active[5]=0;
        ends[5]=0;
        tdone[5]=1;
        break;
      
      case 1 : 
        switch(S307){
          case 0 : 
            switch(S291){
              case 0 : 
                if(!zone4P_in.isPartnerPresent() || zone4P_in.isPartnerPreempted()){//sysj\controller.sysj line: 66, column: 5
                  zone4P_in.setACK(false);//sysj\controller.sysj line: 66, column: 5
                  S291=1;
                  active[5]=1;
                  ends[5]=1;
                  tdone[5]=1;
                }
                else {
                  switch(S286){
                    case 0 : 
                      if(!zone4P_in.isREQ()){//sysj\controller.sysj line: 66, column: 5
                        zone4P_in.setACK(true);//sysj\controller.sysj line: 66, column: 5
                        S286=1;
                        if(zone4P_in.isREQ()){//sysj\controller.sysj line: 66, column: 5
                          zone4P_in.setACK(false);//sysj\controller.sysj line: 66, column: 5
                          ends[5]=2;
                          ;//sysj\controller.sysj line: 66, column: 5
                          S307=1;
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
                      if(zone4P_in.isREQ()){//sysj\controller.sysj line: 66, column: 5
                        zone4P_in.setACK(false);//sysj\controller.sysj line: 66, column: 5
                        ends[5]=2;
                        ;//sysj\controller.sysj line: 66, column: 5
                        S307=1;
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
                S291=1;
                S291=0;
                if(!zone4P_in.isPartnerPresent() || zone4P_in.isPartnerPreempted()){//sysj\controller.sysj line: 66, column: 5
                  zone4P_in.setACK(false);//sysj\controller.sysj line: 66, column: 5
                  S291=1;
                  active[5]=1;
                  ends[5]=1;
                  tdone[5]=1;
                }
                else {
                  S286=0;
                  if(!zone4P_in.isREQ()){//sysj\controller.sysj line: 66, column: 5
                    zone4P_in.setACK(true);//sysj\controller.sysj line: 66, column: 5
                    S286=1;
                    if(zone4P_in.isREQ()){//sysj\controller.sysj line: 66, column: 5
                      zone4P_in.setACK(false);//sysj\controller.sysj line: 66, column: 5
                      ends[5]=2;
                      ;//sysj\controller.sysj line: 66, column: 5
                      S307=1;
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
            S307=1;
            S307=2;
            if((zone4P_in.getVal() == null ? false : ((Boolean)zone4P_in.getVal()).booleanValue()) == true){//sysj\controller.sysj line: 68, column: 9
              S311=0;
              System.out.println("detected");//sysj\controller.sysj line: 69, column: 6
              zone4Light.setPresent();//sysj\controller.sysj line: 70, column: 6
              currsigs.addElement(zone4Light);
              zone4Light.setValue("detected");//sysj\controller.sysj line: 70, column: 6
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            else {
              S311=1;
              if((zone4P_in.getVal() == null ? false : ((Boolean)zone4P_in.getVal()).booleanValue()) == false){//sysj\controller.sysj line: 74, column: 13
                System.out.println("notdetected");//sysj\controller.sysj line: 75, column: 7
                zone4Light.setPresent();//sysj\controller.sysj line: 76, column: 7
                currsigs.addElement(zone4Light);
                zone4Light.setValue("notdetected");//sysj\controller.sysj line: 76, column: 7
                active[5]=1;
                ends[5]=1;
                tdone[5]=1;
              }
              else {
                S307=3;
                active[5]=1;
                ends[5]=1;
                tdone[5]=1;
              }
            }
            break;
          
          case 2 : 
            switch(S311){
              case 0 : 
                S307=3;
                active[5]=1;
                ends[5]=1;
                tdone[5]=1;
                break;
              
              case 1 : 
                S307=3;
                active[5]=1;
                ends[5]=1;
                tdone[5]=1;
                break;
              
            }
            break;
          
          case 3 : 
            S307=3;
            S307=0;
            S291=0;
            if(!zone4P_in.isPartnerPresent() || zone4P_in.isPartnerPreempted()){//sysj\controller.sysj line: 66, column: 5
              zone4P_in.setACK(false);//sysj\controller.sysj line: 66, column: 5
              S291=1;
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            else {
              S286=0;
              if(!zone4P_in.isREQ()){//sysj\controller.sysj line: 66, column: 5
                zone4P_in.setACK(true);//sysj\controller.sysj line: 66, column: 5
                S286=1;
                if(zone4P_in.isREQ()){//sysj\controller.sysj line: 66, column: 5
                  zone4P_in.setACK(false);//sysj\controller.sysj line: 66, column: 5
                  ends[5]=2;
                  ;//sysj\controller.sysj line: 66, column: 5
                  S307=1;
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
      
    }
  }

  public void thread2756(int [] tdone, int [] ends){
        switch(S284){
      case 0 : 
        active[4]=0;
        ends[4]=0;
        tdone[4]=1;
        break;
      
      case 1 : 
        switch(S212){
          case 0 : 
            switch(S196){
              case 0 : 
                if(!zone3P_in.isPartnerPresent() || zone3P_in.isPartnerPreempted()){//sysj\controller.sysj line: 46, column: 4
                  zone3P_in.setACK(false);//sysj\controller.sysj line: 46, column: 4
                  S196=1;
                  active[4]=1;
                  ends[4]=1;
                  tdone[4]=1;
                }
                else {
                  switch(S191){
                    case 0 : 
                      if(!zone3P_in.isREQ()){//sysj\controller.sysj line: 46, column: 4
                        zone3P_in.setACK(true);//sysj\controller.sysj line: 46, column: 4
                        S191=1;
                        if(zone3P_in.isREQ()){//sysj\controller.sysj line: 46, column: 4
                          zone3P_in.setACK(false);//sysj\controller.sysj line: 46, column: 4
                          ends[4]=2;
                          ;//sysj\controller.sysj line: 46, column: 4
                          S212=1;
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
                      if(zone3P_in.isREQ()){//sysj\controller.sysj line: 46, column: 4
                        zone3P_in.setACK(false);//sysj\controller.sysj line: 46, column: 4
                        ends[4]=2;
                        ;//sysj\controller.sysj line: 46, column: 4
                        S212=1;
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
                S196=1;
                S196=0;
                if(!zone3P_in.isPartnerPresent() || zone3P_in.isPartnerPreempted()){//sysj\controller.sysj line: 46, column: 4
                  zone3P_in.setACK(false);//sysj\controller.sysj line: 46, column: 4
                  S196=1;
                  active[4]=1;
                  ends[4]=1;
                  tdone[4]=1;
                }
                else {
                  S191=0;
                  if(!zone3P_in.isREQ()){//sysj\controller.sysj line: 46, column: 4
                    zone3P_in.setACK(true);//sysj\controller.sysj line: 46, column: 4
                    S191=1;
                    if(zone3P_in.isREQ()){//sysj\controller.sysj line: 46, column: 4
                      zone3P_in.setACK(false);//sysj\controller.sysj line: 46, column: 4
                      ends[4]=2;
                      ;//sysj\controller.sysj line: 46, column: 4
                      S212=1;
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
            S212=1;
            S212=2;
            if((zone3P_in.getVal() == null ? false : ((Boolean)zone3P_in.getVal()).booleanValue()) == true){//sysj\controller.sysj line: 48, column: 8
              S216=0;
              zone3Light.setPresent();//sysj\controller.sysj line: 50, column: 5
              currsigs.addElement(zone3Light);
              zone3Light.setValue("detected");//sysj\controller.sysj line: 50, column: 5
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            else {
              S216=1;
              if((zone3P_in.getVal() == null ? false : ((Boolean)zone3P_in.getVal()).booleanValue()) == false){//sysj\controller.sysj line: 54, column: 12
                zone3Light.setPresent();//sysj\controller.sysj line: 57, column: 6
                currsigs.addElement(zone3Light);
                zone3Light.setValue("notdetected");//sysj\controller.sysj line: 57, column: 6
                active[4]=1;
                ends[4]=1;
                tdone[4]=1;
              }
              else {
                S212=3;
                active[4]=1;
                ends[4]=1;
                tdone[4]=1;
              }
            }
            break;
          
          case 2 : 
            switch(S216){
              case 0 : 
                S212=3;
                active[4]=1;
                ends[4]=1;
                tdone[4]=1;
                break;
              
              case 1 : 
                S212=3;
                active[4]=1;
                ends[4]=1;
                tdone[4]=1;
                break;
              
            }
            break;
          
          case 3 : 
            S212=3;
            S212=0;
            S196=0;
            if(!zone3P_in.isPartnerPresent() || zone3P_in.isPartnerPreempted()){//sysj\controller.sysj line: 46, column: 4
              zone3P_in.setACK(false);//sysj\controller.sysj line: 46, column: 4
              S196=1;
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            else {
              S191=0;
              if(!zone3P_in.isREQ()){//sysj\controller.sysj line: 46, column: 4
                zone3P_in.setACK(true);//sysj\controller.sysj line: 46, column: 4
                S191=1;
                if(zone3P_in.isREQ()){//sysj\controller.sysj line: 46, column: 4
                  zone3P_in.setACK(false);//sysj\controller.sysj line: 46, column: 4
                  ends[4]=2;
                  ;//sysj\controller.sysj line: 46, column: 4
                  S212=1;
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

  public void thread2755(int [] tdone, int [] ends){
        switch(S189){
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
                if(!zone2P_in.isPartnerPresent() || zone2P_in.isPartnerPreempted()){//sysj\controller.sysj line: 28, column: 5
                  zone2P_in.setACK(false);//sysj\controller.sysj line: 28, column: 5
                  S101=1;
                  active[3]=1;
                  ends[3]=1;
                  tdone[3]=1;
                }
                else {
                  switch(S96){
                    case 0 : 
                      if(!zone2P_in.isREQ()){//sysj\controller.sysj line: 28, column: 5
                        zone2P_in.setACK(true);//sysj\controller.sysj line: 28, column: 5
                        S96=1;
                        if(zone2P_in.isREQ()){//sysj\controller.sysj line: 28, column: 5
                          zone2P_in.setACK(false);//sysj\controller.sysj line: 28, column: 5
                          ends[3]=2;
                          ;//sysj\controller.sysj line: 28, column: 5
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
                      if(zone2P_in.isREQ()){//sysj\controller.sysj line: 28, column: 5
                        zone2P_in.setACK(false);//sysj\controller.sysj line: 28, column: 5
                        ends[3]=2;
                        ;//sysj\controller.sysj line: 28, column: 5
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
                if(!zone2P_in.isPartnerPresent() || zone2P_in.isPartnerPreempted()){//sysj\controller.sysj line: 28, column: 5
                  zone2P_in.setACK(false);//sysj\controller.sysj line: 28, column: 5
                  S101=1;
                  active[3]=1;
                  ends[3]=1;
                  tdone[3]=1;
                }
                else {
                  S96=0;
                  if(!zone2P_in.isREQ()){//sysj\controller.sysj line: 28, column: 5
                    zone2P_in.setACK(true);//sysj\controller.sysj line: 28, column: 5
                    S96=1;
                    if(zone2P_in.isREQ()){//sysj\controller.sysj line: 28, column: 5
                      zone2P_in.setACK(false);//sysj\controller.sysj line: 28, column: 5
                      ends[3]=2;
                      ;//sysj\controller.sysj line: 28, column: 5
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
            S117=2;
            if((zone2P_in.getVal() == null ? false : ((Boolean)zone2P_in.getVal()).booleanValue()) == true){//sysj\controller.sysj line: 30, column: 9
              S121=0;
              System.out.println("detected");//sysj\controller.sysj line: 31, column: 6
              zone2Light.setPresent();//sysj\controller.sysj line: 32, column: 6
              currsigs.addElement(zone2Light);
              zone2Light.setValue("detected");//sysj\controller.sysj line: 32, column: 6
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            else {
              S121=1;
              if((zone2P_in.getVal() == null ? false : ((Boolean)zone2P_in.getVal()).booleanValue()) == false){//sysj\controller.sysj line: 36, column: 13
                System.out.println("notdetected");//sysj\controller.sysj line: 37, column: 7
                zone2Light.setPresent();//sysj\controller.sysj line: 38, column: 7
                currsigs.addElement(zone2Light);
                zone2Light.setValue("notdetected");//sysj\controller.sysj line: 38, column: 7
                active[3]=1;
                ends[3]=1;
                tdone[3]=1;
              }
              else {
                S117=3;
                active[3]=1;
                ends[3]=1;
                tdone[3]=1;
              }
            }
            break;
          
          case 2 : 
            switch(S121){
              case 0 : 
                S117=3;
                active[3]=1;
                ends[3]=1;
                tdone[3]=1;
                break;
              
              case 1 : 
                S117=3;
                active[3]=1;
                ends[3]=1;
                tdone[3]=1;
                break;
              
            }
            break;
          
          case 3 : 
            S117=3;
            S117=0;
            S101=0;
            if(!zone2P_in.isPartnerPresent() || zone2P_in.isPartnerPreempted()){//sysj\controller.sysj line: 28, column: 5
              zone2P_in.setACK(false);//sysj\controller.sysj line: 28, column: 5
              S101=1;
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            else {
              S96=0;
              if(!zone2P_in.isREQ()){//sysj\controller.sysj line: 28, column: 5
                zone2P_in.setACK(true);//sysj\controller.sysj line: 28, column: 5
                S96=1;
                if(zone2P_in.isREQ()){//sysj\controller.sysj line: 28, column: 5
                  zone2P_in.setACK(false);//sysj\controller.sysj line: 28, column: 5
                  ends[3]=2;
                  ;//sysj\controller.sysj line: 28, column: 5
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
      
    }
  }

  public void thread2754(int [] tdone, int [] ends){
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
                if(!zone1P_in.isPartnerPresent() || zone1P_in.isPartnerPreempted()){//sysj\controller.sysj line: 10, column: 5
                  zone1P_in.setACK(false);//sysj\controller.sysj line: 10, column: 5
                  S6=1;
                  active[2]=1;
                  ends[2]=1;
                  tdone[2]=1;
                }
                else {
                  switch(S1){
                    case 0 : 
                      if(!zone1P_in.isREQ()){//sysj\controller.sysj line: 10, column: 5
                        zone1P_in.setACK(true);//sysj\controller.sysj line: 10, column: 5
                        S1=1;
                        if(zone1P_in.isREQ()){//sysj\controller.sysj line: 10, column: 5
                          zone1P_in.setACK(false);//sysj\controller.sysj line: 10, column: 5
                          ends[2]=2;
                          ;//sysj\controller.sysj line: 10, column: 5
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
                      if(zone1P_in.isREQ()){//sysj\controller.sysj line: 10, column: 5
                        zone1P_in.setACK(false);//sysj\controller.sysj line: 10, column: 5
                        ends[2]=2;
                        ;//sysj\controller.sysj line: 10, column: 5
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
                if(!zone1P_in.isPartnerPresent() || zone1P_in.isPartnerPreempted()){//sysj\controller.sysj line: 10, column: 5
                  zone1P_in.setACK(false);//sysj\controller.sysj line: 10, column: 5
                  S6=1;
                  active[2]=1;
                  ends[2]=1;
                  tdone[2]=1;
                }
                else {
                  S1=0;
                  if(!zone1P_in.isREQ()){//sysj\controller.sysj line: 10, column: 5
                    zone1P_in.setACK(true);//sysj\controller.sysj line: 10, column: 5
                    S1=1;
                    if(zone1P_in.isREQ()){//sysj\controller.sysj line: 10, column: 5
                      zone1P_in.setACK(false);//sysj\controller.sysj line: 10, column: 5
                      ends[2]=2;
                      ;//sysj\controller.sysj line: 10, column: 5
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
            if((zone1P_in.getVal() == null ? false : ((Boolean)zone1P_in.getVal()).booleanValue()) == true){//sysj\controller.sysj line: 12, column: 9
              S26=0;
              System.out.println("detected");//sysj\controller.sysj line: 13, column: 6
              zone1Light.setPresent();//sysj\controller.sysj line: 14, column: 6
              currsigs.addElement(zone1Light);
              zone1Light.setValue("detected");//sysj\controller.sysj line: 14, column: 6
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            else {
              S26=1;
              if((zone1P_in.getVal() == null ? false : ((Boolean)zone1P_in.getVal()).booleanValue()) == false){//sysj\controller.sysj line: 18, column: 13
                System.out.println("notdetected");//sysj\controller.sysj line: 19, column: 7
                zone1Light.setPresent();//sysj\controller.sysj line: 20, column: 7
                currsigs.addElement(zone1Light);
                zone1Light.setValue("notdetected");//sysj\controller.sysj line: 20, column: 7
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
            if(!zone1P_in.isPartnerPresent() || zone1P_in.isPartnerPreempted()){//sysj\controller.sysj line: 10, column: 5
              zone1P_in.setACK(false);//sysj\controller.sysj line: 10, column: 5
              S6=1;
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            else {
              S1=0;
              if(!zone1P_in.isREQ()){//sysj\controller.sysj line: 10, column: 5
                zone1P_in.setACK(true);//sysj\controller.sysj line: 10, column: 5
                S1=1;
                if(zone1P_in.isREQ()){//sysj\controller.sysj line: 10, column: 5
                  zone1P_in.setACK(false);//sysj\controller.sysj line: 10, column: 5
                  ends[2]=2;
                  ;//sysj\controller.sysj line: 10, column: 5
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

  public void thread2752(int [] tdone, int [] ends){
        S664=1;
    S592=0;
    S576=0;
    if(!zone7P_in.isPartnerPresent() || zone7P_in.isPartnerPreempted()){//sysj\controller.sysj line: 117, column: 5
      zone7P_in.setACK(false);//sysj\controller.sysj line: 117, column: 5
      S576=1;
      active[8]=1;
      ends[8]=1;
      tdone[8]=1;
    }
    else {
      S571=0;
      if(!zone7P_in.isREQ()){//sysj\controller.sysj line: 117, column: 5
        zone7P_in.setACK(true);//sysj\controller.sysj line: 117, column: 5
        S571=1;
        if(zone7P_in.isREQ()){//sysj\controller.sysj line: 117, column: 5
          zone7P_in.setACK(false);//sysj\controller.sysj line: 117, column: 5
          ends[8]=2;
          ;//sysj\controller.sysj line: 117, column: 5
          S592=1;
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

  public void thread2751(int [] tdone, int [] ends){
        S569=1;
    S497=0;
    S481=0;
    if(!zone6P_in.isPartnerPresent() || zone6P_in.isPartnerPreempted()){//sysj\controller.sysj line: 100, column: 5
      zone6P_in.setACK(false);//sysj\controller.sysj line: 100, column: 5
      S481=1;
      active[7]=1;
      ends[7]=1;
      tdone[7]=1;
    }
    else {
      S476=0;
      if(!zone6P_in.isREQ()){//sysj\controller.sysj line: 100, column: 5
        zone6P_in.setACK(true);//sysj\controller.sysj line: 100, column: 5
        S476=1;
        if(zone6P_in.isREQ()){//sysj\controller.sysj line: 100, column: 5
          zone6P_in.setACK(false);//sysj\controller.sysj line: 100, column: 5
          ends[7]=2;
          ;//sysj\controller.sysj line: 100, column: 5
          S497=1;
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

  public void thread2750(int [] tdone, int [] ends){
        S474=1;
    S402=0;
    S386=0;
    if(!zone5P_in.isPartnerPresent() || zone5P_in.isPartnerPreempted()){//sysj\controller.sysj line: 83, column: 5
      zone5P_in.setACK(false);//sysj\controller.sysj line: 83, column: 5
      S386=1;
      active[6]=1;
      ends[6]=1;
      tdone[6]=1;
    }
    else {
      S381=0;
      if(!zone5P_in.isREQ()){//sysj\controller.sysj line: 83, column: 5
        zone5P_in.setACK(true);//sysj\controller.sysj line: 83, column: 5
        S381=1;
        if(zone5P_in.isREQ()){//sysj\controller.sysj line: 83, column: 5
          zone5P_in.setACK(false);//sysj\controller.sysj line: 83, column: 5
          ends[6]=2;
          ;//sysj\controller.sysj line: 83, column: 5
          S402=1;
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

  public void thread2749(int [] tdone, int [] ends){
        S379=1;
    S307=0;
    S291=0;
    if(!zone4P_in.isPartnerPresent() || zone4P_in.isPartnerPreempted()){//sysj\controller.sysj line: 66, column: 5
      zone4P_in.setACK(false);//sysj\controller.sysj line: 66, column: 5
      S291=1;
      active[5]=1;
      ends[5]=1;
      tdone[5]=1;
    }
    else {
      S286=0;
      if(!zone4P_in.isREQ()){//sysj\controller.sysj line: 66, column: 5
        zone4P_in.setACK(true);//sysj\controller.sysj line: 66, column: 5
        S286=1;
        if(zone4P_in.isREQ()){//sysj\controller.sysj line: 66, column: 5
          zone4P_in.setACK(false);//sysj\controller.sysj line: 66, column: 5
          ends[5]=2;
          ;//sysj\controller.sysj line: 66, column: 5
          S307=1;
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

  public void thread2748(int [] tdone, int [] ends){
        S284=1;
    S212=0;
    S196=0;
    if(!zone3P_in.isPartnerPresent() || zone3P_in.isPartnerPreempted()){//sysj\controller.sysj line: 46, column: 4
      zone3P_in.setACK(false);//sysj\controller.sysj line: 46, column: 4
      S196=1;
      active[4]=1;
      ends[4]=1;
      tdone[4]=1;
    }
    else {
      S191=0;
      if(!zone3P_in.isREQ()){//sysj\controller.sysj line: 46, column: 4
        zone3P_in.setACK(true);//sysj\controller.sysj line: 46, column: 4
        S191=1;
        if(zone3P_in.isREQ()){//sysj\controller.sysj line: 46, column: 4
          zone3P_in.setACK(false);//sysj\controller.sysj line: 46, column: 4
          ends[4]=2;
          ;//sysj\controller.sysj line: 46, column: 4
          S212=1;
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

  public void thread2747(int [] tdone, int [] ends){
        S189=1;
    S117=0;
    S101=0;
    if(!zone2P_in.isPartnerPresent() || zone2P_in.isPartnerPreempted()){//sysj\controller.sysj line: 28, column: 5
      zone2P_in.setACK(false);//sysj\controller.sysj line: 28, column: 5
      S101=1;
      active[3]=1;
      ends[3]=1;
      tdone[3]=1;
    }
    else {
      S96=0;
      if(!zone2P_in.isREQ()){//sysj\controller.sysj line: 28, column: 5
        zone2P_in.setACK(true);//sysj\controller.sysj line: 28, column: 5
        S96=1;
        if(zone2P_in.isREQ()){//sysj\controller.sysj line: 28, column: 5
          zone2P_in.setACK(false);//sysj\controller.sysj line: 28, column: 5
          ends[3]=2;
          ;//sysj\controller.sysj line: 28, column: 5
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

  public void thread2746(int [] tdone, int [] ends){
        S94=1;
    S22=0;
    S6=0;
    if(!zone1P_in.isPartnerPresent() || zone1P_in.isPartnerPreempted()){//sysj\controller.sysj line: 10, column: 5
      zone1P_in.setACK(false);//sysj\controller.sysj line: 10, column: 5
      S6=1;
      active[2]=1;
      ends[2]=1;
      tdone[2]=1;
    }
    else {
      S1=0;
      if(!zone1P_in.isREQ()){//sysj\controller.sysj line: 10, column: 5
        zone1P_in.setACK(true);//sysj\controller.sysj line: 10, column: 5
        S1=1;
        if(zone1P_in.isREQ()){//sysj\controller.sysj line: 10, column: 5
          zone1P_in.setACK(false);//sysj\controller.sysj line: 10, column: 5
          ends[2]=2;
          ;//sysj\controller.sysj line: 10, column: 5
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
      switch(S666){
        case 0 : 
          S666=0;
          break RUN;
        
        case 1 : 
          S666=2;
          S666=2;
          thread2746(tdone,ends);
          thread2747(tdone,ends);
          thread2748(tdone,ends);
          thread2749(tdone,ends);
          thread2750(tdone,ends);
          thread2751(tdone,ends);
          thread2752(tdone,ends);
          int biggest2753 = 0;
          if(ends[2]>=biggest2753){
            biggest2753=ends[2];
          }
          if(ends[3]>=biggest2753){
            biggest2753=ends[3];
          }
          if(ends[4]>=biggest2753){
            biggest2753=ends[4];
          }
          if(ends[5]>=biggest2753){
            biggest2753=ends[5];
          }
          if(ends[6]>=biggest2753){
            biggest2753=ends[6];
          }
          if(ends[7]>=biggest2753){
            biggest2753=ends[7];
          }
          if(ends[8]>=biggest2753){
            biggest2753=ends[8];
          }
          if(biggest2753 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
        
        case 2 : 
          thread2754(tdone,ends);
          thread2755(tdone,ends);
          thread2756(tdone,ends);
          thread2757(tdone,ends);
          thread2758(tdone,ends);
          thread2759(tdone,ends);
          thread2760(tdone,ends);
          int biggest2761 = 0;
          if(ends[2]>=biggest2761){
            biggest2761=ends[2];
          }
          if(ends[3]>=biggest2761){
            biggest2761=ends[3];
          }
          if(ends[4]>=biggest2761){
            biggest2761=ends[4];
          }
          if(ends[5]>=biggest2761){
            biggest2761=ends[5];
          }
          if(ends[6]>=biggest2761){
            biggest2761=ends[6];
          }
          if(ends[7]>=biggest2761){
            biggest2761=ends[7];
          }
          if(ends[8]>=biggest2761){
            biggest2761=ends[8];
          }
          if(biggest2761 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
          //FINXME code
          if(biggest2761 == 0){
            S666=0;
            active[1]=0;
            ends[1]=0;
            S666=0;
            break RUN;
          }
        
      }
    }
  }

  public void init(){
    char [] active1 = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
    char [] paused1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    char [] suspended1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
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
