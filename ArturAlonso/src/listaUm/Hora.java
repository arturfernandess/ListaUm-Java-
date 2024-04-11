package listaUm;

public class Hora {
	private int hora;
	private int minutos;
	
	public Hora (int h, int m) {
		this.hora = h;
		this.minutos = m;
	}

	public int getHora() {
		return hora;
	}

	public void setHora(int h) {
		this.hora = h;
	}

	public int getMinutos() {
		return minutos;
	}

	public void setMinutos(int m) {
		this.minutos = m;
	}
	
	public String imprimirHora () {
		return hora + ":" + minutos;
	}
	

}
