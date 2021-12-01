package p06.array;
//Array
public class Dog_Main {

	public static void main(String[] args) {
		
		//1.Dog Class 배열로 만들기
		Dog d[] = new Dog[3];
		//Dog d2[] = {new Dog("풍산개","풍산"),new Dog("진도개","진도"),new Dog("워리","블독")};
		//2.배열에 내용 저장하기
		d[0] = new Dog("풍산개","풍산");
		d[1] = new Dog("진도개","진도");
		d[2] = new Dog("워리","블독");
		
		//3.반복문(for)을 통한 출력
		for(int i=0; i<d.length; i++)
			System.out.println(d[i].name+" : "+d[i].kind);
		//4.향상된 for문을 통해서 출력
		for(Dog dg : d)
			System.out.println(dg.name+" : "+dg.kind);
		//5. toString()를 재정의해서 내용 출력
		for(Dog dg : d)
		System.out.println(dg);
	}

}
