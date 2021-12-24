package JavaProject.northwind.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import JavaProject.northwind.business.abstracts.ProductService;
import JavaProject.northwind.dataAccess.abstracts.ProductDao;
import JavaProject.northwind.entities.concretes.Product;

public class ProductManager implements ProductService {

	private ProductDao productDao;

	@Autowired
	public ProductManager(ProductDao productDao) {
		super();
		this.productDao = productDao;
	}

	@Override
	public List<Product> getall() {
		// TODO Auto-generated method stub
		return null;
	}

}
