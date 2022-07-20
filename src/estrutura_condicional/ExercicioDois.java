package estrutura_condicional;
import java.util.*;

public class ExercicioDois {
	public static void main(String[] args) {
		
		int x;
		Scanner sc = new Scanner(System.in);
		System.out.println("Escreva um número inteiro: ");
		x = sc.nextInt();
		if(x % 2 == 0) {
			System.out.println("Par");
		} else {
			System.out.println("Impar");
		}
		
		sc.close();
	}
	
	
}
