public class ContandoStrings {
	public static void main(String[] args) {
		String h = new String("hello "); //criado 2 Strings, 1 string quando usou o new, so que toda vez que usa literais = novo objeto tambem criado. Objeto new e literal
		String h1 = "hello "; // nenhum objeto e criado, faz referencia ao objeto que ja existe no pool de strings
		String w = "world"; // criado 1 novo objeto e tambem vai para o pool de strings


		System.out.println("hello "); // nenhum objeto e criado porque reutiliza a referencia que ja tem no pool de strings
		System.out.println(h1 + "world"); //gera uma nova string, o world ja existe entao nenhum objeto e criado, mas a string toda concatenada gera uma nova string, e nao vai para o pool
		System.out.println("Hello " == h1); // Hello com H maiusculo, cria um novo objeto, 	esse Hello e colocado no pool
	}
}