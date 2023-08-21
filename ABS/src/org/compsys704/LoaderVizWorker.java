package org.compsys704;

import java.util.Arrays;
import java.util.List;

public class LoaderVizWorker extends Worker{

	// ADD YOUR STATES HANDLING HERE - STATUS = SIGNAL EMITTED FROM PLANT
	@Override
	public void setSignal(boolean status) {
//		System.out.println(signame+"  "+status);
		switch(signame){
		case "bottleAtPos1E":
			States.BOTTLE_AT_POS1 = status;
			System.out.println("bottle at pos 1: "+ States.BOTTLE_AT_POS1);
			break;
			
		case "bottleAtPos5E":
			States.BOTTLE_AT_POS5 = status;
			System.out.println("bottle at pos 5: "+ States.BOTTLE_AT_POS5);
			break;
			
		case "motConveyorOnOffE":
			States.CONVEYOR_MOVE = status;
			System.out.println("conveyor: "+ States.CONVEYOR_MOVE);
			break;
//		case "armAtSourceE":
//			States.ARM_AT_SOURCE = status;
//			break;
//		case "armAtDestE":
//			States.ARM_AT_DEST = status;
//			break;
//		case "emptyE":
//			States.MAG_EMPTY = status;
//			break;
		default: 
			System.err.println("Wrong sig name : "+signame);
			System.exit(1);
		}
	}
	
	
	static final List<String> signames = Arrays.asList("bottleAtPos1E","bottleAtPos5E","motConveyorOnOffE");
	
	@Override
	public boolean hasSignal(String sn) {
		return signames.contains(sn);
	}

}
