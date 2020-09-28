import java.util.Scanner;

public class mainClass {

	public static void main(String[] args) {
		
		// �Է� - console�� �Է��ϴ� �۾�
		Scanner scan = new Scanner(System.in);
		
		// boolean
		boolean b; // true/false
		/*
		System.out.print("b =");
		b = scan.nextBoolean();
		System.out.println("b = "+b);
		*/
		
		
		 
		int i;
		System.out.print("i = ");
		i = scan.nextInt();
		System.out.println("i:"+i);
		
		
		/*
		// double
		double d;
		System.out.print("d = ");
		d=scan.nextDouble();
		System.out.print("d = " + d);
		*/
		
		
		
		// String
		String str;
		/*
		System.out.print("str = ");
		str = scan.nextLine();
		System.out.println("str = "+str);
		*/
		
		
		System.out.print("str = ");
		str = scan.next();
		System.out.println("str = "+str);

		scan.close();
		
		
		/*
		 �Ӹ��� initialize (�ʱ�ȭ) -> �޸� �ʱ�ȭ
		 
		 �߽ɱ� loop(��ȯ) - main
		 
		 ������  release(�ع�)  -> �޸� �ع�
		 */
		
		
		
		
		
		
		
		
		

	}

}
