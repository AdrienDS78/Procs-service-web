package calculette;


import javax.xml.ws.Endpoint;

public class CalculetteLanceur {

	public static void main(String[] args) { 
		Endpoint.publish("http://localhost:6662/ws/calc", new CalculetteImpl()); 
		}
}
