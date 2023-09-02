import java.util.*;
import com.systemj.ClockDomain;
import com.systemj.Signal;
import com.systemj.input_Channel;
import com.systemj.output_Channel;
import buffer.*;//sysj/Exercise6.sysj line: 1, column: 1
import fibonacci.*;//sysj/Exercise6.sysj line: 2, column: 1

public class PabroCD extends ClockDomain{
  public PabroCD(String name){super(name);}
  Vector currsigs = new Vector();
  private boolean df = false;
  private char [] active;
  private char [] paused;
  private char [] suspended;
  public Signal A = new Signal("A", Signal.INPUT);
  public Signal B = new Signal("B", Signal.INPUT);
  public Signal R = new Signal("R", Signal.INPUT);
  public Signal O = new Signal("O", Signal.OUTPUT);
  public output_Channel producerChannel_o = new output_Channel();
  private Signal Obc_1;
  private FibonacciGenerator f_thread_5;//sysj/Exercise6.sysj line: 26, column: 3
  private int data_thread_5;//sysj/Exercise6.sysj line: 27, column: 3
  private int S439 = 1;
  private int S27 = 1;
  private int S26 = 1;
  private int S8 = 1;
  private int S4 = 1;
  private int S7 = 1;
  private int S437 = 1;
  private int S30 = 1;
  private int S37 = 1;
  private int S32 = 1;
  
  private int[] ends = new int[13];
  private int[] tdone = new int[13];
  
  public void thread879(int [] tdone, int [] ends){
        switch(S437){
      case 0 : 
        active[5]=0;
        ends[5]=0;
        tdone[5]=1;
        break;
      
      case 1 : 
        switch(S30){
          case 0 : 
            if(Obc_1.getprestatus()){//sysj/Exercise6.sysj line: 30, column: 21
              O.setPresent();//sysj/Exercise6.sysj line: 32, column: 4
              currsigs.addElement(O);
              System.out.println("Emitted O");
              data_thread_5 = f_thread_5.getNext();//sysj/Exercise6.sysj line: 34, column: 4
              S30=1;
              S37=0;
              if(!producerChannel_o.isPartnerPresent() || producerChannel_o.isPartnerPreempted()){//sysj/Exercise6.sysj line: 35, column: 4
                producerChannel_o.setREQ(false);//sysj/Exercise6.sysj line: 35, column: 4
                S37=1;
                active[5]=1;
                ends[5]=1;
                tdone[5]=1;
              }
              else {
                S32=0;
                if(producerChannel_o.isACK()){//sysj/Exercise6.sysj line: 35, column: 4
                  producerChannel_o.setVal(data_thread_5);//sysj/Exercise6.sysj line: 35, column: 4
                  S32=1;
                  if(!producerChannel_o.isACK()){//sysj/Exercise6.sysj line: 35, column: 4
                    producerChannel_o.setREQ(false);//sysj/Exercise6.sysj line: 35, column: 4
                    ends[5]=2;
                    ;//sysj/Exercise6.sysj line: 35, column: 4
                    S30=2;
                    active[5]=1;
                    ends[5]=1;
                    tdone[5]=1;
                  }
                  else {
                    active[5]=1;
                    ends[5]=1;
                    tdone[5]=1;
                  }
                }
                else {
                  active[5]=1;
                  ends[5]=1;
                  tdone[5]=1;
                }
              }
            }
            else {
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            break;
          
          case 1 : 
            switch(S37){
              case 0 : 
                if(!producerChannel_o.isPartnerPresent() || producerChannel_o.isPartnerPreempted()){//sysj/Exercise6.sysj line: 35, column: 4
                  producerChannel_o.setREQ(false);//sysj/Exercise6.sysj line: 35, column: 4
                  S37=1;
                  active[5]=1;
                  ends[5]=1;
                  tdone[5]=1;
                }
                else {
                  switch(S32){
                    case 0 : 
                      if(producerChannel_o.isACK()){//sysj/Exercise6.sysj line: 35, column: 4
                        producerChannel_o.setVal(data_thread_5);//sysj/Exercise6.sysj line: 35, column: 4
                        S32=1;
                        if(!producerChannel_o.isACK()){//sysj/Exercise6.sysj line: 35, column: 4
                          producerChannel_o.setREQ(false);//sysj/Exercise6.sysj line: 35, column: 4
                          ends[5]=2;
                          ;//sysj/Exercise6.sysj line: 35, column: 4
                          S30=2;
                          active[5]=1;
                          ends[5]=1;
                          tdone[5]=1;
                        }
                        else {
                          active[5]=1;
                          ends[5]=1;
                          tdone[5]=1;
                        }
                      }
                      else {
                        active[5]=1;
                        ends[5]=1;
                        tdone[5]=1;
                      }
                      break;
                    
                    case 1 : 
                      if(!producerChannel_o.isACK()){//sysj/Exercise6.sysj line: 35, column: 4
                        producerChannel_o.setREQ(false);//sysj/Exercise6.sysj line: 35, column: 4
                        ends[5]=2;
                        ;//sysj/Exercise6.sysj line: 35, column: 4
                        S30=2;
                        active[5]=1;
                        ends[5]=1;
                        tdone[5]=1;
                      }
                      else {
                        active[5]=1;
                        ends[5]=1;
                        tdone[5]=1;
                      }
                      break;
                    
                  }
                }
                break;
              
              case 1 : 
                S37=1;
                S37=0;
                if(!producerChannel_o.isPartnerPresent() || producerChannel_o.isPartnerPreempted()){//sysj/Exercise6.sysj line: 35, column: 4
                  producerChannel_o.setREQ(false);//sysj/Exercise6.sysj line: 35, column: 4
                  S37=1;
                  active[5]=1;
                  ends[5]=1;
                  tdone[5]=1;
                }
                else {
                  S32=0;
                  if(producerChannel_o.isACK()){//sysj/Exercise6.sysj line: 35, column: 4
                    producerChannel_o.setVal(data_thread_5);//sysj/Exercise6.sysj line: 35, column: 4
                    S32=1;
                    if(!producerChannel_o.isACK()){//sysj/Exercise6.sysj line: 35, column: 4
                      producerChannel_o.setREQ(false);//sysj/Exercise6.sysj line: 35, column: 4
                      ends[5]=2;
                      ;//sysj/Exercise6.sysj line: 35, column: 4
                      S30=2;
                      active[5]=1;
                      ends[5]=1;
                      tdone[5]=1;
                    }
                    else {
                      active[5]=1;
                      ends[5]=1;
                      tdone[5]=1;
                    }
                  }
                  else {
                    active[5]=1;
                    ends[5]=1;
                    tdone[5]=1;
                  }
                }
                break;
              
            }
            break;
          
          case 2 : 
            S30=2;
            S30=0;
            if(Obc_1.getprestatus()){//sysj/Exercise6.sysj line: 30, column: 21
              O.setPresent();//sysj/Exercise6.sysj line: 32, column: 4
              currsigs.addElement(O);
              System.out.println("Emitted O");
              data_thread_5 = f_thread_5.getNext();//sysj/Exercise6.sysj line: 34, column: 4
              S30=1;
              S37=0;
              if(!producerChannel_o.isPartnerPresent() || producerChannel_o.isPartnerPreempted()){//sysj/Exercise6.sysj line: 35, column: 4
                producerChannel_o.setREQ(false);//sysj/Exercise6.sysj line: 35, column: 4
                S37=1;
                active[5]=1;
                ends[5]=1;
                tdone[5]=1;
              }
              else {
                S32=0;
                if(producerChannel_o.isACK()){//sysj/Exercise6.sysj line: 35, column: 4
                  producerChannel_o.setVal(data_thread_5);//sysj/Exercise6.sysj line: 35, column: 4
                  S32=1;
                  if(!producerChannel_o.isACK()){//sysj/Exercise6.sysj line: 35, column: 4
                    producerChannel_o.setREQ(false);//sysj/Exercise6.sysj line: 35, column: 4
                    ends[5]=2;
                    ;//sysj/Exercise6.sysj line: 35, column: 4
                    S30=2;
                    active[5]=1;
                    ends[5]=1;
                    tdone[5]=1;
                  }
                  else {
                    active[5]=1;
                    ends[5]=1;
                    tdone[5]=1;
                  }
                }
                else {
                  active[5]=1;
                  ends[5]=1;
                  tdone[5]=1;
                }
              }
            }
            else {
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread877(int [] tdone, int [] ends){
        switch(S7){
      case 0 : 
        active[4]=0;
        ends[4]=0;
        tdone[4]=1;
        break;
      
      case 1 : 
        if(B.getprestatus()){//sysj/Exercise6.sysj line: 12, column: 29
          S7=0;
          active[4]=0;
          ends[4]=0;
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

  public void thread876(int [] tdone, int [] ends){
        switch(S4){
      case 0 : 
        active[3]=0;
        ends[3]=0;
        tdone[3]=1;
        break;
      
      case 1 : 
        if(A.getprestatus()){//sysj/Exercise6.sysj line: 12, column: 13
          S4=0;
          active[3]=0;
          ends[3]=0;
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

  public void thread874(int [] tdone, int [] ends){
        S7=1;
    active[4]=1;
    ends[4]=1;
    tdone[4]=1;
  }

  public void thread873(int [] tdone, int [] ends){
        S4=1;
    active[3]=1;
    ends[3]=1;
    tdone[3]=1;
  }

  public void thread872(int [] tdone, int [] ends){
        switch(S27){
      case 0 : 
        active[2]=0;
        ends[2]=0;
        tdone[2]=1;
        break;
      
      case 1 : 
        switch(S26){
          case 0 : 
            if(R.getprestatus()){//sysj/Exercise6.sysj line: 10, column: 10
              S8=0;
              thread873(tdone,ends);
              thread874(tdone,ends);
              int biggest875 = 0;
              if(ends[3]>=biggest875){
                biggest875=ends[3];
              }
              if(ends[4]>=biggest875){
                biggest875=ends[4];
              }
              if(biggest875 == 1){
                active[2]=1;
                ends[2]=1;
                tdone[2]=1;
              }
            }
            else {
              switch(S8){
                case 0 : 
                  thread876(tdone,ends);
                  thread877(tdone,ends);
                  int biggest878 = 0;
                  if(ends[3]>=biggest878){
                    biggest878=ends[3];
                  }
                  if(ends[4]>=biggest878){
                    biggest878=ends[4];
                  }
                  if(biggest878 == 1){
                    active[2]=1;
                    ends[2]=1;
                    tdone[2]=1;
                  }
                  //FINXME code
                  if(biggest878 == 0){
                    Obc_1.setPresent();//sysj/Exercise6.sysj line: 14, column: 5
                    currsigs.addElement(Obc_1);
                    System.out.println("Emitted Obc_1");
                    S8=1;
                    active[2]=1;
                    ends[2]=1;
                    tdone[2]=1;
                  }
                  break;
                
                case 1 : 
                  active[2]=1;
                  ends[2]=1;
                  tdone[2]=1;
                  break;
                
              }
            }
            break;
          
          case 1 : 
            S26=1;
            S27=0;
            active[2]=0;
            ends[2]=0;
            tdone[2]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread870(int [] tdone, int [] ends){
        S437=1;
    f_thread_5 = new FibonacciGenerator();//sysj/Exercise6.sysj line: 26, column: 3
    data_thread_5 = 0;//sysj/Exercise6.sysj line: 27, column: 3
    S30=0;
    if(Obc_1.getprestatus()){//sysj/Exercise6.sysj line: 30, column: 21
      O.setPresent();//sysj/Exercise6.sysj line: 32, column: 4
      currsigs.addElement(O);
      System.out.println("Emitted O");
      data_thread_5 = f_thread_5.getNext();//sysj/Exercise6.sysj line: 34, column: 4
      S30=1;
      S37=0;
      if(!producerChannel_o.isPartnerPresent() || producerChannel_o.isPartnerPreempted()){//sysj/Exercise6.sysj line: 35, column: 4
        producerChannel_o.setREQ(false);//sysj/Exercise6.sysj line: 35, column: 4
        S37=1;
        active[5]=1;
        ends[5]=1;
        tdone[5]=1;
      }
      else {
        S32=0;
        if(producerChannel_o.isACK()){//sysj/Exercise6.sysj line: 35, column: 4
          producerChannel_o.setVal(data_thread_5);//sysj/Exercise6.sysj line: 35, column: 4
          S32=1;
          if(!producerChannel_o.isACK()){//sysj/Exercise6.sysj line: 35, column: 4
            producerChannel_o.setREQ(false);//sysj/Exercise6.sysj line: 35, column: 4
            ends[5]=2;
            ;//sysj/Exercise6.sysj line: 35, column: 4
            S30=2;
            active[5]=1;
            ends[5]=1;
            tdone[5]=1;
          }
          else {
            active[5]=1;
            ends[5]=1;
            tdone[5]=1;
          }
        }
        else {
          active[5]=1;
          ends[5]=1;
          tdone[5]=1;
        }
      }
    }
    else {
      active[5]=1;
      ends[5]=1;
      tdone[5]=1;
    }
  }

  public void thread868(int [] tdone, int [] ends){
        S7=1;
    active[4]=1;
    ends[4]=1;
    tdone[4]=1;
  }

  public void thread867(int [] tdone, int [] ends){
        S4=1;
    active[3]=1;
    ends[3]=1;
    tdone[3]=1;
  }

  public void thread866(int [] tdone, int [] ends){
        S27=1;
    S26=0;
    S8=0;
    thread867(tdone,ends);
    thread868(tdone,ends);
    int biggest869 = 0;
    if(ends[3]>=biggest869){
      biggest869=ends[3];
    }
    if(ends[4]>=biggest869){
      biggest869=ends[4];
    }
    if(biggest869 == 1){
      active[2]=1;
      ends[2]=1;
      tdone[2]=1;
    }
  }

  public void runClockDomain(){
    for(int i=0;i<ends.length;i++){
      ends[i] = 0;
      tdone[i] = 0;
    }
    
    RUN: while(true){
      switch(S439){
        case 0 : 
          S439=0;
          break RUN;
        
        case 1 : 
          S439=2;
          S439=2;
          Obc_1.setClear();//sysj/Exercise6.sysj line: 6, column: 2
          thread866(tdone,ends);
          thread870(tdone,ends);
          int biggest871 = 0;
          if(ends[2]>=biggest871){
            biggest871=ends[2];
          }
          if(ends[5]>=biggest871){
            biggest871=ends[5];
          }
          if(biggest871 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
        
        case 2 : 
          Obc_1.setClear();//sysj/Exercise6.sysj line: 6, column: 2
          thread872(tdone,ends);
          thread879(tdone,ends);
          int biggest880 = 0;
          if(ends[2]>=biggest880){
            biggest880=ends[2];
          }
          if(ends[5]>=biggest880){
            biggest880=ends[5];
          }
          if(biggest880 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
          //FINXME code
          if(biggest880 == 0){
            S439=0;
            active[1]=0;
            ends[1]=0;
            S439=0;
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
    Obc_1 = new Signal();
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
          producerChannel_o.gethook();
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
      Obc_1.setpreclear();
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
      Obc_1.setClear();
      producerChannel_o.sethook();
      if(paused[1]!=0 || suspended[1]!=0 || active[1]!=1);
      else{
        producerChannel_o.gethook();
        A.gethook();
        B.gethook();
        R.gethook();
      }
      runFinisher();
      if(active[1] == 0){
      	this.terminated = true;
      }
      if(!threaded) break;
    }
  }
}
