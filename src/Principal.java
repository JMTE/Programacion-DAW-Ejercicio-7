

import itt.clases.escuela.Alumno;

import javax.swing.JOptionPane;//importamos el paquete swing para hacer las preguntas de las notas

/*Aquí estamos en nuestra clase principal, en ella llevaremos a cabo todas las especificaciones
 * que se nos piden en el enunciado del ejercicio.
 */
public class Principal {

	public static void main(String[] args) {

		try {/*
			 * Creamos un bloque try/catch para protegernos de que a la hora de
			 * introducir notas el usuario meta una cadena y nos tire el
			 * programa con un error, de esta manera, salimos del programa con
			 * un mensaje de informacion
			 */

			/*
			 * A continuación creamos una referencia al objeto Alumno y le
			 * pasamos los parametros necesarios para ese contructor
			 */
			Alumno a1 = new Alumno("Jose Maria Tenreiro", 12183);

			/*
			 * Me creo un array de String llamado asignaturas y defino 6
			 * asignaturas a las cuales tendremos que introducir notas.
			 */
			String[] asignaturas = new String[] { "Matemáticas", "Física",
					"Química", "Música", "Inglés", "Historia" };
			/*
			 * Y aquí declaro un array de enteros, que será el que guarde las
			 * calificaciones en su posicion. Nos sirve para introducir notas
			 * hasta que se llegue a la ultima materia. Con estos dos arrays
			 * buscamos introducir las 6 notas de 6 asignaturas y llamar de cada
			 * vez al metodo calificar.
			 */
			int[] notas_introducir = new int[6];
			// Con el siguiente bucle for, recorremos el array de enteros para
			// pedir las 6 notas
			for (int i = 0; i < notas_introducir.length; i++) {
				boolean nota_correcta = true;
				do {/*
					 * Con el bucle do-while lo que busco es que no se
					 * introduzca una nota mayor de 100 o menor de cero Si esto
					 * sucede, nos lanza un mensaje de error y no sale del bucle
					 */
					/*
					 * Como es un bucle do-while, primero ejecuta y despues
					 * comprueba, asi que la primera vez ya nos pide que
					 * introduzcamos la primera nota. Como los dos arrays que
					 * declaramos antes, tienen el mismo numero de elementos,
					 * los recorremos a la vez con el bucle for ,por lo tanto,
					 * la primera nota introducida, sera para el primer elemento
					 * del array String definido anteriormente y asi
					 * sucesivamente
					 */
					notas_introducir[i] = Integer.parseInt(JOptionPane
							.showInputDialog("Introduce la nota de "
									+ asignaturas[i] + "\nVALOR DE A 0 A 100"));

					if (notas_introducir[i] < 0 || notas_introducir[i] > 100) {/*Aqui es
					donde analizamos si la nota introducida es correcta*/
						nota_correcta = false;
						JOptionPane
								.showMessageDialog(null,
										"LA NOTA DEBE DE SER ENTRE 0 y 100 \n Introduce una nota válida");
					} else {
						/*
						 * Si la nota es correcta, llamamos al metodo calificar
						 * y le introducimos esos valores de la posicion
						 * correspondiente de nuestros array String e Int.
						 * Despues ponemos nota_correcta a true para salir del
						 * bucle y pedir otra nota y volver a analizar si el
						 * numero introducido es correcto o no.
						 */
						a1.calificar(asignaturas[i], notas_introducir[i]);
						nota_correcta = true;
					}

				} while (!nota_correcta);

			}//FIN DEL BUCLE FOR

			/*
			 * Cuando hemos salido del bucle for, ya hemos llamado a nuestro
			 * metodo calificar las veces que tiene de tamaño nuestros arrays
			 * String e Int, en este caso 6 veces, que serán 6 calificaciones
			 * con sus materias correspondientes. A su vez, el metodo Calificar
			 * en la clase Alumno, ha ido introduciendo estos objetos
			 * Calificacion en un arrayList Por lo tanto a continuacion, solo
			 * tenemos que mostrar estos datos por pantalla
			 */

			int suma_Notas = 0;// Como se nos pide la nota media de las
								// calificaciones, tenemos que definir un
								// sumatorio de sumas
			System.out.println(a1.toString());/*
											 * De principio, imprimimos la
											 * información de nuestro Alumno
											 * mediante el llamamiento al metodo
											 * toString
											 */

			/*
			 * A continuacion, vamos a recorrer nuestro ArrayList con el
			 * llamamiento al metodo getter del ArrayList. En el bucle for le
			 * indicamos que recorra los componenentes de este objeto desde el
			 * indice cero hasta el ultimo indice del objeto.
			 */
			for (int i = 0; i < a1.dame_todoArrayList().size(); i++) {
				/*
				 * Cada elemento del ArrayList lo imprimimos en pantalla,
				 * recordemos que cada elemento es un objeto del tipo
				 * Calificacion que tiene dos atributos materia y nota.
				 */
				System.out.println(a1.dame_todoArrayList().get(i));/* Con el
				 get(i) mostramos el elemento de esa  posicion  /*
				 
				 
				 * Y a cada elemento que recorremos nos vamos a quedar con el
				 * valor de su nota, para añadirlo al sumatorio de las notas
				 * para despues calcular la media. Eso lo podemos hacer mediante
				 * el metodo getter de dame_Nota.
				 */
				suma_Notas = suma_Notas
						+ a1.dame_todoArrayList().get(i).dame_Nota();
			}
			/*
			 * Aqui ya hemos recorrido e imprimido todo nuestro objeto ArrayList
			 * mediante el el llamamiento al metodo getter y ya podemos calcular
			 * la media de las notas Podriamos dividir entre 6 porque conocemos
			 * el numero de datos que hemos introducido, pero creo que es una
			 * forma mas correcta hacerlo con el tamaño del arrayList
			 */
			System.out.println("NOTA MEDIA: " + suma_Notas
					/ a1.dame_todoArrayList().size());

		} catch (NumberFormatException error) {// Este es el mensaje de error de
												// la excepcion si introducimos
												// letras en vez de numeros en
												// las notas
			JOptionPane.showMessageDialog(null,
					"Has introducido letras, vuelve a empezar");
		}
	}

}
