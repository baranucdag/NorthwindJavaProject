package JavaProject.northwind.entities.concretes;

import JavaProject.northwind.entities.abstracts.Entity;

public class Category implements Entity {

	private int id;
	private String categoryName;

	public Category(int id, String categoryName) {
		super();
		this.id = id;
		this.categoryName = categoryName;
	}

	public int getId() {
		return id;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
}
