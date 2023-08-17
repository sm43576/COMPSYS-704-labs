package org.compsys704;

import java.util.Arrays;
import java.util.List;

public class LoaderVizWorker extends Worker{

	@Override
	public void setSignal(boolean status) {
//		System.out.println(signame+"  "+status);
		switch(signame){
		case "conveyorIdleE":
			States.CONVEYOR_IDLE = true;
			break;
			
		case "conveyorActiveE":
			States.CONVEYOR_IDLE = false;
			States.CONVEYOR_ACTIVE = status;
			break;
			
		case "conveyorDeliveredE":
			States.CONVEYOR_DELIVERED = true;
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
	
	
	static final List<String> signames = Arrays.asList("conveyorIdleE","conveyorActiveE","conveyorDeliveredE");
	
	@Override
	public boolean hasSignal(String sn) {
		return signames.contains(sn);
	}

}
