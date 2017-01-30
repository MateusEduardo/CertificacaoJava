package financeiro;

import modelo.Pessoa;
import modelo.Endereco;
//import modelo.*; //importar tudo de dentro do pacote modelo

import static modelo.Util.TAMANHO;
import static modelo.Util.maior;
//import static modelo.Util.*;


//import java.util.Date;
import java.util.*;
import java.sql.Date; 
/* 
Não podemos importar duas classes com o mesmo
nome. Exemplo: 
import java.util.Date;
import java.sql.Date; 

OBS: 
import java.util.*;  //inclui o java.util.Date;
import java.sql.Date; 
Quando chamarmos 
	Date dataDeTeste; 
estará criando um Date do tipo
sql, porque é o import específico e não o geral


OBS2:
Se importarmos:
import java.util.*;
import java.sql.*;

E utilizarmos: 
Date dataTeste;

Não irá compilar, pois não vai entender qual Date
está utilizando.
*/
import br.com.certificacao.certificacao.modelo.*;
import br.com.certificacao.certificacao.dao.*;

public class Pedido {
	Pessoa cliente;
	Endereco endereco;
	Date dataInicio;

	/*Para usar, nesse caso, os dois Date(java.util.Date e
	java.sql.Date), devemos deixar explicito
	(fully qualified name)*/
	java.util.Date dataFinal;

	/*NÃO PODEMOS ACESSAR UMA CLASSE DO PACOTE DEFAULT DE DENTRO
	DE QUALQUER OUTRO PACOTE.
	nesse caso, não irá compilar.*/
	//Produto produto;


	public Pessoa getCliente() {
		return cliente;
	}

	public void calcula(){
		int t = TAMANHO;
		maior(3, 10);
	}
}