/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package lenz.guikalkulator;

/**
 *
 * @author excee
 */
public class KalkulatorBD extends javax.swing.JFrame {
    
Double D1, D2, sisi, sisiket, A, B, C, T, luaspersegi, luasbelahket, luasseg, kelpersegi, kelbelahket, kelseg;

    /**
     * Creates new form KalkulatorBD
     */
    public KalkulatorBD() {
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

        TXTSSS = new javax.swing.JLabel();
        TXTA = new javax.swing.JLabel();
        TFA = new javax.swing.JTextField();
        TXTB = new javax.swing.JLabel();
        TFB = new javax.swing.JTextField();
        TXTC = new javax.swing.JLabel();
        TFC = new javax.swing.JTextField();
        TXTHasilSeg = new javax.swing.JLabel();
        TXTluasSSS = new javax.swing.JLabel();
        TFLuasSeg = new javax.swing.JTextField();
        TFD2 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txthasilpersegi = new javax.swing.JLabel();
        TFKelSeg = new javax.swing.JTextField();
        txthasilpp = new javax.swing.JLabel();
        btnhitungpp = new javax.swing.JButton();
        txthasilluaspp = new javax.swing.JLabel();
        TFhasilLbelahket = new javax.swing.JTextField();
        TXThasilkelilingpp = new javax.swing.JLabel();
        TFhasilkelbelahket = new javax.swing.JTextField();
        TXTluaspersegi = new javax.swing.JLabel();
        TFhasilluaspersegi = new javax.swing.JTextField();
        txtkalkulator = new javax.swing.JLabel();
        txtpersegi = new javax.swing.JLabel();
        areasisipersegi = new javax.swing.JLabel();
        fieldsisipersegi = new javax.swing.JTextField();
        txtBelahKetupat = new javax.swing.JLabel();
        TXTD1 = new javax.swing.JLabel();
        TFD1 = new javax.swing.JTextField();
        TXTD2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        TFhasilkelpersegi = new javax.swing.JTextField();
        TXTT = new javax.swing.JLabel();
        TFT = new javax.swing.JTextField();
        TXTSisket = new javax.swing.JLabel();
        TFsisket = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        TXTSSS.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        TXTSSS.setText("Segitiga Sama Sisi");

        TXTA.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        TXTA.setText("Masukkan A");

        TFA.setBackground(new java.awt.Color(255, 255, 255));
        TFA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TFAActionPerformed(evt);
            }
        });

        TXTB.setText("Masukkan B(alas)");

        TFB.setBackground(new java.awt.Color(255, 255, 255));
        TFB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TFBActionPerformed(evt);
            }
        });

        TXTC.setText("Masukkan C");

        TFC.setBackground(new java.awt.Color(255, 255, 255));

        TXTHasilSeg.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        TXTHasilSeg.setText("Hasil");

        TXTluasSSS.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        TXTluasSSS.setText("Luas");

        TFLuasSeg.setBackground(new java.awt.Color(255, 255, 255));

        TFD2.setBackground(new java.awt.Color(255, 255, 255));
        TFD2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TFD2ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Keliling");

        txthasilpersegi.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txthasilpersegi.setText("Hasil");

        TFKelSeg.setBackground(new java.awt.Color(255, 255, 255));

        txthasilpp.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txthasilpp.setText("Hasil");

        btnhitungpp.setBackground(new java.awt.Color(153, 255, 153));
        btnhitungpp.setText("Hitung");
        btnhitungpp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnhitungppActionPerformed(evt);
            }
        });

        txthasilluaspp.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txthasilluaspp.setText("Luas");

        TFhasilLbelahket.setBackground(new java.awt.Color(255, 255, 255));
        TFhasilLbelahket.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TFhasilLbelahketActionPerformed(evt);
            }
        });

        TXThasilkelilingpp.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        TXThasilkelilingpp.setText("Keliling");

        TFhasilkelbelahket.setBackground(new java.awt.Color(255, 255, 255));

        TXTluaspersegi.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        TXTluaspersegi.setText("Luas");

        TFhasilluaspersegi.setBackground(new java.awt.Color(255, 255, 255));

        txtkalkulator.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        txtkalkulator.setText("KalkulatorKU");

        txtpersegi.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtpersegi.setText("Persegi");

        areasisipersegi.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        areasisipersegi.setText("Masukkan Sisi");

        fieldsisipersegi.setBackground(new java.awt.Color(255, 255, 255));
        fieldsisipersegi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldsisipersegiActionPerformed(evt);
            }
        });

        txtBelahKetupat.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtBelahKetupat.setText("BelahKetupat");

        TXTD1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        TXTD1.setText("D1");

        TFD1.setBackground(new java.awt.Color(255, 255, 255));
        TFD1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TFD1ActionPerformed(evt);
            }
        });

        TXTD2.setText("D2");

        jLabel1.setText("Keliling");

        TFhasilkelpersegi.setBackground(new java.awt.Color(255, 255, 255));
        TFhasilkelpersegi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TFhasilkelpersegiActionPerformed(evt);
            }
        });

        TXTT.setText("Masukkan T");

        TFT.setBackground(new java.awt.Color(255, 255, 255));
        TFT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TFTActionPerformed(evt);
            }
        });

        TXTSisket.setText("Sisi Ket");

        TFsisket.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txthasilluaspp, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(TXThasilkelilingpp, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(TXTD2)
                                        .addGap(50, 50, 50))
                                    .addComponent(txtBelahKetupat, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(TFD1)
                                        .addComponent(TFD2)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(49, 49, 49)
                                            .addComponent(TXTD1))
                                        .addComponent(TFsisket, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TXTSisket)
                                    .addGap(39, 39, 39)))
                            .addComponent(TFhasilkelbelahket, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TFhasilLbelahket, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(114, 114, 114)
                        .addComponent(txthasilpp)))
                .addGap(67, 67, 67)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(TFB)
                                .addComponent(TFC)
                                .addComponent(TFA, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(TFT, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(TXTC)
                                .addGap(58, 58, 58))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(TXTA)
                                .addGap(59, 59, 59))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(TXTB)
                                .addGap(46, 46, 46)))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(txtkalkulator)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(TXTT))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(24, 24, 24)
                                        .addComponent(TXTSSS))))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TXTluasSSS)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TFKelSeg, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TFLuasSeg, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(TXTHasilSeg)
                        .addGap(77, 77, 77)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(65, 65, 65)
                            .addComponent(txthasilpersegi))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TFhasilkelpersegi, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(TXTluaspersegi)
                                .addGap(18, 18, 18)
                                .addComponent(TFhasilluaspersegi, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(areasisipersegi, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(fieldsisipersegi, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(88, 88, 88))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(txtpersegi)
                        .addGap(102, 102, 102))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnhitungpp, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(297, 297, 297))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(txtBelahKetupat)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(TXTD1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TFD1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(TXTD2)
                        .addGap(12, 12, 12)
                        .addComponent(TFD2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(TXTSisket)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(TFsisket, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(89, 89, 89))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(txtkalkulator)
                                .addGap(50, 50, 50)
                                .addComponent(TXTSSS)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(TXTA)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TFA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TXTB)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(TFB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(2, 2, 2)
                                .addComponent(TXTC)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(TFC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(TXTT)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TFT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addComponent(txtpersegi)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(areasisipersegi)
                                .addGap(18, 18, 18)
                                .addComponent(fieldsisipersegi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(TXTHasilSeg)
                                .addGap(38, 38, 38))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txthasilpp)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(TFhasilLbelahket, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txthasilluaspp))
                                .addGap(18, 18, 18)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TXTluasSSS)
                            .addComponent(TFLuasSeg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TFhasilkelbelahket, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TXThasilkelilingpp)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txthasilpersegi)
                        .addGap(7, 7, 7)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TFhasilluaspersegi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TXTluaspersegi, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TFhasilkelpersegi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(TFKelSeg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49)
                .addComponent(btnhitungpp)
                .addGap(130, 130, 130))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TFAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TFAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TFAActionPerformed

    private void TFBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TFBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TFBActionPerformed

    private void TFD2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TFD2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TFD2ActionPerformed

    private void btnhitungppActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnhitungppActionPerformed
        // Parsing input untuk belah ketupat
        D1 = Double.parseDouble(TFD1.getText());
        D2 = Double.parseDouble(TFD2.getText());
        sisiket = Double.parseDouble(TFsisket.getText()); // Setel sisiket sebelum perhitungan

        // Hitung luas dan keliling belah ketupat
        luasbelahket = D1 * D2 / 2;
        kelbelahket = 4 * sisiket;

        // Set hasil di text field
        TFhasilLbelahket.setText(String.valueOf(luasbelahket));
        TFhasilkelbelahket.setText(String.valueOf(kelbelahket));

        // Parsing input dan hitung untuk persegi
        sisi = Double.parseDouble(fieldsisipersegi.getText());
        luaspersegi = sisi * sisi;
        kelpersegi = 4 * sisi;

        // Set hasil persegi di text field
        TFhasilluaspersegi.setText(String.valueOf(luaspersegi));
        TFhasilkelpersegi.setText(String.valueOf(kelpersegi));

        // Parsing input dan hitung untuk segitiga
        A = Double.parseDouble(TFA.getText());
        B = Double.parseDouble(TFB.getText());
        C = Double.parseDouble(TFC.getText());
        T = Double.parseDouble(TFT.getText());

        luasseg = (B * T) / 2;
        kelseg = A + B + C;

        // Set hasil segitiga di text field
        TFLuasSeg.setText(String.valueOf(luasseg));
        TFKelSeg.setText(String.valueOf(kelseg));
        
 
 

    }//GEN-LAST:event_btnhitungppActionPerformed

    private void TFhasilLbelahketActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TFhasilLbelahketActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TFhasilLbelahketActionPerformed

    private void fieldsisipersegiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldsisipersegiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldsisipersegiActionPerformed

    private void TFD1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TFD1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TFD1ActionPerformed

    private void TFhasilkelpersegiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TFhasilkelpersegiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TFhasilkelpersegiActionPerformed

    private void TFTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TFTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TFTActionPerformed

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
            java.util.logging.Logger.getLogger(KalkulatorBD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(KalkulatorBD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(KalkulatorBD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(KalkulatorBD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new KalkulatorBD().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField TFA;
    private javax.swing.JTextField TFB;
    private javax.swing.JTextField TFC;
    private javax.swing.JTextField TFD1;
    private javax.swing.JTextField TFD2;
    private javax.swing.JTextField TFKelSeg;
    private javax.swing.JTextField TFLuasSeg;
    private javax.swing.JTextField TFT;
    private javax.swing.JTextField TFhasilLbelahket;
    private javax.swing.JTextField TFhasilkelbelahket;
    private javax.swing.JTextField TFhasilkelpersegi;
    private javax.swing.JTextField TFhasilluaspersegi;
    private javax.swing.JTextField TFsisket;
    private javax.swing.JLabel TXTA;
    private javax.swing.JLabel TXTB;
    private javax.swing.JLabel TXTC;
    private javax.swing.JLabel TXTD1;
    private javax.swing.JLabel TXTD2;
    private javax.swing.JLabel TXTHasilSeg;
    private javax.swing.JLabel TXTSSS;
    private javax.swing.JLabel TXTSisket;
    private javax.swing.JLabel TXTT;
    private javax.swing.JLabel TXThasilkelilingpp;
    private javax.swing.JLabel TXTluasSSS;
    private javax.swing.JLabel TXTluaspersegi;
    private javax.swing.JLabel areasisipersegi;
    private javax.swing.JButton btnhitungpp;
    private javax.swing.JTextField fieldsisipersegi;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel txtBelahKetupat;
    private javax.swing.JLabel txthasilluaspp;
    private javax.swing.JLabel txthasilpersegi;
    private javax.swing.JLabel txthasilpp;
    private javax.swing.JLabel txtkalkulator;
    private javax.swing.JLabel txtpersegi;
    // End of variables declaration//GEN-END:variables
}
