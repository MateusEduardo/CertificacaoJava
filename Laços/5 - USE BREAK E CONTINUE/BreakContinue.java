public class BreakContinue {
	public static void main(String[] args) {
		int i = 0;

		lacowhile: while(i<10){
			i++;
			/*if(i==5){
				break; //vai quebrar o laço mais proximo que estamos, nesse caso o While
			} else {
				System.out.println(i);
			}*/
			//if(i==5) break;

			if(i==5) continue;
			System.out.println("i = " +i);
		}
		System.out.println("fora do while");

		for(int j = 1; j<10; j++) {
			if(j==8) break;
			if(j==5) continue;
			System.out.println(j);
		}

		System.out.println("for");

		/*for(int a = 0; a < 10; a++) {
			for(int f=0; f<10; f++) {
				if(a * f == 25) break; //vai quebrar o laço de dentro, e vai voltar para o laço do a(quebra a do 5 e pula pro 6)
				System.out.println(a + " * " + f + " = " + a * f);
			}
		}*/

		//podemos dar um "nome" "rotulo" para nossos laços. Pode ter mais laços com o mesmo nome, desde que nao de conflito entre eles
		// o label pode ter o mesmo nome da variavel
		/*externo:for(int a = 0; a < 10; a++) {
			for(int f=0; f<10; f++) {
				if(a * f == 25) break externo; //vai quebrar o laço externo, parando todo o for do a
				System.out.println(a + " * " + f + " = " + a * f);
			}
		}
		*/
		//o label pode ser usado com switch, laços, e qualquer statement, mas para usar ele PRECISA estar antes de um for ou while
		int externo = 4;
		externo:for(int a = 0; a < 10; a++) {
			tabuada: System.out.println("tabuada do " + (i-1));
			interno: for(int f=0; f<10; f++) {
				if(a * f == 25) break interno;
				System.out.println(a + " * " + f + " = " + a * f);
			}
		}

		http://google.com
		for(int d = 0; d<10; d++) {
			System.out.println("Antes do switch");
			sobrenome:
			nome: switch(1) {
				case 0:
				case 1:
					System.out.println("Caso " +d);
					for(int g=0;g<3;g++){
						System.out.println(g);
						if(g==1)break sobrenome;
					}
					//break;
				case 2:
					System.out.println(d);
					continue;
				case 3:
					System.out.println(d);
					break;
				default:
					System.out.println("Nao vai chegar nesse caso nunca");
			}
			System.out.println("Depois do switch");
		}
	}
}