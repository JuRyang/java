package findNumber;

import java.util.Scanner;

public class teac {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner scan = new Scanner(System.in);
		//1.변수의 선언
		  int r_num, u_num; //랜덤숫자,사용자 숫자
		  boolean clear;
		  String s_num; // 선언해줬으니 문자 넣어도 에러 안남 
		  
		  
		  clear = false;
		  
		//2.random숫자 뽑기(1~100)
		  r_num= (int)(Math.random()*100)+1;
		  System.out.println("r_num:"+r_num);
		  
		//----------------------loop구간 반복(10회 반복)
		  
		  boolean b = false;
		  int count = 0;
		  while(count<10) {
		  
		  
		
		//3.유저의 입력
		  while(true) {
			  b= false;
		  
			  System.out.print((count + 1) + "회 숫자입력 = ");
			//u_num = scan.nextInt();
		 s_num = scan.next(); 
		 
		 //System.out.println(s_num.length()); //문자랑 숫자랑 구분하기 위해 문자를 넣으면 문자 길이 만큼 숫자 출력
		   for (int i = 0; i< s_num.length(); i++) {
			   char c = s_num.charAt(i);
			   // System.out.println("c="+c); //한글자씩 출력, 왜 이렇게 해?? 숫자가 아닌 값이 분류
			  
			   /*
			   if(c !='0'&&c !='1'&& c !='2'&& 
				   c !='3'&&c !='4'&&c !='5'&&c !='6'&&c !='7'&&c !='8'&&
				   c !='9'){
					System.out.println("정상적인 숫자를 입력해주십시오");   
					b = true;
				   break;
				   }
				   */
			   int asc =(int)c;
			   if(asc < 48|| asc > 57) {
				   System.out.println("정상적인 숫자를 입력해주십시오");   
					
				   b=true;
				   break;
			   }
			   
			   
			   
			   
			   
			   
			   
		   }
		   
		   if(b== false) { //문제없음
			 //  System.out.println("문제없이 입력함");
			   break;
		   }
		   
		   System.out.println("b = " + b);
		  }
		  
		 // 문자열 -> 숫자
		   u_num =Integer.parseInt(s_num);
		   
		//4.판정(크다/작다)
		   if(u_num>r_num) {
			   System.out.println("너무 큽니다.");
		   }
		   
		   else if(u_num<r_num) {
			   System.out.println("너무 작습니다.");
		   }
		   else { // 숫자를 맞춘 경우
			  clear = true;
			  break;
			   
		   }
		   count++;
		  }
			
			
         //결과
		  if(clear == true) {
			  System.out.println("클리어");
		  }
		  else {
			  System.out.println("오버");
		  }
		
}
}
