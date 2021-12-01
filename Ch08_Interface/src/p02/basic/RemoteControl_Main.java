package p02.basic;

public class RemoteControl_Main {

	public static void main(String[] args) {
		//1. 객체생성
		RemoteControl_Impl ri = new RemoteControl_Impl();
		System.out.println(RemoteControl.MAX_VOLUME);
		ri.turnOn();
		ri.turnOff();
		ri.setMute(false);
		ri.setVolume(8);
		RemoteControl.changeBattery();
		ri.add();
		
		//2.인터페이스 다형성
		RemoteControl r2 = new RemoteControl_Impl();
		System.out.println(RemoteControl.MAX_VOLUME);
		r2.turnOn();
		r2.turnOff();
		r2.setMute(false);
		r2.setVolume(8);
		RemoteControl.changeBattery();
		((RemoteControl_Impl) r2).add();
		
		
		//3.인터페이스의 다형성
		RemoteControl r3 = new RemoteControl_Impl();
		RemoteControl_Impl ri3 = (RemoteControl_Impl) r3;
		System.out.println(RemoteControl.MAX_VOLUME);
		ri3.turnOn();
		ri3.turnOff();
		ri3.setMute(false);
		ri3.setVolume(8);
		RemoteControl.changeBattery();
		ri3.add();
		
		//4.익명 구현객체
		RemoteControl r4 = new RemoteControl() {
			
			@Override
			public void turnOn() {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void turnOff() {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void setVolume(int volume) {
				// TODO Auto-generated method stub
				
			}
			void add() {
				System.out.println("anonymous-add()");
			}
		};
		System.out.println(RemoteControl.MAX_VOLUME);
		r4.turnOn();
		r4.turnOff();
		r4.setMute(false);
		r4.setVolume(8);
		RemoteControl.changeBattery();
		//((RemoteControl_Impl) r4).add();
	}

}
