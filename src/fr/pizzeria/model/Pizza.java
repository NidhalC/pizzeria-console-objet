package fr.pizzeria.model;

public class Pizza {
	private int id;
	private String code;
	private String libelle;
	private double prix;

	public Pizza(String code, String libelle, double prix) {
		this.code = code;
		this.libelle = libelle;
		this.prix = prix;
	}
	public Pizza(int id, String code, String libelle,double prix){
		this.id= id;
		this.code= code;
		this.libelle= libelle;
		this.prix= prix;

	}

	public String getCode(){
		return this.code;
	}

	public int getId(){
		return this.id;
	}
	
	public void affichage() {

		System.out.println(code + "->" + libelle + " " + prix + "\u20AC");
	}



}
