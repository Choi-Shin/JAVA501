package p03.object;

public class Key {
	public int number;//1

	public Key(int number) {
		super();
		this.number = number;
	}
	
	@Override
	public int hashCode() {
		
		return number;
	}
	
	 @Override
		public boolean equals(Object obj) {//c2
			if(obj instanceof Key) {
				Key k = (Key) obj;//Casting
				if(this.number == k.number) {
					return true;
				}
			}
			return false;
		}
}
