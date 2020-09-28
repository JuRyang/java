package semppro;

import java.util.Scanner;

public class mainclass {

	public static <Score> void main(String[] args) {

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
	
		int count= 0; // 학생의 수 
		int score= 0;
		int i=0;
		boolean b = false;
		Score [] students;
		
		System.out.print("학생의 수 입력:");
		count = scan.nextInt();
		
		
	
	    //2. 학생 수에 맞게 배열 확보
		count = i;
		
		int student [] = new int [i];
		 System.out.println(student.length);

		 for(int student =0; student<10; student++) {
			 System.out.println((i+1)+"번재 수=");
			 student[i] = sc.nextInt();
			 
		 }
		
		
		//3. 학생 수에 맞게 성적 입력
		    int a;
		    
		    System.out.print("성적 입력:");
			a = scan.nextInt();
		    
		    
		
		
		//4. 총점을 구한다
		//5. 평균을 구한다
		//6. 최대값
		//7. 최소값
		
		//8. 결과출력
	}

}
