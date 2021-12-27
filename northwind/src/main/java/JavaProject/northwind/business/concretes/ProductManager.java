package JavaProject.northwind.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import JavaProject.northwind.business.abstracts.ProductService;
import JavaProject.northwind.core.utilties.results.DataResult;
import JavaProject.northwind.core.utilties.results.Result;
import JavaProject.northwind.core.utilties.results.SuccessDataResult;
import JavaProject.northwind.core.utilties.results.SuccessResult;
import JavaProject.northwind.dataAccess.abstracts.ProductDao;
import JavaProject.northwind.entities.concretes.Product;

@Service
public class ProductManager implements ProductService {

	private ProductDao productDao;

	@Autowired
	public ProductManager(ProductDao productDao) {
		super();
		this.productDao = productDao;
	}


	@Override
	public DataResult<List<Product>> getAll() {
		return new SuccessDataResult<List<Product>>(this.productDao.findAll(),"Data Listelendi");
	}


	@Override
	public Result add(Product product) {
		this.productDao.save(product);
		return new SuccessResult("Product added");
	}

}
