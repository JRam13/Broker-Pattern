package broker;

public class ServerProxy {
	String methodName;
	String params;
	int paramIntOne;
	int paramIntTwo;
	String strToCount;
	CallMessage resultMsgServer;
	int result;
	
	public ServerProxy(CallMessage msgServer) {
		
		Server s = new Server();
		
		methodName = msgServer.getMethodName();
		params = msgServer.getParams();
		
		//If client asking to add integers, extract the CallMessage object to it's corresponding params
		if(methodName.equals("addIntegers")){
			parseInts();
			System.out.println("Server About To Perform Add Operation...");
			result = s.addIntegers(paramIntOne, paramIntTwo);
		}
		else if(methodName.equals("getLength")){
			parseString();
			System.out.println("Server About To Perform GetLength...");
			result = s.getLength(strToCount);
		}
	}

	private void parseString() {
		int index = params.indexOf("|");
		strToCount = params.substring(index+1, params.length());
	}

	private void parseInts() {
		int index = params.indexOf("|");
		paramIntOne = Integer.parseInt(params.substring(0, index));
		paramIntTwo = Integer.parseInt(params.substring(index+1, params.length()));
	}
	
	public CallMessage returnResult() {
		
		//create callMessage for the result
		System.out.println("Demarshalling Data...");
		resultMsgServer = new CallMessage(result);
		
		return resultMsgServer;
	}

}
