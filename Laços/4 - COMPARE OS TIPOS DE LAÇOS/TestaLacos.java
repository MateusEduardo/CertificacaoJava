public class TestaLacos{
	public static void main(String[] args) {
		/*
			while(condicao){
				executa quando a condição for verdadeira
			}

			do {
				executa pelo menos uma vez, depois verifica a condição
			} while(condicao);
		*/


			for(int i=1; i<10; i++) {
				System.out.println(i);
			}

			//enhanced for só serve para percorrer uma array, da esquerda para a direita, do primeiro ao ultimo
			//nao da para percorrer as duas arrays ao mesmo tempo
			int[] array1 = new int[10];
			int[] array2 = new int[10];
			for(int i :  array1) {

			}
			for(int i :  array2) {
				
			}
	}
}