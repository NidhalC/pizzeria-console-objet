package fr.pizzeria.service;

import java.util.Scanner;

import fr.pizzeria.dao.IPizzaDao;
import fr.pizzeria.exception.SavePizzaException;
import fr.pizzeria.exception.StockageException;
import fr.pizzeria.model.CategoriePizza;
import fr.pizzeria.model.Pizza;


public class AjouterPizzaService extends MenuService {

	@Override
	public void executeUC(IPizzaDao pizzaDao, Scanner choixMenu) throws SavePizzaException {
		System.out.println("Ajout d'une nouvelle pizza");
		System.out.println("Veuillez saisir le code:");
		
		String codeCustomer = choixMenu.next();
		System.out.println("Veuillez saisile le nom(sans espace)");
		String libelleCustomer = choixMenu.next();
		System.out.println("Veuillez saisir le prix");
		double prixCustomer = choixMenu.nextDouble();
		
		System.out.println("Veuillez saisir la catégorie de la pizza parmis Viande, Poisson ,Sans Viande");
		String categorieCustomer = choixMenu.next().toUpperCase();
		CategoriePizza categorie= CategoriePizza.valueOf(categorieCustomer) ;
		
		

		Pizza pizzaCustomer= new Pizza(codeCustomer, libelleCustomer, prixCustomer, categorie);
		
		 
			pizzaDao.saveNewPizza(pizzaCustomer);
		
	}

}
