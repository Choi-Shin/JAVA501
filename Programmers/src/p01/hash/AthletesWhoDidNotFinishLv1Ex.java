package p01.hash;

import java.util.*;

public class AthletesWhoDidNotFinishLv1Ex {
	class Solution {
		public String solution (String[] participant, String[] completion) {
			Arrays.sort(participant);
			Arrays.sort(completion);
			
			int i;
			for (i=0; i<completion.length; i++) {
				if(!participant[i].equals(completion[i])) {
					return participant[i];
				}
			}
			String answer = participant[i];
			return answer;

	}
	}
}