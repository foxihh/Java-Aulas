import java.util.Locale;
import java.util.Scanner;

public class ExercicioCinco {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		int cod1, cod2, qt1, qt2;
		double preco1, preco2, soma;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insira o codigo da primeira pe�a, a quantidade e o valor: ");
		cod1 = sc.nextInt();
		qt1 = sc.nextInt();
		preco1 = sc.nextDouble();
		
		
		
		System.out.println("Insira o codigo da segunda pe�a, a quantidade e o valor: ");
		cod2 = sc.nextInt();
		qt2 = sc.nextInt();
		preco2 = sc.nextDouble();
		
		
		
		soma = (qt1*preco1)+(qt2*preco2);
		System.out.println("Voc� est� comprando as pe�as " + cod1 + " e " + cod2);
		System.out.printf("O valor total a se pago ser� de: R$ %.2f", soma);
		
		sc.close();
	}

}
