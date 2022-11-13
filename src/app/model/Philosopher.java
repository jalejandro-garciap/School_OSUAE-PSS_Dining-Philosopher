package app.model;

import java.awt.Color;
import java.util.Random;
import javax.swing.JLabel;
import javax.swing.JTextField;

import app.model.Philosopher;
import app.view.Control;

/**
 * Hilo Filósofo: se ejecuta de manera concurrente gestionados por monitores ,
 * La finalidad del programa es crear un algoritmo que permita que los filósofos
 * coman y piensen, para ello, el problema se resuelve que siempre haya un
 * filósofo como mínimo comiendo, lo ideal que haya dos. El algoritmo tiene un
 * recurso compartido {@link Handler} el cual deja pasar a n-1
 * filósofos y después otro recurso {@link Fork} que es necesario tener por
 * duplicado para que cada filósofo pueda comer. Además el algoritmo se completa
 * creando una regla en la que si un filósofo no consigue el segundo tenedor en
 * x tiempo aleatorio, éste debe abandonar su turno de comida, salir y ponerse a
 * la cola.
 * 
 */

public class Philosopher extends Thread {
	// Variable para generar números aleatorios:
	private Random random = new Random();
	// Variable para la ID del Filósofo:
	private int id;
	// Variables para los tenedores:
	private Fork left, right;
	// Variable para el comensal:
	private Handler diner;
	// Variables para los elementos gráficos:
	private JLabel jLabel_P, jLabel_F_right, jLabel_F_left;
	private JTextField jTextField_counter; // Contador de comidas
	// Variable pública y estática para que se pueda detener el método run() de esta clase:
	public static boolean finished = false;

	/**
	 * Esta clase pone en marcha los hilos Filósofos Método run() del Thread
	 * 
	 * @param id             		ID del Filósofo
	 * @param left           		Tenedor
	 * @param right          		Tenedor
	 * @param diner		     		Turno para comer
	 * @param jLabel_P   			Elementos gráficos
	 * @param jLabel_F_right		Elementos gráficos
	 * @param jLabel_F_left 		Elementos gráficos
	 * @param jTextField_counter	Contador de comidas
	 */
	
	public Philosopher(int id, Fork rigth, Fork left, Handler diner, JLabel jLabel_P,
			JLabel jLabel_F_right, JLabel jLabel_F_left, JTextField jTextField_C) {
		this.id = id;
		this.right = rigth;
		this.left = left;
		this.diner = diner;
		this.jLabel_P = jLabel_P;
		this.jLabel_F_right = jLabel_F_right;
		this.jLabel_F_left = jLabel_F_left;
		this.jTextField_counter = jTextField_C;
	}


	@Override
	public void run() {
		while (true) { 
			try { 				
				// Obtener el comensal para poder comer:
				diner.takeDiner(id);
				this.jLabel_P.setBackground(Color.PINK); // Componente gráfico
				// Obtener el Tenedor Derecho:
				right.takeFork(id);
				this.jLabel_P.setBackground(Color.CYAN); // Componente gráfico
				this.jLabel_F_right.setBackground(Color.BLUE); // Componente gráfico
				// Obtener el Tenedor Izquierdo:
				if (!left.takeLeftFork(id)) {
					// Si no se consigue el izquierdo: el filósofo tendra que volver a casilla de
					// salida y volver a obtener el comensal:
					System.out.println("El Filósofo " + (id + 1) + " tendrá que soltar el tenedor " + (id + 1)
							+ " por exceso de tiempo y salir a pensar.");
					// Siempre se valora si el log es distinto a null, si lo es se ecribe en la
					// interface gráfica:
					// Como no ha conseguido el Tenedor izquierdo suelta el derecho
					right.dropFork(id);
					this.jLabel_F_right.setBackground(Color.LIGHT_GRAY); // Componente gráfico
					// Como no ha conseguido el Tenedor izquierdo suelta el comensal
					diner.dropDiner(id);
					// Y ahora el Filósofo piensa *********************
					System.out.println("El Filósofo " + (id + 1) + " está pensando.");
					try {
						// El tiempo que tarda el filósofo en pensar, entre 1500 y 1000 milisegundos:
						Philosopher.sleep(random.nextInt(1000) + 1500);
					} catch (InterruptedException ex) {
						System.out.println("Error. Descripción: " + ex.toString());
					}
					// Fin de Ahora el Filósofo piensa *********************
					continue; // Se vuelve a poner en la casilla de salida y volver a obtener el comensal.
				}
				// Si ha conseguido el Tenedor Izquierdo. El filósofo sigue adelante:
				this.jLabel_F_left.setBackground(Color.BLUE); // Componente gráfico
				// Y ahora el Filósofo come
				this.jLabel_P.setBackground(Color.ORANGE); // Componente gráfico
				this.jLabel_P.setForeground(Color.BLUE); // Componente gráfico
				jTextField_counter.setText(" " + (++Control.philosopherCounter[id])); // Su contador de comidas incrementa una unidad.
				System.out.println("El Filósofo " + (id + 1) + " está comiendo.");
				// Simular el tiempo que tarda el filósofo en comer, entre 0.5 y 1 segundos:
				try {
					sleep(random.nextInt(1000) + 500);
				} catch (InterruptedException ex) {
					System.out.println("Error. Descripción: " + ex.toString());
				} // Fin de Simular el tiempo que tarda el filósofo en comer, entre 0.5 y 1
					// segundos
				this.jLabel_P.setBackground(Color.WHITE); // Componente gráfico
				this.jLabel_P.setForeground(Color.BLACK); // Componente gráfico
				// Fin de Ahora el Filósofo come
				// Suelta el Tenedor izquierdo:
				left.dropFork(id);
				this.jLabel_F_left.setBackground(Color.LIGHT_GRAY); // Componente gráfico
				// Suelta el Tenedor derecho:
				right.dropFork(id);
				this.jLabel_F_right.setBackground(Color.LIGHT_GRAY); // Componente gráfico
				// Suelta el comensal:
				diner.dropDiner(id);
				// Ahora el Filósofo piensa
				System.out.println("El Filósofo " + (id + 1) + " está pensando.");
				// El tiempo que tarda el filósofo en pensar, entre 100 y 1000 milisegundos:
				try {
					Philosopher.sleep(random.nextInt(1000) + 100);
				} catch (InterruptedException ex) {
					System.out.println("Error. Descripción: " + ex.toString());
				}
				// Fin de Ahora el Filósofo piensa
			} catch (InterruptedException ex) {
				ex.printStackTrace();
				System.err.println("Se ha producido un error. Descripción: " + ex.toString());
			}
			
			if (finished) { // Si se ha pulsado el botón en la interface de 'Pausar' (public static boolean finalizado = true):
				break; // Se sale
			}
			
			// Valida si los todos los filosofos ya comieron al menos 6 veces
			
			finished = true;
			
			for(int counter : Control.philosopherCounter) {
				if(counter < 6) {
					finished = false;
				}
			}
			
			if (finished) {
				break; // Se sale
			}
			

		} // Fin de Se repite infinitamente While


		System.out.println("La cena ha terminado para todos: El Filósofo " + (id + 1)
				+ " se ha puesto a pensar.\n\nPulsar Iniciar para continuar.\n\n");
	}
}
