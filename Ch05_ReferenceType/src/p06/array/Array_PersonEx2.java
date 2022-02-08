package p06.array;

public class Array_PersonEx2 {

	public static void main(String[] args) {
		Person pa[] = new Person[10];
        Person pa2[] = {new Person(),new Person(),new Person()};//참고용
		System.out.println("-----일반 for-----");
		for (int i = 0; i < pa.length; i++) {
			pa[i] = new Person();// 홍길동0, 30
			pa[i].name = "홍길동" + i;
			pa[i].age = 30 + i;
			System.out.println(pa[i].name + "님의 나이는 " + pa[i].age + "입니다.");
		}
		
		for (int i = 0; i < pa.length; i++) {
			pa2[i] = new Person("홍길동" + i,30 + i );// 홍길동0, 30
			System.out.println(pa[i].name + "님의 나이는 " + pa[i].age + "입니다.");
		}
		
		
		
		
		
		System.out.println("-----향상된 for-----");
		int i=0;
		for (Person p : pa) {
			p = new Person();// 홍길동0, 30
			p.name = "홍길동" + i;
			p.age = 30 + i;
			System.out.println(p.name + "님의 나이는 " + p.age + "입니다.");
			i++;
		}
		int j=0;
		for (Person p : pa) {
			p = new Person("홍길동" + j,30 + j);// 홍길동0, 30
			System.out.println(p.name + "님의 나이는 " + p.age + "입니다.");
			j++;
		}
		
	    String str = new String("알파고");
	    System.out.println(str);
		
		Person p = new Person("알파고");
		System.out.println(p);
		System.out.println(p.toString());
	}
}
