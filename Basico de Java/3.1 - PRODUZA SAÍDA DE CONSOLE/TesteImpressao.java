public class TesteImpressao {

	public String toString() {
		return "oi";
	}

	public static void main(String[] args) {
		/*System.out.print(1);
		System.out.print(2.3);
		System.out.print(true);
		System.out.print("asida ");
		System.out.print("a");
		System.out.print(new TesteImpressao());
		System.out.println(new int[10]);
		
		System.out.println(new char[10]); //irá imprimir nada
		char[] letras = {'a','b'};
		System.out.println(letras);
		*/
		/**Única coisa que podemos passar para o print
		que não irá chamar o toString, e imprimir
		o conteudo independente do que está lá dentro,
		é um array de char. Qualquer outro OBJETO que
		passar para o método de impressão, 
		ele irá invocar o método toString().
		Esse comportamento acontece por que existe uma
		sobrecarga do método print específica
		para receber array de char
		*/

		/*System.out.print("qualquer coisa");//printa na mesma linha
		System.out.println("qualquer coisa");//printa com quebra de linha
		System.out.print("quebra \n linha");*/

		//Para formatar, podemos usar duas formas, format e printf
		System.out.printf("Teste");
		System.out.format("Teste");
		//internamente, o printf chama o format
		System.out.format("ok %s, certo", "Mateus");
		/* $(obrigatorio)-indice(opcional)-flags(opcional)-tamanho(opcional)-precisao(opcional)-tipo(obrigatorio).
		*/
		System.out.format("%b %n", true);
		System.out.format("%d %n", 312);
		System.out.format("%f %n", 123.12);
	}
}