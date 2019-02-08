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
		Iterator iterator = mespizzas.iterator();

		while (iterator.hasNext()){
			Pizza mesPizzas = (Pizza) iterator.next();
			mesPizzas.affichage();
		}
	}
}
