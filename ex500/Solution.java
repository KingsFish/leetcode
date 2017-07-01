package leetcode.ex500;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Solution {

	private final Set<Character> hs1 = new HashSet<Character>(){{
    	add('q');
    	add('w');
    	add('e');
    	add('r');
    	add('t');
    	add('y');
    	add('u');
    	add('i');
    	add('o');
    	add('p');
    }};
    private final Set<Character> hs2 = new HashSet<Character>(){{
    	add('a');
    	add('s');
    	add('d');
    	add('f');
    	add('g');
    	add('h');
    	add('j');
    	add('k');
    	add('l');
    }};
    private final Set<Character> hs3 = new HashSet<Character>(){{
    	add('z');
    	add('x');
    	add('c');
    	add('v');
    	add('b');
    	add('n');
    	add('m');
    }};
	public String[] findWords(String[] words) {
		ArrayList<String> temp = new ArrayList<>();
		for (int i = 0; i < words.length; i++) {
			String str = words[i].toLowerCase();
			int j = 0;
			boolean good = true;
			if (hs1.contains(str.charAt(0))) {
				while (j < str.length()) {
					if (!(hs1.contains(str.charAt(j++)))) {
						good = false;
						break;
					}
				}
			} else if (hs2.contains(str.charAt(0))) {
				while (j < str.length()) {
					if (!(hs2.contains(str.charAt(j++)))) {
						good = false;
						continue;
					}
				}
			} else {
				while (j < str.length()) {
					if (!(hs3.contains(str.charAt(j++)))) {
						good = false;
						break;
					}
				}
			}
			if (good) {
				temp.add(words[i]);
			}
		}
		return temp.toArray(new String[0]);
    }
}
