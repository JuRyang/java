
public class MainClass1 {

	public static void main(String[] args) {
   
		
		
		byte by;
		// 변수의 대ㄷ입
		by= 12; // value
		byte by1=24; // 선언과 동시에 대입
		
		System.out.println("by = " + by);
        by = 127;
        System.out.println("by = " + by);
        
        
        short sh; // 2byte
        sh = 12345;
        System.out.println("sh = "+ sh);
        
        
        int Number; // 4byte
        Number = 1234567890;
        System.out.println("Number = " + Number);
        
        long lo;
        lo = 3234235254323452l;    // 대문자로 표현
        System.out.println("lo = " + lo);
        
        
        float f; // 4 byte
        f = 123.4563436254f;           // 소문자로 표현
        System.out.println(" f = " + f);

        
        double d; // 8 byte
        d = 123.464737385356;
        System.out.println("d = "+d);
        
        
        // 문자형
         char c; // 2byte    영문 -> 1 byte    0~255
                 //          한글 -> 2 byte   왜냐면 256개 넘기 때문에   하지만 char는 다 통합해서 2 byte로 만듦.*한글도 적용할 수 있게
                 //          ASCII    a(96) ~ z A(65) ~ Z  -> 한글은 못 씀
                 //          Unicode가 한글도 쓸 수 있음
         
         c= 'A';
         System.out.println("c = " +c);
        // c= '한';
        // System.out.println("c = " +c);
        // printf = %c %d %s
         System.out.printf("%c %d \n", c, (int)c);
         
         
         // 문자열
         // String -> 자료형이 아님. Wrapper class임, 데이터타입이 아닌 객체*으브젝트임
         
         String str;       // str == 변수 -> instance(주체)
         str = "안녕하세요";
         System.out.println(" str = " + str);
         
         str = "건강하세요";
         System.out.println("str = " + str);
         
         
         // 논리형 참(true)/거짓(false)
         // boolean -> 1 byte
         // bool 1 byte BOOL 4 byte -> C언어에서 쓰이는 약자
         
         boolean b;
         b = true;  // 1
         System.out.println("b = "+b);
         b = false; // 0
         System.out.println("b = "+b);
         
         
         
         
        
        
        
	
	
	}

}
