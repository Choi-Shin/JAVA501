package p05.polymorphism.array;

import study02.AppCDInfo;
import study02.Lendable;
import study02.SeperateVolume;

// Polymorphism of Arrays
public class Interface_Poly_Array {

	public static void main(String[] args) {
		Lendable[] arr = new Lendable[3];
		arr[0] = new SeperateVolume("2021-1011", "푸코의 진자", "에코");
		arr[1] = new SeperateVolume("2021-1001", "서양의 미술사", "곰브리치");
		arr[2] = new AppCDInfo("1012", "Spring5.0");
		
		checkOutAll(arr, "홍길동", "20211001");
	}

//								Parameter의 다형성
	static void checkOutAll(Lendable arr[], String borrower, String Date) {
		for (Lendable len : arr) {
			len.checkOut(borrower, Date);
		}
	}
}
