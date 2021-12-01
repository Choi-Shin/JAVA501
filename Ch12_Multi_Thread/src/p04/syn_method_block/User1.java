package p04.syn_method_block;

public class User1 extends Thread {
	private Calculator calculator;
	public void setCalculator(Calculator calculator) {
		this.setName("user1");
		this.calculator = calculator;
	}
	
	public void run() {
		calculator.setMemory(100);
		}
}
