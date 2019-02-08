package fr.pizzeria.service;

public class MenuServiceFactory {
	public static MenuService menuFactory(int choixMenu) {
		if (choixMenu == 1){

			return new ListerPizzasService();
		}
		else if(choixMenu == 2){



			return new AjouterPizzaService();
		}
		else if (choixMenu == 3){

			return new ModifierPizzaService();

		}
		else if (choixMenu == 4){
			return new SupprimerPizzaService();
		}

		return null ;
	}

}
