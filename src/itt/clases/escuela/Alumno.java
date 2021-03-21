package itt.clases.escuela;

import java.util.ArrayList;//importamos el paquete donde esta incluido la clase ArrayList

/*Esta será la clase donde tendremos toda la informacion del objeto alumno, su nombre, 
 * su numero de matricula y su coleccion de notas que estarán guardadas en un objeto del
 * tipo ArrayList del tipo Calificacion
 */

public class Alumno {
	/*
	 * Como siempre, encapsulamos nuestros atributos y los declaramos,
	 * recordamos que uno de los atributos es un objeto ArrayList de tipo
	 * Calificacion en donde meteremos nuestras notas.
	 */
	private String nombre;
	private int matricula;
	private ArrayList<Calificacion> calificaciones; /*
													 * Lo que metemos entre <>
													 * define el tipo de objetos
													 * que contiene el array
													 */

	// Creamos nuestro constructor sin paso de parametros, que devolvera valores
	// vacios, ceros o nulos
	public Alumno() {
		this.nombre = "";
		this.matricula = 0;
		this.calificaciones = null;
	}

	// Ahora implementamos nuestro constructor con paso de parametros, que es el
	// que vamos a utilizar
	public Alumno(String nombre, int matricula) {
		this.nombre = nombre;
		this.matricula = matricula;
		/*
		 * A continuación cada vez que llamemos al constructor con paso de
		 * parametros, crearemos un nuevo objeto ArrayList del tipo Calificacion
		 */
		this.calificaciones = new ArrayList<Calificacion>();

	}

	// AHORA IMPLEMENTAMOS COMO DICE EL EJERCICIO, LOS METODOS GETTER PARA LAS
	// TRES PROPIEDADES

	public String dame_Nombre() {// GETTER
		return this.nombre;
	}

	public int dame_Matricula() {// GETTER
		return this.matricula;

	}

	public ArrayList<Calificacion> dame_todoArrayList() {// GETTER
		/*
		 * Cuando llamemos a este metodo, nos devolvera un objeto del tipo
		 * ArrayList con todo lo que contiene, en este caso un ArrayList con el
		 * contenido de las Calificaciones
		 */
		return calificaciones;
	}

	/*
	 * El metodo implementado a continuación, lo llamaremos con el paso de dos
	 * parametros, el nombre de la asignatura y la correspondiente nota. Lo
	 * siguiente es un poco enrevesado pero voy a intentar explicarlo con
	 * palabras como pueda. Estos dos parametros, forman lo que necesitamos para
	 * un objeto calificación, por lo tanto, este objeto nuevo calificacion
	 * formado por esos parametros pasados en el metodo, tenemos que añadirlo a
	 * nuestro ArrayList. La forma de hacerlo es con el metodo add y dentro le
	 * ponemos que se añade un nuevo objeto calificacion con esos parametros que
	 * pasamos.
	 */
	public void calificar(String asignatura, int nota) {

		calificaciones.add(new Calificacion(asignatura, nota));

	}

	@Override
	// El metodo toString nos dará la información correspondiente al numero de
	// matricula y el nombre del alumno
	public String toString() {
		return "Alumno matricula: " + this.matricula + " - " + this.nombre;

	}

}
