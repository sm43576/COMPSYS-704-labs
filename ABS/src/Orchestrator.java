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
  public Signal conveyorStatusUIE = new Signal("conveyorStatusUIE", Signal.OUTPUT);
  public Signal fillerStatusUIE = new Signal("fillerStatusUIE", Signal.OUTPUT);
  public Signal capperStatusUIE = new Signal("capperStatusUIE", Signal.OUTPUT);
  public Signal capLoaderStatusUIE = new Signal("capLoaderStatusUIE", Signal.OUTPUT);
  public Signal rotaryStatusUIE = new Signal("rotaryStatusUIE", Signal.OUTPUT);
  public input_Channel conveyorStatus_in = new input_Channel();
  public input_Channel capperStatus_in = new input_Channel();
  public input_Channel capLoaderStatus_in = new input_Channel();
  public input_Channel fillerStatus_in = new input_Channel();
  public input_Channel rotaryStatus_in = new input_Channel();
  public output_Channel conveyorReq_o = new output_Channel();
  public output_Channel rotaryReq_o = new output_Channel();
  public output_Channel fillerReq_o = new output_Channel();
  public output_Channel capperReq_o = new output_Channel();
  public output_Channel capLoaderReq_o = new output_Channel();
  private Signal sigConveyorReq_1;
  private Signal sigCapperReq_1;
  private Signal sigCapLoaderReq_1;
  private Signal sigRotaryReq_1;
  private Signal sigFillerReq_1;
  private Signal recConveyorStatus_1;
  private Signal recCapperStatus_1;
  private Signal recCapLoaderStatus_1;
  private Signal recFillerStatus_1;
  private Signal recRotaryStatus_1;
  private Signal getNextBottle_1;
  private Signal startOrder_1;
  private Signal orderIsDone_1;
  private Signal initABS_1;
  private Signal foundCurrentOrder_1;
  private Signal currentOrder_1;
  private Signal recOrderIsDone_1;
  private ArrayList fifoQueue_thread_2;//sysj\orchestrator.sysj line: 30, column: 3
  private int quantity_thread_14;//sysj\orchestrator.sysj line: 221, column: 3
  private int count_thread_14;//sysj\orchestrator.sysj line: 222, column: 3
  private int eject_thread_14;//sysj\orchestrator.sysj line: 223, column: 3
  private ArrayList liquidPercent_thread_14;//sysj\orchestrator.sysj line: 224, column: 3
  private Order nextOrder_thread_2;//sysj\orchestrator.sysj line: 93, column: 8
  private Order newOrder_thread_2;//sysj\orchestrator.sysj line: 38, column: 5
  private Order tempOrder_thread_2;//sysj\orchestrator.sysj line: 46, column: 6
  private Order tempOrder_thread_3;//sysj\orchestrator.sysj line: 81, column: 9
  private Order myOrder_thread_7;//sysj\orchestrator.sysj line: 138, column: 9
  private String res_thread_9;//sysj\orchestrator.sysj line: 158, column: 4
  private String res_thread_10;//sysj\orchestrator.sysj line: 172, column: 4
  private String res_thread_11;//sysj\orchestrator.sysj line: 186, column: 4
  private ArrayList req_thread_12;//sysj\orchestrator.sysj line: 197, column: 4
  private String res_thread_12;//sysj\orchestrator.sysj line: 201, column: 4
  private String res_thread_13;//sysj\orchestrator.sysj line: 214, column: 4
  private Order order_thread_14;//sysj\orchestrator.sysj line: 229, column: 4
  private int S51075 = 1;
  private int S44635 = 1;
  private int S40518 = 1;
  private int S39770 = 1;
  private int S39749 = 1;
  private int S39754 = 1;
  private int S44652 = 1;
  private int S44640 = 1;
  private int S44705 = 1;
  private int S44669 = 1;
  private int S44660 = 1;
  private int S44665 = 1;
  private int S45652 = 1;
  private int S44708 = 1;
  private int S44715 = 1;
  private int S44710 = 1;
  private int S44759 = 1;
  private int S44754 = 1;
  private int S46599 = 1;
  private int S45655 = 1;
  private int S45662 = 1;
  private int S45657 = 1;
  private int S45706 = 1;
  private int S45701 = 1;
  private int S47546 = 1;
  private int S46602 = 1;
  private int S46609 = 1;
  private int S46604 = 1;
  private int S46653 = 1;
  private int S46648 = 1;
  private int S48493 = 1;
  private int S47549 = 1;
  private int S47556 = 1;
  private int S47551 = 1;
  private int S47600 = 1;
  private int S47595 = 1;
  private int S49433 = 1;
  private int S48495 = 1;
  private int S48502 = 1;
  private int S48497 = 1;
  private int S48546 = 1;
  private int S48541 = 1;
  private int S51073 = 1;
  private int S49436 = 1;
  private int S49441 = 1;
  private int S49444 = 1;
  private int S49447 = 1;
  private int S49450 = 1;
  private int S49460 = 1;
  private int S49637 = 1;
  
  private int[] ends = new int[18];
  private int[] tdone = new int[18];
  
  public void thread51133(int [] tdone, int [] ends){
        S49450=1;
    active[17]=1;
    ends[17]=1;
    tdone[17]=1;
  }

  public void thread51132(int [] tdone, int [] ends){
        S49447=1;
    active[16]=1;
    ends[16]=1;
    tdone[16]=1;
  }

  public void thread51131(int [] tdone, int [] ends){
        S49444=1;
    active[15]=1;
    ends[15]=1;
    tdone[15]=1;
  }

  public void thread51129(int [] tdone, int [] ends){
        switch(S49450){
      case 0 : 
        active[17]=0;
        ends[17]=0;
        tdone[17]=1;
        break;
      
      case 1 : 
        if(recCapperStatus_1.getprestatus()){//sysj\orchestrator.sysj line: 252, column: 73
          S49450=0;
          active[17]=0;
          ends[17]=0;
          tdone[17]=1;
        }
        else {
          active[17]=1;
          ends[17]=1;
          tdone[17]=1;
        }
        break;
      
    }
  }

  public void thread51128(int [] tdone, int [] ends){
        switch(S49447){
      case 0 : 
        active[16]=0;
        ends[16]=0;
        tdone[16]=1;
        break;
      
      case 1 : 
        if(recCapLoaderStatus_1.getprestatus()){//sysj\orchestrator.sysj line: 252, column: 41
          S49447=0;
          active[16]=0;
          ends[16]=0;
          tdone[16]=1;
        }
        else {
          active[16]=1;
          ends[16]=1;
          tdone[16]=1;
        }
        break;
      
    }
  }

  public void thread51127(int [] tdone, int [] ends){
        switch(S49444){
      case 0 : 
        active[15]=0;
        ends[15]=0;
        tdone[15]=1;
        break;
      
      case 1 : 
        if(recFillerStatus_1.getprestatus()){//sysj\orchestrator.sysj line: 252, column: 12
          S49444=0;
          active[15]=0;
          ends[15]=0;
          tdone[15]=1;
        }
        else {
          active[15]=1;
          ends[15]=1;
          tdone[15]=1;
        }
        break;
      
    }
  }

  public void thread51125(int [] tdone, int [] ends){
        S49450=1;
    active[17]=1;
    ends[17]=1;
    tdone[17]=1;
  }

  public void thread51124(int [] tdone, int [] ends){
        S49447=1;
    active[16]=1;
    ends[16]=1;
    tdone[16]=1;
  }

  public void thread51123(int [] tdone, int [] ends){
        S49444=1;
    active[15]=1;
    ends[15]=1;
    tdone[15]=1;
  }

  public void thread51122(int [] tdone, int [] ends){
        switch(S51073){
      case 0 : 
        active[14]=0;
        ends[14]=0;
        tdone[14]=1;
        break;
      
      case 1 : 
        switch(S49436){
          case 0 : 
            if(currentOrder_1.getprestatus()){//sysj\orchestrator.sysj line: 228, column: 10
              order_thread_14 = (currentOrder_1.getpreval() == null ? null : ((Order)currentOrder_1.getpreval()));//sysj\orchestrator.sysj line: 229, column: 4
              quantity_thread_14 = order_thread_14.getQuantity();//sysj\orchestrator.sysj line: 230, column: 4
              count_thread_14 = quantity_thread_14;//sysj\orchestrator.sysj line: 231, column: 4
              liquidPercent_thread_14 = order_thread_14.getLiquidPercentageArray();//sysj\orchestrator.sysj line: 232, column: 4
              System.out.println("Orch: Loading first bottle...");//sysj\orchestrator.sysj line: 234, column: 4
              sigConveyorReq_1.setPresent();//sysj\orchestrator.sysj line: 235, column: 4
              currsigs.addElement(sigConveyorReq_1);
              sigConveyorReq_1.setValue(true);//sysj\orchestrator.sysj line: 235, column: 4
              S49436=1;
              active[14]=1;
              ends[14]=1;
              tdone[14]=1;
            }
            else {
              active[14]=1;
              ends[14]=1;
              tdone[14]=1;
            }
            break;
          
          case 1 : 
            if(recConveyorStatus_1.getprestatus()){//sysj\orchestrator.sysj line: 236, column: 10
              System.out.println("Orch: First bottle loaded.");//sysj\orchestrator.sysj line: 237, column: 4
              sigRotaryReq_1.setPresent();//sysj\orchestrator.sysj line: 238, column: 4
              currsigs.addElement(sigRotaryReq_1);
              S49436=2;
              active[14]=1;
              ends[14]=1;
              tdone[14]=1;
            }
            else {
              active[14]=1;
              ends[14]=1;
              tdone[14]=1;
            }
            break;
          
          case 2 : 
            if(recRotaryStatus_1.getprestatus()){//sysj\orchestrator.sysj line: 239, column: 10
              S49436=3;
              if(count_thread_14 >= 0){//sysj\orchestrator.sysj line: 241, column: 10
                if(count_thread_14 == 0) {//sysj\orchestrator.sysj line: 243, column: 21
                  System.out.println("Orch: Last bottle. Preparing to send requests..");//sysj\orchestrator.sysj line: 244, column: 6
                }
                else {//sysj\orchestrator.sysj line: 245, column: 12
                  System.out.println("Orch: Bottle count " + count_thread_14 + ". Preparing to send requests..");//sysj\orchestrator.sysj line: 246, column: 6
                }
                sigFillerReq_1.setPresent();//sysj\orchestrator.sysj line: 249, column: 5
                currsigs.addElement(sigFillerReq_1);
                sigFillerReq_1.setValue(liquidPercent_thread_14);//sysj\orchestrator.sysj line: 249, column: 5
                sigCapLoaderReq_1.setPresent();//sysj\orchestrator.sysj line: 250, column: 5
                currsigs.addElement(sigCapLoaderReq_1);
                sigCapperReq_1.setPresent();//sysj\orchestrator.sysj line: 251, column: 5
                currsigs.addElement(sigCapperReq_1);
                S49441=0;
                thread51123(tdone,ends);
                thread51124(tdone,ends);
                thread51125(tdone,ends);
                int biggest51126 = 0;
                if(ends[15]>=biggest51126){
                  biggest51126=ends[15];
                }
                if(ends[16]>=biggest51126){
                  biggest51126=ends[16];
                }
                if(ends[17]>=biggest51126){
                  biggest51126=ends[17];
                }
                if(biggest51126 == 1){
                  active[14]=1;
                  ends[14]=1;
                  tdone[14]=1;
                }
              }
              else {
                ends[14]=2;
                ;//sysj\orchestrator.sysj line: 241, column: 4
                System.out.println("Ejecting all bottles");//sysj\orchestrator.sysj line: 272, column: 4
                if(quantity_thread_14 >= 5) {//sysj\orchestrator.sysj line: 274, column: 23
                  eject_thread_14 = 5;//sysj\orchestrator.sysj line: 275, column: 5
                }
                else {//sysj\orchestrator.sysj line: 276, column: 11
                  eject_thread_14 = quantity_thread_14;//sysj\orchestrator.sysj line: 277, column: 5
                }
                S49436=4;
                if(eject_thread_14 >= 0){//sysj\orchestrator.sysj line: 281, column: 11
                  sigRotaryReq_1.setPresent();//sysj\orchestrator.sysj line: 282, column: 5
                  currsigs.addElement(sigRotaryReq_1);
                  S49637=0;
                  active[14]=1;
                  ends[14]=1;
                  tdone[14]=1;
                }
                else {
                  ends[14]=2;
                  ;//sysj\orchestrator.sysj line: 281, column: 4
                  System.out.println("Orch: Order complete.");//sysj\orchestrator.sysj line: 288, column: 4
                  S49436=5;
                  orderIsDone_1.setPresent();//sysj\orchestrator.sysj line: 290, column: 5
                  currsigs.addElement(orderIsDone_1);
                  active[14]=1;
                  ends[14]=1;
                  tdone[14]=1;
                }
              }
            }
            else {
              active[14]=1;
              ends[14]=1;
              tdone[14]=1;
            }
            break;
          
          case 3 : 
            switch(S49441){
              case 0 : 
                thread51127(tdone,ends);
                thread51128(tdone,ends);
                thread51129(tdone,ends);
                int biggest51130 = 0;
                if(ends[15]>=biggest51130){
                  biggest51130=ends[15];
                }
                if(ends[16]>=biggest51130){
                  biggest51130=ends[16];
                }
                if(ends[17]>=biggest51130){
                  biggest51130=ends[17];
                }
                if(biggest51130 == 1){
                  active[14]=1;
                  ends[14]=1;
                  tdone[14]=1;
                }
                //FINXME code
                if(biggest51130 == 0){
                  System.out.println("Orch: All done!");//sysj\orchestrator.sysj line: 253, column: 5
                  count_thread_14 = count_thread_14 - 1;//sysj\orchestrator.sysj line: 255, column: 5
                  S49441=1;
                  if(count_thread_14 >= 0){//sysj\orchestrator.sysj line: 257, column: 9
                    System.out.println("Orch: Loading next bottle...");//sysj\orchestrator.sysj line: 259, column: 6
                    sigConveyorReq_1.setPresent();//sysj\orchestrator.sysj line: 260, column: 6
                    currsigs.addElement(sigConveyorReq_1);
                    sigConveyorReq_1.setValue(true);//sysj\orchestrator.sysj line: 260, column: 6
                    S49460=0;
                    active[14]=1;
                    ends[14]=1;
                    tdone[14]=1;
                  }
                  else {
                    S49441=2;
                    active[14]=1;
                    ends[14]=1;
                    tdone[14]=1;
                  }
                }
                break;
              
              case 1 : 
                switch(S49460){
                  case 0 : 
                    if(recConveyorStatus_1.getprestatus()){//sysj\orchestrator.sysj line: 261, column: 12
                      System.out.println("Orch: Loaded new bottle.");//sysj\orchestrator.sysj line: 262, column: 6
                      sigRotaryReq_1.setPresent();//sysj\orchestrator.sysj line: 265, column: 6
                      currsigs.addElement(sigRotaryReq_1);
                      S49460=1;
                      active[14]=1;
                      ends[14]=1;
                      tdone[14]=1;
                    }
                    else {
                      active[14]=1;
                      ends[14]=1;
                      tdone[14]=1;
                    }
                    break;
                  
                  case 1 : 
                    if(recRotaryStatus_1.getprestatus()){//sysj\orchestrator.sysj line: 266, column: 12
                      S49441=2;
                      active[14]=1;
                      ends[14]=1;
                      tdone[14]=1;
                    }
                    else {
                      active[14]=1;
                      ends[14]=1;
                      tdone[14]=1;
                    }
                    break;
                  
                }
                break;
              
              case 2 : 
                S49441=2;
                if(count_thread_14 >= 0){//sysj\orchestrator.sysj line: 241, column: 10
                  if(count_thread_14 == 0) {//sysj\orchestrator.sysj line: 243, column: 21
                    System.out.println("Orch: Last bottle. Preparing to send requests..");//sysj\orchestrator.sysj line: 244, column: 6
                  }
                  else {//sysj\orchestrator.sysj line: 245, column: 12
                    System.out.println("Orch: Bottle count " + count_thread_14 + ". Preparing to send requests..");//sysj\orchestrator.sysj line: 246, column: 6
                  }
                  sigFillerReq_1.setPresent();//sysj\orchestrator.sysj line: 249, column: 5
                  currsigs.addElement(sigFillerReq_1);
                  sigFillerReq_1.setValue(liquidPercent_thread_14);//sysj\orchestrator.sysj line: 249, column: 5
                  sigCapLoaderReq_1.setPresent();//sysj\orchestrator.sysj line: 250, column: 5
                  currsigs.addElement(sigCapLoaderReq_1);
                  sigCapperReq_1.setPresent();//sysj\orchestrator.sysj line: 251, column: 5
                  currsigs.addElement(sigCapperReq_1);
                  S49441=0;
                  thread51131(tdone,ends);
                  thread51132(tdone,ends);
                  thread51133(tdone,ends);
                  int biggest51134 = 0;
                  if(ends[15]>=biggest51134){
                    biggest51134=ends[15];
                  }
                  if(ends[16]>=biggest51134){
                    biggest51134=ends[16];
                  }
                  if(ends[17]>=biggest51134){
                    biggest51134=ends[17];
                  }
                  if(biggest51134 == 1){
                    active[14]=1;
                    ends[14]=1;
                    tdone[14]=1;
                  }
                }
                else {
                  ends[14]=2;
                  ;//sysj\orchestrator.sysj line: 241, column: 4
                  System.out.println("Ejecting all bottles");//sysj\orchestrator.sysj line: 272, column: 4
                  if(quantity_thread_14 >= 5) {//sysj\orchestrator.sysj line: 274, column: 23
                    eject_thread_14 = 5;//sysj\orchestrator.sysj line: 275, column: 5
                  }
                  else {//sysj\orchestrator.sysj line: 276, column: 11
                    eject_thread_14 = quantity_thread_14;//sysj\orchestrator.sysj line: 277, column: 5
                  }
                  S49436=4;
                  if(eject_thread_14 >= 0){//sysj\orchestrator.sysj line: 281, column: 11
                    sigRotaryReq_1.setPresent();//sysj\orchestrator.sysj line: 282, column: 5
                    currsigs.addElement(sigRotaryReq_1);
                    S49637=0;
                    active[14]=1;
                    ends[14]=1;
                    tdone[14]=1;
                  }
                  else {
                    ends[14]=2;
                    ;//sysj\orchestrator.sysj line: 281, column: 4
                    System.out.println("Orch: Order complete.");//sysj\orchestrator.sysj line: 288, column: 4
                    S49436=5;
                    orderIsDone_1.setPresent();//sysj\orchestrator.sysj line: 290, column: 5
                    currsigs.addElement(orderIsDone_1);
                    active[14]=1;
                    ends[14]=1;
                    tdone[14]=1;
                  }
                }
                break;
              
            }
            break;
          
          case 4 : 
            switch(S49637){
              case 0 : 
                if(recRotaryStatus_1.getprestatus()){//sysj\orchestrator.sysj line: 283, column: 11
                  sigConveyorReq_1.setPresent();//sysj\orchestrator.sysj line: 284, column: 5
                  currsigs.addElement(sigConveyorReq_1);
                  S49637=1;
                  active[14]=1;
                  ends[14]=1;
                  tdone[14]=1;
                }
                else {
                  active[14]=1;
                  ends[14]=1;
                  tdone[14]=1;
                }
                break;
              
              case 1 : 
                if(recConveyorStatus_1.getprestatus()){//sysj\orchestrator.sysj line: 285, column: 11
                  eject_thread_14 = eject_thread_14 - 1;//sysj\orchestrator.sysj line: 286, column: 5
                  if(eject_thread_14 >= 0){//sysj\orchestrator.sysj line: 281, column: 11
                    sigRotaryReq_1.setPresent();//sysj\orchestrator.sysj line: 282, column: 5
                    currsigs.addElement(sigRotaryReq_1);
                    S49637=0;
                    active[14]=1;
                    ends[14]=1;
                    tdone[14]=1;
                  }
                  else {
                    ends[14]=2;
                    ;//sysj\orchestrator.sysj line: 281, column: 4
                    System.out.println("Orch: Order complete.");//sysj\orchestrator.sysj line: 288, column: 4
                    S49436=5;
                    orderIsDone_1.setPresent();//sysj\orchestrator.sysj line: 290, column: 5
                    currsigs.addElement(orderIsDone_1);
                    active[14]=1;
                    ends[14]=1;
                    tdone[14]=1;
                  }
                }
                else {
                  active[14]=1;
                  ends[14]=1;
                  tdone[14]=1;
                }
                break;
              
            }
            break;
          
          case 5 : 
            if(recOrderIsDone_1.getprestatus()){//sysj\orchestrator.sysj line: 289, column: 10
              System.out.println("end finally");//sysj\orchestrator.sysj line: 292, column: 4
              S49436=6;
              active[14]=1;
              ends[14]=1;
              tdone[14]=1;
            }
            else {
              orderIsDone_1.setPresent();//sysj\orchestrator.sysj line: 290, column: 5
              currsigs.addElement(orderIsDone_1);
              active[14]=1;
              ends[14]=1;
              tdone[14]=1;
            }
            break;
          
          case 6 : 
            S49436=6;
            S49436=0;
            active[14]=1;
            ends[14]=1;
            tdone[14]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread51121(int [] tdone, int [] ends){
        switch(S49433){
      case 0 : 
        active[13]=0;
        ends[13]=0;
        tdone[13]=1;
        break;
      
      case 1 : 
        switch(S48495){
          case 0 : 
            if(sigRotaryReq_1.getprestatus()){//sysj\orchestrator.sysj line: 208, column: 10
              rotaryStatusUIE.setPresent();//sysj\orchestrator.sysj line: 209, column: 4
              currsigs.addElement(rotaryStatusUIE);
              rotaryStatusUIE.setValue(true);//sysj\orchestrator.sysj line: 209, column: 4
              System.out.println("Orch: Sending rotary request");//sysj\orchestrator.sysj line: 210, column: 4
              S48495=1;
              S48502=0;
              if(!rotaryReq_o.isPartnerPresent() || rotaryReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 211, column: 4
                rotaryReq_o.setREQ(false);//sysj\orchestrator.sysj line: 211, column: 4
                S48502=1;
                active[13]=1;
                ends[13]=1;
                tdone[13]=1;
              }
              else {
                S48497=0;
                if(rotaryReq_o.isACK()){//sysj\orchestrator.sysj line: 211, column: 4
                  rotaryReq_o.setVal(true);//sysj\orchestrator.sysj line: 211, column: 4
                  S48497=1;
                  if(!rotaryReq_o.isACK()){//sysj\orchestrator.sysj line: 211, column: 4
                    rotaryReq_o.setREQ(false);//sysj\orchestrator.sysj line: 211, column: 4
                    ends[13]=2;
                    ;//sysj\orchestrator.sysj line: 211, column: 4
                    S48495=2;
                    S48546=0;
                    if(!rotaryStatus_in.isPartnerPresent() || rotaryStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 212, column: 4
                      rotaryStatus_in.setACK(false);//sysj\orchestrator.sysj line: 212, column: 4
                      S48546=1;
                      active[13]=1;
                      ends[13]=1;
                      tdone[13]=1;
                    }
                    else {
                      S48541=0;
                      if(!rotaryStatus_in.isREQ()){//sysj\orchestrator.sysj line: 212, column: 4
                        rotaryStatus_in.setACK(true);//sysj\orchestrator.sysj line: 212, column: 4
                        S48541=1;
                        if(rotaryStatus_in.isREQ()){//sysj\orchestrator.sysj line: 212, column: 4
                          rotaryStatus_in.setACK(false);//sysj\orchestrator.sysj line: 212, column: 4
                          ends[13]=2;
                          ;//sysj\orchestrator.sysj line: 212, column: 4
                          System.out.println("Orch: Received rotary status");//sysj\orchestrator.sysj line: 213, column: 4
                          res_thread_13 = (String)(rotaryStatus_in.getVal() == null ? null : ((String)rotaryStatus_in.getVal()));//sysj\orchestrator.sysj line: 214, column: 4
                          recRotaryStatus_1.setPresent();//sysj\orchestrator.sysj line: 215, column: 4
                          currsigs.addElement(recRotaryStatus_1);
                          recRotaryStatus_1.setValue(res_thread_13);//sysj\orchestrator.sysj line: 215, column: 4
                          S48495=0;
                          active[13]=1;
                          ends[13]=1;
                          tdone[13]=1;
                        }
                        else {
                          active[13]=1;
                          ends[13]=1;
                          tdone[13]=1;
                        }
                      }
                      else {
                        active[13]=1;
                        ends[13]=1;
                        tdone[13]=1;
                      }
                    }
                  }
                  else {
                    active[13]=1;
                    ends[13]=1;
                    tdone[13]=1;
                  }
                }
                else {
                  active[13]=1;
                  ends[13]=1;
                  tdone[13]=1;
                }
              }
            }
            else {
              active[13]=1;
              ends[13]=1;
              tdone[13]=1;
            }
            break;
          
          case 1 : 
            switch(S48502){
              case 0 : 
                if(!rotaryReq_o.isPartnerPresent() || rotaryReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 211, column: 4
                  rotaryReq_o.setREQ(false);//sysj\orchestrator.sysj line: 211, column: 4
                  S48502=1;
                  active[13]=1;
                  ends[13]=1;
                  tdone[13]=1;
                }
                else {
                  switch(S48497){
                    case 0 : 
                      if(rotaryReq_o.isACK()){//sysj\orchestrator.sysj line: 211, column: 4
                        rotaryReq_o.setVal(true);//sysj\orchestrator.sysj line: 211, column: 4
                        S48497=1;
                        if(!rotaryReq_o.isACK()){//sysj\orchestrator.sysj line: 211, column: 4
                          rotaryReq_o.setREQ(false);//sysj\orchestrator.sysj line: 211, column: 4
                          ends[13]=2;
                          ;//sysj\orchestrator.sysj line: 211, column: 4
                          S48495=2;
                          S48546=0;
                          if(!rotaryStatus_in.isPartnerPresent() || rotaryStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 212, column: 4
                            rotaryStatus_in.setACK(false);//sysj\orchestrator.sysj line: 212, column: 4
                            S48546=1;
                            active[13]=1;
                            ends[13]=1;
                            tdone[13]=1;
                          }
                          else {
                            S48541=0;
                            if(!rotaryStatus_in.isREQ()){//sysj\orchestrator.sysj line: 212, column: 4
                              rotaryStatus_in.setACK(true);//sysj\orchestrator.sysj line: 212, column: 4
                              S48541=1;
                              if(rotaryStatus_in.isREQ()){//sysj\orchestrator.sysj line: 212, column: 4
                                rotaryStatus_in.setACK(false);//sysj\orchestrator.sysj line: 212, column: 4
                                ends[13]=2;
                                ;//sysj\orchestrator.sysj line: 212, column: 4
                                System.out.println("Orch: Received rotary status");//sysj\orchestrator.sysj line: 213, column: 4
                                res_thread_13 = (String)(rotaryStatus_in.getVal() == null ? null : ((String)rotaryStatus_in.getVal()));//sysj\orchestrator.sysj line: 214, column: 4
                                recRotaryStatus_1.setPresent();//sysj\orchestrator.sysj line: 215, column: 4
                                currsigs.addElement(recRotaryStatus_1);
                                recRotaryStatus_1.setValue(res_thread_13);//sysj\orchestrator.sysj line: 215, column: 4
                                S48495=0;
                                active[13]=1;
                                ends[13]=1;
                                tdone[13]=1;
                              }
                              else {
                                active[13]=1;
                                ends[13]=1;
                                tdone[13]=1;
                              }
                            }
                            else {
                              active[13]=1;
                              ends[13]=1;
                              tdone[13]=1;
                            }
                          }
                        }
                        else {
                          active[13]=1;
                          ends[13]=1;
                          tdone[13]=1;
                        }
                      }
                      else {
                        active[13]=1;
                        ends[13]=1;
                        tdone[13]=1;
                      }
                      break;
                    
                    case 1 : 
                      if(!rotaryReq_o.isACK()){//sysj\orchestrator.sysj line: 211, column: 4
                        rotaryReq_o.setREQ(false);//sysj\orchestrator.sysj line: 211, column: 4
                        ends[13]=2;
                        ;//sysj\orchestrator.sysj line: 211, column: 4
                        S48495=2;
                        S48546=0;
                        if(!rotaryStatus_in.isPartnerPresent() || rotaryStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 212, column: 4
                          rotaryStatus_in.setACK(false);//sysj\orchestrator.sysj line: 212, column: 4
                          S48546=1;
                          active[13]=1;
                          ends[13]=1;
                          tdone[13]=1;
                        }
                        else {
                          S48541=0;
                          if(!rotaryStatus_in.isREQ()){//sysj\orchestrator.sysj line: 212, column: 4
                            rotaryStatus_in.setACK(true);//sysj\orchestrator.sysj line: 212, column: 4
                            S48541=1;
                            if(rotaryStatus_in.isREQ()){//sysj\orchestrator.sysj line: 212, column: 4
                              rotaryStatus_in.setACK(false);//sysj\orchestrator.sysj line: 212, column: 4
                              ends[13]=2;
                              ;//sysj\orchestrator.sysj line: 212, column: 4
                              System.out.println("Orch: Received rotary status");//sysj\orchestrator.sysj line: 213, column: 4
                              res_thread_13 = (String)(rotaryStatus_in.getVal() == null ? null : ((String)rotaryStatus_in.getVal()));//sysj\orchestrator.sysj line: 214, column: 4
                              recRotaryStatus_1.setPresent();//sysj\orchestrator.sysj line: 215, column: 4
                              currsigs.addElement(recRotaryStatus_1);
                              recRotaryStatus_1.setValue(res_thread_13);//sysj\orchestrator.sysj line: 215, column: 4
                              S48495=0;
                              active[13]=1;
                              ends[13]=1;
                              tdone[13]=1;
                            }
                            else {
                              active[13]=1;
                              ends[13]=1;
                              tdone[13]=1;
                            }
                          }
                          else {
                            active[13]=1;
                            ends[13]=1;
                            tdone[13]=1;
                          }
                        }
                      }
                      else {
                        active[13]=1;
                        ends[13]=1;
                        tdone[13]=1;
                      }
                      break;
                    
                  }
                }
                break;
              
              case 1 : 
                S48502=1;
                S48502=0;
                if(!rotaryReq_o.isPartnerPresent() || rotaryReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 211, column: 4
                  rotaryReq_o.setREQ(false);//sysj\orchestrator.sysj line: 211, column: 4
                  S48502=1;
                  active[13]=1;
                  ends[13]=1;
                  tdone[13]=1;
                }
                else {
                  S48497=0;
                  if(rotaryReq_o.isACK()){//sysj\orchestrator.sysj line: 211, column: 4
                    rotaryReq_o.setVal(true);//sysj\orchestrator.sysj line: 211, column: 4
                    S48497=1;
                    if(!rotaryReq_o.isACK()){//sysj\orchestrator.sysj line: 211, column: 4
                      rotaryReq_o.setREQ(false);//sysj\orchestrator.sysj line: 211, column: 4
                      ends[13]=2;
                      ;//sysj\orchestrator.sysj line: 211, column: 4
                      S48495=2;
                      S48546=0;
                      if(!rotaryStatus_in.isPartnerPresent() || rotaryStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 212, column: 4
                        rotaryStatus_in.setACK(false);//sysj\orchestrator.sysj line: 212, column: 4
                        S48546=1;
                        active[13]=1;
                        ends[13]=1;
                        tdone[13]=1;
                      }
                      else {
                        S48541=0;
                        if(!rotaryStatus_in.isREQ()){//sysj\orchestrator.sysj line: 212, column: 4
                          rotaryStatus_in.setACK(true);//sysj\orchestrator.sysj line: 212, column: 4
                          S48541=1;
                          if(rotaryStatus_in.isREQ()){//sysj\orchestrator.sysj line: 212, column: 4
                            rotaryStatus_in.setACK(false);//sysj\orchestrator.sysj line: 212, column: 4
                            ends[13]=2;
                            ;//sysj\orchestrator.sysj line: 212, column: 4
                            System.out.println("Orch: Received rotary status");//sysj\orchestrator.sysj line: 213, column: 4
                            res_thread_13 = (String)(rotaryStatus_in.getVal() == null ? null : ((String)rotaryStatus_in.getVal()));//sysj\orchestrator.sysj line: 214, column: 4
                            recRotaryStatus_1.setPresent();//sysj\orchestrator.sysj line: 215, column: 4
                            currsigs.addElement(recRotaryStatus_1);
                            recRotaryStatus_1.setValue(res_thread_13);//sysj\orchestrator.sysj line: 215, column: 4
                            S48495=0;
                            active[13]=1;
                            ends[13]=1;
                            tdone[13]=1;
                          }
                          else {
                            active[13]=1;
                            ends[13]=1;
                            tdone[13]=1;
                          }
                        }
                        else {
                          active[13]=1;
                          ends[13]=1;
                          tdone[13]=1;
                        }
                      }
                    }
                    else {
                      active[13]=1;
                      ends[13]=1;
                      tdone[13]=1;
                    }
                  }
                  else {
                    active[13]=1;
                    ends[13]=1;
                    tdone[13]=1;
                  }
                }
                break;
              
            }
            break;
          
          case 2 : 
            switch(S48546){
              case 0 : 
                if(!rotaryStatus_in.isPartnerPresent() || rotaryStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 212, column: 4
                  rotaryStatus_in.setACK(false);//sysj\orchestrator.sysj line: 212, column: 4
                  S48546=1;
                  active[13]=1;
                  ends[13]=1;
                  tdone[13]=1;
                }
                else {
                  switch(S48541){
                    case 0 : 
                      if(!rotaryStatus_in.isREQ()){//sysj\orchestrator.sysj line: 212, column: 4
                        rotaryStatus_in.setACK(true);//sysj\orchestrator.sysj line: 212, column: 4
                        S48541=1;
                        if(rotaryStatus_in.isREQ()){//sysj\orchestrator.sysj line: 212, column: 4
                          rotaryStatus_in.setACK(false);//sysj\orchestrator.sysj line: 212, column: 4
                          ends[13]=2;
                          ;//sysj\orchestrator.sysj line: 212, column: 4
                          System.out.println("Orch: Received rotary status");//sysj\orchestrator.sysj line: 213, column: 4
                          res_thread_13 = (String)(rotaryStatus_in.getVal() == null ? null : ((String)rotaryStatus_in.getVal()));//sysj\orchestrator.sysj line: 214, column: 4
                          recRotaryStatus_1.setPresent();//sysj\orchestrator.sysj line: 215, column: 4
                          currsigs.addElement(recRotaryStatus_1);
                          recRotaryStatus_1.setValue(res_thread_13);//sysj\orchestrator.sysj line: 215, column: 4
                          S48495=0;
                          active[13]=1;
                          ends[13]=1;
                          tdone[13]=1;
                        }
                        else {
                          active[13]=1;
                          ends[13]=1;
                          tdone[13]=1;
                        }
                      }
                      else {
                        active[13]=1;
                        ends[13]=1;
                        tdone[13]=1;
                      }
                      break;
                    
                    case 1 : 
                      if(rotaryStatus_in.isREQ()){//sysj\orchestrator.sysj line: 212, column: 4
                        rotaryStatus_in.setACK(false);//sysj\orchestrator.sysj line: 212, column: 4
                        ends[13]=2;
                        ;//sysj\orchestrator.sysj line: 212, column: 4
                        System.out.println("Orch: Received rotary status");//sysj\orchestrator.sysj line: 213, column: 4
                        res_thread_13 = (String)(rotaryStatus_in.getVal() == null ? null : ((String)rotaryStatus_in.getVal()));//sysj\orchestrator.sysj line: 214, column: 4
                        recRotaryStatus_1.setPresent();//sysj\orchestrator.sysj line: 215, column: 4
                        currsigs.addElement(recRotaryStatus_1);
                        recRotaryStatus_1.setValue(res_thread_13);//sysj\orchestrator.sysj line: 215, column: 4
                        S48495=0;
                        active[13]=1;
                        ends[13]=1;
                        tdone[13]=1;
                      }
                      else {
                        active[13]=1;
                        ends[13]=1;
                        tdone[13]=1;
                      }
                      break;
                    
                  }
                }
                break;
              
              case 1 : 
                S48546=1;
                S48546=0;
                if(!rotaryStatus_in.isPartnerPresent() || rotaryStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 212, column: 4
                  rotaryStatus_in.setACK(false);//sysj\orchestrator.sysj line: 212, column: 4
                  S48546=1;
                  active[13]=1;
                  ends[13]=1;
                  tdone[13]=1;
                }
                else {
                  S48541=0;
                  if(!rotaryStatus_in.isREQ()){//sysj\orchestrator.sysj line: 212, column: 4
                    rotaryStatus_in.setACK(true);//sysj\orchestrator.sysj line: 212, column: 4
                    S48541=1;
                    if(rotaryStatus_in.isREQ()){//sysj\orchestrator.sysj line: 212, column: 4
                      rotaryStatus_in.setACK(false);//sysj\orchestrator.sysj line: 212, column: 4
                      ends[13]=2;
                      ;//sysj\orchestrator.sysj line: 212, column: 4
                      System.out.println("Orch: Received rotary status");//sysj\orchestrator.sysj line: 213, column: 4
                      res_thread_13 = (String)(rotaryStatus_in.getVal() == null ? null : ((String)rotaryStatus_in.getVal()));//sysj\orchestrator.sysj line: 214, column: 4
                      recRotaryStatus_1.setPresent();//sysj\orchestrator.sysj line: 215, column: 4
                      currsigs.addElement(recRotaryStatus_1);
                      recRotaryStatus_1.setValue(res_thread_13);//sysj\orchestrator.sysj line: 215, column: 4
                      S48495=0;
                      active[13]=1;
                      ends[13]=1;
                      tdone[13]=1;
                    }
                    else {
                      active[13]=1;
                      ends[13]=1;
                      tdone[13]=1;
                    }
                  }
                  else {
                    active[13]=1;
                    ends[13]=1;
                    tdone[13]=1;
                  }
                }
                break;
              
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread51120(int [] tdone, int [] ends){
        switch(S48493){
      case 0 : 
        active[12]=0;
        ends[12]=0;
        tdone[12]=1;
        break;
      
      case 1 : 
        switch(S47549){
          case 0 : 
            if(sigFillerReq_1.getprestatus()){//sysj\orchestrator.sysj line: 194, column: 10
              fillerStatusUIE.setPresent();//sysj\orchestrator.sysj line: 195, column: 4
              currsigs.addElement(fillerStatusUIE);
              fillerStatusUIE.setValue(true);//sysj\orchestrator.sysj line: 195, column: 4
              System.out.println("Orch: Sending filler request");//sysj\orchestrator.sysj line: 196, column: 4
              req_thread_12 = (ArrayList)(sigFillerReq_1.getpreval() == null ? null : ((ArrayList)sigFillerReq_1.getpreval()));//sysj\orchestrator.sysj line: 197, column: 4
              S47549=1;
              S47556=0;
              if(!fillerReq_o.isPartnerPresent() || fillerReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 198, column: 4
                fillerReq_o.setREQ(false);//sysj\orchestrator.sysj line: 198, column: 4
                S47556=1;
                active[12]=1;
                ends[12]=1;
                tdone[12]=1;
              }
              else {
                S47551=0;
                if(fillerReq_o.isACK()){//sysj\orchestrator.sysj line: 198, column: 4
                  fillerReq_o.setVal(req_thread_12);//sysj\orchestrator.sysj line: 198, column: 4
                  S47551=1;
                  if(!fillerReq_o.isACK()){//sysj\orchestrator.sysj line: 198, column: 4
                    fillerReq_o.setREQ(false);//sysj\orchestrator.sysj line: 198, column: 4
                    ends[12]=2;
                    ;//sysj\orchestrator.sysj line: 198, column: 4
                    S47549=2;
                    S47600=0;
                    if(!fillerStatus_in.isPartnerPresent() || fillerStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 199, column: 4
                      fillerStatus_in.setACK(false);//sysj\orchestrator.sysj line: 199, column: 4
                      S47600=1;
                      active[12]=1;
                      ends[12]=1;
                      tdone[12]=1;
                    }
                    else {
                      S47595=0;
                      if(!fillerStatus_in.isREQ()){//sysj\orchestrator.sysj line: 199, column: 4
                        fillerStatus_in.setACK(true);//sysj\orchestrator.sysj line: 199, column: 4
                        S47595=1;
                        if(fillerStatus_in.isREQ()){//sysj\orchestrator.sysj line: 199, column: 4
                          fillerStatus_in.setACK(false);//sysj\orchestrator.sysj line: 199, column: 4
                          ends[12]=2;
                          ;//sysj\orchestrator.sysj line: 199, column: 4
                          System.out.println("Orch: Received filler status");//sysj\orchestrator.sysj line: 200, column: 4
                          res_thread_12 = (String)(fillerStatus_in.getVal() == null ? null : ((String)fillerStatus_in.getVal()));//sysj\orchestrator.sysj line: 201, column: 4
                          recFillerStatus_1.setPresent();//sysj\orchestrator.sysj line: 202, column: 4
                          currsigs.addElement(recFillerStatus_1);
                          recFillerStatus_1.setValue(res_thread_12);//sysj\orchestrator.sysj line: 202, column: 4
                          fillerStatusUIE.setPresent();//sysj\orchestrator.sysj line: 193, column: 4
                          currsigs.addElement(fillerStatusUIE);
                          fillerStatusUIE.setValue(false);//sysj\orchestrator.sysj line: 193, column: 4
                          S47549=0;
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
                        active[12]=1;
                        ends[12]=1;
                        tdone[12]=1;
                      }
                    }
                  }
                  else {
                    active[12]=1;
                    ends[12]=1;
                    tdone[12]=1;
                  }
                }
                else {
                  active[12]=1;
                  ends[12]=1;
                  tdone[12]=1;
                }
              }
            }
            else {
              active[12]=1;
              ends[12]=1;
              tdone[12]=1;
            }
            break;
          
          case 1 : 
            switch(S47556){
              case 0 : 
                if(!fillerReq_o.isPartnerPresent() || fillerReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 198, column: 4
                  fillerReq_o.setREQ(false);//sysj\orchestrator.sysj line: 198, column: 4
                  S47556=1;
                  active[12]=1;
                  ends[12]=1;
                  tdone[12]=1;
                }
                else {
                  switch(S47551){
                    case 0 : 
                      if(fillerReq_o.isACK()){//sysj\orchestrator.sysj line: 198, column: 4
                        fillerReq_o.setVal(req_thread_12);//sysj\orchestrator.sysj line: 198, column: 4
                        S47551=1;
                        if(!fillerReq_o.isACK()){//sysj\orchestrator.sysj line: 198, column: 4
                          fillerReq_o.setREQ(false);//sysj\orchestrator.sysj line: 198, column: 4
                          ends[12]=2;
                          ;//sysj\orchestrator.sysj line: 198, column: 4
                          S47549=2;
                          S47600=0;
                          if(!fillerStatus_in.isPartnerPresent() || fillerStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 199, column: 4
                            fillerStatus_in.setACK(false);//sysj\orchestrator.sysj line: 199, column: 4
                            S47600=1;
                            active[12]=1;
                            ends[12]=1;
                            tdone[12]=1;
                          }
                          else {
                            S47595=0;
                            if(!fillerStatus_in.isREQ()){//sysj\orchestrator.sysj line: 199, column: 4
                              fillerStatus_in.setACK(true);//sysj\orchestrator.sysj line: 199, column: 4
                              S47595=1;
                              if(fillerStatus_in.isREQ()){//sysj\orchestrator.sysj line: 199, column: 4
                                fillerStatus_in.setACK(false);//sysj\orchestrator.sysj line: 199, column: 4
                                ends[12]=2;
                                ;//sysj\orchestrator.sysj line: 199, column: 4
                                System.out.println("Orch: Received filler status");//sysj\orchestrator.sysj line: 200, column: 4
                                res_thread_12 = (String)(fillerStatus_in.getVal() == null ? null : ((String)fillerStatus_in.getVal()));//sysj\orchestrator.sysj line: 201, column: 4
                                recFillerStatus_1.setPresent();//sysj\orchestrator.sysj line: 202, column: 4
                                currsigs.addElement(recFillerStatus_1);
                                recFillerStatus_1.setValue(res_thread_12);//sysj\orchestrator.sysj line: 202, column: 4
                                fillerStatusUIE.setPresent();//sysj\orchestrator.sysj line: 193, column: 4
                                currsigs.addElement(fillerStatusUIE);
                                fillerStatusUIE.setValue(false);//sysj\orchestrator.sysj line: 193, column: 4
                                S47549=0;
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
                              active[12]=1;
                              ends[12]=1;
                              tdone[12]=1;
                            }
                          }
                        }
                        else {
                          active[12]=1;
                          ends[12]=1;
                          tdone[12]=1;
                        }
                      }
                      else {
                        active[12]=1;
                        ends[12]=1;
                        tdone[12]=1;
                      }
                      break;
                    
                    case 1 : 
                      if(!fillerReq_o.isACK()){//sysj\orchestrator.sysj line: 198, column: 4
                        fillerReq_o.setREQ(false);//sysj\orchestrator.sysj line: 198, column: 4
                        ends[12]=2;
                        ;//sysj\orchestrator.sysj line: 198, column: 4
                        S47549=2;
                        S47600=0;
                        if(!fillerStatus_in.isPartnerPresent() || fillerStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 199, column: 4
                          fillerStatus_in.setACK(false);//sysj\orchestrator.sysj line: 199, column: 4
                          S47600=1;
                          active[12]=1;
                          ends[12]=1;
                          tdone[12]=1;
                        }
                        else {
                          S47595=0;
                          if(!fillerStatus_in.isREQ()){//sysj\orchestrator.sysj line: 199, column: 4
                            fillerStatus_in.setACK(true);//sysj\orchestrator.sysj line: 199, column: 4
                            S47595=1;
                            if(fillerStatus_in.isREQ()){//sysj\orchestrator.sysj line: 199, column: 4
                              fillerStatus_in.setACK(false);//sysj\orchestrator.sysj line: 199, column: 4
                              ends[12]=2;
                              ;//sysj\orchestrator.sysj line: 199, column: 4
                              System.out.println("Orch: Received filler status");//sysj\orchestrator.sysj line: 200, column: 4
                              res_thread_12 = (String)(fillerStatus_in.getVal() == null ? null : ((String)fillerStatus_in.getVal()));//sysj\orchestrator.sysj line: 201, column: 4
                              recFillerStatus_1.setPresent();//sysj\orchestrator.sysj line: 202, column: 4
                              currsigs.addElement(recFillerStatus_1);
                              recFillerStatus_1.setValue(res_thread_12);//sysj\orchestrator.sysj line: 202, column: 4
                              fillerStatusUIE.setPresent();//sysj\orchestrator.sysj line: 193, column: 4
                              currsigs.addElement(fillerStatusUIE);
                              fillerStatusUIE.setValue(false);//sysj\orchestrator.sysj line: 193, column: 4
                              S47549=0;
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
                            active[12]=1;
                            ends[12]=1;
                            tdone[12]=1;
                          }
                        }
                      }
                      else {
                        active[12]=1;
                        ends[12]=1;
                        tdone[12]=1;
                      }
                      break;
                    
                  }
                }
                break;
              
              case 1 : 
                S47556=1;
                S47556=0;
                if(!fillerReq_o.isPartnerPresent() || fillerReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 198, column: 4
                  fillerReq_o.setREQ(false);//sysj\orchestrator.sysj line: 198, column: 4
                  S47556=1;
                  active[12]=1;
                  ends[12]=1;
                  tdone[12]=1;
                }
                else {
                  S47551=0;
                  if(fillerReq_o.isACK()){//sysj\orchestrator.sysj line: 198, column: 4
                    fillerReq_o.setVal(req_thread_12);//sysj\orchestrator.sysj line: 198, column: 4
                    S47551=1;
                    if(!fillerReq_o.isACK()){//sysj\orchestrator.sysj line: 198, column: 4
                      fillerReq_o.setREQ(false);//sysj\orchestrator.sysj line: 198, column: 4
                      ends[12]=2;
                      ;//sysj\orchestrator.sysj line: 198, column: 4
                      S47549=2;
                      S47600=0;
                      if(!fillerStatus_in.isPartnerPresent() || fillerStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 199, column: 4
                        fillerStatus_in.setACK(false);//sysj\orchestrator.sysj line: 199, column: 4
                        S47600=1;
                        active[12]=1;
                        ends[12]=1;
                        tdone[12]=1;
                      }
                      else {
                        S47595=0;
                        if(!fillerStatus_in.isREQ()){//sysj\orchestrator.sysj line: 199, column: 4
                          fillerStatus_in.setACK(true);//sysj\orchestrator.sysj line: 199, column: 4
                          S47595=1;
                          if(fillerStatus_in.isREQ()){//sysj\orchestrator.sysj line: 199, column: 4
                            fillerStatus_in.setACK(false);//sysj\orchestrator.sysj line: 199, column: 4
                            ends[12]=2;
                            ;//sysj\orchestrator.sysj line: 199, column: 4
                            System.out.println("Orch: Received filler status");//sysj\orchestrator.sysj line: 200, column: 4
                            res_thread_12 = (String)(fillerStatus_in.getVal() == null ? null : ((String)fillerStatus_in.getVal()));//sysj\orchestrator.sysj line: 201, column: 4
                            recFillerStatus_1.setPresent();//sysj\orchestrator.sysj line: 202, column: 4
                            currsigs.addElement(recFillerStatus_1);
                            recFillerStatus_1.setValue(res_thread_12);//sysj\orchestrator.sysj line: 202, column: 4
                            fillerStatusUIE.setPresent();//sysj\orchestrator.sysj line: 193, column: 4
                            currsigs.addElement(fillerStatusUIE);
                            fillerStatusUIE.setValue(false);//sysj\orchestrator.sysj line: 193, column: 4
                            S47549=0;
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
                          active[12]=1;
                          ends[12]=1;
                          tdone[12]=1;
                        }
                      }
                    }
                    else {
                      active[12]=1;
                      ends[12]=1;
                      tdone[12]=1;
                    }
                  }
                  else {
                    active[12]=1;
                    ends[12]=1;
                    tdone[12]=1;
                  }
                }
                break;
              
            }
            break;
          
          case 2 : 
            switch(S47600){
              case 0 : 
                if(!fillerStatus_in.isPartnerPresent() || fillerStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 199, column: 4
                  fillerStatus_in.setACK(false);//sysj\orchestrator.sysj line: 199, column: 4
                  S47600=1;
                  active[12]=1;
                  ends[12]=1;
                  tdone[12]=1;
                }
                else {
                  switch(S47595){
                    case 0 : 
                      if(!fillerStatus_in.isREQ()){//sysj\orchestrator.sysj line: 199, column: 4
                        fillerStatus_in.setACK(true);//sysj\orchestrator.sysj line: 199, column: 4
                        S47595=1;
                        if(fillerStatus_in.isREQ()){//sysj\orchestrator.sysj line: 199, column: 4
                          fillerStatus_in.setACK(false);//sysj\orchestrator.sysj line: 199, column: 4
                          ends[12]=2;
                          ;//sysj\orchestrator.sysj line: 199, column: 4
                          System.out.println("Orch: Received filler status");//sysj\orchestrator.sysj line: 200, column: 4
                          res_thread_12 = (String)(fillerStatus_in.getVal() == null ? null : ((String)fillerStatus_in.getVal()));//sysj\orchestrator.sysj line: 201, column: 4
                          recFillerStatus_1.setPresent();//sysj\orchestrator.sysj line: 202, column: 4
                          currsigs.addElement(recFillerStatus_1);
                          recFillerStatus_1.setValue(res_thread_12);//sysj\orchestrator.sysj line: 202, column: 4
                          fillerStatusUIE.setPresent();//sysj\orchestrator.sysj line: 193, column: 4
                          currsigs.addElement(fillerStatusUIE);
                          fillerStatusUIE.setValue(false);//sysj\orchestrator.sysj line: 193, column: 4
                          S47549=0;
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
                        active[12]=1;
                        ends[12]=1;
                        tdone[12]=1;
                      }
                      break;
                    
                    case 1 : 
                      if(fillerStatus_in.isREQ()){//sysj\orchestrator.sysj line: 199, column: 4
                        fillerStatus_in.setACK(false);//sysj\orchestrator.sysj line: 199, column: 4
                        ends[12]=2;
                        ;//sysj\orchestrator.sysj line: 199, column: 4
                        System.out.println("Orch: Received filler status");//sysj\orchestrator.sysj line: 200, column: 4
                        res_thread_12 = (String)(fillerStatus_in.getVal() == null ? null : ((String)fillerStatus_in.getVal()));//sysj\orchestrator.sysj line: 201, column: 4
                        recFillerStatus_1.setPresent();//sysj\orchestrator.sysj line: 202, column: 4
                        currsigs.addElement(recFillerStatus_1);
                        recFillerStatus_1.setValue(res_thread_12);//sysj\orchestrator.sysj line: 202, column: 4
                        fillerStatusUIE.setPresent();//sysj\orchestrator.sysj line: 193, column: 4
                        currsigs.addElement(fillerStatusUIE);
                        fillerStatusUIE.setValue(false);//sysj\orchestrator.sysj line: 193, column: 4
                        S47549=0;
                        active[12]=1;
                        ends[12]=1;
                        tdone[12]=1;
                      }
                      else {
                        active[12]=1;
                        ends[12]=1;
                        tdone[12]=1;
                      }
                      break;
                    
                  }
                }
                break;
              
              case 1 : 
                S47600=1;
                S47600=0;
                if(!fillerStatus_in.isPartnerPresent() || fillerStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 199, column: 4
                  fillerStatus_in.setACK(false);//sysj\orchestrator.sysj line: 199, column: 4
                  S47600=1;
                  active[12]=1;
                  ends[12]=1;
                  tdone[12]=1;
                }
                else {
                  S47595=0;
                  if(!fillerStatus_in.isREQ()){//sysj\orchestrator.sysj line: 199, column: 4
                    fillerStatus_in.setACK(true);//sysj\orchestrator.sysj line: 199, column: 4
                    S47595=1;
                    if(fillerStatus_in.isREQ()){//sysj\orchestrator.sysj line: 199, column: 4
                      fillerStatus_in.setACK(false);//sysj\orchestrator.sysj line: 199, column: 4
                      ends[12]=2;
                      ;//sysj\orchestrator.sysj line: 199, column: 4
                      System.out.println("Orch: Received filler status");//sysj\orchestrator.sysj line: 200, column: 4
                      res_thread_12 = (String)(fillerStatus_in.getVal() == null ? null : ((String)fillerStatus_in.getVal()));//sysj\orchestrator.sysj line: 201, column: 4
                      recFillerStatus_1.setPresent();//sysj\orchestrator.sysj line: 202, column: 4
                      currsigs.addElement(recFillerStatus_1);
                      recFillerStatus_1.setValue(res_thread_12);//sysj\orchestrator.sysj line: 202, column: 4
                      fillerStatusUIE.setPresent();//sysj\orchestrator.sysj line: 193, column: 4
                      currsigs.addElement(fillerStatusUIE);
                      fillerStatusUIE.setValue(false);//sysj\orchestrator.sysj line: 193, column: 4
                      S47549=0;
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
                    active[12]=1;
                    ends[12]=1;
                    tdone[12]=1;
                  }
                }
                break;
              
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread51119(int [] tdone, int [] ends){
        switch(S47546){
      case 0 : 
        active[11]=0;
        ends[11]=0;
        tdone[11]=1;
        break;
      
      case 1 : 
        switch(S46602){
          case 0 : 
            if(sigCapLoaderReq_1.getprestatus()){//sysj\orchestrator.sysj line: 180, column: 10
              capLoaderStatusUIE.setPresent();//sysj\orchestrator.sysj line: 181, column: 4
              currsigs.addElement(capLoaderStatusUIE);
              capLoaderStatusUIE.setValue(true);//sysj\orchestrator.sysj line: 181, column: 4
              System.out.println("Orch: Sending cap loader request");//sysj\orchestrator.sysj line: 182, column: 4
              S46602=1;
              S46609=0;
              if(!capLoaderReq_o.isPartnerPresent() || capLoaderReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 183, column: 4
                capLoaderReq_o.setREQ(false);//sysj\orchestrator.sysj line: 183, column: 4
                S46609=1;
                active[11]=1;
                ends[11]=1;
                tdone[11]=1;
              }
              else {
                S46604=0;
                if(capLoaderReq_o.isACK()){//sysj\orchestrator.sysj line: 183, column: 4
                  capLoaderReq_o.setVal(true);//sysj\orchestrator.sysj line: 183, column: 4
                  S46604=1;
                  if(!capLoaderReq_o.isACK()){//sysj\orchestrator.sysj line: 183, column: 4
                    capLoaderReq_o.setREQ(false);//sysj\orchestrator.sysj line: 183, column: 4
                    ends[11]=2;
                    ;//sysj\orchestrator.sysj line: 183, column: 4
                    S46602=2;
                    S46653=0;
                    if(!capLoaderStatus_in.isPartnerPresent() || capLoaderStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 184, column: 4
                      capLoaderStatus_in.setACK(false);//sysj\orchestrator.sysj line: 184, column: 4
                      S46653=1;
                      active[11]=1;
                      ends[11]=1;
                      tdone[11]=1;
                    }
                    else {
                      S46648=0;
                      if(!capLoaderStatus_in.isREQ()){//sysj\orchestrator.sysj line: 184, column: 4
                        capLoaderStatus_in.setACK(true);//sysj\orchestrator.sysj line: 184, column: 4
                        S46648=1;
                        if(capLoaderStatus_in.isREQ()){//sysj\orchestrator.sysj line: 184, column: 4
                          capLoaderStatus_in.setACK(false);//sysj\orchestrator.sysj line: 184, column: 4
                          ends[11]=2;
                          ;//sysj\orchestrator.sysj line: 184, column: 4
                          System.out.println("Orch: Received cap loader status");//sysj\orchestrator.sysj line: 185, column: 4
                          res_thread_11 = (String)(capLoaderStatus_in.getVal() == null ? null : ((String)capLoaderStatus_in.getVal()));//sysj\orchestrator.sysj line: 186, column: 4
                          recCapLoaderStatus_1.setPresent();//sysj\orchestrator.sysj line: 187, column: 4
                          currsigs.addElement(recCapLoaderStatus_1);
                          recCapLoaderStatus_1.setValue(res_thread_11);//sysj\orchestrator.sysj line: 187, column: 4
                          capLoaderStatusUIE.setPresent();//sysj\orchestrator.sysj line: 179, column: 4
                          currsigs.addElement(capLoaderStatusUIE);
                          capLoaderStatusUIE.setValue(false);//sysj\orchestrator.sysj line: 179, column: 4
                          S46602=0;
                          active[11]=1;
                          ends[11]=1;
                          tdone[11]=1;
                        }
                        else {
                          active[11]=1;
                          ends[11]=1;
                          tdone[11]=1;
                        }
                      }
                      else {
                        active[11]=1;
                        ends[11]=1;
                        tdone[11]=1;
                      }
                    }
                  }
                  else {
                    active[11]=1;
                    ends[11]=1;
                    tdone[11]=1;
                  }
                }
                else {
                  active[11]=1;
                  ends[11]=1;
                  tdone[11]=1;
                }
              }
            }
            else {
              active[11]=1;
              ends[11]=1;
              tdone[11]=1;
            }
            break;
          
          case 1 : 
            switch(S46609){
              case 0 : 
                if(!capLoaderReq_o.isPartnerPresent() || capLoaderReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 183, column: 4
                  capLoaderReq_o.setREQ(false);//sysj\orchestrator.sysj line: 183, column: 4
                  S46609=1;
                  active[11]=1;
                  ends[11]=1;
                  tdone[11]=1;
                }
                else {
                  switch(S46604){
                    case 0 : 
                      if(capLoaderReq_o.isACK()){//sysj\orchestrator.sysj line: 183, column: 4
                        capLoaderReq_o.setVal(true);//sysj\orchestrator.sysj line: 183, column: 4
                        S46604=1;
                        if(!capLoaderReq_o.isACK()){//sysj\orchestrator.sysj line: 183, column: 4
                          capLoaderReq_o.setREQ(false);//sysj\orchestrator.sysj line: 183, column: 4
                          ends[11]=2;
                          ;//sysj\orchestrator.sysj line: 183, column: 4
                          S46602=2;
                          S46653=0;
                          if(!capLoaderStatus_in.isPartnerPresent() || capLoaderStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 184, column: 4
                            capLoaderStatus_in.setACK(false);//sysj\orchestrator.sysj line: 184, column: 4
                            S46653=1;
                            active[11]=1;
                            ends[11]=1;
                            tdone[11]=1;
                          }
                          else {
                            S46648=0;
                            if(!capLoaderStatus_in.isREQ()){//sysj\orchestrator.sysj line: 184, column: 4
                              capLoaderStatus_in.setACK(true);//sysj\orchestrator.sysj line: 184, column: 4
                              S46648=1;
                              if(capLoaderStatus_in.isREQ()){//sysj\orchestrator.sysj line: 184, column: 4
                                capLoaderStatus_in.setACK(false);//sysj\orchestrator.sysj line: 184, column: 4
                                ends[11]=2;
                                ;//sysj\orchestrator.sysj line: 184, column: 4
                                System.out.println("Orch: Received cap loader status");//sysj\orchestrator.sysj line: 185, column: 4
                                res_thread_11 = (String)(capLoaderStatus_in.getVal() == null ? null : ((String)capLoaderStatus_in.getVal()));//sysj\orchestrator.sysj line: 186, column: 4
                                recCapLoaderStatus_1.setPresent();//sysj\orchestrator.sysj line: 187, column: 4
                                currsigs.addElement(recCapLoaderStatus_1);
                                recCapLoaderStatus_1.setValue(res_thread_11);//sysj\orchestrator.sysj line: 187, column: 4
                                capLoaderStatusUIE.setPresent();//sysj\orchestrator.sysj line: 179, column: 4
                                currsigs.addElement(capLoaderStatusUIE);
                                capLoaderStatusUIE.setValue(false);//sysj\orchestrator.sysj line: 179, column: 4
                                S46602=0;
                                active[11]=1;
                                ends[11]=1;
                                tdone[11]=1;
                              }
                              else {
                                active[11]=1;
                                ends[11]=1;
                                tdone[11]=1;
                              }
                            }
                            else {
                              active[11]=1;
                              ends[11]=1;
                              tdone[11]=1;
                            }
                          }
                        }
                        else {
                          active[11]=1;
                          ends[11]=1;
                          tdone[11]=1;
                        }
                      }
                      else {
                        active[11]=1;
                        ends[11]=1;
                        tdone[11]=1;
                      }
                      break;
                    
                    case 1 : 
                      if(!capLoaderReq_o.isACK()){//sysj\orchestrator.sysj line: 183, column: 4
                        capLoaderReq_o.setREQ(false);//sysj\orchestrator.sysj line: 183, column: 4
                        ends[11]=2;
                        ;//sysj\orchestrator.sysj line: 183, column: 4
                        S46602=2;
                        S46653=0;
                        if(!capLoaderStatus_in.isPartnerPresent() || capLoaderStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 184, column: 4
                          capLoaderStatus_in.setACK(false);//sysj\orchestrator.sysj line: 184, column: 4
                          S46653=1;
                          active[11]=1;
                          ends[11]=1;
                          tdone[11]=1;
                        }
                        else {
                          S46648=0;
                          if(!capLoaderStatus_in.isREQ()){//sysj\orchestrator.sysj line: 184, column: 4
                            capLoaderStatus_in.setACK(true);//sysj\orchestrator.sysj line: 184, column: 4
                            S46648=1;
                            if(capLoaderStatus_in.isREQ()){//sysj\orchestrator.sysj line: 184, column: 4
                              capLoaderStatus_in.setACK(false);//sysj\orchestrator.sysj line: 184, column: 4
                              ends[11]=2;
                              ;//sysj\orchestrator.sysj line: 184, column: 4
                              System.out.println("Orch: Received cap loader status");//sysj\orchestrator.sysj line: 185, column: 4
                              res_thread_11 = (String)(capLoaderStatus_in.getVal() == null ? null : ((String)capLoaderStatus_in.getVal()));//sysj\orchestrator.sysj line: 186, column: 4
                              recCapLoaderStatus_1.setPresent();//sysj\orchestrator.sysj line: 187, column: 4
                              currsigs.addElement(recCapLoaderStatus_1);
                              recCapLoaderStatus_1.setValue(res_thread_11);//sysj\orchestrator.sysj line: 187, column: 4
                              capLoaderStatusUIE.setPresent();//sysj\orchestrator.sysj line: 179, column: 4
                              currsigs.addElement(capLoaderStatusUIE);
                              capLoaderStatusUIE.setValue(false);//sysj\orchestrator.sysj line: 179, column: 4
                              S46602=0;
                              active[11]=1;
                              ends[11]=1;
                              tdone[11]=1;
                            }
                            else {
                              active[11]=1;
                              ends[11]=1;
                              tdone[11]=1;
                            }
                          }
                          else {
                            active[11]=1;
                            ends[11]=1;
                            tdone[11]=1;
                          }
                        }
                      }
                      else {
                        active[11]=1;
                        ends[11]=1;
                        tdone[11]=1;
                      }
                      break;
                    
                  }
                }
                break;
              
              case 1 : 
                S46609=1;
                S46609=0;
                if(!capLoaderReq_o.isPartnerPresent() || capLoaderReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 183, column: 4
                  capLoaderReq_o.setREQ(false);//sysj\orchestrator.sysj line: 183, column: 4
                  S46609=1;
                  active[11]=1;
                  ends[11]=1;
                  tdone[11]=1;
                }
                else {
                  S46604=0;
                  if(capLoaderReq_o.isACK()){//sysj\orchestrator.sysj line: 183, column: 4
                    capLoaderReq_o.setVal(true);//sysj\orchestrator.sysj line: 183, column: 4
                    S46604=1;
                    if(!capLoaderReq_o.isACK()){//sysj\orchestrator.sysj line: 183, column: 4
                      capLoaderReq_o.setREQ(false);//sysj\orchestrator.sysj line: 183, column: 4
                      ends[11]=2;
                      ;//sysj\orchestrator.sysj line: 183, column: 4
                      S46602=2;
                      S46653=0;
                      if(!capLoaderStatus_in.isPartnerPresent() || capLoaderStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 184, column: 4
                        capLoaderStatus_in.setACK(false);//sysj\orchestrator.sysj line: 184, column: 4
                        S46653=1;
                        active[11]=1;
                        ends[11]=1;
                        tdone[11]=1;
                      }
                      else {
                        S46648=0;
                        if(!capLoaderStatus_in.isREQ()){//sysj\orchestrator.sysj line: 184, column: 4
                          capLoaderStatus_in.setACK(true);//sysj\orchestrator.sysj line: 184, column: 4
                          S46648=1;
                          if(capLoaderStatus_in.isREQ()){//sysj\orchestrator.sysj line: 184, column: 4
                            capLoaderStatus_in.setACK(false);//sysj\orchestrator.sysj line: 184, column: 4
                            ends[11]=2;
                            ;//sysj\orchestrator.sysj line: 184, column: 4
                            System.out.println("Orch: Received cap loader status");//sysj\orchestrator.sysj line: 185, column: 4
                            res_thread_11 = (String)(capLoaderStatus_in.getVal() == null ? null : ((String)capLoaderStatus_in.getVal()));//sysj\orchestrator.sysj line: 186, column: 4
                            recCapLoaderStatus_1.setPresent();//sysj\orchestrator.sysj line: 187, column: 4
                            currsigs.addElement(recCapLoaderStatus_1);
                            recCapLoaderStatus_1.setValue(res_thread_11);//sysj\orchestrator.sysj line: 187, column: 4
                            capLoaderStatusUIE.setPresent();//sysj\orchestrator.sysj line: 179, column: 4
                            currsigs.addElement(capLoaderStatusUIE);
                            capLoaderStatusUIE.setValue(false);//sysj\orchestrator.sysj line: 179, column: 4
                            S46602=0;
                            active[11]=1;
                            ends[11]=1;
                            tdone[11]=1;
                          }
                          else {
                            active[11]=1;
                            ends[11]=1;
                            tdone[11]=1;
                          }
                        }
                        else {
                          active[11]=1;
                          ends[11]=1;
                          tdone[11]=1;
                        }
                      }
                    }
                    else {
                      active[11]=1;
                      ends[11]=1;
                      tdone[11]=1;
                    }
                  }
                  else {
                    active[11]=1;
                    ends[11]=1;
                    tdone[11]=1;
                  }
                }
                break;
              
            }
            break;
          
          case 2 : 
            switch(S46653){
              case 0 : 
                if(!capLoaderStatus_in.isPartnerPresent() || capLoaderStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 184, column: 4
                  capLoaderStatus_in.setACK(false);//sysj\orchestrator.sysj line: 184, column: 4
                  S46653=1;
                  active[11]=1;
                  ends[11]=1;
                  tdone[11]=1;
                }
                else {
                  switch(S46648){
                    case 0 : 
                      if(!capLoaderStatus_in.isREQ()){//sysj\orchestrator.sysj line: 184, column: 4
                        capLoaderStatus_in.setACK(true);//sysj\orchestrator.sysj line: 184, column: 4
                        S46648=1;
                        if(capLoaderStatus_in.isREQ()){//sysj\orchestrator.sysj line: 184, column: 4
                          capLoaderStatus_in.setACK(false);//sysj\orchestrator.sysj line: 184, column: 4
                          ends[11]=2;
                          ;//sysj\orchestrator.sysj line: 184, column: 4
                          System.out.println("Orch: Received cap loader status");//sysj\orchestrator.sysj line: 185, column: 4
                          res_thread_11 = (String)(capLoaderStatus_in.getVal() == null ? null : ((String)capLoaderStatus_in.getVal()));//sysj\orchestrator.sysj line: 186, column: 4
                          recCapLoaderStatus_1.setPresent();//sysj\orchestrator.sysj line: 187, column: 4
                          currsigs.addElement(recCapLoaderStatus_1);
                          recCapLoaderStatus_1.setValue(res_thread_11);//sysj\orchestrator.sysj line: 187, column: 4
                          capLoaderStatusUIE.setPresent();//sysj\orchestrator.sysj line: 179, column: 4
                          currsigs.addElement(capLoaderStatusUIE);
                          capLoaderStatusUIE.setValue(false);//sysj\orchestrator.sysj line: 179, column: 4
                          S46602=0;
                          active[11]=1;
                          ends[11]=1;
                          tdone[11]=1;
                        }
                        else {
                          active[11]=1;
                          ends[11]=1;
                          tdone[11]=1;
                        }
                      }
                      else {
                        active[11]=1;
                        ends[11]=1;
                        tdone[11]=1;
                      }
                      break;
                    
                    case 1 : 
                      if(capLoaderStatus_in.isREQ()){//sysj\orchestrator.sysj line: 184, column: 4
                        capLoaderStatus_in.setACK(false);//sysj\orchestrator.sysj line: 184, column: 4
                        ends[11]=2;
                        ;//sysj\orchestrator.sysj line: 184, column: 4
                        System.out.println("Orch: Received cap loader status");//sysj\orchestrator.sysj line: 185, column: 4
                        res_thread_11 = (String)(capLoaderStatus_in.getVal() == null ? null : ((String)capLoaderStatus_in.getVal()));//sysj\orchestrator.sysj line: 186, column: 4
                        recCapLoaderStatus_1.setPresent();//sysj\orchestrator.sysj line: 187, column: 4
                        currsigs.addElement(recCapLoaderStatus_1);
                        recCapLoaderStatus_1.setValue(res_thread_11);//sysj\orchestrator.sysj line: 187, column: 4
                        capLoaderStatusUIE.setPresent();//sysj\orchestrator.sysj line: 179, column: 4
                        currsigs.addElement(capLoaderStatusUIE);
                        capLoaderStatusUIE.setValue(false);//sysj\orchestrator.sysj line: 179, column: 4
                        S46602=0;
                        active[11]=1;
                        ends[11]=1;
                        tdone[11]=1;
                      }
                      else {
                        active[11]=1;
                        ends[11]=1;
                        tdone[11]=1;
                      }
                      break;
                    
                  }
                }
                break;
              
              case 1 : 
                S46653=1;
                S46653=0;
                if(!capLoaderStatus_in.isPartnerPresent() || capLoaderStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 184, column: 4
                  capLoaderStatus_in.setACK(false);//sysj\orchestrator.sysj line: 184, column: 4
                  S46653=1;
                  active[11]=1;
                  ends[11]=1;
                  tdone[11]=1;
                }
                else {
                  S46648=0;
                  if(!capLoaderStatus_in.isREQ()){//sysj\orchestrator.sysj line: 184, column: 4
                    capLoaderStatus_in.setACK(true);//sysj\orchestrator.sysj line: 184, column: 4
                    S46648=1;
                    if(capLoaderStatus_in.isREQ()){//sysj\orchestrator.sysj line: 184, column: 4
                      capLoaderStatus_in.setACK(false);//sysj\orchestrator.sysj line: 184, column: 4
                      ends[11]=2;
                      ;//sysj\orchestrator.sysj line: 184, column: 4
                      System.out.println("Orch: Received cap loader status");//sysj\orchestrator.sysj line: 185, column: 4
                      res_thread_11 = (String)(capLoaderStatus_in.getVal() == null ? null : ((String)capLoaderStatus_in.getVal()));//sysj\orchestrator.sysj line: 186, column: 4
                      recCapLoaderStatus_1.setPresent();//sysj\orchestrator.sysj line: 187, column: 4
                      currsigs.addElement(recCapLoaderStatus_1);
                      recCapLoaderStatus_1.setValue(res_thread_11);//sysj\orchestrator.sysj line: 187, column: 4
                      capLoaderStatusUIE.setPresent();//sysj\orchestrator.sysj line: 179, column: 4
                      currsigs.addElement(capLoaderStatusUIE);
                      capLoaderStatusUIE.setValue(false);//sysj\orchestrator.sysj line: 179, column: 4
                      S46602=0;
                      active[11]=1;
                      ends[11]=1;
                      tdone[11]=1;
                    }
                    else {
                      active[11]=1;
                      ends[11]=1;
                      tdone[11]=1;
                    }
                  }
                  else {
                    active[11]=1;
                    ends[11]=1;
                    tdone[11]=1;
                  }
                }
                break;
              
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread51118(int [] tdone, int [] ends){
        switch(S46599){
      case 0 : 
        active[10]=0;
        ends[10]=0;
        tdone[10]=1;
        break;
      
      case 1 : 
        switch(S45655){
          case 0 : 
            if(sigCapperReq_1.getprestatus()){//sysj\orchestrator.sysj line: 166, column: 10
              capperStatusUIE.setPresent();//sysj\orchestrator.sysj line: 167, column: 4
              currsigs.addElement(capperStatusUIE);
              capperStatusUIE.setValue(true);//sysj\orchestrator.sysj line: 167, column: 4
              System.out.println("Orch: Sending capper request");//sysj\orchestrator.sysj line: 168, column: 4
              S45655=1;
              S45662=0;
              if(!capperReq_o.isPartnerPresent() || capperReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 169, column: 4
                capperReq_o.setREQ(false);//sysj\orchestrator.sysj line: 169, column: 4
                S45662=1;
                active[10]=1;
                ends[10]=1;
                tdone[10]=1;
              }
              else {
                S45657=0;
                if(capperReq_o.isACK()){//sysj\orchestrator.sysj line: 169, column: 4
                  capperReq_o.setVal(true);//sysj\orchestrator.sysj line: 169, column: 4
                  S45657=1;
                  if(!capperReq_o.isACK()){//sysj\orchestrator.sysj line: 169, column: 4
                    capperReq_o.setREQ(false);//sysj\orchestrator.sysj line: 169, column: 4
                    ends[10]=2;
                    ;//sysj\orchestrator.sysj line: 169, column: 4
                    S45655=2;
                    S45706=0;
                    if(!capperStatus_in.isPartnerPresent() || capperStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 170, column: 4
                      capperStatus_in.setACK(false);//sysj\orchestrator.sysj line: 170, column: 4
                      S45706=1;
                      active[10]=1;
                      ends[10]=1;
                      tdone[10]=1;
                    }
                    else {
                      S45701=0;
                      if(!capperStatus_in.isREQ()){//sysj\orchestrator.sysj line: 170, column: 4
                        capperStatus_in.setACK(true);//sysj\orchestrator.sysj line: 170, column: 4
                        S45701=1;
                        if(capperStatus_in.isREQ()){//sysj\orchestrator.sysj line: 170, column: 4
                          capperStatus_in.setACK(false);//sysj\orchestrator.sysj line: 170, column: 4
                          ends[10]=2;
                          ;//sysj\orchestrator.sysj line: 170, column: 4
                          System.out.println("Orch: Received capper status");//sysj\orchestrator.sysj line: 171, column: 4
                          res_thread_10 = (String)(capperStatus_in.getVal() == null ? null : ((String)capperStatus_in.getVal()));//sysj\orchestrator.sysj line: 172, column: 4
                          recCapperStatus_1.setPresent();//sysj\orchestrator.sysj line: 173, column: 4
                          currsigs.addElement(recCapperStatus_1);
                          recCapperStatus_1.setValue(res_thread_10);//sysj\orchestrator.sysj line: 173, column: 4
                          capperStatusUIE.setPresent();//sysj\orchestrator.sysj line: 165, column: 4
                          currsigs.addElement(capperStatusUIE);
                          capperStatusUIE.setValue(false);//sysj\orchestrator.sysj line: 165, column: 4
                          S45655=0;
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
              active[10]=1;
              ends[10]=1;
              tdone[10]=1;
            }
            break;
          
          case 1 : 
            switch(S45662){
              case 0 : 
                if(!capperReq_o.isPartnerPresent() || capperReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 169, column: 4
                  capperReq_o.setREQ(false);//sysj\orchestrator.sysj line: 169, column: 4
                  S45662=1;
                  active[10]=1;
                  ends[10]=1;
                  tdone[10]=1;
                }
                else {
                  switch(S45657){
                    case 0 : 
                      if(capperReq_o.isACK()){//sysj\orchestrator.sysj line: 169, column: 4
                        capperReq_o.setVal(true);//sysj\orchestrator.sysj line: 169, column: 4
                        S45657=1;
                        if(!capperReq_o.isACK()){//sysj\orchestrator.sysj line: 169, column: 4
                          capperReq_o.setREQ(false);//sysj\orchestrator.sysj line: 169, column: 4
                          ends[10]=2;
                          ;//sysj\orchestrator.sysj line: 169, column: 4
                          S45655=2;
                          S45706=0;
                          if(!capperStatus_in.isPartnerPresent() || capperStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 170, column: 4
                            capperStatus_in.setACK(false);//sysj\orchestrator.sysj line: 170, column: 4
                            S45706=1;
                            active[10]=1;
                            ends[10]=1;
                            tdone[10]=1;
                          }
                          else {
                            S45701=0;
                            if(!capperStatus_in.isREQ()){//sysj\orchestrator.sysj line: 170, column: 4
                              capperStatus_in.setACK(true);//sysj\orchestrator.sysj line: 170, column: 4
                              S45701=1;
                              if(capperStatus_in.isREQ()){//sysj\orchestrator.sysj line: 170, column: 4
                                capperStatus_in.setACK(false);//sysj\orchestrator.sysj line: 170, column: 4
                                ends[10]=2;
                                ;//sysj\orchestrator.sysj line: 170, column: 4
                                System.out.println("Orch: Received capper status");//sysj\orchestrator.sysj line: 171, column: 4
                                res_thread_10 = (String)(capperStatus_in.getVal() == null ? null : ((String)capperStatus_in.getVal()));//sysj\orchestrator.sysj line: 172, column: 4
                                recCapperStatus_1.setPresent();//sysj\orchestrator.sysj line: 173, column: 4
                                currsigs.addElement(recCapperStatus_1);
                                recCapperStatus_1.setValue(res_thread_10);//sysj\orchestrator.sysj line: 173, column: 4
                                capperStatusUIE.setPresent();//sysj\orchestrator.sysj line: 165, column: 4
                                currsigs.addElement(capperStatusUIE);
                                capperStatusUIE.setValue(false);//sysj\orchestrator.sysj line: 165, column: 4
                                S45655=0;
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
                      if(!capperReq_o.isACK()){//sysj\orchestrator.sysj line: 169, column: 4
                        capperReq_o.setREQ(false);//sysj\orchestrator.sysj line: 169, column: 4
                        ends[10]=2;
                        ;//sysj\orchestrator.sysj line: 169, column: 4
                        S45655=2;
                        S45706=0;
                        if(!capperStatus_in.isPartnerPresent() || capperStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 170, column: 4
                          capperStatus_in.setACK(false);//sysj\orchestrator.sysj line: 170, column: 4
                          S45706=1;
                          active[10]=1;
                          ends[10]=1;
                          tdone[10]=1;
                        }
                        else {
                          S45701=0;
                          if(!capperStatus_in.isREQ()){//sysj\orchestrator.sysj line: 170, column: 4
                            capperStatus_in.setACK(true);//sysj\orchestrator.sysj line: 170, column: 4
                            S45701=1;
                            if(capperStatus_in.isREQ()){//sysj\orchestrator.sysj line: 170, column: 4
                              capperStatus_in.setACK(false);//sysj\orchestrator.sysj line: 170, column: 4
                              ends[10]=2;
                              ;//sysj\orchestrator.sysj line: 170, column: 4
                              System.out.println("Orch: Received capper status");//sysj\orchestrator.sysj line: 171, column: 4
                              res_thread_10 = (String)(capperStatus_in.getVal() == null ? null : ((String)capperStatus_in.getVal()));//sysj\orchestrator.sysj line: 172, column: 4
                              recCapperStatus_1.setPresent();//sysj\orchestrator.sysj line: 173, column: 4
                              currsigs.addElement(recCapperStatus_1);
                              recCapperStatus_1.setValue(res_thread_10);//sysj\orchestrator.sysj line: 173, column: 4
                              capperStatusUIE.setPresent();//sysj\orchestrator.sysj line: 165, column: 4
                              currsigs.addElement(capperStatusUIE);
                              capperStatusUIE.setValue(false);//sysj\orchestrator.sysj line: 165, column: 4
                              S45655=0;
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
                        active[10]=1;
                        ends[10]=1;
                        tdone[10]=1;
                      }
                      break;
                    
                  }
                }
                break;
              
              case 1 : 
                S45662=1;
                S45662=0;
                if(!capperReq_o.isPartnerPresent() || capperReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 169, column: 4
                  capperReq_o.setREQ(false);//sysj\orchestrator.sysj line: 169, column: 4
                  S45662=1;
                  active[10]=1;
                  ends[10]=1;
                  tdone[10]=1;
                }
                else {
                  S45657=0;
                  if(capperReq_o.isACK()){//sysj\orchestrator.sysj line: 169, column: 4
                    capperReq_o.setVal(true);//sysj\orchestrator.sysj line: 169, column: 4
                    S45657=1;
                    if(!capperReq_o.isACK()){//sysj\orchestrator.sysj line: 169, column: 4
                      capperReq_o.setREQ(false);//sysj\orchestrator.sysj line: 169, column: 4
                      ends[10]=2;
                      ;//sysj\orchestrator.sysj line: 169, column: 4
                      S45655=2;
                      S45706=0;
                      if(!capperStatus_in.isPartnerPresent() || capperStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 170, column: 4
                        capperStatus_in.setACK(false);//sysj\orchestrator.sysj line: 170, column: 4
                        S45706=1;
                        active[10]=1;
                        ends[10]=1;
                        tdone[10]=1;
                      }
                      else {
                        S45701=0;
                        if(!capperStatus_in.isREQ()){//sysj\orchestrator.sysj line: 170, column: 4
                          capperStatus_in.setACK(true);//sysj\orchestrator.sysj line: 170, column: 4
                          S45701=1;
                          if(capperStatus_in.isREQ()){//sysj\orchestrator.sysj line: 170, column: 4
                            capperStatus_in.setACK(false);//sysj\orchestrator.sysj line: 170, column: 4
                            ends[10]=2;
                            ;//sysj\orchestrator.sysj line: 170, column: 4
                            System.out.println("Orch: Received capper status");//sysj\orchestrator.sysj line: 171, column: 4
                            res_thread_10 = (String)(capperStatus_in.getVal() == null ? null : ((String)capperStatus_in.getVal()));//sysj\orchestrator.sysj line: 172, column: 4
                            recCapperStatus_1.setPresent();//sysj\orchestrator.sysj line: 173, column: 4
                            currsigs.addElement(recCapperStatus_1);
                            recCapperStatus_1.setValue(res_thread_10);//sysj\orchestrator.sysj line: 173, column: 4
                            capperStatusUIE.setPresent();//sysj\orchestrator.sysj line: 165, column: 4
                            currsigs.addElement(capperStatusUIE);
                            capperStatusUIE.setValue(false);//sysj\orchestrator.sysj line: 165, column: 4
                            S45655=0;
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
          
          case 2 : 
            switch(S45706){
              case 0 : 
                if(!capperStatus_in.isPartnerPresent() || capperStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 170, column: 4
                  capperStatus_in.setACK(false);//sysj\orchestrator.sysj line: 170, column: 4
                  S45706=1;
                  active[10]=1;
                  ends[10]=1;
                  tdone[10]=1;
                }
                else {
                  switch(S45701){
                    case 0 : 
                      if(!capperStatus_in.isREQ()){//sysj\orchestrator.sysj line: 170, column: 4
                        capperStatus_in.setACK(true);//sysj\orchestrator.sysj line: 170, column: 4
                        S45701=1;
                        if(capperStatus_in.isREQ()){//sysj\orchestrator.sysj line: 170, column: 4
                          capperStatus_in.setACK(false);//sysj\orchestrator.sysj line: 170, column: 4
                          ends[10]=2;
                          ;//sysj\orchestrator.sysj line: 170, column: 4
                          System.out.println("Orch: Received capper status");//sysj\orchestrator.sysj line: 171, column: 4
                          res_thread_10 = (String)(capperStatus_in.getVal() == null ? null : ((String)capperStatus_in.getVal()));//sysj\orchestrator.sysj line: 172, column: 4
                          recCapperStatus_1.setPresent();//sysj\orchestrator.sysj line: 173, column: 4
                          currsigs.addElement(recCapperStatus_1);
                          recCapperStatus_1.setValue(res_thread_10);//sysj\orchestrator.sysj line: 173, column: 4
                          capperStatusUIE.setPresent();//sysj\orchestrator.sysj line: 165, column: 4
                          currsigs.addElement(capperStatusUIE);
                          capperStatusUIE.setValue(false);//sysj\orchestrator.sysj line: 165, column: 4
                          S45655=0;
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
                      if(capperStatus_in.isREQ()){//sysj\orchestrator.sysj line: 170, column: 4
                        capperStatus_in.setACK(false);//sysj\orchestrator.sysj line: 170, column: 4
                        ends[10]=2;
                        ;//sysj\orchestrator.sysj line: 170, column: 4
                        System.out.println("Orch: Received capper status");//sysj\orchestrator.sysj line: 171, column: 4
                        res_thread_10 = (String)(capperStatus_in.getVal() == null ? null : ((String)capperStatus_in.getVal()));//sysj\orchestrator.sysj line: 172, column: 4
                        recCapperStatus_1.setPresent();//sysj\orchestrator.sysj line: 173, column: 4
                        currsigs.addElement(recCapperStatus_1);
                        recCapperStatus_1.setValue(res_thread_10);//sysj\orchestrator.sysj line: 173, column: 4
                        capperStatusUIE.setPresent();//sysj\orchestrator.sysj line: 165, column: 4
                        currsigs.addElement(capperStatusUIE);
                        capperStatusUIE.setValue(false);//sysj\orchestrator.sysj line: 165, column: 4
                        S45655=0;
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
                S45706=1;
                S45706=0;
                if(!capperStatus_in.isPartnerPresent() || capperStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 170, column: 4
                  capperStatus_in.setACK(false);//sysj\orchestrator.sysj line: 170, column: 4
                  S45706=1;
                  active[10]=1;
                  ends[10]=1;
                  tdone[10]=1;
                }
                else {
                  S45701=0;
                  if(!capperStatus_in.isREQ()){//sysj\orchestrator.sysj line: 170, column: 4
                    capperStatus_in.setACK(true);//sysj\orchestrator.sysj line: 170, column: 4
                    S45701=1;
                    if(capperStatus_in.isREQ()){//sysj\orchestrator.sysj line: 170, column: 4
                      capperStatus_in.setACK(false);//sysj\orchestrator.sysj line: 170, column: 4
                      ends[10]=2;
                      ;//sysj\orchestrator.sysj line: 170, column: 4
                      System.out.println("Orch: Received capper status");//sysj\orchestrator.sysj line: 171, column: 4
                      res_thread_10 = (String)(capperStatus_in.getVal() == null ? null : ((String)capperStatus_in.getVal()));//sysj\orchestrator.sysj line: 172, column: 4
                      recCapperStatus_1.setPresent();//sysj\orchestrator.sysj line: 173, column: 4
                      currsigs.addElement(recCapperStatus_1);
                      recCapperStatus_1.setValue(res_thread_10);//sysj\orchestrator.sysj line: 173, column: 4
                      capperStatusUIE.setPresent();//sysj\orchestrator.sysj line: 165, column: 4
                      currsigs.addElement(capperStatusUIE);
                      capperStatusUIE.setValue(false);//sysj\orchestrator.sysj line: 165, column: 4
                      S45655=0;
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
          
        }
        break;
      
    }
  }

  public void thread51117(int [] tdone, int [] ends){
        switch(S45652){
      case 0 : 
        active[9]=0;
        ends[9]=0;
        tdone[9]=1;
        break;
      
      case 1 : 
        switch(S44708){
          case 0 : 
            if(sigConveyorReq_1.getprestatus()){//sysj\orchestrator.sysj line: 154, column: 10
              conveyorStatusUIE.setPresent();//sysj\orchestrator.sysj line: 155, column: 4
              currsigs.addElement(conveyorStatusUIE);
              conveyorStatusUIE.setValue(true);//sysj\orchestrator.sysj line: 155, column: 4
              S44708=1;
              S44715=0;
              if(!conveyorReq_o.isPartnerPresent() || conveyorReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 156, column: 4
                conveyorReq_o.setREQ(false);//sysj\orchestrator.sysj line: 156, column: 4
                S44715=1;
                active[9]=1;
                ends[9]=1;
                tdone[9]=1;
              }
              else {
                S44710=0;
                if(conveyorReq_o.isACK()){//sysj\orchestrator.sysj line: 156, column: 4
                  conveyorReq_o.setVal(true);//sysj\orchestrator.sysj line: 156, column: 4
                  S44710=1;
                  if(!conveyorReq_o.isACK()){//sysj\orchestrator.sysj line: 156, column: 4
                    conveyorReq_o.setREQ(false);//sysj\orchestrator.sysj line: 156, column: 4
                    ends[9]=2;
                    ;//sysj\orchestrator.sysj line: 156, column: 4
                    S44708=2;
                    S44759=0;
                    if(!conveyorStatus_in.isPartnerPresent() || conveyorStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 157, column: 4
                      conveyorStatus_in.setACK(false);//sysj\orchestrator.sysj line: 157, column: 4
                      S44759=1;
                      active[9]=1;
                      ends[9]=1;
                      tdone[9]=1;
                    }
                    else {
                      S44754=0;
                      if(!conveyorStatus_in.isREQ()){//sysj\orchestrator.sysj line: 157, column: 4
                        conveyorStatus_in.setACK(true);//sysj\orchestrator.sysj line: 157, column: 4
                        S44754=1;
                        if(conveyorStatus_in.isREQ()){//sysj\orchestrator.sysj line: 157, column: 4
                          conveyorStatus_in.setACK(false);//sysj\orchestrator.sysj line: 157, column: 4
                          ends[9]=2;
                          ;//sysj\orchestrator.sysj line: 157, column: 4
                          res_thread_9 = (String)(conveyorStatus_in.getVal() == null ? null : ((String)conveyorStatus_in.getVal()));//sysj\orchestrator.sysj line: 158, column: 4
                          recConveyorStatus_1.setPresent();//sysj\orchestrator.sysj line: 159, column: 4
                          currsigs.addElement(recConveyorStatus_1);
                          recConveyorStatus_1.setValue(res_thread_9);//sysj\orchestrator.sysj line: 159, column: 4
                          conveyorStatusUIE.setPresent();//sysj\orchestrator.sysj line: 153, column: 4
                          currsigs.addElement(conveyorStatusUIE);
                          conveyorStatusUIE.setValue(false);//sysj\orchestrator.sysj line: 153, column: 4
                          S44708=0;
                          active[9]=1;
                          ends[9]=1;
                          tdone[9]=1;
                        }
                        else {
                          active[9]=1;
                          ends[9]=1;
                          tdone[9]=1;
                        }
                      }
                      else {
                        active[9]=1;
                        ends[9]=1;
                        tdone[9]=1;
                      }
                    }
                  }
                  else {
                    active[9]=1;
                    ends[9]=1;
                    tdone[9]=1;
                  }
                }
                else {
                  active[9]=1;
                  ends[9]=1;
                  tdone[9]=1;
                }
              }
            }
            else {
              active[9]=1;
              ends[9]=1;
              tdone[9]=1;
            }
            break;
          
          case 1 : 
            switch(S44715){
              case 0 : 
                if(!conveyorReq_o.isPartnerPresent() || conveyorReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 156, column: 4
                  conveyorReq_o.setREQ(false);//sysj\orchestrator.sysj line: 156, column: 4
                  S44715=1;
                  active[9]=1;
                  ends[9]=1;
                  tdone[9]=1;
                }
                else {
                  switch(S44710){
                    case 0 : 
                      if(conveyorReq_o.isACK()){//sysj\orchestrator.sysj line: 156, column: 4
                        conveyorReq_o.setVal(true);//sysj\orchestrator.sysj line: 156, column: 4
                        S44710=1;
                        if(!conveyorReq_o.isACK()){//sysj\orchestrator.sysj line: 156, column: 4
                          conveyorReq_o.setREQ(false);//sysj\orchestrator.sysj line: 156, column: 4
                          ends[9]=2;
                          ;//sysj\orchestrator.sysj line: 156, column: 4
                          S44708=2;
                          S44759=0;
                          if(!conveyorStatus_in.isPartnerPresent() || conveyorStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 157, column: 4
                            conveyorStatus_in.setACK(false);//sysj\orchestrator.sysj line: 157, column: 4
                            S44759=1;
                            active[9]=1;
                            ends[9]=1;
                            tdone[9]=1;
                          }
                          else {
                            S44754=0;
                            if(!conveyorStatus_in.isREQ()){//sysj\orchestrator.sysj line: 157, column: 4
                              conveyorStatus_in.setACK(true);//sysj\orchestrator.sysj line: 157, column: 4
                              S44754=1;
                              if(conveyorStatus_in.isREQ()){//sysj\orchestrator.sysj line: 157, column: 4
                                conveyorStatus_in.setACK(false);//sysj\orchestrator.sysj line: 157, column: 4
                                ends[9]=2;
                                ;//sysj\orchestrator.sysj line: 157, column: 4
                                res_thread_9 = (String)(conveyorStatus_in.getVal() == null ? null : ((String)conveyorStatus_in.getVal()));//sysj\orchestrator.sysj line: 158, column: 4
                                recConveyorStatus_1.setPresent();//sysj\orchestrator.sysj line: 159, column: 4
                                currsigs.addElement(recConveyorStatus_1);
                                recConveyorStatus_1.setValue(res_thread_9);//sysj\orchestrator.sysj line: 159, column: 4
                                conveyorStatusUIE.setPresent();//sysj\orchestrator.sysj line: 153, column: 4
                                currsigs.addElement(conveyorStatusUIE);
                                conveyorStatusUIE.setValue(false);//sysj\orchestrator.sysj line: 153, column: 4
                                S44708=0;
                                active[9]=1;
                                ends[9]=1;
                                tdone[9]=1;
                              }
                              else {
                                active[9]=1;
                                ends[9]=1;
                                tdone[9]=1;
                              }
                            }
                            else {
                              active[9]=1;
                              ends[9]=1;
                              tdone[9]=1;
                            }
                          }
                        }
                        else {
                          active[9]=1;
                          ends[9]=1;
                          tdone[9]=1;
                        }
                      }
                      else {
                        active[9]=1;
                        ends[9]=1;
                        tdone[9]=1;
                      }
                      break;
                    
                    case 1 : 
                      if(!conveyorReq_o.isACK()){//sysj\orchestrator.sysj line: 156, column: 4
                        conveyorReq_o.setREQ(false);//sysj\orchestrator.sysj line: 156, column: 4
                        ends[9]=2;
                        ;//sysj\orchestrator.sysj line: 156, column: 4
                        S44708=2;
                        S44759=0;
                        if(!conveyorStatus_in.isPartnerPresent() || conveyorStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 157, column: 4
                          conveyorStatus_in.setACK(false);//sysj\orchestrator.sysj line: 157, column: 4
                          S44759=1;
                          active[9]=1;
                          ends[9]=1;
                          tdone[9]=1;
                        }
                        else {
                          S44754=0;
                          if(!conveyorStatus_in.isREQ()){//sysj\orchestrator.sysj line: 157, column: 4
                            conveyorStatus_in.setACK(true);//sysj\orchestrator.sysj line: 157, column: 4
                            S44754=1;
                            if(conveyorStatus_in.isREQ()){//sysj\orchestrator.sysj line: 157, column: 4
                              conveyorStatus_in.setACK(false);//sysj\orchestrator.sysj line: 157, column: 4
                              ends[9]=2;
                              ;//sysj\orchestrator.sysj line: 157, column: 4
                              res_thread_9 = (String)(conveyorStatus_in.getVal() == null ? null : ((String)conveyorStatus_in.getVal()));//sysj\orchestrator.sysj line: 158, column: 4
                              recConveyorStatus_1.setPresent();//sysj\orchestrator.sysj line: 159, column: 4
                              currsigs.addElement(recConveyorStatus_1);
                              recConveyorStatus_1.setValue(res_thread_9);//sysj\orchestrator.sysj line: 159, column: 4
                              conveyorStatusUIE.setPresent();//sysj\orchestrator.sysj line: 153, column: 4
                              currsigs.addElement(conveyorStatusUIE);
                              conveyorStatusUIE.setValue(false);//sysj\orchestrator.sysj line: 153, column: 4
                              S44708=0;
                              active[9]=1;
                              ends[9]=1;
                              tdone[9]=1;
                            }
                            else {
                              active[9]=1;
                              ends[9]=1;
                              tdone[9]=1;
                            }
                          }
                          else {
                            active[9]=1;
                            ends[9]=1;
                            tdone[9]=1;
                          }
                        }
                      }
                      else {
                        active[9]=1;
                        ends[9]=1;
                        tdone[9]=1;
                      }
                      break;
                    
                  }
                }
                break;
              
              case 1 : 
                S44715=1;
                S44715=0;
                if(!conveyorReq_o.isPartnerPresent() || conveyorReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 156, column: 4
                  conveyorReq_o.setREQ(false);//sysj\orchestrator.sysj line: 156, column: 4
                  S44715=1;
                  active[9]=1;
                  ends[9]=1;
                  tdone[9]=1;
                }
                else {
                  S44710=0;
                  if(conveyorReq_o.isACK()){//sysj\orchestrator.sysj line: 156, column: 4
                    conveyorReq_o.setVal(true);//sysj\orchestrator.sysj line: 156, column: 4
                    S44710=1;
                    if(!conveyorReq_o.isACK()){//sysj\orchestrator.sysj line: 156, column: 4
                      conveyorReq_o.setREQ(false);//sysj\orchestrator.sysj line: 156, column: 4
                      ends[9]=2;
                      ;//sysj\orchestrator.sysj line: 156, column: 4
                      S44708=2;
                      S44759=0;
                      if(!conveyorStatus_in.isPartnerPresent() || conveyorStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 157, column: 4
                        conveyorStatus_in.setACK(false);//sysj\orchestrator.sysj line: 157, column: 4
                        S44759=1;
                        active[9]=1;
                        ends[9]=1;
                        tdone[9]=1;
                      }
                      else {
                        S44754=0;
                        if(!conveyorStatus_in.isREQ()){//sysj\orchestrator.sysj line: 157, column: 4
                          conveyorStatus_in.setACK(true);//sysj\orchestrator.sysj line: 157, column: 4
                          S44754=1;
                          if(conveyorStatus_in.isREQ()){//sysj\orchestrator.sysj line: 157, column: 4
                            conveyorStatus_in.setACK(false);//sysj\orchestrator.sysj line: 157, column: 4
                            ends[9]=2;
                            ;//sysj\orchestrator.sysj line: 157, column: 4
                            res_thread_9 = (String)(conveyorStatus_in.getVal() == null ? null : ((String)conveyorStatus_in.getVal()));//sysj\orchestrator.sysj line: 158, column: 4
                            recConveyorStatus_1.setPresent();//sysj\orchestrator.sysj line: 159, column: 4
                            currsigs.addElement(recConveyorStatus_1);
                            recConveyorStatus_1.setValue(res_thread_9);//sysj\orchestrator.sysj line: 159, column: 4
                            conveyorStatusUIE.setPresent();//sysj\orchestrator.sysj line: 153, column: 4
                            currsigs.addElement(conveyorStatusUIE);
                            conveyorStatusUIE.setValue(false);//sysj\orchestrator.sysj line: 153, column: 4
                            S44708=0;
                            active[9]=1;
                            ends[9]=1;
                            tdone[9]=1;
                          }
                          else {
                            active[9]=1;
                            ends[9]=1;
                            tdone[9]=1;
                          }
                        }
                        else {
                          active[9]=1;
                          ends[9]=1;
                          tdone[9]=1;
                        }
                      }
                    }
                    else {
                      active[9]=1;
                      ends[9]=1;
                      tdone[9]=1;
                    }
                  }
                  else {
                    active[9]=1;
                    ends[9]=1;
                    tdone[9]=1;
                  }
                }
                break;
              
            }
            break;
          
          case 2 : 
            switch(S44759){
              case 0 : 
                if(!conveyorStatus_in.isPartnerPresent() || conveyorStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 157, column: 4
                  conveyorStatus_in.setACK(false);//sysj\orchestrator.sysj line: 157, column: 4
                  S44759=1;
                  active[9]=1;
                  ends[9]=1;
                  tdone[9]=1;
                }
                else {
                  switch(S44754){
                    case 0 : 
                      if(!conveyorStatus_in.isREQ()){//sysj\orchestrator.sysj line: 157, column: 4
                        conveyorStatus_in.setACK(true);//sysj\orchestrator.sysj line: 157, column: 4
                        S44754=1;
                        if(conveyorStatus_in.isREQ()){//sysj\orchestrator.sysj line: 157, column: 4
                          conveyorStatus_in.setACK(false);//sysj\orchestrator.sysj line: 157, column: 4
                          ends[9]=2;
                          ;//sysj\orchestrator.sysj line: 157, column: 4
                          res_thread_9 = (String)(conveyorStatus_in.getVal() == null ? null : ((String)conveyorStatus_in.getVal()));//sysj\orchestrator.sysj line: 158, column: 4
                          recConveyorStatus_1.setPresent();//sysj\orchestrator.sysj line: 159, column: 4
                          currsigs.addElement(recConveyorStatus_1);
                          recConveyorStatus_1.setValue(res_thread_9);//sysj\orchestrator.sysj line: 159, column: 4
                          conveyorStatusUIE.setPresent();//sysj\orchestrator.sysj line: 153, column: 4
                          currsigs.addElement(conveyorStatusUIE);
                          conveyorStatusUIE.setValue(false);//sysj\orchestrator.sysj line: 153, column: 4
                          S44708=0;
                          active[9]=1;
                          ends[9]=1;
                          tdone[9]=1;
                        }
                        else {
                          active[9]=1;
                          ends[9]=1;
                          tdone[9]=1;
                        }
                      }
                      else {
                        active[9]=1;
                        ends[9]=1;
                        tdone[9]=1;
                      }
                      break;
                    
                    case 1 : 
                      if(conveyorStatus_in.isREQ()){//sysj\orchestrator.sysj line: 157, column: 4
                        conveyorStatus_in.setACK(false);//sysj\orchestrator.sysj line: 157, column: 4
                        ends[9]=2;
                        ;//sysj\orchestrator.sysj line: 157, column: 4
                        res_thread_9 = (String)(conveyorStatus_in.getVal() == null ? null : ((String)conveyorStatus_in.getVal()));//sysj\orchestrator.sysj line: 158, column: 4
                        recConveyorStatus_1.setPresent();//sysj\orchestrator.sysj line: 159, column: 4
                        currsigs.addElement(recConveyorStatus_1);
                        recConveyorStatus_1.setValue(res_thread_9);//sysj\orchestrator.sysj line: 159, column: 4
                        conveyorStatusUIE.setPresent();//sysj\orchestrator.sysj line: 153, column: 4
                        currsigs.addElement(conveyorStatusUIE);
                        conveyorStatusUIE.setValue(false);//sysj\orchestrator.sysj line: 153, column: 4
                        S44708=0;
                        active[9]=1;
                        ends[9]=1;
                        tdone[9]=1;
                      }
                      else {
                        active[9]=1;
                        ends[9]=1;
                        tdone[9]=1;
                      }
                      break;
                    
                  }
                }
                break;
              
              case 1 : 
                S44759=1;
                S44759=0;
                if(!conveyorStatus_in.isPartnerPresent() || conveyorStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 157, column: 4
                  conveyorStatus_in.setACK(false);//sysj\orchestrator.sysj line: 157, column: 4
                  S44759=1;
                  active[9]=1;
                  ends[9]=1;
                  tdone[9]=1;
                }
                else {
                  S44754=0;
                  if(!conveyorStatus_in.isREQ()){//sysj\orchestrator.sysj line: 157, column: 4
                    conveyorStatus_in.setACK(true);//sysj\orchestrator.sysj line: 157, column: 4
                    S44754=1;
                    if(conveyorStatus_in.isREQ()){//sysj\orchestrator.sysj line: 157, column: 4
                      conveyorStatus_in.setACK(false);//sysj\orchestrator.sysj line: 157, column: 4
                      ends[9]=2;
                      ;//sysj\orchestrator.sysj line: 157, column: 4
                      res_thread_9 = (String)(conveyorStatus_in.getVal() == null ? null : ((String)conveyorStatus_in.getVal()));//sysj\orchestrator.sysj line: 158, column: 4
                      recConveyorStatus_1.setPresent();//sysj\orchestrator.sysj line: 159, column: 4
                      currsigs.addElement(recConveyorStatus_1);
                      recConveyorStatus_1.setValue(res_thread_9);//sysj\orchestrator.sysj line: 159, column: 4
                      conveyorStatusUIE.setPresent();//sysj\orchestrator.sysj line: 153, column: 4
                      currsigs.addElement(conveyorStatusUIE);
                      conveyorStatusUIE.setValue(false);//sysj\orchestrator.sysj line: 153, column: 4
                      S44708=0;
                      active[9]=1;
                      ends[9]=1;
                      tdone[9]=1;
                    }
                    else {
                      active[9]=1;
                      ends[9]=1;
                      tdone[9]=1;
                    }
                  }
                  else {
                    active[9]=1;
                    ends[9]=1;
                    tdone[9]=1;
                  }
                }
                break;
              
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread51115(int [] tdone, int [] ends){
        S44665=1;
    foundCurrentOrder_1.setPresent();//sysj\orchestrator.sysj line: 141, column: 9
    currsigs.addElement(foundCurrentOrder_1);
    active[8]=1;
    ends[8]=1;
    tdone[8]=1;
  }

  public void thread51114(int [] tdone, int [] ends){
        S44660=1;
    myOrder_thread_7 = (currentOrder_1.getpreval() == null ? null : ((Order)currentOrder_1.getpreval()));//sysj\orchestrator.sysj line: 138, column: 9
    currentOrder_1.setPresent();//sysj\orchestrator.sysj line: 139, column: 8
    currsigs.addElement(currentOrder_1);
    currentOrder_1.setValue(myOrder_thread_7);//sysj\orchestrator.sysj line: 139, column: 8
    active[7]=1;
    ends[7]=1;
    tdone[7]=1;
  }

  public void thread51112(int [] tdone, int [] ends){
        switch(S44665){
      case 0 : 
        active[8]=0;
        ends[8]=0;
        tdone[8]=1;
        break;
      
      case 1 : 
        foundCurrentOrder_1.setPresent();//sysj\orchestrator.sysj line: 141, column: 9
        currsigs.addElement(foundCurrentOrder_1);
        active[8]=1;
        ends[8]=1;
        tdone[8]=1;
        break;
      
    }
  }

  public void thread51111(int [] tdone, int [] ends){
        switch(S44660){
      case 0 : 
        active[7]=0;
        ends[7]=0;
        tdone[7]=1;
        break;
      
      case 1 : 
        currentOrder_1.setPresent();//sysj\orchestrator.sysj line: 139, column: 8
        currsigs.addElement(currentOrder_1);
        currentOrder_1.setValue(myOrder_thread_7);//sysj\orchestrator.sysj line: 139, column: 8
        active[7]=1;
        ends[7]=1;
        tdone[7]=1;
        break;
      
    }
  }

  public void thread51110(int [] tdone, int [] ends){
        switch(S44705){
      case 0 : 
        active[6]=0;
        ends[6]=0;
        tdone[6]=1;
        break;
      
      case 1 : 
        switch(S44669){
          case 0 : 
            if(recOrderIsDone_1.getprestatus()){//sysj\orchestrator.sysj line: 137, column: 13
              S44669=1;
              active[6]=1;
              ends[6]=1;
              tdone[6]=1;
            }
            else {
              thread51111(tdone,ends);
              thread51112(tdone,ends);
              int biggest51113 = 0;
              if(ends[7]>=biggest51113){
                biggest51113=ends[7];
              }
              if(ends[8]>=biggest51113){
                biggest51113=ends[8];
              }
              if(biggest51113 == 1){
                active[6]=1;
                ends[6]=1;
                tdone[6]=1;
              }
              //FINXME code
              if(biggest51113 == 0){
                S44669=1;
                active[6]=1;
                ends[6]=1;
                tdone[6]=1;
              }
            }
            break;
          
          case 1 : 
            S44669=1;
            S44669=0;
            if(startOrder_1.getprestatus()){//sysj\orchestrator.sysj line: 134, column: 13
              if(currentOrder_1.getprestatus()){//sysj\orchestrator.sysj line: 135, column: 14
                thread51114(tdone,ends);
                thread51115(tdone,ends);
                int biggest51116 = 0;
                if(ends[7]>=biggest51116){
                  biggest51116=ends[7];
                }
                if(ends[8]>=biggest51116){
                  biggest51116=ends[8];
                }
                if(biggest51116 == 1){
                  active[6]=1;
                  ends[6]=1;
                  tdone[6]=1;
                }
              }
              else {
                S44669=1;
                active[6]=1;
                ends[6]=1;
                tdone[6]=1;
              }
            }
            else {
              S44669=1;
              active[6]=1;
              ends[6]=1;
              tdone[6]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread51109(int [] tdone, int [] ends){
        switch(S44652){
      case 0 : 
        active[5]=0;
        ends[5]=0;
        tdone[5]=1;
        break;
      
      case 1 : 
        switch(S44640){
          case 0 : 
            if(currentOrder_1.getprestatus()){//sysj\orchestrator.sysj line: 123, column: 11
              S44640=1;
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            else {
              initABS_1.setPresent();//sysj\orchestrator.sysj line: 124, column: 6
              currsigs.addElement(initABS_1);
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            break;
          
          case 1 : 
            S44640=1;
            S44640=0;
            initABS_1.setPresent();//sysj\orchestrator.sysj line: 124, column: 6
            currsigs.addElement(initABS_1);
            active[5]=1;
            ends[5]=1;
            tdone[5]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread51107(int [] tdone, int [] ends){
        S39754=1;
    recOrderIsDone_1.setPresent();//sysj\orchestrator.sysj line: 87, column: 12
    currsigs.addElement(recOrderIsDone_1);
    active[4]=1;
    ends[4]=1;
    tdone[4]=1;
  }

  public void thread51106(int [] tdone, int [] ends){
        S39749=1;
    tempOrder_thread_3 = (currentOrder_1.getpreval() == null ? null : ((Order)currentOrder_1.getpreval()));//sysj\orchestrator.sysj line: 81, column: 9
    System.out.println("POS- ORDER IS DONE GONNA SEND DONE STATUS XD");//sysj\orchestrator.sysj line: 83, column: 9
    tempOrder_thread_3.setOrderStatus("Done");//sysj\orchestrator.sysj line: 84, column: 9
    orderStatus.setPresent();//sysj\orchestrator.sysj line: 85, column: 9
    currsigs.addElement(orderStatus);
    orderStatus.setValue(tempOrder_thread_3);//sysj\orchestrator.sysj line: 85, column: 9
    active[3]=1;
    ends[3]=1;
    tdone[3]=1;
  }

  public void thread51104(int [] tdone, int [] ends){
        S39754=1;
    recOrderIsDone_1.setPresent();//sysj\orchestrator.sysj line: 87, column: 12
    currsigs.addElement(recOrderIsDone_1);
    active[4]=1;
    ends[4]=1;
    tdone[4]=1;
  }

  public void thread51103(int [] tdone, int [] ends){
        S39749=1;
    tempOrder_thread_3 = (currentOrder_1.getpreval() == null ? null : ((Order)currentOrder_1.getpreval()));//sysj\orchestrator.sysj line: 81, column: 9
    System.out.println("POS- ORDER IS DONE GONNA SEND DONE STATUS XD");//sysj\orchestrator.sysj line: 83, column: 9
    tempOrder_thread_3.setOrderStatus("Done");//sysj\orchestrator.sysj line: 84, column: 9
    orderStatus.setPresent();//sysj\orchestrator.sysj line: 85, column: 9
    currsigs.addElement(orderStatus);
    orderStatus.setValue(tempOrder_thread_3);//sysj\orchestrator.sysj line: 85, column: 9
    active[3]=1;
    ends[3]=1;
    tdone[3]=1;
  }

  public void thread51101(int [] tdone, int [] ends){
        switch(S39754){
      case 0 : 
        active[4]=0;
        ends[4]=0;
        tdone[4]=1;
        break;
      
      case 1 : 
        recOrderIsDone_1.setPresent();//sysj\orchestrator.sysj line: 87, column: 12
        currsigs.addElement(recOrderIsDone_1);
        active[4]=1;
        ends[4]=1;
        tdone[4]=1;
        break;
      
    }
  }

  public void thread51100(int [] tdone, int [] ends){
        switch(S39749){
      case 0 : 
        active[3]=0;
        ends[3]=0;
        tdone[3]=1;
        break;
      
      case 1 : 
        orderStatus.setPresent();//sysj\orchestrator.sysj line: 85, column: 9
        currsigs.addElement(orderStatus);
        orderStatus.setValue(tempOrder_thread_3);//sysj\orchestrator.sysj line: 85, column: 9
        active[3]=1;
        ends[3]=1;
        tdone[3]=1;
        break;
      
    }
  }

  public void thread51098(int [] tdone, int [] ends){
        S39754=1;
    recOrderIsDone_1.setPresent();//sysj\orchestrator.sysj line: 87, column: 12
    currsigs.addElement(recOrderIsDone_1);
    active[4]=1;
    ends[4]=1;
    tdone[4]=1;
  }

  public void thread51097(int [] tdone, int [] ends){
        S39749=1;
    tempOrder_thread_3 = (currentOrder_1.getpreval() == null ? null : ((Order)currentOrder_1.getpreval()));//sysj\orchestrator.sysj line: 81, column: 9
    System.out.println("POS- ORDER IS DONE GONNA SEND DONE STATUS XD");//sysj\orchestrator.sysj line: 83, column: 9
    tempOrder_thread_3.setOrderStatus("Done");//sysj\orchestrator.sysj line: 84, column: 9
    orderStatus.setPresent();//sysj\orchestrator.sysj line: 85, column: 9
    currsigs.addElement(orderStatus);
    orderStatus.setValue(tempOrder_thread_3);//sysj\orchestrator.sysj line: 85, column: 9
    active[3]=1;
    ends[3]=1;
    tdone[3]=1;
  }

  public void thread51096(int [] tdone, int [] ends){
        switch(S44635){
      case 0 : 
        active[2]=0;
        ends[2]=0;
        tdone[2]=1;
        break;
      
      case 1 : 
        switch(S40518){
          case 0 : 
            if(recOrderStatus.getprestatus()){//sysj\orchestrator.sysj line: 63, column: 12
              System.out.println("orch received: recOrderStatus");//sysj\orchestrator.sysj line: 67, column: 6
              S40518=1;
              if(orderIsDone_1.getprestatus()){//sysj\orchestrator.sysj line: 75, column: 13
                System.out.println("entered order is done");//sysj\orchestrator.sysj line: 76, column: 6
                if(currentOrder_1.getprestatus()){//sysj\orchestrator.sysj line: 77, column: 14
                  System.out.println("entered current order present");//sysj\orchestrator.sysj line: 78, column: 7
                  S39770=0;
                  thread51097(tdone,ends);
                  thread51098(tdone,ends);
                  int biggest51099 = 0;
                  if(ends[3]>=biggest51099){
                    biggest51099=ends[3];
                  }
                  if(ends[4]>=biggest51099){
                    biggest51099=ends[4];
                  }
                  if(biggest51099 == 1){
                    active[2]=1;
                    ends[2]=1;
                    tdone[2]=1;
                  }
                }
                else {
                  S40518=2;
                  active[2]=1;
                  ends[2]=1;
                  tdone[2]=1;
                }
              }
              else {
                S40518=2;
                active[2]=1;
                ends[2]=1;
                tdone[2]=1;
              }
            }
            else {
              orderStatus.setPresent();//sysj\orchestrator.sysj line: 64, column: 7
              currsigs.addElement(orderStatus);
              orderStatus.setValue(tempOrder_thread_2);//sysj\orchestrator.sysj line: 64, column: 7
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            break;
          
          case 1 : 
            switch(S39770){
              case 0 : 
                if(recOrderStatus.getprestatus()){//sysj\orchestrator.sysj line: 79, column: 13
                  System.out.println("initialising next order...");//sysj\orchestrator.sysj line: 91, column: 7
                  S39770=1;
                  if(!fifoQueue_thread_2.isEmpty()){//sysj\orchestrator.sysj line: 92, column: 10
                    nextOrder_thread_2 = (Order)fifoQueue_thread_2.get(0);//sysj\orchestrator.sysj line: 93, column: 8
                    fifoQueue_thread_2.remove(0);//sysj\orchestrator.sysj line: 94, column: 8
                    currentOrder_1.setPresent();//sysj\orchestrator.sysj line: 98, column: 9
                    currsigs.addElement(currentOrder_1);
                    currentOrder_1.setValue(nextOrder_thread_2);//sysj\orchestrator.sysj line: 98, column: 9
                    startOrder_1.setPresent();//sysj\orchestrator.sysj line: 99, column: 9
                    currsigs.addElement(startOrder_1);
                    nextOrder_thread_2.setOrderStatus("Started");//sysj\orchestrator.sysj line: 103, column: 8
                    System.out.println("emitting next orderstatus: started");//sysj\orchestrator.sysj line: 104, column: 8
                    orderStatus.setPresent();//sysj\orchestrator.sysj line: 106, column: 9
                    currsigs.addElement(orderStatus);
                    orderStatus.setValue(nextOrder_thread_2);//sysj\orchestrator.sysj line: 106, column: 9
                    active[2]=1;
                    ends[2]=1;
                    tdone[2]=1;
                  }
                  else {
                    S40518=2;
                    active[2]=1;
                    ends[2]=1;
                    tdone[2]=1;
                  }
                }
                else {
                  thread51100(tdone,ends);
                  thread51101(tdone,ends);
                  int biggest51102 = 0;
                  if(ends[3]>=biggest51102){
                    biggest51102=ends[3];
                  }
                  if(ends[4]>=biggest51102){
                    biggest51102=ends[4];
                  }
                  if(biggest51102 == 1){
                    active[2]=1;
                    ends[2]=1;
                    tdone[2]=1;
                  }
                  //FINXME code
                  if(biggest51102 == 0){
                    System.out.println("initialising next order...");//sysj\orchestrator.sysj line: 91, column: 7
                    S39770=1;
                    if(!fifoQueue_thread_2.isEmpty()){//sysj\orchestrator.sysj line: 92, column: 10
                      nextOrder_thread_2 = (Order)fifoQueue_thread_2.get(0);//sysj\orchestrator.sysj line: 93, column: 8
                      fifoQueue_thread_2.remove(0);//sysj\orchestrator.sysj line: 94, column: 8
                      currentOrder_1.setPresent();//sysj\orchestrator.sysj line: 98, column: 9
                      currsigs.addElement(currentOrder_1);
                      currentOrder_1.setValue(nextOrder_thread_2);//sysj\orchestrator.sysj line: 98, column: 9
                      startOrder_1.setPresent();//sysj\orchestrator.sysj line: 99, column: 9
                      currsigs.addElement(startOrder_1);
                      nextOrder_thread_2.setOrderStatus("Started");//sysj\orchestrator.sysj line: 103, column: 8
                      System.out.println("emitting next orderstatus: started");//sysj\orchestrator.sysj line: 104, column: 8
                      orderStatus.setPresent();//sysj\orchestrator.sysj line: 106, column: 9
                      currsigs.addElement(orderStatus);
                      orderStatus.setValue(nextOrder_thread_2);//sysj\orchestrator.sysj line: 106, column: 9
                      active[2]=1;
                      ends[2]=1;
                      tdone[2]=1;
                    }
                    else {
                      S40518=2;
                      active[2]=1;
                      ends[2]=1;
                      tdone[2]=1;
                    }
                  }
                }
                break;
              
              case 1 : 
                if(recOrderStatus.getprestatus()){//sysj\orchestrator.sysj line: 105, column: 14
                  S40518=2;
                  active[2]=1;
                  ends[2]=1;
                  tdone[2]=1;
                }
                else {
                  orderStatus.setPresent();//sysj\orchestrator.sysj line: 106, column: 9
                  currsigs.addElement(orderStatus);
                  orderStatus.setValue(nextOrder_thread_2);//sysj\orchestrator.sysj line: 106, column: 9
                  active[2]=1;
                  ends[2]=1;
                  tdone[2]=1;
                }
                break;
              
            }
            break;
          
          case 2 : 
            S40518=2;
            S40518=0;
            if(order.getprestatus()){//sysj\orchestrator.sysj line: 36, column: 13
              System.out.println("got order!");//sysj\orchestrator.sysj line: 37, column: 5
              newOrder_thread_2 = (order.getpreval() == null ? null : ((Order)order.getpreval()));//sysj\orchestrator.sysj line: 38, column: 5
              System.out.println(newOrder_thread_2.getQuantity());//sysj\orchestrator.sysj line: 39, column: 5
              fifoQueue_thread_2.add(newOrder_thread_2);//sysj\orchestrator.sysj line: 41, column: 5
              if(initABS_1.getprestatus()){//sysj\orchestrator.sysj line: 44, column: 13
                System.out.println("start of ABS get first item");//sysj\orchestrator.sysj line: 45, column: 6
                tempOrder_thread_2 = (Order)fifoQueue_thread_2.get(0);//sysj\orchestrator.sysj line: 46, column: 6
                fifoQueue_thread_2.remove(0);//sysj\orchestrator.sysj line: 49, column: 6
                System.out.println(newOrder_thread_2.getCustomerID());//sysj\orchestrator.sysj line: 50, column: 6
                currentOrder_1.setPresent();//sysj\orchestrator.sysj line: 54, column: 7
                currsigs.addElement(currentOrder_1);
                currentOrder_1.setValue(tempOrder_thread_2);//sysj\orchestrator.sysj line: 54, column: 7
                startOrder_1.setPresent();//sysj\orchestrator.sysj line: 55, column: 7
                currsigs.addElement(startOrder_1);
                tempOrder_thread_2.setOrderStatus("Started");//sysj\orchestrator.sysj line: 60, column: 6
                System.out.println("emitting orderstatus: started");//sysj\orchestrator.sysj line: 61, column: 6
                orderStatus.setPresent();//sysj\orchestrator.sysj line: 64, column: 7
                currsigs.addElement(orderStatus);
                orderStatus.setValue(tempOrder_thread_2);//sysj\orchestrator.sysj line: 64, column: 7
                active[2]=1;
                ends[2]=1;
                tdone[2]=1;
              }
              else {
                S40518=1;
                if(orderIsDone_1.getprestatus()){//sysj\orchestrator.sysj line: 75, column: 13
                  System.out.println("entered order is done");//sysj\orchestrator.sysj line: 76, column: 6
                  if(currentOrder_1.getprestatus()){//sysj\orchestrator.sysj line: 77, column: 14
                    System.out.println("entered current order present");//sysj\orchestrator.sysj line: 78, column: 7
                    S39770=0;
                    thread51103(tdone,ends);
                    thread51104(tdone,ends);
                    int biggest51105 = 0;
                    if(ends[3]>=biggest51105){
                      biggest51105=ends[3];
                    }
                    if(ends[4]>=biggest51105){
                      biggest51105=ends[4];
                    }
                    if(biggest51105 == 1){
                      active[2]=1;
                      ends[2]=1;
                      tdone[2]=1;
                    }
                  }
                  else {
                    S40518=2;
                    active[2]=1;
                    ends[2]=1;
                    tdone[2]=1;
                  }
                }
                else {
                  S40518=2;
                  active[2]=1;
                  ends[2]=1;
                  tdone[2]=1;
                }
              }
            }
            else {
              S40518=1;
              if(orderIsDone_1.getprestatus()){//sysj\orchestrator.sysj line: 75, column: 13
                System.out.println("entered order is done");//sysj\orchestrator.sysj line: 76, column: 6
                if(currentOrder_1.getprestatus()){//sysj\orchestrator.sysj line: 77, column: 14
                  System.out.println("entered current order present");//sysj\orchestrator.sysj line: 78, column: 7
                  S39770=0;
                  thread51106(tdone,ends);
                  thread51107(tdone,ends);
                  int biggest51108 = 0;
                  if(ends[3]>=biggest51108){
                    biggest51108=ends[3];
                  }
                  if(ends[4]>=biggest51108){
                    biggest51108=ends[4];
                  }
                  if(biggest51108 == 1){
                    active[2]=1;
                    ends[2]=1;
                    tdone[2]=1;
                  }
                }
                else {
                  S40518=2;
                  active[2]=1;
                  ends[2]=1;
                  tdone[2]=1;
                }
              }
              else {
                S40518=2;
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

  public void thread51094(int [] tdone, int [] ends){
        S51073=1;
    quantity_thread_14 = 0;//sysj\orchestrator.sysj line: 221, column: 3
    count_thread_14 = 0;//sysj\orchestrator.sysj line: 222, column: 3
    eject_thread_14 = 0;//sysj\orchestrator.sysj line: 223, column: 3
        S49436=0;
    active[14]=1;
    ends[14]=1;
    tdone[14]=1;
  }

  public void thread51093(int [] tdone, int [] ends){
        S49433=1;
    S48495=0;
    active[13]=1;
    ends[13]=1;
    tdone[13]=1;
  }

  public void thread51092(int [] tdone, int [] ends){
        S48493=1;
    fillerStatusUIE.setPresent();//sysj\orchestrator.sysj line: 193, column: 4
    currsigs.addElement(fillerStatusUIE);
    fillerStatusUIE.setValue(false);//sysj\orchestrator.sysj line: 193, column: 4
    S47549=0;
    active[12]=1;
    ends[12]=1;
    tdone[12]=1;
  }

  public void thread51091(int [] tdone, int [] ends){
        S47546=1;
    capLoaderStatusUIE.setPresent();//sysj\orchestrator.sysj line: 179, column: 4
    currsigs.addElement(capLoaderStatusUIE);
    capLoaderStatusUIE.setValue(false);//sysj\orchestrator.sysj line: 179, column: 4
    S46602=0;
    active[11]=1;
    ends[11]=1;
    tdone[11]=1;
  }

  public void thread51090(int [] tdone, int [] ends){
        S46599=1;
    capperStatusUIE.setPresent();//sysj\orchestrator.sysj line: 165, column: 4
    currsigs.addElement(capperStatusUIE);
    capperStatusUIE.setValue(false);//sysj\orchestrator.sysj line: 165, column: 4
    S45655=0;
    active[10]=1;
    ends[10]=1;
    tdone[10]=1;
  }

  public void thread51089(int [] tdone, int [] ends){
        S45652=1;
    conveyorStatusUIE.setPresent();//sysj\orchestrator.sysj line: 153, column: 4
    currsigs.addElement(conveyorStatusUIE);
    conveyorStatusUIE.setValue(false);//sysj\orchestrator.sysj line: 153, column: 4
    S44708=0;
    active[9]=1;
    ends[9]=1;
    tdone[9]=1;
  }

  public void thread51087(int [] tdone, int [] ends){
        S44665=1;
    foundCurrentOrder_1.setPresent();//sysj\orchestrator.sysj line: 141, column: 9
    currsigs.addElement(foundCurrentOrder_1);
    active[8]=1;
    ends[8]=1;
    tdone[8]=1;
  }

  public void thread51086(int [] tdone, int [] ends){
        S44660=1;
    myOrder_thread_7 = (currentOrder_1.getpreval() == null ? null : ((Order)currentOrder_1.getpreval()));//sysj\orchestrator.sysj line: 138, column: 9
    currentOrder_1.setPresent();//sysj\orchestrator.sysj line: 139, column: 8
    currsigs.addElement(currentOrder_1);
    currentOrder_1.setValue(myOrder_thread_7);//sysj\orchestrator.sysj line: 139, column: 8
    active[7]=1;
    ends[7]=1;
    tdone[7]=1;
  }

  public void thread51085(int [] tdone, int [] ends){
        S44705=1;
    S44669=0;
    if(startOrder_1.getprestatus()){//sysj\orchestrator.sysj line: 134, column: 13
      if(currentOrder_1.getprestatus()){//sysj\orchestrator.sysj line: 135, column: 14
        thread51086(tdone,ends);
        thread51087(tdone,ends);
        int biggest51088 = 0;
        if(ends[7]>=biggest51088){
          biggest51088=ends[7];
        }
        if(ends[8]>=biggest51088){
          biggest51088=ends[8];
        }
        if(biggest51088 == 1){
          active[6]=1;
          ends[6]=1;
          tdone[6]=1;
        }
      }
      else {
        S44669=1;
        active[6]=1;
        ends[6]=1;
        tdone[6]=1;
      }
    }
    else {
      S44669=1;
      active[6]=1;
      ends[6]=1;
      tdone[6]=1;
    }
  }

  public void thread51084(int [] tdone, int [] ends){
        S44652=1;
    S44640=0;
    initABS_1.setPresent();//sysj\orchestrator.sysj line: 124, column: 6
    currsigs.addElement(initABS_1);
    active[5]=1;
    ends[5]=1;
    tdone[5]=1;
  }

  public void thread51082(int [] tdone, int [] ends){
        S39754=1;
    recOrderIsDone_1.setPresent();//sysj\orchestrator.sysj line: 87, column: 12
    currsigs.addElement(recOrderIsDone_1);
    active[4]=1;
    ends[4]=1;
    tdone[4]=1;
  }

  public void thread51081(int [] tdone, int [] ends){
        S39749=1;
    tempOrder_thread_3 = (currentOrder_1.getpreval() == null ? null : ((Order)currentOrder_1.getpreval()));//sysj\orchestrator.sysj line: 81, column: 9
    System.out.println("POS- ORDER IS DONE GONNA SEND DONE STATUS XD");//sysj\orchestrator.sysj line: 83, column: 9
    tempOrder_thread_3.setOrderStatus("Done");//sysj\orchestrator.sysj line: 84, column: 9
    orderStatus.setPresent();//sysj\orchestrator.sysj line: 85, column: 9
    currsigs.addElement(orderStatus);
    orderStatus.setValue(tempOrder_thread_3);//sysj\orchestrator.sysj line: 85, column: 9
    active[3]=1;
    ends[3]=1;
    tdone[3]=1;
  }

  public void thread51079(int [] tdone, int [] ends){
        S39754=1;
    recOrderIsDone_1.setPresent();//sysj\orchestrator.sysj line: 87, column: 12
    currsigs.addElement(recOrderIsDone_1);
    active[4]=1;
    ends[4]=1;
    tdone[4]=1;
  }

  public void thread51078(int [] tdone, int [] ends){
        S39749=1;
    tempOrder_thread_3 = (currentOrder_1.getpreval() == null ? null : ((Order)currentOrder_1.getpreval()));//sysj\orchestrator.sysj line: 81, column: 9
    System.out.println("POS- ORDER IS DONE GONNA SEND DONE STATUS XD");//sysj\orchestrator.sysj line: 83, column: 9
    tempOrder_thread_3.setOrderStatus("Done");//sysj\orchestrator.sysj line: 84, column: 9
    orderStatus.setPresent();//sysj\orchestrator.sysj line: 85, column: 9
    currsigs.addElement(orderStatus);
    orderStatus.setValue(tempOrder_thread_3);//sysj\orchestrator.sysj line: 85, column: 9
    active[3]=1;
    ends[3]=1;
    tdone[3]=1;
  }

  public void thread51077(int [] tdone, int [] ends){
        S44635=1;
    fifoQueue_thread_2 = new ArrayList();//sysj\orchestrator.sysj line: 30, column: 3
    S40518=0;
    if(order.getprestatus()){//sysj\orchestrator.sysj line: 36, column: 13
      System.out.println("got order!");//sysj\orchestrator.sysj line: 37, column: 5
      newOrder_thread_2 = (order.getpreval() == null ? null : ((Order)order.getpreval()));//sysj\orchestrator.sysj line: 38, column: 5
      System.out.println(newOrder_thread_2.getQuantity());//sysj\orchestrator.sysj line: 39, column: 5
      fifoQueue_thread_2.add(newOrder_thread_2);//sysj\orchestrator.sysj line: 41, column: 5
      if(initABS_1.getprestatus()){//sysj\orchestrator.sysj line: 44, column: 13
        System.out.println("start of ABS get first item");//sysj\orchestrator.sysj line: 45, column: 6
        tempOrder_thread_2 = (Order)fifoQueue_thread_2.get(0);//sysj\orchestrator.sysj line: 46, column: 6
        fifoQueue_thread_2.remove(0);//sysj\orchestrator.sysj line: 49, column: 6
        System.out.println(newOrder_thread_2.getCustomerID());//sysj\orchestrator.sysj line: 50, column: 6
        currentOrder_1.setPresent();//sysj\orchestrator.sysj line: 54, column: 7
        currsigs.addElement(currentOrder_1);
        currentOrder_1.setValue(tempOrder_thread_2);//sysj\orchestrator.sysj line: 54, column: 7
        startOrder_1.setPresent();//sysj\orchestrator.sysj line: 55, column: 7
        currsigs.addElement(startOrder_1);
        tempOrder_thread_2.setOrderStatus("Started");//sysj\orchestrator.sysj line: 60, column: 6
        System.out.println("emitting orderstatus: started");//sysj\orchestrator.sysj line: 61, column: 6
        orderStatus.setPresent();//sysj\orchestrator.sysj line: 64, column: 7
        currsigs.addElement(orderStatus);
        orderStatus.setValue(tempOrder_thread_2);//sysj\orchestrator.sysj line: 64, column: 7
        active[2]=1;
        ends[2]=1;
        tdone[2]=1;
      }
      else {
        S40518=1;
        if(orderIsDone_1.getprestatus()){//sysj\orchestrator.sysj line: 75, column: 13
          System.out.println("entered order is done");//sysj\orchestrator.sysj line: 76, column: 6
          if(currentOrder_1.getprestatus()){//sysj\orchestrator.sysj line: 77, column: 14
            System.out.println("entered current order present");//sysj\orchestrator.sysj line: 78, column: 7
            S39770=0;
            thread51078(tdone,ends);
            thread51079(tdone,ends);
            int biggest51080 = 0;
            if(ends[3]>=biggest51080){
              biggest51080=ends[3];
            }
            if(ends[4]>=biggest51080){
              biggest51080=ends[4];
            }
            if(biggest51080 == 1){
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
          }
          else {
            S40518=2;
            active[2]=1;
            ends[2]=1;
            tdone[2]=1;
          }
        }
        else {
          S40518=2;
          active[2]=1;
          ends[2]=1;
          tdone[2]=1;
        }
      }
    }
    else {
      S40518=1;
      if(orderIsDone_1.getprestatus()){//sysj\orchestrator.sysj line: 75, column: 13
        System.out.println("entered order is done");//sysj\orchestrator.sysj line: 76, column: 6
        if(currentOrder_1.getprestatus()){//sysj\orchestrator.sysj line: 77, column: 14
          System.out.println("entered current order present");//sysj\orchestrator.sysj line: 78, column: 7
          S39770=0;
          thread51081(tdone,ends);
          thread51082(tdone,ends);
          int biggest51083 = 0;
          if(ends[3]>=biggest51083){
            biggest51083=ends[3];
          }
          if(ends[4]>=biggest51083){
            biggest51083=ends[4];
          }
          if(biggest51083 == 1){
            active[2]=1;
            ends[2]=1;
            tdone[2]=1;
          }
        }
        else {
          S40518=2;
          active[2]=1;
          ends[2]=1;
          tdone[2]=1;
        }
      }
      else {
        S40518=2;
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
      switch(S51075){
        case 0 : 
          S51075=0;
          break RUN;
        
        case 1 : 
          S51075=2;
          S51075=2;
          sigConveyorReq_1.setClear();//sysj\orchestrator.sysj line: 16, column: 2
          sigCapperReq_1.setClear();//sysj\orchestrator.sysj line: 16, column: 2
          sigCapLoaderReq_1.setClear();//sysj\orchestrator.sysj line: 16, column: 2
          sigRotaryReq_1.setClear();//sysj\orchestrator.sysj line: 16, column: 2
          sigFillerReq_1.setClear();//sysj\orchestrator.sysj line: 17, column: 2
          recConveyorStatus_1.setClear();//sysj\orchestrator.sysj line: 18, column: 2
          recCapperStatus_1.setClear();//sysj\orchestrator.sysj line: 18, column: 2
          recCapLoaderStatus_1.setClear();//sysj\orchestrator.sysj line: 18, column: 2
          recFillerStatus_1.setClear();//sysj\orchestrator.sysj line: 18, column: 2
          recRotaryStatus_1.setClear();//sysj\orchestrator.sysj line: 18, column: 2
          getNextBottle_1.setClear();//sysj\orchestrator.sysj line: 19, column: 2
          startOrder_1.setClear();//sysj\orchestrator.sysj line: 22, column: 2
          orderIsDone_1.setClear();//sysj\orchestrator.sysj line: 23, column: 2
          initABS_1.setClear();//sysj\orchestrator.sysj line: 24, column: 2
          foundCurrentOrder_1.setClear();//sysj\orchestrator.sysj line: 25, column: 2
          currentOrder_1.setClear();//sysj\orchestrator.sysj line: 26, column: 2
          recOrderIsDone_1.setClear();//sysj\orchestrator.sysj line: 27, column: 2
          thread51077(tdone,ends);
          thread51084(tdone,ends);
          thread51085(tdone,ends);
          thread51089(tdone,ends);
          thread51090(tdone,ends);
          thread51091(tdone,ends);
          thread51092(tdone,ends);
          thread51093(tdone,ends);
          thread51094(tdone,ends);
          int biggest51095 = 0;
          if(ends[2]>=biggest51095){
            biggest51095=ends[2];
          }
          if(ends[5]>=biggest51095){
            biggest51095=ends[5];
          }
          if(ends[6]>=biggest51095){
            biggest51095=ends[6];
          }
          if(ends[9]>=biggest51095){
            biggest51095=ends[9];
          }
          if(ends[10]>=biggest51095){
            biggest51095=ends[10];
          }
          if(ends[11]>=biggest51095){
            biggest51095=ends[11];
          }
          if(ends[12]>=biggest51095){
            biggest51095=ends[12];
          }
          if(ends[13]>=biggest51095){
            biggest51095=ends[13];
          }
          if(ends[14]>=biggest51095){
            biggest51095=ends[14];
          }
          if(biggest51095 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
        
        case 2 : 
          sigConveyorReq_1.setClear();//sysj\orchestrator.sysj line: 16, column: 2
          sigCapperReq_1.setClear();//sysj\orchestrator.sysj line: 16, column: 2
          sigCapLoaderReq_1.setClear();//sysj\orchestrator.sysj line: 16, column: 2
          sigRotaryReq_1.setClear();//sysj\orchestrator.sysj line: 16, column: 2
          sigFillerReq_1.setClear();//sysj\orchestrator.sysj line: 17, column: 2
          recConveyorStatus_1.setClear();//sysj\orchestrator.sysj line: 18, column: 2
          recCapperStatus_1.setClear();//sysj\orchestrator.sysj line: 18, column: 2
          recCapLoaderStatus_1.setClear();//sysj\orchestrator.sysj line: 18, column: 2
          recFillerStatus_1.setClear();//sysj\orchestrator.sysj line: 18, column: 2
          recRotaryStatus_1.setClear();//sysj\orchestrator.sysj line: 18, column: 2
          getNextBottle_1.setClear();//sysj\orchestrator.sysj line: 19, column: 2
          startOrder_1.setClear();//sysj\orchestrator.sysj line: 22, column: 2
          orderIsDone_1.setClear();//sysj\orchestrator.sysj line: 23, column: 2
          initABS_1.setClear();//sysj\orchestrator.sysj line: 24, column: 2
          foundCurrentOrder_1.setClear();//sysj\orchestrator.sysj line: 25, column: 2
          currentOrder_1.setClear();//sysj\orchestrator.sysj line: 26, column: 2
          recOrderIsDone_1.setClear();//sysj\orchestrator.sysj line: 27, column: 2
          thread51096(tdone,ends);
          thread51109(tdone,ends);
          thread51110(tdone,ends);
          thread51117(tdone,ends);
          thread51118(tdone,ends);
          thread51119(tdone,ends);
          thread51120(tdone,ends);
          thread51121(tdone,ends);
          thread51122(tdone,ends);
          int biggest51135 = 0;
          if(ends[2]>=biggest51135){
            biggest51135=ends[2];
          }
          if(ends[5]>=biggest51135){
            biggest51135=ends[5];
          }
          if(ends[6]>=biggest51135){
            biggest51135=ends[6];
          }
          if(ends[9]>=biggest51135){
            biggest51135=ends[9];
          }
          if(ends[10]>=biggest51135){
            biggest51135=ends[10];
          }
          if(ends[11]>=biggest51135){
            biggest51135=ends[11];
          }
          if(ends[12]>=biggest51135){
            biggest51135=ends[12];
          }
          if(ends[13]>=biggest51135){
            biggest51135=ends[13];
          }
          if(ends[14]>=biggest51135){
            biggest51135=ends[14];
          }
          if(biggest51135 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
          //FINXME code
          if(biggest51135 == 0){
            S51075=0;
            active[1]=0;
            ends[1]=0;
            S51075=0;
            break RUN;
          }
        
      }
    }
  }

  public void init(){
    char [] active1 = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
    char [] paused1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    char [] suspended1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    paused = paused1;
    active = active1;
    suspended = suspended1;
    // Now instantiate all the local signals ONLY
    sigConveyorReq_1 = new Signal();
    sigCapperReq_1 = new Signal();
    sigCapLoaderReq_1 = new Signal();
    sigRotaryReq_1 = new Signal();
    sigFillerReq_1 = new Signal();
    recConveyorStatus_1 = new Signal();
    recCapperStatus_1 = new Signal();
    recCapLoaderStatus_1 = new Signal();
    recFillerStatus_1 = new Signal();
    recRotaryStatus_1 = new Signal();
    getNextBottle_1 = new Signal();
    startOrder_1 = new Signal();
    orderIsDone_1 = new Signal();
    initABS_1 = new Signal();
    foundCurrentOrder_1 = new Signal();
    currentOrder_1 = new Signal();
    recOrderIsDone_1 = new Signal();
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
          rotaryReq_o.gethook();
          fillerReq_o.gethook();
          capperReq_o.gethook();
          capLoaderReq_o.gethook();
          recOrderStatus.gethook();
          order.gethook();
          df = true;
        }
        runClockDomain();
      }
      recOrderStatus.setpreclear();
      order.setpreclear();
      orderStatus.setpreclear();
      conveyorStatusUIE.setpreclear();
      fillerStatusUIE.setpreclear();
      capperStatusUIE.setpreclear();
      capLoaderStatusUIE.setpreclear();
      rotaryStatusUIE.setpreclear();
      sigConveyorReq_1.setpreclear();
      sigCapperReq_1.setpreclear();
      sigCapLoaderReq_1.setpreclear();
      sigRotaryReq_1.setpreclear();
      sigFillerReq_1.setpreclear();
      recConveyorStatus_1.setpreclear();
      recCapperStatus_1.setpreclear();
      recCapLoaderStatus_1.setpreclear();
      recFillerStatus_1.setpreclear();
      recRotaryStatus_1.setpreclear();
      getNextBottle_1.setpreclear();
      startOrder_1.setpreclear();
      orderIsDone_1.setpreclear();
      initABS_1.setpreclear();
      foundCurrentOrder_1.setpreclear();
      currentOrder_1.setpreclear();
      recOrderIsDone_1.setpreclear();
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
      conveyorStatusUIE.sethook();
      conveyorStatusUIE.setClear();
      fillerStatusUIE.sethook();
      fillerStatusUIE.setClear();
      capperStatusUIE.sethook();
      capperStatusUIE.setClear();
      capLoaderStatusUIE.sethook();
      capLoaderStatusUIE.setClear();
      rotaryStatusUIE.sethook();
      rotaryStatusUIE.setClear();
      sigConveyorReq_1.setClear();
      sigCapperReq_1.setClear();
      sigCapLoaderReq_1.setClear();
      sigRotaryReq_1.setClear();
      sigFillerReq_1.setClear();
      recConveyorStatus_1.setClear();
      recCapperStatus_1.setClear();
      recCapLoaderStatus_1.setClear();
      recFillerStatus_1.setClear();
      recRotaryStatus_1.setClear();
      getNextBottle_1.setClear();
      startOrder_1.setClear();
      orderIsDone_1.setClear();
      initABS_1.setClear();
      foundCurrentOrder_1.setClear();
      currentOrder_1.setClear();
      recOrderIsDone_1.setClear();
      conveyorStatus_in.sethook();
      capperStatus_in.sethook();
      capLoaderStatus_in.sethook();
      fillerStatus_in.sethook();
      rotaryStatus_in.sethook();
      conveyorReq_o.sethook();
      rotaryReq_o.sethook();
      fillerReq_o.sethook();
      capperReq_o.sethook();
      capLoaderReq_o.sethook();
      if(paused[1]!=0 || suspended[1]!=0 || active[1]!=1);
      else{
        conveyorStatus_in.gethook();
        capperStatus_in.gethook();
        capLoaderStatus_in.gethook();
        fillerStatus_in.gethook();
        rotaryStatus_in.gethook();
        conveyorReq_o.gethook();
        rotaryReq_o.gethook();
        fillerReq_o.gethook();
        capperReq_o.gethook();
        capLoaderReq_o.gethook();
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
