package leetcode.ex412;

import java.util.ArrayList;
import java.util.List;

public class Solution {
	public List<String> fizzBuzz(int n) {
		List<String> list = new ArrayList<>();
		int fizz = 1, buzz = 1;
		for (int i = 1; i <= n; i++) {
			if (fizz == 3 && buzz == 5) {
				list.add("FizzBuzz");
				fizz = 1;
				buzz = 1;
			} else if (fizz == 3) {
				list.add("Fizz");
				fizz = 1;
				buzz ++;
			} else if (buzz == 5) {
				list.add("Buzz");
				buzz = 1;
				fizz ++;
			} else {
				list.add("" + i);
				fizz ++;
				buzz ++;
			}
		}
        return list;
    }
}
