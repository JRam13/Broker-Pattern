package broker;

public class CallMessage {
	private String methodName;
	private String params;
	private Integer result;

	public CallMessage(String currMethodName, String currParams) {
		this.methodName = currMethodName;
		this.params = currParams;
	}
	
	public CallMessage(int currResult) {
		setResult(currResult);
	}

	public String getParams() {
		return params;
	}

	public String getMethodName() {
		return methodName;
	}

	public Integer getResult() {
		return result;
	}

	public void setResult(int result) {
		this.result = result;
	}

}
