package leetcode.ex278;

public class Solution extends VersionControl {
	//find first bad version
	
	public static void main(String[] args) {
		Solution solution = new Solution();
		System.out.println(solution.firstBadVersion(6));
	}
	
    public int firstBadVersion(int n) {
		int lo = 1;
		int hi = n;
		while (lo < hi) {
			int mi = lo + (hi - lo) / 2;
			if (isBadVersion(mi)) {
				hi = mi;
			} else {
				lo = mi + 1;
			}
		}
		return lo;
    }
}
