package p02.class_inherit;

public class DmbCellPhoneExample {

	public static void main(String[] args) {
		
		DmbCellPhone dcp = new DmbCellPhone("자바폰", "검정", 10);
		System.out.println("모델: "+dcp.model);
		System.out.println("색상: "+dcp.color);
		System.out.println("채널: "+dcp.channel);
		
		dcp.powerOn();
		dcp.bell();
		dcp.sendVoice("여보세요");
		dcp.receiveVoice("안녕하세요~~~ 홍길동");
		dcp.sendVoice("아!!");
		dcp.hangUp();
		
		dcp.turnOnDmb();
		dcp.changeChannelDmb(12);
		dcp.turnOffDmb();

	}

}
