package it.ing.sw;

import java.util.Vector;

public class Categoria 
{
   private String nomeCategoria;
   protected Vector <Risorsa> elencoRisorse;
   private Vector <SottoCategoria> elencoSottoCategorie;
   
   public Categoria(String n)
   {
	   this.nomeCategoria = n;
	   elencoRisorse = new Vector <Risorsa> ();
	   elencoSottoCategorie = new Vector <SottoCategoria> ();
   }
   
   public Categoria()
   {
	   
   }
   
   public void aggiungiRisorsaElenco(Risorsa r)
   {
	   elencoRisorse.add(r);
   }
   
   public void rimuoviRisorsaElenco(Risorsa r)  //r deve essere effettivamente presente nell'elenco
   {
	   elencoRisorse.remove(r);
   }
   
   public String toString()
   {
	   StringBuffer ris = new StringBuffer();
	   return ris.toString();
   }
   
   
   
   //metodi: aggiungiRisorsa, rimuoviRisorsa, visualizzaElenco
}
