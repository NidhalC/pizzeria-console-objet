package fr.pizzeria.service;

import java.util.Scanner;

import fr.pizzeria.dao.IPizzaDao;
import fr.pizzeria.exception.StockageException;
import fr.pizzeria.exception.UpdatePizzaException;
import fr.pizzeria.model.CategoriePizza;
import fr.pizzeria.model.Pizza;
import javafx.scene.input.TouchPoint;


public class ModifierPizzaService extends MenuService {

	@Override
	public void executeUC(IPizzaDao pizzaDao, Scanner choixMenu) throws UpdatePizzaException {
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
			System.out.println("Veuillez saisir la nouvelle catéorie parmis Viande, Poisson, Sans_Viande");
			String categorieModificationCustomer = choixMenu.next().toUpperCase();
			
			CategoriePizza nouvelleCategorie= CategoriePizza.valueOf(categorieModificationCustomer) ;
			
			
			Pizza pizzaModif  = new Pizza(nouveauCodePizza, nouveauNomPizza, nouveauprix, nouvelleCategorie);


			pizzaDao.updatePizza(codePizzaAModifier, pizzaModif);


		}

	}
}
