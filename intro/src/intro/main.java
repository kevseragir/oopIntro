package intro;

public class main {

	public static void main(String[] args) {
    //camelCase
	//Don't repeat yourself
	//System.out.println ("hello world");
		
		String internetSubeButonu = "Internet Subesi";
		
		double dolarDun = 8.15 ;
		double dolarBugun=8.18 ;
		
		int vade =36;
		boolean dolarDustu= false;
		
		
		System.out.println (internetSubeButonu);
		if (dolarBugun<dolarDun) {
			System.out.println ("dolar dustu resmi");
		}
		else if (dolarBugun>dolarDun) 
			{
				System.out.println ("dolar artti resmi");		
				
			}	
		else {
			System.out.println ("dolar esit resmi");
				
		}
		String kredi1= "hizli kredisi ";
		String kredi2= "mutlu emekli kredisi" ;
		String kredi3= "mutlu emekli kredisi";
		String kredi4= "ciftcikredisi ";
		String kredi5= "mbs kredisi ";
		
		System.out.println(kredi1);
		System.out.println(kredi2);
		System.out.println(kredi3);
		System.out.println(kredi4);
		System.out.println(kredi5);

		String[] krediler=
				{
			"hizli kredisi",
			"mutlu emekli kredisi",
			"mutlu emekli kredisi",
			"ciftcikredisi ",
			"mbs kredisi ",
			"kultur bakanligi kredisi"};
	
		//foreach
		// ilk veri sifirdir.sifirdan baslar.
	for(String kredi: krediler)
		//" :" dizi var tek tek dolas 
		//direkt listekileri alir
		System.out.println(kredi);
	{	
		
	}
	for(int i =0; i<krediler.length;i++)
	
	{
		//sayac gudumlu dongu
		// i=0>>sart,i<krediler>>sart
		// esitligin sag tarafi calisir
		System.out.println(krediler[i]);
	}	
	int sayi1=10;
	int sayi2=20;
	sayi1= sayi2;
	sayi2=100;
	System.out.println(sayi1);
	int[] sayilar1= {1,2,3,4,5};
	int[] sayilar2= {10,20,30,40,50};
	 sayilar1=sayilar2;
	 sayilar2[0]=100;
	System.out.println(sayilar1[0]);
	//veriler iki sekilde tutulur(deger,referans).
	//steack ve heap seklinde degerler
	//sayisal deger <steack tip> olarak tutulur.
	//deger atamasi olur ve kalir.
	//[] deger,classlar <heap tip> olarak tutulur.
	//deger atamasi olur ve degisir.
	String sehir1="ankara";
	String sehir2="antalya";
	sehir1=sehir2;
	sehir2="izmir" ;
	System.out.println(sehir1);
	// istisnadir bu deger gorunur.yalniz 
	//deger(normal sayilar) ve referans(dizi) tip sekilde tutulma sekildedir.
	 
	}
}