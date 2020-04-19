package seleccion;

import java.util.Random;

import model.algoritmo;
import poblacion.individuo;
import poblacion.poblacion;

public class algotirmoOtro extends algoritmoSeleccion {

	public algotirmoOtro() {
		super("Otros");
	}

	@Override
	//Elige el siguiente en base a un random, no controla repeticiones. Es una intenci�n de Bogo sort 
	//aplicada a la selecci�n
	public void seleccionar(poblacion p, algoritmo f) {
		Random r=new Random();
		int anterior = 0;
		
		for(int j = 0; j < p.getSize(); j++) {
			int indice = r.nextInt(p.getSize());
			addSeleccionado(new individuo(p.getIndividuo(anterior)));
			anterior += indice; //indice%p.getSize();
			if(anterior >= p.getSize())anterior -= p.getSize(); //Modulo cutre pero no me funciona el normal a%b
		}
	}

	@Override
	public poblacion ini(poblacion p, algoritmo f) {
		iniSeleccionados(p);
		seleccionar(p, f);
		getSeleccionados().iniBest();
		return getSeleccionados();
	}

}



