package genetica;

import model.arbol;

public class gen {
	
	private arbol genotipo; //Esto hay que arreglarlo, lo tienes marcado tu
	private int fenotipo; //Aqui la representaci�n
	
	public gen() {}
	public gen(int valor) {
		genotipo=valor;
		fenotipo=valor;
	}
	
	public gen(gen gen) {
		fenotipo=gen.getFenotipo();
		genotipo=gen.getGenotipo();
	}
	public int getSizeGenotipo(){
		return 1;
	}
	
	public int getFenotipo() {
		return fenotipo;
	}
	
	public int getGenotipo() {
		return genotipo;
	}
	public void setFenotipo(int d) {
		fenotipo=d;
		genotipo=fenotipo;
	}
}
