class Objeto {
	int valor;
}

public class TesteReferencia {
	public static void main(String[] args) {
		int a = 10;
		int b = a;

		a = a+5;

		System.out.println(a);
		System.out.println(b);

		Objeto o1 = new Objeto();
		o1.valor = 10;

		Objeto o2 = o1;

		o1.valor = o1.valor + 5;
		
		System.out.println(o1.valor);
		System.out.println(o2.valor);


	}
}