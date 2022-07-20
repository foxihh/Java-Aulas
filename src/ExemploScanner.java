import java.util.Locale;
import java.util.Scanner;

public class ExemploScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		String x;
		int y;
		double w;
		x = sc.next();
		y = sc.nextInt();
		w = sc.nextDouble();
		System.out.println("Você digitou: " + x);
		System.out.println("Você digitou: " + y);
		
		System.out.printf("Você digitou: %.2f\n", w);
		
		sc.close();

	}

}
