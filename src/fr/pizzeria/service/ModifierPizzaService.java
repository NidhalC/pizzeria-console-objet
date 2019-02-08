package fr.pizzeria.service;

import java.util.Scanner;

import fr.pizzeria.dao.IPizzaDao;
import fr.pizzeria.model.Pizza;


public class ModifierPizzaService extends MenuService {

	@Override
	public void executeUC(IPizzaDao pizzaDao, Scanner choixMenu) {
		System.out.println("Mise à jour d'une pizza");
		

		System.out.println("Veuillez choisir le code de la pizza a modifier");
		// TODO Auto-generated method stub

		String codePizzaAModifier= choixMenu.next();
		pizzaDao.findPizzaByCode(codePizzaAModifier);

		if(pizzaDao.pizzaExists(codePizzaAModifier)){
			System.out.println("Veuillez saisir le nouveau code");

			String  nouveauCodePizza = choixMenu.next();
			
			System.out.println("Veuillez saisir le nouveau nom : ");

			String nouveauNomPizza = choixMenu.next();
			System.out.println("Veuillez saisir le nouveau prix : ");
			
			double nouveauprix = choixMenu.nextDouble();
			Pizza pizzaModif  = new Pizza(nouveauCodePizza, nouveauNomPizza, nouveauprix);

			pizzaDao.updatePizza(codePizzaAModifier, pizzaModif);

		}

	}
}
