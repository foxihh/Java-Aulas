package estrutura_condicional;
import java.util.*;

public class ExercicioCinco {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double qt, cod;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe o código do produto que você deseja e a quantidade: ");
		cod = sc.nextDouble();
		qt = sc.nextDouble();
		
		
		if (cod == 1) {
			System.out.println("Total: R$" + qt*4.0);
		} else if (cod == 2) {
			System.out.println("Total: R$" + qt*4.5);
		} else if (cod == 3) {
			System.out.println("Total: R$" + qt*5.0);
		} else if (cod == 4) {
			System.out.println("Total: R$" + qt*2.0);
		} else if (cod == 5) {
			System.out.println("Total: R$" + qt*1.5);
		} else {
			System.out.println("Produto não especificado no cardápio ou código incorreto");
		}
		
		sc.close();
	}

}
