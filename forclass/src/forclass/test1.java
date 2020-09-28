package forclass;

public class test1 {

	public static void main(String[] args) {
		char arrch[] = {'D','W','O','A','B'};
		//모두 소문자로 변경한 후 출력하라(아스키코드)
		//A = 65 a = 97 ->32
		//System.out.println("asc="+(int)arrch[0]);
		
		int asc =(int)arrch[0];  //ascii code
		asc = asc +32;           // 소문자로 변환
		char ch = (char)asc;     //문자로 변환
		System.out.println("ch="+ch);
		
		for(int i = 0; i < arrch.length; i++) {
			char c = arrch[i];
			int as = (int)c;
			as = as +32;
			arrch[i] = (char)as;
		}
		for(int i = 0; i < arrch.length; i++) {
			System.out.println(arrch[i]);
		}
		
	}
}

		
		
		
		
		
		
		
		
		
		
		/*for(int i = 0; i < arrch.length; i++) {
		
			if(arrch[i] >= 'a' && arrch[i] <= 'z'){
				arrch[] = 'd';
				
				
				
			System.out.println("arrch="+arrch[i]);
		}
		}
	}
}
		
		
		
		for(int i = 0; i < arrch.length; i++) {
			System.out.println("arrch="+arrch[i]);
			if(arrch[] == 'D') {
				arrch[i] = 'a';
			
		}
		
		'W','O','A','B'
		'w','o','a','b')
		*/

	


