package n1exercici1;

public abstract class Instrument {
	private String nom;
	private double preu;
	// Atribut que pertany a la classe 
	public static String missatge = "Càrrega provocada per l'accés a un membre estàtic";

	/* Bloc d'inicialització que pertany a la clase i només serà carregada una vegada.
	 * La càrrega serà provocada per una instància de classe o per l'accés a un membre 
	 * estàtic.
	 * */
	static {
		System.out.println("Càrrega provocada per la creació de la primera instancia");
	}

	public Instrument() {}
	public Instrument(String nom, double preu) {
		this.nom = nom;
		this.preu = preu;
	}

	public abstract void tocar();

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public double getPreu() {
		return preu;
	}

	public void setPreu(double preu) {
		this.preu = preu;
	}


}
