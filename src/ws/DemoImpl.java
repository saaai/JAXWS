package ws;

import javax.jws.*;


@WebService(endpointInterface="ws.Demo")
public class DemoImpl implements Demo {

	@Override
	public String helloworld() {
		// TODO Auto-generated method stub
		return "Hello World";
	}

	@Override
	public String hi(String fullName) {
		// TODO Auto-generated method stub
		return "Hello " + fullName;
	}

}
