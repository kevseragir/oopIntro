package oopIntro;

public class Main {

	public static void main(String[] args) {
		
	Product product1= new Product(1,"lenova L14",15000,"16 RAM GB");
				 //referans olus.,ornek,intance
		
 
 Product product2= new Product();//referans olus.,ornek,intance
 
	product2.id=2;
	product2.name="Lenova L15";
	product2.unitPrice=16000;
	product2.detail="32 GB Ram";
	
Product product3= new Product();//referans olus.,ornek,intance
product3.id=3;
product3.name="Hp 5";
product3.unitPrice=10000;
product3.detail="8 GB Ram";


Product[] products = {product1,product2,product3};
for (Product product : products) {
	
	System.out.println(product.name);
	
	Category category1= new Category();
	category1.id=1;
	category1.name="bilgisayar";
	
	Category category2= new Category();
	category2.id=2;
	category2.name="ev/bahce";
	
ProductManager productmanager= new ProductManager();
productmanager.addToCart(product1);
productmanager.addToCart(product2);
productmanager.addToCart(product3);
 System.out.println(products.length );
 System.out.println();		
		
}
		
		
	}

}
