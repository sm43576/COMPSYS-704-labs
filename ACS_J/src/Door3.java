import java.util.*;
import com.systemj.ClockDomain;
import com.systemj.Signal;
import com.systemj.input_Channel;
import com.systemj.output_Channel;

public class Door3 extends ClockDomain{
  public Door3(String name){super(name);}
  Vector currsigs = new Vector();
  private boolean df = false;
  private char [] active;
  private char [] paused;
  private char [] suspended;
  public input_Channel door3Grant_in = new input_Channel();
  public input_Channel door3Deny_in = new input_Channel();
  public output_Channel door3CardReader_o = new output_Channel();
  private String badCardID_thread_10;//sysj/Exercise6.sysj line: 93, column: 3
  private long __start_thread_10;//sysj/Exercise6.sysj line: 94, column: 3
  private boolean result_thread_11;//sysj/Exercise6.sysj line: 105, column: 4
  private boolean result_thread_12;//sysj/Exercise6.sysj line: 115, column: 4
  private int S4395 = 1;
  private int S4251 = 1;
  private int S3734 = 1;
  private int S3652 = 1;
  private int S3647 = 1;
  private int S4322 = 1;
  private int S4274 = 1;
  private int S4258 = 1;
  private int S4253 = 1;
  private int S4393 = 1;
  private int S4345 = 1;
  private int S4329 = 1;
  private int S4324 = 1;
  
  private int[] ends = new int[24];
  private int[] tdone = new int[24];
  
  public void thread10243(int [] tdone, int [] ends){
        switch(S4393){
      case 0 : 
        active[12]=0;
        ends[12]=0;
        tdone[12]=1;
        break;
      
      case 1 : 
        switch(S4345){
          case 0 : 
            switch(S4329){
              case 0 : 
                if(!door3Deny_in.isPartnerPresent() || door3Deny_in.isPartnerPreempted()){//sysj/Exercise6.sysj line: 114, column: 4
                  door3Deny_in.setACK(false);//sysj/Exercise6.sysj line: 114, column: 4
                  S4329=1;
                  active[12]=1;
                  ends[12]=1;
                  tdone[12]=1;
                }
                else {
                  switch(S4324){
                    case 0 : 
                      if(!door3Deny_in.isREQ()){//sysj/Exercise6.sysj line: 114, column: 4
                        door3Deny_in.setACK(true);//sysj/Exercise6.sysj line: 114, column: 4
                        S4324=1;
                        if(door3Deny_in.isREQ()){//sysj/Exercise6.sysj line: 114, column: 4
                          door3Deny_in.setACK(false);//sysj/Exercise6.sysj line: 114, column: 4
                          ends[12]=2;
                          ;//sysj/Exercise6.sysj line: 114, column: 4
                          result_thread_12 = (door3Deny_in.getVal() == null ? false : ((Boolean)door3Deny_in.getVal()).booleanValue());//sysj/Exercise6.sysj line: 115, column: 4
                          if(result_thread_12 == true) {//sysj/Exercise6.sysj line: 116, column: 24
                            System.out.println("Door3: Access Denied");//sysj/Exercise6.sysj line: 117, column: 5
                          }
                          S4345=1;
                          active[12]=1;
                          ends[12]=1;
                          tdone[12]=1;
                        }
                        else {
                          active[12]=1;
                          ends[12]=1;
                          tdone[12]=1;
                        }
                      }
                      else {
                        active[12]=1;
                        ends[12]=1;
                        tdone[12]=1;
                      }
                      break;
                    
                    case 1 : 
                      if(door3Deny_in.isREQ()){//sysj/Exercise6.sysj line: 114, column: 4
                        door3Deny_in.setACK(false);//sysj/Exercise6.sysj line: 114, column: 4
                        ends[12]=2;
                        ;//sysj/Exercise6.sysj line: 114, column: 4
                        result_thread_12 = (door3Deny_in.getVal() == null ? false : ((Boolean)door3Deny_in.getVal()).booleanValue());//sysj/Exercise6.sysj line: 115, column: 4
                        if(result_thread_12 == true) {//sysj/Exercise6.sysj line: 116, column: 24
                          System.out.println("Door3: Access Denied");//sysj/Exercise6.sysj line: 117, column: 5
                        }
                        S4345=1;
                        active[12]=1;
                        ends[12]=1;
                        tdone[12]=1;
                      }
                      else {
                        active[12]=1;
                        ends[12]=1;
                        tdone[12]=1;
                      }
                      break;
                    
                  }
                }
                break;
              
              case 1 : 
                S4329=1;
                S4329=0;
                if(!door3Deny_in.isPartnerPresent() || door3Deny_in.isPartnerPreempted()){//sysj/Exercise6.sysj line: 114, column: 4
                  door3Deny_in.setACK(false);//sysj/Exercise6.sysj line: 114, column: 4
                  S4329=1;
                  active[12]=1;
                  ends[12]=1;
                  tdone[12]=1;
                }
                else {
                  S4324=0;
                  if(!door3Deny_in.isREQ()){//sysj/Exercise6.sysj line: 114, column: 4
                    door3Deny_in.setACK(true);//sysj/Exercise6.sysj line: 114, column: 4
                    S4324=1;
                    if(door3Deny_in.isREQ()){//sysj/Exercise6.sysj line: 114, column: 4
                      door3Deny_in.setACK(false);//sysj/Exercise6.sysj line: 114, column: 4
                      ends[12]=2;
                      ;//sysj/Exercise6.sysj line: 114, column: 4
                      result_thread_12 = (door3Deny_in.getVal() == null ? false : ((Boolean)door3Deny_in.getVal()).booleanValue());//sysj/Exercise6.sysj line: 115, column: 4
                      if(result_thread_12 == true) {//sysj/Exercise6.sysj line: 116, column: 24
                        System.out.println("Door3: Access Denied");//sysj/Exercise6.sysj line: 117, column: 5
                      }
                      S4345=1;
                      active[12]=1;
                      ends[12]=1;
                      tdone[12]=1;
                    }
                    else {
                      active[12]=1;
                      ends[12]=1;
                      tdone[12]=1;
                    }
                  }
                  else {
                    active[12]=1;
                    ends[12]=1;
                    tdone[12]=1;
                  }
                }
                break;
              
            }
            break;
          
          case 1 : 
            S4345=1;
            S4345=0;
            S4329=0;
            if(!door3Deny_in.isPartnerPresent() || door3Deny_in.isPartnerPreempted()){//sysj/Exercise6.sysj line: 114, column: 4
              door3Deny_in.setACK(false);//sysj/Exercise6.sysj line: 114, column: 4
              S4329=1;
              active[12]=1;
              ends[12]=1;
              tdone[12]=1;
            }
            else {
              S4324=0;
              if(!door3Deny_in.isREQ()){//sysj/Exercise6.sysj line: 114, column: 4
                door3Deny_in.setACK(true);//sysj/Exercise6.sysj line: 114, column: 4
                S4324=1;
                if(door3Deny_in.isREQ()){//sysj/Exercise6.sysj line: 114, column: 4
                  door3Deny_in.setACK(false);//sysj/Exercise6.sysj line: 114, column: 4
                  ends[12]=2;
                  ;//sysj/Exercise6.sysj line: 114, column: 4
                  result_thread_12 = (door3Deny_in.getVal() == null ? false : ((Boolean)door3Deny_in.getVal()).booleanValue());//sysj/Exercise6.sysj line: 115, column: 4
                  if(result_thread_12 == true) {//sysj/Exercise6.sysj line: 116, column: 24
                    System.out.println("Door3: Access Denied");//sysj/Exercise6.sysj line: 117, column: 5
                  }
                  S4345=1;
                  active[12]=1;
                  ends[12]=1;
                  tdone[12]=1;
                }
                else {
                  active[12]=1;
                  ends[12]=1;
                  tdone[12]=1;
                }
              }
              else {
                active[12]=1;
                ends[12]=1;
                tdone[12]=1;
              }
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread10242(int [] tdone, int [] ends){
        switch(S4322){
      case 0 : 
        active[11]=0;
        ends[11]=0;
        tdone[11]=1;
        break;
      
      case 1 : 
        switch(S4274){
          case 0 : 
            switch(S4258){
              case 0 : 
                if(!door3Grant_in.isPartnerPresent() || door3Grant_in.isPartnerPreempted()){//sysj/Exercise6.sysj line: 104, column: 4
                  door3Grant_in.setACK(false);//sysj/Exercise6.sysj line: 104, column: 4
                  S4258=1;
                  active[11]=1;
                  ends[11]=1;
                  tdone[11]=1;
                }
                else {
                  switch(S4253){
                    case 0 : 
                      if(!door3Grant_in.isREQ()){//sysj/Exercise6.sysj line: 104, column: 4
                        door3Grant_in.setACK(true);//sysj/Exercise6.sysj line: 104, column: 4
                        S4253=1;
                        if(door3Grant_in.isREQ()){//sysj/Exercise6.sysj line: 104, column: 4
                          door3Grant_in.setACK(false);//sysj/Exercise6.sysj line: 104, column: 4
                          ends[11]=2;
                          ;//sysj/Exercise6.sysj line: 104, column: 4
                          result_thread_11 = (door3Grant_in.getVal() == null ? false : ((Boolean)door3Grant_in.getVal()).booleanValue());//sysj/Exercise6.sysj line: 105, column: 4
                          if(result_thread_11 == true) {//sysj/Exercise6.sysj line: 106, column: 24
                            System.out.println("Door3: Opening Door");//sysj/Exercise6.sysj line: 107, column: 5
                          }
                          S4274=1;
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
                      if(door3Grant_in.isREQ()){//sysj/Exercise6.sysj line: 104, column: 4
                        door3Grant_in.setACK(false);//sysj/Exercise6.sysj line: 104, column: 4
                        ends[11]=2;
                        ;//sysj/Exercise6.sysj line: 104, column: 4
                        result_thread_11 = (door3Grant_in.getVal() == null ? false : ((Boolean)door3Grant_in.getVal()).booleanValue());//sysj/Exercise6.sysj line: 105, column: 4
                        if(result_thread_11 == true) {//sysj/Exercise6.sysj line: 106, column: 24
                          System.out.println("Door3: Opening Door");//sysj/Exercise6.sysj line: 107, column: 5
                        }
                        S4274=1;
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
                S4258=1;
                S4258=0;
                if(!door3Grant_in.isPartnerPresent() || door3Grant_in.isPartnerPreempted()){//sysj/Exercise6.sysj line: 104, column: 4
                  door3Grant_in.setACK(false);//sysj/Exercise6.sysj line: 104, column: 4
                  S4258=1;
                  active[11]=1;
                  ends[11]=1;
                  tdone[11]=1;
                }
                else {
                  S4253=0;
                  if(!door3Grant_in.isREQ()){//sysj/Exercise6.sysj line: 104, column: 4
                    door3Grant_in.setACK(true);//sysj/Exercise6.sysj line: 104, column: 4
                    S4253=1;
                    if(door3Grant_in.isREQ()){//sysj/Exercise6.sysj line: 104, column: 4
                      door3Grant_in.setACK(false);//sysj/Exercise6.sysj line: 104, column: 4
                      ends[11]=2;
                      ;//sysj/Exercise6.sysj line: 104, column: 4
                      result_thread_11 = (door3Grant_in.getVal() == null ? false : ((Boolean)door3Grant_in.getVal()).booleanValue());//sysj/Exercise6.sysj line: 105, column: 4
                      if(result_thread_11 == true) {//sysj/Exercise6.sysj line: 106, column: 24
                        System.out.println("Door3: Opening Door");//sysj/Exercise6.sysj line: 107, column: 5
                      }
                      S4274=1;
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
            S4274=1;
            S4274=0;
            S4258=0;
            if(!door3Grant_in.isPartnerPresent() || door3Grant_in.isPartnerPreempted()){//sysj/Exercise6.sysj line: 104, column: 4
              door3Grant_in.setACK(false);//sysj/Exercise6.sysj line: 104, column: 4
              S4258=1;
              active[11]=1;
              ends[11]=1;
              tdone[11]=1;
            }
            else {
              S4253=0;
              if(!door3Grant_in.isREQ()){//sysj/Exercise6.sysj line: 104, column: 4
                door3Grant_in.setACK(true);//sysj/Exercise6.sysj line: 104, column: 4
                S4253=1;
                if(door3Grant_in.isREQ()){//sysj/Exercise6.sysj line: 104, column: 4
                  door3Grant_in.setACK(false);//sysj/Exercise6.sysj line: 104, column: 4
                  ends[11]=2;
                  ;//sysj/Exercise6.sysj line: 104, column: 4
                  result_thread_11 = (door3Grant_in.getVal() == null ? false : ((Boolean)door3Grant_in.getVal()).booleanValue());//sysj/Exercise6.sysj line: 105, column: 4
                  if(result_thread_11 == true) {//sysj/Exercise6.sysj line: 106, column: 24
                    System.out.println("Door3: Opening Door");//sysj/Exercise6.sysj line: 107, column: 5
                  }
                  S4274=1;
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
      
    }
  }

  public void thread10241(int [] tdone, int [] ends){
        switch(S4251){
      case 0 : 
        active[10]=0;
        ends[10]=0;
        tdone[10]=1;
        break;
      
      case 1 : 
        switch(S3734){
          case 0 : 
            if(com.systemj.Timer.getMs() - __start_thread_10 >= (30) * 1000){//sysj/Exercise6.sysj line: 94, column: 3
              ends[10]=2;
              ;//sysj/Exercise6.sysj line: 94, column: 3
              S3734=1;
              S3652=0;
              if(!door3CardReader_o.isPartnerPresent() || door3CardReader_o.isPartnerPreempted()){//sysj/Exercise6.sysj line: 96, column: 4
                door3CardReader_o.setREQ(false);//sysj/Exercise6.sysj line: 96, column: 4
                S3652=1;
                active[10]=1;
                ends[10]=1;
                tdone[10]=1;
              }
              else {
                S3647=0;
                if(door3CardReader_o.isACK()){//sysj/Exercise6.sysj line: 96, column: 4
                  door3CardReader_o.setVal(badCardID_thread_10);//sysj/Exercise6.sysj line: 96, column: 4
                  S3647=1;
                  if(!door3CardReader_o.isACK()){//sysj/Exercise6.sysj line: 96, column: 4
                    door3CardReader_o.setREQ(false);//sysj/Exercise6.sysj line: 96, column: 4
                    ends[10]=2;
                    ;//sysj/Exercise6.sysj line: 96, column: 4
                    S3734=2;
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
          
          case 1 : 
            switch(S3652){
              case 0 : 
                if(!door3CardReader_o.isPartnerPresent() || door3CardReader_o.isPartnerPreempted()){//sysj/Exercise6.sysj line: 96, column: 4
                  door3CardReader_o.setREQ(false);//sysj/Exercise6.sysj line: 96, column: 4
                  S3652=1;
                  active[10]=1;
                  ends[10]=1;
                  tdone[10]=1;
                }
                else {
                  switch(S3647){
                    case 0 : 
                      if(door3CardReader_o.isACK()){//sysj/Exercise6.sysj line: 96, column: 4
                        door3CardReader_o.setVal(badCardID_thread_10);//sysj/Exercise6.sysj line: 96, column: 4
                        S3647=1;
                        if(!door3CardReader_o.isACK()){//sysj/Exercise6.sysj line: 96, column: 4
                          door3CardReader_o.setREQ(false);//sysj/Exercise6.sysj line: 96, column: 4
                          ends[10]=2;
                          ;//sysj/Exercise6.sysj line: 96, column: 4
                          S3734=2;
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
                      if(!door3CardReader_o.isACK()){//sysj/Exercise6.sysj line: 96, column: 4
                        door3CardReader_o.setREQ(false);//sysj/Exercise6.sysj line: 96, column: 4
                        ends[10]=2;
                        ;//sysj/Exercise6.sysj line: 96, column: 4
                        S3734=2;
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
                S3652=1;
                S3652=0;
                if(!door3CardReader_o.isPartnerPresent() || door3CardReader_o.isPartnerPreempted()){//sysj/Exercise6.sysj line: 96, column: 4
                  door3CardReader_o.setREQ(false);//sysj/Exercise6.sysj line: 96, column: 4
                  S3652=1;
                  active[10]=1;
                  ends[10]=1;
                  tdone[10]=1;
                }
                else {
                  S3647=0;
                  if(door3CardReader_o.isACK()){//sysj/Exercise6.sysj line: 96, column: 4
                    door3CardReader_o.setVal(badCardID_thread_10);//sysj/Exercise6.sysj line: 96, column: 4
                    S3647=1;
                    if(!door3CardReader_o.isACK()){//sysj/Exercise6.sysj line: 96, column: 4
                      door3CardReader_o.setREQ(false);//sysj/Exercise6.sysj line: 96, column: 4
                      ends[10]=2;
                      ;//sysj/Exercise6.sysj line: 96, column: 4
                      S3734=2;
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
          
          case 2 : 
            S3734=2;
            S3734=0;
            __start_thread_10 = com.systemj.Timer.getMs();//sysj/Exercise6.sysj line: 94, column: 3
            if(com.systemj.Timer.getMs() - __start_thread_10 >= (30) * 1000){//sysj/Exercise6.sysj line: 94, column: 3
              ends[10]=2;
              ;//sysj/Exercise6.sysj line: 94, column: 3
              S3734=1;
              S3652=0;
              if(!door3CardReader_o.isPartnerPresent() || door3CardReader_o.isPartnerPreempted()){//sysj/Exercise6.sysj line: 96, column: 4
                door3CardReader_o.setREQ(false);//sysj/Exercise6.sysj line: 96, column: 4
                S3652=1;
                active[10]=1;
                ends[10]=1;
                tdone[10]=1;
              }
              else {
                S3647=0;
                if(door3CardReader_o.isACK()){//sysj/Exercise6.sysj line: 96, column: 4
                  door3CardReader_o.setVal(badCardID_thread_10);//sysj/Exercise6.sysj line: 96, column: 4
                  S3647=1;
                  if(!door3CardReader_o.isACK()){//sysj/Exercise6.sysj line: 96, column: 4
                    door3CardReader_o.setREQ(false);//sysj/Exercise6.sysj line: 96, column: 4
                    ends[10]=2;
                    ;//sysj/Exercise6.sysj line: 96, column: 4
                    S3734=2;
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

  public void thread10239(int [] tdone, int [] ends){
        S4393=1;
    S4345=0;
    S4329=0;
    if(!door3Deny_in.isPartnerPresent() || door3Deny_in.isPartnerPreempted()){//sysj/Exercise6.sysj line: 114, column: 4
      door3Deny_in.setACK(false);//sysj/Exercise6.sysj line: 114, column: 4
      S4329=1;
      active[12]=1;
      ends[12]=1;
      tdone[12]=1;
    }
    else {
      S4324=0;
      if(!door3Deny_in.isREQ()){//sysj/Exercise6.sysj line: 114, column: 4
        door3Deny_in.setACK(true);//sysj/Exercise6.sysj line: 114, column: 4
        S4324=1;
        if(door3Deny_in.isREQ()){//sysj/Exercise6.sysj line: 114, column: 4
          door3Deny_in.setACK(false);//sysj/Exercise6.sysj line: 114, column: 4
          ends[12]=2;
          ;//sysj/Exercise6.sysj line: 114, column: 4
          result_thread_12 = (door3Deny_in.getVal() == null ? false : ((Boolean)door3Deny_in.getVal()).booleanValue());//sysj/Exercise6.sysj line: 115, column: 4
          if(result_thread_12 == true) {//sysj/Exercise6.sysj line: 116, column: 24
            System.out.println("Door3: Access Denied");//sysj/Exercise6.sysj line: 117, column: 5
          }
          S4345=1;
          active[12]=1;
          ends[12]=1;
          tdone[12]=1;
        }
        else {
          active[12]=1;
          ends[12]=1;
          tdone[12]=1;
        }
      }
      else {
        active[12]=1;
        ends[12]=1;
        tdone[12]=1;
      }
    }
  }

  public void thread10238(int [] tdone, int [] ends){
        S4322=1;
    S4274=0;
    S4258=0;
    if(!door3Grant_in.isPartnerPresent() || door3Grant_in.isPartnerPreempted()){//sysj/Exercise6.sysj line: 104, column: 4
      door3Grant_in.setACK(false);//sysj/Exercise6.sysj line: 104, column: 4
      S4258=1;
      active[11]=1;
      ends[11]=1;
      tdone[11]=1;
    }
    else {
      S4253=0;
      if(!door3Grant_in.isREQ()){//sysj/Exercise6.sysj line: 104, column: 4
        door3Grant_in.setACK(true);//sysj/Exercise6.sysj line: 104, column: 4
        S4253=1;
        if(door3Grant_in.isREQ()){//sysj/Exercise6.sysj line: 104, column: 4
          door3Grant_in.setACK(false);//sysj/Exercise6.sysj line: 104, column: 4
          ends[11]=2;
          ;//sysj/Exercise6.sysj line: 104, column: 4
          result_thread_11 = (door3Grant_in.getVal() == null ? false : ((Boolean)door3Grant_in.getVal()).booleanValue());//sysj/Exercise6.sysj line: 105, column: 4
          if(result_thread_11 == true) {//sysj/Exercise6.sysj line: 106, column: 24
            System.out.println("Door3: Opening Door");//sysj/Exercise6.sysj line: 107, column: 5
          }
          S4274=1;
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

  public void thread10237(int [] tdone, int [] ends){
        S4251=1;
    badCardID_thread_10 = "12110";//sysj/Exercise6.sysj line: 93, column: 3
    S3734=0;
    __start_thread_10 = com.systemj.Timer.getMs();//sysj/Exercise6.sysj line: 94, column: 3
    if(com.systemj.Timer.getMs() - __start_thread_10 >= (30) * 1000){//sysj/Exercise6.sysj line: 94, column: 3
      ends[10]=2;
      ;//sysj/Exercise6.sysj line: 94, column: 3
      S3734=1;
      S3652=0;
      if(!door3CardReader_o.isPartnerPresent() || door3CardReader_o.isPartnerPreempted()){//sysj/Exercise6.sysj line: 96, column: 4
        door3CardReader_o.setREQ(false);//sysj/Exercise6.sysj line: 96, column: 4
        S3652=1;
        active[10]=1;
        ends[10]=1;
        tdone[10]=1;
      }
      else {
        S3647=0;
        if(door3CardReader_o.isACK()){//sysj/Exercise6.sysj line: 96, column: 4
          door3CardReader_o.setVal(badCardID_thread_10);//sysj/Exercise6.sysj line: 96, column: 4
          S3647=1;
          if(!door3CardReader_o.isACK()){//sysj/Exercise6.sysj line: 96, column: 4
            door3CardReader_o.setREQ(false);//sysj/Exercise6.sysj line: 96, column: 4
            ends[10]=2;
            ;//sysj/Exercise6.sysj line: 96, column: 4
            S3734=2;
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
  }

  public void runClockDomain(){
    for(int i=0;i<ends.length;i++){
      ends[i] = 0;
      tdone[i] = 0;
    }
    
    RUN: while(true){
      switch(S4395){
        case 0 : 
          S4395=0;
          break RUN;
        
        case 1 : 
          S4395=2;
          S4395=2;
          thread10237(tdone,ends);
          thread10238(tdone,ends);
          thread10239(tdone,ends);
          int biggest10240 = 0;
          if(ends[10]>=biggest10240){
            biggest10240=ends[10];
          }
          if(ends[11]>=biggest10240){
            biggest10240=ends[11];
          }
          if(ends[12]>=biggest10240){
            biggest10240=ends[12];
          }
          if(biggest10240 == 1){
            active[9]=1;
            ends[9]=1;
            break RUN;
          }
        
        case 2 : 
          thread10241(tdone,ends);
          thread10242(tdone,ends);
          thread10243(tdone,ends);
          int biggest10244 = 0;
          if(ends[10]>=biggest10244){
            biggest10244=ends[10];
          }
          if(ends[11]>=biggest10244){
            biggest10244=ends[11];
          }
          if(ends[12]>=biggest10244){
            biggest10244=ends[12];
          }
          if(biggest10244 == 1){
            active[9]=1;
            ends[9]=1;
            break RUN;
          }
          //FINXME code
          if(biggest10244 == 0){
            S4395=0;
            active[9]=0;
            ends[9]=0;
            S4395=0;
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
          door3Grant_in.gethook();
          door3Deny_in.gethook();
          door3CardReader_o.gethook();
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
      door3Grant_in.sethook();
      door3Deny_in.sethook();
      door3CardReader_o.sethook();
      if(paused[9]!=0 || suspended[9]!=0 || active[9]!=1);
      else{
        door3Grant_in.gethook();
        door3Deny_in.gethook();
        door3CardReader_o.gethook();
      }
      runFinisher();
      if(active[9] == 0){
      	this.terminated = true;
      }
      if(!threaded) break;
    }
  }
}
