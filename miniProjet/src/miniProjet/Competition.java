package miniProjet;
/**
 * @author Raed
 *
 */
public class Competition {
    private int numeroTours ; // le numéro des tours dans notre compétition
    private Match[] matchTable; // un tableau contenant les matchs de notre compétition
   
    
    public Competition() {
    	
    }// constructeur vide
    


    public Competition (int tour , Match[] match) {
    	this.numeroTours=tour;
    	this.matchTable=match;
    	
    } // constructeurs
   
    public int getNumeroTours() {
		return numeroTours;
	}
    
    public Match[] getMatchTable() {
		return matchTable;
	}
    
    public void saisie (Match m) {
    	
    }    	//  remplissage de tableau ; (apellé pendant la creation d'un match)

    
    
}
