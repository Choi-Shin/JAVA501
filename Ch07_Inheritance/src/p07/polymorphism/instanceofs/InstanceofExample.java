package p07.polymorphism.instanceofs;


//327

//instanceof연산자:  다형성에서 강제형변환 여부를 나타내주는 연산자
public class InstanceofExample {

	public static void main(String[] args) {
		//1.
		Parent p1 = new Child();
		InstanceofExample.method1(p1);
        method2(p1);
        
        Parent p2 = new Parent();
        InstanceofExample.method1(p2);
        try {
			method2(p2);//ClassCastException 발생
		} catch (Exception e) {
			System.out.println("강제형변환 예외가 발생했습니다.");
		}
	}
	
	//Parent p = new Parent();
    public static void method1(Parent p) {
        	if(p instanceof Child) {
        		Child c = (Child) p;//Casting(강제형변환)
        		System.out.println("강제형변환");
        		
        	}else {
        		System.out.println("형변환 불가");
        	}
    }
    
    public static void method2(Parent p) {
    		Child c = (Child) p;//Casting(강제형변환)
    		System.out.println("강제형변환");
    }
}
