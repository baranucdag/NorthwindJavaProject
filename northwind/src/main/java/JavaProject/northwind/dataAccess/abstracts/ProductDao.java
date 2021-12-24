package JavaProject.northwind.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import JavaProject.northwind.entities.concretes.Product;

public interface ProductDao extends JpaRepository<Product,Integer> {

}
