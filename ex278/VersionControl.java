package leetcode.ex278;

public class VersionControl {

	private int guessVersion = 6;
	
	/**
	 * @author Fish
	 * @param version guess version
	 * @return true if it's a bad version, false if it's a good version
	 */
	public boolean isBadVersion(int version){
		if (version >= guessVersion) {
			return true;
		} else {
			return false;
		}
	}
}
