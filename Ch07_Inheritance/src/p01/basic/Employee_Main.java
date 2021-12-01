package p01.basic;

public class Employee_Main {

	public static void main(String[] args) {
	//일반클래스(부모X)
	Employee e = new Employee("홍길동1",2000);
	System.out.println(e.name);
	//System.out.println(e.depart);불가능
	
		
		//1.자식 객체 생성- 부모객체는 자동생성
      Manager m = new Manager("개발부","홍길동",1000);
      System.out.println(m.name);///홍길동-parent
      System.out.println(m.depart);//개발부-child
      System.out.println(m.getEmployee());//Override
      
     System.out.println(m);//주소값 => 생성자 값 나오게 하기
     System.out.println(m.toString());//주소값 => 생성자 값 나오게 하기
	}

}
