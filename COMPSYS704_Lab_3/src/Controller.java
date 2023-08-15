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
  private int S481 = 1;
  private int S159 = 1;
  private int S157 = 1;
  private int S5 = 1;
  private int S26 = 1;
  private int S31 = 1;
  private int S104 = 1;
  private int S91 = 1;
  private int S116 = 1;
  private int S113 = 1;
  private int S128 = 1;
  private int S125 = 1;
  private int S154 = 1;
  private int S151 = 1;
  private int S133 = 1;
  private int S138 = 1;
  
  private int[] ends = new int[10];
  private int[] tdone = new int[10];
  
  public void thread510(int [] tdone, int [] ends){
        S138=1;
    vacOn.setPresent();//sysj\controller.sysj line: 99, column: 30
    currsigs.addElement(vacOn);
    active[9]=1;
    ends[9]=1;
    tdone[9]=1;
  }

  public void thread509(int [] tdone, int [] ends){
        S133=1;
    armDest.setPresent();//sysj\controller.sysj line: 99, column: 8
    currsigs.addElement(armDest);
    active[8]=1;
    ends[8]=1;
    tdone[8]=1;
  }

  public void thread508(int [] tdone, int [] ends){
        S154=1;
    if(armDestM.getprestatus()){//sysj\controller.sysj line: 95, column: 14
      S151=0;
      System.out.println("Move mode");//sysj\controller.sysj line: 98, column: 7
      thread509(tdone,ends);
      thread510(tdone,ends);
      int biggest511 = 0;
      if(ends[8]>=biggest511){
        biggest511=ends[8];
      }
      if(ends[9]>=biggest511){
        biggest511=ends[9];
      }
      if(biggest511 == 1){
        active[7]=1;
        ends[7]=1;
        tdone[7]=1;
      }
    }
    else {
      S154=0;
      active[7]=0;
      ends[7]=0;
      tdone[7]=1;
    }
  }

  public void thread507(int [] tdone, int [] ends){
        S128=1;
    if(vacOnM.getprestatus()){//sysj\controller.sysj line: 84, column: 14
      S125=0;
      System.out.println("Vac on mode");//sysj\controller.sysj line: 87, column: 7
      vacOn.setPresent();//sysj\controller.sysj line: 88, column: 7
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

  public void thread506(int [] tdone, int [] ends){
        S116=1;
    if(armSourceM.getprestatus()){//sysj\controller.sysj line: 74, column: 14
      S113=0;
      System.out.println("Arm mode");//sysj\controller.sysj line: 76, column: 7
      armSource.setPresent();//sysj\controller.sysj line: 77, column: 7
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

  public void thread505(int [] tdone, int [] ends){
        S104=1;
    if(pusherExtendM.getprestatus()){//sysj\controller.sysj line: 62, column: 14
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

  public void thread502(int [] tdone, int [] ends){
        switch(S138){
      case 0 : 
        active[9]=0;
        ends[9]=0;
        tdone[9]=1;
        break;
      
      case 1 : 
        vacOn.setPresent();//sysj\controller.sysj line: 99, column: 30
        currsigs.addElement(vacOn);
        active[9]=1;
        ends[9]=1;
        tdone[9]=1;
        break;
      
    }
  }

  public void thread501(int [] tdone, int [] ends){
        switch(S133){
      case 0 : 
        active[8]=0;
        ends[8]=0;
        tdone[8]=1;
        break;
      
      case 1 : 
        armDest.setPresent();//sysj\controller.sysj line: 99, column: 8
        currsigs.addElement(armDest);
        active[8]=1;
        ends[8]=1;
        tdone[8]=1;
        break;
      
    }
  }

  public void thread500(int [] tdone, int [] ends){
        switch(S154){
      case 0 : 
        active[7]=0;
        ends[7]=0;
        tdone[7]=1;
        break;
      
      case 1 : 
        switch(S151){
          case 0 : 
            if(armAtDest.getprestatus()){//sysj\controller.sysj line: 97, column: 13
              S151=1;
              active[7]=1;
              ends[7]=1;
              tdone[7]=1;
            }
            else {
              thread501(tdone,ends);
              thread502(tdone,ends);
              int biggest503 = 0;
              if(ends[8]>=biggest503){
                biggest503=ends[8];
              }
              if(ends[9]>=biggest503){
                biggest503=ends[9];
              }
              if(biggest503 == 1){
                active[7]=1;
                ends[7]=1;
                tdone[7]=1;
              }
              //FINXME code
              if(biggest503 == 0){
                S151=1;
                active[7]=1;
                ends[7]=1;
                tdone[7]=1;
              }
            }
            break;
          
          case 1 : 
            S151=1;
            S154=0;
            active[7]=0;
            ends[7]=0;
            tdone[7]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread499(int [] tdone, int [] ends){
        switch(S128){
      case 0 : 
        active[6]=0;
        ends[6]=0;
        tdone[6]=1;
        break;
      
      case 1 : 
        switch(S125){
          case 0 : 
            if(WPgripped.getprestatus()){//sysj\controller.sysj line: 86, column: 12
              S125=1;
              active[6]=1;
              ends[6]=1;
              tdone[6]=1;
            }
            else {
              vacOn.setPresent();//sysj\controller.sysj line: 88, column: 7
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

  public void thread498(int [] tdone, int [] ends){
        switch(S116){
      case 0 : 
        active[5]=0;
        ends[5]=0;
        tdone[5]=1;
        break;
      
      case 1 : 
        switch(S113){
          case 0 : 
            if(armAtSource.getprestatus()){//sysj\controller.sysj line: 75, column: 13
              S113=1;
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            else {
              armSource.setPresent();//sysj\controller.sysj line: 77, column: 7
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

  public void thread497(int [] tdone, int [] ends){
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
            System.out.println("Pusher mode");//sysj\controller.sysj line: 64, column: 6
            S91=1;
            if(pusherRetracted.getprestatus()){//sysj\controller.sysj line: 65, column: 14
              if(pusherExtended.getprestatus()){//sysj\controller.sysj line: 66, column: 24
                S104=0;
                active[4]=0;
                ends[4]=0;
                tdone[4]=1;
              }
              else {
                pusherExtend.setPresent();//sysj\controller.sysj line: 67, column: 8
                currsigs.addElement(pusherExtend);
                active[4]=1;
                ends[4]=1;
                tdone[4]=1;
              }
            }
            else {
              S104=0;
              active[4]=0;
              ends[4]=0;
              tdone[4]=1;
            }
            break;
          
          case 1 : 
            if(pusherExtended.getprestatus()){//sysj\controller.sysj line: 66, column: 24
              S104=0;
              active[4]=0;
              ends[4]=0;
              tdone[4]=1;
            }
            else {
              pusherExtend.setPresent();//sysj\controller.sysj line: 67, column: 8
              currsigs.addElement(pusherExtend);
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread495(int [] tdone, int [] ends){
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

  public void thread494(int [] tdone, int [] ends){
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

  public void thread492(int [] tdone, int [] ends){
        S31=1;
    vacOn.setPresent();//sysj\controller.sysj line: 51, column: 29
    currsigs.addElement(vacOn);
    active[3]=1;
    ends[3]=1;
    tdone[3]=1;
  }

  public void thread491(int [] tdone, int [] ends){
        S26=1;
    armDest.setPresent();//sysj\controller.sysj line: 51, column: 7
    currsigs.addElement(armDest);
    active[2]=1;
    ends[2]=1;
    tdone[2]=1;
  }

  public void thread488(int [] tdone, int [] ends){
        S138=1;
    vacOn.setPresent();//sysj\controller.sysj line: 99, column: 30
    currsigs.addElement(vacOn);
    active[9]=1;
    ends[9]=1;
    tdone[9]=1;
  }

  public void thread487(int [] tdone, int [] ends){
        S133=1;
    armDest.setPresent();//sysj\controller.sysj line: 99, column: 8
    currsigs.addElement(armDest);
    active[8]=1;
    ends[8]=1;
    tdone[8]=1;
  }

  public void thread486(int [] tdone, int [] ends){
        S154=1;
    if(armDestM.getprestatus()){//sysj\controller.sysj line: 95, column: 14
      S151=0;
      System.out.println("Move mode");//sysj\controller.sysj line: 98, column: 7
      thread487(tdone,ends);
      thread488(tdone,ends);
      int biggest489 = 0;
      if(ends[8]>=biggest489){
        biggest489=ends[8];
      }
      if(ends[9]>=biggest489){
        biggest489=ends[9];
      }
      if(biggest489 == 1){
        active[7]=1;
        ends[7]=1;
        tdone[7]=1;
      }
    }
    else {
      S154=0;
      active[7]=0;
      ends[7]=0;
      tdone[7]=1;
    }
  }

  public void thread485(int [] tdone, int [] ends){
        S128=1;
    if(vacOnM.getprestatus()){//sysj\controller.sysj line: 84, column: 14
      S125=0;
      System.out.println("Vac on mode");//sysj\controller.sysj line: 87, column: 7
      vacOn.setPresent();//sysj\controller.sysj line: 88, column: 7
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

  public void thread484(int [] tdone, int [] ends){
        S116=1;
    if(armSourceM.getprestatus()){//sysj\controller.sysj line: 74, column: 14
      S113=0;
      System.out.println("Arm mode");//sysj\controller.sysj line: 76, column: 7
      armSource.setPresent();//sysj\controller.sysj line: 77, column: 7
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

  public void thread483(int [] tdone, int [] ends){
        S104=1;
    if(pusherExtendM.getprestatus()){//sysj\controller.sysj line: 62, column: 14
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
      switch(S481){
        case 0 : 
          S481=0;
          break RUN;
        
        case 1 : 
          S481=2;
          S481=2;
          S159=0;
          if(mode.getprestatus()){//sysj\controller.sysj line: 24, column: 10
            if((mode.getpreval() == null ? null : ((Integer)mode.getpreval())) == 0){//sysj\controller.sysj line: 25, column: 7
              S157=0;
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
                S159=1;
                active[1]=1;
                ends[1]=1;
                break RUN;
              }
            }
            else {
              S157=1;
              if((mode.getpreval() == null ? null : ((Integer)mode.getpreval())) == 1){//sysj\controller.sysj line: 57, column: 14
                if(!empty.getprestatus()){//sysj\controller.sysj line: 60, column: 13
                  thread483(tdone,ends);
                  thread484(tdone,ends);
                  thread485(tdone,ends);
                  thread486(tdone,ends);
                  int biggest490 = 0;
                  if(ends[4]>=biggest490){
                    biggest490=ends[4];
                  }
                  if(ends[5]>=biggest490){
                    biggest490=ends[5];
                  }
                  if(ends[6]>=biggest490){
                    biggest490=ends[6];
                  }
                  if(ends[7]>=biggest490){
                    biggest490=ends[7];
                  }
                  if(biggest490 == 1){
                    active[1]=1;
                    ends[1]=1;
                    break RUN;
                  }
                  //FINXME code
                  if(biggest490 == 0){
                    S159=1;
                    active[1]=1;
                    ends[1]=1;
                    break RUN;
                  }
                }
                else {
                  S159=1;
                  active[1]=1;
                  ends[1]=1;
                  break RUN;
                }
              }
              else {
                S159=1;
                active[1]=1;
                ends[1]=1;
                break RUN;
              }
            }
          }
          else {
            S159=1;
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
        
        case 2 : 
          switch(S159){
            case 0 : 
              switch(S157){
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
                      thread491(tdone,ends);
                      thread492(tdone,ends);
                      int biggest493 = 0;
                      if(ends[2]>=biggest493){
                        biggest493=ends[2];
                      }
                      if(ends[3]>=biggest493){
                        biggest493=ends[3];
                      }
                      if(biggest493 == 1){
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
                        thread494(tdone,ends);
                        thread495(tdone,ends);
                        int biggest496 = 0;
                        if(ends[2]>=biggest496){
                          biggest496=ends[2];
                        }
                        if(ends[3]>=biggest496){
                          biggest496=ends[3];
                        }
                        if(biggest496 == 1){
                          active[1]=1;
                          ends[1]=1;
                          break RUN;
                        }
                        //FINXME code
                        if(biggest496 == 0){
                          S5=7;
                          active[1]=1;
                          ends[1]=1;
                          break RUN;
                        }
                      }
                    
                    case 7 : 
                      S5=7;
                      S159=1;
                      active[1]=1;
                      ends[1]=1;
                      break RUN;
                    
                  }
                  break;
                
                case 1 : 
                  thread497(tdone,ends);
                  thread498(tdone,ends);
                  thread499(tdone,ends);
                  thread500(tdone,ends);
                  int biggest504 = 0;
                  if(ends[4]>=biggest504){
                    biggest504=ends[4];
                  }
                  if(ends[5]>=biggest504){
                    biggest504=ends[5];
                  }
                  if(ends[6]>=biggest504){
                    biggest504=ends[6];
                  }
                  if(ends[7]>=biggest504){
                    biggest504=ends[7];
                  }
                  if(biggest504 == 1){
                    active[1]=1;
                    ends[1]=1;
                    break RUN;
                  }
                  //FINXME code
                  if(biggest504 == 0){
                    S159=1;
                    active[1]=1;
                    ends[1]=1;
                    break RUN;
                  }
                
              }
              break;
            
            case 1 : 
              S159=1;
              S159=0;
              if(mode.getprestatus()){//sysj\controller.sysj line: 24, column: 10
                if((mode.getpreval() == null ? null : ((Integer)mode.getpreval())) == 0){//sysj\controller.sysj line: 25, column: 7
                  S157=0;
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
                    S159=1;
                    active[1]=1;
                    ends[1]=1;
                    break RUN;
                  }
                }
                else {
                  S157=1;
                  if((mode.getpreval() == null ? null : ((Integer)mode.getpreval())) == 1){//sysj\controller.sysj line: 57, column: 14
                    if(!empty.getprestatus()){//sysj\controller.sysj line: 60, column: 13
                      thread505(tdone,ends);
                      thread506(tdone,ends);
                      thread507(tdone,ends);
                      thread508(tdone,ends);
                      int biggest512 = 0;
                      if(ends[4]>=biggest512){
                        biggest512=ends[4];
                      }
                      if(ends[5]>=biggest512){
                        biggest512=ends[5];
                      }
                      if(ends[6]>=biggest512){
                        biggest512=ends[6];
                      }
                      if(ends[7]>=biggest512){
                        biggest512=ends[7];
                      }
                      if(biggest512 == 1){
                        active[1]=1;
                        ends[1]=1;
                        break RUN;
                      }
                      //FINXME code
                      if(biggest512 == 0){
                        S159=1;
                        active[1]=1;
                        ends[1]=1;
                        break RUN;
                      }
                    }
                    else {
                      S159=1;
                      active[1]=1;
                      ends[1]=1;
                      break RUN;
                    }
                  }
                  else {
                    S159=1;
                    active[1]=1;
                    ends[1]=1;
                    break RUN;
                  }
                }
              }
              else {
                S159=1;
                active[1]=1;
                ends[1]=1;
                break RUN;
              }
            
          }
        
      }
    }
  }

  public void init(){
    char [] active1 = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
    char [] paused1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    char [] suspended1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
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
