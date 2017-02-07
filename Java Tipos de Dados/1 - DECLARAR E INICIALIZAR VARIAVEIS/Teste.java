class Motor {

}

class Carro {
	int ano;
	char primeiraLetra;
	boolean usado;
	Motor motor;
	String marca;
}
public class Teste {
	public static void main(String[] args) {
		/*Uma variável local, não tem valor padrão
		*/
		int idade;
		//idade = 17;
		/*só compila se ficar claro que a variavel foi iniciada*/
		/*if(args.length>3) {
			idade = 15;
		} else {
			System.out.println("Teste");
		}*/
		//System.out.println(idade);

		Carro carro = new Carro();
		System.out.println(carro.ano);
		/*Nesse caso, o int ano; , é uma variavel membro
		variáveis membro int possuem o valor padrão 0*/

		System.out.println(carro.primeiraLetra == 0);
		/*Por fins matemáticos, no java o char é um valor numérico
		e o padrão dele é 0
		*/

		System.out.println(carro.usado); // valor padrão do boolean é false

		System.out.println(carro.motor); // valor padrão para referencia é null

		System.out.println(carro.marca); //valor padrão para String, é null
		//(marca é uma referencia para String porque String também é um objeto)

		int[] valores = new int[10];
		System.out.println(valores[0]); //imprimee o valor padrao


		boolean[] bvalores = new boolean[10];
		System.out.println(bvalores[0]);  //imprimee o valor padrao


		String[] svalores = new String[10];
		System.out.println(svalores[0]);  //imprimee o valor padrao


		boolean valor = true;

		int x = 15;
		double v = 10.2d;
		long l = 13l;
		float f = 13.1f;

		double d = 3.1E2; /*representação com notação científica.
		Nesse caso, 3.1E2 = 3.1 x10^2(3 ponto um vezes dez elevado na dois), que
		é igual a 3.1 x 100, que por sua vez resulta em 310*/
		System.out.println(d);


		float f2 = 2e3f; //2 x 10^3
		System.out.println(f2);

		/*IMPORTANTE*/
		int i = 0761; /*Quando começamos com 0, é uma representação
		octal ( base 8).*/
		System.out.println(i); // não irá printar 761


		int b = 0xA; //número hexadecimal
		System.out.println(b);

		int c = 0b100; /*binário, só poderemos utilizar o 0 e 1.
		exemplo: 0B0, 0B1, 0B10,...*/
		System.out.println(c);	

		long x2 = 1_234_567_891_234L;
		System.out.println(x2);


		char o = 3; // char 0 = '\u03A9';
		System.out.println(o);
	}
}