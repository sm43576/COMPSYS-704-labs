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
  private ArrayList fifoQueue_thread_2;//sysj\orchestrator.sysj line: 29, column: 3
  private int quantity_thread_14;//sysj\orchestrator.sysj line: 214, column: 3
  private int count_thread_14;//sysj\orchestrator.sysj line: 215, column: 3
  private int eject_thread_14;//sysj\orchestrator.sysj line: 216, column: 3
  private ArrayList liquidPercent_thread_14;//sysj\orchestrator.sysj line: 217, column: 3
  private Order nextOrder_thread_2;//sysj\orchestrator.sysj line: 92, column: 8
  private Order newOrder_thread_2;//sysj\orchestrator.sysj line: 37, column: 5
  private Order tempOrder_thread_2;//sysj\orchestrator.sysj line: 45, column: 6
  private Order tempOrder_thread_3;//sysj\orchestrator.sysj line: 80, column: 9
  private Order myOrder_thread_7;//sysj\orchestrator.sysj line: 137, column: 9
  private String res_thread_9;//sysj\orchestrator.sysj line: 157, column: 4
  private String res_thread_10;//sysj\orchestrator.sysj line: 169, column: 4
  private String res_thread_11;//sysj\orchestrator.sysj line: 182, column: 4
  private ArrayList req_thread_12;//sysj\orchestrator.sysj line: 191, column: 4
  private String res_thread_12;//sysj\orchestrator.sysj line: 195, column: 4
  private String res_thread_13;//sysj\orchestrator.sysj line: 207, column: 4
  private Order order_thread_14;//sysj\orchestrator.sysj line: 222, column: 4
  private int S49776 = 1;
  private int S43364 = 1;
  private int S39247 = 1;
  private int S38499 = 1;
  private int S38478 = 1;
  private int S38483 = 1;
  private int S43381 = 1;
  private int S43369 = 1;
  private int S43434 = 1;
  private int S43398 = 1;
  private int S43389 = 1;
  private int S43394 = 1;
  private int S44374 = 1;
  private int S43436 = 1;
  private int S43443 = 1;
  private int S43438 = 1;
  private int S43487 = 1;
  private int S43482 = 1;
  private int S45314 = 1;
  private int S44376 = 1;
  private int S44383 = 1;
  private int S44378 = 1;
  private int S44427 = 1;
  private int S44422 = 1;
  private int S46254 = 1;
  private int S45316 = 1;
  private int S45323 = 1;
  private int S45318 = 1;
  private int S45367 = 1;
  private int S45362 = 1;
  private int S47194 = 1;
  private int S46256 = 1;
  private int S46263 = 1;
  private int S46258 = 1;
  private int S46307 = 1;
  private int S46302 = 1;
  private int S48134 = 1;
  private int S47196 = 1;
  private int S47203 = 1;
  private int S47198 = 1;
  private int S47247 = 1;
  private int S47242 = 1;
  private int S49774 = 1;
  private int S48137 = 1;
  private int S48142 = 1;
  private int S48145 = 1;
  private int S48148 = 1;
  private int S48151 = 1;
  private int S48161 = 1;
  private int S48338 = 1;
  
  private int[] ends = new int[18];
  private int[] tdone = new int[18];
  
  public void thread49834(int [] tdone, int [] ends){
        S48151=1;
    active[17]=1;
    ends[17]=1;
    tdone[17]=1;
  }

  public void thread49833(int [] tdone, int [] ends){
        S48148=1;
    active[16]=1;
    ends[16]=1;
    tdone[16]=1;
  }

  public void thread49832(int [] tdone, int [] ends){
        S48145=1;
    active[15]=1;
    ends[15]=1;
    tdone[15]=1;
  }

  public void thread49830(int [] tdone, int [] ends){
        switch(S48151){
      case 0 : 
        active[17]=0;
        ends[17]=0;
        tdone[17]=1;
        break;
      
      case 1 : 
        if(recCapperStatus_1.getprestatus()){//sysj\orchestrator.sysj line: 245, column: 73
          S48151=0;
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

  public void thread49829(int [] tdone, int [] ends){
        switch(S48148){
      case 0 : 
        active[16]=0;
        ends[16]=0;
        tdone[16]=1;
        break;
      
      case 1 : 
        if(recCapLoaderStatus_1.getprestatus()){//sysj\orchestrator.sysj line: 245, column: 41
          S48148=0;
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

  public void thread49828(int [] tdone, int [] ends){
        switch(S48145){
      case 0 : 
        active[15]=0;
        ends[15]=0;
        tdone[15]=1;
        break;
      
      case 1 : 
        if(recFillerStatus_1.getprestatus()){//sysj\orchestrator.sysj line: 245, column: 12
          S48145=0;
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

  public void thread49826(int [] tdone, int [] ends){
        S48151=1;
    active[17]=1;
    ends[17]=1;
    tdone[17]=1;
  }

  public void thread49825(int [] tdone, int [] ends){
        S48148=1;
    active[16]=1;
    ends[16]=1;
    tdone[16]=1;
  }

  public void thread49824(int [] tdone, int [] ends){
        S48145=1;
    active[15]=1;
    ends[15]=1;
    tdone[15]=1;
  }

  public void thread49823(int [] tdone, int [] ends){
        switch(S49774){
      case 0 : 
        active[14]=0;
        ends[14]=0;
        tdone[14]=1;
        break;
      
      case 1 : 
        switch(S48137){
          case 0 : 
            if(currentOrder_1.getprestatus()){//sysj\orchestrator.sysj line: 221, column: 10
              order_thread_14 = (currentOrder_1.getpreval() == null ? null : ((Order)currentOrder_1.getpreval()));//sysj\orchestrator.sysj line: 222, column: 4
              quantity_thread_14 = order_thread_14.getQuantity();//sysj\orchestrator.sysj line: 223, column: 4
              count_thread_14 = quantity_thread_14;//sysj\orchestrator.sysj line: 224, column: 4
              liquidPercent_thread_14 = order_thread_14.getLiquidPercentageArray();//sysj\orchestrator.sysj line: 225, column: 4
              System.out.println("Orch: Loading first bottle...");//sysj\orchestrator.sysj line: 227, column: 4
              sigConveyorReq_1.setPresent();//sysj\orchestrator.sysj line: 228, column: 4
              currsigs.addElement(sigConveyorReq_1);
              sigConveyorReq_1.setValue(true);//sysj\orchestrator.sysj line: 228, column: 4
              S48137=1;
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
            if(recConveyorStatus_1.getprestatus()){//sysj\orchestrator.sysj line: 229, column: 10
              System.out.println("Orch: First bottle loaded.");//sysj\orchestrator.sysj line: 230, column: 4
              sigRotaryReq_1.setPresent();//sysj\orchestrator.sysj line: 231, column: 4
              currsigs.addElement(sigRotaryReq_1);
              S48137=2;
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
            if(recRotaryStatus_1.getprestatus()){//sysj\orchestrator.sysj line: 232, column: 10
              S48137=3;
              if(count_thread_14 >= 0){//sysj\orchestrator.sysj line: 234, column: 10
                if(count_thread_14 == 0) {//sysj\orchestrator.sysj line: 236, column: 21
                  System.out.println("Orch: Last bottle. Preparing to send requests..");//sysj\orchestrator.sysj line: 237, column: 6
                }
                else {//sysj\orchestrator.sysj line: 238, column: 12
                  System.out.println("Orch: Bottle count " + count_thread_14 + ". Preparing to send requests..");//sysj\orchestrator.sysj line: 239, column: 6
                }
                sigFillerReq_1.setPresent();//sysj\orchestrator.sysj line: 242, column: 5
                currsigs.addElement(sigFillerReq_1);
                sigFillerReq_1.setValue(liquidPercent_thread_14);//sysj\orchestrator.sysj line: 242, column: 5
                sigCapLoaderReq_1.setPresent();//sysj\orchestrator.sysj line: 243, column: 5
                currsigs.addElement(sigCapLoaderReq_1);
                sigCapperReq_1.setPresent();//sysj\orchestrator.sysj line: 244, column: 5
                currsigs.addElement(sigCapperReq_1);
                S48142=0;
                thread49824(tdone,ends);
                thread49825(tdone,ends);
                thread49826(tdone,ends);
                int biggest49827 = 0;
                if(ends[15]>=biggest49827){
                  biggest49827=ends[15];
                }
                if(ends[16]>=biggest49827){
                  biggest49827=ends[16];
                }
                if(ends[17]>=biggest49827){
                  biggest49827=ends[17];
                }
                if(biggest49827 == 1){
                  active[14]=1;
                  ends[14]=1;
                  tdone[14]=1;
                }
              }
              else {
                ends[14]=2;
                ;//sysj\orchestrator.sysj line: 234, column: 4
                System.out.println("Ejecting all bottles");//sysj\orchestrator.sysj line: 265, column: 4
                if(quantity_thread_14 >= 5) {//sysj\orchestrator.sysj line: 267, column: 23
                  eject_thread_14 = 5;//sysj\orchestrator.sysj line: 268, column: 5
                }
                else {//sysj\orchestrator.sysj line: 269, column: 11
                  eject_thread_14 = quantity_thread_14;//sysj\orchestrator.sysj line: 270, column: 5
                }
                S48137=4;
                if(eject_thread_14 >= 0){//sysj\orchestrator.sysj line: 274, column: 11
                  sigRotaryReq_1.setPresent();//sysj\orchestrator.sysj line: 275, column: 5
                  currsigs.addElement(sigRotaryReq_1);
                  S48338=0;
                  active[14]=1;
                  ends[14]=1;
                  tdone[14]=1;
                }
                else {
                  ends[14]=2;
                  ;//sysj\orchestrator.sysj line: 274, column: 4
                  System.out.println("Orch: Order complete.");//sysj\orchestrator.sysj line: 281, column: 4
                  S48137=5;
                  orderIsDone_1.setPresent();//sysj\orchestrator.sysj line: 283, column: 5
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
            switch(S48142){
              case 0 : 
                thread49828(tdone,ends);
                thread49829(tdone,ends);
                thread49830(tdone,ends);
                int biggest49831 = 0;
                if(ends[15]>=biggest49831){
                  biggest49831=ends[15];
                }
                if(ends[16]>=biggest49831){
                  biggest49831=ends[16];
                }
                if(ends[17]>=biggest49831){
                  biggest49831=ends[17];
                }
                if(biggest49831 == 1){
                  active[14]=1;
                  ends[14]=1;
                  tdone[14]=1;
                }
                //FINXME code
                if(biggest49831 == 0){
                  System.out.println("Orch: All done!");//sysj\orchestrator.sysj line: 246, column: 5
                  count_thread_14 = count_thread_14 - 1;//sysj\orchestrator.sysj line: 248, column: 5
                  S48142=1;
                  if(count_thread_14 >= 0){//sysj\orchestrator.sysj line: 250, column: 9
                    System.out.println("Orch: Loading next bottle...");//sysj\orchestrator.sysj line: 252, column: 6
                    sigConveyorReq_1.setPresent();//sysj\orchestrator.sysj line: 253, column: 6
                    currsigs.addElement(sigConveyorReq_1);
                    sigConveyorReq_1.setValue(true);//sysj\orchestrator.sysj line: 253, column: 6
                    S48161=0;
                    active[14]=1;
                    ends[14]=1;
                    tdone[14]=1;
                  }
                  else {
                    S48142=2;
                    active[14]=1;
                    ends[14]=1;
                    tdone[14]=1;
                  }
                }
                break;
              
              case 1 : 
                switch(S48161){
                  case 0 : 
                    if(recConveyorStatus_1.getprestatus()){//sysj\orchestrator.sysj line: 254, column: 12
                      System.out.println("Orch: Loaded new bottle.");//sysj\orchestrator.sysj line: 255, column: 6
                      sigRotaryReq_1.setPresent();//sysj\orchestrator.sysj line: 258, column: 6
                      currsigs.addElement(sigRotaryReq_1);
                      S48161=1;
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
                    if(recRotaryStatus_1.getprestatus()){//sysj\orchestrator.sysj line: 259, column: 12
                      S48142=2;
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
                S48142=2;
                if(count_thread_14 >= 0){//sysj\orchestrator.sysj line: 234, column: 10
                  if(count_thread_14 == 0) {//sysj\orchestrator.sysj line: 236, column: 21
                    System.out.println("Orch: Last bottle. Preparing to send requests..");//sysj\orchestrator.sysj line: 237, column: 6
                  }
                  else {//sysj\orchestrator.sysj line: 238, column: 12
                    System.out.println("Orch: Bottle count " + count_thread_14 + ". Preparing to send requests..");//sysj\orchestrator.sysj line: 239, column: 6
                  }
                  sigFillerReq_1.setPresent();//sysj\orchestrator.sysj line: 242, column: 5
                  currsigs.addElement(sigFillerReq_1);
                  sigFillerReq_1.setValue(liquidPercent_thread_14);//sysj\orchestrator.sysj line: 242, column: 5
                  sigCapLoaderReq_1.setPresent();//sysj\orchestrator.sysj line: 243, column: 5
                  currsigs.addElement(sigCapLoaderReq_1);
                  sigCapperReq_1.setPresent();//sysj\orchestrator.sysj line: 244, column: 5
                  currsigs.addElement(sigCapperReq_1);
                  S48142=0;
                  thread49832(tdone,ends);
                  thread49833(tdone,ends);
                  thread49834(tdone,ends);
                  int biggest49835 = 0;
                  if(ends[15]>=biggest49835){
                    biggest49835=ends[15];
                  }
                  if(ends[16]>=biggest49835){
                    biggest49835=ends[16];
                  }
                  if(ends[17]>=biggest49835){
                    biggest49835=ends[17];
                  }
                  if(biggest49835 == 1){
                    active[14]=1;
                    ends[14]=1;
                    tdone[14]=1;
                  }
                }
                else {
                  ends[14]=2;
                  ;//sysj\orchestrator.sysj line: 234, column: 4
                  System.out.println("Ejecting all bottles");//sysj\orchestrator.sysj line: 265, column: 4
                  if(quantity_thread_14 >= 5) {//sysj\orchestrator.sysj line: 267, column: 23
                    eject_thread_14 = 5;//sysj\orchestrator.sysj line: 268, column: 5
                  }
                  else {//sysj\orchestrator.sysj line: 269, column: 11
                    eject_thread_14 = quantity_thread_14;//sysj\orchestrator.sysj line: 270, column: 5
                  }
                  S48137=4;
                  if(eject_thread_14 >= 0){//sysj\orchestrator.sysj line: 274, column: 11
                    sigRotaryReq_1.setPresent();//sysj\orchestrator.sysj line: 275, column: 5
                    currsigs.addElement(sigRotaryReq_1);
                    S48338=0;
                    active[14]=1;
                    ends[14]=1;
                    tdone[14]=1;
                  }
                  else {
                    ends[14]=2;
                    ;//sysj\orchestrator.sysj line: 274, column: 4
                    System.out.println("Orch: Order complete.");//sysj\orchestrator.sysj line: 281, column: 4
                    S48137=5;
                    orderIsDone_1.setPresent();//sysj\orchestrator.sysj line: 283, column: 5
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
            switch(S48338){
              case 0 : 
                if(recRotaryStatus_1.getprestatus()){//sysj\orchestrator.sysj line: 276, column: 11
                  sigConveyorReq_1.setPresent();//sysj\orchestrator.sysj line: 277, column: 5
                  currsigs.addElement(sigConveyorReq_1);
                  S48338=1;
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
                if(recConveyorStatus_1.getprestatus()){//sysj\orchestrator.sysj line: 278, column: 11
                  eject_thread_14 = eject_thread_14 - 1;//sysj\orchestrator.sysj line: 279, column: 5
                  if(eject_thread_14 >= 0){//sysj\orchestrator.sysj line: 274, column: 11
                    sigRotaryReq_1.setPresent();//sysj\orchestrator.sysj line: 275, column: 5
                    currsigs.addElement(sigRotaryReq_1);
                    S48338=0;
                    active[14]=1;
                    ends[14]=1;
                    tdone[14]=1;
                  }
                  else {
                    ends[14]=2;
                    ;//sysj\orchestrator.sysj line: 274, column: 4
                    System.out.println("Orch: Order complete.");//sysj\orchestrator.sysj line: 281, column: 4
                    S48137=5;
                    orderIsDone_1.setPresent();//sysj\orchestrator.sysj line: 283, column: 5
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
            if(recOrderIsDone_1.getprestatus()){//sysj\orchestrator.sysj line: 282, column: 10
              System.out.println("end finally");//sysj\orchestrator.sysj line: 285, column: 4
              S48137=6;
              active[14]=1;
              ends[14]=1;
              tdone[14]=1;
            }
            else {
              orderIsDone_1.setPresent();//sysj\orchestrator.sysj line: 283, column: 5
              currsigs.addElement(orderIsDone_1);
              active[14]=1;
              ends[14]=1;
              tdone[14]=1;
            }
            break;
          
          case 6 : 
            S48137=6;
            S48137=0;
            active[14]=1;
            ends[14]=1;
            tdone[14]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread49822(int [] tdone, int [] ends){
        switch(S48134){
      case 0 : 
        active[13]=0;
        ends[13]=0;
        tdone[13]=1;
        break;
      
      case 1 : 
        switch(S47196){
          case 0 : 
            if(sigRotaryReq_1.getprestatus()){//sysj\orchestrator.sysj line: 202, column: 10
              System.out.println("Orch: Sending rotary request");//sysj\orchestrator.sysj line: 203, column: 4
              S47196=1;
              S47203=0;
              if(!rotaryReq_o.isPartnerPresent() || rotaryReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 204, column: 4
                rotaryReq_o.setREQ(false);//sysj\orchestrator.sysj line: 204, column: 4
                S47203=1;
                active[13]=1;
                ends[13]=1;
                tdone[13]=1;
              }
              else {
                S47198=0;
                if(rotaryReq_o.isACK()){//sysj\orchestrator.sysj line: 204, column: 4
                  rotaryReq_o.setVal(true);//sysj\orchestrator.sysj line: 204, column: 4
                  S47198=1;
                  if(!rotaryReq_o.isACK()){//sysj\orchestrator.sysj line: 204, column: 4
                    rotaryReq_o.setREQ(false);//sysj\orchestrator.sysj line: 204, column: 4
                    ends[13]=2;
                    ;//sysj\orchestrator.sysj line: 204, column: 4
                    S47196=2;
                    S47247=0;
                    if(!rotaryStatus_in.isPartnerPresent() || rotaryStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 205, column: 4
                      rotaryStatus_in.setACK(false);//sysj\orchestrator.sysj line: 205, column: 4
                      S47247=1;
                      active[13]=1;
                      ends[13]=1;
                      tdone[13]=1;
                    }
                    else {
                      S47242=0;
                      if(!rotaryStatus_in.isREQ()){//sysj\orchestrator.sysj line: 205, column: 4
                        rotaryStatus_in.setACK(true);//sysj\orchestrator.sysj line: 205, column: 4
                        S47242=1;
                        if(rotaryStatus_in.isREQ()){//sysj\orchestrator.sysj line: 205, column: 4
                          rotaryStatus_in.setACK(false);//sysj\orchestrator.sysj line: 205, column: 4
                          ends[13]=2;
                          ;//sysj\orchestrator.sysj line: 205, column: 4
                          System.out.println("Orch: Received rotary status");//sysj\orchestrator.sysj line: 206, column: 4
                          res_thread_13 = (String)(rotaryStatus_in.getVal() == null ? null : ((String)rotaryStatus_in.getVal()));//sysj\orchestrator.sysj line: 207, column: 4
                          recRotaryStatus_1.setPresent();//sysj\orchestrator.sysj line: 208, column: 4
                          currsigs.addElement(recRotaryStatus_1);
                          recRotaryStatus_1.setValue(res_thread_13);//sysj\orchestrator.sysj line: 208, column: 4
                          S47196=0;
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
            switch(S47203){
              case 0 : 
                if(!rotaryReq_o.isPartnerPresent() || rotaryReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 204, column: 4
                  rotaryReq_o.setREQ(false);//sysj\orchestrator.sysj line: 204, column: 4
                  S47203=1;
                  active[13]=1;
                  ends[13]=1;
                  tdone[13]=1;
                }
                else {
                  switch(S47198){
                    case 0 : 
                      if(rotaryReq_o.isACK()){//sysj\orchestrator.sysj line: 204, column: 4
                        rotaryReq_o.setVal(true);//sysj\orchestrator.sysj line: 204, column: 4
                        S47198=1;
                        if(!rotaryReq_o.isACK()){//sysj\orchestrator.sysj line: 204, column: 4
                          rotaryReq_o.setREQ(false);//sysj\orchestrator.sysj line: 204, column: 4
                          ends[13]=2;
                          ;//sysj\orchestrator.sysj line: 204, column: 4
                          S47196=2;
                          S47247=0;
                          if(!rotaryStatus_in.isPartnerPresent() || rotaryStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 205, column: 4
                            rotaryStatus_in.setACK(false);//sysj\orchestrator.sysj line: 205, column: 4
                            S47247=1;
                            active[13]=1;
                            ends[13]=1;
                            tdone[13]=1;
                          }
                          else {
                            S47242=0;
                            if(!rotaryStatus_in.isREQ()){//sysj\orchestrator.sysj line: 205, column: 4
                              rotaryStatus_in.setACK(true);//sysj\orchestrator.sysj line: 205, column: 4
                              S47242=1;
                              if(rotaryStatus_in.isREQ()){//sysj\orchestrator.sysj line: 205, column: 4
                                rotaryStatus_in.setACK(false);//sysj\orchestrator.sysj line: 205, column: 4
                                ends[13]=2;
                                ;//sysj\orchestrator.sysj line: 205, column: 4
                                System.out.println("Orch: Received rotary status");//sysj\orchestrator.sysj line: 206, column: 4
                                res_thread_13 = (String)(rotaryStatus_in.getVal() == null ? null : ((String)rotaryStatus_in.getVal()));//sysj\orchestrator.sysj line: 207, column: 4
                                recRotaryStatus_1.setPresent();//sysj\orchestrator.sysj line: 208, column: 4
                                currsigs.addElement(recRotaryStatus_1);
                                recRotaryStatus_1.setValue(res_thread_13);//sysj\orchestrator.sysj line: 208, column: 4
                                S47196=0;
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
                      if(!rotaryReq_o.isACK()){//sysj\orchestrator.sysj line: 204, column: 4
                        rotaryReq_o.setREQ(false);//sysj\orchestrator.sysj line: 204, column: 4
                        ends[13]=2;
                        ;//sysj\orchestrator.sysj line: 204, column: 4
                        S47196=2;
                        S47247=0;
                        if(!rotaryStatus_in.isPartnerPresent() || rotaryStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 205, column: 4
                          rotaryStatus_in.setACK(false);//sysj\orchestrator.sysj line: 205, column: 4
                          S47247=1;
                          active[13]=1;
                          ends[13]=1;
                          tdone[13]=1;
                        }
                        else {
                          S47242=0;
                          if(!rotaryStatus_in.isREQ()){//sysj\orchestrator.sysj line: 205, column: 4
                            rotaryStatus_in.setACK(true);//sysj\orchestrator.sysj line: 205, column: 4
                            S47242=1;
                            if(rotaryStatus_in.isREQ()){//sysj\orchestrator.sysj line: 205, column: 4
                              rotaryStatus_in.setACK(false);//sysj\orchestrator.sysj line: 205, column: 4
                              ends[13]=2;
                              ;//sysj\orchestrator.sysj line: 205, column: 4
                              System.out.println("Orch: Received rotary status");//sysj\orchestrator.sysj line: 206, column: 4
                              res_thread_13 = (String)(rotaryStatus_in.getVal() == null ? null : ((String)rotaryStatus_in.getVal()));//sysj\orchestrator.sysj line: 207, column: 4
                              recRotaryStatus_1.setPresent();//sysj\orchestrator.sysj line: 208, column: 4
                              currsigs.addElement(recRotaryStatus_1);
                              recRotaryStatus_1.setValue(res_thread_13);//sysj\orchestrator.sysj line: 208, column: 4
                              S47196=0;
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
                S47203=1;
                S47203=0;
                if(!rotaryReq_o.isPartnerPresent() || rotaryReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 204, column: 4
                  rotaryReq_o.setREQ(false);//sysj\orchestrator.sysj line: 204, column: 4
                  S47203=1;
                  active[13]=1;
                  ends[13]=1;
                  tdone[13]=1;
                }
                else {
                  S47198=0;
                  if(rotaryReq_o.isACK()){//sysj\orchestrator.sysj line: 204, column: 4
                    rotaryReq_o.setVal(true);//sysj\orchestrator.sysj line: 204, column: 4
                    S47198=1;
                    if(!rotaryReq_o.isACK()){//sysj\orchestrator.sysj line: 204, column: 4
                      rotaryReq_o.setREQ(false);//sysj\orchestrator.sysj line: 204, column: 4
                      ends[13]=2;
                      ;//sysj\orchestrator.sysj line: 204, column: 4
                      S47196=2;
                      S47247=0;
                      if(!rotaryStatus_in.isPartnerPresent() || rotaryStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 205, column: 4
                        rotaryStatus_in.setACK(false);//sysj\orchestrator.sysj line: 205, column: 4
                        S47247=1;
                        active[13]=1;
                        ends[13]=1;
                        tdone[13]=1;
                      }
                      else {
                        S47242=0;
                        if(!rotaryStatus_in.isREQ()){//sysj\orchestrator.sysj line: 205, column: 4
                          rotaryStatus_in.setACK(true);//sysj\orchestrator.sysj line: 205, column: 4
                          S47242=1;
                          if(rotaryStatus_in.isREQ()){//sysj\orchestrator.sysj line: 205, column: 4
                            rotaryStatus_in.setACK(false);//sysj\orchestrator.sysj line: 205, column: 4
                            ends[13]=2;
                            ;//sysj\orchestrator.sysj line: 205, column: 4
                            System.out.println("Orch: Received rotary status");//sysj\orchestrator.sysj line: 206, column: 4
                            res_thread_13 = (String)(rotaryStatus_in.getVal() == null ? null : ((String)rotaryStatus_in.getVal()));//sysj\orchestrator.sysj line: 207, column: 4
                            recRotaryStatus_1.setPresent();//sysj\orchestrator.sysj line: 208, column: 4
                            currsigs.addElement(recRotaryStatus_1);
                            recRotaryStatus_1.setValue(res_thread_13);//sysj\orchestrator.sysj line: 208, column: 4
                            S47196=0;
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
            switch(S47247){
              case 0 : 
                if(!rotaryStatus_in.isPartnerPresent() || rotaryStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 205, column: 4
                  rotaryStatus_in.setACK(false);//sysj\orchestrator.sysj line: 205, column: 4
                  S47247=1;
                  active[13]=1;
                  ends[13]=1;
                  tdone[13]=1;
                }
                else {
                  switch(S47242){
                    case 0 : 
                      if(!rotaryStatus_in.isREQ()){//sysj\orchestrator.sysj line: 205, column: 4
                        rotaryStatus_in.setACK(true);//sysj\orchestrator.sysj line: 205, column: 4
                        S47242=1;
                        if(rotaryStatus_in.isREQ()){//sysj\orchestrator.sysj line: 205, column: 4
                          rotaryStatus_in.setACK(false);//sysj\orchestrator.sysj line: 205, column: 4
                          ends[13]=2;
                          ;//sysj\orchestrator.sysj line: 205, column: 4
                          System.out.println("Orch: Received rotary status");//sysj\orchestrator.sysj line: 206, column: 4
                          res_thread_13 = (String)(rotaryStatus_in.getVal() == null ? null : ((String)rotaryStatus_in.getVal()));//sysj\orchestrator.sysj line: 207, column: 4
                          recRotaryStatus_1.setPresent();//sysj\orchestrator.sysj line: 208, column: 4
                          currsigs.addElement(recRotaryStatus_1);
                          recRotaryStatus_1.setValue(res_thread_13);//sysj\orchestrator.sysj line: 208, column: 4
                          S47196=0;
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
                      if(rotaryStatus_in.isREQ()){//sysj\orchestrator.sysj line: 205, column: 4
                        rotaryStatus_in.setACK(false);//sysj\orchestrator.sysj line: 205, column: 4
                        ends[13]=2;
                        ;//sysj\orchestrator.sysj line: 205, column: 4
                        System.out.println("Orch: Received rotary status");//sysj\orchestrator.sysj line: 206, column: 4
                        res_thread_13 = (String)(rotaryStatus_in.getVal() == null ? null : ((String)rotaryStatus_in.getVal()));//sysj\orchestrator.sysj line: 207, column: 4
                        recRotaryStatus_1.setPresent();//sysj\orchestrator.sysj line: 208, column: 4
                        currsigs.addElement(recRotaryStatus_1);
                        recRotaryStatus_1.setValue(res_thread_13);//sysj\orchestrator.sysj line: 208, column: 4
                        S47196=0;
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
                S47247=1;
                S47247=0;
                if(!rotaryStatus_in.isPartnerPresent() || rotaryStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 205, column: 4
                  rotaryStatus_in.setACK(false);//sysj\orchestrator.sysj line: 205, column: 4
                  S47247=1;
                  active[13]=1;
                  ends[13]=1;
                  tdone[13]=1;
                }
                else {
                  S47242=0;
                  if(!rotaryStatus_in.isREQ()){//sysj\orchestrator.sysj line: 205, column: 4
                    rotaryStatus_in.setACK(true);//sysj\orchestrator.sysj line: 205, column: 4
                    S47242=1;
                    if(rotaryStatus_in.isREQ()){//sysj\orchestrator.sysj line: 205, column: 4
                      rotaryStatus_in.setACK(false);//sysj\orchestrator.sysj line: 205, column: 4
                      ends[13]=2;
                      ;//sysj\orchestrator.sysj line: 205, column: 4
                      System.out.println("Orch: Received rotary status");//sysj\orchestrator.sysj line: 206, column: 4
                      res_thread_13 = (String)(rotaryStatus_in.getVal() == null ? null : ((String)rotaryStatus_in.getVal()));//sysj\orchestrator.sysj line: 207, column: 4
                      recRotaryStatus_1.setPresent();//sysj\orchestrator.sysj line: 208, column: 4
                      currsigs.addElement(recRotaryStatus_1);
                      recRotaryStatus_1.setValue(res_thread_13);//sysj\orchestrator.sysj line: 208, column: 4
                      S47196=0;
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

  public void thread49821(int [] tdone, int [] ends){
        switch(S47194){
      case 0 : 
        active[12]=0;
        ends[12]=0;
        tdone[12]=1;
        break;
      
      case 1 : 
        switch(S46256){
          case 0 : 
            if(sigFillerReq_1.getprestatus()){//sysj\orchestrator.sysj line: 189, column: 10
              System.out.println("Orch: Sending filler request");//sysj\orchestrator.sysj line: 190, column: 4
              req_thread_12 = (ArrayList)(sigFillerReq_1.getpreval() == null ? null : ((ArrayList)sigFillerReq_1.getpreval()));//sysj\orchestrator.sysj line: 191, column: 4
              S46256=1;
              S46263=0;
              if(!fillerReq_o.isPartnerPresent() || fillerReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 192, column: 4
                fillerReq_o.setREQ(false);//sysj\orchestrator.sysj line: 192, column: 4
                S46263=1;
                active[12]=1;
                ends[12]=1;
                tdone[12]=1;
              }
              else {
                S46258=0;
                if(fillerReq_o.isACK()){//sysj\orchestrator.sysj line: 192, column: 4
                  fillerReq_o.setVal(req_thread_12);//sysj\orchestrator.sysj line: 192, column: 4
                  S46258=1;
                  if(!fillerReq_o.isACK()){//sysj\orchestrator.sysj line: 192, column: 4
                    fillerReq_o.setREQ(false);//sysj\orchestrator.sysj line: 192, column: 4
                    ends[12]=2;
                    ;//sysj\orchestrator.sysj line: 192, column: 4
                    S46256=2;
                    S46307=0;
                    if(!fillerStatus_in.isPartnerPresent() || fillerStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 193, column: 4
                      fillerStatus_in.setACK(false);//sysj\orchestrator.sysj line: 193, column: 4
                      S46307=1;
                      active[12]=1;
                      ends[12]=1;
                      tdone[12]=1;
                    }
                    else {
                      S46302=0;
                      if(!fillerStatus_in.isREQ()){//sysj\orchestrator.sysj line: 193, column: 4
                        fillerStatus_in.setACK(true);//sysj\orchestrator.sysj line: 193, column: 4
                        S46302=1;
                        if(fillerStatus_in.isREQ()){//sysj\orchestrator.sysj line: 193, column: 4
                          fillerStatus_in.setACK(false);//sysj\orchestrator.sysj line: 193, column: 4
                          ends[12]=2;
                          ;//sysj\orchestrator.sysj line: 193, column: 4
                          System.out.println("Orch: Received filler status");//sysj\orchestrator.sysj line: 194, column: 4
                          res_thread_12 = (String)(fillerStatus_in.getVal() == null ? null : ((String)fillerStatus_in.getVal()));//sysj\orchestrator.sysj line: 195, column: 4
                          recFillerStatus_1.setPresent();//sysj\orchestrator.sysj line: 196, column: 4
                          currsigs.addElement(recFillerStatus_1);
                          recFillerStatus_1.setValue(res_thread_12);//sysj\orchestrator.sysj line: 196, column: 4
                          S46256=0;
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
            switch(S46263){
              case 0 : 
                if(!fillerReq_o.isPartnerPresent() || fillerReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 192, column: 4
                  fillerReq_o.setREQ(false);//sysj\orchestrator.sysj line: 192, column: 4
                  S46263=1;
                  active[12]=1;
                  ends[12]=1;
                  tdone[12]=1;
                }
                else {
                  switch(S46258){
                    case 0 : 
                      if(fillerReq_o.isACK()){//sysj\orchestrator.sysj line: 192, column: 4
                        fillerReq_o.setVal(req_thread_12);//sysj\orchestrator.sysj line: 192, column: 4
                        S46258=1;
                        if(!fillerReq_o.isACK()){//sysj\orchestrator.sysj line: 192, column: 4
                          fillerReq_o.setREQ(false);//sysj\orchestrator.sysj line: 192, column: 4
                          ends[12]=2;
                          ;//sysj\orchestrator.sysj line: 192, column: 4
                          S46256=2;
                          S46307=0;
                          if(!fillerStatus_in.isPartnerPresent() || fillerStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 193, column: 4
                            fillerStatus_in.setACK(false);//sysj\orchestrator.sysj line: 193, column: 4
                            S46307=1;
                            active[12]=1;
                            ends[12]=1;
                            tdone[12]=1;
                          }
                          else {
                            S46302=0;
                            if(!fillerStatus_in.isREQ()){//sysj\orchestrator.sysj line: 193, column: 4
                              fillerStatus_in.setACK(true);//sysj\orchestrator.sysj line: 193, column: 4
                              S46302=1;
                              if(fillerStatus_in.isREQ()){//sysj\orchestrator.sysj line: 193, column: 4
                                fillerStatus_in.setACK(false);//sysj\orchestrator.sysj line: 193, column: 4
                                ends[12]=2;
                                ;//sysj\orchestrator.sysj line: 193, column: 4
                                System.out.println("Orch: Received filler status");//sysj\orchestrator.sysj line: 194, column: 4
                                res_thread_12 = (String)(fillerStatus_in.getVal() == null ? null : ((String)fillerStatus_in.getVal()));//sysj\orchestrator.sysj line: 195, column: 4
                                recFillerStatus_1.setPresent();//sysj\orchestrator.sysj line: 196, column: 4
                                currsigs.addElement(recFillerStatus_1);
                                recFillerStatus_1.setValue(res_thread_12);//sysj\orchestrator.sysj line: 196, column: 4
                                S46256=0;
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
                      if(!fillerReq_o.isACK()){//sysj\orchestrator.sysj line: 192, column: 4
                        fillerReq_o.setREQ(false);//sysj\orchestrator.sysj line: 192, column: 4
                        ends[12]=2;
                        ;//sysj\orchestrator.sysj line: 192, column: 4
                        S46256=2;
                        S46307=0;
                        if(!fillerStatus_in.isPartnerPresent() || fillerStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 193, column: 4
                          fillerStatus_in.setACK(false);//sysj\orchestrator.sysj line: 193, column: 4
                          S46307=1;
                          active[12]=1;
                          ends[12]=1;
                          tdone[12]=1;
                        }
                        else {
                          S46302=0;
                          if(!fillerStatus_in.isREQ()){//sysj\orchestrator.sysj line: 193, column: 4
                            fillerStatus_in.setACK(true);//sysj\orchestrator.sysj line: 193, column: 4
                            S46302=1;
                            if(fillerStatus_in.isREQ()){//sysj\orchestrator.sysj line: 193, column: 4
                              fillerStatus_in.setACK(false);//sysj\orchestrator.sysj line: 193, column: 4
                              ends[12]=2;
                              ;//sysj\orchestrator.sysj line: 193, column: 4
                              System.out.println("Orch: Received filler status");//sysj\orchestrator.sysj line: 194, column: 4
                              res_thread_12 = (String)(fillerStatus_in.getVal() == null ? null : ((String)fillerStatus_in.getVal()));//sysj\orchestrator.sysj line: 195, column: 4
                              recFillerStatus_1.setPresent();//sysj\orchestrator.sysj line: 196, column: 4
                              currsigs.addElement(recFillerStatus_1);
                              recFillerStatus_1.setValue(res_thread_12);//sysj\orchestrator.sysj line: 196, column: 4
                              S46256=0;
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
                S46263=1;
                S46263=0;
                if(!fillerReq_o.isPartnerPresent() || fillerReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 192, column: 4
                  fillerReq_o.setREQ(false);//sysj\orchestrator.sysj line: 192, column: 4
                  S46263=1;
                  active[12]=1;
                  ends[12]=1;
                  tdone[12]=1;
                }
                else {
                  S46258=0;
                  if(fillerReq_o.isACK()){//sysj\orchestrator.sysj line: 192, column: 4
                    fillerReq_o.setVal(req_thread_12);//sysj\orchestrator.sysj line: 192, column: 4
                    S46258=1;
                    if(!fillerReq_o.isACK()){//sysj\orchestrator.sysj line: 192, column: 4
                      fillerReq_o.setREQ(false);//sysj\orchestrator.sysj line: 192, column: 4
                      ends[12]=2;
                      ;//sysj\orchestrator.sysj line: 192, column: 4
                      S46256=2;
                      S46307=0;
                      if(!fillerStatus_in.isPartnerPresent() || fillerStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 193, column: 4
                        fillerStatus_in.setACK(false);//sysj\orchestrator.sysj line: 193, column: 4
                        S46307=1;
                        active[12]=1;
                        ends[12]=1;
                        tdone[12]=1;
                      }
                      else {
                        S46302=0;
                        if(!fillerStatus_in.isREQ()){//sysj\orchestrator.sysj line: 193, column: 4
                          fillerStatus_in.setACK(true);//sysj\orchestrator.sysj line: 193, column: 4
                          S46302=1;
                          if(fillerStatus_in.isREQ()){//sysj\orchestrator.sysj line: 193, column: 4
                            fillerStatus_in.setACK(false);//sysj\orchestrator.sysj line: 193, column: 4
                            ends[12]=2;
                            ;//sysj\orchestrator.sysj line: 193, column: 4
                            System.out.println("Orch: Received filler status");//sysj\orchestrator.sysj line: 194, column: 4
                            res_thread_12 = (String)(fillerStatus_in.getVal() == null ? null : ((String)fillerStatus_in.getVal()));//sysj\orchestrator.sysj line: 195, column: 4
                            recFillerStatus_1.setPresent();//sysj\orchestrator.sysj line: 196, column: 4
                            currsigs.addElement(recFillerStatus_1);
                            recFillerStatus_1.setValue(res_thread_12);//sysj\orchestrator.sysj line: 196, column: 4
                            S46256=0;
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
            switch(S46307){
              case 0 : 
                if(!fillerStatus_in.isPartnerPresent() || fillerStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 193, column: 4
                  fillerStatus_in.setACK(false);//sysj\orchestrator.sysj line: 193, column: 4
                  S46307=1;
                  active[12]=1;
                  ends[12]=1;
                  tdone[12]=1;
                }
                else {
                  switch(S46302){
                    case 0 : 
                      if(!fillerStatus_in.isREQ()){//sysj\orchestrator.sysj line: 193, column: 4
                        fillerStatus_in.setACK(true);//sysj\orchestrator.sysj line: 193, column: 4
                        S46302=1;
                        if(fillerStatus_in.isREQ()){//sysj\orchestrator.sysj line: 193, column: 4
                          fillerStatus_in.setACK(false);//sysj\orchestrator.sysj line: 193, column: 4
                          ends[12]=2;
                          ;//sysj\orchestrator.sysj line: 193, column: 4
                          System.out.println("Orch: Received filler status");//sysj\orchestrator.sysj line: 194, column: 4
                          res_thread_12 = (String)(fillerStatus_in.getVal() == null ? null : ((String)fillerStatus_in.getVal()));//sysj\orchestrator.sysj line: 195, column: 4
                          recFillerStatus_1.setPresent();//sysj\orchestrator.sysj line: 196, column: 4
                          currsigs.addElement(recFillerStatus_1);
                          recFillerStatus_1.setValue(res_thread_12);//sysj\orchestrator.sysj line: 196, column: 4
                          S46256=0;
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
                      if(fillerStatus_in.isREQ()){//sysj\orchestrator.sysj line: 193, column: 4
                        fillerStatus_in.setACK(false);//sysj\orchestrator.sysj line: 193, column: 4
                        ends[12]=2;
                        ;//sysj\orchestrator.sysj line: 193, column: 4
                        System.out.println("Orch: Received filler status");//sysj\orchestrator.sysj line: 194, column: 4
                        res_thread_12 = (String)(fillerStatus_in.getVal() == null ? null : ((String)fillerStatus_in.getVal()));//sysj\orchestrator.sysj line: 195, column: 4
                        recFillerStatus_1.setPresent();//sysj\orchestrator.sysj line: 196, column: 4
                        currsigs.addElement(recFillerStatus_1);
                        recFillerStatus_1.setValue(res_thread_12);//sysj\orchestrator.sysj line: 196, column: 4
                        S46256=0;
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
                S46307=1;
                S46307=0;
                if(!fillerStatus_in.isPartnerPresent() || fillerStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 193, column: 4
                  fillerStatus_in.setACK(false);//sysj\orchestrator.sysj line: 193, column: 4
                  S46307=1;
                  active[12]=1;
                  ends[12]=1;
                  tdone[12]=1;
                }
                else {
                  S46302=0;
                  if(!fillerStatus_in.isREQ()){//sysj\orchestrator.sysj line: 193, column: 4
                    fillerStatus_in.setACK(true);//sysj\orchestrator.sysj line: 193, column: 4
                    S46302=1;
                    if(fillerStatus_in.isREQ()){//sysj\orchestrator.sysj line: 193, column: 4
                      fillerStatus_in.setACK(false);//sysj\orchestrator.sysj line: 193, column: 4
                      ends[12]=2;
                      ;//sysj\orchestrator.sysj line: 193, column: 4
                      System.out.println("Orch: Received filler status");//sysj\orchestrator.sysj line: 194, column: 4
                      res_thread_12 = (String)(fillerStatus_in.getVal() == null ? null : ((String)fillerStatus_in.getVal()));//sysj\orchestrator.sysj line: 195, column: 4
                      recFillerStatus_1.setPresent();//sysj\orchestrator.sysj line: 196, column: 4
                      currsigs.addElement(recFillerStatus_1);
                      recFillerStatus_1.setValue(res_thread_12);//sysj\orchestrator.sysj line: 196, column: 4
                      S46256=0;
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

  public void thread49820(int [] tdone, int [] ends){
        switch(S46254){
      case 0 : 
        active[11]=0;
        ends[11]=0;
        tdone[11]=1;
        break;
      
      case 1 : 
        switch(S45316){
          case 0 : 
            if(sigCapLoaderReq_1.getprestatus()){//sysj\orchestrator.sysj line: 176, column: 10
              System.out.println("Orch: Sending cap loader request");//sysj\orchestrator.sysj line: 177, column: 4
              S45316=1;
              S45323=0;
              if(!capLoaderReq_o.isPartnerPresent() || capLoaderReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 178, column: 4
                capLoaderReq_o.setREQ(false);//sysj\orchestrator.sysj line: 178, column: 4
                S45323=1;
                active[11]=1;
                ends[11]=1;
                tdone[11]=1;
              }
              else {
                S45318=0;
                if(capLoaderReq_o.isACK()){//sysj\orchestrator.sysj line: 178, column: 4
                  capLoaderReq_o.setVal(true);//sysj\orchestrator.sysj line: 178, column: 4
                  S45318=1;
                  if(!capLoaderReq_o.isACK()){//sysj\orchestrator.sysj line: 178, column: 4
                    capLoaderReq_o.setREQ(false);//sysj\orchestrator.sysj line: 178, column: 4
                    ends[11]=2;
                    ;//sysj\orchestrator.sysj line: 178, column: 4
                    S45316=2;
                    S45367=0;
                    if(!capLoaderStatus_in.isPartnerPresent() || capLoaderStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 179, column: 4
                      capLoaderStatus_in.setACK(false);//sysj\orchestrator.sysj line: 179, column: 4
                      S45367=1;
                      active[11]=1;
                      ends[11]=1;
                      tdone[11]=1;
                    }
                    else {
                      S45362=0;
                      if(!capLoaderStatus_in.isREQ()){//sysj\orchestrator.sysj line: 179, column: 4
                        capLoaderStatus_in.setACK(true);//sysj\orchestrator.sysj line: 179, column: 4
                        S45362=1;
                        if(capLoaderStatus_in.isREQ()){//sysj\orchestrator.sysj line: 179, column: 4
                          capLoaderStatus_in.setACK(false);//sysj\orchestrator.sysj line: 179, column: 4
                          ends[11]=2;
                          ;//sysj\orchestrator.sysj line: 179, column: 4
                          System.out.println("Orch: Received cap loader status");//sysj\orchestrator.sysj line: 180, column: 4
                          res_thread_11 = (String)(capLoaderStatus_in.getVal() == null ? null : ((String)capLoaderStatus_in.getVal()));//sysj\orchestrator.sysj line: 182, column: 4
                          recCapLoaderStatus_1.setPresent();//sysj\orchestrator.sysj line: 183, column: 4
                          currsigs.addElement(recCapLoaderStatus_1);
                          recCapLoaderStatus_1.setValue(res_thread_11);//sysj\orchestrator.sysj line: 183, column: 4
                          S45316=0;
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
            switch(S45323){
              case 0 : 
                if(!capLoaderReq_o.isPartnerPresent() || capLoaderReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 178, column: 4
                  capLoaderReq_o.setREQ(false);//sysj\orchestrator.sysj line: 178, column: 4
                  S45323=1;
                  active[11]=1;
                  ends[11]=1;
                  tdone[11]=1;
                }
                else {
                  switch(S45318){
                    case 0 : 
                      if(capLoaderReq_o.isACK()){//sysj\orchestrator.sysj line: 178, column: 4
                        capLoaderReq_o.setVal(true);//sysj\orchestrator.sysj line: 178, column: 4
                        S45318=1;
                        if(!capLoaderReq_o.isACK()){//sysj\orchestrator.sysj line: 178, column: 4
                          capLoaderReq_o.setREQ(false);//sysj\orchestrator.sysj line: 178, column: 4
                          ends[11]=2;
                          ;//sysj\orchestrator.sysj line: 178, column: 4
                          S45316=2;
                          S45367=0;
                          if(!capLoaderStatus_in.isPartnerPresent() || capLoaderStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 179, column: 4
                            capLoaderStatus_in.setACK(false);//sysj\orchestrator.sysj line: 179, column: 4
                            S45367=1;
                            active[11]=1;
                            ends[11]=1;
                            tdone[11]=1;
                          }
                          else {
                            S45362=0;
                            if(!capLoaderStatus_in.isREQ()){//sysj\orchestrator.sysj line: 179, column: 4
                              capLoaderStatus_in.setACK(true);//sysj\orchestrator.sysj line: 179, column: 4
                              S45362=1;
                              if(capLoaderStatus_in.isREQ()){//sysj\orchestrator.sysj line: 179, column: 4
                                capLoaderStatus_in.setACK(false);//sysj\orchestrator.sysj line: 179, column: 4
                                ends[11]=2;
                                ;//sysj\orchestrator.sysj line: 179, column: 4
                                System.out.println("Orch: Received cap loader status");//sysj\orchestrator.sysj line: 180, column: 4
                                res_thread_11 = (String)(capLoaderStatus_in.getVal() == null ? null : ((String)capLoaderStatus_in.getVal()));//sysj\orchestrator.sysj line: 182, column: 4
                                recCapLoaderStatus_1.setPresent();//sysj\orchestrator.sysj line: 183, column: 4
                                currsigs.addElement(recCapLoaderStatus_1);
                                recCapLoaderStatus_1.setValue(res_thread_11);//sysj\orchestrator.sysj line: 183, column: 4
                                S45316=0;
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
                      if(!capLoaderReq_o.isACK()){//sysj\orchestrator.sysj line: 178, column: 4
                        capLoaderReq_o.setREQ(false);//sysj\orchestrator.sysj line: 178, column: 4
                        ends[11]=2;
                        ;//sysj\orchestrator.sysj line: 178, column: 4
                        S45316=2;
                        S45367=0;
                        if(!capLoaderStatus_in.isPartnerPresent() || capLoaderStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 179, column: 4
                          capLoaderStatus_in.setACK(false);//sysj\orchestrator.sysj line: 179, column: 4
                          S45367=1;
                          active[11]=1;
                          ends[11]=1;
                          tdone[11]=1;
                        }
                        else {
                          S45362=0;
                          if(!capLoaderStatus_in.isREQ()){//sysj\orchestrator.sysj line: 179, column: 4
                            capLoaderStatus_in.setACK(true);//sysj\orchestrator.sysj line: 179, column: 4
                            S45362=1;
                            if(capLoaderStatus_in.isREQ()){//sysj\orchestrator.sysj line: 179, column: 4
                              capLoaderStatus_in.setACK(false);//sysj\orchestrator.sysj line: 179, column: 4
                              ends[11]=2;
                              ;//sysj\orchestrator.sysj line: 179, column: 4
                              System.out.println("Orch: Received cap loader status");//sysj\orchestrator.sysj line: 180, column: 4
                              res_thread_11 = (String)(capLoaderStatus_in.getVal() == null ? null : ((String)capLoaderStatus_in.getVal()));//sysj\orchestrator.sysj line: 182, column: 4
                              recCapLoaderStatus_1.setPresent();//sysj\orchestrator.sysj line: 183, column: 4
                              currsigs.addElement(recCapLoaderStatus_1);
                              recCapLoaderStatus_1.setValue(res_thread_11);//sysj\orchestrator.sysj line: 183, column: 4
                              S45316=0;
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
                S45323=1;
                S45323=0;
                if(!capLoaderReq_o.isPartnerPresent() || capLoaderReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 178, column: 4
                  capLoaderReq_o.setREQ(false);//sysj\orchestrator.sysj line: 178, column: 4
                  S45323=1;
                  active[11]=1;
                  ends[11]=1;
                  tdone[11]=1;
                }
                else {
                  S45318=0;
                  if(capLoaderReq_o.isACK()){//sysj\orchestrator.sysj line: 178, column: 4
                    capLoaderReq_o.setVal(true);//sysj\orchestrator.sysj line: 178, column: 4
                    S45318=1;
                    if(!capLoaderReq_o.isACK()){//sysj\orchestrator.sysj line: 178, column: 4
                      capLoaderReq_o.setREQ(false);//sysj\orchestrator.sysj line: 178, column: 4
                      ends[11]=2;
                      ;//sysj\orchestrator.sysj line: 178, column: 4
                      S45316=2;
                      S45367=0;
                      if(!capLoaderStatus_in.isPartnerPresent() || capLoaderStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 179, column: 4
                        capLoaderStatus_in.setACK(false);//sysj\orchestrator.sysj line: 179, column: 4
                        S45367=1;
                        active[11]=1;
                        ends[11]=1;
                        tdone[11]=1;
                      }
                      else {
                        S45362=0;
                        if(!capLoaderStatus_in.isREQ()){//sysj\orchestrator.sysj line: 179, column: 4
                          capLoaderStatus_in.setACK(true);//sysj\orchestrator.sysj line: 179, column: 4
                          S45362=1;
                          if(capLoaderStatus_in.isREQ()){//sysj\orchestrator.sysj line: 179, column: 4
                            capLoaderStatus_in.setACK(false);//sysj\orchestrator.sysj line: 179, column: 4
                            ends[11]=2;
                            ;//sysj\orchestrator.sysj line: 179, column: 4
                            System.out.println("Orch: Received cap loader status");//sysj\orchestrator.sysj line: 180, column: 4
                            res_thread_11 = (String)(capLoaderStatus_in.getVal() == null ? null : ((String)capLoaderStatus_in.getVal()));//sysj\orchestrator.sysj line: 182, column: 4
                            recCapLoaderStatus_1.setPresent();//sysj\orchestrator.sysj line: 183, column: 4
                            currsigs.addElement(recCapLoaderStatus_1);
                            recCapLoaderStatus_1.setValue(res_thread_11);//sysj\orchestrator.sysj line: 183, column: 4
                            S45316=0;
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
            switch(S45367){
              case 0 : 
                if(!capLoaderStatus_in.isPartnerPresent() || capLoaderStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 179, column: 4
                  capLoaderStatus_in.setACK(false);//sysj\orchestrator.sysj line: 179, column: 4
                  S45367=1;
                  active[11]=1;
                  ends[11]=1;
                  tdone[11]=1;
                }
                else {
                  switch(S45362){
                    case 0 : 
                      if(!capLoaderStatus_in.isREQ()){//sysj\orchestrator.sysj line: 179, column: 4
                        capLoaderStatus_in.setACK(true);//sysj\orchestrator.sysj line: 179, column: 4
                        S45362=1;
                        if(capLoaderStatus_in.isREQ()){//sysj\orchestrator.sysj line: 179, column: 4
                          capLoaderStatus_in.setACK(false);//sysj\orchestrator.sysj line: 179, column: 4
                          ends[11]=2;
                          ;//sysj\orchestrator.sysj line: 179, column: 4
                          System.out.println("Orch: Received cap loader status");//sysj\orchestrator.sysj line: 180, column: 4
                          res_thread_11 = (String)(capLoaderStatus_in.getVal() == null ? null : ((String)capLoaderStatus_in.getVal()));//sysj\orchestrator.sysj line: 182, column: 4
                          recCapLoaderStatus_1.setPresent();//sysj\orchestrator.sysj line: 183, column: 4
                          currsigs.addElement(recCapLoaderStatus_1);
                          recCapLoaderStatus_1.setValue(res_thread_11);//sysj\orchestrator.sysj line: 183, column: 4
                          S45316=0;
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
                      if(capLoaderStatus_in.isREQ()){//sysj\orchestrator.sysj line: 179, column: 4
                        capLoaderStatus_in.setACK(false);//sysj\orchestrator.sysj line: 179, column: 4
                        ends[11]=2;
                        ;//sysj\orchestrator.sysj line: 179, column: 4
                        System.out.println("Orch: Received cap loader status");//sysj\orchestrator.sysj line: 180, column: 4
                        res_thread_11 = (String)(capLoaderStatus_in.getVal() == null ? null : ((String)capLoaderStatus_in.getVal()));//sysj\orchestrator.sysj line: 182, column: 4
                        recCapLoaderStatus_1.setPresent();//sysj\orchestrator.sysj line: 183, column: 4
                        currsigs.addElement(recCapLoaderStatus_1);
                        recCapLoaderStatus_1.setValue(res_thread_11);//sysj\orchestrator.sysj line: 183, column: 4
                        S45316=0;
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
                S45367=1;
                S45367=0;
                if(!capLoaderStatus_in.isPartnerPresent() || capLoaderStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 179, column: 4
                  capLoaderStatus_in.setACK(false);//sysj\orchestrator.sysj line: 179, column: 4
                  S45367=1;
                  active[11]=1;
                  ends[11]=1;
                  tdone[11]=1;
                }
                else {
                  S45362=0;
                  if(!capLoaderStatus_in.isREQ()){//sysj\orchestrator.sysj line: 179, column: 4
                    capLoaderStatus_in.setACK(true);//sysj\orchestrator.sysj line: 179, column: 4
                    S45362=1;
                    if(capLoaderStatus_in.isREQ()){//sysj\orchestrator.sysj line: 179, column: 4
                      capLoaderStatus_in.setACK(false);//sysj\orchestrator.sysj line: 179, column: 4
                      ends[11]=2;
                      ;//sysj\orchestrator.sysj line: 179, column: 4
                      System.out.println("Orch: Received cap loader status");//sysj\orchestrator.sysj line: 180, column: 4
                      res_thread_11 = (String)(capLoaderStatus_in.getVal() == null ? null : ((String)capLoaderStatus_in.getVal()));//sysj\orchestrator.sysj line: 182, column: 4
                      recCapLoaderStatus_1.setPresent();//sysj\orchestrator.sysj line: 183, column: 4
                      currsigs.addElement(recCapLoaderStatus_1);
                      recCapLoaderStatus_1.setValue(res_thread_11);//sysj\orchestrator.sysj line: 183, column: 4
                      S45316=0;
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

  public void thread49819(int [] tdone, int [] ends){
        switch(S45314){
      case 0 : 
        active[10]=0;
        ends[10]=0;
        tdone[10]=1;
        break;
      
      case 1 : 
        switch(S44376){
          case 0 : 
            if(sigCapperReq_1.getprestatus()){//sysj\orchestrator.sysj line: 164, column: 10
              System.out.println("Orch: Sending capper request");//sysj\orchestrator.sysj line: 165, column: 4
              S44376=1;
              S44383=0;
              if(!capperReq_o.isPartnerPresent() || capperReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 166, column: 4
                capperReq_o.setREQ(false);//sysj\orchestrator.sysj line: 166, column: 4
                S44383=1;
                active[10]=1;
                ends[10]=1;
                tdone[10]=1;
              }
              else {
                S44378=0;
                if(capperReq_o.isACK()){//sysj\orchestrator.sysj line: 166, column: 4
                  capperReq_o.setVal(true);//sysj\orchestrator.sysj line: 166, column: 4
                  S44378=1;
                  if(!capperReq_o.isACK()){//sysj\orchestrator.sysj line: 166, column: 4
                    capperReq_o.setREQ(false);//sysj\orchestrator.sysj line: 166, column: 4
                    ends[10]=2;
                    ;//sysj\orchestrator.sysj line: 166, column: 4
                    S44376=2;
                    S44427=0;
                    if(!capperStatus_in.isPartnerPresent() || capperStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 167, column: 4
                      capperStatus_in.setACK(false);//sysj\orchestrator.sysj line: 167, column: 4
                      S44427=1;
                      active[10]=1;
                      ends[10]=1;
                      tdone[10]=1;
                    }
                    else {
                      S44422=0;
                      if(!capperStatus_in.isREQ()){//sysj\orchestrator.sysj line: 167, column: 4
                        capperStatus_in.setACK(true);//sysj\orchestrator.sysj line: 167, column: 4
                        S44422=1;
                        if(capperStatus_in.isREQ()){//sysj\orchestrator.sysj line: 167, column: 4
                          capperStatus_in.setACK(false);//sysj\orchestrator.sysj line: 167, column: 4
                          ends[10]=2;
                          ;//sysj\orchestrator.sysj line: 167, column: 4
                          System.out.println("Orch: Received capper status");//sysj\orchestrator.sysj line: 168, column: 4
                          res_thread_10 = (String)(capperStatus_in.getVal() == null ? null : ((String)capperStatus_in.getVal()));//sysj\orchestrator.sysj line: 169, column: 4
                          recCapperStatus_1.setPresent();//sysj\orchestrator.sysj line: 170, column: 4
                          currsigs.addElement(recCapperStatus_1);
                          recCapperStatus_1.setValue(res_thread_10);//sysj\orchestrator.sysj line: 170, column: 4
                          S44376=0;
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
            switch(S44383){
              case 0 : 
                if(!capperReq_o.isPartnerPresent() || capperReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 166, column: 4
                  capperReq_o.setREQ(false);//sysj\orchestrator.sysj line: 166, column: 4
                  S44383=1;
                  active[10]=1;
                  ends[10]=1;
                  tdone[10]=1;
                }
                else {
                  switch(S44378){
                    case 0 : 
                      if(capperReq_o.isACK()){//sysj\orchestrator.sysj line: 166, column: 4
                        capperReq_o.setVal(true);//sysj\orchestrator.sysj line: 166, column: 4
                        S44378=1;
                        if(!capperReq_o.isACK()){//sysj\orchestrator.sysj line: 166, column: 4
                          capperReq_o.setREQ(false);//sysj\orchestrator.sysj line: 166, column: 4
                          ends[10]=2;
                          ;//sysj\orchestrator.sysj line: 166, column: 4
                          S44376=2;
                          S44427=0;
                          if(!capperStatus_in.isPartnerPresent() || capperStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 167, column: 4
                            capperStatus_in.setACK(false);//sysj\orchestrator.sysj line: 167, column: 4
                            S44427=1;
                            active[10]=1;
                            ends[10]=1;
                            tdone[10]=1;
                          }
                          else {
                            S44422=0;
                            if(!capperStatus_in.isREQ()){//sysj\orchestrator.sysj line: 167, column: 4
                              capperStatus_in.setACK(true);//sysj\orchestrator.sysj line: 167, column: 4
                              S44422=1;
                              if(capperStatus_in.isREQ()){//sysj\orchestrator.sysj line: 167, column: 4
                                capperStatus_in.setACK(false);//sysj\orchestrator.sysj line: 167, column: 4
                                ends[10]=2;
                                ;//sysj\orchestrator.sysj line: 167, column: 4
                                System.out.println("Orch: Received capper status");//sysj\orchestrator.sysj line: 168, column: 4
                                res_thread_10 = (String)(capperStatus_in.getVal() == null ? null : ((String)capperStatus_in.getVal()));//sysj\orchestrator.sysj line: 169, column: 4
                                recCapperStatus_1.setPresent();//sysj\orchestrator.sysj line: 170, column: 4
                                currsigs.addElement(recCapperStatus_1);
                                recCapperStatus_1.setValue(res_thread_10);//sysj\orchestrator.sysj line: 170, column: 4
                                S44376=0;
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
                      if(!capperReq_o.isACK()){//sysj\orchestrator.sysj line: 166, column: 4
                        capperReq_o.setREQ(false);//sysj\orchestrator.sysj line: 166, column: 4
                        ends[10]=2;
                        ;//sysj\orchestrator.sysj line: 166, column: 4
                        S44376=2;
                        S44427=0;
                        if(!capperStatus_in.isPartnerPresent() || capperStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 167, column: 4
                          capperStatus_in.setACK(false);//sysj\orchestrator.sysj line: 167, column: 4
                          S44427=1;
                          active[10]=1;
                          ends[10]=1;
                          tdone[10]=1;
                        }
                        else {
                          S44422=0;
                          if(!capperStatus_in.isREQ()){//sysj\orchestrator.sysj line: 167, column: 4
                            capperStatus_in.setACK(true);//sysj\orchestrator.sysj line: 167, column: 4
                            S44422=1;
                            if(capperStatus_in.isREQ()){//sysj\orchestrator.sysj line: 167, column: 4
                              capperStatus_in.setACK(false);//sysj\orchestrator.sysj line: 167, column: 4
                              ends[10]=2;
                              ;//sysj\orchestrator.sysj line: 167, column: 4
                              System.out.println("Orch: Received capper status");//sysj\orchestrator.sysj line: 168, column: 4
                              res_thread_10 = (String)(capperStatus_in.getVal() == null ? null : ((String)capperStatus_in.getVal()));//sysj\orchestrator.sysj line: 169, column: 4
                              recCapperStatus_1.setPresent();//sysj\orchestrator.sysj line: 170, column: 4
                              currsigs.addElement(recCapperStatus_1);
                              recCapperStatus_1.setValue(res_thread_10);//sysj\orchestrator.sysj line: 170, column: 4
                              S44376=0;
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
                S44383=1;
                S44383=0;
                if(!capperReq_o.isPartnerPresent() || capperReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 166, column: 4
                  capperReq_o.setREQ(false);//sysj\orchestrator.sysj line: 166, column: 4
                  S44383=1;
                  active[10]=1;
                  ends[10]=1;
                  tdone[10]=1;
                }
                else {
                  S44378=0;
                  if(capperReq_o.isACK()){//sysj\orchestrator.sysj line: 166, column: 4
                    capperReq_o.setVal(true);//sysj\orchestrator.sysj line: 166, column: 4
                    S44378=1;
                    if(!capperReq_o.isACK()){//sysj\orchestrator.sysj line: 166, column: 4
                      capperReq_o.setREQ(false);//sysj\orchestrator.sysj line: 166, column: 4
                      ends[10]=2;
                      ;//sysj\orchestrator.sysj line: 166, column: 4
                      S44376=2;
                      S44427=0;
                      if(!capperStatus_in.isPartnerPresent() || capperStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 167, column: 4
                        capperStatus_in.setACK(false);//sysj\orchestrator.sysj line: 167, column: 4
                        S44427=1;
                        active[10]=1;
                        ends[10]=1;
                        tdone[10]=1;
                      }
                      else {
                        S44422=0;
                        if(!capperStatus_in.isREQ()){//sysj\orchestrator.sysj line: 167, column: 4
                          capperStatus_in.setACK(true);//sysj\orchestrator.sysj line: 167, column: 4
                          S44422=1;
                          if(capperStatus_in.isREQ()){//sysj\orchestrator.sysj line: 167, column: 4
                            capperStatus_in.setACK(false);//sysj\orchestrator.sysj line: 167, column: 4
                            ends[10]=2;
                            ;//sysj\orchestrator.sysj line: 167, column: 4
                            System.out.println("Orch: Received capper status");//sysj\orchestrator.sysj line: 168, column: 4
                            res_thread_10 = (String)(capperStatus_in.getVal() == null ? null : ((String)capperStatus_in.getVal()));//sysj\orchestrator.sysj line: 169, column: 4
                            recCapperStatus_1.setPresent();//sysj\orchestrator.sysj line: 170, column: 4
                            currsigs.addElement(recCapperStatus_1);
                            recCapperStatus_1.setValue(res_thread_10);//sysj\orchestrator.sysj line: 170, column: 4
                            S44376=0;
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
            switch(S44427){
              case 0 : 
                if(!capperStatus_in.isPartnerPresent() || capperStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 167, column: 4
                  capperStatus_in.setACK(false);//sysj\orchestrator.sysj line: 167, column: 4
                  S44427=1;
                  active[10]=1;
                  ends[10]=1;
                  tdone[10]=1;
                }
                else {
                  switch(S44422){
                    case 0 : 
                      if(!capperStatus_in.isREQ()){//sysj\orchestrator.sysj line: 167, column: 4
                        capperStatus_in.setACK(true);//sysj\orchestrator.sysj line: 167, column: 4
                        S44422=1;
                        if(capperStatus_in.isREQ()){//sysj\orchestrator.sysj line: 167, column: 4
                          capperStatus_in.setACK(false);//sysj\orchestrator.sysj line: 167, column: 4
                          ends[10]=2;
                          ;//sysj\orchestrator.sysj line: 167, column: 4
                          System.out.println("Orch: Received capper status");//sysj\orchestrator.sysj line: 168, column: 4
                          res_thread_10 = (String)(capperStatus_in.getVal() == null ? null : ((String)capperStatus_in.getVal()));//sysj\orchestrator.sysj line: 169, column: 4
                          recCapperStatus_1.setPresent();//sysj\orchestrator.sysj line: 170, column: 4
                          currsigs.addElement(recCapperStatus_1);
                          recCapperStatus_1.setValue(res_thread_10);//sysj\orchestrator.sysj line: 170, column: 4
                          S44376=0;
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
                      if(capperStatus_in.isREQ()){//sysj\orchestrator.sysj line: 167, column: 4
                        capperStatus_in.setACK(false);//sysj\orchestrator.sysj line: 167, column: 4
                        ends[10]=2;
                        ;//sysj\orchestrator.sysj line: 167, column: 4
                        System.out.println("Orch: Received capper status");//sysj\orchestrator.sysj line: 168, column: 4
                        res_thread_10 = (String)(capperStatus_in.getVal() == null ? null : ((String)capperStatus_in.getVal()));//sysj\orchestrator.sysj line: 169, column: 4
                        recCapperStatus_1.setPresent();//sysj\orchestrator.sysj line: 170, column: 4
                        currsigs.addElement(recCapperStatus_1);
                        recCapperStatus_1.setValue(res_thread_10);//sysj\orchestrator.sysj line: 170, column: 4
                        S44376=0;
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
                S44427=1;
                S44427=0;
                if(!capperStatus_in.isPartnerPresent() || capperStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 167, column: 4
                  capperStatus_in.setACK(false);//sysj\orchestrator.sysj line: 167, column: 4
                  S44427=1;
                  active[10]=1;
                  ends[10]=1;
                  tdone[10]=1;
                }
                else {
                  S44422=0;
                  if(!capperStatus_in.isREQ()){//sysj\orchestrator.sysj line: 167, column: 4
                    capperStatus_in.setACK(true);//sysj\orchestrator.sysj line: 167, column: 4
                    S44422=1;
                    if(capperStatus_in.isREQ()){//sysj\orchestrator.sysj line: 167, column: 4
                      capperStatus_in.setACK(false);//sysj\orchestrator.sysj line: 167, column: 4
                      ends[10]=2;
                      ;//sysj\orchestrator.sysj line: 167, column: 4
                      System.out.println("Orch: Received capper status");//sysj\orchestrator.sysj line: 168, column: 4
                      res_thread_10 = (String)(capperStatus_in.getVal() == null ? null : ((String)capperStatus_in.getVal()));//sysj\orchestrator.sysj line: 169, column: 4
                      recCapperStatus_1.setPresent();//sysj\orchestrator.sysj line: 170, column: 4
                      currsigs.addElement(recCapperStatus_1);
                      recCapperStatus_1.setValue(res_thread_10);//sysj\orchestrator.sysj line: 170, column: 4
                      S44376=0;
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

  public void thread49818(int [] tdone, int [] ends){
        switch(S44374){
      case 0 : 
        active[9]=0;
        ends[9]=0;
        tdone[9]=1;
        break;
      
      case 1 : 
        switch(S43436){
          case 0 : 
            if(sigConveyorReq_1.getprestatus()){//sysj\orchestrator.sysj line: 152, column: 10
              conveyorStatusUIE.setPresent();//sysj\orchestrator.sysj line: 153, column: 4
              currsigs.addElement(conveyorStatusUIE);
              conveyorStatusUIE.setValue(true);//sysj\orchestrator.sysj line: 153, column: 4
              S43436=1;
              S43443=0;
              if(!conveyorReq_o.isPartnerPresent() || conveyorReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 154, column: 4
                conveyorReq_o.setREQ(false);//sysj\orchestrator.sysj line: 154, column: 4
                S43443=1;
                active[9]=1;
                ends[9]=1;
                tdone[9]=1;
              }
              else {
                S43438=0;
                if(conveyorReq_o.isACK()){//sysj\orchestrator.sysj line: 154, column: 4
                  conveyorReq_o.setVal(true);//sysj\orchestrator.sysj line: 154, column: 4
                  S43438=1;
                  if(!conveyorReq_o.isACK()){//sysj\orchestrator.sysj line: 154, column: 4
                    conveyorReq_o.setREQ(false);//sysj\orchestrator.sysj line: 154, column: 4
                    ends[9]=2;
                    ;//sysj\orchestrator.sysj line: 154, column: 4
                    S43436=2;
                    S43487=0;
                    if(!conveyorStatus_in.isPartnerPresent() || conveyorStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 155, column: 4
                      conveyorStatus_in.setACK(false);//sysj\orchestrator.sysj line: 155, column: 4
                      S43487=1;
                      active[9]=1;
                      ends[9]=1;
                      tdone[9]=1;
                    }
                    else {
                      S43482=0;
                      if(!conveyorStatus_in.isREQ()){//sysj\orchestrator.sysj line: 155, column: 4
                        conveyorStatus_in.setACK(true);//sysj\orchestrator.sysj line: 155, column: 4
                        S43482=1;
                        if(conveyorStatus_in.isREQ()){//sysj\orchestrator.sysj line: 155, column: 4
                          conveyorStatus_in.setACK(false);//sysj\orchestrator.sysj line: 155, column: 4
                          ends[9]=2;
                          ;//sysj\orchestrator.sysj line: 155, column: 4
                          conveyorStatusUIE.setPresent();//sysj\orchestrator.sysj line: 156, column: 4
                          currsigs.addElement(conveyorStatusUIE);
                          conveyorStatusUIE.setValue(false);//sysj\orchestrator.sysj line: 156, column: 4
                          res_thread_9 = (String)(conveyorStatus_in.getVal() == null ? null : ((String)conveyorStatus_in.getVal()));//sysj\orchestrator.sysj line: 157, column: 4
                          recConveyorStatus_1.setPresent();//sysj\orchestrator.sysj line: 158, column: 4
                          currsigs.addElement(recConveyorStatus_1);
                          recConveyorStatus_1.setValue(res_thread_9);//sysj\orchestrator.sysj line: 158, column: 4
                          S43436=0;
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
            switch(S43443){
              case 0 : 
                if(!conveyorReq_o.isPartnerPresent() || conveyorReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 154, column: 4
                  conveyorReq_o.setREQ(false);//sysj\orchestrator.sysj line: 154, column: 4
                  S43443=1;
                  active[9]=1;
                  ends[9]=1;
                  tdone[9]=1;
                }
                else {
                  switch(S43438){
                    case 0 : 
                      if(conveyorReq_o.isACK()){//sysj\orchestrator.sysj line: 154, column: 4
                        conveyorReq_o.setVal(true);//sysj\orchestrator.sysj line: 154, column: 4
                        S43438=1;
                        if(!conveyorReq_o.isACK()){//sysj\orchestrator.sysj line: 154, column: 4
                          conveyorReq_o.setREQ(false);//sysj\orchestrator.sysj line: 154, column: 4
                          ends[9]=2;
                          ;//sysj\orchestrator.sysj line: 154, column: 4
                          S43436=2;
                          S43487=0;
                          if(!conveyorStatus_in.isPartnerPresent() || conveyorStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 155, column: 4
                            conveyorStatus_in.setACK(false);//sysj\orchestrator.sysj line: 155, column: 4
                            S43487=1;
                            active[9]=1;
                            ends[9]=1;
                            tdone[9]=1;
                          }
                          else {
                            S43482=0;
                            if(!conveyorStatus_in.isREQ()){//sysj\orchestrator.sysj line: 155, column: 4
                              conveyorStatus_in.setACK(true);//sysj\orchestrator.sysj line: 155, column: 4
                              S43482=1;
                              if(conveyorStatus_in.isREQ()){//sysj\orchestrator.sysj line: 155, column: 4
                                conveyorStatus_in.setACK(false);//sysj\orchestrator.sysj line: 155, column: 4
                                ends[9]=2;
                                ;//sysj\orchestrator.sysj line: 155, column: 4
                                conveyorStatusUIE.setPresent();//sysj\orchestrator.sysj line: 156, column: 4
                                currsigs.addElement(conveyorStatusUIE);
                                conveyorStatusUIE.setValue(false);//sysj\orchestrator.sysj line: 156, column: 4
                                res_thread_9 = (String)(conveyorStatus_in.getVal() == null ? null : ((String)conveyorStatus_in.getVal()));//sysj\orchestrator.sysj line: 157, column: 4
                                recConveyorStatus_1.setPresent();//sysj\orchestrator.sysj line: 158, column: 4
                                currsigs.addElement(recConveyorStatus_1);
                                recConveyorStatus_1.setValue(res_thread_9);//sysj\orchestrator.sysj line: 158, column: 4
                                S43436=0;
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
                      if(!conveyorReq_o.isACK()){//sysj\orchestrator.sysj line: 154, column: 4
                        conveyorReq_o.setREQ(false);//sysj\orchestrator.sysj line: 154, column: 4
                        ends[9]=2;
                        ;//sysj\orchestrator.sysj line: 154, column: 4
                        S43436=2;
                        S43487=0;
                        if(!conveyorStatus_in.isPartnerPresent() || conveyorStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 155, column: 4
                          conveyorStatus_in.setACK(false);//sysj\orchestrator.sysj line: 155, column: 4
                          S43487=1;
                          active[9]=1;
                          ends[9]=1;
                          tdone[9]=1;
                        }
                        else {
                          S43482=0;
                          if(!conveyorStatus_in.isREQ()){//sysj\orchestrator.sysj line: 155, column: 4
                            conveyorStatus_in.setACK(true);//sysj\orchestrator.sysj line: 155, column: 4
                            S43482=1;
                            if(conveyorStatus_in.isREQ()){//sysj\orchestrator.sysj line: 155, column: 4
                              conveyorStatus_in.setACK(false);//sysj\orchestrator.sysj line: 155, column: 4
                              ends[9]=2;
                              ;//sysj\orchestrator.sysj line: 155, column: 4
                              conveyorStatusUIE.setPresent();//sysj\orchestrator.sysj line: 156, column: 4
                              currsigs.addElement(conveyorStatusUIE);
                              conveyorStatusUIE.setValue(false);//sysj\orchestrator.sysj line: 156, column: 4
                              res_thread_9 = (String)(conveyorStatus_in.getVal() == null ? null : ((String)conveyorStatus_in.getVal()));//sysj\orchestrator.sysj line: 157, column: 4
                              recConveyorStatus_1.setPresent();//sysj\orchestrator.sysj line: 158, column: 4
                              currsigs.addElement(recConveyorStatus_1);
                              recConveyorStatus_1.setValue(res_thread_9);//sysj\orchestrator.sysj line: 158, column: 4
                              S43436=0;
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
                S43443=1;
                S43443=0;
                if(!conveyorReq_o.isPartnerPresent() || conveyorReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 154, column: 4
                  conveyorReq_o.setREQ(false);//sysj\orchestrator.sysj line: 154, column: 4
                  S43443=1;
                  active[9]=1;
                  ends[9]=1;
                  tdone[9]=1;
                }
                else {
                  S43438=0;
                  if(conveyorReq_o.isACK()){//sysj\orchestrator.sysj line: 154, column: 4
                    conveyorReq_o.setVal(true);//sysj\orchestrator.sysj line: 154, column: 4
                    S43438=1;
                    if(!conveyorReq_o.isACK()){//sysj\orchestrator.sysj line: 154, column: 4
                      conveyorReq_o.setREQ(false);//sysj\orchestrator.sysj line: 154, column: 4
                      ends[9]=2;
                      ;//sysj\orchestrator.sysj line: 154, column: 4
                      S43436=2;
                      S43487=0;
                      if(!conveyorStatus_in.isPartnerPresent() || conveyorStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 155, column: 4
                        conveyorStatus_in.setACK(false);//sysj\orchestrator.sysj line: 155, column: 4
                        S43487=1;
                        active[9]=1;
                        ends[9]=1;
                        tdone[9]=1;
                      }
                      else {
                        S43482=0;
                        if(!conveyorStatus_in.isREQ()){//sysj\orchestrator.sysj line: 155, column: 4
                          conveyorStatus_in.setACK(true);//sysj\orchestrator.sysj line: 155, column: 4
                          S43482=1;
                          if(conveyorStatus_in.isREQ()){//sysj\orchestrator.sysj line: 155, column: 4
                            conveyorStatus_in.setACK(false);//sysj\orchestrator.sysj line: 155, column: 4
                            ends[9]=2;
                            ;//sysj\orchestrator.sysj line: 155, column: 4
                            conveyorStatusUIE.setPresent();//sysj\orchestrator.sysj line: 156, column: 4
                            currsigs.addElement(conveyorStatusUIE);
                            conveyorStatusUIE.setValue(false);//sysj\orchestrator.sysj line: 156, column: 4
                            res_thread_9 = (String)(conveyorStatus_in.getVal() == null ? null : ((String)conveyorStatus_in.getVal()));//sysj\orchestrator.sysj line: 157, column: 4
                            recConveyorStatus_1.setPresent();//sysj\orchestrator.sysj line: 158, column: 4
                            currsigs.addElement(recConveyorStatus_1);
                            recConveyorStatus_1.setValue(res_thread_9);//sysj\orchestrator.sysj line: 158, column: 4
                            S43436=0;
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
            switch(S43487){
              case 0 : 
                if(!conveyorStatus_in.isPartnerPresent() || conveyorStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 155, column: 4
                  conveyorStatus_in.setACK(false);//sysj\orchestrator.sysj line: 155, column: 4
                  S43487=1;
                  active[9]=1;
                  ends[9]=1;
                  tdone[9]=1;
                }
                else {
                  switch(S43482){
                    case 0 : 
                      if(!conveyorStatus_in.isREQ()){//sysj\orchestrator.sysj line: 155, column: 4
                        conveyorStatus_in.setACK(true);//sysj\orchestrator.sysj line: 155, column: 4
                        S43482=1;
                        if(conveyorStatus_in.isREQ()){//sysj\orchestrator.sysj line: 155, column: 4
                          conveyorStatus_in.setACK(false);//sysj\orchestrator.sysj line: 155, column: 4
                          ends[9]=2;
                          ;//sysj\orchestrator.sysj line: 155, column: 4
                          conveyorStatusUIE.setPresent();//sysj\orchestrator.sysj line: 156, column: 4
                          currsigs.addElement(conveyorStatusUIE);
                          conveyorStatusUIE.setValue(false);//sysj\orchestrator.sysj line: 156, column: 4
                          res_thread_9 = (String)(conveyorStatus_in.getVal() == null ? null : ((String)conveyorStatus_in.getVal()));//sysj\orchestrator.sysj line: 157, column: 4
                          recConveyorStatus_1.setPresent();//sysj\orchestrator.sysj line: 158, column: 4
                          currsigs.addElement(recConveyorStatus_1);
                          recConveyorStatus_1.setValue(res_thread_9);//sysj\orchestrator.sysj line: 158, column: 4
                          S43436=0;
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
                      if(conveyorStatus_in.isREQ()){//sysj\orchestrator.sysj line: 155, column: 4
                        conveyorStatus_in.setACK(false);//sysj\orchestrator.sysj line: 155, column: 4
                        ends[9]=2;
                        ;//sysj\orchestrator.sysj line: 155, column: 4
                        conveyorStatusUIE.setPresent();//sysj\orchestrator.sysj line: 156, column: 4
                        currsigs.addElement(conveyorStatusUIE);
                        conveyorStatusUIE.setValue(false);//sysj\orchestrator.sysj line: 156, column: 4
                        res_thread_9 = (String)(conveyorStatus_in.getVal() == null ? null : ((String)conveyorStatus_in.getVal()));//sysj\orchestrator.sysj line: 157, column: 4
                        recConveyorStatus_1.setPresent();//sysj\orchestrator.sysj line: 158, column: 4
                        currsigs.addElement(recConveyorStatus_1);
                        recConveyorStatus_1.setValue(res_thread_9);//sysj\orchestrator.sysj line: 158, column: 4
                        S43436=0;
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
                S43487=1;
                S43487=0;
                if(!conveyorStatus_in.isPartnerPresent() || conveyorStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 155, column: 4
                  conveyorStatus_in.setACK(false);//sysj\orchestrator.sysj line: 155, column: 4
                  S43487=1;
                  active[9]=1;
                  ends[9]=1;
                  tdone[9]=1;
                }
                else {
                  S43482=0;
                  if(!conveyorStatus_in.isREQ()){//sysj\orchestrator.sysj line: 155, column: 4
                    conveyorStatus_in.setACK(true);//sysj\orchestrator.sysj line: 155, column: 4
                    S43482=1;
                    if(conveyorStatus_in.isREQ()){//sysj\orchestrator.sysj line: 155, column: 4
                      conveyorStatus_in.setACK(false);//sysj\orchestrator.sysj line: 155, column: 4
                      ends[9]=2;
                      ;//sysj\orchestrator.sysj line: 155, column: 4
                      conveyorStatusUIE.setPresent();//sysj\orchestrator.sysj line: 156, column: 4
                      currsigs.addElement(conveyorStatusUIE);
                      conveyorStatusUIE.setValue(false);//sysj\orchestrator.sysj line: 156, column: 4
                      res_thread_9 = (String)(conveyorStatus_in.getVal() == null ? null : ((String)conveyorStatus_in.getVal()));//sysj\orchestrator.sysj line: 157, column: 4
                      recConveyorStatus_1.setPresent();//sysj\orchestrator.sysj line: 158, column: 4
                      currsigs.addElement(recConveyorStatus_1);
                      recConveyorStatus_1.setValue(res_thread_9);//sysj\orchestrator.sysj line: 158, column: 4
                      S43436=0;
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

  public void thread49816(int [] tdone, int [] ends){
        S43394=1;
    foundCurrentOrder_1.setPresent();//sysj\orchestrator.sysj line: 140, column: 9
    currsigs.addElement(foundCurrentOrder_1);
    active[8]=1;
    ends[8]=1;
    tdone[8]=1;
  }

  public void thread49815(int [] tdone, int [] ends){
        S43389=1;
    myOrder_thread_7 = (currentOrder_1.getpreval() == null ? null : ((Order)currentOrder_1.getpreval()));//sysj\orchestrator.sysj line: 137, column: 9
    currentOrder_1.setPresent();//sysj\orchestrator.sysj line: 138, column: 8
    currsigs.addElement(currentOrder_1);
    currentOrder_1.setValue(myOrder_thread_7);//sysj\orchestrator.sysj line: 138, column: 8
    active[7]=1;
    ends[7]=1;
    tdone[7]=1;
  }

  public void thread49813(int [] tdone, int [] ends){
        switch(S43394){
      case 0 : 
        active[8]=0;
        ends[8]=0;
        tdone[8]=1;
        break;
      
      case 1 : 
        foundCurrentOrder_1.setPresent();//sysj\orchestrator.sysj line: 140, column: 9
        currsigs.addElement(foundCurrentOrder_1);
        active[8]=1;
        ends[8]=1;
        tdone[8]=1;
        break;
      
    }
  }

  public void thread49812(int [] tdone, int [] ends){
        switch(S43389){
      case 0 : 
        active[7]=0;
        ends[7]=0;
        tdone[7]=1;
        break;
      
      case 1 : 
        currentOrder_1.setPresent();//sysj\orchestrator.sysj line: 138, column: 8
        currsigs.addElement(currentOrder_1);
        currentOrder_1.setValue(myOrder_thread_7);//sysj\orchestrator.sysj line: 138, column: 8
        active[7]=1;
        ends[7]=1;
        tdone[7]=1;
        break;
      
    }
  }

  public void thread49811(int [] tdone, int [] ends){
        switch(S43434){
      case 0 : 
        active[6]=0;
        ends[6]=0;
        tdone[6]=1;
        break;
      
      case 1 : 
        switch(S43398){
          case 0 : 
            if(recOrderIsDone_1.getprestatus()){//sysj\orchestrator.sysj line: 136, column: 13
              S43398=1;
              active[6]=1;
              ends[6]=1;
              tdone[6]=1;
            }
            else {
              thread49812(tdone,ends);
              thread49813(tdone,ends);
              int biggest49814 = 0;
              if(ends[7]>=biggest49814){
                biggest49814=ends[7];
              }
              if(ends[8]>=biggest49814){
                biggest49814=ends[8];
              }
              if(biggest49814 == 1){
                active[6]=1;
                ends[6]=1;
                tdone[6]=1;
              }
              //FINXME code
              if(biggest49814 == 0){
                S43398=1;
                active[6]=1;
                ends[6]=1;
                tdone[6]=1;
              }
            }
            break;
          
          case 1 : 
            S43398=1;
            S43398=0;
            if(startOrder_1.getprestatus()){//sysj\orchestrator.sysj line: 133, column: 13
              if(currentOrder_1.getprestatus()){//sysj\orchestrator.sysj line: 134, column: 14
                thread49815(tdone,ends);
                thread49816(tdone,ends);
                int biggest49817 = 0;
                if(ends[7]>=biggest49817){
                  biggest49817=ends[7];
                }
                if(ends[8]>=biggest49817){
                  biggest49817=ends[8];
                }
                if(biggest49817 == 1){
                  active[6]=1;
                  ends[6]=1;
                  tdone[6]=1;
                }
              }
              else {
                S43398=1;
                active[6]=1;
                ends[6]=1;
                tdone[6]=1;
              }
            }
            else {
              S43398=1;
              active[6]=1;
              ends[6]=1;
              tdone[6]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread49810(int [] tdone, int [] ends){
        switch(S43381){
      case 0 : 
        active[5]=0;
        ends[5]=0;
        tdone[5]=1;
        break;
      
      case 1 : 
        switch(S43369){
          case 0 : 
            if(currentOrder_1.getprestatus()){//sysj\orchestrator.sysj line: 122, column: 11
              S43369=1;
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            else {
              initABS_1.setPresent();//sysj\orchestrator.sysj line: 123, column: 6
              currsigs.addElement(initABS_1);
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            break;
          
          case 1 : 
            S43369=1;
            S43369=0;
            initABS_1.setPresent();//sysj\orchestrator.sysj line: 123, column: 6
            currsigs.addElement(initABS_1);
            active[5]=1;
            ends[5]=1;
            tdone[5]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread49808(int [] tdone, int [] ends){
        S38483=1;
    recOrderIsDone_1.setPresent();//sysj\orchestrator.sysj line: 86, column: 12
    currsigs.addElement(recOrderIsDone_1);
    active[4]=1;
    ends[4]=1;
    tdone[4]=1;
  }

  public void thread49807(int [] tdone, int [] ends){
        S38478=1;
    tempOrder_thread_3 = (currentOrder_1.getpreval() == null ? null : ((Order)currentOrder_1.getpreval()));//sysj\orchestrator.sysj line: 80, column: 9
    System.out.println("POS- ORDER IS DONE GONNA SEND DONE STATUS XD");//sysj\orchestrator.sysj line: 82, column: 9
    tempOrder_thread_3.setOrderStatus("Done");//sysj\orchestrator.sysj line: 83, column: 9
    orderStatus.setPresent();//sysj\orchestrator.sysj line: 84, column: 9
    currsigs.addElement(orderStatus);
    orderStatus.setValue(tempOrder_thread_3);//sysj\orchestrator.sysj line: 84, column: 9
    active[3]=1;
    ends[3]=1;
    tdone[3]=1;
  }

  public void thread49805(int [] tdone, int [] ends){
        S38483=1;
    recOrderIsDone_1.setPresent();//sysj\orchestrator.sysj line: 86, column: 12
    currsigs.addElement(recOrderIsDone_1);
    active[4]=1;
    ends[4]=1;
    tdone[4]=1;
  }

  public void thread49804(int [] tdone, int [] ends){
        S38478=1;
    tempOrder_thread_3 = (currentOrder_1.getpreval() == null ? null : ((Order)currentOrder_1.getpreval()));//sysj\orchestrator.sysj line: 80, column: 9
    System.out.println("POS- ORDER IS DONE GONNA SEND DONE STATUS XD");//sysj\orchestrator.sysj line: 82, column: 9
    tempOrder_thread_3.setOrderStatus("Done");//sysj\orchestrator.sysj line: 83, column: 9
    orderStatus.setPresent();//sysj\orchestrator.sysj line: 84, column: 9
    currsigs.addElement(orderStatus);
    orderStatus.setValue(tempOrder_thread_3);//sysj\orchestrator.sysj line: 84, column: 9
    active[3]=1;
    ends[3]=1;
    tdone[3]=1;
  }

  public void thread49802(int [] tdone, int [] ends){
        switch(S38483){
      case 0 : 
        active[4]=0;
        ends[4]=0;
        tdone[4]=1;
        break;
      
      case 1 : 
        recOrderIsDone_1.setPresent();//sysj\orchestrator.sysj line: 86, column: 12
        currsigs.addElement(recOrderIsDone_1);
        active[4]=1;
        ends[4]=1;
        tdone[4]=1;
        break;
      
    }
  }

  public void thread49801(int [] tdone, int [] ends){
        switch(S38478){
      case 0 : 
        active[3]=0;
        ends[3]=0;
        tdone[3]=1;
        break;
      
      case 1 : 
        orderStatus.setPresent();//sysj\orchestrator.sysj line: 84, column: 9
        currsigs.addElement(orderStatus);
        orderStatus.setValue(tempOrder_thread_3);//sysj\orchestrator.sysj line: 84, column: 9
        active[3]=1;
        ends[3]=1;
        tdone[3]=1;
        break;
      
    }
  }

  public void thread49799(int [] tdone, int [] ends){
        S38483=1;
    recOrderIsDone_1.setPresent();//sysj\orchestrator.sysj line: 86, column: 12
    currsigs.addElement(recOrderIsDone_1);
    active[4]=1;
    ends[4]=1;
    tdone[4]=1;
  }

  public void thread49798(int [] tdone, int [] ends){
        S38478=1;
    tempOrder_thread_3 = (currentOrder_1.getpreval() == null ? null : ((Order)currentOrder_1.getpreval()));//sysj\orchestrator.sysj line: 80, column: 9
    System.out.println("POS- ORDER IS DONE GONNA SEND DONE STATUS XD");//sysj\orchestrator.sysj line: 82, column: 9
    tempOrder_thread_3.setOrderStatus("Done");//sysj\orchestrator.sysj line: 83, column: 9
    orderStatus.setPresent();//sysj\orchestrator.sysj line: 84, column: 9
    currsigs.addElement(orderStatus);
    orderStatus.setValue(tempOrder_thread_3);//sysj\orchestrator.sysj line: 84, column: 9
    active[3]=1;
    ends[3]=1;
    tdone[3]=1;
  }

  public void thread49797(int [] tdone, int [] ends){
        switch(S43364){
      case 0 : 
        active[2]=0;
        ends[2]=0;
        tdone[2]=1;
        break;
      
      case 1 : 
        switch(S39247){
          case 0 : 
            if(recOrderStatus.getprestatus()){//sysj\orchestrator.sysj line: 62, column: 12
              System.out.println("orch received: recOrderStatus");//sysj\orchestrator.sysj line: 66, column: 6
              S39247=1;
              if(orderIsDone_1.getprestatus()){//sysj\orchestrator.sysj line: 74, column: 13
                System.out.println("entered order is done");//sysj\orchestrator.sysj line: 75, column: 6
                if(currentOrder_1.getprestatus()){//sysj\orchestrator.sysj line: 76, column: 14
                  System.out.println("entered current order present");//sysj\orchestrator.sysj line: 77, column: 7
                  S38499=0;
                  thread49798(tdone,ends);
                  thread49799(tdone,ends);
                  int biggest49800 = 0;
                  if(ends[3]>=biggest49800){
                    biggest49800=ends[3];
                  }
                  if(ends[4]>=biggest49800){
                    biggest49800=ends[4];
                  }
                  if(biggest49800 == 1){
                    active[2]=1;
                    ends[2]=1;
                    tdone[2]=1;
                  }
                }
                else {
                  S39247=2;
                  active[2]=1;
                  ends[2]=1;
                  tdone[2]=1;
                }
              }
              else {
                S39247=2;
                active[2]=1;
                ends[2]=1;
                tdone[2]=1;
              }
            }
            else {
              orderStatus.setPresent();//sysj\orchestrator.sysj line: 63, column: 7
              currsigs.addElement(orderStatus);
              orderStatus.setValue(tempOrder_thread_2);//sysj\orchestrator.sysj line: 63, column: 7
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            break;
          
          case 1 : 
            switch(S38499){
              case 0 : 
                if(recOrderStatus.getprestatus()){//sysj\orchestrator.sysj line: 78, column: 13
                  System.out.println("initialising next order...");//sysj\orchestrator.sysj line: 90, column: 7
                  S38499=1;
                  if(!fifoQueue_thread_2.isEmpty()){//sysj\orchestrator.sysj line: 91, column: 10
                    nextOrder_thread_2 = (Order)fifoQueue_thread_2.get(0);//sysj\orchestrator.sysj line: 92, column: 8
                    fifoQueue_thread_2.remove(0);//sysj\orchestrator.sysj line: 93, column: 8
                    currentOrder_1.setPresent();//sysj\orchestrator.sysj line: 97, column: 9
                    currsigs.addElement(currentOrder_1);
                    currentOrder_1.setValue(nextOrder_thread_2);//sysj\orchestrator.sysj line: 97, column: 9
                    startOrder_1.setPresent();//sysj\orchestrator.sysj line: 98, column: 9
                    currsigs.addElement(startOrder_1);
                    nextOrder_thread_2.setOrderStatus("Started");//sysj\orchestrator.sysj line: 102, column: 8
                    System.out.println("emitting next orderstatus: started");//sysj\orchestrator.sysj line: 103, column: 8
                    orderStatus.setPresent();//sysj\orchestrator.sysj line: 105, column: 9
                    currsigs.addElement(orderStatus);
                    orderStatus.setValue(nextOrder_thread_2);//sysj\orchestrator.sysj line: 105, column: 9
                    active[2]=1;
                    ends[2]=1;
                    tdone[2]=1;
                  }
                  else {
                    S39247=2;
                    active[2]=1;
                    ends[2]=1;
                    tdone[2]=1;
                  }
                }
                else {
                  thread49801(tdone,ends);
                  thread49802(tdone,ends);
                  int biggest49803 = 0;
                  if(ends[3]>=biggest49803){
                    biggest49803=ends[3];
                  }
                  if(ends[4]>=biggest49803){
                    biggest49803=ends[4];
                  }
                  if(biggest49803 == 1){
                    active[2]=1;
                    ends[2]=1;
                    tdone[2]=1;
                  }
                  //FINXME code
                  if(biggest49803 == 0){
                    System.out.println("initialising next order...");//sysj\orchestrator.sysj line: 90, column: 7
                    S38499=1;
                    if(!fifoQueue_thread_2.isEmpty()){//sysj\orchestrator.sysj line: 91, column: 10
                      nextOrder_thread_2 = (Order)fifoQueue_thread_2.get(0);//sysj\orchestrator.sysj line: 92, column: 8
                      fifoQueue_thread_2.remove(0);//sysj\orchestrator.sysj line: 93, column: 8
                      currentOrder_1.setPresent();//sysj\orchestrator.sysj line: 97, column: 9
                      currsigs.addElement(currentOrder_1);
                      currentOrder_1.setValue(nextOrder_thread_2);//sysj\orchestrator.sysj line: 97, column: 9
                      startOrder_1.setPresent();//sysj\orchestrator.sysj line: 98, column: 9
                      currsigs.addElement(startOrder_1);
                      nextOrder_thread_2.setOrderStatus("Started");//sysj\orchestrator.sysj line: 102, column: 8
                      System.out.println("emitting next orderstatus: started");//sysj\orchestrator.sysj line: 103, column: 8
                      orderStatus.setPresent();//sysj\orchestrator.sysj line: 105, column: 9
                      currsigs.addElement(orderStatus);
                      orderStatus.setValue(nextOrder_thread_2);//sysj\orchestrator.sysj line: 105, column: 9
                      active[2]=1;
                      ends[2]=1;
                      tdone[2]=1;
                    }
                    else {
                      S39247=2;
                      active[2]=1;
                      ends[2]=1;
                      tdone[2]=1;
                    }
                  }
                }
                break;
              
              case 1 : 
                if(recOrderStatus.getprestatus()){//sysj\orchestrator.sysj line: 104, column: 14
                  S39247=2;
                  active[2]=1;
                  ends[2]=1;
                  tdone[2]=1;
                }
                else {
                  orderStatus.setPresent();//sysj\orchestrator.sysj line: 105, column: 9
                  currsigs.addElement(orderStatus);
                  orderStatus.setValue(nextOrder_thread_2);//sysj\orchestrator.sysj line: 105, column: 9
                  active[2]=1;
                  ends[2]=1;
                  tdone[2]=1;
                }
                break;
              
            }
            break;
          
          case 2 : 
            S39247=2;
            S39247=0;
            if(order.getprestatus()){//sysj\orchestrator.sysj line: 35, column: 13
              System.out.println("got order!");//sysj\orchestrator.sysj line: 36, column: 5
              newOrder_thread_2 = (order.getpreval() == null ? null : ((Order)order.getpreval()));//sysj\orchestrator.sysj line: 37, column: 5
              System.out.println(newOrder_thread_2.getQuantity());//sysj\orchestrator.sysj line: 38, column: 5
              fifoQueue_thread_2.add(newOrder_thread_2);//sysj\orchestrator.sysj line: 40, column: 5
              if(initABS_1.getprestatus()){//sysj\orchestrator.sysj line: 43, column: 13
                System.out.println("start of ABS get first item");//sysj\orchestrator.sysj line: 44, column: 6
                tempOrder_thread_2 = (Order)fifoQueue_thread_2.get(0);//sysj\orchestrator.sysj line: 45, column: 6
                fifoQueue_thread_2.remove(0);//sysj\orchestrator.sysj line: 48, column: 6
                System.out.println(newOrder_thread_2.getCustomerID());//sysj\orchestrator.sysj line: 49, column: 6
                currentOrder_1.setPresent();//sysj\orchestrator.sysj line: 53, column: 7
                currsigs.addElement(currentOrder_1);
                currentOrder_1.setValue(tempOrder_thread_2);//sysj\orchestrator.sysj line: 53, column: 7
                startOrder_1.setPresent();//sysj\orchestrator.sysj line: 54, column: 7
                currsigs.addElement(startOrder_1);
                tempOrder_thread_2.setOrderStatus("Started");//sysj\orchestrator.sysj line: 59, column: 6
                System.out.println("emitting orderstatus: started");//sysj\orchestrator.sysj line: 60, column: 6
                orderStatus.setPresent();//sysj\orchestrator.sysj line: 63, column: 7
                currsigs.addElement(orderStatus);
                orderStatus.setValue(tempOrder_thread_2);//sysj\orchestrator.sysj line: 63, column: 7
                active[2]=1;
                ends[2]=1;
                tdone[2]=1;
              }
              else {
                S39247=1;
                if(orderIsDone_1.getprestatus()){//sysj\orchestrator.sysj line: 74, column: 13
                  System.out.println("entered order is done");//sysj\orchestrator.sysj line: 75, column: 6
                  if(currentOrder_1.getprestatus()){//sysj\orchestrator.sysj line: 76, column: 14
                    System.out.println("entered current order present");//sysj\orchestrator.sysj line: 77, column: 7
                    S38499=0;
                    thread49804(tdone,ends);
                    thread49805(tdone,ends);
                    int biggest49806 = 0;
                    if(ends[3]>=biggest49806){
                      biggest49806=ends[3];
                    }
                    if(ends[4]>=biggest49806){
                      biggest49806=ends[4];
                    }
                    if(biggest49806 == 1){
                      active[2]=1;
                      ends[2]=1;
                      tdone[2]=1;
                    }
                  }
                  else {
                    S39247=2;
                    active[2]=1;
                    ends[2]=1;
                    tdone[2]=1;
                  }
                }
                else {
                  S39247=2;
                  active[2]=1;
                  ends[2]=1;
                  tdone[2]=1;
                }
              }
            }
            else {
              S39247=1;
              if(orderIsDone_1.getprestatus()){//sysj\orchestrator.sysj line: 74, column: 13
                System.out.println("entered order is done");//sysj\orchestrator.sysj line: 75, column: 6
                if(currentOrder_1.getprestatus()){//sysj\orchestrator.sysj line: 76, column: 14
                  System.out.println("entered current order present");//sysj\orchestrator.sysj line: 77, column: 7
                  S38499=0;
                  thread49807(tdone,ends);
                  thread49808(tdone,ends);
                  int biggest49809 = 0;
                  if(ends[3]>=biggest49809){
                    biggest49809=ends[3];
                  }
                  if(ends[4]>=biggest49809){
                    biggest49809=ends[4];
                  }
                  if(biggest49809 == 1){
                    active[2]=1;
                    ends[2]=1;
                    tdone[2]=1;
                  }
                }
                else {
                  S39247=2;
                  active[2]=1;
                  ends[2]=1;
                  tdone[2]=1;
                }
              }
              else {
                S39247=2;
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

  public void thread49795(int [] tdone, int [] ends){
        S49774=1;
    quantity_thread_14 = 0;//sysj\orchestrator.sysj line: 214, column: 3
    count_thread_14 = 0;//sysj\orchestrator.sysj line: 215, column: 3
    eject_thread_14 = 0;//sysj\orchestrator.sysj line: 216, column: 3
        S48137=0;
    active[14]=1;
    ends[14]=1;
    tdone[14]=1;
  }

  public void thread49794(int [] tdone, int [] ends){
        S48134=1;
    S47196=0;
    active[13]=1;
    ends[13]=1;
    tdone[13]=1;
  }

  public void thread49793(int [] tdone, int [] ends){
        S47194=1;
    S46256=0;
    active[12]=1;
    ends[12]=1;
    tdone[12]=1;
  }

  public void thread49792(int [] tdone, int [] ends){
        S46254=1;
    S45316=0;
    active[11]=1;
    ends[11]=1;
    tdone[11]=1;
  }

  public void thread49791(int [] tdone, int [] ends){
        S45314=1;
    S44376=0;
    active[10]=1;
    ends[10]=1;
    tdone[10]=1;
  }

  public void thread49790(int [] tdone, int [] ends){
        S44374=1;
    S43436=0;
    active[9]=1;
    ends[9]=1;
    tdone[9]=1;
  }

  public void thread49788(int [] tdone, int [] ends){
        S43394=1;
    foundCurrentOrder_1.setPresent();//sysj\orchestrator.sysj line: 140, column: 9
    currsigs.addElement(foundCurrentOrder_1);
    active[8]=1;
    ends[8]=1;
    tdone[8]=1;
  }

  public void thread49787(int [] tdone, int [] ends){
        S43389=1;
    myOrder_thread_7 = (currentOrder_1.getpreval() == null ? null : ((Order)currentOrder_1.getpreval()));//sysj\orchestrator.sysj line: 137, column: 9
    currentOrder_1.setPresent();//sysj\orchestrator.sysj line: 138, column: 8
    currsigs.addElement(currentOrder_1);
    currentOrder_1.setValue(myOrder_thread_7);//sysj\orchestrator.sysj line: 138, column: 8
    active[7]=1;
    ends[7]=1;
    tdone[7]=1;
  }

  public void thread49786(int [] tdone, int [] ends){
        S43434=1;
    S43398=0;
    if(startOrder_1.getprestatus()){//sysj\orchestrator.sysj line: 133, column: 13
      if(currentOrder_1.getprestatus()){//sysj\orchestrator.sysj line: 134, column: 14
        thread49787(tdone,ends);
        thread49788(tdone,ends);
        int biggest49789 = 0;
        if(ends[7]>=biggest49789){
          biggest49789=ends[7];
        }
        if(ends[8]>=biggest49789){
          biggest49789=ends[8];
        }
        if(biggest49789 == 1){
          active[6]=1;
          ends[6]=1;
          tdone[6]=1;
        }
      }
      else {
        S43398=1;
        active[6]=1;
        ends[6]=1;
        tdone[6]=1;
      }
    }
    else {
      S43398=1;
      active[6]=1;
      ends[6]=1;
      tdone[6]=1;
    }
  }

  public void thread49785(int [] tdone, int [] ends){
        S43381=1;
    S43369=0;
    initABS_1.setPresent();//sysj\orchestrator.sysj line: 123, column: 6
    currsigs.addElement(initABS_1);
    active[5]=1;
    ends[5]=1;
    tdone[5]=1;
  }

  public void thread49783(int [] tdone, int [] ends){
        S38483=1;
    recOrderIsDone_1.setPresent();//sysj\orchestrator.sysj line: 86, column: 12
    currsigs.addElement(recOrderIsDone_1);
    active[4]=1;
    ends[4]=1;
    tdone[4]=1;
  }

  public void thread49782(int [] tdone, int [] ends){
        S38478=1;
    tempOrder_thread_3 = (currentOrder_1.getpreval() == null ? null : ((Order)currentOrder_1.getpreval()));//sysj\orchestrator.sysj line: 80, column: 9
    System.out.println("POS- ORDER IS DONE GONNA SEND DONE STATUS XD");//sysj\orchestrator.sysj line: 82, column: 9
    tempOrder_thread_3.setOrderStatus("Done");//sysj\orchestrator.sysj line: 83, column: 9
    orderStatus.setPresent();//sysj\orchestrator.sysj line: 84, column: 9
    currsigs.addElement(orderStatus);
    orderStatus.setValue(tempOrder_thread_3);//sysj\orchestrator.sysj line: 84, column: 9
    active[3]=1;
    ends[3]=1;
    tdone[3]=1;
  }

  public void thread49780(int [] tdone, int [] ends){
        S38483=1;
    recOrderIsDone_1.setPresent();//sysj\orchestrator.sysj line: 86, column: 12
    currsigs.addElement(recOrderIsDone_1);
    active[4]=1;
    ends[4]=1;
    tdone[4]=1;
  }

  public void thread49779(int [] tdone, int [] ends){
        S38478=1;
    tempOrder_thread_3 = (currentOrder_1.getpreval() == null ? null : ((Order)currentOrder_1.getpreval()));//sysj\orchestrator.sysj line: 80, column: 9
    System.out.println("POS- ORDER IS DONE GONNA SEND DONE STATUS XD");//sysj\orchestrator.sysj line: 82, column: 9
    tempOrder_thread_3.setOrderStatus("Done");//sysj\orchestrator.sysj line: 83, column: 9
    orderStatus.setPresent();//sysj\orchestrator.sysj line: 84, column: 9
    currsigs.addElement(orderStatus);
    orderStatus.setValue(tempOrder_thread_3);//sysj\orchestrator.sysj line: 84, column: 9
    active[3]=1;
    ends[3]=1;
    tdone[3]=1;
  }

  public void thread49778(int [] tdone, int [] ends){
        S43364=1;
    fifoQueue_thread_2 = new ArrayList();//sysj\orchestrator.sysj line: 29, column: 3
    S39247=0;
    if(order.getprestatus()){//sysj\orchestrator.sysj line: 35, column: 13
      System.out.println("got order!");//sysj\orchestrator.sysj line: 36, column: 5
      newOrder_thread_2 = (order.getpreval() == null ? null : ((Order)order.getpreval()));//sysj\orchestrator.sysj line: 37, column: 5
      System.out.println(newOrder_thread_2.getQuantity());//sysj\orchestrator.sysj line: 38, column: 5
      fifoQueue_thread_2.add(newOrder_thread_2);//sysj\orchestrator.sysj line: 40, column: 5
      if(initABS_1.getprestatus()){//sysj\orchestrator.sysj line: 43, column: 13
        System.out.println("start of ABS get first item");//sysj\orchestrator.sysj line: 44, column: 6
        tempOrder_thread_2 = (Order)fifoQueue_thread_2.get(0);//sysj\orchestrator.sysj line: 45, column: 6
        fifoQueue_thread_2.remove(0);//sysj\orchestrator.sysj line: 48, column: 6
        System.out.println(newOrder_thread_2.getCustomerID());//sysj\orchestrator.sysj line: 49, column: 6
        currentOrder_1.setPresent();//sysj\orchestrator.sysj line: 53, column: 7
        currsigs.addElement(currentOrder_1);
        currentOrder_1.setValue(tempOrder_thread_2);//sysj\orchestrator.sysj line: 53, column: 7
        startOrder_1.setPresent();//sysj\orchestrator.sysj line: 54, column: 7
        currsigs.addElement(startOrder_1);
        tempOrder_thread_2.setOrderStatus("Started");//sysj\orchestrator.sysj line: 59, column: 6
        System.out.println("emitting orderstatus: started");//sysj\orchestrator.sysj line: 60, column: 6
        orderStatus.setPresent();//sysj\orchestrator.sysj line: 63, column: 7
        currsigs.addElement(orderStatus);
        orderStatus.setValue(tempOrder_thread_2);//sysj\orchestrator.sysj line: 63, column: 7
        active[2]=1;
        ends[2]=1;
        tdone[2]=1;
      }
      else {
        S39247=1;
        if(orderIsDone_1.getprestatus()){//sysj\orchestrator.sysj line: 74, column: 13
          System.out.println("entered order is done");//sysj\orchestrator.sysj line: 75, column: 6
          if(currentOrder_1.getprestatus()){//sysj\orchestrator.sysj line: 76, column: 14
            System.out.println("entered current order present");//sysj\orchestrator.sysj line: 77, column: 7
            S38499=0;
            thread49779(tdone,ends);
            thread49780(tdone,ends);
            int biggest49781 = 0;
            if(ends[3]>=biggest49781){
              biggest49781=ends[3];
            }
            if(ends[4]>=biggest49781){
              biggest49781=ends[4];
            }
            if(biggest49781 == 1){
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
          }
          else {
            S39247=2;
            active[2]=1;
            ends[2]=1;
            tdone[2]=1;
          }
        }
        else {
          S39247=2;
          active[2]=1;
          ends[2]=1;
          tdone[2]=1;
        }
      }
    }
    else {
      S39247=1;
      if(orderIsDone_1.getprestatus()){//sysj\orchestrator.sysj line: 74, column: 13
        System.out.println("entered order is done");//sysj\orchestrator.sysj line: 75, column: 6
        if(currentOrder_1.getprestatus()){//sysj\orchestrator.sysj line: 76, column: 14
          System.out.println("entered current order present");//sysj\orchestrator.sysj line: 77, column: 7
          S38499=0;
          thread49782(tdone,ends);
          thread49783(tdone,ends);
          int biggest49784 = 0;
          if(ends[3]>=biggest49784){
            biggest49784=ends[3];
          }
          if(ends[4]>=biggest49784){
            biggest49784=ends[4];
          }
          if(biggest49784 == 1){
            active[2]=1;
            ends[2]=1;
            tdone[2]=1;
          }
        }
        else {
          S39247=2;
          active[2]=1;
          ends[2]=1;
          tdone[2]=1;
        }
      }
      else {
        S39247=2;
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
      switch(S49776){
        case 0 : 
          S49776=0;
          break RUN;
        
        case 1 : 
          S49776=2;
          S49776=2;
          sigConveyorReq_1.setClear();//sysj\orchestrator.sysj line: 15, column: 2
          sigCapperReq_1.setClear();//sysj\orchestrator.sysj line: 15, column: 2
          sigCapLoaderReq_1.setClear();//sysj\orchestrator.sysj line: 15, column: 2
          sigRotaryReq_1.setClear();//sysj\orchestrator.sysj line: 15, column: 2
          sigFillerReq_1.setClear();//sysj\orchestrator.sysj line: 16, column: 2
          recConveyorStatus_1.setClear();//sysj\orchestrator.sysj line: 17, column: 2
          recCapperStatus_1.setClear();//sysj\orchestrator.sysj line: 17, column: 2
          recCapLoaderStatus_1.setClear();//sysj\orchestrator.sysj line: 17, column: 2
          recFillerStatus_1.setClear();//sysj\orchestrator.sysj line: 17, column: 2
          recRotaryStatus_1.setClear();//sysj\orchestrator.sysj line: 17, column: 2
          getNextBottle_1.setClear();//sysj\orchestrator.sysj line: 18, column: 2
          startOrder_1.setClear();//sysj\orchestrator.sysj line: 21, column: 2
          orderIsDone_1.setClear();//sysj\orchestrator.sysj line: 22, column: 2
          initABS_1.setClear();//sysj\orchestrator.sysj line: 23, column: 2
          foundCurrentOrder_1.setClear();//sysj\orchestrator.sysj line: 24, column: 2
          currentOrder_1.setClear();//sysj\orchestrator.sysj line: 25, column: 2
          recOrderIsDone_1.setClear();//sysj\orchestrator.sysj line: 26, column: 2
          thread49778(tdone,ends);
          thread49785(tdone,ends);
          thread49786(tdone,ends);
          thread49790(tdone,ends);
          thread49791(tdone,ends);
          thread49792(tdone,ends);
          thread49793(tdone,ends);
          thread49794(tdone,ends);
          thread49795(tdone,ends);
          int biggest49796 = 0;
          if(ends[2]>=biggest49796){
            biggest49796=ends[2];
          }
          if(ends[5]>=biggest49796){
            biggest49796=ends[5];
          }
          if(ends[6]>=biggest49796){
            biggest49796=ends[6];
          }
          if(ends[9]>=biggest49796){
            biggest49796=ends[9];
          }
          if(ends[10]>=biggest49796){
            biggest49796=ends[10];
          }
          if(ends[11]>=biggest49796){
            biggest49796=ends[11];
          }
          if(ends[12]>=biggest49796){
            biggest49796=ends[12];
          }
          if(ends[13]>=biggest49796){
            biggest49796=ends[13];
          }
          if(ends[14]>=biggest49796){
            biggest49796=ends[14];
          }
          if(biggest49796 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
        
        case 2 : 
          sigConveyorReq_1.setClear();//sysj\orchestrator.sysj line: 15, column: 2
          sigCapperReq_1.setClear();//sysj\orchestrator.sysj line: 15, column: 2
          sigCapLoaderReq_1.setClear();//sysj\orchestrator.sysj line: 15, column: 2
          sigRotaryReq_1.setClear();//sysj\orchestrator.sysj line: 15, column: 2
          sigFillerReq_1.setClear();//sysj\orchestrator.sysj line: 16, column: 2
          recConveyorStatus_1.setClear();//sysj\orchestrator.sysj line: 17, column: 2
          recCapperStatus_1.setClear();//sysj\orchestrator.sysj line: 17, column: 2
          recCapLoaderStatus_1.setClear();//sysj\orchestrator.sysj line: 17, column: 2
          recFillerStatus_1.setClear();//sysj\orchestrator.sysj line: 17, column: 2
          recRotaryStatus_1.setClear();//sysj\orchestrator.sysj line: 17, column: 2
          getNextBottle_1.setClear();//sysj\orchestrator.sysj line: 18, column: 2
          startOrder_1.setClear();//sysj\orchestrator.sysj line: 21, column: 2
          orderIsDone_1.setClear();//sysj\orchestrator.sysj line: 22, column: 2
          initABS_1.setClear();//sysj\orchestrator.sysj line: 23, column: 2
          foundCurrentOrder_1.setClear();//sysj\orchestrator.sysj line: 24, column: 2
          currentOrder_1.setClear();//sysj\orchestrator.sysj line: 25, column: 2
          recOrderIsDone_1.setClear();//sysj\orchestrator.sysj line: 26, column: 2
          thread49797(tdone,ends);
          thread49810(tdone,ends);
          thread49811(tdone,ends);
          thread49818(tdone,ends);
          thread49819(tdone,ends);
          thread49820(tdone,ends);
          thread49821(tdone,ends);
          thread49822(tdone,ends);
          thread49823(tdone,ends);
          int biggest49836 = 0;
          if(ends[2]>=biggest49836){
            biggest49836=ends[2];
          }
          if(ends[5]>=biggest49836){
            biggest49836=ends[5];
          }
          if(ends[6]>=biggest49836){
            biggest49836=ends[6];
          }
          if(ends[9]>=biggest49836){
            biggest49836=ends[9];
          }
          if(ends[10]>=biggest49836){
            biggest49836=ends[10];
          }
          if(ends[11]>=biggest49836){
            biggest49836=ends[11];
          }
          if(ends[12]>=biggest49836){
            biggest49836=ends[12];
          }
          if(ends[13]>=biggest49836){
            biggest49836=ends[13];
          }
          if(ends[14]>=biggest49836){
            biggest49836=ends[14];
          }
          if(biggest49836 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
          //FINXME code
          if(biggest49836 == 0){
            S49776=0;
            active[1]=0;
            ends[1]=0;
            S49776=0;
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
