/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterfaces.AirlinerRole;

import Business.AirlinerDirectory;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author mitka
 */
public class DashboardJPanel extends javax.swing.JPanel {

    /**
     * Creates new form DashboardJPanel
     */
    private JPanel CardSequenceJPanel;
    private AirlinerDirectory airlineDirectory;
    
    public DashboardJPanel(JPanel CardSequenceJPanel, AirlinerDirectory airlineDirectory) {
        initComponents();
        this.CardSequenceJPanel = CardSequenceJPanel;
        this.airlineDirectory = airlineDirectory;
        
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
        btnManageAirliners = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("DASHBOARD");

        btnManageAirliners.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnManageAirliners.setText("Manage Airliners >>");
        btnManageAirliners.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageAirlinersActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(249, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(241, 241, 241))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnManageAirliners, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(284, 284, 284))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(137, 137, 137)
                .addComponent(btnManageAirliners)
                .addContainerGap(323, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnManageAirlinersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageAirlinersActionPerformed
        // TODO add your handling code here:
        ManageAirlinerJPanel majp = new ManageAirlinerJPanel(CardSequenceJPanel,airlineDirectory);
        CardSequenceJPanel.add("ManageAirlinerJPanel",majp);
        CardLayout layout = (CardLayout) CardSequenceJPanel.getLayout();
        layout.next(CardSequenceJPanel);
        
    }//GEN-LAST:event_btnManageAirlinersActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnManageAirliners;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}