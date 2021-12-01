package p06.array;

public class Student {
  String name;       //홍길동1, 
  int age;           //20
  String phoneNumber;//010-1234
  String specialSkill;//수영
  String address;     //서울 마포
  
//getter() & setter()
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public String getPhoneNumber() {
	return phoneNumber;
}
public void setPhoneNumber(String phoneNumber) {
	this.phoneNumber = phoneNumber;
}
public String getSpecialSkill() {
	return specialSkill;
}
public void setSpecialSkill(String specialSkill) {
	this.specialSkill = specialSkill;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
  //저장된 내용 출력 메소드
  public void print() {
	  System.out.println("이름: "+name);
	  System.out.println("나이: "+this.age);
	  System.out.println("연락처: "+getPhoneNumber());
	  System.out.println("주특기: "+specialSkill);
	  System.out.println("사는곳: "+getAddress());
  }
  
}
