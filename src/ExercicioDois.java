import java.util.Scanner;

public class ExercicioDois {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		
		double raio, area, pi;
		pi = 3.14159;
				
		System.out.println("Este programa lê o valor do raio que você inserir e calcula o valor da area de um circulo");
		System.out.println("Insira o valor do raio: ");
		raio = sc.nextDouble();
		area = pi*Math.pow(raio, 2.0);
		System.out.printf("O valor da area será de: %.4f", area);
		
		sc.close();
	}

}
