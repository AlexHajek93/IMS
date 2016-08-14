package org.ims.beans;

import java.io.Serializable;

import javax.persistence.*;

@Embeddable
public class POLineComposite implements Serializable{
	
	@Column(name = "ORDER_NUMBER")
	private int orderNumber;
	@Column(name = "LINE_NUMBER")
	private int lineNumber;
	
	public int getOrderNumber() {
		return orderNumber;
	}
	public void setOrderNumber(int orderNumber) {
		this.orderNumber = orderNumber;
	}
	public int getLineNumber() {
		return lineNumber;
	}
	public void setLineNumber(int lineNumber) {
		this.lineNumber = lineNumber;
	}
	
	
}
