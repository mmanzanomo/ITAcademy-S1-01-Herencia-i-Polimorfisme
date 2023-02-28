package n1exercici2;

public class Cotxe {
	// Constant de classe ha de ser declarada en la seva definició.
	private static final String MARCA = "Mazda";
	private static String model;
	// Ha de ser inicialitzat al constructor de classe.
	private final String POTENCIA;
	
	
	public Cotxe(String model, String potencia) {
		Cotxe.model = model;
		this.POTENCIA = potencia;
	}

	public static void frenar() {
		System.out.println("El vehicle està frenant");
	}

	public void accelerar() {
		System.out.println("El vehicle està accelerant");
	}

	
	public static String getMarca() {
		return MARCA;
	}

	public static String getModel() {
		return model;
	}

	public static void setModel(String model) {
		Cotxe.model = model;
	}

	public String getPotencia() {
		return POTENCIA;
	}

}
