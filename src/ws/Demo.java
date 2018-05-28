package ws;

import javax.jws.*;

@WebService
public interface Demo {
	
	@WebMethod
	public String helloworld();
	


	@WebMethod
	public String hi(String fullName);
	
}
