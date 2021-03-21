package itt.clases.escuela;

/*Aqui es donde vamos a crear nuestra clase Calificacion para despues poder hacer construir un
 * objeto arrayList de objetos Calificacion
 */
public class Calificacion {
	/* Primero como siempre encapsulamos los atributos propios de esta clase */
	private String asignatura;
	private int nota;

	/*
	 * Despues implementamos el contructor vacío, yo no solía implementarlo si
	 * sabia que no lo iba a utilizar, pero vi que en clase tu lo hacias y me ha
	 * gustado la idea. Cuando llamamos al constructor vacio, asignamos cadena
	 * vacia y un cero a los atributos
	 */
	public Calificacion() {
		this.asignatura = "";
		this.nota = 0;
	}

	/*
	 * Ahora implementamos el constructor que utilizaremos en nuestro ejercicio,
	 * el cual al llamarlo será necesario pasarle dos parametros
	 */
	public Calificacion(String asig, int not) {
		/*
		 * Con la palabra reservada o especial this, hacemos referencia al
		 * objeto actual, por lo tanto decimos que los atributos del objeto
		 * actual sean los que pasamos por parametro en el contructor
		 */
		this.asignatura = asig;
		this.nota = not;

		/*
		 * AHORA CONSTRUIMOS NUESTROS METODOS SETTER Y GETTER, será la forma de
		 * acceder a nuestros atributos desde el exterior, ya que los hemos
		 * encapsulado al principio de esta clase, el otro dia aprendimos la LEY
		 * DE DEMETER o minimo conocimiento, la cual se puede aplicar a esta
		 * explicacion.
		 */

	}

	public void cambia_Asignatura(String asig) {// SETTER
		this.asignatura = asig;

	}

	public String dame_Asignatura() {// GETTER
		return this.asignatura;

	}

	public void cambia_Nota(int not) {// SETTER
		this.nota = not;

	}

	public int dame_Nota() {// GETTER
		return this.nota;

	}

	@Override
	// Con el override indicamos la sobre escritura del metodo toString
	/*
	 * A continuacion implementamos el metodo toString que nos retornará la
	 * informacion del objeto Calificacion mediante sus atributos
	 */
	public String toString() {
		return this.asignatura + ": " + this.nota;
	}

}
