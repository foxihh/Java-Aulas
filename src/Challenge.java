import java.util.Locale;

public class Challenge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String product1 = "Computer";
		String product2 = "Office desk";
		
		int age = 30;
		int code = 5290;
		char gender = 'M';
		
		double price1 = 2100.0;
		double price2 = 650.50;
		double measure = 53.234567;
		
		System.out.println("Products:");
		System.out.printf("%s, which price is $%.2f\n", product1, price1);
		System.out.printf("%s, which price is $%.2f\n", product2, price2);
		System.out.println("Record: " + age + " years old, code " + code + " and gender: " + gender);
		System.out.printf("Measue with eight decimal places: %.8f\n", measure);
		System.out.printf("Rouded (three decimal places): %.3f\n", measure);
		Locale.setDefault(Locale.US);
		System.out.printf("US decimal point: %.3f", measure);
		
	}

}
