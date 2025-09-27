
void main() { 
	
	var nomeItem1 = "Refresco do Chaves";
	var descricaoItem1 = "Suco de limão que parece de tamarindo e tem gosto de groselha.";
	var emPromocaoItem1 = false;
	var precoItem1 = 2.99;
	var idItem1 = 1L;
	var categoriaItem1 = 4;

	var nomeItem2 = "Sanduíche de Presunto do Chaves";
	var descricaoItem2 = "Sanduíche de presunto simples, mas feito com muito amor.";
	var emPromocaoItem2 = true;
	var precoItem2 = 3.50;
	var precoComDescontoItem2 = 2.99;
	var idItem2 = 3_000_000_000L;
	int categoriaItem2 = 2;

   /*
   categorias

	1 - Entradas
	2 - Pratos Principais
	3 - Sobremesas
	4 - Bebidas
   */

   IO.println("Nome: " + nomeItem1);

   if (emPromocaoItem1) {
	// var porcentagemDesconto = (preco - precoComDesconto) / preco;
	// IO.println("Porcentagem de desconto: " + porcentagemDesconto);

	// IO.println("Preco: de " + preco + " por " + precoComDesconto);
   } else {
	IO.println("Preco: " + precoItem1);
	IO.println("Item não está em promoção");

   }


   if (categoriaItem1 == 1) {
	IO.println("Categoria: Entradas");
   } else if (categoriaItem1 == 2) {
	IO.println("Categoria: Pratos Principais");
   } else if (categoriaItem1 == 3) {
	IO.println("Categoria: Sobremesas");
   } else if (categoriaItem1 == 4) {
	IO.println("Categoria: Bebidas");
   } else {
	IO.println("Categoria não encontrada...");
   }

IO.println("-------");

	switch(categoriaItem1) {
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