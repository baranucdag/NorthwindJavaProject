package JavaProject.northwind.entities.concretes;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import JavaProject.northwind.entities.abstracts.Entity;

@javax.persistence.Entity
@Table(name="categories")
public class Category implements Entity {

	@Id
	@GeneratedValue
	@Column(name="category_id")
	private int id;
	
	@Column(name="category_name")
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
