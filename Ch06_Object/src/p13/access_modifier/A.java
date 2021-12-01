package p13.access_modifier;
//public : 모든 패키지에서 불러와서 사용
//protected: 같은 패키지에서 사용+다른 패키지에서도사용(상속)
//(default):같은 패키지 안에서만 사용
//private: 클래스안에서만 사용

//class : public,default만 사용가능,abstract, final도 가능
//        static 불가( 중첩 클래스에서는 static 가능)
class A {
	//1.변수(필드)
  public int a;
  protected int c;
         int b;
  private int d;
  
  //2.메소드
 public void add1() {}
 protected void add2() {}
           void add3() {}
 private void add4() {}
 
 //3.생성자
 public A() {}
 protected A(int a) {}
           A(String a) {}
 private   A(float a) {}
  
}
