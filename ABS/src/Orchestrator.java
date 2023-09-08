import java.util.*;
import com.systemj.ClockDomain;
import com.systemj.Signal;
import com.systemj.input_Channel;
import com.systemj.output_Channel;
import java.util.ArrayList;//sysj\orchestrator.sysj line: 1, column: 1

public class Orchestrator extends ClockDomain{
  public Orchestrator(String name){super(name);}
  Vector currsigs = new Vector();
  private boolean df = false;
  private char [] active;
  private char [] paused;
  private char [] suspended;
  public Signal recOrderStatus = new Signal("recOrderStatus", Signal.INPUT);
  public Signal order = new Signal("order", Signal.INPUT);
  public Signal orderStatus = new Signal("orderStatus", Signal.OUTPUT);
  public input_Channel conveyorStatus_in = new input_Channel();
  public input_Channel capperStatus_in = new input_Channel();
  public input_Channel capLoaderStatus_in = new input_Channel();
  public input_Channel fillerStatus_in = new input_Channel();
  public input_Channel rotaryStatus_in = new input_Channel();
  public output_Channel conveyorReq_o = new output_Channel();
  public output_Channel allOperationsFinished_o = new output_Channel();
  public output_Channel fillerReq_o = new output_Channel();
  public output_Channel capperReq_o = new output_Channel();
  public output_Channel capLoaderReq_o = new output_Channel();
  public output_Channel percentLiquid_o = new output_Channel();
  private Signal getNextBottle_1;
  private Signal newOrderFound_1;
  private Signal startOrder_1;
  private Signal orderIsDone_1;
  private ArrayList fifoQueue_thread_1;//sysj\orchestrator.sysj line: 24, column: 3
  private int quantity_thread_1;//sysj\orchestrator.sysj line: 25, column: 3
  private ArrayList liquidPercent_thread_1;//sysj\orchestrator.sysj line: 26, column: 3
  private Order currentOrder_thread_1;//sysj\orchestrator.sysj line: 27, column: 3
  private Order newOrder_thread_1;//sysj\orchestrator.sysj line: 34, column: 6
  private int S118236 = 1;
  private int S117970 = 1;
  
  private int[] ends = new int[2];
  private int[] tdone = new int[2];
  
  public void runClockDomain(){
    for(int i=0;i<ends.length;i++){
      ends[i] = 0;
      tdone[i] = 0;
    }
    
    RUN: while(true){
      switch(S118236){
        case 0 : 
          S118236=0;
          break RUN;
        
        case 1 : 
          S118236=2;
          S118236=2;
          getNextBottle_1.setClear();//sysj\orchestrator.sysj line: 19, column: 2
          newOrderFound_1.setClear();//sysj\orchestrator.sysj line: 20, column: 2
          startOrder_1.setClear();//sysj\orchestrator.sysj line: 21, column: 2
          orderIsDone_1.setClear();//sysj\orchestrator.sysj line: 22, column: 2
          fifoQueue_thread_1 = new ArrayList();//sysj\orchestrator.sysj line: 24, column: 3
          quantity_thread_1 = 0;//sysj\orchestrator.sysj line: 25, column: 3
          liquidPercent_thread_1 = new ArrayList();//sysj\orchestrator.sysj line: 26, column: 3
          currentOrder_thread_1 = null;//sysj\orchestrator.sysj line: 27, column: 3
          System.out.println("awaiting order");//sysj\orchestrator.sysj line: 31, column: 5
          S117970=0;
          if(order.getprestatus()){//sysj\orchestrator.sysj line: 32, column: 13
            System.out.println("got order!");//sysj\orchestrator.sysj line: 33, column: 6
            newOrder_thread_1 = (order.getpreval() == null ? null : ((Order)order.getpreval()));//sysj\orchestrator.sysj line: 34, column: 6
            System.out.println(newOrder_thread_1.getQuantity());//sysj\orchestrator.sysj line: 35, column: 6
            fifoQueue_thread_1.add(newOrder_thread_1);//sysj\orchestrator.sysj line: 37, column: 6
            if(currentOrder_thread_1 == null){//sysj\orchestrator.sysj line: 39, column: 9
              System.out.println("start of ABS get first item");//sysj\orchestrator.sysj line: 40, column: 7
              currentOrder_thread_1 = (Order)fifoQueue_thread_1.get(0);//sysj\orchestrator.sysj line: 41, column: 7
              fifoQueue_thread_1.remove(0);//sysj\orchestrator.sysj line: 42, column: 7
              System.out.println(newOrder_thread_1.getCustomerID());//sysj\orchestrator.sysj line: 43, column: 7
              currentOrder_thread_1.setOrderStatus("Started");//sysj\orchestrator.sysj line: 46, column: 7
              System.out.println("emitting orderstatus: started");//sysj\orchestrator.sysj line: 47, column: 7
              orderStatus.setPresent();//sysj\orchestrator.sysj line: 50, column: 8
              currsigs.addElement(orderStatus);
              orderStatus.setValue(currentOrder_thread_1);//sysj\orchestrator.sysj line: 50, column: 8
              active[1]=1;
              ends[1]=1;
              break RUN;
            }
            else {
              if(orderIsDone_1.getprestatus()){//sysj\orchestrator.sysj line: 58, column: 15
                System.out.println("initialising next order...");//sysj\orchestrator.sysj line: 65, column: 8
                currentOrder_thread_1 = (Order)fifoQueue_thread_1.get(0);//sysj\orchestrator.sysj line: 66, column: 8
                fifoQueue_thread_1.remove(0);//sysj\orchestrator.sysj line: 67, column: 8
                startOrder_1.setPresent();//sysj\orchestrator.sysj line: 70, column: 9
                currsigs.addElement(startOrder_1);
                S117970=1;
                active[1]=1;
                ends[1]=1;
                break RUN;
              }
              else {
                S117970=1;
                active[1]=1;
                ends[1]=1;
                break RUN;
              }
            }
          }
          else {
            S117970=1;
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
        
        case 2 : 
          getNextBottle_1.setClear();//sysj\orchestrator.sysj line: 19, column: 2
          newOrderFound_1.setClear();//sysj\orchestrator.sysj line: 20, column: 2
          startOrder_1.setClear();//sysj\orchestrator.sysj line: 21, column: 2
          orderIsDone_1.setClear();//sysj\orchestrator.sysj line: 22, column: 2
          switch(S117970){
            case 0 : 
              if(recOrderStatus.getprestatus()){//sysj\orchestrator.sysj line: 49, column: 13
                System.out.println("orch received: recOrderStatus");//sysj\orchestrator.sysj line: 53, column: 7
                startOrder_1.setPresent();//sysj\orchestrator.sysj line: 55, column: 8
                currsigs.addElement(startOrder_1);
                S117970=1;
                active[1]=1;
                ends[1]=1;
                break RUN;
              }
              else {
                orderStatus.setPresent();//sysj\orchestrator.sysj line: 50, column: 8
                currsigs.addElement(orderStatus);
                orderStatus.setValue(currentOrder_thread_1);//sysj\orchestrator.sysj line: 50, column: 8
                active[1]=1;
                ends[1]=1;
                break RUN;
              }
            
            case 1 : 
              S117970=1;
              System.out.println("awaiting order");//sysj\orchestrator.sysj line: 31, column: 5
              S117970=0;
              if(order.getprestatus()){//sysj\orchestrator.sysj line: 32, column: 13
                System.out.println("got order!");//sysj\orchestrator.sysj line: 33, column: 6
                newOrder_thread_1 = (order.getpreval() == null ? null : ((Order)order.getpreval()));//sysj\orchestrator.sysj line: 34, column: 6
                System.out.println(newOrder_thread_1.getQuantity());//sysj\orchestrator.sysj line: 35, column: 6
                fifoQueue_thread_1.add(newOrder_thread_1);//sysj\orchestrator.sysj line: 37, column: 6
                if(currentOrder_thread_1 == null){//sysj\orchestrator.sysj line: 39, column: 9
                  System.out.println("start of ABS get first item");//sysj\orchestrator.sysj line: 40, column: 7
                  currentOrder_thread_1 = (Order)fifoQueue_thread_1.get(0);//sysj\orchestrator.sysj line: 41, column: 7
                  fifoQueue_thread_1.remove(0);//sysj\orchestrator.sysj line: 42, column: 7
                  System.out.println(newOrder_thread_1.getCustomerID());//sysj\orchestrator.sysj line: 43, column: 7
                  currentOrder_thread_1.setOrderStatus("Started");//sysj\orchestrator.sysj line: 46, column: 7
                  System.out.println("emitting orderstatus: started");//sysj\orchestrator.sysj line: 47, column: 7
                  orderStatus.setPresent();//sysj\orchestrator.sysj line: 50, column: 8
                  currsigs.addElement(orderStatus);
                  orderStatus.setValue(currentOrder_thread_1);//sysj\orchestrator.sysj line: 50, column: 8
                  active[1]=1;
                  ends[1]=1;
                  break RUN;
                }
                else {
                  if(orderIsDone_1.getprestatus()){//sysj\orchestrator.sysj line: 58, column: 15
                    System.out.println("initialising next order...");//sysj\orchestrator.sysj line: 65, column: 8
                    currentOrder_thread_1 = (Order)fifoQueue_thread_1.get(0);//sysj\orchestrator.sysj line: 66, column: 8
                    fifoQueue_thread_1.remove(0);//sysj\orchestrator.sysj line: 67, column: 8
                    startOrder_1.setPresent();//sysj\orchestrator.sysj line: 70, column: 9
                    currsigs.addElement(startOrder_1);
                    S117970=1;
                    active[1]=1;
                    ends[1]=1;
                    break RUN;
                  }
                  else {
                    S117970=1;
                    active[1]=1;
                    ends[1]=1;
                    break RUN;
                  }
                }
              }
              else {
                S117970=1;
                active[1]=1;
                ends[1]=1;
                break RUN;
              }
            
          }
        
      }
    }
  }

  public void init(){
    char [] active1 = {1, 1};
    char [] paused1 = {0, 0};
    char [] suspended1 = {0, 0};
    paused = paused1;
    active = active1;
    suspended = suspended1;
    // Now instantiate all the local signals ONLY
    getNextBottle_1 = new Signal();
    newOrderFound_1 = new Signal();
    startOrder_1 = new Signal();
    orderIsDone_1 = new Signal();
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
          conveyorStatus_in.gethook();
          capperStatus_in.gethook();
          capLoaderStatus_in.gethook();
          fillerStatus_in.gethook();
          rotaryStatus_in.gethook();
          conveyorReq_o.gethook();
          allOperationsFinished_o.gethook();
          fillerReq_o.gethook();
          capperReq_o.gethook();
          capLoaderReq_o.gethook();
          percentLiquid_o.gethook();
          recOrderStatus.gethook();
          order.gethook();
          df = true;
        }
        runClockDomain();
      }
      recOrderStatus.setpreclear();
      order.setpreclear();
      orderStatus.setpreclear();
      getNextBottle_1.setpreclear();
      newOrderFound_1.setpreclear();
      startOrder_1.setpreclear();
      orderIsDone_1.setpreclear();
      int dummyint = 0;
      for(int qw=0;qw<currsigs.size();++qw){
        dummyint = ((Signal)currsigs.elementAt(qw)).getStatus() ? ((Signal)currsigs.elementAt(qw)).setprepresent() : ((Signal)currsigs.elementAt(qw)).setpreclear();
        ((Signal)currsigs.elementAt(qw)).setpreval(((Signal)currsigs.elementAt(qw)).getValue());
      }
      currsigs.removeAllElements();
      dummyint = recOrderStatus.getStatus() ? recOrderStatus.setprepresent() : recOrderStatus.setpreclear();
      recOrderStatus.setpreval(recOrderStatus.getValue());
      recOrderStatus.setClear();
      dummyint = order.getStatus() ? order.setprepresent() : order.setpreclear();
      order.setpreval(order.getValue());
      order.setClear();
      orderStatus.sethook();
      orderStatus.setClear();
      getNextBottle_1.setClear();
      newOrderFound_1.setClear();
      startOrder_1.setClear();
      orderIsDone_1.setClear();
      conveyorStatus_in.sethook();
      capperStatus_in.sethook();
      capLoaderStatus_in.sethook();
      fillerStatus_in.sethook();
      rotaryStatus_in.sethook();
      conveyorReq_o.sethook();
      allOperationsFinished_o.sethook();
      fillerReq_o.sethook();
      capperReq_o.sethook();
      capLoaderReq_o.sethook();
      percentLiquid_o.sethook();
      if(paused[1]!=0 || suspended[1]!=0 || active[1]!=1);
      else{
        conveyorStatus_in.gethook();
        capperStatus_in.gethook();
        capLoaderStatus_in.gethook();
        fillerStatus_in.gethook();
        rotaryStatus_in.gethook();
        conveyorReq_o.gethook();
        allOperationsFinished_o.gethook();
        fillerReq_o.gethook();
        capperReq_o.gethook();
        capLoaderReq_o.gethook();
        percentLiquid_o.gethook();
        recOrderStatus.gethook();
        order.gethook();
      }
      runFinisher();
      if(active[1] == 0){
      	this.terminated = true;
      }
      if(!threaded) break;
    }
  }
}
