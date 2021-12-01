package p02.class_inherit;
//290
public class CellPhone {
	//1.field(변수)
	String model,color;

	
	//2.생성자
	public CellPhone(String model, String color) {
		//super();//부모 클래스의 기본 생성자
		this.model = model;
		this.color = color;
	}
	
	//3.메소드
	void powerOff() {
		System.out.println("전원 off");
	}
	void powerOn() {
		System.out.println("전원 on");
	}
	void bell() {
		System.out.println("bell~");
	}
	void sendVoice(String message) {
		System.out.println("자기: "+message);
	}
	void receiveVoice(String message) {
		System.out.println("상대방: "+message);
	}
	
    void hangUp() {
    	System.out.println("전화를 끊습니다.");
    }
}
