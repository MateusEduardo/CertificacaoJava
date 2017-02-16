class Moto {
	//vira uma variavel da classe, e nao uma variavel do objeto/instancia
	//private static int totalDeMotos = 0;

	private static final int PADRAO_TOTAL_DE_MOTOS = 19;
	private static int totalDeMotos = PADRAO_TOTAL_DE_MOTOS;

	private String marca;

	//nao pode ter um metodo estatico e de classe com o mesmo nome
	public static int getTotalDeMotos() {
		return Moto.totalDeMotos;
		// o metodo só é executado depois da classe ser executada
	}

	public static void setTotalDeMotos(int i) {
		totalDeMotos = i;
	}

	/* Nao podemos acessar uma variavel estática que vem depois da nossa variavel. exemplo:
	static b = a;
	static a = 10;

	Mas podemos acessar um método, que pode acessar outra variável, exemplo:
	*/
	static int b = getMetodo();
	public static int getMetodo() {
		//return 18;
		return a; // nesse caso, vai imprimir 0. Por que o compilador vai declarar todas as variaveis e setar o valor padrão
		//nesse caso (int), 0. No momento que tentamos acessar a variável a, ela ainda está com o valor padrão 0
	}
	static int a = 15;
}

public class TestaStatic {
	public static void main(String[] args) {
		System.out.println(Moto.b);
		System.out.println(Moto.a);

		
		//m.setTotalDeMotos(12);
		System.out.println(Moto.getTotalDeMotos());
		System.out.println(Motocicleta.getTotalDeMotos());

		Moto m = new Moto();
		System.out.println(m.getTotalDeMotos());

	}
}

class Motocicleta extends Moto {
	//nao pode ter um metodo estatico e de classe com o mesmo nome mesmo com herança
	//int getTotalDeMotos() {

	// }
	//mas pode ter um metodo ESTATICO com o mesmo nome
	//mas nao ocorre sobrescrita de métodos.
	public static int getTotalDeMotos() {
		return -500;
	}
}