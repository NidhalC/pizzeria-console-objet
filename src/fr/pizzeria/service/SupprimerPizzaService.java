package fr.pizzeria.service;

import java.util.Scanner;

import fr.pizzeria.dao.IPizzaDao;


public class SupprimerPizzaService extends MenuService {

	@Override
	public void executeUC(IPizzaDao pizzaDao, Scanner choixMenu) {
		System.out.println("Suppression d'une pizza");
		System.out.println("Veuillez saisir le code de la pizza � supprimer");
		// TODO Auto-generated method stub

		String code = choixMenu.next() ;

		pizzaDao.findPizzaByCode(code);

		if (pizzaDao.pizzaExists(code)){
			pizzaDao.deletePizza(code);
		}
		else {
			System.out.println("D�sol� cette pizza n'est pas trouvable");
			
		}



	}
}


