package JavaProject.northwind.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import JavaProject.northwind.entities.concretes.Category;

public interface CategoryDao extends JpaRepository<Category,Integer> {

}
