
public class mainclass {

	public static void main(String[] args) {
		/*
		    Random : 무작위 <-> Pattern
		    
		    1 2 3 ->
		    1 ~ 100 ->
		 */
		
		// 0 ~ 2
		
		int r;
		// r = (int)(Math.random()*3); //0-2까지 r에 대한 값을 랜덤
	     //System.out.println("r="+r);
		
		//double d =Math.random();
		//System.out.println("d="+d);
	     
	     //0~9
	     // r = (int)(Math.random()*10); 
	     // System.out.println("r="+r);
		
		//1-10
		// r = (int)(Math.random()*10)+1; //0-10까지 r에 대한 값을 랜덤
	     // System.out.println("r="+r);
		
		//10 20 30 40 50       0~4 -> 1~5
		 r = ((int)(Math.random()*5)+1)*10;
		 System.out.println("r="+r);
		 
		 //-1 0 1               0 1 2
		 int x = (int)(Math.random()*3)-1;
		 System.out.println("x="+x);
		 int y = (int)(Math.random()*3)-1;
		 
		 //x= -1( 후진) 0(그대로) 1(전진)
		 //y = -1 0 1
		 

	}

}
