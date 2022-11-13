package app.view;

import static java.lang.Thread.sleep;

import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.GroupLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.LayoutStyle;
import javax.swing.SwingConstants;
import javax.swing.WindowConstants;

import app.model.Philosopher;
import app.service.Principal;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;

public class Process extends JFrame {

	private static final long serialVersionUID = 1L;
	
	private JButton jButton1;
	private JButton jButton_Finalizar;
	private JButton jButton_Iniciar;
	private JLabel jLabel1;
	private JLabel jLabel10;
	private JLabel jLabel11;
	private JLabel jLabel12;
	private JLabel jLabel13;
	private JLabel jLabel2;
	private JLabel jLabel3;
	private JLabel jLabel4;
	private JLabel jLabel5;
	private JLabel jLabel6;
	private JLabel jLabel7;
	private JLabel jLabel8;
	private JLabel jLabel9;
	private JLabel jLabel_Filo01;
	private JLabel jLabel_Filo02;
	private JLabel jLabel_Filo03;
	private JLabel jLabel_Filo04;
	private JLabel jLabel_Filo05;
	private JLabel jLabel_Ten01;
	private JLabel jLabel_Ten02;
	private JLabel jLabel_Ten03;
	private JLabel jLabel_Ten04;
	private JLabel jLabel_Ten05;
	private JLabel jLabel_est01;
	private JLabel jLabel_est02;
	private JLabel jLabel_est03;
	private JLabel jLabel_est04;
	private JLabel jLabel_est05;
	private JLabel jLabel_est06;
	private JPanel jPanel1;
	private JPanel jPanel2;
	private JPanel jPanel3;
	private JPanel jPanel4;
	private JPanel jPanel5;
	private JPanel jPanel6;
	private JPanel jPanel7;
	private JPanel jPanel8;
	private JTextField jTextField_Cont01;
	private JTextField jTextField_Cont02;
	private JTextField jTextField_Cont03;
	private JTextField jTextField_Cont04;
	private JTextField jTextField_Cont05;

	
    public Process() {
    	
    	this.setTitle("La Cena de los Filósofos");
        this.setSize(700, 600);
        this.setLocationRelativeTo(null); // para centrar la pantalla en la ventana
        Image icono = Toolkit.getDefaultToolkit().getImage("images/logo.png"); 
        this.setIconImage(icono);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    	
        initComponents();
        
        //Botón Finalizar:
        this.jButton_Finalizar.setEnabled(false);        
      
        // Contadores de Comida:
        this.jTextField_Cont01.setText(" 0");
        this.jTextField_Cont02.setText(" 0");
        this.jTextField_Cont03.setText(" 0");
        this.jTextField_Cont04.setText(" 0");
        this.jTextField_Cont05.setText(" 0");
        
        // Filósofos Configuración inicial:
        this.jLabel_Filo01.setOpaque(true);
        this.jLabel_Filo01.setBackground(Color.WHITE);
        this.jLabel_Filo02.setOpaque(true);
        this.jLabel_Filo02.setBackground(Color.WHITE);
        this.jLabel_Filo03.setOpaque(true);
        this.jLabel_Filo03.setBackground(Color.WHITE);
        this.jLabel_Filo04.setOpaque(true);
        this.jLabel_Filo04.setBackground(Color.WHITE);
        this.jLabel_Filo05.setOpaque(true);
        this.jLabel_Filo05.setBackground(Color.WHITE);
        
        // Tenedores Configuración inicial:
        this.jLabel_Ten01.setText("  1  ");
        this.jLabel_Ten01.setOpaque(true);
        this.jLabel_Ten01.setBackground(Color.LIGHT_GRAY);
        this.jLabel_Ten01.setForeground(Color.WHITE);
        
        this.jLabel_Ten02.setText("  2  ");
        this.jLabel_Ten02.setOpaque(true);
        this.jLabel_Ten02.setBackground(Color.LIGHT_GRAY);
        this.jLabel_Ten02.setForeground(Color.WHITE);
        
        this.jLabel_Ten03.setText("  3  ");
        this.jLabel_Ten03.setOpaque(true);
        this.jLabel_Ten03.setBackground(Color.LIGHT_GRAY);
        this.jLabel_Ten03.setForeground(Color.WHITE);
        
        this.jLabel_Ten04.setText("  4  ");
        this.jLabel_Ten04.setOpaque(true);
        this.jLabel_Ten04.setBackground(Color.LIGHT_GRAY);
        this.jLabel_Ten04.setForeground(Color.WHITE);
        
        this.jLabel_Ten05.setText("  5  ");
        this.jLabel_Ten05.setOpaque(true);
        this.jLabel_Ten05.setBackground(Color.LIGHT_GRAY);
        this.jLabel_Ten05.setForeground(Color.WHITE);
        
        // Leyenda de colores:
        this.jLabel_est01.setText("    ");
        this.jLabel_est01.setOpaque(true);
        this.jLabel_est01.setBackground(Color.PINK);
        
        this.jLabel_est02.setText("    ");
        this.jLabel_est02.setOpaque(true);
        this.jLabel_est02.setBackground(Color.CYAN);
        
        this.jLabel_est03.setText("    ");
        this.jLabel_est03.setOpaque(true);
        this.jLabel_est03.setBackground(Color.ORANGE);
        
        this.jLabel_est04.setText("    ");
        this.jLabel_est04.setOpaque(true);
        this.jLabel_est04.setBackground(Color.WHITE);
        
        this.jLabel_est05.setText("    ");
        this.jLabel_est05.setOpaque(true);
        this.jLabel_est05.setBackground(Color.BLUE);
        
        this.jLabel_est06.setText("    ");
        this.jLabel_est06.setOpaque(true);
        this.jLabel_est06.setBackground(Color.LIGHT_GRAY);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */

    private void initComponents() {

        jPanel1 = new JPanel();
        jPanel2 = new JPanel();
        jLabel_Filo01 = new JLabel();
        jLabel_Filo02 = new JLabel();
        jLabel_Filo03 = new JLabel();
        jLabel_Filo04 = new JLabel();
        jLabel_Filo05 = new JLabel();
        jPanel5 = new JPanel();
        jPanel6 = new JPanel();
        jLabel_est01 = new JLabel();
        jLabel_est02 = new JLabel();
        jLabel_est03 = new JLabel();
        jLabel_est05 = new JLabel();
        jLabel_est06 = new JLabel();
        jLabel_est04 = new JLabel();
        jPanel7 = new JPanel();
        jLabel6 = new JLabel();
        jLabel7 = new JLabel();
        jLabel8 = new JLabel();
        jLabel9 = new JLabel();
        jLabel10 = new JLabel();
        jLabel12 = new JLabel();
        jLabel11 = new JLabel();
        jLabel_Ten01 = new JLabel();
        jLabel_Ten02 = new JLabel();
        jLabel_Ten03 = new JLabel();
        jLabel_Ten04 = new JLabel();
        jLabel_Ten05 = new JLabel();
        jPanel4 = new JPanel();
        jPanel8 = new JPanel();
        jLabel1 = new JLabel();
        jLabel2 = new JLabel();
        jTextField_Cont01 = new JTextField();
        jLabel3 = new JLabel();
        jTextField_Cont02 = new JTextField();
        jTextField_Cont03 = new JTextField();
        jLabel4 = new JLabel();
        jLabel5 = new JLabel();
        jTextField_Cont04 = new JTextField();
        jTextField_Cont05 = new JTextField();
        jLabel13 = new JLabel();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBorder(BorderFactory.createTitledBorder(" La Cena de los Filósofos "));

        jLabel_Filo01.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel_Filo01.setHorizontalAlignment(SwingConstants.CENTER);
        jLabel_Filo01.setText("Filósofo 01");

        jLabel_Filo02.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel_Filo02.setHorizontalAlignment(SwingConstants.CENTER);
        jLabel_Filo02.setText("Filósofo 02");

        jLabel_Filo03.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel_Filo03.setHorizontalAlignment(SwingConstants.CENTER);
        jLabel_Filo03.setText("Filósofo 03");

        jLabel_Filo04.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel_Filo04.setHorizontalAlignment(SwingConstants.CENTER);
        jLabel_Filo04.setText("Filósofo 04");

        jLabel_Filo05.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel_Filo05.setHorizontalAlignment(SwingConstants.CENTER);
        jLabel_Filo05.setText("Filósofo 05");

        jLabel_est01.setText("jLabel1");

        jLabel_est02.setText("jLabel1");

        jLabel_est03.setText("jLabel1");

        jLabel_est05.setText("jLabel1");

        jLabel_est06.setText("jLabel1");

        jLabel_est04.setText("jLabel1");

        GroupLayout jPanel6Layout = new GroupLayout(jPanel6);
        jPanel6Layout.setHorizontalGroup(
        	jPanel6Layout.createParallelGroup(Alignment.TRAILING)
        		.addGroup(jPanel6Layout.createSequentialGroup()
        			.addGap(10)
        			.addGroup(jPanel6Layout.createParallelGroup(Alignment.TRAILING)
        				.addComponent(jLabel_est05)
        				.addComponent(jLabel_est06))
        			.addContainerGap())
        		.addGroup(Alignment.LEADING, jPanel6Layout.createSequentialGroup()
        			.addContainerGap()
        			.addComponent(jLabel_est04)
        			.addContainerGap(12, Short.MAX_VALUE))
        		.addGroup(Alignment.LEADING, jPanel6Layout.createSequentialGroup()
        			.addContainerGap()
        			.addComponent(jLabel_est03)
        			.addContainerGap(12, Short.MAX_VALUE))
        		.addGroup(Alignment.LEADING, jPanel6Layout.createSequentialGroup()
        			.addContainerGap()
        			.addComponent(jLabel_est01)
        			.addContainerGap(12, Short.MAX_VALUE))
        		.addGroup(Alignment.LEADING, jPanel6Layout.createSequentialGroup()
        			.addContainerGap()
        			.addComponent(jLabel_est02)
        			.addContainerGap(12, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
        	jPanel6Layout.createParallelGroup(Alignment.TRAILING)
        		.addGroup(jPanel6Layout.createSequentialGroup()
        			.addGap(18)
        			.addComponent(jLabel_est01)
        			.addGap(17)
        			.addComponent(jLabel_est02)
        			.addPreferredGap(ComponentPlacement.UNRELATED)
        			.addComponent(jLabel_est03)
        			.addGap(13)
        			.addComponent(jLabel_est04)
        			.addPreferredGap(ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
        			.addComponent(jLabel_est05)
        			.addPreferredGap(ComponentPlacement.UNRELATED)
        			.addComponent(jLabel_est06)
        			.addGap(9))
        );
        jPanel6.setLayout(jPanel6Layout);

        jLabel6.setText("Filósofo entra a comer");

        jLabel7.setText("Filósofo tiene un tenedor");

        jLabel8.setText("Filósofo está comiendo");

        jLabel9.setText("Tenedor ocupado");

        jLabel10.setText("Tenedor libre");

        jLabel12.setText("Filósofo está pensando");

        GroupLayout jPanel7Layout = new GroupLayout(jPanel7);
        jPanel7Layout.setHorizontalGroup(
        	jPanel7Layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
        			.addGroup(jPanel7Layout.createParallelGroup(Alignment.TRAILING)
        				.addComponent(jLabel12, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE)
        				.addComponent(jLabel6, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE)
        				.addComponent(jLabel7, GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE)
        				.addComponent(jLabel8, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE)
        				.addComponent(jLabel9, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE)
        				.addComponent(jLabel10, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE))
        			.addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
        	jPanel7Layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(jPanel7Layout.createSequentialGroup()
        			.addContainerGap()
        			.addComponent(jLabel6, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addComponent(jLabel7, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addComponent(jLabel8, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
        			.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        			.addComponent(jLabel12)
        			.addGap(27)
        			.addComponent(jLabel9, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addComponent(jLabel10, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE))
        );
        jPanel7.setLayout(jPanel7Layout);

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setText("Código de colores:");

        GroupLayout jPanel5Layout = new GroupLayout(jPanel5);
        jPanel5Layout.setHorizontalGroup(
        	jPanel5Layout.createParallelGroup(Alignment.TRAILING)
        		.addGroup(Alignment.LEADING, jPanel5Layout.createSequentialGroup()
        			.addContainerGap()
        			.addGroup(jPanel5Layout.createParallelGroup(Alignment.LEADING)
        				.addComponent(jLabel11, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
        				.addGroup(jPanel5Layout.createSequentialGroup()
        					.addComponent(jPanel6, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        					.addPreferredGap(ComponentPlacement.UNRELATED)
        					.addComponent(jPanel7, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        			.addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
        	jPanel5Layout.createParallelGroup(Alignment.TRAILING)
        		.addGroup(jPanel5Layout.createSequentialGroup()
        			.addGap(47)
        			.addComponent(jLabel11, GroupLayout.PREFERRED_SIZE, 51, GroupLayout.PREFERRED_SIZE)
        			.addPreferredGap(ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
        			.addGroup(jPanel5Layout.createParallelGroup(Alignment.LEADING, false)
        				.addComponent(jPanel7, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        				.addComponent(jPanel6, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel5.setLayout(jPanel5Layout);

        jLabel_Ten01.setText("jLabel1");

        jLabel_Ten02.setText("jLabel2");

        jLabel_Ten03.setText("jLabel3");

        jLabel_Ten04.setText("jLabel4");

        jLabel_Ten05.setText("jLabel5");
        
        ImageIcon imageIcon = new ImageIcon(new ImageIcon("images/table.png").getImage().getScaledInstance(250, 250, Image.SCALE_DEFAULT));
        JLabel roundTable = new JLabel();		
		roundTable.setIcon(imageIcon);			
		roundTable.setHorizontalTextPosition(JLabel.CENTER);
		roundTable.setVerticalTextPosition(JLabel.CENTER);
			
        GroupLayout jPanel2Layout = new GroupLayout(jPanel2);
        jPanel2Layout.setHorizontalGroup(
        	jPanel2Layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(jPanel2Layout.createSequentialGroup()
        			.addGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING)
        				.addGroup(jPanel2Layout.createSequentialGroup()
        					.addGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING)
        						.addGroup(jPanel2Layout.createSequentialGroup()
        							.addContainerGap()
        							.addComponent(jLabel_Filo05, GroupLayout.PREFERRED_SIZE, 112, GroupLayout.PREFERRED_SIZE)
        							.addGap(13)
        							.addComponent(jLabel_Ten05))
        						.addGroup(jPanel2Layout.createSequentialGroup()
        							.addGap(51)
        							.addComponent(jLabel_Filo01, GroupLayout.PREFERRED_SIZE, 112, GroupLayout.PREFERRED_SIZE)))
        					.addPreferredGap(ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
        					.addGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING)
        						.addComponent(jLabel_Filo04, GroupLayout.PREFERRED_SIZE, 112, GroupLayout.PREFERRED_SIZE)
        						.addGroup(jPanel2Layout.createSequentialGroup()
        							.addGap(4)
        							.addGroup(jPanel2Layout.createParallelGroup(Alignment.TRAILING)
        								.addComponent(jLabel_Ten01)
        								.addComponent(roundTable))
        							.addGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING)
        								.addGroup(jPanel2Layout.createSequentialGroup()
        									.addGap(26)
        									.addComponent(jLabel_Ten03)
        									.addGap(18)
        									.addComponent(jLabel_Filo03, GroupLayout.PREFERRED_SIZE, 112, GroupLayout.PREFERRED_SIZE))
        								.addGroup(jPanel2Layout.createSequentialGroup()
        									.addGap(64)
        									.addGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING)
        										.addComponent(jLabel_Filo02, GroupLayout.PREFERRED_SIZE, 112, GroupLayout.PREFERRED_SIZE)
        										.addComponent(jLabel_Ten02)))))))
        				.addGroup(jPanel2Layout.createSequentialGroup()
        					.addGap(211)
        					.addComponent(jLabel_Ten04)))
        			.addGap(46)
        			.addComponent(jPanel5, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
        	jPanel2Layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(jPanel2Layout.createSequentialGroup()
        			.addGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING)
        				.addComponent(jPanel5, GroupLayout.PREFERRED_SIZE, 304, GroupLayout.PREFERRED_SIZE)
        				.addGroup(jPanel2Layout.createSequentialGroup()
        					.addGap(19)
        					.addGroup(jPanel2Layout.createParallelGroup(Alignment.TRAILING)
        						.addGroup(jPanel2Layout.createSequentialGroup()
        							.addComponent(jLabel_Filo01, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
        							.addGap(28))
        						.addGroup(jPanel2Layout.createSequentialGroup()
        							.addGroup(jPanel2Layout.createParallelGroup(Alignment.BASELINE)
        								.addComponent(jLabel_Filo02, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
        								.addComponent(jLabel_Ten01))
        							.addPreferredGap(ComponentPlacement.RELATED)))
        					.addGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING)
        						.addGroup(jPanel2Layout.createSequentialGroup()
        							.addGap(45)
        							.addGroup(jPanel2Layout.createParallelGroup(Alignment.BASELINE)
        								.addComponent(jLabel_Ten03)
        								.addComponent(jLabel_Filo03, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
        								.addComponent(jLabel_Ten05)
        								.addComponent(jLabel_Filo05, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
        								.addComponent(roundTable)))
        						.addComponent(jLabel_Ten02))
        					.addGap(33)
        					.addComponent(jLabel_Ten04)
        					.addGap(36)
        					.addComponent(jLabel_Filo04, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)))
        			.addContainerGap(50, Short.MAX_VALUE))
        );
        jPanel2.setLayout(jPanel2Layout);

        jLabel1.setText("Cuántas veces han comido:");

        jLabel2.setText("Filósofo 1:");

        jTextField_Cont01.setText("jTextField1");

        jLabel3.setText("Filósofo 2:");

        jTextField_Cont02.setText("jTextField1");

        jLabel4.setText("Filósofo 3:");

        jTextField_Cont03.setText("jTextField1");
        
        jLabel5.setText("Filósofo 4:");

        jTextField_Cont04.setText("jTextField1");

        jLabel13.setText("Filósofo 5:");
        
        jTextField_Cont05.setText("jTextField1");

        GroupLayout jPanel8Layout = new GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 24, Short.MAX_VALUE))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField_Cont01))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField_Cont02))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField_Cont03))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField_Cont04))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField_Cont05)))
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel8Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField_Cont01, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextField_Cont02, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextField_Cont03, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTextField_Cont04, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(jTextField_Cont05, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22))
        );
        jPanel3 = new JPanel();
        jButton_Iniciar = new JButton();
        jButton_Finalizar = new JButton();
        jButton1 = new JButton();
        
                jPanel3.setBorder(BorderFactory.createTitledBorder(" Controles "));
                
                        jButton_Iniciar.setText("Iniciar");
                        jButton_Iniciar.addActionListener(new java.awt.event.ActionListener() {
                            public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jButtonStartActionPerformed(evt);
                            }
                        });
                        
                                jButton_Finalizar.setText("Pausar");
                                jButton_Finalizar.addActionListener(new java.awt.event.ActionListener() {
                                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                                        jButtonFinishActionPerformed(evt);
                                    }
                                });
                                
                                        jButton1.setText("Salir");
                                        jButton1.addActionListener(new java.awt.event.ActionListener() {
                                            public void actionPerformed(java.awt.event.ActionEvent evt) {
                                                jButtonExitActionPerformed(evt);
                                            }
                                        });
                                        
                                                GroupLayout jPanel3Layout = new GroupLayout(jPanel3);
                                                jPanel3Layout.setHorizontalGroup(
                                                	jPanel3Layout.createParallelGroup(Alignment.TRAILING)
                                                		.addGroup(jPanel3Layout.createSequentialGroup()
                                                			.addContainerGap(24, Short.MAX_VALUE)
                                                			.addGroup(jPanel3Layout.createParallelGroup(Alignment.LEADING)
                                                				.addComponent(jButton1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                				.addGroup(Alignment.TRAILING, jPanel3Layout.createParallelGroup(Alignment.LEADING, false)
                                                					.addComponent(jButton_Iniciar, GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE)
                                                					.addComponent(jButton_Finalizar, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                                			.addContainerGap())
                                                );
                                                jPanel3Layout.setVerticalGroup(
                                                	jPanel3Layout.createParallelGroup(Alignment.LEADING)
                                                		.addGroup(jPanel3Layout.createSequentialGroup()
                                                			.addGap(20)
                                                			.addComponent(jButton_Iniciar, GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                                                			.addPreferredGap(ComponentPlacement.RELATED)
                                                			.addComponent(jButton_Finalizar, GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                                                			.addGap(48)
                                                			.addComponent(jButton1, GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                                                			.addGap(19))
                                                );
                                                jPanel3.setLayout(jPanel3Layout);

        GroupLayout jPanel4Layout = new GroupLayout(jPanel4);
        jPanel4Layout.setHorizontalGroup(
        	jPanel4Layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
        			.addContainerGap()
        			.addComponent(jPanel8, GroupLayout.PREFERRED_SIZE, 185, GroupLayout.PREFERRED_SIZE)
        			.addPreferredGap(ComponentPlacement.RELATED, 259, Short.MAX_VALUE)
        			.addComponent(jPanel3, GroupLayout.PREFERRED_SIZE, 204, GroupLayout.PREFERRED_SIZE)
        			.addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
        	jPanel4Layout.createParallelGroup(Alignment.TRAILING)
        		.addGroup(jPanel4Layout.createSequentialGroup()
        			.addContainerGap()
        			.addGroup(jPanel4Layout.createParallelGroup(Alignment.TRAILING)
        				.addComponent(jPanel8, GroupLayout.DEFAULT_SIZE, 211, Short.MAX_VALUE)
        				.addComponent(jPanel3, GroupLayout.DEFAULT_SIZE, 211, Short.MAX_VALUE))
        			.addContainerGap())
        );
        jPanel4.setLayout(jPanel4Layout);

        GroupLayout jPanel1Layout = new GroupLayout(jPanel1);
        jPanel1Layout.setHorizontalGroup(
        	jPanel1Layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
        			.addContainerGap()
        			.addGroup(jPanel1Layout.createParallelGroup(Alignment.TRAILING)
        				.addComponent(jPanel2, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 668, Short.MAX_VALUE)
        				.addComponent(jPanel4, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        			.addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
        	jPanel1Layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(jPanel1Layout.createSequentialGroup()
        			.addContainerGap()
        			.addComponent(jPanel2, GroupLayout.PREFERRED_SIZE, 366, GroupLayout.PREFERRED_SIZE)
        			.addGap(18)
        			.addComponent(jPanel4, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        			.addContainerGap())
        );
        jPanel1.setLayout(jPanel1Layout);

        GroupLayout layout = new GroupLayout(getContentPane());
        layout.setHorizontalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addContainerGap()
        			.addComponent(jPanel1, GroupLayout.DEFAULT_SIZE, 688, Short.MAX_VALUE)
        			.addContainerGap())
        );
        layout.setVerticalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addContainerGap()
        			.addComponent(jPanel1, GroupLayout.DEFAULT_SIZE, 639, Short.MAX_VALUE)
        			.addContainerGap())
        );
        getContentPane().setLayout(layout);

        pack();
    }

    /**
     * Dispara la ejecución del programa
     * @param evt Recibe el evento de hacer click sobre el botón
     */
    
    private void jButtonStartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_IniciarActionPerformed
        Philosopher.finished = false; // Para poder pausar o reiniciar.
                
        // Clase que contiene todos los objetos de la interface y que sera pasada por parámetro a la clase principal
        Control control = new Control(jLabel_Filo01, jLabel_Filo02, jLabel_Filo03, jLabel_Filo04, jLabel_Filo05, 
            jLabel_Ten01, jLabel_Ten02, jLabel_Ten03, jLabel_Ten04, jLabel_Ten05,
            jTextField_Cont01, jTextField_Cont02, jTextField_Cont03, jTextField_Cont04, jTextField_Cont05); 

        // Clase Principal con la lógica del programa:
        // Recibe por parámetro la clase Clase10Control que contiene todos los elemntos de la interface
        @SuppressWarnings("unused")
		Principal principal = new Principal(control);
        
        this.jButton_Finalizar.setEnabled(true);
        this.jButton_Iniciar.setEnabled(false);

    }

    /**
     * Dispara la pausa de la ejecución
     * @param evt Recibe el evento de hacer click sobre el botón
     */
    
    private void jButtonFinishActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_FinalizarActionPerformed
        Philosopher.finished = true;
        try {
            sleep(3000);
        } catch (InterruptedException ex) {
            System.out.println("Error. Descripción: " + ex.toString());
        }
        this.jButton_Iniciar.setEnabled(true);
        this.jButton_Finalizar.setEnabled(false);
    }


    private void jButtonExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        System.exit(0);
    }
}
