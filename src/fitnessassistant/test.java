package fitnessassistant;

import java.awt.Color;
import static javax.swing.JOptionPane.YES_NO_OPTION;

import javax.swing.JOptionPane;
import javax.swing.SwingConstants;

/**
 *
 * @author Jonnathan Salinas
 * @category Expertos Sistem
 * @Date 12/13/2017
 */

public class test extends javax.swing.JFrame {

	/**
	 * Creates new form formularioSE
	 */
	public test() {
		initComponents();
		setTitle("Expert System to Diagnosis of Diseases");
		setResizable(false);
		this.setLocationRelativeTo(null);
		texto.setEditable(false);
	}

	@SuppressWarnings("unchecked")
	// <editor-fold defaultstate="collapsed" desc="Generated
	// Code">//GEN-BEGIN:initComponents
	private void initComponents() {

		jPanel1 = new javax.swing.JPanel();
		jLabel1 = new javax.swing.JLabel();
		jLabel2 = new javax.swing.JLabel();
		jLabel4 = new javax.swing.JLabel();
		jLabel5 = new javax.swing.JLabel();
		jPanel2 = new javax.swing.JPanel();
		jButton1 = new javax.swing.JButton();
		jScrollPane1 = new javax.swing.JScrollPane();
		texto = new javax.swing.JTextArea();
		jLabel6 = new javax.swing.JLabel();
		jLabel3 = new javax.swing.JLabel();
		jLabel7 = new javax.swing.JLabel();
		jLabel8 = new javax.swing.JLabel();
		jButton2 = new javax.swing.JButton();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
                setPreferredSize(new java.awt.Dimension(700, 500));
		jPanel1.setBackground(new java.awt.Color(50, 205, 50));
		jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED,
				java.awt.Color.white, java.awt.Color.gray));

		jLabel1.setFont(new java.awt.Font("Eras Demi ITC", 0, 30)); // NOI18N
		jLabel1.setText("Welcome to VAFT");
                jLabel1.setForeground(Color.white);

		jLabel2.setFont(new java.awt.Font("Freestyle Script", 0, 17)); // NOI18N
		jLabel2.setText("Virtual Assistant for Fitness");
                jLabel2.setForeground(Color.white);
                jLabel2.setHorizontalAlignment(SwingConstants.CENTER);

		 jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/doc.png"))); // NOI18N

		jLabel5.setFont(new java.awt.Font("Freestyle Script", 0, 17)); // NOI18N
		jLabel5.setText("Training");
                jLabel5.setForeground(Color.white);
                jLabel5.setHorizontalAlignment(SwingConstants.CENTER);

		javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
		jPanel1.setLayout(jPanel1Layout);
		jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
						jPanel1Layout.createSequentialGroup().addGap(27, 27, 27)
								.addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 142,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addGap(18, 18, 18)
								.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
										.addComponent(jLabel1,
												javax.swing.GroupLayout.PREFERRED_SIZE, 272,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addGroup(jPanel1Layout.createSequentialGroup().addGap(12, 12, 12)
												.addGroup(jPanel1Layout
														.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
														.addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE,
																198, javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE,
																243, javax.swing.GroupLayout.PREFERRED_SIZE))))
								.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
		jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel1Layout.createSequentialGroup().addContainerGap()
						.addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addContainerGap())
				.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
						.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE).addComponent(jLabel1)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(jLabel2)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(jLabel5)
						.addGap(36, 36, 36)));

		jPanel2.setBackground(new java.awt.Color(51, 204, 255));
		jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED,
				java.awt.Color.white, java.awt.Color.gray));

		jButton1.setText("Empezar Examen");
		jButton1.setToolTipText("Clic para comenzar el examen");
		jButton1.addActionListener(new java.awt.event.ActionListener() {
			@Override
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton1ActionPerformed(evt);
			}
		});

		texto.setColumns(20);
		texto.setRows(5);
		jScrollPane1.setViewportView(texto);
                jLabel7.setText("hkefbekfbwei");

		jLabel8.setText("");
                jLabel6.setFont(new java.awt.Font("Freestyle Script", 0, 17));
		jLabel6.setText("Answer the following questions to give you ");
                jLabel3.setFont(new java.awt.Font("Freestyle Script", 0, 17));
		jLabel3.setText("the best fitness training plan");

		

		jButton2.setText("Salir");
		jButton2.setToolTipText("Clic para salir");
		jButton2.addActionListener(new java.awt.event.ActionListener() {
			@Override
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton2ActionPerformed(evt);
			}
		});

		javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
		jPanel2.setLayout(jPanel2Layout);
		jPanel2Layout.setHorizontalGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
						.addContainerGap()
						.addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 227, Short.MAX_VALUE)
								.addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addGroup(jPanel2Layout.createSequentialGroup().addComponent(jButton1)
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(jButton2)))
						.addGap(3, 3, 3).addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 265,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addContainerGap()));
		jPanel2Layout.setVerticalGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
						jPanel2Layout.createSequentialGroup().addContainerGap()
								.addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
										.addGroup(jPanel2Layout.createSequentialGroup().addGap(6, 6, 6)
												.addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 18,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
												.addComponent(jLabel3)
												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
												.addComponent(jLabel7)
												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
												.addComponent(jLabel8)
												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38,
														Short.MAX_VALUE)
												.addGroup(jPanel2Layout
														.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(jButton1).addComponent(jButton2)))
										.addComponent(jScrollPane1))
								.addContainerGap()));

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
						Short.MAX_VALUE)
				.addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
						Short.MAX_VALUE));
		layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(layout.createSequentialGroup()
						.addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(jPanel2,
								javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
								Short.MAX_VALUE)));

		pack();
	}// </editor-fold>//GEN-END:initComponents

	private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton1ActionPerformed
		int u, d, t;

		u = JOptionPane.showConfirmDialog(rootPane, "¿Usted presenta orina constante?", null, YES_NO_OPTION);

		if (u == 0) {
			diabetes();
		} else if (u == 1) {
			d = JOptionPane.showConfirmDialog(rootPane, "¿Usted presenta ardor en el estomago?", null, YES_NO_OPTION);
			if (d == 0) {
				gastritis();
			} else if (d == 1) {
				t = JOptionPane.showConfirmDialog(rootPane, "¿Usted presenta hinchazon en extremidades?", null,
						YES_NO_OPTION);
				if (t == 0) {
					colesterol();
				} else if (t == 1) {
					JOptionPane.showMessageDialog(rootPane, "Usted no presenta ninguna de las 3 enfermedades", null,
							YES_NO_OPTION);
				}
			}
		}
	}// GEN-LAST:event_jButton1ActionPerformed

	private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton2ActionPerformed
		System.exit(0);
	}// GEN-LAST:event_jButton2ActionPerformed

	private void diabetes() {
		int u, d, t, c, ci, se;

		u = JOptionPane.showConfirmDialog(rootPane, "¿Usted presenta sed constante?", null, YES_NO_OPTION);
		d = JOptionPane.showConfirmDialog(rootPane, "¿Usted presenta hambre excesiva?", null, YES_NO_OPTION);
		t = JOptionPane.showConfirmDialog(rootPane, "¿Usted presenta perdida de peso inesplicable?", null,
				YES_NO_OPTION);
		c = JOptionPane.showConfirmDialog(rootPane, "¿Usted presenta aumento de fatiga y debilidad?", null,
				YES_NO_OPTION);
		ci = JOptionPane.showConfirmDialog(rootPane, "¿Usted presenta irritación?", null, YES_NO_OPTION);
		se = JOptionPane.showConfirmDialog(rootPane, "¿Usted presenta visión borrosa?", null, YES_NO_OPTION);

		if ((u == 0) && (d == 0) && (t == 0) && (c == 0) && (ci == 0) && (se == 0)) {
			String dg = "----------------------------------------------------\n"
					+ "-  Sistema Experto de diagnostico                   \n"
					+ "-         Yachay Tech                               \n"
					+ "----------------------------------------------------\n"
					+ "-         DIAGNOSTICO                               \n"
					+ "----------------------------------------------------\n"
					+ "- lo que usted presenta es DIABETES                 \n"
					+ "----------------------------------------------------";

			texto.setText(dg);
		} else {
			gastritis();
		}
	}

	private void gastritis() {
		int u, d, t, c, ci, se, si, oc;

		u = JOptionPane.showConfirmDialog(rootPane, "¿Usted presenta perdida de peso?", null, YES_NO_OPTION);
		d = JOptionPane.showConfirmDialog(rootPane, "¿Usted presenta nauseas?", null, YES_NO_OPTION);
		t = JOptionPane.showConfirmDialog(rootPane, "¿Usted presenta hipo?", null, YES_NO_OPTION);
		c = JOptionPane.showConfirmDialog(rootPane, "¿Usted presenta eructos?", null, YES_NO_OPTION);
		ci = JOptionPane.showConfirmDialog(rootPane, "¿Usted presenta gases?", null, YES_NO_OPTION);
		se = JOptionPane.showConfirmDialog(rootPane, "¿Usted presenta mal sabor de boca?", null, YES_NO_OPTION);
		si = JOptionPane.showConfirmDialog(rootPane, "¿Usted presenta vomitos?", null, YES_NO_OPTION);
		oc = JOptionPane.showConfirmDialog(rootPane, "¿Usted presenta sensacion de vacio gastrico?", null,
				YES_NO_OPTION);

		if ((u == 0) && (d == 0) && (t == 0) && (c == 0) && (ci == 0) && (se == 0) && (si == 0) && (oc == 0)) {
			String dg = "----------------------------------------------------\n"
					+ "- Sistema Experto de diagnostico                   \n"
					+ "-         Yachay Tech                               \n"
					+ "----------------------------------------------------\n"
					+ "-         DIAGNOSTICO                               \n"
					+ "----------------------------------------------------\n"
					+ "- lo que usted presenta es GASTRITIS                \n"
					+ "----------------------------------------------------";

			texto.setText(dg);
		} else {
			colesterol();
		}
	}

	private void colesterol() {
		int u, d, t, c, ci, se;

		u = JOptionPane.showConfirmDialog(rootPane, "¿Usted presenta perdida de equilibrio o mareo?", null,
				YES_NO_OPTION);
		d = JOptionPane.showConfirmDialog(rootPane, "¿Usted presenta dolor de cabeza?", null, YES_NO_OPTION);
		t = JOptionPane.showConfirmDialog(rootPane, "¿Usted presenta ojos amarillos?", null, YES_NO_OPTION);
		c = JOptionPane.showConfirmDialog(rootPane, "¿Usted presenta visión borrosa?", null, YES_NO_OPTION);
		ci = JOptionPane.showConfirmDialog(rootPane, "¿Usted presenta agitacion al presentar actividades leves?", null,
				YES_NO_OPTION);
		se = JOptionPane.showConfirmDialog(rootPane, "¿Usted presenta dolor en el pecho?", null, YES_NO_OPTION);

		if ((u == 0) && (d == 0) && (t == 0) && (c == 0) && (ci == 0) && (se == 0)) {
			String dg = "----------------------------------------------------\n"
					+ "- Sistema Experto de diagnostico                    \n"
					+ "-         Yachay Tech                               \n"
					+ "-----------------------------------------------------\n"
					+ "-         DIAGNOSTICO                                \n"
					+ "-----------------------------------------------------\n"
					+ "- lo que usted presenta es COLESTEROL                \n"
					+ "-----------------------------------------------------";

			texto.setText(dg);
		} else {
			diabetes();
		}
	}

	/**
	 * @param args
	 *            the command line arguments
	 */
	public static void main(String args[]) {
		/* Set the Nimbus look and feel */
		// <editor-fold defaultstate="collapsed" desc=" Look and feel setting
		// code (optional) ">
		/*
		 * If Nimbus (introduced in Java SE 6) is not available, stay with the
		 * default look and feel. For details see
		 * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.
		 * html
		 */
		try {
			for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
				if ("Nimbus".equals(info.getName())) {
					javax.swing.UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		} catch (ClassNotFoundException ex) {
			java.util.logging.Logger.getLogger(test.class.getName()).log(java.util.logging.Level.SEVERE, null,
					ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(test.class.getName()).log(java.util.logging.Level.SEVERE, null,
					ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(test.class.getName()).log(java.util.logging.Level.SEVERE, null,
					ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(test.class.getName()).log(java.util.logging.Level.SEVERE, null,
					ex);
		}
		// </editor-fold>

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				new test().setVisible(true);
			}
		});
	}

	// Variables declaration - do not modify//GEN-BEGIN:variables
	private javax.swing.JButton jButton1;
	private javax.swing.JButton jButton2;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JLabel jLabel3;
	private javax.swing.JLabel jLabel4;
	private javax.swing.JLabel jLabel5;
	private javax.swing.JLabel jLabel6;
	private javax.swing.JLabel jLabel7;
	private javax.swing.JLabel jLabel8;
	private javax.swing.JPanel jPanel1;
	private javax.swing.JPanel jPanel2;
	private javax.swing.JScrollPane jScrollPane1;
	private javax.swing.JTextArea texto;
	// End of variables declaration//GEN-END:variables
}