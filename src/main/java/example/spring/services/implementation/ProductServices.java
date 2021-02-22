package example.spring.services.implementation;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import org.springframework.stereotype.Repository;



import example.spring.model.Product;
import example.spring.services.interfaces.IProductServices;


@Repository
public class ProductServices implements IProductServices{

	@Autowired
	JdbcTemplate jdbcTemplate;
	/*
	public List<String> getAllName(){
		List<String> nameProduct=new ArrayList<>();
		nameProduct.addAll(jdbcTemplate.queryForList("select name from Products;", String.class));
		return nameProduct;
	}
	
	public Product findbyId(Long id) {
		return jdbcTemplate.queryForObject("select * from Products where id_product=?",new ProductRowMapper(),id);
	}
	public List<Product> findByName(String name){
		return jdbcTemplate.query("select * from Products where name=?", new ProductRowMapper(),name);
		
	}
	
	private static class ProductRowMapper implements RowMapper<Product>{

		@Override
		public Product mapRow(ResultSet rs, int rowNum) throws SQLException {
			
			return new Product(rs.getLong("id_product"),rs.getString("name"),rs.getFloat("precio"),rs.getLong("cantidad"),rs.getString("detalle"));
		}
	}
	
	public int Insert(Product pr) {
		String query="insert into Products(id_product,cantidad,detalle,name,precio) values(?,?,?,?,?)";
		int res=this.jdbcTemplate.update(query,pr.getIdProduct(),
				pr.getCantidad(),pr.getDetalle(),pr.getName(),pr.getPrecio());
		return res;
	
	}
	public int Change(Product pr) {
		String query="update Products set name=?, cantidad=?,detalle=?,precio=? where id_product=?";
		int res=this.jdbcTemplate.update(query,pr.getName(),pr.getCantidad(),pr.getDetalle(),pr.getPrecio(),pr.getIdProduct());
		return res;
	}
	
	public int delete(Long id) {
		String query="delete from student where id_product=?";
		int res=this.jdbcTemplate.update(query,id);
		return res;
	}
*/
	@Override
	public Product buscarPorId(Long id) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public List<String> getAllName() {
		List<String> nameProduct=new ArrayList<>();
		nameProduct.addAll(jdbcTemplate.queryForList("select name from Products;", String.class));
		return nameProduct;
	}
	@Override
	public Product findbyId(Long id) {
		return jdbcTemplate.queryForObject("select * from Products where id_product=?",new ProductRowMapper(),id);
	}
	@Override
	public List<Product> findByName(String name) {
		return jdbcTemplate.query("select * from Products where name=?", new ProductRowMapper(),name);
	}
	private static class ProductRowMapper implements RowMapper<Product>{

		@Override
		public Product mapRow(ResultSet rs, int rowNum) throws SQLException {
			
			return new Product(rs.getLong("id_product"),rs.getString("name"),rs.getFloat("precio"),rs.getLong("cantidad"),rs.getString("detalle"));
		}
	}
	@Override
	public int Insert(Product pr) {
		String query="insert into Products(id_product,cantidad,detalle,name,precio) values(?,?,?,?,?)";
		int res=this.jdbcTemplate.update(query,pr.getIdProduct(),
				pr.getCantidad(),pr.getDetalle(),pr.getName(),pr.getPrecio());
		return res;
	}
	@Override
	public int Change(Product pr) {
		String query="update Products set name=?, cantidad=?,detalle=?,precio=? where id_product=?";
		int res=this.jdbcTemplate.update(query,pr.getName(),pr.getCantidad(),pr.getDetalle(),pr.getPrecio(),pr.getIdProduct());
		return res;
	}
	@Override
	public int delete(Long id) {
		String query="delete from student where id_product=?";
		int res=this.jdbcTemplate.update(query,id);
		return res;
	}

	
}
