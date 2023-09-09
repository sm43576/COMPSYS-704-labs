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
  private Signal startOrder_1;
  private Signal orderIsDone_1;
  private Signal initABS_1;
  private Signal foundCurrentOrder_1;
  private Signal currentOrder_1;
  private ArrayList fifoQueue_thread_2;//sysj\orchestrator.sysj line: 29, column: 3
  private ArrayList liquidPercent_thread_2;//sysj\orchestrator.sysj line: 31, column: 3
  private Order nextOrder_thread_2;//sysj\orchestrator.sysj line: 86, column: 7
  private Order newOrder_thread_2;//sysj\orchestrator.sysj line: 41, column: 6
  private Order tempOrder_thread_2;//sysj\orchestrator.sysj line: 49, column: 7
  private Order myOrder_thread_4;//sysj\orchestrator.sysj line: 125, column: 6
  private int quantity_thread_4;//sysj\orchestrator.sysj line: 126, column: 6
  private int S119156 = 1;
  private int S119114 = 1;
  private int S117980 = 1;
  private int S117981 = 1;
  private int S119131 = 1;
  private int S119119 = 1;
  private int S119154 = 1;
  
  private int[] ends = new int[5];
  private int[] tdone = new int[5];
  
  public void thread119164(int [] tdone, int [] ends){
        switch(S119154){
      case 0 : 
        active[4]=0;
        ends[4]=0;
        tdone[4]=1;
        break;
      
      case 1 : 
        if(startOrder_1.getprestatus()){//sysj\orchestrator.sysj line: 121, column: 12
          System.out.println("started order");//sysj\orchestrator.sysj line: 122, column: 5
          if(currentOrder_1.getprestatus()){//sysj\orchestrator.sysj line: 123, column: 13
            System.out.println("found current order");//sysj\orchestrator.sysj line: 124, column: 6
            myOrder_thread_4 = (currentOrder_1.getpreval() == null ? null : ((Order)currentOrder_1.getpreval()));//sysj\orchestrator.sysj line: 125, column: 6
            quantity_thread_4 = myOrder_thread_4.getQuantity();//sysj\orchestrator.sysj line: 126, column: 6
            System.out.println("quantity is: " + quantity_thread_4);//sysj\orchestrator.sysj line: 127, column: 6
            foundCurrentOrder_1.setPresent();//sysj\orchestrator.sysj line: 129, column: 6
            currsigs.addElement(foundCurrentOrder_1);
            active[4]=1;
            ends[4]=1;
            tdone[4]=1;
          }
          else {
            active[4]=1;
            ends[4]=1;
            tdone[4]=1;
          }
        }
        else {
          active[4]=1;
          ends[4]=1;
          tdone[4]=1;
        }
        break;
      
    }
  }

  public void thread119163(int [] tdone, int [] ends){
        switch(S119131){
      case 0 : 
        active[3]=0;
        ends[3]=0;
        tdone[3]=1;
        break;
      
      case 1 : 
        switch(S119119){
          case 0 : 
            if(currentOrder_1.getprestatus()){//sysj\orchestrator.sysj line: 112, column: 10
              S119119=1;
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            else {
              initABS_1.setPresent();//sysj\orchestrator.sysj line: 113, column: 5
              currsigs.addElement(initABS_1);
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            break;
          
          case 1 : 
            S119119=1;
            S119119=0;
            initABS_1.setPresent();//sysj\orchestrator.sysj line: 113, column: 5
            currsigs.addElement(initABS_1);
            active[3]=1;
            ends[3]=1;
            tdone[3]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread119162(int [] tdone, int [] ends){
        switch(S119114){
      case 0 : 
        active[2]=0;
        ends[2]=0;
        tdone[2]=1;
        break;
      
      case 1 : 
        switch(S117980){
          case 0 : 
            if(recOrderStatus.getprestatus()){//sysj\orchestrator.sysj line: 59, column: 13
              System.out.println("orch received: recOrderStatus");//sysj\orchestrator.sysj line: 63, column: 7
              currentOrder_1.setPresent();//sysj\orchestrator.sysj line: 67, column: 8
              currsigs.addElement(currentOrder_1);
              currentOrder_1.setValue(tempOrder_thread_2);//sysj\orchestrator.sysj line: 67, column: 8
              startOrder_1.setPresent();//sysj\orchestrator.sysj line: 68, column: 8
              currsigs.addElement(startOrder_1);
              S117980=1;
              if(orderIsDone_1.getprestatus()){//sysj\orchestrator.sysj line: 75, column: 13
                if(currentOrder_1.getprestatus()){//sysj\orchestrator.sysj line: 76, column: 14
                  tempOrder_thread_2 = (currentOrder_1.getpreval() == null ? null : ((Order)currentOrder_1.getpreval()));//sysj\orchestrator.sysj line: 77, column: 7
                  tempOrder_thread_2.setOrderStatus("Done");//sysj\orchestrator.sysj line: 79, column: 7
                  S117981=0;
                  orderStatus.setPresent();//sysj\orchestrator.sysj line: 81, column: 8
                  currsigs.addElement(orderStatus);
                  orderStatus.setValue(tempOrder_thread_2);//sysj\orchestrator.sysj line: 81, column: 8
                  active[2]=1;
                  ends[2]=1;
                  tdone[2]=1;
                }
                else {
                  S117980=2;
                  active[2]=1;
                  ends[2]=1;
                  tdone[2]=1;
                }
              }
              else {
                S117980=2;
                active[2]=1;
                ends[2]=1;
                tdone[2]=1;
              }
            }
            else {
              orderStatus.setPresent();//sysj\orchestrator.sysj line: 60, column: 8
              currsigs.addElement(orderStatus);
              orderStatus.setValue(tempOrder_thread_2);//sysj\orchestrator.sysj line: 60, column: 8
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            break;
          
          case 1 : 
            switch(S117981){
              case 0 : 
                if(recOrderStatus.getprestatus()){//sysj\orchestrator.sysj line: 80, column: 13
                  System.out.println("initialising next order...");//sysj\orchestrator.sysj line: 85, column: 7
                  nextOrder_thread_2 = (Order)fifoQueue_thread_2.get(0);//sysj\orchestrator.sysj line: 86, column: 7
                  fifoQueue_thread_2.remove(0);//sysj\orchestrator.sysj line: 87, column: 7
                  nextOrder_thread_2.setOrderStatus("Started");//sysj\orchestrator.sysj line: 90, column: 7
                  System.out.println("emitting next orderstatus: started");//sysj\orchestrator.sysj line: 91, column: 7
                  S117981=1;
                  orderStatus.setPresent();//sysj\orchestrator.sysj line: 93, column: 8
                  currsigs.addElement(orderStatus);
                  orderStatus.setValue(nextOrder_thread_2);//sysj\orchestrator.sysj line: 93, column: 8
                  active[2]=1;
                  ends[2]=1;
                  tdone[2]=1;
                }
                else {
                  orderStatus.setPresent();//sysj\orchestrator.sysj line: 81, column: 8
                  currsigs.addElement(orderStatus);
                  orderStatus.setValue(tempOrder_thread_2);//sysj\orchestrator.sysj line: 81, column: 8
                  active[2]=1;
                  ends[2]=1;
                  tdone[2]=1;
                }
                break;
              
              case 1 : 
                if(recOrderStatus.getprestatus()){//sysj\orchestrator.sysj line: 92, column: 13
                  currentOrder_1.setPresent();//sysj\orchestrator.sysj line: 98, column: 8
                  currsigs.addElement(currentOrder_1);
                  currentOrder_1.setValue(nextOrder_thread_2);//sysj\orchestrator.sysj line: 98, column: 8
                  startOrder_1.setPresent();//sysj\orchestrator.sysj line: 99, column: 8
                  currsigs.addElement(startOrder_1);
                  S117980=2;
                  active[2]=1;
                  ends[2]=1;
                  tdone[2]=1;
                }
                else {
                  orderStatus.setPresent();//sysj\orchestrator.sysj line: 93, column: 8
                  currsigs.addElement(orderStatus);
                  orderStatus.setValue(nextOrder_thread_2);//sysj\orchestrator.sysj line: 93, column: 8
                  active[2]=1;
                  ends[2]=1;
                  tdone[2]=1;
                }
                break;
              
            }
            break;
          
          case 2 : 
            S117980=2;
            System.out.println("awaiting order");//sysj\orchestrator.sysj line: 38, column: 5
            S117980=0;
            if(order.getprestatus()){//sysj\orchestrator.sysj line: 39, column: 13
              System.out.println("got order!");//sysj\orchestrator.sysj line: 40, column: 6
              newOrder_thread_2 = (order.getpreval() == null ? null : ((Order)order.getpreval()));//sysj\orchestrator.sysj line: 41, column: 6
              System.out.println(newOrder_thread_2.getQuantity());//sysj\orchestrator.sysj line: 42, column: 6
              fifoQueue_thread_2.add(newOrder_thread_2);//sysj\orchestrator.sysj line: 44, column: 6
              if(initABS_1.getprestatus()){//sysj\orchestrator.sysj line: 47, column: 14
                System.out.println("start of ABS get first item");//sysj\orchestrator.sysj line: 48, column: 7
                tempOrder_thread_2 = (Order)fifoQueue_thread_2.get(0);//sysj\orchestrator.sysj line: 49, column: 7
                fifoQueue_thread_2.remove(0);//sysj\orchestrator.sysj line: 52, column: 7
                System.out.println(newOrder_thread_2.getCustomerID());//sysj\orchestrator.sysj line: 53, column: 7
                tempOrder_thread_2.setOrderStatus("Started");//sysj\orchestrator.sysj line: 56, column: 7
                System.out.println("emitting orderstatus: started");//sysj\orchestrator.sysj line: 57, column: 7
                orderStatus.setPresent();//sysj\orchestrator.sysj line: 60, column: 8
                currsigs.addElement(orderStatus);
                orderStatus.setValue(tempOrder_thread_2);//sysj\orchestrator.sysj line: 60, column: 8
                active[2]=1;
                ends[2]=1;
                tdone[2]=1;
              }
              else {
                S117980=1;
                if(orderIsDone_1.getprestatus()){//sysj\orchestrator.sysj line: 75, column: 13
                  if(currentOrder_1.getprestatus()){//sysj\orchestrator.sysj line: 76, column: 14
                    tempOrder_thread_2 = (currentOrder_1.getpreval() == null ? null : ((Order)currentOrder_1.getpreval()));//sysj\orchestrator.sysj line: 77, column: 7
                    tempOrder_thread_2.setOrderStatus("Done");//sysj\orchestrator.sysj line: 79, column: 7
                    S117981=0;
                    orderStatus.setPresent();//sysj\orchestrator.sysj line: 81, column: 8
                    currsigs.addElement(orderStatus);
                    orderStatus.setValue(tempOrder_thread_2);//sysj\orchestrator.sysj line: 81, column: 8
                    active[2]=1;
                    ends[2]=1;
                    tdone[2]=1;
                  }
                  else {
                    S117980=2;
                    active[2]=1;
                    ends[2]=1;
                    tdone[2]=1;
                  }
                }
                else {
                  S117980=2;
                  active[2]=1;
                  ends[2]=1;
                  tdone[2]=1;
                }
              }
            }
            else {
              S117980=1;
              if(orderIsDone_1.getprestatus()){//sysj\orchestrator.sysj line: 75, column: 13
                if(currentOrder_1.getprestatus()){//sysj\orchestrator.sysj line: 76, column: 14
                  tempOrder_thread_2 = (currentOrder_1.getpreval() == null ? null : ((Order)currentOrder_1.getpreval()));//sysj\orchestrator.sysj line: 77, column: 7
                  tempOrder_thread_2.setOrderStatus("Done");//sysj\orchestrator.sysj line: 79, column: 7
                  S117981=0;
                  orderStatus.setPresent();//sysj\orchestrator.sysj line: 81, column: 8
                  currsigs.addElement(orderStatus);
                  orderStatus.setValue(tempOrder_thread_2);//sysj\orchestrator.sysj line: 81, column: 8
                  active[2]=1;
                  ends[2]=1;
                  tdone[2]=1;
                }
                else {
                  S117980=2;
                  active[2]=1;
                  ends[2]=1;
                  tdone[2]=1;
                }
              }
              else {
                S117980=2;
                active[2]=1;
                ends[2]=1;
                tdone[2]=1;
              }
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread119160(int [] tdone, int [] ends){
        S119154=1;
    if(startOrder_1.getprestatus()){//sysj\orchestrator.sysj line: 121, column: 12
      System.out.println("started order");//sysj\orchestrator.sysj line: 122, column: 5
      if(currentOrder_1.getprestatus()){//sysj\orchestrator.sysj line: 123, column: 13
        System.out.println("found current order");//sysj\orchestrator.sysj line: 124, column: 6
        myOrder_thread_4 = (currentOrder_1.getpreval() == null ? null : ((Order)currentOrder_1.getpreval()));//sysj\orchestrator.sysj line: 125, column: 6
        quantity_thread_4 = myOrder_thread_4.getQuantity();//sysj\orchestrator.sysj line: 126, column: 6
        System.out.println("quantity is: " + quantity_thread_4);//sysj\orchestrator.sysj line: 127, column: 6
        foundCurrentOrder_1.setPresent();//sysj\orchestrator.sysj line: 129, column: 6
        currsigs.addElement(foundCurrentOrder_1);
        active[4]=1;
        ends[4]=1;
        tdone[4]=1;
      }
      else {
        active[4]=1;
        ends[4]=1;
        tdone[4]=1;
      }
    }
    else {
      active[4]=1;
      ends[4]=1;
      tdone[4]=1;
    }
  }

  public void thread119159(int [] tdone, int [] ends){
        S119131=1;
    S119119=0;
    initABS_1.setPresent();//sysj\orchestrator.sysj line: 113, column: 5
    currsigs.addElement(initABS_1);
    active[3]=1;
    ends[3]=1;
    tdone[3]=1;
  }

  public void thread119158(int [] tdone, int [] ends){
        S119114=1;
    fifoQueue_thread_2 = new ArrayList();//sysj\orchestrator.sysj line: 29, column: 3
    liquidPercent_thread_2 = new ArrayList();//sysj\orchestrator.sysj line: 31, column: 3
    System.out.println("awaiting order");//sysj\orchestrator.sysj line: 38, column: 5
    S117980=0;
    if(order.getprestatus()){//sysj\orchestrator.sysj line: 39, column: 13
      System.out.println("got order!");//sysj\orchestrator.sysj line: 40, column: 6
      newOrder_thread_2 = (order.getpreval() == null ? null : ((Order)order.getpreval()));//sysj\orchestrator.sysj line: 41, column: 6
      System.out.println(newOrder_thread_2.getQuantity());//sysj\orchestrator.sysj line: 42, column: 6
      fifoQueue_thread_2.add(newOrder_thread_2);//sysj\orchestrator.sysj line: 44, column: 6
      if(initABS_1.getprestatus()){//sysj\orchestrator.sysj line: 47, column: 14
        System.out.println("start of ABS get first item");//sysj\orchestrator.sysj line: 48, column: 7
        tempOrder_thread_2 = (Order)fifoQueue_thread_2.get(0);//sysj\orchestrator.sysj line: 49, column: 7
        fifoQueue_thread_2.remove(0);//sysj\orchestrator.sysj line: 52, column: 7
        System.out.println(newOrder_thread_2.getCustomerID());//sysj\orchestrator.sysj line: 53, column: 7
        tempOrder_thread_2.setOrderStatus("Started");//sysj\orchestrator.sysj line: 56, column: 7
        System.out.println("emitting orderstatus: started");//sysj\orchestrator.sysj line: 57, column: 7
        orderStatus.setPresent();//sysj\orchestrator.sysj line: 60, column: 8
        currsigs.addElement(orderStatus);
        orderStatus.setValue(tempOrder_thread_2);//sysj\orchestrator.sysj line: 60, column: 8
        active[2]=1;
        ends[2]=1;
        tdone[2]=1;
      }
      else {
        S117980=1;
        if(orderIsDone_1.getprestatus()){//sysj\orchestrator.sysj line: 75, column: 13
          if(currentOrder_1.getprestatus()){//sysj\orchestrator.sysj line: 76, column: 14
            tempOrder_thread_2 = (currentOrder_1.getpreval() == null ? null : ((Order)currentOrder_1.getpreval()));//sysj\orchestrator.sysj line: 77, column: 7
            tempOrder_thread_2.setOrderStatus("Done");//sysj\orchestrator.sysj line: 79, column: 7
            S117981=0;
            orderStatus.setPresent();//sysj\orchestrator.sysj line: 81, column: 8
            currsigs.addElement(orderStatus);
            orderStatus.setValue(tempOrder_thread_2);//sysj\orchestrator.sysj line: 81, column: 8
            active[2]=1;
            ends[2]=1;
            tdone[2]=1;
          }
          else {
            S117980=2;
            active[2]=1;
            ends[2]=1;
            tdone[2]=1;
          }
        }
        else {
          S117980=2;
          active[2]=1;
          ends[2]=1;
          tdone[2]=1;
        }
      }
    }
    else {
      S117980=1;
      if(orderIsDone_1.getprestatus()){//sysj\orchestrator.sysj line: 75, column: 13
        if(currentOrder_1.getprestatus()){//sysj\orchestrator.sysj line: 76, column: 14
          tempOrder_thread_2 = (currentOrder_1.getpreval() == null ? null : ((Order)currentOrder_1.getpreval()));//sysj\orchestrator.sysj line: 77, column: 7
          tempOrder_thread_2.setOrderStatus("Done");//sysj\orchestrator.sysj line: 79, column: 7
          S117981=0;
          orderStatus.setPresent();//sysj\orchestrator.sysj line: 81, column: 8
          currsigs.addElement(orderStatus);
          orderStatus.setValue(tempOrder_thread_2);//sysj\orchestrator.sysj line: 81, column: 8
          active[2]=1;
          ends[2]=1;
          tdone[2]=1;
        }
        else {
          S117980=2;
          active[2]=1;
          ends[2]=1;
          tdone[2]=1;
        }
      }
      else {
        S117980=2;
        active[2]=1;
        ends[2]=1;
        tdone[2]=1;
      }
    }
  }

  public void runClockDomain(){
    for(int i=0;i<ends.length;i++){
      ends[i] = 0;
      tdone[i] = 0;
    }
    
    RUN: while(true){
      switch(S119156){
        case 0 : 
          S119156=0;
          break RUN;
        
        case 1 : 
          S119156=2;
          S119156=2;
          getNextBottle_1.setClear();//sysj\orchestrator.sysj line: 19, column: 2
          startOrder_1.setClear();//sysj\orchestrator.sysj line: 20, column: 2
          orderIsDone_1.setClear();//sysj\orchestrator.sysj line: 21, column: 2
          initABS_1.setClear();//sysj\orchestrator.sysj line: 22, column: 2
          foundCurrentOrder_1.setClear();//sysj\orchestrator.sysj line: 23, column: 2
          currentOrder_1.setClear();//sysj\orchestrator.sysj line: 25, column: 2
          thread119158(tdone,ends);
          thread119159(tdone,ends);
          thread119160(tdone,ends);
          int biggest119161 = 0;
          if(ends[2]>=biggest119161){
            biggest119161=ends[2];
          }
          if(ends[3]>=biggest119161){
            biggest119161=ends[3];
          }
          if(ends[4]>=biggest119161){
            biggest119161=ends[4];
          }
          if(biggest119161 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
        
        case 2 : 
          getNextBottle_1.setClear();//sysj\orchestrator.sysj line: 19, column: 2
          startOrder_1.setClear();//sysj\orchestrator.sysj line: 20, column: 2
          orderIsDone_1.setClear();//sysj\orchestrator.sysj line: 21, column: 2
          initABS_1.setClear();//sysj\orchestrator.sysj line: 22, column: 2
          foundCurrentOrder_1.setClear();//sysj\orchestrator.sysj line: 23, column: 2
          currentOrder_1.setClear();//sysj\orchestrator.sysj line: 25, column: 2
          thread119162(tdone,ends);
          thread119163(tdone,ends);
          thread119164(tdone,ends);
          int biggest119165 = 0;
          if(ends[2]>=biggest119165){
            biggest119165=ends[2];
          }
          if(ends[3]>=biggest119165){
            biggest119165=ends[3];
          }
          if(ends[4]>=biggest119165){
            biggest119165=ends[4];
          }
          if(biggest119165 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
          //FINXME code
          if(biggest119165 == 0){
            S119156=0;
            active[1]=0;
            ends[1]=0;
            S119156=0;
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
    getNextBottle_1 = new Signal();
    startOrder_1 = new Signal();
    orderIsDone_1 = new Signal();
    initABS_1 = new Signal();
    foundCurrentOrder_1 = new Signal();
    currentOrder_1 = new Signal();
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
      startOrder_1.setpreclear();
      orderIsDone_1.setpreclear();
      initABS_1.setpreclear();
      foundCurrentOrder_1.setpreclear();
      currentOrder_1.setpreclear();
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
      startOrder_1.setClear();
      orderIsDone_1.setClear();
      initABS_1.setClear();
      foundCurrentOrder_1.setClear();
      currentOrder_1.setClear();
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
