package p05.api.predicate;

import java.util.function.Predicate;

public class PredicateIsEqualExample {

	public static void main(String[] args) {
		Predicate<String> p;
		String j = "Java8";
		
		p = Predicate.isEqual(null);
		System.out.println("null, null: " + p.test(null));
		p = Predicate.isEqual("Java8");
		System.out.println("null, Java8: " + p.test(null));
		p = Predicate.isEqual(null);
		System.out.println("Java8, null: " + p.test(j));
		p = Predicate.isEqual(j);
		System.out.println("Java8, Java8: " + p.test(j));
		p = Predicate.isEqual(j);
		System.out.println("Java7, Java8: " + p.test("Java7"));
	}

}
