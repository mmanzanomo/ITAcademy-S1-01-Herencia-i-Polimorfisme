package n1exercici2;

public class Main {

	public static void main(String[] args) {

		// La crida al mètode estàtic es realitza fent referència a la clase
		Cotxe.frenar();

		// Per cridar un métode dinàmic s'ha d'instanciar una classe.
		Cotxe cotxe = new Cotxe("6", "2000cc");
		
		cotxe.accelerar();
		
	}

}
