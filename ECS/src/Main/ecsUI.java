package Main;

import java.util.ArrayList;
import java.util.List;

import javafx.fxml.FXML;
import javafx.scene.shape.Circle;

public class ecsUI {
	
	@FXML 
	private Circle zone1status, zone2status, zone3status, zone4status, zone5status, zone6status,zone7status;

	
	
	public void setZoneCircle(String circle,int val) {
		
		
		
	}
	
	public List<Circle> getCircleList() {
	    List<Circle> circleList = new ArrayList<>();
	    circleList.add(zone1status);
	    circleList.add(zone2status);
	    circleList.add(zone3status);
	    circleList.add(zone4status);
	    circleList.add(zone5status);
	    circleList.add(zone6status);
	    circleList.add(zone7status);
	    return circleList;
	}


}
