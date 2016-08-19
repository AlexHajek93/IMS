package org.ims.beans;

import java.util.Date;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="IMS_PURCHASE_ORDER")
public class PurchaseOrderBean {
	@Id
	@Column(name="ORDER_NUMBER",nullable=false)
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int orderNum;
	@Column(name="SUBTOTAL",nullable=false)
	private double subtotal;
	@Column(name="PURCHASE_DATE",nullable=false)
	private Date purchaseDate;
	@Column(name="TAX_AMOUNT",nullable=false)
	private double taxAmount;
	@Column(name="PO_TOTAL",nullable=false)
	private double poTotal;
	@ManyToOne
	@JoinColumn(name="CLIENT_ID",nullable=false)
	private ClientBean client;
	@OneToMany(mappedBy="order")
	private Set<POLineBean> orderLines;

	public int getOrderNum() {
		return orderNum;
	}
	public void setOrderNum(int orderNum) {
		this.orderNum = orderNum;
	}
	public double getSubtotal() {
		return subtotal;
	}
	public void setSubtotal(double subtotal) {
		this.subtotal = subtotal;
	}
	public Date getPurchaseDate() {
		return purchaseDate;
	}
	public void setPurchaseDate(Date purchaseDate) {
		this.purchaseDate = purchaseDate;
	}
	public double getTaxAmount() {
		return taxAmount;
	}
	public void setTaxAmount(double taxAmount) {
		this.taxAmount = taxAmount;
	}
	public double getPoTotal() {
		return poTotal;
	}
	public void setPoTotal(double poTotal) {
		this.poTotal = poTotal;
	}
	public ClientBean getClient() {
		return client;
	}
	public void setClient(ClientBean client) {
		this.client = client;
	}
	public PurchaseOrderBean() {
		super();
	}
	public Set<POLineBean> getOrderLines() {
		return orderLines;
	}
	public void setOrderLines(Set<POLineBean> orderLines) {
		this.orderLines = orderLines;
	}
	public PurchaseOrderBean(int orderNum, double subtotal, Date purchaseDate, double taxAmount, double poTotal,
			ClientBean client, Set<POLineBean> orderLines) {
		super();
		this.orderNum = orderNum;
		this.subtotal = subtotal;
		this.purchaseDate = purchaseDate;
		this.taxAmount = taxAmount;
		this.poTotal = poTotal;
		this.client = client;
		this.orderLines = orderLines;
	}
}
