package p10.static_block;
//Singleton 패턴: 유일한 하나의 객체만 생성해서 사용
//               해당 클래스에 메소드를 만들어 놓고, 계속해서 생성된 객체만 호출
//              private: 생성자, 참조변수
public class SingletonEx1 {

	public static void main(String[] args) {
		//1.Singleton 적용 전
		//Bank b1 = new Bank("KB은행");
		//System.out.println(b1.name);
		
		//2.Singleton 사용
		Bank b =  Bank.getB();//객체생성된 주소를 갖는 메소드만 호출
		System.out.println("Bank 이름: "+b.getName());
	}

}
