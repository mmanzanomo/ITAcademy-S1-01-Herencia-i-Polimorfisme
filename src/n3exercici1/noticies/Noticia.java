package n3exercici1.noticies;

public abstract class Noticia {
	private String titular;
	private String text = "";
	private int puntuacio;
	private double preu;


	public Noticia(String titular, double preu, int puntuacio) {
		this.titular = titular;
		this.preu = preu;
		this.puntuacio = puntuacio;
	}

	public abstract double calcularPreuNoticia();

	public abstract int calcularPuntuacioNoticia();

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public int getPuntuacio() {
		return puntuacio;
	}

	public void setPuntuacio(int puntuacio) {
		this.puntuacio = puntuacio;
	}

	public double getPreu() {
		return preu;
	}

	public void setPreu(double preu) {
		this.preu = preu;
	}


}
