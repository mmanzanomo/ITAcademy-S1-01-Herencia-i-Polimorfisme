package n3exercici1.noticies;

public class F1 extends Noticia {
	private String escuderia;


	public F1(String titular, String escuderia) {
		super(titular, 100.0, 4);
		this.escuderia = escuderia;
	}


	@Override
	public double calcularPreuNoticia() {
		double preu = getPreu();
		if(escuderia.equals("Ferrari") || escuderia.equals("Mercedes")) preu += 50.0;
		return preu;
	}

	@Override
	public int calcularPuntuacioNoticia() {
		int puntuacio = getPuntuacio();
		if(escuderia.equals("Ferrari") || escuderia.equals("Mercedes")) puntuacio += 2;
		return puntuacio;
	}

	public String getEscuderia() {
		return escuderia;
	}

	public void setEscuderia(String escuderia) {
		this.escuderia = escuderia;
	}

}
