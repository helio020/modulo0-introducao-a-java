
void main() {

	ItemCardapio item1 = new ItemCardapio(1L, "Refresco do Chaves", "Suco de limão que parece de tamarindo e tem gosto de groselha.", 2.99, 4);

	var item2 = new ItemCardapio(3_000_000_000L, "Sanduíche de Presunto do Chaves", "Sanduíche de presunto simples, mas feito com muito amor.", 3.50, 2);
	item2.definePromocao(2.99);

   IO.println("Nome: " + item2.nome);
   IO.println("Em Promoção: " + item2.emPromocao);
   IO.println("Preço com Desconto: " + item2.precoComDesconto);

   if (item2.emPromocao) {
	double porcentagemDesconto = item2.calculaPorcentagemDesconto();
	IO.println("Porcentagem de desconto: " + porcentagemDesconto);
	IO.println("Preco: de " + item2.preco + " por " + item2.precoComDesconto);
   } else {
	IO.println("Preco: " + item2.preco);
	IO.println("Item não está em promoção");
   }

	IO.println("Categoria: " + item2.obtemNomeCategoria());

	IO.println("-------");
	IO.println("Arrays");

	double[] precos = new double[7];

	precos[0] = 2.99;
	precos[1] = 3.50;
	precos[2] = 12.99;
	precos[3] = 4.99;
	precos[4] = 2.50;
	precos[5] = 4.99;
	precos[6] = 25.90;

	boolean[] emPromocao = { false, true, true, true, true, true, false };

	IO.println("Preço do Item 3: " + precos[2]);
	IO.println("Tamanho do array de precos: " + precos.length);
	IO.println("Tamanho do array emPromocao: " + emPromocao.length);

	IO.println("O segundo item tem promoção? " + emPromocao[1]);

	double totalDePrecos = 0.0;
	int i = 0;  // inicializacao de uma variavel
	while (i < precos.length) { // comparacap
		// IO.println("rodou " + i);
		double preco = precos[i];
		totalDePrecos = totalDePrecos + preco;
		i++; // incremento
	}
	IO.println("Soma dos preços: " + totalDePrecos);

	int totalDeItensEmPromocao = 0;
	int j = emPromocao.length - 1;
	do {
		IO.println(j);
		if (emPromocao[j]) {
			totalDeItensEmPromocao++;
		}
		j--;
	} while (j >= 0);
	IO.println("Total de itens em promoção: " + totalDeItensEmPromocao);


	double totalDePrecosComFor = 0.0;
	for (int k = 0; k < precos.length; k++) {
		double preco = precos[k];
		totalDePrecosComFor += preco;
	}
	IO.println("Soma dos preços (com for): " + totalDePrecosComFor);

	// IO.println(preco); // nao eh visivel
	IO.println(i);
	// IO.println(k); // nao eh visivel

    // forEach
	double totalDePrecosComForEach = 0.0;
	for (double preco : precos) {
		totalDePrecosComForEach += preco;	
	}
	IO.println("Soma dos preços (com for each): " + totalDePrecosComForEach);

	// achar o primeiro preco que eh maior que 10.0
	double precoLimite = 10.0;
	double precoMaiorQueLimite = -1.0; 
	for (double preco : precos) {
		if (preco > precoLimite) {
			precoMaiorQueLimite = preco;
			break;
		}
	}
	IO.println("O primeiro preço que é maior que " + precoLimite + ": " + precoMaiorQueLimite);

IO.println("-------");

	// Imprimir todos os precos menores ou iguais ao limite
	for (double preco : precos) {
		if (preco <= precoLimite) {
			IO.println("Preço menor que " + precoLimite + ": " + preco);
			continue;
		}
		IO.println("Processamento pesado para: " + preco); // so queria processar para valores maiores que 10.0
	}

}

class ItemCardapio {

	// atributos
	long id;
	String nome;
	String descricao;
	boolean emPromocao;
	double preco;
	double precoComDesconto;
	int categoria;

	//construtor
	ItemCardapio(long id, String nome, String descricao, double preco, int categoria) {
		this.id = id;
		this.nome = nome;
		this.descricao = descricao;
		this.preco = preco;
		this.categoria = categoria;
	}

	//metodos
	double calculaPorcentagemDesconto() {
		return (preco - precoComDesconto) / preco * 100;
	}

	String obtemNomeCategoria() {
		   /*
			categorias

				1 - Entradas
				2 - Pratos Principais
				3 - Sobremesas
				4 - Bebidas
			*/

		String nomeCategoria;
		switch(categoria) {
			case 1:
					nomeCategoria = "Entradas";
					break;
			case 2:
					nomeCategoria = "Pratos Principais";
					break;
			case 3:
					nomeCategoria = "Sobremesas";
					break;
			case 4:
					nomeCategoria = "Bebidas";
					break;
			default:
				nomeCategoria = "Não encontrada...";
		}
		return nomeCategoria;
	}

	void definePromocao(double precoComDesconto) {
		emPromocao = true;
		this.precoComDesconto = precoComDesconto;
	}

}