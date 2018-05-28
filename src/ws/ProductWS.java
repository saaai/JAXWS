package ws;

import entities.*;
import java.util.*;
import javax.jws.*;


@WebService
public interface ProductWS {
	
	@WebMethod
	public Product find();
	
	@WebMethod
	public List<Product> findAll();
	
	
	
	

}
