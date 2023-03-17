
import java.text.ParseException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.TableRowSorter;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.renderer.category.BarRenderer;
import org.jfree.data.category.DefaultCategoryDataset;


public class MainInterface extends javax.swing.JFrame {
    
ArrayList<myhealthapp> user;
String header[] = new String[]{"Name", "Health history", "Blood type", "Height", "Weight", "Temperature", "Date", "BMI"};
DefaultTableModel dtm;
BMIStatus bmistatus;
int row,col;
    /**
     * Creates new form MainInterface
     */
    public MainInterface() {
        initComponents();
        user = new ArrayList<>();
        dtm = new DefaultTableModel(header,0);
        jTable2.setModel(dtm);
        this.setLocationRelativeTo(null);
        sort();
        bmistatus = new BMIStatus();
        
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jButtonAdd = new javax.swing.JButton();
        jButtonDelete = new javax.swing.JButton();
        jButtonUpdate = new javax.swing.JButton();
        jButtonChart = new javax.swing.JButton();
        jButtonClear = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jTextName = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jTextHealth = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jCBbloodtype = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jTextHeight = new javax.swing.JTextField();
        jTextWeight = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jTextTemperature = new javax.swing.JTextField();
        jDateChooser = new com.toedter.calendar.JDateChooser();
        jLabel15 = new javax.swing.JLabel();
        status = new javax.swing.JLabel();
        jLabelStatus = new javax.swing.JLabel();
        Status = new javax.swing.JLabel();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("My Health App");
        setResizable(false);

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jButtonAdd.setText("Add");
        jButtonAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddActionPerformed(evt);
            }
        });
        jPanel2.add(jButtonAdd);

        jButtonDelete.setText("Delete");
        jButtonDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDeleteActionPerformed(evt);
            }
        });
        jPanel2.add(jButtonDelete);

        jButtonUpdate.setText("Update");
        jButtonUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonUpdateActionPerformed(evt);
            }
        });
        jPanel2.add(jButtonUpdate);

        jButtonChart.setText("BMI Graph");
        jButtonChart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonChartActionPerformed(evt);
            }
        });
        jPanel2.add(jButtonChart);

        jButtonClear.setText("Clear");
        jButtonClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonClearActionPerformed(evt);
            }
        });
        jPanel2.add(jButtonClear);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Tite 5", "Title 6", "Title 7", "Title 8"
            }
        ));
        jTable2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable2MouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(jTable2);

        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setText("Name");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 11, -1, -1));
        jPanel3.add(jTextName, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 8, 153, -1));

        jLabel10.setText("Health history");
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 36, -1, -1));
        jPanel3.add(jTextHealth, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 36, 153, -1));

        jLabel11.setText("Blood type");
        jPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 73, -1, -1));

        jCBbloodtype.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select your blood type", "A", "B", "AB", "O" }));
        jCBbloodtype.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBbloodtypeActionPerformed(evt);
            }
        });
        jPanel3.add(jCBbloodtype, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 70, -1, -1));

        jLabel12.setText("Height(m)");
        jPanel3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, -1, -1));

        jLabel13.setText("Weight(kg)");
        jPanel3.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, -1, -1));
        jPanel3.add(jTextHeight, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 160, 90, -1));
        jPanel3.add(jTextWeight, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 190, 91, -1));

        jLabel14.setText("Temperature(Celsius)");
        jPanel3.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, -1, -1));
        jPanel3.add(jTextTemperature, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 100, 101, -1));

        jDateChooser.setDateFormatString("yyyy-MM-dd");
        jPanel3.add(jDateChooser, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 130, -1, -1));

        jLabel15.setText("Date");
        jPanel3.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 130, -1, -1));

        status.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        status.setText("BMI status:");
        jPanel3.add(status, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 155, -1));

        jLabelStatus.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.add(jLabelStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(439, 70, -1, -1));
        jPanel3.add(Status, new org.netbeans.lib.awtextra.AbsoluteConstraints(433, 70, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(10, 10, 10))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 252, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void sort(){
        TableRowSorter<DefaultTableModel> sorter=new TableRowSorter<DefaultTableModel>(dtm);
        jTable2.setRowSorter(sorter);
    }
    /* Adds data to row */
    private void jButtonAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddActionPerformed

        String name = jTextName.getText();
        String health = jTextHealth.getText();
        String bloodtype = jCBbloodtype.getSelectedItem().toString();
        String height = jTextHeight.getText();
        String weight = jTextWeight.getText();
        String temperature = jTextTemperature.getText();
        String date = ((JTextField)jDateChooser.getDateEditor().getUiComponent()).getText();
        
        Double h = Double.parseDouble(jTextHeight.getText());
        Double w = Double.parseDouble(jTextWeight.getText());
        Double bmi = w/(h*h);
        
        status.setText(bmistatus.getBMIStatus(bmi));
        
    
        
        user.add(new myhealthapp(name,health,bloodtype,height,weight,temperature,date,bmi));
        dtm.setRowCount(0);//reset data model
        for (int i = 0; i < user.size(); i++) {
            Object[] objs = {user.get(i).name,user.get(i).bloodtype,user.get(i).health,user.get(i).height,user.get(i).weight,user.get(i).temperature,user.get(i).date,user.get(i).bmi};
            dtm.addRow(objs);
        }
        //reset
        clearField();
    }//GEN-LAST:event_jButtonAddActionPerformed
/* Function for clear text field  */
    private void clearField(){
        jTextName.requestFocus();
        jTextName.setText("");
        jTextHealth.setText("");
        jCBbloodtype.setSelectedIndex(0);
        jTextHeight.setText("");
        jTextWeight.setText("");
        jTextTemperature.setText("");
        ((JTextField)jDateChooser.getDateEditor().getUiComponent()).setText("");
        status.setText("BMI status: ");
        
    }
    
    /* Selects row */
    private void jTable2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable2MouseClicked

        row = jTable2.getSelectedRow();
        col = jTable2.getColumnCount();
        System.out.println(row+","+col);
        jTextName.setText(dtm.getValueAt(row, 0).toString());
        jTextHealth.setText(dtm.getValueAt(row, 1).toString());
        String bloodtype = dtm.getValueAt(row, 2).toString();
        for (int i = 0; i<(jCBbloodtype.getItemCount());i++){
            if (jCBbloodtype.getItemAt(i).equalsIgnoreCase(bloodtype)){
                jCBbloodtype.setSelectedIndex(i);
            }
        }
        jTextHeight.setText(dtm.getValueAt(row, 3).toString());
        jTextWeight.setText(dtm.getValueAt(row, 4).toString());
        jTextTemperature.setText(dtm.getValueAt(row, 5).toString());
        try{
            DefaultTableModel model = (DefaultTableModel)jTable2.getModel();
            int srow = jTable2.getSelectedRow();
            Date date = new SimpleDateFormat ("yyyy-MM-dd").parse((String)model.getValueAt(srow, 6));
            jDateChooser.setDate(date);
        } catch (ParseException ex){
            Logger.getLogger(MainInterface.class.getName()).log(Level.SEVERE, null,ex);
        }
        Double h = Double.parseDouble(jTextHeight.getText());
        Double w = Double.parseDouble(jTextWeight.getText());
        Double bmi = w/(h*h);
        
        status.setText(bmistatus.getBMIStatus(bmi));
        
        

    }//GEN-LAST:event_jTable2MouseClicked
/* Delete a row of data */
    private void jButtonDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDeleteActionPerformed
                
        int dialogButton = JOptionPane.YES_NO_OPTION;
        int dialogResult = JOptionPane.showConfirmDialog(this, "Delete this data", "Delete", dialogButton);
        if(dialogResult == 0) {
            dtm.removeRow(row);
            user.remove(row);
            dtm.setRowCount(0);//reset table and populate 
            for (int i = 0; i < user.size(); i++) {
                Object[] objs = {user.get(i).name,user.get(i).bloodtype,user.get(i).health,user.get(i).height,user.get(i).weight,user.get(i).temperature,user.get(i).date,user.get(i).bmi};
                dtm.addRow(objs);
            }
            clearField();
        } else {
            
        } 

        
    }//GEN-LAST:event_jButtonDeleteActionPerformed

    /* Updates new data */
    private void jButtonUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonUpdateActionPerformed

        
        String updatedname = jTextName.getText();
        String updatedbloodtype = jCBbloodtype.getSelectedItem().toString();
        String updatedhealth = jTextHealth.getText();
        String updatedheight = jTextHeight.getText();
        String updatedweight = jTextWeight.getText();
        String updatedtemperature = jTextTemperature.getText();
        String updatedDate = ((JTextField)jDateChooser.getDateEditor().getUiComponent()).getText();
        
        Double h = Double.parseDouble(jTextHeight.getText());
        Double w = Double.parseDouble(jTextWeight.getText());
        Double bmi = w/(h*h);
        
        status.setText(bmistatus.getBMIStatus(bmi));
        

  
        user.get(row).name = updatedname;
        user.get(row).health = updatedhealth;
        user.get(row).bloodtype = updatedbloodtype;
        user.get(row).height = updatedheight;
        user.get(row).weight = updatedweight;
        user.get(row).temperature = updatedtemperature;
        user.get(row).date = updatedDate;
            user.get(row).bmi = bmi;
            dtm.setRowCount(0);//reset table and populate 
            for (int i = 0; i < user.size(); i++) {
                Object[] objs = {user.get(i).name,user.get(i).health,user.get(i).bloodtype,user.get(i).height,user.get(i).weight,user.get(i).temperature,user.get(i).date,user.get(i).bmi};
                dtm.addRow(objs);
            }       
    }//GEN-LAST:event_jButtonUpdateActionPerformed

    private void jButtonChartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonChartActionPerformed
        
        DefaultCategoryDataset data = new DefaultCategoryDataset();
        DefaultTableModel model = (DefaultTableModel) jTable2.getModel();
        int i = 0;

        for (i = 0; i < model.getRowCount(); i++) {

            String date = model.getValueAt(i, 6).toString();
            Double bmi = Double.valueOf(model.getValueAt(i , 7).toString());
            data.addValue(bmi, "", date);
        }
        JFreeChart Chart = ChartFactory.createLineChart("BMI Graph", "Date", "BMI", data, PlotOrientation.VERTICAL, false, false, false);

        BarRenderer renderer = null;
        CategoryPlot plot = null;
        ChartFrame frame = new ChartFrame("BMI Graph", Chart);
        frame.setSize(650, 650);
        frame.pack();
        frame.setVisible(true);
    }//GEN-LAST:event_jButtonChartActionPerformed
/* Selects blood type */
    private void jCBbloodtypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBbloodtypeActionPerformed

    }//GEN-LAST:event_jCBbloodtypeActionPerformed

/* Clear field */
    private void jButtonClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonClearActionPerformed
        
         clearField();
    }//GEN-LAST:event_jButtonClearActionPerformed

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
            java.util.logging.Logger.getLogger(MainInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainInterface().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Status;
    private javax.swing.JButton jButtonAdd;
    private javax.swing.JButton jButtonChart;
    private javax.swing.JButton jButtonClear;
    private javax.swing.JButton jButtonDelete;
    private javax.swing.JButton jButtonUpdate;
    private javax.swing.JComboBox<String> jCBbloodtype;
    private com.toedter.calendar.JDateChooser jDateChooser;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelStatus;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField jTextHealth;
    private javax.swing.JTextField jTextHeight;
    private javax.swing.JTextField jTextName;
    private javax.swing.JTextField jTextTemperature;
    private javax.swing.JTextField jTextWeight;
    private javax.swing.JLabel status;
    // End of variables declaration//GEN-END:variables
}
