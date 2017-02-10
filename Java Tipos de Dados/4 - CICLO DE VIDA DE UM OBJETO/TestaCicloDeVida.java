class TestaCicloDeVida {


	public static void main(String[] args) {
		Carro carro = new Carro(); // cria um objeto Carro com uma referecia carro
		c.ano = 1990;
		c.modelo = "Fusca";

		carro = new Carro(); /*torna o primeiro carro inacessível, e passa a referenciar
		um segundo objeto Carro.*/

		carro = null;
		/*Deixa os dois objetos Carro inacessíveis*/

		// Quantos objetos foram Garbage Colletados? R: Não sei dizer (não temos como saber quando foi rodado o GC)

		if(15>10) {
			Carro c2 = new Carro();
			c2.ano = 2011;
		}
		//System.out.println(c2);//erro, pois o c2 não está mais acessível

		Carro c3;
		for(int i = 0; i < 10; i++) {
			//Carro c3 = new Carro(); //vai criar 10 objetos Carro
			c3 = new Carro();
		}
		//nesse caso, a variável c3 está referenciando o ultimo Carro criado no loop


		/*
			Um objeto é acessível enquanto o código puder acessar ele direta ou indiretamente.
			Um objeeto é inacessível quando não temos mais referencias diretas ou indiretas no código

			GC: Garbage Collector  = coleciona o lixo e tira da memória. Pode jogar fora o objeto a qualquer
			instante, DEPOIS QUE ELES SE TORNAREM INACESSÍVEIS. 
			Não necessáriamente ele joga "desaloca" o objeto no exato momento que se tornar inacessíveis.
			Não temos como saber quando ele vai rodar e limpar os objetos da memória

			SE AINDA TEMOS UMA REFERÊCIA, mesmo indireta, não pode ser removido pelo GC*/
	}
}