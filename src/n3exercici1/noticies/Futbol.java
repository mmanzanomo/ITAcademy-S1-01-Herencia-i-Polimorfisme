package n3exercici1.noticies;

public class Futbol extends Noticia {
	private String competicio;
	private String club;
	private String jugador;


	public Futbol(String titular, String competicio, String club, String jugador) {
		super(titular, 300.0, 5);
		this.competicio = competicio;
		this.club = club;
		this.jugador = jugador;
	}


	@Override
	public double calcularPreuNoticia() {
		double preu = getPreu();
		if(competicio.equals("Lliga de Campions")) preu += 100.0;
		if(club.equals("Barça") || club.equals("Madrid")) preu += 100.0;
		if(jugador.equals("Ferran Torres") || jugador.equals("Benzema")) preu += 50.0;
		return preu;
	}

	@Override
	public int calcularPuntuacioNoticia() {
		int puntuacio = getPuntuacio();
		if(competicio.equals("Lliga de Campions")) {
			puntuacio += 3;
		} else if(competicio.equals("Lliga")) {
			puntuacio += 2;
		}
		if(club.equals("Barça") || club.equals("Madrid")) puntuacio += 1;
		if(jugador.equals("Ferran Torres") || jugador.equals("Benzema")) puntuacio += 1;
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


	public String getJugador() {
		return jugador;
	}

	public void setJugador(String jugador) {
		this.jugador = jugador;
	}

}
