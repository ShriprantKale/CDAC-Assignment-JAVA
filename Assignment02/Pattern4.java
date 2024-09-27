package Assignment02;

public class Pattern4 {
	public static void main(String args[]) {
		int row =3;
		int col =3;
		//char ch='A';
		           for(int i=0; i<=row;i++) {
		        	   char ch='A';
		        	   for(int j=0;j<=col;j++) {
		        		  
		        		   System.out.print((char)(ch+i+j));
	
		        	   
		        	   
		        	   }
		        	   System.out.println(" ");
		           }
	}

}
//ABCD 
//BCDE 
//CDEF 
//DEFG 