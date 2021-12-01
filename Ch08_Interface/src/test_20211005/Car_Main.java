package test_20211005;

//interface: 강제성,일관성 유지
interface Car{
	void driver();//추상메소드
}
class Bus implements Car{
	@Override
	public void driver() {
		System.out.println("40명을 태우고 달린다.");
	}
}
class Taxi implements Car{	
	int inwon = 5;
	@Override
	public void driver() {
		System.out.println("총알처럼 달린다.");
	}
	public void inwon() {
		System.out.println(inwon+"명 정원");
	}	
}
class Ambulance implements Car{	
	@Override
	public void driver() {
		System.out.println("싸이렌을 울리면서 달린다.");
	}
}

public class Car_Main {

	public static void main(String[] args) {
		Car car[] = new Car[3];
		//배열3개
		car[0] = new Bus();
		car[1] = new Taxi();
		car[2] = new Ambulance();
		
		for(int i=0; i<car.length; i++) {
			car[i].driver();
			if(car[i] instanceof Taxi) {//instanceof: 형변환 가능 여부 판별
				((Taxi) car[i]).inwon();//Casting
			}
		}

	}

}
