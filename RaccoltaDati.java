package interazione_2;

import java.io.Serializable;

import logica_2.AnagraficaFruitori;
import logica_2.AnagraficaOperatori;
import logica_2.Archivio;

/**
 * Questa classe rappresenta un raccoglitore di dati, utile per la memorizzazione su file
 */
public class RaccoltaDati implements Serializable
{
	private static final long serialVersionUID = 1L;
	
	private AnagraficaFruitori af;
    private AnagraficaOperatori ao;
    private Archivio arc;
    
    /**
     * Metodo costruttore della classe RaccoltaAnagrafiche
     * 
     * Pre : af != null
     * Pre : ao != null
     * Pre: arc != null
     * 
     * @param af: anagrafica dei fruitori
     * @param ao: anagrafica operatori
     * @param arc: archivio
     */
    public RaccoltaDati(AnagraficaFruitori af, AnagraficaOperatori ao, Archivio arc)
    {
    	   this.af = af;
    	   this.ao = ao;
    	   this.arc = arc;
    }
    
    /**
     * Metodi get della classe RaccoltaDati
     */
    public AnagraficaFruitori getAnagraficaFruitori()
	{
		return af;
	}
    
    public AnagraficaOperatori getAnagraficaOperatori()
	{
		return ao;
	}
    
    public Archivio getArchivio()
   	{
   		return arc;
   	}
    
}
