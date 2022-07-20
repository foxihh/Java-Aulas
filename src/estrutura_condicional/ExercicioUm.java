package estrutura_condicional;

import java.util.Scanner;

public class ExercicioUm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x;
		Scanner sc = new Scanner(System.in);
		System.out.println("Escreva um número inteiro: ");
		x = sc.nextInt();
		if (x<0) {
			System.out.println("Negativo");
		} else {
			System.out.println("Não negativo");
		}
		sc.close();
	}

}
