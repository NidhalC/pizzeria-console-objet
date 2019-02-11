package fr.pizzeria.model;

public class Pizza {
	private int id;
	private String code;
	private String libelle;
	private double prix;
	private CategoriePizza categorie;

	public Pizza(String code, String libelle, double prix,CategoriePizza categorie) {
		this.code = code;
		this.libelle = libelle;
		this.prix = prix;
		this.categorie = categorie;
	}
	public Pizza(int id, String code, String libelle,double prix, CategoriePizza categorie){
		this.id= id;
		this.code= code;
		this.libelle= libelle;
		this.prix= prix;
		this.categorie= categorie;
	}

	public String getCode(){
		return this.code;
	}

	public int getId(){
		return this.id;
	}
	
	public void affichage() {

		System.out.println(code + "->" + libelle + " "+ categorie.getNomCategorie() + " " + prix + "\u20AC");
	}



}
