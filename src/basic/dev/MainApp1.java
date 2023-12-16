package basic.dev;

public class MainApp1 {

	public static void main(String[] args) {
		int n = 100;
		int sum = 0;
		int i = 1;

		while (i <= n) {
			sum += i;
			i++;
		}

		System.out.println("Tong cac so tu 1 den 100: " + sum);
	}

}