package n2exercici1;

public class Telefon {
	private String marca;
	private String model;


	public Telefon(String marca, String model) {
		this.marca = marca;
		this.model = model;
	}

	// Mostra per pantalla el número rebut per paràmetre.
	public void trucar(String numero) {
		System.out.println("S'està trucant al número " + numero);
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

}
