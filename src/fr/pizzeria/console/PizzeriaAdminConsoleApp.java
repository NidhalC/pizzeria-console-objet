package fr.pizzeria.console;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class PizzeriaAdminConsoleApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner choiceMenu = new Scanner(System.in);


		int choice = 0;
		int i;
		Pizza peperoni = new Pizza(0, "PEP", "Pépéroni", 12.50);
		Pizza margherita = new Pizza(1, "MAR", "Margherita", 14.00);
		Pizza laReine = new Pizza(2, "REIN", "La Reine", 11.50);
		Pizza fromage = new Pizza(3, "FRO", "LA 4 fromages", 12.00);
		Pizza cannibale = new Pizza(4, "CAN", "La cannibale", 12.50);
		Pizza savoyarde = new Pizza(5, "SAV", "La savoyarde", 13.00);
		Pizza orientale = new Pizza(6, "ORI", "L'orientale", 13.50);
		Pizza indienne = new Pizza(7, "IND", "L'indienne", 14.00);

		Pizza listPizza[] ={peperoni,margherita,laReine,fromage,cannibale,savoyarde,orientale,indienne} ;

		while (true) {
			System.out.println("***** Pizzeria Administration******");
			System.out.println("1.Lister les pizza.");
			System.out.println("2.Ajouter une nouvelle pizza.");
			System.out.println("3.Mettre à jour une pizza");
			System.out.println("4.Supprimer une pizza");
			System.out.println("99.Sortir.");

			choice = choiceMenu.nextInt();

			if (choice == 1){
				for (i=0;i<listPizza.length;i++){
					listPizza[i].affichage();
				}

				choice= 0;
			}


			else if (choice == 2){
				System.out.println("Ajout d'une nouvelle pizza");
				System.out.println("Veuillez saisir le code:");
				String codeCustomer = choiceMenu.next();

				System.out.println("Veuillez saisile le nom(sans espace)");
				String libelleCustomer = choiceMenu.next();

				System.out.println("Veuillez saisir le prix");
				double prixCustomer = choiceMenu.nextDouble();

				Pizza pizzaCustomer= new Pizza(codeCustomer, libelleCustomer, prixCustomer);

				Pizza arrayTemp[] = new Pizza[(listPizza.length+1)];

				for (i=0;i<listPizza.length;i++){
					arrayTemp[i]=(listPizza[i]);
				}
				arrayTemp[listPizza.length]= pizzaCustomer ;


				listPizza=arrayTemp;

				for (i=0;i<listPizza.length;i++){
					listPizza[i].affichage();
				}
				choice= 0;
			}

			else if (choice == 3){
				boolean found = false ;
				int index = -1;
				int id = -1 ;
				System.out.println("Mise à jour d'une pizza");

				for (i=0;i<listPizza.length;i++){
					listPizza[i].affichage();
				}

				System.out.println("Veuillez choisir le code de la pizza a modifier");
				String codeModif= choiceMenu.next();
				for (i=0;i<listPizza.length;i++){
					if(listPizza[i].getCode().equals(codeModif)){

						found = true;
						index= i ;
						id = listPizza[i].getId();
						break;
					}
				}
				if(found=true){
					System.out.println("Veuillez saisir le nouveau code");

					codeModif = choiceMenu.next();

					System.out.println("Veuillez saisir le nouveau nom : ");
					String nomModif = choiceMenu.next();

					System.out.println("Veuillez saisir le nouveau prix : ");
					double prixModif = choiceMenu.nextDouble();

					listPizza[index] = new Pizza(id, codeModif, nomModif, prixModif);

					for (i=0;i<listPizza.length;i++){
						listPizza[i].affichage();
					}

				} else {
					System.out.println("Désolé cette pizza n'est pas trouvable");
					break;
				}
				choice =0;


			}



			else if (choice == 4){
				System.out.println("Suppression d'une pizza");
				System.out.println("Veuillez saisir le code de la pizza à supprimer");
				String code = choiceMenu.next() ;

				//tableau temporaire plus petit que le précédent
				Pizza[] arrayTemp = new Pizza[listPizza.length-1];

				//Va servir de compteur temporaire
				int iTemp = 0;

				//l'ancien tableau pour recopier les valeurs
				for ( i= 0 ; i < listPizza.length ; i++){                    

					//seulement pour les valeurs différentes de la pizza à supprimer
					if(!listPizza[i].getCode().equals(code)){

						arrayTemp[iTemp] = listPizza[i];
						iTemp ++;
					}

					//le tableau initial par le tableau temporaire
					listPizza = arrayTemp;

					//afficher le nouveau tableau
					for (i=0;i<listPizza.length;i++){
						listPizza[i].affichage();
					}

					//retour au menu
					choice= 0;         
				}
			}

			else if(choice == 99) {
				System.out.println("Aurevoir :(");
				break;

			}

		}

	}

}
