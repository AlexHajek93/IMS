package org.ims.beans;

import java.io.Serializable;

import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

@Embeddable
public class POLineComposite implements Serializable{
	
	@Column(name = "ORDER_NUMBER_ID", nullable=false)
<<<<<<< HEAD
	@NotNull(message="Order Number is required")
	private PurchaseOrderBean orderNumber;
	@Column(name = "LINE_NUMBER_ID", nullable=false)
	@NotNull(message="Line Number is required")
	@Min(value=0,message="Invalid Line")
	private int lineNumber;
	
	public PurchaseOrderBean getOrderNumber() {
=======
	private int orderNumber;
	@Column(name = "LINE_NUMBER_ID", nullable=false)
	private int lineNumber;
	public int getOrderNumber() {
>>>>>>> master
		return orderNumber;
	}
	public void setOrderNumber(PurchaseOrderBean orderNumber) {
		this.orderNumber = orderNumber;
	}
	public int getLineNumber() {
		return lineNumber;
	}
	public void setLineNumber(int lineNumber) {
		this.lineNumber = lineNumber;
	}
}
