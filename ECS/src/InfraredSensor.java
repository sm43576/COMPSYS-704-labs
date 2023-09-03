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
  private long __start_thread_9;//sysj/controller.sysj line: 32, column: 3
  private int S744 = 1;
  private int S584 = 1;
  private int S512 = 1;
  private int S507 = 1;
  
  private int[] ends = new int[10];
  private int[] tdone = new int[10];
  
  public void runClockDomain(){
    for(int i=0;i<ends.length;i++){
      ends[i] = 0;
      tdone[i] = 0;
    }
    
    RUN: while(true){
      switch(S744){
        case 0 : 
          S744=0;
          break RUN;
        
        case 1 : 
          S744=2;
          S744=2;
          S584=0;
          S512=0;
          if(!zone3P_o.isPartnerPresent() || zone3P_o.isPartnerPreempted()){//sysj/controller.sysj line: 34, column: 5
            zone3P_o.setREQ(false);//sysj/controller.sysj line: 34, column: 5
            S512=1;
            active[9]=1;
            ends[9]=1;
            break RUN;
          }
          else {
            S507=0;
            if(zone3P_o.isACK()){//sysj/controller.sysj line: 34, column: 5
              zone3P_o.setVal(true);//sysj/controller.sysj line: 34, column: 5
              S507=1;
              if(!zone3P_o.isACK()){//sysj/controller.sysj line: 34, column: 5
                zone3P_o.setREQ(false);//sysj/controller.sysj line: 34, column: 5
                ends[9]=2;
                ;//sysj/controller.sysj line: 34, column: 5
                S584=1;
                __start_thread_9 = com.systemj.Timer.getMs();//sysj/controller.sysj line: 32, column: 3
                if(com.systemj.Timer.getMs() - __start_thread_9 >= (120) * 1000){//sysj/controller.sysj line: 32, column: 3
                  ends[9]=2;
                  ;//sysj/controller.sysj line: 32, column: 3
                  S584=2;
                  active[9]=1;
                  ends[9]=1;
                  break RUN;
                }
                else {
                  active[9]=1;
                  ends[9]=1;
                  break RUN;
                }
              }
              else {
                active[9]=1;
                ends[9]=1;
                break RUN;
              }
            }
            else {
              active[9]=1;
              ends[9]=1;
              break RUN;
            }
          }
        
        case 2 : 
          switch(S584){
            case 0 : 
              switch(S512){
                case 0 : 
                  if(!zone3P_o.isPartnerPresent() || zone3P_o.isPartnerPreempted()){//sysj/controller.sysj line: 34, column: 5
                    zone3P_o.setREQ(false);//sysj/controller.sysj line: 34, column: 5
                    S512=1;
                    active[9]=1;
                    ends[9]=1;
                    break RUN;
                  }
                  else {
                    switch(S507){
                      case 0 : 
                        if(zone3P_o.isACK()){//sysj/controller.sysj line: 34, column: 5
                          zone3P_o.setVal(true);//sysj/controller.sysj line: 34, column: 5
                          S507=1;
                          if(!zone3P_o.isACK()){//sysj/controller.sysj line: 34, column: 5
                            zone3P_o.setREQ(false);//sysj/controller.sysj line: 34, column: 5
                            ends[9]=2;
                            ;//sysj/controller.sysj line: 34, column: 5
                            S584=1;
                            __start_thread_9 = com.systemj.Timer.getMs();//sysj/controller.sysj line: 32, column: 3
                            if(com.systemj.Timer.getMs() - __start_thread_9 >= (120) * 1000){//sysj/controller.sysj line: 32, column: 3
                              ends[9]=2;
                              ;//sysj/controller.sysj line: 32, column: 3
                              S584=2;
                              active[9]=1;
                              ends[9]=1;
                              break RUN;
                            }
                            else {
                              active[9]=1;
                              ends[9]=1;
                              break RUN;
                            }
                          }
                          else {
                            active[9]=1;
                            ends[9]=1;
                            break RUN;
                          }
                        }
                        else {
                          active[9]=1;
                          ends[9]=1;
                          break RUN;
                        }
                      
                      case 1 : 
                        if(!zone3P_o.isACK()){//sysj/controller.sysj line: 34, column: 5
                          zone3P_o.setREQ(false);//sysj/controller.sysj line: 34, column: 5
                          ends[9]=2;
                          ;//sysj/controller.sysj line: 34, column: 5
                          S584=1;
                          __start_thread_9 = com.systemj.Timer.getMs();//sysj/controller.sysj line: 32, column: 3
                          if(com.systemj.Timer.getMs() - __start_thread_9 >= (120) * 1000){//sysj/controller.sysj line: 32, column: 3
                            ends[9]=2;
                            ;//sysj/controller.sysj line: 32, column: 3
                            S584=2;
                            active[9]=1;
                            ends[9]=1;
                            break RUN;
                          }
                          else {
                            active[9]=1;
                            ends[9]=1;
                            break RUN;
                          }
                        }
                        else {
                          active[9]=1;
                          ends[9]=1;
                          break RUN;
                        }
                      
                    }
                  }
                  break;
                
                case 1 : 
                  S512=1;
                  S512=0;
                  if(!zone3P_o.isPartnerPresent() || zone3P_o.isPartnerPreempted()){//sysj/controller.sysj line: 34, column: 5
                    zone3P_o.setREQ(false);//sysj/controller.sysj line: 34, column: 5
                    S512=1;
                    active[9]=1;
                    ends[9]=1;
                    break RUN;
                  }
                  else {
                    S507=0;
                    if(zone3P_o.isACK()){//sysj/controller.sysj line: 34, column: 5
                      zone3P_o.setVal(true);//sysj/controller.sysj line: 34, column: 5
                      S507=1;
                      if(!zone3P_o.isACK()){//sysj/controller.sysj line: 34, column: 5
                        zone3P_o.setREQ(false);//sysj/controller.sysj line: 34, column: 5
                        ends[9]=2;
                        ;//sysj/controller.sysj line: 34, column: 5
                        S584=1;
                        __start_thread_9 = com.systemj.Timer.getMs();//sysj/controller.sysj line: 32, column: 3
                        if(com.systemj.Timer.getMs() - __start_thread_9 >= (120) * 1000){//sysj/controller.sysj line: 32, column: 3
                          ends[9]=2;
                          ;//sysj/controller.sysj line: 32, column: 3
                          S584=2;
                          active[9]=1;
                          ends[9]=1;
                          break RUN;
                        }
                        else {
                          active[9]=1;
                          ends[9]=1;
                          break RUN;
                        }
                      }
                      else {
                        active[9]=1;
                        ends[9]=1;
                        break RUN;
                      }
                    }
                    else {
                      active[9]=1;
                      ends[9]=1;
                      break RUN;
                    }
                  }
                
              }
              break;
            
            case 1 : 
              if(com.systemj.Timer.getMs() - __start_thread_9 >= (120) * 1000){//sysj/controller.sysj line: 32, column: 3
                ends[9]=2;
                ;//sysj/controller.sysj line: 32, column: 3
                S584=2;
                active[9]=1;
                ends[9]=1;
                break RUN;
              }
              else {
                active[9]=1;
                ends[9]=1;
                break RUN;
              }
            
            case 2 : 
              S584=2;
              S584=0;
              S512=0;
              if(!zone3P_o.isPartnerPresent() || zone3P_o.isPartnerPreempted()){//sysj/controller.sysj line: 34, column: 5
                zone3P_o.setREQ(false);//sysj/controller.sysj line: 34, column: 5
                S512=1;
                active[9]=1;
                ends[9]=1;
                break RUN;
              }
              else {
                S507=0;
                if(zone3P_o.isACK()){//sysj/controller.sysj line: 34, column: 5
                  zone3P_o.setVal(true);//sysj/controller.sysj line: 34, column: 5
                  S507=1;
                  if(!zone3P_o.isACK()){//sysj/controller.sysj line: 34, column: 5
                    zone3P_o.setREQ(false);//sysj/controller.sysj line: 34, column: 5
                    ends[9]=2;
                    ;//sysj/controller.sysj line: 34, column: 5
                    S584=1;
                    __start_thread_9 = com.systemj.Timer.getMs();//sysj/controller.sysj line: 32, column: 3
                    if(com.systemj.Timer.getMs() - __start_thread_9 >= (120) * 1000){//sysj/controller.sysj line: 32, column: 3
                      ends[9]=2;
                      ;//sysj/controller.sysj line: 32, column: 3
                      S584=2;
                      active[9]=1;
                      ends[9]=1;
                      break RUN;
                    }
                    else {
                      active[9]=1;
                      ends[9]=1;
                      break RUN;
                    }
                  }
                  else {
                    active[9]=1;
                    ends[9]=1;
                    break RUN;
                  }
                }
                else {
                  active[9]=1;
                  ends[9]=1;
                  break RUN;
                }
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
