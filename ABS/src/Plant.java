import java.util.*;
import com.systemj.ClockDomain;
import com.systemj.Signal;
import com.systemj.input_Channel;
import com.systemj.output_Channel;
import run.GUI;//sysj\plant.sysj line: 1, column: 2

public class Plant extends ClockDomain{
  public Plant(String name){super(name);}
  Vector currsigs = new Vector();
  private boolean df = false;
  private char [] active;
  private char [] paused;
  private char [] suspended;
  public Signal motConveyorOnOff = new Signal("motConveyorOnOff", Signal.INPUT);
  public Signal enable = new Signal("enable", Signal.INPUT);
  public Signal refill = new Signal("refill", Signal.INPUT);
  public Signal valveInjectorOnOff = new Signal("valveInjectorOnOff", Signal.INPUT);
  public Signal valveInletOnOff = new Signal("valveInletOnOff", Signal.INPUT);
  public Signal dosUnitValveRetract = new Signal("dosUnitValveRetract", Signal.INPUT);
  public Signal dosUnitValveExtend = new Signal("dosUnitValveExtend", Signal.INPUT);
  public Signal bottleAtPos1 = new Signal("bottleAtPos1", Signal.OUTPUT);
  public Signal bottleAtPos5 = new Signal("bottleAtPos5", Signal.OUTPUT);
  public Signal bottleAtPos1E = new Signal("bottleAtPos1E", Signal.OUTPUT);
  public Signal bottleAtPos5E = new Signal("bottleAtPos5E", Signal.OUTPUT);
  public Signal motConveyorOnOffE = new Signal("motConveyorOnOffE", Signal.OUTPUT);
  public Signal fillerReq = new Signal("fillerReq", Signal.OUTPUT);
  public Signal selectCanister = new Signal("selectCanister", Signal.OUTPUT);
  public Signal percentLiquid = new Signal("percentLiquid", Signal.OUTPUT);
  public Signal bottleAtPos2 = new Signal("bottleAtPos2", Signal.OUTPUT);
  public Signal dosUnitEvac = new Signal("dosUnitEvac", Signal.OUTPUT);
  public Signal dosUnitFilled = new Signal("dosUnitFilled", Signal.OUTPUT);
  public Signal currentlySelectedCanister = new Signal("currentlySelectedCanister", Signal.OUTPUT);
  private int S1122 = 1;
  private int S243 = 1;
  private int S148 = 1;
  private int S141 = 1;
  private int S602 = 1;
  private int S360 = 1;
  private int S349 = 1;
  private int S329 = 1;
  private int S285 = 1;
  private int S249 = 1;
  private int S254 = 1;
  private int S259 = 1;
  private int S264 = 1;
  private int S334 = 1;
  private int S333 = 1;
  private int S357 = 1;
  private int S354 = 1;
  private int S628 = 1;
  private int S610 = 1;
  private int S618 = 1;
  private int S626 = 1;
  
  private int[] ends = new int[16];
  private int[] tdone = new int[16];
  
  public void thread1162(int [] tdone, int [] ends){
        switch(S626){
      case 0 : 
        active[15]=0;
        ends[15]=0;
        tdone[15]=1;
        break;
      
      case 1 : 
        if(bottleAtPos5.getprestatus()){//sysj\plant.sysj line: 263, column: 25
          bottleAtPos5E.setPresent();//sysj\plant.sysj line: 263, column: 39
          currsigs.addElement(bottleAtPos5E);
          active[15]=1;
          ends[15]=1;
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

  public void thread1161(int [] tdone, int [] ends){
        switch(S618){
      case 0 : 
        active[14]=0;
        ends[14]=0;
        tdone[14]=1;
        break;
      
      case 1 : 
        if(bottleAtPos1.getprestatus()){//sysj\plant.sysj line: 261, column: 24
          bottleAtPos1E.setPresent();//sysj\plant.sysj line: 261, column: 38
          currsigs.addElement(bottleAtPos1E);
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
  }

  public void thread1160(int [] tdone, int [] ends){
        switch(S610){
      case 0 : 
        active[13]=0;
        ends[13]=0;
        tdone[13]=1;
        break;
      
      case 1 : 
        if(motConveyorOnOff.getprestatus()){//sysj\plant.sysj line: 259, column: 25
          motConveyorOnOffE.setPresent();//sysj\plant.sysj line: 259, column: 43
          currsigs.addElement(motConveyorOnOffE);
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

  public void thread1159(int [] tdone, int [] ends){
        switch(S628){
      case 0 : 
        active[12]=0;
        ends[12]=0;
        tdone[12]=1;
        break;
      
      case 1 : 
        thread1160(tdone,ends);
        thread1161(tdone,ends);
        thread1162(tdone,ends);
        int biggest1163 = 0;
        if(ends[13]>=biggest1163){
          biggest1163=ends[13];
        }
        if(ends[14]>=biggest1163){
          biggest1163=ends[14];
        }
        if(ends[15]>=biggest1163){
          biggest1163=ends[15];
        }
        if(biggest1163 == 1){
          active[12]=1;
          ends[12]=1;
          tdone[12]=1;
        }
        //FINXME code
        if(biggest1163 == 0){
          S628=0;
          active[12]=0;
          ends[12]=0;
          tdone[12]=1;
        }
        break;
      
    }
  }

  public void thread1157(int [] tdone, int [] ends){
        S357=1;
    S354=0;
    dosUnitEvac.setPresent();//sysj\plant.sysj line: 134, column: 8
    currsigs.addElement(dosUnitEvac);
    active[11]=1;
    ends[11]=1;
    tdone[11]=1;
  }

  public void thread1156(int [] tdone, int [] ends){
        S349=1;
    S329=0;
    active[4]=1;
    ends[4]=1;
    tdone[4]=1;
  }

  public void thread1154(int [] tdone, int [] ends){
        switch(S357){
      case 0 : 
        active[11]=0;
        ends[11]=0;
        tdone[11]=1;
        break;
      
      case 1 : 
        switch(S354){
          case 0 : 
            if(dosUnitValveRetract.getprestatus()){//sysj\plant.sysj line: 133, column: 13
              System.out.println("Canister at top");//sysj\plant.sysj line: 136, column: 7
              S354=1;
              active[11]=1;
              ends[11]=1;
              tdone[11]=1;
            }
            else {
              dosUnitEvac.setPresent();//sysj\plant.sysj line: 134, column: 8
              currsigs.addElement(dosUnitEvac);
              active[11]=1;
              ends[11]=1;
              tdone[11]=1;
            }
            break;
          
          case 1 : 
            if(dosUnitValveExtend.getprestatus()){//sysj\plant.sysj line: 138, column: 13
              System.out.println("Canister at bottom");//sysj\plant.sysj line: 139, column: 7
              S354=2;
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
          
          case 2 : 
            S354=2;
            S357=0;
            active[11]=0;
            ends[11]=0;
            tdone[11]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread1152(int [] tdone, int [] ends){
        active[10]=0;
    ends[10]=0;
    tdone[10]=1;
  }

  public void thread1151(int [] tdone, int [] ends){
        switch(S334){
      case 0 : 
        active[9]=0;
        ends[9]=0;
        tdone[9]=1;
        break;
      
      case 1 : 
        switch(S333){
        }
        break;
      
    }
  }

  public void thread1149(int [] tdone, int [] ends){
        currentlySelectedCanister.setPresent();//sysj\plant.sysj line: 115, column: 36
    currsigs.addElement(currentlySelectedCanister);
    currentlySelectedCanister.setValue(2);//sysj\plant.sysj line: 115, column: 36
    active[10]=0;
    ends[10]=0;
    tdone[10]=1;
  }

  public void thread1148(int [] tdone, int [] ends){
        S334=1;
    selectCanister.setPresent();//sysj\plant.sysj line: 115, column: 7
    currsigs.addElement(selectCanister);
    selectCanister.setValue(2);//sysj\plant.sysj line: 115, column: 7
    S334=0;
    active[9]=0;
    ends[9]=0;
    tdone[9]=1;
  }

  public void thread1146(int [] tdone, int [] ends){
        switch(S264){
      case 0 : 
        active[8]=0;
        ends[8]=0;
        tdone[8]=1;
        break;
      
      case 1 : 
        bottleAtPos2.setPresent();//sysj\plant.sysj line: 109, column: 8
        currsigs.addElement(bottleAtPos2);
        active[8]=1;
        ends[8]=1;
        tdone[8]=1;
        break;
      
    }
  }

  public void thread1145(int [] tdone, int [] ends){
        switch(S259){
      case 0 : 
        active[7]=0;
        ends[7]=0;
        tdone[7]=1;
        break;
      
      case 1 : 
        percentLiquid.setPresent();//sysj\plant.sysj line: 108, column: 8
        currsigs.addElement(percentLiquid);
        active[7]=1;
        ends[7]=1;
        tdone[7]=1;
        break;
      
    }
  }

  public void thread1144(int [] tdone, int [] ends){
        switch(S254){
      case 0 : 
        active[6]=0;
        ends[6]=0;
        tdone[6]=1;
        break;
      
      case 1 : 
        selectCanister.setPresent();//sysj\plant.sysj line: 107, column: 8
        currsigs.addElement(selectCanister);
        active[6]=1;
        ends[6]=1;
        tdone[6]=1;
        break;
      
    }
  }

  public void thread1143(int [] tdone, int [] ends){
        switch(S249){
      case 0 : 
        active[5]=0;
        ends[5]=0;
        tdone[5]=1;
        break;
      
      case 1 : 
        fillerReq.setPresent();//sysj\plant.sysj line: 106, column: 8
        currsigs.addElement(fillerReq);
        active[5]=1;
        ends[5]=1;
        tdone[5]=1;
        break;
      
    }
  }

  public void thread1141(int [] tdone, int [] ends){
        S264=1;
    bottleAtPos2.setPresent();//sysj\plant.sysj line: 109, column: 8
    currsigs.addElement(bottleAtPos2);
    active[8]=1;
    ends[8]=1;
    tdone[8]=1;
  }

  public void thread1140(int [] tdone, int [] ends){
        S259=1;
    percentLiquid.setPresent();//sysj\plant.sysj line: 108, column: 8
    currsigs.addElement(percentLiquid);
    active[7]=1;
    ends[7]=1;
    tdone[7]=1;
  }

  public void thread1139(int [] tdone, int [] ends){
        S254=1;
    selectCanister.setPresent();//sysj\plant.sysj line: 107, column: 8
    currsigs.addElement(selectCanister);
    active[6]=1;
    ends[6]=1;
    tdone[6]=1;
  }

  public void thread1138(int [] tdone, int [] ends){
        S249=1;
    fillerReq.setPresent();//sysj\plant.sysj line: 106, column: 8
    currsigs.addElement(fillerReq);
    active[5]=1;
    ends[5]=1;
    tdone[5]=1;
  }

  public void thread1137(int [] tdone, int [] ends){
        switch(S349){
      case 0 : 
        active[4]=0;
        ends[4]=0;
        tdone[4]=1;
        break;
      
      case 1 : 
        switch(S329){
          case 0 : 
            if(enable.getprestatus()){//sysj\plant.sysj line: 100, column: 12
              S329=1;
              System.out.println("bottle at pos2");//sysj\plant.sysj line: 104, column: 7
              S285=0;
              thread1138(tdone,ends);
              thread1139(tdone,ends);
              thread1140(tdone,ends);
              thread1141(tdone,ends);
              int biggest1142 = 0;
              if(ends[5]>=biggest1142){
                biggest1142=ends[5];
              }
              if(ends[6]>=biggest1142){
                biggest1142=ends[6];
              }
              if(ends[7]>=biggest1142){
                biggest1142=ends[7];
              }
              if(ends[8]>=biggest1142){
                biggest1142=ends[8];
              }
              if(biggest1142 == 1){
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
          
          case 1 : 
            if(!enable.getprestatus()){//sysj\plant.sysj line: 102, column: 12
              S329=2;
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            else {
              switch(S285){
                case 0 : 
                  thread1143(tdone,ends);
                  thread1144(tdone,ends);
                  thread1145(tdone,ends);
                  thread1146(tdone,ends);
                  int biggest1147 = 0;
                  if(ends[5]>=biggest1147){
                    biggest1147=ends[5];
                  }
                  if(ends[6]>=biggest1147){
                    biggest1147=ends[6];
                  }
                  if(ends[7]>=biggest1147){
                    biggest1147=ends[7];
                  }
                  if(ends[8]>=biggest1147){
                    biggest1147=ends[8];
                  }
                  if(biggest1147 == 1){
                    active[4]=1;
                    ends[4]=1;
                    tdone[4]=1;
                  }
                  //FINXME code
                  if(biggest1147 == 0){
                    S285=1;
                    active[4]=1;
                    ends[4]=1;
                    tdone[4]=1;
                  }
                  break;
                
                case 1 : 
                  S285=1;
                  S329=2;
                  active[4]=1;
                  ends[4]=1;
                  tdone[4]=1;
                  break;
                
              }
            }
            break;
          
          case 2 : 
            if(enable.getprestatus()){//sysj\plant.sysj line: 113, column: 12
              S329=3;
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            else {
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            break;
          
          case 3 : 
            S329=3;
            S329=4;
            thread1148(tdone,ends);
            thread1149(tdone,ends);
            int biggest1150 = 0;
            if(ends[9]>=biggest1150){
              biggest1150=ends[9];
            }
            if(ends[10]>=biggest1150){
              biggest1150=ends[10];
            }
            //FINXME code
            if(biggest1150 == 0){
              System.out.println("Canister selection");//sysj\plant.sysj line: 116, column: 6
              S329=5;
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            break;
          
          case 4 : 
            thread1151(tdone,ends);
            thread1152(tdone,ends);
            int biggest1153 = 0;
            if(ends[9]>=biggest1153){
              biggest1153=ends[9];
            }
            if(ends[10]>=biggest1153){
              biggest1153=ends[10];
            }
            //FINXME code
            if(biggest1153 == 0){
              System.out.println("Canister selection");//sysj\plant.sysj line: 116, column: 6
              S329=5;
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            break;
          
          case 5 : 
            if(enable.getprestatus()){//sysj\plant.sysj line: 118, column: 12
              if(valveInletOnOff.getprestatus()){//sysj\plant.sysj line: 119, column: 14
                dosUnitFilled.setPresent();//sysj\plant.sysj line: 120, column: 7
                currsigs.addElement(dosUnitFilled);
                System.out.println("Bottle plant filled");//sysj\plant.sysj line: 122, column: 6
                S329=6;
                active[4]=1;
                ends[4]=1;
                tdone[4]=1;
              }
              else {
                System.out.println("Bottle plant filled");//sysj\plant.sysj line: 122, column: 6
                S329=6;
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
          
          case 6 : 
            if(enable.getprestatus()){//sysj\plant.sysj line: 123, column: 12
              S329=7;
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            else {
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            break;
          
          case 7 : 
            S329=7;
            S349=0;
            active[4]=0;
            ends[4]=0;
            tdone[4]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread1136(int [] tdone, int [] ends){
        switch(S602){
      case 0 : 
        active[3]=0;
        ends[3]=0;
        tdone[3]=1;
        break;
      
      case 1 : 
        switch(S360){
          case 0 : 
            thread1137(tdone,ends);
            thread1154(tdone,ends);
            int biggest1155 = 0;
            if(ends[4]>=biggest1155){
              biggest1155=ends[4];
            }
            if(ends[11]>=biggest1155){
              biggest1155=ends[11];
            }
            if(biggest1155 == 1){
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            //FINXME code
            if(biggest1155 == 0){
              S360=1;
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            break;
          
          case 1 : 
            if(enable.getprestatus()){//sysj\plant.sysj line: 144, column: 12
              S360=2;
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            else {
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            break;
          
          case 2 : 
            if(enable.getprestatus()){//sysj\plant.sysj line: 145, column: 12
              S360=0;
              thread1156(tdone,ends);
              thread1157(tdone,ends);
              int biggest1158 = 0;
              if(ends[4]>=biggest1158){
                biggest1158=ends[4];
              }
              if(ends[11]>=biggest1158){
                biggest1158=ends[11];
              }
              if(biggest1158 == 1){
                active[3]=1;
                ends[3]=1;
                tdone[3]=1;
              }
            }
            else {
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread1135(int [] tdone, int [] ends){
        switch(S243){
      case 0 : 
        active[2]=0;
        ends[2]=0;
        tdone[2]=1;
        break;
      
      case 1 : 
        switch(S148){
          case 0 : 
            if(enable.getprestatus()){//sysj\plant.sysj line: 60, column: 10
              S148=1;
              S141=0;
              bottleAtPos5.setPresent();//sysj\plant.sysj line: 65, column: 5
              currsigs.addElement(bottleAtPos5);
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            else {
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            break;
          
          case 1 : 
            if(!enable.getprestatus()){//sysj\plant.sysj line: 62, column: 10
              S148=2;
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            else {
              switch(S141){
                case 0 : 
                  bottleAtPos5.setPresent();//sysj\plant.sysj line: 65, column: 5
                  currsigs.addElement(bottleAtPos5);
                  active[2]=1;
                  ends[2]=1;
                  tdone[2]=1;
                  break;
                
                case 1 : 
                  S141=1;
                  S148=2;
                  active[2]=1;
                  ends[2]=1;
                  tdone[2]=1;
                  break;
                
              }
            }
            break;
          
          case 2 : 
            if(enable.getprestatus()){//sysj\plant.sysj line: 71, column: 10
              S148=3;
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            else {
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            break;
          
          case 3 : 
            S148=3;
            S148=4;
            bottleAtPos1.setPresent();//sysj\plant.sysj line: 77, column: 6
            currsigs.addElement(bottleAtPos1);
            active[2]=1;
            ends[2]=1;
            tdone[2]=1;
            break;
          
          case 4 : 
            if(valveInjectorOnOff.getprestatus()){//sysj\plant.sysj line: 75, column: 10
              S148=5;
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            else {
              bottleAtPos1.setPresent();//sysj\plant.sysj line: 77, column: 6
              currsigs.addElement(bottleAtPos1);
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            break;
          
          case 5 : 
            if(!enable.getprestatus()){//sysj\plant.sysj line: 80, column: 10
              S148=6;
              bottleAtPos1.setPresent();//sysj\plant.sysj line: 83, column: 5
              currsigs.addElement(bottleAtPos1);
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            else {
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            break;
          
          case 6 : 
            if(enable.getprestatus()){//sysj\plant.sysj line: 82, column: 10
              S148=7;
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            else {
              bottleAtPos1.setPresent();//sysj\plant.sysj line: 83, column: 5
              currsigs.addElement(bottleAtPos1);
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            break;
          
          case 7 : 
            if(enable.getprestatus()){//sysj\plant.sysj line: 87, column: 10
              S148=8;
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            else {
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            break;
          
          case 8 : 
            S148=8;
            S148=0;
            active[2]=1;
            ends[2]=1;
            tdone[2]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread1132(int [] tdone, int [] ends){
        S626=1;
    if(bottleAtPos5.getprestatus()){//sysj\plant.sysj line: 263, column: 25
      bottleAtPos5E.setPresent();//sysj\plant.sysj line: 263, column: 39
      currsigs.addElement(bottleAtPos5E);
      active[15]=1;
      ends[15]=1;
      tdone[15]=1;
    }
    else {
      active[15]=1;
      ends[15]=1;
      tdone[15]=1;
    }
  }

  public void thread1131(int [] tdone, int [] ends){
        S618=1;
    if(bottleAtPos1.getprestatus()){//sysj\plant.sysj line: 261, column: 24
      bottleAtPos1E.setPresent();//sysj\plant.sysj line: 261, column: 38
      currsigs.addElement(bottleAtPos1E);
      active[14]=1;
      ends[14]=1;
      tdone[14]=1;
    }
    else {
      active[14]=1;
      ends[14]=1;
      tdone[14]=1;
    }
  }

  public void thread1130(int [] tdone, int [] ends){
        S610=1;
    if(motConveyorOnOff.getprestatus()){//sysj\plant.sysj line: 259, column: 25
      motConveyorOnOffE.setPresent();//sysj\plant.sysj line: 259, column: 43
      currsigs.addElement(motConveyorOnOffE);
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

  public void thread1129(int [] tdone, int [] ends){
        S628=1;
    thread1130(tdone,ends);
    thread1131(tdone,ends);
    thread1132(tdone,ends);
    int biggest1133 = 0;
    if(ends[13]>=biggest1133){
      biggest1133=ends[13];
    }
    if(ends[14]>=biggest1133){
      biggest1133=ends[14];
    }
    if(ends[15]>=biggest1133){
      biggest1133=ends[15];
    }
    if(biggest1133 == 1){
      active[12]=1;
      ends[12]=1;
      tdone[12]=1;
    }
  }

  public void thread1127(int [] tdone, int [] ends){
        S357=1;
    S354=0;
    dosUnitEvac.setPresent();//sysj\plant.sysj line: 134, column: 8
    currsigs.addElement(dosUnitEvac);
    active[11]=1;
    ends[11]=1;
    tdone[11]=1;
  }

  public void thread1126(int [] tdone, int [] ends){
        S349=1;
    S329=0;
    active[4]=1;
    ends[4]=1;
    tdone[4]=1;
  }

  public void thread1125(int [] tdone, int [] ends){
        S602=1;
    S360=0;
    thread1126(tdone,ends);
    thread1127(tdone,ends);
    int biggest1128 = 0;
    if(ends[4]>=biggest1128){
      biggest1128=ends[4];
    }
    if(ends[11]>=biggest1128){
      biggest1128=ends[11];
    }
    if(biggest1128 == 1){
      active[3]=1;
      ends[3]=1;
      tdone[3]=1;
    }
  }

  public void thread1124(int [] tdone, int [] ends){
        S243=1;
    S148=0;
    active[2]=1;
    ends[2]=1;
    tdone[2]=1;
  }

  public void runClockDomain(){
    for(int i=0;i<ends.length;i++){
      ends[i] = 0;
      tdone[i] = 0;
    }
    
    RUN: while(true){
      switch(S1122){
        case 0 : 
          S1122=0;
          break RUN;
        
        case 1 : 
          S1122=2;
          S1122=2;
          new Thread(new GUI()).start();//sysj\plant.sysj line: 50, column: 2
          thread1124(tdone,ends);
          thread1125(tdone,ends);
          thread1129(tdone,ends);
          int biggest1134 = 0;
          if(ends[2]>=biggest1134){
            biggest1134=ends[2];
          }
          if(ends[3]>=biggest1134){
            biggest1134=ends[3];
          }
          if(ends[12]>=biggest1134){
            biggest1134=ends[12];
          }
          if(biggest1134 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
        
        case 2 : 
          thread1135(tdone,ends);
          thread1136(tdone,ends);
          thread1159(tdone,ends);
          int biggest1164 = 0;
          if(ends[2]>=biggest1164){
            biggest1164=ends[2];
          }
          if(ends[3]>=biggest1164){
            biggest1164=ends[3];
          }
          if(ends[12]>=biggest1164){
            biggest1164=ends[12];
          }
          if(biggest1164 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
          //FINXME code
          if(biggest1164 == 0){
            S1122=0;
            active[1]=0;
            ends[1]=0;
            S1122=0;
            break RUN;
          }
        
      }
    }
  }

  public void init(){
    char [] active1 = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
    char [] paused1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    char [] suspended1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
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
          motConveyorOnOff.gethook();
          enable.gethook();
          refill.gethook();
          valveInjectorOnOff.gethook();
          valveInletOnOff.gethook();
          dosUnitValveRetract.gethook();
          dosUnitValveExtend.gethook();
          df = true;
        }
        runClockDomain();
      }
      motConveyorOnOff.setpreclear();
      enable.setpreclear();
      refill.setpreclear();
      valveInjectorOnOff.setpreclear();
      valveInletOnOff.setpreclear();
      dosUnitValveRetract.setpreclear();
      dosUnitValveExtend.setpreclear();
      bottleAtPos1.setpreclear();
      bottleAtPos5.setpreclear();
      bottleAtPos1E.setpreclear();
      bottleAtPos5E.setpreclear();
      motConveyorOnOffE.setpreclear();
      fillerReq.setpreclear();
      selectCanister.setpreclear();
      percentLiquid.setpreclear();
      bottleAtPos2.setpreclear();
      dosUnitEvac.setpreclear();
      dosUnitFilled.setpreclear();
      currentlySelectedCanister.setpreclear();
      int dummyint = 0;
      for(int qw=0;qw<currsigs.size();++qw){
        dummyint = ((Signal)currsigs.elementAt(qw)).getStatus() ? ((Signal)currsigs.elementAt(qw)).setprepresent() : ((Signal)currsigs.elementAt(qw)).setpreclear();
        ((Signal)currsigs.elementAt(qw)).setpreval(((Signal)currsigs.elementAt(qw)).getValue());
      }
      currsigs.removeAllElements();
      dummyint = motConveyorOnOff.getStatus() ? motConveyorOnOff.setprepresent() : motConveyorOnOff.setpreclear();
      motConveyorOnOff.setpreval(motConveyorOnOff.getValue());
      motConveyorOnOff.setClear();
      dummyint = enable.getStatus() ? enable.setprepresent() : enable.setpreclear();
      enable.setpreval(enable.getValue());
      enable.setClear();
      dummyint = refill.getStatus() ? refill.setprepresent() : refill.setpreclear();
      refill.setpreval(refill.getValue());
      refill.setClear();
      dummyint = valveInjectorOnOff.getStatus() ? valveInjectorOnOff.setprepresent() : valveInjectorOnOff.setpreclear();
      valveInjectorOnOff.setpreval(valveInjectorOnOff.getValue());
      valveInjectorOnOff.setClear();
      dummyint = valveInletOnOff.getStatus() ? valveInletOnOff.setprepresent() : valveInletOnOff.setpreclear();
      valveInletOnOff.setpreval(valveInletOnOff.getValue());
      valveInletOnOff.setClear();
      dummyint = dosUnitValveRetract.getStatus() ? dosUnitValveRetract.setprepresent() : dosUnitValveRetract.setpreclear();
      dosUnitValveRetract.setpreval(dosUnitValveRetract.getValue());
      dosUnitValveRetract.setClear();
      dummyint = dosUnitValveExtend.getStatus() ? dosUnitValveExtend.setprepresent() : dosUnitValveExtend.setpreclear();
      dosUnitValveExtend.setpreval(dosUnitValveExtend.getValue());
      dosUnitValveExtend.setClear();
      bottleAtPos1.sethook();
      bottleAtPos1.setClear();
      bottleAtPos5.sethook();
      bottleAtPos5.setClear();
      bottleAtPos1E.sethook();
      bottleAtPos1E.setClear();
      bottleAtPos5E.sethook();
      bottleAtPos5E.setClear();
      motConveyorOnOffE.sethook();
      motConveyorOnOffE.setClear();
      fillerReq.sethook();
      fillerReq.setClear();
      selectCanister.sethook();
      selectCanister.setClear();
      percentLiquid.sethook();
      percentLiquid.setClear();
      bottleAtPos2.sethook();
      bottleAtPos2.setClear();
      dosUnitEvac.sethook();
      dosUnitEvac.setClear();
      dosUnitFilled.sethook();
      dosUnitFilled.setClear();
      currentlySelectedCanister.sethook();
      currentlySelectedCanister.setClear();
      if(paused[1]!=0 || suspended[1]!=0 || active[1]!=1);
      else{
        motConveyorOnOff.gethook();
        enable.gethook();
        refill.gethook();
        valveInjectorOnOff.gethook();
        valveInletOnOff.gethook();
        dosUnitValveRetract.gethook();
        dosUnitValveExtend.gethook();
      }
      runFinisher();
      if(active[1] == 0){
      	this.terminated = true;
      }
      if(!threaded) break;
    }
  }
}
