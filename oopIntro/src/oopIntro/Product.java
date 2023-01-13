package oopIntro;

public class Product {
 public Product() { //constructor block
	 System.out.println("ben calisti");
 }
 public Product(int id,String name,double unitPrice,String detail) { //constructor block
	 this();//parametresiz constructor calisir
	 this.id=id;
	 this.name=name;
	 this.unitPrice=unitPrice;
	 this.detail=detail;
 }//Product() -->imza
	int id;
	String name;
	double unitPrice;
	String detail;
	
	//classlar ikiye ayrilir.ozellik ve method ikisi ayridir.
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
