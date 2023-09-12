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
  private long __start_thread_17;//sysj/Exercise6.sysj line: 180, column: 4
  private int S5677 = 1;
  private int S5469 = 1;
  private int S5387 = 1;
  private int S5382 = 1;
  
  private int[] ends = new int[24];
  private int[] tdone = new int[24];
  
  public void runClockDomain(){
    for(int i=0;i<ends.length;i++){
      ends[i] = 0;
      tdone[i] = 0;
    }
    
    RUN: while(true){
      switch(S5677){
        case 0 : 
          S5677=0;
          break RUN;
        
        case 1 : 
          S5677=2;
          S5677=2;
          S5469=0;
          __start_thread_17 = com.systemj.Timer.getMs();//sysj/Exercise6.sysj line: 180, column: 4
          if(com.systemj.Timer.getMs() - __start_thread_17 >= (30) * 1000){//sysj/Exercise6.sysj line: 180, column: 4
            ends[17]=2;
            ;//sysj/Exercise6.sysj line: 180, column: 4
            S5469=1;
            S5387=0;
            if(!humanPresence_o.isPartnerPresent() || humanPresence_o.isPartnerPreempted()){//sysj/Exercise6.sysj line: 182, column: 5
              humanPresence_o.setREQ(false);//sysj/Exercise6.sysj line: 182, column: 5
              S5387=1;
              active[17]=1;
              ends[17]=1;
              break RUN;
            }
            else {
              S5382=0;
              if(humanPresence_o.isACK()){//sysj/Exercise6.sysj line: 182, column: 5
                humanPresence_o.setVal(true);//sysj/Exercise6.sysj line: 182, column: 5
                S5382=1;
                if(!humanPresence_o.isACK()){//sysj/Exercise6.sysj line: 182, column: 5
                  humanPresence_o.setREQ(false);//sysj/Exercise6.sysj line: 182, column: 5
                  ends[17]=2;
                  ;//sysj/Exercise6.sysj line: 182, column: 5
                  S5469=2;
                  active[17]=1;
                  ends[17]=1;
                  break RUN;
                }
                else {
                  active[17]=1;
                  ends[17]=1;
                  break RUN;
                }
              }
              else {
                active[17]=1;
                ends[17]=1;
                break RUN;
              }
            }
          }
          else {
            active[17]=1;
            ends[17]=1;
            break RUN;
          }
        
        case 2 : 
          switch(S5469){
            case 0 : 
              if(com.systemj.Timer.getMs() - __start_thread_17 >= (30) * 1000){//sysj/Exercise6.sysj line: 180, column: 4
                ends[17]=2;
                ;//sysj/Exercise6.sysj line: 180, column: 4
                S5469=1;
                S5387=0;
                if(!humanPresence_o.isPartnerPresent() || humanPresence_o.isPartnerPreempted()){//sysj/Exercise6.sysj line: 182, column: 5
                  humanPresence_o.setREQ(false);//sysj/Exercise6.sysj line: 182, column: 5
                  S5387=1;
                  active[17]=1;
                  ends[17]=1;
                  break RUN;
                }
                else {
                  S5382=0;
                  if(humanPresence_o.isACK()){//sysj/Exercise6.sysj line: 182, column: 5
                    humanPresence_o.setVal(true);//sysj/Exercise6.sysj line: 182, column: 5
                    S5382=1;
                    if(!humanPresence_o.isACK()){//sysj/Exercise6.sysj line: 182, column: 5
                      humanPresence_o.setREQ(false);//sysj/Exercise6.sysj line: 182, column: 5
                      ends[17]=2;
                      ;//sysj/Exercise6.sysj line: 182, column: 5
                      S5469=2;
                      active[17]=1;
                      ends[17]=1;
                      break RUN;
                    }
                    else {
                      active[17]=1;
                      ends[17]=1;
                      break RUN;
                    }
                  }
                  else {
                    active[17]=1;
                    ends[17]=1;
                    break RUN;
                  }
                }
              }
              else {
                active[17]=1;
                ends[17]=1;
                break RUN;
              }
            
            case 1 : 
              switch(S5387){
                case 0 : 
                  if(!humanPresence_o.isPartnerPresent() || humanPresence_o.isPartnerPreempted()){//sysj/Exercise6.sysj line: 182, column: 5
                    humanPresence_o.setREQ(false);//sysj/Exercise6.sysj line: 182, column: 5
                    S5387=1;
                    active[17]=1;
                    ends[17]=1;
                    break RUN;
                  }
                  else {
                    switch(S5382){
                      case 0 : 
                        if(humanPresence_o.isACK()){//sysj/Exercise6.sysj line: 182, column: 5
                          humanPresence_o.setVal(true);//sysj/Exercise6.sysj line: 182, column: 5
                          S5382=1;
                          if(!humanPresence_o.isACK()){//sysj/Exercise6.sysj line: 182, column: 5
                            humanPresence_o.setREQ(false);//sysj/Exercise6.sysj line: 182, column: 5
                            ends[17]=2;
                            ;//sysj/Exercise6.sysj line: 182, column: 5
                            S5469=2;
                            active[17]=1;
                            ends[17]=1;
                            break RUN;
                          }
                          else {
                            active[17]=1;
                            ends[17]=1;
                            break RUN;
                          }
                        }
                        else {
                          active[17]=1;
                          ends[17]=1;
                          break RUN;
                        }
                      
                      case 1 : 
                        if(!humanPresence_o.isACK()){//sysj/Exercise6.sysj line: 182, column: 5
                          humanPresence_o.setREQ(false);//sysj/Exercise6.sysj line: 182, column: 5
                          ends[17]=2;
                          ;//sysj/Exercise6.sysj line: 182, column: 5
                          S5469=2;
                          active[17]=1;
                          ends[17]=1;
                          break RUN;
                        }
                        else {
                          active[17]=1;
                          ends[17]=1;
                          break RUN;
                        }
                      
                    }
                  }
                  break;
                
                case 1 : 
                  S5387=1;
                  S5387=0;
                  if(!humanPresence_o.isPartnerPresent() || humanPresence_o.isPartnerPreempted()){//sysj/Exercise6.sysj line: 182, column: 5
                    humanPresence_o.setREQ(false);//sysj/Exercise6.sysj line: 182, column: 5
                    S5387=1;
                    active[17]=1;
                    ends[17]=1;
                    break RUN;
                  }
                  else {
                    S5382=0;
                    if(humanPresence_o.isACK()){//sysj/Exercise6.sysj line: 182, column: 5
                      humanPresence_o.setVal(true);//sysj/Exercise6.sysj line: 182, column: 5
                      S5382=1;
                      if(!humanPresence_o.isACK()){//sysj/Exercise6.sysj line: 182, column: 5
                        humanPresence_o.setREQ(false);//sysj/Exercise6.sysj line: 182, column: 5
                        ends[17]=2;
                        ;//sysj/Exercise6.sysj line: 182, column: 5
                        S5469=2;
                        active[17]=1;
                        ends[17]=1;
                        break RUN;
                      }
                      else {
                        active[17]=1;
                        ends[17]=1;
                        break RUN;
                      }
                    }
                    else {
                      active[17]=1;
                      ends[17]=1;
                      break RUN;
                    }
                  }
                
              }
              break;
            
            case 2 : 
              S5469=2;
              S5469=0;
              __start_thread_17 = com.systemj.Timer.getMs();//sysj/Exercise6.sysj line: 180, column: 4
              if(com.systemj.Timer.getMs() - __start_thread_17 >= (30) * 1000){//sysj/Exercise6.sysj line: 180, column: 4
                ends[17]=2;
                ;//sysj/Exercise6.sysj line: 180, column: 4
                S5469=1;
                S5387=0;
                if(!humanPresence_o.isPartnerPresent() || humanPresence_o.isPartnerPreempted()){//sysj/Exercise6.sysj line: 182, column: 5
                  humanPresence_o.setREQ(false);//sysj/Exercise6.sysj line: 182, column: 5
                  S5387=1;
                  active[17]=1;
                  ends[17]=1;
                  break RUN;
                }
                else {
                  S5382=0;
                  if(humanPresence_o.isACK()){//sysj/Exercise6.sysj line: 182, column: 5
                    humanPresence_o.setVal(true);//sysj/Exercise6.sysj line: 182, column: 5
                    S5382=1;
                    if(!humanPresence_o.isACK()){//sysj/Exercise6.sysj line: 182, column: 5
                      humanPresence_o.setREQ(false);//sysj/Exercise6.sysj line: 182, column: 5
                      ends[17]=2;
                      ;//sysj/Exercise6.sysj line: 182, column: 5
                      S5469=2;
                      active[17]=1;
                      ends[17]=1;
                      break RUN;
                    }
                    else {
                      active[17]=1;
                      ends[17]=1;
                      break RUN;
                    }
                  }
                  else {
                    active[17]=1;
                    ends[17]=1;
                    break RUN;
                  }
                }
              }
              else {
                active[17]=1;
                ends[17]=1;
                break RUN;
              }
            
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
    while(active[17] != 0){
      int index = 17;
      if(paused[index]==1 || suspended[index]==1 || active[index] == 0){
        for(int h=1;h<paused.length;++h){
          paused[h]=0;
        }
      }
      if(paused[17]!=0 || suspended[17]!=0 || active[17]!=1);
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
      if(paused[17]!=0 || suspended[17]!=0 || active[17]!=1);
      else{
        humanPresence_o.gethook();
      }
      runFinisher();
      if(active[17] == 0){
      	this.terminated = true;
      }
      if(!threaded) break;
    }
  }
}
