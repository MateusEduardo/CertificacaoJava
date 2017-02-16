public class TestaIfElse {
	public static void main(String[] args) {
		boolean autentico = true;

		if(autentico/*Sempre será uma condição booleana*/) {
			System.out.println("Ok");
		} else {
			System.out.println("Não autorizado");
		}


		boolean valor = true;

		if(valor = false) {
			System.out.println("False");
			/*Nesse cenário, apesar de ser uma atribuição
			(valor = false), compila e roda..
			pois está sendo atribuido um valor booleano.
			É preciso analisar qual será o resultado da atribuiçao
			para definir se o if executa ou não
			*/
		}


		boolean v = true;
		/* Quando o codigo dentro do bloco if/else for só de 1 linha,
		pode-se retirar as chaves*/
		if(v) 
			System.out.println("true");
		else
			System.out.println("false");
		
		if(v) System.out.println("teste1");
		else if(!v) System.out.println("teste2");
		else if(valor) System.out.println("teste3");
		else if(!valor) System.out.println("teste4");
		else System.out.println("funcionou");


		boolean mateus = true;
		if(mateus) {
			int a = 10;
			System.out.println(a);
			System.out.println(mateus);
			System.out.println("ok");
		} else System.out.println("Else");

		if(mateus) System.out.println("ok");
		else { 
			System.out.println("entrou no else");
			System.out.println(mateus);
		}

		if(autentico)
			System.out.println("autentico");
		else
			System.out.println("fail");
			System.out.println("try again");
		/* Quando nao temos as chaves no if/else
		somente uma linha entra no bloco. 
		try again vai imprimir independente do resultado do if.
		Identação correta: 
		else
			System.out.println("fail");
		System.out.println("try again");
		*/


	}
}