public class SomadePositivos {
    public static void main(String[]args){
        int number = 10;
        int soma = 0;
        int i = 0;

        do{
            soma =+ i;
            i++;
        }while(i <= number);

        System.out.println("Total: " + soma);
    }
}
