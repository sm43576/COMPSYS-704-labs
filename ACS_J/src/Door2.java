import java.util.*;
import com.systemj.ClockDomain;
import com.systemj.Signal;
import com.systemj.input_Channel;
import com.systemj.output_Channel;

public class Door2 extends ClockDomain{
  public Door2(String name){super(name);}
  Vector currsigs = new Vector();
  private boolean df = false;
  private char [] active;
  private char [] paused;
  private char [] suspended;
  public input_Channel door2Grant_in = new input_Channel();
  public input_Channel door2Deny_in = new input_Channel();
  public output_Channel door2CardReader_o = new output_Channel();
  private String goodCardID_thread_6;//sysj/Exercise6.sysj line: 50, column: 3
  private String badCardID_thread_6;//sysj/Exercise6.sysj line: 51, column: 3
  private long __start_thread_6;//sysj/Exercise6.sysj line: 52, column: 3
  private boolean result_thread_7;//sysj/Exercise6.sysj line: 67, column: 4
  private boolean result_thread_8;//sysj/Exercise6.sysj line: 77, column: 4
  private int S3631 = 1;
  private int S3487 = 1;
  private int S1839 = 1;
  private int S1823 = 1;
  private int S1818 = 1;
  private int S1874 = 1;
  private int S1869 = 1;
  private int S3558 = 1;
  private int S3510 = 1;
  private int S3494 = 1;
  private int S3489 = 1;
  private int S3629 = 1;
  private int S3581 = 1;
  private int S3565 = 1;
  private int S3560 = 1;
  
  private int[] ends = new int[24];
  private int[] tdone = new int[24];
  
  public void thread10235(int [] tdone, int [] ends){
        switch(S3629){
      case 0 : 
        active[8]=0;
        ends[8]=0;
        tdone[8]=1;
        break;
      
      case 1 : 
        switch(S3581){
          case 0 : 
            switch(S3565){
              case 0 : 
                if(!door2Deny_in.isPartnerPresent() || door2Deny_in.isPartnerPreempted()){//sysj/Exercise6.sysj line: 76, column: 4
                  door2Deny_in.setACK(false);//sysj/Exercise6.sysj line: 76, column: 4
                  S3565=1;
                  active[8]=1;
                  ends[8]=1;
                  tdone[8]=1;
                }
                else {
                  switch(S3560){
                    case 0 : 
                      if(!door2Deny_in.isREQ()){//sysj/Exercise6.sysj line: 76, column: 4
                        door2Deny_in.setACK(true);//sysj/Exercise6.sysj line: 76, column: 4
                        S3560=1;
                        if(door2Deny_in.isREQ()){//sysj/Exercise6.sysj line: 76, column: 4
                          door2Deny_in.setACK(false);//sysj/Exercise6.sysj line: 76, column: 4
                          ends[8]=2;
                          ;//sysj/Exercise6.sysj line: 76, column: 4
                          result_thread_8 = (door2Deny_in.getVal() == null ? false : ((Boolean)door2Deny_in.getVal()).booleanValue());//sysj/Exercise6.sysj line: 77, column: 4
                          if(result_thread_8 == true) {//sysj/Exercise6.sysj line: 78, column: 24
                            System.out.println("Door2: Access Denied");//sysj/Exercise6.sysj line: 79, column: 5
                          }
                          S3581=1;
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
                      if(door2Deny_in.isREQ()){//sysj/Exercise6.sysj line: 76, column: 4
                        door2Deny_in.setACK(false);//sysj/Exercise6.sysj line: 76, column: 4
                        ends[8]=2;
                        ;//sysj/Exercise6.sysj line: 76, column: 4
                        result_thread_8 = (door2Deny_in.getVal() == null ? false : ((Boolean)door2Deny_in.getVal()).booleanValue());//sysj/Exercise6.sysj line: 77, column: 4
                        if(result_thread_8 == true) {//sysj/Exercise6.sysj line: 78, column: 24
                          System.out.println("Door2: Access Denied");//sysj/Exercise6.sysj line: 79, column: 5
                        }
                        S3581=1;
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
                S3565=1;
                S3565=0;
                if(!door2Deny_in.isPartnerPresent() || door2Deny_in.isPartnerPreempted()){//sysj/Exercise6.sysj line: 76, column: 4
                  door2Deny_in.setACK(false);//sysj/Exercise6.sysj line: 76, column: 4
                  S3565=1;
                  active[8]=1;
                  ends[8]=1;
                  tdone[8]=1;
                }
                else {
                  S3560=0;
                  if(!door2Deny_in.isREQ()){//sysj/Exercise6.sysj line: 76, column: 4
                    door2Deny_in.setACK(true);//sysj/Exercise6.sysj line: 76, column: 4
                    S3560=1;
                    if(door2Deny_in.isREQ()){//sysj/Exercise6.sysj line: 76, column: 4
                      door2Deny_in.setACK(false);//sysj/Exercise6.sysj line: 76, column: 4
                      ends[8]=2;
                      ;//sysj/Exercise6.sysj line: 76, column: 4
                      result_thread_8 = (door2Deny_in.getVal() == null ? false : ((Boolean)door2Deny_in.getVal()).booleanValue());//sysj/Exercise6.sysj line: 77, column: 4
                      if(result_thread_8 == true) {//sysj/Exercise6.sysj line: 78, column: 24
                        System.out.println("Door2: Access Denied");//sysj/Exercise6.sysj line: 79, column: 5
                      }
                      S3581=1;
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
            S3581=1;
            S3581=0;
            S3565=0;
            if(!door2Deny_in.isPartnerPresent() || door2Deny_in.isPartnerPreempted()){//sysj/Exercise6.sysj line: 76, column: 4
              door2Deny_in.setACK(false);//sysj/Exercise6.sysj line: 76, column: 4
              S3565=1;
              active[8]=1;
              ends[8]=1;
              tdone[8]=1;
            }
            else {
              S3560=0;
              if(!door2Deny_in.isREQ()){//sysj/Exercise6.sysj line: 76, column: 4
                door2Deny_in.setACK(true);//sysj/Exercise6.sysj line: 76, column: 4
                S3560=1;
                if(door2Deny_in.isREQ()){//sysj/Exercise6.sysj line: 76, column: 4
                  door2Deny_in.setACK(false);//sysj/Exercise6.sysj line: 76, column: 4
                  ends[8]=2;
                  ;//sysj/Exercise6.sysj line: 76, column: 4
                  result_thread_8 = (door2Deny_in.getVal() == null ? false : ((Boolean)door2Deny_in.getVal()).booleanValue());//sysj/Exercise6.sysj line: 77, column: 4
                  if(result_thread_8 == true) {//sysj/Exercise6.sysj line: 78, column: 24
                    System.out.println("Door2: Access Denied");//sysj/Exercise6.sysj line: 79, column: 5
                  }
                  S3581=1;
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

  public void thread10234(int [] tdone, int [] ends){
        switch(S3558){
      case 0 : 
        active[7]=0;
        ends[7]=0;
        tdone[7]=1;
        break;
      
      case 1 : 
        switch(S3510){
          case 0 : 
            switch(S3494){
              case 0 : 
                if(!door2Grant_in.isPartnerPresent() || door2Grant_in.isPartnerPreempted()){//sysj/Exercise6.sysj line: 66, column: 4
                  door2Grant_in.setACK(false);//sysj/Exercise6.sysj line: 66, column: 4
                  S3494=1;
                  active[7]=1;
                  ends[7]=1;
                  tdone[7]=1;
                }
                else {
                  switch(S3489){
                    case 0 : 
                      if(!door2Grant_in.isREQ()){//sysj/Exercise6.sysj line: 66, column: 4
                        door2Grant_in.setACK(true);//sysj/Exercise6.sysj line: 66, column: 4
                        S3489=1;
                        if(door2Grant_in.isREQ()){//sysj/Exercise6.sysj line: 66, column: 4
                          door2Grant_in.setACK(false);//sysj/Exercise6.sysj line: 66, column: 4
                          ends[7]=2;
                          ;//sysj/Exercise6.sysj line: 66, column: 4
                          result_thread_7 = (door2Grant_in.getVal() == null ? false : ((Boolean)door2Grant_in.getVal()).booleanValue());//sysj/Exercise6.sysj line: 67, column: 4
                          if(result_thread_7 == true) {//sysj/Exercise6.sysj line: 68, column: 24
                            System.out.println("Door2: Opening Door");//sysj/Exercise6.sysj line: 69, column: 5
                          }
                          S3510=1;
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
                      if(door2Grant_in.isREQ()){//sysj/Exercise6.sysj line: 66, column: 4
                        door2Grant_in.setACK(false);//sysj/Exercise6.sysj line: 66, column: 4
                        ends[7]=2;
                        ;//sysj/Exercise6.sysj line: 66, column: 4
                        result_thread_7 = (door2Grant_in.getVal() == null ? false : ((Boolean)door2Grant_in.getVal()).booleanValue());//sysj/Exercise6.sysj line: 67, column: 4
                        if(result_thread_7 == true) {//sysj/Exercise6.sysj line: 68, column: 24
                          System.out.println("Door2: Opening Door");//sysj/Exercise6.sysj line: 69, column: 5
                        }
                        S3510=1;
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
                S3494=1;
                S3494=0;
                if(!door2Grant_in.isPartnerPresent() || door2Grant_in.isPartnerPreempted()){//sysj/Exercise6.sysj line: 66, column: 4
                  door2Grant_in.setACK(false);//sysj/Exercise6.sysj line: 66, column: 4
                  S3494=1;
                  active[7]=1;
                  ends[7]=1;
                  tdone[7]=1;
                }
                else {
                  S3489=0;
                  if(!door2Grant_in.isREQ()){//sysj/Exercise6.sysj line: 66, column: 4
                    door2Grant_in.setACK(true);//sysj/Exercise6.sysj line: 66, column: 4
                    S3489=1;
                    if(door2Grant_in.isREQ()){//sysj/Exercise6.sysj line: 66, column: 4
                      door2Grant_in.setACK(false);//sysj/Exercise6.sysj line: 66, column: 4
                      ends[7]=2;
                      ;//sysj/Exercise6.sysj line: 66, column: 4
                      result_thread_7 = (door2Grant_in.getVal() == null ? false : ((Boolean)door2Grant_in.getVal()).booleanValue());//sysj/Exercise6.sysj line: 67, column: 4
                      if(result_thread_7 == true) {//sysj/Exercise6.sysj line: 68, column: 24
                        System.out.println("Door2: Opening Door");//sysj/Exercise6.sysj line: 69, column: 5
                      }
                      S3510=1;
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
            S3510=1;
            S3510=0;
            S3494=0;
            if(!door2Grant_in.isPartnerPresent() || door2Grant_in.isPartnerPreempted()){//sysj/Exercise6.sysj line: 66, column: 4
              door2Grant_in.setACK(false);//sysj/Exercise6.sysj line: 66, column: 4
              S3494=1;
              active[7]=1;
              ends[7]=1;
              tdone[7]=1;
            }
            else {
              S3489=0;
              if(!door2Grant_in.isREQ()){//sysj/Exercise6.sysj line: 66, column: 4
                door2Grant_in.setACK(true);//sysj/Exercise6.sysj line: 66, column: 4
                S3489=1;
                if(door2Grant_in.isREQ()){//sysj/Exercise6.sysj line: 66, column: 4
                  door2Grant_in.setACK(false);//sysj/Exercise6.sysj line: 66, column: 4
                  ends[7]=2;
                  ;//sysj/Exercise6.sysj line: 66, column: 4
                  result_thread_7 = (door2Grant_in.getVal() == null ? false : ((Boolean)door2Grant_in.getVal()).booleanValue());//sysj/Exercise6.sysj line: 67, column: 4
                  if(result_thread_7 == true) {//sysj/Exercise6.sysj line: 68, column: 24
                    System.out.println("Door2: Opening Door");//sysj/Exercise6.sysj line: 69, column: 5
                  }
                  S3510=1;
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

  public void thread10233(int [] tdone, int [] ends){
        switch(S3487){
      case 0 : 
        active[6]=0;
        ends[6]=0;
        tdone[6]=1;
        break;
      
      case 1 : 
        switch(S1839){
          case 0 : 
            switch(S1823){
              case 0 : 
                if(!door2CardReader_o.isPartnerPresent() || door2CardReader_o.isPartnerPreempted()){//sysj/Exercise6.sysj line: 53, column: 4
                  door2CardReader_o.setREQ(false);//sysj/Exercise6.sysj line: 53, column: 4
                  S1823=1;
                  active[6]=1;
                  ends[6]=1;
                  tdone[6]=1;
                }
                else {
                  switch(S1818){
                    case 0 : 
                      if(door2CardReader_o.isACK()){//sysj/Exercise6.sysj line: 53, column: 4
                        door2CardReader_o.setVal(goodCardID_thread_6);//sysj/Exercise6.sysj line: 53, column: 4
                        S1818=1;
                        if(!door2CardReader_o.isACK()){//sysj/Exercise6.sysj line: 53, column: 4
                          door2CardReader_o.setREQ(false);//sysj/Exercise6.sysj line: 53, column: 4
                          ends[6]=2;
                          ;//sysj/Exercise6.sysj line: 53, column: 4
                          S1839=1;
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
                      if(!door2CardReader_o.isACK()){//sysj/Exercise6.sysj line: 53, column: 4
                        door2CardReader_o.setREQ(false);//sysj/Exercise6.sysj line: 53, column: 4
                        ends[6]=2;
                        ;//sysj/Exercise6.sysj line: 53, column: 4
                        S1839=1;
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
                S1823=1;
                S1823=0;
                if(!door2CardReader_o.isPartnerPresent() || door2CardReader_o.isPartnerPreempted()){//sysj/Exercise6.sysj line: 53, column: 4
                  door2CardReader_o.setREQ(false);//sysj/Exercise6.sysj line: 53, column: 4
                  S1823=1;
                  active[6]=1;
                  ends[6]=1;
                  tdone[6]=1;
                }
                else {
                  S1818=0;
                  if(door2CardReader_o.isACK()){//sysj/Exercise6.sysj line: 53, column: 4
                    door2CardReader_o.setVal(goodCardID_thread_6);//sysj/Exercise6.sysj line: 53, column: 4
                    S1818=1;
                    if(!door2CardReader_o.isACK()){//sysj/Exercise6.sysj line: 53, column: 4
                      door2CardReader_o.setREQ(false);//sysj/Exercise6.sysj line: 53, column: 4
                      ends[6]=2;
                      ;//sysj/Exercise6.sysj line: 53, column: 4
                      S1839=1;
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
            S1839=1;
            S1839=2;
            __start_thread_6 = com.systemj.Timer.getMs();//sysj/Exercise6.sysj line: 52, column: 3
            if(com.systemj.Timer.getMs() - __start_thread_6 >= (20) * 1000){//sysj/Exercise6.sysj line: 52, column: 3
              ends[6]=2;
              ;//sysj/Exercise6.sysj line: 52, column: 3
              S1839=3;
              S1874=0;
              if(!door2CardReader_o.isPartnerPresent() || door2CardReader_o.isPartnerPreempted()){//sysj/Exercise6.sysj line: 56, column: 4
                door2CardReader_o.setREQ(false);//sysj/Exercise6.sysj line: 56, column: 4
                S1874=1;
                active[6]=1;
                ends[6]=1;
                tdone[6]=1;
              }
              else {
                S1869=0;
                if(door2CardReader_o.isACK()){//sysj/Exercise6.sysj line: 56, column: 4
                  door2CardReader_o.setVal(badCardID_thread_6);//sysj/Exercise6.sysj line: 56, column: 4
                  S1869=1;
                  if(!door2CardReader_o.isACK()){//sysj/Exercise6.sysj line: 56, column: 4
                    door2CardReader_o.setREQ(false);//sysj/Exercise6.sysj line: 56, column: 4
                    ends[6]=2;
                    ;//sysj/Exercise6.sysj line: 56, column: 4
                    S1839=4;
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
          
          case 2 : 
            if(com.systemj.Timer.getMs() - __start_thread_6 >= (20) * 1000){//sysj/Exercise6.sysj line: 52, column: 3
              ends[6]=2;
              ;//sysj/Exercise6.sysj line: 52, column: 3
              S1839=3;
              S1874=0;
              if(!door2CardReader_o.isPartnerPresent() || door2CardReader_o.isPartnerPreempted()){//sysj/Exercise6.sysj line: 56, column: 4
                door2CardReader_o.setREQ(false);//sysj/Exercise6.sysj line: 56, column: 4
                S1874=1;
                active[6]=1;
                ends[6]=1;
                tdone[6]=1;
              }
              else {
                S1869=0;
                if(door2CardReader_o.isACK()){//sysj/Exercise6.sysj line: 56, column: 4
                  door2CardReader_o.setVal(badCardID_thread_6);//sysj/Exercise6.sysj line: 56, column: 4
                  S1869=1;
                  if(!door2CardReader_o.isACK()){//sysj/Exercise6.sysj line: 56, column: 4
                    door2CardReader_o.setREQ(false);//sysj/Exercise6.sysj line: 56, column: 4
                    ends[6]=2;
                    ;//sysj/Exercise6.sysj line: 56, column: 4
                    S1839=4;
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
          
          case 3 : 
            switch(S1874){
              case 0 : 
                if(!door2CardReader_o.isPartnerPresent() || door2CardReader_o.isPartnerPreempted()){//sysj/Exercise6.sysj line: 56, column: 4
                  door2CardReader_o.setREQ(false);//sysj/Exercise6.sysj line: 56, column: 4
                  S1874=1;
                  active[6]=1;
                  ends[6]=1;
                  tdone[6]=1;
                }
                else {
                  switch(S1869){
                    case 0 : 
                      if(door2CardReader_o.isACK()){//sysj/Exercise6.sysj line: 56, column: 4
                        door2CardReader_o.setVal(badCardID_thread_6);//sysj/Exercise6.sysj line: 56, column: 4
                        S1869=1;
                        if(!door2CardReader_o.isACK()){//sysj/Exercise6.sysj line: 56, column: 4
                          door2CardReader_o.setREQ(false);//sysj/Exercise6.sysj line: 56, column: 4
                          ends[6]=2;
                          ;//sysj/Exercise6.sysj line: 56, column: 4
                          S1839=4;
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
                      if(!door2CardReader_o.isACK()){//sysj/Exercise6.sysj line: 56, column: 4
                        door2CardReader_o.setREQ(false);//sysj/Exercise6.sysj line: 56, column: 4
                        ends[6]=2;
                        ;//sysj/Exercise6.sysj line: 56, column: 4
                        S1839=4;
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
                S1874=1;
                S1874=0;
                if(!door2CardReader_o.isPartnerPresent() || door2CardReader_o.isPartnerPreempted()){//sysj/Exercise6.sysj line: 56, column: 4
                  door2CardReader_o.setREQ(false);//sysj/Exercise6.sysj line: 56, column: 4
                  S1874=1;
                  active[6]=1;
                  ends[6]=1;
                  tdone[6]=1;
                }
                else {
                  S1869=0;
                  if(door2CardReader_o.isACK()){//sysj/Exercise6.sysj line: 56, column: 4
                    door2CardReader_o.setVal(badCardID_thread_6);//sysj/Exercise6.sysj line: 56, column: 4
                    S1869=1;
                    if(!door2CardReader_o.isACK()){//sysj/Exercise6.sysj line: 56, column: 4
                      door2CardReader_o.setREQ(false);//sysj/Exercise6.sysj line: 56, column: 4
                      ends[6]=2;
                      ;//sysj/Exercise6.sysj line: 56, column: 4
                      S1839=4;
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
          
          case 4 : 
            S1839=4;
            S1839=5;
            __start_thread_6 = com.systemj.Timer.getMs();//sysj/Exercise6.sysj line: 52, column: 3
            if(com.systemj.Timer.getMs() - __start_thread_6 >= (20) * 1000){//sysj/Exercise6.sysj line: 52, column: 3
              ends[6]=2;
              ;//sysj/Exercise6.sysj line: 52, column: 3
              S1839=0;
              S1823=0;
              if(!door2CardReader_o.isPartnerPresent() || door2CardReader_o.isPartnerPreempted()){//sysj/Exercise6.sysj line: 53, column: 4
                door2CardReader_o.setREQ(false);//sysj/Exercise6.sysj line: 53, column: 4
                S1823=1;
                active[6]=1;
                ends[6]=1;
                tdone[6]=1;
              }
              else {
                S1818=0;
                if(door2CardReader_o.isACK()){//sysj/Exercise6.sysj line: 53, column: 4
                  door2CardReader_o.setVal(goodCardID_thread_6);//sysj/Exercise6.sysj line: 53, column: 4
                  S1818=1;
                  if(!door2CardReader_o.isACK()){//sysj/Exercise6.sysj line: 53, column: 4
                    door2CardReader_o.setREQ(false);//sysj/Exercise6.sysj line: 53, column: 4
                    ends[6]=2;
                    ;//sysj/Exercise6.sysj line: 53, column: 4
                    S1839=1;
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
          
          case 5 : 
            if(com.systemj.Timer.getMs() - __start_thread_6 >= (20) * 1000){//sysj/Exercise6.sysj line: 52, column: 3
              ends[6]=2;
              ;//sysj/Exercise6.sysj line: 52, column: 3
              S1839=0;
              S1823=0;
              if(!door2CardReader_o.isPartnerPresent() || door2CardReader_o.isPartnerPreempted()){//sysj/Exercise6.sysj line: 53, column: 4
                door2CardReader_o.setREQ(false);//sysj/Exercise6.sysj line: 53, column: 4
                S1823=1;
                active[6]=1;
                ends[6]=1;
                tdone[6]=1;
              }
              else {
                S1818=0;
                if(door2CardReader_o.isACK()){//sysj/Exercise6.sysj line: 53, column: 4
                  door2CardReader_o.setVal(goodCardID_thread_6);//sysj/Exercise6.sysj line: 53, column: 4
                  S1818=1;
                  if(!door2CardReader_o.isACK()){//sysj/Exercise6.sysj line: 53, column: 4
                    door2CardReader_o.setREQ(false);//sysj/Exercise6.sysj line: 53, column: 4
                    ends[6]=2;
                    ;//sysj/Exercise6.sysj line: 53, column: 4
                    S1839=1;
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
        break;
      
    }
  }

  public void thread10231(int [] tdone, int [] ends){
        S3629=1;
    S3581=0;
    S3565=0;
    if(!door2Deny_in.isPartnerPresent() || door2Deny_in.isPartnerPreempted()){//sysj/Exercise6.sysj line: 76, column: 4
      door2Deny_in.setACK(false);//sysj/Exercise6.sysj line: 76, column: 4
      S3565=1;
      active[8]=1;
      ends[8]=1;
      tdone[8]=1;
    }
    else {
      S3560=0;
      if(!door2Deny_in.isREQ()){//sysj/Exercise6.sysj line: 76, column: 4
        door2Deny_in.setACK(true);//sysj/Exercise6.sysj line: 76, column: 4
        S3560=1;
        if(door2Deny_in.isREQ()){//sysj/Exercise6.sysj line: 76, column: 4
          door2Deny_in.setACK(false);//sysj/Exercise6.sysj line: 76, column: 4
          ends[8]=2;
          ;//sysj/Exercise6.sysj line: 76, column: 4
          result_thread_8 = (door2Deny_in.getVal() == null ? false : ((Boolean)door2Deny_in.getVal()).booleanValue());//sysj/Exercise6.sysj line: 77, column: 4
          if(result_thread_8 == true) {//sysj/Exercise6.sysj line: 78, column: 24
            System.out.println("Door2: Access Denied");//sysj/Exercise6.sysj line: 79, column: 5
          }
          S3581=1;
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

  public void thread10230(int [] tdone, int [] ends){
        S3558=1;
    S3510=0;
    S3494=0;
    if(!door2Grant_in.isPartnerPresent() || door2Grant_in.isPartnerPreempted()){//sysj/Exercise6.sysj line: 66, column: 4
      door2Grant_in.setACK(false);//sysj/Exercise6.sysj line: 66, column: 4
      S3494=1;
      active[7]=1;
      ends[7]=1;
      tdone[7]=1;
    }
    else {
      S3489=0;
      if(!door2Grant_in.isREQ()){//sysj/Exercise6.sysj line: 66, column: 4
        door2Grant_in.setACK(true);//sysj/Exercise6.sysj line: 66, column: 4
        S3489=1;
        if(door2Grant_in.isREQ()){//sysj/Exercise6.sysj line: 66, column: 4
          door2Grant_in.setACK(false);//sysj/Exercise6.sysj line: 66, column: 4
          ends[7]=2;
          ;//sysj/Exercise6.sysj line: 66, column: 4
          result_thread_7 = (door2Grant_in.getVal() == null ? false : ((Boolean)door2Grant_in.getVal()).booleanValue());//sysj/Exercise6.sysj line: 67, column: 4
          if(result_thread_7 == true) {//sysj/Exercise6.sysj line: 68, column: 24
            System.out.println("Door2: Opening Door");//sysj/Exercise6.sysj line: 69, column: 5
          }
          S3510=1;
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

  public void thread10229(int [] tdone, int [] ends){
        S3487=1;
    goodCardID_thread_6 = "11111";//sysj/Exercise6.sysj line: 50, column: 3
    badCardID_thread_6 = "12110";//sysj/Exercise6.sysj line: 51, column: 3
    S1839=0;
    S1823=0;
    if(!door2CardReader_o.isPartnerPresent() || door2CardReader_o.isPartnerPreempted()){//sysj/Exercise6.sysj line: 53, column: 4
      door2CardReader_o.setREQ(false);//sysj/Exercise6.sysj line: 53, column: 4
      S1823=1;
      active[6]=1;
      ends[6]=1;
      tdone[6]=1;
    }
    else {
      S1818=0;
      if(door2CardReader_o.isACK()){//sysj/Exercise6.sysj line: 53, column: 4
        door2CardReader_o.setVal(goodCardID_thread_6);//sysj/Exercise6.sysj line: 53, column: 4
        S1818=1;
        if(!door2CardReader_o.isACK()){//sysj/Exercise6.sysj line: 53, column: 4
          door2CardReader_o.setREQ(false);//sysj/Exercise6.sysj line: 53, column: 4
          ends[6]=2;
          ;//sysj/Exercise6.sysj line: 53, column: 4
          S1839=1;
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

  public void runClockDomain(){
    for(int i=0;i<ends.length;i++){
      ends[i] = 0;
      tdone[i] = 0;
    }
    
    RUN: while(true){
      switch(S3631){
        case 0 : 
          S3631=0;
          break RUN;
        
        case 1 : 
          S3631=2;
          S3631=2;
          thread10229(tdone,ends);
          thread10230(tdone,ends);
          thread10231(tdone,ends);
          int biggest10232 = 0;
          if(ends[6]>=biggest10232){
            biggest10232=ends[6];
          }
          if(ends[7]>=biggest10232){
            biggest10232=ends[7];
          }
          if(ends[8]>=biggest10232){
            biggest10232=ends[8];
          }
          if(biggest10232 == 1){
            active[5]=1;
            ends[5]=1;
            break RUN;
          }
        
        case 2 : 
          thread10233(tdone,ends);
          thread10234(tdone,ends);
          thread10235(tdone,ends);
          int biggest10236 = 0;
          if(ends[6]>=biggest10236){
            biggest10236=ends[6];
          }
          if(ends[7]>=biggest10236){
            biggest10236=ends[7];
          }
          if(ends[8]>=biggest10236){
            biggest10236=ends[8];
          }
          if(biggest10236 == 1){
            active[5]=1;
            ends[5]=1;
            break RUN;
          }
          //FINXME code
          if(biggest10236 == 0){
            S3631=0;
            active[5]=0;
            ends[5]=0;
            S3631=0;
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
          door2Grant_in.gethook();
          door2Deny_in.gethook();
          door2CardReader_o.gethook();
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
      door2Grant_in.sethook();
      door2Deny_in.sethook();
      door2CardReader_o.sethook();
      if(paused[5]!=0 || suspended[5]!=0 || active[5]!=1);
      else{
        door2Grant_in.gethook();
        door2Deny_in.gethook();
        door2CardReader_o.gethook();
      }
      runFinisher();
      if(active[5] == 0){
      	this.terminated = true;
      }
      if(!threaded) break;
    }
  }
}
