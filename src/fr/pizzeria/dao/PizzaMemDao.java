package fr.pizzeria.dao;



import java.util.ArrayList;
import java.util.List;

import fr.pizzeria.model.Pizza;

public class PizzaMemDao implements IPizzaDao {
	private List<Pizza> listPizza= new ArrayList<>();
	private int i ;

	@Override
	public List<Pizza> findAllpizzas() {
		return this.listPizza;
	}

	//cette méthode utilisera l'objet pizza rentrer en signature
	@Override
	public void saveNewPizza(Pizza pizza) {
		listPizza.add(pizza);

	}

	@Override
	public void updatePizza(String codePizza, Pizza pizza) {
		for (i=0;i<this.listPizza.size();i++){
			if(this.listPizza.get(i).getCode().equals(codePizza)){

				this.listPizza.set(i, pizza);
			}
		}
	}

	@Override
	public void deletePizza(String codePizza) {
		for (i=0;i<this.listPizza.size();i++){
			if(this.listPizza.get(i).getCode().equals(codePizza)){

				this.listPizza.remove(i);
			}
		}
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
