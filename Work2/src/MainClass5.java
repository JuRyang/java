import java.util.Scanner;

public class MainClass5 {

	public static void main(String[] args) {
		/* 
		 편의점에서 계산할 때, 
		 
		 // 입력하기 (지불해야 할 돈이랑 내가 낸 돈이랑) -> 거스름돈 계산한 후에
		 지불해야 할 금액 : 3240
		 내가 낸 돈 : 10000
		 
		 거스름돈 계산하기 5000원권 몇장? 
		             1000원권 몇장?
		             500원 몇개? 
		             100원 몇개?
		             50원 몇개? 
		             10원 몇개?
		
		hint : 나눗셈이랑 % 이용해서 하기.
		 
		 
		 */
		
		
		int num1, num2;
		num1 = 3240;
		num2 = 10000;
		System.out.println(num2 - num1);
        
		
		int a =num2-num1;
		System.out.println(a/5000);
		int b = a%5000;
		System.out.println(b/1000);
		int c = a%1000;
		System.out.println(c/500);
		int d = a%500;
		System.out.println(d/100);
		int e = a%100;
		System.out.println(e/50);
		int f = a%50;
		System.out.println(f/10);
		
		
		Scanner scan = new Scanner(System.in);
		int price;
		price = scan.nextInt(); 
		System.out.println("지불해야 할 금액 : " + price);
		
		int paid;
		paid = scan.nextInt(); 
		System.out.println("본인이 낸 금액 : " + paid);
		
		
		





		
		
		
		
		
		
	}

}
