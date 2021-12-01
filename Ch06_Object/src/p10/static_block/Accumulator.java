package p10.static_block;

public class Accumulator {
	
	int total = 0;
	//공유(공통)
	static int grandTotal = 0;//10 =>30
   //Instance(): 객체 생성할때 동작
	void accumulate(int amount) {
		total += amount;//t=t+a;
		grandTotal += amount;//g=g+a
	}
	//Static():공통
	static int getGrandTotal() {
		return grandTotal;
		
	}
}
