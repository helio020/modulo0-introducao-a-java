class ItemCardapioSemGluten extends ItemCardapio {
    ItemCardapioSemGluten(long id, String nome, String descricao, double preco, CategoriaCardapio cardapio) {
        super(id, nome, descricao, preco, cardapio);
    }
    
    boolean ehSemGluten() {
        return true;
    }
}
