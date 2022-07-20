package estrutura_repetitiva;

import java.util.*;

public class ExercicioTres {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int alcool, gasolina, diesel;
		alcool = 0;
		gasolina = 0;
		diesel = 0;

		int cod = sc.nextInt();

		while (cod != 4) {
			if (cod == 1) {
				alcool = alcool + 1;
			} else if (cod == 2) {
				gasolina = gasolina + 1;
			} else if (cod == 3) {
				diesel = diesel + 1;
			}
			cod = sc.nextInt();
		}
		System.out.println("Muito Obrigado");
		System.out.println("Alcool = " + alcool);
		System.out.println("Gasolina = " + gasolina);
		System.out.println("Diesel = " + diesel);
		sc.close();
	}

}
