import java.util.Scanner;

public class Sample {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int myMoney;       // 내 돈
		int price;           // 지불해야할 금액
		int changeMoney;     // 거스름 돈
        
		/*  
		mymoney = 10000;
		price = 3240;
		changeMoney = myMoney - price;  //6760
		*/
		
		System.out.print("지불해야 될 금액 = ");
		price = sc.nextInt();
		
	    System.out.print("본인이 지불한 금액 = ");
	    myMoney = sc.nextInt();
		
	    
	    
		int m5000;
		int m1000;
		int m500;
		int m100;
		int m50;
		int m10;
		
		
		m5000 = changeMoney / 5000;
		m1000 = (changeMoney % 5000) / 1000;
		m500 = (changeMoney % 1000) / 500;
		m100 = (changeMoney % 500) / 100;
		m50 = (changeMoney % 100) / 50;
		m10 = (changeMoney % 50) / 10;
		
		System.out.println("거스름 돈 :" + changeMoney);
		System.out.println("5000원권 : " + m5000 + "장");
		System.out.println("1000원권 : " + m1000 + "장");
		System.out.println("500원권 : " + m500 + "장");
		System.out.println("100원권 : " + m100 + "개");
		System.out.println("50원권 : " + m50 + "개");
		System.out.println("10원권 : " + m10 + "개");



		
		
	}

}
