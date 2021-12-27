package JavaProject.northwind.business.abstracts;

import java.util.List;

import JavaProject.northwind.core.utilties.results.DataResult;
import JavaProject.northwind.core.utilties.results.Result;
import JavaProject.northwind.entities.concretes.Product;

public interface ProductService {
	DataResult<List<Product>> getAll();
	Result add(Product product);

}