class ItemCardapioBebida extends ItemCardapio {
    ItemCardapioBebida(long id, String nome, String descricao, double preco, CategoriaCardapio cardapio) {
        super(id, nome, descricao, preco, cardapio);
    }

    @Override
    double calculaImposto() {
        double imposto;
        imposto = preco * 0.05;
        return imposto;
    }
}