package org.ims.beans;

import javax.persistence.*;

@Entity
@Table(name="IMS_PO_LINE")
public class POLineBean {
	
	@EmbeddedId
	private POLineComposite compositeKey;
	@Column(name="UNIT_PRICE")
	private double unitPrice;
	@Column(name="QUANTITY_ORDERED")
	private int quantityOrdered;
	@Column(name="PRODUCT_UPC")
	private int productUPC;
	@ManyToOne
	@JoinColumn(name="LINE_PRODUCT")
	private ProductBean product;
	
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
	public int getProductUPC() {
		return productUPC;
	}
	public void setProductUPC(int productUPC) {
		this.productUPC = productUPC;
	}
	
	public ProductBean getProduct() {
		return product;
	}
	public void setProduct(ProductBean product) {
		this.product = product;
	}
	public POLineBean() {
		super();
		// TODO Auto-generated constructor stub
	}
	public POLineBean(POLineComposite compositeKey, double unitPrice, int quantityOrdered, int productUPC,
			ProductBean product) {
		super();
		this.compositeKey = compositeKey;
		this.unitPrice = unitPrice;
		this.quantityOrdered = quantityOrdered;
		this.productUPC = productUPC;
		this.product = product;
	}
	
}
