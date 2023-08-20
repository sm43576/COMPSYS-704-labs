package org.compsys704;

public class Ports {
	public static final String REQUEST_SIGNAL = "ControllerCD.request";
	public static final String REFILL_SIGNAL = "PlantCD.refill";
	public static final String ENABLE_SIGNAL = "PlantCD.enable";

	public static final int PORT_LOADER_PLANT = 10001;
	public static final int PORT_LOADER_CONTROLLER = 10000;
	public static final int PORT_LOADER_VIZ = 20000;
	
	// Manual 
	
	// Conveyor
	public static final String CONVEYOR_MOVE = "PlantCD.conveyorMovement";
	public static final String CONVEYOR_DELIVERED_POS5 = "ControllerCD.bottleLeftPos5";
	public static final String CONVEYOR_DELIVERED_POS1 = "ControllerCD.bottleAtPos1";
	
	public static final String SIGNAL_CONVEYOR_IDLE = "ControllerCD.conveyerIdleM";
	public static final String CONVEYOR_ACTIVE = "ControllerCD.conveyerActiveM";
	public static final String CONVEYOR_DELIVERED = "ControllerCD.bottleAtPos1M";

	
	
	public static final String SIGNAL_PUSHER_EXTEND   = "ControllerCD.pusherExtendM";
//	public static final String SIGNAL_VACOFF          = "ControllerCD.vacOffM";
	public static final String SIGNAL_VACON           = "ControllerCD.vacOnM";
	public static final String SIGNAL_ARM_SOURCE      = "ControllerCD.armSourceM";
	public static final String SIGNAL_ARM_DEST        = "ControllerCD.armDestM";
	public static final String SIGNAL_Mode            = "ControllerCD.mode";
}
