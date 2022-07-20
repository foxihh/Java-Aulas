package estrutura_condicional;
import java.util.*;

public class ExercicioSete {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		double x = sc.nextDouble();
		double y = sc.nextDouble();
		
		if (x == 0 && y == 0) {
			System.out.println("Origem");
		} else if(x == 0) {
			System.out.println("Eixo X");
		} else if(y == 0) {
			System.out.println("Eixo y");
		} else if(x > 0 && y > 0) {
			System.out.println("Q1");
		} else if(y > 0 && x < 0) {
			System.out.println("Q2");
		} else if(y < 0 && x < 0) {
			System.out.println("Q3");
		} else {
			System.out.println("Q4");
		}
		
		sc.close();
	}

}
