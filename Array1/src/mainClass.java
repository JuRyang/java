
public class mainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		  Array : 배열 == 변수들(Variables)
		                 같은 자료형 변수들의 묶음.
		                 
		 목적 : 같은 목적의 다수의 변수를 관리하기 위함
		 접근 요소는 번호 (index)  
		                   
		 형식 : 
		     자료형 배열변수명[] = new 자료형[배열의 총 수];
		     자료형 []배열변수명 = new 자료형[배열의 총 수];
		     자료형[] 배열변수명 = new 자료형[배열의 총 수];
		     int arrVar[] = new int [5]; 배열의 총수는  내가 정해주는 것 (5 = lang1~5 변수를 만드는 것 )
		                                            동적할당, 정적할당
		     char arrChar[] = new char [10];
		     double[] arrDou = new double[5];
		     char *arrChar[] = new char [10];
		     
		      int arrVar[] = new int [5]; //   0~4 번지
		                                       index number
		      arrVar[0] = 90; 
		      arrVar[1] = 85;
		      arrVar[2] = 90;  
		               
		      arrVar[index number] = 값
		                                           
		     
		 */
		
		// 5명 학생의 국어점수 총점,평균
		int lang1, lang2, lang3, lang4,lang5;
		
		lang1 = 90;
		lang2 = 85;
		lang3 = 100;
		lang4 = 95;
		lang5 = 75;

		int sum = 0;
		sum = lang1 + lang2 +lang3 +lang4 + lang5;
		
		double avg = 0;
		avg = (double)sum / 5;
		
		
		
		//int arraylang[] = new int[5]; 밑에와 같은 방법
		
		
		 int arraylang[] = null; // 값을 초기화 시킨 것 (0)
		  arraylang= new int[5]; //동적할당(참조)
		  System.out.println("arraylang:"+arraylang); // 주소 값 출력
		  System.out.println("arraylang[0]:"+arraylang[0]); //자동적으로 0으로 할당
		
		  
		  
		  arraylang[0] = 90;
		  arraylang[1] = 85;
		  arraylang[2] = 100;
		  arraylang[3] = 95;
		  arraylang[4] = 75;
		  
		  System.out.println("arraylang[3]:"+arraylang[3]);
		  
		  // 배열 초기화
		  int arrNum[] = {90, 100, 85};
		  int num = 10;
		  
		  System.out.println("arrnum[0]:"+arrNum[0]);
		  
		  /*
		  char arrChar[] = {'A','B','C'};
		  System.out.println("arrCha[0]:"+arrChar[0]);
		  */
		  
		  
		  /*
		  char ac;
		  ac ='v';
		  */
		  
		  
		  char arrChar[] ;
		  // arrChar = {'A','B','C'};
		  arrChar= new char[3];
		  arrChar[0] = 'A';
		  
		
		  //alias(별명)*****중요
		  int array[] = { 11, 22, 33};
		  int alias[] = array;
		  System.out.println("alias[1]:"+alias[1]);
		  
		  alias[1] = 222;
		  System.out.println("alias[1]:"+alias[1]);
		 
		  
		  //  스왑문 이용한 값 바꾸기
		  int Atype[] = { 1, 2, 3 };
		  int Btype[] = {11, 22, 33};
		  int temp;
		  
		  
		/*  int aliasA[] = Atype;
		  int aliasB[] = Btype;
		  int aliastemp[];
		  
		  aliastemp= aliasA;
		  aliasA = aliasB;
		  aliasB =aliastemp;
		  
		  System.out.println(" Atype[0]:"+ aliasA[0]);
		  System.out.println(" Atype[1]:"+aliasA[1]);
		  System.out.println(" Atype[2]:"+aliasA[2]);
		  

		  
		  System.out.println(" Btype[0]:"+ aliasB[0]);
		  System.out.println(" Btype[1]:"+aliasB[1]);
		  System.out.println(" Btype[2]:"+aliasB[2]);
		  
		  */
		  
		  
		  
		  
		 
		  temp = Atype[0];
		  Atype[0] = Btype[0];
		  Btype[0] = temp;
		  
		  temp = Atype[1];
		  Atype[1] = Btype[1];
		  Btype[1] = temp;
		  
		  temp = Atype[2];
		  Atype[2] = Btype[2];
		  Btype[2] = temp;
		  
		  
		  
		  

		  
		  
		  
		

	}

}
