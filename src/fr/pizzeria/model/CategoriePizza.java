package fr.pizzeria.model;

public enum CategoriePizza {
	VIANDE("Viande"),
	POISSON("Poisson"),
	SANS_VIANDE("Sans Viande");
	
	private String nomCategorie;
	
	 CategoriePizza(String nomCategorie){
		this.nomCategorie = nomCategorie ;
	}

	public String getNomCategorie() {
		return nomCategorie;
	}

	public void setNomCategorie(String nomCategorie) {
		this.nomCategorie = nomCategorie;
	}

	

}
