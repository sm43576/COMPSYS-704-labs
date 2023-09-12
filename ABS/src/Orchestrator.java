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
  private String res_thread_11;//sysj\orchestrator.sysj line: 187, column: 4
  private ArrayList req_thread_12;//sysj\orchestrator.sysj line: 197, column: 4
  private String res_thread_12;//sysj\orchestrator.sysj line: 202, column: 4
  private String res_thread_13;//sysj\orchestrator.sysj line: 214, column: 4
  private Order order_thread_14;//sysj\orchestrator.sysj line: 229, column: 4
  private int S52008 = 1;
  private int S45596 = 1;
  private int S41479 = 1;
  private int S40731 = 1;
  private int S40710 = 1;
  private int S40715 = 1;
  private int S45613 = 1;
  private int S45601 = 1;
  private int S45666 = 1;
  private int S45630 = 1;
  private int S45621 = 1;
  private int S45626 = 1;
  private int S46606 = 1;
  private int S45668 = 1;
  private int S45675 = 1;
  private int S45670 = 1;
  private int S45719 = 1;
  private int S45714 = 1;
  private int S47546 = 1;
  private int S46608 = 1;
  private int S46615 = 1;
  private int S46610 = 1;
  private int S46659 = 1;
  private int S46654 = 1;
  private int S48486 = 1;
  private int S47548 = 1;
  private int S47555 = 1;
  private int S47550 = 1;
  private int S47599 = 1;
  private int S47594 = 1;
  private int S49426 = 1;
  private int S48488 = 1;
  private int S48495 = 1;
  private int S48490 = 1;
  private int S48539 = 1;
  private int S48534 = 1;
  private int S50366 = 1;
  private int S49428 = 1;
  private int S49435 = 1;
  private int S49430 = 1;
  private int S49479 = 1;
  private int S49474 = 1;
  private int S52006 = 1;
  private int S50369 = 1;
  private int S50374 = 1;
  private int S50377 = 1;
  private int S50380 = 1;
  private int S50383 = 1;
  private int S50393 = 1;
  private int S50570 = 1;
  
  private int[] ends = new int[18];
  private int[] tdone = new int[18];
  
  public void thread52066(int [] tdone, int [] ends){
        S50383=1;
    active[17]=1;
    ends[17]=1;
    tdone[17]=1;
  }

  public void thread52065(int [] tdone, int [] ends){
        S50380=1;
    active[16]=1;
    ends[16]=1;
    tdone[16]=1;
  }

  public void thread52064(int [] tdone, int [] ends){
        S50377=1;
    active[15]=1;
    ends[15]=1;
    tdone[15]=1;
  }

  public void thread52062(int [] tdone, int [] ends){
        switch(S50383){
      case 0 : 
        active[17]=0;
        ends[17]=0;
        tdone[17]=1;
        break;
      
      case 1 : 
        if(recCapperStatus_1.getprestatus()){//sysj\orchestrator.sysj line: 252, column: 73
          S50383=0;
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

  public void thread52061(int [] tdone, int [] ends){
        switch(S50380){
      case 0 : 
        active[16]=0;
        ends[16]=0;
        tdone[16]=1;
        break;
      
      case 1 : 
        if(recCapLoaderStatus_1.getprestatus()){//sysj\orchestrator.sysj line: 252, column: 41
          S50380=0;
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

  public void thread52060(int [] tdone, int [] ends){
        switch(S50377){
      case 0 : 
        active[15]=0;
        ends[15]=0;
        tdone[15]=1;
        break;
      
      case 1 : 
        if(recFillerStatus_1.getprestatus()){//sysj\orchestrator.sysj line: 252, column: 12
          S50377=0;
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

  public void thread52058(int [] tdone, int [] ends){
        S50383=1;
    active[17]=1;
    ends[17]=1;
    tdone[17]=1;
  }

  public void thread52057(int [] tdone, int [] ends){
        S50380=1;
    active[16]=1;
    ends[16]=1;
    tdone[16]=1;
  }

  public void thread52056(int [] tdone, int [] ends){
        S50377=1;
    active[15]=1;
    ends[15]=1;
    tdone[15]=1;
  }

  public void thread52055(int [] tdone, int [] ends){
        switch(S52006){
      case 0 : 
        active[14]=0;
        ends[14]=0;
        tdone[14]=1;
        break;
      
      case 1 : 
        switch(S50369){
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
              S50369=1;
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
              S50369=2;
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
              S50369=3;
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
                S50374=0;
                thread52056(tdone,ends);
                thread52057(tdone,ends);
                thread52058(tdone,ends);
                int biggest52059 = 0;
                if(ends[15]>=biggest52059){
                  biggest52059=ends[15];
                }
                if(ends[16]>=biggest52059){
                  biggest52059=ends[16];
                }
                if(ends[17]>=biggest52059){
                  biggest52059=ends[17];
                }
                if(biggest52059 == 1){
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
                S50369=4;
                if(eject_thread_14 >= 0){//sysj\orchestrator.sysj line: 281, column: 11
                  sigRotaryReq_1.setPresent();//sysj\orchestrator.sysj line: 282, column: 5
                  currsigs.addElement(sigRotaryReq_1);
                  S50570=0;
                  active[14]=1;
                  ends[14]=1;
                  tdone[14]=1;
                }
                else {
                  ends[14]=2;
                  ;//sysj\orchestrator.sysj line: 281, column: 4
                  System.out.println("Orch: Order complete.");//sysj\orchestrator.sysj line: 288, column: 4
                  S50369=5;
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
            switch(S50374){
              case 0 : 
                thread52060(tdone,ends);
                thread52061(tdone,ends);
                thread52062(tdone,ends);
                int biggest52063 = 0;
                if(ends[15]>=biggest52063){
                  biggest52063=ends[15];
                }
                if(ends[16]>=biggest52063){
                  biggest52063=ends[16];
                }
                if(ends[17]>=biggest52063){
                  biggest52063=ends[17];
                }
                if(biggest52063 == 1){
                  active[14]=1;
                  ends[14]=1;
                  tdone[14]=1;
                }
                //FINXME code
                if(biggest52063 == 0){
                  System.out.println("Orch: All done!");//sysj\orchestrator.sysj line: 253, column: 5
                  count_thread_14 = count_thread_14 - 1;//sysj\orchestrator.sysj line: 255, column: 5
                  S50374=1;
                  if(count_thread_14 >= 0){//sysj\orchestrator.sysj line: 257, column: 9
                    System.out.println("Orch: Loading next bottle...");//sysj\orchestrator.sysj line: 259, column: 6
                    sigConveyorReq_1.setPresent();//sysj\orchestrator.sysj line: 260, column: 6
                    currsigs.addElement(sigConveyorReq_1);
                    sigConveyorReq_1.setValue(true);//sysj\orchestrator.sysj line: 260, column: 6
                    S50393=0;
                    active[14]=1;
                    ends[14]=1;
                    tdone[14]=1;
                  }
                  else {
                    S50374=2;
                    active[14]=1;
                    ends[14]=1;
                    tdone[14]=1;
                  }
                }
                break;
              
              case 1 : 
                switch(S50393){
                  case 0 : 
                    if(recConveyorStatus_1.getprestatus()){//sysj\orchestrator.sysj line: 261, column: 12
                      System.out.println("Orch: Loaded new bottle.");//sysj\orchestrator.sysj line: 262, column: 6
                      sigRotaryReq_1.setPresent();//sysj\orchestrator.sysj line: 265, column: 6
                      currsigs.addElement(sigRotaryReq_1);
                      S50393=1;
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
                      S50374=2;
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
                S50374=2;
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
                  S50374=0;
                  thread52064(tdone,ends);
                  thread52065(tdone,ends);
                  thread52066(tdone,ends);
                  int biggest52067 = 0;
                  if(ends[15]>=biggest52067){
                    biggest52067=ends[15];
                  }
                  if(ends[16]>=biggest52067){
                    biggest52067=ends[16];
                  }
                  if(ends[17]>=biggest52067){
                    biggest52067=ends[17];
                  }
                  if(biggest52067 == 1){
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
                  S50369=4;
                  if(eject_thread_14 >= 0){//sysj\orchestrator.sysj line: 281, column: 11
                    sigRotaryReq_1.setPresent();//sysj\orchestrator.sysj line: 282, column: 5
                    currsigs.addElement(sigRotaryReq_1);
                    S50570=0;
                    active[14]=1;
                    ends[14]=1;
                    tdone[14]=1;
                  }
                  else {
                    ends[14]=2;
                    ;//sysj\orchestrator.sysj line: 281, column: 4
                    System.out.println("Orch: Order complete.");//sysj\orchestrator.sysj line: 288, column: 4
                    S50369=5;
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
            switch(S50570){
              case 0 : 
                if(recRotaryStatus_1.getprestatus()){//sysj\orchestrator.sysj line: 283, column: 11
                  sigConveyorReq_1.setPresent();//sysj\orchestrator.sysj line: 284, column: 5
                  currsigs.addElement(sigConveyorReq_1);
                  S50570=1;
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
                    S50570=0;
                    active[14]=1;
                    ends[14]=1;
                    tdone[14]=1;
                  }
                  else {
                    ends[14]=2;
                    ;//sysj\orchestrator.sysj line: 281, column: 4
                    System.out.println("Orch: Order complete.");//sysj\orchestrator.sysj line: 288, column: 4
                    S50369=5;
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
              S50369=6;
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
            S50369=6;
            S50369=0;
            active[14]=1;
            ends[14]=1;
            tdone[14]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread52054(int [] tdone, int [] ends){
        switch(S50366){
      case 0 : 
        active[13]=0;
        ends[13]=0;
        tdone[13]=1;
        break;
      
      case 1 : 
        switch(S49428){
          case 0 : 
            if(sigRotaryReq_1.getprestatus()){//sysj\orchestrator.sysj line: 209, column: 10
              System.out.println("Orch: Sending rotary request");//sysj\orchestrator.sysj line: 210, column: 4
              S49428=1;
              S49435=0;
              if(!rotaryReq_o.isPartnerPresent() || rotaryReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 211, column: 4
                rotaryReq_o.setREQ(false);//sysj\orchestrator.sysj line: 211, column: 4
                S49435=1;
                active[13]=1;
                ends[13]=1;
                tdone[13]=1;
              }
              else {
                S49430=0;
                if(rotaryReq_o.isACK()){//sysj\orchestrator.sysj line: 211, column: 4
                  rotaryReq_o.setVal(true);//sysj\orchestrator.sysj line: 211, column: 4
                  S49430=1;
                  if(!rotaryReq_o.isACK()){//sysj\orchestrator.sysj line: 211, column: 4
                    rotaryReq_o.setREQ(false);//sysj\orchestrator.sysj line: 211, column: 4
                    ends[13]=2;
                    ;//sysj\orchestrator.sysj line: 211, column: 4
                    S49428=2;
                    S49479=0;
                    if(!rotaryStatus_in.isPartnerPresent() || rotaryStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 212, column: 4
                      rotaryStatus_in.setACK(false);//sysj\orchestrator.sysj line: 212, column: 4
                      S49479=1;
                      active[13]=1;
                      ends[13]=1;
                      tdone[13]=1;
                    }
                    else {
                      S49474=0;
                      if(!rotaryStatus_in.isREQ()){//sysj\orchestrator.sysj line: 212, column: 4
                        rotaryStatus_in.setACK(true);//sysj\orchestrator.sysj line: 212, column: 4
                        S49474=1;
                        if(rotaryStatus_in.isREQ()){//sysj\orchestrator.sysj line: 212, column: 4
                          rotaryStatus_in.setACK(false);//sysj\orchestrator.sysj line: 212, column: 4
                          ends[13]=2;
                          ;//sysj\orchestrator.sysj line: 212, column: 4
                          System.out.println("Orch: Received rotary status");//sysj\orchestrator.sysj line: 213, column: 4
                          res_thread_13 = (String)(rotaryStatus_in.getVal() == null ? null : ((String)rotaryStatus_in.getVal()));//sysj\orchestrator.sysj line: 214, column: 4
                          recRotaryStatus_1.setPresent();//sysj\orchestrator.sysj line: 215, column: 4
                          currsigs.addElement(recRotaryStatus_1);
                          recRotaryStatus_1.setValue(res_thread_13);//sysj\orchestrator.sysj line: 215, column: 4
                          S49428=0;
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
            switch(S49435){
              case 0 : 
                if(!rotaryReq_o.isPartnerPresent() || rotaryReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 211, column: 4
                  rotaryReq_o.setREQ(false);//sysj\orchestrator.sysj line: 211, column: 4
                  S49435=1;
                  active[13]=1;
                  ends[13]=1;
                  tdone[13]=1;
                }
                else {
                  switch(S49430){
                    case 0 : 
                      if(rotaryReq_o.isACK()){//sysj\orchestrator.sysj line: 211, column: 4
                        rotaryReq_o.setVal(true);//sysj\orchestrator.sysj line: 211, column: 4
                        S49430=1;
                        if(!rotaryReq_o.isACK()){//sysj\orchestrator.sysj line: 211, column: 4
                          rotaryReq_o.setREQ(false);//sysj\orchestrator.sysj line: 211, column: 4
                          ends[13]=2;
                          ;//sysj\orchestrator.sysj line: 211, column: 4
                          S49428=2;
                          S49479=0;
                          if(!rotaryStatus_in.isPartnerPresent() || rotaryStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 212, column: 4
                            rotaryStatus_in.setACK(false);//sysj\orchestrator.sysj line: 212, column: 4
                            S49479=1;
                            active[13]=1;
                            ends[13]=1;
                            tdone[13]=1;
                          }
                          else {
                            S49474=0;
                            if(!rotaryStatus_in.isREQ()){//sysj\orchestrator.sysj line: 212, column: 4
                              rotaryStatus_in.setACK(true);//sysj\orchestrator.sysj line: 212, column: 4
                              S49474=1;
                              if(rotaryStatus_in.isREQ()){//sysj\orchestrator.sysj line: 212, column: 4
                                rotaryStatus_in.setACK(false);//sysj\orchestrator.sysj line: 212, column: 4
                                ends[13]=2;
                                ;//sysj\orchestrator.sysj line: 212, column: 4
                                System.out.println("Orch: Received rotary status");//sysj\orchestrator.sysj line: 213, column: 4
                                res_thread_13 = (String)(rotaryStatus_in.getVal() == null ? null : ((String)rotaryStatus_in.getVal()));//sysj\orchestrator.sysj line: 214, column: 4
                                recRotaryStatus_1.setPresent();//sysj\orchestrator.sysj line: 215, column: 4
                                currsigs.addElement(recRotaryStatus_1);
                                recRotaryStatus_1.setValue(res_thread_13);//sysj\orchestrator.sysj line: 215, column: 4
                                S49428=0;
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
                        S49428=2;
                        S49479=0;
                        if(!rotaryStatus_in.isPartnerPresent() || rotaryStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 212, column: 4
                          rotaryStatus_in.setACK(false);//sysj\orchestrator.sysj line: 212, column: 4
                          S49479=1;
                          active[13]=1;
                          ends[13]=1;
                          tdone[13]=1;
                        }
                        else {
                          S49474=0;
                          if(!rotaryStatus_in.isREQ()){//sysj\orchestrator.sysj line: 212, column: 4
                            rotaryStatus_in.setACK(true);//sysj\orchestrator.sysj line: 212, column: 4
                            S49474=1;
                            if(rotaryStatus_in.isREQ()){//sysj\orchestrator.sysj line: 212, column: 4
                              rotaryStatus_in.setACK(false);//sysj\orchestrator.sysj line: 212, column: 4
                              ends[13]=2;
                              ;//sysj\orchestrator.sysj line: 212, column: 4
                              System.out.println("Orch: Received rotary status");//sysj\orchestrator.sysj line: 213, column: 4
                              res_thread_13 = (String)(rotaryStatus_in.getVal() == null ? null : ((String)rotaryStatus_in.getVal()));//sysj\orchestrator.sysj line: 214, column: 4
                              recRotaryStatus_1.setPresent();//sysj\orchestrator.sysj line: 215, column: 4
                              currsigs.addElement(recRotaryStatus_1);
                              recRotaryStatus_1.setValue(res_thread_13);//sysj\orchestrator.sysj line: 215, column: 4
                              S49428=0;
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
                S49435=1;
                S49435=0;
                if(!rotaryReq_o.isPartnerPresent() || rotaryReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 211, column: 4
                  rotaryReq_o.setREQ(false);//sysj\orchestrator.sysj line: 211, column: 4
                  S49435=1;
                  active[13]=1;
                  ends[13]=1;
                  tdone[13]=1;
                }
                else {
                  S49430=0;
                  if(rotaryReq_o.isACK()){//sysj\orchestrator.sysj line: 211, column: 4
                    rotaryReq_o.setVal(true);//sysj\orchestrator.sysj line: 211, column: 4
                    S49430=1;
                    if(!rotaryReq_o.isACK()){//sysj\orchestrator.sysj line: 211, column: 4
                      rotaryReq_o.setREQ(false);//sysj\orchestrator.sysj line: 211, column: 4
                      ends[13]=2;
                      ;//sysj\orchestrator.sysj line: 211, column: 4
                      S49428=2;
                      S49479=0;
                      if(!rotaryStatus_in.isPartnerPresent() || rotaryStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 212, column: 4
                        rotaryStatus_in.setACK(false);//sysj\orchestrator.sysj line: 212, column: 4
                        S49479=1;
                        active[13]=1;
                        ends[13]=1;
                        tdone[13]=1;
                      }
                      else {
                        S49474=0;
                        if(!rotaryStatus_in.isREQ()){//sysj\orchestrator.sysj line: 212, column: 4
                          rotaryStatus_in.setACK(true);//sysj\orchestrator.sysj line: 212, column: 4
                          S49474=1;
                          if(rotaryStatus_in.isREQ()){//sysj\orchestrator.sysj line: 212, column: 4
                            rotaryStatus_in.setACK(false);//sysj\orchestrator.sysj line: 212, column: 4
                            ends[13]=2;
                            ;//sysj\orchestrator.sysj line: 212, column: 4
                            System.out.println("Orch: Received rotary status");//sysj\orchestrator.sysj line: 213, column: 4
                            res_thread_13 = (String)(rotaryStatus_in.getVal() == null ? null : ((String)rotaryStatus_in.getVal()));//sysj\orchestrator.sysj line: 214, column: 4
                            recRotaryStatus_1.setPresent();//sysj\orchestrator.sysj line: 215, column: 4
                            currsigs.addElement(recRotaryStatus_1);
                            recRotaryStatus_1.setValue(res_thread_13);//sysj\orchestrator.sysj line: 215, column: 4
                            S49428=0;
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
            switch(S49479){
              case 0 : 
                if(!rotaryStatus_in.isPartnerPresent() || rotaryStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 212, column: 4
                  rotaryStatus_in.setACK(false);//sysj\orchestrator.sysj line: 212, column: 4
                  S49479=1;
                  active[13]=1;
                  ends[13]=1;
                  tdone[13]=1;
                }
                else {
                  switch(S49474){
                    case 0 : 
                      if(!rotaryStatus_in.isREQ()){//sysj\orchestrator.sysj line: 212, column: 4
                        rotaryStatus_in.setACK(true);//sysj\orchestrator.sysj line: 212, column: 4
                        S49474=1;
                        if(rotaryStatus_in.isREQ()){//sysj\orchestrator.sysj line: 212, column: 4
                          rotaryStatus_in.setACK(false);//sysj\orchestrator.sysj line: 212, column: 4
                          ends[13]=2;
                          ;//sysj\orchestrator.sysj line: 212, column: 4
                          System.out.println("Orch: Received rotary status");//sysj\orchestrator.sysj line: 213, column: 4
                          res_thread_13 = (String)(rotaryStatus_in.getVal() == null ? null : ((String)rotaryStatus_in.getVal()));//sysj\orchestrator.sysj line: 214, column: 4
                          recRotaryStatus_1.setPresent();//sysj\orchestrator.sysj line: 215, column: 4
                          currsigs.addElement(recRotaryStatus_1);
                          recRotaryStatus_1.setValue(res_thread_13);//sysj\orchestrator.sysj line: 215, column: 4
                          S49428=0;
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
                        S49428=0;
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
                S49479=1;
                S49479=0;
                if(!rotaryStatus_in.isPartnerPresent() || rotaryStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 212, column: 4
                  rotaryStatus_in.setACK(false);//sysj\orchestrator.sysj line: 212, column: 4
                  S49479=1;
                  active[13]=1;
                  ends[13]=1;
                  tdone[13]=1;
                }
                else {
                  S49474=0;
                  if(!rotaryStatus_in.isREQ()){//sysj\orchestrator.sysj line: 212, column: 4
                    rotaryStatus_in.setACK(true);//sysj\orchestrator.sysj line: 212, column: 4
                    S49474=1;
                    if(rotaryStatus_in.isREQ()){//sysj\orchestrator.sysj line: 212, column: 4
                      rotaryStatus_in.setACK(false);//sysj\orchestrator.sysj line: 212, column: 4
                      ends[13]=2;
                      ;//sysj\orchestrator.sysj line: 212, column: 4
                      System.out.println("Orch: Received rotary status");//sysj\orchestrator.sysj line: 213, column: 4
                      res_thread_13 = (String)(rotaryStatus_in.getVal() == null ? null : ((String)rotaryStatus_in.getVal()));//sysj\orchestrator.sysj line: 214, column: 4
                      recRotaryStatus_1.setPresent();//sysj\orchestrator.sysj line: 215, column: 4
                      currsigs.addElement(recRotaryStatus_1);
                      recRotaryStatus_1.setValue(res_thread_13);//sysj\orchestrator.sysj line: 215, column: 4
                      S49428=0;
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

  public void thread52053(int [] tdone, int [] ends){
        switch(S49426){
      case 0 : 
        active[12]=0;
        ends[12]=0;
        tdone[12]=1;
        break;
      
      case 1 : 
        switch(S48488){
          case 0 : 
            if(sigFillerReq_1.getprestatus()){//sysj\orchestrator.sysj line: 194, column: 10
              fillerStatusUIE.setPresent();//sysj\orchestrator.sysj line: 195, column: 4
              currsigs.addElement(fillerStatusUIE);
              fillerStatusUIE.setValue(true);//sysj\orchestrator.sysj line: 195, column: 4
              System.out.println("Orch: Sending filler request");//sysj\orchestrator.sysj line: 196, column: 4
              req_thread_12 = (ArrayList)(sigFillerReq_1.getpreval() == null ? null : ((ArrayList)sigFillerReq_1.getpreval()));//sysj\orchestrator.sysj line: 197, column: 4
              S48488=1;
              S48495=0;
              if(!fillerReq_o.isPartnerPresent() || fillerReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 198, column: 4
                fillerReq_o.setREQ(false);//sysj\orchestrator.sysj line: 198, column: 4
                S48495=1;
                active[12]=1;
                ends[12]=1;
                tdone[12]=1;
              }
              else {
                S48490=0;
                if(fillerReq_o.isACK()){//sysj\orchestrator.sysj line: 198, column: 4
                  fillerReq_o.setVal(req_thread_12);//sysj\orchestrator.sysj line: 198, column: 4
                  S48490=1;
                  if(!fillerReq_o.isACK()){//sysj\orchestrator.sysj line: 198, column: 4
                    fillerReq_o.setREQ(false);//sysj\orchestrator.sysj line: 198, column: 4
                    ends[12]=2;
                    ;//sysj\orchestrator.sysj line: 198, column: 4
                    S48488=2;
                    S48539=0;
                    if(!fillerStatus_in.isPartnerPresent() || fillerStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 199, column: 4
                      fillerStatus_in.setACK(false);//sysj\orchestrator.sysj line: 199, column: 4
                      S48539=1;
                      active[12]=1;
                      ends[12]=1;
                      tdone[12]=1;
                    }
                    else {
                      S48534=0;
                      if(!fillerStatus_in.isREQ()){//sysj\orchestrator.sysj line: 199, column: 4
                        fillerStatus_in.setACK(true);//sysj\orchestrator.sysj line: 199, column: 4
                        S48534=1;
                        if(fillerStatus_in.isREQ()){//sysj\orchestrator.sysj line: 199, column: 4
                          fillerStatus_in.setACK(false);//sysj\orchestrator.sysj line: 199, column: 4
                          ends[12]=2;
                          ;//sysj\orchestrator.sysj line: 199, column: 4
                          fillerStatusUIE.setPresent();//sysj\orchestrator.sysj line: 200, column: 4
                          currsigs.addElement(fillerStatusUIE);
                          fillerStatusUIE.setValue(false);//sysj\orchestrator.sysj line: 200, column: 4
                          System.out.println("Orch: Received filler status");//sysj\orchestrator.sysj line: 201, column: 4
                          res_thread_12 = (String)(fillerStatus_in.getVal() == null ? null : ((String)fillerStatus_in.getVal()));//sysj\orchestrator.sysj line: 202, column: 4
                          recFillerStatus_1.setPresent();//sysj\orchestrator.sysj line: 203, column: 4
                          currsigs.addElement(recFillerStatus_1);
                          recFillerStatus_1.setValue(res_thread_12);//sysj\orchestrator.sysj line: 203, column: 4
                          S48488=0;
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
            switch(S48495){
              case 0 : 
                if(!fillerReq_o.isPartnerPresent() || fillerReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 198, column: 4
                  fillerReq_o.setREQ(false);//sysj\orchestrator.sysj line: 198, column: 4
                  S48495=1;
                  active[12]=1;
                  ends[12]=1;
                  tdone[12]=1;
                }
                else {
                  switch(S48490){
                    case 0 : 
                      if(fillerReq_o.isACK()){//sysj\orchestrator.sysj line: 198, column: 4
                        fillerReq_o.setVal(req_thread_12);//sysj\orchestrator.sysj line: 198, column: 4
                        S48490=1;
                        if(!fillerReq_o.isACK()){//sysj\orchestrator.sysj line: 198, column: 4
                          fillerReq_o.setREQ(false);//sysj\orchestrator.sysj line: 198, column: 4
                          ends[12]=2;
                          ;//sysj\orchestrator.sysj line: 198, column: 4
                          S48488=2;
                          S48539=0;
                          if(!fillerStatus_in.isPartnerPresent() || fillerStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 199, column: 4
                            fillerStatus_in.setACK(false);//sysj\orchestrator.sysj line: 199, column: 4
                            S48539=1;
                            active[12]=1;
                            ends[12]=1;
                            tdone[12]=1;
                          }
                          else {
                            S48534=0;
                            if(!fillerStatus_in.isREQ()){//sysj\orchestrator.sysj line: 199, column: 4
                              fillerStatus_in.setACK(true);//sysj\orchestrator.sysj line: 199, column: 4
                              S48534=1;
                              if(fillerStatus_in.isREQ()){//sysj\orchestrator.sysj line: 199, column: 4
                                fillerStatus_in.setACK(false);//sysj\orchestrator.sysj line: 199, column: 4
                                ends[12]=2;
                                ;//sysj\orchestrator.sysj line: 199, column: 4
                                fillerStatusUIE.setPresent();//sysj\orchestrator.sysj line: 200, column: 4
                                currsigs.addElement(fillerStatusUIE);
                                fillerStatusUIE.setValue(false);//sysj\orchestrator.sysj line: 200, column: 4
                                System.out.println("Orch: Received filler status");//sysj\orchestrator.sysj line: 201, column: 4
                                res_thread_12 = (String)(fillerStatus_in.getVal() == null ? null : ((String)fillerStatus_in.getVal()));//sysj\orchestrator.sysj line: 202, column: 4
                                recFillerStatus_1.setPresent();//sysj\orchestrator.sysj line: 203, column: 4
                                currsigs.addElement(recFillerStatus_1);
                                recFillerStatus_1.setValue(res_thread_12);//sysj\orchestrator.sysj line: 203, column: 4
                                S48488=0;
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
                        S48488=2;
                        S48539=0;
                        if(!fillerStatus_in.isPartnerPresent() || fillerStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 199, column: 4
                          fillerStatus_in.setACK(false);//sysj\orchestrator.sysj line: 199, column: 4
                          S48539=1;
                          active[12]=1;
                          ends[12]=1;
                          tdone[12]=1;
                        }
                        else {
                          S48534=0;
                          if(!fillerStatus_in.isREQ()){//sysj\orchestrator.sysj line: 199, column: 4
                            fillerStatus_in.setACK(true);//sysj\orchestrator.sysj line: 199, column: 4
                            S48534=1;
                            if(fillerStatus_in.isREQ()){//sysj\orchestrator.sysj line: 199, column: 4
                              fillerStatus_in.setACK(false);//sysj\orchestrator.sysj line: 199, column: 4
                              ends[12]=2;
                              ;//sysj\orchestrator.sysj line: 199, column: 4
                              fillerStatusUIE.setPresent();//sysj\orchestrator.sysj line: 200, column: 4
                              currsigs.addElement(fillerStatusUIE);
                              fillerStatusUIE.setValue(false);//sysj\orchestrator.sysj line: 200, column: 4
                              System.out.println("Orch: Received filler status");//sysj\orchestrator.sysj line: 201, column: 4
                              res_thread_12 = (String)(fillerStatus_in.getVal() == null ? null : ((String)fillerStatus_in.getVal()));//sysj\orchestrator.sysj line: 202, column: 4
                              recFillerStatus_1.setPresent();//sysj\orchestrator.sysj line: 203, column: 4
                              currsigs.addElement(recFillerStatus_1);
                              recFillerStatus_1.setValue(res_thread_12);//sysj\orchestrator.sysj line: 203, column: 4
                              S48488=0;
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
                S48495=1;
                S48495=0;
                if(!fillerReq_o.isPartnerPresent() || fillerReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 198, column: 4
                  fillerReq_o.setREQ(false);//sysj\orchestrator.sysj line: 198, column: 4
                  S48495=1;
                  active[12]=1;
                  ends[12]=1;
                  tdone[12]=1;
                }
                else {
                  S48490=0;
                  if(fillerReq_o.isACK()){//sysj\orchestrator.sysj line: 198, column: 4
                    fillerReq_o.setVal(req_thread_12);//sysj\orchestrator.sysj line: 198, column: 4
                    S48490=1;
                    if(!fillerReq_o.isACK()){//sysj\orchestrator.sysj line: 198, column: 4
                      fillerReq_o.setREQ(false);//sysj\orchestrator.sysj line: 198, column: 4
                      ends[12]=2;
                      ;//sysj\orchestrator.sysj line: 198, column: 4
                      S48488=2;
                      S48539=0;
                      if(!fillerStatus_in.isPartnerPresent() || fillerStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 199, column: 4
                        fillerStatus_in.setACK(false);//sysj\orchestrator.sysj line: 199, column: 4
                        S48539=1;
                        active[12]=1;
                        ends[12]=1;
                        tdone[12]=1;
                      }
                      else {
                        S48534=0;
                        if(!fillerStatus_in.isREQ()){//sysj\orchestrator.sysj line: 199, column: 4
                          fillerStatus_in.setACK(true);//sysj\orchestrator.sysj line: 199, column: 4
                          S48534=1;
                          if(fillerStatus_in.isREQ()){//sysj\orchestrator.sysj line: 199, column: 4
                            fillerStatus_in.setACK(false);//sysj\orchestrator.sysj line: 199, column: 4
                            ends[12]=2;
                            ;//sysj\orchestrator.sysj line: 199, column: 4
                            fillerStatusUIE.setPresent();//sysj\orchestrator.sysj line: 200, column: 4
                            currsigs.addElement(fillerStatusUIE);
                            fillerStatusUIE.setValue(false);//sysj\orchestrator.sysj line: 200, column: 4
                            System.out.println("Orch: Received filler status");//sysj\orchestrator.sysj line: 201, column: 4
                            res_thread_12 = (String)(fillerStatus_in.getVal() == null ? null : ((String)fillerStatus_in.getVal()));//sysj\orchestrator.sysj line: 202, column: 4
                            recFillerStatus_1.setPresent();//sysj\orchestrator.sysj line: 203, column: 4
                            currsigs.addElement(recFillerStatus_1);
                            recFillerStatus_1.setValue(res_thread_12);//sysj\orchestrator.sysj line: 203, column: 4
                            S48488=0;
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
            switch(S48539){
              case 0 : 
                if(!fillerStatus_in.isPartnerPresent() || fillerStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 199, column: 4
                  fillerStatus_in.setACK(false);//sysj\orchestrator.sysj line: 199, column: 4
                  S48539=1;
                  active[12]=1;
                  ends[12]=1;
                  tdone[12]=1;
                }
                else {
                  switch(S48534){
                    case 0 : 
                      if(!fillerStatus_in.isREQ()){//sysj\orchestrator.sysj line: 199, column: 4
                        fillerStatus_in.setACK(true);//sysj\orchestrator.sysj line: 199, column: 4
                        S48534=1;
                        if(fillerStatus_in.isREQ()){//sysj\orchestrator.sysj line: 199, column: 4
                          fillerStatus_in.setACK(false);//sysj\orchestrator.sysj line: 199, column: 4
                          ends[12]=2;
                          ;//sysj\orchestrator.sysj line: 199, column: 4
                          fillerStatusUIE.setPresent();//sysj\orchestrator.sysj line: 200, column: 4
                          currsigs.addElement(fillerStatusUIE);
                          fillerStatusUIE.setValue(false);//sysj\orchestrator.sysj line: 200, column: 4
                          System.out.println("Orch: Received filler status");//sysj\orchestrator.sysj line: 201, column: 4
                          res_thread_12 = (String)(fillerStatus_in.getVal() == null ? null : ((String)fillerStatus_in.getVal()));//sysj\orchestrator.sysj line: 202, column: 4
                          recFillerStatus_1.setPresent();//sysj\orchestrator.sysj line: 203, column: 4
                          currsigs.addElement(recFillerStatus_1);
                          recFillerStatus_1.setValue(res_thread_12);//sysj\orchestrator.sysj line: 203, column: 4
                          S48488=0;
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
                        fillerStatusUIE.setPresent();//sysj\orchestrator.sysj line: 200, column: 4
                        currsigs.addElement(fillerStatusUIE);
                        fillerStatusUIE.setValue(false);//sysj\orchestrator.sysj line: 200, column: 4
                        System.out.println("Orch: Received filler status");//sysj\orchestrator.sysj line: 201, column: 4
                        res_thread_12 = (String)(fillerStatus_in.getVal() == null ? null : ((String)fillerStatus_in.getVal()));//sysj\orchestrator.sysj line: 202, column: 4
                        recFillerStatus_1.setPresent();//sysj\orchestrator.sysj line: 203, column: 4
                        currsigs.addElement(recFillerStatus_1);
                        recFillerStatus_1.setValue(res_thread_12);//sysj\orchestrator.sysj line: 203, column: 4
                        S48488=0;
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
                S48539=1;
                S48539=0;
                if(!fillerStatus_in.isPartnerPresent() || fillerStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 199, column: 4
                  fillerStatus_in.setACK(false);//sysj\orchestrator.sysj line: 199, column: 4
                  S48539=1;
                  active[12]=1;
                  ends[12]=1;
                  tdone[12]=1;
                }
                else {
                  S48534=0;
                  if(!fillerStatus_in.isREQ()){//sysj\orchestrator.sysj line: 199, column: 4
                    fillerStatus_in.setACK(true);//sysj\orchestrator.sysj line: 199, column: 4
                    S48534=1;
                    if(fillerStatus_in.isREQ()){//sysj\orchestrator.sysj line: 199, column: 4
                      fillerStatus_in.setACK(false);//sysj\orchestrator.sysj line: 199, column: 4
                      ends[12]=2;
                      ;//sysj\orchestrator.sysj line: 199, column: 4
                      fillerStatusUIE.setPresent();//sysj\orchestrator.sysj line: 200, column: 4
                      currsigs.addElement(fillerStatusUIE);
                      fillerStatusUIE.setValue(false);//sysj\orchestrator.sysj line: 200, column: 4
                      System.out.println("Orch: Received filler status");//sysj\orchestrator.sysj line: 201, column: 4
                      res_thread_12 = (String)(fillerStatus_in.getVal() == null ? null : ((String)fillerStatus_in.getVal()));//sysj\orchestrator.sysj line: 202, column: 4
                      recFillerStatus_1.setPresent();//sysj\orchestrator.sysj line: 203, column: 4
                      currsigs.addElement(recFillerStatus_1);
                      recFillerStatus_1.setValue(res_thread_12);//sysj\orchestrator.sysj line: 203, column: 4
                      S48488=0;
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

  public void thread52052(int [] tdone, int [] ends){
        switch(S48486){
      case 0 : 
        active[11]=0;
        ends[11]=0;
        tdone[11]=1;
        break;
      
      case 1 : 
        switch(S47548){
          case 0 : 
            if(sigCapLoaderReq_1.getprestatus()){//sysj\orchestrator.sysj line: 179, column: 10
              capLoaderStatusUIE.setPresent();//sysj\orchestrator.sysj line: 180, column: 4
              currsigs.addElement(capLoaderStatusUIE);
              capLoaderStatusUIE.setValue(true);//sysj\orchestrator.sysj line: 180, column: 4
              System.out.println("Orch: Sending cap loader request");//sysj\orchestrator.sysj line: 181, column: 4
              S47548=1;
              S47555=0;
              if(!capLoaderReq_o.isPartnerPresent() || capLoaderReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 182, column: 4
                capLoaderReq_o.setREQ(false);//sysj\orchestrator.sysj line: 182, column: 4
                S47555=1;
                active[11]=1;
                ends[11]=1;
                tdone[11]=1;
              }
              else {
                S47550=0;
                if(capLoaderReq_o.isACK()){//sysj\orchestrator.sysj line: 182, column: 4
                  capLoaderReq_o.setVal(true);//sysj\orchestrator.sysj line: 182, column: 4
                  S47550=1;
                  if(!capLoaderReq_o.isACK()){//sysj\orchestrator.sysj line: 182, column: 4
                    capLoaderReq_o.setREQ(false);//sysj\orchestrator.sysj line: 182, column: 4
                    ends[11]=2;
                    ;//sysj\orchestrator.sysj line: 182, column: 4
                    S47548=2;
                    S47599=0;
                    if(!capLoaderStatus_in.isPartnerPresent() || capLoaderStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 183, column: 4
                      capLoaderStatus_in.setACK(false);//sysj\orchestrator.sysj line: 183, column: 4
                      S47599=1;
                      active[11]=1;
                      ends[11]=1;
                      tdone[11]=1;
                    }
                    else {
                      S47594=0;
                      if(!capLoaderStatus_in.isREQ()){//sysj\orchestrator.sysj line: 183, column: 4
                        capLoaderStatus_in.setACK(true);//sysj\orchestrator.sysj line: 183, column: 4
                        S47594=1;
                        if(capLoaderStatus_in.isREQ()){//sysj\orchestrator.sysj line: 183, column: 4
                          capLoaderStatus_in.setACK(false);//sysj\orchestrator.sysj line: 183, column: 4
                          ends[11]=2;
                          ;//sysj\orchestrator.sysj line: 183, column: 4
                          capLoaderStatusUIE.setPresent();//sysj\orchestrator.sysj line: 184, column: 4
                          currsigs.addElement(capLoaderStatusUIE);
                          capLoaderStatusUIE.setValue(false);//sysj\orchestrator.sysj line: 184, column: 4
                          System.out.println("Orch: Received cap loader status");//sysj\orchestrator.sysj line: 185, column: 4
                          res_thread_11 = (String)(capLoaderStatus_in.getVal() == null ? null : ((String)capLoaderStatus_in.getVal()));//sysj\orchestrator.sysj line: 187, column: 4
                          recCapLoaderStatus_1.setPresent();//sysj\orchestrator.sysj line: 188, column: 4
                          currsigs.addElement(recCapLoaderStatus_1);
                          recCapLoaderStatus_1.setValue(res_thread_11);//sysj\orchestrator.sysj line: 188, column: 4
                          S47548=0;
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
            switch(S47555){
              case 0 : 
                if(!capLoaderReq_o.isPartnerPresent() || capLoaderReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 182, column: 4
                  capLoaderReq_o.setREQ(false);//sysj\orchestrator.sysj line: 182, column: 4
                  S47555=1;
                  active[11]=1;
                  ends[11]=1;
                  tdone[11]=1;
                }
                else {
                  switch(S47550){
                    case 0 : 
                      if(capLoaderReq_o.isACK()){//sysj\orchestrator.sysj line: 182, column: 4
                        capLoaderReq_o.setVal(true);//sysj\orchestrator.sysj line: 182, column: 4
                        S47550=1;
                        if(!capLoaderReq_o.isACK()){//sysj\orchestrator.sysj line: 182, column: 4
                          capLoaderReq_o.setREQ(false);//sysj\orchestrator.sysj line: 182, column: 4
                          ends[11]=2;
                          ;//sysj\orchestrator.sysj line: 182, column: 4
                          S47548=2;
                          S47599=0;
                          if(!capLoaderStatus_in.isPartnerPresent() || capLoaderStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 183, column: 4
                            capLoaderStatus_in.setACK(false);//sysj\orchestrator.sysj line: 183, column: 4
                            S47599=1;
                            active[11]=1;
                            ends[11]=1;
                            tdone[11]=1;
                          }
                          else {
                            S47594=0;
                            if(!capLoaderStatus_in.isREQ()){//sysj\orchestrator.sysj line: 183, column: 4
                              capLoaderStatus_in.setACK(true);//sysj\orchestrator.sysj line: 183, column: 4
                              S47594=1;
                              if(capLoaderStatus_in.isREQ()){//sysj\orchestrator.sysj line: 183, column: 4
                                capLoaderStatus_in.setACK(false);//sysj\orchestrator.sysj line: 183, column: 4
                                ends[11]=2;
                                ;//sysj\orchestrator.sysj line: 183, column: 4
                                capLoaderStatusUIE.setPresent();//sysj\orchestrator.sysj line: 184, column: 4
                                currsigs.addElement(capLoaderStatusUIE);
                                capLoaderStatusUIE.setValue(false);//sysj\orchestrator.sysj line: 184, column: 4
                                System.out.println("Orch: Received cap loader status");//sysj\orchestrator.sysj line: 185, column: 4
                                res_thread_11 = (String)(capLoaderStatus_in.getVal() == null ? null : ((String)capLoaderStatus_in.getVal()));//sysj\orchestrator.sysj line: 187, column: 4
                                recCapLoaderStatus_1.setPresent();//sysj\orchestrator.sysj line: 188, column: 4
                                currsigs.addElement(recCapLoaderStatus_1);
                                recCapLoaderStatus_1.setValue(res_thread_11);//sysj\orchestrator.sysj line: 188, column: 4
                                S47548=0;
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
                      if(!capLoaderReq_o.isACK()){//sysj\orchestrator.sysj line: 182, column: 4
                        capLoaderReq_o.setREQ(false);//sysj\orchestrator.sysj line: 182, column: 4
                        ends[11]=2;
                        ;//sysj\orchestrator.sysj line: 182, column: 4
                        S47548=2;
                        S47599=0;
                        if(!capLoaderStatus_in.isPartnerPresent() || capLoaderStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 183, column: 4
                          capLoaderStatus_in.setACK(false);//sysj\orchestrator.sysj line: 183, column: 4
                          S47599=1;
                          active[11]=1;
                          ends[11]=1;
                          tdone[11]=1;
                        }
                        else {
                          S47594=0;
                          if(!capLoaderStatus_in.isREQ()){//sysj\orchestrator.sysj line: 183, column: 4
                            capLoaderStatus_in.setACK(true);//sysj\orchestrator.sysj line: 183, column: 4
                            S47594=1;
                            if(capLoaderStatus_in.isREQ()){//sysj\orchestrator.sysj line: 183, column: 4
                              capLoaderStatus_in.setACK(false);//sysj\orchestrator.sysj line: 183, column: 4
                              ends[11]=2;
                              ;//sysj\orchestrator.sysj line: 183, column: 4
                              capLoaderStatusUIE.setPresent();//sysj\orchestrator.sysj line: 184, column: 4
                              currsigs.addElement(capLoaderStatusUIE);
                              capLoaderStatusUIE.setValue(false);//sysj\orchestrator.sysj line: 184, column: 4
                              System.out.println("Orch: Received cap loader status");//sysj\orchestrator.sysj line: 185, column: 4
                              res_thread_11 = (String)(capLoaderStatus_in.getVal() == null ? null : ((String)capLoaderStatus_in.getVal()));//sysj\orchestrator.sysj line: 187, column: 4
                              recCapLoaderStatus_1.setPresent();//sysj\orchestrator.sysj line: 188, column: 4
                              currsigs.addElement(recCapLoaderStatus_1);
                              recCapLoaderStatus_1.setValue(res_thread_11);//sysj\orchestrator.sysj line: 188, column: 4
                              S47548=0;
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
                S47555=1;
                S47555=0;
                if(!capLoaderReq_o.isPartnerPresent() || capLoaderReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 182, column: 4
                  capLoaderReq_o.setREQ(false);//sysj\orchestrator.sysj line: 182, column: 4
                  S47555=1;
                  active[11]=1;
                  ends[11]=1;
                  tdone[11]=1;
                }
                else {
                  S47550=0;
                  if(capLoaderReq_o.isACK()){//sysj\orchestrator.sysj line: 182, column: 4
                    capLoaderReq_o.setVal(true);//sysj\orchestrator.sysj line: 182, column: 4
                    S47550=1;
                    if(!capLoaderReq_o.isACK()){//sysj\orchestrator.sysj line: 182, column: 4
                      capLoaderReq_o.setREQ(false);//sysj\orchestrator.sysj line: 182, column: 4
                      ends[11]=2;
                      ;//sysj\orchestrator.sysj line: 182, column: 4
                      S47548=2;
                      S47599=0;
                      if(!capLoaderStatus_in.isPartnerPresent() || capLoaderStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 183, column: 4
                        capLoaderStatus_in.setACK(false);//sysj\orchestrator.sysj line: 183, column: 4
                        S47599=1;
                        active[11]=1;
                        ends[11]=1;
                        tdone[11]=1;
                      }
                      else {
                        S47594=0;
                        if(!capLoaderStatus_in.isREQ()){//sysj\orchestrator.sysj line: 183, column: 4
                          capLoaderStatus_in.setACK(true);//sysj\orchestrator.sysj line: 183, column: 4
                          S47594=1;
                          if(capLoaderStatus_in.isREQ()){//sysj\orchestrator.sysj line: 183, column: 4
                            capLoaderStatus_in.setACK(false);//sysj\orchestrator.sysj line: 183, column: 4
                            ends[11]=2;
                            ;//sysj\orchestrator.sysj line: 183, column: 4
                            capLoaderStatusUIE.setPresent();//sysj\orchestrator.sysj line: 184, column: 4
                            currsigs.addElement(capLoaderStatusUIE);
                            capLoaderStatusUIE.setValue(false);//sysj\orchestrator.sysj line: 184, column: 4
                            System.out.println("Orch: Received cap loader status");//sysj\orchestrator.sysj line: 185, column: 4
                            res_thread_11 = (String)(capLoaderStatus_in.getVal() == null ? null : ((String)capLoaderStatus_in.getVal()));//sysj\orchestrator.sysj line: 187, column: 4
                            recCapLoaderStatus_1.setPresent();//sysj\orchestrator.sysj line: 188, column: 4
                            currsigs.addElement(recCapLoaderStatus_1);
                            recCapLoaderStatus_1.setValue(res_thread_11);//sysj\orchestrator.sysj line: 188, column: 4
                            S47548=0;
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
            switch(S47599){
              case 0 : 
                if(!capLoaderStatus_in.isPartnerPresent() || capLoaderStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 183, column: 4
                  capLoaderStatus_in.setACK(false);//sysj\orchestrator.sysj line: 183, column: 4
                  S47599=1;
                  active[11]=1;
                  ends[11]=1;
                  tdone[11]=1;
                }
                else {
                  switch(S47594){
                    case 0 : 
                      if(!capLoaderStatus_in.isREQ()){//sysj\orchestrator.sysj line: 183, column: 4
                        capLoaderStatus_in.setACK(true);//sysj\orchestrator.sysj line: 183, column: 4
                        S47594=1;
                        if(capLoaderStatus_in.isREQ()){//sysj\orchestrator.sysj line: 183, column: 4
                          capLoaderStatus_in.setACK(false);//sysj\orchestrator.sysj line: 183, column: 4
                          ends[11]=2;
                          ;//sysj\orchestrator.sysj line: 183, column: 4
                          capLoaderStatusUIE.setPresent();//sysj\orchestrator.sysj line: 184, column: 4
                          currsigs.addElement(capLoaderStatusUIE);
                          capLoaderStatusUIE.setValue(false);//sysj\orchestrator.sysj line: 184, column: 4
                          System.out.println("Orch: Received cap loader status");//sysj\orchestrator.sysj line: 185, column: 4
                          res_thread_11 = (String)(capLoaderStatus_in.getVal() == null ? null : ((String)capLoaderStatus_in.getVal()));//sysj\orchestrator.sysj line: 187, column: 4
                          recCapLoaderStatus_1.setPresent();//sysj\orchestrator.sysj line: 188, column: 4
                          currsigs.addElement(recCapLoaderStatus_1);
                          recCapLoaderStatus_1.setValue(res_thread_11);//sysj\orchestrator.sysj line: 188, column: 4
                          S47548=0;
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
                      if(capLoaderStatus_in.isREQ()){//sysj\orchestrator.sysj line: 183, column: 4
                        capLoaderStatus_in.setACK(false);//sysj\orchestrator.sysj line: 183, column: 4
                        ends[11]=2;
                        ;//sysj\orchestrator.sysj line: 183, column: 4
                        capLoaderStatusUIE.setPresent();//sysj\orchestrator.sysj line: 184, column: 4
                        currsigs.addElement(capLoaderStatusUIE);
                        capLoaderStatusUIE.setValue(false);//sysj\orchestrator.sysj line: 184, column: 4
                        System.out.println("Orch: Received cap loader status");//sysj\orchestrator.sysj line: 185, column: 4
                        res_thread_11 = (String)(capLoaderStatus_in.getVal() == null ? null : ((String)capLoaderStatus_in.getVal()));//sysj\orchestrator.sysj line: 187, column: 4
                        recCapLoaderStatus_1.setPresent();//sysj\orchestrator.sysj line: 188, column: 4
                        currsigs.addElement(recCapLoaderStatus_1);
                        recCapLoaderStatus_1.setValue(res_thread_11);//sysj\orchestrator.sysj line: 188, column: 4
                        S47548=0;
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
                S47599=1;
                S47599=0;
                if(!capLoaderStatus_in.isPartnerPresent() || capLoaderStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 183, column: 4
                  capLoaderStatus_in.setACK(false);//sysj\orchestrator.sysj line: 183, column: 4
                  S47599=1;
                  active[11]=1;
                  ends[11]=1;
                  tdone[11]=1;
                }
                else {
                  S47594=0;
                  if(!capLoaderStatus_in.isREQ()){//sysj\orchestrator.sysj line: 183, column: 4
                    capLoaderStatus_in.setACK(true);//sysj\orchestrator.sysj line: 183, column: 4
                    S47594=1;
                    if(capLoaderStatus_in.isREQ()){//sysj\orchestrator.sysj line: 183, column: 4
                      capLoaderStatus_in.setACK(false);//sysj\orchestrator.sysj line: 183, column: 4
                      ends[11]=2;
                      ;//sysj\orchestrator.sysj line: 183, column: 4
                      capLoaderStatusUIE.setPresent();//sysj\orchestrator.sysj line: 184, column: 4
                      currsigs.addElement(capLoaderStatusUIE);
                      capLoaderStatusUIE.setValue(false);//sysj\orchestrator.sysj line: 184, column: 4
                      System.out.println("Orch: Received cap loader status");//sysj\orchestrator.sysj line: 185, column: 4
                      res_thread_11 = (String)(capLoaderStatus_in.getVal() == null ? null : ((String)capLoaderStatus_in.getVal()));//sysj\orchestrator.sysj line: 187, column: 4
                      recCapLoaderStatus_1.setPresent();//sysj\orchestrator.sysj line: 188, column: 4
                      currsigs.addElement(recCapLoaderStatus_1);
                      recCapLoaderStatus_1.setValue(res_thread_11);//sysj\orchestrator.sysj line: 188, column: 4
                      S47548=0;
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

  public void thread52051(int [] tdone, int [] ends){
        switch(S47546){
      case 0 : 
        active[10]=0;
        ends[10]=0;
        tdone[10]=1;
        break;
      
      case 1 : 
        switch(S46608){
          case 0 : 
            if(sigCapperReq_1.getprestatus()){//sysj\orchestrator.sysj line: 165, column: 10
              capperStatusUIE.setPresent();//sysj\orchestrator.sysj line: 166, column: 4
              currsigs.addElement(capperStatusUIE);
              capperStatusUIE.setValue(true);//sysj\orchestrator.sysj line: 166, column: 4
              System.out.println("Orch: Sending capper request");//sysj\orchestrator.sysj line: 167, column: 4
              S46608=1;
              S46615=0;
              if(!capperReq_o.isPartnerPresent() || capperReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 168, column: 4
                capperReq_o.setREQ(false);//sysj\orchestrator.sysj line: 168, column: 4
                S46615=1;
                active[10]=1;
                ends[10]=1;
                tdone[10]=1;
              }
              else {
                S46610=0;
                if(capperReq_o.isACK()){//sysj\orchestrator.sysj line: 168, column: 4
                  capperReq_o.setVal(true);//sysj\orchestrator.sysj line: 168, column: 4
                  S46610=1;
                  if(!capperReq_o.isACK()){//sysj\orchestrator.sysj line: 168, column: 4
                    capperReq_o.setREQ(false);//sysj\orchestrator.sysj line: 168, column: 4
                    ends[10]=2;
                    ;//sysj\orchestrator.sysj line: 168, column: 4
                    S46608=2;
                    S46659=0;
                    if(!capperStatus_in.isPartnerPresent() || capperStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 169, column: 4
                      capperStatus_in.setACK(false);//sysj\orchestrator.sysj line: 169, column: 4
                      S46659=1;
                      active[10]=1;
                      ends[10]=1;
                      tdone[10]=1;
                    }
                    else {
                      S46654=0;
                      if(!capperStatus_in.isREQ()){//sysj\orchestrator.sysj line: 169, column: 4
                        capperStatus_in.setACK(true);//sysj\orchestrator.sysj line: 169, column: 4
                        S46654=1;
                        if(capperStatus_in.isREQ()){//sysj\orchestrator.sysj line: 169, column: 4
                          capperStatus_in.setACK(false);//sysj\orchestrator.sysj line: 169, column: 4
                          ends[10]=2;
                          ;//sysj\orchestrator.sysj line: 169, column: 4
                          capperStatusUIE.setPresent();//sysj\orchestrator.sysj line: 170, column: 4
                          currsigs.addElement(capperStatusUIE);
                          capperStatusUIE.setValue(false);//sysj\orchestrator.sysj line: 170, column: 4
                          System.out.println("Orch: Received capper status");//sysj\orchestrator.sysj line: 171, column: 4
                          res_thread_10 = (String)(capperStatus_in.getVal() == null ? null : ((String)capperStatus_in.getVal()));//sysj\orchestrator.sysj line: 172, column: 4
                          recCapperStatus_1.setPresent();//sysj\orchestrator.sysj line: 173, column: 4
                          currsigs.addElement(recCapperStatus_1);
                          recCapperStatus_1.setValue(res_thread_10);//sysj\orchestrator.sysj line: 173, column: 4
                          S46608=0;
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
            switch(S46615){
              case 0 : 
                if(!capperReq_o.isPartnerPresent() || capperReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 168, column: 4
                  capperReq_o.setREQ(false);//sysj\orchestrator.sysj line: 168, column: 4
                  S46615=1;
                  active[10]=1;
                  ends[10]=1;
                  tdone[10]=1;
                }
                else {
                  switch(S46610){
                    case 0 : 
                      if(capperReq_o.isACK()){//sysj\orchestrator.sysj line: 168, column: 4
                        capperReq_o.setVal(true);//sysj\orchestrator.sysj line: 168, column: 4
                        S46610=1;
                        if(!capperReq_o.isACK()){//sysj\orchestrator.sysj line: 168, column: 4
                          capperReq_o.setREQ(false);//sysj\orchestrator.sysj line: 168, column: 4
                          ends[10]=2;
                          ;//sysj\orchestrator.sysj line: 168, column: 4
                          S46608=2;
                          S46659=0;
                          if(!capperStatus_in.isPartnerPresent() || capperStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 169, column: 4
                            capperStatus_in.setACK(false);//sysj\orchestrator.sysj line: 169, column: 4
                            S46659=1;
                            active[10]=1;
                            ends[10]=1;
                            tdone[10]=1;
                          }
                          else {
                            S46654=0;
                            if(!capperStatus_in.isREQ()){//sysj\orchestrator.sysj line: 169, column: 4
                              capperStatus_in.setACK(true);//sysj\orchestrator.sysj line: 169, column: 4
                              S46654=1;
                              if(capperStatus_in.isREQ()){//sysj\orchestrator.sysj line: 169, column: 4
                                capperStatus_in.setACK(false);//sysj\orchestrator.sysj line: 169, column: 4
                                ends[10]=2;
                                ;//sysj\orchestrator.sysj line: 169, column: 4
                                capperStatusUIE.setPresent();//sysj\orchestrator.sysj line: 170, column: 4
                                currsigs.addElement(capperStatusUIE);
                                capperStatusUIE.setValue(false);//sysj\orchestrator.sysj line: 170, column: 4
                                System.out.println("Orch: Received capper status");//sysj\orchestrator.sysj line: 171, column: 4
                                res_thread_10 = (String)(capperStatus_in.getVal() == null ? null : ((String)capperStatus_in.getVal()));//sysj\orchestrator.sysj line: 172, column: 4
                                recCapperStatus_1.setPresent();//sysj\orchestrator.sysj line: 173, column: 4
                                currsigs.addElement(recCapperStatus_1);
                                recCapperStatus_1.setValue(res_thread_10);//sysj\orchestrator.sysj line: 173, column: 4
                                S46608=0;
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
                      if(!capperReq_o.isACK()){//sysj\orchestrator.sysj line: 168, column: 4
                        capperReq_o.setREQ(false);//sysj\orchestrator.sysj line: 168, column: 4
                        ends[10]=2;
                        ;//sysj\orchestrator.sysj line: 168, column: 4
                        S46608=2;
                        S46659=0;
                        if(!capperStatus_in.isPartnerPresent() || capperStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 169, column: 4
                          capperStatus_in.setACK(false);//sysj\orchestrator.sysj line: 169, column: 4
                          S46659=1;
                          active[10]=1;
                          ends[10]=1;
                          tdone[10]=1;
                        }
                        else {
                          S46654=0;
                          if(!capperStatus_in.isREQ()){//sysj\orchestrator.sysj line: 169, column: 4
                            capperStatus_in.setACK(true);//sysj\orchestrator.sysj line: 169, column: 4
                            S46654=1;
                            if(capperStatus_in.isREQ()){//sysj\orchestrator.sysj line: 169, column: 4
                              capperStatus_in.setACK(false);//sysj\orchestrator.sysj line: 169, column: 4
                              ends[10]=2;
                              ;//sysj\orchestrator.sysj line: 169, column: 4
                              capperStatusUIE.setPresent();//sysj\orchestrator.sysj line: 170, column: 4
                              currsigs.addElement(capperStatusUIE);
                              capperStatusUIE.setValue(false);//sysj\orchestrator.sysj line: 170, column: 4
                              System.out.println("Orch: Received capper status");//sysj\orchestrator.sysj line: 171, column: 4
                              res_thread_10 = (String)(capperStatus_in.getVal() == null ? null : ((String)capperStatus_in.getVal()));//sysj\orchestrator.sysj line: 172, column: 4
                              recCapperStatus_1.setPresent();//sysj\orchestrator.sysj line: 173, column: 4
                              currsigs.addElement(recCapperStatus_1);
                              recCapperStatus_1.setValue(res_thread_10);//sysj\orchestrator.sysj line: 173, column: 4
                              S46608=0;
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
                S46615=1;
                S46615=0;
                if(!capperReq_o.isPartnerPresent() || capperReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 168, column: 4
                  capperReq_o.setREQ(false);//sysj\orchestrator.sysj line: 168, column: 4
                  S46615=1;
                  active[10]=1;
                  ends[10]=1;
                  tdone[10]=1;
                }
                else {
                  S46610=0;
                  if(capperReq_o.isACK()){//sysj\orchestrator.sysj line: 168, column: 4
                    capperReq_o.setVal(true);//sysj\orchestrator.sysj line: 168, column: 4
                    S46610=1;
                    if(!capperReq_o.isACK()){//sysj\orchestrator.sysj line: 168, column: 4
                      capperReq_o.setREQ(false);//sysj\orchestrator.sysj line: 168, column: 4
                      ends[10]=2;
                      ;//sysj\orchestrator.sysj line: 168, column: 4
                      S46608=2;
                      S46659=0;
                      if(!capperStatus_in.isPartnerPresent() || capperStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 169, column: 4
                        capperStatus_in.setACK(false);//sysj\orchestrator.sysj line: 169, column: 4
                        S46659=1;
                        active[10]=1;
                        ends[10]=1;
                        tdone[10]=1;
                      }
                      else {
                        S46654=0;
                        if(!capperStatus_in.isREQ()){//sysj\orchestrator.sysj line: 169, column: 4
                          capperStatus_in.setACK(true);//sysj\orchestrator.sysj line: 169, column: 4
                          S46654=1;
                          if(capperStatus_in.isREQ()){//sysj\orchestrator.sysj line: 169, column: 4
                            capperStatus_in.setACK(false);//sysj\orchestrator.sysj line: 169, column: 4
                            ends[10]=2;
                            ;//sysj\orchestrator.sysj line: 169, column: 4
                            capperStatusUIE.setPresent();//sysj\orchestrator.sysj line: 170, column: 4
                            currsigs.addElement(capperStatusUIE);
                            capperStatusUIE.setValue(false);//sysj\orchestrator.sysj line: 170, column: 4
                            System.out.println("Orch: Received capper status");//sysj\orchestrator.sysj line: 171, column: 4
                            res_thread_10 = (String)(capperStatus_in.getVal() == null ? null : ((String)capperStatus_in.getVal()));//sysj\orchestrator.sysj line: 172, column: 4
                            recCapperStatus_1.setPresent();//sysj\orchestrator.sysj line: 173, column: 4
                            currsigs.addElement(recCapperStatus_1);
                            recCapperStatus_1.setValue(res_thread_10);//sysj\orchestrator.sysj line: 173, column: 4
                            S46608=0;
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
            switch(S46659){
              case 0 : 
                if(!capperStatus_in.isPartnerPresent() || capperStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 169, column: 4
                  capperStatus_in.setACK(false);//sysj\orchestrator.sysj line: 169, column: 4
                  S46659=1;
                  active[10]=1;
                  ends[10]=1;
                  tdone[10]=1;
                }
                else {
                  switch(S46654){
                    case 0 : 
                      if(!capperStatus_in.isREQ()){//sysj\orchestrator.sysj line: 169, column: 4
                        capperStatus_in.setACK(true);//sysj\orchestrator.sysj line: 169, column: 4
                        S46654=1;
                        if(capperStatus_in.isREQ()){//sysj\orchestrator.sysj line: 169, column: 4
                          capperStatus_in.setACK(false);//sysj\orchestrator.sysj line: 169, column: 4
                          ends[10]=2;
                          ;//sysj\orchestrator.sysj line: 169, column: 4
                          capperStatusUIE.setPresent();//sysj\orchestrator.sysj line: 170, column: 4
                          currsigs.addElement(capperStatusUIE);
                          capperStatusUIE.setValue(false);//sysj\orchestrator.sysj line: 170, column: 4
                          System.out.println("Orch: Received capper status");//sysj\orchestrator.sysj line: 171, column: 4
                          res_thread_10 = (String)(capperStatus_in.getVal() == null ? null : ((String)capperStatus_in.getVal()));//sysj\orchestrator.sysj line: 172, column: 4
                          recCapperStatus_1.setPresent();//sysj\orchestrator.sysj line: 173, column: 4
                          currsigs.addElement(recCapperStatus_1);
                          recCapperStatus_1.setValue(res_thread_10);//sysj\orchestrator.sysj line: 173, column: 4
                          S46608=0;
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
                      if(capperStatus_in.isREQ()){//sysj\orchestrator.sysj line: 169, column: 4
                        capperStatus_in.setACK(false);//sysj\orchestrator.sysj line: 169, column: 4
                        ends[10]=2;
                        ;//sysj\orchestrator.sysj line: 169, column: 4
                        capperStatusUIE.setPresent();//sysj\orchestrator.sysj line: 170, column: 4
                        currsigs.addElement(capperStatusUIE);
                        capperStatusUIE.setValue(false);//sysj\orchestrator.sysj line: 170, column: 4
                        System.out.println("Orch: Received capper status");//sysj\orchestrator.sysj line: 171, column: 4
                        res_thread_10 = (String)(capperStatus_in.getVal() == null ? null : ((String)capperStatus_in.getVal()));//sysj\orchestrator.sysj line: 172, column: 4
                        recCapperStatus_1.setPresent();//sysj\orchestrator.sysj line: 173, column: 4
                        currsigs.addElement(recCapperStatus_1);
                        recCapperStatus_1.setValue(res_thread_10);//sysj\orchestrator.sysj line: 173, column: 4
                        S46608=0;
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
                S46659=1;
                S46659=0;
                if(!capperStatus_in.isPartnerPresent() || capperStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 169, column: 4
                  capperStatus_in.setACK(false);//sysj\orchestrator.sysj line: 169, column: 4
                  S46659=1;
                  active[10]=1;
                  ends[10]=1;
                  tdone[10]=1;
                }
                else {
                  S46654=0;
                  if(!capperStatus_in.isREQ()){//sysj\orchestrator.sysj line: 169, column: 4
                    capperStatus_in.setACK(true);//sysj\orchestrator.sysj line: 169, column: 4
                    S46654=1;
                    if(capperStatus_in.isREQ()){//sysj\orchestrator.sysj line: 169, column: 4
                      capperStatus_in.setACK(false);//sysj\orchestrator.sysj line: 169, column: 4
                      ends[10]=2;
                      ;//sysj\orchestrator.sysj line: 169, column: 4
                      capperStatusUIE.setPresent();//sysj\orchestrator.sysj line: 170, column: 4
                      currsigs.addElement(capperStatusUIE);
                      capperStatusUIE.setValue(false);//sysj\orchestrator.sysj line: 170, column: 4
                      System.out.println("Orch: Received capper status");//sysj\orchestrator.sysj line: 171, column: 4
                      res_thread_10 = (String)(capperStatus_in.getVal() == null ? null : ((String)capperStatus_in.getVal()));//sysj\orchestrator.sysj line: 172, column: 4
                      recCapperStatus_1.setPresent();//sysj\orchestrator.sysj line: 173, column: 4
                      currsigs.addElement(recCapperStatus_1);
                      recCapperStatus_1.setValue(res_thread_10);//sysj\orchestrator.sysj line: 173, column: 4
                      S46608=0;
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

  public void thread52050(int [] tdone, int [] ends){
        switch(S46606){
      case 0 : 
        active[9]=0;
        ends[9]=0;
        tdone[9]=1;
        break;
      
      case 1 : 
        switch(S45668){
          case 0 : 
            if(sigConveyorReq_1.getprestatus()){//sysj\orchestrator.sysj line: 153, column: 10
              conveyorStatusUIE.setPresent();//sysj\orchestrator.sysj line: 154, column: 4
              currsigs.addElement(conveyorStatusUIE);
              conveyorStatusUIE.setValue(true);//sysj\orchestrator.sysj line: 154, column: 4
              S45668=1;
              S45675=0;
              if(!conveyorReq_o.isPartnerPresent() || conveyorReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 155, column: 4
                conveyorReq_o.setREQ(false);//sysj\orchestrator.sysj line: 155, column: 4
                S45675=1;
                active[9]=1;
                ends[9]=1;
                tdone[9]=1;
              }
              else {
                S45670=0;
                if(conveyorReq_o.isACK()){//sysj\orchestrator.sysj line: 155, column: 4
                  conveyorReq_o.setVal(true);//sysj\orchestrator.sysj line: 155, column: 4
                  S45670=1;
                  if(!conveyorReq_o.isACK()){//sysj\orchestrator.sysj line: 155, column: 4
                    conveyorReq_o.setREQ(false);//sysj\orchestrator.sysj line: 155, column: 4
                    ends[9]=2;
                    ;//sysj\orchestrator.sysj line: 155, column: 4
                    S45668=2;
                    S45719=0;
                    if(!conveyorStatus_in.isPartnerPresent() || conveyorStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 156, column: 4
                      conveyorStatus_in.setACK(false);//sysj\orchestrator.sysj line: 156, column: 4
                      S45719=1;
                      active[9]=1;
                      ends[9]=1;
                      tdone[9]=1;
                    }
                    else {
                      S45714=0;
                      if(!conveyorStatus_in.isREQ()){//sysj\orchestrator.sysj line: 156, column: 4
                        conveyorStatus_in.setACK(true);//sysj\orchestrator.sysj line: 156, column: 4
                        S45714=1;
                        if(conveyorStatus_in.isREQ()){//sysj\orchestrator.sysj line: 156, column: 4
                          conveyorStatus_in.setACK(false);//sysj\orchestrator.sysj line: 156, column: 4
                          ends[9]=2;
                          ;//sysj\orchestrator.sysj line: 156, column: 4
                          conveyorStatusUIE.setPresent();//sysj\orchestrator.sysj line: 157, column: 4
                          currsigs.addElement(conveyorStatusUIE);
                          conveyorStatusUIE.setValue(false);//sysj\orchestrator.sysj line: 157, column: 4
                          res_thread_9 = (String)(conveyorStatus_in.getVal() == null ? null : ((String)conveyorStatus_in.getVal()));//sysj\orchestrator.sysj line: 158, column: 4
                          recConveyorStatus_1.setPresent();//sysj\orchestrator.sysj line: 159, column: 4
                          currsigs.addElement(recConveyorStatus_1);
                          recConveyorStatus_1.setValue(res_thread_9);//sysj\orchestrator.sysj line: 159, column: 4
                          S45668=0;
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
            switch(S45675){
              case 0 : 
                if(!conveyorReq_o.isPartnerPresent() || conveyorReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 155, column: 4
                  conveyorReq_o.setREQ(false);//sysj\orchestrator.sysj line: 155, column: 4
                  S45675=1;
                  active[9]=1;
                  ends[9]=1;
                  tdone[9]=1;
                }
                else {
                  switch(S45670){
                    case 0 : 
                      if(conveyorReq_o.isACK()){//sysj\orchestrator.sysj line: 155, column: 4
                        conveyorReq_o.setVal(true);//sysj\orchestrator.sysj line: 155, column: 4
                        S45670=1;
                        if(!conveyorReq_o.isACK()){//sysj\orchestrator.sysj line: 155, column: 4
                          conveyorReq_o.setREQ(false);//sysj\orchestrator.sysj line: 155, column: 4
                          ends[9]=2;
                          ;//sysj\orchestrator.sysj line: 155, column: 4
                          S45668=2;
                          S45719=0;
                          if(!conveyorStatus_in.isPartnerPresent() || conveyorStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 156, column: 4
                            conveyorStatus_in.setACK(false);//sysj\orchestrator.sysj line: 156, column: 4
                            S45719=1;
                            active[9]=1;
                            ends[9]=1;
                            tdone[9]=1;
                          }
                          else {
                            S45714=0;
                            if(!conveyorStatus_in.isREQ()){//sysj\orchestrator.sysj line: 156, column: 4
                              conveyorStatus_in.setACK(true);//sysj\orchestrator.sysj line: 156, column: 4
                              S45714=1;
                              if(conveyorStatus_in.isREQ()){//sysj\orchestrator.sysj line: 156, column: 4
                                conveyorStatus_in.setACK(false);//sysj\orchestrator.sysj line: 156, column: 4
                                ends[9]=2;
                                ;//sysj\orchestrator.sysj line: 156, column: 4
                                conveyorStatusUIE.setPresent();//sysj\orchestrator.sysj line: 157, column: 4
                                currsigs.addElement(conveyorStatusUIE);
                                conveyorStatusUIE.setValue(false);//sysj\orchestrator.sysj line: 157, column: 4
                                res_thread_9 = (String)(conveyorStatus_in.getVal() == null ? null : ((String)conveyorStatus_in.getVal()));//sysj\orchestrator.sysj line: 158, column: 4
                                recConveyorStatus_1.setPresent();//sysj\orchestrator.sysj line: 159, column: 4
                                currsigs.addElement(recConveyorStatus_1);
                                recConveyorStatus_1.setValue(res_thread_9);//sysj\orchestrator.sysj line: 159, column: 4
                                S45668=0;
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
                      if(!conveyorReq_o.isACK()){//sysj\orchestrator.sysj line: 155, column: 4
                        conveyorReq_o.setREQ(false);//sysj\orchestrator.sysj line: 155, column: 4
                        ends[9]=2;
                        ;//sysj\orchestrator.sysj line: 155, column: 4
                        S45668=2;
                        S45719=0;
                        if(!conveyorStatus_in.isPartnerPresent() || conveyorStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 156, column: 4
                          conveyorStatus_in.setACK(false);//sysj\orchestrator.sysj line: 156, column: 4
                          S45719=1;
                          active[9]=1;
                          ends[9]=1;
                          tdone[9]=1;
                        }
                        else {
                          S45714=0;
                          if(!conveyorStatus_in.isREQ()){//sysj\orchestrator.sysj line: 156, column: 4
                            conveyorStatus_in.setACK(true);//sysj\orchestrator.sysj line: 156, column: 4
                            S45714=1;
                            if(conveyorStatus_in.isREQ()){//sysj\orchestrator.sysj line: 156, column: 4
                              conveyorStatus_in.setACK(false);//sysj\orchestrator.sysj line: 156, column: 4
                              ends[9]=2;
                              ;//sysj\orchestrator.sysj line: 156, column: 4
                              conveyorStatusUIE.setPresent();//sysj\orchestrator.sysj line: 157, column: 4
                              currsigs.addElement(conveyorStatusUIE);
                              conveyorStatusUIE.setValue(false);//sysj\orchestrator.sysj line: 157, column: 4
                              res_thread_9 = (String)(conveyorStatus_in.getVal() == null ? null : ((String)conveyorStatus_in.getVal()));//sysj\orchestrator.sysj line: 158, column: 4
                              recConveyorStatus_1.setPresent();//sysj\orchestrator.sysj line: 159, column: 4
                              currsigs.addElement(recConveyorStatus_1);
                              recConveyorStatus_1.setValue(res_thread_9);//sysj\orchestrator.sysj line: 159, column: 4
                              S45668=0;
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
                S45675=1;
                S45675=0;
                if(!conveyorReq_o.isPartnerPresent() || conveyorReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 155, column: 4
                  conveyorReq_o.setREQ(false);//sysj\orchestrator.sysj line: 155, column: 4
                  S45675=1;
                  active[9]=1;
                  ends[9]=1;
                  tdone[9]=1;
                }
                else {
                  S45670=0;
                  if(conveyorReq_o.isACK()){//sysj\orchestrator.sysj line: 155, column: 4
                    conveyorReq_o.setVal(true);//sysj\orchestrator.sysj line: 155, column: 4
                    S45670=1;
                    if(!conveyorReq_o.isACK()){//sysj\orchestrator.sysj line: 155, column: 4
                      conveyorReq_o.setREQ(false);//sysj\orchestrator.sysj line: 155, column: 4
                      ends[9]=2;
                      ;//sysj\orchestrator.sysj line: 155, column: 4
                      S45668=2;
                      S45719=0;
                      if(!conveyorStatus_in.isPartnerPresent() || conveyorStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 156, column: 4
                        conveyorStatus_in.setACK(false);//sysj\orchestrator.sysj line: 156, column: 4
                        S45719=1;
                        active[9]=1;
                        ends[9]=1;
                        tdone[9]=1;
                      }
                      else {
                        S45714=0;
                        if(!conveyorStatus_in.isREQ()){//sysj\orchestrator.sysj line: 156, column: 4
                          conveyorStatus_in.setACK(true);//sysj\orchestrator.sysj line: 156, column: 4
                          S45714=1;
                          if(conveyorStatus_in.isREQ()){//sysj\orchestrator.sysj line: 156, column: 4
                            conveyorStatus_in.setACK(false);//sysj\orchestrator.sysj line: 156, column: 4
                            ends[9]=2;
                            ;//sysj\orchestrator.sysj line: 156, column: 4
                            conveyorStatusUIE.setPresent();//sysj\orchestrator.sysj line: 157, column: 4
                            currsigs.addElement(conveyorStatusUIE);
                            conveyorStatusUIE.setValue(false);//sysj\orchestrator.sysj line: 157, column: 4
                            res_thread_9 = (String)(conveyorStatus_in.getVal() == null ? null : ((String)conveyorStatus_in.getVal()));//sysj\orchestrator.sysj line: 158, column: 4
                            recConveyorStatus_1.setPresent();//sysj\orchestrator.sysj line: 159, column: 4
                            currsigs.addElement(recConveyorStatus_1);
                            recConveyorStatus_1.setValue(res_thread_9);//sysj\orchestrator.sysj line: 159, column: 4
                            S45668=0;
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
            switch(S45719){
              case 0 : 
                if(!conveyorStatus_in.isPartnerPresent() || conveyorStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 156, column: 4
                  conveyorStatus_in.setACK(false);//sysj\orchestrator.sysj line: 156, column: 4
                  S45719=1;
                  active[9]=1;
                  ends[9]=1;
                  tdone[9]=1;
                }
                else {
                  switch(S45714){
                    case 0 : 
                      if(!conveyorStatus_in.isREQ()){//sysj\orchestrator.sysj line: 156, column: 4
                        conveyorStatus_in.setACK(true);//sysj\orchestrator.sysj line: 156, column: 4
                        S45714=1;
                        if(conveyorStatus_in.isREQ()){//sysj\orchestrator.sysj line: 156, column: 4
                          conveyorStatus_in.setACK(false);//sysj\orchestrator.sysj line: 156, column: 4
                          ends[9]=2;
                          ;//sysj\orchestrator.sysj line: 156, column: 4
                          conveyorStatusUIE.setPresent();//sysj\orchestrator.sysj line: 157, column: 4
                          currsigs.addElement(conveyorStatusUIE);
                          conveyorStatusUIE.setValue(false);//sysj\orchestrator.sysj line: 157, column: 4
                          res_thread_9 = (String)(conveyorStatus_in.getVal() == null ? null : ((String)conveyorStatus_in.getVal()));//sysj\orchestrator.sysj line: 158, column: 4
                          recConveyorStatus_1.setPresent();//sysj\orchestrator.sysj line: 159, column: 4
                          currsigs.addElement(recConveyorStatus_1);
                          recConveyorStatus_1.setValue(res_thread_9);//sysj\orchestrator.sysj line: 159, column: 4
                          S45668=0;
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
                      if(conveyorStatus_in.isREQ()){//sysj\orchestrator.sysj line: 156, column: 4
                        conveyorStatus_in.setACK(false);//sysj\orchestrator.sysj line: 156, column: 4
                        ends[9]=2;
                        ;//sysj\orchestrator.sysj line: 156, column: 4
                        conveyorStatusUIE.setPresent();//sysj\orchestrator.sysj line: 157, column: 4
                        currsigs.addElement(conveyorStatusUIE);
                        conveyorStatusUIE.setValue(false);//sysj\orchestrator.sysj line: 157, column: 4
                        res_thread_9 = (String)(conveyorStatus_in.getVal() == null ? null : ((String)conveyorStatus_in.getVal()));//sysj\orchestrator.sysj line: 158, column: 4
                        recConveyorStatus_1.setPresent();//sysj\orchestrator.sysj line: 159, column: 4
                        currsigs.addElement(recConveyorStatus_1);
                        recConveyorStatus_1.setValue(res_thread_9);//sysj\orchestrator.sysj line: 159, column: 4
                        S45668=0;
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
                S45719=1;
                S45719=0;
                if(!conveyorStatus_in.isPartnerPresent() || conveyorStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 156, column: 4
                  conveyorStatus_in.setACK(false);//sysj\orchestrator.sysj line: 156, column: 4
                  S45719=1;
                  active[9]=1;
                  ends[9]=1;
                  tdone[9]=1;
                }
                else {
                  S45714=0;
                  if(!conveyorStatus_in.isREQ()){//sysj\orchestrator.sysj line: 156, column: 4
                    conveyorStatus_in.setACK(true);//sysj\orchestrator.sysj line: 156, column: 4
                    S45714=1;
                    if(conveyorStatus_in.isREQ()){//sysj\orchestrator.sysj line: 156, column: 4
                      conveyorStatus_in.setACK(false);//sysj\orchestrator.sysj line: 156, column: 4
                      ends[9]=2;
                      ;//sysj\orchestrator.sysj line: 156, column: 4
                      conveyorStatusUIE.setPresent();//sysj\orchestrator.sysj line: 157, column: 4
                      currsigs.addElement(conveyorStatusUIE);
                      conveyorStatusUIE.setValue(false);//sysj\orchestrator.sysj line: 157, column: 4
                      res_thread_9 = (String)(conveyorStatus_in.getVal() == null ? null : ((String)conveyorStatus_in.getVal()));//sysj\orchestrator.sysj line: 158, column: 4
                      recConveyorStatus_1.setPresent();//sysj\orchestrator.sysj line: 159, column: 4
                      currsigs.addElement(recConveyorStatus_1);
                      recConveyorStatus_1.setValue(res_thread_9);//sysj\orchestrator.sysj line: 159, column: 4
                      S45668=0;
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

  public void thread52048(int [] tdone, int [] ends){
        S45626=1;
    foundCurrentOrder_1.setPresent();//sysj\orchestrator.sysj line: 141, column: 9
    currsigs.addElement(foundCurrentOrder_1);
    active[8]=1;
    ends[8]=1;
    tdone[8]=1;
  }

  public void thread52047(int [] tdone, int [] ends){
        S45621=1;
    myOrder_thread_7 = (currentOrder_1.getpreval() == null ? null : ((Order)currentOrder_1.getpreval()));//sysj\orchestrator.sysj line: 138, column: 9
    currentOrder_1.setPresent();//sysj\orchestrator.sysj line: 139, column: 8
    currsigs.addElement(currentOrder_1);
    currentOrder_1.setValue(myOrder_thread_7);//sysj\orchestrator.sysj line: 139, column: 8
    active[7]=1;
    ends[7]=1;
    tdone[7]=1;
  }

  public void thread52045(int [] tdone, int [] ends){
        switch(S45626){
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

  public void thread52044(int [] tdone, int [] ends){
        switch(S45621){
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

  public void thread52043(int [] tdone, int [] ends){
        switch(S45666){
      case 0 : 
        active[6]=0;
        ends[6]=0;
        tdone[6]=1;
        break;
      
      case 1 : 
        switch(S45630){
          case 0 : 
            if(recOrderIsDone_1.getprestatus()){//sysj\orchestrator.sysj line: 137, column: 13
              S45630=1;
              active[6]=1;
              ends[6]=1;
              tdone[6]=1;
            }
            else {
              thread52044(tdone,ends);
              thread52045(tdone,ends);
              int biggest52046 = 0;
              if(ends[7]>=biggest52046){
                biggest52046=ends[7];
              }
              if(ends[8]>=biggest52046){
                biggest52046=ends[8];
              }
              if(biggest52046 == 1){
                active[6]=1;
                ends[6]=1;
                tdone[6]=1;
              }
              //FINXME code
              if(biggest52046 == 0){
                S45630=1;
                active[6]=1;
                ends[6]=1;
                tdone[6]=1;
              }
            }
            break;
          
          case 1 : 
            S45630=1;
            S45630=0;
            if(startOrder_1.getprestatus()){//sysj\orchestrator.sysj line: 134, column: 13
              if(currentOrder_1.getprestatus()){//sysj\orchestrator.sysj line: 135, column: 14
                thread52047(tdone,ends);
                thread52048(tdone,ends);
                int biggest52049 = 0;
                if(ends[7]>=biggest52049){
                  biggest52049=ends[7];
                }
                if(ends[8]>=biggest52049){
                  biggest52049=ends[8];
                }
                if(biggest52049 == 1){
                  active[6]=1;
                  ends[6]=1;
                  tdone[6]=1;
                }
              }
              else {
                S45630=1;
                active[6]=1;
                ends[6]=1;
                tdone[6]=1;
              }
            }
            else {
              S45630=1;
              active[6]=1;
              ends[6]=1;
              tdone[6]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread52042(int [] tdone, int [] ends){
        switch(S45613){
      case 0 : 
        active[5]=0;
        ends[5]=0;
        tdone[5]=1;
        break;
      
      case 1 : 
        switch(S45601){
          case 0 : 
            if(currentOrder_1.getprestatus()){//sysj\orchestrator.sysj line: 123, column: 11
              S45601=1;
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
            S45601=1;
            S45601=0;
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

  public void thread52040(int [] tdone, int [] ends){
        S40715=1;
    recOrderIsDone_1.setPresent();//sysj\orchestrator.sysj line: 87, column: 12
    currsigs.addElement(recOrderIsDone_1);
    active[4]=1;
    ends[4]=1;
    tdone[4]=1;
  }

  public void thread52039(int [] tdone, int [] ends){
        S40710=1;
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

  public void thread52037(int [] tdone, int [] ends){
        S40715=1;
    recOrderIsDone_1.setPresent();//sysj\orchestrator.sysj line: 87, column: 12
    currsigs.addElement(recOrderIsDone_1);
    active[4]=1;
    ends[4]=1;
    tdone[4]=1;
  }

  public void thread52036(int [] tdone, int [] ends){
        S40710=1;
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

  public void thread52034(int [] tdone, int [] ends){
        switch(S40715){
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

  public void thread52033(int [] tdone, int [] ends){
        switch(S40710){
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

  public void thread52031(int [] tdone, int [] ends){
        S40715=1;
    recOrderIsDone_1.setPresent();//sysj\orchestrator.sysj line: 87, column: 12
    currsigs.addElement(recOrderIsDone_1);
    active[4]=1;
    ends[4]=1;
    tdone[4]=1;
  }

  public void thread52030(int [] tdone, int [] ends){
        S40710=1;
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

  public void thread52029(int [] tdone, int [] ends){
        switch(S45596){
      case 0 : 
        active[2]=0;
        ends[2]=0;
        tdone[2]=1;
        break;
      
      case 1 : 
        switch(S41479){
          case 0 : 
            if(recOrderStatus.getprestatus()){//sysj\orchestrator.sysj line: 63, column: 12
              System.out.println("orch received: recOrderStatus");//sysj\orchestrator.sysj line: 67, column: 6
              S41479=1;
              if(orderIsDone_1.getprestatus()){//sysj\orchestrator.sysj line: 75, column: 13
                System.out.println("entered order is done");//sysj\orchestrator.sysj line: 76, column: 6
                if(currentOrder_1.getprestatus()){//sysj\orchestrator.sysj line: 77, column: 14
                  System.out.println("entered current order present");//sysj\orchestrator.sysj line: 78, column: 7
                  S40731=0;
                  thread52030(tdone,ends);
                  thread52031(tdone,ends);
                  int biggest52032 = 0;
                  if(ends[3]>=biggest52032){
                    biggest52032=ends[3];
                  }
                  if(ends[4]>=biggest52032){
                    biggest52032=ends[4];
                  }
                  if(biggest52032 == 1){
                    active[2]=1;
                    ends[2]=1;
                    tdone[2]=1;
                  }
                }
                else {
                  S41479=2;
                  active[2]=1;
                  ends[2]=1;
                  tdone[2]=1;
                }
              }
              else {
                S41479=2;
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
            switch(S40731){
              case 0 : 
                if(recOrderStatus.getprestatus()){//sysj\orchestrator.sysj line: 79, column: 13
                  System.out.println("initialising next order...");//sysj\orchestrator.sysj line: 91, column: 7
                  S40731=1;
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
                    S41479=2;
                    active[2]=1;
                    ends[2]=1;
                    tdone[2]=1;
                  }
                }
                else {
                  thread52033(tdone,ends);
                  thread52034(tdone,ends);
                  int biggest52035 = 0;
                  if(ends[3]>=biggest52035){
                    biggest52035=ends[3];
                  }
                  if(ends[4]>=biggest52035){
                    biggest52035=ends[4];
                  }
                  if(biggest52035 == 1){
                    active[2]=1;
                    ends[2]=1;
                    tdone[2]=1;
                  }
                  //FINXME code
                  if(biggest52035 == 0){
                    System.out.println("initialising next order...");//sysj\orchestrator.sysj line: 91, column: 7
                    S40731=1;
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
                      S41479=2;
                      active[2]=1;
                      ends[2]=1;
                      tdone[2]=1;
                    }
                  }
                }
                break;
              
              case 1 : 
                if(recOrderStatus.getprestatus()){//sysj\orchestrator.sysj line: 105, column: 14
                  S41479=2;
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
            S41479=2;
            S41479=0;
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
                S41479=1;
                if(orderIsDone_1.getprestatus()){//sysj\orchestrator.sysj line: 75, column: 13
                  System.out.println("entered order is done");//sysj\orchestrator.sysj line: 76, column: 6
                  if(currentOrder_1.getprestatus()){//sysj\orchestrator.sysj line: 77, column: 14
                    System.out.println("entered current order present");//sysj\orchestrator.sysj line: 78, column: 7
                    S40731=0;
                    thread52036(tdone,ends);
                    thread52037(tdone,ends);
                    int biggest52038 = 0;
                    if(ends[3]>=biggest52038){
                      biggest52038=ends[3];
                    }
                    if(ends[4]>=biggest52038){
                      biggest52038=ends[4];
                    }
                    if(biggest52038 == 1){
                      active[2]=1;
                      ends[2]=1;
                      tdone[2]=1;
                    }
                  }
                  else {
                    S41479=2;
                    active[2]=1;
                    ends[2]=1;
                    tdone[2]=1;
                  }
                }
                else {
                  S41479=2;
                  active[2]=1;
                  ends[2]=1;
                  tdone[2]=1;
                }
              }
            }
            else {
              S41479=1;
              if(orderIsDone_1.getprestatus()){//sysj\orchestrator.sysj line: 75, column: 13
                System.out.println("entered order is done");//sysj\orchestrator.sysj line: 76, column: 6
                if(currentOrder_1.getprestatus()){//sysj\orchestrator.sysj line: 77, column: 14
                  System.out.println("entered current order present");//sysj\orchestrator.sysj line: 78, column: 7
                  S40731=0;
                  thread52039(tdone,ends);
                  thread52040(tdone,ends);
                  int biggest52041 = 0;
                  if(ends[3]>=biggest52041){
                    biggest52041=ends[3];
                  }
                  if(ends[4]>=biggest52041){
                    biggest52041=ends[4];
                  }
                  if(biggest52041 == 1){
                    active[2]=1;
                    ends[2]=1;
                    tdone[2]=1;
                  }
                }
                else {
                  S41479=2;
                  active[2]=1;
                  ends[2]=1;
                  tdone[2]=1;
                }
              }
              else {
                S41479=2;
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

  public void thread52027(int [] tdone, int [] ends){
        S52006=1;
    quantity_thread_14 = 0;//sysj\orchestrator.sysj line: 221, column: 3
    count_thread_14 = 0;//sysj\orchestrator.sysj line: 222, column: 3
    eject_thread_14 = 0;//sysj\orchestrator.sysj line: 223, column: 3
        S50369=0;
    active[14]=1;
    ends[14]=1;
    tdone[14]=1;
  }

  public void thread52026(int [] tdone, int [] ends){
        S50366=1;
    S49428=0;
    active[13]=1;
    ends[13]=1;
    tdone[13]=1;
  }

  public void thread52025(int [] tdone, int [] ends){
        S49426=1;
    S48488=0;
    active[12]=1;
    ends[12]=1;
    tdone[12]=1;
  }

  public void thread52024(int [] tdone, int [] ends){
        S48486=1;
    S47548=0;
    active[11]=1;
    ends[11]=1;
    tdone[11]=1;
  }

  public void thread52023(int [] tdone, int [] ends){
        S47546=1;
    S46608=0;
    active[10]=1;
    ends[10]=1;
    tdone[10]=1;
  }

  public void thread52022(int [] tdone, int [] ends){
        S46606=1;
    S45668=0;
    active[9]=1;
    ends[9]=1;
    tdone[9]=1;
  }

  public void thread52020(int [] tdone, int [] ends){
        S45626=1;
    foundCurrentOrder_1.setPresent();//sysj\orchestrator.sysj line: 141, column: 9
    currsigs.addElement(foundCurrentOrder_1);
    active[8]=1;
    ends[8]=1;
    tdone[8]=1;
  }

  public void thread52019(int [] tdone, int [] ends){
        S45621=1;
    myOrder_thread_7 = (currentOrder_1.getpreval() == null ? null : ((Order)currentOrder_1.getpreval()));//sysj\orchestrator.sysj line: 138, column: 9
    currentOrder_1.setPresent();//sysj\orchestrator.sysj line: 139, column: 8
    currsigs.addElement(currentOrder_1);
    currentOrder_1.setValue(myOrder_thread_7);//sysj\orchestrator.sysj line: 139, column: 8
    active[7]=1;
    ends[7]=1;
    tdone[7]=1;
  }

  public void thread52018(int [] tdone, int [] ends){
        S45666=1;
    S45630=0;
    if(startOrder_1.getprestatus()){//sysj\orchestrator.sysj line: 134, column: 13
      if(currentOrder_1.getprestatus()){//sysj\orchestrator.sysj line: 135, column: 14
        thread52019(tdone,ends);
        thread52020(tdone,ends);
        int biggest52021 = 0;
        if(ends[7]>=biggest52021){
          biggest52021=ends[7];
        }
        if(ends[8]>=biggest52021){
          biggest52021=ends[8];
        }
        if(biggest52021 == 1){
          active[6]=1;
          ends[6]=1;
          tdone[6]=1;
        }
      }
      else {
        S45630=1;
        active[6]=1;
        ends[6]=1;
        tdone[6]=1;
      }
    }
    else {
      S45630=1;
      active[6]=1;
      ends[6]=1;
      tdone[6]=1;
    }
  }

  public void thread52017(int [] tdone, int [] ends){
        S45613=1;
    S45601=0;
    initABS_1.setPresent();//sysj\orchestrator.sysj line: 124, column: 6
    currsigs.addElement(initABS_1);
    active[5]=1;
    ends[5]=1;
    tdone[5]=1;
  }

  public void thread52015(int [] tdone, int [] ends){
        S40715=1;
    recOrderIsDone_1.setPresent();//sysj\orchestrator.sysj line: 87, column: 12
    currsigs.addElement(recOrderIsDone_1);
    active[4]=1;
    ends[4]=1;
    tdone[4]=1;
  }

  public void thread52014(int [] tdone, int [] ends){
        S40710=1;
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

  public void thread52012(int [] tdone, int [] ends){
        S40715=1;
    recOrderIsDone_1.setPresent();//sysj\orchestrator.sysj line: 87, column: 12
    currsigs.addElement(recOrderIsDone_1);
    active[4]=1;
    ends[4]=1;
    tdone[4]=1;
  }

  public void thread52011(int [] tdone, int [] ends){
        S40710=1;
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

  public void thread52010(int [] tdone, int [] ends){
        S45596=1;
    fifoQueue_thread_2 = new ArrayList();//sysj\orchestrator.sysj line: 30, column: 3
    S41479=0;
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
        S41479=1;
        if(orderIsDone_1.getprestatus()){//sysj\orchestrator.sysj line: 75, column: 13
          System.out.println("entered order is done");//sysj\orchestrator.sysj line: 76, column: 6
          if(currentOrder_1.getprestatus()){//sysj\orchestrator.sysj line: 77, column: 14
            System.out.println("entered current order present");//sysj\orchestrator.sysj line: 78, column: 7
            S40731=0;
            thread52011(tdone,ends);
            thread52012(tdone,ends);
            int biggest52013 = 0;
            if(ends[3]>=biggest52013){
              biggest52013=ends[3];
            }
            if(ends[4]>=biggest52013){
              biggest52013=ends[4];
            }
            if(biggest52013 == 1){
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
          }
          else {
            S41479=2;
            active[2]=1;
            ends[2]=1;
            tdone[2]=1;
          }
        }
        else {
          S41479=2;
          active[2]=1;
          ends[2]=1;
          tdone[2]=1;
        }
      }
    }
    else {
      S41479=1;
      if(orderIsDone_1.getprestatus()){//sysj\orchestrator.sysj line: 75, column: 13
        System.out.println("entered order is done");//sysj\orchestrator.sysj line: 76, column: 6
        if(currentOrder_1.getprestatus()){//sysj\orchestrator.sysj line: 77, column: 14
          System.out.println("entered current order present");//sysj\orchestrator.sysj line: 78, column: 7
          S40731=0;
          thread52014(tdone,ends);
          thread52015(tdone,ends);
          int biggest52016 = 0;
          if(ends[3]>=biggest52016){
            biggest52016=ends[3];
          }
          if(ends[4]>=biggest52016){
            biggest52016=ends[4];
          }
          if(biggest52016 == 1){
            active[2]=1;
            ends[2]=1;
            tdone[2]=1;
          }
        }
        else {
          S41479=2;
          active[2]=1;
          ends[2]=1;
          tdone[2]=1;
        }
      }
      else {
        S41479=2;
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
      switch(S52008){
        case 0 : 
          S52008=0;
          break RUN;
        
        case 1 : 
          S52008=2;
          S52008=2;
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
          thread52010(tdone,ends);
          thread52017(tdone,ends);
          thread52018(tdone,ends);
          thread52022(tdone,ends);
          thread52023(tdone,ends);
          thread52024(tdone,ends);
          thread52025(tdone,ends);
          thread52026(tdone,ends);
          thread52027(tdone,ends);
          int biggest52028 = 0;
          if(ends[2]>=biggest52028){
            biggest52028=ends[2];
          }
          if(ends[5]>=biggest52028){
            biggest52028=ends[5];
          }
          if(ends[6]>=biggest52028){
            biggest52028=ends[6];
          }
          if(ends[9]>=biggest52028){
            biggest52028=ends[9];
          }
          if(ends[10]>=biggest52028){
            biggest52028=ends[10];
          }
          if(ends[11]>=biggest52028){
            biggest52028=ends[11];
          }
          if(ends[12]>=biggest52028){
            biggest52028=ends[12];
          }
          if(ends[13]>=biggest52028){
            biggest52028=ends[13];
          }
          if(ends[14]>=biggest52028){
            biggest52028=ends[14];
          }
          if(biggest52028 == 1){
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
          thread52029(tdone,ends);
          thread52042(tdone,ends);
          thread52043(tdone,ends);
          thread52050(tdone,ends);
          thread52051(tdone,ends);
          thread52052(tdone,ends);
          thread52053(tdone,ends);
          thread52054(tdone,ends);
          thread52055(tdone,ends);
          int biggest52068 = 0;
          if(ends[2]>=biggest52068){
            biggest52068=ends[2];
          }
          if(ends[5]>=biggest52068){
            biggest52068=ends[5];
          }
          if(ends[6]>=biggest52068){
            biggest52068=ends[6];
          }
          if(ends[9]>=biggest52068){
            biggest52068=ends[9];
          }
          if(ends[10]>=biggest52068){
            biggest52068=ends[10];
          }
          if(ends[11]>=biggest52068){
            biggest52068=ends[11];
          }
          if(ends[12]>=biggest52068){
            biggest52068=ends[12];
          }
          if(ends[13]>=biggest52068){
            biggest52068=ends[13];
          }
          if(ends[14]>=biggest52068){
            biggest52068=ends[14];
          }
          if(biggest52068 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
          //FINXME code
          if(biggest52068 == 0){
            S52008=0;
            active[1]=0;
            ends[1]=0;
            S52008=0;
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
