package fr.pizzeria.dao;



import fr.pizzeria.model.Pizza;

public class PizzaMemDao implements IPizzaDao {
	private Pizza listPizza[]= new Pizza[0];
	private int i ;

	@Override
	public Pizza[] findAllpizzas() {
		return this.listPizza;
	}

	//cette méthode utilisera l'objet pizza rentrer en signature
	@Override
	public void saveNewPizza(Pizza pizza) {
		
		Pizza arrayTemp[] = new Pizza[(this.listPizza.length+1)];

		for (i=0;i<this.listPizza.length;i++){
			arrayTemp[i]=(this.listPizza[i]);
		}
		arrayTemp[this.listPizza.length]= pizza ;

		this.listPizza=arrayTemp;

	}

	@Override
	public void updatePizza(String codePizza, Pizza pizza) {

		for (i=0;i<this.listPizza.length;i++){
			if(this.listPizza[i].getCode().equals(codePizza)){
				this.listPizza[i] = pizza;
			}
		}
	}

	@Override
	public void deletePizza(String codePizza) {
		

		Pizza[] arrayTemp = new Pizza[this.listPizza.length-1];


		int iTemp = 0;


		for ( i= 0 ; i < this.listPizza.length ; i++){                    
			if(!this.listPizza[i].getCode().equals(codePizza)){

				arrayTemp[iTemp] = this.listPizza[i];
				iTemp ++;
			}

		
		}
		this.listPizza = arrayTemp;
	}

	@Override
	public Pizza findPizzaByCode(String codePizza) {
		
		int index = -1;
		int id = -1 ;
		for (i=0;i<this.listPizza.length;i++){
			if(this.listPizza[i].getCode().equals(codePizza)){


				index= i ;
				id = this.listPizza[i].getId();
			}
		}
		return this.listPizza[index] ;
	}

	@Override
	public boolean pizzaExists(String codePizza) {
		boolean found = false;
		for (i=0;i<this.listPizza.length;i++){
			if(this.listPizza[i].getCode().equals(codePizza)){
				found = true;
			}

		}


		return found;
	}

}
