/*
Sobrecarga de método significa que um número de parâmetros ou o tipo de parâmetros é diferente.
O retorno ou os modificadores de acesso, os throws não influenciam se um método está sendo
sobrecarregado ou nao.
só é sobrecarregado se possui o mesmo nome tipos ou quantidade de parametros diferentes.
*/
class Overloader {
	public void metodo(int i){
		System.out.println("com int");
	}
	public void metodo(double d){
		System.out.println("com double");
	}
	public void metodo(String s){
		System.out.println("com string");
	}
	public void metodo(){
		System.out.println("sem nada");
	}

	public void metodo2(String s) {
		System.out.println("Com string: " +s);
	}

	public void metodo2(Object o) {
		System.out.println("Com Object");
	}

	public void metodo3(String a, int b) {
		System.out.println("String, int");
	}
	public void metodo3(int a, String b) {
		System.out.println("int, String");
	}

	public void metodo4(int a, double b){
		System.out.println("int, double");
	}
	public void metodo4(double a, int b){
		System.out.println("double, int");
	}

	public void metodo5(String a, Object b){
		System.out.println("string, object");
	}
	public void metodo5(Object a, String b){
		System.out.println("object, string");
	}

	public void metodo6(Object a, Object b){
		System.out.println("Object, object");
	}
	public void metodo6(String a, String b){
		System.out.println("String, String");
	}
}

class TestaOverload {
	public static void main(String[] args) {
		new Overloader().metodo();
		new Overloader().metodo(23);
		new Overloader().metodo((short)23);
		new Overloader().metodo((float)23);
		new Overloader().metodo(23.12);
		new Overloader().metodo("Uma string aqui");

		System.out.println("----");
		
		new Overloader().metodo2(new Object());
		new Overloader().metodo2("Teste");
		new Overloader().metodo2((Object)"Teste");

		System.out.println("----");

		new Overloader().metodo4(3, 5.3);
		new Overloader().metodo4(5.3, 3);
		//new Overloader().metodo4(3, 3);//erro de compilação: a referência para esse método é ambígua

		System.out.println("-----");

		new Overloader().metodo6("Teste", "Olá");
		new Overloader().metodo6(new Object(), "String");
		new Overloader().metodo6("String", new Object());


	}
}

