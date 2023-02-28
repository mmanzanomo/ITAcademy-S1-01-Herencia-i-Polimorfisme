package n3exercici1.noticies;

public class Motociclisme extends Noticia {
	private String equip;


	public Motociclisme(String titular, String equip) {
		super(titular, 100.0, 3);
		this.equip = equip;
	}

	@Override
	public double calcularPreuNoticia() {
		double preu = getPreu();
		if(equip.equals("Honda") || equip.equals("Yamaha")) {
			preu += 50.0;
		}
		return preu;
	}

	@Override
	public int calcularPuntuacioNoticia() {
		int puntuacio = getPuntuacio();
		if(equip.equals("Honda") || equip.equals("Yamaha")) {
			puntuacio += 3;
		}
		return puntuacio;
	}

	public String getEquip() {
		return equip;
	}

	public void setEquip(String equip) {
		this.equip = equip;
	}

}


