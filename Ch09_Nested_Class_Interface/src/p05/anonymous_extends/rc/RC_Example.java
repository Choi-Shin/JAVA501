package p05.anonymous_extends.rc;

public class RC_Example {

	public static void main(String[] args) {
		RC_Anonymous anony = new RC_Anonymous();
		
		anony.field.turnOn();
		anony.method1();
		anony.method2(
				new RemoteControl() {
					
					@Override
					public void turnOn() {
						System.out.println("SmartTV를 켭니다.");
					}
					
					@Override
					public void turnOff() {
						System.out.println("SmartTV를 끕니다.");
					}
				});
	}

}
