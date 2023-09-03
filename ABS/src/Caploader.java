import java.util.*;
import com.systemj.ClockDomain;
import com.systemj.Signal;
import com.systemj.input_Channel;
import com.systemj.output_Channel;

public class Caploader extends ClockDomain{
  public Caploader(String name){super(name);}
  Vector currsigs = new Vector();
  private boolean df = false;
  private char [] active;
  private char [] paused;
  private char [] suspended;
  public Signal pusherRetracted = new Signal("pusherRetracted", Signal.INPUT);
  public Signal pusherExtended = new Signal("pusherExtended", Signal.INPUT);
  public Signal WPgripped = new Signal("WPgripped", Signal.INPUT);
  public Signal armAtSource = new Signal("armAtSource", Signal.INPUT);
  public Signal armAtDest = new Signal("armAtDest", Signal.INPUT);
  public Signal empty = new Signal("empty", Signal.INPUT);
  public Signal request = new Signal("request", Signal.INPUT);
  public Signal mode = new Signal("mode", Signal.INPUT);
  public Signal pusherExtendM = new Signal("pusherExtendM", Signal.INPUT);
  public Signal vacOnM = new Signal("vacOnM", Signal.INPUT);
  public Signal armSourceM = new Signal("armSourceM", Signal.INPUT);
  public Signal armDestM = new Signal("armDestM", Signal.INPUT);
  public Signal pusherExtend = new Signal("pusherExtend", Signal.OUTPUT);
  public Signal vacOn = new Signal("vacOn", Signal.OUTPUT);
  public Signal armSource = new Signal("armSource", Signal.OUTPUT);
  public Signal armDest = new Signal("armDest", Signal.OUTPUT);
  private int S441 = 1;
  private int S257 = 1;
  private int S172 = 1;
  private int S193 = 1;
  private int S198 = 1;
  
  private int[] ends = new int[8];
  private int[] tdone = new int[8];
  
  public void thread447(int [] tdone, int [] ends){
        switch(S198){
      case 0 : 
        active[7]=0;
        ends[7]=0;
        tdone[7]=1;
        break;
      
      case 1 : 
        vacOn.setPresent();//sysj\controller.sysj line: 200, column: 30
        currsigs.addElement(vacOn);
        active[7]=1;
        ends[7]=1;
        tdone[7]=1;
        break;
      
    }
  }

  public void thread446(int [] tdone, int [] ends){
        switch(S193){
      case 0 : 
        active[6]=0;
        ends[6]=0;
        tdone[6]=1;
        break;
      
      case 1 : 
        armDest.setPresent();//sysj\controller.sysj line: 200, column: 8
        currsigs.addElement(armDest);
        active[6]=1;
        ends[6]=1;
        tdone[6]=1;
        break;
      
    }
  }

  public void thread444(int [] tdone, int [] ends){
        S198=1;
    vacOn.setPresent();//sysj\controller.sysj line: 200, column: 30
    currsigs.addElement(vacOn);
    active[7]=1;
    ends[7]=1;
    tdone[7]=1;
  }

  public void thread443(int [] tdone, int [] ends){
        S193=1;
    armDest.setPresent();//sysj\controller.sysj line: 200, column: 8
    currsigs.addElement(armDest);
    active[6]=1;
    ends[6]=1;
    tdone[6]=1;
  }

  public void runClockDomain(){
    for(int i=0;i<ends.length;i++){
      ends[i] = 0;
      tdone[i] = 0;
    }
    
    RUN: while(true){
      switch(S441){
        case 0 : 
          S441=0;
          break RUN;
        
        case 1 : 
          S441=2;
          S441=2;
          System.out.println("Automatic state");//sysj\controller.sysj line: 175, column: 5
          S257=0;
          if(!empty.getprestatus()){//sysj\controller.sysj line: 176, column: 14
            S172=0;
            if(pusherRetracted.getprestatus()){//sysj\controller.sysj line: 179, column: 14
              pusherExtend.setPresent();//sysj\controller.sysj line: 181, column: 8
              currsigs.addElement(pusherExtend);
              active[5]=1;
              ends[5]=1;
              break RUN;
            }
            else {
              S172=1;
              active[5]=1;
              ends[5]=1;
              break RUN;
            }
          }
          else {
            S257=1;
            active[5]=1;
            ends[5]=1;
            break RUN;
          }
        
        case 2 : 
          switch(S257){
            case 0 : 
              switch(S172){
                case 0 : 
                  if(pusherExtended.getprestatus()){//sysj\controller.sysj line: 180, column: 13
                    S172=1;
                    active[5]=1;
                    ends[5]=1;
                    break RUN;
                  }
                  else {
                    pusherExtend.setPresent();//sysj\controller.sysj line: 181, column: 8
                    currsigs.addElement(pusherExtend);
                    active[5]=1;
                    ends[5]=1;
                    break RUN;
                  }
                
                case 1 : 
                  S172=1;
                  S172=2;
                  armSource.setPresent();//sysj\controller.sysj line: 188, column: 7
                  currsigs.addElement(armSource);
                  active[5]=1;
                  ends[5]=1;
                  break RUN;
                
                case 2 : 
                  if(armAtSource.getprestatus()){//sysj\controller.sysj line: 187, column: 12
                    S172=3;
                    active[5]=1;
                    ends[5]=1;
                    break RUN;
                  }
                  else {
                    armSource.setPresent();//sysj\controller.sysj line: 188, column: 7
                    currsigs.addElement(armSource);
                    active[5]=1;
                    ends[5]=1;
                    break RUN;
                  }
                
                case 3 : 
                  S172=3;
                  S172=4;
                  vacOn.setPresent();//sysj\controller.sysj line: 194, column: 7
                  currsigs.addElement(vacOn);
                  active[5]=1;
                  ends[5]=1;
                  break RUN;
                
                case 4 : 
                  if(WPgripped.getprestatus()){//sysj\controller.sysj line: 193, column: 12
                    S172=5;
                    active[5]=1;
                    ends[5]=1;
                    break RUN;
                  }
                  else {
                    vacOn.setPresent();//sysj\controller.sysj line: 194, column: 7
                    currsigs.addElement(vacOn);
                    active[5]=1;
                    ends[5]=1;
                    break RUN;
                  }
                
                case 5 : 
                  S172=5;
                  S172=6;
                  thread443(tdone,ends);
                  thread444(tdone,ends);
                  int biggest445 = 0;
                  if(ends[6]>=biggest445){
                    biggest445=ends[6];
                  }
                  if(ends[7]>=biggest445){
                    biggest445=ends[7];
                  }
                  if(biggest445 == 1){
                    active[5]=1;
                    ends[5]=1;
                    break RUN;
                  }
                
                case 6 : 
                  if(armAtDest.getprestatus()){//sysj\controller.sysj line: 199, column: 13
                    S172=7;
                    active[5]=1;
                    ends[5]=1;
                    break RUN;
                  }
                  else {
                    thread446(tdone,ends);
                    thread447(tdone,ends);
                    int biggest448 = 0;
                    if(ends[6]>=biggest448){
                      biggest448=ends[6];
                    }
                    if(ends[7]>=biggest448){
                      biggest448=ends[7];
                    }
                    if(biggest448 == 1){
                      active[5]=1;
                      ends[5]=1;
                      break RUN;
                    }
                    //FINXME code
                    if(biggest448 == 0){
                      S172=7;
                      active[5]=1;
                      ends[5]=1;
                      break RUN;
                    }
                  }
                
                case 7 : 
                  S172=7;
                  S257=1;
                  active[5]=1;
                  ends[5]=1;
                  break RUN;
                
              }
              break;
            
            case 1 : 
              S257=1;
              System.out.println("Automatic state");//sysj\controller.sysj line: 175, column: 5
              S257=0;
              if(!empty.getprestatus()){//sysj\controller.sysj line: 176, column: 14
                S172=0;
                if(pusherRetracted.getprestatus()){//sysj\controller.sysj line: 179, column: 14
                  pusherExtend.setPresent();//sysj\controller.sysj line: 181, column: 8
                  currsigs.addElement(pusherExtend);
                  active[5]=1;
                  ends[5]=1;
                  break RUN;
                }
                else {
                  S172=1;
                  active[5]=1;
                  ends[5]=1;
                  break RUN;
                }
              }
              else {
                S257=1;
                active[5]=1;
                ends[5]=1;
                break RUN;
              }
            
          }
        
      }
    }
  }

  public void init(){
    char [] active1 = {1, 1, 1, 1, 1, 1, 1, 1};
    char [] paused1 = {0, 0, 0, 0, 0, 0, 0, 0};
    char [] suspended1 = {0, 0, 0, 0, 0, 0, 0, 0};
    paused = paused1;
    active = active1;
    suspended = suspended1;
    // Now instantiate all the local signals ONLY
    // --------------------------------------------------
  }
  
  public void run(){
    while(active[5] != 0){
      int index = 5;
      if(paused[index]==1 || suspended[index]==1 || active[index] == 0){
        for(int h=1;h<paused.length;++h){
          paused[h]=0;
        }
      }
      if(paused[5]!=0 || suspended[5]!=0 || active[5]!=1);
      else{
        if(!df){
          pusherRetracted.gethook();
          pusherExtended.gethook();
          WPgripped.gethook();
          armAtSource.gethook();
          armAtDest.gethook();
          empty.gethook();
          request.gethook();
          mode.gethook();
          pusherExtendM.gethook();
          vacOnM.gethook();
          armSourceM.gethook();
          armDestM.gethook();
          df = true;
        }
        runClockDomain();
      }
      pusherRetracted.setpreclear();
      pusherExtended.setpreclear();
      WPgripped.setpreclear();
      armAtSource.setpreclear();
      armAtDest.setpreclear();
      empty.setpreclear();
      request.setpreclear();
      mode.setpreclear();
      pusherExtendM.setpreclear();
      vacOnM.setpreclear();
      armSourceM.setpreclear();
      armDestM.setpreclear();
      pusherExtend.setpreclear();
      vacOn.setpreclear();
      armSource.setpreclear();
      armDest.setpreclear();
      int dummyint = 0;
      for(int qw=0;qw<currsigs.size();++qw){
        dummyint = ((Signal)currsigs.elementAt(qw)).getStatus() ? ((Signal)currsigs.elementAt(qw)).setprepresent() : ((Signal)currsigs.elementAt(qw)).setpreclear();
        ((Signal)currsigs.elementAt(qw)).setpreval(((Signal)currsigs.elementAt(qw)).getValue());
      }
      currsigs.removeAllElements();
      dummyint = pusherRetracted.getStatus() ? pusherRetracted.setprepresent() : pusherRetracted.setpreclear();
      pusherRetracted.setpreval(pusherRetracted.getValue());
      pusherRetracted.setClear();
      dummyint = pusherExtended.getStatus() ? pusherExtended.setprepresent() : pusherExtended.setpreclear();
      pusherExtended.setpreval(pusherExtended.getValue());
      pusherExtended.setClear();
      dummyint = WPgripped.getStatus() ? WPgripped.setprepresent() : WPgripped.setpreclear();
      WPgripped.setpreval(WPgripped.getValue());
      WPgripped.setClear();
      dummyint = armAtSource.getStatus() ? armAtSource.setprepresent() : armAtSource.setpreclear();
      armAtSource.setpreval(armAtSource.getValue());
      armAtSource.setClear();
      dummyint = armAtDest.getStatus() ? armAtDest.setprepresent() : armAtDest.setpreclear();
      armAtDest.setpreval(armAtDest.getValue());
      armAtDest.setClear();
      dummyint = empty.getStatus() ? empty.setprepresent() : empty.setpreclear();
      empty.setpreval(empty.getValue());
      empty.setClear();
      dummyint = request.getStatus() ? request.setprepresent() : request.setpreclear();
      request.setpreval(request.getValue());
      request.setClear();
      dummyint = mode.getStatus() ? mode.setprepresent() : mode.setpreclear();
      mode.setpreval(mode.getValue());
      mode.setClear();
      dummyint = pusherExtendM.getStatus() ? pusherExtendM.setprepresent() : pusherExtendM.setpreclear();
      pusherExtendM.setpreval(pusherExtendM.getValue());
      pusherExtendM.setClear();
      dummyint = vacOnM.getStatus() ? vacOnM.setprepresent() : vacOnM.setpreclear();
      vacOnM.setpreval(vacOnM.getValue());
      vacOnM.setClear();
      dummyint = armSourceM.getStatus() ? armSourceM.setprepresent() : armSourceM.setpreclear();
      armSourceM.setpreval(armSourceM.getValue());
      armSourceM.setClear();
      dummyint = armDestM.getStatus() ? armDestM.setprepresent() : armDestM.setpreclear();
      armDestM.setpreval(armDestM.getValue());
      armDestM.setClear();
      pusherExtend.sethook();
      pusherExtend.setClear();
      vacOn.sethook();
      vacOn.setClear();
      armSource.sethook();
      armSource.setClear();
      armDest.sethook();
      armDest.setClear();
      if(paused[5]!=0 || suspended[5]!=0 || active[5]!=1);
      else{
        pusherRetracted.gethook();
        pusherExtended.gethook();
        WPgripped.gethook();
        armAtSource.gethook();
        armAtDest.gethook();
        empty.gethook();
        request.gethook();
        mode.gethook();
        pusherExtendM.gethook();
        vacOnM.gethook();
        armSourceM.gethook();
        armDestM.gethook();
      }
      runFinisher();
      if(active[5] == 0){
      	this.terminated = true;
      }
      if(!threaded) break;
    }
  }
}
