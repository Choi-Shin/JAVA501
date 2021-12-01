package study.set;

import java.util.Enumeration;
import java.util.Stack;

public class StackTest {

	public static void main(String[] args) {
		Stack<String> st = new Stack<String>();
		st.add("이문동");
		st.add("불광동");
		st.add("서초동");
		st.add("상계동");
		
		Enumeration<String> e = st.elements();
		for (int i=0; i<st.size(); i++) {
			System.out.println(e.nextElement());
		}
	}

}
