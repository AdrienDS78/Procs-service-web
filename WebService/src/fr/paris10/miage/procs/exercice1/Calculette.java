package fr.paris10.miage.procs.exercice1;

import javax.jws.WebMethod; 
import javax.jws.WebService; 
import javax.jws.soap.SOAPBinding;

@WebService 
@SOAPBinding(style = SOAPBinding.Style.RPC)
public interface Calculette {

	@WebMethod int ajouter(int a, int b);
	@WebMethod int soustraire(int a, int b);
}
