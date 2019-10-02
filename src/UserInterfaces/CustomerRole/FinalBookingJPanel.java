/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterfaces.CustomerRole;

import Business.Airliner;
import Business.Customer;
import Business.Flight;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author mitka
 */
public class FinalBookingJPanel extends javax.swing.JPanel {

    /**
     * Creates new form BookingJPanel
     */
    private JPanel CardSequenceJPanel;
    private Flight f;
    private Airliner airliner;
    private Customer customer;
    public FinalBookingJPanel(JPanel CardSequenceJPanel, Flight f, Airliner airliner, Customer customer) {
        initComponents();
        this.CardSequenceJPanel = CardSequenceJPanel;
        this.f = f;
        this.airliner = airliner;
        this.customer = customer;
        
        airplaneNumTextField.setText(f.getAirplaneNum());
        airplaneTypeTextField.setText(f.getAirplaneType());
        noOfSeatsTextField.setText(String.valueOf(f.getAirplaneSeats()));
        departureTextField.setText(f.getDepartureLocation());
        arrivalTextField.setText(f.getArrivalLocation());
        timeOfDayTextField.setText(f.getTimeOfDay());
        dateTextField.setText(f.getScheduledate());
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
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        dateTextField = new javax.swing.JTextField();
        timeOfDayTextField = new javax.swing.JTextField();
        arrivalTextField = new javax.swing.JTextField();
        departureTextField = new javax.swing.JTextField();
        noOfSeatsTextField = new javax.swing.JTextField();
        airplaneTypeTextField = new javax.swing.JTextField();
        airplaneNumTextField = new javax.swing.JTextField();
        btnUpdate = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("BOOK FLIGHT");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Airplane Number:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Airplane Type:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Number of seats:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Departure Location:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("Arrival Location:");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setText("Time of Day:");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setText("Date:");

        dateTextField.setEditable(false);
        dateTextField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        timeOfDayTextField.setEditable(false);

        arrivalTextField.setEditable(false);
        arrivalTextField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        departureTextField.setEditable(false);
        departureTextField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        noOfSeatsTextField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        noOfSeatsTextField.setText("150");
        noOfSeatsTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                noOfSeatsTextFieldActionPerformed(evt);
            }
        });

        airplaneTypeTextField.setEditable(false);
        airplaneTypeTextField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        airplaneNumTextField.setEditable(false);
        airplaneNumTextField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        airplaneNumTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                airplaneNumTextFieldActionPerformed(evt);
            }
        });

        btnUpdate.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnUpdate.setText("Book");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnBack.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnBack.setText("<< Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(567, Short.MAX_VALUE)
                .addComponent(btnUpdate)
                .addGap(260, 260, 260))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(245, 245, 245)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(190, 190, 190)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(airplaneTypeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(airplaneNumTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(btnBack)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel4)
                                            .addComponent(jLabel8)
                                            .addComponent(jLabel7)
                                            .addComponent(jLabel6)
                                            .addComponent(jLabel5))
                                        .addGap(35, 35, 35)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(dateTextField)
                                            .addComponent(arrivalTextField)
                                            .addComponent(noOfSeatsTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 189, Short.MAX_VALUE)
                                            .addComponent(departureTextField)
                                            .addComponent(timeOfDayTextField))))
                                .addGap(19, 19, 19)))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(10, 10, 10)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel3)
                                .addComponent(jLabel2))))
                    .addContainerGap(245, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(542, Short.MAX_VALUE)
                .addComponent(btnUpdate)
                .addGap(27, 27, 27))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(25, 25, 25)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(airplaneNumTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(28, 28, 28)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(airplaneTypeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(28, 28, 28)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(noOfSeatsTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(28, 28, 28)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5)
                        .addComponent(departureTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6)
                        .addComponent(arrivalTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(32, 32, 32)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel7)
                        .addComponent(timeOfDayTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(32, 32, 32)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel8)
                        .addComponent(dateTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(54, 54, 54)
                    .addComponent(btnBack)
                    .addGap(25, 25, 25)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void noOfSeatsTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_noOfSeatsTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_noOfSeatsTextFieldActionPerformed

    private void airplaneNumTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_airplaneNumTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_airplaneNumTextFieldActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
       try{
           int seats = Integer.parseInt(noOfSeatsTextField.getText());
           if(seats > f.getAirplaneSeats()){
               JOptionPane.showMessageDialog(null,"Seats are not available","Warning Message",JOptionPane.WARNING_MESSAGE);
           }
           else{
               int new_seats = f.getAirplaneSeats() - seats;
               f.setAirplaneSeats(new_seats);
           
               //binding this particular booking with a customer               
               customer.setCust_airplaneNum(airplaneNumTextField.getText());
               customer.setCust_airplaneType(airplaneTypeTextField.getText());
               customer.setCust_departureLocation(departureTextField.getText());
               customer.setCust_arrivalLocation(arrivalTextField.getText());
               customer.setCust_airplaneSeats(Integer.parseInt(noOfSeatsTextField.getText()));
               customer.setCust_scheduledate(dateTextField.getText());
               customer.setCust_timeOfDay(timeOfDayTextField.getText());
               customer.setCust_airlineName(airliner.getName());
               JOptionPane.showMessageDialog(null, "Booking has been confirmed","Information Message",JOptionPane.INFORMATION_MESSAGE);
           }
       }
       catch(NumberFormatException ex){
           JOptionPane.showMessageDialog(null, "Please enter a valid integer","Warning message",JOptionPane.WARNING_MESSAGE);
       
       }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        backAction();
    }//GEN-LAST:event_btnBackActionPerformed

    private void backAction() {
        CardSequenceJPanel.remove(this);
        Component[] componentArray = CardSequenceJPanel.getComponents();
        Component component = componentArray[componentArray.length - 1];
        BookFlightJPanel panel = (BookFlightJPanel) component;
        panel.populateTable();
        CardLayout layout = (CardLayout) CardSequenceJPanel.getLayout();
        layout.previous(CardSequenceJPanel);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField airplaneNumTextField;
    private javax.swing.JTextField airplaneTypeTextField;
    private javax.swing.JTextField arrivalTextField;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JTextField dateTextField;
    private javax.swing.JTextField departureTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField noOfSeatsTextField;
    private javax.swing.JTextField timeOfDayTextField;
    // End of variables declaration//GEN-END:variables
}