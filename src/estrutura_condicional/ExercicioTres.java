package estrutura_condicional;
import java.util.*;

public class ExercicioTres {
	public static void main(String[] args) {
	int A, B;
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Escreva dois n�meros inteiros separados por apenas um espa�o: ");
	A = sc.nextInt();
	B = sc.nextInt();
	
	if (A % B == 0 || B % A == 0) {
		System.out.println("S�o multiplos");
	} else {
		System.out.println("N�o s�o multiplos");
	}
	
	sc.close();
	}
}
