//tudo compila, inclusive um arquivo vazio

/*Podemos ter várias tipo, 
porém se for publico
só podemos ter 1, e tem que ser o mesmo nome da classe*/

package br.com.certificacao;

import java.util.Date;
import java.io.*;

interface A{
	/*Interfaces podem ter variáveis e métodos*/

	/*Tanto a constante como o metodo abstrato, são publicos
	digitando ou não. A constante também é static e final.
	O método é abstrato, digitando isso ou não
	Exemplo: 
	public static final int TAMANHO = 5;
	public abstract void autentica(String nome, String senha) {}
	*/
	//constante, não pode ter seu valor alterado
	int TAMANHO = 5;
	
	// metodo abstrato publico.
	void autentica(String nome, String senha);

}

class B {
	/* 
	Podemos ter variaveis, metodos, etc, com o mesmo
	nome da classe.
	Não há conflito entre o nome da variável, metodo 
	ou nome da classe*/
	int B;
	void B(){

	}
}
class Pessoa {

	//variável de instancia(atributo)precisa existir
	// um objeto pessoa para existir um nome
	String nome;

	// Não precisa de uma pessoa para existir;
	//variavel static, de classe;
	static int totalDePessoas = 0;

	/*construtores vão ter o mesmo nome da classe.
	construtor nao devo retornar nada, por que
	o proprio já está retornando uma pessoa que está
	sendo criada.
	Obs: Pode retornar nada; Exemplo:
	Pessoa(String nome) {
		if(nome==null){
			nome = "Mateus";
			return;
		}
		this.nome = nome;
	}
	*/
	Pessoa(String nome) {
		this.nome = nome;
	}

	//metodo
	public String getNome() {
		//variável local
		String sobrenome = "Almeida"; 
		return nome +" " +sobrenome;
	}
}


interface Figura {
	
}