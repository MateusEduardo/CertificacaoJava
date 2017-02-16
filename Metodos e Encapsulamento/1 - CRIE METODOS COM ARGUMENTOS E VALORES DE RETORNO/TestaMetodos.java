/* Toda classe, interface ou enum, pode ter métodos.

Todos os métodos tem uma assinatura e um corpo, caso nao seja um metodo abstrato.
*/

class Param {
	//compila e roda porque int pode converter conforme tabela de conversão
	void primitivo(double/*ou float ou long*/ a) {
		if(a==5)
			return;
		System.out.println(a);
	}

	void referencia(Object o) {

	}

	void teste(int a, int b){
		b = 5;
	}

	String getNumero(int a) {
		if(a>0)return "ok";
		else return "certo";
	}
}


class ClasseComMetodos {

	//nome do metodo: getNumero
	//o tipo de retorno é obrigatóriom nesse caso int
	//se nao colocar um modificador de acesso, fica o default
	//após a lista de parametros, podemos lançar exceptions
	//modificadores, parametros e throws são opcionais
	public int getNumero(/*Parametros*/) throws RuntimeException {
		return 5;
	}
	/*
	Final: Se essa classe for herdado, o método não poderá ser sobescrito
	Abstract: Esse método é só a definição do método, a assinatura sem corpo
	Static: O método é estático, pertence a classe e nao a um objeto
	Synchronized: O acesso ao método é sincronizado. Bloqueia diversas threads para acessar esse método
	Native: Só define a assinatura, sem a implementação
	Strictfp: contas de ponto flutuante
	*/
}

class TestaMetodos {
	public static void main(String[] args) {
		Param p = new Param();
		int a = 1;
		p.primitivo(a);
		//p.primitivo('Z');//é char, mas char pode ser convertido para double
		p.teste(2, 1);
		p.referencia(new Object());
		p.referencia("Mateus");
		System.out.println(p.getNumero(45));
	

	}
}