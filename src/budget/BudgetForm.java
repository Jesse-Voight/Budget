/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package budget;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author JessVoig
 */
public class BudgetForm extends javax.swing.JFrame {

    /**
     * Creates new form BudgetForm
     */
    public BudgetForm() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
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
        jButton3 = new javax.swing.JButton();

        debitDialog.setTitle("Create Debit");
        debitDialog.setMaximumSize(new java.awt.Dimension(298, 244));
        debitDialog.setMinimumSize(new java.awt.Dimension(298, 244));
        debitDialog.setResizable(false);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Create Debit");

        debitDateChooser.setDateFormatString("yyyyMMdd");

        debitCostTextBox.setText("$0.00");

        debitDescTextBox.setColumns(20);
        debitDescTextBox.setRows(5);
        jScrollPane3.setViewportView(debitDescTextBox);

        jLabel3.setText("Date of Transaction:");

        jLabel4.setText("Cost of Debit:");

        jLabel5.setText("Description of Debit:");

        debitSaveButton.setText("Save & Close");

        debitCancelButton.setText("Cancel");

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
                                .addGroup(debitDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(debitCostTextBox, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(debitDateChooser, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        crebitDialog.setTitle("Create Debit");
        crebitDialog.setMaximumSize(new java.awt.Dimension(298, 244));
        crebitDialog.setMinimumSize(new java.awt.Dimension(298, 244));
        crebitDialog.setResizable(false);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("Create Crebit");

        crebitDateChooser.setDateFormatString("yyyyMMdd");

        crebitCostTextBox.setText("$0.00");

        crebitDescTextBox.setColumns(20);
        crebitDescTextBox.setRows(5);
        jScrollPane4.setViewportView(crebitDescTextBox);

        jLabel7.setText("Date of Transaction:");

        jLabel8.setText("Value of Crebit:");

        jLabel9.setText("Description of Crebit:");

        crebitSaveButton.setText("Save & Close");

        crebitCancelButton.setText("Cancel");

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
                                .addGroup(crebitDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(crebitCostTextBox, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(crebitDateChooser, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
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

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setText("Budget");

        jCalendar.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jCalendarPropertyChange(evt);
            }
        });

        debitsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Debit Desc", "Debit Value"
            }
        ));
        debitsTable.setGridColor(new java.awt.Color(204, 0, 0));
        jScrollPane1.setViewportView(debitsTable);

        crebitsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Crebits", "Title 2"
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

        moneyLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        moneyLabel.setText("Money Saved: $0000");

        jButton3.setText("Check Month");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(734, 734, 734))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(moneyLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(addDebitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(addCrebitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCalendar, javax.swing.GroupLayout.DEFAULT_SIZE, 451, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addComponent(jCalendar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(moneyLabel)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addDebitButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(addCrebitButton)
                    .addComponent(jButton3))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        /*ArrayList results = DatabaseConnector.loadCurrentMonth(new Date());
        for(Object s: results){
            //String[])s;
            for(String t: (String[])s){
                System.out.println(t);
            }
        }*/
        //getDayRecords(new Date()); //Todays date
        moneyLabel.setText("Money Saved: $"+DatabaseConnector.loadTotal());
    }//GEN-LAST:event_formWindowOpened

    private void jCalendarPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jCalendarPropertyChange
        getDayRecords(jCalendar.getDate());
    }//GEN-LAST:event_jCalendarPropertyChange

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        DatabaseConnector.loadCurrentMonth(new Date());
    }//GEN-LAST:event_jButton3ActionPerformed

    private void addDebitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addDebitButtonActionPerformed
        debitDialog.setLocation(this.getLocationOnScreen());
        debitDialog.setVisible(true);
    }//GEN-LAST:event_addDebitButtonActionPerformed

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
        Color y = Color.decode("#548554");
        javax.swing.UIManager.put("nimbusBase", y);
        javax.swing.UIManager.put("nimbusBlueGrey", y);
        javax.swing.UIManager.put("control", y);
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BudgetForm().setVisible(true);
            }
        });
    }
    // <editor-fold defaultstate="collapsed" desc="Variable Declaration">  
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addCrebitButton;
    private javax.swing.JButton addDebitButton;
    private javax.swing.JButton crebitCancelButton;
    private javax.swing.JTextField crebitCostTextBox;
    private com.toedter.calendar.JDateChooser crebitDateChooser;
    private javax.swing.JTextArea crebitDescTextBox;
    private javax.swing.JDialog crebitDialog;
    private javax.swing.JButton crebitSaveButton;
    private javax.swing.JTable crebitsTable;
    private javax.swing.JButton debitCancelButton;
    private javax.swing.JTextField debitCostTextBox;
    private com.toedter.calendar.JDateChooser debitDateChooser;
    private javax.swing.JTextArea debitDescTextBox;
    private javax.swing.JDialog debitDialog;
    private javax.swing.JButton debitSaveButton;
    private javax.swing.JTable debitsTable;
    private javax.swing.JButton jButton3;
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
    // End of variables declaration//GEN-END:variables
// </editor-fold>
    public void getDayRecords(Date date){
        ArrayList list = DatabaseConnector.loadCurrentDay(date);
        //System.out.println("Running load current day");
        int crebits = 0;
        int debits = 0;
        int count = 0;
        String debitColNames[] = {"Debit Desc", "Debit Cost"};
        String crebitColNames[] = {"Crebit Desc", "Crebit Cost"};
        BetterTableModel dtm = new BetterTableModel();
        BetterTableModel ctm = new BetterTableModel();
        dtm.setDataVector(null, debitColNames);
        ctm.setDataVector(null, crebitColNames);
        debitsTable.setModel(dtm);
        crebitsTable.setModel(ctm);
        
        for(Object i: list){  //get single entry
            String[] item = (String[])i;
            if(Float.valueOf(item[2]) > 0){
                System.out.print("Positive Value: ");
                ctm.addRow(new String[2]);
                crebitsTable.getModel().setValueAt(item[1], crebits, 0);
                crebitsTable.getModel().setValueAt("$"+item[2], crebits, 1);
                crebits++;
                //count++;
            }
            else{
                System.out.print("Negative Value: ");
                dtm.addRow(new String[2]);
                debitsTable.getModel().setValueAt(item[1], debits, 0);
                debitsTable.getModel().setValueAt("$"+item[2], debits, 1);
                debits++;
                //count++;
            }
            for(Object j: (String[])i){
                System.out.print(j);
                System.out.print(" ");
            }System.out.println(" ");
        }
    }
}
