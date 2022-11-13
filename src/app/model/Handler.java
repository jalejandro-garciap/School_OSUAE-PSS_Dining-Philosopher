package app.model;

/**
 * Recurso compratido por los hilos Filósofos, Se crea una única instancia con
 * n-1 comensales donde n es el número de filósofos
 * 
 */

public class Handler {
	private int diner = 4; // Es el número de comensales total de filósofos menos 1

	/**
	 * Monitor para coger un comensal de los 4 y poder seguir el proceso de
	 * ejecución de los filósofos.
	 * 
	 * @param id_f ID del fiósofo
	 * @throws InterruptedException Posibles errores
	 */

	public synchronized void takeDiner(int id_f) throws InterruptedException {
		while (diner == 0) { // Si no hay comensales libres toca esperar
			this.wait();
		}
		System.out.println("El Filósofo " + (id_f + 1) + " es el comensal " + diner);
		// Siempre se valora si el log es distinto a null, si lo es se ecribe en la
		// interface gráfica:
		diner--; // Conteo de comensales
	}

	/**
	 * Monitor para soltar un comensal de los 4 y poder seguir el proceso de
	 * ejecución de los filósofos.
	 * 
	 * @param id_f ID del fiósofo
	 * @throws InterruptedException Posibles errores
	 */

	public synchronized void dropDiner(int id_f) throws InterruptedException {
		diner++; // Conteo de comensales
		System.out.println("El Filósofo " + (id_f + 1) + " ya no es el comensal " + diner);
		// Siempre se valora si el log es distinto a null, si lo es se ecribe en la
		// interface gráfica:
		this.notify(); // Notificación al siguiente de que hay comensal disponible.
	}
}
