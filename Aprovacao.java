public class Aprovacao {
    public static void main(String[]args){
        int nota1 = 10;
        int nota2 = 7;

        float media = (nota1 + nota2) / 2.0f;

        if (media > 6) {
            System.out.println("média: " + media + " você foi aprovado!");
        } else {
            System.out.println("média: " + media + " você foi reprovado");
        }
    }
}
