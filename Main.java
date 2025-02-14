public class Main {
	public static void main(String[] args) {
		// byte a = 10;
		// int b = a + 5;

		// int a = 10;
		// long b = 15l;
		// long c = a + b;

		//int a = 10;
		// float b = 1.5f;
		// float c = a * b;

		// int a = 10;
		// double b = 1.5;
		// double c = a * b

		int number = 9;
		String resultado;

		if (number % 2 == 0) {
			resultado = "par";
		} else {
			resultado = "ímpar";
		}

		System.out.println("O número é: " + resultado);
	}
}