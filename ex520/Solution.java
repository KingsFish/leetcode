package leetcode.ex520;

public class Solution {
	public boolean detectCapitalUse(String word) {
        int type = 0;
        char [] words = word.toCharArray();
        if (words.length < 2) {
			return true;
		} else if (words[0] <= 'Z') {
			if (words[1] <= 'Z') {
				//USA
				type = 0;
			} else {
				type = 1;
			}
		} else {
			type = 1;//all lower letters
		}
        
        switch (type) {
		case 0:
			//USA
			for (int i = 1; i < words.length; i++) {
				if (words[i] > 'Z') {
					return false;
				}
			}
			return true;
		case 1:
			//Google &&　leetcode
			for (int i = 1; i < words.length; i++) {
				if (words[i] <= 'Z') {
					return false;
				}
			}
			return true;
		default:
			return false;
		}
    }
}
