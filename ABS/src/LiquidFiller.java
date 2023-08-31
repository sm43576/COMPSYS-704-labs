import java.util.*;
import com.systemj.ClockDomain;
import com.systemj.Signal;
import com.systemj.input_Channel;
import com.systemj.output_Channel;

public class LiquidFiller extends ClockDomain{
  public LiquidFiller(String name){super(name);}
  Vector currsigs = new Vector();
  private boolean df = false;
  private char [] active;
  private char [] paused;
  private char [] suspended;
  public Signal fillerReq = new Signal("fillerReq", Signal.INPUT);
  public Signal bottleAtPos2 = new Signal("bottleAtPos2", Signal.INPUT);
  public Signal dosUnitEvac = new Signal("dosUnitEvac", Signal.INPUT);
  public Signal dosUnitFilled = new Signal("dosUnitFilled", Signal.INPUT);
  public Signal selectCanister = new Signal("selectCanister", Signal.INPUT);
  public Signal percentLiquid = new Signal("percentLiquid", Signal.INPUT);
  public Signal currentlySelectedCanister = new Signal("currentlySelectedCanister", Signal.INPUT);
  public Signal valveInjectorOnOff = new Signal("valveInjectorOnOff", Signal.OUTPUT);
  public Signal valveInletOnOff = new Signal("valveInletOnOff", Signal.OUTPUT);
  public Signal dosUnitValveRetract = new Signal("dosUnitValveRetract", Signal.OUTPUT);
  public Signal dosUnitValveExtend = new Signal("dosUnitValveExtend", Signal.OUTPUT);
  private int S135 = 1;
  private int S69 = 1;
  private int S46 = 1;
  
  private int[] ends = new int[3];
  private int[] tdone = new int[3];
  
  public void runClockDomain(){
    for(int i=0;i<ends.length;i++){
      ends[i] = 0;
      tdone[i] = 0;
    }
    
    RUN: while(true){
      switch(S135){
        case 0 : 
          S135=0;
          break RUN;
        
        case 1 : 
          S135=2;
          S135=2;
          S69=0;
          if(bottleAtPos2.getprestatus()){//sysj\controller.sysj line: 75, column: 11
            if(fillerReq.getprestatus()){//sysj\controller.sysj line: 76, column: 12
              if(selectCanister.getprestatus()){//sysj\controller.sysj line: 77, column: 13
                if(percentLiquid.getprestatus()){//sysj\controller.sysj line: 78, column: 15
                  if(selectCanister.getprestatus()){//sysj\controller.sysj line: 82, column: 11
                    if((selectCanister.getpreval() == null ? null : ((Integer)selectCanister.getpreval())) == (currentlySelectedCanister.getpreval() == null ? null : ((Integer)currentlySelectedCanister.getpreval()))){//sysj\controller.sysj line: 83, column: 8
                      System.out.println("Canister match");//sysj\controller.sysj line: 85, column: 5
                      S46=0;
                      dosUnitValveRetract.setPresent();//sysj\controller.sysj line: 87, column: 7
                      currsigs.addElement(dosUnitValveRetract);
                      active[2]=1;
                      ends[2]=1;
                      break RUN;
                    }
                    else {
                      S69=1;
                      active[2]=1;
                      ends[2]=1;
                      break RUN;
                    }
                  }
                  else {
                    S69=1;
                    active[2]=1;
                    ends[2]=1;
                    break RUN;
                  }
                }
                else {
                  S69=1;
                  active[2]=1;
                  ends[2]=1;
                  break RUN;
                }
              }
              else {
                S69=1;
                active[2]=1;
                ends[2]=1;
                break RUN;
              }
            }
            else {
              S69=1;
              active[2]=1;
              ends[2]=1;
              break RUN;
            }
          }
          else {
            S69=1;
            active[2]=1;
            ends[2]=1;
            break RUN;
          }
        
        case 2 : 
          switch(S69){
            case 0 : 
              switch(S46){
                case 0 : 
                  if(!dosUnitEvac.getprestatus()){//sysj\controller.sysj line: 86, column: 12
                    System.out.println("Canister above bottle");//sysj\controller.sysj line: 89, column: 6
                    S46=1;
                    active[2]=1;
                    ends[2]=1;
                    break RUN;
                  }
                  else {
                    dosUnitValveRetract.setPresent();//sysj\controller.sysj line: 87, column: 7
                    currsigs.addElement(dosUnitValveRetract);
                    active[2]=1;
                    ends[2]=1;
                    break RUN;
                  }
                
                case 1 : 
                  S46=1;
                  S46=2;
                  valveInletOnOff.setPresent();//sysj\controller.sysj line: 93, column: 7
                  currsigs.addElement(valveInletOnOff);
                  active[2]=1;
                  ends[2]=1;
                  break RUN;
                
                case 2 : 
                  if(dosUnitFilled.getprestatus()){//sysj\controller.sysj line: 92, column: 12
                    System.out.println("Bottle controller filled");//sysj\controller.sysj line: 95, column: 6
                    S46=3;
                    dosUnitValveExtend.setPresent();//sysj\controller.sysj line: 98, column: 7
                    currsigs.addElement(dosUnitValveExtend);
                    active[2]=1;
                    ends[2]=1;
                    break RUN;
                  }
                  else {
                    valveInletOnOff.setPresent();//sysj\controller.sysj line: 93, column: 7
                    currsigs.addElement(valveInletOnOff);
                    active[2]=1;
                    ends[2]=1;
                    break RUN;
                  }
                
                case 3 : 
                  if(dosUnitEvac.getprestatus()){//sysj\controller.sysj line: 97, column: 12
                    System.out.println("Canister returned");//sysj\controller.sysj line: 100, column: 6
                    S69=1;
                    active[2]=1;
                    ends[2]=1;
                    break RUN;
                  }
                  else {
                    dosUnitValveExtend.setPresent();//sysj\controller.sysj line: 98, column: 7
                    currsigs.addElement(dosUnitValveExtend);
                    active[2]=1;
                    ends[2]=1;
                    break RUN;
                  }
                
              }
              break;
            
            case 1 : 
              S69=1;
              S69=0;
              if(bottleAtPos2.getprestatus()){//sysj\controller.sysj line: 75, column: 11
                if(fillerReq.getprestatus()){//sysj\controller.sysj line: 76, column: 12
                  if(selectCanister.getprestatus()){//sysj\controller.sysj line: 77, column: 13
                    if(percentLiquid.getprestatus()){//sysj\controller.sysj line: 78, column: 15
                      if(selectCanister.getprestatus()){//sysj\controller.sysj line: 82, column: 11
                        if((selectCanister.getpreval() == null ? null : ((Integer)selectCanister.getpreval())) == (currentlySelectedCanister.getpreval() == null ? null : ((Integer)currentlySelectedCanister.getpreval()))){//sysj\controller.sysj line: 83, column: 8
                          System.out.println("Canister match");//sysj\controller.sysj line: 85, column: 5
                          S46=0;
                          dosUnitValveRetract.setPresent();//sysj\controller.sysj line: 87, column: 7
                          currsigs.addElement(dosUnitValveRetract);
                          active[2]=1;
                          ends[2]=1;
                          break RUN;
                        }
                        else {
                          S69=1;
                          active[2]=1;
                          ends[2]=1;
                          break RUN;
                        }
                      }
                      else {
                        S69=1;
                        active[2]=1;
                        ends[2]=1;
                        break RUN;
                      }
                    }
                    else {
                      S69=1;
                      active[2]=1;
                      ends[2]=1;
                      break RUN;
                    }
                  }
                  else {
                    S69=1;
                    active[2]=1;
                    ends[2]=1;
                    break RUN;
                  }
                }
                else {
                  S69=1;
                  active[2]=1;
                  ends[2]=1;
                  break RUN;
                }
              }
              else {
                S69=1;
                active[2]=1;
                ends[2]=1;
                break RUN;
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
          fillerReq.gethook();
          bottleAtPos2.gethook();
          dosUnitEvac.gethook();
          dosUnitFilled.gethook();
          selectCanister.gethook();
          percentLiquid.gethook();
          currentlySelectedCanister.gethook();
          df = true;
        }
        runClockDomain();
      }
      fillerReq.setpreclear();
      bottleAtPos2.setpreclear();
      dosUnitEvac.setpreclear();
      dosUnitFilled.setpreclear();
      selectCanister.setpreclear();
      percentLiquid.setpreclear();
      currentlySelectedCanister.setpreclear();
      valveInjectorOnOff.setpreclear();
      valveInletOnOff.setpreclear();
      dosUnitValveRetract.setpreclear();
      dosUnitValveExtend.setpreclear();
      int dummyint = 0;
      for(int qw=0;qw<currsigs.size();++qw){
        dummyint = ((Signal)currsigs.elementAt(qw)).getStatus() ? ((Signal)currsigs.elementAt(qw)).setprepresent() : ((Signal)currsigs.elementAt(qw)).setpreclear();
        ((Signal)currsigs.elementAt(qw)).setpreval(((Signal)currsigs.elementAt(qw)).getValue());
      }
      currsigs.removeAllElements();
      dummyint = fillerReq.getStatus() ? fillerReq.setprepresent() : fillerReq.setpreclear();
      fillerReq.setpreval(fillerReq.getValue());
      fillerReq.setClear();
      dummyint = bottleAtPos2.getStatus() ? bottleAtPos2.setprepresent() : bottleAtPos2.setpreclear();
      bottleAtPos2.setpreval(bottleAtPos2.getValue());
      bottleAtPos2.setClear();
      dummyint = dosUnitEvac.getStatus() ? dosUnitEvac.setprepresent() : dosUnitEvac.setpreclear();
      dosUnitEvac.setpreval(dosUnitEvac.getValue());
      dosUnitEvac.setClear();
      dummyint = dosUnitFilled.getStatus() ? dosUnitFilled.setprepresent() : dosUnitFilled.setpreclear();
      dosUnitFilled.setpreval(dosUnitFilled.getValue());
      dosUnitFilled.setClear();
      dummyint = selectCanister.getStatus() ? selectCanister.setprepresent() : selectCanister.setpreclear();
      selectCanister.setpreval(selectCanister.getValue());
      selectCanister.setClear();
      dummyint = percentLiquid.getStatus() ? percentLiquid.setprepresent() : percentLiquid.setpreclear();
      percentLiquid.setpreval(percentLiquid.getValue());
      percentLiquid.setClear();
      dummyint = currentlySelectedCanister.getStatus() ? currentlySelectedCanister.setprepresent() : currentlySelectedCanister.setpreclear();
      currentlySelectedCanister.setpreval(currentlySelectedCanister.getValue());
      currentlySelectedCanister.setClear();
      valveInjectorOnOff.sethook();
      valveInjectorOnOff.setClear();
      valveInletOnOff.sethook();
      valveInletOnOff.setClear();
      dosUnitValveRetract.sethook();
      dosUnitValveRetract.setClear();
      dosUnitValveExtend.sethook();
      dosUnitValveExtend.setClear();
      if(paused[2]!=0 || suspended[2]!=0 || active[2]!=1);
      else{
        fillerReq.gethook();
        bottleAtPos2.gethook();
        dosUnitEvac.gethook();
        dosUnitFilled.gethook();
        selectCanister.gethook();
        percentLiquid.gethook();
        currentlySelectedCanister.gethook();
      }
      runFinisher();
      if(active[2] == 0){
      	this.terminated = true;
      }
      if(!threaded) break;
    }
  }
}
