package forclass;

import org.w3c.dom.css.Counter;

public class mainClass1 {

	public static void main(String[] args) {
		//2중 for
		/*
		 * 
		      for(초기화(1); 조건식(2)(5)(8)(11); 연산식(4)(7)(10)){
		                      처리(3)(6)(9)
		                   }
		                   (12)
		                   
		        for(초기화; 조건식; 연산식){
		        
		                   for(초기화(1) ; 조건식;(2)(15) 연산식(14)){
		                        for(초기화(3)(16) ; 조건식;(4)(7)(10)(13) 연산식(6)(9)(12)){
		                                               처리(5)(8)(11)
	                                }
		                     }
		                     
		                     for (int i = 0; i < 5; i++){	i =0	i=1  i=2                     
		                         for(int j = 0;j <3; j++){  012     012   012 
		                                                          처리 
		                     */
		
		
		  int count = 0;
		for(int i = 0; i < 5; i++) {
			System.out.println("i="+i);
			for (int j = 0; j < 3; j++) {
				count++;
				System.out.println("\tj="+j);
			}
		}
		
		//System.out.println("count:"+count);
		
		/*   9
		     ***** 5
		     *****
		     *****
		     *****
		     *****
		     *****
		     *****
		     *****
		     *****
		     
		     *
		     **
		     ***
		     ****
		     *****
		     ****
		     ***
		     **
		     *
		 */
		for(int j = 0;j < 9; j++) {
			for(int i = 0;i < 5; i++) {
				System.out.print("*");
				if(i == 4) {
					System.out.println();
				}
			}
		/*=
		  for(int j = 0;j < 9; j++) {
			for(int i = 0;i < 5; i++) {
				System.out.print("*");
		 }
		 System.out.println();
		 }
		 }
		 }
		 
		 */
		}
		
		System.out.println();
		System.out.println();
		
		
		
		 
				


		//	System.out.println();
		
		
		System.out.println();
		System.out.println();
		
		int n = 0;
		for(int j = 0;j < 9; j++) {	
			
			if(j < 5)	n++;		
			else		n--;
			for(int i = 0;i < n; i++) {
				System.out.print("*");				
			}
			System.out.println();
		}
		System.out.println();
		System.out.println();
				 
				 
				 
				  //int x,y;
						
			/*		 for(x= 0;  x< 9; x++) 
						 {
						
							 for(y= 0;  y< 9; y++) 
							 {
							 if(j < 5)	n++;		
			else		n--;
			for(int i = 0;i < n; i++) {
				System.out.print("*");				
			}
								 
			 }
		 
					 System.out.println();
					 
					 
		
	}
			
	*/
		 
		 /*
		  
		  ***
		  * 
		  ****
		  **
		  *****
		  ***
		  *
		  
		  */
	
	
		 int arrNum[] = {3,1,4,2,5,3,1};
		 
		 for(int i =0; i <7; i++) {
		 
		 for (int j = 0; j < arrNum[i]; j++) {
				 System.out.print("*");
		 }
				 System.out.println();
	}
}
	}



		
		
		

