package Lec14;

public class Freq_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "gautam";
		int[] freq = new int[26];
		for (int i = 0; i < s.length(); i++) {
			int idx = s.charAt(i) - 'a';
			freq[idx]++;// freq[idx] = freq[idx] +1;
		}
		for (int i = 0; i < freq.length; i++) {
			if (freq[i] != 0) {
				char ch = (char) ('a' + i);
				System.out.println(ch + " " + freq[i]);
			}
		}

	}

}
