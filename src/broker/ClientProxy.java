package broker;

public class ClientProxy{
	String currMethodName;
	String currParams;


	public void addIntegers(Integer a, Integer b){
		currMethodName = "addIntegers";
		currParams = (a + "|" + b);
		prepareData();	
	}
	
	public void getLength(String str) {
		currMethodName = "getLength";
		currParams = str;
		prepareData();
		
	}

	private void prepareData() {
		//wrap client call into a CallMessage object
		System.out.println("Client Proxy Marshalling Data...");
		CallMessage msgClient = new CallMessage(currMethodName, currParams);
		
		
		System.out.println("Client Proxy Forwarding Data...");
		//send msg to broker
		BrokerClient bc = new BrokerClient(msgClient);
		
		//display result
		System.out.println("Client Proxy Demarshalling For Final Result...");
		displayResult(bc);
	}


	private void displayResult(BrokerClient bc) {
		
		//convert message to a result
		int result = bc.getResultMessage().getResult();
		
		System.out.println("Your Result is: " + result);
		
	}

}
