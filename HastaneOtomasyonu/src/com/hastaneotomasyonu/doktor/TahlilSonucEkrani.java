/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hastaneotomasyonu.doktor;

import com.hastaneotomasyonu.hemsire.Sonuc;
import com.hastaneotomasyonu.veritabani.VeritabaniIslemleri;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.ArrayList;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author USER
 */
public class TahlilSonucEkrani extends javax.swing.JFrame {
     VeritabaniIslemleri veritabaniIslemleri = new VeritabaniIslemleri();
     DoktorIslemleri doktorIslemleri = new DoktorIslemleri();
    /**
     * Creates new form TahlilSonucEkrani
     */
    DefaultTableModel model;
    public TahlilSonucEkrani() {
        initComponents();
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();

        int w = this.getSize().width;
        int h = this.getSize().height;
        int x = (dim.width - w) / 2;
        int y = (dim.height - h) / 2;

        this.setLocation(x, y);
         model = (DefaultTableModel) SonucTablosu.getModel();
         sonucGoruntule();
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
        logo = new javax.swing.JLabel();
        EkranAdi = new javax.swing.JLabel();
        KapamaTusu = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        SonucTablosu = new javax.swing.JTable();
        SonucAraYazis = new javax.swing.JLabel();
        AramaCubugu = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        AltPanel.setBackground(new java.awt.Color(0, 0, 153));

        UstPanel.setBackground(new java.awt.Color(0, 102, 204));

        logo.setIcon(new javax.swing.ImageIcon("C:\\Users\\USER\\Documents\\NetBeansProjects\\HastaneOtomasyonu\\src\\com\\hastaneotomasyonu\\images\\icons8-hospital-3-64.png")); // NOI18N

        EkranAdi.setFont(new java.awt.Font("Segoe Script", 1, 24)); // NOI18N
        EkranAdi.setForeground(new java.awt.Color(153, 255, 255));
        EkranAdi.setText("SONUÇ EKRANI");

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
                .addComponent(logo, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(EkranAdi, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 521, Short.MAX_VALUE)
                .addComponent(KapamaTusu))
        );
        UstPanelLayout.setVerticalGroup(
            UstPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(logo, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)
            .addGroup(UstPanelLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(EkranAdi, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(UstPanelLayout.createSequentialGroup()
                .addComponent(KapamaTusu)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        SonucTablosu.setBackground(new java.awt.Color(0, 102, 204));
        SonucTablosu.setFont(new java.awt.Font("Segoe Script", 1, 12)); // NOI18N
        SonucTablosu.setForeground(new java.awt.Color(0, 0, 153));
        SonucTablosu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "T.C. KİMLİK NO", "AD SOYAD", "TAHLİLLER", "DURUM", "TARİH"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        SonucTablosu.setSelectionBackground(new java.awt.Color(0, 102, 204));
        SonucTablosu.setSelectionForeground(new java.awt.Color(0, 0, 153));
        jScrollPane1.setViewportView(SonucTablosu);

        SonucAraYazis.setFont(new java.awt.Font("Segoe Script", 1, 12)); // NOI18N
        SonucAraYazis.setForeground(new java.awt.Color(153, 255, 255));
        SonucAraYazis.setText("Sonuç Ara:");

        AramaCubugu.setBackground(new java.awt.Color(0, 102, 204));
        AramaCubugu.setFont(new java.awt.Font("Segoe Script", 1, 12)); // NOI18N
        AramaCubugu.setForeground(new java.awt.Color(0, 0, 153));
        AramaCubugu.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                AramaCubuguKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout AltPanelLayout = new javax.swing.GroupLayout(AltPanel);
        AltPanel.setLayout(AltPanelLayout);
        AltPanelLayout.setHorizontalGroup(
            AltPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(UstPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 957, Short.MAX_VALUE)
            .addGroup(AltPanelLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(SonucAraYazis, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(AramaCubugu, javax.swing.GroupLayout.PREFERRED_SIZE, 447, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        AltPanelLayout.setVerticalGroup(
            AltPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AltPanelLayout.createSequentialGroup()
                .addComponent(UstPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(AltPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(SonucAraYazis, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(AltPanelLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(AramaCubugu, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 411, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(AltPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(AltPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void KapamaTusuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_KapamaTusuMouseClicked
        DoktorEkrani doktorEkrani = new DoktorEkrani();
        doktorEkrani.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_KapamaTusuMouseClicked
      public void dinamikAra(String ara){
     TableRowSorter<DefaultTableModel> rowSorter = new TableRowSorter<DefaultTableModel>(model);
      SonucTablosu.setRowSorter(rowSorter);
      rowSorter.setRowFilter(RowFilter.regexFilter(ara));
    }
      public void sonucGoruntule(){
       model.setNumRows(0);
        ArrayList<Sonuc> sonuc = new ArrayList<>();
        sonuc = doktorIslemleri.sonucGoster();
        if (sonuc != null) {
            for (Sonuc sonc : sonuc) {
                int no = sonc.getId();
                String tc = sonc.getTc();
                String adSoyad = sonc.getAd() + " " + sonc.getSoyad();
                String tahlil = sonc.getTahlil();
                String durum = sonc.getDurum();
                String tarih = sonc.getTarih();
                
                Object[] ekleme = {tc, adSoyad, tahlil, durum, tarih};
                
                model.addRow(ekleme);
                
            }
        }
      }
      
    private void AramaCubuguKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_AramaCubuguKeyReleased
        String ara = AramaCubugu.getText();
        dinamikAra(ara);
    }//GEN-LAST:event_AramaCubuguKeyReleased

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
            java.util.logging.Logger.getLogger(TahlilSonucEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TahlilSonucEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TahlilSonucEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TahlilSonucEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TahlilSonucEkrani().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel AltPanel;
    private javax.swing.JTextField AramaCubugu;
    private javax.swing.JLabel EkranAdi;
    private javax.swing.JLabel KapamaTusu;
    private javax.swing.JLabel SonucAraYazis;
    private javax.swing.JTable SonucTablosu;
    private javax.swing.JPanel UstPanel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel logo;
    // End of variables declaration//GEN-END:variables
}
