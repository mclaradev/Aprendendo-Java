public class PrecedenciaOperadores {
    public static void main(String []args){
        int numero = 5;
        int numero2 = ++numero;
        int numero3 = numero++;
        int numero4 = --numero;
        int numero5 = numero--;

        System.out.println("O valor de número é: " + numero + " pré-incrementado: " + numero2);
        System.out.println("pós-incremento é: " + numero3 + " pré-decremento: " + numero4 + " e pós-decremento é: " + numero5);
    }
}
