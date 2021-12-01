package p06_if_switch;

public class SwitchString {

	public static void main(String[] args) {
		String position = "부장";
		
		switch (position) {
		case "부장":
			System.out.println("급여가 700만원입니다.");
			break;
		case "과장":
			System.out.println("급여가 500만원입니다.");
			break;
		default:
			System.out.println("급여가 300만원입니다.");
			break;
		}

	}

}
