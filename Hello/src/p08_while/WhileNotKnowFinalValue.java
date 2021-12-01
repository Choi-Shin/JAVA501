package p08_while;

public class WhileNotKnowFinalValue {

	public static void main(String[] args) {
		int num; 

//		조건식: true (무한 loop)
		while (true) {
			num = (int) (Math.random()*6) + 1; 	
			System.out.println(num);
			if (num == 6) {
				break;
			}
		}
			
	}

}
