package leetcode.ex374;

public class GuessGame {

	private int guessNum = 2;
	
	public int guess(int n){
		if (n > guessNum) {
			return -1;
		} else if (n == guessNum) {
			return 0;
		} else {
			return 1;
		}
	}
}
