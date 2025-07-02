public class Aprovacao {
    public static void main(String[]args){
        int nota1 = 10;
        int nota2 = 7;
        int frequencia = 75;

        float media = (nota1 + nota2) / 2.0f;

        if (media > 7 && frequencia >= 75) {
            System.out.println("média: " + media);
            System.out.println("Frequência: " + frequencia + "%");
            System.out.println("Parabéns, você foi aprovado!");
        } else {
            System.out.println("média: " + media + " você foi reprovado");
        }
    }
}
