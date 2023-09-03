import java.util.*;
import com.systemj.ClockDomain;
import com.systemj.Signal;
import com.systemj.input_Channel;
import com.systemj.output_Channel;

public class Door1 extends ClockDomain{
  public Door1(String name){super(name);}
  Vector currsigs = new Vector();
  private boolean df = false;
  private char [] active;
  private char [] paused;
  private char [] suspended;
  public input_Channel door1Grant_in = new input_Channel();
  public input_Channel door1Deny_in = new input_Channel();
  public output_Channel door1CardReader_o = new output_Channel();
  private String goodCardID_thread_2;//sysj/Exercise6.sysj line: 8, column: 3
  private String badCardID_thread_2;//sysj/Exercise6.sysj line: 9, column: 3
  private long __start_thread_2;//sysj/Exercise6.sysj line: 10, column: 3
  private boolean result_thread_3;//sysj/Exercise6.sysj line: 25, column: 4
  private boolean result_thread_4;//sysj/Exercise6.sysj line: 35, column: 4
  private int S1815 = 1;
  private int S1671 = 1;
  private int S23 = 1;
  private int S7 = 1;
  private int S2 = 1;
  private int S25 = 1;
  private int S58 = 1;
  private int S53 = 1;
  private int S1742 = 1;
  private int S1694 = 1;
  private int S1678 = 1;
  private int S1673 = 1;
  private int S1813 = 1;
  private int S1765 = 1;
  private int S1749 = 1;
  private int S1744 = 1;
  
  private int[] ends = new int[14];
  private int[] tdone = new int[14];
  
  public void thread6341(int [] tdone, int [] ends){
        switch(S1813){
      case 0 : 
        active[4]=0;
        ends[4]=0;
        tdone[4]=1;
        break;
      
      case 1 : 
        switch(S1765){
          case 0 : 
            switch(S1749){
              case 0 : 
                if(!door1Deny_in.isPartnerPresent() || door1Deny_in.isPartnerPreempted()){//sysj/Exercise6.sysj line: 34, column: 4
                  door1Deny_in.setACK(false);//sysj/Exercise6.sysj line: 34, column: 4
                  S1749=1;
                  active[4]=1;
                  ends[4]=1;
                  tdone[4]=1;
                }
                else {
                  switch(S1744){
                    case 0 : 
                      if(!door1Deny_in.isREQ()){//sysj/Exercise6.sysj line: 34, column: 4
                        door1Deny_in.setACK(true);//sysj/Exercise6.sysj line: 34, column: 4
                        S1744=1;
                        if(door1Deny_in.isREQ()){//sysj/Exercise6.sysj line: 34, column: 4
                          door1Deny_in.setACK(false);//sysj/Exercise6.sysj line: 34, column: 4
                          ends[4]=2;
                          ;//sysj/Exercise6.sysj line: 34, column: 4
                          result_thread_4 = (door1Deny_in.getVal() == null ? false : ((Boolean)door1Deny_in.getVal()).booleanValue());//sysj/Exercise6.sysj line: 35, column: 4
                          if(result_thread_4 == true) {//sysj/Exercise6.sysj line: 36, column: 24
                            System.out.println("Door1: Access Denied");//sysj/Exercise6.sysj line: 37, column: 5
                          }
                          S1765=1;
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
                      if(door1Deny_in.isREQ()){//sysj/Exercise6.sysj line: 34, column: 4
                        door1Deny_in.setACK(false);//sysj/Exercise6.sysj line: 34, column: 4
                        ends[4]=2;
                        ;//sysj/Exercise6.sysj line: 34, column: 4
                        result_thread_4 = (door1Deny_in.getVal() == null ? false : ((Boolean)door1Deny_in.getVal()).booleanValue());//sysj/Exercise6.sysj line: 35, column: 4
                        if(result_thread_4 == true) {//sysj/Exercise6.sysj line: 36, column: 24
                          System.out.println("Door1: Access Denied");//sysj/Exercise6.sysj line: 37, column: 5
                        }
                        S1765=1;
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
                S1749=1;
                S1749=0;
                if(!door1Deny_in.isPartnerPresent() || door1Deny_in.isPartnerPreempted()){//sysj/Exercise6.sysj line: 34, column: 4
                  door1Deny_in.setACK(false);//sysj/Exercise6.sysj line: 34, column: 4
                  S1749=1;
                  active[4]=1;
                  ends[4]=1;
                  tdone[4]=1;
                }
                else {
                  S1744=0;
                  if(!door1Deny_in.isREQ()){//sysj/Exercise6.sysj line: 34, column: 4
                    door1Deny_in.setACK(true);//sysj/Exercise6.sysj line: 34, column: 4
                    S1744=1;
                    if(door1Deny_in.isREQ()){//sysj/Exercise6.sysj line: 34, column: 4
                      door1Deny_in.setACK(false);//sysj/Exercise6.sysj line: 34, column: 4
                      ends[4]=2;
                      ;//sysj/Exercise6.sysj line: 34, column: 4
                      result_thread_4 = (door1Deny_in.getVal() == null ? false : ((Boolean)door1Deny_in.getVal()).booleanValue());//sysj/Exercise6.sysj line: 35, column: 4
                      if(result_thread_4 == true) {//sysj/Exercise6.sysj line: 36, column: 24
                        System.out.println("Door1: Access Denied");//sysj/Exercise6.sysj line: 37, column: 5
                      }
                      S1765=1;
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
            S1765=1;
            S1765=0;
            S1749=0;
            if(!door1Deny_in.isPartnerPresent() || door1Deny_in.isPartnerPreempted()){//sysj/Exercise6.sysj line: 34, column: 4
              door1Deny_in.setACK(false);//sysj/Exercise6.sysj line: 34, column: 4
              S1749=1;
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            else {
              S1744=0;
              if(!door1Deny_in.isREQ()){//sysj/Exercise6.sysj line: 34, column: 4
                door1Deny_in.setACK(true);//sysj/Exercise6.sysj line: 34, column: 4
                S1744=1;
                if(door1Deny_in.isREQ()){//sysj/Exercise6.sysj line: 34, column: 4
                  door1Deny_in.setACK(false);//sysj/Exercise6.sysj line: 34, column: 4
                  ends[4]=2;
                  ;//sysj/Exercise6.sysj line: 34, column: 4
                  result_thread_4 = (door1Deny_in.getVal() == null ? false : ((Boolean)door1Deny_in.getVal()).booleanValue());//sysj/Exercise6.sysj line: 35, column: 4
                  if(result_thread_4 == true) {//sysj/Exercise6.sysj line: 36, column: 24
                    System.out.println("Door1: Access Denied");//sysj/Exercise6.sysj line: 37, column: 5
                  }
                  S1765=1;
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

  public void thread6340(int [] tdone, int [] ends){
        switch(S1742){
      case 0 : 
        active[3]=0;
        ends[3]=0;
        tdone[3]=1;
        break;
      
      case 1 : 
        switch(S1694){
          case 0 : 
            switch(S1678){
              case 0 : 
                if(!door1Grant_in.isPartnerPresent() || door1Grant_in.isPartnerPreempted()){//sysj/Exercise6.sysj line: 24, column: 4
                  door1Grant_in.setACK(false);//sysj/Exercise6.sysj line: 24, column: 4
                  S1678=1;
                  active[3]=1;
                  ends[3]=1;
                  tdone[3]=1;
                }
                else {
                  switch(S1673){
                    case 0 : 
                      if(!door1Grant_in.isREQ()){//sysj/Exercise6.sysj line: 24, column: 4
                        door1Grant_in.setACK(true);//sysj/Exercise6.sysj line: 24, column: 4
                        S1673=1;
                        if(door1Grant_in.isREQ()){//sysj/Exercise6.sysj line: 24, column: 4
                          door1Grant_in.setACK(false);//sysj/Exercise6.sysj line: 24, column: 4
                          ends[3]=2;
                          ;//sysj/Exercise6.sysj line: 24, column: 4
                          result_thread_3 = (door1Grant_in.getVal() == null ? false : ((Boolean)door1Grant_in.getVal()).booleanValue());//sysj/Exercise6.sysj line: 25, column: 4
                          if(result_thread_3 == true) {//sysj/Exercise6.sysj line: 26, column: 24
                            System.out.println("Door1: Opening Door");//sysj/Exercise6.sysj line: 27, column: 5
                          }
                          S1694=1;
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
                      if(door1Grant_in.isREQ()){//sysj/Exercise6.sysj line: 24, column: 4
                        door1Grant_in.setACK(false);//sysj/Exercise6.sysj line: 24, column: 4
                        ends[3]=2;
                        ;//sysj/Exercise6.sysj line: 24, column: 4
                        result_thread_3 = (door1Grant_in.getVal() == null ? false : ((Boolean)door1Grant_in.getVal()).booleanValue());//sysj/Exercise6.sysj line: 25, column: 4
                        if(result_thread_3 == true) {//sysj/Exercise6.sysj line: 26, column: 24
                          System.out.println("Door1: Opening Door");//sysj/Exercise6.sysj line: 27, column: 5
                        }
                        S1694=1;
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
                S1678=1;
                S1678=0;
                if(!door1Grant_in.isPartnerPresent() || door1Grant_in.isPartnerPreempted()){//sysj/Exercise6.sysj line: 24, column: 4
                  door1Grant_in.setACK(false);//sysj/Exercise6.sysj line: 24, column: 4
                  S1678=1;
                  active[3]=1;
                  ends[3]=1;
                  tdone[3]=1;
                }
                else {
                  S1673=0;
                  if(!door1Grant_in.isREQ()){//sysj/Exercise6.sysj line: 24, column: 4
                    door1Grant_in.setACK(true);//sysj/Exercise6.sysj line: 24, column: 4
                    S1673=1;
                    if(door1Grant_in.isREQ()){//sysj/Exercise6.sysj line: 24, column: 4
                      door1Grant_in.setACK(false);//sysj/Exercise6.sysj line: 24, column: 4
                      ends[3]=2;
                      ;//sysj/Exercise6.sysj line: 24, column: 4
                      result_thread_3 = (door1Grant_in.getVal() == null ? false : ((Boolean)door1Grant_in.getVal()).booleanValue());//sysj/Exercise6.sysj line: 25, column: 4
                      if(result_thread_3 == true) {//sysj/Exercise6.sysj line: 26, column: 24
                        System.out.println("Door1: Opening Door");//sysj/Exercise6.sysj line: 27, column: 5
                      }
                      S1694=1;
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
            S1694=1;
            S1694=0;
            S1678=0;
            if(!door1Grant_in.isPartnerPresent() || door1Grant_in.isPartnerPreempted()){//sysj/Exercise6.sysj line: 24, column: 4
              door1Grant_in.setACK(false);//sysj/Exercise6.sysj line: 24, column: 4
              S1678=1;
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            else {
              S1673=0;
              if(!door1Grant_in.isREQ()){//sysj/Exercise6.sysj line: 24, column: 4
                door1Grant_in.setACK(true);//sysj/Exercise6.sysj line: 24, column: 4
                S1673=1;
                if(door1Grant_in.isREQ()){//sysj/Exercise6.sysj line: 24, column: 4
                  door1Grant_in.setACK(false);//sysj/Exercise6.sysj line: 24, column: 4
                  ends[3]=2;
                  ;//sysj/Exercise6.sysj line: 24, column: 4
                  result_thread_3 = (door1Grant_in.getVal() == null ? false : ((Boolean)door1Grant_in.getVal()).booleanValue());//sysj/Exercise6.sysj line: 25, column: 4
                  if(result_thread_3 == true) {//sysj/Exercise6.sysj line: 26, column: 24
                    System.out.println("Door1: Opening Door");//sysj/Exercise6.sysj line: 27, column: 5
                  }
                  S1694=1;
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

  public void thread6339(int [] tdone, int [] ends){
        switch(S1671){
      case 0 : 
        active[2]=0;
        ends[2]=0;
        tdone[2]=1;
        break;
      
      case 1 : 
        switch(S23){
          case 0 : 
            switch(S7){
              case 0 : 
                if(!door1CardReader_o.isPartnerPresent() || door1CardReader_o.isPartnerPreempted()){//sysj/Exercise6.sysj line: 11, column: 4
                  door1CardReader_o.setREQ(false);//sysj/Exercise6.sysj line: 11, column: 4
                  S7=1;
                  active[2]=1;
                  ends[2]=1;
                  tdone[2]=1;
                }
                else {
                  switch(S2){
                    case 0 : 
                      if(door1CardReader_o.isACK()){//sysj/Exercise6.sysj line: 11, column: 4
                        door1CardReader_o.setVal(goodCardID_thread_2);//sysj/Exercise6.sysj line: 11, column: 4
                        S2=1;
                        if(!door1CardReader_o.isACK()){//sysj/Exercise6.sysj line: 11, column: 4
                          door1CardReader_o.setREQ(false);//sysj/Exercise6.sysj line: 11, column: 4
                          ends[2]=2;
                          ;//sysj/Exercise6.sysj line: 11, column: 4
                          S23=1;
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
                      if(!door1CardReader_o.isACK()){//sysj/Exercise6.sysj line: 11, column: 4
                        door1CardReader_o.setREQ(false);//sysj/Exercise6.sysj line: 11, column: 4
                        ends[2]=2;
                        ;//sysj/Exercise6.sysj line: 11, column: 4
                        S23=1;
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
                S7=1;
                S7=0;
                if(!door1CardReader_o.isPartnerPresent() || door1CardReader_o.isPartnerPreempted()){//sysj/Exercise6.sysj line: 11, column: 4
                  door1CardReader_o.setREQ(false);//sysj/Exercise6.sysj line: 11, column: 4
                  S7=1;
                  active[2]=1;
                  ends[2]=1;
                  tdone[2]=1;
                }
                else {
                  S2=0;
                  if(door1CardReader_o.isACK()){//sysj/Exercise6.sysj line: 11, column: 4
                    door1CardReader_o.setVal(goodCardID_thread_2);//sysj/Exercise6.sysj line: 11, column: 4
                    S2=1;
                    if(!door1CardReader_o.isACK()){//sysj/Exercise6.sysj line: 11, column: 4
                      door1CardReader_o.setREQ(false);//sysj/Exercise6.sysj line: 11, column: 4
                      ends[2]=2;
                      ;//sysj/Exercise6.sysj line: 11, column: 4
                      S23=1;
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
            S23=1;
            S23=2;
            __start_thread_2 = com.systemj.Timer.getMs();//sysj/Exercise6.sysj line: 10, column: 3
            S25=0;
            if(com.systemj.Timer.getMs() - __start_thread_2 >= (10) * 1000){//sysj/Exercise6.sysj line: 10, column: 3
              ends[2]=2;
              ;//sysj/Exercise6.sysj line: 10, column: 3
              S23=3;
              S58=0;
              if(!door1CardReader_o.isPartnerPresent() || door1CardReader_o.isPartnerPreempted()){//sysj/Exercise6.sysj line: 14, column: 4
                door1CardReader_o.setREQ(false);//sysj/Exercise6.sysj line: 14, column: 4
                S58=1;
                active[2]=1;
                ends[2]=1;
                tdone[2]=1;
              }
              else {
                S53=0;
                if(door1CardReader_o.isACK()){//sysj/Exercise6.sysj line: 14, column: 4
                  door1CardReader_o.setVal(badCardID_thread_2);//sysj/Exercise6.sysj line: 14, column: 4
                  S53=1;
                  if(!door1CardReader_o.isACK()){//sysj/Exercise6.sysj line: 14, column: 4
                    door1CardReader_o.setREQ(false);//sysj/Exercise6.sysj line: 14, column: 4
                    ends[2]=2;
                    ;//sysj/Exercise6.sysj line: 14, column: 4
                    S23=4;
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
            else {
              S25=1;
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            break;
          
          case 2 : 
            switch(S25){
              case 0 : 
                S25=0;
                if(com.systemj.Timer.getMs() - __start_thread_2 >= (10) * 1000){//sysj/Exercise6.sysj line: 10, column: 3
                  ends[2]=2;
                  ;//sysj/Exercise6.sysj line: 10, column: 3
                  S23=3;
                  S58=0;
                  if(!door1CardReader_o.isPartnerPresent() || door1CardReader_o.isPartnerPreempted()){//sysj/Exercise6.sysj line: 14, column: 4
                    door1CardReader_o.setREQ(false);//sysj/Exercise6.sysj line: 14, column: 4
                    S58=1;
                    active[2]=1;
                    ends[2]=1;
                    tdone[2]=1;
                  }
                  else {
                    S53=0;
                    if(door1CardReader_o.isACK()){//sysj/Exercise6.sysj line: 14, column: 4
                      door1CardReader_o.setVal(badCardID_thread_2);//sysj/Exercise6.sysj line: 14, column: 4
                      S53=1;
                      if(!door1CardReader_o.isACK()){//sysj/Exercise6.sysj line: 14, column: 4
                        door1CardReader_o.setREQ(false);//sysj/Exercise6.sysj line: 14, column: 4
                        ends[2]=2;
                        ;//sysj/Exercise6.sysj line: 14, column: 4
                        S23=4;
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
                else {
                  S25=1;
                  active[2]=1;
                  ends[2]=1;
                  tdone[2]=1;
                }
                break;
              
              case 1 : 
                S25=1;
                S25=0;
                if(com.systemj.Timer.getMs() - __start_thread_2 >= (10) * 1000){//sysj/Exercise6.sysj line: 10, column: 3
                  ends[2]=2;
                  ;//sysj/Exercise6.sysj line: 10, column: 3
                  S23=3;
                  S58=0;
                  if(!door1CardReader_o.isPartnerPresent() || door1CardReader_o.isPartnerPreempted()){//sysj/Exercise6.sysj line: 14, column: 4
                    door1CardReader_o.setREQ(false);//sysj/Exercise6.sysj line: 14, column: 4
                    S58=1;
                    active[2]=1;
                    ends[2]=1;
                    tdone[2]=1;
                  }
                  else {
                    S53=0;
                    if(door1CardReader_o.isACK()){//sysj/Exercise6.sysj line: 14, column: 4
                      door1CardReader_o.setVal(badCardID_thread_2);//sysj/Exercise6.sysj line: 14, column: 4
                      S53=1;
                      if(!door1CardReader_o.isACK()){//sysj/Exercise6.sysj line: 14, column: 4
                        door1CardReader_o.setREQ(false);//sysj/Exercise6.sysj line: 14, column: 4
                        ends[2]=2;
                        ;//sysj/Exercise6.sysj line: 14, column: 4
                        S23=4;
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
                else {
                  S25=1;
                  active[2]=1;
                  ends[2]=1;
                  tdone[2]=1;
                }
                break;
              
            }
            break;
          
          case 3 : 
            switch(S58){
              case 0 : 
                if(!door1CardReader_o.isPartnerPresent() || door1CardReader_o.isPartnerPreempted()){//sysj/Exercise6.sysj line: 14, column: 4
                  door1CardReader_o.setREQ(false);//sysj/Exercise6.sysj line: 14, column: 4
                  S58=1;
                  active[2]=1;
                  ends[2]=1;
                  tdone[2]=1;
                }
                else {
                  switch(S53){
                    case 0 : 
                      if(door1CardReader_o.isACK()){//sysj/Exercise6.sysj line: 14, column: 4
                        door1CardReader_o.setVal(badCardID_thread_2);//sysj/Exercise6.sysj line: 14, column: 4
                        S53=1;
                        if(!door1CardReader_o.isACK()){//sysj/Exercise6.sysj line: 14, column: 4
                          door1CardReader_o.setREQ(false);//sysj/Exercise6.sysj line: 14, column: 4
                          ends[2]=2;
                          ;//sysj/Exercise6.sysj line: 14, column: 4
                          S23=4;
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
                      if(!door1CardReader_o.isACK()){//sysj/Exercise6.sysj line: 14, column: 4
                        door1CardReader_o.setREQ(false);//sysj/Exercise6.sysj line: 14, column: 4
                        ends[2]=2;
                        ;//sysj/Exercise6.sysj line: 14, column: 4
                        S23=4;
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
                S58=1;
                S58=0;
                if(!door1CardReader_o.isPartnerPresent() || door1CardReader_o.isPartnerPreempted()){//sysj/Exercise6.sysj line: 14, column: 4
                  door1CardReader_o.setREQ(false);//sysj/Exercise6.sysj line: 14, column: 4
                  S58=1;
                  active[2]=1;
                  ends[2]=1;
                  tdone[2]=1;
                }
                else {
                  S53=0;
                  if(door1CardReader_o.isACK()){//sysj/Exercise6.sysj line: 14, column: 4
                    door1CardReader_o.setVal(badCardID_thread_2);//sysj/Exercise6.sysj line: 14, column: 4
                    S53=1;
                    if(!door1CardReader_o.isACK()){//sysj/Exercise6.sysj line: 14, column: 4
                      door1CardReader_o.setREQ(false);//sysj/Exercise6.sysj line: 14, column: 4
                      ends[2]=2;
                      ;//sysj/Exercise6.sysj line: 14, column: 4
                      S23=4;
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
          
          case 4 : 
            S23=4;
            S23=5;
            __start_thread_2 = com.systemj.Timer.getMs();//sysj/Exercise6.sysj line: 10, column: 3
            if(com.systemj.Timer.getMs() - __start_thread_2 >= (10) * 1000){//sysj/Exercise6.sysj line: 10, column: 3
              ends[2]=2;
              ;//sysj/Exercise6.sysj line: 10, column: 3
              S23=0;
              S7=0;
              if(!door1CardReader_o.isPartnerPresent() || door1CardReader_o.isPartnerPreempted()){//sysj/Exercise6.sysj line: 11, column: 4
                door1CardReader_o.setREQ(false);//sysj/Exercise6.sysj line: 11, column: 4
                S7=1;
                active[2]=1;
                ends[2]=1;
                tdone[2]=1;
              }
              else {
                S2=0;
                if(door1CardReader_o.isACK()){//sysj/Exercise6.sysj line: 11, column: 4
                  door1CardReader_o.setVal(goodCardID_thread_2);//sysj/Exercise6.sysj line: 11, column: 4
                  S2=1;
                  if(!door1CardReader_o.isACK()){//sysj/Exercise6.sysj line: 11, column: 4
                    door1CardReader_o.setREQ(false);//sysj/Exercise6.sysj line: 11, column: 4
                    ends[2]=2;
                    ;//sysj/Exercise6.sysj line: 11, column: 4
                    S23=1;
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
            else {
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            break;
          
          case 5 : 
            if(com.systemj.Timer.getMs() - __start_thread_2 >= (10) * 1000){//sysj/Exercise6.sysj line: 10, column: 3
              ends[2]=2;
              ;//sysj/Exercise6.sysj line: 10, column: 3
              S23=0;
              S7=0;
              if(!door1CardReader_o.isPartnerPresent() || door1CardReader_o.isPartnerPreempted()){//sysj/Exercise6.sysj line: 11, column: 4
                door1CardReader_o.setREQ(false);//sysj/Exercise6.sysj line: 11, column: 4
                S7=1;
                active[2]=1;
                ends[2]=1;
                tdone[2]=1;
              }
              else {
                S2=0;
                if(door1CardReader_o.isACK()){//sysj/Exercise6.sysj line: 11, column: 4
                  door1CardReader_o.setVal(goodCardID_thread_2);//sysj/Exercise6.sysj line: 11, column: 4
                  S2=1;
                  if(!door1CardReader_o.isACK()){//sysj/Exercise6.sysj line: 11, column: 4
                    door1CardReader_o.setREQ(false);//sysj/Exercise6.sysj line: 11, column: 4
                    ends[2]=2;
                    ;//sysj/Exercise6.sysj line: 11, column: 4
                    S23=1;
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
            else {
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread6337(int [] tdone, int [] ends){
        S1813=1;
    S1765=0;
    S1749=0;
    if(!door1Deny_in.isPartnerPresent() || door1Deny_in.isPartnerPreempted()){//sysj/Exercise6.sysj line: 34, column: 4
      door1Deny_in.setACK(false);//sysj/Exercise6.sysj line: 34, column: 4
      S1749=1;
      active[4]=1;
      ends[4]=1;
      tdone[4]=1;
    }
    else {
      S1744=0;
      if(!door1Deny_in.isREQ()){//sysj/Exercise6.sysj line: 34, column: 4
        door1Deny_in.setACK(true);//sysj/Exercise6.sysj line: 34, column: 4
        S1744=1;
        if(door1Deny_in.isREQ()){//sysj/Exercise6.sysj line: 34, column: 4
          door1Deny_in.setACK(false);//sysj/Exercise6.sysj line: 34, column: 4
          ends[4]=2;
          ;//sysj/Exercise6.sysj line: 34, column: 4
          result_thread_4 = (door1Deny_in.getVal() == null ? false : ((Boolean)door1Deny_in.getVal()).booleanValue());//sysj/Exercise6.sysj line: 35, column: 4
          if(result_thread_4 == true) {//sysj/Exercise6.sysj line: 36, column: 24
            System.out.println("Door1: Access Denied");//sysj/Exercise6.sysj line: 37, column: 5
          }
          S1765=1;
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

  public void thread6336(int [] tdone, int [] ends){
        S1742=1;
    S1694=0;
    S1678=0;
    if(!door1Grant_in.isPartnerPresent() || door1Grant_in.isPartnerPreempted()){//sysj/Exercise6.sysj line: 24, column: 4
      door1Grant_in.setACK(false);//sysj/Exercise6.sysj line: 24, column: 4
      S1678=1;
      active[3]=1;
      ends[3]=1;
      tdone[3]=1;
    }
    else {
      S1673=0;
      if(!door1Grant_in.isREQ()){//sysj/Exercise6.sysj line: 24, column: 4
        door1Grant_in.setACK(true);//sysj/Exercise6.sysj line: 24, column: 4
        S1673=1;
        if(door1Grant_in.isREQ()){//sysj/Exercise6.sysj line: 24, column: 4
          door1Grant_in.setACK(false);//sysj/Exercise6.sysj line: 24, column: 4
          ends[3]=2;
          ;//sysj/Exercise6.sysj line: 24, column: 4
          result_thread_3 = (door1Grant_in.getVal() == null ? false : ((Boolean)door1Grant_in.getVal()).booleanValue());//sysj/Exercise6.sysj line: 25, column: 4
          if(result_thread_3 == true) {//sysj/Exercise6.sysj line: 26, column: 24
            System.out.println("Door1: Opening Door");//sysj/Exercise6.sysj line: 27, column: 5
          }
          S1694=1;
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

  public void thread6335(int [] tdone, int [] ends){
        S1671=1;
    goodCardID_thread_2 = "11111";//sysj/Exercise6.sysj line: 8, column: 3
    badCardID_thread_2 = "12110";//sysj/Exercise6.sysj line: 9, column: 3
    S23=0;
    S7=0;
    if(!door1CardReader_o.isPartnerPresent() || door1CardReader_o.isPartnerPreempted()){//sysj/Exercise6.sysj line: 11, column: 4
      door1CardReader_o.setREQ(false);//sysj/Exercise6.sysj line: 11, column: 4
      S7=1;
      active[2]=1;
      ends[2]=1;
      tdone[2]=1;
    }
    else {
      S2=0;
      if(door1CardReader_o.isACK()){//sysj/Exercise6.sysj line: 11, column: 4
        door1CardReader_o.setVal(goodCardID_thread_2);//sysj/Exercise6.sysj line: 11, column: 4
        S2=1;
        if(!door1CardReader_o.isACK()){//sysj/Exercise6.sysj line: 11, column: 4
          door1CardReader_o.setREQ(false);//sysj/Exercise6.sysj line: 11, column: 4
          ends[2]=2;
          ;//sysj/Exercise6.sysj line: 11, column: 4
          S23=1;
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
      switch(S1815){
        case 0 : 
          S1815=0;
          break RUN;
        
        case 1 : 
          S1815=2;
          S1815=2;
          thread6335(tdone,ends);
          thread6336(tdone,ends);
          thread6337(tdone,ends);
          int biggest6338 = 0;
          if(ends[2]>=biggest6338){
            biggest6338=ends[2];
          }
          if(ends[3]>=biggest6338){
            biggest6338=ends[3];
          }
          if(ends[4]>=biggest6338){
            biggest6338=ends[4];
          }
          if(biggest6338 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
        
        case 2 : 
          thread6339(tdone,ends);
          thread6340(tdone,ends);
          thread6341(tdone,ends);
          int biggest6342 = 0;
          if(ends[2]>=biggest6342){
            biggest6342=ends[2];
          }
          if(ends[3]>=biggest6342){
            biggest6342=ends[3];
          }
          if(ends[4]>=biggest6342){
            biggest6342=ends[4];
          }
          if(biggest6342 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
          //FINXME code
          if(biggest6342 == 0){
            S1815=0;
            active[1]=0;
            ends[1]=0;
            S1815=0;
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
          door1Grant_in.gethook();
          door1Deny_in.gethook();
          door1CardReader_o.gethook();
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
      door1Grant_in.sethook();
      door1Deny_in.sethook();
      door1CardReader_o.sethook();
      if(paused[1]!=0 || suspended[1]!=0 || active[1]!=1);
      else{
        door1Grant_in.gethook();
        door1Deny_in.gethook();
        door1CardReader_o.gethook();
      }
      runFinisher();
      if(active[1] == 0){
      	this.terminated = true;
      }
      if(!threaded) break;
    }
  }
}
