package main;

import javax.jws.*;
import javax.xml.ws.*;

import ws.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			Endpoint.publish("http://localhost:4790/ws/demo", 
					new DemoImpl());
			Endpoint.publish("http://localhost:4790/ws/product", 
					new ProductWSImpl());
			System.out.println("Done");
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage() );
		}
	}

} 
