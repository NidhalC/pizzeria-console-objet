package fr.pizzeria.service;

import java.util.Scanner;

import fr.pizzeria.dao.IPizzaDao;
import fr.pizzeria.model.Pizza;


public class ModifierPizzaService extends MenuService {

	@Override
	public void executeUC(IPizzaDao pizzaDao, Scanner choixMenu) {
		System.out.println("Mise � jour d'une pizza");
		

		System.out.println("Veuillez choisir le code de la pizza a modifier");
		// TODO Auto-generated method stub

		String codeModif= choixMenu.next();
		pizzaDao.findPizzaByCode(codeModif);

		if(pizzaDao.pizzaExists(codeModif)){
			System.out.println("Veuillez saisir le nouveau code");

			codeModif = choixMenu.next();
			
			System.out.println("Veuillez saisir le nouveau nom : ");

			String nomModif = choixMenu.next();
			System.out.println("Veuillez saisir le nouveau prix : ");
			
			double prixModif = choixMenu.nextDouble();
			Pizza pizzaModif  = new Pizza(codeModif, nomModif, prixModif);

			pizzaDao.updatePizza(codeModif, pizzaModif);

		}

	}
}
