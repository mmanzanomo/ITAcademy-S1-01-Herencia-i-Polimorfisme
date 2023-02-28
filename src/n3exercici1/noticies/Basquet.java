package n3exercici1.noticies;

public class Basquet extends Noticia {
	private String competicio;
	private String club;


	public Basquet(String titular, String competicio, String club) {
		super(titular, 250.0, 4);
		this.competicio = competicio;
		this.club = club;
	}


	@Override
	public double calcularPreuNoticia() {
		double preu = getPreu();
		if(competicio.equals("Eurolliga")) preu += 75.0;
		if(club.equals("Barça") || club.equals("Madrid")) preu += 75.0;
		return preu;
	}

	@Override
	public int calcularPuntuacioNoticia() {
		int puntuacio = getPuntuacio();
		if(competicio.equals("Eurolliga")) {
			puntuacio += 3;
		} else if(competicio.equals("ACB")) {
			puntuacio += 2;
		}
		if(club.equals("Barça") || club.equals("Madrid")) puntuacio += 1;
		return puntuacio;
	}

	public String getCompeticio() {
		return competicio;
	}

	public void setCompeticio(String competicio) {
		this.competicio = competicio;
	}

	public String getClub() {
		return club;
	}

	public void setClub(String club) {
		this.club = club;
	}

}
