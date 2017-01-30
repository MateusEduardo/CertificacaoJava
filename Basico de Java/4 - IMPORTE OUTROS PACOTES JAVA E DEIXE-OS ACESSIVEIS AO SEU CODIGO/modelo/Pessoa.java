package modelo;

//import modelo.Endereco; //OPCIONAL, porque está no mesmo pacote

public class Pessoa {
	String nome;
	Endereco endereco; /*Uma classe referencia a outra sem
	preocupações se está no mesmo pacote.
	Quando tenho duas classes no mesmo pacote, podemos
	importar de uma para outra sem ter que importá-las.
	OBS: O import é opcional, nao é preciso fazer, mas se fizer
	vai compilar da mesma forma*/
	
	public void getCliente(){
		
	}

}