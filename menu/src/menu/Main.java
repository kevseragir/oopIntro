package menu;

public class Main {

	public static void main(String[] args) {
	
		System.out.println("MENÜ");
		Meal meal= new Meal("mercimek çorbası",12.5, new String[] {"mercimek","tuz","yağ","su"},100,true,true);
		Meal meal2= new Meal("yaprak sarması",50, new String[] {"pirinç","salça","yağ","su"},200,true,false);
		Meal meal3= new Meal("pizza",50, new String[] {"sucuk","un","tuz","yağ","mantar","peynir"},500,false,false);
		Meal meal4= new Meal("köfte",50, new String[] {"kıyma","tuz","yağ","baharat"},1000,true,false);
	
		Menu menu=new Menu();
		menu.addMeal(meal);
		menu.addMeal(meal2);
		menu.addMeal(meal2);
		menu.addMeal(meal4);
		menu.removeMeal(meal2);
		menu.printAllMeal();//bu olmazsa yazmıyor
		
	}

}
