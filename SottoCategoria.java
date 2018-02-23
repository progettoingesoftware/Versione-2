package it.ing.sw;

import java.util.Vector;

public class SottoCategoria extends Categoria
{
	private String nomeSottoCategoria;
	
	public SottoCategoria(String n)
	{ 
		super();
		this.nomeSottoCategoria = n;
		elencoRisorse = new Vector <Risorsa> ();
	}
	
}


