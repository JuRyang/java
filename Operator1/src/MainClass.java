
public class MainClass {

	public static void main(String[] args) {
		/*
		  Operator : 연산자
		  
		  + - *  / % = 
		  
		  % : 나머지
		 
		 */
		
		int num1, num2;
		int result;
		
		num1 = 23;
		num2 = 12;
		
		// num1 * num2 = result;
		
		// result = num1 * num2;
		// System.out.println(num1 + "*" + num2 + "=" + result);
		
		// %

		//increment(증가연산자), decrement(가감연산자)
		int n;
		n = 0;
		System.out.println("n = "+n);
		n = n +1;
		System.out.println("n = " + n);
		
		n = 0;
		System.out.println("n = " + n);
		n ++;
		System.out.println(" n = " + n);
		++n;
		System.out.println(" n = " + n);

		n--;
		System.out.println(" n = " + n);
        --n;
		System.out.println(" n = " + n);

        
		// 주의점
		int a, b;
		a = 0;
		a++;
		b = a;
		System.out.println("a =" +a);
		System.out.println("b =" +b);
		
		a = 0;
		b = a++;              // b=a를 먼저 인식하기 때문에 안됨!! 그렇게 되면 B=A이기 때문에 b는 0, a는 1
		System.out.println("a =" +a);
		System.out.println("b =" +b);
		
		a = 0; 
		b = ++a;
		System.out.println("a =" +a);
		System.out.println("b =" +b);

		
		a = 0;
		b = (a++);              // b=a를 먼저 인식하기 때문에 결국엔 이것도 0으로
		System.out.println("a =" +a);
		System.out.println("b =" +b);
		
		
	}

}




