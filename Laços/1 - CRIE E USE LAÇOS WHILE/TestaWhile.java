class TestaWhile {
	public static void main(String[] args) {
		int i = 1;
		while(i<10)
			//loop infinito se nao incrementar o i
			System.out.println(i++);

		//while(true)
			System.out.println(i);
			//i++;
			/*o i++ nunca vai executar, por que vai entrar em loop infinito
			no while(true). Dessa forma, o compilador vai entender que o 
			i++ nunca será executado e gerará um erro de compilação(UnreachableCode)
			*/

		boolean verdadeiro = true; 
		//final boolean verdadeiro = true;
		/* for final, significa que o valor nao vai alterar nunca, 
		assim o compilador vai lançar um UnreachableCode e nao vai compilar. Se nao tiver o 
		final, PODE SER que talvez o valor mude, aí então compila*/
		//while(verdadeiro)
			System.out.println(i);
			i++;
	}
}