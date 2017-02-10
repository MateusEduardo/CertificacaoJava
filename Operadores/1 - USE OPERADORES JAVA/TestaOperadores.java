import java.util.ArrayList;
import java.util.List;


public class TestaOperadores {
	public static void main(String[] args) {
		// = operador de atribuição

		long idade = 15;

						// char =>
		// byte -> short -> int -> long
		//float -> double
		//char

		int a = 10;
		long b = 20;
		short c = 3;
		byte d = 4;

		double e = 30.0;
		float f = 40.3f;
		double g = 40.3f; // float cabe dentro de um double

		f = a;
		f = b;
		f = c;
		f = d;

		g = a;
		g = b;
		g = c;

		char cha = 65;


		ArrayList<String> lista = new ArrayList<>(); /*A partir do java 7, ele entende que está criando uma
		ArrayList de String*/
		List<String> lista2 = lista;
		//Operador de atribuição com referência está copiando a referência
	}
}