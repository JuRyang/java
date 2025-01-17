
public class MainClass6 {

	public static void main(String[] args) {
		/*
		                                                           우선순위
		 boolean         1 byte           낮음
		 
		 byte            1 byte 
		 short           2 byte
		 int             4 byte
		 long            8 byte
		 
		 
		 float           4 byte
		 double          8 byte           높음

		 
		 자료형의 변환(auto, cast)
		 
		 */
		
		 // 자동 자료형 변환
		 short sh = 12345;  // 2 byte
		 int i;             // 4 byte
		 
		 i = sh;            // 자동 형변환
		 System.out.println("i = " + i);
		 
		 // 강제 자료형 변환 
		 i = 1234567;         // 범위의 값이 넘어가면 형변환이 안된다.
		 sh = (short)i; 
		 
		 System.out.println("sh = " + sh);

		 long l = 123456789L;
		 float f = l;
		 double d = l;
		 
		 System.out.println("f = " + f);
		 System.out.println("d = " + d);
		 
		 // 1.23456789E8 -> E가 붙은 건 10이라는 뜻 그 뒤에는 승수라는 뜻
		 // 1.23456789 * 10의 8승 100000000 double은 실수이기 때문에 소숫점으로 표시한듯..
		 
		 double d1 = 1.234e2;     // 1.234 * 10의 2승
         System.out.println("d1 = " + d1); 		 
		 
         int n1, n2;
         n1 = 3;
         n2 = 2;
         
         double result = (double)n1 / n2;     // 우선순위가 int보다 dou이 더 높아서 double로 변환됨
         System.out.println("result:" + result);
         
         
         d1 = 1.234e-2; // -2승이어서 0.01임, 1.234 * (1/10) * (1/10)
         System.out.println("d1 = " + d1); 		 

		 
		 

	}

}
