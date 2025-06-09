public class mes {
    public static void main(String []args) {
        int mes = 5;
        String resultado;

        switch (mes){
            case 1 -> resultado = "Janeiro";

            case 2 -> resultado = "Fevereiro";

            case 3 -> resultado = "Março";

            case 4 -> resultado = "Abril";

            case 5 -> resultado = "Maio";

            case 6 -> resultado = "Julho";

            case 7 -> resultado = "Junho";

            case 8 -> resultado = "Agosto";

            case 9 -> resultado = "Setembro";

            case 10 -> resultado = "Outubro";

            case 11 -> resultado = "Novembro";

            case 12 -> resultado = "Dezembro";

            default -> resultado = "Esse mês não existe não amigão kk";
        }

        System.out.println(resultado);
    }
}
