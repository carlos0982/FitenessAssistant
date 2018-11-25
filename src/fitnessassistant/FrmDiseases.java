/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fitnessassistant;

/**
 *
 * @author Richard
 */
public class FrmDiseases extends javax.swing.JFrame {

    Person person;
    
    public FrmDiseases() {
        initComponents();
    }
    
    public void setData(Person person){
        this.person = person;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        asma = new javax.swing.JCheckBox();
        diabetes = new javax.swing.JCheckBox();
        cancer = new javax.swing.JCheckBox();
        hipertension = new javax.swing.JCheckBox();
        osteoporosis = new javax.swing.JCheckBox();
        colesterol = new javax.swing.JCheckBox();
        next = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(700, 500));

        jLabel1.setText("Do you have a disease?. Check all the diseases that you have.");

        asma.setText("Asthma");
        asma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                asmaActionPerformed(evt);
            }
        });

        diabetes.setText("Diabetes");
        diabetes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                diabetesActionPerformed(evt);
            }
        });

        cancer.setText("Cancer");

        hipertension.setText("Hypertension");

        osteoporosis.setText("Osteoporosis");

        colesterol.setText("High Cholesterol");

        next.setText("NEXT");
        next.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(156, 156, 156)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addComponent(asma)
                                            .addGap(134, 134, 134))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(diabetes)
                                            .addGap(124, 124, 124)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(cancer)
                                        .addGap(138, 138, 138)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(colesterol)
                                    .addComponent(osteoporosis)
                                    .addComponent(hipertension)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(329, 329, 329)
                        .addComponent(next, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(150, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addComponent(jLabel1)
                .addGap(58, 58, 58)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(asma)
                    .addComponent(hipertension))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(diabetes)
                    .addComponent(osteoporosis))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cancer)
                    .addComponent(colesterol))
                .addGap(80, 80, 80)
                .addComponent(next, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(137, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void asmaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_asmaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_asmaActionPerformed

    private void diabetesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_diabetesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_diabetesActionPerformed

    private void nextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextActionPerformed
        
        boolean diseases = false;
        
        if(asma.isSelected() || diabetes.isSelected() || cancer.isSelected() ||
                hipertension.isSelected() || osteoporosis.isSelected() ||
                colesterol.isSelected()){
            diseases = true;
        }
        
        person.setTieneEnfermedades(diseases);
        
        FrmHealth healthInfo = new FrmHealth();
        healthInfo.setData(person);
        healthInfo.setLocationRelativeTo(null);
        healthInfo.show();
        
    }//GEN-LAST:event_nextActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrmDiseases.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmDiseases.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmDiseases.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmDiseases.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmDiseases().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox asma;
    private javax.swing.JCheckBox cancer;
    private javax.swing.JCheckBox colesterol;
    private javax.swing.JCheckBox diabetes;
    private javax.swing.JCheckBox hipertension;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton next;
    private javax.swing.JCheckBox osteoporosis;
    // End of variables declaration//GEN-END:variables
}
