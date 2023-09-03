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
  public output_Channel humanPresence_o = new output_Channel();
  private long __start_thread_9;//sysj/Exercise6.sysj line: 98, column: 4
  private int S3097 = 1;
  private int S2889 = 1;
  private int S2807 = 1;
  private int S2802 = 1;
  
  private int[] ends = new int[14];
  private int[] tdone = new int[14];
  
  public void runClockDomain(){
    for(int i=0;i<ends.length;i++){
      ends[i] = 0;
      tdone[i] = 0;
    }
    
    RUN: while(true){
      switch(S3097){
        case 0 : 
          S3097=0;
          break RUN;
        
        case 1 : 
          S3097=2;
          S3097=2;
          S2889=0;
          __start_thread_9 = com.systemj.Timer.getMs();//sysj/Exercise6.sysj line: 98, column: 4
          if(com.systemj.Timer.getMs() - __start_thread_9 >= (120) * 1000){//sysj/Exercise6.sysj line: 98, column: 4
            ends[9]=2;
            ;//sysj/Exercise6.sysj line: 98, column: 4
            S2889=1;
            S2807=0;
            if(!humanPresence_o.isPartnerPresent() || humanPresence_o.isPartnerPreempted()){//sysj/Exercise6.sysj line: 100, column: 5
              humanPresence_o.setREQ(false);//sysj/Exercise6.sysj line: 100, column: 5
              S2807=1;
              active[9]=1;
              ends[9]=1;
              break RUN;
            }
            else {
              S2802=0;
              if(humanPresence_o.isACK()){//sysj/Exercise6.sysj line: 100, column: 5
                humanPresence_o.setVal(true);//sysj/Exercise6.sysj line: 100, column: 5
                S2802=1;
                if(!humanPresence_o.isACK()){//sysj/Exercise6.sysj line: 100, column: 5
                  humanPresence_o.setREQ(false);//sysj/Exercise6.sysj line: 100, column: 5
                  ends[9]=2;
                  ;//sysj/Exercise6.sysj line: 100, column: 5
                  S2889=2;
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
          else {
            active[9]=1;
            ends[9]=1;
            break RUN;
          }
        
        case 2 : 
          switch(S2889){
            case 0 : 
              if(com.systemj.Timer.getMs() - __start_thread_9 >= (120) * 1000){//sysj/Exercise6.sysj line: 98, column: 4
                ends[9]=2;
                ;//sysj/Exercise6.sysj line: 98, column: 4
                S2889=1;
                S2807=0;
                if(!humanPresence_o.isPartnerPresent() || humanPresence_o.isPartnerPreempted()){//sysj/Exercise6.sysj line: 100, column: 5
                  humanPresence_o.setREQ(false);//sysj/Exercise6.sysj line: 100, column: 5
                  S2807=1;
                  active[9]=1;
                  ends[9]=1;
                  break RUN;
                }
                else {
                  S2802=0;
                  if(humanPresence_o.isACK()){//sysj/Exercise6.sysj line: 100, column: 5
                    humanPresence_o.setVal(true);//sysj/Exercise6.sysj line: 100, column: 5
                    S2802=1;
                    if(!humanPresence_o.isACK()){//sysj/Exercise6.sysj line: 100, column: 5
                      humanPresence_o.setREQ(false);//sysj/Exercise6.sysj line: 100, column: 5
                      ends[9]=2;
                      ;//sysj/Exercise6.sysj line: 100, column: 5
                      S2889=2;
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
              else {
                active[9]=1;
                ends[9]=1;
                break RUN;
              }
            
            case 1 : 
              switch(S2807){
                case 0 : 
                  if(!humanPresence_o.isPartnerPresent() || humanPresence_o.isPartnerPreempted()){//sysj/Exercise6.sysj line: 100, column: 5
                    humanPresence_o.setREQ(false);//sysj/Exercise6.sysj line: 100, column: 5
                    S2807=1;
                    active[9]=1;
                    ends[9]=1;
                    break RUN;
                  }
                  else {
                    switch(S2802){
                      case 0 : 
                        if(humanPresence_o.isACK()){//sysj/Exercise6.sysj line: 100, column: 5
                          humanPresence_o.setVal(true);//sysj/Exercise6.sysj line: 100, column: 5
                          S2802=1;
                          if(!humanPresence_o.isACK()){//sysj/Exercise6.sysj line: 100, column: 5
                            humanPresence_o.setREQ(false);//sysj/Exercise6.sysj line: 100, column: 5
                            ends[9]=2;
                            ;//sysj/Exercise6.sysj line: 100, column: 5
                            S2889=2;
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
                      
                      case 1 : 
                        if(!humanPresence_o.isACK()){//sysj/Exercise6.sysj line: 100, column: 5
                          humanPresence_o.setREQ(false);//sysj/Exercise6.sysj line: 100, column: 5
                          ends[9]=2;
                          ;//sysj/Exercise6.sysj line: 100, column: 5
                          S2889=2;
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
                  }
                  break;
                
                case 1 : 
                  S2807=1;
                  S2807=0;
                  if(!humanPresence_o.isPartnerPresent() || humanPresence_o.isPartnerPreempted()){//sysj/Exercise6.sysj line: 100, column: 5
                    humanPresence_o.setREQ(false);//sysj/Exercise6.sysj line: 100, column: 5
                    S2807=1;
                    active[9]=1;
                    ends[9]=1;
                    break RUN;
                  }
                  else {
                    S2802=0;
                    if(humanPresence_o.isACK()){//sysj/Exercise6.sysj line: 100, column: 5
                      humanPresence_o.setVal(true);//sysj/Exercise6.sysj line: 100, column: 5
                      S2802=1;
                      if(!humanPresence_o.isACK()){//sysj/Exercise6.sysj line: 100, column: 5
                        humanPresence_o.setREQ(false);//sysj/Exercise6.sysj line: 100, column: 5
                        ends[9]=2;
                        ;//sysj/Exercise6.sysj line: 100, column: 5
                        S2889=2;
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
            
            case 2 : 
              S2889=2;
              S2889=0;
              __start_thread_9 = com.systemj.Timer.getMs();//sysj/Exercise6.sysj line: 98, column: 4
              if(com.systemj.Timer.getMs() - __start_thread_9 >= (120) * 1000){//sysj/Exercise6.sysj line: 98, column: 4
                ends[9]=2;
                ;//sysj/Exercise6.sysj line: 98, column: 4
                S2889=1;
                S2807=0;
                if(!humanPresence_o.isPartnerPresent() || humanPresence_o.isPartnerPreempted()){//sysj/Exercise6.sysj line: 100, column: 5
                  humanPresence_o.setREQ(false);//sysj/Exercise6.sysj line: 100, column: 5
                  S2807=1;
                  active[9]=1;
                  ends[9]=1;
                  break RUN;
                }
                else {
                  S2802=0;
                  if(humanPresence_o.isACK()){//sysj/Exercise6.sysj line: 100, column: 5
                    humanPresence_o.setVal(true);//sysj/Exercise6.sysj line: 100, column: 5
                    S2802=1;
                    if(!humanPresence_o.isACK()){//sysj/Exercise6.sysj line: 100, column: 5
                      humanPresence_o.setREQ(false);//sysj/Exercise6.sysj line: 100, column: 5
                      ends[9]=2;
                      ;//sysj/Exercise6.sysj line: 100, column: 5
                      S2889=2;
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
              else {
                active[9]=1;
                ends[9]=1;
                break RUN;
              }
            
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
          humanPresence_o.gethook();
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
      humanPresence_o.sethook();
      if(paused[9]!=0 || suspended[9]!=0 || active[9]!=1);
      else{
        humanPresence_o.gethook();
      }
      runFinisher();
      if(active[9] == 0){
      	this.terminated = true;
      }
      if(!threaded) break;
    }
  }
}
