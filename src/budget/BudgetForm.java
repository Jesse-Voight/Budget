package budget;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Jesse Voight
 */
public class BudgetForm extends javax.swing.JFrame {

    public BudgetForm() {
        initComponents();
    }

    //@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        debitDialog = new javax.swing.JDialog();
        jLabel2 = new javax.swing.JLabel();
        debitDateChooser = new com.toedter.calendar.JDateChooser();
        debitCostTextBox = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        debitDescTextBox = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        debitSaveButton = new javax.swing.JButton();
        debitCancelButton = new javax.swing.JButton();
        crebitDialog = new javax.swing.JDialog();
        jLabel6 = new javax.swing.JLabel();
        crebitDateChooser = new com.toedter.calendar.JDateChooser();
        crebitCostTextBox = new javax.swing.JTextField();
        jScrollPane4 = new javax.swing.JScrollPane();
        crebitDescTextBox = new javax.swing.JTextArea();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        crebitSaveButton = new javax.swing.JButton();
        crebitCancelButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jCalendar = new com.toedter.calendar.JCalendar();
        jScrollPane1 = new javax.swing.JScrollPane();
        debitsTable = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        crebitsTable = new javax.swing.JTable();
        addDebitButton = new javax.swing.JButton();
        addCrebitButton = new javax.swing.JButton();
        moneyLabel = new javax.swing.JLabel();
        weekTotalLabel = new javax.swing.JLabel();
        averageWeeklLabel = new javax.swing.JLabel();
        dayTotalLabel = new javax.swing.JLabel();
        monthTotalLabel = new javax.swing.JLabel();

        debitDialog.setTitle("Create Debit");
        debitDialog.setMinimumSize(new java.awt.Dimension(385, 300));
        debitDialog.addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                debitDialogWindowActivated(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Create Debit");

        debitDateChooser.setDateFormatString("dd/MM/yyyy");

        debitCostTextBox.setText("$0.00");

        debitDescTextBox.setColumns(20);
        debitDescTextBox.setRows(5);
        jScrollPane3.setViewportView(debitDescTextBox);

        jLabel3.setText("Date of Transaction:");

        jLabel4.setText("Cost of Debit:");

        jLabel5.setText("Description of Debit:");

        debitSaveButton.setText("Save & Close");
        debitSaveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                debitSaveButtonActionPerformed(evt);
            }
        });

        debitCancelButton.setText("Cancel");
        debitCancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                debitCancelButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout debitDialogLayout = new javax.swing.GroupLayout(debitDialog.getContentPane());
        debitDialog.getContentPane().setLayout(debitDialogLayout);
        debitDialogLayout.setHorizontalGroup(
            debitDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(debitDialogLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(debitDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(debitDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(debitDialogLayout.createSequentialGroup()
                            .addComponent(debitCancelButton)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(debitSaveButton))
                        .addGroup(debitDialogLayout.createSequentialGroup()
                            .addGroup(debitDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel3)
                                .addComponent(jLabel4)
                                .addComponent(jLabel5))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(debitDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(debitDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(debitCostTextBox, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(100, Short.MAX_VALUE))
        );
        debitDialogLayout.setVerticalGroup(
            debitDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(debitDialogLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(debitDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(debitDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(debitDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(debitCostTextBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(debitDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(debitDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(debitSaveButton)
                    .addComponent(debitCancelButton))
                .addContainerGap(67, Short.MAX_VALUE))
        );

        crebitDialog.setTitle("Create Debit");
        crebitDialog.setMinimumSize(new java.awt.Dimension(385, 300));
        crebitDialog.setResizable(false);
        crebitDialog.addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                crebitDialogWindowActivated(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("Create Crebit");

        crebitDateChooser.setDateFormatString("dd/MM/yyyy");

        crebitCostTextBox.setText("$0.00");

        crebitDescTextBox.setColumns(20);
        crebitDescTextBox.setRows(5);
        jScrollPane4.setViewportView(crebitDescTextBox);

        jLabel7.setText("Date of Transaction:");

        jLabel8.setText("Value of Crebit:");

        jLabel9.setText("Description of Crebit:");

        crebitSaveButton.setText("Save & Close");
        crebitSaveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crebitSaveButtonActionPerformed(evt);
            }
        });

        crebitCancelButton.setText("Cancel");
        crebitCancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crebitCancelButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout crebitDialogLayout = new javax.swing.GroupLayout(crebitDialog.getContentPane());
        crebitDialog.getContentPane().setLayout(crebitDialogLayout);
        crebitDialogLayout.setHorizontalGroup(
            crebitDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(crebitDialogLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(crebitDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addGroup(crebitDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(crebitDialogLayout.createSequentialGroup()
                            .addComponent(crebitCancelButton)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(crebitSaveButton))
                        .addGroup(crebitDialogLayout.createSequentialGroup()
                            .addGroup(crebitDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel7)
                                .addComponent(jLabel8)
                                .addComponent(jLabel9))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(crebitDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(crebitCostTextBox, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(crebitDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        crebitDialogLayout.setVerticalGroup(
            crebitDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(crebitDialogLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addGroup(crebitDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(crebitDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(crebitDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(crebitCostTextBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(crebitDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(crebitDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(crebitSaveButton)
                    .addComponent(crebitCancelButton))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Budget Tool ALPHA 0.3");
        setBackground(new java.awt.Color(0, 153, 153));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Harlow Solid Italic", 0, 36)); // NOI18N
        jLabel1.setText(" Budget 2014");

        jCalendar.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 204, 51), new java.awt.Color(0, 204, 51)));
        jCalendar.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jCalendarPropertyChange(evt);
            }
        });

        debitsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Day", "Debit Desc", "Debit Value"
            }
        ));
        debitsTable.setGridColor(new java.awt.Color(204, 0, 0));
        jScrollPane1.setViewportView(debitsTable);

        crebitsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Day", "Crebits", "Crebit Cost"
            }
        ));
        crebitsTable.setGridColor(new java.awt.Color(0, 204, 51));
        jScrollPane2.setViewportView(crebitsTable);

        addDebitButton.setText("Add Debit");
        addDebitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addDebitButtonActionPerformed(evt);
            }
        });

        addCrebitButton.setText("Add Crebit");
        addCrebitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addCrebitButtonActionPerformed(evt);
            }
        });

        moneyLabel.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        moneyLabel.setText("Money Saved: $0000");

        weekTotalLabel.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        weekTotalLabel.setText("Week Total: $0000");

        averageWeeklLabel.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        averageWeeklLabel.setText("Average Week: $0000");

        dayTotalLabel.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        dayTotalLabel.setText("Day Total: $0000");

        monthTotalLabel.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        monthTotalLabel.setText("Month Total: $0000");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(weekTotalLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(moneyLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(averageWeeklLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(dayTotalLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(monthTotalLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(addDebitButton, javax.swing.GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(addCrebitButton, javax.swing.GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCalendar, javax.swing.GroupLayout.DEFAULT_SIZE, 473, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(moneyLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(weekTotalLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(averageWeeklLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(dayTotalLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(monthTotalLabel))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 442, Short.MAX_VALUE)
                            .addComponent(jScrollPane1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(addDebitButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(addCrebitButton)))
                    .addComponent(jCalendar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        getAccessibleContext().setAccessibleName("Budget Tool Beta 0.8");

        pack();
    }// </editor-fold>//GEN-END:initComponents
     // <editor-fold defaultstate="collapsed" desc="Event Handlers">  
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        moneyLabel.setText("Money Saved: $" + DatabaseConnector.loadTotal());
        averageWeeklLabel.setText("Average Week: $" + DatabaseConnector.loadAverageWeek(new Date()));
    }//GEN-LAST:event_formWindowOpened

    private void jCalendarPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jCalendarPropertyChange
        //getDayRecords(jCalendar.getDate());  dont need day, need to load week records
        getWeekRecords(jCalendar.getDate());
        dayTotalLabel.setText("Day Total: $" + DatabaseConnector.loadDayTotal(jCalendar.getDate()));
        monthTotalLabel.setText("Month Total: $" + DatabaseConnector.loadMonthTotal(jCalendar.getDate()));
    }//GEN-LAST:event_jCalendarPropertyChange

    private void addDebitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addDebitButtonActionPerformed
        debitDialog.setLocation(this.getLocationOnScreen());
        debitDialog.setVisible(true);
    }//GEN-LAST:event_addDebitButtonActionPerformed

    private void crebitSaveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crebitSaveButtonActionPerformed
        String costTemp = crebitCostTextBox.getText().replace("$", "");
        Float cost = Float.valueOf(costTemp);
        if (!crebitDescTextBox.getText().equals("")) {
            System.out.println("Past description box check");
            DatabaseConnector.saveTransaction(crebitDateChooser.getDate(), cost, crebitDescTextBox.getText());
        } else {
            System.out.println("Please fill in desc box");
        }
        crebitDialog.setVisible(false);
        this.refresh();
    }//GEN-LAST:event_crebitSaveButtonActionPerformed
    private void refresh() {
        moneyLabel.setText("Money Saved: $" + DatabaseConnector.loadTotal());
        debitCostTextBox.setText("$0.00");
        debitDescTextBox.setText("");
        debitDateChooser.setDate(new Date());
        crebitCostTextBox.setText("$0.00");
        crebitDescTextBox.setText("");
        crebitDateChooser.setDate(new Date());
        this.getDayRecords(new Date());
        jCalendar.setDate(new Date());
    }
    private void debitDialogWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_debitDialogWindowActivated
        debitDateChooser.setDate(jCalendar.getDate());
    }//GEN-LAST:event_debitDialogWindowActivated

    private void debitSaveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_debitSaveButtonActionPerformed
        String costTemp = debitCostTextBox.getText().replace("$", "");
        Float cost = Float.valueOf(costTemp);
        if (!debitDescTextBox.getText().equals("")) {
            System.out.println("Past description box check");
            DatabaseConnector.saveTransaction(debitDateChooser.getDate(), cost, debitDescTextBox.getText());
        } else {
            System.out.println("Please fill in desc box");
        }
        debitDialog.setVisible(false);
        this.refresh();
    }//GEN-LAST:event_debitSaveButtonActionPerformed

    private void debitCancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_debitCancelButtonActionPerformed
        debitDialog.setVisible(false);
        this.refresh();
    }//GEN-LAST:event_debitCancelButtonActionPerformed

    private void addCrebitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addCrebitButtonActionPerformed
        crebitDialog.setVisible(true);
        crebitDialog.setLocation(this.getLocationOnScreen());
    }//GEN-LAST:event_addCrebitButtonActionPerformed

    private void crebitDialogWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_crebitDialogWindowActivated
        crebitDateChooser.setDate(jCalendar.getDate());
    }//GEN-LAST:event_crebitDialogWindowActivated

    private void crebitCancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crebitCancelButtonActionPerformed
        crebitDialog.setVisible(false);
        this.refresh();
    }//GEN-LAST:event_crebitCancelButtonActionPerformed
// </editor-fold>
    // <editor-fold defaultstate="collapsed" desc="Main">  

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
            java.util.logging.Logger.getLogger(BudgetForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BudgetForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BudgetForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BudgetForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        Color y = Color.decode("#60a260");
        //javax.swing.UIManager.put("nimbusBase", y);
        //javax.swing.UIManager.put("nimbusBlueGrey", y);
        //javax.swing.UIManager.put("control", y);
        //javax.swing.UIManager.put("textForeground", Color.BLACK);
        //javax.swing.UIManager.put("Table.alternateRowColor", Color.GREEN);
        //javax.swing.UIManager.put("Table:\"Table.cellRenderer\".opaque", false);

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BudgetForm().setVisible(true);
            }
        });
    }
// </editor-fold>
    // <editor-fold defaultstate="collapsed" desc="Variable Declaration">  
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addCrebitButton;
    private javax.swing.JButton addDebitButton;
    private javax.swing.JLabel averageWeeklLabel;
    private javax.swing.JButton crebitCancelButton;
    private javax.swing.JTextField crebitCostTextBox;
    private com.toedter.calendar.JDateChooser crebitDateChooser;
    private javax.swing.JTextArea crebitDescTextBox;
    private javax.swing.JDialog crebitDialog;
    private javax.swing.JButton crebitSaveButton;
    private javax.swing.JTable crebitsTable;
    private javax.swing.JLabel dayTotalLabel;
    private javax.swing.JButton debitCancelButton;
    private javax.swing.JTextField debitCostTextBox;
    private com.toedter.calendar.JDateChooser debitDateChooser;
    private javax.swing.JTextArea debitDescTextBox;
    private javax.swing.JDialog debitDialog;
    private javax.swing.JButton debitSaveButton;
    private javax.swing.JTable debitsTable;
    private com.toedter.calendar.JCalendar jCalendar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JLabel moneyLabel;
    private javax.swing.JLabel monthTotalLabel;
    private javax.swing.JLabel weekTotalLabel;
    // End of variables declaration//GEN-END:variables
// </editor-fold>
    // <editor-fold defaultstate="collapsed" desc="Big Functions">
    public void getDayRecords(Date date) {
        ArrayList list = DatabaseConnector.loadCurrentDay(date);
        //System.out.println("Running load current day");
        int crebits = 0;
        int debits = 0;
        String debitColNames[] = {"Debit Desc", "Debit Cost"};
        String crebitColNames[] = {"Crebit Desc", "Crebit Cost"};
        BetterTableModel dtm = new BetterTableModel();
        BetterTableModel ctm = new BetterTableModel();
        dtm.setDataVector(null, debitColNames);
        ctm.setDataVector(null, crebitColNames);
        debitsTable.setModel(dtm);
        crebitsTable.setModel(ctm);

        for (Object i : list) {  //get single entry
            String[] item = (String[]) i;
            if (Float.valueOf(item[2]) > 0) {
                //System.out.print("Positive Value: ");
                ctm.addRow(new String[2]);
                crebitsTable.getModel().setValueAt(item[1], crebits, 0);
                crebitsTable.getModel().setValueAt("$" + item[2], crebits, 1);
                crebits++;
            } else {
                //System.out.print("Negative Value: ");
                dtm.addRow(new String[2]);
                debitsTable.getModel().setValueAt(item[1], debits, 0);
                debitsTable.getModel().setValueAt("$" + item[2], debits, 1);
                debits++;
            }
        }
    }

    public void getWeekRecords(Date date) {
        ArrayList list = DatabaseConnector.loadCurrentWeek(date);
        //System.out.println("<Loading current week>");
        int crebits = 0;
        int debits = 0;
        float weekTotal = 0;
        String debitColNames[] = {"Day", "Debit Desc", "Debit Cost"};
        String crebitColNames[] = {"Day", "Crebit Desc", "Crebit Cost"};
        BetterTableModel dtm = new BetterTableModel();
        BetterTableModel ctm = new BetterTableModel();
        dtm.setDataVector(null, debitColNames);
        ctm.setDataVector(null, crebitColNames);
        debitsTable.setModel(dtm);
        crebitsTable.setModel(ctm);

        for (Object i : list) {  //get single entry
            String[] item = (String[]) i;    //Object to String[]
            if (Float.valueOf(item[2]) > 0) {
                //System.out.print("Positive Value: ");
                ctm.addRow(new String[3]);
                crebitsTable.getModel().setValueAt(DateFunctions.getDay(DateFunctions.toDate(item[0])), crebits, 0);
                crebitsTable.getModel().setValueAt(item[1], crebits, 1);
                crebitsTable.getModel().setValueAt("$" + item[2], crebits, 2);
                weekTotal += Float.valueOf(item[2]);
                crebits++;
            } else {
                //System.out.print("Negative Value: ");
                dtm.addRow(new String[3]);
                debitsTable.getModel().setValueAt(DateFunctions.getDay(DateFunctions.toDate(item[0])), debits, 0);
                debitsTable.getModel().setValueAt(item[1], debits, 1);
                debitsTable.getModel().setValueAt("$" + item[2], debits, 2);
                weekTotal += Float.valueOf(item[2]);
                debits++;
            }
        }
        weekTotalLabel.setText("Week Total: $" + String.valueOf(weekTotal));
    }
// </editor-fold>
}
