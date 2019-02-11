package fr.pizzeria.dao;



import java.util.ArrayList;
import java.util.List;

import fr.pizzeria.exception.DeletePizzaException;
import fr.pizzeria.exception.SavePizzaException;
import fr.pizzeria.exception.UpdatePizzaException;
import fr.pizzeria.model.Pizza;
import fr.pizzeria.service.SupprimerPizzaService;

public class PizzaMemDao implements IPizzaDao {
	private List<Pizza> listPizza= new ArrayList<Pizza>();
	private int i ;

	@Override
	public List<Pizza> findAllpizzas() {
		return this.listPizza;
	}

	//cette méthode utilisera l'objet pizza rentrer en signature
	@Override
	public void saveNewPizza(Pizza pizza) throws SavePizzaException{

		this.listPizza.add(pizza);


		if(pizzaExists(pizza.getCode()) == true){
			throw new SavePizzaException("cette pizza existe deja");
		}

	}

	@Override
	public void updatePizza(String codePizza, Pizza pizza) throws UpdatePizzaException {

		for (i=0;i<this.listPizza.size();i++){
			if(this.listPizza.get(i).getCode().equals(codePizza)){

				this.listPizza.set(i, pizza);
				return ;
			}
			
		}
		throw new UpdatePizzaException("le code entré n'existe pas");
	}

	@Override
	public void deletePizza(String codePizza) throws DeletePizzaException {
		for (i=0;i<this.listPizza.size();i++){
			if(this.listPizza.get(i).getCode().equals(codePizza)){

				this.listPizza.remove(i);
				return;
			}
		}
		throw new DeletePizzaException("la pizza n'a pas été supprimer");
	}

	@Override
	public Pizza findPizzaByCode(String codePizza) {
		Pizza maPizza =null ;
		for (i=0;i<this.listPizza.size();i++){
			if(this.listPizza.get(i).getCode().equals(codePizza)){

				maPizza = listPizza.get(i);
			}
		}
		return maPizza;
	}


	@Override
	public boolean pizzaExists(String codePizza) {
		boolean found = false;
		for (i=0;i<this.listPizza.size();i++){
			if(this.listPizza.get(i).getCode().equals(codePizza)){
				found = true;
			}
		}

		return found;
	}

}
