import java.util.*;
import com.systemj.ClockDomain;
import com.systemj.Signal;
import com.systemj.input_Channel;
import com.systemj.output_Channel;

public class CD2 extends ClockDomain{
  public CD2(String name){super(name);}
  Vector currsigs = new Vector();
  private boolean df = false;
  private char [] active;
  private char [] paused;
  private char [] suspended;
  public input_Channel CH_in = new input_Channel();
  private int S47 = 1;
  private int S30 = 1;
  private int S25 = 1;
  
  private int[] ends = new int[3];
  private int[] tdone = new int[3];
  
  public void runClockDomain(){
    for(int i=0;i<ends.length;i++){
      ends[i] = 0;
      tdone[i] = 0;
    }
    
    RUN: while(true){
      switch(S47){
        case 0 : 
          S47=0;
          break RUN;
        
        case 1 : 
          S47=2;
          S47=2;
          S30=0;
          if(!CH_in.isPartnerPresent() || CH_in.isPartnerPreempted()){//sysj/Exercise5.sysj line: 7, column: 2
            CH_in.setACK(false);//sysj/Exercise5.sysj line: 7, column: 2
            S30=1;
            active[2]=1;
            ends[2]=1;
            break RUN;
          }
          else {
            S25=0;
            if(!CH_in.isREQ()){//sysj/Exercise5.sysj line: 7, column: 2
              CH_in.setACK(true);//sysj/Exercise5.sysj line: 7, column: 2
              S25=1;
              if(CH_in.isREQ()){//sysj/Exercise5.sysj line: 7, column: 2
                CH_in.setACK(false);//sysj/Exercise5.sysj line: 7, column: 2
                ends[2]=2;
                ;//sysj/Exercise5.sysj line: 7, column: 2
                System.out.println("Got a message " + (String)(CH_in.getVal() == null ? null : ((String)CH_in.getVal())));//sysj/Exercise5.sysj line: 8, column: 2
                S47=0;
                active[2]=0;
                ends[2]=0;
                S47=0;
                break RUN;
              }
              else {
                active[2]=1;
                ends[2]=1;
                break RUN;
              }
            }
            else {
              active[2]=1;
              ends[2]=1;
              break RUN;
            }
          }
        
        case 2 : 
          switch(S30){
            case 0 : 
              if(!CH_in.isPartnerPresent() || CH_in.isPartnerPreempted()){//sysj/Exercise5.sysj line: 7, column: 2
                CH_in.setACK(false);//sysj/Exercise5.sysj line: 7, column: 2
                S30=1;
                active[2]=1;
                ends[2]=1;
                break RUN;
              }
              else {
                switch(S25){
                  case 0 : 
                    if(!CH_in.isREQ()){//sysj/Exercise5.sysj line: 7, column: 2
                      CH_in.setACK(true);//sysj/Exercise5.sysj line: 7, column: 2
                      S25=1;
                      if(CH_in.isREQ()){//sysj/Exercise5.sysj line: 7, column: 2
                        CH_in.setACK(false);//sysj/Exercise5.sysj line: 7, column: 2
                        ends[2]=2;
                        ;//sysj/Exercise5.sysj line: 7, column: 2
                        System.out.println("Got a message " + (String)(CH_in.getVal() == null ? null : ((String)CH_in.getVal())));//sysj/Exercise5.sysj line: 8, column: 2
                        S47=0;
                        active[2]=0;
                        ends[2]=0;
                        S47=0;
                        break RUN;
                      }
                      else {
                        active[2]=1;
                        ends[2]=1;
                        break RUN;
                      }
                    }
                    else {
                      active[2]=1;
                      ends[2]=1;
                      break RUN;
                    }
                  
                  case 1 : 
                    if(CH_in.isREQ()){//sysj/Exercise5.sysj line: 7, column: 2
                      CH_in.setACK(false);//sysj/Exercise5.sysj line: 7, column: 2
                      ends[2]=2;
                      ;//sysj/Exercise5.sysj line: 7, column: 2
                      System.out.println("Got a message " + (String)(CH_in.getVal() == null ? null : ((String)CH_in.getVal())));//sysj/Exercise5.sysj line: 8, column: 2
                      S47=0;
                      active[2]=0;
                      ends[2]=0;
                      S47=0;
                      break RUN;
                    }
                    else {
                      active[2]=1;
                      ends[2]=1;
                      break RUN;
                    }
                  
                }
              }
              break;
            
            case 1 : 
              S30=1;
              S30=0;
              if(!CH_in.isPartnerPresent() || CH_in.isPartnerPreempted()){//sysj/Exercise5.sysj line: 7, column: 2
                CH_in.setACK(false);//sysj/Exercise5.sysj line: 7, column: 2
                S30=1;
                active[2]=1;
                ends[2]=1;
                break RUN;
              }
              else {
                S25=0;
                if(!CH_in.isREQ()){//sysj/Exercise5.sysj line: 7, column: 2
                  CH_in.setACK(true);//sysj/Exercise5.sysj line: 7, column: 2
                  S25=1;
                  if(CH_in.isREQ()){//sysj/Exercise5.sysj line: 7, column: 2
                    CH_in.setACK(false);//sysj/Exercise5.sysj line: 7, column: 2
                    ends[2]=2;
                    ;//sysj/Exercise5.sysj line: 7, column: 2
                    System.out.println("Got a message " + (String)(CH_in.getVal() == null ? null : ((String)CH_in.getVal())));//sysj/Exercise5.sysj line: 8, column: 2
                    S47=0;
                    active[2]=0;
                    ends[2]=0;
                    S47=0;
                    break RUN;
                  }
                  else {
                    active[2]=1;
                    ends[2]=1;
                    break RUN;
                  }
                }
                else {
                  active[2]=1;
                  ends[2]=1;
                  break RUN;
                }
              }
            
          }
        
      }
    }
  }

  public void init(){
    char [] active1 = {1, 1, 1};
    char [] paused1 = {0, 0, 0};
    char [] suspended1 = {0, 0, 0};
    paused = paused1;
    active = active1;
    suspended = suspended1;
    // Now instantiate all the local signals ONLY
    // --------------------------------------------------
  }
  
  public void run(){
    while(active[2] != 0){
      int index = 2;
      if(paused[index]==1 || suspended[index]==1 || active[index] == 0){
        for(int h=1;h<paused.length;++h){
          paused[h]=0;
        }
      }
      if(paused[2]!=0 || suspended[2]!=0 || active[2]!=1);
      else{
        if(!df){
          CH_in.gethook();
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
      CH_in.sethook();
      if(paused[2]!=0 || suspended[2]!=0 || active[2]!=1);
      else{
        CH_in.gethook();
      }
      runFinisher();
      if(active[2] == 0){
      	this.terminated = true;
      }
      if(!threaded) break;
    }
  }
}
