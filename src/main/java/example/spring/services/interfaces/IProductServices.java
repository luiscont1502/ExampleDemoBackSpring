package example.spring.services.interfaces;

import java.util.List;

import example.spring.model.Product;

public interface IProductServices {
	
	public Product buscarPorId(Long id);
	public List<String> getAllName();
	public Product findbyId(Long id);
	public List<Product> findByName(String name);
	public List<Product> AllProduct();
	public int Insert(Product pr);
	public int Change(Product pr);
	public int delete(Long id) ;
	
	
}
