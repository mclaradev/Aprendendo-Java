public class ContinueBreak {
    public static void main(String[]args){
        int codigoDeSaida = 9;

        for(int codigoCarteirinha = 1; codigoCarteirinha <= 10; codigoCarteirinha++){
            if(codigoDeSaida == codigoCarteirinha){
                System.out.println("Código encontrado.");
                break;
            }
        }
    }
}
