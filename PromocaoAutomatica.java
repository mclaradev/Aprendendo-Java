public class PromocaoAutomatica {
	public static void main(String[] args){
		byte a = 100;
		short b = 32666;
		int c = 2146783943;
		long d = 56454357879881564L;
		float e = 1.4798f;
		double f = 693.50;
		char g = 'F';

		int soma = a + b;
		long subtracao = c - d;
		double multiplicacao = e * f;
		long divisao = a / d;

		System.out.println("Resultado da soma: " + soma);
		System.out.println("Resultado da subtração: " + subtracao);
		System.out.println("Resultado da multiplicação: " + multiplicacao);
		System.out.println("Resultado da divisão: " + divisao);
		System.out.println("Char: " + g);
	}
}