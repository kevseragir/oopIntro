package asalSayilar;

public class asalSayilar {

	public static void main(String[] args) {
		 
		int number=1;
		
		int remainder= number%2;
		
		//remainder kalan demektir/
		
	 boolean isPrime=true;
	 if (number==1) 
	 {
		 System.out.println("Asal sayi degildir.");
		 return;
	 };
	 if (number<2) 
	 {
		 System.out.println("gecersizsayi");

	 };
		
	 for(int i=2;i<number;i++) 
	 {
		 if(number%i==0) {
				isPrime=false;
			}}
		 if(isPrime) {
				System.out.println("sayi asaldir");

			}
	else {
				System.out.println("sayi asal degildir");
			}
			
		//"1" sayisinda bug vardir
		 
		
		
	
		
		
		
		
		
		
		
		
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
