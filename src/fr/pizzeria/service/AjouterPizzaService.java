package fr.pizzeria.service;

import java.util.Scanner;

import fr.pizzeria.dao.IPizzaDao;
import fr.pizzeria.model.Pizza;


public class AjouterPizzaService extends MenuService {

	@Override
	public void executeUC(IPizzaDao pizzaDao, Scanner choixMenu) {
		System.out.println("Ajout d'une nouvelle pizza");
		System.out.println("Veuillez saisir le code:");
		
		String codeCustomer = choixMenu.next();
		System.out.println("Veuillez saisile le nom(sans espace)");
		String libelleCustomer = choixMenu.next();
		System.out.println("Veuillez saisir le prix");

		double prixCustomer = choixMenu.nextDouble();

		Pizza pizzaCustomer= new Pizza(codeCustomer, libelleCustomer, prixCustomer);
		
		 pizzaDao.saveNewPizza(pizzaCustomer);
	}

}
