package pack;

public class Produit1 {

	   int id;
	   String libelle;
	   String marque;
	   float prix;
	   String date;
	   //création un produit vide
	   Produit1(){
		   id=0;
		   libelle="";
		   marque="";
		   prix=0.0f;
	   }
	   void affiche() {
		   System.out.print("Id : ");System.out.println(id);
		   System.out.print("libelle : ");System.out.println(libelle);
		   System.out.print("marque : ");System.out.println(marque);
		   System.out.print("prix : ");System.out.println(prix);
		   System.out.print("date : ");System.out.println(date);
		   System.out.println("");
	   }
	   	public static void main(String[] args) {
			// TODO Auto-generated method stub
			Produit1 produit1,produit2,produit3;
			produit1 = new Produit1();
			produit2 = new Produit1();
			produit3 = new Produit1();
			
			produit1.id=1021;
			produit1.libelle="Lait";
			produit1.marque="Delice";
			
			produit2.id=2510;
			produit2.libelle="Yaourt";
			produit2.marque="Vitalait";
			
			produit3.id=3250;
			produit3.libelle="Tomate";
			produit3.marque="Sicam";
			produit3.prix=1.200f;
			
			//Afficher tous les produit par une methode affiche()
		   System.out.println("Afficher tous les produit par une methode affiche()");
		   System.out.println("Produit 1 ");produit1.affiche();
		   System.out.println("Produit 2 ");produit2.affiche();
		   System.out.println("Produit 3 ");produit3.affiche();	
	       
	       //attribuer le prix 0.700 au produit lait (produit1), afficher
	       System.out.println("attribuer le prix 0.700 au produit lait (produit1), afficher");
	       produit1.prix=0.700f;
	       produit1.affiche();
	       
	       //compléter les informations manquants pour chaque produit
	       System.out.println("");
	       produit1.prix=1.800f;
	       
	       
	       produit2.prix=0.500f;
	       
	       //afficher les produits modifier
	       System.out.println("afficher les produits modifier");
	       produit1.affiche();
	       produit2.affiche();  
	      
	       produit1.date="04/07/2000";
	       produit2.date="04/07/2000";
	       produit3.date="04/07/2000";
	       System.out.println("Produit 1 ");produit1.affiche();
	       System.out.println("Produit 2");produit2.affiche();
	       System.out.println("Produit 3 ");produit3.affiche();
		}
	   
	   	

	}





