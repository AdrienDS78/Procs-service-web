package calculette;

import javax.jws.WebService;

import fr.paris10.miage.procs.exercice1.Calculette;
import fr.paris10.miage.procs.exercice1.HelloWorld;

@WebService(endpointInterface = "fr.paris10.miage.procs.exercice1.Calculette")

public class CalculetteImpl  implements Calculette {

	@Override
	public int ajouter(int a, int b) {
		
		int c = 0;
		
		c= a+b;
		
		return c;
	}

	@Override
	public int soustraire(int a, int b) {

		int c=0;
		
		c =a - b;
		
		return c;
	}

}
