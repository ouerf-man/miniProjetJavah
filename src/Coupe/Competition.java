package Coupe;
import inputOutput.interfaces.*;

public class Competition implements Input,Affichable,updatable {
    private int numeroTours ; // le num�ro des tours dans notre comp�tition
    private Match[] matchTable; // un tableau contenant les matchs de notre comp�tition
   
    
    public Competition() {
    	
    }// constructeur vide
    
    public Competition (int tour , Match[] match) {
    	this.numeroTours=tour;
    	this.matchTable=match;
    	
    } // constructeurs
   
    public int getNumeroTours() 
    {
		return numeroTours;
	}
    
    public Match[] getMatchTable() {
		return matchTable;
	}
    
	public void saisie()
	{		
	}
    
    public void saisie (Match m) 
    {
    	
    }    	//  remplissage de tableau ; (apell� pendant la creation d'un match)

    public int genererNumeroTours()
    {
       return(  (int)(Math.log(matchTable.length)/Math.log(2)) );  // nbre de tours =  log2(nb equipes)
    	
    }

	public void update() {
		// TODO Auto-generated method stub
		
	}


	public void Afficher() {
		// TODO Auto-generated method stub
		
	}


    
}