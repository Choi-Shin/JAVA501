package p05.api;

import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.ObjIntConsumer;

public class ConsumerEx1 {

	public static void main(String[] args) {
		//1. 익명 구현 객체
		Consumer<String> c1 = new Consumer<String>() {
			@Override
			public void accept(String t) {
				System.out.println(t+"8");
			}
		};
		c1.accept("java");
		//2. Lambda Expression
		Consumer<String> c2 = t ->System.out.println(t+"8");
		c2.accept("java");
		//anonymous
		BiConsumer<String, String> c33 = new BiConsumer<String, String>() {
			@Override
			public void accept(String t, String u) {
				System.out.println("BiConsumer anonymous " + t+u);
			}
		};
		c33.accept("Java", "8");
		//lambda
		BiConsumer<String, String> c3 = (t,u) -> 
			System.out.println("BiConsumer Lambda " + t+u);
		c3.accept("Java", "8");
		//anonymous
		DoubleConsumer d = new DoubleConsumer() {
			@Override
			public void accept(double value) {
				System.out.println("DoubleConsumer anonymous " + "Java" + value);
			}
		};
		d.accept(8.0);
		//lambda
		DoubleConsumer doubleConsumer = d1 ->
			System.out.println("DoubleConsumer Lambda " + "Java" + d1);
		doubleConsumer.accept(8.0);
		//anonymous
		ObjIntConsumer<String> oic = new ObjIntConsumer<String>() {
			@Override
			public void accept(String t, int value) {
				System.out.println("ObjIntConsumer anonymous " + t + value);
			}
		};
		oic.accept("Java", 8);
		
		//lambda
		ObjIntConsumer<String> objIntConsumer = (t, i) ->
			System.out.println(t+i);
		objIntConsumer.accept("ObjIntConsumer Lambda " + "Java", 8);
	}

}
