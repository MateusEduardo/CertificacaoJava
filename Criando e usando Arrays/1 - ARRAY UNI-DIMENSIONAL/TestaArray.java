public class TestaArray {
	public static void main(String[] args) {
		/*
		Para declarar um array em java, utilizamos os colchetes:
		int[] idades;
		double pesos[];
		long []numeros;
		long[]tamanho;
		*/
		int[] idades = new int[10];
		/*cada vez que iniciamos um array, ele ja inicializa cada um dessas variaveis com 
		o valor default para aquele tipo, por exemplo, será 0 se o tipo for numerico
		ou false se for booleano. Se for de obbjetos, será null*/
		System.out.println(idades[0]);

		//int[] array = new int[0];
		//o java apenas pede que tenha um valor declarado para o tamanho do array, mas ele nao verifica esse número
		//int[] array1 = new int[-1];
		//compila,mas em tempo de execução, da uma exception

		int[] numeros = new int[]{0,2,4,6,8}; //para criar um array se ja temos os numeros que irão
		System.out.println(numeros[1]);

		//Cliente[] clientes = new Cliente[]
		//	{new Cliente(), null, new Cliente()};

		//se ja sabe o que vai inserir no array, tambem pode ficar assim:
		int[] valores = {1,2,3,4,5,6,7}; /* mas só funciona se estiver tudo isso na mesma linha
		Nao pode por exemplo: 
		int[] idades;
		idades = {1,3,4,5,6};
		*/
		valores[1] = 10;
		System.out.println(valores[1]);
		System.out.println(valores.length);

		for(int i = 0;i < valores.length; i++) {
			System.out.println(valores[i]);
		}

		for(int valor : valores/*forEach, a partir do java5*/) {
			System.out.println("Valor: "+valor);
			//forEach serve apenas para leitura, nao podemos fazer escrita
			//pois nao temos o indice
		}


	}
}