package leetcode.ex223;

public class Solultion {

	public static void main(String[] args) {
		
		System.out.println(computeArea(-2, -2, 2, 2, -1, -1, 1, 1));
	}

	public static int computeArea(int A, int B, int C, int D, int E, int F, int G, int H) {
		int area1 = Math.abs((D - B) * (C - A));
		int area2 = Math.abs((H - F) * (G - E));
		int coverArea = 0;
		
		if (G < A || E > C || B > H || F > D) {
			//无相交情况
			coverArea = 0;
		} else if ((A > E) && (B > F) && (C < G) && (D < H)) {
			//内含情况
			coverArea = (C - A) * (D - B);
		} else if ((A < E) && (B < F) && (C > G) && (D > H)) {
			//内含情况
			coverArea = (G - E) * (H - F);
		} else {
			//普通相交情况
			int height = Math.min(C, G) - Math.max(A, E);
			int width = Math.min(H, D) - Math.max(B, F);
			coverArea = height * width;
		}
		
		return area1 + area2 - coverArea;
    }
}
