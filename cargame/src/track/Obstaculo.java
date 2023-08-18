package track;

public class Obstaculo {
	
	private int tamaño;
	private String tipo;
	private int daño;
	private boolean activo;
	
	public void Obstaculo(String pTipo) {
		tipo = pTipo;
		tamaño = 5;
		daño = 10;
		activo = true;
	}
	public int getDaño() {
		return daño;
	}
	public void agrandar() {
		tamaño+=1;
	}
}
