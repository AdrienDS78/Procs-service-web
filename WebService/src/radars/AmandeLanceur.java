package radars;


import javax.xml.ws.Endpoint;

public class AmandeLanceur {

	public static void main(String[] args) { 
		Endpoint.publish("http://localhost:9992/ws/saam", new SystemeAmandesImpl()); 
		}
}
