package dao;


import entities.*;
import java.util.*;


public class ProductDAO {
	
	public Product find() {
		return new Product("p01", "name 1", 100);

	}
	
	public List<Product> findAll() {
		List<Product> result = new ArrayList<Product>();
		System.out.println("====================================");

		result.add(new Product("p01", "name 1", 10000));
		result.add(new Product("p02", "name 2", 20000));
		result.add(new Product("p03", "name 3", 30000));
		return result;
	}
	

}
