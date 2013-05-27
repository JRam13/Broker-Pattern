package broker;

public class BrokerClient {
	String methodName;
	String params;
	String message;
	CallMessage resultMessage;
	
	public BrokerClient(CallMessage msg) {
		
		methodName = msg.getMethodName();
		params = msg.getParams();
		
		//convert message to string
		System.out.println("Client Broker Converting to String...");
		message = (methodName + "|" + params);
		
		//send string over the wire
		System.out.println("Client Broker forwarding Bytes to Transfer...");
		Transport t = new Transport(message);
		
		//get the returning message and convert to callmessage object
		setResultMessage(new CallMessage(Integer.parseInt(t.getMessage())));
	}

	public CallMessage getResultMessage() {
		return resultMessage;
	}

	public void setResultMessage(CallMessage resultMessage) {
		this.resultMessage = resultMessage;
	}

}
