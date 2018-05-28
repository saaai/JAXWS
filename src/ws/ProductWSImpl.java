package ws;

import entities.*;
import java.util.*;
import dao.*;
import javax.jws.*;


@WebService(endpointInterface = "ws.ProductWS")
public class ProductWSImpl implements ProductWS {
	
	private ProductDAO ProductDAO = new ProductDAO();

	@Override
	public Product find() {
		// TODO Auto-generated method stub
		return this.ProductDAO.find();
	}

	@Override
	public List<Product> findAll() {
		// TODO Auto-generated method stub
		return this.ProductDAO.findAll();
	}

}
