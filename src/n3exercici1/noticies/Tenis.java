package n3exercici1.noticies;

public class Tenis extends Noticia {
	private String competicio;
	private String[] tenistes;


	public Tenis(String titular, String competicio, String[] tenistes) {
		super(titular, 150.0, 4);
		this.competicio = competicio;
		this.tenistes = tenistes;
	}


	@Override
	public double calcularPreuNoticia() {
		double preu = getPreu();
		for(String tenista: tenistes) {
			if(tenista.equals("Federer") || tenista.equals("Nadal")
				|| tenista.equals("Djokovic"))
				preu += 50.0;
		}
		return preu;
	}

	@Override
	public int calcularPuntuacioNoticia() {
		int puntuacio = getPuntuacio();
		for(String tenista: tenistes) {
			if(tenista.equals("Federer") || tenista.equals("Nadal")
				|| tenista.equals("Djokovic"))
				puntuacio += 3;
		}
		return puntuacio;
	}

	public String getCompeticio() {
		return competicio;
	}

	public void setCompeticio(String competicio) {
		this.competicio = competicio;
	}

	public String[] getTenistes() {
		return tenistes;
	}

	public void setTenistes(String[] tenistes) {
		this.tenistes = tenistes;
	}

}
