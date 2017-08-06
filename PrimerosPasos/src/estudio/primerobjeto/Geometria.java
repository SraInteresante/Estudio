package estudio.primerobjeto;

/**
 * Clase Geometria, representa un objeto geometrico cualquiera
 * @author retsuchan
 *
 */
public class Geometria {
	 private int ancho;
	 private int largo;
	 private int alto;
	 
	 public Geometria() {
		 
	 }
	 
	 /**
	  * Metodo que retorna Ancho
	  * @return el valor actual de ancho
	  */
	 public int getAncho() {
		 return ancho;
	 }
	 
	 /**
	  * Metodo que modifica el ancho
	  * @param ancho el nuevo valor de ancho
	  */
	 public void setAncho(int ancho) {
		 this.ancho = ancho;
	 }

	/**
	 * @return the largo
	 */
	public int getLargo() {
		return largo;
	}

	/**
	 * @param largo the largo to set
	 */
	public void setLargo(int largo) {
		this.largo = largo;
	}

	/**
	 * @return the alto
	 */
	public int getAlto() {
		return alto;
	}

	/**
	 * @param alto the alto to set
	 */
	public void setAlto(int alto) {
		this.alto = alto;
	}
	
	/**
	 * Metodo que retorna el volumen de la figura
	 * @return El volumen
	 */
	public int getVolumen() {
		return alto * ancho * largo;
	}
}