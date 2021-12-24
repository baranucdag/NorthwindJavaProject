package JavaProject.northwind.entities.concretes;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import JavaProject.northwind.entities.abstracts.Entity;
 	
@javax.persistence.Entity
@Table(name="products")
public class Product implements Entity {

		@Id
		@GeneratedValue
		private int id;
		
		@Column(name="product_name")
		private String productName; 	
		
		@Column(name="unit_price")
		private double unitPrice;
		
		@Column(name="units_in_stock")
		private short unitsInStock;
		
		@Column(name="quantity_per_unit")
		private String quantityPerUnit;
		
		@Column(name="category_id")
		private int categoryId;
		
		public Product() {}
		public Product(int id, String productName, double unitPrice, short unitsInStock, String quantityPerUnit,
				int categoryId) {
			super();
			this.id = id;
			this.productName = productName;
			this.unitPrice = unitPrice;
			this.unitsInStock = unitsInStock;
			this.quantityPerUnit = quantityPerUnit;
			this.categoryId = categoryId;
		}
		
		public int getId() {
			return id;
		}
		public String getProductName() {
			return productName;
		}
		public double getUnitPrice() {
			return unitPrice;
		}
		public short getUnitsInStock() {
			return unitsInStock;
		}
		public String getQuantityPerUnit() {
			return quantityPerUnit;
		}
		public int getCategoryId() {
			return categoryId;
		}
		public void setId(int id) {
			this.id = id;
		}
		public void setProductName(String productName) {
			this.productName = productName;
		}
		public void setUnitPrice(double unitPrice) {
			this.unitPrice = unitPrice;
		}
		public void setUnitsInStock(short unitsInStock) {
			this.unitsInStock = unitsInStock;
		}
		public void setQuantityPerUnit(String quantityPerUnit) {
			this.quantityPerUnit = quantityPerUnit;
		}
		public void setCategoryId(int categoryId) {
			this.categoryId = categoryId;
		}
		
}
