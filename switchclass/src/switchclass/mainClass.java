package switchclass;

public class mainClass {

	public static void main(String[] args) {
		/*
		    switch : case 분기
		                      값이 명확해야 한다.
		                      범위를 지정할 수 없다. < > <= >=
		                      부정한 값은 사용 불가.
		                      실수도 사용 불가.
		             
		                      
		     형식
		     switch (변수){
		        case 값:
		                       처리1
		             break;
		             case 값2:
		                      처리2
		             break;
		             :
		           default:    == else랑 동일 <- 처리가 안되었다 하면 해야하지만 처리가 되면 생략 가능
		                      처리
		                      }
		            */
		
		int number = 4;
		
		switch(number) {
		     case 0:  //if(number == 0)
		    	 System.out.println("number = 0");
		    	 break;
		     case 1:  //else(number == 1)
		    	 System.out.println("number = 1");
		    	 break;
		     case 3:
		    	 System.out.println("number = 3");
		    	 break;
		    	 default:
		    		 System.out.println("number = ?");
		    	 
			     /*case >0 :  //else(number == 1)
			    	 System.out.println("number = 1");
			    	 break;
			     case 3:                부등호 사용불가*/
		    		 
		    		 
		    		char c = 'A';	    		
		    		switch (c) {
		    		case'A':
		    			System.out.println("c=='A'");
		    			break;
		    		}
		    		
		    		/*double d = 1234.4;  <-  실수 값 사용불가
		    		
		    		switch (d) {
		    		case 123.4:
		    			break;
		    			
		    		}
		    		 /**/
		    		
		    		 String str = "hello"; 
		    		 switch (str) {
					case "hell0":
						System.out.println("str=='hello'");
						break;

		    		 }
		}

	}

}
