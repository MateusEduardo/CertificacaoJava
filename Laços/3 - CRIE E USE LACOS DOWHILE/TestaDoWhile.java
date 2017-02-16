public class TestaDoWhile {
	public static void main(String[] args) {
		int i = 1;
		
		//pode nao executar nenhuma vez, por que a condição vem antes
		while(i<10) {
			System.out.println(i);
			i++;
		}

		int j = 1;
		do {
			System.out.println(j);
			j++;
		} while(j<10);
		//executa pelo menos uma vez o bloco, e depois verifica a condição

		int a = 30;
		do
			System.out.println(a++);//se nao colocar chaves, só pode ter uma condição
		while(a<40);
	}
}