package broker;

public class BrokerServer {
	String methodName;
	String params;
	CallMessage msgServer;
	String message;

	public BrokerServer(String currMessage) {
		//convert string back to message object
		parseMessage(currMessage);
		
		//pass message to serverProxy
		System.out.println("Server Broker Transferring Data To Server Proxy...");
		ServerProxy sp = new ServerProxy(msgServer);
		
		//get and set the returning results
		System.out.println("Returning Results...");
		msgServer = sp.returnResult();
		setMessage(msgServer.getResult().toString());
		
	}

	private void parseMessage(String message) {
		int index = message.indexOf("|");
		methodName = message.substring(0, index);
		params = message.substring(index+1, message.length());
		
		msgServer = new CallMessage(methodName, params);
		
	}
	
	public CallMessage getMsgServer() {
		return msgServer;
	}

	public void setMsgServer(CallMessage msgServer) {
		this.msgServer = msgServer;
	}
	
	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
