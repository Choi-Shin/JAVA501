package p01.hash;

public class PhoneBookLoop {
	public boolean solution(String[] phone_book) {
        boolean answer = true;
        for (int i=0; i<phone_book.length; i++) {
        	for (int j=i+1; i<phone_book.length; j++) {
        		if(phone_book[i].startsWith(phone_book[j])) {
        			return false;
        		}
        		if (phone_book[j].startsWith(phone_book[i])) {
        			return false;
        		}
        	}
        }
        return answer;
    }
	
}
