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
		System.out.println("Voc� digitou: " + x);
		System.out.println("Voc� digitou: " + y);
		
		System.out.printf("Voc� digitou: %.2f\n", w);
		
		sc.close();

	}

}
