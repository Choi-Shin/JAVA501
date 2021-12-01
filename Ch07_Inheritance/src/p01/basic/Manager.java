package p01.basic;
//Employee Class를 상속받음:extends
//자식 클래스는 부모가 가지고 있는 변수,메소드등을 상속받거나 재정의해서 사용
//자식객체생성은 부모객체 자동생성
//상속대상에서 제외: 초기화블럭,생성자, private
//클래스 상속은 단일상속(부모가 하나)
//상속은 공통적인 특징을 클래스들을 하나로 묶어 부모클래스로 사용,재정의
//상속은 이미 만들어진 클래스를 재사용하기 위한 방법
//객체생성은 재정의X
//상속은 재정의 가능
public class Manager extends Employee {
	//1. 변수
	String depart;
	
//	String name;
//	int salary;
	
	//2.생성자
	//생성자 Overloading
	public Manager() {
		
	}
	public Manager(String depart) {
		super();
		this.depart = depart;
	}
	
	
	
	public Manager(String depart, String name, int salary) {
		super();
		this.depart = depart;
		this.name = name;
		this.salary = salary;
	}
	
	//재정의
	    @Override
		public String getEmployee() {
			
	    	return name+"은 "+salary+"입니다.";
		}
	    
	    @Override
	    public String toString() {
	    	String result = name+" : "+salary+" : "+depart;
	    	return result;
	    }
	    
	    
	    
	    
	    
}
