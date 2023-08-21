package org.compsys704;

public class States {
	// ADD INITIAL STATES HERE FOR ANY INTERACTION WITH UI
	
	public static volatile boolean BOTTLE_AT_POS1 = false;
	public static volatile boolean BOTTLE_AT_POS5 = true;
	public static volatile boolean CONVEYOR_MOVE = false;
//	public static volatile boolean CONVEYOR_DELIVERED = !CONVEYOR_ACTIVE;
	
	
	public static volatile boolean ARM_AT_DEST = true;
	public static volatile boolean ARM_AT_SOURCE = !ARM_AT_DEST;
	public static volatile boolean PUSHER_RETRACTED = true;
	public static volatile boolean PUSHER_EXTENDED = !PUSHER_RETRACTED;
	public static volatile boolean GRIPPED = false;
	public static volatile boolean MAG_EMPTY = false;
	
	public static volatile boolean CAP_READY = false;
}
