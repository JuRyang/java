
public class MainClass4 {

	public static void main(String[] args) {
    // 논리 연산자(true/false)
	/*
	 제어문과 같이 사용(if, for, while)
	 && AND 연산       그리고라는 뜻. 둘 다 참일 경우에 사용. -> true
	 || OR  연산        또는             두 가지 중에 하나만 참일 경우이거나 둘 다 참일 경우. -> true
	 !  NOT 연산        ~이 아닌        반대의 값
	 
	 
	 int a = 3, b = 1;
	 a > b
	 a < b
	 a >= b  부등호 기호는 항상 앞에 옴
	 a <= b 
	 a == b =하나면 쓰면 대입 연산자가 되므로 2개를 써야 함
	 a != b 
	 */
		
		
		int num = 0;
		System.out.println("결과:" + (num>0));
		System.out.println("결과:" + (num>=0));
		
		System.out.println("결과:" + (num>=0&& num <10));  // and 연산이기 때문에 앞부분도 true 여야한다
		System.out.println("결과:" + (num>0&& num <10));   
		
		System.out.println("결과:" + (num>=0 || num <10));  // or 연산
		System.out.println("결과:" + (num>0 || num <10));  // 앞부분이 false이지만 or 연산이기 때문에, 둘 중 하나면 참이면 되므로 true가 나옴
		
		
		System.out.println("결과:" + !(num>0)); // false 값이 나오는 것이지만 !가 붙어서 이중부정이 되어 true가 됨 
        //                   !을 쓰게되면 괄호 안의 부등호가 완전 뒤집힘. 그러므로 num <= 0
		System.out.println("결과:" + (num==0));
	
		
		System.out.println("결과:" + !(num>=0 || num <10));
		//                !때문에 뒤집히므로 num <= 0 && >= 10   -> or 연산도 and 연산으로 바뀜.
		
		
		// 삼항 연산자
	   // (조건)?"값1":"값2";     -> 괄호 안 조건이 참이니? 라고 물어봄. 참일 경우, 값1을 대입. 거짓이면 값2를 대입. 항이 3개 있어서 삼항.
		
		int number = 5;
		int i;
		
		i = (number < 5)?100:200;     // number가 5보ㄷ다 작기 때문에 참이어서 i값이 참이 됨
		System.out.println("i = " + i);
		
		
		char c;
		c = (number > 1)?'Y':'N';    // c=5이기 때문에 y값이 나옴
		System.out.println("c = " + c);

		
		String str;
		str = (number > 0)?"숫자는 양수입니다":"숫자는 0이거나 음수입니다";   
		System.out.println("str = " + str);

		
		
		
		
	}

}
