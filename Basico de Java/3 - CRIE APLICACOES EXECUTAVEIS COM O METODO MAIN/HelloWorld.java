public class HelloWorld {
	public static void main(String[] args){
		System.out.println(args.length == 0 ? "sim" : "nao");
		
		if(args.length > 0) {
			printaLista(args);
		}
	}

	public static void printaLista(String... args) {
		for(int i=0; i<args.length; i++) {
			System.out.println(args[i]);
		}
	}
}