package fr.pizzeria.console;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

import fr.pizzeria.dao.IPizzaDao;
import fr.pizzeria.dao.PizzaMemDao;
import fr.pizzeria.exception.SavePizzaException;
import fr.pizzeria.exception.StockageException;
import fr.pizzeria.model.CategoriePizza;
import fr.pizzeria.model.Pizza;
import fr.pizzeria.service.AjouterPizzaService;
import fr.pizzeria.service.ListerPizzasService;
import fr.pizzeria.service.MenuService;
import fr.pizzeria.service.MenuServiceFactory;
import fr.pizzeria.service.ModifierPizzaService;
import fr.pizzeria.service.SupprimerPizzaService;

public class PizzeriaAdminConsoleApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner choixMenu = new Scanner(System.in);
		int choice = 0;
		IPizzaDao pizzaDao =new PizzaMemDao();
		CategoriePizza typePizza= null ;


		Pizza peperoni = new Pizza(0, "PEP", "Pépéroni", 12.50, typePizza.VIANDE);
		Pizza margherita = new Pizza(1, "MAR", "Margherita", 14.00,typePizza.SANS_VIANDE);
		Pizza laReine = new Pizza(2, "REIN", "La Reine", 11.50, typePizza.VIANDE);
		Pizza fromage = new Pizza(3, "FRO", "LA 4 fromages", 12.00,typePizza.SANS_VIANDE);
		Pizza cannibale = new Pizza(4, "CAN", "La cannibale", 12.50,typePizza.VIANDE);
		Pizza savoyarde = new Pizza(5, "SAV", "La savoyarde", 13.00,typePizza.VIANDE);
		Pizza orientale = new Pizza(6, "ORI", "L'orientale", 13.50,typePizza.VIANDE);
		Pizza indienne = new Pizza(7, "IND", "L'indienne", 14.00,typePizza.VIANDE);

		try {
			//pizzaDao.saveNewPizza(peperoni);
			//pizzaDao.saveNewPizza(peperoni);
			pizzaDao.saveNewPizza(margherita);
			pizzaDao.saveNewPizza(laReine);
			pizzaDao.saveNewPizza(fromage);
			pizzaDao.saveNewPizza(cannibale);
			pizzaDao.saveNewPizza(savoyarde);
			pizzaDao.saveNewPizza(orientale);
			pizzaDao.saveNewPizza(indienne);
		} 
		catch (SavePizzaException e) {
			e.getMessage();
		}

		while (true) {
			System.out.println("***** Pizzeria Administration******");
			System.out.println("1.Lister les pizza.");
			System.out.println("2.Ajouter une nouvelle pizza.");
			System.out.println("3.Mettre à jour une pizza");
			System.out.println("4.Supprimer une pizza");
			System.out.println("99.Sortir.");

			choice = choixMenu.nextInt();

			if (choice > 0 && choice < 5){
				try {
					MenuServiceFactory.menuFactory(choice).executeUC(pizzaDao, choixMenu);
				} catch (StockageException e) {
					System.out.println(e.getMessage()); 
				}
				choice= 0;
			}

			else if(choice == 99) {
				System.out.println("Aurevoir :(");
				break;
			}
		}
	}
}




