package p06.array;
//Person Class 변수에 값을 입력하고 출력하기
public class Array_PersonEx1 {

	public static void main(String[] args) {
		   //우리가 만든 클래스
		   //참조변수(p): 주소값
           Person p = new Person();
           System.out.println(p.age);//0
           System.out.println(p.name);//null
           String n = p.getName();
           System.out.println(n);//null
           
           Person p2 = new Person("홍길동");
           System.out.println(p2.age);//0
           //p2.name = "홍길동";
           System.out.println(p2.name);//홍길동
           String n2 = p2.getName();
           System.out.println(n2);//홍길동
           
           //age:20, name: 알파고
           //클래스 변수에 값을 넣는 방법
           //1. 변수를 통해 넣고 출력하기
           Person pe1 = new Person();
           pe1.age = 20;
           pe1.name = "알파고";
           System.out.println(pe1.age);
           System.out.println(pe1.name);
           
           //2. 생성자를 통해서 값저장하고 출력하기
           Person pe2 = new Person("알파고",20);
           System.out.println(pe2.age);
           System.out.println(pe2.name);
           
           //3. 메소드를 만들어서 값을 넣고 출력하기
           Person pe3 = new Person();
           pe3.setName("알파고");
           pe3.setAge(20);
           System.out.println(pe3.getName());
           System.out.println(pe3.getAge());
           
	}

}
