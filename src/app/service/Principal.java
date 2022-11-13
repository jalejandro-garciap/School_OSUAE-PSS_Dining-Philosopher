
package app.service;

import javax.swing.JLabel;
import javax.swing.JTextField;

import app.model.Philosopher;
import app.model.Handler;
import app.model.Fork;
import app.view.Control;

/**
 * Esta clase genera las instancias de los 5 hilos Filósofos {@link Philosopher} ,
 * Estos 5 hilos se ejecutan de manera concurrente gestionados por monitores ,
 * La finalidad del programa es crear un algoritmo que permita que los filósofos coman y piensen,
 * para ello, el problema se resuelve que siempre haya un filósofo como mínimo comiendo,
 * lo ideal que haya dos. 
 * El algoritmo tiene un recurso compartido {@link Handler} el cual deja pasar a
 * n-1 filósofos y después otro recurso {@link Fork} que es necesario tener por duplicado para
 * que cada filósofo pueda comer. Además el algoritmo se completa creando una regla en la que si un
 * filósofo no consigue el segundo tenedor en x tiempo aleatorio, éste debe abandonar su turno de comida,
 * salir y ponerse a la cola.
 * Además si se selecciona crear un Log en el área de texto de la interface gráfica {@link Vista10Control}
 * todos los hilos de manera concurrente tendran que ir escribiendo en el log sus acciones, con lo cual 
 * puede relentizar un poco la ejecución del programa.
 * 
 */

public class Principal {
    
    private JLabel[] jLabel_P = new JLabel[5];
    private JLabel[] jLabel_F = new JLabel[5];
    private JTextField[] jTextField_C = new JTextField[5];

    /**
     * Se generan las instancias de 5 de {@link Philosopher}, 5 {@link Fork}, 
     * una de {@link Handler} y se ponen en funcionamiento los hilos filósofos.
     * 
     * @param control Contiene todos los elemnetos de la interface gráfica
     */
    
    public Principal(Control control) { 
    	
        this.jLabel_P = control.getjLabel_F();
        this.jLabel_F = control.getjLabel_T();
        this.jTextField_C = control.getjTextField_C(); 
        
        // Se crea el Array para contener las 5 instancias de Tenedores:
        Fork[] fork = new Fork[5];
        // Se crea el Array para contener las 5 instancias de Filósofos:
        Philosopher[] philosopher = new Philosopher[5];
        // Se crea una sola instancia de Portero_del_Comedor:
        Handler diner = new Handler();
        
        // Se crean las 5 instancias de Tenedores:
        for(int i=0; i<fork.length; i++){
            fork[i] = new Fork(i);
        }
        
        // Se crean las 5 instancias de Filósofos:
        for(int i=0; i<philosopher.length; i++){
            /* El filósofo coge el tenedor de la izquierda 
            *  y el de la derecha se contabiliza con el módulo(%)
            *  porque cuando llega a cuatro el siguiente es cero
            */
            // Ahora al filósofo se le pasa: un ID, un tenedor Dercho, un tenedor Izdo, el comensal, los componentes gráficos correspondientes y un log
            philosopher[i] = new Philosopher(i, fork[i], fork[(i+1)%5], diner, jLabel_P[i], jLabel_F[i], jLabel_F[(i+1)%5], jTextField_C[i]);
        }
        
        // Se echa a andar todos los Filósofos:
        for(int i=0; i<philosopher.length; i++){
            philosopher[i].start();
        }
    }

    
}
