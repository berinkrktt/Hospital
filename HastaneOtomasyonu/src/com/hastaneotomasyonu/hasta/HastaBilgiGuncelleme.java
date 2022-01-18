/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hastaneotomasyonu.hasta;

import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JOptionPane;

/**
 *
 * @author USER
 */
public class HastaBilgiGuncelleme extends javax.swing.JFrame {
    HastaIslemleri hastaIslemleri = new HastaIslemleri();
    /**
     * Creates new form HastaBilgiGuncelleme
     */
    public HastaBilgiGuncelleme() {
        initComponents();
         Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();

        int w = this.getSize().width;
        int h = this.getSize().height;
        int x = (dim.width - w) / 2;
        int y = (dim.height - h) / 2;

        this.setLocation(x, y);
        bilgiGoruntule();
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
        Tcyazisi = new javax.swing.JLabel();
        Adyazisi = new javax.swing.JLabel();
        Soyadyazisi = new javax.swing.JLabel();
        Telefonyazisi = new javax.swing.JLabel();
        TCalani = new javax.swing.JTextField();
        AdAlani = new javax.swing.JTextField();
        SoyadAlani = new javax.swing.JTextField();
        TelefonAlani = new javax.swing.JTextField();
        GuncelleTusu = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        AltPanel.setBackground(new java.awt.Color(0, 0, 153));

        UstPanel.setBackground(new java.awt.Color(0, 102, 204));

        Logo.setIcon(new javax.swing.ImageIcon("C:\\Users\\USER\\Documents\\NetBeansProjects\\HastaneOtomasyonu\\src\\com\\hastaneotomasyonu\\images\\icons8-hospital-3-64.png")); // NOI18N

        EkranAdi.setFont(new java.awt.Font("Segoe Script", 1, 24)); // NOI18N
        EkranAdi.setForeground(new java.awt.Color(153, 255, 255));
        EkranAdi.setText("Bilgi Güncelleme");

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
                .addComponent(Logo, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(EkranAdi, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 86, Short.MAX_VALUE)
                .addComponent(KapamaTusu))
        );
        UstPanelLayout.setVerticalGroup(
            UstPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Logo, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)
            .addGroup(UstPanelLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(EkranAdi, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(UstPanelLayout.createSequentialGroup()
                .addComponent(KapamaTusu)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        Tcyazisi.setFont(new java.awt.Font("Segoe Script", 1, 12)); // NOI18N
        Tcyazisi.setForeground(new java.awt.Color(153, 255, 255));
        Tcyazisi.setText("T.C:");

        Adyazisi.setFont(new java.awt.Font("Segoe Script", 1, 12)); // NOI18N
        Adyazisi.setForeground(new java.awt.Color(153, 255, 255));
        Adyazisi.setText("AD:");

        Soyadyazisi.setFont(new java.awt.Font("Segoe Script", 1, 12)); // NOI18N
        Soyadyazisi.setForeground(new java.awt.Color(153, 255, 255));
        Soyadyazisi.setText("SOYAD:");

        Telefonyazisi.setFont(new java.awt.Font("Segoe Script", 1, 12)); // NOI18N
        Telefonyazisi.setForeground(new java.awt.Color(153, 255, 255));
        Telefonyazisi.setText("TELEFON:");

        TCalani.setEditable(false);
        TCalani.setBackground(new java.awt.Color(0, 102, 204));
        TCalani.setFont(new java.awt.Font("Segoe Script", 1, 12)); // NOI18N
        TCalani.setForeground(new java.awt.Color(0, 0, 153));

        AdAlani.setBackground(new java.awt.Color(0, 102, 204));
        AdAlani.setFont(new java.awt.Font("Segoe Script", 1, 12)); // NOI18N
        AdAlani.setForeground(new java.awt.Color(0, 0, 153));

        SoyadAlani.setBackground(new java.awt.Color(0, 102, 204));
        SoyadAlani.setFont(new java.awt.Font("Segoe Script", 1, 12)); // NOI18N
        SoyadAlani.setForeground(new java.awt.Color(0, 0, 153));

        TelefonAlani.setBackground(new java.awt.Color(0, 102, 204));
        TelefonAlani.setFont(new java.awt.Font("Segoe Script", 1, 12)); // NOI18N
        TelefonAlani.setForeground(new java.awt.Color(0, 0, 153));

        GuncelleTusu.setBackground(new java.awt.Color(0, 102, 204));
        GuncelleTusu.setFont(new java.awt.Font("Segoe Script", 1, 12)); // NOI18N
        GuncelleTusu.setForeground(new java.awt.Color(0, 0, 153));
        GuncelleTusu.setText("Güncelle");
        GuncelleTusu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GuncelleTusuActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout AltPanelLayout = new javax.swing.GroupLayout(AltPanel);
        AltPanel.setLayout(AltPanelLayout);
        AltPanelLayout.setHorizontalGroup(
            AltPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(UstPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(AltPanelLayout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addGroup(AltPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Telefonyazisi)
                    .addComponent(Tcyazisi)
                    .addComponent(Adyazisi)
                    .addComponent(Soyadyazisi))
                .addGap(18, 18, 18)
                .addGroup(AltPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(TCalani, javax.swing.GroupLayout.DEFAULT_SIZE, 172, Short.MAX_VALUE)
                    .addComponent(AdAlani)
                    .addComponent(SoyadAlani)
                    .addComponent(TelefonAlani))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AltPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(GuncelleTusu, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(137, 137, 137))
        );
        AltPanelLayout.setVerticalGroup(
            AltPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AltPanelLayout.createSequentialGroup()
                .addComponent(UstPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(AltPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Tcyazisi)
                    .addComponent(TCalani, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(AltPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Adyazisi)
                    .addComponent(AdAlani, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(AltPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SoyadAlani, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Soyadyazisi))
                .addGap(27, 27, 27)
                .addGroup(AltPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Telefonyazisi)
                    .addComponent(TelefonAlani, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(GuncelleTusu)
                .addGap(0, 35, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(AltPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(AltPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public void bilgiGoruntule(){
     String tc = HastaIslemleri.girisYapanHasta.getTc();
     TCalani.setText(tc);
     
     String ad = HastaIslemleri.girisYapanHasta.getAd();
     AdAlani.setText(ad);
     
     String soyad = HastaIslemleri.girisYapanHasta.getSoyad();
     SoyadAlani.setText(soyad);
     
     String telefon = HastaIslemleri.girisYapanHasta.getTelefon();
     TelefonAlani.setText(telefon);
    
    }
    private void KapamaTusuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_KapamaTusuMouseClicked
        HastaEkrani hastaEkrani = new HastaEkrani();
        hastaEkrani.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_KapamaTusuMouseClicked

    private void GuncelleTusuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GuncelleTusuActionPerformed
        
        String tc = TCalani.getText();
        String ad = AdAlani.getText();
        String soyad = SoyadAlani.getText();
        String telefon = TelefonAlani.getText();
        
        if(AdAlani.equals("") || SoyadAlani.equals("") || TelefonAlani.equals("")){
            JOptionPane.showMessageDialog(this, "Lütfen Bilgilerinizi doğru giriniz!!!");
        }
        else{
         hastaIslemleri.guncelle(tc, ad, soyad, telefon);
         JOptionPane.showMessageDialog(this, "Bilgileriniz Güncellendi :)");
        }
    }//GEN-LAST:event_GuncelleTusuActionPerformed

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
            java.util.logging.Logger.getLogger(HastaBilgiGuncelleme.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HastaBilgiGuncelleme.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HastaBilgiGuncelleme.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HastaBilgiGuncelleme.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HastaBilgiGuncelleme().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField AdAlani;
    private javax.swing.JLabel Adyazisi;
    private javax.swing.JPanel AltPanel;
    private javax.swing.JLabel EkranAdi;
    private javax.swing.JButton GuncelleTusu;
    private javax.swing.JLabel KapamaTusu;
    private javax.swing.JLabel Logo;
    private javax.swing.JTextField SoyadAlani;
    private javax.swing.JLabel Soyadyazisi;
    private javax.swing.JTextField TCalani;
    private javax.swing.JLabel Tcyazisi;
    private javax.swing.JTextField TelefonAlani;
    private javax.swing.JLabel Telefonyazisi;
    private javax.swing.JPanel UstPanel;
    // End of variables declaration//GEN-END:variables
}
