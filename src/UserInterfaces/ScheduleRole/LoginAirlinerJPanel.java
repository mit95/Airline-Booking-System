/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterfaces.ScheduleRole;

import Business.Airliner;
import Business.AirlinerDirectory;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author mitka
 */
public class LoginAirlinerJPanel extends javax.swing.JPanel {

    /**
     * Creates new form LoginAirlinerJPanel
     */
    private JPanel CardSequenceJPanel;
    private AirlinerDirectory airlinerDirectory;
    public LoginAirlinerJPanel(JPanel CardSequenceJPanel, AirlinerDirectory airlinerDirectory) {
        initComponents();
        this.CardSequenceJPanel = CardSequenceJPanel;
        this.airlinerDirectory = airlinerDirectory;
        
        airlinerComboBox.removeAllItems();
        for(Airliner airliner:airlinerDirectory.getAirlinerDirec()){
            airlinerComboBox.addItem(airliner);
        
        }
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
        jLabel2 = new javax.swing.JLabel();
        airlinerComboBox = new javax.swing.JComboBox();
        btnManageFlight = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("AIRLINER LOGIN");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Airliner Name:");

        airlinerComboBox.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        airlinerComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        btnManageFlight.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnManageFlight.setText("Manage Flight >>");
        btnManageFlight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageFlightActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(269, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(221, 221, 221))
            .addGroup(layout.createSequentialGroup()
                .addGap(237, 237, 237)
                .addComponent(jLabel2)
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(airlinerComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnManageFlight, javax.swing.GroupLayout.DEFAULT_SIZE, 183, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(79, 79, 79)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(airlinerComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addComponent(btnManageFlight)
                .addContainerGap(302, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnManageFlightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageFlightActionPerformed
        // TODO add your handling code here:
        
        if(airlinerComboBox.getSelectedItem() != null){
             Airliner airliner = (Airliner) airlinerComboBox.getSelectedItem();
            ManageFlightJPanel panel = new ManageFlightJPanel(CardSequenceJPanel,airliner);
            CardSequenceJPanel.add("ManageFlightJPanel",panel);
            CardLayout layout = (CardLayout) CardSequenceJPanel.getLayout();
            layout.next(CardSequenceJPanel);
        }
        else{
            JOptionPane.showMessageDialog(null, "Airline needs to be created to manage its flights","Warning",JOptionPane.WARNING_MESSAGE);
        
        }
    }//GEN-LAST:event_btnManageFlightActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox airlinerComboBox;
    private javax.swing.JButton btnManageFlight;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
