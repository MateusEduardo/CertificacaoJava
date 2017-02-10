/*Wrappers são objetos que representam tipos primitivos, para cada tipo primitivo no java, temos um
wrapper equivalente a esse tipo.

tipo primitivo / Wrappers:
boolean = Boolean;
byte = Byte;
short = Short;
int = Integer;
char = Character;
long = Long;
double = Double;
float = Float;
*/

public class Wrappers {

	public static void main(String[] args) {
		/*Para criar wrapper: Wrapper é um objeto então para criar um wrapper
		criamos igual criamos um objeto*/

		/*
			Todos os primitivos que representam um tipo numérico, 
			tem dois construtores:
		*/	
		Double d1 = new Double(22.5);
		Double d2 = new Double("22.5"); // recebe a representação como String.
		/*	A representação da casa decimal
		 	é sempre com . "ponto"
		*/	
		//Double d2123 = new Double("22,5");

		/*	Não da para garantir que a String passada é um número. 
			Toda vez que tentar converter uma String para um 
			wrapper ou para um primitivo e a String não puder 
			ser convertida, vai gerar um NumberFormatException, 
			EM TEMPO DE EXECUÇÃO 
		*/
		//Double d3 = new Double("teste");
		
		//Construtor do Character
		Character c = new Character('a');

		//construtor do boolean:
		Boolean b1 = new Boolean(true);
		Boolean b2 = new Boolean("true"); //funciona, converte para true
		Boolean b3 = new Boolean("True"); //funciona, converte para true
		Boolean b4 = new Boolean("TrUe"); //funciona, converte para true
		//Qualquer coisa diferente de true, vai gerar um wrapper representando false
		Boolean b5 = new Boolean(false); //false
		Boolean b6 = new Boolean("false"); //false
		Boolean b7 = new Boolean("SeuNome"); //funciona, converte para false
		Boolean b8 = new Boolean("true "); // o espaço faz com que converta para false, pois não é true exatamente


		// CONVERTENDO WRAPPERS

		//Wrapper => primitivo
		Long l = new Long("123");
		/*sempre que for converter um wrapper para um primitivo, usar o formato:
			xxxValue, exemplo:
		*/
		Long l1 = l.longValue();
		int i = l.intValue();
		double d = l.doubleValue();

		boolean b = new Boolean("T").booleanValue();
		char c1 = new Character('a').charValue();


		//String => primitivo
		//parseXXX
		/*Todos os wrappers tem um método estático que faz a conversão diretamente de uma String e devolve
		diretamente um tipo primitivo equivalente ao parse que você está usando.*/

		double d20 = Double.parseDouble("20.3");
		System.out.println(d20);

		int i20 = Integer.parseInt("1231");
		int i21 = Integer.parseInt("10",10);
		int i22 = Integer.parseInt("10",8);
		int i23 = Integer.parseInt("11",16);
		int i24 = Integer.parseInt("11",13);
		int i25 = Integer.parseInt("A",16);
		long i26 = Long.parseLong("110101", 2);

		System.out.println(i20+" "+i21+" "+i22+" "+i23+" "+i24+" "+i25);
		System.out.println(i26);

		//String => wrapper
		/*Uma das maneiras é com construtor
			Double d2 = new Double("22.5");

			Todo wrapper tem um método chamado valueOf. Você passa uma String e ele devolve o wrapper do tipo
		*/

			Double d31 = Double.valueOf("23.7");
			System.out.println(d31);

			Integer i30 = Integer.valueOf("3");
			Integer i31 = Integer.valueOf("6AF", 16);//base 16

			System.out.println(i30 +", "+i31);


		// primitivo => String
		//toString
			String s40 = Double.toString(24.6);
			String s41 = Integer.toString(123, 10); // base 10

		// wrapper => String
		//toString
	}
}