class Motor {

}

class Carro {
	int ano;
	char primeiraLetra;
	boolean usado;
	Motor motor;
	String marca;
}
class Teste {
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
		System.out.println(int[0]);
	}
}