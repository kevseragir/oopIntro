package menu;

import java.util.Arrays;

public class Menu {
 private  Meal meals[]=new Meal[10];
 private int mealCount=0;
 
 
 public void addMeal(Meal meal) {
	 meals[mealCount]=meal;
	mealCount++;
 }
 public void removeMeal(Meal meal) {
	 int index=-1;
	for(int i=0;i<mealCount;i++) {
	 if(meals[i].equals(meal)) {
		 index=i;
		 break;
	 }
}

if (index!= -1) {
	 for(int i=index;i<mealCount;i++) {
		 meals[i]=meals[i+1];
	 }
	 meals[mealCount-1]=null;
	 mealCount--;
	 
  }
  else 
	System.out.println("yemek yok");
}

public void printAllMeal() {
	for (int i=0;i<mealCount;i++) {
		
		Meal meal =meals[i];
		System.out.println("yemek adı: "+ meal.getName());
		System.out.println("ucreti: "+ meal.getPrice());
		System.out.println("Malzemeler: "+ Arrays.toString(meal.getIngredients()));
		System.out.println("kalori: "+ meal.getCalories());
		System.out.println("vegan: "+  ( meal.isVegan() ? "evet":"hayır"));
		System.out.println("gluten: "+  ( meal.isGlutenFree() ? "evet":"hayır"));
		System.out.println("----------------------------------------------------------");
	}
	System.out.println("toplam ucret "+ totalPrice());
	System.out.println("toplam kalori " + totalCalories());
}
private int totalCalories() {
	int toplam=0;
	for(int i=0;i<mealCount;i++) {
		toplam+= meals[i].getCalories();
	}
	return toplam;

}
private double totalPrice() {
	double toplam=0;
	for(int i=0;i<mealCount;i++) {
		toplam+= meals[i].getPrice();
	}
	return toplam;
}

}