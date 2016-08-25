package leetcode.ex205;

import java.util.HashMap;

public class Solution {
	
	public static void main(String[] args) {
		Solution s = new Solution();
		System.out.println(s.isIsomorphic("ab", "aa"));
	}
	
	public boolean isIsomorphic(String s, String t) {
		char [] S = s.toCharArray();
		char [] T = t.toCharArray();
		HashMap<Character, Character> mapS = new HashMap<>();
		for (int i = 0; i < S.length; i++) {
			mapS.put(S[i], T[i]);
		}
		for (int i = 0; i < S.length; i++) {
			if (mapS.get(S[i]) != T[i]) {
				return false;
			}
		}
		for (int i = 0; i < T.length; i++) {
			mapS.put(T[i], S[i]);
		}
		for (int i = 0; i < T.length; i++) {
			if (mapS.get(T[i]) != S[i]) {
				return false;
			}
		}
		return true;
    }
}
