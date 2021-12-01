package p02.basic;

public class RemoteControl_Impl implements RemoteControl {

	@Override
	public void turnOn() {
		System.out.println("turnOn()");
		
	}

	@Override
	public void turnOff() {
		System.out.println("turnOn()");
		
	}

	@Override
	public void setVolume(int volume) {
		System.out.println("setVolume()");
		
	}

	@Override
	public void setMute(boolean mute) {
		
		RemoteControl.super.setMute(mute);
	}
	
	void add() {
		System.out.println("add()");
	}
}
