class TestaPrecedenciaTrocada {
	public static void main(String[] args) {
		int a = 15 * 4 + 1; 
		System.out.println(a);

		int b = 15 * (4 + 1); 
		System.out.println(b);

		System.out.println(15 + 0 );
		System.out.println(15 + (0 + " = 150"));
		System.out.println("Mateus"+ " Almeida".length());
		System.out.println(("Mateus"+ " Almeida").length());
	}
}