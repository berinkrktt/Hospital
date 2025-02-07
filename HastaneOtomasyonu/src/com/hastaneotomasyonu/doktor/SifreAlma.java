/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hastaneotomasyonu.doktor;

import com.hastaneotomasyonu.veritabani.VeritabaniIslemleri;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import javax.swing.JOptionPane;

/**
 *
 * @author USER
 */
public class SifreAlma extends javax.swing.JFrame {
     VeritabaniIslemleri veritabaniIslemleri = new VeritabaniIslemleri();
     DoktorIslemleri doktorIslemleri = new DoktorIslemleri();
    /**
     * Creates new form SifreAlma
     */
    public SifreAlma() {
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
        KapamaTusu = new javax.swing.JLabel();
        EkranAdi = new javax.swing.JLabel();
        TCyazisi = new javax.swing.JLabel();
        SifreYazisi = new javax.swing.JLabel();
        TCAlani = new javax.swing.JTextField();
        SifreAlani = new javax.swing.JPasswordField();
        SifreAlTusu = new javax.swing.JButton();
        sifreTekrarYazisi = new javax.swing.JLabel();
        SifreTekrar = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        AltPanel.setBackground(new java.awt.Color(0, 0, 153));

        UstPanel.setBackground(new java.awt.Color(0, 102, 204));

        Logo.setIcon(new javax.swing.ImageIcon("C:\\Users\\USER\\Documents\\NetBeansProjects\\HastaneOtomasyonu\\src\\com\\hastaneotomasyonu\\images\\icons8-hospital-3-64.png")); // NOI18N

        KapamaTusu.setIcon(new javax.swing.ImageIcon("C:\\Users\\USER\\Documents\\NetBeansProjects\\HastaneOtomasyonu\\src\\com\\hastaneotomasyonu\\images\\icons8-close-32.png")); // NOI18N
        KapamaTusu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                KapamaTusuMouseClicked(evt);
            }
        });

        EkranAdi.setFont(new java.awt.Font("Segoe Script", 1, 24)); // NOI18N
        EkranAdi.setForeground(new java.awt.Color(153, 255, 255));
        EkranAdi.setText("Doktor Şifre Alma");

        javax.swing.GroupLayout UstPanelLayout = new javax.swing.GroupLayout(UstPanel);
        UstPanel.setLayout(UstPanelLayout);
        UstPanelLayout.setHorizontalGroup(
            UstPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(UstPanelLayout.createSequentialGroup()
                .addComponent(Logo, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(EkranAdi, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 101, Short.MAX_VALUE)
                .addComponent(KapamaTusu, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        UstPanelLayout.setVerticalGroup(
            UstPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Logo, javax.swing.GroupLayout.DEFAULT_SIZE, 79, Short.MAX_VALUE)
            .addGroup(UstPanelLayout.createSequentialGroup()
                .addComponent(KapamaTusu, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, UstPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(EkranAdi, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        TCyazisi.setFont(new java.awt.Font("Segoe Script", 1, 14)); // NOI18N
        TCyazisi.setForeground(new java.awt.Color(153, 255, 255));
        TCyazisi.setText("T.C. No:");

        SifreYazisi.setFont(new java.awt.Font("Segoe Script", 1, 14)); // NOI18N
        SifreYazisi.setForeground(new java.awt.Color(153, 255, 255));
        SifreYazisi.setText("Şifre:");

        TCAlani.setBackground(new java.awt.Color(0, 102, 204));
        TCAlani.setFont(new java.awt.Font("Segoe Script", 1, 12)); // NOI18N
        TCAlani.setForeground(new java.awt.Color(0, 0, 153));
        TCAlani.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TCAlaniKeyTyped(evt);
            }
        });

        SifreAlani.setBackground(new java.awt.Color(0, 102, 204));
        SifreAlani.setFont(new java.awt.Font("Segoe Script", 1, 12)); // NOI18N
        SifreAlani.setForeground(new java.awt.Color(0, 0, 153));
        SifreAlani.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                SifreAlaniKeyTyped(evt);
            }
        });

        SifreAlTusu.setBackground(new java.awt.Color(0, 102, 204));
        SifreAlTusu.setFont(new java.awt.Font("Segoe Script", 1, 12)); // NOI18N
        SifreAlTusu.setForeground(new java.awt.Color(0, 0, 153));
        SifreAlTusu.setText("Şifre Al");
        SifreAlTusu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SifreAlTusuActionPerformed(evt);
            }
        });

        sifreTekrarYazisi.setFont(new java.awt.Font("Segoe Script", 1, 12)); // NOI18N
        sifreTekrarYazisi.setForeground(new java.awt.Color(153, 255, 255));
        sifreTekrarYazisi.setText("Şifre Tekrarı:");

        SifreTekrar.setBackground(new java.awt.Color(0, 102, 204));
        SifreTekrar.setFont(new java.awt.Font("Segoe Script", 1, 12)); // NOI18N
        SifreTekrar.setForeground(new java.awt.Color(0, 0, 153));
        SifreTekrar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                SifreTekrarKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout AltPanelLayout = new javax.swing.GroupLayout(AltPanel);
        AltPanel.setLayout(AltPanelLayout);
        AltPanelLayout.setHorizontalGroup(
            AltPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AltPanelLayout.createSequentialGroup()
                .addComponent(UstPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AltPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(SifreAlTusu, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(153, 153, 153))
            .addGroup(AltPanelLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(AltPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(TCyazisi)
                    .addComponent(SifreYazisi)
                    .addComponent(sifreTekrarYazisi))
                .addGap(18, 18, 18)
                .addGroup(AltPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(SifreAlani)
                    .addComponent(TCAlani)
                    .addComponent(SifreTekrar, javax.swing.GroupLayout.DEFAULT_SIZE, 199, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        AltPanelLayout.setVerticalGroup(
            AltPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AltPanelLayout.createSequentialGroup()
                .addComponent(UstPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addGroup(AltPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TCAlani, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TCyazisi))
                .addGap(18, 18, 18)
                .addGroup(AltPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SifreAlani, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SifreYazisi))
                .addGap(18, 18, 18)
                .addGroup(AltPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SifreTekrar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sifreTekrarYazisi))
                .addGap(18, 18, 18)
                .addComponent(SifreAlTusu)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(AltPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(AltPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public static String hashPassword(String sifre) {
        try {
            MessageDigest hash = MessageDigest.getInstance("SHA-256");
            hash.update(sifre.getBytes());
            byte[] sonuc = hash.digest();
            return new BigInteger(sonuc).toString();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        return "";
    }
    private void KapamaTusuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_KapamaTusuMouseClicked
        DoktorGiris hastaneOtomasyonu = new DoktorGiris();
        hastaneOtomasyonu.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_KapamaTusuMouseClicked

    private void SifreAlTusuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SifreAlTusuActionPerformed

        String tc = TCAlani.getText();
        String sifre = hashPassword(new String(SifreAlani.getPassword()));
        String sifreDogrulama = hashPassword(new String(SifreTekrar.getPassword()));
        boolean kontrol = sifre.equals(sifreDogrulama);
        boolean sifreKontrol = new String(SifreAlani.getPassword()).equals("");
        boolean sifreDogrulamaKontrol = new String(SifreTekrar.getPassword()).equals("");

        if (!(sifreKontrol || sifreDogrulamaKontrol)) {
            if (kontrol) {
                doktorIslemleri.sifreDegistir(tc, sifre);
                JOptionPane.showMessageDialog(this, "ŞİFRE BAŞARIYLA ALINDI :)");
            } else {
                JOptionPane.showMessageDialog(this, "ŞİFRELER UYUŞMUYOR!!!");
            }
        } else {
            JOptionPane.showMessageDialog(this, "ŞİFRE ALANI BOŞ!!!");
        }

    }//GEN-LAST:event_SifreAlTusuActionPerformed

    private void TCAlaniKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TCAlaniKeyTyped
          char c = evt.getKeyChar();
        if (TCAlani.getText().length() >= 11 || (c == KeyEvent.VK_SPACE)) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_TCAlaniKeyTyped

    private void SifreAlaniKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_SifreAlaniKeyTyped
          char c = evt.getKeyChar();
        if ((c == KeyEvent.VK_SPACE)) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_SifreAlaniKeyTyped

    private void SifreTekrarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_SifreTekrarKeyTyped
          char c = evt.getKeyChar();
        if ((c == KeyEvent.VK_SPACE)) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_SifreTekrarKeyTyped

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
            java.util.logging.Logger.getLogger(SifreAlma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SifreAlma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SifreAlma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SifreAlma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SifreAlma().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel AltPanel;
    private javax.swing.JLabel EkranAdi;
    private javax.swing.JLabel KapamaTusu;
    private javax.swing.JLabel Logo;
    private javax.swing.JButton SifreAlTusu;
    private javax.swing.JPasswordField SifreAlani;
    private javax.swing.JPasswordField SifreTekrar;
    private javax.swing.JLabel SifreYazisi;
    private javax.swing.JTextField TCAlani;
    private javax.swing.JLabel TCyazisi;
    private javax.swing.JPanel UstPanel;
    private javax.swing.JLabel sifreTekrarYazisi;
    // End of variables declaration//GEN-END:variables
}
