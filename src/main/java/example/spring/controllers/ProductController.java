package example.spring.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



import example.spring.model.Product;
import example.spring.services.implementation.ProductServices;
import example.spring.services.interfaces.IProductServices;


@RestController
@RequestMapping("/api")
public class ProductController {

	@Autowired
	IProductServices services;
	
	@GetMapping("/product")
	public List<String> getAllName(){
		return services.getAllName();
	}
	
	@GetMapping("/id/{id}")
	public Product findbyId(@PathVariable(value="id") Long id) {
		return services.findbyId(id);
	}
	@GetMapping("/name/{name}")
	public List<Product> findByName(@PathVariable String name) {
		return services.findByName(name);
	}
	@PostMapping("")
	public int Insert(@RequestBody Product product) {
		return services.Insert(product);
	}	
	
	@PutMapping("/product")
	public int Change(@RequestBody Product product) {
		return services.Change(product);
	}
	@DeleteMapping("product/{id}")
	public int Delete(@PathVariable(value="id") Long id) {
		return services.delete(id);
	}
	
	
}
