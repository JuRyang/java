package test1;

import java.util.Scanner;

public class mainclass {

	private static Scanner scan;

	public static void main(String[] args) {
		// 두 수의 차 구하기 -큰 수에서 작은 수
		
		Scanner scan = new Scanner(System.in);
		
        int x; // 큰 수
		int y ; // 작은 수 
		int z;
	
			
		
 
		System.out.print("x = ");
		x = scan.nextInt();
		
		System.out.print("y = ");
		y = scan.nextInt();
		
		
		z= x-y;
		

		if(z > 0) {
		
		 System.out.println("값:"+z);
		
		} else {
			 System.out.println("다시 입력하시오:"+z);
		}
		
		
		
		
		
		
		
		
		
		
		
		//짝수와 홀수 판별하기
		
	int a; //값
		
		
		System.out.print("a = ");
		a = scan.nextInt();
		
		
		
		if(a% 2 == 1) {
			System.out.println("홀수입니다.");

		} else {
			System.out.println("짝수입니다.");
		}
		
		
		//두 수중 큰 수 찾기
		
		int i; 
		int j; 
		
		System.out.print("i = ");
		i = scan.nextInt();
		
		System.out.print("j = ");
		j = scan.nextInt();
		
		if(i>j) {
			System.out.println("i는 j보다 큽니다.");
		} else {
			System.out.println("j는 i보다 큽니다.");
		} 
		
		// 세 수중 가장 큰 수 찾기
		
	
		int c ; 
		int d ; 
		int e ;
		
		System.out.print("c = ");
		c = scan.nextInt();
		
		System.out.print("d = ");
		d = scan.nextInt();
		
		System.out.print("e = ");
		e = scan.nextInt();
		

		if(c>d && c>e ) {
			System.out.println("c가 제일 큽니다.");
		} else if(c<d && d>e) {
			System.out.println("d가 제일 큽니다.");
		}
		  else {
			System.out.println("e가 제일 큽니다.");
		}
		
		
		
		
		
		
		//최대값 찾기 (배열)
		
		int array[] = {1,2,3,100}; 
		
		int max = array[0]; //최대값
				
		for(int i1=0;i1<array.length;i1++) {
		    if(max<array[i1]) {
			
			max = array[i1];
		    }

		}
				
		System.out.println("최대값 : "+max);
		
	
		
		//두 변수값 교환하기
		
		int x1 = 1;
		int y1 = 2;
		int temp;
		
		temp = x1; // temp에 x 변수 값 저장
		x1= y1; // x에 y값 저장
		y1=temp; // temp에 있는 값 y에 저장
		
		System.out.println("x:"+x1);
		System.out.println("y:"+y1);
		

		
		// 작은 수에서 큰수까지의 합 구하기 
		
		int k; 
	
		int sum = 0;
		
		System.out.print(" k= ");
	
		k = scan.nextInt();
	
		for(k=1; k<5; k++) {
		
				
				sum=k++;
			   
			}
			System.out.println("sum:"+sum);
		

		
		
		
		
		//특정 숫자까지의 3의배수 합 구하기
		

		
		
		int i2; 
		int sum1 = 0;
		for(i2=1; i2<10; i2++) { 
			if(i%3==0) {
				
				sum1=i2;
			   }
			}
			System.out.println("sum:"+sum1);
			
			
			

		
		
		
		
		
		//1~100합 구하기 
		
		
		int i3 = 1; 
		
		int sum11 = 0;
		for(i3 = 1; i3 <= 100; i3++) {
			     sum11 += i3; 
		} 
		
		System.out.println("답:"+sum11);

	

		
	}

	}


