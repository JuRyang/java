package forclass;

public class mainclass {

	public static void main(String[] args) {
		
		/*
		      순환문: loop문
		      조건이 만족하면 반복 실행되는 제어문
		      
		      for문, foreach
		      
		      형식 :
		      
		      for( 변수선언 또는 초기화(1)( 두개 다 할 수 있음) ; 조건문(2)(5)(8)(11); 연산식(4)(7)(10)){
		             //처리(3)(6)(9)
		      		      		      }
		                              (12)
		      
		    foreach->  for(변수선언 : 배열 또는 목록){
		                                  처리  
		      }
		      
		      		      
		 */
		
		int n; //내.외부 가능
		
		for(n = 5; n < 5; n++) {
			System.out.println("for loop");
		}
		System.out.println("n="+n);
		
		/*for(int i = 0;i<10; i++) {   //내부에서만 가능
			System.out.println("i="+i);
		}
		
		for(int i = 0; i < 10; i = i + 2) {
			//System.out.println("i="+i);
			
		for(int i1 =1; i1 <=100; i1++) {
			System.out.println("i="+i1);
			
		}
		*/
		int sum = 0;
		
		for(int i = 1;i <=100; i++) {
			sum = sum + i;
			
		}
		System.out.println("sum:"+sum);
	
		
		for (int i = 10; i >0; i--) {
			System.out.println("i="+i);
		}
			
		int array[] =  { 12, 34, 45, 67, 89};
		
		//배열의 길이
		System.out.println("array.length"+ array.length);
		
		sum = 0;
		// sum = array[0] + array[1] + array[2] + array[3] + array[4];
		
		for(int i = 0; i < array.length; i++) {
		    sum = sum +array[i];		    
		}
		System.out.println("sum"+ sum);
		
		int array1[] =  { 12, 34, 45,-27, 67,-37, 89};
		
		//배열의 길이-2
		System.out.println("array.length"+ array.length);
		
		sum = 0;
		// sum = array[0] + array[1] + array[2] + array[3] + array[4];
		
		for(int i = 0; i < array.length; i++) {
			//if(array1[i]>0) {
		    sum = sum +array[i];		    
	//	}
		System.out.println("sum"+ sum);
	}
		
		
		//foreach
		for(int num : array) { // num =[0] num = [1]  
			System.out.println("num"+ num);
		}
}
}

