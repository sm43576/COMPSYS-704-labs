import java.util.*;
import com.systemj.ClockDomain;
import com.systemj.Signal;
import com.systemj.input_Channel;
import com.systemj.output_Channel;
import java.util.ArrayList;//sysj\controller.sysj line: 1, column: 1

public class RotaryTable extends ClockDomain{
  public RotaryTable(String name){super(name);}
  Vector currsigs = new Vector();
  private boolean df = false;
  private char [] active;
  private char [] paused;
  private char [] suspended;
  public Signal tableAlignedWithSensor = new Signal("tableAlignedWithSensor", Signal.INPUT);
  public Signal capOnBottleAtPos1 = new Signal("capOnBottleAtPos1", Signal.INPUT);
  public Signal RTbottleAtPos1 = new Signal("RTbottleAtPos1", Signal.INPUT);
  public Signal rotaryTableTrigger = new Signal("rotaryTableTrigger", Signal.OUTPUT);
  public input_Channel rotaryReq_in = new input_Channel();
  public output_Channel rotaryStatus_o = new output_Channel();
  private Boolean request_thread_6;//sysj\controller.sysj line: 52, column: 9
  private int S5133 = 1;
  private int S4485 = 1;
  private int S4469 = 1;
  private int S4464 = 1;
  private int S4490 = 1;
  private int S4497 = 1;
  private int S4492 = 1;
  
  private int[] ends = new int[20];
  private int[] tdone = new int[20];
  
  public void runClockDomain(){
    for(int i=0;i<ends.length;i++){
      ends[i] = 0;
      tdone[i] = 0;
    }
    
    RUN: while(true){
      switch(S5133){
        case 0 : 
          S5133=0;
          break RUN;
        
        case 1 : 
          S5133=2;
          S5133=2;
          S4485=0;
          S4469=0;
          if(!rotaryReq_in.isPartnerPresent() || rotaryReq_in.isPartnerPreempted()){//sysj\controller.sysj line: 51, column: 9
            rotaryReq_in.setACK(false);//sysj\controller.sysj line: 51, column: 9
            S4469=1;
            active[6]=1;
            ends[6]=1;
            break RUN;
          }
          else {
            S4464=0;
            if(!rotaryReq_in.isREQ()){//sysj\controller.sysj line: 51, column: 9
              rotaryReq_in.setACK(true);//sysj\controller.sysj line: 51, column: 9
              S4464=1;
              if(rotaryReq_in.isREQ()){//sysj\controller.sysj line: 51, column: 9
                rotaryReq_in.setACK(false);//sysj\controller.sysj line: 51, column: 9
                ends[6]=2;
                ;//sysj\controller.sysj line: 51, column: 9
                request_thread_6 = (boolean)(rotaryReq_in.getVal() == null ? null : ((Boolean)rotaryReq_in.getVal()));//sysj\controller.sysj line: 52, column: 9
                S4485=1;
                if(request_thread_6){//sysj\controller.sysj line: 55, column: 9
                  S4490=0;
                  rotaryTableTrigger.setPresent();//sysj\controller.sysj line: 60, column: 17
                  currsigs.addElement(rotaryTableTrigger);
                  active[6]=1;
                  ends[6]=1;
                  break RUN;
                }
                else {
                  S4485=2;
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
            else {
              active[6]=1;
              ends[6]=1;
              break RUN;
            }
          }
        
        case 2 : 
          switch(S4485){
            case 0 : 
              switch(S4469){
                case 0 : 
                  if(!rotaryReq_in.isPartnerPresent() || rotaryReq_in.isPartnerPreempted()){//sysj\controller.sysj line: 51, column: 9
                    rotaryReq_in.setACK(false);//sysj\controller.sysj line: 51, column: 9
                    S4469=1;
                    active[6]=1;
                    ends[6]=1;
                    break RUN;
                  }
                  else {
                    switch(S4464){
                      case 0 : 
                        if(!rotaryReq_in.isREQ()){//sysj\controller.sysj line: 51, column: 9
                          rotaryReq_in.setACK(true);//sysj\controller.sysj line: 51, column: 9
                          S4464=1;
                          if(rotaryReq_in.isREQ()){//sysj\controller.sysj line: 51, column: 9
                            rotaryReq_in.setACK(false);//sysj\controller.sysj line: 51, column: 9
                            ends[6]=2;
                            ;//sysj\controller.sysj line: 51, column: 9
                            request_thread_6 = (boolean)(rotaryReq_in.getVal() == null ? null : ((Boolean)rotaryReq_in.getVal()));//sysj\controller.sysj line: 52, column: 9
                            S4485=1;
                            if(request_thread_6){//sysj\controller.sysj line: 55, column: 9
                              S4490=0;
                              rotaryTableTrigger.setPresent();//sysj\controller.sysj line: 60, column: 17
                              currsigs.addElement(rotaryTableTrigger);
                              active[6]=1;
                              ends[6]=1;
                              break RUN;
                            }
                            else {
                              S4485=2;
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
                        else {
                          active[6]=1;
                          ends[6]=1;
                          break RUN;
                        }
                      
                      case 1 : 
                        if(rotaryReq_in.isREQ()){//sysj\controller.sysj line: 51, column: 9
                          rotaryReq_in.setACK(false);//sysj\controller.sysj line: 51, column: 9
                          ends[6]=2;
                          ;//sysj\controller.sysj line: 51, column: 9
                          request_thread_6 = (boolean)(rotaryReq_in.getVal() == null ? null : ((Boolean)rotaryReq_in.getVal()));//sysj\controller.sysj line: 52, column: 9
                          S4485=1;
                          if(request_thread_6){//sysj\controller.sysj line: 55, column: 9
                            S4490=0;
                            rotaryTableTrigger.setPresent();//sysj\controller.sysj line: 60, column: 17
                            currsigs.addElement(rotaryTableTrigger);
                            active[6]=1;
                            ends[6]=1;
                            break RUN;
                          }
                          else {
                            S4485=2;
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
                
                case 1 : 
                  S4469=1;
                  S4469=0;
                  if(!rotaryReq_in.isPartnerPresent() || rotaryReq_in.isPartnerPreempted()){//sysj\controller.sysj line: 51, column: 9
                    rotaryReq_in.setACK(false);//sysj\controller.sysj line: 51, column: 9
                    S4469=1;
                    active[6]=1;
                    ends[6]=1;
                    break RUN;
                  }
                  else {
                    S4464=0;
                    if(!rotaryReq_in.isREQ()){//sysj\controller.sysj line: 51, column: 9
                      rotaryReq_in.setACK(true);//sysj\controller.sysj line: 51, column: 9
                      S4464=1;
                      if(rotaryReq_in.isREQ()){//sysj\controller.sysj line: 51, column: 9
                        rotaryReq_in.setACK(false);//sysj\controller.sysj line: 51, column: 9
                        ends[6]=2;
                        ;//sysj\controller.sysj line: 51, column: 9
                        request_thread_6 = (boolean)(rotaryReq_in.getVal() == null ? null : ((Boolean)rotaryReq_in.getVal()));//sysj\controller.sysj line: 52, column: 9
                        S4485=1;
                        if(request_thread_6){//sysj\controller.sysj line: 55, column: 9
                          S4490=0;
                          rotaryTableTrigger.setPresent();//sysj\controller.sysj line: 60, column: 17
                          currsigs.addElement(rotaryTableTrigger);
                          active[6]=1;
                          ends[6]=1;
                          break RUN;
                        }
                        else {
                          S4485=2;
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
                    else {
                      active[6]=1;
                      ends[6]=1;
                      break RUN;
                    }
                  }
                
              }
              break;
            
            case 1 : 
              switch(S4490){
                case 0 : 
                  if(tableAlignedWithSensor.getprestatus()){//sysj\controller.sysj line: 59, column: 19
                    System.out.println("RotaryController - finished");//sysj\controller.sysj line: 62, column: 13
                    S4490=1;
                    S4497=0;
                    if(!rotaryStatus_o.isPartnerPresent() || rotaryStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 63, column: 13
                      rotaryStatus_o.setREQ(false);//sysj\controller.sysj line: 63, column: 13
                      S4497=1;
                      active[6]=1;
                      ends[6]=1;
                      break RUN;
                    }
                    else {
                      S4492=0;
                      if(rotaryStatus_o.isACK()){//sysj\controller.sysj line: 63, column: 13
                        rotaryStatus_o.setVal("done");//sysj\controller.sysj line: 63, column: 13
                        S4492=1;
                        if(!rotaryStatus_o.isACK()){//sysj\controller.sysj line: 63, column: 13
                          rotaryStatus_o.setREQ(false);//sysj\controller.sysj line: 63, column: 13
                          ends[6]=2;
                          ;//sysj\controller.sysj line: 63, column: 13
                          S4485=2;
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
                  else {
                    rotaryTableTrigger.setPresent();//sysj\controller.sysj line: 60, column: 17
                    currsigs.addElement(rotaryTableTrigger);
                    active[6]=1;
                    ends[6]=1;
                    break RUN;
                  }
                
                case 1 : 
                  switch(S4497){
                    case 0 : 
                      if(!rotaryStatus_o.isPartnerPresent() || rotaryStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 63, column: 13
                        rotaryStatus_o.setREQ(false);//sysj\controller.sysj line: 63, column: 13
                        S4497=1;
                        active[6]=1;
                        ends[6]=1;
                        break RUN;
                      }
                      else {
                        switch(S4492){
                          case 0 : 
                            if(rotaryStatus_o.isACK()){//sysj\controller.sysj line: 63, column: 13
                              rotaryStatus_o.setVal("done");//sysj\controller.sysj line: 63, column: 13
                              S4492=1;
                              if(!rotaryStatus_o.isACK()){//sysj\controller.sysj line: 63, column: 13
                                rotaryStatus_o.setREQ(false);//sysj\controller.sysj line: 63, column: 13
                                ends[6]=2;
                                ;//sysj\controller.sysj line: 63, column: 13
                                S4485=2;
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
                            if(!rotaryStatus_o.isACK()){//sysj\controller.sysj line: 63, column: 13
                              rotaryStatus_o.setREQ(false);//sysj\controller.sysj line: 63, column: 13
                              ends[6]=2;
                              ;//sysj\controller.sysj line: 63, column: 13
                              S4485=2;
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
                      S4497=1;
                      S4497=0;
                      if(!rotaryStatus_o.isPartnerPresent() || rotaryStatus_o.isPartnerPreempted()){//sysj\controller.sysj line: 63, column: 13
                        rotaryStatus_o.setREQ(false);//sysj\controller.sysj line: 63, column: 13
                        S4497=1;
                        active[6]=1;
                        ends[6]=1;
                        break RUN;
                      }
                      else {
                        S4492=0;
                        if(rotaryStatus_o.isACK()){//sysj\controller.sysj line: 63, column: 13
                          rotaryStatus_o.setVal("done");//sysj\controller.sysj line: 63, column: 13
                          S4492=1;
                          if(!rotaryStatus_o.isACK()){//sysj\controller.sysj line: 63, column: 13
                            rotaryStatus_o.setREQ(false);//sysj\controller.sysj line: 63, column: 13
                            ends[6]=2;
                            ;//sysj\controller.sysj line: 63, column: 13
                            S4485=2;
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
                
              }
              break;
            
            case 2 : 
              S4485=2;
              S4485=0;
              S4469=0;
              if(!rotaryReq_in.isPartnerPresent() || rotaryReq_in.isPartnerPreempted()){//sysj\controller.sysj line: 51, column: 9
                rotaryReq_in.setACK(false);//sysj\controller.sysj line: 51, column: 9
                S4469=1;
                active[6]=1;
                ends[6]=1;
                break RUN;
              }
              else {
                S4464=0;
                if(!rotaryReq_in.isREQ()){//sysj\controller.sysj line: 51, column: 9
                  rotaryReq_in.setACK(true);//sysj\controller.sysj line: 51, column: 9
                  S4464=1;
                  if(rotaryReq_in.isREQ()){//sysj\controller.sysj line: 51, column: 9
                    rotaryReq_in.setACK(false);//sysj\controller.sysj line: 51, column: 9
                    ends[6]=2;
                    ;//sysj\controller.sysj line: 51, column: 9
                    request_thread_6 = (boolean)(rotaryReq_in.getVal() == null ? null : ((Boolean)rotaryReq_in.getVal()));//sysj\controller.sysj line: 52, column: 9
                    S4485=1;
                    if(request_thread_6){//sysj\controller.sysj line: 55, column: 9
                      S4490=0;
                      rotaryTableTrigger.setPresent();//sysj\controller.sysj line: 60, column: 17
                      currsigs.addElement(rotaryTableTrigger);
                      active[6]=1;
                      ends[6]=1;
                      break RUN;
                    }
                    else {
                      S4485=2;
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
                else {
                  active[6]=1;
                  ends[6]=1;
                  break RUN;
                }
              }
            
          }
        
      }
    }
  }

  public void init(){
    char [] active1 = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
    char [] paused1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    char [] suspended1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
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
          rotaryReq_in.gethook();
          rotaryStatus_o.gethook();
          tableAlignedWithSensor.gethook();
          capOnBottleAtPos1.gethook();
          RTbottleAtPos1.gethook();
          df = true;
        }
        runClockDomain();
      }
      tableAlignedWithSensor.setpreclear();
      capOnBottleAtPos1.setpreclear();
      RTbottleAtPos1.setpreclear();
      rotaryTableTrigger.setpreclear();
      int dummyint = 0;
      for(int qw=0;qw<currsigs.size();++qw){
        dummyint = ((Signal)currsigs.elementAt(qw)).getStatus() ? ((Signal)currsigs.elementAt(qw)).setprepresent() : ((Signal)currsigs.elementAt(qw)).setpreclear();
        ((Signal)currsigs.elementAt(qw)).setpreval(((Signal)currsigs.elementAt(qw)).getValue());
      }
      currsigs.removeAllElements();
      dummyint = tableAlignedWithSensor.getStatus() ? tableAlignedWithSensor.setprepresent() : tableAlignedWithSensor.setpreclear();
      tableAlignedWithSensor.setpreval(tableAlignedWithSensor.getValue());
      tableAlignedWithSensor.setClear();
      dummyint = capOnBottleAtPos1.getStatus() ? capOnBottleAtPos1.setprepresent() : capOnBottleAtPos1.setpreclear();
      capOnBottleAtPos1.setpreval(capOnBottleAtPos1.getValue());
      capOnBottleAtPos1.setClear();
      dummyint = RTbottleAtPos1.getStatus() ? RTbottleAtPos1.setprepresent() : RTbottleAtPos1.setpreclear();
      RTbottleAtPos1.setpreval(RTbottleAtPos1.getValue());
      RTbottleAtPos1.setClear();
      rotaryTableTrigger.sethook();
      rotaryTableTrigger.setClear();
      rotaryReq_in.sethook();
      rotaryStatus_o.sethook();
      if(paused[6]!=0 || suspended[6]!=0 || active[6]!=1);
      else{
        rotaryReq_in.gethook();
        rotaryStatus_o.gethook();
        tableAlignedWithSensor.gethook();
        capOnBottleAtPos1.gethook();
        RTbottleAtPos1.gethook();
      }
      runFinisher();
      if(active[6] == 0){
      	this.terminated = true;
      }
      if(!threaded) break;
    }
  }
}
