public class TestaCarro {
	public static void main(String... args) {
		Carro a = new Carro();
		a.modelo = "Gol";
		a.setModelo("Gol2");
		System.out.println(a.getDadosDeImpressao());
		System.out.println(a.ano);
		System.out.println(a.modelo.length());
	}
}