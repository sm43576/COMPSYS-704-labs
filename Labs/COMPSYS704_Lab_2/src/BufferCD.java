import java.util.*;
import com.systemj.ClockDomain;
import com.systemj.Signal;
import com.systemj.input_Channel;
import com.systemj.output_Channel;
import buffer.*;//sysj/Exercise6.sysj line: 1, column: 1
import fibonacci.*;//sysj/Exercise6.sysj line: 2, column: 1

public class BufferCD extends ClockDomain{
  public BufferCD(String name){super(name);}
  Vector currsigs = new Vector();
  private boolean df = false;
  private char [] active;
  private char [] paused;
  private char [] suspended;
  public input_Channel producerChannel_in = new input_Channel();
  public output_Channel consumerChannel_o = new output_Channel();
  private Signal bufferNotFull_9;
  private Signal bufferNotEmpty_9;
  private Signal requestData_9;
  private Signal toBuffer_9;
  private Signal fromBuffer_9;
  private int data_thread_10;//sysj/Exercise6.sysj line: 81, column: 3
  private int data_thread_11;//sysj/Exercise6.sysj line: 101, column: 3
  private Buffer myBuffer_thread_12;//sysj/Exercise6.sysj line: 126, column: 3
  private int data_thread_12;//sysj/Exercise6.sysj line: 127, column: 3
  private int S864 = 1;
  private int S774 = 1;
  private int S773 = 1;
  private int S647 = 1;
  private int S645 = 1;
  private int S629 = 1;
  private int S624 = 1;
  private int S794 = 1;
  private int S793 = 1;
  private int S777 = 1;
  private int S775 = 1;
  private int S862 = 1;
  
  private int[] ends = new int[13];
  private int[] tdone = new int[13];
  
  public void thread896(int [] tdone, int [] ends){
        switch(S862){
      case 0 : 
        active[12]=0;
        ends[12]=0;
        tdone[12]=1;
        break;
      
      case 1 : 
        if(requestData_9.getprestatus()){//sysj/Exercise6.sysj line: 132, column: 12
          data_thread_12 = ((Integer)myBuffer_thread_12.pop()).intValue();//sysj/Exercise6.sysj line: 133, column: 5
          fromBuffer_9.setPresent();//sysj/Exercise6.sysj line: 134, column: 5
          currsigs.addElement(fromBuffer_9);
          fromBuffer_9.setValue(data_thread_12);//sysj/Exercise6.sysj line: 134, column: 5
          System.out.println("Emitted fromBuffer_9");
          if(!myBuffer_thread_12.isFull()){//sysj/Exercise6.sysj line: 136, column: 7
            bufferNotFull_9.setPresent();//sysj/Exercise6.sysj line: 137, column: 5
            currsigs.addElement(bufferNotFull_9);
            System.out.println("Emitted bufferNotFull_9");
            if(!myBuffer_thread_12.isEmpty()){//sysj/Exercise6.sysj line: 139, column: 7
              bufferNotEmpty_9.setPresent();//sysj/Exercise6.sysj line: 140, column: 5
              currsigs.addElement(bufferNotEmpty_9);
              System.out.println("Emitted bufferNotEmpty_9");
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
            if(!myBuffer_thread_12.isEmpty()){//sysj/Exercise6.sysj line: 139, column: 7
              bufferNotEmpty_9.setPresent();//sysj/Exercise6.sysj line: 140, column: 5
              currsigs.addElement(bufferNotEmpty_9);
              System.out.println("Emitted bufferNotEmpty_9");
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
        }
        else {
          if(!myBuffer_thread_12.isFull()){//sysj/Exercise6.sysj line: 136, column: 7
            bufferNotFull_9.setPresent();//sysj/Exercise6.sysj line: 137, column: 5
            currsigs.addElement(bufferNotFull_9);
            System.out.println("Emitted bufferNotFull_9");
            if(!myBuffer_thread_12.isEmpty()){//sysj/Exercise6.sysj line: 139, column: 7
              bufferNotEmpty_9.setPresent();//sysj/Exercise6.sysj line: 140, column: 5
              currsigs.addElement(bufferNotEmpty_9);
              System.out.println("Emitted bufferNotEmpty_9");
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
            if(!myBuffer_thread_12.isEmpty()){//sysj/Exercise6.sysj line: 139, column: 7
              bufferNotEmpty_9.setPresent();//sysj/Exercise6.sysj line: 140, column: 5
              currsigs.addElement(bufferNotEmpty_9);
              System.out.println("Emitted bufferNotEmpty_9");
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
        }
        break;
      
    }
  }

  public void thread895(int [] tdone, int [] ends){
        switch(S794){
      case 0 : 
        active[11]=0;
        ends[11]=0;
        tdone[11]=1;
        break;
      
      case 1 : 
        switch(S793){
          case 0 : 
            switch(S777){
              case 0 : 
                switch(S775){
                  case 0 : 
                    S775=0;
                    S775=1;
                    active[11]=1;
                    ends[11]=1;
                    tdone[11]=1;
                    break;
                  
                  case 1 : 
                    S775=1;
                    S777=1;
                    active[11]=1;
                    ends[11]=1;
                    tdone[11]=1;
                    break;
                  
                }
                break;
              
              case 1 : 
                S777=1;
                S777=0;
                if(bufferNotEmpty_9.getprestatus()){//sysj/Exercise6.sysj line: 104, column: 12
                  S775=0;
                  active[11]=1;
                  ends[11]=1;
                  tdone[11]=1;
                }
                else {
                  S777=1;
                  active[11]=1;
                  ends[11]=1;
                  tdone[11]=1;
                }
                break;
              
            }
            break;
          
          case 1 : 
            S793=1;
            S794=0;
            active[11]=0;
            ends[11]=0;
            tdone[11]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread894(int [] tdone, int [] ends){
        switch(S774){
      case 0 : 
        active[10]=0;
        ends[10]=0;
        tdone[10]=1;
        break;
      
      case 1 : 
        switch(S773){
          case 0 : 
            switch(S647){
              case 0 : 
                switch(S645){
                  case 0 : 
                    switch(S629){
                      case 0 : 
                        if(!producerChannel_in.isPartnerPresent() || producerChannel_in.isPartnerPreempted()){//sysj/Exercise6.sysj line: 87, column: 5
                          producerChannel_in.setACK(false);//sysj/Exercise6.sysj line: 87, column: 5
                          S629=1;
                          active[10]=1;
                          ends[10]=1;
                          tdone[10]=1;
                        }
                        else {
                          switch(S624){
                            case 0 : 
                              if(!producerChannel_in.isREQ()){//sysj/Exercise6.sysj line: 87, column: 5
                                producerChannel_in.setACK(true);//sysj/Exercise6.sysj line: 87, column: 5
                                S624=1;
                                if(producerChannel_in.isREQ()){//sysj/Exercise6.sysj line: 87, column: 5
                                  producerChannel_in.setACK(false);//sysj/Exercise6.sysj line: 87, column: 5
                                  ends[10]=2;
                                  ;//sysj/Exercise6.sysj line: 87, column: 5
                                  data_thread_10 = (int)(producerChannel_in.getVal() == null ? 0 : ((Integer)producerChannel_in.getVal()).intValue());//sysj/Exercise6.sysj line: 89, column: 5
                                  toBuffer_9.setPresent();//sysj/Exercise6.sysj line: 91, column: 5
                                  currsigs.addElement(toBuffer_9);
                                  toBuffer_9.setValue(data_thread_10);//sysj/Exercise6.sysj line: 91, column: 5
                                  System.out.println("Emitted toBuffer_9");
                                  S645=1;
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
                              if(producerChannel_in.isREQ()){//sysj/Exercise6.sysj line: 87, column: 5
                                producerChannel_in.setACK(false);//sysj/Exercise6.sysj line: 87, column: 5
                                ends[10]=2;
                                ;//sysj/Exercise6.sysj line: 87, column: 5
                                data_thread_10 = (int)(producerChannel_in.getVal() == null ? 0 : ((Integer)producerChannel_in.getVal()).intValue());//sysj/Exercise6.sysj line: 89, column: 5
                                toBuffer_9.setPresent();//sysj/Exercise6.sysj line: 91, column: 5
                                currsigs.addElement(toBuffer_9);
                                toBuffer_9.setValue(data_thread_10);//sysj/Exercise6.sysj line: 91, column: 5
                                System.out.println("Emitted toBuffer_9");
                                S645=1;
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
                        S629=1;
                        S629=0;
                        if(!producerChannel_in.isPartnerPresent() || producerChannel_in.isPartnerPreempted()){//sysj/Exercise6.sysj line: 87, column: 5
                          producerChannel_in.setACK(false);//sysj/Exercise6.sysj line: 87, column: 5
                          S629=1;
                          active[10]=1;
                          ends[10]=1;
                          tdone[10]=1;
                        }
                        else {
                          S624=0;
                          if(!producerChannel_in.isREQ()){//sysj/Exercise6.sysj line: 87, column: 5
                            producerChannel_in.setACK(true);//sysj/Exercise6.sysj line: 87, column: 5
                            S624=1;
                            if(producerChannel_in.isREQ()){//sysj/Exercise6.sysj line: 87, column: 5
                              producerChannel_in.setACK(false);//sysj/Exercise6.sysj line: 87, column: 5
                              ends[10]=2;
                              ;//sysj/Exercise6.sysj line: 87, column: 5
                              data_thread_10 = (int)(producerChannel_in.getVal() == null ? 0 : ((Integer)producerChannel_in.getVal()).intValue());//sysj/Exercise6.sysj line: 89, column: 5
                              toBuffer_9.setPresent();//sysj/Exercise6.sysj line: 91, column: 5
                              currsigs.addElement(toBuffer_9);
                              toBuffer_9.setValue(data_thread_10);//sysj/Exercise6.sysj line: 91, column: 5
                              System.out.println("Emitted toBuffer_9");
                              S645=1;
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
                  
                  case 1 : 
                    S645=1;
                    S647=1;
                    active[10]=1;
                    ends[10]=1;
                    tdone[10]=1;
                    break;
                  
                }
                break;
              
              case 1 : 
                S647=1;
                S647=0;
                if(bufferNotFull_9.getprestatus()){//sysj/Exercise6.sysj line: 84, column: 12
                  S645=0;
                  S629=0;
                  if(!producerChannel_in.isPartnerPresent() || producerChannel_in.isPartnerPreempted()){//sysj/Exercise6.sysj line: 87, column: 5
                    producerChannel_in.setACK(false);//sysj/Exercise6.sysj line: 87, column: 5
                    S629=1;
                    active[10]=1;
                    ends[10]=1;
                    tdone[10]=1;
                  }
                  else {
                    S624=0;
                    if(!producerChannel_in.isREQ()){//sysj/Exercise6.sysj line: 87, column: 5
                      producerChannel_in.setACK(true);//sysj/Exercise6.sysj line: 87, column: 5
                      S624=1;
                      if(producerChannel_in.isREQ()){//sysj/Exercise6.sysj line: 87, column: 5
                        producerChannel_in.setACK(false);//sysj/Exercise6.sysj line: 87, column: 5
                        ends[10]=2;
                        ;//sysj/Exercise6.sysj line: 87, column: 5
                        data_thread_10 = (int)(producerChannel_in.getVal() == null ? 0 : ((Integer)producerChannel_in.getVal()).intValue());//sysj/Exercise6.sysj line: 89, column: 5
                        toBuffer_9.setPresent();//sysj/Exercise6.sysj line: 91, column: 5
                        currsigs.addElement(toBuffer_9);
                        toBuffer_9.setValue(data_thread_10);//sysj/Exercise6.sysj line: 91, column: 5
                        System.out.println("Emitted toBuffer_9");
                        S645=1;
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
                  S647=1;
                  active[10]=1;
                  ends[10]=1;
                  tdone[10]=1;
                }
                break;
              
            }
            break;
          
          case 1 : 
            S773=1;
            S774=0;
            active[10]=0;
            ends[10]=0;
            tdone[10]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread892(int [] tdone, int [] ends){
        S862=1;
    myBuffer_thread_12 = new Buffer(100);//sysj/Exercise6.sysj line: 126, column: 3
    data_thread_12 = 0;//sysj/Exercise6.sysj line: 127, column: 3
    if(requestData_9.getprestatus()){//sysj/Exercise6.sysj line: 132, column: 12
      data_thread_12 = ((Integer)myBuffer_thread_12.pop()).intValue();//sysj/Exercise6.sysj line: 133, column: 5
      fromBuffer_9.setPresent();//sysj/Exercise6.sysj line: 134, column: 5
      currsigs.addElement(fromBuffer_9);
      fromBuffer_9.setValue(data_thread_12);//sysj/Exercise6.sysj line: 134, column: 5
      System.out.println("Emitted fromBuffer_9");
      if(!myBuffer_thread_12.isFull()){//sysj/Exercise6.sysj line: 136, column: 7
        bufferNotFull_9.setPresent();//sysj/Exercise6.sysj line: 137, column: 5
        currsigs.addElement(bufferNotFull_9);
        System.out.println("Emitted bufferNotFull_9");
        if(!myBuffer_thread_12.isEmpty()){//sysj/Exercise6.sysj line: 139, column: 7
          bufferNotEmpty_9.setPresent();//sysj/Exercise6.sysj line: 140, column: 5
          currsigs.addElement(bufferNotEmpty_9);
          System.out.println("Emitted bufferNotEmpty_9");
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
        if(!myBuffer_thread_12.isEmpty()){//sysj/Exercise6.sysj line: 139, column: 7
          bufferNotEmpty_9.setPresent();//sysj/Exercise6.sysj line: 140, column: 5
          currsigs.addElement(bufferNotEmpty_9);
          System.out.println("Emitted bufferNotEmpty_9");
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
    }
    else {
      if(!myBuffer_thread_12.isFull()){//sysj/Exercise6.sysj line: 136, column: 7
        bufferNotFull_9.setPresent();//sysj/Exercise6.sysj line: 137, column: 5
        currsigs.addElement(bufferNotFull_9);
        System.out.println("Emitted bufferNotFull_9");
        if(!myBuffer_thread_12.isEmpty()){//sysj/Exercise6.sysj line: 139, column: 7
          bufferNotEmpty_9.setPresent();//sysj/Exercise6.sysj line: 140, column: 5
          currsigs.addElement(bufferNotEmpty_9);
          System.out.println("Emitted bufferNotEmpty_9");
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
        if(!myBuffer_thread_12.isEmpty()){//sysj/Exercise6.sysj line: 139, column: 7
          bufferNotEmpty_9.setPresent();//sysj/Exercise6.sysj line: 140, column: 5
          currsigs.addElement(bufferNotEmpty_9);
          System.out.println("Emitted bufferNotEmpty_9");
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
    }
  }

  public void thread891(int [] tdone, int [] ends){
        S794=1;
    data_thread_11 = 0;//sysj/Exercise6.sysj line: 101, column: 3
    S793=0;
    S777=0;
    if(bufferNotEmpty_9.getprestatus()){//sysj/Exercise6.sysj line: 104, column: 12
      S775=0;
      active[11]=1;
      ends[11]=1;
      tdone[11]=1;
    }
    else {
      S777=1;
      active[11]=1;
      ends[11]=1;
      tdone[11]=1;
    }
  }

  public void thread890(int [] tdone, int [] ends){
        S774=1;
    data_thread_10 = 0;//sysj/Exercise6.sysj line: 81, column: 3
    S773=0;
    S647=0;
    if(bufferNotFull_9.getprestatus()){//sysj/Exercise6.sysj line: 84, column: 12
      S645=0;
      S629=0;
      if(!producerChannel_in.isPartnerPresent() || producerChannel_in.isPartnerPreempted()){//sysj/Exercise6.sysj line: 87, column: 5
        producerChannel_in.setACK(false);//sysj/Exercise6.sysj line: 87, column: 5
        S629=1;
        active[10]=1;
        ends[10]=1;
        tdone[10]=1;
      }
      else {
        S624=0;
        if(!producerChannel_in.isREQ()){//sysj/Exercise6.sysj line: 87, column: 5
          producerChannel_in.setACK(true);//sysj/Exercise6.sysj line: 87, column: 5
          S624=1;
          if(producerChannel_in.isREQ()){//sysj/Exercise6.sysj line: 87, column: 5
            producerChannel_in.setACK(false);//sysj/Exercise6.sysj line: 87, column: 5
            ends[10]=2;
            ;//sysj/Exercise6.sysj line: 87, column: 5
            data_thread_10 = (int)(producerChannel_in.getVal() == null ? 0 : ((Integer)producerChannel_in.getVal()).intValue());//sysj/Exercise6.sysj line: 89, column: 5
            toBuffer_9.setPresent();//sysj/Exercise6.sysj line: 91, column: 5
            currsigs.addElement(toBuffer_9);
            toBuffer_9.setValue(data_thread_10);//sysj/Exercise6.sysj line: 91, column: 5
            System.out.println("Emitted toBuffer_9");
            S645=1;
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
      S647=1;
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
      switch(S864){
        case 0 : 
          S864=0;
          break RUN;
        
        case 1 : 
          S864=2;
          S864=2;
          bufferNotFull_9.setClear();//sysj/Exercise6.sysj line: 78, column: 2
          bufferNotEmpty_9.setClear();//sysj/Exercise6.sysj line: 78, column: 2
          requestData_9.setClear();//sysj/Exercise6.sysj line: 78, column: 2
          toBuffer_9.setClear();//sysj/Exercise6.sysj line: 79, column: 2
          fromBuffer_9.setClear();//sysj/Exercise6.sysj line: 79, column: 2
          thread890(tdone,ends);
          thread891(tdone,ends);
          thread892(tdone,ends);
          int biggest893 = 0;
          if(ends[10]>=biggest893){
            biggest893=ends[10];
          }
          if(ends[11]>=biggest893){
            biggest893=ends[11];
          }
          if(ends[12]>=biggest893){
            biggest893=ends[12];
          }
          if(biggest893 == 1){
            active[9]=1;
            ends[9]=1;
            break RUN;
          }
        
        case 2 : 
          bufferNotFull_9.setClear();//sysj/Exercise6.sysj line: 78, column: 2
          bufferNotEmpty_9.setClear();//sysj/Exercise6.sysj line: 78, column: 2
          requestData_9.setClear();//sysj/Exercise6.sysj line: 78, column: 2
          toBuffer_9.setClear();//sysj/Exercise6.sysj line: 79, column: 2
          fromBuffer_9.setClear();//sysj/Exercise6.sysj line: 79, column: 2
          thread894(tdone,ends);
          thread895(tdone,ends);
          thread896(tdone,ends);
          int biggest897 = 0;
          if(ends[10]>=biggest897){
            biggest897=ends[10];
          }
          if(ends[11]>=biggest897){
            biggest897=ends[11];
          }
          if(ends[12]>=biggest897){
            biggest897=ends[12];
          }
          if(biggest897 == 1){
            active[9]=1;
            ends[9]=1;
            break RUN;
          }
          //FINXME code
          if(biggest897 == 0){
            S864=0;
            active[9]=0;
            ends[9]=0;
            S864=0;
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
    bufferNotFull_9 = new Signal();
    bufferNotEmpty_9 = new Signal();
    requestData_9 = new Signal();
    toBuffer_9 = new Signal();
    fromBuffer_9 = new Signal();
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
          producerChannel_in.gethook();
          consumerChannel_o.gethook();
          df = true;
        }
        runClockDomain();
      }
      bufferNotFull_9.setpreclear();
      bufferNotEmpty_9.setpreclear();
      requestData_9.setpreclear();
      toBuffer_9.setpreclear();
      fromBuffer_9.setpreclear();
      int dummyint = 0;
      for(int qw=0;qw<currsigs.size();++qw){
        dummyint = ((Signal)currsigs.elementAt(qw)).getStatus() ? ((Signal)currsigs.elementAt(qw)).setprepresent() : ((Signal)currsigs.elementAt(qw)).setpreclear();
        ((Signal)currsigs.elementAt(qw)).setpreval(((Signal)currsigs.elementAt(qw)).getValue());
      }
      currsigs.removeAllElements();
      bufferNotFull_9.setClear();
      bufferNotEmpty_9.setClear();
      requestData_9.setClear();
      toBuffer_9.setClear();
      fromBuffer_9.setClear();
      producerChannel_in.sethook();
      consumerChannel_o.sethook();
      if(paused[9]!=0 || suspended[9]!=0 || active[9]!=1);
      else{
        producerChannel_in.gethook();
        consumerChannel_o.gethook();
      }
      runFinisher();
      if(active[9] == 0){
      	this.terminated = true;
      }
      if(!threaded) break;
    }
  }
}
