
void main() {

	ItemCardapio item1 = new ItemCardapio();
	item1.nome = "Refresco do Chaves";
	item1.descricao =  "Suco de limão que parece de tamarindo e tem gosto de groselha.";
	item1.emPromocao = false;
	item1.preco = 2.99;
	item1.id = 1L;
	item1.categoria = 4;

	var item2 = new ItemCardapio();
	item2.nome = "Sanduíche de Presunto do Chaves";
	item2.descricao = "Sanduíche de presunto simples, mas feito com muito amor.";
	item2.emPromocao = true;
	item2.preco = 3.50;
	item2.precoComDesconto = 2.99;
	item2.id = 3_000_000_000L;
	item2.categoria = 2;

   /*
   categorias

	1 - Entradas
	2 - Pratos Principais
	3 - Sobremesas
	4 - Bebidas
   */

   IO.println("Nome: " + item2.nome);

   if (item2.emPromocao) {
	var porcentagemDesconto = (item2.preco - item2.precoComDesconto) / item2.preco;
	IO.println("Porcentagem de desconto: " + porcentagemDesconto);
	IO.println("Preco: de " + item2.preco + " por " + item2.precoComDesconto);
   } else {
	IO.println("Preco: " + item2.preco);
	IO.println("Item não está em promoção");

   }


   if (item2.categoria == 1) {
	IO.println("Categoria: Entradas");
   } else if (item2.categoria == 2) {
	IO.println("Categoria: Pratos Principais");
   } else if (item2.categoria == 3) {
	IO.println("Categoria: Sobremesas");
   } else if (item2.categoria == 4) {
	IO.println("Categoria: Bebidas");
   } else {
	IO.println("Categoria não encontrada...");
   }

IO.println("-------");

	switch(item2.categoria) {
		case 1:
				IO.println("Categoria: Entradas");
		case 2:
				IO.println("Categoria: Pratos Principais");
				break;
		case 3:
				IO.println("Categoria: Sobremesas");
				break;
		case 4:
				IO.println("Categoria: Bebidas");
				break;

		default:
			IO.println("Categoria não encontrada...");

	}

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
	String nome;
	String descricao;
	boolean emPromocao;
	double preco;
	double precoComDesconto;
	long id;
	int categoria;

}