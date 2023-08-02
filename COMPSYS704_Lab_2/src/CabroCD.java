import java.util.*;
import com.systemj.ClockDomain;
import com.systemj.Signal;
import com.systemj.input_Channel;
import com.systemj.output_Channel;
import buffer.*;//sysj/Exercise6.sysj line: 1, column: 1
import fibonacci.*;//sysj/Exercise6.sysj line: 2, column: 1

public class CabroCD extends ClockDomain{
  public CabroCD(String name){super(name);}
  Vector currsigs = new Vector();
  private boolean df = false;
  private char [] active;
  private char [] paused;
  private char [] suspended;
  public Signal A = new Signal("A", Signal.INPUT);
  public Signal B = new Signal("B", Signal.INPUT);
  public Signal R = new Signal("R", Signal.INPUT);
  public Signal O = new Signal("O", Signal.OUTPUT);
  public input_Channel consumerChannel_in = new input_Channel();
  private int data_thread_6;//sysj/Exercise6.sysj line: 51, column: 4
  private int S616 = 1;
  private int S615 = 1;
  private int S453 = 1;
  private int S443 = 1;
  private int S446 = 1;
  private int S460 = 1;
  private int S455 = 1;
  
  private int[] ends = new int[13];
  private int[] tdone = new int[13];
  
  public void thread888(int [] tdone, int [] ends){
        switch(S446){
      case 0 : 
        active[8]=0;
        ends[8]=0;
        tdone[8]=1;
        break;
      
      case 1 : 
        if(B.getprestatus()){//sysj/Exercise6.sysj line: 53, column: 28
          S446=0;
          active[8]=0;
          ends[8]=0;
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

  public void thread887(int [] tdone, int [] ends){
        switch(S443){
      case 0 : 
        active[7]=0;
        ends[7]=0;
        tdone[7]=1;
        break;
      
      case 1 : 
        if(A.getprestatus()){//sysj/Exercise6.sysj line: 53, column: 12
          S443=0;
          active[7]=0;
          ends[7]=0;
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

  public void thread885(int [] tdone, int [] ends){
        S446=1;
    active[8]=1;
    ends[8]=1;
    tdone[8]=1;
  }

  public void thread884(int [] tdone, int [] ends){
        S443=1;
    active[7]=1;
    ends[7]=1;
    tdone[7]=1;
  }

  public void thread882(int [] tdone, int [] ends){
        S446=1;
    active[8]=1;
    ends[8]=1;
    tdone[8]=1;
  }

  public void thread881(int [] tdone, int [] ends){
        S443=1;
    active[7]=1;
    ends[7]=1;
    tdone[7]=1;
  }

  public void runClockDomain(){
    for(int i=0;i<ends.length;i++){
      ends[i] = 0;
      tdone[i] = 0;
    }
    
    RUN: while(true){
      switch(S616){
        case 0 : 
          S616=0;
          break RUN;
        
        case 1 : 
          S616=2;
          S616=2;
          S615=0;
          data_thread_6 = 0;//sysj/Exercise6.sysj line: 51, column: 4
          S453=0;
          thread881(tdone,ends);
          thread882(tdone,ends);
          int biggest883 = 0;
          if(ends[7]>=biggest883){
            biggest883=ends[7];
          }
          if(ends[8]>=biggest883){
            biggest883=ends[8];
          }
          if(biggest883 == 1){
            active[6]=1;
            ends[6]=1;
            break RUN;
          }
        
        case 2 : 
          switch(S615){
            case 0 : 
              if(R.getprestatus()){//sysj/Exercise6.sysj line: 50, column: 9
                consumerChannel_in.setPreempted();
                data_thread_6 = 0;//sysj/Exercise6.sysj line: 51, column: 4
                S453=0;
                thread884(tdone,ends);
                thread885(tdone,ends);
                int biggest886 = 0;
                if(ends[7]>=biggest886){
                  biggest886=ends[7];
                }
                if(ends[8]>=biggest886){
                  biggest886=ends[8];
                }
                if(biggest886 == 1){
                  active[6]=1;
                  ends[6]=1;
                  break RUN;
                }
              }
              else {
                switch(S453){
                  case 0 : 
                    thread887(tdone,ends);
                    thread888(tdone,ends);
                    int biggest889 = 0;
                    if(ends[7]>=biggest889){
                      biggest889=ends[7];
                    }
                    if(ends[8]>=biggest889){
                      biggest889=ends[8];
                    }
                    if(biggest889 == 1){
                      active[6]=1;
                      ends[6]=1;
                      break RUN;
                    }
                    //FINXME code
                    if(biggest889 == 0){
                      O.setPresent();//sysj/Exercise6.sysj line: 55, column: 4
                      currsigs.addElement(O);
                      System.out.println("Emitted O");
                      S453=1;
                      S460=0;
                      if(!consumerChannel_in.isPartnerPresent() || consumerChannel_in.isPartnerPreempted()){//sysj/Exercise6.sysj line: 57, column: 4
                        consumerChannel_in.setACK(false);//sysj/Exercise6.sysj line: 57, column: 4
                        S460=1;
                        active[6]=1;
                        ends[6]=1;
                        break RUN;
                      }
                      else {
                        S455=0;
                        if(!consumerChannel_in.isREQ()){//sysj/Exercise6.sysj line: 57, column: 4
                          consumerChannel_in.setACK(true);//sysj/Exercise6.sysj line: 57, column: 4
                          S455=1;
                          if(consumerChannel_in.isREQ()){//sysj/Exercise6.sysj line: 57, column: 4
                            consumerChannel_in.setACK(false);//sysj/Exercise6.sysj line: 57, column: 4
                            ends[6]=2;
                            ;//sysj/Exercise6.sysj line: 57, column: 4
                            data_thread_6 = (Integer)(consumerChannel_in.getVal() == null ? 0 : ((Integer)consumerChannel_in.getVal()).intValue());//sysj/Exercise6.sysj line: 59, column: 4
                            System.out.println("received " + data_thread_6);//sysj/Exercise6.sysj line: 61, column: 4
                            System.out.println("PC-ABRO Received next fibonacci number: " + data_thread_6);//sysj/Exercise6.sysj line: 62, column: 4
                            S453=2;
                            active[6]=1;
                            ends[6]=1;
                            break RUN;
                          }
                          else {
                            active[6]=1;
                            ends[6]=1;
                            break RUN;
                          }
                        }
                        else {
                          active[6]=1;
                          ends[6]=1;
                          break RUN;
                        }
                      }
                    }
                  
                  case 1 : 
                    switch(S460){
                      case 0 : 
                        if(!consumerChannel_in.isPartnerPresent() || consumerChannel_in.isPartnerPreempted()){//sysj/Exercise6.sysj line: 57, column: 4
                          consumerChannel_in.setACK(false);//sysj/Exercise6.sysj line: 57, column: 4
                          S460=1;
                          active[6]=1;
                          ends[6]=1;
                          break RUN;
                        }
                        else {
                          switch(S455){
                            case 0 : 
                              if(!consumerChannel_in.isREQ()){//sysj/Exercise6.sysj line: 57, column: 4
                                consumerChannel_in.setACK(true);//sysj/Exercise6.sysj line: 57, column: 4
                                S455=1;
                                if(consumerChannel_in.isREQ()){//sysj/Exercise6.sysj line: 57, column: 4
                                  consumerChannel_in.setACK(false);//sysj/Exercise6.sysj line: 57, column: 4
                                  ends[6]=2;
                                  ;//sysj/Exercise6.sysj line: 57, column: 4
                                  data_thread_6 = (Integer)(consumerChannel_in.getVal() == null ? 0 : ((Integer)consumerChannel_in.getVal()).intValue());//sysj/Exercise6.sysj line: 59, column: 4
                                  System.out.println("received " + data_thread_6);//sysj/Exercise6.sysj line: 61, column: 4
                                  System.out.println("PC-ABRO Received next fibonacci number: " + data_thread_6);//sysj/Exercise6.sysj line: 62, column: 4
                                  S453=2;
                                  active[6]=1;
                                  ends[6]=1;
                                  break RUN;
                                }
                                else {
                                  active[6]=1;
                                  ends[6]=1;
                                  break RUN;
                                }
                              }
                              else {
                                active[6]=1;
                                ends[6]=1;
                                break RUN;
                              }
                            
                            case 1 : 
                              if(consumerChannel_in.isREQ()){//sysj/Exercise6.sysj line: 57, column: 4
                                consumerChannel_in.setACK(false);//sysj/Exercise6.sysj line: 57, column: 4
                                ends[6]=2;
                                ;//sysj/Exercise6.sysj line: 57, column: 4
                                data_thread_6 = (Integer)(consumerChannel_in.getVal() == null ? 0 : ((Integer)consumerChannel_in.getVal()).intValue());//sysj/Exercise6.sysj line: 59, column: 4
                                System.out.println("received " + data_thread_6);//sysj/Exercise6.sysj line: 61, column: 4
                                System.out.println("PC-ABRO Received next fibonacci number: " + data_thread_6);//sysj/Exercise6.sysj line: 62, column: 4
                                S453=2;
                                active[6]=1;
                                ends[6]=1;
                                break RUN;
                              }
                              else {
                                active[6]=1;
                                ends[6]=1;
                                break RUN;
                              }
                            
                          }
                        }
                        break;
                      
                      case 1 : 
                        S460=1;
                        S460=0;
                        if(!consumerChannel_in.isPartnerPresent() || consumerChannel_in.isPartnerPreempted()){//sysj/Exercise6.sysj line: 57, column: 4
                          consumerChannel_in.setACK(false);//sysj/Exercise6.sysj line: 57, column: 4
                          S460=1;
                          active[6]=1;
                          ends[6]=1;
                          break RUN;
                        }
                        else {
                          S455=0;
                          if(!consumerChannel_in.isREQ()){//sysj/Exercise6.sysj line: 57, column: 4
                            consumerChannel_in.setACK(true);//sysj/Exercise6.sysj line: 57, column: 4
                            S455=1;
                            if(consumerChannel_in.isREQ()){//sysj/Exercise6.sysj line: 57, column: 4
                              consumerChannel_in.setACK(false);//sysj/Exercise6.sysj line: 57, column: 4
                              ends[6]=2;
                              ;//sysj/Exercise6.sysj line: 57, column: 4
                              data_thread_6 = (Integer)(consumerChannel_in.getVal() == null ? 0 : ((Integer)consumerChannel_in.getVal()).intValue());//sysj/Exercise6.sysj line: 59, column: 4
                              System.out.println("received " + data_thread_6);//sysj/Exercise6.sysj line: 61, column: 4
                              System.out.println("PC-ABRO Received next fibonacci number: " + data_thread_6);//sysj/Exercise6.sysj line: 62, column: 4
                              S453=2;
                              active[6]=1;
                              ends[6]=1;
                              break RUN;
                            }
                            else {
                              active[6]=1;
                              ends[6]=1;
                              break RUN;
                            }
                          }
                          else {
                            active[6]=1;
                            ends[6]=1;
                            break RUN;
                          }
                        }
                      
                    }
                    break;
                  
                  case 2 : 
                    active[6]=1;
                    ends[6]=1;
                    break RUN;
                  
                }
              }
              break;
            
            case 1 : 
              S615=1;
              S616=0;
              active[6]=0;
              ends[6]=0;
              S616=0;
              break RUN;
            
          }
        
      }
    }
  }

  public void init(){
    char [] active1 = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
    char [] paused1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    char [] suspended1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    paused = paused1;
    active = active1;
    suspended = suspended1;
    // Now instantiate all the local signals ONLY
    // --------------------------------------------------
  }
  
  public void run(){
    while(active[6] != 0){
      int index = 6;
      if(paused[index]==1 || suspended[index]==1 || active[index] == 0){
        for(int h=1;h<paused.length;++h){
          paused[h]=0;
        }
      }
      if(paused[6]!=0 || suspended[6]!=0 || active[6]!=1);
      else{
        if(!df){
          consumerChannel_in.gethook();
          A.gethook();
          B.gethook();
          R.gethook();
          df = true;
        }
        runClockDomain();
      }
      A.setpreclear();
      B.setpreclear();
      R.setpreclear();
      O.setpreclear();
      int dummyint = 0;
      for(int qw=0;qw<currsigs.size();++qw){
        dummyint = ((Signal)currsigs.elementAt(qw)).getStatus() ? ((Signal)currsigs.elementAt(qw)).setprepresent() : ((Signal)currsigs.elementAt(qw)).setpreclear();
        ((Signal)currsigs.elementAt(qw)).setpreval(((Signal)currsigs.elementAt(qw)).getValue());
      }
      currsigs.removeAllElements();
      dummyint = A.getStatus() ? A.setprepresent() : A.setpreclear();
      A.setpreval(A.getValue());
      A.setClear();
      dummyint = B.getStatus() ? B.setprepresent() : B.setpreclear();
      B.setpreval(B.getValue());
      B.setClear();
      dummyint = R.getStatus() ? R.setprepresent() : R.setpreclear();
      R.setpreval(R.getValue());
      R.setClear();
      O.sethook();
      O.setClear();
      consumerChannel_in.sethook();
      if(paused[6]!=0 || suspended[6]!=0 || active[6]!=1);
      else{
        consumerChannel_in.gethook();
        A.gethook();
        B.gethook();
        R.gethook();
      }
      runFinisher();
      if(active[6] == 0){
      	this.terminated = true;
      }
      if(!threaded) break;
    }
  }
}
