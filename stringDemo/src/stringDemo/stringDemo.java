package stringDemo;

public class stringDemo {

	public static void main(String[] args) {
		String mesaj="Bugun hava cok guzel";
		System.out.println(mesaj); 
		System.out.println("Eleman Sayisi:"+ mesaj.length());
		System.out.println("5.Eleman Sayisi:"+ mesaj.charAt(4));
		System.out.println(mesaj.concat(" yasasin!"));
			//  concat metin toplar.
		System.out.println(mesaj.startsWith("B"));
		      //startsWith eger cumle baslangic harfi b ise true,farkli harf ise false
		System.out.println(mesaj.endsWith("B"));
		    //endsWith eger cumle baslangic harfi b ise true,farkli harf ise false
		char[] karakterler = new char[5];
		mesaj.getChars( 0 , 5 , karakterler,0);
		//genel geçersiz getChars(int srcBegin, int srcEnd, char[] dst, int dstBegin)
		   //Karakterleri al opertoru getChars
		//srcBegin : int değeri, kopyalamanın başlayacağı dizini temsil eder.
		///srcEnd : int değeri, kopyalamanın durdurulacağı dizini temsil eder.
		//dst : char dizisi, verilerin kopyalanacağı diziyi temsil eder.
		//dstBegin : int değeri, kopyalanan verileri yapıştırmaya başlamak için dst dizisinin dizinini temsil eder.
		System.out.println(karakterler);
		System.out.println(mesaj.indexOf("av"));
		System.out.println(mesaj.lastIndexOf("a"));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}


}

