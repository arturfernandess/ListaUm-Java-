package listaUm;

public class Main {

	public static void main(String[] args) {
		DataHora a = new DataHora (new Data (24, 12, 2007), new Hora(20, 45));
		System.out.println(a.imprimirDataHora());
	
		}

}
