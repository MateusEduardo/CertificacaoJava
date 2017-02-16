/*ternario está ligado com 3 coisas, uma condiçao, caso verdadeiro, caso falso*/
class TestaTernario {
	public static void main(String[] args) {
		//(condicao) ? caso_verdadeiro : caso_falso;

		int i = 5;

		int resultado = (i == 5) ? 100 : 0;
		System.out.println(resultado);

		//int resultado 2 = (i == 5) ? "100" : 0;
		System.out.println(i == 5? "100" : 0);

	}
}