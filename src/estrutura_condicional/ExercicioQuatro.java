package estrutura_condicional;
import java.util.*;

public class ExercicioQuatro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int horaI, horaF, duracao;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insira a hora de inicio e final do jogo (lembrar de arredondar e não colocar os minutos): ");
		horaI = sc.nextInt();
		horaF = sc.nextInt();
		
		if (horaI < horaF) {
			duracao = horaF - horaI;
		} else {
			duracao = 24 - horaI + horaF;
		}
		System.out.println("O jogo durou " +duracao+ " Hora(s)");
		
		sc.close();
	}

}
