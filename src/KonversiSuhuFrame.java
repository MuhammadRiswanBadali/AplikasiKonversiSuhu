
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author USER
 */
public class KonversiSuhuFrame extends javax.swing.JFrame {

    /**
     * Creates new form KonversiSuhuFrame
     */
    public KonversiSuhuFrame() {
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        rbCelcius = new javax.swing.JRadioButton();
        rbFahrenheit = new javax.swing.JRadioButton();
        rbReamur = new javax.swing.JRadioButton();
        rbKelvin = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Aplikasi Konversi Suhu", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 18))); // NOI18N

        jLabel1.setText("Input Nilai Suhu");

        buttonGroup1.add(rbCelcius);
        rbCelcius.setText("Celcius");

        buttonGroup1.add(rbFahrenheit);
        rbFahrenheit.setText("Farenheit");

        buttonGroup1.add(rbReamur);
        rbReamur.setText("Reamur");

        buttonGroup1.add(rbKelvin);
        rbKelvin.setText("Kelvin");

        jLabel2.setText("Pilih Konversi Suhu");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Celcius", "Fahrenheit", "Reamur", "Kelvin" }));

        jButton1.setText("KONVERSI");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel3.setText("Hasil Konversi");

        jTextField2.setEditable(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextField1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rbCelcius)
                            .addComponent(rbFahrenheit))
                        .addGap(21, 21, 21)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rbKelvin)
                            .addComponent(rbReamur)))
                    .addComponent(jComboBox1, javax.swing.GroupLayout.Alignment.TRAILING, 0, 201, Short.MAX_VALUE)
                    .addComponent(jTextField2))
                .addContainerGap(43, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbCelcius)
                    .addComponent(rbReamur))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbFahrenheit)
                    .addComponent(rbKelvin))
                .addGap(9, 9, 9)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addComponent(jButton1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(57, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            // Membaca input suhu awal
            double suhuAwal = Double.parseDouble(jTextField1.getText());
            double hasil = 0.0;
            String suhuTujuan = (String) jComboBox1.getSelectedItem();

            // Memeriksa apakah suhu tujuan valid
            if (suhuTujuan == null || suhuTujuan.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Pilih suhu tujuan!", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            // Konversi berdasarkan suhu awal yang dipilih
            if (rbCelcius.isSelected()) { // Celcius ke ...
                switch (suhuTujuan) {
                    case "Fahrenheit":
                        hasil = (suhuAwal * 9.0 / 5.0) + 32.0;
                        break;
                    case "Kelvin":
                        hasil = suhuAwal + 273.15;
                        break;
                    case "Reamur":
                        hasil = suhuAwal * 4.0 / 5.0;
                        break;
                    case "Celcius":
                        hasil = suhuAwal;
                        break;
                }
            } else if (rbFahrenheit.isSelected()) { // Fahrenheit ke ...
                switch (suhuTujuan) {
                    case "Celcius":
                        hasil = (suhuAwal - 32.0) * 5.0 / 9.0;
                        break;
                    case "Kelvin":
                        hasil = ((suhuAwal - 32.0) * 5.0 / 9.0) + 273.15;
                        break;
                    case "Reamur":
                        hasil = (suhuAwal - 32.0) * 4.0 / 9.0;
                        break;
                    case "Fahrenheit":
                        hasil = suhuAwal;
                        break;
                }
            } else if (rbReamur.isSelected()) { // Reamur ke ...
                switch (suhuTujuan) {
                    case "Celcius":
                        hasil = suhuAwal * 5.0 / 4.0;
                        break;
                    case "Fahrenheit":
                        hasil = (suhuAwal * 9.0 / 4.0) + 32.0;
                        break;
                    case "Kelvin":
                        hasil = (suhuAwal * 5.0 / 4.0) + 273.15;
                        break;
                    case "Reamur":
                        hasil = suhuAwal;
                        break;
                }
            } else if (rbKelvin.isSelected()) { // Kelvin ke ...
                switch (suhuTujuan) {
                    case "Celcius":
                        hasil = suhuAwal - 273.15;
                        break;
                    case "Fahrenheit":
                        hasil = ((suhuAwal - 273.15) * 9.0 / 5.0) + 32.0;
                        break;
                    case "Reamur":
                        hasil = (suhuAwal - 273.15) * 4.0 / 5.0;
                        break;
                    case "Kelvin":
                        hasil = suhuAwal;
                        break;
                }
            } else {
                // Jika tidak ada radio button yang dipilih
                JOptionPane.showMessageDialog(this, "Pilih suhu awal!", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            // Menampilkan hasil konversi
            jTextField2.setText(hasil + " " + suhuTujuan);

        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Masukkan angka yang valid!", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(KonversiSuhuFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(KonversiSuhuFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(KonversiSuhuFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(KonversiSuhuFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new KonversiSuhuFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JRadioButton rbCelcius;
    private javax.swing.JRadioButton rbFahrenheit;
    private javax.swing.JRadioButton rbKelvin;
    private javax.swing.JRadioButton rbReamur;
    // End of variables declaration//GEN-END:variables
}
