import java.util.*;
import com.systemj.ClockDomain;
import com.systemj.Signal;
import com.systemj.input_Channel;
import com.systemj.output_Channel;

public class Controller extends ClockDomain{
  public Controller(String name){super(name);}
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
  private int S595 = 1;
  private int S197 = 1;
  private int S195 = 1;
  private int S5 = 1;
  private int S26 = 1;
  private int S31 = 1;
  private int S104 = 1;
  private int S91 = 1;
  private int S116 = 1;
  private int S113 = 1;
  private int S128 = 1;
  private int S125 = 1;
  private int S141 = 1;
  private int S138 = 1;
  
  private int[] ends = new int[8];
  private int[] tdone = new int[8];
  
  public void thread616(int [] tdone, int [] ends){
        S141=1;
    if(armDestM.getprestatus()){//sysj\controller.sysj line: 97, column: 13
      S138=0;
      System.out.println("Move mode");//sysj\controller.sysj line: 101, column: 7
      armDest.setPresent();//sysj\controller.sysj line: 102, column: 7
      currsigs.addElement(armDest);
      active[7]=1;
      ends[7]=1;
      tdone[7]=1;
    }
    else {
      S141=0;
      active[7]=0;
      ends[7]=0;
      tdone[7]=1;
    }
  }

  public void thread615(int [] tdone, int [] ends){
        S128=1;
    if(vacOnM.getprestatus()){//sysj\controller.sysj line: 86, column: 13
      S125=0;
      System.out.println("Vac on mode");//sysj\controller.sysj line: 89, column: 6
      vacOn.setPresent();//sysj\controller.sysj line: 90, column: 6
      currsigs.addElement(vacOn);
      active[6]=1;
      ends[6]=1;
      tdone[6]=1;
    }
    else {
      S128=0;
      active[6]=0;
      ends[6]=0;
      tdone[6]=1;
    }
  }

  public void thread614(int [] tdone, int [] ends){
        S116=1;
    if(armSourceM.getprestatus()){//sysj\controller.sysj line: 76, column: 13
      S113=0;
      System.out.println("Arm mode");//sysj\controller.sysj line: 78, column: 6
      armSource.setPresent();//sysj\controller.sysj line: 79, column: 6
      currsigs.addElement(armSource);
      active[5]=1;
      ends[5]=1;
      tdone[5]=1;
    }
    else {
      S116=0;
      active[5]=0;
      ends[5]=0;
      tdone[5]=1;
    }
  }

  public void thread613(int [] tdone, int [] ends){
        S104=1;
    if(pusherExtendM.getprestatus()){//sysj\controller.sysj line: 61, column: 13
      S91=0;
      active[4]=1;
      ends[4]=1;
      tdone[4]=1;
    }
    else {
      S104=0;
      active[4]=0;
      ends[4]=0;
      tdone[4]=1;
    }
  }

  public void thread611(int [] tdone, int [] ends){
        switch(S141){
      case 0 : 
        active[7]=0;
        ends[7]=0;
        tdone[7]=1;
        break;
      
      case 1 : 
        switch(S138){
          case 0 : 
            if(!armDestM.getprestatus()){//sysj\controller.sysj line: 99, column: 11
              S138=1;
              active[7]=1;
              ends[7]=1;
              tdone[7]=1;
            }
            else {
              if(armAtDest.getprestatus()){//sysj\controller.sysj line: 100, column: 12
                S138=1;
                active[7]=1;
                ends[7]=1;
                tdone[7]=1;
              }
              else {
                armDest.setPresent();//sysj\controller.sysj line: 102, column: 7
                currsigs.addElement(armDest);
                active[7]=1;
                ends[7]=1;
                tdone[7]=1;
              }
            }
            break;
          
          case 1 : 
            S138=1;
            S141=0;
            active[7]=0;
            ends[7]=0;
            tdone[7]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread610(int [] tdone, int [] ends){
        switch(S128){
      case 0 : 
        active[6]=0;
        ends[6]=0;
        tdone[6]=1;
        break;
      
      case 1 : 
        switch(S125){
          case 0 : 
            if(!vacOnM.getprestatus()){//sysj\controller.sysj line: 88, column: 11
              S125=1;
              active[6]=1;
              ends[6]=1;
              tdone[6]=1;
            }
            else {
              vacOn.setPresent();//sysj\controller.sysj line: 90, column: 6
              currsigs.addElement(vacOn);
              active[6]=1;
              ends[6]=1;
              tdone[6]=1;
            }
            break;
          
          case 1 : 
            S125=1;
            S128=0;
            active[6]=0;
            ends[6]=0;
            tdone[6]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread609(int [] tdone, int [] ends){
        switch(S116){
      case 0 : 
        active[5]=0;
        ends[5]=0;
        tdone[5]=1;
        break;
      
      case 1 : 
        switch(S113){
          case 0 : 
            if(!armSourceM.getprestatus()){//sysj\controller.sysj line: 77, column: 11
              S113=1;
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            else {
              armSource.setPresent();//sysj\controller.sysj line: 79, column: 6
              currsigs.addElement(armSource);
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            break;
          
          case 1 : 
            S113=1;
            S116=0;
            active[5]=0;
            ends[5]=0;
            tdone[5]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread608(int [] tdone, int [] ends){
        switch(S104){
      case 0 : 
        active[4]=0;
        ends[4]=0;
        tdone[4]=1;
        break;
      
      case 1 : 
        switch(S91){
          case 0 : 
            S91=0;
            System.out.println("Pusher mode");//sysj\controller.sysj line: 63, column: 5
            S91=1;
            if(!pusherExtendM.getprestatus()){//sysj\controller.sysj line: 66, column: 21
              S104=0;
              active[4]=0;
              ends[4]=0;
              tdone[4]=1;
            }
            else {
              if(pusherExtended.getprestatus()){//sysj\controller.sysj line: 67, column: 23
                S104=0;
                active[4]=0;
                ends[4]=0;
                tdone[4]=1;
              }
              else {
                pusherExtend.setPresent();//sysj\controller.sysj line: 68, column: 7
                currsigs.addElement(pusherExtend);
                active[4]=1;
                ends[4]=1;
                tdone[4]=1;
              }
            }
            break;
          
          case 1 : 
            if(!pusherExtendM.getprestatus()){//sysj\controller.sysj line: 66, column: 21
              S104=0;
              active[4]=0;
              ends[4]=0;
              tdone[4]=1;
            }
            else {
              if(pusherExtended.getprestatus()){//sysj\controller.sysj line: 67, column: 23
                S104=0;
                active[4]=0;
                ends[4]=0;
                tdone[4]=1;
              }
              else {
                pusherExtend.setPresent();//sysj\controller.sysj line: 68, column: 7
                currsigs.addElement(pusherExtend);
                active[4]=1;
                ends[4]=1;
                tdone[4]=1;
              }
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread606(int [] tdone, int [] ends){
        switch(S31){
      case 0 : 
        active[3]=0;
        ends[3]=0;
        tdone[3]=1;
        break;
      
      case 1 : 
        vacOn.setPresent();//sysj\controller.sysj line: 51, column: 29
        currsigs.addElement(vacOn);
        active[3]=1;
        ends[3]=1;
        tdone[3]=1;
        break;
      
    }
  }

  public void thread605(int [] tdone, int [] ends){
        switch(S26){
      case 0 : 
        active[2]=0;
        ends[2]=0;
        tdone[2]=1;
        break;
      
      case 1 : 
        armDest.setPresent();//sysj\controller.sysj line: 51, column: 7
        currsigs.addElement(armDest);
        active[2]=1;
        ends[2]=1;
        tdone[2]=1;
        break;
      
    }
  }

  public void thread603(int [] tdone, int [] ends){
        S31=1;
    vacOn.setPresent();//sysj\controller.sysj line: 51, column: 29
    currsigs.addElement(vacOn);
    active[3]=1;
    ends[3]=1;
    tdone[3]=1;
  }

  public void thread602(int [] tdone, int [] ends){
        S26=1;
    armDest.setPresent();//sysj\controller.sysj line: 51, column: 7
    currsigs.addElement(armDest);
    active[2]=1;
    ends[2]=1;
    tdone[2]=1;
  }

  public void thread600(int [] tdone, int [] ends){
        S141=1;
    if(armDestM.getprestatus()){//sysj\controller.sysj line: 97, column: 13
      S138=0;
      System.out.println("Move mode");//sysj\controller.sysj line: 101, column: 7
      armDest.setPresent();//sysj\controller.sysj line: 102, column: 7
      currsigs.addElement(armDest);
      active[7]=1;
      ends[7]=1;
      tdone[7]=1;
    }
    else {
      S141=0;
      active[7]=0;
      ends[7]=0;
      tdone[7]=1;
    }
  }

  public void thread599(int [] tdone, int [] ends){
        S128=1;
    if(vacOnM.getprestatus()){//sysj\controller.sysj line: 86, column: 13
      S125=0;
      System.out.println("Vac on mode");//sysj\controller.sysj line: 89, column: 6
      vacOn.setPresent();//sysj\controller.sysj line: 90, column: 6
      currsigs.addElement(vacOn);
      active[6]=1;
      ends[6]=1;
      tdone[6]=1;
    }
    else {
      S128=0;
      active[6]=0;
      ends[6]=0;
      tdone[6]=1;
    }
  }

  public void thread598(int [] tdone, int [] ends){
        S116=1;
    if(armSourceM.getprestatus()){//sysj\controller.sysj line: 76, column: 13
      S113=0;
      System.out.println("Arm mode");//sysj\controller.sysj line: 78, column: 6
      armSource.setPresent();//sysj\controller.sysj line: 79, column: 6
      currsigs.addElement(armSource);
      active[5]=1;
      ends[5]=1;
      tdone[5]=1;
    }
    else {
      S116=0;
      active[5]=0;
      ends[5]=0;
      tdone[5]=1;
    }
  }

  public void thread597(int [] tdone, int [] ends){
        S104=1;
    if(pusherExtendM.getprestatus()){//sysj\controller.sysj line: 61, column: 13
      S91=0;
      active[4]=1;
      ends[4]=1;
      tdone[4]=1;
    }
    else {
      S104=0;
      active[4]=0;
      ends[4]=0;
      tdone[4]=1;
    }
  }

  public void runClockDomain(){
    for(int i=0;i<ends.length;i++){
      ends[i] = 0;
      tdone[i] = 0;
    }
    
    RUN: while(true){
      switch(S595){
        case 0 : 
          S595=0;
          break RUN;
        
        case 1 : 
          S595=2;
          S595=2;
          S197=0;
          if(mode.getprestatus()){//sysj\controller.sysj line: 24, column: 10
            if((mode.getpreval() == null ? null : ((Integer)mode.getpreval())) == 0){//sysj\controller.sysj line: 25, column: 7
              S195=0;
              System.out.println("Automatic state");//sysj\controller.sysj line: 26, column: 4
              if(!empty.getprestatus()){//sysj\controller.sysj line: 27, column: 13
                S5=0;
                if(pusherRetracted.getprestatus()){//sysj\controller.sysj line: 30, column: 13
                  pusherExtend.setPresent();//sysj\controller.sysj line: 32, column: 7
                  currsigs.addElement(pusherExtend);
                  active[1]=1;
                  ends[1]=1;
                  break RUN;
                }
                else {
                  S5=1;
                  active[1]=1;
                  ends[1]=1;
                  break RUN;
                }
              }
              else {
                S197=1;
                active[1]=1;
                ends[1]=1;
                break RUN;
              }
            }
            else {
              S195=1;
              if((mode.getpreval() == null ? null : ((Integer)mode.getpreval())) == 1){//sysj\controller.sysj line: 57, column: 14
                System.out.println("Manual mode");//sysj\controller.sysj line: 58, column: 4
                thread597(tdone,ends);
                thread598(tdone,ends);
                thread599(tdone,ends);
                thread600(tdone,ends);
                int biggest601 = 0;
                if(ends[4]>=biggest601){
                  biggest601=ends[4];
                }
                if(ends[5]>=biggest601){
                  biggest601=ends[5];
                }
                if(ends[6]>=biggest601){
                  biggest601=ends[6];
                }
                if(ends[7]>=biggest601){
                  biggest601=ends[7];
                }
                if(biggest601 == 1){
                  active[1]=1;
                  ends[1]=1;
                  break RUN;
                }
                //FINXME code
                if(biggest601 == 0){
                  S197=1;
                  active[1]=1;
                  ends[1]=1;
                  break RUN;
                }
              }
              else {
                S197=1;
                active[1]=1;
                ends[1]=1;
                break RUN;
              }
            }
          }
          else {
            S197=1;
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
        
        case 2 : 
          switch(S197){
            case 0 : 
              switch(S195){
                case 0 : 
                  switch(S5){
                    case 0 : 
                      if(pusherExtended.getprestatus()){//sysj\controller.sysj line: 31, column: 12
                        S5=1;
                        active[1]=1;
                        ends[1]=1;
                        break RUN;
                      }
                      else {
                        pusherExtend.setPresent();//sysj\controller.sysj line: 32, column: 7
                        currsigs.addElement(pusherExtend);
                        active[1]=1;
                        ends[1]=1;
                        break RUN;
                      }
                    
                    case 1 : 
                      S5=1;
                      S5=2;
                      armSource.setPresent();//sysj\controller.sysj line: 39, column: 6
                      currsigs.addElement(armSource);
                      active[1]=1;
                      ends[1]=1;
                      break RUN;
                    
                    case 2 : 
                      if(armAtSource.getprestatus()){//sysj\controller.sysj line: 38, column: 11
                        S5=3;
                        active[1]=1;
                        ends[1]=1;
                        break RUN;
                      }
                      else {
                        armSource.setPresent();//sysj\controller.sysj line: 39, column: 6
                        currsigs.addElement(armSource);
                        active[1]=1;
                        ends[1]=1;
                        break RUN;
                      }
                    
                    case 3 : 
                      S5=3;
                      S5=4;
                      vacOn.setPresent();//sysj\controller.sysj line: 45, column: 6
                      currsigs.addElement(vacOn);
                      active[1]=1;
                      ends[1]=1;
                      break RUN;
                    
                    case 4 : 
                      if(WPgripped.getprestatus()){//sysj\controller.sysj line: 44, column: 11
                        S5=5;
                        active[1]=1;
                        ends[1]=1;
                        break RUN;
                      }
                      else {
                        vacOn.setPresent();//sysj\controller.sysj line: 45, column: 6
                        currsigs.addElement(vacOn);
                        active[1]=1;
                        ends[1]=1;
                        break RUN;
                      }
                    
                    case 5 : 
                      S5=5;
                      S5=6;
                      thread602(tdone,ends);
                      thread603(tdone,ends);
                      int biggest604 = 0;
                      if(ends[2]>=biggest604){
                        biggest604=ends[2];
                      }
                      if(ends[3]>=biggest604){
                        biggest604=ends[3];
                      }
                      if(biggest604 == 1){
                        active[1]=1;
                        ends[1]=1;
                        break RUN;
                      }
                    
                    case 6 : 
                      if(armAtDest.getprestatus()){//sysj\controller.sysj line: 50, column: 12
                        S5=7;
                        active[1]=1;
                        ends[1]=1;
                        break RUN;
                      }
                      else {
                        thread605(tdone,ends);
                        thread606(tdone,ends);
                        int biggest607 = 0;
                        if(ends[2]>=biggest607){
                          biggest607=ends[2];
                        }
                        if(ends[3]>=biggest607){
                          biggest607=ends[3];
                        }
                        if(biggest607 == 1){
                          active[1]=1;
                          ends[1]=1;
                          break RUN;
                        }
                        //FINXME code
                        if(biggest607 == 0){
                          S5=7;
                          active[1]=1;
                          ends[1]=1;
                          break RUN;
                        }
                      }
                    
                    case 7 : 
                      S5=7;
                      S197=1;
                      active[1]=1;
                      ends[1]=1;
                      break RUN;
                    
                  }
                  break;
                
                case 1 : 
                  thread608(tdone,ends);
                  thread609(tdone,ends);
                  thread610(tdone,ends);
                  thread611(tdone,ends);
                  int biggest612 = 0;
                  if(ends[4]>=biggest612){
                    biggest612=ends[4];
                  }
                  if(ends[5]>=biggest612){
                    biggest612=ends[5];
                  }
                  if(ends[6]>=biggest612){
                    biggest612=ends[6];
                  }
                  if(ends[7]>=biggest612){
                    biggest612=ends[7];
                  }
                  if(biggest612 == 1){
                    active[1]=1;
                    ends[1]=1;
                    break RUN;
                  }
                  //FINXME code
                  if(biggest612 == 0){
                    S197=1;
                    active[1]=1;
                    ends[1]=1;
                    break RUN;
                  }
                
              }
              break;
            
            case 1 : 
              S197=1;
              S197=0;
              if(mode.getprestatus()){//sysj\controller.sysj line: 24, column: 10
                if((mode.getpreval() == null ? null : ((Integer)mode.getpreval())) == 0){//sysj\controller.sysj line: 25, column: 7
                  S195=0;
                  System.out.println("Automatic state");//sysj\controller.sysj line: 26, column: 4
                  if(!empty.getprestatus()){//sysj\controller.sysj line: 27, column: 13
                    S5=0;
                    if(pusherRetracted.getprestatus()){//sysj\controller.sysj line: 30, column: 13
                      pusherExtend.setPresent();//sysj\controller.sysj line: 32, column: 7
                      currsigs.addElement(pusherExtend);
                      active[1]=1;
                      ends[1]=1;
                      break RUN;
                    }
                    else {
                      S5=1;
                      active[1]=1;
                      ends[1]=1;
                      break RUN;
                    }
                  }
                  else {
                    S197=1;
                    active[1]=1;
                    ends[1]=1;
                    break RUN;
                  }
                }
                else {
                  S195=1;
                  if((mode.getpreval() == null ? null : ((Integer)mode.getpreval())) == 1){//sysj\controller.sysj line: 57, column: 14
                    System.out.println("Manual mode");//sysj\controller.sysj line: 58, column: 4
                    thread613(tdone,ends);
                    thread614(tdone,ends);
                    thread615(tdone,ends);
                    thread616(tdone,ends);
                    int biggest617 = 0;
                    if(ends[4]>=biggest617){
                      biggest617=ends[4];
                    }
                    if(ends[5]>=biggest617){
                      biggest617=ends[5];
                    }
                    if(ends[6]>=biggest617){
                      biggest617=ends[6];
                    }
                    if(ends[7]>=biggest617){
                      biggest617=ends[7];
                    }
                    if(biggest617 == 1){
                      active[1]=1;
                      ends[1]=1;
                      break RUN;
                    }
                    //FINXME code
                    if(biggest617 == 0){
                      S197=1;
                      active[1]=1;
                      ends[1]=1;
                      break RUN;
                    }
                  }
                  else {
                    S197=1;
                    active[1]=1;
                    ends[1]=1;
                    break RUN;
                  }
                }
              }
              else {
                S197=1;
                active[1]=1;
                ends[1]=1;
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
      if(paused[1]!=0 || suspended[1]!=0 || active[1]!=1);
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
      if(active[1] == 0){
      	this.terminated = true;
      }
      if(!threaded) break;
    }
  }
}
