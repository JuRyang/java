package semppro;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		
		/*
		    성적관리 프로그램
		   1과목 성적 
		      총점 (합계)
		      평균 (평균 -double)
		      최고 점수 (최대값)
		      최소 점수 (최소값)
		      
		   
		 */

		//1.  학생의 성적을 입력?
	
	 
	    int student[] = null;
		int count; 
		int sum;
		double avg;//얘는 초기화 안해도 됨 sum이 초기화 되니까
		int max; //원래는 맥스는 0으로 하면 안됨 -값이면 최대값이 0이 되니까
		int mim; //최소값은 0으로 하면 더 안됨
		
		//초기화  왜냐면 다 더할거니까 
		sum=0;
		max=0;
		
		System.out.print("학생의 수 입력:");
		count = scan.nextInt();
		
	
		
	
	    //2. 학생 수에 맞게 배열 확보
		student = new int[count];
		
		
		
		
		//3. 학생 수에 맞게 성적 입력
		  for(int i =0 ; i < student.length; i++) {
			  System.out.print((i+1)+"번째 학생의 성적");
			  student[i] = scan.nextInt();
		  }
		    
		
		
		//4. 총점을 구한다
		  for(int i = 0; i< student.length; i++) {
			  sum= sum + student[i];
		  }
		  
	

		//5. 평균을 구한다
		  avg = (double)sum/student.length;
		
		  //6. 최대값                        // 95 100 75
		  max=student[0]; // 안에 있는 값으로 세팅됨
		  for(int i =0; i <student.length; i++) {
			  int num = student[i];
			  if(max < num) {
				  max = num;
			  }
			  
		  }
		//7. 최소값
		  int min = student[0];
		  for(int i= 0; i<student.length; i++) {
			  if(min > student[i]) {
			  min = student[i];
			  }
			  }
			  
		 
		
		//8. 결과출력
		  System.out.println("학생들의 총수:"+student.length +"명");
		  System.out.println("성적의 합계:"+sum +"점");
		  System.out.println("성정의 평균:"+avg+"점");
		  System.out.println("최고점수:"+max+"점");
		  System.out.println("최저점수:"+min+"점");
		  
	
	}



	}


