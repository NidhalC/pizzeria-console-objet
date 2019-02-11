package fr.pizzeria.exception;

import fr.pizzeria.dao.PizzaMemDao;
import fr.pizzeria.model.Pizza;

public class SavePizzaException extends StockageException {
	public SavePizzaException(){
		
	}

	public SavePizzaException(String msg) {
		super(msg);

	}

	
}


