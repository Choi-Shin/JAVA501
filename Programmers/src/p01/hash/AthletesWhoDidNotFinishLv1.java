package p01.hash;

import java.util.Arrays;

public class AthletesWhoDidNotFinishLv1 {
	class Solution {
	    public String solution(String[] participant, String[] completion) {
	    	// 1. Sort both arrays
	    	Arrays.sort(participant);
	    	Arrays.sort(completion);
	    	
	    	// 2. Loop through to find the difference
	    	int i;
	    	for(i=0; i<completion.length; i++) {
	    		if (!participant[i].equals(completion[i]))
	    			return participant[i];
	    	}
	    	
	    	// 3. If the program reaches this part, 
	    	//    last participant couldn't complete the race
	    	String answer = participant[i];
	        return answer;
	    }
	}
}
