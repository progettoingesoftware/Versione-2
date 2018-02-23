package it.ing.sw;

import java.util.*;

public class Libro extends Risorsa
{
    private String titolo;
    private Vector <String> autore_i; 
    private int numPagine;
    private int annoPub;
    private String casaEditrice;
    private String lingua;
    private String genere;
    
    public static final String DESCRIZIONE_LIBRO = "\nTitolo: %s\nAutore/i: %s\nNumero licenze: %d\nNumero pagine: %d\nAnno di pubblicazione: %d\nCasa editrice: %s\nLingua: %s\nGenere: %s\n";
    
    public Libro(int licenze, String t, Vector <String> a, int np, int ap, String ce, String l, String g)
    {
    	   super(licenze);
    	   this.autore_i = a;
    	   this.titolo = t;
    	   this.numPagine = np;
    	   this.annoPub = ap;
    	   this.casaEditrice = ce;
    	   this.lingua = l;
    	   this.genere = g;
    }
    
    public String toString()
    {
       StringBuffer ris = new StringBuffer();
       
       StringBuffer aut = new StringBuffer();
       for(int i = 0; i < autore_i.size(); i++)
       {
    	       aut.append(autore_i.get(i));
    	       if(i < autore_i.size()-1)
    	    	        aut.append("-");
       }
       aut.toString();
       
       ris.append(String.format(DESCRIZIONE_LIBRO, titolo, aut, getNumLicenze(), numPagine, annoPub, casaEditrice, lingua, genere));
       return ris.toString();
    }
    
    
}
