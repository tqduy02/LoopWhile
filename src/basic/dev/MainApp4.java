package basic.dev;

import java.util.Scanner;

public class MainApp4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Nhap so nguyen n: ");
		int n = sc.nextInt();

		int soBanDau = n;
		int soDaoNguoc = 0;

		while (n != 0) {
			int remainder = n % 10;
			soDaoNguoc = soDaoNguoc * 10 + remainder;
			n /= 10;
		}

		if (soBanDau == soDaoNguoc) {
			System.out.println(soDaoNguoc + " la so Palindrome.");
		} else {
			System.out.println(soDaoNguoc + " khong phai la so Palindrome.");
		}

	}

}