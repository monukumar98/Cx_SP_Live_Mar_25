package Lec16;

public class Kartik_Bhaiya_And_Strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "abababbababaaaaaaabbbbbaaa";
		int k = 2;
		int max_a = Maximum_lenght(str, 'b', k);
		int max_b = Maximum_lenght(str, 'a', k);
		System.out.println(Math.max(max_a, max_b));

	}

	public static int Maximum_lenght(String s, char ch, int k) {
		int si = 0, ei = 0, ans = 0, flip = 0;
		while (ei < s.length()) {
			// grow
			if (s.charAt(ei) == ch) {
				flip++;
			}
			// shrink
			while (flip > k && si <= ei) {
				if (s.charAt(si) == ch) {
					flip--;
				}
				si++;
			}
			// ans calculate
			ans = Math.max(ans, ei - si + 1);
			ei++;
		}
		return ans;
	}
}
