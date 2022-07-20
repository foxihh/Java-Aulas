package estrutura_condicional;
import java.util.*;

public class ExercicioSeis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		double valor = sc.nextDouble();
		
		if (valor <= 25 && valor >= 0) {
			System.out.println("Intervalo de [0,25]");
		} else if (valor <= 50 && valor >= 0) {
			System.out.println("Intervalo de [25,50]");
		} else if (valor <= 75 && valor >= 0) {
			System.out.println("Intervalo de [50,75]");
		} else if (valor <= 100 && valor >= 0) {
			System.out.println("Intervalo de [75,100]");
		} else {
			System.out.println("Fora do intervalo");
		}
		
		sc.close();
		
	}

}
