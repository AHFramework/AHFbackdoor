package org.backdoorAHF.dom;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class Querys implements Serializable {
	 /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
     private int computerId;
	 
	 private String command;
	 @Column(length=1000)
	 private String request;
	 private boolean requestRecived;
	public int getComputerId() {
		return computerId;
	}
	public void setComputerId(int computerId) {
		this.computerId = computerId;
	}
	public String getCommand() {
		return command;
	}
	public void setCommand(String command) {
		this.command = command;
	}
	public String getRequest() {
		return request;
	}
	public void setRequest(String request) {
		this.request = request;
	}
	public boolean isRequestRecived() {
		return requestRecived;
	}
	public void setRequestRecived(boolean requestRecived) {
		this.requestRecived = requestRecived;
	}
	
     
     
}
