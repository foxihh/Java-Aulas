package estrutura_condicional;
import java.util.*;

public class ExercicioTres {
	public static void main(String[] args) {
	int A, B;
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Escreva dois números inteiros separados por apenas um espaço: ");
	A = sc.nextInt();
	B = sc.nextInt();
	
	if (A % B == 0 || B % A == 0) {
		System.out.println("São multiplos");
	} else {
		System.out.println("Não são multiplos");
	}
	
	sc.close();
	}
}
