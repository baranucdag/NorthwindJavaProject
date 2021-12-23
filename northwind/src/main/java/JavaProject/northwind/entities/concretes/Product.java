package JavaProject.northwind.entities.concretes;

import JavaProject.northwind.entities.abstracts.Entity;


public class Product implements Entity {

		private int id;
		private String productName;
		private double unitPrice;
		private short unitsInStock;
		private String quantityPerUnit;
		private int categoryId;
		
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
