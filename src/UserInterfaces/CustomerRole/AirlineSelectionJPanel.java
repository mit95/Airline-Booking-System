/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterfaces.CustomerRole;

import Business.Airliner;
import Business.AirlinerDirectory;
import Business.Customer;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author mitka
 */
public class AirlineSelectionJPanel extends javax.swing.JPanel {

    /**
     * Creates new form AirlineSelectionJPanel
     */
    private JPanel CardSequenceJPanel;
    private AirlinerDirectory airlinerDirectory;

    public AirlineSelectionJPanel(JPanel CardSequenceJPanel, AirlinerDirectory airlinerDirectory) {
        initComponents();
        this.CardSequenceJPanel = CardSequenceJPanel;
        this.airlinerDirectory = airlinerDirectory;
        
        airlinerComboBox.removeAllItems();
        for(Airliner airliner:airlinerDirectory.getAirlinerDirec()){
            airlinerComboBox.addItem(airliner);
        
        }
        
        customerNameComboBox.removeAllItems();
        for(Customer customer:airlinerDirectory.getCustomerDirectory().getCustomerDirectory()){
            customerNameComboBox.addItem(customer);
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

        jLabel2 = new javax.swing.JLabel();
        airlinerComboBox = new javax.swing.JComboBox();
        btnBookFlight = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        customerNameComboBox = new javax.swing.JComboBox();

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Airliner Name:");

        airlinerComboBox.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        airlinerComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        btnBookFlight.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnBookFlight.setText("Book Flight >>");
        btnBookFlight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBookFlightActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("AIRLINER SELECTION");

        btnBack.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnBack.setText("<< Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Customer Name:");

        customerNameComboBox.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        customerNameComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(251, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(239, 239, 239))
            .addGroup(layout.createSequentialGroup()
                .addGap(278, 278, 278)
                .addComponent(jLabel3)
                .addGap(27, 27, 27)
                .addComponent(customerNameComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(278, 278, 278)
                    .addComponent(jLabel2)
                    .addGap(50, 50, 50)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(airlinerComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnBookFlight, javax.swing.GroupLayout.DEFAULT_SIZE, 183, Short.MAX_VALUE))
                    .addContainerGap(278, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(78, 78, 78)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(customerNameComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(98, 98, 98)
                .addComponent(btnBack)
                .addContainerGap(251, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(248, 248, 248)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(airlinerComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(44, 44, 44)
                    .addComponent(btnBookFlight)
                    .addContainerGap(249, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBookFlightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBookFlightActionPerformed
        // TODO add your handling code here:
        
        
        if(airlinerComboBox.getSelectedItem() != null && customerNameComboBox.getSelectedItem() != null){
         Airliner airliner = (Airliner) airlinerComboBox.getSelectedItem();
         Customer customer = (Customer) customerNameComboBox.getSelectedItem();
        BookFlightJPanel bfjp = new BookFlightJPanel(CardSequenceJPanel,airliner,customer);
        CardSequenceJPanel.add("AirlineSelectionJPanel",bfjp);
        CardLayout layout = (CardLayout) CardSequenceJPanel.getLayout();
        layout.next(CardSequenceJPanel);
        }
        else{
            JOptionPane.showMessageDialog(null, "Customer and airliner both needs to be created before booking a flight","Warning",JOptionPane.WARNING_MESSAGE);
            
        }

    }//GEN-LAST:event_btnBookFlightActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        CardSequenceJPanel.remove(this);
        CardLayout layout = (CardLayout)CardSequenceJPanel.getLayout();
        layout.previous(CardSequenceJPanel);
    }//GEN-LAST:event_btnBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox airlinerComboBox;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnBookFlight;
    private javax.swing.JComboBox customerNameComboBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
