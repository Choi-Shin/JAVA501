package p03.object;

public class Circle {//c1

	 int radius;

	public Circle(int radius) {
		this.radius = radius;
	}
	 
	 @Override
	public boolean equals(Object obj) {//c2
		if(obj instanceof Circle) {
			Circle c = (Circle) obj;//Casting
			if(this.radius == c.radius) {
				return true;
			}
		}
		return false;
	}
}
