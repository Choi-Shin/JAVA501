package test_20211005;

class Person{
	int no;
	String name;
	
	public Person(int no, String name) {
		super();
		this.no = no;
		this.name = name;
	}
	
	//재정의
	
	@Override
	public boolean equals(Object obj) {//p1:p2, p1:p3
		Person p = (Person) obj;
		return (this.no == p.no)&&(this.name.equals(p.name));
	}
	
}


public class Person_Main {

	public static void main(String[] args) {
		Person p1 = new Person(111,"홍길동");
		Person p2 = new Person(111,"유재석");
		Person p3 = new Person(222,"홍길동");
		
        if(p1.equals(p2))
        	System.out.println("같다");
        else
        	System.out.println("다르다.");
        
        if(p1.equals(p3))
        	System.out.println("같다");
        else
        	System.out.println("다르다.");
        
        
	}

}
