package application;

public enum InputSignal {
	
	ZONE1NUM(false, 0),
	ZONE2NUM(false, 0),
	ZONE3NUM(false, 0),
	ZONE7NUM(false, 0),
	ZONE1UNAUTH(false),
	ZONE2UNAUTH(false),
	ZONE3UNAUTH(false),
	ZONE7UNAUTH(false),
	EMERGENCYOFFUI(false),
	DOOR1GRANTUI(false),
	DOOR1DENYUI(false);
	
    private boolean status;
    private Object value;
    
    InputSignal(boolean status, Object value) {
    	this.status = status;
    	this.value = value;
    }
    InputSignal(boolean status) {
    	this.status = status;
    }
    
    public boolean getStatus() {
        return this.status;
    }
    public Object getValue() {
    	return this.value;
    }
    public void setStatus(boolean newStatus) {
    	this.status = newStatus;
    }
    public void setValue(Object newValue) {
    	this.value = newValue;
    }
}