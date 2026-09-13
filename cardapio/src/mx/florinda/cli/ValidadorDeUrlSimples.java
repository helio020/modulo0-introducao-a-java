package mx.florinda.cli;

public class ValidadorDeUrlSimples {

    void main() {
        String urlDigitada = IO.readln("Digite uma url: ");
        boolean comecaComHttp = urlDigitada.toLowerCase().startsWith("http://");
        boolean comecaComHttps = urlDigitada.toLowerCase().startsWith("https://");
        boolean terminaComPontoCom = urlDigitada.endsWith(".com");
        boolean terminaComPontoComPontoBr = urlDigitada.endsWith(".com.br");

        if ((comecaComHttp || comecaComHttps) && (terminaComPontoCom || terminaComPontoComPontoBr)) {
            IO.println("URL válida");
        } else {
            IO.println("URL inválida");
        }
    }

}
