package org.ims.beans;

import javax.persistence.*;

@Entity
@Table(name="IMS_PO_LINE")
public class POLineBean {
	
	@EmbeddedId		//composite key
	private POLineComposite compositeKey;
	@Column(name="UNIT_PRICE")
	private double unitPrice;
	@Column(name="QUANTITY_ORDERED")
	private int quantityOrdered;
	
	//mappings
	@ManyToOne
	@JoinColumn(name="PRODUCT_UPC")
	private ProductBean product;
	@ManyToOne
	@JoinColumn(name="ORDER_NUMBER")
	private PurchaseOrderBean order;
	
	public POLineComposite getCompositeKey() {
		return compositeKey;
	}
	public void setCompositeKey(POLineComposite compositeKey) {
		this.compositeKey = compositeKey;
	}
	public double getUnitPrice() {
		return unitPrice;
	}
	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}
	public int getQuantityOrdered() {
		return quantityOrdered;
	}
	public void setQuantityOrdered(int quantityOrdered) {
		this.quantityOrdered = quantityOrdered;
	}
	public ProductBean getProduct() {
		return product;
	}
	public void setProduct(ProductBean product) {
		this.product = product;
	}
	public PurchaseOrderBean getOrder() {
		return order;
	}
	public void setOrder(PurchaseOrderBean order) {
		this.order = order;
	}
	public POLineBean() {
		super();
		// TODO Auto-generated constructor stub
	}
	public POLineBean(POLineComposite compositeKey, double unitPrice, int quantityOrdered, ProductBean product,
			PurchaseOrderBean order) {
		super();
		this.compositeKey = compositeKey;
		this.unitPrice = unitPrice;
		this.quantityOrdered = quantityOrdered;
		this.product = product;
		this.order = order;
	}
}
