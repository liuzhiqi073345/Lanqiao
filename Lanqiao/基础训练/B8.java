import java.util.Scanner;

public class B8 {
	public static void main(String[] args) {
		int g, s, b, q;
		for (int i = 1000; i < 9999; i++) {
			g = i % 10;
			s = (i % 100) / 10;
			b = (i % 1000) / 100;
			q = i / 1000;
			if (g == q && s == b) {
				System.out.println(i);
			}
		}
	}
}
// 也可同上题暴力4层循环，思路简单但是没必要