public class ValoresAcumulativos {
    public static void main(String[]args){
        int soma = 0;

        for(int i = 0; i <= 10; i++){
            soma += i;
        }

        System.out.println("A soma dos valores é: " + soma);
    }
}
