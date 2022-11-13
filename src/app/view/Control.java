
package app.view;

import javax.swing.JLabel;
import javax.swing.JTextField;

import app.view.Control;

/**
 * Esta clase contiene todos los elementos de la Interface Gráfica para que
 * puedan ser manejados desde las otras clases del programa.
 * 
 */

public class Control {
  
	// Se crean los arrays de elementos y los elementos:
    private JLabel[] jLabel_P = new JLabel[5];
    private JLabel[] jLabel_F = new JLabel[5];
    private JTextField[] jTextField_C = new JTextField[5];
    public static int[] philosopherCounter = new int[5];

    /**
     * 
     * @param jLabel_P_01 Filósofo
     * @param jLabel_P_02 Filósofo
     * @param jLabel_P_03 Filósofo
     * @param jLabel_P_04 Filósofo
     * @param jLabel_P_05 Filósofo
     * @param jLabel_F_01 Tenedor
     * @param jLabel_F_02 Tenedor
     * @param jLabel_F_03 Tenedor
     * @param jLabel_F_04 Tenedor
     * @param jLabel_F_05 Tenedor
     * @param jTextField_C_01 Contadores
     * @param jTextField_C_02 Contadores
     * @param jTextField_C_03 Contadores
     * @param jTextField_C_04 Contadores
     * @param jTextField_C_05  Contadores
     */
    
    public Control(JLabel jLabel_P_01, JLabel jLabel_P_02, JLabel jLabel_P_03, JLabel jLabel_P_04, JLabel jLabel_P_05, 
            JLabel jLabel_F_01, JLabel jLabel_F_02, JLabel jLabel_F_03, JLabel jLabel_F_04, JLabel jLabel_F_05,
            JTextField jTextField_C_01, JTextField jTextField_C_02, JTextField jTextField_C_03, JTextField jTextField_C_04, JTextField jTextField_C_05) {

        // Se asignan los valores a las variables:
        this.jLabel_P[0] = jLabel_P_01;
        this.jLabel_P[1] = jLabel_P_02;
        this.jLabel_P[2] = jLabel_P_03;
        this.jLabel_P[3] = jLabel_P_04;
        this.jLabel_P[4] = jLabel_P_05;
        
        this.jLabel_F[0] = jLabel_F_01;
        this.jLabel_F[1] = jLabel_F_02;
        this.jLabel_F[2] = jLabel_F_03;
        this.jLabel_F[3] = jLabel_F_04;
        this.jLabel_F[4] = jLabel_F_05;
        
        this.jTextField_C[0] = jTextField_C_01;
        this.jTextField_C[1] = jTextField_C_02;
        this.jTextField_C[2] = jTextField_C_03;
        this.jTextField_C[3] = jTextField_C_04;
        this.jTextField_C[4] = jTextField_C_05;

        Control.philosopherCounter[0] = 0;
        Control.philosopherCounter[1] = 0;
        Control.philosopherCounter[2] = 0;
        Control.philosopherCounter[3] = 0;
        Control.philosopherCounter[4] = 0;

    }

    // Getters
    
    public JLabel[] getjLabel_F() {
        return jLabel_P;
    }
    
    public JLabel[] getjLabel_T() {
        return jLabel_F;
    }

    public JTextField[] getjTextField_C() {
        return jTextField_C;
    }
}
