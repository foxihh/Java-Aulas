import java.util.*;
public class ExercicioSeis {
	
	public static void main(String[] args) {
	
		Locale.setDefault(Locale.US);
		float A, B, C;
		double areatr, areaci, areatrap, areaq, areare, pi;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insira 3 valores com ponto flutuante de dupla precisão: ");
		A = sc.nextFloat();
		B = sc.nextFloat();
		C = sc.nextFloat();
		
		pi = 3.14159;
		areatr = (A*C)/2;
		areaci = pi*Math.pow(C, 2.0);
		areatrap = ((A+B)*C)/2;
		areaq = Math.pow(B, 2.0);
		areare = A*B;
		
		System.out.printf("Triangulo: %.3f\n", areatr);
		System.out.printf("Circulo: %.3f\n", areaci);
		System.out.printf("Trapézio: %.3f\n", areatrap);
		System.out.printf("Quadrado: %.3f\n", areaq);
		System.out.printf("Retangulo: %.3f\n", areare);
		sc.close();
	}
}
