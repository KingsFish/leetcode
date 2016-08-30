package leetcode.ex374;

/* The guess API is defined in the parent class GuessGame.
@param num, your guess
@return -1 if my number is lower, 1 if my number is higher, otherwise return 0
   int guess(int num); */

public class Solution extends GuessGame{
	
	public static void main(String[] args) {
		Solution solution = new Solution();
		int guessNum = solution.guessNumber(2);
		System.out.println(guessNum);
	}
	
	public int guessNumber(int n) {
		if (guess(n) == 0) {
			return n;
		}
		int lo = 0;
		int hi = n;
		while (lo < hi) {
			int mi = lo + (hi - lo) / 2;
			if (guess(mi) == -1) {
				//mi is too high
				hi = mi;
			} else if (guess(mi) == 0) {
				return mi;
			} else {
				//mi is too low
				lo = mi;
			}
		}
		return lo;
	}
}
