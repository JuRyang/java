import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		// 변수의 선언
		String name;
		int age;
		boolean lady;
		String phone;
		double height;
		String address;
		
		System.out.println("=================================================================");
		System.out.println("\\\tname\tage\tlady\tphone\t\theight\taddress\t\\");
		System.out.println("=================================================================");

		
		
		// 변수의 대입 
		name = "홍길동";
		age = 20;
		lady = false;
		phone = "010-111-2222";
		height = 175.12;
		address = "경기도";
		
		// 출력
		System.out.println("\\\t" + name + "\t" + age + "\t" + lady + "\t" + phone + "\t" + height + "\t" + address + "\t\\");
		
		
		
		
       // 변수의 대입
		name = "일지매";
		age = 18;
		lady = true;
		phone = "02-123-4567";
		height = 180.01;
		address = "서울";
		
		
		
		// 출력
		System.out.println("\\\t" + name + "\t" + age + "\t" + lady + "\t" + phone + "\t" + height + "\t" + address + "\t\\");

		
		 // 변수의 대입
		name = "장옥정";
		age = 14;
		lady = true;
		phone = "02-345-7890";
		height = 155.78;
		address = "부산";

		
		// 출력
		System.out.println("\\\t" + name + "\t" + age + "\t" + lady + "\t" + phone + "\t" + height + "\t" + address + "\t\\");

		System.out.println("=================================================================");

		
		Scanner sc = new Scanner(System.in);
		System.out.print("이름:");
		String _name = sc.next();
		
		System.out.print("나이:");
		int _age = sc.nextInt();
		
		System.out.println("성별(남(true)):여(false))=");
		boolean _man=sc.nextBoolean();
		
		System.out.println("전화번호");
		String _phone = sc.next();
	
		System.out.println("키:");
		double _height = sc.nextDouble();
		
		System.out.print("주소:");
		String _address = sc.next();
		
		System.out.println(_name + " " + _age + " " + _man + " " + _phone + " " + _height + " " + _address);
		
		
		
		int x, y;
		System.out.print("x = ");
		x = sc.nextInt();
		
		System.out.print("y = ");
		y= sc.nextInt();
		
		int temp; //buffer(저장 공간)  template의 약자. 형태라는 뜻. 일시 보관? 
		temp = x;
		x = y;
		y = temp;
		
		
		System.out.println("x = " + y + "y = " + x);
		
		
		
	
	}
}
