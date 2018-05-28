package main;

import java.util.*;
import ws.*;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			DemoImplService demoImplService = new DemoImplServiceLocator();
			Demo demo = demoImplService.getDemoImplPort();
			System.out.println(demo.helloworld());
			System.out.println(demo.hi("ABC"));
			
			ProductWSImplService productWSImplService = new ProductWSImplServiceLocator();
			ProductWS productWS = productWSImplService.getProductWSImplPort();
			Product product = productWS.find();
			System.out.println("Id:" + product.getId() );
			System.out.println("Name:" + product.getName() );
			System.out.println("Price:" + product.getPrice() );
			
			Product []listProduct = productWS.findAll();
			for(Product p: listProduct)
			{
				System.out.println("Id:" + p.getId() );
				System.out.println("Name:" + p.getName() );
				System.out.println("Price:" + p.getPrice() );
				
				System.out.println("====================================");
			}
			
			
			
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
	}

}
