package broker;

class Transport {
	String message;

	public Transport(String currMessage) {
		this.message = currMessage;
		
		System.out.println("Transporting...");
		BrokerServer bs = new BrokerServer(message);
		
		//set returning message
		System.out.println("Transporting Back To Client...");
		setMessage(bs.getMessage());
		
	}
	
	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
