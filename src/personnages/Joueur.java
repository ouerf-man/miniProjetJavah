/**
 * 
 */
package personnages;

import java.util.Scanner;

/**
 * @author SamiElleuch
 *
 */
public class Joueur extends Personne 
	{
	
	private String poste ; 
	private int numMaillot;
	
	

	/**
	 * 
	 */
	public Joueur() 
	{    super(); // apelle le constructeur de personnage intialise nom ...
		saisie();
	}
	
	
	public void saisie()  //interface methode
	{
		System.out.println("saisir le poste du joueur ");
		 Scanner sc = new Scanner(System.in);
		 poste = sc.nextLine();
		System.out.println("saisir le numMaillot du joueur ");
        numMaillot= sc.nextInt();
	
	}

}
