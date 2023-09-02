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
  private int S165 = 1;
  private int S99 = 1;
  private int S76 = 1;
  
  private int[] ends = new int[4];
  private int[] tdone = new int[4];
  
  public void runClockDomain(){
    for(int i=0;i<ends.length;i++){
      ends[i] = 0;
      tdone[i] = 0;
    }
    
    RUN: while(true){
      switch(S165){
        case 0 : 
          S165=0;
          break RUN;
        
        case 1 : 
          S165=2;
          S165=2;
          S99=0;
          if(bottleAtPos2.getprestatus()){//sysj\controller.sysj line: 96, column: 11
            if(fillerReq.getprestatus()){//sysj\controller.sysj line: 97, column: 12
              if(selectCanister.getprestatus()){//sysj\controller.sysj line: 98, column: 13
                if(percentLiquid.getprestatus()){//sysj\controller.sysj line: 99, column: 15
                  if(selectCanister.getprestatus()){//sysj\controller.sysj line: 103, column: 11
                    if((selectCanister.getpreval() == null ? null : ((Integer)selectCanister.getpreval())) == (currentlySelectedCanister.getpreval() == null ? null : ((Integer)currentlySelectedCanister.getpreval()))){//sysj\controller.sysj line: 104, column: 8
                      System.out.println("Canister match");//sysj\controller.sysj line: 106, column: 5
                      S76=0;
                      dosUnitValveRetract.setPresent();//sysj\controller.sysj line: 108, column: 7
                      currsigs.addElement(dosUnitValveRetract);
                      active[3]=1;
                      ends[3]=1;
                      break RUN;
                    }
                    else {
                      S99=1;
                      active[3]=1;
                      ends[3]=1;
                      break RUN;
                    }
                  }
                  else {
                    S99=1;
                    active[3]=1;
                    ends[3]=1;
                    break RUN;
                  }
                }
                else {
                  S99=1;
                  active[3]=1;
                  ends[3]=1;
                  break RUN;
                }
              }
              else {
                S99=1;
                active[3]=1;
                ends[3]=1;
                break RUN;
              }
            }
            else {
              S99=1;
              active[3]=1;
              ends[3]=1;
              break RUN;
            }
          }
          else {
            S99=1;
            active[3]=1;
            ends[3]=1;
            break RUN;
          }
        
        case 2 : 
          switch(S99){
            case 0 : 
              switch(S76){
                case 0 : 
                  if(!dosUnitEvac.getprestatus()){//sysj\controller.sysj line: 107, column: 12
                    System.out.println("Canister above bottle");//sysj\controller.sysj line: 110, column: 6
                    S76=1;
                    active[3]=1;
                    ends[3]=1;
                    break RUN;
                  }
                  else {
                    dosUnitValveRetract.setPresent();//sysj\controller.sysj line: 108, column: 7
                    currsigs.addElement(dosUnitValveRetract);
                    active[3]=1;
                    ends[3]=1;
                    break RUN;
                  }
                
                case 1 : 
                  S76=1;
                  S76=2;
                  valveInletOnOff.setPresent();//sysj\controller.sysj line: 114, column: 7
                  currsigs.addElement(valveInletOnOff);
                  active[3]=1;
                  ends[3]=1;
                  break RUN;
                
                case 2 : 
                  if(dosUnitFilled.getprestatus()){//sysj\controller.sysj line: 113, column: 12
                    System.out.println("Bottle controller filled");//sysj\controller.sysj line: 116, column: 6
                    S76=3;
                    dosUnitValveExtend.setPresent();//sysj\controller.sysj line: 119, column: 7
                    currsigs.addElement(dosUnitValveExtend);
                    active[3]=1;
                    ends[3]=1;
                    break RUN;
                  }
                  else {
                    valveInletOnOff.setPresent();//sysj\controller.sysj line: 114, column: 7
                    currsigs.addElement(valveInletOnOff);
                    active[3]=1;
                    ends[3]=1;
                    break RUN;
                  }
                
                case 3 : 
                  if(dosUnitEvac.getprestatus()){//sysj\controller.sysj line: 118, column: 12
                    System.out.println("Canister returned");//sysj\controller.sysj line: 121, column: 6
                    S99=1;
                    active[3]=1;
                    ends[3]=1;
                    break RUN;
                  }
                  else {
                    dosUnitValveExtend.setPresent();//sysj\controller.sysj line: 119, column: 7
                    currsigs.addElement(dosUnitValveExtend);
                    active[3]=1;
                    ends[3]=1;
                    break RUN;
                  }
                
              }
              break;
            
            case 1 : 
              S99=1;
              S99=0;
              if(bottleAtPos2.getprestatus()){//sysj\controller.sysj line: 96, column: 11
                if(fillerReq.getprestatus()){//sysj\controller.sysj line: 97, column: 12
                  if(selectCanister.getprestatus()){//sysj\controller.sysj line: 98, column: 13
                    if(percentLiquid.getprestatus()){//sysj\controller.sysj line: 99, column: 15
                      if(selectCanister.getprestatus()){//sysj\controller.sysj line: 103, column: 11
                        if((selectCanister.getpreval() == null ? null : ((Integer)selectCanister.getpreval())) == (currentlySelectedCanister.getpreval() == null ? null : ((Integer)currentlySelectedCanister.getpreval()))){//sysj\controller.sysj line: 104, column: 8
                          System.out.println("Canister match");//sysj\controller.sysj line: 106, column: 5
                          S76=0;
                          dosUnitValveRetract.setPresent();//sysj\controller.sysj line: 108, column: 7
                          currsigs.addElement(dosUnitValveRetract);
                          active[3]=1;
                          ends[3]=1;
                          break RUN;
                        }
                        else {
                          S99=1;
                          active[3]=1;
                          ends[3]=1;
                          break RUN;
                        }
                      }
                      else {
                        S99=1;
                        active[3]=1;
                        ends[3]=1;
                        break RUN;
                      }
                    }
                    else {
                      S99=1;
                      active[3]=1;
                      ends[3]=1;
                      break RUN;
                    }
                  }
                  else {
                    S99=1;
                    active[3]=1;
                    ends[3]=1;
                    break RUN;
                  }
                }
                else {
                  S99=1;
                  active[3]=1;
                  ends[3]=1;
                  break RUN;
                }
              }
              else {
                S99=1;
                active[3]=1;
                ends[3]=1;
                break RUN;
              }
            
          }
        
      }
    }
  }

  public void init(){
    char [] active1 = {1, 1, 1, 1};
    char [] paused1 = {0, 0, 0, 0};
    char [] suspended1 = {0, 0, 0, 0};
    paused = paused1;
    active = active1;
    suspended = suspended1;
    // Now instantiate all the local signals ONLY
    // --------------------------------------------------
  }
  
  public void run(){
    while(active[3] != 0){
      int index = 3;
      if(paused[index]==1 || suspended[index]==1 || active[index] == 0){
        for(int h=1;h<paused.length;++h){
          paused[h]=0;
        }
      }
      if(paused[3]!=0 || suspended[3]!=0 || active[3]!=1);
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
      if(paused[3]!=0 || suspended[3]!=0 || active[3]!=1);
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
      if(active[3] == 0){
      	this.terminated = true;
      }
      if(!threaded) break;
    }
  }
}
