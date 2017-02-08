public class Carro {
	int ano;
	String modelo;

	Carro() {
		ano = 2017;
	}

	void reseta() {
		ano = 2017;
	}

	public String getDadosDeImpressao() {
		return modelo + " -> " + ano;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
}