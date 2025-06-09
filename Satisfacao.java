public class Satisfacao {
    public static void main(String []args){

        int nivel =  5;
        String resultado;

        switch(nivel){
            case 1 -> resultado = "muito insatisfeito";
            case 2 -> resultado = "insatisfeito";
            case 3 -> resultado = "neutro";
            case 4 -> resultado = "satisfeito";
            case 5 -> resultado = "muito satisfeito";
            default -> resultado = "não entendi seu nível de satisfação, tente novamente";
        }

        System.out.println(resultado);
    }
}
