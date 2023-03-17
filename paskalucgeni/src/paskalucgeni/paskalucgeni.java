package paskalucgeni;

public class paskalucgeni {

	   public static void main(String args[]){

	     int maxSatir=6;

	     for(int n =0;n<=maxSatir;n++){

		for(int k=0;k<=n;k++){
	       System.out.print(fact(n)/(fact(k)*fact(n-k))+" ");
	      }
	      System.out.println();
	    }
	 }

		public
		static
		double fact(double x){

			if ( x == 0 ) 

				return 1;

			if ( x == 1 ) 

				return 1;

			else

				return x* fact ( x-1);

	      }

	}
	
	