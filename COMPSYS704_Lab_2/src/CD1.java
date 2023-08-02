import java.util.*;
import com.systemj.ClockDomain;
import com.systemj.Signal;
import com.systemj.input_Channel;
import com.systemj.output_Channel;

public class CD1 extends ClockDomain{
  public CD1(String name){super(name);}
  Vector currsigs = new Vector();
  private boolean df = false;
  private char [] active;
  private char [] paused;
  private char [] suspended;
  public output_Channel CH_o = new output_Channel();
  private int S23 = 1;
  private int S6 = 1;
  private int S1 = 1;
  
  private int[] ends = new int[3];
  private int[] tdone = new int[3];
  
  public void runClockDomain(){
    for(int i=0;i<ends.length;i++){
      ends[i] = 0;
      tdone[i] = 0;
    }
    
    RUN: while(true){
      switch(S23){
        case 0 : 
          S23=0;
          break RUN;
        
        case 1 : 
          S23=2;
          S23=2;
          S6=0;
          if(!CH_o.isPartnerPresent() || CH_o.isPartnerPreempted()){//sysj/Exercise5.sysj line: 2, column: 2
            CH_o.setREQ(false);//sysj/Exercise5.sysj line: 2, column: 2
            S6=1;
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
          else {
            S1=0;
            if(CH_o.isACK()){//sysj/Exercise5.sysj line: 2, column: 2
              CH_o.setVal("From CD1");//sysj/Exercise5.sysj line: 2, column: 2
              S1=1;
              if(!CH_o.isACK()){//sysj/Exercise5.sysj line: 2, column: 2
                CH_o.setREQ(false);//sysj/Exercise5.sysj line: 2, column: 2
                ends[1]=2;
                ;//sysj/Exercise5.sysj line: 2, column: 2
                System.out.println("Sent a message");//sysj/Exercise5.sysj line: 3, column: 2
                S23=0;
                active[1]=0;
                ends[1]=0;
                S23=0;
                break RUN;
              }
              else {
                active[1]=1;
                ends[1]=1;
                break RUN;
              }
            }
            else {
              active[1]=1;
              ends[1]=1;
              break RUN;
            }
          }
        
        case 2 : 
          switch(S6){
            case 0 : 
              if(!CH_o.isPartnerPresent() || CH_o.isPartnerPreempted()){//sysj/Exercise5.sysj line: 2, column: 2
                CH_o.setREQ(false);//sysj/Exercise5.sysj line: 2, column: 2
                S6=1;
                active[1]=1;
                ends[1]=1;
                break RUN;
              }
              else {
                switch(S1){
                  case 0 : 
                    if(CH_o.isACK()){//sysj/Exercise5.sysj line: 2, column: 2
                      CH_o.setVal("From CD1");//sysj/Exercise5.sysj line: 2, column: 2
                      S1=1;
                      if(!CH_o.isACK()){//sysj/Exercise5.sysj line: 2, column: 2
                        CH_o.setREQ(false);//sysj/Exercise5.sysj line: 2, column: 2
                        ends[1]=2;
                        ;//sysj/Exercise5.sysj line: 2, column: 2
                        System.out.println("Sent a message");//sysj/Exercise5.sysj line: 3, column: 2
                        S23=0;
                        active[1]=0;
                        ends[1]=0;
                        S23=0;
                        break RUN;
                      }
                      else {
                        active[1]=1;
                        ends[1]=1;
                        break RUN;
                      }
                    }
                    else {
                      active[1]=1;
                      ends[1]=1;
                      break RUN;
                    }
                  
                  case 1 : 
                    if(!CH_o.isACK()){//sysj/Exercise5.sysj line: 2, column: 2
                      CH_o.setREQ(false);//sysj/Exercise5.sysj line: 2, column: 2
                      ends[1]=2;
                      ;//sysj/Exercise5.sysj line: 2, column: 2
                      System.out.println("Sent a message");//sysj/Exercise5.sysj line: 3, column: 2
                      S23=0;
                      active[1]=0;
                      ends[1]=0;
                      S23=0;
                      break RUN;
                    }
                    else {
                      active[1]=1;
                      ends[1]=1;
                      break RUN;
                    }
                  
                }
              }
              break;
            
            case 1 : 
              S6=1;
              S6=0;
              if(!CH_o.isPartnerPresent() || CH_o.isPartnerPreempted()){//sysj/Exercise5.sysj line: 2, column: 2
                CH_o.setREQ(false);//sysj/Exercise5.sysj line: 2, column: 2
                S6=1;
                active[1]=1;
                ends[1]=1;
                break RUN;
              }
              else {
                S1=0;
                if(CH_o.isACK()){//sysj/Exercise5.sysj line: 2, column: 2
                  CH_o.setVal("From CD1");//sysj/Exercise5.sysj line: 2, column: 2
                  S1=1;
                  if(!CH_o.isACK()){//sysj/Exercise5.sysj line: 2, column: 2
                    CH_o.setREQ(false);//sysj/Exercise5.sysj line: 2, column: 2
                    ends[1]=2;
                    ;//sysj/Exercise5.sysj line: 2, column: 2
                    System.out.println("Sent a message");//sysj/Exercise5.sysj line: 3, column: 2
                    S23=0;
                    active[1]=0;
                    ends[1]=0;
                    S23=0;
                    break RUN;
                  }
                  else {
                    active[1]=1;
                    ends[1]=1;
                    break RUN;
                  }
                }
                else {
                  active[1]=1;
                  ends[1]=1;
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
          CH_o.gethook();
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
      CH_o.sethook();
      if(paused[1]!=0 || suspended[1]!=0 || active[1]!=1);
      else{
        CH_o.gethook();
      }
      runFinisher();
      if(active[1] == 0){
      	this.terminated = true;
      }
      if(!threaded) break;
    }
  }
}
