package p10_reference_variable;

public class ArrayStringEx {

	public static void main(String[] args) {
//		String[] => String은 배열 원소의 data type을 말함, [] : Array
//		배열원소들은 같은 data type이어야 함.
		String[] cars = {"Volvo", "BMW", "Ford", "Hyundai", "Kia"};

//		System.out.println("cars[0] = " + cars[0]);
//		System.out.println("cars[1] = " + cars[1]);
//		System.out.println("cars[2] = " + cars[2]);
//		System.out.println("cars[3] = " + cars[3]);
//		System.out.println("cars[4] = " + cars[4]);
		
		System.out.println("cars length = " + cars.length);
		
		cars[0] = "Volvo_2021";
		for (int i=0; i<cars.length; i++) {
			System.out.println("cars[" + i +"] =" + cars[i]);
			System.out.println("cars[" + i + "] 주소 = " + 
						System.identityHashCode(cars[i]));
		}
		
		double[] numbers = {2, 3, 4, 5, 6};
		
		for (int i=0; i<numbers.length;i++) {
			System.out.println("numbers["+ i +"]= " + numbers[i]);
			System.out.println("numbers[" + i + "] 주소 = " + 
					System.identityHashCode(numbers[i]));
		}
		
//		scores변수에 null값을 넣을 수 있음
		double[] scores = null;
		System.out.println(scores);
	}

}





