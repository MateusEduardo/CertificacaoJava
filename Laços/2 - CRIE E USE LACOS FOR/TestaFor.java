import java.util.ArrayList;


public class TestaFor {
	public static void main(String[] args) {
		// int i = 10;
		// while(i>0) {
		// 	System.out.println(i);
		// 	i--;
		// }

		/*declaracao da variavel = opcional, condição = opcional, incremento = opcional
			exemplo: for(; ;){}
		podemos declarar mais variaveis desde que seja o mesmo tipo(exceto se ja tiver sido inicializada
		antes do laço, exemplo abaixo) e sem identificador (somente identificar a primeira)
			exemplo: for(int i=10, j=20, a=1; i<10;i++){}
		também podemos adicionar mais condiçoes no incremento, exemplo:
		for(int i = 10, j = 20, a = 1; i < 10; i++, j--, a++){}

		int i;
		long j;
		for(i=0, j=10; i<10; i++, j--){}

		PARA UMA ÚNICA EXPRESSÃO DENTRO DO FOR, podemos deixar sem as chaves.
		podemos executar qualquer coisa no incremento, desde que execute algo. Exemplo:
		*/
		for(int i = 0, j=10; i<10;i++, j--, System.out.println("funcionou!"))
			System.out.println(i + " "+  j);

		//se na expressao depois do incremento, ja tivermos tudo que precisamos, podemos por só um ; 
		for(int i = 0, j=10; i<10;i++, j--, System.out.println("Já tenho tudo aqui, nao preciso de mais nada"));

		//tomar cuidado com o loop infinito:
		//for(int i=10;;);




		// ------ enhanced loop

		int[] numeros = {1,2,3,4,5,6};
		for(int i=0; i<numeros.length;i++){
			int numero = numeros[i];
			System.out.println(numero);
		}
		// enchanced for :
		for(int numero : numeros) {
			System.out.println(numero);
		}
		//recebe a declaracao de uma variavel : array.


		ArrayList<String> nomes = new ArrayList<String>();
		nomes.add("Mateus");
		nomes.add("Teste");

		for(String nome : nomes) {
			System.out.println(nome);
		}
		//o foreach precisa passar do primeiro até o ultimo
	}
}