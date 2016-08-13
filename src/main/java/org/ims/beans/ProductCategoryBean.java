package org.ims.beans;

import java.util.Set;

import javax.persistence.*;

@Entity
@Table(name="IMS_PRODUCT_CATEGORY")
public class ProductCategoryBean {

	@Id
	@Column(name="CATEGORY_ID")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int categoryId;
	@Column(name="CATEGROY_DESCRIPTION")
	private String categoryDescription;
	
	@ManyToMany
	@JoinTable(name="PRODUCT_CATEGORIES",
					joinColumns=@JoinColumn(name="CATEGORY_ID"),
					inverseJoinColumns=@JoinColumn(name="PRODUCT_UPC"))
	private Set<ProductBean> productsForCategory; 
	
	public int getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}
	public String getCategoryDescription() {
		return categoryDescription;
	}
	public void setCategoryDescription(String categoryDescription) {
		this.categoryDescription = categoryDescription;
	}
	public Set<ProductBean> getProductsForCategory() {
		return productsForCategory;
	}
	public void setProductsForCategory(Set<ProductBean> productsForCategory) {
		this.productsForCategory = productsForCategory;
	}
	public ProductCategoryBean() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ProductCategoryBean(int categoryId, String categoryDescription, Set<ProductBean> productsForCategory) {
		super();
		this.categoryId = categoryId;
		this.categoryDescription = categoryDescription;
		this.productsForCategory = productsForCategory;
	}
}