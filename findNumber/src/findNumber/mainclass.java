package findNumber;

import java.util.Scanner;

public class mainclass {

	public static void main(String[] args) {
		/* 
		  숫자 찾기 게임
		  
		 random number 뽑아
		  범위 : 1 ~ 100 -> number (71)뽑음
		  
		  user에게 입력: 50 (비교)
		  ->너무 작습니다.
		  
		  user에게 입력: 75 (비교)
		  ->너무 큽니다.
		  
		  user에게 입력: 65 (비교)
		  ->너무 작습니다.
		  
		  user에게 입력: 70 (비교)
		  ->너무 작습니다.
		  
		  user에게 입력: 71 (비교)
		  ->
		 */
		
		//1.변수의 선언
		  int rannum ; //랜덤숫자
		  int i; //숫자
		  int count;
		  
		
	
		//2.random숫자 뽑기(1~100)
		  i = (int)(Math.random()*100)+1;
		  System.out.println("rannum="+i);
		  
		  
		//----------------------loop구간 반복(10회 반복)
		//3.유저의 입력
		  
		  Scanner scan = new Scanner(System.in);
		int us; //   유저값 

			System.out.print("us = ");
			us = scan.nextInt();
			
		  
		//4.판정(크다/작다)
		

			if(i < us){
				System.out.println("크다");
			}else if (i > us)  {
				System.out.println("작다");
			}else if (i == us) {
				System.out.println("같다");
			}
			
	}		
	
		
			
					 }
		    		
				 

			
		    	



		    	
	
			
		    	
    
			
		//---------------------
		
		//5.결과출력
		    

	
  
