class Cliente {
	String nome;
	public Cliente(String nome) {
		this.nome = nome;
	}

	public boolean equals(Object o) { // assinatura do equals
		Cliente outro = (Cliente)o;
		return this.nome.equals(outro.nome);
	}
}

class TestaComparacaoEquals {
	public static void main(String[] args) {
		Cliente c1 = new Cliente("Mateus");
		Cliente c2 = new Cliente("Almeida");
		Cliente c3 = new Cliente("Almeida");

		System.out.println(c1 == c2);
		System.out.println(c1 == c1);
		System.out.println(c2 == c3);
		System.out.println("------");
		System.out.println(c1.equals(c2));
		System.out.println(c1.equals(c1));
		System.out.println(c2.equals(c3));
	}
}