import java.util.*;
import com.systemj.ClockDomain;
import com.systemj.Signal;
import com.systemj.input_Channel;
import com.systemj.output_Channel;

public class CD extends ClockDomain{
  public CD(String name){super(name);}
  Vector currsigs = new Vector();
  private boolean df = false;
  private char [] active;
  private char [] paused;
  private char [] suspended;
  public Signal DOOR1OPEN = new Signal("DOOR1OPEN", Signal.INPUT);
  public Signal DOOR1CARDREADER = new Signal("DOOR1CARDREADER", Signal.OUTPUT);
  private Signal openDoor_1;
  private int cardid_thread_2;//sysj/Exercise6.sysj line: 10, column: 3
  private int badcardid_thread_2;//sysj/Exercise6.sysj line: 11, column: 3
  private long __start_thread_2;//sysj/Exercise6.sysj line: 12, column: 3
  private int S612 = 1;
  private int S572 = 1;
  private int S2 = 1;
  private int S4 = 1;
  private int S610 = 1;
  private int S584 = 1;
  
  private int[] ends = new int[5];
  private int[] tdone = new int[5];
  
  public void thread620(int [] tdone, int [] ends){
        switch(S610){
      case 0 : 
        active[3]=0;
        ends[3]=0;
        tdone[3]=1;
        break;
      
      case 1 : 
        switch(S584){
          case 0 : 
            if(DOOR1OPEN.getprestatus()){//sysj/Exercise6.sysj line: 26, column: 10
              S584=1;
              openDoor_1.setPresent();//sysj/Exercise6.sysj line: 28, column: 5
              currsigs.addElement(openDoor_1);
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
          
          case 1 : 
            if(!DOOR1OPEN.getprestatus()){//sysj/Exercise6.sysj line: 27, column: 11
              S584=2;
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            else {
              openDoor_1.setPresent();//sysj/Exercise6.sysj line: 28, column: 5
              currsigs.addElement(openDoor_1);
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            break;
          
          case 2 : 
            S584=2;
            S584=0;
            active[3]=1;
            ends[3]=1;
            tdone[3]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread619(int [] tdone, int [] ends){
        switch(S572){
      case 0 : 
        active[2]=0;
        ends[2]=0;
        tdone[2]=1;
        break;
      
      case 1 : 
        switch(S2){
          case 0 : 
            S2=0;
            S2=1;
            __start_thread_2 = com.systemj.Timer.getMs();//sysj/Exercise6.sysj line: 12, column: 3
            S4=0;
            if(com.systemj.Timer.getMs() - __start_thread_2 >= (10) * 1000){//sysj/Exercise6.sysj line: 12, column: 3
              ends[2]=2;
              ;//sysj/Exercise6.sysj line: 12, column: 3
              DOOR1CARDREADER.setPresent();//sysj/Exercise6.sysj line: 16, column: 4
              currsigs.addElement(DOOR1CARDREADER);
              DOOR1CARDREADER.setValue(cardid_thread_2);//sysj/Exercise6.sysj line: 16, column: 4
              S2=2;
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            else {
              S4=1;
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            break;
          
          case 1 : 
            switch(S4){
              case 0 : 
                S4=0;
                if(com.systemj.Timer.getMs() - __start_thread_2 >= (10) * 1000){//sysj/Exercise6.sysj line: 12, column: 3
                  ends[2]=2;
                  ;//sysj/Exercise6.sysj line: 12, column: 3
                  DOOR1CARDREADER.setPresent();//sysj/Exercise6.sysj line: 16, column: 4
                  currsigs.addElement(DOOR1CARDREADER);
                  DOOR1CARDREADER.setValue(cardid_thread_2);//sysj/Exercise6.sysj line: 16, column: 4
                  S2=2;
                  active[2]=1;
                  ends[2]=1;
                  tdone[2]=1;
                }
                else {
                  S4=1;
                  active[2]=1;
                  ends[2]=1;
                  tdone[2]=1;
                }
                break;
              
              case 1 : 
                S4=1;
                S4=0;
                if(com.systemj.Timer.getMs() - __start_thread_2 >= (10) * 1000){//sysj/Exercise6.sysj line: 12, column: 3
                  ends[2]=2;
                  ;//sysj/Exercise6.sysj line: 12, column: 3
                  DOOR1CARDREADER.setPresent();//sysj/Exercise6.sysj line: 16, column: 4
                  currsigs.addElement(DOOR1CARDREADER);
                  DOOR1CARDREADER.setValue(cardid_thread_2);//sysj/Exercise6.sysj line: 16, column: 4
                  S2=2;
                  active[2]=1;
                  ends[2]=1;
                  tdone[2]=1;
                }
                else {
                  S4=1;
                  active[2]=1;
                  ends[2]=1;
                  tdone[2]=1;
                }
                break;
              
            }
            break;
          
          case 2 : 
            S2=2;
            S2=3;
            __start_thread_2 = com.systemj.Timer.getMs();//sysj/Exercise6.sysj line: 12, column: 3
            if(com.systemj.Timer.getMs() - __start_thread_2 >= (10) * 1000){//sysj/Exercise6.sysj line: 12, column: 3
              ends[2]=2;
              ;//sysj/Exercise6.sysj line: 12, column: 3
              DOOR1CARDREADER.setPresent();//sysj/Exercise6.sysj line: 13, column: 4
              currsigs.addElement(DOOR1CARDREADER);
              DOOR1CARDREADER.setValue(badcardid_thread_2);//sysj/Exercise6.sysj line: 13, column: 4
              S2=0;
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
          
          case 3 : 
            if(com.systemj.Timer.getMs() - __start_thread_2 >= (10) * 1000){//sysj/Exercise6.sysj line: 12, column: 3
              ends[2]=2;
              ;//sysj/Exercise6.sysj line: 12, column: 3
              DOOR1CARDREADER.setPresent();//sysj/Exercise6.sysj line: 13, column: 4
              currsigs.addElement(DOOR1CARDREADER);
              DOOR1CARDREADER.setValue(badcardid_thread_2);//sysj/Exercise6.sysj line: 13, column: 4
              S2=0;
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
        break;
      
    }
  }

  public void thread617(int [] tdone, int [] ends){
        S610=1;
    S584=0;
    active[3]=1;
    ends[3]=1;
    tdone[3]=1;
  }

  public void thread616(int [] tdone, int [] ends){
        S572=1;
    cardid_thread_2 = 12345;//sysj/Exercise6.sysj line: 10, column: 3
    badcardid_thread_2 = 12110;//sysj/Exercise6.sysj line: 11, column: 3
    DOOR1CARDREADER.setPresent();//sysj/Exercise6.sysj line: 13, column: 4
    currsigs.addElement(DOOR1CARDREADER);
    DOOR1CARDREADER.setValue(badcardid_thread_2);//sysj/Exercise6.sysj line: 13, column: 4
    S2=0;
    active[2]=1;
    ends[2]=1;
    tdone[2]=1;
  }

  public void runClockDomain(){
    for(int i=0;i<ends.length;i++){
      ends[i] = 0;
      tdone[i] = 0;
    }
    
    RUN: while(true){
      switch(S612){
        case 0 : 
          S612=0;
          break RUN;
        
        case 1 : 
          S612=2;
          S612=2;
          openDoor_1.setClear();//sysj/Exercise6.sysj line: 8, column: 2
          thread616(tdone,ends);
          thread617(tdone,ends);
          int biggest618 = 0;
          if(ends[2]>=biggest618){
            biggest618=ends[2];
          }
          if(ends[3]>=biggest618){
            biggest618=ends[3];
          }
          if(biggest618 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
        
        case 2 : 
          openDoor_1.setClear();//sysj/Exercise6.sysj line: 8, column: 2
          thread619(tdone,ends);
          thread620(tdone,ends);
          int biggest621 = 0;
          if(ends[2]>=biggest621){
            biggest621=ends[2];
          }
          if(ends[3]>=biggest621){
            biggest621=ends[3];
          }
          if(biggest621 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
          //FINXME code
          if(biggest621 == 0){
            S612=0;
            active[1]=0;
            ends[1]=0;
            S612=0;
            break RUN;
          }
        
      }
    }
  }

  public void init(){
    char [] active1 = {1, 1, 1, 1, 1};
    char [] paused1 = {0, 0, 0, 0, 0};
    char [] suspended1 = {0, 0, 0, 0, 0};
    paused = paused1;
    active = active1;
    suspended = suspended1;
    // Now instantiate all the local signals ONLY
    openDoor_1 = new Signal();
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
          DOOR1OPEN.gethook();
          df = true;
        }
        runClockDomain();
      }
      DOOR1OPEN.setpreclear();
      DOOR1CARDREADER.setpreclear();
      openDoor_1.setpreclear();
      int dummyint = 0;
      for(int qw=0;qw<currsigs.size();++qw){
        dummyint = ((Signal)currsigs.elementAt(qw)).getStatus() ? ((Signal)currsigs.elementAt(qw)).setprepresent() : ((Signal)currsigs.elementAt(qw)).setpreclear();
        ((Signal)currsigs.elementAt(qw)).setpreval(((Signal)currsigs.elementAt(qw)).getValue());
      }
      currsigs.removeAllElements();
      dummyint = DOOR1OPEN.getStatus() ? DOOR1OPEN.setprepresent() : DOOR1OPEN.setpreclear();
      DOOR1OPEN.setpreval(DOOR1OPEN.getValue());
      DOOR1OPEN.setClear();
      DOOR1CARDREADER.sethook();
      DOOR1CARDREADER.setClear();
      openDoor_1.setClear();
      if(paused[1]!=0 || suspended[1]!=0 || active[1]!=1);
      else{
        DOOR1OPEN.gethook();
      }
      runFinisher();
      if(active[1] == 0){
      	this.terminated = true;
      }
      if(!threaded) break;
    }
  }
}
