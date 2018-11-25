package Coupe;

import java.util.Scanner;

import personnages.Entraineur;
import personnages.Joueur;

public class Equipe {
	
	
 private String nomEquipe;
 private Joueur[] joueurTitulaires;
 private Joueur[] remplacants;
 private Entraineur entraineur;
 
 public Equipe() 
	{ joueurTitulaires = new Joueur[11];
	 saisie();
	 
	}
	public Equipe(String name , Joueur[] joueurtitulaire ,Joueur[] joueurRemplacant,Entraineur entraineur)
	{   
		saisie(name,joueurtitulaire,joueurRemplacant,entraineur);
	}
	
	public void saisie(String name , Joueur[] joueurtitulaire ,Joueur[] joueurRemplacant,Entraineur entraineur)
	{
		nomEquipe=name;
		this.joueurTitulaires=joueurtitulaire;
		this.remplacants = joueurRemplacant;
		this.entraineur = entraineur;
	}
	
	public void saisie()
	{
		System.out.println("saisir le nom de  l'equipe ");
	 Scanner sc = new Scanner(System.in);
	 nomEquipe = sc.nextLine();
	System.out.println("entrer les joueurs titulaire de l'equipe "); // nbre de joueurs titulaires =11
   
		for(int i=0;i<11;i++) 
   
	{
		joueurTitulaires[i]=new Joueur();   
		System.out.println(" *next joueur* ");
	}
		
	System.out.println("entrer les joueurs titulaire de l'equipe "); // nbre de joueurs remplaçants = 11 
   
	for(int i=0;i<11;i++) 
    {
		remplacants[i]=new Joueur();   
	}
	System.out.println("entrer l'entraineur de l'equipe ");
    
	entraineur= new Entraineur();
	
	}
	
	
}
