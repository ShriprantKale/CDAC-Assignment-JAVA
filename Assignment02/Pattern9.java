package Assignment02;

public class Pattern9 {

	public static void main(String[] args) {  
        int row = 5;  
//        int num = 1; 

        // Loop for each row  
        for (int i = 1; i <= row; i++) {
        	
        	 int num = i; 
            for (int j = i; j < row; j++) {  
                System.out.print("");  
            }  

            
            for (int j = 1; j <= i; j++) {  
                System.out.print(num+" ");  
                num++;  
            }  


            System.out.println();  
        }  
	}

}

/*
1
2 3
3 4 5 
6 7 8 9
 */

