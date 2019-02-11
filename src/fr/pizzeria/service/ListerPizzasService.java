package fr.pizzeria.service;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import fr.pizzeria.dao.IPizzaDao;

import fr.pizzeria.model.Pizza;

public class ListerPizzasService extends MenuService {

	@Override
	public void executeUC(IPizzaDao pizzaDao, Scanner choixMenu) {

		List<Pizza> mespizzas = pizzaDao.findAllpizzas();
		//System.out.println(mespizzas + " "+"trouvé mes pizza");
		Iterator iterator = mespizzas.iterator();

		for (Pizza maPizzas : mespizzas){
			//Pizza maPizzas = (Pizza) iterator.next();
			System.out.println(mespizzas.size());
			maPizzas.affichage();
		}
	}
}
