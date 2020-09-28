package whileclass;

import java.util.Scanner;

public class mainclass {

	public static void main(String[] args) {
		/*
		   
		   loop
		      for 
		            반복문                조건이 맞아야 탈출
		      for(초기화 ; 조건식; 연산식){
		                   처리
                }
               
              while <-for문 보다 무한루프 가능성 높음
                        
                        변수의 선언
                        초기화
             while(조건식){        if(조건식)
                                   처리
                                   연산식
                 }       		  
		 */

		int w;
		w = 0;
		while(w<10) {
			System.out.println("w="+w);
			w++;
		}
		/*
		w = 0;
		while(true){
			System.out.println("w="+w);
			w++;
		}
		*/
		
		
		/*
		 initialize (초기화)
		 w = 0
		 
		 loop(순환)
		 while(true){
		 
		 }
		 
		 release(해방)
		 
		 */
		
		
		Scanner sc = new Scanner(System.in);
		
		// 10명의 데이터를 입력 받도록 한다.
		//Array : 같은 자료형 변수의 묶음
		 int arrNum[] = new int[10]; //0-9
		 System.out.println(arrNum.length);
		 
		 for(int i =0; i<10; i++) {
			 System.out.println((i+1)+"번재 수=");
			 arrNum[i] = sc.nextInt();
			 
		 }
		
	    
	/*	int numarr[] = new int[10];
		
		int w1;
		w1 =0;
		
		while(w1 < 10) {
			System.out.print((w1+1)+"번째 수=");
			numarr[w1] = sc.nextInt();
			w1++;
		}
		*/
		
		/*
		     do while (거의 사용안함)
		     
		         변수의 초기화
		     
		     do{
		                 처리
		                 연산식
		     }while(조건식);
		 
		 */
		
		int dw;
		
		dw = 10;
		
		do {
			System.out.println("dw = "+dw); //연산식으로 처리 X, 출력이 먼저 된거임 값을 정해서 
			dw++;
		}while(dw<10);
		
		/*
		    break문: 탈출(loop) <-많이 사용함
		    
		    switch(변수){
		         case 값:
		                          처리
		             break;
		             case 값1:
		                          처리1
		             break;
		        }
		        
		        for(int i = 0; i <10 i++){
		                        처리
		                        탈출-> break;
		          }
		          
		          while(){
		               break;
		               }
		 */
		//0~100에서 23까지만 출력하고 멈춰라 
		for(int i =0; i < 100; i++) {
			System.out.println("i="+i);
			if(i == 23) {
				break;
			}
			
		}
		 w=0;
		 while(w<100) {
			 System.out.println("w="+w);
			 if(w==56) {
				 break;
			 }
			 w++;
		 }
		int numArr[] = {2,9,3,-4,12};
		
		for(int i= 0; i< numArr.length; i++) {
			int number = numArr[i];
			System.out.println("number["+i+"]=" +numArr[i]);
			if(number<0) {
				break;
				
			}
			
			//2중 for
			for(int a =0; a< 10; a++) {
				System.out.println("a="+a);
				
				for (int j	 = 0; j<5; j++) {
					System.out.println("\tj="+j);
					if( a ==5 && j ==3) {
						break;
					}
					
				}
			}
			
			//1.탈출방법
			boolean b = false;
			for(int a =0; a< 10; a++) {
				System.out.println("a="+a);
				
				for (int j	 = 0; j<5; j++) {
					System.out.println("\tj="+j);
					if( a ==5 && j ==3) {
						b=true;
						
					}
					if(b== true) {  //j for문 탈출
						break;
					}
					
				}
				if(b== true) {  //a for문 탈출
					break;
			}
		}
			
			//2. 탈출방법
			outside:for(int a =0; a< 10; a++) {
				System.out.println("a="+a);
				
				for (int j	 = 0; j<5; j++) {
					System.out.println("\tj="+j);
					if( a ==3 && j ==2) {
						break outside;  //break 아무이름 ,아무이름 for
					}
	}
			}
		}
		// continue : 생략(skip) 입력이 잘못된 경우에 쓰임
		/*
		      loop문과 같이 사용
		      
		       while(조건식){
		            처리1
		            처리2 
		            처리3
		            if(조건식){
		               continue;
		            }
		            처리4
		          
		                           연산식
		       }
		  
		  
		 */
		
		for(int h = 0; h<10; h++) {
			System.out.println("for strat");
			
			System.out.println("h="+h);
			
			if(h>4) {
				continue;
			}
			System.out.println("for end"); //
		}
		
		/*w=0;
		while(w <10) {
			System.out.println("while strat");
			System.out.println("w="+w);
			
			if(w>4) {
				continue;
			
		}
			System.out.println("while end");
			w++;//무한루프
		}*/
		
	
}
}
