package basic.dev;

import java.util.Scanner;

public class MainApp2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap so tu nhien n: ");
		int n = sc.nextInt();

		int sum = 0;
		int i = 0;

		while (i < n) {
			if (i % 3 == 0) {
				sum += i;
			}
			i++;
		}

		System.out.println("Tong cac so nho hon " + n + " va chia het cho 3 la: " + sum);
	}

}