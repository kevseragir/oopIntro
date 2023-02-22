package nesneTanimlama;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {

		  Scanner input = new Scanner(System.in);
		  System.out.println("pozitif sayi giriniz:");
		  int sayi=input.nextInt();
		  int i=2;
		  boolean asalMi=true;
		  while(i<=sayi/2){
		     if (sayi%i==0) {
		     asalMi=false;
		     break;	  
		    }
		    i++;
	        }
		 if (sayi==1||!asalMi) {
			 System.out.println("Asal sayi degilldir");	 
		 }
		 else {
			 System.out.println("Asal sayidir.");
		 }

		
		
		

	}

}
