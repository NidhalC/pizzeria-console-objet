package fr.pizzeria.service;

import java.util.Scanner;

import fr.pizzeria.dao.IPizzaDao;

import fr.pizzeria.model.Pizza;

public class ListerPizzasService extends MenuService {

	@Override
	public void executeUC(IPizzaDao pizzaDao, Scanner choixMenu) {
		
		Pizza[] pizzas = pizzaDao.findAllpizzas();
		
		for(int i=0; i<pizzas.length; i++){
			pizzas[i].affichage();
		}
	}

	

}
