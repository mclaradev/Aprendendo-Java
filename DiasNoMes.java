public class DiasNoMes {
    public static void main(String[] args) {
        String mes = "Outubro";

        int DiadoMes = switch(mes){
            case "Janeiro", "Março", "Maio", "Julho", "Outubro", "Dezembro" -> 31;
            case "Abril", "Junho", "Agosto", "Setembro", "Novembro" -> 30;
            case "Fevereiro" -> 28;
            default -> 0;
        };

        System.out.println(DiadoMes);
    }
}








