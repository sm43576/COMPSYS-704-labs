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
  private ArrayList fifoQueue_thread_2;//sysj\orchestrator.sysj line: 25, column: 3
  private int quantity_thread_10;//sysj\orchestrator.sysj line: 200, column: 3
  private int count_thread_10;//sysj\orchestrator.sysj line: 201, column: 3
  private int eject_thread_10;//sysj\orchestrator.sysj line: 202, column: 3
  private ArrayList liquidPercent_thread_10;//sysj\orchestrator.sysj line: 203, column: 3
  private Order nextOrder_thread_2;//sysj\orchestrator.sysj line: 81, column: 8
  private Order newOrder_thread_2;//sysj\orchestrator.sysj line: 33, column: 6
  private Order tempOrder_thread_2;//sysj\orchestrator.sysj line: 41, column: 7
  private Order myOrder_thread_4;//sysj\orchestrator.sysj line: 124, column: 7
  private String res_thread_5;//sysj\orchestrator.sysj line: 143, column: 4
  private String res_thread_6;//sysj\orchestrator.sysj line: 155, column: 4
  private String res_thread_7;//sysj\orchestrator.sysj line: 168, column: 4
  private ArrayList req_thread_8;//sysj\orchestrator.sysj line: 177, column: 4
  private String res_thread_8;//sysj\orchestrator.sysj line: 181, column: 4
  private String res_thread_9;//sysj\orchestrator.sysj line: 193, column: 4
  private Order order_thread_10;//sysj\orchestrator.sysj line: 208, column: 4
  private int S47636 = 1;
  private int S41347 = 1;
  private int S38910 = 1;
  private int S38478 = 1;
  private int S41364 = 1;
  private int S41352 = 1;
  private int S41390 = 1;
  private int S42330 = 1;
  private int S41436 = 1;
  private int S41398 = 1;
  private int S41393 = 1;
  private int S41443 = 1;
  private int S41438 = 1;
  private int S43270 = 1;
  private int S42332 = 1;
  private int S42339 = 1;
  private int S42334 = 1;
  private int S42383 = 1;
  private int S42378 = 1;
  private int S44210 = 1;
  private int S43272 = 1;
  private int S43279 = 1;
  private int S43274 = 1;
  private int S43323 = 1;
  private int S43318 = 1;
  private int S45150 = 1;
  private int S44212 = 1;
  private int S44219 = 1;
  private int S44214 = 1;
  private int S44263 = 1;
  private int S44258 = 1;
  private int S46090 = 1;
  private int S45152 = 1;
  private int S45159 = 1;
  private int S45154 = 1;
  private int S45203 = 1;
  private int S45198 = 1;
  private int S47634 = 1;
  private int S46093 = 1;
  private int S46098 = 1;
  private int S46101 = 1;
  private int S46104 = 1;
  private int S46107 = 1;
  private int S46117 = 1;
  private int S46294 = 1;
  
  private int[] ends = new int[14];
  private int[] tdone = new int[14];
  
  public void thread47667(int [] tdone, int [] ends){
        S46107=1;
    active[13]=1;
    ends[13]=1;
    tdone[13]=1;
  }

  public void thread47666(int [] tdone, int [] ends){
        S46104=1;
    active[12]=1;
    ends[12]=1;
    tdone[12]=1;
  }

  public void thread47665(int [] tdone, int [] ends){
        S46101=1;
    active[11]=1;
    ends[11]=1;
    tdone[11]=1;
  }

  public void thread47663(int [] tdone, int [] ends){
        switch(S46107){
      case 0 : 
        active[13]=0;
        ends[13]=0;
        tdone[13]=1;
        break;
      
      case 1 : 
        if(recCapperStatus_1.getprestatus()){//sysj\orchestrator.sysj line: 230, column: 73
          S46107=0;
          active[13]=0;
          ends[13]=0;
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

  public void thread47662(int [] tdone, int [] ends){
        switch(S46104){
      case 0 : 
        active[12]=0;
        ends[12]=0;
        tdone[12]=1;
        break;
      
      case 1 : 
        if(recCapLoaderStatus_1.getprestatus()){//sysj\orchestrator.sysj line: 230, column: 41
          S46104=0;
          active[12]=0;
          ends[12]=0;
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

  public void thread47661(int [] tdone, int [] ends){
        switch(S46101){
      case 0 : 
        active[11]=0;
        ends[11]=0;
        tdone[11]=1;
        break;
      
      case 1 : 
        if(recFillerStatus_1.getprestatus()){//sysj\orchestrator.sysj line: 230, column: 12
          S46101=0;
          active[11]=0;
          ends[11]=0;
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

  public void thread47659(int [] tdone, int [] ends){
        S46107=1;
    active[13]=1;
    ends[13]=1;
    tdone[13]=1;
  }

  public void thread47658(int [] tdone, int [] ends){
        S46104=1;
    active[12]=1;
    ends[12]=1;
    tdone[12]=1;
  }

  public void thread47657(int [] tdone, int [] ends){
        S46101=1;
    active[11]=1;
    ends[11]=1;
    tdone[11]=1;
  }

  public void thread47656(int [] tdone, int [] ends){
        switch(S47634){
      case 0 : 
        active[10]=0;
        ends[10]=0;
        tdone[10]=1;
        break;
      
      case 1 : 
        switch(S46093){
          case 0 : 
            if(currentOrder_1.getprestatus()){//sysj\orchestrator.sysj line: 207, column: 10
              order_thread_10 = (currentOrder_1.getpreval() == null ? null : ((Order)currentOrder_1.getpreval()));//sysj\orchestrator.sysj line: 208, column: 4
              quantity_thread_10 = order_thread_10.getQuantity();//sysj\orchestrator.sysj line: 209, column: 4
              count_thread_10 = quantity_thread_10;//sysj\orchestrator.sysj line: 210, column: 4
              liquidPercent_thread_10 = order_thread_10.getLiquidPercentageArray();//sysj\orchestrator.sysj line: 211, column: 4
              System.out.println("Orch: Loading first bottle...");//sysj\orchestrator.sysj line: 213, column: 4
              sigConveyorReq_1.setPresent();//sysj\orchestrator.sysj line: 214, column: 4
              currsigs.addElement(sigConveyorReq_1);
              sigConveyorReq_1.setValue(true);//sysj\orchestrator.sysj line: 214, column: 4
              S46093=1;
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
          
          case 1 : 
            if(recConveyorStatus_1.getprestatus()){//sysj\orchestrator.sysj line: 215, column: 10
              System.out.println("Orch: First bottle loaded.");//sysj\orchestrator.sysj line: 216, column: 4
              sigRotaryReq_1.setPresent();//sysj\orchestrator.sysj line: 217, column: 4
              currsigs.addElement(sigRotaryReq_1);
              S46093=2;
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
          
          case 2 : 
            if(recRotaryStatus_1.getprestatus()){//sysj\orchestrator.sysj line: 218, column: 10
              S46093=3;
              if(count_thread_10 >= 0){//sysj\orchestrator.sysj line: 220, column: 10
                if(count_thread_10 == 0) {//sysj\orchestrator.sysj line: 222, column: 21
                  System.out.println("Orch: Last bottle. Preparing to send requests..");//sysj\orchestrator.sysj line: 223, column: 6
                }
                else {//sysj\orchestrator.sysj line: 224, column: 12
                  System.out.println("Orch: Bottle count " + count_thread_10 + ". Preparing to send requests..");//sysj\orchestrator.sysj line: 225, column: 6
                }
                sigFillerReq_1.setPresent();//sysj\orchestrator.sysj line: 227, column: 5
                currsigs.addElement(sigFillerReq_1);
                sigFillerReq_1.setValue(liquidPercent_thread_10);//sysj\orchestrator.sysj line: 227, column: 5
                sigCapLoaderReq_1.setPresent();//sysj\orchestrator.sysj line: 228, column: 5
                currsigs.addElement(sigCapLoaderReq_1);
                sigCapperReq_1.setPresent();//sysj\orchestrator.sysj line: 229, column: 5
                currsigs.addElement(sigCapperReq_1);
                S46098=0;
                thread47657(tdone,ends);
                thread47658(tdone,ends);
                thread47659(tdone,ends);
                int biggest47660 = 0;
                if(ends[11]>=biggest47660){
                  biggest47660=ends[11];
                }
                if(ends[12]>=biggest47660){
                  biggest47660=ends[12];
                }
                if(ends[13]>=biggest47660){
                  biggest47660=ends[13];
                }
                if(biggest47660 == 1){
                  active[10]=1;
                  ends[10]=1;
                  tdone[10]=1;
                }
              }
              else {
                ends[10]=2;
                ;//sysj\orchestrator.sysj line: 220, column: 4
                System.out.println("Ejecting all bottles");//sysj\orchestrator.sysj line: 250, column: 4
                if(quantity_thread_10 >= 5) {//sysj\orchestrator.sysj line: 252, column: 23
                  eject_thread_10 = 5;//sysj\orchestrator.sysj line: 253, column: 5
                }
                else {//sysj\orchestrator.sysj line: 254, column: 11
                  eject_thread_10 = quantity_thread_10;//sysj\orchestrator.sysj line: 255, column: 5
                }
                S46093=4;
                if(eject_thread_10 >= 0){//sysj\orchestrator.sysj line: 259, column: 11
                  sigRotaryReq_1.setPresent();//sysj\orchestrator.sysj line: 260, column: 5
                  currsigs.addElement(sigRotaryReq_1);
                  S46294=0;
                  active[10]=1;
                  ends[10]=1;
                  tdone[10]=1;
                }
                else {
                  ends[10]=2;
                  ;//sysj\orchestrator.sysj line: 259, column: 4
                  orderIsDone_1.setPresent();//sysj\orchestrator.sysj line: 267, column: 4
                  currsigs.addElement(orderIsDone_1);
                  System.out.println("Orch: Order complete.");//sysj\orchestrator.sysj line: 268, column: 4
                  S46093=5;
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
          
          case 3 : 
            switch(S46098){
              case 0 : 
                thread47661(tdone,ends);
                thread47662(tdone,ends);
                thread47663(tdone,ends);
                int biggest47664 = 0;
                if(ends[11]>=biggest47664){
                  biggest47664=ends[11];
                }
                if(ends[12]>=biggest47664){
                  biggest47664=ends[12];
                }
                if(ends[13]>=biggest47664){
                  biggest47664=ends[13];
                }
                if(biggest47664 == 1){
                  active[10]=1;
                  ends[10]=1;
                  tdone[10]=1;
                }
                //FINXME code
                if(biggest47664 == 0){
                  System.out.println("Orch: All done!");//sysj\orchestrator.sysj line: 231, column: 5
                  count_thread_10 = count_thread_10 - 1;//sysj\orchestrator.sysj line: 233, column: 5
                  S46098=1;
                  if(count_thread_10 >= 0){//sysj\orchestrator.sysj line: 235, column: 9
                    System.out.println("Orch: Loading next bottle...");//sysj\orchestrator.sysj line: 237, column: 6
                    sigConveyorReq_1.setPresent();//sysj\orchestrator.sysj line: 238, column: 6
                    currsigs.addElement(sigConveyorReq_1);
                    sigConveyorReq_1.setValue(true);//sysj\orchestrator.sysj line: 238, column: 6
                    S46117=0;
                    active[10]=1;
                    ends[10]=1;
                    tdone[10]=1;
                  }
                  else {
                    S46098=2;
                    active[10]=1;
                    ends[10]=1;
                    tdone[10]=1;
                  }
                }
                break;
              
              case 1 : 
                switch(S46117){
                  case 0 : 
                    if(recConveyorStatus_1.getprestatus()){//sysj\orchestrator.sysj line: 239, column: 12
                      System.out.println("Orch: Loaded new bottle.");//sysj\orchestrator.sysj line: 240, column: 6
                      sigRotaryReq_1.setPresent();//sysj\orchestrator.sysj line: 243, column: 6
                      currsigs.addElement(sigRotaryReq_1);
                      S46117=1;
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
                  
                  case 1 : 
                    if(recRotaryStatus_1.getprestatus()){//sysj\orchestrator.sysj line: 244, column: 12
                      S46098=2;
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
                break;
              
              case 2 : 
                S46098=2;
                if(count_thread_10 >= 0){//sysj\orchestrator.sysj line: 220, column: 10
                  if(count_thread_10 == 0) {//sysj\orchestrator.sysj line: 222, column: 21
                    System.out.println("Orch: Last bottle. Preparing to send requests..");//sysj\orchestrator.sysj line: 223, column: 6
                  }
                  else {//sysj\orchestrator.sysj line: 224, column: 12
                    System.out.println("Orch: Bottle count " + count_thread_10 + ". Preparing to send requests..");//sysj\orchestrator.sysj line: 225, column: 6
                  }
                  sigFillerReq_1.setPresent();//sysj\orchestrator.sysj line: 227, column: 5
                  currsigs.addElement(sigFillerReq_1);
                  sigFillerReq_1.setValue(liquidPercent_thread_10);//sysj\orchestrator.sysj line: 227, column: 5
                  sigCapLoaderReq_1.setPresent();//sysj\orchestrator.sysj line: 228, column: 5
                  currsigs.addElement(sigCapLoaderReq_1);
                  sigCapperReq_1.setPresent();//sysj\orchestrator.sysj line: 229, column: 5
                  currsigs.addElement(sigCapperReq_1);
                  S46098=0;
                  thread47665(tdone,ends);
                  thread47666(tdone,ends);
                  thread47667(tdone,ends);
                  int biggest47668 = 0;
                  if(ends[11]>=biggest47668){
                    biggest47668=ends[11];
                  }
                  if(ends[12]>=biggest47668){
                    biggest47668=ends[12];
                  }
                  if(ends[13]>=biggest47668){
                    biggest47668=ends[13];
                  }
                  if(biggest47668 == 1){
                    active[10]=1;
                    ends[10]=1;
                    tdone[10]=1;
                  }
                }
                else {
                  ends[10]=2;
                  ;//sysj\orchestrator.sysj line: 220, column: 4
                  System.out.println("Ejecting all bottles");//sysj\orchestrator.sysj line: 250, column: 4
                  if(quantity_thread_10 >= 5) {//sysj\orchestrator.sysj line: 252, column: 23
                    eject_thread_10 = 5;//sysj\orchestrator.sysj line: 253, column: 5
                  }
                  else {//sysj\orchestrator.sysj line: 254, column: 11
                    eject_thread_10 = quantity_thread_10;//sysj\orchestrator.sysj line: 255, column: 5
                  }
                  S46093=4;
                  if(eject_thread_10 >= 0){//sysj\orchestrator.sysj line: 259, column: 11
                    sigRotaryReq_1.setPresent();//sysj\orchestrator.sysj line: 260, column: 5
                    currsigs.addElement(sigRotaryReq_1);
                    S46294=0;
                    active[10]=1;
                    ends[10]=1;
                    tdone[10]=1;
                  }
                  else {
                    ends[10]=2;
                    ;//sysj\orchestrator.sysj line: 259, column: 4
                    orderIsDone_1.setPresent();//sysj\orchestrator.sysj line: 267, column: 4
                    currsigs.addElement(orderIsDone_1);
                    System.out.println("Orch: Order complete.");//sysj\orchestrator.sysj line: 268, column: 4
                    S46093=5;
                    active[10]=1;
                    ends[10]=1;
                    tdone[10]=1;
                  }
                }
                break;
              
            }
            break;
          
          case 4 : 
            switch(S46294){
              case 0 : 
                if(recRotaryStatus_1.getprestatus()){//sysj\orchestrator.sysj line: 261, column: 11
                  sigConveyorReq_1.setPresent();//sysj\orchestrator.sysj line: 262, column: 5
                  currsigs.addElement(sigConveyorReq_1);
                  S46294=1;
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
              
              case 1 : 
                if(recConveyorStatus_1.getprestatus()){//sysj\orchestrator.sysj line: 263, column: 11
                  eject_thread_10 = eject_thread_10 - 1;//sysj\orchestrator.sysj line: 264, column: 5
                  if(eject_thread_10 >= 0){//sysj\orchestrator.sysj line: 259, column: 11
                    sigRotaryReq_1.setPresent();//sysj\orchestrator.sysj line: 260, column: 5
                    currsigs.addElement(sigRotaryReq_1);
                    S46294=0;
                    active[10]=1;
                    ends[10]=1;
                    tdone[10]=1;
                  }
                  else {
                    ends[10]=2;
                    ;//sysj\orchestrator.sysj line: 259, column: 4
                    orderIsDone_1.setPresent();//sysj\orchestrator.sysj line: 267, column: 4
                    currsigs.addElement(orderIsDone_1);
                    System.out.println("Orch: Order complete.");//sysj\orchestrator.sysj line: 268, column: 4
                    S46093=5;
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
              
            }
            break;
          
          case 5 : 
            S46093=5;
            S46093=0;
            active[10]=1;
            ends[10]=1;
            tdone[10]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread47655(int [] tdone, int [] ends){
        switch(S46090){
      case 0 : 
        active[9]=0;
        ends[9]=0;
        tdone[9]=1;
        break;
      
      case 1 : 
        switch(S45152){
          case 0 : 
            if(sigRotaryReq_1.getprestatus()){//sysj\orchestrator.sysj line: 188, column: 10
              System.out.println("Orch: Sending rotary request");//sysj\orchestrator.sysj line: 189, column: 4
              S45152=1;
              S45159=0;
              if(!rotaryReq_o.isPartnerPresent() || rotaryReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 190, column: 4
                rotaryReq_o.setREQ(false);//sysj\orchestrator.sysj line: 190, column: 4
                S45159=1;
                active[9]=1;
                ends[9]=1;
                tdone[9]=1;
              }
              else {
                S45154=0;
                if(rotaryReq_o.isACK()){//sysj\orchestrator.sysj line: 190, column: 4
                  rotaryReq_o.setVal(true);//sysj\orchestrator.sysj line: 190, column: 4
                  S45154=1;
                  if(!rotaryReq_o.isACK()){//sysj\orchestrator.sysj line: 190, column: 4
                    rotaryReq_o.setREQ(false);//sysj\orchestrator.sysj line: 190, column: 4
                    ends[9]=2;
                    ;//sysj\orchestrator.sysj line: 190, column: 4
                    S45152=2;
                    S45203=0;
                    if(!rotaryStatus_in.isPartnerPresent() || rotaryStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 191, column: 4
                      rotaryStatus_in.setACK(false);//sysj\orchestrator.sysj line: 191, column: 4
                      S45203=1;
                      active[9]=1;
                      ends[9]=1;
                      tdone[9]=1;
                    }
                    else {
                      S45198=0;
                      if(!rotaryStatus_in.isREQ()){//sysj\orchestrator.sysj line: 191, column: 4
                        rotaryStatus_in.setACK(true);//sysj\orchestrator.sysj line: 191, column: 4
                        S45198=1;
                        if(rotaryStatus_in.isREQ()){//sysj\orchestrator.sysj line: 191, column: 4
                          rotaryStatus_in.setACK(false);//sysj\orchestrator.sysj line: 191, column: 4
                          ends[9]=2;
                          ;//sysj\orchestrator.sysj line: 191, column: 4
                          System.out.println("Orch: Received rotary status");//sysj\orchestrator.sysj line: 192, column: 4
                          res_thread_9 = (String)(rotaryStatus_in.getVal() == null ? null : ((String)rotaryStatus_in.getVal()));//sysj\orchestrator.sysj line: 193, column: 4
                          recRotaryStatus_1.setPresent();//sysj\orchestrator.sysj line: 194, column: 4
                          currsigs.addElement(recRotaryStatus_1);
                          recRotaryStatus_1.setValue(res_thread_9);//sysj\orchestrator.sysj line: 194, column: 4
                          S45152=0;
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
            switch(S45159){
              case 0 : 
                if(!rotaryReq_o.isPartnerPresent() || rotaryReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 190, column: 4
                  rotaryReq_o.setREQ(false);//sysj\orchestrator.sysj line: 190, column: 4
                  S45159=1;
                  active[9]=1;
                  ends[9]=1;
                  tdone[9]=1;
                }
                else {
                  switch(S45154){
                    case 0 : 
                      if(rotaryReq_o.isACK()){//sysj\orchestrator.sysj line: 190, column: 4
                        rotaryReq_o.setVal(true);//sysj\orchestrator.sysj line: 190, column: 4
                        S45154=1;
                        if(!rotaryReq_o.isACK()){//sysj\orchestrator.sysj line: 190, column: 4
                          rotaryReq_o.setREQ(false);//sysj\orchestrator.sysj line: 190, column: 4
                          ends[9]=2;
                          ;//sysj\orchestrator.sysj line: 190, column: 4
                          S45152=2;
                          S45203=0;
                          if(!rotaryStatus_in.isPartnerPresent() || rotaryStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 191, column: 4
                            rotaryStatus_in.setACK(false);//sysj\orchestrator.sysj line: 191, column: 4
                            S45203=1;
                            active[9]=1;
                            ends[9]=1;
                            tdone[9]=1;
                          }
                          else {
                            S45198=0;
                            if(!rotaryStatus_in.isREQ()){//sysj\orchestrator.sysj line: 191, column: 4
                              rotaryStatus_in.setACK(true);//sysj\orchestrator.sysj line: 191, column: 4
                              S45198=1;
                              if(rotaryStatus_in.isREQ()){//sysj\orchestrator.sysj line: 191, column: 4
                                rotaryStatus_in.setACK(false);//sysj\orchestrator.sysj line: 191, column: 4
                                ends[9]=2;
                                ;//sysj\orchestrator.sysj line: 191, column: 4
                                System.out.println("Orch: Received rotary status");//sysj\orchestrator.sysj line: 192, column: 4
                                res_thread_9 = (String)(rotaryStatus_in.getVal() == null ? null : ((String)rotaryStatus_in.getVal()));//sysj\orchestrator.sysj line: 193, column: 4
                                recRotaryStatus_1.setPresent();//sysj\orchestrator.sysj line: 194, column: 4
                                currsigs.addElement(recRotaryStatus_1);
                                recRotaryStatus_1.setValue(res_thread_9);//sysj\orchestrator.sysj line: 194, column: 4
                                S45152=0;
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
                      if(!rotaryReq_o.isACK()){//sysj\orchestrator.sysj line: 190, column: 4
                        rotaryReq_o.setREQ(false);//sysj\orchestrator.sysj line: 190, column: 4
                        ends[9]=2;
                        ;//sysj\orchestrator.sysj line: 190, column: 4
                        S45152=2;
                        S45203=0;
                        if(!rotaryStatus_in.isPartnerPresent() || rotaryStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 191, column: 4
                          rotaryStatus_in.setACK(false);//sysj\orchestrator.sysj line: 191, column: 4
                          S45203=1;
                          active[9]=1;
                          ends[9]=1;
                          tdone[9]=1;
                        }
                        else {
                          S45198=0;
                          if(!rotaryStatus_in.isREQ()){//sysj\orchestrator.sysj line: 191, column: 4
                            rotaryStatus_in.setACK(true);//sysj\orchestrator.sysj line: 191, column: 4
                            S45198=1;
                            if(rotaryStatus_in.isREQ()){//sysj\orchestrator.sysj line: 191, column: 4
                              rotaryStatus_in.setACK(false);//sysj\orchestrator.sysj line: 191, column: 4
                              ends[9]=2;
                              ;//sysj\orchestrator.sysj line: 191, column: 4
                              System.out.println("Orch: Received rotary status");//sysj\orchestrator.sysj line: 192, column: 4
                              res_thread_9 = (String)(rotaryStatus_in.getVal() == null ? null : ((String)rotaryStatus_in.getVal()));//sysj\orchestrator.sysj line: 193, column: 4
                              recRotaryStatus_1.setPresent();//sysj\orchestrator.sysj line: 194, column: 4
                              currsigs.addElement(recRotaryStatus_1);
                              recRotaryStatus_1.setValue(res_thread_9);//sysj\orchestrator.sysj line: 194, column: 4
                              S45152=0;
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
                S45159=1;
                S45159=0;
                if(!rotaryReq_o.isPartnerPresent() || rotaryReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 190, column: 4
                  rotaryReq_o.setREQ(false);//sysj\orchestrator.sysj line: 190, column: 4
                  S45159=1;
                  active[9]=1;
                  ends[9]=1;
                  tdone[9]=1;
                }
                else {
                  S45154=0;
                  if(rotaryReq_o.isACK()){//sysj\orchestrator.sysj line: 190, column: 4
                    rotaryReq_o.setVal(true);//sysj\orchestrator.sysj line: 190, column: 4
                    S45154=1;
                    if(!rotaryReq_o.isACK()){//sysj\orchestrator.sysj line: 190, column: 4
                      rotaryReq_o.setREQ(false);//sysj\orchestrator.sysj line: 190, column: 4
                      ends[9]=2;
                      ;//sysj\orchestrator.sysj line: 190, column: 4
                      S45152=2;
                      S45203=0;
                      if(!rotaryStatus_in.isPartnerPresent() || rotaryStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 191, column: 4
                        rotaryStatus_in.setACK(false);//sysj\orchestrator.sysj line: 191, column: 4
                        S45203=1;
                        active[9]=1;
                        ends[9]=1;
                        tdone[9]=1;
                      }
                      else {
                        S45198=0;
                        if(!rotaryStatus_in.isREQ()){//sysj\orchestrator.sysj line: 191, column: 4
                          rotaryStatus_in.setACK(true);//sysj\orchestrator.sysj line: 191, column: 4
                          S45198=1;
                          if(rotaryStatus_in.isREQ()){//sysj\orchestrator.sysj line: 191, column: 4
                            rotaryStatus_in.setACK(false);//sysj\orchestrator.sysj line: 191, column: 4
                            ends[9]=2;
                            ;//sysj\orchestrator.sysj line: 191, column: 4
                            System.out.println("Orch: Received rotary status");//sysj\orchestrator.sysj line: 192, column: 4
                            res_thread_9 = (String)(rotaryStatus_in.getVal() == null ? null : ((String)rotaryStatus_in.getVal()));//sysj\orchestrator.sysj line: 193, column: 4
                            recRotaryStatus_1.setPresent();//sysj\orchestrator.sysj line: 194, column: 4
                            currsigs.addElement(recRotaryStatus_1);
                            recRotaryStatus_1.setValue(res_thread_9);//sysj\orchestrator.sysj line: 194, column: 4
                            S45152=0;
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
            switch(S45203){
              case 0 : 
                if(!rotaryStatus_in.isPartnerPresent() || rotaryStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 191, column: 4
                  rotaryStatus_in.setACK(false);//sysj\orchestrator.sysj line: 191, column: 4
                  S45203=1;
                  active[9]=1;
                  ends[9]=1;
                  tdone[9]=1;
                }
                else {
                  switch(S45198){
                    case 0 : 
                      if(!rotaryStatus_in.isREQ()){//sysj\orchestrator.sysj line: 191, column: 4
                        rotaryStatus_in.setACK(true);//sysj\orchestrator.sysj line: 191, column: 4
                        S45198=1;
                        if(rotaryStatus_in.isREQ()){//sysj\orchestrator.sysj line: 191, column: 4
                          rotaryStatus_in.setACK(false);//sysj\orchestrator.sysj line: 191, column: 4
                          ends[9]=2;
                          ;//sysj\orchestrator.sysj line: 191, column: 4
                          System.out.println("Orch: Received rotary status");//sysj\orchestrator.sysj line: 192, column: 4
                          res_thread_9 = (String)(rotaryStatus_in.getVal() == null ? null : ((String)rotaryStatus_in.getVal()));//sysj\orchestrator.sysj line: 193, column: 4
                          recRotaryStatus_1.setPresent();//sysj\orchestrator.sysj line: 194, column: 4
                          currsigs.addElement(recRotaryStatus_1);
                          recRotaryStatus_1.setValue(res_thread_9);//sysj\orchestrator.sysj line: 194, column: 4
                          S45152=0;
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
                      if(rotaryStatus_in.isREQ()){//sysj\orchestrator.sysj line: 191, column: 4
                        rotaryStatus_in.setACK(false);//sysj\orchestrator.sysj line: 191, column: 4
                        ends[9]=2;
                        ;//sysj\orchestrator.sysj line: 191, column: 4
                        System.out.println("Orch: Received rotary status");//sysj\orchestrator.sysj line: 192, column: 4
                        res_thread_9 = (String)(rotaryStatus_in.getVal() == null ? null : ((String)rotaryStatus_in.getVal()));//sysj\orchestrator.sysj line: 193, column: 4
                        recRotaryStatus_1.setPresent();//sysj\orchestrator.sysj line: 194, column: 4
                        currsigs.addElement(recRotaryStatus_1);
                        recRotaryStatus_1.setValue(res_thread_9);//sysj\orchestrator.sysj line: 194, column: 4
                        S45152=0;
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
                S45203=1;
                S45203=0;
                if(!rotaryStatus_in.isPartnerPresent() || rotaryStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 191, column: 4
                  rotaryStatus_in.setACK(false);//sysj\orchestrator.sysj line: 191, column: 4
                  S45203=1;
                  active[9]=1;
                  ends[9]=1;
                  tdone[9]=1;
                }
                else {
                  S45198=0;
                  if(!rotaryStatus_in.isREQ()){//sysj\orchestrator.sysj line: 191, column: 4
                    rotaryStatus_in.setACK(true);//sysj\orchestrator.sysj line: 191, column: 4
                    S45198=1;
                    if(rotaryStatus_in.isREQ()){//sysj\orchestrator.sysj line: 191, column: 4
                      rotaryStatus_in.setACK(false);//sysj\orchestrator.sysj line: 191, column: 4
                      ends[9]=2;
                      ;//sysj\orchestrator.sysj line: 191, column: 4
                      System.out.println("Orch: Received rotary status");//sysj\orchestrator.sysj line: 192, column: 4
                      res_thread_9 = (String)(rotaryStatus_in.getVal() == null ? null : ((String)rotaryStatus_in.getVal()));//sysj\orchestrator.sysj line: 193, column: 4
                      recRotaryStatus_1.setPresent();//sysj\orchestrator.sysj line: 194, column: 4
                      currsigs.addElement(recRotaryStatus_1);
                      recRotaryStatus_1.setValue(res_thread_9);//sysj\orchestrator.sysj line: 194, column: 4
                      S45152=0;
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

  public void thread47654(int [] tdone, int [] ends){
        switch(S45150){
      case 0 : 
        active[8]=0;
        ends[8]=0;
        tdone[8]=1;
        break;
      
      case 1 : 
        switch(S44212){
          case 0 : 
            if(sigFillerReq_1.getprestatus()){//sysj\orchestrator.sysj line: 175, column: 10
              System.out.println("Orch: Sending filler request");//sysj\orchestrator.sysj line: 176, column: 4
              req_thread_8 = (ArrayList)(sigFillerReq_1.getpreval() == null ? null : ((ArrayList)sigFillerReq_1.getpreval()));//sysj\orchestrator.sysj line: 177, column: 4
              S44212=1;
              S44219=0;
              if(!fillerReq_o.isPartnerPresent() || fillerReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 178, column: 4
                fillerReq_o.setREQ(false);//sysj\orchestrator.sysj line: 178, column: 4
                S44219=1;
                active[8]=1;
                ends[8]=1;
                tdone[8]=1;
              }
              else {
                S44214=0;
                if(fillerReq_o.isACK()){//sysj\orchestrator.sysj line: 178, column: 4
                  fillerReq_o.setVal(req_thread_8);//sysj\orchestrator.sysj line: 178, column: 4
                  S44214=1;
                  if(!fillerReq_o.isACK()){//sysj\orchestrator.sysj line: 178, column: 4
                    fillerReq_o.setREQ(false);//sysj\orchestrator.sysj line: 178, column: 4
                    ends[8]=2;
                    ;//sysj\orchestrator.sysj line: 178, column: 4
                    S44212=2;
                    S44263=0;
                    if(!fillerStatus_in.isPartnerPresent() || fillerStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 179, column: 4
                      fillerStatus_in.setACK(false);//sysj\orchestrator.sysj line: 179, column: 4
                      S44263=1;
                      active[8]=1;
                      ends[8]=1;
                      tdone[8]=1;
                    }
                    else {
                      S44258=0;
                      if(!fillerStatus_in.isREQ()){//sysj\orchestrator.sysj line: 179, column: 4
                        fillerStatus_in.setACK(true);//sysj\orchestrator.sysj line: 179, column: 4
                        S44258=1;
                        if(fillerStatus_in.isREQ()){//sysj\orchestrator.sysj line: 179, column: 4
                          fillerStatus_in.setACK(false);//sysj\orchestrator.sysj line: 179, column: 4
                          ends[8]=2;
                          ;//sysj\orchestrator.sysj line: 179, column: 4
                          System.out.println("Orch: Received filler status");//sysj\orchestrator.sysj line: 180, column: 4
                          res_thread_8 = (String)(fillerStatus_in.getVal() == null ? null : ((String)fillerStatus_in.getVal()));//sysj\orchestrator.sysj line: 181, column: 4
                          recFillerStatus_1.setPresent();//sysj\orchestrator.sysj line: 182, column: 4
                          currsigs.addElement(recFillerStatus_1);
                          recFillerStatus_1.setValue(res_thread_8);//sysj\orchestrator.sysj line: 182, column: 4
                          S44212=0;
                          active[8]=1;
                          ends[8]=1;
                          tdone[8]=1;
                        }
                        else {
                          active[8]=1;
                          ends[8]=1;
                          tdone[8]=1;
                        }
                      }
                      else {
                        active[8]=1;
                        ends[8]=1;
                        tdone[8]=1;
                      }
                    }
                  }
                  else {
                    active[8]=1;
                    ends[8]=1;
                    tdone[8]=1;
                  }
                }
                else {
                  active[8]=1;
                  ends[8]=1;
                  tdone[8]=1;
                }
              }
            }
            else {
              active[8]=1;
              ends[8]=1;
              tdone[8]=1;
            }
            break;
          
          case 1 : 
            switch(S44219){
              case 0 : 
                if(!fillerReq_o.isPartnerPresent() || fillerReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 178, column: 4
                  fillerReq_o.setREQ(false);//sysj\orchestrator.sysj line: 178, column: 4
                  S44219=1;
                  active[8]=1;
                  ends[8]=1;
                  tdone[8]=1;
                }
                else {
                  switch(S44214){
                    case 0 : 
                      if(fillerReq_o.isACK()){//sysj\orchestrator.sysj line: 178, column: 4
                        fillerReq_o.setVal(req_thread_8);//sysj\orchestrator.sysj line: 178, column: 4
                        S44214=1;
                        if(!fillerReq_o.isACK()){//sysj\orchestrator.sysj line: 178, column: 4
                          fillerReq_o.setREQ(false);//sysj\orchestrator.sysj line: 178, column: 4
                          ends[8]=2;
                          ;//sysj\orchestrator.sysj line: 178, column: 4
                          S44212=2;
                          S44263=0;
                          if(!fillerStatus_in.isPartnerPresent() || fillerStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 179, column: 4
                            fillerStatus_in.setACK(false);//sysj\orchestrator.sysj line: 179, column: 4
                            S44263=1;
                            active[8]=1;
                            ends[8]=1;
                            tdone[8]=1;
                          }
                          else {
                            S44258=0;
                            if(!fillerStatus_in.isREQ()){//sysj\orchestrator.sysj line: 179, column: 4
                              fillerStatus_in.setACK(true);//sysj\orchestrator.sysj line: 179, column: 4
                              S44258=1;
                              if(fillerStatus_in.isREQ()){//sysj\orchestrator.sysj line: 179, column: 4
                                fillerStatus_in.setACK(false);//sysj\orchestrator.sysj line: 179, column: 4
                                ends[8]=2;
                                ;//sysj\orchestrator.sysj line: 179, column: 4
                                System.out.println("Orch: Received filler status");//sysj\orchestrator.sysj line: 180, column: 4
                                res_thread_8 = (String)(fillerStatus_in.getVal() == null ? null : ((String)fillerStatus_in.getVal()));//sysj\orchestrator.sysj line: 181, column: 4
                                recFillerStatus_1.setPresent();//sysj\orchestrator.sysj line: 182, column: 4
                                currsigs.addElement(recFillerStatus_1);
                                recFillerStatus_1.setValue(res_thread_8);//sysj\orchestrator.sysj line: 182, column: 4
                                S44212=0;
                                active[8]=1;
                                ends[8]=1;
                                tdone[8]=1;
                              }
                              else {
                                active[8]=1;
                                ends[8]=1;
                                tdone[8]=1;
                              }
                            }
                            else {
                              active[8]=1;
                              ends[8]=1;
                              tdone[8]=1;
                            }
                          }
                        }
                        else {
                          active[8]=1;
                          ends[8]=1;
                          tdone[8]=1;
                        }
                      }
                      else {
                        active[8]=1;
                        ends[8]=1;
                        tdone[8]=1;
                      }
                      break;
                    
                    case 1 : 
                      if(!fillerReq_o.isACK()){//sysj\orchestrator.sysj line: 178, column: 4
                        fillerReq_o.setREQ(false);//sysj\orchestrator.sysj line: 178, column: 4
                        ends[8]=2;
                        ;//sysj\orchestrator.sysj line: 178, column: 4
                        S44212=2;
                        S44263=0;
                        if(!fillerStatus_in.isPartnerPresent() || fillerStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 179, column: 4
                          fillerStatus_in.setACK(false);//sysj\orchestrator.sysj line: 179, column: 4
                          S44263=1;
                          active[8]=1;
                          ends[8]=1;
                          tdone[8]=1;
                        }
                        else {
                          S44258=0;
                          if(!fillerStatus_in.isREQ()){//sysj\orchestrator.sysj line: 179, column: 4
                            fillerStatus_in.setACK(true);//sysj\orchestrator.sysj line: 179, column: 4
                            S44258=1;
                            if(fillerStatus_in.isREQ()){//sysj\orchestrator.sysj line: 179, column: 4
                              fillerStatus_in.setACK(false);//sysj\orchestrator.sysj line: 179, column: 4
                              ends[8]=2;
                              ;//sysj\orchestrator.sysj line: 179, column: 4
                              System.out.println("Orch: Received filler status");//sysj\orchestrator.sysj line: 180, column: 4
                              res_thread_8 = (String)(fillerStatus_in.getVal() == null ? null : ((String)fillerStatus_in.getVal()));//sysj\orchestrator.sysj line: 181, column: 4
                              recFillerStatus_1.setPresent();//sysj\orchestrator.sysj line: 182, column: 4
                              currsigs.addElement(recFillerStatus_1);
                              recFillerStatus_1.setValue(res_thread_8);//sysj\orchestrator.sysj line: 182, column: 4
                              S44212=0;
                              active[8]=1;
                              ends[8]=1;
                              tdone[8]=1;
                            }
                            else {
                              active[8]=1;
                              ends[8]=1;
                              tdone[8]=1;
                            }
                          }
                          else {
                            active[8]=1;
                            ends[8]=1;
                            tdone[8]=1;
                          }
                        }
                      }
                      else {
                        active[8]=1;
                        ends[8]=1;
                        tdone[8]=1;
                      }
                      break;
                    
                  }
                }
                break;
              
              case 1 : 
                S44219=1;
                S44219=0;
                if(!fillerReq_o.isPartnerPresent() || fillerReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 178, column: 4
                  fillerReq_o.setREQ(false);//sysj\orchestrator.sysj line: 178, column: 4
                  S44219=1;
                  active[8]=1;
                  ends[8]=1;
                  tdone[8]=1;
                }
                else {
                  S44214=0;
                  if(fillerReq_o.isACK()){//sysj\orchestrator.sysj line: 178, column: 4
                    fillerReq_o.setVal(req_thread_8);//sysj\orchestrator.sysj line: 178, column: 4
                    S44214=1;
                    if(!fillerReq_o.isACK()){//sysj\orchestrator.sysj line: 178, column: 4
                      fillerReq_o.setREQ(false);//sysj\orchestrator.sysj line: 178, column: 4
                      ends[8]=2;
                      ;//sysj\orchestrator.sysj line: 178, column: 4
                      S44212=2;
                      S44263=0;
                      if(!fillerStatus_in.isPartnerPresent() || fillerStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 179, column: 4
                        fillerStatus_in.setACK(false);//sysj\orchestrator.sysj line: 179, column: 4
                        S44263=1;
                        active[8]=1;
                        ends[8]=1;
                        tdone[8]=1;
                      }
                      else {
                        S44258=0;
                        if(!fillerStatus_in.isREQ()){//sysj\orchestrator.sysj line: 179, column: 4
                          fillerStatus_in.setACK(true);//sysj\orchestrator.sysj line: 179, column: 4
                          S44258=1;
                          if(fillerStatus_in.isREQ()){//sysj\orchestrator.sysj line: 179, column: 4
                            fillerStatus_in.setACK(false);//sysj\orchestrator.sysj line: 179, column: 4
                            ends[8]=2;
                            ;//sysj\orchestrator.sysj line: 179, column: 4
                            System.out.println("Orch: Received filler status");//sysj\orchestrator.sysj line: 180, column: 4
                            res_thread_8 = (String)(fillerStatus_in.getVal() == null ? null : ((String)fillerStatus_in.getVal()));//sysj\orchestrator.sysj line: 181, column: 4
                            recFillerStatus_1.setPresent();//sysj\orchestrator.sysj line: 182, column: 4
                            currsigs.addElement(recFillerStatus_1);
                            recFillerStatus_1.setValue(res_thread_8);//sysj\orchestrator.sysj line: 182, column: 4
                            S44212=0;
                            active[8]=1;
                            ends[8]=1;
                            tdone[8]=1;
                          }
                          else {
                            active[8]=1;
                            ends[8]=1;
                            tdone[8]=1;
                          }
                        }
                        else {
                          active[8]=1;
                          ends[8]=1;
                          tdone[8]=1;
                        }
                      }
                    }
                    else {
                      active[8]=1;
                      ends[8]=1;
                      tdone[8]=1;
                    }
                  }
                  else {
                    active[8]=1;
                    ends[8]=1;
                    tdone[8]=1;
                  }
                }
                break;
              
            }
            break;
          
          case 2 : 
            switch(S44263){
              case 0 : 
                if(!fillerStatus_in.isPartnerPresent() || fillerStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 179, column: 4
                  fillerStatus_in.setACK(false);//sysj\orchestrator.sysj line: 179, column: 4
                  S44263=1;
                  active[8]=1;
                  ends[8]=1;
                  tdone[8]=1;
                }
                else {
                  switch(S44258){
                    case 0 : 
                      if(!fillerStatus_in.isREQ()){//sysj\orchestrator.sysj line: 179, column: 4
                        fillerStatus_in.setACK(true);//sysj\orchestrator.sysj line: 179, column: 4
                        S44258=1;
                        if(fillerStatus_in.isREQ()){//sysj\orchestrator.sysj line: 179, column: 4
                          fillerStatus_in.setACK(false);//sysj\orchestrator.sysj line: 179, column: 4
                          ends[8]=2;
                          ;//sysj\orchestrator.sysj line: 179, column: 4
                          System.out.println("Orch: Received filler status");//sysj\orchestrator.sysj line: 180, column: 4
                          res_thread_8 = (String)(fillerStatus_in.getVal() == null ? null : ((String)fillerStatus_in.getVal()));//sysj\orchestrator.sysj line: 181, column: 4
                          recFillerStatus_1.setPresent();//sysj\orchestrator.sysj line: 182, column: 4
                          currsigs.addElement(recFillerStatus_1);
                          recFillerStatus_1.setValue(res_thread_8);//sysj\orchestrator.sysj line: 182, column: 4
                          S44212=0;
                          active[8]=1;
                          ends[8]=1;
                          tdone[8]=1;
                        }
                        else {
                          active[8]=1;
                          ends[8]=1;
                          tdone[8]=1;
                        }
                      }
                      else {
                        active[8]=1;
                        ends[8]=1;
                        tdone[8]=1;
                      }
                      break;
                    
                    case 1 : 
                      if(fillerStatus_in.isREQ()){//sysj\orchestrator.sysj line: 179, column: 4
                        fillerStatus_in.setACK(false);//sysj\orchestrator.sysj line: 179, column: 4
                        ends[8]=2;
                        ;//sysj\orchestrator.sysj line: 179, column: 4
                        System.out.println("Orch: Received filler status");//sysj\orchestrator.sysj line: 180, column: 4
                        res_thread_8 = (String)(fillerStatus_in.getVal() == null ? null : ((String)fillerStatus_in.getVal()));//sysj\orchestrator.sysj line: 181, column: 4
                        recFillerStatus_1.setPresent();//sysj\orchestrator.sysj line: 182, column: 4
                        currsigs.addElement(recFillerStatus_1);
                        recFillerStatus_1.setValue(res_thread_8);//sysj\orchestrator.sysj line: 182, column: 4
                        S44212=0;
                        active[8]=1;
                        ends[8]=1;
                        tdone[8]=1;
                      }
                      else {
                        active[8]=1;
                        ends[8]=1;
                        tdone[8]=1;
                      }
                      break;
                    
                  }
                }
                break;
              
              case 1 : 
                S44263=1;
                S44263=0;
                if(!fillerStatus_in.isPartnerPresent() || fillerStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 179, column: 4
                  fillerStatus_in.setACK(false);//sysj\orchestrator.sysj line: 179, column: 4
                  S44263=1;
                  active[8]=1;
                  ends[8]=1;
                  tdone[8]=1;
                }
                else {
                  S44258=0;
                  if(!fillerStatus_in.isREQ()){//sysj\orchestrator.sysj line: 179, column: 4
                    fillerStatus_in.setACK(true);//sysj\orchestrator.sysj line: 179, column: 4
                    S44258=1;
                    if(fillerStatus_in.isREQ()){//sysj\orchestrator.sysj line: 179, column: 4
                      fillerStatus_in.setACK(false);//sysj\orchestrator.sysj line: 179, column: 4
                      ends[8]=2;
                      ;//sysj\orchestrator.sysj line: 179, column: 4
                      System.out.println("Orch: Received filler status");//sysj\orchestrator.sysj line: 180, column: 4
                      res_thread_8 = (String)(fillerStatus_in.getVal() == null ? null : ((String)fillerStatus_in.getVal()));//sysj\orchestrator.sysj line: 181, column: 4
                      recFillerStatus_1.setPresent();//sysj\orchestrator.sysj line: 182, column: 4
                      currsigs.addElement(recFillerStatus_1);
                      recFillerStatus_1.setValue(res_thread_8);//sysj\orchestrator.sysj line: 182, column: 4
                      S44212=0;
                      active[8]=1;
                      ends[8]=1;
                      tdone[8]=1;
                    }
                    else {
                      active[8]=1;
                      ends[8]=1;
                      tdone[8]=1;
                    }
                  }
                  else {
                    active[8]=1;
                    ends[8]=1;
                    tdone[8]=1;
                  }
                }
                break;
              
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread47653(int [] tdone, int [] ends){
        switch(S44210){
      case 0 : 
        active[7]=0;
        ends[7]=0;
        tdone[7]=1;
        break;
      
      case 1 : 
        switch(S43272){
          case 0 : 
            if(sigCapLoaderReq_1.getprestatus()){//sysj\orchestrator.sysj line: 162, column: 10
              System.out.println("Orch: Sending cap loader request");//sysj\orchestrator.sysj line: 163, column: 4
              S43272=1;
              S43279=0;
              if(!capLoaderReq_o.isPartnerPresent() || capLoaderReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 164, column: 4
                capLoaderReq_o.setREQ(false);//sysj\orchestrator.sysj line: 164, column: 4
                S43279=1;
                active[7]=1;
                ends[7]=1;
                tdone[7]=1;
              }
              else {
                S43274=0;
                if(capLoaderReq_o.isACK()){//sysj\orchestrator.sysj line: 164, column: 4
                  capLoaderReq_o.setVal(true);//sysj\orchestrator.sysj line: 164, column: 4
                  S43274=1;
                  if(!capLoaderReq_o.isACK()){//sysj\orchestrator.sysj line: 164, column: 4
                    capLoaderReq_o.setREQ(false);//sysj\orchestrator.sysj line: 164, column: 4
                    ends[7]=2;
                    ;//sysj\orchestrator.sysj line: 164, column: 4
                    S43272=2;
                    S43323=0;
                    if(!capLoaderStatus_in.isPartnerPresent() || capLoaderStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 165, column: 4
                      capLoaderStatus_in.setACK(false);//sysj\orchestrator.sysj line: 165, column: 4
                      S43323=1;
                      active[7]=1;
                      ends[7]=1;
                      tdone[7]=1;
                    }
                    else {
                      S43318=0;
                      if(!capLoaderStatus_in.isREQ()){//sysj\orchestrator.sysj line: 165, column: 4
                        capLoaderStatus_in.setACK(true);//sysj\orchestrator.sysj line: 165, column: 4
                        S43318=1;
                        if(capLoaderStatus_in.isREQ()){//sysj\orchestrator.sysj line: 165, column: 4
                          capLoaderStatus_in.setACK(false);//sysj\orchestrator.sysj line: 165, column: 4
                          ends[7]=2;
                          ;//sysj\orchestrator.sysj line: 165, column: 4
                          System.out.println("Orch: Received cap loader status");//sysj\orchestrator.sysj line: 166, column: 4
                          res_thread_7 = (String)(capLoaderStatus_in.getVal() == null ? null : ((String)capLoaderStatus_in.getVal()));//sysj\orchestrator.sysj line: 168, column: 4
                          recCapLoaderStatus_1.setPresent();//sysj\orchestrator.sysj line: 169, column: 4
                          currsigs.addElement(recCapLoaderStatus_1);
                          recCapLoaderStatus_1.setValue(res_thread_7);//sysj\orchestrator.sysj line: 169, column: 4
                          S43272=0;
                          active[7]=1;
                          ends[7]=1;
                          tdone[7]=1;
                        }
                        else {
                          active[7]=1;
                          ends[7]=1;
                          tdone[7]=1;
                        }
                      }
                      else {
                        active[7]=1;
                        ends[7]=1;
                        tdone[7]=1;
                      }
                    }
                  }
                  else {
                    active[7]=1;
                    ends[7]=1;
                    tdone[7]=1;
                  }
                }
                else {
                  active[7]=1;
                  ends[7]=1;
                  tdone[7]=1;
                }
              }
            }
            else {
              active[7]=1;
              ends[7]=1;
              tdone[7]=1;
            }
            break;
          
          case 1 : 
            switch(S43279){
              case 0 : 
                if(!capLoaderReq_o.isPartnerPresent() || capLoaderReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 164, column: 4
                  capLoaderReq_o.setREQ(false);//sysj\orchestrator.sysj line: 164, column: 4
                  S43279=1;
                  active[7]=1;
                  ends[7]=1;
                  tdone[7]=1;
                }
                else {
                  switch(S43274){
                    case 0 : 
                      if(capLoaderReq_o.isACK()){//sysj\orchestrator.sysj line: 164, column: 4
                        capLoaderReq_o.setVal(true);//sysj\orchestrator.sysj line: 164, column: 4
                        S43274=1;
                        if(!capLoaderReq_o.isACK()){//sysj\orchestrator.sysj line: 164, column: 4
                          capLoaderReq_o.setREQ(false);//sysj\orchestrator.sysj line: 164, column: 4
                          ends[7]=2;
                          ;//sysj\orchestrator.sysj line: 164, column: 4
                          S43272=2;
                          S43323=0;
                          if(!capLoaderStatus_in.isPartnerPresent() || capLoaderStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 165, column: 4
                            capLoaderStatus_in.setACK(false);//sysj\orchestrator.sysj line: 165, column: 4
                            S43323=1;
                            active[7]=1;
                            ends[7]=1;
                            tdone[7]=1;
                          }
                          else {
                            S43318=0;
                            if(!capLoaderStatus_in.isREQ()){//sysj\orchestrator.sysj line: 165, column: 4
                              capLoaderStatus_in.setACK(true);//sysj\orchestrator.sysj line: 165, column: 4
                              S43318=1;
                              if(capLoaderStatus_in.isREQ()){//sysj\orchestrator.sysj line: 165, column: 4
                                capLoaderStatus_in.setACK(false);//sysj\orchestrator.sysj line: 165, column: 4
                                ends[7]=2;
                                ;//sysj\orchestrator.sysj line: 165, column: 4
                                System.out.println("Orch: Received cap loader status");//sysj\orchestrator.sysj line: 166, column: 4
                                res_thread_7 = (String)(capLoaderStatus_in.getVal() == null ? null : ((String)capLoaderStatus_in.getVal()));//sysj\orchestrator.sysj line: 168, column: 4
                                recCapLoaderStatus_1.setPresent();//sysj\orchestrator.sysj line: 169, column: 4
                                currsigs.addElement(recCapLoaderStatus_1);
                                recCapLoaderStatus_1.setValue(res_thread_7);//sysj\orchestrator.sysj line: 169, column: 4
                                S43272=0;
                                active[7]=1;
                                ends[7]=1;
                                tdone[7]=1;
                              }
                              else {
                                active[7]=1;
                                ends[7]=1;
                                tdone[7]=1;
                              }
                            }
                            else {
                              active[7]=1;
                              ends[7]=1;
                              tdone[7]=1;
                            }
                          }
                        }
                        else {
                          active[7]=1;
                          ends[7]=1;
                          tdone[7]=1;
                        }
                      }
                      else {
                        active[7]=1;
                        ends[7]=1;
                        tdone[7]=1;
                      }
                      break;
                    
                    case 1 : 
                      if(!capLoaderReq_o.isACK()){//sysj\orchestrator.sysj line: 164, column: 4
                        capLoaderReq_o.setREQ(false);//sysj\orchestrator.sysj line: 164, column: 4
                        ends[7]=2;
                        ;//sysj\orchestrator.sysj line: 164, column: 4
                        S43272=2;
                        S43323=0;
                        if(!capLoaderStatus_in.isPartnerPresent() || capLoaderStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 165, column: 4
                          capLoaderStatus_in.setACK(false);//sysj\orchestrator.sysj line: 165, column: 4
                          S43323=1;
                          active[7]=1;
                          ends[7]=1;
                          tdone[7]=1;
                        }
                        else {
                          S43318=0;
                          if(!capLoaderStatus_in.isREQ()){//sysj\orchestrator.sysj line: 165, column: 4
                            capLoaderStatus_in.setACK(true);//sysj\orchestrator.sysj line: 165, column: 4
                            S43318=1;
                            if(capLoaderStatus_in.isREQ()){//sysj\orchestrator.sysj line: 165, column: 4
                              capLoaderStatus_in.setACK(false);//sysj\orchestrator.sysj line: 165, column: 4
                              ends[7]=2;
                              ;//sysj\orchestrator.sysj line: 165, column: 4
                              System.out.println("Orch: Received cap loader status");//sysj\orchestrator.sysj line: 166, column: 4
                              res_thread_7 = (String)(capLoaderStatus_in.getVal() == null ? null : ((String)capLoaderStatus_in.getVal()));//sysj\orchestrator.sysj line: 168, column: 4
                              recCapLoaderStatus_1.setPresent();//sysj\orchestrator.sysj line: 169, column: 4
                              currsigs.addElement(recCapLoaderStatus_1);
                              recCapLoaderStatus_1.setValue(res_thread_7);//sysj\orchestrator.sysj line: 169, column: 4
                              S43272=0;
                              active[7]=1;
                              ends[7]=1;
                              tdone[7]=1;
                            }
                            else {
                              active[7]=1;
                              ends[7]=1;
                              tdone[7]=1;
                            }
                          }
                          else {
                            active[7]=1;
                            ends[7]=1;
                            tdone[7]=1;
                          }
                        }
                      }
                      else {
                        active[7]=1;
                        ends[7]=1;
                        tdone[7]=1;
                      }
                      break;
                    
                  }
                }
                break;
              
              case 1 : 
                S43279=1;
                S43279=0;
                if(!capLoaderReq_o.isPartnerPresent() || capLoaderReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 164, column: 4
                  capLoaderReq_o.setREQ(false);//sysj\orchestrator.sysj line: 164, column: 4
                  S43279=1;
                  active[7]=1;
                  ends[7]=1;
                  tdone[7]=1;
                }
                else {
                  S43274=0;
                  if(capLoaderReq_o.isACK()){//sysj\orchestrator.sysj line: 164, column: 4
                    capLoaderReq_o.setVal(true);//sysj\orchestrator.sysj line: 164, column: 4
                    S43274=1;
                    if(!capLoaderReq_o.isACK()){//sysj\orchestrator.sysj line: 164, column: 4
                      capLoaderReq_o.setREQ(false);//sysj\orchestrator.sysj line: 164, column: 4
                      ends[7]=2;
                      ;//sysj\orchestrator.sysj line: 164, column: 4
                      S43272=2;
                      S43323=0;
                      if(!capLoaderStatus_in.isPartnerPresent() || capLoaderStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 165, column: 4
                        capLoaderStatus_in.setACK(false);//sysj\orchestrator.sysj line: 165, column: 4
                        S43323=1;
                        active[7]=1;
                        ends[7]=1;
                        tdone[7]=1;
                      }
                      else {
                        S43318=0;
                        if(!capLoaderStatus_in.isREQ()){//sysj\orchestrator.sysj line: 165, column: 4
                          capLoaderStatus_in.setACK(true);//sysj\orchestrator.sysj line: 165, column: 4
                          S43318=1;
                          if(capLoaderStatus_in.isREQ()){//sysj\orchestrator.sysj line: 165, column: 4
                            capLoaderStatus_in.setACK(false);//sysj\orchestrator.sysj line: 165, column: 4
                            ends[7]=2;
                            ;//sysj\orchestrator.sysj line: 165, column: 4
                            System.out.println("Orch: Received cap loader status");//sysj\orchestrator.sysj line: 166, column: 4
                            res_thread_7 = (String)(capLoaderStatus_in.getVal() == null ? null : ((String)capLoaderStatus_in.getVal()));//sysj\orchestrator.sysj line: 168, column: 4
                            recCapLoaderStatus_1.setPresent();//sysj\orchestrator.sysj line: 169, column: 4
                            currsigs.addElement(recCapLoaderStatus_1);
                            recCapLoaderStatus_1.setValue(res_thread_7);//sysj\orchestrator.sysj line: 169, column: 4
                            S43272=0;
                            active[7]=1;
                            ends[7]=1;
                            tdone[7]=1;
                          }
                          else {
                            active[7]=1;
                            ends[7]=1;
                            tdone[7]=1;
                          }
                        }
                        else {
                          active[7]=1;
                          ends[7]=1;
                          tdone[7]=1;
                        }
                      }
                    }
                    else {
                      active[7]=1;
                      ends[7]=1;
                      tdone[7]=1;
                    }
                  }
                  else {
                    active[7]=1;
                    ends[7]=1;
                    tdone[7]=1;
                  }
                }
                break;
              
            }
            break;
          
          case 2 : 
            switch(S43323){
              case 0 : 
                if(!capLoaderStatus_in.isPartnerPresent() || capLoaderStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 165, column: 4
                  capLoaderStatus_in.setACK(false);//sysj\orchestrator.sysj line: 165, column: 4
                  S43323=1;
                  active[7]=1;
                  ends[7]=1;
                  tdone[7]=1;
                }
                else {
                  switch(S43318){
                    case 0 : 
                      if(!capLoaderStatus_in.isREQ()){//sysj\orchestrator.sysj line: 165, column: 4
                        capLoaderStatus_in.setACK(true);//sysj\orchestrator.sysj line: 165, column: 4
                        S43318=1;
                        if(capLoaderStatus_in.isREQ()){//sysj\orchestrator.sysj line: 165, column: 4
                          capLoaderStatus_in.setACK(false);//sysj\orchestrator.sysj line: 165, column: 4
                          ends[7]=2;
                          ;//sysj\orchestrator.sysj line: 165, column: 4
                          System.out.println("Orch: Received cap loader status");//sysj\orchestrator.sysj line: 166, column: 4
                          res_thread_7 = (String)(capLoaderStatus_in.getVal() == null ? null : ((String)capLoaderStatus_in.getVal()));//sysj\orchestrator.sysj line: 168, column: 4
                          recCapLoaderStatus_1.setPresent();//sysj\orchestrator.sysj line: 169, column: 4
                          currsigs.addElement(recCapLoaderStatus_1);
                          recCapLoaderStatus_1.setValue(res_thread_7);//sysj\orchestrator.sysj line: 169, column: 4
                          S43272=0;
                          active[7]=1;
                          ends[7]=1;
                          tdone[7]=1;
                        }
                        else {
                          active[7]=1;
                          ends[7]=1;
                          tdone[7]=1;
                        }
                      }
                      else {
                        active[7]=1;
                        ends[7]=1;
                        tdone[7]=1;
                      }
                      break;
                    
                    case 1 : 
                      if(capLoaderStatus_in.isREQ()){//sysj\orchestrator.sysj line: 165, column: 4
                        capLoaderStatus_in.setACK(false);//sysj\orchestrator.sysj line: 165, column: 4
                        ends[7]=2;
                        ;//sysj\orchestrator.sysj line: 165, column: 4
                        System.out.println("Orch: Received cap loader status");//sysj\orchestrator.sysj line: 166, column: 4
                        res_thread_7 = (String)(capLoaderStatus_in.getVal() == null ? null : ((String)capLoaderStatus_in.getVal()));//sysj\orchestrator.sysj line: 168, column: 4
                        recCapLoaderStatus_1.setPresent();//sysj\orchestrator.sysj line: 169, column: 4
                        currsigs.addElement(recCapLoaderStatus_1);
                        recCapLoaderStatus_1.setValue(res_thread_7);//sysj\orchestrator.sysj line: 169, column: 4
                        S43272=0;
                        active[7]=1;
                        ends[7]=1;
                        tdone[7]=1;
                      }
                      else {
                        active[7]=1;
                        ends[7]=1;
                        tdone[7]=1;
                      }
                      break;
                    
                  }
                }
                break;
              
              case 1 : 
                S43323=1;
                S43323=0;
                if(!capLoaderStatus_in.isPartnerPresent() || capLoaderStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 165, column: 4
                  capLoaderStatus_in.setACK(false);//sysj\orchestrator.sysj line: 165, column: 4
                  S43323=1;
                  active[7]=1;
                  ends[7]=1;
                  tdone[7]=1;
                }
                else {
                  S43318=0;
                  if(!capLoaderStatus_in.isREQ()){//sysj\orchestrator.sysj line: 165, column: 4
                    capLoaderStatus_in.setACK(true);//sysj\orchestrator.sysj line: 165, column: 4
                    S43318=1;
                    if(capLoaderStatus_in.isREQ()){//sysj\orchestrator.sysj line: 165, column: 4
                      capLoaderStatus_in.setACK(false);//sysj\orchestrator.sysj line: 165, column: 4
                      ends[7]=2;
                      ;//sysj\orchestrator.sysj line: 165, column: 4
                      System.out.println("Orch: Received cap loader status");//sysj\orchestrator.sysj line: 166, column: 4
                      res_thread_7 = (String)(capLoaderStatus_in.getVal() == null ? null : ((String)capLoaderStatus_in.getVal()));//sysj\orchestrator.sysj line: 168, column: 4
                      recCapLoaderStatus_1.setPresent();//sysj\orchestrator.sysj line: 169, column: 4
                      currsigs.addElement(recCapLoaderStatus_1);
                      recCapLoaderStatus_1.setValue(res_thread_7);//sysj\orchestrator.sysj line: 169, column: 4
                      S43272=0;
                      active[7]=1;
                      ends[7]=1;
                      tdone[7]=1;
                    }
                    else {
                      active[7]=1;
                      ends[7]=1;
                      tdone[7]=1;
                    }
                  }
                  else {
                    active[7]=1;
                    ends[7]=1;
                    tdone[7]=1;
                  }
                }
                break;
              
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread47652(int [] tdone, int [] ends){
        switch(S43270){
      case 0 : 
        active[6]=0;
        ends[6]=0;
        tdone[6]=1;
        break;
      
      case 1 : 
        switch(S42332){
          case 0 : 
            if(sigCapperReq_1.getprestatus()){//sysj\orchestrator.sysj line: 150, column: 10
              System.out.println("Orch: Sending capper request");//sysj\orchestrator.sysj line: 151, column: 4
              S42332=1;
              S42339=0;
              if(!capperReq_o.isPartnerPresent() || capperReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 152, column: 4
                capperReq_o.setREQ(false);//sysj\orchestrator.sysj line: 152, column: 4
                S42339=1;
                active[6]=1;
                ends[6]=1;
                tdone[6]=1;
              }
              else {
                S42334=0;
                if(capperReq_o.isACK()){//sysj\orchestrator.sysj line: 152, column: 4
                  capperReq_o.setVal(true);//sysj\orchestrator.sysj line: 152, column: 4
                  S42334=1;
                  if(!capperReq_o.isACK()){//sysj\orchestrator.sysj line: 152, column: 4
                    capperReq_o.setREQ(false);//sysj\orchestrator.sysj line: 152, column: 4
                    ends[6]=2;
                    ;//sysj\orchestrator.sysj line: 152, column: 4
                    S42332=2;
                    S42383=0;
                    if(!capperStatus_in.isPartnerPresent() || capperStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 153, column: 4
                      capperStatus_in.setACK(false);//sysj\orchestrator.sysj line: 153, column: 4
                      S42383=1;
                      active[6]=1;
                      ends[6]=1;
                      tdone[6]=1;
                    }
                    else {
                      S42378=0;
                      if(!capperStatus_in.isREQ()){//sysj\orchestrator.sysj line: 153, column: 4
                        capperStatus_in.setACK(true);//sysj\orchestrator.sysj line: 153, column: 4
                        S42378=1;
                        if(capperStatus_in.isREQ()){//sysj\orchestrator.sysj line: 153, column: 4
                          capperStatus_in.setACK(false);//sysj\orchestrator.sysj line: 153, column: 4
                          ends[6]=2;
                          ;//sysj\orchestrator.sysj line: 153, column: 4
                          System.out.println("Orch: Received capper status");//sysj\orchestrator.sysj line: 154, column: 4
                          res_thread_6 = (String)(capperStatus_in.getVal() == null ? null : ((String)capperStatus_in.getVal()));//sysj\orchestrator.sysj line: 155, column: 4
                          recCapperStatus_1.setPresent();//sysj\orchestrator.sysj line: 156, column: 4
                          currsigs.addElement(recCapperStatus_1);
                          recCapperStatus_1.setValue(res_thread_6);//sysj\orchestrator.sysj line: 156, column: 4
                          S42332=0;
                          active[6]=1;
                          ends[6]=1;
                          tdone[6]=1;
                        }
                        else {
                          active[6]=1;
                          ends[6]=1;
                          tdone[6]=1;
                        }
                      }
                      else {
                        active[6]=1;
                        ends[6]=1;
                        tdone[6]=1;
                      }
                    }
                  }
                  else {
                    active[6]=1;
                    ends[6]=1;
                    tdone[6]=1;
                  }
                }
                else {
                  active[6]=1;
                  ends[6]=1;
                  tdone[6]=1;
                }
              }
            }
            else {
              active[6]=1;
              ends[6]=1;
              tdone[6]=1;
            }
            break;
          
          case 1 : 
            switch(S42339){
              case 0 : 
                if(!capperReq_o.isPartnerPresent() || capperReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 152, column: 4
                  capperReq_o.setREQ(false);//sysj\orchestrator.sysj line: 152, column: 4
                  S42339=1;
                  active[6]=1;
                  ends[6]=1;
                  tdone[6]=1;
                }
                else {
                  switch(S42334){
                    case 0 : 
                      if(capperReq_o.isACK()){//sysj\orchestrator.sysj line: 152, column: 4
                        capperReq_o.setVal(true);//sysj\orchestrator.sysj line: 152, column: 4
                        S42334=1;
                        if(!capperReq_o.isACK()){//sysj\orchestrator.sysj line: 152, column: 4
                          capperReq_o.setREQ(false);//sysj\orchestrator.sysj line: 152, column: 4
                          ends[6]=2;
                          ;//sysj\orchestrator.sysj line: 152, column: 4
                          S42332=2;
                          S42383=0;
                          if(!capperStatus_in.isPartnerPresent() || capperStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 153, column: 4
                            capperStatus_in.setACK(false);//sysj\orchestrator.sysj line: 153, column: 4
                            S42383=1;
                            active[6]=1;
                            ends[6]=1;
                            tdone[6]=1;
                          }
                          else {
                            S42378=0;
                            if(!capperStatus_in.isREQ()){//sysj\orchestrator.sysj line: 153, column: 4
                              capperStatus_in.setACK(true);//sysj\orchestrator.sysj line: 153, column: 4
                              S42378=1;
                              if(capperStatus_in.isREQ()){//sysj\orchestrator.sysj line: 153, column: 4
                                capperStatus_in.setACK(false);//sysj\orchestrator.sysj line: 153, column: 4
                                ends[6]=2;
                                ;//sysj\orchestrator.sysj line: 153, column: 4
                                System.out.println("Orch: Received capper status");//sysj\orchestrator.sysj line: 154, column: 4
                                res_thread_6 = (String)(capperStatus_in.getVal() == null ? null : ((String)capperStatus_in.getVal()));//sysj\orchestrator.sysj line: 155, column: 4
                                recCapperStatus_1.setPresent();//sysj\orchestrator.sysj line: 156, column: 4
                                currsigs.addElement(recCapperStatus_1);
                                recCapperStatus_1.setValue(res_thread_6);//sysj\orchestrator.sysj line: 156, column: 4
                                S42332=0;
                                active[6]=1;
                                ends[6]=1;
                                tdone[6]=1;
                              }
                              else {
                                active[6]=1;
                                ends[6]=1;
                                tdone[6]=1;
                              }
                            }
                            else {
                              active[6]=1;
                              ends[6]=1;
                              tdone[6]=1;
                            }
                          }
                        }
                        else {
                          active[6]=1;
                          ends[6]=1;
                          tdone[6]=1;
                        }
                      }
                      else {
                        active[6]=1;
                        ends[6]=1;
                        tdone[6]=1;
                      }
                      break;
                    
                    case 1 : 
                      if(!capperReq_o.isACK()){//sysj\orchestrator.sysj line: 152, column: 4
                        capperReq_o.setREQ(false);//sysj\orchestrator.sysj line: 152, column: 4
                        ends[6]=2;
                        ;//sysj\orchestrator.sysj line: 152, column: 4
                        S42332=2;
                        S42383=0;
                        if(!capperStatus_in.isPartnerPresent() || capperStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 153, column: 4
                          capperStatus_in.setACK(false);//sysj\orchestrator.sysj line: 153, column: 4
                          S42383=1;
                          active[6]=1;
                          ends[6]=1;
                          tdone[6]=1;
                        }
                        else {
                          S42378=0;
                          if(!capperStatus_in.isREQ()){//sysj\orchestrator.sysj line: 153, column: 4
                            capperStatus_in.setACK(true);//sysj\orchestrator.sysj line: 153, column: 4
                            S42378=1;
                            if(capperStatus_in.isREQ()){//sysj\orchestrator.sysj line: 153, column: 4
                              capperStatus_in.setACK(false);//sysj\orchestrator.sysj line: 153, column: 4
                              ends[6]=2;
                              ;//sysj\orchestrator.sysj line: 153, column: 4
                              System.out.println("Orch: Received capper status");//sysj\orchestrator.sysj line: 154, column: 4
                              res_thread_6 = (String)(capperStatus_in.getVal() == null ? null : ((String)capperStatus_in.getVal()));//sysj\orchestrator.sysj line: 155, column: 4
                              recCapperStatus_1.setPresent();//sysj\orchestrator.sysj line: 156, column: 4
                              currsigs.addElement(recCapperStatus_1);
                              recCapperStatus_1.setValue(res_thread_6);//sysj\orchestrator.sysj line: 156, column: 4
                              S42332=0;
                              active[6]=1;
                              ends[6]=1;
                              tdone[6]=1;
                            }
                            else {
                              active[6]=1;
                              ends[6]=1;
                              tdone[6]=1;
                            }
                          }
                          else {
                            active[6]=1;
                            ends[6]=1;
                            tdone[6]=1;
                          }
                        }
                      }
                      else {
                        active[6]=1;
                        ends[6]=1;
                        tdone[6]=1;
                      }
                      break;
                    
                  }
                }
                break;
              
              case 1 : 
                S42339=1;
                S42339=0;
                if(!capperReq_o.isPartnerPresent() || capperReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 152, column: 4
                  capperReq_o.setREQ(false);//sysj\orchestrator.sysj line: 152, column: 4
                  S42339=1;
                  active[6]=1;
                  ends[6]=1;
                  tdone[6]=1;
                }
                else {
                  S42334=0;
                  if(capperReq_o.isACK()){//sysj\orchestrator.sysj line: 152, column: 4
                    capperReq_o.setVal(true);//sysj\orchestrator.sysj line: 152, column: 4
                    S42334=1;
                    if(!capperReq_o.isACK()){//sysj\orchestrator.sysj line: 152, column: 4
                      capperReq_o.setREQ(false);//sysj\orchestrator.sysj line: 152, column: 4
                      ends[6]=2;
                      ;//sysj\orchestrator.sysj line: 152, column: 4
                      S42332=2;
                      S42383=0;
                      if(!capperStatus_in.isPartnerPresent() || capperStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 153, column: 4
                        capperStatus_in.setACK(false);//sysj\orchestrator.sysj line: 153, column: 4
                        S42383=1;
                        active[6]=1;
                        ends[6]=1;
                        tdone[6]=1;
                      }
                      else {
                        S42378=0;
                        if(!capperStatus_in.isREQ()){//sysj\orchestrator.sysj line: 153, column: 4
                          capperStatus_in.setACK(true);//sysj\orchestrator.sysj line: 153, column: 4
                          S42378=1;
                          if(capperStatus_in.isREQ()){//sysj\orchestrator.sysj line: 153, column: 4
                            capperStatus_in.setACK(false);//sysj\orchestrator.sysj line: 153, column: 4
                            ends[6]=2;
                            ;//sysj\orchestrator.sysj line: 153, column: 4
                            System.out.println("Orch: Received capper status");//sysj\orchestrator.sysj line: 154, column: 4
                            res_thread_6 = (String)(capperStatus_in.getVal() == null ? null : ((String)capperStatus_in.getVal()));//sysj\orchestrator.sysj line: 155, column: 4
                            recCapperStatus_1.setPresent();//sysj\orchestrator.sysj line: 156, column: 4
                            currsigs.addElement(recCapperStatus_1);
                            recCapperStatus_1.setValue(res_thread_6);//sysj\orchestrator.sysj line: 156, column: 4
                            S42332=0;
                            active[6]=1;
                            ends[6]=1;
                            tdone[6]=1;
                          }
                          else {
                            active[6]=1;
                            ends[6]=1;
                            tdone[6]=1;
                          }
                        }
                        else {
                          active[6]=1;
                          ends[6]=1;
                          tdone[6]=1;
                        }
                      }
                    }
                    else {
                      active[6]=1;
                      ends[6]=1;
                      tdone[6]=1;
                    }
                  }
                  else {
                    active[6]=1;
                    ends[6]=1;
                    tdone[6]=1;
                  }
                }
                break;
              
            }
            break;
          
          case 2 : 
            switch(S42383){
              case 0 : 
                if(!capperStatus_in.isPartnerPresent() || capperStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 153, column: 4
                  capperStatus_in.setACK(false);//sysj\orchestrator.sysj line: 153, column: 4
                  S42383=1;
                  active[6]=1;
                  ends[6]=1;
                  tdone[6]=1;
                }
                else {
                  switch(S42378){
                    case 0 : 
                      if(!capperStatus_in.isREQ()){//sysj\orchestrator.sysj line: 153, column: 4
                        capperStatus_in.setACK(true);//sysj\orchestrator.sysj line: 153, column: 4
                        S42378=1;
                        if(capperStatus_in.isREQ()){//sysj\orchestrator.sysj line: 153, column: 4
                          capperStatus_in.setACK(false);//sysj\orchestrator.sysj line: 153, column: 4
                          ends[6]=2;
                          ;//sysj\orchestrator.sysj line: 153, column: 4
                          System.out.println("Orch: Received capper status");//sysj\orchestrator.sysj line: 154, column: 4
                          res_thread_6 = (String)(capperStatus_in.getVal() == null ? null : ((String)capperStatus_in.getVal()));//sysj\orchestrator.sysj line: 155, column: 4
                          recCapperStatus_1.setPresent();//sysj\orchestrator.sysj line: 156, column: 4
                          currsigs.addElement(recCapperStatus_1);
                          recCapperStatus_1.setValue(res_thread_6);//sysj\orchestrator.sysj line: 156, column: 4
                          S42332=0;
                          active[6]=1;
                          ends[6]=1;
                          tdone[6]=1;
                        }
                        else {
                          active[6]=1;
                          ends[6]=1;
                          tdone[6]=1;
                        }
                      }
                      else {
                        active[6]=1;
                        ends[6]=1;
                        tdone[6]=1;
                      }
                      break;
                    
                    case 1 : 
                      if(capperStatus_in.isREQ()){//sysj\orchestrator.sysj line: 153, column: 4
                        capperStatus_in.setACK(false);//sysj\orchestrator.sysj line: 153, column: 4
                        ends[6]=2;
                        ;//sysj\orchestrator.sysj line: 153, column: 4
                        System.out.println("Orch: Received capper status");//sysj\orchestrator.sysj line: 154, column: 4
                        res_thread_6 = (String)(capperStatus_in.getVal() == null ? null : ((String)capperStatus_in.getVal()));//sysj\orchestrator.sysj line: 155, column: 4
                        recCapperStatus_1.setPresent();//sysj\orchestrator.sysj line: 156, column: 4
                        currsigs.addElement(recCapperStatus_1);
                        recCapperStatus_1.setValue(res_thread_6);//sysj\orchestrator.sysj line: 156, column: 4
                        S42332=0;
                        active[6]=1;
                        ends[6]=1;
                        tdone[6]=1;
                      }
                      else {
                        active[6]=1;
                        ends[6]=1;
                        tdone[6]=1;
                      }
                      break;
                    
                  }
                }
                break;
              
              case 1 : 
                S42383=1;
                S42383=0;
                if(!capperStatus_in.isPartnerPresent() || capperStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 153, column: 4
                  capperStatus_in.setACK(false);//sysj\orchestrator.sysj line: 153, column: 4
                  S42383=1;
                  active[6]=1;
                  ends[6]=1;
                  tdone[6]=1;
                }
                else {
                  S42378=0;
                  if(!capperStatus_in.isREQ()){//sysj\orchestrator.sysj line: 153, column: 4
                    capperStatus_in.setACK(true);//sysj\orchestrator.sysj line: 153, column: 4
                    S42378=1;
                    if(capperStatus_in.isREQ()){//sysj\orchestrator.sysj line: 153, column: 4
                      capperStatus_in.setACK(false);//sysj\orchestrator.sysj line: 153, column: 4
                      ends[6]=2;
                      ;//sysj\orchestrator.sysj line: 153, column: 4
                      System.out.println("Orch: Received capper status");//sysj\orchestrator.sysj line: 154, column: 4
                      res_thread_6 = (String)(capperStatus_in.getVal() == null ? null : ((String)capperStatus_in.getVal()));//sysj\orchestrator.sysj line: 155, column: 4
                      recCapperStatus_1.setPresent();//sysj\orchestrator.sysj line: 156, column: 4
                      currsigs.addElement(recCapperStatus_1);
                      recCapperStatus_1.setValue(res_thread_6);//sysj\orchestrator.sysj line: 156, column: 4
                      S42332=0;
                      active[6]=1;
                      ends[6]=1;
                      tdone[6]=1;
                    }
                    else {
                      active[6]=1;
                      ends[6]=1;
                      tdone[6]=1;
                    }
                  }
                  else {
                    active[6]=1;
                    ends[6]=1;
                    tdone[6]=1;
                  }
                }
                break;
              
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread47651(int [] tdone, int [] ends){
        switch(S42330){
      case 0 : 
        active[5]=0;
        ends[5]=0;
        tdone[5]=1;
        break;
      
      case 1 : 
        switch(S41436){
          case 0 : 
            if(sigConveyorReq_1.getprestatus()){//sysj\orchestrator.sysj line: 140, column: 10
              S41436=1;
              S41398=0;
              if(!conveyorReq_o.isPartnerPresent() || conveyorReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 141, column: 4
                conveyorReq_o.setREQ(false);//sysj\orchestrator.sysj line: 141, column: 4
                S41398=1;
                active[5]=1;
                ends[5]=1;
                tdone[5]=1;
              }
              else {
                S41393=0;
                if(conveyorReq_o.isACK()){//sysj\orchestrator.sysj line: 141, column: 4
                  conveyorReq_o.setVal(true);//sysj\orchestrator.sysj line: 141, column: 4
                  S41393=1;
                  if(!conveyorReq_o.isACK()){//sysj\orchestrator.sysj line: 141, column: 4
                    conveyorReq_o.setREQ(false);//sysj\orchestrator.sysj line: 141, column: 4
                    ends[5]=2;
                    ;//sysj\orchestrator.sysj line: 141, column: 4
                    S41436=2;
                    S41443=0;
                    if(!conveyorStatus_in.isPartnerPresent() || conveyorStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 142, column: 4
                      conveyorStatus_in.setACK(false);//sysj\orchestrator.sysj line: 142, column: 4
                      S41443=1;
                      active[5]=1;
                      ends[5]=1;
                      tdone[5]=1;
                    }
                    else {
                      S41438=0;
                      if(!conveyorStatus_in.isREQ()){//sysj\orchestrator.sysj line: 142, column: 4
                        conveyorStatus_in.setACK(true);//sysj\orchestrator.sysj line: 142, column: 4
                        S41438=1;
                        if(conveyorStatus_in.isREQ()){//sysj\orchestrator.sysj line: 142, column: 4
                          conveyorStatus_in.setACK(false);//sysj\orchestrator.sysj line: 142, column: 4
                          ends[5]=2;
                          ;//sysj\orchestrator.sysj line: 142, column: 4
                          res_thread_5 = (String)(conveyorStatus_in.getVal() == null ? null : ((String)conveyorStatus_in.getVal()));//sysj\orchestrator.sysj line: 143, column: 4
                          recConveyorStatus_1.setPresent();//sysj\orchestrator.sysj line: 144, column: 4
                          currsigs.addElement(recConveyorStatus_1);
                          recConveyorStatus_1.setValue(res_thread_5);//sysj\orchestrator.sysj line: 144, column: 4
                          S41436=0;
                          active[5]=1;
                          ends[5]=1;
                          tdone[5]=1;
                        }
                        else {
                          active[5]=1;
                          ends[5]=1;
                          tdone[5]=1;
                        }
                      }
                      else {
                        active[5]=1;
                        ends[5]=1;
                        tdone[5]=1;
                      }
                    }
                  }
                  else {
                    active[5]=1;
                    ends[5]=1;
                    tdone[5]=1;
                  }
                }
                else {
                  active[5]=1;
                  ends[5]=1;
                  tdone[5]=1;
                }
              }
            }
            else {
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            break;
          
          case 1 : 
            switch(S41398){
              case 0 : 
                if(!conveyorReq_o.isPartnerPresent() || conveyorReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 141, column: 4
                  conveyorReq_o.setREQ(false);//sysj\orchestrator.sysj line: 141, column: 4
                  S41398=1;
                  active[5]=1;
                  ends[5]=1;
                  tdone[5]=1;
                }
                else {
                  switch(S41393){
                    case 0 : 
                      if(conveyorReq_o.isACK()){//sysj\orchestrator.sysj line: 141, column: 4
                        conveyorReq_o.setVal(true);//sysj\orchestrator.sysj line: 141, column: 4
                        S41393=1;
                        if(!conveyorReq_o.isACK()){//sysj\orchestrator.sysj line: 141, column: 4
                          conveyorReq_o.setREQ(false);//sysj\orchestrator.sysj line: 141, column: 4
                          ends[5]=2;
                          ;//sysj\orchestrator.sysj line: 141, column: 4
                          S41436=2;
                          S41443=0;
                          if(!conveyorStatus_in.isPartnerPresent() || conveyorStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 142, column: 4
                            conveyorStatus_in.setACK(false);//sysj\orchestrator.sysj line: 142, column: 4
                            S41443=1;
                            active[5]=1;
                            ends[5]=1;
                            tdone[5]=1;
                          }
                          else {
                            S41438=0;
                            if(!conveyorStatus_in.isREQ()){//sysj\orchestrator.sysj line: 142, column: 4
                              conveyorStatus_in.setACK(true);//sysj\orchestrator.sysj line: 142, column: 4
                              S41438=1;
                              if(conveyorStatus_in.isREQ()){//sysj\orchestrator.sysj line: 142, column: 4
                                conveyorStatus_in.setACK(false);//sysj\orchestrator.sysj line: 142, column: 4
                                ends[5]=2;
                                ;//sysj\orchestrator.sysj line: 142, column: 4
                                res_thread_5 = (String)(conveyorStatus_in.getVal() == null ? null : ((String)conveyorStatus_in.getVal()));//sysj\orchestrator.sysj line: 143, column: 4
                                recConveyorStatus_1.setPresent();//sysj\orchestrator.sysj line: 144, column: 4
                                currsigs.addElement(recConveyorStatus_1);
                                recConveyorStatus_1.setValue(res_thread_5);//sysj\orchestrator.sysj line: 144, column: 4
                                S41436=0;
                                active[5]=1;
                                ends[5]=1;
                                tdone[5]=1;
                              }
                              else {
                                active[5]=1;
                                ends[5]=1;
                                tdone[5]=1;
                              }
                            }
                            else {
                              active[5]=1;
                              ends[5]=1;
                              tdone[5]=1;
                            }
                          }
                        }
                        else {
                          active[5]=1;
                          ends[5]=1;
                          tdone[5]=1;
                        }
                      }
                      else {
                        active[5]=1;
                        ends[5]=1;
                        tdone[5]=1;
                      }
                      break;
                    
                    case 1 : 
                      if(!conveyorReq_o.isACK()){//sysj\orchestrator.sysj line: 141, column: 4
                        conveyorReq_o.setREQ(false);//sysj\orchestrator.sysj line: 141, column: 4
                        ends[5]=2;
                        ;//sysj\orchestrator.sysj line: 141, column: 4
                        S41436=2;
                        S41443=0;
                        if(!conveyorStatus_in.isPartnerPresent() || conveyorStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 142, column: 4
                          conveyorStatus_in.setACK(false);//sysj\orchestrator.sysj line: 142, column: 4
                          S41443=1;
                          active[5]=1;
                          ends[5]=1;
                          tdone[5]=1;
                        }
                        else {
                          S41438=0;
                          if(!conveyorStatus_in.isREQ()){//sysj\orchestrator.sysj line: 142, column: 4
                            conveyorStatus_in.setACK(true);//sysj\orchestrator.sysj line: 142, column: 4
                            S41438=1;
                            if(conveyorStatus_in.isREQ()){//sysj\orchestrator.sysj line: 142, column: 4
                              conveyorStatus_in.setACK(false);//sysj\orchestrator.sysj line: 142, column: 4
                              ends[5]=2;
                              ;//sysj\orchestrator.sysj line: 142, column: 4
                              res_thread_5 = (String)(conveyorStatus_in.getVal() == null ? null : ((String)conveyorStatus_in.getVal()));//sysj\orchestrator.sysj line: 143, column: 4
                              recConveyorStatus_1.setPresent();//sysj\orchestrator.sysj line: 144, column: 4
                              currsigs.addElement(recConveyorStatus_1);
                              recConveyorStatus_1.setValue(res_thread_5);//sysj\orchestrator.sysj line: 144, column: 4
                              S41436=0;
                              active[5]=1;
                              ends[5]=1;
                              tdone[5]=1;
                            }
                            else {
                              active[5]=1;
                              ends[5]=1;
                              tdone[5]=1;
                            }
                          }
                          else {
                            active[5]=1;
                            ends[5]=1;
                            tdone[5]=1;
                          }
                        }
                      }
                      else {
                        active[5]=1;
                        ends[5]=1;
                        tdone[5]=1;
                      }
                      break;
                    
                  }
                }
                break;
              
              case 1 : 
                S41398=1;
                S41398=0;
                if(!conveyorReq_o.isPartnerPresent() || conveyorReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 141, column: 4
                  conveyorReq_o.setREQ(false);//sysj\orchestrator.sysj line: 141, column: 4
                  S41398=1;
                  active[5]=1;
                  ends[5]=1;
                  tdone[5]=1;
                }
                else {
                  S41393=0;
                  if(conveyorReq_o.isACK()){//sysj\orchestrator.sysj line: 141, column: 4
                    conveyorReq_o.setVal(true);//sysj\orchestrator.sysj line: 141, column: 4
                    S41393=1;
                    if(!conveyorReq_o.isACK()){//sysj\orchestrator.sysj line: 141, column: 4
                      conveyorReq_o.setREQ(false);//sysj\orchestrator.sysj line: 141, column: 4
                      ends[5]=2;
                      ;//sysj\orchestrator.sysj line: 141, column: 4
                      S41436=2;
                      S41443=0;
                      if(!conveyorStatus_in.isPartnerPresent() || conveyorStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 142, column: 4
                        conveyorStatus_in.setACK(false);//sysj\orchestrator.sysj line: 142, column: 4
                        S41443=1;
                        active[5]=1;
                        ends[5]=1;
                        tdone[5]=1;
                      }
                      else {
                        S41438=0;
                        if(!conveyorStatus_in.isREQ()){//sysj\orchestrator.sysj line: 142, column: 4
                          conveyorStatus_in.setACK(true);//sysj\orchestrator.sysj line: 142, column: 4
                          S41438=1;
                          if(conveyorStatus_in.isREQ()){//sysj\orchestrator.sysj line: 142, column: 4
                            conveyorStatus_in.setACK(false);//sysj\orchestrator.sysj line: 142, column: 4
                            ends[5]=2;
                            ;//sysj\orchestrator.sysj line: 142, column: 4
                            res_thread_5 = (String)(conveyorStatus_in.getVal() == null ? null : ((String)conveyorStatus_in.getVal()));//sysj\orchestrator.sysj line: 143, column: 4
                            recConveyorStatus_1.setPresent();//sysj\orchestrator.sysj line: 144, column: 4
                            currsigs.addElement(recConveyorStatus_1);
                            recConveyorStatus_1.setValue(res_thread_5);//sysj\orchestrator.sysj line: 144, column: 4
                            S41436=0;
                            active[5]=1;
                            ends[5]=1;
                            tdone[5]=1;
                          }
                          else {
                            active[5]=1;
                            ends[5]=1;
                            tdone[5]=1;
                          }
                        }
                        else {
                          active[5]=1;
                          ends[5]=1;
                          tdone[5]=1;
                        }
                      }
                    }
                    else {
                      active[5]=1;
                      ends[5]=1;
                      tdone[5]=1;
                    }
                  }
                  else {
                    active[5]=1;
                    ends[5]=1;
                    tdone[5]=1;
                  }
                }
                break;
              
            }
            break;
          
          case 2 : 
            switch(S41443){
              case 0 : 
                if(!conveyorStatus_in.isPartnerPresent() || conveyorStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 142, column: 4
                  conveyorStatus_in.setACK(false);//sysj\orchestrator.sysj line: 142, column: 4
                  S41443=1;
                  active[5]=1;
                  ends[5]=1;
                  tdone[5]=1;
                }
                else {
                  switch(S41438){
                    case 0 : 
                      if(!conveyorStatus_in.isREQ()){//sysj\orchestrator.sysj line: 142, column: 4
                        conveyorStatus_in.setACK(true);//sysj\orchestrator.sysj line: 142, column: 4
                        S41438=1;
                        if(conveyorStatus_in.isREQ()){//sysj\orchestrator.sysj line: 142, column: 4
                          conveyorStatus_in.setACK(false);//sysj\orchestrator.sysj line: 142, column: 4
                          ends[5]=2;
                          ;//sysj\orchestrator.sysj line: 142, column: 4
                          res_thread_5 = (String)(conveyorStatus_in.getVal() == null ? null : ((String)conveyorStatus_in.getVal()));//sysj\orchestrator.sysj line: 143, column: 4
                          recConveyorStatus_1.setPresent();//sysj\orchestrator.sysj line: 144, column: 4
                          currsigs.addElement(recConveyorStatus_1);
                          recConveyorStatus_1.setValue(res_thread_5);//sysj\orchestrator.sysj line: 144, column: 4
                          S41436=0;
                          active[5]=1;
                          ends[5]=1;
                          tdone[5]=1;
                        }
                        else {
                          active[5]=1;
                          ends[5]=1;
                          tdone[5]=1;
                        }
                      }
                      else {
                        active[5]=1;
                        ends[5]=1;
                        tdone[5]=1;
                      }
                      break;
                    
                    case 1 : 
                      if(conveyorStatus_in.isREQ()){//sysj\orchestrator.sysj line: 142, column: 4
                        conveyorStatus_in.setACK(false);//sysj\orchestrator.sysj line: 142, column: 4
                        ends[5]=2;
                        ;//sysj\orchestrator.sysj line: 142, column: 4
                        res_thread_5 = (String)(conveyorStatus_in.getVal() == null ? null : ((String)conveyorStatus_in.getVal()));//sysj\orchestrator.sysj line: 143, column: 4
                        recConveyorStatus_1.setPresent();//sysj\orchestrator.sysj line: 144, column: 4
                        currsigs.addElement(recConveyorStatus_1);
                        recConveyorStatus_1.setValue(res_thread_5);//sysj\orchestrator.sysj line: 144, column: 4
                        S41436=0;
                        active[5]=1;
                        ends[5]=1;
                        tdone[5]=1;
                      }
                      else {
                        active[5]=1;
                        ends[5]=1;
                        tdone[5]=1;
                      }
                      break;
                    
                  }
                }
                break;
              
              case 1 : 
                S41443=1;
                S41443=0;
                if(!conveyorStatus_in.isPartnerPresent() || conveyorStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 142, column: 4
                  conveyorStatus_in.setACK(false);//sysj\orchestrator.sysj line: 142, column: 4
                  S41443=1;
                  active[5]=1;
                  ends[5]=1;
                  tdone[5]=1;
                }
                else {
                  S41438=0;
                  if(!conveyorStatus_in.isREQ()){//sysj\orchestrator.sysj line: 142, column: 4
                    conveyorStatus_in.setACK(true);//sysj\orchestrator.sysj line: 142, column: 4
                    S41438=1;
                    if(conveyorStatus_in.isREQ()){//sysj\orchestrator.sysj line: 142, column: 4
                      conveyorStatus_in.setACK(false);//sysj\orchestrator.sysj line: 142, column: 4
                      ends[5]=2;
                      ;//sysj\orchestrator.sysj line: 142, column: 4
                      res_thread_5 = (String)(conveyorStatus_in.getVal() == null ? null : ((String)conveyorStatus_in.getVal()));//sysj\orchestrator.sysj line: 143, column: 4
                      recConveyorStatus_1.setPresent();//sysj\orchestrator.sysj line: 144, column: 4
                      currsigs.addElement(recConveyorStatus_1);
                      recConveyorStatus_1.setValue(res_thread_5);//sysj\orchestrator.sysj line: 144, column: 4
                      S41436=0;
                      active[5]=1;
                      ends[5]=1;
                      tdone[5]=1;
                    }
                    else {
                      active[5]=1;
                      ends[5]=1;
                      tdone[5]=1;
                    }
                  }
                  else {
                    active[5]=1;
                    ends[5]=1;
                    tdone[5]=1;
                  }
                }
                break;
              
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread47650(int [] tdone, int [] ends){
        switch(S41390){
      case 0 : 
        active[4]=0;
        ends[4]=0;
        tdone[4]=1;
        break;
      
      case 1 : 
        if(startOrder_1.getprestatus()){//sysj\orchestrator.sysj line: 122, column: 13
          if(currentOrder_1.getprestatus()){//sysj\orchestrator.sysj line: 123, column: 14
            myOrder_thread_4 = (currentOrder_1.getpreval() == null ? null : ((Order)currentOrder_1.getpreval()));//sysj\orchestrator.sysj line: 124, column: 7
            currentOrder_1.setPresent();//sysj\orchestrator.sysj line: 127, column: 8
            currsigs.addElement(currentOrder_1);
            currentOrder_1.setValue(myOrder_thread_4);//sysj\orchestrator.sysj line: 127, column: 8
            foundCurrentOrder_1.setPresent();//sysj\orchestrator.sysj line: 128, column: 8
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

  public void thread47649(int [] tdone, int [] ends){
        switch(S41364){
      case 0 : 
        active[3]=0;
        ends[3]=0;
        tdone[3]=1;
        break;
      
      case 1 : 
        switch(S41352){
          case 0 : 
            if(currentOrder_1.getprestatus()){//sysj\orchestrator.sysj line: 111, column: 11
              S41352=1;
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            else {
              initABS_1.setPresent();//sysj\orchestrator.sysj line: 112, column: 6
              currsigs.addElement(initABS_1);
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            break;
          
          case 1 : 
            S41352=1;
            S41352=0;
            initABS_1.setPresent();//sysj\orchestrator.sysj line: 112, column: 6
            currsigs.addElement(initABS_1);
            active[3]=1;
            ends[3]=1;
            tdone[3]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread47648(int [] tdone, int [] ends){
        switch(S41347){
      case 0 : 
        active[2]=0;
        ends[2]=0;
        tdone[2]=1;
        break;
      
      case 1 : 
        switch(S38910){
          case 0 : 
            if(recOrderStatus.getprestatus()){//sysj\orchestrator.sysj line: 58, column: 13
              System.out.println("orch received: recOrderStatus");//sysj\orchestrator.sysj line: 62, column: 7
              S38910=1;
              if(currentOrder_1.getprestatus()){//sysj\orchestrator.sysj line: 69, column: 13
                tempOrder_thread_2 = (currentOrder_1.getpreval() == null ? null : ((Order)currentOrder_1.getpreval()));//sysj\orchestrator.sysj line: 70, column: 6
                if(orderIsDone_1.getprestatus()){//sysj\orchestrator.sysj line: 71, column: 14
                  tempOrder_thread_2.setOrderStatus("Done");//sysj\orchestrator.sysj line: 73, column: 7
                  S38478=0;
                  orderStatus.setPresent();//sysj\orchestrator.sysj line: 75, column: 8
                  currsigs.addElement(orderStatus);
                  orderStatus.setValue(tempOrder_thread_2);//sysj\orchestrator.sysj line: 75, column: 8
                  active[2]=1;
                  ends[2]=1;
                  tdone[2]=1;
                }
                else {
                  S38910=2;
                  active[2]=1;
                  ends[2]=1;
                  tdone[2]=1;
                }
              }
              else {
                S38910=2;
                active[2]=1;
                ends[2]=1;
                tdone[2]=1;
              }
            }
            else {
              orderStatus.setPresent();//sysj\orchestrator.sysj line: 59, column: 8
              currsigs.addElement(orderStatus);
              orderStatus.setValue(tempOrder_thread_2);//sysj\orchestrator.sysj line: 59, column: 8
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            break;
          
          case 1 : 
            switch(S38478){
              case 0 : 
                if(recOrderStatus.getprestatus()){//sysj\orchestrator.sysj line: 74, column: 13
                  System.out.println("initialising next order...");//sysj\orchestrator.sysj line: 79, column: 7
                  S38478=1;
                  if(!fifoQueue_thread_2.isEmpty()){//sysj\orchestrator.sysj line: 80, column: 10
                    nextOrder_thread_2 = (Order)fifoQueue_thread_2.get(0);//sysj\orchestrator.sysj line: 81, column: 8
                    fifoQueue_thread_2.remove(0);//sysj\orchestrator.sysj line: 82, column: 8
                    currentOrder_1.setPresent();//sysj\orchestrator.sysj line: 86, column: 9
                    currsigs.addElement(currentOrder_1);
                    currentOrder_1.setValue(nextOrder_thread_2);//sysj\orchestrator.sysj line: 86, column: 9
                    startOrder_1.setPresent();//sysj\orchestrator.sysj line: 87, column: 9
                    currsigs.addElement(startOrder_1);
                    nextOrder_thread_2.setOrderStatus("Started");//sysj\orchestrator.sysj line: 91, column: 8
                    System.out.println("emitting next orderstatus: started");//sysj\orchestrator.sysj line: 92, column: 8
                    orderStatus.setPresent();//sysj\orchestrator.sysj line: 94, column: 9
                    currsigs.addElement(orderStatus);
                    orderStatus.setValue(nextOrder_thread_2);//sysj\orchestrator.sysj line: 94, column: 9
                    active[2]=1;
                    ends[2]=1;
                    tdone[2]=1;
                  }
                  else {
                    S38910=2;
                    active[2]=1;
                    ends[2]=1;
                    tdone[2]=1;
                  }
                }
                else {
                  orderStatus.setPresent();//sysj\orchestrator.sysj line: 75, column: 8
                  currsigs.addElement(orderStatus);
                  orderStatus.setValue(tempOrder_thread_2);//sysj\orchestrator.sysj line: 75, column: 8
                  active[2]=1;
                  ends[2]=1;
                  tdone[2]=1;
                }
                break;
              
              case 1 : 
                if(recOrderStatus.getprestatus()){//sysj\orchestrator.sysj line: 93, column: 14
                  S38910=2;
                  active[2]=1;
                  ends[2]=1;
                  tdone[2]=1;
                }
                else {
                  orderStatus.setPresent();//sysj\orchestrator.sysj line: 94, column: 9
                  currsigs.addElement(orderStatus);
                  orderStatus.setValue(nextOrder_thread_2);//sysj\orchestrator.sysj line: 94, column: 9
                  active[2]=1;
                  ends[2]=1;
                  tdone[2]=1;
                }
                break;
              
            }
            break;
          
          case 2 : 
            S38910=2;
            S38910=0;
            if(order.getprestatus()){//sysj\orchestrator.sysj line: 31, column: 13
              System.out.println("got order!");//sysj\orchestrator.sysj line: 32, column: 6
              newOrder_thread_2 = (order.getpreval() == null ? null : ((Order)order.getpreval()));//sysj\orchestrator.sysj line: 33, column: 6
              System.out.println(newOrder_thread_2.getQuantity());//sysj\orchestrator.sysj line: 34, column: 6
              fifoQueue_thread_2.add(newOrder_thread_2);//sysj\orchestrator.sysj line: 36, column: 6
              if(initABS_1.getprestatus()){//sysj\orchestrator.sysj line: 39, column: 14
                System.out.println("start of ABS get first item");//sysj\orchestrator.sysj line: 40, column: 7
                tempOrder_thread_2 = (Order)fifoQueue_thread_2.get(0);//sysj\orchestrator.sysj line: 41, column: 7
                fifoQueue_thread_2.remove(0);//sysj\orchestrator.sysj line: 44, column: 7
                System.out.println(newOrder_thread_2.getCustomerID());//sysj\orchestrator.sysj line: 45, column: 7
                currentOrder_1.setPresent();//sysj\orchestrator.sysj line: 49, column: 8
                currsigs.addElement(currentOrder_1);
                currentOrder_1.setValue(tempOrder_thread_2);//sysj\orchestrator.sysj line: 49, column: 8
                startOrder_1.setPresent();//sysj\orchestrator.sysj line: 50, column: 8
                currsigs.addElement(startOrder_1);
                tempOrder_thread_2.setOrderStatus("Started");//sysj\orchestrator.sysj line: 55, column: 7
                System.out.println("emitting orderstatus: started");//sysj\orchestrator.sysj line: 56, column: 7
                orderStatus.setPresent();//sysj\orchestrator.sysj line: 59, column: 8
                currsigs.addElement(orderStatus);
                orderStatus.setValue(tempOrder_thread_2);//sysj\orchestrator.sysj line: 59, column: 8
                active[2]=1;
                ends[2]=1;
                tdone[2]=1;
              }
              else {
                S38910=1;
                if(currentOrder_1.getprestatus()){//sysj\orchestrator.sysj line: 69, column: 13
                  tempOrder_thread_2 = (currentOrder_1.getpreval() == null ? null : ((Order)currentOrder_1.getpreval()));//sysj\orchestrator.sysj line: 70, column: 6
                  if(orderIsDone_1.getprestatus()){//sysj\orchestrator.sysj line: 71, column: 14
                    tempOrder_thread_2.setOrderStatus("Done");//sysj\orchestrator.sysj line: 73, column: 7
                    S38478=0;
                    orderStatus.setPresent();//sysj\orchestrator.sysj line: 75, column: 8
                    currsigs.addElement(orderStatus);
                    orderStatus.setValue(tempOrder_thread_2);//sysj\orchestrator.sysj line: 75, column: 8
                    active[2]=1;
                    ends[2]=1;
                    tdone[2]=1;
                  }
                  else {
                    S38910=2;
                    active[2]=1;
                    ends[2]=1;
                    tdone[2]=1;
                  }
                }
                else {
                  S38910=2;
                  active[2]=1;
                  ends[2]=1;
                  tdone[2]=1;
                }
              }
            }
            else {
              S38910=1;
              if(currentOrder_1.getprestatus()){//sysj\orchestrator.sysj line: 69, column: 13
                tempOrder_thread_2 = (currentOrder_1.getpreval() == null ? null : ((Order)currentOrder_1.getpreval()));//sysj\orchestrator.sysj line: 70, column: 6
                if(orderIsDone_1.getprestatus()){//sysj\orchestrator.sysj line: 71, column: 14
                  tempOrder_thread_2.setOrderStatus("Done");//sysj\orchestrator.sysj line: 73, column: 7
                  S38478=0;
                  orderStatus.setPresent();//sysj\orchestrator.sysj line: 75, column: 8
                  currsigs.addElement(orderStatus);
                  orderStatus.setValue(tempOrder_thread_2);//sysj\orchestrator.sysj line: 75, column: 8
                  active[2]=1;
                  ends[2]=1;
                  tdone[2]=1;
                }
                else {
                  S38910=2;
                  active[2]=1;
                  ends[2]=1;
                  tdone[2]=1;
                }
              }
              else {
                S38910=2;
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

  public void thread47646(int [] tdone, int [] ends){
        S47634=1;
    quantity_thread_10 = 0;//sysj\orchestrator.sysj line: 200, column: 3
    count_thread_10 = 0;//sysj\orchestrator.sysj line: 201, column: 3
    eject_thread_10 = 0;//sysj\orchestrator.sysj line: 202, column: 3
        S46093=0;
    active[10]=1;
    ends[10]=1;
    tdone[10]=1;
  }

  public void thread47645(int [] tdone, int [] ends){
        S46090=1;
    S45152=0;
    active[9]=1;
    ends[9]=1;
    tdone[9]=1;
  }

  public void thread47644(int [] tdone, int [] ends){
        S45150=1;
    S44212=0;
    active[8]=1;
    ends[8]=1;
    tdone[8]=1;
  }

  public void thread47643(int [] tdone, int [] ends){
        S44210=1;
    S43272=0;
    active[7]=1;
    ends[7]=1;
    tdone[7]=1;
  }

  public void thread47642(int [] tdone, int [] ends){
        S43270=1;
    S42332=0;
    active[6]=1;
    ends[6]=1;
    tdone[6]=1;
  }

  public void thread47641(int [] tdone, int [] ends){
        S42330=1;
    S41436=0;
    active[5]=1;
    ends[5]=1;
    tdone[5]=1;
  }

  public void thread47640(int [] tdone, int [] ends){
        S41390=1;
    if(startOrder_1.getprestatus()){//sysj\orchestrator.sysj line: 122, column: 13
      if(currentOrder_1.getprestatus()){//sysj\orchestrator.sysj line: 123, column: 14
        myOrder_thread_4 = (currentOrder_1.getpreval() == null ? null : ((Order)currentOrder_1.getpreval()));//sysj\orchestrator.sysj line: 124, column: 7
        currentOrder_1.setPresent();//sysj\orchestrator.sysj line: 127, column: 8
        currsigs.addElement(currentOrder_1);
        currentOrder_1.setValue(myOrder_thread_4);//sysj\orchestrator.sysj line: 127, column: 8
        foundCurrentOrder_1.setPresent();//sysj\orchestrator.sysj line: 128, column: 8
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

  public void thread47639(int [] tdone, int [] ends){
        S41364=1;
    S41352=0;
    initABS_1.setPresent();//sysj\orchestrator.sysj line: 112, column: 6
    currsigs.addElement(initABS_1);
    active[3]=1;
    ends[3]=1;
    tdone[3]=1;
  }

  public void thread47638(int [] tdone, int [] ends){
        S41347=1;
    fifoQueue_thread_2 = new ArrayList();//sysj\orchestrator.sysj line: 25, column: 3
    S38910=0;
    if(order.getprestatus()){//sysj\orchestrator.sysj line: 31, column: 13
      System.out.println("got order!");//sysj\orchestrator.sysj line: 32, column: 6
      newOrder_thread_2 = (order.getpreval() == null ? null : ((Order)order.getpreval()));//sysj\orchestrator.sysj line: 33, column: 6
      System.out.println(newOrder_thread_2.getQuantity());//sysj\orchestrator.sysj line: 34, column: 6
      fifoQueue_thread_2.add(newOrder_thread_2);//sysj\orchestrator.sysj line: 36, column: 6
      if(initABS_1.getprestatus()){//sysj\orchestrator.sysj line: 39, column: 14
        System.out.println("start of ABS get first item");//sysj\orchestrator.sysj line: 40, column: 7
        tempOrder_thread_2 = (Order)fifoQueue_thread_2.get(0);//sysj\orchestrator.sysj line: 41, column: 7
        fifoQueue_thread_2.remove(0);//sysj\orchestrator.sysj line: 44, column: 7
        System.out.println(newOrder_thread_2.getCustomerID());//sysj\orchestrator.sysj line: 45, column: 7
        currentOrder_1.setPresent();//sysj\orchestrator.sysj line: 49, column: 8
        currsigs.addElement(currentOrder_1);
        currentOrder_1.setValue(tempOrder_thread_2);//sysj\orchestrator.sysj line: 49, column: 8
        startOrder_1.setPresent();//sysj\orchestrator.sysj line: 50, column: 8
        currsigs.addElement(startOrder_1);
        tempOrder_thread_2.setOrderStatus("Started");//sysj\orchestrator.sysj line: 55, column: 7
        System.out.println("emitting orderstatus: started");//sysj\orchestrator.sysj line: 56, column: 7
        orderStatus.setPresent();//sysj\orchestrator.sysj line: 59, column: 8
        currsigs.addElement(orderStatus);
        orderStatus.setValue(tempOrder_thread_2);//sysj\orchestrator.sysj line: 59, column: 8
        active[2]=1;
        ends[2]=1;
        tdone[2]=1;
      }
      else {
        S38910=1;
        if(currentOrder_1.getprestatus()){//sysj\orchestrator.sysj line: 69, column: 13
          tempOrder_thread_2 = (currentOrder_1.getpreval() == null ? null : ((Order)currentOrder_1.getpreval()));//sysj\orchestrator.sysj line: 70, column: 6
          if(orderIsDone_1.getprestatus()){//sysj\orchestrator.sysj line: 71, column: 14
            tempOrder_thread_2.setOrderStatus("Done");//sysj\orchestrator.sysj line: 73, column: 7
            S38478=0;
            orderStatus.setPresent();//sysj\orchestrator.sysj line: 75, column: 8
            currsigs.addElement(orderStatus);
            orderStatus.setValue(tempOrder_thread_2);//sysj\orchestrator.sysj line: 75, column: 8
            active[2]=1;
            ends[2]=1;
            tdone[2]=1;
          }
          else {
            S38910=2;
            active[2]=1;
            ends[2]=1;
            tdone[2]=1;
          }
        }
        else {
          S38910=2;
          active[2]=1;
          ends[2]=1;
          tdone[2]=1;
        }
      }
    }
    else {
      S38910=1;
      if(currentOrder_1.getprestatus()){//sysj\orchestrator.sysj line: 69, column: 13
        tempOrder_thread_2 = (currentOrder_1.getpreval() == null ? null : ((Order)currentOrder_1.getpreval()));//sysj\orchestrator.sysj line: 70, column: 6
        if(orderIsDone_1.getprestatus()){//sysj\orchestrator.sysj line: 71, column: 14
          tempOrder_thread_2.setOrderStatus("Done");//sysj\orchestrator.sysj line: 73, column: 7
          S38478=0;
          orderStatus.setPresent();//sysj\orchestrator.sysj line: 75, column: 8
          currsigs.addElement(orderStatus);
          orderStatus.setValue(tempOrder_thread_2);//sysj\orchestrator.sysj line: 75, column: 8
          active[2]=1;
          ends[2]=1;
          tdone[2]=1;
        }
        else {
          S38910=2;
          active[2]=1;
          ends[2]=1;
          tdone[2]=1;
        }
      }
      else {
        S38910=2;
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
      switch(S47636){
        case 0 : 
          S47636=0;
          break RUN;
        
        case 1 : 
          S47636=2;
          S47636=2;
          sigConveyorReq_1.setClear();//sysj\orchestrator.sysj line: 12, column: 2
          sigCapperReq_1.setClear();//sysj\orchestrator.sysj line: 12, column: 2
          sigCapLoaderReq_1.setClear();//sysj\orchestrator.sysj line: 12, column: 2
          sigRotaryReq_1.setClear();//sysj\orchestrator.sysj line: 12, column: 2
          sigFillerReq_1.setClear();//sysj\orchestrator.sysj line: 13, column: 2
          recConveyorStatus_1.setClear();//sysj\orchestrator.sysj line: 14, column: 2
          recCapperStatus_1.setClear();//sysj\orchestrator.sysj line: 14, column: 2
          recCapLoaderStatus_1.setClear();//sysj\orchestrator.sysj line: 14, column: 2
          recFillerStatus_1.setClear();//sysj\orchestrator.sysj line: 14, column: 2
          recRotaryStatus_1.setClear();//sysj\orchestrator.sysj line: 14, column: 2
          getNextBottle_1.setClear();//sysj\orchestrator.sysj line: 15, column: 2
          startOrder_1.setClear();//sysj\orchestrator.sysj line: 18, column: 2
          orderIsDone_1.setClear();//sysj\orchestrator.sysj line: 19, column: 2
          initABS_1.setClear();//sysj\orchestrator.sysj line: 20, column: 2
          foundCurrentOrder_1.setClear();//sysj\orchestrator.sysj line: 21, column: 2
          currentOrder_1.setClear();//sysj\orchestrator.sysj line: 22, column: 2
          thread47638(tdone,ends);
          thread47639(tdone,ends);
          thread47640(tdone,ends);
          thread47641(tdone,ends);
          thread47642(tdone,ends);
          thread47643(tdone,ends);
          thread47644(tdone,ends);
          thread47645(tdone,ends);
          thread47646(tdone,ends);
          int biggest47647 = 0;
          if(ends[2]>=biggest47647){
            biggest47647=ends[2];
          }
          if(ends[3]>=biggest47647){
            biggest47647=ends[3];
          }
          if(ends[4]>=biggest47647){
            biggest47647=ends[4];
          }
          if(ends[5]>=biggest47647){
            biggest47647=ends[5];
          }
          if(ends[6]>=biggest47647){
            biggest47647=ends[6];
          }
          if(ends[7]>=biggest47647){
            biggest47647=ends[7];
          }
          if(ends[8]>=biggest47647){
            biggest47647=ends[8];
          }
          if(ends[9]>=biggest47647){
            biggest47647=ends[9];
          }
          if(ends[10]>=biggest47647){
            biggest47647=ends[10];
          }
          if(biggest47647 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
        
        case 2 : 
          sigConveyorReq_1.setClear();//sysj\orchestrator.sysj line: 12, column: 2
          sigCapperReq_1.setClear();//sysj\orchestrator.sysj line: 12, column: 2
          sigCapLoaderReq_1.setClear();//sysj\orchestrator.sysj line: 12, column: 2
          sigRotaryReq_1.setClear();//sysj\orchestrator.sysj line: 12, column: 2
          sigFillerReq_1.setClear();//sysj\orchestrator.sysj line: 13, column: 2
          recConveyorStatus_1.setClear();//sysj\orchestrator.sysj line: 14, column: 2
          recCapperStatus_1.setClear();//sysj\orchestrator.sysj line: 14, column: 2
          recCapLoaderStatus_1.setClear();//sysj\orchestrator.sysj line: 14, column: 2
          recFillerStatus_1.setClear();//sysj\orchestrator.sysj line: 14, column: 2
          recRotaryStatus_1.setClear();//sysj\orchestrator.sysj line: 14, column: 2
          getNextBottle_1.setClear();//sysj\orchestrator.sysj line: 15, column: 2
          startOrder_1.setClear();//sysj\orchestrator.sysj line: 18, column: 2
          orderIsDone_1.setClear();//sysj\orchestrator.sysj line: 19, column: 2
          initABS_1.setClear();//sysj\orchestrator.sysj line: 20, column: 2
          foundCurrentOrder_1.setClear();//sysj\orchestrator.sysj line: 21, column: 2
          currentOrder_1.setClear();//sysj\orchestrator.sysj line: 22, column: 2
          thread47648(tdone,ends);
          thread47649(tdone,ends);
          thread47650(tdone,ends);
          thread47651(tdone,ends);
          thread47652(tdone,ends);
          thread47653(tdone,ends);
          thread47654(tdone,ends);
          thread47655(tdone,ends);
          thread47656(tdone,ends);
          int biggest47669 = 0;
          if(ends[2]>=biggest47669){
            biggest47669=ends[2];
          }
          if(ends[3]>=biggest47669){
            biggest47669=ends[3];
          }
          if(ends[4]>=biggest47669){
            biggest47669=ends[4];
          }
          if(ends[5]>=biggest47669){
            biggest47669=ends[5];
          }
          if(ends[6]>=biggest47669){
            biggest47669=ends[6];
          }
          if(ends[7]>=biggest47669){
            biggest47669=ends[7];
          }
          if(ends[8]>=biggest47669){
            biggest47669=ends[8];
          }
          if(ends[9]>=biggest47669){
            biggest47669=ends[9];
          }
          if(ends[10]>=biggest47669){
            biggest47669=ends[10];
          }
          if(biggest47669 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
          //FINXME code
          if(biggest47669 == 0){
            S47636=0;
            active[1]=0;
            ends[1]=0;
            S47636=0;
            break RUN;
          }
        
      }
    }
  }

  public void init(){
    char [] active1 = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
    char [] paused1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    char [] suspended1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
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
