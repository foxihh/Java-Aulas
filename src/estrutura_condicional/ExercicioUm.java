package estrutura_condicional;

import java.util.Scanner;

public class ExercicioUm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x;
		Scanner sc = new Scanner(System.in);
		System.out.println("Escreva um n�mero inteiro: ");
		x = sc.nextInt();
		if (x<0) {
			System.out.println("Negativo");
		} else {
			System.out.println("N�o negativo");
		}
		sc.close();
	}

}
