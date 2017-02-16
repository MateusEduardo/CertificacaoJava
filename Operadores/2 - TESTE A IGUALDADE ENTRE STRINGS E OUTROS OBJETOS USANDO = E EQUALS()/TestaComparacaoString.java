public class TestaComparacaoString {
	public static void main(String[] args) {
		String nome1 = new String("Mateus");
		String nome2 = new String("Mateus");

		System.out.println(nome1 == nome2);

		String nome3 = "Mateus";
		String nome4 = "Mateus";
		String nome5 = new String("Mateus");

		System.out.println(nome3 == nome4);
		System.out.println(nome4 == nome5);
		System.out.println(nome4.equals(nome5));


		System.out.println("-------");

		//String ab = "a" + "b";
		//System.out.println(ab == "ab");

		String a = "a";
		String ab = a + "b";
		System.out.println(ab == "ab");
		/*Duas strings literais, o resultado é um literal e vai parar no pool.
		Se um dos lados for uma variável, é uma nova string e não vai para o pool*/

		String texto = "um texto qualquer";
		String txt = texto.substring(3,8); //texto
		System.out.println(txt == "texto");

		System.out.println(texto.toLowerCase() == texto);
		System.out.println(texto.toString() == texto);


	}
}