package com.drools.message;

/**
 * This is a sample class to launch a rule.
 */
public class Message implements java.io.Serializable {
    
    static final long serialVersionUID = 1L;

	public static final int HELLO = 0;
	public static final int GOODBYE = 1;

	private String message;

	private int status;

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public int getStatus() {
		return this.status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

}