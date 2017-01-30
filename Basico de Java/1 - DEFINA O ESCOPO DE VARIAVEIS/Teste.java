class Pessoa {
	static int id = 1;
	static void metodo(){
		System.out.println(id);
	}
}

class X {
	int a = 10;
	public void metodo() {
		//shadowing
		int a = 20; 
		System.out.println(a);
	}
}
public class Teste {

	public void m1(String nome) {
		System.out.println(nome);
		int x = 10;

		if(x>=10) {
			int y = 50;
			System.out.println(y);	
		}
		//System.out.println(y); //erro de compilação
		System.out.println(x);
		m2();
		System.out.println(nome +"teste");
	}

	public void m2(){

	}


	public Teste(String nome) {
		System.out.println(nome);
	}

	public static void main(String[] args) {
		Teste t = new Teste("NOME");

		t.m1("Mateus");

		System.out.println(Pessoa.id);

		Pessoa p = new Pessoa();
		System.out.println(p.id);	

		Pessoa.metodo();	

		new X().metodo();
	}
}