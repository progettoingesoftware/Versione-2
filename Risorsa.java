package it.ing.sw;

public abstract class Risorsa 
{
    private int numLicenze;
    
    public Risorsa(int l)
    {
    	   this.numLicenze = l;
    }
    
    public int getNumLicenze()
    {
    	   return numLicenze;
    }
    
    public void incrementaLicenze()
    {
    	   numLicenze++;
    }
    
    public void decrementaLicenze()
    {
    	   numLicenze--;
    }

}
