package fr.pizzeria.service;

import java.util.Scanner;

import fr.pizzeria.dao.IPizzaDao;
import fr.pizzeria.exception.DeletePizzaException;
import fr.pizzeria.exception.StockageException;


public class SupprimerPizzaService extends MenuService {

	@Override
	public void executeUC(IPizzaDao pizzaDao, Scanner choixMenu) throws DeletePizzaException {
		System.out.println("Suppression d'une pizza");
		System.out.println("Veuillez saisir le code de la pizza à supprimer");
		// TODO Auto-generated method stub

		String code = choixMenu.next() ;

		pizzaDao.findPizzaByCode(code);

		if (pizzaDao.pizzaExists(code)){
			
				pizzaDao.deletePizza(code);
			 
		}
		/*else {
			System.out.println("Désolé cette pizza n'est pas trouvable");
			
		}*/



	}
}


