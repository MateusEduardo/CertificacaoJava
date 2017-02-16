class TestaSwitch {
	public static void main(String[] args) {
		int opcao = 4;
		/* 
		Switch funciona com qualquer tipo inteiro ou inferior
		e String. (E enum também)
		*/
		final int variavel = 1; 
		/* podemos utilizar 
		variavel no case APENAS se ela for final
		*/
		switch(opcao) {
			//case 1: //nao pode ser case null
			//case (5-4): //podemos fazer calculo tbm
			case(variavel):
				System.out.println("primeira opçao");
				break;
			default:
				System.out.println("default");
				break;
				//o default pode estar em qualquer lugar do switch
				// o default só é executado se nenhum outro case 
				// tiver o conteudo que estamos buscando
			case 2:
				System.out.println("segunda opção");
				break;
			case 3:
				System.out.println("terceira opção");
				break;
			case 4:
			case 5:
				System.out.println("outra opcao");
				break;
			
		}
	}
}