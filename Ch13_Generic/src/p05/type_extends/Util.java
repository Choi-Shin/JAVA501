package p05.type_extends;

public class Util {
	//T: Number, Byte, Double, Float, Integer, Long, Short
	public static<T extends Number> String compare(T t1, T t2) {
		double v1 = t1.doubleValue();
		double v2 = t2.doubleValue();
		
		if (Double.compare(v1, v2) == -1) {
			return "<";
		}
		if (Double.compare(v1, v2) == 0) {
			return "=";
		} else {
			return ">";
		}
	}	
}
