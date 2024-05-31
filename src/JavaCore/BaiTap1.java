package JavaCore;

import java.util.Arrays;

public class BaiTap1 {

	public static void main(String[] args) {
		int[] clubs = { 10, 5, 20, 30, 1, 3, 69, 12, 2 };
		Arrays.sort(clubs);
		System.out.println(Arrays.toString(clubs));

		for (int i = 0; i < clubs.length - 1; i++) {
			for (int j = i + 1; j < clubs.length; j++) {
				if (clubs[i] > clubs[j]) {
					int temp = clubs[i];
					clubs[i] = clubs[j];
					clubs[j] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(clubs));

	}

}
