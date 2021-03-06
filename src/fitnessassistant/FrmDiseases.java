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
        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(570, 500));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Do you have a disease?. Check all options that apply.");

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
                .addGap(131, 131, 131)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(asma)
                    .addComponent(diabetes)
                    .addComponent(cancer))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(hipertension)
                    .addComponent(osteoporosis)
                    .addComponent(colesterol))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(83, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(68, 68, 68))
            .addGroup(layout.createSequentialGroup()
                .addGap(217, 217, 217)
                .addComponent(next, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(jLabel1)
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(asma)
                    .addComponent(hipertension))
                .addGap(68, 68, 68)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(diabetes)
                    .addComponent(osteoporosis))
                .addGap(76, 76, 76)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(colesterol)
                    .addComponent(cancer))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
                .addComponent(next, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56))
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
        healthInfo.getContentPane().setBackground(new java.awt.Color(50, 205, 50));
        healthInfo.show();
        this.dispose();
        
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
