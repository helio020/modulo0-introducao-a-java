import mx.florinda.modelo.ItemCardapio;
import mx.florinda.modelo.Restaurante;

void main() {
    String nomeDoRestaurante = "Florinda Eats";
    String enderecoDoRestaurante = "Rua Florinda";

    Restaurante restaurante = new Restaurante(nomeDoRestaurante, enderecoDoRestaurante);

    String linha = IO.readln("Digite um id de um item de cardápio: ");
    long idSelecionado = Long.parseLong(linha);

    ItemCardapio itemSelecionado = restaurante.getCardapio().getItemPorId(idSelecionado);

    IO.println("== Item do Cardápio ==");
    IO.println("Id: " + itemSelecionado.getId());
    IO.println("Nome: " + itemSelecionado.getNome());
    IO.println("Descrição: " + itemSelecionado.getDescricao());
    if (itemSelecionado.isEmPromocao()) {
        IO.println("Item em promoção! 🤑");
        double porcentagemDesconto = itemSelecionado.getPorcentagemDesconto();
        IO.println("Preco: de " + itemSelecionado.getPreco() + " por " + itemSelecionado.getPrecoComDesconto());
        IO.println("Porcentagem de desconto: " + porcentagemDesconto);
    } else {
        IO.println("Preco: " + itemSelecionado.getPreco());
        IO.println("Item não está em promoção");
    }
    IO.println("Categoria: " + itemSelecionado.getCategoria());
    IO.println("Imposto: " + itemSelecionado.getImposto());

    IO.println("-------");

    IO.println("Soma dos preços: " + restaurante.getCardapio().getSomaDosPrecos());
    IO.println("Total de itens em promoção: " + restaurante.getCardapio().getTotalDeItensEmPromocao());

    double precoLimite = 10.0;
    IO.println("O primeiro preço que é maior que " + precoLimite + ": " + restaurante.getCardapio().getPrimeiroPrecoMaiorQueLimite(precoLimite));

    IO.println("-------");

    // Imprimir todos os precos menores ou iguais ao limite
    for (ItemCardapio item : restaurante.getCardapio().getItens()) {
        if (item.getPreco() <= precoLimite) {
            IO.println("Preço menor que " + precoLimite + ": " + item.getPreco());
        }
    }

    IO.println("-------");

    IO.println("Restaurante");
    IO.println("Nome: " + restaurante.getNome());
    IO.println("Nome: " + restaurante.getEndereco());

}
