import java.util.*;
import com.systemj.ClockDomain;
import com.systemj.Signal;
import com.systemj.input_Channel;
import com.systemj.output_Channel;

public class Orchestrator extends ClockDomain{
  public Orchestrator(String name){super(name);}
  Vector currsigs = new Vector();
  private boolean df = false;
  private char [] active;
  private char [] paused;
  private char [] suspended;
  public input_Channel conveyorStatus_in = new input_Channel();
  public input_Channel rotaryStatus_in = new input_Channel();
  public output_Channel conveyorReq_o = new output_Channel();
  public output_Channel allOperationsFinished_o = new output_Channel();
  private String status_thread_2;//sysj\orchestrator.sysj line: 12, column: 4
  private int S2413 = 1;
  private int S2340 = 1;
  private int S2292 = 1;
  private int S2276 = 1;
  private int S2271 = 1;
  private int S2411 = 1;
  private int S2363 = 1;
  private int S2347 = 1;
  private int S2342 = 1;
  
  private int[] ends = new int[4];
  private int[] tdone = new int[4];
  
  public void thread2419(int [] tdone, int [] ends){
        switch(S2411){
      case 0 : 
        active[3]=0;
        ends[3]=0;
        tdone[3]=1;
        break;
      
      case 1 : 
        switch(S2363){
          case 0 : 
            switch(S2347){
              case 0 : 
                if(!conveyorReq_o.isPartnerPresent() || conveyorReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 32, column: 4
                  conveyorReq_o.setREQ(false);//sysj\orchestrator.sysj line: 32, column: 4
                  S2347=1;
                  active[3]=1;
                  ends[3]=1;
                  tdone[3]=1;
                }
                else {
                  switch(S2342){
                    case 0 : 
                      if(conveyorReq_o.isACK()){//sysj\orchestrator.sysj line: 32, column: 4
                        conveyorReq_o.setVal(true);//sysj\orchestrator.sysj line: 32, column: 4
                        S2342=1;
                        if(!conveyorReq_o.isACK()){//sysj\orchestrator.sysj line: 32, column: 4
                          conveyorReq_o.setREQ(false);//sysj\orchestrator.sysj line: 32, column: 4
                          ends[3]=2;
                          ;//sysj\orchestrator.sysj line: 32, column: 4
                          System.out.println("sending?");//sysj\orchestrator.sysj line: 33, column: 4
                          S2363=1;
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
                      if(!conveyorReq_o.isACK()){//sysj\orchestrator.sysj line: 32, column: 4
                        conveyorReq_o.setREQ(false);//sysj\orchestrator.sysj line: 32, column: 4
                        ends[3]=2;
                        ;//sysj\orchestrator.sysj line: 32, column: 4
                        System.out.println("sending?");//sysj\orchestrator.sysj line: 33, column: 4
                        S2363=1;
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
                S2347=1;
                S2347=0;
                if(!conveyorReq_o.isPartnerPresent() || conveyorReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 32, column: 4
                  conveyorReq_o.setREQ(false);//sysj\orchestrator.sysj line: 32, column: 4
                  S2347=1;
                  active[3]=1;
                  ends[3]=1;
                  tdone[3]=1;
                }
                else {
                  S2342=0;
                  if(conveyorReq_o.isACK()){//sysj\orchestrator.sysj line: 32, column: 4
                    conveyorReq_o.setVal(true);//sysj\orchestrator.sysj line: 32, column: 4
                    S2342=1;
                    if(!conveyorReq_o.isACK()){//sysj\orchestrator.sysj line: 32, column: 4
                      conveyorReq_o.setREQ(false);//sysj\orchestrator.sysj line: 32, column: 4
                      ends[3]=2;
                      ;//sysj\orchestrator.sysj line: 32, column: 4
                      System.out.println("sending?");//sysj\orchestrator.sysj line: 33, column: 4
                      S2363=1;
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
            S2363=1;
            S2363=0;
            S2347=0;
            if(!conveyorReq_o.isPartnerPresent() || conveyorReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 32, column: 4
              conveyorReq_o.setREQ(false);//sysj\orchestrator.sysj line: 32, column: 4
              S2347=1;
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            else {
              S2342=0;
              if(conveyorReq_o.isACK()){//sysj\orchestrator.sysj line: 32, column: 4
                conveyorReq_o.setVal(true);//sysj\orchestrator.sysj line: 32, column: 4
                S2342=1;
                if(!conveyorReq_o.isACK()){//sysj\orchestrator.sysj line: 32, column: 4
                  conveyorReq_o.setREQ(false);//sysj\orchestrator.sysj line: 32, column: 4
                  ends[3]=2;
                  ;//sysj\orchestrator.sysj line: 32, column: 4
                  System.out.println("sending?");//sysj\orchestrator.sysj line: 33, column: 4
                  S2363=1;
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

  public void thread2418(int [] tdone, int [] ends){
        switch(S2340){
      case 0 : 
        active[2]=0;
        ends[2]=0;
        tdone[2]=1;
        break;
      
      case 1 : 
        switch(S2292){
          case 0 : 
            switch(S2276){
              case 0 : 
                if(!conveyorStatus_in.isPartnerPresent() || conveyorStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 11, column: 4
                  conveyorStatus_in.setACK(false);//sysj\orchestrator.sysj line: 11, column: 4
                  S2276=1;
                  active[2]=1;
                  ends[2]=1;
                  tdone[2]=1;
                }
                else {
                  switch(S2271){
                    case 0 : 
                      if(!conveyorStatus_in.isREQ()){//sysj\orchestrator.sysj line: 11, column: 4
                        conveyorStatus_in.setACK(true);//sysj\orchestrator.sysj line: 11, column: 4
                        S2271=1;
                        if(conveyorStatus_in.isREQ()){//sysj\orchestrator.sysj line: 11, column: 4
                          conveyorStatus_in.setACK(false);//sysj\orchestrator.sysj line: 11, column: 4
                          ends[2]=2;
                          ;//sysj\orchestrator.sysj line: 11, column: 4
                          status_thread_2 = (String)(conveyorStatus_in.getVal() == null ? null : ((String)conveyorStatus_in.getVal()));//sysj\orchestrator.sysj line: 12, column: 4
                          System.out.println(status_thread_2);//sysj\orchestrator.sysj line: 13, column: 4
                          switch (status_thread_2) {//sysj\orchestrator.sysj line: 14, column: 4
                            case "idle"://sysj\orchestrator.sysj line: 15, column: 5
                              System.out.println("received Idle");//sysj\orchestrator.sysj line: 16, column: 6
                            case "busy"://sysj\orchestrator.sysj line: 17, column: 5
                              System.out.println("received Busy");//sysj\orchestrator.sysj line: 18, column: 6
                            case "done"://sysj\orchestrator.sysj line: 20, column: 5
                              System.out.println("received Done");//sysj\orchestrator.sysj line: 21, column: 6
                            default://sysj\orchestrator.sysj line: 22, column: 5
                              System.out.println("afk");//sysj\orchestrator.sysj line: 23, column: 6
                          }
                          System.out.println("orchestator is here");//sysj\orchestrator.sysj line: 25, column: 4
                          S2292=1;
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
                      if(conveyorStatus_in.isREQ()){//sysj\orchestrator.sysj line: 11, column: 4
                        conveyorStatus_in.setACK(false);//sysj\orchestrator.sysj line: 11, column: 4
                        ends[2]=2;
                        ;//sysj\orchestrator.sysj line: 11, column: 4
                        status_thread_2 = (String)(conveyorStatus_in.getVal() == null ? null : ((String)conveyorStatus_in.getVal()));//sysj\orchestrator.sysj line: 12, column: 4
                        System.out.println(status_thread_2);//sysj\orchestrator.sysj line: 13, column: 4
                        switch (status_thread_2) {//sysj\orchestrator.sysj line: 14, column: 4
                          case "idle"://sysj\orchestrator.sysj line: 15, column: 5
                            System.out.println("received Idle");//sysj\orchestrator.sysj line: 16, column: 6
                          case "busy"://sysj\orchestrator.sysj line: 17, column: 5
                            System.out.println("received Busy");//sysj\orchestrator.sysj line: 18, column: 6
                          case "done"://sysj\orchestrator.sysj line: 20, column: 5
                            System.out.println("received Done");//sysj\orchestrator.sysj line: 21, column: 6
                          default://sysj\orchestrator.sysj line: 22, column: 5
                            System.out.println("afk");//sysj\orchestrator.sysj line: 23, column: 6
                        }
                        System.out.println("orchestator is here");//sysj\orchestrator.sysj line: 25, column: 4
                        S2292=1;
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
                S2276=1;
                S2276=0;
                if(!conveyorStatus_in.isPartnerPresent() || conveyorStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 11, column: 4
                  conveyorStatus_in.setACK(false);//sysj\orchestrator.sysj line: 11, column: 4
                  S2276=1;
                  active[2]=1;
                  ends[2]=1;
                  tdone[2]=1;
                }
                else {
                  S2271=0;
                  if(!conveyorStatus_in.isREQ()){//sysj\orchestrator.sysj line: 11, column: 4
                    conveyorStatus_in.setACK(true);//sysj\orchestrator.sysj line: 11, column: 4
                    S2271=1;
                    if(conveyorStatus_in.isREQ()){//sysj\orchestrator.sysj line: 11, column: 4
                      conveyorStatus_in.setACK(false);//sysj\orchestrator.sysj line: 11, column: 4
                      ends[2]=2;
                      ;//sysj\orchestrator.sysj line: 11, column: 4
                      status_thread_2 = (String)(conveyorStatus_in.getVal() == null ? null : ((String)conveyorStatus_in.getVal()));//sysj\orchestrator.sysj line: 12, column: 4
                      System.out.println(status_thread_2);//sysj\orchestrator.sysj line: 13, column: 4
                      switch (status_thread_2) {//sysj\orchestrator.sysj line: 14, column: 4
                        case "idle"://sysj\orchestrator.sysj line: 15, column: 5
                          System.out.println("received Idle");//sysj\orchestrator.sysj line: 16, column: 6
                        case "busy"://sysj\orchestrator.sysj line: 17, column: 5
                          System.out.println("received Busy");//sysj\orchestrator.sysj line: 18, column: 6
                        case "done"://sysj\orchestrator.sysj line: 20, column: 5
                          System.out.println("received Done");//sysj\orchestrator.sysj line: 21, column: 6
                        default://sysj\orchestrator.sysj line: 22, column: 5
                          System.out.println("afk");//sysj\orchestrator.sysj line: 23, column: 6
                      }
                      System.out.println("orchestator is here");//sysj\orchestrator.sysj line: 25, column: 4
                      S2292=1;
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
            S2292=1;
            S2292=0;
            S2276=0;
            if(!conveyorStatus_in.isPartnerPresent() || conveyorStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 11, column: 4
              conveyorStatus_in.setACK(false);//sysj\orchestrator.sysj line: 11, column: 4
              S2276=1;
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            else {
              S2271=0;
              if(!conveyorStatus_in.isREQ()){//sysj\orchestrator.sysj line: 11, column: 4
                conveyorStatus_in.setACK(true);//sysj\orchestrator.sysj line: 11, column: 4
                S2271=1;
                if(conveyorStatus_in.isREQ()){//sysj\orchestrator.sysj line: 11, column: 4
                  conveyorStatus_in.setACK(false);//sysj\orchestrator.sysj line: 11, column: 4
                  ends[2]=2;
                  ;//sysj\orchestrator.sysj line: 11, column: 4
                  status_thread_2 = (String)(conveyorStatus_in.getVal() == null ? null : ((String)conveyorStatus_in.getVal()));//sysj\orchestrator.sysj line: 12, column: 4
                  System.out.println(status_thread_2);//sysj\orchestrator.sysj line: 13, column: 4
                  switch (status_thread_2) {//sysj\orchestrator.sysj line: 14, column: 4
                    case "idle"://sysj\orchestrator.sysj line: 15, column: 5
                      System.out.println("received Idle");//sysj\orchestrator.sysj line: 16, column: 6
                    case "busy"://sysj\orchestrator.sysj line: 17, column: 5
                      System.out.println("received Busy");//sysj\orchestrator.sysj line: 18, column: 6
                    case "done"://sysj\orchestrator.sysj line: 20, column: 5
                      System.out.println("received Done");//sysj\orchestrator.sysj line: 21, column: 6
                    default://sysj\orchestrator.sysj line: 22, column: 5
                      System.out.println("afk");//sysj\orchestrator.sysj line: 23, column: 6
                  }
                  System.out.println("orchestator is here");//sysj\orchestrator.sysj line: 25, column: 4
                  S2292=1;
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

  public void thread2416(int [] tdone, int [] ends){
        S2411=1;
    S2363=0;
    S2347=0;
    if(!conveyorReq_o.isPartnerPresent() || conveyorReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 32, column: 4
      conveyorReq_o.setREQ(false);//sysj\orchestrator.sysj line: 32, column: 4
      S2347=1;
      active[3]=1;
      ends[3]=1;
      tdone[3]=1;
    }
    else {
      S2342=0;
      if(conveyorReq_o.isACK()){//sysj\orchestrator.sysj line: 32, column: 4
        conveyorReq_o.setVal(true);//sysj\orchestrator.sysj line: 32, column: 4
        S2342=1;
        if(!conveyorReq_o.isACK()){//sysj\orchestrator.sysj line: 32, column: 4
          conveyorReq_o.setREQ(false);//sysj\orchestrator.sysj line: 32, column: 4
          ends[3]=2;
          ;//sysj\orchestrator.sysj line: 32, column: 4
          System.out.println("sending?");//sysj\orchestrator.sysj line: 33, column: 4
          S2363=1;
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

  public void thread2415(int [] tdone, int [] ends){
        S2340=1;
    S2292=0;
    S2276=0;
    if(!conveyorStatus_in.isPartnerPresent() || conveyorStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 11, column: 4
      conveyorStatus_in.setACK(false);//sysj\orchestrator.sysj line: 11, column: 4
      S2276=1;
      active[2]=1;
      ends[2]=1;
      tdone[2]=1;
    }
    else {
      S2271=0;
      if(!conveyorStatus_in.isREQ()){//sysj\orchestrator.sysj line: 11, column: 4
        conveyorStatus_in.setACK(true);//sysj\orchestrator.sysj line: 11, column: 4
        S2271=1;
        if(conveyorStatus_in.isREQ()){//sysj\orchestrator.sysj line: 11, column: 4
          conveyorStatus_in.setACK(false);//sysj\orchestrator.sysj line: 11, column: 4
          ends[2]=2;
          ;//sysj\orchestrator.sysj line: 11, column: 4
          status_thread_2 = (String)(conveyorStatus_in.getVal() == null ? null : ((String)conveyorStatus_in.getVal()));//sysj\orchestrator.sysj line: 12, column: 4
          System.out.println(status_thread_2);//sysj\orchestrator.sysj line: 13, column: 4
          switch (status_thread_2) {//sysj\orchestrator.sysj line: 14, column: 4
            case "idle"://sysj\orchestrator.sysj line: 15, column: 5
              System.out.println("received Idle");//sysj\orchestrator.sysj line: 16, column: 6
            case "busy"://sysj\orchestrator.sysj line: 17, column: 5
              System.out.println("received Busy");//sysj\orchestrator.sysj line: 18, column: 6
            case "done"://sysj\orchestrator.sysj line: 20, column: 5
              System.out.println("received Done");//sysj\orchestrator.sysj line: 21, column: 6
            default://sysj\orchestrator.sysj line: 22, column: 5
              System.out.println("afk");//sysj\orchestrator.sysj line: 23, column: 6
          }
          System.out.println("orchestator is here");//sysj\orchestrator.sysj line: 25, column: 4
          S2292=1;
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
      switch(S2413){
        case 0 : 
          S2413=0;
          break RUN;
        
        case 1 : 
          S2413=2;
          S2413=2;
          thread2415(tdone,ends);
          thread2416(tdone,ends);
          int biggest2417 = 0;
          if(ends[2]>=biggest2417){
            biggest2417=ends[2];
          }
          if(ends[3]>=biggest2417){
            biggest2417=ends[3];
          }
          if(biggest2417 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
        
        case 2 : 
          thread2418(tdone,ends);
          thread2419(tdone,ends);
          int biggest2420 = 0;
          if(ends[2]>=biggest2420){
            biggest2420=ends[2];
          }
          if(ends[3]>=biggest2420){
            biggest2420=ends[3];
          }
          if(biggest2420 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
          //FINXME code
          if(biggest2420 == 0){
            S2413=0;
            active[1]=0;
            ends[1]=0;
            S2413=0;
            break RUN;
          }
        
      }
    }
  }

  public void init(){
    char [] active1 = {1, 1, 1, 1};
    char [] paused1 = {0, 0, 0, 0};
    char [] suspended1 = {0, 0, 0, 0};
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
          conveyorStatus_in.gethook();
          rotaryStatus_in.gethook();
          conveyorReq_o.gethook();
          allOperationsFinished_o.gethook();
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
      conveyorStatus_in.sethook();
      rotaryStatus_in.sethook();
      conveyorReq_o.sethook();
      allOperationsFinished_o.sethook();
      if(paused[1]!=0 || suspended[1]!=0 || active[1]!=1);
      else{
        conveyorStatus_in.gethook();
        rotaryStatus_in.gethook();
        conveyorReq_o.gethook();
        allOperationsFinished_o.gethook();
      }
      runFinisher();
      if(active[1] == 0){
      	this.terminated = true;
      }
      if(!threaded) break;
    }
  }
}
