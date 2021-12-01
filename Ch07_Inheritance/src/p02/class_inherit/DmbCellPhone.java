package p02.class_inherit;

public class DmbCellPhone extends CellPhone {

	int channel;
	
//	public DmbCellPhone() {
//		
//	}
//	this: 현재 클래스
//  this(): 현재 클래스의 기본생성자 호출
//  super: 부모 클래스
//  super():부모 클래스의 기본생성자 호출	
	public DmbCellPhone(String model, String color, int channel) {
		super(model, color);//부모 클래스의 생성자 호출
		this.channel = channel;
	}

	void turnOnDmb() {
		System.out.println("채널 "+channel+"번 DMB~");
	}
	
	void changeChannelDmb(int channel) {
		this.channel = channel;
		System.out.println("채널 "+channel+"번으로 바꿉니다.");
		
		super.model = "color";
		super.bell();//298 : 부모 메소드 호출
	}
	
	void turnOffDmb() {
		System.out.println("DMB 방송 수신을 멈춤니다.");
		super.powerOff();//부모메소드 호출
	}
	
	@Override
	void bell() {
		System.out.println("bell supervvv");
	}
}
