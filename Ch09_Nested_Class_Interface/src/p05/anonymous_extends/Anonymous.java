package p05.anonymous_extends;

public class Anonymous {
	Person p1 = new Person();
	Person p2 = new Person();
	
	//익명 객체 생성(내부 클래스)
	Person p3 = new Person() {
		void work() {
			System.out.println("출근합니다.");
		}
		@Override
		void wake() {
			System.out.println("6시에 일어납니다.");
			work();
		}
	};
	
	 
	void method1() {
		//메소드 안에 클래스 (익명)
		Person p4 = new Person() {
			void walk() {
				System.out.println("산책합니다.");
			}
			@Override
			void wake() {
				System.out.println("7시에 일어납니다.");
				walk();
			}
		};
		p4.wake();
	}
	void method2(Person p5) {
		p5.wake();
	}
}
