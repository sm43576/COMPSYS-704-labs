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
  private int quantity_thread_10;//sysj\orchestrator.sysj line: 199, column: 3
  private int count_thread_10;//sysj\orchestrator.sysj line: 200, column: 3
  private int eject_thread_10;//sysj\orchestrator.sysj line: 201, column: 3
  private ArrayList liquidPercent_thread_10;//sysj\orchestrator.sysj line: 202, column: 3
  private Order nextOrder_thread_2;//sysj\orchestrator.sysj line: 80, column: 8
  private Order newOrder_thread_2;//sysj\orchestrator.sysj line: 33, column: 6
  private Order tempOrder_thread_2;//sysj\orchestrator.sysj line: 41, column: 7
  private Order myOrder_thread_4;//sysj\orchestrator.sysj line: 123, column: 7
  private String res_thread_5;//sysj\orchestrator.sysj line: 142, column: 4
  private String res_thread_6;//sysj\orchestrator.sysj line: 154, column: 4
  private String res_thread_7;//sysj\orchestrator.sysj line: 167, column: 4
  private ArrayList req_thread_8;//sysj\orchestrator.sysj line: 176, column: 4
  private String res_thread_8;//sysj\orchestrator.sysj line: 180, column: 4
  private String res_thread_9;//sysj\orchestrator.sysj line: 192, column: 4
  private Order order_thread_10;//sysj\orchestrator.sysj line: 207, column: 4
  private int S46316 = 1;
  private int S40027 = 1;
  private int S38690 = 1;
  private int S38470 = 1;
  private int S40044 = 1;
  private int S40032 = 1;
  private int S40070 = 1;
  private int S41010 = 1;
  private int S40116 = 1;
  private int S40078 = 1;
  private int S40073 = 1;
  private int S40123 = 1;
  private int S40118 = 1;
  private int S41950 = 1;
  private int S41012 = 1;
  private int S41019 = 1;
  private int S41014 = 1;
  private int S41063 = 1;
  private int S41058 = 1;
  private int S42890 = 1;
  private int S41952 = 1;
  private int S41959 = 1;
  private int S41954 = 1;
  private int S42003 = 1;
  private int S41998 = 1;
  private int S43830 = 1;
  private int S42892 = 1;
  private int S42899 = 1;
  private int S42894 = 1;
  private int S42943 = 1;
  private int S42938 = 1;
  private int S44770 = 1;
  private int S43832 = 1;
  private int S43839 = 1;
  private int S43834 = 1;
  private int S43883 = 1;
  private int S43878 = 1;
  private int S46314 = 1;
  private int S44773 = 1;
  private int S44778 = 1;
  private int S44781 = 1;
  private int S44784 = 1;
  private int S44787 = 1;
  private int S44797 = 1;
  private int S44974 = 1;
  
  private int[] ends = new int[14];
  private int[] tdone = new int[14];
  
  public void thread46347(int [] tdone, int [] ends){
        S44787=1;
    active[13]=1;
    ends[13]=1;
    tdone[13]=1;
  }

  public void thread46346(int [] tdone, int [] ends){
        S44784=1;
    active[12]=1;
    ends[12]=1;
    tdone[12]=1;
  }

  public void thread46345(int [] tdone, int [] ends){
        S44781=1;
    active[11]=1;
    ends[11]=1;
    tdone[11]=1;
  }

  public void thread46343(int [] tdone, int [] ends){
        switch(S44787){
      case 0 : 
        active[13]=0;
        ends[13]=0;
        tdone[13]=1;
        break;
      
      case 1 : 
        if(recCapperStatus_1.getprestatus()){//sysj\orchestrator.sysj line: 229, column: 73
          S44787=0;
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

  public void thread46342(int [] tdone, int [] ends){
        switch(S44784){
      case 0 : 
        active[12]=0;
        ends[12]=0;
        tdone[12]=1;
        break;
      
      case 1 : 
        if(recCapLoaderStatus_1.getprestatus()){//sysj\orchestrator.sysj line: 229, column: 41
          S44784=0;
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

  public void thread46341(int [] tdone, int [] ends){
        switch(S44781){
      case 0 : 
        active[11]=0;
        ends[11]=0;
        tdone[11]=1;
        break;
      
      case 1 : 
        if(recFillerStatus_1.getprestatus()){//sysj\orchestrator.sysj line: 229, column: 12
          S44781=0;
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

  public void thread46339(int [] tdone, int [] ends){
        S44787=1;
    active[13]=1;
    ends[13]=1;
    tdone[13]=1;
  }

  public void thread46338(int [] tdone, int [] ends){
        S44784=1;
    active[12]=1;
    ends[12]=1;
    tdone[12]=1;
  }

  public void thread46337(int [] tdone, int [] ends){
        S44781=1;
    active[11]=1;
    ends[11]=1;
    tdone[11]=1;
  }

  public void thread46336(int [] tdone, int [] ends){
        switch(S46314){
      case 0 : 
        active[10]=0;
        ends[10]=0;
        tdone[10]=1;
        break;
      
      case 1 : 
        switch(S44773){
          case 0 : 
            if(currentOrder_1.getprestatus()){//sysj\orchestrator.sysj line: 206, column: 10
              order_thread_10 = (currentOrder_1.getpreval() == null ? null : ((Order)currentOrder_1.getpreval()));//sysj\orchestrator.sysj line: 207, column: 4
              quantity_thread_10 = order_thread_10.getQuantity();//sysj\orchestrator.sysj line: 208, column: 4
              count_thread_10 = quantity_thread_10;//sysj\orchestrator.sysj line: 209, column: 4
              liquidPercent_thread_10 = order_thread_10.getLiquidPercentageArray();//sysj\orchestrator.sysj line: 210, column: 4
              System.out.println("Orch: Loading first bottle...");//sysj\orchestrator.sysj line: 212, column: 4
              sigConveyorReq_1.setPresent();//sysj\orchestrator.sysj line: 213, column: 4
              currsigs.addElement(sigConveyorReq_1);
              sigConveyorReq_1.setValue(true);//sysj\orchestrator.sysj line: 213, column: 4
              S44773=1;
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
            if(recConveyorStatus_1.getprestatus()){//sysj\orchestrator.sysj line: 214, column: 10
              System.out.println("Orch: First bottle loaded.");//sysj\orchestrator.sysj line: 215, column: 4
              sigRotaryReq_1.setPresent();//sysj\orchestrator.sysj line: 216, column: 4
              currsigs.addElement(sigRotaryReq_1);
              S44773=2;
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
            if(recRotaryStatus_1.getprestatus()){//sysj\orchestrator.sysj line: 217, column: 10
              S44773=3;
              if(count_thread_10 >= 0){//sysj\orchestrator.sysj line: 219, column: 10
                if(count_thread_10 == 0) {//sysj\orchestrator.sysj line: 221, column: 21
                  System.out.println("Orch: Last bottle. Preparing to send requests..");//sysj\orchestrator.sysj line: 222, column: 6
                }
                else {//sysj\orchestrator.sysj line: 223, column: 12
                  System.out.println("Orch: Bottle count " + count_thread_10 + ". Preparing to send requests..");//sysj\orchestrator.sysj line: 224, column: 6
                }
                sigFillerReq_1.setPresent();//sysj\orchestrator.sysj line: 226, column: 5
                currsigs.addElement(sigFillerReq_1);
                sigFillerReq_1.setValue(liquidPercent_thread_10);//sysj\orchestrator.sysj line: 226, column: 5
                sigCapLoaderReq_1.setPresent();//sysj\orchestrator.sysj line: 227, column: 5
                currsigs.addElement(sigCapLoaderReq_1);
                sigCapperReq_1.setPresent();//sysj\orchestrator.sysj line: 228, column: 5
                currsigs.addElement(sigCapperReq_1);
                S44778=0;
                thread46337(tdone,ends);
                thread46338(tdone,ends);
                thread46339(tdone,ends);
                int biggest46340 = 0;
                if(ends[11]>=biggest46340){
                  biggest46340=ends[11];
                }
                if(ends[12]>=biggest46340){
                  biggest46340=ends[12];
                }
                if(ends[13]>=biggest46340){
                  biggest46340=ends[13];
                }
                if(biggest46340 == 1){
                  active[10]=1;
                  ends[10]=1;
                  tdone[10]=1;
                }
              }
              else {
                ends[10]=2;
                ;//sysj\orchestrator.sysj line: 219, column: 4
                System.out.println("Ejecting all bottles");//sysj\orchestrator.sysj line: 249, column: 4
                if(quantity_thread_10 >= 5) {//sysj\orchestrator.sysj line: 251, column: 23
                  eject_thread_10 = 5;//sysj\orchestrator.sysj line: 252, column: 5
                }
                else {//sysj\orchestrator.sysj line: 253, column: 11
                  eject_thread_10 = quantity_thread_10;//sysj\orchestrator.sysj line: 254, column: 5
                }
                S44773=4;
                if(eject_thread_10 >= 0){//sysj\orchestrator.sysj line: 258, column: 11
                  sigRotaryReq_1.setPresent();//sysj\orchestrator.sysj line: 259, column: 5
                  currsigs.addElement(sigRotaryReq_1);
                  S44974=0;
                  active[10]=1;
                  ends[10]=1;
                  tdone[10]=1;
                }
                else {
                  ends[10]=2;
                  ;//sysj\orchestrator.sysj line: 258, column: 4
                  System.out.println("Orch: Order complete.");//sysj\orchestrator.sysj line: 267, column: 4
                  S44773=5;
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
            switch(S44778){
              case 0 : 
                thread46341(tdone,ends);
                thread46342(tdone,ends);
                thread46343(tdone,ends);
                int biggest46344 = 0;
                if(ends[11]>=biggest46344){
                  biggest46344=ends[11];
                }
                if(ends[12]>=biggest46344){
                  biggest46344=ends[12];
                }
                if(ends[13]>=biggest46344){
                  biggest46344=ends[13];
                }
                if(biggest46344 == 1){
                  active[10]=1;
                  ends[10]=1;
                  tdone[10]=1;
                }
                //FINXME code
                if(biggest46344 == 0){
                  System.out.println("Orch: All done!");//sysj\orchestrator.sysj line: 230, column: 5
                  count_thread_10 = count_thread_10 - 1;//sysj\orchestrator.sysj line: 232, column: 5
                  S44778=1;
                  if(count_thread_10 >= 0){//sysj\orchestrator.sysj line: 234, column: 9
                    System.out.println("Orch: Loading next bottle...");//sysj\orchestrator.sysj line: 236, column: 6
                    sigConveyorReq_1.setPresent();//sysj\orchestrator.sysj line: 237, column: 6
                    currsigs.addElement(sigConveyorReq_1);
                    sigConveyorReq_1.setValue(true);//sysj\orchestrator.sysj line: 237, column: 6
                    S44797=0;
                    active[10]=1;
                    ends[10]=1;
                    tdone[10]=1;
                  }
                  else {
                    S44778=2;
                    active[10]=1;
                    ends[10]=1;
                    tdone[10]=1;
                  }
                }
                break;
              
              case 1 : 
                switch(S44797){
                  case 0 : 
                    if(recConveyorStatus_1.getprestatus()){//sysj\orchestrator.sysj line: 238, column: 12
                      System.out.println("Orch: Loaded new bottle.");//sysj\orchestrator.sysj line: 239, column: 6
                      sigRotaryReq_1.setPresent();//sysj\orchestrator.sysj line: 242, column: 6
                      currsigs.addElement(sigRotaryReq_1);
                      S44797=1;
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
                    if(recRotaryStatus_1.getprestatus()){//sysj\orchestrator.sysj line: 243, column: 12
                      S44778=2;
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
                S44778=2;
                if(count_thread_10 >= 0){//sysj\orchestrator.sysj line: 219, column: 10
                  if(count_thread_10 == 0) {//sysj\orchestrator.sysj line: 221, column: 21
                    System.out.println("Orch: Last bottle. Preparing to send requests..");//sysj\orchestrator.sysj line: 222, column: 6
                  }
                  else {//sysj\orchestrator.sysj line: 223, column: 12
                    System.out.println("Orch: Bottle count " + count_thread_10 + ". Preparing to send requests..");//sysj\orchestrator.sysj line: 224, column: 6
                  }
                  sigFillerReq_1.setPresent();//sysj\orchestrator.sysj line: 226, column: 5
                  currsigs.addElement(sigFillerReq_1);
                  sigFillerReq_1.setValue(liquidPercent_thread_10);//sysj\orchestrator.sysj line: 226, column: 5
                  sigCapLoaderReq_1.setPresent();//sysj\orchestrator.sysj line: 227, column: 5
                  currsigs.addElement(sigCapLoaderReq_1);
                  sigCapperReq_1.setPresent();//sysj\orchestrator.sysj line: 228, column: 5
                  currsigs.addElement(sigCapperReq_1);
                  S44778=0;
                  thread46345(tdone,ends);
                  thread46346(tdone,ends);
                  thread46347(tdone,ends);
                  int biggest46348 = 0;
                  if(ends[11]>=biggest46348){
                    biggest46348=ends[11];
                  }
                  if(ends[12]>=biggest46348){
                    biggest46348=ends[12];
                  }
                  if(ends[13]>=biggest46348){
                    biggest46348=ends[13];
                  }
                  if(biggest46348 == 1){
                    active[10]=1;
                    ends[10]=1;
                    tdone[10]=1;
                  }
                }
                else {
                  ends[10]=2;
                  ;//sysj\orchestrator.sysj line: 219, column: 4
                  System.out.println("Ejecting all bottles");//sysj\orchestrator.sysj line: 249, column: 4
                  if(quantity_thread_10 >= 5) {//sysj\orchestrator.sysj line: 251, column: 23
                    eject_thread_10 = 5;//sysj\orchestrator.sysj line: 252, column: 5
                  }
                  else {//sysj\orchestrator.sysj line: 253, column: 11
                    eject_thread_10 = quantity_thread_10;//sysj\orchestrator.sysj line: 254, column: 5
                  }
                  S44773=4;
                  if(eject_thread_10 >= 0){//sysj\orchestrator.sysj line: 258, column: 11
                    sigRotaryReq_1.setPresent();//sysj\orchestrator.sysj line: 259, column: 5
                    currsigs.addElement(sigRotaryReq_1);
                    S44974=0;
                    active[10]=1;
                    ends[10]=1;
                    tdone[10]=1;
                  }
                  else {
                    ends[10]=2;
                    ;//sysj\orchestrator.sysj line: 258, column: 4
                    System.out.println("Orch: Order complete.");//sysj\orchestrator.sysj line: 267, column: 4
                    S44773=5;
                    active[10]=1;
                    ends[10]=1;
                    tdone[10]=1;
                  }
                }
                break;
              
            }
            break;
          
          case 4 : 
            switch(S44974){
              case 0 : 
                if(recRotaryStatus_1.getprestatus()){//sysj\orchestrator.sysj line: 260, column: 11
                  sigConveyorReq_1.setPresent();//sysj\orchestrator.sysj line: 261, column: 5
                  currsigs.addElement(sigConveyorReq_1);
                  S44974=1;
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
                if(recConveyorStatus_1.getprestatus()){//sysj\orchestrator.sysj line: 262, column: 11
                  eject_thread_10 = eject_thread_10 - 1;//sysj\orchestrator.sysj line: 263, column: 5
                  if(eject_thread_10 >= 0){//sysj\orchestrator.sysj line: 258, column: 11
                    sigRotaryReq_1.setPresent();//sysj\orchestrator.sysj line: 259, column: 5
                    currsigs.addElement(sigRotaryReq_1);
                    S44974=0;
                    active[10]=1;
                    ends[10]=1;
                    tdone[10]=1;
                  }
                  else {
                    ends[10]=2;
                    ;//sysj\orchestrator.sysj line: 258, column: 4
                    System.out.println("Orch: Order complete.");//sysj\orchestrator.sysj line: 267, column: 4
                    S44773=5;
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
            active[10]=1;
            ends[10]=1;
            tdone[10]=1;
            break;
          
          case 6 : 
            S44773=6;
            S44773=0;
            active[10]=1;
            ends[10]=1;
            tdone[10]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread46335(int [] tdone, int [] ends){
        switch(S44770){
      case 0 : 
        active[9]=0;
        ends[9]=0;
        tdone[9]=1;
        break;
      
      case 1 : 
        switch(S43832){
          case 0 : 
            if(sigRotaryReq_1.getprestatus()){//sysj\orchestrator.sysj line: 187, column: 10
              System.out.println("Orch: Sending rotary request");//sysj\orchestrator.sysj line: 188, column: 4
              S43832=1;
              S43839=0;
              if(!rotaryReq_o.isPartnerPresent() || rotaryReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 189, column: 4
                rotaryReq_o.setREQ(false);//sysj\orchestrator.sysj line: 189, column: 4
                S43839=1;
                active[9]=1;
                ends[9]=1;
                tdone[9]=1;
              }
              else {
                S43834=0;
                if(rotaryReq_o.isACK()){//sysj\orchestrator.sysj line: 189, column: 4
                  rotaryReq_o.setVal(true);//sysj\orchestrator.sysj line: 189, column: 4
                  S43834=1;
                  if(!rotaryReq_o.isACK()){//sysj\orchestrator.sysj line: 189, column: 4
                    rotaryReq_o.setREQ(false);//sysj\orchestrator.sysj line: 189, column: 4
                    ends[9]=2;
                    ;//sysj\orchestrator.sysj line: 189, column: 4
                    S43832=2;
                    S43883=0;
                    if(!rotaryStatus_in.isPartnerPresent() || rotaryStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 190, column: 4
                      rotaryStatus_in.setACK(false);//sysj\orchestrator.sysj line: 190, column: 4
                      S43883=1;
                      active[9]=1;
                      ends[9]=1;
                      tdone[9]=1;
                    }
                    else {
                      S43878=0;
                      if(!rotaryStatus_in.isREQ()){//sysj\orchestrator.sysj line: 190, column: 4
                        rotaryStatus_in.setACK(true);//sysj\orchestrator.sysj line: 190, column: 4
                        S43878=1;
                        if(rotaryStatus_in.isREQ()){//sysj\orchestrator.sysj line: 190, column: 4
                          rotaryStatus_in.setACK(false);//sysj\orchestrator.sysj line: 190, column: 4
                          ends[9]=2;
                          ;//sysj\orchestrator.sysj line: 190, column: 4
                          System.out.println("Orch: Received rotary status");//sysj\orchestrator.sysj line: 191, column: 4
                          res_thread_9 = (String)(rotaryStatus_in.getVal() == null ? null : ((String)rotaryStatus_in.getVal()));//sysj\orchestrator.sysj line: 192, column: 4
                          recRotaryStatus_1.setPresent();//sysj\orchestrator.sysj line: 193, column: 4
                          currsigs.addElement(recRotaryStatus_1);
                          recRotaryStatus_1.setValue(res_thread_9);//sysj\orchestrator.sysj line: 193, column: 4
                          S43832=0;
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
            switch(S43839){
              case 0 : 
                if(!rotaryReq_o.isPartnerPresent() || rotaryReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 189, column: 4
                  rotaryReq_o.setREQ(false);//sysj\orchestrator.sysj line: 189, column: 4
                  S43839=1;
                  active[9]=1;
                  ends[9]=1;
                  tdone[9]=1;
                }
                else {
                  switch(S43834){
                    case 0 : 
                      if(rotaryReq_o.isACK()){//sysj\orchestrator.sysj line: 189, column: 4
                        rotaryReq_o.setVal(true);//sysj\orchestrator.sysj line: 189, column: 4
                        S43834=1;
                        if(!rotaryReq_o.isACK()){//sysj\orchestrator.sysj line: 189, column: 4
                          rotaryReq_o.setREQ(false);//sysj\orchestrator.sysj line: 189, column: 4
                          ends[9]=2;
                          ;//sysj\orchestrator.sysj line: 189, column: 4
                          S43832=2;
                          S43883=0;
                          if(!rotaryStatus_in.isPartnerPresent() || rotaryStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 190, column: 4
                            rotaryStatus_in.setACK(false);//sysj\orchestrator.sysj line: 190, column: 4
                            S43883=1;
                            active[9]=1;
                            ends[9]=1;
                            tdone[9]=1;
                          }
                          else {
                            S43878=0;
                            if(!rotaryStatus_in.isREQ()){//sysj\orchestrator.sysj line: 190, column: 4
                              rotaryStatus_in.setACK(true);//sysj\orchestrator.sysj line: 190, column: 4
                              S43878=1;
                              if(rotaryStatus_in.isREQ()){//sysj\orchestrator.sysj line: 190, column: 4
                                rotaryStatus_in.setACK(false);//sysj\orchestrator.sysj line: 190, column: 4
                                ends[9]=2;
                                ;//sysj\orchestrator.sysj line: 190, column: 4
                                System.out.println("Orch: Received rotary status");//sysj\orchestrator.sysj line: 191, column: 4
                                res_thread_9 = (String)(rotaryStatus_in.getVal() == null ? null : ((String)rotaryStatus_in.getVal()));//sysj\orchestrator.sysj line: 192, column: 4
                                recRotaryStatus_1.setPresent();//sysj\orchestrator.sysj line: 193, column: 4
                                currsigs.addElement(recRotaryStatus_1);
                                recRotaryStatus_1.setValue(res_thread_9);//sysj\orchestrator.sysj line: 193, column: 4
                                S43832=0;
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
                      if(!rotaryReq_o.isACK()){//sysj\orchestrator.sysj line: 189, column: 4
                        rotaryReq_o.setREQ(false);//sysj\orchestrator.sysj line: 189, column: 4
                        ends[9]=2;
                        ;//sysj\orchestrator.sysj line: 189, column: 4
                        S43832=2;
                        S43883=0;
                        if(!rotaryStatus_in.isPartnerPresent() || rotaryStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 190, column: 4
                          rotaryStatus_in.setACK(false);//sysj\orchestrator.sysj line: 190, column: 4
                          S43883=1;
                          active[9]=1;
                          ends[9]=1;
                          tdone[9]=1;
                        }
                        else {
                          S43878=0;
                          if(!rotaryStatus_in.isREQ()){//sysj\orchestrator.sysj line: 190, column: 4
                            rotaryStatus_in.setACK(true);//sysj\orchestrator.sysj line: 190, column: 4
                            S43878=1;
                            if(rotaryStatus_in.isREQ()){//sysj\orchestrator.sysj line: 190, column: 4
                              rotaryStatus_in.setACK(false);//sysj\orchestrator.sysj line: 190, column: 4
                              ends[9]=2;
                              ;//sysj\orchestrator.sysj line: 190, column: 4
                              System.out.println("Orch: Received rotary status");//sysj\orchestrator.sysj line: 191, column: 4
                              res_thread_9 = (String)(rotaryStatus_in.getVal() == null ? null : ((String)rotaryStatus_in.getVal()));//sysj\orchestrator.sysj line: 192, column: 4
                              recRotaryStatus_1.setPresent();//sysj\orchestrator.sysj line: 193, column: 4
                              currsigs.addElement(recRotaryStatus_1);
                              recRotaryStatus_1.setValue(res_thread_9);//sysj\orchestrator.sysj line: 193, column: 4
                              S43832=0;
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
                S43839=1;
                S43839=0;
                if(!rotaryReq_o.isPartnerPresent() || rotaryReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 189, column: 4
                  rotaryReq_o.setREQ(false);//sysj\orchestrator.sysj line: 189, column: 4
                  S43839=1;
                  active[9]=1;
                  ends[9]=1;
                  tdone[9]=1;
                }
                else {
                  S43834=0;
                  if(rotaryReq_o.isACK()){//sysj\orchestrator.sysj line: 189, column: 4
                    rotaryReq_o.setVal(true);//sysj\orchestrator.sysj line: 189, column: 4
                    S43834=1;
                    if(!rotaryReq_o.isACK()){//sysj\orchestrator.sysj line: 189, column: 4
                      rotaryReq_o.setREQ(false);//sysj\orchestrator.sysj line: 189, column: 4
                      ends[9]=2;
                      ;//sysj\orchestrator.sysj line: 189, column: 4
                      S43832=2;
                      S43883=0;
                      if(!rotaryStatus_in.isPartnerPresent() || rotaryStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 190, column: 4
                        rotaryStatus_in.setACK(false);//sysj\orchestrator.sysj line: 190, column: 4
                        S43883=1;
                        active[9]=1;
                        ends[9]=1;
                        tdone[9]=1;
                      }
                      else {
                        S43878=0;
                        if(!rotaryStatus_in.isREQ()){//sysj\orchestrator.sysj line: 190, column: 4
                          rotaryStatus_in.setACK(true);//sysj\orchestrator.sysj line: 190, column: 4
                          S43878=1;
                          if(rotaryStatus_in.isREQ()){//sysj\orchestrator.sysj line: 190, column: 4
                            rotaryStatus_in.setACK(false);//sysj\orchestrator.sysj line: 190, column: 4
                            ends[9]=2;
                            ;//sysj\orchestrator.sysj line: 190, column: 4
                            System.out.println("Orch: Received rotary status");//sysj\orchestrator.sysj line: 191, column: 4
                            res_thread_9 = (String)(rotaryStatus_in.getVal() == null ? null : ((String)rotaryStatus_in.getVal()));//sysj\orchestrator.sysj line: 192, column: 4
                            recRotaryStatus_1.setPresent();//sysj\orchestrator.sysj line: 193, column: 4
                            currsigs.addElement(recRotaryStatus_1);
                            recRotaryStatus_1.setValue(res_thread_9);//sysj\orchestrator.sysj line: 193, column: 4
                            S43832=0;
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
            switch(S43883){
              case 0 : 
                if(!rotaryStatus_in.isPartnerPresent() || rotaryStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 190, column: 4
                  rotaryStatus_in.setACK(false);//sysj\orchestrator.sysj line: 190, column: 4
                  S43883=1;
                  active[9]=1;
                  ends[9]=1;
                  tdone[9]=1;
                }
                else {
                  switch(S43878){
                    case 0 : 
                      if(!rotaryStatus_in.isREQ()){//sysj\orchestrator.sysj line: 190, column: 4
                        rotaryStatus_in.setACK(true);//sysj\orchestrator.sysj line: 190, column: 4
                        S43878=1;
                        if(rotaryStatus_in.isREQ()){//sysj\orchestrator.sysj line: 190, column: 4
                          rotaryStatus_in.setACK(false);//sysj\orchestrator.sysj line: 190, column: 4
                          ends[9]=2;
                          ;//sysj\orchestrator.sysj line: 190, column: 4
                          System.out.println("Orch: Received rotary status");//sysj\orchestrator.sysj line: 191, column: 4
                          res_thread_9 = (String)(rotaryStatus_in.getVal() == null ? null : ((String)rotaryStatus_in.getVal()));//sysj\orchestrator.sysj line: 192, column: 4
                          recRotaryStatus_1.setPresent();//sysj\orchestrator.sysj line: 193, column: 4
                          currsigs.addElement(recRotaryStatus_1);
                          recRotaryStatus_1.setValue(res_thread_9);//sysj\orchestrator.sysj line: 193, column: 4
                          S43832=0;
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
                      if(rotaryStatus_in.isREQ()){//sysj\orchestrator.sysj line: 190, column: 4
                        rotaryStatus_in.setACK(false);//sysj\orchestrator.sysj line: 190, column: 4
                        ends[9]=2;
                        ;//sysj\orchestrator.sysj line: 190, column: 4
                        System.out.println("Orch: Received rotary status");//sysj\orchestrator.sysj line: 191, column: 4
                        res_thread_9 = (String)(rotaryStatus_in.getVal() == null ? null : ((String)rotaryStatus_in.getVal()));//sysj\orchestrator.sysj line: 192, column: 4
                        recRotaryStatus_1.setPresent();//sysj\orchestrator.sysj line: 193, column: 4
                        currsigs.addElement(recRotaryStatus_1);
                        recRotaryStatus_1.setValue(res_thread_9);//sysj\orchestrator.sysj line: 193, column: 4
                        S43832=0;
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
                S43883=1;
                S43883=0;
                if(!rotaryStatus_in.isPartnerPresent() || rotaryStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 190, column: 4
                  rotaryStatus_in.setACK(false);//sysj\orchestrator.sysj line: 190, column: 4
                  S43883=1;
                  active[9]=1;
                  ends[9]=1;
                  tdone[9]=1;
                }
                else {
                  S43878=0;
                  if(!rotaryStatus_in.isREQ()){//sysj\orchestrator.sysj line: 190, column: 4
                    rotaryStatus_in.setACK(true);//sysj\orchestrator.sysj line: 190, column: 4
                    S43878=1;
                    if(rotaryStatus_in.isREQ()){//sysj\orchestrator.sysj line: 190, column: 4
                      rotaryStatus_in.setACK(false);//sysj\orchestrator.sysj line: 190, column: 4
                      ends[9]=2;
                      ;//sysj\orchestrator.sysj line: 190, column: 4
                      System.out.println("Orch: Received rotary status");//sysj\orchestrator.sysj line: 191, column: 4
                      res_thread_9 = (String)(rotaryStatus_in.getVal() == null ? null : ((String)rotaryStatus_in.getVal()));//sysj\orchestrator.sysj line: 192, column: 4
                      recRotaryStatus_1.setPresent();//sysj\orchestrator.sysj line: 193, column: 4
                      currsigs.addElement(recRotaryStatus_1);
                      recRotaryStatus_1.setValue(res_thread_9);//sysj\orchestrator.sysj line: 193, column: 4
                      S43832=0;
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

  public void thread46334(int [] tdone, int [] ends){
        switch(S43830){
      case 0 : 
        active[8]=0;
        ends[8]=0;
        tdone[8]=1;
        break;
      
      case 1 : 
        switch(S42892){
          case 0 : 
            if(sigFillerReq_1.getprestatus()){//sysj\orchestrator.sysj line: 174, column: 10
              System.out.println("Orch: Sending filler request");//sysj\orchestrator.sysj line: 175, column: 4
              req_thread_8 = (ArrayList)(sigFillerReq_1.getpreval() == null ? null : ((ArrayList)sigFillerReq_1.getpreval()));//sysj\orchestrator.sysj line: 176, column: 4
              S42892=1;
              S42899=0;
              if(!fillerReq_o.isPartnerPresent() || fillerReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 177, column: 4
                fillerReq_o.setREQ(false);//sysj\orchestrator.sysj line: 177, column: 4
                S42899=1;
                active[8]=1;
                ends[8]=1;
                tdone[8]=1;
              }
              else {
                S42894=0;
                if(fillerReq_o.isACK()){//sysj\orchestrator.sysj line: 177, column: 4
                  fillerReq_o.setVal(req_thread_8);//sysj\orchestrator.sysj line: 177, column: 4
                  S42894=1;
                  if(!fillerReq_o.isACK()){//sysj\orchestrator.sysj line: 177, column: 4
                    fillerReq_o.setREQ(false);//sysj\orchestrator.sysj line: 177, column: 4
                    ends[8]=2;
                    ;//sysj\orchestrator.sysj line: 177, column: 4
                    S42892=2;
                    S42943=0;
                    if(!fillerStatus_in.isPartnerPresent() || fillerStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 178, column: 4
                      fillerStatus_in.setACK(false);//sysj\orchestrator.sysj line: 178, column: 4
                      S42943=1;
                      active[8]=1;
                      ends[8]=1;
                      tdone[8]=1;
                    }
                    else {
                      S42938=0;
                      if(!fillerStatus_in.isREQ()){//sysj\orchestrator.sysj line: 178, column: 4
                        fillerStatus_in.setACK(true);//sysj\orchestrator.sysj line: 178, column: 4
                        S42938=1;
                        if(fillerStatus_in.isREQ()){//sysj\orchestrator.sysj line: 178, column: 4
                          fillerStatus_in.setACK(false);//sysj\orchestrator.sysj line: 178, column: 4
                          ends[8]=2;
                          ;//sysj\orchestrator.sysj line: 178, column: 4
                          System.out.println("Orch: Received filler status");//sysj\orchestrator.sysj line: 179, column: 4
                          res_thread_8 = (String)(fillerStatus_in.getVal() == null ? null : ((String)fillerStatus_in.getVal()));//sysj\orchestrator.sysj line: 180, column: 4
                          recFillerStatus_1.setPresent();//sysj\orchestrator.sysj line: 181, column: 4
                          currsigs.addElement(recFillerStatus_1);
                          recFillerStatus_1.setValue(res_thread_8);//sysj\orchestrator.sysj line: 181, column: 4
                          S42892=0;
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
            switch(S42899){
              case 0 : 
                if(!fillerReq_o.isPartnerPresent() || fillerReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 177, column: 4
                  fillerReq_o.setREQ(false);//sysj\orchestrator.sysj line: 177, column: 4
                  S42899=1;
                  active[8]=1;
                  ends[8]=1;
                  tdone[8]=1;
                }
                else {
                  switch(S42894){
                    case 0 : 
                      if(fillerReq_o.isACK()){//sysj\orchestrator.sysj line: 177, column: 4
                        fillerReq_o.setVal(req_thread_8);//sysj\orchestrator.sysj line: 177, column: 4
                        S42894=1;
                        if(!fillerReq_o.isACK()){//sysj\orchestrator.sysj line: 177, column: 4
                          fillerReq_o.setREQ(false);//sysj\orchestrator.sysj line: 177, column: 4
                          ends[8]=2;
                          ;//sysj\orchestrator.sysj line: 177, column: 4
                          S42892=2;
                          S42943=0;
                          if(!fillerStatus_in.isPartnerPresent() || fillerStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 178, column: 4
                            fillerStatus_in.setACK(false);//sysj\orchestrator.sysj line: 178, column: 4
                            S42943=1;
                            active[8]=1;
                            ends[8]=1;
                            tdone[8]=1;
                          }
                          else {
                            S42938=0;
                            if(!fillerStatus_in.isREQ()){//sysj\orchestrator.sysj line: 178, column: 4
                              fillerStatus_in.setACK(true);//sysj\orchestrator.sysj line: 178, column: 4
                              S42938=1;
                              if(fillerStatus_in.isREQ()){//sysj\orchestrator.sysj line: 178, column: 4
                                fillerStatus_in.setACK(false);//sysj\orchestrator.sysj line: 178, column: 4
                                ends[8]=2;
                                ;//sysj\orchestrator.sysj line: 178, column: 4
                                System.out.println("Orch: Received filler status");//sysj\orchestrator.sysj line: 179, column: 4
                                res_thread_8 = (String)(fillerStatus_in.getVal() == null ? null : ((String)fillerStatus_in.getVal()));//sysj\orchestrator.sysj line: 180, column: 4
                                recFillerStatus_1.setPresent();//sysj\orchestrator.sysj line: 181, column: 4
                                currsigs.addElement(recFillerStatus_1);
                                recFillerStatus_1.setValue(res_thread_8);//sysj\orchestrator.sysj line: 181, column: 4
                                S42892=0;
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
                      if(!fillerReq_o.isACK()){//sysj\orchestrator.sysj line: 177, column: 4
                        fillerReq_o.setREQ(false);//sysj\orchestrator.sysj line: 177, column: 4
                        ends[8]=2;
                        ;//sysj\orchestrator.sysj line: 177, column: 4
                        S42892=2;
                        S42943=0;
                        if(!fillerStatus_in.isPartnerPresent() || fillerStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 178, column: 4
                          fillerStatus_in.setACK(false);//sysj\orchestrator.sysj line: 178, column: 4
                          S42943=1;
                          active[8]=1;
                          ends[8]=1;
                          tdone[8]=1;
                        }
                        else {
                          S42938=0;
                          if(!fillerStatus_in.isREQ()){//sysj\orchestrator.sysj line: 178, column: 4
                            fillerStatus_in.setACK(true);//sysj\orchestrator.sysj line: 178, column: 4
                            S42938=1;
                            if(fillerStatus_in.isREQ()){//sysj\orchestrator.sysj line: 178, column: 4
                              fillerStatus_in.setACK(false);//sysj\orchestrator.sysj line: 178, column: 4
                              ends[8]=2;
                              ;//sysj\orchestrator.sysj line: 178, column: 4
                              System.out.println("Orch: Received filler status");//sysj\orchestrator.sysj line: 179, column: 4
                              res_thread_8 = (String)(fillerStatus_in.getVal() == null ? null : ((String)fillerStatus_in.getVal()));//sysj\orchestrator.sysj line: 180, column: 4
                              recFillerStatus_1.setPresent();//sysj\orchestrator.sysj line: 181, column: 4
                              currsigs.addElement(recFillerStatus_1);
                              recFillerStatus_1.setValue(res_thread_8);//sysj\orchestrator.sysj line: 181, column: 4
                              S42892=0;
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
                S42899=1;
                S42899=0;
                if(!fillerReq_o.isPartnerPresent() || fillerReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 177, column: 4
                  fillerReq_o.setREQ(false);//sysj\orchestrator.sysj line: 177, column: 4
                  S42899=1;
                  active[8]=1;
                  ends[8]=1;
                  tdone[8]=1;
                }
                else {
                  S42894=0;
                  if(fillerReq_o.isACK()){//sysj\orchestrator.sysj line: 177, column: 4
                    fillerReq_o.setVal(req_thread_8);//sysj\orchestrator.sysj line: 177, column: 4
                    S42894=1;
                    if(!fillerReq_o.isACK()){//sysj\orchestrator.sysj line: 177, column: 4
                      fillerReq_o.setREQ(false);//sysj\orchestrator.sysj line: 177, column: 4
                      ends[8]=2;
                      ;//sysj\orchestrator.sysj line: 177, column: 4
                      S42892=2;
                      S42943=0;
                      if(!fillerStatus_in.isPartnerPresent() || fillerStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 178, column: 4
                        fillerStatus_in.setACK(false);//sysj\orchestrator.sysj line: 178, column: 4
                        S42943=1;
                        active[8]=1;
                        ends[8]=1;
                        tdone[8]=1;
                      }
                      else {
                        S42938=0;
                        if(!fillerStatus_in.isREQ()){//sysj\orchestrator.sysj line: 178, column: 4
                          fillerStatus_in.setACK(true);//sysj\orchestrator.sysj line: 178, column: 4
                          S42938=1;
                          if(fillerStatus_in.isREQ()){//sysj\orchestrator.sysj line: 178, column: 4
                            fillerStatus_in.setACK(false);//sysj\orchestrator.sysj line: 178, column: 4
                            ends[8]=2;
                            ;//sysj\orchestrator.sysj line: 178, column: 4
                            System.out.println("Orch: Received filler status");//sysj\orchestrator.sysj line: 179, column: 4
                            res_thread_8 = (String)(fillerStatus_in.getVal() == null ? null : ((String)fillerStatus_in.getVal()));//sysj\orchestrator.sysj line: 180, column: 4
                            recFillerStatus_1.setPresent();//sysj\orchestrator.sysj line: 181, column: 4
                            currsigs.addElement(recFillerStatus_1);
                            recFillerStatus_1.setValue(res_thread_8);//sysj\orchestrator.sysj line: 181, column: 4
                            S42892=0;
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
            switch(S42943){
              case 0 : 
                if(!fillerStatus_in.isPartnerPresent() || fillerStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 178, column: 4
                  fillerStatus_in.setACK(false);//sysj\orchestrator.sysj line: 178, column: 4
                  S42943=1;
                  active[8]=1;
                  ends[8]=1;
                  tdone[8]=1;
                }
                else {
                  switch(S42938){
                    case 0 : 
                      if(!fillerStatus_in.isREQ()){//sysj\orchestrator.sysj line: 178, column: 4
                        fillerStatus_in.setACK(true);//sysj\orchestrator.sysj line: 178, column: 4
                        S42938=1;
                        if(fillerStatus_in.isREQ()){//sysj\orchestrator.sysj line: 178, column: 4
                          fillerStatus_in.setACK(false);//sysj\orchestrator.sysj line: 178, column: 4
                          ends[8]=2;
                          ;//sysj\orchestrator.sysj line: 178, column: 4
                          System.out.println("Orch: Received filler status");//sysj\orchestrator.sysj line: 179, column: 4
                          res_thread_8 = (String)(fillerStatus_in.getVal() == null ? null : ((String)fillerStatus_in.getVal()));//sysj\orchestrator.sysj line: 180, column: 4
                          recFillerStatus_1.setPresent();//sysj\orchestrator.sysj line: 181, column: 4
                          currsigs.addElement(recFillerStatus_1);
                          recFillerStatus_1.setValue(res_thread_8);//sysj\orchestrator.sysj line: 181, column: 4
                          S42892=0;
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
                      if(fillerStatus_in.isREQ()){//sysj\orchestrator.sysj line: 178, column: 4
                        fillerStatus_in.setACK(false);//sysj\orchestrator.sysj line: 178, column: 4
                        ends[8]=2;
                        ;//sysj\orchestrator.sysj line: 178, column: 4
                        System.out.println("Orch: Received filler status");//sysj\orchestrator.sysj line: 179, column: 4
                        res_thread_8 = (String)(fillerStatus_in.getVal() == null ? null : ((String)fillerStatus_in.getVal()));//sysj\orchestrator.sysj line: 180, column: 4
                        recFillerStatus_1.setPresent();//sysj\orchestrator.sysj line: 181, column: 4
                        currsigs.addElement(recFillerStatus_1);
                        recFillerStatus_1.setValue(res_thread_8);//sysj\orchestrator.sysj line: 181, column: 4
                        S42892=0;
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
                S42943=1;
                S42943=0;
                if(!fillerStatus_in.isPartnerPresent() || fillerStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 178, column: 4
                  fillerStatus_in.setACK(false);//sysj\orchestrator.sysj line: 178, column: 4
                  S42943=1;
                  active[8]=1;
                  ends[8]=1;
                  tdone[8]=1;
                }
                else {
                  S42938=0;
                  if(!fillerStatus_in.isREQ()){//sysj\orchestrator.sysj line: 178, column: 4
                    fillerStatus_in.setACK(true);//sysj\orchestrator.sysj line: 178, column: 4
                    S42938=1;
                    if(fillerStatus_in.isREQ()){//sysj\orchestrator.sysj line: 178, column: 4
                      fillerStatus_in.setACK(false);//sysj\orchestrator.sysj line: 178, column: 4
                      ends[8]=2;
                      ;//sysj\orchestrator.sysj line: 178, column: 4
                      System.out.println("Orch: Received filler status");//sysj\orchestrator.sysj line: 179, column: 4
                      res_thread_8 = (String)(fillerStatus_in.getVal() == null ? null : ((String)fillerStatus_in.getVal()));//sysj\orchestrator.sysj line: 180, column: 4
                      recFillerStatus_1.setPresent();//sysj\orchestrator.sysj line: 181, column: 4
                      currsigs.addElement(recFillerStatus_1);
                      recFillerStatus_1.setValue(res_thread_8);//sysj\orchestrator.sysj line: 181, column: 4
                      S42892=0;
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

  public void thread46333(int [] tdone, int [] ends){
        switch(S42890){
      case 0 : 
        active[7]=0;
        ends[7]=0;
        tdone[7]=1;
        break;
      
      case 1 : 
        switch(S41952){
          case 0 : 
            if(sigCapLoaderReq_1.getprestatus()){//sysj\orchestrator.sysj line: 161, column: 10
              System.out.println("Orch: Sending cap loader request");//sysj\orchestrator.sysj line: 162, column: 4
              S41952=1;
              S41959=0;
              if(!capLoaderReq_o.isPartnerPresent() || capLoaderReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 163, column: 4
                capLoaderReq_o.setREQ(false);//sysj\orchestrator.sysj line: 163, column: 4
                S41959=1;
                active[7]=1;
                ends[7]=1;
                tdone[7]=1;
              }
              else {
                S41954=0;
                if(capLoaderReq_o.isACK()){//sysj\orchestrator.sysj line: 163, column: 4
                  capLoaderReq_o.setVal(true);//sysj\orchestrator.sysj line: 163, column: 4
                  S41954=1;
                  if(!capLoaderReq_o.isACK()){//sysj\orchestrator.sysj line: 163, column: 4
                    capLoaderReq_o.setREQ(false);//sysj\orchestrator.sysj line: 163, column: 4
                    ends[7]=2;
                    ;//sysj\orchestrator.sysj line: 163, column: 4
                    S41952=2;
                    S42003=0;
                    if(!capLoaderStatus_in.isPartnerPresent() || capLoaderStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 164, column: 4
                      capLoaderStatus_in.setACK(false);//sysj\orchestrator.sysj line: 164, column: 4
                      S42003=1;
                      active[7]=1;
                      ends[7]=1;
                      tdone[7]=1;
                    }
                    else {
                      S41998=0;
                      if(!capLoaderStatus_in.isREQ()){//sysj\orchestrator.sysj line: 164, column: 4
                        capLoaderStatus_in.setACK(true);//sysj\orchestrator.sysj line: 164, column: 4
                        S41998=1;
                        if(capLoaderStatus_in.isREQ()){//sysj\orchestrator.sysj line: 164, column: 4
                          capLoaderStatus_in.setACK(false);//sysj\orchestrator.sysj line: 164, column: 4
                          ends[7]=2;
                          ;//sysj\orchestrator.sysj line: 164, column: 4
                          System.out.println("Orch: Received cap loader status");//sysj\orchestrator.sysj line: 165, column: 4
                          res_thread_7 = (String)(capLoaderStatus_in.getVal() == null ? null : ((String)capLoaderStatus_in.getVal()));//sysj\orchestrator.sysj line: 167, column: 4
                          recCapLoaderStatus_1.setPresent();//sysj\orchestrator.sysj line: 168, column: 4
                          currsigs.addElement(recCapLoaderStatus_1);
                          recCapLoaderStatus_1.setValue(res_thread_7);//sysj\orchestrator.sysj line: 168, column: 4
                          S41952=0;
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
            switch(S41959){
              case 0 : 
                if(!capLoaderReq_o.isPartnerPresent() || capLoaderReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 163, column: 4
                  capLoaderReq_o.setREQ(false);//sysj\orchestrator.sysj line: 163, column: 4
                  S41959=1;
                  active[7]=1;
                  ends[7]=1;
                  tdone[7]=1;
                }
                else {
                  switch(S41954){
                    case 0 : 
                      if(capLoaderReq_o.isACK()){//sysj\orchestrator.sysj line: 163, column: 4
                        capLoaderReq_o.setVal(true);//sysj\orchestrator.sysj line: 163, column: 4
                        S41954=1;
                        if(!capLoaderReq_o.isACK()){//sysj\orchestrator.sysj line: 163, column: 4
                          capLoaderReq_o.setREQ(false);//sysj\orchestrator.sysj line: 163, column: 4
                          ends[7]=2;
                          ;//sysj\orchestrator.sysj line: 163, column: 4
                          S41952=2;
                          S42003=0;
                          if(!capLoaderStatus_in.isPartnerPresent() || capLoaderStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 164, column: 4
                            capLoaderStatus_in.setACK(false);//sysj\orchestrator.sysj line: 164, column: 4
                            S42003=1;
                            active[7]=1;
                            ends[7]=1;
                            tdone[7]=1;
                          }
                          else {
                            S41998=0;
                            if(!capLoaderStatus_in.isREQ()){//sysj\orchestrator.sysj line: 164, column: 4
                              capLoaderStatus_in.setACK(true);//sysj\orchestrator.sysj line: 164, column: 4
                              S41998=1;
                              if(capLoaderStatus_in.isREQ()){//sysj\orchestrator.sysj line: 164, column: 4
                                capLoaderStatus_in.setACK(false);//sysj\orchestrator.sysj line: 164, column: 4
                                ends[7]=2;
                                ;//sysj\orchestrator.sysj line: 164, column: 4
                                System.out.println("Orch: Received cap loader status");//sysj\orchestrator.sysj line: 165, column: 4
                                res_thread_7 = (String)(capLoaderStatus_in.getVal() == null ? null : ((String)capLoaderStatus_in.getVal()));//sysj\orchestrator.sysj line: 167, column: 4
                                recCapLoaderStatus_1.setPresent();//sysj\orchestrator.sysj line: 168, column: 4
                                currsigs.addElement(recCapLoaderStatus_1);
                                recCapLoaderStatus_1.setValue(res_thread_7);//sysj\orchestrator.sysj line: 168, column: 4
                                S41952=0;
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
                      if(!capLoaderReq_o.isACK()){//sysj\orchestrator.sysj line: 163, column: 4
                        capLoaderReq_o.setREQ(false);//sysj\orchestrator.sysj line: 163, column: 4
                        ends[7]=2;
                        ;//sysj\orchestrator.sysj line: 163, column: 4
                        S41952=2;
                        S42003=0;
                        if(!capLoaderStatus_in.isPartnerPresent() || capLoaderStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 164, column: 4
                          capLoaderStatus_in.setACK(false);//sysj\orchestrator.sysj line: 164, column: 4
                          S42003=1;
                          active[7]=1;
                          ends[7]=1;
                          tdone[7]=1;
                        }
                        else {
                          S41998=0;
                          if(!capLoaderStatus_in.isREQ()){//sysj\orchestrator.sysj line: 164, column: 4
                            capLoaderStatus_in.setACK(true);//sysj\orchestrator.sysj line: 164, column: 4
                            S41998=1;
                            if(capLoaderStatus_in.isREQ()){//sysj\orchestrator.sysj line: 164, column: 4
                              capLoaderStatus_in.setACK(false);//sysj\orchestrator.sysj line: 164, column: 4
                              ends[7]=2;
                              ;//sysj\orchestrator.sysj line: 164, column: 4
                              System.out.println("Orch: Received cap loader status");//sysj\orchestrator.sysj line: 165, column: 4
                              res_thread_7 = (String)(capLoaderStatus_in.getVal() == null ? null : ((String)capLoaderStatus_in.getVal()));//sysj\orchestrator.sysj line: 167, column: 4
                              recCapLoaderStatus_1.setPresent();//sysj\orchestrator.sysj line: 168, column: 4
                              currsigs.addElement(recCapLoaderStatus_1);
                              recCapLoaderStatus_1.setValue(res_thread_7);//sysj\orchestrator.sysj line: 168, column: 4
                              S41952=0;
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
                S41959=1;
                S41959=0;
                if(!capLoaderReq_o.isPartnerPresent() || capLoaderReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 163, column: 4
                  capLoaderReq_o.setREQ(false);//sysj\orchestrator.sysj line: 163, column: 4
                  S41959=1;
                  active[7]=1;
                  ends[7]=1;
                  tdone[7]=1;
                }
                else {
                  S41954=0;
                  if(capLoaderReq_o.isACK()){//sysj\orchestrator.sysj line: 163, column: 4
                    capLoaderReq_o.setVal(true);//sysj\orchestrator.sysj line: 163, column: 4
                    S41954=1;
                    if(!capLoaderReq_o.isACK()){//sysj\orchestrator.sysj line: 163, column: 4
                      capLoaderReq_o.setREQ(false);//sysj\orchestrator.sysj line: 163, column: 4
                      ends[7]=2;
                      ;//sysj\orchestrator.sysj line: 163, column: 4
                      S41952=2;
                      S42003=0;
                      if(!capLoaderStatus_in.isPartnerPresent() || capLoaderStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 164, column: 4
                        capLoaderStatus_in.setACK(false);//sysj\orchestrator.sysj line: 164, column: 4
                        S42003=1;
                        active[7]=1;
                        ends[7]=1;
                        tdone[7]=1;
                      }
                      else {
                        S41998=0;
                        if(!capLoaderStatus_in.isREQ()){//sysj\orchestrator.sysj line: 164, column: 4
                          capLoaderStatus_in.setACK(true);//sysj\orchestrator.sysj line: 164, column: 4
                          S41998=1;
                          if(capLoaderStatus_in.isREQ()){//sysj\orchestrator.sysj line: 164, column: 4
                            capLoaderStatus_in.setACK(false);//sysj\orchestrator.sysj line: 164, column: 4
                            ends[7]=2;
                            ;//sysj\orchestrator.sysj line: 164, column: 4
                            System.out.println("Orch: Received cap loader status");//sysj\orchestrator.sysj line: 165, column: 4
                            res_thread_7 = (String)(capLoaderStatus_in.getVal() == null ? null : ((String)capLoaderStatus_in.getVal()));//sysj\orchestrator.sysj line: 167, column: 4
                            recCapLoaderStatus_1.setPresent();//sysj\orchestrator.sysj line: 168, column: 4
                            currsigs.addElement(recCapLoaderStatus_1);
                            recCapLoaderStatus_1.setValue(res_thread_7);//sysj\orchestrator.sysj line: 168, column: 4
                            S41952=0;
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
            switch(S42003){
              case 0 : 
                if(!capLoaderStatus_in.isPartnerPresent() || capLoaderStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 164, column: 4
                  capLoaderStatus_in.setACK(false);//sysj\orchestrator.sysj line: 164, column: 4
                  S42003=1;
                  active[7]=1;
                  ends[7]=1;
                  tdone[7]=1;
                }
                else {
                  switch(S41998){
                    case 0 : 
                      if(!capLoaderStatus_in.isREQ()){//sysj\orchestrator.sysj line: 164, column: 4
                        capLoaderStatus_in.setACK(true);//sysj\orchestrator.sysj line: 164, column: 4
                        S41998=1;
                        if(capLoaderStatus_in.isREQ()){//sysj\orchestrator.sysj line: 164, column: 4
                          capLoaderStatus_in.setACK(false);//sysj\orchestrator.sysj line: 164, column: 4
                          ends[7]=2;
                          ;//sysj\orchestrator.sysj line: 164, column: 4
                          System.out.println("Orch: Received cap loader status");//sysj\orchestrator.sysj line: 165, column: 4
                          res_thread_7 = (String)(capLoaderStatus_in.getVal() == null ? null : ((String)capLoaderStatus_in.getVal()));//sysj\orchestrator.sysj line: 167, column: 4
                          recCapLoaderStatus_1.setPresent();//sysj\orchestrator.sysj line: 168, column: 4
                          currsigs.addElement(recCapLoaderStatus_1);
                          recCapLoaderStatus_1.setValue(res_thread_7);//sysj\orchestrator.sysj line: 168, column: 4
                          S41952=0;
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
                      if(capLoaderStatus_in.isREQ()){//sysj\orchestrator.sysj line: 164, column: 4
                        capLoaderStatus_in.setACK(false);//sysj\orchestrator.sysj line: 164, column: 4
                        ends[7]=2;
                        ;//sysj\orchestrator.sysj line: 164, column: 4
                        System.out.println("Orch: Received cap loader status");//sysj\orchestrator.sysj line: 165, column: 4
                        res_thread_7 = (String)(capLoaderStatus_in.getVal() == null ? null : ((String)capLoaderStatus_in.getVal()));//sysj\orchestrator.sysj line: 167, column: 4
                        recCapLoaderStatus_1.setPresent();//sysj\orchestrator.sysj line: 168, column: 4
                        currsigs.addElement(recCapLoaderStatus_1);
                        recCapLoaderStatus_1.setValue(res_thread_7);//sysj\orchestrator.sysj line: 168, column: 4
                        S41952=0;
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
                S42003=1;
                S42003=0;
                if(!capLoaderStatus_in.isPartnerPresent() || capLoaderStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 164, column: 4
                  capLoaderStatus_in.setACK(false);//sysj\orchestrator.sysj line: 164, column: 4
                  S42003=1;
                  active[7]=1;
                  ends[7]=1;
                  tdone[7]=1;
                }
                else {
                  S41998=0;
                  if(!capLoaderStatus_in.isREQ()){//sysj\orchestrator.sysj line: 164, column: 4
                    capLoaderStatus_in.setACK(true);//sysj\orchestrator.sysj line: 164, column: 4
                    S41998=1;
                    if(capLoaderStatus_in.isREQ()){//sysj\orchestrator.sysj line: 164, column: 4
                      capLoaderStatus_in.setACK(false);//sysj\orchestrator.sysj line: 164, column: 4
                      ends[7]=2;
                      ;//sysj\orchestrator.sysj line: 164, column: 4
                      System.out.println("Orch: Received cap loader status");//sysj\orchestrator.sysj line: 165, column: 4
                      res_thread_7 = (String)(capLoaderStatus_in.getVal() == null ? null : ((String)capLoaderStatus_in.getVal()));//sysj\orchestrator.sysj line: 167, column: 4
                      recCapLoaderStatus_1.setPresent();//sysj\orchestrator.sysj line: 168, column: 4
                      currsigs.addElement(recCapLoaderStatus_1);
                      recCapLoaderStatus_1.setValue(res_thread_7);//sysj\orchestrator.sysj line: 168, column: 4
                      S41952=0;
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

  public void thread46332(int [] tdone, int [] ends){
        switch(S41950){
      case 0 : 
        active[6]=0;
        ends[6]=0;
        tdone[6]=1;
        break;
      
      case 1 : 
        switch(S41012){
          case 0 : 
            if(sigCapperReq_1.getprestatus()){//sysj\orchestrator.sysj line: 149, column: 10
              System.out.println("Orch: Sending capper request");//sysj\orchestrator.sysj line: 150, column: 4
              S41012=1;
              S41019=0;
              if(!capperReq_o.isPartnerPresent() || capperReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 151, column: 4
                capperReq_o.setREQ(false);//sysj\orchestrator.sysj line: 151, column: 4
                S41019=1;
                active[6]=1;
                ends[6]=1;
                tdone[6]=1;
              }
              else {
                S41014=0;
                if(capperReq_o.isACK()){//sysj\orchestrator.sysj line: 151, column: 4
                  capperReq_o.setVal(true);//sysj\orchestrator.sysj line: 151, column: 4
                  S41014=1;
                  if(!capperReq_o.isACK()){//sysj\orchestrator.sysj line: 151, column: 4
                    capperReq_o.setREQ(false);//sysj\orchestrator.sysj line: 151, column: 4
                    ends[6]=2;
                    ;//sysj\orchestrator.sysj line: 151, column: 4
                    S41012=2;
                    S41063=0;
                    if(!capperStatus_in.isPartnerPresent() || capperStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 152, column: 4
                      capperStatus_in.setACK(false);//sysj\orchestrator.sysj line: 152, column: 4
                      S41063=1;
                      active[6]=1;
                      ends[6]=1;
                      tdone[6]=1;
                    }
                    else {
                      S41058=0;
                      if(!capperStatus_in.isREQ()){//sysj\orchestrator.sysj line: 152, column: 4
                        capperStatus_in.setACK(true);//sysj\orchestrator.sysj line: 152, column: 4
                        S41058=1;
                        if(capperStatus_in.isREQ()){//sysj\orchestrator.sysj line: 152, column: 4
                          capperStatus_in.setACK(false);//sysj\orchestrator.sysj line: 152, column: 4
                          ends[6]=2;
                          ;//sysj\orchestrator.sysj line: 152, column: 4
                          System.out.println("Orch: Received capper status");//sysj\orchestrator.sysj line: 153, column: 4
                          res_thread_6 = (String)(capperStatus_in.getVal() == null ? null : ((String)capperStatus_in.getVal()));//sysj\orchestrator.sysj line: 154, column: 4
                          recCapperStatus_1.setPresent();//sysj\orchestrator.sysj line: 155, column: 4
                          currsigs.addElement(recCapperStatus_1);
                          recCapperStatus_1.setValue(res_thread_6);//sysj\orchestrator.sysj line: 155, column: 4
                          S41012=0;
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
            switch(S41019){
              case 0 : 
                if(!capperReq_o.isPartnerPresent() || capperReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 151, column: 4
                  capperReq_o.setREQ(false);//sysj\orchestrator.sysj line: 151, column: 4
                  S41019=1;
                  active[6]=1;
                  ends[6]=1;
                  tdone[6]=1;
                }
                else {
                  switch(S41014){
                    case 0 : 
                      if(capperReq_o.isACK()){//sysj\orchestrator.sysj line: 151, column: 4
                        capperReq_o.setVal(true);//sysj\orchestrator.sysj line: 151, column: 4
                        S41014=1;
                        if(!capperReq_o.isACK()){//sysj\orchestrator.sysj line: 151, column: 4
                          capperReq_o.setREQ(false);//sysj\orchestrator.sysj line: 151, column: 4
                          ends[6]=2;
                          ;//sysj\orchestrator.sysj line: 151, column: 4
                          S41012=2;
                          S41063=0;
                          if(!capperStatus_in.isPartnerPresent() || capperStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 152, column: 4
                            capperStatus_in.setACK(false);//sysj\orchestrator.sysj line: 152, column: 4
                            S41063=1;
                            active[6]=1;
                            ends[6]=1;
                            tdone[6]=1;
                          }
                          else {
                            S41058=0;
                            if(!capperStatus_in.isREQ()){//sysj\orchestrator.sysj line: 152, column: 4
                              capperStatus_in.setACK(true);//sysj\orchestrator.sysj line: 152, column: 4
                              S41058=1;
                              if(capperStatus_in.isREQ()){//sysj\orchestrator.sysj line: 152, column: 4
                                capperStatus_in.setACK(false);//sysj\orchestrator.sysj line: 152, column: 4
                                ends[6]=2;
                                ;//sysj\orchestrator.sysj line: 152, column: 4
                                System.out.println("Orch: Received capper status");//sysj\orchestrator.sysj line: 153, column: 4
                                res_thread_6 = (String)(capperStatus_in.getVal() == null ? null : ((String)capperStatus_in.getVal()));//sysj\orchestrator.sysj line: 154, column: 4
                                recCapperStatus_1.setPresent();//sysj\orchestrator.sysj line: 155, column: 4
                                currsigs.addElement(recCapperStatus_1);
                                recCapperStatus_1.setValue(res_thread_6);//sysj\orchestrator.sysj line: 155, column: 4
                                S41012=0;
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
                      if(!capperReq_o.isACK()){//sysj\orchestrator.sysj line: 151, column: 4
                        capperReq_o.setREQ(false);//sysj\orchestrator.sysj line: 151, column: 4
                        ends[6]=2;
                        ;//sysj\orchestrator.sysj line: 151, column: 4
                        S41012=2;
                        S41063=0;
                        if(!capperStatus_in.isPartnerPresent() || capperStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 152, column: 4
                          capperStatus_in.setACK(false);//sysj\orchestrator.sysj line: 152, column: 4
                          S41063=1;
                          active[6]=1;
                          ends[6]=1;
                          tdone[6]=1;
                        }
                        else {
                          S41058=0;
                          if(!capperStatus_in.isREQ()){//sysj\orchestrator.sysj line: 152, column: 4
                            capperStatus_in.setACK(true);//sysj\orchestrator.sysj line: 152, column: 4
                            S41058=1;
                            if(capperStatus_in.isREQ()){//sysj\orchestrator.sysj line: 152, column: 4
                              capperStatus_in.setACK(false);//sysj\orchestrator.sysj line: 152, column: 4
                              ends[6]=2;
                              ;//sysj\orchestrator.sysj line: 152, column: 4
                              System.out.println("Orch: Received capper status");//sysj\orchestrator.sysj line: 153, column: 4
                              res_thread_6 = (String)(capperStatus_in.getVal() == null ? null : ((String)capperStatus_in.getVal()));//sysj\orchestrator.sysj line: 154, column: 4
                              recCapperStatus_1.setPresent();//sysj\orchestrator.sysj line: 155, column: 4
                              currsigs.addElement(recCapperStatus_1);
                              recCapperStatus_1.setValue(res_thread_6);//sysj\orchestrator.sysj line: 155, column: 4
                              S41012=0;
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
                S41019=1;
                S41019=0;
                if(!capperReq_o.isPartnerPresent() || capperReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 151, column: 4
                  capperReq_o.setREQ(false);//sysj\orchestrator.sysj line: 151, column: 4
                  S41019=1;
                  active[6]=1;
                  ends[6]=1;
                  tdone[6]=1;
                }
                else {
                  S41014=0;
                  if(capperReq_o.isACK()){//sysj\orchestrator.sysj line: 151, column: 4
                    capperReq_o.setVal(true);//sysj\orchestrator.sysj line: 151, column: 4
                    S41014=1;
                    if(!capperReq_o.isACK()){//sysj\orchestrator.sysj line: 151, column: 4
                      capperReq_o.setREQ(false);//sysj\orchestrator.sysj line: 151, column: 4
                      ends[6]=2;
                      ;//sysj\orchestrator.sysj line: 151, column: 4
                      S41012=2;
                      S41063=0;
                      if(!capperStatus_in.isPartnerPresent() || capperStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 152, column: 4
                        capperStatus_in.setACK(false);//sysj\orchestrator.sysj line: 152, column: 4
                        S41063=1;
                        active[6]=1;
                        ends[6]=1;
                        tdone[6]=1;
                      }
                      else {
                        S41058=0;
                        if(!capperStatus_in.isREQ()){//sysj\orchestrator.sysj line: 152, column: 4
                          capperStatus_in.setACK(true);//sysj\orchestrator.sysj line: 152, column: 4
                          S41058=1;
                          if(capperStatus_in.isREQ()){//sysj\orchestrator.sysj line: 152, column: 4
                            capperStatus_in.setACK(false);//sysj\orchestrator.sysj line: 152, column: 4
                            ends[6]=2;
                            ;//sysj\orchestrator.sysj line: 152, column: 4
                            System.out.println("Orch: Received capper status");//sysj\orchestrator.sysj line: 153, column: 4
                            res_thread_6 = (String)(capperStatus_in.getVal() == null ? null : ((String)capperStatus_in.getVal()));//sysj\orchestrator.sysj line: 154, column: 4
                            recCapperStatus_1.setPresent();//sysj\orchestrator.sysj line: 155, column: 4
                            currsigs.addElement(recCapperStatus_1);
                            recCapperStatus_1.setValue(res_thread_6);//sysj\orchestrator.sysj line: 155, column: 4
                            S41012=0;
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
            switch(S41063){
              case 0 : 
                if(!capperStatus_in.isPartnerPresent() || capperStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 152, column: 4
                  capperStatus_in.setACK(false);//sysj\orchestrator.sysj line: 152, column: 4
                  S41063=1;
                  active[6]=1;
                  ends[6]=1;
                  tdone[6]=1;
                }
                else {
                  switch(S41058){
                    case 0 : 
                      if(!capperStatus_in.isREQ()){//sysj\orchestrator.sysj line: 152, column: 4
                        capperStatus_in.setACK(true);//sysj\orchestrator.sysj line: 152, column: 4
                        S41058=1;
                        if(capperStatus_in.isREQ()){//sysj\orchestrator.sysj line: 152, column: 4
                          capperStatus_in.setACK(false);//sysj\orchestrator.sysj line: 152, column: 4
                          ends[6]=2;
                          ;//sysj\orchestrator.sysj line: 152, column: 4
                          System.out.println("Orch: Received capper status");//sysj\orchestrator.sysj line: 153, column: 4
                          res_thread_6 = (String)(capperStatus_in.getVal() == null ? null : ((String)capperStatus_in.getVal()));//sysj\orchestrator.sysj line: 154, column: 4
                          recCapperStatus_1.setPresent();//sysj\orchestrator.sysj line: 155, column: 4
                          currsigs.addElement(recCapperStatus_1);
                          recCapperStatus_1.setValue(res_thread_6);//sysj\orchestrator.sysj line: 155, column: 4
                          S41012=0;
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
                      if(capperStatus_in.isREQ()){//sysj\orchestrator.sysj line: 152, column: 4
                        capperStatus_in.setACK(false);//sysj\orchestrator.sysj line: 152, column: 4
                        ends[6]=2;
                        ;//sysj\orchestrator.sysj line: 152, column: 4
                        System.out.println("Orch: Received capper status");//sysj\orchestrator.sysj line: 153, column: 4
                        res_thread_6 = (String)(capperStatus_in.getVal() == null ? null : ((String)capperStatus_in.getVal()));//sysj\orchestrator.sysj line: 154, column: 4
                        recCapperStatus_1.setPresent();//sysj\orchestrator.sysj line: 155, column: 4
                        currsigs.addElement(recCapperStatus_1);
                        recCapperStatus_1.setValue(res_thread_6);//sysj\orchestrator.sysj line: 155, column: 4
                        S41012=0;
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
                S41063=1;
                S41063=0;
                if(!capperStatus_in.isPartnerPresent() || capperStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 152, column: 4
                  capperStatus_in.setACK(false);//sysj\orchestrator.sysj line: 152, column: 4
                  S41063=1;
                  active[6]=1;
                  ends[6]=1;
                  tdone[6]=1;
                }
                else {
                  S41058=0;
                  if(!capperStatus_in.isREQ()){//sysj\orchestrator.sysj line: 152, column: 4
                    capperStatus_in.setACK(true);//sysj\orchestrator.sysj line: 152, column: 4
                    S41058=1;
                    if(capperStatus_in.isREQ()){//sysj\orchestrator.sysj line: 152, column: 4
                      capperStatus_in.setACK(false);//sysj\orchestrator.sysj line: 152, column: 4
                      ends[6]=2;
                      ;//sysj\orchestrator.sysj line: 152, column: 4
                      System.out.println("Orch: Received capper status");//sysj\orchestrator.sysj line: 153, column: 4
                      res_thread_6 = (String)(capperStatus_in.getVal() == null ? null : ((String)capperStatus_in.getVal()));//sysj\orchestrator.sysj line: 154, column: 4
                      recCapperStatus_1.setPresent();//sysj\orchestrator.sysj line: 155, column: 4
                      currsigs.addElement(recCapperStatus_1);
                      recCapperStatus_1.setValue(res_thread_6);//sysj\orchestrator.sysj line: 155, column: 4
                      S41012=0;
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

  public void thread46331(int [] tdone, int [] ends){
        switch(S41010){
      case 0 : 
        active[5]=0;
        ends[5]=0;
        tdone[5]=1;
        break;
      
      case 1 : 
        switch(S40116){
          case 0 : 
            if(sigConveyorReq_1.getprestatus()){//sysj\orchestrator.sysj line: 139, column: 10
              S40116=1;
              S40078=0;
              if(!conveyorReq_o.isPartnerPresent() || conveyorReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 140, column: 4
                conveyorReq_o.setREQ(false);//sysj\orchestrator.sysj line: 140, column: 4
                S40078=1;
                active[5]=1;
                ends[5]=1;
                tdone[5]=1;
              }
              else {
                S40073=0;
                if(conveyorReq_o.isACK()){//sysj\orchestrator.sysj line: 140, column: 4
                  conveyorReq_o.setVal(true);//sysj\orchestrator.sysj line: 140, column: 4
                  S40073=1;
                  if(!conveyorReq_o.isACK()){//sysj\orchestrator.sysj line: 140, column: 4
                    conveyorReq_o.setREQ(false);//sysj\orchestrator.sysj line: 140, column: 4
                    ends[5]=2;
                    ;//sysj\orchestrator.sysj line: 140, column: 4
                    S40116=2;
                    S40123=0;
                    if(!conveyorStatus_in.isPartnerPresent() || conveyorStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 141, column: 4
                      conveyorStatus_in.setACK(false);//sysj\orchestrator.sysj line: 141, column: 4
                      S40123=1;
                      active[5]=1;
                      ends[5]=1;
                      tdone[5]=1;
                    }
                    else {
                      S40118=0;
                      if(!conveyorStatus_in.isREQ()){//sysj\orchestrator.sysj line: 141, column: 4
                        conveyorStatus_in.setACK(true);//sysj\orchestrator.sysj line: 141, column: 4
                        S40118=1;
                        if(conveyorStatus_in.isREQ()){//sysj\orchestrator.sysj line: 141, column: 4
                          conveyorStatus_in.setACK(false);//sysj\orchestrator.sysj line: 141, column: 4
                          ends[5]=2;
                          ;//sysj\orchestrator.sysj line: 141, column: 4
                          res_thread_5 = (String)(conveyorStatus_in.getVal() == null ? null : ((String)conveyorStatus_in.getVal()));//sysj\orchestrator.sysj line: 142, column: 4
                          recConveyorStatus_1.setPresent();//sysj\orchestrator.sysj line: 143, column: 4
                          currsigs.addElement(recConveyorStatus_1);
                          recConveyorStatus_1.setValue(res_thread_5);//sysj\orchestrator.sysj line: 143, column: 4
                          S40116=0;
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
            switch(S40078){
              case 0 : 
                if(!conveyorReq_o.isPartnerPresent() || conveyorReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 140, column: 4
                  conveyorReq_o.setREQ(false);//sysj\orchestrator.sysj line: 140, column: 4
                  S40078=1;
                  active[5]=1;
                  ends[5]=1;
                  tdone[5]=1;
                }
                else {
                  switch(S40073){
                    case 0 : 
                      if(conveyorReq_o.isACK()){//sysj\orchestrator.sysj line: 140, column: 4
                        conveyorReq_o.setVal(true);//sysj\orchestrator.sysj line: 140, column: 4
                        S40073=1;
                        if(!conveyorReq_o.isACK()){//sysj\orchestrator.sysj line: 140, column: 4
                          conveyorReq_o.setREQ(false);//sysj\orchestrator.sysj line: 140, column: 4
                          ends[5]=2;
                          ;//sysj\orchestrator.sysj line: 140, column: 4
                          S40116=2;
                          S40123=0;
                          if(!conveyorStatus_in.isPartnerPresent() || conveyorStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 141, column: 4
                            conveyorStatus_in.setACK(false);//sysj\orchestrator.sysj line: 141, column: 4
                            S40123=1;
                            active[5]=1;
                            ends[5]=1;
                            tdone[5]=1;
                          }
                          else {
                            S40118=0;
                            if(!conveyorStatus_in.isREQ()){//sysj\orchestrator.sysj line: 141, column: 4
                              conveyorStatus_in.setACK(true);//sysj\orchestrator.sysj line: 141, column: 4
                              S40118=1;
                              if(conveyorStatus_in.isREQ()){//sysj\orchestrator.sysj line: 141, column: 4
                                conveyorStatus_in.setACK(false);//sysj\orchestrator.sysj line: 141, column: 4
                                ends[5]=2;
                                ;//sysj\orchestrator.sysj line: 141, column: 4
                                res_thread_5 = (String)(conveyorStatus_in.getVal() == null ? null : ((String)conveyorStatus_in.getVal()));//sysj\orchestrator.sysj line: 142, column: 4
                                recConveyorStatus_1.setPresent();//sysj\orchestrator.sysj line: 143, column: 4
                                currsigs.addElement(recConveyorStatus_1);
                                recConveyorStatus_1.setValue(res_thread_5);//sysj\orchestrator.sysj line: 143, column: 4
                                S40116=0;
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
                      if(!conveyorReq_o.isACK()){//sysj\orchestrator.sysj line: 140, column: 4
                        conveyorReq_o.setREQ(false);//sysj\orchestrator.sysj line: 140, column: 4
                        ends[5]=2;
                        ;//sysj\orchestrator.sysj line: 140, column: 4
                        S40116=2;
                        S40123=0;
                        if(!conveyorStatus_in.isPartnerPresent() || conveyorStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 141, column: 4
                          conveyorStatus_in.setACK(false);//sysj\orchestrator.sysj line: 141, column: 4
                          S40123=1;
                          active[5]=1;
                          ends[5]=1;
                          tdone[5]=1;
                        }
                        else {
                          S40118=0;
                          if(!conveyorStatus_in.isREQ()){//sysj\orchestrator.sysj line: 141, column: 4
                            conveyorStatus_in.setACK(true);//sysj\orchestrator.sysj line: 141, column: 4
                            S40118=1;
                            if(conveyorStatus_in.isREQ()){//sysj\orchestrator.sysj line: 141, column: 4
                              conveyorStatus_in.setACK(false);//sysj\orchestrator.sysj line: 141, column: 4
                              ends[5]=2;
                              ;//sysj\orchestrator.sysj line: 141, column: 4
                              res_thread_5 = (String)(conveyorStatus_in.getVal() == null ? null : ((String)conveyorStatus_in.getVal()));//sysj\orchestrator.sysj line: 142, column: 4
                              recConveyorStatus_1.setPresent();//sysj\orchestrator.sysj line: 143, column: 4
                              currsigs.addElement(recConveyorStatus_1);
                              recConveyorStatus_1.setValue(res_thread_5);//sysj\orchestrator.sysj line: 143, column: 4
                              S40116=0;
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
                S40078=1;
                S40078=0;
                if(!conveyorReq_o.isPartnerPresent() || conveyorReq_o.isPartnerPreempted()){//sysj\orchestrator.sysj line: 140, column: 4
                  conveyorReq_o.setREQ(false);//sysj\orchestrator.sysj line: 140, column: 4
                  S40078=1;
                  active[5]=1;
                  ends[5]=1;
                  tdone[5]=1;
                }
                else {
                  S40073=0;
                  if(conveyorReq_o.isACK()){//sysj\orchestrator.sysj line: 140, column: 4
                    conveyorReq_o.setVal(true);//sysj\orchestrator.sysj line: 140, column: 4
                    S40073=1;
                    if(!conveyorReq_o.isACK()){//sysj\orchestrator.sysj line: 140, column: 4
                      conveyorReq_o.setREQ(false);//sysj\orchestrator.sysj line: 140, column: 4
                      ends[5]=2;
                      ;//sysj\orchestrator.sysj line: 140, column: 4
                      S40116=2;
                      S40123=0;
                      if(!conveyorStatus_in.isPartnerPresent() || conveyorStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 141, column: 4
                        conveyorStatus_in.setACK(false);//sysj\orchestrator.sysj line: 141, column: 4
                        S40123=1;
                        active[5]=1;
                        ends[5]=1;
                        tdone[5]=1;
                      }
                      else {
                        S40118=0;
                        if(!conveyorStatus_in.isREQ()){//sysj\orchestrator.sysj line: 141, column: 4
                          conveyorStatus_in.setACK(true);//sysj\orchestrator.sysj line: 141, column: 4
                          S40118=1;
                          if(conveyorStatus_in.isREQ()){//sysj\orchestrator.sysj line: 141, column: 4
                            conveyorStatus_in.setACK(false);//sysj\orchestrator.sysj line: 141, column: 4
                            ends[5]=2;
                            ;//sysj\orchestrator.sysj line: 141, column: 4
                            res_thread_5 = (String)(conveyorStatus_in.getVal() == null ? null : ((String)conveyorStatus_in.getVal()));//sysj\orchestrator.sysj line: 142, column: 4
                            recConveyorStatus_1.setPresent();//sysj\orchestrator.sysj line: 143, column: 4
                            currsigs.addElement(recConveyorStatus_1);
                            recConveyorStatus_1.setValue(res_thread_5);//sysj\orchestrator.sysj line: 143, column: 4
                            S40116=0;
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
            switch(S40123){
              case 0 : 
                if(!conveyorStatus_in.isPartnerPresent() || conveyorStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 141, column: 4
                  conveyorStatus_in.setACK(false);//sysj\orchestrator.sysj line: 141, column: 4
                  S40123=1;
                  active[5]=1;
                  ends[5]=1;
                  tdone[5]=1;
                }
                else {
                  switch(S40118){
                    case 0 : 
                      if(!conveyorStatus_in.isREQ()){//sysj\orchestrator.sysj line: 141, column: 4
                        conveyorStatus_in.setACK(true);//sysj\orchestrator.sysj line: 141, column: 4
                        S40118=1;
                        if(conveyorStatus_in.isREQ()){//sysj\orchestrator.sysj line: 141, column: 4
                          conveyorStatus_in.setACK(false);//sysj\orchestrator.sysj line: 141, column: 4
                          ends[5]=2;
                          ;//sysj\orchestrator.sysj line: 141, column: 4
                          res_thread_5 = (String)(conveyorStatus_in.getVal() == null ? null : ((String)conveyorStatus_in.getVal()));//sysj\orchestrator.sysj line: 142, column: 4
                          recConveyorStatus_1.setPresent();//sysj\orchestrator.sysj line: 143, column: 4
                          currsigs.addElement(recConveyorStatus_1);
                          recConveyorStatus_1.setValue(res_thread_5);//sysj\orchestrator.sysj line: 143, column: 4
                          S40116=0;
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
                      if(conveyorStatus_in.isREQ()){//sysj\orchestrator.sysj line: 141, column: 4
                        conveyorStatus_in.setACK(false);//sysj\orchestrator.sysj line: 141, column: 4
                        ends[5]=2;
                        ;//sysj\orchestrator.sysj line: 141, column: 4
                        res_thread_5 = (String)(conveyorStatus_in.getVal() == null ? null : ((String)conveyorStatus_in.getVal()));//sysj\orchestrator.sysj line: 142, column: 4
                        recConveyorStatus_1.setPresent();//sysj\orchestrator.sysj line: 143, column: 4
                        currsigs.addElement(recConveyorStatus_1);
                        recConveyorStatus_1.setValue(res_thread_5);//sysj\orchestrator.sysj line: 143, column: 4
                        S40116=0;
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
                S40123=1;
                S40123=0;
                if(!conveyorStatus_in.isPartnerPresent() || conveyorStatus_in.isPartnerPreempted()){//sysj\orchestrator.sysj line: 141, column: 4
                  conveyorStatus_in.setACK(false);//sysj\orchestrator.sysj line: 141, column: 4
                  S40123=1;
                  active[5]=1;
                  ends[5]=1;
                  tdone[5]=1;
                }
                else {
                  S40118=0;
                  if(!conveyorStatus_in.isREQ()){//sysj\orchestrator.sysj line: 141, column: 4
                    conveyorStatus_in.setACK(true);//sysj\orchestrator.sysj line: 141, column: 4
                    S40118=1;
                    if(conveyorStatus_in.isREQ()){//sysj\orchestrator.sysj line: 141, column: 4
                      conveyorStatus_in.setACK(false);//sysj\orchestrator.sysj line: 141, column: 4
                      ends[5]=2;
                      ;//sysj\orchestrator.sysj line: 141, column: 4
                      res_thread_5 = (String)(conveyorStatus_in.getVal() == null ? null : ((String)conveyorStatus_in.getVal()));//sysj\orchestrator.sysj line: 142, column: 4
                      recConveyorStatus_1.setPresent();//sysj\orchestrator.sysj line: 143, column: 4
                      currsigs.addElement(recConveyorStatus_1);
                      recConveyorStatus_1.setValue(res_thread_5);//sysj\orchestrator.sysj line: 143, column: 4
                      S40116=0;
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

  public void thread46330(int [] tdone, int [] ends){
        switch(S40070){
      case 0 : 
        active[4]=0;
        ends[4]=0;
        tdone[4]=1;
        break;
      
      case 1 : 
        if(startOrder_1.getprestatus()){//sysj\orchestrator.sysj line: 121, column: 13
          if(currentOrder_1.getprestatus()){//sysj\orchestrator.sysj line: 122, column: 14
            myOrder_thread_4 = (currentOrder_1.getpreval() == null ? null : ((Order)currentOrder_1.getpreval()));//sysj\orchestrator.sysj line: 123, column: 7
            currentOrder_1.setPresent();//sysj\orchestrator.sysj line: 126, column: 8
            currsigs.addElement(currentOrder_1);
            currentOrder_1.setValue(myOrder_thread_4);//sysj\orchestrator.sysj line: 126, column: 8
            foundCurrentOrder_1.setPresent();//sysj\orchestrator.sysj line: 127, column: 8
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

  public void thread46329(int [] tdone, int [] ends){
        switch(S40044){
      case 0 : 
        active[3]=0;
        ends[3]=0;
        tdone[3]=1;
        break;
      
      case 1 : 
        switch(S40032){
          case 0 : 
            if(currentOrder_1.getprestatus()){//sysj\orchestrator.sysj line: 110, column: 11
              S40032=1;
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            else {
              initABS_1.setPresent();//sysj\orchestrator.sysj line: 111, column: 6
              currsigs.addElement(initABS_1);
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            break;
          
          case 1 : 
            S40032=1;
            S40032=0;
            initABS_1.setPresent();//sysj\orchestrator.sysj line: 111, column: 6
            currsigs.addElement(initABS_1);
            active[3]=1;
            ends[3]=1;
            tdone[3]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread46328(int [] tdone, int [] ends){
        switch(S40027){
      case 0 : 
        active[2]=0;
        ends[2]=0;
        tdone[2]=1;
        break;
      
      case 1 : 
        switch(S38690){
          case 0 : 
            if(recOrderStatus.getprestatus()){//sysj\orchestrator.sysj line: 58, column: 13
              System.out.println("orch received: recOrderStatus");//sysj\orchestrator.sysj line: 62, column: 7
              S38690=1;
              if(orderIsDone_1.getprestatus()){//sysj\orchestrator.sysj line: 68, column: 13
                if(currentOrder_1.getprestatus()){//sysj\orchestrator.sysj line: 69, column: 14
                  tempOrder_thread_2 = (currentOrder_1.getpreval() == null ? null : ((Order)currentOrder_1.getpreval()));//sysj\orchestrator.sysj line: 70, column: 7
                  tempOrder_thread_2.setOrderStatus("Done");//sysj\orchestrator.sysj line: 72, column: 7
                  S38470=0;
                  orderStatus.setPresent();//sysj\orchestrator.sysj line: 74, column: 8
                  currsigs.addElement(orderStatus);
                  orderStatus.setValue(tempOrder_thread_2);//sysj\orchestrator.sysj line: 74, column: 8
                  active[2]=1;
                  ends[2]=1;
                  tdone[2]=1;
                }
                else {
                  S38690=2;
                  active[2]=1;
                  ends[2]=1;
                  tdone[2]=1;
                }
              }
              else {
                S38690=2;
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
            switch(S38470){
              case 0 : 
                if(recOrderStatus.getprestatus()){//sysj\orchestrator.sysj line: 73, column: 13
                  System.out.println("initialising next order...");//sysj\orchestrator.sysj line: 78, column: 7
                  S38470=1;
                  if(!fifoQueue_thread_2.isEmpty()){//sysj\orchestrator.sysj line: 79, column: 10
                    nextOrder_thread_2 = (Order)fifoQueue_thread_2.get(0);//sysj\orchestrator.sysj line: 80, column: 8
                    fifoQueue_thread_2.remove(0);//sysj\orchestrator.sysj line: 81, column: 8
                    currentOrder_1.setPresent();//sysj\orchestrator.sysj line: 85, column: 9
                    currsigs.addElement(currentOrder_1);
                    currentOrder_1.setValue(nextOrder_thread_2);//sysj\orchestrator.sysj line: 85, column: 9
                    startOrder_1.setPresent();//sysj\orchestrator.sysj line: 86, column: 9
                    currsigs.addElement(startOrder_1);
                    nextOrder_thread_2.setOrderStatus("Started");//sysj\orchestrator.sysj line: 90, column: 8
                    System.out.println("emitting next orderstatus: started");//sysj\orchestrator.sysj line: 91, column: 8
                    orderStatus.setPresent();//sysj\orchestrator.sysj line: 93, column: 9
                    currsigs.addElement(orderStatus);
                    orderStatus.setValue(nextOrder_thread_2);//sysj\orchestrator.sysj line: 93, column: 9
                    active[2]=1;
                    ends[2]=1;
                    tdone[2]=1;
                  }
                  else {
                    S38690=2;
                    active[2]=1;
                    ends[2]=1;
                    tdone[2]=1;
                  }
                }
                else {
                  orderStatus.setPresent();//sysj\orchestrator.sysj line: 74, column: 8
                  currsigs.addElement(orderStatus);
                  orderStatus.setValue(tempOrder_thread_2);//sysj\orchestrator.sysj line: 74, column: 8
                  active[2]=1;
                  ends[2]=1;
                  tdone[2]=1;
                }
                break;
              
              case 1 : 
                if(recOrderStatus.getprestatus()){//sysj\orchestrator.sysj line: 92, column: 14
                  S38690=2;
                  active[2]=1;
                  ends[2]=1;
                  tdone[2]=1;
                }
                else {
                  orderStatus.setPresent();//sysj\orchestrator.sysj line: 93, column: 9
                  currsigs.addElement(orderStatus);
                  orderStatus.setValue(nextOrder_thread_2);//sysj\orchestrator.sysj line: 93, column: 9
                  active[2]=1;
                  ends[2]=1;
                  tdone[2]=1;
                }
                break;
              
            }
            break;
          
          case 2 : 
            S38690=2;
            S38690=0;
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
                S38690=1;
                if(orderIsDone_1.getprestatus()){//sysj\orchestrator.sysj line: 68, column: 13
                  if(currentOrder_1.getprestatus()){//sysj\orchestrator.sysj line: 69, column: 14
                    tempOrder_thread_2 = (currentOrder_1.getpreval() == null ? null : ((Order)currentOrder_1.getpreval()));//sysj\orchestrator.sysj line: 70, column: 7
                    tempOrder_thread_2.setOrderStatus("Done");//sysj\orchestrator.sysj line: 72, column: 7
                    S38470=0;
                    orderStatus.setPresent();//sysj\orchestrator.sysj line: 74, column: 8
                    currsigs.addElement(orderStatus);
                    orderStatus.setValue(tempOrder_thread_2);//sysj\orchestrator.sysj line: 74, column: 8
                    active[2]=1;
                    ends[2]=1;
                    tdone[2]=1;
                  }
                  else {
                    S38690=2;
                    active[2]=1;
                    ends[2]=1;
                    tdone[2]=1;
                  }
                }
                else {
                  S38690=2;
                  active[2]=1;
                  ends[2]=1;
                  tdone[2]=1;
                }
              }
            }
            else {
              S38690=1;
              if(orderIsDone_1.getprestatus()){//sysj\orchestrator.sysj line: 68, column: 13
                if(currentOrder_1.getprestatus()){//sysj\orchestrator.sysj line: 69, column: 14
                  tempOrder_thread_2 = (currentOrder_1.getpreval() == null ? null : ((Order)currentOrder_1.getpreval()));//sysj\orchestrator.sysj line: 70, column: 7
                  tempOrder_thread_2.setOrderStatus("Done");//sysj\orchestrator.sysj line: 72, column: 7
                  S38470=0;
                  orderStatus.setPresent();//sysj\orchestrator.sysj line: 74, column: 8
                  currsigs.addElement(orderStatus);
                  orderStatus.setValue(tempOrder_thread_2);//sysj\orchestrator.sysj line: 74, column: 8
                  active[2]=1;
                  ends[2]=1;
                  tdone[2]=1;
                }
                else {
                  S38690=2;
                  active[2]=1;
                  ends[2]=1;
                  tdone[2]=1;
                }
              }
              else {
                S38690=2;
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

  public void thread46326(int [] tdone, int [] ends){
        S46314=1;
    quantity_thread_10 = 0;//sysj\orchestrator.sysj line: 199, column: 3
    count_thread_10 = 0;//sysj\orchestrator.sysj line: 200, column: 3
    eject_thread_10 = 0;//sysj\orchestrator.sysj line: 201, column: 3
        S44773=0;
    active[10]=1;
    ends[10]=1;
    tdone[10]=1;
  }

  public void thread46325(int [] tdone, int [] ends){
        S44770=1;
    S43832=0;
    active[9]=1;
    ends[9]=1;
    tdone[9]=1;
  }

  public void thread46324(int [] tdone, int [] ends){
        S43830=1;
    S42892=0;
    active[8]=1;
    ends[8]=1;
    tdone[8]=1;
  }

  public void thread46323(int [] tdone, int [] ends){
        S42890=1;
    S41952=0;
    active[7]=1;
    ends[7]=1;
    tdone[7]=1;
  }

  public void thread46322(int [] tdone, int [] ends){
        S41950=1;
    S41012=0;
    active[6]=1;
    ends[6]=1;
    tdone[6]=1;
  }

  public void thread46321(int [] tdone, int [] ends){
        S41010=1;
    S40116=0;
    active[5]=1;
    ends[5]=1;
    tdone[5]=1;
  }

  public void thread46320(int [] tdone, int [] ends){
        S40070=1;
    if(startOrder_1.getprestatus()){//sysj\orchestrator.sysj line: 121, column: 13
      if(currentOrder_1.getprestatus()){//sysj\orchestrator.sysj line: 122, column: 14
        myOrder_thread_4 = (currentOrder_1.getpreval() == null ? null : ((Order)currentOrder_1.getpreval()));//sysj\orchestrator.sysj line: 123, column: 7
        currentOrder_1.setPresent();//sysj\orchestrator.sysj line: 126, column: 8
        currsigs.addElement(currentOrder_1);
        currentOrder_1.setValue(myOrder_thread_4);//sysj\orchestrator.sysj line: 126, column: 8
        foundCurrentOrder_1.setPresent();//sysj\orchestrator.sysj line: 127, column: 8
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

  public void thread46319(int [] tdone, int [] ends){
        S40044=1;
    S40032=0;
    initABS_1.setPresent();//sysj\orchestrator.sysj line: 111, column: 6
    currsigs.addElement(initABS_1);
    active[3]=1;
    ends[3]=1;
    tdone[3]=1;
  }

  public void thread46318(int [] tdone, int [] ends){
        S40027=1;
    fifoQueue_thread_2 = new ArrayList();//sysj\orchestrator.sysj line: 25, column: 3
    S38690=0;
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
        S38690=1;
        if(orderIsDone_1.getprestatus()){//sysj\orchestrator.sysj line: 68, column: 13
          if(currentOrder_1.getprestatus()){//sysj\orchestrator.sysj line: 69, column: 14
            tempOrder_thread_2 = (currentOrder_1.getpreval() == null ? null : ((Order)currentOrder_1.getpreval()));//sysj\orchestrator.sysj line: 70, column: 7
            tempOrder_thread_2.setOrderStatus("Done");//sysj\orchestrator.sysj line: 72, column: 7
            S38470=0;
            orderStatus.setPresent();//sysj\orchestrator.sysj line: 74, column: 8
            currsigs.addElement(orderStatus);
            orderStatus.setValue(tempOrder_thread_2);//sysj\orchestrator.sysj line: 74, column: 8
            active[2]=1;
            ends[2]=1;
            tdone[2]=1;
          }
          else {
            S38690=2;
            active[2]=1;
            ends[2]=1;
            tdone[2]=1;
          }
        }
        else {
          S38690=2;
          active[2]=1;
          ends[2]=1;
          tdone[2]=1;
        }
      }
    }
    else {
      S38690=1;
      if(orderIsDone_1.getprestatus()){//sysj\orchestrator.sysj line: 68, column: 13
        if(currentOrder_1.getprestatus()){//sysj\orchestrator.sysj line: 69, column: 14
          tempOrder_thread_2 = (currentOrder_1.getpreval() == null ? null : ((Order)currentOrder_1.getpreval()));//sysj\orchestrator.sysj line: 70, column: 7
          tempOrder_thread_2.setOrderStatus("Done");//sysj\orchestrator.sysj line: 72, column: 7
          S38470=0;
          orderStatus.setPresent();//sysj\orchestrator.sysj line: 74, column: 8
          currsigs.addElement(orderStatus);
          orderStatus.setValue(tempOrder_thread_2);//sysj\orchestrator.sysj line: 74, column: 8
          active[2]=1;
          ends[2]=1;
          tdone[2]=1;
        }
        else {
          S38690=2;
          active[2]=1;
          ends[2]=1;
          tdone[2]=1;
        }
      }
      else {
        S38690=2;
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
      switch(S46316){
        case 0 : 
          S46316=0;
          break RUN;
        
        case 1 : 
          S46316=2;
          S46316=2;
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
          thread46318(tdone,ends);
          thread46319(tdone,ends);
          thread46320(tdone,ends);
          thread46321(tdone,ends);
          thread46322(tdone,ends);
          thread46323(tdone,ends);
          thread46324(tdone,ends);
          thread46325(tdone,ends);
          thread46326(tdone,ends);
          int biggest46327 = 0;
          if(ends[2]>=biggest46327){
            biggest46327=ends[2];
          }
          if(ends[3]>=biggest46327){
            biggest46327=ends[3];
          }
          if(ends[4]>=biggest46327){
            biggest46327=ends[4];
          }
          if(ends[5]>=biggest46327){
            biggest46327=ends[5];
          }
          if(ends[6]>=biggest46327){
            biggest46327=ends[6];
          }
          if(ends[7]>=biggest46327){
            biggest46327=ends[7];
          }
          if(ends[8]>=biggest46327){
            biggest46327=ends[8];
          }
          if(ends[9]>=biggest46327){
            biggest46327=ends[9];
          }
          if(ends[10]>=biggest46327){
            biggest46327=ends[10];
          }
          if(biggest46327 == 1){
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
          thread46328(tdone,ends);
          thread46329(tdone,ends);
          thread46330(tdone,ends);
          thread46331(tdone,ends);
          thread46332(tdone,ends);
          thread46333(tdone,ends);
          thread46334(tdone,ends);
          thread46335(tdone,ends);
          thread46336(tdone,ends);
          int biggest46349 = 0;
          if(ends[2]>=biggest46349){
            biggest46349=ends[2];
          }
          if(ends[3]>=biggest46349){
            biggest46349=ends[3];
          }
          if(ends[4]>=biggest46349){
            biggest46349=ends[4];
          }
          if(ends[5]>=biggest46349){
            biggest46349=ends[5];
          }
          if(ends[6]>=biggest46349){
            biggest46349=ends[6];
          }
          if(ends[7]>=biggest46349){
            biggest46349=ends[7];
          }
          if(ends[8]>=biggest46349){
            biggest46349=ends[8];
          }
          if(ends[9]>=biggest46349){
            biggest46349=ends[9];
          }
          if(ends[10]>=biggest46349){
            biggest46349=ends[10];
          }
          if(biggest46349 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
          //FINXME code
          if(biggest46349 == 0){
            S46316=0;
            active[1]=0;
            ends[1]=0;
            S46316=0;
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
