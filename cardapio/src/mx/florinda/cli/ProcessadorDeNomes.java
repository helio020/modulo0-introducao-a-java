package mx.florinda.cli;

public class ProcessadorDeNomes {

    void main() {
        String nomeCompleto = IO.readln("Digite seu nome completo: ");
        String[] nomeEmPartes = nomeCompleto.split(" ");
        String primeiroNome = nomeEmPartes[0];
        String ultimoNome = nomeEmPartes[nomeEmPartes.length - 1];
        IO.println("Olá, " + primeiroNome + " " + ultimoNome + "!");
    }
}
