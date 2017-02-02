package radarsClient;

import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

import radars.Personne;
import radars.Voiture;
import fr.paris10.miage.procs.exercice2.SystemeAmendes;


public class RadarsClient {

	public static void main(String[] args) throws Exception {
		
		URL url = new URL("http://localhost:9991/ws/saam?wsdl");
	    QName qname = new QName("http://radars/", "SystemeAmandesImplService");
	    Service service = Service.create(url, qname);
	    SystemeAmendes sa = (SystemeAmendes) service.getPort(SystemeAmendes.class);
	
	
	    Personne p = new Personne("Bob","Sponge","paris");
	    Personne p1 = new Personne ("Capitane","Haddock","marseille");
	    
	    Voiture v = new Voiture("AB 123 CD","Clio 3");
	    v.setProprietaire(p);
	    
	    Voiture v1 = new Voiture("AB124 CD","Punto");
	    v1.setProprietaire(p1);
	    
	    
	    System.out.println(v);
	    System.out.println(v1);
	    
	    
	    
	    
	    sa.enregistrer(v);
	    sa.enregistrer(v1);
	    
	    sa.signaler("AB123 CD","Clio 3" , 90);
	    sa.signaler("AB123 CD", "Tracteur", 90);
	    sa.signaler("AB123 CD", "Clio 3", 140);
	    
	    sa.lister("AB123 CD");
	    sa.payer(1, "Capitaine","Haddock");
	    
	    sa.lister("AB123 CD");
	    sa.payer(1, "Bob","Sponge");
	    
	    sa.lister("AB123 CD");
	    
	    
	    
	    
	    
	
	
	
	
	
	
	}
    
}
