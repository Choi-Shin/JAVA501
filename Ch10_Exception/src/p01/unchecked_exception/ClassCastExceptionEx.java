package p01.unchecked_exception;
class Animal {}
class Dog extends Animal {}
class Cat extends Animal {}

public class ClassCastExceptionEx {

	public static void main(String[] args) {
		Dog dog = new Dog();
		changeDog(dog);

		Cat cat = new Cat();
		changeDog(cat);
	}

	public static void changeDog(Animal animal) {
		 if(animal instanceof Dog) {
		 Dog dog = (Dog) animal;
		 System.out.println("개로 형변환");
		 } else {
			 System.out.println("고양이는 형변환 불가합니다.");
		 }
	}

}



//Exception in thread "main" java.lang.ClassCastException: 
//class p01.unchecked_exception.Cat cannot be cast to 
//class p01.unchecked_exception.Dog (p01.unchecked_exception.Cat 
//and p01.unchecked_exception.Dog are in unnamed module of loader 'app')
//at p01.unchecked_exception.ClassCastExceptionEx.changeDog(ClassCastExceptionEx.java:15)
//at p01.unchecked_exception.ClassCastExceptionEx.main(ClassCastExceptionEx.java:10)
