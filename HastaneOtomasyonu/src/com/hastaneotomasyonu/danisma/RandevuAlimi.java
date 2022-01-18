/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hastaneotomasyonu.danisma;

import com.hastaneotomasyonu.veritabani.VeritabaniIslemleri;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;

/**
 *
 * @author USER
 */
public class RandevuAlimi extends javax.swing.JFrame {
     VeritabaniIslemleri veritabaniIslemleri = new VeritabaniIslemleri();
     DanismaIslemleri danismaIslemleri = new DanismaIslemleri();
     public static int randevuNo;
    /**
     * Creates new form RandevuAlimi
     */
    public RandevuAlimi() {
        initComponents();
         Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();

        int w = this.getSize().width;
        int h = this.getSize().height;
        int x = (dim.width - w) / 2;
        int y = (dim.height - h) / 2;

        this.setLocation(x, y);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        AltPanel = new javax.swing.JPanel();
        UstPanel = new javax.swing.JPanel();
        Logo = new javax.swing.JLabel();
        EkranAdi = new javax.swing.JLabel();
        KapamaTusu = new javax.swing.JLabel();
        TCyazisi = new javax.swing.JLabel();
        AdYazisi = new javax.swing.JLabel();
        SoyadYazisi = new javax.swing.JLabel();
        BransYazisi = new javax.swing.JLabel();
        BransAlani = new javax.swing.JComboBox<>();
        TcAlani = new javax.swing.JTextField();
        AdAlani = new javax.swing.JTextField();
        SoyadAlani = new javax.swing.JTextField();
        DurumYazisi = new javax.swing.JLabel();
        TarihYazisi = new javax.swing.JLabel();
        TarihAlani = new javax.swing.JTextField();
        RandevuAlButonu = new javax.swing.JButton();
        SaatYazisi = new javax.swing.JLabel();
        SaatAlani = new javax.swing.JTextField();
        DurumAlani = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        AltPanel.setBackground(new java.awt.Color(0, 0, 153));

        UstPanel.setBackground(new java.awt.Color(0, 102, 204));

        Logo.setIcon(new javax.swing.ImageIcon("C:\\Users\\USER\\Documents\\NetBeansProjects\\HastaneOtomasyonu\\src\\com\\hastaneotomasyonu\\images\\icons8-hospital-3-64.png")); // NOI18N

        EkranAdi.setFont(new java.awt.Font("Segoe Script", 1, 24)); // NOI18N
        EkranAdi.setForeground(new java.awt.Color(153, 255, 255));
        EkranAdi.setText("Randevu Alımı");

        KapamaTusu.setIcon(new javax.swing.ImageIcon("C:\\Users\\USER\\Documents\\NetBeansProjects\\HastaneOtomasyonu\\src\\com\\hastaneotomasyonu\\images\\icons8-close-32.png")); // NOI18N
        KapamaTusu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                KapamaTusuMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout UstPanelLayout = new javax.swing.GroupLayout(UstPanel);
        UstPanel.setLayout(UstPanelLayout);
        UstPanelLayout.setHorizontalGroup(
            UstPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(UstPanelLayout.createSequentialGroup()
                .addComponent(Logo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(EkranAdi, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                .addComponent(KapamaTusu))
        );
        UstPanelLayout.setVerticalGroup(
            UstPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Logo, javax.swing.GroupLayout.DEFAULT_SIZE, 73, Short.MAX_VALUE)
            .addGroup(UstPanelLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(EkranAdi, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(UstPanelLayout.createSequentialGroup()
                .addComponent(KapamaTusu)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        TCyazisi.setFont(new java.awt.Font("Segoe Script", 1, 12)); // NOI18N
        TCyazisi.setForeground(new java.awt.Color(153, 255, 255));
        TCyazisi.setText("T.C:");

        AdYazisi.setFont(new java.awt.Font("Segoe Script", 1, 12)); // NOI18N
        AdYazisi.setForeground(new java.awt.Color(153, 255, 255));
        AdYazisi.setText("AD:");

        SoyadYazisi.setFont(new java.awt.Font("Segoe Script", 1, 12)); // NOI18N
        SoyadYazisi.setForeground(new java.awt.Color(153, 255, 255));
        SoyadYazisi.setText("SOYAD:");

        BransYazisi.setFont(new java.awt.Font("Segoe Script", 1, 12)); // NOI18N
        BransYazisi.setForeground(new java.awt.Color(153, 255, 255));
        BransYazisi.setText("BRANŞ:");

        BransAlani.setBackground(new java.awt.Color(0, 102, 204));
        BransAlani.setFont(new java.awt.Font("Segoe Script", 1, 12)); // NOI18N
        BransAlani.setForeground(new java.awt.Color(0, 0, 153));
        BransAlani.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seçiniz", "Meme Cerrahisi", "Dermatoloji", "Psikiyatri", "Göz Hastalıkları", "Estetik, Plastik ve Rekonstrüktif Cerrahisi", "Kalp ve Damar Cerrahisi", "Endokrinoloji ve Metabolizma Hastalıkları", "Radyoloji", "Romatoloji", "Fizik Tedavi ve Rehabilitasyon", "Kadın Hastalıkları ve Doğum", "Kardiyoloji", "Nefroloji", "Genel Cerrah", "Dahiliye (İç Hastalıkları)", "Üroloji", "Gastroenteroloji", "Göğüs Hastalıkları", "Nöroloji", "Hematoloji", "Çocuk Sağlığı ve Hastalıkları", " ", " " }));

        TcAlani.setBackground(new java.awt.Color(0, 102, 204));
        TcAlani.setFont(new java.awt.Font("Segoe Script", 1, 12)); // NOI18N
        TcAlani.setForeground(new java.awt.Color(0, 0, 153));
        TcAlani.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TcAlaniKeyTyped(evt);
            }
        });

        AdAlani.setBackground(new java.awt.Color(0, 102, 204));
        AdAlani.setFont(new java.awt.Font("Segoe Script", 1, 12)); // NOI18N
        AdAlani.setForeground(new java.awt.Color(0, 0, 153));

        SoyadAlani.setBackground(new java.awt.Color(0, 102, 204));
        SoyadAlani.setFont(new java.awt.Font("Segoe Script", 1, 12)); // NOI18N
        SoyadAlani.setForeground(new java.awt.Color(0, 0, 153));

        DurumYazisi.setFont(new java.awt.Font("Segoe Script", 1, 12)); // NOI18N
        DurumYazisi.setForeground(new java.awt.Color(153, 255, 255));
        DurumYazisi.setText("DURUM:");

        TarihYazisi.setFont(new java.awt.Font("Segoe Script", 1, 12)); // NOI18N
        TarihYazisi.setForeground(new java.awt.Color(153, 255, 255));
        TarihYazisi.setText("TARİH:");

        TarihAlani.setBackground(new java.awt.Color(0, 102, 204));
        TarihAlani.setFont(new java.awt.Font("Segoe Script", 1, 12)); // NOI18N
        TarihAlani.setForeground(new java.awt.Color(0, 0, 153));

        RandevuAlButonu.setBackground(new java.awt.Color(0, 102, 204));
        RandevuAlButonu.setFont(new java.awt.Font("Segoe Script", 1, 12)); // NOI18N
        RandevuAlButonu.setForeground(new java.awt.Color(0, 0, 153));
        RandevuAlButonu.setText("Randevu Al");
        RandevuAlButonu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RandevuAlButonuActionPerformed(evt);
            }
        });

        SaatYazisi.setFont(new java.awt.Font("Segoe Script", 1, 12)); // NOI18N
        SaatYazisi.setForeground(new java.awt.Color(153, 255, 255));
        SaatYazisi.setText("SAAT:");

        SaatAlani.setBackground(new java.awt.Color(0, 102, 204));
        SaatAlani.setFont(new java.awt.Font("Segoe Script", 1, 12)); // NOI18N
        SaatAlani.setForeground(new java.awt.Color(0, 0, 153));

        DurumAlani.setBackground(new java.awt.Color(0, 102, 204));
        DurumAlani.setFont(new java.awt.Font("Segoe Script", 1, 12)); // NOI18N
        DurumAlani.setForeground(new java.awt.Color(0, 0, 153));

        javax.swing.GroupLayout AltPanelLayout = new javax.swing.GroupLayout(AltPanel);
        AltPanel.setLayout(AltPanelLayout);
        AltPanelLayout.setHorizontalGroup(
            AltPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(UstPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(AltPanelLayout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(AltPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(AdYazisi)
                    .addComponent(TCyazisi)
                    .addComponent(SoyadYazisi, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DurumYazisi)
                    .addComponent(BransYazisi, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TarihYazisi, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SaatYazisi))
                .addGap(28, 28, 28)
                .addGroup(AltPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(AltPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(TcAlani)
                        .addComponent(AdAlani)
                        .addComponent(TarihAlani)
                        .addComponent(SaatAlani)
                        .addComponent(BransAlani, 0, 159, Short.MAX_VALUE)
                        .addComponent(SoyadAlani))
                    .addComponent(DurumAlani, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AltPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(RandevuAlButonu, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(86, 86, 86))
        );
        AltPanelLayout.setVerticalGroup(
            AltPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AltPanelLayout.createSequentialGroup()
                .addComponent(UstPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(AltPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TCyazisi, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TcAlani, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(AltPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AdAlani, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AdYazisi, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(AltPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SoyadAlani, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SoyadYazisi, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(AltPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BransAlani, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BransYazisi))
                .addGap(35, 35, 35)
                .addGroup(AltPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DurumYazisi, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DurumAlani, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(AltPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TarihAlani, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TarihYazisi))
                .addGap(31, 31, 31)
                .addGroup(AltPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(SaatAlani, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SaatYazisi, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(RandevuAlButonu)
                .addContainerGap(40, Short.MAX_VALUE))
        );

        getContentPane().add(AltPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 370, 590));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void KapamaTusuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_KapamaTusuMouseClicked
        DanismaEkrani danismaEkrani = new DanismaEkrani();
        danismaEkrani.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_KapamaTusuMouseClicked

    private void RandevuAlButonuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RandevuAlButonuActionPerformed
     
      String tc = TcAlani.getText();
      String ad = AdAlani.getText();
      String soyad = SoyadAlani.getText();
      int klinikNo = danismaIslemleri.klinikNoSec(BransAlani.getSelectedIndex());
      String brans = danismaIslemleri.klinikAdiBul(klinikNo);
      String durum = DurumAlani.getText();
      String tarih = TarihAlani.getText();
      String saat = SaatAlani.getText();
       if (TcAlani.equals("") || AdAlani.equals("") || SoyadAlani.equals("") || BransAlani.equals("") || DurumAlani.equals("")
                  || TarihAlani.equals("") || SaatAlani.equals("")) {
            JOptionPane.showMessageDialog(this, "Bilgilerinizi eksiksiz giriniz!!!");
        } else {
           int no = danismaIslemleri.randevuNo();

            danismaIslemleri.randevuAlma(no, tc, ad, soyad, brans, durum, tarih, saat);

            randevuNo = no;

            JOptionPane.showMessageDialog(this, "Kayıt Başarıyla gerçekleşti :)");
        }
    }//GEN-LAST:event_RandevuAlButonuActionPerformed

    private void TcAlaniKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TcAlaniKeyTyped
         char c = evt.getKeyChar();
        if (TcAlani.getText().length() >= 11 || (c == KeyEvent.VK_SPACE)) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_TcAlaniKeyTyped

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
            java.util.logging.Logger.getLogger(RandevuAlimi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RandevuAlimi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RandevuAlimi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RandevuAlimi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RandevuAlimi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField AdAlani;
    private javax.swing.JLabel AdYazisi;
    private javax.swing.JPanel AltPanel;
    private javax.swing.JComboBox<String> BransAlani;
    private javax.swing.JLabel BransYazisi;
    private javax.swing.JTextField DurumAlani;
    private javax.swing.JLabel DurumYazisi;
    private javax.swing.JLabel EkranAdi;
    private javax.swing.JLabel KapamaTusu;
    private javax.swing.JLabel Logo;
    private javax.swing.JButton RandevuAlButonu;
    private javax.swing.JTextField SaatAlani;
    private javax.swing.JLabel SaatYazisi;
    private javax.swing.JTextField SoyadAlani;
    private javax.swing.JLabel SoyadYazisi;
    private javax.swing.JLabel TCyazisi;
    private javax.swing.JTextField TarihAlani;
    private javax.swing.JLabel TarihYazisi;
    private javax.swing.JTextField TcAlani;
    private javax.swing.JPanel UstPanel;
    // End of variables declaration//GEN-END:variables
}
