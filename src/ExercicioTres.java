import java.util.Scanner;

public class ExercicioTres {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int A, B, C, D;
		double diferenca;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Insira o valor de 4 numeros inteiros: ");
		A = sc.nextInt();
		B = sc.nextInt();
		C = sc.nextInt();
		D = sc.nextInt();
		
		diferenca = (A*B-C*D);
		System.out.println("O valor da diferença do produto de A por B e C por D é: "+ diferenca);
		
		
		sc.close();
	}

}
