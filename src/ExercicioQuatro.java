import java.util.Locale;
import java.util.Scanner;

public class ExercicioQuatro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int mat, ht;
		double vh, salario;
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("Insira sua Matricula: ");
		mat = sc.nextInt();
		System.out.println("Insira a quantidade de horas que voc� trabalhou: ");
		ht = sc.nextInt();
		System.out.println("Insira o valor que voc� recebe por horas trabalhadas: ");
		vh = sc.nextDouble();
		salario = vh*ht;
		System.out.println("Matricula: "+ mat);
		System.out.printf("Sal�rio: U$ %.2f", salario);
		
		sc.close();
	}

}
