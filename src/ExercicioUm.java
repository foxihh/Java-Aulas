import java.util.Scanner;

public class ExercicioUm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int a, b, soma;
		
		System.out.println("Este programa calcula o valor de dois numeros que você irá inserir");
		System.out.println("Insira o valor do primeiro numero: ");
		a = sc.nextInt();
		System.out.println("Insira o valor do segundo numero: ");
		b = sc.nextInt();
		soma = a + b;
		
		System.out.println("A soma de A + B é: " + soma);
		
		sc.close();
	}

}